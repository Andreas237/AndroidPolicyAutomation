// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amazonaws.internal;

import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;

public class SdkDigestInputStream extends DigestInputStream
{

	public SdkDigestInputStream(InputStream inputstream, MessageDigest messagedigest)
	{
		super(inputstream, messagedigest);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #14  <Method void DigestInputStream(InputStream, MessageDigest)>
	//    4    6:return          
	}

	public final long skip(long l)
	{
		if(l <= 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifgt            8
			return l;
	//    4    6:lload_1         
	//    5    7:lreturn         
		byte abyte0[] = new byte[(int)Math.min(2048L, l)];
	//    6    8:ldc2w           #17  <Long 2048L>
	//    7   11:lload_1         
	//    8   12:invokestatic    #24  <Method long Math.min(long, long)>
	//    9   15:l2i             
	//   10   16:newarray        byte[]
	//   11   18:astore          6
		long l1 = l;
	//   12   20:lload_1         
	//   13   21:lstore          4
		int i;
		do
		{
			i = l1 != 0L;
	//   14   23:lload           4
	//   15   25:lconst_0        
	//   16   26:lcmp            
	//   17   27:istore_3        
			if(i <= 0)
				break;
	//   18   28:iload_3         
	//   19   29:ifle            81
			i = read(abyte0, 0, (int)Math.min(l1, abyte0.length));
	//   20   32:aload_0         
	//   21   33:aload           6
	//   22   35:iconst_0        
	//   23   36:lload           4
	//   24   38:aload           6
	//   25   40:arraylength     
	//   26   41:i2l             
	//   27   42:invokestatic    #24  <Method long Math.min(long, long)>
	//   28   45:l2i             
	//   29   46:invokevirtual   #28  <Method int read(byte[], int, int)>
	//   30   49:istore_3        
			if(i == -1)
	//*  31   50:iload_3         
	//*  32   51:iconst_m1       
	//*  33   52:icmpne          71
				if(l1 == l)
	//*  34   55:lload           4
	//*  35   57:lload_1         
	//*  36   58:lcmp            
	//*  37   59:ifne            66
					return -1L;
	//   38   62:ldc2w           #29  <Long -1L>
	//   39   65:lreturn         
				else
					return l - l1;
	//   40   66:lload_1         
	//   41   67:lload           4
	//   42   69:lsub            
	//   43   70:lreturn         
			l1 -= i;
	//   44   71:lload           4
	//   45   73:iload_3         
	//   46   74:i2l             
	//   47   75:lsub            
	//   48   76:lstore          4
		} while(true);
	//   49   78:goto            23
		if(!a && i != 0)
	//*  50   81:getstatic       #32  <Field boolean a>
	//*  51   84:ifne            99
	//*  52   87:iload_3         
	//*  53   88:ifeq            99
			throw new AssertionError();
	//   54   91:new             #34  <Class AssertionError>
	//   55   94:dup             
	//   56   95:invokespecial   #36  <Method void AssertionError()>
	//   57   98:athrow          
		else
			return l;
	//   58   99:lload_1         
	//   59  100:lreturn         
	}

	static final boolean a = true;

	static 
	{
	//    0    0:return          
	}
}
