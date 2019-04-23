// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;


// Referenced classes of package com.google.android.gms.internal.vision:
//			zzhe, zzhd

final class zzgv
	implements zzhe
{

	zzgv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final boolean zzb(Class class1)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final zzhd zzc(Class class1)
	{
		throw new IllegalStateException("This should never be called.");
	//    0    0:new             #19  <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "This should never be called.">
	//    3    6:invokespecial   #24  <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}
}
