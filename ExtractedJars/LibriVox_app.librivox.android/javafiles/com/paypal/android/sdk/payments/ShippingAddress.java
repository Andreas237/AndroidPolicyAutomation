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
//			db

public final class ShippingAddress
	implements Parcelable
{

	public ShippingAddress()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:return          
	}

	private ShippingAddress(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		b = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #37  <Method String Parcel.readString()>
	//    5    9:putfield        #39  <Field String b>
		c = parcel.readString();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #37  <Method String Parcel.readString()>
	//    9   17:putfield        #41  <Field String c>
		d = parcel.readString();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #37  <Method String Parcel.readString()>
	//   13   25:putfield        #43  <Field String d>
		e = parcel.readString();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #37  <Method String Parcel.readString()>
	//   17   33:putfield        #45  <Field String e>
		f = parcel.readString();
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #37  <Method String Parcel.readString()>
	//   21   41:putfield        #47  <Field String f>
		g = parcel.readString();
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #37  <Method String Parcel.readString()>
	//   25   49:putfield        #49  <Field String g>
		h = parcel.readString();
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokevirtual   #37  <Method String Parcel.readString()>
	//   29   57:putfield        #51  <Field String h>
	//   30   60:return          
	}

	ShippingAddress(Parcel parcel, byte byte0)
	{
		this(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #54  <Method void ShippingAddress(Parcel)>
	//    3    5:return          
	}

	private static boolean a(String s)
	{
		return cd.b(((CharSequence) (s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #60  <Method boolean cd.b(CharSequence)>
	//    2    4:ireturn         
	}

	private static boolean a(String s, String s1)
	{
		if(cd.a(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #63  <Method boolean cd.a(CharSequence)>
	//*   2    4:ifeq            12
			return cd.a(((CharSequence) (s1)));
	//    3    7:aload_1         
	//    4    8:invokestatic    #63  <Method boolean cd.a(CharSequence)>
	//    5   11:ireturn         
		if(cd.a(((CharSequence) (s1))))
	//*   6   12:aload_1         
	//*   7   13:invokestatic    #63  <Method boolean cd.a(CharSequence)>
	//*   8   16:ifeq            21
			return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
		else
			return s.trim().equals(((Object) (s1.trim())));
	//   11   21:aload_0         
	//   12   22:invokevirtual   #68  <Method String String.trim()>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #68  <Method String String.trim()>
	//   15   29:invokevirtual   #72  <Method boolean String.equals(Object)>
	//   16   32:ireturn         
	}

	public final JSONObject a()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #77  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #78  <Method void JSONObject()>
	//    3    7:astore_1        
		jsonobject.accumulate("recipient_name", ((Object) (b)));
	//    4    8:aload_1         
	//    5    9:ldc1            #80  <String "recipient_name">
	//    6   11:aload_0         
	//    7   12:getfield        #39  <Field String b>
	//    8   15:invokevirtual   #84  <Method JSONObject JSONObject.accumulate(String, Object)>
	//    9   18:pop             
		jsonobject.accumulate("line1", ((Object) (c)));
	//   10   19:aload_1         
	//   11   20:ldc1            #86  <String "line1">
	//   12   22:aload_0         
	//   13   23:getfield        #41  <Field String c>
	//   14   26:invokevirtual   #84  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   15   29:pop             
		jsonobject.accumulate("city", ((Object) (e)));
	//   16   30:aload_1         
	//   17   31:ldc1            #88  <String "city">
	//   18   33:aload_0         
	//   19   34:getfield        #45  <Field String e>
	//   20   37:invokevirtual   #84  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   21   40:pop             
		jsonobject.accumulate("country_code", ((Object) (h)));
	//   22   41:aload_1         
	//   23   42:ldc1            #90  <String "country_code">
	//   24   44:aload_0         
	//   25   45:getfield        #51  <Field String h>
	//   26   48:invokevirtual   #84  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   27   51:pop             
		if(a(d))
	//*  28   52:aload_0         
	//*  29   53:getfield        #43  <Field String d>
	//*  30   56:invokestatic    #92  <Method boolean a(String)>
	//*  31   59:ifeq            73
			jsonobject.accumulate("line2", ((Object) (d)));
	//   32   62:aload_1         
	//   33   63:ldc1            #94  <String "line2">
	//   34   65:aload_0         
	//   35   66:getfield        #43  <Field String d>
	//   36   69:invokevirtual   #84  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   37   72:pop             
		if(a(f))
	//*  38   73:aload_0         
	//*  39   74:getfield        #47  <Field String f>
	//*  40   77:invokestatic    #92  <Method boolean a(String)>
	//*  41   80:ifeq            94
			jsonobject.accumulate("state", ((Object) (f)));
	//   42   83:aload_1         
	//   43   84:ldc1            #96  <String "state">
	//   44   86:aload_0         
	//   45   87:getfield        #47  <Field String f>
	//   46   90:invokevirtual   #84  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   47   93:pop             
		if(!a(g))
			break MISSING_BLOCK_LABEL_129;
	//   48   94:aload_0         
	//   49   95:getfield        #49  <Field String g>
	//   50   98:invokestatic    #92  <Method boolean a(String)>
	//   51  101:ifeq            129
		jsonobject.accumulate("postal_code", ((Object) (g)));
	//   52  104:aload_1         
	//   53  105:ldc1            #98  <String "postal_code">
	//   54  107:aload_0         
	//   55  108:getfield        #49  <Field String g>
	//   56  111:invokevirtual   #84  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   57  114:pop             
		return jsonobject;
	//   58  115:aload_1         
	//   59  116:areturn         
		JSONException jsonexception;
		jsonexception;
	//   60  117:astore_2        
		Log.e(a, jsonexception.getMessage());
	//   61  118:getstatic       #100 <Field String a>
	//   62  121:aload_2         
	//   63  122:invokevirtual   #103 <Method String JSONException.getMessage()>
	//   64  125:invokestatic    #108 <Method int Log.e(String, String)>
	//   65  128:pop             
		return jsonobject;
	//   66  129:aload_1         
	//   67  130:areturn         
	}

	final boolean a(JSONObject jsonobject)
	{
		if(!a(jsonobject.optString("recipient_name"), b))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #80  <String "recipient_name">
	//*   2    3:invokevirtual   #113 <Method String JSONObject.optString(String)>
	//*   3    6:aload_0         
	//*   4    7:getfield        #39  <Field String b>
	//*   5   10:invokestatic    #115 <Method boolean a(String, String)>
	//*   6   13:ifne            18
			return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
		if(!a(jsonobject.optString("line1"), c))
	//*   9   18:aload_1         
	//*  10   19:ldc1            #86  <String "line1">
	//*  11   21:invokevirtual   #113 <Method String JSONObject.optString(String)>
	//*  12   24:aload_0         
	//*  13   25:getfield        #41  <Field String c>
	//*  14   28:invokestatic    #115 <Method boolean a(String, String)>
	//*  15   31:ifne            36
			return false;
	//   16   34:iconst_0        
	//   17   35:ireturn         
		if(!a(jsonobject.optString("line2"), d))
	//*  18   36:aload_1         
	//*  19   37:ldc1            #94  <String "line2">
	//*  20   39:invokevirtual   #113 <Method String JSONObject.optString(String)>
	//*  21   42:aload_0         
	//*  22   43:getfield        #43  <Field String d>
	//*  23   46:invokestatic    #115 <Method boolean a(String, String)>
	//*  24   49:ifne            54
			return false;
	//   25   52:iconst_0        
	//   26   53:ireturn         
		if(!a(jsonobject.optString("city"), e))
	//*  27   54:aload_1         
	//*  28   55:ldc1            #88  <String "city">
	//*  29   57:invokevirtual   #113 <Method String JSONObject.optString(String)>
	//*  30   60:aload_0         
	//*  31   61:getfield        #45  <Field String e>
	//*  32   64:invokestatic    #115 <Method boolean a(String, String)>
	//*  33   67:ifne            72
			return false;
	//   34   70:iconst_0        
	//   35   71:ireturn         
		if(!a(jsonobject.optString("state"), f))
	//*  36   72:aload_1         
	//*  37   73:ldc1            #96  <String "state">
	//*  38   75:invokevirtual   #113 <Method String JSONObject.optString(String)>
	//*  39   78:aload_0         
	//*  40   79:getfield        #47  <Field String f>
	//*  41   82:invokestatic    #115 <Method boolean a(String, String)>
	//*  42   85:ifne            90
			return false;
	//   43   88:iconst_0        
	//   44   89:ireturn         
		if(!a(jsonobject.optString("country_code"), h))
	//*  45   90:aload_1         
	//*  46   91:ldc1            #90  <String "country_code">
	//*  47   93:invokevirtual   #113 <Method String JSONObject.optString(String)>
	//*  48   96:aload_0         
	//*  49   97:getfield        #51  <Field String h>
	//*  50  100:invokestatic    #115 <Method boolean a(String, String)>
	//*  51  103:ifne            108
			return false;
	//   52  106:iconst_0        
	//   53  107:ireturn         
		return a(jsonobject.optString("postal_code"), g);
	//   54  108:aload_1         
	//   55  109:ldc1            #98  <String "postal_code">
	//   56  111:invokevirtual   #113 <Method String JSONObject.optString(String)>
	//   57  114:aload_0         
	//   58  115:getfield        #49  <Field String g>
	//   59  118:invokestatic    #115 <Method boolean a(String, String)>
	//   60  121:ifne            126
	//   61  124:iconst_0        
	//   62  125:ireturn         
	//   63  126:iconst_1        
	//   64  127:ireturn         
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
	//    2    2:getfield        #39  <Field String b>
	//    3    5:invokevirtual   #123 <Method void Parcel.writeString(String)>
		parcel.writeString(c);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field String c>
	//    7   13:invokevirtual   #123 <Method void Parcel.writeString(String)>
		parcel.writeString(d);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #43  <Field String d>
	//   11   21:invokevirtual   #123 <Method void Parcel.writeString(String)>
		parcel.writeString(e);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #45  <Field String e>
	//   15   29:invokevirtual   #123 <Method void Parcel.writeString(String)>
		parcel.writeString(f);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #47  <Field String f>
	//   19   37:invokevirtual   #123 <Method void Parcel.writeString(String)>
		parcel.writeString(g);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #49  <Field String g>
	//   23   45:invokevirtual   #123 <Method void Parcel.writeString(String)>
		parcel.writeString(h);
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #51  <Field String h>
	//   27   53:invokevirtual   #123 <Method void Parcel.writeString(String)>
	//   28   56:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new db();
	private static final String a = "ShippingAddress";
	private String b;
	private String c;
	private String d;
	private String e;
	private String f;
	private String g;
	private String h;

	static 
	{
	//    0    0:new             #23  <Class db>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void db()>
	//    3    7:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
