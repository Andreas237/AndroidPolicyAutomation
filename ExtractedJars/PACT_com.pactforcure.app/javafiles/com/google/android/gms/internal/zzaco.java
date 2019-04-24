// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzac;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzacp, zzacq, zzacn

public class zzaco extends com.google.android.gms.common.internal.safeparcel.zza
{
	public static class zza extends com.google.android.gms.common.internal.safeparcel.zza
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
			for(Iterator iterator = map.keySet().iterator(); iterator.hasNext(); arraylist.add(((Object) (new zzb(s, (zzack.zza)map.get(((Object) (s))))))))
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
				zzb zzb1 = (zzb)zzaFN.get(i);
		//   13   23:aload_0         
		//   14   24:getfield        #35  <Field ArrayList zzaFN>
		//   15   27:iload_1         
		//   16   28:invokevirtual   #103 <Method Object ArrayList.get(int)>
		//   17   31:checkcast       #72  <Class zzaco$zzb>
		//   18   34:astore          4
				hashmap.put(((Object) (zzb1.zzaA)), ((Object) (zzb1.zzaFO)));
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

		public static final android.os.Parcelable.Creator CREATOR = new zzacq();
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

		zza(int i, String s, ArrayList arraylist)
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

		zza(String s, Map map)
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

	public static class zzb extends com.google.android.gms.common.internal.safeparcel.zza
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			com.google.android.gms.internal.zzacn.zza(this, parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokestatic    #45  <Method void com.google.android.gms.internal.zzacn.zza(zzaco$zzb, Parcel, int)>
		//    4    6:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new zzacn();
		final int versionCode;
		final String zzaA;
		final zzack.zza zzaFO;

		static 
		{
		//    0    0:new             #21  <Class zzacn>
		//    1    3:dup             
		//    2    4:invokespecial   #24  <Method void zzacn()>
		//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		zzb(int i, String s, zzack.zza zza1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #29  <Method void zza()>
			versionCode = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #31  <Field int versionCode>
			zzaA = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #33  <Field String zzaA>
			zzaFO = zza1;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #35  <Field zzack$zza zzaFO>
		//   11   19:return          
		}

		zzb(String s, zzack.zza zza1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #29  <Method void zza()>
			versionCode = 1;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #31  <Field int versionCode>
			zzaA = s;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #33  <Field String zzaA>
			zzaFO = zza1;
		//    8   14:aload_0         
		//    9   15:aload_2         
		//   10   16:putfield        #35  <Field zzack$zza zzaFO>
		//   11   19:return          
		}
	}


	zzaco(int i, ArrayList arraylist, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void zza()>
		mVersionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #37  <Field int mVersionCode>
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #39  <Field ArrayList zzaFL>
		zzaFK = zzi(arraylist);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokestatic    #43  <Method HashMap zzi(ArrayList)>
	//   11   19:putfield        #45  <Field HashMap zzaFK>
		zzaFM = (String)zzac.zzw(((Object) (s)));
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:invokestatic    #51  <Method Object zzac.zzw(Object)>
	//   15   27:checkcast       #53  <Class String>
	//   16   30:putfield        #55  <Field String zzaFM>
		zzxW();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #58  <Method void zzxW()>
	//   19   37:return          
	}

