// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Bundle;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.data:
//			DataHolder, zab

public static class DataHolder$Builder
{

	static String[] zaa(DataHolder$Builder dataholder$builder)
	{
		return dataholder$builder.zalp;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String[] zalp>
	//    2    4:areturn         
	}

	static ArrayList zab(DataHolder$Builder dataholder$builder)
	{
		return dataholder$builder.zaly;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field ArrayList zaly>
	//    2    4:areturn         
	}

	public DataHolder build(int i)
	{
		return new DataHolder(this, i, ((Bundle) (null)), ((zab) (null)));
	//    0    0:new             #6   <Class DataHolder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:aconst_null     
	//    5    7:aconst_null     
	//    6    8:invokespecial   #64  <Method void DataHolder(DataHolder$Builder, int, Bundle, zab)>
	//    7   11:areturn         
	}

	public DataHolder build(int i, Bundle bundle)
	{
		return new DataHolder(this, i, bundle, -1, ((zab) (null)));
	//    0    0:new             #6   <Class DataHolder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:iconst_m1       
	//    6    8:aconst_null     
	//    7    9:invokespecial   #69  <Method void DataHolder(DataHolder$Builder, int, Bundle, int, zab)>
	//    8   12:areturn         
	}

	public DataHolder$Builder withRow(ContentValues contentvalues)
	{
		Asserts.checkNotNull(((Object) (contentvalues)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #76  <Method void Asserts.checkNotNull(Object)>
		HashMap hashmap = new HashMap(contentvalues.size());
	//    2    4:new             #44  <Class HashMap>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokevirtual   #82  <Method int ContentValues.size()>
	//    6   12:invokespecial   #85  <Method void HashMap(int)>
	//    7   15:astore_2        
		java.util.Map.Entry entry;
		for(contentvalues = ((ContentValues) (contentvalues.valueSet().iterator())); ((Iterator) (contentvalues)).hasNext(); hashmap.put(((Object) ((String)entry.getKey())), entry.getValue()))
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #89  <Method Set ContentValues.valueSet()>
	//*  10   20:invokeinterface #95  <Method Iterator Set.iterator()>
	//*  11   25:astore_1        
	//*  12   26:aload_1         
	//*  13   27:invokeinterface #101 <Method boolean Iterator.hasNext()>
	//*  14   32:ifeq            68
			entry = (java.util.Map.Entry)((Iterator) (contentvalues)).next();
	//   15   35:aload_1         
	//   16   36:invokeinterface #105 <Method Object Iterator.next()>
	//   17   41:checkcast       #107 <Class java.util.Map$Entry>
	//   18   44:astore_3        

	//   19   45:aload_2         
	//   20   46:aload_3         
	//   21   47:invokeinterface #110 <Method Object java.util.Map$Entry.getKey()>
	//   22   52:checkcast       #112 <Class String>
	//   23   55:aload_3         
	//   24   56:invokeinterface #115 <Method Object java.util.Map$Entry.getValue()>
	//   25   61:invokevirtual   #119 <Method Object HashMap.put(Object, Object)>
	//   26   64:pop             
	//*  27   65:goto            26
		return zaa(hashmap);
	//   28   68:aload_0         
	//   29   69:aload_2         
	//   30   70:invokevirtual   #122 <Method DataHolder$Builder zaa(HashMap)>
	//   31   73:areturn         
	}

	public DataHolder$Builder zaa(HashMap hashmap)
	{
		Asserts.checkNotNull(((Object) (hashmap)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #76  <Method void Asserts.checkNotNull(Object)>
		Object obj = ((Object) (zalz));
	//    2    4:aload_0         
	//    3    5:getfield        #42  <Field String zalz>
	//    4    8:astore_3        
		int i;
		if(obj == null)
	//*   5    9:aload_3         
	//*   6   10:ifnonnull       18
		{
			i = -1;
	//    7   13:iconst_m1       
	//    8   14:istore_2        
		} else
	//*   9   15:goto            81
		{
			obj = hashmap.get(obj);
	//   10   18:aload_1         
	//   11   19:aload_3         
	//   12   20:invokevirtual   #125 <Method Object HashMap.get(Object)>
	//   13   23:astore_3        
			if(obj == null)
	//*  14   24:aload_3         
	//*  15   25:ifnonnull       33
			{
				i = -1;
	//   16   28:iconst_m1       
	//   17   29:istore_2        
			} else
	//*  18   30:goto            81
			{
				Integer integer = (Integer)zama.get(obj);
	//   19   33:aload_0         
	//   20   34:getfield        #47  <Field HashMap zama>
	//   21   37:aload_3         
	//   22   38:invokevirtual   #125 <Method Object HashMap.get(Object)>
	//   23   41:checkcast       #127 <Class Integer>
	//   24   44:astore          4
				if(integer == null)
	//*  25   46:aload           4
	//*  26   48:ifnonnull       75
				{
					zama.put(obj, ((Object) (Integer.valueOf(zaly.size()))));
	//   27   51:aload_0         
	//   28   52:getfield        #47  <Field HashMap zama>
	//   29   55:aload_3         
	//   30   56:aload_0         
	//   31   57:getfield        #40  <Field ArrayList zaly>
	//   32   60:invokevirtual   #128 <Method int ArrayList.size()>
	//   33   63:invokestatic    #132 <Method Integer Integer.valueOf(int)>
	//   34   66:invokevirtual   #119 <Method Object HashMap.put(Object, Object)>
	//   35   69:pop             
					i = -1;
	//   36   70:iconst_m1       
	//   37   71:istore_2        
				} else
	//*  38   72:goto            81
				{
					i = integer.intValue();
	//   39   75:aload           4
	//   40   77:invokevirtual   #135 <Method int Integer.intValue()>
	//   41   80:istore_2        
				}
			}
		}
		if(i == -1)
	//*  42   81:iload_2         
	//*  43   82:iconst_m1       
	//*  44   83:icmpne          98
		{
			zaly.add(((Object) (hashmap)));
	//   45   86:aload_0         
	//   46   87:getfield        #40  <Field ArrayList zaly>
	//   47   90:aload_1         
	//   48   91:invokevirtual   #139 <Method boolean ArrayList.add(Object)>
	//   49   94:pop             
		} else
	//*  50   95:goto            116
		{
			zaly.remove(i);
	//   51   98:aload_0         
	//   52   99:getfield        #40  <Field ArrayList zaly>
	//   53  102:iload_2         
	//   54  103:invokevirtual   #143 <Method Object ArrayList.remove(int)>
	//   55  106:pop             
			zaly.add(i, ((Object) (hashmap)));
	//   56  107:aload_0         
	//   57  108:getfield        #40  <Field ArrayList zaly>
	//   58  111:iload_2         
	//   59  112:aload_1         
	//   60  113:invokevirtual   #146 <Method void ArrayList.add(int, Object)>
		}
		zamb = false;
	//   61  116:aload_0         
	//   62  117:iconst_0        
	//   63  118:putfield        #49  <Field boolean zamb>
		return this;
	//   64  121:aload_0         
	//   65  122:areturn         
	}

	private final String zalp[];
	private final ArrayList zaly;
	private final String zalz;
	private final HashMap zama;
	private boolean zamb;
	private String zamc;

	private DataHolder$Builder(String as[], String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		zalp = (String[])Preconditions.checkNotNull(((Object) (as)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #32  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #33  <Class String[]>
	//    6   12:putfield        #35  <Field String[] zalp>
		zaly = new ArrayList();
	//    7   15:aload_0         
	//    8   16:new             #37  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #38  <Method void ArrayList()>
	//   11   23:putfield        #40  <Field ArrayList zaly>
		zalz = s;
	//   12   26:aload_0         
	//   13   27:aload_2         
	//   14   28:putfield        #42  <Field String zalz>
		zama = new HashMap();
	//   15   31:aload_0         
	//   16   32:new             #44  <Class HashMap>
	//   17   35:dup             
	//   18   36:invokespecial   #45  <Method void HashMap()>
	//   19   39:putfield        #47  <Field HashMap zama>
		zamb = false;
	//   20   42:aload_0         
	//   21   43:iconst_0        
	//   22   44:putfield        #49  <Field boolean zamb>
		zamc = null;
	//   23   47:aload_0         
	//   24   48:aconst_null     
	//   25   49:putfield        #51  <Field String zamc>
	//   26   52:return          
	}

	DataHolder$Builder(String as[], String s, zab zab1)
	{
		this(as, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #55  <Method void DataHolder$Builder(String[], String)>
	//    4    6:return          
	}
}
