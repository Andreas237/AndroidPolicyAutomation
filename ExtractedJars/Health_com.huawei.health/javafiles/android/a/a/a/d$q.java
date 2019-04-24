// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.a.a.a;

import android.app.Notification;
import android.os.Bundle;

// Referenced classes of package android.a.a.a:
//			d, o, p

static class d$q extends d$u
{

	public Bundle a(Notification notification)
	{
		return o.c(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #19  <Method Bundle o.c(Notification)>
	//    2    4:areturn         
	}

	public Notification b(d$d d$d1, d$e d$e1)
	{
		o$a o$a1 = new o$a(d$d1.a, d$d1.B, d$d1.b, d$d1.c, d$d1.h, d$d1.f, d$d1.i, d$d1.d, d$d1.e, d$d1.g, d$d1.o, d$d1.p, d$d1.q, d$d1.k, d$d1.l, d$d1.j, d$d1.n, d$d1.v, d$d1.C, d$d1.x, d$d1.r, d$d1.s, d$d1.t);
	//    0    0:new             #23  <Class o$a>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:getfield        #28  <Field android.content.Context d$d.a>
	//    4    8:aload_1         
	//    5    9:getfield        #32  <Field Notification d$d.B>
	//    6   12:aload_1         
	//    7   13:getfield        #35  <Field CharSequence d$d.b>
	//    8   16:aload_1         
	//    9   17:getfield        #37  <Field CharSequence d$d.c>
	//   10   20:aload_1         
	//   11   21:getfield        #40  <Field CharSequence d$d.h>
	//   12   24:aload_1         
	//   13   25:getfield        #44  <Field android.widget.RemoteViews d$d.f>
	//   14   28:aload_1         
	//   15   29:getfield        #48  <Field int d$d.i>
	//   16   32:aload_1         
	//   17   33:getfield        #52  <Field android.app.PendingIntent d$d.d>
	//   18   36:aload_1         
	//   19   37:getfield        #55  <Field android.app.PendingIntent d$d.e>
	//   20   40:aload_1         
	//   21   41:getfield        #59  <Field android.graphics.Bitmap d$d.g>
	//   22   44:aload_1         
	//   23   45:getfield        #62  <Field int d$d.o>
	//   24   48:aload_1         
	//   25   49:getfield        #65  <Field int d$d.p>
	//   26   52:aload_1         
	//   27   53:getfield        #68  <Field boolean d$d.q>
	//   28   56:aload_1         
	//   29   57:getfield        #71  <Field boolean d$d.k>
	//   30   60:aload_1         
	//   31   61:getfield        #74  <Field boolean d$d.l>
	//   32   64:aload_1         
	//   33   65:getfield        #77  <Field int d$d.j>
	//   34   68:aload_1         
	//   35   69:getfield        #80  <Field CharSequence d$d.n>
	//   36   72:aload_1         
	//   37   73:getfield        #83  <Field boolean d$d.v>
	//   38   76:aload_1         
	//   39   77:getfield        #87  <Field java.util.ArrayList d$d.C>
	//   40   80:aload_1         
	//   41   81:getfield        #91  <Field Bundle d$d.x>
	//   42   84:aload_1         
	//   43   85:getfield        #95  <Field String d$d.r>
	//   44   88:aload_1         
	//   45   89:getfield        #98  <Field boolean d$d.s>
	//   46   92:aload_1         
	//   47   93:getfield        #101 <Field String d$d.t>
	//   48   96:invokespecial   #104 <Method void o$a(android.content.Context, Notification, CharSequence, CharSequence, CharSequence, android.widget.RemoteViews, int, android.app.PendingIntent, android.app.PendingIntent, android.graphics.Bitmap, int, int, boolean, boolean, boolean, int, CharSequence, boolean, java.util.ArrayList, Bundle, String, boolean, String)>
	//   49   99:astore_3        
		android.a.a.a.d.a(((o.c) (o$a1)), d$d1.u);
	//   50  100:aload_3         
	//   51  101:aload_1         
	//   52  102:getfield        #107 <Field java.util.ArrayList d$d.u>
	//   53  105:invokestatic    #110 <Method void d.a(o.c, java.util.ArrayList)>
		android.a.a.a.d.a(((c) (o$a1)), d$d1.m);
	//   54  108:aload_3         
	//   55  109:aload_1         
	//   56  110:getfield        #114 <Field d$r d$d.m>
	//   57  113:invokestatic    #117 <Method void d.a(c, d$r)>
		return d$e1.a(d$d1, ((c) (o$a1)));
	//   58  116:aload_2         
	//   59  117:aload_1         
	//   60  118:aload_3         
	//   61  119:invokevirtual   #122 <Method Notification d$e.a(d$d, c)>
	//   62  122:areturn         
	}

	public boolean b(Notification notification)
	{
		return o.a(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #125 <Method boolean o.a(Notification)>
	//    2    4:ireturn         
	}

	public d$a c(Notification notification, int j)
	{
		return (d$a)o.d(notification, j, d$a.d, p.c);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:getstatic       #131 <Field i$a$a d$a.d>
	//    3    5:getstatic       #136 <Field s$a$a p.c>
	//    4    8:invokestatic    #139 <Method i$a o.d(Notification, int, i$a$a, s$a$a)>
	//    5   11:checkcast       #128 <Class d$a>
	//    6   14:areturn         
	}

	public int d(Notification notification)
	{
		return o.b(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #142 <Method int o.b(Notification)>
	//    2    4:ireturn         
	}

	public String e(Notification notification)
	{
		return o.e(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #145 <Method String o.e(Notification)>
	//    2    4:areturn         
	}

	public boolean g(Notification notification)
	{
		return o.d(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #147 <Method boolean o.d(Notification)>
	//    2    4:ireturn         
	}

	public String i(Notification notification)
	{
		return o.i(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #149 <Method String o.i(Notification)>
	//    2    4:areturn         
	}

	d$q()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void d$u()>
	//    2    4:return          
	}
}
