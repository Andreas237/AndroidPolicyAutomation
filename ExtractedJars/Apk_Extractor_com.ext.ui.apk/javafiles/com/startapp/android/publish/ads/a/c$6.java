// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.a;

import com.startapp.common.a.c;

// Referenced classes of package com.startapp.android.publish.ads.a:
//			c

class c$6
	implements Runnable
{

	public void run()
	{
		if(a.d != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field com.startapp.android.publish.ads.a.c a>
	//*   2    4:getfield        #25  <Field android.webkit.WebView c.d>
	//*   3    7:ifnull          20
			c.b(a.d);
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field com.startapp.android.publish.ads.a.c a>
	//    6   14:getfield        #25  <Field android.webkit.WebView c.d>
	//    7   17:invokestatic    #31  <Method void c.b(android.webkit.WebView)>
	//    8   20:return          
	}

	final com.startapp.android.publish.ads.a.c a;

	c$6(com.startapp.android.publish.ads.a.c c1)
	{
		a = c1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field com.startapp.android.publish.ads.a.c a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
