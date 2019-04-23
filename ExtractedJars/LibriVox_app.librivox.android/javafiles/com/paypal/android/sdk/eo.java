// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk;

import android.os.Build;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk:
//			eq, cj, cd, p, 
//			ep, ev, ca, ab

public final class eo extends eq
{

	public eo(ca ca, ab ab, String s, String s1, ep ep1, String s2, String s3, 
			boolean flag, String s4, boolean flag1, String s5)
	{
		this(ca, ab, s, s1, ep1, flag, s4, flag1, s5);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:iload           8
	//    7   10:aload           9
	//    8   12:iload           10
	//    9   14:aload           11
	//   10   16:invokespecial   #24  <Method void eo(ca, ab, String, String, ep, boolean, String, boolean, String)>
		m = s2;
	//   11   19:aload_0         
	//   12   20:aload           6
	//   13   22:putfield        #26  <Field String m>
		n = s3;
	//   14   25:aload_0         
	//   15   26:aload           7
	//   16   28:putfield        #28  <Field String n>
	//   17   31:return          
	}

	public eo(ca ca, ab ab, String s, String s1, ep ep1, boolean flag, String s2, 
			boolean flag1, String s3)
	{
		super(cj.c, ca, ab, b(s, s1));
	//    0    0:aload_0         
	//    1    1:getstatic       #34  <Field cj cj.c>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokestatic    #37  <Method String b(String, String)>
	//    7   12:invokespecial   #40  <Method void eq(cj, ca, ab, String)>
		a = ep1;
	//    8   15:aload_0         
	//    9   16:aload           5
	//   10   18:putfield        #42  <Field ep a>
		b = flag;
	//   11   21:aload_0         
	//   12   22:iload           6
	//   13   24:putfield        #44  <Field boolean b>
		j = s2;
	//   14   27:aload_0         
	//   15   28:aload           7
	//   16   30:putfield        #46  <Field String j>
		k = flag1;
	//   17   33:aload_0         
	//   18   34:iload           8
	//   19   36:putfield        #48  <Field boolean k>
		l = s3;
	//   20   39:aload_0         
	//   21   40:aload           9
	//   22   42:putfield        #50  <Field String l>
	//   23   45:return          
	}

