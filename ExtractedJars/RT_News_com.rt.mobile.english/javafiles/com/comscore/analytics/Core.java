// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.analytics;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.comscore.applications.*;
import com.comscore.measurement.Measurement;
import com.comscore.measurement.MeasurementDispatcher;
import com.comscore.utils.*;
import com.comscore.utils.id.IdHelper;
import com.comscore.utils.task.TaskExecutor;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.comscore.analytics:
//			ApplicationState, SessionState, comScore, ab, 
//			i, j, x, v, 
//			af, z, ac, ad, 
//			ae, l, w, a, 
//			ag, e, n, t, 
//			p, q, o, s, 
//			r, h, m, aa, 
//			c, g, f, u, 
//			b, ah, d, k, 
//			y

public class Core
{

	public Core()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method void Object()>
		l = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #100 <Field boolean l>
		m = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #102 <Field boolean m>
		n = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #104 <Field boolean n>
		v = true;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #106 <Field boolean v>
		y = ApplicationState.INACTIVE;
	//   14   24:aload_0         
	//   15   25:getstatic       #111 <Field ApplicationState ApplicationState.INACTIVE>
	//   16   28:putfield        #113 <Field ApplicationState y>
		L = SessionState.INACTIVE;
	//   17   31:aload_0         
	//   18   32:getstatic       #117 <Field SessionState SessionState.INACTIVE>
	//   19   35:putfield        #119 <Field SessionState L>
		af = 0L;
	//   20   38:aload_0         
	//   21   39:lconst_0        
	//   22   40:putfield        #121 <Field long af>
		ag = false;
	//   23   43:aload_0         
	//   24   44:iconst_0        
	//   25   45:putfield        #123 <Field boolean ag>
		an = true;
	//   26   48:aload_0         
	//   27   49:iconst_1        
	//   28   50:putfield        #125 <Field boolean an>
		q = new AtomicInteger(0);
	//   29   53:aload_0         
	//   30   54:new             #127 <Class AtomicInteger>
	//   31   57:dup             
	//   32   58:iconst_0        
	//   33   59:invokespecial   #130 <Method void AtomicInteger(int)>
	//   34   62:putfield        #132 <Field AtomicInteger q>
		o = new AtomicInteger();
	//   35   65:aload_0         
	//   36   66:new             #127 <Class AtomicInteger>
	//   37   69:dup             
	//   38   70:invokespecial   #133 <Method void AtomicInteger()>
	//   39   73:putfield        #135 <Field AtomicInteger o>
		B = new AtomicInteger(0);
	//   40   76:aload_0         
	//   41   77:new             #127 <Class AtomicInteger>
	//   42   80:dup             
	//   43   81:iconst_0        
	//   44   82:invokespecial   #130 <Method void AtomicInteger(int)>
	//   45   85:putfield        #137 <Field AtomicInteger B>
		z = new AtomicInteger(0);
	//   46   88:aload_0         
	//   47   89:new             #127 <Class AtomicInteger>
	//   48   92:dup             
	//   49   93:iconst_0        
	//   50   94:invokespecial   #130 <Method void AtomicInteger(int)>
	//   51   97:putfield        #139 <Field AtomicInteger z>
		A = new AtomicInteger(0);
	//   52  100:aload_0         
	//   53  101:new             #127 <Class AtomicInteger>
	//   54  104:dup             
	//   55  105:iconst_0        
	//   56  106:invokespecial   #130 <Method void AtomicInteger(int)>
	//   57  109:putfield        #141 <Field AtomicInteger A>
		ah = Thread.getDefaultUncaughtExceptionHandler();
	//   58  112:aload_0         
	//   59  113:invokestatic    #147 <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
	//   60  116:putfield        #149 <Field Thread$UncaughtExceptionHandler ah>
		ae = true;
	//   61  119:aload_0         
	//   62  120:iconst_1        
	//   63  121:putfield        #151 <Field boolean ae>
	//   64  124:aload_0         
	//   65  125:new             #153 <Class HashMap>
	//   66  128:dup             
	//   67  129:invokespecial   #154 <Method void HashMap()>
	//   68  132:putfield        #156 <Field HashMap ac>
	//   69  135:aload_0         
	//   70  136:new             #153 <Class HashMap>
	//   71  139:dup             
	//   72  140:invokespecial   #154 <Method void HashMap()>
	//   73  143:putfield        #158 <Field HashMap ad>
		reset();
	//   74  146:aload_0         
	//   75  147:invokevirtual   #161 <Method void reset()>
	//   76  150:return          
	}

	private void A()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #164 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #165 <Method void ArrayList()>
	//    3    7:astore_1        
		arraylist.add("lastApplicationAccumulationTimestamp");
	//    4    8:aload_1         
	//    5    9:ldc1            #167 <String "lastApplicationAccumulationTimestamp">
	//    6   11:invokevirtual   #171 <Method boolean ArrayList.add(Object)>
	//    7   14:pop             
		arraylist.add("lastSessionAccumulationTimestamp");
	//    8   15:aload_1         
	//    9   16:ldc1            #173 <String "lastSessionAccumulationTimestamp">
	//   10   18:invokevirtual   #171 <Method boolean ArrayList.add(Object)>
	//   11   21:pop             
		a("lastActivityTime", arraylist);
	//   12   22:aload_0         
	//   13   23:ldc1            #175 <String "lastActivityTime">
	//   14   25:aload_1         
	//   15   26:invokevirtual   #178 <Method void a(String, ArrayList)>
		a("ns_ap_fg", "foregroundTransitionsCount");
	//   16   29:aload_0         
	//   17   30:ldc1            #180 <String "ns_ap_fg">
	//   18   32:ldc1            #182 <String "foregroundTransitionsCount">
	//   19   34:invokevirtual   #185 <Method void a(String, String)>
		a("installTime", "installId");
	//   20   37:aload_0         
	//   21   38:ldc1            #187 <String "installTime">
	//   22   40:ldc1            #189 <String "installId">
	//   23   42:invokevirtual   #185 <Method void a(String, String)>
		a("ns_ap_ver", "previousVersion");
	//   24   45:aload_0         
	//   25   46:ldc1            #191 <String "ns_ap_ver">
	//   26   48:ldc1            #193 <String "previousVersion">
	//   27   50:invokevirtual   #185 <Method void a(String, String)>
	//   28   53:return          
	}

	static IdHelper a(Core core)
	{
		return core.am;
	//    0    0:aload_0         
	//    1    1:getfield        #196 <Field IdHelper am>
	//    2    4:areturn         
	}

	private String a(String s1, Properties properties, boolean flag)
	{
		if(properties != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          25
		{
			properties = ((Properties) (properties.getProperty(s1)));
	//    2    4:aload_2         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #203 <Method String Properties.getProperty(String)>
	//    5    9:astore_2        
			if(properties != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          25
			{
				b.set(s1, ((String) (properties)));
	//    8   14:aload_0         
	//    9   15:getfield        #205 <Field Storage b>
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #210 <Method void Storage.set(String, String)>
				return ((String) (properties));
	//   13   23:aload_2         
	//   14   24:areturn         
			}
		}
		if(flag && b.has(s1).booleanValue())
	//*  15   25:iload_3         
	//*  16   26:ifeq            52
	//*  17   29:aload_0         
	//*  18   30:getfield        #205 <Field Storage b>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #214 <Method Boolean Storage.has(String)>
	//*  21   37:invokevirtual   #220 <Method boolean Boolean.booleanValue()>
	//*  22   40:ifeq            52
			return b.get(s1);
	//   23   43:aload_0         
	//   24   44:getfield        #205 <Field Storage b>
	//   25   47:aload_1         
	//   26   48:invokevirtual   #223 <Method String Storage.get(String)>
	//   27   51:areturn         
		else
			return null;
	//   28   52:aconst_null     
	//   29   53:areturn         
	}

	static void a(Core core, TransmissionMode transmissionmode)
	{
		core.a(transmissionmode);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #227 <Method void a(TransmissionMode)>
	//    3    5:return          
	}

	static void a(Core core, String s1)
	{
		core.b(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #231 <Method void b(String)>
	//    3    5:return          
	}

	static void a(Core core, String s1, String s2)
	{
		core.b(s1, s2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #234 <Method void b(String, String)>
	//    4    6:return          
	}

	private void a(TransmissionMode transmissionmode)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			aj = transmissionmode;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #236 <Field TransmissionMode aj>
			return;
	//    7   13:return          
		}
	}

	static boolean a(Core core, boolean flag)
	{
		core.an = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #125 <Field boolean an>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static void b(Core core, TransmissionMode transmissionmode)
	{
		core.b(transmissionmode);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #239 <Method void b(TransmissionMode)>
	//    3    5:return          
	}

	static void b(Core core, String s1)
	{
		core.c(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #241 <Method void c(String)>
	//    3    5:return          
	}

	private void b(TransmissionMode transmissionmode)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			ak = transmissionmode;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #243 <Field TransmissionMode ak>
			return;
	//    7   13:return          
		}
	}

	private void b(String s1)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(am == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #196 <Field IdHelper am>
	//*   6   12:ifnonnull       16
		{
			return;
	//    7   15:return          
		} else
		{
			am.setPublisherSecret(s1);
	//    8   16:aload_0         
	//    9   17:getfield        #196 <Field IdHelper am>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #248 <Method void IdHelper.setPublisherSecret(String)>
			am.generateIds();
	//   12   24:aload_0         
	//   13   25:getfield        #196 <Field IdHelper am>
	//   14   28:invokevirtual   #251 <Method void IdHelper.generateIds()>
			return;
	//   15   31:return          
		}
	}

	private void b(String s1, String s2)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			ac.put(((Object) (s1)), ((Object) (s2)));
	//    4    8:aload_0         
	//    5    9:getfield        #156 <Field HashMap ac>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #255 <Method Object HashMap.put(Object, Object)>
	//    9   17:pop             
			return;
	//   10   18:return          
		}
	}

	static boolean b(Core core)
	{
		return core.an;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field boolean an>
	//    2    4:ireturn         
	}

	static boolean b(Core core, boolean flag)
	{
		core.ao = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #258 <Field boolean ao>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static void c(Core core, String s1)
	{
		core.d(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #260 <Method void d(String)>
	//    3    5:return          
	}

	private void c(String s1)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		aa = s1;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #262 <Field String aa>
		if(b != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #205 <Field Storage b>
	//*   9   17:ifnull          34
			b.set("appName", aa);
	//   10   20:aload_0         
	//   11   21:getfield        #205 <Field Storage b>
	//   12   24:ldc2            #264 <String "appName">
	//   13   27:aload_0         
	//   14   28:getfield        #262 <Field String aa>
	//   15   31:invokevirtual   #210 <Method void Storage.set(String, String)>
	//   16   34:return          
	}

	static boolean c(Core core)
	{
		return core.ao;
	//    0    0:aload_0         
	//    1    1:getfield        #258 <Field boolean ao>
	//    2    4:ireturn         
	}

	private void d(String s1)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		String s2;
		if(isSecure())
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #267 <Method boolean isSecure()>
	//*   6   12:ifeq            22
			s2 = "https://sb.scorecardresearch.com/p2?";
	//    7   15:ldc2            #269 <String "https://sb.scorecardresearch.com/p2?">
	//    8   18:astore_2        
		else
	//*   9   19:goto            26
			s2 = "http://b.scorecardresearch.com/p2?";
	//   10   22:ldc2            #271 <String "http://b.scorecardresearch.com/p2?">
	//   11   25:astore_2        
		a(s2);
	//   12   26:aload_0         
	//   13   27:aload_2         
	//   14   28:invokevirtual   #273 <Method void a(String)>
		b("c2", s1);
	//   15   31:aload_0         
	//   16   32:ldc2            #275 <String "c2">
	//   17   35:aload_1         
	//   18   36:invokespecial   #234 <Method void b(String, String)>
	//   19   39:return          
	}

	public static Core getInstance()
	{
		return comScore.getCore();
	//    0    0:invokestatic    #282 <Method Core comScore.getCore()>
	//    1    3:areturn         
	}

	protected Measurement a(EventType eventtype, HashMap hashmap, String s1)
	{
		return ((Measurement) (ApplicationMeasurement.newApplicationMeasurement(this, eventtype, hashmap, s1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #290 <Method ApplicationMeasurement ApplicationMeasurement.newApplicationMeasurement(Core, EventType, HashMap, String)>
	//    5    7:areturn         
	}

	protected IdHelper a(Context context, Storage storage)
	{
		return new IdHelper(context, storage, this);
	//    0    0:new             #245 <Class IdHelper>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:invokespecial   #296 <Method void IdHelper(Context, Storage, Core)>
	//    6   10:areturn         
	}

	protected void a()
	{
		b = b();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #299 <Method Storage b()>
	//    3    5:putfield        #205 <Field Storage b>
		g = e();
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #302 <Method MeasurementDispatcher e()>
	//    7   13:putfield        #304 <Field MeasurementDispatcher g>
		a(b);
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #205 <Field Storage b>
	//   11   21:invokevirtual   #307 <Method void a(Storage)>
		e = c();
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #310 <Method DispatchQueue c()>
	//   15   29:putfield        #312 <Field DispatchQueue e>
		c = f();
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:invokevirtual   #315 <Method KeepAlive f()>
	//   19   37:putfield        #317 <Field KeepAlive c>
		a = g();
	//   20   40:aload_0         
	//   21   41:aload_0         
	//   22   42:invokevirtual   #320 <Method OfflineMeasurementsCache g()>
	//   23   45:putfield        #322 <Field OfflineMeasurementsCache a>
		d = h();
	//   24   48:aload_0         
	//   25   49:aload_0         
	//   26   50:invokevirtual   #325 <Method CacheFlusher h()>
	//   27   53:putfield        #327 <Field CacheFlusher d>
		h = i();
	//   28   56:aload_0         
	//   29   57:aload_0         
	//   30   58:invokevirtual   #330 <Method ConnectivityChangeReceiver i()>
	//   31   61:putfield        #332 <Field ConnectivityChangeReceiver h>
		j();
	//   32   64:aload_0         
	//   33   65:invokevirtual   #334 <Method void j()>
		am = a(ab, b);
	//   34   68:aload_0         
	//   35   69:aload_0         
	//   36   70:aload_0         
	//   37   71:getfield        #336 <Field Context ab>
	//   38   74:aload_0         
	//   39   75:getfield        #205 <Field Storage b>
	//   40   78:invokevirtual   #338 <Method IdHelper a(Context, Storage)>
	//   41   81:putfield        #196 <Field IdHelper am>
	//   42   84:return          
	}

	void a(int i1, boolean flag)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		w();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #341 <Method void w()>
		int j1 = i1;
	//    6   12:iload_1         
	//    7   13:istore_3        
		if(i1 < 60)
	//*   8   14:iload_1         
	//*   9   15:bipush          60
	//*  10   17:icmpge          23
			j1 = 60;
	//   11   20:bipush          60
	//   12   22:istore_3        
		l = flag;
	//   13   23:aload_0         
	//   14   24:iload_2         
	//   15   25:putfield        #100 <Field boolean l>
		for(k = j1 * 1000; y == ApplicationState.FOREGROUND || y == ApplicationState.BACKGROUND_UX_ACTIVE && !l;)
	//*  16   28:aload_0         
	//*  17   29:iload_3         
	//*  18   30:sipush          1000
	//*  19   33:imul            
	//*  20   34:i2l             
	//*  21   35:putfield        #343 <Field long k>
	//*  22   38:aload_0         
	//*  23   39:getfield        #113 <Field ApplicationState y>
	//*  24   42:getstatic       #346 <Field ApplicationState ApplicationState.FOREGROUND>
	//*  25   45:if_acmpne       53
		{
			v();
	//   26   48:aload_0         
	//   27   49:invokevirtual   #348 <Method void v()>
			return;
	//   28   52:return          
		}

	//   29   53:aload_0         
	//   30   54:getfield        #113 <Field ApplicationState y>
	//   31   57:getstatic       #351 <Field ApplicationState ApplicationState.BACKGROUND_UX_ACTIVE>
	//   32   60:if_acmpne       73
	//   33   63:aload_0         
	//   34   64:getfield        #100 <Field boolean l>
	//   35   67:ifne            73
	//*  36   70:goto            48
	//   37   73:return          
	}

	protected void a(ApplicationState applicationstate)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #354 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #355 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Leaving application state: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #357 <String "Leaving application state: ">
	//    6   12:invokevirtual   #361 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(((Object) (applicationstate)));
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #364 <Method StringBuilder StringBuilder.append(Object)>
	//   11   21:pop             
		CSLog.d(((Object) (this)), stringbuilder.toString());
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:invokevirtual   #368 <Method String StringBuilder.toString()>
	//   15   27:invokestatic    #373 <Method void CSLog.d(Object, String)>
		switch(ab.a[applicationstate.ordinal()])
	//*  16   30:getstatic       #378 <Field int[] ab.a>
	//*  17   33:aload_1         
	//*  18   34:invokevirtual   #382 <Method int ApplicationState.ordinal()>
	//*  19   37:iaload          
		{
	//*  20   38:tableswitch     1 3: default 64
	//	               1 75
	//	               2 70
	//	               3 65
		default:
			return;
	//   21   64:return          

		case 3: // '\003'
			setCurrentActivityName(((String) (null)));
	//   22   65:aload_0         
	//   23   66:aconst_null     
	//   24   67:invokevirtual   #385 <Method void setCurrentActivityName(String)>
			// fall through

		case 2: // '\002'
			w();
	//   25   70:aload_0         
	//   26   71:invokevirtual   #341 <Method void w()>
			return;
	//   27   74:return          

		case 1: // '\001'
			h.start();
	//   28   75:aload_0         
	//   29   76:getfield        #332 <Field ConnectivityChangeReceiver h>
	//   30   79:invokevirtual   #390 <Method void ConnectivityChangeReceiver.start()>
			c.start(3000);
	//   31   82:aload_0         
	//   32   83:getfield        #317 <Field KeepAlive c>
	//   33   86:sipush          3000
	//   34   89:invokevirtual   #394 <Method void KeepAlive.start(int)>
			ab.registerReceiver(((android.content.BroadcastReceiver) (h)), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
	//   35   92:aload_0         
	//   36   93:getfield        #336 <Field Context ab>
	//   37   96:aload_0         
	//   38   97:getfield        #332 <Field ConnectivityChangeReceiver h>
	//   39  100:new             #396 <Class IntentFilter>
	//   40  103:dup             
	//   41  104:ldc2            #398 <String "android.net.conn.CONNECTIVITY_CHANGE">
	//   42  107:invokespecial   #400 <Method void IntentFilter(String)>
	//   43  110:invokevirtual   #406 <Method android.content.Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//   44  113:pop             
			d.start();
	//   45  114:aload_0         
	//   46  115:getfield        #327 <Field CacheFlusher d>
	//   47  118:invokevirtual   #409 <Method void CacheFlusher.start()>
			return;
	//   48  121:return          
		}
	}

	protected void a(ApplicationState applicationstate, ApplicationState applicationstate1)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(applicationstate1 != ApplicationState.INACTIVE && isAutoStartEnabled() && !n)
	//*   4    8:aload_2         
	//*   5    9:getstatic       #111 <Field ApplicationState ApplicationState.INACTIVE>
	//*   6   12:if_acmpeq       41
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #413 <Method boolean isAutoStartEnabled()>
	//*   9   19:ifeq            41
	//*  10   22:aload_0         
	//*  11   23:getfield        #104 <Field boolean n>
	//*  12   26:ifne            41
			notify(EventType.START, ad, false);
	//   13   29:aload_0         
	//   14   30:getstatic       #419 <Field EventType EventType.START>
	//   15   33:aload_0         
	//   16   34:getfield        #158 <Field HashMap ad>
	//   17   37:iconst_0        
	//   18   38:invokevirtual   #423 <Method void notify(EventType, HashMap, boolean)>
	//   19   41:return          
	}

	protected void a(SessionState sessionstate)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #354 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #355 <Method void StringBuilder()>
	//    7   15:astore          4
		stringbuilder.append("Leaving session state: ");
	//    8   17:aload           4
	//    9   19:ldc2            #426 <String "Leaving session state: ">
	//   10   22:invokevirtual   #361 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:pop             
		stringbuilder.append(((Object) (sessionstate)));
	//   12   26:aload           4
	//   13   28:aload_1         
	//   14   29:invokevirtual   #364 <Method StringBuilder StringBuilder.append(Object)>
	//   15   32:pop             
		CSLog.d(((Object) (this)), stringbuilder.toString());
	//   16   33:aload_0         
	//   17   34:aload           4
	//   18   36:invokevirtual   #368 <Method String StringBuilder.toString()>
	//   19   39:invokestatic    #373 <Method void CSLog.d(Object, String)>
		long l1 = Date.unixTime();
	//   20   42:invokestatic    #432 <Method long Date.unixTime()>
	//   21   45:lstore_2        
		switch(ab.b[sessionstate.ordinal()])
	//*  22   46:getstatic       #434 <Field int[] ab.b>
	//*  23   49:aload_1         
	//*  24   50:invokevirtual   #435 <Method int SessionState.ordinal()>
	//*  25   53:iaload          
		{
	//*  26   54:tableswitch     1 4: default 84
	//	               1 108
	//	               2 136
	//	               3 141
	//	               4 85
		default:
			return;
	//   27   84:return          

		case 4: // '\004'
			if(!p())
	//*  28   85:aload_0         
	//*  29   86:invokevirtual   #437 <Method boolean p()>
	//*  30   89:ifne            146
			{
				M = M + (l1 - X);
	//   31   92:aload_0         
	//   32   93:aload_0         
	//   33   94:getfield        #439 <Field long M>
	//   34   97:lload_2         
	//   35   98:aload_0         
	//   36   99:getfield        #441 <Field long X>
	//   37  102:lsub            
	//   38  103:ladd            
	//   39  104:putfield        #439 <Field long M>
				return;
	//   40  107:return          
			}
			break;

		case 1: // '\001'
			if(Y != null)
	//*  41  108:aload_0         
	//*  42  109:getfield        #443 <Field Runnable Y>
	//*  43  112:ifnull          131
			{
				f.removeEnqueuedTask(Y);
	//   44  115:aload_0         
	//   45  116:getfield        #445 <Field TaskExecutor f>
	//   46  119:aload_0         
	//   47  120:getfield        #443 <Field Runnable Y>
	//   48  123:invokevirtual   #451 <Method void TaskExecutor.removeEnqueuedTask(Runnable)>
				Y = null;
	//   49  126:aload_0         
	//   50  127:aconst_null     
	//   51  128:putfield        #443 <Field Runnable Y>
			}
			U = l1;
	//   52  131:aload_0         
	//   53  132:lload_2         
	//   54  133:putfield        #453 <Field long U>
			// fall through

		case 2: // '\002'
			T = l1;
	//   55  136:aload_0         
	//   56  137:lload_2         
	//   57  138:putfield        #455 <Field long T>
			// fall through

		case 3: // '\003'
			S = l1;
	//   58  141:aload_0         
	//   59  142:lload_2         
	//   60  143:putfield        #457 <Field long S>
			break;
		}
	//   61  146:return          
	}

	protected void a(SessionState sessionstate, SessionState sessionstate1)
	{
	//    0    0:return          
	}

	void a(EventType eventtype, HashMap hashmap)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(z())
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #461 <Method boolean z()>
	//*   6   12:ifeq            20
		{
			x();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #463 <Method void x()>
			return;
	//    9   19:return          
		}
		y();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #465 <Method void y()>
		if(!n && eventtype != EventType.START)
	//*  12   24:aload_0         
	//*  13   25:getfield        #104 <Field boolean n>
	//*  14   28:ifne            65
	//*  15   31:aload_1         
	//*  16   32:getstatic       #419 <Field EventType EventType.START>
	//*  17   35:if_acmpeq       65
			g.sendMeasurmement(a(EventType.START, new HashMap(), Z), false);
	//   18   38:aload_0         
	//   19   39:getfield        #304 <Field MeasurementDispatcher g>
	//   20   42:aload_0         
	//   21   43:getstatic       #419 <Field EventType EventType.START>
	//   22   46:new             #153 <Class HashMap>
	//   23   49:dup             
	//   24   50:invokespecial   #154 <Method void HashMap()>
	//   25   53:aload_0         
	//   26   54:getfield        #467 <Field String Z>
	//   27   57:invokevirtual   #469 <Method Measurement a(EventType, HashMap, String)>
	//   28   60:iconst_0        
	//   29   61:invokevirtual   #475 <Method boolean MeasurementDispatcher.sendMeasurmement(Measurement, boolean)>
	//   30   64:pop             
		if(eventtype != EventType.CLOSE)
	//*  31   65:aload_1         
	//*  32   66:getstatic       #478 <Field EventType EventType.CLOSE>
	//*  33   69:if_acmpeq       94
			g.sendMeasurmement(a(eventtype, Utils.mapOfStrings(((java.util.Map) (hashmap))), Z), false);
	//   34   72:aload_0         
	//   35   73:getfield        #304 <Field MeasurementDispatcher g>
	//   36   76:aload_0         
	//   37   77:aload_1         
	//   38   78:aload_2         
	//   39   79:invokestatic    #484 <Method HashMap Utils.mapOfStrings(java.util.Map)>
	//   40   82:aload_0         
	//   41   83:getfield        #467 <Field String Z>
	//   42   86:invokevirtual   #469 <Method Measurement a(EventType, HashMap, String)>
	//   43   89:iconst_0        
	//   44   90:invokevirtual   #475 <Method boolean MeasurementDispatcher.sendMeasurmement(Measurement, boolean)>
	//   45   93:pop             
	//   46   94:return          
	}

	protected void a(Storage storage)
	{
		A();
	//    0    0:aload_0         
	//    1    1:invokespecial   #487 <Method void A()>
		g.loadEventData();
	//    2    4:aload_0         
	//    3    5:getfield        #304 <Field MeasurementDispatcher g>
	//    4    8:invokevirtual   #490 <Method void MeasurementDispatcher.loadEventData()>
	//    5   11:return          
	}

	void a(String s1)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		int i1 = s1.indexOf('?');
	//    4    8:aload_1         
	//    5    9:bipush          63
	//    6   11:invokevirtual   #496 <Method int String.indexOf(int)>
	//    7   14:istore_2        
		Object obj;
		if(i1 >= 0)
	//*   8   15:iload_2         
	//*   9   16:iflt            144
		{
			obj = ((Object) (s1));
	//   10   19:aload_1         
	//   11   20:astore          5
			if(i1 < s1.length() - 1)
	//*  12   22:iload_2         
	//*  13   23:aload_1         
	//*  14   24:invokevirtual   #499 <Method int String.length()>
	//*  15   27:iconst_1        
	//*  16   28:isub            
	//*  17   29:icmpge          175
			{
				int k1 = i1 + 1;
	//   18   32:iload_2         
	//   19   33:iconst_1        
	//   20   34:iadd            
	//   21   35:istore_3        
				String as[] = s1.substring(k1).split("&");
	//   22   36:aload_1         
	//   23   37:iload_3         
	//   24   38:invokevirtual   #503 <Method String String.substring(int)>
	//   25   41:ldc2            #505 <String "&">
	//   26   44:invokevirtual   #509 <Method String[] String.split(String)>
	//   27   47:astore          7
				int l1 = as.length;
	//   28   49:aload           7
	//   29   51:arraylength     
	//   30   52:istore          4
				for(int j1 = 0; j1 < l1; j1++)
	//*  31   54:iconst_0        
	//*  32   55:istore_2        
	//*  33   56:iload_2         
	//*  34   57:iload           4
	//*  35   59:icmpge          133
				{
					obj = ((Object) (as[j1].split("=")));
	//   36   62:aload           7
	//   37   64:iload_2         
	//   38   65:aaload          
	//   39   66:ldc2            #511 <String "=">
	//   40   69:invokevirtual   #509 <Method String[] String.split(String)>
	//   41   72:astore          5
					String s2;
					if(obj.length == 2)
	//*  42   74:aload           5
	//*  43   76:arraylength     
	//*  44   77:iconst_2        
	//*  45   78:icmpne          105
					{
						s2 = ((String) (obj[0]));
	//   46   81:aload           5
	//   47   83:iconst_0        
	//   48   84:aaload          
	//   49   85:astore          6
						obj = ((Object) (obj[1]));
	//   50   87:aload           5
	//   51   89:iconst_1        
	//   52   90:aaload          
	//   53   91:astore          5
					} else
	//*  54   93:aload_0         
	//*  55   94:aload           6
	//*  56   96:aload           5
	//*  57   98:iconst_0        
	//*  58   99:invokevirtual   #515 <Method void setLabel(String, String, boolean)>
	//*  59  102:goto            126
					{
						if(obj.length != 1)
							continue;
	//   60  105:aload           5
	//   61  107:arraylength     
	//   62  108:iconst_1        
	//   63  109:icmpne          126
						s2 = "name";
	//   64  112:ldc2            #517 <String "name">
	//   65  115:astore          6
						obj = ((Object) (obj[0]));
	//   66  117:aload           5
	//   67  119:iconst_0        
	//   68  120:aaload          
	//   69  121:astore          5
					}
					setLabel(s2, ((String) (obj)), false);
				}

	//   70  123:goto            93
	//   71  126:iload_2         
	//   72  127:iconst_1        
	//   73  128:iadd            
	//   74  129:istore_2        
	//*  75  130:goto            56
				obj = ((Object) (s1.substring(0, k1)));
	//   76  133:aload_1         
	//   77  134:iconst_0        
	//   78  135:iload_3         
	//   79  136:invokevirtual   #520 <Method String String.substring(int, int)>
	//   80  139:astore          5
			}
		} else
	//*  81  141:goto            175
		{
			obj = ((Object) (new StringBuilder()));
	//   82  144:new             #354 <Class StringBuilder>
	//   83  147:dup             
	//   84  148:invokespecial   #355 <Method void StringBuilder()>
	//   85  151:astore          5
			((StringBuilder) (obj)).append(s1);
	//   86  153:aload           5
	//   87  155:aload_1         
	//   88  156:invokevirtual   #361 <Method StringBuilder StringBuilder.append(String)>
	//   89  159:pop             
			((StringBuilder) (obj)).append('?');
	//   90  160:aload           5
	//   91  162:bipush          63
	//   92  164:invokevirtual   #523 <Method StringBuilder StringBuilder.append(char)>
	//   93  167:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   94  168:aload           5
	//   95  170:invokevirtual   #368 <Method String StringBuilder.toString()>
	//   96  173:astore          5
		}
		Z = ((String) (obj));
	//   97  175:aload_0         
	//   98  176:aload           5
	//   99  178:putfield        #467 <Field String Z>
	//  100  181:return          
	}

	void a(String s1, String s2)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #164 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #165 <Method void ArrayList()>
	//    3    7:astore_3        
		arraylist.add(((Object) (s2)));
	//    4    8:aload_3         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #171 <Method boolean ArrayList.add(Object)>
	//    7   13:pop             
		a(s1, arraylist);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_3         
	//   11   17:invokevirtual   #178 <Method void a(String, ArrayList)>
	//   12   20:return          
	}

	void a(String s1, ArrayList arraylist)
	{
		arraylist = ((ArrayList) (arraylist.iterator()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #527 <Method Iterator ArrayList.iterator()>
	//    2    4:astore_2        
		do
		{
			if(!((Iterator) (arraylist)).hasNext())
				break;
	//    3    5:aload_2         
	//    4    6:invokeinterface #532 <Method boolean Iterator.hasNext()>
	//    5   11:ifeq            73
			String s2 = (String)((Iterator) (arraylist)).next();
	//    6   14:aload_2         
	//    7   15:invokeinterface #536 <Method Object Iterator.next()>
	//    8   20:checkcast       #492 <Class String>
	//    9   23:astore_3        
			String s3 = b.get(s1);
	//   10   24:aload_0         
	//   11   25:getfield        #205 <Field Storage b>
	//   12   28:aload_1         
	//   13   29:invokevirtual   #223 <Method String Storage.get(String)>
	//   14   32:astore          4
			String s4 = b.get(s2);
	//   15   34:aload_0         
	//   16   35:getfield        #205 <Field Storage b>
	//   17   38:aload_3         
	//   18   39:invokevirtual   #223 <Method String Storage.get(String)>
	//   19   42:astore          5
			if(Utils.isNotEmpty(s3) && Utils.isEmpty(s4))
	//*  20   44:aload           4
	//*  21   46:invokestatic    #540 <Method boolean Utils.isNotEmpty(String)>
	//*  22   49:ifeq            5
	//*  23   52:aload           5
	//*  24   54:invokestatic    #543 <Method boolean Utils.isEmpty(String)>
	//*  25   57:ifeq            5
				b.set(s2, s3);
	//   26   60:aload_0         
	//   27   61:getfield        #205 <Field Storage b>
	//   28   64:aload_3         
	//   29   65:aload           4
	//   30   67:invokevirtual   #210 <Method void Storage.set(String, String)>
		} while(true);
	//   31   70:goto            5
		b.remove(s1);
	//   32   73:aload_0         
	//   33   74:getfield        #205 <Field Storage b>
	//   34   77:aload_1         
	//   35   78:invokevirtual   #546 <Method void Storage.remove(String)>
	//   36   81:return          
	}

	protected void a(boolean flag)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		long l1 = Date.unixTime();
	//    4    8:invokestatic    #432 <Method long Date.unixTime()>
	//    5   11:lstore_2        
		long l2 = l1 - K;
	//    6   12:lload_2         
	//    7   13:aload_0         
	//    8   14:getfield        #550 <Field long K>
	//    9   17:lsub            
	//   10   18:lstore          4
		switch(ab.a[y.ordinal()])
	//*  11   20:getstatic       #378 <Field int[] ab.a>
	//*  12   23:aload_0         
	//*  13   24:getfield        #113 <Field ApplicationState y>
	//*  14   27:invokevirtual   #382 <Method int ApplicationState.ordinal()>
	//*  15   30:iaload          
		{
	//*  16   31:tableswitch     1 3: default 56
	//	               1 109
	//	               2 84
	//	               3 59
	//*  17   56:goto            131
		case 3: // '\003'
			G = G + l2;
	//   18   59:aload_0         
	//   19   60:aload_0         
	//   20   61:getfield        #552 <Field long G>
	//   21   64:lload           4
	//   22   66:ladd            
	//   23   67:putfield        #552 <Field long G>
			C = C + l2;
	//   24   70:aload_0         
	//   25   71:aload_0         
	//   26   72:getfield        #554 <Field long C>
	//   27   75:lload           4
	//   28   77:ladd            
	//   29   78:putfield        #554 <Field long C>
			break;

	//*  30   81:goto            131
		case 2: // '\002'
			F = F + l2;
	//   31   84:aload_0         
	//   32   85:aload_0         
	//   33   86:getfield        #556 <Field long F>
	//   34   89:lload           4
	//   35   91:ladd            
	//   36   92:putfield        #556 <Field long F>
			D = D + l2;
	//   37   95:aload_0         
	//   38   96:aload_0         
	//   39   97:getfield        #558 <Field long D>
	//   40  100:lload           4
	//   41  102:ladd            
	//   42  103:putfield        #558 <Field long D>
			break;

	//*  43  106:goto            131
		case 1: // '\001'
			H = H + l2;
	//   44  109:aload_0         
	//   45  110:aload_0         
	//   46  111:getfield        #560 <Field long H>
	//   47  114:lload           4
	//   48  116:ladd            
	//   49  117:putfield        #560 <Field long H>
			E = E + l2;
	//   50  120:aload_0         
	//   51  121:aload_0         
	//   52  122:getfield        #562 <Field long E>
	//   53  125:lload           4
	//   54  127:ladd            
	//   55  128:putfield        #562 <Field long E>
			break;
		}
		K = l1;
	//   56  131:aload_0         
	//   57  132:lload_2         
	//   58  133:putfield        #550 <Field long K>
		if(flag)
	//*  59  136:iload_1         
	//*  60  137:ifeq            278
		{
			b.set("lastApplicationAccumulationTimestamp", Long.toString(K));
	//   61  140:aload_0         
	//   62  141:getfield        #205 <Field Storage b>
	//   63  144:ldc1            #167 <String "lastApplicationAccumulationTimestamp">
	//   64  146:aload_0         
	//   65  147:getfield        #550 <Field long K>
	//   66  150:invokestatic    #567 <Method String Long.toString(long)>
	//   67  153:invokevirtual   #210 <Method void Storage.set(String, String)>
			b.set("foregroundTransitionsCount", Long.toString(B.get()));
	//   68  156:aload_0         
	//   69  157:getfield        #205 <Field Storage b>
	//   70  160:ldc1            #182 <String "foregroundTransitionsCount">
	//   71  162:aload_0         
	//   72  163:getfield        #137 <Field AtomicInteger B>
	//   73  166:invokevirtual   #569 <Method int AtomicInteger.get()>
	//   74  169:i2l             
	//   75  170:invokestatic    #567 <Method String Long.toString(long)>
	//   76  173:invokevirtual   #210 <Method void Storage.set(String, String)>
			b.set("accumulatedForegroundTime", Long.toString(G));
	//   77  176:aload_0         
	//   78  177:getfield        #205 <Field Storage b>
	//   79  180:ldc2            #571 <String "accumulatedForegroundTime">
	//   80  183:aload_0         
	//   81  184:getfield        #552 <Field long G>
	//   82  187:invokestatic    #567 <Method String Long.toString(long)>
	//   83  190:invokevirtual   #210 <Method void Storage.set(String, String)>
			b.set("accumulatedBackgroundTime", Long.toString(F));
	//   84  193:aload_0         
	//   85  194:getfield        #205 <Field Storage b>
	//   86  197:ldc2            #573 <String "accumulatedBackgroundTime">
	//   87  200:aload_0         
	//   88  201:getfield        #556 <Field long F>
	//   89  204:invokestatic    #567 <Method String Long.toString(long)>
	//   90  207:invokevirtual   #210 <Method void Storage.set(String, String)>
			b.set("accumulatedInactiveTime", Long.toString(H));
	//   91  210:aload_0         
	//   92  211:getfield        #205 <Field Storage b>
	//   93  214:ldc2            #575 <String "accumulatedInactiveTime">
	//   94  217:aload_0         
	//   95  218:getfield        #560 <Field long H>
	//   96  221:invokestatic    #567 <Method String Long.toString(long)>
	//   97  224:invokevirtual   #210 <Method void Storage.set(String, String)>
			b.set("totalForegroundTime", Long.toString(C));
	//   98  227:aload_0         
	//   99  228:getfield        #205 <Field Storage b>
	//  100  231:ldc2            #577 <String "totalForegroundTime">
	//  101  234:aload_0         
	//  102  235:getfield        #554 <Field long C>
	//  103  238:invokestatic    #567 <Method String Long.toString(long)>
	//  104  241:invokevirtual   #210 <Method void Storage.set(String, String)>
			b.set("totalBackgroundTime", Long.toString(D));
	//  105  244:aload_0         
	//  106  245:getfield        #205 <Field Storage b>
	//  107  248:ldc2            #579 <String "totalBackgroundTime">
	//  108  251:aload_0         
	//  109  252:getfield        #558 <Field long D>
	//  110  255:invokestatic    #567 <Method String Long.toString(long)>
	//  111  258:invokevirtual   #210 <Method void Storage.set(String, String)>
			b.set("totalInactiveTime", Long.toString(E));
	//  112  261:aload_0         
	//  113  262:getfield        #205 <Field Storage b>
	//  114  265:ldc2            #581 <String "totalInactiveTime">
	//  115  268:aload_0         
	//  116  269:getfield        #562 <Field long E>
	//  117  272:invokestatic    #567 <Method String Long.toString(long)>
	//  118  275:invokevirtual   #210 <Method void Storage.set(String, String)>
		}
	//  119  278:return          
	}

	public void allowLiveTransmission(TransmissionMode transmissionmode, boolean flag)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(transmissionmode == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		if(!flag)
	//*   7   13:iload_2         
	//*   8   14:ifne            23
		{
			a(transmissionmode);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokespecial   #227 <Method void a(TransmissionMode)>
			return;
	//   12   22:return          
		}
		if(f == null)
	//*  13   23:aload_0         
	//*  14   24:getfield        #445 <Field TaskExecutor f>
	//*  15   27:ifnonnull       31
			return;
	//   16   30:return          
		if(getLiveTransmissionMode() != transmissionmode)
	//*  17   31:aload_0         
	//*  18   32:invokevirtual   #587 <Method TransmissionMode getLiveTransmissionMode()>
	//*  19   35:aload_1         
	//*  20   36:if_acmpeq       57
			f.execute(((Runnable) (new i(this, transmissionmode))), flag);
	//   21   39:aload_0         
	//   22   40:getfield        #445 <Field TaskExecutor f>
	//   23   43:new             #589 <Class i>
	//   24   46:dup             
	//   25   47:aload_0         
	//   26   48:aload_1         
	//   27   49:invokespecial   #591 <Method void i(Core, TransmissionMode)>
	//   28   52:iload_2         
	//   29   53:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   30   56:pop             
	//   31   57:return          
	}

	public void allowOfflineTransmission(TransmissionMode transmissionmode, boolean flag)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(transmissionmode == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		if(!flag)
	//*   7   13:iload_2         
	//*   8   14:ifne            23
		{
			b(transmissionmode);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokespecial   #239 <Method void b(TransmissionMode)>
			return;
	//   12   22:return          
		}
		if(f == null)
	//*  13   23:aload_0         
	//*  14   24:getfield        #445 <Field TaskExecutor f>
	//*  15   27:ifnonnull       31
			return;
	//   16   30:return          
		if(getOfflineTransmissionMode() != transmissionmode)
	//*  17   31:aload_0         
	//*  18   32:invokevirtual   #599 <Method TransmissionMode getOfflineTransmissionMode()>
	//*  19   35:aload_1         
	//*  20   36:if_acmpeq       57
			f.execute(((Runnable) (new j(this, transmissionmode))), flag);
	//   21   39:aload_0         
	//   22   40:getfield        #445 <Field TaskExecutor f>
	//   23   43:new             #601 <Class j>
	//   24   46:dup             
	//   25   47:aload_0         
	//   26   48:aload_1         
	//   27   49:invokespecial   #602 <Method void j(Core, TransmissionMode)>
	//   28   52:iload_2         
	//   29   53:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   30   56:pop             
	//   31   57:return          
	}

	protected Storage b()
	{
		return new Storage(ab);
	//    0    0:new             #207 <Class Storage>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #336 <Field Context ab>
	//    4    8:invokespecial   #605 <Method void Storage(Context)>
	//    5   11:areturn         
	}

	protected void b(ApplicationState applicationstate)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #354 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #355 <Method void StringBuilder()>
	//    7   15:astore_2        
		stringbuilder.append("Entering application state: ");
	//    8   16:aload_2         
	//    9   17:ldc2            #609 <String "Entering application state: ">
	//   10   20:invokevirtual   #361 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		stringbuilder.append(((Object) (applicationstate)));
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #364 <Method StringBuilder StringBuilder.append(Object)>
	//   15   29:pop             
		CSLog.d(((Object) (this)), stringbuilder.toString());
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:invokevirtual   #368 <Method String StringBuilder.toString()>
	//   19   35:invokestatic    #373 <Method void CSLog.d(Object, String)>
		switch(ab.a[applicationstate.ordinal()])
	//*  20   38:getstatic       #378 <Field int[] ab.a>
	//*  21   41:aload_1         
	//*  22   42:invokevirtual   #382 <Method int ApplicationState.ordinal()>
	//*  23   45:iaload          
		{
	//*  24   46:tableswitch     1 3: default 72
	//	               1 98
	//	               2 86
	//	               3 73
		default:
			return;
	//   25   72:return          

		case 3: // '\003'
			v();
	//   26   73:aload_0         
	//   27   74:invokevirtual   #348 <Method void v()>
			B.getAndIncrement();
	//   28   77:aload_0         
	//   29   78:getfield        #137 <Field AtomicInteger B>
	//   30   81:invokevirtual   #612 <Method int AtomicInteger.getAndIncrement()>
	//   31   84:pop             
			return;
	//   32   85:return          

		case 2: // '\002'
			if(!l)
	//*  33   86:aload_0         
	//*  34   87:getfield        #100 <Field boolean l>
	//*  35   90:ifne            134
			{
				v();
	//   36   93:aload_0         
	//   37   94:invokevirtual   #348 <Method void v()>
				return;
	//   38   97:return          
			}
			break;

		case 1: // '\001'
			h.stop();
	//   39   98:aload_0         
	//   40   99:getfield        #332 <Field ConnectivityChangeReceiver h>
	//   41  102:invokevirtual   #615 <Method void ConnectivityChangeReceiver.stop()>
			c.stop();
	//   42  105:aload_0         
	//   43  106:getfield        #317 <Field KeepAlive c>
	//   44  109:invokevirtual   #616 <Method void KeepAlive.stop()>
			d.stop();
	//   45  112:aload_0         
	//   46  113:getfield        #327 <Field CacheFlusher d>
	//   47  116:invokevirtual   #617 <Method void CacheFlusher.stop()>
			try
			{
				ab.unregisterReceiver(((android.content.BroadcastReceiver) (h)));
	//   48  119:aload_0         
	//   49  120:getfield        #336 <Field Context ab>
	//   50  123:aload_0         
	//   51  124:getfield        #332 <Field ConnectivityChangeReceiver h>
	//   52  127:invokevirtual   #621 <Method void Context.unregisterReceiver(android.content.BroadcastReceiver)>
			}
	//*  53  130:aload_0         
	//*  54  131:invokevirtual   #341 <Method void w()>
	//*  55  134:return          
			// Misplaced declaration of an exception variable
			catch(ApplicationState applicationstate) { }
	//   56  135:astore_1        
			w();
			break;
		}
	//*  57  136:goto            130
	}

	protected void b(SessionState sessionstate)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #354 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #355 <Method void StringBuilder()>
	//    7   15:astore_2        
		stringbuilder.append("Entering session state: ");
	//    8   16:aload_2         
	//    9   17:ldc2            #623 <String "Entering session state: ">
	//   10   20:invokevirtual   #361 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		stringbuilder.append(((Object) (sessionstate)));
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #364 <Method StringBuilder StringBuilder.append(Object)>
	//   15   29:pop             
		CSLog.d(((Object) (this)), stringbuilder.toString());
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:invokevirtual   #368 <Method String StringBuilder.toString()>
	//   19   35:invokestatic    #373 <Method void CSLog.d(Object, String)>
		switch(ab.b[sessionstate.ordinal()])
	//*  20   38:getstatic       #434 <Field int[] ab.b>
	//*  21   41:aload_1         
	//*  22   42:invokevirtual   #435 <Method int SessionState.ordinal()>
	//*  23   45:iaload          
		{
	//*  24   46:tableswitch     1 3: default 72
	//	               1 73
	//	               2 81
	//	               3 85
		default:
			return;
	//   25   72:return          

		case 1: // '\001'
			q();
	//   26   73:aload_0         
	//   27   74:invokevirtual   #625 <Method void q()>
			o();
	//   28   77:aload_0         
	//   29   78:invokevirtual   #627 <Method void o()>
			// fall through

		case 2: // '\002'
			r();
	//   30   81:aload_0         
	//   31   82:invokevirtual   #629 <Method void r()>
			// fall through

		case 3: // '\003'
			p();
	//   32   85:aload_0         
	//   33   86:invokevirtual   #437 <Method boolean p()>
	//   34   89:pop             
			break;
		}
	//   35   90:return          
	}

	protected void b(boolean flag)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		long l1 = Date.unixTime();
	//    4    8:invokestatic    #432 <Method long Date.unixTime()>
	//    5   11:lstore_2        
		long l2 = l1 - X;
	//    6   12:lload_2         
	//    7   13:aload_0         
	//    8   14:getfield        #441 <Field long X>
	//    9   17:lsub            
	//   10   18:lstore          4
		switch(ab.b[L.ordinal()])
	//*  11   20:getstatic       #434 <Field int[] ab.b>
	//*  12   23:aload_0         
	//*  13   24:getfield        #119 <Field SessionState L>
	//*  14   27:invokevirtual   #435 <Method int SessionState.ordinal()>
	//*  15   30:iaload          
		{
	//*  16   31:tableswitch     1 3: default 56
	//	               1 59
	//	               2 75
	//	               3 91
	//*  17   56:goto            107
		case 1: // '\001'
			O = O + l2;
	//   18   59:aload_0         
	//   19   60:aload_0         
	//   20   61:getfield        #631 <Field long O>
	//   21   64:lload           4
	//   22   66:ladd            
	//   23   67:putfield        #631 <Field long O>
			U = l1;
	//   24   70:aload_0         
	//   25   71:lload_2         
	//   26   72:putfield        #453 <Field long U>
			// fall through

		case 2: // '\002'
			N = N + l2;
	//   27   75:aload_0         
	//   28   76:aload_0         
	//   29   77:getfield        #633 <Field long N>
	//   30   80:lload           4
	//   31   82:ladd            
	//   32   83:putfield        #633 <Field long N>
			T = l1;
	//   33   86:aload_0         
	//   34   87:lload_2         
	//   35   88:putfield        #455 <Field long T>
			// fall through

		case 3: // '\003'
			M = M + l2;
	//   36   91:aload_0         
	//   37   92:aload_0         
	//   38   93:getfield        #439 <Field long M>
	//   39   96:lload           4
	//   40   98:ladd            
	//   41   99:putfield        #439 <Field long M>
			S = l1;
	//   42  102:aload_0         
	//   43  103:lload_2         
	//   44  104:putfield        #457 <Field long S>
			// fall through

		default:
			X = l1;
	//   45  107:aload_0         
	//   46  108:lload_2         
	//   47  109:putfield        #441 <Field long X>
			break;
		}
		if(flag)
	//*  48  112:iload_1         
	//*  49  113:ifeq            355
		{
			b.set("lastSessionAccumulationTimestamp", Long.toString(X));
	//   50  116:aload_0         
	//   51  117:getfield        #205 <Field Storage b>
	//   52  120:ldc1            #173 <String "lastSessionAccumulationTimestamp">
	//   53  122:aload_0         
	//   54  123:getfield        #441 <Field long X>
	//   55  126:invokestatic    #567 <Method String Long.toString(long)>
	//   56  129:invokevirtual   #210 <Method void Storage.set(String, String)>
			b.set("lastApplicationSessionTimestamp", Long.toString(S));
	//   57  132:aload_0         
	//   58  133:getfield        #205 <Field Storage b>
	//   59  136:ldc2            #635 <String "lastApplicationSessionTimestamp">
	//   60  139:aload_0         
	//   61  140:getfield        #457 <Field long S>
	//   62  143:invokestatic    #567 <Method String Long.toString(long)>
	//   63  146:invokevirtual   #210 <Method void Storage.set(String, String)>
			b.set("lastUserSessionTimestamp", Long.toString(T));
	//   64  149:aload_0         
	//   65  150:getfield        #205 <Field Storage b>
	//   66  153:ldc2            #637 <String "lastUserSessionTimestamp">
	//   67  156:aload_0         
	//   68  157:getfield        #455 <Field long T>
	//   69  160:invokestatic    #567 <Method String Long.toString(long)>
	//   70  163:invokevirtual   #210 <Method void Storage.set(String, String)>
			b.set("lastActiveUserSessionTimestamp", Long.toString(U));
	//   71  166:aload_0         
	//   72  167:getfield        #205 <Field Storage b>
	//   73  170:ldc2            #639 <String "lastActiveUserSessionTimestamp">
	//   74  173:aload_0         
	//   75  174:getfield        #453 <Field long U>
	//   76  177:invokestatic    #567 <Method String Long.toString(long)>
	//   77  180:invokevirtual   #210 <Method void Storage.set(String, String)>
			b.set("accumulatedApplicationSessionTime", Long.toString(M));
	//   78  183:aload_0         
	//   79  184:getfield        #205 <Field Storage b>
	//   80  187:ldc2            #641 <String "accumulatedApplicationSessionTime">
	//   81  190:aload_0         
	//   82  191:getfield        #439 <Field long M>
	//   83  194:invokestatic    #567 <Method String Long.toString(long)>
	//   84  197:invokevirtual   #210 <Method void Storage.set(String, String)>
			b.set("accumulatedActiveUserSessionTime", Long.toString(O));
	//   85  200:aload_0         
	//   86  201:getfield        #205 <Field Storage b>
	//   87  204:ldc2            #643 <String "accumulatedActiveUserSessionTime">
	//   88  207:aload_0         
	//   89  208:getfield        #631 <Field long O>
	//   90  211:invokestatic    #567 <Method String Long.toString(long)>
	//   91  214:invokevirtual   #210 <Method void Storage.set(String, String)>
			b.set("accumulatedUserSessionTime", Long.toString(N));
	//   92  217:aload_0         
	//   93  218:getfield        #205 <Field Storage b>
	//   94  221:ldc2            #645 <String "accumulatedUserSessionTime">
	//   95  224:aload_0         
	//   96  225:getfield        #633 <Field long N>
	//   97  228:invokestatic    #567 <Method String Long.toString(long)>
	//   98  231:invokevirtual   #210 <Method void Storage.set(String, String)>
			b.set("activeUserSessionCount", Long.toString(R));
	//   99  234:aload_0         
	//  100  235:getfield        #205 <Field Storage b>
	//  101  238:ldc2            #647 <String "activeUserSessionCount">
	//  102  241:aload_0         
	//  103  242:getfield        #649 <Field int R>
	//  104  245:i2l             
	//  105  246:invokestatic    #567 <Method String Long.toString(long)>
	//  106  249:invokevirtual   #210 <Method void Storage.set(String, String)>
			b.set("userSessionCount", Long.toString(Q));
	//  107  252:aload_0         
	//  108  253:getfield        #205 <Field Storage b>
	//  109  256:ldc2            #651 <String "userSessionCount">
	//  110  259:aload_0         
	//  111  260:getfield        #653 <Field int Q>
	//  112  263:i2l             
	//  113  264:invokestatic    #567 <Method String Long.toString(long)>
	//  114  267:invokevirtual   #210 <Method void Storage.set(String, String)>
			b.set("lastUserInteractionTimestamp", Long.toString(W));
	//  115  270:aload_0         
	//  116  271:getfield        #205 <Field Storage b>
	//  117  274:ldc2            #655 <String "lastUserInteractionTimestamp">
	//  118  277:aload_0         
	//  119  278:getfield        #657 <Field long W>
	//  120  281:invokestatic    #567 <Method String Long.toString(long)>
	//  121  284:invokevirtual   #210 <Method void Storage.set(String, String)>
			b.set("userInteractionCount", Integer.toString(V));
	//  122  287:aload_0         
	//  123  288:getfield        #205 <Field Storage b>
	//  124  291:ldc2            #659 <String "userInteractionCount">
	//  125  294:aload_0         
	//  126  295:getfield        #661 <Field int V>
	//  127  298:invokestatic    #665 <Method String Integer.toString(int)>
	//  128  301:invokevirtual   #210 <Method void Storage.set(String, String)>
			b.set("previousGenesis", Long.toString(J));
	//  129  304:aload_0         
	//  130  305:getfield        #205 <Field Storage b>
	//  131  308:ldc2            #667 <String "previousGenesis">
	//  132  311:aload_0         
	//  133  312:getfield        #669 <Field long J>
	//  134  315:invokestatic    #567 <Method String Long.toString(long)>
	//  135  318:invokevirtual   #210 <Method void Storage.set(String, String)>
			b.set("genesis", Long.toString(I));
	//  136  321:aload_0         
	//  137  322:getfield        #205 <Field Storage b>
	//  138  325:ldc2            #671 <String "genesis">
	//  139  328:aload_0         
	//  140  329:getfield        #673 <Field long I>
	//  141  332:invokestatic    #567 <Method String Long.toString(long)>
	//  142  335:invokevirtual   #210 <Method void Storage.set(String, String)>
			b.set("applicationSessionCountKey", Integer.toString(P));
	//  143  338:aload_0         
	//  144  339:getfield        #205 <Field Storage b>
	//  145  342:ldc2            #675 <String "applicationSessionCountKey">
	//  146  345:aload_0         
	//  147  346:getfield        #677 <Field int P>
	//  148  349:invokestatic    #665 <Method String Integer.toString(int)>
	//  149  352:invokevirtual   #210 <Method void Storage.set(String, String)>
		}
	//  150  355:return          
	}

	protected DispatchQueue c()
	{
		return new DispatchQueue(this);
	//    0    0:new             #679 <Class DispatchQueue>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #682 <Method void DispatchQueue(Core)>
	//    4    8:areturn         
	}

	void c(boolean flag)
	{
		ae = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #151 <Field boolean ae>
	//    3    5:return          
	}

	protected TaskExecutor d()
	{
		return new TaskExecutor(this);
	//    0    0:new             #447 <Class TaskExecutor>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #684 <Method void TaskExecutor(Core)>
	//    4    8:areturn         
	}

	protected void d(boolean flag)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			n = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #104 <Field boolean n>
			return;
	//    7   13:return          
		}
	}

	public void disableAutoUpdate()
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			w();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #341 <Method void w()>
			l = true;
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:putfield        #100 <Field boolean l>
			k = -1L;
	//    9   17:aload_0         
	//   10   18:ldc2w           #686 <Long -1L>
	//   11   21:putfield        #343 <Field long k>
			return;
	//   12   24:return          
		}
	}

	protected MeasurementDispatcher e()
	{
		return new MeasurementDispatcher(this);
	//    0    0:new             #471 <Class MeasurementDispatcher>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #688 <Method void MeasurementDispatcher(Core)>
	//    4    8:areturn         
	}

	public void enableAutoUpdate(int i1, boolean flag, boolean flag1)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(!flag1)
	//*   4    8:iload_3         
	//*   5    9:ifne            19
		{
			a(i1, flag);
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:iload_2         
	//    9   15:invokevirtual   #692 <Method void a(int, boolean)>
			return;
	//   10   18:return          
		}
		if(f == null)
	//*  11   19:aload_0         
	//*  12   20:getfield        #445 <Field TaskExecutor f>
	//*  13   23:ifnonnull       27
		{
			return;
	//   14   26:return          
		} else
		{
			f.execute(((Runnable) (new x(this, i1, flag))), flag1);
	//   15   27:aload_0         
	//   16   28:getfield        #445 <Field TaskExecutor f>
	//   17   31:new             #694 <Class x>
	//   18   34:dup             
	//   19   35:aload_0         
	//   20   36:iload_1         
	//   21   37:iload_2         
	//   22   38:invokespecial   #697 <Method void x(Core, int, boolean)>
	//   23   41:iload_3         
	//   24   42:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   25   45:pop             
			return;
	//   26   46:return          
		}
	}

	protected KeepAlive f()
	{
		return new KeepAlive(this, 0x5265c00L);
	//    0    0:new             #392 <Class KeepAlive>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc2w           #698 <Long 0x5265c00L>
	//    4    8:invokespecial   #702 <Method void KeepAlive(Core, long)>
	//    5   11:areturn         
	}

	public void flush(boolean flag)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(f == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #445 <Field TaskExecutor f>
	//*   6   12:ifnonnull       16
		{
			return;
	//    7   15:return          
		} else
		{
			f.execute(((Runnable) (new v(this))), flag);
	//    8   16:aload_0         
	//    9   17:getfield        #445 <Field TaskExecutor f>
	//   10   20:new             #705 <Class v>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokespecial   #706 <Method void v(Core)>
	//   14   28:iload_1         
	//   15   29:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   16   32:pop             
			return;
	//   17   33:return          
		}
	}

	protected OfflineMeasurementsCache g()
	{
		return new OfflineMeasurementsCache(this);
	//    0    0:new             #708 <Class OfflineMeasurementsCache>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #709 <Method void OfflineMeasurementsCache(Core)>
	//    4    8:areturn         
	}

	public int getActiveUserSessionCountDelta(boolean flag)
	{
		int i1;
		if(R >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #649 <Field int R>
	//*   2    4:iflt            51
		{
			int j1 = R;
	//    3    7:aload_0         
	//    4    8:getfield        #649 <Field int R>
	//    5   11:istore_3        
			i1 = j1;
	//    6   12:iload_3         
	//    7   13:istore_2        
			if(flag)
	//*   8   14:iload_1         
	//*   9   15:ifeq            53
			{
				i1 = j1;
	//   10   18:iload_3         
	//   11   19:istore_2        
				if(an)
	//*  12   20:aload_0         
	//*  13   21:getfield        #125 <Field boolean an>
	//*  14   24:ifeq            53
				{
					R = 0;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #649 <Field int R>
					b.set("activeUserSessionCount", Integer.toString(R));
	//   18   32:aload_0         
	//   19   33:getfield        #205 <Field Storage b>
	//   20   36:ldc2            #647 <String "activeUserSessionCount">
	//   21   39:aload_0         
	//   22   40:getfield        #649 <Field int R>
	//   23   43:invokestatic    #665 <Method String Integer.toString(int)>
	//   24   46:invokevirtual   #210 <Method void Storage.set(String, String)>
					return j1;
	//   25   49:iload_3         
	//   26   50:ireturn         
				}
			}
		} else
		{
			i1 = -1;
	//   27   51:iconst_m1       
	//   28   52:istore_2        
		}
		return i1;
	//   29   53:iload_2         
	//   30   54:ireturn         
	}

	public long getActiveUserSessionTimeDelta(boolean flag)
	{
		long l1 = O;
	//    0    0:aload_0         
	//    1    1:getfield        #631 <Field long O>
	//    2    4:lstore_2        
		if(flag && an)
	//*   3    5:iload_1         
	//*   4    6:ifeq            38
	//*   5    9:aload_0         
	//*   6   10:getfield        #125 <Field boolean an>
	//*   7   13:ifeq            38
		{
			O = 0L;
	//    8   16:aload_0         
	//    9   17:lconst_0        
	//   10   18:putfield        #631 <Field long O>
			b.set("accumulatedActiveUserSessionTime", Long.toString(O));
	//   11   21:aload_0         
	//   12   22:getfield        #205 <Field Storage b>
	//   13   25:ldc2            #643 <String "accumulatedActiveUserSessionTime">
	//   14   28:aload_0         
	//   15   29:getfield        #631 <Field long O>
	//   16   32:invokestatic    #567 <Method String Long.toString(long)>
	//   17   35:invokevirtual   #210 <Method void Storage.set(String, String)>
		}
		return l1;
	//   18   38:lload_2         
	//   19   39:lreturn         
	}

	public Context getAppContext()
	{
		return ab;
	//    0    0:aload_0         
	//    1    1:getfield        #336 <Field Context ab>
	//    2    4:areturn         
	}

	public String getAppName()
	{
		Object obj;
		PackageManager packagemanager;
		if(aa != null && aa.length() != 0 || ab == null)
			break MISSING_BLOCK_LABEL_81;
	//    0    0:aload_0         
	//    1    1:getfield        #262 <Field String aa>
	//    2    4:ifnull          17
	//    3    7:aload_0         
	//    4    8:getfield        #262 <Field String aa>
	//    5   11:invokevirtual   #499 <Method int String.length()>
	//    6   14:ifne            81
	//    7   17:aload_0         
	//    8   18:getfield        #336 <Field Context ab>
	//    9   21:ifnull          81
		obj = ((Object) (ab.getPackageName()));
	//   10   24:aload_0         
	//   11   25:getfield        #336 <Field Context ab>
	//   12   28:invokevirtual   #721 <Method String Context.getPackageName()>
	//   13   31:astore_1        
		packagemanager = ab.getPackageManager();
	//   14   32:aload_0         
	//   15   33:getfield        #336 <Field Context ab>
	//   16   36:invokevirtual   #725 <Method PackageManager Context.getPackageManager()>
	//   17   39:astore_2        
		obj = ((Object) (packagemanager.getApplicationLabel(packagemanager.getApplicationInfo(((String) (obj)), 0))));
	//   18   40:aload_2         
	//   19   41:aload_2         
	//   20   42:aload_1         
	//   21   43:iconst_0        
	//   22   44:invokevirtual   #731 <Method android.content.pm.ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   23   47:invokevirtual   #735 <Method CharSequence PackageManager.getApplicationLabel(android.content.pm.ApplicationInfo)>
	//   24   50:astore_1        
		if(obj != null)
	//*  25   51:aload_1         
	//*  26   52:ifnull          81
			try
			{
				setAppName(obj.toString(), false);
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:invokevirtual   #736 <Method String Object.toString()>
	//   30   60:iconst_0        
	//   31   61:invokevirtual   #740 <Method void setAppName(String, boolean)>
			}
	//*  32   64:goto            81
	//*  33   67:aload_0         
	//*  34   68:aload_0         
	//*  35   69:getfield        #205 <Field Storage b>
	//*  36   72:ldc2            #264 <String "appName">
	//*  37   75:invokevirtual   #223 <Method String Storage.get(String)>
	//*  38   78:putfield        #262 <Field String aa>
	//*  39   81:aload_0         
	//*  40   82:getfield        #262 <Field String aa>
	//*  41   85:areturn         
			// Misplaced declaration of an exception variable
			catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
			{
				aa = b.get("appName");
			}
		android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
		return aa;
	//*  42   86:astore_1        
	//*  43   87:goto            67
	}

	public int getApplicationSessionCountDelta(boolean flag)
	{
		int i1 = P;
	//    0    0:aload_0         
	//    1    1:getfield        #677 <Field int P>
	//    2    4:istore_2        
		if(flag && an)
	//*   3    5:iload_1         
	//*   4    6:ifeq            38
	//*   5    9:aload_0         
	//*   6   10:getfield        #125 <Field boolean an>
	//*   7   13:ifeq            38
		{
			P = 0;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #677 <Field int P>
			b.set("applicationSessionCountKey", Integer.toString(P));
	//   11   21:aload_0         
	//   12   22:getfield        #205 <Field Storage b>
	//   13   25:ldc2            #675 <String "applicationSessionCountKey">
	//   14   28:aload_0         
	//   15   29:getfield        #677 <Field int P>
	//   16   32:invokestatic    #665 <Method String Integer.toString(int)>
	//   17   35:invokevirtual   #210 <Method void Storage.set(String, String)>
		}
		return i1;
	//   18   38:iload_2         
	//   19   39:ireturn         
	}

	public long getApplicationSessionTimeDelta(boolean flag)
	{
		long l1 = M;
	//    0    0:aload_0         
	//    1    1:getfield        #439 <Field long M>
	//    2    4:lstore_2        
		if(flag && an)
	//*   3    5:iload_1         
	//*   4    6:ifeq            38
	//*   5    9:aload_0         
	//*   6   10:getfield        #125 <Field boolean an>
	//*   7   13:ifeq            38
		{
			M = 0L;
	//    8   16:aload_0         
	//    9   17:lconst_0        
	//   10   18:putfield        #439 <Field long M>
			b.set("accumulatedApplicationSessionTime", Long.toString(M));
	//   11   21:aload_0         
	//   12   22:getfield        #205 <Field Storage b>
	//   13   25:ldc2            #641 <String "accumulatedApplicationSessionTime">
	//   14   28:aload_0         
	//   15   29:getfield        #439 <Field long M>
	//   16   32:invokestatic    #567 <Method String Long.toString(long)>
	//   17   35:invokevirtual   #210 <Method void Storage.set(String, String)>
		}
		return l1;
	//   18   38:lload_2         
	//   19   39:lreturn         
	}

	public ApplicationState getApplicationState()
	{
		return y;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field ApplicationState y>
	//    2    4:areturn         
	}

	public String getAutoStartLabel(String s1)
	{
		return (String)ad.get(((Object) (s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field HashMap ad>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #748 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #492 <Class String>
	//    5   11:areturn         
	}

	public HashMap getAutoStartLabels()
	{
		return ad;
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field HashMap ad>
	//    2    4:areturn         
	}

	public long getAutoUpdateInterval()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #343 <Field long k>
	//    2    4:lreturn         
	}

	public long getBackgroundTimeDelta(boolean flag)
	{
		long l1 = F;
	//    0    0:aload_0         
	//    1    1:getfield        #556 <Field long F>
	//    2    4:lstore_2        
		if(flag && an)
	//*   3    5:iload_1         
	//*   4    6:ifeq            38
	//*   5    9:aload_0         
	//*   6   10:getfield        #125 <Field boolean an>
	//*   7   13:ifeq            38
		{
			F = 0L;
	//    8   16:aload_0         
	//    9   17:lconst_0        
	//   10   18:putfield        #556 <Field long F>
			b.set("accumulatedBackgroundTime", Long.toString(F));
	//   11   21:aload_0         
	//   12   22:getfield        #205 <Field Storage b>
	//   13   25:ldc2            #573 <String "accumulatedBackgroundTime">
	//   14   28:aload_0         
	//   15   29:getfield        #556 <Field long F>
	//   16   32:invokestatic    #567 <Method String Long.toString(long)>
	//   17   35:invokevirtual   #210 <Method void Storage.set(String, String)>
		}
		return l1;
	//   18   38:lload_2         
	//   19   39:lreturn         
	}

	public long getBackgroundTotalTime(boolean flag)
	{
		long l1 = D;
	//    0    0:aload_0         
	//    1    1:getfield        #558 <Field long D>
	//    2    4:lstore_2        
		if(flag && an)
	//*   3    5:iload_1         
	//*   4    6:ifeq            38
	//*   5    9:aload_0         
	//*   6   10:getfield        #125 <Field boolean an>
	//*   7   13:ifeq            38
		{
			D = 0L;
	//    8   16:aload_0         
	//    9   17:lconst_0        
	//   10   18:putfield        #558 <Field long D>
			b.set("totalBackgroundTime", Long.toString(D));
	//   11   21:aload_0         
	//   12   22:getfield        #205 <Field Storage b>
	//   13   25:ldc2            #579 <String "totalBackgroundTime">
	//   14   28:aload_0         
	//   15   29:getfield        #558 <Field long D>
	//   16   32:invokestatic    #567 <Method String Long.toString(long)>
	//   17   35:invokevirtual   #210 <Method void Storage.set(String, String)>
		}
		return l1;
	//   18   38:lload_2         
	//   19   39:lreturn         
	}

	public CacheFlusher getCacheFlusher()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #327 <Field CacheFlusher d>
	//    2    4:areturn         
	}

	public long getCacheFlushingInterval()
	{
		return af;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field long af>
	//    2    4:lreturn         
	}

	public int getCacheMaxBatchFiles()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field OfflineMeasurementsCache a>
	//*   2    4:ifnull          15
			return a.getCacheMaxBatchFiles();
	//    3    7:aload_0         
	//    4    8:getfield        #322 <Field OfflineMeasurementsCache a>
	//    5   11:invokevirtual   #759 <Method int OfflineMeasurementsCache.getCacheMaxBatchFiles()>
	//    6   14:ireturn         
		else
			return 100;
	//    7   15:bipush          100
	//    8   17:ireturn         
	}

	public int getCacheMaxFlushesInARow()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field OfflineMeasurementsCache a>
	//*   2    4:ifnull          15
			return a.getCacheMaxPosts();
	//    3    7:aload_0         
	//    4    8:getfield        #322 <Field OfflineMeasurementsCache a>
	//    5   11:invokevirtual   #763 <Method int OfflineMeasurementsCache.getCacheMaxPosts()>
	//    6   14:ireturn         
		else
			return 10;
	//    7   15:bipush          10
	//    8   17:ireturn         
	}

	public int getCacheMaxMeasurements()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field OfflineMeasurementsCache a>
	//*   2    4:ifnull          15
			return a.getCacheMaxMeasurements();
	//    3    7:aload_0         
	//    4    8:getfield        #322 <Field OfflineMeasurementsCache a>
	//    5   11:invokevirtual   #766 <Method int OfflineMeasurementsCache.getCacheMaxMeasurements()>
	//    6   14:ireturn         
		else
			return 2000;
	//    7   15:sipush          2000
	//    8   18:ireturn         
	}

	public long getCacheMeasurementExpiry()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field OfflineMeasurementsCache a>
	//*   2    4:ifnull          15
			return a.getCacheMeasurementExpiry();
	//    3    7:aload_0         
	//    4    8:getfield        #322 <Field OfflineMeasurementsCache a>
	//    5   11:invokevirtual   #769 <Method long OfflineMeasurementsCache.getCacheMeasurementExpiry()>
	//    6   14:lreturn         
		else
			return 31L;
	//    7   15:ldc2w           #770 <Long 31L>
	//    8   18:lreturn         
	}

	public long getCacheMinutesToRetry()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field OfflineMeasurementsCache a>
	//*   2    4:ifnull          15
			return a.getCacheWaitMinutes();
	//    3    7:aload_0         
	//    4    8:getfield        #322 <Field OfflineMeasurementsCache a>
	//    5   11:invokevirtual   #775 <Method long OfflineMeasurementsCache.getCacheWaitMinutes()>
	//    6   14:lreturn         
		else
			return 30L;
	//    7   15:ldc2w           #776 <Long 30L>
	//    8   18:lreturn         
	}

	public int getColdStartCount()
	{
		return q.get();
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field AtomicInteger q>
	//    2    4:invokevirtual   #569 <Method int AtomicInteger.get()>
	//    3    7:ireturn         
	}

	public long getColdStartId()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #781 <Field long p>
	//    2    4:lreturn         
	}

	public ConnectivityChangeReceiver getConnectivityReceiver()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #332 <Field ConnectivityChangeReceiver h>
	//    2    4:areturn         
	}

	public String getCrossPublisherId()
	{
		if(am == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #196 <Field IdHelper am>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return am.getCrossPublisherId();
	//    5    9:aload_0         
	//    6   10:getfield        #196 <Field IdHelper am>
	//    7   13:invokevirtual   #785 <Method String IdHelper.getCrossPublisherId()>
	//    8   16:areturn         
	}

	public String getCurrentActivityName()
	{
		return w;
	//    0    0:aload_0         
	//    1    1:getfield        #788 <Field String w>
	//    2    4:areturn         
	}

	public String getCurrentVersion()
	{
		return t;
	//    0    0:aload_0         
	//    1    1:getfield        #791 <Field String t>
	//    2    4:areturn         
	}

	public String getCustomerC2()
	{
		return (String)getLabels().get("c2");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #795 <Method HashMap getLabels()>
	//    2    4:ldc2            #275 <String "c2">
	//    3    7:invokevirtual   #748 <Method Object HashMap.get(Object)>
	//    4   10:checkcast       #492 <Class String>
	//    5   13:areturn         
	}

	public boolean getErrorHandlingEnabled()
	{
		return ag;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field boolean ag>
	//    2    4:ireturn         
	}

	public long getFirstInstallId()
	{
		return s;
	//    0    0:aload_0         
	//    1    1:getfield        #799 <Field long s>
	//    2    4:lreturn         
	}

	public long getForegroundTimeDelta(boolean flag)
	{
		long l1 = G;
	//    0    0:aload_0         
	//    1    1:getfield        #552 <Field long G>
	//    2    4:lstore_2        
		if(flag && an)
	//*   3    5:iload_1         
	//*   4    6:ifeq            38
	//*   5    9:aload_0         
	//*   6   10:getfield        #125 <Field boolean an>
	//*   7   13:ifeq            38
		{
			G = 0L;
	//    8   16:aload_0         
	//    9   17:lconst_0        
	//   10   18:putfield        #552 <Field long G>
			b.set("accumulatedForegroundTime", Long.toString(G));
	//   11   21:aload_0         
	//   12   22:getfield        #205 <Field Storage b>
	//   13   25:ldc2            #571 <String "accumulatedForegroundTime">
	//   14   28:aload_0         
	//   15   29:getfield        #552 <Field long G>
	//   16   32:invokestatic    #567 <Method String Long.toString(long)>
	//   17   35:invokevirtual   #210 <Method void Storage.set(String, String)>
		}
		return l1;
	//   18   38:lload_2         
	//   19   39:lreturn         
	}

	public long getForegroundTotalTime(boolean flag)
	{
		long l1 = C;
	//    0    0:aload_0         
	//    1    1:getfield        #554 <Field long C>
	//    2    4:lstore_2        
		if(flag && an)
	//*   3    5:iload_1         
	//*   4    6:ifeq            38
	//*   5    9:aload_0         
	//*   6   10:getfield        #125 <Field boolean an>
	//*   7   13:ifeq            38
		{
			C = 0L;
	//    8   16:aload_0         
	//    9   17:lconst_0        
	//   10   18:putfield        #554 <Field long C>
			b.set("totalForegroundTime", Long.toString(C));
	//   11   21:aload_0         
	//   12   22:getfield        #205 <Field Storage b>
	//   13   25:ldc2            #577 <String "totalForegroundTime">
	//   14   28:aload_0         
	//   15   29:getfield        #554 <Field long C>
	//   16   32:invokestatic    #567 <Method String Long.toString(long)>
	//   17   35:invokevirtual   #210 <Method void Storage.set(String, String)>
		}
		return l1;
	//   18   38:lload_2         
	//   19   39:lreturn         
	}

	public int getForegroundTransitionsCountDelta(boolean flag)
	{
		int i1 = B.get();
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field AtomicInteger B>
	//    2    4:invokevirtual   #569 <Method int AtomicInteger.get()>
	//    3    7:istore_2        
		if(flag && an)
	//*   4    8:iload_1         
	//*   5    9:ifeq            47
	//*   6   12:aload_0         
	//*   7   13:getfield        #125 <Field boolean an>
	//*   8   16:ifeq            47
		{
			B.set(0);
	//    9   19:aload_0         
	//   10   20:getfield        #137 <Field AtomicInteger B>
	//   11   23:iconst_0        
	//   12   24:invokevirtual   #804 <Method void AtomicInteger.set(int)>
			b.set("foregroundTransitionsCount", Long.toString(B.get()));
	//   13   27:aload_0         
	//   14   28:getfield        #205 <Field Storage b>
	//   15   31:ldc1            #182 <String "foregroundTransitionsCount">
	//   16   33:aload_0         
	//   17   34:getfield        #137 <Field AtomicInteger B>
	//   18   37:invokevirtual   #569 <Method int AtomicInteger.get()>
	//   19   40:i2l             
	//   20   41:invokestatic    #567 <Method String Long.toString(long)>
	//   21   44:invokevirtual   #210 <Method void Storage.set(String, String)>
		}
		return i1;
	//   22   47:iload_2         
	//   23   48:ireturn         
	}

	public long getGenesis()
	{
		return I;
	//    0    0:aload_0         
	//    1    1:getfield        #673 <Field long I>
	//    2    4:lreturn         
	}

	public IdHelper getIdHelper()
	{
		return am;
	//    0    0:aload_0         
	//    1    1:getfield        #196 <Field IdHelper am>
	//    2    4:areturn         
	}

	public long getInactiveTimeDelta(boolean flag)
	{
		long l1 = H;
	//    0    0:aload_0         
	//    1    1:getfield        #560 <Field long H>
	//    2    4:lstore_2        
		if(flag && an)
	//*   3    5:iload_1         
	//*   4    6:ifeq            38
	//*   5    9:aload_0         
	//*   6   10:getfield        #125 <Field boolean an>
	//*   7   13:ifeq            38
		{
			H = 0L;
	//    8   16:aload_0         
	//    9   17:lconst_0        
	//   10   18:putfield        #560 <Field long H>
			b.set("accumulatedInactiveTime", Long.toString(H));
	//   11   21:aload_0         
	//   12   22:getfield        #205 <Field Storage b>
	//   13   25:ldc2            #575 <String "accumulatedInactiveTime">
	//   14   28:aload_0         
	//   15   29:getfield        #560 <Field long H>
	//   16   32:invokestatic    #567 <Method String Long.toString(long)>
	//   17   35:invokevirtual   #210 <Method void Storage.set(String, String)>
		}
		return l1;
	//   18   38:lload_2         
	//   19   39:lreturn         
	}

	public long getInactiveTotalTime(boolean flag)
	{
		long l1 = E;
	//    0    0:aload_0         
	//    1    1:getfield        #562 <Field long E>
	//    2    4:lstore_2        
		if(flag && an)
	//*   3    5:iload_1         
	//*   4    6:ifeq            38
	//*   5    9:aload_0         
	//*   6   10:getfield        #125 <Field boolean an>
	//*   7   13:ifeq            38
		{
			E = 0L;
	//    8   16:aload_0         
	//    9   17:lconst_0        
	//   10   18:putfield        #562 <Field long E>
			b.set("totalInactiveTime", Long.toString(E));
	//   11   21:aload_0         
	//   12   22:getfield        #205 <Field Storage b>
	//   13   25:ldc2            #581 <String "totalInactiveTime">
	//   14   28:aload_0         
	//   15   29:getfield        #562 <Field long E>
	//   16   32:invokestatic    #567 <Method String Long.toString(long)>
	//   17   35:invokevirtual   #210 <Method void Storage.set(String, String)>
		}
		return l1;
	//   18   38:lload_2         
	//   19   39:lreturn         
	}

	public long getInstallId()
	{
		return r;
	//    0    0:aload_0         
	//    1    1:getfield        #812 <Field long r>
	//    2    4:lreturn         
	}

	public KeepAlive getKeepAlive()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #317 <Field KeepAlive c>
	//    2    4:areturn         
	}

	public String getLabel(String s1)
	{
		return (String)ac.get(((Object) (s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field HashMap ac>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #748 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #492 <Class String>
	//    5   11:areturn         
	}

	public HashMap getLabels()
	{
		return ac;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field HashMap ac>
	//    2    4:areturn         
	}

	public TransmissionMode getLiveTransmissionMode()
	{
		return aj;
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field TransmissionMode aj>
	//    2    4:areturn         
	}

	public MeasurementDispatcher getMeasurementDispatcher()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #304 <Field MeasurementDispatcher g>
	//    2    4:areturn         
	}

	public String[] getMeasurementLabelOrder()
	{
		return al;
	//    0    0:aload_0         
	//    1    1:getfield        #819 <Field String[] al>
	//    2    4:areturn         
	}

	public OfflineMeasurementsCache getOfflineCache()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field OfflineMeasurementsCache a>
	//    2    4:areturn         
	}

	public TransmissionMode getOfflineTransmissionMode()
	{
		return ak;
	//    0    0:aload_0         
	//    1    1:getfield        #243 <Field TransmissionMode ak>
	//    2    4:areturn         
	}

	public String getPixelURL()
	{
		return Z;
	//    0    0:aload_0         
	//    1    1:getfield        #467 <Field String Z>
	//    2    4:areturn         
	}

	public long getPreviousGenesis()
	{
		return J;
	//    0    0:aload_0         
	//    1    1:getfield        #669 <Field long J>
	//    2    4:lreturn         
	}

	public String getPreviousVersion()
	{
		String s1 = u;
	//    0    0:aload_0         
	//    1    1:getfield        #825 <Field String u>
	//    2    4:astore_1        
		if(u != null && u.length() > 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #825 <Field String u>
	//*   5    9:ifnull          36
	//*   6   12:aload_0         
	//*   7   13:getfield        #825 <Field String u>
	//*   8   16:invokevirtual   #499 <Method int String.length()>
	//*   9   19:ifle            36
		{
			b.remove("previousVersion");
	//   10   22:aload_0         
	//   11   23:getfield        #205 <Field Storage b>
	//   12   26:ldc1            #193 <String "previousVersion">
	//   13   28:invokevirtual   #546 <Method void Storage.remove(String)>
			u = null;
	//   14   31:aload_0         
	//   15   32:aconst_null     
	//   16   33:putfield        #825 <Field String u>
		}
		return s1;
	//   17   36:aload_1         
	//   18   37:areturn         
	}

	public String getPublisherSecret()
	{
		if(am == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #196 <Field IdHelper am>
	//*   2    4:ifnonnull       11
			return "";
	//    3    7:ldc2            #828 <String "">
	//    4   10:areturn         
		else
			return am.getPublisherSecret();
	//    5   11:aload_0         
	//    6   12:getfield        #196 <Field IdHelper am>
	//    7   15:invokevirtual   #830 <Method String IdHelper.getPublisherSecret()>
	//    8   18:areturn         
	}

	public DispatchQueue getQueue()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field DispatchQueue e>
	//    2    4:areturn         
	}

	public int getRunsCount()
	{
		return o.get();
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field AtomicInteger o>
	//    2    4:invokevirtual   #569 <Method int AtomicInteger.get()>
	//    3    7:ireturn         
	}

	public String getSalt()
	{
		return getPublisherSecret();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #834 <Method String getPublisherSecret()>
	//    2    4:areturn         
	}

	public SessionState getSessionState()
	{
		return L;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field SessionState L>
	//    2    4:areturn         
	}

	public Storage getStorage()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #205 <Field Storage b>
	//    2    4:areturn         
	}

	public TaskExecutor getTaskExecutor()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #445 <Field TaskExecutor f>
	//    2    4:areturn         
	}

	public int getUserInteractionCount(boolean flag)
	{
		int i1 = V;
	//    0    0:aload_0         
	//    1    1:getfield        #661 <Field int V>
	//    2    4:istore_2        
		if(flag && an)
	//*   3    5:iload_1         
	//*   4    6:ifeq            38
	//*   5    9:aload_0         
	//*   6   10:getfield        #125 <Field boolean an>
	//*   7   13:ifeq            38
		{
			V = 0;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #661 <Field int V>
			b.set("userInteractionCount", Integer.toString(V));
	//   11   21:aload_0         
	//   12   22:getfield        #205 <Field Storage b>
	//   13   25:ldc2            #659 <String "userInteractionCount">
	//   14   28:aload_0         
	//   15   29:getfield        #661 <Field int V>
	//   16   32:invokestatic    #665 <Method String Integer.toString(int)>
	//   17   35:invokevirtual   #210 <Method void Storage.set(String, String)>
		}
		return i1;
	//   18   38:iload_2         
	//   19   39:ireturn         
	}

	public int getUserSessionCountDelta(boolean flag)
	{
		int i1;
		if(Q >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #653 <Field int Q>
	//*   2    4:iflt            51
		{
			int j1 = Q;
	//    3    7:aload_0         
	//    4    8:getfield        #653 <Field int Q>
	//    5   11:istore_3        
			i1 = j1;
	//    6   12:iload_3         
	//    7   13:istore_2        
			if(flag)
	//*   8   14:iload_1         
	//*   9   15:ifeq            53
			{
				i1 = j1;
	//   10   18:iload_3         
	//   11   19:istore_2        
				if(an)
	//*  12   20:aload_0         
	//*  13   21:getfield        #125 <Field boolean an>
	//*  14   24:ifeq            53
				{
					Q = 0;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #653 <Field int Q>
					b.set("userSessionCount", Integer.toString(Q));
	//   18   32:aload_0         
	//   19   33:getfield        #205 <Field Storage b>
	//   20   36:ldc2            #651 <String "userSessionCount">
	//   21   39:aload_0         
	//   22   40:getfield        #653 <Field int Q>
	//   23   43:invokestatic    #665 <Method String Integer.toString(int)>
	//   24   46:invokevirtual   #210 <Method void Storage.set(String, String)>
					return j1;
	//   25   49:iload_3         
	//   26   50:ireturn         
				}
			}
		} else
		{
			i1 = -1;
	//   27   51:iconst_m1       
	//   28   52:istore_2        
		}
		return i1;
	//   29   53:iload_2         
	//   30   54:ireturn         
	}

	public long getUserSessionTimeDelta(boolean flag)
	{
		long l1 = N;
	//    0    0:aload_0         
	//    1    1:getfield        #633 <Field long N>
	//    2    4:lstore_2        
		if(flag && an)
	//*   3    5:iload_1         
	//*   4    6:ifeq            38
	//*   5    9:aload_0         
	//*   6   10:getfield        #125 <Field boolean an>
	//*   7   13:ifeq            38
		{
			N = 0L;
	//    8   16:aload_0         
	//    9   17:lconst_0        
	//   10   18:putfield        #633 <Field long N>
			b.set("accumulatedUserSessionTime", Long.toString(N));
	//   11   21:aload_0         
	//   12   22:getfield        #205 <Field Storage b>
	//   13   25:ldc2            #645 <String "accumulatedUserSessionTime">
	//   14   28:aload_0         
	//   15   29:getfield        #633 <Field long N>
	//   16   32:invokestatic    #567 <Method String Long.toString(long)>
	//   17   35:invokevirtual   #210 <Method void Storage.set(String, String)>
		}
		return l1;
	//   18   38:lload_2         
	//   19   39:lreturn         
	}

	public String getVersion()
	{
		return "3.1508.28";
	//    0    0:ldc2            #844 <String "3.1508.28">
	//    1    3:areturn         
	}

	public String getVisitorId()
	{
		if(am == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #196 <Field IdHelper am>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return am.getVisitorId();
	//    5    9:aload_0         
	//    6   10:getfield        #196 <Field IdHelper am>
	//    7   13:invokevirtual   #847 <Method String IdHelper.getVisitorId()>
	//    8   16:areturn         
	}

	protected CacheFlusher h()
	{
		return new CacheFlusher(this);
	//    0    0:new             #408 <Class CacheFlusher>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #848 <Method void CacheFlusher(Core)>
	//    4    8:areturn         
	}

	public boolean handleColdStart()
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(!n)
	//*   5    9:aload_0         
	//*   6   10:getfield        #104 <Field boolean n>
	//*   7   13:ifne            55
		{
			n = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #104 <Field boolean n>
			q.getAndIncrement();
	//   11   21:aload_0         
	//   12   22:getfield        #132 <Field AtomicInteger q>
	//   13   25:invokevirtual   #612 <Method int AtomicInteger.getAndIncrement()>
	//   14   28:pop             
			b.set("coldStartCount", String.valueOf(((Object) (q))));
	//   15   29:aload_0         
	//   16   30:getfield        #205 <Field Storage b>
	//   17   33:ldc2            #851 <String "coldStartCount">
	//   18   36:aload_0         
	//   19   37:getfield        #132 <Field AtomicInteger q>
	//   20   40:invokestatic    #855 <Method String String.valueOf(Object)>
	//   21   43:invokevirtual   #210 <Method void Storage.set(String, String)>
			p = Date.unixTime();
	//   22   46:aload_0         
	//   23   47:invokestatic    #432 <Method long Date.unixTime()>
	//   24   50:putfield        #781 <Field long p>
			return true;
	//   25   53:iconst_1        
	//   26   54:ireturn         
		} else
		{
			return false;
	//   27   55:iconst_0        
	//   28   56:ireturn         
		}
	}

	protected ConnectivityChangeReceiver i()
	{
		return new ConnectivityChangeReceiver(this);
	//    0    0:new             #387 <Class ConnectivityChangeReceiver>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #856 <Method void ConnectivityChangeReceiver(Core)>
	//    4    8:areturn         
	}

	public void incrementRunsCount()
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			o.getAndIncrement();
	//    4    8:aload_0         
	//    5    9:getfield        #135 <Field AtomicInteger o>
	//    6   12:invokevirtual   #612 <Method int AtomicInteger.getAndIncrement()>
	//    7   15:pop             
			b.set("runs", Long.toString(o.get()));
	//    8   16:aload_0         
	//    9   17:getfield        #205 <Field Storage b>
	//   10   20:ldc2            #859 <String "runs">
	//   11   23:aload_0         
	//   12   24:getfield        #135 <Field AtomicInteger o>
	//   13   27:invokevirtual   #569 <Method int AtomicInteger.get()>
	//   14   30:i2l             
	//   15   31:invokestatic    #567 <Method String Long.toString(long)>
	//   16   34:invokevirtual   #210 <Method void Storage.set(String, String)>
			return;
	//   17   37:return          
		}
	}

	public boolean isAutoStartEnabled()
	{
		return v;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field boolean v>
	//    2    4:ireturn         
	}

	public boolean isAutoUpdateEnabled()
	{
		return k > 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #343 <Field long k>
	//    2    4:lconst_0        
	//    3    5:lcmp            
	//    4    6:ifle            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public boolean isEnabled()
	{
		return an;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field boolean an>
	//    2    4:ireturn         
	}

	public boolean isKeepAliveEnabled()
	{
		return ae;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field boolean ae>
	//    2    4:ireturn         
	}

	public boolean isSecure()
	{
		return ai;
	//    0    0:aload_0         
	//    1    1:getfield        #864 <Field boolean ai>
	//    2    4:ireturn         
	}

	protected void j()
	{
		K = Utils.getLong(b.get("lastApplicationAccumulationTimestamp"), -1L);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #205 <Field Storage b>
	//    3    5:ldc1            #167 <String "lastApplicationAccumulationTimestamp">
	//    4    7:invokevirtual   #223 <Method String Storage.get(String)>
	//    5   10:ldc2w           #686 <Long -1L>
	//    6   13:invokestatic    #868 <Method long Utils.getLong(String, long)>
	//    7   16:putfield        #550 <Field long K>
		X = Utils.getLong(b.get("lastSessionAccumulationTimestamp"), -1L);
	//    8   19:aload_0         
	//    9   20:aload_0         
	//   10   21:getfield        #205 <Field Storage b>
	//   11   24:ldc1            #173 <String "lastSessionAccumulationTimestamp">
	//   12   26:invokevirtual   #223 <Method String Storage.get(String)>
	//   13   29:ldc2w           #686 <Long -1L>
	//   14   32:invokestatic    #868 <Method long Utils.getLong(String, long)>
	//   15   35:putfield        #441 <Field long X>
		S = Utils.getLong(b.get("lastApplicationSessionTimestamp"), -1L);
	//   16   38:aload_0         
	//   17   39:aload_0         
	//   18   40:getfield        #205 <Field Storage b>
	//   19   43:ldc2            #635 <String "lastApplicationSessionTimestamp">
	//   20   46:invokevirtual   #223 <Method String Storage.get(String)>
	//   21   49:ldc2w           #686 <Long -1L>
	//   22   52:invokestatic    #868 <Method long Utils.getLong(String, long)>
	//   23   55:putfield        #457 <Field long S>
		T = Utils.getLong(b.get("lastUserSessionTimestamp"), -1L);
	//   24   58:aload_0         
	//   25   59:aload_0         
	//   26   60:getfield        #205 <Field Storage b>
	//   27   63:ldc2            #637 <String "lastUserSessionTimestamp">
	//   28   66:invokevirtual   #223 <Method String Storage.get(String)>
	//   29   69:ldc2w           #686 <Long -1L>
	//   30   72:invokestatic    #868 <Method long Utils.getLong(String, long)>
	//   31   75:putfield        #455 <Field long T>
		U = Utils.getLong(b.get("lastActiveUserSessionTimestamp"), -1L);
	//   32   78:aload_0         
	//   33   79:aload_0         
	//   34   80:getfield        #205 <Field Storage b>
	//   35   83:ldc2            #639 <String "lastActiveUserSessionTimestamp">
	//   36   86:invokevirtual   #223 <Method String Storage.get(String)>
	//   37   89:ldc2w           #686 <Long -1L>
	//   38   92:invokestatic    #868 <Method long Utils.getLong(String, long)>
	//   39   95:putfield        #453 <Field long U>
		B.set(Utils.getInteger(b.get("foregroundTransitionsCount")));
	//   40   98:aload_0         
	//   41   99:getfield        #137 <Field AtomicInteger B>
	//   42  102:aload_0         
	//   43  103:getfield        #205 <Field Storage b>
	//   44  106:ldc1            #182 <String "foregroundTransitionsCount">
	//   45  108:invokevirtual   #223 <Method String Storage.get(String)>
	//   46  111:invokestatic    #872 <Method int Utils.getInteger(String)>
	//   47  114:invokevirtual   #804 <Method void AtomicInteger.set(int)>
		G = Utils.getLong(b.get("accumulatedForegroundTime"));
	//   48  117:aload_0         
	//   49  118:aload_0         
	//   50  119:getfield        #205 <Field Storage b>
	//   51  122:ldc2            #571 <String "accumulatedForegroundTime">
	//   52  125:invokevirtual   #223 <Method String Storage.get(String)>
	//   53  128:invokestatic    #875 <Method long Utils.getLong(String)>
	//   54  131:putfield        #552 <Field long G>
		F = Utils.getLong(b.get("accumulatedBackgroundTime"));
	//   55  134:aload_0         
	//   56  135:aload_0         
	//   57  136:getfield        #205 <Field Storage b>
	//   58  139:ldc2            #573 <String "accumulatedBackgroundTime">
	//   59  142:invokevirtual   #223 <Method String Storage.get(String)>
	//   60  145:invokestatic    #875 <Method long Utils.getLong(String)>
	//   61  148:putfield        #556 <Field long F>
		H = Utils.getLong(b.get("accumulatedInactiveTime"));
	//   62  151:aload_0         
	//   63  152:aload_0         
	//   64  153:getfield        #205 <Field Storage b>
	//   65  156:ldc2            #575 <String "accumulatedInactiveTime">
	//   66  159:invokevirtual   #223 <Method String Storage.get(String)>
	//   67  162:invokestatic    #875 <Method long Utils.getLong(String)>
	//   68  165:putfield        #560 <Field long H>
		C = Utils.getLong(b.get("totalForegroundTime"));
	//   69  168:aload_0         
	//   70  169:aload_0         
	//   71  170:getfield        #205 <Field Storage b>
	//   72  173:ldc2            #577 <String "totalForegroundTime">
	//   73  176:invokevirtual   #223 <Method String Storage.get(String)>
	//   74  179:invokestatic    #875 <Method long Utils.getLong(String)>
	//   75  182:putfield        #554 <Field long C>
		D = Utils.getLong(b.get("totalBackgroundTime"));
	//   76  185:aload_0         
	//   77  186:aload_0         
	//   78  187:getfield        #205 <Field Storage b>
	//   79  190:ldc2            #579 <String "totalBackgroundTime">
	//   80  193:invokevirtual   #223 <Method String Storage.get(String)>
	//   81  196:invokestatic    #875 <Method long Utils.getLong(String)>
	//   82  199:putfield        #558 <Field long D>
		E = Utils.getLong(b.get("totalInactiveTime"));
	//   83  202:aload_0         
	//   84  203:aload_0         
	//   85  204:getfield        #205 <Field Storage b>
	//   86  207:ldc2            #581 <String "totalInactiveTime">
	//   87  210:invokevirtual   #223 <Method String Storage.get(String)>
	//   88  213:invokestatic    #875 <Method long Utils.getLong(String)>
	//   89  216:putfield        #562 <Field long E>
		M = Utils.getLong(b.get("accumulatedApplicationSessionTime"));
	//   90  219:aload_0         
	//   91  220:aload_0         
	//   92  221:getfield        #205 <Field Storage b>
	//   93  224:ldc2            #641 <String "accumulatedApplicationSessionTime">
	//   94  227:invokevirtual   #223 <Method String Storage.get(String)>
	//   95  230:invokestatic    #875 <Method long Utils.getLong(String)>
	//   96  233:putfield        #439 <Field long M>
		O = Utils.getLong(b.get("accumulatedActiveUserSessionTime"));
	//   97  236:aload_0         
	//   98  237:aload_0         
	//   99  238:getfield        #205 <Field Storage b>
	//  100  241:ldc2            #643 <String "accumulatedActiveUserSessionTime">
	//  101  244:invokevirtual   #223 <Method String Storage.get(String)>
	//  102  247:invokestatic    #875 <Method long Utils.getLong(String)>
	//  103  250:putfield        #631 <Field long O>
		N = Utils.getLong(b.get("accumulatedUserSessionTime"));
	//  104  253:aload_0         
	//  105  254:aload_0         
	//  106  255:getfield        #205 <Field Storage b>
	//  107  258:ldc2            #645 <String "accumulatedUserSessionTime">
	//  108  261:invokevirtual   #223 <Method String Storage.get(String)>
	//  109  264:invokestatic    #875 <Method long Utils.getLong(String)>
	//  110  267:putfield        #633 <Field long N>
		R = Utils.getInteger(b.get("activeUserSessionCount"), -1);
	//  111  270:aload_0         
	//  112  271:aload_0         
	//  113  272:getfield        #205 <Field Storage b>
	//  114  275:ldc2            #647 <String "activeUserSessionCount">
	//  115  278:invokevirtual   #223 <Method String Storage.get(String)>
	//  116  281:iconst_m1       
	//  117  282:invokestatic    #878 <Method int Utils.getInteger(String, int)>
	//  118  285:putfield        #649 <Field int R>
		Q = Utils.getInteger(b.get("userSessionCount"), -1);
	//  119  288:aload_0         
	//  120  289:aload_0         
	//  121  290:getfield        #205 <Field Storage b>
	//  122  293:ldc2            #651 <String "userSessionCount">
	//  123  296:invokevirtual   #223 <Method String Storage.get(String)>
	//  124  299:iconst_m1       
	//  125  300:invokestatic    #878 <Method int Utils.getInteger(String, int)>
	//  126  303:putfield        #653 <Field int Q>
		W = Utils.getLong(b.get("lastUserInteractionTimestamp"), -1L);
	//  127  306:aload_0         
	//  128  307:aload_0         
	//  129  308:getfield        #205 <Field Storage b>
	//  130  311:ldc2            #655 <String "lastUserInteractionTimestamp">
	//  131  314:invokevirtual   #223 <Method String Storage.get(String)>
	//  132  317:ldc2w           #686 <Long -1L>
	//  133  320:invokestatic    #868 <Method long Utils.getLong(String, long)>
	//  134  323:putfield        #657 <Field long W>
		V = Utils.getInteger(b.get("userInteractionCount"), 0);
	//  135  326:aload_0         
	//  136  327:aload_0         
	//  137  328:getfield        #205 <Field Storage b>
	//  138  331:ldc2            #659 <String "userInteractionCount">
	//  139  334:invokevirtual   #223 <Method String Storage.get(String)>
	//  140  337:iconst_0        
	//  141  338:invokestatic    #878 <Method int Utils.getInteger(String, int)>
	//  142  341:putfield        #661 <Field int V>
		P = Utils.getInteger(b.get("applicationSessionCountKey"), 0);
	//  143  344:aload_0         
	//  144  345:aload_0         
	//  145  346:getfield        #205 <Field Storage b>
	//  146  349:ldc2            #675 <String "applicationSessionCountKey">
	//  147  352:invokevirtual   #223 <Method String Storage.get(String)>
	//  148  355:iconst_0        
	//  149  356:invokestatic    #878 <Method int Utils.getInteger(String, int)>
	//  150  359:putfield        #677 <Field int P>
		t = k();
	//  151  362:aload_0         
	//  152  363:aload_0         
	//  153  364:invokevirtual   #880 <Method String k()>
	//  154  367:putfield        #791 <Field String t>
		J = Utils.getLong(b.get("previousGenesis"), 0L);
	//  155  370:aload_0         
	//  156  371:aload_0         
	//  157  372:getfield        #205 <Field Storage b>
	//  158  375:ldc2            #667 <String "previousGenesis">
	//  159  378:invokevirtual   #223 <Method String Storage.get(String)>
	//  160  381:lconst_0        
	//  161  382:invokestatic    #868 <Method long Utils.getLong(String, long)>
	//  162  385:putfield        #669 <Field long J>
		I = Utils.getLong(b.get("genesis"), -1L);
	//  163  388:aload_0         
	//  164  389:aload_0         
	//  165  390:getfield        #205 <Field Storage b>
	//  166  393:ldc2            #671 <String "genesis">
	//  167  396:invokevirtual   #223 <Method String Storage.get(String)>
	//  168  399:ldc2w           #686 <Long -1L>
	//  169  402:invokestatic    #868 <Method long Utils.getLong(String, long)>
	//  170  405:putfield        #673 <Field long I>
		if(I < 0L)
	//* 171  408:aload_0         
	//* 172  409:getfield        #673 <Field long I>
	//* 173  412:lconst_0        
	//* 174  413:lcmp            
	//* 175  414:ifge            450
		{
			I = Date.unixTime();
	//  176  417:aload_0         
	//  177  418:invokestatic    #432 <Method long Date.unixTime()>
	//  178  421:putfield        #673 <Field long I>
			J = 0L;
	//  179  424:aload_0         
	//  180  425:lconst_0        
	//  181  426:putfield        #669 <Field long J>
			S = I;
	//  182  429:aload_0         
	//  183  430:aload_0         
	//  184  431:getfield        #673 <Field long I>
	//  185  434:putfield        #457 <Field long S>
			P = P + 1;
	//  186  437:aload_0         
	//  187  438:aload_0         
	//  188  439:getfield        #677 <Field int P>
	//  189  442:iconst_1        
	//  190  443:iadd            
	//  191  444:putfield        #677 <Field int P>
		} else
	//* 192  447:goto            499
		{
			if(!p())
	//* 193  450:aload_0         
	//* 194  451:invokevirtual   #437 <Method boolean p()>
	//* 195  454:ifne            491
			{
				M = M + (Date.unixTime() - X);
	//  196  457:aload_0         
	//  197  458:aload_0         
	//  198  459:getfield        #439 <Field long M>
	//  199  462:invokestatic    #432 <Method long Date.unixTime()>
	//  200  465:aload_0         
	//  201  466:getfield        #441 <Field long X>
	//  202  469:lsub            
	//  203  470:ladd            
	//  204  471:putfield        #439 <Field long M>
				b.set("accumulatedApplicationSessionTime", Long.toString(M));
	//  205  474:aload_0         
	//  206  475:getfield        #205 <Field Storage b>
	//  207  478:ldc2            #641 <String "accumulatedApplicationSessionTime">
	//  208  481:aload_0         
	//  209  482:getfield        #439 <Field long M>
	//  210  485:invokestatic    #567 <Method String Long.toString(long)>
	//  211  488:invokevirtual   #210 <Method void Storage.set(String, String)>
			}
			S = I;
	//  212  491:aload_0         
	//  213  492:aload_0         
	//  214  493:getfield        #673 <Field long I>
	//  215  496:putfield        #457 <Field long S>
		}
		s = Utils.getLong(b.get("firstInstallId"), -1L);
	//  216  499:aload_0         
	//  217  500:aload_0         
	//  218  501:getfield        #205 <Field Storage b>
	//  219  504:ldc2            #882 <String "firstInstallId">
	//  220  507:invokevirtual   #223 <Method String Storage.get(String)>
	//  221  510:ldc2w           #686 <Long -1L>
	//  222  513:invokestatic    #868 <Method long Utils.getLong(String, long)>
	//  223  516:putfield        #799 <Field long s>
		Object obj;
		String s1;
		String s2;
		if(s < 0L)
	//* 224  519:aload_0         
	//* 225  520:getfield        #799 <Field long s>
	//* 226  523:lconst_0        
	//* 227  524:lcmp            
	//* 228  525:ifge            606
		{
			s = I;
	//  229  528:aload_0         
	//  230  529:aload_0         
	//  231  530:getfield        #673 <Field long I>
	//  232  533:putfield        #799 <Field long s>
			r = I;
	//  233  536:aload_0         
	//  234  537:aload_0         
	//  235  538:getfield        #673 <Field long I>
	//  236  541:putfield        #812 <Field long r>
			b.set("currentVersion", t);
	//  237  544:aload_0         
	//  238  545:getfield        #205 <Field Storage b>
	//  239  548:ldc2            #884 <String "currentVersion">
	//  240  551:aload_0         
	//  241  552:getfield        #791 <Field String t>
	//  242  555:invokevirtual   #210 <Method void Storage.set(String, String)>
			b.set("firstInstallId", String.valueOf(s));
	//  243  558:aload_0         
	//  244  559:getfield        #205 <Field Storage b>
	//  245  562:ldc2            #882 <String "firstInstallId">
	//  246  565:aload_0         
	//  247  566:getfield        #799 <Field long s>
	//  248  569:invokestatic    #886 <Method String String.valueOf(long)>
	//  249  572:invokevirtual   #210 <Method void Storage.set(String, String)>
			obj = ((Object) (b));
	//  250  575:aload_0         
	//  251  576:getfield        #205 <Field Storage b>
	//  252  579:astore          5
			s1 = "installId";
	//  253  581:ldc1            #189 <String "installId">
	//  254  583:astore          6
			s2 = String.valueOf(r);
	//  255  585:aload_0         
	//  256  586:getfield        #812 <Field long r>
	//  257  589:invokestatic    #886 <Method String String.valueOf(long)>
	//  258  592:astore          7
		} else
	//* 259  594:aload           5
	//* 260  596:aload           6
	//* 261  598:aload           7
	//* 262  600:invokevirtual   #210 <Method void Storage.set(String, String)>
	//* 263  603:goto            743
		{
			if(b.has("previousVersion").booleanValue())
	//* 264  606:aload_0         
	//* 265  607:getfield        #205 <Field Storage b>
	//* 266  610:ldc1            #193 <String "previousVersion">
	//* 267  612:invokevirtual   #214 <Method Boolean Storage.has(String)>
	//* 268  615:invokevirtual   #220 <Method boolean Boolean.booleanValue()>
	//* 269  618:ifeq            634
				u = b.get("previousVersion");
	//  270  621:aload_0         
	//  271  622:aload_0         
	//  272  623:getfield        #205 <Field Storage b>
	//  273  626:ldc1            #193 <String "previousVersion">
	//  274  628:invokevirtual   #223 <Method String Storage.get(String)>
	//  275  631:putfield        #825 <Field String u>
			obj = ((Object) (b.get("currentVersion")));
	//  276  634:aload_0         
	//  277  635:getfield        #205 <Field Storage b>
	//  278  638:ldc2            #884 <String "currentVersion">
	//  279  641:invokevirtual   #223 <Method String Storage.get(String)>
	//  280  644:astore          5
			if(!((String) (obj)).equals(((Object) (t))))
	//* 281  646:aload           5
	//* 282  648:aload_0         
	//* 283  649:getfield        #791 <Field String t>
	//* 284  652:invokevirtual   #889 <Method boolean String.equals(Object)>
	//* 285  655:ifne            704
			{
				u = ((String) (obj));
	//  286  658:aload_0         
	//  287  659:aload           5
	//  288  661:putfield        #825 <Field String u>
				b.set("previousVersion", u);
	//  289  664:aload_0         
	//  290  665:getfield        #205 <Field Storage b>
	//  291  668:ldc1            #193 <String "previousVersion">
	//  292  670:aload_0         
	//  293  671:getfield        #825 <Field String u>
	//  294  674:invokevirtual   #210 <Method void Storage.set(String, String)>
				r = I;
	//  295  677:aload_0         
	//  296  678:aload_0         
	//  297  679:getfield        #673 <Field long I>
	//  298  682:putfield        #812 <Field long r>
				b.set("installId", String.valueOf(r));
	//  299  685:aload_0         
	//  300  686:getfield        #205 <Field Storage b>
	//  301  689:ldc1            #189 <String "installId">
	//  302  691:aload_0         
	//  303  692:getfield        #812 <Field long r>
	//  304  695:invokestatic    #886 <Method String String.valueOf(long)>
	//  305  698:invokevirtual   #210 <Method void Storage.set(String, String)>
			} else
	//* 306  701:goto            723
			{
				r = Utils.getLong(b.get("installId"), -1L);
	//  307  704:aload_0         
	//  308  705:aload_0         
	//  309  706:getfield        #205 <Field Storage b>
	//  310  709:ldc1            #189 <String "installId">
	//  311  711:invokevirtual   #223 <Method String Storage.get(String)>
	//  312  714:ldc2w           #686 <Long -1L>
	//  313  717:invokestatic    #868 <Method long Utils.getLong(String, long)>
	//  314  720:putfield        #812 <Field long r>
			}
			obj = ((Object) (b));
	//  315  723:aload_0         
	//  316  724:getfield        #205 <Field Storage b>
	//  317  727:astore          5
			s1 = "currentVersion";
	//  318  729:ldc2            #884 <String "currentVersion">
	//  319  732:astore          6
			s2 = t;
	//  320  734:aload_0         
	//  321  735:getfield        #791 <Field String t>
	//  322  738:astore          7
		}
		((Storage) (obj)).set(s1, s2);
	//* 323  740:goto            594
		b.set("genesis", Long.toString(I));
	//  324  743:aload_0         
	//  325  744:getfield        #205 <Field Storage b>
	//  326  747:ldc2            #671 <String "genesis">
	//  327  750:aload_0         
	//  328  751:getfield        #673 <Field long I>
	//  329  754:invokestatic    #567 <Method String Long.toString(long)>
	//  330  757:invokevirtual   #210 <Method void Storage.set(String, String)>
		b.set("previousGenesis", Long.toString(J));
	//  331  760:aload_0         
	//  332  761:getfield        #205 <Field Storage b>
	//  333  764:ldc2            #667 <String "previousGenesis">
	//  334  767:aload_0         
	//  335  768:getfield        #669 <Field long J>
	//  336  771:invokestatic    #567 <Method String Long.toString(long)>
	//  337  774:invokevirtual   #210 <Method void Storage.set(String, String)>
		long l1 = Date.unixTime();
	//  338  777:invokestatic    #432 <Method long Date.unixTime()>
	//  339  780:lstore_1        
		if(K >= 0L)
	//* 340  781:aload_0         
	//* 341  782:getfield        #550 <Field long K>
	//* 342  785:lconst_0        
	//* 343  786:lcmp            
	//* 344  787:iflt            851
		{
			long l2 = l1 - K;
	//  345  790:lload_1         
	//  346  791:aload_0         
	//  347  792:getfield        #550 <Field long K>
	//  348  795:lsub            
	//  349  796:lstore_3        
			H = H + l2;
	//  350  797:aload_0         
	//  351  798:aload_0         
	//  352  799:getfield        #560 <Field long H>
	//  353  802:lload_3         
	//  354  803:ladd            
	//  355  804:putfield        #560 <Field long H>
			b.set("accumulatedInactiveTime", Long.toString(H));
	//  356  807:aload_0         
	//  357  808:getfield        #205 <Field Storage b>
	//  358  811:ldc2            #575 <String "accumulatedInactiveTime">
	//  359  814:aload_0         
	//  360  815:getfield        #560 <Field long H>
	//  361  818:invokestatic    #567 <Method String Long.toString(long)>
	//  362  821:invokevirtual   #210 <Method void Storage.set(String, String)>
			E = E + l2;
	//  363  824:aload_0         
	//  364  825:aload_0         
	//  365  826:getfield        #562 <Field long E>
	//  366  829:lload_3         
	//  367  830:ladd            
	//  368  831:putfield        #562 <Field long E>
			b.set("totalInactiveTime", Long.toString(E));
	//  369  834:aload_0         
	//  370  835:getfield        #205 <Field Storage b>
	//  371  838:ldc2            #581 <String "totalInactiveTime">
	//  372  841:aload_0         
	//  373  842:getfield        #562 <Field long E>
	//  374  845:invokestatic    #567 <Method String Long.toString(long)>
	//  375  848:invokevirtual   #210 <Method void Storage.set(String, String)>
		}
		K = l1;
	//  376  851:aload_0         
	//  377  852:lload_1         
	//  378  853:putfield        #550 <Field long K>
		X = l1;
	//  379  856:aload_0         
	//  380  857:lload_1         
	//  381  858:putfield        #441 <Field long X>
		b.set("lastApplicationAccumulationTimestamp", Long.toString(K));
	//  382  861:aload_0         
	//  383  862:getfield        #205 <Field Storage b>
	//  384  865:ldc1            #167 <String "lastApplicationAccumulationTimestamp">
	//  385  867:aload_0         
	//  386  868:getfield        #550 <Field long K>
	//  387  871:invokestatic    #567 <Method String Long.toString(long)>
	//  388  874:invokevirtual   #210 <Method void Storage.set(String, String)>
		b.set("lastSessionAccumulationTimestamp", Long.toString(X));
	//  389  877:aload_0         
	//  390  878:getfield        #205 <Field Storage b>
	//  391  881:ldc1            #173 <String "lastSessionAccumulationTimestamp">
	//  392  883:aload_0         
	//  393  884:getfield        #441 <Field long X>
	//  394  887:invokestatic    #567 <Method String Long.toString(long)>
	//  395  890:invokevirtual   #210 <Method void Storage.set(String, String)>
		b.set("lastApplicationSessionTimestamp", Long.toString(S));
	//  396  893:aload_0         
	//  397  894:getfield        #205 <Field Storage b>
	//  398  897:ldc2            #635 <String "lastApplicationSessionTimestamp">
	//  399  900:aload_0         
	//  400  901:getfield        #457 <Field long S>
	//  401  904:invokestatic    #567 <Method String Long.toString(long)>
	//  402  907:invokevirtual   #210 <Method void Storage.set(String, String)>
		if(!b.has("runs").booleanValue())
	//* 403  910:aload_0         
	//* 404  911:getfield        #205 <Field Storage b>
	//* 405  914:ldc2            #859 <String "runs">
	//* 406  917:invokevirtual   #214 <Method Boolean Storage.has(String)>
	//* 407  920:invokevirtual   #220 <Method boolean Boolean.booleanValue()>
	//* 408  923:ifne            939
			b.set("runs", "0");
	//  409  926:aload_0         
	//  410  927:getfield        #205 <Field Storage b>
	//  411  930:ldc2            #859 <String "runs">
	//  412  933:ldc2            #891 <String "0">
	//  413  936:invokevirtual   #210 <Method void Storage.set(String, String)>
		o.set(Utils.getInteger(b.get("runs")));
	//  414  939:aload_0         
	//  415  940:getfield        #135 <Field AtomicInteger o>
	//  416  943:aload_0         
	//  417  944:getfield        #205 <Field Storage b>
	//  418  947:ldc2            #859 <String "runs">
	//  419  950:invokevirtual   #223 <Method String Storage.get(String)>
	//  420  953:invokestatic    #872 <Method int Utils.getInteger(String)>
	//  421  956:invokevirtual   #804 <Method void AtomicInteger.set(int)>
		q.set(Utils.getInteger(b.get("coldStartCount")));
	//  422  959:aload_0         
	//  423  960:getfield        #132 <Field AtomicInteger q>
	//  424  963:aload_0         
	//  425  964:getfield        #205 <Field Storage b>
	//  426  967:ldc2            #851 <String "coldStartCount">
	//  427  970:invokevirtual   #223 <Method String Storage.get(String)>
	//  428  973:invokestatic    #872 <Method int Utils.getInteger(String)>
	//  429  976:invokevirtual   #804 <Method void AtomicInteger.set(int)>
	//  430  979:return          
	}

	protected String k()
	{
		android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
		String s1 = ab.getPackageName();
	//    0    0:aload_0         
	//    1    1:getfield        #336 <Field Context ab>
	//    2    4:invokevirtual   #721 <Method String Context.getPackageName()>
	//    3    7:astore_1        
		try
		{
			s1 = ab.getPackageManager().getPackageInfo(s1, 0).versionName;
	//    4    8:aload_0         
	//    5    9:getfield        #336 <Field Context ab>
	//    6   12:invokevirtual   #725 <Method PackageManager Context.getPackageManager()>
	//    7   15:aload_1         
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #895 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   10   20:getfield        #900 <Field String PackageInfo.versionName>
	//   11   23:astore_1        
		}
	//*  12   24:aload_1         
	//*  13   25:areturn         
	//*  14   26:ldc2            #891 <String "0">
	//*  15   29:areturn         
		// Misplaced declaration of an exception variable
		catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
		{
			return "0";
		}
		return s1;
	//*  16   30:astore_1        
	//*  17   31:goto            26
	}

	protected void l()
	{
		if(ab == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #336 <Field Context ab>
	//    2    4:ifnull          568
_L1:
		Object obj = ((Object) (ab.getResources().getAssets()));
	//    3    7:aload_0         
	//    4    8:getfield        #336 <Field Context ab>
	//    5   11:invokevirtual   #906 <Method Resources Context.getResources()>
	//    6   14:invokevirtual   #912 <Method AssetManager Resources.getAssets()>
	//    7   17:astore          5
		Object obj1;
		obj1 = ((Object) (((AssetManager) (obj)).open("comScore.properties")));
	//    8   19:aload           5
	//    9   21:ldc2            #914 <String "comScore.properties">
	//   10   24:invokevirtual   #920 <Method java.io.InputStream AssetManager.open(String)>
	//   11   27:astore          6
		obj = ((Object) (new Properties()));
	//   12   29:new             #199 <Class Properties>
	//   13   32:dup             
	//   14   33:invokespecial   #921 <Method void Properties()>
	//   15   36:astore          5
		((Properties) (obj)).load(((java.io.InputStream) (obj1)));
	//   16   38:aload           5
	//   17   40:aload           6
	//   18   42:invokevirtual   #925 <Method void Properties.load(java.io.InputStream)>
		Constants.DEBUG = Utils.getBoolean(a("Debug", ((Properties) (obj)), false));
	//   19   45:aload_0         
	//   20   46:ldc2            #927 <String "Debug">
	//   21   49:aload           5
	//   22   51:iconst_0        
	//   23   52:invokespecial   #929 <Method String a(String, Properties, boolean)>
	//   24   55:invokestatic    #932 <Method boolean Utils.getBoolean(String)>
	//   25   58:putstatic       #937 <Field boolean Constants.DEBUG>
		ai = Utils.getBoolean(a("Secure", ((Properties) (obj)), false));
	//   26   61:aload_0         
	//   27   62:aload_0         
	//   28   63:ldc2            #939 <String "Secure">
	//   29   66:aload           5
	//   30   68:iconst_0        
	//   31   69:invokespecial   #929 <Method String a(String, Properties, boolean)>
	//   32   72:invokestatic    #932 <Method boolean Utils.getBoolean(String)>
	//   33   75:putfield        #864 <Field boolean ai>
		obj1 = ((Object) (a("PublisherSecret", ((Properties) (obj)), true)));
	//   34   78:aload_0         
	//   35   79:ldc2            #941 <String "PublisherSecret">
	//   36   82:aload           5
	//   37   84:iconst_1        
	//   38   85:invokespecial   #929 <Method String a(String, Properties, boolean)>
	//   39   88:astore          6
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_101;
	//   40   90:aload           6
	//   41   92:ifnull          101
		b(((String) (obj1)));
	//   42   95:aload_0         
	//   43   96:aload           6
	//   44   98:invokespecial   #231 <Method void b(String)>
		obj1 = ((Object) (a("AppName", ((Properties) (obj)), true)));
	//   45  101:aload_0         
	//   46  102:ldc2            #943 <String "AppName">
	//   47  105:aload           5
	//   48  107:iconst_1        
	//   49  108:invokespecial   #929 <Method String a(String, Properties, boolean)>
	//   50  111:astore          6
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_124;
	//   51  113:aload           6
	//   52  115:ifnull          124
		c(((String) (obj1)));
	//   53  118:aload_0         
	//   54  119:aload           6
	//   55  121:invokespecial   #241 <Method void c(String)>
		obj1 = ((Object) (a("CustomerC2", ((Properties) (obj)), false)));
	//   56  124:aload_0         
	//   57  125:ldc2            #945 <String "CustomerC2">
	//   58  128:aload           5
	//   59  130:iconst_0        
	//   60  131:invokespecial   #929 <Method String a(String, Properties, boolean)>
	//   61  134:astore          6
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_147;
	//   62  136:aload           6
	//   63  138:ifnull          147
		d(((String) (obj1)));
	//   64  141:aload_0         
	//   65  142:aload           6
	//   66  144:invokespecial   #260 <Method void d(String)>
		obj1 = ((Object) (a("PixelURL", ((Properties) (obj)), false)));
	//   67  147:aload_0         
	//   68  148:ldc2            #947 <String "PixelURL">
	//   69  151:aload           5
	//   70  153:iconst_0        
	//   71  154:invokespecial   #929 <Method String a(String, Properties, boolean)>
	//   72  157:astore          6
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_170;
	//   73  159:aload           6
	//   74  161:ifnull          170
		a(((String) (obj1)));
	//   75  164:aload_0         
	//   76  165:aload           6
	//   77  167:invokevirtual   #273 <Method void a(String)>
		obj1 = ((Object) (a("OfflineURL", ((Properties) (obj)), false)));
	//   78  170:aload_0         
	//   79  171:ldc2            #949 <String "OfflineURL">
	//   80  174:aload           5
	//   81  176:iconst_0        
	//   82  177:invokespecial   #929 <Method String a(String, Properties, boolean)>
	//   83  180:astore          6
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_196;
	//   84  182:aload           6
	//   85  184:ifnull          196
		a.setUrl(((String) (obj1)));
	//   86  187:aload_0         
	//   87  188:getfield        #322 <Field OfflineMeasurementsCache a>
	//   88  191:aload           6
	//   89  193:invokevirtual   #952 <Method void OfflineMeasurementsCache.setUrl(String)>
		obj1 = ((Object) (a("LiveTransmissionMode", ((Properties) (obj)), false)));
	//   90  196:aload_0         
	//   91  197:ldc2            #954 <String "LiveTransmissionMode">
	//   92  200:aload           5
	//   93  202:iconst_0        
	//   94  203:invokespecial   #929 <Method String a(String, Properties, boolean)>
	//   95  206:astore          6
		if(obj1 == null) goto _L4; else goto _L3
	//   96  208:aload           6
	//   97  210:ifnull          238
_L3:
		aj = TransmissionMode.valueOf(((String) (obj1)).toUpperCase(Locale.getDefault()));
	//   98  213:aload_0         
	//   99  214:aload           6
	//  100  216:invokestatic    #960 <Method Locale Locale.getDefault()>
	//  101  219:invokevirtual   #964 <Method String String.toUpperCase(Locale)>
	//  102  222:invokestatic    #969 <Method TransmissionMode TransmissionMode.valueOf(String)>
	//  103  225:putfield        #236 <Field TransmissionMode aj>
		  goto _L4
	//* 104  228:goto            238
_L7:
		aj = TransmissionMode.DEFAULT;
	//  105  231:aload_0         
	//  106  232:getstatic       #972 <Field TransmissionMode TransmissionMode.DEFAULT>
	//  107  235:putfield        #236 <Field TransmissionMode aj>
_L4:
		obj1 = ((Object) (a("OfflineTransmissionMode", ((Properties) (obj)), false)));
	//  108  238:aload_0         
	//  109  239:ldc2            #974 <String "OfflineTransmissionMode">
	//  110  242:aload           5
	//  111  244:iconst_0        
	//  112  245:invokespecial   #929 <Method String a(String, Properties, boolean)>
	//  113  248:astore          6
		if(obj1 == null) goto _L6; else goto _L5
	//  114  250:aload           6
	//  115  252:ifnull          280
_L5:
		ak = TransmissionMode.valueOf(((String) (obj1)).toUpperCase(Locale.getDefault()));
	//  116  255:aload_0         
	//  117  256:aload           6
	//  118  258:invokestatic    #960 <Method Locale Locale.getDefault()>
	//  119  261:invokevirtual   #964 <Method String String.toUpperCase(Locale)>
	//  120  264:invokestatic    #969 <Method TransmissionMode TransmissionMode.valueOf(String)>
	//  121  267:putfield        #243 <Field TransmissionMode ak>
		  goto _L6
	//* 122  270:goto            280
_L8:
		ak = TransmissionMode.DEFAULT;
	//  123  273:aload_0         
	//  124  274:getstatic       #972 <Field TransmissionMode TransmissionMode.DEFAULT>
	//  125  277:putfield        #243 <Field TransmissionMode ak>
_L6:
		int i1;
		ae = Utils.getBoolean(a("KeepAliveEnabled", ((Properties) (obj)), false), true);
	//  126  280:aload_0         
	//  127  281:aload_0         
	//  128  282:ldc2            #976 <String "KeepAliveEnabled">
	//  129  285:aload           5
	//  130  287:iconst_0        
	//  131  288:invokespecial   #929 <Method String a(String, Properties, boolean)>
	//  132  291:iconst_1        
	//  133  292:invokestatic    #979 <Method boolean Utils.getBoolean(String, boolean)>
	//  134  295:putfield        #151 <Field boolean ae>
		i1 = Utils.getInteger(a("CacheMaxSize", ((Properties) (obj)), false), -1);
	//  135  298:aload_0         
	//  136  299:ldc2            #981 <String "CacheMaxSize">
	//  137  302:aload           5
	//  138  304:iconst_0        
	//  139  305:invokespecial   #929 <Method String a(String, Properties, boolean)>
	//  140  308:iconst_m1       
	//  141  309:invokestatic    #878 <Method int Utils.getInteger(String, int)>
	//  142  312:istore_1        
		if(i1 < 0)
			break MISSING_BLOCK_LABEL_325;
	//  143  313:iload_1         
	//  144  314:iflt            325
		a.setCacheMaxMeasurements(i1);
	//  145  317:aload_0         
	//  146  318:getfield        #322 <Field OfflineMeasurementsCache a>
	//  147  321:iload_1         
	//  148  322:invokevirtual   #984 <Method void OfflineMeasurementsCache.setCacheMaxMeasurements(int)>
		i1 = Utils.getInteger(a("CacheMaxBatchSize", ((Properties) (obj)), false), -1);
	//  149  325:aload_0         
	//  150  326:ldc2            #986 <String "CacheMaxBatchSize">
	//  151  329:aload           5
	//  152  331:iconst_0        
	//  153  332:invokespecial   #929 <Method String a(String, Properties, boolean)>
	//  154  335:iconst_m1       
	//  155  336:invokestatic    #878 <Method int Utils.getInteger(String, int)>
	//  156  339:istore_1        
		if(i1 < 0)
			break MISSING_BLOCK_LABEL_352;
	//  157  340:iload_1         
	//  158  341:iflt            352
		a.setCacheMaxBatchFiles(i1);
	//  159  344:aload_0         
	//  160  345:getfield        #322 <Field OfflineMeasurementsCache a>
	//  161  348:iload_1         
	//  162  349:invokevirtual   #989 <Method void OfflineMeasurementsCache.setCacheMaxBatchFiles(int)>
		i1 = Utils.getInteger(a("CacheMaxFlushesInARow", ((Properties) (obj)), false), -1);
	//  163  352:aload_0         
	//  164  353:ldc2            #991 <String "CacheMaxFlushesInARow">
	//  165  356:aload           5
	//  166  358:iconst_0        
	//  167  359:invokespecial   #929 <Method String a(String, Properties, boolean)>
	//  168  362:iconst_m1       
	//  169  363:invokestatic    #878 <Method int Utils.getInteger(String, int)>
	//  170  366:istore_1        
		if(i1 < 0)
			break MISSING_BLOCK_LABEL_379;
	//  171  367:iload_1         
	//  172  368:iflt            379
		a.setCacheMaxPosts(i1);
	//  173  371:aload_0         
	//  174  372:getfield        #322 <Field OfflineMeasurementsCache a>
	//  175  375:iload_1         
	//  176  376:invokevirtual   #994 <Method void OfflineMeasurementsCache.setCacheMaxPosts(int)>
		i1 = Utils.getInteger(a("CacheMinutesToRetry", ((Properties) (obj)), false), -1);
	//  177  379:aload_0         
	//  178  380:ldc2            #996 <String "CacheMinutesToRetry">
	//  179  383:aload           5
	//  180  385:iconst_0        
	//  181  386:invokespecial   #929 <Method String a(String, Properties, boolean)>
	//  182  389:iconst_m1       
	//  183  390:invokestatic    #878 <Method int Utils.getInteger(String, int)>
	//  184  393:istore_1        
		if(i1 < 0)
			break MISSING_BLOCK_LABEL_406;
	//  185  394:iload_1         
	//  186  395:iflt            406
		a.setCacheWaitMinutes(i1);
	//  187  398:aload_0         
	//  188  399:getfield        #322 <Field OfflineMeasurementsCache a>
	//  189  402:iload_1         
	//  190  403:invokevirtual   #999 <Method void OfflineMeasurementsCache.setCacheWaitMinutes(int)>
		i1 = Utils.getInteger(a("CacheExpiryInDays", ((Properties) (obj)), false), -1);
	//  191  406:aload_0         
	//  192  407:ldc2            #1001 <String "CacheExpiryInDays">
	//  193  410:aload           5
	//  194  412:iconst_0        
	//  195  413:invokespecial   #929 <Method String a(String, Properties, boolean)>
	//  196  416:iconst_m1       
	//  197  417:invokestatic    #878 <Method int Utils.getInteger(String, int)>
	//  198  420:istore_1        
		if(i1 < 0)
			break MISSING_BLOCK_LABEL_433;
	//  199  421:iload_1         
	//  200  422:iflt            433
		a.setCacheMeasurementExpiry(i1);
	//  201  425:aload_0         
	//  202  426:getfield        #322 <Field OfflineMeasurementsCache a>
	//  203  429:iload_1         
	//  204  430:invokevirtual   #1004 <Method void OfflineMeasurementsCache.setCacheMeasurementExpiry(int)>
		long l1 = Utils.getLong(a("CacheFlushingInterval", ((Properties) (obj)), false), -1L);
	//  205  433:aload_0         
	//  206  434:ldc2            #1006 <String "CacheFlushingInterval">
	//  207  437:aload           5
	//  208  439:iconst_0        
	//  209  440:invokespecial   #929 <Method String a(String, Properties, boolean)>
	//  210  443:ldc2w           #686 <Long -1L>
	//  211  446:invokestatic    #868 <Method long Utils.getLong(String, long)>
	//  212  449:lstore_2        
		if(l1 < 0L)
			break MISSING_BLOCK_LABEL_475;
	//  213  450:lload_2         
	//  214  451:lconst_0        
	//  215  452:lcmp            
	//  216  453:iflt            475
		af = l1;
	//  217  456:aload_0         
	//  218  457:lload_2         
	//  219  458:putfield        #121 <Field long af>
		if(d != null)
	//* 220  461:aload_0         
	//* 221  462:getfield        #327 <Field CacheFlusher d>
	//* 222  465:ifnull          475
			d.update();
	//  223  468:aload_0         
	//  224  469:getfield        #327 <Field CacheFlusher d>
	//  225  472:invokevirtual   #1009 <Method void CacheFlusher.update()>
		boolean flag;
		setErrorHandlingEnabled(Utils.getBoolean(a("ErrorHandlingEnabled", ((Properties) (obj)), false)));
	//  226  475:aload_0         
	//  227  476:aload_0         
	//  228  477:ldc2            #1011 <String "ErrorHandlingEnabled">
	//  229  480:aload           5
	//  230  482:iconst_0        
	//  231  483:invokespecial   #929 <Method String a(String, Properties, boolean)>
	//  232  486:invokestatic    #932 <Method boolean Utils.getBoolean(String)>
	//  233  489:invokevirtual   #1014 <Method void setErrorHandlingEnabled(boolean)>
		v = Utils.getBoolean(a("AutoStartEnabled", ((Properties) (obj)), false), true);
	//  234  492:aload_0         
	//  235  493:aload_0         
	//  236  494:ldc2            #1016 <String "AutoStartEnabled">
	//  237  497:aload           5
	//  238  499:iconst_0        
	//  239  500:invokespecial   #929 <Method String a(String, Properties, boolean)>
	//  240  503:iconst_1        
	//  241  504:invokestatic    #979 <Method boolean Utils.getBoolean(String, boolean)>
	//  242  507:putfield        #106 <Field boolean v>
		flag = Utils.getBoolean(a("AutoUpdateInForegroundOnly", ((Properties) (obj)), false), true);
	//  243  510:aload_0         
	//  244  511:ldc2            #1018 <String "AutoUpdateInForegroundOnly">
	//  245  514:aload           5
	//  246  516:iconst_0        
	//  247  517:invokespecial   #929 <Method String a(String, Properties, boolean)>
	//  248  520:iconst_1        
	//  249  521:invokestatic    #979 <Method boolean Utils.getBoolean(String, boolean)>
	//  250  524:istore          4
		i1 = Utils.getInteger(a("AutoUpdateInterval", ((Properties) (obj)), false), -1);
	//  251  526:aload_0         
	//  252  527:ldc2            #1020 <String "AutoUpdateInterval">
	//  253  530:aload           5
	//  254  532:iconst_0        
	//  255  533:invokespecial   #929 <Method String a(String, Properties, boolean)>
	//  256  536:iconst_m1       
	//  257  537:invokestatic    #878 <Method int Utils.getInteger(String, int)>
	//  258  540:istore_1        
		if(i1 >= 60)
	//* 259  541:iload_1         
	//* 260  542:bipush          60
	//* 261  544:icmplt          568
			try
			{
				a(i1, flag);
	//  262  547:aload_0         
	//  263  548:iload_1         
	//  264  549:iload           4
	//  265  551:invokevirtual   #692 <Method void a(int, boolean)>
				return;
	//  266  554:return          
			}
			catch(IOException ioexception)
	//* 267  555:astore          5
			{
				if(Constants.DEBUG)
	//* 268  557:getstatic       #937 <Field boolean Constants.DEBUG>
	//* 269  560:ifeq            568
					CSLog.printStackTrace(((Exception) (ioexception)));
	//  270  563:aload           5
	//  271  565:invokestatic    #1024 <Method void CSLog.printStackTrace(Exception)>
			}
_L2:
		return;
	//  272  568:return          
		IllegalArgumentException illegalargumentexception;
		illegalargumentexception;
	//  273  569:astore          6
		  goto _L7
	//* 274  571:goto            231
		illegalargumentexception;
	//  275  574:astore          6
		  goto _L8
	//* 276  576:goto            273
	}

	protected Context m()
	{
		return ab;
	//    0    0:aload_0         
	//    1    1:getfield        #336 <Field Context ab>
	//    2    4:areturn         
	}

	protected void n()
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(f.containsTask(j))
	//*   4    8:aload_0         
	//*   5    9:getfield        #445 <Field TaskExecutor f>
	//*   6   12:aload_0         
	//*   7   13:getfield        #1026 <Field Runnable j>
	//*   8   16:invokevirtual   #1030 <Method boolean TaskExecutor.containsTask(Runnable)>
	//*   9   19:ifeq            38
		{
			f.removeEnqueuedTask(j);
	//   10   22:aload_0         
	//   11   23:getfield        #445 <Field TaskExecutor f>
	//   12   26:aload_0         
	//   13   27:getfield        #1026 <Field Runnable j>
	//   14   30:invokevirtual   #451 <Method void TaskExecutor.removeEnqueuedTask(Runnable)>
			j = null;
	//   15   33:aload_0         
	//   16   34:aconst_null     
	//   17   35:putfield        #1026 <Field Runnable j>
		}
		long l1 = Date.unixTime();
	//   18   38:invokestatic    #432 <Method long Date.unixTime()>
	//   19   41:lstore_1        
		ApplicationState applicationstate;
		if(z.get() > 0)
	//*  20   42:aload_0         
	//*  21   43:getfield        #139 <Field AtomicInteger z>
	//*  22   46:invokevirtual   #569 <Method int AtomicInteger.get()>
	//*  23   49:ifle            60
			applicationstate = ApplicationState.FOREGROUND;
	//   24   52:getstatic       #346 <Field ApplicationState ApplicationState.FOREGROUND>
	//   25   55:astore          4
		else
	//*  26   57:goto            83
		if(A.get() > 0)
	//*  27   60:aload_0         
	//*  28   61:getfield        #141 <Field AtomicInteger A>
	//*  29   64:invokevirtual   #569 <Method int AtomicInteger.get()>
	//*  30   67:ifle            78
			applicationstate = ApplicationState.BACKGROUND_UX_ACTIVE;
	//   31   70:getstatic       #351 <Field ApplicationState ApplicationState.BACKGROUND_UX_ACTIVE>
	//   32   73:astore          4
		else
	//*  33   75:goto            83
			applicationstate = ApplicationState.INACTIVE;
	//   34   78:getstatic       #111 <Field ApplicationState ApplicationState.INACTIVE>
	//   35   81:astore          4
		SessionState sessionstate;
		if(l1 - W < 0x493e0L)
	//*  36   83:lload_1         
	//*  37   84:aload_0         
	//*  38   85:getfield        #657 <Field long W>
	//*  39   88:lsub            
	//*  40   89:ldc2w           #1031 <Long 0x493e0L>
	//*  41   92:lcmp            
	//*  42   93:ifge            103
			sessionstate = SessionState.ACTIVE_USER;
	//   43   96:getstatic       #1035 <Field SessionState SessionState.ACTIVE_USER>
	//   44   99:astore_3        
		else
	//*  45  100:goto            144
		if(A.get() > 0)
	//*  46  103:aload_0         
	//*  47  104:getfield        #141 <Field AtomicInteger A>
	//*  48  107:invokevirtual   #569 <Method int AtomicInteger.get()>
	//*  49  110:ifle            120
			sessionstate = SessionState.USER;
	//   50  113:getstatic       #1038 <Field SessionState SessionState.USER>
	//   51  116:astore_3        
		else
	//*  52  117:goto            100
		if(z.get() > 0)
	//*  53  120:aload_0         
	//*  54  121:getfield        #139 <Field AtomicInteger z>
	//*  55  124:invokevirtual   #569 <Method int AtomicInteger.get()>
	//*  56  127:ifle            137
			sessionstate = SessionState.APPLICATION;
	//   57  130:getstatic       #1041 <Field SessionState SessionState.APPLICATION>
	//   58  133:astore_3        
		else
	//*  59  134:goto            100
			sessionstate = SessionState.INACTIVE;
	//   60  137:getstatic       #117 <Field SessionState SessionState.INACTIVE>
	//   61  140:astore_3        
	//*  62  141:goto            100
		ApplicationState applicationstate1 = y;
	//   63  144:aload_0         
	//   64  145:getfield        #113 <Field ApplicationState y>
	//   65  148:astore          5
		SessionState sessionstate1 = L;
	//   66  150:aload_0         
	//   67  151:getfield        #119 <Field SessionState L>
	//   68  154:astore          6
		if(applicationstate != applicationstate1 || sessionstate != sessionstate1)
	//*  69  156:aload           4
	//*  70  158:aload           5
	//*  71  160:if_acmpne       169
	//*  72  163:aload_3         
	//*  73  164:aload           6
	//*  74  166:if_acmpeq       233
		{
			j = ((Runnable) (new af(this, applicationstate1, applicationstate, sessionstate1, sessionstate)));
	//   75  169:aload_0         
	//   76  170:new             #1043 <Class af>
	//   77  173:dup             
	//   78  174:aload_0         
	//   79  175:aload           5
	//   80  177:aload           4
	//   81  179:aload           6
	//   82  181:aload_3         
	//   83  182:invokespecial   #1046 <Method void af(Core, ApplicationState, ApplicationState, SessionState, SessionState)>
	//   84  185:putfield        #1026 <Field Runnable j>
			if(m && applicationstate != ApplicationState.FOREGROUND)
	//*  85  188:aload_0         
	//*  86  189:getfield        #102 <Field boolean m>
	//*  87  192:ifeq            219
	//*  88  195:aload           4
	//*  89  197:getstatic       #346 <Field ApplicationState ApplicationState.FOREGROUND>
	//*  90  200:if_acmpeq       219
			{
				f.execute(j, 300L);
	//   91  203:aload_0         
	//   92  204:getfield        #445 <Field TaskExecutor f>
	//   93  207:aload_0         
	//   94  208:getfield        #1026 <Field Runnable j>
	//   95  211:ldc2w           #7   <Long 300L>
	//   96  214:invokevirtual   #1049 <Method boolean TaskExecutor.execute(Runnable, long)>
	//   97  217:pop             
				return;
	//   98  218:return          
			}
			j.run();
	//   99  219:aload_0         
	//  100  220:getfield        #1026 <Field Runnable j>
	//  101  223:invokeinterface #1054 <Method void Runnable.run()>
			j = null;
	//  102  228:aload_0         
	//  103  229:aconst_null     
	//  104  230:putfield        #1026 <Field Runnable j>
		}
	//  105  233:return          
	}

	public void notify(EventType eventtype, HashMap hashmap, boolean flag)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(!flag)
	//*   4    8:iload_3         
	//*   5    9:ifne            19
		{
			a(eventtype, hashmap);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #1056 <Method void a(EventType, HashMap)>
			return;
	//   10   18:return          
		}
		if(f == null)
	//*  11   19:aload_0         
	//*  12   20:getfield        #445 <Field TaskExecutor f>
	//*  13   23:ifnonnull       27
		{
			return;
	//   14   26:return          
		} else
		{
			f.execute(((Runnable) (new z(this, eventtype, hashmap))), flag);
	//   15   27:aload_0         
	//   16   28:getfield        #445 <Field TaskExecutor f>
	//   17   31:new             #1058 <Class z>
	//   18   34:dup             
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:aload_2         
	//   22   38:invokespecial   #1061 <Method void z(Core, EventType, HashMap)>
	//   23   41:iload_3         
	//   24   42:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   25   45:pop             
			return;
	//   26   46:return          
		}
	}

	protected void o()
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(Y != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #443 <Field Runnable Y>
	//*   6   12:ifnull          31
		{
			f.removeEnqueuedTask(Y);
	//    7   15:aload_0         
	//    8   16:getfield        #445 <Field TaskExecutor f>
	//    9   19:aload_0         
	//   10   20:getfield        #443 <Field Runnable Y>
	//   11   23:invokevirtual   #451 <Method void TaskExecutor.removeEnqueuedTask(Runnable)>
			Y = null;
	//   12   26:aload_0         
	//   13   27:aconst_null     
	//   14   28:putfield        #443 <Field Runnable Y>
		}
		Y = ((Runnable) (new UserInteractionTask()));
	//   15   31:aload_0         
	//   16   32:new             #1064 <Class Core$UserInteractionTask>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:invokespecial   #1065 <Method void Core$UserInteractionTask(Core)>
	//   20   40:putfield        #443 <Field Runnable Y>
		f.execute(Y, 0x493e0L);
	//   21   43:aload_0         
	//   22   44:getfield        #445 <Field TaskExecutor f>
	//   23   47:aload_0         
	//   24   48:getfield        #443 <Field Runnable Y>
	//   25   51:ldc2w           #1031 <Long 0x493e0L>
	//   26   54:invokevirtual   #1049 <Method boolean TaskExecutor.execute(Runnable, long)>
	//   27   57:pop             
	//   28   58:return          
	}

	public void onEnterForeground()
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(f == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #445 <Field TaskExecutor f>
	//*   6   12:ifnonnull       16
		{
			return;
	//    7   15:return          
		} else
		{
			f.execute(((Runnable) (new ac(this))), true);
	//    8   16:aload_0         
	//    9   17:getfield        #445 <Field TaskExecutor f>
	//   10   20:new             #1068 <Class ac>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokespecial   #1069 <Method void ac(Core)>
	//   14   28:iconst_1        
	//   15   29:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   16   32:pop             
			return;
	//   17   33:return          
		}
	}

	public void onExitForeground()
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(f == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #445 <Field TaskExecutor f>
	//*   6   12:ifnonnull       16
		{
			return;
	//    7   15:return          
		} else
		{
			f.execute(((Runnable) (new ad(this))), true);
	//    8   16:aload_0         
	//    9   17:getfield        #445 <Field TaskExecutor f>
	//   10   20:new             #1072 <Class ad>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokespecial   #1073 <Method void ad(Core)>
	//   14   28:iconst_1        
	//   15   29:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   16   32:pop             
			return;
	//   17   33:return          
		}
	}

	public void onUserInteraction()
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(f == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #445 <Field TaskExecutor f>
	//*   6   12:ifnonnull       16
		{
			return;
	//    7   15:return          
		} else
		{
			f.execute(((Runnable) (new ae(this))), true);
	//    8   16:aload_0         
	//    9   17:getfield        #445 <Field TaskExecutor f>
	//   10   20:new             #1076 <Class ae>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokespecial   #1077 <Method void ae(Core)>
	//   14   28:iconst_1        
	//   15   29:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   16   32:pop             
			return;
	//   17   33:return          
		}
	}

	public void onUxActive()
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(f == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #445 <Field TaskExecutor f>
	//*   6   12:ifnonnull       16
		{
			return;
	//    7   15:return          
		} else
		{
			f.execute(((Runnable) (new l(this))), true);
	//    8   16:aload_0         
	//    9   17:getfield        #445 <Field TaskExecutor f>
	//   10   20:new             #1080 <Class l>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokespecial   #1081 <Method void l(Core)>
	//   14   28:iconst_1        
	//   15   29:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   16   32:pop             
			return;
	//   17   33:return          
		}
	}

	public void onUxInactive()
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(f == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #445 <Field TaskExecutor f>
	//*   6   12:ifnonnull       16
		{
			return;
	//    7   15:return          
		} else
		{
			f.execute(((Runnable) (new w(this))), true);
	//    8   16:aload_0         
	//    9   17:getfield        #445 <Field TaskExecutor f>
	//   10   20:new             #1084 <Class w>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokespecial   #1085 <Method void w(Core)>
	//   14   28:iconst_1        
	//   15   29:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   16   32:pop             
			return;
	//   17   33:return          
		}
	}

	protected boolean p()
	{
		boolean flag1 = an;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field boolean an>
	//    2    4:istore_2        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(!flag1)
	//*   5    7:iload_2         
	//*   6    8:ifne            13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		long l1 = Date.unixTime();
	//    9   13:invokestatic    #432 <Method long Date.unixTime()>
	//   10   16:lstore_3        
		if(l1 - S > 0x1b7740L)
	//*  11   17:lload_3         
	//*  12   18:aload_0         
	//*  13   19:getfield        #457 <Field long S>
	//*  14   22:lsub            
	//*  15   23:ldc2w           #1086 <Long 0x1b7740L>
	//*  16   26:lcmp            
	//*  17   27:ifle            55
		{
			J = I;
	//   18   30:aload_0         
	//   19   31:aload_0         
	//   20   32:getfield        #673 <Field long I>
	//   21   35:putfield        #669 <Field long J>
			I = l1;
	//   22   38:aload_0         
	//   23   39:lload_3         
	//   24   40:putfield        #673 <Field long I>
			P = P + 1;
	//   25   43:aload_0         
	//   26   44:aload_0         
	//   27   45:getfield        #677 <Field int P>
	//   28   48:iconst_1        
	//   29   49:iadd            
	//   30   50:putfield        #677 <Field int P>
			flag = true;
	//   31   53:iconst_1        
	//   32   54:istore_1        
		}
		S = l1;
	//   33   55:aload_0         
	//   34   56:lload_3         
	//   35   57:putfield        #457 <Field long S>
		return flag;
	//   36   60:iload_1         
	//   37   61:ireturn         
	}

	protected void q()
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		long l1 = Date.unixTime();
	//    4    8:invokestatic    #432 <Method long Date.unixTime()>
	//    5   11:lstore_1        
		if(l1 - U >= 0x493e0L)
	//*   6   12:lload_1         
	//*   7   13:aload_0         
	//*   8   14:getfield        #453 <Field long U>
	//*   9   17:lsub            
	//*  10   18:ldc2w           #1031 <Long 0x493e0L>
	//*  11   21:lcmp            
	//*  12   22:iflt            35
			R = R + 1;
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #649 <Field int R>
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:putfield        #649 <Field int R>
		U = l1;
	//   19   35:aload_0         
	//   20   36:lload_1         
	//   21   37:putfield        #453 <Field long U>
	//   22   40:return          
	}

	protected void r()
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		long l1 = Date.unixTime();
	//    4    8:invokestatic    #432 <Method long Date.unixTime()>
	//    5   11:lstore_1        
		if(l1 - T >= 0x493e0L)
	//*   6   12:lload_1         
	//*   7   13:aload_0         
	//*   8   14:getfield        #455 <Field long T>
	//*   9   17:lsub            
	//*  10   18:ldc2w           #1031 <Long 0x493e0L>
	//*  11   21:lcmp            
	//*  12   22:iflt            35
			Q = Q + 1;
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #653 <Field int Q>
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:putfield        #653 <Field int Q>
		T = l1;
	//   19   35:aload_0         
	//   20   36:lload_1         
	//   21   37:putfield        #455 <Field long T>
	//   22   40:return          
	}

	public void reset()
	{
		aj = TransmissionMode.DEFAULT;
	//    0    0:aload_0         
	//    1    1:getstatic       #972 <Field TransmissionMode TransmissionMode.DEFAULT>
	//    2    4:putfield        #236 <Field TransmissionMode aj>
		ak = TransmissionMode.DEFAULT;
	//    3    7:aload_0         
	//    4    8:getstatic       #972 <Field TransmissionMode TransmissionMode.DEFAULT>
	//    5   11:putfield        #243 <Field TransmissionMode ak>
		ai = false;
	//    6   14:aload_0         
	//    7   15:iconst_0        
	//    8   16:putfield        #864 <Field boolean ai>
		al = Constants.LABELS_ORDER;
	//    9   19:aload_0         
	//   10   20:getstatic       #1090 <Field String[] Constants.LABELS_ORDER>
	//   11   23:putfield        #819 <Field String[] al>
		y = ApplicationState.INACTIVE;
	//   12   26:aload_0         
	//   13   27:getstatic       #111 <Field ApplicationState ApplicationState.INACTIVE>
	//   14   30:putfield        #113 <Field ApplicationState y>
		L = SessionState.INACTIVE;
	//   15   33:aload_0         
	//   16   34:getstatic       #117 <Field SessionState SessionState.INACTIVE>
	//   17   37:putfield        #119 <Field SessionState L>
		n = false;
	//   18   40:aload_0         
	//   19   41:iconst_0        
	//   20   42:putfield        #104 <Field boolean n>
		o.set(0);
	//   21   45:aload_0         
	//   22   46:getfield        #135 <Field AtomicInteger o>
	//   23   49:iconst_0        
	//   24   50:invokevirtual   #804 <Method void AtomicInteger.set(int)>
		p = -1L;
	//   25   53:aload_0         
	//   26   54:ldc2w           #686 <Long -1L>
	//   27   57:putfield        #781 <Field long p>
		q.set(0);
	//   28   60:aload_0         
	//   29   61:getfield        #132 <Field AtomicInteger q>
	//   30   64:iconst_0        
	//   31   65:invokevirtual   #804 <Method void AtomicInteger.set(int)>
		s = -1L;
	//   32   68:aload_0         
	//   33   69:ldc2w           #686 <Long -1L>
	//   34   72:putfield        #799 <Field long s>
		r = -1L;
	//   35   75:aload_0         
	//   36   76:ldc2w           #686 <Long -1L>
	//   37   79:putfield        #812 <Field long r>
		t = null;
	//   38   82:aload_0         
	//   39   83:aconst_null     
	//   40   84:putfield        #791 <Field String t>
		u = null;
	//   41   87:aload_0         
	//   42   88:aconst_null     
	//   43   89:putfield        #825 <Field String u>
		z.set(0);
	//   44   92:aload_0         
	//   45   93:getfield        #139 <Field AtomicInteger z>
	//   46   96:iconst_0        
	//   47   97:invokevirtual   #804 <Method void AtomicInteger.set(int)>
		A.set(0);
	//   48  100:aload_0         
	//   49  101:getfield        #141 <Field AtomicInteger A>
	//   50  104:iconst_0        
	//   51  105:invokevirtual   #804 <Method void AtomicInteger.set(int)>
		C = 0L;
	//   52  108:aload_0         
	//   53  109:lconst_0        
	//   54  110:putfield        #554 <Field long C>
		D = 0L;
	//   55  113:aload_0         
	//   56  114:lconst_0        
	//   57  115:putfield        #558 <Field long D>
		E = 0L;
	//   58  118:aload_0         
	//   59  119:lconst_0        
	//   60  120:putfield        #562 <Field long E>
		F = 0L;
	//   61  123:aload_0         
	//   62  124:lconst_0        
	//   63  125:putfield        #556 <Field long F>
		G = 0L;
	//   64  128:aload_0         
	//   65  129:lconst_0        
	//   66  130:putfield        #552 <Field long G>
		H = 0L;
	//   67  133:aload_0         
	//   68  134:lconst_0        
	//   69  135:putfield        #560 <Field long H>
		M = 0L;
	//   70  138:aload_0         
	//   71  139:lconst_0        
	//   72  140:putfield        #439 <Field long M>
		O = 0L;
	//   73  143:aload_0         
	//   74  144:lconst_0        
	//   75  145:putfield        #631 <Field long O>
		N = 0L;
	//   76  148:aload_0         
	//   77  149:lconst_0        
	//   78  150:putfield        #633 <Field long N>
		I = -1L;
	//   79  153:aload_0         
	//   80  154:ldc2w           #686 <Long -1L>
	//   81  157:putfield        #673 <Field long I>
		J = 0L;
	//   82  160:aload_0         
	//   83  161:lconst_0        
	//   84  162:putfield        #669 <Field long J>
		R = -1;
	//   85  165:aload_0         
	//   86  166:iconst_m1       
	//   87  167:putfield        #649 <Field int R>
		Q = -1;
	//   88  170:aload_0         
	//   89  171:iconst_m1       
	//   90  172:putfield        #653 <Field int Q>
		V = 0;
	//   91  175:aload_0         
	//   92  176:iconst_0        
	//   93  177:putfield        #661 <Field int V>
		W = -1L;
	//   94  180:aload_0         
	//   95  181:ldc2w           #686 <Long -1L>
	//   96  184:putfield        #657 <Field long W>
		K = -1L;
	//   97  187:aload_0         
	//   98  188:ldc2w           #686 <Long -1L>
	//   99  191:putfield        #550 <Field long K>
		X = -1L;
	//  100  194:aload_0         
	//  101  195:ldc2w           #686 <Long -1L>
	//  102  198:putfield        #441 <Field long X>
		S = -1L;
	//  103  201:aload_0         
	//  104  202:ldc2w           #686 <Long -1L>
	//  105  205:putfield        #457 <Field long S>
		T = -1L;
	//  106  208:aload_0         
	//  107  209:ldc2w           #686 <Long -1L>
	//  108  212:putfield        #455 <Field long T>
		U = -1L;
	//  109  215:aload_0         
	//  110  216:ldc2w           #686 <Long -1L>
	//  111  219:putfield        #453 <Field long U>
		r = -1L;
	//  112  222:aload_0         
	//  113  223:ldc2w           #686 <Long -1L>
	//  114  226:putfield        #812 <Field long r>
		s = -1L;
	//  115  229:aload_0         
	//  116  230:ldc2w           #686 <Long -1L>
	//  117  233:putfield        #799 <Field long s>
		disableAutoUpdate();
	//  118  236:aload_0         
	//  119  237:invokevirtual   #1092 <Method void disableAutoUpdate()>
		if(j != null)
	//* 120  240:aload_0         
	//* 121  241:getfield        #1026 <Field Runnable j>
	//* 122  244:ifnull          263
		{
			f.removeEnqueuedTask(j);
	//  123  247:aload_0         
	//  124  248:getfield        #445 <Field TaskExecutor f>
	//  125  251:aload_0         
	//  126  252:getfield        #1026 <Field Runnable j>
	//  127  255:invokevirtual   #451 <Method void TaskExecutor.removeEnqueuedTask(Runnable)>
			j = null;
	//  128  258:aload_0         
	//  129  259:aconst_null     
	//  130  260:putfield        #1026 <Field Runnable j>
		}
		if(Y != null)
	//* 131  263:aload_0         
	//* 132  264:getfield        #443 <Field Runnable Y>
	//* 133  267:ifnull          286
		{
			f.removeEnqueuedTask(Y);
	//  134  270:aload_0         
	//  135  271:getfield        #445 <Field TaskExecutor f>
	//  136  274:aload_0         
	//  137  275:getfield        #443 <Field Runnable Y>
	//  138  278:invokevirtual   #451 <Method void TaskExecutor.removeEnqueuedTask(Runnable)>
			Y = null;
	//  139  281:aload_0         
	//  140  282:aconst_null     
	//  141  283:putfield        #443 <Field Runnable Y>
		}
		if(c != null)
	//* 142  286:aload_0         
	//* 143  287:getfield        #317 <Field KeepAlive c>
	//* 144  290:ifnull          300
			c.cancel();
	//  145  293:aload_0         
	//  146  294:getfield        #317 <Field KeepAlive c>
	//  147  297:invokevirtual   #1095 <Method void KeepAlive.cancel()>
		if(d != null)
	//* 148  300:aload_0         
	//* 149  301:getfield        #327 <Field CacheFlusher d>
	//* 150  304:ifnull          314
			d.stop();
	//  151  307:aload_0         
	//  152  308:getfield        #327 <Field CacheFlusher d>
	//  153  311:invokevirtual   #617 <Method void CacheFlusher.stop()>
		if(f != null)
	//* 154  314:aload_0         
	//* 155  315:getfield        #445 <Field TaskExecutor f>
	//* 156  318:ifnull          328
			f.removeAllEnqueuedTasks();
	//  157  321:aload_0         
	//  158  322:getfield        #445 <Field TaskExecutor f>
	//  159  325:invokevirtual   #1098 <Method void TaskExecutor.removeAllEnqueuedTasks()>
		if(b != null)
	//* 160  328:aload_0         
	//* 161  329:getfield        #205 <Field Storage b>
	//* 162  332:ifnull          342
			b.close();
	//  163  335:aload_0         
	//  164  336:getfield        #205 <Field Storage b>
	//  165  339:invokevirtual   #1101 <Method void Storage.close()>
	//  166  342:return          
	}

	public void resetVisitorId()
	{
		f.execute(((Runnable) (new a(this))), true);
	//    0    0:aload_0         
	//    1    1:getfield        #445 <Field TaskExecutor f>
	//    2    4:new             #1104 <Class a>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #1105 <Method void a(Core)>
	//    6   12:iconst_1        
	//    7   13:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//    8   16:pop             
	//    9   17:return          
	}

	protected void s()
	{
		a(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #1107 <Method void a(boolean)>
	//    3    5:return          
	}

	public void setAppContext(Context context)
	{
		if(ab == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #336 <Field Context ab>
	//*   2    4:ifnonnull       42
		{
			if(context == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       12
				return;
	//    5   11:return          
			ab = context;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #336 <Field Context ab>
			f = d();
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #1110 <Method TaskExecutor d()>
	//   12   22:putfield        #445 <Field TaskExecutor f>
			f.execute(((Runnable) (new ag(this))), true);
	//   13   25:aload_0         
	//   14   26:getfield        #445 <Field TaskExecutor f>
	//   15   29:new             #1112 <Class ag>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:invokespecial   #1113 <Method void ag(Core)>
	//   19   37:iconst_1        
	//   20   38:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   21   41:pop             
		}
	//   22   42:return          
	}

	public void setAppName(String s1, boolean flag)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(!flag)
	//*   4    8:iload_2         
	//*   5    9:ifne            18
		{
			c(s1);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #241 <Method void c(String)>
			return;
	//    9   17:return          
		}
		if(f == null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #445 <Field TaskExecutor f>
	//*  12   22:ifnonnull       26
		{
			return;
	//   13   25:return          
		} else
		{
			f.execute(((Runnable) (new e(this, s1))), flag);
	//   14   26:aload_0         
	//   15   27:getfield        #445 <Field TaskExecutor f>
	//   16   30:new             #1115 <Class e>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokespecial   #1117 <Method void e(Core, String)>
	//   21   39:iload_2         
	//   22   40:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   23   43:pop             
			return;
	//   24   44:return          
		}
	}

	public void setAutoStartEnabled(boolean flag, boolean flag1)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			f.execute(((Runnable) (new n(this, flag))), flag1);
	//    4    8:aload_0         
	//    5    9:getfield        #445 <Field TaskExecutor f>
	//    6   12:new             #1121 <Class n>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokespecial   #1124 <Method void n(Core, boolean)>
	//   11   21:iload_2         
	//   12   22:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   13   25:pop             
			return;
	//   14   26:return          
		}
	}

	public void setAutoStartLabel(String s1, String s2)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			ad.put(((Object) (s1)), ((Object) (s2)));
	//    4    8:aload_0         
	//    5    9:getfield        #158 <Field HashMap ad>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #255 <Method Object HashMap.put(Object, Object)>
	//    9   17:pop             
			return;
	//   10   18:return          
		}
	}

	public void setAutoStartLabels(HashMap hashmap)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(hashmap == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       13
		{
			return;
	//    6   12:return          
		} else
		{
			ad.putAll(((java.util.Map) (Utils.mapOfStrings(((java.util.Map) (hashmap))))));
	//    7   13:aload_0         
	//    8   14:getfield        #158 <Field HashMap ad>
	//    9   17:aload_1         
	//   10   18:invokestatic    #484 <Method HashMap Utils.mapOfStrings(java.util.Map)>
	//   11   21:invokevirtual   #1131 <Method void HashMap.putAll(java.util.Map)>
			return;
	//   12   24:return          
		}
	}

	public void setCacheFlushingInterval(long l1, boolean flag)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(f == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #445 <Field TaskExecutor f>
	//*   6   12:ifnonnull       16
			return;
	//    7   15:return          
		if(af != l1)
	//*   8   16:aload_0         
	//*   9   17:getfield        #121 <Field long af>
	//*  10   20:lload_1         
	//*  11   21:lcmp            
	//*  12   22:ifeq            43
			f.execute(((Runnable) (new t(this, l1))), flag);
	//   13   25:aload_0         
	//   14   26:getfield        #445 <Field TaskExecutor f>
	//   15   29:new             #1136 <Class t>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:lload_1         
	//   19   35:invokespecial   #1137 <Method void t(Core, long)>
	//   20   38:iload_3         
	//   21   39:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   22   42:pop             
	//   23   43:return          
	}

	public void setCacheMaxBatchFiles(int i1, boolean flag)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(f == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #445 <Field TaskExecutor f>
	//*   6   12:ifnonnull       16
			return;
	//    7   15:return          
		if(a != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #322 <Field OfflineMeasurementsCache a>
	//*  10   20:ifnull          41
			f.execute(((Runnable) (new p(this, i1))), flag);
	//   11   23:aload_0         
	//   12   24:getfield        #445 <Field TaskExecutor f>
	//   13   27:new             #1139 <Class p>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:iload_1         
	//   17   33:invokespecial   #1142 <Method void p(Core, int)>
	//   18   36:iload_2         
	//   19   37:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   20   40:pop             
	//   21   41:return          
	}

	public void setCacheMaxFlushesInARow(int i1, boolean flag)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(f == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #445 <Field TaskExecutor f>
	//*   6   12:ifnonnull       16
			return;
	//    7   15:return          
		if(a != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #322 <Field OfflineMeasurementsCache a>
	//*  10   20:ifnull          41
			f.execute(((Runnable) (new q(this, i1))), flag);
	//   11   23:aload_0         
	//   12   24:getfield        #445 <Field TaskExecutor f>
	//   13   27:new             #1145 <Class q>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:iload_1         
	//   17   33:invokespecial   #1146 <Method void q(Core, int)>
	//   18   36:iload_2         
	//   19   37:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   20   40:pop             
	//   21   41:return          
	}

	public void setCacheMaxMeasurements(int i1, boolean flag)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(f == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #445 <Field TaskExecutor f>
	//*   6   12:ifnonnull       16
			return;
	//    7   15:return          
		if(a != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #322 <Field OfflineMeasurementsCache a>
	//*  10   20:ifnull          41
			f.execute(((Runnable) (new o(this, i1))), flag);
	//   11   23:aload_0         
	//   12   24:getfield        #445 <Field TaskExecutor f>
	//   13   27:new             #1148 <Class o>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:iload_1         
	//   17   33:invokespecial   #1149 <Method void o(Core, int)>
	//   18   36:iload_2         
	//   19   37:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   20   40:pop             
	//   21   41:return          
	}

	public void setCacheMeasurementExpiry(int i1, boolean flag)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(f == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #445 <Field TaskExecutor f>
	//*   6   12:ifnonnull       16
			return;
	//    7   15:return          
		if(a != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #322 <Field OfflineMeasurementsCache a>
	//*  10   20:ifnull          41
			f.execute(((Runnable) (new s(this, i1))), flag);
	//   11   23:aload_0         
	//   12   24:getfield        #445 <Field TaskExecutor f>
	//   13   27:new             #1151 <Class s>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:iload_1         
	//   17   33:invokespecial   #1152 <Method void s(Core, int)>
	//   18   36:iload_2         
	//   19   37:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   20   40:pop             
	//   21   41:return          
	}

	public void setCacheMinutesToRetry(int i1, boolean flag)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(f == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #445 <Field TaskExecutor f>
	//*   6   12:ifnonnull       16
			return;
	//    7   15:return          
		if(a != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #322 <Field OfflineMeasurementsCache a>
	//*  10   20:ifnull          41
			f.execute(((Runnable) (new r(this, i1))), flag);
	//   11   23:aload_0         
	//   12   24:getfield        #445 <Field TaskExecutor f>
	//   13   27:new             #1155 <Class r>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:iload_1         
	//   17   33:invokespecial   #1156 <Method void r(Core, int)>
	//   18   36:iload_2         
	//   19   37:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   20   40:pop             
	//   21   41:return          
	}

	public void setCurrentActivityName(String s1)
	{
		w = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #788 <Field String w>
	//    3    5:return          
	}

	public void setCustomerC2(String s1, boolean flag)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(s1 != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          56
		{
			if(s1.length() == 0)
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #499 <Method int String.length()>
	//*   8   16:ifne            20
				return;
	//    9   19:return          
			if(!flag)
	//*  10   20:iload_2         
	//*  11   21:ifne            30
			{
				d(s1);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokespecial   #260 <Method void d(String)>
				return;
	//   15   29:return          
			}
			if(f == null)
	//*  16   30:aload_0         
	//*  17   31:getfield        #445 <Field TaskExecutor f>
	//*  18   34:ifnonnull       38
				return;
	//   19   37:return          
			f.execute(((Runnable) (new h(this, s1))), flag);
	//   20   38:aload_0         
	//   21   39:getfield        #445 <Field TaskExecutor f>
	//   22   42:new             #1159 <Class h>
	//   23   45:dup             
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:invokespecial   #1160 <Method void h(Core, String)>
	//   27   51:iload_2         
	//   28   52:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   29   55:pop             
		}
	//   30   56:return          
	}

	public void setDebug(boolean flag)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			f.execute(((Runnable) (new m(this, flag))), true);
	//    4    8:aload_0         
	//    5    9:getfield        #445 <Field TaskExecutor f>
	//    6   12:new             #1163 <Class m>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokespecial   #1164 <Method void m(Core, boolean)>
	//   11   21:iconst_1        
	//   12   22:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   13   25:pop             
			return;
	//   14   26:return          
		}
	}

	public void setEnabled(boolean flag)
	{
		f.execute(((Runnable) (new aa(this, flag))), true);
	//    0    0:aload_0         
	//    1    1:getfield        #445 <Field TaskExecutor f>
	//    2    4:new             #1167 <Class aa>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokespecial   #1168 <Method void aa(Core, boolean)>
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//    9   17:pop             
	//   10   18:return          
	}

	public void setErrorHandlingEnabled(boolean flag)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		ag = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #123 <Field boolean ag>
		Object obj;
		if(flag)
	//*   7   13:iload_1         
	//*   8   14:ifeq            31
			obj = ((Object) (new CustomExceptionHandler(this)));
	//    9   17:new             #1170 <Class CustomExceptionHandler>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #1171 <Method void CustomExceptionHandler(Core)>
	//   13   25:astore_2        
		else
	//*  14   26:aload_2         
	//*  15   27:invokestatic    #1175 <Method void Thread.setDefaultUncaughtExceptionHandler(Thread$UncaughtExceptionHandler)>
	//*  16   30:return          
		if(Thread.getDefaultUncaughtExceptionHandler() != ah)
	//*  17   31:invokestatic    #147 <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
	//*  18   34:aload_0         
	//*  19   35:getfield        #149 <Field Thread$UncaughtExceptionHandler ah>
	//*  20   38:if_acmpeq       49
			obj = ((Object) (ah));
	//   21   41:aload_0         
	//   22   42:getfield        #149 <Field Thread$UncaughtExceptionHandler ah>
	//   23   45:astore_2        
		else
	//*  24   46:goto            26
			return;
	//   25   49:return          
		Thread.setDefaultUncaughtExceptionHandler(((Thread.UncaughtExceptionHandler) (obj)));
	}

	public void setKeepAliveEnabled(boolean flag, boolean flag1)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(!flag1)
	//*   4    8:iload_2         
	//*   5    9:ifne            18
		{
			c(flag);
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokevirtual   #1178 <Method void c(boolean)>
			return;
	//    9   17:return          
		}
		if(f == null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #445 <Field TaskExecutor f>
	//*  12   22:ifnonnull       26
		{
			return;
	//   13   25:return          
		} else
		{
			f.execute(((Runnable) (new c(this, flag))), flag1);
	//   14   26:aload_0         
	//   15   27:getfield        #445 <Field TaskExecutor f>
	//   16   30:new             #1180 <Class c>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:iload_1         
	//   20   36:invokespecial   #1181 <Method void c(Core, boolean)>
	//   21   39:iload_2         
	//   22   40:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   23   43:pop             
			return;
	//   24   44:return          
		}
	}

	public void setLabel(String s1, String s2, boolean flag)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(!flag)
	//*   4    8:iload_3         
	//*   5    9:ifne            19
		{
			b(s1, s2);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokespecial   #234 <Method void b(String, String)>
			return;
	//   10   18:return          
		}
		if(f == null)
	//*  11   19:aload_0         
	//*  12   20:getfield        #445 <Field TaskExecutor f>
	//*  13   23:ifnonnull       27
		{
			return;
	//   14   26:return          
		} else
		{
			f.execute(((Runnable) (new g(this, s1, s2))), flag);
	//   15   27:aload_0         
	//   16   28:getfield        #445 <Field TaskExecutor f>
	//   17   31:new             #1183 <Class g>
	//   18   34:dup             
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:aload_2         
	//   22   38:invokespecial   #1185 <Method void g(Core, String, String)>
	//   23   41:iload_3         
	//   24   42:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   25   45:pop             
			return;
	//   26   46:return          
		}
	}

	public void setLabels(HashMap hashmap, boolean flag)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(hashmap != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          38
		{
			if(f == null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #445 <Field TaskExecutor f>
	//*   8   16:ifnonnull       20
				return;
	//    9   19:return          
			f.execute(((Runnable) (new f(this, hashmap))), flag);
	//   10   20:aload_0         
	//   11   21:getfield        #445 <Field TaskExecutor f>
	//   12   24:new             #1189 <Class f>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokespecial   #1192 <Method void f(Core, HashMap)>
	//   17   33:iload_2         
	//   18   34:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   19   37:pop             
		}
	//   20   38:return          
	}

	public void setMeasurementLabelOrder(String as[], boolean flag)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(f == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #445 <Field TaskExecutor f>
	//*   6   12:ifnonnull       16
			return;
	//    7   15:return          
		if(as != al && as != null && as.length > 0)
	//*   8   16:aload_1         
	//*   9   17:aload_0         
	//*  10   18:getfield        #819 <Field String[] al>
	//*  11   21:if_acmpeq       51
	//*  12   24:aload_1         
	//*  13   25:ifnull          51
	//*  14   28:aload_1         
	//*  15   29:arraylength     
	//*  16   30:ifle            51
			f.execute(((Runnable) (new u(this, as))), flag);
	//   17   33:aload_0         
	//   18   34:getfield        #445 <Field TaskExecutor f>
	//   19   37:new             #1197 <Class u>
	//   20   40:dup             
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:invokespecial   #1200 <Method void u(Core, String[])>
	//   24   46:iload_2         
	//   25   47:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   26   50:pop             
	//   27   51:return          
	}

	public void setOfflineURL(String s1)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(s1 != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          46
		{
			if(s1.length() == 0)
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #499 <Method int String.length()>
	//*   8   16:ifne            20
				return;
	//    9   19:return          
			if(f == null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #445 <Field TaskExecutor f>
	//*  12   24:ifnonnull       28
				return;
	//   13   27:return          
			f.execute(((Runnable) (new b(this, s1))), true);
	//   14   28:aload_0         
	//   15   29:getfield        #445 <Field TaskExecutor f>
	//   16   32:new             #1203 <Class b>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokespecial   #1204 <Method void b(Core, String)>
	//   21   41:iconst_1        
	//   22   42:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   23   45:pop             
		}
	//   24   46:return          
	}

	public void setPixelURL(String s1, boolean flag)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(s1 != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          56
		{
			if(s1.length() == 0)
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #499 <Method int String.length()>
	//*   8   16:ifne            20
				return;
	//    9   19:return          
			if(!flag)
	//*  10   20:iload_2         
	//*  11   21:ifne            30
			{
				a(s1);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #273 <Method void a(String)>
				return;
	//   15   29:return          
			}
			if(f == null)
	//*  16   30:aload_0         
	//*  17   31:getfield        #445 <Field TaskExecutor f>
	//*  18   34:ifnonnull       38
				return;
	//   19   37:return          
			f.execute(((Runnable) (new ah(this, s1))), flag);
	//   20   38:aload_0         
	//   21   39:getfield        #445 <Field TaskExecutor f>
	//   22   42:new             #1207 <Class ah>
	//   23   45:dup             
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:invokespecial   #1208 <Method void ah(Core, String)>
	//   27   51:iload_2         
	//   28   52:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   29   55:pop             
		}
	//   30   56:return          
	}

	public void setPublisherSecret(String s1, boolean flag)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(s1 != null && s1.length() != 0)
	//*   4    8:aload_1         
	//*   5    9:ifnull          45
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #499 <Method int String.length()>
	//*   8   16:ifeq            45
		{
			if(f == null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #445 <Field TaskExecutor f>
	//*  11   23:ifnonnull       27
				return;
	//   12   26:return          
			f.execute(((Runnable) (new d(this, s1))), flag);
	//   13   27:aload_0         
	//   14   28:getfield        #445 <Field TaskExecutor f>
	//   15   31:new             #1210 <Class d>
	//   16   34:dup             
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:invokespecial   #1211 <Method void d(Core, String)>
	//   20   40:iload_2         
	//   21   41:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   22   44:pop             
		}
	//   23   45:return          
	}

	public void setSecure(boolean flag, boolean flag1)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(!flag1)
	//*   4    8:iload_2         
	//*   5    9:ifne            18
		{
			ai = flag;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #864 <Field boolean ai>
			return;
	//    9   17:return          
		}
		if(f == null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #445 <Field TaskExecutor f>
	//*  12   22:ifnonnull       26
		{
			return;
	//   13   25:return          
		} else
		{
			f.execute(((Runnable) (new k(this, flag))), flag1);
	//   14   26:aload_0         
	//   15   27:getfield        #445 <Field TaskExecutor f>
	//   16   30:new             #1214 <Class k>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:iload_1         
	//   20   36:invokespecial   #1215 <Method void k(Core, boolean)>
	//   21   39:iload_2         
	//   22   40:invokevirtual   #595 <Method boolean TaskExecutor.execute(Runnable, boolean)>
	//   23   43:pop             
			return;
	//   24   44:return          
		}
	}

	protected void t()
	{
		b(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #1217 <Method void b(boolean)>
	//    3    5:return          
	}

	protected OfflineMeasurementsCache u()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field OfflineMeasurementsCache a>
	//    2    4:areturn         
	}

	public void update()
	{
		update(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #1219 <Method void update(boolean)>
	//    3    5:return          
	}

	public void update(boolean flag)
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(f.containsTask(j))
	//*   4    8:aload_0         
	//*   5    9:getfield        #445 <Field TaskExecutor f>
	//*   6   12:aload_0         
	//*   7   13:getfield        #1026 <Field Runnable j>
	//*   8   16:invokevirtual   #1030 <Method boolean TaskExecutor.containsTask(Runnable)>
	//*   9   19:ifeq            47
		{
			f.removeEnqueuedTask(j);
	//   10   22:aload_0         
	//   11   23:getfield        #445 <Field TaskExecutor f>
	//   12   26:aload_0         
	//   13   27:getfield        #1026 <Field Runnable j>
	//   14   30:invokevirtual   #451 <Method void TaskExecutor.removeEnqueuedTask(Runnable)>
			j.run();
	//   15   33:aload_0         
	//   16   34:getfield        #1026 <Field Runnable j>
	//   17   37:invokeinterface #1054 <Method void Runnable.run()>
			j = null;
	//   18   42:aload_0         
	//   19   43:aconst_null     
	//   20   44:putfield        #1026 <Field Runnable j>
		}
		a(flag);
	//   21   47:aload_0         
	//   22   48:iload_1         
	//   23   49:invokevirtual   #1107 <Method void a(boolean)>
		b(flag);
	//   24   52:aload_0         
	//   25   53:iload_1         
	//   26   54:invokevirtual   #1217 <Method void b(boolean)>
	//   27   57:return          
	}

	protected void v()
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		w();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #341 <Method void w()>
		if(k >= 60000L)
	//*   6   12:aload_0         
	//*   7   13:getfield        #343 <Field long k>
	//*   8   16:ldc2w           #1220 <Long 60000L>
	//*   9   19:lcmp            
	//*  10   20:iflt            56
		{
			i = ((Runnable) (new y(this)));
	//   11   23:aload_0         
	//   12   24:new             #1223 <Class y>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:invokespecial   #1224 <Method void y(Core)>
	//   16   32:putfield        #1226 <Field Runnable i>
			f.execute(i, k, true, k);
	//   17   35:aload_0         
	//   18   36:getfield        #445 <Field TaskExecutor f>
	//   19   39:aload_0         
	//   20   40:getfield        #1226 <Field Runnable i>
	//   21   43:aload_0         
	//   22   44:getfield        #343 <Field long k>
	//   23   47:iconst_1        
	//   24   48:aload_0         
	//   25   49:getfield        #343 <Field long k>
	//   26   52:invokevirtual   #1229 <Method boolean TaskExecutor.execute(Runnable, long, boolean, long)>
	//   27   55:pop             
		}
	//   28   56:return          
	}

	protected void w()
	{
		if(!an)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean an>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(i != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #1226 <Field Runnable i>
	//*   6   12:ifnull          31
		{
			f.removeEnqueuedTask(i);
	//    7   15:aload_0         
	//    8   16:getfield        #445 <Field TaskExecutor f>
	//    9   19:aload_0         
	//   10   20:getfield        #1226 <Field Runnable i>
	//   11   23:invokevirtual   #451 <Method void TaskExecutor.removeEnqueuedTask(Runnable)>
			i = null;
	//   12   26:aload_0         
	//   13   27:aconst_null     
	//   14   28:putfield        #1226 <Field Runnable i>
		}
	//   15   31:return          
	}

	protected void x()
	{
	//    0    0:return          
	}

	protected void y()
	{
	//    0    0:return          
	}

	boolean z()
	{
		return ab == null || am.isPublisherSecretEmpty() || Z == null || Z.length() == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #336 <Field Context ab>
	//    2    4:ifnull          39
	//    3    7:aload_0         
	//    4    8:getfield        #196 <Field IdHelper am>
	//    5   11:invokevirtual   #1232 <Method boolean IdHelper.isPublisherSecretEmpty()>
	//    6   14:ifne            39
	//    7   17:aload_0         
	//    8   18:getfield        #467 <Field String Z>
	//    9   21:ifnull          39
	//   10   24:aload_0         
	//   11   25:getfield        #467 <Field String Z>
	//   12   28:invokevirtual   #499 <Method int String.length()>
	//   13   31:ifne            37
	//   14   34:goto            39
	//   15   37:iconst_0        
	//   16   38:ireturn         
	//   17   39:iconst_1        
	//   18   40:ireturn         
	}

	protected static final long x = 300L;
	protected AtomicInteger A;
	protected AtomicInteger B;
	protected long C;
	protected long D;
	protected long E;
	protected long F;
	protected long G;
	protected long H;
	protected long I;
	protected long J;
	protected long K;
	protected SessionState L;
	protected long M;
	protected long N;
	protected long O;
	protected int P;
	protected int Q;
	protected int R;
	protected long S;
	protected long T;
	protected long U;
	protected int V;
	protected long W;
	protected long X;
	protected Runnable Y;
	protected String Z;
	OfflineMeasurementsCache a;
	String aa;
	Context ab;
	protected final HashMap ac = new HashMap();
	protected final HashMap ad = new HashMap();
	boolean ae;
	protected long af;
	protected boolean ag;
	protected Thread.UncaughtExceptionHandler ah;
	boolean ai;
	TransmissionMode aj;
	TransmissionMode ak;
	String al[];
	private IdHelper am;
	private boolean an;
	private boolean ao;
	Storage b;
	KeepAlive c;
	CacheFlusher d;
	DispatchQueue e;
	TaskExecutor f;
	MeasurementDispatcher g;
	ConnectivityChangeReceiver h;
	protected Runnable i;
	protected Runnable j;
	protected long k;
	protected boolean l;
	protected boolean m;
	boolean n;
	AtomicInteger o;
	long p;
	AtomicInteger q;
	long r;
	long s;
	String t;
	String u;
	boolean v;
	String w;
	protected ApplicationState y;
	protected AtomicInteger z;

	private class UserInteractionTask
		implements Runnable
	{

		public void run()
		{
			if(!Core.b(a))
		//*   0    0:aload_0         
		//*   1    1:getfield        #12  <Field Core a>
		//*   2    4:invokestatic    #23  <Method boolean Core.b(Core)>
		//*   3    7:ifne            11
				return;
		//    4   10:return          
			if(a.Y != null)
		//*   5   11:aload_0         
		//*   6   12:getfield        #12  <Field Core a>
		//*   7   15:getfield        #27  <Field Runnable Core.Y>
		//*   8   18:ifnull          53
			{
				a.f.removeEnqueuedTask(a.Y);
		//    9   21:aload_0         
		//   10   22:getfield        #12  <Field Core a>
		//   11   25:getfield        #31  <Field TaskExecutor Core.f>
		//   12   28:aload_0         
		//   13   29:getfield        #12  <Field Core a>
		//   14   32:getfield        #27  <Field Runnable Core.Y>
		//   15   35:invokevirtual   #37  <Method void TaskExecutor.removeEnqueuedTask(Runnable)>
				a.Y = null;
		//   16   38:aload_0         
		//   17   39:getfield        #12  <Field Core a>
		//   18   42:aconst_null     
		//   19   43:putfield        #27  <Field Runnable Core.Y>
				a.n();
		//   20   46:aload_0         
		//   21   47:getfield        #12  <Field Core a>
		//   22   50:invokevirtual   #40  <Method void Core.n()>
			}
		//   23   53:return          
		}

		final Core a;

		public UserInteractionTask()
		{
			a = Core.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field Core a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}

}
