// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.location.Location;

// Referenced classes of package com.amap.api.mapcore.util:
//			s, hm

class g
	implements com.amap.api.maps.LocationSource.OnLocationChangedListener
{

	g(s s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		b = s1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field s b>
	//    5    9:return          
	}

	public void onLocationChanged(Location location)
	{
		a = location;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field Location a>
		try
		{
			if(b.isMyLocationEnabled())
	//*   3    5:aload_0         
	//*   4    6:getfield        #17  <Field s b>
	//*   5    9:invokeinterface #30  <Method boolean s.isMyLocationEnabled()>
	//*   6   14:ifeq            27
				b.a(location);
	//    7   17:aload_0         
	//    8   18:getfield        #17  <Field s b>
	//    9   21:aload_1         
	//   10   22:invokeinterface #32  <Method void s.a(Location)>
			return;
	//   11   27:return          
		}
		// Misplaced declaration of an exception variable
		catch(Location location)
	//*  12   28:astore_1        
		{
			hm.c(((Throwable) (location)), "AMapOnLocationChangedListener", "onLocationChanged");
	//   13   29:aload_1         
	//   14   30:ldc1            #34  <String "AMapOnLocationChangedListener">
	//   15   32:ldc1            #35  <String "onLocationChanged">
	//   16   34:invokestatic    #41  <Method void hm.c(Throwable, String, String)>
		}
		((Throwable) (location)).printStackTrace();
	//   17   37:aload_1         
	//   18   38:invokevirtual   #44  <Method void Throwable.printStackTrace()>
	//   19   41:return          
	}

	Location a;
	private s b;
}
