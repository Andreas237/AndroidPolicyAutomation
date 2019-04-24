// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash.manifest;

import com.google.android.exoplayer2.util.Util;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.source.dash.manifest:
//			SegmentBase, RangedUri, Representation

public static abstract class SegmentBase$MultiSegmentBase extends SegmentBase
{

	public long getFirstSegmentNum()
	{
		return startNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field long startNumber>
	//    2    4:lreturn         
	}

	public abstract int getSegmentCount(long l);

	public final long getSegmentDurationUs(long l, long l1)
	{
		if(segmentTimeline != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field List segmentTimeline>
	//*   2    4:ifnull          39
			return (((ement)segmentTimeline.get((int)(l - startNumber))).duration * 0xf4240L) / timescale;
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field List segmentTimeline>
	//    5   11:lload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #18  <Field long startNumber>
	//    8   16:lsub            
	//    9   17:l2i             
	//   10   18:invokeinterface #37  <Method Object List.get(int)>
	//   11   23:checkcast       #39  <Class SegmentBase$SegmentTimelineElement>
	//   12   26:getfield        #40  <Field long SegmentBase$SegmentTimelineElement.duration>
	//   13   29:ldc2w           #41  <Long 0xf4240L>
	//   14   32:lmul            
	//   15   33:aload_0         
	//   16   34:getfield        #45  <Field long timescale>
	//   17   37:ldiv            
	//   18   38:lreturn         
		int i = getSegmentCount(l1);
	//   19   39:aload_0         
	//   20   40:lload_3         
	//   21   41:invokevirtual   #47  <Method int getSegmentCount(long)>
	//   22   44:istore          5
		if(i != -1 && l == (getFirstSegmentNum() + (long)i) - 1L)
	//*  23   46:iload           5
	//*  24   48:iconst_m1       
	//*  25   49:icmpeq          75
	//*  26   52:lload_1         
	//*  27   53:aload_0         
	//*  28   54:invokevirtual   #49  <Method long getFirstSegmentNum()>
	//*  29   57:iload           5
	//*  30   59:i2l             
	//*  31   60:ladd            
	//*  32   61:lconst_1        
	//*  33   62:lsub            
	//*  34   63:lcmp            
	//*  35   64:ifne            75
			return l1 - getSegmentTimeUs(l);
	//   36   67:lload_3         
	//   37   68:aload_0         
	//   38   69:lload_1         
	//   39   70:invokevirtual   #53  <Method long getSegmentTimeUs(long)>
	//   40   73:lsub            
	//   41   74:lreturn         
		else
			return (duration * 0xf4240L) / timescale;
	//   42   75:aload_0         
	//   43   76:getfield        #20  <Field long duration>
	//   44   79:ldc2w           #41  <Long 0xf4240L>
	//   45   82:lmul            
	//   46   83:aload_0         
	//   47   84:getfield        #45  <Field long timescale>
	//   48   87:ldiv            
	//   49   88:lreturn         
	}

	public long getSegmentNum(long l, long l1)
	{
		long l4 = getFirstSegmentNum();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method long getFirstSegmentNum()>
	//    2    4:lstore          7
		l1 = getSegmentCount(l1);
	//    3    6:aload_0         
	//    4    7:lload_3         
	//    5    8:invokevirtual   #47  <Method int getSegmentCount(long)>
	//    6   11:i2l             
	//    7   12:lstore_3        
		if(l1 == 0L)
	//*   8   13:lload_3         
	//*   9   14:lconst_0        
	//*  10   15:lcmp            
	//*  11   16:ifne            22
			return l4;
	//   12   19:lload           7
	//   13   21:lreturn         
		if(segmentTimeline == null)
	//*  14   22:aload_0         
	//*  15   23:getfield        #22  <Field List segmentTimeline>
	//*  16   26:ifnonnull       85
		{
			long l2 = (duration * 0xf4240L) / timescale;
	//   17   29:aload_0         
	//   18   30:getfield        #20  <Field long duration>
	//   19   33:ldc2w           #41  <Long 0xf4240L>
	//   20   36:lmul            
	//   21   37:aload_0         
	//   22   38:getfield        #45  <Field long timescale>
	//   23   41:ldiv            
	//   24   42:lstore          5
			l = startNumber + l / l2;
	//   25   44:aload_0         
	//   26   45:getfield        #18  <Field long startNumber>
	//   27   48:lload_1         
	//   28   49:lload           5
	//   29   51:ldiv            
	//   30   52:ladd            
	//   31   53:lstore_1        
			if(l < l4)
	//*  32   54:lload_1         
	//*  33   55:lload           7
	//*  34   57:lcmp            
	//*  35   58:ifge            64
				return l4;
	//   36   61:lload           7
	//   37   63:lreturn         
			if(l1 == -1L)
	//*  38   64:lload_3         
	//*  39   65:ldc2w           #55  <Long -1L>
	//*  40   68:lcmp            
	//*  41   69:ifne            74
				return l;
	//   42   72:lload_1         
	//   43   73:lreturn         
			else
				return Math.min(l, (l4 + l1) - 1L);
	//   44   74:lload_1         
	//   45   75:lload           7
	//   46   77:lload_3         
	//   47   78:ladd            
	//   48   79:lconst_1        
	//   49   80:lsub            
	//   50   81:invokestatic    #61  <Method long Math.min(long, long)>
	//   51   84:lreturn         
		}
		long l3 = (l4 + l1) - 1L;
	//   52   85:lload           7
	//   53   87:lload_3         
	//   54   88:ladd            
	//   55   89:lconst_1        
	//   56   90:lsub            
	//   57   91:lstore          5
		for(l1 = l4; l1 <= l3;)
	//*  58   93:lload           7
	//*  59   95:lstore_3        
	//*  60   96:lload_3         
	//*  61   97:lload           5
	//*  62   99:lcmp            
	//*  63  100:ifgt            157
		{
			long l5 = l1 + (l3 - l1) / 2L;
	//   64  103:lload_3         
	//   65  104:lload           5
	//   66  106:lload_3         
	//   67  107:lsub            
	//   68  108:ldc2w           #62  <Long 2L>
	//   69  111:ldiv            
	//   70  112:ladd            
	//   71  113:lstore          9
			long l6 = getSegmentTimeUs(l5);
	//   72  115:aload_0         
	//   73  116:lload           9
	//   74  118:invokevirtual   #53  <Method long getSegmentTimeUs(long)>
	//   75  121:lstore          11
			if(l6 < l)
	//*  76  123:lload           11
	//*  77  125:lload_1         
	//*  78  126:lcmp            
	//*  79  127:ifge            138
				l1 = l5 + 1L;
	//   80  130:lload           9
	//   81  132:lconst_1        
	//   82  133:ladd            
	//   83  134:lstore_3        
			else
	//*  84  135:goto            96
			if(l6 > l)
	//*  85  138:lload           11
	//*  86  140:lload_1         
	//*  87  141:lcmp            
	//*  88  142:ifle            154
				l3 = l5 - 1L;
	//   89  145:lload           9
	//   90  147:lconst_1        
	//   91  148:lsub            
	//   92  149:lstore          5
			else
	//*  93  151:goto            96
				return l5;
	//   94  154:lload           9
	//   95  156:lreturn         
		}

		if(l1 == l4)
	//*  96  157:lload_3         
	//*  97  158:lload           7
	//*  98  160:lcmp            
	//*  99  161:ifne            166
			return l1;
	//  100  164:lload_3         
	//  101  165:lreturn         
		else
			return l3;
	//  102  166:lload           5
	//  103  168:lreturn         
	}

	public final long getSegmentTimeUs(long l)
	{
		if(segmentTimeline != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field List segmentTimeline>
	//*   2    4:ifnull          38
			l = ((ement)segmentTimeline.get((int)(l - startNumber))).startTime - presentationTimeOffset;
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field List segmentTimeline>
	//    5   11:lload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #18  <Field long startNumber>
	//    8   16:lsub            
	//    9   17:l2i             
	//   10   18:invokeinterface #37  <Method Object List.get(int)>
	//   11   23:checkcast       #39  <Class SegmentBase$SegmentTimelineElement>
	//   12   26:getfield        #66  <Field long SegmentBase$SegmentTimelineElement.startTime>
	//   13   29:aload_0         
	//   14   30:getfield        #69  <Field long presentationTimeOffset>
	//   15   33:lsub            
	//   16   34:lstore_1        
		else
	//*  17   35:goto            53
			l = (l - startNumber) * duration;
	//   18   38:lload_1         
	//   19   39:aload_0         
	//   20   40:getfield        #18  <Field long startNumber>
	//   21   43:lsub            
	//   22   44:aload_0         
	//   23   45:getfield        #20  <Field long duration>
	//   24   48:lmul            
	//   25   49:lstore_1        
	//*  26   50:goto            35
		return Util.scaleLargeTimestamp(l, 0xf4240L, timescale);
	//   27   53:lload_1         
	//   28   54:ldc2w           #41  <Long 0xf4240L>
	//   29   57:aload_0         
	//   30   58:getfield        #45  <Field long timescale>
	//   31   61:invokestatic    #75  <Method long Util.scaleLargeTimestamp(long, long, long)>
	//   32   64:lreturn         
	}

	public abstract RangedUri getSegmentUrl(Representation representation, long l);

	public boolean isExplicit()
	{
		return segmentTimeline != null;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field List segmentTimeline>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	final long duration;
	final List segmentTimeline;
	final long startNumber;

	public SegmentBase$MultiSegmentBase(RangedUri rangeduri, long l, long l1, long l2, 
			long l3, List list)
	{
		super(rangeduri, l, l1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:lload           4
	//    4    5:invokespecial   #16  <Method void SegmentBase(RangedUri, long, long)>
		startNumber = l2;
	//    5    8:aload_0         
	//    6    9:lload           6
	//    7   11:putfield        #18  <Field long startNumber>
		duration = l3;
	//    8   14:aload_0         
	//    9   15:lload           8
	//   10   17:putfield        #20  <Field long duration>
		segmentTimeline = list;
	//   11   20:aload_0         
	//   12   21:aload           10
	//   13   23:putfield        #22  <Field List segmentTimeline>
	//   14   26:return          
	}
}
