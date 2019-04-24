// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//			zzw, zzy, zzdi

final class zzaa
	implements zzw
{

	zzaa(zzy zzy1)
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

	public final void zzdf(String s)
	{
		zzbau.zzdf(s);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzy zzbau>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #22  <Method void zzy.zzdf(String)>
	//    4    8:return          
	}

	public final String zznq()
	{
		return zzbau.zznq();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzy zzbau>
	//    2    4:invokevirtual   #26  <Method String zzy.zznq()>
	//    3    7:areturn         
	}

	public final void zzns()
	{
		zzdi.zzab("Refresh ignored: container loaded as default only.");
	//    0    0:ldc1            #29  <String "Refresh ignored: container loaded as default only.">
	//    1    2:invokestatic    #34  <Method void zzdi.zzab(String)>
	//    2    5:return          
	}

	private final zzy zzbau;
}
