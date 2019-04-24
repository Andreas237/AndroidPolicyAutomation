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
		zzbty = zztv.zzj(buffer);
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:getfield        #15  <Field byte[] buffer>
	//    9   16:invokestatic    #21  <Method zztv zztv.zzj(byte[])>
	//   10   19:putfield        #23  <Field zztv zzbty>
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
		if(zzbty.zzvj() != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field zztv zzbty>
	//*   2    4:invokevirtual   #33  <Method int zztv.zzvj()>
	//*   3    7:ifeq            20
			throw new IllegalStateException("Did not write as much data as expected.");
	//    4   10:new             #35  <Class IllegalStateException>
	//    5   13:dup             
	//    6   14:ldc1            #37  <String "Did not write as much data as expected.">
	//    7   16:invokespecial   #40  <Method void IllegalStateException(String)>
	//    8   19:athrow          
		else
			return ((zzte) (new zzto(buffer)));
	//    9   20:new             #42  <Class zzto>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:getfield        #15  <Field byte[] buffer>
	//   13   28:invokespecial   #45  <Method void zzto(byte[])>
	//   14   31:areturn         
	}

	public final zztv zzui()
	{
		return zzbty;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field zztv zzbty>
	//    2    4:areturn         
	}

	private final byte buffer[];
	private final zztv zzbty;
}
