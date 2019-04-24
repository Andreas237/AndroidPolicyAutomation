// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.rest;

import android.content.Context;
import com.irobot.home.rest.java.util.Map_StringString;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.c.c.b;
import org.c.c.b.b.a;
import org.c.c.c;
import org.c.c.f;
import org.c.f.a.k;
import org.json.JSONObject;

// Referenced classes of package com.irobot.home.rest:
//			AxedaApiRestClient

public final class AxedaApiRestClient_
	implements AxedaApiRestClient
{

	public AxedaApiRestClient_(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		restTemplate = new k();
	//    2    4:aload_0         
	//    3    5:new             #20  <Class k>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void k()>
	//    6   12:putfield        #23  <Field k restTemplate>
		availableHeaders = new HashMap();
	//    7   15:aload_0         
	//    8   16:new             #25  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #26  <Method void HashMap()>
	//   11   23:putfield        #28  <Field HashMap availableHeaders>
		rootUrl = "https://irobot-sandbox.axeda.com/services/v1/rest/Scripto/execute/";
	//   12   26:aload_0         
	//   13   27:ldc1            #30  <String "https://irobot-sandbox.axeda.com/services/v1/rest/Scripto/execute/">
	//   14   29:putfield        #32  <Field String rootUrl>
		restTemplate.c().clear();
	//   15   32:aload_0         
	//   16   33:getfield        #23  <Field k restTemplate>
	//   17   36:invokevirtual   #36  <Method List k.c()>
	//   18   39:invokeinterface #41  <Method void List.clear()>
		restTemplate.c().add(((Object) (new a())));
	//   19   44:aload_0         
	//   20   45:getfield        #23  <Field k restTemplate>
	//   21   48:invokevirtual   #36  <Method List k.c()>
	//   22   51:new             #43  <Class a>
	//   23   54:dup             
	//   24   55:invokespecial   #44  <Method void a()>
	//   25   58:invokeinterface #48  <Method boolean List.add(Object)>
	//   26   63:pop             
	//   27   64:return          
	}

	public String getHeader(String s)
	{
		return (String)availableHeaders.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field HashMap availableHeaders>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #55  <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #57  <Class String>
	//    5   11:areturn         
	}

	public k getRestTemplate()
	{
		return restTemplate;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field k restTemplate>
	//    2    4:areturn         
	}

	public String getRootUrl()
	{
		return rootUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String rootUrl>
	//    2    4:areturn         
	}

	public void setHeader(String s, String s1)
	{
		availableHeaders.put(((Object) (s)), ((Object) (s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field HashMap availableHeaders>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #67  <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void setRootUrl(String s)
	{
		rootUrl = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field String rootUrl>
	//    3    5:return          
	}

	public Map setStatus(String s, String s1, JSONObject jsonobject)
	{
		Object obj = ((Object) (new c()));
	//    0    0:new             #73  <Class c>
	//    1    3:dup             
	//    2    4:invokespecial   #74  <Method void c()>
	//    3    7:astore          4
		((c) (obj)).c("ASSET-ID", (String)availableHeaders.get("ASSET-ID"));
	//    4    9:aload           4
	//    5   11:ldc1            #76  <String "ASSET-ID">
	//    6   13:aload_0         
	//    7   14:getfield        #28  <Field HashMap availableHeaders>
	//    8   17:ldc1            #76  <String "ASSET-ID">
	//    9   19:invokevirtual   #55  <Method Object HashMap.get(Object)>
	//   10   22:checkcast       #57  <Class String>
	//   11   25:invokevirtual   #78  <Method void c.c(String, String)>
		obj = ((Object) (new b(((org.c.e.g) (obj)))));
	//   12   28:new             #80  <Class b>
	//   13   31:dup             
	//   14   32:aload           4
	//   15   34:invokespecial   #83  <Method void b(org.c.e.g)>
	//   16   37:astore          4
		HashMap hashmap = new HashMap();
	//   17   39:new             #25  <Class HashMap>
	//   18   42:dup             
	//   19   43:invokespecial   #26  <Method void HashMap()>
	//   20   46:astore          5
		hashmap.put("robotpwd", ((Object) (s1)));
	//   21   48:aload           5
	//   22   50:ldc1            #85  <String "robotpwd">
	//   23   52:aload_2         
	//   24   53:invokevirtual   #67  <Method Object HashMap.put(Object, Object)>
	//   25   56:pop             
		hashmap.put("blid", ((Object) (s)));
	//   26   57:aload           5
	//   27   59:ldc1            #87  <String "blid">
	//   28   61:aload_1         
	//   29   62:invokevirtual   #67  <Method Object HashMap.put(Object, Object)>
	//   30   65:pop             
		hashmap.put("value", ((Object) (jsonobject)));
	//   31   66:aload           5
	//   32   68:ldc1            #89  <String "value">
	//   33   70:aload_3         
	//   34   71:invokevirtual   #67  <Method Object HashMap.put(Object, Object)>
	//   35   74:pop             
		return (Map)restTemplate.a(rootUrl.concat("AspenApiRequest?blid={blid}&robotpwd={robotpwd}&method=multipleFieldSet&value={value}"), f.GET, ((b) (obj)), com/irobot/home/rest/java/util/Map_StringString, ((Map) (hashmap))).b();
	//   36   75:aload_0         
	//   37   76:getfield        #23  <Field k restTemplate>
	//   38   79:aload_0         
	//   39   80:getfield        #32  <Field String rootUrl>
	//   40   83:ldc1            #91  <String "AspenApiRequest?blid={blid}&robotpwd={robotpwd}&method=multipleFieldSet&value={value}">
	//   41   85:invokevirtual   #94  <Method String String.concat(String)>
	//   42   88:getstatic       #100 <Field f f.GET>
	//   43   91:aload           4
	//   44   93:ldc1            #102 <Class Map_StringString>
	//   45   95:aload           5
	//   46   97:invokevirtual   #106 <Method org.c.c.k k.a(String, f, b, Class, Map)>
	//   47  100:invokevirtual   #112 <Method Object org.c.c.k.b()>
	//   48  103:checkcast       #114 <Class Map>
	//   49  106:areturn         
	}

	private HashMap availableHeaders;
	private k restTemplate;
	private String rootUrl;
}
