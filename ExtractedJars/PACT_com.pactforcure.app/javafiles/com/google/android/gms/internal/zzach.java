// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzaci, zzacj

public final class zzach extends com.google.android.gms.common.internal.safeparcel.zza
	implements zzack.zzb
{
	public static final class zza extends com.google.android.gms.common.internal.safeparcel.zza
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			com.google.android.gms.internal.zzacj.zza(this, parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokestatic    #39  <Method void com.google.android.gms.internal.zzacj.zza(zzach$zza, Parcel, int)>
		//    4    6:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new zzacj();
		final int versionCode;
		final String zzaFy;
		final int zzaFz;

		static 
		{
		//    0    0:new             #19  <Class zzacj>
		//    1    3:dup             
		//    2    4:invokespecial   #22  <Method void zzacj()>
		//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		zza(int i, String s, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void zza()>
			versionCode = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #29  <Field int versionCode>
			zzaFy = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #31  <Field String zzaFy>
			zzaFz = j;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #33  <Field int zzaFz>
		//   11   19:return          
		}

		zza(String s, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void zza()>
			versionCode = 1;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #29  <Field int versionCode>
			zzaFy = s;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #31  <Field String zzaFy>
			zzaFz = i;
		//    8   14:aload_0         
		//    9   15:iload_2         
		//   10   16:putfield        #33  <Field int zzaFz>
		//   11   19:return          
		}
	}


	public zzach()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void zza()>
		mVersionCode = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #37  <Field int mVersionCode>
		zzaFv = new HashMap();
	//    5    9:aload_0         
	//    6   10:new             #39  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #40  <Method void HashMap()>
	//    9   17:putfield        #42  <Field HashMap zzaFv>
		zzaFw = new SparseArray();
	//   10   20:aload_0         
	//   11   21:new             #44  <Class SparseArray>
	//   12   24:dup             
	//   13   25:invokespecial   #45  <Method void SparseArray()>
	//   14   28:putfield        #47  <Field SparseArray zzaFw>
		zzaFx = null;
	//   15   31:aload_0         
	//   16   32:aconst_null     
	//   17   33:putfield        #49  <Field ArrayList zzaFx>
	//   18   36:return          
	}

	zzach(int i, ArrayList arraylist)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void zza()>
		mVersionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #37  <Field int mVersionCode>
		zzaFv = new HashMap();
	//    5    9:aload_0         
	//    6   10:new             #39  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #40  <Method void HashMap()>
	//    9   17:putfield        #42  <Field HashMap zzaFv>
		zzaFw = new SparseArray();
	//   10   20:aload_0         
	//   11   21:new             #44  <Class SparseArray>
	//   12   24:dup             
	//   13   25:invokespecial   #45  <Method void SparseArray()>
	//   14   28:putfield        #47  <Field SparseArray zzaFw>
		zzaFx = null;
	//   15   31:aload_0         
	//   16   32:aconst_null     
	//   17   33:putfield        #49  <Field ArrayList zzaFx>
		zzh(arraylist);
	//   18   36:aload_0         
	//   19   37:aload_2         
	//   20   38:invokespecial   #54  <Method void zzh(ArrayList)>
	//   21   41:return          
	}

	private void zzh(ArrayList arraylist)
	{
		zza zza1;
		for(arraylist = ((ArrayList) (arraylist.iterator())); ((Iterator) (arraylist)).hasNext(); zzj(zza1.zzaFy, zza1.zzaFz))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #62  <Method Iterator ArrayList.iterator()>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:invokeinterface #68  <Method boolean Iterator.hasNext()>
	//*   5   11:ifeq            40
			zza1 = (zza)((Iterator) (arraylist)).next();
	//    6   14:aload_1         
	//    7   15:invokeinterface #72  <Method Object Iterator.next()>
	//    8   20:checkcast       #9   <Class zzach$zza>
	//    9   23:astore_2        

	//   10   24:aload_0         
	//   11   25:aload_2         
	//   12   26:getfield        #76  <Field String zzach$zza.zzaFy>
	//   13   29:aload_2         
	//   14   30:getfield        #79  <Field int zzach$zza.zzaFz>
	//   15   33:invokevirtual   #83  <Method zzach zzj(String, int)>
	//   16   36:pop             
	//*  17   37:goto            5
	//   18   40:return          
	}

	public Object convertBack(Object obj)
	{
		return ((Object) (zzd((Integer)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #88  <Class Integer>
	//    3    5:invokevirtual   #92  <Method String zzd(Integer)>
	//    4    8:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.internal.zzaci.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #97  <Method void com.google.android.gms.internal.zzaci.zza(zzach, Parcel, int)>
	//    4    6:return          
	}

	public String zzd(Integer integer)
	{
		String s = (String)zzaFw.get(integer.intValue());
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field SparseArray zzaFw>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #101 <Method int Integer.intValue()>
	//    4    8:invokevirtual   #105 <Method Object SparseArray.get(int)>
	//    5   11:checkcast       #107 <Class String>
	//    6   14:astore_2        
		integer = ((Integer) (s));
	//    7   15:aload_2         
	//    8   16:astore_1        
		if(s == null)
	//*   9   17:aload_2         
	//*  10   18:ifnonnull       38
		{
			integer = ((Integer) (s));
	//   11   21:aload_2         
	//   12   22:astore_1        
			if(zzaFv.containsKey("gms_unknown"))
	//*  13   23:aload_0         
	//*  14   24:getfield        #42  <Field HashMap zzaFv>
	//*  15   27:ldc1            #109 <String "gms_unknown">
	//*  16   29:invokevirtual   #113 <Method boolean HashMap.containsKey(Object)>
	//*  17   32:ifeq            38
				integer = "gms_unknown";
	//   18   35:ldc1            #109 <String "gms_unknown">
	//   19   37:astore_1        
		}
		return ((String) (integer));
	//   20   38:aload_1         
	//   21   39:areturn         
	}

	public zzach zzj(String s, int i)
	{
		zzaFv.put(((Object) (s)), ((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field HashMap zzaFv>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #117 <Method Integer Integer.valueOf(int)>
	//    5    9:invokevirtual   #121 <Method Object HashMap.put(Object, Object)>
	//    6   12:pop             
		zzaFw.put(i, ((Object) (s)));
	//    7   13:aload_0         
	//    8   14:getfield        #47  <Field SparseArray zzaFw>
	//    9   17:iload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #124 <Method void SparseArray.put(int, Object)>
		return this;
	//   12   22:aload_0         
	//   13   23:areturn         
	}

	ArrayList zzxJ()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #58  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #127 <Method void ArrayList()>
	//    3    7:astore_1        
		String s;
		for(Iterator iterator = zzaFv.keySet().iterator(); iterator.hasNext(); arraylist.add(((Object) (new zza(s, ((Integer)zzaFv.get(((Object) (s)))).intValue())))))
	//*   4    8:aload_0         
	//*   5    9:getfield        #42  <Field HashMap zzaFv>
	//*   6   12:invokevirtual   #131 <Method Set HashMap.keySet()>
	//*   7   15:invokeinterface #134 <Method Iterator Set.iterator()>
	//*   8   20:astore_2        
	//*   9   21:aload_2         
	//*  10   22:invokeinterface #68  <Method boolean Iterator.hasNext()>
	//*  11   27:ifeq            70
			s = (String)iterator.next();
	//   12   30:aload_2         
	//   13   31:invokeinterface #72  <Method Object Iterator.next()>
	//   14   36:checkcast       #107 <Class String>
	//   15   39:astore_3        

	//   16   40:aload_1         
	//   17   41:new             #9   <Class zzach$zza>
	//   18   44:dup             
	//   19   45:aload_3         
	//   20   46:aload_0         
	//   21   47:getfield        #42  <Field HashMap zzaFv>
	//   22   50:aload_3         
	//   23   51:invokevirtual   #136 <Method Object HashMap.get(Object)>
	//   24   54:checkcast       #88  <Class Integer>
	//   25   57:invokevirtual   #101 <Method int Integer.intValue()>
	//   26   60:invokespecial   #139 <Method void zzach$zza(String, int)>
	//   27   63:invokevirtual   #142 <Method boolean ArrayList.add(Object)>
	//   28   66:pop             
	//*  29   67:goto            21
		return arraylist;
	//   30   70:aload_1         
	//   31   71:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzaci();
	final int mVersionCode;
	private final HashMap zzaFv;
	private final SparseArray zzaFw;
	private final ArrayList zzaFx;

	static 
	{
	//    0    0:new             #28  <Class zzaci>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void zzaci()>
	//    3    7:putstatic       #33  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
