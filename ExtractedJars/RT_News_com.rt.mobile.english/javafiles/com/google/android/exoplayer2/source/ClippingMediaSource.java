// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.ArrayList;

// Referenced classes of package com.google.android.exoplayer2.source:
//			CompositeMediaSource, MediaSource, ClippingMediaPeriod, MediaPeriod, 
//			ForwardingTimeline

public final class ClippingMediaSource extends CompositeMediaSource
{
	private static final class ClippingTimeline extends ForwardingTimeline
	{

		public com.google.android.exoplayer2.Timeline.Period getPeriod(int i, com.google.android.exoplayer2.Timeline.Period period, boolean flag)
		{
			timeline.getPeriod(0, period, flag);
		//    0    0:aload_0         
		//    1    1:getfield        #69  <Field Timeline timeline>
		//    2    4:iconst_0        
		//    3    5:aload_2         
		//    4    6:iload_3         
		//    5    7:invokevirtual   #71  <Method com.google.android.exoplayer2.Timeline$Period Timeline.getPeriod(int, com.google.android.exoplayer2.Timeline$Period, boolean)>
		//    6   10:pop             
			long l1 = period.getPositionInWindowUs() - startUs;
		//    7   11:aload_2         
		//    8   12:invokevirtual   #77  <Method long com.google.android.exoplayer2.Timeline$Period.getPositionInWindowUs()>
		//    9   15:aload_0         
		//   10   16:getfield        #55  <Field long startUs>
		//   11   19:lsub            
		//   12   20:lstore          6
			long l2 = durationUs;
		//   13   22:aload_0         
		//   14   23:getfield        #58  <Field long durationUs>
		//   15   26:lstore          8
			long l = 0x1L;
		//   16   28:ldc2w           #49  <Long 0x1L>
		//   17   31:lstore          4
			if(l2 != 0x1L)
		//*  18   33:lload           8
		//*  19   35:ldc2w           #49  <Long 0x1L>
		//*  20   38:lcmp            
		//*  21   39:ifne            45
		//*  22   42:goto            57
				l = durationUs - l1;
		//   23   45:aload_0         
		//   24   46:getfield        #58  <Field long durationUs>
		//   25   49:lload           6
		//   26   51:lsub            
		//   27   52:lstore          4
		//*  28   54:goto            42
			return period.set(period.id, period.uid, 0, l, l1);
		//   29   57:aload_2         
		//   30   58:aload_2         
		//   31   59:getfield        #81  <Field Object com.google.android.exoplayer2.Timeline$Period.id>
		//   32   62:aload_2         
		//   33   63:getfield        #84  <Field Object com.google.android.exoplayer2.Timeline$Period.uid>
		//   34   66:iconst_0        
		//   35   67:lload           4
		//   36   69:lload           6
		//   37   71:invokevirtual   #88  <Method com.google.android.exoplayer2.Timeline$Period com.google.android.exoplayer2.Timeline$Period.set(Object, Object, int, long, long)>
		//   38   74:areturn         
		}

