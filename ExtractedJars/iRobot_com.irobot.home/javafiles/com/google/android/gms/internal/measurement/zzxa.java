// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzxb, zzte

final class zzxa
	implements zzxb
{

	zzxa(zzte zzte1)
	{
		zzccf = zzte1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzte zzccf>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final int size()
	{
		return zzccf.size();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzte zzccf>
	//    2    4:invokevirtual   #22  <Method int zzte.size()>
	//    3    7:ireturn         
	}

	public final byte zzam(int i)
	{
		return zzccf.zzam(i);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzte zzccf>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #26  <Method byte zzte.zzam(int)>
	//    4    8:ireturn         
	}

	private final zzte zzccf;
}
