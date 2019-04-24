// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzahv, zzxq, zzahu

public final class zzaib
{

	public zzaib(zzxq zzxq, zzahu zzahu)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzbtp = zzxq;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field zzxq zzbtp>
		zzcmi = new zzahv(zzahu);
	//    5    9:aload_0         
	//    6   10:new             #18  <Class zzahv>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokespecial   #21  <Method void zzahv(zzahu)>
	//   10   18:putfield        #23  <Field zzahv zzcmi>
	//   11   21:return          
	}

	public final zzxq zzpe()
	{
		return zzbtp;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzxq zzbtp>
	//    2    4:areturn         
	}

	public final zzahv zzpf()
	{
		return zzcmi;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field zzahv zzcmi>
	//    2    4:areturn         
	}

	private final zzxq zzbtp;
	private final zzahv zzcmi;
}
