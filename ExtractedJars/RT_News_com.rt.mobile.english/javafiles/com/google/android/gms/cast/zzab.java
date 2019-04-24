// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.cast:
//			zzac

public final class zzab extends AbstractSafeParcelable
{

	public zzab(float f, float f1, float f2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void AbstractSafeParcelable()>
		zzcr = f;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #42  <Field float zzcr>
		zzcs = f1;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #44  <Field float zzcs>
		zzct = f2;
	//    8   14:aload_0         
	//    9   15:fload_3         
	//   10   16:putfield        #46  <Field float zzct>
	//   11   19:return          
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
		if(!(obj instanceof zzab))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzab>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzab)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzab>
	//   12   20:astore_1        
		return zzcr == ((zzab) (obj)).zzcr && zzcs == ((zzab) (obj)).zzcs && zzct == ((zzab) (obj)).zzct;
	//   13   21:aload_0         
	//   14   22:getfield        #42  <Field float zzcr>
	//   15   25:aload_1         
	//   16   26:getfield        #42  <Field float zzcr>
	//   17   29:fcmpl           
	//   18   30:ifne            59
	//   19   33:aload_0         
	//   20   34:getfield        #44  <Field float zzcs>
	//   21   37:aload_1         
	//   22   38:getfield        #44  <Field float zzcs>
	//   23   41:fcmpl           
	//   24   42:ifne            59
	//   25   45:aload_0         
	//   26   46:getfield        #46  <Field float zzct>
	//   27   49:aload_1         
	//   28   50:getfield        #46  <Field float zzct>
	//   29   53:fcmpl           
	//   30   54:ifne            59
	//   31   57:iconst_1        
	//   32   58:ireturn         
	//   33   59:iconst_0        
	//   34   60:ireturn         
	}

	public final int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Float.valueOf(zzcr), Float.valueOf(zzcs), Float.valueOf(zzct)
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #42  <Field float zzcr>
	//    6   10:invokestatic    #60  <Method Float Float.valueOf(float)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #44  <Field float zzcs>
	//   12   20:invokestatic    #60  <Method Float Float.valueOf(float)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #46  <Field float zzct>
	//   18   30:invokestatic    #60  <Method Float Float.valueOf(float)>
	//   19   33:aastore         
	//   20   34:invokestatic    #65  <Method int Objects.hashCode(Object[])>
	//   21   37:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #73  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeFloat(parcel, 2, zzcr);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #42  <Field float zzcr>
	//    7   11:invokestatic    #77  <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeFloat(parcel, 3, zzcs);
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:getfield        #44  <Field float zzcs>
	//   12   20:invokestatic    #77  <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeFloat(parcel, 4, zzct);
	//   13   23:aload_1         
	//   14   24:iconst_4        
	//   15   25:aload_0         
	//   16   26:getfield        #46  <Field float zzct>
	//   17   29:invokestatic    #77  <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   18   32:aload_1         
	//   19   33:iload_2         
	//   20   34:invokestatic    #80  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   21   37:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzac();
	private final float zzcr;
	private final float zzcs;
	private final float zzct;

	static 
	{
	//    0    0:new             #30  <Class zzac>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void zzac()>
	//    3    7:putstatic       #35  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
