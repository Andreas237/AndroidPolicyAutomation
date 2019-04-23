// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash;

import com.google.android.exoplayer.BehindLiveWindowException;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.chunk.ChunkExtractorWrapper;
import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.dash.mpd.RangedUri;
import com.google.android.exoplayer.dash.mpd.Representation;
import com.google.android.exoplayer.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer.extractor.webm.WebmExtractor;

// Referenced classes of package com.google.android.exoplayer.dash:
//			DashChunkSource, DashSegmentIndex

protected static final class DashChunkSource$RepresentationHolder
{

	public int getFirstAvailableSegmentNum()
	{
		return segmentIndex.getFirstSegmentNum() + segmentNumShift;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field DashSegmentIndex segmentIndex>
	//    2    4:invokeinterface #80  <Method int DashSegmentIndex.getFirstSegmentNum()>
	//    3    9:aload_0         
	//    4   10:getfield        #82  <Field int segmentNumShift>
	//    5   13:iadd            
	//    6   14:ireturn         
	}

	public int getLastSegmentNum()
	{
		return segmentIndex.getLastSegmentNum(periodDurationUs);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field DashSegmentIndex segmentIndex>
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field long periodDurationUs>
	//    4    8:invokeinterface #86  <Method int DashSegmentIndex.getLastSegmentNum(long)>
	//    5   13:ireturn         
	}

	public long getSegmentEndTimeUs(int i)
	{
		return getSegmentStartTimeUs(i) + segmentIndex.getDurationUs(i - segmentNumShift, periodDurationUs);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #91  <Method long getSegmentStartTimeUs(int)>
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field DashSegmentIndex segmentIndex>
	//    5    9:iload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #82  <Field int segmentNumShift>
	//    8   14:isub            
	//    9   15:aload_0         
	//   10   16:getfield        #31  <Field long periodDurationUs>
	//   11   19:invokeinterface #95  <Method long DashSegmentIndex.getDurationUs(int, long)>
	//   12   24:ladd            
	//   13   25:lreturn         
	}

	public int getSegmentNum(long l)
	{
		return segmentIndex.getSegmentNum(l - periodStartTimeUs, periodDurationUs) + segmentNumShift;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field DashSegmentIndex segmentIndex>
	//    2    4:lload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #29  <Field long periodStartTimeUs>
	//    5    9:lsub            
	//    6   10:aload_0         
	//    7   11:getfield        #31  <Field long periodDurationUs>
	//    8   14:invokeinterface #99  <Method int DashSegmentIndex.getSegmentNum(long, long)>
	//    9   19:aload_0         
	//   10   20:getfield        #82  <Field int segmentNumShift>
	//   11   23:iadd            
	//   12   24:ireturn         
	}

	public long getSegmentStartTimeUs(int i)
	{
		return segmentIndex.getTimeUs(i - segmentNumShift) + periodStartTimeUs;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field DashSegmentIndex segmentIndex>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #82  <Field int segmentNumShift>
	//    5    9:isub            
	//    6   10:invokeinterface #102 <Method long DashSegmentIndex.getTimeUs(int)>
	//    7   15:aload_0         
	//    8   16:getfield        #29  <Field long periodStartTimeUs>
	//    9   19:ladd            
	//   10   20:lreturn         
	}

	public RangedUri getSegmentUrl(int i)
	{
		return segmentIndex.getSegmentUrl(i - segmentNumShift);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field DashSegmentIndex segmentIndex>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #82  <Field int segmentNumShift>
	//    5    9:isub            
	//    6   10:invokeinterface #106 <Method RangedUri DashSegmentIndex.getSegmentUrl(int)>
	//    7   15:areturn         
	}

	public boolean isBeyondLastSegment(int i)
	{
		int j = getLastSegmentNum();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #110 <Method int getLastSegmentNum()>
	//    2    4:istore_2        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(j == -1)
	//*   5    7:iload_2         
	//*   6    8:iconst_m1       
	//*   7    9:icmpne          14
			return false;
	//    8   12:iconst_0        
	//    9   13:ireturn         
		if(i > j + segmentNumShift)
	//*  10   14:iload_1         
	//*  11   15:iload_2         
	//*  12   16:aload_0         
	//*  13   17:getfield        #82  <Field int segmentNumShift>
	//*  14   20:iadd            
	//*  15   21:icmple          26
			flag = true;
	//   16   24:iconst_1        
	//   17   25:istore_3        
		return flag;
	//   18   26:iload_3         
	//   19   27:ireturn         
	}

