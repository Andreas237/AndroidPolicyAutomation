// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zziq, zzio, zzgc, zzgd, 
//			zzjj, zzfl, zzfp, zziu, 
//			zzha, zzgm, zzfe, zzhf, 
//			zzgo, zzeo, zzfy, zzgt, 
//			zzfz, zzhw

final class zzhy
{

	static Object zza(int i, int j, Object obj, zzio zzio1)
	{
		Object obj1 = obj;
	//    0    0:aload_2         
	//    1    1:astore          4
		if(obj == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       13
			obj1 = zzio1.zzhd();
	//    4    7:aload_3         
	//    5    8:invokevirtual   #44  <Method Object zzio.zzhd()>
	//    6   11:astore          4
		zzio1.zza(obj1, i, j);
	//    7   13:aload_3         
	//    8   14:aload           4
	//    9   16:iload_0         
	//   10   17:iload_1         
	//   11   18:i2l             
	//   12   19:invokevirtual   #47  <Method void zzio.zza(Object, int, long)>
		return obj1;
	//   13   22:aload           4
	//   14   24:areturn         
	}

	static Object zza(int i, List list, zzgc zzgc1, Object obj, zzio zzio1)
	{
		if(zzgc1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       6
			return obj;
	//    2    4:aload_3         
	//    3    5:areturn         
		int l = list.size();
	//    4    6:aload_1         
	//    5    7:invokeinterface #56  <Method int List.size()>
	//    6   12:istore          7
		int j = 0;
	//    7   14:iconst_0        
	//    8   15:istore          5
		int k = 0;
	//    9   17:iconst_0        
	//   10   18:istore          6
		for(; j < l; j++)
	//*  11   20:iload           5
	//*  12   22:iload           7
	//*  13   24:icmpge          103
		{
			int i1 = ((Integer)list.get(j)).intValue();
	//   14   27:aload_1         
	//   15   28:iload           5
	//   16   30:invokeinterface #60  <Method Object List.get(int)>
	//   17   35:checkcast       #62  <Class Integer>
	//   18   38:invokevirtual   #65  <Method int Integer.intValue()>
	//   19   41:istore          8
			if(zzgc1.zzf(i1) != null)
	//*  20   43:aload_2         
	//*  21   44:iload           8
	//*  22   46:invokeinterface #71  <Method zzgb zzgc.zzf(int)>
	//*  23   51:ifnull          84
			{
				if(j != k)
	//*  24   54:iload           5
	//*  25   56:iload           6
	//*  26   58:icmpeq          75
					list.set(k, ((Object) (Integer.valueOf(i1))));
	//   27   61:aload_1         
	//   28   62:iload           6
	//   29   64:iload           8
	//   30   66:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//   31   69:invokeinterface #79  <Method Object List.set(int, Object)>
	//   32   74:pop             
				k++;
	//   33   75:iload           6
	//   34   77:iconst_1        
	//   35   78:iadd            
	//   36   79:istore          6
			} else
	//*  37   81:goto            94
			{
				obj = zza(i, i1, obj, zzio1);
	//   38   84:iload_0         
	//   39   85:iload           8
	//   40   87:aload_3         
	//   41   88:aload           4
	//   42   90:invokestatic    #81  <Method Object zza(int, int, Object, zzio)>
	//   43   93:astore_3        
			}
		}

	//   44   94:iload           5
	//   45   96:iconst_1        
	//   46   97:iadd            
	//   47   98:istore          5
	//*  48  100:goto            20
		if(k != l)
	//*  49  103:iload           6
	//*  50  105:iload           7
	//*  51  107:icmpeq          125
			list.subList(k, l).clear();
	//   52  110:aload_1         
	//   53  111:iload           6
	//   54  113:iload           7
	//   55  115:invokeinterface #85  <Method List List.subList(int, int)>
	//   56  120:invokeinterface #88  <Method void List.clear()>
		return obj;
	//   57  125:aload_3         
	//   58  126:areturn         
	}

	static Object zza(int i, List list, zzgd zzgd1, Object obj, zzio zzio1)
	{
		if(zzgd1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       6
			return obj;
	//    2    4:aload_3         
	//    3    5:areturn         
		Object obj1;
		if(list instanceof RandomAccess)
	//*   4    6:aload_1         
	//*   5    7:instanceof      #92  <Class RandomAccess>
	//*   6   10:ifeq            137
		{
			int i1 = list.size();
	//    7   13:aload_1         
	//    8   14:invokeinterface #56  <Method int List.size()>
	//    9   19:istore          7
			int j = 0;
	//   10   21:iconst_0        
	//   11   22:istore          5
			int l = 0;
	//   12   24:iconst_0        
	//   13   25:istore          6
			for(; j < i1; j++)
	//*  14   27:iload           5
	//*  15   29:iload           7
	//*  16   31:icmpge          110
			{
				int j1 = ((Integer)list.get(j)).intValue();
	//   17   34:aload_1         
	//   18   35:iload           5
	//   19   37:invokeinterface #60  <Method Object List.get(int)>
	//   20   42:checkcast       #62  <Class Integer>
	//   21   45:invokevirtual   #65  <Method int Integer.intValue()>
	//   22   48:istore          8
				if(zzgd1.zzh(j1))
	//*  23   50:aload_2         
	//*  24   51:iload           8
	//*  25   53:invokeinterface #98  <Method boolean zzgd.zzh(int)>
	//*  26   58:ifeq            91
				{
					if(j != l)
	//*  27   61:iload           5
	//*  28   63:iload           6
	//*  29   65:icmpeq          82
						list.set(l, ((Object) (Integer.valueOf(j1))));
	//   30   68:aload_1         
	//   31   69:iload           6
	//   32   71:iload           8
	//   33   73:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//   34   76:invokeinterface #79  <Method Object List.set(int, Object)>
	//   35   81:pop             
					l++;
	//   36   82:iload           6
	//   37   84:iconst_1        
	//   38   85:iadd            
	//   39   86:istore          6
				} else
	//*  40   88:goto            101
				{
					obj = zza(i, j1, obj, zzio1);
	//   41   91:iload_0         
	//   42   92:iload           8
	//   43   94:aload_3         
	//   44   95:aload           4
	//   45   97:invokestatic    #81  <Method Object zza(int, int, Object, zzio)>
	//   46  100:astore_3        
				}
			}

	//   47  101:iload           5
	//   48  103:iconst_1        
	//   49  104:iadd            
	//   50  105:istore          5
	//*  51  107:goto            27
			obj1 = obj;
	//   52  110:aload_3         
	//   53  111:astore          9
			if(l != i1)
	//*  54  113:iload           6
	//*  55  115:iload           7
	//*  56  117:icmpeq          206
			{
				list.subList(l, i1).clear();
	//   57  120:aload_1         
	//   58  121:iload           6
	//   59  123:iload           7
	//   60  125:invokeinterface #85  <Method List List.subList(int, int)>
	//   61  130:invokeinterface #88  <Method void List.clear()>
				return obj;
	//   62  135:aload_3         
	//   63  136:areturn         
			}
		} else
		{
			Iterator iterator = list.iterator();
	//   64  137:aload_1         
	//   65  138:invokeinterface #102 <Method Iterator List.iterator()>
	//   66  143:astore          10
			list = ((List) (obj));
	//   67  145:aload_3         
	//   68  146:astore_1        
			do
			{
				obj1 = ((Object) (list));
	//   69  147:aload_1         
	//   70  148:astore          9
				if(!iterator.hasNext())
					break;
	//   71  150:aload           10
	//   72  152:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//   73  157:ifeq            206
				int k = ((Integer)iterator.next()).intValue();
	//   74  160:aload           10
	//   75  162:invokeinterface #111 <Method Object Iterator.next()>
	//   76  167:checkcast       #62  <Class Integer>
	//   77  170:invokevirtual   #65  <Method int Integer.intValue()>
	//   78  173:istore          5
				if(!zzgd1.zzh(k))
	//*  79  175:aload_2         
	//*  80  176:iload           5
	//*  81  178:invokeinterface #98  <Method boolean zzgd.zzh(int)>
	//*  82  183:ifne            147
				{
					list = ((List) (zza(i, k, ((Object) (list)), zzio1)));
	//   83  186:iload_0         
	//   84  187:iload           5
	//   85  189:aload_1         
	//   86  190:aload           4
	//   87  192:invokestatic    #81  <Method Object zza(int, int, Object, zzio)>
	//   88  195:astore_1        
					iterator.remove();
	//   89  196:aload           10
	//   90  198:invokeinterface #114 <Method void Iterator.remove()>
				}
			} while(true);
	//   91  203:goto            147
		}
		return obj1;
	//   92  206:aload           9
	//   93  208:areturn         
	}

	public static void zza(int i, List list, zzjj zzjj1)
		throws IOException
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          21
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #121 <Method boolean List.isEmpty()>
	//*   4   10:ifne            21
			zzjj1.zza(i, list);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:invokeinterface #126 <Method void zzjj.zza(int, List)>
	//    9   21:return          
	}

	public static void zza(int i, List list, zzjj zzjj1, zzhw zzhw)
		throws IOException
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #121 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			zzjj1.zza(i, list, zzhw);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:aload_3         
	//    9   17:invokeinterface #132 <Method void zzjj.zza(int, List, zzhw)>
	//   10   22:return          
	}

	public static void zza(int i, List list, zzjj zzjj1, boolean flag)
		throws IOException
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #121 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			zzjj1.zzg(i, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #138 <Method void zzjj.zzg(int, List, boolean)>
	//   10   22:return          
	}

