// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.*;
import com.google.android.gms.ads.internal.gmsg.h;
import com.google.android.gms.ads.internal.gmsg.r;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zk, xg, pn, ahb, 
//			we, zzasi, aft, afn, 
//			aew, pl, pm, bwk, 
//			zv, agv, po, abo, 
//			pi, wx, pj, pk, 
//			p, m, bad, ad

public final class pf
{

	public pf(Context context, bad bad, we we1, ad ad, ac ac1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #36  <Method void Object()>
	//    6   12:putfield        #38  <Field Object a>
		k = -1;
	//    7   15:aload_0         
	//    8   16:iconst_m1       
	//    9   17:putfield        #40  <Field int k>
		l = -1;
	//   10   20:aload_0         
	//   11   21:iconst_m1       
	//   12   22:putfield        #42  <Field int l>
		b = context;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #44  <Field Context b>
		c = bad;
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:putfield        #46  <Field bad c>
		d = we1;
	//   19   35:aload_0         
	//   20   36:aload_3         
	//   21   37:putfield        #48  <Field we d>
		e = ad;
	//   22   40:aload_0         
	//   23   41:aload           4
	//   24   43:putfield        #50  <Field ad e>
		f = ac1;
	//   25   46:aload_0         
	//   26   47:aload           5
	//   27   49:putfield        #52  <Field ac f>
		j = new zk(200L);
	//   28   52:aload_0         
	//   29   53:new             #54  <Class zk>
	//   30   56:dup             
	//   31   57:ldc2w           #55  <Long 200L>
	//   32   60:invokespecial   #59  <Method void zk(long)>
	//   33   63:putfield        #61  <Field zk j>
		aw.e();
	//   34   66:invokestatic    #66  <Method xg aw.e()>
	//   35   69:pop             
		i = com.google.android.gms.internal.ads.xg.a((WindowManager)context.getSystemService("window"));
	//   36   70:aload_0         
	//   37   71:aload_1         
	//   38   72:ldc1            #68  <String "window">
	//   39   74:invokevirtual   #74  <Method Object Context.getSystemService(String)>
	//   40   77:checkcast       #76  <Class WindowManager>
	//   41   80:invokestatic    #81  <Method DisplayMetrics com.google.android.gms.internal.ads.xg.a(WindowManager)>
	//   42   83:putfield        #83  <Field DisplayMetrics i>
	//   43   86:return          
	}

