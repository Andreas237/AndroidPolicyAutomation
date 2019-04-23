// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk.payments;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.paypal.android.sdk.cd;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk.payments:
//			cz

public final class ProofOfPayment
	implements Parcelable
{

	private ProofOfPayment(Parcel parcel)
	{
		this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #34  <Method String Parcel.readString()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #34  <Method String Parcel.readString()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #34  <Method String Parcel.readString()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #34  <Method String Parcel.readString()>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #34  <Method String Parcel.readString()>
	//   11   21:invokespecial   #37  <Method void ProofOfPayment(String, String, String, String, String)>
	//   12   24:return          
	}

	ProofOfPayment(Parcel parcel, byte byte0)
	{
		this(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #40  <Method void ProofOfPayment(Parcel)>
	//    3    5:return          
	}

	ProofOfPayment(String s, String s1, String s2, String s3, String s4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		b = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #43  <Field String b>
		c = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #45  <Field String c>
		d = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #47  <Field String d>
		e = s3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #49  <Field String e>
		f = s4;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #51  <Field String f>
		(new StringBuilder("ProofOfPayment created: ")).append(toString());
	//   17   31:new             #53  <Class StringBuilder>
	//   18   34:dup             
	//   19   35:ldc1            #55  <String "ProofOfPayment created: ">
	//   20   37:invokespecial   #58  <Method void StringBuilder(String)>
	//   21   40:aload_0         
	//   22   41:invokevirtual   #61  <Method String toString()>
	//   23   44:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   24   47:pop             
	//   25   48:return          
	}

	public final JSONObject a()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #70  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #71  <Method void JSONObject()>
	//    3    7:astore_3        
		jsonobject.put("create_time", ((Object) (d)));
	//    4    8:aload_3         
	//    5    9:ldc1            #73  <String "create_time">
	//    6   11:aload_0         
	//    7   12:getfield        #47  <Field String d>
	//    8   15:invokevirtual   #77  <Method JSONObject JSONObject.put(String, Object)>
	//    9   18:pop             
		jsonobject.put("id", ((Object) (c)));
	//   10   19:aload_3         
	//   11   20:ldc1            #79  <String "id">
	//   12   22:aload_0         
	//   13   23:getfield        #45  <Field String c>
	//   14   26:invokevirtual   #77  <Method JSONObject JSONObject.put(String, Object)>
	//   15   29:pop             
		jsonobject.put("intent", ((Object) (e)));
	//   16   30:aload_3         
	//   17   31:ldc1            #81  <String "intent">
	//   18   33:aload_0         
	//   19   34:getfield        #49  <Field String e>
	//   20   37:invokevirtual   #77  <Method JSONObject JSONObject.put(String, Object)>
	//   21   40:pop             
		jsonobject.put("state", ((Object) (b)));
	//   22   41:aload_3         
	//   23   42:ldc1            #83  <String "state">
	//   24   44:aload_0         
	//   25   45:getfield        #43  <Field String b>
	//   26   48:invokevirtual   #77  <Method JSONObject JSONObject.put(String, Object)>
	//   27   51:pop             
		Object obj = ((Object) (jsonobject));
	//   28   52:aload_3         
	//   29   53:astore_1        
		if(!cd.b(((CharSequence) (f))))
			break MISSING_BLOCK_LABEL_143;
	//   30   54:aload_0         
	//   31   55:getfield        #51  <Field String f>
	//   32   58:invokestatic    #88  <Method boolean cd.b(CharSequence)>
	//   33   61:ifeq            143
		obj = ((Object) (jsonobject));
	//   34   64:aload_3         
	//   35   65:astore_1        
		if(!cd.b(((CharSequence) (e))))
			break MISSING_BLOCK_LABEL_143;
	//   36   66:aload_0         
	//   37   67:getfield        #49  <Field String e>
	//   38   70:invokestatic    #88  <Method boolean cd.b(CharSequence)>
	//   39   73:ifeq            143
		if(!e.equals("authorize")) goto _L2; else goto _L1
	//   40   76:aload_0         
	//   41   77:getfield        #49  <Field String e>
	//   42   80:ldc1            #90  <String "authorize">
	//   43   82:invokevirtual   #96  <Method boolean String.equals(Object)>
	//   44   85:ifeq            105
_L1:
		obj = "authorization_id";
	//   45   88:ldc1            #98  <String "authorization_id">
	//   46   90:astore_1        
		String s = f;
	//   47   91:aload_0         
	//   48   92:getfield        #51  <Field String f>
	//   49   95:astore_2        
_L3:
		jsonobject.put(((String) (obj)), ((Object) (s)));
	//   50   96:aload_3         
	//   51   97:aload_1         
	//   52   98:aload_2         
	//   53   99:invokevirtual   #77  <Method JSONObject JSONObject.put(String, Object)>
	//   54  102:pop             
		return jsonobject;
	//   55  103:aload_3         
	//   56  104:areturn         
_L2:
		obj = ((Object) (jsonobject));
	//   57  105:aload_3         
	//   58  106:astore_1        
		if(!e.equals("order"))
			break MISSING_BLOCK_LABEL_143;
	//   59  107:aload_0         
	//   60  108:getfield        #49  <Field String e>
	//   61  111:ldc1            #100 <String "order">
	//   62  113:invokevirtual   #96  <Method boolean String.equals(Object)>
	//   63  116:ifeq            143
		obj = "order_id";
	//   64  119:ldc1            #102 <String "order_id">
	//   65  121:astore_1        
		s = f;
	//   66  122:aload_0         
	//   67  123:getfield        #51  <Field String f>
	//   68  126:astore_2        
		  goto _L3
	//*  69  127:goto            96
		obj;
	//   70  130:astore_1        
		Log.e(a, "error encoding JSON", ((Throwable) (obj)));
	//   71  131:getstatic       #104 <Field String a>
	//   72  134:ldc1            #106 <String "error encoding JSON">
	//   73  136:aload_1         
	//   74  137:invokestatic    #111 <Method int Log.e(String, String, Throwable)>
	//   75  140:pop             
		obj = null;
	//   76  141:aconst_null     
	//   77  142:astore_1        
		return ((JSONObject) (obj));
	//   78  143:aload_1         
	//   79  144:areturn         
	}

	public final int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final String toString()
	{
		String s;
		if(cd.b(((CharSequence) (f))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field String f>
	//*   2    4:invokestatic    #88  <Method boolean cd.b(CharSequence)>
	//*   3    7:ifeq            18
			s = f;
	//    4   10:aload_0         
	//    5   11:getfield        #51  <Field String f>
	//    6   14:astore_1        
		else
	//*   7   15:goto            21
			s = "no transactionId";
	//    8   18:ldc1            #115 <String "no transactionId">
	//    9   20:astore_1        
		StringBuilder stringbuilder = new StringBuilder("{");
	//   10   21:new             #53  <Class StringBuilder>
	//   11   24:dup             
	//   12   25:ldc1            #117 <String "{">
	//   13   27:invokespecial   #58  <Method void StringBuilder(String)>
	//   14   30:astore_2        
		stringbuilder.append(e);
	//   15   31:aload_2         
	//   16   32:aload_0         
	//   17   33:getfield        #49  <Field String e>
	//   18   36:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
		stringbuilder.append(": ");
	//   20   40:aload_2         
	//   21   41:ldc1            #119 <String ": ">
	//   22   43:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
		stringbuilder.append(s);
	//   24   47:aload_2         
	//   25   48:aload_1         
	//   26   49:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
		stringbuilder.append("}");
	//   28   53:aload_2         
	//   29   54:ldc1            #121 <String "}">
	//   30   56:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   31   59:pop             
		return stringbuilder.toString();
	//   32   60:aload_2         
	//   33   61:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   34   64:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(b);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #43  <Field String b>
	//    3    5:invokevirtual   #127 <Method void Parcel.writeString(String)>
		parcel.writeString(c);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #45  <Field String c>
	//    7   13:invokevirtual   #127 <Method void Parcel.writeString(String)>
		parcel.writeString(d);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #47  <Field String d>
	//   11   21:invokevirtual   #127 <Method void Parcel.writeString(String)>
		parcel.writeString(e);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #49  <Field String e>
	//   15   29:invokevirtual   #127 <Method void Parcel.writeString(String)>
		parcel.writeString(f);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #51  <Field String f>
	//   19   37:invokevirtual   #127 <Method void Parcel.writeString(String)>
	//   20   40:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new cz();
	private static final String a = "ProofOfPayment";
	private String b;
	private String c;
	private String d;
	private String e;
	private String f;

	static 
	{
	//    0    0:new             #21  <Class cz>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void cz()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
