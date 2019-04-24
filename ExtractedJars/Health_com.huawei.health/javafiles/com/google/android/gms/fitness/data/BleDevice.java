// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzans;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.data:
//			zzd

public class BleDevice extends zza
	implements ReflectedParcelable
{

	BleDevice(int i, String s, String s1, List list, List list1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #33  <Field int zzaiI>
		zzaSq = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #35  <Field String zzaSq>
		mName = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #37  <Field String mName>
		zzaSr = Collections.unmodifiableList(list);
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:invokestatic    #43  <Method List Collections.unmodifiableList(List)>
	//   14   25:putfield        #45  <Field List zzaSr>
		zzaSs = Collections.unmodifiableList(list1);
	//   15   28:aload_0         
	//   16   29:aload           5
	//   17   31:invokestatic    #43  <Method List Collections.unmodifiableList(List)>
	//   18   34:putfield        #47  <Field List zzaSs>
	//   19   37:return          
	}

	private boolean zza(BleDevice bledevice)
	{
		return mName.equals(((Object) (bledevice.mName))) && zzaSq.equals(((Object) (bledevice.zzaSq))) && zzans.zza(bledevice.zzaSr, zzaSr) && zzans.zza(zzaSs, bledevice.zzaSs);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String mName>
	//    2    4:aload_1         
	//    3    5:getfield        #37  <Field String mName>
	//    4    8:invokevirtual   #57  <Method boolean String.equals(Object)>
	//    5   11:ifeq            58
	//    6   14:aload_0         
	//    7   15:getfield        #35  <Field String zzaSq>
	//    8   18:aload_1         
	//    9   19:getfield        #35  <Field String zzaSq>
	//   10   22:invokevirtual   #57  <Method boolean String.equals(Object)>
	//   11   25:ifeq            58
	//   12   28:aload_1         
	//   13   29:getfield        #45  <Field List zzaSr>
	//   14   32:aload_0         
	//   15   33:getfield        #45  <Field List zzaSr>
	//   16   36:invokestatic    #62  <Method boolean zzans.zza(List, List)>
	//   17   39:ifeq            58
	//   18   42:aload_0         
	//   19   43:getfield        #47  <Field List zzaSs>
	//   20   46:aload_1         
	//   21   47:getfield        #47  <Field List zzaSs>
	//   22   50:invokestatic    #62  <Method boolean zzans.zza(List, List)>
	//   23   53:ifeq            58
	//   24   56:iconst_1        
	//   25   57:ireturn         
	//   26   58:iconst_0        
	//   27   59:ireturn         
	}

	public boolean equals(Object obj)
	{
		return obj == this || (obj instanceof BleDevice) && zza((BleDevice)obj);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class BleDevice>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class BleDevice>
	//    9   17:invokespecial   #64  <Method boolean zza(BleDevice)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public String getAddress()
	{
		return zzaSq;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String zzaSq>
	//    2    4:areturn         
	}

	public List getDataTypes()
	{
		return zzaSs;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field List zzaSs>
	//    2    4:areturn         
	}

	public String getName()
	{
		return mName;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String mName>
	//    2    4:areturn         
	}

	public List getSupportedProfiles()
	{
		return zzaSr;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field List zzaSr>
	//    2    4:areturn         
	}

	int getVersionCode()
	{
		return zzaiI;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int zzaiI>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			mName, zzaSq, zzaSr, zzaSs
		});
	//    0    0:iconst_4        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #37  <Field String mName>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #35  <Field String zzaSq>
	//   11   17:aastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:aload_0         
	//   15   21:getfield        #45  <Field List zzaSr>
	//   16   24:aastore         
	//   17   25:dup             
	//   18   26:iconst_3        
	//   19   27:aload_0         
	//   20   28:getfield        #47  <Field List zzaSs>
	//   21   31:aastore         
	//   22   32:invokestatic    #82  <Method int zzaa.hashCode(Object[])>
	//   23   35:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("name", ((Object) (mName))).zzg("address", ((Object) (zzaSq))).zzg("dataTypes", ((Object) (zzaSs))).zzg("supportedProfiles", ((Object) (zzaSr))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #87  <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #89  <String "name">
	//    3    6:aload_0         
	//    4    7:getfield        #37  <Field String mName>
	//    5   10:invokevirtual   #95  <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    6   13:ldc1            #97  <String "address">
	//    7   15:aload_0         
	//    8   16:getfield        #35  <Field String zzaSq>
	//    9   19:invokevirtual   #95  <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   10   22:ldc1            #99  <String "dataTypes">
	//   11   24:aload_0         
	//   12   25:getfield        #47  <Field List zzaSs>
	//   13   28:invokevirtual   #95  <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   14   31:ldc1            #101 <String "supportedProfiles">
	//   15   33:aload_0         
	//   16   34:getfield        #45  <Field List zzaSr>
	//   17   37:invokevirtual   #95  <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   18   40:invokevirtual   #103 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   19   43:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.data.zzd.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #108 <Method void com.google.android.gms.fitness.data.zzd.zza(BleDevice, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzd();
	private final String mName;
	private final String zzaSq;
	private final List zzaSr;
	private final List zzaSs;
	private final int zzaiI;

	static 
	{
	//    0    0:new             #23  <Class zzd>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void zzd()>
	//    3    7:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
