// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk;

import java.math.BigDecimal;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk:
//			et, cj, cd, er, 
//			dj, ca, ab, es

public final class ej extends et
{

	public ej(ca ca, ab ab, String s, String s1, String s2, String s3, er er1, 
			Map map, es aes[], String s4, boolean flag, String s5, String s6, String s7)
	{
		super(cj.f, ca, ab, s, s1, s3, er1, map, aes, s4, flag, s5, s6, s7);
	//    0    0:aload_0         
	//    1    1:getstatic       #22  <Field cj cj.f>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           6
	//    7   11:aload           7
	//    8   13:aload           8
	//    9   15:aload           9
	//   10   17:aload           10
	//   11   19:iload           11
	//   12   21:aload           12
	//   13   23:aload           13
	//   14   25:aload           14
	//   15   27:invokespecial   #25  <Method void et(cj, ca, ab, String, String, String, er, Map, es[], String, boolean, String, String, String)>
		g = s2;
	//   16   30:aload_0         
	//   17   31:aload           5
	//   18   33:putfield        #27  <Field String g>
	//   19   36:return          
	}

	public ej(ca ca, ab ab, String s, String s1, String s2, String s3, String s4, 
			int k, int l, String s5, er er1, Map map, es aes[], String s6, 
			boolean flag, String s7, String s8, String s9)
	{
		super(cj.f, ca, ab, s, s1, ((String) (null)), er1, map, aes, s6, flag, s7, s8, s9);
	//    0    0:aload_0         
	//    1    1:getstatic       #22  <Field cj cj.f>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aconst_null     
	//    7   10:aload           11
	//    8   12:aload           12
	//    9   14:aload           13
	//   10   16:aload           14
	//   11   18:iload           15
	//   12   20:aload           16
	//   13   22:aload           17
	//   14   24:aload           18
	//   15   26:invokespecial   #25  <Method void et(cj, ca, ab, String, String, String, er, Map, es[], String, boolean, String, String, String)>
		b = s2;
	//   16   29:aload_0         
	//   17   30:aload           5
	//   18   32:putfield        #31  <Field String b>
		c = s3;
	//   19   35:aload_0         
	//   20   36:aload           6
	//   21   38:putfield        #33  <Field String c>
		d = s4;
	//   22   41:aload_0         
	//   23   42:aload           7
	//   24   44:putfield        #35  <Field String d>
		e = k;
	//   25   47:aload_0         
	//   26   48:iload           8
	//   27   50:putfield        #37  <Field int e>
		f = l;
	//   28   53:aload_0         
	//   29   54:iload           9
	//   30   56:putfield        #39  <Field int f>
	//   31   59:return          
	}

