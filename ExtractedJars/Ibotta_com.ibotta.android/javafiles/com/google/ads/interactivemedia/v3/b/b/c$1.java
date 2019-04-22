// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b;

import com.google.ads.interactivemedia.v3.b.h;
import java.lang.reflect.Type;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b:
//			h, c

class c$1
	implements com.google.ads.interactivemedia.v3.b.b.h
{

	public Object a()
	{
		return a.a(b);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field h a>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field Type b>
	//    4    8:invokeinterface #35  <Method Object h.a(Type)>
	//    5   13:areturn         
	}

	final h a;
	final Type b;
	final c c;

	c$1(c c1, h h1, Type type)
	{
		c = c1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field c c>
		a = h1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field h a>
		b = type;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field Type b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
