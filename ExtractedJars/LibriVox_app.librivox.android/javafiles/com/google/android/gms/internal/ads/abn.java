// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			abo

public final class abn extends abo
{

	private abn(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void abo()>
		a = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field Object a>
	//    5    9:return          
	}

	public static abn a(Object obj)
	{
		return new abn(obj);
	//    0    0:new             #2   <Class abn>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #18  <Method void abn(Object)>
	//    4    8:areturn         
	}

	public final void a()
	{
		((abo)this).b(a);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #14  <Field Object a>
	//    3    5:invokevirtual   #21  <Method void abo.b(Object)>
	//    4    8:return          
	}

	private final Object a;
}
