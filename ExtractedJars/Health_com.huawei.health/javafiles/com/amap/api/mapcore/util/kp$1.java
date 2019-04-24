// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.autonavi.amap.mapcore.Inner_3dMap_location;

// Referenced classes of package com.amap.api.mapcore.util:
//			kp, lk, lh

final class kp$1
	implements LocationListener
{

	public final void onLocationChanged(Location location)
	{
		if(location == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		int i;
		Inner_3dMap_location inner_3dmap_location;
		try
		{
			inner_3dmap_location = new Inner_3dMap_location(location);
	//    3    5:new             #24  <Class Inner_3dMap_location>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #26  <Method void Inner_3dMap_location(Location)>
	//    7   13:astore_3        
			inner_3dmap_location.setLocationType(1);
	//    8   14:aload_3         
	//    9   15:iconst_1        
	//   10   16:invokevirtual   #30  <Method void Inner_3dMap_location.setLocationType(int)>
			location = ((Location) (location.getExtras()));
	//   11   19:aload_1         
	//   12   20:invokevirtual   #36  <Method Bundle Location.getExtras()>
	//   13   23:astore_1        
		}
	//*  14   24:iconst_0        
	//*  15   25:istore_2        
	//*  16   26:aload_1         
	//*  17   27:ifnull          37
	//*  18   30:aload_1         
	//*  19   31:ldc1            #38  <String "satellites">
	//*  20   33:invokevirtual   #44  <Method int Bundle.getInt(String)>
	//*  21   36:istore_2        
	//*  22   37:aload_3         
	//*  23   38:iload_2         
	//*  24   39:invokevirtual   #47  <Method void Inner_3dMap_location.setSatellites(int)>
	//*  25   42:aload_0         
	//*  26   43:getfield        #14  <Field kp a>
	//*  27   46:aload_3         
	//*  28   47:putfield        #51  <Field Inner_3dMap_location kp.f>
	//*  29   50:aload_0         
	//*  30   51:getfield        #14  <Field kp a>
	//*  31   54:invokestatic    #57  <Method long lk.b()>
	//*  32   57:putfield        #61  <Field long kp.c>
	//*  33   60:aload_0         
	//*  34   61:getfield        #14  <Field kp a>
	//*  35   64:iconst_1        
	//*  36   65:putfield        #65  <Field boolean kp.d>
	//*  37   68:return          
		// Misplaced declaration of an exception variable
		catch(Location location)
	//*  38   69:astore_1        
		{
			lh.a(((Throwable) (location)), "MAPGPSLocation", "onLocationChanged");
	//   39   70:aload_1         
	//   40   71:ldc1            #67  <String "MAPGPSLocation">
	//   41   73:ldc1            #68  <String "onLocationChanged">
	//   42   75:invokestatic    #73  <Method void lh.a(Throwable, String, String)>
			return;
	//   43   78:return          
		}
		i = 0;
		if(location == null)
			break MISSING_BLOCK_LABEL_37;
		i = ((Bundle) (location)).getInt("satellites");
		inner_3dmap_location.setSatellites(i);
		a.f = inner_3dmap_location;
		a.c = lk.b();
		a.d = true;
		return;
	}

	public final void onProviderDisabled(String s)
	{
		try
		{
			if("gps".equals(((Object) (s))))
	//*   0    0:ldc1            #77  <String "gps">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            17
				a.d = false;
	//    4    9:aload_0         
	//    5   10:getfield        #14  <Field kp a>
	//    6   13:iconst_0        
	//    7   14:putfield        #65  <Field boolean kp.d>
			return;
	//    8   17:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   9   18:astore_1        
		{
			lh.a(((Throwable) (s)), "MAPGPSLocation", "onProviderDisabled");
	//   10   19:aload_1         
	//   11   20:ldc1            #67  <String "MAPGPSLocation">
	//   12   22:ldc1            #84  <String "onProviderDisabled">
	//   13   24:invokestatic    #73  <Method void lh.a(Throwable, String, String)>
		}
	//   14   27:return          
	}

	public final void onProviderEnabled(String s)
	{
	//    0    0:return          
	}

	public final void onStatusChanged(String s, int i, Bundle bundle)
	{
	//    0    0:return          
	}

	final kp a;

	kp$1(kp kp1)
	{
		a = kp1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field kp a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
