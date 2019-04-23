// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bnf

final class bev
{

	public bev(int i1, int j1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		a = i1;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #38  <Field int a>
		b = j1;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #40  <Field int b>
		c = i1 / 400;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:sipush          400
	//   11   19:idiv            
	//   12   20:putfield        #42  <Field int c>
		d = i1 / 65;
	//   13   23:aload_0         
	//   14   24:iload_1         
	//   15   25:bipush          65
	//   16   27:idiv            
	//   17   28:putfield        #44  <Field int d>
		e = d * 2;
	//   18   31:aload_0         
	//   19   32:aload_0         
	//   20   33:getfield        #44  <Field int d>
	//   21   36:iconst_2        
	//   22   37:imul            
	//   23   38:putfield        #46  <Field int e>
		i1 = e;
	//   24   41:aload_0         
	//   25   42:getfield        #46  <Field int e>
	//   26   45:istore_1        
		f = new short[i1];
	//   27   46:aload_0         
	//   28   47:iload_1         
	//   29   48:newarray        short[]
	//   30   50:putfield        #48  <Field short[] f>
		g = i1;
	//   31   53:aload_0         
	//   32   54:iload_1         
	//   33   55:putfield        #50  <Field int g>
		h = new short[i1 * j1];
	//   34   58:aload_0         
	//   35   59:iload_1         
	//   36   60:iload_2         
	//   37   61:imul            
	//   38   62:newarray        short[]
	//   39   64:putfield        #52  <Field short[] h>
		i = i1;
	//   40   67:aload_0         
	//   41   68:iload_1         
	//   42   69:putfield        #54  <Field int i>
		j = new short[i1 * j1];
	//   43   72:aload_0         
	//   44   73:iload_1         
	//   45   74:iload_2         
	//   46   75:imul            
	//   47   76:newarray        short[]
	//   48   78:putfield        #56  <Field short[] j>
		k = i1;
	//   49   81:aload_0         
	//   50   82:iload_1         
	//   51   83:putfield        #58  <Field int k>
		l = new short[i1 * j1];
	//   52   86:aload_0         
	//   53   87:iload_1         
	//   54   88:iload_2         
	//   55   89:imul            
	//   56   90:newarray        short[]
	//   57   92:putfield        #60  <Field short[] l>
		m = 0;
	//   58   95:aload_0         
	//   59   96:iconst_0        
	//   60   97:putfield        #62  <Field int m>
		n = 0;
	//   61  100:aload_0         
	//   62  101:iconst_0        
	//   63  102:putfield        #64  <Field int n>
		u = 0;
	//   64  105:aload_0         
	//   65  106:iconst_0        
	//   66  107:putfield        #66  <Field int u>
		o = 1.0F;
	//   67  110:aload_0         
	//   68  111:fconst_1        
	//   69  112:putfield        #68  <Field float o>
		p = 1.0F;
	//   70  115:aload_0         
	//   71  116:fconst_1        
	//   72  117:putfield        #70  <Field float p>
	//   73  120:return          
	}

	private final int a(short aword0[], int i1, int j1, int k1)
	{
		int i4 = i1 * b;
	//    0    0:iload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field int b>
	//    3    5:imul            
	//    4    6:istore          13
		int k2 = 1;
	//    5    8:iconst_1        
	//    6    9:istore          8
		int j2 = 0;
	//    7   11:iconst_0        
	//    8   12:istore          7
		int i2 = 0;
	//    9   14:iconst_0        
	//   10   15:istore          6
		int l1;
		int k3;
		for(l1 = 255; j1 <= k1; l1 = k3)
	//*  11   17:sipush          255
	//*  12   20:istore          5
	//*  13   22:iload_3         
	//*  14   23:iload           4
	//*  15   25:icmpgt          170
		{
			int l2 = 0;
	//   16   28:iconst_0        
	//   17   29:istore          9
			i1 = 0;
	//   18   31:iconst_0        
	//   19   32:istore_2        
			for(; l2 < j1; l2++)
	//*  20   33:iload           9
	//*  21   35:iload_3         
	//*  22   36:icmpge          97
			{
				int i3 = ((int) (aword0[i4 + l2]));
	//   23   39:aload_1         
	//   24   40:iload           13
	//   25   42:iload           9
	//   26   44:iadd            
	//   27   45:saload          
	//   28   46:istore          10
				short word0 = aword0[i4 + j1 + l2];
	//   29   48:aload_1         
	//   30   49:iload           13
	//   31   51:iload_3         
	//   32   52:iadd            
	//   33   53:iload           9
	//   34   55:iadd            
	//   35   56:saload          
	//   36   57:istore          11
				if(i3 >= word0)
	//*  37   59:iload           10
	//*  38   61:iload           11
	//*  39   63:icmplt          76
					i3 -= ((int) (word0));
	//   40   66:iload           10
	//   41   68:iload           11
	//   42   70:isub            
	//   43   71:istore          10
				else
	//*  44   73:goto            83
					i3 = word0 - i3;
	//   45   76:iload           11
	//   46   78:iload           10
	//   47   80:isub            
	//   48   81:istore          10
				i1 += i3;
	//   49   83:iload_2         
	//   50   84:iload           10
	//   51   86:iadd            
	//   52   87:istore_2        
			}

	//   53   88:iload           9
	//   54   90:iconst_1        
	//   55   91:iadd            
	//   56   92:istore          9
	//*  57   94:goto            33
			int j3 = k2;
	//   58   97:iload           8
	//   59   99:istore          10
			l2 = j2;
	//   60  101:iload           7
	//   61  103:istore          9
			if(i1 * j2 < k2 * j1)
	//*  62  105:iload_2         
	//*  63  106:iload           7
	//*  64  108:imul            
	//*  65  109:iload           8
	//*  66  111:iload_3         
	//*  67  112:imul            
	//*  68  113:icmpge          122
			{
				l2 = j1;
	//   69  116:iload_3         
	//   70  117:istore          9
				j3 = i1;
	//   71  119:iload_2         
	//   72  120:istore          10
			}
			int l3 = i2;
	//   73  122:iload           6
	//   74  124:istore          12
			k3 = l1;
	//   75  126:iload           5
	//   76  128:istore          11
			if(i1 * l1 > i2 * j1)
	//*  77  130:iload_2         
	//*  78  131:iload           5
	//*  79  133:imul            
	//*  80  134:iload           6
	//*  81  136:iload_3         
	//*  82  137:imul            
	//*  83  138:icmple          147
			{
				k3 = j1;
	//   84  141:iload_3         
	//   85  142:istore          11
				l3 = i1;
	//   86  144:iload_2         
	//   87  145:istore          12
			}
			j1++;
	//   88  147:iload_3         
	//   89  148:iconst_1        
	//   90  149:iadd            
	//   91  150:istore_3        
			k2 = j3;
	//   92  151:iload           10
	//   93  153:istore          8
			j2 = l2;
	//   94  155:iload           9
	//   95  157:istore          7
			i2 = l3;
	//   96  159:iload           12
	//   97  161:istore          6
		}

	//   98  163:iload           11
	//   99  165:istore          5
	//* 100  167:goto            22
		w = k2 / j2;
	//  101  170:aload_0         
	//  102  171:iload           8
	//  103  173:iload           7
	//  104  175:idiv            
	//  105  176:putfield        #74  <Field int w>
		x = i2 / l1;
	//  106  179:aload_0         
	//  107  180:iload           6
	//  108  182:iload           5
	//  109  184:idiv            
	//  110  185:putfield        #76  <Field int x>
		return j2;
	//  111  188:iload           7
	//  112  190:ireturn         
	}

