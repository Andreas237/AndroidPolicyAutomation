// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk;

import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk:
//			eu, cj, dv, ca, 
//			ab

public final class ex extends eu
{

	public ex(ca ca, ab ab, String s, String s1, String s2, String s3, String s4, 
			int j, int k)
	{
		super(cj.i, ca, ab, s);
	//    0    0:aload_0         
	//    1    1:getstatic       #23  <Field cj cj.i>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokespecial   #26  <Method void eu(cj, ca, ab, String)>
		a = s1;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #28  <Field String a>
		b = s2;
	//    9   16:aload_0         
	//   10   17:aload           5
	//   11   19:putfield        #30  <Field String b>
		if(s3 != null)
	//*  12   22:aload           6
	//*  13   24:ifnull          52
		{
			c = s3;
	//   14   27:aload_0         
	//   15   28:aload           6
	//   16   30:putfield        #32  <Field String c>
			d = s4;
	//   17   33:aload_0         
	//   18   34:aload           7
	//   19   36:putfield        #34  <Field String d>
			e = j;
	//   20   39:aload_0         
	//   21   40:iload           8
	//   22   42:putfield        #36  <Field int e>
			f = k;
	//   23   45:aload_0         
	//   24   46:iload           9
	//   25   48:putfield        #38  <Field int f>
			return;
	//   26   51:return          
		} else
		{
			throw new RuntimeException("cardNumber should not be null.  If it is, then you're probably trying to tokenize a card that's already been tokenized.");
	//   27   52:new             #40  <Class RuntimeException>
	//   28   55:dup             
	//   29   56:ldc1            #42  <String "cardNumber should not be null.  If it is, then you're probably trying to tokenize a card that's already been tokenized.">
	//   30   58:invokespecial   #45  <Method void RuntimeException(String)>
	//   31   61:athrow          
		}
	}

