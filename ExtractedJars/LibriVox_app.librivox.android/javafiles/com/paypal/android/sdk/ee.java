// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk;

import org.json.*;

// Referenced classes of package com.paypal.android.sdk:
//			eu, cj, cd, dl, 
//			dh, p, ca, ab

public final class ee extends eu
{

	public ee(ca ca, ab ab, String s, String s1, boolean flag, String s2, String s3, 
			String s4, String s5, JSONObject jsonobject, JSONObject jsonobject1)
	{
		super(cj.h, ca, ab, s);
	//    0    0:aload_0         
	//    1    1:getstatic       #24  <Field cj cj.h>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokespecial   #27  <Method void eu(cj, ca, ab, String)>
		c = flag;
	//    6   10:aload_0         
	//    7   11:iload           5
	//    8   13:putfield        #29  <Field boolean c>
		a = s4;
	//    9   16:aload_0         
	//   10   17:aload           8
	//   11   19:putfield        #31  <Field String a>
		b = s5;
	//   12   22:aload_0         
	//   13   23:aload           9
	//   14   25:putfield        #33  <Field String b>
		d = jsonobject;
	//   15   28:aload_0         
	//   16   29:aload           10
	//   17   31:putfield        #35  <Field JSONObject d>
		e = jsonobject1;
	//   18   34:aload_0         
	//   19   35:aload           11
	//   20   37:putfield        #37  <Field JSONObject e>
		a("PayPal-Request-Id", s1);
	//   21   40:aload_0         
	//   22   41:ldc1            #39  <String "PayPal-Request-Id">
	//   23   43:aload           4
	//   24   45:invokevirtual   #42  <Method void a(String, String)>
		if(cd.b(((CharSequence) (s2))))
	//*  25   48:aload           6
	//*  26   50:invokestatic    #47  <Method boolean cd.b(CharSequence)>
	//*  27   53:ifeq            64
			a("PayPal-Partner-Attribution-Id", s2);
	//   28   56:aload_0         
	//   29   57:ldc1            #49  <String "PayPal-Partner-Attribution-Id">
	//   30   59:aload           6
	//   31   61:invokevirtual   #42  <Method void a(String, String)>
		if(cd.b(((CharSequence) (s3))))
	//*  32   64:aload           7
	//*  33   66:invokestatic    #47  <Method boolean cd.b(CharSequence)>
	//*  34   69:ifeq            80
			a("PayPal-Client-Metadata-Id", s3);
	//   35   72:aload_0         
	//   36   73:ldc1            #51  <String "PayPal-Client-Metadata-Id">
	//   37   75:aload           7
	//   38   77:invokevirtual   #42  <Method void a(String, String)>
	//   39   80:return          
	}

