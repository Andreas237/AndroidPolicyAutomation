// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;


// Referenced classes of package com.google.android.exoplayer2:
//			Timeline, C

public static final class Timeline$Window
{

	public long getDefaultPositionMs()
	{
		return C.usToMs(defaultPositionUs);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field long defaultPositionUs>
	//    2    4:invokestatic    #37  <Method long C.usToMs(long)>
	//    3    7:lreturn         
	}

	public long getDefaultPositionUs()
	{
		return defaultPositionUs;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field long defaultPositionUs>
	//    2    4:lreturn         
	}

	public long getDurationMs()
	{
		return C.usToMs(durationUs);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field long durationUs>
	//    2    4:invokestatic    #37  <Method long C.usToMs(long)>
	//    3    7:lreturn         
	}

	public long getDurationUs()
	{
		return durationUs;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field long durationUs>
	//    2    4:lreturn         
	}

	public long getPositionInFirstPeriodMs()
	{
		return C.usToMs(positionInFirstPeriodUs);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field long positionInFirstPeriodUs>
	//    2    4:invokestatic    #37  <Method long C.usToMs(long)>
	//    3    7:lreturn         
	}

	public long getPositionInFirstPeriodUs()
	{
		return positionInFirstPeriodUs;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field long positionInFirstPeriodUs>
	//    2    4:lreturn         
	}

	public Timeline$Window set(Object obj, long l, long l1, boolean flag, boolean flag1, 
			long l2, long l3, int i, int j, long l4)
	{
		tag = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #50  <Field Object tag>
		presentationStartTimeMs = l;
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:putfield        #52  <Field long presentationStartTimeMs>
		windowStartTimeMs = l1;
	//    6   10:aload_0         
	//    7   11:lload           4
	//    8   13:putfield        #54  <Field long windowStartTimeMs>
		isSeekable = flag;
	//    9   16:aload_0         
	//   10   17:iload           6
	//   11   19:putfield        #56  <Field boolean isSeekable>
		isDynamic = flag1;
	//   12   22:aload_0         
	//   13   23:iload           7
	//   14   25:putfield        #58  <Field boolean isDynamic>
		defaultPositionUs = l2;
	//   15   28:aload_0         
	//   16   29:lload           8
	//   17   31:putfield        #31  <Field long defaultPositionUs>
		durationUs = l3;
	//   18   34:aload_0         
	//   19   35:lload           10
	//   20   37:putfield        #41  <Field long durationUs>
		firstPeriodIndex = i;
	//   21   40:aload_0         
	//   22   41:iload           12
	//   23   43:putfield        #60  <Field int firstPeriodIndex>
		lastPeriodIndex = j;
	//   24   46:aload_0         
	//   25   47:iload           13
	//   26   49:putfield        #62  <Field int lastPeriodIndex>
		positionInFirstPeriodUs = l4;
	//   27   52:aload_0         
	//   28   53:lload           14
	//   29   55:putfield        #45  <Field long positionInFirstPeriodUs>
		return this;
	//   30   58:aload_0         
	//   31   59:areturn         
	}

	public long defaultPositionUs;
	public long durationUs;
	public int firstPeriodIndex;
	public boolean isDynamic;
	public boolean isSeekable;
	public int lastPeriodIndex;
	public long positionInFirstPeriodUs;
	public long presentationStartTimeMs;
	public Object tag;
	public long windowStartTimeMs;

	public Timeline$Window()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}
}
