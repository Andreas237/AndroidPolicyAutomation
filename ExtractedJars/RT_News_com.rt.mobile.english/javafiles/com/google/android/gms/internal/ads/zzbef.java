// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbu, zzbey, zzbah, zzbcx, 
//			zzbav

public final class zzbef
{

	private zzbef()
	{
		this(0, new int[8], new Object[8], true);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:bipush          8
	//    3    4:newarray        int[]
	//    4    6:bipush          8
	//    5    8:anewarray       Object[]
	//    6   11:iconst_1        
	//    7   12:invokespecial   #21  <Method void zzbef(int, int[], Object[], boolean)>
	//    8   15:return          
	}

	private zzbef(int i, int ai[], Object aobj[], boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		zzdtu = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #28  <Field int zzdtu>
		count = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #30  <Field int count>
		zzdyy = ai;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #32  <Field int[] zzdyy>
		zzdwh = aobj;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #34  <Field Object[] zzdwh>
		zzdpi = flag;
	//   14   24:aload_0         
	//   15   25:iload           4
	//   16   27:putfield        #36  <Field boolean zzdpi>
	//   17   30:return          
	}

	static zzbef zza(zzbef zzbef1, zzbef zzbef2)
	{
		int i = zzbef1.count + zzbef2.count;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int count>
	//    2    4:aload_1         
	//    3    5:getfield        #30  <Field int count>
	//    4    8:iadd            
	//    5    9:istore_2        
		int ai[] = Arrays.copyOf(zzbef1.zzdyy, i);
	//    6   10:aload_0         
	//    7   11:getfield        #32  <Field int[] zzdyy>
	//    8   14:iload_2         
	//    9   15:invokestatic    #44  <Method int[] Arrays.copyOf(int[], int)>
	//   10   18:astore_3        
		System.arraycopy(((Object) (zzbef2.zzdyy)), 0, ((Object) (ai)), zzbef1.count, zzbef2.count);
	//   11   19:aload_1         
	//   12   20:getfield        #32  <Field int[] zzdyy>
	//   13   23:iconst_0        
	//   14   24:aload_3         
	//   15   25:aload_0         
	//   16   26:getfield        #30  <Field int count>
	//   17   29:aload_1         
	//   18   30:getfield        #30  <Field int count>
	//   19   33:invokestatic    #50  <Method void System.arraycopy(Object, int, Object, int, int)>
		Object aobj[] = Arrays.copyOf(zzbef1.zzdwh, i);
	//   20   36:aload_0         
	//   21   37:getfield        #34  <Field Object[] zzdwh>
	//   22   40:iload_2         
	//   23   41:invokestatic    #53  <Method Object[] Arrays.copyOf(Object[], int)>
	//   24   44:astore          4
		System.arraycopy(((Object) (zzbef2.zzdwh)), 0, ((Object) (aobj)), zzbef1.count, zzbef2.count);
	//   25   46:aload_1         
	//   26   47:getfield        #34  <Field Object[] zzdwh>
	//   27   50:iconst_0        
	//   28   51:aload           4
	//   29   53:aload_0         
	//   30   54:getfield        #30  <Field int count>
	//   31   57:aload_1         
	//   32   58:getfield        #30  <Field int count>
	//   33   61:invokestatic    #50  <Method void System.arraycopy(Object, int, Object, int, int)>
		return new zzbef(i, ai, aobj, true);
	//   34   64:new             #2   <Class zzbef>
	//   35   67:dup             
	//   36   68:iload_2         
	//   37   69:aload_3         
	//   38   70:aload           4
	//   39   72:iconst_1        
	//   40   73:invokespecial   #21  <Method void zzbef(int, int[], Object[], boolean)>
	//   41   76:areturn         
	}

	public static zzbef zzagc()
	{
		return zzdyx;
	//    0    0:getstatic       #23  <Field zzbef zzdyx>
	//    1    3:areturn         
	}

	static zzbef zzagd()
	{
		return new zzbef();
	//    0    0:new             #2   <Class zzbef>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void zzbef()>
	//    3    7:areturn         
	}

