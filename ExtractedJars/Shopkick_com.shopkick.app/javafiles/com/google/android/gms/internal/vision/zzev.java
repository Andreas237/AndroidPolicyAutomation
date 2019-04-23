// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;


// Referenced classes of package com.google.android.gms.internal.vision:
//			zzfe, zzex, zzep, zzeo

final class zzev
{

	private zzev(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		buffer = new byte[i];
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:newarray        byte[]
	//    5    8:putfield        #15  <Field byte[] buffer>
		zzsd = zzfe.zzg(buffer);
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:getfield        #15  <Field byte[] buffer>
	//    9   16:invokestatic    #21  <Method zzfe zzfe.zzg(byte[])>
	//   10   19:putfield        #23  <Field zzfe zzsd>
	//   11   22:return          
	}

	zzev(int i, zzep zzep)
	{
		this(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #27  <Method void zzev(int)>
	//    3    5:return          
	}

	public final zzeo zzdo()
	{
		zzsd.zzea();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field zzfe zzsd>
	//    2    4:invokevirtual   #32  <Method void zzfe.zzea()>
		return ((zzeo) (new zzex(buffer)));
	//    3    7:new             #34  <Class zzex>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field byte[] buffer>
	//    7   15:invokespecial   #37  <Method void zzex(byte[])>
	//    8   18:areturn         
	}

	public final zzfe zzdp()
	{
		return zzsd;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field zzfe zzsd>
	//    2    4:areturn         
	}

	private final byte buffer[];
	private final zzfe zzsd;
}
