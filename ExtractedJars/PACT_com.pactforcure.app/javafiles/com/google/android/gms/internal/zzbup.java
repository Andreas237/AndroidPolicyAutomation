// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//			zzbuq

public final class zzbup
	implements Cloneable
{

	zzbup()
	{
		this(10);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:invokespecial   #29  <Method void zzbup(int)>
	//    3    6:return          
	}

	zzbup(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		zzcsa = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #32  <Field boolean zzcsa>
		i = idealIntArraySize(i);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokespecial   #36  <Method int idealIntArraySize(int)>
	//    8   14:istore_1        
		zzcsb = new int[i];
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:newarray        int[]
	//   12   19:putfield        #38  <Field int[] zzcsb>
		zzcsc = new zzbuq[i];
	//   13   22:aload_0         
	//   14   23:iload_1         
	//   15   24:anewarray       zzbuq[]
	//   16   27:putfield        #40  <Field zzbuq[] zzcsc>
		mSize = 0;
	//   17   30:aload_0         
	//   18   31:iconst_0        
	//   19   32:putfield        #42  <Field int mSize>
	//   20   35:return          
	}

	private int idealByteArraySize(int i)
	{
		int j = 4;
	//    0    0:iconst_4        
	//    1    1:istore_2        
		do
		{
label0:
			{
				int k = i;
	//    2    2:iload_1         
	//    3    3:istore_3        
				if(j < 32)
	//*   4    4:iload_2         
	//*   5    5:bipush          32
	//*   6    7:icmpge          27
				{
					if(i > (1 << j) - 12)
						break label0;
	//    7   10:iload_1         
	//    8   11:iconst_1        
	//    9   12:iload_2         
	//   10   13:ishl            
	//   11   14:bipush          12
	//   12   16:isub            
	//   13   17:icmpgt          29
					k = (1 << j) - 12;
	//   14   20:iconst_1        
	//   15   21:iload_2         
	//   16   22:ishl            
	//   17   23:bipush          12
	//   18   25:isub            
	//   19   26:istore_3        
				}
				return k;
	//   20   27:iload_3         
	//   21   28:ireturn         
			}
			j++;
	//   22   29:iload_2         
	//   23   30:iconst_1        
	//   24   31:iadd            
	//   25   32:istore_2        
		} while(true);
	//   26   33:goto            2
	}

	private int idealIntArraySize(int i)
	{
		return idealByteArraySize(i * 4) / 4;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_4        
	//    3    3:imul            
	//    4    4:invokespecial   #45  <Method int idealByteArraySize(int)>
	//    5    7:iconst_4        
	//    6    8:idiv            
	//    7    9:ireturn         
	}

	private boolean zza(int ai[], int ai1[], int i)
	{
		for(int j = 0; j < i; j++)
	//*   0    0:iconst_0        
	//*   1    1:istore          4
	//*   2    3:iload           4
	//*   3    5:iload_3         
	//*   4    6:icmpge          31
			if(ai[j] != ai1[j])
	//*   5    9:aload_1         
	//*   6   10:iload           4
	//*   7   12:iaload          
	//*   8   13:aload_2         
	//*   9   14:iload           4
	//*  10   16:iaload          
	//*  11   17:icmpeq          22
				return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         

	//   14   22:iload           4
	//   15   24:iconst_1        
	//   16   25:iadd            
	//   17   26:istore          4
	//*  18   28:goto            3
		return true;
	//   19   31:iconst_1        
	//   20   32:ireturn         
	}

	private boolean zza(zzbuq azzbuq[], zzbuq azzbuq1[], int i)
	{
		for(int j = 0; j < i; j++)
	//*   0    0:iconst_0        
	//*   1    1:istore          4
	//*   2    3:iload           4
	//*   3    5:iload_3         
	//*   4    6:icmpge          34
			if(!azzbuq[j].equals(((Object) (azzbuq1[j]))))
	//*   5    9:aload_1         
	//*   6   10:iload           4
	//*   7   12:aaload          
	//*   8   13:aload_2         
	//*   9   14:iload           4
	//*  10   16:aaload          
	//*  11   17:invokevirtual   #52  <Method boolean zzbuq.equals(Object)>
	//*  12   20:ifne            25
				return false;
	//   13   23:iconst_0        
	//   14   24:ireturn         

	//   15   25:iload           4
	//   16   27:iconst_1        
	//   17   28:iadd            
	//   18   29:istore          4
	//*  19   31:goto            3
		return true;
	//   20   34:iconst_1        
	//   21   35:ireturn         
	}

	private int zzqz(int i)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int k = mSize - 1; j <= k;)
	//*   2    2:aload_0         
	//*   3    3:getfield        #42  <Field int mSize>
	//*   4    6:iconst_1        
	//*   5    7:isub            
	//*   6    8:istore_3        
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
			int i1 = zzcsb[l];
	//   16   21:aload_0         
	//   17   22:getfield        #38  <Field int[] zzcsb>
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

	public Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (zzacP()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #61  <Method zzbup zzacP()>
	//    2    4:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj != this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(!(obj instanceof zzbup))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzbup>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((zzbup)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzbup>
	//   12   20:astore_1        
			if(size() != ((zzbup) (obj)).size())
	//*  13   21:aload_0         
	//*  14   22:invokevirtual   #66  <Method int size()>
	//*  15   25:aload_1         
	//*  16   26:invokevirtual   #66  <Method int size()>
	//*  17   29:icmpeq          34
				return false;
	//   18   32:iconst_0        
	//   19   33:ireturn         
			if(!zza(zzcsb, ((zzbup) (obj)).zzcsb, mSize) || !zza(zzcsc, ((zzbup) (obj)).zzcsc, mSize))
	//*  20   34:aload_0         
	//*  21   35:aload_0         
	//*  22   36:getfield        #38  <Field int[] zzcsb>
	//*  23   39:aload_1         
	//*  24   40:getfield        #38  <Field int[] zzcsb>
	//*  25   43:aload_0         
	//*  26   44:getfield        #42  <Field int mSize>
	//*  27   47:invokespecial   #68  <Method boolean zza(int[], int[], int)>
	//*  28   50:ifeq            72
	//*  29   53:aload_0         
	//*  30   54:aload_0         
	//*  31   55:getfield        #40  <Field zzbuq[] zzcsc>
	//*  32   58:aload_1         
	//*  33   59:getfield        #40  <Field zzbuq[] zzcsc>
	//*  34   62:aload_0         
	//*  35   63:getfield        #42  <Field int mSize>
	//*  36   66:invokespecial   #70  <Method boolean zza(zzbuq[], zzbuq[], int)>
	//*  37   69:ifne            5
				return false;
	//   38   72:iconst_0        
	//   39   73:ireturn         
		}
		return true;
	}

	public int hashCode()
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
			j = (j * 31 + zzcsb[i]) * 31 + zzcsc[i].hashCode();
	//    8   13:iload_2         
	//    9   14:bipush          31
	//   10   16:imul            
	//   11   17:aload_0         
	//   12   18:getfield        #38  <Field int[] zzcsb>
	//   13   21:iload_1         
	//   14   22:iaload          
	//   15   23:iadd            
	//   16   24:bipush          31
	//   17   26:imul            
	//   18   27:aload_0         
	//   19   28:getfield        #40  <Field zzbuq[] zzcsc>
	//   20   31:iload_1         
	//   21   32:aaload          
	//   22   33:invokevirtual   #73  <Method int zzbuq.hashCode()>
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

	public boolean isEmpty()
	{
		return size() == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method int size()>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	int size()
	{
		return mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int mSize>
	//    2    4:ireturn         
	}

	void zza(int i, zzbuq zzbuq1)
	{
		int j = zzqz(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #78  <Method int zzqz(int)>
	//    3    5:istore_3        
		if(j >= 0)
	//*   4    6:iload_3         
	//*   5    7:iflt            18
		{
			zzcsc[j] = zzbuq1;
	//    6   10:aload_0         
	//    7   11:getfield        #40  <Field zzbuq[] zzcsc>
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
		if(j < mSize && zzcsc[j] == zzcrZ)
	//*  16   22:iload_3         
	//*  17   23:aload_0         
	//*  18   24:getfield        #42  <Field int mSize>
	//*  19   27:icmpge          57
	//*  20   30:aload_0         
	//*  21   31:getfield        #40  <Field zzbuq[] zzcsc>
	//*  22   34:iload_3         
	//*  23   35:aaload          
	//*  24   36:getstatic       #25  <Field zzbuq zzcrZ>
	//*  25   39:if_acmpne       57
		{
			zzcsb[j] = i;
	//   26   42:aload_0         
	//   27   43:getfield        #38  <Field int[] zzcsb>
	//   28   46:iload_3         
	//   29   47:iload_1         
	//   30   48:iastore         
			zzcsc[j] = zzbuq1;
	//   31   49:aload_0         
	//   32   50:getfield        #40  <Field zzbuq[] zzcsc>
	//   33   53:iload_3         
	//   34   54:aload_2         
	//   35   55:aastore         
			return;
	//   36   56:return          
		}
		if(mSize >= zzcsb.length)
	//*  37   57:aload_0         
	//*  38   58:getfield        #42  <Field int mSize>
	//*  39   61:aload_0         
	//*  40   62:getfield        #38  <Field int[] zzcsb>
	//*  41   65:arraylength     
	//*  42   66:icmplt          138
		{
			int k = idealIntArraySize(mSize + 1);
	//   43   69:aload_0         
	//   44   70:aload_0         
	//   45   71:getfield        #42  <Field int mSize>
	//   46   74:iconst_1        
	//   47   75:iadd            
	//   48   76:invokespecial   #36  <Method int idealIntArraySize(int)>
	//   49   79:istore          4
			int ai[] = new int[k];
	//   50   81:iload           4
	//   51   83:newarray        int[]
	//   52   85:astore          5
			zzbuq azzbuq[] = new zzbuq[k];
	//   53   87:iload           4
	//   54   89:anewarray       zzbuq[]
	//   55   92:astore          6
			System.arraycopy(((Object) (zzcsb)), 0, ((Object) (ai)), 0, zzcsb.length);
	//   56   94:aload_0         
	//   57   95:getfield        #38  <Field int[] zzcsb>
	//   58   98:iconst_0        
	//   59   99:aload           5
	//   60  101:iconst_0        
	//   61  102:aload_0         
	//   62  103:getfield        #38  <Field int[] zzcsb>
	//   63  106:arraylength     
	//   64  107:invokestatic    #84  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (zzcsc)), 0, ((Object) (azzbuq)), 0, zzcsc.length);
	//   65  110:aload_0         
	//   66  111:getfield        #40  <Field zzbuq[] zzcsc>
	//   67  114:iconst_0        
	//   68  115:aload           6
	//   69  117:iconst_0        
	//   70  118:aload_0         
	//   71  119:getfield        #40  <Field zzbuq[] zzcsc>
	//   72  122:arraylength     
	//   73  123:invokestatic    #84  <Method void System.arraycopy(Object, int, Object, int, int)>
			zzcsb = ai;
	//   74  126:aload_0         
	//   75  127:aload           5
	//   76  129:putfield        #38  <Field int[] zzcsb>
			zzcsc = azzbuq;
	//   77  132:aload_0         
	//   78  133:aload           6
	//   79  135:putfield        #40  <Field zzbuq[] zzcsc>
		}
		if(mSize - j != 0)
	//*  80  138:aload_0         
	//*  81  139:getfield        #42  <Field int mSize>
	//*  82  142:iload_3         
	//*  83  143:isub            
	//*  84  144:ifeq            189
		{
			System.arraycopy(((Object) (zzcsb)), j, ((Object) (zzcsb)), j + 1, mSize - j);
	//   85  147:aload_0         
	//   86  148:getfield        #38  <Field int[] zzcsb>
	//   87  151:iload_3         
	//   88  152:aload_0         
	//   89  153:getfield        #38  <Field int[] zzcsb>
	//   90  156:iload_3         
	//   91  157:iconst_1        
	//   92  158:iadd            
	//   93  159:aload_0         
	//   94  160:getfield        #42  <Field int mSize>
	//   95  163:iload_3         
	//   96  164:isub            
	//   97  165:invokestatic    #84  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (zzcsc)), j, ((Object) (zzcsc)), j + 1, mSize - j);
	//   98  168:aload_0         
	//   99  169:getfield        #40  <Field zzbuq[] zzcsc>
	//  100  172:iload_3         
	//  101  173:aload_0         
	//  102  174:getfield        #40  <Field zzbuq[] zzcsc>
	//  103  177:iload_3         
	//  104  178:iconst_1        
	//  105  179:iadd            
	//  106  180:aload_0         
	//  107  181:getfield        #42  <Field int mSize>
	//  108  184:iload_3         
	//  109  185:isub            
	//  110  186:invokestatic    #84  <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		zzcsb[j] = i;
	//  111  189:aload_0         
	//  112  190:getfield        #38  <Field int[] zzcsb>
	//  113  193:iload_3         
	//  114  194:iload_1         
	//  115  195:iastore         
		zzcsc[j] = zzbuq1;
	//  116  196:aload_0         
	//  117  197:getfield        #40  <Field zzbuq[] zzcsc>
	//  118  200:iload_3         
	//  119  201:aload_2         
	//  120  202:aastore         
		mSize = mSize + 1;
	//  121  203:aload_0         
	//  122  204:aload_0         
	//  123  205:getfield        #42  <Field int mSize>
	//  124  208:iconst_1        
	//  125  209:iadd            
	//  126  210:putfield        #42  <Field int mSize>
	//  127  213:return          
	}

	public final zzbup zzacP()
	{
		int j = size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method int size()>
	//    2    4:istore_2        
		zzbup zzbup1 = new zzbup(j);
	//    3    5:new             #2   <Class zzbup>
	//    4    8:dup             
	//    5    9:iload_2         
	//    6   10:invokespecial   #29  <Method void zzbup(int)>
	//    7   13:astore_3        
		System.arraycopy(((Object) (zzcsb)), 0, ((Object) (zzbup1.zzcsb)), 0, j);
	//    8   14:aload_0         
	//    9   15:getfield        #38  <Field int[] zzcsb>
	//   10   18:iconst_0        
	//   11   19:aload_3         
	//   12   20:getfield        #38  <Field int[] zzcsb>
	//   13   23:iconst_0        
	//   14   24:iload_2         
	//   15   25:invokestatic    #84  <Method void System.arraycopy(Object, int, Object, int, int)>
		for(int i = 0; i < j; i++)
	//*  16   28:iconst_0        
	//*  17   29:istore_1        
	//*  18   30:iload_1         
	//*  19   31:iload_2         
	//*  20   32:icmpge          69
			if(zzcsc[i] != null)
	//*  21   35:aload_0         
	//*  22   36:getfield        #40  <Field zzbuq[] zzcsc>
	//*  23   39:iload_1         
	//*  24   40:aaload          
	//*  25   41:ifnull          62
				zzbup1.zzcsc[i] = (zzbuq)zzcsc[i].clone();
	//   26   44:aload_3         
	//   27   45:getfield        #40  <Field zzbuq[] zzcsc>
	//   28   48:iload_1         
	//   29   49:aload_0         
	//   30   50:getfield        #40  <Field zzbuq[] zzcsc>
	//   31   53:iload_1         
	//   32   54:aaload          
	//   33   55:invokevirtual   #86  <Method Object zzbuq.clone()>
	//   34   58:checkcast       #20  <Class zzbuq>
	//   35   61:aastore         

	//   36   62:iload_1         
	//   37   63:iconst_1        
	//   38   64:iadd            
	//   39   65:istore_1        
	//*  40   66:goto            30
		zzbup1.mSize = j;
	//   41   69:aload_3         
	//   42   70:iload_2         
	//   43   71:putfield        #42  <Field int mSize>
		return zzbup1;
	//   44   74:aload_3         
	//   45   75:areturn         
	}

	zzbuq zzqx(int i)
	{
		i = zzqz(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #78  <Method int zzqz(int)>
	//    3    5:istore_1        
		if(i < 0 || zzcsc[i] == zzcrZ)
	//*   4    6:iload_1         
	//*   5    7:iflt            22
	//*   6   10:aload_0         
	//*   7   11:getfield        #40  <Field zzbuq[] zzcsc>
	//*   8   14:iload_1         
	//*   9   15:aaload          
	//*  10   16:getstatic       #25  <Field zzbuq zzcrZ>
	//*  11   19:if_acmpne       24
			return null;
	//   12   22:aconst_null     
	//   13   23:areturn         
		else
			return zzcsc[i];
	//   14   24:aload_0         
	//   15   25:getfield        #40  <Field zzbuq[] zzcsc>
	//   16   28:iload_1         
	//   17   29:aaload          
	//   18   30:areturn         
	}

	zzbuq zzqy(int i)
	{
		return zzcsc[i];
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field zzbuq[] zzcsc>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	private static final zzbuq zzcrZ = new zzbuq();
	private int mSize;
	private boolean zzcsa;
	private int zzcsb[];
	private zzbuq zzcsc[];

	static 
	{
	//    0    0:new             #20  <Class zzbuq>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void zzbuq()>
	//    3    7:putstatic       #25  <Field zzbuq zzcrZ>
	//*   4   10:return          
	}
}