	private final void a(int i1)
	{
		int j1 = r;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field int r>
	//    2    4:istore_2        
		int k1 = i;
	//    3    5:aload_0         
	//    4    6:getfield        #54  <Field int i>
	//    5    9:istore_3        
		if(j1 + i1 > k1)
	//*   6   10:iload_2         
	//*   7   11:iload_1         
	//*   8   12:iadd            
	//*   9   13:iload_3         
	//*  10   14:icmple          48
		{
			i = k1 + (k1 / 2 + i1);
	//   11   17:aload_0         
	//   12   18:iload_3         
	//   13   19:iload_3         
	//   14   20:iconst_2        
	//   15   21:idiv            
	//   16   22:iload_1         
	//   17   23:iadd            
	//   18   24:iadd            
	//   19   25:putfield        #54  <Field int i>
			j = Arrays.copyOf(j, i * b);
	//   20   28:aload_0         
	//   21   29:aload_0         
	//   22   30:getfield        #56  <Field short[] j>
	//   23   33:aload_0         
	//   24   34:getfield        #54  <Field int i>
	//   25   37:aload_0         
	//   26   38:getfield        #40  <Field int b>
	//   27   41:imul            
	//   28   42:invokestatic    #85  <Method short[] Arrays.copyOf(short[], int)>
	//   29   45:putfield        #56  <Field short[] j>
		}
	//   30   48:return          
	}

	private static void a(int i1, int j1, short aword0[], int k1, short aword1[], int l1, short aword2[], int i2)
	{
		for(int j2 = 0; j2 < j1; j2++)
	//*   0    0:iconst_0        
	//*   1    1:istore          8
	//*   2    3:iload           8
	//*   3    5:iload_1         
	//*   4    6:icmpge          106
		{
			int l2 = l1 * j1 + j2;
	//    5    9:iload           5
	//    6   11:iload_1         
	//    7   12:imul            
	//    8   13:iload           8
	//    9   15:iadd            
	//   10   16:istore          10
			int k2 = i2 * j1 + j2;
	//   11   18:iload           7
	//   12   20:iload_1         
	//   13   21:imul            
	//   14   22:iload           8
	//   15   24:iadd            
	//   16   25:istore          9
			int j3 = k1 * j1 + j2;
	//   17   27:iload_3         
	//   18   28:iload_1         
	//   19   29:imul            
	//   20   30:iload           8
	//   21   32:iadd            
	//   22   33:istore          12
			for(int i3 = 0; i3 < i1; i3++)
	//*  23   35:iconst_0        
	//*  24   36:istore          11
	//*  25   38:iload           11
	//*  26   40:iload_0         
	//*  27   41:icmpge          97
			{
				aword0[j3] = (short)((aword1[l2] * (i1 - i3) + aword2[k2] * i3) / i1);
	//   28   44:aload_2         
	//   29   45:iload           12
	//   30   47:aload           4
	//   31   49:iload           10
	//   32   51:saload          
	//   33   52:iload_0         
	//   34   53:iload           11
	//   35   55:isub            
	//   36   56:imul            
	//   37   57:aload           6
	//   38   59:iload           9
	//   39   61:saload          
	//   40   62:iload           11
	//   41   64:imul            
	//   42   65:iadd            
	//   43   66:iload_0         
	//   44   67:idiv            
	//   45   68:int2short       
	//   46   69:sastore         
				j3 += j1;
	//   47   70:iload           12
	//   48   72:iload_1         
	//   49   73:iadd            
	//   50   74:istore          12
				l2 += j1;
	//   51   76:iload           10
	//   52   78:iload_1         
	//   53   79:iadd            
	//   54   80:istore          10
				k2 += j1;
	//   55   82:iload           9
	//   56   84:iload_1         
	//   57   85:iadd            
	//   58   86:istore          9
			}

	//   59   88:iload           11
	//   60   90:iconst_1        
	//   61   91:iadd            
	//   62   92:istore          11
		}

	//   63   94:goto            38
	//   64   97:iload           8
	//   65   99:iconst_1        
	//   66  100:iadd            
	//   67  101:istore          8
	//*  68  103:goto            3
	//   69  106:return          
	}

	private final void a(short aword0[], int i1, int j1)
	{
		a(j1);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:invokespecial   #89  <Method void a(int)>
		int k1 = b;
	//    3    5:aload_0         
	//    4    6:getfield        #40  <Field int b>
	//    5    9:istore          4
		System.arraycopy(((Object) (aword0)), i1 * k1, ((Object) (j)), r * k1, k1 * j1);
	//    6   11:aload_1         
	//    7   12:iload_2         
	//    8   13:iload           4
	//    9   15:imul            
	//   10   16:aload_0         
	//   11   17:getfield        #56  <Field short[] j>
	//   12   20:aload_0         
	//   13   21:getfield        #79  <Field int r>
	//   14   24:iload           4
	//   15   26:imul            
	//   16   27:iload           4
	//   17   29:iload_3         
	//   18   30:imul            
	//   19   31:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
		r = r + j1;
	//   20   34:aload_0         
	//   21   35:aload_0         
	//   22   36:getfield        #79  <Field int r>
	//   23   39:iload_3         
	//   24   40:iadd            
	//   25   41:putfield        #79  <Field int r>
	//   26   44:return          
	}

	private final void b(int i1)
	{
		int j1 = q;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field int q>
	//    2    4:istore_2        
		int k1 = g;
	//    3    5:aload_0         
	//    4    6:getfield        #50  <Field int g>
	//    5    9:istore_3        
		if(j1 + i1 > k1)
	//*   6   10:iload_2         
	//*   7   11:iload_1         
	//*   8   12:iadd            
	//*   9   13:iload_3         
	//*  10   14:icmple          48
		{
			g = k1 + (k1 / 2 + i1);
	//   11   17:aload_0         
	//   12   18:iload_3         
	//   13   19:iload_3         
	//   14   20:iconst_2        
	//   15   21:idiv            
	//   16   22:iload_1         
	//   17   23:iadd            
	//   18   24:iadd            
	//   19   25:putfield        #50  <Field int g>
			h = Arrays.copyOf(h, g * b);
	//   20   28:aload_0         
	//   21   29:aload_0         
	//   22   30:getfield        #52  <Field short[] h>
	//   23   33:aload_0         
	//   24   34:getfield        #50  <Field int g>
	//   25   37:aload_0         
	//   26   38:getfield        #40  <Field int b>
	//   27   41:imul            
	//   28   42:invokestatic    #85  <Method short[] Arrays.copyOf(short[], int)>
	//   29   45:putfield        #52  <Field short[] h>
		}
	//   30   48:return          
	}

