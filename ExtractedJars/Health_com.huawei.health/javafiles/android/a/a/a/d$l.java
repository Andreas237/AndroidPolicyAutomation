// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.a.a.a;

import android.app.Notification;
import o.a;

// Referenced classes of package android.a.a.a:
//			d

static class d$l extends d$m
{

	public Notification b(d$d d$d1, d$e d$e)
	{
		d$e = ((d$e) (d$d1.B));
	//    0    0:aload_1         
	//    1    1:getfield        #20  <Field Notification d$d.B>
	//    2    4:astore_2        
		((Notification) (d$e)).setLatestEventInfo(d$d1.a, d$d1.b, d$d1.c, d$d1.d);
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:getfield        #24  <Field android.content.Context android.a.a.a.d$d.a>
	//    6   10:aload_1         
	//    7   11:getfield        #27  <Field CharSequence d$d.b>
	//    8   14:aload_1         
	//    9   15:getfield        #30  <Field CharSequence d$d.c>
	//   10   18:aload_1         
	//   11   19:getfield        #34  <Field android.app.PendingIntent d$d.d>
	//   12   22:invokevirtual   #40  <Method void Notification.setLatestEventInfo(android.content.Context, CharSequence, CharSequence, android.app.PendingIntent)>
		d$e = ((d$e) (a.d(((Notification) (d$e)), d$d1.a, d$d1.b, d$d1.c, d$d1.d, d$d1.e)));
	//   13   25:aload_2         
	//   14   26:aload_1         
	//   15   27:getfield        #24  <Field android.content.Context android.a.a.a.d$d.a>
	//   16   30:aload_1         
	//   17   31:getfield        #27  <Field CharSequence d$d.b>
	//   18   34:aload_1         
	//   19   35:getfield        #30  <Field CharSequence d$d.c>
	//   20   38:aload_1         
	//   21   39:getfield        #34  <Field android.app.PendingIntent d$d.d>
	//   22   42:aload_1         
	//   23   43:getfield        #43  <Field android.app.PendingIntent d$d.e>
	//   24   46:invokestatic    #48  <Method Notification a.d(Notification, android.content.Context, CharSequence, CharSequence, android.app.PendingIntent, android.app.PendingIntent)>
	//   25   49:astore_2        
		if(d$d1.j > 0)
	//*  26   50:aload_1         
	//*  27   51:getfield        #52  <Field int d$d.j>
	//*  28   54:ifle            69
			d$e.flags = ((Notification) (d$e)).flags | 0x80;
	//   29   57:aload_2         
	//   30   58:aload_2         
	//   31   59:getfield        #55  <Field int Notification.flags>
	//   32   62:sipush          128
	//   33   65:ior             
	//   34   66:putfield        #55  <Field int Notification.flags>
		return ((Notification) (d$e));
	//   35   69:aload_2         
	//   36   70:areturn         
	}

	d$l()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void d$m()>
	//    2    4:return          
	}
}
