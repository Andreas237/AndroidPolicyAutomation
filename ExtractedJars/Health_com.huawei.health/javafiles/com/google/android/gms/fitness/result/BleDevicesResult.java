// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.data.DataType;
import java.util.*;

// Referenced classes of package com.google.android.gms.fitness.result:
//			zza

public class BleDevicesResult extends zza
	implements Result
{

	BleDevicesResult(int i, List list, Status status)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #30  <Field int zzaiI>
		zzaWO = Collections.unmodifiableList(list);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #36  <Method List Collections.unmodifiableList(List)>
	//    8   14:putfield        #38  <Field List zzaWO>
		zzair = status;
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:putfield        #40  <Field Status zzair>
	//   12   22:return          
	}

	public BleDevicesResult(List list, Status status)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void zza()>
		zzaiI = 3;
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:putfield        #30  <Field int zzaiI>
		zzaWO = Collections.unmodifiableList(list);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokestatic    #36  <Method List Collections.unmodifiableList(List)>
	//    8   14:putfield        #38  <Field List zzaWO>
		zzair = status;
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:putfield        #40  <Field Status zzair>
	//   12   22:return          
	}

	public static BleDevicesResult zzad(Status status)
	{
		return new BleDevicesResult(Collections.emptyList(), status);
	//    0    0:new             #2   <Class BleDevicesResult>
	//    1    3:dup             
	//    2    4:invokestatic    #50  <Method List Collections.emptyList()>
	//    3    7:aload_0         
	//    4    8:invokespecial   #52  <Method void BleDevicesResult(List, Status)>
	//    5   11:areturn         
	}

	private boolean zzb(BleDevicesResult bledevicesresult)
	{
		return zzair.equals(((Object) (bledevicesresult.zzair))) && zzaa.equal(((Object) (zzaWO)), ((Object) (bledevicesresult.zzaWO)));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Status zzair>
	//    2    4:aload_1         
	//    3    5:getfield        #40  <Field Status zzair>
	//    4    8:invokevirtual   #60  <Method boolean Status.equals(Object)>
	//    5   11:ifeq            30
	//    6   14:aload_0         
	//    7   15:getfield        #38  <Field List zzaWO>
	//    8   18:aload_1         
	//    9   19:getfield        #38  <Field List zzaWO>
	//   10   22:invokestatic    #66  <Method boolean zzaa.equal(Object, Object)>
	//   11   25:ifeq            30
	//   12   28:iconst_1        
	//   13   29:ireturn         
	//   14   30:iconst_0        
	//   15   31:ireturn         
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof BleDevicesResult) && zzb((BleDevicesResult)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class BleDevicesResult>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class BleDevicesResult>
	//    9   17:invokespecial   #68  <Method boolean zzb(BleDevicesResult)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public List getClaimedBleDevices()
	{
		return zzaWO;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field List zzaWO>
	//    2    4:areturn         
	}

	public List getClaimedBleDevices(DataType datatype)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #73  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #74  <Method void ArrayList()>
	//    3    7:astore_2        
		Iterator iterator = zzaWO.iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #38  <Field List zzaWO>
	//    6   12:invokeinterface #80  <Method Iterator List.iterator()>
	//    7   17:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   18:aload_3         
	//    9   19:invokeinterface #86  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            64
			BleDevice bledevice = (BleDevice)iterator.next();
	//   11   27:aload_3         
	//   12   28:invokeinterface #90  <Method Object Iterator.next()>
	//   13   33:checkcast       #92  <Class BleDevice>
	//   14   36:astore          4
			if(bledevice.getDataTypes().contains(((Object) (datatype))))
	//*  15   38:aload           4
	//*  16   40:invokevirtual   #95  <Method List BleDevice.getDataTypes()>
	//*  17   43:aload_1         
	//*  18   44:invokeinterface #98  <Method boolean List.contains(Object)>
	//*  19   49:ifeq            61
				((List) (arraylist)).add(((Object) (bledevice)));
	//   20   52:aload_2         
	//   21   53:aload           4
	//   22   55:invokeinterface #101 <Method boolean List.add(Object)>
	//   23   60:pop             
		} while(true);
	//   24   61:goto            18
		return Collections.unmodifiableList(((List) (arraylist)));
	//   25   64:aload_2         
	//   26   65:invokestatic    #36  <Method List Collections.unmodifiableList(List)>
	//   27   68:areturn         
	}

	public Status getStatus()
	{
		return zzair;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Status zzair>
	//    2    4:areturn         
	}

	int getVersionCode()
	{
		return zzaiI;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int zzaiI>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			zzair, zzaWO
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #40  <Field Status zzair>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #38  <Field List zzaWO>
	//   11   17:aastore         
	//   12   18:invokestatic    #112 <Method int zzaa.hashCode(Object[])>
	//   13   21:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("status", ((Object) (zzair))).zzg("bleDevices", ((Object) (zzaWO))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #118 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #120 <String "status">
	//    3    6:aload_0         
	//    4    7:getfield        #40  <Field Status zzair>
	//    5   10:invokevirtual   #126 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    6   13:ldc1            #128 <String "bleDevices">
	//    7   15:aload_0         
	//    8   16:getfield        #38  <Field List zzaWO>
	//    9   19:invokevirtual   #126 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   10   22:invokevirtual   #130 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   11   25:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.result.zza.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #136 <Method void com.google.android.gms.fitness.result.zza.zza(BleDevicesResult, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.fitness.result.zza();
	private final List zzaWO;
	private final int zzaiI;
	private final Status zzair;

	static 
	{
	//    0    0:new             #20  <Class com.google.android.gms.fitness.result.zza>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void com.google.android.gms.fitness.result.zza()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