	private static String a(JSONArray jsonarray)
	{
		if(jsonarray == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		JSONObject jsonobject;
		try
		{
			jsonarray = ((JSONArray) (jsonarray.getJSONObject(0)));
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #61  <Method JSONObject JSONArray.getJSONObject(int)>
	//    7   11:astore_0        
		}
	//*   8   12:aload_0         
	//*   9   13:ifnonnull       18
	//*  10   16:aconst_null     
	//*  11   17:areturn         
	//*  12   18:aload_0         
	//*  13   19:ldc1            #63  <String "related_resources">
	//*  14   21:invokevirtual   #69  <Method JSONArray JSONObject.getJSONArray(String)>
	//*  15   24:astore_0        
	//*  16   25:aload_0         
	//*  17   26:ifnonnull       31
	//*  18   29:aconst_null     
	//*  19   30:areturn         
	//*  20   31:aload_0         
	//*  21   32:iconst_0        
	//*  22   33:invokevirtual   #61  <Method JSONObject JSONArray.getJSONObject(int)>
	//*  23   36:astore_0        
	//*  24   37:aload_0         
	//*  25   38:ifnonnull       43
	//*  26   41:aconst_null     
	//*  27   42:areturn         
	//*  28   43:aload_0         
	//*  29   44:ldc1            #71  <String "authorization">
	//*  30   46:invokevirtual   #75  <Method JSONObject JSONObject.optJSONObject(String)>
	//*  31   49:astore_1        
	//*  32   50:aload_1         
	//*  33   51:ifnull          61
	//*  34   54:aload_1         
	//*  35   55:ldc1            #77  <String "id">
	//*  36   57:invokevirtual   #81  <Method String JSONObject.optString(String)>
	//*  37   60:areturn         
	//*  38   61:aload_0         
	//*  39   62:ldc1            #83  <String "order">
	//*  40   64:invokevirtual   #75  <Method JSONObject JSONObject.optJSONObject(String)>
	//*  41   67:astore_1        
	//*  42   68:aload_1         
	//*  43   69:ifnull          79
	//*  44   72:aload_1         
	//*  45   73:ldc1            #77  <String "id">
	//*  46   75:invokevirtual   #81  <Method String JSONObject.optString(String)>
	//*  47   78:areturn         
	//*  48   79:aload_0         
	//*  49   80:ldc1            #85  <String "sale">
	//*  50   82:invokevirtual   #75  <Method JSONObject JSONObject.optJSONObject(String)>
	//*  51   85:astore_0        
	//*  52   86:aload_0         
	//*  53   87:ifnull          99
	//*  54   90:aload_0         
	//*  55   91:ldc1            #77  <String "id">
	//*  56   93:invokevirtual   #81  <Method String JSONObject.optString(String)>
	//*  57   96:astore_0        
	//*  58   97:aload_0         
	//*  59   98:areturn         
	//*  60   99:aconst_null     
	//*  61  100:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONArray jsonarray)
	//*  62  101:astore_0        
		{
			return null;
	//   63  102:aconst_null     
	//   64  103:areturn         
		}
		if(jsonarray == null)
			return null;
		jsonarray = ((JSONObject) (jsonarray)).getJSONArray("related_resources");
		if(jsonarray == null)
			return null;
		jsonarray = ((JSONArray) (jsonarray.getJSONObject(0)));
		if(jsonarray == null)
			return null;
		jsonobject = ((JSONObject) (jsonarray)).optJSONObject("authorization");
		if(jsonobject == null)
			break MISSING_BLOCK_LABEL_61;
		return jsonobject.optString("id");
		jsonobject = ((JSONObject) (jsonarray)).optJSONObject("order");
		if(jsonobject == null)
			break MISSING_BLOCK_LABEL_79;
		return jsonobject.optString("id");
		jsonarray = ((JSONArray) (((JSONObject) (jsonarray)).optJSONObject("sale")));
		if(jsonarray == null)
			break MISSING_BLOCK_LABEL_99;
		jsonarray = ((JSONArray) (((JSONObject) (jsonarray)).optString("id")));
		return ((String) (jsonarray));
		return null;
	}

	public final String b()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #65  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #89  <Method void JSONObject()>
	//    3    7:astore_1        
		jsonobject.accumulate("payment_id", ((Object) (a)));
	//    4    8:aload_1         
	//    5    9:ldc1            #91  <String "payment_id">
	//    6   11:aload_0         
	//    7   12:getfield        #31  <Field String a>
	//    8   15:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//    9   18:pop             
		jsonobject.accumulate("session_id", ((Object) (b)));
	//   10   19:aload_1         
	//   11   20:ldc1            #97  <String "session_id">
	//   12   22:aload_0         
	//   13   23:getfield        #33  <Field String b>
	//   14   26:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   15   29:pop             
		JSONObject jsonobject1 = e;
	//   16   30:aload_0         
	//   17   31:getfield        #37  <Field JSONObject e>
	//   18   34:astore_2        
		if(jsonobject1 != null)
	//*  19   35:aload_2         
	//*  20   36:ifnull          47
			jsonobject.accumulate("funding_option", ((Object) (jsonobject1)));
	//   21   39:aload_1         
	//   22   40:ldc1            #99  <String "funding_option">
	//   23   42:aload_2         
	//   24   43:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   25   46:pop             
		jsonobject1 = d;
	//   26   47:aload_0         
	//   27   48:getfield        #35  <Field JSONObject d>
	//   28   51:astore_2        
		if(jsonobject1 != null)
	//*  29   52:aload_2         
	//*  30   53:ifnull          64
			jsonobject.accumulate("shipping_address", ((Object) (jsonobject1)));
	//   31   56:aload_1         
	//   32   57:ldc1            #101 <String "shipping_address">
	//   33   59:aload_2         
	//   34   60:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   35   63:pop             
		jsonobject1 = new JSONObject();
	//   36   64:new             #65  <Class JSONObject>
	//   37   67:dup             
	//   38   68:invokespecial   #89  <Method void JSONObject()>
	//   39   71:astore_2        
		jsonobject1.accumulate("device_info", ((Object) (cd.a(dl.a().toString()))));
	//   40   72:aload_2         
	//   41   73:ldc1            #103 <String "device_info">
	//   42   75:invokestatic    #108 <Method JSONObject dl.a()>
	//   43   78:invokevirtual   #111 <Method String JSONObject.toString()>
	//   44   81:invokestatic    #113 <Method String cd.a(String)>
	//   45   84:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   46   87:pop             
		jsonobject1.accumulate("app_info", ((Object) (cd.a(dh.a().toString()))));
	//   47   88:aload_2         
	//   48   89:ldc1            #115 <String "app_info">
	//   49   91:invokestatic    #118 <Method JSONObject dh.a()>
	//   50   94:invokevirtual   #111 <Method String JSONObject.toString()>
	//   51   97:invokestatic    #113 <Method String cd.a(String)>
	//   52  100:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   53  103:pop             
		jsonobject1.accumulate("risk_data", ((Object) (cd.a(p.a().c().toString()))));
	//   54  104:aload_2         
	//   55  105:ldc1            #120 <String "risk_data">
	//   56  107:invokestatic    #125 <Method p p.a()>
	//   57  110:invokevirtual   #127 <Method JSONObject p.c()>
	//   58  113:invokevirtual   #111 <Method String JSONObject.toString()>
	//   59  116:invokestatic    #113 <Method String cd.a(String)>
	//   60  119:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   61  122:pop             
		jsonobject.accumulate("client_info", ((Object) (jsonobject1)));
	//   62  123:aload_1         
	//   63  124:ldc1            #129 <String "client_info">
	//   64  126:aload_2         
	//   65  127:invokevirtual   #95  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   66  130:pop             
		return jsonobject.toString();
	//   67  131:aload_1         
	//   68  132:invokevirtual   #111 <Method String JSONObject.toString()>
	//   69  135:areturn         
	}

