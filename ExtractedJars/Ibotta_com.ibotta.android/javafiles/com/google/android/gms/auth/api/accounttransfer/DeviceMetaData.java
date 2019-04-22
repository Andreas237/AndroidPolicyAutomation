// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.api.accounttransfer:
//			zzy

public class DeviceMetaData extends AbstractSafeParcelable
{

	DeviceMetaData(int i, boolean flag, long l, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void AbstractSafeParcelable()>
		zzy = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #44  <Field int zzy>
		zzcc = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #46  <Field boolean zzcc>
		zzcd = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #48  <Field long zzcd>
		zzce = flag1;
	//   11   19:aload_0         
	//   12   20:iload           5
	//   13   22:putfield        #50  <Field boolean zzce>
	//   14   25:return          
	}

	public long getMinAgeOfLockScreen()
	{
		return zzcd;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field long zzcd>
	//    2    4:lreturn         
	}

	public boolean isChallengeAllowed()
	{
		return zzce;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field boolean zzce>
	//    2    4:ireturn         
	}

	public boolean isLockScreenSolved()
	{
		return zzcc;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field boolean zzcc>
	//    2    4:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #62  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, zzy);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #44  <Field int zzy>
	//    7   11:invokestatic    #66  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeBoolean(parcel, 2, isLockScreenSolved());
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #68  <Method boolean isLockScreenSolved()>
	//   12   20:invokestatic    #72  <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeLong(parcel, 3, getMinAgeOfLockScreen());
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:invokevirtual   #74  <Method long getMinAgeOfLockScreen()>
	//   17   29:invokestatic    #78  <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeBoolean(parcel, 4, isChallengeAllowed());
	//   18   32:aload_1         
	//   19   33:iconst_4        
	//   20   34:aload_0         
	//   21   35:invokevirtual   #80  <Method boolean isChallengeAllowed()>
	//   22   38:invokestatic    #72  <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   23   41:aload_1         
	//   24   42:iload_2         
	//   25   43:invokestatic    #83  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   26   46:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzy();
	private boolean zzcc;
	private long zzcd;
	private final boolean zzce;
	private final int zzy;

	static 
	{
	//    0    0:new             #32  <Class zzy>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void zzy()>
	//    3    7:putstatic       #37  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
