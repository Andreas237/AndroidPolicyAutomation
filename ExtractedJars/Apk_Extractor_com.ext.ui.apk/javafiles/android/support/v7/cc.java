// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import org.json.JSONException;
import org.json.JSONObject;

public class cc
{

	public cc(String s, String s1, String s2)
		throws JSONException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field String a>
		i = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field String i>
		s = ((String) (new JSONObject(i)));
	//    8   14:new             #30  <Class JSONObject>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:getfield        #28  <Field String i>
	//   12   22:invokespecial   #33  <Method void JSONObject(String)>
	//   13   25:astore_1        
		b = ((JSONObject) (s)).optString("orderId");
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:ldc1            #35  <String "orderId">
	//   17   30:invokevirtual   #39  <Method String JSONObject.optString(String)>
	//   18   33:putfield        #41  <Field String b>
		c = ((JSONObject) (s)).optString("packageName");
	//   19   36:aload_0         
	//   20   37:aload_1         
	//   21   38:ldc1            #43  <String "packageName">
	//   22   40:invokevirtual   #39  <Method String JSONObject.optString(String)>
	//   23   43:putfield        #45  <Field String c>
		d = ((JSONObject) (s)).optString("productId");
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:ldc1            #47  <String "productId">
	//   27   50:invokevirtual   #39  <Method String JSONObject.optString(String)>
	//   28   53:putfield        #49  <Field String d>
		e = ((JSONObject) (s)).optLong("purchaseTime");
	//   29   56:aload_0         
	//   30   57:aload_1         
	//   31   58:ldc1            #51  <String "purchaseTime">
	//   32   60:invokevirtual   #55  <Method long JSONObject.optLong(String)>
	//   33   63:putfield        #57  <Field long e>
		f = ((JSONObject) (s)).optInt("purchaseState");
	//   34   66:aload_0         
	//   35   67:aload_1         
	//   36   68:ldc1            #59  <String "purchaseState">
	//   37   70:invokevirtual   #63  <Method int JSONObject.optInt(String)>
	//   38   73:putfield        #65  <Field int f>
		g = ((JSONObject) (s)).optString("developerPayload");
	//   39   76:aload_0         
	//   40   77:aload_1         
	//   41   78:ldc1            #67  <String "developerPayload">
	//   42   80:invokevirtual   #39  <Method String JSONObject.optString(String)>
	//   43   83:putfield        #69  <Field String g>
		h = ((JSONObject) (s)).optString("token", ((JSONObject) (s)).optString("purchaseToken"));
	//   44   86:aload_0         
	//   45   87:aload_1         
	//   46   88:ldc1            #71  <String "token">
	//   47   90:aload_1         
	//   48   91:ldc1            #73  <String "purchaseToken">
	//   49   93:invokevirtual   #39  <Method String JSONObject.optString(String)>
	//   50   96:invokevirtual   #76  <Method String JSONObject.optString(String, String)>
	//   51   99:putfield        #78  <Field String h>
		j = s2;
	//   52  102:aload_0         
	//   53  103:aload_3         
	//   54  104:putfield        #80  <Field String j>
	//   55  107:return          
	}

	public String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String a>
	//    2    4:areturn         
	}

	public String b()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String d>
	//    2    4:areturn         
	}

	public String c()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field String h>
	//    2    4:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("PurchaseInfo(type:").append(a).append("):").append(i).toString();
	//    0    0:new             #86  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #87  <Method void StringBuilder()>
	//    3    7:ldc1            #89  <String "PurchaseInfo(type:">
	//    4    9:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #26  <Field String a>
	//    7   16:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #95  <String "):">
	//    9   21:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #28  <Field String i>
	//   12   28:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   14   34:areturn         
	}

	String a;
	String b;
	String c;
	String d;
	long e;
	int f;
	String g;
	String h;
	String i;
	String j;
}
