// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//			GraphRequest, GraphResponse, LoggingBehavior

class GraphRequest$4
	implements llback
{

	public void onCompleted(GraphResponse graphresponse)
	{
		Object obj = ((Object) (graphresponse.getJSONObject()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #33  <Method JSONObject GraphResponse.getJSONObject()>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          19
			obj = ((Object) (((JSONObject) (obj)).optJSONObject("__debug__")));
	//    5    9:aload_3         
	//    6   10:ldc1            #35  <String "__debug__">
	//    7   12:invokevirtual   #41  <Method JSONObject JSONObject.optJSONObject(String)>
	//    8   15:astore_3        
		else
	//*   9   16:goto            21
			obj = null;
	//   10   19:aconst_null     
	//   11   20:astore_3        
		JSONArray jsonarray;
		if(obj != null)
	//*  12   21:aload_3         
	//*  13   22:ifnull          36
			jsonarray = ((JSONObject) (obj)).optJSONArray("messages");
	//   14   25:aload_3         
	//   15   26:ldc1            #43  <String "messages">
	//   16   28:invokevirtual   #47  <Method JSONArray JSONObject.optJSONArray(String)>
	//   17   31:astore          4
		else
	//*  18   33:goto            39
			jsonarray = null;
	//   19   36:aconst_null     
	//   20   37:astore          4
		if(jsonarray != null)
	//*  21   39:aload           4
	//*  22   41:ifnull          217
		{
			for(int i = 0; i < jsonarray.length(); i++)
	//*  23   44:iconst_0        
	//*  24   45:istore_2        
	//*  25   46:iload_2         
	//*  26   47:aload           4
	//*  27   49:invokevirtual   #53  <Method int JSONArray.length()>
	//*  28   52:icmpge          217
			{
				Object obj2 = ((Object) (jsonarray.optJSONObject(i)));
	//   29   55:aload           4
	//   30   57:iload_2         
	//   31   58:invokevirtual   #56  <Method JSONObject JSONArray.optJSONObject(int)>
	//   32   61:astore          6
				if(obj2 != null)
	//*  33   63:aload           6
	//*  34   65:ifnull          79
					obj = ((Object) (((JSONObject) (obj2)).optString("message")));
	//   35   68:aload           6
	//   36   70:ldc1            #58  <String "message">
	//   37   72:invokevirtual   #62  <Method String JSONObject.optString(String)>
	//   38   75:astore_3        
				else
	//*  39   76:goto            81
					obj = null;
	//   40   79:aconst_null     
	//   41   80:astore_3        
				Object obj1;
				if(obj2 != null)
	//*  42   81:aload           6
	//*  43   83:ifnull          98
					obj1 = ((Object) (((JSONObject) (obj2)).optString("type")));
	//   44   86:aload           6
	//   45   88:ldc1            #64  <String "type">
	//   46   90:invokevirtual   #62  <Method String JSONObject.optString(String)>
	//   47   93:astore          5
				else
	//*  48   95:goto            101
					obj1 = null;
	//   49   98:aconst_null     
	//   50   99:astore          5
				if(obj2 != null)
	//*  51  101:aload           6
	//*  52  103:ifnull          118
					obj2 = ((Object) (((JSONObject) (obj2)).optString("link")));
	//   53  106:aload           6
	//   54  108:ldc1            #66  <String "link">
	//   55  110:invokevirtual   #62  <Method String JSONObject.optString(String)>
	//   56  113:astore          6
				else
	//*  57  115:goto            121
					obj2 = null;
	//   58  118:aconst_null     
	//   59  119:astore          6
				if(obj == null || obj1 == null)
					continue;
	//   60  121:aload_3         
	//   61  122:ifnull          210
	//   62  125:aload           5
	//   63  127:ifnull          210
				LoggingBehavior loggingbehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
	//   64  130:getstatic       #72  <Field LoggingBehavior LoggingBehavior.GRAPH_API_DEBUG_INFO>
	//   65  133:astore          7
				if(((String) (obj1)).equals("warning"))
	//*  66  135:aload           5
	//*  67  137:ldc1            #74  <String "warning">
	//*  68  139:invokevirtual   #80  <Method boolean String.equals(Object)>
	//*  69  142:ifeq            150
					loggingbehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
	//   70  145:getstatic       #83  <Field LoggingBehavior LoggingBehavior.GRAPH_API_DEBUG_WARNING>
	//   71  148:astore          7
				obj1 = obj;
	//   72  150:aload_3         
	//   73  151:astore          5
				if(!Utility.isNullOrEmpty(((String) (obj2))))
	//*  74  153:aload           6
	//*  75  155:invokestatic    #89  <Method boolean Utility.isNullOrEmpty(String)>
	//*  76  158:ifne            200
				{
					obj1 = ((Object) (new StringBuilder()));
	//   77  161:new             #91  <Class StringBuilder>
	//   78  164:dup             
	//   79  165:invokespecial   #92  <Method void StringBuilder()>
	//   80  168:astore          5
					((StringBuilder) (obj1)).append(((String) (obj)));
	//   81  170:aload           5
	//   82  172:aload_3         
	//   83  173:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   84  176:pop             
					((StringBuilder) (obj1)).append(" Link: ");
	//   85  177:aload           5
	//   86  179:ldc1            #98  <String " Link: ">
	//   87  181:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   88  184:pop             
					((StringBuilder) (obj1)).append(((String) (obj2)));
	//   89  185:aload           5
	//   90  187:aload           6
	//   91  189:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   92  192:pop             
					obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   93  193:aload           5
	//   94  195:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   95  198:astore          5
				}
				Logger.log(loggingbehavior, GraphRequest.TAG, ((String) (obj1)));
	//   96  200:aload           7
	//   97  202:getstatic       #106 <Field String GraphRequest.TAG>
	//   98  205:aload           5
	//   99  207:invokestatic    #112 <Method void Logger.log(LoggingBehavior, String, String)>
			}

	//  100  210:iload_2         
	//  101  211:iconst_1        
	//  102  212:iadd            
	//  103  213:istore_2        
		}
	//* 104  214:goto            46
		obj = ((Object) (val$callback));
	//  105  217:aload_0         
	//  106  218:getfield        #21  <Field GraphRequest$Callback val$callback>
	//  107  221:astore_3        
		if(obj != null)
	//* 108  222:aload_3         
	//* 109  223:ifnull          233
			((llback) (obj)).onCompleted(graphresponse);
	//  110  226:aload_3         
	//  111  227:aload_1         
	//  112  228:invokeinterface #114 <Method void GraphRequest$Callback.onCompleted(GraphResponse)>
	//  113  233:return          
	}

	final GraphRequest this$0;
	final llback val$callback;

	GraphRequest$4()
	{
		this$0 = final_graphrequest;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field GraphRequest this$0>
		val$callback = llback.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field GraphRequest$Callback val$callback>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
