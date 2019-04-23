// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.o;
import com.google.android.gms.c.a;
import com.google.android.gms.c.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			kz, au, cf, byg, 
//			ca

public final class lm extends kz
{

	public lm(h h1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void kz()>
		a = h1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field h a>
	//    5    9:return          
	}

	public final String a()
	{
		return a.i();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field h a>
	//    2    4:invokevirtual   #21  <Method String h.i()>
	//    3    7:areturn         
	}

	public final void a(a a1)
	{
		((g) (a)).c((View)com.google.android.gms.c.d.a(a1));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field h a>
	//    2    4:aload_1         
	//    3    5:invokestatic    #27  <Method Object d.a(a)>
	//    4    8:checkcast       #29  <Class View>
	//    5   11:invokevirtual   #35  <Method void g.c(View)>
	//    6   14:return          
	}

	public final void a(a a1, a a2, a a3)
	{
		a2 = ((a) ((HashMap)com.google.android.gms.c.d.a(a2)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #27  <Method Object d.a(a)>
	//    2    4:checkcast       #38  <Class HashMap>
	//    3    7:astore_2        
		a3 = ((a) ((HashMap)com.google.android.gms.c.d.a(a3)));
	//    4    8:aload_3         
	//    5    9:invokestatic    #27  <Method Object d.a(a)>
	//    6   12:checkcast       #38  <Class HashMap>
	//    7   15:astore_3        
		((g) (a)).a((View)com.google.android.gms.c.d.a(a1), ((java.util.Map) (a2)), ((java.util.Map) (a3)));
	//    8   16:aload_0         
	//    9   17:getfield        #14  <Field h a>
	//   10   20:aload_1         
	//   11   21:invokestatic    #27  <Method Object d.a(a)>
	//   12   24:checkcast       #29  <Class View>
	//   13   27:aload_2         
	//   14   28:aload_3         
	//   15   29:invokevirtual   #41  <Method void g.a(View, java.util.Map, java.util.Map)>
	//   16   32:return          
	}

	public final List b()
	{
		Object obj = ((Object) (a.j()));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field h a>
	//    2    4:invokevirtual   #46  <Method List h.j()>
	//    3    7:astore_2        
		if(obj != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          77
		{
			ArrayList arraylist = new ArrayList();
	//    6   12:new             #48  <Class ArrayList>
	//    7   15:dup             
	//    8   16:invokespecial   #49  <Method void ArrayList()>
	//    9   19:astore_1        
			com.google.android.gms.ads.formats.d d1;
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((List) (arraylist)).add(((Object) (new au(d1.a(), d1.b(), d1.c())))))
	//*  10   20:aload_2         
	//*  11   21:invokeinterface #55  <Method Iterator List.iterator()>
	//*  12   26:astore_2        
	//*  13   27:aload_2         
	//*  14   28:invokeinterface #61  <Method boolean Iterator.hasNext()>
	//*  15   33:ifeq            75
				d1 = (com.google.android.gms.ads.formats.d)((Iterator) (obj)).next();
	//   16   36:aload_2         
	//   17   37:invokeinterface #65  <Method Object Iterator.next()>
	//   18   42:checkcast       #67  <Class com.google.android.gms.ads.formats.d>
	//   19   45:astore_3        

	//   20   46:aload_1         
	//   21   47:new             #69  <Class au>
	//   22   50:dup             
	//   23   51:aload_3         
	//   24   52:invokevirtual   #72  <Method android.graphics.drawable.Drawable com.google.android.gms.ads.formats.d.a()>
	//   25   55:aload_3         
	//   26   56:invokevirtual   #75  <Method android.net.Uri com.google.android.gms.ads.formats.d.b()>
	//   27   59:aload_3         
	//   28   60:invokevirtual   #78  <Method double com.google.android.gms.ads.formats.d.c()>
	//   29   63:invokespecial   #81  <Method void au(android.graphics.drawable.Drawable, android.net.Uri, double)>
	//   30   66:invokeinterface #85  <Method boolean List.add(Object)>
	//   31   71:pop             
	//*  32   72:goto            27
			return ((List) (arraylist));
	//   33   75:aload_1         
	//   34   76:areturn         
		} else
		{
			return null;
	//   35   77:aconst_null     
	//   36   78:areturn         
		}
	}

	public final void b(a a1)
	{
		((g) (a)).a((View)com.google.android.gms.c.d.a(a1));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field h a>
	//    2    4:aload_1         
	//    3    5:invokestatic    #27  <Method Object d.a(a)>
	//    4    8:checkcast       #29  <Class View>
	//    5   11:invokevirtual   #87  <Method void g.a(View)>
	//    6   14:return          
	}

	public final String c()
	{
		return a.k();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field h a>
	//    2    4:invokevirtual   #90  <Method String h.k()>
	//    3    7:areturn         
	}

	public final void c(a a1)
	{
		((g) (a)).b((View)com.google.android.gms.c.d.a(a1));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field h a>
	//    2    4:aload_1         
	//    3    5:invokestatic    #27  <Method Object d.a(a)>
	//    4    8:checkcast       #29  <Class View>
	//    5   11:invokevirtual   #92  <Method void g.b(View)>
	//    6   14:return          
	}

	public final cf d()
	{
		com.google.android.gms.ads.formats.d d1 = a.l();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field h a>
	//    2    4:invokevirtual   #98  <Method com.google.android.gms.ads.formats.d h.l()>
	//    3    7:astore_1        
		if(d1 != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          32
			return ((cf) (new au(d1.a(), d1.b(), d1.c())));
	//    6   12:new             #69  <Class au>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokevirtual   #72  <Method android.graphics.drawable.Drawable com.google.android.gms.ads.formats.d.a()>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #75  <Method android.net.Uri com.google.android.gms.ads.formats.d.b()>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #78  <Method double com.google.android.gms.ads.formats.d.c()>
	//   14   28:invokespecial   #81  <Method void au(android.graphics.drawable.Drawable, android.net.Uri, double)>
	//   15   31:areturn         
		else
			return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
	}

	public final String e()
	{
		return a.m();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field h a>
	//    2    4:invokevirtual   #102 <Method String h.m()>
	//    3    7:areturn         
	}

	public final double f()
	{
		return a.n();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field h a>
	//    2    4:invokevirtual   #106 <Method double h.n()>
	//    3    7:dreturn         
	}

	public final String g()
	{
		return a.o();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field h a>
	//    2    4:invokevirtual   #110 <Method String h.o()>
	//    3    7:areturn         
	}

	public final String h()
	{
		return a.p();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field h a>
	//    2    4:invokevirtual   #114 <Method String h.p()>
	//    3    7:areturn         
	}

	public final void i()
	{
		((g) (a)).e();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field h a>
	//    2    4:invokevirtual   #116 <Method void g.e()>
	//    3    7:return          
	}

	public final boolean j()
	{
		return ((g) (a)).a();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field h a>
	//    2    4:invokevirtual   #118 <Method boolean g.a()>
	//    3    7:ireturn         
	}

	public final boolean k()
	{
		return ((g) (a)).b();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field h a>
	//    2    4:invokevirtual   #120 <Method boolean g.b()>
	//    3    7:ireturn         
	}

	public final Bundle l()
	{
		return ((g) (a)).c();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field h a>
	//    2    4:invokevirtual   #123 <Method Bundle g.c()>
	//    3    7:areturn         
	}

	public final byg m()
	{
		if(((g) (a)).g() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field h a>
	//*   2    4:invokevirtual   #127 <Method o g.g()>
	//*   3    7:ifnull          21
			return ((g) (a)).g().a();
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field h a>
	//    6   14:invokevirtual   #127 <Method o g.g()>
	//    7   17:invokevirtual   #131 <Method byg o.a()>
	//    8   20:areturn         
		else
			return null;
	//    9   21:aconst_null     
	//   10   22:areturn         
	}

	public final a n()
	{
		View view = ((g) (a)).d();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field h a>
	//    2    4:invokevirtual   #135 <Method View g.d()>
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
	//    9   15:invokestatic    #138 <Method a d.a(Object)>
	//   10   18:areturn         
	}

	public final ca o()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final a p()
	{
		View view = ((g) (a)).f();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field h a>
	//    2    4:invokevirtual   #141 <Method View g.f()>
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
	//    9   15:invokestatic    #138 <Method a d.a(Object)>
	//   10   18:areturn         
	}

	public final a q()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	private final h a;
}