	private final void b(short aword0[], int i1, int j1)
	{
		int i2 = e / j1;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int e>
	//    2    4:iload_3         
	//    3    5:idiv            
	//    4    6:istore          6
		int j2 = b;
	//    5    8:aload_0         
	//    6    9:getfield        #40  <Field int b>
	//    7   12:istore          7
		int k2 = j1 * j2;
	//    8   14:iload_3         
	//    9   15:iload           7
	//   10   17:imul            
	//   11   18:istore          8
		for(j1 = 0; j1 < i2; j1++)
	//*  12   20:iconst_0        
	//*  13   21:istore_3        
	//*  14   22:iload_3         
	//*  15   23:iload           6
	//*  16   25:icmpge          92
		{
			int k1 = 0;
	//   17   28:iconst_0        
	//   18   29:istore          4
			int l1 = 0;
	//   19   31:iconst_0        
	//   20   32:istore          5
			for(; k1 < k2; k1++)
	//*  21   34:iload           4
	//*  22   36:iload           8
	//*  23   38:icmpge          69
				l1 += ((int) (aword0[j1 * k2 + i1 * j2 + k1]));
	//   24   41:iload           5
	//   25   43:aload_1         
	//   26   44:iload_3         
	//   27   45:iload           8
	//   28   47:imul            
	//   29   48:iload_2         
	//   30   49:iload           7
	//   31   51:imul            
	//   32   52:iadd            
	//   33   53:iload           4
	//   34   55:iadd            
	//   35   56:saload          
	//   36   57:iadd            
	//   37   58:istore          5

	//   38   60:iload           4
	//   39   62:iconst_1        
	//   40   63:iadd            
	//   41   64:istore          4
	//*  42   66:goto            34
			k1 = l1 / k2;
	//   43   69:iload           5
	//   44   71:iload           8
	//   45   73:idiv            
	//   46   74:istore          4
			f[j1] = (short)k1;
	//   47   76:aload_0         
	//   48   77:getfield        #48  <Field short[] f>
	//   49   80:iload_3         
	//   50   81:iload           4
	//   51   83:int2short       
	//   52   84:sastore         
		}

	//   53   85:iload_3         
	//   54   86:iconst_1        
	//   55   87:iadd            
	//   56   88:istore_3        
	//*  57   89:goto            22
	//   58   92:return          
	}

