// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk:
//			by, cg, cj, at, 
//			cd, ca, ab

public class em extends by
{

	public em(ca ca, ab ab, String s, String s1, String s2)
	{
		cg cg1 = new cg(cj.k);
	//    0    0:new             #20  <Class cg>
	//    1    3:dup             
	//    2    4:getstatic       #26  <Field cj cj.k>
	//    3    7:invokespecial   #29  <Method void cg(cj)>
	//    4   10:astore          7
		StringBuilder stringbuilder = new StringBuilder("Bearer ");
	//    5   12:new             #31  <Class StringBuilder>
	//    6   15:dup             
	//    7   16:ldc1            #33  <String "Bearer ">
	//    8   18:invokespecial   #36  <Method void StringBuilder(String)>
	//    9   21:astore          8
		String s3 = s1;
	//   10   23:aload           4
	//   11   25:astore          6
		if(at.a(s))
	//*  12   27:aload_3         
	//*  13   28:invokestatic    #41  <Method boolean at.a(String)>
	//*  14   31:ifeq            47
		{
			s3 = s1;
	//   15   34:aload           4
	//   16   36:astore          6
			if(s1 == null)
	//*  17   38:aload           4
	//*  18   40:ifnonnull       47
				s3 = "mock_euat";
	//   19   43:ldc1            #43  <String "mock_euat">
	//   20   45:astore          6
		}
		stringbuilder.append(s3);
	//   21   47:aload           8
	//   22   49:aload           6
	//   23   51:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   24   54:pop             
		s = stringbuilder.toString();
	//   25   55:aload           8
	//   26   57:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   27   60:astore_3        
		s1 = ((String) (new StringBuilder("/")));
	//   28   61:new             #31  <Class StringBuilder>
	//   29   64:dup             
	//   30   65:ldc1            #53  <String "/">
	//   31   67:invokespecial   #36  <Method void StringBuilder(String)>
	//   32   70:astore          4
		((StringBuilder) (s1)).append(s2);
	//   33   72:aload           4
	//   34   74:aload           5
	//   35   76:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   36   79:pop             
		super(((bx) (cg1)), ca, ab, s, ((StringBuilder) (s1)).toString());
	//   37   80:aload_0         
	//   38   81:aload           7
	//   39   83:aload_1         
	//   40   84:aload_2         
	//   41   85:aload_3         
	//   42   86:aload           4
	//   43   88:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   44   91:invokespecial   #56  <Method void by(bx, ca, ab, String, String)>
		b = ((Map) (new HashMap()));
	//   45   94:aload_0         
	//   46   95:new             #58  <Class HashMap>
	//   47   98:dup             
	//   48   99:invokespecial   #60  <Method void HashMap()>
	//   49  102:putfield        #62  <Field Map b>
		a("Content-Type", "application/x-www-form-urlencoded");
	//   50  105:aload_0         
	//   51  106:ldc1            #64  <String "Content-Type">
	//   52  108:ldc1            #66  <String "application/x-www-form-urlencoded">
	//   53  110:invokevirtual   #69  <Method void a(String, String)>
	//   54  113:return          
	}

