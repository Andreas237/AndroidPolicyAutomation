// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.craftar:
//			SyncAction

class BundleJSON
{

	BundleJSON()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static ArrayList getSyncActions(JSONObject jsonobject, JSONObject jsonobject1)
		throws JSONException
	{
		JSONObject jsonobject2 = jsonobject.getJSONObject("items");
	//    0    0:aload_0         
	//    1    1:ldc1            #15  <String "items">
	//    2    3:invokevirtual   #21  <Method JSONObject JSONObject.getJSONObject(String)>
	//    3    6:astore_2        
		JSONObject jsonobject3 = jsonobject1.getJSONObject("items");
	//    4    7:aload_1         
	//    5    8:ldc1            #15  <String "items">
	//    6   10:invokevirtual   #21  <Method JSONObject JSONObject.getJSONObject(String)>
	//    7   13:astore_3        
		ArrayList arraylist = new ArrayList();
	//    8   14:new             #23  <Class ArrayList>
	//    9   17:dup             
	//   10   18:invokespecial   #24  <Method void ArrayList()>
	//   11   21:astore          4
		jsonobject1 = ((JSONObject) (jsonobject1.getJSONObject("items").keys()));
	//   12   23:aload_1         
	//   13   24:ldc1            #15  <String "items">
	//   14   26:invokevirtual   #21  <Method JSONObject JSONObject.getJSONObject(String)>
	//   15   29:invokevirtual   #28  <Method Iterator JSONObject.keys()>
	//   16   32:astore_1        
		Iterator iterator = jsonobject.getJSONObject("items").keys();
	//   17   33:aload_0         
	//   18   34:ldc1            #15  <String "items">
	//   19   36:invokevirtual   #21  <Method JSONObject JSONObject.getJSONObject(String)>
	//   20   39:invokevirtual   #28  <Method Iterator JSONObject.keys()>
	//   21   42:astore          5
		for(; ((Iterator) (jsonobject1)).hasNext(); arraylist.add(((Object) (jsonobject))))
	//*  22   44:aload_1         
	//*  23   45:invokeinterface #34  <Method boolean Iterator.hasNext()>
	//*  24   50:ifeq            122
		{
			jsonobject = ((JSONObject) ((String)((Iterator) (jsonobject1)).next()));
	//   25   53:aload_1         
	//   26   54:invokeinterface #38  <Method Object Iterator.next()>
	//   27   59:checkcast       #40  <Class String>
	//   28   62:astore_0        
			JSONObject jsonobject4 = jsonobject3.getJSONObject(((String) (jsonobject)));
	//   29   63:aload_3         
	//   30   64:aload_0         
	//   31   65:invokevirtual   #21  <Method JSONObject JSONObject.getJSONObject(String)>
	//   32   68:astore          6
			if(jsonobject2.has(((String) (jsonobject))))
	//*  33   70:aload_2         
	//*  34   71:aload_0         
	//*  35   72:invokevirtual   #44  <Method boolean JSONObject.has(String)>
	//*  36   75:ifeq            99
				jsonobject = ((JSONObject) (new SyncAction("UPDATE", ((String) (jsonobject)), jsonobject2.getJSONObject(((String) (jsonobject))), jsonobject4)));
	//   37   78:new             #46  <Class SyncAction>
	//   38   81:dup             
	//   39   82:ldc1            #48  <String "UPDATE">
	//   40   84:aload_0         
	//   41   85:aload_2         
	//   42   86:aload_0         
	//   43   87:invokevirtual   #21  <Method JSONObject JSONObject.getJSONObject(String)>
	//   44   90:aload           6
	//   45   92:invokespecial   #51  <Method void SyncAction(String, String, JSONObject, JSONObject)>
	//   46   95:astore_0        
			else
	//*  47   96:goto            112
				jsonobject = ((JSONObject) (new SyncAction("DELETE", ((String) (jsonobject)), jsonobject4)));
	//   48   99:new             #46  <Class SyncAction>
	//   49  102:dup             
	//   50  103:ldc1            #53  <String "DELETE">
	//   51  105:aload_0         
	//   52  106:aload           6
	//   53  108:invokespecial   #56  <Method void SyncAction(String, String, JSONObject)>
	//   54  111:astore_0        
		}

	//   55  112:aload           4
	//   56  114:aload_0         
	//   57  115:invokevirtual   #60  <Method boolean ArrayList.add(Object)>
	//   58  118:pop             
	//*  59  119:goto            44
		do
		{
			if(!iterator.hasNext())
				break;
	//   60  122:aload           5
	//   61  124:invokeinterface #34  <Method boolean Iterator.hasNext()>
	//   62  129:ifeq            175
			jsonobject = ((JSONObject) ((String)iterator.next()));
	//   63  132:aload           5
	//   64  134:invokeinterface #38  <Method Object Iterator.next()>
	//   65  139:checkcast       #40  <Class String>
	//   66  142:astore_0        
			if(!jsonobject3.has(((String) (jsonobject))))
	//*  67  143:aload_3         
	//*  68  144:aload_0         
	//*  69  145:invokevirtual   #44  <Method boolean JSONObject.has(String)>
	//*  70  148:ifne            122
				arraylist.add(((Object) (new SyncAction("ADD", ((String) (jsonobject)), jsonobject2.getJSONObject(((String) (jsonobject)))))));
	//   71  151:aload           4
	//   72  153:new             #46  <Class SyncAction>
	//   73  156:dup             
	//   74  157:ldc1            #62  <String "ADD">
	//   75  159:aload_0         
	//   76  160:aload_2         
	//   77  161:aload_0         
	//   78  162:invokevirtual   #21  <Method JSONObject JSONObject.getJSONObject(String)>
	//   79  165:invokespecial   #56  <Method void SyncAction(String, String, JSONObject)>
	//   80  168:invokevirtual   #60  <Method boolean ArrayList.add(Object)>
	//   81  171:pop             
		} while(true);
	//   82  172:goto            122
		return arraylist;
	//   83  175:aload           4
	//   84  177:areturn         
	}
}
