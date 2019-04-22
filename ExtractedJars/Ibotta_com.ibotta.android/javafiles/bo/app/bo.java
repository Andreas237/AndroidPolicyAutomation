// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.app.Activity;
import android.os.Handler;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.models.outgoing.Feedback;
import com.appboy.support.*;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			bt, eh, ci, dw, 
//			bq, cf, bp, cw, 
//			t, cz, dx, cl, 
//			cm, cx, dh, at, 
//			ad, bu, cy, di, 
//			cc, ek, w, bk, 
//			da, as, cd, db, 
//			et, fr, cg

public class bo
	implements bt
{

	public bo(bq bq1, t t1, ad ad1, bu bu1, AppboyConfigurationProvider appboyconfigurationprovider, dx dx1, bk bk1, 
			String s1, boolean flag, bp bp1, dw dw1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void Object()>
		b = new AtomicInteger(0);
	//    2    4:aload_0         
	//    3    5:new             #60  <Class AtomicInteger>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:invokespecial   #63  <Method void AtomicInteger(int)>
	//    7   13:putfield        #65  <Field AtomicInteger b>
		c = new AtomicInteger(0);
	//    8   16:aload_0         
	//    9   17:new             #60  <Class AtomicInteger>
	//   10   20:dup             
	//   11   21:iconst_0        
	//   12   22:invokespecial   #63  <Method void AtomicInteger(int)>
	//   13   25:putfield        #67  <Field AtomicInteger c>
		d = "";
	//   14   28:aload_0         
	//   15   29:ldc1            #69  <String "">
	//   16   31:putfield        #71  <Field String d>
	//   17   34:aload_0         
	//   18   35:new             #4   <Class Object>
	//   19   38:dup             
	//   20   39:invokespecial   #58  <Method void Object()>
	//   21   42:putfield        #73  <Field Object e>
	//   22   45:aload_0         
	//   23   46:new             #4   <Class Object>
	//   24   49:dup             
	//   25   50:invokespecial   #58  <Method void Object()>
	//   26   53:putfield        #75  <Field Object f>
		r = false;
	//   27   56:aload_0         
	//   28   57:iconst_0        
	//   29   58:putfield        #77  <Field boolean r>
		s = null;
	//   30   61:aload_0         
	//   31   62:aconst_null     
	//   32   63:putfield        #79  <Field Class s>
		g = bq1;
	//   33   66:aload_0         
	//   34   67:aload_1         
	//   35   68:putfield        #81  <Field bq g>
		i = t1;
	//   36   71:aload_0         
	//   37   72:aload_2         
	//   38   73:putfield        #83  <Field t i>
		j = ad1;
	//   39   76:aload_0         
	//   40   77:aload_3         
	//   41   78:putfield        #85  <Field ad j>
		k = bu1;
	//   42   81:aload_0         
	//   43   82:aload           4
	//   44   84:putfield        #87  <Field bu k>
		l = appboyconfigurationprovider;
	//   45   87:aload_0         
	//   46   88:aload           5
	//   47   90:putfield        #89  <Field AppboyConfigurationProvider l>
		r = flag;
	//   48   93:aload_0         
	//   49   94:iload           9
	//   50   96:putfield        #77  <Field boolean r>
		o = s1;
	//   51   99:aload_0         
	//   52  100:aload           8
	//   53  102:putfield        #91  <Field String o>
		m = dx1;
	//   54  105:aload_0         
	//   55  106:aload           6
	//   56  108:putfield        #93  <Field dx m>
		n = bk1;
	//   57  111:aload_0         
	//   58  112:aload           7
	//   59  114:putfield        #95  <Field bk n>
		h = bp1;
	//   60  117:aload_0         
	//   61  118:aload           10
	//   62  120:putfield        #97  <Field bp h>
		p = dw1;
	//   63  123:aload_0         
	//   64  124:aload           11
	//   65  126:putfield        #99  <Field dw p>
	//   66  129:aload_0         
	//   67  130:invokestatic    #104 <Method Handler eh.a()>
	//   68  133:putfield        #106 <Field Handler q>
	//   69  136:return          
	}

	private void a(Throwable throwable, boolean flag)
	{
		try
		{
			if(c(throwable))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #114 <Method boolean c(Throwable)>
	//*   3    5:ifeq            47
			{
				String s1 = a;
	//    4    8:getstatic       #53  <Field String a>
	//    5   11:astore_3        
				StringBuilder stringbuilder = new StringBuilder();
	//    6   12:new             #116 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #117 <Method void StringBuilder()>
	//    9   19:astore          4
				stringbuilder.append("Not logging duplicate error: ");
	//   10   21:aload           4
	//   11   23:ldc1            #119 <String "Not logging duplicate error: ">
	//   12   25:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   13   28:pop             
				stringbuilder.append(((Object) (throwable)));
	//   14   29:aload           4
	//   15   31:aload_1         
	//   16   32:invokevirtual   #126 <Method StringBuilder StringBuilder.append(Object)>
	//   17   35:pop             
				AppboyLogger.w(s1, stringbuilder.toString());
	//   18   36:aload_3         
	//   19   37:aload           4
	//   20   39:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   21   42:invokestatic    #134 <Method int AppboyLogger.w(String, String)>
	//   22   45:pop             
				return;
	//   23   46:return          
			}
		}
	//*  24   47:aload_0         
	//*  25   48:aload_1         
	//*  26   49:aload_0         
	//*  27   50:invokevirtual   #137 <Method cg b()>
	//*  28   53:iload_2         
	//*  29   54:invokestatic    #142 <Method ci ci.a(Throwable, cg, boolean)>
	//*  30   57:invokevirtual   #145 <Method boolean a(cc)>
	//*  31   60:pop             
	//*  32   61:return          
	//*  33   62:astore_1        
	//*  34   63:getstatic       #53  <Field String a>
	//*  35   66:ldc1            #147 <String "Failed to log error.">
	//*  36   68:aload_1         
	//*  37   69:invokestatic    #150 <Method int AppboyLogger.e(String, String, Throwable)>
	//*  38   72:pop             
	//*  39   73:return          
		catch(JSONException jsonexception)
	//*  40   74:astore_3        
		{
			String s2 = a;
	//   41   75:getstatic       #53  <Field String a>
	//   42   78:astore          4
			StringBuilder stringbuilder1 = new StringBuilder();
	//   43   80:new             #116 <Class StringBuilder>
	//   44   83:dup             
	//   45   84:invokespecial   #117 <Method void StringBuilder()>
	//   46   87:astore          5
			stringbuilder1.append("Failed to create error event from ");
	//   47   89:aload           5
	//   48   91:ldc1            #152 <String "Failed to create error event from ">
	//   49   93:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   50   96:pop             
			stringbuilder1.append(((Object) (throwable)));
	//   51   97:aload           5
	//   52   99:aload_1         
	//   53  100:invokevirtual   #126 <Method StringBuilder StringBuilder.append(Object)>
	//   54  103:pop             
			AppboyLogger.e(s2, stringbuilder1.toString(), ((Throwable) (jsonexception)));
	//   55  104:aload           4
	//   56  106:aload           5
	//   57  108:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   58  111:aload_3         
	//   59  112:invokestatic    #150 <Method int AppboyLogger.e(String, String, Throwable)>
	//   60  115:pop             
			return;
	//   61  116:return          
		}
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			AppboyLogger.e(a, "Failed to log error.", throwable);
			return;
		}
		a(((cc) (ci.a(throwable, b(), flag))));
		return;
	}

	private boolean c(Throwable throwable)
	{
label0:
		{
			synchronized(f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field Object f>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				b.getAndIncrement();
	//    5    7:aload_0         
	//    6    8:getfield        #65  <Field AtomicInteger b>
	//    7   11:invokevirtual   #156 <Method int AtomicInteger.getAndIncrement()>
	//    8   14:pop             
				if(!d.equals(((Object) (throwable.getMessage()))) || c.get() <= 3 || b.get() >= 100)
					break label0;
	//    9   15:aload_0         
	//   10   16:getfield        #71  <Field String d>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #161 <Method String Throwable.getMessage()>
	//   13   23:invokevirtual   #167 <Method boolean String.equals(Object)>
	//   14   26:ifeq            56
	//   15   29:aload_0         
	//   16   30:getfield        #67  <Field AtomicInteger c>
	//   17   33:invokevirtual   #170 <Method int AtomicInteger.get()>
	//   18   36:iconst_3        
	//   19   37:icmple          56
	//   20   40:aload_0         
	//   21   41:getfield        #65  <Field AtomicInteger b>
	//   22   44:invokevirtual   #170 <Method int AtomicInteger.get()>
	//   23   47:bipush          100
	//   24   49:icmpge          56
			}
	//   25   52:aload_2         
	//   26   53:monitorexit     
			return true;
	//   27   54:iconst_1        
	//   28   55:ireturn         
		}
		if(d.equals(((Object) (throwable.getMessage()))))
	//*  29   56:aload_0         
	//*  30   57:getfield        #71  <Field String d>
	//*  31   60:aload_1         
	//*  32   61:invokevirtual   #161 <Method String Throwable.getMessage()>
	//*  33   64:invokevirtual   #167 <Method boolean String.equals(Object)>
	//*  34   67:ifeq            81
		{
			c.getAndIncrement();
	//   35   70:aload_0         
	//   36   71:getfield        #67  <Field AtomicInteger c>
	//   37   74:invokevirtual   #156 <Method int AtomicInteger.getAndIncrement()>
	//   38   77:pop             
			break MISSING_BLOCK_LABEL_89;
	//   39   78:goto            89
		}
		c.set(0);
	//   40   81:aload_0         
	//   41   82:getfield        #67  <Field AtomicInteger c>
	//   42   85:iconst_0        
	//   43   86:invokevirtual   #173 <Method void AtomicInteger.set(int)>
		if(b.get() >= 100)
	//*  44   89:aload_0         
	//*  45   90:getfield        #65  <Field AtomicInteger b>
	//*  46   93:invokevirtual   #170 <Method int AtomicInteger.get()>
	//*  47   96:bipush          100
	//*  48   98:icmplt          109
			b.set(0);
	//   49  101:aload_0         
	//   50  102:getfield        #65  <Field AtomicInteger b>
	//   51  105:iconst_0        
	//   52  106:invokevirtual   #173 <Method void AtomicInteger.set(int)>
		d = throwable.getMessage();
	//   53  109:aload_0         
	//   54  110:aload_1         
	//   55  111:invokevirtual   #161 <Method String Throwable.getMessage()>
	//   56  114:putfield        #71  <Field String d>
		obj;
	//   57  117:aload_2         
		JVM INSTR monitorexit ;
	//   58  118:monitorexit     
		return false;
	//   59  119:iconst_0        
	//   60  120:ireturn         
		throwable;
	//   61  121:astore_1        
		obj;
	//   62  122:aload_2         
		JVM INSTR monitorexit ;
	//   63  123:monitorexit     
		throw throwable;
	//   64  124:aload_1         
	//   65  125:athrow          
	}

	public cf a()
	{
		if(p.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field dw p>
	//*   2    4:invokevirtual   #179 <Method boolean dw.a()>
	//*   3    7:ifeq            21
		{
			AppboyLogger.w(a, "SDK is disabled. Returning null session.");
	//    4   10:getstatic       #53  <Field String a>
	//    5   13:ldc1            #181 <String "SDK is disabled. Returning null session.">
	//    6   15:invokestatic    #134 <Method int AppboyLogger.w(String, String)>
	//    7   18:pop             
			return null;
	//    8   19:aconst_null     
	//    9   20:areturn         
		} else
		{
			cf cf1 = g.a();
	//   10   21:aload_0         
	//   11   22:getfield        #81  <Field bq g>
	//   12   25:invokevirtual   #185 <Method cf bq.a()>
	//   13   28:astore_1        
			String s1 = a;
	//   14   29:getstatic       #53  <Field String a>
	//   15   32:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   16   33:new             #116 <Class StringBuilder>
	//   17   36:dup             
	//   18   37:invokespecial   #117 <Method void StringBuilder()>
	//   19   40:astore_3        
			stringbuilder.append("Completed the openSession call. Starting or continuing session ");
	//   20   41:aload_3         
	//   21   42:ldc1            #187 <String "Completed the openSession call. Starting or continuing session ">
	//   22   44:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
			stringbuilder.append(((Object) (cf1.a())));
	//   24   48:aload_3         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #191 <Method cg cf.a()>
	//   27   53:invokevirtual   #126 <Method StringBuilder StringBuilder.append(Object)>
	//   28   56:pop             
			AppboyLogger.i(s1, stringbuilder.toString());
	//   29   57:aload_2         
	//   30   58:aload_3         
	//   31   59:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   32   62:invokestatic    #193 <Method int AppboyLogger.i(String, String)>
	//   33   65:pop             
			return cf1;
	//   34   66:aload_1         
	//   35   67:areturn         
		}
	}

	public cf a(Activity activity)
	{
		if(p.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field dw p>
	//*   2    4:invokevirtual   #179 <Method boolean dw.a()>
	//*   3    7:ifeq            21
		{
			AppboyLogger.w(a, "SDK is disabled. Returning null session.");
	//    4   10:getstatic       #53  <Field String a>
	//    5   13:ldc1            #181 <String "SDK is disabled. Returning null session.">
	//    6   15:invokestatic    #134 <Method int AppboyLogger.w(String, String)>
	//    7   18:pop             
			return null;
	//    8   19:aconst_null     
	//    9   20:areturn         
		} else
		{
			cf cf1 = a();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #196 <Method cf a()>
	//   12   25:astore_2        
			s = ((Object) (activity)).getClass();
	//   13   26:aload_0         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #200 <Method Class Object.getClass()>
	//   16   31:putfield        #79  <Field Class s>
			h.a();
	//   17   34:aload_0         
	//   18   35:getfield        #97  <Field bp h>
	//   19   38:invokevirtual   #204 <Method void bp.a()>
			String s1 = a;
	//   20   41:getstatic       #53  <Field String a>
	//   21   44:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   22   45:new             #116 <Class StringBuilder>
	//   23   48:dup             
	//   24   49:invokespecial   #117 <Method void StringBuilder()>
	//   25   52:astore          4
			stringbuilder.append("Opened session with activity: ");
	//   26   54:aload           4
	//   27   56:ldc1            #206 <String "Opened session with activity: ">
	//   28   58:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   29   61:pop             
			stringbuilder.append(activity.getLocalClassName());
	//   30   62:aload           4
	//   31   64:aload_1         
	//   32   65:invokevirtual   #211 <Method String Activity.getLocalClassName()>
	//   33   68:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   34   71:pop             
			AppboyLogger.v(s1, stringbuilder.toString());
	//   35   72:aload_3         
	//   36   73:aload           4
	//   37   75:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   38   78:invokestatic    #214 <Method int AppboyLogger.v(String, String)>
	//   39   81:pop             
			return cf1;
	//   40   82:aload_2         
	//   41   83:areturn         
		}
	}

	public void a(long l1, long l2)
	{
		i.a(((db) (new cw(l.getBaseUrlForRequests(), l1, l2, o))));
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field t i>
	//    2    4:new             #218 <Class cw>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #89  <Field AppboyConfigurationProvider l>
	//    6   12:invokevirtual   #223 <Method String AppboyConfigurationProvider.getBaseUrlForRequests()>
	//    7   15:lload_1         
	//    8   16:lload_3         
	//    9   17:aload_0         
	//   10   18:getfield        #91  <Field String o>
	//   11   21:invokespecial   #226 <Method void cw(String, long, long, String)>
	//   12   24:invokeinterface #231 <Method void t.a(db)>
	//   13   29:return          
	}

	public void a(cd cd)
	{
		AppboyLogger.d(a, "Posting geofence request for location.");
	//    0    0:getstatic       #53  <Field String a>
	//    1    3:ldc1            #234 <String "Posting geofence request for location.">
	//    2    5:invokestatic    #236 <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		a(((db) (new cz(l.getBaseUrlForRequests(), cd))));
	//    4    9:aload_0         
	//    5   10:new             #238 <Class cz>
	//    6   13:dup             
	//    7   14:aload_0         
	//    8   15:getfield        #89  <Field AppboyConfigurationProvider l>
	//    9   18:invokevirtual   #223 <Method String AppboyConfigurationProvider.getBaseUrlForRequests()>
	//   10   21:aload_1         
	//   11   22:invokespecial   #241 <Method void cz(String, cd)>
	//   12   25:invokevirtual   #242 <Method void a(db)>
	//   13   28:return          
	}

	public void a(cm.a a1)
	{
		if(a1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			AppboyLogger.d(a, "Cannot request data sync with null respond with object");
	//    2    4:getstatic       #53  <Field String a>
	//    3    7:ldc1            #245 <String "Cannot request data sync with null respond with object">
	//    4    9:invokestatic    #236 <Method int AppboyLogger.d(String, String)>
	//    5   12:pop             
			return;
	//    6   13:return          
		}
		dx dx1 = m;
	//    7   14:aload_0         
	//    8   15:getfield        #93  <Field dx m>
	//    9   18:astore_2        
		if(dx1 != null && dx1.l())
	//*  10   19:aload_2         
	//*  11   20:ifnull          49
	//*  12   23:aload_2         
	//*  13   24:invokevirtual   #249 <Method boolean dx.l()>
	//*  14   27:ifeq            49
			a1.a(new cl(m.g()));
	//   15   30:aload_1         
	//   16   31:new             #251 <Class cl>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:getfield        #93  <Field dx m>
	//   20   39:invokevirtual   #254 <Method long dx.g()>
	//   21   42:invokespecial   #257 <Method void cl(long)>
	//   22   45:invokevirtual   #262 <Method cm$a cm$a.a(cl)>
	//   23   48:pop             
		a1.a(e());
	//   24   49:aload_1         
	//   25   50:aload_0         
	//   26   51:invokevirtual   #264 <Method String e()>
	//   27   54:invokevirtual   #267 <Method cm$a cm$a.a(String)>
	//   28   57:pop             
		a1 = ((cm.a) (a1.c()));
	//   29   58:aload_1         
	//   30   59:invokevirtual   #270 <Method cm cm$a.c()>
	//   31   62:astore_1        
		if(((cm) (a1)).c() && (((cm) (a1)).d() || ((cm) (a1)).e()))
	//*  32   63:aload_1         
	//*  33   64:invokevirtual   #274 <Method boolean cm.c()>
	//*  34   67:ifeq            92
	//*  35   70:aload_1         
	//*  36   71:invokevirtual   #276 <Method boolean cm.d()>
	//*  37   74:ifne            84
	//*  38   77:aload_1         
	//*  39   78:invokevirtual   #278 <Method boolean cm.e()>
	//*  40   81:ifeq            92
			m.a(false);
	//   41   84:aload_0         
	//   42   85:getfield        #93  <Field dx m>
	//   43   88:iconst_0        
	//   44   89:invokevirtual   #281 <Method void dx.a(boolean)>
		a(((db) (new cx(l.getBaseUrlForRequests(), ((cm) (a1))))));
	//   45   92:aload_0         
	//   46   93:new             #283 <Class cx>
	//   47   96:dup             
	//   48   97:aload_0         
	//   49   98:getfield        #89  <Field AppboyConfigurationProvider l>
	//   50  101:invokevirtual   #223 <Method String AppboyConfigurationProvider.getBaseUrlForRequests()>
	//   51  104:aload_1         
	//   52  105:invokespecial   #286 <Method void cx(String, cm)>
	//   53  108:invokevirtual   #242 <Method void a(db)>
	//   54  111:return          
	}

	public void a(db db)
	{
		if(p.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field dw p>
	//*   2    4:invokevirtual   #179 <Method boolean dw.a()>
	//*   3    7:ifeq            21
		{
			AppboyLogger.w(a, "SDK is disabled. Not adding request to dispatch.");
	//    4   10:getstatic       #53  <Field String a>
	//    5   13:ldc2            #288 <String "SDK is disabled. Not adding request to dispatch.">
	//    6   16:invokestatic    #134 <Method int AppboyLogger.w(String, String)>
	//    7   19:pop             
			return;
	//    8   20:return          
		} else
		{
			i.a(db);
	//    9   21:aload_0         
	//   10   22:getfield        #83  <Field t i>
	//   11   25:aload_1         
	//   12   26:invokeinterface #231 <Method void t.a(db)>
			return;
	//   13   31:return          
		}
	}

	public void a(et et, fr fr)
	{
		a(((db) (new dh(l.getBaseUrlForRequests(), et, fr, ((bt) (this)), e()))));
	//    0    0:aload_0         
	//    1    1:new             #291 <Class dh>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #89  <Field AppboyConfigurationProvider l>
	//    5    9:invokevirtual   #223 <Method String AppboyConfigurationProvider.getBaseUrlForRequests()>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #264 <Method String e()>
	//   11   19:invokespecial   #294 <Method void dh(String, et, fr, bt, String)>
	//   12   22:invokevirtual   #242 <Method void a(db)>
	//   13   25:return          
	}

	public void a(fr fr)
	{
		j.a(((Object) (new at(fr))), bo/app/at);
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ad j>
	//    2    4:new             #297 <Class at>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #299 <Method void at(fr)>
	//    6   12:ldc2            #297 <Class at>
	//    7   15:invokeinterface #304 <Method void ad.a(Object, Class)>
	//    8   20:return          
	}

	public void a(String s1, String s2, boolean flag)
	{
		if(s1 != null && ValidationUtils.isValidEmailAddress(s1))
	//*   0    0:aload_1         
	//*   1    1:ifnull          73
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #311 <Method boolean ValidationUtils.isValidEmailAddress(String)>
	//*   4    8:ifeq            73
		{
			if(!StringUtils.isNullOrBlank(s2))
	//*   5   11:aload_2         
	//*   6   12:invokestatic    #316 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   7   15:ifne            62
			{
				s1 = ((String) (new Feedback(s2, s1, flag, k.a(), e())));
	//    8   18:new             #318 <Class Feedback>
	//    9   21:dup             
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:iload_3         
	//   13   25:aload_0         
	//   14   26:getfield        #87  <Field bu k>
	//   15   29:invokeinterface #323 <Method ck bu.a()>
	//   16   34:aload_0         
	//   17   35:invokevirtual   #264 <Method String e()>
	//   18   38:invokespecial   #326 <Method void Feedback(String, String, boolean, ck, String)>
	//   19   41:astore_1        
				a(((db) (new cy(l.getBaseUrlForRequests(), ((Feedback) (s1))))));
	//   20   42:aload_0         
	//   21   43:new             #328 <Class cy>
	//   22   46:dup             
	//   23   47:aload_0         
	//   24   48:getfield        #89  <Field AppboyConfigurationProvider l>
	//   25   51:invokevirtual   #223 <Method String AppboyConfigurationProvider.getBaseUrlForRequests()>
	//   26   54:aload_1         
	//   27   55:invokespecial   #331 <Method void cy(String, Feedback)>
	//   28   58:invokevirtual   #242 <Method void a(db)>
				return;
	//   29   61:return          
			} else
			{
				throw new IllegalArgumentException("Feedback message cannot be null or blank");
	//   30   62:new             #333 <Class IllegalArgumentException>
	//   31   65:dup             
	//   32   66:ldc2            #335 <String "Feedback message cannot be null or blank">
	//   33   69:invokespecial   #338 <Method void IllegalArgumentException(String)>
	//   34   72:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("Reply to email address is invalid");
	//   35   73:new             #333 <Class IllegalArgumentException>
	//   36   76:dup             
	//   37   77:ldc2            #340 <String "Reply to email address is invalid">
	//   38   80:invokespecial   #338 <Method void IllegalArgumentException(String)>
	//   39   83:athrow          
		}
	}

	public void a(Throwable throwable)
	{
		a(throwable, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #343 <Method void a(Throwable, boolean)>
	//    4    6:return          
	}

	public void a(List list, long l1)
	{
		a(((db) (new di(l.getBaseUrlForRequests(), list, l1, o))));
	//    0    0:aload_0         
	//    1    1:new             #346 <Class di>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #89  <Field AppboyConfigurationProvider l>
	//    5    9:invokevirtual   #223 <Method String AppboyConfigurationProvider.getBaseUrlForRequests()>
	//    6   12:aload_1         
	//    7   13:lload_2         
	//    8   14:aload_0         
	//    9   15:getfield        #91  <Field String o>
	//   10   18:invokespecial   #349 <Method void di(String, List, long, String)>
	//   11   21:invokevirtual   #242 <Method void a(db)>
	//   12   24:return          
	}

	public void a(boolean flag)
	{
		r = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #77  <Field boolean r>
	//    3    5:return          
	}

	public boolean a(cc cc1)
	{
		boolean flag;
		boolean flag1 = p.a();
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field dw p>
	//    2    4:invokevirtual   #179 <Method boolean dw.a()>
	//    3    7:istore_3        
		flag = false;
	//    4    8:iconst_0        
	//    5    9:istore_2        
		if(flag1)
	//*   6   10:iload_3         
	//*   7   11:ifeq            57
		{
			String s1 = a;
	//    8   14:getstatic       #53  <Field String a>
	//    9   17:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   10   19:new             #116 <Class StringBuilder>
	//   11   22:dup             
	//   12   23:invokespecial   #117 <Method void StringBuilder()>
	//   13   26:astore          5
			stringbuilder.append("SDK is disabled. Not logging event: ");
	//   14   28:aload           5
	//   15   30:ldc2            #353 <String "SDK is disabled. Not logging event: ">
	//   16   33:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   17   36:pop             
			stringbuilder.append(((Object) (cc1)));
	//   18   37:aload           5
	//   19   39:aload_1         
	//   20   40:invokevirtual   #126 <Method StringBuilder StringBuilder.append(Object)>
	//   21   43:pop             
			AppboyLogger.w(s1, stringbuilder.toString());
	//   22   44:aload           4
	//   23   46:aload           5
	//   24   48:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   25   51:invokestatic    #134 <Method int AppboyLogger.w(String, String)>
	//   26   54:pop             
			return false;
	//   27   55:iconst_0        
	//   28   56:ireturn         
		}
		Object obj = e;
	//   29   57:aload_0         
	//   30   58:getfield        #73  <Field Object e>
	//   31   61:astore          4
		obj;
	//   32   63:aload           4
		JVM INSTR monitorenter ;
	//   33   65:monitorenter    
		if(cc1 == null)
			break MISSING_BLOCK_LABEL_450;
	//   34   66:aload_1         
	//   35   67:ifnull          450
		if(g.d() || g.c() == null)
			break MISSING_BLOCK_LABEL_108;
	//   36   70:aload_0         
	//   37   71:getfield        #81  <Field bq g>
	//   38   74:invokevirtual   #354 <Method boolean bq.d()>
	//   39   77:ifne            108
	//   40   80:aload_0         
	//   41   81:getfield        #81  <Field bq g>
	//   42   84:invokevirtual   #356 <Method cg bq.c()>
	//   43   87:ifnull          108
		cc1.a(g.c());
	//   44   90:aload_1         
	//   45   91:aload_0         
	//   46   92:getfield        #81  <Field bq g>
	//   47   95:invokevirtual   #356 <Method cg bq.c()>
	//   48   98:invokeinterface #361 <Method void cc.a(cg)>
		flag = true;
	//   49  103:iconst_1        
	//   50  104:istore_2        
		break MISSING_BLOCK_LABEL_160;
	//   51  105:goto            160
		String s2 = a;
	//   52  108:getstatic       #53  <Field String a>
	//   53  111:astore          5
		StringBuilder stringbuilder1 = new StringBuilder();
	//   54  113:new             #116 <Class StringBuilder>
	//   55  116:dup             
	//   56  117:invokespecial   #117 <Method void StringBuilder()>
	//   57  120:astore          6
		stringbuilder1.append("Not adding session id to event: ");
	//   58  122:aload           6
	//   59  124:ldc2            #363 <String "Not adding session id to event: ">
	//   60  127:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   61  130:pop             
		stringbuilder1.append(ek.a((JSONObject)cc1.forJsonPut()));
	//   62  131:aload           6
	//   63  133:aload_1         
	//   64  134:invokeinterface #367 <Method Object cc.forJsonPut()>
	//   65  139:checkcast       #369 <Class JSONObject>
	//   66  142:invokestatic    #374 <Method String ek.a(JSONObject)>
	//   67  145:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   68  148:pop             
		AppboyLogger.d(s2, stringbuilder1.toString());
	//   69  149:aload           5
	//   70  151:aload           6
	//   71  153:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   72  156:invokestatic    #236 <Method int AppboyLogger.d(String, String)>
	//   73  159:pop             
		if(!StringUtils.isNullOrEmpty(e()))
	//*  74  160:aload_0         
	//*  75  161:invokevirtual   #264 <Method String e()>
	//*  76  164:invokestatic    #377 <Method boolean StringUtils.isNullOrEmpty(String)>
	//*  77  167:ifne            183
		{
			cc1.a(e());
	//   78  170:aload_1         
	//   79  171:aload_0         
	//   80  172:invokevirtual   #264 <Method String e()>
	//   81  175:invokeinterface #379 <Method void cc.a(String)>
			break MISSING_BLOCK_LABEL_235;
	//   82  180:goto            235
		}
		String s3 = a;
	//   83  183:getstatic       #53  <Field String a>
	//   84  186:astore          5
		StringBuilder stringbuilder2 = new StringBuilder();
	//   85  188:new             #116 <Class StringBuilder>
	//   86  191:dup             
	//   87  192:invokespecial   #117 <Method void StringBuilder()>
	//   88  195:astore          6
		stringbuilder2.append("Not adding user id to event: ");
	//   89  197:aload           6
	//   90  199:ldc2            #381 <String "Not adding user id to event: ">
	//   91  202:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   92  205:pop             
		stringbuilder2.append(ek.a((JSONObject)cc1.forJsonPut()));
	//   93  206:aload           6
	//   94  208:aload_1         
	//   95  209:invokeinterface #367 <Method Object cc.forJsonPut()>
	//   96  214:checkcast       #369 <Class JSONObject>
	//   97  217:invokestatic    #374 <Method String ek.a(JSONObject)>
	//   98  220:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   99  223:pop             
		AppboyLogger.d(s3, stringbuilder2.toString());
	//  100  224:aload           5
	//  101  226:aload           6
	//  102  228:invokevirtual   #130 <Method String StringBuilder.toString()>
	//  103  231:invokestatic    #236 <Method int AppboyLogger.d(String, String)>
	//  104  234:pop             
		String s4 = a;
	//  105  235:getstatic       #53  <Field String a>
	//  106  238:astore          5
		StringBuilder stringbuilder3 = new StringBuilder();
	//  107  240:new             #116 <Class StringBuilder>
	//  108  243:dup             
	//  109  244:invokespecial   #117 <Method void StringBuilder()>
	//  110  247:astore          6
		stringbuilder3.append("Attempting to log event: ");
	//  111  249:aload           6
	//  112  251:ldc2            #383 <String "Attempting to log event: ">
	//  113  254:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//  114  257:pop             
		stringbuilder3.append(ek.a((JSONObject)cc1.forJsonPut()));
	//  115  258:aload           6
	//  116  260:aload_1         
	//  117  261:invokeinterface #367 <Method Object cc.forJsonPut()>
	//  118  266:checkcast       #369 <Class JSONObject>
	//  119  269:invokestatic    #374 <Method String ek.a(JSONObject)>
	//  120  272:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//  121  275:pop             
		AppboyLogger.v(s4, stringbuilder3.toString());
	//  122  276:aload           5
	//  123  278:aload           6
	//  124  280:invokevirtual   #130 <Method String StringBuilder.toString()>
	//  125  283:invokestatic    #214 <Method int AppboyLogger.v(String, String)>
	//  126  286:pop             
		if(w.b(cc1.b()))
	//* 127  287:aload_1         
	//* 128  288:invokeinterface #386 <Method w cc.b()>
	//* 129  293:invokestatic    #391 <Method boolean w.b(w)>
	//* 130  296:ifeq            314
		{
			AppboyLogger.d(a, "Publishing an internal push body clicked event for any awaiting triggers.");
	//  131  299:getstatic       #53  <Field String a>
	//  132  302:ldc2            #393 <String "Publishing an internal push body clicked event for any awaiting triggers.">
	//  133  305:invokestatic    #236 <Method int AppboyLogger.d(String, String)>
	//  134  308:pop             
			c(cc1);
	//  135  309:aload_0         
	//  136  310:aload_1         
	//  137  311:invokevirtual   #396 <Method void c(cc)>
		}
		if(!cc1.h())
	//* 138  314:aload_1         
	//* 139  315:invokeinterface #398 <Method boolean cc.h()>
	//* 140  320:ifne            331
			n.a(cc1);
	//  141  323:aload_0         
	//  142  324:getfield        #95  <Field bk n>
	//  143  327:aload_1         
	//  144  328:invokevirtual   #402 <Method void bk.a(cc)>
		if(!w.a(cc1.b()) || flag)
			break MISSING_BLOCK_LABEL_370;
	//  145  331:aload_1         
	//  146  332:invokeinterface #386 <Method w cc.b()>
	//  147  337:invokestatic    #404 <Method boolean w.a(w)>
	//  148  340:ifeq            370
	//  149  343:iload_2         
	//  150  344:ifne            370
		AppboyLogger.d(a, "Adding push click to dispatcher pending list");
	//  151  347:getstatic       #53  <Field String a>
	//  152  350:ldc2            #406 <String "Adding push click to dispatcher pending list">
	//  153  353:invokestatic    #236 <Method int AppboyLogger.d(String, String)>
	//  154  356:pop             
		i.b(cc1);
	//  155  357:aload_0         
	//  156  358:getfield        #83  <Field t i>
	//  157  361:aload_1         
	//  158  362:invokeinterface #408 <Method void t.b(cc)>
		break MISSING_BLOCK_LABEL_380;
	//  159  367:goto            380
		i.a(cc1);
	//  160  370:aload_0         
	//  161  371:getfield        #83  <Field t i>
	//  162  374:aload_1         
	//  163  375:invokeinterface #409 <Method void t.a(cc)>
		if(cc1.b().equals(((Object) (w.z))))
	//* 164  380:aload_1         
	//* 165  381:invokeinterface #386 <Method w cc.b()>
	//* 166  386:getstatic       #413 <Field w w.z>
	//* 167  389:invokevirtual   #414 <Method boolean w.equals(Object)>
	//* 168  392:ifeq            410
			i.a(cc1.g());
	//  169  395:aload_0         
	//  170  396:getfield        #83  <Field t i>
	//  171  399:aload_1         
	//  172  400:invokeinterface #416 <Method cg cc.g()>
	//  173  405:invokeinterface #417 <Method void t.a(cg)>
		obj;
	//  174  410:aload           4
		JVM INSTR monitorexit ;
	//  175  412:monitorexit     
		if(!flag)
	//* 176  413:iload_2         
	//* 177  414:ifne            444
		{
			q.removeCallbacksAndMessages(((Object) (null)));
	//  178  417:aload_0         
	//  179  418:getfield        #106 <Field Handler q>
	//  180  421:aconst_null     
	//  181  422:invokevirtual   #423 <Method void Handler.removeCallbacksAndMessages(Object)>
			q.postDelayed(new Runnable() {

				public void run()
				{
					a.d();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bo a>
				//    2    4:invokevirtual   #24  <Method void bo.d()>
				//    3    7:return          
				}

				final bo a;

			
			{
				a = bo.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bo a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
, 1000L);
	//  182  425:aload_0         
	//  183  426:getfield        #106 <Field Handler q>
	//  184  429:new             #8   <Class bo$1>
	//  185  432:dup             
	//  186  433:aload_0         
	//  187  434:invokespecial   #426 <Method void bo$1(bo)>
	//  188  437:ldc2w           #427 <Long 1000L>
	//  189  440:invokevirtual   #432 <Method boolean Handler.postDelayed(Runnable, long)>
	//  190  443:pop             
		}
		return true;
	//  191  444:iconst_1        
	//  192  445:ireturn         
		cc1;
	//  193  446:astore_1        
		break MISSING_BLOCK_LABEL_470;
	//  194  447:goto            468
		AppboyLogger.e(a, "Appboy manager received null event.");
	//  195  450:getstatic       #53  <Field String a>
	//  196  453:ldc2            #434 <String "Appboy manager received null event.">
	//  197  456:invokestatic    #436 <Method int AppboyLogger.e(String, String)>
	//  198  459:pop             
		throw new NullPointerException();
	//  199  460:new             #438 <Class NullPointerException>
	//  200  463:dup             
	//  201  464:invokespecial   #439 <Method void NullPointerException()>
	//  202  467:athrow          
	//* 203  468:aload           4
		throw cc1;
	//  204  470:monitorexit     
	//  205  471:aload_1         
	//  206  472:athrow          
	}

	public cf b(Activity activity)
	{
		if(p.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field dw p>
	//*   2    4:invokevirtual   #179 <Method boolean dw.a()>
	//*   3    7:ifeq            21
		{
			AppboyLogger.w(a, "SDK is disabled. Returning null session.");
	//    4   10:getstatic       #53  <Field String a>
	//    5   13:ldc1            #181 <String "SDK is disabled. Returning null session.">
	//    6   15:invokestatic    #134 <Method int AppboyLogger.w(String, String)>
	//    7   18:pop             
			return null;
	//    8   19:aconst_null     
	//    9   20:areturn         
		}
		if(s != null && !((Object) (((Object) (activity)).getClass())).equals(((Object) (s))))
	//*  10   21:aload_0         
	//*  11   22:getfield        #79  <Field Class s>
	//*  12   25:ifnull          44
	//*  13   28:aload_1         
	//*  14   29:invokevirtual   #200 <Method Class Object.getClass()>
	//*  15   32:aload_0         
	//*  16   33:getfield        #79  <Field Class s>
	//*  17   36:invokevirtual   #440 <Method boolean Object.equals(Object)>
	//*  18   39:ifne            44
		{
			return null;
	//   19   42:aconst_null     
	//   20   43:areturn         
		} else
		{
			h.b();
	//   21   44:aload_0         
	//   22   45:getfield        #97  <Field bp h>
	//   23   48:invokevirtual   #442 <Method void bp.b()>
			String s1 = a;
	//   24   51:getstatic       #53  <Field String a>
	//   25   54:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   26   55:new             #116 <Class StringBuilder>
	//   27   58:dup             
	//   28   59:invokespecial   #117 <Method void StringBuilder()>
	//   29   62:astore_3        
			stringbuilder.append("Closed session with activity: ");
	//   30   63:aload_3         
	//   31   64:ldc2            #444 <String "Closed session with activity: ">
	//   32   67:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   33   70:pop             
			stringbuilder.append(activity.getLocalClassName());
	//   34   71:aload_3         
	//   35   72:aload_1         
	//   36   73:invokevirtual   #211 <Method String Activity.getLocalClassName()>
	//   37   76:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   38   79:pop             
			AppboyLogger.v(s1, stringbuilder.toString());
	//   39   80:aload_2         
	//   40   81:aload_3         
	//   41   82:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   42   85:invokestatic    #214 <Method int AppboyLogger.v(String, String)>
	//   43   88:pop             
			return g.b();
	//   44   89:aload_0         
	//   45   90:getfield        #81  <Field bq g>
	//   46   93:invokevirtual   #446 <Method cf bq.b()>
	//   47   96:areturn         
		}
	}

	public cg b()
	{
		return g.c();
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field bq g>
	//    2    4:invokevirtual   #356 <Method cg bq.c()>
	//    3    7:areturn         
	}

	public void b(cc cc1)
	{
		AppboyLogger.d(a, "Posting geofence report for geofence event.");
	//    0    0:getstatic       #53  <Field String a>
	//    1    3:ldc2            #448 <String "Posting geofence report for geofence event.">
	//    2    6:invokestatic    #236 <Method int AppboyLogger.d(String, String)>
	//    3    9:pop             
		a(((db) (new da(l.getBaseUrlForRequests(), cc1))));
	//    4   10:aload_0         
	//    5   11:new             #450 <Class da>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:getfield        #89  <Field AppboyConfigurationProvider l>
	//    9   19:invokevirtual   #223 <Method String AppboyConfigurationProvider.getBaseUrlForRequests()>
	//   10   22:aload_1         
	//   11   23:invokespecial   #453 <Method void da(String, cc)>
	//   12   26:invokevirtual   #242 <Method void a(db)>
	//   13   29:return          
	}

	public void b(Throwable throwable)
	{
		a(throwable, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #343 <Method void a(Throwable, boolean)>
	//    4    6:return          
	}

	public void c()
	{
		if(p.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field dw p>
	//*   2    4:invokevirtual   #179 <Method boolean dw.a()>
	//*   3    7:ifeq            21
		{
			AppboyLogger.w(a, "SDK is disabled. Not force closing session.");
	//    4   10:getstatic       #53  <Field String a>
	//    5   13:ldc2            #455 <String "SDK is disabled. Not force closing session.">
	//    6   16:invokestatic    #134 <Method int AppboyLogger.w(String, String)>
	//    7   19:pop             
			return;
	//    8   20:return          
		} else
		{
			s = null;
	//    9   21:aload_0         
	//   10   22:aconst_null     
	//   11   23:putfield        #79  <Field Class s>
			g.e();
	//   12   26:aload_0         
	//   13   27:getfield        #81  <Field bq g>
	//   14   30:invokevirtual   #457 <Method void bq.e()>
			return;
	//   15   33:return          
		}
	}

	void c(cc cc1)
	{
		Object obj = ((Object) (cc1.c()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #461 <Method JSONObject cc.c()>
	//    2    6:astore_2        
		if(obj != null)
	//*   3    7:aload_2         
	//*   4    8:ifnull          57
		{
			obj = ((Object) (((JSONObject) (obj)).optString("cid", ((String) (null)))));
	//    5   11:aload_2         
	//    6   12:ldc2            #463 <String "cid">
	//    7   15:aconst_null     
	//    8   16:invokevirtual   #467 <Method String JSONObject.optString(String, String)>
	//    9   19:astore_2        
			if(cc1.b().equals(((Object) (w.e))))
	//*  10   20:aload_1         
	//*  11   21:invokeinterface #386 <Method w cc.b()>
	//*  12   26:getstatic       #469 <Field w w.e>
	//*  13   29:invokevirtual   #414 <Method boolean w.equals(Object)>
	//*  14   32:ifeq            67
			{
				j.a(((Object) (new as(((String) (obj)), cc1))), bo/app/as);
	//   15   35:aload_0         
	//   16   36:getfield        #85  <Field ad j>
	//   17   39:new             #471 <Class as>
	//   18   42:dup             
	//   19   43:aload_2         
	//   20   44:aload_1         
	//   21   45:invokespecial   #472 <Method void as(String, cc)>
	//   22   48:ldc2            #471 <Class as>
	//   23   51:invokeinterface #304 <Method void ad.a(Object, Class)>
				return;
	//   24   56:return          
			}
		} else
		{
			AppboyLogger.w(a, "Event json was null. Not publishing push clicked trigger event.");
	//   25   57:getstatic       #53  <Field String a>
	//   26   60:ldc2            #474 <String "Event json was null. Not publishing push clicked trigger event.">
	//   27   63:invokestatic    #134 <Method int AppboyLogger.w(String, String)>
	//   28   66:pop             
		}
	//   29   67:return          
	}

	public void d()
	{
		a(new cm.a());
	//    0    0:aload_0         
	//    1    1:new             #259 <Class cm$a>
	//    2    4:dup             
	//    3    5:invokespecial   #476 <Method void cm$a()>
	//    4    8:invokevirtual   #478 <Method void a(cm$a)>
	//    5   11:return          
	}

	public String e()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field String o>
	//    2    4:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/bo);
	private AtomicInteger b;
	private AtomicInteger c;
	private volatile String d;
	private final Object e = new Object();
	private final Object f = new Object();
	private final bq g;
	private final bp h;
	private final t i;
	private final ad j;
	private final bu k;
	private final AppboyConfigurationProvider l;
	private final dx m;
	private final bk n;
	private final String o;
	private final dw p;
	private final Handler q = eh.a();
	private boolean r;
	private Class s;

	static 
	{
	//    0    0:ldc1            #2   <Class bo>
	//    1    2:invokestatic    #51  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #53  <Field String a>
	//*   3    8:return          
	}
}
