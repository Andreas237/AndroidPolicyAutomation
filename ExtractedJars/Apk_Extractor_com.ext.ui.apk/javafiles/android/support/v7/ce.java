// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import org.json.JSONException;
import org.json.JSONObject;

public class ce
{

	public ce(String s, String s1)
		throws JSONException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field String a>
		g = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field String g>
		s = ((String) (new JSONObject(g)));
	//    8   14:new             #25  <Class JSONObject>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:getfield        #23  <Field String g>
	//   12   22:invokespecial   #28  <Method void JSONObject(String)>
	//   13   25:astore_1        
		b = ((JSONObject) (s)).optString("productId");
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:ldc1            #30  <String "productId">
	//   17   30:invokevirtual   #34  <Method String JSONObject.optString(String)>
	//   18   33:putfield        #36  <Field String b>
		c = ((JSONObject) (s)).optString("type");
	//   19   36:aload_0         
	//   20   37:aload_1         
	//   21   38:ldc1            #38  <String "type">
	//   22   40:invokevirtual   #34  <Method String JSONObject.optString(String)>
	//   23   43:putfield        #40  <Field String c>
		d = ((JSONObject) (s)).optString("price");
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:ldc1            #42  <String "price">
	//   27   50:invokevirtual   #34  <Method String JSONObject.optString(String)>
	//   28   53:putfield        #44  <Field String d>
		e = ((JSONObject) (s)).optString("title");
	//   29   56:aload_0         
	//   30   57:aload_1         
	//   31   58:ldc1            #46  <String "title">
	//   32   60:invokevirtual   #34  <Method String JSONObject.optString(String)>
	//   33   63:putfield        #48  <Field String e>
		f = ((JSONObject) (s)).optString("description");
	//   34   66:aload_0         
	//   35   67:aload_1         
	//   36   68:ldc1            #50  <String "description">
	//   37   70:invokevirtual   #34  <Method String JSONObject.optString(String)>
	//   38   73:putfield        #52  <Field String f>
	//   39   76:return          
	}

	public String a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field String b>
	//    2    4:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("SkuDetails:").append(g).toString();
	//    0    0:new             #58  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #59  <Method void StringBuilder()>
	//    3    7:ldc1            #61  <String "SkuDetails:">
	//    4    9:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #23  <Field String g>
	//    7   16:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:invokevirtual   #67  <Method String StringBuilder.toString()>
	//    9   22:areturn         
	}

	String a;
	String b;
	String c;
	String d;
	String e;
	String f;
	String g;
}
