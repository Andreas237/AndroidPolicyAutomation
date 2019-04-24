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
	//*  26   36:ifle            49
			ai = Arrays.copyOfRange(ai, 4, j);
	//   27   39:aload_2         
	//   28   40:iconst_4        
	//   29   41:iload_3         
	//   30   42:invokestatic    #45  <Method int[] Arrays.copyOfRange(int[], int, int)>
	//   31   45:astore_2        
		else
	//*  32   46:goto            54
			ai = null;
	//   33   49:aconst_null     
	//   34   50:astore_2        
	//*  35   51:goto            46
		return new NameN(s, i, k, l, i1, j1, ai, j);
	//   36   54:new             #2   <Class NameN>
	//   37   57:dup             
	//   38   58:aload_0         
	//   39   59:iload_1         
	//   40   60:iload           4
	//   41   62:iload           5
	//   42   64:iload           6
	//   43   66:iload           7
	//   44   68:aload_2         
	//   45   69:iload_3         
	//   46   70:invokespecial   #47  <Method void NameN(String, int, int, int, int, int, int[], int)>
	//   47   73:areturn         
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
		if(i != qlen)
	//*   0    0:iload_2         
	//*   1    1:aload_0         
	//*   2    2:getfield        #29  <Field int qlen>
	//*   3    5:icmpeq          10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		if(ai[0] != q1)
	//*   6   10:aload_1         
	//*   7   11:iconst_0        
	//*   8   12:iaload          
	//*   9   13:aload_0         
	//*  10   14:getfield        #19  <Field int q1>
	//*  11   17:icmpeq          22
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
		if(ai[1] != q2)
	//*  14   22:aload_1         
	//*  15   23:iconst_1        
	//*  16   24:iaload          
	//*  17   25:aload_0         
	//*  18   26:getfield        #21  <Field int q2>
	//*  19   29:icmpeq          34
			return false;
	//   20   32:iconst_0        
	//   21   33:ireturn         
		if(ai[2] != q3)
	//*  22   34:aload_1         
	//*  23   35:iconst_2        
	//*  24   36:iaload          
	//*  25   37:aload_0         
	//*  26   38:getfield        #23  <Field int q3>
	//*  27   41:icmpeq          46
			return false;
	//   28   44:iconst_0        
	//   29   45:ireturn         
		if(ai[3] != q4)
	//*  30   46:aload_1         
	//*  31   47:iconst_3        
	//*  32   48:iaload          
	//*  33   49:aload_0         
	//*  34   50:getfield        #25  <Field int q4>
	//*  35   53:icmpeq          58
			return false;
	//   36   56:iconst_0        
	//   37   57:ireturn         
		switch(i)
	//*  38   58:iload_2         
		{
	//*  39   59:tableswitch     4 8: default 92
	//	               4 156
	//	               5 142
	//	               6 128
	//	               7 113
	//	               8 98
		default:
			return _equals2(ai);
	//   40   92:aload_0         
	//   41   93:aload_1         
	//   42   94:invokespecial   #54  <Method boolean _equals2(int[])>
	//   43   97:ireturn         

		case 8: // '\b'
			if(ai[7] != q[3])
	//*  44   98:aload_1         
	//*  45   99:bipush          7
	//*  46  101:iaload          
	//*  47  102:aload_0         
	//*  48  103:getfield        #27  <Field int[] q>
	//*  49  106:iconst_3        
	//*  50  107:iaload          
	//*  51  108:icmpeq          113
				return false;
	//   52  111:iconst_0        
	//   53  112:ireturn         
			// fall through

		case 7: // '\007'
			if(ai[6] != q[2])
	//*  54  113:aload_1         
	//*  55  114:bipush          6
	//*  56  116:iaload          
	//*  57  117:aload_0         
	//*  58  118:getfield        #27  <Field int[] q>
	//*  59  121:iconst_2        
	//*  60  122:iaload          
	//*  61  123:icmpeq          128
				return false;
	//   62  126:iconst_0        
	//   63  127:ireturn         
			// fall through

		case 6: // '\006'
			if(ai[5] != q[1])
	//*  64  128:aload_1         
	//*  65  129:iconst_5        
	//*  66  130:iaload          
	//*  67  131:aload_0         
	//*  68  132:getfield        #27  <Field int[] q>
	//*  69  135:iconst_1        
	//*  70  136:iaload          
	//*  71  137:icmpeq          142
				return false;
	//   72  140:iconst_0        
	//   73  141:ireturn         
			// fall through

		case 5: // '\005'
			if(ai[4] != q[0])
	//*  74  142:aload_1         
	//*  75  143:iconst_4        
	//*  76  144:iaload          
	//*  77  145:aload_0         
	//*  78  146:getfield        #27  <Field int[] q>
	//*  79  149:iconst_0        
	//*  80  150:iaload          
	//*  81  151:icmpeq          156
				return false;
	//   82  154:iconst_0        
	//   83  155:ireturn         
			// fall through

		case 4: // '\004'
			return true;
	//   84  156:iconst_1        
	//   85  157:ireturn         
		}
	}

	private final int q[];
	private final int q1;
	private final int q2;
	private final int q3;
	private final int q4;
	private final int qlen;
}
