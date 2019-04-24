// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;
import java.lang.annotation.Annotation;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//			zzr, zzo, zzq, zzu, 
//			zzy

public class Goal extends zza
{
	public static class DurationObjective extends zza
	{

		private boolean zza(DurationObjective durationobjective)
		{
			return zzaTU == durationobjective.zzaTU;
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
			return this == obj || (obj instanceof DurationObjective) && zza((DurationObjective)obj);
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

		DurationObjective(int i, long l)
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

		public DurationObjective(long l, TimeUnit timeunit)
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

	public static class FrequencyObjective extends zza
	{

		private boolean zza(FrequencyObjective frequencyobjective)
		{
			return frequency == frequencyobjective.frequency;
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
			return this == obj || (obj instanceof FrequencyObjective) && zza((FrequencyObjective)obj);
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

		public FrequencyObjective(int i)
		{
			this(1, i);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iload_1         
		//    3    3:invokespecial   #27  <Method void Goal$FrequencyObjective(int, int)>
		//    4    6:return          
		}

		FrequencyObjective(int i, int j)
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

	public static class MetricObjective extends zza
	{

		private boolean zza(MetricObjective metricobjective)
		{
			return zzaa.equal(((Object) (zzaTV)), ((Object) (metricobjective.zzaTV))) && value == metricobjective.value && zzaTW == metricobjective.zzaTW;
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
			return this == obj || (obj instanceof MetricObjective) && zza((MetricObjective)obj);
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

		MetricObjective(int i, String s, double d, double d1)
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

		public MetricObjective(String s, double d)
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

	public static class MismatchedGoalException extends IllegalStateException
	{

		public MismatchedGoalException(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void IllegalStateException(String)>
		//    3    5:return          
		}
	}

	public static interface ObjectiveType
		extends Annotation
	{
	}

	public static class Recurrence extends zza
	{

		private boolean zza(Recurrence recurrence)
		{
			return count == recurrence.count && zzaTX == recurrence.zzaTX;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field int count>
		//    2    4:aload_1         
		//    3    5:getfield        #42  <Field int count>
		//    4    8:icmpne          24
		//    5   11:aload_0         
		//    6   12:getfield        #50  <Field int zzaTX>
		//    7   15:aload_1         
		//    8   16:getfield        #50  <Field int zzaTX>
		//    9   19:icmpne          24
		//   10   22:iconst_1        
		//   11   23:ireturn         
		//   12   24:iconst_0        
		//   13   25:ireturn         
		}

		static int zzb(Recurrence recurrence)
		{
			return recurrence.zzaTX;
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field int zzaTX>
		//    2    4:ireturn         
		}

		private static String zzgN(int i)
		{
			switch(i)
		//*   0    0:iload_0         
			{
		//*   1    1:tableswitch     1 3: default 28
		//		               1 31
		//		               2 34
		//		               3 37
		//*   2   28:goto            40
			case 1: // '\001'
				return "day";
		//    3   31:ldc1            #58  <String "day">
		//    4   33:areturn         

			case 2: // '\002'
				return "week";
		//    5   34:ldc1            #60  <String "week">
		//    6   36:areturn         

			case 3: // '\003'
				return "month";
		//    7   37:ldc1            #62  <String "month">
		//    8   39:areturn         
			}
			throw new IllegalArgumentException("invalid unit value");
		//    9   40:new             #64  <Class IllegalArgumentException>
		//   10   43:dup             
		//   11   44:ldc1            #66  <String "invalid unit value">
		//   12   46:invokespecial   #69  <Method void IllegalArgumentException(String)>
		//   13   49:athrow          
		}

		public boolean equals(Object obj)
		{
			return this == obj || (obj instanceof Recurrence) && zza((Recurrence)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:if_acmpeq       23
		//    3    5:aload_1         
		//    4    6:instanceof      #2   <Class Goal$Recurrence>
		//    5    9:ifeq            25
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:checkcast       #2   <Class Goal$Recurrence>
		//    9   17:invokespecial   #73  <Method boolean zza(Goal$Recurrence)>
		//   10   20:ifeq            25
		//   11   23:iconst_1        
		//   12   24:ireturn         
		//   13   25:iconst_0        
		//   14   26:ireturn         
		}

		public int getCount()
		{
			return count;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field int count>
		//    2    4:ireturn         
		}

		public int getUnit()
		{
			return zzaTX;
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field int zzaTX>
		//    2    4:ireturn         
		}

		int getVersionCode()
		{
			return versionCode;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field int versionCode>
		//    2    4:ireturn         
		}

		public int hashCode()
		{
			return zzaTX;
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field int zzaTX>
		//    2    4:ireturn         
		}

		public String toString()
		{
			return zzaa.zzv(((Object) (this))).zzg("count", ((Object) (Integer.valueOf(count)))).zzg("unit", ((Object) (zzgN(zzaTX)))).toString();
		//    0    0:aload_0         
		//    1    1:invokestatic    #86  <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
		//    2    4:ldc1            #87  <String "count">
		//    3    6:aload_0         
		//    4    7:getfield        #42  <Field int count>
		//    5   10:invokestatic    #93  <Method Integer Integer.valueOf(int)>
		//    6   13:invokevirtual   #99  <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
		//    7   16:ldc1            #101 <String "unit">
		//    8   18:aload_0         
		//    9   19:getfield        #50  <Field int zzaTX>
		//   10   22:invokestatic    #103 <Method String zzgN(int)>
		//   11   25:invokevirtual   #99  <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
		//   12   28:invokevirtual   #105 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
		//   13   31:areturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			com.google.android.gms.fitness.data.zzy.zza(this, parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokestatic    #110 <Method void com.google.android.gms.fitness.data.zzy.zza(Goal$Recurrence, Parcel, int)>
		//    4    6:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new zzy();
		public static final int UNIT_DAY = 1;
		public static final int UNIT_MONTH = 3;
		public static final int UNIT_WEEK = 2;
		private final int count;
		private final int versionCode;
		private final int zzaTX;

		static 
		{
		//    0    0:new             #27  <Class zzy>
		//    1    3:dup             
		//    2    4:invokespecial   #30  <Method void zzy()>
		//    3    7:putstatic       #32  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public Recurrence(int i, int j)
		{
			this(1, i, j);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iload_1         
		//    3    3:iload_2         
		//    4    4:invokespecial   #37  <Method void Goal$Recurrence(int, int, int)>
		//    5    7:return          
		}

		Recurrence(int i, int j, int k)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #38  <Method void zza()>
			versionCode = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #40  <Field int versionCode>
			count = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #42  <Field int count>
			boolean flag;
			if(k > 0 && k <= 3)
		//*   8   14:iload_3         
		//*   9   15:ifle            29
		//*  10   18:iload_3         
		//*  11   19:iconst_3        
		//*  12   20:icmpgt          29
				flag = true;
		//   13   23:iconst_1        
		//   14   24:istore          4
			else
		//*  15   26:goto            32
				flag = false;
		//   16   29:iconst_0        
		//   17   30:istore          4
			zzac.zzaw(flag);
		//   18   32:iload           4
		//   19   34:invokestatic    #48  <Method void zzac.zzaw(boolean)>
			zzaTX = k;
		//   20   37:aload_0         
		//   21   38:iload_3         
		//   22   39:putfield        #50  <Field int zzaTX>
		//   23   42:return          
		}
	}

	public static interface Recurrence.RecurrenceUnit
		extends Annotation
	{
	}


	Goal(int i, long l, long l1, List list, Recurrence recurrence, 
			int j, MetricObjective metricobjective, DurationObjective durationobjective, FrequencyObjective frequencyobjective)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void zza()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #65  <Field int versionCode>
		zzaTM = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #67  <Field long zzaTM>
		zzaTN = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #69  <Field long zzaTN>
		if(list == null)
	//*  11   20:aload           6
	//*  12   22:ifnonnull       33
			list = Collections.emptyList();
	//   13   25:invokestatic    #75  <Method List Collections.emptyList()>
	//   14   28:astore          6
	//*  15   30:goto            33
		zzaTO = list;
	//   16   33:aload_0         
	//   17   34:aload           6
	//   18   36:putfield        #77  <Field List zzaTO>
		zzaTP = recurrence;
	//   19   39:aload_0         
	//   20   40:aload           7
	//   21   42:putfield        #79  <Field Goal$Recurrence zzaTP>
		zzaTQ = j;
	//   22   45:aload_0         
	//   23   46:iload           8
	//   24   48:putfield        #81  <Field int zzaTQ>
		zzaTR = metricobjective;
	//   25   51:aload_0         
	//   26   52:aload           9
	//   27   54:putfield        #83  <Field Goal$MetricObjective zzaTR>
		zzaTS = durationobjective;
	//   28   57:aload_0         
	//   29   58:aload           10
	//   30   60:putfield        #85  <Field Goal$DurationObjective zzaTS>
		zzaTT = frequencyobjective;
	//   31   63:aload_0         
	//   32   64:aload           11
	//   33   66:putfield        #87  <Field Goal$FrequencyObjective zzaTT>
	//   34   69:return          
	}

	private boolean zza(Goal goal)
	{
		return zzaTM == goal.zzaTM && zzaTN == goal.zzaTN && zzaa.equal(((Object) (zzaTO)), ((Object) (goal.zzaTO))) && zzaa.equal(((Object) (zzaTP)), ((Object) (goal.zzaTP))) && zzaTQ == goal.zzaTQ && zzaa.equal(((Object) (zzaTR)), ((Object) (goal.zzaTR))) && zzaa.equal(((Object) (zzaTS)), ((Object) (goal.zzaTS))) && zzaa.equal(((Object) (zzaTT)), ((Object) (goal.zzaTT)));
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field long zzaTM>
	//    2    4:aload_1         
	//    3    5:getfield        #67  <Field long zzaTM>
	//    4    8:lcmp            
	//    5    9:ifne            107
	//    6   12:aload_0         
	//    7   13:getfield        #69  <Field long zzaTN>
	//    8   16:aload_1         
	//    9   17:getfield        #69  <Field long zzaTN>
	//   10   20:lcmp            
	//   11   21:ifne            107
	//   12   24:aload_0         
	//   13   25:getfield        #77  <Field List zzaTO>
	//   14   28:aload_1         
	//   15   29:getfield        #77  <Field List zzaTO>
	//   16   32:invokestatic    #97  <Method boolean zzaa.equal(Object, Object)>
	//   17   35:ifeq            107
	//   18   38:aload_0         
	//   19   39:getfield        #79  <Field Goal$Recurrence zzaTP>
	//   20   42:aload_1         
	//   21   43:getfield        #79  <Field Goal$Recurrence zzaTP>
	//   22   46:invokestatic    #97  <Method boolean zzaa.equal(Object, Object)>
	//   23   49:ifeq            107
	//   24   52:aload_0         
	//   25   53:getfield        #81  <Field int zzaTQ>
	//   26   56:aload_1         
	//   27   57:getfield        #81  <Field int zzaTQ>
	//   28   60:icmpne          107
	//   29   63:aload_0         
	//   30   64:getfield        #83  <Field Goal$MetricObjective zzaTR>
	//   31   67:aload_1         
	//   32   68:getfield        #83  <Field Goal$MetricObjective zzaTR>
	//   33   71:invokestatic    #97  <Method boolean zzaa.equal(Object, Object)>
	//   34   74:ifeq            107
	//   35   77:aload_0         
	//   36   78:getfield        #85  <Field Goal$DurationObjective zzaTS>
	//   37   81:aload_1         
	//   38   82:getfield        #85  <Field Goal$DurationObjective zzaTS>
	//   39   85:invokestatic    #97  <Method boolean zzaa.equal(Object, Object)>
	//   40   88:ifeq            107
	//   41   91:aload_0         
	//   42   92:getfield        #87  <Field Goal$FrequencyObjective zzaTT>
	//   43   95:aload_1         
	//   44   96:getfield        #87  <Field Goal$FrequencyObjective zzaTT>
	//   45   99:invokestatic    #97  <Method boolean zzaa.equal(Object, Object)>
	//   46  102:ifeq            107
	//   47  105:iconst_1        
	//   48  106:ireturn         
	//   49  107:iconst_0        
	//   50  108:ireturn         
	}

	private static String zzgL(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 3: default 32
	//	               0 44
	//	               1 35
	//	               2 38
	//	               3 41
	//*   2   32:goto            47
		case 1: // '\001'
			return "metric";
	//    3   35:ldc1            #101 <String "metric">
	//    4   37:areturn         

		case 2: // '\002'
			return "duration";
	//    5   38:ldc1            #103 <String "duration">
	//    6   40:areturn         

		case 3: // '\003'
			return "frequency";
	//    7   41:ldc1            #105 <String "frequency">
	//    8   43:areturn         

		case 0: // '\0'
			return "unknown";
	//    9   44:ldc1            #107 <String "unknown">
	//   10   46:areturn         
		}
		throw new IllegalArgumentException("invalid objective type value");
	//   11   47:new             #109 <Class IllegalArgumentException>
	//   12   50:dup             
	//   13   51:ldc1            #111 <String "invalid objective type value">
	//   14   53:invokespecial   #114 <Method void IllegalArgumentException(String)>
	//   15   56:athrow          
	}

	private void zzgM(int i)
		throws MismatchedGoalException
	{
		if(i != zzaTQ)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #81  <Field int zzaTQ>
	//*   3    5:icmpeq          42
			throw new MismatchedGoalException(String.format("%s goal does not have %s objective", new Object[] {
				zzgL(zzaTQ), zzgL(i)
			}));
	//    4    8:new             #15  <Class Goal$MismatchedGoalException>
	//    5   11:dup             
	//    6   12:ldc1            #118 <String "%s goal does not have %s objective">
	//    7   14:iconst_2        
	//    8   15:anewarray       Object[]
	//    9   18:dup             
	//   10   19:iconst_0        
	//   11   20:aload_0         
	//   12   21:getfield        #81  <Field int zzaTQ>
	//   13   24:invokestatic    #122 <Method String zzgL(int)>
	//   14   27:aastore         
	//   15   28:dup             
	//   16   29:iconst_1        
	//   17   30:iload_1         
	//   18   31:invokestatic    #122 <Method String zzgL(int)>
	//   19   34:aastore         
	//   20   35:invokestatic    #128 <Method String String.format(String, Object[])>
	//   21   38:invokespecial   #129 <Method void Goal$MismatchedGoalException(String)>
	//   22   41:athrow          
		else
			return;
	//   23   42:return          
	}

	public boolean equals(Object obj)
	{
		return this == obj || (obj instanceof Goal) && zza((Goal)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       23
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class Goal>
	//    5    9:ifeq            25
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class Goal>
	//    9   17:invokespecial   #134 <Method boolean zza(Goal)>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public String getActivityName()
	{
		if(zzaTO.isEmpty() || zzaTO.size() > 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field List zzaTO>
	//*   2    4:invokeinterface #143 <Method boolean List.isEmpty()>
	//*   3    9:ifne            25
	//*   4   12:aload_0         
	//*   5   13:getfield        #77  <Field List zzaTO>
	//*   6   16:invokeinterface #147 <Method int List.size()>
	//*   7   21:iconst_1        
	//*   8   22:icmple          27
			return null;
	//    9   25:aconst_null     
	//   10   26:areturn         
		else
			return com.google.android.gms.fitness.zza.getName(((Integer)zzaTO.get(0)).intValue());
	//   11   27:aload_0         
	//   12   28:getfield        #77  <Field List zzaTO>
	//   13   31:iconst_0        
	//   14   32:invokeinterface #151 <Method Object List.get(int)>
	//   15   37:checkcast       #153 <Class Integer>
	//   16   40:invokevirtual   #156 <Method int Integer.intValue()>
	//   17   43:invokestatic    #161 <Method String com.google.android.gms.fitness.zza.getName(int)>
	//   18   46:areturn         
	}

	public long getCreateTime(TimeUnit timeunit)
	{
		return timeunit.convert(zzaTM, TimeUnit.NANOSECONDS);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #67  <Field long zzaTM>
	//    3    5:getstatic       #170 <Field TimeUnit TimeUnit.NANOSECONDS>
	//    4    8:invokevirtual   #174 <Method long TimeUnit.convert(long, TimeUnit)>
	//    5   11:lreturn         
	}

	public DurationObjective getDurationObjective()
	{
		zzgM(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokespecial   #178 <Method void zzgM(int)>
		return zzaTS;
	//    3    5:aload_0         
	//    4    6:getfield        #85  <Field Goal$DurationObjective zzaTS>
	//    5    9:areturn         
	}

	public long getEndTime(Calendar calendar, TimeUnit timeunit)
	{
		if(zzaTP != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field Goal$Recurrence zzaTP>
	//*   2    4:ifnull          195
		{
			Calendar calendar1 = Calendar.getInstance();
	//    3    7:invokestatic    #186 <Method Calendar Calendar.getInstance()>
	//    4   10:astore          4
			calendar1.setTime(calendar.getTime());
	//    5   12:aload           4
	//    6   14:aload_1         
	//    7   15:invokevirtual   #190 <Method java.util.Date Calendar.getTime()>
	//    8   18:invokevirtual   #194 <Method void Calendar.setTime(java.util.Date)>
			switch(Recurrence.zzb(zzaTP))
	//*   9   21:aload_0         
	//*  10   22:getfield        #79  <Field Goal$Recurrence zzaTP>
	//*  11   25:invokestatic    #198 <Method int Goal$Recurrence.zzb(Goal$Recurrence)>
			{
	//*  12   28:tableswitch     1 3: default 56
	//	               1 59
	//	               2 87
	//	               3 123
	//*  13   56:goto            158
			case 1: // '\001'
				calendar1.add(5, 1);
	//   14   59:aload           4
	//   15   61:iconst_5        
	//   16   62:iconst_1        
	//   17   63:invokevirtual   #202 <Method void Calendar.add(int, int)>
				calendar1.set(11, 0);
	//   18   66:aload           4
	//   19   68:bipush          11
	//   20   70:iconst_0        
	//   21   71:invokevirtual   #205 <Method void Calendar.set(int, int)>
				return timeunit.convert(calendar1.getTimeInMillis(), TimeUnit.MILLISECONDS);
	//   22   74:aload_2         
	//   23   75:aload           4
	//   24   77:invokevirtual   #209 <Method long Calendar.getTimeInMillis()>
	//   25   80:getstatic       #212 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   26   83:invokevirtual   #174 <Method long TimeUnit.convert(long, TimeUnit)>
	//   27   86:lreturn         

			case 2: // '\002'
				calendar1.add(4, 1);
	//   28   87:aload           4
	//   29   89:iconst_4        
	//   30   90:iconst_1        
	//   31   91:invokevirtual   #202 <Method void Calendar.add(int, int)>
				calendar1.set(7, 2);
	//   32   94:aload           4
	//   33   96:bipush          7
	//   34   98:iconst_2        
	//   35   99:invokevirtual   #205 <Method void Calendar.set(int, int)>
				calendar1.set(11, 0);
	//   36  102:aload           4
	//   37  104:bipush          11
	//   38  106:iconst_0        
	//   39  107:invokevirtual   #205 <Method void Calendar.set(int, int)>
				return timeunit.convert(calendar1.getTimeInMillis(), TimeUnit.MILLISECONDS);
	//   40  110:aload_2         
	//   41  111:aload           4
	//   42  113:invokevirtual   #209 <Method long Calendar.getTimeInMillis()>
	//   43  116:getstatic       #212 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   44  119:invokevirtual   #174 <Method long TimeUnit.convert(long, TimeUnit)>
	//   45  122:lreturn         

			case 3: // '\003'
				calendar1.add(2, 1);
	//   46  123:aload           4
	//   47  125:iconst_2        
	//   48  126:iconst_1        
	//   49  127:invokevirtual   #202 <Method void Calendar.add(int, int)>
				calendar1.set(5, 1);
	//   50  130:aload           4
	//   51  132:iconst_5        
	//   52  133:iconst_1        
	//   53  134:invokevirtual   #205 <Method void Calendar.set(int, int)>
				calendar1.set(11, 0);
	//   54  137:aload           4
	//   55  139:bipush          11
	//   56  141:iconst_0        
	//   57  142:invokevirtual   #205 <Method void Calendar.set(int, int)>
				return timeunit.convert(calendar1.getTimeInMillis(), TimeUnit.MILLISECONDS);
	//   58  145:aload_2         
	//   59  146:aload           4
	//   60  148:invokevirtual   #209 <Method long Calendar.getTimeInMillis()>
	//   61  151:getstatic       #212 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   62  154:invokevirtual   #174 <Method long TimeUnit.convert(long, TimeUnit)>
	//   63  157:lreturn         
			}
			int i = Recurrence.zzb(zzaTP);
	//   64  158:aload_0         
	//   65  159:getfield        #79  <Field Goal$Recurrence zzaTP>
	//   66  162:invokestatic    #198 <Method int Goal$Recurrence.zzb(Goal$Recurrence)>
	//   67  165:istore_3        
			throw new IllegalArgumentException((new StringBuilder(24)).append("Invalid unit ").append(i).toString());
	//   68  166:new             #109 <Class IllegalArgumentException>
	//   69  169:dup             
	//   70  170:new             #214 <Class StringBuilder>
	//   71  173:dup             
	//   72  174:bipush          24
	//   73  176:invokespecial   #216 <Method void StringBuilder(int)>
	//   74  179:ldc1            #218 <String "Invalid unit ">
	//   75  181:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   76  184:iload_3         
	//   77  185:invokevirtual   #225 <Method StringBuilder StringBuilder.append(int)>
	//   78  188:invokevirtual   #228 <Method String StringBuilder.toString()>
	//   79  191:invokespecial   #114 <Method void IllegalArgumentException(String)>
	//   80  194:athrow          
		} else
		{
			return timeunit.convert(zzaTN, TimeUnit.NANOSECONDS);
	//   81  195:aload_2         
	//   82  196:aload_0         
	//   83  197:getfield        #69  <Field long zzaTN>
	//   84  200:getstatic       #170 <Field TimeUnit TimeUnit.NANOSECONDS>
	//   85  203:invokevirtual   #174 <Method long TimeUnit.convert(long, TimeUnit)>
	//   86  206:lreturn         
		}
	}

	public FrequencyObjective getFrequencyObjective()
	{
		zzgM(3);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokespecial   #178 <Method void zzgM(int)>
		return zzaTT;
	//    3    5:aload_0         
	//    4    6:getfield        #87  <Field Goal$FrequencyObjective zzaTT>
	//    5    9:areturn         
	}

	public MetricObjective getMetricObjective()
	{
		zzgM(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #178 <Method void zzgM(int)>
		return zzaTR;
	//    3    5:aload_0         
	//    4    6:getfield        #83  <Field Goal$MetricObjective zzaTR>
	//    5    9:areturn         
	}

	public int getObjectiveType()
	{
		return zzaTQ;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field int zzaTQ>
	//    2    4:ireturn         
	}

	public Recurrence getRecurrence()
	{
		return zzaTP;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Goal$Recurrence zzaTP>
	//    2    4:areturn         
	}

	public long getStartTime(Calendar calendar, TimeUnit timeunit)
	{
		if(zzaTP != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field Goal$Recurrence zzaTP>
	//*   2    4:ifnull          174
		{
			Calendar calendar1 = Calendar.getInstance();
	//    3    7:invokestatic    #186 <Method Calendar Calendar.getInstance()>
	//    4   10:astore          4
			calendar1.setTime(calendar.getTime());
	//    5   12:aload           4
	//    6   14:aload_1         
	//    7   15:invokevirtual   #190 <Method java.util.Date Calendar.getTime()>
	//    8   18:invokevirtual   #194 <Method void Calendar.setTime(java.util.Date)>
			switch(Recurrence.zzb(zzaTP))
	//*   9   21:aload_0         
	//*  10   22:getfield        #79  <Field Goal$Recurrence zzaTP>
	//*  11   25:invokestatic    #198 <Method int Goal$Recurrence.zzb(Goal$Recurrence)>
			{
	//*  12   28:tableswitch     1 3: default 56
	//	               1 59
	//	               2 80
	//	               3 109
	//*  13   56:goto            137
			case 1: // '\001'
				calendar1.set(11, 0);
	//   14   59:aload           4
	//   15   61:bipush          11
	//   16   63:iconst_0        
	//   17   64:invokevirtual   #205 <Method void Calendar.set(int, int)>
				return timeunit.convert(calendar1.getTimeInMillis(), TimeUnit.MILLISECONDS);
	//   18   67:aload_2         
	//   19   68:aload           4
	//   20   70:invokevirtual   #209 <Method long Calendar.getTimeInMillis()>
	//   21   73:getstatic       #212 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   22   76:invokevirtual   #174 <Method long TimeUnit.convert(long, TimeUnit)>
	//   23   79:lreturn         

			case 2: // '\002'
				calendar1.set(7, 2);
	//   24   80:aload           4
	//   25   82:bipush          7
	//   26   84:iconst_2        
	//   27   85:invokevirtual   #205 <Method void Calendar.set(int, int)>
				calendar1.set(11, 0);
	//   28   88:aload           4
	//   29   90:bipush          11
	//   30   92:iconst_0        
	//   31   93:invokevirtual   #205 <Method void Calendar.set(int, int)>
				return timeunit.convert(calendar1.getTimeInMillis(), TimeUnit.MILLISECONDS);
	//   32   96:aload_2         
	//   33   97:aload           4
	//   34   99:invokevirtual   #209 <Method long Calendar.getTimeInMillis()>
	//   35  102:getstatic       #212 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   36  105:invokevirtual   #174 <Method long TimeUnit.convert(long, TimeUnit)>
	//   37  108:lreturn         

			case 3: // '\003'
				calendar1.set(5, 1);
	//   38  109:aload           4
	//   39  111:iconst_5        
	//   40  112:iconst_1        
	//   41  113:invokevirtual   #205 <Method void Calendar.set(int, int)>
				calendar1.set(11, 0);
	//   42  116:aload           4
	//   43  118:bipush          11
	//   44  120:iconst_0        
	//   45  121:invokevirtual   #205 <Method void Calendar.set(int, int)>
				return timeunit.convert(calendar1.getTimeInMillis(), TimeUnit.MILLISECONDS);
	//   46  124:aload_2         
	//   47  125:aload           4
	//   48  127:invokevirtual   #209 <Method long Calendar.getTimeInMillis()>
	//   49  130:getstatic       #212 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   50  133:invokevirtual   #174 <Method long TimeUnit.convert(long, TimeUnit)>
	//   51  136:lreturn         
			}
			int i = Recurrence.zzb(zzaTP);
	//   52  137:aload_0         
	//   53  138:getfield        #79  <Field Goal$Recurrence zzaTP>
	//   54  141:invokestatic    #198 <Method int Goal$Recurrence.zzb(Goal$Recurrence)>
	//   55  144:istore_3        
			throw new IllegalArgumentException((new StringBuilder(24)).append("Invalid unit ").append(i).toString());
	//   56  145:new             #109 <Class IllegalArgumentException>
	//   57  148:dup             
	//   58  149:new             #214 <Class StringBuilder>
	//   59  152:dup             
	//   60  153:bipush          24
	//   61  155:invokespecial   #216 <Method void StringBuilder(int)>
	//   62  158:ldc1            #218 <String "Invalid unit ">
	//   63  160:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   64  163:iload_3         
	//   65  164:invokevirtual   #225 <Method StringBuilder StringBuilder.append(int)>
	//   66  167:invokevirtual   #228 <Method String StringBuilder.toString()>
	//   67  170:invokespecial   #114 <Method void IllegalArgumentException(String)>
	//   68  173:athrow          
		} else
		{
			return timeunit.convert(zzaTM, TimeUnit.NANOSECONDS);
	//   69  174:aload_2         
	//   70  175:aload_0         
	//   71  176:getfield        #67  <Field long zzaTM>
	//   72  179:getstatic       #170 <Field TimeUnit TimeUnit.NANOSECONDS>
	//   73  182:invokevirtual   #174 <Method long TimeUnit.convert(long, TimeUnit)>
	//   74  185:lreturn         
		}
	}

	int getVersionCode()
	{
		return versionCode;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field int versionCode>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzaTQ;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field int zzaTQ>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("activity", ((Object) (getActivityName()))).zzg("recurrence", ((Object) (zzaTP))).zzg("metricObjective", ((Object) (zzaTR))).zzg("durationObjective", ((Object) (zzaTS))).zzg("frequencyObjective", ((Object) (zzaTT))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #242 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #244 <String "activity">
	//    3    6:aload_0         
	//    4    7:invokevirtual   #246 <Method String getActivityName()>
	//    5   10:invokevirtual   #252 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    6   13:ldc1            #254 <String "recurrence">
	//    7   15:aload_0         
	//    8   16:getfield        #79  <Field Goal$Recurrence zzaTP>
	//    9   19:invokevirtual   #252 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   10   22:ldc2            #256 <String "metricObjective">
	//   11   25:aload_0         
	//   12   26:getfield        #83  <Field Goal$MetricObjective zzaTR>
	//   13   29:invokevirtual   #252 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   14   32:ldc2            #258 <String "durationObjective">
	//   15   35:aload_0         
	//   16   36:getfield        #85  <Field Goal$DurationObjective zzaTS>
	//   17   39:invokevirtual   #252 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   18   42:ldc2            #260 <String "frequencyObjective">
	//   19   45:aload_0         
	//   20   46:getfield        #87  <Field Goal$FrequencyObjective zzaTT>
	//   21   49:invokevirtual   #252 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   22   52:invokevirtual   #261 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   23   55:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.fitness.data.zzr.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #266 <Method void com.google.android.gms.fitness.data.zzr.zza(Goal, Parcel, int)>
	//    4    6:return          
	}

	public long zzCq()
	{
		return zzaTM;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field long zzaTM>
	//    2    4:lreturn         
	}

	public long zzCr()
	{
		return zzaTN;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field long zzaTN>
	//    2    4:lreturn         
	}

	public List zzCs()
	{
		return zzaTO;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field List zzaTO>
	//    2    4:areturn         
	}

	public MetricObjective zzCt()
	{
		return zzaTR;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Goal$MetricObjective zzaTR>
	//    2    4:areturn         
	}

	public DurationObjective zzCu()
	{
		return zzaTS;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field Goal$DurationObjective zzaTS>
	//    2    4:areturn         
	}

	public FrequencyObjective zzCv()
	{
		return zzaTT;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field Goal$FrequencyObjective zzaTT>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzr();
	public static final int OBJECTIVE_TYPE_DURATION = 2;
	public static final int OBJECTIVE_TYPE_FREQUENCY = 3;
	public static final int OBJECTIVE_TYPE_METRIC = 1;
	private final int versionCode;
	private final long zzaTM;
	private final long zzaTN;
	private final List zzaTO;
	private final Recurrence zzaTP;
	private final int zzaTQ;
	private final MetricObjective zzaTR;
	private final DurationObjective zzaTS;
	private final FrequencyObjective zzaTT;

	static 
	{
	//    0    0:new             #55  <Class zzr>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void zzr()>
	//    3    7:putstatic       #60  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
