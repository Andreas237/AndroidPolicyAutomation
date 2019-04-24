// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzacq, zzacr

public final class zzacp extends com.google.android.gms.common.internal.safeparcel.zza
	implements zzacs.zzb
{
	public static final class zza extends com.google.android.gms.common.internal.safeparcel.zza
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			com.google.android.gms.internal.zzacr.zza(this, parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokestatic    #39  <Method void com.google.android.gms.internal.zzacr.zza(zzacp$zza, Parcel, int)>
		//    4    6:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new zzacr();
		final int versionCode;
		final String zzaGV;
		final int zzaGW;

		static 
		{
		//    0    0:new             #19  <Class zzacr>
		//    1    3:dup             
		//    2    4:invokespecial   #22  <Method void zzacr()>
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
			zzaGV = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #31  <Field String zzaGV>
			zzaGW = j;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #33  <Field int zzaGW>
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
			zzaGV = s;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #31  <Field String zzaGV>
			zzaGW = i;
		//    8   14:aload_0         
		//    9   15:iload_2         
		//   10   16:putfield        #33  <Field int zzaGW>
		//   11   19:return          
		}
	}


	public zzacp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void zza()>
		zzaiI = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #37  <Field int zzaiI>
		zzaGS = new HashMap();
	//    5    9:aload_0         
	//    6   10:new             #39  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #40  <Method void HashMap()>
	//    9   17:putfield        #42  <Field HashMap zzaGS>
		zzaGT = new SparseArray();
	//   10   20:aload_0         
	//   11   21:new             #44  <Class SparseArray>
	//   12   24:dup             
	//   13   25:invokespecial   #45  <Method void SparseArray()>
	//   14   28:putfield        #47  <Field SparseArray zzaGT>
		zzaGU = null;
	//   15   31:aload_0         
	//   16   32:aconst_null     
	//   17   33:putfield        #49  <Field ArrayList zzaGU>
	//   18   36:return          
	}

	zzacp(int i, ArrayList arraylist)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #37  <Field int zzaiI>
		zzaGS = new HashMap();
	//    5    9:aload_0         
	//    6   10:new             #39  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #40  <Method void HashMap()>
	//    9   17:putfield        #42  <Field HashMap zzaGS>
		zzaGT = new SparseArray();
	//   10   20:aload_0         
	//   11   21:new             #44  <Class SparseArray>
	//   12   24:dup             
	//   13   25:invokespecial   #45  <Method void SparseArray()>
	//   14   28:putfield        #47  <Field SparseArray zzaGT>
		zzaGU = null;
	//   15   31:aload_0         
	//   16   32:aconst_null     
	//   17   33:putfield        #49  <Field ArrayList zzaGU>
		zzh(arraylist);
	//   18   36:aload_0         
	//   19   37:aload_2         
	//   20   38:invokespecial   #54  <Method void zzh(ArrayList)>
	//   21   41:return          
	}

	private void zzh(ArrayList arraylist)
	{
		zza zza1;
		for(arraylist = ((ArrayList) (arraylist.iterator())); ((Iterator) (arraylist)).hasNext(); zzj(zza1.zzaGV, zza1.zzaGW))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #62  <Method Iterator ArrayList.iterator()>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:invokeinterface #68  <Method boolean Iterator.hasNext()>
	//*   5   11:ifeq            40
			zza1 = (zza)((Iterator) (arraylist)).next();
	//    6   14:aload_1         
	//    7   15:invokeinterface #72  <Method Object Iterator.next()>
	//    8   20:checkcast       #9   <Class zzacp$zza>
	//    9   23:astore_2        

	//   10   24:aload_0         
	//   11   25:aload_2         
	//   12   26:getfield        #76  <Field String zzacp$zza.zzaGV>
	//   13   29:aload_2         
	//   14   30:getfield        #79  <Field int zzacp$zza.zzaGW>
	//   15   33:invokevirtual   #83  <Method zzacp zzj(String, int)>
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
		com.google.android.gms.internal.zzacq.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #97  <Method void com.google.android.gms.internal.zzacq.zza(zzacp, Parcel, int)>
	//    4    6:return          
	}

	public String zzd(Integer integer)
	{
		integer = ((Integer) ((String)zzaGT.get(integer.intValue())));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field SparseArray zzaGT>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #101 <Method int Integer.intValue()>
	//    4    8:invokevirtual   #105 <Method Object SparseArray.get(int)>
	//    5   11:checkcast       #107 <Class String>
	//    6   14:astore_1        
		if(integer == null && zzaGS.containsKey("gms_unknown"))
	//*   7   15:aload_1         
	//*   8   16:ifnonnull       34
	//*   9   19:aload_0         
	//*  10   20:getfield        #42  <Field HashMap zzaGS>
	//*  11   23:ldc1            #109 <String "gms_unknown">
	//*  12   25:invokevirtual   #113 <Method boolean HashMap.containsKey(Object)>
	//*  13   28:ifeq            34
			return "gms_unknown";
	//   14   31:ldc1            #109 <String "gms_unknown">
	//   15   33:areturn         
		else
			return ((String) (integer));
	//   16   34:aload_1         
	//   17   35:areturn         
	}

	public zzacp zzj(String s, int i)
	{
		zzaGS.put(((Object) (s)), ((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field HashMap zzaGS>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #117 <Method Integer Integer.valueOf(int)>
	//    5    9:invokevirtual   #121 <Method Object HashMap.put(Object, Object)>
	//    6   12:pop             
		zzaGT.put(i, ((Object) (s)));
	//    7   13:aload_0         
	//    8   14:getfield        #47  <Field SparseArray zzaGT>
	//    9   17:iload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #124 <Method void SparseArray.put(int, Object)>
		return this;
	//   12   22:aload_0         
	//   13   23:areturn         
	}

	ArrayList zzyq()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #58  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #127 <Method void ArrayList()>
	//    3    7:astore_1        
		String s;
		for(Iterator iterator = zzaGS.keySet().iterator(); iterator.hasNext(); arraylist.add(((Object) (new zza(s, ((Integer)zzaGS.get(((Object) (s)))).intValue())))))
	//*   4    8:aload_0         
	//*   5    9:getfield        #42  <Field HashMap zzaGS>
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
	//   17   41:new             #9   <Class zzacp$zza>
	//   18   44:dup             
	//   19   45:aload_3         
	//   20   46:aload_0         
	//   21   47:getfield        #42  <Field HashMap zzaGS>
	//   22   50:aload_3         
	//   23   51:invokevirtual   #136 <Method Object HashMap.get(Object)>
	//   24   54:checkcast       #88  <Class Integer>
	//   25   57:invokevirtual   #101 <Method int Integer.intValue()>
	//   26   60:invokespecial   #139 <Method void zzacp$zza(String, int)>
	//   27   63:invokevirtual   #142 <Method boolean ArrayList.add(Object)>
	//   28   66:pop             
	//*  29   67:goto            21
		return arraylist;
	//   30   70:aload_1         
	//   31   71:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzacq();
	private final HashMap zzaGS;
	private final SparseArray zzaGT;
	private final ArrayList zzaGU;
	final int zzaiI;

	static 
	{
	//    0    0:new             #28  <Class zzacq>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void zzacq()>
	//    3    7:putstatic       #33  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
