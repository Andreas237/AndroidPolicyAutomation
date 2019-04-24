// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.util.zzb;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzaon;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.request:
//			zzl

public class DataSourcesRequest extends zza
{
	public static class Builder
	{

		static DataType[] zza(Builder builder)
		{
			return builder.zzaVQ;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field DataType[] zzaVQ>
		//    2    4:areturn         
		}

		static int[] zzb(Builder builder)
		{
			return builder.zzaVR;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field int[] zzaVR>
		//    2    4:areturn         
		}

		public DataSourcesRequest build()
		{
			boolean flag;
			if(zzaVQ.length > 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field DataType[] zzaVQ>
		//*   2    4:arraylength     
		//*   3    5:ifle            13
				flag = true;
		//    4    8:iconst_1        
		//    5    9:istore_1        
			else
		//*   6   10:goto            15
				flag = false;
		//    7   13:iconst_0        
		//    8   14:istore_1        
			zzac.zza(flag, "Must add at least one data type");
		//    9   15:iload_1         
		//   10   16:ldc1            #34  <String "Must add at least one data type">
		//   11   18:invokestatic    #39  <Method void zzac.zza(boolean, Object)>
			if(zzaVR.length > 0)
		//*  12   21:aload_0         
		//*  13   22:getfield        #23  <Field int[] zzaVR>
		//*  14   25:arraylength     
		//*  15   26:ifle            34
				flag = true;
		//   16   29:iconst_1        
		//   17   30:istore_1        
			else
		//*  18   31:goto            36
				flag = false;
		//   19   34:iconst_0        
		//   20   35:istore_1        
			zzac.zza(flag, "Must add at least one data source type");
		//   21   36:iload_1         
		//   22   37:ldc1            #41  <String "Must add at least one data source type">
		//   23   39:invokestatic    #39  <Method void zzac.zza(boolean, Object)>
			return new DataSourcesRequest(this);
		//   24   42:new             #6   <Class DataSourcesRequest>
		//   25   45:dup             
		//   26   46:aload_0         
		//   27   47:aconst_null     
		//   28   48:invokespecial   #44  <Method void DataSourcesRequest(DataSourcesRequest$Builder, DataSourcesRequest$1)>
		//   29   51:areturn         
		}

		public transient Builder setDataSourceTypes(int ai[])
		{
			zzaVR = ai;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #23  <Field int[] zzaVR>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public transient Builder setDataTypes(DataType adatatype[])
		{
			zzaVQ = adatatype;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field DataType[] zzaVQ>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private boolean zzaVO;
		private DataType zzaVQ[];
		private int zzaVR[] = {
			0, 1
		};

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			zzaVQ = new DataType[0];
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:anewarray       DataType[]
		//    5    9:putfield        #21  <Field DataType[] zzaVQ>
		//    6   12:aload_0         
		//    7   13:iconst_2        
		//    8   14:newarray        int[]
		//    9   16:dup             
		//   10   17:iconst_0        
		//   11   18:iconst_0        
		//   12   19:iastore         
		//   13   20:dup             
		//   14   21:iconst_1        
		//   15   22:iconst_1        
		//   16   23:iastore         
		//   17   24:putfield        #23  <Field int[] zzaVR>
			zzaVO = false;
		//   18   27:aload_0         
		//   19   28:iconst_0        
		//   20   29:putfield        #25  <Field boolean zzaVO>
		//   21   32:return          
		}
	}


	DataSourcesRequest(int i, List list, List list1, boolean flag, IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #37  <Field int zzaiI>
		zzaSs = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #39  <Field List zzaSs>
		zzaVN = list1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #41  <Field List zzaVN>
		zzaVO = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #43  <Field boolean zzaVO>
		zzaVP = com.google.android.gms.internal.zzaon.zza.zzcr(ibinder);
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:invokestatic    #49  <Method zzaon com.google.android.gms.internal.zzaon$zza.zzcr(IBinder)>
	//   17   31:putfield        #51  <Field zzaon zzaVP>
	//   18   34:return          
	}

	private DataSourcesRequest(Builder builder)
	{
		this(((List) (zzb.zzb(((Object []) (com.google.android.gms.fitness.request.Builder.zza(builder)))))), Arrays.asList(((Object []) (zzb.zza(com.google.android.gms.fitness.request.Builder.zzb(builder))))), false, ((zzaon) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #58  <Method DataType[] com.google.android.gms.fitness.request.DataSourcesRequest$Builder.zza(DataSourcesRequest$Builder)>
	//    3    5:invokestatic    #64  <Method java.util.ArrayList zzb.zzb(Object[])>
	//    4    8:aload_1         
	//    5    9:invokestatic    #67  <Method int[] com.google.android.gms.fitness.request.DataSourcesRequest$Builder.zzb(DataSourcesRequest$Builder)>
	//    6   12:invokestatic    #70  <Method Integer[] zzb.zza(int[])>
	//    7   15:invokestatic    #76  <Method List Arrays.asList(Object[])>
	//    8   18:iconst_0        
	//    9   19:aconst_null     
	//   10   20:invokespecial   #79  <Method void DataSourcesRequest(List, List, boolean, zzaon)>
	//   11   23:return          
	}


	public DataSourcesRequest(DataSourcesRequest datasourcesrequest, zzaon zzaon1)
	{
		this(datasourcesrequest.zzaSs, datasourcesrequest.zzaVN, datasourcesrequest.zzaVO, zzaon1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #39  <Field List zzaSs>
	//    3    5:aload_1         
	//    4    6:getfield        #41  <Field List zzaVN>
	//    5    9:aload_1         
	//    6   10:getfield        #43  <Field boolean zzaVO>
	//    7   13:aload_2         
	//    8   14:invokespecial   #79  <Method void DataSourcesRequest(List, List, boolean, zzaon)>
	//    9   17:return          
	}

	public DataSourcesRequest(List list, List list1, boolean flag, zzaon zzaon1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void zza()>
		zzaiI = 4;
	//    2    4:aload_0         
	//    3    5:iconst_4        
	//    4    6:putfield        #37  <Field int zzaiI>
		zzaSs = list;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #39  <Field List zzaSs>
		zzaVN = list1;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #41  <Field List zzaVN>
		zzaVO = flag;
	//   11   19:aload_0         
	//   12   20:iload_3         
	//   13   21:putfield        #43  <Field boolean zzaVO>
		zzaVP = zzaon1;
	//   14   24:aload_0         
	//   15   25:aload           4
	//   16   27:putfield        #51  <Field zzaon zzaVP>
	//   17   30:return          
	}

	public IBinder getCallbackBinder()
	{
		if(zzaVP == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field zzaon zzaVP>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return zzaVP.asBinder();
	//    5    9:aload_0         
	//    6   10:getfield        #51  <Field zzaon zzaVP>
	//    7   13:invokeinterface #91  <Method IBinder zzaon.asBinder()>
	//    8   18:areturn         
	}

	public List getDataTypes()
	{
		return zzaSs;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field List zzaSs>
	//    2    4:areturn         
	}

	int getVersionCode()
	{
		return zzaiI;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int zzaiI>
	//    2    4:ireturn         
	}

	public String toString()
	{
		com.google.android.gms.common.internal.zzaa.zza zza1 = zzaa.zzv(((Object) (this))).zzg("dataTypes", ((Object) (zzaSs))).zzg("sourceTypes", ((Object) (zzaVN)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #104 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #106 <String "dataTypes">
	//    3    6:aload_0         
	//    4    7:getfield        #39  <Field List zzaSs>
	//    5   10:invokevirtual   #112 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    6   13:ldc1            #114 <String "sourceTypes">
	//    7   15:aload_0         
	//    8   16:getfield        #41  <Field List zzaVN>
	//    9   19:invokevirtual   #112 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   10   22:astore_1        
		if(zzaVO)
	//*  11   23:aload_0         
	//*  12   24:getfield        #43  <Field boolean zzaVO>
	//*  13   27:ifeq            39
			zza1.zzg("includeDbOnlySources", "true");
	//   14   30:aload_1         
	//   15   31:ldc1            #116 <String "includeDbOnlySources">
	//   16   33:ldc1            #118 <String "true">
	//   17   35:invokevirtual   #112 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   18   38:pop             
		return zza1.toString();
	//   19   39:aload_1         
	//   20   40:invokevirtual   #120 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   21   43:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.request.zzl.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #125 <Method void com.google.android.gms.fitness.request.zzl.zza(DataSourcesRequest, Parcel, int)>
	//    4    6:return          
	}

	public List zzCW()
	{
		return zzaVN;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List zzaVN>
	//    2    4:areturn         
	}

	public boolean zzCX()
	{
		return zzaVO;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field boolean zzaVO>
	//    2    4:ireturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzl();
	private final List zzaSs;
	private final List zzaVN;
	private final boolean zzaVO;
	private final zzaon zzaVP;
	private final int zzaiI;

	static 
	{
	//    0    0:new             #27  <Class zzl>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void zzl()>
	//    3    7:putstatic       #32  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
