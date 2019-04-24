// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.qrcode;


// Referenced classes of package com.itextpdf.text.pdf.qrcode:
//			GF256Poly

public final class GF256
{

	private GF256(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:sipush          256
	//    4    8:newarray        int[]
	//    5   10:putfield        #28  <Field int[] expTable>
	//    6   13:aload_0         
	//    7   14:sipush          256
	//    8   17:newarray        int[]
	//    9   19:putfield        #30  <Field int[] logTable>
		int j = 1;
	//   10   22:iconst_1        
	//   11   23:istore_2        
		for(int k = 0; k < 256; k++)
	//*  12   24:iconst_0        
	//*  13   25:istore_3        
	//*  14   26:iload_3         
	//*  15   27:sipush          256
	//*  16   30:icmpge          68
		{
			expTable[k] = j;
	//   17   33:aload_0         
	//   18   34:getfield        #28  <Field int[] expTable>
	//   19   37:iload_3         
	//   20   38:iload_2         
	//   21   39:iastore         
			int l = j << 1;
	//   22   40:iload_2         
	//   23   41:iconst_1        
	//   24   42:ishl            
	//   25   43:istore          4
			j = l;
	//   26   45:iload           4
	//   27   47:istore_2        
			if(l >= 256)
	//*  28   48:iload           4
	//*  29   50:sipush          256
	//*  30   53:icmplt          61
				j = l ^ i;
	//   31   56:iload           4
	//   32   58:iload_1         
	//   33   59:ixor            
	//   34   60:istore_2        
		}

	//   35   61:iload_3         
	//   36   62:iconst_1        
	//   37   63:iadd            
	//   38   64:istore_3        
	//*  39   65:goto            26
		for(i = 0; i < 255; i++)
	//*  40   68:iconst_0        
	//*  41   69:istore_1        
	//*  42   70:iload_1         
	//*  43   71:sipush          255
	//*  44   74:icmpge          96
			logTable[expTable[i]] = i;
	//   45   77:aload_0         
	//   46   78:getfield        #30  <Field int[] logTable>
	//   47   81:aload_0         
	//   48   82:getfield        #28  <Field int[] expTable>
	//   49   85:iload_1         
	//   50   86:iaload          
	//   51   87:iload_1         
	//   52   88:iastore         

	//   53   89:iload_1         
	//   54   90:iconst_1        
	//   55   91:iadd            
	//   56   92:istore_1        
	//*  57   93:goto            70
	//   58   96:aload_0         
	//   59   97:new             #32  <Class GF256Poly>
	//   60  100:dup             
	//   61  101:aload_0         
	//   62  102:iconst_1        
	//   63  103:newarray        int[]
	//   64  105:dup             
	//   65  106:iconst_0        
	//   66  107:iconst_0        
	//   67  108:iastore         
	//   68  109:invokespecial   #35  <Method void GF256Poly(GF256, int[])>
	//   69  112:putfield        #37  <Field GF256Poly zero>
	//   70  115:aload_0         
	//   71  116:new             #32  <Class GF256Poly>
	//   72  119:dup             
	//   73  120:aload_0         
	//   74  121:iconst_1        
	//   75  122:newarray        int[]
	//   76  124:dup             
	//   77  125:iconst_0        
	//   78  126:iconst_1        
	//   79  127:iastore         
	//   80  128:invokespecial   #35  <Method void GF256Poly(GF256, int[])>
	//   81  131:putfield        #39  <Field GF256Poly one>
	//   82  134:return          
	}

	static int addOrSubtract(int i, int j)
	{
		return i ^ j;
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:ixor            
	//    3    3:ireturn         
	}

