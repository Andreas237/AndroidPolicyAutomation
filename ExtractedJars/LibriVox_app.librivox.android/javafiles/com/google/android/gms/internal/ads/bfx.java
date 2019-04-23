// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class bfx
{

	public bfx(int i, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #15  <Field int a>
		b = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field byte[] b>
	//    8   14:return          
	}

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          58
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #24  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #24  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((bfx)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class bfx>
	//   16   28:astore_1        
			return a == ((bfx) (obj)).a && Arrays.equals(b, ((bfx) (obj)).b);
	//   17   29:aload_0         
	//   18   30:getfield        #15  <Field int a>
	//   19   33:aload_1         
	//   20   34:getfield        #15  <Field int a>
	//   21   37:icmpne          56
	//   22   40:aload_0         
	//   23   41:getfield        #17  <Field byte[] b>
	//   24   44:aload_1         
	//   25   45:getfield        #17  <Field byte[] b>
	//   26   48:invokestatic    #29  <Method boolean Arrays.equals(byte[], byte[])>
	//   27   51:ifeq            56
	//   28   54:iconst_1        
	//   29   55:ireturn         
	//   30   56:iconst_0        
	//   31   57:ireturn         
		} else
		{
			return false;
	//   32   58:iconst_0        
	//   33   59:ireturn         
		}
	}

	public final int hashCode()
	{
		return a * 31 + Arrays.hashCode(b);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field int a>
	//    2    4:bipush          31
	//    3    6:imul            
	//    4    7:aload_0         
	//    5    8:getfield        #17  <Field byte[] b>
	//    6   11:invokestatic    #34  <Method int Arrays.hashCode(byte[])>
	//    7   14:iadd            
	//    8   15:ireturn         
	}

	public final int a = 1;
	public final byte b[];
}
