// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.a.a.a;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package android.a.a.a:
//			d

static class d$m
	implements d$k
{

	public i$b a(Bundle bundle, a a1, a a2)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Bundle a(Notification notification)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public d$a[] a(ArrayList arraylist)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Notification b(d$d d$d1, d$e d$e)
	{
		d$e = ((d$e) (d$d1.B));
	//    0    0:aload_1         
	//    1    1:getfield        #28  <Field Notification d$d.B>
	//    2    4:astore_2        
		((Notification) (d$e)).setLatestEventInfo(d$d1.a, d$d1.b, d$d1.c, d$d1.d);
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:getfield        #31  <Field android.content.Context d$d.a>
	//    6   10:aload_1         
	//    7   11:getfield        #34  <Field CharSequence d$d.b>
	//    8   14:aload_1         
	//    9   15:getfield        #37  <Field CharSequence d$d.c>
	//   10   18:aload_1         
	//   11   19:getfield        #41  <Field android.app.PendingIntent d$d.d>
	//   12   22:invokevirtual   #47  <Method void Notification.setLatestEventInfo(android.content.Context, CharSequence, CharSequence, android.app.PendingIntent)>
		if(d$d1.j > 0)
	//*  13   25:aload_1         
	//*  14   26:getfield        #51  <Field int d$d.j>
	//*  15   29:ifle            44
			d$e.flags = ((Notification) (d$e)).flags | 0x80;
	//   16   32:aload_2         
	//   17   33:aload_2         
	//   18   34:getfield        #54  <Field int Notification.flags>
	//   19   37:sipush          128
	//   20   40:ior             
	//   21   41:putfield        #54  <Field int Notification.flags>
		return ((Notification) (d$e));
	//   22   44:aload_2         
	//   23   45:areturn         
	}

	public boolean b(Notification notification)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public d$a c(Notification notification, int j)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Bundle c(i$b i$b)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String c(Notification notification)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int d(Notification notification)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String e(Notification notification)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public ArrayList e(d$a ad$a[])
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean g(Notification notification)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String i(Notification notification)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	d$m()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
