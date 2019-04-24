// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Assertions;

public final class SinglePeriodTimeline extends Timeline
{

	public SinglePeriodTimeline(long l, long l1, long l2, long l3, long l4, long l5, boolean flag, boolean flag1, 
			Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Timeline()>
		presentationStartTimeMs = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #32  <Field long presentationStartTimeMs>
		windowStartTimeMs = l1;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #34  <Field long windowStartTimeMs>
		periodDurationUs = l2;
	//    8   14:aload_0         
	//    9   15:lload           5
	//   10   17:putfield        #36  <Field long periodDurationUs>
		windowDurationUs = l3;
	//   11   20:aload_0         
	//   12   21:lload           7
	//   13   23:putfield        #38  <Field long windowDurationUs>
		windowPositionInPeriodUs = l4;
	//   14   26:aload_0         
	//   15   27:lload           9
	//   16   29:putfield        #40  <Field long windowPositionInPeriodUs>
		windowDefaultStartPositionUs = l5;
	//   17   32:aload_0         
	//   18   33:lload           11
	//   19   35:putfield        #42  <Field long windowDefaultStartPositionUs>
		isSeekable = flag;
	//   20   38:aload_0         
	//   21   39:iload           13
	//   22   41:putfield        #44  <Field boolean isSeekable>
		isDynamic = flag1;
	//   23   44:aload_0         
	//   24   45:iload           14
	//   25   47:putfield        #46  <Field boolean isDynamic>
		tag = obj;
	//   26   50:aload_0         
	//   27   51:aload           15
	//   28   53:putfield        #48  <Field Object tag>
	//   29   56:return          
	}

	public SinglePeriodTimeline(long l, long l1, long l2, long l3, boolean flag, boolean flag1, Object obj)
	{
		this(0x1L, 0x1L, l, l1, l2, l3, flag, flag1, obj);
	//    0    0:aload_0         
	//    1    1:ldc2w           #51  <Long 0x1L>
	//    2    4:ldc2w           #51  <Long 0x1L>
	//    3    7:lload_1         
	//    4    8:lload_3         
	//    5    9:lload           5
	//    6   11:lload           7
	//    7   13:iload           9
	//    8   15:iload           10
	//    9   17:aload           11
	//   10   19:invokespecial   #54  <Method void SinglePeriodTimeline(long, long, long, long, long, long, boolean, boolean, Object)>
	//   11   22:return          
	}

