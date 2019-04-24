// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.util.SparseIntArray;

// Referenced classes of package android.support.v7.widget:
//			GridLayoutManager

public static abstract class GridLayoutManager$b
{

	public abstract int a(int i);

	public int a(int i, int j)
	{
		int l1;
		l1 = a(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #26  <Method int a(int)>
	//    3    5:istore          8
		if(l1 == j)
	//*   4    7:iload           8
	//*   5    9:iload_2         
	//*   6   10:icmpne          15
			return 0;
	//    7   13:iconst_0        
	//    8   14:ireturn         
		if(!b || a.size() <= 0) goto _L2; else goto _L1
	//    9   15:aload_0         
	//   10   16:getfield        #21  <Field boolean b>
	//   11   19:ifeq            64
	//   12   22:aload_0         
	//   13   23:getfield        #19  <Field SparseIntArray a>
	//   14   26:invokevirtual   #30  <Method int SparseIntArray.size()>
	//   15   29:ifle            64
_L1:
		int i1 = b(i);
	//   16   32:aload_0         
	//   17   33:iload_1         
	//   18   34:invokevirtual   #32  <Method int b(int)>
	//   19   37:istore          5
		if(i1 < 0) goto _L2; else goto _L3
	//   20   39:iload           5
	//   21   41:iflt            64
_L3:
		int k = a.get(i1) + a(i1);
	//   22   44:aload_0         
	//   23   45:getfield        #19  <Field SparseIntArray a>
	//   24   48:iload           5
	//   25   50:invokevirtual   #35  <Method int SparseIntArray.get(int)>
	//   26   53:aload_0         
	//   27   54:iload           5
	//   28   56:invokevirtual   #26  <Method int a(int)>
	//   29   59:iadd            
	//   30   60:istore_3        
		  goto _L4
	//*  31   61:goto            124
_L2:
		int l;
		l = 0;
	//   32   64:iconst_0        
	//   33   65:istore          4
		k = 0;
	//   34   67:iconst_0        
	//   35   68:istore_3        
_L6:
		if(l >= i)
			break; /* Loop/switch isn't completed */
	//   36   69:iload           4
	//   37   71:iload_1         
	//   38   72:icmpge          133
		int j1 = a(l);
	//   39   75:aload_0         
	//   40   76:iload           4
	//   41   78:invokevirtual   #26  <Method int a(int)>
	//   42   81:istore          6
		int k1 = k + j1;
	//   43   83:iload_3         
	//   44   84:iload           6
	//   45   86:iadd            
	//   46   87:istore          7
		if(k1 == j)
	//*  47   89:iload           7
	//*  48   91:iload_2         
	//*  49   92:icmpne          104
		{
			k = 0;
	//   50   95:iconst_0        
	//   51   96:istore_3        
			i1 = l;
	//   52   97:iload           4
	//   53   99:istore          5
		} else
	//*  54  101:goto            124
		{
			i1 = l;
	//   55  104:iload           4
	//   56  106:istore          5
			k = k1;
	//   57  108:iload           7
	//   58  110:istore_3        
			if(k1 > j)
	//*  59  111:iload           7
	//*  60  113:iload_2         
	//*  61  114:icmple          124
			{
				k = j1;
	//   62  117:iload           6
	//   63  119:istore_3        
				i1 = l;
	//   64  120:iload           4
	//   65  122:istore          5
			}
		}
_L4:
		l = i1 + 1;
	//   66  124:iload           5
	//   67  126:iconst_1        
	//   68  127:iadd            
	//   69  128:istore          4
		if(true) goto _L6; else goto _L5
	//   70  130:goto            69
_L5:
		if(l1 + k <= j)
	//*  71  133:iload           8
	//*  72  135:iload_3         
	//*  73  136:iadd            
	//*  74  137:iload_2         
	//*  75  138:icmpgt          143
			return k;
	//   76  141:iload_3         
	//   77  142:ireturn         
		else
			return 0;
	//   78  143:iconst_0        
	//   79  144:ireturn         
	}

	public void a()
	{
		a.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field SparseIntArray a>
	//    2    4:invokevirtual   #38  <Method void SparseIntArray.clear()>
	//    3    7:return          
	}

	int b(int i)
	{
		int k = a.size() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field SparseIntArray a>
	//    2    4:invokevirtual   #30  <Method int SparseIntArray.size()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_3        
		int j;
		for(j = 0; j <= k;)
	//*   6   10:iconst_0        
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:iload_3         
	//*  10   14:icmpgt          53
		{
			int l = j + k >>> 1;
	//   11   17:iload_2         
	//   12   18:iload_3         
	//   13   19:iadd            
	//   14   20:iconst_1        
	//   15   21:iushr           
	//   16   22:istore          4
			if(a.keyAt(l) < i)
	//*  17   24:aload_0         
	//*  18   25:getfield        #19  <Field SparseIntArray a>
	//*  19   28:iload           4
	//*  20   30:invokevirtual   #41  <Method int SparseIntArray.keyAt(int)>
	//*  21   33:iload_1         
	//*  22   34:icmpge          45
				j = l + 1;
	//   23   37:iload           4
	//   24   39:iconst_1        
	//   25   40:iadd            
	//   26   41:istore_2        
			else
	//*  27   42:goto            12
				k = l - 1;
	//   28   45:iload           4
	//   29   47:iconst_1        
	//   30   48:isub            
	//   31   49:istore_3        
		}

	//*  32   50:goto            12
		i = j - 1;
	//   33   53:iload_2         
	//   34   54:iconst_1        
	//   35   55:isub            
	//   36   56:istore_1        
		if(i >= 0 && i < a.size())
	//*  37   57:iload_1         
	//*  38   58:iflt            81
	//*  39   61:iload_1         
	//*  40   62:aload_0         
	//*  41   63:getfield        #19  <Field SparseIntArray a>
	//*  42   66:invokevirtual   #30  <Method int SparseIntArray.size()>
	//*  43   69:icmpge          81
			return a.keyAt(i);
	//   44   72:aload_0         
	//   45   73:getfield        #19  <Field SparseIntArray a>
	//   46   76:iload_1         
	//   47   77:invokevirtual   #41  <Method int SparseIntArray.keyAt(int)>
	//   48   80:ireturn         
		else
			return -1;
	//   49   81:iconst_m1       
	//   50   82:ireturn         
	}

	int b(int i, int j)
	{
		if(!b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean b>
	//*   2    4:ifne            14
			return a(i, j);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #43  <Method int a(int, int)>
	//    7   13:ireturn         
		int k = a.get(i, -1);
	//    8   14:aload_0         
	//    9   15:getfield        #19  <Field SparseIntArray a>
	//   10   18:iload_1         
	//   11   19:iconst_m1       
	//   12   20:invokevirtual   #45  <Method int SparseIntArray.get(int, int)>
	//   13   23:istore_3        
		if(k != -1)
	//*  14   24:iload_3         
	//*  15   25:iconst_m1       
	//*  16   26:icmpeq          31
		{
			return k;
	//   17   29:iload_3         
	//   18   30:ireturn         
		} else
		{
			j = a(i, j);
	//   19   31:aload_0         
	//   20   32:iload_1         
	//   21   33:iload_2         
	//   22   34:invokevirtual   #43  <Method int a(int, int)>
	//   23   37:istore_2        
			a.put(i, j);
	//   24   38:aload_0         
	//   25   39:getfield        #19  <Field SparseIntArray a>
	//   26   42:iload_1         
	//   27   43:iload_2         
	//   28   44:invokevirtual   #49  <Method void SparseIntArray.put(int, int)>
			return j;
	//   29   47:iload_2         
	//   30   48:ireturn         
		}
	}

	public int c(int i, int j)
	{
		int i2 = a(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #26  <Method int a(int)>
	//    3    5:istore          9
		int j1 = 0;
	//    4    7:iconst_0        
	//    5    8:istore          6
		int k = 0;
	//    6   10:iconst_0        
	//    7   11:istore_3        
		int l;
		int i1;
		for(l = 0; j1 < i; l = i1)
	//*   8   12:iconst_0        
	//*   9   13:istore          4
	//*  10   15:iload           6
	//*  11   17:iload_1         
	//*  12   18:icmpge          87
		{
			int k1 = a(j1);
	//   13   21:aload_0         
	//   14   22:iload           6
	//   15   24:invokevirtual   #26  <Method int a(int)>
	//   16   27:istore          7
			int l1 = k + k1;
	//   17   29:iload_3         
	//   18   30:iload           7
	//   19   32:iadd            
	//   20   33:istore          8
			if(l1 == j)
	//*  21   35:iload           8
	//*  22   37:iload_2         
	//*  23   38:icmpne          52
			{
				i1 = l + 1;
	//   24   41:iload           4
	//   25   43:iconst_1        
	//   26   44:iadd            
	//   27   45:istore          5
				k = 0;
	//   28   47:iconst_0        
	//   29   48:istore_3        
			} else
	//*  30   49:goto            74
			{
				k = l1;
	//   31   52:iload           8
	//   32   54:istore_3        
				i1 = l;
	//   33   55:iload           4
	//   34   57:istore          5
				if(l1 > j)
	//*  35   59:iload           8
	//*  36   61:iload_2         
	//*  37   62:icmple          74
				{
					i1 = l + 1;
	//   38   65:iload           4
	//   39   67:iconst_1        
	//   40   68:iadd            
	//   41   69:istore          5
					k = k1;
	//   42   71:iload           7
	//   43   73:istore_3        
				}
			}
			j1++;
	//   44   74:iload           6
	//   45   76:iconst_1        
	//   46   77:iadd            
	//   47   78:istore          6
		}

	//   48   80:iload           5
	//   49   82:istore          4
	//*  50   84:goto            15
		i = l;
	//   51   87:iload           4
	//   52   89:istore_1        
		if(k + i2 > j)
	//*  53   90:iload_3         
	//*  54   91:iload           9
	//*  55   93:iadd            
	//*  56   94:iload_2         
	//*  57   95:icmple          103
			i = l + 1;
	//   58   98:iload           4
	//   59  100:iconst_1        
	//   60  101:iadd            
	//   61  102:istore_1        
		return i;
	//   62  103:iload_1         
	//   63  104:ireturn         
	}

	final SparseIntArray a = new SparseIntArray();
	private boolean b;

	public GridLayoutManager$b()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class SparseIntArray>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void SparseIntArray()>
	//    6   12:putfield        #19  <Field SparseIntArray a>
		b = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #21  <Field boolean b>
	//   10   20:return          
	}
}
