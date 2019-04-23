// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			awm

public final class awl
	implements Cloneable
{

	awl()
	{
		this(10);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:invokespecial   #29  <Method void awl(int)>
	//    3    6:return          
	}

	private awl(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		b = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #32  <Field boolean b>
		i = c(i);
	//    5    9:iload_1         
	//    6   10:invokestatic    #35  <Method int c(int)>
	//    7   13:istore_1        
		c = new int[i];
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:newarray        int[]
	//   11   18:putfield        #37  <Field int[] c>
		d = new awm[i];
	//   12   21:aload_0         
	//   13   22:iload_1         
	//   14   23:anewarray       awm[]
	//   15   26:putfield        #39  <Field awm[] d>
		e = 0;
	//   16   29:aload_0         
	//   17   30:iconst_0        
	//   18   31:putfield        #41  <Field int e>
	//   19   34:return          
	}

	private static int c(int i)
	{
		int k = i << 2;
	//    0    0:iload_0         
	//    1    1:iconst_2        
	//    2    2:ishl            
	//    3    3:istore_2        
		i = 4;
	//    4    4:iconst_4        
	//    5    5:istore_0        
		int j;
		do
		{
			j = k;
	//    6    6:iload_2         
	//    7    7:istore_1        
			if(i >= 32)
				break;
	//    8    8:iload_0         
	//    9    9:bipush          32
	//   10   11:icmpge          36
			j = (1 << i) - 12;
	//   11   14:iconst_1        
	//   12   15:iload_0         
	//   13   16:ishl            
	//   14   17:bipush          12
	//   15   19:isub            
	//   16   20:istore_1        
			if(k <= j)
	//*  17   21:iload_2         
	//*  18   22:iload_1         
	//*  19   23:icmpgt          29
				break;
	//   20   26:goto            36
			i++;
	//   21   29:iload_0         
	//   22   30:iconst_1        
	//   23   31:iadd            
	//   24   32:istore_0        
		} while(true);
	//   25   33:goto            6
		return j / 4;
	//   26   36:iload_1         
	//   27   37:iconst_4        
	//   28   38:idiv            
	//   29   39:ireturn         
	}

	private final int d(int i)
	{
		int k = e - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int e>
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:istore_3        
		int j;
		for(j = 0; j <= k;)
	//*   5    7:iconst_0        
	//*   6    8:istore_2        
	//*   7    9:iload_2         
	//*   8   10:iload_3         
	//*   9   11:icmpgt          61
		{
			int l = j + k >>> 1;
	//   10   14:iload_2         
	//   11   15:iload_3         
	//   12   16:iadd            
	//   13   17:iconst_1        
	//   14   18:iushr           
	//   15   19:istore          4
			int i1 = c[l];
	//   16   21:aload_0         
	//   17   22:getfield        #37  <Field int[] c>
	//   18   25:iload           4
	//   19   27:iaload          
	//   20   28:istore          5
			if(i1 < i)
	//*  21   30:iload           5
	//*  22   32:iload_1         
	//*  23   33:icmpge          44
				j = l + 1;
	//   24   36:iload           4
	//   25   38:iconst_1        
	//   26   39:iadd            
	//   27   40:istore_2        
			else
	//*  28   41:goto            9
			if(i1 > i)
	//*  29   44:iload           5
	//*  30   46:iload_1         
	//*  31   47:icmple          58
				k = l - 1;
	//   32   50:iload           4
	//   33   52:iconst_1        
	//   34   53:isub            
	//   35   54:istore_3        
			else
	//*  36   55:goto            9
				return l;
	//   37   58:iload           4
	//   38   60:ireturn         
		}

		return ~j;
	//   39   61:iload_2         
	//   40   62:iconst_m1       
	//   41   63:ixor            
	//   42   64:ireturn         
	}

	final int a()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int e>
	//    2    4:ireturn         
	}

	final awm a(int i)
	{
		i = d(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #45  <Method int d(int)>
	//    3    5:istore_1        
		if(i >= 0)
	//*   4    6:iload_1         
	//*   5    7:iflt            31
		{
			awm aawm[] = d;
	//    6   10:aload_0         
	//    7   11:getfield        #39  <Field awm[] d>
	//    8   14:astore_2        
			if(aawm[i] != a)
	//*   9   15:aload_2         
	//*  10   16:iload_1         
	//*  11   17:aaload          
	//*  12   18:getstatic       #25  <Field awm a>
	//*  13   21:if_acmpne       27
	//*  14   24:goto            31
				return aawm[i];
	//   15   27:aload_2         
	//   16   28:iload_1         
	//   17   29:aaload          
	//   18   30:areturn         
		}
		return null;
	//   19   31:aconst_null     
	//   20   32:areturn         
	}

	final void a(int i, awm awm1)
	{
		int j = d(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #45  <Method int d(int)>
	//    3    5:istore_3        
		if(j >= 0)
	//*   4    6:iload_3         
	//*   5    7:iflt            18
		{
			d[j] = awm1;
	//    6   10:aload_0         
	//    7   11:getfield        #39  <Field awm[] d>
	//    8   14:iload_3         
	//    9   15:aload_2         
	//   10   16:aastore         
			return;
	//   11   17:return          
		}
		j = ~j;
	//   12   18:iload_3         
	//   13   19:iconst_m1       
	//   14   20:ixor            
	//   15   21:istore_3        
		if(j < e)
	//*  16   22:iload_3         
	//*  17   23:aload_0         
	//*  18   24:getfield        #41  <Field int e>
	//*  19   27:icmpge          59
		{
			awm aawm[] = d;
	//   20   30:aload_0         
	//   21   31:getfield        #39  <Field awm[] d>
	//   22   34:astore          6
			if(aawm[j] == a)
	//*  23   36:aload           6
	//*  24   38:iload_3         
	//*  25   39:aaload          
	//*  26   40:getstatic       #25  <Field awm a>
	//*  27   43:if_acmpne       59
			{
				c[j] = i;
	//   28   46:aload_0         
	//   29   47:getfield        #37  <Field int[] c>
	//   30   50:iload_3         
	//   31   51:iload_1         
	//   32   52:iastore         
				aawm[j] = awm1;
	//   33   53:aload           6
	//   34   55:iload_3         
	//   35   56:aload_2         
	//   36   57:aastore         
				return;
	//   37   58:return          
			}
		}
		int k = e;
	//   38   59:aload_0         
	//   39   60:getfield        #41  <Field int e>
	//   40   63:istore          4
		if(k >= c.length)
	//*  41   65:iload           4
	//*  42   67:aload_0         
	//*  43   68:getfield        #37  <Field int[] c>
	//*  44   71:arraylength     
	//*  45   72:icmplt          145
		{
			k = c(k + 1);
	//   46   75:iload           4
	//   47   77:iconst_1        
	//   48   78:iadd            
	//   49   79:invokestatic    #35  <Method int c(int)>
	//   50   82:istore          4
			int ai[] = new int[k];
	//   51   84:iload           4
	//   52   86:newarray        int[]
	//   53   88:astore          6
			awm aawm1[] = new awm[k];
	//   54   90:iload           4
	//   55   92:anewarray       awm[]
	//   56   95:astore          7
			Object aobj1[] = ((Object []) (c));
	//   57   97:aload_0         
	//   58   98:getfield        #37  <Field int[] c>
	//   59  101:astore          8
			System.arraycopy(((Object) (aobj1)), 0, ((Object) (ai)), 0, aobj1.length);
	//   60  103:aload           8
	//   61  105:iconst_0        
	//   62  106:aload           6
	//   63  108:iconst_0        
	//   64  109:aload           8
	//   65  111:arraylength     
	//   66  112:invokestatic    #52  <Method void System.arraycopy(Object, int, Object, int, int)>
			aobj1 = ((Object []) (d));
	//   67  115:aload_0         
	//   68  116:getfield        #39  <Field awm[] d>
	//   69  119:astore          8
			System.arraycopy(((Object) (aobj1)), 0, ((Object) (aawm1)), 0, aobj1.length);
	//   70  121:aload           8
	//   71  123:iconst_0        
	//   72  124:aload           7
	//   73  126:iconst_0        
	//   74  127:aload           8
	//   75  129:arraylength     
	//   76  130:invokestatic    #52  <Method void System.arraycopy(Object, int, Object, int, int)>
			c = ai;
	//   77  133:aload_0         
	//   78  134:aload           6
	//   79  136:putfield        #37  <Field int[] c>
			d = aawm1;
	//   80  139:aload_0         
	//   81  140:aload           7
	//   82  142:putfield        #39  <Field awm[] d>
		}
		k = e;
	//   83  145:aload_0         
	//   84  146:getfield        #41  <Field int e>
	//   85  149:istore          4
		if(k - j != 0)
	//*  86  151:iload           4
	//*  87  153:iload_3         
	//*  88  154:isub            
	//*  89  155:ifeq            205
		{
			Object aobj[] = ((Object []) (c));
	//   90  158:aload_0         
	//   91  159:getfield        #37  <Field int[] c>
	//   92  162:astore          6
			int l = j + 1;
	//   93  164:iload_3         
	//   94  165:iconst_1        
	//   95  166:iadd            
	//   96  167:istore          5
			System.arraycopy(((Object) (aobj)), j, ((Object) (aobj)), l, k - j);
	//   97  169:aload           6
	//   98  171:iload_3         
	//   99  172:aload           6
	//  100  174:iload           5
	//  101  176:iload           4
	//  102  178:iload_3         
	//  103  179:isub            
	//  104  180:invokestatic    #52  <Method void System.arraycopy(Object, int, Object, int, int)>
			aobj = ((Object []) (d));
	//  105  183:aload_0         
	//  106  184:getfield        #39  <Field awm[] d>
	//  107  187:astore          6
			System.arraycopy(((Object) (aobj)), j, ((Object) (aobj)), l, e - j);
	//  108  189:aload           6
	//  109  191:iload_3         
	//  110  192:aload           6
	//  111  194:iload           5
	//  112  196:aload_0         
	//  113  197:getfield        #41  <Field int e>
	//  114  200:iload_3         
	//  115  201:isub            
	//  116  202:invokestatic    #52  <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		c[j] = i;
	//  117  205:aload_0         
	//  118  206:getfield        #37  <Field int[] c>
	//  119  209:iload_3         
	//  120  210:iload_1         
	//  121  211:iastore         
		d[j] = awm1;
	//  122  212:aload_0         
	//  123  213:getfield        #39  <Field awm[] d>
	//  124  216:iload_3         
	//  125  217:aload_2         
	//  126  218:aastore         
		e = e + 1;
	//  127  219:aload_0         
	//  128  220:aload_0         
	//  129  221:getfield        #41  <Field int e>
	//  130  224:iconst_1        
	//  131  225:iadd            
	//  132  226:putfield        #41  <Field int e>
	//  133  229:return          
	}

	final awm b(int i)
	{
		return d[i];
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field awm[] d>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public final Object clone()
	{
		int j = e;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int e>
	//    2    4:istore_2        
		awl awl1 = new awl(j);
	//    3    5:new             #2   <Class awl>
	//    4    8:dup             
	//    5    9:iload_2         
	//    6   10:invokespecial   #29  <Method void awl(int)>
	//    7   13:astore_3        
		int ai[] = c;
	//    8   14:aload_0         
	//    9   15:getfield        #37  <Field int[] c>
	//   10   18:astore          4
		int ai1[] = awl1.c;
	//   11   20:aload_3         
	//   12   21:getfield        #37  <Field int[] c>
	//   13   24:astore          5
		int i = 0;
	//   14   26:iconst_0        
	//   15   27:istore_1        
		System.arraycopy(((Object) (ai)), 0, ((Object) (ai1)), 0, j);
	//   16   28:aload           4
	//   17   30:iconst_0        
	//   18   31:aload           5
	//   19   33:iconst_0        
	//   20   34:iload_2         
	//   21   35:invokestatic    #52  <Method void System.arraycopy(Object, int, Object, int, int)>
		for(; i < j; i++)
	//*  22   38:iload_1         
	//*  23   39:iload_2         
	//*  24   40:icmpge          79
		{
			awm aawm[] = d;
	//   25   43:aload_0         
	//   26   44:getfield        #39  <Field awm[] d>
	//   27   47:astore          4
			if(aawm[i] != null)
	//*  28   49:aload           4
	//*  29   51:iload_1         
	//*  30   52:aaload          
	//*  31   53:ifnull          72
				awl1.d[i] = (awm)aawm[i].clone();
	//   32   56:aload_3         
	//   33   57:getfield        #39  <Field awm[] d>
	//   34   60:iload_1         
	//   35   61:aload           4
	//   36   63:iload_1         
	//   37   64:aaload          
	//   38   65:invokevirtual   #56  <Method Object awm.clone()>
	//   39   68:checkcast       #20  <Class awm>
	//   40   71:aastore         
		}

	//   41   72:iload_1         
	//   42   73:iconst_1        
	//   43   74:iadd            
	//   44   75:istore_1        
	//*  45   76:goto            38
		awl1.e = j;
	//   46   79:aload_3         
	//   47   80:iload_2         
	//   48   81:putfield        #41  <Field int e>
		return ((Object) (awl1));
	//   49   84:aload_3         
	//   50   85:areturn         
	}

	public final boolean equals(Object obj)
	{
		int i;
label0:
		{
			if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
				return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
			if(!(obj instanceof awl))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class awl>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((awl)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class awl>
	//   12   20:astore_1        
			int j = e;
	//   13   21:aload_0         
	//   14   22:getfield        #41  <Field int e>
	//   15   25:istore_3        
			if(j != ((awl) (obj)).e)
	//*  16   26:iload_3         
	//*  17   27:aload_1         
	//*  18   28:getfield        #41  <Field int e>
	//*  19   31:icmpeq          36
				return false;
	//   20   34:iconst_0        
	//   21   35:ireturn         
			int ai[] = c;
	//   22   36:aload_0         
	//   23   37:getfield        #37  <Field int[] c>
	//   24   40:astore          4
			int ai1[] = ((awl) (obj)).c;
	//   25   42:aload_1         
	//   26   43:getfield        #37  <Field int[] c>
	//   27   46:astore          5
			i = 0;
	//   28   48:iconst_0        
	//   29   49:istore_2        
			do
			{
				if(i >= j)
					break;
	//   30   50:iload_2         
	//   31   51:iload_3         
	//   32   52:icmpge          78
				if(ai[i] != ai1[i])
	//*  33   55:aload           4
	//*  34   57:iload_2         
	//*  35   58:iaload          
	//*  36   59:aload           5
	//*  37   61:iload_2         
	//*  38   62:iaload          
	//*  39   63:icmpeq          71
				{
					i = 0;
	//   40   66:iconst_0        
	//   41   67:istore_2        
					break label0;
	//   42   68:goto            80
				}
				i++;
	//   43   71:iload_2         
	//   44   72:iconst_1        
	//   45   73:iadd            
	//   46   74:istore_2        
			} while(true);
	//   47   75:goto            50
			i = 1;
	//   48   78:iconst_1        
	//   49   79:istore_2        
		}
label1:
		{
label2:
			{
				if(i == 0)
					break label1;
	//   50   80:iload_2         
	//   51   81:ifeq            140
				awm aawm[] = d;
	//   52   84:aload_0         
	//   53   85:getfield        #39  <Field awm[] d>
	//   54   88:astore          4
				obj = ((Object) (((awl) (obj)).d));
	//   55   90:aload_1         
	//   56   91:getfield        #39  <Field awm[] d>
	//   57   94:astore_1        
				int k = e;
	//   58   95:aload_0         
	//   59   96:getfield        #41  <Field int e>
	//   60   99:istore_3        
				i = 0;
	//   61  100:iconst_0        
	//   62  101:istore_2        
				do
				{
					if(i >= k)
						break;
	//   63  102:iload_2         
	//   64  103:iload_3         
	//   65  104:icmpge          132
					if(!aawm[i].equals(((Object) (obj[i]))))
	//*  66  107:aload           4
	//*  67  109:iload_2         
	//*  68  110:aaload          
	//*  69  111:aload_1         
	//*  70  112:iload_2         
	//*  71  113:aaload          
	//*  72  114:invokevirtual   #60  <Method boolean awm.equals(Object)>
	//*  73  117:ifne            125
					{
						i = 0;
	//   74  120:iconst_0        
	//   75  121:istore_2        
						break label2;
	//   76  122:goto            134
					}
					i++;
	//   77  125:iload_2         
	//   78  126:iconst_1        
	//   79  127:iadd            
	//   80  128:istore_2        
				} while(true);
	//   81  129:goto            102
				i = 1;
	//   82  132:iconst_1        
	//   83  133:istore_2        
			}
			if(i != 0)
	//*  84  134:iload_2         
	//*  85  135:ifeq            140
				return true;
	//   86  138:iconst_1        
	//   87  139:ireturn         
		}
		return false;
	//   88  140:iconst_0        
	//   89  141:ireturn         
	}

	public final int hashCode()
	{
		int j = 17;
	//    0    0:bipush          17
	//    1    2:istore_2        
		for(int i = 0; i < e; i++)
	//*   2    3:iconst_0        
	//*   3    4:istore_1        
	//*   4    5:iload_1         
	//*   5    6:aload_0         
	//*   6    7:getfield        #41  <Field int e>
	//*   7   10:icmpge          45
			j = (j * 31 + c[i]) * 31 + d[i].hashCode();
	//    8   13:iload_2         
	//    9   14:bipush          31
	//   10   16:imul            
	//   11   17:aload_0         
	//   12   18:getfield        #37  <Field int[] c>
	//   13   21:iload_1         
	//   14   22:iaload          
	//   15   23:iadd            
	//   16   24:bipush          31
	//   17   26:imul            
	//   18   27:aload_0         
	//   19   28:getfield        #39  <Field awm[] d>
	//   20   31:iload_1         
	//   21   32:aaload          
	//   22   33:invokevirtual   #63  <Method int awm.hashCode()>
	//   23   36:iadd            
	//   24   37:istore_2        

	//   25   38:iload_1         
	//   26   39:iconst_1        
	//   27   40:iadd            
	//   28   41:istore_1        
	//*  29   42:goto            5
		return j;
	//   30   45:iload_2         
	//   31   46:ireturn         
	}

	private static final awm a = new awm();
	private boolean b;
	private int c[];
	private awm d[];
	private int e;

	static 
	{
	//    0    0:new             #20  <Class awm>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void awm()>
	//    3    7:putstatic       #25  <Field awm a>
	//*   4   10:return          
	}
}
