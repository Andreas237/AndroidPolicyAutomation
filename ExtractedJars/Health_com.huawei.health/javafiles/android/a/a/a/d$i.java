// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.a.a.a;

import android.app.Notification;
import java.util.ArrayList;

// Referenced classes of package android.a.a.a:
//			d, p, g

static class d$i extends d$q
{

	public d$a[] a(ArrayList arraylist)
	{
		return (d$a[])(d$a[])android.a.a.a.g.c(arraylist, d$a.d, p.c);
	//    0    0:aload_1         
	//    1    1:getstatic       #20  <Field i$a$a d$a.d>
	//    2    4:getstatic       #26  <Field s$a$a p.c>
	//    3    7:invokestatic    #31  <Method i$a[] g.c(ArrayList, i$a$a, s$a$a)>
	//    4   10:checkcast       #33  <Class d$a[]>
	//    5   13:checkcast       #33  <Class d$a[]>
	//    6   16:areturn         
	}

	public Notification b(d$d d$d1, d$e d$e1)
	{
		g$a g$a1 = new g$a(d$d1.a, d$d1.B, d$d1.b, d$d1.c, d$d1.h, d$d1.f, d$d1.i, d$d1.d, d$d1.e, d$d1.g, d$d1.o, d$d1.p, d$d1.q, d$d1.k, d$d1.l, d$d1.j, d$d1.n, d$d1.v, d$d1.C, d$d1.x, d$d1.r, d$d1.s, d$d1.t);
	//    0    0:new             #39  <Class g$a>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:getfield        #44  <Field android.content.Context d$d.a>
	//    4    8:aload_1         
	//    5    9:getfield        #48  <Field Notification d$d.B>
	//    6   12:aload_1         
	//    7   13:getfield        #51  <Field CharSequence d$d.b>
	//    8   16:aload_1         
	//    9   17:getfield        #53  <Field CharSequence d$d.c>
	//   10   20:aload_1         
	//   11   21:getfield        #56  <Field CharSequence d$d.h>
	//   12   24:aload_1         
	//   13   25:getfield        #60  <Field android.widget.RemoteViews d$d.f>
	//   14   28:aload_1         
	//   15   29:getfield        #63  <Field int d$d.i>
	//   16   32:aload_1         
	//   17   33:getfield        #66  <Field android.app.PendingIntent d$d.d>
	//   18   36:aload_1         
	//   19   37:getfield        #69  <Field android.app.PendingIntent d$d.e>
	//   20   40:aload_1         
	//   21   41:getfield        #73  <Field android.graphics.Bitmap d$d.g>
	//   22   44:aload_1         
	//   23   45:getfield        #76  <Field int d$d.o>
	//   24   48:aload_1         
	//   25   49:getfield        #79  <Field int d$d.p>
	//   26   52:aload_1         
	//   27   53:getfield        #83  <Field boolean d$d.q>
	//   28   56:aload_1         
	//   29   57:getfield        #86  <Field boolean d$d.k>
	//   30   60:aload_1         
	//   31   61:getfield        #89  <Field boolean d$d.l>
	//   32   64:aload_1         
	//   33   65:getfield        #92  <Field int d$d.j>
	//   34   68:aload_1         
	//   35   69:getfield        #95  <Field CharSequence d$d.n>
	//   36   72:aload_1         
	//   37   73:getfield        #98  <Field boolean d$d.v>
	//   38   76:aload_1         
	//   39   77:getfield        #102 <Field ArrayList d$d.C>
	//   40   80:aload_1         
	//   41   81:getfield        #106 <Field android.os.Bundle d$d.x>
	//   42   84:aload_1         
	//   43   85:getfield        #110 <Field String d$d.r>
	//   44   88:aload_1         
	//   45   89:getfield        #113 <Field boolean d$d.s>
	//   46   92:aload_1         
	//   47   93:getfield        #116 <Field String d$d.t>
	//   48   96:invokespecial   #119 <Method void g$a(android.content.Context, Notification, CharSequence, CharSequence, CharSequence, android.widget.RemoteViews, int, android.app.PendingIntent, android.app.PendingIntent, android.graphics.Bitmap, int, int, boolean, boolean, boolean, int, CharSequence, boolean, ArrayList, android.os.Bundle, String, boolean, String)>
	//   49   99:astore_3        
		d.a(((o.c) (g$a1)), d$d1.u);
	//   50  100:aload_3         
	//   51  101:aload_1         
	//   52  102:getfield        #122 <Field ArrayList d$d.u>
	//   53  105:invokestatic    #125 <Method void d.a(o.c, ArrayList)>
		d.a(((c) (g$a1)), d$d1.m);
	//   54  108:aload_3         
	//   55  109:aload_1         
	//   56  110:getfield        #129 <Field d$r d$d.m>
	//   57  113:invokestatic    #132 <Method void d.a(c, d$r)>
		return d$e1.a(d$d1, ((c) (g$a1)));
	//   58  116:aload_2         
	//   59  117:aload_1         
	//   60  118:aload_3         
	//   61  119:invokevirtual   #137 <Method Notification d$e.a(d$d, c)>
	//   62  122:areturn         
	}

	public boolean b(Notification notification)
	{
		return android.a.a.a.g.e(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #140 <Method boolean g.e(Notification)>
	//    2    4:ireturn         
	}

	public d$a c(Notification notification, int j)
	{
		return (d$a)android.a.a.a.g.b(notification, j, d$a.d, p.c);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:getstatic       #20  <Field i$a$a d$a.d>
	//    3    5:getstatic       #26  <Field s$a$a p.c>
	//    4    8:invokestatic    #144 <Method i$a g.b(Notification, int, i$a$a, s$a$a)>
	//    5   11:checkcast       #16  <Class d$a>
	//    6   14:areturn         
	}

	public String e(Notification notification)
	{
		return android.a.a.a.g.d(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #147 <Method String g.d(Notification)>
	//    2    4:areturn         
	}

	public ArrayList e(d$a ad$a[])
	{
		return android.a.a.a.g.d(((i$a []) (ad$a)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #151 <Method ArrayList g.d(i$a[])>
	//    2    4:areturn         
	}

	public boolean g(Notification notification)
	{
		return android.a.a.a.g.b(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #154 <Method boolean g.b(Notification)>
	//    2    4:ireturn         
	}

	public String i(Notification notification)
	{
		return android.a.a.a.g.a(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #156 <Method String g.a(Notification)>
	//    2    4:areturn         
	}

	d$i()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void d$q()>
	//    2    4:return          
	}
}