	public final String b()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #49  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #52  <Method void JSONObject()>
	//    3    7:astore_1        
		jsonobject.accumulate("payer_id", ((Object) (a)));
	//    4    8:aload_1         
	//    5    9:ldc1            #54  <String "payer_id">
	//    6   11:aload_0         
	//    7   12:getfield        #28  <Field String a>
	//    8   15:invokevirtual   #58  <Method JSONObject JSONObject.accumulate(String, Object)>
	//    9   18:pop             
		jsonobject.accumulate("cvv2", ((Object) (d)));
	//   10   19:aload_1         
	//   11   20:ldc1            #60  <String "cvv2">
	//   12   22:aload_0         
	//   13   23:getfield        #34  <Field String d>
	//   14   26:invokevirtual   #58  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   15   29:pop             
		jsonobject.accumulate("expire_month", ((Object) (Integer.valueOf(e))));
	//   16   30:aload_1         
	//   17   31:ldc1            #62  <String "expire_month">
	//   18   33:aload_0         
	//   19   34:getfield        #36  <Field int e>
	//   20   37:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   21   40:invokevirtual   #58  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   22   43:pop             
		jsonobject.accumulate("expire_year", ((Object) (Integer.valueOf(f))));
	//   23   44:aload_1         
	//   24   45:ldc1            #70  <String "expire_year">
	//   25   47:aload_0         
	//   26   48:getfield        #38  <Field int f>
	//   27   51:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   28   54:invokevirtual   #58  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   29   57:pop             
		jsonobject.accumulate("number", ((Object) (c)));
	//   30   58:aload_1         
	//   31   59:ldc1            #72  <String "number">
	//   32   61:aload_0         
	//   33   62:getfield        #32  <Field String c>
	//   34   65:invokevirtual   #58  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   35   68:pop             
		jsonobject.accumulate("type", ((Object) (b)));
	//   36   69:aload_1         
	//   37   70:ldc1            #74  <String "type">
	//   38   72:aload_0         
	//   39   73:getfield        #30  <Field String b>
	//   40   76:invokevirtual   #58  <Method JSONObject JSONObject.accumulate(String, Object)>
	//   41   79:pop             
		return jsonobject.toString();
	//   42   80:aload_1         
	//   43   81:invokevirtual   #77  <Method String JSONObject.toString()>
	//   44   84:areturn         
	}

	public final void c()
	{
		JSONException jsonexception;
		JSONObject jsonobject = m();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #83  <Method JSONObject m()>
	//    2    4:astore_1        
		try
		{
			g = jsonobject.getString("id");
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #85  <String "id">
	//    6    9:invokevirtual   #89  <Method String JSONObject.getString(String)>
	//    7   12:putfield        #91  <Field String g>
			String s = jsonobject.getString("number");
	//    8   15:aload_1         
	//    9   16:ldc1            #72  <String "number">
	//   10   18:invokevirtual   #89  <Method String JSONObject.getString(String)>
	//   11   21:astore_2        
			if(h == null || !h.endsWith(s.substring(s.length() - 4)))
	//*  12   22:aload_0         
	//*  13   23:getfield        #93  <Field String h>
	//*  14   26:ifnull          49
	//*  15   29:aload_0         
	//*  16   30:getfield        #93  <Field String h>
	//*  17   33:aload_2         
	//*  18   34:aload_2         
	//*  19   35:invokevirtual   #99  <Method int String.length()>
	//*  20   38:iconst_4        
	//*  21   39:isub            
	//*  22   40:invokevirtual   #103 <Method String String.substring(int)>
	//*  23   43:invokevirtual   #107 <Method boolean String.endsWith(String)>
	//*  24   46:ifne            54
				h = s;
	//   25   49:aload_0         
	//   26   50:aload_2         
	//   27   51:putfield        #93  <Field String h>
			i = dv.a(jsonobject.getString("valid_until"));
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:ldc1            #109 <String "valid_until">
	//   31   58:invokevirtual   #89  <Method String JSONObject.getString(String)>
	//   32   61:invokestatic    #114 <Method Date dv.a(String)>
	//   33   64:putfield        #116 <Field Date i>
			return;
	//   34   67:return          
		}
	//*  35   68:aload_0         
	//*  36   69:invokevirtual   #118 <Method void d()>
	//*  37   72:return          
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
		{
			d();
		}
	//*  38   73:astore_1        
	//*  39   74:goto            68
	}

	public final void d()
	{
		b(m());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #83  <Method JSONObject m()>
	//    3    5:invokevirtual   #121 <Method void b(JSONObject)>
	//    4    8:return          
	}

	public final String e()
	{
		StringBuilder stringbuilder = new StringBuilder("{\"id\":\"CARD-50Y58962PH1899901KFFBSDA\",\"valid_until\":\"2016-03-19T00:00:00.000Z\",\"state\":\"ok\",\"type\":\"visa\",\"number\":\"xxxxxxxxxxxx");
	//    0    0:new             #123 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #125 <String "{\"id\":\"CARD-50Y58962PH1899901KFFBSDA\",\"valid_until\":\"2016-03-19T00:00:00.000Z\",\"state\":\"ok\",\"type\":\"visa\",\"number\":\"xxxxxxxxxxxx">
	//    3    6:invokespecial   #126 <Method void StringBuilder(String)>
	//    4    9:astore_1        
		String s = c;
	//    5   10:aload_0         
	//    6   11:getfield        #32  <Field String c>
	//    7   14:astore_2        
		stringbuilder.append(s.substring(s.length() - 4));
	//    8   15:aload_1         
	//    9   16:aload_2         
	//   10   17:aload_2         
	//   11   18:invokevirtual   #99  <Method int String.length()>
	//   12   21:iconst_4        
	//   13   22:isub            
	//   14   23:invokevirtual   #103 <Method String String.substring(int)>
	//   15   26:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   16   29:pop             
		stringbuilder.append("\",\"expire_month\":\"");
	//   17   30:aload_1         
	//   18   31:ldc1            #132 <String "\",\"expire_month\":\"">
	//   19   33:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   20   36:pop             
		stringbuilder.append(e);
	//   21   37:aload_1         
	//   22   38:aload_0         
	//   23   39:getfield        #36  <Field int e>
	//   24   42:invokevirtual   #135 <Method StringBuilder StringBuilder.append(int)>
	//   25   45:pop             
		stringbuilder.append("\",\"expire_year\":\"");
	//   26   46:aload_1         
	//   27   47:ldc1            #137 <String "\",\"expire_year\":\"">
	//   28   49:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   29   52:pop             
		stringbuilder.append(f);
	//   30   53:aload_1         
	//   31   54:aload_0         
	//   32   55:getfield        #38  <Field int f>
	//   33   58:invokevirtual   #135 <Method StringBuilder StringBuilder.append(int)>
	//   34   61:pop             
		stringbuilder.append("\",\"links\":[{\"href\":\"https://api.sandbox.paypal.com/v1/vault/credit-card/CARD-50Y58962PH1899901KFFBSDA\",\"rel\":\"self\",\"method\":\"GET\"}]}");
	//   35   62:aload_1         
	//   36   63:ldc1            #139 <String "\",\"links\":[{\"href\":\"https://api.sandbox.paypal.com/v1/vault/credit-card/CARD-50Y58962PH1899901KFFBSDA\",\"rel\":\"self\",\"method\":\"GET\"}]}">
	//   37   65:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   38   68:pop             
		return stringbuilder.toString();
	//   39   69:aload_1         
	//   40   70:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   41   73:areturn         
	}

	public final String t()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field String g>
	//    2    4:areturn         
	}

	public final String u()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field String h>
	//    2    4:areturn         
	}

	public final Date v()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Date i>
	//    2    4:areturn         
	}

	public final String w()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String b>
	//    2    4:areturn         
	}

	public final int x()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int e>
	//    2    4:ireturn         
	}

	public final int y()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int f>
	//    2    4:ireturn         
	}

	public final String a;
	private final String b;
	private final String c;
	private final String d;
	private final int e;
	private final int f;
	private String g;
	private String h;
	private Date i;
}