	public final void c()
	{
		JSONException jsonexception;
		JSONObject jsonobject = m();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #132 <Method JSONObject m()>
	//    2    4:astore_1        
		try
		{
			f = jsonobject.getJSONObject("payment");
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #134 <String "payment">
	//    6    9:invokevirtual   #136 <Method JSONObject JSONObject.getJSONObject(String)>
	//    7   12:putfield        #138 <Field JSONObject f>
			g = f.optString("state");
	//    8   15:aload_0         
	//    9   16:aload_0         
	//   10   17:getfield        #138 <Field JSONObject f>
	//   11   20:ldc1            #140 <String "state">
	//   12   22:invokevirtual   #81  <Method String JSONObject.optString(String)>
	//   13   25:putfield        #142 <Field String g>
			h = f.optString("create_time");
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #138 <Field JSONObject f>
	//   17   33:ldc1            #144 <String "create_time">
	//   18   35:invokevirtual   #81  <Method String JSONObject.optString(String)>
	//   19   38:putfield        #146 <Field String h>
			i = f.optString("intent");
	//   20   41:aload_0         
	//   21   42:aload_0         
	//   22   43:getfield        #138 <Field JSONObject f>
	//   23   46:ldc1            #148 <String "intent">
	//   24   48:invokevirtual   #81  <Method String JSONObject.optString(String)>
	//   25   51:putfield        #150 <Field String i>
			j = a(f.getJSONArray("transactions"));
	//   26   54:aload_0         
	//   27   55:aload_0         
	//   28   56:getfield        #138 <Field JSONObject f>
	//   29   59:ldc1            #152 <String "transactions">
	//   30   61:invokevirtual   #69  <Method JSONArray JSONObject.getJSONArray(String)>
	//   31   64:invokestatic    #154 <Method String a(JSONArray)>
	//   32   67:putfield        #156 <Field String j>
			return;
	//   33   70:return          
		}
	//*  34   71:aload_0         
	//*  35   72:invokevirtual   #158 <Method void d()>
	//*  36   75:return          
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
		{
			d();
		}
	//*  37   76:astore_1        
	//*  38   77:goto            71
	}

	public final void d()
	{
		b(m());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #132 <Method JSONObject m()>
	//    3    5:invokevirtual   #161 <Method void b(JSONObject)>
	//    4    8:return          
	}

