// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.a.a.a;

import android.app.Notification;
import android.os.Bundle;

// Referenced classes of package android.a.a.a:
//			d, h

static class d$p extends d$i
{

	public i$b a(Bundle bundle, a a1, a a2)
	{
		return h.a(bundle, a1, a2);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #18  <Method i$b h.a(Bundle, i$b$a, s$a$a)>
	//    4    6:areturn         
	}

	public Notification b(d$d d$d1, d$e d$e1)
	{
		h$a h$a1 = new h$a(d$d1.a, d$d1.B, d$d1.b, d$d1.c, d$d1.h, d$d1.f, d$d1.i, d$d1.d, d$d1.e, d$d1.g, d$d1.o, d$d1.p, d$d1.q, d$d1.k, d$d1.l, d$d1.j, d$d1.n, d$d1.v, d$d1.w, d$d1.C, d$d1.x, d$d1.y, d$d1.z, d$d1.A, d$d1.r, d$d1.s, d$d1.t);
	//    0    0:new             #22  <Class h$a>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:getfield        #27  <Field android.content.Context d$d.a>
	//    4    8:aload_1         
	//    5    9:getfield        #31  <Field Notification d$d.B>
	//    6   12:aload_1         
	//    7   13:getfield        #34  <Field CharSequence d$d.b>
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
	//   25   49:getfield        #64  <Field int d$d.p>
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
	//   39   77:getfield        #87  <Field String d$d.w>
	//   40   80:aload_1         
	//   41   81:getfield        #91  <Field java.util.ArrayList d$d.C>
	//   42   84:aload_1         
	//   43   85:getfield        #95  <Field Bundle d$d.x>
	//   44   88:aload_1         
	//   45   89:getfield        #98  <Field int d$d.y>
	//   46   92:aload_1         
	//   47   93:getfield        #101 <Field int d$d.z>
	//   48   96:aload_1         
	//   49   97:getfield        #104 <Field Notification d$d.A>
	//   50  100:aload_1         
	//   51  101:getfield        #107 <Field String d$d.r>
	//   52  104:aload_1         
	//   53  105:getfield        #110 <Field boolean d$d.s>
	//   54  108:aload_1         
	//   55  109:getfield        #113 <Field String d$d.t>
	//   56  112:invokespecial   #116 <Method void h$a(android.content.Context, Notification, CharSequence, CharSequence, CharSequence, android.widget.RemoteViews, int, android.app.PendingIntent, android.app.PendingIntent, android.graphics.Bitmap, int, int, boolean, boolean, boolean, int, CharSequence, boolean, String, java.util.ArrayList, Bundle, int, int, Notification, String, boolean, String)>
	//   57  115:astore_3        
		d.a(((o.c) (h$a1)), d$d1.u);
	//   58  116:aload_3         
	//   59  117:aload_1         
	//   60  118:getfield        #119 <Field java.util.ArrayList d$d.u>
	//   61  121:invokestatic    #122 <Method void d.a(o.c, java.util.ArrayList)>
		d.a(((c) (h$a1)), d$d1.m);
	//   62  124:aload_3         
	//   63  125:aload_1         
	//   64  126:getfield        #126 <Field d$r d$d.m>
	//   65  129:invokestatic    #129 <Method void d.a(c, d$r)>
		return d$e1.a(d$d1, ((c) (h$a1)));
	//   66  132:aload_2         
	//   67  133:aload_1         
	//   68  134:aload_3         
	//   69  135:invokevirtual   #134 <Method Notification d$e.a(d$d, c)>
	//   70  138:areturn         
	}

	public Bundle c(i$b i$b)
	{
		return h.d(i$b);
	//    0    0:aload_1         
	//    1    1:invokestatic    #137 <Method Bundle h.d(i$b)>
	//    2    4:areturn         
	}

	public String c(Notification notification)
	{
		return h.c(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #140 <Method String h.c(Notification)>
	//    2    4:areturn         
	}

	d$p()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void d$i()>
	//    2    4:return          
	}
}