	final void a(JSONObject jsonobject)
	{
		if(cd.b(((CharSequence) (h))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field String h>
	//*   2    4:invokestatic    #48  <Method boolean cd.b(CharSequence)>
	//*   3    7:ifeq            21
			jsonobject.accumulate("invoice_number", ((Object) (h)));
	//    4   10:aload_1         
	//    5   11:ldc1            #50  <String "invoice_number">
	//    6   13:aload_0         
	//    7   14:getfield        #43  <Field String h>
	//    8   17:invokevirtual   #56  <Method JSONObject JSONObject.accumulate(String, Object)>
	//    9   20:pop             
		if(cd.b(((CharSequence) (i))))
	//*  10   21:aload_0         
	//*  11   22:getfield        #58  <Field String i>
	//*  12   25:invokestatic    #48  <Method boolean cd.b(CharSequence)>
	//*  13   28:ifeq            42
			jsonobject.accumulate("custom", ((Object) (i)));
	//   14   31:aload_1         
	//   15   32:ldc1            #60  <String "custom">
	//   16   34:aload_0         
	//   17   35:getfield        #58  <Field String i>
	//   18   38:invokevirtual   #56  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   19   41:pop             
		if(cd.b(((CharSequence) (j))))
	//*  20   42:aload_0         
	//*  21   43:getfield        #62  <Field String j>
	//*  22   46:invokestatic    #48  <Method boolean cd.b(CharSequence)>
	//*  23   49:ifeq            63
			jsonobject.accumulate("soft_descriptor", ((Object) (j)));
	//   24   52:aload_1         
	//   25   53:ldc1            #64  <String "soft_descriptor">
	//   26   55:aload_0         
	//   27   56:getfield        #62  <Field String j>
	//   28   59:invokevirtual   #56  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   29   62:pop             
	//   30   63:return          
	}

	public final ej d(String s)
	{
		h = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field String h>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final ej e(String s)
	{
		i = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field String i>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final String e()
	{
		String s1 = dj.a(B().a().doubleValue(), B().b());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method er B()>
	//    2    4:invokevirtual   #75  <Method BigDecimal er.a()>
	//    3    7:invokevirtual   #81  <Method double BigDecimal.doubleValue()>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #70  <Method er B()>
	//    6   14:invokevirtual   #84  <Method java.util.Currency er.b()>
	//    7   17:invokestatic    #89  <Method String dj.a(double, java.util.Currency)>
	//    8   20:astore_2        
		StringBuilder stringbuilder = new StringBuilder("{\"id\":\"PAY-6RV70583SB702805EKEYSZ6Y\",\"intent\":\"sale\",\"create_time\": \"2014-02-12T22:29:49Z\",\"update_time\": \"2014-02-12T22:29:50Z\",\"payer\":{\"funding_instruments\":[{\"credit_card\":{\"expire_month\":\"");
	//    9   21:new             #91  <Class StringBuilder>
	//   10   24:dup             
	//   11   25:ldc1            #93  <String "{\"id\":\"PAY-6RV70583SB702805EKEYSZ6Y\",\"intent\":\"sale\",\"create_time\": \"2014-02-12T22:29:49Z\",\"update_time\": \"2014-02-12T22:29:50Z\",\"payer\":{\"funding_instruments\":[{\"credit_card\":{\"expire_month\":\"">
	//   12   27:invokespecial   #96  <Method void StringBuilder(String)>
	//   13   30:astore_3        
		stringbuilder.append(e);
	//   14   31:aload_3         
	//   15   32:aload_0         
	//   16   33:getfield        #37  <Field int e>
	//   17   36:invokevirtual   #100 <Method StringBuilder StringBuilder.append(int)>
	//   18   39:pop             
		stringbuilder.append("\",\"expire_year\":\"");
	//   19   40:aload_3         
	//   20   41:ldc1            #102 <String "\",\"expire_year\":\"">
	//   21   43:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   22   46:pop             
		stringbuilder.append(f);
	//   23   47:aload_3         
	//   24   48:aload_0         
	//   25   49:getfield        #39  <Field int f>
	//   26   52:invokevirtual   #100 <Method StringBuilder StringBuilder.append(int)>
	//   27   55:pop             
		stringbuilder.append("\",\"number\":\"");
	//   28   56:aload_3         
	//   29   57:ldc1            #107 <String "\",\"number\":\"">
	//   30   59:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   31   62:pop             
		String s;
		if(b != null)
	//*  32   63:aload_0         
	//*  33   64:getfield        #31  <Field String b>
	//*  34   67:ifnull          89
		{
			s = c;
	//   35   70:aload_0         
	//   36   71:getfield        #33  <Field String c>
	//   37   74:astore_1        
			s = s.substring(s.length() - 4);
	//   38   75:aload_1         
	//   39   76:aload_1         
	//   40   77:invokevirtual   #113 <Method int String.length()>
	//   41   80:iconst_4        
	//   42   81:isub            
	//   43   82:invokevirtual   #117 <Method String String.substring(int)>
	//   44   85:astore_1        
		} else
	//*  45   86:goto            92
		{
			s = "xxxxxxxxxx1111";
	//   46   89:ldc1            #119 <String "xxxxxxxxxx1111">
	//   47   91:astore_1        
		}
		stringbuilder.append(s);
	//   48   92:aload_3         
	//   49   93:aload_1         
	//   50   94:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   51   97:pop             
		stringbuilder.append("\",\"type\":\"VISA\"}}],\"payment_method\":\"credit_card\"},\"state\":\"approved\",\"transactions\":[{\"amount\":{\"currency\":\"USD\",\"total\":\"");
	//   52   98:aload_3         
	//   53   99:ldc1            #121 <String "\",\"type\":\"VISA\"}}],\"payment_method\":\"credit_card\"},\"state\":\"approved\",\"transactions\":[{\"amount\":{\"currency\":\"USD\",\"total\":\"">
	//   54  101:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   55  104:pop             
		stringbuilder.append(s1);
	//   56  105:aload_3         
	//   57  106:aload_2         
	//   58  107:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   59  110:pop             
		stringbuilder.append("\"},\"description\":\"I am a sanity check payment.\",\"item_list\":{},\"payee\":{\"merchant_id\":\"PKKPTJKL75YDS\"},\"related_resources\":[{\"sale\":{\"amount\":{\"currency\":\"USD\",\"total\":\"");
	//   60  111:aload_3         
	//   61  112:ldc1            #123 <String "\"},\"description\":\"I am a sanity check payment.\",\"item_list\":{},\"payee\":{\"merchant_id\":\"PKKPTJKL75YDS\"},\"related_resources\":[{\"sale\":{\"amount\":{\"currency\":\"USD\",\"total\":\"">
	//   62  114:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   63  117:pop             
		stringbuilder.append(s1);
	//   64  118:aload_3         
	//   65  119:aload_2         
	//   66  120:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   67  123:pop             
		stringbuilder.append("\"},\"id\":\"0EW02334X44816642\",\"parent_payment\":\"PAY-123456789012345689\",\"state\":\"completed\"}}]}]}");
	//   68  124:aload_3         
	//   69  125:ldc1            #125 <String "\"},\"id\":\"0EW02334X44816642\",\"parent_payment\":\"PAY-123456789012345689\",\"state\":\"completed\"}}]}]}">
	//   70  127:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   71  130:pop             
		return stringbuilder.toString();
	//   72  131:aload_3         
	//   73  132:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   74  135:areturn         
	}

	public final ej f(String s)
	{
		j = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field String j>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final String t()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String c>
	//    2    4:areturn         
	}

	public final String u()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String b>
	//    2    4:areturn         
	}

	public final String v()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String d>
	//    2    4:areturn         
	}

	public final int w()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int e>
	//    2    4:ireturn         
	}

	public final int x()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int f>
	//    2    4:ireturn         
	}