	private static HashMap zzi(ArrayList arraylist)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #62  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #63  <Method void HashMap()>
	//    3    7:astore_3        
		int j = arraylist.size();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #69  <Method int ArrayList.size()>
	//    6   12:istore_2        
		for(int i = 0; i < j; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_1        
	//*   9   15:iload_1         
	//*  10   16:iload_2         
	//*  11   17:icmpge          52
		{
			zza zza1 = (zza)arraylist.get(i);
	//   12   20:aload_0         
	//   13   21:iload_1         
	//   14   22:invokevirtual   #73  <Method Object ArrayList.get(int)>
	//   15   25:checkcast       #6   <Class zzaco$zza>
	//   16   28:astore          4
			hashmap.put(((Object) (zza1.className)), ((Object) (zza1.zzxZ())));
	//   17   30:aload_3         
	//   18   31:aload           4
	//   19   33:getfield        #76  <Field String zzaco$zza.className>
	//   20   36:aload           4
	//   21   38:invokevirtual   #80  <Method HashMap zzaco$zza.zzxZ()>
	//   22   41:invokevirtual   #84  <Method Object HashMap.put(Object, Object)>
	//   23   44:pop             
		}

	//   24   45:iload_1         
	//   25   46:iconst_1        
	//   26   47:iadd            
	//   27   48:istore_1        
	//*  28   49:goto            15
		return hashmap;
	//   29   52:aload_3         
	//   30   53:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #89  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #90  <Method void StringBuilder()>
	//    3    7:astore_1        
		for(Iterator iterator = zzaFK.keySet().iterator(); iterator.hasNext();)
	//*   4    8:aload_0         
	//*   5    9:getfield        #45  <Field HashMap zzaFK>
	//*   6   12:invokevirtual   #94  <Method Set HashMap.keySet()>
	//*   7   15:invokeinterface #100 <Method Iterator Set.iterator()>
	//*   8   20:astore_2        
	//*   9   21:aload_2         
	//*  10   22:invokeinterface #106 <Method boolean Iterator.hasNext()>
	//*  11   27:ifeq            131
		{
			Object obj = ((Object) ((String)iterator.next()));
	//   12   30:aload_2         
	//   13   31:invokeinterface #110 <Method Object Iterator.next()>
	//   14   36:checkcast       #53  <Class String>
	//   15   39:astore_3        
			stringbuilder.append(((String) (obj))).append(":\n");
	//   16   40:aload_1         
	//   17   41:aload_3         
	//   18   42:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//   19   45:ldc1            #116 <String ":\n">
	//   20   47:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//   21   50:pop             
			obj = ((Object) ((Map)zzaFK.get(obj)));
	//   22   51:aload_0         
	//   23   52:getfield        #45  <Field HashMap zzaFK>
	//   24   55:aload_3         
	//   25   56:invokevirtual   #118 <Method Object HashMap.get(Object)>
	//   26   59:checkcast       #120 <Class Map>
	//   27   62:astore_3        
			Iterator iterator1 = ((Map) (obj)).keySet().iterator();
	//   28   63:aload_3         
	//   29   64:invokeinterface #121 <Method Set Map.keySet()>
	//   30   69:invokeinterface #100 <Method Iterator Set.iterator()>
	//   31   74:astore          4
			while(iterator1.hasNext()) 
	//*  32   76:aload           4
	//*  33   78:invokeinterface #106 <Method boolean Iterator.hasNext()>
	//*  34   83:ifeq            21
			{
				String s = (String)iterator1.next();
	//   35   86:aload           4
	//   36   88:invokeinterface #110 <Method Object Iterator.next()>
	//   37   93:checkcast       #53  <Class String>
	//   38   96:astore          5
				stringbuilder.append("  ").append(s).append(": ");
	//   39   98:aload_1         
	//   40   99:ldc1            #123 <String "  ">
	//   41  101:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//   42  104:aload           5
	//   43  106:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//   44  109:ldc1            #125 <String ": ">
	//   45  111:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//   46  114:pop             
				stringbuilder.append(((Map) (obj)).get(((Object) (s))));
	//   47  115:aload_1         
	//   48  116:aload_3         
	//   49  117:aload           5
	//   50  119:invokeinterface #126 <Method Object Map.get(Object)>
	//   51  124:invokevirtual   #129 <Method StringBuilder StringBuilder.append(Object)>
	//   52  127:pop             
			}
		}

	//*  53  128:goto            76
		return stringbuilder.toString();
	//   54  131:aload_1         
	//   55  132:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   56  135:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.internal.zzacp.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #136 <Method void com.google.android.gms.internal.zzacp.zza(zzaco, Parcel, int)>
	//    4    6:return          
	}

	public Map zzdA(String s)
	{
		return (Map)zzaFK.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field HashMap zzaFK>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #118 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #120 <Class Map>
	//    5   11:areturn         
	}

