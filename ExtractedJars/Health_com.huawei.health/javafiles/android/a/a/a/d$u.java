// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.a.a.a;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package android.a.a.a:
//			d, n, p

static class d$u extends d$m
{

	public Bundle a(Notification notification)
	{
		return n.a(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #18  <Method Bundle n.a(Notification)>
	//    2    4:areturn         
	}

	public d$a[] a(ArrayList arraylist)
	{
		return (d$a[])(d$a[])n.c(arraylist, d$a.d, p.c);
	//    0    0:aload_1         
	//    1    1:getstatic       #25  <Field i$a$a d$a.d>
	//    2    4:getstatic       #31  <Field s$a$a p.c>
	//    3    7:invokestatic    #34  <Method i$a[] n.c(ArrayList, i$a$a, s$a$a)>
	//    4   10:checkcast       #36  <Class d$a[]>
	//    5   13:checkcast       #36  <Class d$a[]>
	//    6   16:areturn         
	}

	public Notification b(d$d d$d1, d$e d$e1)
	{
		n$a n$a1 = new n$a(d$d1.a, d$d1.B, d$d1.b, d$d1.c, d$d1.h, d$d1.f, d$d1.i, d$d1.d, d$d1.e, d$d1.g, d$d1.o, d$d1.p, d$d1.q, d$d1.l, d$d1.j, d$d1.n, d$d1.v, d$d1.x, d$d1.r, d$d1.s, d$d1.t);
	//    0    0:new             #42  <Class n$a>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:getfield        #47  <Field android.content.Context d$d.a>
	//    4    8:aload_1         
	//    5    9:getfield        #51  <Field Notification d$d.B>
	//    6   12:aload_1         
	//    7   13:getfield        #54  <Field CharSequence d$d.b>
	//    8   16:aload_1         
	//    9   17:getfield        #56  <Field CharSequence d$d.c>
	//   10   20:aload_1         
	//   11   21:getfield        #59  <Field CharSequence d$d.h>
	//   12   24:aload_1         
	//   13   25:getfield        #63  <Field android.widget.RemoteViews d$d.f>
	//   14   28:aload_1         
	//   15   29:getfield        #67  <Field int d$d.i>
	//   16   32:aload_1         
	//   17   33:getfield        #70  <Field android.app.PendingIntent d$d.d>
	//   18   36:aload_1         
	//   19   37:getfield        #73  <Field android.app.PendingIntent d$d.e>
	//   20   40:aload_1         
	//   21   41:getfield        #77  <Field android.graphics.Bitmap d$d.g>
	//   22   44:aload_1         
	//   23   45:getfield        #80  <Field int d$d.o>
	//   24   48:aload_1         
	//   25   49:getfield        #83  <Field int d$d.p>
	//   26   52:aload_1         
	//   27   53:getfield        #87  <Field boolean d$d.q>
	//   28   56:aload_1         
	//   29   57:getfield        #90  <Field boolean d$d.l>
	//   30   60:aload_1         
	//   31   61:getfield        #93  <Field int d$d.j>
	//   32   64:aload_1         
	//   33   65:getfield        #96  <Field CharSequence d$d.n>
	//   34   68:aload_1         
	//   35   69:getfield        #99  <Field boolean d$d.v>
	//   36   72:aload_1         
	//   37   73:getfield        #103 <Field Bundle d$d.x>
	//   38   76:aload_1         
	//   39   77:getfield        #107 <Field String d$d.r>
	//   40   80:aload_1         
	//   41   81:getfield        #110 <Field boolean d$d.s>
	//   42   84:aload_1         
	//   43   85:getfield        #113 <Field String d$d.t>
	//   44   88:invokespecial   #116 <Method void n$a(android.content.Context, Notification, CharSequence, CharSequence, CharSequence, android.widget.RemoteViews, int, android.app.PendingIntent, android.app.PendingIntent, android.graphics.Bitmap, int, int, boolean, boolean, int, CharSequence, boolean, Bundle, String, boolean, String)>
	//   45   91:astore_3        
		android.a.a.a.d.a(((o.c) (n$a1)), d$d1.u);
	//   46   92:aload_3         
	//   47   93:aload_1         
	//   48   94:getfield        #119 <Field ArrayList d$d.u>
	//   49   97:invokestatic    #122 <Method void d.a(o.c, ArrayList)>
		android.a.a.a.d.a(((c) (n$a1)), d$d1.m);
	//   50  100:aload_3         
	//   51  101:aload_1         
	//   52  102:getfield        #126 <Field d$r d$d.m>
	//   53  105:invokestatic    #129 <Method void d.a(c, d$r)>
		return d$e1.a(d$d1, ((c) (n$a1)));
	//   54  108:aload_2         
	//   55  109:aload_1         
	//   56  110:aload_3         
	//   57  111:invokevirtual   #134 <Method Notification d$e.a(d$d, c)>
	//   58  114:areturn         
	}

	public boolean b(Notification notification)
	{
		return n.d(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #137 <Method boolean n.d(Notification)>
	//    2    4:ireturn         
	}

	public d$a c(Notification notification, int j)
	{
		return (d$a)n.a(notification, j, d$a.d, p.c);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:getstatic       #25  <Field i$a$a d$a.d>
	//    3    5:getstatic       #31  <Field s$a$a p.c>
	//    4    8:invokestatic    #141 <Method i$a n.a(Notification, int, i$a$a, s$a$a)>
	//    5   11:checkcast       #21  <Class d$a>
	//    6   14:areturn         
	}

	public int d(Notification notification)
	{
		return n.c(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #144 <Method int n.c(Notification)>
	//    2    4:ireturn         
	}

	public String e(Notification notification)
	{
		return n.b(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #147 <Method String n.b(Notification)>
	//    2    4:areturn         
	}

	public ArrayList e(d$a ad$a[])
	{
		return n.b(((i$a []) (ad$a)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #151 <Method ArrayList n.b(i$a[])>
	//    2    4:areturn         
	}

	public boolean g(Notification notification)
	{
		return n.e(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #154 <Method boolean n.e(Notification)>
	//    2    4:ireturn         
	}

	public String i(Notification notification)
	{
		return n.f(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #156 <Method String n.f(Notification)>
	//    2    4:areturn         
	}

	d$u()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void d$m()>
	//    2    4:return          
	}
}
