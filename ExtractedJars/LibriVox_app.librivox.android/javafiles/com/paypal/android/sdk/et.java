// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk;

import java.math.BigDecimal;
import java.util.*;
import org.json.*;

// Referenced classes of package com.paypal.android.sdk:
//			eu, cd, er, es, 
//			cj, ca, ab

public abstract class et extends eu
{

	public et(cj cj, ca ca, ab ab, String s, String s1, String s2, er er1, 
			Map map, es aes[], String s3, boolean flag, String s4, String s5, String s6)
	{
		super(cj, ca, ab, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #25  <Method void eu(cj, ca, ab, String)>
		a = s2;
	//    6    9:aload_0         
	//    7   10:aload           6
	//    8   12:putfield        #27  <Field String a>
		b = er1;
	//    9   15:aload_0         
	//   10   16:aload           7
	//   11   18:putfield        #29  <Field er b>
		c = map;
	//   12   21:aload_0         
	//   13   22:aload           8
	//   14   24:putfield        #31  <Field Map c>
		d = aes;
	//   15   27:aload_0         
	//   16   28:aload           9
	//   17   30:putfield        #33  <Field es[] d>
		e = s3;
	//   18   33:aload_0         
	//   19   34:aload           10
	//   20   36:putfield        #35  <Field String e>
		f = flag;
	//   21   39:aload_0         
	//   22   40:iload           11
	//   23   42:putfield        #37  <Field boolean f>
		g = s6;
	//   24   45:aload_0         
	//   25   46:aload           14
	//   26   48:putfield        #39  <Field String g>
		if(cd.a(((CharSequence) (g))))
	//*  27   51:aload_0         
	//*  28   52:getfield        #39  <Field String g>
	//*  29   55:invokestatic    #44  <Method boolean cd.a(CharSequence)>
	//*  30   58:ifeq            67
			g = "sale";
	//   31   61:aload_0         
	//   32   62:ldc1            #46  <String "sale">
	//   33   64:putfield        #39  <Field String g>
		g = g.toLowerCase(Locale.US);
	//   34   67:aload_0         
	//   35   68:aload_0         
	//   36   69:getfield        #39  <Field String g>
	//   37   72:getstatic       #52  <Field Locale Locale.US>
	//   38   75:invokevirtual   #58  <Method String String.toLowerCase(Locale)>
	//   39   78:putfield        #39  <Field String g>
		a("PayPal-Request-Id", s1);
	//   40   81:aload_0         
	//   41   82:ldc1            #60  <String "PayPal-Request-Id">
	//   42   84:aload           5
	//   43   86:invokevirtual   #63  <Method void a(String, String)>
		if(cd.b(((CharSequence) (s4))))
	//*  44   89:aload           12
	//*  45   91:invokestatic    #65  <Method boolean cd.b(CharSequence)>
	//*  46   94:ifeq            105
			a("PayPal-Partner-Attribution-Id", s4);
	//   47   97:aload_0         
	//   48   98:ldc1            #67  <String "PayPal-Partner-Attribution-Id">
	//   49  100:aload           12
	//   50  102:invokevirtual   #63  <Method void a(String, String)>
		if(cd.b(((CharSequence) (s5))))
	//*  51  105:aload           13
	//*  52  107:invokestatic    #65  <Method boolean cd.b(CharSequence)>
	//*  53  110:ifeq            121
			a("PayPal-Client-Metadata-Id", s5);
	//   54  113:aload_0         
	//   55  114:ldc1            #69  <String "PayPal-Client-Metadata-Id">
	//   56  116:aload           13
	//   57  118:invokevirtual   #63  <Method void a(String, String)>
	//   58  121:return          
	}

	private static String a(JSONArray jsonarray)
	{
		if(jsonarray == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		try
		{
			jsonarray = ((JSONArray) (jsonarray.getJSONObject(0)));
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #79  <Method JSONObject JSONArray.getJSONObject(int)>
	//    7   11:astore_0        
		}
	//*   8   12:aload_0         
	//*   9   13:ifnonnull       18
	//*  10   16:aconst_null     
	//*  11   17:areturn         
	//*  12   18:aload_0         
	//*  13   19:ldc1            #81  <String "related_resources">
	//*  14   21:invokevirtual   #87  <Method JSONArray JSONObject.getJSONArray(String)>
	//*  15   24:astore_0        
	//*  16   25:aload_0         
	//*  17   26:ifnonnull       31
	//*  18   29:aconst_null     
	//*  19   30:areturn         
	//*  20   31:aload_0         
	//*  21   32:iconst_0        
	//*  22   33:invokevirtual   #79  <Method JSONObject JSONArray.getJSONObject(int)>
	//*  23   36:astore_0        
	//*  24   37:aload_0         
	//*  25   38:ifnonnull       43
	//*  26   41:aconst_null     
	//*  27   42:areturn         
	//*  28   43:aload_0         
	//*  29   44:ldc1            #89  <String "authorization">
	//*  30   46:invokevirtual   #92  <Method JSONObject JSONObject.getJSONObject(String)>
	//*  31   49:astore_0        
	//*  32   50:aload_0         
	//*  33   51:ifnonnull       56
	//*  34   54:aconst_null     
	//*  35   55:areturn         
	//*  36   56:aload_0         
	//*  37   57:ldc1            #94  <String "id">
	//*  38   59:invokevirtual   #98  <Method String JSONObject.optString(String)>
	//*  39   62:astore_0        
	//*  40   63:aload_0         
	//*  41   64:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONArray jsonarray)
	//*  42   65:astore_0        
		{
			return null;
	//   43   66:aconst_null     
	//   44   67:areturn         
		}
		if(jsonarray == null)
			return null;
		jsonarray = ((JSONObject) (jsonarray)).getJSONArray("related_resources");
		if(jsonarray == null)
			return null;
		jsonarray = ((JSONArray) (jsonarray.getJSONObject(0)));
		if(jsonarray == null)
			return null;
		jsonarray = ((JSONArray) (((JSONObject) (jsonarray)).getJSONObject("authorization")));
		if(jsonarray == null)
			return null;
		jsonarray = ((JSONArray) (((JSONObject) (jsonarray)).optString("id")));
		return ((String) (jsonarray));
	}

	public final boolean A()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean f>
	//    2    4:ireturn         
	}

	protected final er B()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field er b>
	//    2    4:areturn         
	}

