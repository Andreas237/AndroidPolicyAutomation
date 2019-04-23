// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zztv, zzto, zztf, zzte

final class zztm
{

	private zztm(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		buffer = new byte[i];
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:newarray        byte[]
	//    5    8:putfield        #15  <Field byte[] buffer>
		zzbtw = zztv.zzj(buffer);
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:getfield        #15  <Field byte[] buffer>
	//    9   16:invokestatic    #21  <Method zztv zztv.zzj(byte[])>
	//   10   19:putfield        #23  <Field zztv zzbtw>
	//   11   22:return          
	}

	zztm(int i, zztf zztf)
	{
		this(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #27  <Method void zztm(int)>
	//    3    5:return          
	}

	public final zzte zzuh()
	{
		if(zzbtw.zzvj() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field zztv zzbtw>
	//*   2    4:invokevirtual   #33  <Method int zztv.zzvj()>
	//*   3    7:ifne            22
			return ((zzte) (new zzto(buffer)));
	//    4   10:new             #35  <Class zzto>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:getfield        #15  <Field byte[] buffer>
	//    8   18:invokespecial   #38  <Method void zzto(byte[])>
	//    9   21:areturn         
		else
			throw new IllegalStateException("Did not write as much data as expected.");
	//   10   22:new             #40  <Class IllegalStateException>
	//   11   25:dup             
	//   12   26:ldc1            #42  <String "Did not write as much data as expected.">
	//   13   28:invokespecial   #45  <Method void IllegalStateException(String)>
	//   14   31:athrow          
	}

	public final zztv zzui()
	{
		return zzbtw;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field zztv zzbtw>
	//    2    4:areturn         
	}

	private final byte buffer[];
	private final zztv zzbtw;
}