	protected final JSONArray y()
	{
		JSONArray jsonarray = new JSONArray();
	//    0    0:new             #137 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #140 <Method void JSONArray()>
	//    3    7:astore          4
		JSONObject jsonobject;
		JSONObject jsonobject1;
		String s;
		if(b != null)
	//*   4    9:aload_0         
	//*   5   10:getfield        #31  <Field String b>
	//*   6   13:ifnull          99
		{
			jsonobject = new JSONObject();
	//    7   16:new             #52  <Class JSONObject>
	//    8   19:dup             
	//    9   20:invokespecial   #141 <Method void JSONObject()>
	//   10   23:astore_1        
			jsonobject.accumulate("cvv2", ((Object) (d)));
	//   11   24:aload_1         
	//   12   25:ldc1            #143 <String "cvv2">
	//   13   27:aload_0         
	//   14   28:getfield        #35  <Field String d>
	//   15   31:invokevirtual   #56  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   16   34:pop             
			jsonobject.accumulate("expire_month", ((Object) (Integer.valueOf(e))));
	//   17   35:aload_1         
	//   18   36:ldc1            #145 <String "expire_month">
	//   19   38:aload_0         
	//   20   39:getfield        #37  <Field int e>
	//   21   42:invokestatic    #151 <Method Integer Integer.valueOf(int)>
	//   22   45:invokevirtual   #56  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   23   48:pop             
			jsonobject.accumulate("expire_year", ((Object) (Integer.valueOf(f))));
	//   24   49:aload_1         
	//   25   50:ldc1            #153 <String "expire_year">
	//   26   52:aload_0         
	//   27   53:getfield        #39  <Field int f>
	//   28   56:invokestatic    #151 <Method Integer Integer.valueOf(int)>
	//   29   59:invokevirtual   #56  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   30   62:pop             
			jsonobject.accumulate("number", ((Object) (c)));
	//   31   63:aload_1         
	//   32   64:ldc1            #155 <String "number">
	//   33   66:aload_0         
	//   34   67:getfield        #33  <Field String c>
	//   35   70:invokevirtual   #56  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   36   73:pop             
			jsonobject.accumulate("type", ((Object) (b)));
	//   37   74:aload_1         
	//   38   75:ldc1            #157 <String "type">
	//   39   77:aload_0         
	//   40   78:getfield        #31  <Field String b>
	//   41   81:invokevirtual   #56  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   42   84:pop             
			jsonobject1 = new JSONObject();
	//   43   85:new             #52  <Class JSONObject>
	//   44   88:dup             
	//   45   89:invokespecial   #141 <Method void JSONObject()>
	//   46   92:astore_2        
			s = "credit_card";
	//   47   93:ldc1            #159 <String "credit_card">
	//   48   95:astore_3        
		} else
	//*  49   96:goto            140
		{
			jsonobject = new JSONObject();
	//   50   99:new             #52  <Class JSONObject>
	//   51  102:dup             
	//   52  103:invokespecial   #141 <Method void JSONObject()>
	//   53  106:astore_1        
			jsonobject.accumulate("payer_id", ((Object) (super.a)));
	//   54  107:aload_1         
	//   55  108:ldc1            #161 <String "payer_id">
	//   56  110:aload_0         
	//   57  111:getfield        #163 <Field String et.a>
	//   58  114:invokevirtual   #56  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   59  117:pop             
			jsonobject.accumulate("credit_card_id", ((Object) (g)));
	//   60  118:aload_1         
	//   61  119:ldc1            #165 <String "credit_card_id">
	//   62  121:aload_0         
	//   63  122:getfield        #27  <Field String g>
	//   64  125:invokevirtual   #56  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   65  128:pop             
			jsonobject1 = new JSONObject();
	//   66  129:new             #52  <Class JSONObject>
	//   67  132:dup             
	//   68  133:invokespecial   #141 <Method void JSONObject()>
	//   69  136:astore_2        
			s = "credit_card_token";
	//   70  137:ldc1            #167 <String "credit_card_token">
	//   71  139:astore_3        
		}
		jsonobject1.accumulate(s, ((Object) (jsonobject)));
	//   72  140:aload_2         
	//   73  141:aload_3         
	//   74  142:aload_1         
	//   75  143:invokevirtual   #56  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   76  146:pop             
		jsonarray.put(((Object) (jsonobject1)));
	//   77  147:aload           4
	//   78  149:aload_2         
	//   79  150:invokevirtual   #171 <Method JSONArray JSONArray.put(Object)>
	//   80  153:pop             
		return jsonarray;
	//   81  154:aload           4
	//   82  156:areturn         
	}

	protected final String z()
	{
		return "credit_card";
	//    0    0:ldc1            #159 <String "credit_card">
	//    1    2:areturn         
	}

	private String b;
	private String c;
	private String d;
	private int e;
	private int f;
	private String g;
	private String h;
	private String i;
	private String j;
}
