// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzank, zzaii

final class zzaik
	implements zzank
{

	private zzaik()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public final Object apply(Object obj)
	{
		return ((Object) (zzaii.zzcj((String)obj)));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class String>
	//    2    4:invokestatic    #27  <Method Void zzaii.zzcj(String)>
	//    3    7:areturn         
	}

	static final zzank zzcmz = new zzaik();

	static 
	{
	//    0    0:new             #2   <Class zzaik>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void zzaik()>
	//    3    7:putstatic       #15  <Field zzank zzcmz>
	//*   4   10:return          
	}
}