	public void zzxW()
	{
		for(Iterator iterator = zzaFK.keySet().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field HashMap zzaFK>
	//*   2    4:invokevirtual   #94  <Method Set HashMap.keySet()>
	//*   3    7:invokeinterface #100 <Method Iterator Set.iterator()>
	//*   4   12:astore_1        
	//*   5   13:aload_1         
	//*   6   14:invokeinterface #106 <Method boolean Iterator.hasNext()>
	//*   7   19:ifeq            90
		{
			Object obj = ((Object) ((String)iterator.next()));
	//    8   22:aload_1         
	//    9   23:invokeinterface #110 <Method Object Iterator.next()>
	//   10   28:checkcast       #53  <Class String>
	//   11   31:astore_2        
			obj = ((Object) ((Map)zzaFK.get(obj)));
	//   12   32:aload_0         
	//   13   33:getfield        #45  <Field HashMap zzaFK>
	//   14   36:aload_2         
	//   15   37:invokevirtual   #118 <Method Object HashMap.get(Object)>
	//   16   40:checkcast       #120 <Class Map>
	//   17   43:astore_2        
			Iterator iterator1 = ((Map) (obj)).keySet().iterator();
	//   18   44:aload_2         
	//   19   45:invokeinterface #121 <Method Set Map.keySet()>
	//   20   50:invokeinterface #100 <Method Iterator Set.iterator()>
	//   21   55:astore_3        
			while(iterator1.hasNext()) 
	//*  22   56:aload_3         
	//*  23   57:invokeinterface #106 <Method boolean Iterator.hasNext()>
	//*  24   62:ifeq            13
				((zzack.zza)((Map) (obj)).get(((Object) ((String)iterator1.next())))).zza(this);
	//   25   65:aload_2         
	//   26   66:aload_3         
	//   27   67:invokeinterface #110 <Method Object Iterator.next()>
	//   28   72:checkcast       #53  <Class String>
	//   29   75:invokeinterface #126 <Method Object Map.get(Object)>
	//   30   80:checkcast       #141 <Class zzack$zza>
	//   31   83:aload_0         
	//   32   84:invokevirtual   #144 <Method void com.google.android.gms.internal.zzack$zza.zza(zzaco)>
		}

	//*  33   87:goto            56
	//   34   90:return          
	}

	ArrayList zzxX()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #65  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #147 <Method void ArrayList()>
	//    3    7:astore_1        
		String s;
		for(Iterator iterator = zzaFK.keySet().iterator(); iterator.hasNext(); arraylist.add(((Object) (new zza(s, (Map)zzaFK.get(((Object) (s))))))))
	//*   4    8:aload_0         
	//*   5    9:getfield        #45  <Field HashMap zzaFK>
	//*   6   12:invokevirtual   #94  <Method Set HashMap.keySet()>
	//*   7   15:invokeinterface #100 <Method Iterator Set.iterator()>
	//*   8   20:astore_2        
	//*   9   21:aload_2         
	//*  10   22:invokeinterface #106 <Method boolean Iterator.hasNext()>
	//*  11   27:ifeq            67
			s = (String)iterator.next();
	//   12   30:aload_2         
	//   13   31:invokeinterface #110 <Method Object Iterator.next()>
	//   14   36:checkcast       #53  <Class String>
	//   15   39:astore_3        

	//   16   40:aload_1         
	//   17   41:new             #6   <Class zzaco$zza>
	//   18   44:dup             
	//   19   45:aload_3         
	//   20   46:aload_0         
	//   21   47:getfield        #45  <Field HashMap zzaFK>
	//   22   50:aload_3         
	//   23   51:invokevirtual   #118 <Method Object HashMap.get(Object)>
	//   24   54:checkcast       #120 <Class Map>
	//   25   57:invokespecial   #150 <Method void zzaco$zza(String, Map)>
	//   26   60:invokevirtual   #154 <Method boolean ArrayList.add(Object)>
	//   27   63:pop             
	//*  28   64:goto            21
		return arraylist;
	//   29   67:aload_1         
	//   30   68:areturn         
	}

	public String zzxY()
	{
		return zzaFM;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field String zzaFM>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzacp();
	final int mVersionCode;
	private final HashMap zzaFK;
	private final ArrayList zzaFL = null;
	private final String zzaFM;

	static 
	{
	//    0    0:new             #27  <Class zzacp>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void zzacp()>
	//    3    7:putstatic       #32  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