	private final void c()
	{
		int i5 = r;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field int r>
	//    2    4:istore          9
		float f1 = o / p;
	//    3    6:aload_0         
	//    4    7:getfield        #68  <Field float o>
	//    5   10:aload_0         
	//    6   11:getfield        #70  <Field float p>
	//    7   14:fdiv            
	//    8   15:fstore_3        
		double d1 = f1;
	//    9   16:fload_3         
	//   10   17:f2d             
	//   11   18:dstore_1        
		if(d1 <= 1.0000100000000001D && d1 >= 0.99999000000000005D)
	//*  12   19:dload_1         
	//*  13   20:ldc2w           #98  <Double 1.0000100000000001D>
	//*  14   23:dcmpl           
	//*  15   24:ifgt            59
	//*  16   27:dload_1         
	//*  17   28:ldc2w           #100 <Double 0.99999000000000005D>
	//*  18   31:dcmpg           
	//*  19   32:ifge            38
	//*  20   35:goto            59
		{
			a(h, 0, q);
	//   21   38:aload_0         
	//   22   39:aload_0         
	//   23   40:getfield        #52  <Field short[] h>
	//   24   43:iconst_0        
	//   25   44:aload_0         
	//   26   45:getfield        #97  <Field int q>
	//   27   48:invokespecial   #103 <Method void a(short[], int, int)>
			q = 0;
	//   28   51:aload_0         
	//   29   52:iconst_0        
	//   30   53:putfield        #97  <Field int q>
		} else
	//*  31   56:goto            788
		{
			int k5 = q;
	//   32   59:aload_0         
	//   33   60:getfield        #97  <Field int q>
	//   34   63:istore          10
			if(k5 >= e)
	//*  35   65:iload           10
	//*  36   67:aload_0         
	//*  37   68:getfield        #46  <Field int e>
	//*  38   71:icmplt          788
			{
				int k2 = 0;
	//   39   74:iconst_0        
	//   40   75:istore          6
				do
				{
					int i1 = t;
	//   41   77:aload_0         
	//   42   78:getfield        #105 <Field int t>
	//   43   81:istore          4
					if(i1 > 0)
	//*  44   83:iload           4
	//*  45   85:ifle            132
					{
						i1 = Math.min(e, i1);
	//   46   88:aload_0         
	//   47   89:getfield        #46  <Field int e>
	//   48   92:iload           4
	//   49   94:invokestatic    #111 <Method int Math.min(int, int)>
	//   50   97:istore          4
						a(h, k2, i1);
	//   51   99:aload_0         
	//   52  100:aload_0         
	//   53  101:getfield        #52  <Field short[] h>
	//   54  104:iload           6
	//   55  106:iload           4
	//   56  108:invokespecial   #103 <Method void a(short[], int, int)>
						t = t - i1;
	//   57  111:aload_0         
	//   58  112:aload_0         
	//   59  113:getfield        #105 <Field int t>
	//   60  116:iload           4
	//   61  118:isub            
	//   62  119:putfield        #105 <Field int t>
						i1 = k2 + i1;
	//   63  122:iload           6
	//   64  124:iload           4
	//   65  126:iadd            
	//   66  127:istore          4
					} else
	//*  67  129:goto            721
					{
						short aword0[] = h;
	//   68  132:aload_0         
	//   69  133:getfield        #52  <Field short[] h>
	//   70  136:astore          16
						i1 = a;
	//   71  138:aload_0         
	//   72  139:getfield        #38  <Field int a>
	//   73  142:istore          4
						if(i1 > 4000)
	//*  74  144:iload           4
	//*  75  146:sipush          4000
	//*  76  149:icmple          163
							i1 /= 4000;
	//   77  152:iload           4
	//   78  154:sipush          4000
	//   79  157:idiv            
	//   80  158:istore          4
						else
	//*  81  160:goto            166
							i1 = 1;
	//   82  163:iconst_1        
	//   83  164:istore          4
						if(b == 1 && i1 == 1)
	//*  84  166:aload_0         
	//*  85  167:getfield        #40  <Field int b>
	//*  86  170:iconst_1        
	//*  87  171:icmpne          201
	//*  88  174:iload           4
	//*  89  176:iconst_1        
	//*  90  177:icmpne          201
						{
							i1 = a(aword0, k2, c, d);
	//   91  180:aload_0         
	//   92  181:aload           16
	//   93  183:iload           6
	//   94  185:aload_0         
	//   95  186:getfield        #42  <Field int c>
	//   96  189:aload_0         
	//   97  190:getfield        #44  <Field int d>
	//   98  193:invokespecial   #113 <Method int a(short[], int, int, int)>
	//   99  196:istore          4
						} else
	//* 100  198:goto            366
						{
							b(aword0, k2, i1);
	//  101  201:aload_0         
	//  102  202:aload           16
	//  103  204:iload           6
	//  104  206:iload           4
	//  105  208:invokespecial   #115 <Method void b(short[], int, int)>
							int k1 = a(f, 0, c / i1, d / i1);
	//  106  211:aload_0         
	//  107  212:aload_0         
	//  108  213:getfield        #48  <Field short[] f>
	//  109  216:iconst_0        
	//  110  217:aload_0         
	//  111  218:getfield        #42  <Field int c>
	//  112  221:iload           4
	//  113  223:idiv            
	//  114  224:aload_0         
	//  115  225:getfield        #44  <Field int d>
	//  116  228:iload           4
	//  117  230:idiv            
	//  118  231:invokespecial   #113 <Method int a(short[], int, int, int)>
	//  119  234:istore          5
							if(i1 != 1)
	//* 120  236:iload           4
	//* 121  238:iconst_1        
	//* 122  239:icmpeq          362
							{
								k1 *= i1;
	//  123  242:iload           5
	//  124  244:iload           4
	//  125  246:imul            
	//  126  247:istore          5
								int i3 = i1 << 2;
	//  127  249:iload           4
	//  128  251:iconst_2        
	//  129  252:ishl            
	//  130  253:istore          7
								i1 = k1 - i3;
	//  131  255:iload           5
	//  132  257:iload           7
	//  133  259:isub            
	//  134  260:istore          4
								i3 = k1 + i3;
	//  135  262:iload           5
	//  136  264:iload           7
	//  137  266:iadd            
	//  138  267:istore          7
								k1 = c;
	//  139  269:aload_0         
	//  140  270:getfield        #42  <Field int c>
	//  141  273:istore          5
								if(i1 < k1)
	//* 142  275:iload           4
	//* 143  277:iload           5
	//* 144  279:icmpge          289
									i1 = k1;
	//  145  282:iload           5
	//  146  284:istore          4
	//* 147  286:goto            289
								int i4 = d;
	//  148  289:aload_0         
	//  149  290:getfield        #44  <Field int d>
	//  150  293:istore          8
								k1 = i3;
	//  151  295:iload           7
	//  152  297:istore          5
								if(i3 > i4)
	//* 153  299:iload           7
	//* 154  301:iload           8
	//* 155  303:icmple          310
									k1 = i4;
	//  156  306:iload           8
	//  157  308:istore          5
								if(b == 1)
	//* 158  310:aload_0         
	//* 159  311:getfield        #40  <Field int b>
	//* 160  314:iconst_1        
	//* 161  315:icmpne          335
								{
									i1 = a(aword0, k2, i1, k1);
	//  162  318:aload_0         
	//  163  319:aload           16
	//  164  321:iload           6
	//  165  323:iload           4
	//  166  325:iload           5
	//  167  327:invokespecial   #113 <Method int a(short[], int, int, int)>
	//  168  330:istore          4
								} else
	//* 169  332:goto            366
								{
									b(aword0, k2, 1);
	//  170  335:aload_0         
	//  171  336:aload           16
	//  172  338:iload           6
	//  173  340:iconst_1        
	//  174  341:invokespecial   #115 <Method void b(short[], int, int)>
									i1 = a(f, 0, i1, k1);
	//  175  344:aload_0         
	//  176  345:aload_0         
	//  177  346:getfield        #48  <Field short[] f>
	//  178  349:iconst_0        
	//  179  350:iload           4
	//  180  352:iload           5
	//  181  354:invokespecial   #113 <Method int a(short[], int, int, int)>
	//  182  357:istore          4
								}
							} else
	//* 183  359:goto            366
							{
								i1 = k1;
	//  184  362:iload           5
	//  185  364:istore          4
							}
						}
						int l1 = w;
	//  186  366:aload_0         
	//  187  367:getfield        #74  <Field int w>
	//  188  370:istore          5
						int j3 = x;
	//  189  372:aload_0         
	//  190  373:getfield        #76  <Field int x>
	//  191  376:istore          7
						if(l1 != 0 && u != 0)
	//* 192  378:iload           5
	//* 193  380:ifeq            433
	//* 194  383:aload_0         
	//* 195  384:getfield        #66  <Field int u>
	//* 196  387:ifne            393
	//* 197  390:goto            433
						{
							if(j3 > l1 * 3)
	//* 198  393:iload           7
	//* 199  395:iload           5
	//* 200  397:iconst_3        
	//* 201  398:imul            
	//* 202  399:icmple          408
								l1 = 0;
	//  203  402:iconst_0        
	//  204  403:istore          5
							else
	//* 205  405:goto            436
							if(l1 << 1 <= v * 3)
	//* 206  408:iload           5
	//* 207  410:iconst_1        
	//* 208  411:ishl            
	//* 209  412:aload_0         
	//* 210  413:getfield        #117 <Field int v>
	//* 211  416:iconst_3        
	//* 212  417:imul            
	//* 213  418:icmpgt          427
								l1 = 0;
	//  214  421:iconst_0        
	//  215  422:istore          5
							else
	//* 216  424:goto            436
								l1 = 1;
	//  217  427:iconst_1        
	//  218  428:istore          5
						} else
	//* 219  430:goto            436
						{
							l1 = 0;
	//  220  433:iconst_0        
	//  221  434:istore          5
						}
						if(l1 != 0)
	//* 222  436:iload           5
	//* 223  438:ifeq            450
							l1 = u;
	//  224  441:aload_0         
	//  225  442:getfield        #66  <Field int u>
	//  226  445:istore          5
						else
	//* 227  447:goto            454
							l1 = i1;
	//  228  450:iload           4
	//  229  452:istore          5
						v = w;
	//  230  454:aload_0         
	//  231  455:aload_0         
	//  232  456:getfield        #74  <Field int w>
	//  233  459:putfield        #117 <Field int v>
						u = i1;
	//  234  462:aload_0         
	//  235  463:iload           4
	//  236  465:putfield        #66  <Field int u>
						if(d1 > 1.0D)
	//* 237  468:dload_1         
	//* 238  469:dconst_1        
	//* 239  470:dcmpl           
	//* 240  471:ifle            577
						{
							short aword1[] = h;
	//  241  474:aload_0         
	//  242  475:getfield        #52  <Field short[] h>
	//  243  478:astore          16
							if(f1 >= 2.0F)
	//* 244  480:fload_3         
	//* 245  481:fconst_2        
	//* 246  482:fcmpl           
	//* 247  483:iflt            499
							{
								i1 = (int)((float)l1 / (f1 - 1.0F));
	//  248  486:iload           5
	//  249  488:i2f             
	//  250  489:fload_3         
	//  251  490:fconst_1        
	//  252  491:fsub            
	//  253  492:fdiv            
	//  254  493:f2i             
	//  255  494:istore          4
							} else
	//* 256  496:goto            519
							{
								t = (int)(((float)l1 * (2.0F - f1)) / (f1 - 1.0F));
	//  257  499:aload_0         
	//  258  500:iload           5
	//  259  502:i2f             
	//  260  503:fconst_2        
	//  261  504:fload_3         
	//  262  505:fsub            
	//  263  506:fmul            
	//  264  507:fload_3         
	//  265  508:fconst_1        
	//  266  509:fsub            
	//  267  510:fdiv            
	//  268  511:f2i             
	//  269  512:putfield        #105 <Field int t>
								i1 = l1;
	//  270  515:iload           5
	//  271  517:istore          4
							}
							a(i1);
	//  272  519:aload_0         
	//  273  520:iload           4
	//  274  522:invokespecial   #89  <Method void a(int)>
							a(i1, b, j, r, aword1, k2, aword1, k2 + l1);
	//  275  525:iload           4
	//  276  527:aload_0         
	//  277  528:getfield        #40  <Field int b>
	//  278  531:aload_0         
	//  279  532:getfield        #56  <Field short[] j>
	//  280  535:aload_0         
	//  281  536:getfield        #79  <Field int r>
	//  282  539:aload           16
	//  283  541:iload           6
	//  284  543:aload           16
	//  285  545:iload           6
	//  286  547:iload           5
	//  287  549:iadd            
	//  288  550:invokestatic    #119 <Method void a(int, int, short[], int, short[], int, short[], int)>
							r = r + i1;
	//  289  553:aload_0         
	//  290  554:aload_0         
	//  291  555:getfield        #79  <Field int r>
	//  292  558:iload           4
	//  293  560:iadd            
	//  294  561:putfield        #79  <Field int r>
							i1 = k2 + (l1 + i1);
	//  295  564:iload           6
	//  296  566:iload           5
	//  297  568:iload           4
	//  298  570:iadd            
	//  299  571:iadd            
	//  300  572:istore          4
						} else
	//* 301  574:goto            721
						{
							short aword2[] = h;
	//  302  577:aload_0         
	//  303  578:getfield        #52  <Field short[] h>
	//  304  581:astore          16
							if(f1 < 0.5F)
	//* 305  583:fload_3         
	//* 306  584:ldc1            #120 <Float 0.5F>
	//* 307  586:fcmpg           
	//* 308  587:ifge            605
							{
								i1 = (int)(((float)l1 * f1) / (1.0F - f1));
	//  309  590:iload           5
	//  310  592:i2f             
	//  311  593:fload_3         
	//  312  594:fmul            
	//  313  595:fconst_1        
	//  314  596:fload_3         
	//  315  597:fsub            
	//  316  598:fdiv            
	//  317  599:f2i             
	//  318  600:istore          4
							} else
	//* 319  602:goto            627
							{
								t = (int)(((float)l1 * (2.0F * f1 - 1.0F)) / (1.0F - f1));
	//  320  605:aload_0         
	//  321  606:iload           5
	//  322  608:i2f             
	//  323  609:fconst_2        
	//  324  610:fload_3         
	//  325  611:fmul            
	//  326  612:fconst_1        
	//  327  613:fsub            
	//  328  614:fmul            
	//  329  615:fconst_1        
	//  330  616:fload_3         
	//  331  617:fsub            
	//  332  618:fdiv            
	//  333  619:f2i             
	//  334  620:putfield        #105 <Field int t>
								i1 = l1;
	//  335  623:iload           5
	//  336  625:istore          4
							}
							int k3 = l1 + i1;
	//  337  627:iload           5
	//  338  629:iload           4
	//  339  631:iadd            
	//  340  632:istore          7
							a(k3);
	//  341  634:aload_0         
	//  342  635:iload           7
	//  343  637:invokespecial   #89  <Method void a(int)>
							int j4 = b;
	//  344  640:aload_0         
	//  345  641:getfield        #40  <Field int b>
	//  346  644:istore          8
							System.arraycopy(((Object) (aword2)), k2 * j4, ((Object) (j)), r * j4, j4 * l1);
	//  347  646:aload           16
	//  348  648:iload           6
	//  349  650:iload           8
	//  350  652:imul            
	//  351  653:aload_0         
	//  352  654:getfield        #56  <Field short[] j>
	//  353  657:aload_0         
	//  354  658:getfield        #79  <Field int r>
	//  355  661:iload           8
	//  356  663:imul            
	//  357  664:iload           8
	//  358  666:iload           5
	//  359  668:imul            
	//  360  669:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
							a(i1, b, j, r + l1, aword2, l1 + k2, aword2, k2);
	//  361  672:iload           4
	//  362  674:aload_0         
	//  363  675:getfield        #40  <Field int b>
	//  364  678:aload_0         
	//  365  679:getfield        #56  <Field short[] j>
	//  366  682:aload_0         
	//  367  683:getfield        #79  <Field int r>
	//  368  686:iload           5
	//  369  688:iadd            
	//  370  689:aload           16
	//  371  691:iload           5
	//  372  693:iload           6
	//  373  695:iadd            
	//  374  696:aload           16
	//  375  698:iload           6
	//  376  700:invokestatic    #119 <Method void a(int, int, short[], int, short[], int, short[], int)>
							r = r + k3;
	//  377  703:aload_0         
	//  378  704:aload_0         
	//  379  705:getfield        #79  <Field int r>
	//  380  708:iload           7
	//  381  710:iadd            
	//  382  711:putfield        #79  <Field int r>
							i1 = k2 + i1;
	//  383  714:iload           6
	//  384  716:iload           4
	//  385  718:iadd            
	//  386  719:istore          4
						}
					}
					if(e + i1 > k5)
	//* 387  721:aload_0         
	//* 388  722:getfield        #46  <Field int e>
	//* 389  725:iload           4
	//* 390  727:iadd            
	//* 391  728:iload           10
	//* 392  730:icmple          781
					{
						int i2 = q - i1;
	//  393  733:aload_0         
	//  394  734:getfield        #97  <Field int q>
	//  395  737:iload           4
	//  396  739:isub            
	//  397  740:istore          5
						short aword3[] = h;
	//  398  742:aload_0         
	//  399  743:getfield        #52  <Field short[] h>
	//  400  746:astore          16
						k2 = b;
	//  401  748:aload_0         
	//  402  749:getfield        #40  <Field int b>
	//  403  752:istore          6
						System.arraycopy(((Object) (aword3)), i1 * k2, ((Object) (aword3)), 0, k2 * i2);
	//  404  754:aload           16
	//  405  756:iload           4
	//  406  758:iload           6
	//  407  760:imul            
	//  408  761:aload           16
	//  409  763:iconst_0        
	//  410  764:iload           6
	//  411  766:iload           5
	//  412  768:imul            
	//  413  769:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
						q = i2;
	//  414  772:aload_0         
	//  415  773:iload           5
	//  416  775:putfield        #97  <Field int q>
						break;
	//  417  778:goto            788
					}
					k2 = i1;
	//  418  781:iload           4
	//  419  783:istore          6
				} while(true);
	//  420  785:goto            77
			}
		}
		f1 = p;
	//  421  788:aload_0         
	//  422  789:getfield        #70  <Field float p>
	//  423  792:fstore_3        
		if(f1 != 1.0F && r != i5)
	//* 424  793:fload_3         
	//* 425  794:fconst_1        
	//* 426  795:fcmpl           
	//* 427  796:ifeq            1302
	//* 428  799:aload_0         
	//* 429  800:getfield        #79  <Field int r>
	//* 430  803:iload           9
	//* 431  805:icmpeq          1302
		{
			int j1 = a;
	//  432  808:aload_0         
	//  433  809:getfield        #38  <Field int a>
	//  434  812:istore          4
			int j2 = (int)((float)j1 / f1);
	//  435  814:iload           4
	//  436  816:i2f             
	//  437  817:fload_3         
	//  438  818:fdiv            
	//  439  819:f2i             
	//  440  820:istore          5
			do
			{
				if(j2 <= 16384 && j1 <= 16384)
	//* 441  822:iload           5
	//* 442  824:sipush          16384
	//* 443  827:icmpgt          1287
	//* 444  830:iload           4
	//* 445  832:sipush          16384
	//* 446  835:icmple          841
	//* 447  838:goto            1287
				{
					int l2 = r - i5;
	//  448  841:aload_0         
	//  449  842:getfield        #79  <Field int r>
	//  450  845:iload           9
	//  451  847:isub            
	//  452  848:istore          6
					int l3 = s;
	//  453  850:aload_0         
	//  454  851:getfield        #122 <Field int s>
	//  455  854:istore          7
					int k4 = k;
	//  456  856:aload_0         
	//  457  857:getfield        #58  <Field int k>
	//  458  860:istore          8
					if(l3 + l2 > k4)
	//* 459  862:iload           7
	//* 460  864:iload           6
	//* 461  866:iadd            
	//* 462  867:iload           8
	//* 463  869:icmple          906
					{
						k = k4 + (k4 / 2 + l2);
	//  464  872:aload_0         
	//  465  873:iload           8
	//  466  875:iload           8
	//  467  877:iconst_2        
	//  468  878:idiv            
	//  469  879:iload           6
	//  470  881:iadd            
	//  471  882:iadd            
	//  472  883:putfield        #58  <Field int k>
						l = Arrays.copyOf(l, k * b);
	//  473  886:aload_0         
	//  474  887:aload_0         
	//  475  888:getfield        #60  <Field short[] l>
	//  476  891:aload_0         
	//  477  892:getfield        #58  <Field int k>
	//  478  895:aload_0         
	//  479  896:getfield        #40  <Field int b>
	//  480  899:imul            
	//  481  900:invokestatic    #85  <Method short[] Arrays.copyOf(short[], int)>
	//  482  903:putfield        #60  <Field short[] l>
					}
					short aword4[] = j;
	//  483  906:aload_0         
	//  484  907:getfield        #56  <Field short[] j>
	//  485  910:astore          16
					l3 = b;
	//  486  912:aload_0         
	//  487  913:getfield        #40  <Field int b>
	//  488  916:istore          7
					System.arraycopy(((Object) (aword4)), i5 * l3, ((Object) (l)), s * l3, l3 * l2);
	//  489  918:aload           16
	//  490  920:iload           9
	//  491  922:iload           7
	//  492  924:imul            
	//  493  925:aload_0         
	//  494  926:getfield        #60  <Field short[] l>
	//  495  929:aload_0         
	//  496  930:getfield        #122 <Field int s>
	//  497  933:iload           7
	//  498  935:imul            
	//  499  936:iload           7
	//  500  938:iload           6
	//  501  940:imul            
	//  502  941:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
					r = i5;
	//  503  944:aload_0         
	//  504  945:iload           9
	//  505  947:putfield        #79  <Field int r>
					s = s + l2;
	//  506  950:aload_0         
	//  507  951:aload_0         
	//  508  952:getfield        #122 <Field int s>
	//  509  955:iload           6
	//  510  957:iadd            
	//  511  958:putfield        #122 <Field int s>
					l2 = 0;
	//  512  961:iconst_0        
	//  513  962:istore          6
					do
					{
						l3 = s;
	//  514  964:aload_0         
	//  515  965:getfield        #122 <Field int s>
	//  516  968:istore          7
						if(l2 >= l3 - 1)
							break;
	//  517  970:iload           6
	//  518  972:iload           7
	//  519  974:iconst_1        
	//  520  975:isub            
	//  521  976:icmpge          1231
						int l4;
						do
						{
							l3 = m;
	//  522  979:aload_0         
	//  523  980:getfield        #62  <Field int m>
	//  524  983:istore          7
							l4 = n;
	//  525  985:aload_0         
	//  526  986:getfield        #64  <Field int n>
	//  527  989:istore          8
							if((l3 + 1) * j2 <= l4 * j1)
								break;
	//  528  991:iload           7
	//  529  993:iconst_1        
	//  530  994:iadd            
	//  531  995:iload           5
	//  532  997:imul            
	//  533  998:iload           8
	//  534 1000:iload           4
	//  535 1002:imul            
	//  536 1003:icmple          1174
							a(1);
	//  537 1006:aload_0         
	//  538 1007:iconst_1        
	//  539 1008:invokespecial   #89  <Method void a(int)>
							l3 = 0;
	//  540 1011:iconst_0        
	//  541 1012:istore          7
							do
							{
								l4 = b;
	//  542 1014:aload_0         
	//  543 1015:getfield        #40  <Field int b>
	//  544 1018:istore          8
								if(l3 >= l4)
									break;
	//  545 1020:iload           7
	//  546 1022:iload           8
	//  547 1024:icmpge          1151
								short aword5[] = j;
	//  548 1027:aload_0         
	//  549 1028:getfield        #56  <Field short[] j>
	//  550 1031:astore          16
								int j5 = r;
	//  551 1033:aload_0         
	//  552 1034:getfield        #79  <Field int r>
	//  553 1037:istore          9
								short aword7[] = l;
	//  554 1039:aload_0         
	//  555 1040:getfield        #60  <Field short[] l>
	//  556 1043:astore          17
								int l5 = l2 * l4 + l3;
	//  557 1045:iload           6
	//  558 1047:iload           8
	//  559 1049:imul            
	//  560 1050:iload           7
	//  561 1052:iadd            
	//  562 1053:istore          11
								short word0 = aword7[l5];
	//  563 1055:aload           17
	//  564 1057:iload           11
	//  565 1059:saload          
	//  566 1060:istore          10
								l5 = ((int) (aword7[l5 + l4]));
	//  567 1062:aload           17
	//  568 1064:iload           11
	//  569 1066:iload           8
	//  570 1068:iadd            
	//  571 1069:saload          
	//  572 1070:istore          11
								int k6 = n;
	//  573 1072:aload_0         
	//  574 1073:getfield        #64  <Field int n>
	//  575 1076:istore          14
								int i6 = m;
	//  576 1078:aload_0         
	//  577 1079:getfield        #62  <Field int m>
	//  578 1082:istore          12
								int j6 = (i6 + 1) * j2;
	//  579 1084:iload           12
	//  580 1086:iconst_1        
	//  581 1087:iadd            
	//  582 1088:iload           5
	//  583 1090:imul            
	//  584 1091:istore          13
								k6 = j6 - k6 * j1;
	//  585 1093:iload           13
	//  586 1095:iload           14
	//  587 1097:iload           4
	//  588 1099:imul            
	//  589 1100:isub            
	//  590 1101:istore          14
								i6 = j6 - i6 * j2;
	//  591 1103:iload           13
	//  592 1105:iload           12
	//  593 1107:iload           5
	//  594 1109:imul            
	//  595 1110:isub            
	//  596 1111:istore          12
								aword5[j5 * l4 + l3] = (short)((word0 * k6 + (i6 - k6) * l5) / i6);
	//  597 1113:aload           16
	//  598 1115:iload           9
	//  599 1117:iload           8
	//  600 1119:imul            
	//  601 1120:iload           7
	//  602 1122:iadd            
	//  603 1123:iload           10
	//  604 1125:iload           14
	//  605 1127:imul            
	//  606 1128:iload           12
	//  607 1130:iload           14
	//  608 1132:isub            
	//  609 1133:iload           11
	//  610 1135:imul            
	//  611 1136:iadd            
	//  612 1137:iload           12
	//  613 1139:idiv            
	//  614 1140:int2short       
	//  615 1141:sastore         
								l3++;
	//  616 1142:iload           7
	//  617 1144:iconst_1        
	//  618 1145:iadd            
	//  619 1146:istore          7
							} while(true);
	//  620 1148:goto            1014
							n = n + 1;
	//  621 1151:aload_0         
	//  622 1152:aload_0         
	//  623 1153:getfield        #64  <Field int n>
	//  624 1156:iconst_1        
	//  625 1157:iadd            
	//  626 1158:putfield        #64  <Field int n>
							r = r + 1;
	//  627 1161:aload_0         
	//  628 1162:aload_0         
	//  629 1163:getfield        #79  <Field int r>
	//  630 1166:iconst_1        
	//  631 1167:iadd            
	//  632 1168:putfield        #79  <Field int r>
						} while(true);
	//  633 1171:goto            979
						m = l3 + 1;
	//  634 1174:aload_0         
	//  635 1175:iload           7
	//  636 1177:iconst_1        
	//  637 1178:iadd            
	//  638 1179:putfield        #62  <Field int m>
						if(m == j1)
	//* 639 1182:aload_0         
	//* 640 1183:getfield        #62  <Field int m>
	//* 641 1186:iload           4
	//* 642 1188:icmpne          1222
						{
							m = 0;
	//  643 1191:aload_0         
	//  644 1192:iconst_0        
	//  645 1193:putfield        #62  <Field int m>
							boolean flag;
							if(l4 == j2)
	//* 646 1196:iload           8
	//* 647 1198:iload           5
	//* 648 1200:icmpne          1209
								flag = true;
	//  649 1203:iconst_1        
	//  650 1204:istore          15
							else
	//* 651 1206:goto            1212
								flag = false;
	//  652 1209:iconst_0        
	//  653 1210:istore          15
							bnf.b(flag);
	//  654 1212:iload           15
	//  655 1214:invokestatic    #127 <Method void bnf.b(boolean)>
							n = 0;
	//  656 1217:aload_0         
	//  657 1218:iconst_0        
	//  658 1219:putfield        #64  <Field int n>
						}
						l2++;
	//  659 1222:iload           6
	//  660 1224:iconst_1        
	//  661 1225:iadd            
	//  662 1226:istore          6
					} while(true);
	//  663 1228:goto            964
					j1 = l3 - 1;
	//  664 1231:iload           7
	//  665 1233:iconst_1        
	//  666 1234:isub            
	//  667 1235:istore          4
					if(j1 != 0)
	//* 668 1237:iload           4
	//* 669 1239:ifeq            1302
					{
						short aword6[] = l;
	//  670 1242:aload_0         
	//  671 1243:getfield        #60  <Field short[] l>
	//  672 1246:astore          16
						j2 = b;
	//  673 1248:aload_0         
	//  674 1249:getfield        #40  <Field int b>
	//  675 1252:istore          5
						System.arraycopy(((Object) (aword6)), j1 * j2, ((Object) (aword6)), 0, (l3 - j1) * j2);
	//  676 1254:aload           16
	//  677 1256:iload           4
	//  678 1258:iload           5
	//  679 1260:imul            
	//  680 1261:aload           16
	//  681 1263:iconst_0        
	//  682 1264:iload           7
	//  683 1266:iload           4
	//  684 1268:isub            
	//  685 1269:iload           5
	//  686 1271:imul            
	//  687 1272:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
						s = s - j1;
	//  688 1275:aload_0         
	//  689 1276:aload_0         
	//  690 1277:getfield        #122 <Field int s>
	//  691 1280:iload           4
	//  692 1282:isub            
	//  693 1283:putfield        #122 <Field int s>
						return;
	//  694 1286:return          
					}
					break;
				}
				j2 /= 2;
	//  695 1287:iload           5
	//  696 1289:iconst_2        
	//  697 1290:idiv            
	//  698 1291:istore          5
				j1 /= 2;
	//  699 1293:iload           4
	//  700 1295:iconst_2        
	//  701 1296:idiv            
	//  702 1297:istore          4
			} while(true);
	//  703 1299:goto            822
		}
	//  704 1302:return          
	}

