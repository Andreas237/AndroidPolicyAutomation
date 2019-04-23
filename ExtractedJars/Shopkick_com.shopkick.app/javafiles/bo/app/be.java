// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.app.PendingIntent;
import android.content.*;
import android.location.*;
import android.os.Bundle;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.services.AppboyLocationService;
import com.appboy.support.*;

// Referenced classes of package bo.app:
//			bo, cd, dh, dx, 
//			bz, cc, bl, bv

public final class be
	implements bo
{

	public be(Context context, bl bl1, AppboyConfigurationProvider appboyconfigurationprovider, dh dh1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		h = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #46  <Field boolean h>
		i = 0x36ee80L;
	//    5    9:aload_0         
	//    6   10:ldc2w           #47  <Long 0x36ee80L>
	//    7   13:putfield        #50  <Field long i>
		j = 50F;
	//    8   16:aload_0         
	//    9   17:ldc1            #51  <Float 50F>
	//   10   19:putfield        #53  <Field float j>
		b = context;
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:putfield        #55  <Field Context b>
		c = context.getPackageName();
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #61  <Method String Context.getPackageName()>
	//   17   32:putfield        #63  <Field String c>
		e = bl1;
	//   18   35:aload_0         
	//   19   36:aload_2         
	//   20   37:putfield        #65  <Field bl e>
		d = (LocationManager)context.getSystemService("location");
	//   21   40:aload_0         
	//   22   41:aload_1         
	//   23   42:ldc1            #67  <String "location">
	//   24   44:invokevirtual   #71  <Method Object Context.getSystemService(String)>
	//   25   47:checkcast       #73  <Class LocationManager>
	//   26   50:putfield        #75  <Field LocationManager d>
		f = a(appboyconfigurationprovider);
	//   27   53:aload_0         
	//   28   54:aload_3         
	//   29   55:invokestatic    #78  <Method boolean a(AppboyConfigurationProvider)>
	//   30   58:putfield        #80  <Field boolean f>
		h = b(appboyconfigurationprovider, dh1);
	//   31   61:aload_0         
	//   32   62:aload_0         
	//   33   63:aload_3         
	//   34   64:aload           4
	//   35   66:invokespecial   #83  <Method boolean b(AppboyConfigurationProvider, dh)>
	//   36   69:putfield        #46  <Field boolean h>
	//   37   72:aload_0         
	//   38   73:aload_0         
	//   39   74:invokespecial   #86  <Method boolean f()>
	//   40   77:putfield        #88  <Field boolean g>
		a(appboyconfigurationprovider, dh1);
	//   41   80:aload_0         
	//   42   81:aload_3         
	//   43   82:aload           4
	//   44   84:invokespecial   #91  <Method void a(AppboyConfigurationProvider, dh)>
		context = ((Context) (new BroadcastReceiver() {

			public void onReceive(Context context1, Intent intent)
			{
				if(intent == null)
			//*   0    0:aload_2         
			//*   1    1:ifnonnull       14
				{
					AppboyLogger.e(be.d(), "Location broadcast receiver received null intent.");
			//    2    4:invokestatic    #24  <Method String be.d()>
			//    3    7:ldc1            #26  <String "Location broadcast receiver received null intent.">
			//    4    9:invokestatic    #32  <Method int AppboyLogger.e(String, String)>
			//    5   12:pop             
					return;
			//    6   13:return          
				}
				context1 = ((Context) (intent.getAction()));
			//    7   14:aload_2         
			//    8   15:invokevirtual   #37  <Method String Intent.getAction()>
			//    9   18:astore_1        
				if(((String) (context1)).endsWith(".SINGLE_APPBOY_LOCATION_UPDATE"))
			//*  10   19:aload_1         
			//*  11   20:ldc1            #39  <String ".SINGLE_APPBOY_LOCATION_UPDATE">
			//*  12   22:invokevirtual   #45  <Method boolean String.endsWith(String)>
			//*  13   25:ifeq            37
				{
					be.a(a, intent);
			//   14   28:aload_0         
			//   15   29:getfield        #14  <Field be a>
			//   16   32:aload_2         
			//   17   33:invokestatic    #48  <Method void be.a(be, Intent)>
					return;
			//   18   36:return          
				}
				if(((String) (context1)).endsWith(".REQUEST_INIT_APPBOY_LOCATION_SERVICE"))
			//*  19   37:aload_1         
			//*  20   38:ldc1            #50  <String ".REQUEST_INIT_APPBOY_LOCATION_SERVICE">
			//*  21   40:invokevirtual   #45  <Method boolean String.endsWith(String)>
			//*  22   43:ifeq            54
					a.c();
			//   23   46:aload_0         
			//   24   47:getfield        #14  <Field be a>
			//   25   50:invokevirtual   #54  <Method boolean be.c()>
			//   26   53:pop             
			//   27   54:return          
			}

			final be a;

			
			{
				a = be.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field be a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
		}
));
	//   45   87:new             #8   <Class be$1>
	//   46   90:dup             
	//   47   91:aload_0         
	//   48   92:invokespecial   #94  <Method void be$1(be)>
	//   49   95:astore_1        
		bl1 = ((bl) (new StringBuilder()));
	//   50   96:new             #96  <Class StringBuilder>
	//   51   99:dup             
	//   52  100:invokespecial   #97  <Method void StringBuilder()>
	//   53  103:astore_2        
		((StringBuilder) (bl1)).append(c);
	//   54  104:aload_2         
	//   55  105:aload_0         
	//   56  106:getfield        #63  <Field String c>
	//   57  109:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   58  112:pop             
		((StringBuilder) (bl1)).append(".SINGLE_APPBOY_LOCATION_UPDATE");
	//   59  113:aload_2         
	//   60  114:ldc1            #103 <String ".SINGLE_APPBOY_LOCATION_UPDATE">
	//   61  116:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   62  119:pop             
		bl1 = ((bl) (new IntentFilter(((StringBuilder) (bl1)).toString())));
	//   63  120:new             #105 <Class IntentFilter>
	//   64  123:dup             
	//   65  124:aload_2         
	//   66  125:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   67  128:invokespecial   #111 <Method void IntentFilter(String)>
	//   68  131:astore_2        
		appboyconfigurationprovider = ((AppboyConfigurationProvider) (new StringBuilder()));
	//   69  132:new             #96  <Class StringBuilder>
	//   70  135:dup             
	//   71  136:invokespecial   #97  <Method void StringBuilder()>
	//   72  139:astore_3        
		((StringBuilder) (appboyconfigurationprovider)).append(c);
	//   73  140:aload_3         
	//   74  141:aload_0         
	//   75  142:getfield        #63  <Field String c>
	//   76  145:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   77  148:pop             
		((StringBuilder) (appboyconfigurationprovider)).append(".REQUEST_INIT_APPBOY_LOCATION_SERVICE");
	//   78  149:aload_3         
	//   79  150:ldc1            #113 <String ".REQUEST_INIT_APPBOY_LOCATION_SERVICE">
	//   80  152:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   81  155:pop             
		((IntentFilter) (bl1)).addAction(((StringBuilder) (appboyconfigurationprovider)).toString());
	//   82  156:aload_2         
	//   83  157:aload_3         
	//   84  158:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   85  161:invokevirtual   #116 <Method void IntentFilter.addAction(String)>
		b.registerReceiver(((BroadcastReceiver) (context)), ((IntentFilter) (bl1)));
	//   86  164:aload_0         
	//   87  165:getfield        #55  <Field Context b>
	//   88  168:aload_1         
	//   89  169:aload_2         
	//   90  170:invokevirtual   #120 <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   91  173:pop             
		if(!PermissionUtils.hasPermission(b, "android.permission.ACCESS_FINE_LOCATION"))
	//*  92  174:aload_0         
	//*  93  175:getfield        #55  <Field Context b>
	//*  94  178:ldc1            #122 <String "android.permission.ACCESS_FINE_LOCATION">
	//*  95  180:invokestatic    #128 <Method boolean PermissionUtils.hasPermission(Context, String)>
	//*  96  183:ifne            190
			e();
	//   97  186:aload_0         
	//   98  187:invokespecial   #130 <Method void e()>
	//   99  190:return          
	}

	private void a(Intent intent)
	{
		String s = a;
	//    0    0:getstatic       #39  <Field String a>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #96  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #97  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("Single location update received from ");
	//    6   12:aload_3         
	//    7   13:ldc1            #135 <String "Single location update received from ">
	//    8   15:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(intent.getStringExtra("origin"));
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:ldc1            #137 <String "origin">
	//   13   23:invokevirtual   #143 <Method String Intent.getStringExtra(String)>
	//   14   26:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		stringbuilder.append(": ");
	//   16   30:aload_3         
	//   17   31:ldc1            #145 <String ": ">
	//   18   33:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   19   36:pop             
		stringbuilder.append(intent.getAction());
	//   20   37:aload_3         
	//   21   38:aload_1         
	//   22   39:invokevirtual   #148 <Method String Intent.getAction()>
	//   23   42:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
		AppboyLogger.i(s, stringbuilder.toString());
	//   25   46:aload_2         
	//   26   47:aload_3         
	//   27   48:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   28   51:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//   29   54:pop             
		intent = ((Intent) ((Location)intent.getExtras().get("location")));
	//   30   55:aload_1         
	//   31   56:invokevirtual   #155 <Method Bundle Intent.getExtras()>
	//   32   59:ldc1            #67  <String "location">
	//   33   61:invokevirtual   #160 <Method Object Bundle.get(String)>
	//   34   64:checkcast       #162 <Class Location>
	//   35   67:astore_1        
		if(intent != null)
	//*  36   68:aload_1         
	//*  37   69:ifnull          108
		{
			try
			{
				a(((bv) (new cd(((Location) (intent)).getLatitude(), ((Location) (intent)).getLongitude(), Double.valueOf(((Location) (intent)).getAltitude()), Double.valueOf(((Location) (intent)).getAccuracy())))));
	//   38   72:aload_0         
	//   39   73:new             #164 <Class cd>
	//   40   76:dup             
	//   41   77:aload_1         
	//   42   78:invokevirtual   #168 <Method double Location.getLatitude()>
	//   43   81:aload_1         
	//   44   82:invokevirtual   #171 <Method double Location.getLongitude()>
	//   45   85:aload_1         
	//   46   86:invokevirtual   #174 <Method double Location.getAltitude()>
	//   47   89:invokestatic    #180 <Method Double Double.valueOf(double)>
	//   48   92:aload_1         
	//   49   93:invokevirtual   #184 <Method float Location.getAccuracy()>
	//   50   96:f2d             
	//   51   97:invokestatic    #180 <Method Double Double.valueOf(double)>
	//   52  100:invokespecial   #187 <Method void cd(double, double, Double, Double)>
	//   53  103:invokevirtual   #190 <Method boolean a(bv)>
	//   54  106:pop             
				return;
	//   55  107:return          
			}
	//*  56  108:getstatic       #39  <Field String a>
	//*  57  111:ldc1            #192 <String "Failed to process location update. Received location was null.">
	//*  58  113:invokestatic    #195 <Method int AppboyLogger.w(String, String)>
	//*  59  116:pop             
	//*  60  117:return          
			// Misplaced declaration of an exception variable
			catch(Intent intent)
	//*  61  118:astore_1        
			{
				AppboyLogger.e(a, "Failed to process location update.", ((Throwable) (intent)));
	//   62  119:getstatic       #39  <Field String a>
	//   63  122:ldc1            #197 <String "Failed to process location update.">
	//   64  124:aload_1         
	//   65  125:invokestatic    #200 <Method int AppboyLogger.e(String, String, Throwable)>
	//   66  128:pop             
			}
			break MISSING_BLOCK_LABEL_129;
		}
		AppboyLogger.w(a, "Failed to process location update. Received location was null.");
		return;
	//   67  129:return          
	}

	static void a(be be1, Intent intent)
	{
		be1.a(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #203 <Method void a(Intent)>
	//    3    5:return          
	}

	private void a(AppboyConfigurationProvider appboyconfigurationprovider, dh dh1)
	{
		if(dh1.h() >= 0L)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #208 <Method long dh.h()>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:iflt            73
		{
			i = dh1.h();
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #208 <Method long dh.h()>
	//    8   14:putfield        #50  <Field long i>
			String s = a;
	//    9   17:getstatic       #39  <Field String a>
	//   10   20:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   11   21:new             #96  <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #97  <Method void StringBuilder()>
	//   14   28:astore          4
			stringbuilder.append("Time interval override set via server configuration for background location collection: ");
	//   15   30:aload           4
	//   16   32:ldc1            #210 <String "Time interval override set via server configuration for background location collection: ">
	//   17   34:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
			stringbuilder.append(i / 1000L);
	//   19   38:aload           4
	//   20   40:aload_0         
	//   21   41:getfield        #50  <Field long i>
	//   22   44:ldc2w           #211 <Long 1000L>
	//   23   47:ldiv            
	//   24   48:invokevirtual   #215 <Method StringBuilder StringBuilder.append(long)>
	//   25   51:pop             
			stringbuilder.append("s.");
	//   26   52:aload           4
	//   27   54:ldc1            #217 <String "s.">
	//   28   56:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   29   59:pop             
			AppboyLogger.i(s, stringbuilder.toString());
	//   30   60:aload_3         
	//   31   61:aload           4
	//   32   63:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   33   66:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//   34   69:pop             
		} else
	//*  35   70:goto            208
		if(appboyconfigurationprovider.getLocationUpdateTimeIntervalInMillis() > 0x493e0L)
	//*  36   73:aload_1         
	//*  37   74:invokevirtual   #222 <Method long AppboyConfigurationProvider.getLocationUpdateTimeIntervalInMillis()>
	//*  38   77:ldc2w           #223 <Long 0x493e0L>
	//*  39   80:lcmp            
	//*  40   81:ifle            148
		{
			i = appboyconfigurationprovider.getLocationUpdateTimeIntervalInMillis();
	//   41   84:aload_0         
	//   42   85:aload_1         
	//   43   86:invokevirtual   #222 <Method long AppboyConfigurationProvider.getLocationUpdateTimeIntervalInMillis()>
	//   44   89:putfield        #50  <Field long i>
			String s1 = a;
	//   45   92:getstatic       #39  <Field String a>
	//   46   95:astore_3        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   47   96:new             #96  <Class StringBuilder>
	//   48   99:dup             
	//   49  100:invokespecial   #97  <Method void StringBuilder()>
	//   50  103:astore          4
			stringbuilder1.append("Time interval override set via local configuration for background location collection: ");
	//   51  105:aload           4
	//   52  107:ldc1            #226 <String "Time interval override set via local configuration for background location collection: ">
	//   53  109:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   54  112:pop             
			stringbuilder1.append(i / 1000L);
	//   55  113:aload           4
	//   56  115:aload_0         
	//   57  116:getfield        #50  <Field long i>
	//   58  119:ldc2w           #211 <Long 1000L>
	//   59  122:ldiv            
	//   60  123:invokevirtual   #215 <Method StringBuilder StringBuilder.append(long)>
	//   61  126:pop             
			stringbuilder1.append("s.");
	//   62  127:aload           4
	//   63  129:ldc1            #217 <String "s.">
	//   64  131:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   65  134:pop             
			AppboyLogger.i(s1, stringbuilder1.toString());
	//   66  135:aload_3         
	//   67  136:aload           4
	//   68  138:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   69  141:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//   70  144:pop             
		} else
	//*  71  145:goto            208
		{
			i = 0x36ee80L;
	//   72  148:aload_0         
	//   73  149:ldc2w           #47  <Long 0x36ee80L>
	//   74  152:putfield        #50  <Field long i>
			String s2 = a;
	//   75  155:getstatic       #39  <Field String a>
	//   76  158:astore_3        
			StringBuilder stringbuilder2 = new StringBuilder();
	//   77  159:new             #96  <Class StringBuilder>
	//   78  162:dup             
	//   79  163:invokespecial   #97  <Method void StringBuilder()>
	//   80  166:astore          4
			stringbuilder2.append("Time interval override set to default for background location collection: ");
	//   81  168:aload           4
	//   82  170:ldc1            #228 <String "Time interval override set to default for background location collection: ">
	//   83  172:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   84  175:pop             
			stringbuilder2.append(i / 1000L);
	//   85  176:aload           4
	//   86  178:aload_0         
	//   87  179:getfield        #50  <Field long i>
	//   88  182:ldc2w           #211 <Long 1000L>
	//   89  185:ldiv            
	//   90  186:invokevirtual   #215 <Method StringBuilder StringBuilder.append(long)>
	//   91  189:pop             
			stringbuilder2.append("s.");
	//   92  190:aload           4
	//   93  192:ldc1            #217 <String "s.">
	//   94  194:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   95  197:pop             
			AppboyLogger.i(s2, stringbuilder2.toString());
	//   96  198:aload_3         
	//   97  199:aload           4
	//   98  201:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   99  204:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//  100  207:pop             
		}
		if(dh1.j() >= 0.0F)
	//* 101  208:aload_2         
	//* 102  209:invokevirtual   #230 <Method float dh.j()>
	//* 103  212:fconst_0        
	//* 104  213:fcmpl           
	//* 105  214:iflt            270
		{
			j = dh1.j();
	//  106  217:aload_0         
	//  107  218:aload_2         
	//  108  219:invokevirtual   #230 <Method float dh.j()>
	//  109  222:putfield        #53  <Field float j>
			appboyconfigurationprovider = ((AppboyConfigurationProvider) (a));
	//  110  225:getstatic       #39  <Field String a>
	//  111  228:astore_1        
			dh1 = ((dh) (new StringBuilder()));
	//  112  229:new             #96  <Class StringBuilder>
	//  113  232:dup             
	//  114  233:invokespecial   #97  <Method void StringBuilder()>
	//  115  236:astore_2        
			((StringBuilder) (dh1)).append("Distance threshold override set via server configuration for background location collection: ");
	//  116  237:aload_2         
	//  117  238:ldc1            #232 <String "Distance threshold override set via server configuration for background location collection: ">
	//  118  240:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//  119  243:pop             
			((StringBuilder) (dh1)).append(j);
	//  120  244:aload_2         
	//  121  245:aload_0         
	//  122  246:getfield        #53  <Field float j>
	//  123  249:invokevirtual   #235 <Method StringBuilder StringBuilder.append(float)>
	//  124  252:pop             
			((StringBuilder) (dh1)).append("m.");
	//  125  253:aload_2         
	//  126  254:ldc1            #237 <String "m.">
	//  127  256:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//  128  259:pop             
			AppboyLogger.i(((String) (appboyconfigurationprovider)), ((StringBuilder) (dh1)).toString());
	//  129  260:aload_1         
	//  130  261:aload_2         
	//  131  262:invokevirtual   #108 <Method String StringBuilder.toString()>
	//  132  265:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//  133  268:pop             
			return;
	//  134  269:return          
		}
		if(appboyconfigurationprovider.getLocationUpdateDistanceInMeters() > 50F)
	//* 135  270:aload_1         
	//* 136  271:invokevirtual   #240 <Method float AppboyConfigurationProvider.getLocationUpdateDistanceInMeters()>
	//* 137  274:ldc1            #51  <Float 50F>
	//* 138  276:fcmpl           
	//* 139  277:ifle            333
		{
			j = appboyconfigurationprovider.getLocationUpdateDistanceInMeters();
	//  140  280:aload_0         
	//  141  281:aload_1         
	//  142  282:invokevirtual   #240 <Method float AppboyConfigurationProvider.getLocationUpdateDistanceInMeters()>
	//  143  285:putfield        #53  <Field float j>
			appboyconfigurationprovider = ((AppboyConfigurationProvider) (a));
	//  144  288:getstatic       #39  <Field String a>
	//  145  291:astore_1        
			dh1 = ((dh) (new StringBuilder()));
	//  146  292:new             #96  <Class StringBuilder>
	//  147  295:dup             
	//  148  296:invokespecial   #97  <Method void StringBuilder()>
	//  149  299:astore_2        
			((StringBuilder) (dh1)).append("Distance threshold override set via local configuration for background location collection: ");
	//  150  300:aload_2         
	//  151  301:ldc1            #242 <String "Distance threshold override set via local configuration for background location collection: ">
	//  152  303:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//  153  306:pop             
			((StringBuilder) (dh1)).append(j);
	//  154  307:aload_2         
	//  155  308:aload_0         
	//  156  309:getfield        #53  <Field float j>
	//  157  312:invokevirtual   #235 <Method StringBuilder StringBuilder.append(float)>
	//  158  315:pop             
			((StringBuilder) (dh1)).append("m.");
	//  159  316:aload_2         
	//  160  317:ldc1            #237 <String "m.">
	//  161  319:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//  162  322:pop             
			AppboyLogger.i(((String) (appboyconfigurationprovider)), ((StringBuilder) (dh1)).toString());
	//  163  323:aload_1         
	//  164  324:aload_2         
	//  165  325:invokevirtual   #108 <Method String StringBuilder.toString()>
	//  166  328:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//  167  331:pop             
			return;
	//  168  332:return          
		} else
		{
			j = 50F;
	//  169  333:aload_0         
	//  170  334:ldc1            #51  <Float 50F>
	//  171  336:putfield        #53  <Field float j>
			appboyconfigurationprovider = ((AppboyConfigurationProvider) (a));
	//  172  339:getstatic       #39  <Field String a>
	//  173  342:astore_1        
			dh1 = ((dh) (new StringBuilder()));
	//  174  343:new             #96  <Class StringBuilder>
	//  175  346:dup             
	//  176  347:invokespecial   #97  <Method void StringBuilder()>
	//  177  350:astore_2        
			((StringBuilder) (dh1)).append("Distance threshold override set to default for background location collection: ");
	//  178  351:aload_2         
	//  179  352:ldc1            #244 <String "Distance threshold override set to default for background location collection: ">
	//  180  354:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//  181  357:pop             
			((StringBuilder) (dh1)).append(j);
	//  182  358:aload_2         
	//  183  359:aload_0         
	//  184  360:getfield        #53  <Field float j>
	//  185  363:invokevirtual   #235 <Method StringBuilder StringBuilder.append(float)>
	//  186  366:pop             
			((StringBuilder) (dh1)).append("m.");
	//  187  367:aload_2         
	//  188  368:ldc1            #237 <String "m.">
	//  189  370:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//  190  373:pop             
			AppboyLogger.i(((String) (appboyconfigurationprovider)), ((StringBuilder) (dh1)).toString());
	//  191  374:aload_1         
	//  192  375:aload_2         
	//  193  376:invokevirtual   #108 <Method String StringBuilder.toString()>
	//  194  379:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//  195  382:pop             
			return;
	//  196  383:return          
		}
	}

	public static boolean a(AppboyConfigurationProvider appboyconfigurationprovider)
	{
		if(appboyconfigurationprovider.isLocationCollectionEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #247 <Method boolean AppboyConfigurationProvider.isLocationCollectionEnabled()>
	//*   2    4:ifeq            18
		{
			AppboyLogger.i(a, "Location collection enabled via sdk configuration.");
	//    3    7:getstatic       #39  <Field String a>
	//    4   10:ldc1            #249 <String "Location collection enabled via sdk configuration.">
	//    5   12:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//    6   15:pop             
			return true;
	//    7   16:iconst_1        
	//    8   17:ireturn         
		} else
		{
			AppboyLogger.i(a, "Location collection disabled via sdk configuration.");
	//    9   18:getstatic       #39  <Field String a>
	//   10   21:ldc1            #251 <String "Location collection disabled via sdk configuration.">
	//   11   23:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//   12   26:pop             
			return false;
	//   13   27:iconst_0        
	//   14   28:ireturn         
		}
	}

	private boolean a(String s)
	{
		if(!g)
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field boolean g>
	//*   2    4:ifne            43
		{
			String s1 = a;
	//    3    7:getstatic       #39  <Field String a>
	//    4   10:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #96  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #97  <Method void StringBuilder()>
	//    8   18:astore_3        
			stringbuilder.append("Appboy Location service is not available. Did not send intent to service: ");
	//    9   19:aload_3         
	//   10   20:ldc1            #254 <String "Appboy Location service is not available. Did not send intent to service: ">
	//   11   22:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			stringbuilder.append(s);
	//   13   26:aload_3         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			AppboyLogger.i(s1, stringbuilder.toString());
	//   17   32:aload_2         
	//   18   33:aload_3         
	//   19   34:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   20   37:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//   21   40:pop             
			return false;
	//   22   41:iconst_0        
	//   23   42:ireturn         
		}
		Intent intent = (new Intent(s)).setClass(b, com/appboy/services/AppboyLocationService);
	//   24   43:new             #139 <Class Intent>
	//   25   46:dup             
	//   26   47:aload_1         
	//   27   48:invokespecial   #255 <Method void Intent(String)>
	//   28   51:aload_0         
	//   29   52:getfield        #55  <Field Context b>
	//   30   55:ldc2            #257 <Class AppboyLocationService>
	//   31   58:invokevirtual   #261 <Method Intent Intent.setClass(Context, Class)>
	//   32   61:astore_2        
		StringBuilder stringbuilder1 = new StringBuilder();
	//   33   62:new             #96  <Class StringBuilder>
	//   34   65:dup             
	//   35   66:invokespecial   #97  <Method void StringBuilder()>
	//   36   69:astore_3        
		stringbuilder1.append(c);
	//   37   70:aload_3         
	//   38   71:aload_0         
	//   39   72:getfield        #63  <Field String c>
	//   40   75:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   41   78:pop             
		stringbuilder1.append(".REQUEST_APPBOY_LOCATION_UPDATES");
	//   42   79:aload_3         
	//   43   80:ldc2            #263 <String ".REQUEST_APPBOY_LOCATION_UPDATES">
	//   44   83:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   45   86:pop             
		if(s.equals(((Object) (stringbuilder1.toString()))))
	//*  46   87:aload_1         
	//*  47   88:aload_3         
	//*  48   89:invokevirtual   #108 <Method String StringBuilder.toString()>
	//*  49   92:invokevirtual   #269 <Method boolean String.equals(Object)>
	//*  50   95:ifeq            122
		{
			intent.putExtra("distance", j);
	//   51   98:aload_2         
	//   52   99:ldc2            #271 <String "distance">
	//   53  102:aload_0         
	//   54  103:getfield        #53  <Field float j>
	//   55  106:invokevirtual   #275 <Method Intent Intent.putExtra(String, float)>
	//   56  109:pop             
			intent.putExtra("time", i);
	//   57  110:aload_2         
	//   58  111:ldc2            #277 <String "time">
	//   59  114:aload_0         
	//   60  115:getfield        #50  <Field long i>
	//   61  118:invokevirtual   #280 <Method Intent Intent.putExtra(String, long)>
	//   62  121:pop             
		}
		b.startService(intent);
	//   63  122:aload_0         
	//   64  123:getfield        #55  <Field Context b>
	//   65  126:aload_2         
	//   66  127:invokevirtual   #284 <Method android.content.ComponentName Context.startService(Intent)>
	//   67  130:pop             
		return true;
	//   68  131:iconst_1        
	//   69  132:ireturn         
	}

	private boolean b(AppboyConfigurationProvider appboyconfigurationprovider, dh dh1)
	{
		if(dh1.c())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #286 <Method boolean dh.c()>
	//*   2    4:ifeq            38
			if(dh1.d())
	//*   3    7:aload_2         
	//*   4    8:invokevirtual   #288 <Method boolean dh.d()>
	//*   5   11:ifeq            26
			{
				AppboyLogger.i(a, "Background location collection enabled via server configuration.");
	//    6   14:getstatic       #39  <Field String a>
	//    7   17:ldc2            #290 <String "Background location collection enabled via server configuration.">
	//    8   20:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//    9   23:pop             
				return true;
	//   10   24:iconst_1        
	//   11   25:ireturn         
			} else
			{
				AppboyLogger.i(a, "Background location collection disabled via server configuration.");
	//   12   26:getstatic       #39  <Field String a>
	//   13   29:ldc2            #292 <String "Background location collection disabled via server configuration.">
	//   14   32:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//   15   35:pop             
				return false;
	//   16   36:iconst_0        
	//   17   37:ireturn         
			}
		if(appboyconfigurationprovider.isBackgroundLocationCollectionEnabled())
	//*  18   38:aload_1         
	//*  19   39:invokevirtual   #295 <Method boolean AppboyConfigurationProvider.isBackgroundLocationCollectionEnabled()>
	//*  20   42:ifeq            57
		{
			AppboyLogger.i(a, "Background location collection enabled via sdk configuration.");
	//   21   45:getstatic       #39  <Field String a>
	//   22   48:ldc2            #297 <String "Background location collection enabled via sdk configuration.">
	//   23   51:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//   24   54:pop             
			return true;
	//   25   55:iconst_1        
	//   26   56:ireturn         
		} else
		{
			AppboyLogger.i(a, "Background location collection disabled via sdk configuration.");
	//   27   57:getstatic       #39  <Field String a>
	//   28   60:ldc2            #299 <String "Background location collection disabled via sdk configuration.">
	//   29   63:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//   30   66:pop             
			return false;
	//   31   67:iconst_0        
	//   32   68:ireturn         
		}
	}

	static String d()
	{
		return a;
	//    0    0:getstatic       #39  <Field String a>
	//    1    3:areturn         
	}

	private void e()
	{
		if(!g)
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field boolean g>
	//*   2    4:ifne            18
		{
			AppboyLogger.i(a, "Did not attempt to stop service. Braze Location service is not available.");
	//    3    7:getstatic       #39  <Field String a>
	//    4   10:ldc2            #301 <String "Did not attempt to stop service. Braze Location service is not available.">
	//    5   13:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//    6   16:pop             
			return;
	//    7   17:return          
		} else
		{
			AppboyLogger.i(a, "Stopping Braze location service if currently running.");
	//    8   18:getstatic       #39  <Field String a>
	//    9   21:ldc2            #303 <String "Stopping Braze location service if currently running.">
	//   10   24:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//   11   27:pop             
			Intent intent = (new Intent()).setClass(b, com/appboy/services/AppboyLocationService);
	//   12   28:new             #139 <Class Intent>
	//   13   31:dup             
	//   14   32:invokespecial   #304 <Method void Intent()>
	//   15   35:aload_0         
	//   16   36:getfield        #55  <Field Context b>
	//   17   39:ldc2            #257 <Class AppboyLocationService>
	//   18   42:invokevirtual   #261 <Method Intent Intent.setClass(Context, Class)>
	//   19   45:astore_1        
			b.stopService(intent);
	//   20   46:aload_0         
	//   21   47:getfield        #55  <Field Context b>
	//   22   50:aload_1         
	//   23   51:invokevirtual   #308 <Method boolean Context.stopService(Intent)>
	//   24   54:pop             
			return;
	//   25   55:return          
		}
	}

	private boolean f()
	{
		if(dx.a(b, com/appboy/services/AppboyLocationService))
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field Context b>
	//*   2    4:ldc2            #257 <Class AppboyLocationService>
	//*   3    7:invokestatic    #313 <Method boolean dx.a(Context, Class)>
	//*   4   10:ifeq            15
		{
			return true;
	//    5   13:iconst_1        
	//    6   14:ireturn         
		} else
		{
			AppboyLogger.i(a, "Appboy location service is not available. Declare <service android:name=\"com.appboy.services.AppboyLocationService\"/> in your AndroidManifest.xml to enable Braze location service.");
	//    7   15:getstatic       #39  <Field String a>
	//    8   18:ldc2            #315 <String "Appboy location service is not available. Declare <service android:name=\"com.appboy.services.AppboyLocationService\"/> in your AndroidManifest.xml to enable Braze location service.">
	//    9   21:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//   10   24:pop             
			return false;
	//   11   25:iconst_0        
	//   12   26:ireturn         
		}
	}

	private String g()
	{
		String s = k;
	//    0    0:aload_0         
	//    1    1:getfield        #317 <Field String k>
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
	//    7   11:new             #319 <Class Criteria>
	//    8   14:dup             
	//    9   15:invokespecial   #320 <Method void Criteria()>
	//   10   18:astore_1        
			criteria.setAccuracy(2);
	//   11   19:aload_1         
	//   12   20:iconst_2        
	//   13   21:invokevirtual   #324 <Method void Criteria.setAccuracy(int)>
			criteria.setPowerRequirement(1);
	//   14   24:aload_1         
	//   15   25:iconst_1        
	//   16   26:invokevirtual   #327 <Method void Criteria.setPowerRequirement(int)>
			k = d.getBestProvider(criteria, true);
	//   17   29:aload_0         
	//   18   30:aload_0         
	//   19   31:getfield        #75  <Field LocationManager d>
	//   20   34:aload_1         
	//   21   35:iconst_1        
	//   22   36:invokevirtual   #331 <Method String LocationManager.getBestProvider(Criteria, boolean)>
	//   23   39:putfield        #317 <Field String k>
			return k;
	//   24   42:aload_0         
	//   25   43:getfield        #317 <Field String k>
	//   26   46:areturn         
		}
	}

	public void a()
	{
		e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #130 <Method void e()>
	//    2    4:return          
	}

	public void a(bz bz1)
	{
		if(bz1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			AppboyLogger.w(a, "Could not reset background location collection interval. Server config was null.");
	//    2    4:getstatic       #39  <Field String a>
	//    3    7:ldc2            #334 <String "Could not reset background location collection interval. Server config was null.">
	//    4   10:invokestatic    #195 <Method int AppboyLogger.w(String, String)>
	//    5   13:pop             
			return;
	//    6   14:return          
		}
		if(bz1.h() >= 0L)
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #337 <Method long bz.h()>
	//*   9   19:lconst_0        
	//*  10   20:lcmp            
	//*  11   21:iflt            81
		{
			i = bz1.h();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #337 <Method long bz.h()>
	//   15   29:putfield        #50  <Field long i>
			String s = a;
	//   16   32:getstatic       #39  <Field String a>
	//   17   35:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   18   36:new             #96  <Class StringBuilder>
	//   19   39:dup             
	//   20   40:invokespecial   #97  <Method void StringBuilder()>
	//   21   43:astore_3        
			stringbuilder.append("Time interval override reset via server configuration for background location collection: ");
	//   22   44:aload_3         
	//   23   45:ldc2            #339 <String "Time interval override reset via server configuration for background location collection: ">
	//   24   48:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
			stringbuilder.append(i / 1000L);
	//   26   52:aload_3         
	//   27   53:aload_0         
	//   28   54:getfield        #50  <Field long i>
	//   29   57:ldc2w           #211 <Long 1000L>
	//   30   60:ldiv            
	//   31   61:invokevirtual   #215 <Method StringBuilder StringBuilder.append(long)>
	//   32   64:pop             
			stringbuilder.append("s.");
	//   33   65:aload_3         
	//   34   66:ldc1            #217 <String "s.">
	//   35   68:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   36   71:pop             
			AppboyLogger.i(s, stringbuilder.toString());
	//   37   72:aload_2         
	//   38   73:aload_3         
	//   39   74:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   40   77:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//   41   80:pop             
		}
		if(bz1.i() >= 0.0F)
	//*  42   81:aload_1         
	//*  43   82:invokevirtual   #341 <Method float bz.i()>
	//*  44   85:fconst_0        
	//*  45   86:fcmpl           
	//*  46   87:iflt            143
		{
			j = bz1.i();
	//   47   90:aload_0         
	//   48   91:aload_1         
	//   49   92:invokevirtual   #341 <Method float bz.i()>
	//   50   95:putfield        #53  <Field float j>
			String s1 = a;
	//   51   98:getstatic       #39  <Field String a>
	//   52  101:astore_2        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   53  102:new             #96  <Class StringBuilder>
	//   54  105:dup             
	//   55  106:invokespecial   #97  <Method void StringBuilder()>
	//   56  109:astore_3        
			stringbuilder1.append("Distance threshold override reset via server configuration for background location collection: ");
	//   57  110:aload_3         
	//   58  111:ldc2            #343 <String "Distance threshold override reset via server configuration for background location collection: ">
	//   59  114:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   60  117:pop             
			stringbuilder1.append(j);
	//   61  118:aload_3         
	//   62  119:aload_0         
	//   63  120:getfield        #53  <Field float j>
	//   64  123:invokevirtual   #235 <Method StringBuilder StringBuilder.append(float)>
	//   65  126:pop             
			stringbuilder1.append("m.");
	//   66  127:aload_3         
	//   67  128:ldc1            #237 <String "m.">
	//   68  130:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   69  133:pop             
			AppboyLogger.i(s1, stringbuilder1.toString());
	//   70  134:aload_2         
	//   71  135:aload_3         
	//   72  136:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   73  139:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//   74  142:pop             
		}
		if(bz1.g())
	//*  75  143:aload_1         
	//*  76  144:invokevirtual   #345 <Method boolean bz.g()>
	//*  77  147:ifeq            197
		{
			if(bz1.f())
	//*  78  150:aload_1         
	//*  79  151:invokevirtual   #346 <Method boolean bz.f()>
	//*  80  154:ifeq            178
			{
				h = true;
	//   81  157:aload_0         
	//   82  158:iconst_1        
	//   83  159:putfield        #46  <Field boolean h>
				AppboyLogger.i(a, "Background location collection enabled via server configuration. Requesting location updates.");
	//   84  162:getstatic       #39  <Field String a>
	//   85  165:ldc2            #348 <String "Background location collection enabled via server configuration. Requesting location updates.">
	//   86  168:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//   87  171:pop             
				c();
	//   88  172:aload_0         
	//   89  173:invokevirtual   #349 <Method boolean c()>
	//   90  176:pop             
				return;
	//   91  177:return          
			}
			h = false;
	//   92  178:aload_0         
	//   93  179:iconst_0        
	//   94  180:putfield        #46  <Field boolean h>
			AppboyLogger.i(a, "Background location collection disabled via server configuration. Stopping any active Braze location service.");
	//   95  183:getstatic       #39  <Field String a>
	//   96  186:ldc2            #351 <String "Background location collection disabled via server configuration. Stopping any active Braze location service.">
	//   97  189:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//   98  192:pop             
			e();
	//   99  193:aload_0         
	//  100  194:invokespecial   #130 <Method void e()>
		}
	//  101  197:return          
	}

	public boolean a(bv bv)
	{
		try
		{
			bv = ((bv) (cc.a(bv)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #356 <Method cc cc.a(bv)>
	//    2    4:astore_1        
			e.a(((bu) (bv)));
	//    3    5:aload_0         
	//    4    6:getfield        #65  <Field bl e>
	//    5    9:aload_1         
	//    6   10:invokeinterface #361 <Method boolean bl.a(bu)>
	//    7   15:pop             
		}
	//*   8   16:iconst_1        
	//*   9   17:ireturn         
		// Misplaced declaration of an exception variable
		catch(bv bv)
	//*  10   18:astore_1        
		{
			AppboyLogger.w(a, "Failed to log location recorded event.", ((Throwable) (bv)));
	//   11   19:getstatic       #39  <Field String a>
	//   12   22:ldc2            #363 <String "Failed to log location recorded event.">
	//   13   25:aload_1         
	//   14   26:invokestatic    #365 <Method int AppboyLogger.w(String, String, Throwable)>
	//   15   29:pop             
			return false;
	//   16   30:iconst_0        
	//   17   31:ireturn         
		}
		return true;
	}

	public boolean b()
	{
		if(!f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field boolean f>
	//*   2    4:ifne            19
		{
			AppboyLogger.i(a, "Did not request single location update. Location collection is disabled.");
	//    3    7:getstatic       #39  <Field String a>
	//    4   10:ldc2            #369 <String "Did not request single location update. Location collection is disabled.">
	//    5   13:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//    6   16:pop             
			return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
		}
		if(!PermissionUtils.hasPermission(b, "android.permission.ACCESS_FINE_LOCATION") && !PermissionUtils.hasPermission(b, "android.permission.ACCESS_COARSE_LOCATION"))
	//*   9   19:aload_0         
	//*  10   20:getfield        #55  <Field Context b>
	//*  11   23:ldc1            #122 <String "android.permission.ACCESS_FINE_LOCATION">
	//*  12   25:invokestatic    #128 <Method boolean PermissionUtils.hasPermission(Context, String)>
	//*  13   28:ifne            56
	//*  14   31:aload_0         
	//*  15   32:getfield        #55  <Field Context b>
	//*  16   35:ldc2            #371 <String "android.permission.ACCESS_COARSE_LOCATION">
	//*  17   38:invokestatic    #128 <Method boolean PermissionUtils.hasPermission(Context, String)>
	//*  18   41:ifne            56
		{
			AppboyLogger.i(a, "Did not request single location update. Fine grained location permissions not found.");
	//   19   44:getstatic       #39  <Field String a>
	//   20   47:ldc2            #373 <String "Did not request single location update. Fine grained location permissions not found.">
	//   21   50:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//   22   53:pop             
			return false;
	//   23   54:iconst_0        
	//   24   55:ireturn         
		}
		String s;
		if(PermissionUtils.hasPermission(b, "android.permission.ACCESS_FINE_LOCATION"))
	//*  25   56:aload_0         
	//*  26   57:getfield        #55  <Field Context b>
	//*  27   60:ldc1            #122 <String "android.permission.ACCESS_FINE_LOCATION">
	//*  28   62:invokestatic    #128 <Method boolean PermissionUtils.hasPermission(Context, String)>
	//*  29   65:ifeq            75
			s = "passive";
	//   30   68:ldc2            #375 <String "passive">
	//   31   71:astore_1        
		else
	//*  32   72:goto            80
			s = g();
	//   33   75:aload_0         
	//   34   76:invokespecial   #377 <Method String g()>
	//   35   79:astore_1        
		if(StringUtils.isNullOrBlank(s))
	//*  36   80:aload_1         
	//*  37   81:invokestatic    #382 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  38   84:ifeq            99
		{
			AppboyLogger.d(a, "Could not request single location update. Android location provider not found.");
	//   39   87:getstatic       #39  <Field String a>
	//   40   90:ldc2            #384 <String "Could not request single location update. Android location provider not found.">
	//   41   93:invokestatic    #386 <Method int AppboyLogger.d(String, String)>
	//   42   96:pop             
			return false;
	//   43   97:iconst_0        
	//   44   98:ireturn         
		}
		try
		{
			AppboyLogger.d(a, "Requesting single location update.");
	//   45   99:getstatic       #39  <Field String a>
	//   46  102:ldc2            #388 <String "Requesting single location update.">
	//   47  105:invokestatic    #386 <Method int AppboyLogger.d(String, String)>
	//   48  108:pop             
			Object obj = ((Object) (new StringBuilder()));
	//   49  109:new             #96  <Class StringBuilder>
	//   50  112:dup             
	//   51  113:invokespecial   #97  <Method void StringBuilder()>
	//   52  116:astore_2        
			((StringBuilder) (obj)).append(c);
	//   53  117:aload_2         
	//   54  118:aload_0         
	//   55  119:getfield        #63  <Field String c>
	//   56  122:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   57  125:pop             
			((StringBuilder) (obj)).append(".SINGLE_APPBOY_LOCATION_UPDATE");
	//   58  126:aload_2         
	//   59  127:ldc1            #103 <String ".SINGLE_APPBOY_LOCATION_UPDATE">
	//   60  129:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   61  132:pop             
			obj = ((Object) (new Intent(((StringBuilder) (obj)).toString())));
	//   62  133:new             #139 <Class Intent>
	//   63  136:dup             
	//   64  137:aload_2         
	//   65  138:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   66  141:invokespecial   #255 <Method void Intent(String)>
	//   67  144:astore_2        
			((Intent) (obj)).putExtra("origin", "Appboy location manager");
	//   68  145:aload_2         
	//   69  146:ldc1            #137 <String "origin">
	//   70  148:ldc2            #390 <String "Appboy location manager">
	//   71  151:invokevirtual   #393 <Method Intent Intent.putExtra(String, String)>
	//   72  154:pop             
			obj = ((Object) (PendingIntent.getBroadcast(b, 0, ((Intent) (obj)), 0x8000000)));
	//   73  155:aload_0         
	//   74  156:getfield        #55  <Field Context b>
	//   75  159:iconst_0        
	//   76  160:aload_2         
	//   77  161:ldc2            #394 <Int 0x8000000>
	//   78  164:invokestatic    #400 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   79  167:astore_2        
			d.requestSingleUpdate(s, ((PendingIntent) (obj)));
	//   80  168:aload_0         
	//   81  169:getfield        #75  <Field LocationManager d>
	//   82  172:aload_1         
	//   83  173:aload_2         
	//   84  174:invokevirtual   #404 <Method void LocationManager.requestSingleUpdate(String, PendingIntent)>
		}
	//*  85  177:iconst_1        
	//*  86  178:ireturn         
	//*  87  179:astore_1        
	//*  88  180:getstatic       #39  <Field String a>
	//*  89  183:ldc2            #406 <String "Failed to request single location update due to exception.">
	//*  90  186:aload_1         
	//*  91  187:invokestatic    #365 <Method int AppboyLogger.w(String, String, Throwable)>
	//*  92  190:pop             
	//*  93  191:iconst_0        
	//*  94  192:ireturn         
		catch(SecurityException securityexception)
	//*  95  193:astore_1        
		{
			AppboyLogger.w(a, "Failed to request single location update due to security exception from insufficient permissions.", ((Throwable) (securityexception)));
	//   96  194:getstatic       #39  <Field String a>
	//   97  197:ldc2            #408 <String "Failed to request single location update due to security exception from insufficient permissions.">
	//   98  200:aload_1         
	//   99  201:invokestatic    #365 <Method int AppboyLogger.w(String, String, Throwable)>
	//  100  204:pop             
			return false;
	//  101  205:iconst_0        
	//  102  206:ireturn         
		}
		catch(Exception exception)
		{
			AppboyLogger.w(a, "Failed to request single location update due to exception.", ((Throwable) (exception)));
			return false;
		}
		return true;
	}

	public boolean c()
	{
		if(!f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field boolean f>
	//*   2    4:ifne            19
		{
			AppboyLogger.i(a, "Did not request background location updates. Location collection is disabled.");
	//    3    7:getstatic       #39  <Field String a>
	//    4   10:ldc2            #410 <String "Did not request background location updates. Location collection is disabled.">
	//    5   13:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//    6   16:pop             
			return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
		}
		if(!h)
	//*   9   19:aload_0         
	//*  10   20:getfield        #46  <Field boolean h>
	//*  11   23:ifne            38
		{
			AppboyLogger.i(a, "Did not request background location updates. Background location collection is disabled.");
	//   12   26:getstatic       #39  <Field String a>
	//   13   29:ldc2            #412 <String "Did not request background location updates. Background location collection is disabled.">
	//   14   32:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//   15   35:pop             
			return false;
	//   16   36:iconst_0        
	//   17   37:ireturn         
		}
		if(!PermissionUtils.hasPermission(b, "android.permission.ACCESS_FINE_LOCATION"))
	//*  18   38:aload_0         
	//*  19   39:getfield        #55  <Field Context b>
	//*  20   42:ldc1            #122 <String "android.permission.ACCESS_FINE_LOCATION">
	//*  21   44:invokestatic    #128 <Method boolean PermissionUtils.hasPermission(Context, String)>
	//*  22   47:ifne            62
		{
			AppboyLogger.i(a, "Did not request background location updates. Fine grained location permissions not found.");
	//   23   50:getstatic       #39  <Field String a>
	//   24   53:ldc2            #414 <String "Did not request background location updates. Fine grained location permissions not found.">
	//   25   56:invokestatic    #151 <Method int AppboyLogger.i(String, String)>
	//   26   59:pop             
			return false;
	//   27   60:iconst_0        
	//   28   61:ireturn         
		}
		boolean flag;
		try
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   29   62:new             #96  <Class StringBuilder>
	//   30   65:dup             
	//   31   66:invokespecial   #97  <Method void StringBuilder()>
	//   32   69:astore_2        
			stringbuilder.append(c);
	//   33   70:aload_2         
	//   34   71:aload_0         
	//   35   72:getfield        #63  <Field String c>
	//   36   75:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   37   78:pop             
			stringbuilder.append(".REQUEST_REMOVE_APPBOY_LOCATION_UPDATES");
	//   38   79:aload_2         
	//   39   80:ldc2            #416 <String ".REQUEST_REMOVE_APPBOY_LOCATION_UPDATES">
	//   40   83:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   41   86:pop             
			a(stringbuilder.toString());
	//   42   87:aload_0         
	//   43   88:aload_2         
	//   44   89:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   45   92:invokespecial   #418 <Method boolean a(String)>
	//   46   95:pop             
			stringbuilder = new StringBuilder();
	//   47   96:new             #96  <Class StringBuilder>
	//   48   99:dup             
	//   49  100:invokespecial   #97  <Method void StringBuilder()>
	//   50  103:astore_2        
			stringbuilder.append(c);
	//   51  104:aload_2         
	//   52  105:aload_0         
	//   53  106:getfield        #63  <Field String c>
	//   54  109:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   55  112:pop             
			stringbuilder.append(".REQUEST_APPBOY_LOCATION_UPDATES");
	//   56  113:aload_2         
	//   57  114:ldc2            #263 <String ".REQUEST_APPBOY_LOCATION_UPDATES">
	//   58  117:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   59  120:pop             
			flag = a(stringbuilder.toString());
	//   60  121:aload_0         
	//   61  122:aload_2         
	//   62  123:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   63  126:invokespecial   #418 <Method boolean a(String)>
	//   64  129:istore_1        
		}
	//*  65  130:iload_1         
	//*  66  131:ireturn         
		catch(Exception exception)
	//*  67  132:astore_2        
		{
			AppboyLogger.w(a, "Could not request location updates due to exception.", ((Throwable) (exception)));
	//   68  133:getstatic       #39  <Field String a>
	//   69  136:ldc2            #420 <String "Could not request location updates due to exception.">
	//   70  139:aload_2         
	//   71  140:invokestatic    #365 <Method int AppboyLogger.w(String, String, Throwable)>
	//   72  143:pop             
			return false;
	//   73  144:iconst_0        
	//   74  145:ireturn         
		}
		return flag;
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/be);
	private final Context b;
	private final String c;
	private final LocationManager d;
	private final bl e;
	private final boolean f;
	private final boolean g = f();
	private boolean h;
	private long i;
	private float j;
	private String k;

	static 
	{
	//    0    0:ldc1            #2   <Class be>
	//    1    2:invokestatic    #37  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #39  <Field String a>
	//*   3    8:return          
	}
}
