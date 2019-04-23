// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//			h, GoogleSignInAccount

public class SignInAccount extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	SignInAccount(String s, GoogleSignInAccount googlesigninaccount, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void AbstractSafeParcelable()>
		b = googlesigninaccount;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #28  <Field GoogleSignInAccount b>
		a = am.a(s, "8.3 and 8.4 SDKs require non-null email");
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:ldc1            #30  <String "8.3 and 8.4 SDKs require non-null email">
	//    8   13:invokestatic    #35  <Method String am.a(String, Object)>
	//    9   16:putfield        #37  <Field String a>
		c = am.a(s1, "8.3 and 8.4 SDKs require non-null userId");
	//   10   19:aload_0         
	//   11   20:aload_3         
	//   12   21:ldc1            #39  <String "8.3 and 8.4 SDKs require non-null userId">
	//   13   23:invokestatic    #35  <Method String am.a(String, Object)>
	//   14   26:putfield        #41  <Field String c>
	//   15   29:return          
	}

	public final GoogleSignInAccount a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field GoogleSignInAccount b>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #51  <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, a, false);
	//    3    5:aload_1         
	//    4    6:iconst_4        
	//    5    7:aload_0         
	//    6    8:getfield        #37  <Field String a>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #54  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, ((android.os.Parcelable) (b)), i, false);
	//    9   15:aload_1         
	//   10   16:bipush          7
	//   11   18:aload_0         
	//   12   19:getfield        #28  <Field GoogleSignInAccount b>
	//   13   22:iload_2         
	//   14   23:iconst_0        
	//   15   24:invokestatic    #57  <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, c, false);
	//   16   27:aload_1         
	//   17   28:bipush          8
	//   18   30:aload_0         
	//   19   31:getfield        #41  <Field String c>
	//   20   34:iconst_0        
	//   21   35:invokestatic    #54  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   22   38:aload_1         
	//   23   39:iload_3         
	//   24   40:invokestatic    #59  <Method void c.a(Parcel, int)>
	//   25   43:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new h();
	private String a;
	private GoogleSignInAccount b;
	private String c;

	static 
	{
	//    0    0:new             #18  <Class h>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void h()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
