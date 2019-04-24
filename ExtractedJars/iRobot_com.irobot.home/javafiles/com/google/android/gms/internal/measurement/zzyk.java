// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.Arrays;

final class zzyk
{

	zzyk(int i, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		tag = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #15  <Field int tag>
		zzbtz = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field byte[] zzbtz>
	//    8   14:return          
	}

	public final boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof zzyk))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzyk>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzyk)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzyk>
	//   12   20:astore_1        
		return tag == ((zzyk) (obj)).tag && Arrays.equals(zzbtz, ((zzyk) (obj)).zzbtz);
	//   13   21:aload_0         
	//   14   22:getfield        #15  <Field int tag>
	//   15   25:aload_1         
	//   16   26:getfield        #15  <Field int tag>
	//   17   29:icmpne          48
	//   18   32:aload_0         
	//   19   33:getfield        #17  <Field byte[] zzbtz>
	//   20   36:aload_1         
	//   21   37:getfield        #17  <Field byte[] zzbtz>
	//   22   40:invokestatic    #25  <Method boolean Arrays.equals(byte[], byte[])>
	//   23   43:ifeq            48
	//   24   46:iconst_1        
	//   25   47:ireturn         
	//   26   48:iconst_0        
	//   27   49:ireturn         
	}

	public final int hashCode()
	{
		return (tag + 527) * 31 + Arrays.hashCode(zzbtz);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field int tag>
	//    2    4:sipush          527
	//    3    7:iadd            
	//    4    8:bipush          31
	//    5   10:imul            
	//    6   11:aload_0         
	//    7   12:getfield        #17  <Field byte[] zzbtz>
	//    8   15:invokestatic    #30  <Method int Arrays.hashCode(byte[])>
	//    9   18:iadd            
	//   10   19:ireturn         
	}

	final int tag;
	final byte zzbtz[];
}