	public final void a()
	{
		int j1 = q;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field int q>
	//    2    4:istore          4
		float f2 = o;
	//    3    6:aload_0         
	//    4    7:getfield        #68  <Field float o>
	//    5   10:fstore_2        
		float f1 = p;
	//    6   11:aload_0         
	//    7   12:getfield        #70  <Field float p>
	//    8   15:fstore_1        
		f2 /= f1;
	//    9   16:fload_2         
	//   10   17:fload_1         
	//   11   18:fdiv            
	//   12   19:fstore_2        
		int k1 = r + (int)(((float)j1 / f2 + (float)s) / f1 + 0.5F);
	//   13   20:aload_0         
	//   14   21:getfield        #79  <Field int r>
	//   15   24:iload           4
	//   16   26:i2f             
	//   17   27:fload_2         
	//   18   28:fdiv            
	//   19   29:aload_0         
	//   20   30:getfield        #122 <Field int s>
	//   21   33:i2f             
	//   22   34:fadd            
	//   23   35:fload_1         
	//   24   36:fdiv            
	//   25   37:ldc1            #120 <Float 0.5F>
	//   26   39:fadd            
	//   27   40:f2i             
	//   28   41:iadd            
	//   29   42:istore          5
		b(e * 2 + j1);
	//   30   44:aload_0         
	//   31   45:aload_0         
	//   32   46:getfield        #46  <Field int e>
	//   33   49:iconst_2        
	//   34   50:imul            
	//   35   51:iload           4
	//   36   53:iadd            
	//   37   54:invokespecial   #129 <Method void b(int)>
		int i1 = 0;
	//   38   57:iconst_0        
	//   39   58:istore_3        
		int l1;
		do
		{
			l1 = e;
	//   40   59:aload_0         
	//   41   60:getfield        #46  <Field int e>
	//   42   63:istore          6
			int i2 = b;
	//   43   65:aload_0         
	//   44   66:getfield        #40  <Field int b>
	//   45   69:istore          7
			if(i1 >= l1 * 2 * i2)
				break;
	//   46   71:iload_3         
	//   47   72:iload           6
	//   48   74:iconst_2        
	//   49   75:imul            
	//   50   76:iload           7
	//   51   78:imul            
	//   52   79:icmpge          102
			h[i2 * j1 + i1] = 0;
	//   53   82:aload_0         
	//   54   83:getfield        #52  <Field short[] h>
	//   55   86:iload           7
	//   56   88:iload           4
	//   57   90:imul            
	//   58   91:iload_3         
	//   59   92:iadd            
	//   60   93:iconst_0        
	//   61   94:sastore         
			i1++;
	//   62   95:iload_3         
	//   63   96:iconst_1        
	//   64   97:iadd            
	//   65   98:istore_3        
		} while(true);
	//   66   99:goto            59
		q = q + l1 * 2;
	//   67  102:aload_0         
	//   68  103:aload_0         
	//   69  104:getfield        #97  <Field int q>
	//   70  107:iload           6
	//   71  109:iconst_2        
	//   72  110:imul            
	//   73  111:iadd            
	//   74  112:putfield        #97  <Field int q>
		c();
	//   75  115:aload_0         
	//   76  116:invokespecial   #131 <Method void c()>
		if(r > k1)
	//*  77  119:aload_0         
	//*  78  120:getfield        #79  <Field int r>
	//*  79  123:iload           5
	//*  80  125:icmple          134
			r = k1;
	//   81  128:aload_0         
	//   82  129:iload           5
	//   83  131:putfield        #79  <Field int r>
		q = 0;
	//   84  134:aload_0         
	//   85  135:iconst_0        
	//   86  136:putfield        #97  <Field int q>
		t = 0;
	//   87  139:aload_0         
	//   88  140:iconst_0        
	//   89  141:putfield        #105 <Field int t>
		s = 0;
	//   90  144:aload_0         
	//   91  145:iconst_0        
	//   92  146:putfield        #122 <Field int s>
	//   93  149:return          
	}

