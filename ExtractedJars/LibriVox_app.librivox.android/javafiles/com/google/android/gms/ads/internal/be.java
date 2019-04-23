// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.internal.ads.*;

// Referenced classes of package com.google.android.gms.ads.internal:
//			az, g, ax, a, 
//			ay, aw, bf, bg, 
//			bs, bh, bt

public abstract class be extends az
	implements g, nj
{

	public be(Context context, zzwf zzwf1, String s, km km, zzbbi zzbbi, bs bs1)
	{
		super(context, zzwf1, s, km, zzbbi, bs1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:invokespecial   #16  <Method void az(Context, zzwf, String, km, zzbbi, bs)>
	//    8   13:return          
	}

	protected final boolean K()
	{
		return e.k != null && e.k.b != null && e.k.b.Q;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ax e>
	//    2    4:getfield        #28  <Field we ax.k>
	//    3    7:ifnull          41
	//    4   10:aload_0         
	//    5   11:getfield        #23  <Field ax e>
	//    6   14:getfield        #28  <Field we ax.k>
	//    7   17:getfield        #34  <Field zzasm we.b>
	//    8   20:ifnull          41
	//    9   23:aload_0         
	//   10   24:getfield        #23  <Field ax e>
	//   11   27:getfield        #28  <Field we ax.k>
	//   12   30:getfield        #34  <Field zzasm we.b>
	//   13   33:getfield        #39  <Field boolean zzasm.Q>
	//   14   36:ifeq            41
	//   15   39:iconst_1        
	//   16   40:ireturn         
	//   17   41:iconst_0        
	//   18   42:ireturn         
	}

	public final void L()
	{
		((a)this).u();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #46  <Method void a.u()>
	//    2    4:return          
	}

	protected afn a(we we1, bt bt, vo vo)
	{
		Object obj = ((Object) (e.f.getNextView()));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ax e>
	//    2    4:getfield        #52  <Field ay ax.f>
	//    3    7:invokevirtual   #58  <Method View ay.getNextView()>
	//    4   10:astore          4
		if(obj instanceof afn)
	//*   5   12:aload           4
	//*   6   14:instanceof      #60  <Class afn>
	//*   7   17:ifeq            30
			((afn)obj).destroy();
	//    8   20:aload           4
	//    9   22:checkcast       #60  <Class afn>
	//   10   25:invokeinterface #63  <Method void afn.destroy()>
		if(obj != null)
	//*  11   30:aload           4
	//*  12   32:ifnull          47
			e.f.removeView(((View) (obj)));
	//   13   35:aload_0         
	//   14   36:getfield        #23  <Field ax e>
	//   15   39:getfield        #52  <Field ay ax.f>
	//   16   42:aload           4
	//   17   44:invokevirtual   #67  <Method void ay.removeView(View)>
		aw.f();
	//   18   47:invokestatic    #72  <Method aft aw.f()>
	//   19   50:pop             
		obj = ((Object) (aft.a(e.c, ahb.a(e.i), e.i.a, false, false, e.d, e.e, a, ((ap) (this)), i, we1.i)));
	//   20   51:aload_0         
	//   21   52:getfield        #23  <Field ax e>
	//   22   55:getfield        #76  <Field Context ax.c>
	//   23   58:aload_0         
	//   24   59:getfield        #23  <Field ax e>
	//   25   62:getfield        #80  <Field zzwf ax.i>
	//   26   65:invokestatic    #85  <Method ahb ahb.a(zzwf)>
	//   27   68:aload_0         
	//   28   69:getfield        #23  <Field ax e>
	//   29   72:getfield        #80  <Field zzwf ax.i>
	//   30   75:getfield        #90  <Field String zzwf.a>
	//   31   78:iconst_0        
	//   32   79:iconst_0        
	//   33   80:aload_0         
	//   34   81:getfield        #23  <Field ax e>
	//   35   84:getfield        #94  <Field com.google.android.gms.internal.ads.bad ax.d>
	//   36   87:aload_0         
	//   37   88:getfield        #23  <Field ax e>
	//   38   91:getfield        #97  <Field zzbbi ax.e>
	//   39   94:aload_0         
	//   40   95:getfield        #100 <Field ad a>
	//   41   98:aload_0         
	//   42   99:aload_0         
	//   43  100:getfield        #103 <Field bs i>
	//   44  103:aload_1         
	//   45  104:getfield        #106 <Field com.google.android.gms.internal.ads.bse we.i>
	//   46  107:invokestatic    #111 <Method afn aft.a(Context, ahb, String, boolean, boolean, com.google.android.gms.internal.ads.bad, zzbbi, ad, ap, bs, com.google.android.gms.internal.ads.bse)>
	//   47  110:astore          4
		if(e.i.g == null)
	//*  48  112:aload_0         
	//*  49  113:getfield        #23  <Field ax e>
	//*  50  116:getfield        #80  <Field zzwf ax.i>
	//*  51  119:getfield        #115 <Field zzwf[] zzwf.g>
	//*  52  122:ifnonnull       136
			((a)this).a(((afn) (obj)).getView());
	//   53  125:aload_0         
	//   54  126:aload           4
	//   55  128:invokeinterface #118 <Method View afn.getView()>
	//   56  133:invokevirtual   #120 <Method void a.a(View)>
		((afn) (obj)).w().a(((com.google.android.gms.internal.ads.bvm) (this)), ((com.google.android.gms.ads.internal.gmsg.n) (this)), ((com.google.android.gms.ads.internal.overlay.m) (this)), ((com.google.android.gms.ads.internal.gmsg.p) (this)), ((com.google.android.gms.ads.internal.overlay.s) (this)), false, ((com.google.android.gms.ads.internal.gmsg.ak) (null)), bt, ((nj) (this)), vo);
	//   57  136:aload           4
	//   58  138:invokeinterface #124 <Method agv afn.w()>
	//   59  143:aload_0         
	//   60  144:aload_0         
	//   61  145:aload_0         
	//   62  146:aload_0         
	//   63  147:aload_0         
	//   64  148:iconst_0        
	//   65  149:aconst_null     
	//   66  150:aload_2         
	//   67  151:aload_0         
	//   68  152:aload_3         
	//   69  153:invokeinterface #129 <Method void agv.a(com.google.android.gms.internal.ads.bvm, com.google.android.gms.ads.internal.gmsg.n, com.google.android.gms.ads.internal.overlay.m, com.google.android.gms.ads.internal.gmsg.p, com.google.android.gms.ads.internal.overlay.s, boolean, com.google.android.gms.ads.internal.gmsg.ak, bt, nj, vo)>
		a(((afn) (obj)));
	//   70  158:aload_0         
	//   71  159:aload           4
	//   72  161:invokevirtual   #132 <Method void a(afn)>
		((afn) (obj)).b(we1.a.v);
	//   73  164:aload           4
	//   74  166:aload_1         
	//   75  167:getfield        #135 <Field zzasi we.a>
	//   76  170:getfield        #140 <Field String zzasi.v>
	//   77  173:invokeinterface #143 <Method void afn.b(String)>
		return ((afn) (obj));
	//   78  178:aload           4
	//   79  180:areturn         
	}

	public final void a(int i, int j, int l, int i1)
	{
		((a)this).w();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #146 <Method void a.w()>
	//    2    4:return          
	}

	protected final void a(afn afn1)
	{
		afn1.a("/trackActiveViewUnit", ((com.google.android.gms.ads.internal.gmsg.ag) (new bf(this))));
	//    0    0:aload_1         
	//    1    1:ldc1            #148 <String "/trackActiveViewUnit">
	//    2    3:new             #150 <Class bf>
	//    3    6:dup             
	//    4    7:aload_0         
	//    5    8:invokespecial   #153 <Method void bf(be)>
	//    6   11:invokeinterface #156 <Method void afn.a(String, com.google.android.gms.ads.internal.gmsg.ag)>
	//    7   16:return          
	}

	public final void a(aj aj)
	{
		am.b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
	//    0    0:ldc1            #159 <String "setOnCustomRenderedAdLoadedListener must be called on the main UI thread.">
	//    1    2:invokestatic    #162 <Method void am.b(String)>
		e.D = aj;
	//    2    5:aload_0         
	//    3    6:getfield        #23  <Field ax e>
	//    4    9:aload_1         
	//    5   10:putfield        #166 <Field aj ax.D>
	//    6   13:return          
	}

	protected void a(we we1, ad ad)
	{
		if(we1.e != -2)
	//*   0    0:aload_1         
	//*   1    1:getfield        #170 <Field int we.e>
	//*   2    4:bipush          -2
	//*   3    6:icmpeq          26
		{
			xg.a.post(((Runnable) (new bg(this, we1))));
	//    4    9:getstatic       #175 <Field Handler xg.a>
	//    5   12:new             #177 <Class bg>
	//    6   15:dup             
	//    7   16:aload_0         
	//    8   17:aload_1         
	//    9   18:invokespecial   #180 <Method void bg(be, we)>
	//   10   21:invokevirtual   #186 <Method boolean Handler.post(Runnable)>
	//   11   24:pop             
			return;
	//   12   25:return          
		}
		if(we1.d != null)
	//*  13   26:aload_1         
	//*  14   27:getfield        #188 <Field zzwf we.d>
	//*  15   30:ifnull          44
			e.i = we1.d;
	//   16   33:aload_0         
	//   17   34:getfield        #23  <Field ax e>
	//   18   37:aload_1         
	//   19   38:getfield        #188 <Field zzwf we.d>
	//   20   41:putfield        #80  <Field zzwf ax.i>
		if(we1.b.g && !we1.b.z)
	//*  21   44:aload_1         
	//*  22   45:getfield        #34  <Field zzasm we.b>
	//*  23   48:getfield        #190 <Field boolean zzasm.g>
	//*  24   51:ifeq            112
	//*  25   54:aload_1         
	//*  26   55:getfield        #34  <Field zzasm we.b>
	//*  27   58:getfield        #193 <Field boolean zzasm.z>
	//*  28   61:ifne            112
		{
			e.L = 0;
	//   29   64:aload_0         
	//   30   65:getfield        #23  <Field ax e>
	//   31   68:iconst_0        
	//   32   69:putfield        #195 <Field int ax.L>
			ax ax1 = e;
	//   33   72:aload_0         
	//   34   73:getfield        #23  <Field ax e>
	//   35   76:astore_3        
			aw.d();
	//   36   77:invokestatic    #198 <Method ok aw.d()>
	//   37   80:pop             
			ax1.h = ok.a(e.c, ((a) (this)), we1, e.d, ((afn) (null)), j, ((com.google.android.gms.internal.ads.ol) (this)), ad);
	//   38   81:aload_3         
	//   39   82:aload_0         
	//   40   83:getfield        #23  <Field ax e>
	//   41   86:getfield        #76  <Field Context ax.c>
	//   42   89:aload_0         
	//   43   90:aload_1         
	//   44   91:aload_0         
	//   45   92:getfield        #23  <Field ax e>
	//   46   95:getfield        #94  <Field com.google.android.gms.internal.ads.bad ax.d>
	//   47   98:aconst_null     
	//   48   99:aload_0         
	//   49  100:getfield        #202 <Field km j>
	//   50  103:aload_0         
	//   51  104:aload_2         
	//   52  105:invokestatic    #207 <Method com.google.android.gms.internal.ads.yb ok.a(Context, a, we, com.google.android.gms.internal.ads.bad, afn, km, com.google.android.gms.internal.ads.ol, ad)>
	//   53  108:putfield        #211 <Field com.google.android.gms.internal.ads.yb ax.h>
			return;
	//   54  111:return          
		} else
		{
			vo vo = i.c.a(e.c, e.e, we1.b);
	//   55  112:aload_0         
	//   56  113:getfield        #103 <Field bs i>
	//   57  116:getfield        #216 <Field vp bs.c>
	//   58  119:aload_0         
	//   59  120:getfield        #23  <Field ax e>
	//   60  123:getfield        #76  <Field Context ax.c>
	//   61  126:aload_0         
	//   62  127:getfield        #23  <Field ax e>
	//   63  130:getfield        #97  <Field zzbbi ax.e>
	//   64  133:aload_1         
	//   65  134:getfield        #34  <Field zzasm we.b>
	//   66  137:invokeinterface #221 <Method vo vp.a(Context, zzbbi, zzasm)>
	//   67  142:astore_3        
			xg.a.post(((Runnable) (new bh(this, we1, vo, ad))));
	//   68  143:getstatic       #175 <Field Handler xg.a>
	//   69  146:new             #223 <Class bh>
	//   70  149:dup             
	//   71  150:aload_0         
	//   72  151:aload_1         
	//   73  152:aload_3         
	//   74  153:aload_2         
	//   75  154:invokespecial   #226 <Method void bh(be, we, vo, ad)>
	//   76  157:invokevirtual   #186 <Method boolean Handler.post(Runnable)>
	//   77  160:pop             
			return;
	//   78  161:return          
		}
	}

	protected boolean a(wd wd1, wd wd2)
	{
		if(e.d() && e.f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field ax e>
	//*   2    4:invokevirtual   #233 <Method boolean ax.d()>
	//*   3    7:ifeq            37
	//*   4   10:aload_0         
	//*   5   11:getfield        #23  <Field ax e>
	//*   6   14:getfield        #52  <Field ay ax.f>
	//*   7   17:ifnull          37
			e.f.a().c(wd2.A);
	//    8   20:aload_0         
	//    9   21:getfield        #23  <Field ax e>
	//   10   24:getfield        #52  <Field ay ax.f>
	//   11   27:invokevirtual   #236 <Method yc ay.a()>
	//   12   30:aload_2         
	//   13   31:getfield        #241 <Field String wd.A>
	//   14   34:invokevirtual   #245 <Method void yc.c(String)>
		if(wd2.b == null || wd2.n || !wd2.M) goto _L2; else goto _L1
	//   15   37:aload_2         
	//   16   38:getfield        #248 <Field afn wd.b>
	//   17   41:ifnull          103
	//   18   44:aload_2         
	//   19   45:getfield        #251 <Field boolean wd.n>
	//   20   48:ifne            103
	//   21   51:aload_2         
	//   22   52:getfield        #254 <Field boolean wd.M>
	//   23   55:ifeq            103
_L1:
		boolean flag = wd2.a.c.containsKey("sdk_less_server_data");
	//   24   58:aload_2         
	//   25   59:getfield        #257 <Field zzwb wd.a>
	//   26   62:getfield        #262 <Field Bundle zzwb.c>
	//   27   65:ldc2            #264 <String "sdk_less_server_data">
	//   28   68:invokevirtual   #270 <Method boolean Bundle.containsKey(String)>
	//   29   71:istore_3        
		if(flag) goto _L2; else goto _L3
	//   30   72:iload_3         
	//   31   73:ifne            103
_L3:
		wd2.b.L();
	//   32   76:aload_2         
	//   33   77:getfield        #248 <Field afn wd.b>
	//   34   80:invokeinterface #272 <Method void afn.L()>
		  goto _L2
	//*  35   85:goto            103
_L5:
		try
		{
			wx.a("Could not render test Ad label.");
	//   36   88:ldc2            #274 <String "Could not render test Ad label.">
	//   37   91:invokestatic    #278 <Method void wx.a(String)>
		}
	//*  38   94:goto            103
	//*  39   97:ldc2            #280 <String "Could not render test AdLabel.">
	//*  40  100:invokestatic    #278 <Method void wx.a(String)>
	//*  41  103:aload_2         
	//*  42  104:ifnull          127
	//*  43  107:aload_2         
	//*  44  108:getfield        #248 <Field afn wd.b>
	//*  45  111:ifnull          127
	//*  46  114:aload_2         
	//*  47  115:getfield        #248 <Field afn wd.b>
	//*  48  118:aload_2         
	//*  49  119:getfield        #283 <Field boolean wd.P>
	//*  50  122:invokeinterface #286 <Method void afn.f(boolean)>
	//*  51  127:aload_0         
	//*  52  128:aload_1         
	//*  53  129:aload_2         
	//*  54  130:invokespecial   #288 <Method boolean az.a(wd, wd)>
	//*  55  133:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			wx.a("Could not render test AdLabel.");
		}
_L2:
		Object obj;
		if(wd2 != null && wd2.b != null)
			wd2.b.f(wd2.P);
		return super.a(wd1, wd2);
	//*  56  134:astore          4
	//*  57  136:goto            97
		obj;
	//   58  139:astore          4
		if(true) goto _L5; else goto _L4
	//   59  141:goto            88
_L4:
	}

	public final void a_(View view)
	{
		e.K = view;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ax e>
	//    2    4:aload_1         
	//    3    5:putfield        #292 <Field View ax.K>
		((a)this).b(new wd(e.k, ((afn) (null)), ((com.google.android.gms.internal.ads.jv) (null)), ((com.google.android.gms.internal.ads.kp) (null)), ((String) (null)), ((com.google.android.gms.internal.ads.jy) (null)), ((com.google.android.gms.internal.ads.bj) (null)), ((String) (null))));
	//    4    8:aload_0         
	//    5    9:new             #238 <Class wd>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #23  <Field ax e>
	//    9   17:getfield        #28  <Field we ax.k>
	//   10   20:aconst_null     
	//   11   21:aconst_null     
	//   12   22:aconst_null     
	//   13   23:aconst_null     
	//   14   24:aconst_null     
	//   15   25:aconst_null     
	//   16   26:aconst_null     
	//   17   27:invokespecial   #295 <Method void wd(we, afn, com.google.android.gms.internal.ads.jv, com.google.android.gms.internal.ads.kp, String, com.google.android.gms.internal.ads.jy, com.google.android.gms.internal.ads.bj, String)>
	//   18   30:invokevirtual   #298 <Method void a.b(wd)>
	//   19   33:return          
	}

	final void b(afn afn1)
	{
		if(e.j != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field ax e>
	//*   2    4:getfield        #301 <Field wd ax.j>
	//*   3    7:ifnull          44
		{
			g.a(e.i, e.j, afn1.getView(), afn1);
	//    4   10:aload_0         
	//    5   11:getfield        #304 <Field bow g>
	//    6   14:aload_0         
	//    7   15:getfield        #23  <Field ax e>
	//    8   18:getfield        #80  <Field zzwf ax.i>
	//    9   21:aload_0         
	//   10   22:getfield        #23  <Field ax e>
	//   11   25:getfield        #301 <Field wd ax.j>
	//   12   28:aload_1         
	//   13   29:invokeinterface #118 <Method View afn.getView()>
	//   14   34:aload_1         
	//   15   35:invokevirtual   #309 <Method void bow.a(zzwf, wd, View, afn)>
			k = false;
	//   16   38:aload_0         
	//   17   39:iconst_0        
	//   18   40:putfield        #311 <Field boolean k>
			return;
	//   19   43:return          
		} else
		{
			k = true;
	//   20   44:aload_0         
	//   21   45:iconst_1        
	//   22   46:putfield        #311 <Field boolean k>
			wx.e("Request to enable ActiveView before adState is available.");
	//   23   49:ldc2            #313 <String "Request to enable ActiveView before adState is available.">
	//   24   52:invokestatic    #315 <Method void wx.e(String)>
			return;
	//   25   55:return          
		}
	}

	public final void f_()
	{
		((a)this).e();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #318 <Method void a.e()>
	//    2    4:return          
	}

	public final void g_()
	{
		((az)this).ac();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #322 <Method void az.ac()>
		((a)this).n();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #324 <Method void a.n()>
	//    4    8:return          
	}

	protected void x()
	{
		super.x();
	//    0    0:aload_0         
	//    1    1:invokespecial   #327 <Method void az.x()>
		if(k)
	//*   2    4:aload_0         
	//*   3    5:getfield        #311 <Field boolean k>
	//*   4    8:ifeq            45
		{
			com.google.android.gms.internal.ads.e e = p.bC;
	//    5   11:getstatic       #333 <Field com.google.android.gms.internal.ads.e p.bC>
	//    6   14:astore_1        
			if(((Boolean)bwk.e().a(e)).booleanValue())
	//*   7   15:invokestatic    #338 <Method m bwk.e()>
	//*   8   18:aload_1         
	//*   9   19:invokevirtual   #343 <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//*  10   22:checkcast       #345 <Class Boolean>
	//*  11   25:invokevirtual   #348 <Method boolean Boolean.booleanValue()>
	//*  12   28:ifeq            45
				b(this.e.j.b);
	//   13   31:aload_0         
	//   14   32:aload_0         
	//   15   33:getfield        #23  <Field ax e>
	//   16   36:getfield        #301 <Field wd ax.j>
	//   17   39:getfield        #248 <Field afn wd.b>
	//   18   42:invokevirtual   #350 <Method void b(afn)>
		}
	//   19   45:return          
	}

	private boolean k;
}
