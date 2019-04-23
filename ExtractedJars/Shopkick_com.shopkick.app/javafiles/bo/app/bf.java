// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.app.Activity;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.models.outgoing.Feedback;
import com.appboy.support.*;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			bl, dg, bh, by, 
//			bg, cc, cm, dh, 
//			cf, cg, ck, q, 
//			cu, an, aa, bm, 
//			cl, cv, bu, dt, 
//			t, bb, cn, am, 
//			ap, bv, co, ed, 
//			fb, ca

public class bf
	implements bl
{

	public bf(bh bh1, q q1, aa aa1, bm bm1, AppboyConfigurationProvider appboyconfigurationprovider, dh dh1, bb bb1, 
			String s, boolean flag, bg bg1, dg dg1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
		b = new AtomicInteger(0);
	//    2    4:aload_0         
	//    3    5:new             #56  <Class AtomicInteger>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:invokespecial   #59  <Method void AtomicInteger(int)>
	//    7   13:putfield        #61  <Field AtomicInteger b>
		c = new AtomicInteger(0);
	//    8   16:aload_0         
	//    9   17:new             #56  <Class AtomicInteger>
	//   10   20:dup             
	//   11   21:iconst_0        
	//   12   22:invokespecial   #59  <Method void AtomicInteger(int)>
	//   13   25:putfield        #63  <Field AtomicInteger c>
		d = "";
	//   14   28:aload_0         
	//   15   29:ldc1            #65  <String "">
	//   16   31:putfield        #67  <Field String d>
	//   17   34:aload_0         
	//   18   35:new             #4   <Class Object>
	//   19   38:dup             
	//   20   39:invokespecial   #54  <Method void Object()>
	//   21   42:putfield        #69  <Field Object e>
	//   22   45:aload_0         
	//   23   46:new             #4   <Class Object>
	//   24   49:dup             
	//   25   50:invokespecial   #54  <Method void Object()>
	//   26   53:putfield        #71  <Field Object f>
		q = false;
	//   27   56:aload_0         
	//   28   57:iconst_0        
	//   29   58:putfield        #73  <Field boolean q>
		r = null;
	//   30   61:aload_0         
	//   31   62:aconst_null     
	//   32   63:putfield        #75  <Field Class r>
		g = bh1;
	//   33   66:aload_0         
	//   34   67:aload_1         
	//   35   68:putfield        #77  <Field bh g>
		i = q1;
	//   36   71:aload_0         
	//   37   72:aload_2         
	//   38   73:putfield        #79  <Field q i>
		j = aa1;
	//   39   76:aload_0         
	//   40   77:aload_3         
	//   41   78:putfield        #81  <Field aa j>
		k = bm1;
	//   42   81:aload_0         
	//   43   82:aload           4
	//   44   84:putfield        #83  <Field bm k>
		l = appboyconfigurationprovider;
	//   45   87:aload_0         
	//   46   88:aload           5
	//   47   90:putfield        #85  <Field AppboyConfigurationProvider l>
		q = flag;
	//   48   93:aload_0         
	//   49   94:iload           9
	//   50   96:putfield        #73  <Field boolean q>
		o = s;
	//   51   99:aload_0         
	//   52  100:aload           8
	//   53  102:putfield        #87  <Field String o>
		m = dh1;
	//   54  105:aload_0         
	//   55  106:aload           6
	//   56  108:putfield        #89  <Field dh m>
		n = bb1;
	//   57  111:aload_0         
	//   58  112:aload           7
	//   59  114:putfield        #91  <Field bb n>
		h = bg1;
	//   60  117:aload_0         
	//   61  118:aload           10
	//   62  120:putfield        #93  <Field bg h>
		p = dg1;
	//   63  123:aload_0         
	//   64  124:aload           11
	//   65  126:putfield        #95  <Field dg p>
	//   66  129:return          
	}

	private boolean b(Throwable throwable)
	{
label0:
		{
			synchronized(f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field Object f>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				b.getAndIncrement();
	//    5    7:aload_0         
	//    6    8:getfield        #61  <Field AtomicInteger b>
	//    7   11:invokevirtual   #100 <Method int AtomicInteger.getAndIncrement()>
	//    8   14:pop             
				if(!d.equals(((Object) (throwable.getMessage()))) || c.get() <= 3 || b.get() >= 100)
					break label0;
	//    9   15:aload_0         
	//   10   16:getfield        #67  <Field String d>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #106 <Method String Throwable.getMessage()>
	//   13   23:invokevirtual   #112 <Method boolean String.equals(Object)>
	//   14   26:ifeq            56
	//   15   29:aload_0         
	//   16   30:getfield        #63  <Field AtomicInteger c>
	//   17   33:invokevirtual   #115 <Method int AtomicInteger.get()>
	//   18   36:iconst_3        
	//   19   37:icmple          56
	//   20   40:aload_0         
	//   21   41:getfield        #61  <Field AtomicInteger b>
	//   22   44:invokevirtual   #115 <Method int AtomicInteger.get()>
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
	//*  30   57:getfield        #67  <Field String d>
	//*  31   60:aload_1         
	//*  32   61:invokevirtual   #106 <Method String Throwable.getMessage()>
	//*  33   64:invokevirtual   #112 <Method boolean String.equals(Object)>
	//*  34   67:ifeq            81
		{
			c.getAndIncrement();
	//   35   70:aload_0         
	//   36   71:getfield        #63  <Field AtomicInteger c>
	//   37   74:invokevirtual   #100 <Method int AtomicInteger.getAndIncrement()>
	//   38   77:pop             
			break MISSING_BLOCK_LABEL_89;
	//   39   78:goto            89
		}
		c.set(0);
	//   40   81:aload_0         
	//   41   82:getfield        #63  <Field AtomicInteger c>
	//   42   85:iconst_0        
	//   43   86:invokevirtual   #118 <Method void AtomicInteger.set(int)>
		if(b.get() >= 100)
	//*  44   89:aload_0         
	//*  45   90:getfield        #61  <Field AtomicInteger b>
	//*  46   93:invokevirtual   #115 <Method int AtomicInteger.get()>
	//*  47   96:bipush          100
	//*  48   98:icmplt          109
			b.set(0);
	//   49  101:aload_0         
	//   50  102:getfield        #61  <Field AtomicInteger b>
	//   51  105:iconst_0        
	//   52  106:invokevirtual   #118 <Method void AtomicInteger.set(int)>
		d = throwable.getMessage();
	//   53  109:aload_0         
	//   54  110:aload_1         
	//   55  111:invokevirtual   #106 <Method String Throwable.getMessage()>
	//   56  114:putfield        #67  <Field String d>
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

	public by a()
	{
		if(p.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field dg p>
	//*   2    4:invokevirtual   #124 <Method boolean dg.a()>
	//*   3    7:ifeq            21
		{
			AppboyLogger.w(a, "SDK is disabled. Returning null session.");
	//    4   10:getstatic       #49  <Field String a>
	//    5   13:ldc1            #126 <String "SDK is disabled. Returning null session.">
	//    6   15:invokestatic    #130 <Method int AppboyLogger.w(String, String)>
	//    7   18:pop             
			return null;
	//    8   19:aconst_null     
	//    9   20:areturn         
		} else
		{
			by by1 = g.a();
	//   10   21:aload_0         
	//   11   22:getfield        #77  <Field bh g>
	//   12   25:invokevirtual   #134 <Method by bh.a()>
	//   13   28:astore_1        
			String s = a;
	//   14   29:getstatic       #49  <Field String a>
	//   15   32:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   16   33:new             #136 <Class StringBuilder>
	//   17   36:dup             
	//   18   37:invokespecial   #137 <Method void StringBuilder()>
	//   19   40:astore_3        
			stringbuilder.append("Completed the openSession call. Starting or continuing session ");
	//   20   41:aload_3         
	//   21   42:ldc1            #139 <String "Completed the openSession call. Starting or continuing session ">
	//   22   44:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
			stringbuilder.append(((Object) (by1.a())));
	//   24   48:aload_3         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #148 <Method ca by.a()>
	//   27   53:invokevirtual   #151 <Method StringBuilder StringBuilder.append(Object)>
	//   28   56:pop             
			AppboyLogger.i(s, stringbuilder.toString());
	//   29   57:aload_2         
	//   30   58:aload_3         
	//   31   59:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   32   62:invokestatic    #156 <Method int AppboyLogger.i(String, String)>
	//   33   65:pop             
			return by1;
	//   34   66:aload_1         
	//   35   67:areturn         
		}
	}

	public by a(Activity activity)
	{
		if(p.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field dg p>
	//*   2    4:invokevirtual   #124 <Method boolean dg.a()>
	//*   3    7:ifeq            21
		{
			AppboyLogger.w(a, "SDK is disabled. Returning null session.");
	//    4   10:getstatic       #49  <Field String a>
	//    5   13:ldc1            #126 <String "SDK is disabled. Returning null session.">
	//    6   15:invokestatic    #130 <Method int AppboyLogger.w(String, String)>
	//    7   18:pop             
			return null;
	//    8   19:aconst_null     
	//    9   20:areturn         
		} else
		{
			by by1 = a();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #159 <Method by a()>
	//   12   25:astore_2        
			r = ((Object) (activity)).getClass();
	//   13   26:aload_0         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #163 <Method Class Object.getClass()>
	//   16   31:putfield        #75  <Field Class r>
			h.a();
	//   17   34:aload_0         
	//   18   35:getfield        #93  <Field bg h>
	//   19   38:invokevirtual   #167 <Method void bg.a()>
			String s = a;
	//   20   41:getstatic       #49  <Field String a>
	//   21   44:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   22   45:new             #136 <Class StringBuilder>
	//   23   48:dup             
	//   24   49:invokespecial   #137 <Method void StringBuilder()>
	//   25   52:astore          4
			stringbuilder.append("Opened session with activity: ");
	//   26   54:aload           4
	//   27   56:ldc1            #169 <String "Opened session with activity: ">
	//   28   58:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   29   61:pop             
			stringbuilder.append(activity.getLocalClassName());
	//   30   62:aload           4
	//   31   64:aload_1         
	//   32   65:invokevirtual   #174 <Method String Activity.getLocalClassName()>
	//   33   68:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   34   71:pop             
			AppboyLogger.v(s, stringbuilder.toString());
	//   35   72:aload_3         
	//   36   73:aload           4
	//   37   75:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   38   78:invokestatic    #177 <Method int AppboyLogger.v(String, String)>
	//   39   81:pop             
			return by1;
	//   40   82:aload_2         
	//   41   83:areturn         
		}
	}

	public void a(ap ap)
	{
		try
		{
			if(b(((Throwable) (ap))))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #185 <Method boolean b(Throwable)>
	//*   3    5:ifeq            18
			{
				AppboyLogger.w(a, "Not logging duplicate database exception.");
	//    4    8:getstatic       #49  <Field String a>
	//    5   11:ldc1            #187 <String "Not logging duplicate database exception.">
	//    6   13:invokestatic    #130 <Method int AppboyLogger.w(String, String)>
	//    7   16:pop             
				return;
	//    8   17:return          
			}
		}
	//*   9   18:aload_0         
	//*  10   19:aload_1         
	//*  11   20:aload_0         
	//*  12   21:invokevirtual   #189 <Method ca b()>
	//*  13   24:invokestatic    #194 <Method cc cc.a(ap, ca)>
	//*  14   27:invokevirtual   #197 <Method boolean a(bu)>
	//*  15   30:pop             
	//*  16   31:return          
	//*  17   32:astore_1        
	//*  18   33:getstatic       #49  <Field String a>
	//*  19   36:ldc1            #199 <String "Failed to log error.">
	//*  20   38:aload_1         
	//*  21   39:invokestatic    #202 <Method int AppboyLogger.e(String, String, Throwable)>
	//*  22   42:pop             
	//*  23   43:return          
		catch(JSONException jsonexception)
	//*  24   44:astore_2        
		{
			String s = a;
	//   25   45:getstatic       #49  <Field String a>
	//   26   48:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   27   49:new             #136 <Class StringBuilder>
	//   28   52:dup             
	//   29   53:invokespecial   #137 <Method void StringBuilder()>
	//   30   56:astore          4
			stringbuilder.append("Failed to create database exception event from ");
	//   31   58:aload           4
	//   32   60:ldc1            #204 <String "Failed to create database exception event from ">
	//   33   62:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   34   65:pop             
			stringbuilder.append(((Object) (ap)));
	//   35   66:aload           4
	//   36   68:aload_1         
	//   37   69:invokevirtual   #151 <Method StringBuilder StringBuilder.append(Object)>
	//   38   72:pop             
			stringbuilder.append(".");
	//   39   73:aload           4
	//   40   75:ldc1            #206 <String ".">
	//   41   77:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   42   80:pop             
			AppboyLogger.e(s, stringbuilder.toString(), ((Throwable) (jsonexception)));
	//   43   81:aload_3         
	//   44   82:aload           4
	//   45   84:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   46   87:aload_2         
	//   47   88:invokestatic    #202 <Method int AppboyLogger.e(String, String, Throwable)>
	//   48   91:pop             
			return;
	//   49   92:return          
		}
		// Misplaced declaration of an exception variable
		catch(ap ap)
		{
			AppboyLogger.e(a, "Failed to log error.", ((Throwable) (ap)));
			return;
		}
		a(((bu) (cc.a(ap, b()))));
		return;
	}

	public void a(bv bv)
	{
		AppboyLogger.d(a, "Posting geofence request for location.");
	//    0    0:getstatic       #49  <Field String a>
	//    1    3:ldc1            #209 <String "Posting geofence request for location.">
	//    2    5:invokestatic    #211 <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		a(((co) (new cm(l.getBaseUrlForRequests(), bv))));
	//    4    9:aload_0         
	//    5   10:new             #213 <Class cm>
	//    6   13:dup             
	//    7   14:aload_0         
	//    8   15:getfield        #85  <Field AppboyConfigurationProvider l>
	//    9   18:invokevirtual   #218 <Method String AppboyConfigurationProvider.getBaseUrlForRequests()>
	//   10   21:aload_1         
	//   11   22:invokespecial   #221 <Method void cm(String, bv)>
	//   12   25:invokevirtual   #224 <Method void a(co)>
	//   13   28:return          
	}

	public void a(cg.a a1)
	{
		if(a1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			AppboyLogger.d(a, "Cannot request data sync with null respond with object");
	//    2    4:getstatic       #49  <Field String a>
	//    3    7:ldc1            #227 <String "Cannot request data sync with null respond with object">
	//    4    9:invokestatic    #211 <Method int AppboyLogger.d(String, String)>
	//    5   12:pop             
			return;
	//    6   13:return          
		}
		dh dh1 = m;
	//    7   14:aload_0         
	//    8   15:getfield        #89  <Field dh m>
	//    9   18:astore_2        
		if(dh1 != null && dh1.p())
	//*  10   19:aload_2         
	//*  11   20:ifnull          49
	//*  12   23:aload_2         
	//*  13   24:invokevirtual   #231 <Method boolean dh.p()>
	//*  14   27:ifeq            49
			a1.a(new cf(m.k()));
	//   15   30:aload_1         
	//   16   31:new             #233 <Class cf>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:getfield        #89  <Field dh m>
	//   20   39:invokevirtual   #236 <Method long dh.k()>
	//   21   42:invokespecial   #239 <Method void cf(long)>
	//   22   45:invokevirtual   #244 <Method cg$a cg$a.a(cf)>
	//   23   48:pop             
		a1.a(e());
	//   24   49:aload_1         
	//   25   50:aload_0         
	//   26   51:invokevirtual   #246 <Method String e()>
	//   27   54:invokevirtual   #249 <Method cg$a cg$a.a(String)>
	//   28   57:pop             
		a1 = ((cg.a) (a1.c()));
	//   29   58:aload_1         
	//   30   59:invokevirtual   #252 <Method cg cg$a.c()>
	//   31   62:astore_1        
		if(((cg) (a1)).c() && (((cg) (a1)).d() || ((cg) (a1)).e()))
	//*  32   63:aload_1         
	//*  33   64:invokevirtual   #256 <Method boolean cg.c()>
	//*  34   67:ifeq            92
	//*  35   70:aload_1         
	//*  36   71:invokevirtual   #258 <Method boolean cg.d()>
	//*  37   74:ifne            84
	//*  38   77:aload_1         
	//*  39   78:invokevirtual   #260 <Method boolean cg.e()>
	//*  40   81:ifeq            92
			m.a(false);
	//   41   84:aload_0         
	//   42   85:getfield        #89  <Field dh m>
	//   43   88:iconst_0        
	//   44   89:invokevirtual   #263 <Method void dh.a(boolean)>
		a(((co) (new ck(l.getBaseUrlForRequests(), ((cg) (a1))))));
	//   45   92:aload_0         
	//   46   93:new             #265 <Class ck>
	//   47   96:dup             
	//   48   97:aload_0         
	//   49   98:getfield        #85  <Field AppboyConfigurationProvider l>
	//   50  101:invokevirtual   #218 <Method String AppboyConfigurationProvider.getBaseUrlForRequests()>
	//   51  104:aload_1         
	//   52  105:invokespecial   #268 <Method void ck(String, cg)>
	//   53  108:invokevirtual   #224 <Method void a(co)>
	//   54  111:return          
	}

	void a(co co)
	{
		if(p.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field dg p>
	//*   2    4:invokevirtual   #124 <Method boolean dg.a()>
	//*   3    7:ifeq            21
		{
			AppboyLogger.w(a, "SDK is disabled. Not adding request to dispatch.");
	//    4   10:getstatic       #49  <Field String a>
	//    5   13:ldc2            #271 <String "SDK is disabled. Not adding request to dispatch.">
	//    6   16:invokestatic    #130 <Method int AppboyLogger.w(String, String)>
	//    7   19:pop             
			return;
	//    8   20:return          
		} else
		{
			i.a(co);
	//    9   21:aload_0         
	//   10   22:getfield        #79  <Field q i>
	//   11   25:aload_1         
	//   12   26:invokeinterface #274 <Method void q.a(co)>
			return;
	//   13   31:return          
		}
	}

	public void a(ed ed, fb fb)
	{
		a(((co) (new cu(l.getBaseUrlForRequests(), ed, fb, ((bl) (this)), e()))));
	//    0    0:aload_0         
	//    1    1:new             #278 <Class cu>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #85  <Field AppboyConfigurationProvider l>
	//    5    9:invokevirtual   #218 <Method String AppboyConfigurationProvider.getBaseUrlForRequests()>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #246 <Method String e()>
	//   11   19:invokespecial   #281 <Method void cu(String, ed, fb, bl, String)>
	//   12   22:invokevirtual   #224 <Method void a(co)>
	//   13   25:return          
	}

	public void a(fb fb)
	{
		j.a(((Object) (new an(fb))), bo/app/an);
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field aa j>
	//    2    4:new             #284 <Class an>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #286 <Method void an(fb)>
	//    6   12:ldc2            #284 <Class an>
	//    7   15:invokeinterface #291 <Method void aa.a(Object, Class)>
	//    8   20:return          
	}

	public void a(String s, String s1, boolean flag)
	{
		if(s != null && ValidationUtils.isValidEmailAddress(s))
	//*   0    0:aload_1         
	//*   1    1:ifnull          73
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #298 <Method boolean ValidationUtils.isValidEmailAddress(String)>
	//*   4    8:ifeq            73
		{
			if(!StringUtils.isNullOrBlank(s1))
	//*   5   11:aload_2         
	//*   6   12:invokestatic    #303 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   7   15:ifne            62
			{
				s = ((String) (new Feedback(s1, s, flag, k.a(), e())));
	//    8   18:new             #305 <Class Feedback>
	//    9   21:dup             
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:iload_3         
	//   13   25:aload_0         
	//   14   26:getfield        #83  <Field bm k>
	//   15   29:invokeinterface #310 <Method ce bm.a()>
	//   16   34:aload_0         
	//   17   35:invokevirtual   #246 <Method String e()>
	//   18   38:invokespecial   #313 <Method void Feedback(String, String, boolean, ce, String)>
	//   19   41:astore_1        
				a(((co) (new cl(l.getBaseUrlForRequests(), ((Feedback) (s))))));
	//   20   42:aload_0         
	//   21   43:new             #315 <Class cl>
	//   22   46:dup             
	//   23   47:aload_0         
	//   24   48:getfield        #85  <Field AppboyConfigurationProvider l>
	//   25   51:invokevirtual   #218 <Method String AppboyConfigurationProvider.getBaseUrlForRequests()>
	//   26   54:aload_1         
	//   27   55:invokespecial   #318 <Method void cl(String, Feedback)>
	//   28   58:invokevirtual   #224 <Method void a(co)>
				return;
	//   29   61:return          
			} else
			{
				throw new IllegalArgumentException("Feedback message cannot be null or blank");
	//   30   62:new             #320 <Class IllegalArgumentException>
	//   31   65:dup             
	//   32   66:ldc2            #322 <String "Feedback message cannot be null or blank">
	//   33   69:invokespecial   #325 <Method void IllegalArgumentException(String)>
	//   34   72:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("Reply to email address is invalid");
	//   35   73:new             #320 <Class IllegalArgumentException>
	//   36   76:dup             
	//   37   77:ldc2            #327 <String "Reply to email address is invalid">
	//   38   80:invokespecial   #325 <Method void IllegalArgumentException(String)>
	//   39   83:athrow          
		}
	}

	public void a(Throwable throwable)
	{
		try
		{
			if(b(throwable))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #185 <Method boolean b(Throwable)>
	//*   3    5:ifeq            19
			{
				AppboyLogger.w(a, "Not logging duplicate error.");
	//    4    8:getstatic       #49  <Field String a>
	//    5   11:ldc2            #330 <String "Not logging duplicate error.">
	//    6   14:invokestatic    #130 <Method int AppboyLogger.w(String, String)>
	//    7   17:pop             
				return;
	//    8   18:return          
			}
		}
	//*   9   19:aload_0         
	//*  10   20:aload_1         
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #189 <Method ca b()>
	//*  13   25:invokestatic    #333 <Method cc cc.a(Throwable, ca)>
	//*  14   28:invokevirtual   #197 <Method boolean a(bu)>
	//*  15   31:pop             
	//*  16   32:return          
	//*  17   33:astore_1        
	//*  18   34:getstatic       #49  <Field String a>
	//*  19   37:ldc1            #199 <String "Failed to log error.">
	//*  20   39:aload_1         
	//*  21   40:invokestatic    #202 <Method int AppboyLogger.e(String, String, Throwable)>
	//*  22   43:pop             
	//*  23   44:return          
		catch(JSONException jsonexception)
	//*  24   45:astore_2        
		{
			String s = a;
	//   25   46:getstatic       #49  <Field String a>
	//   26   49:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   27   50:new             #136 <Class StringBuilder>
	//   28   53:dup             
	//   29   54:invokespecial   #137 <Method void StringBuilder()>
	//   30   57:astore          4
			stringbuilder.append("Failed to create error event from ");
	//   31   59:aload           4
	//   32   61:ldc2            #335 <String "Failed to create error event from ">
	//   33   64:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   34   67:pop             
			stringbuilder.append(((Object) (throwable)));
	//   35   68:aload           4
	//   36   70:aload_1         
	//   37   71:invokevirtual   #151 <Method StringBuilder StringBuilder.append(Object)>
	//   38   74:pop             
			stringbuilder.append(".");
	//   39   75:aload           4
	//   40   77:ldc1            #206 <String ".">
	//   41   79:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   42   82:pop             
			AppboyLogger.e(s, stringbuilder.toString(), ((Throwable) (jsonexception)));
	//   43   83:aload_3         
	//   44   84:aload           4
	//   45   86:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   46   89:aload_2         
	//   47   90:invokestatic    #202 <Method int AppboyLogger.e(String, String, Throwable)>
	//   48   93:pop             
			return;
	//   49   94:return          
		}
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			AppboyLogger.e(a, "Failed to log error.", throwable);
			return;
		}
		a(((bu) (cc.a(throwable, b()))));
		return;
	}

	public void a(List list, long l1)
	{
		a(((co) (new cv(l.getBaseUrlForRequests(), list, l1, o))));
	//    0    0:aload_0         
	//    1    1:new             #338 <Class cv>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #85  <Field AppboyConfigurationProvider l>
	//    5    9:invokevirtual   #218 <Method String AppboyConfigurationProvider.getBaseUrlForRequests()>
	//    6   12:aload_1         
	//    7   13:lload_2         
	//    8   14:aload_0         
	//    9   15:getfield        #87  <Field String o>
	//   10   18:invokespecial   #341 <Method void cv(String, List, long, String)>
	//   11   21:invokevirtual   #224 <Method void a(co)>
	//   12   24:return          
	}

	public void a(boolean flag)
	{
		q = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #73  <Field boolean q>
	//    3    5:return          
	}

	public boolean a(bu bu1)
	{
		boolean flag;
		boolean flag1 = p.a();
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field dg p>
	//    2    4:invokevirtual   #124 <Method boolean dg.a()>
	//    3    7:istore_3        
		flag = false;
	//    4    8:iconst_0        
	//    5    9:istore_2        
		if(flag1)
	//*   6   10:iload_3         
	//*   7   11:ifeq            57
		{
			String s = a;
	//    8   14:getstatic       #49  <Field String a>
	//    9   17:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   10   19:new             #136 <Class StringBuilder>
	//   11   22:dup             
	//   12   23:invokespecial   #137 <Method void StringBuilder()>
	//   13   26:astore          5
			stringbuilder.append("SDK is disabled. Not logging event: ");
	//   14   28:aload           5
	//   15   30:ldc2            #345 <String "SDK is disabled. Not logging event: ">
	//   16   33:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   17   36:pop             
			stringbuilder.append(((Object) (bu1)));
	//   18   37:aload           5
	//   19   39:aload_1         
	//   20   40:invokevirtual   #151 <Method StringBuilder StringBuilder.append(Object)>
	//   21   43:pop             
			AppboyLogger.w(s, stringbuilder.toString());
	//   22   44:aload           4
	//   23   46:aload           5
	//   24   48:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   25   51:invokestatic    #130 <Method int AppboyLogger.w(String, String)>
	//   26   54:pop             
			return false;
	//   27   55:iconst_0        
	//   28   56:ireturn         
		}
		Object obj = e;
	//   29   57:aload_0         
	//   30   58:getfield        #69  <Field Object e>
	//   31   61:astore          4
		obj;
	//   32   63:aload           4
		JVM INSTR monitorenter ;
	//   33   65:monitorenter    
		if(bu1 == null)
			break MISSING_BLOCK_LABEL_362;
	//   34   66:aload_1         
	//   35   67:ifnull          362
		if(g.d() || g.c() == null)
			break MISSING_BLOCK_LABEL_108;
	//   36   70:aload_0         
	//   37   71:getfield        #77  <Field bh g>
	//   38   74:invokevirtual   #346 <Method boolean bh.d()>
	//   39   77:ifne            108
	//   40   80:aload_0         
	//   41   81:getfield        #77  <Field bh g>
	//   42   84:invokevirtual   #348 <Method ca bh.c()>
	//   43   87:ifnull          108
		bu1.a(g.c());
	//   44   90:aload_1         
	//   45   91:aload_0         
	//   46   92:getfield        #77  <Field bh g>
	//   47   95:invokevirtual   #348 <Method ca bh.c()>
	//   48   98:invokeinterface #353 <Method void bu.a(ca)>
		flag = true;
	//   49  103:iconst_1        
	//   50  104:istore_2        
		break MISSING_BLOCK_LABEL_160;
	//   51  105:goto            160
		String s1 = a;
	//   52  108:getstatic       #49  <Field String a>
	//   53  111:astore          5
		StringBuilder stringbuilder1 = new StringBuilder();
	//   54  113:new             #136 <Class StringBuilder>
	//   55  116:dup             
	//   56  117:invokespecial   #137 <Method void StringBuilder()>
	//   57  120:astore          6
		stringbuilder1.append("Not adding session id to event: ");
	//   58  122:aload           6
	//   59  124:ldc2            #355 <String "Not adding session id to event: ">
	//   60  127:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   61  130:pop             
		stringbuilder1.append(dt.a((JSONObject)bu1.forJsonPut()));
	//   62  131:aload           6
	//   63  133:aload_1         
	//   64  134:invokeinterface #359 <Method Object bu.forJsonPut()>
	//   65  139:checkcast       #361 <Class JSONObject>
	//   66  142:invokestatic    #366 <Method String dt.a(JSONObject)>
	//   67  145:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   68  148:pop             
		AppboyLogger.d(s1, stringbuilder1.toString());
	//   69  149:aload           5
	//   70  151:aload           6
	//   71  153:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   72  156:invokestatic    #211 <Method int AppboyLogger.d(String, String)>
	//   73  159:pop             
		if(!StringUtils.isNullOrEmpty(e()))
	//*  74  160:aload_0         
	//*  75  161:invokevirtual   #246 <Method String e()>
	//*  76  164:invokestatic    #369 <Method boolean StringUtils.isNullOrEmpty(String)>
	//*  77  167:ifne            183
		{
			bu1.a(e());
	//   78  170:aload_1         
	//   79  171:aload_0         
	//   80  172:invokevirtual   #246 <Method String e()>
	//   81  175:invokeinterface #371 <Method void bu.a(String)>
			break MISSING_BLOCK_LABEL_235;
	//   82  180:goto            235
		}
		String s2 = a;
	//   83  183:getstatic       #49  <Field String a>
	//   84  186:astore          5
		StringBuilder stringbuilder2 = new StringBuilder();
	//   85  188:new             #136 <Class StringBuilder>
	//   86  191:dup             
	//   87  192:invokespecial   #137 <Method void StringBuilder()>
	//   88  195:astore          6
		stringbuilder2.append("Not adding user id to event: ");
	//   89  197:aload           6
	//   90  199:ldc2            #373 <String "Not adding user id to event: ">
	//   91  202:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   92  205:pop             
		stringbuilder2.append(dt.a((JSONObject)bu1.forJsonPut()));
	//   93  206:aload           6
	//   94  208:aload_1         
	//   95  209:invokeinterface #359 <Method Object bu.forJsonPut()>
	//   96  214:checkcast       #361 <Class JSONObject>
	//   97  217:invokestatic    #366 <Method String dt.a(JSONObject)>
	//   98  220:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   99  223:pop             
		AppboyLogger.d(s2, stringbuilder2.toString());
	//  100  224:aload           5
	//  101  226:aload           6
	//  102  228:invokevirtual   #154 <Method String StringBuilder.toString()>
	//  103  231:invokestatic    #211 <Method int AppboyLogger.d(String, String)>
	//  104  234:pop             
		if(t.b(bu1.b()))
	//* 105  235:aload_1         
	//* 106  236:invokeinterface #376 <Method t bu.b()>
	//* 107  241:invokestatic    #381 <Method boolean t.b(t)>
	//* 108  244:ifeq            262
		{
			AppboyLogger.d(a, "Publishing an internal push body clicked event for any awaiting triggers.");
	//  109  247:getstatic       #49  <Field String a>
	//  110  250:ldc2            #383 <String "Publishing an internal push body clicked event for any awaiting triggers.">
	//  111  253:invokestatic    #211 <Method int AppboyLogger.d(String, String)>
	//  112  256:pop             
			c(bu1);
	//  113  257:aload_0         
	//  114  258:aload_1         
	//  115  259:invokevirtual   #386 <Method void c(bu)>
		}
		n.a(bu1);
	//  116  262:aload_0         
	//  117  263:getfield        #91  <Field bb n>
	//  118  266:aload_1         
	//  119  267:invokevirtual   #390 <Method void bb.a(bu)>
		if(!t.a(bu1.b()) || flag)
			break MISSING_BLOCK_LABEL_309;
	//  120  270:aload_1         
	//  121  271:invokeinterface #376 <Method t bu.b()>
	//  122  276:invokestatic    #392 <Method boolean t.a(t)>
	//  123  279:ifeq            309
	//  124  282:iload_2         
	//  125  283:ifne            309
		AppboyLogger.d(a, "Adding push click to dispatcher pending list");
	//  126  286:getstatic       #49  <Field String a>
	//  127  289:ldc2            #394 <String "Adding push click to dispatcher pending list">
	//  128  292:invokestatic    #211 <Method int AppboyLogger.d(String, String)>
	//  129  295:pop             
		i.b(bu1);
	//  130  296:aload_0         
	//  131  297:getfield        #79  <Field q i>
	//  132  300:aload_1         
	//  133  301:invokeinterface #396 <Method void q.b(bu)>
		break MISSING_BLOCK_LABEL_319;
	//  134  306:goto            319
		i.a(bu1);
	//  135  309:aload_0         
	//  136  310:getfield        #79  <Field q i>
	//  137  313:aload_1         
	//  138  314:invokeinterface #397 <Method void q.a(bu)>
		if(bu1.b().equals(((Object) (t.v))))
	//* 139  319:aload_1         
	//* 140  320:invokeinterface #376 <Method t bu.b()>
	//* 141  325:getstatic       #400 <Field t t.v>
	//* 142  328:invokevirtual   #401 <Method boolean t.equals(Object)>
	//* 143  331:ifeq            349
			i.a(bu1.f());
	//  144  334:aload_0         
	//  145  335:getfield        #79  <Field q i>
	//  146  338:aload_1         
	//  147  339:invokeinterface #403 <Method ca bu.f()>
	//  148  344:invokeinterface #404 <Method void q.a(ca)>
		if(flag)
			break MISSING_BLOCK_LABEL_357;
	//  149  349:iload_2         
	//  150  350:ifne            357
		d();
	//  151  353:aload_0         
	//  152  354:invokevirtual   #406 <Method void d()>
		obj;
	//  153  357:aload           4
		JVM INSTR monitorexit ;
	//  154  359:monitorexit     
		return true;
	//  155  360:iconst_1        
	//  156  361:ireturn         
		AppboyLogger.e(a, "Appboy manager received null event.");
	//  157  362:getstatic       #49  <Field String a>
	//  158  365:ldc2            #408 <String "Appboy manager received null event.">
	//  159  368:invokestatic    #410 <Method int AppboyLogger.e(String, String)>
	//  160  371:pop             
		throw new NullPointerException();
	//  161  372:new             #412 <Class NullPointerException>
	//  162  375:dup             
	//  163  376:invokespecial   #413 <Method void NullPointerException()>
	//  164  379:athrow          
	//* 165  380:aload           4
_L2:
		throw bu1;
	//  166  382:monitorexit     
	//  167  383:aload_1         
	//  168  384:athrow          
		bu1;
	//  169  385:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//* 170  386:goto            380
	}

	public by b(Activity activity)
	{
		if(p.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field dg p>
	//*   2    4:invokevirtual   #124 <Method boolean dg.a()>
	//*   3    7:ifeq            21
		{
			AppboyLogger.w(a, "SDK is disabled. Returning null session.");
	//    4   10:getstatic       #49  <Field String a>
	//    5   13:ldc1            #126 <String "SDK is disabled. Returning null session.">
	//    6   15:invokestatic    #130 <Method int AppboyLogger.w(String, String)>
	//    7   18:pop             
			return null;
	//    8   19:aconst_null     
	//    9   20:areturn         
		}
		if(r != null && !((Object) (((Object) (activity)).getClass())).equals(((Object) (r))))
	//*  10   21:aload_0         
	//*  11   22:getfield        #75  <Field Class r>
	//*  12   25:ifnull          44
	//*  13   28:aload_1         
	//*  14   29:invokevirtual   #163 <Method Class Object.getClass()>
	//*  15   32:aload_0         
	//*  16   33:getfield        #75  <Field Class r>
	//*  17   36:invokevirtual   #414 <Method boolean Object.equals(Object)>
	//*  18   39:ifne            44
		{
			return null;
	//   19   42:aconst_null     
	//   20   43:areturn         
		} else
		{
			h.b();
	//   21   44:aload_0         
	//   22   45:getfield        #93  <Field bg h>
	//   23   48:invokevirtual   #416 <Method void bg.b()>
			String s = a;
	//   24   51:getstatic       #49  <Field String a>
	//   25   54:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   26   55:new             #136 <Class StringBuilder>
	//   27   58:dup             
	//   28   59:invokespecial   #137 <Method void StringBuilder()>
	//   29   62:astore_3        
			stringbuilder.append("Closed session with activity: ");
	//   30   63:aload_3         
	//   31   64:ldc2            #418 <String "Closed session with activity: ">
	//   32   67:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   33   70:pop             
			stringbuilder.append(activity.getLocalClassName());
	//   34   71:aload_3         
	//   35   72:aload_1         
	//   36   73:invokevirtual   #174 <Method String Activity.getLocalClassName()>
	//   37   76:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   38   79:pop             
			AppboyLogger.v(s, stringbuilder.toString());
	//   39   80:aload_2         
	//   40   81:aload_3         
	//   41   82:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   42   85:invokestatic    #177 <Method int AppboyLogger.v(String, String)>
	//   43   88:pop             
			return g.b();
	//   44   89:aload_0         
	//   45   90:getfield        #77  <Field bh g>
	//   46   93:invokevirtual   #420 <Method by bh.b()>
	//   47   96:areturn         
		}
	}

	public ca b()
	{
		return g.c();
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field bh g>
	//    2    4:invokevirtual   #348 <Method ca bh.c()>
	//    3    7:areturn         
	}

	public void b(bu bu1)
	{
		AppboyLogger.d(a, "Posting geofence report for geofence event.");
	//    0    0:getstatic       #49  <Field String a>
	//    1    3:ldc2            #422 <String "Posting geofence report for geofence event.">
	//    2    6:invokestatic    #211 <Method int AppboyLogger.d(String, String)>
	//    3    9:pop             
		a(((co) (new cn(l.getBaseUrlForRequests(), bu1))));
	//    4   10:aload_0         
	//    5   11:new             #424 <Class cn>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:getfield        #85  <Field AppboyConfigurationProvider l>
	//    9   19:invokevirtual   #218 <Method String AppboyConfigurationProvider.getBaseUrlForRequests()>
	//   10   22:aload_1         
	//   11   23:invokespecial   #427 <Method void cn(String, bu)>
	//   12   26:invokevirtual   #224 <Method void a(co)>
	//   13   29:return          
	}

	public void c()
	{
		if(p.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field dg p>
	//*   2    4:invokevirtual   #124 <Method boolean dg.a()>
	//*   3    7:ifeq            21
		{
			AppboyLogger.w(a, "SDK is disabled. Not force closing session.");
	//    4   10:getstatic       #49  <Field String a>
	//    5   13:ldc2            #429 <String "SDK is disabled. Not force closing session.">
	//    6   16:invokestatic    #130 <Method int AppboyLogger.w(String, String)>
	//    7   19:pop             
			return;
	//    8   20:return          
		} else
		{
			r = null;
	//    9   21:aload_0         
	//   10   22:aconst_null     
	//   11   23:putfield        #75  <Field Class r>
			g.e();
	//   12   26:aload_0         
	//   13   27:getfield        #77  <Field bh g>
	//   14   30:invokevirtual   #431 <Method void bh.e()>
			return;
	//   15   33:return          
		}
	}

	void c(bu bu1)
	{
		Object obj = ((Object) (bu1.c()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #434 <Method JSONObject bu.c()>
	//    2    6:astore_2        
		if(obj != null)
	//*   3    7:aload_2         
	//*   4    8:ifnull          57
		{
			obj = ((Object) (((JSONObject) (obj)).optString("cid", ((String) (null)))));
	//    5   11:aload_2         
	//    6   12:ldc2            #436 <String "cid">
	//    7   15:aconst_null     
	//    8   16:invokevirtual   #440 <Method String JSONObject.optString(String, String)>
	//    9   19:astore_2        
			if(bu1.b().equals(((Object) (t.e))))
	//*  10   20:aload_1         
	//*  11   21:invokeinterface #376 <Method t bu.b()>
	//*  12   26:getstatic       #442 <Field t t.e>
	//*  13   29:invokevirtual   #401 <Method boolean t.equals(Object)>
	//*  14   32:ifeq            67
			{
				j.a(((Object) (new am(((String) (obj)), bu1))), bo/app/am);
	//   15   35:aload_0         
	//   16   36:getfield        #81  <Field aa j>
	//   17   39:new             #444 <Class am>
	//   18   42:dup             
	//   19   43:aload_2         
	//   20   44:aload_1         
	//   21   45:invokespecial   #445 <Method void am(String, bu)>
	//   22   48:ldc2            #444 <Class am>
	//   23   51:invokeinterface #291 <Method void aa.a(Object, Class)>
				return;
	//   24   56:return          
			}
		} else
		{
			AppboyLogger.w(a, "Event json was null. Not publishing push clicked trigger event.");
	//   25   57:getstatic       #49  <Field String a>
	//   26   60:ldc2            #447 <String "Event json was null. Not publishing push clicked trigger event.">
	//   27   63:invokestatic    #130 <Method int AppboyLogger.w(String, String)>
	//   28   66:pop             
		}
	//   29   67:return          
	}

	public void d()
	{
		a(new cg.a());
	//    0    0:aload_0         
	//    1    1:new             #241 <Class cg$a>
	//    2    4:dup             
	//    3    5:invokespecial   #448 <Method void cg$a()>
	//    4    8:invokevirtual   #450 <Method void a(cg$a)>
	//    5   11:return          
	}

	public String e()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field String o>
	//    2    4:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/bf);
	private AtomicInteger b;
	private AtomicInteger c;
	private volatile String d;
	private final Object e = new Object();
	private final Object f = new Object();
	private final bh g;
	private final bg h;
	private final q i;
	private final aa j;
	private final bm k;
	private final AppboyConfigurationProvider l;
	private final dh m;
	private final bb n;
	private final String o;
	private final dg p;
	private boolean q;
	private Class r;

	static 
	{
	//    0    0:ldc1            #2   <Class bf>
	//    1    2:invokestatic    #47  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #49  <Field String a>
	//*   3    8:return          
	}
}
