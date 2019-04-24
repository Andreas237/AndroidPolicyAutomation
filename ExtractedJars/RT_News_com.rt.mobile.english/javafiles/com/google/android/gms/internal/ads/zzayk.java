// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class zzayk
{

	public static final void zza(ByteBuffer bytebuffer, ByteBuffer bytebuffer1, ByteBuffer bytebuffer2, int i)
	{
		if(i >= 0 && bytebuffer1.remaining() >= i && bytebuffer2.remaining() >= i && bytebuffer.remaining() >= i)
	//*   0    0:iload_3         
	//*   1    1:iflt            65
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #12  <Method int ByteBuffer.remaining()>
	//*   4    8:iload_3         
	//*   5    9:icmplt          65
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #12  <Method int ByteBuffer.remaining()>
	//*   8   16:iload_3         
	//*   9   17:icmplt          65
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #12  <Method int ByteBuffer.remaining()>
	//*  12   24:iload_3         
	//*  13   25:icmpge          31
	//*  14   28:goto            65
		{
			for(int j = 0; j < i; j++)
	//*  15   31:iconst_0        
	//*  16   32:istore          4
	//*  17   34:iload           4
	//*  18   36:iload_3         
	//*  19   37:icmpge          64
				bytebuffer.put((byte)(bytebuffer1.get() ^ bytebuffer2.get()));
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #16  <Method byte ByteBuffer.get()>
	//   23   45:aload_2         
	//   24   46:invokevirtual   #16  <Method byte ByteBuffer.get()>
	//   25   49:ixor            
	//   26   50:int2byte        
	//   27   51:invokevirtual   #20  <Method ByteBuffer ByteBuffer.put(byte)>
	//   28   54:pop             

	//   29   55:iload           4
	//   30   57:iconst_1        
	//   31   58:iadd            
	//   32   59:istore          4
	//*  33   61:goto            34
			return;
	//   34   64:return          
		} else
		{
			throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
	//   35   65:new             #22  <Class IllegalArgumentException>
	//   36   68:dup             
	//   37   69:ldc1            #24  <String "That combination of buffers, offsets and length to xor result in out-of-bond accesses.">
	//   38   71:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//   39   74:athrow          
		}
	}

	public static transient byte[] zza(byte abyte0[][])
		throws GeneralSecurityException
	{
		int k = abyte0.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_3        
		int i = 0;
	//    3    3:iconst_0        
	//    4    4:istore_1        
		int j = i;
	//    5    5:iload_1         
	//    6    6:istore_2        
		for(; i < k; i++)
	//*   7    7:iload_1         
	//*   8    8:iload_3         
	//*   9    9:icmpge          50
		{
			byte abyte1[] = abyte0[i];
	//   10   12:aload_0         
	//   11   13:iload_1         
	//   12   14:aaload          
	//   13   15:astore          4
			if(j > 0x7fffffff - abyte1.length)
	//*  14   17:iload_2         
	//*  15   18:ldc1            #33  <Int 0x7fffffff>
	//*  16   20:aload           4
	//*  17   22:arraylength     
	//*  18   23:isub            
	//*  19   24:icmple          37
				throw new GeneralSecurityException("exceeded size limit");
	//   20   27:new             #32  <Class GeneralSecurityException>
	//   21   30:dup             
	//   22   31:ldc1            #35  <String "exceeded size limit">
	//   23   33:invokespecial   #36  <Method void GeneralSecurityException(String)>
	//   24   36:athrow          
			j += abyte1.length;
	//   25   37:iload_2         
	//   26   38:aload           4
	//   27   40:arraylength     
	//   28   41:iadd            
	//   29   42:istore_2        
		}

	//   30   43:iload_1         
	//   31   44:iconst_1        
	//   32   45:iadd            
	//   33   46:istore_1        
	//*  34   47:goto            7
		byte abyte2[] = new byte[j];
	//   35   50:iload_2         
	//   36   51:newarray        byte[]
	//   37   53:astore          4
		k = abyte0.length;
	//   38   55:aload_0         
	//   39   56:arraylength     
	//   40   57:istore_3        
		i = 0;
	//   41   58:iconst_0        
	//   42   59:istore_1        
		j = i;
	//   43   60:iload_1         
	//   44   61:istore_2        
		for(; i < k; i++)
	//*  45   62:iload_1         
	//*  46   63:iload_3         
	//*  47   64:icmpge          97
		{
			byte abyte3[] = abyte0[i];
	//   48   67:aload_0         
	//   49   68:iload_1         
	//   50   69:aaload          
	//   51   70:astore          5
			System.arraycopy(((Object) (abyte3)), 0, ((Object) (abyte2)), j, abyte3.length);
	//   52   72:aload           5
	//   53   74:iconst_0        
	//   54   75:aload           4
	//   55   77:iload_2         
	//   56   78:aload           5
	//   57   80:arraylength     
	//   58   81:invokestatic    #42  <Method void System.arraycopy(Object, int, Object, int, int)>
			j += abyte3.length;
	//   59   84:iload_2         
	//   60   85:aload           5
	//   61   87:arraylength     
	//   62   88:iadd            
	//   63   89:istore_2        
		}

	//   64   90:iload_1         
	//   65   91:iconst_1        
	//   66   92:iadd            
	//   67   93:istore_1        
	//*  68   94:goto            62
		return abyte2;
	//   69   97:aload           4
	//   70   99:areturn         
	}
}
