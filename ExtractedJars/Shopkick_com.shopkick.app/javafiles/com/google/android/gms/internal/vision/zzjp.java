// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;


// Referenced classes of package com.google.android.gms.internal.vision:
//			zzjq

public final class zzjp
	implements Cloneable
{

	zzjp()
	{
		this(10);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:invokespecial   #29  <Method void zzjp(int)>
	//    3    6:return          
	}

	private zzjp(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		zzadj = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #32  <Field boolean zzadj>
		i = idealIntArraySize(i);
	//    5    9:iload_1         
	//    6   10:invokestatic    #36  <Method int idealIntArraySize(int)>
	//    7   13:istore_1        
		zzadk = new int[i];
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:newarray        int[]
	//   11   18:putfield        #38  <Field int[] zzadk>
		zzadl = new zzjq[i];
	//   12   21:aload_0         
	//   13   22:iload_1         
	//   14   23:anewarray       zzjq[]
	//   15   26:putfield        #40  <Field zzjq[] zzadl>
		mSize = 0;
	//   16   29:aload_0         
	//   17   30:iconst_0        
	//   18   31:putfield        #42  <Field int mSize>
	//   19   34:return          
	}

	private static int idealIntArraySize(int i)
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

	private final int zzby(int i)
	{
		int k = mSize - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int mSize>
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
			int i1 = zzadk[l];
	//   16   21:aload_0         
	//   17   22:getfield        #38  <Field int[] zzadk>
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

		return j;
	//   39   61:iload_2         
	//   40   62:ireturn         
	}

	public final Object clone()
		throws CloneNotSupportedException
	{
		int j = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int mSize>
	//    2    4:istore_2        
		zzjp zzjp1 = new zzjp(j);
	//    3    5:new             #2   <Class zzjp>
	//    4    8:dup             
	//    5    9:iload_2         
	//    6   10:invokespecial   #29  <Method void zzjp(int)>
	//    7   13:astore_3        
		int ai[] = zzadk;
	//    8   14:aload_0         
	//    9   15:getfield        #38  <Field int[] zzadk>
	//   10   18:astore          4
		int ai1[] = zzjp1.zzadk;
	//   11   20:aload_3         
	//   12   21:getfield        #38  <Field int[] zzadk>
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
	//   21   35:invokestatic    #53  <Method void System.arraycopy(Object, int, Object, int, int)>
		for(; i < j; i++)
	//*  22   38:iload_1         
	//*  23   39:iload_2         
	//*  24   40:icmpge          79
		{
			zzjq azzjq[] = zzadl;
	//   25   43:aload_0         
	//   26   44:getfield        #40  <Field zzjq[] zzadl>
	//   27   47:astore          4
			if(azzjq[i] != null)
	//*  28   49:aload           4
	//*  29   51:iload_1         
	//*  30   52:aaload          
	//*  31   53:ifnull          72
				zzjp1.zzadl[i] = (zzjq)azzjq[i].clone();
	//   32   56:aload_3         
	//   33   57:getfield        #40  <Field zzjq[] zzadl>
	//   34   60:iload_1         
	//   35   61:aload           4
	//   36   63:iload_1         
	//   37   64:aaload          
	//   38   65:invokevirtual   #55  <Method Object zzjq.clone()>
	//   39   68:checkcast       #20  <Class zzjq>
	//   40   71:aastore         
		}

	//   41   72:iload_1         
	//   42   73:iconst_1        
	//   43   74:iadd            
	//   44   75:istore_1        
	//*  45   76:goto            38
		zzjp1.mSize = j;
	//   46   79:aload_3         
	//   47   80:iload_2         
	//   48   81:putfield        #42  <Field int mSize>
		return ((Object) (zzjp1));
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
			if(!(obj instanceof zzjp))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzjp>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((zzjp)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzjp>
	//   12   20:astore_1        
			int j = mSize;
	//   13   21:aload_0         
	//   14   22:getfield        #42  <Field int mSize>
	//   15   25:istore_3        
			if(j != ((zzjp) (obj)).mSize)
	//*  16   26:iload_3         
	//*  17   27:aload_1         
	//*  18   28:getfield        #42  <Field int mSize>
	//*  19   31:icmpeq          36
				return false;
	//   20   34:iconst_0        
	//   21   35:ireturn         
			int ai[] = zzadk;
	//   22   36:aload_0         
	//   23   37:getfield        #38  <Field int[] zzadk>
	//   24   40:astore          4
			int ai1[] = ((zzjp) (obj)).zzadk;
	//   25   42:aload_1         
	//   26   43:getfield        #38  <Field int[] zzadk>
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
				zzjq azzjq[] = zzadl;
	//   52   84:aload_0         
	//   53   85:getfield        #40  <Field zzjq[] zzadl>
	//   54   88:astore          4
				obj = ((Object) (((zzjp) (obj)).zzadl));
	//   55   90:aload_1         
	//   56   91:getfield        #40  <Field zzjq[] zzadl>
	//   57   94:astore_1        
				int k = mSize;
	//   58   95:aload_0         
	//   59   96:getfield        #42  <Field int mSize>
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
					if(!azzjq[i].equals(((Object) (obj[i]))))
	//*  66  107:aload           4
	//*  67  109:iload_2         
	//*  68  110:aaload          
	//*  69  111:aload_1         
	//*  70  112:iload_2         
	//*  71  113:aaload          
	//*  72  114:invokevirtual   #60  <Method boolean zzjq.equals(Object)>
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
		for(int i = 0; i < mSize; i++)
	//*   2    3:iconst_0        
	//*   3    4:istore_1        
	//*   4    5:iload_1         
	//*   5    6:aload_0         
	//*   6    7:getfield        #42  <Field int mSize>
	//*   7   10:icmpge          45
			j = (j * 31 + zzadk[i]) * 31 + zzadl[i].hashCode();
	//    8   13:iload_2         
	//    9   14:bipush          31
	//   10   16:imul            
	//   11   17:aload_0         
	//   12   18:getfield        #38  <Field int[] zzadk>
	//   13   21:iload_1         
	//   14   22:iaload          
	//   15   23:iadd            
	//   16   24:bipush          31
	//   17   26:imul            
	//   18   27:aload_0         
	//   19   28:getfield        #40  <Field zzjq[] zzadl>
	//   20   31:iload_1         
	//   21   32:aaload          
	//   22   33:invokevirtual   #64  <Method int zzjq.hashCode()>
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

	final int size()
	{
		return mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int mSize>
	//    2    4:ireturn         
	}

	final void zza(int i, zzjq zzjq1)
	{
		int j = zzby(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #69  <Method int zzby(int)>
	//    3    5:istore_3        
		if(j >= 0)
	//*   4    6:iload_3         
	//*   5    7:iflt            18
		{
			zzadl[j] = zzjq1;
	//    6   10:aload_0         
	//    7   11:getfield        #40  <Field zzjq[] zzadl>
	//    8   14:iload_3         
	//    9   15:aload_2         
	//   10   16:aastore         
			return;
	//   11   17:return          
		}
		j = j;
	//   12   18:iload_3         
	//   13   19:istore_3        
		if(j < mSize)
	//*  14   20:iload_3         
	//*  15   21:aload_0         
	//*  16   22:getfield        #42  <Field int mSize>
	//*  17   25:icmpge          57
		{
			zzjq azzjq[] = zzadl;
	//   18   28:aload_0         
	//   19   29:getfield        #40  <Field zzjq[] zzadl>
	//   20   32:astore          6
			if(azzjq[j] == zzadi)
	//*  21   34:aload           6
	//*  22   36:iload_3         
	//*  23   37:aaload          
	//*  24   38:getstatic       #25  <Field zzjq zzadi>
	//*  25   41:if_acmpne       57
			{
				zzadk[j] = i;
	//   26   44:aload_0         
	//   27   45:getfield        #38  <Field int[] zzadk>
	//   28   48:iload_3         
	//   29   49:iload_1         
	//   30   50:iastore         
				azzjq[j] = zzjq1;
	//   31   51:aload           6
	//   32   53:iload_3         
	//   33   54:aload_2         
	//   34   55:aastore         
				return;
	//   35   56:return          
			}
		}
		int k = mSize;
	//   36   57:aload_0         
	//   37   58:getfield        #42  <Field int mSize>
	//   38   61:istore          4
		if(k >= zzadk.length)
	//*  39   63:iload           4
	//*  40   65:aload_0         
	//*  41   66:getfield        #38  <Field int[] zzadk>
	//*  42   69:arraylength     
	//*  43   70:icmplt          143
		{
			k = idealIntArraySize(k + 1);
	//   44   73:iload           4
	//   45   75:iconst_1        
	//   46   76:iadd            
	//   47   77:invokestatic    #36  <Method int idealIntArraySize(int)>
	//   48   80:istore          4
			int ai[] = new int[k];
	//   49   82:iload           4
	//   50   84:newarray        int[]
	//   51   86:astore          6
			zzjq azzjq1[] = new zzjq[k];
	//   52   88:iload           4
	//   53   90:anewarray       zzjq[]
	//   54   93:astore          7
			Object aobj1[] = ((Object []) (zzadk));
	//   55   95:aload_0         
	//   56   96:getfield        #38  <Field int[] zzadk>
	//   57   99:astore          8
			System.arraycopy(((Object) (aobj1)), 0, ((Object) (ai)), 0, aobj1.length);
	//   58  101:aload           8
	//   59  103:iconst_0        
	//   60  104:aload           6
	//   61  106:iconst_0        
	//   62  107:aload           8
	//   63  109:arraylength     
	//   64  110:invokestatic    #53  <Method void System.arraycopy(Object, int, Object, int, int)>
			aobj1 = ((Object []) (zzadl));
	//   65  113:aload_0         
	//   66  114:getfield        #40  <Field zzjq[] zzadl>
	//   67  117:astore          8
			System.arraycopy(((Object) (aobj1)), 0, ((Object) (azzjq1)), 0, aobj1.length);
	//   68  119:aload           8
	//   69  121:iconst_0        
	//   70  122:aload           7
	//   71  124:iconst_0        
	//   72  125:aload           8
	//   73  127:arraylength     
	//   74  128:invokestatic    #53  <Method void System.arraycopy(Object, int, Object, int, int)>
			zzadk = ai;
	//   75  131:aload_0         
	//   76  132:aload           6
	//   77  134:putfield        #38  <Field int[] zzadk>
			zzadl = azzjq1;
	//   78  137:aload_0         
	//   79  138:aload           7
	//   80  140:putfield        #40  <Field zzjq[] zzadl>
		}
		k = mSize;
	//   81  143:aload_0         
	//   82  144:getfield        #42  <Field int mSize>
	//   83  147:istore          4
		if(k - j != 0)
	//*  84  149:iload           4
	//*  85  151:iload_3         
	//*  86  152:isub            
	//*  87  153:ifeq            203
		{
			Object aobj[] = ((Object []) (zzadk));
	//   88  156:aload_0         
	//   89  157:getfield        #38  <Field int[] zzadk>
	//   90  160:astore          6
			int l = j + 1;
	//   91  162:iload_3         
	//   92  163:iconst_1        
	//   93  164:iadd            
	//   94  165:istore          5
			System.arraycopy(((Object) (aobj)), j, ((Object) (aobj)), l, k - j);
	//   95  167:aload           6
	//   96  169:iload_3         
	//   97  170:aload           6
	//   98  172:iload           5
	//   99  174:iload           4
	//  100  176:iload_3         
	//  101  177:isub            
	//  102  178:invokestatic    #53  <Method void System.arraycopy(Object, int, Object, int, int)>
			aobj = ((Object []) (zzadl));
	//  103  181:aload_0         
	//  104  182:getfield        #40  <Field zzjq[] zzadl>
	//  105  185:astore          6
			System.arraycopy(((Object) (aobj)), j, ((Object) (aobj)), l, mSize - j);
	//  106  187:aload           6
	//  107  189:iload_3         
	//  108  190:aload           6
	//  109  192:iload           5
	//  110  194:aload_0         
	//  111  195:getfield        #42  <Field int mSize>
	//  112  198:iload_3         
	//  113  199:isub            
	//  114  200:invokestatic    #53  <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		zzadk[j] = i;
	//  115  203:aload_0         
	//  116  204:getfield        #38  <Field int[] zzadk>
	//  117  207:iload_3         
	//  118  208:iload_1         
	//  119  209:iastore         
		zzadl[j] = zzjq1;
	//  120  210:aload_0         
	//  121  211:getfield        #40  <Field zzjq[] zzadl>
	//  122  214:iload_3         
	//  123  215:aload_2         
	//  124  216:aastore         
		mSize = mSize + 1;
	//  125  217:aload_0         
	//  126  218:aload_0         
	//  127  219:getfield        #42  <Field int mSize>
	//  128  222:iconst_1        
	//  129  223:iadd            
	//  130  224:putfield        #42  <Field int mSize>
	//  131  227:return          
	}

	final zzjq zzbw(int i)
	{
		i = zzby(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #69  <Method int zzby(int)>
	//    3    5:istore_1        
		if(i >= 0)
	//*   4    6:iload_1         
	//*   5    7:iflt            31
		{
			zzjq azzjq[] = zzadl;
	//    6   10:aload_0         
	//    7   11:getfield        #40  <Field zzjq[] zzadl>
	//    8   14:astore_2        
			if(azzjq[i] != zzadi)
	//*   9   15:aload_2         
	//*  10   16:iload_1         
	//*  11   17:aaload          
	//*  12   18:getstatic       #25  <Field zzjq zzadi>
	//*  13   21:if_acmpne       27
	//*  14   24:goto            31
				return azzjq[i];
	//   15   27:aload_2         
	//   16   28:iload_1         
	//   17   29:aaload          
	//   18   30:areturn         
		}
		return null;
	//   19   31:aconst_null     
	//   20   32:areturn         
	}

	final zzjq zzbx(int i)
	{
		return zzadl[i];
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field zzjq[] zzadl>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	private static final zzjq zzadi = new zzjq();
	private int mSize;
	private boolean zzadj;
	private int zzadk[];
	private zzjq zzadl[];

	static 
	{
	//    0    0:new             #20  <Class zzjq>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void zzjq()>
	//    3    7:putstatic       #25  <Field zzjq zzadi>
	//*   4   10:return          
	}
}