	public final void a(float f1)
	{
		o = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #68  <Field float o>
	//    3    5:return          
	}

	public final void a(ShortBuffer shortbuffer)
	{
		int j1 = shortbuffer.remaining();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #139 <Method int ShortBuffer.remaining()>
	//    2    4:istore_3        
		int i1 = b;
	//    3    5:aload_0         
	//    4    6:getfield        #40  <Field int b>
	//    5    9:istore_2        
		j1 /= i1;
	//    6   10:iload_3         
	//    7   11:iload_2         
	//    8   12:idiv            
	//    9   13:istore_3        
		b(j1);
	//   10   14:aload_0         
	//   11   15:iload_3         
	//   12   16:invokespecial   #129 <Method void b(int)>
		shortbuffer.get(h, q * b, (i1 * j1 << 1) / 2);
	//   13   19:aload_1         
	//   14   20:aload_0         
	//   15   21:getfield        #52  <Field short[] h>
	//   16   24:aload_0         
	//   17   25:getfield        #97  <Field int q>
	//   18   28:aload_0         
	//   19   29:getfield        #40  <Field int b>
	//   20   32:imul            
	//   21   33:iload_2         
	//   22   34:iload_3         
	//   23   35:imul            
	//   24   36:iconst_1        
	//   25   37:ishl            
	//   26   38:iconst_2        
	//   27   39:idiv            
	//   28   40:invokevirtual   #143 <Method ShortBuffer ShortBuffer.get(short[], int, int)>
	//   29   43:pop             
		q = q + j1;
	//   30   44:aload_0         
	//   31   45:aload_0         
	//   32   46:getfield        #97  <Field int q>
	//   33   49:iload_3         
	//   34   50:iadd            
	//   35   51:putfield        #97  <Field int q>
		c();
	//   36   54:aload_0         
	//   37   55:invokespecial   #131 <Method void c()>
	//   38   58:return          
	}