	public void updateRepresentation(long l, Representation representation1)
		throws BehindLiveWindowException
	{
		DashSegmentIndex dashsegmentindex = representation.getIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Representation representation>
	//    2    4:invokevirtual   #70  <Method DashSegmentIndex Representation.getIndex()>
	//    3    7:astore          10
		DashSegmentIndex dashsegmentindex1 = representation1.getIndex();
	//    4    9:aload_3         
	//    5   10:invokevirtual   #70  <Method DashSegmentIndex Representation.getIndex()>
	//    6   13:astore          11
		periodDurationUs = l;
	//    7   15:aload_0         
	//    8   16:lload_1         
	//    9   17:putfield        #31  <Field long periodDurationUs>
		representation = representation1;
	//   10   20:aload_0         
	//   11   21:aload_3         
	//   12   22:putfield        #33  <Field Representation representation>
		if(dashsegmentindex == null)
	//*  13   25:aload           10
	//*  14   27:ifnonnull       31
			return;
	//   15   30:return          
		segmentIndex = dashsegmentindex1;
	//   16   31:aload_0         
	//   17   32:aload           11
	//   18   34:putfield        #72  <Field DashSegmentIndex segmentIndex>
		if(!dashsegmentindex.isExplicit())
	//*  19   37:aload           10
	//*  20   39:invokeinterface #118 <Method boolean DashSegmentIndex.isExplicit()>
	//*  21   44:ifne            48
			return;
	//   22   47:return          
		int i = dashsegmentindex.getLastSegmentNum(periodDurationUs);
	//   23   48:aload           10
	//   24   50:aload_0         
	//   25   51:getfield        #31  <Field long periodDurationUs>
	//   26   54:invokeinterface #86  <Method int DashSegmentIndex.getLastSegmentNum(long)>
	//   27   59:istore          4
		l = dashsegmentindex.getTimeUs(i);
	//   28   61:aload           10
	//   29   63:iload           4
	//   30   65:invokeinterface #102 <Method long DashSegmentIndex.getTimeUs(int)>
	//   31   70:lstore_1        
		long l1 = dashsegmentindex.getDurationUs(i, periodDurationUs);
	//   32   71:aload           10
	//   33   73:iload           4
	//   34   75:aload_0         
	//   35   76:getfield        #31  <Field long periodDurationUs>
	//   36   79:invokeinterface #95  <Method long DashSegmentIndex.getDurationUs(int, long)>
	//   37   84:lstore          6
		i = dashsegmentindex1.getFirstSegmentNum();
	//   38   86:aload           11
	//   39   88:invokeinterface #80  <Method int DashSegmentIndex.getFirstSegmentNum()>
	//   40   93:istore          4
		long l2 = dashsegmentindex1.getTimeUs(i);
	//   41   95:aload           11
	//   42   97:iload           4
	//   43   99:invokeinterface #102 <Method long DashSegmentIndex.getTimeUs(int)>
	//   44  104:lstore          8
		int j = l + l1 != l2;
	//   45  106:lload_1         
	//   46  107:lload           6
	//   47  109:ladd            
	//   48  110:lload           8
	//   49  112:lcmp            
	//   50  113:istore          5
		if(j == 0)
	//*  51  115:iload           5
	//*  52  117:ifne            146
		{
			segmentNumShift = segmentNumShift + ((dashsegmentindex.getLastSegmentNum(periodDurationUs) + 1) - i);
	//   53  120:aload_0         
	//   54  121:aload_0         
	//   55  122:getfield        #82  <Field int segmentNumShift>
	//   56  125:aload           10
	//   57  127:aload_0         
	//   58  128:getfield        #31  <Field long periodDurationUs>
	//   59  131:invokeinterface #86  <Method int DashSegmentIndex.getLastSegmentNum(long)>
	//   60  136:iconst_1        
	//   61  137:iadd            
	//   62  138:iload           4
	//   63  140:isub            
	//   64  141:iadd            
	//   65  142:putfield        #82  <Field int segmentNumShift>
			return;
	//   66  145:return          
		}
		if(j >= 0)
	//*  67  146:iload           5
	//*  68  148:iflt            177
		{
			segmentNumShift = segmentNumShift + (dashsegmentindex.getSegmentNum(l2, periodDurationUs) - i);
	//   69  151:aload_0         
	//   70  152:aload_0         
	//   71  153:getfield        #82  <Field int segmentNumShift>
	//   72  156:aload           10
	//   73  158:lload           8
	//   74  160:aload_0         
	//   75  161:getfield        #31  <Field long periodDurationUs>
	//   76  164:invokeinterface #99  <Method int DashSegmentIndex.getSegmentNum(long, long)>
	//   77  169:iload           4
	//   78  171:isub            
	//   79  172:iadd            
	//   80  173:putfield        #82  <Field int segmentNumShift>
			return;
	//   81  176:return          
		} else
		{
			throw new BehindLiveWindowException();
	//   82  177:new             #114 <Class BehindLiveWindowException>
	//   83  180:dup             
	//   84  181:invokespecial   #119 <Method void BehindLiveWindowException()>
	//   85  184:athrow          
		}
	}

