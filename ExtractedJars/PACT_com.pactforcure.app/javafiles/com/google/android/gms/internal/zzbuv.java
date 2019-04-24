// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//			zzbum

final class zzbuv
{

	zzbuv(int i, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		tag = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #15  <Field int tag>
		zzcsh = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field byte[] zzcsh>
	//    8   14:return          
	}

	public boolean equals(Object obj)
	{
		if(obj != this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(!(obj instanceof zzbuv))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzbuv>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((zzbuv)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzbuv>
	//   12   20:astore_1        
			if(tag != ((zzbuv) (obj)).tag || !Arrays.equals(zzcsh, ((zzbuv) (obj)).zzcsh))
	//*  13   21:aload_0         
	//*  14   22:getfield        #15  <Field int tag>
	//*  15   25:aload_1         
	//*  16   26:getfield        #15  <Field int tag>
	//*  17   29:icmpne          46
	//*  18   32:aload_0         
	//*  19   33:getfield        #17  <Field byte[] zzcsh>
	//*  20   36:aload_1         
	//*  21   37:getfield        #17  <Field byte[] zzcsh>
	//*  22   40:invokestatic    #25  <Method boolean Arrays.equals(byte[], byte[])>
	//*  23   43:ifne            5
				return false;
	//   24   46:iconst_0        
	//   25   47:ireturn         
		}
		return true;
	}

	public int hashCode()
	{
		return (tag + 527) * 31 + Arrays.hashCode(zzcsh);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field int tag>
	//    2    4:sipush          527
	//    3    7:iadd            
	//    4    8:bipush          31
	//    5   10:imul            
	//    6   11:aload_0         
	//    7   12:getfield        #17  <Field byte[] zzcsh>
	//    8   15:invokestatic    #30  <Method int Arrays.hashCode(byte[])>
	//    9   18:iadd            
	//   10   19:ireturn         
	}

	void zza(zzbum zzbum1)
		throws IOException
	{
		zzbum1.zzqt(tag);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field int tag>
	//    3    5:invokevirtual   #40  <Method void zzbum.zzqt(int)>
		zzbum1.zzah(zzcsh);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field byte[] zzcsh>
	//    7   13:invokevirtual   #44  <Method void zzbum.zzah(byte[])>
	//    8   16:return          
	}

	int zzv()
	{
		return zzbum.zzqu(tag) + 0 + zzcsh.length;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field int tag>
	//    2    4:invokestatic    #50  <Method int zzbum.zzqu(int)>
	//    3    7:iconst_0        
	//    4    8:iadd            
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field byte[] zzcsh>
	//    7   13:arraylength     
	//    8   14:iadd            
	//    9   15:ireturn         
	}

	final int tag;
	final byte zzcsh[];
}
