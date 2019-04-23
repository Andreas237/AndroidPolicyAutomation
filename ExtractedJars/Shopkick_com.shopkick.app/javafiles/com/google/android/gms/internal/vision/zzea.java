// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;


// Referenced classes of package com.google.android.gms.internal.vision:
//			zzgd, zzdy

final class zzea
	implements zzgd
{

	private zzea()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public final boolean zzh(int i)
	{
		return zzdy.zzw(i) != null;
	//    0    0:iload_1         
	//    1    1:invokestatic    #25  <Method zzdy zzdy.zzw(int)>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	static final zzgd zzhl = new zzea();

	static 
	{
	//    0    0:new             #2   <Class zzea>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void zzea()>
	//    3    7:putstatic       #15  <Field zzgd zzhl>
	//*   4   10:return          
	}
}
