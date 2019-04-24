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
import com.google.android.gms.internal.zzapf;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.request:
//			zzbj, zzai, BleScanCallback

public class StartBleScanRequest extends zza
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

		static zzai zzb(Builder builder)
		{
			return builder.zzaWJ;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field zzai zzaWJ>
		//    2    4:areturn         
		}

		static int zzc(Builder builder)
		{
			return builder.zzaWK;
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
			return new StartBleScanRequest(this);
		//   11   20:new             #6   <Class StartBleScanRequest>
		//   12   23:dup             
		//   13   24:aload_0         
		//   14   25:aconst_null     
		//   15   26:invokespecial   #44  <Method void StartBleScanRequest(StartBleScanRequest$Builder, StartBleScanRequest$1)>
		//   16   29:areturn         
		}

		public Builder setBleScanCallback(BleScanCallback blescancallback)
		{
			zza(((zzai) (com.google.android.gms.fitness.request.zza.zza.zzCL().zza(blescancallback))));
		//    0    0:aload_0         
		//    1    1:invokestatic    #52  <Method zza$zza zza$zza.zzCL()>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #55  <Method com.google.android.gms.fitness.request.zza com.google.android.gms.fitness.request.zza$zza.zza(BleScanCallback)>
		//    4    8:invokevirtual   #58  <Method StartBleScanRequest$Builder zza(zzai)>
		//    5   11:pop             
			return this;
		//    6   12:aload_0         
		//    7   13:areturn         
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

		public Builder setTimeoutSecs(int i)
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

		public Builder zza(zzai zzai1)
		{
			zzaWJ = zzai1;
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

		public Builder()
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


	StartBleScanRequest(int i, List list, IBinder ibinder, int j, IBinder ibinder1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #36  <Field int zzaiI>
		zzaSs = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #38  <Field List zzaSs>
		zzaWJ = zzai.zza.zzcN(ibinder);
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:invokestatic    #44  <Method zzai zzai$zza.zzcN(IBinder)>
	//   11   19:putfield        #46  <Field zzai zzaWJ>
		zzaWK = j;
	//   12   22:aload_0         
	//   13   23:iload           4
	//   14   25:putfield        #48  <Field int zzaWK>
		zzaVt = com.google.android.gms.internal.zzapf.zza.zzcJ(ibinder1);
	//   15   28:aload_0         
	//   16   29:aload           5
	//   17   31:invokestatic    #54  <Method zzapf com.google.android.gms.internal.zzapf$zza.zzcJ(IBinder)>
	//   18   34:putfield        #56  <Field zzapf zzaVt>
	//   19   37:return          
	}

	private StartBleScanRequest(Builder builder)
	{
		this(((List) (zzb.zzb(((Object []) (com.google.android.gms.fitness.request.Builder.zza(builder)))))), com.google.android.gms.fitness.request.Builder.zzb(builder), Builder.zzc(builder), ((zzapf) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #63  <Method DataType[] com.google.android.gms.fitness.request.StartBleScanRequest$Builder.zza(StartBleScanRequest$Builder)>
	//    3    5:invokestatic    #69  <Method java.util.ArrayList zzb.zzb(Object[])>
	//    4    8:aload_1         
	//    5    9:invokestatic    #72  <Method zzai com.google.android.gms.fitness.request.StartBleScanRequest$Builder.zzb(StartBleScanRequest$Builder)>
	//    6   12:aload_1         
	//    7   13:invokestatic    #76  <Method int StartBleScanRequest$Builder.zzc(StartBleScanRequest$Builder)>
	//    8   16:aconst_null     
	//    9   17:invokespecial   #79  <Method void StartBleScanRequest(List, zzai, int, zzapf)>
	//   10   20:return          
	}


	public StartBleScanRequest(StartBleScanRequest startblescanrequest, zzapf zzapf1)
	{
		this(startblescanrequest.zzaSs, startblescanrequest.zzaWJ, startblescanrequest.zzaWK, zzapf1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #38  <Field List zzaSs>
	//    3    5:aload_1         
	//    4    6:getfield        #46  <Field zzai zzaWJ>
	//    5    9:aload_1         
	//    6   10:getfield        #48  <Field int zzaWK>
	//    7   13:aload_2         
	//    8   14:invokespecial   #79  <Method void StartBleScanRequest(List, zzai, int, zzapf)>
	//    9   17:return          
	}

	public StartBleScanRequest(List list, zzai zzai1, int i, zzapf zzapf1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void zza()>
		zzaiI = 4;
	//    2    4:aload_0         
	//    3    5:iconst_4        
	//    4    6:putfield        #36  <Field int zzaiI>
		zzaSs = list;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #38  <Field List zzaSs>
		zzaWJ = zzai1;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #46  <Field zzai zzaWJ>
		zzaWK = i;
	//   11   19:aload_0         
	//   12   20:iload_3         
	//   13   21:putfield        #48  <Field int zzaWK>
		zzaVt = zzapf1;
	//   14   24:aload_0         
	//   15   25:aload           4
	//   16   27:putfield        #56  <Field zzapf zzaVt>
	//   17   30:return          
	}

	public IBinder getCallbackBinder()
	{
		if(zzaVt == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field zzapf zzaVt>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return zzaVt.asBinder();
	//    5    9:aload_0         
	//    6   10:getfield        #56  <Field zzapf zzaVt>
	//    7   13:invokeinterface #91  <Method IBinder zzapf.asBinder()>
	//    8   18:areturn         
	}

	public List getDataTypes()
	{
		return Collections.unmodifiableList(zzaSs);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field List zzaSs>
	//    2    4:invokestatic    #99  <Method List Collections.unmodifiableList(List)>
	//    3    7:areturn         
	}

	public int getTimeoutSecs()
	{
		return zzaWK;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int zzaWK>
	//    2    4:ireturn         
	}

	int getVersionCode()
	{
		return zzaiI;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int zzaiI>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("dataTypes", ((Object) (zzaSs))).zzg("timeoutSecs", ((Object) (Integer.valueOf(zzaWK)))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #111 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #113 <String "dataTypes">
	//    3    6:aload_0         
	//    4    7:getfield        #38  <Field List zzaSs>
	//    5   10:invokevirtual   #119 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    6   13:ldc1            #121 <String "timeoutSecs">
	//    7   15:aload_0         
	//    8   16:getfield        #48  <Field int zzaWK>
	//    9   19:invokestatic    #127 <Method Integer Integer.valueOf(int)>
	//   10   22:invokevirtual   #119 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   11   25:invokevirtual   #129 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   12   28:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.request.zzbj.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #134 <Method void com.google.android.gms.fitness.request.zzbj.zza(StartBleScanRequest, Parcel, int)>
	//    4    6:return          
	}

	public IBinder zzDm()
	{
		return zzaWJ.asBinder();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field zzai zzaWJ>
	//    2    4:invokeinterface #138 <Method IBinder zzai.asBinder()>
	//    3    9:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzbj();
	private final List zzaSs;
	private final zzapf zzaVt;
	private final zzai zzaWJ;
	private final int zzaWK;
	private final int zzaiI;

	static 
	{
	//    0    0:new             #26  <Class zzbj>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void zzbj()>
	//    3    7:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