	private static void a(JSONArray jsonarray, Map map)
	{
		if(jsonarray != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          75
		{
			for(int i = 0; i < jsonarray.length(); i++)
	//*   2    4:iconst_0        
	//*   3    5:istore_2        
	//*   4    6:iload_2         
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #76  <Method int JSONArray.length()>
	//*   7   11:icmpge          75
			{
				Object obj = ((Object) (jsonarray.getJSONObject(i)));
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:invokevirtual   #80  <Method JSONObject JSONArray.getJSONObject(int)>
	//   11   19:astore          4
				if(obj == null)
					continue;
	//   12   21:aload           4
	//   13   23:ifnull          68
				String s = ((JSONObject) (obj)).optString("name");
	//   14   26:aload           4
	//   15   28:ldc1            #82  <String "name">
	//   16   30:invokevirtual   #88  <Method String JSONObject.optString(String)>
	//   17   33:astore_3        
				obj = ((Object) (((JSONObject) (obj)).optString("value")));
	//   18   34:aload           4
	//   19   36:ldc1            #90  <String "value">
	//   20   38:invokevirtual   #88  <Method String JSONObject.optString(String)>
	//   21   41:astore          4
				if(cd.b(((CharSequence) (s))) && cd.b(((CharSequence) (obj))))
	//*  22   43:aload_3         
	//*  23   44:invokestatic    #95  <Method boolean cd.b(CharSequence)>
	//*  24   47:ifeq            68
	//*  25   50:aload           4
	//*  26   52:invokestatic    #95  <Method boolean cd.b(CharSequence)>
	//*  27   55:ifeq            68
					map.put(((Object) (s)), obj);
	//   28   58:aload_1         
	//   29   59:aload_3         
	//   30   60:aload           4
	//   31   62:invokeinterface #101 <Method Object Map.put(Object, Object)>
	//   32   67:pop             
			}

	//   33   68:iload_2         
	//   34   69:iconst_1        
	//   35   70:iadd            
	//   36   71:istore_2        
		}
	//*  37   72:goto            6
	//   38   75:return          
	}

	public final String b()
	{
		return "";
	//    0    0:ldc1            #103 <String "">
	//    1    2:areturn         
	}

	public final void c()
	{
		JSONObject jsonobject;
label0:
		{
			Object obj;
label1:
			{
				jsonobject = m();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #107 <Method JSONObject m()>
	//    2    4:astore_3        
				JSONArray jsonarray1 = jsonobject.optJSONArray("capabilities");
	//    3    5:aload_3         
	//    4    6:ldc1            #109 <String "capabilities">
	//    5    8:invokevirtual   #113 <Method JSONArray JSONObject.optJSONArray(String)>
	//    6   11:astore          4
				if(jsonarray1 == null)
					break label0;
	//    7   13:aload           4
	//    8   15:ifnull          105
				for(int i = 0; i < jsonarray1.length(); i++)
	//*   9   18:iconst_0        
	//*  10   19:istore_1        
	//*  11   20:iload_1         
	//*  12   21:aload           4
	//*  13   23:invokevirtual   #76  <Method int JSONArray.length()>
	//*  14   26:icmpge          64
				{
					obj = ((Object) (jsonarray1.getJSONObject(i)));
	//   15   29:aload           4
	//   16   31:iload_1         
	//   17   32:invokevirtual   #80  <Method JSONObject JSONArray.getJSONObject(int)>
	//   18   35:astore_2        
					if(obj != null && "PAYPAL_ACCESS".equals(((Object) (((JSONObject) (obj)).optString("name")))))
	//*  19   36:aload_2         
	//*  20   37:ifnull          57
	//*  21   40:ldc1            #115 <String "PAYPAL_ACCESS">
	//*  22   42:aload_2         
	//*  23   43:ldc1            #82  <String "name">
	//*  24   45:invokevirtual   #88  <Method String JSONObject.optString(String)>
	//*  25   48:invokevirtual   #121 <Method boolean String.equals(Object)>
	//*  26   51:ifeq            57
						break label1;
	//   27   54:goto            66
				}

	//   28   57:iload_1         
	//   29   58:iconst_1        
	//   30   59:iadd            
	//   31   60:istore_1        
	//*  32   61:goto            20
				obj = null;
	//   33   64:aconst_null     
	//   34   65:astore_2        
			}
			if(obj != null)
	//*  35   66:aload_2         
	//*  36   67:ifnull          105
			{
				a(((JSONObject) (obj)).optJSONArray("attributes"), b);
	//   37   70:aload_2         
	//   38   71:ldc1            #123 <String "attributes">
	//   39   73:invokevirtual   #113 <Method JSONArray JSONObject.optJSONArray(String)>
	//   40   76:aload_0         
	//   41   77:getfield        #62  <Field Map b>
	//   42   80:invokestatic    #125 <Method void a(JSONArray, Map)>
				obj = ((Object) (b));
	//   43   83:aload_0         
	//   44   84:getfield        #62  <Field Map b>
	//   45   87:astore_2        
				(new StringBuilder("Attributes: ")).append(obj.toString());
	//   46   88:new             #31  <Class StringBuilder>
	//   47   91:dup             
	//   48   92:ldc1            #127 <String "Attributes: ">
	//   49   94:invokespecial   #36  <Method void StringBuilder(String)>
	//   50   97:aload_2         
	//   51   98:invokevirtual   #130 <Method String Object.toString()>
	//   52  101:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   53  104:pop             
			}
		}
		JSONArray jsonarray = jsonobject.optJSONArray("attributes");
	//   54  105:aload_3         
	//   55  106:ldc1            #123 <String "attributes">
	//   56  108:invokevirtual   #113 <Method JSONArray JSONObject.optJSONArray(String)>
	//   57  111:astore_2        
		if(jsonarray != null)
	//*  58  112:aload_2         
	//*  59  113:ifnull          174
		{
			HashMap hashmap = new HashMap();
	//   60  116:new             #58  <Class HashMap>
	//   61  119:dup             
	//   62  120:invokespecial   #60  <Method void HashMap()>
	//   63  123:astore_3        
			a(jsonarray, ((Map) (hashmap)));
	//   64  124:aload_2         
	//   65  125:aload_3         
	//   66  126:invokestatic    #125 <Method void a(JSONArray, Map)>
			c = (String)((Map) (hashmap)).get("privacy_policy_url");
	//   67  129:aload_0         
	//   68  130:aload_3         
	//   69  131:ldc1            #132 <String "privacy_policy_url">
	//   70  133:invokeinterface #136 <Method Object Map.get(Object)>
	//   71  138:checkcast       #117 <Class String>
	//   72  141:putfield        #138 <Field String c>
			d = (String)((Map) (hashmap)).get("user_agreement_url");
	//   73  144:aload_0         
	//   74  145:aload_3         
	//   75  146:ldc1            #140 <String "user_agreement_url">
	//   76  148:invokeinterface #136 <Method Object Map.get(Object)>
	//   77  153:checkcast       #117 <Class String>
	//   78  156:putfield        #142 <Field String d>
			e = (String)((Map) (hashmap)).get("display_name");
	//   79  159:aload_0         
	//   80  160:aload_3         
	//   81  161:ldc1            #144 <String "display_name">
	//   82  163:invokeinterface #136 <Method Object Map.get(Object)>
	//   83  168:checkcast       #117 <Class String>
	//   84  171:putfield        #146 <Field String e>
		}
	//   85  174:return          
	}

	public final void d()
	{
	//    0    0:return          
	}

	public final String e()
	{
		return " {\n     \"attributes\": [\n         {\n             \"name\": \"display_name\",\n             \"value\": \"Example Merchant\"\n         },\n         {\n             \"name\": \"privacy_policy_url\",\n             \"value\": \"http://www.example.com/privacy-policy\"\n         },\n         {\n             \"name\": \"user_agreement_url\",\n             \"value\": \"http://www.example.com/user-agreement\"\n         }\n     ],\n     \"name\": \"LiveTestApp\",\n     \"capabilities\": [\n         {\n             \"scopes\": [],\n             \"name\": \"PAYPAL_ACCESS\",\n             \"attributes\": [\n                 {\n                     \"name\": \"openid_connect\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_date_of_birth\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_fullname\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_gender\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_zip\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_language\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_city\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_country\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_timezone\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_email\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_street_address1\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_street_address2\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_phone_number\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_locale\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_state\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_age_range\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_account_verified\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_account_creation_date\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_account_type\",\n                     \"value\": \"Y\"\n                 }\n             ]\n         },\n         {\n             \"scopes\": [\n                 \"https://api.paypal.com/v1/payments/.*\",\n                 \"https://api.paypal.com/v1/vault/credit-card\",\n                 \"https://api.paypal.com/v1/vault/credit-card/.*\"\n             ],\n             \"name\": \"PAYMENT\",\n             \"features\": [\n                 {\n                     \"status\": \"ACTIVE\",\n                     \"name\": \"ACCEPT_CARD\"\n                 },\n                 {\n                     \"status\": \"ACTIVE\",\n                     \"name\": \"ACCEPT_PAYPAL\"\n                 }\n             ]\n         }\n     ]\n }    ";
	//    0    0:ldc1            #148 <String " {\n     \"attributes\": [\n         {\n             \"name\": \"display_name\",\n             \"value\": \"Example Merchant\"\n         },\n         {\n             \"name\": \"privacy_policy_url\",\n             \"value\": \"http://www.example.com/privacy-policy\"\n         },\n         {\n             \"name\": \"user_agreement_url\",\n             \"value\": \"http://www.example.com/user-agreement\"\n         }\n     ],\n     \"name\": \"LiveTestApp\",\n     \"capabilities\": [\n         {\n             \"scopes\": [],\n             \"name\": \"PAYPAL_ACCESS\",\n             \"attributes\": [\n                 {\n                     \"name\": \"openid_connect\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_date_of_birth\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_fullname\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_gender\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_zip\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_language\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_city\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_country\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_timezone\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_email\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_street_address1\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_street_address2\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_phone_number\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_locale\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_state\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_age_range\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_account_verified\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_account_creation_date\",\n                     \"value\": \"Y\"\n                 },\n                 {\n                     \"name\": \"oauth_account_type\",\n                     \"value\": \"Y\"\n                 }\n             ]\n         },\n         {\n             \"scopes\": [\n                 \"https://api.paypal.com/v1/payments/.*\",\n                 \"https://api.paypal.com/v1/vault/credit-card\",\n                 \"https://api.paypal.com/v1/vault/credit-card/.*\"\n             ],\n             \"name\": \"PAYMENT\",\n             \"features\": [\n                 {\n                     \"status\": \"ACTIVE\",\n                     \"name\": \"ACCEPT_CARD\"\n                 },\n                 {\n                     \"status\": \"ACTIVE\",\n                     \"name\": \"ACCEPT_PAYPAL\"\n                 }\n             ]\n         }\n     ]\n }    ">
	//    1    2:areturn         
	}

	public final Map t()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Map b>
	//    2    4:areturn         
	}

	public final String u()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field String c>
	//    2    4:areturn         
	}

	public final String v()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field String d>
	//    2    4:areturn         
	}

	public final String w()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field String e>
	//    2    4:areturn         
	}

	private static final String a = "em";
	private Map b;
	private String c;
	private String d;
	private String e;

	static 
	{
	//    0    0:return          
	}
}
