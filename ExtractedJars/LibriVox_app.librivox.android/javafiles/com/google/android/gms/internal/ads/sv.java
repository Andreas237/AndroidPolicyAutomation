// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public final class sv
{

	public sv(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		h = jsonobject.optString("url");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #30  <String "url">
	//    5    8:invokevirtual   #36  <Method String JSONObject.optString(String)>
	//    6   11:putfield        #38  <Field String h>
		b = jsonobject.optString("base_uri");
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:ldc1            #40  <String "base_uri">
	//   10   18:invokevirtual   #36  <Method String JSONObject.optString(String)>
	//   11   21:putfield        #42  <Field String b>
		c = jsonobject.optString("post_parameters");
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:ldc1            #44  <String "post_parameters">
	//   15   28:invokevirtual   #36  <Method String JSONObject.optString(String)>
	//   16   31:putfield        #46  <Field String c>
		Object obj = ((Object) (jsonobject.optString("drt_include")));
	//   17   34:aload_1         
	//   18   35:ldc1            #48  <String "drt_include">
	//   19   37:invokevirtual   #36  <Method String JSONObject.optString(String)>
	//   20   40:astore          4
		int i1 = 1;
	//   21   42:iconst_1        
	//   22   43:istore_2        
		boolean flag;
		if(obj != null && (((String) (obj)).equals("1") || ((String) (obj)).equals("true")))
	//*  23   44:aload           4
	//*  24   46:ifnull          74
	//*  25   49:aload           4
	//*  26   51:ldc1            #50  <String "1">
	//*  27   53:invokevirtual   #56  <Method boolean String.equals(Object)>
	//*  28   56:ifne            69
	//*  29   59:aload           4
	//*  30   61:ldc1            #58  <String "true">
	//*  31   63:invokevirtual   #56  <Method boolean String.equals(Object)>
	//*  32   66:ifeq            74
			flag = true;
	//   33   69:iconst_1        
	//   34   70:istore_3        
		else
	//*  35   71:goto            76
			flag = false;
	//   36   74:iconst_0        
	//   37   75:istore_3        
		e = flag;
	//   38   76:aload_0         
	//   39   77:iload_3         
	//   40   78:putfield        #60  <Field boolean e>
		f = jsonobject.optString("request_id");
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:ldc1            #62  <String "request_id">
	//   44   85:invokevirtual   #36  <Method String JSONObject.optString(String)>
	//   45   88:putfield        #64  <Field String f>
		d = jsonobject.optString("type");
	//   46   91:aload_0         
	//   47   92:aload_1         
	//   48   93:ldc1            #66  <String "type">
	//   49   95:invokevirtual   #36  <Method String JSONObject.optString(String)>
	//   50   98:putfield        #68  <Field String d>
		obj = ((Object) (jsonobject.optString("errors")));
	//   51  101:aload_1         
	//   52  102:ldc1            #70  <String "errors">
	//   53  104:invokevirtual   #36  <Method String JSONObject.optString(String)>
	//   54  107:astore          4
		if(obj == null)
	//*  55  109:aload           4
	//*  56  111:ifnonnull       120
			obj = null;
	//   57  114:aconst_null     
	//   58  115:astore          4
		else
	//*  59  117:goto            132
			obj = ((Object) (Arrays.asList(((Object []) (((String) (obj)).split(","))))));
	//   60  120:aload           4
	//   61  122:ldc1            #72  <String ",">
	//   62  124:invokevirtual   #76  <Method String[] String.split(String)>
	//   63  127:invokestatic    #82  <Method List Arrays.asList(Object[])>
	//   64  130:astore          4
		a = ((List) (obj));
	//   65  132:aload_0         
	//   66  133:aload           4
	//   67  135:putfield        #84  <Field List a>
		if(jsonobject.optInt("valid", 0) == 1)
	//*  68  138:aload_1         
	//*  69  139:ldc1            #86  <String "valid">
	//*  70  141:iconst_0        
	//*  71  142:invokevirtual   #90  <Method int JSONObject.optInt(String, int)>
	//*  72  145:iconst_1        
	//*  73  146:icmpne          152
			i1 = -2;
	//   74  149:bipush          -2
	//   75  151:istore_2        
		i = i1;
	//   76  152:aload_0         
	//   77  153:iload_2         
	//   78  154:putfield        #92  <Field int i>
		g = jsonobject.optString("fetched_ad");
	//   79  157:aload_0         
	//   80  158:aload_1         
	//   81  159:ldc1            #94  <String "fetched_ad">
	//   82  161:invokevirtual   #36  <Method String JSONObject.optString(String)>
	//   83  164:putfield        #96  <Field String g>
		j = jsonobject.optBoolean("render_test_ad_label");
	//   84  167:aload_0         
	//   85  168:aload_1         
	//   86  169:ldc1            #98  <String "render_test_ad_label">
	//   87  171:invokevirtual   #102 <Method boolean JSONObject.optBoolean(String)>
	//   88  174:putfield        #104 <Field boolean j>
		obj = ((Object) (jsonobject.optJSONObject("preprocessor_flags")));
	//   89  177:aload_1         
	//   90  178:ldc1            #106 <String "preprocessor_flags">
	//   91  180:invokevirtual   #110 <Method JSONObject JSONObject.optJSONObject(String)>
	//   92  183:astore          4
		if(obj == null)
	//*  93  185:aload           4
	//*  94  187:ifnull          193
	//*  95  190:goto            202
			obj = ((Object) (new JSONObject()));
	//   96  193:new             #32  <Class JSONObject>
	//   97  196:dup             
	//   98  197:invokespecial   #111 <Method void JSONObject()>
	//   99  200:astore          4
		k = ((JSONObject) (obj));
	//  100  202:aload_0         
	//  101  203:aload           4
	//  102  205:putfield        #113 <Field JSONObject k>
		l = jsonobject.optString("analytics_query_ad_event_id");
	//  103  208:aload_0         
	//  104  209:aload_1         
	//  105  210:ldc1            #115 <String "analytics_query_ad_event_id">
	//  106  212:invokevirtual   #36  <Method String JSONObject.optString(String)>
	//  107  215:putfield        #117 <Field String l>
		m = jsonobject.optBoolean("is_analytics_logging_enabled");
	//  108  218:aload_0         
	//  109  219:aload_1         
	//  110  220:ldc1            #119 <String "is_analytics_logging_enabled">
	//  111  222:invokevirtual   #102 <Method boolean JSONObject.optBoolean(String)>
	//  112  225:putfield        #121 <Field boolean m>
	//  113  228:return          
	}

	public final int a()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field int i>
	//    2    4:ireturn         
	}

	public final String b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String b>
	//    2    4:areturn         
	}

	public final String c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String c>
	//    2    4:areturn         
	}

	public final String d()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String h>
	//    2    4:areturn         
	}

	public final boolean e()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field boolean e>
	//    2    4:ireturn         
	}

	public final String f()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field String g>
	//    2    4:areturn         
	}

	public final boolean g()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field boolean j>
	//    2    4:ireturn         
	}

	public final String h()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field String l>
	//    2    4:areturn         
	}

	public final boolean i()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field boolean m>
	//    2    4:ireturn         
	}

	private final List a;
	private final String b;
	private final String c;
	private final String d;
	private final boolean e;
	private final String f;
	private final String g;
	private String h;
	private final int i;
	private final boolean j;
	private final JSONObject k;
	private final String l;
	private final boolean m;
}