	public final String b()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #53  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void HashMap()>
	//    3    7:astore_3        
		hashmap.put("response_type", ((Object) (j)));
	//    4    8:aload_3         
	//    5    9:ldc1            #58  <String "response_type">
	//    6   11:aload_0         
	//    7   12:getfield        #46  <Field String j>
	//    8   15:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//    9   18:pop             
		String s = j;
	//   10   19:aload_0         
	//   11   20:getfield        #46  <Field String j>
	//   12   23:astore_1        
		if(s != null && s.equals("token"))
	//*  13   24:aload_1         
	//*  14   25:ifnull          67
	//*  15   28:aload_1         
	//*  16   29:ldc1            #64  <String "token">
	//*  17   31:invokevirtual   #70  <Method boolean String.equals(Object)>
	//*  18   34:ifeq            67
		{
			hashmap.put("scope_consent_context", "access_token");
	//   19   37:aload_3         
	//   20   38:ldc1            #72  <String "scope_consent_context">
	//   21   40:ldc1            #74  <String "access_token">
	//   22   42:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//   23   45:pop             
			if(!cd.a(((CharSequence) (l))))
	//*  24   46:aload_0         
	//*  25   47:getfield        #50  <Field String l>
	//*  26   50:invokestatic    #79  <Method boolean cd.a(CharSequence)>
	//*  27   53:ifne            67
				hashmap.put("scope", ((Object) (l)));
	//   28   56:aload_3         
	//   29   57:ldc1            #81  <String "scope">
	//   30   59:aload_0         
	//   31   60:getfield        #50  <Field String l>
	//   32   63:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//   33   66:pop             
		}
		hashmap.put("risk_data", ((Object) (cd.a(p.a().c().toString()))));
	//   34   67:aload_3         
	//   35   68:ldc1            #83  <String "risk_data">
	//   36   70:invokestatic    #88  <Method p p.a()>
	//   37   73:invokevirtual   #91  <Method JSONObject p.c()>
	//   38   76:invokevirtual   #96  <Method String JSONObject.toString()>
	//   39   79:invokestatic    #99  <Method String cd.a(String)>
	//   40   82:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//   41   85:pop             
		if(m != null)
	//*  42   86:aload_0         
	//*  43   87:getfield        #26  <Field String m>
	//*  44   90:ifnull          155
		{
			hashmap.put("grant_type", "urn:paypal:params:oauth2:grant_type:otp");
	//   45   93:aload_3         
	//   46   94:ldc1            #101 <String "grant_type">
	//   47   96:ldc1            #103 <String "urn:paypal:params:oauth2:grant_type:otp">
	//   48   98:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//   49  101:pop             
			hashmap.put("nonce", ((Object) (n)));
	//   50  102:aload_3         
	//   51  103:ldc1            #105 <String "nonce">
	//   52  105:aload_0         
	//   53  106:getfield        #28  <Field String n>
	//   54  109:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//   55  112:pop             
			JSONObject jsonobject = new JSONObject();
	//   56  113:new             #93  <Class JSONObject>
	//   57  116:dup             
	//   58  117:invokespecial   #106 <Method void JSONObject()>
	//   59  120:astore_1        
			jsonobject.accumulate("token_identifier", "otp");
	//   60  121:aload_1         
	//   61  122:ldc1            #108 <String "token_identifier">
	//   62  124:ldc1            #110 <String "otp">
	//   63  126:invokevirtual   #114 <Method JSONObject JSONObject.accumulate(String, Object)>
	//   64  129:pop             
			jsonobject.accumulate("token_value", ((Object) (m)));
	//   65  130:aload_1         
	//   66  131:ldc1            #116 <String "token_value">
	//   67  133:aload_0         
	//   68  134:getfield        #26  <Field String m>
	//   69  137:invokevirtual   #114 <Method JSONObject JSONObject.accumulate(String, Object)>
	//   70  140:pop             
			hashmap.put("2fa_token_claims", ((Object) (a(jsonobject))));
	//   71  141:aload_3         
	//   72  142:ldc1            #118 <String "2fa_token_claims">
	//   73  144:aload_1         
	//   74  145:invokestatic    #121 <Method String a(JSONObject)>
	//   75  148:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//   76  151:pop             
		} else
	//*  77  152:goto            307
		{
			Object obj;
			String s1;
			if(a.a())
	//*  78  155:aload_0         
	//*  79  156:getfield        #42  <Field ep a>
	//*  80  159:invokevirtual   #126 <Method boolean ep.a()>
	//*  81  162:ifeq            208
			{
				hashmap.put("grant_type", "password");
	//   82  165:aload_3         
	//   83  166:ldc1            #101 <String "grant_type">
	//   84  168:ldc1            #128 <String "password">
	//   85  170:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//   86  173:pop             
				hashmap.put("email", ((Object) (cd.a(a.b()))));
	//   87  174:aload_3         
	//   88  175:ldc1            #130 <String "email">
	//   89  177:aload_0         
	//   90  178:getfield        #42  <Field ep a>
	//   91  181:invokevirtual   #132 <Method String ep.b()>
	//   92  184:invokestatic    #99  <Method String cd.a(String)>
	//   93  187:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//   94  190:pop             
				obj = "password";
	//   95  191:ldc1            #128 <String "password">
	//   96  193:astore_1        
				s1 = cd.a(a.c());
	//   97  194:aload_0         
	//   98  195:getfield        #42  <Field ep a>
	//   99  198:invokevirtual   #134 <Method String ep.c()>
	//  100  201:invokestatic    #99  <Method String cd.a(String)>
	//  101  204:astore_2        
			} else
	//* 102  205:goto            300
			{
				hashmap.put("grant_type", "password");
	//  103  208:aload_3         
	//  104  209:ldc1            #101 <String "grant_type">
	//  105  211:ldc1            #128 <String "password">
	//  106  213:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//  107  216:pop             
				a.d().c();
	//  108  217:aload_0         
	//  109  218:getfield        #42  <Field ep a>
	//  110  221:invokevirtual   #137 <Method ev ep.d()>
	//  111  224:invokevirtual   #140 <Method String ev.c()>
	//  112  227:pop             
				obj = ((Object) (new StringBuilder("+")));
	//  113  228:new             #142 <Class StringBuilder>
	//  114  231:dup             
	//  115  232:ldc1            #144 <String "+">
	//  116  234:invokespecial   #147 <Method void StringBuilder(String)>
	//  117  237:astore_1        
				((StringBuilder) (obj)).append(a.d().c());
	//  118  238:aload_1         
	//  119  239:aload_0         
	//  120  240:getfield        #42  <Field ep a>
	//  121  243:invokevirtual   #137 <Method ev ep.d()>
	//  122  246:invokevirtual   #140 <Method String ev.c()>
	//  123  249:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  124  252:pop             
				((StringBuilder) (obj)).append(" ");
	//  125  253:aload_1         
	//  126  254:ldc1            #153 <String " ">
	//  127  256:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  128  259:pop             
				((StringBuilder) (obj)).append(a.d().a());
	//  129  260:aload_1         
	//  130  261:aload_0         
	//  131  262:getfield        #42  <Field ep a>
	//  132  265:invokevirtual   #137 <Method ev ep.d()>
	//  133  268:invokevirtual   #155 <Method String ev.a()>
	//  134  271:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  135  274:pop             
				hashmap.put("phone", ((Object) (cd.a(((StringBuilder) (obj)).toString()))));
	//  136  275:aload_3         
	//  137  276:ldc1            #157 <String "phone">
	//  138  278:aload_1         
	//  139  279:invokevirtual   #158 <Method String StringBuilder.toString()>
	//  140  282:invokestatic    #99  <Method String cd.a(String)>
	//  141  285:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//  142  288:pop             
				obj = "pin";
	//  143  289:ldc1            #160 <String "pin">
	//  144  291:astore_1        
				s1 = a.e();
	//  145  292:aload_0         
	//  146  293:getfield        #42  <Field ep a>
	//  147  296:invokevirtual   #162 <Method String ep.e()>
	//  148  299:astore_2        
			}
			hashmap.put(obj, ((Object) (s1)));
	//  149  300:aload_3         
	//  150  301:aload_1         
	//  151  302:aload_2         
	//  152  303:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//  153  306:pop             
		}
		hashmap.put("device_name", ((Object) (cd.a(Build.DEVICE))));
	//  154  307:aload_3         
	//  155  308:ldc1            #164 <String "device_name">
	//  156  310:getstatic       #169 <Field String Build.DEVICE>
	//  157  313:invokestatic    #99  <Method String cd.a(String)>
	//  158  316:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//  159  319:pop             
		hashmap.put("redirect_uri", ((Object) (cd.a("urn:ietf:wg:oauth:2.0:oob"))));
	//  160  320:aload_3         
	//  161  321:ldc1            #171 <String "redirect_uri">
	//  162  323:ldc1            #173 <String "urn:ietf:wg:oauth:2.0:oob">
	//  163  325:invokestatic    #99  <Method String cd.a(String)>
	//  164  328:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//  165  331:pop             
		return cd.a(((java.util.Map) (hashmap)));
	//  166  332:aload_3         
	//  167  333:invokestatic    #176 <Method String cd.a(java.util.Map)>
	//  168  336:areturn         
	}

	public final void c()
	{
		JSONObject jsonobject = m();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #180 <Method JSONObject m()>
	//    2    4:astore_1        
		jsonobject.getString("scope");
	//    3    5:aload_1         
	//    4    6:ldc1            #81  <String "scope">
	//    5    8:invokevirtual   #183 <Method String JSONObject.getString(String)>
	//    6   11:pop             
		e = jsonobject.getString("scope");
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:ldc1            #81  <String "scope">
	//   10   16:invokevirtual   #183 <Method String JSONObject.getString(String)>
	//   11   19:putfield        #185 <Field String e>
		if(k)
	//*  12   22:aload_0         
	//*  13   23:getfield        #48  <Field boolean k>
	//*  14   26:ifeq            50
		{
			c = jsonobject.getString("code");
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:ldc1            #187 <String "code">
	//   18   33:invokevirtual   #183 <Method String JSONObject.getString(String)>
	//   19   36:putfield        #189 <Field String c>
			g = jsonobject.getString("nonce");
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:ldc1            #105 <String "nonce">
	//   23   43:invokevirtual   #183 <Method String JSONObject.getString(String)>
	//   24   46:putfield        #192 <Field String g>
			return;
	//   25   49:return          
		}
		JSONException jsonexception;
		try
		{
			d = jsonobject.getString("access_token");
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:ldc1            #74  <String "access_token">
	//   29   54:invokevirtual   #183 <Method String JSONObject.getString(String)>
	//   30   57:putfield        #194 <Field String d>
			f = jsonobject.getLong("expires_in");
	//   31   60:aload_0         
	//   32   61:aload_1         
	//   33   62:ldc1            #196 <String "expires_in">
	//   34   64:invokevirtual   #200 <Method long JSONObject.getLong(String)>
	//   35   67:putfield        #202 <Field long f>
			return;
	//   36   70:return          
		}
	//*  37   71:aload_0         
	//*  38   72:aload_1         
	//*  39   73:invokevirtual   #205 <Method void b(JSONObject)>
	//*  40   76:return          
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
		{
			b(jsonobject);
		}
		return;
	//*  41   77:astore_2        
	//*  42   78:goto            71
	}

	public final void d()
	{
		b(m());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #180 <Method JSONObject m()>
	//    3    5:invokevirtual   #205 <Method void b(JSONObject)>
	//    4    8:return          
	}

	public final String e()
	{
		return "{ \"access_token\": \"mock_access_token\", \"code\": \"mock_code_EJhi9jOPswug9TDOv93qg4Y28xIlqPDpAoqd7biDLpeGCPvORHjP1Fh4CbFPgKMGCHejdDwe9w1uDWnjPCp1lkaFBjVmjvjpFtnr6z1YeBbmfZYqa9faQT_71dmgZhMIFVkbi4yO7hk0LBHXt_wtdsw\", \"scope\": \"https://api.paypal.com/v1/payments/.*\", \"nonce\": \"mock_nonce\", \"token_type\": \"Bearer\",\"expires_in\":28800,\"visitor_id\":\"zVxjDBTRRNfYXdOb19-lcTblxm-6bzXGvSlP76ZiHOudKaAvoxrW8Cg5pA6EjIPpiz4zlw\" }";
	//    0    0:ldc1            #207 <String "{ \"access_token\": \"mock_access_token\", \"code\": \"mock_code_EJhi9jOPswug9TDOv93qg4Y28xIlqPDpAoqd7biDLpeGCPvORHjP1Fh4CbFPgKMGCHejdDwe9w1uDWnjPCp1lkaFBjVmjvjpFtnr6z1YeBbmfZYqa9faQT_71dmgZhMIFVkbi4yO7hk0LBHXt_wtdsw\", \"scope\": \"https://api.paypal.com/v1/payments/.*\", \"nonce\": \"mock_nonce\", \"token_type\": \"Bearer\",\"expires_in\":28800,\"visitor_id\":\"zVxjDBTRRNfYXdOb19-lcTblxm-6bzXGvSlP76ZiHOudKaAvoxrW8Cg5pA6EjIPpiz4zlw\" }">
	//    1    2:areturn         
	}

	public final boolean t()
	{
		return m != null;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String m>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public ep a;
	public boolean b;
	public String c;
	public String d;
	public String e;
	public long f;
	private String j;
	private final boolean k;
	private final String l;
	private String m;
	private String n;
}
