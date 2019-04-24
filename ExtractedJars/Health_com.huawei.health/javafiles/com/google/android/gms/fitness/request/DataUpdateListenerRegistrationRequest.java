// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzapf;

// Referenced classes of package com.google.android.gms.fitness.request:
//			zzp

public class DataUpdateListenerRegistrationRequest extends zza
{
	public static class Builder
	{

		static DataSource zza(Builder builder)
		{
			return builder.zzaTi;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field DataSource zzaTi>
		//    2    4:areturn         
		}

		static DataType zzb(Builder builder)
		{
			return builder.zzaTj;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field DataType zzaTj>
		//    2    4:areturn         
		}

		static PendingIntent zzc(Builder builder)
		{
			return builder.mPendingIntent;
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
			return new DataUpdateListenerRegistrationRequest(this);
		//   19   37:new             #6   <Class DataUpdateListenerRegistrationRequest>
		//   20   40:dup             
		//   21   41:aload_0         
		//   22   42:aconst_null     
		//   23   43:invokespecial   #47  <Method void DataUpdateListenerRegistrationRequest(DataUpdateListenerRegistrationRequest$Builder, DataUpdateListenerRegistrationRequest$1)>
		//   24   46:areturn         
		}

		public Builder setDataSource(DataSource datasource)
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

		public Builder setDataType(DataType datatype)
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

