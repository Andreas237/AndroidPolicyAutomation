// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.*;
import org.json.*;

// Referenced classes of package com.facebook:
//			GraphRequest, FacebookRequestError, AccessToken, FacebookException, 
//			LoggingBehavior, GraphRequestBatch

public class GraphResponse
{
	public static final class PagingDirection extends Enum
	{

		public static PagingDirection valueOf(String s)
		{
			return (PagingDirection)Enum.valueOf(com/facebook/GraphResponse$PagingDirection, s);
		//    0    0:ldc1            #2   <Class GraphResponse$PagingDirection>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class GraphResponse$PagingDirection>
		//    4    9:areturn         
		}

		public static PagingDirection[] values()
		{
			return (PagingDirection[])((PagingDirection []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field GraphResponse$PagingDirection[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.GraphResponse$PagingDirection_3B_.clone()>
		//    2    6:checkcast       #38  <Class GraphResponse$PagingDirection[]>
		//    3    9:areturn         
		}

		private static final PagingDirection $VALUES[];
		public static final PagingDirection NEXT;
		public static final PagingDirection PREVIOUS;

		static 
		{
			NEXT = new PagingDirection("NEXT", 0);
		//    0    0:new             #2   <Class GraphResponse$PagingDirection>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "NEXT">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void GraphResponse$PagingDirection(String, int)>
		//    5   10:putstatic       #22  <Field GraphResponse$PagingDirection NEXT>
			PREVIOUS = new PagingDirection("PREVIOUS", 1);
		//    6   13:new             #2   <Class GraphResponse$PagingDirection>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "PREVIOUS">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void GraphResponse$PagingDirection(String, int)>
		//   11   23:putstatic       #25  <Field GraphResponse$PagingDirection PREVIOUS>
			$VALUES = (new PagingDirection[] {
				NEXT, PREVIOUS
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       PagingDirection[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field GraphResponse$PagingDirection NEXT>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field GraphResponse$PagingDirection PREVIOUS>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field GraphResponse$PagingDirection[] $VALUES>
		//*  23   45:return          
		}

		private PagingDirection(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	GraphResponse(GraphRequest graphrequest, HttpURLConnection httpurlconnection, FacebookRequestError facebookrequesterror)
	{
		this(graphrequest, httpurlconnection, ((String) (null)), ((JSONObject) (null)), ((JSONArray) (null)), facebookrequesterror);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:aload_3         
	//    7    7:invokespecial   #39  <Method void GraphResponse(GraphRequest, HttpURLConnection, String, JSONObject, JSONArray, FacebookRequestError)>
	//    8   10:return          
	}

	GraphResponse(GraphRequest graphrequest, HttpURLConnection httpurlconnection, String s, JSONArray jsonarray)
	{
		this(graphrequest, httpurlconnection, s, ((JSONObject) (null)), jsonarray, ((FacebookRequestError) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:aload           4
	//    6    7:aconst_null     
	//    7    8:invokespecial   #39  <Method void GraphResponse(GraphRequest, HttpURLConnection, String, JSONObject, JSONArray, FacebookRequestError)>
	//    8   11:return          
	}

	GraphResponse(GraphRequest graphrequest, HttpURLConnection httpurlconnection, String s, JSONObject jsonobject)
	{
		this(graphrequest, httpurlconnection, s, jsonobject, ((JSONArray) (null)), ((FacebookRequestError) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:aconst_null     
	//    7    8:invokespecial   #39  <Method void GraphResponse(GraphRequest, HttpURLConnection, String, JSONObject, JSONArray, FacebookRequestError)>
	//    8   11:return          
	}

	GraphResponse(GraphRequest graphrequest, HttpURLConnection httpurlconnection, String s, JSONObject jsonobject, JSONArray jsonarray, FacebookRequestError facebookrequesterror)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		request = graphrequest;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #47  <Field GraphRequest request>
		connection = httpurlconnection;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #49  <Field HttpURLConnection connection>
		rawResponse = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #51  <Field String rawResponse>
		graphObject = jsonobject;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #53  <Field JSONObject graphObject>
		graphObjectArray = jsonarray;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #55  <Field JSONArray graphObjectArray>
		error = facebookrequesterror;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #57  <Field FacebookRequestError error>
	//   20   37:return          
	}

	static List constructErrorResponses(List list, HttpURLConnection httpurlconnection, FacebookException facebookexception)
	{
		int j = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #65  <Method int List.size()>
	//    2    6:istore          4
		ArrayList arraylist = new ArrayList(j);
	//    3    8:new             #67  <Class ArrayList>
	//    4   11:dup             
	//    5   12:iload           4
	//    6   14:invokespecial   #70  <Method void ArrayList(int)>
	//    7   17:astore          5
		for(int i = 0; i < j; i++)
	//*   8   19:iconst_0        
	//*   9   20:istore_3        
	//*  10   21:iload_3         
	//*  11   22:iload           4
	//*  12   24:icmpge          69
			((List) (arraylist)).add(((Object) (new GraphResponse((GraphRequest)list.get(i), httpurlconnection, new FacebookRequestError(httpurlconnection, ((Exception) (facebookexception)))))));
	//   13   27:aload           5
	//   14   29:new             #2   <Class GraphResponse>
	//   15   32:dup             
	//   16   33:aload_0         
	//   17   34:iload_3         
	//   18   35:invokeinterface #74  <Method Object List.get(int)>
	//   19   40:checkcast       #76  <Class GraphRequest>
	//   20   43:aload_1         
	//   21   44:new             #78  <Class FacebookRequestError>
	//   22   47:dup             
	//   23   48:aload_1         
	//   24   49:aload_2         
	//   25   50:invokespecial   #81  <Method void FacebookRequestError(HttpURLConnection, Exception)>
	//   26   53:invokespecial   #83  <Method void GraphResponse(GraphRequest, HttpURLConnection, FacebookRequestError)>
	//   27   56:invokeinterface #87  <Method boolean List.add(Object)>
	//   28   61:pop             

	//   29   62:iload_3         
	//   30   63:iconst_1        
	//   31   64:iadd            
	//   32   65:istore_3        
	//*  33   66:goto            21
		return ((List) (arraylist));
	//   34   69:aload           5
	//   35   71:areturn         
	}

	private static GraphResponse createResponseFromObject(GraphRequest graphrequest, HttpURLConnection httpurlconnection, Object obj, Object obj1)
		throws JSONException
	{
		Object obj2 = obj;
	//    0    0:aload_2         
	//    1    1:astore          4
		if(obj instanceof JSONObject)
	//*   2    3:aload_2         
	//*   3    4:instanceof      #95  <Class JSONObject>
	//*   4    7:ifeq            125
		{
			obj = ((Object) ((JSONObject)obj));
	//    5   10:aload_2         
	//    6   11:checkcast       #95  <Class JSONObject>
	//    7   14:astore_2        
			obj1 = ((Object) (FacebookRequestError.checkResponseAndCreateError(((JSONObject) (obj)), obj1, httpurlconnection)));
	//    8   15:aload_2         
	//    9   16:aload_3         
	//   10   17:aload_1         
	//   11   18:invokestatic    #99  <Method FacebookRequestError FacebookRequestError.checkResponseAndCreateError(JSONObject, Object, HttpURLConnection)>
	//   12   21:astore_3        
			if(obj1 != null)
	//*  13   22:aload_3         
	//*  14   23:ifnull          61
			{
				if(((FacebookRequestError) (obj1)).getErrorCode() == 190 && Utility.isCurrentAccessToken(graphrequest.getAccessToken()))
	//*  15   26:aload_3         
	//*  16   27:invokevirtual   #102 <Method int FacebookRequestError.getErrorCode()>
	//*  17   30:sipush          190
	//*  18   33:icmpne          50
	//*  19   36:aload_0         
	//*  20   37:invokevirtual   #106 <Method AccessToken GraphRequest.getAccessToken()>
	//*  21   40:invokestatic    #112 <Method boolean Utility.isCurrentAccessToken(AccessToken)>
	//*  22   43:ifeq            50
					AccessToken.setCurrentAccessToken(((AccessToken) (null)));
	//   23   46:aconst_null     
	//   24   47:invokestatic    #118 <Method void AccessToken.setCurrentAccessToken(AccessToken)>
				return new GraphResponse(graphrequest, httpurlconnection, ((FacebookRequestError) (obj1)));
	//   25   50:new             #2   <Class GraphResponse>
	//   26   53:dup             
	//   27   54:aload_0         
	//   28   55:aload_1         
	//   29   56:aload_3         
	//   30   57:invokespecial   #83  <Method void GraphResponse(GraphRequest, HttpURLConnection, FacebookRequestError)>
	//   31   60:areturn         
			}
			obj = Utility.getStringPropertyAsJSON(((JSONObject) (obj)), "body", "FACEBOOK_NON_JSON_RESULT");
	//   32   61:aload_2         
	//   33   62:ldc1            #11  <String "body">
	//   34   64:ldc1            #17  <String "FACEBOOK_NON_JSON_RESULT">
	//   35   66:invokestatic    #122 <Method Object Utility.getStringPropertyAsJSON(JSONObject, String, String)>
	//   36   69:astore_2        
			if(obj instanceof JSONObject)
	//*  37   70:aload_2         
	//*  38   71:instanceof      #95  <Class JSONObject>
	//*  39   74:ifeq            95
				return new GraphResponse(graphrequest, httpurlconnection, obj.toString(), (JSONObject)obj);
	//   40   77:new             #2   <Class GraphResponse>
	//   41   80:dup             
	//   42   81:aload_0         
	//   43   82:aload_1         
	//   44   83:aload_2         
	//   45   84:invokevirtual   #126 <Method String Object.toString()>
	//   46   87:aload_2         
	//   47   88:checkcast       #95  <Class JSONObject>
	//   48   91:invokespecial   #128 <Method void GraphResponse(GraphRequest, HttpURLConnection, String, JSONObject)>
	//   49   94:areturn         
			if(obj instanceof JSONArray)
	//*  50   95:aload_2         
	//*  51   96:instanceof      #130 <Class JSONArray>
	//*  52   99:ifeq            120
				return new GraphResponse(graphrequest, httpurlconnection, obj.toString(), (JSONArray)obj);
	//   53  102:new             #2   <Class GraphResponse>
	//   54  105:dup             
	//   55  106:aload_0         
	//   56  107:aload_1         
	//   57  108:aload_2         
	//   58  109:invokevirtual   #126 <Method String Object.toString()>
	//   59  112:aload_2         
	//   60  113:checkcast       #130 <Class JSONArray>
	//   61  116:invokespecial   #132 <Method void GraphResponse(GraphRequest, HttpURLConnection, String, JSONArray)>
	//   62  119:areturn         
			obj2 = JSONObject.NULL;
	//   63  120:getstatic       #136 <Field Object JSONObject.NULL>
	//   64  123:astore          4
		}
		if(obj2 == JSONObject.NULL)
	//*  65  125:aload           4
	//*  66  127:getstatic       #136 <Field Object JSONObject.NULL>
	//*  67  130:if_acmpne       152
		{
			return new GraphResponse(graphrequest, httpurlconnection, obj2.toString(), (JSONObject)null);
	//   68  133:new             #2   <Class GraphResponse>
	//   69  136:dup             
	//   70  137:aload_0         
	//   71  138:aload_1         
	//   72  139:aload           4
	//   73  141:invokevirtual   #126 <Method String Object.toString()>
	//   74  144:aconst_null     
	//   75  145:checkcast       #95  <Class JSONObject>
	//   76  148:invokespecial   #128 <Method void GraphResponse(GraphRequest, HttpURLConnection, String, JSONObject)>
	//   77  151:areturn         
		} else
		{
			graphrequest = ((GraphRequest) (new StringBuilder()));
	//   78  152:new             #138 <Class StringBuilder>
	//   79  155:dup             
	//   80  156:invokespecial   #139 <Method void StringBuilder()>
	//   81  159:astore_0        
			((StringBuilder) (graphrequest)).append("Got unexpected object type in response, class: ");
	//   82  160:aload_0         
	//   83  161:ldc1            #141 <String "Got unexpected object type in response, class: ">
	//   84  163:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//   85  166:pop             
			((StringBuilder) (graphrequest)).append(obj2.getClass().getSimpleName());
	//   86  167:aload_0         
	//   87  168:aload           4
	//   88  170:invokevirtual   #149 <Method Class Object.getClass()>
	//   89  173:invokevirtual   #154 <Method String Class.getSimpleName()>
	//   90  176:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//   91  179:pop             
			throw new FacebookException(((StringBuilder) (graphrequest)).toString());
	//   92  180:new             #156 <Class FacebookException>
	//   93  183:dup             
	//   94  184:aload_0         
	//   95  185:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   96  188:invokespecial   #160 <Method void FacebookException(String)>
	//   97  191:athrow          
		}
	}

	private static List createResponsesFromObject(HttpURLConnection httpurlconnection, List list, Object obj)
		throws FacebookException, JSONException
	{
		boolean flag;
		int j;
		ArrayList arraylist;
		j = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #65  <Method int List.size()>
	//    2    6:istore          5
		arraylist = new ArrayList(j);
	//    3    8:new             #67  <Class ArrayList>
	//    4   11:dup             
	//    5   12:iload           5
	//    6   14:invokespecial   #70  <Method void ArrayList(int)>
	//    7   17:astore          7
		flag = false;
	//    8   19:iconst_0        
	//    9   20:istore          4
		if(j != 1) goto _L2; else goto _L1
	//   10   22:iload           5
	//   11   24:iconst_1        
	//   12   25:icmpne          162
_L1:
		GraphRequest graphrequest = (GraphRequest)list.get(0);
	//   13   28:aload_1         
	//   14   29:iconst_0        
	//   15   30:invokeinterface #74  <Method Object List.get(int)>
	//   16   35:checkcast       #76  <Class GraphRequest>
	//   17   38:astore          8
		JSONObject jsonobject;
		jsonobject = new JSONObject();
	//   18   40:new             #95  <Class JSONObject>
	//   19   43:dup             
	//   20   44:invokespecial   #166 <Method void JSONObject()>
	//   21   47:astore          9
		jsonobject.put("body", obj);
	//   22   49:aload           9
	//   23   51:ldc1            #11  <String "body">
	//   24   53:aload_2         
	//   25   54:invokevirtual   #170 <Method JSONObject JSONObject.put(String, Object)>
	//   26   57:pop             
		if(httpurlconnection == null) goto _L4; else goto _L3
	//   27   58:aload_0         
	//   28   59:ifnull          324
_L3:
		int i = httpurlconnection.getResponseCode();
	//   29   62:aload_0         
	//   30   63:invokevirtual   #175 <Method int HttpURLConnection.getResponseCode()>
	//   31   66:istore_3        
	//*  32   67:goto            70
_L7:
		Object obj1;
		jsonobject.put("code", i);
	//   33   70:aload           9
	//   34   72:ldc1            #14  <String "code">
	//   35   74:iload_3         
	//   36   75:invokevirtual   #178 <Method JSONObject JSONObject.put(String, int)>
	//   37   78:pop             
		obj1 = ((Object) (new JSONArray()));
	//   38   79:new             #130 <Class JSONArray>
	//   39   82:dup             
	//   40   83:invokespecial   #179 <Method void JSONArray()>
	//   41   86:astore          6
		((JSONArray) (obj1)).put(((Object) (jsonobject)));
	//   42   88:aload           6
	//   43   90:aload           9
	//   44   92:invokevirtual   #182 <Method JSONArray JSONArray.put(Object)>
	//   45   95:pop             
		  goto _L5
	//*  46   96:goto            165
		obj1;
	//   47   99:astore          6
		((List) (arraylist)).add(((Object) (new GraphResponse(graphrequest, httpurlconnection, new FacebookRequestError(httpurlconnection, ((Exception) (obj1)))))));
	//   48  101:aload           7
	//   49  103:new             #2   <Class GraphResponse>
	//   50  106:dup             
	//   51  107:aload           8
	//   52  109:aload_0         
	//   53  110:new             #78  <Class FacebookRequestError>
	//   54  113:dup             
	//   55  114:aload_0         
	//   56  115:aload           6
	//   57  117:invokespecial   #81  <Method void FacebookRequestError(HttpURLConnection, Exception)>
	//   58  120:invokespecial   #83  <Method void GraphResponse(GraphRequest, HttpURLConnection, FacebookRequestError)>
	//   59  123:invokeinterface #87  <Method boolean List.add(Object)>
	//   60  128:pop             
		  goto _L2
	//*  61  129:goto            162
		obj1;
	//   62  132:astore          6
		((List) (arraylist)).add(((Object) (new GraphResponse(graphrequest, httpurlconnection, new FacebookRequestError(httpurlconnection, ((Exception) (obj1)))))));
	//   63  134:aload           7
	//   64  136:new             #2   <Class GraphResponse>
	//   65  139:dup             
	//   66  140:aload           8
	//   67  142:aload_0         
	//   68  143:new             #78  <Class FacebookRequestError>
	//   69  146:dup             
	//   70  147:aload_0         
	//   71  148:aload           6
	//   72  150:invokespecial   #81  <Method void FacebookRequestError(HttpURLConnection, Exception)>
	//   73  153:invokespecial   #83  <Method void GraphResponse(GraphRequest, HttpURLConnection, FacebookRequestError)>
	//   74  156:invokeinterface #87  <Method boolean List.add(Object)>
	//   75  161:pop             
_L2:
		obj1 = obj;
	//   76  162:aload_2         
	//   77  163:astore          6
_L5:
		if(obj1 instanceof JSONArray)
	//*  78  165:aload           6
	//*  79  167:instanceof      #130 <Class JSONArray>
	//*  80  170:ifeq            314
		{
			obj1 = ((Object) ((JSONArray)obj1));
	//   81  173:aload           6
	//   82  175:checkcast       #130 <Class JSONArray>
	//   83  178:astore          6
			i = ((int) (flag));
	//   84  180:iload           4
	//   85  182:istore_3        
			if(((JSONArray) (obj1)).length() == j)
	//*  86  183:aload           6
	//*  87  185:invokevirtual   #185 <Method int JSONArray.length()>
	//*  88  188:iload           5
	//*  89  190:icmpeq          196
	//*  90  193:goto            314
			{
				for(; i < ((JSONArray) (obj1)).length(); i++)
	//*  91  196:iload_3         
	//*  92  197:aload           6
	//*  93  199:invokevirtual   #185 <Method int JSONArray.length()>
	//*  94  202:icmpge          311
				{
					GraphRequest graphrequest1 = (GraphRequest)list.get(i);
	//   95  205:aload_1         
	//   96  206:iload_3         
	//   97  207:invokeinterface #74  <Method Object List.get(int)>
	//   98  212:checkcast       #76  <Class GraphRequest>
	//   99  215:astore          8
					try
					{
						((List) (arraylist)).add(((Object) (createResponseFromObject(graphrequest1, httpurlconnection, ((JSONArray) (obj1)).get(i), obj))));
	//  100  217:aload           7
	//  101  219:aload           8
	//  102  221:aload_0         
	//  103  222:aload           6
	//  104  224:iload_3         
	//  105  225:invokevirtual   #186 <Method Object JSONArray.get(int)>
	//  106  228:aload_2         
	//  107  229:invokestatic    #188 <Method GraphResponse createResponseFromObject(GraphRequest, HttpURLConnection, Object, Object)>
	//  108  232:invokeinterface #87  <Method boolean List.add(Object)>
	//  109  237:pop             
					}
	//* 110  238:goto            304
	//* 111  241:astore          9
	//* 112  243:aload           7
	//* 113  245:new             #2   <Class GraphResponse>
	//* 114  248:dup             
	//* 115  249:aload           8
	//* 116  251:aload_0         
	//* 117  252:new             #78  <Class FacebookRequestError>
	//* 118  255:dup             
	//* 119  256:aload_0         
	//* 120  257:aload           9
	//* 121  259:invokespecial   #81  <Method void FacebookRequestError(HttpURLConnection, Exception)>
	//* 122  262:invokespecial   #83  <Method void GraphResponse(GraphRequest, HttpURLConnection, FacebookRequestError)>
	//* 123  265:invokeinterface #87  <Method boolean List.add(Object)>
	//* 124  270:pop             
	//* 125  271:goto            304
					catch(JSONException jsonexception)
	//* 126  274:astore          9
					{
						((List) (arraylist)).add(((Object) (new GraphResponse(graphrequest1, httpurlconnection, new FacebookRequestError(httpurlconnection, ((Exception) (jsonexception)))))));
	//  127  276:aload           7
	//  128  278:new             #2   <Class GraphResponse>
	//  129  281:dup             
	//  130  282:aload           8
	//  131  284:aload_0         
	//  132  285:new             #78  <Class FacebookRequestError>
	//  133  288:dup             
	//  134  289:aload_0         
	//  135  290:aload           9
	//  136  292:invokespecial   #81  <Method void FacebookRequestError(HttpURLConnection, Exception)>
	//  137  295:invokespecial   #83  <Method void GraphResponse(GraphRequest, HttpURLConnection, FacebookRequestError)>
	//  138  298:invokeinterface #87  <Method boolean List.add(Object)>
	//  139  303:pop             
					}
					catch(FacebookException facebookexception)
					{
						((List) (arraylist)).add(((Object) (new GraphResponse(graphrequest1, httpurlconnection, new FacebookRequestError(httpurlconnection, ((Exception) (facebookexception)))))));
					}
				}

	//  140  304:iload_3         
	//  141  305:iconst_1        
	//  142  306:iadd            
	//  143  307:istore_3        
	//* 144  308:goto            196
				return ((List) (arraylist));
	//  145  311:aload           7
	//  146  313:areturn         
			}
		}
		throw new FacebookException("Unexpected number of results");
	//  147  314:new             #156 <Class FacebookException>
	//  148  317:dup             
	//  149  318:ldc1            #190 <String "Unexpected number of results">
	//  150  320:invokespecial   #160 <Method void FacebookException(String)>
	//  151  323:athrow          
_L4:
		i = 200;
	//  152  324:sipush          200
	//  153  327:istore_3        
		if(true) goto _L7; else goto _L6
	//  154  328:goto            70
_L6:
	}

	static List createResponsesFromStream(InputStream inputstream, HttpURLConnection httpurlconnection, GraphRequestBatch graphrequestbatch)
		throws FacebookException, JSONException, IOException
	{
		inputstream = ((InputStream) (Utility.readStreamToString(inputstream)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #197 <Method String Utility.readStreamToString(InputStream)>
	//    2    4:astore_0        
		Logger.log(LoggingBehavior.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", new Object[] {
			Integer.valueOf(((String) (inputstream)).length()), inputstream
		});
	//    3    5:getstatic       #203 <Field LoggingBehavior LoggingBehavior.INCLUDE_RAW_RESPONSES>
	//    4    8:ldc1            #20  <String "Response">
	//    5   10:ldc1            #205 <String "Response (raw)\n  Size: %d\n  Response:\n%s\n">
	//    6   12:iconst_2        
	//    7   13:anewarray       Object[]
	//    8   16:dup             
	//    9   17:iconst_0        
	//   10   18:aload_0         
	//   11   19:invokevirtual   #208 <Method int String.length()>
	//   12   22:invokestatic    #214 <Method Integer Integer.valueOf(int)>
	//   13   25:aastore         
	//   14   26:dup             
	//   15   27:iconst_1        
	//   16   28:aload_0         
	//   17   29:aastore         
	//   18   30:invokestatic    #220 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
		return createResponsesFromString(((String) (inputstream)), httpurlconnection, graphrequestbatch);
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:aload_2         
	//   22   36:invokestatic    #224 <Method List createResponsesFromString(String, HttpURLConnection, GraphRequestBatch)>
	//   23   39:areturn         
	}

	static List createResponsesFromString(String s, HttpURLConnection httpurlconnection, GraphRequestBatch graphrequestbatch)
		throws FacebookException, JSONException, IOException
	{
		httpurlconnection = ((HttpURLConnection) (createResponsesFromObject(httpurlconnection, ((List) (graphrequestbatch)), (new JSONTokener(s)).nextValue())));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:new             #227 <Class JSONTokener>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:invokespecial   #228 <Method void JSONTokener(String)>
	//    6   10:invokevirtual   #232 <Method Object JSONTokener.nextValue()>
	//    7   13:invokestatic    #234 <Method List createResponsesFromObject(HttpURLConnection, List, Object)>
	//    8   16:astore_1        
		Logger.log(LoggingBehavior.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", new Object[] {
			graphrequestbatch.getId(), Integer.valueOf(s.length()), httpurlconnection
		});
	//    9   17:getstatic       #237 <Field LoggingBehavior LoggingBehavior.REQUESTS>
	//   10   20:ldc1            #20  <String "Response">
	//   11   22:ldc1            #239 <String "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n">
	//   12   24:iconst_3        
	//   13   25:anewarray       Object[]
	//   14   28:dup             
	//   15   29:iconst_0        
	//   16   30:aload_2         
	//   17   31:invokevirtual   #244 <Method String GraphRequestBatch.getId()>
	//   18   34:aastore         
	//   19   35:dup             
	//   20   36:iconst_1        
	//   21   37:aload_0         
	//   22   38:invokevirtual   #208 <Method int String.length()>
	//   23   41:invokestatic    #214 <Method Integer Integer.valueOf(int)>
	//   24   44:aastore         
	//   25   45:dup             
	//   26   46:iconst_2        
	//   27   47:aload_1         
	//   28   48:aastore         
	//   29   49:invokestatic    #220 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
		return ((List) (httpurlconnection));
	//   30   52:aload_1         
	//   31   53:areturn         
	}

	static List fromHttpConnection(HttpURLConnection httpurlconnection, GraphRequestBatch graphrequestbatch)
	{
		InputStream inputstream;
		InputStream inputstream1;
		InputStream inputstream2;
		InputStream inputstream3;
		InputStream inputstream4;
		InputStream inputstream5;
		List list;
		Object obj1;
		Object obj2;
		Object obj3;
		list = null;
	//    0    0:aconst_null     
	//    1    1:astore          8
		obj1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          9
		obj2 = null;
	//    4    6:aconst_null     
	//    5    7:astore          10
		obj3 = null;
	//    6    9:aconst_null     
	//    7   10:astore          11
		inputstream1 = null;
	//    8   12:aconst_null     
	//    9   13:astore_3        
		inputstream = inputstream1;
	//   10   14:aload_3         
	//   11   15:astore_2        
		inputstream2 = ((InputStream) (list));
	//   12   16:aload           8
	//   13   18:astore          4
		inputstream3 = ((InputStream) (obj1));
	//   14   20:aload           9
	//   15   22:astore          5
		inputstream4 = ((InputStream) (obj2));
	//   16   24:aload           10
	//   17   26:astore          6
		inputstream5 = ((InputStream) (obj3));
	//   18   28:aload           11
	//   19   30:astore          7
		if(httpurlconnection.getResponseCode() < 400)
			break MISSING_BLOCK_LABEL_68;
	//   20   32:aload_0         
	//   21   33:invokevirtual   #175 <Method int HttpURLConnection.getResponseCode()>
	//   22   36:sipush          400
	//   23   39:icmplt          68
		inputstream = inputstream1;
	//   24   42:aload_3         
	//   25   43:astore_2        
		inputstream2 = ((InputStream) (list));
	//   26   44:aload           8
	//   27   46:astore          4
		inputstream3 = ((InputStream) (obj1));
	//   28   48:aload           9
	//   29   50:astore          5
		inputstream4 = ((InputStream) (obj2));
	//   30   52:aload           10
	//   31   54:astore          6
		inputstream5 = ((InputStream) (obj3));
	//   32   56:aload           11
	//   33   58:astore          7
		inputstream1 = httpurlconnection.getErrorStream();
	//   34   60:aload_0         
	//   35   61:invokevirtual   #253 <Method InputStream HttpURLConnection.getErrorStream()>
	//   36   64:astore_3        
		break MISSING_BLOCK_LABEL_94;
	//   37   65:goto            314
		inputstream = inputstream1;
	//   38   68:aload_3         
	//   39   69:astore_2        
		inputstream2 = ((InputStream) (list));
	//   40   70:aload           8
	//   41   72:astore          4
		inputstream3 = ((InputStream) (obj1));
	//   42   74:aload           9
	//   43   76:astore          5
		inputstream4 = ((InputStream) (obj2));
	//   44   78:aload           10
	//   45   80:astore          6
		inputstream5 = ((InputStream) (obj3));
	//   46   82:aload           11
	//   47   84:astore          7
		inputstream1 = httpurlconnection.getInputStream();
	//   48   86:aload_0         
	//   49   87:invokevirtual   #256 <Method InputStream HttpURLConnection.getInputStream()>
	//   50   90:astore_3        
	//*  51   91:goto            314
		inputstream = inputstream1;
	//   52   94:aload_3         
	//   53   95:astore_2        
		inputstream2 = inputstream1;
	//   54   96:aload_3         
	//   55   97:astore          4
		inputstream3 = inputstream1;
	//   56   99:aload_3         
	//   57  100:astore          5
		inputstream4 = inputstream1;
	//   58  102:aload_3         
	//   59  103:astore          6
		inputstream5 = inputstream1;
	//   60  105:aload_3         
	//   61  106:astore          7
		list = createResponsesFromStream(inputstream1, httpurlconnection, graphrequestbatch);
	//   62  108:aload_3         
	//   63  109:aload_0         
	//   64  110:aload_1         
	//   65  111:invokestatic    #258 <Method List createResponsesFromStream(InputStream, HttpURLConnection, GraphRequestBatch)>
	//   66  114:astore          8
		Utility.closeQuietly(((java.io.Closeable) (inputstream1)));
	//   67  116:aload_3         
	//   68  117:invokestatic    #262 <Method void Utility.closeQuietly(java.io.Closeable)>
		return list;
	//   69  120:aload           8
	//   70  122:areturn         
		httpurlconnection;
	//   71  123:astore_0        
		break MISSING_BLOCK_LABEL_308;
	//   72  124:goto            308
		Object obj;
		obj;
	//   73  127:astore_3        
		inputstream = inputstream2;
	//   74  128:aload           4
	//   75  130:astore_2        
		Logger.log(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", new Object[] {
			obj
		});
	//   76  131:getstatic       #237 <Field LoggingBehavior LoggingBehavior.REQUESTS>
	//   77  134:ldc1            #20  <String "Response">
	//   78  136:ldc2            #264 <String "Response <Error>: %s">
	//   79  139:iconst_1        
	//   80  140:anewarray       Object[]
	//   81  143:dup             
	//   82  144:iconst_0        
	//   83  145:aload_3         
	//   84  146:aastore         
	//   85  147:invokestatic    #220 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
		inputstream = inputstream2;
	//   86  150:aload           4
	//   87  152:astore_2        
		httpurlconnection = ((HttpURLConnection) (constructErrorResponses(((List) (graphrequestbatch)), httpurlconnection, new FacebookException(((Throwable) (obj))))));
	//   88  153:aload_1         
	//   89  154:aload_0         
	//   90  155:new             #156 <Class FacebookException>
	//   91  158:dup             
	//   92  159:aload_3         
	//   93  160:invokespecial   #267 <Method void FacebookException(Throwable)>
	//   94  163:invokestatic    #269 <Method List constructErrorResponses(List, HttpURLConnection, FacebookException)>
	//   95  166:astore_0        
		Utility.closeQuietly(((java.io.Closeable) (inputstream2)));
	//   96  167:aload           4
	//   97  169:invokestatic    #262 <Method void Utility.closeQuietly(java.io.Closeable)>
		return ((List) (httpurlconnection));
	//   98  172:aload_0         
	//   99  173:areturn         
		obj;
	//  100  174:astore_3        
		inputstream = inputstream3;
	//  101  175:aload           5
	//  102  177:astore_2        
		Logger.log(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", new Object[] {
			obj
		});
	//  103  178:getstatic       #237 <Field LoggingBehavior LoggingBehavior.REQUESTS>
	//  104  181:ldc1            #20  <String "Response">
	//  105  183:ldc2            #264 <String "Response <Error>: %s">
	//  106  186:iconst_1        
	//  107  187:anewarray       Object[]
	//  108  190:dup             
	//  109  191:iconst_0        
	//  110  192:aload_3         
	//  111  193:aastore         
	//  112  194:invokestatic    #220 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
		inputstream = inputstream3;
	//  113  197:aload           5
	//  114  199:astore_2        
		httpurlconnection = ((HttpURLConnection) (constructErrorResponses(((List) (graphrequestbatch)), httpurlconnection, new FacebookException(((Throwable) (obj))))));
	//  115  200:aload_1         
	//  116  201:aload_0         
	//  117  202:new             #156 <Class FacebookException>
	//  118  205:dup             
	//  119  206:aload_3         
	//  120  207:invokespecial   #267 <Method void FacebookException(Throwable)>
	//  121  210:invokestatic    #269 <Method List constructErrorResponses(List, HttpURLConnection, FacebookException)>
	//  122  213:astore_0        
		Utility.closeQuietly(((java.io.Closeable) (inputstream3)));
	//  123  214:aload           5
	//  124  216:invokestatic    #262 <Method void Utility.closeQuietly(java.io.Closeable)>
		return ((List) (httpurlconnection));
	//  125  219:aload_0         
	//  126  220:areturn         
		obj;
	//  127  221:astore_3        
		inputstream = inputstream4;
	//  128  222:aload           6
	//  129  224:astore_2        
		Logger.log(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", new Object[] {
			obj
		});
	//  130  225:getstatic       #237 <Field LoggingBehavior LoggingBehavior.REQUESTS>
	//  131  228:ldc1            #20  <String "Response">
	//  132  230:ldc2            #264 <String "Response <Error>: %s">
	//  133  233:iconst_1        
	//  134  234:anewarray       Object[]
	//  135  237:dup             
	//  136  238:iconst_0        
	//  137  239:aload_3         
	//  138  240:aastore         
	//  139  241:invokestatic    #220 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
		inputstream = inputstream4;
	//  140  244:aload           6
	//  141  246:astore_2        
		httpurlconnection = ((HttpURLConnection) (constructErrorResponses(((List) (graphrequestbatch)), httpurlconnection, new FacebookException(((Throwable) (obj))))));
	//  142  247:aload_1         
	//  143  248:aload_0         
	//  144  249:new             #156 <Class FacebookException>
	//  145  252:dup             
	//  146  253:aload_3         
	//  147  254:invokespecial   #267 <Method void FacebookException(Throwable)>
	//  148  257:invokestatic    #269 <Method List constructErrorResponses(List, HttpURLConnection, FacebookException)>
	//  149  260:astore_0        
		Utility.closeQuietly(((java.io.Closeable) (inputstream4)));
	//  150  261:aload           6
	//  151  263:invokestatic    #262 <Method void Utility.closeQuietly(java.io.Closeable)>
		return ((List) (httpurlconnection));
	//  152  266:aload_0         
	//  153  267:areturn         
		obj;
	//  154  268:astore_3        
		inputstream = inputstream5;
	//  155  269:aload           7
	//  156  271:astore_2        
		Logger.log(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", new Object[] {
			obj
		});
	//  157  272:getstatic       #237 <Field LoggingBehavior LoggingBehavior.REQUESTS>
	//  158  275:ldc1            #20  <String "Response">
	//  159  277:ldc2            #264 <String "Response <Error>: %s">
	//  160  280:iconst_1        
	//  161  281:anewarray       Object[]
	//  162  284:dup             
	//  163  285:iconst_0        
	//  164  286:aload_3         
	//  165  287:aastore         
	//  166  288:invokestatic    #220 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
		inputstream = inputstream5;
	//  167  291:aload           7
	//  168  293:astore_2        
		httpurlconnection = ((HttpURLConnection) (constructErrorResponses(((List) (graphrequestbatch)), httpurlconnection, ((FacebookException) (obj)))));
	//  169  294:aload_1         
	//  170  295:aload_0         
	//  171  296:aload_3         
	//  172  297:invokestatic    #269 <Method List constructErrorResponses(List, HttpURLConnection, FacebookException)>
	//  173  300:astore_0        
		Utility.closeQuietly(((java.io.Closeable) (inputstream5)));
	//  174  301:aload           7
	//  175  303:invokestatic    #262 <Method void Utility.closeQuietly(java.io.Closeable)>
		return ((List) (httpurlconnection));
	//  176  306:aload_0         
	//  177  307:areturn         
		Utility.closeQuietly(((java.io.Closeable) (inputstream)));
	//  178  308:aload_2         
	//  179  309:invokestatic    #262 <Method void Utility.closeQuietly(java.io.Closeable)>
		throw httpurlconnection;
	//  180  312:aload_0         
	//  181  313:athrow          
	//* 182  314:goto            94
	}

	public final HttpURLConnection getConnection()
	{
		return connection;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field HttpURLConnection connection>
	//    2    4:areturn         
	}

	public final FacebookRequestError getError()
	{
		return error;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field FacebookRequestError error>
	//    2    4:areturn         
	}

	public final JSONArray getJSONArray()
	{
		return graphObjectArray;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field JSONArray graphObjectArray>
	//    2    4:areturn         
	}

	public final JSONObject getJSONObject()
	{
		return graphObject;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field JSONObject graphObject>
	//    2    4:areturn         
	}

	public String getRawResponse()
	{
		return rawResponse;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String rawResponse>
	//    2    4:areturn         
	}

	public GraphRequest getRequest()
	{
		return request;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field GraphRequest request>
	//    2    4:areturn         
	}

	public GraphRequest getRequestForPagedResults(PagingDirection pagingdirection)
	{
label0:
		{
			if(graphObject != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field JSONObject graphObject>
	//*   2    4:ifnull          51
			{
				JSONObject jsonobject = graphObject.optJSONObject("paging");
	//    3    7:aload_0         
	//    4    8:getfield        #53  <Field JSONObject graphObject>
	//    5   11:ldc2            #287 <String "paging">
	//    6   14:invokevirtual   #291 <Method JSONObject JSONObject.optJSONObject(String)>
	//    7   17:astore_2        
				if(jsonobject != null)
	//*   8   18:aload_2         
	//*   9   19:ifnull          51
				{
					if(pagingdirection == PagingDirection.NEXT)
	//*  10   22:aload_1         
	//*  11   23:getstatic       #295 <Field GraphResponse$PagingDirection GraphResponse$PagingDirection.NEXT>
	//*  12   26:if_acmpne       40
						pagingdirection = ((PagingDirection) (jsonobject.optString("next")));
	//   13   29:aload_2         
	//   14   30:ldc2            #297 <String "next">
	//   15   33:invokevirtual   #301 <Method String JSONObject.optString(String)>
	//   16   36:astore_1        
					else
	//*  17   37:goto            53
						pagingdirection = ((PagingDirection) (jsonobject.optString("previous")));
	//   18   40:aload_2         
	//   19   41:ldc2            #303 <String "previous">
	//   20   44:invokevirtual   #301 <Method String JSONObject.optString(String)>
	//   21   47:astore_1        
					break label0;
	//   22   48:goto            53
				}
			}
			pagingdirection = null;
	//   23   51:aconst_null     
	//   24   52:astore_1        
		}
		if(Utility.isNullOrEmpty(((String) (pagingdirection))))
	//*  25   53:aload_1         
	//*  26   54:invokestatic    #307 <Method boolean Utility.isNullOrEmpty(String)>
	//*  27   57:ifeq            62
			return null;
	//   28   60:aconst_null     
	//   29   61:areturn         
		if(pagingdirection != null && ((String) (pagingdirection)).equals(((Object) (request.getUrlForSingleRequest()))))
	//*  30   62:aload_1         
	//*  31   63:ifnull          82
	//*  32   66:aload_1         
	//*  33   67:aload_0         
	//*  34   68:getfield        #47  <Field GraphRequest request>
	//*  35   71:invokevirtual   #310 <Method String GraphRequest.getUrlForSingleRequest()>
	//*  36   74:invokevirtual   #313 <Method boolean String.equals(Object)>
	//*  37   77:ifeq            82
			return null;
	//   38   80:aconst_null     
	//   39   81:areturn         
		try
		{
			pagingdirection = ((PagingDirection) (new GraphRequest(request.getAccessToken(), new URL(((String) (pagingdirection))))));
	//   40   82:new             #76  <Class GraphRequest>
	//   41   85:dup             
	//   42   86:aload_0         
	//   43   87:getfield        #47  <Field GraphRequest request>
	//   44   90:invokevirtual   #106 <Method AccessToken GraphRequest.getAccessToken()>
	//   45   93:new             #315 <Class URL>
	//   46   96:dup             
	//   47   97:aload_1         
	//   48   98:invokespecial   #316 <Method void URL(String)>
	//   49  101:invokespecial   #319 <Method void GraphRequest(AccessToken, URL)>
	//   50  104:astore_1        
		}
	//*  51  105:aload_1         
	//*  52  106:areturn         
		// Misplaced declaration of an exception variable
		catch(PagingDirection pagingdirection)
	//*  53  107:astore_1        
		{
			return null;
	//   54  108:aconst_null     
	//   55  109:areturn         
		}
		return ((GraphRequest) (pagingdirection));
	}

	public String toString()
	{
		Object obj = ((Object) (Locale.US));
	//    0    0:getstatic       #325 <Field Locale Locale.US>
	//    1    3:astore_2        
		if(connection == null) goto _L2; else goto _L1
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field HttpURLConnection connection>
	//    4    8:ifnull          129
_L1:
		int i = connection.getResponseCode();
	//    5   11:aload_0         
	//    6   12:getfield        #49  <Field HttpURLConnection connection>
	//    7   15:invokevirtual   #175 <Method int HttpURLConnection.getResponseCode()>
	//    8   18:istore_1        
	//*   9   19:goto            22
_L4:
		IOException ioexception;
		try
		{
			obj = ((Object) (String.format(((Locale) (obj)), "%d", new Object[] {
				Integer.valueOf(i)
			})));
	//   10   22:aload_2         
	//   11   23:ldc2            #327 <String "%d">
	//   12   26:iconst_1        
	//   13   27:anewarray       Object[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:iload_1         
	//   17   33:invokestatic    #214 <Method Integer Integer.valueOf(int)>
	//   18   36:aastore         
	//   19   37:invokestatic    #331 <Method String String.format(Locale, String, Object[])>
	//   20   40:astore_2        
		}
	//*  21   41:goto            48
	//*  22   44:ldc2            #333 <String "unknown">
	//*  23   47:astore_2        
	//*  24   48:new             #138 <Class StringBuilder>
	//*  25   51:dup             
	//*  26   52:invokespecial   #139 <Method void StringBuilder()>
	//*  27   55:astore_3        
	//*  28   56:aload_3         
	//*  29   57:ldc2            #335 <String "{Response: ">
	//*  30   60:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//*  31   63:pop             
	//*  32   64:aload_3         
	//*  33   65:ldc2            #337 <String " responseCode: ">
	//*  34   68:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//*  35   71:pop             
	//*  36   72:aload_3         
	//*  37   73:aload_2         
	//*  38   74:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//*  39   77:pop             
	//*  40   78:aload_3         
	//*  41   79:ldc2            #339 <String ", graphObject: ">
	//*  42   82:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//*  43   85:pop             
	//*  44   86:aload_3         
	//*  45   87:aload_0         
	//*  46   88:getfield        #53  <Field JSONObject graphObject>
	//*  47   91:invokevirtual   #342 <Method StringBuilder StringBuilder.append(Object)>
	//*  48   94:pop             
	//*  49   95:aload_3         
	//*  50   96:ldc2            #344 <String ", error: ">
	//*  51   99:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//*  52  102:pop             
	//*  53  103:aload_3         
	//*  54  104:aload_0         
	//*  55  105:getfield        #57  <Field FacebookRequestError error>
	//*  56  108:invokevirtual   #342 <Method StringBuilder StringBuilder.append(Object)>
	//*  57  111:pop             
	//*  58  112:aload_3         
	//*  59  113:ldc2            #346 <String "}">
	//*  60  116:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//*  61  119:pop             
	//*  62  120:aload_3         
	//*  63  121:invokevirtual   #157 <Method String StringBuilder.toString()>
	//*  64  124:areturn         
		// Misplaced declaration of an exception variable
		catch(IOException ioexception)
		{
			obj = "unknown";
		}
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.append("{Response: ");
		stringbuilder.append(" responseCode: ");
		stringbuilder.append(((String) (obj)));
		stringbuilder.append(", graphObject: ");
		stringbuilder.append(((Object) (graphObject)));
		stringbuilder.append(", error: ");
		stringbuilder.append(((Object) (error)));
		stringbuilder.append("}");
		return stringbuilder.toString();
	//*  65  125:astore_2        
	//*  66  126:goto            44
_L2:
		i = 200;
	//   67  129:sipush          200
	//   68  132:istore_1        
		if(true) goto _L4; else goto _L3
	//   69  133:goto            22
_L3:
	}

	private static final String BODY_KEY = "body";
	private static final String CODE_KEY = "code";
	public static final String NON_JSON_RESPONSE_PROPERTY = "FACEBOOK_NON_JSON_RESULT";
	private static final String RESPONSE_LOG_TAG = "Response";
	public static final String SUCCESS_KEY = "success";
	private final HttpURLConnection connection;
	private final FacebookRequestError error;
	private final JSONObject graphObject;
	private final JSONArray graphObjectArray;
	private final String rawResponse;
	private final GraphRequest request;
}
