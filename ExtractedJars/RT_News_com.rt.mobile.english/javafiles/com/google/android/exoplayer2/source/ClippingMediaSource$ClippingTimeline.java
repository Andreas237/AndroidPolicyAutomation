// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Timeline;

// Referenced classes of package com.google.android.exoplayer2.source:
//			ForwardingTimeline, ClippingMediaSource

private static final class ClippingMediaSource$ClippingTimeline extends ForwardingTimeline
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

	public com.google.android.exoplayer2.Timeline.Window getWindow(int i, com.google.android.exoplayer2.Timeline.Window window, boolean flag, long l)
	{
		timeline.getWindow(0, window, flag, 0L);
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Timeline timeline>
	//    2    4:iconst_0        
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:lconst_0        
	//    6    8:invokevirtual   #91  <Method com.google.android.exoplayer2.Timeline$Window Timeline.getWindow(int, com.google.android.exoplayer2.Timeline$Window, boolean, long)>
	//    7   11:pop             
		window.positionInFirstPeriodUs = window.positionInFirstPeriodUs + startUs;
	//    8   12:aload_2         
	//    9   13:aload_2         
	//   10   14:getfield        #94  <Field long com.google.android.exoplayer2.Timeline$Window.positionInFirstPeriodUs>
	//   11   17:aload_0         
	//   12   18:getfield        #55  <Field long startUs>
	//   13   21:ladd            
	//   14   22:putfield        #94  <Field long com.google.android.exoplayer2.Timeline$Window.positionInFirstPeriodUs>
		window.durationUs = durationUs;
	//   15   25:aload_2         
	//   16   26:aload_0         
	//   17   27:getfield        #58  <Field long durationUs>
	//   18   30:putfield        #48  <Field long com.google.android.exoplayer2.Timeline$Window.durationUs>
		window.isDynamic = isDynamic;
	//   19   33:aload_2         
	//   20   34:aload_0         
	//   21   35:getfield        #61  <Field boolean isDynamic>
	//   22   38:putfield        #60  <Field boolean com.google.android.exoplayer2.Timeline$Window.isDynamic>
		if(window.defaultPositionUs != 0x1L)
	//*  23   41:aload_2         
	//*  24   42:getfield        #97  <Field long com.google.android.exoplayer2.Timeline$Window.defaultPositionUs>
	//*  25   45:ldc2w           #49  <Long 0x1L>
	//*  26   48:lcmp            
	//*  27   49:ifeq            119
		{
			window.defaultPositionUs = Math.max(window.defaultPositionUs, startUs);
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
				l = window.defaultPositionUs;
	//   40   78:aload_2         
	//   41   79:getfield        #97  <Field long com.google.android.exoplayer2.Timeline$Window.defaultPositionUs>
	//   42   82:lstore          4
			else
	//*  43   84:goto            100
				l = Math.min(window.defaultPositionUs, endUs);
	//   44   87:aload_2         
	//   45   88:getfield        #97  <Field long com.google.android.exoplayer2.Timeline$Window.defaultPositionUs>
	//   46   91:aload_0         
	//   47   92:getfield        #57  <Field long endUs>
	//   48   95:invokestatic    #100 <Method long Math.min(long, long)>
	//   49   98:lstore          4
			window.defaultPositionUs = l;
	//   50  100:aload_2         
	//   51  101:lload           4
	//   52  103:putfield        #97  <Field long com.google.android.exoplayer2.Timeline$Window.defaultPositionUs>
			window.defaultPositionUs = window.defaultPositionUs - startUs;
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
		if(window.presentationStartTimeMs != 0x1L)
	//*  64  128:aload_2         
	//*  65  129:getfield        #109 <Field long com.google.android.exoplayer2.Timeline$Window.presentationStartTimeMs>
	//*  66  132:ldc2w           #49  <Long 0x1L>
	//*  67  135:lcmp            
	//*  68  136:ifeq            150
			window.presentationStartTimeMs = window.presentationStartTimeMs + l;
	//   69  139:aload_2         
	//   70  140:aload_2         
	//   71  141:getfield        #109 <Field long com.google.android.exoplayer2.Timeline$Window.presentationStartTimeMs>
	//   72  144:lload           4
	//   73  146:ladd            
	//   74  147:putfield        #109 <Field long com.google.android.exoplayer2.Timeline$Window.presentationStartTimeMs>
		if(window.windowStartTimeMs != 0x1L)
	//*  75  150:aload_2         
	//*  76  151:getfield        #112 <Field long com.google.android.exoplayer2.Timeline$Window.windowStartTimeMs>
	//*  77  154:ldc2w           #49  <Long 0x1L>
	//*  78  157:lcmp            
	//*  79  158:ifeq            172
			window.windowStartTimeMs = window.windowStartTimeMs + l;
	//   80  161:aload_2         
	//   81  162:aload_2         
	//   82  163:getfield        #112 <Field long com.google.android.exoplayer2.Timeline$Window.windowStartTimeMs>
	//   83  166:lload           4
	//   84  168:ladd            
	//   85  169:putfield        #112 <Field long com.google.android.exoplayer2.Timeline$Window.windowStartTimeMs>
		return window;
	//   86  172:aload_2         
	//   87  173:areturn         
	}

	private final long durationUs;
	private final long endUs;
	private final boolean isDynamic;
	private final long startUs;

	public ClippingMediaSource$ClippingTimeline(Timeline timeline, long l, long l1)
		throws ception
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
				throw new ception(0);
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
					throw new ception(1);
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
					throw new ception(2);
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
