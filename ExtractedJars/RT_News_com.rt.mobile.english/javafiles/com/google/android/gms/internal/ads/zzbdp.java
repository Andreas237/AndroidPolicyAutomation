// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbdw, zzbdq, zzbdy, zzbdt, 
//			zzbds

class zzbdp extends AbstractMap
{

	private zzbdp(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void AbstractMap()>
		zzdyj = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #27  <Field int zzdyj>
		zzdyk = Collections.emptyList();
	//    5    9:aload_0         
	//    6   10:invokestatic    #33  <Method List Collections.emptyList()>
	//    7   13:putfield        #35  <Field List zzdyk>
		zzdyl = Collections.emptyMap();
	//    8   16:aload_0         
	//    9   17:invokestatic    #39  <Method Map Collections.emptyMap()>
	//   10   20:putfield        #41  <Field Map zzdyl>
		zzdyn = Collections.emptyMap();
	//   11   23:aload_0         
	//   12   24:invokestatic    #39  <Method Map Collections.emptyMap()>
	//   13   27:putfield        #43  <Field Map zzdyn>
	//   14   30:return          
	}

	zzbdp(int i, zzbdq zzbdq1)
	{
		this(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #47  <Method void zzbdp(int)>
	//    3    5:return          
	}

	private final int zza(Comparable comparable)
	{
		int k = zzdyk.size() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List zzdyk>
	//    2    4:invokeinterface #55  <Method int List.size()>
	//    3    9:iconst_1        
	//    4   10:isub            
	//    5   11:istore_3        
		if(k >= 0)
	//*   6   12:iload_3         
	//*   7   13:iflt            57
		{
			int i = comparable.compareTo(((Object) ((Comparable)((zzbdw)zzdyk.get(k)).getKey())));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #35  <Field List zzdyk>
	//   11   21:iload_3         
	//   12   22:invokeinterface #59  <Method Object List.get(int)>
	//   13   27:checkcast       #61  <Class zzbdw>
	//   14   30:invokevirtual   #65  <Method Object zzbdw.getKey()>
	//   15   33:checkcast       #67  <Class Comparable>
	//   16   36:invokeinterface #71  <Method int Comparable.compareTo(Object)>
	//   17   41:istore_2        
			if(i > 0)
	//*  18   42:iload_2         
	//*  19   43:ifle            51
				return -(k + 2);
	//   20   46:iload_3         
	//   21   47:iconst_2        
	//   22   48:iadd            
	//   23   49:ineg            
	//   24   50:ireturn         
			if(i == 0)
	//*  25   51:iload_2         
	//*  26   52:ifne            57
				return k;
	//   27   55:iload_3         
	//   28   56:ireturn         
		}
		int j;
		for(j = 0; j <= k;)
	//*  29   57:iconst_0        
	//*  30   58:istore_2        
	//*  31   59:iload_2         
	//*  32   60:iload_3         
	//*  33   61:icmpgt          128
		{
			int l = (j + k) / 2;
	//   34   64:iload_2         
	//   35   65:iload_3         
	//   36   66:iadd            
	//   37   67:iconst_2        
	//   38   68:idiv            
	//   39   69:istore          4
			int i1 = comparable.compareTo(((Object) ((Comparable)((zzbdw)zzdyk.get(l)).getKey())));
	//   40   71:aload_1         
	//   41   72:aload_0         
	//   42   73:getfield        #35  <Field List zzdyk>
	//   43   76:iload           4
	//   44   78:invokeinterface #59  <Method Object List.get(int)>
	//   45   83:checkcast       #61  <Class zzbdw>
	//   46   86:invokevirtual   #65  <Method Object zzbdw.getKey()>
	//   47   89:checkcast       #67  <Class Comparable>
	//   48   92:invokeinterface #71  <Method int Comparable.compareTo(Object)>
	//   49   97:istore          5
			if(i1 < 0)
	//*  50   99:iload           5
	//*  51  101:ifge            112
				k = l - 1;
	//   52  104:iload           4
	//   53  106:iconst_1        
	//   54  107:isub            
	//   55  108:istore_3        
			else
	//*  56  109:goto            59
			if(i1 > 0)
	//*  57  112:iload           5
	//*  58  114:ifle            125
				j = l + 1;
	//   59  117:iload           4
	//   60  119:iconst_1        
	//   61  120:iadd            
	//   62  121:istore_2        
			else
	//*  63  122:goto            59
				return l;
	//   64  125:iload           4
	//   65  127:ireturn         
		}

		return -(j + 1);
	//   66  128:iload_2         
	//   67  129:iconst_1        
	//   68  130:iadd            
	//   69  131:ineg            
	//   70  132:ireturn         
	}

	static Object zza(zzbdp zzbdp1, int i)
	{
		return zzbdp1.zzcz(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #77  <Method Object zzcz(int)>
	//    3    5:areturn         
	}

	static void zza(zzbdp zzbdp1)
	{
		zzbdp1.zzafv();
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void zzafv()>
	//    2    4:return          
	}

	private final void zzafv()
	{
		if(zzdqy)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field boolean zzdqy>
	//*   2    4:ifeq            15
			throw new UnsupportedOperationException();
	//    3    7:new             #85  <Class UnsupportedOperationException>
	//    4   10:dup             
	//    5   11:invokespecial   #86  <Method void UnsupportedOperationException()>
	//    6   14:athrow          
		else
			return;
	//    7   15:return          
	}

	private final SortedMap zzafw()
	{
		zzafv();
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void zzafv()>
		if(zzdyl.isEmpty() && !(zzdyl instanceof TreeMap))
	//*   2    4:aload_0         
	//*   3    5:getfield        #41  <Field Map zzdyl>
	//*   4    8:invokeinterface #94  <Method boolean Map.isEmpty()>
	//*   5   13:ifeq            51
	//*   6   16:aload_0         
	//*   7   17:getfield        #41  <Field Map zzdyl>
	//*   8   20:instanceof      #96  <Class TreeMap>
	//*   9   23:ifne            51
		{
			zzdyl = ((Map) (new TreeMap()));
	//   10   26:aload_0         
	//   11   27:new             #96  <Class TreeMap>
	//   12   30:dup             
	//   13   31:invokespecial   #97  <Method void TreeMap()>
	//   14   34:putfield        #41  <Field Map zzdyl>
			zzdyn = ((Map) (((TreeMap)zzdyl).descendingMap()));
	//   15   37:aload_0         
	//   16   38:aload_0         
	//   17   39:getfield        #41  <Field Map zzdyl>
	//   18   42:checkcast       #96  <Class TreeMap>
	//   19   45:invokevirtual   #101 <Method java.util.NavigableMap TreeMap.descendingMap()>
	//   20   48:putfield        #43  <Field Map zzdyn>
		}
		return (SortedMap)zzdyl;
	//   21   51:aload_0         
	//   22   52:getfield        #41  <Field Map zzdyl>
	//   23   55:checkcast       #103 <Class SortedMap>
	//   24   58:areturn         
	}

	static List zzb(zzbdp zzbdp1)
	{
		return zzbdp1.zzdyk;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List zzdyk>
	//    2    4:areturn         
	}

	static Map zzc(zzbdp zzbdp1)
	{
		return zzbdp1.zzdyl;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Map zzdyl>
	//    2    4:areturn         
	}

	static zzbdp zzcx(int i)
	{
		return ((zzbdp) (new zzbdq(i)));
	//    0    0:new             #112 <Class zzbdq>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:invokespecial   #113 <Method void zzbdq(int)>
	//    4    8:areturn         
	}

	private final Object zzcz(int i)
	{
		zzafv();
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void zzafv()>
		Object obj = ((zzbdw)zzdyk.remove(i)).getValue();
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field List zzdyk>
	//    4    8:iload_1         
	//    5    9:invokeinterface #117 <Method Object List.remove(int)>
	//    6   14:checkcast       #61  <Class zzbdw>
	//    7   17:invokevirtual   #120 <Method Object zzbdw.getValue()>
	//    8   20:astore_2        
		if(!zzdyl.isEmpty())
	//*   9   21:aload_0         
	//*  10   22:getfield        #41  <Field Map zzdyl>
	//*  11   25:invokeinterface #94  <Method boolean Map.isEmpty()>
	//*  12   30:ifne            81
		{
			Iterator iterator = zzafw().entrySet().iterator();
	//   13   33:aload_0         
	//   14   34:invokespecial   #122 <Method SortedMap zzafw()>
	//   15   37:invokeinterface #126 <Method Set SortedMap.entrySet()>
	//   16   42:invokeinterface #132 <Method Iterator Set.iterator()>
	//   17   47:astore_3        
			zzdyk.add(((Object) (new zzbdw(this, (java.util.Map.Entry)iterator.next()))));
	//   18   48:aload_0         
	//   19   49:getfield        #35  <Field List zzdyk>
	//   20   52:new             #61  <Class zzbdw>
	//   21   55:dup             
	//   22   56:aload_0         
	//   23   57:aload_3         
	//   24   58:invokeinterface #137 <Method Object Iterator.next()>
	//   25   63:checkcast       #139 <Class java.util.Map$Entry>
	//   26   66:invokespecial   #142 <Method void zzbdw(zzbdp, java.util.Map$Entry)>
	//   27   69:invokeinterface #146 <Method boolean List.add(Object)>
	//   28   74:pop             
			iterator.remove();
	//   29   75:aload_3         
	//   30   76:invokeinterface #148 <Method void Iterator.remove()>
		}
		return obj;
	//   31   81:aload_2         
	//   32   82:areturn         
	}

	static Map zzd(zzbdp zzbdp1)
	{
		return zzbdp1.zzdyn;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Map zzdyn>
	//    2    4:areturn         
	}

	public void clear()
	{
		zzafv();
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void zzafv()>
		if(!zzdyk.isEmpty())
	//*   2    4:aload_0         
	//*   3    5:getfield        #35  <Field List zzdyk>
	//*   4    8:invokeinterface #152 <Method boolean List.isEmpty()>
	//*   5   13:ifne            25
			zzdyk.clear();
	//    6   16:aload_0         
	//    7   17:getfield        #35  <Field List zzdyk>
	//    8   20:invokeinterface #154 <Method void List.clear()>
		if(!zzdyl.isEmpty())
	//*   9   25:aload_0         
	//*  10   26:getfield        #41  <Field Map zzdyl>
	//*  11   29:invokeinterface #94  <Method boolean Map.isEmpty()>
	//*  12   34:ifne            46
			zzdyl.clear();
	//   13   37:aload_0         
	//   14   38:getfield        #41  <Field Map zzdyl>
	//   15   41:invokeinterface #155 <Method void Map.clear()>
	//   16   46:return          
	}

	public boolean containsKey(Object obj)
	{
		obj = ((Object) ((Comparable)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #67  <Class Comparable>
	//    2    4:astore_1        
		return zza(((Comparable) (obj))) >= 0 || zzdyl.containsKey(obj);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #158 <Method int zza(Comparable)>
	//    6   10:ifge            31
	//    7   13:aload_0         
	//    8   14:getfield        #41  <Field Map zzdyl>
	//    9   17:aload_1         
	//   10   18:invokeinterface #160 <Method boolean Map.containsKey(Object)>
	//   11   23:ifeq            29
	//   12   26:goto            31
	//   13   29:iconst_0        
	//   14   30:ireturn         
	//   15   31:iconst_1        
	//   16   32:ireturn         
	}

	public Set entrySet()
	{
		if(zzdym == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #162 <Field zzbdy zzdym>
	//*   2    4:ifnonnull       20
			zzdym = new zzbdy(this, ((zzbdq) (null)));
	//    3    7:aload_0         
	//    4    8:new             #164 <Class zzbdy>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:invokespecial   #167 <Method void zzbdy(zzbdp, zzbdq)>
	//    9   17:putfield        #162 <Field zzbdy zzdym>
		return ((Set) (zzdym));
	//   10   20:aload_0         
	//   11   21:getfield        #162 <Field zzbdy zzdym>
	//   12   24:areturn         
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
		if(!(obj instanceof zzbdp))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzbdp>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #171 <Method boolean AbstractMap.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((zzbdp)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class zzbdp>
	//   14   24:astore_1        
		int j = size();
	//   15   25:aload_0         
	//   16   26:invokevirtual   #172 <Method int size()>
	//   17   29:istore_3        
		if(j != ((zzbdp) (obj)).size())
	//*  18   30:iload_3         
	//*  19   31:aload_1         
	//*  20   32:invokevirtual   #172 <Method int size()>
	//*  21   35:icmpeq          40
			return false;
	//   22   38:iconst_0        
	//   23   39:ireturn         
		int k = zzafs();
	//   24   40:aload_0         
	//   25   41:invokevirtual   #175 <Method int zzafs()>
	//   26   44:istore          4
		if(k != ((zzbdp) (obj)).zzafs())
	//*  27   46:iload           4
	//*  28   48:aload_1         
	//*  29   49:invokevirtual   #175 <Method int zzafs()>
	//*  30   52:icmpeq          69
			return entrySet().equals(((Object) (((zzbdp) (obj)).entrySet())));
	//   31   55:aload_0         
	//   32   56:invokevirtual   #176 <Method Set entrySet()>
	//   33   59:aload_1         
	//   34   60:invokevirtual   #176 <Method Set entrySet()>
	//   35   63:invokeinterface #177 <Method boolean Set.equals(Object)>
	//   36   68:ireturn         
		for(int i = 0; i < k; i++)
	//*  37   69:iconst_0        
	//*  38   70:istore_2        
	//*  39   71:iload_2         
	//*  40   72:iload           4
	//*  41   74:icmpge          104
			if(!zzcy(i).equals(((Object) (((zzbdp) (obj)).zzcy(i)))))
	//*  42   77:aload_0         
	//*  43   78:iload_2         
	//*  44   79:invokevirtual   #181 <Method java.util.Map$Entry zzcy(int)>
	//*  45   82:aload_1         
	//*  46   83:iload_2         
	//*  47   84:invokevirtual   #181 <Method java.util.Map$Entry zzcy(int)>
	//*  48   87:invokeinterface #182 <Method boolean java.util.Map$Entry.equals(Object)>
	//*  49   92:ifne            97
				return false;
	//   50   95:iconst_0        
	//   51   96:ireturn         

	//   52   97:iload_2         
	//   53   98:iconst_1        
	//   54   99:iadd            
	//   55  100:istore_2        
	//*  56  101:goto            71
		if(k != j)
	//*  57  104:iload           4
	//*  58  106:iload_3         
	//*  59  107:icmpeq          124
			return zzdyl.equals(((Object) (((zzbdp) (obj)).zzdyl)));
	//   60  110:aload_0         
	//   61  111:getfield        #41  <Field Map zzdyl>
	//   62  114:aload_1         
	//   63  115:getfield        #41  <Field Map zzdyl>
	//   64  118:invokeinterface #183 <Method boolean Map.equals(Object)>
	//   65  123:ireturn         
		else
			return true;
	//   66  124:iconst_1        
	//   67  125:ireturn         
	}

	public Object get(Object obj)
	{
		obj = ((Object) ((Comparable)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #67  <Class Comparable>
	//    2    4:astore_1        
		int i = zza(((Comparable) (obj)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #158 <Method int zza(Comparable)>
	//    6   10:istore_2        
		if(i >= 0)
	//*   7   11:iload_2         
	//*   8   12:iflt            32
			return ((zzbdw)zzdyk.get(i)).getValue();
	//    9   15:aload_0         
	//   10   16:getfield        #35  <Field List zzdyk>
	//   11   19:iload_2         
	//   12   20:invokeinterface #59  <Method Object List.get(int)>
	//   13   25:checkcast       #61  <Class zzbdw>
	//   14   28:invokevirtual   #120 <Method Object zzbdw.getValue()>
	//   15   31:areturn         
		else
			return zzdyl.get(obj);
	//   16   32:aload_0         
	//   17   33:getfield        #41  <Field Map zzdyl>
	//   18   36:aload_1         
	//   19   37:invokeinterface #186 <Method Object Map.get(Object)>
	//   20   42:areturn         
	}

	public int hashCode()
	{
		int k = zzafs();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #175 <Method int zzafs()>
	//    2    4:istore_3        
		int j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		int i = 0;
	//    5    7:iconst_0        
	//    6    8:istore_1        
		for(; j < k; j++)
	//*   7    9:iload_2         
	//*   8   10:iload_3         
	//*   9   11:icmpge          40
			i += ((zzbdw)zzdyk.get(j)).hashCode();
	//   10   14:iload_1         
	//   11   15:aload_0         
	//   12   16:getfield        #35  <Field List zzdyk>
	//   13   19:iload_2         
	//   14   20:invokeinterface #59  <Method Object List.get(int)>
	//   15   25:checkcast       #61  <Class zzbdw>
	//   16   28:invokevirtual   #190 <Method int zzbdw.hashCode()>
	//   17   31:iadd            
	//   18   32:istore_1        

	//   19   33:iload_2         
	//   20   34:iconst_1        
	//   21   35:iadd            
	//   22   36:istore_2        
	//*  23   37:goto            9
		j = i;
	//   24   40:iload_1         
	//   25   41:istore_2        
		if(zzdyl.size() > 0)
	//*  26   42:aload_0         
	//*  27   43:getfield        #41  <Field Map zzdyl>
	//*  28   46:invokeinterface #191 <Method int Map.size()>
	//*  29   51:ifle            66
			j = i + zzdyl.hashCode();
	//   30   54:iload_1         
	//   31   55:aload_0         
	//   32   56:getfield        #41  <Field Map zzdyl>
	//   33   59:invokeinterface #192 <Method int Map.hashCode()>
	//   34   64:iadd            
	//   35   65:istore_2        
		return j;
	//   36   66:iload_2         
	//   37   67:ireturn         
	}

	public final boolean isImmutable()
	{
		return zzdqy;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field boolean zzdqy>
	//    2    4:ireturn         
	}

	public Object put(Object obj, Object obj1)
	{
		return zza((Comparable)obj, obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #67  <Class Comparable>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #198 <Method Object zza(Comparable, Object)>
	//    5    9:areturn         
	}

	public Object remove(Object obj)
	{
		zzafv();
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void zzafv()>
		obj = ((Object) ((Comparable)obj));
	//    2    4:aload_1         
	//    3    5:checkcast       #67  <Class Comparable>
	//    4    8:astore_1        
		int i = zza(((Comparable) (obj)));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #158 <Method int zza(Comparable)>
	//    8   14:istore_2        
		if(i >= 0)
	//*   9   15:iload_2         
	//*  10   16:iflt            25
			return zzcz(i);
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:invokespecial   #77  <Method Object zzcz(int)>
	//   14   24:areturn         
		if(zzdyl.isEmpty())
	//*  15   25:aload_0         
	//*  16   26:getfield        #41  <Field Map zzdyl>
	//*  17   29:invokeinterface #94  <Method boolean Map.isEmpty()>
	//*  18   34:ifeq            39
			return ((Object) (null));
	//   19   37:aconst_null     
	//   20   38:areturn         
		else
			return zzdyl.remove(obj);
	//   21   39:aload_0         
	//   22   40:getfield        #41  <Field Map zzdyl>
	//   23   43:aload_1         
	//   24   44:invokeinterface #200 <Method Object Map.remove(Object)>
	//   25   49:areturn         
	}

	public int size()
	{
		return zzdyk.size() + zzdyl.size();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List zzdyk>
	//    2    4:invokeinterface #55  <Method int List.size()>
	//    3    9:aload_0         
	//    4   10:getfield        #41  <Field Map zzdyl>
	//    5   13:invokeinterface #191 <Method int Map.size()>
	//    6   18:iadd            
	//    7   19:ireturn         
	}

	public final Object zza(Comparable comparable, Object obj)
	{
		zzafv();
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void zzafv()>
		int i = zza(comparable);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #158 <Method int zza(Comparable)>
	//    5    9:istore_3        
		if(i >= 0)
	//*   6   10:iload_3         
	//*   7   11:iflt            32
			return ((zzbdw)zzdyk.get(i)).setValue(obj);
	//    8   14:aload_0         
	//    9   15:getfield        #35  <Field List zzdyk>
	//   10   18:iload_3         
	//   11   19:invokeinterface #59  <Method Object List.get(int)>
	//   12   24:checkcast       #61  <Class zzbdw>
	//   13   27:aload_2         
	//   14   28:invokevirtual   #203 <Method Object zzbdw.setValue(Object)>
	//   15   31:areturn         
		zzafv();
	//   16   32:aload_0         
	//   17   33:invokespecial   #81  <Method void zzafv()>
		if(zzdyk.isEmpty() && !(zzdyk instanceof ArrayList))
	//*  18   36:aload_0         
	//*  19   37:getfield        #35  <Field List zzdyk>
	//*  20   40:invokeinterface #152 <Method boolean List.isEmpty()>
	//*  21   45:ifeq            73
	//*  22   48:aload_0         
	//*  23   49:getfield        #35  <Field List zzdyk>
	//*  24   52:instanceof      #205 <Class ArrayList>
	//*  25   55:ifne            73
			zzdyk = ((List) (new ArrayList(zzdyj)));
	//   26   58:aload_0         
	//   27   59:new             #205 <Class ArrayList>
	//   28   62:dup             
	//   29   63:aload_0         
	//   30   64:getfield        #27  <Field int zzdyj>
	//   31   67:invokespecial   #206 <Method void ArrayList(int)>
	//   32   70:putfield        #35  <Field List zzdyk>
		i = -(i + 1);
	//   33   73:iload_3         
	//   34   74:iconst_1        
	//   35   75:iadd            
	//   36   76:ineg            
	//   37   77:istore_3        
		if(i >= zzdyj)
	//*  38   78:iload_3         
	//*  39   79:aload_0         
	//*  40   80:getfield        #27  <Field int zzdyj>
	//*  41   83:icmplt          98
			return zzafw().put(((Object) (comparable)), obj);
	//   42   86:aload_0         
	//   43   87:invokespecial   #122 <Method SortedMap zzafw()>
	//   44   90:aload_1         
	//   45   91:aload_2         
	//   46   92:invokeinterface #208 <Method Object SortedMap.put(Object, Object)>
	//   47   97:areturn         
		if(zzdyk.size() == zzdyj)
	//*  48   98:aload_0         
	//*  49   99:getfield        #35  <Field List zzdyk>
	//*  50  102:invokeinterface #55  <Method int List.size()>
	//*  51  107:aload_0         
	//*  52  108:getfield        #27  <Field int zzdyj>
	//*  53  111:icmpne          157
		{
			zzbdw zzbdw1 = (zzbdw)zzdyk.remove(zzdyj - 1);
	//   54  114:aload_0         
	//   55  115:getfield        #35  <Field List zzdyk>
	//   56  118:aload_0         
	//   57  119:getfield        #27  <Field int zzdyj>
	//   58  122:iconst_1        
	//   59  123:isub            
	//   60  124:invokeinterface #117 <Method Object List.remove(int)>
	//   61  129:checkcast       #61  <Class zzbdw>
	//   62  132:astore          4
			zzafw().put(((Object) ((Comparable)zzbdw1.getKey())), zzbdw1.getValue());
	//   63  134:aload_0         
	//   64  135:invokespecial   #122 <Method SortedMap zzafw()>
	//   65  138:aload           4
	//   66  140:invokevirtual   #65  <Method Object zzbdw.getKey()>
	//   67  143:checkcast       #67  <Class Comparable>
	//   68  146:aload           4
	//   69  148:invokevirtual   #120 <Method Object zzbdw.getValue()>
	//   70  151:invokeinterface #208 <Method Object SortedMap.put(Object, Object)>
	//   71  156:pop             
		}
		zzdyk.add(i, ((Object) (new zzbdw(this, comparable, obj))));
	//   72  157:aload_0         
	//   73  158:getfield        #35  <Field List zzdyk>
	//   74  161:iload_3         
	//   75  162:new             #61  <Class zzbdw>
	//   76  165:dup             
	//   77  166:aload_0         
	//   78  167:aload_1         
	//   79  168:aload_2         
	//   80  169:invokespecial   #211 <Method void zzbdw(zzbdp, Comparable, Object)>
	//   81  172:invokeinterface #214 <Method void List.add(int, Object)>
		return ((Object) (null));
	//   82  177:aconst_null     
	//   83  178:areturn         
	}

	public void zzaaz()
	{
		if(!zzdqy)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field boolean zzdqy>
	//*   2    4:ifne            76
		{
			Map map;
			if(zzdyl.isEmpty())
	//*   3    7:aload_0         
	//*   4    8:getfield        #41  <Field Map zzdyl>
	//*   5   11:invokeinterface #94  <Method boolean Map.isEmpty()>
	//*   6   16:ifeq            26
				map = Collections.emptyMap();
	//    7   19:invokestatic    #39  <Method Map Collections.emptyMap()>
	//    8   22:astore_1        
			else
	//*   9   23:goto            34
				map = Collections.unmodifiableMap(zzdyl);
	//   10   26:aload_0         
	//   11   27:getfield        #41  <Field Map zzdyl>
	//   12   30:invokestatic    #220 <Method Map Collections.unmodifiableMap(Map)>
	//   13   33:astore_1        
			zzdyl = map;
	//   14   34:aload_0         
	//   15   35:aload_1         
	//   16   36:putfield        #41  <Field Map zzdyl>
			if(zzdyn.isEmpty())
	//*  17   39:aload_0         
	//*  18   40:getfield        #43  <Field Map zzdyn>
	//*  19   43:invokeinterface #94  <Method boolean Map.isEmpty()>
	//*  20   48:ifeq            58
				map = Collections.emptyMap();
	//   21   51:invokestatic    #39  <Method Map Collections.emptyMap()>
	//   22   54:astore_1        
			else
	//*  23   55:goto            66
				map = Collections.unmodifiableMap(zzdyn);
	//   24   58:aload_0         
	//   25   59:getfield        #43  <Field Map zzdyn>
	//   26   62:invokestatic    #220 <Method Map Collections.unmodifiableMap(Map)>
	//   27   65:astore_1        
			zzdyn = map;
	//   28   66:aload_0         
	//   29   67:aload_1         
	//   30   68:putfield        #43  <Field Map zzdyn>
			zzdqy = true;
	//   31   71:aload_0         
	//   32   72:iconst_1        
	//   33   73:putfield        #83  <Field boolean zzdqy>
		}
	//   34   76:return          
	}

	public final int zzafs()
	{
		return zzdyk.size();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List zzdyk>
	//    2    4:invokeinterface #55  <Method int List.size()>
	//    3    9:ireturn         
	}

	public final Iterable zzaft()
	{
		if(zzdyl.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field Map zzdyl>
	//*   2    4:invokeinterface #94  <Method boolean Map.isEmpty()>
	//*   3    9:ifeq            16
			return zzbdt.zzafy();
	//    4   12:invokestatic    #227 <Method Iterable zzbdt.zzafy()>
	//    5   15:areturn         
		else
			return ((Iterable) (zzdyl.entrySet()));
	//    6   16:aload_0         
	//    7   17:getfield        #41  <Field Map zzdyl>
	//    8   20:invokeinterface #228 <Method Set Map.entrySet()>
	//    9   25:areturn         
	}

	final Set zzafu()
	{
		if(zzdyo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #232 <Field zzbds zzdyo>
	//*   2    4:ifnonnull       20
			zzdyo = new zzbds(this, ((zzbdq) (null)));
	//    3    7:aload_0         
	//    4    8:new             #234 <Class zzbds>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:invokespecial   #235 <Method void zzbds(zzbdp, zzbdq)>
	//    9   17:putfield        #232 <Field zzbds zzdyo>
		return ((Set) (zzdyo));
	//   10   20:aload_0         
	//   11   21:getfield        #232 <Field zzbds zzdyo>
	//   12   24:areturn         
	}

	public final java.util.Map.Entry zzcy(int i)
	{
		return (java.util.Map.Entry)zzdyk.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List zzdyk>
	//    2    4:iload_1         
	//    3    5:invokeinterface #59  <Method Object List.get(int)>
	//    4   10:checkcast       #139 <Class java.util.Map$Entry>
	//    5   13:areturn         
	}

	private boolean zzdqy;
	private final int zzdyj;
	private List zzdyk;
	private Map zzdyl;
	private volatile zzbdy zzdym;
	private Map zzdyn;
	private volatile zzbds zzdyo;
}
