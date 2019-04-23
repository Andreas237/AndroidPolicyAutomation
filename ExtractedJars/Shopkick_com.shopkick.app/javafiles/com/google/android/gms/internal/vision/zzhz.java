// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzig, zzia, zzii, zzid, 
//			zzic

class zzhz extends AbstractMap
{

	private zzhz(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void AbstractMap()>
		zzaae = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #27  <Field int zzaae>
		zzaaf = Collections.emptyList();
	//    5    9:aload_0         
	//    6   10:invokestatic    #33  <Method List Collections.emptyList()>
	//    7   13:putfield        #35  <Field List zzaaf>
		zzaag = Collections.emptyMap();
	//    8   16:aload_0         
	//    9   17:invokestatic    #39  <Method Map Collections.emptyMap()>
	//   10   20:putfield        #41  <Field Map zzaag>
		zzaai = Collections.emptyMap();
	//   11   23:aload_0         
	//   12   24:invokestatic    #39  <Method Map Collections.emptyMap()>
	//   13   27:putfield        #43  <Field Map zzaai>
	//   14   30:return          
	}

	zzhz(int i, zzia zzia1)
	{
		this(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #47  <Method void zzhz(int)>
	//    3    5:return          
	}

	private final int zza(Comparable comparable)
	{
		int k = zzaaf.size() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List zzaaf>
	//    2    4:invokeinterface #55  <Method int List.size()>
	//    3    9:iconst_1        
	//    4   10:isub            
	//    5   11:istore_3        
		if(k >= 0)
	//*   6   12:iload_3         
	//*   7   13:iflt            57
		{
			int i = comparable.compareTo(((Object) ((Comparable)((zzig)zzaaf.get(k)).getKey())));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #35  <Field List zzaaf>
	//   11   21:iload_3         
	//   12   22:invokeinterface #59  <Method Object List.get(int)>
	//   13   27:checkcast       #61  <Class zzig>
	//   14   30:invokevirtual   #65  <Method Object zzig.getKey()>
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
			int i1 = comparable.compareTo(((Object) ((Comparable)((zzig)zzaaf.get(l)).getKey())));
	//   40   71:aload_1         
	//   41   72:aload_0         
	//   42   73:getfield        #35  <Field List zzaaf>
	//   43   76:iload           4
	//   44   78:invokeinterface #59  <Method Object List.get(int)>
	//   45   83:checkcast       #61  <Class zzig>
	//   46   86:invokevirtual   #65  <Method Object zzig.getKey()>
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

	static Object zza(zzhz zzhz1, int i)
	{
		return zzhz1.zzbq(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #77  <Method Object zzbq(int)>
	//    3    5:areturn         
	}

	static void zza(zzhz zzhz1)
	{
		zzhz1.zzgx();
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void zzgx()>
	//    2    4:return          
	}

	static List zzb(zzhz zzhz1)
	{
		return zzhz1.zzaaf;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List zzaaf>
	//    2    4:areturn         
	}

	static zzhz zzbo(int i)
	{
		return ((zzhz) (new zzia(i)));
	//    0    0:new             #87  <Class zzia>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:invokespecial   #88  <Method void zzia(int)>
	//    4    8:areturn         
	}

	private final Object zzbq(int i)
	{
		zzgx();
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void zzgx()>
		Object obj = ((zzig)zzaaf.remove(i)).getValue();
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field List zzaaf>
	//    4    8:iload_1         
	//    5    9:invokeinterface #92  <Method Object List.remove(int)>
	//    6   14:checkcast       #61  <Class zzig>
	//    7   17:invokevirtual   #95  <Method Object zzig.getValue()>
	//    8   20:astore_2        
		if(!zzaag.isEmpty())
	//*   9   21:aload_0         
	//*  10   22:getfield        #41  <Field Map zzaag>
	//*  11   25:invokeinterface #101 <Method boolean Map.isEmpty()>
	//*  12   30:ifne            81
		{
			Iterator iterator = zzgy().entrySet().iterator();
	//   13   33:aload_0         
	//   14   34:invokespecial   #105 <Method SortedMap zzgy()>
	//   15   37:invokeinterface #111 <Method Set SortedMap.entrySet()>
	//   16   42:invokeinterface #117 <Method Iterator Set.iterator()>
	//   17   47:astore_3        
			zzaaf.add(((Object) (new zzig(this, (java.util.Map.Entry)iterator.next()))));
	//   18   48:aload_0         
	//   19   49:getfield        #35  <Field List zzaaf>
	//   20   52:new             #61  <Class zzig>
	//   21   55:dup             
	//   22   56:aload_0         
	//   23   57:aload_3         
	//   24   58:invokeinterface #122 <Method Object Iterator.next()>
	//   25   63:checkcast       #124 <Class java.util.Map$Entry>
	//   26   66:invokespecial   #127 <Method void zzig(zzhz, java.util.Map$Entry)>
	//   27   69:invokeinterface #131 <Method boolean List.add(Object)>
	//   28   74:pop             
			iterator.remove();
	//   29   75:aload_3         
	//   30   76:invokeinterface #133 <Method void Iterator.remove()>
		}
		return obj;
	//   31   81:aload_2         
	//   32   82:areturn         
	}

	static Map zzc(zzhz zzhz1)
	{
		return zzhz1.zzaag;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Map zzaag>
	//    2    4:areturn         
	}

	static Map zzd(zzhz zzhz1)
	{
		return zzhz1.zzaai;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Map zzaai>
	//    2    4:areturn         
	}

	private final void zzgx()
	{
		if(!zztn)
	//*   0    0:aload_0         
	//*   1    1:getfield        #139 <Field boolean zztn>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		else
			throw new UnsupportedOperationException();
	//    4    8:new             #141 <Class UnsupportedOperationException>
	//    5   11:dup             
	//    6   12:invokespecial   #142 <Method void UnsupportedOperationException()>
	//    7   15:athrow          
	}

	private final SortedMap zzgy()
	{
		zzgx();
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void zzgx()>
		if(zzaag.isEmpty() && !(zzaag instanceof TreeMap))
	//*   2    4:aload_0         
	//*   3    5:getfield        #41  <Field Map zzaag>
	//*   4    8:invokeinterface #101 <Method boolean Map.isEmpty()>
	//*   5   13:ifeq            51
	//*   6   16:aload_0         
	//*   7   17:getfield        #41  <Field Map zzaag>
	//*   8   20:instanceof      #144 <Class TreeMap>
	//*   9   23:ifne            51
		{
			zzaag = ((Map) (new TreeMap()));
	//   10   26:aload_0         
	//   11   27:new             #144 <Class TreeMap>
	//   12   30:dup             
	//   13   31:invokespecial   #145 <Method void TreeMap()>
	//   14   34:putfield        #41  <Field Map zzaag>
			zzaai = ((Map) (((TreeMap)zzaag).descendingMap()));
	//   15   37:aload_0         
	//   16   38:aload_0         
	//   17   39:getfield        #41  <Field Map zzaag>
	//   18   42:checkcast       #144 <Class TreeMap>
	//   19   45:invokevirtual   #149 <Method java.util.NavigableMap TreeMap.descendingMap()>
	//   20   48:putfield        #43  <Field Map zzaai>
		}
		return (SortedMap)zzaag;
	//   21   51:aload_0         
	//   22   52:getfield        #41  <Field Map zzaag>
	//   23   55:checkcast       #107 <Class SortedMap>
	//   24   58:areturn         
	}

	public void clear()
	{
		zzgx();
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void zzgx()>
		if(!zzaaf.isEmpty())
	//*   2    4:aload_0         
	//*   3    5:getfield        #35  <Field List zzaaf>
	//*   4    8:invokeinterface #152 <Method boolean List.isEmpty()>
	//*   5   13:ifne            25
			zzaaf.clear();
	//    6   16:aload_0         
	//    7   17:getfield        #35  <Field List zzaaf>
	//    8   20:invokeinterface #154 <Method void List.clear()>
		if(!zzaag.isEmpty())
	//*   9   25:aload_0         
	//*  10   26:getfield        #41  <Field Map zzaag>
	//*  11   29:invokeinterface #101 <Method boolean Map.isEmpty()>
	//*  12   34:ifne            46
			zzaag.clear();
	//   13   37:aload_0         
	//   14   38:getfield        #41  <Field Map zzaag>
	//   15   41:invokeinterface #155 <Method void Map.clear()>
	//   16   46:return          
	}

	public boolean containsKey(Object obj)
	{
		obj = ((Object) ((Comparable)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #67  <Class Comparable>
	//    2    4:astore_1        
		return zza(((Comparable) (obj))) >= 0 || zzaag.containsKey(obj);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #158 <Method int zza(Comparable)>
	//    6   10:ifge            31
	//    7   13:aload_0         
	//    8   14:getfield        #41  <Field Map zzaag>
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
		if(zzaah == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #162 <Field zzii zzaah>
	//*   2    4:ifnonnull       20
			zzaah = new zzii(this, ((zzia) (null)));
	//    3    7:aload_0         
	//    4    8:new             #164 <Class zzii>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:invokespecial   #167 <Method void zzii(zzhz, zzia)>
	//    9   17:putfield        #162 <Field zzii zzaah>
		return ((Set) (zzaah));
	//   10   20:aload_0         
	//   11   21:getfield        #162 <Field zzii zzaah>
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
		if(!(obj instanceof zzhz))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzhz>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #171 <Method boolean AbstractMap.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((zzhz)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class zzhz>
	//   14   24:astore_1        
		int j = size();
	//   15   25:aload_0         
	//   16   26:invokevirtual   #172 <Method int size()>
	//   17   29:istore_3        
		if(j != ((zzhz) (obj)).size())
	//*  18   30:iload_3         
	//*  19   31:aload_1         
	//*  20   32:invokevirtual   #172 <Method int size()>
	//*  21   35:icmpeq          40
			return false;
	//   22   38:iconst_0        
	//   23   39:ireturn         
		int k = zzgu();
	//   24   40:aload_0         
	//   25   41:invokevirtual   #175 <Method int zzgu()>
	//   26   44:istore          4
		if(k != ((zzhz) (obj)).zzgu())
	//*  27   46:iload           4
	//*  28   48:aload_1         
	//*  29   49:invokevirtual   #175 <Method int zzgu()>
	//*  30   52:icmpeq          69
			return entrySet().equals(((Object) (((zzhz) (obj)).entrySet())));
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
			if(!zzbp(i).equals(((Object) (((zzhz) (obj)).zzbp(i)))))
	//*  42   77:aload_0         
	//*  43   78:iload_2         
	//*  44   79:invokevirtual   #181 <Method java.util.Map$Entry zzbp(int)>
	//*  45   82:aload_1         
	//*  46   83:iload_2         
	//*  47   84:invokevirtual   #181 <Method java.util.Map$Entry zzbp(int)>
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
			return zzaag.equals(((Object) (((zzhz) (obj)).zzaag)));
	//   60  110:aload_0         
	//   61  111:getfield        #41  <Field Map zzaag>
	//   62  114:aload_1         
	//   63  115:getfield        #41  <Field Map zzaag>
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
			return ((zzig)zzaaf.get(i)).getValue();
	//    9   15:aload_0         
	//   10   16:getfield        #35  <Field List zzaaf>
	//   11   19:iload_2         
	//   12   20:invokeinterface #59  <Method Object List.get(int)>
	//   13   25:checkcast       #61  <Class zzig>
	//   14   28:invokevirtual   #95  <Method Object zzig.getValue()>
	//   15   31:areturn         
		else
			return zzaag.get(obj);
	//   16   32:aload_0         
	//   17   33:getfield        #41  <Field Map zzaag>
	//   18   36:aload_1         
	//   19   37:invokeinterface #186 <Method Object Map.get(Object)>
	//   20   42:areturn         
	}

	public int hashCode()
	{
		int k = zzgu();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #175 <Method int zzgu()>
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
			i += ((zzig)zzaaf.get(j)).hashCode();
	//   10   14:iload_1         
	//   11   15:aload_0         
	//   12   16:getfield        #35  <Field List zzaaf>
	//   13   19:iload_2         
	//   14   20:invokeinterface #59  <Method Object List.get(int)>
	//   15   25:checkcast       #61  <Class zzig>
	//   16   28:invokevirtual   #190 <Method int zzig.hashCode()>
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
		if(zzaag.size() > 0)
	//*  26   42:aload_0         
	//*  27   43:getfield        #41  <Field Map zzaag>
	//*  28   46:invokeinterface #191 <Method int Map.size()>
	//*  29   51:ifle            66
			j = i + zzaag.hashCode();
	//   30   54:iload_1         
	//   31   55:aload_0         
	//   32   56:getfield        #41  <Field Map zzaag>
	//   33   59:invokeinterface #192 <Method int Map.hashCode()>
	//   34   64:iadd            
	//   35   65:istore_2        
		return j;
	//   36   66:iload_2         
	//   37   67:ireturn         
	}

	public final boolean isImmutable()
	{
		return zztn;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field boolean zztn>
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
		zzgx();
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void zzgx()>
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
			return zzbq(i);
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:invokespecial   #77  <Method Object zzbq(int)>
	//   14   24:areturn         
		if(zzaag.isEmpty())
	//*  15   25:aload_0         
	//*  16   26:getfield        #41  <Field Map zzaag>
	//*  17   29:invokeinterface #101 <Method boolean Map.isEmpty()>
	//*  18   34:ifeq            39
			return ((Object) (null));
	//   19   37:aconst_null     
	//   20   38:areturn         
		else
			return zzaag.remove(obj);
	//   21   39:aload_0         
	//   22   40:getfield        #41  <Field Map zzaag>
	//   23   43:aload_1         
	//   24   44:invokeinterface #200 <Method Object Map.remove(Object)>
	//   25   49:areturn         
	}

	public int size()
	{
		return zzaaf.size() + zzaag.size();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List zzaaf>
	//    2    4:invokeinterface #55  <Method int List.size()>
	//    3    9:aload_0         
	//    4   10:getfield        #41  <Field Map zzaag>
	//    5   13:invokeinterface #191 <Method int Map.size()>
	//    6   18:iadd            
	//    7   19:ireturn         
	}

	public final Object zza(Comparable comparable, Object obj)
	{
		zzgx();
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void zzgx()>
		int i = zza(comparable);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #158 <Method int zza(Comparable)>
	//    5    9:istore_3        
		if(i >= 0)
	//*   6   10:iload_3         
	//*   7   11:iflt            32
			return ((zzig)zzaaf.get(i)).setValue(obj);
	//    8   14:aload_0         
	//    9   15:getfield        #35  <Field List zzaaf>
	//   10   18:iload_3         
	//   11   19:invokeinterface #59  <Method Object List.get(int)>
	//   12   24:checkcast       #61  <Class zzig>
	//   13   27:aload_2         
	//   14   28:invokevirtual   #203 <Method Object zzig.setValue(Object)>
	//   15   31:areturn         
		zzgx();
	//   16   32:aload_0         
	//   17   33:invokespecial   #81  <Method void zzgx()>
		if(zzaaf.isEmpty() && !(zzaaf instanceof ArrayList))
	//*  18   36:aload_0         
	//*  19   37:getfield        #35  <Field List zzaaf>
	//*  20   40:invokeinterface #152 <Method boolean List.isEmpty()>
	//*  21   45:ifeq            73
	//*  22   48:aload_0         
	//*  23   49:getfield        #35  <Field List zzaaf>
	//*  24   52:instanceof      #205 <Class ArrayList>
	//*  25   55:ifne            73
			zzaaf = ((List) (new ArrayList(zzaae)));
	//   26   58:aload_0         
	//   27   59:new             #205 <Class ArrayList>
	//   28   62:dup             
	//   29   63:aload_0         
	//   30   64:getfield        #27  <Field int zzaae>
	//   31   67:invokespecial   #206 <Method void ArrayList(int)>
	//   32   70:putfield        #35  <Field List zzaaf>
		i = -(i + 1);
	//   33   73:iload_3         
	//   34   74:iconst_1        
	//   35   75:iadd            
	//   36   76:ineg            
	//   37   77:istore_3        
		if(i >= zzaae)
	//*  38   78:iload_3         
	//*  39   79:aload_0         
	//*  40   80:getfield        #27  <Field int zzaae>
	//*  41   83:icmplt          98
			return zzgy().put(((Object) (comparable)), obj);
	//   42   86:aload_0         
	//   43   87:invokespecial   #105 <Method SortedMap zzgy()>
	//   44   90:aload_1         
	//   45   91:aload_2         
	//   46   92:invokeinterface #208 <Method Object SortedMap.put(Object, Object)>
	//   47   97:areturn         
		int j = zzaaf.size();
	//   48   98:aload_0         
	//   49   99:getfield        #35  <Field List zzaaf>
	//   50  102:invokeinterface #55  <Method int List.size()>
	//   51  107:istore          4
		int k = zzaae;
	//   52  109:aload_0         
	//   53  110:getfield        #27  <Field int zzaae>
	//   54  113:istore          5
		if(j == k)
	//*  55  115:iload           4
	//*  56  117:iload           5
	//*  57  119:icmpne          163
		{
			zzig zzig1 = (zzig)zzaaf.remove(k - 1);
	//   58  122:aload_0         
	//   59  123:getfield        #35  <Field List zzaaf>
	//   60  126:iload           5
	//   61  128:iconst_1        
	//   62  129:isub            
	//   63  130:invokeinterface #92  <Method Object List.remove(int)>
	//   64  135:checkcast       #61  <Class zzig>
	//   65  138:astore          6
			zzgy().put(((Object) ((Comparable)zzig1.getKey())), zzig1.getValue());
	//   66  140:aload_0         
	//   67  141:invokespecial   #105 <Method SortedMap zzgy()>
	//   68  144:aload           6
	//   69  146:invokevirtual   #65  <Method Object zzig.getKey()>
	//   70  149:checkcast       #67  <Class Comparable>
	//   71  152:aload           6
	//   72  154:invokevirtual   #95  <Method Object zzig.getValue()>
	//   73  157:invokeinterface #208 <Method Object SortedMap.put(Object, Object)>
	//   74  162:pop             
		}
		zzaaf.add(i, ((Object) (new zzig(this, comparable, obj))));
	//   75  163:aload_0         
	//   76  164:getfield        #35  <Field List zzaaf>
	//   77  167:iload_3         
	//   78  168:new             #61  <Class zzig>
	//   79  171:dup             
	//   80  172:aload_0         
	//   81  173:aload_1         
	//   82  174:aload_2         
	//   83  175:invokespecial   #211 <Method void zzig(zzhz, Comparable, Object)>
	//   84  178:invokeinterface #214 <Method void List.add(int, Object)>
		return ((Object) (null));
	//   85  183:aconst_null     
	//   86  184:areturn         
	}

	public final java.util.Map.Entry zzbp(int i)
	{
		return (java.util.Map.Entry)zzaaf.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List zzaaf>
	//    2    4:iload_1         
	//    3    5:invokeinterface #59  <Method Object List.get(int)>
	//    4   10:checkcast       #124 <Class java.util.Map$Entry>
	//    5   13:areturn         
	}

	public void zzci()
	{
		if(!zztn)
	//*   0    0:aload_0         
	//*   1    1:getfield        #139 <Field boolean zztn>
	//*   2    4:ifne            76
		{
			Map map;
			if(zzaag.isEmpty())
	//*   3    7:aload_0         
	//*   4    8:getfield        #41  <Field Map zzaag>
	//*   5   11:invokeinterface #101 <Method boolean Map.isEmpty()>
	//*   6   16:ifeq            26
				map = Collections.emptyMap();
	//    7   19:invokestatic    #39  <Method Map Collections.emptyMap()>
	//    8   22:astore_1        
			else
	//*   9   23:goto            34
				map = Collections.unmodifiableMap(zzaag);
	//   10   26:aload_0         
	//   11   27:getfield        #41  <Field Map zzaag>
	//   12   30:invokestatic    #221 <Method Map Collections.unmodifiableMap(Map)>
	//   13   33:astore_1        
			zzaag = map;
	//   14   34:aload_0         
	//   15   35:aload_1         
	//   16   36:putfield        #41  <Field Map zzaag>
			if(zzaai.isEmpty())
	//*  17   39:aload_0         
	//*  18   40:getfield        #43  <Field Map zzaai>
	//*  19   43:invokeinterface #101 <Method boolean Map.isEmpty()>
	//*  20   48:ifeq            58
				map = Collections.emptyMap();
	//   21   51:invokestatic    #39  <Method Map Collections.emptyMap()>
	//   22   54:astore_1        
			else
	//*  23   55:goto            66
				map = Collections.unmodifiableMap(zzaai);
	//   24   58:aload_0         
	//   25   59:getfield        #43  <Field Map zzaai>
	//   26   62:invokestatic    #221 <Method Map Collections.unmodifiableMap(Map)>
	//   27   65:astore_1        
			zzaai = map;
	//   28   66:aload_0         
	//   29   67:aload_1         
	//   30   68:putfield        #43  <Field Map zzaai>
			zztn = true;
	//   31   71:aload_0         
	//   32   72:iconst_1        
	//   33   73:putfield        #139 <Field boolean zztn>
		}
	//   34   76:return          
	}

	public final int zzgu()
	{
		return zzaaf.size();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List zzaaf>
	//    2    4:invokeinterface #55  <Method int List.size()>
	//    3    9:ireturn         
	}

	public final Iterable zzgv()
	{
		if(zzaag.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field Map zzaag>
	//*   2    4:invokeinterface #101 <Method boolean Map.isEmpty()>
	//*   3    9:ifeq            16
			return zzid.zzha();
	//    4   12:invokestatic    #228 <Method Iterable zzid.zzha()>
	//    5   15:areturn         
		else
			return ((Iterable) (zzaag.entrySet()));
	//    6   16:aload_0         
	//    7   17:getfield        #41  <Field Map zzaag>
	//    8   20:invokeinterface #229 <Method Set Map.entrySet()>
	//    9   25:areturn         
	}

	final Set zzgw()
	{
		if(zzaaj == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #233 <Field zzic zzaaj>
	//*   2    4:ifnonnull       20
			zzaaj = new zzic(this, ((zzia) (null)));
	//    3    7:aload_0         
	//    4    8:new             #235 <Class zzic>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:invokespecial   #236 <Method void zzic(zzhz, zzia)>
	//    9   17:putfield        #233 <Field zzic zzaaj>
		return ((Set) (zzaaj));
	//   10   20:aload_0         
	//   11   21:getfield        #233 <Field zzic zzaaj>
	//   12   24:areturn         
	}

	private final int zzaae;
	private List zzaaf;
	private Map zzaag;
	private volatile zzii zzaah;
	private Map zzaai;
	private volatile zzic zzaaj;
	private boolean zztn;
}