		public com.google.android.exoplayer2.Timeline.Window getWindow(int i, com.google.android.exoplayer2.Timeline.Window window1, boolean flag, long l)
		{
			timeline.getWindow(0, window1, flag, 0L);
		//    0    0:aload_0         
		//    1    1:getfield        #69  <Field Timeline timeline>
		//    2    4:iconst_0        
		//    3    5:aload_2         
		//    4    6:iload_3         
		//    5    7:lconst_0        
		//    6    8:invokevirtual   #91  <Method com.google.android.exoplayer2.Timeline$Window Timeline.getWindow(int, com.google.android.exoplayer2.Timeline$Window, boolean, long)>
		//    7   11:pop             
			window1.positionInFirstPeriodUs = window1.positionInFirstPeriodUs + startUs;
		//    8   12:aload_2         
		//    9   13:aload_2         
		//   10   14:getfield        #94  <Field long com.google.android.exoplayer2.Timeline$Window.positionInFirstPeriodUs>
		//   11   17:aload_0         
		//   12   18:getfield        #55  <Field long startUs>
		//   13   21:ladd            
		//   14   22:putfield        #94  <Field long com.google.android.exoplayer2.Timeline$Window.positionInFirstPeriodUs>
			window1.durationUs = durationUs;
		//   15   25:aload_2         
		//   16   26:aload_0         
		//   17   27:getfield        #58  <Field long durationUs>
		//   18   30:putfield        #48  <Field long com.google.android.exoplayer2.Timeline$Window.durationUs>
			window1.isDynamic = isDynamic;
		//   19   33:aload_2         
		//   20   34:aload_0         
		//   21   35:getfield        #61  <Field boolean isDynamic>
		//   22   38:putfield        #60  <Field boolean com.google.android.exoplayer2.Timeline$Window.isDynamic>
			if(window1.defaultPositionUs != 0x1L)
		//*  23   41:aload_2         
		//*  24   42:getfield        #97  <Field long com.google.android.exoplayer2.Timeline$Window.defaultPositionUs>
		//*  25   45:ldc2w           #49  <Long 0x1L>
		//*  26   48:lcmp            
		//*  27   49:ifeq            119
			{
				window1.defaultPositionUs = Math.max(window1.defaultPositionUs, startUs);
		//   28   52:aload_2         
		//   29   53:aload_2         
		//   30   54:getfield        #97  <Field long com.google.android.exoplayer2.Timeline$Window.defaultPositionUs>
		//   31   57:aload_0         
		//   32   58:getfield        #55  <Field long startUs>
		//   33   61:invokestatic    #44  <Method long Math.max(long, long)>
		//   34   64:putfield        #97  <Field long com.google.android.exoplayer2.Timeline$Window.defaultPositionUs>
				if(endUs == 0x1L)
		//*  35   67:aload_0         
		//*  36   68:getfield        #57  <Field long endUs>
		//*  37   71:ldc2w           #49  <Long 0x1L>
		//*  38   74:lcmp            
		//*  39   75:ifne            87
					l = window1.defaultPositionUs;
		//   40   78:aload_2         
		//   41   79:getfield        #97  <Field long com.google.android.exoplayer2.Timeline$Window.defaultPositionUs>
		//   42   82:lstore          4
				else
		//*  43   84:goto            100
					l = Math.min(window1.defaultPositionUs, endUs);
		//   44   87:aload_2         
		//   45   88:getfield        #97  <Field long com.google.android.exoplayer2.Timeline$Window.defaultPositionUs>
		//   46   91:aload_0         
		//   47   92:getfield        #57  <Field long endUs>
		//   48   95:invokestatic    #100 <Method long Math.min(long, long)>
		//   49   98:lstore          4
				window1.defaultPositionUs = l;
		//   50  100:aload_2         
		//   51  101:lload           4
		//   52  103:putfield        #97  <Field long com.google.android.exoplayer2.Timeline$Window.defaultPositionUs>
				window1.defaultPositionUs = window1.defaultPositionUs - startUs;
		//   53  106:aload_2         
		//   54  107:aload_2         
		//   55  108:getfield        #97  <Field long com.google.android.exoplayer2.Timeline$Window.defaultPositionUs>
		//   56  111:aload_0         
		//   57  112:getfield        #55  <Field long startUs>
		//   58  115:lsub            
		//   59  116:putfield        #97  <Field long com.google.android.exoplayer2.Timeline$Window.defaultPositionUs>
			}
			l = C.usToMs(startUs);
		//   60  119:aload_0         
		//   61  120:getfield        #55  <Field long startUs>
		//   62  123:invokestatic    #106 <Method long C.usToMs(long)>
		//   63  126:lstore          4
			if(window1.presentationStartTimeMs != 0x1L)
		//*  64  128:aload_2         
		//*  65  129:getfield        #109 <Field long com.google.android.exoplayer2.Timeline$Window.presentationStartTimeMs>
		//*  66  132:ldc2w           #49  <Long 0x1L>
		//*  67  135:lcmp            
		//*  68  136:ifeq            150
				window1.presentationStartTimeMs = window1.presentationStartTimeMs + l;
		//   69  139:aload_2         
		//   70  140:aload_2         
		//   71  141:getfield        #109 <Field long com.google.android.exoplayer2.Timeline$Window.presentationStartTimeMs>
		//   72  144:lload           4
		//   73  146:ladd            
		//   74  147:putfield        #109 <Field long com.google.android.exoplayer2.Timeline$Window.presentationStartTimeMs>
			if(window1.windowStartTimeMs != 0x1L)
		//*  75  150:aload_2         
		//*  76  151:getfield        #112 <Field long com.google.android.exoplayer2.Timeline$Window.windowStartTimeMs>
		//*  77  154:ldc2w           #49  <Long 0x1L>
		//*  78  157:lcmp            
		//*  79  158:ifeq            172
				window1.windowStartTimeMs = window1.windowStartTimeMs + l;
		//   80  161:aload_2         
		//   81  162:aload_2         
		//   82  163:getfield        #112 <Field long com.google.android.exoplayer2.Timeline$Window.windowStartTimeMs>
		//   83  166:lload           4
		//   84  168:ladd            
		//   85  169:putfield        #112 <Field long com.google.android.exoplayer2.Timeline$Window.windowStartTimeMs>
			return window1;
		//   86  172:aload_2         
		//   87  173:areturn         
		}

		private final long durationUs;
		private final long endUs;
		private final boolean isDynamic;
		private final long startUs;