	private static void zzb(int i, Object obj, zzbey zzbey1)
		throws IOException
	{
		int j = i >>> 3;
	//    0    0:iload_0         
	//    1    1:iconst_3        
	//    2    2:iushr           
	//    3    3:istore_3        
		i &= 7;
	//    4    4:iload_0         
	//    5    5:bipush          7
	//    6    7:iand            
	//    7    8:istore_0        
		if(i != 5)
	//*   8    9:iload_0         
	//*   9   10:iconst_5        
	//*  10   11:icmpeq          155
		{
			switch(i)
	//*  11   14:iload_0         
			{
	//*  12   15:tableswitch     0 3: default 44
	//	               0 140
	//	               1 125
	//	               2 113
	//	               3 55
			default:
				throw new RuntimeException(((Throwable) (zzbbu.zzadq())));
	//   13   44:new             #63  <Class RuntimeException>
	//   14   47:dup             
	//   15   48:invokestatic    #69  <Method zzbbv zzbbu.zzadq()>
	//   16   51:invokespecial   #72  <Method void RuntimeException(Throwable)>
	//   17   54:athrow          

			case 3: // '\003'
				if(zzbey1.zzacn() == zzbbo.zze.zzdul)
	//*  18   55:aload_2         
	//*  19   56:invokeinterface #78  <Method int zzbey.zzacn()>
	//*  20   61:getstatic       #83  <Field int zzbbo$zze.zzdul>
	//*  21   64:icmpne          90
				{
					zzbey1.zzcm(j);
	//   22   67:aload_2         
	//   23   68:iload_3         
	//   24   69:invokeinterface #87  <Method void zzbey.zzcm(int)>
					((zzbef)obj).zzb(zzbey1);
	//   25   74:aload_1         
	//   26   75:checkcast       #2   <Class zzbef>
	//   27   78:aload_2         
	//   28   79:invokevirtual   #90  <Method void zzb(zzbey)>
					zzbey1.zzcn(j);
	//   29   82:aload_2         
	//   30   83:iload_3         
	//   31   84:invokeinterface #93  <Method void zzbey.zzcn(int)>
					return;
	//   32   89:return          
				} else
				{
					zzbey1.zzcn(j);
	//   33   90:aload_2         
	//   34   91:iload_3         
	//   35   92:invokeinterface #93  <Method void zzbey.zzcn(int)>
					((zzbef)obj).zzb(zzbey1);
	//   36   97:aload_1         
	//   37   98:checkcast       #2   <Class zzbef>
	//   38  101:aload_2         
	//   39  102:invokevirtual   #90  <Method void zzb(zzbey)>
					zzbey1.zzcm(j);
	//   40  105:aload_2         
	//   41  106:iload_3         
	//   42  107:invokeinterface #87  <Method void zzbey.zzcm(int)>
					return;
	//   43  112:return          
				}

			case 2: // '\002'
				zzbey1.zza(j, (zzbah)obj);
	//   44  113:aload_2         
	//   45  114:iload_3         
	//   46  115:aload_1         
	//   47  116:checkcast       #95  <Class zzbah>
	//   48  119:invokeinterface #98  <Method void zzbey.zza(int, zzbah)>
				return;
	//   49  124:return          

			case 1: // '\001'
				zzbey1.zzc(j, ((Long)obj).longValue());
	//   50  125:aload_2         
	//   51  126:iload_3         
	//   52  127:aload_1         
	//   53  128:checkcast       #100 <Class Long>
	//   54  131:invokevirtual   #104 <Method long Long.longValue()>
	//   55  134:invokeinterface #108 <Method void zzbey.zzc(int, long)>
				return;
	//   56  139:return          

			case 0: // '\0'
				zzbey1.zzi(j, ((Long)obj).longValue());
	//   57  140:aload_2         
	//   58  141:iload_3         
	//   59  142:aload_1         
	//   60  143:checkcast       #100 <Class Long>
	//   61  146:invokevirtual   #104 <Method long Long.longValue()>
	//   62  149:invokeinterface #111 <Method void zzbey.zzi(int, long)>
				return;
	//   63  154:return          
			}
		} else
		{
			zzbey1.zzp(j, ((Integer)obj).intValue());
	//   64  155:aload_2         
	//   65  156:iload_3         
	//   66  157:aload_1         
	//   67  158:checkcast       #113 <Class Integer>
	//   68  161:invokevirtual   #116 <Method int Integer.intValue()>
	//   69  164:invokeinterface #120 <Method void zzbey.zzp(int, int)>
			return;
	//   70  169:return          
		}
	}

