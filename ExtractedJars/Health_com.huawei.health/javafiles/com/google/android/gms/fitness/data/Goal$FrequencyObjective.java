// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;

// Referenced classes of package com.google.android.gms.fitness.data:
//			Goal, zzq

public static class Goal$FrequencyObjective extends zza
{

	private boolean zza(Goal$FrequencyObjective goal$frequencyobjective)
	{
		return frequency == goal$frequencyobjective.frequency;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int frequency>
	//    2    4:aload_1         
	//    3    5:getfield        #32  <Field int frequency>
	//    4    8:icmpne          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof Goal$FrequencyObjective) && zza((Goal$FrequencyObjective)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class Goal$FrequencyObjective>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class Goal$FrequencyObjective>
	//    9   17:invokespecial   #38  <Method boolean zza(Goal$FrequencyObjective)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public int getFrequency()
	{
		return frequency;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int frequency>
	//    2    4:ireturn         
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
		return frequency;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int frequency>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("frequency", ((Object) (Integer.valueOf(frequency)))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #50  <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #51  <String "frequency">
	//    3    6:aload_0         
	//    4    7:getfield        #32  <Field int frequency>
	//    5   10:invokestatic    #57  <Method Integer Integer.valueOf(int)>
	//    6   13:invokevirtual   #63  <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    7   16:invokevirtual   #65  <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//    8   19:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.data.zzq.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #70  <Method void com.google.android.gms.fitness.data.zzq.zza(Goal$FrequencyObjective, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzq();
	private final int frequency;
	private final int versionCode;

	static 
	{
	//    0    0:new             #17  <Class zzq>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void zzq()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public Goal$FrequencyObjective(int i)
	{
		this(1, i);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iload_1         
	//    3    3:invokespecial   #27  <Method void Goal$FrequencyObjective(int, int)>
	//    4    6:return          
	}

	Goal$FrequencyObjective(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void zza()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #30  <Field int versionCode>
		frequency = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #32  <Field int frequency>
	//    8   14:return          
	}
}
