// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.rawcc.RawCcExtractor;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.chunk.*;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.*;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.source.dash:
//			DashChunkSource, DashWrappingSegmentIndex, DashSegmentIndex

public class DefaultDashChunkSource
	implements DashChunkSource
{
	public static final class Factory
		implements DashChunkSource.Factory
	{

		public DashChunkSource createDashChunkSource(LoaderErrorThrower loadererrorthrower, DashManifest dashmanifest, int i, int ai[], TrackSelection trackselection, int j, long l, boolean flag, boolean flag1, PlayerEmsgHandler.PlayerTrackEmsgHandler playertrackemsghandler)
		{
			return ((DashChunkSource) (new DefaultDashChunkSource(loadererrorthrower, dashmanifest, i, ai, trackselection, j, dataSourceFactory.createDataSource(), l, maxSegmentsPerLoad, flag, flag1, playertrackemsghandler)));
		//    0    0:new             #8   <Class DefaultDashChunkSource>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:iload_3         
		//    5    7:aload           4
		//    6    9:aload           5
		//    7   11:iload           6
		//    8   13:aload_0         
		//    9   14:getfield        #24  <Field com.google.android.exoplayer2.upstream.DataSource$Factory dataSourceFactory>
		//   10   17:invokeinterface #35  <Method DataSource com.google.android.exoplayer2.upstream.DataSource$Factory.createDataSource()>
		//   11   22:lload           7
		//   12   24:aload_0         
		//   13   25:getfield        #26  <Field int maxSegmentsPerLoad>
		//   14   28:iload           9
		//   15   30:iload           10
		//   16   32:aload           11
		//   17   34:invokespecial   #38  <Method void DefaultDashChunkSource(LoaderErrorThrower, DashManifest, int, int[], TrackSelection, int, DataSource, long, int, boolean, boolean, PlayerEmsgHandler$PlayerTrackEmsgHandler)>
		//   18   37:areturn         
		}

		private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
		private final int maxSegmentsPerLoad;

		public Factory(com.google.android.exoplayer2.upstream.DataSource.Factory factory)
		{
			this(factory, 1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iconst_1        
		//    3    3:invokespecial   #18  <Method void DefaultDashChunkSource$Factory(com.google.android.exoplayer2.upstream.DataSource$Factory, int)>
		//    4    6:return          
		}

		public Factory(com.google.android.exoplayer2.upstream.DataSource.Factory factory, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			dataSourceFactory = factory;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #24  <Field com.google.android.exoplayer2.upstream.DataSource$Factory dataSourceFactory>
			maxSegmentsPerLoad = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #26  <Field int maxSegmentsPerLoad>
		//    8   14:return          
		}
	}

	protected static final class RepresentationHolder
	{

		private static boolean mimeTypeIsRawText(String s)
		{
			return MimeTypes.isText(s) || "application/ttml+xml".equals(((Object) (s)));
		//    0    0:aload_0         
		//    1    1:invokestatic    #102 <Method boolean MimeTypes.isText(String)>
		//    2    4:ifne            21
		//    3    7:ldc1            #104 <String "application/ttml+xml">
		//    4    9:aload_0         
		//    5   10:invokevirtual   #51  <Method boolean String.equals(Object)>
		//    6   13:ifeq            19
		//    7   16:goto            21
		//    8   19:iconst_0        
		//    9   20:ireturn         
		//   10   21:iconst_1        
		//   11   22:ireturn         
		}

		private static boolean mimeTypeIsWebm(String s)
		{
			return s.startsWith("video/webm") || s.startsWith("audio/webm") || s.startsWith("application/webm");
		//    0    0:aload_0         
		//    1    1:ldc1            #106 <String "video/webm">
		//    2    3:invokevirtual   #109 <Method boolean String.startsWith(String)>
		//    3    6:ifne            32
		//    4    9:aload_0         
		//    5   10:ldc1            #111 <String "audio/webm">
		//    6   12:invokevirtual   #109 <Method boolean String.startsWith(String)>
		//    7   15:ifne            32
		//    8   18:aload_0         
		//    9   19:ldc1            #113 <String "application/webm">
		//   10   21:invokevirtual   #109 <Method boolean String.startsWith(String)>
		//   11   24:ifeq            30
		//   12   27:goto            32
		//   13   30:iconst_0        
		//   14   31:ireturn         
		//   15   32:iconst_1        
		//   16   33:ireturn         
		}

		public long getFirstSegmentNum()
		{
			return segmentIndex.getFirstSegmentNum() + segmentNumShift;
		//    0    0:aload_0         
		//    1    1:getfield        #96  <Field DashSegmentIndex segmentIndex>
		//    2    4:invokeinterface #119 <Method long DashSegmentIndex.getFirstSegmentNum()>
		//    3    9:aload_0         
		//    4   10:getfield        #121 <Field long segmentNumShift>
		//    5   13:ladd            
		//    6   14:lreturn         
		}

		public int getSegmentCount()
		{
			return segmentIndex.getSegmentCount(periodDurationUs);
		//    0    0:aload_0         
		//    1    1:getfield        #96  <Field DashSegmentIndex segmentIndex>
		//    2    4:aload_0         
		//    3    5:getfield        #23  <Field long periodDurationUs>
		//    4    8:invokeinterface #126 <Method int DashSegmentIndex.getSegmentCount(long)>
		//    5   13:ireturn         
		}

		public long getSegmentEndTimeUs(long l)
		{
			return getSegmentStartTimeUs(l) + segmentIndex.getDurationUs(l - segmentNumShift, periodDurationUs);
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:invokevirtual   #131 <Method long getSegmentStartTimeUs(long)>
		//    3    5:aload_0         
		//    4    6:getfield        #96  <Field DashSegmentIndex segmentIndex>
		//    5    9:lload_1         
		//    6   10:aload_0         
		//    7   11:getfield        #121 <Field long segmentNumShift>
		//    8   14:lsub            
		//    9   15:aload_0         
		//   10   16:getfield        #23  <Field long periodDurationUs>
		//   11   19:invokeinterface #135 <Method long DashSegmentIndex.getDurationUs(long, long)>
		//   12   24:ladd            
		//   13   25:lreturn         
		}

		public long getSegmentNum(long l)
		{
			return segmentIndex.getSegmentNum(l, periodDurationUs) + segmentNumShift;
		//    0    0:aload_0         
		//    1    1:getfield        #96  <Field DashSegmentIndex segmentIndex>
		//    2    4:lload_1         
		//    3    5:aload_0         
		//    4    6:getfield        #23  <Field long periodDurationUs>
		//    5    9:invokeinterface #138 <Method long DashSegmentIndex.getSegmentNum(long, long)>
		//    6   14:aload_0         
		//    7   15:getfield        #121 <Field long segmentNumShift>
		//    8   18:ladd            
		//    9   19:lreturn         
		}

		public long getSegmentStartTimeUs(long l)
		{
			return segmentIndex.getTimeUs(l - segmentNumShift);
		//    0    0:aload_0         
		//    1    1:getfield        #96  <Field DashSegmentIndex segmentIndex>
		//    2    4:lload_1         
		//    3    5:aload_0         
		//    4    6:getfield        #121 <Field long segmentNumShift>
		//    5    9:lsub            
		//    6   10:invokeinterface #141 <Method long DashSegmentIndex.getTimeUs(long)>
		//    7   15:lreturn         
		}

		public RangedUri getSegmentUrl(long l)
		{
			return segmentIndex.getSegmentUrl(l - segmentNumShift);
		//    0    0:aload_0         
		//    1    1:getfield        #96  <Field DashSegmentIndex segmentIndex>
		//    2    4:lload_1         
		//    3    5:aload_0         
		//    4    6:getfield        #121 <Field long segmentNumShift>
		//    5    9:lsub            
		//    6   10:invokeinterface #145 <Method RangedUri DashSegmentIndex.getSegmentUrl(long)>
		//    7   15:areturn         
		}

		void updateRepresentation(long l, Representation representation1)
			throws BehindLiveWindowException
		{
			DashSegmentIndex dashsegmentindex = representation.getIndex();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Representation representation>
		//    2    4:invokevirtual   #94  <Method DashSegmentIndex Representation.getIndex()>
		//    3    7:astore          11
			DashSegmentIndex dashsegmentindex1 = representation1.getIndex();
		//    4    9:aload_3         
		//    5   10:invokevirtual   #94  <Method DashSegmentIndex Representation.getIndex()>
		//    6   13:astore          12
			periodDurationUs = l;
		//    7   15:aload_0         
		//    8   16:lload_1         
		//    9   17:putfield        #23  <Field long periodDurationUs>
			representation = representation1;
		//   10   20:aload_0         
		//   11   21:aload_3         
		//   12   22:putfield        #25  <Field Representation representation>
			if(dashsegmentindex == null)
		//*  13   25:aload           11
		//*  14   27:ifnonnull       31
				return;
		//   15   30:return          
			segmentIndex = dashsegmentindex1;
		//   16   31:aload_0         
		//   17   32:aload           12
		//   18   34:putfield        #96  <Field DashSegmentIndex segmentIndex>
			if(!dashsegmentindex.isExplicit())
		//*  19   37:aload           11
		//*  20   39:invokeinterface #153 <Method boolean DashSegmentIndex.isExplicit()>
		//*  21   44:ifne            48
				return;
		//   22   47:return          
			int i = dashsegmentindex.getSegmentCount(periodDurationUs);
		//   23   48:aload           11
		//   24   50:aload_0         
		//   25   51:getfield        #23  <Field long periodDurationUs>
		//   26   54:invokeinterface #126 <Method int DashSegmentIndex.getSegmentCount(long)>
		//   27   59:istore          4
			if(i == 0)
		//*  28   61:iload           4
		//*  29   63:ifne            67
				return;
		//   30   66:return          
			l = (dashsegmentindex.getFirstSegmentNum() + (long)i) - 1L;
		//   31   67:aload           11
		//   32   69:invokeinterface #119 <Method long DashSegmentIndex.getFirstSegmentNum()>
		//   33   74:iload           4
		//   34   76:i2l             
		//   35   77:ladd            
		//   36   78:lconst_1        
		//   37   79:lsub            
		//   38   80:lstore_1        
			long l1 = dashsegmentindex.getTimeUs(l) + dashsegmentindex.getDurationUs(l, periodDurationUs);
		//   39   81:aload           11
		//   40   83:lload_1         
		//   41   84:invokeinterface #141 <Method long DashSegmentIndex.getTimeUs(long)>
		//   42   89:aload           11
		//   43   91:lload_1         
		//   44   92:aload_0         
		//   45   93:getfield        #23  <Field long periodDurationUs>
		//   46   96:invokeinterface #135 <Method long DashSegmentIndex.getDurationUs(long, long)>
		//   47  101:ladd            
		//   48  102:lstore          5
			long l2 = dashsegmentindex1.getFirstSegmentNum();
		//   49  104:aload           12
		//   50  106:invokeinterface #119 <Method long DashSegmentIndex.getFirstSegmentNum()>
		//   51  111:lstore          7
			long l3 = dashsegmentindex1.getTimeUs(l2);
		//   52  113:aload           12
		//   53  115:lload           7
		//   54  117:invokeinterface #141 <Method long DashSegmentIndex.getTimeUs(long)>
		//   55  122:lstore          9
			if(l1 == l3)
		//*  56  124:lload           5
		//*  57  126:lload           9
		//*  58  128:lcmp            
		//*  59  129:ifne            148
			{
				segmentNumShift = segmentNumShift + ((l + 1L) - l2);
		//   60  132:aload_0         
		//   61  133:aload_0         
		//   62  134:getfield        #121 <Field long segmentNumShift>
		//   63  137:lload_1         
		//   64  138:lconst_1        
		//   65  139:ladd            
		//   66  140:lload           7
		//   67  142:lsub            
		//   68  143:ladd            
		//   69  144:putfield        #121 <Field long segmentNumShift>
				return;
		//   70  147:return          
			}
			if(l1 < l3)
		//*  71  148:lload           5
		//*  72  150:lload           9
		//*  73  152:lcmp            
		//*  74  153:ifge            164
			{
				throw new BehindLiveWindowException();
		//   75  156:new             #149 <Class BehindLiveWindowException>
		//   76  159:dup             
		//   77  160:invokespecial   #154 <Method void BehindLiveWindowException()>
		//   78  163:athrow          
			} else
			{
				segmentNumShift = segmentNumShift + (dashsegmentindex.getSegmentNum(l3, periodDurationUs) - l2);
		//   79  164:aload_0         
		//   80  165:aload_0         
		//   81  166:getfield        #121 <Field long segmentNumShift>
		//   82  169:aload           11
		//   83  171:lload           9
		//   84  173:aload_0         
		//   85  174:getfield        #23  <Field long periodDurationUs>
		//   86  177:invokeinterface #138 <Method long DashSegmentIndex.getSegmentNum(long, long)>
		//   87  182:lload           7
		//   88  184:lsub            
		//   89  185:ladd            
		//   90  186:putfield        #121 <Field long segmentNumShift>
				return;
		//   91  189:return          
			}
		}

		final ChunkExtractorWrapper extractorWrapper;
		private long periodDurationUs;
		public Representation representation;
		public DashSegmentIndex segmentIndex;
		private long segmentNumShift;

		RepresentationHolder(long l, int i, Representation representation1, boolean flag, boolean flag1, TrackOutput trackoutput)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			periodDurationUs = l;
		//    2    4:aload_0         
		//    3    5:lload_1         
		//    4    6:putfield        #23  <Field long periodDurationUs>
			representation = representation1;
		//    5    9:aload_0         
		//    6   10:aload           4
		//    7   12:putfield        #25  <Field Representation representation>
			String s = representation1.format.containerMimeType;
		//    8   15:aload           4
		//    9   17:getfield        #31  <Field Format Representation.format>
		//   10   20:getfield        #37  <Field String Format.containerMimeType>
		//   11   23:astore          9
			if(mimeTypeIsRawText(s))
		//*  12   25:aload           9
		//*  13   27:invokestatic    #41  <Method boolean mimeTypeIsRawText(String)>
		//*  14   30:ifeq            41
			{
				extractorWrapper = null;
		//   15   33:aload_0         
		//   16   34:aconst_null     
		//   17   35:putfield        #43  <Field ChunkExtractorWrapper extractorWrapper>
			} else
		//*  18   38:goto            169
			{
				if("application/x-rawcc".equals(((Object) (s))))
		//*  19   41:ldc1            #45  <String "application/x-rawcc">
		//*  20   43:aload           9
		//*  21   45:invokevirtual   #51  <Method boolean String.equals(Object)>
		//*  22   48:ifeq            68
					trackoutput = ((TrackOutput) (new RawCcExtractor(representation1.format)));
		//   23   51:new             #53  <Class RawCcExtractor>
		//   24   54:dup             
		//   25   55:aload           4
		//   26   57:getfield        #31  <Field Format Representation.format>
		//   27   60:invokespecial   #56  <Method void RawCcExtractor(Format)>
		//   28   63:astore          7
				else
		//*  29   65:goto            150
				if(mimeTypeIsWebm(s))
		//*  30   68:aload           9
		//*  31   70:invokestatic    #59  <Method boolean mimeTypeIsWebm(String)>
		//*  32   73:ifeq            89
				{
					trackoutput = ((TrackOutput) (new MatroskaExtractor(1)));
		//   33   76:new             #61  <Class MatroskaExtractor>
		//   34   79:dup             
		//   35   80:iconst_1        
		//   36   81:invokespecial   #64  <Method void MatroskaExtractor(int)>
		//   37   84:astore          7
				} else
		//*  38   86:goto            150
				{
					byte byte0;
					if(flag)
		//*  39   89:iload           5
		//*  40   91:ifeq            100
						byte0 = 4;
		//   41   94:iconst_4        
		//   42   95:istore          8
					else
		//*  43   97:goto            103
						byte0 = 0;
		//   44  100:iconst_0        
		//   45  101:istore          8
					List list;
					if(flag1)
		//*  46  103:iload           6
		//*  47  105:ifeq            124
						list = Collections.singletonList(((Object) (Format.createTextSampleFormat(((String) (null)), "application/cea-608", 0, ((String) (null))))));
		//   48  108:aconst_null     
		//   49  109:ldc1            #66  <String "application/cea-608">
		//   50  111:iconst_0        
		//   51  112:aconst_null     
		//   52  113:invokestatic    #70  <Method Format Format.createTextSampleFormat(String, String, int, String)>
		//   53  116:invokestatic    #76  <Method List Collections.singletonList(Object)>
		//   54  119:astore          9
					else
		//*  55  121:goto            132
						list = Collections.emptyList();
		//   56  124:invokestatic    #80  <Method List Collections.emptyList()>
		//   57  127:astore          9
		//*  58  129:goto            121
					trackoutput = ((TrackOutput) (new FragmentedMp4Extractor(((int) (byte0)), ((com.google.android.exoplayer2.util.TimestampAdjuster) (null)), ((com.google.android.exoplayer2.extractor.mp4.Track) (null)), ((com.google.android.exoplayer2.drm.DrmInitData) (null)), list, trackoutput)));
		//   59  132:new             #82  <Class FragmentedMp4Extractor>
		//   60  135:dup             
		//   61  136:iload           8
		//   62  138:aconst_null     
		//   63  139:aconst_null     
		//   64  140:aconst_null     
		//   65  141:aload           9
		//   66  143:aload           7
		//   67  145:invokespecial   #85  <Method void FragmentedMp4Extractor(int, com.google.android.exoplayer2.util.TimestampAdjuster, com.google.android.exoplayer2.extractor.mp4.Track, com.google.android.exoplayer2.drm.DrmInitData, List, TrackOutput)>
		//   68  148:astore          7
				}
				extractorWrapper = new ChunkExtractorWrapper(((com.google.android.exoplayer2.extractor.Extractor) (trackoutput)), i, representation1.format);
		//   69  150:aload_0         
		//   70  151:new             #87  <Class ChunkExtractorWrapper>
		//   71  154:dup             
		//   72  155:aload           7
		//   73  157:iload_3         
		//   74  158:aload           4
		//   75  160:getfield        #31  <Field Format Representation.format>
		//   76  163:invokespecial   #90  <Method void ChunkExtractorWrapper(com.google.android.exoplayer2.extractor.Extractor, int, Format)>
		//   77  166:putfield        #43  <Field ChunkExtractorWrapper extractorWrapper>
			}
			segmentIndex = representation1.getIndex();
		//   78  169:aload_0         
		//   79  170:aload           4
		//   80  172:invokevirtual   #94  <Method DashSegmentIndex Representation.getIndex()>
		//   81  175:putfield        #96  <Field DashSegmentIndex segmentIndex>
		//   82  178:return          
		}
	}


	public DefaultDashChunkSource(LoaderErrorThrower loadererrorthrower, DashManifest dashmanifest, int i, int ai[], TrackSelection trackselection, int j, DataSource datasource, 
			long l, int k, boolean flag, boolean flag1, PlayerEmsgHandler.PlayerTrackEmsgHandler playertrackemsghandler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		manifestLoaderErrorThrower = loadererrorthrower;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #45  <Field LoaderErrorThrower manifestLoaderErrorThrower>
		manifest = dashmanifest;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #47  <Field DashManifest manifest>
		adaptationSetIndices = ai;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #49  <Field int[] adaptationSetIndices>
		trackSelection = trackselection;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #51  <Field TrackSelection trackSelection>
		trackType = j;
	//   14   26:aload_0         
	//   15   27:iload           6
	//   16   29:putfield        #53  <Field int trackType>
		dataSource = datasource;
	//   17   32:aload_0         
	//   18   33:aload           7
	//   19   35:putfield        #55  <Field DataSource dataSource>
		periodIndex = i;
	//   20   38:aload_0         
	//   21   39:iload_3         
	//   22   40:putfield        #57  <Field int periodIndex>
		elapsedRealtimeOffsetMs = l;
	//   23   43:aload_0         
	//   24   44:lload           8
	//   25   46:putfield        #59  <Field long elapsedRealtimeOffsetMs>
		maxSegmentsPerLoad = k;
	//   26   49:aload_0         
	//   27   50:iload           10
	//   28   52:putfield        #61  <Field int maxSegmentsPerLoad>
		playerTrackEmsgHandler = playertrackemsghandler;
	//   29   55:aload_0         
	//   30   56:aload           13
	//   31   58:putfield        #63  <Field PlayerEmsgHandler$PlayerTrackEmsgHandler playerTrackEmsgHandler>
		l = dashmanifest.getPeriodDurationUs(i);
	//   32   61:aload_2         
	//   33   62:iload_3         
	//   34   63:invokevirtual   #69  <Method long DashManifest.getPeriodDurationUs(int)>
	//   35   66:lstore          8
		liveEdgeTimeUs = 0x1L;
	//   36   68:aload_0         
	//   37   69:ldc2w           #70  <Long 0x1L>
	//   38   72:putfield        #73  <Field long liveEdgeTimeUs>
		loadererrorthrower = ((LoaderErrorThrower) (getRepresentations()));
	//   39   75:aload_0         
	//   40   76:invokespecial   #77  <Method ArrayList getRepresentations()>
	//   41   79:astore_1        
		representationHolders = new RepresentationHolder[trackselection.length()];
	//   42   80:aload_0         
	//   43   81:aload           5
	//   44   83:invokeinterface #83  <Method int TrackSelection.length()>
	//   45   88:anewarray       RepresentationHolder[]
	//   46   91:putfield        #85  <Field DefaultDashChunkSource$RepresentationHolder[] representationHolders>
		for(i = 0; i < representationHolders.length; i++)
	//*  47   94:iconst_0        
	//*  48   95:istore_3        
	//*  49   96:iload_3         
	//*  50   97:aload_0         
	//*  51   98:getfield        #85  <Field DefaultDashChunkSource$RepresentationHolder[] representationHolders>
	//*  52  101:arraylength     
	//*  53  102:icmpge          154
		{
			dashmanifest = ((DashManifest) ((Representation)((List) (loadererrorthrower)).get(trackselection.getIndexInTrackGroup(i))));
	//   54  105:aload_1         
	//   55  106:aload           5
	//   56  108:iload_3         
	//   57  109:invokeinterface #89  <Method int TrackSelection.getIndexInTrackGroup(int)>
	//   58  114:invokeinterface #95  <Method Object List.get(int)>
	//   59  119:checkcast       #97  <Class Representation>
	//   60  122:astore_2        
			representationHolders[i] = new RepresentationHolder(l, j, ((Representation) (dashmanifest)), flag, flag1, ((TrackOutput) (playertrackemsghandler)));
	//   61  123:aload_0         
	//   62  124:getfield        #85  <Field DefaultDashChunkSource$RepresentationHolder[] representationHolders>
	//   63  127:iload_3         
	//   64  128:new             #11  <Class DefaultDashChunkSource$RepresentationHolder>
	//   65  131:dup             
	//   66  132:lload           8
	//   67  134:iload           6
	//   68  136:aload_2         
	//   69  137:iload           11
	//   70  139:iload           12
	//   71  141:aload           13
	//   72  143:invokespecial   #100 <Method void DefaultDashChunkSource$RepresentationHolder(long, int, Representation, boolean, boolean, TrackOutput)>
	//   73  146:aastore         
		}

	//   74  147:iload_3         
	//   75  148:iconst_1        
	//   76  149:iadd            
	//   77  150:istore_3        
	//*  78  151:goto            96
	//   79  154:return          
	}

	private long getNowUnixTimeUs()
	{
		if(elapsedRealtimeOffsetMs != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field long elapsedRealtimeOffsetMs>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            22
			return (SystemClock.elapsedRealtime() + elapsedRealtimeOffsetMs) * 1000L;
	//    5    9:invokestatic    #109 <Method long SystemClock.elapsedRealtime()>
	//    6   12:aload_0         
	//    7   13:getfield        #59  <Field long elapsedRealtimeOffsetMs>
	//    8   16:ladd            
	//    9   17:ldc2w           #110 <Long 1000L>
	//   10   20:lmul            
	//   11   21:lreturn         
		else
			return System.currentTimeMillis() * 1000L;
	//   12   22:invokestatic    #116 <Method long System.currentTimeMillis()>
	//   13   25:ldc2w           #110 <Long 1000L>
	//   14   28:lmul            
	//   15   29:lreturn         
	}

	private ArrayList getRepresentations()
	{
		List list = manifest.getPeriod(periodIndex).adaptationSets;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field DashManifest manifest>
	//    2    4:aload_0         
	//    3    5:getfield        #57  <Field int periodIndex>
	//    4    8:invokevirtual   #120 <Method Period DashManifest.getPeriod(int)>
	//    5   11:getfield        #126 <Field List Period.adaptationSets>
	//    6   14:astore_3        
		ArrayList arraylist = new ArrayList();
	//    7   15:new             #128 <Class ArrayList>
	//    8   18:dup             
	//    9   19:invokespecial   #129 <Method void ArrayList()>
	//   10   22:astore          4
		int ai[] = adaptationSetIndices;
	//   11   24:aload_0         
	//   12   25:getfield        #49  <Field int[] adaptationSetIndices>
	//   13   28:astore          5
		int i = 0;
	//   14   30:iconst_0        
	//   15   31:istore_1        
		for(int j = ai.length; i < j; i++)
	//*  16   32:aload           5
	//*  17   34:arraylength     
	//*  18   35:istore_2        
	//*  19   36:iload_1         
	//*  20   37:iload_2         
	//*  21   38:icmpge          70
			arraylist.addAll(((java.util.Collection) (((AdaptationSet)list.get(ai[i])).representations)));
	//   22   41:aload           4
	//   23   43:aload_3         
	//   24   44:aload           5
	//   25   46:iload_1         
	//   26   47:iaload          
	//   27   48:invokeinterface #95  <Method Object List.get(int)>
	//   28   53:checkcast       #131 <Class AdaptationSet>
	//   29   56:getfield        #134 <Field List AdaptationSet.representations>
	//   30   59:invokevirtual   #138 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   31   62:pop             

	//   32   63:iload_1         
	//   33   64:iconst_1        
	//   34   65:iadd            
	//   35   66:istore_1        
	//*  36   67:goto            36
		return arraylist;
	//   37   70:aload           4
	//   38   72:areturn         
	}

	protected static Chunk newInitializationChunk(RepresentationHolder representationholder, DataSource datasource, Format format, int i, Object obj, RangedUri rangeduri, RangedUri rangeduri1)
	{
		String s = representationholder.representation.baseUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field Representation DefaultDashChunkSource$RepresentationHolder.representation>
	//    2    4:getfield        #150 <Field String Representation.baseUrl>
	//    3    7:astore          8
		RangedUri rangeduri2 = rangeduri1;
	//    4    9:aload           6
	//    5   11:astore          7
		if(rangeduri != null)
	//*   6   13:aload           5
	//*   7   15:ifnull          42
		{
			rangeduri1 = rangeduri.attemptMerge(rangeduri1, s);
	//    8   18:aload           5
	//    9   20:aload           6
	//   10   22:aload           8
	//   11   24:invokevirtual   #156 <Method RangedUri RangedUri.attemptMerge(RangedUri, String)>
	//   12   27:astore          6
			rangeduri2 = rangeduri1;
	//   13   29:aload           6
	//   14   31:astore          7
			if(rangeduri1 == null)
	//*  15   33:aload           6
	//*  16   35:ifnonnull       42
				rangeduri2 = rangeduri;
	//   17   38:aload           5
	//   18   40:astore          7
		}
		return ((Chunk) (new InitializationChunk(datasource, new DataSpec(rangeduri2.resolveUri(s), rangeduri2.start, rangeduri2.length, representationholder.representation.getCacheKey()), format, i, obj, representationholder.extractorWrapper)));
	//   19   42:new             #158 <Class InitializationChunk>
	//   20   45:dup             
	//   21   46:aload_1         
	//   22   47:new             #160 <Class DataSpec>
	//   23   50:dup             
	//   24   51:aload           7
	//   25   53:aload           8
	//   26   55:invokevirtual   #164 <Method android.net.Uri RangedUri.resolveUri(String)>
	//   27   58:aload           7
	//   28   60:getfield        #167 <Field long RangedUri.start>
	//   29   63:aload           7
	//   30   65:getfield        #169 <Field long RangedUri.length>
	//   31   68:aload_0         
	//   32   69:getfield        #146 <Field Representation DefaultDashChunkSource$RepresentationHolder.representation>
	//   33   72:invokevirtual   #173 <Method String Representation.getCacheKey()>
	//   34   75:invokespecial   #176 <Method void DataSpec(android.net.Uri, long, long, String)>
	//   35   78:aload_2         
	//   36   79:iload_3         
	//   37   80:aload           4
	//   38   82:aload_0         
	//   39   83:getfield        #180 <Field ChunkExtractorWrapper DefaultDashChunkSource$RepresentationHolder.extractorWrapper>
	//   40   86:invokespecial   #183 <Method void InitializationChunk(DataSource, DataSpec, Format, int, Object, ChunkExtractorWrapper)>
	//   41   89:areturn         
	}

	protected static Chunk newMediaChunk(RepresentationHolder representationholder, DataSource datasource, int i, Format format, int j, Object obj, long l, 
			int k, long l1)
	{
		Representation representation = representationholder.representation;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field Representation DefaultDashChunkSource$RepresentationHolder.representation>
	//    2    4:astore          18
		long l2 = representationholder.getSegmentStartTimeUs(l);
	//    3    6:aload_0         
	//    4    7:lload           6
	//    5    9:invokevirtual   #189 <Method long DefaultDashChunkSource$RepresentationHolder.getSegmentStartTimeUs(long)>
	//    6   12:lstore          12
		RangedUri rangeduri = representationholder.getSegmentUrl(l);
	//    7   14:aload_0         
	//    8   15:lload           6
	//    9   17:invokevirtual   #193 <Method RangedUri DefaultDashChunkSource$RepresentationHolder.getSegmentUrl(long)>
	//   10   20:astore          16
		String s = representation.baseUrl;
	//   11   22:aload           18
	//   12   24:getfield        #150 <Field String Representation.baseUrl>
	//   13   27:astore          19
		if(representationholder.extractorWrapper == null)
	//*  14   29:aload_0         
	//*  15   30:getfield        #180 <Field ChunkExtractorWrapper DefaultDashChunkSource$RepresentationHolder.extractorWrapper>
	//*  16   33:ifnonnull       95
		{
			l1 = representationholder.getSegmentEndTimeUs(l);
	//   17   36:aload_0         
	//   18   37:lload           6
	//   19   39:invokevirtual   #196 <Method long DefaultDashChunkSource$RepresentationHolder.getSegmentEndTimeUs(long)>
	//   20   42:lstore          9
			return ((Chunk) (new SingleSampleMediaChunk(datasource, new DataSpec(rangeduri.resolveUri(s), rangeduri.start, rangeduri.length, representation.getCacheKey()), format, j, obj, l2, l1, l, i, format)));
	//   21   44:new             #198 <Class SingleSampleMediaChunk>
	//   22   47:dup             
	//   23   48:aload_1         
	//   24   49:new             #160 <Class DataSpec>
	//   25   52:dup             
	//   26   53:aload           16
	//   27   55:aload           19
	//   28   57:invokevirtual   #164 <Method android.net.Uri RangedUri.resolveUri(String)>
	//   29   60:aload           16
	//   30   62:getfield        #167 <Field long RangedUri.start>
	//   31   65:aload           16
	//   32   67:getfield        #169 <Field long RangedUri.length>
	//   33   70:aload           18
	//   34   72:invokevirtual   #173 <Method String Representation.getCacheKey()>
	//   35   75:invokespecial   #176 <Method void DataSpec(android.net.Uri, long, long, String)>
	//   36   78:aload_3         
	//   37   79:iload           4
	//   38   81:aload           5
	//   39   83:lload           12
	//   40   85:lload           9
	//   41   87:lload           6
	//   42   89:iload_2         
	//   43   90:aload_3         
	//   44   91:invokespecial   #201 <Method void SingleSampleMediaChunk(DataSource, DataSpec, Format, int, Object, long, long, long, int, Format)>
	//   45   94:areturn         
		}
		i = 1;
	//   46   95:iconst_1        
	//   47   96:istore_2        
		int i1 = 1;
	//   48   97:iconst_1        
	//   49   98:istore          11
		do
		{
			if(i >= k)
				break;
	//   50  100:iload_2         
	//   51  101:iload           8
	//   52  103:icmpge          149
			RangedUri rangeduri1 = rangeduri.attemptMerge(representationholder.getSegmentUrl(l + (long)i), s);
	//   53  106:aload           16
	//   54  108:aload_0         
	//   55  109:lload           6
	//   56  111:iload_2         
	//   57  112:i2l             
	//   58  113:ladd            
	//   59  114:invokevirtual   #193 <Method RangedUri DefaultDashChunkSource$RepresentationHolder.getSegmentUrl(long)>
	//   60  117:aload           19
	//   61  119:invokevirtual   #156 <Method RangedUri RangedUri.attemptMerge(RangedUri, String)>
	//   62  122:astore          17
			if(rangeduri1 == null)
	//*  63  124:aload           17
	//*  64  126:ifnonnull       132
				break;
	//   65  129:goto            149
			i1++;
	//   66  132:iload           11
	//   67  134:iconst_1        
	//   68  135:iadd            
	//   69  136:istore          11
			i++;
	//   70  138:iload_2         
	//   71  139:iconst_1        
	//   72  140:iadd            
	//   73  141:istore_2        
			rangeduri = rangeduri1;
	//   74  142:aload           17
	//   75  144:astore          16
		} while(true);
	//   76  146:goto            100
		long l3 = representationholder.getSegmentEndTimeUs((l + (long)i1) - 1L);
	//   77  149:aload_0         
	//   78  150:lload           6
	//   79  152:iload           11
	//   80  154:i2l             
	//   81  155:ladd            
	//   82  156:lconst_1        
	//   83  157:lsub            
	//   84  158:invokevirtual   #196 <Method long DefaultDashChunkSource$RepresentationHolder.getSegmentEndTimeUs(long)>
	//   85  161:lstore          14
		return ((Chunk) (new ContainerMediaChunk(datasource, new DataSpec(rangeduri.resolveUri(s), rangeduri.start, rangeduri.length, representation.getCacheKey()), format, j, obj, l2, l3, l1, l, i1, -representation.presentationTimeOffsetUs, representationholder.extractorWrapper)));
	//   86  163:new             #203 <Class ContainerMediaChunk>
	//   87  166:dup             
	//   88  167:aload_1         
	//   89  168:new             #160 <Class DataSpec>
	//   90  171:dup             
	//   91  172:aload           16
	//   92  174:aload           19
	//   93  176:invokevirtual   #164 <Method android.net.Uri RangedUri.resolveUri(String)>
	//   94  179:aload           16
	//   95  181:getfield        #167 <Field long RangedUri.start>
	//   96  184:aload           16
	//   97  186:getfield        #169 <Field long RangedUri.length>
	//   98  189:aload           18
	//   99  191:invokevirtual   #173 <Method String Representation.getCacheKey()>
	//  100  194:invokespecial   #176 <Method void DataSpec(android.net.Uri, long, long, String)>
	//  101  197:aload_3         
	//  102  198:iload           4
	//  103  200:aload           5
	//  104  202:lload           12
	//  105  204:lload           14
	//  106  206:lload           9
	//  107  208:lload           6
	//  108  210:iload           11
	//  109  212:aload           18
	//  110  214:getfield        #206 <Field long Representation.presentationTimeOffsetUs>
	//  111  217:lneg            
	//  112  218:aload_0         
	//  113  219:getfield        #180 <Field ChunkExtractorWrapper DefaultDashChunkSource$RepresentationHolder.extractorWrapper>
	//  114  222:invokespecial   #209 <Method void ContainerMediaChunk(DataSource, DataSpec, Format, int, Object, long, long, long, long, int, long, ChunkExtractorWrapper)>
	//  115  225:areturn         
	}

	private long resolveTimeToLiveEdgeUs(long l)
	{
		boolean flag1 = manifest.dynamic;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field DashManifest manifest>
	//    2    4:getfield        #213 <Field boolean DashManifest.dynamic>
	//    3    7:istore          6
		long l1 = 0x1L;
	//    4    9:ldc2w           #70  <Long 0x1L>
	//    5   12:lstore          4
		boolean flag;
		if(flag1 && liveEdgeTimeUs != 0x1L)
	//*   6   14:iload           6
	//*   7   16:ifeq            35
	//*   8   19:aload_0         
	//*   9   20:getfield        #73  <Field long liveEdgeTimeUs>
	//*  10   23:ldc2w           #70  <Long 0x1L>
	//*  11   26:lcmp            
	//*  12   27:ifeq            35
			flag = true;
	//   13   30:iconst_1        
	//   14   31:istore_3        
		else
	//*  15   32:goto            37
			flag = false;
	//   16   35:iconst_0        
	//   17   36:istore_3        
		if(flag)
	//*  18   37:iload_3         
	//*  19   38:ifeq            49
			l1 = liveEdgeTimeUs - l;
	//   20   41:aload_0         
	//   21   42:getfield        #73  <Field long liveEdgeTimeUs>
	//   22   45:lload_1         
	//   23   46:lsub            
	//   24   47:lstore          4
		return l1;
	//   25   49:lload           4
	//   26   51:lreturn         
	}

	private void updateLiveEdgeTimeUs(RepresentationHolder representationholder, long l)
	{
		if(manifest.dynamic)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field DashManifest manifest>
	//*   2    4:getfield        #213 <Field boolean DashManifest.dynamic>
	//*   3    7:ifeq            19
			l = representationholder.getSegmentEndTimeUs(l);
	//    4   10:aload_1         
	//    5   11:lload_2         
	//    6   12:invokevirtual   #196 <Method long DefaultDashChunkSource$RepresentationHolder.getSegmentEndTimeUs(long)>
	//    7   15:lstore_2        
		else
	//*   8   16:goto            23
			l = 0x1L;
	//    9   19:ldc2w           #70  <Long 0x1L>
	//   10   22:lstore_2        
		liveEdgeTimeUs = l;
	//   11   23:aload_0         
	//   12   24:lload_2         
	//   13   25:putfield        #73  <Field long liveEdgeTimeUs>
	//   14   28:return          
	}

	public long getAdjustedSeekPositionUs(long l, SeekParameters seekparameters)
	{
		RepresentationHolder arepresentationholder[] = representationHolders;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field DefaultDashChunkSource$RepresentationHolder[] representationHolders>
	//    2    4:astore          10
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore          4
		for(int j = arepresentationholder.length; i < j; i++)
	//*   5    9:aload           10
	//*   6   11:arraylength     
	//*   7   12:istore          5
	//*   8   14:iload           4
	//*   9   16:iload           5
	//*  10   18:icmpge          111
		{
			RepresentationHolder representationholder = arepresentationholder[i];
	//   11   21:aload           10
	//   12   23:iload           4
	//   13   25:aaload          
	//   14   26:astore          11
			if(representationholder.segmentIndex != null)
	//*  15   28:aload           11
	//*  16   30:getfield        #221 <Field DashSegmentIndex DefaultDashChunkSource$RepresentationHolder.segmentIndex>
	//*  17   33:ifnull          102
			{
				long l1 = representationholder.getSegmentNum(l);
	//   18   36:aload           11
	//   19   38:lload_1         
	//   20   39:invokevirtual   #224 <Method long DefaultDashChunkSource$RepresentationHolder.getSegmentNum(long)>
	//   21   42:lstore          6
				long l2 = representationholder.getSegmentStartTimeUs(l1);
	//   22   44:aload           11
	//   23   46:lload           6
	//   24   48:invokevirtual   #189 <Method long DefaultDashChunkSource$RepresentationHolder.getSegmentStartTimeUs(long)>
	//   25   51:lstore          8
				if(l2 < l && l1 < (long)(representationholder.getSegmentCount() - 1))
	//*  26   53:lload           8
	//*  27   55:lload_1         
	//*  28   56:lcmp            
	//*  29   57:ifge            88
	//*  30   60:lload           6
	//*  31   62:aload           11
	//*  32   64:invokevirtual   #227 <Method int DefaultDashChunkSource$RepresentationHolder.getSegmentCount()>
	//*  33   67:iconst_1        
	//*  34   68:isub            
	//*  35   69:i2l             
	//*  36   70:lcmp            
	//*  37   71:ifge            88
					l1 = representationholder.getSegmentStartTimeUs(l1 + 1L);
	//   38   74:aload           11
	//   39   76:lload           6
	//   40   78:lconst_1        
	//   41   79:ladd            
	//   42   80:invokevirtual   #189 <Method long DefaultDashChunkSource$RepresentationHolder.getSegmentStartTimeUs(long)>
	//   43   83:lstore          6
				else
	//*  44   85:goto            92
					l1 = l2;
	//   45   88:lload           8
	//   46   90:lstore          6
				return Util.resolveSeekPositionUs(l, seekparameters, l2, l1);
	//   47   92:lload_1         
	//   48   93:aload_3         
	//   49   94:lload           8
	//   50   96:lload           6
	//   51   98:invokestatic    #233 <Method long Util.resolveSeekPositionUs(long, SeekParameters, long, long)>
	//   52  101:lreturn         
			}
		}

	//   53  102:iload           4
	//   54  104:iconst_1        
	//   55  105:iadd            
	//   56  106:istore          4
	//*  57  108:goto            14
		return l;
	//   58  111:lload_1         
	//   59  112:lreturn         
	}

	public void getNextChunk(MediaChunk mediachunk, long l, long l1, ChunkHolder chunkholder)
	{
		if(fatalError != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #237 <Field IOException fatalError>
	//*   2    4:ifnull          8
			return;
	//    3    7:return          
		long l2 = resolveTimeToLiveEdgeUs(l);
	//    4    8:aload_0         
	//    5    9:lload_2         
	//    6   10:invokespecial   #239 <Method long resolveTimeToLiveEdgeUs(long)>
	//    7   13:lstore          9
		long l3 = C.msToUs(manifest.availabilityStartTimeMs);
	//    8   15:aload_0         
	//    9   16:getfield        #47  <Field DashManifest manifest>
	//   10   19:getfield        #242 <Field long DashManifest.availabilityStartTimeMs>
	//   11   22:invokestatic    #247 <Method long C.msToUs(long)>
	//   12   25:lstore          11
		long l4 = C.msToUs(manifest.getPeriod(periodIndex).startMs);
	//   13   27:aload_0         
	//   14   28:getfield        #47  <Field DashManifest manifest>
	//   15   31:aload_0         
	//   16   32:getfield        #57  <Field int periodIndex>
	//   17   35:invokevirtual   #120 <Method Period DashManifest.getPeriod(int)>
	//   18   38:getfield        #250 <Field long Period.startMs>
	//   19   41:invokestatic    #247 <Method long C.msToUs(long)>
	//   20   44:lstore          13
		if(playerTrackEmsgHandler != null && playerTrackEmsgHandler.maybeRefreshManifestBeforeLoadingNextChunk(l3 + l4 + l1))
	//*  21   46:aload_0         
	//*  22   47:getfield        #63  <Field PlayerEmsgHandler$PlayerTrackEmsgHandler playerTrackEmsgHandler>
	//*  23   50:ifnull          72
	//*  24   53:aload_0         
	//*  25   54:getfield        #63  <Field PlayerEmsgHandler$PlayerTrackEmsgHandler playerTrackEmsgHandler>
	//*  26   57:lload           11
	//*  27   59:lload           13
	//*  28   61:ladd            
	//*  29   62:lload           4
	//*  30   64:ladd            
	//*  31   65:invokevirtual   #256 <Method boolean PlayerEmsgHandler$PlayerTrackEmsgHandler.maybeRefreshManifestBeforeLoadingNextChunk(long)>
	//*  32   68:ifeq            72
			return;
	//   33   71:return          
		trackSelection.updateSelectedTrack(l, l1 - l, l2);
	//   34   72:aload_0         
	//   35   73:getfield        #51  <Field TrackSelection trackSelection>
	//   36   76:lload_2         
	//   37   77:lload           4
	//   38   79:lload_2         
	//   39   80:lsub            
	//   40   81:lload           9
	//   41   83:invokeinterface #260 <Method void TrackSelection.updateSelectedTrack(long, long, long)>
		RepresentationHolder representationholder = representationHolders[trackSelection.getSelectedIndex()];
	//   42   88:aload_0         
	//   43   89:getfield        #85  <Field DefaultDashChunkSource$RepresentationHolder[] representationHolders>
	//   44   92:aload_0         
	//   45   93:getfield        #51  <Field TrackSelection trackSelection>
	//   46   96:invokeinterface #263 <Method int TrackSelection.getSelectedIndex()>
	//   47  101:aaload          
	//   48  102:astore          18
		if(representationholder.extractorWrapper != null)
	//*  49  104:aload           18
	//*  50  106:getfield        #180 <Field ChunkExtractorWrapper DefaultDashChunkSource$RepresentationHolder.extractorWrapper>
	//*  51  109:ifnull          220
		{
			Object obj = ((Object) (representationholder.representation));
	//   52  112:aload           18
	//   53  114:getfield        #146 <Field Representation DefaultDashChunkSource$RepresentationHolder.representation>
	//   54  117:astore          17
			RangedUri rangeduri;
			if(representationholder.extractorWrapper.getSampleFormats() == null)
	//*  55  119:aload           18
	//*  56  121:getfield        #180 <Field ChunkExtractorWrapper DefaultDashChunkSource$RepresentationHolder.extractorWrapper>
	//*  57  124:invokevirtual   #269 <Method Format[] ChunkExtractorWrapper.getSampleFormats()>
	//*  58  127:ifnonnull       140
				rangeduri = ((Representation) (obj)).getInitializationUri();
	//   59  130:aload           17
	//   60  132:invokevirtual   #273 <Method RangedUri Representation.getInitializationUri()>
	//   61  135:astore          16
			else
	//*  62  137:goto            143
				rangeduri = null;
	//   63  140:aconst_null     
	//   64  141:astore          16
			if(representationholder.segmentIndex == null)
	//*  65  143:aload           18
	//*  66  145:getfield        #221 <Field DashSegmentIndex DefaultDashChunkSource$RepresentationHolder.segmentIndex>
	//*  67  148:ifnonnull       161
				obj = ((Object) (((Representation) (obj)).getIndexUri()));
	//   68  151:aload           17
	//   69  153:invokevirtual   #276 <Method RangedUri Representation.getIndexUri()>
	//   70  156:astore          17
			else
	//*  71  158:goto            164
				obj = null;
	//   72  161:aconst_null     
	//   73  162:astore          17
			if(rangeduri != null || obj != null)
	//*  74  164:aload           16
	//*  75  166:ifnonnull       174
	//*  76  169:aload           17
	//*  77  171:ifnull          220
			{
				chunkholder.chunk = newInitializationChunk(representationholder, dataSource, trackSelection.getSelectedFormat(), trackSelection.getSelectionReason(), trackSelection.getSelectionData(), rangeduri, ((RangedUri) (obj)));
	//   78  174:aload           6
	//   79  176:aload           18
	//   80  178:aload_0         
	//   81  179:getfield        #55  <Field DataSource dataSource>
	//   82  182:aload_0         
	//   83  183:getfield        #51  <Field TrackSelection trackSelection>
	//   84  186:invokeinterface #280 <Method Format TrackSelection.getSelectedFormat()>
	//   85  191:aload_0         
	//   86  192:getfield        #51  <Field TrackSelection trackSelection>
	//   87  195:invokeinterface #283 <Method int TrackSelection.getSelectionReason()>
	//   88  200:aload_0         
	//   89  201:getfield        #51  <Field TrackSelection trackSelection>
	//   90  204:invokeinterface #287 <Method Object TrackSelection.getSelectionData()>
	//   91  209:aload           16
	//   92  211:aload           17
	//   93  213:invokestatic    #289 <Method Chunk newInitializationChunk(DefaultDashChunkSource$RepresentationHolder, DataSource, Format, int, Object, RangedUri, RangedUri)>
	//   94  216:putfield        #295 <Field Chunk ChunkHolder.chunk>
				return;
	//   95  219:return          
			}
		}
		int i = representationholder.getSegmentCount();
	//   96  220:aload           18
	//   97  222:invokevirtual   #227 <Method int DefaultDashChunkSource$RepresentationHolder.getSegmentCount()>
	//   98  225:istore          7
		if(i == 0)
	//*  99  227:iload           7
	//* 100  229:ifne            278
		{
			boolean flag;
			if(manifest.dynamic && periodIndex >= manifest.getPeriodCount() - 1)
	//* 101  232:aload_0         
	//* 102  233:getfield        #47  <Field DashManifest manifest>
	//* 103  236:getfield        #213 <Field boolean DashManifest.dynamic>
	//* 104  239:ifeq            267
	//* 105  242:aload_0         
	//* 106  243:getfield        #57  <Field int periodIndex>
	//* 107  246:aload_0         
	//* 108  247:getfield        #47  <Field DashManifest manifest>
	//* 109  250:invokevirtual   #298 <Method int DashManifest.getPeriodCount()>
	//* 110  253:iconst_1        
	//* 111  254:isub            
	//* 112  255:icmpge          261
	//* 113  258:goto            267
				flag = false;
	//  114  261:iconst_0        
	//  115  262:istore          15
			else
	//* 116  264:goto            270
				flag = true;
	//  117  267:iconst_1        
	//  118  268:istore          15
			chunkholder.endOfStream = flag;
	//  119  270:aload           6
	//  120  272:iload           15
	//  121  274:putfield        #301 <Field boolean ChunkHolder.endOfStream>
			return;
	//  122  277:return          
		}
		l3 = representationholder.getFirstSegmentNum();
	//  123  278:aload           18
	//  124  280:invokevirtual   #304 <Method long DefaultDashChunkSource$RepresentationHolder.getFirstSegmentNum()>
	//  125  283:lstore          11
		if(i == -1)
	//* 126  285:iload           7
	//* 127  287:iconst_m1       
	//* 128  288:icmpne          384
		{
			l2 = getNowUnixTimeUs() - C.msToUs(manifest.availabilityStartTimeMs) - C.msToUs(manifest.getPeriod(periodIndex).startMs);
	//  129  291:aload_0         
	//  130  292:invokespecial   #306 <Method long getNowUnixTimeUs()>
	//  131  295:aload_0         
	//  132  296:getfield        #47  <Field DashManifest manifest>
	//  133  299:getfield        #242 <Field long DashManifest.availabilityStartTimeMs>
	//  134  302:invokestatic    #247 <Method long C.msToUs(long)>
	//  135  305:lsub            
	//  136  306:aload_0         
	//  137  307:getfield        #47  <Field DashManifest manifest>
	//  138  310:aload_0         
	//  139  311:getfield        #57  <Field int periodIndex>
	//  140  314:invokevirtual   #120 <Method Period DashManifest.getPeriod(int)>
	//  141  317:getfield        #250 <Field long Period.startMs>
	//  142  320:invokestatic    #247 <Method long C.msToUs(long)>
	//  143  323:lsub            
	//  144  324:lstore          9
			l = l3;
	//  145  326:lload           11
	//  146  328:lstore_2        
			if(manifest.timeShiftBufferDepthMs != 0x1L)
	//* 147  329:aload_0         
	//* 148  330:getfield        #47  <Field DashManifest manifest>
	//* 149  333:getfield        #309 <Field long DashManifest.timeShiftBufferDepthMs>
	//* 150  336:ldc2w           #70  <Long 0x1L>
	//* 151  339:lcmp            
	//* 152  340:ifeq            367
				l = Math.max(l3, representationholder.getSegmentNum(l2 - C.msToUs(manifest.timeShiftBufferDepthMs)));
	//  153  343:lload           11
	//  154  345:aload           18
	//  155  347:lload           9
	//  156  349:aload_0         
	//  157  350:getfield        #47  <Field DashManifest manifest>
	//  158  353:getfield        #309 <Field long DashManifest.timeShiftBufferDepthMs>
	//  159  356:invokestatic    #247 <Method long C.msToUs(long)>
	//  160  359:lsub            
	//  161  360:invokevirtual   #224 <Method long DefaultDashChunkSource$RepresentationHolder.getSegmentNum(long)>
	//  162  363:invokestatic    #315 <Method long Math.max(long, long)>
	//  163  366:lstore_2        
			l2 = representationholder.getSegmentNum(l2) - 1L;
	//  164  367:aload           18
	//  165  369:lload           9
	//  166  371:invokevirtual   #224 <Method long DefaultDashChunkSource$RepresentationHolder.getSegmentNum(long)>
	//  167  374:lconst_1        
	//  168  375:lsub            
	//  169  376:lstore          9
			l3 = l;
	//  170  378:lload_2         
	//  171  379:lstore          11
		} else
	//* 172  381:goto            394
		{
			l2 = (l3 + (long)i) - 1L;
	//  173  384:lload           11
	//  174  386:iload           7
	//  175  388:i2l             
	//  176  389:ladd            
	//  177  390:lconst_1        
	//  178  391:lsub            
	//  179  392:lstore          9
		}
		updateLiveEdgeTimeUs(representationholder, l2);
	//  180  394:aload_0         
	//  181  395:aload           18
	//  182  397:lload           9
	//  183  399:invokespecial   #317 <Method void updateLiveEdgeTimeUs(DefaultDashChunkSource$RepresentationHolder, long)>
		if(mediachunk == null)
	//* 184  402:aload_1         
	//* 185  403:ifnonnull       424
		{
			l = Util.constrainValue(representationholder.getSegmentNum(l1), l3, l2);
	//  186  406:aload           18
	//  187  408:lload           4
	//  188  410:invokevirtual   #224 <Method long DefaultDashChunkSource$RepresentationHolder.getSegmentNum(long)>
	//  189  413:lload           11
	//  190  415:lload           9
	//  191  417:invokestatic    #321 <Method long Util.constrainValue(long, long, long)>
	//  192  420:lstore_2        
		} else
	//* 193  421:goto            453
		{
			long l5 = mediachunk.getNextChunkIndex();
	//  194  424:aload_1         
	//  195  425:invokevirtual   #326 <Method long MediaChunk.getNextChunkIndex()>
	//  196  428:lstore          13
			l = l5;
	//  197  430:lload           13
	//  198  432:lstore_2        
			if(l5 < l3)
	//* 199  433:lload           13
	//* 200  435:lload           11
	//* 201  437:lcmp            
	//* 202  438:ifge            421
			{
				fatalError = ((IOException) (new BehindLiveWindowException()));
	//  203  441:aload_0         
	//  204  442:new             #328 <Class BehindLiveWindowException>
	//  205  445:dup             
	//  206  446:invokespecial   #329 <Method void BehindLiveWindowException()>
	//  207  449:putfield        #237 <Field IOException fatalError>
				return;
	//  208  452:return          
			}
		}
		if(l <= l2 && (!missingLastSegment || l < l2))
	//* 209  453:lload_2         
	//* 210  454:lload           9
	//* 211  456:lcmp            
	//* 212  457:ifgt            557
	//* 213  460:aload_0         
	//* 214  461:getfield        #331 <Field boolean missingLastSegment>
	//* 215  464:ifeq            477
	//* 216  467:lload_2         
	//* 217  468:lload           9
	//* 218  470:lcmp            
	//* 219  471:iflt            477
	//* 220  474:goto            557
		{
			int j = (int)Math.min(maxSegmentsPerLoad, (l2 - l) + 1L);
	//  221  477:aload_0         
	//  222  478:getfield        #61  <Field int maxSegmentsPerLoad>
	//  223  481:i2l             
	//  224  482:lload           9
	//  225  484:lload_2         
	//  226  485:lsub            
	//  227  486:lconst_1        
	//  228  487:ladd            
	//  229  488:invokestatic    #334 <Method long Math.min(long, long)>
	//  230  491:l2i             
	//  231  492:istore          7
			if(mediachunk != null)
	//* 232  494:aload_1         
	//* 233  495:ifnonnull       501
	//* 234  498:goto            506
				l1 = 0x1L;
	//  235  501:ldc2w           #70  <Long 0x1L>
	//  236  504:lstore          4
			chunkholder.chunk = newMediaChunk(representationholder, dataSource, trackType, trackSelection.getSelectedFormat(), trackSelection.getSelectionReason(), trackSelection.getSelectionData(), l, j, l1);
	//  237  506:aload           6
	//  238  508:aload           18
	//  239  510:aload_0         
	//  240  511:getfield        #55  <Field DataSource dataSource>
	//  241  514:aload_0         
	//  242  515:getfield        #53  <Field int trackType>
	//  243  518:aload_0         
	//  244  519:getfield        #51  <Field TrackSelection trackSelection>
	//  245  522:invokeinterface #280 <Method Format TrackSelection.getSelectedFormat()>
	//  246  527:aload_0         
	//  247  528:getfield        #51  <Field TrackSelection trackSelection>
	//  248  531:invokeinterface #283 <Method int TrackSelection.getSelectionReason()>
	//  249  536:aload_0         
	//  250  537:getfield        #51  <Field TrackSelection trackSelection>
	//  251  540:invokeinterface #287 <Method Object TrackSelection.getSelectionData()>
	//  252  545:lload_2         
	//  253  546:iload           7
	//  254  548:lload           4
	//  255  550:invokestatic    #336 <Method Chunk newMediaChunk(DefaultDashChunkSource$RepresentationHolder, DataSource, int, Format, int, Object, long, int, long)>
	//  256  553:putfield        #295 <Field Chunk ChunkHolder.chunk>
			return;
	//  257  556:return          
		}
		boolean flag1;
		if(manifest.dynamic)
	//* 258  557:aload_0         
	//* 259  558:getfield        #47  <Field DashManifest manifest>
	//* 260  561:getfield        #213 <Field boolean DashManifest.dynamic>
	//* 261  564:ifeq            603
		{
			int k = periodIndex;
	//  262  567:aload_0         
	//  263  568:getfield        #57  <Field int periodIndex>
	//  264  571:istore          7
			int i1 = manifest.getPeriodCount();
	//  265  573:aload_0         
	//  266  574:getfield        #47  <Field DashManifest manifest>
	//  267  577:invokevirtual   #298 <Method int DashManifest.getPeriodCount()>
	//  268  580:istore          8
			flag1 = true;
	//  269  582:iconst_1        
	//  270  583:istore          15
			if(k >= i1 - 1)
	//* 271  585:iload           7
	//* 272  587:iload           8
	//* 273  589:iconst_1        
	//* 274  590:isub            
	//* 275  591:icmpge          597
	//* 276  594:goto            606
				flag1 = false;
	//  277  597:iconst_0        
	//  278  598:istore          15
		} else
	//* 279  600:goto            606
		{
			flag1 = true;
	//  280  603:iconst_1        
	//  281  604:istore          15
		}
		chunkholder.endOfStream = flag1;
	//  282  606:aload           6
	//  283  608:iload           15
	//  284  610:putfield        #301 <Field boolean ChunkHolder.endOfStream>
	//  285  613:return          
	}

	public int getPreferredQueueSize(long l, List list)
	{
		if(fatalError == null && trackSelection.length() >= 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #237 <Field IOException fatalError>
	//*   2    4:ifnonnull       35
	//*   3    7:aload_0         
	//*   4    8:getfield        #51  <Field TrackSelection trackSelection>
	//*   5   11:invokeinterface #83  <Method int TrackSelection.length()>
	//*   6   16:iconst_2        
	//*   7   17:icmpge          23
	//*   8   20:goto            35
			return trackSelection.evaluateQueueSize(l, list);
	//    9   23:aload_0         
	//   10   24:getfield        #51  <Field TrackSelection trackSelection>
	//   11   27:lload_1         
	//   12   28:aload_3         
	//   13   29:invokeinterface #341 <Method int TrackSelection.evaluateQueueSize(long, List)>
	//   14   34:ireturn         
		else
			return list.size();
	//   15   35:aload_3         
	//   16   36:invokeinterface #344 <Method int List.size()>
	//   17   41:ireturn         
	}

	public void maybeThrowError()
		throws IOException
	{
		if(fatalError != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #237 <Field IOException fatalError>
	//*   2    4:ifnull          12
		{
			throw fatalError;
	//    3    7:aload_0         
	//    4    8:getfield        #237 <Field IOException fatalError>
	//    5   11:athrow          
		} else
		{
			manifestLoaderErrorThrower.maybeThrowError();
	//    6   12:aload_0         
	//    7   13:getfield        #45  <Field LoaderErrorThrower manifestLoaderErrorThrower>
	//    8   16:invokeinterface #352 <Method void LoaderErrorThrower.maybeThrowError()>
			return;
	//    9   21:return          
		}
	}

	public void onChunkLoadCompleted(Chunk chunk)
	{
		if(chunk instanceof InitializationChunk)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #158 <Class InitializationChunk>
	//*   2    4:ifeq            72
		{
			Object obj = ((Object) ((InitializationChunk)chunk));
	//    3    7:aload_1         
	//    4    8:checkcast       #158 <Class InitializationChunk>
	//    5   11:astore_2        
			obj = ((Object) (representationHolders[trackSelection.indexOf(((InitializationChunk) (obj)).trackFormat)]));
	//    6   12:aload_0         
	//    7   13:getfield        #85  <Field DefaultDashChunkSource$RepresentationHolder[] representationHolders>
	//    8   16:aload_0         
	//    9   17:getfield        #51  <Field TrackSelection trackSelection>
	//   10   20:aload_2         
	//   11   21:getfield        #359 <Field Format InitializationChunk.trackFormat>
	//   12   24:invokeinterface #363 <Method int TrackSelection.indexOf(Format)>
	//   13   29:aaload          
	//   14   30:astore_2        
			if(((RepresentationHolder) (obj)).segmentIndex == null)
	//*  15   31:aload_2         
	//*  16   32:getfield        #221 <Field DashSegmentIndex DefaultDashChunkSource$RepresentationHolder.segmentIndex>
	//*  17   35:ifnonnull       72
			{
				com.google.android.exoplayer2.extractor.SeekMap seekmap = ((RepresentationHolder) (obj)).extractorWrapper.getSeekMap();
	//   18   38:aload_2         
	//   19   39:getfield        #180 <Field ChunkExtractorWrapper DefaultDashChunkSource$RepresentationHolder.extractorWrapper>
	//   20   42:invokevirtual   #367 <Method com.google.android.exoplayer2.extractor.SeekMap ChunkExtractorWrapper.getSeekMap()>
	//   21   45:astore_3        
				if(seekmap != null)
	//*  22   46:aload_3         
	//*  23   47:ifnull          72
					obj.segmentIndex = ((DashSegmentIndex) (new DashWrappingSegmentIndex((ChunkIndex)seekmap, ((RepresentationHolder) (obj)).representation.presentationTimeOffsetUs)));
	//   24   50:aload_2         
	//   25   51:new             #369 <Class DashWrappingSegmentIndex>
	//   26   54:dup             
	//   27   55:aload_3         
	//   28   56:checkcast       #371 <Class ChunkIndex>
	//   29   59:aload_2         
	//   30   60:getfield        #146 <Field Representation DefaultDashChunkSource$RepresentationHolder.representation>
	//   31   63:getfield        #206 <Field long Representation.presentationTimeOffsetUs>
	//   32   66:invokespecial   #374 <Method void DashWrappingSegmentIndex(ChunkIndex, long)>
	//   33   69:putfield        #221 <Field DashSegmentIndex DefaultDashChunkSource$RepresentationHolder.segmentIndex>
			}
		}
		if(playerTrackEmsgHandler != null)
	//*  34   72:aload_0         
	//*  35   73:getfield        #63  <Field PlayerEmsgHandler$PlayerTrackEmsgHandler playerTrackEmsgHandler>
	//*  36   76:ifnull          87
			playerTrackEmsgHandler.onChunkLoadCompleted(chunk);
	//   37   79:aload_0         
	//   38   80:getfield        #63  <Field PlayerEmsgHandler$PlayerTrackEmsgHandler playerTrackEmsgHandler>
	//   39   83:aload_1         
	//   40   84:invokevirtual   #376 <Method void PlayerEmsgHandler$PlayerTrackEmsgHandler.onChunkLoadCompleted(Chunk)>
	//   41   87:return          
	}

	public boolean onChunkLoadError(Chunk chunk, boolean flag, Exception exception)
	{
		if(!flag)
	//*   0    0:iload_2         
	//*   1    1:ifne            6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(playerTrackEmsgHandler != null && playerTrackEmsgHandler.maybeRefreshManifestOnLoadingError(chunk))
	//*   4    6:aload_0         
	//*   5    7:getfield        #63  <Field PlayerEmsgHandler$PlayerTrackEmsgHandler playerTrackEmsgHandler>
	//*   6   10:ifnull          26
	//*   7   13:aload_0         
	//*   8   14:getfield        #63  <Field PlayerEmsgHandler$PlayerTrackEmsgHandler playerTrackEmsgHandler>
	//*   9   17:aload_1         
	//*  10   18:invokevirtual   #382 <Method boolean PlayerEmsgHandler$PlayerTrackEmsgHandler.maybeRefreshManifestOnLoadingError(Chunk)>
	//*  11   21:ifeq            26
			return true;
	//   12   24:iconst_1        
	//   13   25:ireturn         
		if(!manifest.dynamic && (chunk instanceof MediaChunk) && (exception instanceof com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException) && ((com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException)exception).responseCode == 404)
	//*  14   26:aload_0         
	//*  15   27:getfield        #47  <Field DashManifest manifest>
	//*  16   30:getfield        #213 <Field boolean DashManifest.dynamic>
	//*  17   33:ifne            138
	//*  18   36:aload_1         
	//*  19   37:instanceof      #323 <Class MediaChunk>
	//*  20   40:ifeq            138
	//*  21   43:aload_3         
	//*  22   44:instanceof      #384 <Class com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException>
	//*  23   47:ifeq            138
	//*  24   50:aload_3         
	//*  25   51:checkcast       #384 <Class com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException>
	//*  26   54:getfield        #387 <Field int com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException.responseCode>
	//*  27   57:sipush          404
	//*  28   60:icmpne          138
		{
			RepresentationHolder representationholder = representationHolders[trackSelection.indexOf(chunk.trackFormat)];
	//   29   63:aload_0         
	//   30   64:getfield        #85  <Field DefaultDashChunkSource$RepresentationHolder[] representationHolders>
	//   31   67:aload_0         
	//   32   68:getfield        #51  <Field TrackSelection trackSelection>
	//   33   71:aload_1         
	//   34   72:getfield        #390 <Field Format Chunk.trackFormat>
	//   35   75:invokeinterface #363 <Method int TrackSelection.indexOf(Format)>
	//   36   80:aaload          
	//   37   81:astore          9
			int i = representationholder.getSegmentCount();
	//   38   83:aload           9
	//   39   85:invokevirtual   #227 <Method int DefaultDashChunkSource$RepresentationHolder.getSegmentCount()>
	//   40   88:istore          4
			if(i != -1 && i != 0)
	//*  41   90:iload           4
	//*  42   92:iconst_m1       
	//*  43   93:icmpeq          138
	//*  44   96:iload           4
	//*  45   98:ifeq            138
			{
				long l = representationholder.getFirstSegmentNum();
	//   46  101:aload           9
	//   47  103:invokevirtual   #304 <Method long DefaultDashChunkSource$RepresentationHolder.getFirstSegmentNum()>
	//   48  106:lstore          5
				long l1 = i;
	//   49  108:iload           4
	//   50  110:i2l             
	//   51  111:lstore          7
				if(((MediaChunk)chunk).getNextChunkIndex() > (l + l1) - 1L)
	//*  52  113:aload_1         
	//*  53  114:checkcast       #323 <Class MediaChunk>
	//*  54  117:invokevirtual   #326 <Method long MediaChunk.getNextChunkIndex()>
	//*  55  120:lload           5
	//*  56  122:lload           7
	//*  57  124:ladd            
	//*  58  125:lconst_1        
	//*  59  126:lsub            
	//*  60  127:lcmp            
	//*  61  128:ifle            138
				{
					missingLastSegment = true;
	//   62  131:aload_0         
	//   63  132:iconst_1        
	//   64  133:putfield        #331 <Field boolean missingLastSegment>
					return true;
	//   65  136:iconst_1        
	//   66  137:ireturn         
				}
			}
		}
		return ChunkedTrackBlacklistUtil.maybeBlacklistTrack(trackSelection, trackSelection.indexOf(chunk.trackFormat), exception);
	//   67  138:aload_0         
	//   68  139:getfield        #51  <Field TrackSelection trackSelection>
	//   69  142:aload_0         
	//   70  143:getfield        #51  <Field TrackSelection trackSelection>
	//   71  146:aload_1         
	//   72  147:getfield        #390 <Field Format Chunk.trackFormat>
	//   73  150:invokeinterface #363 <Method int TrackSelection.indexOf(Format)>
	//   74  155:aload_3         
	//   75  156:invokestatic    #396 <Method boolean ChunkedTrackBlacklistUtil.maybeBlacklistTrack(TrackSelection, int, Exception)>
	//   76  159:ireturn         
	}

	public void updateManifest(DashManifest dashmanifest, int i)
	{
		long l;
		manifest = dashmanifest;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field DashManifest manifest>
		periodIndex = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #57  <Field int periodIndex>
		l = manifest.getPeriodDurationUs(periodIndex);
	//    6   10:aload_0         
	//    7   11:getfield        #47  <Field DashManifest manifest>
	//    8   14:aload_0         
	//    9   15:getfield        #57  <Field int periodIndex>
	//   10   18:invokevirtual   #69  <Method long DashManifest.getPeriodDurationUs(int)>
	//   11   21:lstore_3        
		dashmanifest = ((DashManifest) (getRepresentations()));
	//   12   22:aload_0         
	//   13   23:invokespecial   #77  <Method ArrayList getRepresentations()>
	//   14   26:astore_1        
		i = 0;
	//   15   27:iconst_0        
	//   16   28:istore_2        
_L2:
		if(i >= representationHolders.length)
			break; /* Loop/switch isn't completed */
	//   17   29:iload_2         
	//   18   30:aload_0         
	//   19   31:getfield        #85  <Field DefaultDashChunkSource$RepresentationHolder[] representationHolders>
	//   20   34:arraylength     
	//   21   35:icmpge          84
		Representation representation = (Representation)((List) (dashmanifest)).get(trackSelection.getIndexInTrackGroup(i));
	//   22   38:aload_1         
	//   23   39:aload_0         
	//   24   40:getfield        #51  <Field TrackSelection trackSelection>
	//   25   43:iload_2         
	//   26   44:invokeinterface #89  <Method int TrackSelection.getIndexInTrackGroup(int)>
	//   27   49:invokeinterface #95  <Method Object List.get(int)>
	//   28   54:checkcast       #97  <Class Representation>
	//   29   57:astore          5
		representationHolders[i].updateRepresentation(l, representation);
	//   30   59:aload_0         
	//   31   60:getfield        #85  <Field DefaultDashChunkSource$RepresentationHolder[] representationHolders>
	//   32   63:iload_2         
	//   33   64:aaload          
	//   34   65:lload_3         
	//   35   66:aload           5
	//   36   68:invokevirtual   #402 <Method void DefaultDashChunkSource$RepresentationHolder.updateRepresentation(long, Representation)>
		i++;
	//   37   71:iload_2         
	//   38   72:iconst_1        
	//   39   73:iadd            
	//   40   74:istore_2        
		if(true) goto _L2; else goto _L1
	//   41   75:goto            29
		dashmanifest;
	//   42   78:astore_1        
		fatalError = ((IOException) (dashmanifest));
	//   43   79:aload_0         
	//   44   80:aload_1         
	//   45   81:putfield        #237 <Field IOException fatalError>
_L1:
	//   46   84:return          
	}

	private final int adaptationSetIndices[];
	private final DataSource dataSource;
	private final long elapsedRealtimeOffsetMs;
	private IOException fatalError;
	private long liveEdgeTimeUs;
	private DashManifest manifest;
	private final LoaderErrorThrower manifestLoaderErrorThrower;
	private final int maxSegmentsPerLoad;
	private boolean missingLastSegment;
	private int periodIndex;
	private final PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler;
	protected final RepresentationHolder representationHolders[];
	private final TrackSelection trackSelection;
	private final int trackType;
}
