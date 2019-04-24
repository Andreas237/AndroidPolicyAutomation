// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;


// Referenced classes of package com.google.android.exoplayer2:
//			Timeline

static final class Timeline$1 extends Timeline
{

	public int getIndexOfPeriod(Object obj)
	{
		return -1;
	//    0    0:iconst_m1       
	//    1    1:ireturn         
	}

	public riod getPeriod(int i, riod riod, boolean flag)
	{
		throw new IndexOutOfBoundsException();
	//    0    0:new             #15  <Class IndexOutOfBoundsException>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void IndexOutOfBoundsException()>
	//    3    7:athrow          
	}

	public int getPeriodCount()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public ndow getWindow(int i, ndow ndow, boolean flag, long l)
	{
		throw new IndexOutOfBoundsException();
	//    0    0:new             #15  <Class IndexOutOfBoundsException>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void IndexOutOfBoundsException()>
	//    3    7:athrow          
	}

	public int getWindowCount()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	Timeline$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Timeline()>
	//    2    4:return          
	}
}
