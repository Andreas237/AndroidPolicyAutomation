// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//			zzk

public final class IdToken extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	public IdToken(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void AbstractSafeParcelable()>
		Preconditions.checkArgument(TextUtils.isEmpty(((CharSequence) (s))) ^ true, "account type string cannot be null or empty");
	//    2    4:aload_1         
	//    3    5:invokestatic    #46  <Method boolean TextUtils.isEmpty(CharSequence)>
	//    4    8:iconst_1        
	//    5    9:ixor            
	//    6   10:ldc1            #48  <String "account type string cannot be null or empty">
	//    7   12:invokestatic    #54  <Method void Preconditions.checkArgument(boolean, Object)>
		Preconditions.checkArgument(TextUtils.isEmpty(((CharSequence) (s1))) ^ true, "id token string cannot be null or empty");
	//    8   15:aload_2         
	//    9   16:invokestatic    #46  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   10   19:iconst_1        
	//   11   20:ixor            
	//   12   21:ldc1            #56  <String "id token string cannot be null or empty">
	//   13   23:invokestatic    #54  <Method void Preconditions.checkArgument(boolean, Object)>
		zzr = s;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:putfield        #58  <Field String zzr>
		zzak = s1;
	//   17   31:aload_0         
	//   18   32:aload_2         
	//   19   33:putfield        #60  <Field String zzak>
	//   20   36:return          
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
		if(!(obj instanceof IdToken))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class IdToken>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((IdToken)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class IdToken>
	//   12   20:astore_1        
		return Objects.equal(((Object) (zzr)), ((Object) (((IdToken) (obj)).zzr))) && Objects.equal(((Object) (zzak)), ((Object) (((IdToken) (obj)).zzak)));
	//   13   21:aload_0         
	//   14   22:getfield        #58  <Field String zzr>
	//   15   25:aload_1         
	//   16   26:getfield        #58  <Field String zzr>
	//   17   29:invokestatic    #70  <Method boolean Objects.equal(Object, Object)>
	//   18   32:ifeq            51
	//   19   35:aload_0         
	//   20   36:getfield        #60  <Field String zzak>
	//   21   39:aload_1         
	//   22   40:getfield        #60  <Field String zzak>
	//   23   43:invokestatic    #70  <Method boolean Objects.equal(Object, Object)>
	//   24   46:ifeq            51
	//   25   49:iconst_1        
	//   26   50:ireturn         
	//   27   51:iconst_0        
	//   28   52:ireturn         
	}

	public final String getAccountType()
	{
		return zzr;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field String zzr>
	//    2    4:areturn         
	}

	public final String getIdToken()
	{
		return zzak;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field String zzak>
	//    2    4:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #79  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeString(parcel, 1, getAccountType(), false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #81  <Method String getAccountType()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #85  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 2, getIdToken(), false);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:invokevirtual   #87  <Method String getIdToken()>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #85  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   15   25:aload_1         
	//   16   26:iload_2         
	//   17   27:invokestatic    #90  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   18   30:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzk();
	private final String zzak;
	private final String zzr;

	static 
	{
	//    0    0:new             #30  <Class zzk>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void zzk()>
	//    3    7:putstatic       #35  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
