// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk;

import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk:
//			eq, cj, cd, ca, 
//			ab

public final class en extends eq
{

	public en(ca ca, ab ab, String s, String s1, String s2, String s3)
	{
		super(cj.d, ca, ab, b(s, s1));
	//    0    0:aload_0         
	//    1    1:getstatic       #15  <Field cj cj.d>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokestatic    #18  <Method String b(String, String)>
	//    7   12:invokespecial   #21  <Method void eq(cj, ca, ab, String)>
		a = s2;
	//    8   15:aload_0         
	//    9   16:aload           5
	//   10   18:putfield        #23  <Field String a>
		b = s3;
	//   11   21:aload_0         
	//   12   22:aload           6
	//   13   24:putfield        #25  <Field String b>
	//   14   27:return          
	}

	public final String b()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #29  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void HashMap()>
	//    3    7:astore_1        
		hashmap.put("authn_schemes", "2fa_pre_login");
	//    4    8:aload_1         
	//    5    9:ldc1            #34  <String "authn_schemes">
	//    6   11:ldc1            #36  <String "2fa_pre_login">
	//    7   13:invokevirtual   #40  <Method Object HashMap.put(Object, Object)>
	//    8   16:pop             
		hashmap.put("nonce", ((Object) (a)));
	//    9   17:aload_1         
	//   10   18:ldc1            #42  <String "nonce">
	//   11   20:aload_0         
	//   12   21:getfield        #23  <Field String a>
	//   13   24:invokevirtual   #40  <Method Object HashMap.put(Object, Object)>
	//   14   27:pop             
		JSONObject jsonobject = new JSONObject();
	//   15   28:new             #44  <Class JSONObject>
	//   16   31:dup             
	//   17   32:invokespecial   #45  <Method void JSONObject()>
	//   18   35:astore_2        
		jsonobject.accumulate("authn_scheme", "security_key_sms_token");
	//   19   36:aload_2         
	//   20   37:ldc1            #47  <String "authn_scheme">
	//   21   39:ldc1            #49  <String "security_key_sms_token">
	//   22   41:invokevirtual   #53  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   23   44:pop             
		jsonobject.accumulate("token_identifier", ((Object) (b)));
	//   24   45:aload_2         
	//   25   46:ldc1            #55  <String "token_identifier">
	//   26   48:aload_0         
	//   27   49:getfield        #25  <Field String b>
	//   28   52:invokevirtual   #53  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   29   55:pop             
		hashmap.put("2fa_token_identifiers", ((Object) (a(jsonobject))));
	//   30   56:aload_1         
	//   31   57:ldc1            #57  <String "2fa_token_identifiers">
	//   32   59:aload_2         
	//   33   60:invokestatic    #60  <Method String a(JSONObject)>
	//   34   63:invokevirtual   #40  <Method Object HashMap.put(Object, Object)>
	//   35   66:pop             
		return cd.a(((java.util.Map) (hashmap)));
	//   36   67:aload_1         
	//   37   68:invokestatic    #65  <Method String cd.a(java.util.Map)>
	//   38   71:areturn         
	}

	public final void c()
	{
		JSONException jsonexception;
		JSONObject jsonobject = m();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method JSONObject m()>
	//    2    4:astore_1        
		try
		{
			g = jsonobject.getString("nonce");
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #42  <String "nonce">
	//    6    9:invokevirtual   #76  <Method String JSONObject.getString(String)>
	//    7   12:putfield        #79  <Field String g>
			return;
	//    8   15:return          
		}
	//*   9   16:aload_0         
	//*  10   17:aload_1         
	//*  11   18:invokevirtual   #82  <Method void b(JSONObject)>
	//*  12   21:return          
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
		{
			b(jsonobject);
		}
	//*  13   22:astore_2        
	//*  14   23:goto            16
	}

	public final void d()
	{
		b(m());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #72  <Method JSONObject m()>
	//    3    5:invokevirtual   #82  <Method void b(JSONObject)>
	//    4    8:return          
	}

	public final String e()
	{
		return "{\"nonce\": \"mock-login-challenge-nonce\"}";
	//    0    0:ldc1            #85  <String "{\"nonce\": \"mock-login-challenge-nonce\"}">
	//    1    2:areturn         
	}

	private final String a;
	private final String b;
}
