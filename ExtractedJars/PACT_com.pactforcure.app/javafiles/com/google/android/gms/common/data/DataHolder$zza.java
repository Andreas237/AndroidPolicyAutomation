// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import android.content.ContentValues;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzc;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.data:
//			DataHolder

public static class DataHolder$zza
{

	static String[] zza(DataHolder$zza dataholder$zza)
	{
		return dataholder$zza.zzaCq;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String[] zzaCq>
	//    2    4:areturn         
	}

	static ArrayList zzb(DataHolder$zza dataholder$zza)
	{
		return dataholder$zza.zzaCy;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ArrayList zzaCy>
	//    2    4:areturn         
	}

	private int zzc(HashMap hashmap)
	{
		if(zzaCz == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field String zzaCz>
	//*   2    4:ifnonnull       9
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		hashmap = ((HashMap) (hashmap.get(((Object) (zzaCz)))));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #41  <Field String zzaCz>
	//    8   14:invokevirtual   #62  <Method Object HashMap.get(Object)>
	//    9   17:astore_1        
		if(hashmap == null)
	//*  10   18:aload_1         
	//*  11   19:ifnonnull       24
			return -1;
	//   12   22:iconst_m1       
	//   13   23:ireturn         
		Integer integer = (Integer)zzaCA.get(((Object) (hashmap)));
	//   14   24:aload_0         
	//   15   25:getfield        #46  <Field HashMap zzaCA>
	//   16   28:aload_1         
	//   17   29:invokevirtual   #62  <Method Object HashMap.get(Object)>
	//   18   32:checkcast       #64  <Class Integer>
	//   19   35:astore_2        
		if(integer == null)
	//*  20   36:aload_2         
	//*  21   37:ifnonnull       61
		{
			zzaCA.put(((Object) (hashmap)), ((Object) (Integer.valueOf(zzaCy.size()))));
	//   22   40:aload_0         
	//   23   41:getfield        #46  <Field HashMap zzaCA>
	//   24   44:aload_1         
	//   25   45:aload_0         
	//   26   46:getfield        #39  <Field ArrayList zzaCy>
	//   27   49:invokevirtual   #68  <Method int ArrayList.size()>
	//   28   52:invokestatic    #72  <Method Integer Integer.valueOf(int)>
	//   29   55:invokevirtual   #76  <Method Object HashMap.put(Object, Object)>
	//   30   58:pop             
			return -1;
	//   31   59:iconst_m1       
	//   32   60:ireturn         
		} else
		{
			return integer.intValue();
	//   33   61:aload_2         
	//   34   62:invokevirtual   #79  <Method int Integer.intValue()>
	//   35   65:ireturn         
		}
	}

	public DataHolder$zza zza(ContentValues contentvalues)
	{
		com.google.android.gms.common.internal.zzc.zzt(((Object) (contentvalues)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #88  <Method void zzc.zzt(Object)>
		HashMap hashmap = new HashMap(contentvalues.size());
	//    2    4:new             #43  <Class HashMap>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokevirtual   #91  <Method int ContentValues.size()>
	//    6   12:invokespecial   #94  <Method void HashMap(int)>
	//    7   15:astore_2        
		java.util.Map.Entry entry;
		for(contentvalues = ((ContentValues) (contentvalues.valueSet().iterator())); ((Iterator) (contentvalues)).hasNext(); hashmap.put(((Object) ((String)entry.getKey())), entry.getValue()))
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #98  <Method Set ContentValues.valueSet()>
	//*  10   20:invokeinterface #104 <Method Iterator Set.iterator()>
	//*  11   25:astore_1        
	//*  12   26:aload_1         
	//*  13   27:invokeinterface #110 <Method boolean Iterator.hasNext()>
	//*  14   32:ifeq            68
			entry = (java.util.Map.Entry)((Iterator) (contentvalues)).next();
	//   15   35:aload_1         
	//   16   36:invokeinterface #114 <Method Object Iterator.next()>
	//   17   41:checkcast       #116 <Class java.util.Map$Entry>
	//   18   44:astore_3        

	//   19   45:aload_2         
	//   20   46:aload_3         
	//   21   47:invokeinterface #119 <Method Object java.util.Map$Entry.getKey()>
	//   22   52:checkcast       #121 <Class String>
	//   23   55:aload_3         
	//   24   56:invokeinterface #124 <Method Object java.util.Map$Entry.getValue()>
	//   25   61:invokevirtual   #76  <Method Object HashMap.put(Object, Object)>
	//   26   64:pop             
	//*  27   65:goto            26
		return zzb(hashmap);
	//   28   68:aload_0         
	//   29   69:aload_2         
	//   30   70:invokevirtual   #127 <Method DataHolder$zza zzb(HashMap)>
	//   31   73:areturn         
	}

	public DataHolder$zza zzb(HashMap hashmap)
	{
		com.google.android.gms.common.internal.zzc.zzt(((Object) (hashmap)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #88  <Method void zzc.zzt(Object)>
		int i = zzc(hashmap);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #129 <Method int zzc(HashMap)>
	//    5    9:istore_2        
		if(i == -1)
	//*   6   10:iload_2         
	//*   7   11:iconst_m1       
	//*   8   12:icmpne          31
		{
			zzaCy.add(((Object) (hashmap)));
	//    9   15:aload_0         
	//   10   16:getfield        #39  <Field ArrayList zzaCy>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #133 <Method boolean ArrayList.add(Object)>
	//   13   23:pop             
		} else
	//*  14   24:aload_0         
	//*  15   25:iconst_0        
	//*  16   26:putfield        #48  <Field boolean zzaCB>
	//*  17   29:aload_0         
	//*  18   30:areturn         
		{
			zzaCy.remove(i);
	//   19   31:aload_0         
	//   20   32:getfield        #39  <Field ArrayList zzaCy>
	//   21   35:iload_2         
	//   22   36:invokevirtual   #137 <Method Object ArrayList.remove(int)>
	//   23   39:pop             
			zzaCy.add(i, ((Object) (hashmap)));
	//   24   40:aload_0         
	//   25   41:getfield        #39  <Field ArrayList zzaCy>
	//   26   44:iload_2         
	//   27   45:aload_1         
	//   28   46:invokevirtual   #140 <Method void ArrayList.add(int, Object)>
		}
		zzaCB = false;
		return this;
	//*  29   49:goto            24
	}

	public DataHolder zzcE(int i)
	{
		return new DataHolder(this, i, ((android.os.Bundle) (null)), ((DataHolder._cls1) (null)));
	//    0    0:new             #6   <Class DataHolder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:aconst_null     
	//    5    7:aconst_null     
	//    6    8:invokespecial   #146 <Method void DataHolder(DataHolder$zza, int, android.os.Bundle, DataHolder$1)>
	//    7   11:areturn         
	}

	private final HashMap zzaCA;
	private boolean zzaCB;
	private String zzaCC;
	private final String zzaCq[];
	private final ArrayList zzaCy;
	private final String zzaCz;

	private DataHolder$zza(String as[], String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		zzaCq = (String[])zzac.zzw(((Object) (as)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #31  <Method Object zzac.zzw(Object)>
	//    5    9:checkcast       #32  <Class String[]>
	//    6   12:putfield        #34  <Field String[] zzaCq>
		zzaCy = new ArrayList();
	//    7   15:aload_0         
	//    8   16:new             #36  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #37  <Method void ArrayList()>
	//   11   23:putfield        #39  <Field ArrayList zzaCy>
		zzaCz = s;
	//   12   26:aload_0         
	//   13   27:aload_2         
	//   14   28:putfield        #41  <Field String zzaCz>
		zzaCA = new HashMap();
	//   15   31:aload_0         
	//   16   32:new             #43  <Class HashMap>
	//   17   35:dup             
	//   18   36:invokespecial   #44  <Method void HashMap()>
	//   19   39:putfield        #46  <Field HashMap zzaCA>
		zzaCB = false;
	//   20   42:aload_0         
	//   21   43:iconst_0        
	//   22   44:putfield        #48  <Field boolean zzaCB>
		zzaCC = null;
	//   23   47:aload_0         
	//   24   48:aconst_null     
	//   25   49:putfield        #50  <Field String zzaCC>
	//   26   52:return          
	}

	DataHolder$zza(String as[], String s, DataHolder._cls1 _pcls1)
	{
		this(as, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #54  <Method void DataHolder$zza(String[], String)>
	//    4    6:return          
	}
}