	public SinglePeriodTimeline(long l, boolean flag, boolean flag1)
	{
		this(l, flag, flag1, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:aconst_null     
	//    5    6:invokespecial   #58  <Method void SinglePeriodTimeline(long, boolean, boolean, Object)>
	//    6    9:return          
	}

	public SinglePeriodTimeline(long l, boolean flag, boolean flag1, Object obj)
	{
		this(l, l, 0L, 0L, flag, flag1, obj);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_1         
	//    3    3:lconst_0        
	//    4    4:lconst_0        
	//    5    5:iload_3         
	//    6    6:iload           4
	//    7    8:aload           5
	//    8   10:invokespecial   #60  <Method void SinglePeriodTimeline(long, long, long, long, boolean, boolean, Object)>
	//    9   13:return          
	}

	public int getIndexOfPeriod(Object obj)
	{
		return !UID.equals(obj) ? -1 : 0;
	//    0    0:getstatic       #27  <Field Object UID>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #66  <Method boolean Object.equals(Object)>
	//    3    7:ifeq            12
	//    4   10:iconst_0        
	//    5   11:ireturn         
	//    6   12:iconst_m1       
	//    7   13:ireturn         
	}

	public com.google.android.exoplayer2.Timeline.Period getPeriod(int i, com.google.android.exoplayer2.Timeline.Period period, boolean flag)
	{
		Assertions.checkIndex(i, 0, 1);
	//    0    0:iload_1         
	//    1    1:iconst_0        
	//    2    2:iconst_1        
	//    3    3:invokestatic    #74  <Method int Assertions.checkIndex(int, int, int)>
	//    4    6:pop             
		Object obj;
		if(flag)
	//*   5    7:iload_3         
	//*   6    8:ifeq            19
			obj = UID;
	//    7   11:getstatic       #27  <Field Object UID>
	//    8   14:astore          4
		else
	//*   9   16:goto            25
			obj = null;
	//   10   19:aconst_null     
	//   11   20:astore          4
	//*  12   22:goto            16
		return period.set(((Object) (null)), obj, 0, periodDurationUs, -windowPositionInPeriodUs);
	//   13   25:aload_2         
	//   14   26:aconst_null     
	//   15   27:aload           4
	//   16   29:iconst_0        
	//   17   30:aload_0         
	//   18   31:getfield        #36  <Field long periodDurationUs>
	//   19   34:aload_0         
	//   20   35:getfield        #40  <Field long windowPositionInPeriodUs>
	//   21   38:lneg            
	//   22   39:invokevirtual   #80  <Method com.google.android.exoplayer2.Timeline$Period com.google.android.exoplayer2.Timeline$Period.set(Object, Object, int, long, long)>
	//   23   42:areturn         
	}

	public int getPeriodCount()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public com.google.android.exoplayer2.Timeline.Window getWindow(int i, com.google.android.exoplayer2.Timeline.Window window, boolean flag, long l)
	{
		long l1;
		Object obj;
		Assertions.checkIndex(i, 0, 1);
	//    0    0:iload_1         
	//    1    1:iconst_0        
	//    2    2:iconst_1        
	//    3    3:invokestatic    #74  <Method int Assertions.checkIndex(int, int, int)>
	//    4    6:pop             
		if(flag)
	//*   5    7:iload_3         
	//*   6    8:ifeq            20
			obj = tag;
	//    7   11:aload_0         
	//    8   12:getfield        #48  <Field Object tag>
	//    9   15:astore          8
		else
	//*  10   17:goto            26
			obj = null;
	//   11   20:aconst_null     
	//   12   21:astore          8
	//*  13   23:goto            17
		l1 = windowDefaultStartPositionUs;
	//   14   26:aload_0         
	//   15   27:getfield        #42  <Field long windowDefaultStartPositionUs>
	//   16   30:lstore          6
		if(!isDynamic || l == 0L) goto _L2; else goto _L1
	//   17   32:aload_0         
	//   18   33:getfield        #46  <Field boolean isDynamic>
	//   19   36:ifeq            88
	//   20   39:lload           4
	//   21   41:lconst_0        
	//   22   42:lcmp            
	//   23   43:ifeq            88
_L1:
		if(windowDurationUs != 0x1L) goto _L4; else goto _L3
	//   24   46:aload_0         
	//   25   47:getfield        #38  <Field long windowDurationUs>
	//   26   50:ldc2w           #51  <Long 0x1L>
	//   27   53:lcmp            
	//   28   54:ifne            65
_L3:
		l = 0x1L;
	//   29   57:ldc2w           #51  <Long 0x1L>
	//   30   60:lstore          4
		break; /* Loop/switch isn't completed */
	//   31   62:goto            92
	//*  32   65:lload           6
	//*  33   67:lload           4
	//*  34   69:ladd            
	//*  35   70:lstore          4
_L4:
		if((l = l1 + l) <= windowDurationUs) goto _L5; else goto _L3
	//   36   72:lload           4
	//   37   74:aload_0         
	//   38   75:getfield        #38  <Field long windowDurationUs>
	//   39   78:lcmp            
	//   40   79:ifle            85
	//*  41   82:goto            57
	//*  42   85:goto            92
_L2:
		l = l1;
	//   43   88:lload           6
	//   44   90:lstore          4
_L5:
		return window.set(obj, presentationStartTimeMs, windowStartTimeMs, isSeekable, isDynamic, l, windowDurationUs, 0, 0, windowPositionInPeriodUs);
	//   45   92:aload_2         
	//   46   93:aload           8
	//   47   95:aload_0         
	//   48   96:getfield        #32  <Field long presentationStartTimeMs>
	//   49   99:aload_0         
	//   50  100:getfield        #34  <Field long windowStartTimeMs>
	//   51  103:aload_0         
	//   52  104:getfield        #44  <Field boolean isSeekable>
	//   53  107:aload_0         
	//   54  108:getfield        #46  <Field boolean isDynamic>
	//   55  111:lload           4
	//   56  113:aload_0         
	//   57  114:getfield        #38  <Field long windowDurationUs>
	//   58  117:iconst_0        
	//   59  118:iconst_0        
	//   60  119:aload_0         
	//   61  120:getfield        #40  <Field long windowPositionInPeriodUs>
	//   62  123:invokevirtual   #89  <Method com.google.android.exoplayer2.Timeline$Window com.google.android.exoplayer2.Timeline$Window.set(Object, long, long, boolean, boolean, long, long, int, int, long)>
	//   63  126:areturn         
	}

	public int getWindowCount()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final Object UID = new Object();
	private final boolean isDynamic;
	private final boolean isSeekable;
	private final long periodDurationUs;
	private final long presentationStartTimeMs;
	private final Object tag;
	private final long windowDefaultStartPositionUs;
	private final long windowDurationUs;
	private final long windowPositionInPeriodUs;
	private final long windowStartTimeMs;

	static 
	{
	//    0    0:new             #22  <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void Object()>
	//    3    7:putstatic       #27  <Field Object UID>
	//*   4   10:return          
	}
}