		public Builder setPendingIntent(PendingIntent pendingintent)
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

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:return          
		}
	}


	DataUpdateListenerRegistrationRequest(int i, DataSource datasource, DataType datatype, PendingIntent pendingintent, IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #36  <Field int zzaiI>
		zzaTi = datasource;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #38  <Field DataSource zzaTi>
		zzaTj = datatype;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #40  <Field DataType zzaTj>
		mPendingIntent = pendingintent;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #42  <Field PendingIntent mPendingIntent>
		zzaVt = com.google.android.gms.internal.zzapf.zza.zzcJ(ibinder);
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:invokestatic    #48  <Method zzapf com.google.android.gms.internal.zzapf$zza.zzcJ(IBinder)>
	//   17   31:putfield        #50  <Field zzapf zzaVt>
	//   18   34:return          
	}

	public DataUpdateListenerRegistrationRequest(DataSource datasource, DataType datatype, PendingIntent pendingintent, IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void zza()>
		zzaiI = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #36  <Field int zzaiI>
		zzaTi = datasource;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #38  <Field DataSource zzaTi>
		zzaTj = datatype;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #40  <Field DataType zzaTj>
		mPendingIntent = pendingintent;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #42  <Field PendingIntent mPendingIntent>
		zzaVt = com.google.android.gms.internal.zzapf.zza.zzcJ(ibinder);
	//   14   24:aload_0         
	//   15   25:aload           4
	//   16   27:invokestatic    #48  <Method zzapf com.google.android.gms.internal.zzapf$zza.zzcJ(IBinder)>
	//   17   30:putfield        #50  <Field zzapf zzaVt>
	//   18   33:return          
	}

	private DataUpdateListenerRegistrationRequest(Builder builder)
	{
		this(com.google.android.gms.fitness.request.Builder.zza(builder), Builder.zzb(builder), Builder.zzc(builder), ((IBinder) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #56  <Method DataSource com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest$Builder.zza(DataUpdateListenerRegistrationRequest$Builder)>
	//    3    5:aload_1         
	//    4    6:invokestatic    #60  <Method DataType DataUpdateListenerRegistrationRequest$Builder.zzb(DataUpdateListenerRegistrationRequest$Builder)>
	//    5    9:aload_1         
	//    6   10:invokestatic    #64  <Method PendingIntent DataUpdateListenerRegistrationRequest$Builder.zzc(DataUpdateListenerRegistrationRequest$Builder)>
	//    7   13:aconst_null     
	//    8   14:invokespecial   #66  <Method void DataUpdateListenerRegistrationRequest(DataSource, DataType, PendingIntent, IBinder)>
	//    9   17:return          
	}


	public DataUpdateListenerRegistrationRequest(DataUpdateListenerRegistrationRequest dataupdatelistenerregistrationrequest, IBinder ibinder)
	{
		this(dataupdatelistenerregistrationrequest.zzaTi, dataupdatelistenerregistrationrequest.zzaTj, dataupdatelistenerregistrationrequest.mPendingIntent, ibinder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #38  <Field DataSource zzaTi>
	//    3    5:aload_1         
	//    4    6:getfield        #40  <Field DataType zzaTj>
	//    5    9:aload_1         
	//    6   10:getfield        #42  <Field PendingIntent mPendingIntent>
	//    7   13:aload_2         
	//    8   14:invokespecial   #66  <Method void DataUpdateListenerRegistrationRequest(DataSource, DataType, PendingIntent, IBinder)>
	//    9   17:return          
	}

	private boolean zzb(DataUpdateListenerRegistrationRequest dataupdatelistenerregistrationrequest)
	{
		return zzaa.equal(((Object) (zzaTi)), ((Object) (dataupdatelistenerregistrationrequest.zzaTi))) && zzaa.equal(((Object) (zzaTj)), ((Object) (dataupdatelistenerregistrationrequest.zzaTj))) && zzaa.equal(((Object) (mPendingIntent)), ((Object) (dataupdatelistenerregistrationrequest.mPendingIntent)));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field DataSource zzaTi>
	//    2    4:aload_1         
	//    3    5:getfield        #38  <Field DataSource zzaTi>
	//    4    8:invokestatic    #77  <Method boolean zzaa.equal(Object, Object)>
	//    5   11:ifeq            44
	//    6   14:aload_0         
	//    7   15:getfield        #40  <Field DataType zzaTj>
	//    8   18:aload_1         
	//    9   19:getfield        #40  <Field DataType zzaTj>
	//   10   22:invokestatic    #77  <Method boolean zzaa.equal(Object, Object)>
	//   11   25:ifeq            44
	//   12   28:aload_0         
	//   13   29:getfield        #42  <Field PendingIntent mPendingIntent>
	//   14   32:aload_1         
	//   15   33:getfield        #42  <Field PendingIntent mPendingIntent>
	//   16   36:invokestatic    #77  <Method boolean zzaa.equal(Object, Object)>
	//   17   39:ifeq            44
	//   18   42:iconst_1        
	//   19   43:ireturn         
	//   20   44:iconst_0        
	//   21   45:ireturn         
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof DataUpdateListenerRegistrationRequest) && zzb((DataUpdateListenerRegistrationRequest)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class DataUpdateListenerRegistrationRequest>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class DataUpdateListenerRegistrationRequest>
	//    9   17:invokespecial   #81  <Method boolean zzb(DataUpdateListenerRegistrationRequest)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public IBinder getCallbackBinder()
	{
		if(zzaVt == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field zzapf zzaVt>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return zzaVt.asBinder();
	//    5    9:aload_0         
	//    6   10:getfield        #50  <Field zzapf zzaVt>
	//    7   13:invokeinterface #88  <Method IBinder zzapf.asBinder()>
	//    8   18:areturn         
	}

	public DataSource getDataSource()
	{
		return zzaTi;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field DataSource zzaTi>
	//    2    4:areturn         
	}

	public DataType getDataType()
	{
		return zzaTj;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field DataType zzaTj>
	//    2    4:areturn         
	}

	public PendingIntent getIntent()
	{
		return mPendingIntent;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field PendingIntent mPendingIntent>
	//    2    4:areturn         
	}

	int getVersionCode()
	{
		return zzaiI;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int zzaiI>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			zzaTi, zzaTj, mPendingIntent
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #38  <Field DataSource zzaTi>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #40  <Field DataType zzaTj>
	//   11   17:aastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:aload_0         
	//   15   21:getfield        #42  <Field PendingIntent mPendingIntent>
	//   16   24:aastore         
	//   17   25:invokestatic    #102 <Method int zzaa.hashCode(Object[])>
	//   18   28:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("dataSource", ((Object) (zzaTi))).zzg("dataType", ((Object) (zzaTj))).zzg("pendingIntent", ((Object) (mPendingIntent))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #108 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #110 <String "dataSource">
	//    3    6:aload_0         
	//    4    7:getfield        #38  <Field DataSource zzaTi>
	//    5   10:invokevirtual   #116 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    6   13:ldc1            #118 <String "dataType">
	//    7   15:aload_0         
	//    8   16:getfield        #40  <Field DataType zzaTj>
	//    9   19:invokevirtual   #116 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   10   22:ldc1            #120 <String "pendingIntent">
	//   11   24:aload_0         
	//   12   25:getfield        #42  <Field PendingIntent mPendingIntent>
	//   13   28:invokevirtual   #116 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   14   31:invokevirtual   #122 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   15   34:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.request.zzp.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #127 <Method void com.google.android.gms.fitness.request.zzp.zza(DataUpdateListenerRegistrationRequest, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzp();
	private final PendingIntent mPendingIntent;
	private DataSource zzaTi;
	private DataType zzaTj;
	private final zzapf zzaVt;
	private final int zzaiI;

	static 
	{
	//    0    0:new             #26  <Class zzp>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void zzp()>
	//    3    7:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