	public final String C()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field String h>
	//    2    4:areturn         
	}

	public final String D()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field String i>
	//    2    4:areturn         
	}

	public final String E()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String g>
	//    2    4:areturn         
	}

	public final String F()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field String j>
	//    2    4:areturn         
	}

	public final String G()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field String k>
	//    2    4:areturn         
	}

	abstract void a(JSONObject jsonobject);

	public final String b()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #83  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void JSONObject()>
	//    3    7:astore_3        
		jsonobject.accumulate("intent", ((Object) (g)));
	//    4    8:aload_3         
	//    5    9:ldc1            #122 <String "intent">
	//    6   11:aload_0         
	//    7   12:getfield        #39  <Field String g>
	//    8   15:invokevirtual   #126 <Method JSONObject JSONObject.accumulate(String, Object)>
	//    9   18:pop             
		Object obj = ((Object) (new JSONObject()));
	//   10   19:new             #83  <Class JSONObject>
	//   11   22:dup             
	//   12   23:invokespecial   #120 <Method void JSONObject()>
	//   13   26:astore_1        
		Object obj1 = ((Object) (y()));
	//   14   27:aload_0         
	//   15   28:invokevirtual   #130 <Method JSONArray y()>
	//   16   31:astore_2        
		if(obj1 != null)
	//*  17   32:aload_2         
	//*  18   33:ifnull          44
			((JSONObject) (obj)).accumulate("funding_instruments", obj1);
	//   19   36:aload_1         
	//   20   37:ldc1            #132 <String "funding_instruments">
	//   21   39:aload_2         
	//   22   40:invokevirtual   #126 <Method JSONObject JSONObject.accumulate(String, Object)>
	//   23   43:pop             
		((JSONObject) (obj)).accumulate("payment_method", ((Object) (z())));
	//   24   44:aload_1         
	//   25   45:ldc1            #134 <String "payment_method">
	//   26   47:aload_0         
	//   27   48:invokevirtual   #137 <Method String z()>
	//   28   51:invokevirtual   #126 <Method JSONObject JSONObject.accumulate(String, Object)>
	//   29   54:pop             
		jsonobject.accumulate("payer", obj);
	//   30   55:aload_3         
	//   31   56:ldc1            #139 <String "payer">
	//   32   58:aload_1         
	//   33   59:invokevirtual   #126 <Method JSONObject JSONObject.accumulate(String, Object)>
	//   34   62:pop             
		obj = ((Object) (b));
	//   35   63:aload_0         
	//   36   64:getfield        #29  <Field er b>
	//   37   67:astore_1        
		JSONObject jsonobject1 = new JSONObject();
	//   38   68:new             #83  <Class JSONObject>
	//   39   71:dup             
	//   40   72:invokespecial   #120 <Method void JSONObject()>
	//   41   75:astore          4
		jsonobject1.accumulate("currency", ((Object) (((er) (obj)).b().getCurrencyCode())));
	//   42   77:aload           4
	//   43   79:ldc1            #141 <String "currency">
	//   44   81:aload_1         
	//   45   82:invokevirtual   #146 <Method Currency er.b()>
	//   46   85:invokevirtual   #151 <Method String Currency.getCurrencyCode()>
	//   47   88:invokevirtual   #126 <Method JSONObject JSONObject.accumulate(String, Object)>
	//   48   91:pop             
		jsonobject1.accumulate("total", ((Object) (((er) (obj)).a().toPlainString())));
	//   49   92:aload           4
	//   50   94:ldc1            #153 <String "total">
	//   51   96:aload_1         
	//   52   97:invokevirtual   #156 <Method BigDecimal er.a()>
	//   53  100:invokevirtual   #161 <Method String BigDecimal.toPlainString()>
	//   54  103:invokevirtual   #126 <Method JSONObject JSONObject.accumulate(String, Object)>
	//   55  106:pop             
		obj = ((Object) (c));
	//   56  107:aload_0         
	//   57  108:getfield        #31  <Field Map c>
	//   58  111:astore_1        
		if(obj != null && !((Map) (obj)).isEmpty())
	//*  59  112:aload_1         
	//*  60  113:ifnull          268
	//*  61  116:aload_1         
	//*  62  117:invokeinterface #166 <Method boolean Map.isEmpty()>
	//*  63  122:ifne            268
		{
			obj = ((Object) (c));
	//   64  125:aload_0         
	//   65  126:getfield        #31  <Field Map c>
	//   66  129:astore_1        
			if(obj != null && !((Map) (obj)).isEmpty())
	//*  67  130:aload_1         
	//*  68  131:ifnull          257
	//*  69  134:aload_1         
	//*  70  135:invokeinterface #166 <Method boolean Map.isEmpty()>
	//*  71  140:ifeq            146
	//*  72  143:goto            257
			{
				obj1 = ((Object) (new JSONObject()));
	//   73  146:new             #83  <Class JSONObject>
	//   74  149:dup             
	//   75  150:invokespecial   #120 <Method void JSONObject()>
	//   76  153:astore_2        
				if(c.containsKey("shipping"))
	//*  77  154:aload_0         
	//*  78  155:getfield        #31  <Field Map c>
	//*  79  158:ldc1            #168 <String "shipping">
	//*  80  160:invokeinterface #172 <Method boolean Map.containsKey(Object)>
	//*  81  165:ifeq            186
					((JSONObject) (obj1)).accumulate("shipping", c.get("shipping"));
	//   82  168:aload_2         
	//   83  169:ldc1            #168 <String "shipping">
	//   84  171:aload_0         
	//   85  172:getfield        #31  <Field Map c>
	//   86  175:ldc1            #168 <String "shipping">
	//   87  177:invokeinterface #176 <Method Object Map.get(Object)>
	//   88  182:invokevirtual   #126 <Method JSONObject JSONObject.accumulate(String, Object)>
	//   89  185:pop             
				if(c.containsKey("subtotal"))
	//*  90  186:aload_0         
	//*  91  187:getfield        #31  <Field Map c>
	//*  92  190:ldc1            #178 <String "subtotal">
	//*  93  192:invokeinterface #172 <Method boolean Map.containsKey(Object)>
	//*  94  197:ifeq            218
					((JSONObject) (obj1)).accumulate("subtotal", c.get("subtotal"));
	//   95  200:aload_2         
	//   96  201:ldc1            #178 <String "subtotal">
	//   97  203:aload_0         
	//   98  204:getfield        #31  <Field Map c>
	//   99  207:ldc1            #178 <String "subtotal">
	//  100  209:invokeinterface #176 <Method Object Map.get(Object)>
	//  101  214:invokevirtual   #126 <Method JSONObject JSONObject.accumulate(String, Object)>
	//  102  217:pop             
				obj = obj1;
	//  103  218:aload_2         
	//  104  219:astore_1        
				if(c.containsKey("tax"))
	//* 105  220:aload_0         
	//* 106  221:getfield        #31  <Field Map c>
	//* 107  224:ldc1            #180 <String "tax">
	//* 108  226:invokeinterface #172 <Method boolean Map.containsKey(Object)>
	//* 109  231:ifeq            259
				{
					((JSONObject) (obj1)).accumulate("tax", c.get("tax"));
	//  110  234:aload_2         
	//  111  235:ldc1            #180 <String "tax">
	//  112  237:aload_0         
	//  113  238:getfield        #31  <Field Map c>
	//  114  241:ldc1            #180 <String "tax">
	//  115  243:invokeinterface #176 <Method Object Map.get(Object)>
	//  116  248:invokevirtual   #126 <Method JSONObject JSONObject.accumulate(String, Object)>
	//  117  251:pop             
					obj = obj1;
	//  118  252:aload_2         
	//  119  253:astore_1        
				}
			} else
	//* 120  254:goto            259
			{
				obj = null;
	//  121  257:aconst_null     
	//  122  258:astore_1        
			}
			jsonobject1.accumulate("details", obj);
	//  123  259:aload           4
	//  124  261:ldc1            #182 <String "details">
	//  125  263:aload_1         
	//  126  264:invokevirtual   #126 <Method JSONObject JSONObject.accumulate(String, Object)>
	//  127  267:pop             
		}
		obj = ((Object) (new JSONObject()));
	//  128  268:new             #83  <Class JSONObject>
	//  129  271:dup             
	//  130  272:invokespecial   #120 <Method void JSONObject()>
	//  131  275:astore_1        
		((JSONObject) (obj)).accumulate("amount", ((Object) (jsonobject1)));
	//  132  276:aload_1         
	//  133  277:ldc1            #184 <String "amount">
	//  134  279:aload           4
	//  135  281:invokevirtual   #126 <Method JSONObject JSONObject.accumulate(String, Object)>
	//  136  284:pop             
		((JSONObject) (obj)).accumulate("description", ((Object) (e)));
	//  137  285:aload_1         
	//  138  286:ldc1            #186 <String "description">
	//  139  288:aload_0         
	//  140  289:getfield        #35  <Field String e>
	//  141  292:invokevirtual   #126 <Method JSONObject JSONObject.accumulate(String, Object)>
	//  142  295:pop             
		es aes[] = d;
	//  143  296:aload_0         
	//  144  297:getfield        #33  <Field es[] d>
	//  145  300:astore_2        
		if(aes != null && aes.length > 0)
	//* 146  301:aload_2         
	//* 147  302:ifnull          340
	//* 148  305:aload_2         
	//* 149  306:arraylength     
	//* 150  307:ifle            340
		{
			aes = ((es []) (new JSONObject()));
	//  151  310:new             #83  <Class JSONObject>
	//  152  313:dup             
	//  153  314:invokespecial   #120 <Method void JSONObject()>
	//  154  317:astore_2        
			((JSONObject) (aes)).accumulate("items", ((Object) (es.a(d))));
	//  155  318:aload_2         
	//  156  319:ldc1            #188 <String "items">
	//  157  321:aload_0         
	//  158  322:getfield        #33  <Field es[] d>
	//  159  325:invokestatic    #193 <Method JSONArray es.a(es[])>
	//  160  328:invokevirtual   #126 <Method JSONObject JSONObject.accumulate(String, Object)>
	//  161  331:pop             
			((JSONObject) (obj)).accumulate("item_list", ((Object) (aes)));
	//  162  332:aload_1         
	//  163  333:ldc1            #195 <String "item_list">
	//  164  335:aload_2         
	//  165  336:invokevirtual   #126 <Method JSONObject JSONObject.accumulate(String, Object)>
	//  166  339:pop             
		}
		aes = ((es []) (new JSONArray()));
	//  167  340:new             #75  <Class JSONArray>
	//  168  343:dup             
	//  169  344:invokespecial   #196 <Method void JSONArray()>
	//  170  347:astore_2        
		((JSONArray) (aes)).put(obj);
	//  171  348:aload_2         
	//  172  349:aload_1         
	//  173  350:invokevirtual   #200 <Method JSONArray JSONArray.put(Object)>
	//  174  353:pop             
		a(((JSONObject) (obj)));
	//  175  354:aload_0         
	//  176  355:aload_1         
	//  177  356:invokevirtual   #202 <Method void a(JSONObject)>
		jsonobject.accumulate("transactions", ((Object) (aes)));
	//  178  359:aload_3         
	//  179  360:ldc1            #204 <String "transactions">
	//  180  362:aload_2         
	//  181  363:invokevirtual   #126 <Method JSONObject JSONObject.accumulate(String, Object)>
	//  182  366:pop             
		return jsonobject.toString();
	//  183  367:aload_3         
	//  184  368:invokevirtual   #207 <Method String JSONObject.toString()>
	//  185  371:areturn         
	}

	public final void c()
	{
		JSONException jsonexception;
		JSONObject jsonobject = m();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #211 <Method JSONObject m()>
	//    2    4:astore_1        
		try
		{
			h = jsonobject.getString("state");
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #213 <String "state">
	//    6    9:invokevirtual   #216 <Method String JSONObject.getString(String)>
	//    7   12:putfield        #106 <Field String h>
			i = jsonobject.optString("id");
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:ldc1            #94  <String "id">
	//   11   19:invokevirtual   #98  <Method String JSONObject.optString(String)>
	//   12   22:putfield        #109 <Field String i>
			j = jsonobject.optString("create_time");
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:ldc1            #218 <String "create_time">
	//   16   29:invokevirtual   #98  <Method String JSONObject.optString(String)>
	//   17   32:putfield        #113 <Field String j>
			k = a(jsonobject.getJSONArray("transactions"));
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:ldc1            #204 <String "transactions">
	//   21   39:invokevirtual   #87  <Method JSONArray JSONObject.getJSONArray(String)>
	//   22   42:invokestatic    #220 <Method String a(JSONArray)>
	//   23   45:putfield        #116 <Field String k>
			return;
	//   24   48:return          
		}
	//*  25   49:aload_0         
	//*  26   50:invokevirtual   #222 <Method void d()>
	//*  27   53:return          
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
		{
			d();
		}
	//*  28   54:astore_1        
	//*  29   55:goto            49
	}

	public final void d()
	{
		b(m());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #211 <Method JSONObject m()>
	//    3    5:invokevirtual   #224 <Method void b(JSONObject)>
	//    4    8:return          
	}

	protected JSONArray y()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	protected abstract String z();

	public String a;
	private er b;
	private Map c;
	private es d[];
	private String e;
	private boolean f;
	private String g;
	private String h;
	private String i;
	private String j;
	private String k;
}
