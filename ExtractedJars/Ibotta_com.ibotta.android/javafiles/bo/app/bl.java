// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.models.AppboyGeofence;
import com.appboy.support.AppboyLogger;
import com.appboy.support.PermissionUtils;
import com.google.android.gms.location.GeofencingClient;
import com.google.android.gms.location.LocationServices;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.util.*;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			ee, bm, cj, cd, 
//			bt, ct, el, ef, 
//			bn, eg, x, ci, 
//			eb, dx

public class bl
{

	public bl(Context context, String s, bt bt1, AppboyConfigurationProvider appboyconfigurationprovider, dx dx)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #49  <Method void Object()>
	//    6   12:putfield        #51  <Field Object n>
		boolean flag1 = false;
	//    7   15:iconst_0        
	//    8   16:istore          7
		h = false;
	//    9   18:aload_0         
	//   10   19:iconst_0        
	//   11   20:putfield        #53  <Field boolean h>
		k = context.getApplicationContext();
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:invokevirtual   #59  <Method Context Context.getApplicationContext()>
	//   15   28:putfield        #61  <Field Context k>
		a = bt1;
	//   16   31:aload_0         
	//   17   32:aload_3         
	//   18   33:putfield        #63  <Field bt a>
		b = context.getSharedPreferences(b(s), 0);
	//   19   36:aload_0         
	//   20   37:aload_1         
	//   21   38:aload_2         
	//   22   39:invokestatic    #66  <Method String b(String)>
	//   23   42:iconst_0        
	//   24   43:invokevirtual   #70  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   25   46:putfield        #72  <Field SharedPreferences b>
		l = appboyconfigurationprovider;
	//   26   49:aload_0         
	//   27   50:aload           4
	//   28   52:putfield        #74  <Field AppboyConfigurationProvider l>
		m = dx;
	//   29   55:aload_0         
	//   30   56:aload           5
	//   31   58:putfield        #76  <Field dx m>
		boolean flag = flag1;
	//   32   61:iload           7
	//   33   63:istore          6
		if(ee.a(m))
	//*  34   65:aload_0         
	//*  35   66:getfield        #76  <Field dx m>
	//*  36   69:invokestatic    #81  <Method boolean ee.a(dx)>
	//*  37   72:ifeq            90
		{
			flag = flag1;
	//   38   75:iload           7
	//   39   77:istore          6
			if(a(context))
	//*  40   79:aload_0         
	//*  41   80:aload_1         
	//*  42   81:invokevirtual   #84  <Method boolean a(Context)>
	//*  43   84:ifeq            90
				flag = true;
	//   44   87:iconst_1        
	//   45   88:istore          6
		}
		h = flag;
	//   46   90:aload_0         
	//   47   91:iload           6
	//   48   93:putfield        #53  <Field boolean h>
		i = ee.b(m);
	//   49   96:aload_0         
	//   50   97:aload_0         
	//   51   98:getfield        #76  <Field dx m>
	//   52  101:invokestatic    #87  <Method int ee.b(dx)>
	//   53  104:putfield        #89  <Field int i>
		c = ee.a(b);
	//   54  107:aload_0         
	//   55  108:aload_0         
	//   56  109:getfield        #72  <Field SharedPreferences b>
	//   57  112:invokestatic    #92  <Method List ee.a(SharedPreferences)>
	//   58  115:putfield        #94  <Field List c>
		d = ee.a(context);
	//   59  118:aload_0         
	//   60  119:aload_1         
	//   61  120:invokestatic    #97  <Method PendingIntent ee.a(Context)>
	//   62  123:putfield        #99  <Field PendingIntent d>
		e = ee.b(context);
	//   63  126:aload_0         
	//   64  127:aload_1         
	//   65  128:invokestatic    #101 <Method PendingIntent ee.b(Context)>
	//   66  131:putfield        #103 <Field PendingIntent e>
		f = new bm(context, s, dx);
	//   67  134:aload_0         
	//   68  135:new             #105 <Class bm>
	//   69  138:dup             
	//   70  139:aload_1         
	//   71  140:aload_2         
	//   72  141:aload           5
	//   73  143:invokespecial   #108 <Method void bm(Context, String, dx)>
	//   74  146:putfield        #110 <Field bm f>
		a(true);
	//   75  149:aload_0         
	//   76  150:iconst_1        
	//   77  151:invokevirtual   #113 <Method void a(boolean)>
	//   78  154:return          
	}

	static String b(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #115 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #116 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("com.appboy.managers.geofences.storage.");
	//    4    8:aload_1         
	//    5    9:ldc1            #118 <String "com.appboy.managers.geofences.storage.">
	//    6   11:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		return stringbuilder.toString();
	//   12   21:aload_1         
	//   13   22:invokevirtual   #126 <Method String StringBuilder.toString()>
	//   14   25:areturn         
	}

	AppboyGeofence a(String s)
	{
label0:
		{
			AppboyGeofence appboygeofence;
			synchronized(n)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field Object n>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				Iterator iterator = c.iterator();
	//    5    7:aload_0         
	//    6    8:getfield        #94  <Field List c>
	//    7   11:invokeinterface #134 <Method Iterator List.iterator()>
	//    8   16:astore_3        
				do
				{
					if(!iterator.hasNext())
						break label0;
	//    9   17:aload_3         
	//   10   18:invokeinterface #140 <Method boolean Iterator.hasNext()>
	//   11   23:ifeq            54
					appboygeofence = (AppboyGeofence)iterator.next();
	//   12   26:aload_3         
	//   13   27:invokeinterface #144 <Method Object Iterator.next()>
	//   14   32:checkcast       #146 <Class AppboyGeofence>
	//   15   35:astore          4
				} while(!appboygeofence.getId().equals(((Object) (s))));
	//   16   37:aload           4
	//   17   39:invokevirtual   #149 <Method String AppboyGeofence.getId()>
	//   18   42:aload_1         
	//   19   43:invokevirtual   #155 <Method boolean String.equals(Object)>
	//   20   46:ifeq            17
			}
	//   21   49:aload_2         
	//   22   50:monitorexit     
			return appboygeofence;
	//   23   51:aload           4
	//   24   53:areturn         
		}
		obj;
	//   25   54:aload_2         
		JVM INSTR monitorexit ;
	//   26   55:monitorexit     
		return null;
	//   27   56:aconst_null     
	//   28   57:areturn         
		s;
	//   29   58:astore_1        
		obj;
	//   30   59:aload_2         
		JVM INSTR monitorexit ;
	//   31   60:monitorexit     
		throw s;
	//   32   61:aload_1         
	//   33   62:athrow          
	}

	public void a()
	{
		AppboyLogger.d(j, "Request to set up geofences received.");
	//    0    0:getstatic       #44  <Field String j>
	//    1    3:ldc1            #157 <String "Request to set up geofences received.">
	//    2    5:invokestatic    #160 <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		boolean flag;
		if(ee.a(m) && a(k))
	//*   4    9:aload_0         
	//*   5   10:getfield        #76  <Field dx m>
	//*   6   13:invokestatic    #81  <Method boolean ee.a(dx)>
	//*   7   16:ifeq            35
	//*   8   19:aload_0         
	//*   9   20:aload_0         
	//*  10   21:getfield        #61  <Field Context k>
	//*  11   24:invokevirtual   #84  <Method boolean a(Context)>
	//*  12   27:ifeq            35
			flag = true;
	//   13   30:iconst_1        
	//   14   31:istore_1        
		else
	//*  15   32:goto            37
			flag = false;
	//   16   35:iconst_0        
	//   17   36:istore_1        
		h = flag;
	//   18   37:aload_0         
	//   19   38:iload_1         
	//   20   39:putfield        #53  <Field boolean h>
		a(false);
	//   21   42:aload_0         
	//   22   43:iconst_0        
	//   23   44:invokevirtual   #113 <Method void a(boolean)>
		b(true);
	//   24   47:aload_0         
	//   25   48:iconst_1        
	//   26   49:invokevirtual   #162 <Method void b(boolean)>
	//   27   52:return          
	}

	protected void a(PendingIntent pendingintent)
	{
		AppboyLogger.d(j, "Tearing down geofences.");
	//    0    0:getstatic       #44  <Field String j>
	//    1    3:ldc1            #165 <String "Tearing down geofences.">
	//    2    5:invokestatic    #160 <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		if(pendingintent != null)
	//*   4    9:aload_1         
	//*   5   10:ifnull          34
		{
			AppboyLogger.d(j, "Unregistering any Braze geofences from Google Play Services.");
	//    6   13:getstatic       #44  <Field String j>
	//    7   16:ldc1            #167 <String "Unregistering any Braze geofences from Google Play Services.">
	//    8   18:invokestatic    #160 <Method int AppboyLogger.d(String, String)>
	//    9   21:pop             
			LocationServices.getGeofencingClient(k).removeGeofences(pendingintent);
	//   10   22:aload_0         
	//   11   23:getfield        #61  <Field Context k>
	//   12   26:invokestatic    #173 <Method GeofencingClient LocationServices.getGeofencingClient(Context)>
	//   13   29:aload_1         
	//   14   30:invokevirtual   #179 <Method com.google.android.gms.tasks.Task GeofencingClient.removeGeofences(PendingIntent)>
	//   15   33:pop             
		}
		synchronized(n)
	//*  16   34:aload_0         
	//*  17   35:getfield        #51  <Field Object n>
	//*  18   38:astore_1        
	//*  19   39:aload_1         
	//*  20   40:monitorenter    
		{
			AppboyLogger.d(j, "Deleting locally stored geofences.");
	//   21   41:getstatic       #44  <Field String j>
	//   22   44:ldc1            #181 <String "Deleting locally stored geofences.">
	//   23   46:invokestatic    #160 <Method int AppboyLogger.d(String, String)>
	//   24   49:pop             
			android.content.SharedPreferences.Editor editor = b.edit();
	//   25   50:aload_0         
	//   26   51:getfield        #72  <Field SharedPreferences b>
	//   27   54:invokeinterface #187 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   28   59:astore_2        
			editor.clear();
	//   29   60:aload_2         
	//   30   61:invokeinterface #192 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//   31   66:pop             
			c.clear();
	//   32   67:aload_0         
	//   33   68:getfield        #94  <Field List c>
	//   34   71:invokeinterface #194 <Method void List.clear()>
			editor.apply();
	//   35   76:aload_2         
	//   36   77:invokeinterface #197 <Method void android.content.SharedPreferences$Editor.apply()>
		}
	//   37   82:aload_1         
	//   38   83:monitorexit     
		return;
	//   39   84:return          
		exception;
	//   40   85:astore_2        
		pendingintent;
	//   41   86:aload_1         
		JVM INSTR monitorexit ;
	//   42   87:monitorexit     
		throw exception;
	//   43   88:aload_2         
	//   44   89:athrow          
	}

	public void a(cd cd1)
	{
		if(!h)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field boolean h>
	//*   2    4:ifne            17
		{
			AppboyLogger.d(j, "Appboy geofences not enabled. Not requesting geofences.");
	//    3    7:getstatic       #44  <Field String j>
	//    4   10:ldc1            #200 <String "Appboy geofences not enabled. Not requesting geofences.">
	//    5   12:invokestatic    #160 <Method int AppboyLogger.d(String, String)>
	//    6   15:pop             
			return;
	//    7   16:return          
		}
		if(cd1 != null)
	//*   8   17:aload_1         
	//*   9   18:ifnull          69
		{
			g = ((cd) (new cj(cd1.a(), cd1.b(), cd1.c(), cd1.d())));
	//   10   21:aload_0         
	//   11   22:new             #202 <Class cj>
	//   12   25:dup             
	//   13   26:aload_1         
	//   14   27:invokeinterface #207 <Method double cd.a()>
	//   15   32:aload_1         
	//   16   33:invokeinterface #209 <Method double cd.b()>
	//   17   38:aload_1         
	//   18   39:invokeinterface #212 <Method Double cd.c()>
	//   19   44:aload_1         
	//   20   45:invokeinterface #214 <Method Double cd.d()>
	//   21   50:invokespecial   #217 <Method void cj(double, double, Double, Double)>
	//   22   53:putfield        #219 <Field cd g>
			a.a(g);
	//   23   56:aload_0         
	//   24   57:getfield        #63  <Field bt a>
	//   25   60:aload_0         
	//   26   61:getfield        #219 <Field cd g>
	//   27   64:invokeinterface #223 <Method void bt.a(cd)>
		}
	//   28   69:return          
	}

	public void a(ct ct1)
	{
		if(ct1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			AppboyLogger.w(j, "Could not configure geofence manager from server config. Server config was null.");
	//    2    4:getstatic       #44  <Field String j>
	//    3    7:ldc1            #226 <String "Could not configure geofence manager from server config. Server config was null.">
	//    4    9:invokestatic    #229 <Method int AppboyLogger.w(String, String)>
	//    5   12:pop             
			return;
	//    6   13:return          
		}
		boolean flag = ct1.i();
	//    7   14:aload_1         
	//    8   15:invokevirtual   #233 <Method boolean ct.i()>
	//    9   18:istore_3        
		String s = j;
	//   10   19:getstatic       #44  <Field String j>
	//   11   22:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   12   24:new             #115 <Class StringBuilder>
	//   13   27:dup             
	//   14   28:invokespecial   #116 <Method void StringBuilder()>
	//   15   31:astore          5
		stringbuilder.append("Geofences enabled server config value ");
	//   16   33:aload           5
	//   17   35:ldc1            #235 <String "Geofences enabled server config value ">
	//   18   37:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   19   40:pop             
		stringbuilder.append(flag);
	//   20   41:aload           5
	//   21   43:iload_3         
	//   22   44:invokevirtual   #238 <Method StringBuilder StringBuilder.append(boolean)>
	//   23   47:pop             
		stringbuilder.append(" received.");
	//   24   48:aload           5
	//   25   50:ldc1            #240 <String " received.">
	//   26   52:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   27   55:pop             
		AppboyLogger.d(s, stringbuilder.toString());
	//   28   56:aload           4
	//   29   58:aload           5
	//   30   60:invokevirtual   #126 <Method String StringBuilder.toString()>
	//   31   63:invokestatic    #160 <Method int AppboyLogger.d(String, String)>
	//   32   66:pop             
		if(flag && a(k))
	//*  33   67:iload_3         
	//*  34   68:ifeq            87
	//*  35   71:aload_0         
	//*  36   72:aload_0         
	//*  37   73:getfield        #61  <Field Context k>
	//*  38   76:invokevirtual   #84  <Method boolean a(Context)>
	//*  39   79:ifeq            87
			flag = true;
	//   40   82:iconst_1        
	//   41   83:istore_3        
		else
	//*  42   84:goto            89
			flag = false;
	//   43   87:iconst_0        
	//   44   88:istore_3        
		if(flag != h)
	//*  45   89:iload_3         
	//*  46   90:aload_0         
	//*  47   91:getfield        #53  <Field boolean h>
	//*  48   94:icmpeq          184
		{
			h = flag;
	//   49   97:aload_0         
	//   50   98:iload_3         
	//   51   99:putfield        #53  <Field boolean h>
			String s1 = j;
	//   52  102:getstatic       #44  <Field String j>
	//   53  105:astore          4
			StringBuilder stringbuilder1 = new StringBuilder();
	//   54  107:new             #115 <Class StringBuilder>
	//   55  110:dup             
	//   56  111:invokespecial   #116 <Method void StringBuilder()>
	//   57  114:astore          5
			stringbuilder1.append("Geofences enabled status newly set to ");
	//   58  116:aload           5
	//   59  118:ldc1            #242 <String "Geofences enabled status newly set to ">
	//   60  120:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   61  123:pop             
			stringbuilder1.append(h);
	//   62  124:aload           5
	//   63  126:aload_0         
	//   64  127:getfield        #53  <Field boolean h>
	//   65  130:invokevirtual   #238 <Method StringBuilder StringBuilder.append(boolean)>
	//   66  133:pop             
			stringbuilder1.append(" during server config update.");
	//   67  134:aload           5
	//   68  136:ldc1            #244 <String " during server config update.">
	//   69  138:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   70  141:pop             
			AppboyLogger.i(s1, stringbuilder1.toString());
	//   71  142:aload           4
	//   72  144:aload           5
	//   73  146:invokevirtual   #126 <Method String StringBuilder.toString()>
	//   74  149:invokestatic    #246 <Method int AppboyLogger.i(String, String)>
	//   75  152:pop             
			if(h)
	//*  76  153:aload_0         
	//*  77  154:getfield        #53  <Field boolean h>
	//*  78  157:ifeq            173
			{
				a(false);
	//   79  160:aload_0         
	//   80  161:iconst_0        
	//   81  162:invokevirtual   #113 <Method void a(boolean)>
				b(true);
	//   82  165:aload_0         
	//   83  166:iconst_1        
	//   84  167:invokevirtual   #162 <Method void b(boolean)>
			} else
	//*  85  170:goto            235
			{
				a(d);
	//   86  173:aload_0         
	//   87  174:aload_0         
	//   88  175:getfield        #99  <Field PendingIntent d>
	//   89  178:invokevirtual   #248 <Method void a(PendingIntent)>
			}
		} else
	//*  90  181:goto            235
		{
			String s2 = j;
	//   91  184:getstatic       #44  <Field String j>
	//   92  187:astore          4
			StringBuilder stringbuilder2 = new StringBuilder();
	//   93  189:new             #115 <Class StringBuilder>
	//   94  192:dup             
	//   95  193:invokespecial   #116 <Method void StringBuilder()>
	//   96  196:astore          5
			stringbuilder2.append("Geofences enabled status ");
	//   97  198:aload           5
	//   98  200:ldc1            #250 <String "Geofences enabled status ">
	//   99  202:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//  100  205:pop             
			stringbuilder2.append(h);
	//  101  206:aload           5
	//  102  208:aload_0         
	//  103  209:getfield        #53  <Field boolean h>
	//  104  212:invokevirtual   #238 <Method StringBuilder StringBuilder.append(boolean)>
	//  105  215:pop             
			stringbuilder2.append(" unchanged during server config update.");
	//  106  216:aload           5
	//  107  218:ldc1            #252 <String " unchanged during server config update.">
	//  108  220:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//  109  223:pop             
			AppboyLogger.d(s2, stringbuilder2.toString());
	//  110  224:aload           4
	//  111  226:aload           5
	//  112  228:invokevirtual   #126 <Method String StringBuilder.toString()>
	//  113  231:invokestatic    #160 <Method int AppboyLogger.d(String, String)>
	//  114  234:pop             
		}
		int i1 = ct1.h();
	//  115  235:aload_1         
	//  116  236:invokevirtual   #255 <Method int ct.h()>
	//  117  239:istore_2        
		if(i1 >= 0)
	//* 118  240:iload_2         
	//* 119  241:iflt            302
		{
			i = i1;
	//  120  244:aload_0         
	//  121  245:iload_2         
	//  122  246:putfield        #89  <Field int i>
			String s3 = j;
	//  123  249:getstatic       #44  <Field String j>
	//  124  252:astore          4
			StringBuilder stringbuilder3 = new StringBuilder();
	//  125  254:new             #115 <Class StringBuilder>
	//  126  257:dup             
	//  127  258:invokespecial   #116 <Method void StringBuilder()>
	//  128  261:astore          5
			stringbuilder3.append("Max number to register newly set to ");
	//  129  263:aload           5
	//  130  265:ldc2            #257 <String "Max number to register newly set to ">
	//  131  268:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//  132  271:pop             
			stringbuilder3.append(i);
	//  133  272:aload           5
	//  134  274:aload_0         
	//  135  275:getfield        #89  <Field int i>
	//  136  278:invokevirtual   #260 <Method StringBuilder StringBuilder.append(int)>
	//  137  281:pop             
			stringbuilder3.append(" via server config.");
	//  138  282:aload           5
	//  139  284:ldc2            #262 <String " via server config.">
	//  140  287:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//  141  290:pop             
			AppboyLogger.i(s3, stringbuilder3.toString());
	//  142  291:aload           4
	//  143  293:aload           5
	//  144  295:invokevirtual   #126 <Method String StringBuilder.toString()>
	//  145  298:invokestatic    #246 <Method int AppboyLogger.i(String, String)>
	//  146  301:pop             
		}
		f.a(ct1);
	//  147  302:aload_0         
	//  148  303:getfield        #110 <Field bm f>
	//  149  306:aload_1         
	//  150  307:invokevirtual   #264 <Method void bm.a(ct)>
	//  151  310:return          
	}

	public void a(List list)
	{
		if(list == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			AppboyLogger.w(j, "Appboy geofence list was null. Not adding new geofences to local storage.");
	//    2    4:getstatic       #44  <Field String j>
	//    3    7:ldc2            #267 <String "Appboy geofence list was null. Not adding new geofences to local storage.">
	//    4   10:invokestatic    #229 <Method int AppboyLogger.w(String, String)>
	//    5   13:pop             
			return;
	//    6   14:return          
		}
		if(!h)
	//*   7   15:aload_0         
	//*   8   16:getfield        #53  <Field boolean h>
	//*   9   19:ifne            33
		{
			AppboyLogger.w(j, "Appboy geofences not enabled. Not adding new geofences to local storage.");
	//   10   22:getstatic       #44  <Field String j>
	//   11   25:ldc2            #269 <String "Appboy geofences not enabled. Not adding new geofences to local storage.">
	//   12   28:invokestatic    #229 <Method int AppboyLogger.w(String, String)>
	//   13   31:pop             
			return;
	//   14   32:return          
		}
		if(g != null)
	//*  15   33:aload_0         
	//*  16   34:getfield        #219 <Field cd g>
	//*  17   37:ifnull          110
		{
			AppboyGeofence appboygeofence;
			for(Iterator iterator = list.iterator(); iterator.hasNext(); appboygeofence.setDistanceFromGeofenceRefresh(el.a(g.a(), g.b(), appboygeofence.getLatitude(), appboygeofence.getLongitude())))
	//*  18   40:aload_1         
	//*  19   41:invokeinterface #134 <Method Iterator List.iterator()>
	//*  20   46:astore_3        
	//*  21   47:aload_3         
	//*  22   48:invokeinterface #140 <Method boolean Iterator.hasNext()>
	//*  23   53:ifeq            106
				appboygeofence = (AppboyGeofence)iterator.next();
	//   24   56:aload_3         
	//   25   57:invokeinterface #144 <Method Object Iterator.next()>
	//   26   62:checkcast       #146 <Class AppboyGeofence>
	//   27   65:astore          4

	//   28   67:aload           4
	//   29   69:aload_0         
	//   30   70:getfield        #219 <Field cd g>
	//   31   73:invokeinterface #207 <Method double cd.a()>
	//   32   78:aload_0         
	//   33   79:getfield        #219 <Field cd g>
	//   34   82:invokeinterface #209 <Method double cd.b()>
	//   35   87:aload           4
	//   36   89:invokevirtual   #272 <Method double AppboyGeofence.getLatitude()>
	//   37   92:aload           4
	//   38   94:invokevirtual   #275 <Method double AppboyGeofence.getLongitude()>
	//   39   97:invokestatic    #280 <Method double el.a(double, double, double, double)>
	//   40  100:invokevirtual   #284 <Method void AppboyGeofence.setDistanceFromGeofenceRefresh(double)>
	//*  41  103:goto            47
			Collections.sort(list);
	//   42  106:aload_1         
	//   43  107:invokestatic    #289 <Method void Collections.sort(List)>
		}
		Object obj1 = n;
	//   44  110:aload_0         
	//   45  111:getfield        #51  <Field Object n>
	//   46  114:astore          4
		obj1;
	//   47  116:aload           4
		JVM INSTR monitorenter ;
	//   48  118:monitorenter    
		Object obj2;
		String s = j;
	//   49  119:getstatic       #44  <Field String j>
	//   50  122:astore_3        
		obj2 = ((Object) (new StringBuilder()));
	//   51  123:new             #115 <Class StringBuilder>
	//   52  126:dup             
	//   53  127:invokespecial   #116 <Method void StringBuilder()>
	//   54  130:astore          5
		((StringBuilder) (obj2)).append("Received new geofence list of size: ");
	//   55  132:aload           5
	//   56  134:ldc2            #291 <String "Received new geofence list of size: ">
	//   57  137:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   58  140:pop             
		((StringBuilder) (obj2)).append(list.size());
	//   59  141:aload           5
	//   60  143:aload_1         
	//   61  144:invokeinterface #294 <Method int List.size()>
	//   62  149:invokevirtual   #260 <Method StringBuilder StringBuilder.append(int)>
	//   63  152:pop             
		AppboyLogger.d(s, ((StringBuilder) (obj2)).toString());
	//   64  153:aload_3         
	//   65  154:aload           5
	//   66  156:invokevirtual   #126 <Method String StringBuilder.toString()>
	//   67  159:invokestatic    #160 <Method int AppboyLogger.d(String, String)>
	//   68  162:pop             
		obj2 = ((Object) (b.edit()));
	//   69  163:aload_0         
	//   70  164:getfield        #72  <Field SharedPreferences b>
	//   71  167:invokeinterface #187 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   72  172:astore          5
		((android.content.SharedPreferences.Editor) (obj2)).clear();
	//   73  174:aload           5
	//   74  176:invokeinterface #192 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//   75  181:pop             
		c.clear();
	//   76  182:aload_0         
	//   77  183:getfield        #94  <Field List c>
	//   78  186:invokeinterface #194 <Method void List.clear()>
		int i1 = 0;
	//   79  191:iconst_0        
	//   80  192:istore_2        
		Iterator iterator1 = list.iterator();
	//   81  193:aload_1         
	//   82  194:invokeinterface #134 <Method Iterator List.iterator()>
	//   83  199:astore          6
_L2:
		Object obj;
		if(!iterator1.hasNext())
			break MISSING_BLOCK_LABEL_382;
	//   84  201:aload           6
	//   85  203:invokeinterface #140 <Method boolean Iterator.hasNext()>
	//   86  208:ifeq            382
		obj = ((Object) ((AppboyGeofence)iterator1.next()));
	//   87  211:aload           6
	//   88  213:invokeinterface #144 <Method Object Iterator.next()>
	//   89  218:checkcast       #146 <Class AppboyGeofence>
	//   90  221:astore_3        
		if(i1 == i)
	//*  91  222:iload_2         
	//*  92  223:aload_0         
	//*  93  224:getfield        #89  <Field int i>
	//*  94  227:icmpne          275
		{
			obj = ((Object) (j));
	//   95  230:getstatic       #44  <Field String j>
	//   96  233:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   97  234:new             #115 <Class StringBuilder>
	//   98  237:dup             
	//   99  238:invokespecial   #116 <Method void StringBuilder()>
	//  100  241:astore          6
			stringbuilder.append("Reached maximum number of new geofences: ");
	//  101  243:aload           6
	//  102  245:ldc2            #296 <String "Reached maximum number of new geofences: ">
	//  103  248:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//  104  251:pop             
			stringbuilder.append(i);
	//  105  252:aload           6
	//  106  254:aload_0         
	//  107  255:getfield        #89  <Field int i>
	//  108  258:invokevirtual   #260 <Method StringBuilder StringBuilder.append(int)>
	//  109  261:pop             
			AppboyLogger.d(((String) (obj)), stringbuilder.toString());
	//  110  262:aload_3         
	//  111  263:aload           6
	//  112  265:invokevirtual   #126 <Method String StringBuilder.toString()>
	//  113  268:invokestatic    #160 <Method int AppboyLogger.d(String, String)>
	//  114  271:pop             
			break MISSING_BLOCK_LABEL_382;
	//  115  272:goto            382
		}
		String s2;
		c.add(obj);
	//  116  275:aload_0         
	//  117  276:getfield        #94  <Field List c>
	//  118  279:aload_3         
	//  119  280:invokeinterface #299 <Method boolean List.add(Object)>
	//  120  285:pop             
		s2 = j;
	//  121  286:getstatic       #44  <Field String j>
	//  122  289:astore          7
		StringBuilder stringbuilder1 = new StringBuilder();
	//  123  291:new             #115 <Class StringBuilder>
	//  124  294:dup             
	//  125  295:invokespecial   #116 <Method void StringBuilder()>
	//  126  298:astore          8
		stringbuilder1.append("Adding new geofence to local storage: ");
	//  127  300:aload           8
	//  128  302:ldc2            #301 <String "Adding new geofence to local storage: ">
	//  129  305:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//  130  308:pop             
		stringbuilder1.append(((AppboyGeofence) (obj)).toString());
	//  131  309:aload           8
	//  132  311:aload_3         
	//  133  312:invokevirtual   #302 <Method String AppboyGeofence.toString()>
	//  134  315:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//  135  318:pop             
		AppboyLogger.d(s2, stringbuilder1.toString());
	//  136  319:aload           7
	//  137  321:aload           8
	//  138  323:invokevirtual   #126 <Method String StringBuilder.toString()>
	//  139  326:invokestatic    #160 <Method int AppboyLogger.d(String, String)>
	//  140  329:pop             
		s2 = ((AppboyGeofence) (obj)).getId();
	//  141  330:aload_3         
	//  142  331:invokevirtual   #149 <Method String AppboyGeofence.getId()>
	//  143  334:astore          7
		obj = ((Object) (((AppboyGeofence) (obj)).forJsonPut()));
	//  144  336:aload_3         
	//  145  337:invokevirtual   #306 <Method JSONObject AppboyGeofence.forJsonPut()>
	//  146  340:astore_3        
		if(!(obj instanceof JSONObject))
	//* 147  341:aload_3         
	//* 148  342:instanceof      #308 <Class JSONObject>
	//* 149  345:ifne            356
		{
			obj = ((Object) (((JSONObject) (obj)).toString()));
	//  150  348:aload_3         
	//  151  349:invokevirtual   #309 <Method String JSONObject.toString()>
	//  152  352:astore_3        
			break MISSING_BLOCK_LABEL_364;
	//  153  353:goto            364
		}
		obj = ((Object) (JSONObjectInstrumentation.toString((JSONObject)obj)));
	//  154  356:aload_3         
	//  155  357:checkcast       #308 <Class JSONObject>
	//  156  360:invokestatic    #314 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//  157  363:astore_3        
		((android.content.SharedPreferences.Editor) (obj2)).putString(s2, ((String) (obj)));
	//  158  364:aload           5
	//  159  366:aload           7
	//  160  368:aload_3         
	//  161  369:invokeinterface #318 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//  162  374:pop             
		i1++;
	//  163  375:iload_2         
	//  164  376:iconst_1        
	//  165  377:iadd            
	//  166  378:istore_2        
		if(true) goto _L2; else goto _L1
	//  167  379:goto            201
_L1:
		((android.content.SharedPreferences.Editor) (obj2)).apply();
	//  168  382:aload           5
	//  169  384:invokeinterface #197 <Method void android.content.SharedPreferences$Editor.apply()>
		String s1 = j;
	//  170  389:getstatic       #44  <Field String j>
	//  171  392:astore_3        
		obj2 = ((Object) (new StringBuilder()));
	//  172  393:new             #115 <Class StringBuilder>
	//  173  396:dup             
	//  174  397:invokespecial   #116 <Method void StringBuilder()>
	//  175  400:astore          5
		((StringBuilder) (obj2)).append("Added ");
	//  176  402:aload           5
	//  177  404:ldc2            #320 <String "Added ">
	//  178  407:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//  179  410:pop             
		((StringBuilder) (obj2)).append(c.size());
	//  180  411:aload           5
	//  181  413:aload_0         
	//  182  414:getfield        #94  <Field List c>
	//  183  417:invokeinterface #294 <Method int List.size()>
	//  184  422:invokevirtual   #260 <Method StringBuilder StringBuilder.append(int)>
	//  185  425:pop             
		((StringBuilder) (obj2)).append(" new geofences to local storage.");
	//  186  426:aload           5
	//  187  428:ldc2            #322 <String " new geofences to local storage.">
	//  188  431:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//  189  434:pop             
		AppboyLogger.d(s1, ((StringBuilder) (obj2)).toString());
	//  190  435:aload_3         
	//  191  436:aload           5
	//  192  438:invokevirtual   #126 <Method String StringBuilder.toString()>
	//  193  441:invokestatic    #160 <Method int AppboyLogger.d(String, String)>
	//  194  444:pop             
		obj1;
	//  195  445:aload           4
		JVM INSTR monitorexit ;
	//  196  447:monitorexit     
		f.a(list);
	//  197  448:aload_0         
	//  198  449:getfield        #110 <Field bm f>
	//  199  452:aload_1         
	//  200  453:invokevirtual   #324 <Method void bm.a(List)>
		a(true);
	//  201  456:aload_0         
	//  202  457:iconst_1        
	//  203  458:invokevirtual   #113 <Method void a(boolean)>
		return;
	//  204  461:return          
		list;
	//  205  462:astore_1        
		obj1;
	//  206  463:aload           4
		JVM INSTR monitorexit ;
	//  207  465:monitorexit     
		throw list;
	//  208  466:aload_1         
	//  209  467:athrow          
	}

	protected void a(List list, PendingIntent pendingintent)
	{
		ef.a(k, list, pendingintent);
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field Context k>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #332 <Method void ef.a(Context, List, PendingIntent)>
	//    5    9:return          
	}

	protected void a(boolean flag)
	{
		if(!h)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field boolean h>
	//*   2    4:ifne            18
		{
			AppboyLogger.d(j, "Appboy geofences not enabled. Geofences not set up.");
	//    3    7:getstatic       #44  <Field String j>
	//    4   10:ldc2            #335 <String "Appboy geofences not enabled. Geofences not set up.">
	//    5   13:invokestatic    #160 <Method int AppboyLogger.d(String, String)>
	//    6   16:pop             
			return;
	//    7   17:return          
		}
		AppboyLogger.d(j, "Location permissions and Google Play Services available. Location collection and Geofencing enabled via config.");
	//    8   18:getstatic       #44  <Field String j>
	//    9   21:ldc2            #337 <String "Location permissions and Google Play Services available. Location collection and Geofencing enabled via config.">
	//   10   24:invokestatic    #160 <Method int AppboyLogger.d(String, String)>
	//   11   27:pop             
		if(flag)
	//*  12   28:iload_1         
	//*  13   29:ifeq            59
		{
			synchronized(n)
	//*  14   32:aload_0         
	//*  15   33:getfield        #51  <Field Object n>
	//*  16   36:astore_2        
	//*  17   37:aload_2         
	//*  18   38:monitorenter    
			{
				a(c, d);
	//   19   39:aload_0         
	//   20   40:aload_0         
	//   21   41:getfield        #94  <Field List c>
	//   22   44:aload_0         
	//   23   45:getfield        #99  <Field PendingIntent d>
	//   24   48:invokevirtual   #339 <Method void a(List, PendingIntent)>
			}
	//   25   51:aload_2         
	//   26   52:monitorexit     
			return;
	//   27   53:return          
		} else
	//*  28   54:astore_3        
	//*  29   55:aload_2         
	//*  30   56:monitorexit     
	//*  31   57:aload_3         
	//*  32   58:athrow          
		{
			return;
	//   33   59:return          
		}
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	}

	protected boolean a(Context context)
	{
		if(!bn.a(l))
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field AppboyConfigurationProvider l>
	//*   2    4:invokestatic    #346 <Method boolean bn.a(AppboyConfigurationProvider)>
	//*   3    7:ifne            22
		{
			AppboyLogger.d(j, "Location collection not available. Geofences not enabled.");
	//    4   10:getstatic       #44  <Field String j>
	//    5   13:ldc2            #348 <String "Location collection not available. Geofences not enabled.">
	//    6   16:invokestatic    #160 <Method int AppboyLogger.d(String, String)>
	//    7   19:pop             
			return false;
	//    8   20:iconst_0        
	//    9   21:ireturn         
		}
		if(!PermissionUtils.hasPermission(context, "android.permission.ACCESS_FINE_LOCATION"))
	//*  10   22:aload_1         
	//*  11   23:ldc2            #350 <String "android.permission.ACCESS_FINE_LOCATION">
	//*  12   26:invokestatic    #356 <Method boolean PermissionUtils.hasPermission(Context, String)>
	//*  13   29:ifne            44
		{
			AppboyLogger.i(j, "Fine grained location permissions not found. Geofences not enabled.");
	//   14   32:getstatic       #44  <Field String j>
	//   15   35:ldc2            #358 <String "Fine grained location permissions not found. Geofences not enabled.">
	//   16   38:invokestatic    #246 <Method int AppboyLogger.i(String, String)>
	//   17   41:pop             
			return false;
	//   18   42:iconst_0        
	//   19   43:ireturn         
		}
		if(!eg.a(context))
	//*  20   44:aload_1         
	//*  21   45:invokestatic    #361 <Method boolean eg.a(Context)>
	//*  22   48:ifne            63
		{
			AppboyLogger.d(j, "Google Play Services not available. Geofences not enabled.");
	//   23   51:getstatic       #44  <Field String j>
	//   24   54:ldc2            #363 <String "Google Play Services not available. Geofences not enabled.">
	//   25   57:invokestatic    #160 <Method int AppboyLogger.d(String, String)>
	//   26   60:pop             
			return false;
	//   27   61:iconst_0        
	//   28   62:ireturn         
		}
		context = ((Context) (((Class) (bo/app/bl)).getClassLoader()));
	//   29   63:ldc1            #2   <Class bl>
	//   30   65:invokevirtual   #369 <Method ClassLoader Class.getClassLoader()>
	//   31   68:astore_1        
		if(Class.forName("com.google.android.gms.location.LocationServices", false, ((ClassLoader) (context))) != null)
	//*  32   69:ldc2            #371 <String "com.google.android.gms.location.LocationServices">
	//*  33   72:iconst_0        
	//*  34   73:aload_1         
	//*  35   74:invokestatic    #375 <Method Class Class.forName(String, boolean, ClassLoader)>
	//*  36   77:ifnull          82
			return true;
	//   37   80:iconst_1        
	//   38   81:ireturn         
		try
		{
			throw new RuntimeException("com.google.android.gms.location.LocationServices not found.");
	//   39   82:new             #377 <Class RuntimeException>
	//   40   85:dup             
	//   41   86:ldc2            #379 <String "com.google.android.gms.location.LocationServices not found.">
	//   42   89:invokespecial   #382 <Method void RuntimeException(String)>
	//   43   92:athrow          
		}
	//*  44   93:getstatic       #44  <Field String j>
	//*  45   96:ldc2            #384 <String "Google Play Services Location API not found. Geofences not enabled.">
	//*  46   99:invokestatic    #160 <Method int AppboyLogger.d(String, String)>
	//*  47  102:pop             
	//*  48  103:iconst_0        
	//*  49  104:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			AppboyLogger.d(j, "Google Play Services Location API not found. Geofences not enabled.");
		}
		return false;
	//*  50  105:astore_1        
	//*  51  106:goto            93
	}

	boolean a(String s, x x1)
	{
		Object obj = n;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Object n>
	//    2    4:astore          4
		obj;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		s = ((String) (a(s)));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #387 <Method AppboyGeofence a(String)>
	//    8   14:astore_1        
		if(s == null)
			break MISSING_BLOCK_LABEL_59;
	//    9   15:aload_1         
	//   10   16:ifnull          59
		boolean flag;
		if(!x1.equals(((Object) (x.a))))
			break MISSING_BLOCK_LABEL_39;
	//   11   19:aload_2         
	//   12   20:getstatic       #392 <Field x x.a>
	//   13   23:invokevirtual   #393 <Method boolean x.equals(Object)>
	//   14   26:ifeq            39
		flag = ((AppboyGeofence) (s)).getAnalyticsEnabledEnter();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #396 <Method boolean AppboyGeofence.getAnalyticsEnabledEnter()>
	//   17   33:istore_3        
		obj;
	//   18   34:aload           4
		JVM INSTR monitorexit ;
	//   19   36:monitorexit     
		return flag;
	//   20   37:iload_3         
	//   21   38:ireturn         
		if(!x1.equals(((Object) (x.b))))
			break MISSING_BLOCK_LABEL_59;
	//   22   39:aload_2         
	//   23   40:getstatic       #398 <Field x x.b>
	//   24   43:invokevirtual   #393 <Method boolean x.equals(Object)>
	//   25   46:ifeq            59
		flag = ((AppboyGeofence) (s)).getAnalyticsEnabledExit();
	//   26   49:aload_1         
	//   27   50:invokevirtual   #401 <Method boolean AppboyGeofence.getAnalyticsEnabledExit()>
	//   28   53:istore_3        
	//*  29   54:aload           4
	//*  30   56:monitorexit     
		return flag;
	//   31   57:iload_3         
	//   32   58:ireturn         
		obj;
	//   33   59:aload           4
		JVM INSTR monitorexit ;
	//   34   61:monitorexit     
		return false;
	//   35   62:iconst_0        
	//   36   63:ireturn         
		s;
	//   37   64:astore_1        
		obj;
	//   38   65:aload           4
		JVM INSTR monitorexit ;
	//   39   67:monitorexit     
		throw s;
	//   40   68:aload_1         
	//   41   69:athrow          
	}

	public void b()
	{
		if(!h)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field boolean h>
	//*   2    4:ifne            18
		{
			AppboyLogger.d(j, "Appboy geofences not enabled. Not un-registering geofences.");
	//    3    7:getstatic       #44  <Field String j>
	//    4   10:ldc2            #403 <String "Appboy geofences not enabled. Not un-registering geofences.">
	//    5   13:invokestatic    #160 <Method int AppboyLogger.d(String, String)>
	//    6   16:pop             
			return;
	//    7   17:return          
		} else
		{
			AppboyLogger.d(j, "Tearing down all geofences.");
	//    8   18:getstatic       #44  <Field String j>
	//    9   21:ldc2            #405 <String "Tearing down all geofences.">
	//   10   24:invokestatic    #160 <Method int AppboyLogger.d(String, String)>
	//   11   27:pop             
			a(d);
	//   12   28:aload_0         
	//   13   29:aload_0         
	//   14   30:getfield        #99  <Field PendingIntent d>
	//   15   33:invokevirtual   #248 <Method void a(PendingIntent)>
			return;
	//   16   36:return          
		}
	}

	protected void b(PendingIntent pendingintent)
	{
		ef.a(k, pendingintent);
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field Context k>
	//    2    4:aload_1         
	//    3    5:invokestatic    #408 <Method void ef.a(Context, PendingIntent)>
	//    4    8:return          
	}

	public void b(String s, x x1)
	{
		if(!h)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field boolean h>
	//*   2    4:ifne            18
		{
			AppboyLogger.w(j, "Appboy geofences not enabled. Not posting geofence report.");
	//    3    7:getstatic       #44  <Field String j>
	//    4   10:ldc2            #411 <String "Appboy geofences not enabled. Not posting geofence report.">
	//    5   13:invokestatic    #229 <Method int AppboyLogger.w(String, String)>
	//    6   16:pop             
			return;
	//    7   17:return          
		}
		try
		{
			ci ci1 = ci.d(s, x1.toString().toLowerCase(Locale.US));
	//    8   18:aload_1         
	//    9   19:aload_2         
	//   10   20:invokevirtual   #412 <Method String x.toString()>
	//   11   23:getstatic       #418 <Field Locale Locale.US>
	//   12   26:invokevirtual   #422 <Method String String.toLowerCase(Locale)>
	//   13   29:invokestatic    #427 <Method ci ci.d(String, String)>
	//   14   32:astore_3        
			if(a(s, x1))
	//*  15   33:aload_0         
	//*  16   34:aload_1         
	//*  17   35:aload_2         
	//*  18   36:invokevirtual   #429 <Method boolean a(String, x)>
	//*  19   39:ifeq            53
				a.a(((cc) (ci1)));
	//   20   42:aload_0         
	//   21   43:getfield        #63  <Field bt a>
	//   22   46:aload_3         
	//   23   47:invokeinterface #432 <Method boolean bt.a(cc)>
	//   24   52:pop             
			if(f.a(eb.a(), a(s), x1))
	//*  25   53:aload_0         
	//*  26   54:getfield        #110 <Field bm f>
	//*  27   57:invokestatic    #437 <Method long eb.a()>
	//*  28   60:aload_0         
	//*  29   61:aload_1         
	//*  30   62:invokevirtual   #387 <Method AppboyGeofence a(String)>
	//*  31   65:aload_2         
	//*  32   66:invokevirtual   #440 <Method boolean bm.a(long, AppboyGeofence, x)>
	//*  33   69:ifeq            95
			{
				a.b(((cc) (ci1)));
	//   34   72:aload_0         
	//   35   73:getfield        #63  <Field bt a>
	//   36   76:aload_3         
	//   37   77:invokeinterface #443 <Method void bt.b(cc)>
				return;
	//   38   82:return          
			}
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  39   83:astore_1        
		{
			AppboyLogger.w(j, "Failed to record geofence transition.", ((Throwable) (s)));
	//   40   84:getstatic       #44  <Field String j>
	//   41   87:ldc2            #445 <String "Failed to record geofence transition.">
	//   42   90:aload_1         
	//   43   91:invokestatic    #448 <Method int AppboyLogger.w(String, String, Throwable)>
	//   44   94:pop             
		}
	//   45   95:return          
	}

	public void b(boolean flag)
	{
		if(!h)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field boolean h>
	//*   2    4:ifne            17
		{
			AppboyLogger.d(j, "Appboy geofences not enabled. Not requesting geofences.");
	//    3    7:getstatic       #44  <Field String j>
	//    4   10:ldc1            #200 <String "Appboy geofences not enabled. Not requesting geofences.">
	//    5   12:invokestatic    #160 <Method int AppboyLogger.d(String, String)>
	//    6   15:pop             
			return;
	//    7   16:return          
		}
		if(f.a(flag, eb.a()))
	//*   8   17:aload_0         
	//*   9   18:getfield        #110 <Field bm f>
	//*  10   21:iload_1         
	//*  11   22:invokestatic    #437 <Method long eb.a()>
	//*  12   25:invokevirtual   #451 <Method boolean bm.a(boolean, long)>
	//*  13   28:ifeq            39
			b(e);
	//   14   31:aload_0         
	//   15   32:aload_0         
	//   16   33:getfield        #103 <Field PendingIntent e>
	//   17   36:invokevirtual   #453 <Method void b(PendingIntent)>
	//   18   39:return          
	}

	private static final String j = AppboyLogger.getAppboyLogTag(bo/app/bl);
	final bt a;
	final SharedPreferences b;
	final List c;
	final PendingIntent d;
	final PendingIntent e;
	bm f;
	cd g;
	boolean h;
	int i;
	private final Context k;
	private final AppboyConfigurationProvider l;
	private final dx m;
	private final Object n = new Object();

	static 
	{
	//    0    0:ldc1            #2   <Class bl>
	//    1    2:invokestatic    #42  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #44  <Field String j>
	//*   3    8:return          
	}
}
