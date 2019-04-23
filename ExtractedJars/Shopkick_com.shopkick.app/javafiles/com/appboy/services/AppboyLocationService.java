// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.services;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.*;
import android.os.Bundle;
import android.os.IBinder;
import com.appboy.Appboy;
import com.appboy.AppboyInternal;
import com.appboy.support.AppboyLogger;

public class AppboyLocationService extends Service
{

	public AppboyLocationService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Service()>
	//    2    4:return          
	}

	static LocationManager a(AppboyLocationService appboylocationservice)
	{
		return appboylocationservice.c;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field LocationManager c>
	//    2    4:areturn         
	}

	static String a()
	{
		return a;
	//    0    0:getstatic       #25  <Field String a>
	//    1    3:areturn         
	}

	private void a(Intent intent)
	{
		String s = a;
	//    0    0:getstatic       #25  <Field String a>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #36  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #37  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("Null intent action received in Braze location service: ");
	//    6   12:aload_3         
	//    7   13:ldc1            #39  <String "Null intent action received in Braze location service: ">
	//    8   15:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(intent.getDataString());
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #48  <Method String Intent.getDataString()>
	//   13   24:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		AppboyLogger.w(s, stringbuilder.toString());
	//   15   28:aload_2         
	//   16   29:aload_3         
	//   17   30:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   18   33:invokestatic    #55  <Method int AppboyLogger.w(String, String)>
	//   19   36:pop             
	//   20   37:return          
	}

	private void b()
	{
		LocationListener locationlistener = b;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field LocationListener b>
	//    2    4:astore_1        
		if(locationlistener != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          29
			try
			{
				c.removeUpdates(locationlistener);
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field LocationManager c>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #65  <Method void LocationManager.removeUpdates(LocationListener)>
				return;
	//    9   17:return          
			}
			catch(SecurityException securityexception)
	//*  10   18:astore_1        
			{
				AppboyLogger.w(a, "Could not remove background location updates. Security exception from insufficient permissions", ((Throwable) (securityexception)));
	//   11   19:getstatic       #25  <Field String a>
	//   12   22:ldc1            #67  <String "Could not remove background location updates. Security exception from insufficient permissions">
	//   13   24:aload_1         
	//   14   25:invokestatic    #70  <Method int AppboyLogger.w(String, String, Throwable)>
	//   15   28:pop             
			}
	//   16   29:return          
	}

	private void b(Intent intent)
	{
		String s = a;
	//    0    0:getstatic       #25  <Field String a>
	//    1    3:astore          5
		StringBuilder stringbuilder1 = new StringBuilder();
	//    2    5:new             #36  <Class StringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #37  <Method void StringBuilder()>
	//    5   12:astore          6
		stringbuilder1.append("Requesting background location updates: ");
	//    6   14:aload           6
	//    7   16:ldc1            #72  <String "Requesting background location updates: ">
	//    8   18:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
		stringbuilder1.append(intent.getAction());
	//   10   22:aload           6
	//   11   24:aload_1         
	//   12   25:invokevirtual   #75  <Method String Intent.getAction()>
	//   13   28:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   14   31:pop             
		AppboyLogger.d(s, stringbuilder1.toString());
	//   15   32:aload           5
	//   16   34:aload           6
	//   17   36:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   18   39:invokestatic    #78  <Method int AppboyLogger.d(String, String)>
	//   19   42:pop             
		if(c == null)
	//*  20   43:aload_0         
	//*  21   44:getfield        #32  <Field LocationManager c>
	//*  22   47:ifnonnull       66
			c = (LocationManager)getApplicationContext().getSystemService("location");
	//   23   50:aload_0         
	//   24   51:aload_0         
	//   25   52:invokevirtual   #82  <Method Context getApplicationContext()>
	//   26   55:ldc1            #84  <String "location">
	//   27   57:invokevirtual   #90  <Method Object Context.getSystemService(String)>
	//   28   60:checkcast       #61  <Class LocationManager>
	//   29   63:putfield        #32  <Field LocationManager c>
		if(b == null)
	//*  30   66:aload_0         
	//*  31   67:getfield        #59  <Field LocationListener b>
	//*  32   70:ifnonnull       81
			b = c();
	//   33   73:aload_0         
	//   34   74:aload_0         
	//   35   75:invokespecial   #93  <Method LocationListener c()>
	//   36   78:putfield        #59  <Field LocationListener b>
		float f = intent.getFloatExtra("distance", 50F);
	//   37   81:aload_1         
	//   38   82:ldc1            #95  <String "distance">
	//   39   84:ldc1            #96  <Float 50F>
	//   40   86:invokevirtual   #100 <Method float Intent.getFloatExtra(String, float)>
	//   41   89:fstore_2        
		long l = intent.getLongExtra("time", 0x36ee80L);
	//   42   90:aload_1         
	//   43   91:ldc1            #102 <String "time">
	//   44   93:ldc2w           #103 <Long 0x36ee80L>
	//   45   96:invokevirtual   #108 <Method long Intent.getLongExtra(String, long)>
	//   46   99:lstore_3        
		intent = ((Intent) (b));
	//   47  100:aload_0         
	//   48  101:getfield        #59  <Field LocationListener b>
	//   49  104:astore_1        
		if(intent != null)
	//*  50  105:aload_1         
	//*  51  106:ifnull          199
		{
			try
			{
				c.requestLocationUpdates("passive", l, f, ((LocationListener) (intent)));
	//   52  109:aload_0         
	//   53  110:getfield        #32  <Field LocationManager c>
	//   54  113:ldc1            #110 <String "passive">
	//   55  115:lload_3         
	//   56  116:fload_2         
	//   57  117:aload_1         
	//   58  118:invokevirtual   #114 <Method void LocationManager.requestLocationUpdates(String, long, float, LocationListener)>
				intent = ((Intent) (a));
	//   59  121:getstatic       #25  <Field String a>
	//   60  124:astore_1        
				StringBuilder stringbuilder = new StringBuilder();
	//   61  125:new             #36  <Class StringBuilder>
	//   62  128:dup             
	//   63  129:invokespecial   #37  <Method void StringBuilder()>
	//   64  132:astore          5
				stringbuilder.append("Collecting locations using passive provider with time interval ");
	//   65  134:aload           5
	//   66  136:ldc1            #116 <String "Collecting locations using passive provider with time interval ">
	//   67  138:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   68  141:pop             
				stringbuilder.append(l / 1000L);
	//   69  142:aload           5
	//   70  144:lload_3         
	//   71  145:ldc2w           #117 <Long 1000L>
	//   72  148:ldiv            
	//   73  149:invokevirtual   #121 <Method StringBuilder StringBuilder.append(long)>
	//   74  152:pop             
				stringbuilder.append("s and update distance ");
	//   75  153:aload           5
	//   76  155:ldc1            #123 <String "s and update distance ">
	//   77  157:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   78  160:pop             
				stringbuilder.append(f);
	//   79  161:aload           5
	//   80  163:fload_2         
	//   81  164:invokevirtual   #126 <Method StringBuilder StringBuilder.append(float)>
	//   82  167:pop             
				stringbuilder.append("m.");
	//   83  168:aload           5
	//   84  170:ldc1            #128 <String "m.">
	//   85  172:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   86  175:pop             
				AppboyLogger.i(((String) (intent)), stringbuilder.toString());
	//   87  176:aload_1         
	//   88  177:aload           5
	//   89  179:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   90  182:invokestatic    #131 <Method int AppboyLogger.i(String, String)>
	//   91  185:pop             
				return;
	//   92  186:return          
			}
			// Misplaced declaration of an exception variable
			catch(Intent intent)
	//*  93  187:astore_1        
			{
				AppboyLogger.w(a, "Could not request background location updates. Security exception from insufficient permissions", ((Throwable) (intent)));
	//   94  188:getstatic       #25  <Field String a>
	//   95  191:ldc1            #133 <String "Could not request background location updates. Security exception from insufficient permissions">
	//   96  193:aload_1         
	//   97  194:invokestatic    #70  <Method int AppboyLogger.w(String, String, Throwable)>
	//   98  197:pop             
			}
			return;
	//   99  198:return          
		} else
		{
			AppboyLogger.w(a, "Could not request background location updates. Braze location listener was null.");
	//  100  199:getstatic       #25  <Field String a>
	//  101  202:ldc1            #135 <String "Could not request background location updates. Braze location listener was null.">
	//  102  204:invokestatic    #55  <Method int AppboyLogger.w(String, String)>
	//  103  207:pop             
			return;
	//  104  208:return          
		}
	}

	static void b(AppboyLocationService appboylocationservice)
	{
		appboylocationservice.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #138 <Method void b()>
	//    2    4:return          
	}

	private LocationListener c()
	{
		return new LocationListener() {

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

			
			{
				a = AppboyLocationService.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppboyLocationService a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #6   <Class AppboyLocationService$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #140 <Method void AppboyLocationService$1(AppboyLocationService)>
	//    4    8:areturn         
	}

	private void c(Intent intent)
	{
		String s = a;
	//    0    0:getstatic       #25  <Field String a>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #36  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #37  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("Removing current location updates: ");
	//    6   12:aload_3         
	//    7   13:ldc1            #142 <String "Removing current location updates: ">
	//    8   15:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(intent.getAction());
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #75  <Method String Intent.getAction()>
	//   13   24:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		AppboyLogger.d(s, stringbuilder.toString());
	//   15   28:aload_2         
	//   16   29:aload_3         
	//   17   30:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   18   33:invokestatic    #78  <Method int AppboyLogger.d(String, String)>
	//   19   36:pop             
		b();
	//   20   37:aload_0         
	//   21   38:invokespecial   #138 <Method void b()>
	//   22   41:return          
	}

	private void d(Intent intent)
	{
		String s = a;
	//    0    0:getstatic       #25  <Field String a>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #36  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #37  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("Unknown intent received: ");
	//    6   12:aload_3         
	//    7   13:ldc1            #144 <String "Unknown intent received: ">
	//    8   15:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(intent.getAction());
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #75  <Method String Intent.getAction()>
	//   13   24:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		AppboyLogger.w(s, stringbuilder.toString());
	//   15   28:aload_2         
	//   16   29:aload_3         
	//   17   30:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   18   33:invokestatic    #55  <Method int AppboyLogger.w(String, String)>
	//   19   36:pop             
	//   20   37:return          
	}

	public static void requestInitialization(Context context)
	{
		AppboyLogger.d(a, "Location permissions were granted. Requesting initialization of location service and geofence initialization.");
	//    0    0:getstatic       #25  <Field String a>
	//    1    3:ldc1            #148 <String "Location permissions were granted. Requesting initialization of location service and geofence initialization.">
	//    2    5:invokestatic    #78  <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		StringBuilder stringbuilder = new StringBuilder();
	//    4    9:new             #36  <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #37  <Method void StringBuilder()>
	//    7   16:astore_1        
		stringbuilder.append(context.getPackageName());
	//    8   17:aload_1         
	//    9   18:aload_0         
	//   10   19:invokevirtual   #151 <Method String Context.getPackageName()>
	//   11   22:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
		stringbuilder.append(".REQUEST_INIT_APPBOY_LOCATION_SERVICE");
	//   13   26:aload_1         
	//   14   27:ldc1            #153 <String ".REQUEST_INIT_APPBOY_LOCATION_SERVICE">
	//   15   29:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		context.sendBroadcast(new Intent(stringbuilder.toString()));
	//   17   33:aload_0         
	//   18   34:new             #45  <Class Intent>
	//   19   37:dup             
	//   20   38:aload_1         
	//   21   39:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   22   42:invokespecial   #156 <Method void Intent(String)>
	//   23   45:invokevirtual   #159 <Method void Context.sendBroadcast(Intent)>
		AppboyInternal.requestGeofencesInitialization(context);
	//   24   48:aload_0         
	//   25   49:invokestatic    #164 <Method void AppboyInternal.requestGeofencesInitialization(Context)>
	//   26   52:return          
	}

	public IBinder onBind(Intent intent)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #169 <Method void Service.onDestroy()>
		b();
	//    2    4:aload_0         
	//    3    5:invokespecial   #138 <Method void b()>
	//    4    8:return          
	}

	public int onStartCommand(Intent intent, int i, int j)
	{
		if(intent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       23
		{
			AppboyLogger.i(a, "Null intent received. Initializing Appboy.");
	//    2    4:getstatic       #25  <Field String a>
	//    3    7:ldc1            #173 <String "Null intent received. Initializing Appboy.">
	//    4    9:invokestatic    #131 <Method int AppboyLogger.i(String, String)>
	//    5   12:pop             
			Appboy.getInstance(getApplicationContext());
	//    6   13:aload_0         
	//    7   14:invokevirtual   #82  <Method Context getApplicationContext()>
	//    8   17:invokestatic    #179 <Method Appboy Appboy.getInstance(Context)>
	//    9   20:pop             
			return 1;
	//   10   21:iconst_1        
	//   11   22:ireturn         
		}
		String s = intent.getAction();
	//   12   23:aload_1         
	//   13   24:invokevirtual   #75  <Method String Intent.getAction()>
	//   14   27:astore          4
		if(s == null)
	//*  15   29:aload           4
	//*  16   31:ifnonnull       41
		{
			a(intent);
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:invokespecial   #181 <Method void a(Intent)>
			return 1;
	//   20   39:iconst_1        
	//   21   40:ireturn         
		}
		StringBuilder stringbuilder = new StringBuilder();
	//   22   41:new             #36  <Class StringBuilder>
	//   23   44:dup             
	//   24   45:invokespecial   #37  <Method void StringBuilder()>
	//   25   48:astore          5
		stringbuilder.append(getPackageName());
	//   26   50:aload           5
	//   27   52:aload_0         
	//   28   53:invokevirtual   #182 <Method String getPackageName()>
	//   29   56:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   30   59:pop             
		stringbuilder.append(".REQUEST_APPBOY_LOCATION_UPDATES");
	//   31   60:aload           5
	//   32   62:ldc1            #184 <String ".REQUEST_APPBOY_LOCATION_UPDATES">
	//   33   64:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   34   67:pop             
		if(s.equals(((Object) (stringbuilder.toString()))))
	//*  35   68:aload           4
	//*  36   70:aload           5
	//*  37   72:invokevirtual   #51  <Method String StringBuilder.toString()>
	//*  38   75:invokevirtual   #190 <Method boolean String.equals(Object)>
	//*  39   78:ifeq            88
		{
			b(intent);
	//   40   81:aload_0         
	//   41   82:aload_1         
	//   42   83:invokespecial   #192 <Method void b(Intent)>
			return 1;
	//   43   86:iconst_1        
	//   44   87:ireturn         
		}
		stringbuilder = new StringBuilder();
	//   45   88:new             #36  <Class StringBuilder>
	//   46   91:dup             
	//   47   92:invokespecial   #37  <Method void StringBuilder()>
	//   48   95:astore          5
		stringbuilder.append(getPackageName());
	//   49   97:aload           5
	//   50   99:aload_0         
	//   51  100:invokevirtual   #182 <Method String getPackageName()>
	//   52  103:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   53  106:pop             
		stringbuilder.append(".REQUEST_REMOVE_APPBOY_LOCATION_UPDATES");
	//   54  107:aload           5
	//   55  109:ldc1            #194 <String ".REQUEST_REMOVE_APPBOY_LOCATION_UPDATES">
	//   56  111:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   57  114:pop             
		if(s.contains(((CharSequence) (stringbuilder.toString()))))
	//*  58  115:aload           4
	//*  59  117:aload           5
	//*  60  119:invokevirtual   #51  <Method String StringBuilder.toString()>
	//*  61  122:invokevirtual   #198 <Method boolean String.contains(CharSequence)>
	//*  62  125:ifeq            135
		{
			c(intent);
	//   63  128:aload_0         
	//   64  129:aload_1         
	//   65  130:invokespecial   #200 <Method void c(Intent)>
			return 1;
	//   66  133:iconst_1        
	//   67  134:ireturn         
		} else
		{
			d(intent);
	//   68  135:aload_0         
	//   69  136:aload_1         
	//   70  137:invokespecial   #202 <Method void d(Intent)>
			return 1;
	//   71  140:iconst_1        
	//   72  141:ireturn         
		}
	}

	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/services/AppboyLocationService);
	private LocationListener b;
	private LocationManager c;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyLocationService>
	//    1    2:invokestatic    #23  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #25  <Field String a>
	//*   3    8:return          
	}
}
