// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls;

import android.os.Handler;
import android.util.Log;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.*;
import com.google.android.exoplayer2.source.*;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.*;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.source.hls:
//			HlsChunkSource, HlsMediaChunk, HlsSampleStream

final class HlsSampleStreamWrapper
	implements com.google.android.exoplayer2.upstream.Loader.Callback, com.google.android.exoplayer2.upstream.Loader.ReleaseCallback, SequenceableLoader, ExtractorOutput, com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener
{
	public static interface Callback
		extends com.google.android.exoplayer2.source.SequenceableLoader.Callback
	{

		public abstract void onPlaylistRefreshRequired(com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl hlsurl);

		public abstract void onPrepared();
	}


	public HlsSampleStreamWrapper(int i, Callback callback1, HlsChunkSource hlschunksource, Allocator allocator1, long l, Format format, 
			int j, com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher eventdispatcher)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #104 <Method void Object()>
		trackType = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #106 <Field int trackType>
		callback = callback1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #108 <Field HlsSampleStreamWrapper$Callback callback>
		chunkSource = hlschunksource;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #110 <Field HlsChunkSource chunkSource>
		allocator = allocator1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #112 <Field Allocator allocator>
		muxedAudioFormat = format;
	//   14   25:aload_0         
	//   15   26:aload           7
	//   16   28:putfield        #114 <Field Format muxedAudioFormat>
		minLoadableRetryCount = j;
	//   17   31:aload_0         
	//   18   32:iload           8
	//   19   34:putfield        #116 <Field int minLoadableRetryCount>
		eventDispatcher = eventdispatcher;
	//   20   37:aload_0         
	//   21   38:aload           9
	//   22   40:putfield        #118 <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//   23   43:aload_0         
	//   24   44:new             #120 <Class Loader>
	//   25   47:dup             
	//   26   48:ldc1            #122 <String "Loader:HlsSampleStreamWrapper">
	//   27   50:invokespecial   #125 <Method void Loader(String)>
	//   28   53:putfield        #127 <Field Loader loader>
	//   29   56:aload_0         
	//   30   57:new             #129 <Class HlsChunkSource$HlsChunkHolder>
	//   31   60:dup             
	//   32   61:invokespecial   #130 <Method void HlsChunkSource$HlsChunkHolder()>
	//   33   64:putfield        #132 <Field HlsChunkSource$HlsChunkHolder nextChunkHolder>
		sampleQueueTrackIds = new int[0];
	//   34   67:aload_0         
	//   35   68:iconst_0        
	//   36   69:newarray        int[]
	//   37   71:putfield        #134 <Field int[] sampleQueueTrackIds>
		audioSampleQueueIndex = -1;
	//   38   74:aload_0         
	//   39   75:iconst_m1       
	//   40   76:putfield        #136 <Field int audioSampleQueueIndex>
		videoSampleQueueIndex = -1;
	//   41   79:aload_0         
	//   42   80:iconst_m1       
	//   43   81:putfield        #138 <Field int videoSampleQueueIndex>
		sampleQueues = new SampleQueue[0];
	//   44   84:aload_0         
	//   45   85:iconst_0        
	//   46   86:anewarray       SampleQueue[]
	//   47   89:putfield        #142 <Field SampleQueue[] sampleQueues>
		sampleQueueIsAudioVideoFlags = new boolean[0];
	//   48   92:aload_0         
	//   49   93:iconst_0        
	//   50   94:newarray        boolean[]
	//   51   96:putfield        #144 <Field boolean[] sampleQueueIsAudioVideoFlags>
		sampleQueuesEnabledStates = new boolean[0];
	//   52   99:aload_0         
	//   53  100:iconst_0        
	//   54  101:newarray        boolean[]
	//   55  103:putfield        #146 <Field boolean[] sampleQueuesEnabledStates>
	//   56  106:aload_0         
	//   57  107:new             #148 <Class ArrayList>
	//   58  110:dup             
	//   59  111:invokespecial   #149 <Method void ArrayList()>
	//   60  114:putfield        #151 <Field ArrayList mediaChunks>
	//   61  117:aload_0         
	//   62  118:new             #148 <Class ArrayList>
	//   63  121:dup             
	//   64  122:invokespecial   #149 <Method void ArrayList()>
	//   65  125:putfield        #153 <Field ArrayList hlsSampleStreams>
	//   66  128:aload_0         
	//   67  129:new             #17  <Class HlsSampleStreamWrapper$1>
	//   68  132:dup             
	//   69  133:aload_0         
	//   70  134:invokespecial   #156 <Method void HlsSampleStreamWrapper$1(HlsSampleStreamWrapper)>
	//   71  137:putfield        #158 <Field Runnable maybeFinishPrepareRunnable>
	//   72  140:aload_0         
	//   73  141:new             #19  <Class HlsSampleStreamWrapper$2>
	//   74  144:dup             
	//   75  145:aload_0         
	//   76  146:invokespecial   #159 <Method void HlsSampleStreamWrapper$2(HlsSampleStreamWrapper)>
	//   77  149:putfield        #161 <Field Runnable onTracksEndedRunnable>
	//   78  152:aload_0         
	//   79  153:new             #163 <Class Handler>
	//   80  156:dup             
	//   81  157:invokespecial   #164 <Method void Handler()>
	//   82  160:putfield        #166 <Field Handler handler>
		lastSeekPositionUs = l;
	//   83  163:aload_0         
	//   84  164:lload           5
	//   85  166:putfield        #168 <Field long lastSeekPositionUs>
		pendingResetPositionUs = l;
	//   86  169:aload_0         
	//   87  170:lload           5
	//   88  172:putfield        #170 <Field long pendingResetPositionUs>
	//   89  175:return          
	}

	private void buildTracksFromSampleStreams()
	{
		SampleQueue asamplequeue[] = sampleQueues;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field SampleQueue[] sampleQueues>
	//    2    4:astore          9
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          8
		int j2 = asamplequeue.length;
	//    5    9:aload           9
	//    6   11:arraylength     
	//    7   12:istore          7
		int l1 = -1;
	//    8   14:iconst_m1       
	//    9   15:istore          5
		int k = 0;
	//   10   17:iconst_0        
	//   11   18:istore_2        
		int k1 = k;
	//   12   19:iload_2         
	//   13   20:istore          4
		do
		{
			byte byte0 = 3;
	//   14   22:iconst_3        
	//   15   23:istore_1        
			if(k >= j2)
				break;
	//   16   24:iload_2         
	//   17   25:iload           7
	//   18   27:icmpge          143
			String s = sampleQueues[k].getUpstreamFormat().sampleMimeType;
	//   19   30:aload_0         
	//   20   31:getfield        #142 <Field SampleQueue[] sampleQueues>
	//   21   34:iload_2         
	//   22   35:aaload          
	//   23   36:invokevirtual   #184 <Method Format SampleQueue.getUpstreamFormat()>
	//   24   39:getfield        #189 <Field String Format.sampleMimeType>
	//   25   42:astore          9
			if(!MimeTypes.isVideo(s))
	//*  26   44:aload           9
	//*  27   46:invokestatic    #195 <Method boolean MimeTypes.isVideo(String)>
	//*  28   49:ifeq            55
	//*  29   52:goto            83
				if(MimeTypes.isAudio(s))
	//*  30   55:aload           9
	//*  31   57:invokestatic    #198 <Method boolean MimeTypes.isAudio(String)>
	//*  32   60:ifeq            68
					byte0 = 2;
	//   33   63:iconst_2        
	//   34   64:istore_1        
				else
	//*  35   65:goto            83
				if(MimeTypes.isText(s))
	//*  36   68:aload           9
	//*  37   70:invokestatic    #201 <Method boolean MimeTypes.isText(String)>
	//*  38   73:ifeq            81
					byte0 = 1;
	//   39   76:iconst_1        
	//   40   77:istore_1        
				else
	//*  41   78:goto            83
					byte0 = 0;
	//   42   81:iconst_0        
	//   43   82:istore_1        
			int i1;
			int i2;
			if(byte0 > k1)
	//*  44   83:iload_1         
	//*  45   84:iload           4
	//*  46   86:icmple          97
			{
				i1 = k;
	//   47   89:iload_2         
	//   48   90:istore_3        
				i2 = ((int) (byte0));
	//   49   91:iload_1         
	//   50   92:istore          6
			} else
	//*  51   94:goto            129
			{
				i2 = k1;
	//   52   97:iload           4
	//   53   99:istore          6
				i1 = l1;
	//   54  101:iload           5
	//   55  103:istore_3        
				if(byte0 == k1)
	//*  56  104:iload_1         
	//*  57  105:iload           4
	//*  58  107:icmpne          129
				{
					i2 = k1;
	//   59  110:iload           4
	//   60  112:istore          6
					i1 = l1;
	//   61  114:iload           5
	//   62  116:istore_3        
					if(l1 != -1)
	//*  63  117:iload           5
	//*  64  119:iconst_m1       
	//*  65  120:icmpeq          129
					{
						i1 = -1;
	//   66  123:iconst_m1       
	//   67  124:istore_3        
						i2 = k1;
	//   68  125:iload           4
	//   69  127:istore          6
					}
				}
			}
			k++;
	//   70  129:iload_2         
	//   71  130:iconst_1        
	//   72  131:iadd            
	//   73  132:istore_2        
			k1 = i2;
	//   74  133:iload           6
	//   75  135:istore          4
			l1 = i1;
	//   76  137:iload_3         
	//   77  138:istore          5
		} while(true);
	//   78  140:goto            22
		TrackGroup trackgroup = chunkSource.getTrackGroup();
	//   79  143:aload_0         
	//   80  144:getfield        #110 <Field HlsChunkSource chunkSource>
	//   81  147:invokevirtual   #207 <Method TrackGroup HlsChunkSource.getTrackGroup()>
	//   82  150:astore          10
		int j1 = trackgroup.length;
	//   83  152:aload           10
	//   84  154:getfield        #212 <Field int TrackGroup.length>
	//   85  157:istore_3        
		primaryTrackGroupIndex = -1;
	//   86  158:aload_0         
	//   87  159:iconst_m1       
	//   88  160:putfield        #214 <Field int primaryTrackGroupIndex>
		trackGroupToSampleQueueIndex = new int[j2];
	//   89  163:aload_0         
	//   90  164:iload           7
	//   91  166:newarray        int[]
	//   92  168:putfield        #216 <Field int[] trackGroupToSampleQueueIndex>
		for(int i = 0; i < j2; i++)
	//*  93  171:iconst_0        
	//*  94  172:istore_1        
	//*  95  173:iload_1         
	//*  96  174:iload           7
	//*  97  176:icmpge          193
			trackGroupToSampleQueueIndex[i] = i;
	//   98  179:aload_0         
	//   99  180:getfield        #216 <Field int[] trackGroupToSampleQueueIndex>
	//  100  183:iload_1         
	//  101  184:iload_1         
	//  102  185:iastore         

	//  103  186:iload_1         
	//  104  187:iconst_1        
	//  105  188:iadd            
	//  106  189:istore_1        
	//* 107  190:goto            173
		TrackGroup atrackgroup[] = new TrackGroup[j2];
	//  108  193:iload           7
	//  109  195:anewarray       TrackGroup[]
	//  110  198:astore          11
		for(int j = 0; j < j2; j++)
	//* 111  200:iconst_0        
	//* 112  201:istore_1        
	//* 113  202:iload_1         
	//* 114  203:iload           7
	//* 115  205:icmpge          344
		{
			Format format1 = sampleQueues[j].getUpstreamFormat();
	//  116  208:aload_0         
	//  117  209:getfield        #142 <Field SampleQueue[] sampleQueues>
	//  118  212:iload_1         
	//  119  213:aaload          
	//  120  214:invokevirtual   #184 <Method Format SampleQueue.getUpstreamFormat()>
	//  121  217:astore          12
			if(j == l1)
	//* 122  219:iload_1         
	//* 123  220:iload           5
	//* 124  222:icmpne          282
			{
				Format aformat[] = new Format[j1];
	//  125  225:iload_3         
	//  126  226:anewarray       Format[]
	//  127  229:astore          9
				for(int l = 0; l < j1; l++)
	//* 128  231:iconst_0        
	//* 129  232:istore_2        
	//* 130  233:iload_2         
	//* 131  234:iload_3         
	//* 132  235:icmpge          261
					aformat[l] = deriveFormat(trackgroup.getFormat(l), format1, true);
	//  133  238:aload           9
	//  134  240:iload_2         
	//  135  241:aload           10
	//  136  243:iload_2         
	//  137  244:invokevirtual   #220 <Method Format TrackGroup.getFormat(int)>
	//  138  247:aload           12
	//  139  249:iconst_1        
	//  140  250:invokestatic    #224 <Method Format deriveFormat(Format, Format, boolean)>
	//  141  253:aastore         

	//  142  254:iload_2         
	//  143  255:iconst_1        
	//  144  256:iadd            
	//  145  257:istore_2        
	//* 146  258:goto            233
				atrackgroup[j] = new TrackGroup(aformat);
	//  147  261:aload           11
	//  148  263:iload_1         
	//  149  264:new             #209 <Class TrackGroup>
	//  150  267:dup             
	//  151  268:aload           9
	//  152  270:invokespecial   #227 <Method void TrackGroup(Format[])>
	//  153  273:aastore         
				primaryTrackGroupIndex = j;
	//  154  274:aload_0         
	//  155  275:iload_1         
	//  156  276:putfield        #214 <Field int primaryTrackGroupIndex>
				continue;
	//  157  279:goto            337
			}
			Format format;
			if(k1 == 3 && MimeTypes.isAudio(format1.sampleMimeType))
	//* 158  282:iload           4
	//* 159  284:iconst_3        
	//* 160  285:icmpne          308
	//* 161  288:aload           12
	//* 162  290:getfield        #189 <Field String Format.sampleMimeType>
	//* 163  293:invokestatic    #198 <Method boolean MimeTypes.isAudio(String)>
	//* 164  296:ifeq            308
				format = muxedAudioFormat;
	//  165  299:aload_0         
	//  166  300:getfield        #114 <Field Format muxedAudioFormat>
	//  167  303:astore          9
			else
	//* 168  305:goto            311
				format = null;
	//  169  308:aconst_null     
	//  170  309:astore          9
			atrackgroup[j] = new TrackGroup(new Format[] {
				deriveFormat(format, format1, false)
			});
	//  171  311:aload           11
	//  172  313:iload_1         
	//  173  314:new             #209 <Class TrackGroup>
	//  174  317:dup             
	//  175  318:iconst_1        
	//  176  319:anewarray       Format[]
	//  177  322:dup             
	//  178  323:iconst_0        
	//  179  324:aload           9
	//  180  326:aload           12
	//  181  328:iconst_0        
	//  182  329:invokestatic    #224 <Method Format deriveFormat(Format, Format, boolean)>
	//  183  332:aastore         
	//  184  333:invokespecial   #227 <Method void TrackGroup(Format[])>
	//  185  336:aastore         
		}

	//  186  337:iload_1         
	//  187  338:iconst_1        
	//  188  339:iadd            
	//  189  340:istore_1        
	//* 190  341:goto            202
		trackGroups = new TrackGroupArray(atrackgroup);
	//  191  344:aload_0         
	//  192  345:new             #229 <Class TrackGroupArray>
	//  193  348:dup             
	//  194  349:aload           11
	//  195  351:invokespecial   #232 <Method void TrackGroupArray(TrackGroup[])>
	//  196  354:putfield        #234 <Field TrackGroupArray trackGroups>
		if(optionalTrackGroups == null)
	//* 197  357:aload_0         
	//* 198  358:getfield        #236 <Field TrackGroupArray optionalTrackGroups>
	//* 199  361:ifnonnull       367
			flag = true;
	//  200  364:iconst_1        
	//  201  365:istore          8
		Assertions.checkState(flag);
	//  202  367:iload           8
	//  203  369:invokestatic    #242 <Method void Assertions.checkState(boolean)>
		optionalTrackGroups = TrackGroupArray.EMPTY;
	//  204  372:aload_0         
	//  205  373:getstatic       #245 <Field TrackGroupArray TrackGroupArray.EMPTY>
	//  206  376:putfield        #236 <Field TrackGroupArray optionalTrackGroups>
	//  207  379:return          
	}

	private static DummyTrackOutput createDummyTrackOutput(int i, int j)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #249 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #250 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Unmapped track with id ");
	//    4    8:aload_2         
	//    5    9:ldc1            #252 <String "Unmapped track with id ">
	//    6   11:invokevirtual   #256 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(i);
	//    8   15:aload_2         
	//    9   16:iload_0         
	//   10   17:invokevirtual   #259 <Method StringBuilder StringBuilder.append(int)>
	//   11   20:pop             
		stringbuilder.append(" of type ");
	//   12   21:aload_2         
	//   13   22:ldc2            #261 <String " of type ">
	//   14   25:invokevirtual   #256 <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
		stringbuilder.append(j);
	//   16   29:aload_2         
	//   17   30:iload_1         
	//   18   31:invokevirtual   #259 <Method StringBuilder StringBuilder.append(int)>
	//   19   34:pop             
		Log.w("HlsSampleStreamWrapper", stringbuilder.toString());
	//   20   35:ldc1            #41  <String "HlsSampleStreamWrapper">
	//   21   37:aload_2         
	//   22   38:invokevirtual   #265 <Method String StringBuilder.toString()>
	//   23   41:invokestatic    #271 <Method int Log.w(String, String)>
	//   24   44:pop             
		return new DummyTrackOutput();
	//   25   45:new             #273 <Class DummyTrackOutput>
	//   26   48:dup             
	//   27   49:invokespecial   #274 <Method void DummyTrackOutput()>
	//   28   52:areturn         
	}

	private static Format deriveFormat(Format format, Format format1, boolean flag)
	{
		if(format == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return format1;
	//    2    4:aload_1         
	//    3    5:areturn         
		int i;
		if(flag)
	//*   4    6:iload_2         
	//*   5    7:ifeq            18
			i = format.bitrate;
	//    6   10:aload_0         
	//    7   11:getfield        #277 <Field int Format.bitrate>
	//    8   14:istore_3        
		else
	//*   9   15:goto            23
			i = -1;
	//   10   18:iconst_m1       
	//   11   19:istore_3        
	//*  12   20:goto            15
		int j = MimeTypes.getTrackType(format1.sampleMimeType);
	//   13   23:aload_1         
	//   14   24:getfield        #189 <Field String Format.sampleMimeType>
	//   15   27:invokestatic    #281 <Method int MimeTypes.getTrackType(String)>
	//   16   30:istore          4
		String s2 = Util.getCodecsOfType(format.codecs, j);
	//   17   32:aload_0         
	//   18   33:getfield        #284 <Field String Format.codecs>
	//   19   36:iload           4
	//   20   38:invokestatic    #290 <Method String Util.getCodecsOfType(String, int)>
	//   21   41:astore          7
		String s1 = MimeTypes.getMediaMimeType(s2);
	//   22   43:aload           7
	//   23   45:invokestatic    #294 <Method String MimeTypes.getMediaMimeType(String)>
	//   24   48:astore          6
		String s = s1;
	//   25   50:aload           6
	//   26   52:astore          5
		if(s1 == null)
	//*  27   54:aload           6
	//*  28   56:ifnonnull       65
			s = format1.sampleMimeType;
	//   29   59:aload_1         
	//   30   60:getfield        #189 <Field String Format.sampleMimeType>
	//   31   63:astore          5
		return format1.copyWithContainerInfo(format.id, s, s2, i, format.width, format.height, format.selectionFlags, format.language);
	//   32   65:aload_1         
	//   33   66:aload_0         
	//   34   67:getfield        #297 <Field String Format.id>
	//   35   70:aload           5
	//   36   72:aload           7
	//   37   74:iload_3         
	//   38   75:aload_0         
	//   39   76:getfield        #300 <Field int Format.width>
	//   40   79:aload_0         
	//   41   80:getfield        #303 <Field int Format.height>
	//   42   83:aload_0         
	//   43   84:getfield        #306 <Field int Format.selectionFlags>
	//   44   87:aload_0         
	//   45   88:getfield        #309 <Field String Format.language>
	//   46   91:invokevirtual   #313 <Method Format Format.copyWithContainerInfo(String, String, String, int, int, int, int, String)>
	//   47   94:areturn         
	}

	private boolean finishedReadingChunk(HlsMediaChunk hlsmediachunk)
	{
		int j = hlsmediachunk.uid;
	//    0    0:aload_1         
	//    1    1:getfield        #320 <Field int HlsMediaChunk.uid>
	//    2    4:istore_3        
		int k = sampleQueues.length;
	//    3    5:aload_0         
	//    4    6:getfield        #142 <Field SampleQueue[] sampleQueues>
	//    5    9:arraylength     
	//    6   10:istore          4
		for(int i = 0; i < k; i++)
	//*   7   12:iconst_0        
	//*   8   13:istore_2        
	//*   9   14:iload_2         
	//*  10   15:iload           4
	//*  11   17:icmpge          51
			if(sampleQueuesEnabledStates[i] && sampleQueues[i].peekSourceId() == j)
	//*  12   20:aload_0         
	//*  13   21:getfield        #146 <Field boolean[] sampleQueuesEnabledStates>
	//*  14   24:iload_2         
	//*  15   25:baload          
	//*  16   26:ifeq            44
	//*  17   29:aload_0         
	//*  18   30:getfield        #142 <Field SampleQueue[] sampleQueues>
	//*  19   33:iload_2         
	//*  20   34:aaload          
	//*  21   35:invokevirtual   #324 <Method int SampleQueue.peekSourceId()>
	//*  22   38:iload_3         
	//*  23   39:icmpne          44
				return false;
	//   24   42:iconst_0        
	//   25   43:ireturn         

	//   26   44:iload_2         
	//   27   45:iconst_1        
	//   28   46:iadd            
	//   29   47:istore_2        
	//*  30   48:goto            14
		return true;
	//   31   51:iconst_1        
	//   32   52:ireturn         
	}

	private static boolean formatsMatch(Format format, Format format1)
	{
		String s = format.sampleMimeType;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field String Format.sampleMimeType>
	//    2    4:astore          5
		String s1 = format1.sampleMimeType;
	//    3    6:aload_1         
	//    4    7:getfield        #189 <Field String Format.sampleMimeType>
	//    5   10:astore          6
		int i = MimeTypes.getTrackType(s);
	//    6   12:aload           5
	//    7   14:invokestatic    #281 <Method int MimeTypes.getTrackType(String)>
	//    8   17:istore_2        
		boolean flag1 = false;
	//    9   18:iconst_0        
	//   10   19:istore          4
		boolean flag = false;
	//   11   21:iconst_0        
	//   12   22:istore_3        
		if(i != 3)
	//*  13   23:iload_2         
	//*  14   24:iconst_3        
	//*  15   25:icmpeq          41
		{
			if(i == MimeTypes.getTrackType(s1))
	//*  16   28:iload_2         
	//*  17   29:aload           6
	//*  18   31:invokestatic    #281 <Method int MimeTypes.getTrackType(String)>
	//*  19   34:icmpne          39
				flag = true;
	//   20   37:iconst_1        
	//   21   38:istore_3        
			return flag;
	//   22   39:iload_3         
	//   23   40:ireturn         
		}
		if(!Util.areEqual(((Object) (s)), ((Object) (s1))))
	//*  24   41:aload           5
	//*  25   43:aload           6
	//*  26   45:invokestatic    #330 <Method boolean Util.areEqual(Object, Object)>
	//*  27   48:ifne            53
			return false;
	//   28   51:iconst_0        
	//   29   52:ireturn         
		if(!"application/cea-608".equals(((Object) (s))) && !"application/cea-708".equals(((Object) (s))))
	//*  30   53:ldc2            #332 <String "application/cea-608">
	//*  31   56:aload           5
	//*  32   58:invokevirtual   #338 <Method boolean String.equals(Object)>
	//*  33   61:ifne            80
	//*  34   64:ldc2            #340 <String "application/cea-708">
	//*  35   67:aload           5
	//*  36   69:invokevirtual   #338 <Method boolean String.equals(Object)>
	//*  37   72:ifeq            78
	//*  38   75:goto            80
			return true;
	//   39   78:iconst_1        
	//   40   79:ireturn         
		flag = flag1;
	//   41   80:iload           4
	//   42   82:istore_3        
		if(format.accessibilityChannel == format1.accessibilityChannel)
	//*  43   83:aload_0         
	//*  44   84:getfield        #343 <Field int Format.accessibilityChannel>
	//*  45   87:aload_1         
	//*  46   88:getfield        #343 <Field int Format.accessibilityChannel>
	//*  47   91:icmpne          96
			flag = true;
	//   48   94:iconst_1        
	//   49   95:istore_3        
		return flag;
	//   50   96:iload_3         
	//   51   97:ireturn         
	}

	private HlsMediaChunk getLastMediaChunk()
	{
		return (HlsMediaChunk)mediaChunks.get(mediaChunks.size() - 1);
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field ArrayList mediaChunks>
	//    2    4:aload_0         
	//    3    5:getfield        #151 <Field ArrayList mediaChunks>
	//    4    8:invokevirtual   #348 <Method int ArrayList.size()>
	//    5   11:iconst_1        
	//    6   12:isub            
	//    7   13:invokevirtual   #352 <Method Object ArrayList.get(int)>
	//    8   16:checkcast       #317 <Class HlsMediaChunk>
	//    9   19:areturn         
	}

	private static boolean isMediaChunk(Chunk chunk)
	{
		return chunk instanceof HlsMediaChunk;
	//    0    0:aload_0         
	//    1    1:instanceof      #317 <Class HlsMediaChunk>
	//    2    4:ireturn         
	}

	private boolean isPendingReset()
	{
		return pendingResetPositionUs != 0x1L;
	//    0    0:aload_0         
	//    1    1:getfield        #170 <Field long pendingResetPositionUs>
	//    2    4:ldc2w           #357 <Long 0x1L>
	//    3    7:lcmp            
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private void mapSampleQueuesToMatchTrackGroups()
	{
		int k = trackGroups.length;
	//    0    0:aload_0         
	//    1    1:getfield        #234 <Field TrackGroupArray trackGroups>
	//    2    4:getfield        #360 <Field int TrackGroupArray.length>
	//    3    7:istore_3        
		trackGroupToSampleQueueIndex = new int[k];
	//    4    8:aload_0         
	//    5    9:iload_3         
	//    6   10:newarray        int[]
	//    7   12:putfield        #216 <Field int[] trackGroupToSampleQueueIndex>
		Arrays.fill(trackGroupToSampleQueueIndex, -1);
	//    8   15:aload_0         
	//    9   16:getfield        #216 <Field int[] trackGroupToSampleQueueIndex>
	//   10   19:iconst_m1       
	//   11   20:invokestatic    #366 <Method void Arrays.fill(int[], int)>
label0:
		for(int i = 0; i < k; i++)
	//*  12   23:iconst_0        
	//*  13   24:istore_1        
	//*  14   25:iload_1         
	//*  15   26:iload_3         
	//*  16   27:icmpge          92
		{
			int j = 0;
	//   17   30:iconst_0        
	//   18   31:istore_2        
			do
			{
				if(j >= sampleQueues.length)
					continue label0;
	//   19   32:iload_2         
	//   20   33:aload_0         
	//   21   34:getfield        #142 <Field SampleQueue[] sampleQueues>
	//   22   37:arraylength     
	//   23   38:icmpge          85
				if(formatsMatch(sampleQueues[j].getUpstreamFormat(), trackGroups.get(i).getFormat(0)))
	//*  24   41:aload_0         
	//*  25   42:getfield        #142 <Field SampleQueue[] sampleQueues>
	//*  26   45:iload_2         
	//*  27   46:aaload          
	//*  28   47:invokevirtual   #184 <Method Format SampleQueue.getUpstreamFormat()>
	//*  29   50:aload_0         
	//*  30   51:getfield        #234 <Field TrackGroupArray trackGroups>
	//*  31   54:iload_1         
	//*  32   55:invokevirtual   #369 <Method TrackGroup TrackGroupArray.get(int)>
	//*  33   58:iconst_0        
	//*  34   59:invokevirtual   #220 <Method Format TrackGroup.getFormat(int)>
	//*  35   62:invokestatic    #371 <Method boolean formatsMatch(Format, Format)>
	//*  36   65:ifeq            78
				{
					trackGroupToSampleQueueIndex[i] = j;
	//   37   68:aload_0         
	//   38   69:getfield        #216 <Field int[] trackGroupToSampleQueueIndex>
	//   39   72:iload_1         
	//   40   73:iload_2         
	//   41   74:iastore         
					continue label0;
	//   42   75:goto            85
				}
				j++;
	//   43   78:iload_2         
	//   44   79:iconst_1        
	//   45   80:iadd            
	//   46   81:istore_2        
			} while(true);
	//   47   82:goto            32
		}

	//   48   85:iload_1         
	//   49   86:iconst_1        
	//   50   87:iadd            
	//   51   88:istore_1        
	//*  52   89:goto            25
		for(Iterator iterator = hlsSampleStreams.iterator(); iterator.hasNext(); ((HlsSampleStream)iterator.next()).bindSampleQueue());
	//   53   92:aload_0         
	//   54   93:getfield        #153 <Field ArrayList hlsSampleStreams>
	//   55   96:invokevirtual   #375 <Method Iterator ArrayList.iterator()>
	//   56   99:astore          4
	//   57  101:aload           4
	//   58  103:invokeinterface #380 <Method boolean Iterator.hasNext()>
	//   59  108:ifeq            127
	//   60  111:aload           4
	//   61  113:invokeinterface #384 <Method Object Iterator.next()>
	//   62  118:checkcast       #386 <Class HlsSampleStream>
	//   63  121:invokevirtual   #389 <Method void HlsSampleStream.bindSampleQueue()>
	//*  64  124:goto            101
	//   65  127:return          
	}

	private void maybeFinishPrepare()
	{
		if(!released && trackGroupToSampleQueueIndex == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #391 <Field boolean released>
	//*   2    4:ifne            85
	//*   3    7:aload_0         
	//*   4    8:getfield        #216 <Field int[] trackGroupToSampleQueueIndex>
	//*   5   11:ifnonnull       85
		{
			if(!sampleQueuesBuilt)
	//*   6   14:aload_0         
	//*   7   15:getfield        #393 <Field boolean sampleQueuesBuilt>
	//*   8   18:ifne            22
				return;
	//    9   21:return          
			SampleQueue asamplequeue[] = sampleQueues;
	//   10   22:aload_0         
	//   11   23:getfield        #142 <Field SampleQueue[] sampleQueues>
	//   12   26:astore_3        
			int j = asamplequeue.length;
	//   13   27:aload_3         
	//   14   28:arraylength     
	//   15   29:istore_2        
			for(int i = 0; i < j; i++)
	//*  16   30:iconst_0        
	//*  17   31:istore_1        
	//*  18   32:iload_1         
	//*  19   33:iload_2         
	//*  20   34:icmpge          54
				if(asamplequeue[i].getUpstreamFormat() == null)
	//*  21   37:aload_3         
	//*  22   38:iload_1         
	//*  23   39:aaload          
	//*  24   40:invokevirtual   #184 <Method Format SampleQueue.getUpstreamFormat()>
	//*  25   43:ifnonnull       47
					return;
	//   26   46:return          

	//   27   47:iload_1         
	//   28   48:iconst_1        
	//   29   49:iadd            
	//   30   50:istore_1        
	//*  31   51:goto            32
			if(trackGroups != null)
	//*  32   54:aload_0         
	//*  33   55:getfield        #234 <Field TrackGroupArray trackGroups>
	//*  34   58:ifnull          66
			{
				mapSampleQueuesToMatchTrackGroups();
	//   35   61:aload_0         
	//   36   62:invokespecial   #395 <Method void mapSampleQueuesToMatchTrackGroups()>
				return;
	//   37   65:return          
			} else
			{
				buildTracksFromSampleStreams();
	//   38   66:aload_0         
	//   39   67:invokespecial   #397 <Method void buildTracksFromSampleStreams()>
				prepared = true;
	//   40   70:aload_0         
	//   41   71:iconst_1        
	//   42   72:putfield        #399 <Field boolean prepared>
				callback.onPrepared();
	//   43   75:aload_0         
	//   44   76:getfield        #108 <Field HlsSampleStreamWrapper$Callback callback>
	//   45   79:invokeinterface #402 <Method void HlsSampleStreamWrapper$Callback.onPrepared()>
				return;
	//   46   84:return          
			}
		} else
		{
			return;
	//   47   85:return          
		}
	}

	private void onTracksEnded()
	{
		sampleQueuesBuilt = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #393 <Field boolean sampleQueuesBuilt>
		maybeFinishPrepare();
	//    3    5:aload_0         
	//    4    6:invokespecial   #175 <Method void maybeFinishPrepare()>
	//    5    9:return          
	}

	private void resetSampleQueues()
	{
		SampleQueue asamplequeue[] = sampleQueues;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field SampleQueue[] sampleQueues>
	//    2    4:astore_3        
		int j = asamplequeue.length;
	//    3    5:aload_3         
	//    4    6:arraylength     
	//    5    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   6    8:iconst_0        
	//*   7    9:istore_1        
	//*   8   10:iload_1         
	//*   9   11:iload_2         
	//*  10   12:icmpge          32
			asamplequeue[i].reset(pendingResetUpstreamFormats);
	//   11   15:aload_3         
	//   12   16:iload_1         
	//   13   17:aaload          
	//   14   18:aload_0         
	//   15   19:getfield        #405 <Field boolean pendingResetUpstreamFormats>
	//   16   22:invokevirtual   #408 <Method void SampleQueue.reset(boolean)>

	//   17   25:iload_1         
	//   18   26:iconst_1        
	//   19   27:iadd            
	//   20   28:istore_1        
	//*  21   29:goto            10
		pendingResetUpstreamFormats = false;
	//   22   32:aload_0         
	//   23   33:iconst_0        
	//   24   34:putfield        #405 <Field boolean pendingResetUpstreamFormats>
	//   25   37:return          
	}

	private boolean seekInsideBufferUs(long l)
	{
		int j = sampleQueues.length;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field SampleQueue[] sampleQueues>
	//    2    4:arraylength     
	//    3    5:istore          5
		int i = 0;
	//    4    7:iconst_0        
	//    5    8:istore_3        
		do
		{
			boolean flag = true;
	//    6    9:iconst_1        
	//    7   10:istore          4
			if(i < j)
	//*   8   12:iload_3         
	//*   9   13:iload           5
	//*  10   15:icmpge          79
			{
				SampleQueue samplequeue = sampleQueues[i];
	//   11   18:aload_0         
	//   12   19:getfield        #142 <Field SampleQueue[] sampleQueues>
	//   13   22:iload_3         
	//   14   23:aaload          
	//   15   24:astore          6
				samplequeue.rewind();
	//   16   26:aload           6
	//   17   28:invokevirtual   #413 <Method void SampleQueue.rewind()>
				if(samplequeue.advanceTo(l, true, false) == -1)
	//*  18   31:aload           6
	//*  19   33:lload_1         
	//*  20   34:iconst_1        
	//*  21   35:iconst_0        
	//*  22   36:invokevirtual   #417 <Method int SampleQueue.advanceTo(long, boolean, boolean)>
	//*  23   39:iconst_m1       
	//*  24   40:icmpeq          46
	//*  25   43:goto            49
					flag = false;
	//   26   46:iconst_0        
	//   27   47:istore          4
				if(!flag && (sampleQueueIsAudioVideoFlags[i] || !haveAudioVideoSampleQueues))
	//*  28   49:iload           4
	//*  29   51:ifne            72
	//*  30   54:aload_0         
	//*  31   55:getfield        #144 <Field boolean[] sampleQueueIsAudioVideoFlags>
	//*  32   58:iload_3         
	//*  33   59:baload          
	//*  34   60:ifne            70
	//*  35   63:aload_0         
	//*  36   64:getfield        #419 <Field boolean haveAudioVideoSampleQueues>
	//*  37   67:ifne            72
					return false;
	//   38   70:iconst_0        
	//   39   71:ireturn         
				i++;
	//   40   72:iload_3         
	//   41   73:iconst_1        
	//   42   74:iadd            
	//   43   75:istore_3        
			} else
	//*  44   76:goto            9
			{
				return true;
	//   45   79:iconst_1        
	//   46   80:ireturn         
			}
		} while(true);
	}

	private void updateSampleStreams(SampleStream asamplestream[])
	{
		hlsSampleStreams.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field ArrayList hlsSampleStreams>
	//    2    4:invokevirtual   #424 <Method void ArrayList.clear()>
		int i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_2        
		for(int j = asamplestream.length; i < j; i++)
	//*   5    9:aload_1         
	//*   6   10:arraylength     
	//*   7   11:istore_3        
	//*   8   12:iload_2         
	//*   9   13:iload_3         
	//*  10   14:icmpge          47
		{
			SampleStream samplestream = asamplestream[i];
	//   11   17:aload_1         
	//   12   18:iload_2         
	//   13   19:aaload          
	//   14   20:astore          4
			if(samplestream != null)
	//*  15   22:aload           4
	//*  16   24:ifnull          40
				hlsSampleStreams.add(((Object) ((HlsSampleStream)samplestream)));
	//   17   27:aload_0         
	//   18   28:getfield        #153 <Field ArrayList hlsSampleStreams>
	//   19   31:aload           4
	//   20   33:checkcast       #386 <Class HlsSampleStream>
	//   21   36:invokevirtual   #427 <Method boolean ArrayList.add(Object)>
	//   22   39:pop             
		}

	//   23   40:iload_2         
	//   24   41:iconst_1        
	//   25   42:iadd            
	//   26   43:istore_2        
	//*  27   44:goto            12
	//   28   47:return          
	}

	public int bindSampleQueueToSampleStream(int i)
	{
		int j = trackGroupToSampleQueueIndex[i];
	//    0    0:aload_0         
	//    1    1:getfield        #216 <Field int[] trackGroupToSampleQueueIndex>
	//    2    4:iload_1         
	//    3    5:iaload          
	//    4    6:istore_2        
		if(j == -1)
	//*   5    7:iload_2         
	//*   6    8:iconst_m1       
	//*   7    9:icmpne          37
			return optionalTrackGroups.indexOf(trackGroups.get(i)) != -1 ? -3 : -2;
	//    8   12:aload_0         
	//    9   13:getfield        #236 <Field TrackGroupArray optionalTrackGroups>
	//   10   16:aload_0         
	//   11   17:getfield        #234 <Field TrackGroupArray trackGroups>
	//   12   20:iload_1         
	//   13   21:invokevirtual   #369 <Method TrackGroup TrackGroupArray.get(int)>
	//   14   24:invokevirtual   #433 <Method int TrackGroupArray.indexOf(TrackGroup)>
	//   15   27:iconst_m1       
	//   16   28:icmpne          34
	//   17   31:bipush          -2
	//   18   33:ireturn         
	//   19   34:bipush          -3
	//   20   36:ireturn         
		if(sampleQueuesEnabledStates[j])
	//*  21   37:aload_0         
	//*  22   38:getfield        #146 <Field boolean[] sampleQueuesEnabledStates>
	//*  23   41:iload_2         
	//*  24   42:baload          
	//*  25   43:ifeq            49
		{
			return -2;
	//   26   46:bipush          -2
	//   27   48:ireturn         
		} else
		{
			sampleQueuesEnabledStates[j] = true;
	//   28   49:aload_0         
	//   29   50:getfield        #146 <Field boolean[] sampleQueuesEnabledStates>
	//   30   53:iload_2         
	//   31   54:iconst_1        
	//   32   55:bastore         
			return j;
	//   33   56:iload_2         
	//   34   57:ireturn         
		}
	}

	public boolean continueLoading(long l)
	{
		if(!loadingFinished)
	//*   0    0:aload_0         
	//*   1    1:getfield        #436 <Field boolean loadingFinished>
	//*   2    4:ifne            245
		{
			if(loader.isLoading())
	//*   3    7:aload_0         
	//*   4    8:getfield        #127 <Field Loader loader>
	//*   5   11:invokevirtual   #439 <Method boolean Loader.isLoading()>
	//*   6   14:ifeq            19
				return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
			long l1;
			Object obj;
			if(isPendingReset())
	//*   9   19:aload_0         
	//*  10   20:invokespecial   #441 <Method boolean isPendingReset()>
	//*  11   23:ifeq            37
			{
				obj = null;
	//   12   26:aconst_null     
	//   13   27:astore          6
				l1 = pendingResetPositionUs;
	//   14   29:aload_0         
	//   15   30:getfield        #170 <Field long pendingResetPositionUs>
	//   16   33:lstore_3        
			} else
	//*  17   34:goto            52
			{
				obj = ((Object) (getLastMediaChunk()));
	//   18   37:aload_0         
	//   19   38:invokespecial   #443 <Method HlsMediaChunk getLastMediaChunk()>
	//   20   41:astore          6
				l1 = ((HlsMediaChunk) (obj)).endTimeUs;
	//   21   43:aload           6
	//   22   45:getfield        #446 <Field long HlsMediaChunk.endTimeUs>
	//   23   48:lstore_3        
			}
	//*  24   49:goto            34
			chunkSource.getNextChunk(((HlsMediaChunk) (obj)), l, l1, nextChunkHolder);
	//   25   52:aload_0         
	//   26   53:getfield        #110 <Field HlsChunkSource chunkSource>
	//   27   56:aload           6
	//   28   58:lload_1         
	//   29   59:lload_3         
	//   30   60:aload_0         
	//   31   61:getfield        #132 <Field HlsChunkSource$HlsChunkHolder nextChunkHolder>
	//   32   64:invokevirtual   #450 <Method void HlsChunkSource.getNextChunk(HlsMediaChunk, long, long, HlsChunkSource$HlsChunkHolder)>
			boolean flag = nextChunkHolder.endOfStream;
	//   33   67:aload_0         
	//   34   68:getfield        #132 <Field HlsChunkSource$HlsChunkHolder nextChunkHolder>
	//   35   71:getfield        #453 <Field boolean HlsChunkSource$HlsChunkHolder.endOfStream>
	//   36   74:istore          5
			obj = ((Object) (nextChunkHolder.chunk));
	//   37   76:aload_0         
	//   38   77:getfield        #132 <Field HlsChunkSource$HlsChunkHolder nextChunkHolder>
	//   39   80:getfield        #457 <Field Chunk HlsChunkSource$HlsChunkHolder.chunk>
	//   40   83:astore          6
			com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl hlsurl = nextChunkHolder.playlist;
	//   41   85:aload_0         
	//   42   86:getfield        #132 <Field HlsChunkSource$HlsChunkHolder nextChunkHolder>
	//   43   89:getfield        #461 <Field com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl HlsChunkSource$HlsChunkHolder.playlist>
	//   44   92:astore          7
			nextChunkHolder.clear();
	//   45   94:aload_0         
	//   46   95:getfield        #132 <Field HlsChunkSource$HlsChunkHolder nextChunkHolder>
	//   47   98:invokevirtual   #462 <Method void HlsChunkSource$HlsChunkHolder.clear()>
			if(flag)
	//*  48  101:iload           5
	//*  49  103:ifeq            120
			{
				pendingResetPositionUs = 0x1L;
	//   50  106:aload_0         
	//   51  107:ldc2w           #357 <Long 0x1L>
	//   52  110:putfield        #170 <Field long pendingResetPositionUs>
				loadingFinished = true;
	//   53  113:aload_0         
	//   54  114:iconst_1        
	//   55  115:putfield        #436 <Field boolean loadingFinished>
				return true;
	//   56  118:iconst_1        
	//   57  119:ireturn         
			}
			if(obj == null)
	//*  58  120:aload           6
	//*  59  122:ifnonnull       143
			{
				if(hlsurl != null)
	//*  60  125:aload           7
	//*  61  127:ifnull          141
					callback.onPlaylistRefreshRequired(hlsurl);
	//   62  130:aload_0         
	//   63  131:getfield        #108 <Field HlsSampleStreamWrapper$Callback callback>
	//   64  134:aload           7
	//   65  136:invokeinterface #466 <Method void HlsSampleStreamWrapper$Callback.onPlaylistRefreshRequired(com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl)>
				return false;
	//   66  141:iconst_0        
	//   67  142:ireturn         
			}
			if(isMediaChunk(((Chunk) (obj))))
	//*  68  143:aload           6
	//*  69  145:invokestatic    #468 <Method boolean isMediaChunk(Chunk)>
	//*  70  148:ifeq            181
			{
				pendingResetPositionUs = 0x1L;
	//   71  151:aload_0         
	//   72  152:ldc2w           #357 <Long 0x1L>
	//   73  155:putfield        #170 <Field long pendingResetPositionUs>
				HlsMediaChunk hlsmediachunk = (HlsMediaChunk)obj;
	//   74  158:aload           6
	//   75  160:checkcast       #317 <Class HlsMediaChunk>
	//   76  163:astore          7
				hlsmediachunk.init(this);
	//   77  165:aload           7
	//   78  167:aload_0         
	//   79  168:invokevirtual   #471 <Method void HlsMediaChunk.init(HlsSampleStreamWrapper)>
				mediaChunks.add(((Object) (hlsmediachunk)));
	//   80  171:aload_0         
	//   81  172:getfield        #151 <Field ArrayList mediaChunks>
	//   82  175:aload           7
	//   83  177:invokevirtual   #427 <Method boolean ArrayList.add(Object)>
	//   84  180:pop             
			}
			l = loader.startLoading(((com.google.android.exoplayer2.upstream.Loader.Loadable) (obj)), ((com.google.android.exoplayer2.upstream.Loader.Callback) (this)), minLoadableRetryCount);
	//   85  181:aload_0         
	//   86  182:getfield        #127 <Field Loader loader>
	//   87  185:aload           6
	//   88  187:aload_0         
	//   89  188:aload_0         
	//   90  189:getfield        #116 <Field int minLoadableRetryCount>
	//   91  192:invokevirtual   #475 <Method long Loader.startLoading(com.google.android.exoplayer2.upstream.Loader$Loadable, com.google.android.exoplayer2.upstream.Loader$Callback, int)>
	//   92  195:lstore_1        
			eventDispatcher.loadStarted(((Chunk) (obj)).dataSpec, ((Chunk) (obj)).type, trackType, ((Chunk) (obj)).trackFormat, ((Chunk) (obj)).trackSelectionReason, ((Chunk) (obj)).trackSelectionData, ((Chunk) (obj)).startTimeUs, ((Chunk) (obj)).endTimeUs, l);
	//   93  196:aload_0         
	//   94  197:getfield        #118 <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//   95  200:aload           6
	//   96  202:getfield        #481 <Field com.google.android.exoplayer2.upstream.DataSpec Chunk.dataSpec>
	//   97  205:aload           6
	//   98  207:getfield        #484 <Field int Chunk.type>
	//   99  210:aload_0         
	//  100  211:getfield        #106 <Field int trackType>
	//  101  214:aload           6
	//  102  216:getfield        #487 <Field Format Chunk.trackFormat>
	//  103  219:aload           6
	//  104  221:getfield        #490 <Field int Chunk.trackSelectionReason>
	//  105  224:aload           6
	//  106  226:getfield        #494 <Field Object Chunk.trackSelectionData>
	//  107  229:aload           6
	//  108  231:getfield        #497 <Field long Chunk.startTimeUs>
	//  109  234:aload           6
	//  110  236:getfield        #498 <Field long Chunk.endTimeUs>
	//  111  239:lload_1         
	//  112  240:invokevirtual   #504 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadStarted(com.google.android.exoplayer2.upstream.DataSpec, int, int, Format, int, Object, long, long, long)>
			return true;
	//  113  243:iconst_1        
	//  114  244:ireturn         
		} else
		{
			return false;
	//  115  245:iconst_0        
	//  116  246:ireturn         
		}
	}

	public void continuePreparing()
	{
		if(!prepared)
	//*   0    0:aload_0         
	//*   1    1:getfield        #399 <Field boolean prepared>
	//*   2    4:ifne            16
			continueLoading(lastSeekPositionUs);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #168 <Field long lastSeekPositionUs>
	//    6   12:invokevirtual   #507 <Method boolean continueLoading(long)>
	//    7   15:pop             
	//    8   16:return          
	}

	public void discardBuffer(long l, boolean flag)
	{
		if(!sampleQueuesBuilt)
	//*   0    0:aload_0         
	//*   1    1:getfield        #393 <Field boolean sampleQueuesBuilt>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		int j = sampleQueues.length;
	//    4    8:aload_0         
	//    5    9:getfield        #142 <Field SampleQueue[] sampleQueues>
	//    6   12:arraylength     
	//    7   13:istore          5
		for(int i = 0; i < j; i++)
	//*   8   15:iconst_0        
	//*   9   16:istore          4
	//*  10   18:iload           4
	//*  11   20:iload           5
	//*  12   22:icmpge          53
			sampleQueues[i].discardTo(l, flag, sampleQueuesEnabledStates[i]);
	//   13   25:aload_0         
	//   14   26:getfield        #142 <Field SampleQueue[] sampleQueues>
	//   15   29:iload           4
	//   16   31:aaload          
	//   17   32:lload_1         
	//   18   33:iload_3         
	//   19   34:aload_0         
	//   20   35:getfield        #146 <Field boolean[] sampleQueuesEnabledStates>
	//   21   38:iload           4
	//   22   40:baload          
	//   23   41:invokevirtual   #513 <Method void SampleQueue.discardTo(long, boolean, boolean)>

	//   24   44:iload           4
	//   25   46:iconst_1        
	//   26   47:iadd            
	//   27   48:istore          4
	//*  28   50:goto            18
	//   29   53:return          
	}

	public void endTracks()
	{
		tracksEnded = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #516 <Field boolean tracksEnded>
		handler.post(onTracksEndedRunnable);
	//    3    5:aload_0         
	//    4    6:getfield        #166 <Field Handler handler>
	//    5    9:aload_0         
	//    6   10:getfield        #161 <Field Runnable onTracksEndedRunnable>
	//    7   13:invokevirtual   #520 <Method boolean Handler.post(Runnable)>
	//    8   16:pop             
	//    9   17:return          
	}

	public long getBufferedPositionUs()
	{
		if(loadingFinished)
	//*   0    0:aload_0         
	//*   1    1:getfield        #436 <Field boolean loadingFinished>
	//*   2    4:ifeq            11
			return 0x0L;
	//    3    7:ldc2w           #523 <Long 0x0L>
	//    4   10:lreturn         
		if(isPendingReset())
	//*   5   11:aload_0         
	//*   6   12:invokespecial   #441 <Method boolean isPendingReset()>
	//*   7   15:ifeq            23
			return pendingResetPositionUs;
	//    8   18:aload_0         
	//    9   19:getfield        #170 <Field long pendingResetPositionUs>
	//   10   22:lreturn         
		long l1 = lastSeekPositionUs;
	//   11   23:aload_0         
	//   12   24:getfield        #168 <Field long lastSeekPositionUs>
	//   13   27:lstore          5
		HlsMediaChunk hlsmediachunk = getLastMediaChunk();
	//   14   29:aload_0         
	//   15   30:invokespecial   #443 <Method HlsMediaChunk getLastMediaChunk()>
	//   16   33:astore          7
		if(!hlsmediachunk.isLoadCompleted())
	//*  17   35:aload           7
	//*  18   37:invokevirtual   #527 <Method boolean HlsMediaChunk.isLoadCompleted()>
	//*  19   40:ifeq            46
	//*  20   43:goto            84
			if(mediaChunks.size() > 1)
	//*  21   46:aload_0         
	//*  22   47:getfield        #151 <Field ArrayList mediaChunks>
	//*  23   50:invokevirtual   #348 <Method int ArrayList.size()>
	//*  24   53:iconst_1        
	//*  25   54:icmple          81
				hlsmediachunk = (HlsMediaChunk)mediaChunks.get(mediaChunks.size() - 2);
	//   26   57:aload_0         
	//   27   58:getfield        #151 <Field ArrayList mediaChunks>
	//   28   61:aload_0         
	//   29   62:getfield        #151 <Field ArrayList mediaChunks>
	//   30   65:invokevirtual   #348 <Method int ArrayList.size()>
	//   31   68:iconst_2        
	//   32   69:isub            
	//   33   70:invokevirtual   #352 <Method Object ArrayList.get(int)>
	//   34   73:checkcast       #317 <Class HlsMediaChunk>
	//   35   76:astore          7
			else
	//*  36   78:goto            84
				hlsmediachunk = null;
	//   37   81:aconst_null     
	//   38   82:astore          7
		long l = l1;
	//   39   84:lload           5
	//   40   86:lstore_3        
		if(hlsmediachunk != null)
	//*  41   87:aload           7
	//*  42   89:ifnull          103
			l = Math.max(l1, hlsmediachunk.endTimeUs);
	//   43   92:lload           5
	//   44   94:aload           7
	//   45   96:getfield        #446 <Field long HlsMediaChunk.endTimeUs>
	//   46   99:invokestatic    #533 <Method long Math.max(long, long)>
	//   47  102:lstore_3        
		l1 = l;
	//   48  103:lload_3         
	//   49  104:lstore          5
		if(sampleQueuesBuilt)
	//*  50  106:aload_0         
	//*  51  107:getfield        #393 <Field boolean sampleQueuesBuilt>
	//*  52  110:ifeq            152
		{
			SampleQueue asamplequeue[] = sampleQueues;
	//   53  113:aload_0         
	//   54  114:getfield        #142 <Field SampleQueue[] sampleQueues>
	//   55  117:astore          7
			int j = asamplequeue.length;
	//   56  119:aload           7
	//   57  121:arraylength     
	//   58  122:istore_2        
			int i = 0;
	//   59  123:iconst_0        
	//   60  124:istore_1        
			do
			{
				l1 = l;
	//   61  125:lload_3         
	//   62  126:lstore          5
				if(i >= j)
					break;
	//   63  128:iload_1         
	//   64  129:iload_2         
	//   65  130:icmpge          152
				l = Math.max(l, asamplequeue[i].getLargestQueuedTimestampUs());
	//   66  133:lload_3         
	//   67  134:aload           7
	//   68  136:iload_1         
	//   69  137:aaload          
	//   70  138:invokevirtual   #536 <Method long SampleQueue.getLargestQueuedTimestampUs()>
	//   71  141:invokestatic    #533 <Method long Math.max(long, long)>
	//   72  144:lstore_3        
				i++;
	//   73  145:iload_1         
	//   74  146:iconst_1        
	//   75  147:iadd            
	//   76  148:istore_1        
			} while(true);
	//   77  149:goto            125
		}
		return l1;
	//   78  152:lload           5
	//   79  154:lreturn         
	}

	public long getNextLoadPositionUs()
	{
		if(isPendingReset())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #441 <Method boolean isPendingReset()>
	//*   2    4:ifeq            12
			return pendingResetPositionUs;
	//    3    7:aload_0         
	//    4    8:getfield        #170 <Field long pendingResetPositionUs>
	//    5   11:lreturn         
		if(loadingFinished)
	//*   6   12:aload_0         
	//*   7   13:getfield        #436 <Field boolean loadingFinished>
	//*   8   16:ifeq            23
			return 0x0L;
	//    9   19:ldc2w           #523 <Long 0x0L>
	//   10   22:lreturn         
		else
			return getLastMediaChunk().endTimeUs;
	//   11   23:aload_0         
	//   12   24:invokespecial   #443 <Method HlsMediaChunk getLastMediaChunk()>
	//   13   27:getfield        #446 <Field long HlsMediaChunk.endTimeUs>
	//   14   30:lreturn         
	}

	public TrackGroupArray getTrackGroups()
	{
		return trackGroups;
	//    0    0:aload_0         
	//    1    1:getfield        #234 <Field TrackGroupArray trackGroups>
	//    2    4:areturn         
	}

	public void init(int i, boolean flag, boolean flag1)
	{
		boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		if(!flag1)
	//*   2    3:iload_3         
	//*   3    4:ifne            17
		{
			audioSampleQueueMappingDone = false;
	//    4    7:aload_0         
	//    5    8:iconst_0        
	//    6    9:putfield        #542 <Field boolean audioSampleQueueMappingDone>
			videoSampleQueueMappingDone = false;
	//    7   12:aload_0         
	//    8   13:iconst_0        
	//    9   14:putfield        #544 <Field boolean videoSampleQueueMappingDone>
		}
		chunkUid = i;
	//   10   17:aload_0         
	//   11   18:iload_1         
	//   12   19:putfield        #546 <Field int chunkUid>
		SampleQueue asamplequeue[] = sampleQueues;
	//   13   22:aload_0         
	//   14   23:getfield        #142 <Field SampleQueue[] sampleQueues>
	//   15   26:astore          7
		int l = asamplequeue.length;
	//   16   28:aload           7
	//   17   30:arraylength     
	//   18   31:istore          6
		for(int j = 0; j < l; j++)
	//*  19   33:iconst_0        
	//*  20   34:istore          4
	//*  21   36:iload           4
	//*  22   38:iload           6
	//*  23   40:icmpge          61
			asamplequeue[j].sourceId(i);
	//   24   43:aload           7
	//   25   45:iload           4
	//   26   47:aaload          
	//   27   48:iload_1         
	//   28   49:invokevirtual   #550 <Method void SampleQueue.sourceId(int)>

	//   29   52:iload           4
	//   30   54:iconst_1        
	//   31   55:iadd            
	//   32   56:istore          4
	//*  33   58:goto            36
		if(flag)
	//*  34   61:iload_2         
	//*  35   62:ifeq            99
		{
			SampleQueue asamplequeue1[] = sampleQueues;
	//   36   65:aload_0         
	//   37   66:getfield        #142 <Field SampleQueue[] sampleQueues>
	//   38   69:astore          7
			int k = asamplequeue1.length;
	//   39   71:aload           7
	//   40   73:arraylength     
	//   41   74:istore          4
			for(i = ((int) (flag2)); i < k; i++)
	//*  42   76:iload           5
	//*  43   78:istore_1        
	//*  44   79:iload_1         
	//*  45   80:iload           4
	//*  46   82:icmpge          99
				asamplequeue1[i].splice();
	//   47   85:aload           7
	//   48   87:iload_1         
	//   49   88:aaload          
	//   50   89:invokevirtual   #553 <Method void SampleQueue.splice()>

	//   51   92:iload_1         
	//   52   93:iconst_1        
	//   53   94:iadd            
	//   54   95:istore_1        
		}
	//*  55   96:goto            79
	//   56   99:return          
	}

	public boolean isReady(int i)
	{
		return loadingFinished || !isPendingReset() && sampleQueues[i].hasNextSample();
	//    0    0:aload_0         
	//    1    1:getfield        #436 <Field boolean loadingFinished>
	//    2    4:ifne            31
	//    3    7:aload_0         
	//    4    8:invokespecial   #441 <Method boolean isPendingReset()>
	//    5   11:ifne            29
	//    6   14:aload_0         
	//    7   15:getfield        #142 <Field SampleQueue[] sampleQueues>
	//    8   18:iload_1         
	//    9   19:aaload          
	//   10   20:invokevirtual   #558 <Method boolean SampleQueue.hasNextSample()>
	//   11   23:ifeq            29
	//   12   26:goto            31
	//   13   29:iconst_0        
	//   14   30:ireturn         
	//   15   31:iconst_1        
	//   16   32:ireturn         
	}

	public void maybeThrowError()
		throws IOException
	{
		loader.maybeThrowError();
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field Loader loader>
	//    2    4:invokevirtual   #563 <Method void Loader.maybeThrowError()>
		chunkSource.maybeThrowError();
	//    3    7:aload_0         
	//    4    8:getfield        #110 <Field HlsChunkSource chunkSource>
	//    5   11:invokevirtual   #564 <Method void HlsChunkSource.maybeThrowError()>
	//    6   14:return          
	}

	public void maybeThrowPrepareError()
		throws IOException
	{
		maybeThrowError();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #567 <Method void maybeThrowError()>
	//    2    4:return          
	}

	public void onLoadCanceled(Chunk chunk, long l, long l1, boolean flag)
	{
		eventDispatcher.loadCanceled(chunk.dataSpec, chunk.type, trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, l, l1, chunk.bytesLoaded());
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    2    4:aload_1         
	//    3    5:getfield        #481 <Field com.google.android.exoplayer2.upstream.DataSpec Chunk.dataSpec>
	//    4    8:aload_1         
	//    5    9:getfield        #484 <Field int Chunk.type>
	//    6   12:aload_0         
	//    7   13:getfield        #106 <Field int trackType>
	//    8   16:aload_1         
	//    9   17:getfield        #487 <Field Format Chunk.trackFormat>
	//   10   20:aload_1         
	//   11   21:getfield        #490 <Field int Chunk.trackSelectionReason>
	//   12   24:aload_1         
	//   13   25:getfield        #494 <Field Object Chunk.trackSelectionData>
	//   14   28:aload_1         
	//   15   29:getfield        #497 <Field long Chunk.startTimeUs>
	//   16   32:aload_1         
	//   17   33:getfield        #498 <Field long Chunk.endTimeUs>
	//   18   36:lload_2         
	//   19   37:lload           4
	//   20   39:aload_1         
	//   21   40:invokevirtual   #572 <Method long Chunk.bytesLoaded()>
	//   22   43:invokevirtual   #576 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadCanceled(com.google.android.exoplayer2.upstream.DataSpec, int, int, Format, int, Object, long, long, long, long, long)>
		if(!flag)
	//*  23   46:iload           6
	//*  24   48:ifne            72
		{
			resetSampleQueues();
	//   25   51:aload_0         
	//   26   52:invokespecial   #578 <Method void resetSampleQueues()>
			if(enabledTrackGroupCount > 0)
	//*  27   55:aload_0         
	//*  28   56:getfield        #580 <Field int enabledTrackGroupCount>
	//*  29   59:ifle            72
				callback.onContinueLoadingRequested(((SequenceableLoader) (this)));
	//   30   62:aload_0         
	//   31   63:getfield        #108 <Field HlsSampleStreamWrapper$Callback callback>
	//   32   66:aload_0         
	//   33   67:invokeinterface #584 <Method void HlsSampleStreamWrapper$Callback.onContinueLoadingRequested(SequenceableLoader)>
		}
	//   34   72:return          
	}

	public volatile void onLoadCanceled(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1, boolean flag)
	{
		onLoadCanceled((Chunk)loadable, l, l1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #477 <Class Chunk>
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:iload           6
	//    6   10:invokevirtual   #587 <Method void onLoadCanceled(Chunk, long, long, boolean)>
	//    7   13:return          
	}

	public void onLoadCompleted(Chunk chunk, long l, long l1)
	{
		chunkSource.onChunkLoadCompleted(chunk);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field HlsChunkSource chunkSource>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #593 <Method void HlsChunkSource.onChunkLoadCompleted(Chunk)>
		eventDispatcher.loadCompleted(chunk.dataSpec, chunk.type, trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, l, l1, chunk.bytesLoaded());
	//    4    8:aload_0         
	//    5    9:getfield        #118 <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    6   12:aload_1         
	//    7   13:getfield        #481 <Field com.google.android.exoplayer2.upstream.DataSpec Chunk.dataSpec>
	//    8   16:aload_1         
	//    9   17:getfield        #484 <Field int Chunk.type>
	//   10   20:aload_0         
	//   11   21:getfield        #106 <Field int trackType>
	//   12   24:aload_1         
	//   13   25:getfield        #487 <Field Format Chunk.trackFormat>
	//   14   28:aload_1         
	//   15   29:getfield        #490 <Field int Chunk.trackSelectionReason>
	//   16   32:aload_1         
	//   17   33:getfield        #494 <Field Object Chunk.trackSelectionData>
	//   18   36:aload_1         
	//   19   37:getfield        #497 <Field long Chunk.startTimeUs>
	//   20   40:aload_1         
	//   21   41:getfield        #498 <Field long Chunk.endTimeUs>
	//   22   44:lload_2         
	//   23   45:lload           4
	//   24   47:aload_1         
	//   25   48:invokevirtual   #572 <Method long Chunk.bytesLoaded()>
	//   26   51:invokevirtual   #596 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadCompleted(com.google.android.exoplayer2.upstream.DataSpec, int, int, Format, int, Object, long, long, long, long, long)>
		if(!prepared)
	//*  27   54:aload_0         
	//*  28   55:getfield        #399 <Field boolean prepared>
	//*  29   58:ifne            71
		{
			continueLoading(lastSeekPositionUs);
	//   30   61:aload_0         
	//   31   62:aload_0         
	//   32   63:getfield        #168 <Field long lastSeekPositionUs>
	//   33   66:invokevirtual   #507 <Method boolean continueLoading(long)>
	//   34   69:pop             
			return;
	//   35   70:return          
		} else
		{
			callback.onContinueLoadingRequested(((SequenceableLoader) (this)));
	//   36   71:aload_0         
	//   37   72:getfield        #108 <Field HlsSampleStreamWrapper$Callback callback>
	//   38   75:aload_0         
	//   39   76:invokeinterface #584 <Method void HlsSampleStreamWrapper$Callback.onContinueLoadingRequested(SequenceableLoader)>
			return;
	//   40   81:return          
		}
	}

	public volatile void onLoadCompleted(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1)
	{
		onLoadCompleted((Chunk)loadable, l, l1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #477 <Class Chunk>
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:invokevirtual   #599 <Method void onLoadCompleted(Chunk, long, long)>
	//    6   11:return          
	}

	public int onLoadError(Chunk chunk, long l, long l1, IOException ioexception)
	{
		long l2 = chunk.bytesLoaded();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #572 <Method long Chunk.bytesLoaded()>
	//    2    4:lstore          8
		boolean flag1 = isMediaChunk(chunk);
	//    3    6:aload_1         
	//    4    7:invokestatic    #468 <Method boolean isMediaChunk(Chunk)>
	//    5   10:istore          11
		byte byte0 = 0;
	//    6   12:iconst_0        
	//    7   13:istore          7
		boolean flag;
		if(flag1 && l2 != 0L)
	//*   8   15:iload           11
	//*   9   17:ifeq            36
	//*  10   20:lload           8
	//*  11   22:lconst_0        
	//*  12   23:lcmp            
	//*  13   24:ifne            30
	//*  14   27:goto            36
			flag = false;
	//   15   30:iconst_0        
	//   16   31:istore          10
		else
	//*  17   33:goto            39
			flag = true;
	//   18   36:iconst_1        
	//   19   37:istore          10
		if(chunkSource.onChunkLoadError(chunk, flag, ioexception))
	//*  20   39:aload_0         
	//*  21   40:getfield        #110 <Field HlsChunkSource chunkSource>
	//*  22   43:aload_1         
	//*  23   44:iload           10
	//*  24   46:aload           6
	//*  25   48:invokevirtual   #605 <Method boolean HlsChunkSource.onChunkLoadError(Chunk, boolean, IOException)>
	//*  26   51:ifeq            120
		{
			if(flag1)
	//*  27   54:iload           11
	//*  28   56:ifeq            114
			{
				if((HlsMediaChunk)mediaChunks.remove(mediaChunks.size() - 1) == chunk)
	//*  29   59:aload_0         
	//*  30   60:getfield        #151 <Field ArrayList mediaChunks>
	//*  31   63:aload_0         
	//*  32   64:getfield        #151 <Field ArrayList mediaChunks>
	//*  33   67:invokevirtual   #348 <Method int ArrayList.size()>
	//*  34   70:iconst_1        
	//*  35   71:isub            
	//*  36   72:invokevirtual   #608 <Method Object ArrayList.remove(int)>
	//*  37   75:checkcast       #317 <Class HlsMediaChunk>
	//*  38   78:aload_1         
	//*  39   79:if_acmpne       88
					flag = true;
	//   40   82:iconst_1        
	//   41   83:istore          10
				else
	//*  42   85:goto            91
					flag = false;
	//   43   88:iconst_0        
	//   44   89:istore          10
				Assertions.checkState(flag);
	//   45   91:iload           10
	//   46   93:invokestatic    #242 <Method void Assertions.checkState(boolean)>
				if(mediaChunks.isEmpty())
	//*  47   96:aload_0         
	//*  48   97:getfield        #151 <Field ArrayList mediaChunks>
	//*  49  100:invokevirtual   #611 <Method boolean ArrayList.isEmpty()>
	//*  50  103:ifeq            114
					pendingResetPositionUs = lastSeekPositionUs;
	//   51  106:aload_0         
	//   52  107:aload_0         
	//   53  108:getfield        #168 <Field long lastSeekPositionUs>
	//   54  111:putfield        #170 <Field long pendingResetPositionUs>
			}
			flag = true;
	//   55  114:iconst_1        
	//   56  115:istore          10
		} else
	//*  57  117:goto            123
		{
			flag = false;
	//   58  120:iconst_0        
	//   59  121:istore          10
		}
		eventDispatcher.loadError(chunk.dataSpec, chunk.type, trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, l, l1, chunk.bytesLoaded(), ioexception, flag);
	//   60  123:aload_0         
	//   61  124:getfield        #118 <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//   62  127:aload_1         
	//   63  128:getfield        #481 <Field com.google.android.exoplayer2.upstream.DataSpec Chunk.dataSpec>
	//   64  131:aload_1         
	//   65  132:getfield        #484 <Field int Chunk.type>
	//   66  135:aload_0         
	//   67  136:getfield        #106 <Field int trackType>
	//   68  139:aload_1         
	//   69  140:getfield        #487 <Field Format Chunk.trackFormat>
	//   70  143:aload_1         
	//   71  144:getfield        #490 <Field int Chunk.trackSelectionReason>
	//   72  147:aload_1         
	//   73  148:getfield        #494 <Field Object Chunk.trackSelectionData>
	//   74  151:aload_1         
	//   75  152:getfield        #497 <Field long Chunk.startTimeUs>
	//   76  155:aload_1         
	//   77  156:getfield        #498 <Field long Chunk.endTimeUs>
	//   78  159:lload_2         
	//   79  160:lload           4
	//   80  162:aload_1         
	//   81  163:invokevirtual   #572 <Method long Chunk.bytesLoaded()>
	//   82  166:aload           6
	//   83  168:iload           10
	//   84  170:invokevirtual   #615 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadError(com.google.android.exoplayer2.upstream.DataSpec, int, int, Format, int, Object, long, long, long, long, long, IOException, boolean)>
		if(flag)
	//*  85  173:iload           10
	//*  86  175:ifeq            209
		{
			if(!prepared)
	//*  87  178:aload_0         
	//*  88  179:getfield        #399 <Field boolean prepared>
	//*  89  182:ifne            197
				continueLoading(lastSeekPositionUs);
	//   90  185:aload_0         
	//   91  186:aload_0         
	//   92  187:getfield        #168 <Field long lastSeekPositionUs>
	//   93  190:invokevirtual   #507 <Method boolean continueLoading(long)>
	//   94  193:pop             
			else
	//*  95  194:goto            207
				callback.onContinueLoadingRequested(((SequenceableLoader) (this)));
	//   96  197:aload_0         
	//   97  198:getfield        #108 <Field HlsSampleStreamWrapper$Callback callback>
	//   98  201:aload_0         
	//   99  202:invokeinterface #584 <Method void HlsSampleStreamWrapper$Callback.onContinueLoadingRequested(SequenceableLoader)>
			return 2;
	//  100  207:iconst_2        
	//  101  208:ireturn         
		}
		if(ioexception instanceof ParserException)
	//* 102  209:aload           6
	//* 103  211:instanceof      #617 <Class ParserException>
	//* 104  214:ifeq            220
			byte0 = 3;
	//  105  217:iconst_3        
	//  106  218:istore          7
		return ((int) (byte0));
	//  107  220:iload           7
	//  108  222:ireturn         
	}

	public volatile int onLoadError(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1, IOException ioexception)
	{
		return onLoadError((Chunk)loadable, l, l1, ioexception);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #477 <Class Chunk>
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:aload           6
	//    6   10:invokevirtual   #620 <Method int onLoadError(Chunk, long, long, IOException)>
	//    7   13:ireturn         
	}

	public void onLoaderReleased()
	{
		resetSampleQueues();
	//    0    0:aload_0         
	//    1    1:invokespecial   #578 <Method void resetSampleQueues()>
	//    2    4:return          
	}

	public boolean onPlaylistError(com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl hlsurl, boolean flag)
	{
		return chunkSource.onPlaylistError(hlsurl, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field HlsChunkSource chunkSource>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #625 <Method boolean HlsChunkSource.onPlaylistError(com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl, boolean)>
	//    5    9:ireturn         
	}

	public void onUpstreamFormatChanged(Format format)
	{
		handler.post(maybeFinishPrepareRunnable);
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field Handler handler>
	//    2    4:aload_0         
	//    3    5:getfield        #158 <Field Runnable maybeFinishPrepareRunnable>
	//    4    8:invokevirtual   #520 <Method boolean Handler.post(Runnable)>
	//    5   11:pop             
	//    6   12:return          
	}

	public void prepareWithMasterPlaylistInfo(TrackGroupArray trackgrouparray, int i, TrackGroupArray trackgrouparray1)
	{
		prepared = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #399 <Field boolean prepared>
		trackGroups = trackgrouparray;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #234 <Field TrackGroupArray trackGroups>
		optionalTrackGroups = trackgrouparray1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #236 <Field TrackGroupArray optionalTrackGroups>
		primaryTrackGroupIndex = i;
	//    9   15:aload_0         
	//   10   16:iload_2         
	//   11   17:putfield        #214 <Field int primaryTrackGroupIndex>
		callback.onPrepared();
	//   12   20:aload_0         
	//   13   21:getfield        #108 <Field HlsSampleStreamWrapper$Callback callback>
	//   14   24:invokeinterface #402 <Method void HlsSampleStreamWrapper$Callback.onPrepared()>
	//   15   29:return          
	}

	public int readData(int i, FormatHolder formatholder, DecoderInputBuffer decoderinputbuffer, boolean flag)
	{
		if(isPendingReset())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #441 <Method boolean isPendingReset()>
	//*   2    4:ifeq            10
			return -3;
	//    3    7:bipush          -3
	//    4    9:ireturn         
		if(!mediaChunks.isEmpty())
	//*   5   10:aload_0         
	//*   6   11:getfield        #151 <Field ArrayList mediaChunks>
	//*   7   14:invokevirtual   #611 <Method boolean ArrayList.isEmpty()>
	//*   8   17:ifne            146
		{
			int j;
			for(j = 0; j < mediaChunks.size() - 1 && finishedReadingChunk((HlsMediaChunk)mediaChunks.get(j)); j++);
	//    9   20:iconst_0        
	//   10   21:istore          5
	//   11   23:iload           5
	//   12   25:aload_0         
	//   13   26:getfield        #151 <Field ArrayList mediaChunks>
	//   14   29:invokevirtual   #348 <Method int ArrayList.size()>
	//   15   32:iconst_1        
	//   16   33:isub            
	//   17   34:icmpge          65
	//   18   37:aload_0         
	//   19   38:aload_0         
	//   20   39:getfield        #151 <Field ArrayList mediaChunks>
	//   21   42:iload           5
	//   22   44:invokevirtual   #352 <Method Object ArrayList.get(int)>
	//   23   47:checkcast       #317 <Class HlsMediaChunk>
	//   24   50:invokespecial   #633 <Method boolean finishedReadingChunk(HlsMediaChunk)>
	//   25   53:ifeq            65
	//   26   56:iload           5
	//   27   58:iconst_1        
	//   28   59:iadd            
	//   29   60:istore          5
	//*  30   62:goto            23
			if(j > 0)
	//*  31   65:iload           5
	//*  32   67:ifle            80
				Util.removeRange(((java.util.List) (mediaChunks)), 0, j);
	//   33   70:aload_0         
	//   34   71:getfield        #151 <Field ArrayList mediaChunks>
	//   35   74:iconst_0        
	//   36   75:iload           5
	//   37   77:invokestatic    #637 <Method void Util.removeRange(java.util.List, int, int)>
			HlsMediaChunk hlsmediachunk = (HlsMediaChunk)mediaChunks.get(0);
	//   38   80:aload_0         
	//   39   81:getfield        #151 <Field ArrayList mediaChunks>
	//   40   84:iconst_0        
	//   41   85:invokevirtual   #352 <Method Object ArrayList.get(int)>
	//   42   88:checkcast       #317 <Class HlsMediaChunk>
	//   43   91:astore          6
			Format format = hlsmediachunk.trackFormat;
	//   44   93:aload           6
	//   45   95:getfield        #638 <Field Format HlsMediaChunk.trackFormat>
	//   46   98:astore          7
			if(!format.equals(((Object) (downstreamTrackFormat))))
	//*  47  100:aload           7
	//*  48  102:aload_0         
	//*  49  103:getfield        #640 <Field Format downstreamTrackFormat>
	//*  50  106:invokevirtual   #641 <Method boolean Format.equals(Object)>
	//*  51  109:ifne            140
				eventDispatcher.downstreamFormatChanged(trackType, format, hlsmediachunk.trackSelectionReason, hlsmediachunk.trackSelectionData, hlsmediachunk.startTimeUs);
	//   52  112:aload_0         
	//   53  113:getfield        #118 <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher eventDispatcher>
	//   54  116:aload_0         
	//   55  117:getfield        #106 <Field int trackType>
	//   56  120:aload           7
	//   57  122:aload           6
	//   58  124:getfield        #642 <Field int HlsMediaChunk.trackSelectionReason>
	//   59  127:aload           6
	//   60  129:getfield        #643 <Field Object HlsMediaChunk.trackSelectionData>
	//   61  132:aload           6
	//   62  134:getfield        #644 <Field long HlsMediaChunk.startTimeUs>
	//   63  137:invokevirtual   #648 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.downstreamFormatChanged(int, Format, int, Object, long)>
			downstreamTrackFormat = format;
	//   64  140:aload_0         
	//   65  141:aload           7
	//   66  143:putfield        #640 <Field Format downstreamTrackFormat>
		}
		return sampleQueues[i].read(formatholder, decoderinputbuffer, flag, loadingFinished, lastSeekPositionUs);
	//   67  146:aload_0         
	//   68  147:getfield        #142 <Field SampleQueue[] sampleQueues>
	//   69  150:iload_1         
	//   70  151:aaload          
	//   71  152:aload_2         
	//   72  153:aload_3         
	//   73  154:iload           4
	//   74  156:aload_0         
	//   75  157:getfield        #436 <Field boolean loadingFinished>
	//   76  160:aload_0         
	//   77  161:getfield        #168 <Field long lastSeekPositionUs>
	//   78  164:invokevirtual   #652 <Method int SampleQueue.read(FormatHolder, DecoderInputBuffer, boolean, boolean, long)>
	//   79  167:ireturn         
	}

	public void reevaluateBuffer(long l)
	{
	//    0    0:return          
	}

	public void release()
	{
		if(prepared)
	//*   0    0:aload_0         
	//*   1    1:getfield        #399 <Field boolean prepared>
	//*   2    4:ifeq            35
		{
			SampleQueue asamplequeue[] = sampleQueues;
	//    3    7:aload_0         
	//    4    8:getfield        #142 <Field SampleQueue[] sampleQueues>
	//    5   11:astore_3        
			int j = asamplequeue.length;
	//    6   12:aload_3         
	//    7   13:arraylength     
	//    8   14:istore_2        
			for(int i = 0; i < j; i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_1        
	//*  11   17:iload_1         
	//*  12   18:iload_2         
	//*  13   19:icmpge          35
				asamplequeue[i].discardToEnd();
	//   14   22:aload_3         
	//   15   23:iload_1         
	//   16   24:aaload          
	//   17   25:invokevirtual   #658 <Method void SampleQueue.discardToEnd()>

	//   18   28:iload_1         
	//   19   29:iconst_1        
	//   20   30:iadd            
	//   21   31:istore_1        
		}
	//*  22   32:goto            17
		loader.release(((com.google.android.exoplayer2.upstream.Loader.ReleaseCallback) (this)));
	//   23   35:aload_0         
	//   24   36:getfield        #127 <Field Loader loader>
	//   25   39:aload_0         
	//   26   40:invokevirtual   #661 <Method void Loader.release(com.google.android.exoplayer2.upstream.Loader$ReleaseCallback)>
		handler.removeCallbacksAndMessages(((Object) (null)));
	//   27   43:aload_0         
	//   28   44:getfield        #166 <Field Handler handler>
	//   29   47:aconst_null     
	//   30   48:invokevirtual   #665 <Method void Handler.removeCallbacksAndMessages(Object)>
		released = true;
	//   31   51:aload_0         
	//   32   52:iconst_1        
	//   33   53:putfield        #391 <Field boolean released>
		hlsSampleStreams.clear();
	//   34   56:aload_0         
	//   35   57:getfield        #153 <Field ArrayList hlsSampleStreams>
	//   36   60:invokevirtual   #424 <Method void ArrayList.clear()>
	//   37   63:return          
	}

	public void seekMap(SeekMap seekmap)
	{
	//    0    0:return          
	}

	public boolean seekToUs(long l, boolean flag)
	{
		lastSeekPositionUs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #168 <Field long lastSeekPositionUs>
		if(sampleQueuesBuilt && !flag && !isPendingReset() && seekInsideBufferUs(l))
	//*   3    5:aload_0         
	//*   4    6:getfield        #393 <Field boolean sampleQueuesBuilt>
	//*   5    9:ifeq            33
	//*   6   12:iload_3         
	//*   7   13:ifne            33
	//*   8   16:aload_0         
	//*   9   17:invokespecial   #441 <Method boolean isPendingReset()>
	//*  10   20:ifne            33
	//*  11   23:aload_0         
	//*  12   24:lload_1         
	//*  13   25:invokespecial   #671 <Method boolean seekInsideBufferUs(long)>
	//*  14   28:ifeq            33
			return false;
	//   15   31:iconst_0        
	//   16   32:ireturn         
		pendingResetPositionUs = l;
	//   17   33:aload_0         
	//   18   34:lload_1         
	//   19   35:putfield        #170 <Field long pendingResetPositionUs>
		loadingFinished = false;
	//   20   38:aload_0         
	//   21   39:iconst_0        
	//   22   40:putfield        #436 <Field boolean loadingFinished>
		mediaChunks.clear();
	//   23   43:aload_0         
	//   24   44:getfield        #151 <Field ArrayList mediaChunks>
	//   25   47:invokevirtual   #424 <Method void ArrayList.clear()>
		if(loader.isLoading())
	//*  26   50:aload_0         
	//*  27   51:getfield        #127 <Field Loader loader>
	//*  28   54:invokevirtual   #439 <Method boolean Loader.isLoading()>
	//*  29   57:ifeq            70
			loader.cancelLoading();
	//   30   60:aload_0         
	//   31   61:getfield        #127 <Field Loader loader>
	//   32   64:invokevirtual   #674 <Method void Loader.cancelLoading()>
		else
	//*  33   67:goto            74
			resetSampleQueues();
	//   34   70:aload_0         
	//   35   71:invokespecial   #578 <Method void resetSampleQueues()>
		return true;
	//   36   74:iconst_1        
	//   37   75:ireturn         
	}

	public boolean selectTracks(TrackSelection atrackselection[], boolean aflag[], SampleStream asamplestream[], boolean aflag1[], long l, boolean flag)
	{
		boolean flag5;
label0:
		{
			int k1;
			boolean flag3;
label1:
			{
				boolean flag1;
label2:
				{
					Assertions.checkState(prepared);
	//    0    0:aload_0         
	//    1    1:getfield        #399 <Field boolean prepared>
	//    2    4:invokestatic    #242 <Method void Assertions.checkState(boolean)>
					int l1 = enabledTrackGroupCount;
	//    3    7:aload_0         
	//    4    8:getfield        #580 <Field int enabledTrackGroupCount>
	//    5   11:istore          11
					k1 = 0;
	//    6   13:iconst_0        
	//    7   14:istore          9
					boolean flag2 = false;
	//    8   16:iconst_0        
	//    9   17:istore          10
					for(int i = 0; i < atrackselection.length; i++)
	//*  10   19:iconst_0        
	//*  11   20:istore          8
	//*  12   22:iload           8
	//*  13   24:aload_1         
	//*  14   25:arraylength     
	//*  15   26:icmpge          84
						if(asamplestream[i] != null && (atrackselection[i] == null || !aflag[i]))
	//*  16   29:aload_3         
	//*  17   30:iload           8
	//*  18   32:aaload          
	//*  19   33:ifnull          75
	//*  20   36:aload_1         
	//*  21   37:iload           8
	//*  22   39:aaload          
	//*  23   40:ifnull          50
	//*  24   43:aload_2         
	//*  25   44:iload           8
	//*  26   46:baload          
	//*  27   47:ifne            75
						{
							enabledTrackGroupCount = enabledTrackGroupCount - 1;
	//   28   50:aload_0         
	//   29   51:aload_0         
	//   30   52:getfield        #580 <Field int enabledTrackGroupCount>
	//   31   55:iconst_1        
	//   32   56:isub            
	//   33   57:putfield        #580 <Field int enabledTrackGroupCount>
							((HlsSampleStream)asamplestream[i]).unbindSampleQueue();
	//   34   60:aload_3         
	//   35   61:iload           8
	//   36   63:aaload          
	//   37   64:checkcast       #386 <Class HlsSampleStream>
	//   38   67:invokevirtual   #679 <Method void HlsSampleStream.unbindSampleQueue()>
							asamplestream[i] = null;
	//   39   70:aload_3         
	//   40   71:iload           8
	//   41   73:aconst_null     
	//   42   74:aastore         
						}

	//   43   75:iload           8
	//   44   77:iconst_1        
	//   45   78:iadd            
	//   46   79:istore          8
	//*  47   81:goto            22
					if(!flag && (seenFirstTrackSelection ? l1 != 0 : l == lastSeekPositionUs))
	//*  48   84:iload           7
	//*  49   86:ifne            123
	//*  50   89:aload_0         
	//*  51   90:getfield        #681 <Field boolean seenFirstTrackSelection>
	//*  52   93:ifeq            104
	//*  53   96:iload           11
	//*  54   98:ifne            117
	//*  55  101:goto            123
	//*  56  104:lload           5
	//*  57  106:aload_0         
	//*  58  107:getfield        #168 <Field long lastSeekPositionUs>
	//*  59  110:lcmp            
	//*  60  111:ifeq            117
	//*  61  114:goto            123
						flag3 = false;
	//   62  117:iconst_0        
	//   63  118:istore          14
					else
	//*  64  120:goto            126
						flag3 = true;
	//   65  123:iconst_1        
	//   66  124:istore          14
					TrackSelection trackselection = chunkSource.getTrackSelection();
	//   67  126:aload_0         
	//   68  127:getfield        #110 <Field HlsChunkSource chunkSource>
	//   69  130:invokevirtual   #685 <Method TrackSelection HlsChunkSource.getTrackSelection()>
	//   70  133:astore          17
					aflag = ((boolean []) (trackselection));
	//   71  135:aload           17
	//   72  137:astore_2        
					for(int j = 0; j < atrackselection.length;)
	//*  73  138:iconst_0        
	//*  74  139:istore          8
	//*  75  141:iload           8
	//*  76  143:aload_1         
	//*  77  144:arraylength     
	//*  78  145:icmpge          363
					{
						Object obj = ((Object) (aflag));
	//   79  148:aload_2         
	//   80  149:astore          16
						boolean flag4 = flag3;
	//   81  151:iload           14
	//   82  153:istore          15
						if(asamplestream[j] == null)
	//*  83  155:aload_3         
	//*  84  156:iload           8
	//*  85  158:aaload          
	//*  86  159:ifnonnull       347
						{
							obj = ((Object) (aflag));
	//   87  162:aload_2         
	//   88  163:astore          16
							flag4 = flag3;
	//   89  165:iload           14
	//   90  167:istore          15
							if(atrackselection[j] != null)
	//*  91  169:aload_1         
	//*  92  170:iload           8
	//*  93  172:aaload          
	//*  94  173:ifnull          347
							{
								enabledTrackGroupCount = enabledTrackGroupCount + 1;
	//   95  176:aload_0         
	//   96  177:aload_0         
	//   97  178:getfield        #580 <Field int enabledTrackGroupCount>
	//   98  181:iconst_1        
	//   99  182:iadd            
	//  100  183:putfield        #580 <Field int enabledTrackGroupCount>
								obj = ((Object) (atrackselection[j]));
	//  101  186:aload_1         
	//  102  187:iload           8
	//  103  189:aaload          
	//  104  190:astore          16
								int i2 = trackGroups.indexOf(((TrackSelection) (obj)).getTrackGroup());
	//  105  192:aload_0         
	//  106  193:getfield        #234 <Field TrackGroupArray trackGroups>
	//  107  196:aload           16
	//  108  198:invokeinterface #688 <Method TrackGroup TrackSelection.getTrackGroup()>
	//  109  203:invokevirtual   #433 <Method int TrackGroupArray.indexOf(TrackGroup)>
	//  110  206:istore          11
								if(i2 == primaryTrackGroupIndex)
	//* 111  208:iload           11
	//* 112  210:aload_0         
	//* 113  211:getfield        #214 <Field int primaryTrackGroupIndex>
	//* 114  214:icmpne          229
								{
									chunkSource.selectTracks(((TrackSelection) (obj)));
	//  115  217:aload_0         
	//  116  218:getfield        #110 <Field HlsChunkSource chunkSource>
	//  117  221:aload           16
	//  118  223:invokevirtual   #691 <Method void HlsChunkSource.selectTracks(TrackSelection)>
									aflag = ((boolean []) (obj));
	//  119  226:aload           16
	//  120  228:astore_2        
								}
								asamplestream[j] = ((SampleStream) (new HlsSampleStream(this, i2)));
	//  121  229:aload_3         
	//  122  230:iload           8
	//  123  232:new             #386 <Class HlsSampleStream>
	//  124  235:dup             
	//  125  236:aload_0         
	//  126  237:iload           11
	//  127  239:invokespecial   #694 <Method void HlsSampleStream(HlsSampleStreamWrapper, int)>
	//  128  242:aastore         
								aflag1[j] = true;
	//  129  243:aload           4
	//  130  245:iload           8
	//  131  247:iconst_1        
	//  132  248:bastore         
								if(trackGroupToSampleQueueIndex != null)
	//* 133  249:aload_0         
	//* 134  250:getfield        #216 <Field int[] trackGroupToSampleQueueIndex>
	//* 135  253:ifnull          266
									((HlsSampleStream)asamplestream[j]).bindSampleQueue();
	//  136  256:aload_3         
	//  137  257:iload           8
	//  138  259:aaload          
	//  139  260:checkcast       #386 <Class HlsSampleStream>
	//  140  263:invokevirtual   #389 <Method void HlsSampleStream.bindSampleQueue()>
								obj = ((Object) (aflag));
	//  141  266:aload_2         
	//  142  267:astore          16
								flag4 = flag3;
	//  143  269:iload           14
	//  144  271:istore          15
								if(sampleQueuesBuilt)
	//* 145  273:aload_0         
	//* 146  274:getfield        #393 <Field boolean sampleQueuesBuilt>
	//* 147  277:ifeq            347
								{
									obj = ((Object) (aflag));
	//  148  280:aload_2         
	//  149  281:astore          16
									flag4 = flag3;
	//  150  283:iload           14
	//  151  285:istore          15
									if(!flag3)
	//* 152  287:iload           14
	//* 153  289:ifne            347
									{
										obj = ((Object) (sampleQueues[trackGroupToSampleQueueIndex[i2]]));
	//  154  292:aload_0         
	//  155  293:getfield        #142 <Field SampleQueue[] sampleQueues>
	//  156  296:aload_0         
	//  157  297:getfield        #216 <Field int[] trackGroupToSampleQueueIndex>
	//  158  300:iload           11
	//  159  302:iaload          
	//  160  303:aaload          
	//  161  304:astore          16
										((SampleQueue) (obj)).rewind();
	//  162  306:aload           16
	//  163  308:invokevirtual   #413 <Method void SampleQueue.rewind()>
										if(((SampleQueue) (obj)).advanceTo(l, true, true) == -1 && ((SampleQueue) (obj)).getReadIndex() != 0)
	//* 164  311:aload           16
	//* 165  313:lload           5
	//* 166  315:iconst_1        
	//* 167  316:iconst_1        
	//* 168  317:invokevirtual   #417 <Method int SampleQueue.advanceTo(long, boolean, boolean)>
	//* 169  320:iconst_m1       
	//* 170  321:icmpne          341
	//* 171  324:aload           16
	//* 172  326:invokevirtual   #697 <Method int SampleQueue.getReadIndex()>
	//* 173  329:ifeq            341
										{
											flag4 = true;
	//  174  332:iconst_1        
	//  175  333:istore          15
											obj = ((Object) (aflag));
	//  176  335:aload_2         
	//  177  336:astore          16
										} else
	//* 178  338:goto            347
										{
											flag4 = false;
	//  179  341:iconst_0        
	//  180  342:istore          15
											obj = ((Object) (aflag));
	//  181  344:aload_2         
	//  182  345:astore          16
										}
									}
								}
							}
						}
						j++;
	//  183  347:iload           8
	//  184  349:iconst_1        
	//  185  350:iadd            
	//  186  351:istore          8
						aflag = ((boolean []) (obj));
	//  187  353:aload           16
	//  188  355:astore_2        
						flag3 = flag4;
	//  189  356:iload           15
	//  190  358:istore          14
					}

	//* 191  360:goto            141
					if(enabledTrackGroupCount == 0)
	//* 192  363:aload_0         
	//* 193  364:getfield        #580 <Field int enabledTrackGroupCount>
	//* 194  367:ifne            467
					{
						chunkSource.reset();
	//  195  370:aload_0         
	//  196  371:getfield        #110 <Field HlsChunkSource chunkSource>
	//  197  374:invokevirtual   #699 <Method void HlsChunkSource.reset()>
						downstreamTrackFormat = null;
	//  198  377:aload_0         
	//  199  378:aconst_null     
	//  200  379:putfield        #640 <Field Format downstreamTrackFormat>
						mediaChunks.clear();
	//  201  382:aload_0         
	//  202  383:getfield        #151 <Field ArrayList mediaChunks>
	//  203  386:invokevirtual   #424 <Method void ArrayList.clear()>
						if(loader.isLoading())
	//* 204  389:aload_0         
	//* 205  390:getfield        #127 <Field Loader loader>
	//* 206  393:invokevirtual   #439 <Method boolean Loader.isLoading()>
	//* 207  396:ifeq            456
						{
							if(sampleQueuesBuilt)
	//* 208  399:aload_0         
	//* 209  400:getfield        #393 <Field boolean sampleQueuesBuilt>
	//* 210  403:ifeq            442
							{
								atrackselection = ((TrackSelection []) (sampleQueues));
	//  211  406:aload_0         
	//  212  407:getfield        #142 <Field SampleQueue[] sampleQueues>
	//  213  410:astore_1        
								k1 = atrackselection.length;
	//  214  411:aload_1         
	//  215  412:arraylength     
	//  216  413:istore          9
								for(int k = ((int) (flag2)); k < k1; k++)
	//* 217  415:iload           10
	//* 218  417:istore          8
	//* 219  419:iload           8
	//* 220  421:iload           9
	//* 221  423:icmpge          442
									((SampleQueue) (atrackselection[k])).discardToEnd();
	//  222  426:aload_1         
	//  223  427:iload           8
	//  224  429:aaload          
	//  225  430:invokevirtual   #658 <Method void SampleQueue.discardToEnd()>

	//  226  433:iload           8
	//  227  435:iconst_1        
	//  228  436:iadd            
	//  229  437:istore          8
							}
	//* 230  439:goto            419
							loader.cancelLoading();
	//  231  442:aload_0         
	//  232  443:getfield        #127 <Field Loader loader>
	//  233  446:invokevirtual   #674 <Method void Loader.cancelLoading()>
							flag5 = flag3;
	//  234  449:iload           14
	//  235  451:istore          15
						} else
	//* 236  453:goto            638
						{
							resetSampleQueues();
	//  237  456:aload_0         
	//  238  457:invokespecial   #578 <Method void resetSampleQueues()>
							flag5 = flag3;
	//  239  460:iload           14
	//  240  462:istore          15
						}
						break label0;
	//  241  464:goto            638
					}
					if(mediaChunks.isEmpty() || Util.areEqual(((Object) (aflag)), ((Object) (trackselection))))
						break label1;
	//  242  467:aload_0         
	//  243  468:getfield        #151 <Field ArrayList mediaChunks>
	//  244  471:invokevirtual   #611 <Method boolean ArrayList.isEmpty()>
	//  245  474:ifne            583
	//  246  477:aload_2         
	//  247  478:aload           17
	//  248  480:invokestatic    #330 <Method boolean Util.areEqual(Object, Object)>
	//  249  483:ifne            583
					if(!seenFirstTrackSelection)
	//* 250  486:aload_0         
	//* 251  487:getfield        #681 <Field boolean seenFirstTrackSelection>
	//* 252  490:ifne            560
					{
						long l2 = 0L;
	//  253  493:lconst_0        
	//  254  494:lstore          12
						if(l < 0L)
	//* 255  496:lload           5
	//* 256  498:lconst_0        
	//* 257  499:lcmp            
	//* 258  500:ifge            508
							l2 = -l;
	//  259  503:lload           5
	//  260  505:lneg            
	//  261  506:lstore          12
						((TrackSelection) (aflag)).updateSelectedTrack(l, l2, 0x1L);
	//  262  508:aload_2         
	//  263  509:lload           5
	//  264  511:lload           12
	//  265  513:ldc2w           #357 <Long 0x1L>
	//  266  516:invokeinterface #703 <Method void TrackSelection.updateSelectedTrack(long, long, long)>
						int i1 = chunkSource.getTrackGroup().indexOf(getLastMediaChunk().trackFormat);
	//  267  521:aload_0         
	//  268  522:getfield        #110 <Field HlsChunkSource chunkSource>
	//  269  525:invokevirtual   #207 <Method TrackGroup HlsChunkSource.getTrackGroup()>
	//  270  528:aload_0         
	//  271  529:invokespecial   #443 <Method HlsMediaChunk getLastMediaChunk()>
	//  272  532:getfield        #638 <Field Format HlsMediaChunk.trackFormat>
	//  273  535:invokevirtual   #706 <Method int TrackGroup.indexOf(Format)>
	//  274  538:istore          8
						if(((TrackSelection) (aflag)).getSelectedIndexInTrackGroup() == i1)
	//* 275  540:aload_2         
	//* 276  541:invokeinterface #709 <Method int TrackSelection.getSelectedIndexInTrackGroup()>
	//* 277  546:iload           8
	//* 278  548:icmpeq          554
	//* 279  551:goto            560
						{
							flag1 = false;
	//  280  554:iconst_0        
	//  281  555:istore          8
							break label2;
	//  282  557:goto            563
						}
					}
					flag1 = true;
	//  283  560:iconst_1        
	//  284  561:istore          8
				}
				if(flag1)
	//* 285  563:iload           8
	//* 286  565:ifeq            583
				{
					pendingResetUpstreamFormats = true;
	//  287  568:aload_0         
	//  288  569:iconst_1        
	//  289  570:putfield        #405 <Field boolean pendingResetUpstreamFormats>
					flag = true;
	//  290  573:iconst_1        
	//  291  574:istore          7
					flag3 = flag;
	//  292  576:iload           7
	//  293  578:istore          14
				}
			}
	//* 294  580:goto            583
			flag5 = flag3;
	//  295  583:iload           14
	//  296  585:istore          15
			if(flag3)
	//* 297  587:iload           14
	//* 298  589:ifeq            638
			{
				seekToUs(l, flag);
	//  299  592:aload_0         
	//  300  593:lload           5
	//  301  595:iload           7
	//  302  597:invokevirtual   #711 <Method boolean seekToUs(long, boolean)>
	//  303  600:pop             
				int j1 = k1;
	//  304  601:iload           9
	//  305  603:istore          8
				do
				{
					flag5 = flag3;
	//  306  605:iload           14
	//  307  607:istore          15
					if(j1 >= asamplestream.length)
						break;
	//  308  609:iload           8
	//  309  611:aload_3         
	//  310  612:arraylength     
	//  311  613:icmpge          638
					if(asamplestream[j1] != null)
	//* 312  616:aload_3         
	//* 313  617:iload           8
	//* 314  619:aaload          
	//* 315  620:ifnull          629
						aflag1[j1] = true;
	//  316  623:aload           4
	//  317  625:iload           8
	//  318  627:iconst_1        
	//  319  628:bastore         
					j1++;
	//  320  629:iload           8
	//  321  631:iconst_1        
	//  322  632:iadd            
	//  323  633:istore          8
				} while(true);
	//  324  635:goto            605
			}
		}
		updateSampleStreams(asamplestream);
	//  325  638:aload_0         
	//  326  639:aload_3         
	//  327  640:invokespecial   #713 <Method void updateSampleStreams(SampleStream[])>
		seenFirstTrackSelection = true;
	//  328  643:aload_0         
	//  329  644:iconst_1        
	//  330  645:putfield        #681 <Field boolean seenFirstTrackSelection>
		return flag5;
	//  331  648:iload           15
	//  332  650:ireturn         
	}

	public void setIsTimestampMaster(boolean flag)
	{
		chunkSource.setIsTimestampMaster(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field HlsChunkSource chunkSource>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #716 <Method void HlsChunkSource.setIsTimestampMaster(boolean)>
	//    4    8:return          
	}

	public void setSampleOffsetUs(long l)
	{
		sampleOffsetUs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #719 <Field long sampleOffsetUs>
		SampleQueue asamplequeue[] = sampleQueues;
	//    3    5:aload_0         
	//    4    6:getfield        #142 <Field SampleQueue[] sampleQueues>
	//    5    9:astore          5
		int i = 0;
	//    6   11:iconst_0        
	//    7   12:istore_3        
		for(int j = asamplequeue.length; i < j; i++)
	//*   8   13:aload           5
	//*   9   15:arraylength     
	//*  10   16:istore          4
	//*  11   18:iload_3         
	//*  12   19:iload           4
	//*  13   21:icmpge          39
			asamplequeue[i].setSampleOffsetUs(l);
	//   14   24:aload           5
	//   15   26:iload_3         
	//   16   27:aaload          
	//   17   28:lload_1         
	//   18   29:invokevirtual   #721 <Method void SampleQueue.setSampleOffsetUs(long)>

	//   19   32:iload_3         
	//   20   33:iconst_1        
	//   21   34:iadd            
	//   22   35:istore_3        
	//*  23   36:goto            18
	//   24   39:return          
	}

	public int skipData(int i, long l)
	{
		if(isPendingReset())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #441 <Method boolean isPendingReset()>
	//*   2    4:ifeq            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		SampleQueue samplequeue = sampleQueues[i];
	//    5    9:aload_0         
	//    6   10:getfield        #142 <Field SampleQueue[] sampleQueues>
	//    7   13:iload_1         
	//    8   14:aaload          
	//    9   15:astore          5
		if(loadingFinished && l > samplequeue.getLargestQueuedTimestampUs())
	//*  10   17:aload_0         
	//*  11   18:getfield        #436 <Field boolean loadingFinished>
	//*  12   21:ifeq            40
	//*  13   24:lload_2         
	//*  14   25:aload           5
	//*  15   27:invokevirtual   #536 <Method long SampleQueue.getLargestQueuedTimestampUs()>
	//*  16   30:lcmp            
	//*  17   31:ifle            40
			return samplequeue.advanceToEnd();
	//   18   34:aload           5
	//   19   36:invokevirtual   #726 <Method int SampleQueue.advanceToEnd()>
	//   20   39:ireturn         
		int j = samplequeue.advanceTo(l, true, true);
	//   21   40:aload           5
	//   22   42:lload_2         
	//   23   43:iconst_1        
	//   24   44:iconst_1        
	//   25   45:invokevirtual   #417 <Method int SampleQueue.advanceTo(long, boolean, boolean)>
	//   26   48:istore          4
		i = j;
	//   27   50:iload           4
	//   28   52:istore_1        
		if(j == -1)
	//*  29   53:iload           4
	//*  30   55:iconst_m1       
	//*  31   56:icmpne          61
			i = 0;
	//   32   59:iconst_0        
	//   33   60:istore_1        
		return i;
	//   34   61:iload_1         
	//   35   62:ireturn         
	}

	public TrackOutput track(int i, int j)
	{
		SampleQueue asamplequeue[] = sampleQueues;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field SampleQueue[] sampleQueues>
	//    2    4:astore          6
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
		int i1 = asamplequeue.length;
	//    5    9:aload           6
	//    6   11:arraylength     
	//    7   12:istore          4
		if(j == 1)
	//*   8   14:iload_2         
	//*   9   15:iconst_1        
	//*  10   16:icmpne          101
		{
			if(audioSampleQueueIndex != -1)
	//*  11   19:aload_0         
	//*  12   20:getfield        #136 <Field int audioSampleQueueIndex>
	//*  13   23:iconst_m1       
	//*  14   24:icmpeq          88
				if(audioSampleQueueMappingDone)
	//*  15   27:aload_0         
	//*  16   28:getfield        #542 <Field boolean audioSampleQueueMappingDone>
	//*  17   31:ifeq            63
				{
					if(sampleQueueTrackIds[audioSampleQueueIndex] == i)
	//*  18   34:aload_0         
	//*  19   35:getfield        #134 <Field int[] sampleQueueTrackIds>
	//*  20   38:aload_0         
	//*  21   39:getfield        #136 <Field int audioSampleQueueIndex>
	//*  22   42:iaload          
	//*  23   43:iload_1         
	//*  24   44:icmpne          57
						return ((TrackOutput) (sampleQueues[audioSampleQueueIndex]));
	//   25   47:aload_0         
	//   26   48:getfield        #142 <Field SampleQueue[] sampleQueues>
	//   27   51:aload_0         
	//   28   52:getfield        #136 <Field int audioSampleQueueIndex>
	//   29   55:aaload          
	//   30   56:areturn         
					else
						return ((TrackOutput) (createDummyTrackOutput(i, j)));
	//   31   57:iload_1         
	//   32   58:iload_2         
	//   33   59:invokestatic    #730 <Method DummyTrackOutput createDummyTrackOutput(int, int)>
	//   34   62:areturn         
				} else
				{
					audioSampleQueueMappingDone = true;
	//   35   63:aload_0         
	//   36   64:iconst_1        
	//   37   65:putfield        #542 <Field boolean audioSampleQueueMappingDone>
					sampleQueueTrackIds[audioSampleQueueIndex] = i;
	//   38   68:aload_0         
	//   39   69:getfield        #134 <Field int[] sampleQueueTrackIds>
	//   40   72:aload_0         
	//   41   73:getfield        #136 <Field int audioSampleQueueIndex>
	//   42   76:iload_1         
	//   43   77:iastore         
					return ((TrackOutput) (sampleQueues[audioSampleQueueIndex]));
	//   44   78:aload_0         
	//   45   79:getfield        #142 <Field SampleQueue[] sampleQueues>
	//   46   82:aload_0         
	//   47   83:getfield        #136 <Field int audioSampleQueueIndex>
	//   48   86:aaload          
	//   49   87:areturn         
				}
			if(tracksEnded)
	//*  50   88:aload_0         
	//*  51   89:getfield        #516 <Field boolean tracksEnded>
	//*  52   92:ifeq            233
				return ((TrackOutput) (createDummyTrackOutput(i, j)));
	//   53   95:iload_1         
	//   54   96:iload_2         
	//   55   97:invokestatic    #730 <Method DummyTrackOutput createDummyTrackOutput(int, int)>
	//   56  100:areturn         
		} else
		if(j == 2)
	//*  57  101:iload_2         
	//*  58  102:iconst_2        
	//*  59  103:icmpne          188
		{
			if(videoSampleQueueIndex != -1)
	//*  60  106:aload_0         
	//*  61  107:getfield        #138 <Field int videoSampleQueueIndex>
	//*  62  110:iconst_m1       
	//*  63  111:icmpeq          175
				if(videoSampleQueueMappingDone)
	//*  64  114:aload_0         
	//*  65  115:getfield        #544 <Field boolean videoSampleQueueMappingDone>
	//*  66  118:ifeq            150
				{
					if(sampleQueueTrackIds[videoSampleQueueIndex] == i)
	//*  67  121:aload_0         
	//*  68  122:getfield        #134 <Field int[] sampleQueueTrackIds>
	//*  69  125:aload_0         
	//*  70  126:getfield        #138 <Field int videoSampleQueueIndex>
	//*  71  129:iaload          
	//*  72  130:iload_1         
	//*  73  131:icmpne          144
						return ((TrackOutput) (sampleQueues[videoSampleQueueIndex]));
	//   74  134:aload_0         
	//   75  135:getfield        #142 <Field SampleQueue[] sampleQueues>
	//   76  138:aload_0         
	//   77  139:getfield        #138 <Field int videoSampleQueueIndex>
	//   78  142:aaload          
	//   79  143:areturn         
					else
						return ((TrackOutput) (createDummyTrackOutput(i, j)));
	//   80  144:iload_1         
	//   81  145:iload_2         
	//   82  146:invokestatic    #730 <Method DummyTrackOutput createDummyTrackOutput(int, int)>
	//   83  149:areturn         
				} else
				{
					videoSampleQueueMappingDone = true;
	//   84  150:aload_0         
	//   85  151:iconst_1        
	//   86  152:putfield        #544 <Field boolean videoSampleQueueMappingDone>
					sampleQueueTrackIds[videoSampleQueueIndex] = i;
	//   87  155:aload_0         
	//   88  156:getfield        #134 <Field int[] sampleQueueTrackIds>
	//   89  159:aload_0         
	//   90  160:getfield        #138 <Field int videoSampleQueueIndex>
	//   91  163:iload_1         
	//   92  164:iastore         
					return ((TrackOutput) (sampleQueues[videoSampleQueueIndex]));
	//   93  165:aload_0         
	//   94  166:getfield        #142 <Field SampleQueue[] sampleQueues>
	//   95  169:aload_0         
	//   96  170:getfield        #138 <Field int videoSampleQueueIndex>
	//   97  173:aaload          
	//   98  174:areturn         
				}
			if(tracksEnded)
	//*  99  175:aload_0         
	//* 100  176:getfield        #516 <Field boolean tracksEnded>
	//* 101  179:ifeq            233
				return ((TrackOutput) (createDummyTrackOutput(i, j)));
	//  102  182:iload_1         
	//  103  183:iload_2         
	//  104  184:invokestatic    #730 <Method DummyTrackOutput createDummyTrackOutput(int, int)>
	//  105  187:areturn         
		} else
		{
			for(int k = 0; k < i1; k++)
	//* 106  188:iconst_0        
	//* 107  189:istore_3        
	//* 108  190:iload_3         
	//* 109  191:iload           4
	//* 110  193:icmpge          220
				if(sampleQueueTrackIds[k] == i)
	//* 111  196:aload_0         
	//* 112  197:getfield        #134 <Field int[] sampleQueueTrackIds>
	//* 113  200:iload_3         
	//* 114  201:iaload          
	//* 115  202:iload_1         
	//* 116  203:icmpne          213
					return ((TrackOutput) (sampleQueues[k]));
	//  117  206:aload_0         
	//  118  207:getfield        #142 <Field SampleQueue[] sampleQueues>
	//  119  210:iload_3         
	//  120  211:aaload          
	//  121  212:areturn         

	//  122  213:iload_3         
	//  123  214:iconst_1        
	//  124  215:iadd            
	//  125  216:istore_3        
	//* 126  217:goto            190
			if(tracksEnded)
	//* 127  220:aload_0         
	//* 128  221:getfield        #516 <Field boolean tracksEnded>
	//* 129  224:ifeq            233
				return ((TrackOutput) (createDummyTrackOutput(i, j)));
	//  130  227:iload_1         
	//  131  228:iload_2         
	//  132  229:invokestatic    #730 <Method DummyTrackOutput createDummyTrackOutput(int, int)>
	//  133  232:areturn         
		}
		SampleQueue samplequeue = new SampleQueue(allocator);
	//  134  233:new             #140 <Class SampleQueue>
	//  135  236:dup             
	//  136  237:aload_0         
	//  137  238:getfield        #112 <Field Allocator allocator>
	//  138  241:invokespecial   #733 <Method void SampleQueue(Allocator)>
	//  139  244:astore          6
		samplequeue.sourceId(chunkUid);
	//  140  246:aload           6
	//  141  248:aload_0         
	//  142  249:getfield        #546 <Field int chunkUid>
	//  143  252:invokevirtual   #550 <Method void SampleQueue.sourceId(int)>
		samplequeue.setSampleOffsetUs(sampleOffsetUs);
	//  144  255:aload           6
	//  145  257:aload_0         
	//  146  258:getfield        #719 <Field long sampleOffsetUs>
	//  147  261:invokevirtual   #721 <Method void SampleQueue.setSampleOffsetUs(long)>
		samplequeue.setUpstreamFormatChangeListener(((com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener) (this)));
	//  148  264:aload           6
	//  149  266:aload_0         
	//  150  267:invokevirtual   #737 <Method void SampleQueue.setUpstreamFormatChangeListener(com.google.android.exoplayer2.source.SampleQueue$UpstreamFormatChangedListener)>
		int ai[] = sampleQueueTrackIds;
	//  151  270:aload_0         
	//  152  271:getfield        #134 <Field int[] sampleQueueTrackIds>
	//  153  274:astore          7
		int l = i1 + 1;
	//  154  276:iload           4
	//  155  278:iconst_1        
	//  156  279:iadd            
	//  157  280:istore_3        
		sampleQueueTrackIds = Arrays.copyOf(ai, l);
	//  158  281:aload_0         
	//  159  282:aload           7
	//  160  284:iload_3         
	//  161  285:invokestatic    #741 <Method int[] Arrays.copyOf(int[], int)>
	//  162  288:putfield        #134 <Field int[] sampleQueueTrackIds>
		sampleQueueTrackIds[i1] = i;
	//  163  291:aload_0         
	//  164  292:getfield        #134 <Field int[] sampleQueueTrackIds>
	//  165  295:iload           4
	//  166  297:iload_1         
	//  167  298:iastore         
		sampleQueues = (SampleQueue[])Arrays.copyOf(((Object []) (sampleQueues)), l);
	//  168  299:aload_0         
	//  169  300:aload_0         
	//  170  301:getfield        #142 <Field SampleQueue[] sampleQueues>
	//  171  304:iload_3         
	//  172  305:invokestatic    #744 <Method Object[] Arrays.copyOf(Object[], int)>
	//  173  308:checkcast       #745 <Class SampleQueue[]>
	//  174  311:putfield        #142 <Field SampleQueue[] sampleQueues>
		sampleQueues[i1] = samplequeue;
	//  175  314:aload_0         
	//  176  315:getfield        #142 <Field SampleQueue[] sampleQueues>
	//  177  318:iload           4
	//  178  320:aload           6
	//  179  322:aastore         
		sampleQueueIsAudioVideoFlags = Arrays.copyOf(sampleQueueIsAudioVideoFlags, l);
	//  180  323:aload_0         
	//  181  324:aload_0         
	//  182  325:getfield        #144 <Field boolean[] sampleQueueIsAudioVideoFlags>
	//  183  328:iload_3         
	//  184  329:invokestatic    #748 <Method boolean[] Arrays.copyOf(boolean[], int)>
	//  185  332:putfield        #144 <Field boolean[] sampleQueueIsAudioVideoFlags>
		ai = ((int []) (sampleQueueIsAudioVideoFlags));
	//  186  335:aload_0         
	//  187  336:getfield        #144 <Field boolean[] sampleQueueIsAudioVideoFlags>
	//  188  339:astore          7
		if(j == 1 || j == 2)
	//* 189  341:iload_2         
	//* 190  342:iconst_1        
	//* 191  343:icmpeq          351
	//* 192  346:iload_2         
	//* 193  347:iconst_2        
	//* 194  348:icmpne          354
			flag = true;
	//  195  351:iconst_1        
	//  196  352:istore          5
		ai[i1] = flag;
	//  197  354:aload           7
	//  198  356:iload           4
	//  199  358:iload           5
	//  200  360:bastore         
		haveAudioVideoSampleQueues = haveAudioVideoSampleQueues | sampleQueueIsAudioVideoFlags[i1];
	//  201  361:aload_0         
	//  202  362:aload_0         
	//  203  363:getfield        #419 <Field boolean haveAudioVideoSampleQueues>
	//  204  366:aload_0         
	//  205  367:getfield        #144 <Field boolean[] sampleQueueIsAudioVideoFlags>
	//  206  370:iload           4
	//  207  372:baload          
	//  208  373:ior             
	//  209  374:putfield        #419 <Field boolean haveAudioVideoSampleQueues>
		if(j == 1)
	//* 210  377:iload_2         
	//* 211  378:iconst_1        
	//* 212  379:icmpne          396
		{
			audioSampleQueueMappingDone = true;
	//  213  382:aload_0         
	//  214  383:iconst_1        
	//  215  384:putfield        #542 <Field boolean audioSampleQueueMappingDone>
			audioSampleQueueIndex = i1;
	//  216  387:aload_0         
	//  217  388:iload           4
	//  218  390:putfield        #136 <Field int audioSampleQueueIndex>
		} else
	//* 219  393:goto            412
		if(j == 2)
	//* 220  396:iload_2         
	//* 221  397:iconst_2        
	//* 222  398:icmpne          412
		{
			videoSampleQueueMappingDone = true;
	//  223  401:aload_0         
	//  224  402:iconst_1        
	//  225  403:putfield        #544 <Field boolean videoSampleQueueMappingDone>
			videoSampleQueueIndex = i1;
	//  226  406:aload_0         
	//  227  407:iload           4
	//  228  409:putfield        #138 <Field int videoSampleQueueIndex>
		}
		sampleQueuesEnabledStates = Arrays.copyOf(sampleQueuesEnabledStates, l);
	//  229  412:aload_0         
	//  230  413:aload_0         
	//  231  414:getfield        #146 <Field boolean[] sampleQueuesEnabledStates>
	//  232  417:iload_3         
	//  233  418:invokestatic    #748 <Method boolean[] Arrays.copyOf(boolean[], int)>
	//  234  421:putfield        #146 <Field boolean[] sampleQueuesEnabledStates>
		return ((TrackOutput) (samplequeue));
	//  235  424:aload           6
	//  236  426:areturn         
	}

	public void unbindSampleQueue(int i)
	{
		i = trackGroupToSampleQueueIndex[i];
	//    0    0:aload_0         
	//    1    1:getfield        #216 <Field int[] trackGroupToSampleQueueIndex>
	//    2    4:iload_1         
	//    3    5:iaload          
	//    4    6:istore_1        
		Assertions.checkState(sampleQueuesEnabledStates[i]);
	//    5    7:aload_0         
	//    6    8:getfield        #146 <Field boolean[] sampleQueuesEnabledStates>
	//    7   11:iload_1         
	//    8   12:baload          
	//    9   13:invokestatic    #242 <Method void Assertions.checkState(boolean)>
		sampleQueuesEnabledStates[i] = false;
	//   10   16:aload_0         
	//   11   17:getfield        #146 <Field boolean[] sampleQueuesEnabledStates>
	//   12   20:iload_1         
	//   13   21:iconst_0        
	//   14   22:bastore         
	//   15   23:return          
	}

	private static final int PRIMARY_TYPE_AUDIO = 2;
	private static final int PRIMARY_TYPE_NONE = 0;
	private static final int PRIMARY_TYPE_TEXT = 1;
	private static final int PRIMARY_TYPE_VIDEO = 3;
	public static final int SAMPLE_QUEUE_INDEX_NO_MAPPING_FATAL = -2;
	public static final int SAMPLE_QUEUE_INDEX_NO_MAPPING_NON_FATAL = -3;
	public static final int SAMPLE_QUEUE_INDEX_PENDING = -1;
	private static final String TAG = "HlsSampleStreamWrapper";
	private final Allocator allocator;
	private int audioSampleQueueIndex;
	private boolean audioSampleQueueMappingDone;
	private final Callback callback;
	private final HlsChunkSource chunkSource;
	private int chunkUid;
	private Format downstreamTrackFormat;
	private int enabledTrackGroupCount;
	private final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher eventDispatcher;
	private final Handler handler = new Handler();
	private boolean haveAudioVideoSampleQueues;
	private final ArrayList hlsSampleStreams = new ArrayList();
	private long lastSeekPositionUs;
	private final Loader loader = new Loader("Loader:HlsSampleStreamWrapper");
	private boolean loadingFinished;
	private final Runnable maybeFinishPrepareRunnable = new Runnable() {

		public void run()
		{
			maybeFinishPrepare();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field HlsSampleStreamWrapper this$0>
		//    2    4:invokestatic    #24  <Method void HlsSampleStreamWrapper.access$000(HlsSampleStreamWrapper)>
		//    3    7:return          
		}

		final HlsSampleStreamWrapper this$0;

			
			{
				this$0 = HlsSampleStreamWrapper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field HlsSampleStreamWrapper this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private final ArrayList mediaChunks = new ArrayList();
	private final int minLoadableRetryCount;
	private final Format muxedAudioFormat;
	private final HlsChunkSource.HlsChunkHolder nextChunkHolder = new HlsChunkSource.HlsChunkHolder();
	private final Runnable onTracksEndedRunnable = new Runnable() {

		public void run()
		{
			onTracksEnded();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field HlsSampleStreamWrapper this$0>
		//    2    4:invokestatic    #24  <Method void HlsSampleStreamWrapper.access$100(HlsSampleStreamWrapper)>
		//    3    7:return          
		}

		final HlsSampleStreamWrapper this$0;

			
			{
				this$0 = HlsSampleStreamWrapper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field HlsSampleStreamWrapper this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private TrackGroupArray optionalTrackGroups;
	private long pendingResetPositionUs;
	private boolean pendingResetUpstreamFormats;
	private boolean prepared;
	private int primaryTrackGroupIndex;
	private boolean released;
	private long sampleOffsetUs;
	private boolean sampleQueueIsAudioVideoFlags[];
	private int sampleQueueTrackIds[];
	private SampleQueue sampleQueues[];
	private boolean sampleQueuesBuilt;
	private boolean sampleQueuesEnabledStates[];
	private boolean seenFirstTrackSelection;
	private int trackGroupToSampleQueueIndex[];
	private TrackGroupArray trackGroups;
	private final int trackType;
	private boolean tracksEnded;
	private int videoSampleQueueIndex;
	private boolean videoSampleQueueMappingDone;


/*
	static void access$000(HlsSampleStreamWrapper hlssamplestreamwrapper)
	{
		hlssamplestreamwrapper.maybeFinishPrepare();
	//    0    0:aload_0         
	//    1    1:invokespecial   #175 <Method void maybeFinishPrepare()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$100(HlsSampleStreamWrapper hlssamplestreamwrapper)
	{
		hlssamplestreamwrapper.onTracksEnded();
	//    0    0:aload_0         
	//    1    1:invokespecial   #179 <Method void onTracksEnded()>
		return;
	//    2    4:return          
	}

*/
}
