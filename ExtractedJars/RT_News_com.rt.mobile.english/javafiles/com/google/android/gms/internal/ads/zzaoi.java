// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaoj

public final class zzaoi extends zzaoj
{

	private zzaoi(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void zzaoj()>
		zzcwe = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field Object zzcwe>
	//    5    9:return          
	}

	public static zzaoi zzj(Object obj)
	{
		return new zzaoi(obj);
	//    0    0:new             #2   <Class zzaoi>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #23  <Method void zzaoi(Object)>
	//    4    8:areturn         
	}

	public final void zzsn()
	{
		((zzaoj)this).set(zzcwe);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #16  <Field Object zzcwe>
	//    3    5:invokevirtual   #28  <Method void zzaoj.set(Object)>
	//    4    8:return          
	}

	private final Object zzcwe;
}
