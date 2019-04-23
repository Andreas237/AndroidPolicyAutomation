// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			aco

final class act
	implements Runnable
{

	act(aco aco1, boolean flag)
	{
		b = aco1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field aco b>
		a = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #16  <Field boolean a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		aco.a(b, "windowVisibilityChanged", new String[] {
			"isVisible", String.valueOf(a)
		});
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field aco b>
	//    2    4:ldc1            #23  <String "windowVisibilityChanged">
	//    3    6:iconst_2        
	//    4    7:anewarray       String[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:ldc1            #27  <String "isVisible">
	//    8   14:aastore         
	//    9   15:dup             
	//   10   16:iconst_1        
	//   11   17:aload_0         
	//   12   18:getfield        #16  <Field boolean a>
	//   13   21:invokestatic    #31  <Method String String.valueOf(boolean)>
	//   14   24:aastore         
	//   15   25:invokestatic    #36  <Method void aco.a(aco, String, String[])>
	//   16   28:return          
	}

	private final boolean a;
	private final aco b;
}
