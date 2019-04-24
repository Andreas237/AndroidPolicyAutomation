// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;

// Referenced classes of package com.google.android.gms.fitness.request:
//			DataUpdateListenerRegistrationRequest

public static class DataUpdateListenerRegistrationRequest$Builder
{

	static DataSource zza(DataUpdateListenerRegistrationRequest$Builder dataupdatelistenerregistrationrequest$builder)
	{
		return dataupdatelistenerregistrationrequest$builder.zzaTi;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field DataSource zzaTi>
	//    2    4:areturn         
	}

	static DataType zzb(DataUpdateListenerRegistrationRequest$Builder dataupdatelistenerregistrationrequest$builder)
	{
		return dataupdatelistenerregistrationrequest$builder.zzaTj;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field DataType zzaTj>
	//    2    4:areturn         
	}

	static PendingIntent zzc(DataUpdateListenerRegistrationRequest$Builder dataupdatelistenerregistrationrequest$builder)
	{
		return dataupdatelistenerregistrationrequest$builder.mPendingIntent;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field PendingIntent mPendingIntent>
	//    2    4:areturn         
	}

	public DataUpdateListenerRegistrationRequest build()
	{
		boolean flag;
		if(zzaTi != null || zzaTj != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field DataSource zzaTi>
	//*   2    4:ifnonnull       14
	//*   3    7:aload_0         
	//*   4    8:getfield        #26  <Field DataType zzaTj>
	//*   5   11:ifnull          19
			flag = true;
	//    6   14:iconst_1        
	//    7   15:istore_1        
		else
	//*   8   16:goto            21
			flag = false;
	//    9   19:iconst_0        
	//   10   20:istore_1        
		zzac.zza(flag, "Set either dataSource or dataTYpe");
	//   11   21:iload_1         
	//   12   22:ldc1            #34  <String "Set either dataSource or dataTYpe">
	//   13   24:invokestatic    #39  <Method void zzac.zza(boolean, Object)>
		zzac.zzb(((Object) (mPendingIntent)), "pendingIntent must be set");
	//   14   27:aload_0         
	//   15   28:getfield        #30  <Field PendingIntent mPendingIntent>
	//   16   31:ldc1            #41  <String "pendingIntent must be set">
	//   17   33:invokestatic    #44  <Method Object zzac.zzb(Object, Object)>
	//   18   36:pop             
		return new DataUpdateListenerRegistrationRequest(this, ((DataUpdateListenerRegistrationRequest._cls1) (null)));
	//   19   37:new             #6   <Class DataUpdateListenerRegistrationRequest>
	//   20   40:dup             
	//   21   41:aload_0         
	//   22   42:aconst_null     
	//   23   43:invokespecial   #47  <Method void DataUpdateListenerRegistrationRequest(DataUpdateListenerRegistrationRequest$Builder, DataUpdateListenerRegistrationRequest$1)>
	//   24   46:areturn         
	}

	public DataUpdateListenerRegistrationRequest$Builder setDataSource(DataSource datasource)
		throws NullPointerException
	{
		zzac.zzw(((Object) (datasource)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #55  <Method Object zzac.zzw(Object)>
	//    2    4:pop             
		zzaTi = datasource;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #22  <Field DataSource zzaTi>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public DataUpdateListenerRegistrationRequest$Builder setDataType(DataType datatype)
	{
		zzac.zzw(((Object) (datatype)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #55  <Method Object zzac.zzw(Object)>
	//    2    4:pop             
		zzaTj = datatype;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #26  <Field DataType zzaTj>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public DataUpdateListenerRegistrationRequest$Builder setPendingIntent(PendingIntent pendingintent)
	{
		zzac.zzw(((Object) (pendingintent)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #55  <Method Object zzac.zzw(Object)>
	//    2    4:pop             
		mPendingIntent = pendingintent;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #30  <Field PendingIntent mPendingIntent>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	private PendingIntent mPendingIntent;
	private DataSource zzaTi;
	private DataType zzaTj;

	public DataUpdateListenerRegistrationRequest$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}
}
