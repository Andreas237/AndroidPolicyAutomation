// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzaco, zzacq

public static class zzaco$zza extends zza
{

	private static ArrayList zzW(Map map)
	{
		if(map == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		ArrayList arraylist = new ArrayList();
	//    4    6:new             #45  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #46  <Method void ArrayList()>
	//    7   13:astore_1        
		String s;
		for(Iterator iterator = map.keySet().iterator(); iterator.hasNext(); arraylist.add(((Object) (new zzaco$zzb(s, (zzack$zza)map.get(((Object) (s))))))))
	//*   8   14:aload_0         
	//*   9   15:invokeinterface #52  <Method Set Map.keySet()>
	//*  10   20:invokeinterface #58  <Method Iterator Set.iterator()>
	//*  11   25:astore_2        
	//*  12   26:aload_2         
	//*  13   27:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//*  14   32:ifeq            71
			s = (String)iterator.next();
	//   15   35:aload_2         
	//   16   36:invokeinterface #68  <Method Object Iterator.next()>
	//   17   41:checkcast       #70  <Class String>
	//   18   44:astore_3        

	//   19   45:aload_1         
	//   20   46:new             #72  <Class zzaco$zzb>
	//   21   49:dup             
	//   22   50:aload_3         
	//   23   51:aload_0         
	//   24   52:aload_3         
	//   25   53:invokeinterface #76  <Method Object Map.get(Object)>
	//   26   58:checkcast       #78  <Class zzack$zza>
	//   27   61:invokespecial   #81  <Method void zzaco$zzb(String, zzack$zza)>
	//   28   64:invokevirtual   #85  <Method boolean ArrayList.add(Object)>
	//   29   67:pop             
	//*  30   68:goto            26
		return arraylist;
	//   31   71:aload_1         
	//   32   72:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.internal.zzacq.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #91  <Method void com.google.android.gms.internal.zzacq.zza(zzaco$zza, Parcel, int)>
	//    4    6:return          
	}

	HashMap zzxZ()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #95  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #96  <Method void HashMap()>
	//    3    7:astore_3        
		int j = zzaFN.size();
	//    4    8:aload_0         
	//    5    9:getfield        #35  <Field ArrayList zzaFN>
	//    6   12:invokevirtual   #100 <Method int ArrayList.size()>
	//    7   15:istore_2        
		for(int i = 0; i < j; i++)
	//*   8   16:iconst_0        
	//*   9   17:istore_1        
	//*  10   18:iload_1         
	//*  11   19:iload_2         
	//*  12   20:icmpge          58
		{
			zzaco$zzb zzaco$zzb1 = (zzaco$zzb)zzaFN.get(i);
	//   13   23:aload_0         
	//   14   24:getfield        #35  <Field ArrayList zzaFN>
	//   15   27:iload_1         
	//   16   28:invokevirtual   #103 <Method Object ArrayList.get(int)>
	//   17   31:checkcast       #72  <Class zzaco$zzb>
	//   18   34:astore          4
			hashmap.put(((Object) (zzaco$zzb1.zzaA)), ((Object) (zzaco$zzb1.zzaFO)));
	//   19   36:aload_3         
	//   20   37:aload           4
	//   21   39:getfield        #106 <Field String zzaco$zzb.zzaA>
	//   22   42:aload           4
	//   23   44:getfield        #110 <Field zzack$zza zzaco$zzb.zzaFO>
	//   24   47:invokevirtual   #114 <Method Object HashMap.put(Object, Object)>
	//   25   50:pop             
		}

	//   26   51:iload_1         
	//   27   52:iconst_1        
	//   28   53:iadd            
	//   29   54:istore_1        
	//*  30   55:goto            18
		return hashmap;
	//   31   58:aload_3         
	//   32   59:areturn         
	}

	public static final android.os..Creator CREATOR = new zzacq();
	final String className;
	final int versionCode;
	final ArrayList zzaFN;

	static 
	{
	//    0    0:new             #21  <Class zzacq>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void zzacq()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	zzaco$zza(int i, String s, ArrayList arraylist)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void zza()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #31  <Field int versionCode>
		className = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #33  <Field String className>
		zzaFN = arraylist;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #35  <Field ArrayList zzaFN>
	//   11   19:return          
	}

	zzaco$zza(String s, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void zza()>
		versionCode = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #31  <Field int versionCode>
		className = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #33  <Field String className>
		zzaFN = zzW(map);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokestatic    #42  <Method ArrayList zzW(Map)>
	//   11   19:putfield        #35  <Field ArrayList zzaFN>
	//   12   22:return          
	}
}
