// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class aoq
{

	public static final void a(ByteBuffer bytebuffer, ByteBuffer bytebuffer1, ByteBuffer bytebuffer2, int i)
	{
		if(i >= 0 && bytebuffer1.remaining() >= i && bytebuffer2.remaining() >= i && bytebuffer.remaining() >= i)
	//*   0    0:iload_3         
	//*   1    1:iflt            62
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #12  <Method int ByteBuffer.remaining()>
	//*   4    8:iload_3         
	//*   5    9:icmplt          62
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #12  <Method int ByteBuffer.remaining()>
	//*   8   16:iload_3         
	//*   9   17:icmplt          62
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #12  <Method int ByteBuffer.remaining()>
	//*  12   24:iload_3         
	//*  13   25:icmplt          62
		{
			for(int j = 0; j < i; j++)
	//*  14   28:iconst_0        
	//*  15   29:istore          4
	//*  16   31:iload           4
	//*  17   33:iload_3         
	//*  18   34:icmpge          61
				bytebuffer.put((byte)(bytebuffer1.get() ^ bytebuffer2.get()));
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokevirtual   #16  <Method byte ByteBuffer.get()>
	//   22   42:aload_2         
	//   23   43:invokevirtual   #16  <Method byte ByteBuffer.get()>
	//   24   46:ixor            
	//   25   47:int2byte        
	//   26   48:invokevirtual   #20  <Method ByteBuffer ByteBuffer.put(byte)>
	//   27   51:pop             

	//   28   52:iload           4
	//   29   54:iconst_1        
	//   30   55:iadd            
	//   31   56:istore          4
	//*  32   58:goto            31
			return;
	//   33   61:return          
		} else
		{
			throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
	//   34   62:new             #22  <Class IllegalArgumentException>
	//   35   65:dup             
	//   36   66:ldc1            #24  <String "That combination of buffers, offsets and length to xor result in out-of-bond accesses.">
	//   37   68:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//   38   71:athrow          
		}
	}

	public static transient byte[] a(byte abyte0[][])
	{
		int k = abyte0.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_3        
		int i = 0;
	//    3    3:iconst_0        
	//    4    4:istore_1        
		int j = 0;
	//    5    5:iconst_0        
	//    6    6:istore_2        
		while(i < k) 
	//*   7    7:iload_1         
	//*   8    8:iload_3         
	//*   9    9:icmpge          50
		{
			byte abyte1[] = abyte0[i];
	//   10   12:aload_0         
	//   11   13:iload_1         
	//   12   14:aaload          
	//   13   15:astore          4
			if(j <= 0x7fffffff - abyte1.length)
	//*  14   17:iload_2         
	//*  15   18:ldc1            #31  <Int 0x7fffffff>
	//*  16   20:aload           4
	//*  17   22:arraylength     
	//*  18   23:isub            
	//*  19   24:icmpgt          40
			{
				j += abyte1.length;
	//   20   27:iload_2         
	//   21   28:aload           4
	//   22   30:arraylength     
	//   23   31:iadd            
	//   24   32:istore_2        
				i++;
	//   25   33:iload_1         
	//   26   34:iconst_1        
	//   27   35:iadd            
	//   28   36:istore_1        
			} else
	//*  29   37:goto            7
			{
				throw new GeneralSecurityException("exceeded size limit");
	//   30   40:new             #33  <Class GeneralSecurityException>
	//   31   43:dup             
	//   32   44:ldc1            #35  <String "exceeded size limit">
	//   33   46:invokespecial   #36  <Method void GeneralSecurityException(String)>
	//   34   49:athrow          
			}
		}
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
		j = 0;
	//   43   60:iconst_0        
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