	public final String e()
	{
		return "{     \"payment\": {         \"id\": \"PAY-6PU626847B294842SKPEWXHY\",         \"transactions\": [             {                 \"amount\": {                     \"total\": \"2.85\",                     \"details\": {                         \"subtotal\": \"2.85\"                     },                     \"currency\": \"USD\"                 },                 \"description\": \"Awesome Sauce\",                 \"related_resources\": [                     {                         \"sale\": {                             \"amount\": {                                 \"total\": \"2.85\",                                 \"currency\": \"USD\"                             },                             \"id\": \"5LR21373K59921925\",                             \"parent_payment\": \"PAY-6PU626847B294842SKPEWXHY\",                             \"update_time\": \"2014-07-18T18:47:06Z\",                             \"state\": \"completed\",                             \"create_time\": \"2014-07-18T18:46:55Z\",                             \"links\": [                                 {                                     \"method\": \"GET\",                                     \"rel\": \"self\",                                     \"href\": \"https://www.stage2std019.stage.\"                                 },                                 {                                     \"method\": \"POST\",                                     \"rel\": \"refund\",                                     \"href\": \"https://www.stage2std019.stage. \"                                 },                                 {                                     \"method\": \"GET\",                                     \"rel\": \"parent_payment\",                                     \"href\": \"https://www.stage2std019.stage.PEWXHY \"                                 }                             ]                         }                     }                 ]             }         ],         \"update_time\": \"2014-07-18T18:47:06Z\",         \"payer\": {             \"payer_info\": {                 \"shipping_address\": {                                      }             },             \"payment_method\": \"paypal\"         },         \"state\": \"approved\",         \"create_time\": \"2014-07-18T18:46:55Z\",         \"links\": [             {                 \"method\": \"GET\",                 \"rel\": \"self\",                 \"href\": \"https://www.stage2std019.stage.paypal.\"             }         ],         \"intent\": \"sale\"     } } ";
	//    0    0:ldc1            #163 <String "{     \"payment\": {         \"id\": \"PAY-6PU626847B294842SKPEWXHY\",         \"transactions\": [             {                 \"amount\": {                     \"total\": \"2.85\",                     \"details\": {                         \"subtotal\": \"2.85\"                     },                     \"currency\": \"USD\"                 },                 \"description\": \"Awesome Sauce\",                 \"related_resources\": [                     {                         \"sale\": {                             \"amount\": {                                 \"total\": \"2.85\",                                 \"currency\": \"USD\"                             },                             \"id\": \"5LR21373K59921925\",                             \"parent_payment\": \"PAY-6PU626847B294842SKPEWXHY\",                             \"update_time\": \"2014-07-18T18:47:06Z\",                             \"state\": \"completed\",                             \"create_time\": \"2014-07-18T18:46:55Z\",                             \"links\": [                                 {                                     \"method\": \"GET\",                                     \"rel\": \"self\",                                     \"href\": \"https://www.stage2std019.stage.\"                                 },                                 {                                     \"method\": \"POST\",                                     \"rel\": \"refund\",                                     \"href\": \"https://www.stage2std019.stage. \"                                 },                                 {                                     \"method\": \"GET\",                                     \"rel\": \"parent_payment\",                                     \"href\": \"https://www.stage2std019.stage.PEWXHY \"                                 }                             ]                         }                     }                 ]             }         ],         \"update_time\": \"2014-07-18T18:47:06Z\",         \"payer\": {             \"payer_info\": {                 \"shipping_address\": {                                      }             },             \"payment_method\": \"paypal\"         },         \"state\": \"approved\",         \"create_time\": \"2014-07-18T18:46:55Z\",         \"links\": [             {                 \"method\": \"GET\",                 \"rel\": \"self\",                 \"href\": \"https://www.stage2std019.stage.paypal.\"             }         ],         \"intent\": \"sale\"     } } ">
	//    1    2:areturn         
	}

	public final void l()
	{
		p.a().f();
	//    0    0:invokestatic    #125 <Method p p.a()>
	//    1    3:invokevirtual   #166 <Method String p.f()>
	//    2    6:pop             
	//    3    7:return          
	}

	public final String t()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String a>
	//    2    4:areturn         
	}

	public final boolean u()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field boolean c>
	//    2    4:ireturn         
	}

	public final String v()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field String g>
	//    2    4:areturn         
	}

	public final String w()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field String h>
	//    2    4:areturn         
	}

	public final String x()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field String i>
	//    2    4:areturn         
	}

	public final String y()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field String j>
	//    2    4:areturn         
	}

	private final String a;
	private final String b;
	private final boolean c;
	private final JSONObject d;
	private final JSONObject e;
	private JSONObject f;
	private String g;
	private String h;
	private String i;
	private String j;
}
