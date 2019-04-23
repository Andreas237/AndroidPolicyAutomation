// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import java.lang.annotation.Annotation;

public final class Constraint
{
	public static interface JobConstraint
		extends Annotation
	{
	}


	private Constraint()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:return          
	}

	static int compact(int ai[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(ai == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       8
			return 0;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		int k = ai.length;
	//    6    8:aload_0         
	//    7    9:arraylength     
	//    8   10:istore_3        
		int j = 0;
	//    9   11:iconst_0        
	//   10   12:istore_2        
		for(; i < k; i++)
	//*  11   13:iload_1         
	//*  12   14:iload_3         
	//*  13   15:icmpge          31
			j |= ai[i];
	//   14   18:iload_2         
	//   15   19:aload_0         
	//   16   20:iload_1         
	//   17   21:iaload          
	//   18   22:ior             
	//   19   23:istore_2        

	//   20   24:iload_1         
	//   21   25:iconst_1        
	//   22   26:iadd            
	//   23   27:istore_1        
	//*  24   28:goto            13
		return j;
	//   25   31:iload_2         
	//   26   32:ireturn         
	}

	static int[] uncompact(int i)
	{
		int ai[] = ALL_CONSTRAINTS;
	//    0    0:getstatic       #23  <Field int[] ALL_CONSTRAINTS>
	//    1    3:astore          6
		int l1 = ai.length;
	//    2    5:aload           6
	//    3    7:arraylength     
	//    4    8:istore          5
		boolean flag = false;
	//    5   10:iconst_0        
	//    6   11:istore          4
		int j = 0;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		int l = j;
	//    9   15:iload_1         
	//   10   16:istore_2        
		for(; j < l1; j++)
	//*  11   17:iload_1         
	//*  12   18:iload           5
	//*  13   20:icmpge          53
		{
			int i1 = ai[j];
	//   14   23:aload           6
	//   15   25:iload_1         
	//   16   26:iaload          
	//   17   27:istore_3        
			if((i & i1) == i1)
	//*  18   28:iload_0         
	//*  19   29:iload_3         
	//*  20   30:iand            
	//*  21   31:iload_3         
	//*  22   32:icmpne          40
				i1 = 1;
	//   23   35:iconst_1        
	//   24   36:istore_3        
			else
	//*  25   37:goto            42
				i1 = 0;
	//   26   40:iconst_0        
	//   27   41:istore_3        
			l += i1;
	//   28   42:iload_2         
	//   29   43:iload_3         
	//   30   44:iadd            
	//   31   45:istore_2        
		}

	//   32   46:iload_1         
	//   33   47:iconst_1        
	//   34   48:iadd            
	//   35   49:istore_1        
	//*  36   50:goto            17
		ai = new int[l];
	//   37   53:iload_2         
	//   38   54:newarray        int[]
	//   39   56:astore          6
		int ai1[] = ALL_CONSTRAINTS;
	//   40   58:getstatic       #23  <Field int[] ALL_CONSTRAINTS>
	//   41   61:astore          7
		l1 = ai1.length;
	//   42   63:aload           7
	//   43   65:arraylength     
	//   44   66:istore          5
		l = 0;
	//   45   68:iconst_0        
	//   46   69:istore_2        
		for(int k = ((int) (flag)); k < l1;)
	//*  47   70:iload           4
	//*  48   72:istore_1        
	//*  49   73:iload_1         
	//*  50   74:iload           5
	//*  51   76:icmpge          115
		{
			int k1 = ai1[k];
	//   52   79:aload           7
	//   53   81:iload_1         
	//   54   82:iaload          
	//   55   83:istore          4
			int j1 = l;
	//   56   85:iload_2         
	//   57   86:istore_3        
			if((i & k1) == k1)
	//*  58   87:iload_0         
	//*  59   88:iload           4
	//*  60   90:iand            
	//*  61   91:iload           4
	//*  62   93:icmpne          106
			{
				ai[l] = k1;
	//   63   96:aload           6
	//   64   98:iload_2         
	//   65   99:iload           4
	//   66  101:iastore         
				j1 = l + 1;
	//   67  102:iload_2         
	//   68  103:iconst_1        
	//   69  104:iadd            
	//   70  105:istore_3        
			}
			k++;
	//   71  106:iload_1         
	//   72  107:iconst_1        
	//   73  108:iadd            
	//   74  109:istore_1        
			l = j1;
	//   75  110:iload_3         
	//   76  111:istore_2        
		}

	//*  77  112:goto            73
		return ai;
	//   78  115:aload           6
	//   79  117:areturn         
	}

	static final int ALL_CONSTRAINTS[] = {
		2, 1, 4, 8
	};
	public static final int DEVICE_CHARGING = 4;
	public static final int DEVICE_IDLE = 8;
	public static final int ON_ANY_NETWORK = 2;
	public static final int ON_UNMETERED_NETWORK = 1;

	static 
	{
	//    0    0:iconst_4        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:iconst_2        
	//    5    6:iastore         
	//    6    7:dup             
	//    7    8:iconst_1        
	//    8    9:iconst_1        
	//    9   10:iastore         
	//   10   11:dup             
	//   11   12:iconst_2        
	//   12   13:iconst_4        
	//   13   14:iastore         
	//   14   15:dup             
	//   15   16:iconst_3        
	//   16   17:bipush          8
	//   17   19:iastore         
	//   18   20:putstatic       #23  <Field int[] ALL_CONSTRAINTS>
	//*  19   23:return          
	}
}