	static void zza(zzfl zzfl1, Object obj, Object obj1)
	{
		obj1 = ((Object) (zzfl1.zzc(obj1)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #146 <Method zzfp zzfl.zzc(Object)>
	//    3    5:astore_2        
		if(!((zzfp) (obj1)).isEmpty())
	//*   4    6:aload_2         
	//*   5    7:invokevirtual   #149 <Method boolean zzfp.isEmpty()>
	//*   6   10:ifne            22
			zzfl1.zzd(obj).zza(((zzfp) (obj1)));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #152 <Method zzfp zzfl.zzd(Object)>
	//   10   18:aload_2         
	//   11   19:invokevirtual   #155 <Method void zzfp.zza(zzfp)>
	//   12   22:return          
	}

	static void zza(zzha zzha1, Object obj, Object obj1, long l)
	{
		zziu.zza(obj, l, zzha1.zzb(zziu.zzp(obj, l), zziu.zzp(obj1, l)));
	//    0    0:aload_1         
	//    1    1:lload_3         
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:lload_3         
	//    5    5:invokestatic    #163 <Method Object zziu.zzp(Object, long)>
	//    6    8:aload_2         
	//    7    9:lload_3         
	//    8   10:invokestatic    #163 <Method Object zziu.zzp(Object, long)>
	//    9   13:invokeinterface #169 <Method Object zzha.zzb(Object, Object)>
	//   10   18:invokestatic    #172 <Method void zziu.zza(Object, long, Object)>
	//   11   21:return          
	}

	static void zza(zzio zzio1, Object obj, Object obj1)
	{
		zzio1.zze(obj, zzio1.zzg(zzio1.zzt(obj), zzio1.zzt(obj1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:aload_1         
	//    5    5:invokevirtual   #178 <Method Object zzio.zzt(Object)>
	//    6    8:aload_0         
	//    7    9:aload_2         
	//    8   10:invokevirtual   #178 <Method Object zzio.zzt(Object)>
	//    9   13:invokevirtual   #180 <Method Object zzio.zzg(Object, Object)>
	//   10   16:invokevirtual   #184 <Method void zzio.zze(Object, Object)>
	//   11   19:return          
	}

	public static void zzb(int i, List list, zzjj zzjj1)
		throws IOException
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          21
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #121 <Method boolean List.isEmpty()>
	//*   4   10:ifne            21
			zzjj1.zzb(i, list);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:invokeinterface #187 <Method void zzjj.zzb(int, List)>
	//    9   21:return          
	}

	public static void zzb(int i, List list, zzjj zzjj1, zzhw zzhw)
		throws IOException
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #121 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			zzjj1.zzb(i, list, zzhw);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:aload_3         
	//    9   17:invokeinterface #190 <Method void zzjj.zzb(int, List, zzhw)>
	//   10   22:return          
	}

	public static void zzb(int i, List list, zzjj zzjj1, boolean flag)
		throws IOException
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #121 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			zzjj1.zzf(i, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #192 <Method void zzjj.zzf(int, List, boolean)>
	//   10   22:return          
	}

	static int zzc(int i, Object obj, zzhw zzhw)
	{
		if(obj instanceof zzgm)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #196 <Class zzgm>
	//*   2    4:ifeq            16
			return zzfe.zza(i, (zzgm)obj);
	//    3    7:iload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #196 <Class zzgm>
	//    6   12:invokestatic    #201 <Method int zzfe.zza(int, zzgm)>
	//    7   15:ireturn         
		else
			return zzfe.zzb(i, (zzhf)obj, zzhw);
	//    8   16:iload_0         
	//    9   17:aload_1         
	//   10   18:checkcast       #203 <Class zzhf>
	//   11   21:aload_2         
	//   12   22:invokestatic    #206 <Method int zzfe.zzb(int, zzhf, zzhw)>
	//   13   25:ireturn         
	}

	static int zzc(int i, List list)
	{
		int l = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #56  <Method int List.size()>
	//    2    6:istore          5
		int j = 0;
	//    3    8:iconst_0        
	//    4    9:istore_2        
		boolean flag = false;
	//    5   10:iconst_0        
	//    6   11:istore          4
		if(l == 0)
	//*   7   13:iload           5
	//*   8   15:ifne            20
			return 0;
	//    9   18:iconst_0        
	//   10   19:ireturn         
		int k = zzfe.zzav(i) * l;
	//   11   20:iload_0         
	//   12   21:invokestatic    #211 <Method int zzfe.zzav(int)>
	//   13   24:iload           5
	//   14   26:imul            
	//   15   27:istore_3        
		i = k;
	//   16   28:iload_3         
	//   17   29:istore_0        
		if(list instanceof zzgo)
	//*  18   30:aload_1         
	//*  19   31:instanceof      #213 <Class zzgo>
	//*  20   34:ifeq            104
		{
			list = ((List) ((zzgo)list));
	//   21   37:aload_1         
	//   22   38:checkcast       #213 <Class zzgo>
	//   23   41:astore_1        
			i = k;
	//   24   42:iload_3         
	//   25   43:istore_0        
			j = ((int) (flag));
	//   26   44:iload           4
	//   27   46:istore_2        
			do
			{
				k = i;
	//   28   47:iload_0         
	//   29   48:istore_3        
				if(j >= l)
					break;
	//   30   49:iload_2         
	//   31   50:iload           5
	//   32   52:icmpge          161
				Object obj = ((zzgo) (list)).getRaw(j);
	//   33   55:aload_1         
	//   34   56:iload_2         
	//   35   57:invokeinterface #216 <Method Object zzgo.getRaw(int)>
	//   36   62:astore          6
				if(obj instanceof zzeo)
	//*  37   64:aload           6
	//*  38   66:instanceof      #218 <Class zzeo>
	//*  39   69:ifeq            86
					i += zzfe.zzb((zzeo)obj);
	//   40   72:iload_0         
	//   41   73:aload           6
	//   42   75:checkcast       #218 <Class zzeo>
	//   43   78:invokestatic    #221 <Method int zzfe.zzb(zzeo)>
	//   44   81:iadd            
	//   45   82:istore_0        
				else
	//*  46   83:goto            97
					i += zzfe.zzn((String)obj);
	//   47   86:iload_0         
	//   48   87:aload           6
	//   49   89:checkcast       #223 <Class String>
	//   50   92:invokestatic    #227 <Method int zzfe.zzn(String)>
	//   51   95:iadd            
	//   52   96:istore_0        
				j++;
	//   53   97:iload_2         
	//   54   98:iconst_1        
	//   55   99:iadd            
	//   56  100:istore_2        
			} while(true);
	//   57  101:goto            47
		} else
		{
			do
			{
				k = i;
	//   58  104:iload_0         
	//   59  105:istore_3        
				if(j >= l)
					break;
	//   60  106:iload_2         
	//   61  107:iload           5
	//   62  109:icmpge          161
				Object obj1 = list.get(j);
	//   63  112:aload_1         
	//   64  113:iload_2         
	//   65  114:invokeinterface #60  <Method Object List.get(int)>
	//   66  119:astore          6
				if(obj1 instanceof zzeo)
	//*  67  121:aload           6
	//*  68  123:instanceof      #218 <Class zzeo>
	//*  69  126:ifeq            143
					i += zzfe.zzb((zzeo)obj1);
	//   70  129:iload_0         
	//   71  130:aload           6
	//   72  132:checkcast       #218 <Class zzeo>
	//   73  135:invokestatic    #221 <Method int zzfe.zzb(zzeo)>
	//   74  138:iadd            
	//   75  139:istore_0        
				else
	//*  76  140:goto            154
					i += zzfe.zzn((String)obj1);
	//   77  143:iload_0         
	//   78  144:aload           6
	//   79  146:checkcast       #223 <Class String>
	//   80  149:invokestatic    #227 <Method int zzfe.zzn(String)>
	//   81  152:iadd            
	//   82  153:istore_0        
				j++;
	//   83  154:iload_2         
	//   84  155:iconst_1        
	//   85  156:iadd            
	//   86  157:istore_2        
			} while(true);
	//   87  158:goto            104
		}
		return k;
	//   88  161:iload_3         
	//   89  162:ireturn         
	}

	static int zzc(int i, List list, zzhw zzhw)
	{
		int k = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #56  <Method int List.size()>
	//    2    6:istore          4
		int j = 0;
	//    3    8:iconst_0        
	//    4    9:istore_3        
		if(k == 0)
	//*   5   10:iload           4
	//*   6   12:ifne            17
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		i = zzfe.zzav(i) * k;
	//    9   17:iload_0         
	//   10   18:invokestatic    #211 <Method int zzfe.zzav(int)>
	//   11   21:iload           4
	//   12   23:imul            
	//   13   24:istore_0        
		for(; j < k; j++)
	//*  14   25:iload_3         
	//*  15   26:iload           4
	//*  16   28:icmpge          81
		{
			Object obj = list.get(j);
	//   17   31:aload_1         
	//   18   32:iload_3         
	//   19   33:invokeinterface #60  <Method Object List.get(int)>
	//   20   38:astore          5
			if(obj instanceof zzgm)
	//*  21   40:aload           5
	//*  22   42:instanceof      #196 <Class zzgm>
	//*  23   45:ifeq            62
				i += zzfe.zza((zzgm)obj);
	//   24   48:iload_0         
	//   25   49:aload           5
	//   26   51:checkcast       #196 <Class zzgm>
	//   27   54:invokestatic    #232 <Method int zzfe.zza(zzgm)>
	//   28   57:iadd            
	//   29   58:istore_0        
			else
	//*  30   59:goto            74
				i += zzfe.zzb((zzhf)obj, zzhw);
	//   31   62:iload_0         
	//   32   63:aload           5
	//   33   65:checkcast       #203 <Class zzhf>
	//   34   68:aload_2         
	//   35   69:invokestatic    #235 <Method int zzfe.zzb(zzhf, zzhw)>
	//   36   72:iadd            
	//   37   73:istore_0        
		}

	//   38   74:iload_3         
	//   39   75:iconst_1        
	//   40   76:iadd            
	//   41   77:istore_3        
	//*  42   78:goto            25
		return i;
	//   43   81:iload_0         
	//   44   82:ireturn         
	}

	public static void zzc(int i, List list, zzjj zzjj1, boolean flag)
		throws IOException
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #121 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			zzjj1.zzc(i, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #238 <Method void zzjj.zzc(int, List, boolean)>
	//   10   22:return          
	}

	static int zzd(int i, List list)
	{
		int k = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #56  <Method int List.size()>
	//    2    6:istore_3        
		int j = 0;
	//    3    7:iconst_0        
	//    4    8:istore_2        
		if(k == 0)
	//*   5    9:iload_3         
	//*   6   10:ifne            15
			return 0;
	//    7   13:iconst_0        
	//    8   14:ireturn         
		k *= zzfe.zzav(i);
	//    9   15:iload_3         
	//   10   16:iload_0         
	//   11   17:invokestatic    #211 <Method int zzfe.zzav(int)>
	//   12   20:imul            
	//   13   21:istore_3        
		i = j;
	//   14   22:iload_2         
	//   15   23:istore_0        
		j = k;
	//   16   24:iload_3         
	//   17   25:istore_2        
		for(; i < list.size(); i++)
	//*  18   26:iload_0         
	//*  19   27:aload_1         
	//*  20   28:invokeinterface #56  <Method int List.size()>
	//*  21   33:icmpge          59
			j += zzfe.zzb((zzeo)list.get(i));
	//   22   36:iload_2         
	//   23   37:aload_1         
	//   24   38:iload_0         
	//   25   39:invokeinterface #60  <Method Object List.get(int)>
	//   26   44:checkcast       #218 <Class zzeo>
	//   27   47:invokestatic    #221 <Method int zzfe.zzb(zzeo)>
	//   28   50:iadd            
	//   29   51:istore_2        

	//   30   52:iload_0         
	//   31   53:iconst_1        
	//   32   54:iadd            
	//   33   55:istore_0        
	//*  34   56:goto            26
		return j;
	//   35   59:iload_2         
	//   36   60:ireturn         
	}

	static int zzd(int i, List list, zzhw zzhw)
	{
		int l = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #56  <Method int List.size()>
	//    2    6:istore          5
		int j = 0;
	//    3    8:iconst_0        
	//    4    9:istore_3        
		if(l == 0)
	//*   5   10:iload           5
	//*   6   12:ifne            17
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		int k = 0;
	//    9   17:iconst_0        
	//   10   18:istore          4
		for(; j < l; j++)
	//*  11   20:iload_3         
	//*  12   21:iload           5
	//*  13   23:icmpge          53
			k += zzfe.zzc(i, (zzhf)list.get(j), zzhw);
	//   14   26:iload           4
	//   15   28:iload_0         
	//   16   29:aload_1         
	//   17   30:iload_3         
	//   18   31:invokeinterface #60  <Method Object List.get(int)>
	//   19   36:checkcast       #203 <Class zzhf>
	//   20   39:aload_2         
	//   21   40:invokestatic    #242 <Method int zzfe.zzc(int, zzhf, zzhw)>
	//   22   43:iadd            
	//   23   44:istore          4

	//   24   46:iload_3         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_3        
	//*  28   50:goto            20
		return k;
	//   29   53:iload           4
	//   30   55:ireturn         
	}

	public static void zzd(int i, List list, zzjj zzjj1, boolean flag)
		throws IOException
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #121 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			zzjj1.zzd(i, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #245 <Method void zzjj.zzd(int, List, boolean)>
	//   10   22:return          
	}

