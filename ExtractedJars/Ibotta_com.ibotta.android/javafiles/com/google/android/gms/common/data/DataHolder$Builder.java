// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Bundle;
import com.google.android.gms.common.internal.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.data:
//			DataHolder, zza

public static class DataHolder$Builder
{

	static String[] zza(DataHolder$Builder dataholder$builder)
	{
		return dataholder$builder.zznm;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String[] zznm>
	//    2    4:areturn         
	}

	static ArrayList zzb(DataHolder$Builder dataholder$builder)
	{
		return dataholder$builder.zznu;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ArrayList zznu>
	//    2    4:areturn         
	}

	private final boolean zzg(String s)
	{
		Asserts.checkNotNull(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #65  <Method void Asserts.checkNotNull(Object)>
		return zznx && s.equals(((Object) (zzny)));
	//    2    4:aload_0         
	//    3    5:getfield        #48  <Field boolean zznx>
	//    4    8:ifeq            24
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #50  <Field String zzny>
	//    8   16:invokevirtual   #71  <Method boolean String.equals(Object)>
	//    9   19:ifeq            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	public DataHolder build(int i)
	{
		return new DataHolder(this, i, ((Bundle) (null)), ((zza) (null)));
	//    0    0:new             #6   <Class DataHolder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:aconst_null     
	//    5    7:aconst_null     
	//    6    8:invokespecial   #76  <Method void DataHolder(DataHolder$Builder, int, Bundle, zza)>
	//    7   11:areturn         
	}

	public DataHolder build(int i, Bundle bundle)
	{
		return new DataHolder(this, i, bundle, -1, ((zza) (null)));
	//    0    0:new             #6   <Class DataHolder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:iconst_m1       
	//    6    8:aconst_null     
	//    7    9:invokespecial   #80  <Method void DataHolder(DataHolder$Builder, int, Bundle, int, zza)>
	//    8   12:areturn         
	}

	public DataHolder build(int i, Bundle bundle, int j)
	{
		return new DataHolder(this, i, bundle, j, ((zza) (null)));
	//    0    0:new             #6   <Class DataHolder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:aconst_null     
	//    7    9:invokespecial   #80  <Method void DataHolder(DataHolder$Builder, int, Bundle, int, zza)>
	//    8   12:areturn         
	}

	public boolean containsRowWithValue(String s, Object obj)
	{
		int j = zznu.size();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ArrayList zznu>
	//    2    4:invokevirtual   #87  <Method int ArrayList.size()>
	//    3    7:istore          4
		for(int i = 0; i < j; i++)
	//*   4    9:iconst_0        
	//*   5   10:istore_3        
	//*   6   11:iload_3         
	//*   7   12:iload           4
	//*   8   14:icmpge          48
			if(Objects.equal(((HashMap)zznu.get(i)).get(((Object) (s))), obj))
	//*   9   17:aload_0         
	//*  10   18:getfield        #39  <Field ArrayList zznu>
	//*  11   21:iload_3         
	//*  12   22:invokevirtual   #91  <Method Object ArrayList.get(int)>
	//*  13   25:checkcast       #43  <Class HashMap>
	//*  14   28:aload_1         
	//*  15   29:invokevirtual   #93  <Method Object HashMap.get(Object)>
	//*  16   32:aload_2         
	//*  17   33:invokestatic    #99  <Method boolean Objects.equal(Object, Object)>
	//*  18   36:ifeq            41
				return true;
	//   19   39:iconst_1        
	//   20   40:ireturn         

	//   21   41:iload_3         
	//   22   42:iconst_1        
	//   23   43:iadd            
	//   24   44:istore_3        
	//*  25   45:goto            11
		return false;
	//   26   48:iconst_0        
	//   27   49:ireturn         
	}

	public DataHolder$Builder descendingSort(String s)
	{
		if(zzg(s))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #103 <Method boolean zzg(String)>
	//*   3    5:ifeq            10
		{
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		} else
		{
			sort(s);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #106 <Method DataHolder$Builder sort(String)>
	//    9   15:pop             
			Collections.reverse(((java.util.List) (zznu)));
	//   10   16:aload_0         
	//   11   17:getfield        #39  <Field ArrayList zznu>
	//   12   20:invokestatic    #112 <Method void Collections.reverse(java.util.List)>
			return this;
	//   13   23:aload_0         
	//   14   24:areturn         
		}
	}

	public int getCount()
	{
		return zznu.size();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ArrayList zznu>
	//    2    4:invokevirtual   #87  <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public void modifyUniqueRowValue(Object obj, String s, Object obj1)
	{
		if(zznv == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field String zznv>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		obj = ((Object) ((Integer)zznw.get(obj)));
	//    4    8:aload_0         
	//    5    9:getfield        #46  <Field HashMap zznw>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #93  <Method Object HashMap.get(Object)>
	//    8   16:checkcast       #117 <Class Integer>
	//    9   19:astore_1        
		if(obj == null)
	//*  10   20:aload_1         
	//*  11   21:ifnonnull       25
		{
			return;
	//   12   24:return          
		} else
		{
			((HashMap)zznu.get(((Integer) (obj)).intValue())).put(((Object) (s)), obj1);
	//   13   25:aload_0         
	//   14   26:getfield        #39  <Field ArrayList zznu>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #120 <Method int Integer.intValue()>
	//   17   33:invokevirtual   #91  <Method Object ArrayList.get(int)>
	//   18   36:checkcast       #43  <Class HashMap>
	//   19   39:aload_2         
	//   20   40:aload_3         
	//   21   41:invokevirtual   #124 <Method Object HashMap.put(Object, Object)>
	//   22   44:pop             
			return;
	//   23   45:return          
		}
	}

	public DataHolder$Builder removeRowsWithValue(String s, Object obj)
	{
		for(int i = zznu.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field ArrayList zznu>
	//*   2    4:invokevirtual   #87  <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_3        
	//*   6   10:iload_3         
	//*   7   11:iflt            52
			if(Objects.equal(((HashMap)zznu.get(i)).get(((Object) (s))), obj))
	//*   8   14:aload_0         
	//*   9   15:getfield        #39  <Field ArrayList zznu>
	//*  10   18:iload_3         
	//*  11   19:invokevirtual   #91  <Method Object ArrayList.get(int)>
	//*  12   22:checkcast       #43  <Class HashMap>
	//*  13   25:aload_1         
	//*  14   26:invokevirtual   #93  <Method Object HashMap.get(Object)>
	//*  15   29:aload_2         
	//*  16   30:invokestatic    #99  <Method boolean Objects.equal(Object, Object)>
	//*  17   33:ifeq            45
				zznu.remove(i);
	//   18   36:aload_0         
	//   19   37:getfield        #39  <Field ArrayList zznu>
	//   20   40:iload_3         
	//   21   41:invokevirtual   #129 <Method Object ArrayList.remove(int)>
	//   22   44:pop             

	//   23   45:iload_3         
	//   24   46:iconst_1        
	//   25   47:isub            
	//   26   48:istore_3        
	//*  27   49:goto            10
		return this;
	//   28   52:aload_0         
	//   29   53:areturn         
	}

	public DataHolder$Builder sort(String s)
	{
		if(zzg(s))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #103 <Method boolean zzg(String)>
	//*   3    5:ifeq            10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		Collections.sort(((java.util.List) (zznu)), ((java.util.Comparator) (new DataHolder.zza(s))));
	//    6   10:aload_0         
	//    7   11:getfield        #39  <Field ArrayList zznu>
	//    8   14:new             #131 <Class DataHolder$zza>
	//    9   17:dup             
	//   10   18:aload_1         
	//   11   19:invokespecial   #134 <Method void DataHolder$zza(String)>
	//   12   22:invokestatic    #137 <Method void Collections.sort(java.util.List, java.util.Comparator)>
		if(zznv != null)
	//*  13   25:aload_0         
	//*  14   26:getfield        #41  <Field String zznv>
	//*  15   29:ifnull          100
		{
			zznw.clear();
	//   16   32:aload_0         
	//   17   33:getfield        #46  <Field HashMap zznw>
	//   18   36:invokevirtual   #140 <Method void HashMap.clear()>
			int i = 0;
	//   19   39:iconst_0        
	//   20   40:istore_2        
			for(int j = zznu.size(); i < j; i++)
	//*  21   41:aload_0         
	//*  22   42:getfield        #39  <Field ArrayList zznu>
	//*  23   45:invokevirtual   #87  <Method int ArrayList.size()>
	//*  24   48:istore_3        
	//*  25   49:iload_2         
	//*  26   50:iload_3         
	//*  27   51:icmpge          100
			{
				Object obj = ((HashMap)zznu.get(i)).get(((Object) (zznv)));
	//   28   54:aload_0         
	//   29   55:getfield        #39  <Field ArrayList zznu>
	//   30   58:iload_2         
	//   31   59:invokevirtual   #91  <Method Object ArrayList.get(int)>
	//   32   62:checkcast       #43  <Class HashMap>
	//   33   65:aload_0         
	//   34   66:getfield        #41  <Field String zznv>
	//   35   69:invokevirtual   #93  <Method Object HashMap.get(Object)>
	//   36   72:astore          4
				if(obj != null)
	//*  37   74:aload           4
	//*  38   76:ifnull          93
					zznw.put(obj, ((Object) (Integer.valueOf(i))));
	//   39   79:aload_0         
	//   40   80:getfield        #46  <Field HashMap zznw>
	//   41   83:aload           4
	//   42   85:iload_2         
	//   43   86:invokestatic    #144 <Method Integer Integer.valueOf(int)>
	//   44   89:invokevirtual   #124 <Method Object HashMap.put(Object, Object)>
	//   45   92:pop             
			}

	//   46   93:iload_2         
	//   47   94:iconst_1        
	//   48   95:iadd            
	//   49   96:istore_2        
		}
	//*  50   97:goto            49
		zznx = true;
	//   51  100:aload_0         
	//   52  101:iconst_1        
	//   53  102:putfield        #48  <Field boolean zznx>
		zzny = s;
	//   54  105:aload_0         
	//   55  106:aload_1         
	//   56  107:putfield        #50  <Field String zzny>
		return this;
	//   57  110:aload_0         
	//   58  111:areturn         
	}

	public DataHolder$Builder withRow(ContentValues contentvalues)
	{
		Asserts.checkNotNull(((Object) (contentvalues)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #65  <Method void Asserts.checkNotNull(Object)>
		HashMap hashmap = new HashMap(contentvalues.size());
	//    2    4:new             #43  <Class HashMap>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokevirtual   #149 <Method int ContentValues.size()>
	//    6   12:invokespecial   #152 <Method void HashMap(int)>
	//    7   15:astore_2        
		java.util.Map.Entry entry;
		for(contentvalues = ((ContentValues) (contentvalues.valueSet().iterator())); ((Iterator) (contentvalues)).hasNext(); hashmap.put(((Object) ((String)entry.getKey())), entry.getValue()))
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #156 <Method Set ContentValues.valueSet()>
	//*  10   20:invokeinterface #162 <Method Iterator Set.iterator()>
	//*  11   25:astore_1        
	//*  12   26:aload_1         
	//*  13   27:invokeinterface #168 <Method boolean Iterator.hasNext()>
	//*  14   32:ifeq            68
			entry = (java.util.Map.Entry)((Iterator) (contentvalues)).next();
	//   15   35:aload_1         
	//   16   36:invokeinterface #172 <Method Object Iterator.next()>
	//   17   41:checkcast       #174 <Class java.util.Map$Entry>
	//   18   44:astore_3        

	//   19   45:aload_2         
	//   20   46:aload_3         
	//   21   47:invokeinterface #177 <Method Object java.util.Map$Entry.getKey()>
	//   22   52:checkcast       #67  <Class String>
	//   23   55:aload_3         
	//   24   56:invokeinterface #180 <Method Object java.util.Map$Entry.getValue()>
	//   25   61:invokevirtual   #124 <Method Object HashMap.put(Object, Object)>
	//   26   64:pop             
	//*  27   65:goto            26
		return withRow(hashmap);
	//   28   68:aload_0         
	//   29   69:aload_2         
	//   30   70:invokevirtual   #183 <Method DataHolder$Builder withRow(HashMap)>
	//   31   73:areturn         
	}

	public DataHolder$Builder withRow(HashMap hashmap)
	{
		Object obj;
		Asserts.checkNotNull(((Object) (hashmap)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #65  <Method void Asserts.checkNotNull(Object)>
		obj = ((Object) (zznv));
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field String zznv>
	//    4    8:astore_3        
		if(obj != null) goto _L2; else goto _L1
	//    5    9:aload_3         
	//    6   10:ifnonnull       18
_L1:
		int i;
		i = -1;
	//    7   13:iconst_m1       
	//    8   14:istore_2        
		break MISSING_BLOCK_LABEL_77;
	//    9   15:goto            77
_L2:
		Integer integer;
		obj = hashmap.get(obj);
	//   10   18:aload_1         
	//   11   19:aload_3         
	//   12   20:invokevirtual   #93  <Method Object HashMap.get(Object)>
	//   13   23:astore_3        
		if(obj == null)
	//*  14   24:aload_3         
	//*  15   25:ifnonnull       31
			continue; /* Loop/switch isn't completed */
	//   16   28:goto            13
		integer = (Integer)zznw.get(obj);
	//   17   31:aload_0         
	//   18   32:getfield        #46  <Field HashMap zznw>
	//   19   35:aload_3         
	//   20   36:invokevirtual   #93  <Method Object HashMap.get(Object)>
	//   21   39:checkcast       #117 <Class Integer>
	//   22   42:astore          4
		if(integer != null)
			break; /* Loop/switch isn't completed */
	//   23   44:aload           4
	//   24   46:ifnonnull       71
		zznw.put(obj, ((Object) (Integer.valueOf(zznu.size()))));
	//   25   49:aload_0         
	//   26   50:getfield        #46  <Field HashMap zznw>
	//   27   53:aload_3         
	//   28   54:aload_0         
	//   29   55:getfield        #39  <Field ArrayList zznu>
	//   30   58:invokevirtual   #87  <Method int ArrayList.size()>
	//   31   61:invokestatic    #144 <Method Integer Integer.valueOf(int)>
	//   32   64:invokevirtual   #124 <Method Object HashMap.put(Object, Object)>
	//   33   67:pop             
		if(true) goto _L1; else goto _L3
	//   34   68:goto            13
_L3:
		i = integer.intValue();
	//   35   71:aload           4
	//   36   73:invokevirtual   #120 <Method int Integer.intValue()>
	//   37   76:istore_2        
		if(i == -1)
	//*  38   77:iload_2         
	//*  39   78:iconst_m1       
	//*  40   79:icmpne          94
		{
			zznu.add(((Object) (hashmap)));
	//   41   82:aload_0         
	//   42   83:getfield        #39  <Field ArrayList zznu>
	//   43   86:aload_1         
	//   44   87:invokevirtual   #186 <Method boolean ArrayList.add(Object)>
	//   45   90:pop             
		} else
	//*  46   91:goto            112
		{
			zznu.remove(i);
	//   47   94:aload_0         
	//   48   95:getfield        #39  <Field ArrayList zznu>
	//   49   98:iload_2         
	//   50   99:invokevirtual   #129 <Method Object ArrayList.remove(int)>
	//   51  102:pop             
			zznu.add(i, ((Object) (hashmap)));
	//   52  103:aload_0         
	//   53  104:getfield        #39  <Field ArrayList zznu>
	//   54  107:iload_2         
	//   55  108:aload_1         
	//   56  109:invokevirtual   #189 <Method void ArrayList.add(int, Object)>
		}
		zznx = false;
	//   57  112:aload_0         
	//   58  113:iconst_0        
	//   59  114:putfield        #48  <Field boolean zznx>
		return this;
	//   60  117:aload_0         
	//   61  118:areturn         
	}

	private final String zznm[];
	private final ArrayList zznu;
	private final String zznv;
	private final HashMap zznw;
	private boolean zznx;
	private String zzny;

	private DataHolder$Builder(String as[], String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		zznm = (String[])Preconditions.checkNotNull(((Object) (as)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #31  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #32  <Class String[]>
	//    6   12:putfield        #34  <Field String[] zznm>
		zznu = new ArrayList();
	//    7   15:aload_0         
	//    8   16:new             #36  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #37  <Method void ArrayList()>
	//   11   23:putfield        #39  <Field ArrayList zznu>
		zznv = s;
	//   12   26:aload_0         
	//   13   27:aload_2         
	//   14   28:putfield        #41  <Field String zznv>
		zznw = new HashMap();
	//   15   31:aload_0         
	//   16   32:new             #43  <Class HashMap>
	//   17   35:dup             
	//   18   36:invokespecial   #44  <Method void HashMap()>
	//   19   39:putfield        #46  <Field HashMap zznw>
		zznx = false;
	//   20   42:aload_0         
	//   21   43:iconst_0        
	//   22   44:putfield        #48  <Field boolean zznx>
		zzny = null;
	//   23   47:aload_0         
	//   24   48:aconst_null     
	//   25   49:putfield        #50  <Field String zzny>
	//   26   52:return          
	}

	DataHolder$Builder(String as[], String s, zza zza1)
	{
		this(as, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #54  <Method void DataHolder$Builder(String[], String)>
	//    4    6:return          
	}
}
