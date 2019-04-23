// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash.mpd;

import com.google.android.exoplayer.util.Util;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//			SegmentBase, RangedUri, Representation

public static abstract class SegmentBase$MultiSegmentBase extends SegmentBase
{

	public int getFirstSegmentNum()
	{
		return startNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int startNumber>
	//    2    4:ireturn         
	}

	public abstract int getLastSegmentNum(long l);

	public final long getSegmentDurationUs(int i, long l)
	{
		List list = segmentTimeline;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List segmentTimeline>
	//    2    4:astore          4
		if(list != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          40
			return (((ement)list.get(i - startNumber)).duration * 0xf4240L) / timescale;
	//    5   11:aload           4
	//    6   13:iload_1         
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field int startNumber>
	//    9   18:isub            
	//   10   19:invokeinterface #38  <Method Object List.get(int)>
	//   11   24:checkcast       #40  <Class SegmentBase$SegmentTimelineElement>
	//   12   27:getfield        #41  <Field long SegmentBase$SegmentTimelineElement.duration>
	//   13   30:ldc2w           #42  <Long 0xf4240L>
	//   14   33:lmul            
	//   15   34:aload_0         
	//   16   35:getfield        #46  <Field long timescale>
	//   17   38:ldiv            
	//   18   39:lreturn         
		if(i == getLastSegmentNum(l))
	//*  19   40:iload_1         
	//*  20   41:aload_0         
	//*  21   42:lload_2         
	//*  22   43:invokevirtual   #48  <Method int getLastSegmentNum(long)>
	//*  23   46:icmpne          57
			return l - getSegmentTimeUs(i);
	//   24   49:lload_2         
	//   25   50:aload_0         
	//   26   51:iload_1         
	//   27   52:invokevirtual   #52  <Method long getSegmentTimeUs(int)>
	//   28   55:lsub            
	//   29   56:lreturn         
		else
			return (duration * 0xf4240L) / timescale;
	//   30   57:aload_0         
	//   31   58:getfield        #21  <Field long duration>
	//   32   61:ldc2w           #42  <Long 0xf4240L>
	//   33   64:lmul            
	//   34   65:aload_0         
	//   35   66:getfield        #46  <Field long timescale>
	//   36   69:ldiv            
	//   37   70:lreturn         
	}

	public int getSegmentNum(long l, long l1)
	{
		int i1 = getFirstSegmentNum();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #56  <Method int getFirstSegmentNum()>
	//    2    4:istore          7
		int i = getLastSegmentNum(l1);
	//    3    6:aload_0         
	//    4    7:lload_3         
	//    5    8:invokevirtual   #48  <Method int getLastSegmentNum(long)>
	//    6   11:istore          5
		if(segmentTimeline == null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #23  <Field List segmentTimeline>
	//*   9   17:ifnonnull       87
		{
			l1 = (duration * 0xf4240L) / timescale;
	//   10   20:aload_0         
	//   11   21:getfield        #21  <Field long duration>
	//   12   24:ldc2w           #42  <Long 0xf4240L>
	//   13   27:lmul            
	//   14   28:aload_0         
	//   15   29:getfield        #46  <Field long timescale>
	//   16   32:ldiv            
	//   17   33:lstore_3        
			int j = startNumber;
	//   18   34:aload_0         
	//   19   35:getfield        #19  <Field int startNumber>
	//   20   38:istore          6
			int j1 = (int)(l / l1) + j;
	//   21   40:lload_1         
	//   22   41:lload_3         
	//   23   42:ldiv            
	//   24   43:l2i             
	//   25   44:iload           6
	//   26   46:iadd            
	//   27   47:istore          8
			if(j1 < i1)
	//*  28   49:iload           8
	//*  29   51:iload           7
	//*  30   53:icmpge          59
				return i1;
	//   31   56:iload           7
	//   32   58:ireturn         
			j = j1;
	//   33   59:iload           8
	//   34   61:istore          6
			if(i != -1)
	//*  35   63:iload           5
	//*  36   65:iconst_m1       
	//*  37   66:icmpeq          84
			{
				j = j1;
	//   38   69:iload           8
	//   39   71:istore          6
				if(j1 > i)
	//*  40   73:iload           8
	//*  41   75:iload           5
	//*  42   77:icmple          84
					j = i;
	//   43   80:iload           5
	//   44   82:istore          6
			}
			return j;
	//   45   84:iload           6
	//   46   86:ireturn         
		}
		int k;
		for(k = i1; k <= i;)
	//*  47   87:iload           7
	//*  48   89:istore          6
	//*  49   91:iload           6
	//*  50   93:iload           5
	//*  51   95:icmpgt          148
		{
			int k1 = (k + i) / 2;
	//   52   98:iload           6
	//   53  100:iload           5
	//   54  102:iadd            
	//   55  103:iconst_2        
	//   56  104:idiv            
	//   57  105:istore          8
			int i2 = getSegmentTimeUs(k1) != l;
	//   58  107:aload_0         
	//   59  108:iload           8
	//   60  110:invokevirtual   #52  <Method long getSegmentTimeUs(int)>
	//   61  113:lload_1         
	//   62  114:lcmp            
	//   63  115:istore          9
			if(i2 < 0)
	//*  64  117:iload           9
	//*  65  119:ifge            131
				k = k1 + 1;
	//   66  122:iload           8
	//   67  124:iconst_1        
	//   68  125:iadd            
	//   69  126:istore          6
			else
	//*  70  128:goto            91
			if(i2 > 0)
	//*  71  131:iload           9
	//*  72  133:ifle            145
				i = k1 - 1;
	//   73  136:iload           8
	//   74  138:iconst_1        
	//   75  139:isub            
	//   76  140:istore          5
			else
	//*  77  142:goto            91
				return k1;
	//   78  145:iload           8
	//   79  147:ireturn         
		}

		if(k == i1)
	//*  80  148:iload           6
	//*  81  150:iload           7
	//*  82  152:icmpne          158
			return k;
	//   83  155:iload           6
	//   84  157:ireturn         
		else
			return i;
	//   85  158:iload           5
	//   86  160:ireturn         
	}

	public final long getSegmentTimeUs(int i)
	{
		List list = segmentTimeline;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List segmentTimeline>
	//    2    4:astore          4
		long l;
		if(list != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          39
			l = ((ement)list.get(i - startNumber)).startTime - presentationTimeOffset;
	//    5   11:aload           4
	//    6   13:iload_1         
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field int startNumber>
	//    9   18:isub            
	//   10   19:invokeinterface #38  <Method Object List.get(int)>
	//   11   24:checkcast       #40  <Class SegmentBase$SegmentTimelineElement>
	//   12   27:getfield        #59  <Field long SegmentBase$SegmentTimelineElement.startTime>
	//   13   30:aload_0         
	//   14   31:getfield        #62  <Field long presentationTimeOffset>
	//   15   34:lsub            
	//   16   35:lstore_2        
		else
	//*  17   36:goto            52
			l = (long)(i - startNumber) * duration;
	//   18   39:iload_1         
	//   19   40:aload_0         
	//   20   41:getfield        #19  <Field int startNumber>
	//   21   44:isub            
	//   22   45:i2l             
	//   23   46:aload_0         
	//   24   47:getfield        #21  <Field long duration>
	//   25   50:lmul            
	//   26   51:lstore_2        
		return Util.scaleLargeTimestamp(l, 0xf4240L, timescale);
	//   27   52:lload_2         
	//   28   53:ldc2w           #42  <Long 0xf4240L>
	//   29   56:aload_0         
	//   30   57:getfield        #46  <Field long timescale>
	//   31   60:invokestatic    #68  <Method long Util.scaleLargeTimestamp(long, long, long)>
	//   32   63:lreturn         
	}

	public abstract RangedUri getSegmentUrl(Representation representation, int i);

	public boolean isExplicit()
	{
		return segmentTimeline != null;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List segmentTimeline>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	final long duration;
	final List segmentTimeline;
	final int startNumber;

	public SegmentBase$MultiSegmentBase(RangedUri rangeduri, long l, long l1, int i, long l2, List list)
	{
		super(rangeduri, l, l1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:lload           4
	//    4    5:invokespecial   #17  <Method void SegmentBase(RangedUri, long, long)>
		startNumber = i;
	//    5    8:aload_0         
	//    6    9:iload           6
	//    7   11:putfield        #19  <Field int startNumber>
		duration = l2;
	//    8   14:aload_0         
	//    9   15:lload           7
	//   10   17:putfield        #21  <Field long duration>
		segmentTimeline = list;
	//   11   20:aload_0         
	//   12   21:aload           9
	//   13   23:putfield        #23  <Field List segmentTimeline>
	//   14   26:return          
	}
}