	public final boolean equals(Object obj)
	{
label0:
		{
			int i;
label1:
			{
				if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
					return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
				if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
					return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
				if(!(obj instanceof zzbef))
	//*   9   13:aload_1         
	//*  10   14:instanceof      #2   <Class zzbef>
	//*  11   17:ifne            22
					return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
				obj = ((Object) ((zzbef)obj));
	//   14   22:aload_1         
	//   15   23:checkcast       #2   <Class zzbef>
	//   16   26:astore_1        
				if(count != ((zzbef) (obj)).count)
					break label0;
	//   17   27:aload_0         
	//   18   28:getfield        #30  <Field int count>
	//   19   31:aload_1         
	//   20   32:getfield        #30  <Field int count>
	//   21   35:icmpne          149
				int ai[] = zzdyy;
	//   22   38:aload_0         
	//   23   39:getfield        #32  <Field int[] zzdyy>
	//   24   42:astore          4
				int ai1[] = ((zzbef) (obj)).zzdyy;
	//   25   44:aload_1         
	//   26   45:getfield        #32  <Field int[] zzdyy>
	//   27   48:astore          5
				int j = count;
	//   28   50:aload_0         
	//   29   51:getfield        #30  <Field int count>
	//   30   54:istore_3        
				i = 0;
	//   31   55:iconst_0        
	//   32   56:istore_2        
				do
				{
					if(i >= j)
						break;
	//   33   57:iload_2         
	//   34   58:iload_3         
	//   35   59:icmpge          85
					if(ai[i] != ai1[i])
	//*  36   62:aload           4
	//*  37   64:iload_2         
	//*  38   65:iaload          
	//*  39   66:aload           5
	//*  40   68:iload_2         
	//*  41   69:iaload          
	//*  42   70:icmpeq          78
					{
						i = 0;
	//   43   73:iconst_0        
	//   44   74:istore_2        
						break label1;
	//   45   75:goto            87
					}
					i++;
	//   46   78:iload_2         
	//   47   79:iconst_1        
	//   48   80:iadd            
	//   49   81:istore_2        
				} while(true);
	//   50   82:goto            57
				i = 1;
	//   51   85:iconst_1        
	//   52   86:istore_2        
			}
label2:
			{
				if(i == 0)
					break label0;
	//   53   87:iload_2         
	//   54   88:ifeq            149
				Object aobj[] = zzdwh;
	//   55   91:aload_0         
	//   56   92:getfield        #34  <Field Object[] zzdwh>
	//   57   95:astore          4
				obj = ((Object) (((zzbef) (obj)).zzdwh));
	//   58   97:aload_1         
	//   59   98:getfield        #34  <Field Object[] zzdwh>
	//   60  101:astore_1        
				int k = count;
	//   61  102:aload_0         
	//   62  103:getfield        #30  <Field int count>
	//   63  106:istore_3        
				i = 0;
	//   64  107:iconst_0        
	//   65  108:istore_2        
				do
				{
					if(i >= k)
						break;
	//   66  109:iload_2         
	//   67  110:iload_3         
	//   68  111:icmpge          139
					if(!aobj[i].equals(((Object) (obj[i]))))
	//*  69  114:aload           4
	//*  70  116:iload_2         
	//*  71  117:aaload          
	//*  72  118:aload_1         
	//*  73  119:iload_2         
	//*  74  120:aaload          
	//*  75  121:invokevirtual   #125 <Method boolean Object.equals(Object)>
	//*  76  124:ifne            132
					{
						i = 0;
	//   77  127:iconst_0        
	//   78  128:istore_2        
						break label2;
	//   79  129:goto            141
					}
					i++;
	//   80  132:iload_2         
	//   81  133:iconst_1        
	//   82  134:iadd            
	//   83  135:istore_2        
				} while(true);
	//   84  136:goto            109
				i = 1;
	//   85  139:iconst_1        
	//   86  140:istore_2        
			}
			return i != 0;
	//   87  141:iload_2         
	//   88  142:ifne            147
	//   89  145:iconst_0        
	//   90  146:ireturn         
	//   91  147:iconst_1        
	//   92  148:ireturn         
		}
		return false;
	//   93  149:iconst_0        
	//   94  150:ireturn         
	}

