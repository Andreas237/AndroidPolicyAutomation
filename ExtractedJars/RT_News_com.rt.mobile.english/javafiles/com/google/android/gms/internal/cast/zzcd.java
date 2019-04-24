// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzce, zzcu

public final class zzcd extends AbstractSafeParcelable
{

	public zzcd()
	{
		this(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #33  <Method void zzcd(String)>
	//    3    5:return          
	}

	zzcd(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void AbstractSafeParcelable()>
		zzur = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field String zzur>
	//    5    9:return          
	}

	public final boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof zzcd))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzcd>
	//*   7   11:ifne            16
		{
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		} else
		{
			obj = ((Object) ((zzcd)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzcd>
	//   12   20:astore_1        
			return zzcu.zza(((Object) (zzur)), ((Object) (((zzcd) (obj)).zzur)));
	//   13   21:aload_0         
	//   14   22:getfield        #38  <Field String zzur>
	//   15   25:aload_1         
	//   16   26:getfield        #38  <Field String zzur>
	//   17   29:invokestatic    #48  <Method boolean zzcu.zza(Object, Object)>
	//   18   32:ireturn         
		}
	}

	public final int hashCode()
	{
		return Objects.hashCode(new Object[] {
			zzur
		});
	//    0    0:iconst_1        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #38  <Field String zzur>
	//    6   10:aastore         
	//    7   11:invokestatic    #57  <Method int Objects.hashCode(Object[])>
	//    8   14:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #65  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeString(parcel, 2, zzur, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #38  <Field String zzur>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #69  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokestatic    #72  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   12   20:return          
	}

	public final String zzcl()
	{
		return zzur;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String zzur>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzce();
	private String zzur;

	static 
	{
	//    0    0:new             #24  <Class zzce>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void zzce()>
	//    3    7:putstatic       #29  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
