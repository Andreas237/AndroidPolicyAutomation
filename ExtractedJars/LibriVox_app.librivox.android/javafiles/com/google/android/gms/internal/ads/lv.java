// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.m;
import com.google.android.gms.ads.o;
import com.google.android.gms.c.a;
import com.google.android.gms.c.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			lf, au, cf, byg, 
//			ca

public final class lv extends lf
{

	public lv(m m1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void lf()>
		a = m1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field m a>
	//    5    9:return          
	}

	public final String a()
	{
		return a.a();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field m a>
	//    2    4:invokevirtual   #20  <Method String m.a()>
	//    3    7:areturn         
	}

	public final void a(a a1)
	{
		a.a((View)com.google.android.gms.c.d.a(a1));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field m a>
	//    2    4:aload_1         
	//    3    5:invokestatic    #26  <Method Object d.a(a)>
	//    4    8:checkcast       #28  <Class View>
	//    5   11:invokevirtual   #31  <Method void m.a(View)>
	//    6   14:return          
	}

	public final void a(a a1, a a2, a a3)
	{
		a2 = ((a) ((HashMap)com.google.android.gms.c.d.a(a2)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #26  <Method Object d.a(a)>
	//    2    4:checkcast       #34  <Class HashMap>
	//    3    7:astore_2        
		a3 = ((a) ((HashMap)com.google.android.gms.c.d.a(a3)));
	//    4    8:aload_3         
	//    5    9:invokestatic    #26  <Method Object d.a(a)>
	//    6   12:checkcast       #34  <Class HashMap>
	//    7   15:astore_3        
		a.a((View)com.google.android.gms.c.d.a(a1), ((java.util.Map) (a2)), ((java.util.Map) (a3)));
	//    8   16:aload_0         
	//    9   17:getfield        #14  <Field m a>
	//   10   20:aload_1         
	//   11   21:invokestatic    #26  <Method Object d.a(a)>
	//   12   24:checkcast       #28  <Class View>
	//   13   27:aload_2         
	//   14   28:aload_3         
	//   15   29:invokevirtual   #37  <Method void m.a(View, java.util.Map, java.util.Map)>
	//   16   32:return          
	}

	public final List b()
	{
		Object obj = ((Object) (a.b()));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field m a>
	//    2    4:invokevirtual   #41  <Method List m.b()>
	//    3    7:astore_2        
		ArrayList arraylist = new ArrayList();
	//    4    8:new             #43  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #44  <Method void ArrayList()>
	//    7   15:astore_1        
		if(obj != null)
	//*   8   16:aload_2         
	//*   9   17:ifnull          75
		{
			com.google.android.gms.ads.formats.d d1;
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((List) (arraylist)).add(((Object) (new au(d1.a(), d1.b(), d1.c())))))
	//*  10   20:aload_2         
	//*  11   21:invokeinterface #50  <Method Iterator List.iterator()>
	//*  12   26:astore_2        
	//*  13   27:aload_2         
	//*  14   28:invokeinterface #56  <Method boolean Iterator.hasNext()>
	//*  15   33:ifeq            75
				d1 = (com.google.android.gms.ads.formats.d)((Iterator) (obj)).next();
	//   16   36:aload_2         
	//   17   37:invokeinterface #60  <Method Object Iterator.next()>
	//   18   42:checkcast       #62  <Class com.google.android.gms.ads.formats.d>
	//   19   45:astore_3        

	//   20   46:aload_1         
	//   21   47:new             #64  <Class au>
	//   22   50:dup             
	//   23   51:aload_3         
	//   24   52:invokevirtual   #67  <Method android.graphics.drawable.Drawable com.google.android.gms.ads.formats.d.a()>
	//   25   55:aload_3         
	//   26   56:invokevirtual   #70  <Method android.net.Uri com.google.android.gms.ads.formats.d.b()>
	//   27   59:aload_3         
	//   28   60:invokevirtual   #74  <Method double com.google.android.gms.ads.formats.d.c()>
	//   29   63:invokespecial   #77  <Method void au(android.graphics.drawable.Drawable, android.net.Uri, double)>
	//   30   66:invokeinterface #81  <Method boolean List.add(Object)>
	//   31   71:pop             
		}
	//*  32   72:goto            27
		return ((List) (arraylist));
	//   33   75:aload_1         
	//   34   76:areturn         
	}

	public final void b(a a1)
	{
		a.b((View)com.google.android.gms.c.d.a(a1));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field m a>
	//    2    4:aload_1         
	//    3    5:invokestatic    #26  <Method Object d.a(a)>
	//    4    8:checkcast       #28  <Class View>
	//    5   11:invokevirtual   #83  <Method void m.b(View)>
	//    6   14:return          
	}

	public final String c()
	{
		return a.c();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field m a>
	//    2    4:invokevirtual   #85  <Method String m.c()>
	//    3    7:areturn         
	}

	public final cf d()
	{
		com.google.android.gms.ads.formats.d d1 = a.d();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field m a>
	//    2    4:invokevirtual   #90  <Method com.google.android.gms.ads.formats.d m.d()>
	//    3    7:astore_1        
		if(d1 != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          32
			return ((cf) (new au(d1.a(), d1.b(), d1.c())));
	//    6   12:new             #64  <Class au>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokevirtual   #67  <Method android.graphics.drawable.Drawable com.google.android.gms.ads.formats.d.a()>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #70  <Method android.net.Uri com.google.android.gms.ads.formats.d.b()>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #74  <Method double com.google.android.gms.ads.formats.d.c()>
	//   14   28:invokespecial   #77  <Method void au(android.graphics.drawable.Drawable, android.net.Uri, double)>
	//   15   31:areturn         
		else
			return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
	}

	public final String e()
	{
		return a.e();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field m a>
	//    2    4:invokevirtual   #93  <Method String m.e()>
	//    3    7:areturn         
	}

	public final String f()
	{
		return a.f();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field m a>
	//    2    4:invokevirtual   #96  <Method String m.f()>
	//    3    7:areturn         
	}

	public final double g()
	{
		if(a.g() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field m a>
	//*   2    4:invokevirtual   #100 <Method Double m.g()>
	//*   3    7:ifnull          21
			return a.g().doubleValue();
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field m a>
	//    6   14:invokevirtual   #100 <Method Double m.g()>
	//    7   17:invokevirtual   #105 <Method double Double.doubleValue()>
	//    8   20:dreturn         
		else
			return -1D;
	//    9   21:ldc2w           #106 <Double -1D>
	//   10   24:dreturn         
	}

	public final String h()
	{
		return a.h();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field m a>
	//    2    4:invokevirtual   #110 <Method String m.h()>
	//    3    7:areturn         
	}

	public final String i()
	{
		return a.i();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field m a>
	//    2    4:invokevirtual   #113 <Method String m.i()>
	//    3    7:areturn         
	}

	public final byg j()
	{
		if(a.j() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field m a>
	//*   2    4:invokevirtual   #118 <Method o m.j()>
	//*   3    7:ifnull          21
			return a.j().a();
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field m a>
	//    6   14:invokevirtual   #118 <Method o m.j()>
	//    7   17:invokevirtual   #122 <Method byg o.a()>
	//    8   20:areturn         
		else
			return null;
	//    9   21:aconst_null     
	//   10   22:areturn         
	}

	public final ca k()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final a l()
	{
		View view = a.l();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field m a>
	//    2    4:invokevirtual   #129 <Method View m.l()>
	//    3    7:astore_1        
		if(view == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		else
			return com.google.android.gms.c.d.a(((Object) (view)));
	//    8   14:aload_1         
	//    9   15:invokestatic    #132 <Method a d.a(Object)>
	//   10   18:areturn         
	}

	public final a m()
	{
		View view = a.m();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field m a>
	//    2    4:invokevirtual   #135 <Method View m.m()>
	//    3    7:astore_1        
		if(view == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		else
			return com.google.android.gms.c.d.a(((Object) (view)));
	//    8   14:aload_1         
	//    9   15:invokestatic    #132 <Method a d.a(Object)>
	//   10   18:areturn         
	}

	public final a n()
	{
		Object obj = a.n();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field m a>
	//    2    4:invokevirtual   #138 <Method Object m.n()>
	//    3    7:astore_1        
		if(obj == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		else
			return com.google.android.gms.c.d.a(obj);
	//    8   14:aload_1         
	//    9   15:invokestatic    #132 <Method a d.a(Object)>
	//   10   18:areturn         
	}

	public final Bundle o()
	{
		return a.o();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field m a>
	//    2    4:invokevirtual   #142 <Method Bundle m.o()>
	//    3    7:areturn         
	}

	public final boolean p()
	{
		return a.p();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field m a>
	//    2    4:invokevirtual   #145 <Method boolean m.p()>
	//    3    7:ireturn         
	}

	public final boolean q()
	{
		return a.q();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field m a>
	//    2    4:invokevirtual   #148 <Method boolean m.q()>
	//    3    7:ireturn         
	}

	public final void r()
	{
		a.r();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field m a>
	//    2    4:invokevirtual   #151 <Method void m.r()>
	//    3    7:return          
	}

	private final m a;
}
