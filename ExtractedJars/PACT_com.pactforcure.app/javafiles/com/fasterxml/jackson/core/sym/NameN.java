// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.sym;

import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.core.sym:
//			Name

public final class NameN extends Name
{

	NameN(String s, int i, int j, int k, int l, int i1, int ai[], 
			int j1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #17  <Method void Name(String, int)>
		q1 = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #19  <Field int q1>
		q2 = k;
	//    7   11:aload_0         
	//    8   12:iload           4
	//    9   14:putfield        #21  <Field int q2>
		q3 = l;
	//   10   17:aload_0         
	//   11   18:iload           5
	//   12   20:putfield        #23  <Field int q3>
		q4 = i1;
	//   13   23:aload_0         
	//   14   24:iload           6
	//   15   26:putfield        #25  <Field int q4>
		q = ai;
	//   16   29:aload_0         
	//   17   30:aload           7
	//   18   32:putfield        #27  <Field int[] q>
		qlen = j1;
	//   19   35:aload_0         
	//   20   36:iload           8
	//   21   38:putfield        #29  <Field int qlen>
	//   22   41:return          
	}

	private final boolean _equals2(int ai[])
	{
		int j = qlen;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int qlen>
	//    2    4:istore_3        
		for(int i = 0; i < j - 4; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:iconst_4        
	//*   8   10:isub            
	//*   9   11:icmpge          37
			if(ai[i + 4] != q[i])
	//*  10   14:aload_1         
	//*  11   15:iload_2         
	//*  12   16:iconst_4        
	//*  13   17:iadd            
	//*  14   18:iaload          
	//*  15   19:aload_0         
	//*  16   20:getfield        #27  <Field int[] q>
	//*  17   23:iload_2         
	//*  18   24:iaload          
	//*  19   25:icmpeq          30
				return false;
	//   20   28:iconst_0        
	//   21   29:ireturn         

	//   22   30:iload_2         
	//   23   31:iconst_1        
	//   24   32:iadd            
	//   25   33:istore_2        
	//*  26   34:goto            7
		return true;
	//   27   37:iconst_1        
	//   28   38:ireturn         
	}

	public static NameN construct(String s, int i, int ai[], int j)
	{
		if(j < 4)
	//*   0    0:iload_3         
	//*   1    1:iconst_4        
	//*   2    2:icmpge          13
			throw new IllegalArgumentException();
	//    3    5:new             #36  <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:invokespecial   #39  <Method void IllegalArgumentException()>
	//    6   12:athrow          
		int k = ai[0];
	//    7   13:aload_2         
	//    8   14:iconst_0        
	//    9   15:iaload          
	//   10   16:istore          4
		int l = ai[1];
	//   11   18:aload_2         
	//   12   19:iconst_1        
	//   13   20:iaload          
	//   14   21:istore          5
		int i1 = ai[2];
	//   15   23:aload_2         
	//   16   24:iconst_2        
	//   17   25:iaload          
	//   18   26:istore          6
		int j1 = ai[3];
	//   19   28:aload_2         
	//   20   29:iconst_3        
	//   21   30:iaload          
	//   22   31:istore          7
		if(j - 4 > 0)
	//*  23   33:iload_3         
	//*  24   34:iconst_4        
	//*  25   35:isub            
	//*  26   36:ifle            66
			ai = Arrays.copyOfRange(ai, 4, j);
	//   27   39:aload_2         
	//   28   40:iconst_4        
	//   29   41:iload_3         
	//   30   42:invokestatic    #45  <Method int[] Arrays.copyOfRange(int[], int, int)>
	//   31   45:astore_2        
		else
	//*  32   46:new             #2   <Class NameN>
	//*  33   49:dup             
	//*  34   50:aload_0         
	//*  35   51:iload_1         
	//*  36   52:iload           4
	//*  37   54:iload           5
	//*  38   56:iload           6
	//*  39   58:iload           7
	//*  40   60:aload_2         
	//*  41   61:iload_3         
	//*  42   62:invokespecial   #47  <Method void NameN(String, int, int, int, int, int, int[], int)>
	//*  43   65:areturn         
			ai = null;
	//   44   66:aconst_null     
	//   45   67:astore_2        
		return new NameN(s, i, k, l, i1, j1, ai, j);
	//*  46   68:goto            46
	}

	public boolean equals(int i)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean equals(int i, int j)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean equals(int i, int j, int k)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean equals(int ai[], int i)
	{
	//*   0    0:iload_2         
	//*   1    1:aload_0         
	//*   2    2:getfield        #29  <Field int qlen>
	//*   3    5:icmpeq          10
_L2:
		return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		if(i != qlen || ai[0] != q1 || ai[1] != q2 || ai[2] != q3 || ai[3] != q4) goto _L2; else goto _L1
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:iaload          
	//    9   13:aload_0         
	//   10   14:getfield        #19  <Field int q1>
	//   11   17:icmpne          8
	//   12   20:aload_1         
	//   13   21:iconst_1        
	//   14   22:iaload          
	//   15   23:aload_0         
	//   16   24:getfield        #21  <Field int q2>
	//   17   27:icmpne          8
	//   18   30:aload_1         
	//   19   31:iconst_2        
	//   20   32:iaload          
	//   21   33:aload_0         
	//   22   34:getfield        #23  <Field int q3>
	//   23   37:icmpne          8
	//   24   40:aload_1         
	//   25   41:iconst_3        
	//   26   42:iaload          
	//   27   43:aload_0         
	//   28   44:getfield        #25  <Field int q4>
	//   29   47:icmpne          8
_L1:
		i;
	//   30   50:iload_2         
		JVM INSTR tableswitch 4 8: default 84
	//	               4 140
	//	               5 128
	//	               6 116
	//	               7 103
	//	               8 90;
	//   31   51:tableswitch     4 8: default 84
	//	               4 140
	//	               5 128
	//	               6 116
	//	               7 103
	//	               8 90
		   goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
		return _equals2(ai);
	//   32   84:aload_0         
	//   33   85:aload_1         
	//   34   86:invokespecial   #54  <Method boolean _equals2(int[])>
	//   35   89:ireturn         
_L8:
		if(ai[7] != q[3]) goto _L2; else goto _L7
	//   36   90:aload_1         
	//   37   91:bipush          7
	//   38   93:iaload          
	//   39   94:aload_0         
	//   40   95:getfield        #27  <Field int[] q>
	//   41   98:iconst_3        
	//   42   99:iaload          
	//   43  100:icmpne          8
_L7:
		if(ai[6] != q[2]) goto _L2; else goto _L6
	//   44  103:aload_1         
	//   45  104:bipush          6
	//   46  106:iaload          
	//   47  107:aload_0         
	//   48  108:getfield        #27  <Field int[] q>
	//   49  111:iconst_2        
	//   50  112:iaload          
	//   51  113:icmpne          8
_L6:
		if(ai[5] != q[1]) goto _L2; else goto _L5
	//   52  116:aload_1         
	//   53  117:iconst_5        
	//   54  118:iaload          
	//   55  119:aload_0         
	//   56  120:getfield        #27  <Field int[] q>
	//   57  123:iconst_1        
	//   58  124:iaload          
	//   59  125:icmpne          8
_L5:
		if(ai[4] != q[0]) goto _L2; else goto _L4
	//   60  128:aload_1         
	//   61  129:iconst_4        
	//   62  130:iaload          
	//   63  131:aload_0         
	//   64  132:getfield        #27  <Field int[] q>
	//   65  135:iconst_0        
	//   66  136:iaload          
	//   67  137:icmpne          8
_L4:
		return true;
	//   68  140:iconst_1        
	//   69  141:ireturn         
	}

	private final int q[];
	private final int q1;
	private final int q2;
	private final int q3;
	private final int q4;
	private final int qlen;
}