	public final int hashCode()
	{
		int i1 = count;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int count>
	//    2    4:istore          5
		int ai[] = zzdyy;
	//    3    6:aload_0         
	//    4    7:getfield        #32  <Field int[] zzdyy>
	//    5   10:astore          7
		int j1 = count;
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field int count>
	//    8   16:istore          6
		boolean flag = false;
	//    9   18:iconst_0        
	//   10   19:istore          4
		int l = 17;
	//   11   21:bipush          17
	//   12   23:istore_3        
		int j = 0;
	//   13   24:iconst_0        
	//   14   25:istore_2        
		int i = 17;
	//   15   26:bipush          17
	//   16   28:istore_1        
		for(; j < j1; j++)
	//*  17   29:iload_2         
	//*  18   30:iload           6
	//*  19   32:icmpge          52
			i = i * 31 + ai[j];
	//   20   35:iload_1         
	//   21   36:bipush          31
	//   22   38:imul            
	//   23   39:aload           7
	//   24   41:iload_2         
	//   25   42:iaload          
	//   26   43:iadd            
	//   27   44:istore_1        

	//   28   45:iload_2         
	//   29   46:iconst_1        
	//   30   47:iadd            
	//   31   48:istore_2        
	//*  32   49:goto            29
		ai = ((int []) (zzdwh));
	//   33   52:aload_0         
	//   34   53:getfield        #34  <Field Object[] zzdwh>
	//   35   56:astore          7
		j1 = count;
	//   36   58:aload_0         
	//   37   59:getfield        #30  <Field int count>
	//   38   62:istore          6
		for(int k = ((int) (flag)); k < j1; k++)
	//*  39   64:iload           4
	//*  40   66:istore_2        
	//*  41   67:iload_2         
	//*  42   68:iload           6
	//*  43   70:icmpge          93
			l = l * 31 + ai[k].hashCode();
	//   44   73:iload_3         
	//   45   74:bipush          31
	//   46   76:imul            
	//   47   77:aload           7
	//   48   79:iload_2         
	//   49   80:aaload          
	//   50   81:invokevirtual   #128 <Method int Object.hashCode()>
	//   51   84:iadd            
	//   52   85:istore_3        

	//   53   86:iload_2         
	//   54   87:iconst_1        
	//   55   88:iadd            
	//   56   89:istore_2        
	//*  57   90:goto            67
		return ((527 + i1) * 31 + i) * 31 + l;
	//   58   93:sipush          527
	//   59   96:iload           5
	//   60   98:iadd            
	//   61   99:bipush          31
	//   62  101:imul            
	//   63  102:iload_1         
	//   64  103:iadd            
	//   65  104:bipush          31
	//   66  106:imul            
	//   67  107:iload_3         
	//   68  108:iadd            
	//   69  109:ireturn         
	}

