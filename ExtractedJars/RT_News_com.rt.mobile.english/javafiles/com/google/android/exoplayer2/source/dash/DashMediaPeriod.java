// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.source.*;
import com.google.android.exoplayer2.source.chunk.ChunkSampleStream;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.Descriptor;
import com.google.android.exoplayer2.source.dash.manifest.EventStream;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.source.dash:
//			PlayerEmsgHandler, EventSampleStream, DashChunkSource

final class DashMediaPeriod
	implements MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader.Callback, com.google.android.exoplayer2.source.chunk.ChunkSampleStream.ReleaseCallback
{
	private static final class TrackGroupInfo
	{

		public static TrackGroupInfo embeddedCea608Track(int ai[], int i)
		{
			return new TrackGroupInfo(3, 1, ai, i, -1, -1, -1);
		//    0    0:new             #2   <Class DashMediaPeriod$TrackGroupInfo>
		//    1    3:dup             
		//    2    4:iconst_3        
		//    3    5:iconst_1        
		//    4    6:aload_0         
		//    5    7:iload_1         
		//    6    8:iconst_m1       
		//    7    9:iconst_m1       
		//    8   10:iconst_m1       
		//    9   11:invokespecial   #49  <Method void DashMediaPeriod$TrackGroupInfo(int, int, int[], int, int, int, int)>
		//   10   14:areturn         
		}

		public static TrackGroupInfo embeddedEmsgTrack(int ai[], int i)
		{
			return new TrackGroupInfo(4, 1, ai, i, -1, -1, -1);
		//    0    0:new             #2   <Class DashMediaPeriod$TrackGroupInfo>
		//    1    3:dup             
		//    2    4:iconst_4        
		//    3    5:iconst_1        
		//    4    6:aload_0         
		//    5    7:iload_1         
		//    6    8:iconst_m1       
		//    7    9:iconst_m1       
		//    8   10:iconst_m1       
		//    9   11:invokespecial   #49  <Method void DashMediaPeriod$TrackGroupInfo(int, int, int[], int, int, int, int)>
		//   10   14:areturn         
		}

		public static TrackGroupInfo mpdEventTrack(int i)
		{
			return new TrackGroupInfo(4, 2, ((int []) (null)), -1, -1, -1, i);
		//    0    0:new             #2   <Class DashMediaPeriod$TrackGroupInfo>
		//    1    3:dup             
		//    2    4:iconst_4        
		//    3    5:iconst_2        
		//    4    6:aconst_null     
		//    5    7:iconst_m1       
		//    6    8:iconst_m1       
		//    7    9:iconst_m1       
		//    8   10:iload_0         
		//    9   11:invokespecial   #49  <Method void DashMediaPeriod$TrackGroupInfo(int, int, int[], int, int, int, int)>
		//   10   14:areturn         
		}

		public static TrackGroupInfo primaryTrack(int i, int ai[], int j, int k, int l)
		{
			return new TrackGroupInfo(i, 0, ai, j, k, l, -1);
		//    0    0:new             #2   <Class DashMediaPeriod$TrackGroupInfo>
		//    1    3:dup             
		//    2    4:iload_0         
		//    3    5:iconst_0        
		//    4    6:aload_1         
		//    5    7:iload_2         
		//    6    8:iload_3         
		//    7    9:iload           4
		//    8   11:iconst_m1       
		//    9   12:invokespecial   #49  <Method void DashMediaPeriod$TrackGroupInfo(int, int, int[], int, int, int, int)>
		//   10   15:areturn         
		}

		private static final int CATEGORY_EMBEDDED = 1;
		private static final int CATEGORY_MANIFEST_EVENTS = 2;
		private static final int CATEGORY_PRIMARY = 0;
		public final int adaptationSetIndices[];
		public final int embeddedCea608TrackGroupIndex;
		public final int embeddedEventMessageTrackGroupIndex;
		public final int eventStreamGroupIndex;
		public final int primaryTrackGroupIndex;
		public final int trackGroupCategory;
		public final int trackType;

		private TrackGroupInfo(int i, int j, int ai[], int k, int l, int i1, int j1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void Object()>
			trackType = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #32  <Field int trackType>
			adaptationSetIndices = ai;
		//    5    9:aload_0         
		//    6   10:aload_3         
		//    7   11:putfield        #34  <Field int[] adaptationSetIndices>
			trackGroupCategory = j;
		//    8   14:aload_0         
		//    9   15:iload_2         
		//   10   16:putfield        #36  <Field int trackGroupCategory>
			primaryTrackGroupIndex = k;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #38  <Field int primaryTrackGroupIndex>
			embeddedEventMessageTrackGroupIndex = l;
		//   14   25:aload_0         
		//   15   26:iload           5
		//   16   28:putfield        #40  <Field int embeddedEventMessageTrackGroupIndex>
			embeddedCea608TrackGroupIndex = i1;
		//   17   31:aload_0         
		//   18   32:iload           6
		//   19   34:putfield        #42  <Field int embeddedCea608TrackGroupIndex>
			eventStreamGroupIndex = j1;
		//   20   37:aload_0         
		//   21   38:iload           7
		//   22   40:putfield        #44  <Field int eventStreamGroupIndex>
		//   23   43:return          
		}
	}

	public static interface TrackGroupInfo.TrackGroupCategory
		extends Annotation
	{
	}


	public DashMediaPeriod(int i, DashManifest dashmanifest, int j, DashChunkSource.Factory factory, int k, com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher eventdispatcher, long l, LoaderErrorThrower loadererrorthrower, Allocator allocator1, CompositeSequenceableLoaderFactory compositesequenceableloaderfactory, PlayerEmsgHandler.PlayerEmsgCallback playeremsgcallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void Object()>
		id = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #66  <Field int id>
		manifest = dashmanifest;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #68  <Field DashManifest manifest>
		periodIndex = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #70  <Field int periodIndex>
		chunkSourceFactory = factory;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #72  <Field DashChunkSource$Factory chunkSourceFactory>
		minLoadableRetryCount = k;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #74  <Field int minLoadableRetryCount>
		eventDispatcher = eventdispatcher;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #76  <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
		elapsedRealtimeOffset = l;
	//   20   37:aload_0         
	//   21   38:lload           7
	//   22   40:putfield        #78  <Field long elapsedRealtimeOffset>
		manifestLoaderErrorThrower = loadererrorthrower;
	//   23   43:aload_0         
	//   24   44:aload           9
	//   25   46:putfield        #80  <Field LoaderErrorThrower manifestLoaderErrorThrower>
		allocator = allocator1;
	//   26   49:aload_0         
	//   27   50:aload           10
	//   28   52:putfield        #82  <Field Allocator allocator>
		compositeSequenceableLoaderFactory = compositesequenceableloaderfactory;
	//   29   55:aload_0         
	//   30   56:aload           11
	//   31   58:putfield        #84  <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
		playerEmsgHandler = new PlayerEmsgHandler(dashmanifest, playeremsgcallback, allocator1);
	//   32   61:aload_0         
	//   33   62:new             #86  <Class PlayerEmsgHandler>
	//   34   65:dup             
	//   35   66:aload_2         
	//   36   67:aload           12
	//   37   69:aload           10
	//   38   71:invokespecial   #89  <Method void PlayerEmsgHandler(DashManifest, PlayerEmsgHandler$PlayerEmsgCallback, Allocator)>
	//   39   74:putfield        #91  <Field PlayerEmsgHandler playerEmsgHandler>
		sampleStreams = newSampleStreamArray(0);
	//   40   77:aload_0         
	//   41   78:iconst_0        
	//   42   79:invokestatic    #95  <Method ChunkSampleStream[] newSampleStreamArray(int)>
	//   43   82:putfield        #97  <Field ChunkSampleStream[] sampleStreams>
		eventSampleStreams = new EventSampleStream[0];
	//   44   85:aload_0         
	//   45   86:iconst_0        
	//   46   87:anewarray       EventSampleStream[]
	//   47   90:putfield        #101 <Field EventSampleStream[] eventSampleStreams>
	//   48   93:aload_0         
	//   49   94:new             #103 <Class IdentityHashMap>
	//   50   97:dup             
	//   51   98:invokespecial   #104 <Method void IdentityHashMap()>
	//   52  101:putfield        #106 <Field IdentityHashMap trackEmsgHandlerBySampleStream>
		compositeSequenceableLoader = compositesequenceableloaderfactory.createCompositeSequenceableLoader(((SequenceableLoader []) (sampleStreams)));
	//   53  104:aload_0         
	//   54  105:aload           11
	//   55  107:aload_0         
	//   56  108:getfield        #97  <Field ChunkSampleStream[] sampleStreams>
	//   57  111:invokeinterface #112 <Method SequenceableLoader CompositeSequenceableLoaderFactory.createCompositeSequenceableLoader(SequenceableLoader[])>
	//   58  116:putfield        #114 <Field SequenceableLoader compositeSequenceableLoader>
		dashmanifest = ((DashManifest) (dashmanifest.getPeriod(j)));
	//   59  119:aload_2         
	//   60  120:iload_3         
	//   61  121:invokevirtual   #120 <Method Period DashManifest.getPeriod(int)>
	//   62  124:astore_2        
		eventStreams = ((Period) (dashmanifest)).eventStreams;
	//   63  125:aload_0         
	//   64  126:aload_2         
	//   65  127:getfield        #124 <Field List Period.eventStreams>
	//   66  130:putfield        #125 <Field List eventStreams>
		dashmanifest = ((DashManifest) (buildTrackGroups(((Period) (dashmanifest)).adaptationSets, eventStreams)));
	//   67  133:aload_2         
	//   68  134:getfield        #128 <Field List Period.adaptationSets>
	//   69  137:aload_0         
	//   70  138:getfield        #125 <Field List eventStreams>
	//   71  141:invokestatic    #132 <Method Pair buildTrackGroups(List, List)>
	//   72  144:astore_2        
		trackGroups = (TrackGroupArray)((Pair) (dashmanifest)).first;
	//   73  145:aload_0         
	//   74  146:aload_2         
	//   75  147:getfield        #138 <Field Object Pair.first>
	//   76  150:checkcast       #140 <Class TrackGroupArray>
	//   77  153:putfield        #142 <Field TrackGroupArray trackGroups>
		trackGroupInfos = (TrackGroupInfo[])((Pair) (dashmanifest)).second;
	//   78  156:aload_0         
	//   79  157:aload_2         
	//   80  158:getfield        #145 <Field Object Pair.second>
	//   81  161:checkcast       #146 <Class DashMediaPeriod$TrackGroupInfo[]>
	//   82  164:putfield        #148 <Field DashMediaPeriod$TrackGroupInfo[] trackGroupInfos>
		eventdispatcher.mediaPeriodCreated();
	//   83  167:aload           6
	//   84  169:invokevirtual   #153 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.mediaPeriodCreated()>
	//   85  172:return          
	}

	private static void buildManifestEventTrackGroupInfos(List list, TrackGroup atrackgroup[], TrackGroupInfo atrackgroupinfo[], int i)
	{
		for(int j = 0; j < list.size();)
	//*   0    0:iconst_0        
	//*   1    1:istore          4
	//*   2    3:iload           4
	//*   3    5:aload_0         
	//*   4    6:invokeinterface #162 <Method int List.size()>
	//*   5   11:icmpge          74
		{
			atrackgroup[i] = new TrackGroup(new Format[] {
				Format.createSampleFormat(((EventStream)list.get(j)).id(), "application/x-emsg", ((String) (null)), -1, ((com.google.android.exoplayer2.drm.DrmInitData) (null)))
			});
	//    6   14:aload_1         
	//    7   15:iload_3         
	//    8   16:new             #164 <Class TrackGroup>
	//    9   19:dup             
	//   10   20:iconst_1        
	//   11   21:anewarray       Format[]
	//   12   24:dup             
	//   13   25:iconst_0        
	//   14   26:aload_0         
	//   15   27:iload           4
	//   16   29:invokeinterface #170 <Method Object List.get(int)>
	//   17   34:checkcast       #172 <Class EventStream>
	//   18   37:invokevirtual   #175 <Method String EventStream.id()>
	//   19   40:ldc1            #177 <String "application/x-emsg">
	//   20   42:aconst_null     
	//   21   43:iconst_m1       
	//   22   44:aconst_null     
	//   23   45:invokestatic    #181 <Method Format Format.createSampleFormat(String, String, String, int, com.google.android.exoplayer2.drm.DrmInitData)>
	//   24   48:aastore         
	//   25   49:invokespecial   #184 <Method void TrackGroup(Format[])>
	//   26   52:aastore         
			atrackgroupinfo[i] = TrackGroupInfo.mpdEventTrack(j);
	//   27   53:aload_2         
	//   28   54:iload_3         
	//   29   55:iload           4
	//   30   57:invokestatic    #188 <Method DashMediaPeriod$TrackGroupInfo DashMediaPeriod$TrackGroupInfo.mpdEventTrack(int)>
	//   31   60:aastore         
			j++;
	//   32   61:iload           4
	//   33   63:iconst_1        
	//   34   64:iadd            
	//   35   65:istore          4
			i++;
	//   36   67:iload_3         
	//   37   68:iconst_1        
	//   38   69:iadd            
	//   39   70:istore_3        
		}

	//*  40   71:goto            3
	//   41   74:return          
	}

	private static int buildPrimaryAndEmbeddedTrackGroupInfos(List list, int ai[][], int i, boolean aflag[], boolean aflag1[], TrackGroup atrackgroup[], TrackGroupInfo atrackgroupinfo[])
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore          7
		int k = 0;
	//    2    3:iconst_0        
	//    3    4:istore          8
		int l = k;
	//    4    6:iload           8
	//    5    8:istore          9
		do
		{
			Object obj = ((Object) (list));
	//    6   10:aload_0         
	//    7   11:astore          13
			if(k < i)
	//*   8   13:iload           8
	//*   9   15:iload_2         
	//*  10   16:icmpge          432
			{
				int ai1[] = ai[k];
	//   11   19:aload_1         
	//   12   20:iload           8
	//   13   22:aaload          
	//   14   23:astore          14
				ArrayList arraylist = new ArrayList();
	//   15   25:new             #194 <Class ArrayList>
	//   16   28:dup             
	//   17   29:invokespecial   #195 <Method void ArrayList()>
	//   18   32:astore          16
				int l1 = ai1.length;
	//   19   34:aload           14
	//   20   36:arraylength     
	//   21   37:istore          11
				for(int i1 = j; i1 < l1; i1++)
	//*  22   39:iload           7
	//*  23   41:istore          10
	//*  24   43:iload           10
	//*  25   45:iload           11
	//*  26   47:icmpge          85
					((List) (arraylist)).addAll(((java.util.Collection) (((AdaptationSet)((List) (obj)).get(ai1[i1])).representations)));
	//   27   50:aload           16
	//   28   52:aload           13
	//   29   54:aload           14
	//   30   56:iload           10
	//   31   58:iaload          
	//   32   59:invokeinterface #170 <Method Object List.get(int)>
	//   33   64:checkcast       #197 <Class AdaptationSet>
	//   34   67:getfield        #200 <Field List AdaptationSet.representations>
	//   35   70:invokeinterface #204 <Method boolean List.addAll(java.util.Collection)>
	//   36   75:pop             

	//   37   76:iload           10
	//   38   78:iconst_1        
	//   39   79:iadd            
	//   40   80:istore          10
	//*  41   82:goto            43
				Format aformat[] = new Format[((List) (arraylist)).size()];
	//   42   85:aload           16
	//   43   87:invokeinterface #162 <Method int List.size()>
	//   44   92:anewarray       Format[]
	//   45   95:astore          15
				for(int j1 = j; j1 < aformat.length; j1++)
	//*  46   97:iload           7
	//*  47   99:istore          10
	//*  48  101:iload           10
	//*  49  103:aload           15
	//*  50  105:arraylength     
	//*  51  106:icmpge          138
					aformat[j1] = ((Representation)((List) (arraylist)).get(j1)).format;
	//   52  109:aload           15
	//   53  111:iload           10
	//   54  113:aload           16
	//   55  115:iload           10
	//   56  117:invokeinterface #170 <Method Object List.get(int)>
	//   57  122:checkcast       #206 <Class Representation>
	//   58  125:getfield        #210 <Field Format Representation.format>
	//   59  128:aastore         

	//   60  129:iload           10
	//   61  131:iconst_1        
	//   62  132:iadd            
	//   63  133:istore          10
	//*  64  135:goto            101
				obj = ((Object) ((AdaptationSet)((List) (obj)).get(ai1[j])));
	//   65  138:aload           13
	//   66  140:aload           14
	//   67  142:iload           7
	//   68  144:iaload          
	//   69  145:invokeinterface #170 <Method Object List.get(int)>
	//   70  150:checkcast       #197 <Class AdaptationSet>
	//   71  153:astore          13
				j = l + 1;
	//   72  155:iload           9
	//   73  157:iconst_1        
	//   74  158:iadd            
	//   75  159:istore          7
				int k1;
				if(aflag[k])
	//*  76  161:aload_3         
	//*  77  162:iload           8
	//*  78  164:baload          
	//*  79  165:ifeq            185
				{
					l1 = j + 1;
	//   80  168:iload           7
	//   81  170:iconst_1        
	//   82  171:iadd            
	//   83  172:istore          11
					k1 = j;
	//   84  174:iload           7
	//   85  176:istore          10
					j = l1;
	//   86  178:iload           11
	//   87  180:istore          7
				} else
	//*  88  182:goto            188
				{
					k1 = -1;
	//   89  185:iconst_m1       
	//   90  186:istore          10
				}
				if(aflag1[k])
	//*  91  188:aload           4
	//*  92  190:iload           8
	//*  93  192:baload          
	//*  94  193:ifeq            213
				{
					int i2 = j + 1;
	//   95  196:iload           7
	//   96  198:iconst_1        
	//   97  199:iadd            
	//   98  200:istore          12
					l1 = j;
	//   99  202:iload           7
	//  100  204:istore          11
					j = i2;
	//  101  206:iload           12
	//  102  208:istore          7
				} else
	//* 103  210:goto            216
				{
					l1 = -1;
	//  104  213:iconst_m1       
	//  105  214:istore          11
				}
				atrackgroup[l] = new TrackGroup(aformat);
	//  106  216:aload           5
	//  107  218:iload           9
	//  108  220:new             #164 <Class TrackGroup>
	//  109  223:dup             
	//  110  224:aload           15
	//  111  226:invokespecial   #184 <Method void TrackGroup(Format[])>
	//  112  229:aastore         
				atrackgroupinfo[l] = TrackGroupInfo.primaryTrack(((AdaptationSet) (obj)).type, ai1, l, k1, l1);
	//  113  230:aload           6
	//  114  232:iload           9
	//  115  234:aload           13
	//  116  236:getfield        #213 <Field int AdaptationSet.type>
	//  117  239:aload           14
	//  118  241:iload           9
	//  119  243:iload           10
	//  120  245:iload           11
	//  121  247:invokestatic    #217 <Method DashMediaPeriod$TrackGroupInfo DashMediaPeriod$TrackGroupInfo.primaryTrack(int, int[], int, int, int)>
	//  122  250:aastore         
				if(k1 != -1)
	//* 123  251:iload           10
	//* 124  253:iconst_m1       
	//* 125  254:icmpeq          332
				{
					StringBuilder stringbuilder = new StringBuilder();
	//  126  257:new             #219 <Class StringBuilder>
	//  127  260:dup             
	//  128  261:invokespecial   #220 <Method void StringBuilder()>
	//  129  264:astore          15
					stringbuilder.append(((AdaptationSet) (obj)).id);
	//  130  266:aload           15
	//  131  268:aload           13
	//  132  270:getfield        #221 <Field int AdaptationSet.id>
	//  133  273:invokevirtual   #225 <Method StringBuilder StringBuilder.append(int)>
	//  134  276:pop             
					stringbuilder.append(":emsg");
	//  135  277:aload           15
	//  136  279:ldc1            #227 <String ":emsg">
	//  137  281:invokevirtual   #230 <Method StringBuilder StringBuilder.append(String)>
	//  138  284:pop             
					atrackgroup[k1] = new TrackGroup(new Format[] {
						Format.createSampleFormat(stringbuilder.toString(), "application/x-emsg", ((String) (null)), -1, ((com.google.android.exoplayer2.drm.DrmInitData) (null)))
					});
	//  139  285:aload           5
	//  140  287:iload           10
	//  141  289:new             #164 <Class TrackGroup>
	//  142  292:dup             
	//  143  293:iconst_1        
	//  144  294:anewarray       Format[]
	//  145  297:dup             
	//  146  298:iconst_0        
	//  147  299:aload           15
	//  148  301:invokevirtual   #233 <Method String StringBuilder.toString()>
	//  149  304:ldc1            #177 <String "application/x-emsg">
	//  150  306:aconst_null     
	//  151  307:iconst_m1       
	//  152  308:aconst_null     
	//  153  309:invokestatic    #181 <Method Format Format.createSampleFormat(String, String, String, int, com.google.android.exoplayer2.drm.DrmInitData)>
	//  154  312:aastore         
	//  155  313:invokespecial   #184 <Method void TrackGroup(Format[])>
	//  156  316:aastore         
					atrackgroupinfo[k1] = TrackGroupInfo.embeddedEmsgTrack(ai1, l);
	//  157  317:aload           6
	//  158  319:iload           10
	//  159  321:aload           14
	//  160  323:iload           9
	//  161  325:invokestatic    #237 <Method DashMediaPeriod$TrackGroupInfo DashMediaPeriod$TrackGroupInfo.embeddedEmsgTrack(int[], int)>
	//  162  328:aastore         
				}
	//* 163  329:goto            332
				if(l1 != -1)
	//* 164  332:iload           11
	//* 165  334:iconst_m1       
	//* 166  335:icmpeq          412
				{
					StringBuilder stringbuilder1 = new StringBuilder();
	//  167  338:new             #219 <Class StringBuilder>
	//  168  341:dup             
	//  169  342:invokespecial   #220 <Method void StringBuilder()>
	//  170  345:astore          15
					stringbuilder1.append(((AdaptationSet) (obj)).id);
	//  171  347:aload           15
	//  172  349:aload           13
	//  173  351:getfield        #221 <Field int AdaptationSet.id>
	//  174  354:invokevirtual   #225 <Method StringBuilder StringBuilder.append(int)>
	//  175  357:pop             
					stringbuilder1.append(":cea608");
	//  176  358:aload           15
	//  177  360:ldc1            #239 <String ":cea608">
	//  178  362:invokevirtual   #230 <Method StringBuilder StringBuilder.append(String)>
	//  179  365:pop             
					atrackgroup[l1] = new TrackGroup(new Format[] {
						Format.createTextSampleFormat(stringbuilder1.toString(), "application/cea-608", 0, ((String) (null)))
					});
	//  180  366:aload           5
	//  181  368:iload           11
	//  182  370:new             #164 <Class TrackGroup>
	//  183  373:dup             
	//  184  374:iconst_1        
	//  185  375:anewarray       Format[]
	//  186  378:dup             
	//  187  379:iconst_0        
	//  188  380:aload           15
	//  189  382:invokevirtual   #233 <Method String StringBuilder.toString()>
	//  190  385:ldc1            #241 <String "application/cea-608">
	//  191  387:iconst_0        
	//  192  388:aconst_null     
	//  193  389:invokestatic    #245 <Method Format Format.createTextSampleFormat(String, String, int, String)>
	//  194  392:aastore         
	//  195  393:invokespecial   #184 <Method void TrackGroup(Format[])>
	//  196  396:aastore         
					atrackgroupinfo[l1] = TrackGroupInfo.embeddedCea608Track(ai1, l);
	//  197  397:aload           6
	//  198  399:iload           11
	//  199  401:aload           14
	//  200  403:iload           9
	//  201  405:invokestatic    #248 <Method DashMediaPeriod$TrackGroupInfo DashMediaPeriod$TrackGroupInfo.embeddedCea608Track(int[], int)>
	//  202  408:aastore         
				}
	//* 203  409:goto            412
				k++;
	//  204  412:iload           8
	//  205  414:iconst_1        
	//  206  415:iadd            
	//  207  416:istore          8
				k1 = 0;
	//  208  418:iconst_0        
	//  209  419:istore          10
				l = j;
	//  210  421:iload           7
	//  211  423:istore          9
				j = k1;
	//  212  425:iload           10
	//  213  427:istore          7
			} else
	//* 214  429:goto            10
			{
				return l;
	//  215  432:iload           9
	//  216  434:ireturn         
			}
		} while(true);
	}

	private ChunkSampleStream buildSampleStream(TrackGroupInfo trackgroupinfo, TrackSelection trackselection, long l)
	{
		int ai[];
		Format aformat[];
		PlayerEmsgHandler.PlayerTrackEmsgHandler playertrackemsghandler;
		int ai1[] = new int[2];
	//    0    0:iconst_2        
	//    1    1:newarray        int[]
	//    2    3:astore          11
		Format aformat1[] = new Format[2];
	//    3    5:iconst_2        
	//    4    6:anewarray       Format[]
	//    5    9:astore          12
		boolean flag;
		if(trackgroupinfo.embeddedEventMessageTrackGroupIndex != -1)
	//*   6   11:aload_1         
	//*   7   12:getfield        #254 <Field int DashMediaPeriod$TrackGroupInfo.embeddedEventMessageTrackGroupIndex>
	//*   8   15:iconst_m1       
	//*   9   16:icmpeq          25
			flag = true;
	//   10   19:iconst_1        
	//   11   20:istore          7
		else
	//*  12   22:goto            28
			flag = false;
	//   13   25:iconst_0        
	//   14   26:istore          7
		int i;
		if(flag)
	//*  15   28:iload           7
	//*  16   30:ifeq            63
		{
			aformat1[0] = trackGroups.get(trackgroupinfo.embeddedEventMessageTrackGroupIndex).getFormat(0);
	//   17   33:aload           12
	//   18   35:iconst_0        
	//   19   36:aload_0         
	//   20   37:getfield        #142 <Field TrackGroupArray trackGroups>
	//   21   40:aload_1         
	//   22   41:getfield        #254 <Field int DashMediaPeriod$TrackGroupInfo.embeddedEventMessageTrackGroupIndex>
	//   23   44:invokevirtual   #257 <Method TrackGroup TrackGroupArray.get(int)>
	//   24   47:iconst_0        
	//   25   48:invokevirtual   #261 <Method Format TrackGroup.getFormat(int)>
	//   26   51:aastore         
			ai1[0] = 4;
	//   27   52:aload           11
	//   28   54:iconst_0        
	//   29   55:iconst_4        
	//   30   56:iastore         
			i = 1;
	//   31   57:iconst_1        
	//   32   58:istore          5
		} else
	//*  33   60:goto            66
		{
			i = 0;
	//   34   63:iconst_0        
	//   35   64:istore          5
		}
		boolean flag1;
		if(trackgroupinfo.embeddedCea608TrackGroupIndex != -1)
	//*  36   66:aload_1         
	//*  37   67:getfield        #264 <Field int DashMediaPeriod$TrackGroupInfo.embeddedCea608TrackGroupIndex>
	//*  38   70:iconst_m1       
	//*  39   71:icmpeq          80
			flag1 = true;
	//   40   74:iconst_1        
	//   41   75:istore          8
		else
	//*  42   77:goto            83
			flag1 = false;
	//   43   80:iconst_0        
	//   44   81:istore          8
		int j = i;
	//   45   83:iload           5
	//   46   85:istore          6
		if(flag1)
	//*  47   87:iload           8
	//*  48   89:ifeq            124
		{
			aformat1[i] = trackGroups.get(trackgroupinfo.embeddedCea608TrackGroupIndex).getFormat(0);
	//   49   92:aload           12
	//   50   94:iload           5
	//   51   96:aload_0         
	//   52   97:getfield        #142 <Field TrackGroupArray trackGroups>
	//   53  100:aload_1         
	//   54  101:getfield        #264 <Field int DashMediaPeriod$TrackGroupInfo.embeddedCea608TrackGroupIndex>
	//   55  104:invokevirtual   #257 <Method TrackGroup TrackGroupArray.get(int)>
	//   56  107:iconst_0        
	//   57  108:invokevirtual   #261 <Method Format TrackGroup.getFormat(int)>
	//   58  111:aastore         
			ai1[i] = 3;
	//   59  112:aload           11
	//   60  114:iload           5
	//   61  116:iconst_3        
	//   62  117:iastore         
			j = i + 1;
	//   63  118:iload           5
	//   64  120:iconst_1        
	//   65  121:iadd            
	//   66  122:istore          6
		}
		aformat = aformat1;
	//   67  124:aload           12
	//   68  126:astore          10
		ai = ai1;
	//   69  128:aload           11
	//   70  130:astore          9
		if(j < ai1.length)
	//*  71  132:iload           6
	//*  72  134:aload           11
	//*  73  136:arraylength     
	//*  74  137:icmpge          161
		{
			aformat = (Format[])Arrays.copyOf(((Object []) (aformat1)), j);
	//   75  140:aload           12
	//   76  142:iload           6
	//   77  144:invokestatic    #270 <Method Object[] Arrays.copyOf(Object[], int)>
	//   78  147:checkcast       #272 <Class Format[]>
	//   79  150:astore          10
			ai = Arrays.copyOf(ai1, j);
	//   80  152:aload           11
	//   81  154:iload           6
	//   82  156:invokestatic    #275 <Method int[] Arrays.copyOf(int[], int)>
	//   83  159:astore          9
		}
		if(manifest.dynamic && flag)
	//*  84  161:aload_0         
	//*  85  162:getfield        #68  <Field DashManifest manifest>
	//*  86  165:getfield        #278 <Field boolean DashManifest.dynamic>
	//*  87  168:ifeq            188
	//*  88  171:iload           7
	//*  89  173:ifeq            188
			playertrackemsghandler = playerEmsgHandler.newPlayerTrackEmsgHandler();
	//   90  176:aload_0         
	//   91  177:getfield        #91  <Field PlayerEmsgHandler playerEmsgHandler>
	//   92  180:invokevirtual   #282 <Method PlayerEmsgHandler$PlayerTrackEmsgHandler PlayerEmsgHandler.newPlayerTrackEmsgHandler()>
	//   93  183:astore          11
		else
	//*  94  185:goto            191
			playertrackemsghandler = null;
	//   95  188:aconst_null     
	//   96  189:astore          11
		trackselection = ((TrackSelection) (chunkSourceFactory.createDashChunkSource(manifestLoaderErrorThrower, manifest, periodIndex, trackgroupinfo.adaptationSetIndices, trackselection, trackgroupinfo.trackType, elapsedRealtimeOffset, flag, flag1, playertrackemsghandler)));
	//   97  191:aload_0         
	//   98  192:getfield        #72  <Field DashChunkSource$Factory chunkSourceFactory>
	//   99  195:aload_0         
	//  100  196:getfield        #80  <Field LoaderErrorThrower manifestLoaderErrorThrower>
	//  101  199:aload_0         
	//  102  200:getfield        #68  <Field DashManifest manifest>
	//  103  203:aload_0         
	//  104  204:getfield        #70  <Field int periodIndex>
	//  105  207:aload_1         
	//  106  208:getfield        #286 <Field int[] DashMediaPeriod$TrackGroupInfo.adaptationSetIndices>
	//  107  211:aload_2         
	//  108  212:aload_1         
	//  109  213:getfield        #289 <Field int DashMediaPeriod$TrackGroupInfo.trackType>
	//  110  216:aload_0         
	//  111  217:getfield        #78  <Field long elapsedRealtimeOffset>
	//  112  220:iload           7
	//  113  222:iload           8
	//  114  224:aload           11
	//  115  226:invokeinterface #295 <Method DashChunkSource DashChunkSource$Factory.createDashChunkSource(LoaderErrorThrower, DashManifest, int, int[], TrackSelection, int, long, boolean, boolean, PlayerEmsgHandler$PlayerTrackEmsgHandler)>
	//  116  231:astore_2        
		trackgroupinfo = ((TrackGroupInfo) (new ChunkSampleStream(trackgroupinfo.trackType, ai, aformat, ((com.google.android.exoplayer2.source.chunk.ChunkSource) (trackselection)), ((com.google.android.exoplayer2.source.SequenceableLoader.Callback) (this)), allocator, l, minLoadableRetryCount, eventDispatcher)));
	//  117  232:new             #297 <Class ChunkSampleStream>
	//  118  235:dup             
	//  119  236:aload_1         
	//  120  237:getfield        #289 <Field int DashMediaPeriod$TrackGroupInfo.trackType>
	//  121  240:aload           9
	//  122  242:aload           10
	//  123  244:aload_2         
	//  124  245:aload_0         
	//  125  246:aload_0         
	//  126  247:getfield        #82  <Field Allocator allocator>
	//  127  250:lload_3         
	//  128  251:aload_0         
	//  129  252:getfield        #74  <Field int minLoadableRetryCount>
	//  130  255:aload_0         
	//  131  256:getfield        #76  <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//  132  259:invokespecial   #300 <Method void ChunkSampleStream(int, int[], Format[], com.google.android.exoplayer2.source.chunk.ChunkSource, com.google.android.exoplayer2.source.SequenceableLoader$Callback, Allocator, long, int, com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher)>
	//  133  262:astore_1        
		this;
	//  134  263:aload_0         
		JVM INSTR monitorenter ;
	//  135  264:monitorenter    
		trackEmsgHandlerBySampleStream.put(((Object) (trackgroupinfo)), ((Object) (playertrackemsghandler)));
	//  136  265:aload_0         
	//  137  266:getfield        #106 <Field IdentityHashMap trackEmsgHandlerBySampleStream>
	//  138  269:aload_1         
	//  139  270:aload           11
	//  140  272:invokevirtual   #304 <Method Object IdentityHashMap.put(Object, Object)>
	//  141  275:pop             
		this;
	//  142  276:aload_0         
		JVM INSTR monitorexit ;
	//  143  277:monitorexit     
		return ((ChunkSampleStream) (trackgroupinfo));
	//  144  278:aload_1         
	//  145  279:areturn         
		trackgroupinfo;
	//  146  280:astore_1        
		this;
	//  147  281:aload_0         
		JVM INSTR monitorexit ;
	//  148  282:monitorexit     
		throw trackgroupinfo;
	//  149  283:aload_1         
	//  150  284:athrow          
	}

	private static Pair buildTrackGroups(List list, List list1)
	{
		int ai[][] = getGroupedAdaptationSetIndices(list);
	//    0    0:aload_0         
	//    1    1:invokestatic    #309 <Method int[][] getGroupedAdaptationSetIndices(List)>
	//    2    4:astore          4
		int i = ai.length;
	//    3    6:aload           4
	//    4    8:arraylength     
	//    5    9:istore_2        
		boolean aflag[] = new boolean[i];
	//    6   10:iload_2         
	//    7   11:newarray        boolean[]
	//    8   13:astore          5
		boolean aflag1[] = new boolean[i];
	//    9   15:iload_2         
	//   10   16:newarray        boolean[]
	//   11   18:astore          6
		int j = identifyEmbeddedTracks(i, list, ai, aflag, aflag1) + i + list1.size();
	//   12   20:iload_2         
	//   13   21:aload_0         
	//   14   22:aload           4
	//   15   24:aload           5
	//   16   26:aload           6
	//   17   28:invokestatic    #313 <Method int identifyEmbeddedTracks(int, List, int[][], boolean[], boolean[])>
	//   18   31:iload_2         
	//   19   32:iadd            
	//   20   33:aload_1         
	//   21   34:invokeinterface #162 <Method int List.size()>
	//   22   39:iadd            
	//   23   40:istore_3        
		TrackGroup atrackgroup[] = new TrackGroup[j];
	//   24   41:iload_3         
	//   25   42:anewarray       TrackGroup[]
	//   26   45:astore          7
		TrackGroupInfo atrackgroupinfo[] = new TrackGroupInfo[j];
	//   27   47:iload_3         
	//   28   48:anewarray       TrackGroupInfo[]
	//   29   51:astore          8
		buildManifestEventTrackGroupInfos(list1, atrackgroup, atrackgroupinfo, buildPrimaryAndEmbeddedTrackGroupInfos(list, ai, i, aflag, aflag1, atrackgroup, atrackgroupinfo));
	//   30   53:aload_1         
	//   31   54:aload           7
	//   32   56:aload           8
	//   33   58:aload_0         
	//   34   59:aload           4
	//   35   61:iload_2         
	//   36   62:aload           5
	//   37   64:aload           6
	//   38   66:aload           7
	//   39   68:aload           8
	//   40   70:invokestatic    #315 <Method int buildPrimaryAndEmbeddedTrackGroupInfos(List, int[][], int, boolean[], boolean[], TrackGroup[], DashMediaPeriod$TrackGroupInfo[])>
	//   41   73:invokestatic    #317 <Method void buildManifestEventTrackGroupInfos(List, TrackGroup[], DashMediaPeriod$TrackGroupInfo[], int)>
		return Pair.create(((Object) (new TrackGroupArray(atrackgroup))), ((Object) (atrackgroupinfo)));
	//   42   76:new             #140 <Class TrackGroupArray>
	//   43   79:dup             
	//   44   80:aload           7
	//   45   82:invokespecial   #320 <Method void TrackGroupArray(TrackGroup[])>
	//   46   85:aload           8
	//   47   87:invokestatic    #324 <Method Pair Pair.create(Object, Object)>
	//   48   90:areturn         
	}

	private static Descriptor findAdaptationSetSwitchingProperty(List list)
	{
		for(int i = 0; i < list.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:invokeinterface #162 <Method int List.size()>
	//*   5    9:icmpge          45
		{
			Descriptor descriptor = (Descriptor)list.get(i);
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokeinterface #170 <Method Object List.get(int)>
	//    9   19:checkcast       #329 <Class Descriptor>
	//   10   22:astore_2        
			if("urn:mpeg:dash:adaptation-set-switching:2016".equals(((Object) (descriptor.schemeIdUri))))
	//*  11   23:ldc2            #331 <String "urn:mpeg:dash:adaptation-set-switching:2016">
	//*  12   26:aload_2         
	//*  13   27:getfield        #335 <Field String Descriptor.schemeIdUri>
	//*  14   30:invokevirtual   #341 <Method boolean String.equals(Object)>
	//*  15   33:ifeq            38
				return descriptor;
	//   16   36:aload_2         
	//   17   37:areturn         
		}

	//   18   38:iload_1         
	//   19   39:iconst_1        
	//   20   40:iadd            
	//   21   41:istore_1        
	//*  22   42:goto            2
		return null;
	//   23   45:aconst_null     
	//   24   46:areturn         
	}

	private static int[][] getGroupedAdaptationSetIndices(List list)
	{
		int i1 = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #162 <Method int List.size()>
	//    2    6:istore          4
		SparseIntArray sparseintarray = new SparseIntArray(i1);
	//    3    8:new             #344 <Class SparseIntArray>
	//    4   11:dup             
	//    5   12:iload           4
	//    6   14:invokespecial   #347 <Method void SparseIntArray(int)>
	//    7   17:astore          7
		for(int i = 0; i < i1; i++)
	//*   8   19:iconst_0        
	//*   9   20:istore_1        
	//*  10   21:iload_1         
	//*  11   22:iload           4
	//*  12   24:icmpge          53
			sparseintarray.put(((AdaptationSet)list.get(i)).id, i);
	//   13   27:aload           7
	//   14   29:aload_0         
	//   15   30:iload_1         
	//   16   31:invokeinterface #170 <Method Object List.get(int)>
	//   17   36:checkcast       #197 <Class AdaptationSet>
	//   18   39:getfield        #221 <Field int AdaptationSet.id>
	//   19   42:iload_1         
	//   20   43:invokevirtual   #350 <Method void SparseIntArray.put(int, int)>

	//   21   46:iload_1         
	//   22   47:iconst_1        
	//   23   48:iadd            
	//   24   49:istore_1        
	//*  25   50:goto            21
		int ai[][] = new int[i1][];
	//   26   53:iload           4
	//   27   55:anewarray       int[][]
	//   28   58:astore          6
		boolean aflag[] = new boolean[i1];
	//   29   60:iload           4
	//   30   62:newarray        boolean[]
	//   31   64:astore          8
		int k = 0;
	//   32   66:iconst_0        
	//   33   67:istore_2        
		int j = k;
	//   34   68:iload_2         
	//   35   69:istore_1        
		for(; k < i1; k++)
	//*  36   70:iload_2         
	//*  37   71:iload           4
	//*  38   73:icmpge          218
		{
			if(aflag[k])
	//*  39   76:aload           8
	//*  40   78:iload_2         
	//*  41   79:baload          
	//*  42   80:ifeq            86
				continue;
	//   43   83:goto            211
			aflag[k] = true;
	//   44   86:aload           8
	//   45   88:iload_2         
	//   46   89:iconst_1        
	//   47   90:bastore         
			Descriptor descriptor = findAdaptationSetSwitchingProperty(((AdaptationSet)list.get(k)).supplementalProperties);
	//   48   91:aload_0         
	//   49   92:iload_2         
	//   50   93:invokeinterface #170 <Method Object List.get(int)>
	//   51   98:checkcast       #197 <Class AdaptationSet>
	//   52  101:getfield        #354 <Field List AdaptationSet.supplementalProperties>
	//   53  104:invokestatic    #356 <Method Descriptor findAdaptationSetSwitchingProperty(List)>
	//   54  107:astore          9
			if(descriptor == null)
	//*  55  109:aload           9
	//*  56  111:ifnonnull       132
			{
				ai[j] = (new int[] {
					k
				});
	//   57  114:aload           6
	//   58  116:iload_1         
	//   59  117:iconst_1        
	//   60  118:newarray        int[]
	//   61  120:dup             
	//   62  121:iconst_0        
	//   63  122:iload_2         
	//   64  123:iastore         
	//   65  124:aastore         
				j++;
	//   66  125:iload_1         
	//   67  126:iconst_1        
	//   68  127:iadd            
	//   69  128:istore_1        
				continue;
	//   70  129:goto            211
			}
			String as[] = descriptor.value.split(",");
	//   71  132:aload           9
	//   72  134:getfield        #359 <Field String Descriptor.value>
	//   73  137:ldc2            #361 <String ",">
	//   74  140:invokevirtual   #365 <Method String[] String.split(String)>
	//   75  143:astore          9
			int ai1[] = new int[as.length + 1];
	//   76  145:aload           9
	//   77  147:arraylength     
	//   78  148:iconst_1        
	//   79  149:iadd            
	//   80  150:newarray        int[]
	//   81  152:astore          10
			ai1[0] = k;
	//   82  154:aload           10
	//   83  156:iconst_0        
	//   84  157:iload_2         
	//   85  158:iastore         
			for(int l = 0; l < as.length;)
	//*  86  159:iconst_0        
	//*  87  160:istore_3        
	//*  88  161:iload_3         
	//*  89  162:aload           9
	//*  90  164:arraylength     
	//*  91  165:icmpge          201
			{
				int j1 = sparseintarray.get(Integer.parseInt(as[l]));
	//   92  168:aload           7
	//   93  170:aload           9
	//   94  172:iload_3         
	//   95  173:aaload          
	//   96  174:invokestatic    #371 <Method int Integer.parseInt(String)>
	//   97  177:invokevirtual   #374 <Method int SparseIntArray.get(int)>
	//   98  180:istore          5
				aflag[j1] = true;
	//   99  182:aload           8
	//  100  184:iload           5
	//  101  186:iconst_1        
	//  102  187:bastore         
				l++;
	//  103  188:iload_3         
	//  104  189:iconst_1        
	//  105  190:iadd            
	//  106  191:istore_3        
				ai1[l] = j1;
	//  107  192:aload           10
	//  108  194:iload_3         
	//  109  195:iload           5
	//  110  197:iastore         
			}

	//* 111  198:goto            161
			ai[j] = ai1;
	//  112  201:aload           6
	//  113  203:iload_1         
	//  114  204:aload           10
	//  115  206:aastore         
			j++;
	//  116  207:iload_1         
	//  117  208:iconst_1        
	//  118  209:iadd            
	//  119  210:istore_1        
		}

	//  120  211:iload_2         
	//  121  212:iconst_1        
	//  122  213:iadd            
	//  123  214:istore_2        
	//* 124  215:goto            70
		list = ((List) (ai));
	//  125  218:aload           6
	//  126  220:astore_0        
		if(j < i1)
	//* 127  221:iload_1         
	//* 128  222:iload           4
	//* 129  224:icmpge          237
			list = ((List) ((int[][])Arrays.copyOf(((Object []) (ai)), j)));
	//  130  227:aload           6
	//  131  229:iload_1         
	//  132  230:invokestatic    #270 <Method Object[] Arrays.copyOf(Object[], int)>
	//  133  233:checkcast       #376 <Class int[][]>
	//  134  236:astore_0        
		return ((int [][]) (list));
	//  135  237:aload_0         
	//  136  238:areturn         
	}

	private int getPrimaryStreamIndex(int i, int ai[])
	{
		i = ai[i];
	//    0    0:aload_2         
	//    1    1:iload_1         
	//    2    2:iaload          
	//    3    3:istore_1        
		if(i == -1)
	//*   4    4:iload_1         
	//*   5    5:iconst_m1       
	//*   6    6:icmpne          11
			return -1;
	//    7    9:iconst_m1       
	//    8   10:ireturn         
		int j = trackGroupInfos[i].primaryTrackGroupIndex;
	//    9   11:aload_0         
	//   10   12:getfield        #148 <Field DashMediaPeriod$TrackGroupInfo[] trackGroupInfos>
	//   11   15:iload_1         
	//   12   16:aaload          
	//   13   17:getfield        #382 <Field int DashMediaPeriod$TrackGroupInfo.primaryTrackGroupIndex>
	//   14   20:istore_3        
		for(i = 0; i < ai.length; i++)
	//*  15   21:iconst_0        
	//*  16   22:istore_1        
	//*  17   23:iload_1         
	//*  18   24:aload_2         
	//*  19   25:arraylength     
	//*  20   26:icmpge          62
		{
			int k = ai[i];
	//   21   29:aload_2         
	//   22   30:iload_1         
	//   23   31:iaload          
	//   24   32:istore          4
			if(k == j && trackGroupInfos[k].trackGroupCategory == 0)
	//*  25   34:iload           4
	//*  26   36:iload_3         
	//*  27   37:icmpne          55
	//*  28   40:aload_0         
	//*  29   41:getfield        #148 <Field DashMediaPeriod$TrackGroupInfo[] trackGroupInfos>
	//*  30   44:iload           4
	//*  31   46:aaload          
	//*  32   47:getfield        #385 <Field int DashMediaPeriod$TrackGroupInfo.trackGroupCategory>
	//*  33   50:ifne            55
				return i;
	//   34   53:iload_1         
	//   35   54:ireturn         
		}

	//   36   55:iload_1         
	//   37   56:iconst_1        
	//   38   57:iadd            
	//   39   58:istore_1        
	//*  40   59:goto            23
		return -1;
	//   41   62:iconst_m1       
	//   42   63:ireturn         
	}

	private int[] getStreamIndexToTrackGroupIndex(TrackSelection atrackselection[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int ai[] = new int[atrackselection.length];
	//    2    2:aload_1         
	//    3    3:arraylength     
	//    4    4:newarray        int[]
	//    5    6:astore_3        
		for(; i < atrackselection.length; i++)
	//*   6    7:iload_2         
	//*   7    8:aload_1         
	//*   8    9:arraylength     
	//*   9   10:icmpge          51
			if(atrackselection[i] != null)
	//*  10   13:aload_1         
	//*  11   14:iload_2         
	//*  12   15:aaload          
	//*  13   16:ifnull          40
				ai[i] = trackGroups.indexOf(atrackselection[i].getTrackGroup());
	//   14   19:aload_3         
	//   15   20:iload_2         
	//   16   21:aload_0         
	//   17   22:getfield        #142 <Field TrackGroupArray trackGroups>
	//   18   25:aload_1         
	//   19   26:iload_2         
	//   20   27:aaload          
	//   21   28:invokeinterface #393 <Method TrackGroup TrackSelection.getTrackGroup()>
	//   22   33:invokevirtual   #397 <Method int TrackGroupArray.indexOf(TrackGroup)>
	//   23   36:iastore         
			else
	//*  24   37:goto            44
				ai[i] = -1;
	//   25   40:aload_3         
	//   26   41:iload_2         
	//   27   42:iconst_m1       
	//   28   43:iastore         

	//   29   44:iload_2         
	//   30   45:iconst_1        
	//   31   46:iadd            
	//   32   47:istore_2        
	//*  33   48:goto            7
		return ai;
	//   34   51:aload_3         
	//   35   52:areturn         
	}

	private static boolean hasCea608Track(List list, int ai[])
	{
		int k = ai.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          4
		for(int i = 0; i < k; i++)
	//*   3    4:iconst_0        
	//*   4    5:istore_2        
	//*   5    6:iload_2         
	//*   6    7:iload           4
	//*   7    9:icmpge          81
		{
			List list1 = ((AdaptationSet)list.get(ai[i])).accessibilityDescriptors;
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:iload_2         
	//   11   15:iaload          
	//   12   16:invokeinterface #170 <Method Object List.get(int)>
	//   13   21:checkcast       #197 <Class AdaptationSet>
	//   14   24:getfield        #402 <Field List AdaptationSet.accessibilityDescriptors>
	//   15   27:astore          5
			for(int j = 0; j < list1.size(); j++)
	//*  16   29:iconst_0        
	//*  17   30:istore_3        
	//*  18   31:iload_3         
	//*  19   32:aload           5
	//*  20   34:invokeinterface #162 <Method int List.size()>
	//*  21   39:icmpge          74
				if("urn:scte:dash:cc:cea-608:2015".equals(((Object) (((Descriptor)list1.get(j)).schemeIdUri))))
	//*  22   42:ldc2            #404 <String "urn:scte:dash:cc:cea-608:2015">
	//*  23   45:aload           5
	//*  24   47:iload_3         
	//*  25   48:invokeinterface #170 <Method Object List.get(int)>
	//*  26   53:checkcast       #329 <Class Descriptor>
	//*  27   56:getfield        #335 <Field String Descriptor.schemeIdUri>
	//*  28   59:invokevirtual   #341 <Method boolean String.equals(Object)>
	//*  29   62:ifeq            67
					return true;
	//   30   65:iconst_1        
	//   31   66:ireturn         

	//   32   67:iload_3         
	//   33   68:iconst_1        
	//   34   69:iadd            
	//   35   70:istore_3        
		}

	//   36   71:goto            31
	//   37   74:iload_2         
	//   38   75:iconst_1        
	//   39   76:iadd            
	//   40   77:istore_2        
	//*  41   78:goto            6
		return false;
	//   42   81:iconst_0        
	//   43   82:ireturn         
	}

	private static boolean hasEventMessageTrack(List list, int ai[])
	{
		int k = ai.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          4
		for(int i = 0; i < k; i++)
	//*   3    4:iconst_0        
	//*   4    5:istore_2        
	//*   5    6:iload_2         
	//*   6    7:iload           4
	//*   7    9:icmpge          80
		{
			List list1 = ((AdaptationSet)list.get(ai[i])).representations;
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:iload_2         
	//   11   15:iaload          
	//   12   16:invokeinterface #170 <Method Object List.get(int)>
	//   13   21:checkcast       #197 <Class AdaptationSet>
	//   14   24:getfield        #200 <Field List AdaptationSet.representations>
	//   15   27:astore          5
			for(int j = 0; j < list1.size(); j++)
	//*  16   29:iconst_0        
	//*  17   30:istore_3        
	//*  18   31:iload_3         
	//*  19   32:aload           5
	//*  20   34:invokeinterface #162 <Method int List.size()>
	//*  21   39:icmpge          73
				if(!((Representation)list1.get(j)).inbandEventStreams.isEmpty())
	//*  22   42:aload           5
	//*  23   44:iload_3         
	//*  24   45:invokeinterface #170 <Method Object List.get(int)>
	//*  25   50:checkcast       #206 <Class Representation>
	//*  26   53:getfield        #409 <Field List Representation.inbandEventStreams>
	//*  27   56:invokeinterface #413 <Method boolean List.isEmpty()>
	//*  28   61:ifne            66
					return true;
	//   29   64:iconst_1        
	//   30   65:ireturn         

	//   31   66:iload_3         
	//   32   67:iconst_1        
	//   33   68:iadd            
	//   34   69:istore_3        
		}

	//   35   70:goto            31
	//   36   73:iload_2         
	//   37   74:iconst_1        
	//   38   75:iadd            
	//   39   76:istore_2        
	//*  40   77:goto            6
		return false;
	//   41   80:iconst_0        
	//   42   81:ireturn         
	}

	private static int identifyEmbeddedTracks(int i, List list, int ai[][], boolean aflag[], boolean aflag1[])
	{
		int l = 0;
	//    0    0:iconst_0        
	//    1    1:istore          7
		int j = 0;
	//    2    3:iconst_0        
	//    3    4:istore          5
		for(; l < i; l++)
	//*   4    6:iload           7
	//*   5    8:iload_0         
	//*   6    9:icmpge          74
		{
			int k = j;
	//    7   12:iload           5
	//    8   14:istore          6
			if(hasEventMessageTrack(list, ai[l]))
	//*   9   16:aload_1         
	//*  10   17:aload_2         
	//*  11   18:iload           7
	//*  12   20:aaload          
	//*  13   21:invokestatic    #415 <Method boolean hasEventMessageTrack(List, int[])>
	//*  14   24:ifeq            38
			{
				aflag[l] = true;
	//   15   27:aload_3         
	//   16   28:iload           7
	//   17   30:iconst_1        
	//   18   31:bastore         
				k = j + 1;
	//   19   32:iload           5
	//   20   34:iconst_1        
	//   21   35:iadd            
	//   22   36:istore          6
			}
			j = k;
	//   23   38:iload           6
	//   24   40:istore          5
			if(hasCea608Track(list, ai[l]))
	//*  25   42:aload_1         
	//*  26   43:aload_2         
	//*  27   44:iload           7
	//*  28   46:aaload          
	//*  29   47:invokestatic    #417 <Method boolean hasCea608Track(List, int[])>
	//*  30   50:ifeq            65
			{
				aflag1[l] = true;
	//   31   53:aload           4
	//   32   55:iload           7
	//   33   57:iconst_1        
	//   34   58:bastore         
				j = k + 1;
	//   35   59:iload           6
	//   36   61:iconst_1        
	//   37   62:iadd            
	//   38   63:istore          5
			}
		}

	//   39   65:iload           7
	//   40   67:iconst_1        
	//   41   68:iadd            
	//   42   69:istore          7
	//*  43   71:goto            6
		return j;
	//   44   74:iload           5
	//   45   76:ireturn         
	}

	private static ChunkSampleStream[] newSampleStreamArray(int i)
	{
		return new ChunkSampleStream[i];
	//    0    0:iload_0         
	//    1    1:anewarray       ChunkSampleStream[]
	//    2    4:areturn         
	}

	private void releaseDisabledStreams(TrackSelection atrackselection[], boolean aflag[], SampleStream asamplestream[])
	{
		for(int i = 0; i < atrackselection.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore          4
	//*   2    3:iload           4
	//*   3    5:aload_1         
	//*   4    6:arraylength     
	//*   5    7:icmpge          82
		{
			if(atrackselection[i] != null && aflag[i])
				continue;
	//    6   10:aload_1         
	//    7   11:iload           4
	//    8   13:aaload          
	//    9   14:ifnull          24
	//   10   17:aload_2         
	//   11   18:iload           4
	//   12   20:baload          
	//   13   21:ifne            73
			if(asamplestream[i] instanceof ChunkSampleStream)
	//*  14   24:aload_3         
	//*  15   25:iload           4
	//*  16   27:aaload          
	//*  17   28:instanceof      #297 <Class ChunkSampleStream>
	//*  18   31:ifeq            48
				((ChunkSampleStream)asamplestream[i]).release(((com.google.android.exoplayer2.source.chunk.ChunkSampleStream.ReleaseCallback) (this)));
	//   19   34:aload_3         
	//   20   35:iload           4
	//   21   37:aaload          
	//   22   38:checkcast       #297 <Class ChunkSampleStream>
	//   23   41:aload_0         
	//   24   42:invokevirtual   #425 <Method void ChunkSampleStream.release(com.google.android.exoplayer2.source.chunk.ChunkSampleStream$ReleaseCallback)>
			else
	//*  25   45:goto            68
			if(asamplestream[i] instanceof com.google.android.exoplayer2.source.chunk.ChunkSampleStream.EmbeddedSampleStream)
	//*  26   48:aload_3         
	//*  27   49:iload           4
	//*  28   51:aaload          
	//*  29   52:instanceof      #427 <Class com.google.android.exoplayer2.source.chunk.ChunkSampleStream$EmbeddedSampleStream>
	//*  30   55:ifeq            68
				((com.google.android.exoplayer2.source.chunk.ChunkSampleStream.EmbeddedSampleStream)asamplestream[i]).release();
	//   31   58:aload_3         
	//   32   59:iload           4
	//   33   61:aaload          
	//   34   62:checkcast       #427 <Class com.google.android.exoplayer2.source.chunk.ChunkSampleStream$EmbeddedSampleStream>
	//   35   65:invokevirtual   #429 <Method void com.google.android.exoplayer2.source.chunk.ChunkSampleStream$EmbeddedSampleStream.release()>
			asamplestream[i] = null;
	//   36   68:aload_3         
	//   37   69:iload           4
	//   38   71:aconst_null     
	//   39   72:aastore         
		}

	//   40   73:iload           4
	//   41   75:iconst_1        
	//   42   76:iadd            
	//   43   77:istore          4
	//*  44   79:goto            3
	//   45   82:return          
	}

	private void releaseOrphanEmbeddedStreams(TrackSelection atrackselection[], SampleStream asamplestream[], int ai[])
	{
		for(int i = 0; i < atrackselection.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore          4
	//*   2    3:iload           4
	//*   3    5:aload_1         
	//*   4    6:arraylength     
	//*   5    7:icmpge          132
		{
			if(!(asamplestream[i] instanceof EmptySampleStream) && !(asamplestream[i] instanceof com.google.android.exoplayer2.source.chunk.ChunkSampleStream.EmbeddedSampleStream))
				continue;
	//    6   10:aload_2         
	//    7   11:iload           4
	//    8   13:aaload          
	//    9   14:instanceof      #433 <Class EmptySampleStream>
	//   10   17:ifne            30
	//   11   20:aload_2         
	//   12   21:iload           4
	//   13   23:aaload          
	//   14   24:instanceof      #427 <Class com.google.android.exoplayer2.source.chunk.ChunkSampleStream$EmbeddedSampleStream>
	//   15   27:ifeq            123
			int j = getPrimaryStreamIndex(i, ai);
	//   16   30:aload_0         
	//   17   31:iload           4
	//   18   33:aload_3         
	//   19   34:invokespecial   #435 <Method int getPrimaryStreamIndex(int, int[])>
	//   20   37:istore          5
			boolean flag;
			if(j == -1)
	//*  21   39:iload           5
	//*  22   41:iconst_m1       
	//*  23   42:icmpne          57
				flag = asamplestream[i] instanceof EmptySampleStream;
	//   24   45:aload_2         
	//   25   46:iload           4
	//   26   48:aaload          
	//   27   49:instanceof      #433 <Class EmptySampleStream>
	//   28   52:istore          6
			else
	//*  29   54:goto            93
			if((asamplestream[i] instanceof com.google.android.exoplayer2.source.chunk.ChunkSampleStream.EmbeddedSampleStream) && ((com.google.android.exoplayer2.source.chunk.ChunkSampleStream.EmbeddedSampleStream)asamplestream[i]).parent == asamplestream[j])
	//*  30   57:aload_2         
	//*  31   58:iload           4
	//*  32   60:aaload          
	//*  33   61:instanceof      #427 <Class com.google.android.exoplayer2.source.chunk.ChunkSampleStream$EmbeddedSampleStream>
	//*  34   64:ifeq            90
	//*  35   67:aload_2         
	//*  36   68:iload           4
	//*  37   70:aaload          
	//*  38   71:checkcast       #427 <Class com.google.android.exoplayer2.source.chunk.ChunkSampleStream$EmbeddedSampleStream>
	//*  39   74:getfield        #439 <Field ChunkSampleStream com.google.android.exoplayer2.source.chunk.ChunkSampleStream$EmbeddedSampleStream.parent>
	//*  40   77:aload_2         
	//*  41   78:iload           5
	//*  42   80:aaload          
	//*  43   81:if_acmpne       90
				flag = true;
	//   44   84:iconst_1        
	//   45   85:istore          6
			else
	//*  46   87:goto            93
				flag = false;
	//   47   90:iconst_0        
	//   48   91:istore          6
			if(flag)
				continue;
	//   49   93:iload           6
	//   50   95:ifne            123
			if(asamplestream[i] instanceof com.google.android.exoplayer2.source.chunk.ChunkSampleStream.EmbeddedSampleStream)
	//*  51   98:aload_2         
	//*  52   99:iload           4
	//*  53  101:aaload          
	//*  54  102:instanceof      #427 <Class com.google.android.exoplayer2.source.chunk.ChunkSampleStream$EmbeddedSampleStream>
	//*  55  105:ifeq            118
				((com.google.android.exoplayer2.source.chunk.ChunkSampleStream.EmbeddedSampleStream)asamplestream[i]).release();
	//   56  108:aload_2         
	//   57  109:iload           4
	//   58  111:aaload          
	//   59  112:checkcast       #427 <Class com.google.android.exoplayer2.source.chunk.ChunkSampleStream$EmbeddedSampleStream>
	//   60  115:invokevirtual   #429 <Method void com.google.android.exoplayer2.source.chunk.ChunkSampleStream$EmbeddedSampleStream.release()>
			asamplestream[i] = null;
	//   61  118:aload_2         
	//   62  119:iload           4
	//   63  121:aconst_null     
	//   64  122:aastore         
		}

	//   65  123:iload           4
	//   66  125:iconst_1        
	//   67  126:iadd            
	//   68  127:istore          4
	//*  69  129:goto            3
	//   70  132:return          
	}

	private void selectNewStreams(TrackSelection atrackselection[], SampleStream asamplestream[], boolean aflag[], long l, int ai[])
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          9
		int j = 0;
	//    2    3:iconst_0        
	//    3    4:istore          8
		int i;
		do
		{
			i = ((int) (flag));
	//    4    6:iload           9
	//    5    8:istore          7
			if(j >= atrackselection.length)
				break;
	//    6   10:iload           8
	//    7   12:aload_1         
	//    8   13:arraylength     
	//    9   14:icmpge          145
			if(asamplestream[j] == null && atrackselection[j] != null)
	//*  10   17:aload_2         
	//*  11   18:iload           8
	//*  12   20:aaload          
	//*  13   21:ifnonnull       136
	//*  14   24:aload_1         
	//*  15   25:iload           8
	//*  16   27:aaload          
	//*  17   28:ifnull          136
			{
				aflag[j] = true;
	//   18   31:aload_3         
	//   19   32:iload           8
	//   20   34:iconst_1        
	//   21   35:bastore         
				i = ai[j];
	//   22   36:aload           6
	//   23   38:iload           8
	//   24   40:iaload          
	//   25   41:istore          7
				TrackGroupInfo trackgroupinfo = trackGroupInfos[i];
	//   26   43:aload_0         
	//   27   44:getfield        #148 <Field DashMediaPeriod$TrackGroupInfo[] trackGroupInfos>
	//   28   47:iload           7
	//   29   49:aaload          
	//   30   50:astore          10
				if(trackgroupinfo.trackGroupCategory == 0)
	//*  31   52:aload           10
	//*  32   54:getfield        #385 <Field int DashMediaPeriod$TrackGroupInfo.trackGroupCategory>
	//*  33   57:ifne            79
					asamplestream[j] = ((SampleStream) (buildSampleStream(trackgroupinfo, atrackselection[j], l)));
	//   34   60:aload_2         
	//   35   61:iload           8
	//   36   63:aload_0         
	//   37   64:aload           10
	//   38   66:aload_1         
	//   39   67:iload           8
	//   40   69:aaload          
	//   41   70:lload           4
	//   42   72:invokespecial   #443 <Method ChunkSampleStream buildSampleStream(DashMediaPeriod$TrackGroupInfo, TrackSelection, long)>
	//   43   75:aastore         
				else
	//*  44   76:goto            136
				if(trackgroupinfo.trackGroupCategory == 2)
	//*  45   79:aload           10
	//*  46   81:getfield        #385 <Field int DashMediaPeriod$TrackGroupInfo.trackGroupCategory>
	//*  47   84:iconst_2        
	//*  48   85:icmpne          136
					asamplestream[j] = ((SampleStream) (new EventSampleStream((EventStream)eventStreams.get(trackgroupinfo.eventStreamGroupIndex), atrackselection[j].getTrackGroup().getFormat(0), manifest.dynamic)));
	//   49   88:aload_2         
	//   50   89:iload           8
	//   51   91:new             #99  <Class EventSampleStream>
	//   52   94:dup             
	//   53   95:aload_0         
	//   54   96:getfield        #125 <Field List eventStreams>
	//   55   99:aload           10
	//   56  101:getfield        #446 <Field int DashMediaPeriod$TrackGroupInfo.eventStreamGroupIndex>
	//   57  104:invokeinterface #170 <Method Object List.get(int)>
	//   58  109:checkcast       #172 <Class EventStream>
	//   59  112:aload_1         
	//   60  113:iload           8
	//   61  115:aaload          
	//   62  116:invokeinterface #393 <Method TrackGroup TrackSelection.getTrackGroup()>
	//   63  121:iconst_0        
	//   64  122:invokevirtual   #261 <Method Format TrackGroup.getFormat(int)>
	//   65  125:aload_0         
	//   66  126:getfield        #68  <Field DashManifest manifest>
	//   67  129:getfield        #278 <Field boolean DashManifest.dynamic>
	//   68  132:invokespecial   #449 <Method void EventSampleStream(EventStream, Format, boolean)>
	//   69  135:aastore         
			}
			j++;
	//   70  136:iload           8
	//   71  138:iconst_1        
	//   72  139:iadd            
	//   73  140:istore          8
		} while(true);
	//   74  142:goto            6
		for(; i < atrackselection.length; i++)
	//*  75  145:iload           7
	//*  76  147:aload_1         
	//*  77  148:arraylength     
	//*  78  149:icmpge          248
		{
			if(asamplestream[i] != null || atrackselection[i] == null)
				continue;
	//   79  152:aload_2         
	//   80  153:iload           7
	//   81  155:aaload          
	//   82  156:ifnonnull       239
	//   83  159:aload_1         
	//   84  160:iload           7
	//   85  162:aaload          
	//   86  163:ifnull          239
			int k = ai[i];
	//   87  166:aload           6
	//   88  168:iload           7
	//   89  170:iaload          
	//   90  171:istore          8
			aflag = ((boolean []) (trackGroupInfos[k]));
	//   91  173:aload_0         
	//   92  174:getfield        #148 <Field DashMediaPeriod$TrackGroupInfo[] trackGroupInfos>
	//   93  177:iload           8
	//   94  179:aaload          
	//   95  180:astore_3        
			if(((TrackGroupInfo) (aflag)).trackGroupCategory != 1)
				continue;
	//   96  181:aload_3         
	//   97  182:getfield        #385 <Field int DashMediaPeriod$TrackGroupInfo.trackGroupCategory>
	//   98  185:iconst_1        
	//   99  186:icmpne          239
			k = getPrimaryStreamIndex(i, ai);
	//  100  189:aload_0         
	//  101  190:iload           7
	//  102  192:aload           6
	//  103  194:invokespecial   #435 <Method int getPrimaryStreamIndex(int, int[])>
	//  104  197:istore          8
			if(k == -1)
	//* 105  199:iload           8
	//* 106  201:iconst_m1       
	//* 107  202:icmpne          219
				asamplestream[i] = ((SampleStream) (new EmptySampleStream()));
	//  108  205:aload_2         
	//  109  206:iload           7
	//  110  208:new             #433 <Class EmptySampleStream>
	//  111  211:dup             
	//  112  212:invokespecial   #450 <Method void EmptySampleStream()>
	//  113  215:aastore         
			else
	//* 114  216:goto            239
				asamplestream[i] = ((SampleStream) (((ChunkSampleStream)asamplestream[k]).selectEmbeddedTrack(l, ((TrackGroupInfo) (aflag)).trackType)));
	//  115  219:aload_2         
	//  116  220:iload           7
	//  117  222:aload_2         
	//  118  223:iload           8
	//  119  225:aaload          
	//  120  226:checkcast       #297 <Class ChunkSampleStream>
	//  121  229:lload           4
	//  122  231:aload_3         
	//  123  232:getfield        #289 <Field int DashMediaPeriod$TrackGroupInfo.trackType>
	//  124  235:invokevirtual   #454 <Method com.google.android.exoplayer2.source.chunk.ChunkSampleStream$EmbeddedSampleStream ChunkSampleStream.selectEmbeddedTrack(long, int)>
	//  125  238:aastore         
		}

	//  126  239:iload           7
	//  127  241:iconst_1        
	//  128  242:iadd            
	//  129  243:istore          7
	//* 130  245:goto            145
	//  131  248:return          
	}

	public boolean continueLoading(long l)
	{
		return compositeSequenceableLoader.continueLoading(l);
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field SequenceableLoader compositeSequenceableLoader>
	//    2    4:lload_1         
	//    3    5:invokeinterface #460 <Method boolean SequenceableLoader.continueLoading(long)>
	//    4   10:ireturn         
	}

	public void discardBuffer(long l, boolean flag)
	{
		ChunkSampleStream achunksamplestream[] = sampleStreams;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field ChunkSampleStream[] sampleStreams>
	//    2    4:astore          6
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore          4
		for(int j = achunksamplestream.length; i < j; i++)
	//*   5    9:aload           6
	//*   6   11:arraylength     
	//*   7   12:istore          5
	//*   8   14:iload           4
	//*   9   16:iload           5
	//*  10   18:icmpge          40
			achunksamplestream[i].discardBuffer(l, flag);
	//   11   21:aload           6
	//   12   23:iload           4
	//   13   25:aaload          
	//   14   26:lload_1         
	//   15   27:iload_3         
	//   16   28:invokevirtual   #464 <Method void ChunkSampleStream.discardBuffer(long, boolean)>

	//   17   31:iload           4
	//   18   33:iconst_1        
	//   19   34:iadd            
	//   20   35:istore          4
	//*  21   37:goto            14
	//   22   40:return          
	}

	public long getAdjustedSeekPositionUs(long l, SeekParameters seekparameters)
	{
		ChunkSampleStream achunksamplestream[] = sampleStreams;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field ChunkSampleStream[] sampleStreams>
	//    2    4:astore          6
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore          4
		for(int j = achunksamplestream.length; i < j; i++)
	//*   5    9:aload           6
	//*   6   11:arraylength     
	//*   7   12:istore          5
	//*   8   14:iload           4
	//*   9   16:iload           5
	//*  10   18:icmpge          54
		{
			ChunkSampleStream chunksamplestream = achunksamplestream[i];
	//   11   21:aload           6
	//   12   23:iload           4
	//   13   25:aaload          
	//   14   26:astore          7
			if(chunksamplestream.primaryTrackType == 2)
	//*  15   28:aload           7
	//*  16   30:getfield        #469 <Field int ChunkSampleStream.primaryTrackType>
	//*  17   33:iconst_2        
	//*  18   34:icmpne          45
				return chunksamplestream.getAdjustedSeekPositionUs(l, seekparameters);
	//   19   37:aload           7
	//   20   39:lload_1         
	//   21   40:aload_3         
	//   22   41:invokevirtual   #471 <Method long ChunkSampleStream.getAdjustedSeekPositionUs(long, SeekParameters)>
	//   23   44:lreturn         
		}

	//   24   45:iload           4
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore          4
	//*  28   51:goto            14
		return l;
	//   29   54:lload_1         
	//   30   55:lreturn         
	}

	public long getBufferedPositionUs()
	{
		return compositeSequenceableLoader.getBufferedPositionUs();
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field SequenceableLoader compositeSequenceableLoader>
	//    2    4:invokeinterface #475 <Method long SequenceableLoader.getBufferedPositionUs()>
	//    3    9:lreturn         
	}

	public long getNextLoadPositionUs()
	{
		return compositeSequenceableLoader.getNextLoadPositionUs();
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field SequenceableLoader compositeSequenceableLoader>
	//    2    4:invokeinterface #478 <Method long SequenceableLoader.getNextLoadPositionUs()>
	//    3    9:lreturn         
	}

	public TrackGroupArray getTrackGroups()
	{
		return trackGroups;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field TrackGroupArray trackGroups>
	//    2    4:areturn         
	}

	public void maybeThrowPrepareError()
		throws IOException
	{
		manifestLoaderErrorThrower.maybeThrowError();
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field LoaderErrorThrower manifestLoaderErrorThrower>
	//    2    4:invokeinterface #488 <Method void LoaderErrorThrower.maybeThrowError()>
	//    3    9:return          
	}

	public volatile void onContinueLoadingRequested(SequenceableLoader sequenceableloader)
	{
		onContinueLoadingRequested((ChunkSampleStream)sequenceableloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #297 <Class ChunkSampleStream>
	//    3    5:invokevirtual   #494 <Method void onContinueLoadingRequested(ChunkSampleStream)>
	//    4    8:return          
	}

	public void onContinueLoadingRequested(ChunkSampleStream chunksamplestream)
	{
		callback.onContinueLoadingRequested(((SequenceableLoader) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #496 <Field com.google.android.exoplayer2.source.MediaPeriod$Callback callback>
	//    2    4:aload_0         
	//    3    5:invokeinterface #500 <Method void com.google.android.exoplayer2.source.MediaPeriod$Callback.onContinueLoadingRequested(SequenceableLoader)>
	//    4   10:return          
	}

	public void onSampleStreamReleased(ChunkSampleStream chunksamplestream)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		chunksamplestream = ((ChunkSampleStream) ((PlayerEmsgHandler.PlayerTrackEmsgHandler)trackEmsgHandlerBySampleStream.remove(((Object) (chunksamplestream)))));
	//    2    2:aload_0         
	//    3    3:getfield        #106 <Field IdentityHashMap trackEmsgHandlerBySampleStream>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #506 <Method Object IdentityHashMap.remove(Object)>
	//    6   10:checkcast       #508 <Class PlayerEmsgHandler$PlayerTrackEmsgHandler>
	//    7   13:astore_1        
		if(chunksamplestream == null)
			break MISSING_BLOCK_LABEL_22;
	//    8   14:aload_1         
	//    9   15:ifnull          22
		((PlayerEmsgHandler.PlayerTrackEmsgHandler) (chunksamplestream)).release();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #509 <Method void PlayerEmsgHandler$PlayerTrackEmsgHandler.release()>
		this;
	//   12   22:aload_0         
		JVM INSTR monitorexit ;
	//   13   23:monitorexit     
		return;
	//   14   24:return          
		chunksamplestream;
	//   15   25:astore_1        
	//*  16   26:aload_0         
		throw chunksamplestream;
	//   17   27:monitorexit     
	//   18   28:aload_1         
	//   19   29:athrow          
	}

	public void prepare(com.google.android.exoplayer2.source.MediaPeriod.Callback callback1, long l)
	{
		callback = callback1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #496 <Field com.google.android.exoplayer2.source.MediaPeriod$Callback callback>
		callback1.onPrepared(((MediaPeriod) (this)));
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokeinterface #515 <Method void com.google.android.exoplayer2.source.MediaPeriod$Callback.onPrepared(MediaPeriod)>
	//    6   12:return          
	}

	public long readDiscontinuity()
	{
		if(!notifiedReadingStarted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #518 <Field boolean notifiedReadingStarted>
	//*   2    4:ifne            19
		{
			eventDispatcher.readingStarted();
	//    3    7:aload_0         
	//    4    8:getfield        #76  <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    5   11:invokevirtual   #521 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.readingStarted()>
			notifiedReadingStarted = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #518 <Field boolean notifiedReadingStarted>
		}
		return 0x1L;
	//    9   19:ldc2w           #522 <Long 0x1L>
	//   10   22:lreturn         
	}

	public void reevaluateBuffer(long l)
	{
		compositeSequenceableLoader.reevaluateBuffer(l);
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field SequenceableLoader compositeSequenceableLoader>
	//    2    4:lload_1         
	//    3    5:invokeinterface #527 <Method void SequenceableLoader.reevaluateBuffer(long)>
	//    4   10:return          
	}

	public void release()
	{
		playerEmsgHandler.release();
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field PlayerEmsgHandler playerEmsgHandler>
	//    2    4:invokevirtual   #528 <Method void PlayerEmsgHandler.release()>
		ChunkSampleStream achunksamplestream[] = sampleStreams;
	//    3    7:aload_0         
	//    4    8:getfield        #97  <Field ChunkSampleStream[] sampleStreams>
	//    5   11:astore_3        
		int i = 0;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		for(int j = achunksamplestream.length; i < j; i++)
	//*   8   14:aload_3         
	//*   9   15:arraylength     
	//*  10   16:istore_2        
	//*  11   17:iload_1         
	//*  12   18:iload_2         
	//*  13   19:icmpge          36
			achunksamplestream[i].release(((com.google.android.exoplayer2.source.chunk.ChunkSampleStream.ReleaseCallback) (this)));
	//   14   22:aload_3         
	//   15   23:iload_1         
	//   16   24:aaload          
	//   17   25:aload_0         
	//   18   26:invokevirtual   #425 <Method void ChunkSampleStream.release(com.google.android.exoplayer2.source.chunk.ChunkSampleStream$ReleaseCallback)>

	//   19   29:iload_1         
	//   20   30:iconst_1        
	//   21   31:iadd            
	//   22   32:istore_1        
	//*  23   33:goto            17
		callback = null;
	//   24   36:aload_0         
	//   25   37:aconst_null     
	//   26   38:putfield        #496 <Field com.google.android.exoplayer2.source.MediaPeriod$Callback callback>
		eventDispatcher.mediaPeriodReleased();
	//   27   41:aload_0         
	//   28   42:getfield        #76  <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//   29   45:invokevirtual   #531 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.mediaPeriodReleased()>
	//   30   48:return          
	}

	public long seekToUs(long l)
	{
		Object aobj[] = ((Object []) (sampleStreams));
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field ChunkSampleStream[] sampleStreams>
	//    2    4:astore          6
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          4
		int k = aobj.length;
	//    5    9:aload           6
	//    6   11:arraylength     
	//    7   12:istore          5
		for(int i = 0; i < k; i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_3        
	//*  10   16:iload_3         
	//*  11   17:iload           5
	//*  12   19:icmpge          37
			aobj[i].seekToUs(l);
	//   13   22:aload           6
	//   14   24:iload_3         
	//   15   25:aaload          
	//   16   26:lload_1         
	//   17   27:invokevirtual   #535 <Method void ChunkSampleStream.seekToUs(long)>

	//   18   30:iload_3         
	//   19   31:iconst_1        
	//   20   32:iadd            
	//   21   33:istore_3        
	//*  22   34:goto            16
		aobj = ((Object []) (eventSampleStreams));
	//   23   37:aload_0         
	//   24   38:getfield        #101 <Field EventSampleStream[] eventSampleStreams>
	//   25   41:astore          6
		k = aobj.length;
	//   26   43:aload           6
	//   27   45:arraylength     
	//   28   46:istore          5
		for(int j = ((int) (flag)); j < k; j++)
	//*  29   48:iload           4
	//*  30   50:istore_3        
	//*  31   51:iload_3         
	//*  32   52:iload           5
	//*  33   54:icmpge          72
			aobj[j].seekToUs(l);
	//   34   57:aload           6
	//   35   59:iload_3         
	//   36   60:aaload          
	//   37   61:lload_1         
	//   38   62:invokevirtual   #536 <Method void EventSampleStream.seekToUs(long)>

	//   39   65:iload_3         
	//   40   66:iconst_1        
	//   41   67:iadd            
	//   42   68:istore_3        
	//*  43   69:goto            51
		return l;
	//   44   72:lload_1         
	//   45   73:lreturn         
	}

	public long selectTracks(TrackSelection atrackselection[], boolean aflag[], SampleStream asamplestream[], boolean aflag1[], long l)
	{
		int ai[] = getStreamIndexToTrackGroupIndex(atrackselection);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #540 <Method int[] getStreamIndexToTrackGroupIndex(TrackSelection[])>
	//    3    5:astore          9
		releaseDisabledStreams(atrackselection, aflag, asamplestream);
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:aload_2         
	//    7   10:aload_3         
	//    8   11:invokespecial   #542 <Method void releaseDisabledStreams(TrackSelection[], boolean[], SampleStream[])>
		releaseOrphanEmbeddedStreams(atrackselection, asamplestream, ai);
	//    9   14:aload_0         
	//   10   15:aload_1         
	//   11   16:aload_3         
	//   12   17:aload           9
	//   13   19:invokespecial   #544 <Method void releaseOrphanEmbeddedStreams(TrackSelection[], SampleStream[], int[])>
		selectNewStreams(atrackselection, asamplestream, aflag1, l, ai);
	//   14   22:aload_0         
	//   15   23:aload_1         
	//   16   24:aload_3         
	//   17   25:aload           4
	//   18   27:lload           5
	//   19   29:aload           9
	//   20   31:invokespecial   #546 <Method void selectNewStreams(TrackSelection[], SampleStream[], boolean[], long, int[])>
		atrackselection = ((TrackSelection []) (new ArrayList()));
	//   21   34:new             #194 <Class ArrayList>
	//   22   37:dup             
	//   23   38:invokespecial   #195 <Method void ArrayList()>
	//   24   41:astore_1        
		aflag = ((boolean []) (new ArrayList()));
	//   25   42:new             #194 <Class ArrayList>
	//   26   45:dup             
	//   27   46:invokespecial   #195 <Method void ArrayList()>
	//   28   49:astore_2        
		int i = 0;
	//   29   50:iconst_0        
	//   30   51:istore          7
		for(int j = asamplestream.length; i < j; i++)
	//*  31   53:aload_3         
	//*  32   54:arraylength     
	//*  33   55:istore          8
	//*  34   57:iload           7
	//*  35   59:iload           8
	//*  36   61:icmpge          118
		{
			aflag1 = ((boolean []) (asamplestream[i]));
	//   37   64:aload_3         
	//   38   65:iload           7
	//   39   67:aaload          
	//   40   68:astore          4
			if(aflag1 instanceof ChunkSampleStream)
	//*  41   70:aload           4
	//*  42   72:instanceof      #297 <Class ChunkSampleStream>
	//*  43   75:ifeq            91
			{
				((ArrayList) (atrackselection)).add(((Object) ((ChunkSampleStream)aflag1)));
	//   44   78:aload_1         
	//   45   79:aload           4
	//   46   81:checkcast       #297 <Class ChunkSampleStream>
	//   47   84:invokevirtual   #549 <Method boolean ArrayList.add(Object)>
	//   48   87:pop             
				continue;
	//   49   88:goto            109
			}
			if(aflag1 instanceof EventSampleStream)
	//*  50   91:aload           4
	//*  51   93:instanceof      #99  <Class EventSampleStream>
	//*  52   96:ifeq            109
				((ArrayList) (aflag)).add(((Object) ((EventSampleStream)aflag1)));
	//   53   99:aload_2         
	//   54  100:aload           4
	//   55  102:checkcast       #99  <Class EventSampleStream>
	//   56  105:invokevirtual   #549 <Method boolean ArrayList.add(Object)>
	//   57  108:pop             
		}

	//   58  109:iload           7
	//   59  111:iconst_1        
	//   60  112:iadd            
	//   61  113:istore          7
	//*  62  115:goto            57
		sampleStreams = newSampleStreamArray(((ArrayList) (atrackselection)).size());
	//   63  118:aload_0         
	//   64  119:aload_1         
	//   65  120:invokevirtual   #550 <Method int ArrayList.size()>
	//   66  123:invokestatic    #95  <Method ChunkSampleStream[] newSampleStreamArray(int)>
	//   67  126:putfield        #97  <Field ChunkSampleStream[] sampleStreams>
		((ArrayList) (atrackselection)).toArray(((Object []) (sampleStreams)));
	//   68  129:aload_1         
	//   69  130:aload_0         
	//   70  131:getfield        #97  <Field ChunkSampleStream[] sampleStreams>
	//   71  134:invokevirtual   #554 <Method Object[] ArrayList.toArray(Object[])>
	//   72  137:pop             
		eventSampleStreams = new EventSampleStream[((ArrayList) (aflag)).size()];
	//   73  138:aload_0         
	//   74  139:aload_2         
	//   75  140:invokevirtual   #550 <Method int ArrayList.size()>
	//   76  143:anewarray       EventSampleStream[]
	//   77  146:putfield        #101 <Field EventSampleStream[] eventSampleStreams>
		((ArrayList) (aflag)).toArray(((Object []) (eventSampleStreams)));
	//   78  149:aload_2         
	//   79  150:aload_0         
	//   80  151:getfield        #101 <Field EventSampleStream[] eventSampleStreams>
	//   81  154:invokevirtual   #554 <Method Object[] ArrayList.toArray(Object[])>
	//   82  157:pop             
		compositeSequenceableLoader = compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(((SequenceableLoader []) (sampleStreams)));
	//   83  158:aload_0         
	//   84  159:aload_0         
	//   85  160:getfield        #84  <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
	//   86  163:aload_0         
	//   87  164:getfield        #97  <Field ChunkSampleStream[] sampleStreams>
	//   88  167:invokeinterface #112 <Method SequenceableLoader CompositeSequenceableLoaderFactory.createCompositeSequenceableLoader(SequenceableLoader[])>
	//   89  172:putfield        #114 <Field SequenceableLoader compositeSequenceableLoader>
		return l;
	//   90  175:lload           5
	//   91  177:lreturn         
	}

	public void updateManifest(DashManifest dashmanifest, int i)
	{
		manifest = dashmanifest;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #68  <Field DashManifest manifest>
		if(periodIndex != i)
	//*   3    5:aload_0         
	//*   4    6:getfield        #70  <Field int periodIndex>
	//*   5    9:iload_2         
	//*   6   10:icmpeq          44
			eventDispatcher = eventDispatcher.withParameters(0, eventDispatcher.mediaPeriodId.copyWithPeriodIndex(i), dashmanifest.getPeriod(i).startMs);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #76  <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//   10   18:iconst_0        
	//   11   19:aload_0         
	//   12   20:getfield        #76  <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//   13   23:getfield        #560 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.mediaPeriodId>
	//   14   26:iload_2         
	//   15   27:invokevirtual   #566 <Method com.google.android.exoplayer2.source.MediaSource$MediaPeriodId com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.copyWithPeriodIndex(int)>
	//   16   30:aload_1         
	//   17   31:iload_2         
	//   18   32:invokevirtual   #120 <Method Period DashManifest.getPeriod(int)>
	//   19   35:getfield        #569 <Field long Period.startMs>
	//   20   38:invokevirtual   #573 <Method com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.withParameters(int, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long)>
	//   21   41:putfield        #76  <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
		periodIndex = i;
	//   22   44:aload_0         
	//   23   45:iload_2         
	//   24   46:putfield        #70  <Field int periodIndex>
		playerEmsgHandler.updateManifest(dashmanifest);
	//   25   49:aload_0         
	//   26   50:getfield        #91  <Field PlayerEmsgHandler playerEmsgHandler>
	//   27   53:aload_1         
	//   28   54:invokevirtual   #576 <Method void PlayerEmsgHandler.updateManifest(DashManifest)>
		if(sampleStreams != null)
	//*  29   57:aload_0         
	//*  30   58:getfield        #97  <Field ChunkSampleStream[] sampleStreams>
	//*  31   61:ifnull          117
		{
			ChunkSampleStream achunksamplestream[] = sampleStreams;
	//   32   64:aload_0         
	//   33   65:getfield        #97  <Field ChunkSampleStream[] sampleStreams>
	//   34   68:astore          7
			int l = achunksamplestream.length;
	//   35   70:aload           7
	//   36   72:arraylength     
	//   37   73:istore          4
			for(int j = 0; j < l; j++)
	//*  38   75:iconst_0        
	//*  39   76:istore_3        
	//*  40   77:iload_3         
	//*  41   78:iload           4
	//*  42   80:icmpge          107
				((DashChunkSource)achunksamplestream[j].getChunkSource()).updateManifest(dashmanifest, i);
	//   43   83:aload           7
	//   44   85:iload_3         
	//   45   86:aaload          
	//   46   87:invokevirtual   #580 <Method com.google.android.exoplayer2.source.chunk.ChunkSource ChunkSampleStream.getChunkSource()>
	//   47   90:checkcast       #582 <Class DashChunkSource>
	//   48   93:aload_1         
	//   49   94:iload_2         
	//   50   95:invokeinterface #584 <Method void DashChunkSource.updateManifest(DashManifest, int)>

	//   51  100:iload_3         
	//   52  101:iconst_1        
	//   53  102:iadd            
	//   54  103:istore_3        
	//*  55  104:goto            77
			callback.onContinueLoadingRequested(((SequenceableLoader) (this)));
	//   56  107:aload_0         
	//   57  108:getfield        #496 <Field com.google.android.exoplayer2.source.MediaPeriod$Callback callback>
	//   58  111:aload_0         
	//   59  112:invokeinterface #500 <Method void com.google.android.exoplayer2.source.MediaPeriod$Callback.onContinueLoadingRequested(SequenceableLoader)>
		}
		eventStreams = dashmanifest.getPeriod(i).eventStreams;
	//   60  117:aload_0         
	//   61  118:aload_1         
	//   62  119:iload_2         
	//   63  120:invokevirtual   #120 <Method Period DashManifest.getPeriod(int)>
	//   64  123:getfield        #124 <Field List Period.eventStreams>
	//   65  126:putfield        #125 <Field List eventStreams>
		EventSampleStream aeventsamplestream[] = eventSampleStreams;
	//   66  129:aload_0         
	//   67  130:getfield        #101 <Field EventSampleStream[] eventSampleStreams>
	//   68  133:astore          7
		int i1 = aeventsamplestream.length;
	//   69  135:aload           7
	//   70  137:arraylength     
	//   71  138:istore          4
label0:
		for(int k = 0; k < i1; k++)
	//*  72  140:iconst_0        
	//*  73  141:istore_3        
	//*  74  142:iload_3         
	//*  75  143:iload           4
	//*  76  145:icmpge          249
		{
			EventSampleStream eventsamplestream = aeventsamplestream[k];
	//   77  148:aload           7
	//   78  150:iload_3         
	//   79  151:aaload          
	//   80  152:astore          8
			Iterator iterator = eventStreams.iterator();
	//   81  154:aload_0         
	//   82  155:getfield        #125 <Field List eventStreams>
	//   83  158:invokeinterface #588 <Method Iterator List.iterator()>
	//   84  163:astore          9
			EventStream eventstream;
			do
			{
				if(!iterator.hasNext())
					continue label0;
	//   85  165:aload           9
	//   86  167:invokeinterface #593 <Method boolean Iterator.hasNext()>
	//   87  172:ifeq            242
				eventstream = (EventStream)iterator.next();
	//   88  175:aload           9
	//   89  177:invokeinterface #597 <Method Object Iterator.next()>
	//   90  182:checkcast       #172 <Class EventStream>
	//   91  185:astore          10
			} while(!eventstream.id().equals(((Object) (eventsamplestream.eventStreamId()))));
	//   92  187:aload           10
	//   93  189:invokevirtual   #175 <Method String EventStream.id()>
	//   94  192:aload           8
	//   95  194:invokevirtual   #600 <Method String EventSampleStream.eventStreamId()>
	//   96  197:invokevirtual   #341 <Method boolean String.equals(Object)>
	//   97  200:ifeq            165
			int j1 = dashmanifest.getPeriodCount();
	//   98  203:aload_1         
	//   99  204:invokevirtual   #603 <Method int DashManifest.getPeriodCount()>
	//  100  207:istore          5
			boolean flag = true;
	//  101  209:iconst_1        
	//  102  210:istore          6
			if(!dashmanifest.dynamic || i != j1 - 1)
	//* 103  212:aload_1         
	//* 104  213:getfield        #278 <Field boolean DashManifest.dynamic>
	//* 105  216:ifeq            230
	//* 106  219:iload_2         
	//* 107  220:iload           5
	//* 108  222:iconst_1        
	//* 109  223:isub            
	//* 110  224:icmpne          230
	//* 111  227:goto            233
				flag = false;
	//  112  230:iconst_0        
	//  113  231:istore          6
			eventsamplestream.updateEventStream(eventstream, flag);
	//  114  233:aload           8
	//  115  235:aload           10
	//  116  237:iload           6
	//  117  239:invokevirtual   #607 <Method void EventSampleStream.updateEventStream(EventStream, boolean)>
		}

	//  118  242:iload_3         
	//  119  243:iconst_1        
	//  120  244:iadd            
	//  121  245:istore_3        
	//* 122  246:goto            142
	//  123  249:return          
	}

	private final Allocator allocator;
	private com.google.android.exoplayer2.source.MediaPeriod.Callback callback;
	private final DashChunkSource.Factory chunkSourceFactory;
	private SequenceableLoader compositeSequenceableLoader;
	private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
	private final long elapsedRealtimeOffset;
	private com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher eventDispatcher;
	private EventSampleStream eventSampleStreams[];
	private List eventStreams;
	final int id;
	private DashManifest manifest;
	private final LoaderErrorThrower manifestLoaderErrorThrower;
	private final int minLoadableRetryCount;
	private boolean notifiedReadingStarted;
	private int periodIndex;
	private final PlayerEmsgHandler playerEmsgHandler;
	private ChunkSampleStream sampleStreams[];
	private final IdentityHashMap trackEmsgHandlerBySampleStream = new IdentityHashMap();
	private final TrackGroupInfo trackGroupInfos[];
	private final TrackGroupArray trackGroups;
}
