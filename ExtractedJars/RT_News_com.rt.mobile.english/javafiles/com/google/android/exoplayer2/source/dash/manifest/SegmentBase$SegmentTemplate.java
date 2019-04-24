// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash.manifest;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Util;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.source.dash.manifest:
//			SegmentBase, RangedUri, Representation, UrlTemplate

public static class SegmentBase$SegmentTemplate extends 
{

	public RangedUri getInitialization(Representation representation)
	{
		if(initializationTemplate != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field UrlTemplate initializationTemplate>
	//*   2    4:ifnull          42
			return new RangedUri(initializationTemplate.buildUri(representation.format.id, 0L, representation.format.bitrate, 0L), 0L, -1L);
	//    3    7:new             #26  <Class RangedUri>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field UrlTemplate initializationTemplate>
	//    7   15:aload_1         
	//    8   16:getfield        #32  <Field Format Representation.format>
	//    9   19:getfield        #38  <Field String Format.id>
	//   10   22:lconst_0        
	//   11   23:aload_1         
	//   12   24:getfield        #32  <Field Format Representation.format>
	//   13   27:getfield        #42  <Field int Format.bitrate>
	//   14   30:lconst_0        
	//   15   31:invokevirtual   #48  <Method String UrlTemplate.buildUri(String, long, int, long)>
	//   16   34:lconst_0        
	//   17   35:ldc2w           #49  <Long -1L>
	//   18   38:invokespecial   #53  <Method void RangedUri(String, long, long)>
	//   19   41:areturn         
		else
			return super.getInitialization(representation);
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:invokespecial   #55  <Method RangedUri SegmentBase$MultiSegmentBase.getInitialization(Representation)>
	//   23   47:areturn         
	}

	public int getSegmentCount(long l)
	{
		if(segmentTimeline != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field List segmentTimeline>
	//*   2    4:ifnull          17
			return segmentTimeline.size();
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field List segmentTimeline>
	//    5   11:invokeinterface #67  <Method int List.size()>
	//    6   16:ireturn         
		if(l != 0x1L)
	//*   7   17:lload_1         
	//*   8   18:ldc2w           #68  <Long 0x1L>
	//*   9   21:lcmp            
	//*  10   22:ifeq            44
			return (int)Util.ceilDivide(l, (duration * 0xf4240L) / timescale);
	//   11   25:lload_1         
	//   12   26:aload_0         
	//   13   27:getfield        #73  <Field long duration>
	//   14   30:ldc2w           #74  <Long 0xf4240L>
	//   15   33:lmul            
	//   16   34:aload_0         
	//   17   35:getfield        #78  <Field long timescale>
	//   18   38:ldiv            
	//   19   39:invokestatic    #84  <Method long Util.ceilDivide(long, long)>
	//   20   42:l2i             
	//   21   43:ireturn         
		else
			return -1;
	//   22   44:iconst_m1       
	//   23   45:ireturn         
	}

	public RangedUri getSegmentUrl(Representation representation, long l)
	{
		long l1;
		if(segmentTimeline != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field List segmentTimeline>
	//*   2    4:ifnull          34
			l1 = ((lement)segmentTimeline.get((int)(l - startNumber))).startTime;
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field List segmentTimeline>
	//    5   11:lload_2         
	//    6   12:aload_0         
	//    7   13:getfield        #89  <Field long startNumber>
	//    8   16:lsub            
	//    9   17:l2i             
	//   10   18:invokeinterface #93  <Method Object List.get(int)>
	//   11   23:checkcast       #95  <Class SegmentBase$SegmentTimelineElement>
	//   12   26:getfield        #98  <Field long SegmentBase$SegmentTimelineElement.startTime>
	//   13   29:lstore          4
		else
	//*  14   31:goto            47
			l1 = (l - startNumber) * duration;
	//   15   34:lload_2         
	//   16   35:aload_0         
	//   17   36:getfield        #89  <Field long startNumber>
	//   18   39:lsub            
	//   19   40:aload_0         
	//   20   41:getfield        #73  <Field long duration>
	//   21   44:lmul            
	//   22   45:lstore          4
		return new RangedUri(mediaTemplate.buildUri(representation.format.id, l, representation.format.bitrate, l1), 0L, -1L);
	//   23   47:new             #26  <Class RangedUri>
	//   24   50:dup             
	//   25   51:aload_0         
	//   26   52:getfield        #19  <Field UrlTemplate mediaTemplate>
	//   27   55:aload_1         
	//   28   56:getfield        #32  <Field Format Representation.format>
	//   29   59:getfield        #38  <Field String Format.id>
	//   30   62:lload_2         
	//   31   63:aload_1         
	//   32   64:getfield        #32  <Field Format Representation.format>
	//   33   67:getfield        #42  <Field int Format.bitrate>
	//   34   70:lload           4
	//   35   72:invokevirtual   #48  <Method String UrlTemplate.buildUri(String, long, int, long)>
	//   36   75:lconst_0        
	//   37   76:ldc2w           #49  <Long -1L>
	//   38   79:invokespecial   #53  <Method void RangedUri(String, long, long)>
	//   39   82:areturn         
	}

	final UrlTemplate initializationTemplate;
	final UrlTemplate mediaTemplate;

	public SegmentBase$SegmentTemplate(RangedUri rangeduri, long l, long l1, long l2, 
			long l3, List list, UrlTemplate urltemplate, UrlTemplate urltemplate1)
	{
		super(rangeduri, l, l1, l2, l3, list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:lload           4
	//    4    5:lload           6
	//    5    7:lload           8
	//    6    9:aload           10
	//    7   11:invokespecial   #15  <Method void SegmentBase$MultiSegmentBase(RangedUri, long, long, long, long, List)>
		initializationTemplate = urltemplate;
	//    8   14:aload_0         
	//    9   15:aload           11
	//   10   17:putfield        #17  <Field UrlTemplate initializationTemplate>
		mediaTemplate = urltemplate1;
	//   11   20:aload_0         
	//   12   21:aload           12
	//   13   23:putfield        #19  <Field UrlTemplate mediaTemplate>
	//   14   26:return          
	}
}
