// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aao, bmq, yy, ys

final class yv
	implements aao
{

	yv(ys ys, yy yy1)
	{
		a = yy1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #12  <Field yy a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final Object a(Object obj)
	{
		obj = ((Object) (new ByteArrayInputStream(((bmq)obj).b)));
	//    0    0:new             #19  <Class ByteArrayInputStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:checkcast       #21  <Class bmq>
	//    4    8:getfield        #25  <Field byte[] bmq.b>
	//    5   11:invokespecial   #28  <Method void ByteArrayInputStream(byte[])>
	//    6   14:astore_1        
		return a.a(((java.io.InputStream) (obj)));
	//    7   15:aload_0         
	//    8   16:getfield        #12  <Field yy a>
	//    9   19:aload_1         
	//   10   20:invokeinterface #33  <Method Object yy.a(java.io.InputStream)>
	//   11   25:areturn         
	}

	private final yy a;
}
