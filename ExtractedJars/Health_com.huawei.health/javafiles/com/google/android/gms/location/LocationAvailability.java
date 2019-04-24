// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;

// Referenced classes of package com.google.android.gms.location:
//			zzl

public final class LocationAvailability extends zza
	implements ReflectedParcelable
{

	LocationAvailability(int i, int j, int k, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void zza()>
		zzbjT = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #29  <Field int zzbjT>
		zzbjQ = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #31  <Field int zzbjQ>
		zzbjR = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #33  <Field int zzbjR>
		zzbjS = l;
	//   11   19:aload_0         
	//   12   20:lload           4
	//   13   22:putfield        #35  <Field long zzbjS>
	//   14   25:return          
	}

	public static LocationAvailability extractLocationAvailability(Intent intent)
	{
		if(!hasLocationAvailability(intent))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #41  <Method boolean hasLocationAvailability(Intent)>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (LocationAvailability)intent.getExtras().getParcelable("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
	//    5    9:aload_0         
	//    6   10:invokevirtual   #47  <Method Bundle Intent.getExtras()>
	//    7   13:ldc1            #49  <String "com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY">
	//    8   15:invokevirtual   #55  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//    9   18:checkcast       #2   <Class LocationAvailability>
	//   10   21:areturn         
	}

	public static boolean hasLocationAvailability(Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
	//    4    6:aload_0         
	//    5    7:ldc1            #49  <String "com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY">
	//    6    9:invokevirtual   #59  <Method boolean Intent.hasExtra(String)>
	//    7   12:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof LocationAvailability))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class LocationAvailability>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		obj = ((Object) ((LocationAvailability)obj));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class LocationAvailability>
	//    7   13:astore_1        
		return zzbjT == ((LocationAvailability) (obj)).zzbjT && zzbjQ == ((LocationAvailability) (obj)).zzbjQ && zzbjR == ((LocationAvailability) (obj)).zzbjR && zzbjS == ((LocationAvailability) (obj)).zzbjS;
	//    8   14:aload_0         
	//    9   15:getfield        #29  <Field int zzbjT>
	//   10   18:aload_1         
	//   11   19:getfield        #29  <Field int zzbjT>
	//   12   22:icmpne          61
	//   13   25:aload_0         
	//   14   26:getfield        #31  <Field int zzbjQ>
	//   15   29:aload_1         
	//   16   30:getfield        #31  <Field int zzbjQ>
	//   17   33:icmpne          61
	//   18   36:aload_0         
	//   19   37:getfield        #33  <Field int zzbjR>
	//   20   40:aload_1         
	//   21   41:getfield        #33  <Field int zzbjR>
	//   22   44:icmpne          61
	//   23   47:aload_0         
	//   24   48:getfield        #35  <Field long zzbjS>
	//   25   51:aload_1         
	//   26   52:getfield        #35  <Field long zzbjS>
	//   27   55:lcmp            
	//   28   56:ifne            61
	//   29   59:iconst_1        
	//   30   60:ireturn         
	//   31   61:iconst_0        
	//   32   62:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			Integer.valueOf(zzbjT), Integer.valueOf(zzbjQ), Integer.valueOf(zzbjR), Long.valueOf(zzbjS)
		});
	//    0    0:iconst_4        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #29  <Field int zzbjT>
	//    6   10:invokestatic    #71  <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #31  <Field int zzbjQ>
	//   12   20:invokestatic    #71  <Method Integer Integer.valueOf(int)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #33  <Field int zzbjR>
	//   18   30:invokestatic    #71  <Method Integer Integer.valueOf(int)>
	//   19   33:aastore         
	//   20   34:dup             
	//   21   35:iconst_3        
	//   22   36:aload_0         
	//   23   37:getfield        #35  <Field long zzbjS>
	//   24   40:invokestatic    #76  <Method Long Long.valueOf(long)>
	//   25   43:aastore         
	//   26   44:invokestatic    #81  <Method int zzaa.hashCode(Object[])>
	//   27   47:ireturn         
	}

	public boolean isLocationAvailable()
	{
		return zzbjT < 1000;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int zzbjT>
	//    2    4:sipush          1000
	//    3    7:icmpge          12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public String toString()
	{
		boolean flag = isLocationAvailable();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #87  <Method boolean isLocationAvailable()>
	//    2    4:istore_1        
		return (new StringBuilder(48)).append("LocationAvailability[isLocationAvailable: ").append(flag).append("]").toString();
	//    3    5:new             #89  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:bipush          48
	//    6   11:invokespecial   #92  <Method void StringBuilder(int)>
	//    7   14:ldc1            #94  <String "LocationAvailability[isLocationAvailable: ">
	//    8   16:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:iload_1         
	//   10   20:invokevirtual   #101 <Method StringBuilder StringBuilder.append(boolean)>
	//   11   23:ldc1            #103 <String "]">
	//   12   25:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   13   28:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   14   31:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.location.zzl.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #111 <Method void com.google.android.gms.location.zzl.zza(LocationAvailability, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzl();
	int zzbjQ;
	int zzbjR;
	long zzbjS;
	int zzbjT;

	static 
	{
	//    0    0:new             #19  <Class zzl>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void zzl()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
