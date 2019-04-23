// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.internal.am;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.internal.ads:
//			agw, yb, we, zzasm, 
//			afn, wd, zzasi, ol, 
//			wx, xg, xo, of, 
//			p, bwk, m

public abstract class oe
	implements agw, yb
{

	protected oe(Context context, we we1, afn afn1, ol ol1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void Object()>
	//    6   12:putfield        #32  <Field Object g>
		h = new AtomicBoolean(true);
	//    7   15:aload_0         
	//    8   16:new             #34  <Class AtomicBoolean>
	//    9   19:dup             
	//   10   20:iconst_1        
	//   11   21:invokespecial   #37  <Method void AtomicBoolean(boolean)>
	//   12   24:putfield        #39  <Field AtomicBoolean h>
		a = context;
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:putfield        #41  <Field Context a>
		e = we1;
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:putfield        #43  <Field we e>
		c = e.b;
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #43  <Field we e>
	//   22   42:getfield        #47  <Field zzasm we.b>
	//   23   45:putfield        #49  <Field zzasm c>
		b = afn1;
	//   24   48:aload_0         
	//   25   49:aload_3         
	//   26   50:putfield        #51  <Field afn b>
		d = ol1;
	//   27   53:aload_0         
	//   28   54:aload           4
	//   29   56:putfield        #53  <Field ol d>
	//   30   59:return          
	}

	static AtomicBoolean a(oe oe1)
	{
		return oe1.h;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field AtomicBoolean h>
	//    2    4:areturn         
	}

	protected abstract void a();

	protected void a(int i)
	{
		if(i != -2)
	//*   0    0:iload_1         
	//*   1    1:bipush          -2
	//*   2    3:icmpeq          25
			c = new zzasm(i, c.j);
	//    3    6:aload_0         
	//    4    7:new             #58  <Class zzasm>
	//    5   10:dup             
	//    6   11:iload_1         
	//    7   12:aload_0         
	//    8   13:getfield        #49  <Field zzasm c>
	//    9   16:getfield        #62  <Field long zzasm.j>
	//   10   19:invokespecial   #65  <Method void zzasm(int, long)>
	//   11   22:putfield        #49  <Field zzasm c>
		b.q();
	//   12   25:aload_0         
	//   13   26:getfield        #51  <Field afn b>
	//   14   29:invokeinterface #70  <Method void afn.q()>
		ol ol1 = d;
	//   15   34:aload_0         
	//   16   35:getfield        #53  <Field ol d>
	//   17   38:astore_2        
		zzasi zzasi1 = e.a;
	//   18   39:aload_0         
	//   19   40:getfield        #43  <Field we e>
	//   20   43:getfield        #73  <Field zzasi we.a>
	//   21   46:astore_3        
		ol1.b(new wd(zzasi1.c, b, c.c, i, c.e, c.i, c.k, c.j, zzasi1.i, c.g, ((jv) (null)), ((kp) (null)), ((String) (null)), ((jw) (null)), ((jy) (null)), c.h, e.d, c.f, e.f, c.m, c.n, e.h, ((bj) (null)), c.A, c.B, c.C, c.D, c.E, ((String) (null)), c.H, c.L, e.i, e.b.O, e.j, e.b.Q, c.R, e.b.S, e.b.T, e.b.V));
	//   22   47:aload_2         
	//   23   48:new             #75  <Class wd>
	//   24   51:dup             
	//   25   52:aload_3         
	//   26   53:getfield        #80  <Field zzwb zzasi.c>
	//   27   56:aload_0         
	//   28   57:getfield        #51  <Field afn b>
	//   29   60:aload_0         
	//   30   61:getfield        #49  <Field zzasm c>
	//   31   64:getfield        #83  <Field java.util.List zzasm.c>
	//   32   67:iload_1         
	//   33   68:aload_0         
	//   34   69:getfield        #49  <Field zzasm c>
	//   35   72:getfield        #85  <Field java.util.List zzasm.e>
	//   36   75:aload_0         
	//   37   76:getfield        #49  <Field zzasm c>
	//   38   79:getfield        #88  <Field java.util.List zzasm.i>
	//   39   82:aload_0         
	//   40   83:getfield        #49  <Field zzasm c>
	//   41   86:getfield        #92  <Field int zzasm.k>
	//   42   89:aload_0         
	//   43   90:getfield        #49  <Field zzasm c>
	//   44   93:getfield        #62  <Field long zzasm.j>
	//   45   96:aload_3         
	//   46   97:getfield        #95  <Field String zzasi.i>
	//   47  100:aload_0         
	//   48  101:getfield        #49  <Field zzasm c>
	//   49  104:getfield        #98  <Field boolean zzasm.g>
	//   50  107:aconst_null     
	//   51  108:aconst_null     
	//   52  109:aconst_null     
	//   53  110:aconst_null     
	//   54  111:aconst_null     
	//   55  112:aload_0         
	//   56  113:getfield        #49  <Field zzasm c>
	//   57  116:getfield        #100 <Field long zzasm.h>
	//   58  119:aload_0         
	//   59  120:getfield        #43  <Field we e>
	//   60  123:getfield        #103 <Field zzwf we.d>
	//   61  126:aload_0         
	//   62  127:getfield        #49  <Field zzasm c>
	//   63  130:getfield        #105 <Field long zzasm.f>
	//   64  133:aload_0         
	//   65  134:getfield        #43  <Field we e>
	//   66  137:getfield        #106 <Field long we.f>
	//   67  140:aload_0         
	//   68  141:getfield        #49  <Field zzasm c>
	//   69  144:getfield        #109 <Field long zzasm.m>
	//   70  147:aload_0         
	//   71  148:getfield        #49  <Field zzasm c>
	//   72  151:getfield        #112 <Field String zzasm.n>
	//   73  154:aload_0         
	//   74  155:getfield        #43  <Field we e>
	//   75  158:getfield        #115 <Field org.json.JSONObject we.h>
	//   76  161:aconst_null     
	//   77  162:aload_0         
	//   78  163:getfield        #49  <Field zzasm c>
	//   79  166:getfield        #119 <Field zzawd zzasm.A>
	//   80  169:aload_0         
	//   81  170:getfield        #49  <Field zzasm c>
	//   82  173:getfield        #122 <Field java.util.List zzasm.B>
	//   83  176:aload_0         
	//   84  177:getfield        #49  <Field zzasm c>
	//   85  180:getfield        #125 <Field java.util.List zzasm.C>
	//   86  183:aload_0         
	//   87  184:getfield        #49  <Field zzasm c>
	//   88  187:getfield        #128 <Field boolean zzasm.D>
	//   89  190:aload_0         
	//   90  191:getfield        #49  <Field zzasm c>
	//   91  194:getfield        #132 <Field zzaso zzasm.E>
	//   92  197:aconst_null     
	//   93  198:aload_0         
	//   94  199:getfield        #49  <Field zzasm c>
	//   95  202:getfield        #135 <Field java.util.List zzasm.H>
	//   96  205:aload_0         
	//   97  206:getfield        #49  <Field zzasm c>
	//   98  209:getfield        #138 <Field String zzasm.L>
	//   99  212:aload_0         
	//  100  213:getfield        #43  <Field we e>
	//  101  216:getfield        #141 <Field bse we.i>
	//  102  219:aload_0         
	//  103  220:getfield        #43  <Field we e>
	//  104  223:getfield        #47  <Field zzasm we.b>
	//  105  226:getfield        #144 <Field boolean zzasm.O>
	//  106  229:aload_0         
	//  107  230:getfield        #43  <Field we e>
	//  108  233:getfield        #146 <Field boolean we.j>
	//  109  236:aload_0         
	//  110  237:getfield        #43  <Field we e>
	//  111  240:getfield        #47  <Field zzasm we.b>
	//  112  243:getfield        #149 <Field boolean zzasm.Q>
	//  113  246:aload_0         
	//  114  247:getfield        #49  <Field zzasm c>
	//  115  250:getfield        #152 <Field java.util.List zzasm.R>
	//  116  253:aload_0         
	//  117  254:getfield        #43  <Field we e>
	//  118  257:getfield        #47  <Field zzasm we.b>
	//  119  260:getfield        #155 <Field boolean zzasm.S>
	//  120  263:aload_0         
	//  121  264:getfield        #43  <Field we e>
	//  122  267:getfield        #47  <Field zzasm we.b>
	//  123  270:getfield        #158 <Field String zzasm.T>
	//  124  273:aload_0         
	//  125  274:getfield        #43  <Field we e>
	//  126  277:getfield        #47  <Field zzasm we.b>
	//  127  280:getfield        #161 <Field boolean zzasm.V>
	//  128  283:invokespecial   #164 <Method void wd(zzwb, afn, java.util.List, int, java.util.List, java.util.List, int, long, String, boolean, jv, kp, String, jw, jy, long, zzwf, long, long, long, String, org.json.JSONObject, bj, zzawd, java.util.List, java.util.List, boolean, zzaso, String, java.util.List, String, bse, boolean, boolean, boolean, java.util.List, boolean, String, boolean)>
	//  129  286:invokeinterface #169 <Method void ol.b(wd)>
	//  130  291:return          
	}

	public final void a(boolean flag)
	{
		wx.b("WebView finished loading.");
	//    0    0:ldc1            #171 <String "WebView finished loading.">
	//    1    2:invokestatic    #176 <Method void wx.b(String)>
		AtomicBoolean atomicboolean = h;
	//    2    5:aload_0         
	//    3    6:getfield        #39  <Field AtomicBoolean h>
	//    4    9:astore_3        
		byte byte0 = 0;
	//    5   10:iconst_0        
	//    6   11:istore_2        
		if(!atomicboolean.getAndSet(false))
	//*   7   12:aload_3         
	//*   8   13:iconst_0        
	//*   9   14:invokevirtual   #180 <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*  10   17:ifne            21
			return;
	//   11   20:return          
		if(flag)
	//*  12   21:iload_1         
	//*  13   22:ifeq            28
			byte0 = -2;
	//   14   25:bipush          -2
	//   15   27:istore_2        
		a(((int) (byte0)));
	//   16   28:aload_0         
	//   17   29:iload_2         
	//   18   30:invokevirtual   #182 <Method void a(int)>
		xg.a.removeCallbacks(f);
	//   19   33:getstatic       #187 <Field Handler xg.a>
	//   20   36:aload_0         
	//   21   37:getfield        #189 <Field Runnable f>
	//   22   40:invokevirtual   #195 <Method void Handler.removeCallbacks(Runnable)>
	//   23   43:return          
	}

	public void b()
	{
		if(!h.getAndSet(false))
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field AtomicBoolean h>
	//*   2    4:iconst_0        
	//*   3    5:invokevirtual   #180 <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   4    8:ifne            12
		{
			return;
	//    5   11:return          
		} else
		{
			b.stopLoading();
	//    6   12:aload_0         
	//    7   13:getfield        #51  <Field afn b>
	//    8   16:invokeinterface #198 <Method void afn.stopLoading()>
			aw.g();
	//    9   21:invokestatic    #203 <Method xo aw.g()>
	//   10   24:pop             
			xo.a(b);
	//   11   25:aload_0         
	//   12   26:getfield        #51  <Field afn b>
	//   13   29:invokestatic    #208 <Method boolean xo.a(afn)>
	//   14   32:pop             
			a(-1);
	//   15   33:aload_0         
	//   16   34:iconst_m1       
	//   17   35:invokevirtual   #182 <Method void a(int)>
			xg.a.removeCallbacks(f);
	//   18   38:getstatic       #187 <Field Handler xg.a>
	//   19   41:aload_0         
	//   20   42:getfield        #189 <Field Runnable f>
	//   21   45:invokevirtual   #195 <Method void Handler.removeCallbacks(Runnable)>
			return;
	//   22   48:return          
		}
	}

	public final Object c()
	{
		am.b("Webview render task needs to be called on UI thread.");
	//    0    0:ldc1            #211 <String "Webview render task needs to be called on UI thread.">
	//    1    2:invokestatic    #214 <Method void am.b(String)>
		f = ((Runnable) (new of(this)));
	//    2    5:aload_0         
	//    3    6:new             #216 <Class of>
	//    4    9:dup             
	//    5   10:aload_0         
	//    6   11:invokespecial   #219 <Method void of(oe)>
	//    7   14:putfield        #189 <Field Runnable f>
		Handler handler = xg.a;
	//    8   17:getstatic       #187 <Field Handler xg.a>
	//    9   20:astore_1        
		Runnable runnable = f;
	//   10   21:aload_0         
	//   11   22:getfield        #189 <Field Runnable f>
	//   12   25:astore_2        
		e e1 = p.bc;
	//   13   26:getstatic       #225 <Field e p.bc>
	//   14   29:astore_3        
		handler.postDelayed(runnable, ((Long)bwk.e().a(e1)).longValue());
	//   15   30:aload_1         
	//   16   31:aload_2         
	//   17   32:invokestatic    #230 <Method m bwk.e()>
	//   18   35:aload_3         
	//   19   36:invokevirtual   #235 <Method Object m.a(e)>
	//   20   39:checkcast       #237 <Class Long>
	//   21   42:invokevirtual   #241 <Method long Long.longValue()>
	//   22   45:invokevirtual   #245 <Method boolean Handler.postDelayed(Runnable, long)>
	//   23   48:pop             
		a();
	//   24   49:aload_0         
	//   25   50:invokevirtual   #247 <Method void a()>
		return ((Object) (null));
	//   26   53:aconst_null     
	//   27   54:areturn         
	}

	protected final Context a;
	protected final afn b;
	protected zzasm c;
	private final ol d;
	private final we e;
	private Runnable f;
	private final Object g = new Object();
	private AtomicBoolean h;
}
