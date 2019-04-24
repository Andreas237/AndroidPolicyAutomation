// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.crypto;


public class ARCFOUREncryption
{

	public ARCFOUREncryption()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		state = new byte[256];
	//    2    4:aload_0         
	//    3    5:sipush          256
	//    4    8:newarray        byte[]
	//    5   10:putfield        #15  <Field byte[] state>
	//    6   13:return          
	}

	public void encryptARCFOUR(byte abyte0[])
	{
		encryptARCFOUR(abyte0, 0, abyte0.length, abyte0, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:aload_1         
	//    6    6:iconst_0        
	//    7    7:invokevirtual   #21  <Method void encryptARCFOUR(byte[], int, int, byte[], int)>
	//    8   10:return          
	}

	public void encryptARCFOUR(byte abyte0[], int i, int j)
	{
		encryptARCFOUR(abyte0, i, j, abyte0, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload_1         
	//    5    5:iload_2         
	//    6    6:invokevirtual   #21  <Method void encryptARCFOUR(byte[], int, int, byte[], int)>
	//    7    9:return          
	}

	public void encryptARCFOUR(byte abyte0[], int i, int j, byte abyte1[], int k)
	{
		for(int l = i; l < j + i; l++)
	//*   0    0:iload_2         
	//*   1    1:istore          7
	//*   2    3:iload           7
	//*   3    5:iload_3         
	//*   4    6:iload_2         
	//*   5    7:iadd            
	//*   6    8:icmpge          140
		{
			x = x + 1 & 0xff;
	//    7   11:aload_0         
	//    8   12:aload_0         
	//    9   13:getfield        #24  <Field int x>
	//   10   16:iconst_1        
	//   11   17:iadd            
	//   12   18:sipush          255
	//   13   21:iand            
	//   14   22:putfield        #24  <Field int x>
			y = state[x] + y & 0xff;
	//   15   25:aload_0         
	//   16   26:aload_0         
	//   17   27:getfield        #15  <Field byte[] state>
	//   18   30:aload_0         
	//   19   31:getfield        #24  <Field int x>
	//   20   34:baload          
	//   21   35:aload_0         
	//   22   36:getfield        #26  <Field int y>
	//   23   39:iadd            
	//   24   40:sipush          255
	//   25   43:iand            
	//   26   44:putfield        #26  <Field int y>
			byte byte0 = state[x];
	//   27   47:aload_0         
	//   28   48:getfield        #15  <Field byte[] state>
	//   29   51:aload_0         
	//   30   52:getfield        #24  <Field int x>
	//   31   55:baload          
	//   32   56:istore          6
			state[x] = state[y];
	//   33   58:aload_0         
	//   34   59:getfield        #15  <Field byte[] state>
	//   35   62:aload_0         
	//   36   63:getfield        #24  <Field int x>
	//   37   66:aload_0         
	//   38   67:getfield        #15  <Field byte[] state>
	//   39   70:aload_0         
	//   40   71:getfield        #26  <Field int y>
	//   41   74:baload          
	//   42   75:bastore         
			state[y] = byte0;
	//   43   76:aload_0         
	//   44   77:getfield        #15  <Field byte[] state>
	//   45   80:aload_0         
	//   46   81:getfield        #26  <Field int y>
	//   47   84:iload           6
	//   48   86:bastore         
			abyte1[(l - i) + k] = (byte)(abyte0[l] ^ state[state[x] + state[y] & 0xff]);
	//   49   87:aload           4
	//   50   89:iload           7
	//   51   91:iload_2         
	//   52   92:isub            
	//   53   93:iload           5
	//   54   95:iadd            
	//   55   96:aload_1         
	//   56   97:iload           7
	//   57   99:baload          
	//   58  100:aload_0         
	//   59  101:getfield        #15  <Field byte[] state>
	//   60  104:aload_0         
	//   61  105:getfield        #15  <Field byte[] state>
	//   62  108:aload_0         
	//   63  109:getfield        #24  <Field int x>
	//   64  112:baload          
	//   65  113:aload_0         
	//   66  114:getfield        #15  <Field byte[] state>
	//   67  117:aload_0         
	//   68  118:getfield        #26  <Field int y>
	//   69  121:baload          
	//   70  122:iadd            
	//   71  123:sipush          255
	//   72  126:iand            
	//   73  127:baload          
	//   74  128:ixor            
	//   75  129:int2byte        
	//   76  130:bastore         
		}

	//   77  131:iload           7
	//   78  133:iconst_1        
	//   79  134:iadd            
	//   80  135:istore          7
	//*  81  137:goto            3
	//   82  140:return          
	}

	public void encryptARCFOUR(byte abyte0[], byte abyte1[])
	{
		encryptARCFOUR(abyte0, 0, abyte0.length, abyte1, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:aload_2         
	//    6    6:iconst_0        
	//    7    7:invokevirtual   #21  <Method void encryptARCFOUR(byte[], int, int, byte[], int)>
	//    8   10:return          
	}

	public void prepareARCFOURKey(byte abyte0[])
	{
		prepareARCFOURKey(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokevirtual   #30  <Method void prepareARCFOURKey(byte[], int, int)>
	//    6    8:return          
	}

	public void prepareARCFOURKey(byte abyte0[], int i, int j)
	{
		int i1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          6
		int j1 = 0;
	//    2    3:iconst_0        
	//    3    4:istore          7
		for(int k = 0; k < 256; k++)
	//*   4    6:iconst_0        
	//*   5    7:istore          5
	//*   6    9:iload           5
	//*   7   11:sipush          256
	//*   8   14:icmpge          36
			state[k] = (byte)k;
	//    9   17:aload_0         
	//   10   18:getfield        #15  <Field byte[] state>
	//   11   21:iload           5
	//   12   23:iload           5
	//   13   25:int2byte        
	//   14   26:bastore         

	//   15   27:iload           5
	//   16   29:iconst_1        
	//   17   30:iadd            
	//   18   31:istore          5
	//*  19   33:goto            9
		x = 0;
	//   20   36:aload_0         
	//   21   37:iconst_0        
	//   22   38:putfield        #24  <Field int x>
		y = 0;
	//   23   41:aload_0         
	//   24   42:iconst_0        
	//   25   43:putfield        #26  <Field int y>
		for(int l = 0; l < 256; l++)
	//*  26   46:iconst_0        
	//*  27   47:istore          5
	//*  28   49:iload           5
	//*  29   51:sipush          256
	//*  30   54:icmpge          129
		{
			j1 = abyte0[i1 + i] + state[l] + j1 & 0xff;
	//   31   57:aload_1         
	//   32   58:iload           6
	//   33   60:iload_2         
	//   34   61:iadd            
	//   35   62:baload          
	//   36   63:aload_0         
	//   37   64:getfield        #15  <Field byte[] state>
	//   38   67:iload           5
	//   39   69:baload          
	//   40   70:iadd            
	//   41   71:iload           7
	//   42   73:iadd            
	//   43   74:sipush          255
	//   44   77:iand            
	//   45   78:istore          7
			byte byte0 = state[l];
	//   46   80:aload_0         
	//   47   81:getfield        #15  <Field byte[] state>
	//   48   84:iload           5
	//   49   86:baload          
	//   50   87:istore          4
			state[l] = state[j1];
	//   51   89:aload_0         
	//   52   90:getfield        #15  <Field byte[] state>
	//   53   93:iload           5
	//   54   95:aload_0         
	//   55   96:getfield        #15  <Field byte[] state>
	//   56   99:iload           7
	//   57  101:baload          
	//   58  102:bastore         
			state[j1] = byte0;
	//   59  103:aload_0         
	//   60  104:getfield        #15  <Field byte[] state>
	//   61  107:iload           7
	//   62  109:iload           4
	//   63  111:bastore         
			i1 = (i1 + 1) % j;
	//   64  112:iload           6
	//   65  114:iconst_1        
	//   66  115:iadd            
	//   67  116:iload_3         
	//   68  117:irem            
	//   69  118:istore          6
		}

	//   70  120:iload           5
	//   71  122:iconst_1        
	//   72  123:iadd            
	//   73  124:istore          5
	//*  74  126:goto            49
	//   75  129:return          
	}

	private byte state[];
	private int x;
	private int y;
}
