// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.*;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			app, apo, aps, aoq

abstract class apv
	implements app
{

	apv(byte abyte0[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		if(abyte0.length == 32)
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:bipush          32
	//*   5    8:icmpne          25
		{
			b = apo.a(abyte0);
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:invokestatic    #49  <Method apo apo.a(byte[])>
	//    9   16:putfield        #51  <Field apo b>
			c = i;
	//   10   19:aload_0         
	//   11   20:iload_2         
	//   12   21:putfield        #53  <Field int c>
			return;
	//   13   24:return          
		} else
		{
			throw new InvalidKeyException("The key length in bytes must be 32.");
	//   14   25:new             #55  <Class InvalidKeyException>
	//   15   28:dup             
	//   16   29:ldc1            #57  <String "The key length in bytes must be 32.">
	//   17   31:invokespecial   #60  <Method void InvalidKeyException(String)>
	//   18   34:athrow          
		}
	}

	static int a(int i, int j)
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

	static int[] a(ByteBuffer bytebuffer)
	{
		bytebuffer = ((ByteBuffer) (bytebuffer.order(ByteOrder.LITTLE_ENDIAN).asIntBuffer()));
	//    0    0:aload_0         
	//    1    1:getstatic       #67  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//    2    4:invokevirtual   #71  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//    3    7:invokevirtual   #75  <Method IntBuffer ByteBuffer.asIntBuffer()>
	//    4   10:astore_0        
		int ai[] = new int[((IntBuffer) (bytebuffer)).remaining()];
	//    5   11:aload_0         
	//    6   12:invokevirtual   #81  <Method int IntBuffer.remaining()>
	//    7   15:newarray        int[]
	//    8   17:astore_1        
		((IntBuffer) (bytebuffer)).get(ai);
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:invokevirtual   #85  <Method IntBuffer IntBuffer.get(int[])>
	//   12   23:pop             
		return ai;
	//   13   24:aload_1         
	//   14   25:areturn         
	}

	abstract int a();

	abstract ByteBuffer a(byte abyte0[], int i);

	final void a(ByteBuffer bytebuffer, byte abyte0[])
	{
		if(bytebuffer.remaining() - a() >= abyte0.length)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #88  <Method int ByteBuffer.remaining()>
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #90  <Method int a()>
	//*   4    8:isub            
	//*   5    9:aload_2         
	//*   6   10:arraylength     
	//*   7   11:icmplt          112
		{
			byte abyte1[] = aps.a(a());
	//    8   14:aload_0         
	//    9   15:invokevirtual   #90  <Method int a()>
	//   10   18:invokestatic    #95  <Method byte[] aps.a(int)>
	//   11   21:astore          6
			bytebuffer.put(abyte1);
	//   12   23:aload_1         
	//   13   24:aload           6
	//   14   26:invokevirtual   #98  <Method ByteBuffer ByteBuffer.put(byte[])>
	//   15   29:pop             
			abyte0 = ((byte []) (ByteBuffer.wrap(abyte0)));
	//   16   30:aload_2         
	//   17   31:invokestatic    #34  <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   18   34:astore_2        
			int j = ((ByteBuffer) (abyte0)).remaining();
	//   19   35:aload_2         
	//   20   36:invokevirtual   #88  <Method int ByteBuffer.remaining()>
	//   21   39:istore          4
			int k = j / 64 + 1;
	//   22   41:iload           4
	//   23   43:bipush          64
	//   24   45:idiv            
	//   25   46:iconst_1        
	//   26   47:iadd            
	//   27   48:istore          5
			for(int i = 0; i < k; i++)
	//*  28   50:iconst_0        
	//*  29   51:istore_3        
	//*  30   52:iload_3         
	//*  31   53:iload           5
	//*  32   55:icmpge          111
			{
				ByteBuffer bytebuffer1 = a(abyte1, c + i);
	//   33   58:aload_0         
	//   34   59:aload           6
	//   35   61:aload_0         
	//   36   62:getfield        #53  <Field int c>
	//   37   65:iload_3         
	//   38   66:iadd            
	//   39   67:invokevirtual   #100 <Method ByteBuffer a(byte[], int)>
	//   40   70:astore          7
				if(i == k - 1)
	//*  41   72:iload_3         
	//*  42   73:iload           5
	//*  43   75:iconst_1        
	//*  44   76:isub            
	//*  45   77:icmpne          95
					aoq.a(bytebuffer, ((ByteBuffer) (abyte0)), bytebuffer1, j % 64);
	//   46   80:aload_1         
	//   47   81:aload_2         
	//   48   82:aload           7
	//   49   84:iload           4
	//   50   86:bipush          64
	//   51   88:irem            
	//   52   89:invokestatic    #105 <Method void aoq.a(ByteBuffer, ByteBuffer, ByteBuffer, int)>
				else
	//*  53   92:goto            104
					aoq.a(bytebuffer, ((ByteBuffer) (abyte0)), bytebuffer1, 64);
	//   54   95:aload_1         
	//   55   96:aload_2         
	//   56   97:aload           7
	//   57   99:bipush          64
	//   58  101:invokestatic    #105 <Method void aoq.a(ByteBuffer, ByteBuffer, ByteBuffer, int)>
			}

	//   59  104:iload_3         
	//   60  105:iconst_1        
	//   61  106:iadd            
	//   62  107:istore_3        
	//*  63  108:goto            52
			return;
	//   64  111:return          
		} else
		{
			throw new IllegalArgumentException("Given ByteBuffer output is too small");
	//   65  112:new             #107 <Class IllegalArgumentException>
	//   66  115:dup             
	//   67  116:ldc1            #109 <String "Given ByteBuffer output is too small">
	//   68  118:invokespecial   #110 <Method void IllegalArgumentException(String)>
	//   69  121:athrow          
		}
	}

	public final byte[] a(byte abyte0[])
	{
		int i = abyte0.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_2        
		a();
	//    3    3:aload_0         
	//    4    4:invokevirtual   #90  <Method int a()>
	//    5    7:pop             
		if(i <= 0x7ffffff3)
	//*   6    8:iload_2         
	//*   7    9:ldc1            #112 <Int 0x7ffffff3>
	//*   8   11:icmpgt          36
		{
			ByteBuffer bytebuffer = ByteBuffer.allocate(a() + abyte0.length);
	//    9   14:aload_0         
	//   10   15:invokevirtual   #90  <Method int a()>
	//   11   18:aload_1         
	//   12   19:arraylength     
	//   13   20:iadd            
	//   14   21:invokestatic    #116 <Method ByteBuffer ByteBuffer.allocate(int)>
	//   15   24:astore_3        
			a(bytebuffer, abyte0);
	//   16   25:aload_0         
	//   17   26:aload_3         
	//   18   27:aload_1         
	//   19   28:invokevirtual   #118 <Method void a(ByteBuffer, byte[])>
			return bytebuffer.array();
	//   20   31:aload_3         
	//   21   32:invokevirtual   #122 <Method byte[] ByteBuffer.array()>
	//   22   35:areturn         
		} else
		{
			throw new GeneralSecurityException("plaintext too long");
	//   23   36:new             #124 <Class GeneralSecurityException>
	//   24   39:dup             
	//   25   40:ldc1            #126 <String "plaintext too long">
	//   26   42:invokespecial   #127 <Method void GeneralSecurityException(String)>
	//   27   45:athrow          
		}
	}

	static final int a[] = a(ByteBuffer.wrap(new byte[] {
		101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 
		98, 121, 116, 101, 32, 107
	}));
	final apo b;
	private final int c;

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
	//   67   97:invokestatic    #37  <Method int[] a(ByteBuffer)>
	//   68  100:putstatic       #39  <Field int[] a>
	//*  69  103:return          
	}
}
