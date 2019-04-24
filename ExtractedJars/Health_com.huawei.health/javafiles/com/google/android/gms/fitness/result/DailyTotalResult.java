// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;

// Referenced classes of package com.google.android.gms.fitness.result:
//			zzb

public class DailyTotalResult extends zza
	implements Result
{

	DailyTotalResult(int i, Status status, DataSet dataset)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #29  <Field int zzaiI>
		zzair = status;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field Status zzair>
		zzaUn = dataset;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #33  <Field DataSet zzaUn>
	//   11   19:return          
	}

	public DailyTotalResult(DataSet dataset, Status status)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void zza()>
		zzaiI = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #29  <Field int zzaiI>
		zzair = status;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field Status zzair>
		zzaUn = dataset;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #33  <Field DataSet zzaUn>
	//   11   19:return          
	}

	public static DailyTotalResult zza(Status status, DataType datatype)
	{
		return new DailyTotalResult(DataSet.create((new com.google.android.gms.fitness.data.DataSource.Builder()).setDataType(datatype).setType(1).build()), status);
	//    0    0:new             #2   <Class DailyTotalResult>
	//    1    3:dup             
	//    2    4:new             #38  <Class com.google.android.gms.fitness.data.DataSource$Builder>
	//    3    7:dup             
	//    4    8:invokespecial   #39  <Method void com.google.android.gms.fitness.data.DataSource$Builder()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #43  <Method com.google.android.gms.fitness.data.DataSource$Builder com.google.android.gms.fitness.data.DataSource$Builder.setDataType(DataType)>
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #47  <Method com.google.android.gms.fitness.data.DataSource$Builder com.google.android.gms.fitness.data.DataSource$Builder.setType(int)>
	//    9   19:invokevirtual   #51  <Method com.google.android.gms.fitness.data.DataSource com.google.android.gms.fitness.data.DataSource$Builder.build()>
	//   10   22:invokestatic    #57  <Method DataSet DataSet.create(com.google.android.gms.fitness.data.DataSource)>
	//   11   25:aload_0         
	//   12   26:invokespecial   #59  <Method void DailyTotalResult(DataSet, Status)>
	//   13   29:areturn         
	}

	private boolean zzb(DailyTotalResult dailytotalresult)
	{
		return zzair.equals(((Object) (dailytotalresult.zzair))) && zzaa.equal(((Object) (zzaUn)), ((Object) (dailytotalresult.zzaUn)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Status zzair>
	//    2    4:aload_1         
	//    3    5:getfield        #31  <Field Status zzair>
	//    4    8:invokevirtual   #67  <Method boolean Status.equals(Object)>
	//    5   11:ifeq            30
	//    6   14:aload_0         
	//    7   15:getfield        #33  <Field DataSet zzaUn>
	//    8   18:aload_1         
	//    9   19:getfield        #33  <Field DataSet zzaUn>
	//   10   22:invokestatic    #73  <Method boolean zzaa.equal(Object, Object)>
	//   11   25:ifeq            30
	//   12   28:iconst_1        
	//   13   29:ireturn         
	//   14   30:iconst_0        
	//   15   31:ireturn         
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof DailyTotalResult) && zzb((DailyTotalResult)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class DailyTotalResult>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class DailyTotalResult>
	//    9   17:invokespecial   #75  <Method boolean zzb(DailyTotalResult)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public Status getStatus()
	{
		return zzair;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Status zzair>
	//    2    4:areturn         
	}

	public DataSet getTotal()
	{
		return zzaUn;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field DataSet zzaUn>
	//    2    4:areturn         
	}

	int getVersionCode()
	{
		return zzaiI;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int zzaiI>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			zzair, zzaUn
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #31  <Field Status zzair>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #33  <Field DataSet zzaUn>
	//   11   17:aastore         
	//   12   18:invokestatic    #89  <Method int zzaa.hashCode(Object[])>
	//   13   21:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("status", ((Object) (zzair))).zzg("dataPoint", ((Object) (zzaUn))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #95  <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #97  <String "status">
	//    3    6:aload_0         
	//    4    7:getfield        #31  <Field Status zzair>
	//    5   10:invokevirtual   #103 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    6   13:ldc1            #105 <String "dataPoint">
	//    7   15:aload_0         
	//    8   16:getfield        #33  <Field DataSet zzaUn>
	//    9   19:invokevirtual   #103 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   10   22:invokevirtual   #107 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   11   25:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.result.zzb.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #112 <Method void com.google.android.gms.fitness.result.zzb.zza(DailyTotalResult, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzb();
	private final DataSet zzaUn;
	private final int zzaiI;
	private final Status zzair;

	static 
	{
	//    0    0:new             #19  <Class zzb>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void zzb()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
