// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzev, zzbb

final class zzeu
	implements zzev
{

	zzeu(zzbb zzbb1)
	{
		zzox = zzbb1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzbb zzox>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final int size()
	{
		return zzox.size();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzbb zzox>
	//    2    4:invokevirtual   #22  <Method int zzbb.size()>
	//    3    7:ireturn         
	}

	public final byte zzj(int i)
	{
		return zzox.zzj(i);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzbb zzox>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #26  <Method byte zzbb.zzj(int)>
	//    4    8:ireturn         
	}

	private final zzbb zzox;
}
