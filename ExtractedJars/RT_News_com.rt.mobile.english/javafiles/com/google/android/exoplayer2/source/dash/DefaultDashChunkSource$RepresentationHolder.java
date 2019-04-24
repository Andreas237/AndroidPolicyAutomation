// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.rawcc.RawCcExtractor;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.chunk.ChunkExtractorWrapper;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Collections;

// Referenced classes of package com.google.android.exoplayer2.source.dash:
//			DefaultDashChunkSource, DashSegmentIndex

protected static final class DefaultDashChunkSource$RepresentationHolder
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

	DefaultDashChunkSource$RepresentationHolder(long l, int i, Representation representation1, boolean flag, boolean flag1, TrackOutput trackoutput)
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
				java.util.List list;
				if(flag1)
	//*  46  103:iload           6
	//*  47  105:ifeq            124
					list = Collections.singletonList(((Object) (Format.createTextSampleFormat(((String) (null)), "application/cea-608", 0, ((String) (null))))));
	//   48  108:aconst_null     
	//   49  109:ldc1            #66  <String "application/cea-608">
	//   50  111:iconst_0        
	//   51  112:aconst_null     
	//   52  113:invokestatic    #70  <Method Format Format.createTextSampleFormat(String, String, int, String)>
	//   53  116:invokestatic    #76  <Method java.util.List Collections.singletonList(Object)>
	//   54  119:astore          9
				else
	//*  55  121:goto            132
					list = Collections.emptyList();
	//   56  124:invokestatic    #80  <Method java.util.List Collections.emptyList()>
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
	//   67  145:invokespecial   #85  <Method void FragmentedMp4Extractor(int, com.google.android.exoplayer2.util.TimestampAdjuster, com.google.android.exoplayer2.extractor.mp4.Track, com.google.android.exoplayer2.drm.DrmInitData, java.util.List, TrackOutput)>
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
