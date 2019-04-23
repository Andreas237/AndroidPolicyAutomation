// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			abt, iv, bpj

final class bpk
	implements abt
{

	bpk(bpj bpj1)
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
		bpj.a(a, true);
	//    3    5:aload_0         
	//    4    6:getfield        #12  <Field bpj a>
	//    5    9:iconst_1        
	//    6   10:invokestatic    #24  <Method boolean bpj.a(bpj, boolean)>
	//    7   13:pop             
		a.a(((iv) (obj)));
	//    8   14:aload_0         
	//    9   15:getfield        #12  <Field bpj a>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #27  <Method void bpj.a(iv)>
	//   12   22:return          
	}

	private final bpj a;
}
