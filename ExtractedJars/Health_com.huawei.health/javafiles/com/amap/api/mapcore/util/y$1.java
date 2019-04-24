// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			y, al, s

class y$1
	implements Runnable
{

	public void run()
	{
		try
		{
			b.a.a(al.a(a.build(), 50));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field y b>
	//    2    4:getfield        #30  <Field s y.a>
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field com.amap.api.maps.model.LatLngBounds$Builder a>
	//    5   11:invokevirtual   #36  <Method com.amap.api.maps.model.LatLngBounds com.amap.api.maps.model.LatLngBounds$Builder.build()>
	//    6   14:bipush          50
	//    7   16:invokestatic    #41  <Method com.autonavi.amap.mapcore.AbstractCameraUpdateMessage al.a(com.amap.api.maps.model.LatLngBounds, int)>
	//    8   19:invokeinterface #46  <Method void s.a(com.autonavi.amap.mapcore.AbstractCameraUpdateMessage)>
			return;
	//    9   24:return          
		}
		catch(Throwable throwable)
	//*  10   25:astore_1        
		{
			return;
	//   11   26:return          
		}
	}

	final com.amap.api.maps.model.ngBounds.Builder a;
	final y b;

	y$1(y y1, com.amap.api.maps.model.ngBounds.Builder builder)
	{
		b = y1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field y b>
		a = builder;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field com.amap.api.maps.model.LatLngBounds$Builder a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
