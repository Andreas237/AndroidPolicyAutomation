// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.*;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzazi, zzazh, zzazl, zzayk

abstract class zzazn
	implements zzazi
{

	zzazn(byte abyte0[], int i)
		throws InvalidKeyException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		if(abyte0.length != 32)
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:bipush          32
	//*   5    8:icmpeq          21
		{
			throw new InvalidKeyException("The key length in bytes must be 32.");
	//    6   11:new             #45  <Class InvalidKeyException>
	//    7   14:dup             
	//    8   15:ldc1            #49  <String "The key length in bytes must be 32.">
	//    9   17:invokespecial   #52  <Method void InvalidKeyException(String)>
	//   10   20:athrow          
		} else
		{
			zzdop = zzazh.zzm(abyte0);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokestatic    #58  <Method zzazh zzazh.zzm(byte[])>
	//   14   26:putfield        #60  <Field zzazh zzdop>
			zzdoq = i;
	//   15   29:aload_0         
	//   16   30:iload_2         
	//   17   31:putfield        #62  <Field int zzdoq>
			return;
	//   18   34:return          
		}
	}

	static int rotateLeft(int i, int j)
	{
		return i >>> -j | i << j;
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:ineg            
	//    3    3:iushr           
	//    4    4:iload_0         
	//    5    5:iload_1         
	//    6    6:ishl            
	//    7    7:ior             
	//    8    8:ireturn         
	}

	static int[] zza(ByteBuffer bytebuffer)
	{
		bytebuffer = ((ByteBuffer) (bytebuffer.order(ByteOrder.LITTLE_ENDIAN).asIntBuffer()));
	//    0    0:aload_0         
	//    1    1:getstatic       #71  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//    2    4:invokevirtual   #75  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//    3    7:invokevirtual   #79  <Method IntBuffer ByteBuffer.asIntBuffer()>
	//    4   10:astore_0        
		int ai[] = new int[((IntBuffer) (bytebuffer)).remaining()];
	//    5   11:aload_0         
	//    6   12:invokevirtual   #85  <Method int IntBuffer.remaining()>
	//    7   15:newarray        int[]
	//    8   17:astore_1        
		((IntBuffer) (bytebuffer)).get(ai);
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:invokevirtual   #89  <Method IntBuffer IntBuffer.get(int[])>
	//   12   23:pop             
		return ai;
	//   13   24:aload_1         
	//   14   25:areturn         
	}

	final void zza(ByteBuffer bytebuffer, byte abyte0[])
		throws GeneralSecurityException
	{
		if(bytebuffer.remaining() - zzaao() < abyte0.length)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #93  <Method int ByteBuffer.remaining()>
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #96  <Method int zzaao()>
	//*   4    8:isub            
	//*   5    9:aload_2         
	//*   6   10:arraylength     
	//*   7   11:icmpge          24
			throw new IllegalArgumentException("Given ByteBuffer output is too small");
	//    8   14:new             #98  <Class IllegalArgumentException>
	//    9   17:dup             
	//   10   18:ldc1            #100 <String "Given ByteBuffer output is too small">
	//   11   20:invokespecial   #101 <Method void IllegalArgumentException(String)>
	//   12   23:athrow          
		byte abyte1[] = zzazl.zzbh(zzaao());
	//   13   24:aload_0         
	//   14   25:invokevirtual   #96  <Method int zzaao()>
	//   15   28:invokestatic    #107 <Method byte[] zzazl.zzbh(int)>
	//   16   31:astore          6
		bytebuffer.put(abyte1);
	//   17   33:aload_1         
	//   18   34:aload           6
	//   19   36:invokevirtual   #110 <Method ByteBuffer ByteBuffer.put(byte[])>
	//   20   39:pop             
		abyte0 = ((byte []) (ByteBuffer.wrap(abyte0)));
	//   21   40:aload_2         
	//   22   41:invokestatic    #34  <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   23   44:astore_2        
		int j = ((ByteBuffer) (abyte0)).remaining();
	//   24   45:aload_2         
	//   25   46:invokevirtual   #93  <Method int ByteBuffer.remaining()>
	//   26   49:istore          4
		int k = j / 64 + 1;
	//   27   51:iload           4
	//   28   53:bipush          64
	//   29   55:idiv            
	//   30   56:iconst_1        
	//   31   57:iadd            
	//   32   58:istore          5
		for(int i = 0; i < k; i++)
	//*  33   60:iconst_0        
	//*  34   61:istore_3        
	//*  35   62:iload_3         
	//*  36   63:iload           5
	//*  37   65:icmpge          121
		{
			ByteBuffer bytebuffer1 = zzb(abyte1, zzdoq + i);
	//   38   68:aload_0         
	//   39   69:aload           6
	//   40   71:aload_0         
	//   41   72:getfield        #62  <Field int zzdoq>
	//   42   75:iload_3         
	//   43   76:iadd            
	//   44   77:invokevirtual   #114 <Method ByteBuffer zzb(byte[], int)>
	//   45   80:astore          7
			if(i == k - 1)
	//*  46   82:iload_3         
	//*  47   83:iload           5
	//*  48   85:iconst_1        
	//*  49   86:isub            
	//*  50   87:icmpne          105
				zzayk.zza(bytebuffer, ((ByteBuffer) (abyte0)), bytebuffer1, j % 64);
	//   51   90:aload_1         
	//   52   91:aload_2         
	//   53   92:aload           7
	//   54   94:iload           4
	//   55   96:bipush          64
	//   56   98:irem            
	//   57   99:invokestatic    #119 <Method void zzayk.zza(ByteBuffer, ByteBuffer, ByteBuffer, int)>
			else
	//*  58  102:goto            114
				zzayk.zza(bytebuffer, ((ByteBuffer) (abyte0)), bytebuffer1, 64);
	//   59  105:aload_1         
	//   60  106:aload_2         
	//   61  107:aload           7
	//   62  109:bipush          64
	//   63  111:invokestatic    #119 <Method void zzayk.zza(ByteBuffer, ByteBuffer, ByteBuffer, int)>
		}

	//   64  114:iload_3         
	//   65  115:iconst_1        
	//   66  116:iadd            
	//   67  117:istore_3        
	//*  68  118:goto            62
	//   69  121:return          
	}

	abstract int zzaao();

	abstract ByteBuffer zzb(byte abyte0[], int i);

	public final byte[] zzk(byte abyte0[])
		throws GeneralSecurityException
	{
		int i = abyte0.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_2        
		zzaao();
	//    3    3:aload_0         
	//    4    4:invokevirtual   #96  <Method int zzaao()>
	//    5    7:pop             
		if(i > 0x7ffffff3)
	//*   6    8:iload_2         
	//*   7    9:ldc1            #122 <Int 0x7ffffff3>
	//*   8   11:icmple          24
		{
			throw new GeneralSecurityException("plaintext too long");
	//    9   14:new             #92  <Class GeneralSecurityException>
	//   10   17:dup             
	//   11   18:ldc1            #124 <String "plaintext too long">
	//   12   20:invokespecial   #125 <Method void GeneralSecurityException(String)>
	//   13   23:athrow          
		} else
		{
			ByteBuffer bytebuffer = ByteBuffer.allocate(zzaao() + abyte0.length);
	//   14   24:aload_0         
	//   15   25:invokevirtual   #96  <Method int zzaao()>
	//   16   28:aload_1         
	//   17   29:arraylength     
	//   18   30:iadd            
	//   19   31:invokestatic    #129 <Method ByteBuffer ByteBuffer.allocate(int)>
	//   20   34:astore_3        
			zza(bytebuffer, abyte0);
	//   21   35:aload_0         
	//   22   36:aload_3         
	//   23   37:aload_1         
	//   24   38:invokevirtual   #131 <Method void zza(ByteBuffer, byte[])>
			return bytebuffer.array();
	//   25   41:aload_3         
	//   26   42:invokevirtual   #135 <Method byte[] ByteBuffer.array()>
	//   27   45:areturn         
		}
	}

	static final int zzdoo[] = zza(ByteBuffer.wrap(new byte[] {
		101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 
		98, 121, 116, 101, 32, 107
	}));
	final zzazh zzdop;
	private final int zzdoq;

	static 
	{
	//    0    0:bipush          16
	//    1    2:newarray        byte[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #15  <Int 101>
	//    5    8:bastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #16  <Int 120>
	//    9   13:bastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #17  <Int 112>
	//   13   18:bastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #18  <Int 97>
	//   17   23:bastore         
	//   18   24:dup             
	//   19   25:iconst_4        
	//   20   26:ldc1            #19  <Int 110>
	//   21   28:bastore         
	//   22   29:dup             
	//   23   30:iconst_5        
	//   24   31:ldc1            #20  <Int 100>
	//   25   33:bastore         
	//   26   34:dup             
	//   27   35:bipush          6
	//   28   37:ldc1            #21  <Int 32>
	//   29   39:bastore         
	//   30   40:dup             
	//   31   41:bipush          7
	//   32   43:ldc1            #22  <Int 51>
	//   33   45:bastore         
	//   34   46:dup             
	//   35   47:bipush          8
	//   36   49:ldc1            #23  <Int 50>
	//   37   51:bastore         
	//   38   52:dup             
	//   39   53:bipush          9
	//   40   55:ldc1            #24  <Int 45>
	//   41   57:bastore         
	//   42   58:dup             
	//   43   59:bipush          10
	//   44   61:ldc1            #25  <Int 98>
	//   45   63:bastore         
	//   46   64:dup             
	//   47   65:bipush          11
	//   48   67:ldc1            #26  <Int 121>
	//   49   69:bastore         
	//   50   70:dup             
	//   51   71:bipush          12
	//   52   73:ldc1            #27  <Int 116>
	//   53   75:bastore         
	//   54   76:dup             
	//   55   77:bipush          13
	//   56   79:ldc1            #15  <Int 101>
	//   57   81:bastore         
	//   58   82:dup             
	//   59   83:bipush          14
	//   60   85:ldc1            #21  <Int 32>
	//   61   87:bastore         
	//   62   88:dup             
	//   63   89:bipush          15
	//   64   91:ldc1            #28  <Int 107>
	//   65   93:bastore         
	//   66   94:invokestatic    #34  <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   67   97:invokestatic    #38  <Method int[] zza(ByteBuffer)>
	//   68  100:putstatic       #40  <Field int[] zzdoo>
	//*  69  103:return          
	}
}
