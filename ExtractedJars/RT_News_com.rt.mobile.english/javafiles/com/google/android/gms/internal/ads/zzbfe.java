// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbff

public final class zzbfe
	implements Cloneable
{

	zzbfe()
	{
		this(10);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:invokespecial   #29  <Method void zzbfe(int)>
	//    3    6:return          
	}

	private zzbfe(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		zzebn = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #32  <Field boolean zzebn>
		i = idealIntArraySize(i);
	//    5    9:iload_1         
	//    6   10:invokestatic    #36  <Method int idealIntArraySize(int)>
	//    7   13:istore_1        
		zzebo = new int[i];
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:newarray        int[]
	//   11   18:putfield        #38  <Field int[] zzebo>
		zzebp = new zzbff[i];
	//   12   21:aload_0         
	//   13   22:iload_1         
	//   14   23:anewarray       zzbff[]
	//   15   26:putfield        #40  <Field zzbff[] zzebp>
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

	private final int zzdh(int i)
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
			int i1 = zzebo[l];
	//   16   21:aload_0         
	//   17   22:getfield        #38  <Field int[] zzebo>
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

	public final Object clone()
		throws CloneNotSupportedException
	{
		int j = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int mSize>
	//    2    4:istore_2        
		zzbfe zzbfe1 = new zzbfe(j);
	//    3    5:new             #2   <Class zzbfe>
	//    4    8:dup             
	//    5    9:iload_2         
	//    6   10:invokespecial   #29  <Method void zzbfe(int)>
	//    7   13:astore_3        
		int ai[] = zzebo;
	//    8   14:aload_0         
	//    9   15:getfield        #38  <Field int[] zzebo>
	//   10   18:astore          4
		int ai1[] = zzbfe1.zzebo;
	//   11   20:aload_3         
	//   12   21:getfield        #38  <Field int[] zzebo>
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
	//*  24   40:icmpge          77
			if(zzebp[i] != null)
	//*  25   43:aload_0         
	//*  26   44:getfield        #40  <Field zzbff[] zzebp>
	//*  27   47:iload_1         
	//*  28   48:aaload          
	//*  29   49:ifnull          70
				zzbfe1.zzebp[i] = (zzbff)zzebp[i].clone();
	//   30   52:aload_3         
	//   31   53:getfield        #40  <Field zzbff[] zzebp>
	//   32   56:iload_1         
	//   33   57:aload_0         
	//   34   58:getfield        #40  <Field zzbff[] zzebp>
	//   35   61:iload_1         
	//   36   62:aaload          
	//   37   63:invokevirtual   #55  <Method Object zzbff.clone()>
	//   38   66:checkcast       #20  <Class zzbff>
	//   39   69:aastore         

	//   40   70:iload_1         
	//   41   71:iconst_1        
	//   42   72:iadd            
	//   43   73:istore_1        
	//*  44   74:goto            38
		zzbfe1.mSize = j;
	//   45   77:aload_3         
	//   46   78:iload_2         
	//   47   79:putfield        #42  <Field int mSize>
		return ((Object) (zzbfe1));
	//   48   82:aload_3         
	//   49   83:areturn         
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
			if(!(obj instanceof zzbfe))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzbfe>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((zzbfe)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzbfe>
	//   12   20:astore_1        
			if(mSize != ((zzbfe) (obj)).mSize)
	//*  13   21:aload_0         
	//*  14   22:getfield        #42  <Field int mSize>
	//*  15   25:aload_1         
	//*  16   26:getfield        #42  <Field int mSize>
	//*  17   29:icmpeq          34
				return false;
	//   18   32:iconst_0        
	//   19   33:ireturn         
			int ai[] = zzebo;
	//   20   34:aload_0         
	//   21   35:getfield        #38  <Field int[] zzebo>
	//   22   38:astore          4
			int ai1[] = ((zzbfe) (obj)).zzebo;
	//   23   40:aload_1         
	//   24   41:getfield        #38  <Field int[] zzebo>
	//   25   44:astore          5
			int j = mSize;
	//   26   46:aload_0         
	//   27   47:getfield        #42  <Field int mSize>
	//   28   50:istore_3        
			i = 0;
	//   29   51:iconst_0        
	//   30   52:istore_2        
			do
			{
				if(i >= j)
					break;
	//   31   53:iload_2         
	//   32   54:iload_3         
	//   33   55:icmpge          81
				if(ai[i] != ai1[i])
	//*  34   58:aload           4
	//*  35   60:iload_2         
	//*  36   61:iaload          
	//*  37   62:aload           5
	//*  38   64:iload_2         
	//*  39   65:iaload          
	//*  40   66:icmpeq          74
				{
					i = 0;
	//   41   69:iconst_0        
	//   42   70:istore_2        
					break label0;
	//   43   71:goto            83
				}
				i++;
	//   44   74:iload_2         
	//   45   75:iconst_1        
	//   46   76:iadd            
	//   47   77:istore_2        
			} while(true);
	//   48   78:goto            53
			i = 1;
	//   49   81:iconst_1        
	//   50   82:istore_2        
		}
label1:
		{
label2:
			{
				if(i == 0)
					break label1;
	//   51   83:iload_2         
	//   52   84:ifeq            143
				zzbff azzbff[] = zzebp;
	//   53   87:aload_0         
	//   54   88:getfield        #40  <Field zzbff[] zzebp>
	//   55   91:astore          4
				obj = ((Object) (((zzbfe) (obj)).zzebp));
	//   56   93:aload_1         
	//   57   94:getfield        #40  <Field zzbff[] zzebp>
	//   58   97:astore_1        
				int k = mSize;
	//   59   98:aload_0         
	//   60   99:getfield        #42  <Field int mSize>
	//   61  102:istore_3        
				i = 0;
	//   62  103:iconst_0        
	//   63  104:istore_2        
				do
				{
					if(i >= k)
						break;
	//   64  105:iload_2         
	//   65  106:iload_3         
	//   66  107:icmpge          135
					if(!azzbff[i].equals(((Object) (obj[i]))))
	//*  67  110:aload           4
	//*  68  112:iload_2         
	//*  69  113:aaload          
	//*  70  114:aload_1         
	//*  71  115:iload_2         
	//*  72  116:aaload          
	//*  73  117:invokevirtual   #60  <Method boolean zzbff.equals(Object)>
	//*  74  120:ifne            128
					{
						i = 0;
	//   75  123:iconst_0        
	//   76  124:istore_2        
						break label2;
	//   77  125:goto            137
					}
					i++;
	//   78  128:iload_2         
	//   79  129:iconst_1        
	//   80  130:iadd            
	//   81  131:istore_2        
				} while(true);
	//   82  132:goto            105
				i = 1;
	//   83  135:iconst_1        
	//   84  136:istore_2        
			}
			if(i != 0)
	//*  85  137:iload_2         
	//*  86  138:ifeq            143
				return true;
	//   87  141:iconst_1        
	//   88  142:ireturn         
		}
		return false;
	//   89  143:iconst_0        
	//   90  144:ireturn         
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
			j = (j * 31 + zzebo[i]) * 31 + zzebp[i].hashCode();
	//    8   13:iload_2         
	//    9   14:bipush          31
	//   10   16:imul            
	//   11   17:aload_0         
	//   12   18:getfield        #38  <Field int[] zzebo>
	//   13   21:iload_1         
	//   14   22:iaload          
	//   15   23:iadd            
	//   16   24:bipush          31
	//   17   26:imul            
	//   18   27:aload_0         
	//   19   28:getfield        #40  <Field zzbff[] zzebp>
	//   20   31:iload_1         
	//   21   32:aaload          
	//   22   33:invokevirtual   #64  <Method int zzbff.hashCode()>
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

	final void zza(int i, zzbff zzbff1)
	{
		int j = zzdh(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #69  <Method int zzdh(int)>
	//    3    5:istore_3        
		if(j >= 0)
	//*   4    6:iload_3         
	//*   5    7:iflt            18
		{
			zzebp[j] = zzbff1;
	//    6   10:aload_0         
	//    7   11:getfield        #40  <Field zzbff[] zzebp>
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
		if(j < mSize && zzebp[j] == zzebm)
	//*  16   22:iload_3         
	//*  17   23:aload_0         
	//*  18   24:getfield        #42  <Field int mSize>
	//*  19   27:icmpge          57
	//*  20   30:aload_0         
	//*  21   31:getfield        #40  <Field zzbff[] zzebp>
	//*  22   34:iload_3         
	//*  23   35:aaload          
	//*  24   36:getstatic       #25  <Field zzbff zzebm>
	//*  25   39:if_acmpne       57
		{
			zzebo[j] = i;
	//   26   42:aload_0         
	//   27   43:getfield        #38  <Field int[] zzebo>
	//   28   46:iload_3         
	//   29   47:iload_1         
	//   30   48:iastore         
			zzebp[j] = zzbff1;
	//   31   49:aload_0         
	//   32   50:getfield        #40  <Field zzbff[] zzebp>
	//   33   53:iload_3         
	//   34   54:aload_2         
	//   35   55:aastore         
			return;
	//   36   56:return          
		}
		if(mSize >= zzebo.length)
	//*  37   57:aload_0         
	//*  38   58:getfield        #42  <Field int mSize>
	//*  39   61:aload_0         
	//*  40   62:getfield        #38  <Field int[] zzebo>
	//*  41   65:arraylength     
	//*  42   66:icmplt          137
		{
			int k = idealIntArraySize(mSize + 1);
	//   43   69:aload_0         
	//   44   70:getfield        #42  <Field int mSize>
	//   45   73:iconst_1        
	//   46   74:iadd            
	//   47   75:invokestatic    #36  <Method int idealIntArraySize(int)>
	//   48   78:istore          4
			int ai[] = new int[k];
	//   49   80:iload           4
	//   50   82:newarray        int[]
	//   51   84:astore          5
			zzbff azzbff[] = new zzbff[k];
	//   52   86:iload           4
	//   53   88:anewarray       zzbff[]
	//   54   91:astore          6
			System.arraycopy(((Object) (zzebo)), 0, ((Object) (ai)), 0, zzebo.length);
	//   55   93:aload_0         
	//   56   94:getfield        #38  <Field int[] zzebo>
	//   57   97:iconst_0        
	//   58   98:aload           5
	//   59  100:iconst_0        
	//   60  101:aload_0         
	//   61  102:getfield        #38  <Field int[] zzebo>
	//   62  105:arraylength     
	//   63  106:invokestatic    #53  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (zzebp)), 0, ((Object) (azzbff)), 0, zzebp.length);
	//   64  109:aload_0         
	//   65  110:getfield        #40  <Field zzbff[] zzebp>
	//   66  113:iconst_0        
	//   67  114:aload           6
	//   68  116:iconst_0        
	//   69  117:aload_0         
	//   70  118:getfield        #40  <Field zzbff[] zzebp>
	//   71  121:arraylength     
	//   72  122:invokestatic    #53  <Method void System.arraycopy(Object, int, Object, int, int)>
			zzebo = ai;
	//   73  125:aload_0         
	//   74  126:aload           5
	//   75  128:putfield        #38  <Field int[] zzebo>
			zzebp = azzbff;
	//   76  131:aload_0         
	//   77  132:aload           6
	//   78  134:putfield        #40  <Field zzbff[] zzebp>
		}
		if(mSize - j != 0)
	//*  79  137:aload_0         
	//*  80  138:getfield        #42  <Field int mSize>
	//*  81  141:iload_3         
	//*  82  142:isub            
	//*  83  143:ifeq            199
		{
			int ai1[] = zzebo;
	//   84  146:aload_0         
	//   85  147:getfield        #38  <Field int[] zzebo>
	//   86  150:astore          5
			int ai2[] = zzebo;
	//   87  152:aload_0         
	//   88  153:getfield        #38  <Field int[] zzebo>
	//   89  156:astore          6
			int l = j + 1;
	//   90  158:iload_3         
	//   91  159:iconst_1        
	//   92  160:iadd            
	//   93  161:istore          4
			System.arraycopy(((Object) (ai1)), j, ((Object) (ai2)), l, mSize - j);
	//   94  163:aload           5
	//   95  165:iload_3         
	//   96  166:aload           6
	//   97  168:iload           4
	//   98  170:aload_0         
	//   99  171:getfield        #42  <Field int mSize>
	//  100  174:iload_3         
	//  101  175:isub            
	//  102  176:invokestatic    #53  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (zzebp)), j, ((Object) (zzebp)), l, mSize - j);
	//  103  179:aload_0         
	//  104  180:getfield        #40  <Field zzbff[] zzebp>
	//  105  183:iload_3         
	//  106  184:aload_0         
	//  107  185:getfield        #40  <Field zzbff[] zzebp>
	//  108  188:iload           4
	//  109  190:aload_0         
	//  110  191:getfield        #42  <Field int mSize>
	//  111  194:iload_3         
	//  112  195:isub            
	//  113  196:invokestatic    #53  <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		zzebo[j] = i;
	//  114  199:aload_0         
	//  115  200:getfield        #38  <Field int[] zzebo>
	//  116  203:iload_3         
	//  117  204:iload_1         
	//  118  205:iastore         
		zzebp[j] = zzbff1;
	//  119  206:aload_0         
	//  120  207:getfield        #40  <Field zzbff[] zzebp>
	//  121  210:iload_3         
	//  122  211:aload_2         
	//  123  212:aastore         
		mSize = mSize + 1;
	//  124  213:aload_0         
	//  125  214:aload_0         
	//  126  215:getfield        #42  <Field int mSize>
	//  127  218:iconst_1        
	//  128  219:iadd            
	//  129  220:putfield        #42  <Field int mSize>
	//  130  223:return          
	}

	final zzbff zzdf(int i)
	{
		i = zzdh(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #69  <Method int zzdh(int)>
	//    3    5:istore_1        
		if(i >= 0 && zzebp[i] != zzebm)
	//*   4    6:iload_1         
	//*   5    7:iflt            32
	//*   6   10:aload_0         
	//*   7   11:getfield        #40  <Field zzbff[] zzebp>
	//*   8   14:iload_1         
	//*   9   15:aaload          
	//*  10   16:getstatic       #25  <Field zzbff zzebm>
	//*  11   19:if_acmpne       25
	//*  12   22:goto            32
			return zzebp[i];
	//   13   25:aload_0         
	//   14   26:getfield        #40  <Field zzbff[] zzebp>
	//   15   29:iload_1         
	//   16   30:aaload          
	//   17   31:areturn         
		else
			return null;
	//   18   32:aconst_null     
	//   19   33:areturn         
	}

	final zzbff zzdg(int i)
	{
		return zzebp[i];
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field zzbff[] zzebp>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	private static final zzbff zzebm = new zzbff();
	private int mSize;
	private boolean zzebn;
	private int zzebo[];
	private zzbff zzebp[];

	static 
	{
	//    0    0:new             #20  <Class zzbff>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void zzbff()>
	//    3    7:putstatic       #25  <Field zzbff zzebm>
	//*   4   10:return          
	}
}
