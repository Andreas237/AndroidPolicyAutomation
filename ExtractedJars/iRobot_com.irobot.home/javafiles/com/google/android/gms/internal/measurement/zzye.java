// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzyf

public final class zzye
	implements Cloneable
{

	zzye()
	{
		this(10);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:invokespecial   #29  <Method void zzye(int)>
	//    3    6:return          
	}

	private zzye(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		zzcez = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #32  <Field boolean zzcez>
		i = idealIntArraySize(i);
	//    5    9:iload_1         
	//    6   10:invokestatic    #36  <Method int idealIntArraySize(int)>
	//    7   13:istore_1        
		zzcfa = new int[i];
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:newarray        int[]
	//   11   18:putfield        #38  <Field int[] zzcfa>
		zzcfb = new zzyf[i];
	//   12   21:aload_0         
	//   13   22:iload_1         
	//   14   23:anewarray       zzyf[]
	//   15   26:putfield        #40  <Field zzyf[] zzcfb>
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

	private final int zzcg(int i)
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
			int i1 = zzcfa[l];
	//   16   21:aload_0         
	//   17   22:getfield        #38  <Field int[] zzcfa>
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
	{
		int j = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int mSize>
	//    2    4:istore_2        
		zzye zzye1 = new zzye(j);
	//    3    5:new             #2   <Class zzye>
	//    4    8:dup             
	//    5    9:iload_2         
	//    6   10:invokespecial   #29  <Method void zzye(int)>
	//    7   13:astore_3        
		int ai[] = zzcfa;
	//    8   14:aload_0         
	//    9   15:getfield        #38  <Field int[] zzcfa>
	//   10   18:astore          4
		int ai1[] = zzye1.zzcfa;
	//   11   20:aload_3         
	//   12   21:getfield        #38  <Field int[] zzcfa>
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
	//   21   35:invokestatic    #51  <Method void System.arraycopy(Object, int, Object, int, int)>
		for(; i < j; i++)
	//*  22   38:iload_1         
	//*  23   39:iload_2         
	//*  24   40:icmpge          77
			if(zzcfb[i] != null)
	//*  25   43:aload_0         
	//*  26   44:getfield        #40  <Field zzyf[] zzcfb>
	//*  27   47:iload_1         
	//*  28   48:aaload          
	//*  29   49:ifnull          70
				zzye1.zzcfb[i] = (zzyf)zzcfb[i].clone();
	//   30   52:aload_3         
	//   31   53:getfield        #40  <Field zzyf[] zzcfb>
	//   32   56:iload_1         
	//   33   57:aload_0         
	//   34   58:getfield        #40  <Field zzyf[] zzcfb>
	//   35   61:iload_1         
	//   36   62:aaload          
	//   37   63:invokevirtual   #53  <Method Object zzyf.clone()>
	//   38   66:checkcast       #20  <Class zzyf>
	//   39   69:aastore         

	//   40   70:iload_1         
	//   41   71:iconst_1        
	//   42   72:iadd            
	//   43   73:istore_1        
	//*  44   74:goto            38
		zzye1.mSize = j;
	//   45   77:aload_3         
	//   46   78:iload_2         
	//   47   79:putfield        #42  <Field int mSize>
		return ((Object) (zzye1));
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
			if(!(obj instanceof zzye))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzye>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((zzye)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzye>
	//   12   20:astore_1        
			if(mSize != ((zzye) (obj)).mSize)
	//*  13   21:aload_0         
	//*  14   22:getfield        #42  <Field int mSize>
	//*  15   25:aload_1         
	//*  16   26:getfield        #42  <Field int mSize>
	//*  17   29:icmpeq          34
				return false;
	//   18   32:iconst_0        
	//   19   33:ireturn         
			int ai[] = zzcfa;
	//   20   34:aload_0         
	//   21   35:getfield        #38  <Field int[] zzcfa>
	//   22   38:astore          4
			int ai1[] = ((zzye) (obj)).zzcfa;
	//   23   40:aload_1         
	//   24   41:getfield        #38  <Field int[] zzcfa>
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
				zzyf azzyf[] = zzcfb;
	//   53   87:aload_0         
	//   54   88:getfield        #40  <Field zzyf[] zzcfb>
	//   55   91:astore          4
				obj = ((Object) (((zzye) (obj)).zzcfb));
	//   56   93:aload_1         
	//   57   94:getfield        #40  <Field zzyf[] zzcfb>
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
					if(!azzyf[i].equals(((Object) (obj[i]))))
	//*  67  110:aload           4
	//*  68  112:iload_2         
	//*  69  113:aaload          
	//*  70  114:aload_1         
	//*  71  115:iload_2         
	//*  72  116:aaload          
	//*  73  117:invokevirtual   #57  <Method boolean zzyf.equals(Object)>
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
			j = (j * 31 + zzcfa[i]) * 31 + zzcfb[i].hashCode();
	//    8   13:iload_2         
	//    9   14:bipush          31
	//   10   16:imul            
	//   11   17:aload_0         
	//   12   18:getfield        #38  <Field int[] zzcfa>
	//   13   21:iload_1         
	//   14   22:iaload          
	//   15   23:iadd            
	//   16   24:bipush          31
	//   17   26:imul            
	//   18   27:aload_0         
	//   19   28:getfield        #40  <Field zzyf[] zzcfb>
	//   20   31:iload_1         
	//   21   32:aaload          
	//   22   33:invokevirtual   #61  <Method int zzyf.hashCode()>
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

	public final boolean isEmpty()
	{
		return mSize == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int mSize>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	final int size()
	{
		return mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int mSize>
	//    2    4:ireturn         
	}

	final void zza(int i, zzyf zzyf1)
	{
		int j = zzcg(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #68  <Method int zzcg(int)>
	//    3    5:istore_3        
		if(j >= 0)
	//*   4    6:iload_3         
	//*   5    7:iflt            18
		{
			zzcfb[j] = zzyf1;
	//    6   10:aload_0         
	//    7   11:getfield        #40  <Field zzyf[] zzcfb>
	//    8   14:iload_3         
	//    9   15:aload_2         
	//   10   16:aastore         
			return;
	//   11   17:return          
		}
		j = j;
	//   12   18:iload_3         
	//   13   19:istore_3        
		if(j < mSize && zzcfb[j] == zzcey)
	//*  14   20:iload_3         
	//*  15   21:aload_0         
	//*  16   22:getfield        #42  <Field int mSize>
	//*  17   25:icmpge          55
	//*  18   28:aload_0         
	//*  19   29:getfield        #40  <Field zzyf[] zzcfb>
	//*  20   32:iload_3         
	//*  21   33:aaload          
	//*  22   34:getstatic       #25  <Field zzyf zzcey>
	//*  23   37:if_acmpne       55
		{
			zzcfa[j] = i;
	//   24   40:aload_0         
	//   25   41:getfield        #38  <Field int[] zzcfa>
	//   26   44:iload_3         
	//   27   45:iload_1         
	//   28   46:iastore         
			zzcfb[j] = zzyf1;
	//   29   47:aload_0         
	//   30   48:getfield        #40  <Field zzyf[] zzcfb>
	//   31   51:iload_3         
	//   32   52:aload_2         
	//   33   53:aastore         
			return;
	//   34   54:return          
		}
		if(mSize >= zzcfa.length)
	//*  35   55:aload_0         
	//*  36   56:getfield        #42  <Field int mSize>
	//*  37   59:aload_0         
	//*  38   60:getfield        #38  <Field int[] zzcfa>
	//*  39   63:arraylength     
	//*  40   64:icmplt          135
		{
			int k = idealIntArraySize(mSize + 1);
	//   41   67:aload_0         
	//   42   68:getfield        #42  <Field int mSize>
	//   43   71:iconst_1        
	//   44   72:iadd            
	//   45   73:invokestatic    #36  <Method int idealIntArraySize(int)>
	//   46   76:istore          4
			int ai[] = new int[k];
	//   47   78:iload           4
	//   48   80:newarray        int[]
	//   49   82:astore          5
			zzyf azzyf[] = new zzyf[k];
	//   50   84:iload           4
	//   51   86:anewarray       zzyf[]
	//   52   89:astore          6
			System.arraycopy(((Object) (zzcfa)), 0, ((Object) (ai)), 0, zzcfa.length);
	//   53   91:aload_0         
	//   54   92:getfield        #38  <Field int[] zzcfa>
	//   55   95:iconst_0        
	//   56   96:aload           5
	//   57   98:iconst_0        
	//   58   99:aload_0         
	//   59  100:getfield        #38  <Field int[] zzcfa>
	//   60  103:arraylength     
	//   61  104:invokestatic    #51  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (zzcfb)), 0, ((Object) (azzyf)), 0, zzcfb.length);
	//   62  107:aload_0         
	//   63  108:getfield        #40  <Field zzyf[] zzcfb>
	//   64  111:iconst_0        
	//   65  112:aload           6
	//   66  114:iconst_0        
	//   67  115:aload_0         
	//   68  116:getfield        #40  <Field zzyf[] zzcfb>
	//   69  119:arraylength     
	//   70  120:invokestatic    #51  <Method void System.arraycopy(Object, int, Object, int, int)>
			zzcfa = ai;
	//   71  123:aload_0         
	//   72  124:aload           5
	//   73  126:putfield        #38  <Field int[] zzcfa>
			zzcfb = azzyf;
	//   74  129:aload_0         
	//   75  130:aload           6
	//   76  132:putfield        #40  <Field zzyf[] zzcfb>
		}
		if(mSize - j != 0)
	//*  77  135:aload_0         
	//*  78  136:getfield        #42  <Field int mSize>
	//*  79  139:iload_3         
	//*  80  140:isub            
	//*  81  141:ifeq            197
		{
			int ai1[] = zzcfa;
	//   82  144:aload_0         
	//   83  145:getfield        #38  <Field int[] zzcfa>
	//   84  148:astore          5
			int ai2[] = zzcfa;
	//   85  150:aload_0         
	//   86  151:getfield        #38  <Field int[] zzcfa>
	//   87  154:astore          6
			int l = j + 1;
	//   88  156:iload_3         
	//   89  157:iconst_1        
	//   90  158:iadd            
	//   91  159:istore          4
			System.arraycopy(((Object) (ai1)), j, ((Object) (ai2)), l, mSize - j);
	//   92  161:aload           5
	//   93  163:iload_3         
	//   94  164:aload           6
	//   95  166:iload           4
	//   96  168:aload_0         
	//   97  169:getfield        #42  <Field int mSize>
	//   98  172:iload_3         
	//   99  173:isub            
	//  100  174:invokestatic    #51  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (zzcfb)), j, ((Object) (zzcfb)), l, mSize - j);
	//  101  177:aload_0         
	//  102  178:getfield        #40  <Field zzyf[] zzcfb>
	//  103  181:iload_3         
	//  104  182:aload_0         
	//  105  183:getfield        #40  <Field zzyf[] zzcfb>
	//  106  186:iload           4
	//  107  188:aload_0         
	//  108  189:getfield        #42  <Field int mSize>
	//  109  192:iload_3         
	//  110  193:isub            
	//  111  194:invokestatic    #51  <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		zzcfa[j] = i;
	//  112  197:aload_0         
	//  113  198:getfield        #38  <Field int[] zzcfa>
	//  114  201:iload_3         
	//  115  202:iload_1         
	//  116  203:iastore         
		zzcfb[j] = zzyf1;
	//  117  204:aload_0         
	//  118  205:getfield        #40  <Field zzyf[] zzcfb>
	//  119  208:iload_3         
	//  120  209:aload_2         
	//  121  210:aastore         
		mSize = mSize + 1;
	//  122  211:aload_0         
	//  123  212:aload_0         
	//  124  213:getfield        #42  <Field int mSize>
	//  125  216:iconst_1        
	//  126  217:iadd            
	//  127  218:putfield        #42  <Field int mSize>
	//  128  221:return          
	}

	final zzyf zzce(int i)
	{
		i = zzcg(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #68  <Method int zzcg(int)>
	//    3    5:istore_1        
		if(i >= 0 && zzcfb[i] != zzcey)
	//*   4    6:iload_1         
	//*   5    7:iflt            32
	//*   6   10:aload_0         
	//*   7   11:getfield        #40  <Field zzyf[] zzcfb>
	//*   8   14:iload_1         
	//*   9   15:aaload          
	//*  10   16:getstatic       #25  <Field zzyf zzcey>
	//*  11   19:if_acmpne       25
	//*  12   22:goto            32
			return zzcfb[i];
	//   13   25:aload_0         
	//   14   26:getfield        #40  <Field zzyf[] zzcfb>
	//   15   29:iload_1         
	//   16   30:aaload          
	//   17   31:areturn         
		else
			return null;
	//   18   32:aconst_null     
	//   19   33:areturn         
	}

	final zzyf zzcf(int i)
	{
		return zzcfb[i];
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field zzyf[] zzcfb>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	private static final zzyf zzcey = new zzyf();
	private int mSize;
	private boolean zzcez;
	private int zzcfa[];
	private zzyf zzcfb[];

	static 
	{
	//    0    0:new             #20  <Class zzyf>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void zzyf()>
	//    3    7:putstatic       #25  <Field zzyf zzcey>
	//*   4   10:return          
	}
}
