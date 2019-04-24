// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;
import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.gms.fitness.data:
//			Goal, zzy

public static class Goal$Recurrence extends zza
{
	public static interface RecurrenceUnit
		extends Annotation
	{
	}


	private boolean zza(Goal$Recurrence goal$recurrence)
	{
		return count == goal$recurrence.count && zzaTX == goal$recurrence.zzaTX;
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

	static int zzb(Goal$Recurrence goal$recurrence)
	{
		return goal$recurrence.zzaTX;
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
	//	               1 31
	//	               2 34
	//	               3 37
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
		return this == obj || (obj instanceof Goal$Recurrence) && zza((Goal$Recurrence)obj);
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

	public static final android.os.or CREATOR = new zzy();
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

	public Goal$Recurrence(int i, int j)
	{
		this(1, i, j);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iload_1         
	//    3    3:iload_2         
	//    4    4:invokespecial   #37  <Method void Goal$Recurrence(int, int, int)>
	//    5    7:return          
	}

	Goal$Recurrence(int i, int j, int k)
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
