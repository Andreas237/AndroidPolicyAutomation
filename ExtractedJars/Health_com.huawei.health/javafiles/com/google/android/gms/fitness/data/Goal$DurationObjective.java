// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//			Goal, zzo

public static class Goal$DurationObjective extends zza
{

	private boolean zza(Goal$DurationObjective goal$durationobjective)
	{
		return zzaTU == goal$durationobjective.zzaTU;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field long zzaTU>
	//    2    4:aload_1         
	//    3    5:getfield        #30  <Field long zzaTU>
	//    4    8:lcmp            
	//    5    9:ifne            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof Goal$DurationObjective) && zza((Goal$DurationObjective)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class Goal$DurationObjective>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class Goal$DurationObjective>
	//    9   17:invokespecial   #45  <Method boolean zza(Goal$DurationObjective)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public long getDuration()
	{
		return zzaTU;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field long zzaTU>
	//    2    4:lreturn         
	}

	public long getDuration(TimeUnit timeunit)
	{
		return timeunit.convert(zzaTU, TimeUnit.NANOSECONDS);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #30  <Field long zzaTU>
	//    3    5:getstatic       #52  <Field TimeUnit TimeUnit.NANOSECONDS>
	//    4    8:invokevirtual   #56  <Method long TimeUnit.convert(long, TimeUnit)>
	//    5   11:lreturn         
	}

	int getVersionCode()
	{
		return versionCode;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int versionCode>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return (int)zzaTU;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field long zzaTU>
	//    2    4:l2i             
	//    3    5:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("duration", ((Object) (Long.valueOf(zzaTU)))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #67  <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #69  <String "duration">
	//    3    6:aload_0         
	//    4    7:getfield        #30  <Field long zzaTU>
	//    5   10:invokestatic    #75  <Method Long Long.valueOf(long)>
	//    6   13:invokevirtual   #81  <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    7   16:invokevirtual   #83  <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//    8   19:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.data.zzo.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #88  <Method void com.google.android.gms.fitness.data.zzo.zza(Goal$DurationObjective, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzo();
	private final int versionCode;
	private final long zzaTU;

	static 
	{
	//    0    0:new             #18  <Class zzo>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void zzo()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	Goal$DurationObjective(int i, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void zza()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #28  <Field int versionCode>
		zzaTU = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #30  <Field long zzaTU>
	//    8   14:return          
	}

	public Goal$DurationObjective(long l, TimeUnit timeunit)
	{
		this(1, timeunit.toNanos(l));
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_3         
	//    3    3:lload_1         
	//    4    4:invokevirtual   #37  <Method long TimeUnit.toNanos(long)>
	//    5    7:invokespecial   #39  <Method void Goal$DurationObjective(int, long)>
	//    6   10:return          
	}
}
