// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash.manifest;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Util;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.source.dash.manifest:
//			RangedUri, Representation, UrlTemplate

public abstract class SegmentBase
{
	public static abstract class MultiSegmentBase extends SegmentBase
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
				return (((SegmentTimelineElement)segmentTimeline.get((int)(l - startNumber))).duration * 0xf4240L) / timescale;
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
				l = ((SegmentTimelineElement)segmentTimeline.get((int)(l - startNumber))).startTime - presentationTimeOffset;
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

		public MultiSegmentBase(RangedUri rangeduri, long l, long l1, long l2, 
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

	public static class SegmentList extends MultiSegmentBase
	{

		public int getSegmentCount(long l)
		{
			return mediaSegments.size();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field List mediaSegments>
		//    2    4:invokeinterface #28  <Method int List.size()>
		//    3    9:ireturn         
		}

		public RangedUri getSegmentUrl(Representation representation, long l)
		{
			return (RangedUri)mediaSegments.get((int)(l - startNumber));
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field List mediaSegments>
		//    2    4:lload_2         
		//    3    5:aload_0         
		//    4    6:getfield        #34  <Field long startNumber>
		//    5    9:lsub            
		//    6   10:l2i             
		//    7   11:invokeinterface #38  <Method Object List.get(int)>
		//    8   16:checkcast       #40  <Class RangedUri>
		//    9   19:areturn         
		}

		public boolean isExplicit()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		final List mediaSegments;

		public SegmentList(RangedUri rangeduri, long l, long l1, long l2, 
				long l3, List list, List list1)
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
			mediaSegments = list1;
		//    8   14:aload_0         
		//    9   15:aload           11
		//   10   17:putfield        #17  <Field List mediaSegments>
		//   11   20:return          
		}
	}

	public static class SegmentTemplate extends MultiSegmentBase
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
				l1 = ((SegmentTimelineElement)segmentTimeline.get((int)(l - startNumber))).startTime;
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

		public SegmentTemplate(RangedUri rangeduri, long l, long l1, long l2, 
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

	public static class SegmentTimelineElement
	{

		final long duration;
		final long startTime;

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
			if(indexLength <= 0L)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field long indexLength>
		//*   2    4:lconst_0        
		//*   3    5:lcmp            
		//*   4    6:ifgt            11
				return null;
		//    5    9:aconst_null     
		//    6   10:areturn         
			else
				return new RangedUri(((String) (null)), indexStart, indexLength);
		//    7   11:new             #25  <Class RangedUri>
		//    8   14:dup             
		//    9   15:aconst_null     
		//   10   16:aload_0         
		//   11   17:getfield        #19  <Field long indexStart>
		//   12   20:aload_0         
		//   13   21:getfield        #21  <Field long indexLength>
		//   14   24:invokespecial   #28  <Method void RangedUri(String, long, long)>
		//   15   27:areturn         
		}

		final long indexLength;
		final long indexStart;

		public SingleSegmentBase()
		{
			this(((RangedUri) (null)), 1L, 0L, 0L, 0L);
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:lconst_1        
		//    3    3:lconst_0        
		//    4    4:lconst_0        
		//    5    5:lconst_0        
		//    6    6:invokespecial   #13  <Method void SegmentBase$SingleSegmentBase(RangedUri, long, long, long, long)>
		//    7    9:return          
		}

		public SingleSegmentBase(RangedUri rangeduri, long l, long l1, long l2, 
				long l3)
		{
			super(rangeduri, l, l1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:lload_2         
		//    3    3:lload           4
		//    4    5:invokespecial   #17  <Method void SegmentBase(RangedUri, long, long)>
			indexStart = l2;
		//    5    8:aload_0         
		//    6    9:lload           6
		//    7   11:putfield        #19  <Field long indexStart>
			indexLength = l3;
		//    8   14:aload_0         
		//    9   15:lload           8
		//   10   17:putfield        #21  <Field long indexLength>
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
