// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bmc, bnf, bjm, zzfs, 
//			blv

public abstract class blt
	implements bmc
{

	public transient blt(bjm bjm1, int ai[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		int i = ai.length;
	//    2    4:aload_2         
	//    3    5:arraylength     
	//    4    6:istore_3        
		boolean flag = false;
	//    5    7:iconst_0        
	//    6    8:istore          4
		boolean flag1;
		if(i > 0)
	//*   7   10:iload_3         
	//*   8   11:ifle            20
			flag1 = true;
	//    9   14:iconst_1        
	//   10   15:istore          5
		else
	//*  11   17:goto            23
			flag1 = false;
	//   12   20:iconst_0        
	//   13   21:istore          5
		bnf.b(flag1);
	//   14   23:iload           5
	//   15   25:invokestatic    #27  <Method void bnf.b(boolean)>
		a = (bjm)bnf.a(((Object) (bjm1)));
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokestatic    #30  <Method Object bnf.a(Object)>
	//   19   33:checkcast       #32  <Class bjm>
	//   20   36:putfield        #34  <Field bjm a>
		b = ai.length;
	//   21   39:aload_0         
	//   22   40:aload_2         
	//   23   41:arraylength     
	//   24   42:putfield        #36  <Field int b>
		d = new zzfs[b];
	//   25   45:aload_0         
	//   26   46:aload_0         
	//   27   47:getfield        #36  <Field int b>
	//   28   50:anewarray       zzfs[]
	//   29   53:putfield        #40  <Field zzfs[] d>
		for(i = 0; i < ai.length; i++)
	//*  30   56:iconst_0        
	//*  31   57:istore_3        
	//*  32   58:iload_3         
	//*  33   59:aload_2         
	//*  34   60:arraylength     
	//*  35   61:icmpge          84
			d[i] = bjm1.a(ai[i]);
	//   36   64:aload_0         
	//   37   65:getfield        #40  <Field zzfs[] d>
	//   38   68:iload_3         
	//   39   69:aload_1         
	//   40   70:aload_2         
	//   41   71:iload_3         
	//   42   72:iaload          
	//   43   73:invokevirtual   #43  <Method zzfs bjm.a(int)>
	//   44   76:aastore         

	//   45   77:iload_3         
	//   46   78:iconst_1        
	//   47   79:iadd            
	//   48   80:istore_3        
	//*  49   81:goto            58
		Arrays.sort(((Object []) (d)), ((java.util.Comparator) (new blv(((blu) (null))))));
	//   50   84:aload_0         
	//   51   85:getfield        #40  <Field zzfs[] d>
	//   52   88:new             #45  <Class blv>
	//   53   91:dup             
	//   54   92:aconst_null     
	//   55   93:invokespecial   #48  <Method void blv(blu)>
	//   56   96:invokestatic    #54  <Method void Arrays.sort(Object[], java.util.Comparator)>
		c = new int[b];
	//   57   99:aload_0         
	//   58  100:aload_0         
	//   59  101:getfield        #36  <Field int b>
	//   60  104:newarray        int[]
	//   61  106:putfield        #56  <Field int[] c>
		i = ((int) (flag));
	//   62  109:iload           4
	//   63  111:istore_3        
		do
		{
			int j = b;
	//   64  112:aload_0         
	//   65  113:getfield        #36  <Field int b>
	//   66  116:istore          4
			if(i < j)
	//*  67  118:iload_3         
	//*  68  119:iload           4
	//*  69  121:icmpge          147
			{
				c[i] = bjm1.a(d[i]);
	//   70  124:aload_0         
	//   71  125:getfield        #56  <Field int[] c>
	//   72  128:iload_3         
	//   73  129:aload_1         
	//   74  130:aload_0         
	//   75  131:getfield        #40  <Field zzfs[] d>
	//   76  134:iload_3         
	//   77  135:aaload          
	//   78  136:invokevirtual   #59  <Method int bjm.a(zzfs)>
	//   79  139:iastore         
				i++;
	//   80  140:iload_3         
	//   81  141:iconst_1        
	//   82  142:iadd            
	//   83  143:istore_3        
			} else
	//*  84  144:goto            112
			{
				e = new long[j];
	//   85  147:aload_0         
	//   86  148:iload           4
	//   87  150:newarray        long[]
	//   88  152:putfield        #61  <Field long[] e>
				return;
	//   89  155:return          
			}
		} while(true);
	}

	private final boolean b(int i, long l)
	{
		return e[i] > l;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field long[] e>
	//    2    4:iload_1         
	//    3    5:laload          
	//    4    6:lload_2         
	//    5    7:lcmp            
	//    6    8:ifle            13
	//    7   11:iconst_1        
	//    8   12:ireturn         
	//    9   13:iconst_0        
	//   10   14:ireturn         
	}

	public final int a(zzfs zzfs1)
	{
		for(int i = 0; i < b; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #36  <Field int b>
	//*   5    7:icmpge          29
			if(d[i] == zzfs1)
	//*   6   10:aload_0         
	//*   7   11:getfield        #40  <Field zzfs[] d>
	//*   8   14:iload_2         
	//*   9   15:aaload          
	//*  10   16:aload_1         
	//*  11   17:if_acmpne       22
				return i;
	//   12   20:iload_2         
	//   13   21:ireturn         

	//   14   22:iload_2         
	//   15   23:iconst_1        
	//   16   24:iadd            
	//   17   25:istore_2        
	//*  18   26:goto            2
		return -1;
	//   19   29:iconst_m1       
	//   20   30:ireturn         
	}

	public final bjm a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field bjm a>
	//    2    4:areturn         
	}

	public final zzfs a(int i)
	{
		return d[i];
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field zzfs[] d>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public final boolean a(int i, long l)
	{
		l = SystemClock.elapsedRealtime();
	//    0    0:invokestatic    #70  <Method long SystemClock.elapsedRealtime()>
	//    1    3:lstore_2        
		boolean flag = b(i, l);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:lload_2         
	//    5    7:invokespecial   #72  <Method boolean b(int, long)>
	//    6   10:istore          5
		for(int j = 0; j < b && !flag; j++)
	//*   7   12:iconst_0        
	//*   8   13:istore          4
	//*   9   15:iload           4
	//*  10   17:aload_0         
	//*  11   18:getfield        #36  <Field int b>
	//*  12   21:icmpge          63
	//*  13   24:iload           5
	//*  14   26:ifne            63
			if(j != i && !b(j, l))
	//*  15   29:iload           4
	//*  16   31:iload_1         
	//*  17   32:icmpeq          51
	//*  18   35:aload_0         
	//*  19   36:iload           4
	//*  20   38:lload_2         
	//*  21   39:invokespecial   #72  <Method boolean b(int, long)>
	//*  22   42:ifne            51
				flag = true;
	//   23   45:iconst_1        
	//   24   46:istore          5
			else
	//*  25   48:goto            54
				flag = false;
	//   26   51:iconst_0        
	//   27   52:istore          5

	//   28   54:iload           4
	//   29   56:iconst_1        
	//   30   57:iadd            
	//   31   58:istore          4
	//*  32   60:goto            15
		if(!flag)
	//*  33   63:iload           5
	//*  34   65:ifne            70
		{
			return false;
	//   35   68:iconst_0        
	//   36   69:ireturn         
		} else
		{
			long al[] = e;
	//   37   70:aload_0         
	//   38   71:getfield        #61  <Field long[] e>
	//   39   74:astore          6
			al[i] = Math.max(al[i], l + 60000L);
	//   40   76:aload           6
	//   41   78:iload_1         
	//   42   79:aload           6
	//   43   81:iload_1         
	//   44   82:laload          
	//   45   83:lload_2         
	//   46   84:ldc2w           #73  <Long 60000L>
	//   47   87:ladd            
	//   48   88:invokestatic    #80  <Method long Math.max(long, long)>
	//   49   91:lastore         
			return true;
	//   50   92:iconst_1        
	//   51   93:ireturn         
		}
	}

	public final int b()
	{
		return c.length;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int[] c>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public final int b(int i)
	{
		return c[i];
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int[] c>
	//    2    4:iload_1         
	//    3    5:iaload          
	//    4    6:ireturn         
	}

	public final zzfs c()
	{
		return d[d()];
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field zzfs[] d>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #85  <Method int d()>
	//    4    8:aaload          
	//    5    9:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          58
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #91  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #91  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((blt)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class blt>
	//   16   28:astore_1        
			return a == ((blt) (obj)).a && Arrays.equals(c, ((blt) (obj)).c);
	//   17   29:aload_0         
	//   18   30:getfield        #34  <Field bjm a>
	//   19   33:aload_1         
	//   20   34:getfield        #34  <Field bjm a>
	//   21   37:if_acmpne       56
	//   22   40:aload_0         
	//   23   41:getfield        #56  <Field int[] c>
	//   24   44:aload_1         
	//   25   45:getfield        #56  <Field int[] c>
	//   26   48:invokestatic    #94  <Method boolean Arrays.equals(int[], int[])>
	//   27   51:ifeq            56
	//   28   54:iconst_1        
	//   29   55:ireturn         
	//   30   56:iconst_0        
	//   31   57:ireturn         
		} else
		{
			return false;
	//   32   58:iconst_0        
	//   33   59:ireturn         
		}
	}

	public int hashCode()
	{
		if(f == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field int f>
	//*   2    4:ifne            29
			f = System.identityHashCode(((Object) (a))) * 31 + Arrays.hashCode(c);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field bjm a>
	//    6   12:invokestatic    #103 <Method int System.identityHashCode(Object)>
	//    7   15:bipush          31
	//    8   17:imul            
	//    9   18:aload_0         
	//   10   19:getfield        #56  <Field int[] c>
	//   11   22:invokestatic    #106 <Method int Arrays.hashCode(int[])>
	//   12   25:iadd            
	//   13   26:putfield        #97  <Field int f>
		return f;
	//   14   29:aload_0         
	//   15   30:getfield        #97  <Field int f>
	//   16   33:ireturn         
	}

	private final bjm a;
	private final int b;
	private final int c[];
	private final zzfs d[];
	private final long e[];
	private int f;
}
