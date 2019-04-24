// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.fitness.data.DataType;

// Referenced classes of package com.google.android.gms.fitness.request:
//			DataSourcesRequest

public static class DataSourcesRequest$Builder
{

	static DataType[] zza(DataSourcesRequest$Builder datasourcesrequest$builder)
	{
		return datasourcesrequest$builder.zzaVQ;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field DataType[] zzaVQ>
	//    2    4:areturn         
	}

	static int[] zzb(DataSourcesRequest$Builder datasourcesrequest$builder)
	{
		return datasourcesrequest$builder.zzaVR;
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
		return new DataSourcesRequest(this, ((DataSourcesRequest._cls1) (null)));
	//   24   42:new             #6   <Class DataSourcesRequest>
	//   25   45:dup             
	//   26   46:aload_0         
	//   27   47:aconst_null     
	//   28   48:invokespecial   #44  <Method void DataSourcesRequest(DataSourcesRequest$Builder, DataSourcesRequest$1)>
	//   29   51:areturn         
	}

	public transient DataSourcesRequest$Builder setDataSourceTypes(int ai[])
	{
		zzaVR = ai;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field int[] zzaVR>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public transient DataSourcesRequest$Builder setDataTypes(DataType adatatype[])
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

	public DataSourcesRequest$Builder()
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
