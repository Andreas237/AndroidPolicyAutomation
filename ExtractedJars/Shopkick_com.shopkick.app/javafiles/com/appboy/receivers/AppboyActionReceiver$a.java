// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.receivers;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.util.Log;
import bo.app.cd;
import bo.app.u;
import com.appboy.Appboy;
import com.appboy.AppboyInternal;
import com.appboy.support.AppboyLogger;
import com.google.android.gms.location.*;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.appboy.receivers:
//			AppboyActionReceiver

static class AppboyActionReceiver$a
	implements Runnable
{

	static boolean a(Context context, GeofencingEvent geofencingevent)
	{
		if(geofencingevent.hasError())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #46  <Method boolean GeofencingEvent.hasError()>
	//*   2    4:ifeq            48
		{
			int i = geofencingevent.getErrorCode();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #50  <Method int GeofencingEvent.getErrorCode()>
	//    5   11:istore_2        
			context = ((Context) (AppboyActionReceiver.a()));
	//    6   12:invokestatic    #52  <Method String AppboyActionReceiver.a()>
	//    7   15:astore_0        
			geofencingevent = ((GeofencingEvent) (new StringBuilder()));
	//    8   16:new             #54  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #55  <Method void StringBuilder()>
	//   11   23:astore_1        
			((StringBuilder) (geofencingevent)).append("AppboyLocation Services error: ");
	//   12   24:aload_1         
	//   13   25:ldc1            #57  <String "AppboyLocation Services error: ">
	//   14   27:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			((StringBuilder) (geofencingevent)).append(i);
	//   16   31:aload_1         
	//   17   32:iload_2         
	//   18   33:invokevirtual   #64  <Method StringBuilder StringBuilder.append(int)>
	//   19   36:pop             
			AppboyLogger.e(((String) (context)), ((StringBuilder) (geofencingevent)).toString());
	//   20   37:aload_0         
	//   21   38:aload_1         
	//   22   39:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   23   42:invokestatic    #73  <Method int AppboyLogger.e(String, String)>
	//   24   45:pop             
			return false;
	//   25   46:iconst_0        
	//   26   47:ireturn         
		}
		int j = geofencingevent.getGeofenceTransition();
	//   27   48:aload_1         
	//   28   49:invokevirtual   #76  <Method int GeofencingEvent.getGeofenceTransition()>
	//   29   52:istore_2        
		geofencingevent = ((GeofencingEvent) (geofencingevent.getTriggeringGeofences()));
	//   30   53:aload_1         
	//   31   54:invokevirtual   #80  <Method List GeofencingEvent.getTriggeringGeofences()>
	//   32   57:astore_1        
		if(1 == j)
	//*  33   58:iconst_1        
	//*  34   59:iload_2         
	//*  35   60:icmpne          105
		{
			for(geofencingevent = ((GeofencingEvent) (((List) (geofencingevent)).iterator())); ((Iterator) (geofencingevent)).hasNext(); AppboyInternal.recordGeofenceTransition(context, ((Geofence)((Iterator) (geofencingevent)).next()).getRequestId(), u.a));
	//   36   63:aload_1         
	//   37   64:invokeinterface #86  <Method Iterator List.iterator()>
	//   38   69:astore_1        
	//   39   70:aload_1         
	//   40   71:invokeinterface #91  <Method boolean Iterator.hasNext()>
	//   41   76:ifeq            103
	//   42   79:aload_0         
	//   43   80:aload_1         
	//   44   81:invokeinterface #95  <Method Object Iterator.next()>
	//   45   86:checkcast       #97  <Class Geofence>
	//   46   89:invokeinterface #100 <Method String Geofence.getRequestId()>
	//   47   94:getstatic       #105 <Field u u.a>
	//   48   97:invokestatic    #111 <Method void AppboyInternal.recordGeofenceTransition(Context, String, u)>
	//*  49  100:goto            70
			return true;
	//   50  103:iconst_1        
	//   51  104:ireturn         
		}
		if(2 == j)
	//*  52  105:iconst_2        
	//*  53  106:iload_2         
	//*  54  107:icmpne          152
		{
			for(geofencingevent = ((GeofencingEvent) (((List) (geofencingevent)).iterator())); ((Iterator) (geofencingevent)).hasNext(); AppboyInternal.recordGeofenceTransition(context, ((Geofence)((Iterator) (geofencingevent)).next()).getRequestId(), u.b));
	//   55  110:aload_1         
	//   56  111:invokeinterface #86  <Method Iterator List.iterator()>
	//   57  116:astore_1        
	//   58  117:aload_1         
	//   59  118:invokeinterface #91  <Method boolean Iterator.hasNext()>
	//   60  123:ifeq            150
	//   61  126:aload_0         
	//   62  127:aload_1         
	//   63  128:invokeinterface #95  <Method Object Iterator.next()>
	//   64  133:checkcast       #97  <Class Geofence>
	//   65  136:invokeinterface #100 <Method String Geofence.getRequestId()>
	//   66  141:getstatic       #113 <Field u u.b>
	//   67  144:invokestatic    #111 <Method void AppboyInternal.recordGeofenceTransition(Context, String, u)>
	//*  68  147:goto            117
			return true;
	//   69  150:iconst_1        
	//   70  151:ireturn         
		} else
		{
			context = ((Context) (AppboyActionReceiver.a()));
	//   71  152:invokestatic    #52  <Method String AppboyActionReceiver.a()>
	//   72  155:astore_0        
			geofencingevent = ((GeofencingEvent) (new StringBuilder()));
	//   73  156:new             #54  <Class StringBuilder>
	//   74  159:dup             
	//   75  160:invokespecial   #55  <Method void StringBuilder()>
	//   76  163:astore_1        
			((StringBuilder) (geofencingevent)).append("Unsupported transition type received: ");
	//   77  164:aload_1         
	//   78  165:ldc1            #115 <String "Unsupported transition type received: ">
	//   79  167:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   80  170:pop             
			((StringBuilder) (geofencingevent)).append(j);
	//   81  171:aload_1         
	//   82  172:iload_2         
	//   83  173:invokevirtual   #64  <Method StringBuilder StringBuilder.append(int)>
	//   84  176:pop             
			AppboyLogger.w(((String) (context)), ((StringBuilder) (geofencingevent)).toString());
	//   85  177:aload_0         
	//   86  178:aload_1         
	//   87  179:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   88  182:invokestatic    #118 <Method int AppboyLogger.w(String, String)>
	//   89  185:pop             
			return false;
	//   90  186:iconst_0        
	//   91  187:ireturn         
		}
	}

	static boolean a(Context context, LocationResult locationresult)
	{
		try
		{
			locationresult = ((LocationResult) (locationresult.getLastLocation()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #128 <Method Location LocationResult.getLastLocation()>
	//    2    4:astore_1        
			AppboyInternal.requestGeofenceRefresh(context, ((bo.app.bv) (new cd(((Location) (locationresult)).getLatitude(), ((Location) (locationresult)).getLongitude(), Double.valueOf(((Location) (locationresult)).getAltitude()), Double.valueOf(((Location) (locationresult)).getAccuracy())))));
	//    3    5:aload_0         
	//    4    6:new             #130 <Class cd>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokevirtual   #136 <Method double Location.getLatitude()>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #139 <Method double Location.getLongitude()>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #142 <Method double Location.getAltitude()>
	//   12   22:invokestatic    #148 <Method Double Double.valueOf(double)>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #152 <Method float Location.getAccuracy()>
	//   15   29:f2d             
	//   16   30:invokestatic    #148 <Method Double Double.valueOf(double)>
	//   17   33:invokespecial   #155 <Method void cd(double, double, Double, Double)>
	//   18   36:invokestatic    #159 <Method void AppboyInternal.requestGeofenceRefresh(Context, bo.app.bv)>
		}
	//*  19   39:iconst_1        
	//*  20   40:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  21   41:astore_0        
		{
			AppboyLogger.e(AppboyActionReceiver.a(), "Exception while processing location result", ((Throwable) (context)));
	//   22   42:invokestatic    #52  <Method String AppboyActionReceiver.a()>
	//   23   45:ldc1            #161 <String "Exception while processing location result">
	//   24   47:aload_0         
	//   25   48:invokestatic    #164 <Method int AppboyLogger.e(String, String, Throwable)>
	//   26   51:pop             
			return false;
	//   27   52:iconst_0        
	//   28   53:ireturn         
		}
		return true;
	}

	boolean a()
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field String a>
	//*   2    4:ifnonnull       18
		{
			Log.d(AppboyActionReceiver.a(), "Received intent with null action. Doing nothing.");
	//    3    7:invokestatic    #52  <Method String AppboyActionReceiver.a()>
	//    4   10:ldc1            #166 <String "Received intent with null action. Doing nothing.">
	//    5   12:invokestatic    #170 <Method int Log.d(String, String)>
	//    6   15:pop             
			return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
		}
		String s = AppboyActionReceiver.a();
	//    9   18:invokestatic    #52  <Method String AppboyActionReceiver.a()>
	//   10   21:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   11   22:new             #54  <Class StringBuilder>
	//   12   25:dup             
	//   13   26:invokespecial   #55  <Method void StringBuilder()>
	//   14   29:astore_2        
		stringbuilder.append("Received intent with action ");
	//   15   30:aload_2         
	//   16   31:ldc1            #172 <String "Received intent with action ">
	//   17   33:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
		stringbuilder.append(a);
	//   19   37:aload_2         
	//   20   38:aload_0         
	//   21   39:getfield        #35  <Field String a>
	//   22   42:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
		Log.d(s, stringbuilder.toString());
	//   24   46:aload_1         
	//   25   47:aload_2         
	//   26   48:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   27   51:invokestatic    #170 <Method int Log.d(String, String)>
	//   28   54:pop             
		if(a.equals("com.appboy.action.receiver.DATA_SYNC"))
	//*  29   55:aload_0         
	//*  30   56:getfield        #35  <Field String a>
	//*  31   59:ldc1            #174 <String "com.appboy.action.receiver.DATA_SYNC">
	//*  32   61:invokevirtual   #180 <Method boolean String.equals(Object)>
	//*  33   64:ifeq            89
		{
			AppboyLogger.d(AppboyActionReceiver.a(), "Requesting immediate data flush from AppboyActionReceiver.", false);
	//   34   67:invokestatic    #52  <Method String AppboyActionReceiver.a()>
	//   35   70:ldc1            #182 <String "Requesting immediate data flush from AppboyActionReceiver.">
	//   36   72:iconst_0        
	//   37   73:invokestatic    #185 <Method int AppboyLogger.d(String, String, boolean)>
	//   38   76:pop             
			Appboy.getInstance(b).requestImmediateDataFlush();
	//   39   77:aload_0         
	//   40   78:getfield        #25  <Field Context b>
	//   41   81:invokestatic    #191 <Method Appboy Appboy.getInstance(Context)>
	//   42   84:invokevirtual   #194 <Method void Appboy.requestImmediateDataFlush()>
			return true;
	//   43   87:iconst_1        
	//   44   88:ireturn         
		}
		if(a.equals("com.appboy.action.receiver.APPBOY_GEOFENCE_LOCATION_UPDATE"))
	//*  45   89:aload_0         
	//*  46   90:getfield        #35  <Field String a>
	//*  47   93:ldc1            #196 <String "com.appboy.action.receiver.APPBOY_GEOFENCE_LOCATION_UPDATE">
	//*  48   95:invokevirtual   #180 <Method boolean String.equals(Object)>
	//*  49   98:ifeq            202
			if(LocationResult.hasResult(d))
	//*  50  101:aload_0         
	//*  51  102:getfield        #27  <Field Intent d>
	//*  52  105:invokestatic    #200 <Method boolean LocationResult.hasResult(Intent)>
	//*  53  108:ifeq            163
			{
				String s1 = AppboyActionReceiver.a();
	//   54  111:invokestatic    #52  <Method String AppboyActionReceiver.a()>
	//   55  114:astore_1        
				StringBuilder stringbuilder1 = new StringBuilder();
	//   56  115:new             #54  <Class StringBuilder>
	//   57  118:dup             
	//   58  119:invokespecial   #55  <Method void StringBuilder()>
	//   59  122:astore_2        
				stringbuilder1.append("AppboyActionReceiver received intent with location result: ");
	//   60  123:aload_2         
	//   61  124:ldc1            #202 <String "AppboyActionReceiver received intent with location result: ">
	//   62  126:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   63  129:pop             
				stringbuilder1.append(a);
	//   64  130:aload_2         
	//   65  131:aload_0         
	//   66  132:getfield        #35  <Field String a>
	//   67  135:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   68  138:pop             
				AppboyLogger.d(s1, stringbuilder1.toString());
	//   69  139:aload_1         
	//   70  140:aload_2         
	//   71  141:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   72  144:invokestatic    #203 <Method int AppboyLogger.d(String, String)>
	//   73  147:pop             
				return a(b, LocationResult.extractResult(d));
	//   74  148:aload_0         
	//   75  149:getfield        #25  <Field Context b>
	//   76  152:aload_0         
	//   77  153:getfield        #27  <Field Intent d>
	//   78  156:invokestatic    #207 <Method LocationResult LocationResult.extractResult(Intent)>
	//   79  159:invokestatic    #209 <Method boolean a(Context, LocationResult)>
	//   80  162:ireturn         
			} else
			{
				String s2 = AppboyActionReceiver.a();
	//   81  163:invokestatic    #52  <Method String AppboyActionReceiver.a()>
	//   82  166:astore_1        
				StringBuilder stringbuilder2 = new StringBuilder();
	//   83  167:new             #54  <Class StringBuilder>
	//   84  170:dup             
	//   85  171:invokespecial   #55  <Method void StringBuilder()>
	//   86  174:astore_2        
				stringbuilder2.append("AppboyActionReceiver received intent without location result: ");
	//   87  175:aload_2         
	//   88  176:ldc1            #211 <String "AppboyActionReceiver received intent without location result: ">
	//   89  178:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   90  181:pop             
				stringbuilder2.append(a);
	//   91  182:aload_2         
	//   92  183:aload_0         
	//   93  184:getfield        #35  <Field String a>
	//   94  187:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   95  190:pop             
				AppboyLogger.w(s2, stringbuilder2.toString());
	//   96  191:aload_1         
	//   97  192:aload_2         
	//   98  193:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   99  196:invokestatic    #118 <Method int AppboyLogger.w(String, String)>
	//  100  199:pop             
				return false;
	//  101  200:iconst_0        
	//  102  201:ireturn         
			}
		if(a.equals("com.appboy.action.receiver.APPBOY_GEOFENCE_UPDATE"))
	//* 103  202:aload_0         
	//* 104  203:getfield        #35  <Field String a>
	//* 105  206:ldc1            #213 <String "com.appboy.action.receiver.APPBOY_GEOFENCE_UPDATE">
	//* 106  208:invokevirtual   #180 <Method boolean String.equals(Object)>
	//* 107  211:ifeq            266
		{
			String s3 = AppboyActionReceiver.a();
	//  108  214:invokestatic    #52  <Method String AppboyActionReceiver.a()>
	//  109  217:astore_1        
			StringBuilder stringbuilder3 = new StringBuilder();
	//  110  218:new             #54  <Class StringBuilder>
	//  111  221:dup             
	//  112  222:invokespecial   #55  <Method void StringBuilder()>
	//  113  225:astore_2        
			stringbuilder3.append("AppboyActionReceiver received intent with geofence transition: ");
	//  114  226:aload_2         
	//  115  227:ldc1            #215 <String "AppboyActionReceiver received intent with geofence transition: ">
	//  116  229:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  117  232:pop             
			stringbuilder3.append(a);
	//  118  233:aload_2         
	//  119  234:aload_0         
	//  120  235:getfield        #35  <Field String a>
	//  121  238:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  122  241:pop             
			AppboyLogger.d(s3, stringbuilder3.toString());
	//  123  242:aload_1         
	//  124  243:aload_2         
	//  125  244:invokevirtual   #67  <Method String StringBuilder.toString()>
	//  126  247:invokestatic    #203 <Method int AppboyLogger.d(String, String)>
	//  127  250:pop             
			return a(b, GeofencingEvent.fromIntent(d));
	//  128  251:aload_0         
	//  129  252:getfield        #25  <Field Context b>
	//  130  255:aload_0         
	//  131  256:getfield        #27  <Field Intent d>
	//  132  259:invokestatic    #219 <Method GeofencingEvent GeofencingEvent.fromIntent(Intent)>
	//  133  262:invokestatic    #221 <Method boolean a(Context, GeofencingEvent)>
	//  134  265:ireturn         
		} else
		{
			String s4 = AppboyActionReceiver.a();
	//  135  266:invokestatic    #52  <Method String AppboyActionReceiver.a()>
	//  136  269:astore_1        
			StringBuilder stringbuilder4 = new StringBuilder();
	//  137  270:new             #54  <Class StringBuilder>
	//  138  273:dup             
	//  139  274:invokespecial   #55  <Method void StringBuilder()>
	//  140  277:astore_2        
			stringbuilder4.append("Unknown intent received in AppboyActionReceiver with action: ");
	//  141  278:aload_2         
	//  142  279:ldc1            #223 <String "Unknown intent received in AppboyActionReceiver with action: ">
	//  143  281:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  144  284:pop             
			stringbuilder4.append(a);
	//  145  285:aload_2         
	//  146  286:aload_0         
	//  147  287:getfield        #35  <Field String a>
	//  148  290:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  149  293:pop             
			AppboyLogger.w(s4, stringbuilder4.toString());
	//  150  294:aload_1         
	//  151  295:aload_2         
	//  152  296:invokevirtual   #67  <Method String StringBuilder.toString()>
	//  153  299:invokestatic    #118 <Method int AppboyLogger.w(String, String)>
	//  154  302:pop             
			return false;
	//  155  303:iconst_0        
	//  156  304:ireturn         
		}
	}

	public void run()
	{
		try
		{
			a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #226 <Method boolean a()>
	//    2    4:pop             
		}
	//*   3    5:goto            63
		catch(Exception exception)
	//*   4    8:astore_1        
		{
			String s = AppboyActionReceiver.a();
	//    5    9:invokestatic    #52  <Method String AppboyActionReceiver.a()>
	//    6   12:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    7   13:new             #54  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #55  <Method void StringBuilder()>
	//   10   20:astore_3        
			stringbuilder.append("Caught exception while performing the AppboyActionReceiver work. Action: ");
	//   11   21:aload_3         
	//   12   22:ldc1            #228 <String "Caught exception while performing the AppboyActionReceiver work. Action: ">
	//   13   24:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
			stringbuilder.append(a);
	//   15   28:aload_3         
	//   16   29:aload_0         
	//   17   30:getfield        #35  <Field String a>
	//   18   33:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   19   36:pop             
			stringbuilder.append(" Intent: ");
	//   20   37:aload_3         
	//   21   38:ldc1            #230 <String " Intent: ">
	//   22   40:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
			stringbuilder.append(((Object) (d)));
	//   24   44:aload_3         
	//   25   45:aload_0         
	//   26   46:getfield        #27  <Field Intent d>
	//   27   49:invokevirtual   #233 <Method StringBuilder StringBuilder.append(Object)>
	//   28   52:pop             
			AppboyLogger.e(s, stringbuilder.toString(), ((Throwable) (exception)));
	//   29   53:aload_2         
	//   30   54:aload_3         
	//   31   55:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   32   58:aload_1         
	//   33   59:invokestatic    #164 <Method int AppboyLogger.e(String, String, Throwable)>
	//   34   62:pop             
		}
		c.finish();
	//   35   63:aload_0         
	//   36   64:getfield        #37  <Field android.content.BroadcastReceiver$PendingResult c>
	//   37   67:invokevirtual   #238 <Method void android.content.BroadcastReceiver$PendingResult.finish()>
	//   38   70:return          
	}

	private final String a;
	private final Context b;
	private final android.content.ngResult c;
	private final Intent d;

	AppboyActionReceiver$a(Context context, Intent intent, android.content.ngResult ngresult)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		b = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field Context b>
		d = intent;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field Intent d>
		a = intent.getAction();
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #33  <Method String Intent.getAction()>
	//   11   19:putfield        #35  <Field String a>
		c = ngresult;
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:putfield        #37  <Field android.content.BroadcastReceiver$PendingResult c>
	//   15   27:return          
	}
}