	GF256Poly buildMonomial(int i, int j)
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            12
			throw new IllegalArgumentException();
	//    2    4:new             #45  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:invokespecial   #46  <Method void IllegalArgumentException()>
	//    5   11:athrow          
		if(j == 0)
	//*   6   12:iload_2         
	//*   7   13:ifne            21
		{
			return zero;
	//    8   16:aload_0         
	//    9   17:getfield        #37  <Field GF256Poly zero>
	//   10   20:areturn         
		} else
		{
			int ai[] = new int[i + 1];
	//   11   21:iload_1         
	//   12   22:iconst_1        
	//   13   23:iadd            
	//   14   24:newarray        int[]
	//   15   26:astore_3        
			ai[0] = j;
	//   16   27:aload_3         
	//   17   28:iconst_0        
	//   18   29:iload_2         
	//   19   30:iastore         
			return new GF256Poly(this, ai);
	//   20   31:new             #32  <Class GF256Poly>
	//   21   34:dup             
	//   22   35:aload_0         
	//   23   36:aload_3         
	//   24   37:invokespecial   #35  <Method void GF256Poly(GF256, int[])>
	//   25   40:areturn         
		}
	}

	int exp(int i)
	{
		return expTable[i];
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int[] expTable>
	//    2    4:iload_1         
	//    3    5:iaload          
	//    4    6:ireturn         
	}

	GF256Poly getOne()
	{
		return one;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field GF256Poly one>
	//    2    4:areturn         
	}

	GF256Poly getZero()
	{
		return zero;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field GF256Poly zero>
	//    2    4:areturn         
	}

	int inverse(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            12
			throw new ArithmeticException();
	//    2    4:new             #54  <Class ArithmeticException>
	//    3    7:dup             
	//    4    8:invokespecial   #55  <Method void ArithmeticException()>
	//    5   11:athrow          
		else
			return expTable[255 - logTable[i]];
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field int[] expTable>
	//    8   16:sipush          255
	//    9   19:aload_0         
	//   10   20:getfield        #30  <Field int[] logTable>
	//   11   23:iload_1         
	//   12   24:iaload          
	//   13   25:isub            
	//   14   26:iaload          
	//   15   27:ireturn         
	}

	int log(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            12
			throw new IllegalArgumentException();
	//    2    4:new             #45  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:invokespecial   #46  <Method void IllegalArgumentException()>
	//    5   11:athrow          
		else
			return logTable[i];
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field int[] logTable>
	//    8   16:iload_1         
	//    9   17:iaload          
	//   10   18:ireturn         
	}

	int multiply(int i, int j)
	{
		int k;
		if(i == 0 || j == 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            8
	//*   2    4:iload_2         
	//*   3    5:ifne            12
		{
			k = 0;
	//    4    8:iconst_0        
	//    5    9:istore_3        
		} else
	//*   6   10:iload_3         
	//*   7   11:ireturn         
		{
			k = j;
	//    8   12:iload_2         
	//    9   13:istore_3        
			if(i != 1)
	//*  10   14:iload_1         
	//*  11   15:iconst_1        
	//*  12   16:icmpeq          10
				if(j == 1)
	//*  13   19:iload_2         
	//*  14   20:iconst_1        
	//*  15   21:icmpne          26
					return i;
	//   16   24:iload_1         
	//   17   25:ireturn         
				else
					return expTable[(logTable[i] + logTable[j]) % 255];
	//   18   26:aload_0         
	//   19   27:getfield        #28  <Field int[] expTable>
	//   20   30:aload_0         
	//   21   31:getfield        #30  <Field int[] logTable>
	//   22   34:iload_1         
	//   23   35:iaload          
	//   24   36:aload_0         
	//   25   37:getfield        #30  <Field int[] logTable>
	//   26   40:iload_2         
	//   27   41:iaload          
	//   28   42:iadd            
	//   29   43:sipush          255
	//   30   46:irem            
	//   31   47:iaload          
	//   32   48:ireturn         
		}
		return k;
	}

	public static final GF256 DATA_MATRIX_FIELD = new GF256(301);
	public static final GF256 QR_CODE_FIELD = new GF256(285);
	private final int expTable[] = new int[256];
	private final int logTable[] = new int[256];
	private final GF256Poly one = new GF256Poly(this, new int[] {
		1
	});
	private final GF256Poly zero = new GF256Poly(this, new int[] {
		0
	});

	static 
	{
	//    0    0:new             #2   <Class GF256>
	//    1    3:dup             
	//    2    4:sipush          285
	//    3    7:invokespecial   #19  <Method void GF256(int)>
	//    4   10:putstatic       #21  <Field GF256 QR_CODE_FIELD>
	//    5   13:new             #2   <Class GF256>
	//    6   16:dup             
	//    7   17:sipush          301
	//    8   20:invokespecial   #19  <Method void GF256(int)>
	//    9   23:putstatic       #23  <Field GF256 DATA_MATRIX_FIELD>
	//*  10   26:return          
	}
}