		public ClippingTimeline(Timeline timeline, long l, long l1)
			throws IllegalClippingException
		{
			boolean flag;
label0:
			{
				super(timeline);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #20  <Method void ForwardingTimeline(Timeline)>
				int i = timeline.getPeriodCount();
		//    3    5:aload_1         
		//    4    6:invokevirtual   #26  <Method int Timeline.getPeriodCount()>
		//    5    9:istore          6
				boolean flag1 = true;
		//    6   11:iconst_1        
		//    7   12:istore          12
				if(i != 1)
		//*   8   14:iload           6
		//*   9   16:iconst_1        
		//*  10   17:icmpeq          29
					throw new IllegalClippingException(0);
		//   11   20:new             #17  <Class ClippingMediaSource$IllegalClippingException>
		//   12   23:dup             
		//   13   24:iconst_0        
		//   14   25:invokespecial   #29  <Method void ClippingMediaSource$IllegalClippingException(int)>
		//   15   28:athrow          
				timeline = ((Timeline) (timeline.getWindow(0, new com.google.android.exoplayer2.Timeline.Window(), false)));
		//   16   29:aload_1         
		//   17   30:iconst_0        
		//   18   31:new             #31  <Class com.google.android.exoplayer2.Timeline$Window>
		//   19   34:dup             
		//   20   35:invokespecial   #34  <Method void com.google.android.exoplayer2.Timeline$Window()>
		//   21   38:iconst_0        
		//   22   39:invokevirtual   #38  <Method com.google.android.exoplayer2.Timeline$Window Timeline.getWindow(int, com.google.android.exoplayer2.Timeline$Window, boolean)>
		//   23   42:astore_1        
				long l3 = Math.max(0L, l);
		//   24   43:lconst_0        
		//   25   44:lload_2         
		//   26   45:invokestatic    #44  <Method long Math.max(long, long)>
		//   27   48:lstore          9
				if(l1 == 0x0L)
		//*  28   50:lload           4
		//*  29   52:ldc2w           #45  <Long 0x0L>
		//*  30   55:lcmp            
		//*  31   56:ifne            67
					l = ((com.google.android.exoplayer2.Timeline.Window) (timeline)).durationUs;
		//   32   59:aload_1         
		//   33   60:getfield        #48  <Field long com.google.android.exoplayer2.Timeline$Window.durationUs>
		//   34   63:lstore_2        
				else
		//*  35   64:goto            74
					l = Math.max(0L, l1);
		//   36   67:lconst_0        
		//   37   68:lload           4
		//   38   70:invokestatic    #44  <Method long Math.max(long, long)>
		//   39   73:lstore_2        
				long l2 = l;
		//   40   74:lload_2         
		//   41   75:lstore          7
				if(((com.google.android.exoplayer2.Timeline.Window) (timeline)).durationUs != 0x1L)
		//*  42   77:aload_1         
		//*  43   78:getfield        #48  <Field long com.google.android.exoplayer2.Timeline$Window.durationUs>
		//*  44   81:ldc2w           #49  <Long 0x1L>
		//*  45   84:lcmp            
		//*  46   85:ifeq            150
				{
					l1 = l;
		//   47   88:lload_2         
		//   48   89:lstore          4
					if(l > ((com.google.android.exoplayer2.Timeline.Window) (timeline)).durationUs)
		//*  49   91:lload_2         
		//*  50   92:aload_1         
		//*  51   93:getfield        #48  <Field long com.google.android.exoplayer2.Timeline$Window.durationUs>
		//*  52   96:lcmp            
		//*  53   97:ifle            106
						l1 = ((com.google.android.exoplayer2.Timeline.Window) (timeline)).durationUs;
		//   54  100:aload_1         
		//   55  101:getfield        #48  <Field long com.google.android.exoplayer2.Timeline$Window.durationUs>
		//   56  104:lstore          4
					if(l3 != 0L && !((com.google.android.exoplayer2.Timeline.Window) (timeline)).isSeekable)
		//*  57  106:lload           9
		//*  58  108:lconst_0        
		//*  59  109:lcmp            
		//*  60  110:ifeq            129
		//*  61  113:aload_1         
		//*  62  114:getfield        #53  <Field boolean com.google.android.exoplayer2.Timeline$Window.isSeekable>
		//*  63  117:ifne            129
						throw new IllegalClippingException(1);
		//   64  120:new             #17  <Class ClippingMediaSource$IllegalClippingException>
		//   65  123:dup             
		//   66  124:iconst_1        
		//   67  125:invokespecial   #29  <Method void ClippingMediaSource$IllegalClippingException(int)>
		//   68  128:athrow          
					l2 = l1;
		//   69  129:lload           4
		//   70  131:lstore          7
					if(l3 > l1)
		//*  71  133:lload           9
		//*  72  135:lload           4
		//*  73  137:lcmp            
		//*  74  138:ifle            150
						throw new IllegalClippingException(2);
		//   75  141:new             #17  <Class ClippingMediaSource$IllegalClippingException>
		//   76  144:dup             
		//   77  145:iconst_2        
		//   78  146:invokespecial   #29  <Method void ClippingMediaSource$IllegalClippingException(int)>
		//   79  149:athrow          
				}
				startUs = l3;
		//   80  150:aload_0         
		//   81  151:lload           9
		//   82  153:putfield        #55  <Field long startUs>
				endUs = l2;
		//   83  156:aload_0         
		//   84  157:lload           7
		//   85  159:putfield        #57  <Field long endUs>
				if(l2 == 0x1L)
		//*  86  162:lload           7
		//*  87  164:ldc2w           #49  <Long 0x1L>
		//*  88  167:lcmp            
		//*  89  168:ifne            178
					l = 0x1L;
		//   90  171:ldc2w           #49  <Long 0x1L>
		//   91  174:lstore_2        
				else
		//*  92  175:goto            184
					l = l2 - l3;
		//   93  178:lload           7
		//   94  180:lload           9
		//   95  182:lsub            
		//   96  183:lstore_2        
				durationUs = l;
		//   97  184:aload_0         
		//   98  185:lload_2         
		//   99  186:putfield        #58  <Field long durationUs>
				if(((com.google.android.exoplayer2.Timeline.Window) (timeline)).isDynamic)
		//* 100  189:aload_1         
		//* 101  190:getfield        #60  <Field boolean com.google.android.exoplayer2.Timeline$Window.isDynamic>
		//* 102  193:ifeq            237
				{
					flag = flag1;
		//  103  196:iload           12
		//  104  198:istore          11
					if(l2 == 0x1L)
						break label0;
		//  105  200:lload           7
		//  106  202:ldc2w           #49  <Long 0x1L>
		//  107  205:lcmp            
		//  108  206:ifeq            240
					if(((com.google.android.exoplayer2.Timeline.Window) (timeline)).durationUs != 0x1L && l2 == ((com.google.android.exoplayer2.Timeline.Window) (timeline)).durationUs)
		//* 109  209:aload_1         
		//* 110  210:getfield        #48  <Field long com.google.android.exoplayer2.Timeline$Window.durationUs>
		//* 111  213:ldc2w           #49  <Long 0x1L>
		//* 112  216:lcmp            
		//* 113  217:ifeq            237
		//* 114  220:lload           7
		//* 115  222:aload_1         
		//* 116  223:getfield        #48  <Field long com.google.android.exoplayer2.Timeline$Window.durationUs>
		//* 117  226:lcmp            
		//* 118  227:ifne            237
					{
						flag = flag1;
		//  119  230:iload           12
		//  120  232:istore          11
						break label0;
		//  121  234:goto            240
					}
				}
				flag = false;
		//  122  237:iconst_0        
		//  123  238:istore          11
			}
			isDynamic = flag;
		//  124  240:aload_0         
		//  125  241:iload           11
		//  126  243:putfield        #61  <Field boolean isDynamic>
		//  127  246:return          
		}
	}