	private final android.view.ViewTreeObserver.OnGlobalLayoutListener a(WeakReference weakreference)
	{
		if(g == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener g>
	//*   2    4:ifnonnull       20
			g = ((android.view.ViewTreeObserver.OnGlobalLayoutListener) (new pn(this, weakreference)));
	//    3    7:aload_0         
	//    4    8:new             #89  <Class pn>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #92  <Method void pn(pf, WeakReference)>
	//    9   17:putfield        #87  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener g>
		return g;
	//   10   20:aload_0         
	//   11   21:getfield        #87  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener g>
	//   12   24:areturn         
	}

	static ac a(pf pf1)
	{
		return pf1.f;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ac f>
	//    2    4:areturn         
	}

	private final afn a()
	{
		aw.f();
	//    0    0:invokestatic    #97  <Method aft aw.f()>
	//    1    3:pop             
		return com.google.android.gms.internal.ads.aft.a(b, com.google.android.gms.internal.ads.ahb.a(), "native-video", false, false, c, d.a.k, e, ((com.google.android.gms.ads.internal.ap) (null)), ((a) (f)).i(), d.i);
	//    2    4:aload_0         
	//    3    5:getfield        #44  <Field Context b>
	//    4    8:invokestatic    #102 <Method ahb com.google.android.gms.internal.ads.ahb.a()>
	//    5   11:ldc1            #104 <String "native-video">
	//    6   13:iconst_0        
	//    7   14:iconst_0        
	//    8   15:aload_0         
	//    9   16:getfield        #46  <Field bad c>
	//   10   19:aload_0         
	//   11   20:getfield        #48  <Field we d>
	//   12   23:getfield        #109 <Field zzasi com.google.android.gms.internal.ads.we.a>
	//   13   26:getfield        #114 <Field zzbbi zzasi.k>
	//   14   29:aload_0         
	//   15   30:getfield        #50  <Field ad e>
	//   16   33:aconst_null     
	//   17   34:aload_0         
	//   18   35:getfield        #52  <Field ac f>
	//   19   38:invokevirtual   #119 <Method com.google.android.gms.ads.internal.bs a.i()>
	//   20   41:aload_0         
	//   21   42:getfield        #48  <Field we d>
	//   22   45:getfield        #122 <Field bse we.i>
	//   23   48:invokestatic    #127 <Method afn com.google.android.gms.internal.ads.aft.a(Context, ahb, String, boolean, boolean, bad, zzbbi, ad, com.google.android.gms.ads.internal.ap, com.google.android.gms.ads.internal.bs, bse)>
	//   24   51:areturn         
	}

	private final void a(afn afn1, boolean flag)
	{
		afn1.a("/video", r.l);
	//    0    0:aload_1         
	//    1    1:ldc1            #130 <String "/video">
	//    2    3:getstatic       #135 <Field com.google.android.gms.ads.internal.gmsg.ag r.l>
	//    3    6:invokeinterface #140 <Method void com.google.android.gms.internal.ads.afn.a(String, com.google.android.gms.ads.internal.gmsg.ag)>
		afn1.a("/videoMeta", r.m);
	//    4   11:aload_1         
	//    5   12:ldc1            #142 <String "/videoMeta">
	//    6   14:getstatic       #145 <Field com.google.android.gms.ads.internal.gmsg.ag r.m>
	//    7   17:invokeinterface #140 <Method void com.google.android.gms.internal.ads.afn.a(String, com.google.android.gms.ads.internal.gmsg.ag)>
		afn1.a("/precache", ((com.google.android.gms.ads.internal.gmsg.ag) (new aew())));
	//    8   22:aload_1         
	//    9   23:ldc1            #147 <String "/precache">
	//   10   25:new             #149 <Class aew>
	//   11   28:dup             
	//   12   29:invokespecial   #150 <Method void aew()>
	//   13   32:invokeinterface #140 <Method void com.google.android.gms.internal.ads.afn.a(String, com.google.android.gms.ads.internal.gmsg.ag)>
		afn1.a("/delayPageLoaded", r.p);
	//   14   37:aload_1         
	//   15   38:ldc1            #152 <String "/delayPageLoaded">
	//   16   40:getstatic       #155 <Field com.google.android.gms.ads.internal.gmsg.ag r.p>
	//   17   43:invokeinterface #140 <Method void com.google.android.gms.internal.ads.afn.a(String, com.google.android.gms.ads.internal.gmsg.ag)>
		afn1.a("/instrument", r.n);
	//   18   48:aload_1         
	//   19   49:ldc1            #157 <String "/instrument">
	//   20   51:getstatic       #160 <Field com.google.android.gms.ads.internal.gmsg.ag r.n>
	//   21   54:invokeinterface #140 <Method void com.google.android.gms.internal.ads.afn.a(String, com.google.android.gms.ads.internal.gmsg.ag)>
		afn1.a("/log", r.g);
	//   22   59:aload_1         
	//   23   60:ldc1            #162 <String "/log">
	//   24   62:getstatic       #164 <Field com.google.android.gms.ads.internal.gmsg.ag r.g>
	//   25   65:invokeinterface #140 <Method void com.google.android.gms.internal.ads.afn.a(String, com.google.android.gms.ads.internal.gmsg.ag)>
		afn1.a("/videoClicked", r.h);
	//   26   70:aload_1         
	//   27   71:ldc1            #166 <String "/videoClicked">
	//   28   73:getstatic       #168 <Field com.google.android.gms.ads.internal.gmsg.ag r.h>
	//   29   76:invokeinterface #140 <Method void com.google.android.gms.internal.ads.afn.a(String, com.google.android.gms.ads.internal.gmsg.ag)>
		afn1.a("/trackActiveViewUnit", ((com.google.android.gms.ads.internal.gmsg.ag) (new pl(this))));
	//   30   81:aload_1         
	//   31   82:ldc1            #170 <String "/trackActiveViewUnit">
	//   32   84:new             #172 <Class pl>
	//   33   87:dup             
	//   34   88:aload_0         
	//   35   89:invokespecial   #175 <Method void pl(pf)>
	//   36   92:invokeinterface #140 <Method void com.google.android.gms.internal.ads.afn.a(String, com.google.android.gms.ads.internal.gmsg.ag)>
		afn1.a("/untrackActiveViewUnit", ((com.google.android.gms.ads.internal.gmsg.ag) (new pm(this))));
	//   37   97:aload_1         
	//   38   98:ldc1            #177 <String "/untrackActiveViewUnit">
	//   39  100:new             #179 <Class pm>
	//   40  103:dup             
	//   41  104:aload_0         
	//   42  105:invokespecial   #180 <Method void pm(pf)>
	//   43  108:invokeinterface #140 <Method void com.google.android.gms.internal.ads.afn.a(String, com.google.android.gms.ads.internal.gmsg.ag)>
		if(flag)
	//*  44  113:iload_2         
	//*  45  114:ifeq            134
			afn1.a("/open", ((com.google.android.gms.ads.internal.gmsg.ag) (new h(((com.google.android.gms.ads.internal.bt) (null)), ((my) (null))))));
	//   46  117:aload_1         
	//   47  118:ldc1            #182 <String "/open">
	//   48  120:new             #184 <Class h>
	//   49  123:dup             
	//   50  124:aconst_null     
	//   51  125:aconst_null     
	//   52  126:invokespecial   #187 <Method void h(com.google.android.gms.ads.internal.bt, my)>
	//   53  129:invokeinterface #140 <Method void com.google.android.gms.internal.ads.afn.a(String, com.google.android.gms.ads.internal.gmsg.ag)>
	//   54  134:return          
	}

	static void a(pf pf1, WeakReference weakreference, boolean flag)
	{
		pf1.a(weakreference, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #191 <Method void a(WeakReference, boolean)>
	//    4    6:return          
	}

	private final void a(WeakReference weakreference, boolean flag)
	{
		int i1;
		int j1;
		boolean flag1;
		if(weakreference == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		weakreference = ((WeakReference) ((afn)weakreference.get()));
	//    3    5:aload_1         
	//    4    6:invokevirtual   #197 <Method Object WeakReference.get()>
	//    5    9:checkcast       #137 <Class afn>
	//    6   12:astore_1        
		if(weakreference == null)
			break MISSING_BLOCK_LABEL_185;
	//    7   13:aload_1         
	//    8   14:ifnull          185
		if(((afn) (weakreference)).getView() == null)
	//*   9   17:aload_1         
	//*  10   18:invokeinterface #201 <Method View afn.getView()>
	//*  11   23:ifnonnull       27
			return;
	//   12   26:return          
		if(flag && !j.a())
	//*  13   27:iload_2         
	//*  14   28:ifeq            42
	//*  15   31:aload_0         
	//*  16   32:getfield        #61  <Field zk j>
	//*  17   35:invokevirtual   #204 <Method boolean com.google.android.gms.internal.ads.zk.a()>
	//*  18   38:ifne            42
			return;
	//   19   41:return          
		Object obj1 = ((Object) (((afn) (weakreference)).getView()));
	//   20   42:aload_1         
	//   21   43:invokeinterface #201 <Method View afn.getView()>
	//   22   48:astore          7
		int ai[] = new int[2];
	//   23   50:iconst_2        
	//   24   51:newarray        int[]
	//   25   53:astore          6
		((View) (obj1)).getLocationOnScreen(ai);
	//   26   55:aload           7
	//   27   57:aload           6
	//   28   59:invokevirtual   #210 <Method void View.getLocationOnScreen(int[])>
		com.google.android.gms.internal.ads.bwk.a();
	//   29   62:invokestatic    #215 <Method zv com.google.android.gms.internal.ads.bwk.a()>
	//   30   65:pop             
		obj1 = ((Object) (i));
	//   31   66:aload_0         
	//   32   67:getfield        #83  <Field DisplayMetrics i>
	//   33   70:astore          7
		flag1 = false;
	//   34   72:iconst_0        
	//   35   73:istore          5
		i1 = zv.b(((DisplayMetrics) (obj1)), ai[0]);
	//   36   75:aload           7
	//   37   77:aload           6
	//   38   79:iconst_0        
	//   39   80:iaload          
	//   40   81:invokestatic    #220 <Method int zv.b(DisplayMetrics, int)>
	//   41   84:istore_3        
		com.google.android.gms.internal.ads.bwk.a();
	//   42   85:invokestatic    #215 <Method zv com.google.android.gms.internal.ads.bwk.a()>
	//   43   88:pop             
		j1 = zv.b(i, ai[1]);
	//   44   89:aload_0         
	//   45   90:getfield        #83  <Field DisplayMetrics i>
	//   46   93:aload           6
	//   47   95:iconst_1        
	//   48   96:iaload          
	//   49   97:invokestatic    #220 <Method int zv.b(DisplayMetrics, int)>
	//   50  100:istore          4
		Object obj = a;
	//   51  102:aload_0         
	//   52  103:getfield        #38  <Field Object a>
	//   53  106:astore          6
		obj;
	//   54  108:aload           6
		JVM INSTR monitorenter ;
	//   55  110:monitorenter    
		if(k == i1 && l == j1)
			break MISSING_BLOCK_LABEL_175;
	//   56  111:aload_0         
	//   57  112:getfield        #40  <Field int k>
	//   58  115:iload_3         
	//   59  116:icmpne          128
	//   60  119:aload_0         
	//   61  120:getfield        #42  <Field int l>
	//   62  123:iload           4
	//   63  125:icmpeq          175
		k = i1;
	//   64  128:aload_0         
	//   65  129:iload_3         
	//   66  130:putfield        #40  <Field int k>
		l = j1;
	//   67  133:aload_0         
	//   68  134:iload           4
	//   69  136:putfield        #42  <Field int l>
		weakreference = ((WeakReference) (((afn) (weakreference)).w()));
	//   70  139:aload_1         
	//   71  140:invokeinterface #224 <Method agv afn.w()>
	//   72  145:astore_1        
		i1 = k;
	//   73  146:aload_0         
	//   74  147:getfield        #40  <Field int k>
	//   75  150:istore_3        
		j1 = l;
	//   76  151:aload_0         
	//   77  152:getfield        #42  <Field int l>
	//   78  155:istore          4
		if(!flag)
	//*  79  157:iload_2         
	//*  80  158:ifne            164
			flag1 = true;
	//   81  161:iconst_1        
	//   82  162:istore          5
		((agv) (weakreference)).a(i1, j1, flag1);
	//   83  164:aload_1         
	//   84  165:iload_3         
	//   85  166:iload           4
	//   86  168:iload           5
	//   87  170:invokeinterface #229 <Method void com.google.android.gms.internal.ads.agv.a(int, int, boolean)>
		obj;
	//   88  175:aload           6
		JVM INSTR monitorexit ;
	//   89  177:monitorexit     
		return;
	//   90  178:return          
		weakreference;
	//   91  179:astore_1        
		obj;
	//   92  180:aload           6
		JVM INSTR monitorexit ;
	//   93  182:monitorexit     
		throw weakreference;
	//   94  183:aload_1         
	//   95  184:athrow          
	//   96  185:return          
	}

	private final android.view.ViewTreeObserver.OnScrollChangedListener b(WeakReference weakreference)
	{
		if(h == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #232 <Field android.view.ViewTreeObserver$OnScrollChangedListener h>
	//*   2    4:ifnonnull       20
			h = ((android.view.ViewTreeObserver.OnScrollChangedListener) (new po(this, weakreference)));
	//    3    7:aload_0         
	//    4    8:new             #234 <Class po>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #235 <Method void po(pf, WeakReference)>
	//    9   17:putfield        #232 <Field android.view.ViewTreeObserver$OnScrollChangedListener h>
		return h;
	//   10   20:aload_0         
	//   11   21:getfield        #232 <Field android.view.ViewTreeObserver$OnScrollChangedListener h>
	//   12   24:areturn         
	}

	final void a(abo abo1, afn afn1, boolean flag)
	{
		f.Q();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ac f>
	//    2    4:invokevirtual   #241 <Method void ac.Q()>
		abo1.b(((Object) (afn1)));
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #246 <Method void abo.b(Object)>
	//    6   12:return          
	}

	final void a(boolean flag, abo abo1, String s, String s1)
	{
		afn afn1;
		WeakReference weakreference;
		try
		{
			afn1 = a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #251 <Method afn a()>
	//    2    4:astore          5
		}
	//*   3    6:iload_1         
	//*   4    7:ifeq            23
	//*   5   10:aload           5
	//*   6   12:invokestatic    #253 <Method ahb ahb.c()>
	//*   7   15:invokeinterface #256 <Method void com.google.android.gms.internal.ads.afn.a(ahb)>
	//*   8   20:goto            33
	//*   9   23:aload           5
	//*  10   25:invokestatic    #258 <Method ahb ahb.b()>
	//*  11   28:invokeinterface #256 <Method void com.google.android.gms.internal.ads.afn.a(ahb)>
	//*  12   33:aload_0         
	//*  13   34:getfield        #52  <Field ac f>
	//*  14   37:aload           5
	//*  15   39:invokevirtual   #261 <Method void ac.a(afn)>
	//*  16   42:new             #193 <Class WeakReference>
	//*  17   45:dup             
	//*  18   46:aload           5
	//*  19   48:invokespecial   #263 <Method void WeakReference(Object)>
	//*  20   51:astore          6
	//*  21   53:aload           5
	//*  22   55:invokeinterface #224 <Method agv afn.w()>
	//*  23   60:aload_0         
	//*  24   61:aload           6
	//*  25   63:invokespecial   #265 <Method android.view.ViewTreeObserver$OnGlobalLayoutListener a(WeakReference)>
	//*  26   66:aload_0         
	//*  27   67:aload           6
	//*  28   69:invokespecial   #267 <Method android.view.ViewTreeObserver$OnScrollChangedListener b(WeakReference)>
	//*  29   72:invokeinterface #270 <Method void com.google.android.gms.internal.ads.agv.a(android.view.ViewTreeObserver$OnGlobalLayoutListener, android.view.ViewTreeObserver$OnScrollChangedListener)>
	//*  30   77:aload_0         
	//*  31   78:aload           5
	//*  32   80:iload_1         
	//*  33   81:invokespecial   #272 <Method void a(afn, boolean)>
	//*  34   84:aload           5
	//*  35   86:invokeinterface #224 <Method agv afn.w()>
	//*  36   91:new             #274 <Class pi>
	//*  37   94:dup             
	//*  38   95:aload_0         
	//*  39   96:aload_2         
	//*  40   97:aload           5
	//*  41   99:invokespecial   #277 <Method void pi(pf, abo, afn)>
	//*  42  102:invokeinterface #280 <Method void com.google.android.gms.internal.ads.agv.a(agw)>
	//*  43  107:aload           5
	//*  44  109:aload_3         
	//*  45  110:aload           4
	//*  46  112:aconst_null     
	//*  47  113:invokeinterface #283 <Method void com.google.android.gms.internal.ads.afn.a(String, String, String)>
	//*  48  118:return          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  49  119:astore_3        
		{
			wx.c("Exception occurred while getting video view", ((Throwable) (s)));
	//   50  120:ldc2            #285 <String "Exception occurred while getting video view">
	//   51  123:aload_3         
	//   52  124:invokestatic    #290 <Method void wx.c(String, Throwable)>
			abo1.b(((Object) (null)));
	//   53  127:aload_2         
	//   54  128:aconst_null     
	//   55  129:invokevirtual   #246 <Method void abo.b(Object)>
			return;
	//   56  132:return          
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_23;
		afn1.a(ahb.c());
		break MISSING_BLOCK_LABEL_33;
		afn1.a(ahb.b());
		f.a(afn1);
		weakreference = new WeakReference(((Object) (afn1)));
		afn1.w().a(a(weakreference), b(weakreference));
		a(afn1, flag);
		afn1.w().a(((agw) (new pi(this, abo1, afn1))));
		afn1.a(s, s1, ((String) (null)));
		return;
	}

	final void a(boolean flag, JSONObject jsonobject, abo abo1)
	{
		afn afn1;
		WeakReference weakreference;
		try
		{
			afn1 = a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #251 <Method afn a()>
	//    2    4:astore          4
		}
	//*   3    6:iload_1         
	//*   4    7:ifeq            23
	//*   5   10:aload           4
	//*   6   12:invokestatic    #253 <Method ahb ahb.c()>
	//*   7   15:invokeinterface #256 <Method void com.google.android.gms.internal.ads.afn.a(ahb)>
	//*   8   20:goto            33
	//*   9   23:aload           4
	//*  10   25:invokestatic    #258 <Method ahb ahb.b()>
	//*  11   28:invokeinterface #256 <Method void com.google.android.gms.internal.ads.afn.a(ahb)>
	//*  12   33:aload_0         
	//*  13   34:getfield        #52  <Field ac f>
	//*  14   37:aload           4
	//*  15   39:invokevirtual   #261 <Method void ac.a(afn)>
	//*  16   42:new             #193 <Class WeakReference>
	//*  17   45:dup             
	//*  18   46:aload           4
	//*  19   48:invokespecial   #263 <Method void WeakReference(Object)>
	//*  20   51:astore          5
	//*  21   53:aload           4
	//*  22   55:invokeinterface #224 <Method agv afn.w()>
	//*  23   60:aload_0         
	//*  24   61:aload           5
	//*  25   63:invokespecial   #265 <Method android.view.ViewTreeObserver$OnGlobalLayoutListener a(WeakReference)>
	//*  26   66:aload_0         
	//*  27   67:aload           5
	//*  28   69:invokespecial   #267 <Method android.view.ViewTreeObserver$OnScrollChangedListener b(WeakReference)>
	//*  29   72:invokeinterface #270 <Method void com.google.android.gms.internal.ads.agv.a(android.view.ViewTreeObserver$OnGlobalLayoutListener, android.view.ViewTreeObserver$OnScrollChangedListener)>
	//*  30   77:aload_0         
	//*  31   78:aload           4
	//*  32   80:iload_1         
	//*  33   81:invokespecial   #272 <Method void a(afn, boolean)>
	//*  34   84:aload           4
	//*  35   86:invokeinterface #224 <Method agv afn.w()>
	//*  36   91:new             #293 <Class pj>
	//*  37   94:dup             
	//*  38   95:aload           4
	//*  39   97:aload_2         
	//*  40   98:invokespecial   #296 <Method void pj(afn, JSONObject)>
	//*  41  101:invokeinterface #299 <Method void com.google.android.gms.internal.ads.agv.a(agx)>
	//*  42  106:aload           4
	//*  43  108:invokeinterface #224 <Method agv afn.w()>
	//*  44  113:new             #301 <Class pk>
	//*  45  116:dup             
	//*  46  117:aload_0         
	//*  47  118:aload_3         
	//*  48  119:aload           4
	//*  49  121:invokespecial   #302 <Method void pk(pf, abo, afn)>
	//*  50  124:invokeinterface #280 <Method void com.google.android.gms.internal.ads.agv.a(agw)>
	//*  51  129:getstatic       #308 <Field e p.by>
	//*  52  132:astore_2        
	//*  53  133:aload           4
	//*  54  135:invokestatic    #311 <Method m bwk.e()>
	//*  55  138:aload_2         
	//*  56  139:invokevirtual   #316 <Method Object com.google.android.gms.internal.ads.m.a(e)>
	//*  57  142:checkcast       #318 <Class String>
	//*  58  145:invokeinterface #322 <Method void afn.loadUrl(String)>
	//*  59  150:return          
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*  60  151:astore_2        
		{
			wx.c("Exception occurred while getting video view", ((Throwable) (jsonobject)));
	//   61  152:ldc2            #285 <String "Exception occurred while getting video view">
	//   62  155:aload_2         
	//   63  156:invokestatic    #290 <Method void wx.c(String, Throwable)>
			abo1.b(((Object) (null)));
	//   64  159:aload_3         
	//   65  160:aconst_null     
	//   66  161:invokevirtual   #246 <Method void abo.b(Object)>
			return;
	//   67  164:return          
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_23;
		afn1.a(ahb.c());
		break MISSING_BLOCK_LABEL_33;
		afn1.a(ahb.b());
		f.a(afn1);
		weakreference = new WeakReference(((Object) (afn1)));
		afn1.w().a(a(weakreference), b(weakreference));
		a(afn1, flag);
		afn1.w().a(((agx) (new pj(afn1, jsonobject))));
		afn1.w().a(((agw) (new pk(this, abo1, afn1))));
		jsonobject = ((JSONObject) (p.by));
		afn1.loadUrl((String)bwk.e().a(((e) (jsonobject))));
		return;
	}

	final void b(abo abo1, afn afn1, boolean flag)
	{
		f.Q();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ac f>
	//    2    4:invokevirtual   #241 <Method void ac.Q()>
		abo1.b(((Object) (afn1)));
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #246 <Method void abo.b(Object)>
	//    6   12:return          
	}

	private final Object a = new Object();
	private final Context b;
	private final bad c;
	private final we d;
	private final ad e;
	private final ac f;
	private android.view.ViewTreeObserver.OnGlobalLayoutListener g;
	private android.view.ViewTreeObserver.OnScrollChangedListener h;
	private final DisplayMetrics i;
	private zk j;
	private int k;
	private int l;
}
