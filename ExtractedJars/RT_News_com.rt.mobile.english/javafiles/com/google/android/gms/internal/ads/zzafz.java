// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;
import org.json.JSONObject;

public final class zzafz
{

	public zzafz(int i, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		url = (String)map.get("url");
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:ldc1            #28  <String "url">
	//    5    8:invokeinterface #34  <Method Object Map.get(Object)>
	//    6   13:checkcast       #36  <Class String>
	//    7   16:putfield        #38  <Field String url>
		zzcje = (String)map.get("base_uri");
	//    8   19:aload_0         
	//    9   20:aload_2         
	//   10   21:ldc1            #40  <String "base_uri">
	//   11   23:invokeinterface #34  <Method Object Map.get(Object)>
	//   12   28:checkcast       #36  <Class String>
	//   13   31:putfield        #42  <Field String zzcje>
		zzcjf = (String)map.get("post_parameters");
	//   14   34:aload_0         
	//   15   35:aload_2         
	//   16   36:ldc1            #44  <String "post_parameters">
	//   17   38:invokeinterface #34  <Method Object Map.get(Object)>
	//   18   43:checkcast       #36  <Class String>
	//   19   46:putfield        #46  <Field String zzcjf>
		zzcjg = parseBoolean((String)map.get("drt_include"));
	//   20   49:aload_0         
	//   21   50:aload_2         
	//   22   51:ldc1            #48  <String "drt_include">
	//   23   53:invokeinterface #34  <Method Object Map.get(Object)>
	//   24   58:checkcast       #36  <Class String>
	//   25   61:invokestatic    #52  <Method boolean parseBoolean(String)>
	//   26   64:putfield        #54  <Field boolean zzcjg>
		zzcdi = (String)map.get("request_id");
	//   27   67:aload_0         
	//   28   68:aload_2         
	//   29   69:ldc1            #56  <String "request_id">
	//   30   71:invokeinterface #34  <Method Object Map.get(Object)>
	//   31   76:checkcast       #36  <Class String>
	//   32   79:putfield        #58  <Field String zzcdi>
		type = (String)map.get("type");
	//   33   82:aload_0         
	//   34   83:aload_2         
	//   35   84:ldc1            #59  <String "type">
	//   36   86:invokeinterface #34  <Method Object Map.get(Object)>
	//   37   91:checkcast       #36  <Class String>
	//   38   94:putfield        #61  <Field String type>
		zzcjd = zzbz((String)map.get("errors"));
	//   39   97:aload_0         
	//   40   98:aload_2         
	//   41   99:ldc1            #63  <String "errors">
	//   42  101:invokeinterface #34  <Method Object Map.get(Object)>
	//   43  106:checkcast       #36  <Class String>
	//   44  109:invokestatic    #67  <Method List zzbz(String)>
	//   45  112:putfield        #69  <Field List zzcjd>
		errorCode = i;
	//   46  115:aload_0         
	//   47  116:iload_1         
	//   48  117:putfield        #71  <Field int errorCode>
		zzcjh = (String)map.get("fetched_ad");
	//   49  120:aload_0         
	//   50  121:aload_2         
	//   51  122:ldc1            #73  <String "fetched_ad">
	//   52  124:invokeinterface #34  <Method Object Map.get(Object)>
	//   53  129:checkcast       #36  <Class String>
	//   54  132:putfield        #75  <Field String zzcjh>
		zzcji = parseBoolean((String)map.get("render_test_ad_label"));
	//   55  135:aload_0         
	//   56  136:aload_2         
	//   57  137:ldc1            #77  <String "render_test_ad_label">
	//   58  139:invokeinterface #34  <Method Object Map.get(Object)>
	//   59  144:checkcast       #36  <Class String>
	//   60  147:invokestatic    #52  <Method boolean parseBoolean(String)>
	//   61  150:putfield        #79  <Field boolean zzcji>
		zzcjj = new JSONObject();
	//   62  153:aload_0         
	//   63  154:new             #81  <Class JSONObject>
	//   64  157:dup             
	//   65  158:invokespecial   #82  <Method void JSONObject()>
	//   66  161:putfield        #84  <Field JSONObject zzcjj>
	//   67  164:return          
	}

