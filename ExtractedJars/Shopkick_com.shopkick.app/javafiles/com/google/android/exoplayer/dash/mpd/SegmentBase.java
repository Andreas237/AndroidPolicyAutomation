// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash.mpd;

import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.util.Util;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//			RangedUri, Representation, UrlTemplate

public abstract class SegmentBase
{
	public static abstract class MultiSegmentBase extends SegmentBase
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
				return (((SegmentTimelineElement)list.get(i - startNumber)).duration * 0xf4240L) / timescale;
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
				l = ((SegmentTimelineElement)list.get(i - startNumber)).startTime - presentationTimeOffset;
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

		public MultiSegmentBase(RangedUri rangeduri, long l, long l1, int i, long l2, List list)
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

	public static class SegmentList extends MultiSegmentBase
	{

		public int getLastSegmentNum(long l)
		{
			return (startNumber + mediaSegments.size()) - 1;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field int startNumber>
		//    2    4:aload_0         
		//    3    5:getfield        #17  <Field List mediaSegments>
		//    4    8:invokeinterface #32  <Method int List.size()>
		//    5   13:iadd            
		//    6   14:iconst_1        
		//    7   15:isub            
		//    8   16:ireturn         
		}

		public RangedUri getSegmentUrl(Representation representation, int i)
		{
			return (RangedUri)mediaSegments.get(i - startNumber);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field List mediaSegments>
		//    2    4:iload_2         
		//    3    5:aload_0         
		//    4    6:getfield        #26  <Field int startNumber>
		//    5    9:isub            
		//    6   10:invokeinterface #38  <Method Object List.get(int)>
		//    7   15:checkcast       #40  <Class RangedUri>
		//    8   18:areturn         
		}

		public boolean isExplicit()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		final List mediaSegments;

		public SegmentList(RangedUri rangeduri, long l, long l1, int i, long l2, List list, List list1)
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
			mediaSegments = list1;
		//    8   14:aload_0         
		//    9   15:aload           10
		//   10   17:putfield        #17  <Field List mediaSegments>
		//   11   20:return          
		}
	}

	public static class SegmentTemplate extends MultiSegmentBase
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
				l = ((SegmentTimelineElement)segmentTimeline.get(i - startNumber)).startTime;
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

		public SegmentTemplate(RangedUri rangeduri, long l, long l1, int i, long l2, List list, UrlTemplate urltemplate, UrlTemplate urltemplate1)
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

	public static class SegmentTimelineElement
	{

		long duration;
		long startTime;

		public SegmentTimelineElement(long l, long l1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			startTime = l;
		//    2    4:aload_0         
		//    3    5:lload_1         
		//    4    6:putfield        #17  <Field long startTime>
			duration = l1;
		//    5    9:aload_0         
		//    6   10:lload_3         
		//    7   11:putfield        #19  <Field long duration>
		//    8   14:return          
		}
	}

	public static class SingleSegmentBase extends SegmentBase
	{

		public RangedUri getIndex()
		{
			long l = indexLength;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field long indexLength>
		//    2    4:lstore_1        
			if(l <= 0L)
		//*   3    5:lload_1         
		//*   4    6:lconst_0        
		//*   5    7:lcmp            
		//*   6    8:ifgt            13
				return null;
		//    7   11:aconst_null     
		//    8   12:areturn         
			else
				return new RangedUri(((String) (null)), indexStart, l);
		//    9   13:new             #27  <Class RangedUri>
		//   10   16:dup             
		//   11   17:aconst_null     
		//   12   18:aload_0         
		//   13   19:getfield        #21  <Field long indexStart>
		//   14   22:lload_1         
		//   15   23:invokespecial   #30  <Method void RangedUri(String, long, long)>
		//   16   26:areturn         
		}

		final long indexLength;
		final long indexStart;

		public SingleSegmentBase()
		{
			this(((RangedUri) (null)), 1L, 0L, 0L, -1L);
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:lconst_1        
		//    3    3:lconst_0        
		//    4    4:lconst_0        
		//    5    5:ldc2w           #11  <Long -1L>
		//    6    8:invokespecial   #15  <Method void SegmentBase$SingleSegmentBase(RangedUri, long, long, long, long)>
		//    7   11:return          
		}

		public SingleSegmentBase(RangedUri rangeduri, long l, long l1, long l2, 
				long l3)
		{
			super(rangeduri, l, l1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:lload_2         
		//    3    3:lload           4
		//    4    5:invokespecial   #19  <Method void SegmentBase(RangedUri, long, long)>
			indexStart = l2;
		//    5    8:aload_0         
		//    6    9:lload           6
		//    7   11:putfield        #21  <Field long indexStart>
			indexLength = l3;
		//    8   14:aload_0         
		//    9   15:lload           8
		//   10   17:putfield        #23  <Field long indexLength>
		//   11   20:return          
		}
	}


	public SegmentBase(RangedUri rangeduri, long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		initialization = rangeduri;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #31  <Field RangedUri initialization>
		timescale = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #33  <Field long timescale>
		presentationTimeOffset = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #35  <Field long presentationTimeOffset>
	//   11   20:return          
	}

	public RangedUri getInitialization(Representation representation)
	{
		return initialization;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field RangedUri initialization>
	//    2    4:areturn         
	}

	public long getPresentationTimeOffsetUs()
	{
		return Util.scaleLargeTimestamp(presentationTimeOffset, 0xf4240L, timescale);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field long presentationTimeOffset>
	//    2    4:ldc2w           #41  <Long 0xf4240L>
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field long timescale>
	//    5   11:invokestatic    #48  <Method long Util.scaleLargeTimestamp(long, long, long)>
	//    6   14:lreturn         
	}

	final RangedUri initialization;
	final long presentationTimeOffset;
	final long timescale;
}
