// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;

// Referenced classes of package com.google.android.gms.fitness.data:
//			Goal, zzu

public static class Goal$MetricObjective extends zza
{

	private boolean zza(Goal$MetricObjective goal$metricobjective)
	{
		return zzaa.equal(((Object) (zzaTV)), ((Object) (goal$metricobjective.zzaTV))) && value == goal$metricobjective.value && zzaTW == goal$metricobjective.zzaTW;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String zzaTV>
	//    2    4:aload_1         
	//    3    5:getfield        #33  <Field String zzaTV>
	//    4    8:invokestatic    #48  <Method boolean zzaa.equal(Object, Object)>
	//    5   11:ifeq            40
	//    6   14:aload_0         
	//    7   15:getfield        #35  <Field double value>
	//    8   18:aload_1         
	//    9   19:getfield        #35  <Field double value>
	//   10   22:dcmpl           
	//   11   23:ifne            40
	//   12   26:aload_0         
	//   13   27:getfield        #37  <Field double zzaTW>
	//   14   30:aload_1         
	//   15   31:getfield        #37  <Field double zzaTW>
	//   16   34:dcmpl           
	//   17   35:ifne            40
	//   18   38:iconst_1        
	//   19   39:ireturn         
	//   20   40:iconst_0        
	//   21   41:ireturn         
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof Goal$MetricObjective) && zza((Goal$MetricObjective)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class Goal$MetricObjective>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class Goal$MetricObjective>
	//    9   17:invokespecial   #52  <Method boolean zza(Goal$MetricObjective)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public String getDataTypeName()
	{
		return zzaTV;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String zzaTV>
	//    2    4:areturn         
	}

	public double getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field double value>
	//    2    4:dreturn         
	}

	int getVersionCode()
	{
		return versionCode;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int versionCode>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzaTV.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String zzaTV>
	//    2    4:invokevirtual   #63  <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("dataTypeName", ((Object) (zzaTV))).zzg("value", ((Object) (Double.valueOf(value)))).zzg("initialValue", ((Object) (Double.valueOf(zzaTW)))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #68  <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #70  <String "dataTypeName">
	//    3    6:aload_0         
	//    4    7:getfield        #33  <Field String zzaTV>
	//    5   10:invokevirtual   #76  <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    6   13:ldc1            #77  <String "value">
	//    7   15:aload_0         
	//    8   16:getfield        #35  <Field double value>
	//    9   19:invokestatic    #83  <Method Double Double.valueOf(double)>
	//   10   22:invokevirtual   #76  <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   11   25:ldc1            #85  <String "initialValue">
	//   12   27:aload_0         
	//   13   28:getfield        #37  <Field double zzaTW>
	//   14   31:invokestatic    #83  <Method Double Double.valueOf(double)>
	//   15   34:invokevirtual   #76  <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   16   37:invokevirtual   #87  <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   17   40:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.data.zzu.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #92  <Method void com.google.android.gms.fitness.data.zzu.zza(Goal$MetricObjective, Parcel, int)>
	//    4    6:return          
	}

	public double zzCw()
	{
		return zzaTW;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field double zzaTW>
	//    2    4:dreturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzu();
	private final double value;
	private final int versionCode;
	private final String zzaTV;
	private final double zzaTW;

	static 
	{
	//    0    0:new             #21  <Class zzu>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void zzu()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	Goal$MetricObjective(int i, String s, double d, double d1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void zza()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #31  <Field int versionCode>
		zzaTV = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #33  <Field String zzaTV>
		value = d;
	//    8   14:aload_0         
	//    9   15:dload_3         
	//   10   16:putfield        #35  <Field double value>
		zzaTW = d1;
	//   11   19:aload_0         
	//   12   20:dload           5
	//   13   22:putfield        #37  <Field double zzaTW>
	//   14   25:return          
	}

	public Goal$MetricObjective(String s, double d)
	{
		this(1, s, d, 0.0D);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:dload_2         
	//    4    4:dconst_0        
	//    5    5:invokespecial   #40  <Method void Goal$MetricObjective(int, String, double, double)>
	//    6    8:return          
	}
}
