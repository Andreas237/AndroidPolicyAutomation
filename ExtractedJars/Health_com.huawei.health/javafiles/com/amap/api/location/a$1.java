// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.location;


// Referenced classes of package com.amap.api.location:
//			a, b, AMapLocalWeatherListener

class a$1 extends Thread
{

	public void run()
	{
		c.h.a(a, b, com.amap.api.location.a.d(c));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field a c>
	//    2    4:getfield        #31  <Field b a.h>
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field int a>
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field AMapLocalWeatherListener b>
	//    7   15:aload_0         
	//    8   16:getfield        #18  <Field a c>
	//    9   19:invokestatic    #35  <Method AMapLocation a.d(a)>
	//   10   22:invokevirtual   #40  <Method void b.a(int, AMapLocalWeatherListener, AMapLocation)>
	//   11   25:return          
	}

	final int a;
	final AMapLocalWeatherListener b;
	final a c;

	a$1(a a1, int i, AMapLocalWeatherListener amaplocalweatherlistener)
	{
		c = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field a c>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #20  <Field int a>
		b = amaplocalweatherlistener;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #22  <Field AMapLocalWeatherListener b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #25  <Method void Thread()>
	//   11   19:return          
	}
}
