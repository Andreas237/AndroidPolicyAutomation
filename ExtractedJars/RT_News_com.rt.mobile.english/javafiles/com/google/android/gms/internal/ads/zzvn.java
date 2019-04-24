// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzuu

final class zzvn
	implements Runnable
{

	private zzvn(zzuu zzuu1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		zzbqh = zzuu1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field zzuu zzbqh>
	//    5    9:return          
	}

	static Runnable zza(zzuu zzuu1)
	{
		return ((Runnable) (new zzvn(zzuu1)));
	//    0    0:new             #2   <Class zzvn>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void zzvn(zzuu)>
	//    4    8:areturn         
	}

	public final void run()
	{
		zzbqh.destroy();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzuu zzbqh>
	//    2    4:invokeinterface #26  <Method void zzuu.destroy()>
	//    3    9:return          
	}

	private final zzuu zzbqh;
}