	public final ChunkExtractorWrapper extractorWrapper;
	public MediaFormat mediaFormat;
	public final boolean mimeTypeIsRawText;
	private long periodDurationUs;
	private final long periodStartTimeUs;
	public Representation representation;
	public DashSegmentIndex segmentIndex;
	private int segmentNumShift;

	public DashChunkSource$RepresentationHolder(long l, long l1, Representation representation1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		periodStartTimeUs = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #29  <Field long periodStartTimeUs>
		periodDurationUs = l1;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #31  <Field long periodDurationUs>
		representation = representation1;
	//    8   14:aload_0         
	//    9   15:aload           5
	//   10   17:putfield        #33  <Field Representation representation>
		Object obj = ((Object) (representation1.format.mimeType));
	//   11   20:aload           5
	//   12   22:getfield        #39  <Field Format Representation.format>
	//   13   25:getfield        #45  <Field String Format.mimeType>
	//   14   28:astore          6
		mimeTypeIsRawText = DashChunkSource.mimeTypeIsRawText(((String) (obj)));
	//   15   30:aload_0         
	//   16   31:aload           6
	//   17   33:invokestatic    #48  <Method boolean DashChunkSource.mimeTypeIsRawText(String)>
	//   18   36:putfield        #50  <Field boolean mimeTypeIsRawText>
		if(mimeTypeIsRawText)
	//*  19   39:aload_0         
	//*  20   40:getfield        #50  <Field boolean mimeTypeIsRawText>
	//*  21   43:ifeq            52
		{
			obj = null;
	//   22   46:aconst_null     
	//   23   47:astore          6
		} else
	//*  24   49:goto            92
		{
			if(DashChunkSource.mimeTypeIsWebm(((String) (obj))))
	//*  25   52:aload           6
	//*  26   54:invokestatic    #53  <Method boolean DashChunkSource.mimeTypeIsWebm(String)>
	//*  27   57:ifeq            72
				obj = ((Object) (new WebmExtractor()));
	//   28   60:new             #55  <Class WebmExtractor>
	//   29   63:dup             
	//   30   64:invokespecial   #56  <Method void WebmExtractor()>
	//   31   67:astore          6
			else
	//*  32   69:goto            81
				obj = ((Object) (new FragmentedMp4Extractor()));
	//   33   72:new             #58  <Class FragmentedMp4Extractor>
	//   34   75:dup             
	//   35   76:invokespecial   #59  <Method void FragmentedMp4Extractor()>
	//   36   79:astore          6
			obj = ((Object) (new ChunkExtractorWrapper(((com.google.android.exoplayer.extractor.Extractor) (obj)))));
	//   37   81:new             #61  <Class ChunkExtractorWrapper>
	//   38   84:dup             
	//   39   85:aload           6
	//   40   87:invokespecial   #64  <Method void ChunkExtractorWrapper(com.google.android.exoplayer.extractor.Extractor)>
	//   41   90:astore          6
		}
		extractorWrapper = ((ChunkExtractorWrapper) (obj));
	//   42   92:aload_0         
	//   43   93:aload           6
	//   44   95:putfield        #66  <Field ChunkExtractorWrapper extractorWrapper>
		segmentIndex = representation1.getIndex();
	//   45   98:aload_0         
	//   46   99:aload           5
	//   47  101:invokevirtual   #70  <Method DashSegmentIndex Representation.getIndex()>
	//   48  104:putfield        #72  <Field DashSegmentIndex segmentIndex>
	//   49  107:return          
	}
}
