// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk.payments;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.paypal.android.sdk.payments:
//			aj

public final class PayPalAuthorization
	implements Parcelable
{

	private PayPalAuthorization(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		a = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #35  <Method String Parcel.readString()>
	//    5    9:putfield        #37  <Field String a>
		b = parcel.readString();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #35  <Method String Parcel.readString()>
	//    9   17:putfield        #39  <Field String b>
		c = parcel.readString();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #35  <Method String Parcel.readString()>
	//   13   25:putfield        #41  <Field String c>
	//   14   28:return          
	}

	PayPalAuthorization(Parcel parcel, byte byte0)
	{
		this(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #44  <Method void PayPalAuthorization(Parcel)>
	//    3    5:return          
	}

	PayPalAuthorization(String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #37  <Field String a>
		b = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #39  <Field String b>
		if("partner".equals("general"))
	//*   8   14:ldc1            #47  <String "partner">
	//*   9   16:ldc1            #49  <String "general">
	//*  10   18:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  11   21:ifeq            30
		{
			c = s2;
	//   12   24:aload_0         
	//   13   25:aload_3         
	//   14   26:putfield        #41  <Field String c>
			return;
	//   15   29:return          
		} else
		{
			c = null;
	//   16   30:aload_0         
	//   17   31:aconst_null     
	//   18   32:putfield        #41  <Field String c>
			return;
	//   19   35:return          
		}
	}

	public final int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #37  <Field String a>
	//    3    5:invokevirtual   #63  <Method void Parcel.writeString(String)>
		parcel.writeString(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #39  <Field String b>
	//    7   13:invokevirtual   #63  <Method void Parcel.writeString(String)>
		parcel.writeString(c);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #41  <Field String c>
	//   11   21:invokevirtual   #63  <Method void Parcel.writeString(String)>
	//   12   24:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new aj();
	private final String a;
	private final String b;
	private final String c;

	static 
	{
		((Class) (com/paypal/android/sdk/payments/PayPalAuthorization)).getSimpleName();
	//    0    0:ldc1            #2   <Class PayPalAuthorization>
	//    1    2:invokevirtual   #20  <Method String Class.getSimpleName()>
	//    2    5:pop             
	//    3    6:new             #22  <Class aj>
	//    4    9:dup             
	//    5   10:invokespecial   #25  <Method void aj()>
	//    6   13:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   7   16:return          
	}
}
