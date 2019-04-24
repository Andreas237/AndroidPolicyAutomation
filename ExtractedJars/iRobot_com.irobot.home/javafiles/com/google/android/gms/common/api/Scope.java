// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.api:
//			zza

public final class Scope extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	Scope(int i, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void AbstractSafeParcelable()>
		Preconditions.checkNotEmpty(s, "scopeUri must not be null or empty");
	//    2    4:aload_2         
	//    3    5:ldc1            #40  <String "scopeUri must not be null or empty">
	//    4    7:invokestatic    #46  <Method String Preconditions.checkNotEmpty(String, Object)>
	//    5   10:pop             
		zzg = i;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #48  <Field int zzg>
		zzap = s;
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:putfield        #50  <Field String zzap>
	//   12   21:return          
	}

	public Scope(String s)
	{
		this(1, s);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:invokespecial   #55  <Method void Scope(int, String)>
	//    4    6:return          
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
		if(!(obj instanceof Scope))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class Scope>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		else
			return zzap.equals(((Object) (((Scope)obj).zzap)));
	//   10   16:aload_0         
	//   11   17:getfield        #50  <Field String zzap>
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class Scope>
	//   14   24:getfield        #50  <Field String zzap>
	//   15   27:invokevirtual   #61  <Method boolean String.equals(Object)>
	//   16   30:ireturn         
	}

	public final String getScopeUri()
	{
		return zzap;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String zzap>
	//    2    4:areturn         
	}

	public final int hashCode()
	{
		return zzap.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String zzap>
	//    2    4:invokevirtual   #66  <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public final String toString()
	{
		return zzap;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String zzap>
	//    2    4:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #75  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, zzg);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #48  <Field int zzg>
	//    7   11:invokestatic    #79  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 2, getScopeUri(), false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #81  <Method String getScopeUri()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #85  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   14   24:aload_1         
	//   15   25:iload_2         
	//   16   26:invokestatic    #88  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   17   29:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zza();
	private final String zzap;
	private final int zzg;

	static 
	{
	//    0    0:new             #28  <Class zza>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void zza()>
	//    3    7:putstatic       #33  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
