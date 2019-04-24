// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.cache;

import com.startapp.android.publish.adsCommon.e;
import com.startapp.android.publish.adsCommon.g;
import java.io.Serializable;

// Referenced classes of package com.startapp.android.publish.cache:
//			i

protected static class i$d
	implements Serializable
{

	private void a(g g)
	{
		ad = g;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field g ad>
	//    3    5:return          
	}

	private void c()
	{
		if(ad != null && (ad instanceof e))
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field g ad>
	//*   2    4:ifnull          31
	//*   3    7:aload_0         
	//*   4    8:getfield        #31  <Field g ad>
	//*   5   11:instanceof      #33  <Class e>
	//*   6   14:ifeq            31
			html = ((e)ad).f();
	//    7   17:aload_0         
	//    8   18:aload_0         
	//    9   19:getfield        #31  <Field g ad>
	//   10   22:checkcast       #33  <Class e>
	//   11   25:invokevirtual   #37  <Method String e.f()>
	//   12   28:putfield        #39  <Field String html>
	//   13   31:return          
	}

	protected g a()
	{
		return ad;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field g ad>
	//    2    4:areturn         
	}

	protected String b()
	{
		return html;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String html>
	//    2    4:areturn         
	}

	private static final long serialVersionUID = 1L;
	private g ad;
	private String html;

	protected i$d(g g)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		a(g);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #25  <Method void a(g)>
		c();
	//    5    9:aload_0         
	//    6   10:invokespecial   #28  <Method void c()>
	//    7   13:return          
	}
}
