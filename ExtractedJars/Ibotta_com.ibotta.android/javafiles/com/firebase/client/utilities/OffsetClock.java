// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.utilities;


// Referenced classes of package com.firebase.client.utilities:
//			Clock

public class OffsetClock
	implements Clock
{

	public OffsetClock(Clock clock, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		offset = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #17  <Field long offset>
		baseClock = clock;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #19  <Field Clock baseClock>
		offset = l;
	//    8   14:aload_0         
	//    9   15:lload_2         
	//   10   16:putfield        #17  <Field long offset>
	//   11   19:return          
	}

	public long millis()
	{
		return baseClock.millis() + offset;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Clock baseClock>
	//    2    4:invokeinterface #24  <Method long Clock.millis()>
	//    3    9:aload_0         
	//    4   10:getfield        #17  <Field long offset>
	//    5   13:ladd            
	//    6   14:lreturn         
	}

	public void setOffset(long l)
	{
		offset = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #17  <Field long offset>
	//    3    5:return          
	}

	private final Clock baseClock;
	private long offset;
}
