// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;


// Referenced classes of package com.google.android.gms.internal.vision:
//			zzim, zzeo

final class zzil
	implements zzim
{

	zzil(zzeo zzeo1)
	{
		zzaaq = zzeo1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzeo zzaaq>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final int size()
	{
		return zzaaq.size();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzeo zzaaq>
	//    2    4:invokevirtual   #22  <Method int zzeo.size()>
	//    3    7:ireturn         
	}

	public final byte zzai(int i)
	{
		return zzaaq.zzai(i);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzeo zzaaq>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #26  <Method byte zzeo.zzai(int)>
	//    4    8:ireturn         
	}

	private final zzeo zzaaq;
}
