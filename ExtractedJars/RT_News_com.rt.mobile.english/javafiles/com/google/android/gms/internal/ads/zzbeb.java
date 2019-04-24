// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbec, zzbah

final class zzbeb
	implements zzbec
{

	zzbeb(zzbah zzbah1)
	{
		zzdyv = zzbah1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzbah zzdyv>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final int size()
	{
		return zzdyv.size();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzbah zzdyv>
	//    2    4:invokevirtual   #22  <Method int zzbah.size()>
	//    3    7:ireturn         
	}

	public final byte zzbn(int i)
	{
		return zzdyv.zzbn(i);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzbah zzdyv>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #26  <Method byte zzbah.zzbn(int)>
	//    4    8:ireturn         
	}

	private final zzbah zzdyv;
}
