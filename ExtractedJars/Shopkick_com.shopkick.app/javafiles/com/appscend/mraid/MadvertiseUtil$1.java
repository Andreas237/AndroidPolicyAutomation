// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import android.location.*;
import android.os.Bundle;

// Referenced classes of package com.appscend.mraid:
//			MadvertiseUtil

static final class MadvertiseUtil$1
	implements LocationListener
{

	public void onLocationChanged(Location location)
	{
		MadvertiseUtil.logMessage(((String) (null)), 3, "Refreshing location");
	//    0    0:aconst_null     
	//    1    1:iconst_3        
	//    2    2:ldc1            #25  <String "Refreshing location">
	//    3    4:invokestatic    #29  <Method void MadvertiseUtil.logMessage(String, int, String)>
		Location _tmp = MadvertiseUtil.access$002(location);
	//    4    7:aload_1         
	//    5    8:invokestatic    #33  <Method Location MadvertiseUtil.access$002(Location)>
	//    6   11:pop             
		long _tmp1 = MadvertiseUtil.access$102(System.currentTimeMillis());
	//    7   12:invokestatic    #39  <Method long System.currentTimeMillis()>
	//    8   15:invokestatic    #43  <Method long MadvertiseUtil.access$102(long)>
	//    9   18:pop2            
		val$finalizedLocationManager.removeUpdates(((LocationListener) (this)));
	//   10   19:aload_0         
	//   11   20:getfield        #17  <Field LocationManager val$finalizedLocationManager>
	//   12   23:aload_0         
	//   13   24:invokevirtual   #49  <Method void LocationManager.removeUpdates(LocationListener)>
	//   14   27:return          
	}

	public void onProviderDisabled(String s)
	{
	//    0    0:return          
	}

	public void onProviderEnabled(String s)
	{
	//    0    0:return          
	}

	public void onStatusChanged(String s, int i, Bundle bundle)
	{
	//    0    0:return          
	}

	final LocationManager val$finalizedLocationManager;

	MadvertiseUtil$1(LocationManager locationmanager)
	{
		val$finalizedLocationManager = locationmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field LocationManager val$finalizedLocationManager>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
