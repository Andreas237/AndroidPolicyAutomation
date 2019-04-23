// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			atu, att

final class atl
	implements atu
{

	atl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final boolean a(Class class1)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final att b(Class class1)
	{
		throw new IllegalStateException("This should never be called.");
	//    0    0:new             #17  <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "This should never be called.">
	//    3    6:invokespecial   #22  <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}
}
