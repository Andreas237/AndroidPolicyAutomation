// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			abt, iv, bpj

final class bpn
	implements abt
{

	bpn(bpj bpj1)
	{
		a = bpj1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field bpj a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void a(Object obj)
	{
		obj = ((Object) ((iv)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #19  <Class iv>
	//    2    4:astore_1        
		a.b(((iv) (obj)));
	//    3    5:aload_0         
	//    4    6:getfield        #12  <Field bpj a>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #25  <Method void bpj.b(iv)>
	//    7   13:return          
	}

	private final bpj a;
}
