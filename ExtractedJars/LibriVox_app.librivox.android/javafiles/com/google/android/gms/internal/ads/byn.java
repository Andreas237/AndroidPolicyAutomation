// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.c.a;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			byo, bwk, zv, aik

public final class byn
{

	public byn(byo byo1)
	{
		this(byo1, ((a) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #39  <Method void byn(byo, a)>
	//    4    6:return          
	}

	public byn(byo byo1, a a1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		a = com.google.android.gms.internal.ads.byo.a(byo1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #48  <Method Date com.google.android.gms.internal.ads.byo.a(byo)>
	//    5    9:putfield        #50  <Field Date a>
		b = byo.b(byo1);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #53  <Method String byo.b(byo)>
	//    9   17:putfield        #55  <Field String b>
		c = byo.c(byo1);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #58  <Method int byo.c(byo)>
	//   13   25:putfield        #60  <Field int c>
		d = Collections.unmodifiableSet(((Set) (byo.d(byo1))));
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #63  <Method java.util.HashSet byo.d(byo)>
	//   17   33:invokestatic    #69  <Method Set Collections.unmodifiableSet(Set)>
	//   18   36:putfield        #71  <Field Set d>
		e = byo.e(byo1);
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:invokestatic    #74  <Method Location byo.e(byo)>
	//   22   44:putfield        #76  <Field Location e>
		f = byo.f(byo1);
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:invokestatic    #79  <Method boolean byo.f(byo)>
	//   26   52:putfield        #81  <Field boolean f>
		g = byo.g(byo1);
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:invokestatic    #84  <Method Bundle byo.g(byo)>
	//   30   60:putfield        #86  <Field Bundle g>
		h = Collections.unmodifiableMap(((Map) (byo.h(byo1))));
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:invokestatic    #89  <Method java.util.HashMap byo.h(byo)>
	//   34   68:invokestatic    #93  <Method Map Collections.unmodifiableMap(Map)>
	//   35   71:putfield        #95  <Field Map h>
		i = byo.i(byo1);
	//   36   74:aload_0         
	//   37   75:aload_1         
	//   38   76:invokestatic    #97  <Method String byo.i(byo)>
	//   39   79:putfield        #99  <Field String i>
		j = byo.j(byo1);
	//   40   82:aload_0         
	//   41   83:aload_1         
	//   42   84:invokestatic    #101 <Method String byo.j(byo)>
	//   43   87:putfield        #103 <Field String j>
		k = a1;
	//   44   90:aload_0         
	//   45   91:aload_2         
	//   46   92:putfield        #105 <Field a k>
		l = byo.k(byo1);
	//   47   95:aload_0         
	//   48   96:aload_1         
	//   49   97:invokestatic    #107 <Method int byo.k(byo)>
	//   50  100:putfield        #109 <Field int l>
		m = Collections.unmodifiableSet(((Set) (byo.l(byo1))));
	//   51  103:aload_0         
	//   52  104:aload_1         
	//   53  105:invokestatic    #111 <Method java.util.HashSet byo.l(byo)>
	//   54  108:invokestatic    #69  <Method Set Collections.unmodifiableSet(Set)>
	//   55  111:putfield        #113 <Field Set m>
		n = byo.m(byo1);
	//   56  114:aload_0         
	//   57  115:aload_1         
	//   58  116:invokestatic    #115 <Method Bundle byo.m(byo)>
	//   59  119:putfield        #117 <Field Bundle n>
		o = Collections.unmodifiableSet(((Set) (byo.n(byo1))));
	//   60  122:aload_0         
	//   61  123:aload_1         
	//   62  124:invokestatic    #119 <Method java.util.HashSet byo.n(byo)>
	//   63  127:invokestatic    #69  <Method Set Collections.unmodifiableSet(Set)>
	//   64  130:putfield        #121 <Field Set o>
		p = byo.o(byo1);
	//   65  133:aload_0         
	//   66  134:aload_1         
	//   67  135:invokestatic    #123 <Method boolean byo.o(byo)>
	//   68  138:putfield        #125 <Field boolean p>
		q = null;
	//   69  141:aload_0         
	//   70  142:aconst_null     
	//   71  143:putfield        #127 <Field aik q>
		r = byo.p(byo1);
	//   72  146:aload_0         
	//   73  147:aload_1         
	//   74  148:invokestatic    #129 <Method int byo.p(byo)>
	//   75  151:putfield        #131 <Field int r>
		s = byo.q(byo1);
	//   76  154:aload_0         
	//   77  155:aload_1         
	//   78  156:invokestatic    #133 <Method String byo.q(byo)>
	//   79  159:putfield        #135 <Field String s>
	//   80  162:return          
	}

	public final Bundle a(Class class1)
	{
		return g.getBundle(class1.getName());
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field Bundle g>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #142 <Method String Class.getName()>
	//    4    8:invokevirtual   #148 <Method Bundle Bundle.getBundle(String)>
	//    5   11:areturn         
	}

	public final Date a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Date a>
	//    2    4:areturn         
	}

	public final boolean a(Context context)
	{
		Set set = m;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Set m>
	//    2    4:astore_2        
		com.google.android.gms.internal.ads.bwk.a();
	//    3    5:invokestatic    #157 <Method zv com.google.android.gms.internal.ads.bwk.a()>
	//    4    8:pop             
		return set.contains(((Object) (com.google.android.gms.internal.ads.zv.a(context))));
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokestatic    #162 <Method String com.google.android.gms.internal.ads.zv.a(Context)>
	//    8   14:invokeinterface #168 <Method boolean Set.contains(Object)>
	//    9   19:ireturn         
	}

	public final String b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field String b>
	//    2    4:areturn         
	}

	public final int c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int c>
	//    2    4:ireturn         
	}

	public final Set d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field Set d>
	//    2    4:areturn         
	}

	public final Location e()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Location e>
	//    2    4:areturn         
	}

	public final boolean f()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field boolean f>
	//    2    4:ireturn         
	}

	public final String g()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field String i>
	//    2    4:areturn         
	}

	public final String h()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field String j>
	//    2    4:areturn         
	}

	public final a i()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field a k>
	//    2    4:areturn         
	}

	public final Map j()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field Map h>
	//    2    4:areturn         
	}

	public final Bundle k()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field Bundle g>
	//    2    4:areturn         
	}

	public final int l()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field int l>
	//    2    4:ireturn         
	}

	public final Bundle m()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field Bundle n>
	//    2    4:areturn         
	}

	public final Set n()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field Set o>
	//    2    4:areturn         
	}

	public final boolean o()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field boolean p>
	//    2    4:ireturn         
	}

	public final int p()
	{
		return r;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field int r>
	//    2    4:ireturn         
	}

	public final String q()
	{
		return s;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field String s>
	//    2    4:areturn         
	}

	private final Date a;
	private final String b;
	private final int c;
	private final Set d;
	private final Location e;
	private final boolean f;
	private final Bundle g;
	private final Map h;
	private final String i;
	private final String j;
	private final a k;
	private final int l;
	private final Set m;
	private final Bundle n;
	private final Set o;
	private final boolean p;
	private final aik q;
	private final int r;
	private final String s;
}
