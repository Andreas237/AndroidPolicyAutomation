// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk.payments;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk.payments:
//			cm, PayPalPayment, ProofOfPayment

public final class PaymentConfirmation
	implements Parcelable
{

	private PaymentConfirmation(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		b = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #35  <Method String Parcel.readString()>
	//    5    9:putfield        #37  <Field String b>
		c = (PayPalPayment)parcel.readParcelable(((Class) (com/paypal/android/sdk/payments/PayPalPayment)).getClassLoader());
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:ldc1            #39  <Class PayPalPayment>
	//    9   16:invokevirtual   #45  <Method ClassLoader Class.getClassLoader()>
	//   10   19:invokevirtual   #49  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   11   22:checkcast       #39  <Class PayPalPayment>
	//   12   25:putfield        #51  <Field PayPalPayment c>
		d = (ProofOfPayment)parcel.readParcelable(((Class) (com/paypal/android/sdk/payments/ProofOfPayment)).getClassLoader());
	//   13   28:aload_0         
	//   14   29:aload_1         
	//   15   30:ldc1            #53  <Class ProofOfPayment>
	//   16   32:invokevirtual   #45  <Method ClassLoader Class.getClassLoader()>
	//   17   35:invokevirtual   #49  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   18   38:checkcast       #53  <Class ProofOfPayment>
	//   19   41:putfield        #55  <Field ProofOfPayment d>
	//   20   44:return          
	}

	PaymentConfirmation(Parcel parcel, byte byte0)
	{
		this(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #58  <Method void PaymentConfirmation(Parcel)>
	//    3    5:return          
	}

	PaymentConfirmation(String s, PayPalPayment paypalpayment, ProofOfPayment proofofpayment)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		b = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #37  <Field String b>
		c = paypalpayment;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #51  <Field PayPalPayment c>
		d = proofofpayment;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #55  <Field ProofOfPayment d>
	//   11   19:return          
	}

	public final JSONObject a()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #64  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void JSONObject()>
	//    3    7:astore_1        
		try
		{
			JSONObject jsonobject1 = new JSONObject();
	//    4    8:new             #64  <Class JSONObject>
	//    5   11:dup             
	//    6   12:invokespecial   #65  <Method void JSONObject()>
	//    7   15:astore_2        
			jsonobject1.put("environment", ((Object) (b)));
	//    8   16:aload_2         
	//    9   17:ldc1            #67  <String "environment">
	//   10   19:aload_0         
	//   11   20:getfield        #37  <Field String b>
	//   12   23:invokevirtual   #71  <Method JSONObject JSONObject.put(String, Object)>
	//   13   26:pop             
			jsonobject1.put("paypal_sdk_version", "2.16.0");
	//   14   27:aload_2         
	//   15   28:ldc1            #73  <String "paypal_sdk_version">
	//   16   30:ldc1            #75  <String "2.16.0">
	//   17   32:invokevirtual   #71  <Method JSONObject JSONObject.put(String, Object)>
	//   18   35:pop             
			jsonobject1.put("platform", "Android");
	//   19   36:aload_2         
	//   20   37:ldc1            #77  <String "platform">
	//   21   39:ldc1            #79  <String "Android">
	//   22   41:invokevirtual   #71  <Method JSONObject JSONObject.put(String, Object)>
	//   23   44:pop             
			jsonobject1.put("product_name", "PayPal-Android-SDK");
	//   24   45:aload_2         
	//   25   46:ldc1            #81  <String "product_name">
	//   26   48:ldc1            #83  <String "PayPal-Android-SDK">
	//   27   50:invokevirtual   #71  <Method JSONObject JSONObject.put(String, Object)>
	//   28   53:pop             
			jsonobject.put("client", ((Object) (jsonobject1)));
	//   29   54:aload_1         
	//   30   55:ldc1            #85  <String "client">
	//   31   57:aload_2         
	//   32   58:invokevirtual   #71  <Method JSONObject JSONObject.put(String, Object)>
	//   33   61:pop             
			jsonobject.put("response", ((Object) (d.a())));
	//   34   62:aload_1         
	//   35   63:ldc1            #87  <String "response">
	//   36   65:aload_0         
	//   37   66:getfield        #55  <Field ProofOfPayment d>
	//   38   69:invokevirtual   #89  <Method JSONObject ProofOfPayment.a()>
	//   39   72:invokevirtual   #71  <Method JSONObject JSONObject.put(String, Object)>
	//   40   75:pop             
			jsonobject.put("response_type", "payment");
	//   41   76:aload_1         
	//   42   77:ldc1            #91  <String "response_type">
	//   43   79:ldc1            #93  <String "payment">
	//   44   81:invokevirtual   #71  <Method JSONObject JSONObject.put(String, Object)>
	//   45   84:pop             
		}
	//*  46   85:aload_1         
	//*  47   86:areturn         
		catch(JSONException jsonexception)
	//*  48   87:astore_1        
		{
			Log.e(a, "Error encoding JSON", ((Throwable) (jsonexception)));
	//   49   88:getstatic       #95  <Field String a>
	//   50   91:ldc1            #97  <String "Error encoding JSON">
	//   51   93:aload_1         
	//   52   94:invokestatic    #103 <Method int Log.e(String, String, Throwable)>
	//   53   97:pop             
			return null;
	//   54   98:aconst_null     
	//   55   99:areturn         
		}
		return jsonobject;
	}

	public final int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(b);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #37  <Field String b>
	//    3    5:invokevirtual   #111 <Method void Parcel.writeString(String)>
		parcel.writeParcelable(((Parcelable) (c)), 0);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #51  <Field PayPalPayment c>
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #115 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (d)), 0);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #55  <Field ProofOfPayment d>
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #115 <Method void Parcel.writeParcelable(Parcelable, int)>
	//   14   26:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new cm();
	private static final String a = "PaymentConfirmation";
	private String b;
	private PayPalPayment c;
	private ProofOfPayment d;

	static 
	{
	//    0    0:new             #21  <Class cm>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void cm()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
