// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			abr, bpj, box

final class bpl
	implements abr
{

	bpl(bpj bpj1)
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

	public final void a()
	{
		bpj.a(a).b(((bpt) (a)));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field bpj a>
	//    2    4:invokestatic    #21  <Method box bpj.a(bpj)>
	//    3    7:aload_0         
	//    4    8:getfield        #12  <Field bpj a>
	//    5   11:invokevirtual   #27  <Method void box.b(bpt)>
	//    6   14:return          
	}

	private final bpj a;
}