	final void zza(zzbey zzbey1)
		throws IOException
	{
		if(zzbey1.zzacn() == zzbbo.zze.zzdum)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #78  <Method int zzbey.zzacn()>
	//*   2    6:getstatic       #131 <Field int zzbbo$zze.zzdum>
	//*   3    9:icmpne          51
		{
			for(int i = count - 1; i >= 0; i--)
	//*   4   12:aload_0         
	//*   5   13:getfield        #30  <Field int count>
	//*   6   16:iconst_1        
	//*   7   17:isub            
	//*   8   18:istore_2        
	//*   9   19:iload_2         
	//*  10   20:iflt            50
				zzbey1.zza(zzdyy[i] >>> 3, zzdwh[i]);
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #32  <Field int[] zzdyy>
	//   14   28:iload_2         
	//   15   29:iaload          
	//   16   30:iconst_3        
	//   17   31:iushr           
	//   18   32:aload_0         
	//   19   33:getfield        #34  <Field Object[] zzdwh>
	//   20   36:iload_2         
	//   21   37:aaload          
	//   22   38:invokeinterface #134 <Method void zzbey.zza(int, Object)>

	//   23   43:iload_2         
	//   24   44:iconst_1        
	//   25   45:isub            
	//   26   46:istore_2        
	//*  27   47:goto            19
			return;
	//   28   50:return          
		}
		for(int j = 0; j < count; j++)
	//*  29   51:iconst_0        
	//*  30   52:istore_2        
	//*  31   53:iload_2         
	//*  32   54:aload_0         
	//*  33   55:getfield        #30  <Field int count>
	//*  34   58:icmpge          88
			zzbey1.zza(zzdyy[j] >>> 3, zzdwh[j]);
	//   35   61:aload_1         
	//   36   62:aload_0         
	//   37   63:getfield        #32  <Field int[] zzdyy>
	//   38   66:iload_2         
	//   39   67:iaload          
	//   40   68:iconst_3        
	//   41   69:iushr           
	//   42   70:aload_0         
	//   43   71:getfield        #34  <Field Object[] zzdwh>
	//   44   74:iload_2         
	//   45   75:aaload          
	//   46   76:invokeinterface #134 <Method void zzbey.zza(int, Object)>

	//   47   81:iload_2         
	//   48   82:iconst_1        
	//   49   83:iadd            
	//   50   84:istore_2        
	//*  51   85:goto            53
	//   52   88:return          
	}

