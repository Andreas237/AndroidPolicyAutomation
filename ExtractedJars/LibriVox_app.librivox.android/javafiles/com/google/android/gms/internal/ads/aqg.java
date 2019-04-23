// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class aqg
{

	public aqg(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:sipush          256
	//    4    8:newarray        byte[]
	//    5   10:putfield        #16  <Field byte[] a>
		for(int i = 0; i < 256; i++)
	//*   6   13:iconst_0        
	//*   7   14:istore_3        
	//*   8   15:iload_3         
	//*   9   16:sipush          256
	//*  10   19:icmpge          37
			a[i] = (byte)i;
	//   11   22:aload_0         
	//   12   23:getfield        #16  <Field byte[] a>
	//   13   26:iload_3         
	//   14   27:iload_3         
	//   15   28:int2byte        
	//   16   29:bastore         

	//   17   30:iload_3         
	//   18   31:iconst_1        
	//   19   32:iadd            
	//   20   33:istore_3        
	//*  21   34:goto            15
		int j = 0;
	//   22   37:iconst_0        
	//   23   38:istore_3        
		int k = 0;
	//   24   39:iconst_0        
	//   25   40:istore          4
		for(; j < 256; j++)
	//*  26   42:iload_3         
	//*  27   43:sipush          256
	//*  28   46:icmpge          102
		{
			byte abyte1[] = a;
	//   29   49:aload_0         
	//   30   50:getfield        #16  <Field byte[] a>
	//   31   53:astore          5
			k = k + abyte1[j] + abyte0[j % abyte0.length] & 0xff;
	//   32   55:iload           4
	//   33   57:aload           5
	//   34   59:iload_3         
	//   35   60:baload          
	//   36   61:iadd            
	//   37   62:aload_1         
	//   38   63:iload_3         
	//   39   64:aload_1         
	//   40   65:arraylength     
	//   41   66:irem            
	//   42   67:baload          
	//   43   68:iadd            
	//   44   69:sipush          255
	//   45   72:iand            
	//   46   73:istore          4
			byte byte0 = abyte1[j];
	//   47   75:aload           5
	//   48   77:iload_3         
	//   49   78:baload          
	//   50   79:istore_2        
			abyte1[j] = abyte1[k];
	//   51   80:aload           5
	//   52   82:iload_3         
	//   53   83:aload           5
	//   54   85:iload           4
	//   55   87:baload          
	//   56   88:bastore         
			abyte1[k] = byte0;
	//   57   89:aload           5
	//   58   91:iload           4
	//   59   93:iload_2         
	//   60   94:bastore         
		}

	//   61   95:iload_3         
	//   62   96:iconst_1        
	//   63   97:iadd            
	//   64   98:istore_3        
	//*  65   99:goto            42
		b = 0;
	//   66  102:aload_0         
	//   67  103:iconst_0        
	//   68  104:putfield        #18  <Field int b>
		c = 0;
	//   69  107:aload_0         
	//   70  108:iconst_0        
	//   71  109:putfield        #20  <Field int c>
	//   72  112:return          
	}

	public final void a(byte abyte0[])
	{
		int k = b;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int b>
	//    2    4:istore          5
		int j = c;
	//    3    6:aload_0         
	//    4    7:getfield        #20  <Field int c>
	//    5   10:istore          4
		for(int i = 0; i < abyte0.length; i++)
	//*   6   12:iconst_0        
	//*   7   13:istore_3        
	//*   8   14:iload_3         
	//*   9   15:aload_1         
	//*  10   16:arraylength     
	//*  11   17:icmpge          109
		{
			k = k + 1 & 0xff;
	//   12   20:iload           5
	//   13   22:iconst_1        
	//   14   23:iadd            
	//   15   24:sipush          255
	//   16   27:iand            
	//   17   28:istore          5
			byte abyte1[] = a;
	//   18   30:aload_0         
	//   19   31:getfield        #16  <Field byte[] a>
	//   20   34:astore          7
			j = j + abyte1[k] & 0xff;
	//   21   36:iload           4
	//   22   38:aload           7
	//   23   40:iload           5
	//   24   42:baload          
	//   25   43:iadd            
	//   26   44:sipush          255
	//   27   47:iand            
	//   28   48:istore          4
			byte byte0 = abyte1[k];
	//   29   50:aload           7
	//   30   52:iload           5
	//   31   54:baload          
	//   32   55:istore_2        
			abyte1[k] = abyte1[j];
	//   33   56:aload           7
	//   34   58:iload           5
	//   35   60:aload           7
	//   36   62:iload           4
	//   37   64:baload          
	//   38   65:bastore         
			abyte1[j] = byte0;
	//   39   66:aload           7
	//   40   68:iload           4
	//   41   70:iload_2         
	//   42   71:bastore         
			byte byte1 = abyte0[i];
	//   43   72:aload_1         
	//   44   73:iload_3         
	//   45   74:baload          
	//   46   75:istore          6
			abyte0[i] = (byte)(abyte1[abyte1[k] + abyte1[j] & 0xff] ^ byte1);
	//   47   77:aload_1         
	//   48   78:iload_3         
	//   49   79:aload           7
	//   50   81:aload           7
	//   51   83:iload           5
	//   52   85:baload          
	//   53   86:aload           7
	//   54   88:iload           4
	//   55   90:baload          
	//   56   91:iadd            
	//   57   92:sipush          255
	//   58   95:iand            
	//   59   96:baload          
	//   60   97:iload           6
	//   61   99:ixor            
	//   62  100:int2byte        
	//   63  101:bastore         
		}

	//   64  102:iload_3         
	//   65  103:iconst_1        
	//   66  104:iadd            
	//   67  105:istore_3        
	//*  68  106:goto            14
		b = k;
	//   69  109:aload_0         
	//   70  110:iload           5
	//   71  112:putfield        #18  <Field int b>
		c = j;
	//   72  115:aload_0         
	//   73  116:iload           4
	//   74  118:putfield        #20  <Field int c>
	//   75  121:return          
	}

	private final byte a[] = new byte[256];
	private int b;
	private int c;
}