	public static final class IllegalClippingException extends IOException
	{

		private static String getReasonDescription(int i)
		{
			switch(i)
		//*   0    0:iload_0         
			{
		//*   1    1:tableswitch     0 2: default 28
		//		               0 37
		//		               1 34
		//		               2 31
			default:
				return "unknown";
		//    2   28:ldc1            #47  <String "unknown">
		//    3   30:areturn         

			case 2: // '\002'
				return "start exceeds end";
		//    4   31:ldc1            #49  <String "start exceeds end">
		//    5   33:areturn         

			case 1: // '\001'
				return "not seekable to start";
		//    6   34:ldc1            #51  <String "not seekable to start">
		//    7   36:areturn         

			case 0: // '\0'
				return "invalid period count";
		//    8   37:ldc1            #53  <String "invalid period count">
		//    9   39:areturn         
			}
		}

		public static final int REASON_INVALID_PERIOD_COUNT = 0;
		public static final int REASON_NOT_SEEKABLE_TO_START = 1;
		public static final int REASON_START_EXCEEDS_END = 2;
		public final int reason;

		public IllegalClippingException(int i)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #22  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("Illegal clipping: ");
		//    4    8:aload_2         
		//    5    9:ldc1            #27  <String "Illegal clipping: ">
		//    6   11:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(getReasonDescription(i));
		//    8   15:aload_2         
		//    9   16:iload_1         
		//   10   17:invokestatic    #35  <Method String getReasonDescription(int)>
		//   11   20:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
		//   12   23:pop             
			super(stringbuilder.toString());
		//   13   24:aload_0         
		//   14   25:aload_2         
		//   15   26:invokevirtual   #39  <Method String StringBuilder.toString()>
		//   16   29:invokespecial   #42  <Method void IOException(String)>
			reason = i;
		//   17   32:aload_0         
		//   18   33:iload_1         
		//   19   34:putfield        #44  <Field int reason>
		//   20   37:return          
		}
	}

	public static interface IllegalClippingException.Reason
		extends Annotation
	{
	}


	public ClippingMediaSource(MediaSource mediasource, long l)
	{
		this(mediasource, 0L, l, true, false, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lconst_0        
	//    3    3:lload_2         
	//    4    4:iconst_1        
	//    5    5:iconst_0        
	//    6    6:iconst_1        
	//    7    7:invokespecial   #42  <Method void ClippingMediaSource(MediaSource, long, long, boolean, boolean, boolean)>
	//    8   10:return          
	}

	public ClippingMediaSource(MediaSource mediasource, long l, long l1)
	{
		this(mediasource, l, l1, true, false, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:lload           4
	//    4    5:iconst_1        
	//    5    6:iconst_0        
	//    6    7:iconst_0        
	//    7    8:invokespecial   #42  <Method void ClippingMediaSource(MediaSource, long, long, boolean, boolean, boolean)>
	//    8   11:return          
	}

	public ClippingMediaSource(MediaSource mediasource, long l, long l1, boolean flag)
	{
		this(mediasource, l, l1, flag, false, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:lload           4
	//    4    5:iload           6
	//    5    7:iconst_0        
	//    6    8:iconst_0        
	//    7    9:invokespecial   #42  <Method void ClippingMediaSource(MediaSource, long, long, boolean, boolean, boolean)>
	//    8   12:return          
	}

	public ClippingMediaSource(MediaSource mediasource, long l, long l1, boolean flag, boolean flag1, 
			boolean flag2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void CompositeMediaSource()>
		boolean flag3;
		if(l >= 0L)
	//*   2    4:lload_2         
	//*   3    5:lconst_0        
	//*   4    6:lcmp            
	//*   5    7:iflt            16
			flag3 = true;
	//    6   10:iconst_1        
	//    7   11:istore          9
		else
	//*   8   13:goto            19
			flag3 = false;
	//    9   16:iconst_0        
	//   10   17:istore          9
		Assertions.checkArgument(flag3);
	//   11   19:iload           9
	//   12   21:invokestatic    #56  <Method void Assertions.checkArgument(boolean)>
		mediaSource = (MediaSource)Assertions.checkNotNull(((Object) (mediasource)));
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:invokestatic    #60  <Method Object Assertions.checkNotNull(Object)>
	//   16   29:checkcast       #62  <Class MediaSource>
	//   17   32:putfield        #64  <Field MediaSource mediaSource>
		startUs = l;
	//   18   35:aload_0         
	//   19   36:lload_2         
	//   20   37:putfield        #66  <Field long startUs>
		endUs = l1;
	//   21   40:aload_0         
	//   22   41:lload           4
	//   23   43:putfield        #68  <Field long endUs>
		enableInitialDiscontinuity = flag;
	//   24   46:aload_0         
	//   25   47:iload           6
	//   26   49:putfield        #70  <Field boolean enableInitialDiscontinuity>
		allowDynamicClippingUpdates = flag1;
	//   27   52:aload_0         
	//   28   53:iload           7
	//   29   55:putfield        #72  <Field boolean allowDynamicClippingUpdates>
		relativeToDefaultPosition = flag2;
	//   30   58:aload_0         
	//   31   59:iload           8
	//   32   61:putfield        #74  <Field boolean relativeToDefaultPosition>
		mediaPeriods = new ArrayList();
	//   33   64:aload_0         
	//   34   65:new             #76  <Class ArrayList>
	//   35   68:dup             
	//   36   69:invokespecial   #77  <Method void ArrayList()>
	//   37   72:putfield        #79  <Field ArrayList mediaPeriods>
		window = new com.google.android.exoplayer2.Timeline.Window();
	//   38   75:aload_0         
	//   39   76:new             #81  <Class com.google.android.exoplayer2.Timeline$Window>
	//   40   79:dup             
	//   41   80:invokespecial   #82  <Method void com.google.android.exoplayer2.Timeline$Window()>
	//   42   83:putfield        #84  <Field com.google.android.exoplayer2.Timeline$Window window>
	//   43   86:return          
	}

	private void refreshClippedTimeline(Timeline timeline)
	{
		Object obj = ((Object) (window));
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field com.google.android.exoplayer2.Timeline$Window window>
	//    2    4:astore          14
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		timeline.getWindow(0, ((com.google.android.exoplayer2.Timeline.Window) (obj)));
	//    5    8:aload_1         
	//    6    9:iconst_0        
	//    7   10:aload           14
	//    8   12:invokevirtual   #92  <Method com.google.android.exoplayer2.Timeline$Window Timeline.getWindow(int, com.google.android.exoplayer2.Timeline$Window)>
	//    9   15:pop             
		long l4 = window.getPositionInFirstPeriodUs();
	//   10   16:aload_0         
	//   11   17:getfield        #84  <Field com.google.android.exoplayer2.Timeline$Window window>
	//   12   20:invokevirtual   #96  <Method long com.google.android.exoplayer2.Timeline$Window.getPositionInFirstPeriodUs()>
	//   13   23:lstore          10
		obj = ((Object) (clippingTimeline));
	//   14   25:aload_0         
	//   15   26:getfield        #98  <Field ClippingMediaSource$ClippingTimeline clippingTimeline>
	//   16   29:astore          14
		long l3 = 0x0L;
	//   17   31:ldc2w           #99  <Long 0x0L>
	//   18   34:lstore          8
		long l2;
		if(obj != null && !mediaPeriods.isEmpty() && !allowDynamicClippingUpdates)
	//*  19   36:aload           14
	//*  20   38:ifnull          108
	//*  21   41:aload_0         
	//*  22   42:getfield        #79  <Field ArrayList mediaPeriods>
	//*  23   45:invokevirtual   #104 <Method boolean ArrayList.isEmpty()>
	//*  24   48:ifne            108
	//*  25   51:aload_0         
	//*  26   52:getfield        #72  <Field boolean allowDynamicClippingUpdates>
	//*  27   55:ifeq            61
	//*  28   58:goto            108
		{
			l2 = periodStartUs;
	//   29   61:aload_0         
	//   30   62:getfield        #106 <Field long periodStartUs>
	//   31   65:lstore          6
			long l;
			if(endUs == 0x0L)
	//*  32   67:aload_0         
	//*  33   68:getfield        #68  <Field long endUs>
	//*  34   71:ldc2w           #99  <Long 0x0L>
	//*  35   74:lcmp            
	//*  36   75:ifne            85
				l = l3;
	//   37   78:lload           8
	//   38   80:lstore          4
			else
	//*  39   82:goto            94
				l = periodEndUs - l4;
	//   40   85:aload_0         
	//   41   86:getfield        #108 <Field long periodEndUs>
	//   42   89:lload           10
	//   43   91:lsub            
	//   44   92:lstore          4
			l2 -= l4;
	//   45   94:lload           6
	//   46   96:lload           10
	//   47   98:lsub            
	//   48   99:lstore          6
			l3 = l;
	//   49  101:lload           4
	//   50  103:lstore          8
		} else
	//*  51  105:goto            239
		{
			long l1 = startUs;
	//   52  108:aload_0         
	//   53  109:getfield        #66  <Field long startUs>
	//   54  112:lstore          4
			l2 = endUs;
	//   55  114:aload_0         
	//   56  115:getfield        #68  <Field long endUs>
	//   57  118:lstore          6
			if(relativeToDefaultPosition)
	//*  58  120:aload_0         
	//*  59  121:getfield        #74  <Field boolean relativeToDefaultPosition>
	//*  60  124:ifeq            153
			{
				long l5 = window.getDefaultPositionUs();
	//   61  127:aload_0         
	//   62  128:getfield        #84  <Field com.google.android.exoplayer2.Timeline$Window window>
	//   63  131:invokevirtual   #111 <Method long com.google.android.exoplayer2.Timeline$Window.getDefaultPositionUs()>
	//   64  134:lstore          12
				l1 += l5;
	//   65  136:lload           4
	//   66  138:lload           12
	//   67  140:ladd            
	//   68  141:lstore          4
				l2 += l5;
	//   69  143:lload           6
	//   70  145:lload           12
	//   71  147:ladd            
	//   72  148:lstore          6
			}
	//*  73  150:goto            153
			periodStartUs = l4 + l1;
	//   74  153:aload_0         
	//   75  154:lload           10
	//   76  156:lload           4
	//   77  158:ladd            
	//   78  159:putfield        #106 <Field long periodStartUs>
			if(endUs != 0x0L)
	//*  79  162:aload_0         
	//*  80  163:getfield        #68  <Field long endUs>
	//*  81  166:ldc2w           #99  <Long 0x0L>
	//*  82  169:lcmp            
	//*  83  170:ifne            176
	//*  84  173:goto            183
				l3 = l4 + l2;
	//   85  176:lload           10
	//   86  178:lload           6
	//   87  180:ladd            
	//   88  181:lstore          8
			periodEndUs = l3;
	//   89  183:aload_0         
	//   90  184:lload           8
	//   91  186:putfield        #108 <Field long periodEndUs>
			for(int j = mediaPeriods.size(); i < j; i++)
	//*  92  189:aload_0         
	//*  93  190:getfield        #79  <Field ArrayList mediaPeriods>
	//*  94  193:invokevirtual   #115 <Method int ArrayList.size()>
	//*  95  196:istore_3        
	//*  96  197:iload_2         
	//*  97  198:iload_3         
	//*  98  199:icmpge          231
				((ClippingMediaPeriod)mediaPeriods.get(i)).updateClipping(periodStartUs, periodEndUs);
	//   99  202:aload_0         
	//  100  203:getfield        #79  <Field ArrayList mediaPeriods>
	//  101  206:iload_2         
	//  102  207:invokevirtual   #119 <Method Object ArrayList.get(int)>
	//  103  210:checkcast       #121 <Class ClippingMediaPeriod>
	//  104  213:aload_0         
	//  105  214:getfield        #106 <Field long periodStartUs>
	//  106  217:aload_0         
	//  107  218:getfield        #108 <Field long periodEndUs>
	//  108  221:invokevirtual   #125 <Method void ClippingMediaPeriod.updateClipping(long, long)>

	//  109  224:iload_2         
	//  110  225:iconst_1        
	//  111  226:iadd            
	//  112  227:istore_2        
	//* 113  228:goto            197
			l3 = l2;
	//  114  231:lload           6
	//  115  233:lstore          8
			l2 = l1;
	//  116  235:lload           4
	//  117  237:lstore          6
		}
		try
		{
			clippingTimeline = new ClippingTimeline(timeline, l2, l3);
	//  118  239:aload_0         
	//  119  240:new             #7   <Class ClippingMediaSource$ClippingTimeline>
	//  120  243:dup             
	//  121  244:aload_1         
	//  122  245:lload           6
	//  123  247:lload           8
	//  124  249:invokespecial   #128 <Method void ClippingMediaSource$ClippingTimeline(Timeline, long, long)>
	//  125  252:putfield        #98  <Field ClippingMediaSource$ClippingTimeline clippingTimeline>
		}
	//* 126  255:aload_0         
	//* 127  256:aload_0         
	//* 128  257:getfield        #98  <Field ClippingMediaSource$ClippingTimeline clippingTimeline>
	//* 129  260:aload_0         
	//* 130  261:getfield        #130 <Field Object manifest>
	//* 131  264:invokevirtual   #134 <Method void refreshSourceInfo(Timeline, Object)>
	//* 132  267:return          
		// Misplaced declaration of an exception variable
		catch(Timeline timeline)
	//* 133  268:astore_1        
		{
			clippingError = ((IllegalClippingException) (timeline));
	//  134  269:aload_0         
	//  135  270:aload_1         
	//  136  271:putfield        #136 <Field ClippingMediaSource$IllegalClippingException clippingError>
			return;
	//  137  274:return          
		}
		refreshSourceInfo(((Timeline) (clippingTimeline)), manifest);
	}

	public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaperiodid, Allocator allocator)
	{
		mediaperiodid = ((MediaSource.MediaPeriodId) (new ClippingMediaPeriod(mediaSource.createPeriod(mediaperiodid, allocator), enableInitialDiscontinuity, periodStartUs, periodEndUs)));
	//    0    0:new             #121 <Class ClippingMediaPeriod>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #64  <Field MediaSource mediaSource>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #140 <Method MediaPeriod MediaSource.createPeriod(MediaSource$MediaPeriodId, Allocator)>
	//    7   15:aload_0         
	//    8   16:getfield        #70  <Field boolean enableInitialDiscontinuity>
	//    9   19:aload_0         
	//   10   20:getfield        #106 <Field long periodStartUs>
	//   11   23:aload_0         
	//   12   24:getfield        #108 <Field long periodEndUs>
	//   13   27:invokespecial   #143 <Method void ClippingMediaPeriod(MediaPeriod, boolean, long, long)>
	//   14   30:astore_1        
		mediaPeriods.add(((Object) (mediaperiodid)));
	//   15   31:aload_0         
	//   16   32:getfield        #79  <Field ArrayList mediaPeriods>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #147 <Method boolean ArrayList.add(Object)>
	//   19   39:pop             
		return ((MediaPeriod) (mediaperiodid));
	//   20   40:aload_1         
	//   21   41:areturn         
	}

	protected volatile long getMediaTimeForChildMediaTime(Object obj, long l)
	{
		return getMediaTimeForChildMediaTime((Void)obj, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #151 <Class Void>
	//    3    5:lload_2         
	//    4    6:invokevirtual   #154 <Method long getMediaTimeForChildMediaTime(Void, long)>
	//    5    9:lreturn         
	}

	protected long getMediaTimeForChildMediaTime(Void void1, long l)
	{
		if(l == 0x1L)
	//*   0    0:lload_2         
	//*   1    1:ldc2w           #155 <Long 0x1L>
	//*   2    4:lcmp            
	//*   3    5:ifne            12
			return 0x1L;
	//    4    8:ldc2w           #155 <Long 0x1L>
	//    5   11:lreturn         
		long l2 = C.usToMs(startUs);
	//    6   12:aload_0         
	//    7   13:getfield        #66  <Field long startUs>
	//    8   16:invokestatic    #162 <Method long C.usToMs(long)>
	//    9   19:lstore          6
		long l1 = Math.max(0L, l - l2);
	//   10   21:lconst_0        
	//   11   22:lload_2         
	//   12   23:lload           6
	//   13   25:lsub            
	//   14   26:invokestatic    #168 <Method long Math.max(long, long)>
	//   15   29:lstore          4
		l = l1;
	//   16   31:lload           4
	//   17   33:lstore_2        
		if(endUs != 0x0L)
	//*  18   34:aload_0         
	//*  19   35:getfield        #68  <Field long endUs>
	//*  20   38:ldc2w           #99  <Long 0x0L>
	//*  21   41:lcmp            
	//*  22   42:ifeq            61
			l = Math.min(C.usToMs(endUs) - l2, l1);
	//   23   45:aload_0         
	//   24   46:getfield        #68  <Field long endUs>
	//   25   49:invokestatic    #162 <Method long C.usToMs(long)>
	//   26   52:lload           6
	//   27   54:lsub            
	//   28   55:lload           4
	//   29   57:invokestatic    #171 <Method long Math.min(long, long)>
	//   30   60:lstore_2        
		return l;
	//   31   61:lload_2         
	//   32   62:lreturn         
	}

	public void maybeThrowSourceInfoRefreshError()
		throws IOException
	{
		if(clippingError != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #136 <Field ClippingMediaSource$IllegalClippingException clippingError>
	//*   2    4:ifnull          12
		{
			throw clippingError;
	//    3    7:aload_0         
	//    4    8:getfield        #136 <Field ClippingMediaSource$IllegalClippingException clippingError>
	//    5   11:athrow          
		} else
		{
			super.maybeThrowSourceInfoRefreshError();
	//    6   12:aload_0         
	//    7   13:invokespecial   #176 <Method void CompositeMediaSource.maybeThrowSourceInfoRefreshError()>
			return;
	//    8   16:return          
		}
	}

	protected volatile void onChildSourceInfoRefreshed(Object obj, MediaSource mediasource, Timeline timeline, Object obj1)
	{
		onChildSourceInfoRefreshed((Void)obj, mediasource, timeline, obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #151 <Class Void>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #182 <Method void onChildSourceInfoRefreshed(Void, MediaSource, Timeline, Object)>
	//    7   12:return          
	}

	protected void onChildSourceInfoRefreshed(Void void1, MediaSource mediasource, Timeline timeline, Object obj)
	{
		if(clippingError != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #136 <Field ClippingMediaSource$IllegalClippingException clippingError>
	//*   2    4:ifnull          8
		{
			return;
	//    3    7:return          
		} else
		{
			manifest = obj;
	//    4    8:aload_0         
	//    5    9:aload           4
	//    6   11:putfield        #130 <Field Object manifest>
			refreshClippedTimeline(timeline);
	//    7   14:aload_0         
	//    8   15:aload_3         
	//    9   16:invokespecial   #185 <Method void refreshClippedTimeline(Timeline)>
			return;
	//   10   19:return          
		}
	}

	public void prepareSourceInternal(ExoPlayer exoplayer, boolean flag)
	{
		super.prepareSourceInternal(exoplayer, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #189 <Method void CompositeMediaSource.prepareSourceInternal(ExoPlayer, boolean)>
		prepareChildSource(((Object) (null)), mediaSource);
	//    4    6:aload_0         
	//    5    7:aconst_null     
	//    6    8:aload_0         
	//    7    9:getfield        #64  <Field MediaSource mediaSource>
	//    8   12:invokevirtual   #193 <Method void prepareChildSource(Object, MediaSource)>
	//    9   15:return          
	}

	public void releasePeriod(MediaPeriod mediaperiod)
	{
		Assertions.checkState(mediaPeriods.remove(((Object) (mediaperiod))));
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field ArrayList mediaPeriods>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #198 <Method boolean ArrayList.remove(Object)>
	//    4    8:invokestatic    #201 <Method void Assertions.checkState(boolean)>
		mediaSource.releasePeriod(((ClippingMediaPeriod)mediaperiod).mediaPeriod);
	//    5   11:aload_0         
	//    6   12:getfield        #64  <Field MediaSource mediaSource>
	//    7   15:aload_1         
	//    8   16:checkcast       #121 <Class ClippingMediaPeriod>
	//    9   19:getfield        #205 <Field MediaPeriod ClippingMediaPeriod.mediaPeriod>
	//   10   22:invokeinterface #207 <Method void MediaSource.releasePeriod(MediaPeriod)>
		if(mediaPeriods.isEmpty() && !allowDynamicClippingUpdates)
	//*  11   27:aload_0         
	//*  12   28:getfield        #79  <Field ArrayList mediaPeriods>
	//*  13   31:invokevirtual   #104 <Method boolean ArrayList.isEmpty()>
	//*  14   34:ifeq            55
	//*  15   37:aload_0         
	//*  16   38:getfield        #72  <Field boolean allowDynamicClippingUpdates>
	//*  17   41:ifne            55
			refreshClippedTimeline(clippingTimeline.timeline);
	//   18   44:aload_0         
	//   19   45:aload_0         
	//   20   46:getfield        #98  <Field ClippingMediaSource$ClippingTimeline clippingTimeline>
	//   21   49:getfield        #211 <Field Timeline ClippingMediaSource$ClippingTimeline.timeline>
	//   22   52:invokespecial   #185 <Method void refreshClippedTimeline(Timeline)>
	//   23   55:return          
	}

	public void releaseSourceInternal()
	{
		super.releaseSourceInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #214 <Method void CompositeMediaSource.releaseSourceInternal()>
		clippingError = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #136 <Field ClippingMediaSource$IllegalClippingException clippingError>
		clippingTimeline = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #98  <Field ClippingMediaSource$ClippingTimeline clippingTimeline>
	//    8   14:return          
	}

	private final boolean allowDynamicClippingUpdates;
	private IllegalClippingException clippingError;
	private ClippingTimeline clippingTimeline;
	private final boolean enableInitialDiscontinuity;
	private final long endUs;
	private Object manifest;
	private final ArrayList mediaPeriods;
	private final MediaSource mediaSource;
	private long periodEndUs;
	private long periodStartUs;
	private final boolean relativeToDefaultPosition;
	private final long startUs;
	private final com.google.android.exoplayer2.Timeline.Window window;
}