	static boolean zzd(Object obj, Object obj1)
	{
		return obj == obj1 || obj != null && obj.equals(obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       22
	//    3    5:aload_0         
	//    4    6:ifnull          20
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #250 <Method boolean Object.equals(Object)>
	//    8   14:ifeq            20
	//    9   17:goto            22
	//   10   20:iconst_0        
	//   11   21:ireturn         
	//   12   22:iconst_1        
	//   13   23:ireturn         
	}

	public static void zze(int i, List list, zzjj zzjj1, boolean flag)
		throws IOException
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #121 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			zzjj1.zzn(i, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #252 <Method void zzjj.zzn(int, List, boolean)>
	//   10   22:return          
	}

	public static void zzf(int i, List list, zzjj zzjj1, boolean flag)
		throws IOException
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #121 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			zzjj1.zze(i, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #254 <Method void zzjj.zze(int, List, boolean)>
	//   10   22:return          
	}

	public static void zzg(int i, List list, zzjj zzjj1, boolean flag)
		throws IOException
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #121 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			zzjj1.zzl(i, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #257 <Method void zzjj.zzl(int, List, boolean)>
	//   10   22:return          
	}

	public static void zzg(Class class1)
	{
		if(!((Class) (com/google/android/gms/internal/vision/zzfy)).isAssignableFrom(class1))
	//*   0    0:ldc2            #260 <Class zzfy>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #266 <Method boolean Class.isAssignableFrom(Class)>
	//*   3    7:ifne            38
		{
			Class class2 = zzaaa;
	//    4   10:getstatic       #20  <Field Class zzaaa>
	//    5   13:astore_1        
			if(class2 != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          38
				if(class2.isAssignableFrom(class1))
	//*   8   18:aload_1         
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #266 <Method boolean Class.isAssignableFrom(Class)>
	//*  11   23:ifeq            27
					return;
	//   12   26:return          
				else
					throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
	//   13   27:new             #268 <Class IllegalArgumentException>
	//   14   30:dup             
	//   15   31:ldc2            #270 <String "Message classes must extend GeneratedMessage or GeneratedMessageLite">
	//   16   34:invokespecial   #273 <Method void IllegalArgumentException(String)>
	//   17   37:athrow          
		}
	//   18   38:return          
	}

	public static zzio zzgp()
	{
		return zzaab;
	//    0    0:getstatic       #26  <Field zzio zzaab>
	//    1    3:areturn         
	}

	public static zzio zzgq()
	{
		return zzaac;
	//    0    0:getstatic       #28  <Field zzio zzaac>
	//    1    3:areturn         
	}

	public static zzio zzgr()
	{
		return zzaad;
	//    0    0:getstatic       #35  <Field zzio zzaad>
	//    1    3:areturn         
	}

	private static Class zzgs()
	{
		Throwable throwable;
		Class class1;
		try
		{
			class1 = Class.forName("com.google.protobuf.GeneratedMessage");
	//    0    0:ldc2            #283 <String "com.google.protobuf.GeneratedMessage">
	//    1    3:invokestatic    #287 <Method Class Class.forName(String)>
	//    2    6:astore_0        
		}
	//*   3    7:aload_0         
	//*   4    8:areturn         
	//*   5    9:aconst_null     
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			return null;
		}
		return class1;
	//*   7   11:astore_0        
	//*   8   12:goto            9
	}

	private static Class zzgt()
	{
		Throwable throwable;
		Class class1;
		try
		{
			class1 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
	//    0    0:ldc2            #291 <String "com.google.protobuf.UnknownFieldSetSchema">
	//    1    3:invokestatic    #287 <Method Class Class.forName(String)>
	//    2    6:astore_0        
		}
	//*   3    7:aload_0         
	//*   4    8:areturn         
	//*   5    9:aconst_null     
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			return null;
		}
		return class1;
	//*   7   11:astore_0        
	//*   8   12:goto            9
	}

	public static void zzh(int i, List list, zzjj zzjj1, boolean flag)
		throws IOException
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #121 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			zzjj1.zza(i, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #293 <Method void zzjj.zza(int, List, boolean)>
	//   10   22:return          
	}

	public static void zzi(int i, List list, zzjj zzjj1, boolean flag)
		throws IOException
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #121 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			zzjj1.zzj(i, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #298 <Method void zzjj.zzj(int, List, boolean)>
	//   10   22:return          
	}

	public static void zzj(int i, List list, zzjj zzjj1, boolean flag)
		throws IOException
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #121 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			zzjj1.zzm(i, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #301 <Method void zzjj.zzm(int, List, boolean)>
	//   10   22:return          
	}

	private static zzio zzk(boolean flag)
	{
		Object obj;
		try
		{
			obj = ((Object) (zzgt()));
	//    0    0:invokestatic    #303 <Method Class zzgt()>
	//    1    3:astore_1        
		}
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       10
	//*   4    8:aconst_null     
	//*   5    9:areturn         
	//*   6   10:aload_1         
	//*   7   11:iconst_1        
	//*   8   12:anewarray       Class[]
	//*   9   15:dup             
	//*  10   16:iconst_0        
	//*  11   17:getstatic       #308 <Field Class Boolean.TYPE>
	//*  12   20:aastore         
	//*  13   21:invokevirtual   #312 <Method Constructor Class.getConstructor(Class[])>
	//*  14   24:iconst_1        
	//*  15   25:anewarray       Object[]
	//*  16   28:dup             
	//*  17   29:iconst_0        
	//*  18   30:iload_0         
	//*  19   31:invokestatic    #315 <Method Boolean Boolean.valueOf(boolean)>
	//*  20   34:aastore         
	//*  21   35:invokevirtual   #321 <Method Object Constructor.newInstance(Object[])>
	//*  22   38:checkcast       #40  <Class zzio>
	//*  23   41:astore_1        
	//*  24   42:aload_1         
	//*  25   43:areturn         
		catch(Throwable throwable)
	//*  26   44:astore_1        
		{
			return null;
	//   27   45:aconst_null     
	//   28   46:areturn         
		}
		if(obj == null)
			return null;
		obj = ((Object) ((zzio)((Class) (obj)).getConstructor(new Class[] {
			Boolean.TYPE
		}).newInstance(new Object[] {
			Boolean.valueOf(flag)
		})));
		return ((zzio) (obj));
	}

	public static void zzk(int i, List list, zzjj zzjj1, boolean flag)
		throws IOException
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #121 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			zzjj1.zzb(i, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #324 <Method void zzjj.zzb(int, List, boolean)>
	//   10   22:return          
	}

	public static void zzl(int i, List list, zzjj zzjj1, boolean flag)
		throws IOException
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #121 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			zzjj1.zzk(i, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #326 <Method void zzjj.zzk(int, List, boolean)>
	//   10   22:return          
	}

	public static void zzm(int i, List list, zzjj zzjj1, boolean flag)
		throws IOException
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #121 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			zzjj1.zzh(i, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #328 <Method void zzjj.zzh(int, List, boolean)>
	//   10   22:return          
	}

	public static void zzn(int i, List list, zzjj zzjj1, boolean flag)
		throws IOException
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #121 <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			zzjj1.zzi(i, list, flag);
	//    5   13:aload_2         
	//    6   14:iload_0         
	//    7   15:aload_1         
	//    8   16:iload_3         
	//    9   17:invokeinterface #330 <Method void zzjj.zzi(int, List, boolean)>
	//   10   22:return          
	}

	static int zzo(int i, List list, boolean flag)
	{
		if(list.size() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #56  <Method int List.size()>
	//*   2    6:ifne            11
			return 0;
	//    3    9:iconst_0        
	//    4   10:ireturn         
		else
			return zzq(list) + list.size() * zzfe.zzav(i);
	//    5   11:aload_1         
	//    6   12:invokestatic    #337 <Method int zzq(List)>
	//    7   15:aload_1         
	//    8   16:invokeinterface #56  <Method int List.size()>
	//    9   21:iload_0         
	//   10   22:invokestatic    #211 <Method int zzfe.zzav(int)>
	//   11   25:imul            
	//   12   26:iadd            
	//   13   27:ireturn         
	}

	static int zzp(int i, List list, boolean flag)
	{
		int j = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #56  <Method int List.size()>
	//    2    6:istore_3        
		if(j == 0)
	//*   3    7:iload_3         
	//*   4    8:ifne            13
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		else
			return zzr(list) + j * zzfe.zzav(i);
	//    7   13:aload_1         
	//    8   14:invokestatic    #341 <Method int zzr(List)>
	//    9   17:iload_3         
	//   10   18:iload_0         
	//   11   19:invokestatic    #211 <Method int zzfe.zzav(int)>
	//   12   22:imul            
	//   13   23:iadd            
	//   14   24:ireturn         
	}

	static int zzq(int i, List list, boolean flag)
	{
		int j = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #56  <Method int List.size()>
	//    2    6:istore_3        
		if(j == 0)
	//*   3    7:iload_3         
	//*   4    8:ifne            13
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		else
			return zzs(list) + j * zzfe.zzav(i);
	//    7   13:aload_1         
	//    8   14:invokestatic    #344 <Method int zzs(List)>
	//    9   17:iload_3         
	//   10   18:iload_0         
	//   11   19:invokestatic    #211 <Method int zzfe.zzav(int)>
	//   12   22:imul            
	//   13   23:iadd            
	//   14   24:ireturn         
	}

	static int zzq(List list)
	{
		int j1 = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #56  <Method int List.size()>
	//    2    6:istore          4
		int k = 0;
	//    3    8:iconst_0        
	//    4    9:istore_2        
		int l = 0;
	//    5   10:iconst_0        
	//    6   11:istore_3        
		if(j1 == 0)
	//*   7   12:iload           4
	//*   8   14:ifne            19
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		if(list instanceof zzgt)
	//*  11   19:aload_0         
	//*  12   20:instanceof      #346 <Class zzgt>
	//*  13   23:ifeq            59
		{
			list = ((List) ((zzgt)list));
	//   14   26:aload_0         
	//   15   27:checkcast       #346 <Class zzgt>
	//   16   30:astore_0        
			int i = 0;
	//   17   31:iconst_0        
	//   18   32:istore_1        
			do
			{
				k = i;
	//   19   33:iload_1         
	//   20   34:istore_2        
				if(l >= j1)
					break;
	//   21   35:iload_3         
	//   22   36:iload           4
	//   23   38:icmpge          97
				i += zzfe.zzh(((zzgt) (list)).getLong(l));
	//   24   41:iload_1         
	//   25   42:aload_0         
	//   26   43:iload_3         
	//   27   44:invokevirtual   #350 <Method long zzgt.getLong(int)>
	//   28   47:invokestatic    #353 <Method int zzfe.zzh(long)>
	//   29   50:iadd            
	//   30   51:istore_1        
				l++;
	//   31   52:iload_3         
	//   32   53:iconst_1        
	//   33   54:iadd            
	//   34   55:istore_3        
			} while(true);
	//   35   56:goto            33
		} else
		{
			int j = 0;
	//   36   59:iconst_0        
	//   37   60:istore_1        
			int i1 = k;
	//   38   61:iload_2         
	//   39   62:istore_3        
			do
			{
				k = j;
	//   40   63:iload_1         
	//   41   64:istore_2        
				if(i1 >= j1)
					break;
	//   42   65:iload_3         
	//   43   66:iload           4
	//   44   68:icmpge          97
				j += zzfe.zzh(((Long)list.get(i1)).longValue());
	//   45   71:iload_1         
	//   46   72:aload_0         
	//   47   73:iload_3         
	//   48   74:invokeinterface #60  <Method Object List.get(int)>
	//   49   79:checkcast       #355 <Class Long>
	//   50   82:invokevirtual   #359 <Method long Long.longValue()>
	//   51   85:invokestatic    #353 <Method int zzfe.zzh(long)>
	//   52   88:iadd            
	//   53   89:istore_1        
				i1++;
	//   54   90:iload_3         
	//   55   91:iconst_1        
	//   56   92:iadd            
	//   57   93:istore_3        
			} while(true);
	//   58   94:goto            63
		}
		return k;
	//   59   97:iload_2         
	//   60   98:ireturn         
	}

	static int zzr(int i, List list, boolean flag)
	{
		int j = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #56  <Method int List.size()>
	//    2    6:istore_3        
		if(j == 0)
	//*   3    7:iload_3         
	//*   4    8:ifne            13
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		else
			return zzt(list) + j * zzfe.zzav(i);
	//    7   13:aload_1         
	//    8   14:invokestatic    #362 <Method int zzt(List)>
	//    9   17:iload_3         
	//   10   18:iload_0         
	//   11   19:invokestatic    #211 <Method int zzfe.zzav(int)>
	//   12   22:imul            
	//   13   23:iadd            
	//   14   24:ireturn         
	}

	static int zzr(List list)
	{
		int j1 = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #56  <Method int List.size()>
	//    2    6:istore          4
		int k = 0;
	//    3    8:iconst_0        
	//    4    9:istore_2        
		int l = 0;
	//    5   10:iconst_0        
	//    6   11:istore_3        
		if(j1 == 0)
	//*   7   12:iload           4
	//*   8   14:ifne            19
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		if(list instanceof zzgt)
	//*  11   19:aload_0         
	//*  12   20:instanceof      #346 <Class zzgt>
	//*  13   23:ifeq            59
		{
			list = ((List) ((zzgt)list));
	//   14   26:aload_0         
	//   15   27:checkcast       #346 <Class zzgt>
	//   16   30:astore_0        
			int i = 0;
	//   17   31:iconst_0        
	//   18   32:istore_1        
			do
			{
				k = i;
	//   19   33:iload_1         
	//   20   34:istore_2        
				if(l >= j1)
					break;
	//   21   35:iload_3         
	//   22   36:iload           4
	//   23   38:icmpge          97
				i += zzfe.zzi(((zzgt) (list)).getLong(l));
	//   24   41:iload_1         
	//   25   42:aload_0         
	//   26   43:iload_3         
	//   27   44:invokevirtual   #350 <Method long zzgt.getLong(int)>
	//   28   47:invokestatic    #365 <Method int zzfe.zzi(long)>
	//   29   50:iadd            
	//   30   51:istore_1        
				l++;
	//   31   52:iload_3         
	//   32   53:iconst_1        
	//   33   54:iadd            
	//   34   55:istore_3        
			} while(true);
	//   35   56:goto            33
		} else
		{
			int j = 0;
	//   36   59:iconst_0        
	//   37   60:istore_1        
			int i1 = k;
	//   38   61:iload_2         
	//   39   62:istore_3        
			do
			{
				k = j;
	//   40   63:iload_1         
	//   41   64:istore_2        
				if(i1 >= j1)
					break;
	//   42   65:iload_3         
	//   43   66:iload           4
	//   44   68:icmpge          97
				j += zzfe.zzi(((Long)list.get(i1)).longValue());
	//   45   71:iload_1         
	//   46   72:aload_0         
	//   47   73:iload_3         
	//   48   74:invokeinterface #60  <Method Object List.get(int)>
	//   49   79:checkcast       #355 <Class Long>
	//   50   82:invokevirtual   #359 <Method long Long.longValue()>
	//   51   85:invokestatic    #365 <Method int zzfe.zzi(long)>
	//   52   88:iadd            
	//   53   89:istore_1        
				i1++;
	//   54   90:iload_3         
	//   55   91:iconst_1        
	//   56   92:iadd            
	//   57   93:istore_3        
			} while(true);
	//   58   94:goto            63
		}
		return k;
	//   59   97:iload_2         
	//   60   98:ireturn         
	}

	static int zzs(int i, List list, boolean flag)
	{
		int j = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #56  <Method int List.size()>
	//    2    6:istore_3        
		if(j == 0)
	//*   3    7:iload_3         
	//*   4    8:ifne            13
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		else
			return zzu(list) + j * zzfe.zzav(i);
	//    7   13:aload_1         
	//    8   14:invokestatic    #368 <Method int zzu(List)>
	//    9   17:iload_3         
	//   10   18:iload_0         
	//   11   19:invokestatic    #211 <Method int zzfe.zzav(int)>
	//   12   22:imul            
	//   13   23:iadd            
	//   14   24:ireturn         
	}

	static int zzs(List list)
	{
		int j1 = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #56  <Method int List.size()>
	//    2    6:istore          4
		int k = 0;
	//    3    8:iconst_0        
	//    4    9:istore_2        
		int l = 0;
	//    5   10:iconst_0        
	//    6   11:istore_3        
		if(j1 == 0)
	//*   7   12:iload           4
	//*   8   14:ifne            19
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		if(list instanceof zzgt)
	//*  11   19:aload_0         
	//*  12   20:instanceof      #346 <Class zzgt>
	//*  13   23:ifeq            59
		{
			list = ((List) ((zzgt)list));
	//   14   26:aload_0         
	//   15   27:checkcast       #346 <Class zzgt>
	//   16   30:astore_0        
			int i = 0;
	//   17   31:iconst_0        
	//   18   32:istore_1        
			do
			{
				k = i;
	//   19   33:iload_1         
	//   20   34:istore_2        
				if(l >= j1)
					break;
	//   21   35:iload_3         
	//   22   36:iload           4
	//   23   38:icmpge          97
				i += zzfe.zzj(((zzgt) (list)).getLong(l));
	//   24   41:iload_1         
	//   25   42:aload_0         
	//   26   43:iload_3         
	//   27   44:invokevirtual   #350 <Method long zzgt.getLong(int)>
	//   28   47:invokestatic    #370 <Method int zzfe.zzj(long)>
	//   29   50:iadd            
	//   30   51:istore_1        
				l++;
	//   31   52:iload_3         
	//   32   53:iconst_1        
	//   33   54:iadd            
	//   34   55:istore_3        
			} while(true);
	//   35   56:goto            33
		} else
		{
			int j = 0;
	//   36   59:iconst_0        
	//   37   60:istore_1        
			int i1 = k;
	//   38   61:iload_2         
	//   39   62:istore_3        
			do
			{
				k = j;
	//   40   63:iload_1         
	//   41   64:istore_2        
				if(i1 >= j1)
					break;
	//   42   65:iload_3         
	//   43   66:iload           4
	//   44   68:icmpge          97
				j += zzfe.zzj(((Long)list.get(i1)).longValue());
	//   45   71:iload_1         
	//   46   72:aload_0         
	//   47   73:iload_3         
	//   48   74:invokeinterface #60  <Method Object List.get(int)>
	//   49   79:checkcast       #355 <Class Long>
	//   50   82:invokevirtual   #359 <Method long Long.longValue()>
	//   51   85:invokestatic    #370 <Method int zzfe.zzj(long)>
	//   52   88:iadd            
	//   53   89:istore_1        
				i1++;
	//   54   90:iload_3         
	//   55   91:iconst_1        
	//   56   92:iadd            
	//   57   93:istore_3        
			} while(true);
	//   58   94:goto            63
		}
		return k;
	//   59   97:iload_2         
	//   60   98:ireturn         
	}

	static int zzt(int i, List list, boolean flag)
	{
		int j = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #56  <Method int List.size()>
	//    2    6:istore_3        
		if(j == 0)
	//*   3    7:iload_3         
	//*   4    8:ifne            13
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		else
			return zzv(list) + j * zzfe.zzav(i);
	//    7   13:aload_1         
	//    8   14:invokestatic    #373 <Method int zzv(List)>
	//    9   17:iload_3         
	//   10   18:iload_0         
	//   11   19:invokestatic    #211 <Method int zzfe.zzav(int)>
	//   12   22:imul            
	//   13   23:iadd            
	//   14   24:ireturn         
	}

	static int zzt(List list)
	{
		int j1 = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #56  <Method int List.size()>
	//    2    6:istore          4
		int k = 0;
	//    3    8:iconst_0        
	//    4    9:istore_2        
		int l = 0;
	//    5   10:iconst_0        
	//    6   11:istore_3        
		if(j1 == 0)
	//*   7   12:iload           4
	//*   8   14:ifne            19
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		if(list instanceof zzfz)
	//*  11   19:aload_0         
	//*  12   20:instanceof      #375 <Class zzfz>
	//*  13   23:ifeq            59
		{
			list = ((List) ((zzfz)list));
	//   14   26:aload_0         
	//   15   27:checkcast       #375 <Class zzfz>
	//   16   30:astore_0        
			int i = 0;
	//   17   31:iconst_0        
	//   18   32:istore_1        
			do
			{
				k = i;
	//   19   33:iload_1         
	//   20   34:istore_2        
				if(l >= j1)
					break;
	//   21   35:iload_3         
	//   22   36:iload           4
	//   23   38:icmpge          97
				i += zzfe.zzbb(((zzfz) (list)).getInt(l));
	//   24   41:iload_1         
	//   25   42:aload_0         
	//   26   43:iload_3         
	//   27   44:invokevirtual   #378 <Method int zzfz.getInt(int)>
	//   28   47:invokestatic    #381 <Method int zzfe.zzbb(int)>
	//   29   50:iadd            
	//   30   51:istore_1        
				l++;
	//   31   52:iload_3         
	//   32   53:iconst_1        
	//   33   54:iadd            
	//   34   55:istore_3        
			} while(true);
	//   35   56:goto            33
		} else
		{
			int j = 0;
	//   36   59:iconst_0        
	//   37   60:istore_1        
			int i1 = k;
	//   38   61:iload_2         
	//   39   62:istore_3        
			do
			{
				k = j;
	//   40   63:iload_1         
	//   41   64:istore_2        
				if(i1 >= j1)
					break;
	//   42   65:iload_3         
	//   43   66:iload           4
	//   44   68:icmpge          97
				j += zzfe.zzbb(((Integer)list.get(i1)).intValue());
	//   45   71:iload_1         
	//   46   72:aload_0         
	//   47   73:iload_3         
	//   48   74:invokeinterface #60  <Method Object List.get(int)>
	//   49   79:checkcast       #62  <Class Integer>
	//   50   82:invokevirtual   #65  <Method int Integer.intValue()>
	//   51   85:invokestatic    #381 <Method int zzfe.zzbb(int)>
	//   52   88:iadd            
	//   53   89:istore_1        
				i1++;
	//   54   90:iload_3         
	//   55   91:iconst_1        
	//   56   92:iadd            
	//   57   93:istore_3        
			} while(true);
	//   58   94:goto            63
		}
		return k;
	//   59   97:iload_2         
	//   60   98:ireturn         
	}

	static int zzu(int i, List list, boolean flag)
	{
		int j = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #56  <Method int List.size()>
	//    2    6:istore_3        
		if(j == 0)
	//*   3    7:iload_3         
	//*   4    8:ifne            13
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		else
			return zzw(list) + j * zzfe.zzav(i);
	//    7   13:aload_1         
	//    8   14:invokestatic    #385 <Method int zzw(List)>
	//    9   17:iload_3         
	//   10   18:iload_0         
	//   11   19:invokestatic    #211 <Method int zzfe.zzav(int)>
	//   12   22:imul            
	//   13   23:iadd            
	//   14   24:ireturn         
	}

	static int zzu(List list)
	{
		int j1 = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #56  <Method int List.size()>
	//    2    6:istore          4
		int k = 0;
	//    3    8:iconst_0        
	//    4    9:istore_2        
		int l = 0;
	//    5   10:iconst_0        
	//    6   11:istore_3        
		if(j1 == 0)
	//*   7   12:iload           4
	//*   8   14:ifne            19
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		if(list instanceof zzfz)
	//*  11   19:aload_0         
	//*  12   20:instanceof      #375 <Class zzfz>
	//*  13   23:ifeq            59
		{
			list = ((List) ((zzfz)list));
	//   14   26:aload_0         
	//   15   27:checkcast       #375 <Class zzfz>
	//   16   30:astore_0        
			int i = 0;
	//   17   31:iconst_0        
	//   18   32:istore_1        
			do
			{
				k = i;
	//   19   33:iload_1         
	//   20   34:istore_2        
				if(l >= j1)
					break;
	//   21   35:iload_3         
	//   22   36:iload           4
	//   23   38:icmpge          97
				i += zzfe.zzaw(((zzfz) (list)).getInt(l));
	//   24   41:iload_1         
	//   25   42:aload_0         
	//   26   43:iload_3         
	//   27   44:invokevirtual   #378 <Method int zzfz.getInt(int)>
	//   28   47:invokestatic    #388 <Method int zzfe.zzaw(int)>
	//   29   50:iadd            
	//   30   51:istore_1        
				l++;
	//   31   52:iload_3         
	//   32   53:iconst_1        
	//   33   54:iadd            
	//   34   55:istore_3        
			} while(true);
	//   35   56:goto            33
		} else
		{
			int j = 0;
	//   36   59:iconst_0        
	//   37   60:istore_1        
			int i1 = k;
	//   38   61:iload_2         
	//   39   62:istore_3        
			do
			{
				k = j;
	//   40   63:iload_1         
	//   41   64:istore_2        
				if(i1 >= j1)
					break;
	//   42   65:iload_3         
	//   43   66:iload           4
	//   44   68:icmpge          97
				j += zzfe.zzaw(((Integer)list.get(i1)).intValue());
	//   45   71:iload_1         
	//   46   72:aload_0         
	//   47   73:iload_3         
	//   48   74:invokeinterface #60  <Method Object List.get(int)>
	//   49   79:checkcast       #62  <Class Integer>
	//   50   82:invokevirtual   #65  <Method int Integer.intValue()>
	//   51   85:invokestatic    #388 <Method int zzfe.zzaw(int)>
	//   52   88:iadd            
	//   53   89:istore_1        
				i1++;
	//   54   90:iload_3         
	//   55   91:iconst_1        
	//   56   92:iadd            
	//   57   93:istore_3        
			} while(true);
	//   58   94:goto            63
		}
		return k;
	//   59   97:iload_2         
	//   60   98:ireturn         
	}

	static int zzv(int i, List list, boolean flag)
	{
		int j = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #56  <Method int List.size()>
	//    2    6:istore_3        
		if(j == 0)
	//*   3    7:iload_3         
	//*   4    8:ifne            13
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		else
			return j * zzfe.zzl(i, 0);
	//    7   13:iload_3         
	//    8   14:iload_0         
	//    9   15:iconst_0        
	//   10   16:invokestatic    #391 <Method int zzfe.zzl(int, int)>
	//   11   19:imul            
	//   12   20:ireturn         
	}

	static int zzv(List list)
	{
		int j1 = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #56  <Method int List.size()>
	//    2    6:istore          4
		int k = 0;
	//    3    8:iconst_0        
	//    4    9:istore_2        
		int l = 0;
	//    5   10:iconst_0        
	//    6   11:istore_3        
		if(j1 == 0)
	//*   7   12:iload           4
	//*   8   14:ifne            19
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		if(list instanceof zzfz)
	//*  11   19:aload_0         
	//*  12   20:instanceof      #375 <Class zzfz>
	//*  13   23:ifeq            59
		{
			list = ((List) ((zzfz)list));
	//   14   26:aload_0         
	//   15   27:checkcast       #375 <Class zzfz>
	//   16   30:astore_0        
			int i = 0;
	//   17   31:iconst_0        
	//   18   32:istore_1        
			do
			{
				k = i;
	//   19   33:iload_1         
	//   20   34:istore_2        
				if(l >= j1)
					break;
	//   21   35:iload_3         
	//   22   36:iload           4
	//   23   38:icmpge          97
				i += zzfe.zzax(((zzfz) (list)).getInt(l));
	//   24   41:iload_1         
	//   25   42:aload_0         
	//   26   43:iload_3         
	//   27   44:invokevirtual   #378 <Method int zzfz.getInt(int)>
	//   28   47:invokestatic    #395 <Method int zzfe.zzax(int)>
	//   29   50:iadd            
	//   30   51:istore_1        
				l++;
	//   31   52:iload_3         
	//   32   53:iconst_1        
	//   33   54:iadd            
	//   34   55:istore_3        
			} while(true);
	//   35   56:goto            33
		} else
		{
			int j = 0;
	//   36   59:iconst_0        
	//   37   60:istore_1        
			int i1 = k;
	//   38   61:iload_2         
	//   39   62:istore_3        
			do
			{
				k = j;
	//   40   63:iload_1         
	//   41   64:istore_2        
				if(i1 >= j1)
					break;
	//   42   65:iload_3         
	//   43   66:iload           4
	//   44   68:icmpge          97
				j += zzfe.zzax(((Integer)list.get(i1)).intValue());
	//   45   71:iload_1         
	//   46   72:aload_0         
	//   47   73:iload_3         
	//   48   74:invokeinterface #60  <Method Object List.get(int)>
	//   49   79:checkcast       #62  <Class Integer>
	//   50   82:invokevirtual   #65  <Method int Integer.intValue()>
	//   51   85:invokestatic    #395 <Method int zzfe.zzax(int)>
	//   52   88:iadd            
	//   53   89:istore_1        
				i1++;
	//   54   90:iload_3         
	//   55   91:iconst_1        
	//   56   92:iadd            
	//   57   93:istore_3        
			} while(true);
	//   58   94:goto            63
		}
		return k;
	//   59   97:iload_2         
	//   60   98:ireturn         
	}

	static int zzw(int i, List list, boolean flag)
	{
		int j = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #56  <Method int List.size()>
	//    2    6:istore_3        
		if(j == 0)
	//*   3    7:iload_3         
	//*   4    8:ifne            13
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		else
			return j * zzfe.zzg(i, 0L);
	//    7   13:iload_3         
	//    8   14:iload_0         
	//    9   15:lconst_0        
	//   10   16:invokestatic    #398 <Method int zzfe.zzg(int, long)>
	//   11   19:imul            
	//   12   20:ireturn         
	}

	static int zzw(List list)
	{
		int j1 = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #56  <Method int List.size()>
	//    2    6:istore          4
		int k = 0;
	//    3    8:iconst_0        
	//    4    9:istore_2        
		int l = 0;
	//    5   10:iconst_0        
	//    6   11:istore_3        
		if(j1 == 0)
	//*   7   12:iload           4
	//*   8   14:ifne            19
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		if(list instanceof zzfz)
	//*  11   19:aload_0         
	//*  12   20:instanceof      #375 <Class zzfz>
	//*  13   23:ifeq            59
		{
			list = ((List) ((zzfz)list));
	//   14   26:aload_0         
	//   15   27:checkcast       #375 <Class zzfz>
	//   16   30:astore_0        
			int i = 0;
	//   17   31:iconst_0        
	//   18   32:istore_1        
			do
			{
				k = i;
	//   19   33:iload_1         
	//   20   34:istore_2        
				if(l >= j1)
					break;
	//   21   35:iload_3         
	//   22   36:iload           4
	//   23   38:icmpge          97
				i += zzfe.zzay(((zzfz) (list)).getInt(l));
	//   24   41:iload_1         
	//   25   42:aload_0         
	//   26   43:iload_3         
	//   27   44:invokevirtual   #378 <Method int zzfz.getInt(int)>
	//   28   47:invokestatic    #401 <Method int zzfe.zzay(int)>
	//   29   50:iadd            
	//   30   51:istore_1        
				l++;
	//   31   52:iload_3         
	//   32   53:iconst_1        
	//   33   54:iadd            
	//   34   55:istore_3        
			} while(true);
	//   35   56:goto            33
		} else
		{
			int j = 0;
	//   36   59:iconst_0        
	//   37   60:istore_1        
			int i1 = k;
	//   38   61:iload_2         
	//   39   62:istore_3        
			do
			{
				k = j;
	//   40   63:iload_1         
	//   41   64:istore_2        
				if(i1 >= j1)
					break;
	//   42   65:iload_3         
	//   43   66:iload           4
	//   44   68:icmpge          97
				j += zzfe.zzay(((Integer)list.get(i1)).intValue());
	//   45   71:iload_1         
	//   46   72:aload_0         
	//   47   73:iload_3         
	//   48   74:invokeinterface #60  <Method Object List.get(int)>
	//   49   79:checkcast       #62  <Class Integer>
	//   50   82:invokevirtual   #65  <Method int Integer.intValue()>
	//   51   85:invokestatic    #401 <Method int zzfe.zzay(int)>
	//   52   88:iadd            
	//   53   89:istore_1        
				i1++;
	//   54   90:iload_3         
	//   55   91:iconst_1        
	//   56   92:iadd            
	//   57   93:istore_3        
			} while(true);
	//   58   94:goto            63
		}
		return k;
	//   59   97:iload_2         
	//   60   98:ireturn         
	}

	static int zzx(int i, List list, boolean flag)
	{
		int j = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #56  <Method int List.size()>
	//    2    6:istore_3        
		if(j == 0)
	//*   3    7:iload_3         
	//*   4    8:ifne            13
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		else
			return j * zzfe.zzc(i, true);
	//    7   13:iload_3         
	//    8   14:iload_0         
	//    9   15:iconst_1        
	//   10   16:invokestatic    #405 <Method int zzfe.zzc(int, boolean)>
	//   11   19:imul            
	//   12   20:ireturn         
	}

	static int zzx(List list)
	{
		return list.size() << 2;
	//    0    0:aload_0         
	//    1    1:invokeinterface #56  <Method int List.size()>
	//    2    6:iconst_2        
	//    3    7:ishl            
	//    4    8:ireturn         
	}

	static int zzy(List list)
	{
		return list.size() << 3;
	//    0    0:aload_0         
	//    1    1:invokeinterface #56  <Method int List.size()>
	//    2    6:iconst_3        
	//    3    7:ishl            
	//    4    8:ireturn         
	}

	static int zzz(List list)
	{
		return list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #56  <Method int List.size()>
	//    2    6:ireturn         
	}

	private static final Class zzaaa = zzgs();
	private static final zzio zzaab = zzk(false);
	private static final zzio zzaac = zzk(true);
	private static final zzio zzaad = new zziq();

	static 
	{
	//    0    0:invokestatic    #18  <Method Class zzgs()>
	//    1    3:putstatic       #20  <Field Class zzaaa>
	//    2    6:iconst_0        
	//    3    7:invokestatic    #24  <Method zzio zzk(boolean)>
	//    4   10:putstatic       #26  <Field zzio zzaab>
	//    5   13:iconst_1        
	//    6   14:invokestatic    #24  <Method zzio zzk(boolean)>
	//    7   17:putstatic       #28  <Field zzio zzaac>
	//    8   20:new             #30  <Class zziq>
	//    9   23:dup             
	//   10   24:invokespecial   #33  <Method void zziq()>
	//   11   27:putstatic       #35  <Field zzio zzaad>
	//*  12   30:return          
	}
}
