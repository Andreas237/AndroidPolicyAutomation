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
		return dataholder$zza.zzaDP;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String[] zzaDP>
	//    2    4:areturn         
	}

	private int zzb(HashMap hashmap)
	{
		if(zzaDY == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field String zzaDY>
	//*   2    4:ifnonnull       9
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		hashmap = ((HashMap) (hashmap.get(((Object) (zzaDY)))));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #41  <Field String zzaDY>
	//    8   14:invokevirtual   #60  <Method Object HashMap.get(Object)>
	//    9   17:astore_1        
		if(hashmap == null)
	//*  10   18:aload_1         
	//*  11   19:ifnonnull       24
			return -1;
	//   12   22:iconst_m1       
	//   13   23:ireturn         
		Integer integer = (Integer)zzaDZ.get(((Object) (hashmap)));
	//   14   24:aload_0         
	//   15   25:getfield        #46  <Field HashMap zzaDZ>
	//   16   28:aload_1         
	//   17   29:invokevirtual   #60  <Method Object HashMap.get(Object)>
	//   18   32:checkcast       #62  <Class Integer>
	//   19   35:astore_2        
		if(integer == null)
	//*  20   36:aload_2         
	//*  21   37:ifnonnull       61
		{
			zzaDZ.put(((Object) (hashmap)), ((Object) (Integer.valueOf(zzaDX.size()))));
	//   22   40:aload_0         
	//   23   41:getfield        #46  <Field HashMap zzaDZ>
	//   24   44:aload_1         
	//   25   45:aload_0         
	//   26   46:getfield        #39  <Field ArrayList zzaDX>
	//   27   49:invokevirtual   #66  <Method int ArrayList.size()>
	//   28   52:invokestatic    #70  <Method Integer Integer.valueOf(int)>
	//   29   55:invokevirtual   #74  <Method Object HashMap.put(Object, Object)>
	//   30   58:pop             
			return -1;
	//   31   59:iconst_m1       
	//   32   60:ireturn         
		} else
		{
			return integer.intValue();
	//   33   61:aload_2         
	//   34   62:invokevirtual   #77  <Method int Integer.intValue()>
	//   35   65:ireturn         
		}
	}

	static ArrayList zzb(DataHolder$zza dataholder$zza)
	{
		return dataholder$zza.zzaDX;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ArrayList zzaDX>
	//    2    4:areturn         
	}

	public DataHolder$zza zza(ContentValues contentvalues)
	{
		zzc.zzt(((Object) (contentvalues)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #87  <Method void zzc.zzt(Object)>
		HashMap hashmap = new HashMap(contentvalues.size());
	//    2    4:new             #43  <Class HashMap>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokevirtual   #90  <Method int ContentValues.size()>
	//    6   12:invokespecial   #93  <Method void HashMap(int)>
	//    7   15:astore_2        
		java.util.Map.Entry entry;
		for(contentvalues = ((ContentValues) (contentvalues.valueSet().iterator())); ((Iterator) (contentvalues)).hasNext(); hashmap.put(((Object) ((String)entry.getKey())), entry.getValue()))
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #97  <Method Set ContentValues.valueSet()>
	//*  10   20:invokeinterface #103 <Method Iterator Set.iterator()>
	//*  11   25:astore_1        
	//*  12   26:aload_1         
	//*  13   27:invokeinterface #109 <Method boolean Iterator.hasNext()>
	//*  14   32:ifeq            68
			entry = (java.util.Map.Entry)((Iterator) (contentvalues)).next();
	//   15   35:aload_1         
	//   16   36:invokeinterface #113 <Method Object Iterator.next()>
	//   17   41:checkcast       #115 <Class java.util.Map$Entry>
	//   18   44:astore_3        

	//   19   45:aload_2         
	//   20   46:aload_3         
	//   21   47:invokeinterface #118 <Method Object java.util.Map$Entry.getKey()>
	//   22   52:checkcast       #120 <Class String>
	//   23   55:aload_3         
	//   24   56:invokeinterface #123 <Method Object java.util.Map$Entry.getValue()>
	//   25   61:invokevirtual   #74  <Method Object HashMap.put(Object, Object)>
	//   26   64:pop             
	//*  27   65:goto            26
		return zza(hashmap);
	//   28   68:aload_0         
	//   29   69:aload_2         
	//   30   70:invokevirtual   #126 <Method DataHolder$zza zza(HashMap)>
	//   31   73:areturn         
	}

	public DataHolder$zza zza(HashMap hashmap)
	{
		zzc.zzt(((Object) (hashmap)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #87  <Method void zzc.zzt(Object)>
		int i = zzb(hashmap);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #128 <Method int zzb(HashMap)>
	//    5    9:istore_2        
		if(i == -1)
	//*   6   10:iload_2         
	//*   7   11:iconst_m1       
	//*   8   12:icmpne          27
		{
			zzaDX.add(((Object) (hashmap)));
	//    9   15:aload_0         
	//   10   16:getfield        #39  <Field ArrayList zzaDX>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #132 <Method boolean ArrayList.add(Object)>
	//   13   23:pop             
		} else
	//*  14   24:goto            45
		{
			zzaDX.remove(i);
	//   15   27:aload_0         
	//   16   28:getfield        #39  <Field ArrayList zzaDX>
	//   17   31:iload_2         
	//   18   32:invokevirtual   #136 <Method Object ArrayList.remove(int)>
	//   19   35:pop             
			zzaDX.add(i, ((Object) (hashmap)));
	//   20   36:aload_0         
	//   21   37:getfield        #39  <Field ArrayList zzaDX>
	//   22   40:iload_2         
	//   23   41:aload_1         
	//   24   42:invokevirtual   #139 <Method void ArrayList.add(int, Object)>
		}
		zzaEa = false;
	//   25   45:aload_0         
	//   26   46:iconst_0        
	//   27   47:putfield        #48  <Field boolean zzaEa>
		return this;
	//   28   50:aload_0         
	//   29   51:areturn         
	}

	public DataHolder zzcK(int i)
	{
		return new DataHolder(this, i, ((android.os.Bundle) (null)), ((DataHolder._cls1) (null)));
	//    0    0:new             #6   <Class DataHolder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:aconst_null     
	//    5    7:aconst_null     
	//    6    8:invokespecial   #145 <Method void DataHolder(DataHolder$zza, int, android.os.Bundle, DataHolder$1)>
	//    7   11:areturn         
	}

	private final String zzaDP[];
	private final ArrayList zzaDX;
	private final String zzaDY;
	private final HashMap zzaDZ;
	private boolean zzaEa;
	private String zzaEb;

	private DataHolder$zza(String as[], String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		zzaDP = (String[])zzac.zzw(((Object) (as)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #31  <Method Object zzac.zzw(Object)>
	//    5    9:checkcast       #32  <Class String[]>
	//    6   12:putfield        #34  <Field String[] zzaDP>
		zzaDX = new ArrayList();
	//    7   15:aload_0         
	//    8   16:new             #36  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #37  <Method void ArrayList()>
	//   11   23:putfield        #39  <Field ArrayList zzaDX>
		zzaDY = s;
	//   12   26:aload_0         
	//   13   27:aload_2         
	//   14   28:putfield        #41  <Field String zzaDY>
		zzaDZ = new HashMap();
	//   15   31:aload_0         
	//   16   32:new             #43  <Class HashMap>
	//   17   35:dup             
	//   18   36:invokespecial   #44  <Method void HashMap()>
	//   19   39:putfield        #46  <Field HashMap zzaDZ>
		zzaEa = false;
	//   20   42:aload_0         
	//   21   43:iconst_0        
	//   22   44:putfield        #48  <Field boolean zzaEa>
		zzaEb = null;
	//   23   47:aload_0         
	//   24   48:aconst_null     
	//   25   49:putfield        #50  <Field String zzaEb>
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
