// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.api.signin.internal:
//			zzx, HashAccumulator

public final class SignInConfiguration extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	public SignInConfiguration(String s, GoogleSignInOptions googlesigninoptions)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void AbstractSafeParcelable()>
		zzbr = Preconditions.checkNotEmpty(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #46  <Method String Preconditions.checkNotEmpty(String)>
	//    5    9:putfield        #48  <Field String zzbr>
		zzbs = googlesigninoptions;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #50  <Field GoogleSignInOptions zzbs>
	//    9   17:return          
	}

	public final boolean equals(Object obj)
	{
		if(!(obj instanceof SignInConfiguration))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class SignInConfiguration>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		obj = ((Object) ((SignInConfiguration)obj));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class SignInConfiguration>
	//    7   13:astore_1        
		if(zzbr.equals(((Object) (((SignInConfiguration) (obj)).zzbr))))
	//*   8   14:aload_0         
	//*   9   15:getfield        #48  <Field String zzbr>
	//*  10   18:aload_1         
	//*  11   19:getfield        #48  <Field String zzbr>
	//*  12   22:invokevirtual   #58  <Method boolean String.equals(Object)>
	//*  13   25:ifeq            60
		{
			GoogleSignInOptions googlesigninoptions = zzbs;
	//   14   28:aload_0         
	//   15   29:getfield        #50  <Field GoogleSignInOptions zzbs>
	//   16   32:astore_2        
			if(googlesigninoptions != null ? googlesigninoptions.equals(((Object) (((SignInConfiguration) (obj)).zzbs))) : ((SignInConfiguration) (obj)).zzbs == null)
	//*  17   33:aload_2         
	//*  18   34:ifnonnull       47
	//*  19   37:aload_1         
	//*  20   38:getfield        #50  <Field GoogleSignInOptions zzbs>
	//*  21   41:ifnonnull       60
	//*  22   44:goto            58
	//*  23   47:aload_2         
	//*  24   48:aload_1         
	//*  25   49:getfield        #50  <Field GoogleSignInOptions zzbs>
	//*  26   52:invokevirtual   #61  <Method boolean GoogleSignInOptions.equals(Object)>
	//*  27   55:ifeq            60
				return true;
	//   28   58:iconst_1        
	//   29   59:ireturn         
		}
		return false;
	//   30   60:iconst_0        
	//   31   61:ireturn         
	}

	public final int hashCode()
	{
		return (new HashAccumulator()).addObject(((Object) (zzbr))).addObject(((Object) (zzbs))).hash();
	//    0    0:new             #65  <Class HashAccumulator>
	//    1    3:dup             
	//    2    4:invokespecial   #66  <Method void HashAccumulator()>
	//    3    7:aload_0         
	//    4    8:getfield        #48  <Field String zzbr>
	//    5   11:invokevirtual   #70  <Method HashAccumulator HashAccumulator.addObject(Object)>
	//    6   14:aload_0         
	//    7   15:getfield        #50  <Field GoogleSignInOptions zzbs>
	//    8   18:invokevirtual   #70  <Method HashAccumulator HashAccumulator.addObject(Object)>
	//    9   21:invokevirtual   #73  <Method int HashAccumulator.hash()>
	//   10   24:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #81  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeString(parcel, 2, zzbr, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #48  <Field String zzbr>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #85  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 5, ((android.os.Parcelable) (zzbs)), i, false);
	//    9   15:aload_1         
	//   10   16:iconst_5        
	//   11   17:aload_0         
	//   12   18:getfield        #50  <Field GoogleSignInOptions zzbs>
	//   13   21:iload_2         
	//   14   22:iconst_0        
	//   15   23:invokestatic    #89  <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   16   26:aload_1         
	//   17   27:iload_3         
	//   18   28:invokestatic    #92  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   19   31:return          
	}

	public final GoogleSignInOptions zzm()
	{
		return zzbs;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field GoogleSignInOptions zzbs>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzx();
	private final String zzbr;
	private GoogleSignInOptions zzbs;

	static 
	{
	//    0    0:new             #30  <Class zzx>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void zzx()>
	//    3    7:putstatic       #35  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
