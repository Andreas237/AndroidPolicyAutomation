// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.*;

// Referenced classes of package com.google.android.gms.location:
//			zzai

public final class LocationSettingsStates extends AbstractSafeParcelable
{

	public LocationSettingsStates(boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4, boolean flag5)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void AbstractSafeParcelable()>
		zzbn = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #51  <Field boolean zzbn>
		zzbo = flag1;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #53  <Field boolean zzbo>
		zzbp = flag2;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #55  <Field boolean zzbp>
		zzbq = flag3;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #57  <Field boolean zzbq>
		zzbr = flag4;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #59  <Field boolean zzbr>
		zzbs = flag5;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #61  <Field boolean zzbs>
	//   20   37:return          
	}

	public static LocationSettingsStates fromIntent(Intent intent)
	{
		return (LocationSettingsStates)SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
	//    0    0:aload_0         
	//    1    1:ldc1            #67  <String "com.google.android.gms.location.LOCATION_SETTINGS_STATES">
	//    2    3:getstatic       #44  <Field android.os.Parcelable$Creator CREATOR>
	//    3    6:invokestatic    #73  <Method com.google.android.gms.common.internal.safeparcel.SafeParcelable SafeParcelableSerializer.deserializeFromIntentExtra(Intent, String, android.os.Parcelable$Creator)>
	//    4    9:checkcast       #2   <Class LocationSettingsStates>
	//    5   12:areturn         
	}

	public final boolean isBlePresent()
	{
		return zzbs;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field boolean zzbs>
	//    2    4:ireturn         
	}

	public final boolean isBleUsable()
	{
		return zzbp;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field boolean zzbp>
	//    2    4:ireturn         
	}

	public final boolean isGpsPresent()
	{
		return zzbq;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field boolean zzbq>
	//    2    4:ireturn         
	}

	public final boolean isGpsUsable()
	{
		return zzbn;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field boolean zzbn>
	//    2    4:ireturn         
	}

	public final boolean isLocationPresent()
	{
		return zzbq || zzbr;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field boolean zzbq>
	//    2    4:ifne            19
	//    3    7:aload_0         
	//    4    8:getfield        #59  <Field boolean zzbr>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public final boolean isLocationUsable()
	{
		return zzbn || zzbo;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field boolean zzbn>
	//    2    4:ifne            19
	//    3    7:aload_0         
	//    4    8:getfield        #53  <Field boolean zzbo>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public final boolean isNetworkLocationPresent()
	{
		return zzbr;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field boolean zzbr>
	//    2    4:ireturn         
	}

	public final boolean isNetworkLocationUsable()
	{
		return zzbo;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field boolean zzbo>
	//    2    4:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #84  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeBoolean(parcel, 1, isGpsUsable());
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #86  <Method boolean isGpsUsable()>
	//    7   11:invokestatic    #90  <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 2, isNetworkLocationUsable());
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #92  <Method boolean isNetworkLocationUsable()>
	//   12   20:invokestatic    #90  <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 3, isBleUsable());
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:invokevirtual   #94  <Method boolean isBleUsable()>
	//   17   29:invokestatic    #90  <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 4, isGpsPresent());
	//   18   32:aload_1         
	//   19   33:iconst_4        
	//   20   34:aload_0         
	//   21   35:invokevirtual   #96  <Method boolean isGpsPresent()>
	//   22   38:invokestatic    #90  <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 5, isNetworkLocationPresent());
	//   23   41:aload_1         
	//   24   42:iconst_5        
	//   25   43:aload_0         
	//   26   44:invokevirtual   #98  <Method boolean isNetworkLocationPresent()>
	//   27   47:invokestatic    #90  <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 6, isBlePresent());
	//   28   50:aload_1         
	//   29   51:bipush          6
	//   30   53:aload_0         
	//   31   54:invokevirtual   #100 <Method boolean isBlePresent()>
	//   32   57:invokestatic    #90  <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   33   60:aload_1         
	//   34   61:iload_2         
	//   35   62:invokestatic    #103 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   36   65:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzai();
	private final boolean zzbn;
	private final boolean zzbo;
	private final boolean zzbp;
	private final boolean zzbq;
	private final boolean zzbr;
	private final boolean zzbs;

	static 
	{
	//    0    0:new             #39  <Class zzai>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void zzai()>
	//    3    7:putstatic       #44  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
