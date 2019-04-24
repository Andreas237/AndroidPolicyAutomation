// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.a.a.a;

import android.app.Notification;

// Referenced classes of package android.a.a.a:
//			d

public static abstract class d$r
{

	public Notification a()
	{
		Notification notification = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(d != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #25  <Field d$d d>
	//*   4    6:ifnull          17
			notification = d.c();
	//    5    9:aload_0         
	//    6   10:getfield        #25  <Field d$d d>
	//    7   13:invokevirtual   #30  <Method Notification d$d.c()>
	//    8   16:astore_1        
		return notification;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public void a(d$d d$d1)
	{
		if(d != d$d1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field d$d d>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       29
		{
			d = d$d1;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #25  <Field d$d d>
			if(d != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #25  <Field d$d d>
	//*   9   17:ifnull          29
				d.a(this);
	//   10   20:aload_0         
	//   11   21:getfield        #25  <Field d$d d>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #34  <Method d$d d$d.a(d$r)>
	//   14   28:pop             
		}
	//   15   29:return          
	}

	d$d d;
	CharSequence e;
	CharSequence f;
	boolean g;

	public d$r()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		g = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #20  <Field boolean g>
	//    5    9:return          
	}
}