	final void zza(StringBuilder stringbuilder, int i)
	{
		for(int j = 0; j < count; j++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_0         
	//*   4    4:getfield        #30  <Field int count>
	//*   5    7:icmpge          39
			zzbcx.zza(stringbuilder, i, String.valueOf(zzdyy[j] >>> 3), zzdwh[j]);
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:aload_0         
	//    9   13:getfield        #32  <Field int[] zzdyy>
	//   10   16:iload_3         
	//   11   17:iaload          
	//   12   18:iconst_3        
	//   13   19:iushr           
	//   14   20:invokestatic    #141 <Method String String.valueOf(int)>
	//   15   23:aload_0         
	//   16   24:getfield        #34  <Field Object[] zzdwh>
	//   17   27:iload_3         
	//   18   28:aaload          
	//   19   29:invokestatic    #146 <Method void zzbcx.zza(StringBuilder, int, String, Object)>

	//   20   32:iload_3         
	//   21   33:iconst_1        
	//   22   34:iadd            
	//   23   35:istore_3        
	//*  24   36:goto            2
	//   25   39:return          
	}

	public final void zzaaz()
	{
		zzdpi = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #36  <Field boolean zzdpi>
	//    3    5:return          
	}

	public final int zzacw()
	{
		int i = zzdtu;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int zzdtu>
	//    2    4:istore_1        
		if(i != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          12
			return i;
	//    6   10:iload_1         
	//    7   11:ireturn         
		int k = 0;
	//    8   12:iconst_0        
	//    9   13:istore_2        
		int l = 0;
	//   10   14:iconst_0        
	//   11   15:istore_3        
		int j;
		for(; k < count; k++)
	//*  12   16:iload_2         
	//*  13   17:aload_0         
	//*  14   18:getfield        #30  <Field int count>
	//*  15   21:icmpge          206
		{
			int i1 = zzdyy[k];
	//   16   24:aload_0         
	//   17   25:getfield        #32  <Field int[] zzdyy>
	//   18   28:iload_2         
	//   19   29:iaload          
	//   20   30:istore          4
			j = i1 >>> 3;
	//   21   32:iload           4
	//   22   34:iconst_3        
	//   23   35:iushr           
	//   24   36:istore_1        
			i1 &= 7;
	//   25   37:iload           4
	//   26   39:bipush          7
	//   27   41:iand            
	//   28   42:istore          4
			if(i1 != 5)
	//*  29   44:iload           4
	//*  30   46:iconst_5        
	//*  31   47:icmpeq          179
				switch(i1)
	//*  32   50:iload           4
				{
	//*  33   52:tableswitch     0 3: default 84
	//	               0 155
	//	               1 135
	//	               2 118
	//	               3 95
				default:
					throw new IllegalStateException(((Throwable) (zzbbu.zzadq())));
	//   34   84:new             #150 <Class IllegalStateException>
	//   35   87:dup             
	//   36   88:invokestatic    #69  <Method zzbbv zzbbu.zzadq()>
	//   37   91:invokespecial   #151 <Method void IllegalStateException(Throwable)>
	//   38   94:athrow          

				case 3: // '\003'
					j = (zzbav.zzcd(j) << 1) + ((zzbef)zzdwh[k]).zzacw();
	//   39   95:iload_1         
	//   40   96:invokestatic    #157 <Method int zzbav.zzcd(int)>
	//   41   99:iconst_1        
	//   42  100:ishl            
	//   43  101:aload_0         
	//   44  102:getfield        #34  <Field Object[] zzdwh>
	//   45  105:iload_2         
	//   46  106:aaload          
	//   47  107:checkcast       #2   <Class zzbef>
	//   48  110:invokevirtual   #159 <Method int zzacw()>
	//   49  113:iadd            
	//   50  114:istore_1        
					break;

	//*  51  115:goto            172
				case 2: // '\002'
					j = zzbav.zzc(j, (zzbah)zzdwh[k]);
	//   52  118:iload_1         
	//   53  119:aload_0         
	//   54  120:getfield        #34  <Field Object[] zzdwh>
	//   55  123:iload_2         
	//   56  124:aaload          
	//   57  125:checkcast       #95  <Class zzbah>
	//   58  128:invokestatic    #162 <Method int zzbav.zzc(int, zzbah)>
	//   59  131:istore_1        
					break;

	//*  60  132:goto            172
				case 1: // '\001'
					j = zzbav.zzg(j, ((Long)zzdwh[k]).longValue());
	//   61  135:iload_1         
	//   62  136:aload_0         
	//   63  137:getfield        #34  <Field Object[] zzdwh>
	//   64  140:iload_2         
	//   65  141:aaload          
	//   66  142:checkcast       #100 <Class Long>
	//   67  145:invokevirtual   #104 <Method long Long.longValue()>
	//   68  148:invokestatic    #166 <Method int zzbav.zzg(int, long)>
	//   69  151:istore_1        
					break;

	//*  70  152:goto            172
				case 0: // '\0'
					j = zzbav.zze(j, ((Long)zzdwh[k]).longValue());
	//   71  155:iload_1         
	//   72  156:aload_0         
	//   73  157:getfield        #34  <Field Object[] zzdwh>
	//   74  160:iload_2         
	//   75  161:aaload          
	//   76  162:checkcast       #100 <Class Long>
	//   77  165:invokevirtual   #104 <Method long Long.longValue()>
	//   78  168:invokestatic    #169 <Method int zzbav.zze(int, long)>
	//   79  171:istore_1        
					break;
				}
			else
	//*  80  172:iload_3         
	//*  81  173:iload_1         
	//*  82  174:iadd            
	//*  83  175:istore_3        
	//*  84  176:goto            199
				j = zzbav.zzt(j, ((Integer)zzdwh[k]).intValue());
	//   85  179:iload_1         
	//   86  180:aload_0         
	//   87  181:getfield        #34  <Field Object[] zzdwh>
	//   88  184:iload_2         
	//   89  185:aaload          
	//   90  186:checkcast       #113 <Class Integer>
	//   91  189:invokevirtual   #116 <Method int Integer.intValue()>
	//   92  192:invokestatic    #173 <Method int zzbav.zzt(int, int)>
	//   93  195:istore_1        
			l += j;
		}

	//   94  196:goto            172
	//   95  199:iload_2         
	//   96  200:iconst_1        
	//   97  201:iadd            
	//   98  202:istore_2        
	//*  99  203:goto            16
		zzdtu = l;
	//  100  206:aload_0         
	//  101  207:iload_3         
	//  102  208:putfield        #28  <Field int zzdtu>
		return l;
	//  103  211:iload_3         
	//  104  212:ireturn         
	}

	public final int zzage()
	{
		int i = zzdtu;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int zzdtu>
	//    2    4:istore_1        
		if(i != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          12
			return i;
	//    6   10:iload_1         
	//    7   11:ireturn         
		i = 0;
	//    8   12:iconst_0        
	//    9   13:istore_1        
		int j = 0;
	//   10   14:iconst_0        
	//   11   15:istore_2        
		for(; i < count; i++)
	//*  12   16:iload_1         
	//*  13   17:aload_0         
	//*  14   18:getfield        #30  <Field int count>
	//*  15   21:icmpge          54
			j += zzbav.zzd(zzdyy[i] >>> 3, (zzbah)zzdwh[i]);
	//   16   24:iload_2         
	//   17   25:aload_0         
	//   18   26:getfield        #32  <Field int[] zzdyy>
	//   19   29:iload_1         
	//   20   30:iaload          
	//   21   31:iconst_3        
	//   22   32:iushr           
	//   23   33:aload_0         
	//   24   34:getfield        #34  <Field Object[] zzdwh>
	//   25   37:iload_1         
	//   26   38:aaload          
	//   27   39:checkcast       #95  <Class zzbah>
	//   28   42:invokestatic    #177 <Method int zzbav.zzd(int, zzbah)>
	//   29   45:iadd            
	//   30   46:istore_2        

	//   31   47:iload_1         
	//   32   48:iconst_1        
	//   33   49:iadd            
	//   34   50:istore_1        
	//*  35   51:goto            16
		zzdtu = j;
	//   36   54:aload_0         
	//   37   55:iload_2         
	//   38   56:putfield        #28  <Field int zzdtu>
		return j;
	//   39   59:iload_2         
	//   40   60:ireturn         
	}

	final void zzb(int i, Object obj)
	{
		if(!zzdpi)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field boolean zzdpi>
	//*   2    4:ifne            15
			throw new UnsupportedOperationException();
	//    3    7:new             #179 <Class UnsupportedOperationException>
	//    4   10:dup             
	//    5   11:invokespecial   #180 <Method void UnsupportedOperationException()>
	//    6   14:athrow          
		if(count == zzdyy.length)
	//*   7   15:aload_0         
	//*   8   16:getfield        #30  <Field int count>
	//*   9   19:aload_0         
	//*  10   20:getfield        #32  <Field int[] zzdyy>
	//*  11   23:arraylength     
	//*  12   24:icmpne          79
		{
			int j;
			if(count < 4)
	//*  13   27:aload_0         
	//*  14   28:getfield        #30  <Field int count>
	//*  15   31:iconst_4        
	//*  16   32:icmpge          41
				j = 8;
	//   17   35:bipush          8
	//   18   37:istore_3        
			else
	//*  19   38:goto            48
				j = count >> 1;
	//   20   41:aload_0         
	//   21   42:getfield        #30  <Field int count>
	//   22   45:iconst_1        
	//   23   46:ishr            
	//   24   47:istore_3        
			j = count + j;
	//   25   48:aload_0         
	//   26   49:getfield        #30  <Field int count>
	//   27   52:iload_3         
	//   28   53:iadd            
	//   29   54:istore_3        
			zzdyy = Arrays.copyOf(zzdyy, j);
	//   30   55:aload_0         
	//   31   56:aload_0         
	//   32   57:getfield        #32  <Field int[] zzdyy>
	//   33   60:iload_3         
	//   34   61:invokestatic    #44  <Method int[] Arrays.copyOf(int[], int)>
	//   35   64:putfield        #32  <Field int[] zzdyy>
			zzdwh = Arrays.copyOf(zzdwh, j);
	//   36   67:aload_0         
	//   37   68:aload_0         
	//   38   69:getfield        #34  <Field Object[] zzdwh>
	//   39   72:iload_3         
	//   40   73:invokestatic    #53  <Method Object[] Arrays.copyOf(Object[], int)>
	//   41   76:putfield        #34  <Field Object[] zzdwh>
		}
		zzdyy[count] = i;
	//   42   79:aload_0         
	//   43   80:getfield        #32  <Field int[] zzdyy>
	//   44   83:aload_0         
	//   45   84:getfield        #30  <Field int count>
	//   46   87:iload_1         
	//   47   88:iastore         
		zzdwh[count] = obj;
	//   48   89:aload_0         
	//   49   90:getfield        #34  <Field Object[] zzdwh>
	//   50   93:aload_0         
	//   51   94:getfield        #30  <Field int count>
	//   52   97:aload_2         
	//   53   98:aastore         
		count = count + 1;
	//   54   99:aload_0         
	//   55  100:aload_0         
	//   56  101:getfield        #30  <Field int count>
	//   57  104:iconst_1        
	//   58  105:iadd            
	//   59  106:putfield        #30  <Field int count>
	//   60  109:return          
	}

	public final void zzb(zzbey zzbey1)
		throws IOException
	{
		if(count == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field int count>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(zzbey1.zzacn() == zzbbo.zze.zzdul)
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #78  <Method int zzbey.zzacn()>
	//*   6   14:getstatic       #83  <Field int zzbbo$zze.zzdul>
	//*   7   17:icmpne          54
		{
			for(int i = 0; i < count; i++)
	//*   8   20:iconst_0        
	//*   9   21:istore_2        
	//*  10   22:iload_2         
	//*  11   23:aload_0         
	//*  12   24:getfield        #30  <Field int count>
	//*  13   27:icmpge          53
				zzb(zzdyy[i], zzdwh[i], zzbey1);
	//   14   30:aload_0         
	//   15   31:getfield        #32  <Field int[] zzdyy>
	//   16   34:iload_2         
	//   17   35:iaload          
	//   18   36:aload_0         
	//   19   37:getfield        #34  <Field Object[] zzdwh>
	//   20   40:iload_2         
	//   21   41:aaload          
	//   22   42:aload_1         
	//   23   43:invokestatic    #182 <Method void zzb(int, Object, zzbey)>

	//   24   46:iload_2         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_2        
	//*  28   50:goto            22
			return;
	//   29   53:return          
		}
		for(int j = count - 1; j >= 0; j--)
	//*  30   54:aload_0         
	//*  31   55:getfield        #30  <Field int count>
	//*  32   58:iconst_1        
	//*  33   59:isub            
	//*  34   60:istore_2        
	//*  35   61:iload_2         
	//*  36   62:iflt            88
			zzb(zzdyy[j], zzdwh[j], zzbey1);
	//   37   65:aload_0         
	//   38   66:getfield        #32  <Field int[] zzdyy>
	//   39   69:iload_2         
	//   40   70:iaload          
	//   41   71:aload_0         
	//   42   72:getfield        #34  <Field Object[] zzdwh>
	//   43   75:iload_2         
	//   44   76:aaload          
	//   45   77:aload_1         
	//   46   78:invokestatic    #182 <Method void zzb(int, Object, zzbey)>

	//   47   81:iload_2         
	//   48   82:iconst_1        
	//   49   83:isub            
	//   50   84:istore_2        
	//*  51   85:goto            61
	//   52   88:return          
	}

	private static final zzbef zzdyx = new zzbef(0, new int[0], new Object[0], false);
	private int count;
	private boolean zzdpi;
	private int zzdtu;
	private Object zzdwh[];
	private int zzdyy[];

	static 
	{
	//    0    0:new             #2   <Class zzbef>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:newarray        int[]
	//    5    8:iconst_0        
	//    6    9:anewarray       Object[]
	//    7   12:iconst_0        
	//    8   13:invokespecial   #21  <Method void zzbef(int, int[], Object[], boolean)>
	//    9   16:putstatic       #23  <Field zzbef zzdyx>
	//*  10   19:return          
	}
}
