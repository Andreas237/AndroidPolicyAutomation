// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.ads.internal.gmsg.*;
import com.google.android.gms.common.util.e;
import java.util.concurrent.*;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wt, rk, sj, p, 
//			hw, bwk, m, si, 
//			sh, xg, zzasm, zv, 
//			sd, ss, hl, wx, 
//			vt, zzasi, we, sc, 
//			sg, qn, im, bsm

public final class sb extends wt
{

	public sb(Context context, rk rk1, qn qn, bsm bsm)
	{
		super(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #71  <Method void wt(boolean)>
		j = new Object();
	//    3    5:aload_0         
	//    4    6:new             #51  <Class Object>
	//    5    9:dup             
	//    6   10:invokespecial   #54  <Method void Object()>
	//    7   13:putfield        #73  <Field Object j>
		h = qn;
	//    8   16:aload_0         
	//    9   17:aload_3         
	//   10   18:putfield        #75  <Field qn h>
		k = context;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #77  <Field Context k>
		i = rk1;
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:putfield        #79  <Field rk i>
		m = bsm;
	//   17   31:aload_0         
	//   18   32:aload           4
	//   19   34:putfield        #81  <Field bsm m>
		synchronized(b)
	//*  20   37:getstatic       #56  <Field Object b>
	//*  21   40:astore_3        
	//*  22   41:aload_3         
	//*  23   42:monitorenter    
		{
			if(!c)
	//*  24   43:getstatic       #58  <Field boolean c>
	//*  25   46:ifne            149
			{
				f = new al();
	//   26   49:new             #83  <Class al>
	//   27   52:dup             
	//   28   53:invokespecial   #84  <Method void al()>
	//   29   56:putstatic       #64  <Field al f>
				e = new HttpClient(context.getApplicationContext(), rk1.j);
	//   30   59:new             #86  <Class HttpClient>
	//   31   62:dup             
	//   32   63:aload_1         
	//   33   64:invokevirtual   #92  <Method Context Context.getApplicationContext()>
	//   34   67:aload_2         
	//   35   68:getfield        #97  <Field zzbbi rk.j>
	//   36   71:invokespecial   #100 <Method void HttpClient(Context, zzbbi)>
	//   37   74:putstatic       #62  <Field HttpClient e>
				g = ((ag) (new sj()));
	//   38   77:new             #102 <Class sj>
	//   39   80:dup             
	//   40   81:invokespecial   #103 <Method void sj()>
	//   41   84:putstatic       #66  <Field ag g>
				context = k.getApplicationContext();
	//   42   87:aload_0         
	//   43   88:getfield        #77  <Field Context k>
	//   44   91:invokevirtual   #92  <Method Context Context.getApplicationContext()>
	//   45   94:astore_1        
				rk1 = ((rk) (i.j));
	//   46   95:aload_0         
	//   47   96:getfield        #79  <Field rk i>
	//   48   99:getfield        #97  <Field zzbbi rk.j>
	//   49  102:astore_2        
				bsm = ((bsm) (p.a));
	//   50  103:getstatic       #108 <Field com.google.android.gms.internal.ads.e p.a>
	//   51  106:astore          4
				d = new hw(context, ((zzbbi) (rk1)), (String)com.google.android.gms.internal.ads.bwk.e().a(((com.google.android.gms.internal.ads.e) (bsm))), ((yn) (new si())), ((yn) (new sh())));
	//   52  108:new             #110 <Class hw>
	//   53  111:dup             
	//   54  112:aload_1         
	//   55  113:aload_2         
	//   56  114:invokestatic    #115 <Method m com.google.android.gms.internal.ads.bwk.e()>
	//   57  117:aload           4
	//   58  119:invokevirtual   #120 <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//   59  122:checkcast       #122 <Class String>
	//   60  125:new             #124 <Class si>
	//   61  128:dup             
	//   62  129:invokespecial   #125 <Method void si()>
	//   63  132:new             #127 <Class sh>
	//   64  135:dup             
	//   65  136:invokespecial   #128 <Method void sh()>
	//   66  139:invokespecial   #131 <Method void hw(Context, zzbbi, String, yn, yn)>
	//   67  142:putstatic       #60  <Field hw d>
				c = true;
	//   68  145:iconst_1        
	//   69  146:putstatic       #58  <Field boolean c>
			}
		}
	//   70  149:aload_3         
	//   71  150:monitorexit     
		return;
	//   72  151:return          
		context;
	//   73  152:astore_1        
		qn;
	//   74  153:aload_3         
		JVM INSTR monitorexit ;
	//   75  154:monitorexit     
		throw context;
	//   76  155:aload_1         
	//   77  156:athrow          
	}

	static im a(sb sb1, im im)
	{
		sb1.l = im;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #134 <Field im l>
		return im;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static qn a(sb sb1)
	{
		return sb1.h;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field qn h>
	//    2    4:areturn         
	}

	private final zzasm a(zzasi zzasi1)
	{
		long l1;
		long l2;
		long l3;
		Future future;
		aw.e();
	//    0    0:invokestatic    #149 <Method xg aw.e()>
	//    1    3:pop             
		String s = xg.a();
	//    2    4:invokestatic    #154 <Method String xg.a()>
	//    3    7:astore          8
		JSONObject jsonobject1 = a(zzasi1, s);
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:aload           8
	//    7   13:invokespecial   #157 <Method JSONObject a(zzasi, String)>
	//    8   16:astore          9
		if(jsonobject1 == null)
	//*   9   18:aload           9
	//*  10   20:ifnonnull       32
			return new zzasm(0);
	//   11   23:new             #159 <Class zzasm>
	//   12   26:dup             
	//   13   27:iconst_0        
	//   14   28:invokespecial   #162 <Method void zzasm(int)>
	//   15   31:areturn         
		l1 = aw.l().b();
	//   16   32:invokestatic    #165 <Method e aw.l()>
	//   17   35:invokeinterface #170 <Method long e.b()>
	//   18   40:lstore_2        
		future = f.a(s);
	//   19   41:getstatic       #64  <Field al f>
	//   20   44:aload           8
	//   21   46:invokevirtual   #173 <Method Future al.a(String)>
	//   22   49:astore          10
		zv.a.post(((Runnable) (new sd(this, jsonobject1, s))));
	//   23   51:getstatic       #178 <Field Handler zv.a>
	//   24   54:new             #180 <Class sd>
	//   25   57:dup             
	//   26   58:aload_0         
	//   27   59:aload           9
	//   28   61:aload           8
	//   29   63:invokespecial   #183 <Method void sd(sb, JSONObject, String)>
	//   30   66:invokevirtual   #189 <Method boolean Handler.post(Runnable)>
	//   31   69:pop             
		l2 = a;
	//   32   70:getstatic       #49  <Field long a>
	//   33   73:lstore          4
		l3 = aw.l().b();
	//   34   75:invokestatic    #165 <Method e aw.l()>
	//   35   78:invokeinterface #170 <Method long e.b()>
	//   36   83:lstore          6
		JSONObject jsonobject;
		try
		{
			jsonobject = (JSONObject)future.get(l2 - (l3 - l1), TimeUnit.MILLISECONDS);
	//   37   85:aload           10
	//   38   87:lload           4
	//   39   89:lload           6
	//   40   91:lload_2         
	//   41   92:lsub            
	//   42   93:lsub            
	//   43   94:getstatic       #192 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   44   97:invokeinterface #198 <Method Object Future.get(long, TimeUnit)>
	//   45  102:checkcast       #200 <Class JSONObject>
	//   46  105:astore          8
		}
	//*  47  107:aload           8
	//*  48  109:ifnonnull       121
	//*  49  112:new             #159 <Class zzasm>
	//*  50  115:dup             
	//*  51  116:iconst_m1       
	//*  52  117:invokespecial   #162 <Method void zzasm(int)>
	//*  53  120:areturn         
	//*  54  121:aload_0         
	//*  55  122:getfield        #77  <Field Context k>
	//*  56  125:aload_1         
	//*  57  126:aload           8
	//*  58  128:invokevirtual   #203 <Method String JSONObject.toString()>
	//*  59  131:invokestatic    #208 <Method zzasm ss.a(Context, zzasi, String)>
	//*  60  134:astore_1        
	//*  61  135:aload_1         
	//*  62  136:getfield        #211 <Field int zzasm.d>
	//*  63  139:bipush          -3
	//*  64  141:icmpeq          163
	//*  65  144:aload_1         
	//*  66  145:getfield        #214 <Field String zzasm.b>
	//*  67  148:invokestatic    #220 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  68  151:ifeq            163
	//*  69  154:new             #159 <Class zzasm>
	//*  70  157:dup             
	//*  71  158:iconst_3        
	//*  72  159:invokespecial   #162 <Method void zzasm(int)>
	//*  73  162:areturn         
	//*  74  163:aload_1         
	//*  75  164:areturn         
	//*  76  165:new             #159 <Class zzasm>
	//*  77  168:dup             
	//*  78  169:iconst_0        
	//*  79  170:invokespecial   #162 <Method void zzasm(int)>
	//*  80  173:areturn         
	//*  81  174:new             #159 <Class zzasm>
	//*  82  177:dup             
	//*  83  178:iconst_2        
	//*  84  179:invokespecial   #162 <Method void zzasm(int)>
	//*  85  182:areturn         
	//*  86  183:new             #159 <Class zzasm>
	//*  87  186:dup             
	//*  88  187:iconst_m1       
	//*  89  188:invokespecial   #162 <Method void zzasm(int)>
	//*  90  191:areturn         
		// Misplaced declaration of an exception variable
		catch(zzasi zzasi1)
		{
			return new zzasm(-1);
		}
	//*  91  192:astore_1        
	//*  92  193:goto            183
		// Misplaced declaration of an exception variable
		catch(zzasi zzasi1)
		{
			return new zzasm(2);
		}
	//*  93  196:astore_1        
	//*  94  197:goto            174
		// Misplaced declaration of an exception variable
		catch(zzasi zzasi1)
		{
			return new zzasm(0);
		}
		if(jsonobject == null)
			return new zzasm(-1);
		zzasi1 = ((zzasi) (ss.a(k, zzasi1, jsonobject.toString())));
		if(((zzasm) (zzasi1)).d != -3 && TextUtils.isEmpty(((CharSequence) (((zzasm) (zzasi1)).b))))
			return new zzasm(3);
		else
			return ((zzasm) (zzasi1));
	//*  95  200:astore_1        
	//*  96  201:goto            165
	}

	private final JSONObject a(zzasi zzasi1, String s)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #222 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #224 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #229 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	protected static void a(hl hl1)
	{
		hl1.a("/loadAd", ((ag) (f)));
	//    0    0:aload_0         
	//    1    1:ldc1            #232 <String "/loadAd">
	//    2    3:getstatic       #64  <Field al f>
	//    3    6:invokeinterface #237 <Method void hl.a(String, ag)>
		hl1.a("/fetchHttpRequest", ((ag) (e)));
	//    4   11:aload_0         
	//    5   12:ldc1            #239 <String "/fetchHttpRequest">
	//    6   14:getstatic       #62  <Field HttpClient e>
	//    7   17:invokeinterface #237 <Method void hl.a(String, ag)>
		hl1.a("/invalidRequest", g);
	//    8   22:aload_0         
	//    9   23:ldc1            #241 <String "/invalidRequest">
	//   10   25:getstatic       #66  <Field ag g>
	//   11   28:invokeinterface #237 <Method void hl.a(String, ag)>
	//   12   33:return          
	}

	static im b(sb sb1)
	{
		return sb1.l;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field im l>
	//    2    4:areturn         
	}

	protected static void b(hl hl1)
	{
		hl1.b("/loadAd", ((ag) (f)));
	//    0    0:aload_0         
	//    1    1:ldc1            #232 <String "/loadAd">
	//    2    3:getstatic       #64  <Field al f>
	//    3    6:invokeinterface #244 <Method void hl.b(String, ag)>
		hl1.b("/fetchHttpRequest", ((ag) (e)));
	//    4   11:aload_0         
	//    5   12:ldc1            #239 <String "/fetchHttpRequest">
	//    6   14:getstatic       #62  <Field HttpClient e>
	//    7   17:invokeinterface #244 <Method void hl.b(String, ag)>
		hl1.b("/invalidRequest", g);
	//    8   22:aload_0         
	//    9   23:ldc1            #241 <String "/invalidRequest">
	//   10   25:getstatic       #66  <Field ag g>
	//   11   28:invokeinterface #244 <Method void hl.b(String, ag)>
	//   12   33:return          
	}

	static al d()
	{
		return f;
	//    0    0:getstatic       #64  <Field al f>
	//    1    3:areturn         
	}

	static hw e()
	{
		return d;
	//    0    0:getstatic       #60  <Field hw d>
	//    1    3:areturn         
	}

	public final void a()
	{
		wx.b("SdkLessAdLoaderBackgroundTask started.");
	//    0    0:ldc1            #248 <String "SdkLessAdLoaderBackgroundTask started.">
	//    1    2:invokestatic    #252 <Method void wx.b(String)>
		Object obj = ((Object) (aw.E().e(k)));
	//    2    5:invokestatic    #256 <Method vt aw.E()>
	//    3    8:aload_0         
	//    4    9:getfield        #77  <Field Context k>
	//    5   12:invokevirtual   #261 <Method String com.google.android.gms.internal.ads.vt.e(Context)>
	//    6   15:astore_3        
		zzasi zzasi1 = new zzasi(i, -1L, aw.E().c(k), aw.E().d(k), ((String) (obj)), aw.E().f(k));
	//    7   16:new             #263 <Class zzasi>
	//    8   19:dup             
	//    9   20:aload_0         
	//   10   21:getfield        #79  <Field rk i>
	//   11   24:ldc2w           #264 <Long -1L>
	//   12   27:invokestatic    #256 <Method vt aw.E()>
	//   13   30:aload_0         
	//   14   31:getfield        #77  <Field Context k>
	//   15   34:invokevirtual   #267 <Method String vt.c(Context)>
	//   16   37:invokestatic    #256 <Method vt aw.E()>
	//   17   40:aload_0         
	//   18   41:getfield        #77  <Field Context k>
	//   19   44:invokevirtual   #269 <Method String vt.d(Context)>
	//   20   47:aload_3         
	//   21   48:invokestatic    #256 <Method vt aw.E()>
	//   22   51:aload_0         
	//   23   52:getfield        #77  <Field Context k>
	//   24   55:invokevirtual   #271 <Method String vt.f(Context)>
	//   25   58:invokespecial   #274 <Method void zzasi(rk, long, String, String, String, String)>
	//   26   61:astore          4
		zzasm zzasm1 = a(zzasi1);
	//   27   63:aload_0         
	//   28   64:aload           4
	//   29   66:invokespecial   #276 <Method zzasm a(zzasi)>
	//   30   69:astore          5
		if((zzasm1.d == -2 || zzasm1.d == 3) && !TextUtils.isEmpty(((CharSequence) (obj))))
	//*  31   71:aload           5
	//*  32   73:getfield        #211 <Field int zzasm.d>
	//*  33   76:bipush          -2
	//*  34   78:icmpeq          90
	//*  35   81:aload           5
	//*  36   83:getfield        #211 <Field int zzasm.d>
	//*  37   86:iconst_3        
	//*  38   87:icmpne          108
	//*  39   90:aload_3         
	//*  40   91:invokestatic    #220 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  41   94:ifne            108
			aw.E().f(k, ((String) (obj)));
	//   42   97:invokestatic    #256 <Method vt aw.E()>
	//   43  100:aload_0         
	//   44  101:getfield        #77  <Field Context k>
	//   45  104:aload_3         
	//   46  105:invokevirtual   #279 <Method void vt.f(Context, String)>
		long l1 = aw.l().b();
	//   47  108:invokestatic    #165 <Method e aw.l()>
	//   48  111:invokeinterface #170 <Method long e.b()>
	//   49  116:lstore_1        
		obj = ((Object) (new we(zzasi1, zzasm1, ((jw) (null)), ((zzwf) (null)), zzasm1.d, l1, zzasm1.m, ((JSONObject) (null)), m)));
	//   50  117:new             #281 <Class we>
	//   51  120:dup             
	//   52  121:aload           4
	//   53  123:aload           5
	//   54  125:aconst_null     
	//   55  126:aconst_null     
	//   56  127:aload           5
	//   57  129:getfield        #211 <Field int zzasm.d>
	//   58  132:lload_1         
	//   59  133:aload           5
	//   60  135:getfield        #283 <Field long zzasm.m>
	//   61  138:aconst_null     
	//   62  139:aload_0         
	//   63  140:getfield        #81  <Field bsm m>
	//   64  143:invokespecial   #286 <Method void we(zzasi, zzasm, jw, zzwf, int, long, long, JSONObject, bsm)>
	//   65  146:astore_3        
		zv.a.post(((Runnable) (new sc(this, ((we) (obj))))));
	//   66  147:getstatic       #178 <Field Handler zv.a>
	//   67  150:new             #288 <Class sc>
	//   68  153:dup             
	//   69  154:aload_0         
	//   70  155:aload_3         
	//   71  156:invokespecial   #291 <Method void sc(sb, we)>
	//   72  159:invokevirtual   #189 <Method boolean Handler.post(Runnable)>
	//   73  162:pop             
	//   74  163:return          
	}

	public final void b_()
	{
		synchronized(j)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field Object j>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zv.a.post(((Runnable) (new sg(this))));
	//    5    7:getstatic       #178 <Field Handler zv.a>
	//    6   10:new             #294 <Class sg>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #297 <Method void sg(sb)>
	//   10   18:invokevirtual   #189 <Method boolean Handler.post(Runnable)>
	//   11   21:pop             
		}
	//   12   22:aload_1         
	//   13   23:monitorexit     
		return;
	//   14   24:return          
		exception;
	//   15   25:astore_2        
		obj;
	//   16   26:aload_1         
		JVM INSTR monitorexit ;
	//   17   27:monitorexit     
		throw exception;
	//   18   28:aload_2         
	//   19   29:athrow          
	}

	private static final long a;
	private static final Object b = new Object();
	private static boolean c = false;
	private static hw d = null;
	private static HttpClient e = null;
	private static al f = null;
	private static ag g = null;
	private final qn h;
	private final rk i;
	private final Object j;
	private final Context k;
	private im l;
	private bsm m;

	static 
	{
		a = TimeUnit.SECONDS.toMillis(10L);
	//    0    0:getstatic       #41  <Field TimeUnit TimeUnit.SECONDS>
	//    1    3:ldc2w           #42  <Long 10L>
	//    2    6:invokevirtual   #47  <Method long TimeUnit.toMillis(long)>
	//    3    9:putstatic       #49  <Field long a>
	//    4   12:new             #51  <Class Object>
	//    5   15:dup             
	//    6   16:invokespecial   #54  <Method void Object()>
	//    7   19:putstatic       #56  <Field Object b>
	//    8   22:iconst_0        
	//    9   23:putstatic       #58  <Field boolean c>
	//   10   26:aconst_null     
	//   11   27:putstatic       #60  <Field hw d>
	//   12   30:aconst_null     
	//   13   31:putstatic       #62  <Field HttpClient e>
	//   14   34:aconst_null     
	//   15   35:putstatic       #64  <Field al f>
	//   16   38:aconst_null     
	//   17   39:putstatic       #66  <Field ag g>
	//*  18   42:return          
	}
}
