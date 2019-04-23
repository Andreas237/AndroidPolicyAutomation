// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.services;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.*;
import android.os.Bundle;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy.services:
//			AppboyLocationService

class AppboyLocationService$1
	implements LocationListener
{

	public void onLocationChanged(Location location)
	{
		if(location != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          112
		{
			AppboyLogger.d(AppboyLocationService.a(), "Requesting single location update.");
	//    2    4:invokestatic    #28  <Method String AppboyLocationService.a()>
	//    3    7:ldc1            #30  <String "Requesting single location update.">
	//    4    9:invokestatic    #36  <Method int AppboyLogger.d(String, String)>
	//    5   12:pop             
			Object obj = ((Object) (new StringBuilder()));
	//    6   13:new             #38  <Class StringBuilder>
	//    7   16:dup             
	//    8   17:invokespecial   #39  <Method void StringBuilder()>
	//    9   20:astore_2        
			((StringBuilder) (obj)).append(a.getApplicationContext().getPackageName());
	//   10   21:aload_2         
	//   11   22:aload_0         
	//   12   23:getfield        #17  <Field AppboyLocationService a>
	//   13   26:invokevirtual   #43  <Method Context AppboyLocationService.getApplicationContext()>
	//   14   29:invokevirtual   #48  <Method String Context.getPackageName()>
	//   15   32:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   16   35:pop             
			((StringBuilder) (obj)).append(".SINGLE_APPBOY_LOCATION_UPDATE");
	//   17   36:aload_2         
	//   18   37:ldc1            #54  <String ".SINGLE_APPBOY_LOCATION_UPDATE">
	//   19   39:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   20   42:pop             
			obj = ((Object) (new Intent(((StringBuilder) (obj)).toString())));
	//   21   43:new             #56  <Class Intent>
	//   22   46:dup             
	//   23   47:aload_2         
	//   24   48:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   25   51:invokespecial   #62  <Method void Intent(String)>
	//   26   54:astore_2        
			((Intent) (obj)).putExtra("location", ((android.os.Parcelable) (location)));
	//   27   55:aload_2         
	//   28   56:ldc1            #64  <String "location">
	//   29   58:aload_1         
	//   30   59:invokevirtual   #68  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   31   62:pop             
			((Intent) (obj)).putExtra("origin", "Appboy location service");
	//   32   63:aload_2         
	//   33   64:ldc1            #70  <String "origin">
	//   34   66:ldc1            #72  <String "Appboy location service">
	//   35   68:invokevirtual   #75  <Method Intent Intent.putExtra(String, String)>
	//   36   71:pop             
			location = ((Location) (PendingIntent.getBroadcast(a.getApplicationContext(), 0, ((Intent) (obj)), 0x8000000)));
	//   37   72:aload_0         
	//   38   73:getfield        #17  <Field AppboyLocationService a>
	//   39   76:invokevirtual   #43  <Method Context AppboyLocationService.getApplicationContext()>
	//   40   79:iconst_0        
	//   41   80:aload_2         
	//   42   81:ldc1            #76  <Int 0x8000000>
	//   43   83:invokestatic    #82  <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   44   86:astore_1        
			try
			{
				AppboyLocationService.a(a).requestSingleUpdate("passive", ((PendingIntent) (location)));
	//   45   87:aload_0         
	//   46   88:getfield        #17  <Field AppboyLocationService a>
	//   47   91:invokestatic    #85  <Method LocationManager AppboyLocationService.a(AppboyLocationService)>
	//   48   94:ldc1            #87  <String "passive">
	//   49   96:aload_1         
	//   50   97:invokevirtual   #93  <Method void LocationManager.requestSingleUpdate(String, PendingIntent)>
				return;
	//   51  100:return          
			}
			// Misplaced declaration of an exception variable
			catch(Location location)
	//*  52  101:astore_1        
			{
				AppboyLogger.w(AppboyLocationService.a(), "Could not request single location update. Security exception from insufficient permissions", ((Throwable) (location)));
	//   53  102:invokestatic    #28  <Method String AppboyLocationService.a()>
	//   54  105:ldc1            #95  <String "Could not request single location update. Security exception from insufficient permissions">
	//   55  107:aload_1         
	//   56  108:invokestatic    #99  <Method int AppboyLogger.w(String, String, Throwable)>
	//   57  111:pop             
			}
		}
	//   58  112:return          
	}

	public void onProviderDisabled(String s)
	{
		if(s != null && s.equals("passive"))
	//*   0    0:aload_1         
	//*   1    1:ifnull          20
	//*   2    4:aload_1         
	//*   3    5:ldc1            #87  <String "passive">
	//*   4    7:invokevirtual   #106 <Method boolean String.equals(Object)>
	//*   5   10:ifeq            20
			AppboyLocationService.b(a);
	//    6   13:aload_0         
	//    7   14:getfield        #17  <Field AppboyLocationService a>
	//    8   17:invokestatic    #109 <Method void AppboyLocationService.b(AppboyLocationService)>
	//    9   20:return          
	}

	public void onProviderEnabled(String s)
	{
	//    0    0:return          
	}

	public void onStatusChanged(String s, int i, Bundle bundle)
	{
	//    0    0:return          
	}

	final AppboyLocationService a;

	AppboyLocationService$1(AppboyLocationService appboylocationservice)
	{
		a = appboylocationservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AppboyLocationService a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
