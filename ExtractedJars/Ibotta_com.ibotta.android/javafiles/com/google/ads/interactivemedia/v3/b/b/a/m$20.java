// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b.a;

import com.google.ads.interactivemedia.v3.b.c.a;
import com.google.ads.interactivemedia.v3.b.*;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b.a:
//			m

static final class m$20
	implements x
{

	public w a(f f, a a1)
	{
		if(a1.equals(((Object) (a))))
	//*   0    0:aload_2         
	//*   1    1:aload_0         
	//*   2    2:getfield        #18  <Field a a>
	//*   3    5:invokevirtual   #31  <Method boolean a.equals(Object)>
	//*   4    8:ifeq            16
			return b;
	//    5   11:aload_0         
	//    6   12:getfield        #20  <Field w b>
	//    7   15:areturn         
		else
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
	}

	final a a;
	final w b;

	m$20(a a1, w w)
	{
		a = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field a a>
		b = w;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field w b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
