// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.codeless.internal;

import java.util.ArrayList;
import java.util.List;
import org.json.*;

// Referenced classes of package com.facebook.appevents.codeless.internal:
//			PathComponent

public final class ParameterComponent
{

	public ParameterComponent(JSONObject jsonobject)
		throws JSONException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		name = jsonobject.getString("name");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #19  <String "name">
	//    5    8:invokevirtual   #25  <Method String JSONObject.getString(String)>
	//    6   11:putfield        #27  <Field String name>
		value = jsonobject.optString("value");
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:ldc1            #28  <String "value">
	//   10   18:invokevirtual   #31  <Method String JSONObject.optString(String)>
	//   11   21:putfield        #33  <Field String value>
		ArrayList arraylist = new ArrayList();
	//   12   24:new             #35  <Class ArrayList>
	//   13   27:dup             
	//   14   28:invokespecial   #36  <Method void ArrayList()>
	//   15   31:astore_3        
		JSONArray jsonarray = jsonobject.optJSONArray("path");
	//   16   32:aload_1         
	//   17   33:ldc1            #37  <String "path">
	//   18   35:invokevirtual   #41  <Method JSONArray JSONObject.optJSONArray(String)>
	//   19   38:astore          4
		if(jsonarray != null)
	//*  20   40:aload           4
	//*  21   42:ifnull          81
		{
			for(int i = 0; i < jsonarray.length(); i++)
	//*  22   45:iconst_0        
	//*  23   46:istore_2        
	//*  24   47:iload_2         
	//*  25   48:aload           4
	//*  26   50:invokevirtual   #47  <Method int JSONArray.length()>
	//*  27   53:icmpge          81
				arraylist.add(((Object) (new PathComponent(jsonarray.getJSONObject(i)))));
	//   28   56:aload_3         
	//   29   57:new             #49  <Class PathComponent>
	//   30   60:dup             
	//   31   61:aload           4
	//   32   63:iload_2         
	//   33   64:invokevirtual   #53  <Method JSONObject JSONArray.getJSONObject(int)>
	//   34   67:invokespecial   #55  <Method void PathComponent(JSONObject)>
	//   35   70:invokevirtual   #59  <Method boolean ArrayList.add(Object)>
	//   36   73:pop             

	//   37   74:iload_2         
	//   38   75:iconst_1        
	//   39   76:iadd            
	//   40   77:istore_2        
		}
	//*  41   78:goto            47
		path = ((List) (arraylist));
	//   42   81:aload_0         
	//   43   82:aload_3         
	//   44   83:putfield        #61  <Field List path>
		pathType = jsonobject.optString("path_type", "absolute");
	//   45   86:aload_0         
	//   46   87:aload_1         
	//   47   88:ldc1            #63  <String "path_type">
	//   48   90:ldc1            #65  <String "absolute">
	//   49   92:invokevirtual   #68  <Method String JSONObject.optString(String, String)>
	//   50   95:putfield        #70  <Field String pathType>
	//   51   98:return          
	}

	public final String name;
	public final List path;
	public final String pathType;
	public final String value;
}
