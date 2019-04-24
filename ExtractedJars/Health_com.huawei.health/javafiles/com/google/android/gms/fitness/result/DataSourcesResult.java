// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.*;

// Referenced classes of package com.google.android.gms.fitness.result:
//			zzf

public class DataSourcesResult extends zza
	implements Result
{

	DataSourcesResult(int i, List list, Status status)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void zza()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #30  <Field int versionCode>
		zzaWX = Collections.unmodifiableList(list);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #36  <Method List Collections.unmodifiableList(List)>
	//    8   14:putfield        #38  <Field List zzaWX>
		zzahw = status;
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:putfield        #40  <Field Status zzahw>
	//   12   22:return          
	}

	public DataSourcesResult(List list, Status status)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void zza()>
		versionCode = 3;
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:putfield        #30  <Field int versionCode>
		zzaWX = Collections.unmodifiableList(list);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokestatic    #36  <Method List Collections.unmodifiableList(List)>
	//    8   14:putfield        #38  <Field List zzaWX>
		zzahw = status;
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:putfield        #40  <Field Status zzahw>
	//   12   22:return          
	}

	public static DataSourcesResult zzae(Status status)
	{
		return new DataSourcesResult(Collections.emptyList(), status);
	//    0    0:new             #2   <Class DataSourcesResult>
	//    1    3:dup             
	//    2    4:invokestatic    #50  <Method List Collections.emptyList()>
	//    3    7:aload_0         
	//    4    8:invokespecial   #52  <Method void DataSourcesResult(List, Status)>
	//    5   11:areturn         
	}

	private boolean zzb(DataSourcesResult datasourcesresult)
	{
		return zzahw.equals(((Object) (datasourcesresult.zzahw))) && zzaa.equal(((Object) (zzaWX)), ((Object) (datasourcesresult.zzaWX)));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Status zzahw>
	//    2    4:aload_1         
	//    3    5:getfield        #40  <Field Status zzahw>
	//    4    8:invokevirtual   #60  <Method boolean Status.equals(Object)>
	//    5   11:ifeq            30
	//    6   14:aload_0         
	//    7   15:getfield        #38  <Field List zzaWX>
	//    8   18:aload_1         
	//    9   19:getfield        #38  <Field List zzaWX>
	//   10   22:invokestatic    #66  <Method boolean zzaa.equal(Object, Object)>
	//   11   25:ifeq            30
	//   12   28:iconst_1        
	//   13   29:ireturn         
	//   14   30:iconst_0        
	//   15   31:ireturn         
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof DataSourcesResult) && zzb((DataSourcesResult)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class DataSourcesResult>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class DataSourcesResult>
	//    9   17:invokespecial   #68  <Method boolean zzb(DataSourcesResult)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public List getDataSources()
	{
		return zzaWX;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field List zzaWX>
	//    2    4:areturn         
	}

	public List getDataSources(DataType datatype)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #73  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #74  <Method void ArrayList()>
	//    3    7:astore_2        
		Iterator iterator = zzaWX.iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #38  <Field List zzaWX>
	//    6   12:invokeinterface #80  <Method Iterator List.iterator()>
	//    7   17:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   18:aload_3         
	//    9   19:invokeinterface #86  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            62
			DataSource datasource = (DataSource)iterator.next();
	//   11   27:aload_3         
	//   12   28:invokeinterface #90  <Method Object Iterator.next()>
	//   13   33:checkcast       #92  <Class DataSource>
	//   14   36:astore          4
			if(datasource.getDataType().equals(((Object) (datatype))))
	//*  15   38:aload           4
	//*  16   40:invokevirtual   #96  <Method DataType DataSource.getDataType()>
	//*  17   43:aload_1         
	//*  18   44:invokevirtual   #99  <Method boolean DataType.equals(Object)>
	//*  19   47:ifeq            59
				((List) (arraylist)).add(((Object) (datasource)));
	//   20   50:aload_2         
	//   21   51:aload           4
	//   22   53:invokeinterface #102 <Method boolean List.add(Object)>
	//   23   58:pop             
		} while(true);
	//   24   59:goto            18
		return Collections.unmodifiableList(((List) (arraylist)));
	//   25   62:aload_2         
	//   26   63:invokestatic    #36  <Method List Collections.unmodifiableList(List)>
	//   27   66:areturn         
	}

	public Status getStatus()
	{
		return zzahw;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Status zzahw>
	//    2    4:areturn         
	}

	int getVersionCode()
	{
		return versionCode;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int versionCode>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			zzahw, zzaWX
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #40  <Field Status zzahw>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #38  <Field List zzaWX>
	//   11   17:aastore         
	//   12   18:invokestatic    #113 <Method int zzaa.hashCode(Object[])>
	//   13   21:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("status", ((Object) (zzahw))).zzg("dataSources", ((Object) (zzaWX))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #119 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #121 <String "status">
	//    3    6:aload_0         
	//    4    7:getfield        #40  <Field Status zzahw>
	//    5   10:invokevirtual   #127 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    6   13:ldc1            #129 <String "dataSources">
	//    7   15:aload_0         
	//    8   16:getfield        #38  <Field List zzaWX>
	//    9   19:invokevirtual   #127 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   10   22:invokevirtual   #131 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   11   25:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.result.zzf.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #137 <Method void com.google.android.gms.fitness.result.zzf.zza(DataSourcesResult, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzf();
	private final int versionCode;
	private final List zzaWX;
	private final Status zzahw;

	static 
	{
	//    0    0:new             #20  <Class zzf>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void zzf()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