	public zzafz(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		url = jsonobject.optString("url");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #28  <String "url">
	//    5    8:invokevirtual   #92  <Method String JSONObject.optString(String)>
	//    6   11:putfield        #38  <Field String url>
		zzcje = jsonobject.optString("base_uri");
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:ldc1            #40  <String "base_uri">
	//   10   18:invokevirtual   #92  <Method String JSONObject.optString(String)>
	//   11   21:putfield        #42  <Field String zzcje>
		zzcjf = jsonobject.optString("post_parameters");
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:ldc1            #44  <String "post_parameters">
	//   15   28:invokevirtual   #92  <Method String JSONObject.optString(String)>
	//   16   31:putfield        #46  <Field String zzcjf>
		zzcjg = parseBoolean(jsonobject.optString("drt_include"));
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:ldc1            #48  <String "drt_include">
	//   20   38:invokevirtual   #92  <Method String JSONObject.optString(String)>
	//   21   41:invokestatic    #52  <Method boolean parseBoolean(String)>
	//   22   44:putfield        #54  <Field boolean zzcjg>
		zzcdi = jsonobject.optString("request_id");
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:ldc1            #56  <String "request_id">
	//   26   51:invokevirtual   #92  <Method String JSONObject.optString(String)>
	//   27   54:putfield        #58  <Field String zzcdi>
		type = jsonobject.optString("type");
	//   28   57:aload_0         
	//   29   58:aload_1         
	//   30   59:ldc1            #59  <String "type">
	//   31   61:invokevirtual   #92  <Method String JSONObject.optString(String)>
	//   32   64:putfield        #61  <Field String type>
		zzcjd = zzbz(jsonobject.optString("errors"));
	//   33   67:aload_0         
	//   34   68:aload_1         
	//   35   69:ldc1            #63  <String "errors">
	//   36   71:invokevirtual   #92  <Method String JSONObject.optString(String)>
	//   37   74:invokestatic    #67  <Method List zzbz(String)>
	//   38   77:putfield        #69  <Field List zzcjd>
		int j = jsonobject.optInt("valid", 0);
	//   39   80:aload_1         
	//   40   81:ldc1            #94  <String "valid">
	//   41   83:iconst_0        
	//   42   84:invokevirtual   #98  <Method int JSONObject.optInt(String, int)>
	//   43   87:istore_3        
		int i = 1;
	//   44   88:iconst_1        
	//   45   89:istore_2        
		if(j == 1)
	//*  46   90:iload_3         
	//*  47   91:iconst_1        
	//*  48   92:icmpne          98
			i = -2;
	//   49   95:bipush          -2
	//   50   97:istore_2        
		errorCode = i;
	//   51   98:aload_0         
	//   52   99:iload_2         
	//   53  100:putfield        #71  <Field int errorCode>
		zzcjh = jsonobject.optString("fetched_ad");
	//   54  103:aload_0         
	//   55  104:aload_1         
	//   56  105:ldc1            #73  <String "fetched_ad">
	//   57  107:invokevirtual   #92  <Method String JSONObject.optString(String)>
	//   58  110:putfield        #75  <Field String zzcjh>
		zzcji = jsonobject.optBoolean("render_test_ad_label");
	//   59  113:aload_0         
	//   60  114:aload_1         
	//   61  115:ldc1            #77  <String "render_test_ad_label">
	//   62  117:invokevirtual   #101 <Method boolean JSONObject.optBoolean(String)>
	//   63  120:putfield        #79  <Field boolean zzcji>
		jsonobject = jsonobject.optJSONObject("preprocessor_flags");
	//   64  123:aload_1         
	//   65  124:ldc1            #103 <String "preprocessor_flags">
	//   66  126:invokevirtual   #107 <Method JSONObject JSONObject.optJSONObject(String)>
	//   67  129:astore_1        
		if(jsonobject == null)
	//*  68  130:aload_1         
	//*  69  131:ifnull          137
	//*  70  134:goto            145
			jsonobject = new JSONObject();
	//   71  137:new             #81  <Class JSONObject>
	//   72  140:dup             
	//   73  141:invokespecial   #82  <Method void JSONObject()>
	//   74  144:astore_1        
		zzcjj = jsonobject;
	//   75  145:aload_0         
	//   76  146:aload_1         
	//   77  147:putfield        #84  <Field JSONObject zzcjj>
	//   78  150:return          
	}

	private static boolean parseBoolean(String s)
	{
		return s != null && (s.equals("1") || s.equals("true"));
	//    0    0:aload_0         
	//    1    1:ifnull          24
	//    2    4:aload_0         
	//    3    5:ldc1            #109 <String "1">
	//    4    7:invokevirtual   #113 <Method boolean String.equals(Object)>
	//    5   10:ifne            22
	//    6   13:aload_0         
	//    7   14:ldc1            #115 <String "true">
	//    8   16:invokevirtual   #113 <Method boolean String.equals(Object)>
	//    9   19:ifeq            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	private static List zzbz(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return Arrays.asList(((Object []) (s.split(","))));
	//    4    6:aload_0         
	//    5    7:ldc1            #117 <String ",">
	//    6    9:invokevirtual   #121 <Method String[] String.split(String)>
	//    7   12:invokestatic    #127 <Method List Arrays.asList(Object[])>
	//    8   15:areturn         
	}

	public final int getErrorCode()
	{
		return errorCode;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int errorCode>
	//    2    4:ireturn         
	}

	public final String getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String type>
	//    2    4:areturn         
	}

	public final String getUrl()
	{
		return url;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String url>
	//    2    4:areturn         
	}

	public final void setUrl(String s)
	{
		url = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field String url>
	//    3    5:return          
	}

	public final List zzoh()
	{
		return zzcjd;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field List zzcjd>
	//    2    4:areturn         
	}

	public final String zzoi()
	{
		return zzcje;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String zzcje>
	//    2    4:areturn         
	}

	public final String zzoj()
	{
		return zzcjf;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String zzcjf>
	//    2    4:areturn         
	}

	public final boolean zzok()
	{
		return zzcjg;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field boolean zzcjg>
	//    2    4:ireturn         
	}

	public final String zzol()
	{
		return zzcdi;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field String zzcdi>
	//    2    4:areturn         
	}

	public final String zzom()
	{
		return zzcjh;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field String zzcjh>
	//    2    4:areturn         
	}

	public final boolean zzon()
	{
		return zzcji;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field boolean zzcji>
	//    2    4:ireturn         
	}

	private final int errorCode;
	private final String type;
	private String url;
	private final String zzcdi;
	private final List zzcjd;
	private final String zzcje;
	private final String zzcjf;
	private final boolean zzcjg;
	private final String zzcjh;
	private final boolean zzcji;
	private final JSONObject zzcjj;
}
