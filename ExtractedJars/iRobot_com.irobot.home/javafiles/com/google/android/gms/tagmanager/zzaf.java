// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//			zzw, zzy, zzej, zzz

final class zzaf
	implements zzw
{

	private zzaf(zzy zzy1)
	{
		zzbau = zzy1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzy zzbau>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	zzaf(zzy zzy1, zzz zzz)
	{
		this(zzy1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void zzaf(zzy)>
	//    3    5:return          
	}

	public final void zzdf(String s)
	{
		zzbau.zzdf(s);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzy zzbau>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #25  <Method void zzy.zzdf(String)>
	//    4    8:return          
	}

	public final String zznq()
	{
		return zzbau.zznq();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzy zzbau>
	//    2    4:invokevirtual   #29  <Method String zzy.zznq()>
	//    3    7:areturn         
	}

	public final void zzns()
	{
		if(zzy.zza(zzbau).zzew())
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field zzy zzbau>
	//*   2    4:invokestatic    #34  <Method zzej zzy.zza(zzy)>
	//*   3    7:invokeinterface #40  <Method boolean zzej.zzew()>
	//*   4   12:ifeq            23
			zzy.zza(zzbau, 0L);
	//    5   15:aload_0         
	//    6   16:getfield        #12  <Field zzy zzbau>
	//    7   19:lconst_0        
	//    8   20:invokestatic    #43  <Method void zzy.zza(zzy, long)>
	//    9   23:return          
	}

	private final zzy zzbau;
}
