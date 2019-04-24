// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.api.signin.internal:
//			GoogleSignInOptionsExtensionCreator

public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable
{

	GoogleSignInOptionsExtensionParcelable(int i, int j, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void AbstractSafeParcelable()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #41  <Field int versionCode>
		zzac = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #43  <Field int zzac>
		mBundle = bundle;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #45  <Field Bundle mBundle>
	//   11   19:return          
	}

	public GoogleSignInOptionsExtensionParcelable(GoogleSignInOptionsExtension googlesigninoptionsextension)
	{
		this(1, googlesigninoptionsextension.getExtensionType(), googlesigninoptionsextension.toBundle());
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:invokeinterface #54  <Method int GoogleSignInOptionsExtension.getExtensionType()>
	//    4    8:aload_1         
	//    5    9:invokeinterface #58  <Method Bundle GoogleSignInOptionsExtension.toBundle()>
	//    6   14:invokespecial   #60  <Method void GoogleSignInOptionsExtensionParcelable(int, int, Bundle)>
	//    7   17:return          
	}

	public Bundle getBundle()
	{
		return mBundle;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Bundle mBundle>
	//    2    4:areturn         
	}

	public int getType()
	{
		return zzac;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int zzac>
	//    2    4:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #68  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, versionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #41  <Field int versionCode>
	//    7   11:invokestatic    #72  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 2, getType());
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #74  <Method int getType()>
	//   12   20:invokestatic    #72  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeBundle(parcel, 3, getBundle(), false);
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:invokevirtual   #76  <Method Bundle getBundle()>
	//   17   29:iconst_0        
	//   18   30:invokestatic    #80  <Method void SafeParcelWriter.writeBundle(Parcel, int, Bundle, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   19   33:aload_1         
	//   20   34:iload_2         
	//   21   35:invokestatic    #83  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   22   38:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new GoogleSignInOptionsExtensionCreator();
	private Bundle mBundle;
	private final int versionCode;
	private int zzac;

	static 
	{
	//    0    0:new             #28  <Class GoogleSignInOptionsExtensionCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void GoogleSignInOptionsExtensionCreator()>
	//    3    7:putstatic       #33  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
