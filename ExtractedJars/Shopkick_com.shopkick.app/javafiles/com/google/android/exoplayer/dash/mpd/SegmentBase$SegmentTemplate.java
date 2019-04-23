// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash.mpd;

import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.util.Util;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//			SegmentBase, RangedUri, Representation, UrlTemplate

public static class SegmentBase$SegmentTemplate extends 
{

	public RangedUri getInitialization(Representation representation)
	{
		UrlTemplate urltemplate = initializationTemplate;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field UrlTemplate initializationTemplate>
	//    2    4:astore_2        
		if(urltemplate != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          41
			return new RangedUri(urltemplate.buildUri(representation.format.id, 0, representation.format.bitrate, 0L), 0L, -1L);
	//    5    9:new             #26  <Class RangedUri>
	//    6   12:dup             
	//    7   13:aload_2         
	//    8   14:aload_1         
	//    9   15:getfield        #32  <Field Format Representation.format>
	//   10   18:getfield        #38  <Field String Format.id>
	//   11   21:iconst_0        
	//   12   22:aload_1         
	//   13   23:getfield        #32  <Field Format Representation.format>
	//   14   26:getfield        #42  <Field int Format.bitrate>
	//   15   29:lconst_0        
	//   16   30:invokevirtual   #48  <Method String UrlTemplate.buildUri(String, int, int, long)>
	//   17   33:lconst_0        
	//   18   34:ldc2w           #49  <Long -1L>
	//   19   37:invokespecial   #53  <Method void RangedUri(String, long, long)>
	//   20   40:areturn         
		else
			return super.getInitialization(representation);
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:invokespecial   #55  <Method RangedUri SegmentBase$MultiSegmentBase.getInitialization(Representation)>
	//   24   46:areturn         
	}

	public int getLastSegmentNum(long l)
	{
		if(segmentTimeline != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field List segmentTimeline>
	//*   2    4:ifnull          24
			return (segmentTimeline.size() + startNumber) - 1;
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field List segmentTimeline>
	//    5   11:invokeinterface #67  <Method int List.size()>
	//    6   16:aload_0         
	//    7   17:getfield        #70  <Field int startNumber>
	//    8   20:iadd            
	//    9   21:iconst_1        
	//   10   22:isub            
	//   11   23:ireturn         
		if(l == -1L)
	//*  12   24:lload_1         
	//*  13   25:ldc2w           #49  <Long -1L>
	//*  14   28:lcmp            
	//*  15   29:ifne            34
		{
			return -1;
	//   16   32:iconst_m1       
	//   17   33:ireturn         
		} else
		{
			long l1 = (duration * 0xf4240L) / timescale;
	//   18   34:aload_0         
	//   19   35:getfield        #74  <Field long duration>
	//   20   38:ldc2w           #75  <Long 0xf4240L>
	//   21   41:lmul            
	//   22   42:aload_0         
	//   23   43:getfield        #79  <Field long timescale>
	//   24   46:ldiv            
	//   25   47:lstore_3        
			return (startNumber + (int)Util.ceilDivide(l, l1)) - 1;
	//   26   48:aload_0         
	//   27   49:getfield        #70  <Field int startNumber>
	//   28   52:lload_1         
	//   29   53:lload_3         
	//   30   54:invokestatic    #85  <Method long Util.ceilDivide(long, long)>
	//   31   57:l2i             
	//   32   58:iadd            
	//   33   59:iconst_1        
	//   34   60:isub            
	//   35   61:ireturn         
		}
	}

	public RangedUri getSegmentUrl(Representation representation, int i)
	{
		long l;
		if(segmentTimeline != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field List segmentTimeline>
	//*   2    4:ifnull          32
			l = ((lement)segmentTimeline.get(i - startNumber)).startTime;
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field List segmentTimeline>
	//    5   11:iload_2         
	//    6   12:aload_0         
	//    7   13:getfield        #70  <Field int startNumber>
	//    8   16:isub            
	//    9   17:invokeinterface #91  <Method Object List.get(int)>
	//   10   22:checkcast       #93  <Class SegmentBase$SegmentTimelineElement>
	//   11   25:getfield        #96  <Field long SegmentBase$SegmentTimelineElement.startTime>
	//   12   28:lstore_3        
		else
	//*  13   29:goto            45
			l = (long)(i - startNumber) * duration;
	//   14   32:iload_2         
	//   15   33:aload_0         
	//   16   34:getfield        #70  <Field int startNumber>
	//   17   37:isub            
	//   18   38:i2l             
	//   19   39:aload_0         
	//   20   40:getfield        #74  <Field long duration>
	//   21   43:lmul            
	//   22   44:lstore_3        
		return new RangedUri(mediaTemplate.buildUri(representation.format.id, i, representation.format.bitrate, l), 0L, -1L);
	//   23   45:new             #26  <Class RangedUri>
	//   24   48:dup             
	//   25   49:aload_0         
	//   26   50:getfield        #19  <Field UrlTemplate mediaTemplate>
	//   27   53:aload_1         
	//   28   54:getfield        #32  <Field Format Representation.format>
	//   29   57:getfield        #38  <Field String Format.id>
	//   30   60:iload_2         
	//   31   61:aload_1         
	//   32   62:getfield        #32  <Field Format Representation.format>
	//   33   65:getfield        #42  <Field int Format.bitrate>
	//   34   68:lload_3         
	//   35   69:invokevirtual   #48  <Method String UrlTemplate.buildUri(String, int, int, long)>
	//   36   72:lconst_0        
	//   37   73:ldc2w           #49  <Long -1L>
	//   38   76:invokespecial   #53  <Method void RangedUri(String, long, long)>
	//   39   79:areturn         
	}

	final UrlTemplate initializationTemplate;
	final UrlTemplate mediaTemplate;

	public SegmentBase$SegmentTemplate(RangedUri rangeduri, long l, long l1, int i, long l2, List list, UrlTemplate urltemplate, UrlTemplate urltemplate1)
	{
		super(rangeduri, l, l1, i, l2, list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:lload           4
	//    4    5:iload           6
	//    5    7:lload           7
	//    6    9:aload           9
	//    7   11:invokespecial   #15  <Method void SegmentBase$MultiSegmentBase(RangedUri, long, long, int, long, List)>
		initializationTemplate = urltemplate;
	//    8   14:aload_0         
	//    9   15:aload           10
	//   10   17:putfield        #17  <Field UrlTemplate initializationTemplate>
		mediaTemplate = urltemplate1;
	//   11   20:aload_0         
	//   12   21:aload           11
	//   13   23:putfield        #19  <Field UrlTemplate mediaTemplate>
	//   14   26:return          
	}
}