	public final int b()
	{
		return r;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field int r>
	//    2    4:ireturn         
	}

	public final void b(float f1)
	{
		p = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #70  <Field float p>
	//    3    5:return          
	}

	public final void b(ShortBuffer shortbuffer)
	{
		int i1 = Math.min(shortbuffer.remaining() / b, r);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #139 <Method int ShortBuffer.remaining()>
	//    2    4:aload_0         
	//    3    5:getfield        #40  <Field int b>
	//    4    8:idiv            
	//    5    9:aload_0         
	//    6   10:getfield        #79  <Field int r>
	//    7   13:invokestatic    #111 <Method int Math.min(int, int)>
	//    8   16:istore_2        
		shortbuffer.put(j, 0, b * i1);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #56  <Field short[] j>
	//   12   22:iconst_0        
	//   13   23:aload_0         
	//   14   24:getfield        #40  <Field int b>
	//   15   27:iload_2         
	//   16   28:imul            
	//   17   29:invokevirtual   #146 <Method ShortBuffer ShortBuffer.put(short[], int, int)>
	//   18   32:pop             
		r = r - i1;
	//   19   33:aload_0         
	//   20   34:aload_0         
	//   21   35:getfield        #79  <Field int r>
	//   22   38:iload_2         
	//   23   39:isub            
	//   24   40:putfield        #79  <Field int r>
		shortbuffer = ((ShortBuffer) (j));
	//   25   43:aload_0         
	//   26   44:getfield        #56  <Field short[] j>
	//   27   47:astore_1        
		int j1 = b;
	//   28   48:aload_0         
	//   29   49:getfield        #40  <Field int b>
	//   30   52:istore_3        
		System.arraycopy(((Object) (shortbuffer)), i1 * j1, ((Object) (shortbuffer)), 0, r * j1);
	//   31   53:aload_1         
	//   32   54:iload_2         
	//   33   55:iload_3         
	//   34   56:imul            
	//   35   57:aload_1         
	//   36   58:iconst_0        
	//   37   59:aload_0         
	//   38   60:getfield        #79  <Field int r>
	//   39   63:iload_3         
	//   40   64:imul            
	//   41   65:invokestatic    #95  <Method void System.arraycopy(Object, int, Object, int, int)>
	//   42   68:return          
	}

	private final int a;
	private final int b;
	private final int c;
	private final int d;
	private final int e;
	private final short f[];
	private int g;
	private short h[];
	private int i;
	private short j[];
	private int k;
	private short l[];
	private int m;
	private int n;
	private float o;
	private float p;
	private int q;
	private int r;
	private int s;
	private int t;
	private int u;
	private int v;
	private int w;
	private int x;
}
