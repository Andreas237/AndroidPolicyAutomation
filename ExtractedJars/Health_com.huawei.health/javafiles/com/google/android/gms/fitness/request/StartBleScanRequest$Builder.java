// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.fitness.data.DataType;

// Referenced classes of package com.google.android.gms.fitness.request:
//			StartBleScanRequest, zzai, BleScanCallback

public static class StartBleScanRequest$Builder
{

	static DataType[] zza(StartBleScanRequest$Builder startblescanrequest$builder)
	{
		return startblescanrequest$builder.zzaVQ;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field DataType[] zzaVQ>
	//    2    4:areturn         
	}

	static zzai zzb(StartBleScanRequest$Builder startblescanrequest$builder)
	{
		return startblescanrequest$builder.zzaWJ;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field zzai zzaWJ>
	//    2    4:areturn         
	}

	static int zzc(StartBleScanRequest$Builder startblescanrequest$builder)
	{
		return startblescanrequest$builder.zzaWK;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int zzaWK>
	//    2    4:ireturn         
	}

	public StartBleScanRequest build()
	{
		boolean flag;
		if(zzaWJ != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field zzai zzaWJ>
	//*   2    4:ifnull          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		zzac.zza(flag, "Must set BleScanCallback");
	//    8   14:iload_1         
	//    9   15:ldc1            #36  <String "Must set BleScanCallback">
	//   10   17:invokestatic    #41  <Method void zzac.zza(boolean, Object)>
		return new StartBleScanRequest(this, ((StartBleScanRequest._cls1) (null)));
	//   11   20:new             #6   <Class StartBleScanRequest>
	//   12   23:dup             
	//   13   24:aload_0         
	//   14   25:aconst_null     
	//   15   26:invokespecial   #44  <Method void StartBleScanRequest(StartBleScanRequest$Builder, StartBleScanRequest$1)>
	//   16   29:areturn         
	}

	public StartBleScanRequest$Builder setBleScanCallback(BleScanCallback blescancallback)
	{
		zza(((zzai) (com.google.android.gms.fitness.request.zza.zza.zzCL().zza(blescancallback))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #52  <Method zza$zza zza$zza.zzCL()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #55  <Method zza zza$zza.zza(BleScanCallback)>
	//    4    8:invokevirtual   #58  <Method StartBleScanRequest$Builder zza(zzai)>
	//    5   11:pop             
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public transient StartBleScanRequest$Builder setDataTypes(DataType adatatype[])
	{
		zzaVQ = adatatype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field DataType[] zzaVQ>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public StartBleScanRequest$Builder setTimeoutSecs(int i)
	{
		boolean flag;
		if(i > 0)
	//*   0    0:iload_1         
	//*   1    1:ifle            9
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:goto            11
			flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		zzac.zzb(flag, "Stop time must be greater than zero");
	//    7   11:iload_2         
	//    8   12:ldc1            #64  <String "Stop time must be greater than zero">
	//    9   14:invokestatic    #66  <Method void zzac.zzb(boolean, Object)>
		if(i <= 60)
	//*  10   17:iload_1         
	//*  11   18:bipush          60
	//*  12   20:icmpgt          28
			flag = true;
	//   13   23:iconst_1        
	//   14   24:istore_2        
		else
	//*  15   25:goto            30
			flag = false;
	//   16   28:iconst_0        
	//   17   29:istore_2        
		zzac.zzb(flag, "Stop time must be less than 1 minute");
	//   18   30:iload_2         
	//   19   31:ldc1            #68  <String "Stop time must be less than 1 minute">
	//   20   33:invokestatic    #66  <Method void zzac.zzb(boolean, Object)>
		zzaWK = i;
	//   21   36:aload_0         
	//   22   37:iload_1         
	//   23   38:putfield        #23  <Field int zzaWK>
		return this;
	//   24   41:aload_0         
	//   25   42:areturn         
	}

	public StartBleScanRequest$Builder zza(zzai zzai)
	{
		zzaWJ = zzai;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field zzai zzaWJ>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private DataType zzaVQ[];
	private zzai zzaWJ;
	private int zzaWK;

	public StartBleScanRequest$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzaVQ = new DataType[0];
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:anewarray       DataType[]
	//    5    9:putfield        #21  <Field DataType[] zzaVQ>
		zzaWK = 10;
	//    6   12:aload_0         
	//    7   13:bipush          10
	//    8   15:putfield        #23  <Field int zzaWK>
	//    9   18:return          
	}
}
