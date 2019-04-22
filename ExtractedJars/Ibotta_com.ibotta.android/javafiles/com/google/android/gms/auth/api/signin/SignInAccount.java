// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//			zze, GoogleSignInAccount

public class SignInAccount extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	SignInAccount(String s, GoogleSignInAccount googlesigninaccount, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void AbstractSafeParcelable()>
		zzep = googlesigninaccount;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #46  <Field GoogleSignInAccount zzep>
		zzeo = Preconditions.checkNotEmpty(s, "8.3 and 8.4 SDKs require non-null email");
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:ldc1            #48  <String "8.3 and 8.4 SDKs require non-null email">
	//    8   13:invokestatic    #54  <Method String Preconditions.checkNotEmpty(String, Object)>
	//    9   16:putfield        #56  <Field String zzeo>
		zzeq = Preconditions.checkNotEmpty(s1, "8.3 and 8.4 SDKs require non-null userId");
	//   10   19:aload_0         
	//   11   20:aload_3         
	//   12   21:ldc1            #58  <String "8.3 and 8.4 SDKs require non-null userId">
	//   13   23:invokestatic    #54  <Method String Preconditions.checkNotEmpty(String, Object)>
	//   14   26:putfield        #60  <Field String zzeq>
	//   15   29:return          
	}

	public final GoogleSignInAccount getGoogleSignInAccount()
	{
		return zzep;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field GoogleSignInAccount zzep>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #73  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeString(parcel, 4, zzeo, false);
	//    3    5:aload_1         
	//    4    6:iconst_4        
	//    5    7:aload_0         
	//    6    8:getfield        #56  <Field String zzeo>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #77  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 7, ((android.os.Parcelable) (zzep)), i, false);
	//    9   15:aload_1         
	//   10   16:bipush          7
	//   11   18:aload_0         
	//   12   19:getfield        #46  <Field GoogleSignInAccount zzep>
	//   13   22:iload_2         
	//   14   23:iconst_0        
	//   15   24:invokestatic    #81  <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeString(parcel, 8, zzeq, false);
	//   16   27:aload_1         
	//   17   28:bipush          8
	//   18   30:aload_0         
	//   19   31:getfield        #60  <Field String zzeq>
	//   20   34:iconst_0        
	//   21   35:invokestatic    #77  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   22   38:aload_1         
	//   23   39:iload_3         
	//   24   40:invokestatic    #84  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   25   43:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zze();
	private String zzeo;
	private GoogleSignInAccount zzep;
	private String zzeq;

	static 
	{
	//    0    0:new             #34  <Class zze>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void zze()>
	//    3    7:putstatic       #39  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
