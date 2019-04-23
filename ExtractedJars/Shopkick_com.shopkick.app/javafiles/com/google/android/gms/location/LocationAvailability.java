// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location:
//			zzaa, zzaj

public final class LocationAvailability extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	LocationAvailability(int i, int j, int k, long l, zzaj azzaj[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void AbstractSafeParcelable()>
		zzau = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #51  <Field int zzau>
		zzar = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #53  <Field int zzar>
		zzas = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #55  <Field int zzas>
		zzat = l;
	//   11   19:aload_0         
	//   12   20:lload           4
	//   13   22:putfield        #57  <Field long zzat>
		zzav = azzaj;
	//   14   25:aload_0         
	//   15   26:aload           6
	//   16   28:putfield        #59  <Field zzaj[] zzav>
	//   17   31:return          
	}

	public static LocationAvailability extractLocationAvailability(Intent intent)
	{
		if(!hasLocationAvailability(intent))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #67  <Method boolean hasLocationAvailability(Intent)>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (LocationAvailability)intent.getExtras().getParcelable("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
	//    5    9:aload_0         
	//    6   10:invokevirtual   #73  <Method Bundle Intent.getExtras()>
	//    7   13:ldc1            #75  <String "com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY">
	//    8   15:invokevirtual   #81  <Method android.os.Parcelable Bundle.getParcelable(String)>
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
	//    5    7:ldc1            #75  <String "com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY">
	//    6    9:invokevirtual   #85  <Method boolean Intent.hasExtra(String)>
	//    7   12:ireturn         
	}

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          90
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #93  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #93  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((LocationAvailability)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class LocationAvailability>
	//   16   28:astore_1        
			if(zzar == ((LocationAvailability) (obj)).zzar && zzas == ((LocationAvailability) (obj)).zzas && zzat == ((LocationAvailability) (obj)).zzat && zzau == ((LocationAvailability) (obj)).zzau && Arrays.equals(((Object []) (zzav)), ((Object []) (((LocationAvailability) (obj)).zzav))))
	//*  17   29:aload_0         
	//*  18   30:getfield        #53  <Field int zzar>
	//*  19   33:aload_1         
	//*  20   34:getfield        #53  <Field int zzar>
	//*  21   37:icmpne          90
	//*  22   40:aload_0         
	//*  23   41:getfield        #55  <Field int zzas>
	//*  24   44:aload_1         
	//*  25   45:getfield        #55  <Field int zzas>
	//*  26   48:icmpne          90
	//*  27   51:aload_0         
	//*  28   52:getfield        #57  <Field long zzat>
	//*  29   55:aload_1         
	//*  30   56:getfield        #57  <Field long zzat>
	//*  31   59:lcmp            
	//*  32   60:ifne            90
	//*  33   63:aload_0         
	//*  34   64:getfield        #51  <Field int zzau>
	//*  35   67:aload_1         
	//*  36   68:getfield        #51  <Field int zzau>
	//*  37   71:icmpne          90
	//*  38   74:aload_0         
	//*  39   75:getfield        #59  <Field zzaj[] zzav>
	//*  40   78:aload_1         
	//*  41   79:getfield        #59  <Field zzaj[] zzav>
	//*  42   82:invokestatic    #98  <Method boolean Arrays.equals(Object[], Object[])>
	//*  43   85:ifeq            90
				return true;
	//   44   88:iconst_1        
	//   45   89:ireturn         
		}
		return false;
	//   46   90:iconst_0        
	//   47   91:ireturn         
	}

	public final int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Integer.valueOf(zzau), Integer.valueOf(zzar), Integer.valueOf(zzas), Long.valueOf(zzat), zzav
		});
	//    0    0:iconst_5        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #51  <Field int zzau>
	//    6   10:invokestatic    #106 <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #53  <Field int zzar>
	//   12   20:invokestatic    #106 <Method Integer Integer.valueOf(int)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #55  <Field int zzas>
	//   18   30:invokestatic    #106 <Method Integer Integer.valueOf(int)>
	//   19   33:aastore         
	//   20   34:dup             
	//   21   35:iconst_3        
	//   22   36:aload_0         
	//   23   37:getfield        #57  <Field long zzat>
	//   24   40:invokestatic    #111 <Method Long Long.valueOf(long)>
	//   25   43:aastore         
	//   26   44:dup             
	//   27   45:iconst_4        
	//   28   46:aload_0         
	//   29   47:getfield        #59  <Field zzaj[] zzav>
	//   30   50:aastore         
	//   31   51:invokestatic    #116 <Method int Objects.hashCode(Object[])>
	//   32   54:ireturn         
	}

	public final boolean isLocationAvailable()
	{
		return zzau < 1000;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field int zzau>
	//    2    4:sipush          1000
	//    3    7:icmpge          12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public final String toString()
	{
		boolean flag = isLocationAvailable();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #122 <Method boolean isLocationAvailable()>
	//    2    4:istore_1        
		StringBuilder stringbuilder = new StringBuilder(48);
	//    3    5:new             #124 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:bipush          48
	//    6   11:invokespecial   #127 <Method void StringBuilder(int)>
	//    7   14:astore_2        
		stringbuilder.append("LocationAvailability[isLocationAvailable: ");
	//    8   15:aload_2         
	//    9   16:ldc1            #129 <String "LocationAvailability[isLocationAvailable: ">
	//   10   18:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(flag);
	//   12   22:aload_2         
	//   13   23:iload_1         
	//   14   24:invokevirtual   #136 <Method StringBuilder StringBuilder.append(boolean)>
	//   15   27:pop             
		stringbuilder.append("]");
	//   16   28:aload_2         
	//   17   29:ldc1            #138 <String "]">
	//   18   31:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   19   34:pop             
		return stringbuilder.toString();
	//   20   35:aload_2         
	//   21   36:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   22   39:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #148 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, zzar);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #53  <Field int zzar>
	//    7   11:invokestatic    #152 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 2, zzas);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #55  <Field int zzas>
	//   12   20:invokestatic    #152 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeLong(parcel, 3, zzat);
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:getfield        #57  <Field long zzat>
	//   17   29:invokestatic    #156 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeInt(parcel, 4, zzau);
	//   18   32:aload_1         
	//   19   33:iconst_4        
	//   20   34:aload_0         
	//   21   35:getfield        #51  <Field int zzau>
	//   22   38:invokestatic    #152 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeTypedArray(parcel, 5, ((android.os.Parcelable []) (zzav)), i, false);
	//   23   41:aload_1         
	//   24   42:iconst_5        
	//   25   43:aload_0         
	//   26   44:getfield        #59  <Field zzaj[] zzav>
	//   27   47:iload_2         
	//   28   48:iconst_0        
	//   29   49:invokestatic    #160 <Method void SafeParcelWriter.writeTypedArray(Parcel, int, android.os.Parcelable[], int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   30   52:aload_1         
	//   31   53:iload_3         
	//   32   54:invokestatic    #163 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   33   57:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzaa();
	private int zzar;
	private int zzas;
	private long zzat;
	private int zzau;
	private zzaj zzav[];

	static 
	{
	//    0    0:new             #39  <Class zzaa>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void zzaa()>
	//    3    7:putstatic       #44  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
