// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.view.View;
import android.webkit.*;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.b.b;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.ads.internal.bs;
import com.google.android.gms.ads.internal.gmsg.ag;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.c.a;
import com.google.android.gms.common.util.p;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			afn, acu, wi, nk, 
//			xg, afz, p, bwk, 
//			m, bf, aeq, agd, 
//			ahb, bpx, aa, ab, 
//			zzbbi, agv, bad

public final class afy extends FrameLayout
	implements afn
{

	public afy(afn afn1)
	{
		super(afn1.getContext());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #17  <Method Context afn.getContext()>
	//    3    7:invokespecial   #20  <Method void FrameLayout(Context)>
		a = afn1;
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:putfield        #22  <Field afn a>
		b = new acu(afn1.r(), ((android.view.ViewGroup) (this)), ((afn) (this)));
	//    7   15:aload_0         
	//    8   16:new             #24  <Class acu>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokeinterface #27  <Method Context afn.r()>
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:invokespecial   #30  <Method void acu(Context, android.view.ViewGroup, afn)>
	//   15   31:putfield        #32  <Field acu b>
		addView(a.getView());
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:getfield        #22  <Field afn a>
	//   19   39:invokeinterface #36  <Method View afn.getView()>
	//   20   44:invokevirtual   #40  <Method void addView(View)>
	//   21   47:return          
	}

	static afn a(afy afy1)
	{
		return afy1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:areturn         
	}

	public final a A()
	{
		return a.A();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #46  <Method a afn.A()>
	//    3    9:areturn         
	}

	public final boolean B()
	{
		return a.B();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #50  <Method boolean afn.B()>
	//    3    9:ireturn         
	}

	public final boolean C()
	{
		return a.C();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #53  <Method boolean afn.C()>
	//    3    9:ireturn         
	}

	public final void D()
	{
		b.c();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field acu b>
	//    2    4:invokevirtual   #58  <Method void com.google.android.gms.internal.ads.acu.c()>
		a.D();
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field afn a>
	//    5   11:invokeinterface #60  <Method void afn.D()>
	//    6   16:return          
	}

	public final boolean E()
	{
		return a.E();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #63  <Method boolean afn.E()>
	//    3    9:ireturn         
	}

	public final boolean F()
	{
		return a.F();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #66  <Method boolean afn.F()>
	//    3    9:ireturn         
	}

	public final boolean G()
	{
		return a.G();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #69  <Method boolean afn.G()>
	//    3    9:ireturn         
	}

	public final void H()
	{
		a.H();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #72  <Method void afn.H()>
	//    3    9:return          
	}

	public final void I()
	{
		a.I();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #75  <Method void afn.I()>
	//    3    9:return          
	}

	public final bf J()
	{
		return a.J();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #79  <Method bf afn.J()>
	//    3    9:areturn         
	}

	public final void K()
	{
		setBackgroundColor(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #84  <Method void setBackgroundColor(int)>
		a.setBackgroundColor(0);
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field afn a>
	//    5    9:iconst_0        
	//    6   10:invokeinterface #85  <Method void afn.setBackgroundColor(int)>
	//    7   15:return          
	}

	public final void L()
	{
		TextView textview = new TextView(getContext());
	//    0    0:new             #88  <Class TextView>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #89  <Method Context getContext()>
	//    4    8:invokespecial   #90  <Method void TextView(Context)>
	//    5   11:astore_2        
		Object obj = ((Object) (aw.i().g()));
	//    6   12:invokestatic    #96  <Method wi aw.i()>
	//    7   15:invokevirtual   #102 <Method Resources wi.g()>
	//    8   18:astore_1        
		if(obj != null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          34
			obj = ((Object) (((Resources) (obj)).getString(b.s7)));
	//   11   23:aload_1         
	//   12   24:getstatic       #107 <Field int b.s7>
	//   13   27:invokevirtual   #113 <Method String Resources.getString(int)>
	//   14   30:astore_1        
		else
	//*  15   31:goto            37
			obj = "Test Ad";
	//   16   34:ldc1            #115 <String "Test Ad">
	//   17   36:astore_1        
		textview.setText(((CharSequence) (obj)));
	//   18   37:aload_2         
	//   19   38:aload_1         
	//   20   39:invokevirtual   #119 <Method void TextView.setText(CharSequence)>
		textview.setTextSize(15F);
	//   21   42:aload_2         
	//   22   43:ldc1            #120 <Float 15F>
	//   23   45:invokevirtual   #124 <Method void TextView.setTextSize(float)>
		textview.setTextColor(-1);
	//   24   48:aload_2         
	//   25   49:iconst_m1       
	//   26   50:invokevirtual   #127 <Method void TextView.setTextColor(int)>
		textview.setPadding(5, 0, 5, 0);
	//   27   53:aload_2         
	//   28   54:iconst_5        
	//   29   55:iconst_0        
	//   30   56:iconst_5        
	//   31   57:iconst_0        
	//   32   58:invokevirtual   #131 <Method void TextView.setPadding(int, int, int, int)>
		obj = ((Object) (new GradientDrawable()));
	//   33   61:new             #133 <Class GradientDrawable>
	//   34   64:dup             
	//   35   65:invokespecial   #135 <Method void GradientDrawable()>
	//   36   68:astore_1        
		((GradientDrawable) (obj)).setShape(0);
	//   37   69:aload_1         
	//   38   70:iconst_0        
	//   39   71:invokevirtual   #138 <Method void GradientDrawable.setShape(int)>
		((GradientDrawable) (obj)).setColor(0xff444444);
	//   40   74:aload_1         
	//   41   75:ldc1            #139 <Int 0xff444444>
	//   42   77:invokevirtual   #142 <Method void GradientDrawable.setColor(int)>
		((GradientDrawable) (obj)).setCornerRadius(8F);
	//   43   80:aload_1         
	//   44   81:ldc1            #143 <Float 8F>
	//   45   83:invokevirtual   #146 <Method void GradientDrawable.setCornerRadius(float)>
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  46   86:getstatic       #151 <Field int android.os.Build$VERSION.SDK_INT>
	//*  47   89:bipush          16
	//*  48   91:icmplt          102
			textview.setBackground(((android.graphics.drawable.Drawable) (obj)));
	//   49   94:aload_2         
	//   50   95:aload_1         
	//   51   96:invokevirtual   #155 <Method void TextView.setBackground(android.graphics.drawable.Drawable)>
		else
	//*  52   99:goto            107
			textview.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
	//   53  102:aload_2         
	//   54  103:aload_1         
	//   55  104:invokevirtual   #158 <Method void TextView.setBackgroundDrawable(android.graphics.drawable.Drawable)>
		addView(((View) (textview)), ((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-2, -2, 49))));
	//   56  107:aload_0         
	//   57  108:aload_2         
	//   58  109:new             #160 <Class android.widget.FrameLayout$LayoutParams>
	//   59  112:dup             
	//   60  113:bipush          -2
	//   61  115:bipush          -2
	//   62  117:bipush          49
	//   63  119:invokespecial   #163 <Method void android.widget.FrameLayout$LayoutParams(int, int, int)>
	//   64  122:invokevirtual   #166 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
		bringChildToFront(((View) (textview)));
	//   65  125:aload_0         
	//   66  126:aload_2         
	//   67  127:invokevirtual   #169 <Method void bringChildToFront(View)>
	//   68  130:return          
	}

	public final acu a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field acu b>
	//    2    4:areturn         
	}

	public final aeq a(String s1)
	{
		return a.a(s1);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #173 <Method aeq com.google.android.gms.internal.ads.afn.a(String)>
	//    4   10:areturn         
	}

	public final void a(int i)
	{
		a.a(i);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #175 <Method void com.google.android.gms.internal.ads.afn.a(int)>
	//    4   10:return          
	}

	public final void a(Context context)
	{
		a.a(context);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #177 <Method void com.google.android.gms.internal.ads.afn.a(Context)>
	//    4   10:return          
	}

	public final void a(c c1)
	{
		a.a(c1);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #180 <Method void com.google.android.gms.internal.ads.afn.a(c)>
	//    4   10:return          
	}

	public final void a(zzc zzc)
	{
		a.a(zzc);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #183 <Method void com.google.android.gms.internal.ads.afn.a(zzc)>
	//    4   10:return          
	}

	public final void a(a a1)
	{
		a.a(a1);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #186 <Method void com.google.android.gms.internal.ads.afn.a(a)>
	//    4   10:return          
	}

	public final void a(agd agd)
	{
		a.a(agd);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #189 <Method void com.google.android.gms.internal.ads.afn.a(agd)>
	//    4   10:return          
	}

	public final void a(ahb ahb)
	{
		a.a(ahb);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #192 <Method void com.google.android.gms.internal.ads.afn.a(ahb)>
	//    4   10:return          
	}

	public final void a(bf bf)
	{
		a.a(bf);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #195 <Method void com.google.android.gms.internal.ads.afn.a(bf)>
	//    4   10:return          
	}

	public final void a(bpx bpx)
	{
		a.a(bpx);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #198 <Method void com.google.android.gms.internal.ads.afn.a(bpx)>
	//    4   10:return          
	}

	public final void a(String s1, ag ag)
	{
		a.a(s1, ag);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #201 <Method void com.google.android.gms.internal.ads.afn.a(String, ag)>
	//    5   11:return          
	}

	public final void a(String s1, p p1)
	{
		a.a(s1, p1);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #204 <Method void com.google.android.gms.internal.ads.afn.a(String, p)>
	//    5   11:return          
	}

	public final void a(String s1, aeq aeq)
	{
		a.a(s1, aeq);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #207 <Method void com.google.android.gms.internal.ads.afn.a(String, aeq)>
	//    5   11:return          
	}

	public final void a(String s1, String s2, String s3)
	{
		a.a(s1, s2, s3);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokeinterface #210 <Method void com.google.android.gms.internal.ads.afn.a(String, String, String)>
	//    6   12:return          
	}

	public final void a(String s1, Map map)
	{
		a.a(s1, map);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #213 <Method void com.google.android.gms.internal.ads.afn.a(String, Map)>
	//    5   11:return          
	}

	public final void a(String s1, JSONObject jsonobject)
	{
		a.a(s1, jsonobject);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #216 <Method void com.google.android.gms.internal.ads.afn.a(String, JSONObject)>
	//    5   11:return          
	}

	public final void a(boolean flag)
	{
		a.a(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #219 <Method void com.google.android.gms.internal.ads.afn.a(boolean)>
	//    4   10:return          
	}

	public final void a(boolean flag, int i)
	{
		a.a(flag, i);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #222 <Method void com.google.android.gms.internal.ads.afn.a(boolean, int)>
	//    5   11:return          
	}

	public final void a(boolean flag, int i, String s1)
	{
		a.a(flag, i, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokeinterface #225 <Method void com.google.android.gms.internal.ads.afn.a(boolean, int, String)>
	//    6   12:return          
	}

	public final void a(boolean flag, int i, String s1, String s2)
	{
		a.a(flag, i, s1, s2);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokeinterface #228 <Method void com.google.android.gms.internal.ads.afn.a(boolean, int, String, String)>
	//    7   14:return          
	}

	public final void a(boolean flag, long l1)
	{
		a.a(flag, l1);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:iload_1         
	//    3    5:lload_2         
	//    4    6:invokeinterface #231 <Method void com.google.android.gms.internal.ads.afn.a(boolean, long)>
	//    5   11:return          
	}

	public final agd b()
	{
		return a.b();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #234 <Method agd com.google.android.gms.internal.ads.afn.b()>
	//    3    9:areturn         
	}

	public final void b(c c1)
	{
		a.b(c1);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #236 <Method void com.google.android.gms.internal.ads.afn.b(c)>
	//    4   10:return          
	}

	public final void b(String s1)
	{
		a.b(s1);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #239 <Method void com.google.android.gms.internal.ads.afn.b(String)>
	//    4   10:return          
	}

	public final void b(String s1, ag ag)
	{
		a.b(s1, ag);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #241 <Method void com.google.android.gms.internal.ads.afn.b(String, ag)>
	//    5   11:return          
	}

	public final void b(String s1, JSONObject jsonobject)
	{
		a.b(s1, jsonobject);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #243 <Method void com.google.android.gms.internal.ads.afn.b(String, JSONObject)>
	//    5   11:return          
	}

	public final void b(boolean flag)
	{
		a.b(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #245 <Method void com.google.android.gms.internal.ads.afn.b(boolean)>
	//    4   10:return          
	}

	public final aa c()
	{
		return a.c();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #248 <Method aa com.google.android.gms.internal.ads.afn.c()>
	//    3    9:areturn         
	}

	public final void c(boolean flag)
	{
		a.c(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #250 <Method void com.google.android.gms.internal.ads.afn.c(boolean)>
	//    4   10:return          
	}

	public final Activity d()
	{
		return a.d();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #254 <Method Activity afn.d()>
	//    3    9:areturn         
	}

	public final void d(String s1)
	{
		a.d(s1);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #256 <Method void afn.d(String)>
	//    4   10:return          
	}

	public final void d(boolean flag)
	{
		a.d(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #258 <Method void afn.d(boolean)>
	//    4   10:return          
	}

	public final void destroy()
	{
		Object obj = ((Object) (A()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #260 <Method a A()>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          54
		{
			aw.v().b(((a) (obj)));
	//    5    9:invokestatic    #264 <Method nk aw.v()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #268 <Method void com.google.android.gms.internal.ads.nk.b(a)>
			obj = ((Object) (com.google.android.gms.internal.ads.xg.a));
	//    8   16:getstatic       #273 <Field Handler com.google.android.gms.internal.ads.xg.a>
	//    9   19:astore_1        
			afz afz1 = new afz(this);
	//   10   20:new             #275 <Class afz>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokespecial   #278 <Method void afz(afy)>
	//   14   28:astore_2        
			e e1 = p.cD;
	//   15   29:getstatic       #284 <Field e p.cD>
	//   16   32:astore_3        
			((Handler) (obj)).postDelayed(((Runnable) (afz1)), ((Integer)bwk.e().a(e1)).intValue());
	//   17   33:aload_1         
	//   18   34:aload_2         
	//   19   35:invokestatic    #290 <Method m bwk.e()>
	//   20   38:aload_3         
	//   21   39:invokevirtual   #295 <Method Object com.google.android.gms.internal.ads.m.a(e)>
	//   22   42:checkcast       #297 <Class Integer>
	//   23   45:invokevirtual   #301 <Method int Integer.intValue()>
	//   24   48:i2l             
	//   25   49:invokevirtual   #307 <Method boolean Handler.postDelayed(Runnable, long)>
	//   26   52:pop             
			return;
	//   27   53:return          
		} else
		{
			a.destroy();
	//   28   54:aload_0         
	//   29   55:getfield        #22  <Field afn a>
	//   30   58:invokeinterface #309 <Method void afn.destroy()>
			return;
	//   31   63:return          
		}
	}

	public final bs e()
	{
		return a.e();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #312 <Method bs afn.e()>
	//    3    9:areturn         
	}

	public final void e(boolean flag)
	{
		a.e(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #314 <Method void afn.e(boolean)>
	//    4   10:return          
	}

	public final void f()
	{
		a.f();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #317 <Method void afn.f()>
	//    3    9:return          
	}

	public final void f(boolean flag)
	{
		a.f(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #319 <Method void afn.f(boolean)>
	//    4   10:return          
	}

	public final String g()
	{
		return a.g();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #322 <Method String afn.g()>
	//    3    9:areturn         
	}

	public final android.view.View.OnClickListener getOnClickListener()
	{
		return a.getOnClickListener();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #326 <Method android.view.View$OnClickListener afn.getOnClickListener()>
	//    3    9:areturn         
	}

	public final int getRequestedOrientation()
	{
		return a.getRequestedOrientation();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #329 <Method int afn.getRequestedOrientation()>
	//    3    9:ireturn         
	}

	public final View getView()
	{
		return ((View) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public final WebView getWebView()
	{
		return a.getWebView();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #333 <Method WebView afn.getWebView()>
	//    3    9:areturn         
	}

	public final void h_()
	{
		a.h_();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #336 <Method void afn.h_()>
	//    3    9:return          
	}

	public final void i_()
	{
		a.i_();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #339 <Method void afn.i_()>
	//    3    9:return          
	}

	public final ab j()
	{
		return a.j();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #343 <Method ab afn.j()>
	//    3    9:areturn         
	}

	public final zzbbi k()
	{
		return a.k();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #347 <Method zzbbi afn.k()>
	//    3    9:areturn         
	}

	public final int l()
	{
		return getMeasuredHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #351 <Method int getMeasuredHeight()>
	//    2    4:ireturn         
	}

	public final void loadData(String s1, String s2, String s3)
	{
		a.loadData(s1, s2, s3);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokeinterface #354 <Method void afn.loadData(String, String, String)>
	//    6   12:return          
	}

	public final void loadDataWithBaseURL(String s1, String s2, String s3, String s4, String s5)
	{
		a.loadDataWithBaseURL(s1, s2, s3, s4, s5);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:invokeinterface #358 <Method void afn.loadDataWithBaseURL(String, String, String, String, String)>
	//    8   16:return          
	}

	public final void loadUrl(String s1)
	{
		a.loadUrl(s1);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #361 <Method void afn.loadUrl(String)>
	//    4   10:return          
	}

	public final int m()
	{
		return getMeasuredWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #365 <Method int getMeasuredWidth()>
	//    2    4:ireturn         
	}

	public final void n()
	{
		a.n();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #368 <Method void afn.n()>
	//    3    9:return          
	}

	public final void o()
	{
		a.o();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #371 <Method void afn.o()>
	//    3    9:return          
	}

	public final void onPause()
	{
		b.b();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field acu b>
	//    2    4:invokevirtual   #374 <Method void com.google.android.gms.internal.ads.acu.b()>
		a.onPause();
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field afn a>
	//    5   11:invokeinterface #376 <Method void afn.onPause()>
	//    6   16:return          
	}

	public final void onResume()
	{
		a.onResume();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #379 <Method void afn.onResume()>
	//    3    9:return          
	}

	public final void p()
	{
		a.p();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #382 <Method void com.google.android.gms.internal.ads.afn.p()>
	//    3    9:return          
	}

	public final void q()
	{
		a.q();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #385 <Method void afn.q()>
	//    3    9:return          
	}

	public final Context r()
	{
		return a.r();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #27  <Method Context afn.r()>
	//    3    9:areturn         
	}

	public final c s()
	{
		return a.s();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #389 <Method c afn.s()>
	//    3    9:areturn         
	}

	public final void setOnClickListener(android.view.View.OnClickListener onclicklistener)
	{
		a.setOnClickListener(onclicklistener);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #393 <Method void afn.setOnClickListener(android.view.View$OnClickListener)>
	//    4   10:return          
	}

	public final void setOnTouchListener(android.view.View.OnTouchListener ontouchlistener)
	{
		a.setOnTouchListener(ontouchlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #397 <Method void afn.setOnTouchListener(android.view.View$OnTouchListener)>
	//    4   10:return          
	}

	public final void setRequestedOrientation(int i)
	{
		a.setRequestedOrientation(i);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #400 <Method void afn.setRequestedOrientation(int)>
	//    4   10:return          
	}

	public final void setWebChromeClient(WebChromeClient webchromeclient)
	{
		a.setWebChromeClient(webchromeclient);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #404 <Method void afn.setWebChromeClient(WebChromeClient)>
	//    4   10:return          
	}

	public final void setWebViewClient(WebViewClient webviewclient)
	{
		a.setWebViewClient(webviewclient);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #408 <Method void afn.setWebViewClient(WebViewClient)>
	//    4   10:return          
	}

	public final void stopLoading()
	{
		a.stopLoading();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #411 <Method void afn.stopLoading()>
	//    3    9:return          
	}

	public final c t()
	{
		return a.t();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #414 <Method c afn.t()>
	//    3    9:areturn         
	}

	public final ahb u()
	{
		return a.u();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #418 <Method ahb afn.u()>
	//    3    9:areturn         
	}

	public final String v()
	{
		return a.v();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #420 <Method String afn.v()>
	//    3    9:areturn         
	}

	public final agv w()
	{
		return a.w();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #424 <Method agv afn.w()>
	//    3    9:areturn         
	}

	public final WebViewClient x()
	{
		return a.x();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #428 <Method WebViewClient afn.x()>
	//    3    9:areturn         
	}

	public final boolean y()
	{
		return a.y();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #431 <Method boolean afn.y()>
	//    3    9:ireturn         
	}

	public final bad z()
	{
		return a.z();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field afn a>
	//    2    4:invokeinterface #435 <Method bad afn.z()>
	//    3    9:areturn         
	}

	private final afn a;
	private final acu b;
}
