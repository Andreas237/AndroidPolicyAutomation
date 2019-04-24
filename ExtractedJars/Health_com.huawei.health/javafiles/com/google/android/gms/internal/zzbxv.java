// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//			zzbxm

final class zzbxv
{

	zzbxv(int i, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		tag = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #15  <Field int tag>
		zzbxZ = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field byte[] zzbxZ>
	//    8   14:return          
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof zzbxv))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzbxv>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzbxv)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzbxv>
	//   12   20:astore_1        
		return tag == ((zzbxv) (obj)).tag && Arrays.equals(zzbxZ, ((zzbxv) (obj)).zzbxZ);
	//   13   21:aload_0         
	//   14   22:getfield        #15  <Field int tag>
	//   15   25:aload_1         
	//   16   26:getfield        #15  <Field int tag>
	//   17   29:icmpne          48
	//   18   32:aload_0         
	//   19   33:getfield        #17  <Field byte[] zzbxZ>
	//   20   36:aload_1         
	//   21   37:getfield        #17  <Field byte[] zzbxZ>
	//   22   40:invokestatic    #25  <Method boolean Arrays.equals(byte[], byte[])>
	//   23   43:ifeq            48
	//   24   46:iconst_1        
	//   25   47:ireturn         
	//   26   48:iconst_0        
	//   27   49:ireturn         
	}

	public int hashCode()
	{
		return (tag + 527) * 31 + Arrays.hashCode(zzbxZ);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field int tag>
	//    2    4:sipush          527
	//    3    7:iadd            
	//    4    8:bipush          31
	//    5   10:imul            
	//    6   11:aload_0         
	//    7   12:getfield        #17  <Field byte[] zzbxZ>
	//    8   15:invokestatic    #30  <Method int Arrays.hashCode(byte[])>
	//    9   18:iadd            
	//   10   19:ireturn         
	}

	void zza(zzbxm zzbxm1)
		throws IOException
	{
		zzbxm1.zzrk(tag);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field int tag>
	//    3    5:invokevirtual   #40  <Method void zzbxm.zzrk(int)>
		zzbxm1.zzaj(zzbxZ);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field byte[] zzbxZ>
	//    7   13:invokevirtual   #44  <Method void zzbxm.zzaj(byte[])>
	//    8   16:return          
	}

	int zzu()
	{
		return zzbxm.zzrl(tag) + 0 + zzbxZ.length;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field int tag>
	//    2    4:invokestatic    #50  <Method int zzbxm.zzrl(int)>
	//    3    7:iconst_0        
	//    4    8:iadd            
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field byte[] zzbxZ>
	//    7   13:arraylength     
	//    8   14:iadd            
	//    9   15:ireturn         
	}

	final int tag;
	final byte zzbxZ[];
}
