// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.app.PendingIntent;
import android.content.*;
import android.location.*;
import android.os.Bundle;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.support.*;

// Referenced classes of package bo.app:
//			bw, cj, ci, bt, 
//			dx, cd

public class bn
	implements bw
{

	public bn(Context context, bt bt1, AppboyConfigurationProvider appboyconfigurationprovider, dx dx)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		b = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #42  <Field Context b>
		c = context.getPackageName();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #48  <Method String Context.getPackageName()>
	//    8   14:putfield        #50  <Field String c>
		e = bt1;
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:putfield        #52  <Field bt e>
		d = (LocationManager)context.getSystemService("location");
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:ldc1            #54  <String "location">
	//   15   26:invokevirtual   #58  <Method Object Context.getSystemService(String)>
	//   16   29:checkcast       #60  <Class LocationManager>
	//   17   32:putfield        #62  <Field LocationManager d>
		f = a(appboyconfigurationprovider);
	//   18   35:aload_0         
	//   19   36:aload_3         
	//   20   37:invokestatic    #65  <Method boolean a(AppboyConfigurationProvider)>
	//   21   40:putfield        #67  <Field boolean f>
		h = ((BroadcastReceiver) (new BroadcastReceiver() {

			public void onReceive(Context context1, Intent intent)
			{
				if(intent == null)
			//*   0    0:aload_2         
			//*   1    1:ifnonnull       14
				{
					AppboyLogger.e(bn.b(), "Location broadcast receiver received null intent.");
			//    2    4:invokestatic    #24  <Method String bn.b()>
			//    3    7:ldc1            #26  <String "Location broadcast receiver received null intent.">
			//    4    9:invokestatic    #32  <Method int AppboyLogger.e(String, String)>
			//    5   12:pop             
					return;
			//    6   13:return          
				}
				if(intent.getAction().endsWith(".SINGLE_APPBOY_LOCATION_UPDATE"))
			//*   7   14:aload_2         
			//*   8   15:invokevirtual   #37  <Method String Intent.getAction()>
			//*   9   18:ldc1            #39  <String ".SINGLE_APPBOY_LOCATION_UPDATE">
			//*  10   20:invokevirtual   #45  <Method boolean String.endsWith(String)>
			//*  11   23:ifeq            34
					bn.a(a, intent);
			//   12   26:aload_0         
			//   13   27:getfield        #14  <Field bn a>
			//   14   30:aload_2         
			//   15   31:invokestatic    #48  <Method void bn.a(bn, Intent)>
			//   16   34:return          
			}

			final bn a;

			
			{
				a = bn.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field bn a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
		}
));
	//   22   43:aload_0         
	//   23   44:new             #8   <Class bn$1>
	//   24   47:dup             
	//   25   48:aload_0         
	//   26   49:invokespecial   #70  <Method void bn$1(bn)>
	//   27   52:putfield        #72  <Field BroadcastReceiver h>
		context = ((Context) (new StringBuilder()));
	//   28   55:new             #74  <Class StringBuilder>
	//   29   58:dup             
	//   30   59:invokespecial   #75  <Method void StringBuilder()>
	//   31   62:astore_1        
		((StringBuilder) (context)).append(c);
	//   32   63:aload_1         
	//   33   64:aload_0         
	//   34   65:getfield        #50  <Field String c>
	//   35   68:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   36   71:pop             
		((StringBuilder) (context)).append(".SINGLE_APPBOY_LOCATION_UPDATE");
	//   37   72:aload_1         
	//   38   73:ldc1            #81  <String ".SINGLE_APPBOY_LOCATION_UPDATE">
	//   39   75:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   40   78:pop             
		context = ((Context) (new IntentFilter(((StringBuilder) (context)).toString())));
	//   41   79:new             #83  <Class IntentFilter>
	//   42   82:dup             
	//   43   83:aload_1         
	//   44   84:invokevirtual   #86  <Method String StringBuilder.toString()>
	//   45   87:invokespecial   #89  <Method void IntentFilter(String)>
	//   46   90:astore_1        
		b.registerReceiver(h, ((IntentFilter) (context)));
	//   47   91:aload_0         
	//   48   92:getfield        #42  <Field Context b>
	//   49   95:aload_0         
	//   50   96:getfield        #72  <Field BroadcastReceiver h>
	//   51   99:aload_1         
	//   52  100:invokevirtual   #93  <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   53  103:pop             
	//   54  104:return          
	}

	private void a(Intent intent)
	{
		String s = a;
	//    0    0:getstatic       #35  <Field String a>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #74  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #75  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("Single location update received from Appboy location manager: ");
	//    6   12:aload_3         
	//    7   13:ldc1            #98  <String "Single location update received from Appboy location manager: ">
	//    8   15:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(intent.getAction());
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #103 <Method String Intent.getAction()>
	//   13   24:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		AppboyLogger.i(s, stringbuilder.toString());
	//   15   28:aload_2         
	//   16   29:aload_3         
	//   17   30:invokevirtual   #86  <Method String StringBuilder.toString()>
	//   18   33:invokestatic    #107 <Method int AppboyLogger.i(String, String)>
	//   19   36:pop             
		intent = ((Intent) ((Location)intent.getExtras().get("location")));
	//   20   37:aload_1         
	//   21   38:invokevirtual   #111 <Method Bundle Intent.getExtras()>
	//   22   41:ldc1            #54  <String "location">
	//   23   43:invokevirtual   #116 <Method Object Bundle.get(String)>
	//   24   46:checkcast       #118 <Class Location>
	//   25   49:astore_1        
		if(intent != null)
	//*  26   50:aload_1         
	//*  27   51:ifnull          90
		{
			try
			{
				a(((cd) (new cj(((Location) (intent)).getLatitude(), ((Location) (intent)).getLongitude(), Double.valueOf(((Location) (intent)).getAltitude()), Double.valueOf(((Location) (intent)).getAccuracy())))));
	//   28   54:aload_0         
	//   29   55:new             #120 <Class cj>
	//   30   58:dup             
	//   31   59:aload_1         
	//   32   60:invokevirtual   #124 <Method double Location.getLatitude()>
	//   33   63:aload_1         
	//   34   64:invokevirtual   #127 <Method double Location.getLongitude()>
	//   35   67:aload_1         
	//   36   68:invokevirtual   #130 <Method double Location.getAltitude()>
	//   37   71:invokestatic    #136 <Method Double Double.valueOf(double)>
	//   38   74:aload_1         
	//   39   75:invokevirtual   #140 <Method float Location.getAccuracy()>
	//   40   78:f2d             
	//   41   79:invokestatic    #136 <Method Double Double.valueOf(double)>
	//   42   82:invokespecial   #143 <Method void cj(double, double, Double, Double)>
	//   43   85:invokevirtual   #146 <Method boolean a(cd)>
	//   44   88:pop             
				return;
	//   45   89:return          
			}
	//*  46   90:getstatic       #35  <Field String a>
	//*  47   93:ldc1            #148 <String "Failed to process location update. Received location was null.">
	//*  48   95:invokestatic    #151 <Method int AppboyLogger.w(String, String)>
	//*  49   98:pop             
	//*  50   99:return          
			// Misplaced declaration of an exception variable
			catch(Intent intent)
	//*  51  100:astore_1        
			{
				AppboyLogger.e(a, "Failed to process location update.", ((Throwable) (intent)));
	//   52  101:getstatic       #35  <Field String a>
	//   53  104:ldc1            #153 <String "Failed to process location update.">
	//   54  106:aload_1         
	//   55  107:invokestatic    #156 <Method int AppboyLogger.e(String, String, Throwable)>
	//   56  110:pop             
			}
			break MISSING_BLOCK_LABEL_111;
		}
		AppboyLogger.w(a, "Failed to process location update. Received location was null.");
		return;
	//   57  111:return          
	}

	static void a(bn bn1, Intent intent)
	{
		bn1.a(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #159 <Method void a(Intent)>
	//    3    5:return          
	}

	public static boolean a(AppboyConfigurationProvider appboyconfigurationprovider)
	{
		if(appboyconfigurationprovider.isLocationCollectionEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #165 <Method boolean AppboyConfigurationProvider.isLocationCollectionEnabled()>
	//*   2    4:ifeq            18
		{
			AppboyLogger.i(a, "Location collection enabled via sdk configuration.");
	//    3    7:getstatic       #35  <Field String a>
	//    4   10:ldc1            #167 <String "Location collection enabled via sdk configuration.">
	//    5   12:invokestatic    #107 <Method int AppboyLogger.i(String, String)>
	//    6   15:pop             
			return true;
	//    7   16:iconst_1        
	//    8   17:ireturn         
		} else
		{
			AppboyLogger.i(a, "Location collection disabled via sdk configuration.");
	//    9   18:getstatic       #35  <Field String a>
	//   10   21:ldc1            #169 <String "Location collection disabled via sdk configuration.">
	//   11   23:invokestatic    #107 <Method int AppboyLogger.i(String, String)>
	//   12   26:pop             
			return false;
	//   13   27:iconst_0        
	//   14   28:ireturn         
		}
	}

	static String b()
	{
		return a;
	//    0    0:getstatic       #35  <Field String a>
	//    1    3:areturn         
	}

	private String c()
	{
		String s = g;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field String g>
	//    2    4:astore_1        
		if(s != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
		{
			return s;
	//    5    9:aload_1         
	//    6   10:areturn         
		} else
		{
			Criteria criteria = new Criteria();
	//    7   11:new             #173 <Class Criteria>
	//    8   14:dup             
	//    9   15:invokespecial   #174 <Method void Criteria()>
	//   10   18:astore_1        
			criteria.setAccuracy(2);
	//   11   19:aload_1         
	//   12   20:iconst_2        
	//   13   21:invokevirtual   #178 <Method void Criteria.setAccuracy(int)>
			criteria.setPowerRequirement(1);
	//   14   24:aload_1         
	//   15   25:iconst_1        
	//   16   26:invokevirtual   #181 <Method void Criteria.setPowerRequirement(int)>
			g = d.getBestProvider(criteria, true);
	//   17   29:aload_0         
	//   18   30:aload_0         
	//   19   31:getfield        #62  <Field LocationManager d>
	//   20   34:aload_1         
	//   21   35:iconst_1        
	//   22   36:invokevirtual   #185 <Method String LocationManager.getBestProvider(Criteria, boolean)>
	//   23   39:putfield        #171 <Field String g>
			return g;
	//   24   42:aload_0         
	//   25   43:getfield        #171 <Field String g>
	//   26   46:areturn         
		}
	}

	public boolean a()
	{
		if(!f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field boolean f>
	//*   2    4:ifne            18
		{
			AppboyLogger.i(a, "Did not request single location update. Location collection is disabled.");
	//    3    7:getstatic       #35  <Field String a>
	//    4   10:ldc1            #189 <String "Did not request single location update. Location collection is disabled.">
	//    5   12:invokestatic    #107 <Method int AppboyLogger.i(String, String)>
	//    6   15:pop             
			return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
		}
		if(!PermissionUtils.hasPermission(b, "android.permission.ACCESS_FINE_LOCATION") && !PermissionUtils.hasPermission(b, "android.permission.ACCESS_COARSE_LOCATION"))
	//*   9   18:aload_0         
	//*  10   19:getfield        #42  <Field Context b>
	//*  11   22:ldc1            #191 <String "android.permission.ACCESS_FINE_LOCATION">
	//*  12   24:invokestatic    #197 <Method boolean PermissionUtils.hasPermission(Context, String)>
	//*  13   27:ifne            53
	//*  14   30:aload_0         
	//*  15   31:getfield        #42  <Field Context b>
	//*  16   34:ldc1            #199 <String "android.permission.ACCESS_COARSE_LOCATION">
	//*  17   36:invokestatic    #197 <Method boolean PermissionUtils.hasPermission(Context, String)>
	//*  18   39:ifne            53
		{
			AppboyLogger.i(a, "Did not request single location update. Fine grained location permissions not found.");
	//   19   42:getstatic       #35  <Field String a>
	//   20   45:ldc1            #201 <String "Did not request single location update. Fine grained location permissions not found.">
	//   21   47:invokestatic    #107 <Method int AppboyLogger.i(String, String)>
	//   22   50:pop             
			return false;
	//   23   51:iconst_0        
	//   24   52:ireturn         
		}
		String s;
		if(PermissionUtils.hasPermission(b, "android.permission.ACCESS_FINE_LOCATION"))
	//*  25   53:aload_0         
	//*  26   54:getfield        #42  <Field Context b>
	//*  27   57:ldc1            #191 <String "android.permission.ACCESS_FINE_LOCATION">
	//*  28   59:invokestatic    #197 <Method boolean PermissionUtils.hasPermission(Context, String)>
	//*  29   62:ifeq            71
			s = "passive";
	//   30   65:ldc1            #203 <String "passive">
	//   31   67:astore_1        
		else
	//*  32   68:goto            76
			s = c();
	//   33   71:aload_0         
	//   34   72:invokespecial   #205 <Method String c()>
	//   35   75:astore_1        
		if(StringUtils.isNullOrBlank(s))
	//*  36   76:aload_1         
	//*  37   77:invokestatic    #211 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  38   80:ifeq            94
		{
			AppboyLogger.d(a, "Could not request single location update. Android location provider not found.");
	//   39   83:getstatic       #35  <Field String a>
	//   40   86:ldc1            #213 <String "Could not request single location update. Android location provider not found.">
	//   41   88:invokestatic    #215 <Method int AppboyLogger.d(String, String)>
	//   42   91:pop             
			return false;
	//   43   92:iconst_0        
	//   44   93:ireturn         
		}
		try
		{
			AppboyLogger.d(a, "Requesting single location update.");
	//   45   94:getstatic       #35  <Field String a>
	//   46   97:ldc1            #217 <String "Requesting single location update.">
	//   47   99:invokestatic    #215 <Method int AppboyLogger.d(String, String)>
	//   48  102:pop             
			Object obj = ((Object) (new StringBuilder()));
	//   49  103:new             #74  <Class StringBuilder>
	//   50  106:dup             
	//   51  107:invokespecial   #75  <Method void StringBuilder()>
	//   52  110:astore_2        
			((StringBuilder) (obj)).append(c);
	//   53  111:aload_2         
	//   54  112:aload_0         
	//   55  113:getfield        #50  <Field String c>
	//   56  116:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   57  119:pop             
			((StringBuilder) (obj)).append(".SINGLE_APPBOY_LOCATION_UPDATE");
	//   58  120:aload_2         
	//   59  121:ldc1            #81  <String ".SINGLE_APPBOY_LOCATION_UPDATE">
	//   60  123:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   61  126:pop             
			obj = ((Object) (new Intent(((StringBuilder) (obj)).toString())));
	//   62  127:new             #100 <Class Intent>
	//   63  130:dup             
	//   64  131:aload_2         
	//   65  132:invokevirtual   #86  <Method String StringBuilder.toString()>
	//   66  135:invokespecial   #218 <Method void Intent(String)>
	//   67  138:astore_2        
			obj = ((Object) (PendingIntent.getBroadcast(b, 0, ((Intent) (obj)), 0x8000000)));
	//   68  139:aload_0         
	//   69  140:getfield        #42  <Field Context b>
	//   70  143:iconst_0        
	//   71  144:aload_2         
	//   72  145:ldc1            #219 <Int 0x8000000>
	//   73  147:invokestatic    #225 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   74  150:astore_2        
			d.requestSingleUpdate(s, ((PendingIntent) (obj)));
	//   75  151:aload_0         
	//   76  152:getfield        #62  <Field LocationManager d>
	//   77  155:aload_1         
	//   78  156:aload_2         
	//   79  157:invokevirtual   #229 <Method void LocationManager.requestSingleUpdate(String, PendingIntent)>
		}
	//*  80  160:iconst_1        
	//*  81  161:ireturn         
	//*  82  162:astore_1        
	//*  83  163:getstatic       #35  <Field String a>
	//*  84  166:ldc1            #231 <String "Failed to request single location update due to exception.">
	//*  85  168:aload_1         
	//*  86  169:invokestatic    #233 <Method int AppboyLogger.w(String, String, Throwable)>
	//*  87  172:pop             
	//*  88  173:iconst_0        
	//*  89  174:ireturn         
		catch(SecurityException securityexception)
	//*  90  175:astore_1        
		{
			AppboyLogger.w(a, "Failed to request single location update due to security exception from insufficient permissions.", ((Throwable) (securityexception)));
	//   91  176:getstatic       #35  <Field String a>
	//   92  179:ldc1            #235 <String "Failed to request single location update due to security exception from insufficient permissions.">
	//   93  181:aload_1         
	//   94  182:invokestatic    #233 <Method int AppboyLogger.w(String, String, Throwable)>
	//   95  185:pop             
			return false;
	//   96  186:iconst_0        
	//   97  187:ireturn         
		}
		catch(Exception exception)
		{
			AppboyLogger.w(a, "Failed to request single location update due to exception.", ((Throwable) (exception)));
			return false;
		}
		return true;
	}

	public boolean a(cd cd)
	{
		try
		{
			cd = ((cd) (ci.a(cd)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #240 <Method ci ci.a(cd)>
	//    2    4:astore_1        
			e.a(((cc) (cd)));
	//    3    5:aload_0         
	//    4    6:getfield        #52  <Field bt e>
	//    5    9:aload_1         
	//    6   10:invokeinterface #245 <Method boolean bt.a(cc)>
	//    7   15:pop             
		}
	//*   8   16:iconst_1        
	//*   9   17:ireturn         
		// Misplaced declaration of an exception variable
		catch(cd cd)
	//*  10   18:astore_1        
		{
			AppboyLogger.w(a, "Failed to log location recorded event.", ((Throwable) (cd)));
	//   11   19:getstatic       #35  <Field String a>
	//   12   22:ldc1            #247 <String "Failed to log location recorded event.">
	//   13   24:aload_1         
	//   14   25:invokestatic    #233 <Method int AppboyLogger.w(String, String, Throwable)>
	//   15   28:pop             
			return false;
	//   16   29:iconst_0        
	//   17   30:ireturn         
		}
		return true;
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/bn);
	private final Context b;
	private final String c;
	private final LocationManager d;
	private final bt e;
	private final boolean f;
	private String g;
	private BroadcastReceiver h;

	static 
	{
	//    0    0:ldc1            #2   <Class bn>
	//    1    2:invokestatic    #33  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #35  <Field String a>
	//*   3    8:return          
	}
}
