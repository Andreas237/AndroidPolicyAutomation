// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.service;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.zzs;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.service:
//			zza, zzb, SensorEventDispatcher

public class FitnessSensorServiceRequest extends zza
{

	FitnessSensorServiceRequest(int i, DataSource datasource, IBinder ibinder, long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void zza()>
		zzaiI = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #32  <Field int zzaiI>
		zzaTi = datasource;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #34  <Field DataSource zzaTi>
		zzaWo = com.google.android.gms.fitness.data.zzs.zza.zzcg(ibinder);
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:invokestatic    #40  <Method zzs com.google.android.gms.fitness.data.zzs$zza.zzcg(IBinder)>
	//   11   19:putfield        #42  <Field zzs zzaWo>
		zzaXi = l;
	//   12   22:aload_0         
	//   13   23:lload           4
	//   14   25:putfield        #44  <Field long zzaXi>
		zzaXj = l1;
	//   15   28:aload_0         
	//   16   29:lload           6
	//   17   31:putfield        #46  <Field long zzaXj>
	//   18   34:return          
	}

	private boolean zza(FitnessSensorServiceRequest fitnesssensorservicerequest)
	{
		return zzaa.equal(((Object) (zzaTi)), ((Object) (fitnesssensorservicerequest.zzaTi))) && zzaXi == fitnesssensorservicerequest.zzaXi && zzaXj == fitnesssensorservicerequest.zzaXj;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field DataSource zzaTi>
	//    2    4:aload_1         
	//    3    5:getfield        #34  <Field DataSource zzaTi>
	//    4    8:invokestatic    #54  <Method boolean zzaa.equal(Object, Object)>
	//    5   11:ifeq            40
	//    6   14:aload_0         
	//    7   15:getfield        #44  <Field long zzaXi>
	//    8   18:aload_1         
	//    9   19:getfield        #44  <Field long zzaXi>
	//   10   22:lcmp            
	//   11   23:ifne            40
	//   12   26:aload_0         
	//   13   27:getfield        #46  <Field long zzaXj>
	//   14   30:aload_1         
	//   15   31:getfield        #46  <Field long zzaXj>
	//   16   34:lcmp            
	//   17   35:ifne            40
	//   18   38:iconst_1        
	//   19   39:ireturn         
	//   20   40:iconst_0        
	//   21   41:ireturn         
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof FitnessSensorServiceRequest) && zza((FitnessSensorServiceRequest)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class FitnessSensorServiceRequest>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class FitnessSensorServiceRequest>
	//    9   17:invokespecial   #58  <Method boolean zza(FitnessSensorServiceRequest)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public long getBatchInterval(TimeUnit timeunit)
	{
		return timeunit.convert(zzaXj, TimeUnit.MICROSECONDS);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #46  <Field long zzaXj>
	//    3    5:getstatic       #66  <Field TimeUnit TimeUnit.MICROSECONDS>
	//    4    8:invokevirtual   #70  <Method long TimeUnit.convert(long, TimeUnit)>
	//    5   11:lreturn         
	}

	public DataSource getDataSource()
	{
		return zzaTi;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field DataSource zzaTi>
	//    2    4:areturn         
	}

	public SensorEventDispatcher getDispatcher()
	{
		return ((SensorEventDispatcher) (new zzb(zzaWo)));
	//    0    0:new             #76  <Class zzb>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #42  <Field zzs zzaWo>
	//    4    8:invokespecial   #79  <Method void zzb(zzs)>
	//    5   11:areturn         
	}

	public long getSamplingRate(TimeUnit timeunit)
	{
		if(zzaXi == -1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field long zzaXi>
	//*   2    4:ldc2w           #81  <Long -1L>
	//*   3    7:lcmp            
	//*   4    8:ifne            15
			return -1L;
	//    5   11:ldc2w           #81  <Long -1L>
	//    6   14:lreturn         
		else
			return timeunit.convert(zzaXi, TimeUnit.MICROSECONDS);
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #44  <Field long zzaXi>
	//   10   20:getstatic       #66  <Field TimeUnit TimeUnit.MICROSECONDS>
	//   11   23:invokevirtual   #70  <Method long TimeUnit.convert(long, TimeUnit)>
	//   12   26:lreturn         
	}

	int getVersionCode()
	{
		return zzaiI;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int zzaiI>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			zzaTi, Long.valueOf(zzaXi), Long.valueOf(zzaXj)
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #34  <Field DataSource zzaTi>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #44  <Field long zzaXi>
	//   11   17:invokestatic    #93  <Method Long Long.valueOf(long)>
	//   12   20:aastore         
	//   13   21:dup             
	//   14   22:iconst_2        
	//   15   23:aload_0         
	//   16   24:getfield        #46  <Field long zzaXj>
	//   17   27:invokestatic    #93  <Method Long Long.valueOf(long)>
	//   18   30:aastore         
	//   19   31:invokestatic    #96  <Method int zzaa.hashCode(Object[])>
	//   20   34:ireturn         
	}

	public String toString()
	{
		return String.format("FitnessSensorServiceRequest{%s}", new Object[] {
			zzaTi
		});
	//    0    0:ldc1            #100 <String "FitnessSensorServiceRequest{%s}">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #34  <Field DataSource zzaTi>
	//    7   12:aastore         
	//    8   13:invokestatic    #106 <Method String String.format(String, Object[])>
	//    9   16:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.service.zza.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #111 <Method void com.google.android.gms.fitness.service.zza.zza(FitnessSensorServiceRequest, Parcel, int)>
	//    4    6:return          
	}

	public long zzCz()
	{
		return zzaXi;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field long zzaXi>
	//    2    4:lreturn         
	}

	public long zzDC()
	{
		return zzaXj;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field long zzaXj>
	//    2    4:lreturn         
	}

	IBinder zzDh()
	{
		return zzaWo.asBinder();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field zzs zzaWo>
	//    2    4:invokeinterface #121 <Method IBinder zzs.asBinder()>
	//    3    9:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.fitness.service.zza();
	public static final int UNSPECIFIED = -1;
	private final DataSource zzaTi;
	private final zzs zzaWo;
	private final long zzaXi;
	private final long zzaXj;
	private final int zzaiI;

	static 
	{
	//    0    0:new             #22  <Class com.google.android.gms.fitness.service.zza>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void com.google.android.gms.fitness.service.zza()>
	//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
