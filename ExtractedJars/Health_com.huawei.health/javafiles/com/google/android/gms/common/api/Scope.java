// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzac;

// Referenced classes of package com.google.android.gms.common.api:
//			zzg

public final class Scope extends zza
	implements ReflectedParcelable
{

	Scope(int i, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void zza()>
		zzac.zzh(s, "scopeUri must not be null or empty");
	//    2    4:aload_2         
	//    3    5:ldc1            #27  <String "scopeUri must not be null or empty">
	//    4    7:invokestatic    #33  <Method String zzac.zzh(String, Object)>
	//    5   10:pop             
		zzaiI = i;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #35  <Field int zzaiI>
		zzazw = s;
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:putfield        #37  <Field String zzazw>
	//   12   21:return          
	}

	public Scope(String s)
	{
		this(1, s);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:invokespecial   #40  <Method void Scope(int, String)>
	//    4    6:return          
	}

	public boolean equals(Object obj)
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
			return zzazw.equals(((Object) (((Scope)obj).zzazw)));
	//   10   16:aload_0         
	//   11   17:getfield        #37  <Field String zzazw>
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class Scope>
	//   14   24:getfield        #37  <Field String zzazw>
	//   15   27:invokevirtual   #46  <Method boolean String.equals(Object)>
	//   16   30:ireturn         
	}

	public int hashCode()
	{
		return zzazw.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String zzazw>
	//    2    4:invokevirtual   #50  <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public String toString()
	{
		return zzazw;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String zzazw>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.common.api.zzg.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #58  <Method void com.google.android.gms.common.api.zzg.zza(Scope, Parcel, int)>
	//    4    6:return          
	}

	public String zzvt()
	{
		return zzazw;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String zzazw>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzg();
	final int zzaiI;
	private final String zzazw;

	static 
	{
	//    0    0:new             #17  <Class zzg>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void zzg()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
