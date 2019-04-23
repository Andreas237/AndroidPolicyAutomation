// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.util.Log;
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
	//    7    7:invokespecial   #45  <Method void GraphResponse(GraphRequest, HttpURLConnection, String, JSONObject, JSONArray, FacebookRequestError)>
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
	//    7    8:invokespecial   #45  <Method void GraphResponse(GraphRequest, HttpURLConnection, String, JSONObject, JSONArray, FacebookRequestError)>
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
	//    7    8:invokespecial   #45  <Method void GraphResponse(GraphRequest, HttpURLConnection, String, JSONObject, JSONArray, FacebookRequestError)>
	//    8   11:return          
	}

	GraphResponse(GraphRequest graphrequest, HttpURLConnection httpurlconnection, String s, JSONObject jsonobject, JSONArray jsonarray, FacebookRequestError facebookrequesterror)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		request = graphrequest;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #51  <Field GraphRequest request>
		connection = httpurlconnection;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #53  <Field HttpURLConnection connection>
		rawResponse = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #55  <Field String rawResponse>
		graphObject = jsonobject;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #57  <Field JSONObject graphObject>
		graphObjectArray = jsonarray;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #59  <Field JSONArray graphObjectArray>
		error = facebookrequesterror;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #61  <Field FacebookRequestError error>
	//   20   37:return          
	}

	static List constructErrorResponses(List list, HttpURLConnection httpurlconnection, FacebookException facebookexception)
	{
		int j = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #69  <Method int List.size()>
	//    2    6:istore          4
		ArrayList arraylist = new ArrayList(j);
	//    3    8:new             #71  <Class ArrayList>
	//    4   11:dup             
	//    5   12:iload           4
	//    6   14:invokespecial   #74  <Method void ArrayList(int)>
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
	//   18   35:invokeinterface #78  <Method Object List.get(int)>
	//   19   40:checkcast       #80  <Class GraphRequest>
	//   20   43:aload_1         
	//   21   44:new             #82  <Class FacebookRequestError>
	//   22   47:dup             
	//   23   48:aload_1         
	//   24   49:aload_2         
	//   25   50:invokespecial   #85  <Method void FacebookRequestError(HttpURLConnection, Exception)>
	//   26   53:invokespecial   #87  <Method void GraphResponse(GraphRequest, HttpURLConnection, FacebookRequestError)>
	//   27   56:invokeinterface #91  <Method boolean List.add(Object)>
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
	//*   3    4:instanceof      #99  <Class JSONObject>
	//*   4    7:ifeq            161
		{
			obj = ((Object) ((JSONObject)obj));
	//    5   10:aload_2         
	//    6   11:checkcast       #99  <Class JSONObject>
	//    7   14:astore_2        
			obj1 = ((Object) (FacebookRequestError.checkResponseAndCreateError(((JSONObject) (obj)), obj1, httpurlconnection)));
	//    8   15:aload_2         
	//    9   16:aload_3         
	//   10   17:aload_1         
	//   11   18:invokestatic    #103 <Method FacebookRequestError FacebookRequestError.checkResponseAndCreateError(JSONObject, Object, HttpURLConnection)>
	//   12   21:astore_3        
			if(obj1 != null)
	//*  13   22:aload_3         
	//*  14   23:ifnull          97
			{
				Log.e(TAG, ((FacebookRequestError) (obj1)).toString());
	//   15   26:getstatic       #105 <Field String TAG>
	//   16   29:aload_3         
	//   17   30:invokevirtual   #109 <Method String FacebookRequestError.toString()>
	//   18   33:invokestatic    #115 <Method int Log.e(String, String)>
	//   19   36:pop             
				if(((FacebookRequestError) (obj1)).getErrorCode() == 190 && Utility.isCurrentAccessToken(graphrequest.getAccessToken()))
	//*  20   37:aload_3         
	//*  21   38:invokevirtual   #118 <Method int FacebookRequestError.getErrorCode()>
	//*  22   41:sipush          190
	//*  23   44:icmpne          86
	//*  24   47:aload_0         
	//*  25   48:invokevirtual   #122 <Method AccessToken GraphRequest.getAccessToken()>
	//*  26   51:invokestatic    #128 <Method boolean Utility.isCurrentAccessToken(AccessToken)>
	//*  27   54:ifeq            86
					if(((FacebookRequestError) (obj1)).getSubErrorCode() != 493)
	//*  28   57:aload_3         
	//*  29   58:invokevirtual   #131 <Method int FacebookRequestError.getSubErrorCode()>
	//*  30   61:sipush          493
	//*  31   64:icmpeq          74
						AccessToken.setCurrentAccessToken(((AccessToken) (null)));
	//   32   67:aconst_null     
	//   33   68:invokestatic    #137 <Method void AccessToken.setCurrentAccessToken(AccessToken)>
					else
	//*  34   71:goto            86
					if(!AccessToken.getCurrentAccessToken().isExpired())
	//*  35   74:invokestatic    #140 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//*  36   77:invokevirtual   #144 <Method boolean AccessToken.isExpired()>
	//*  37   80:ifne            86
						AccessToken.expireCurrentAccessToken();
	//   38   83:invokestatic    #147 <Method void AccessToken.expireCurrentAccessToken()>
				return new GraphResponse(graphrequest, httpurlconnection, ((FacebookRequestError) (obj1)));
	//   39   86:new             #2   <Class GraphResponse>
	//   40   89:dup             
	//   41   90:aload_0         
	//   42   91:aload_1         
	//   43   92:aload_3         
	//   44   93:invokespecial   #87  <Method void GraphResponse(GraphRequest, HttpURLConnection, FacebookRequestError)>
	//   45   96:areturn         
			}
			obj = Utility.getStringPropertyAsJSON(((JSONObject) (obj)), "body", "FACEBOOK_NON_JSON_RESULT");
	//   46   97:aload_2         
	//   47   98:ldc1            #11  <String "body">
	//   48  100:ldc1            #17  <String "FACEBOOK_NON_JSON_RESULT">
	//   49  102:invokestatic    #151 <Method Object Utility.getStringPropertyAsJSON(JSONObject, String, String)>
	//   50  105:astore_2        
			if(obj instanceof JSONObject)
	//*  51  106:aload_2         
	//*  52  107:instanceof      #99  <Class JSONObject>
	//*  53  110:ifeq            131
				return new GraphResponse(graphrequest, httpurlconnection, obj.toString(), (JSONObject)obj);
	//   54  113:new             #2   <Class GraphResponse>
	//   55  116:dup             
	//   56  117:aload_0         
	//   57  118:aload_1         
	//   58  119:aload_2         
	//   59  120:invokevirtual   #152 <Method String Object.toString()>
	//   60  123:aload_2         
	//   61  124:checkcast       #99  <Class JSONObject>
	//   62  127:invokespecial   #154 <Method void GraphResponse(GraphRequest, HttpURLConnection, String, JSONObject)>
	//   63  130:areturn         
			if(obj instanceof JSONArray)
	//*  64  131:aload_2         
	//*  65  132:instanceof      #156 <Class JSONArray>
	//*  66  135:ifeq            156
				return new GraphResponse(graphrequest, httpurlconnection, obj.toString(), (JSONArray)obj);
	//   67  138:new             #2   <Class GraphResponse>
	//   68  141:dup             
	//   69  142:aload_0         
	//   70  143:aload_1         
	//   71  144:aload_2         
	//   72  145:invokevirtual   #152 <Method String Object.toString()>
	//   73  148:aload_2         
	//   74  149:checkcast       #156 <Class JSONArray>
	//   75  152:invokespecial   #158 <Method void GraphResponse(GraphRequest, HttpURLConnection, String, JSONArray)>
	//   76  155:areturn         
			obj2 = JSONObject.NULL;
	//   77  156:getstatic       #162 <Field Object JSONObject.NULL>
	//   78  159:astore          4
		}
		if(obj2 == JSONObject.NULL)
	//*  79  161:aload           4
	//*  80  163:getstatic       #162 <Field Object JSONObject.NULL>
	//*  81  166:if_acmpne       188
		{
			return new GraphResponse(graphrequest, httpurlconnection, obj2.toString(), (JSONObject)null);
	//   82  169:new             #2   <Class GraphResponse>
	//   83  172:dup             
	//   84  173:aload_0         
	//   85  174:aload_1         
	//   86  175:aload           4
	//   87  177:invokevirtual   #152 <Method String Object.toString()>
	//   88  180:aconst_null     
	//   89  181:checkcast       #99  <Class JSONObject>
	//   90  184:invokespecial   #154 <Method void GraphResponse(GraphRequest, HttpURLConnection, String, JSONObject)>
	//   91  187:areturn         
		} else
		{
			graphrequest = ((GraphRequest) (new StringBuilder()));
	//   92  188:new             #164 <Class StringBuilder>
	//   93  191:dup             
	//   94  192:invokespecial   #165 <Method void StringBuilder()>
	//   95  195:astore_0        
			((StringBuilder) (graphrequest)).append("Got unexpected object type in response, class: ");
	//   96  196:aload_0         
	//   97  197:ldc1            #167 <String "Got unexpected object type in response, class: ">
	//   98  199:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   99  202:pop             
			((StringBuilder) (graphrequest)).append(obj2.getClass().getSimpleName());
	//  100  203:aload_0         
	//  101  204:aload           4
	//  102  206:invokevirtual   #175 <Method Class Object.getClass()>
	//  103  209:invokevirtual   #180 <Method String Class.getSimpleName()>
	//  104  212:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//  105  215:pop             
			throw new FacebookException(((StringBuilder) (graphrequest)).toString());
	//  106  216:new             #182 <Class FacebookException>
	//  107  219:dup             
	//  108  220:aload_0         
	//  109  221:invokevirtual   #183 <Method String StringBuilder.toString()>
	//  110  224:invokespecial   #186 <Method void FacebookException(String)>
	//  111  227:athrow          
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
	//    1    1:invokeinterface #69  <Method int List.size()>
	//    2    6:istore          5
		arraylist = new ArrayList(j);
	//    3    8:new             #71  <Class ArrayList>
	//    4   11:dup             
	//    5   12:iload           5
	//    6   14:invokespecial   #74  <Method void ArrayList(int)>
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
	//   15   30:invokeinterface #78  <Method Object List.get(int)>
	//   16   35:checkcast       #80  <Class GraphRequest>
	//   17   38:astore          8
		JSONObject jsonobject;
		jsonobject = new JSONObject();
	//   18   40:new             #99  <Class JSONObject>
	//   19   43:dup             
	//   20   44:invokespecial   #192 <Method void JSONObject()>
	//   21   47:astore          9
		jsonobject.put("body", obj);
	//   22   49:aload           9
	//   23   51:ldc1            #11  <String "body">
	//   24   53:aload_2         
	//   25   54:invokevirtual   #196 <Method JSONObject JSONObject.put(String, Object)>
	//   26   57:pop             
		if(httpurlconnection == null) goto _L4; else goto _L3
	//   27   58:aload_0         
	//   28   59:ifnull          321
_L3:
		int i = httpurlconnection.getResponseCode();
	//   29   62:aload_0         
	//   30   63:invokevirtual   #201 <Method int HttpURLConnection.getResponseCode()>
	//   31   66:istore_3        
	//*  32   67:goto            70
_L7:
		Object obj1;
		jsonobject.put("code", i);
	//   33   70:aload           9
	//   34   72:ldc1            #14  <String "code">
	//   35   74:iload_3         
	//   36   75:invokevirtual   #204 <Method JSONObject JSONObject.put(String, int)>
	//   37   78:pop             
		obj1 = ((Object) (new JSONArray()));
	//   38   79:new             #156 <Class JSONArray>
	//   39   82:dup             
	//   40   83:invokespecial   #205 <Method void JSONArray()>
	//   41   86:astore          6
		((JSONArray) (obj1)).put(((Object) (jsonobject)));
	//   42   88:aload           6
	//   43   90:aload           9
	//   44   92:invokevirtual   #208 <Method JSONArray JSONArray.put(Object)>
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
	//   53  110:new             #82  <Class FacebookRequestError>
	//   54  113:dup             
	//   55  114:aload_0         
	//   56  115:aload           6
	//   57  117:invokespecial   #85  <Method void FacebookRequestError(HttpURLConnection, Exception)>
	//   58  120:invokespecial   #87  <Method void GraphResponse(GraphRequest, HttpURLConnection, FacebookRequestError)>
	//   59  123:invokeinterface #91  <Method boolean List.add(Object)>
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
	//   68  143:new             #82  <Class FacebookRequestError>
	//   69  146:dup             
	//   70  147:aload_0         
	//   71  148:aload           6
	//   72  150:invokespecial   #85  <Method void FacebookRequestError(HttpURLConnection, Exception)>
	//   73  153:invokespecial   #87  <Method void GraphResponse(GraphRequest, HttpURLConnection, FacebookRequestError)>
	//   74  156:invokeinterface #91  <Method boolean List.add(Object)>
	//   75  161:pop             
_L2:
		obj1 = obj;
	//   76  162:aload_2         
	//   77  163:astore          6
_L5:
		if(obj1 instanceof JSONArray)
	//*  78  165:aload           6
	//*  79  167:instanceof      #156 <Class JSONArray>
	//*  80  170:ifeq            311
		{
			obj1 = ((Object) ((JSONArray)obj1));
	//   81  173:aload           6
	//   82  175:checkcast       #156 <Class JSONArray>
	//   83  178:astore          6
			if(((JSONArray) (obj1)).length() == j)
	//*  84  180:aload           6
	//*  85  182:invokevirtual   #211 <Method int JSONArray.length()>
	//*  86  185:iload           5
	//*  87  187:icmpne          311
			{
				for(i = ((int) (flag)); i < ((JSONArray) (obj1)).length(); i++)
	//*  88  190:iload           4
	//*  89  192:istore_3        
	//*  90  193:iload_3         
	//*  91  194:aload           6
	//*  92  196:invokevirtual   #211 <Method int JSONArray.length()>
	//*  93  199:icmpge          308
				{
					GraphRequest graphrequest1 = (GraphRequest)list.get(i);
	//   94  202:aload_1         
	//   95  203:iload_3         
	//   96  204:invokeinterface #78  <Method Object List.get(int)>
	//   97  209:checkcast       #80  <Class GraphRequest>
	//   98  212:astore          8
					try
					{
						((List) (arraylist)).add(((Object) (createResponseFromObject(graphrequest1, httpurlconnection, ((JSONArray) (obj1)).get(i), obj))));
	//   99  214:aload           7
	//  100  216:aload           8
	//  101  218:aload_0         
	//  102  219:aload           6
	//  103  221:iload_3         
	//  104  222:invokevirtual   #212 <Method Object JSONArray.get(int)>
	//  105  225:aload_2         
	//  106  226:invokestatic    #214 <Method GraphResponse createResponseFromObject(GraphRequest, HttpURLConnection, Object, Object)>
	//  107  229:invokeinterface #91  <Method boolean List.add(Object)>
	//  108  234:pop             
					}
	//* 109  235:goto            301
	//* 110  238:astore          9
	//* 111  240:aload           7
	//* 112  242:new             #2   <Class GraphResponse>
	//* 113  245:dup             
	//* 114  246:aload           8
	//* 115  248:aload_0         
	//* 116  249:new             #82  <Class FacebookRequestError>
	//* 117  252:dup             
	//* 118  253:aload_0         
	//* 119  254:aload           9
	//* 120  256:invokespecial   #85  <Method void FacebookRequestError(HttpURLConnection, Exception)>
	//* 121  259:invokespecial   #87  <Method void GraphResponse(GraphRequest, HttpURLConnection, FacebookRequestError)>
	//* 122  262:invokeinterface #91  <Method boolean List.add(Object)>
	//* 123  267:pop             
	//* 124  268:goto            301
					catch(JSONException jsonexception)
	//* 125  271:astore          9
					{
						((List) (arraylist)).add(((Object) (new GraphResponse(graphrequest1, httpurlconnection, new FacebookRequestError(httpurlconnection, ((Exception) (jsonexception)))))));
	//  126  273:aload           7
	//  127  275:new             #2   <Class GraphResponse>
	//  128  278:dup             
	//  129  279:aload           8
	//  130  281:aload_0         
	//  131  282:new             #82  <Class FacebookRequestError>
	//  132  285:dup             
	//  133  286:aload_0         
	//  134  287:aload           9
	//  135  289:invokespecial   #85  <Method void FacebookRequestError(HttpURLConnection, Exception)>
	//  136  292:invokespecial   #87  <Method void GraphResponse(GraphRequest, HttpURLConnection, FacebookRequestError)>
	//  137  295:invokeinterface #91  <Method boolean List.add(Object)>
	//  138  300:pop             
					}
					catch(FacebookException facebookexception)
					{
						((List) (arraylist)).add(((Object) (new GraphResponse(graphrequest1, httpurlconnection, new FacebookRequestError(httpurlconnection, ((Exception) (facebookexception)))))));
					}
				}

	//  139  301:iload_3         
	//  140  302:iconst_1        
	//  141  303:iadd            
	//  142  304:istore_3        
	//* 143  305:goto            193
				return ((List) (arraylist));
	//  144  308:aload           7
	//  145  310:areturn         
			}
		}
		throw new FacebookException("Unexpected number of results");
	//  146  311:new             #182 <Class FacebookException>
	//  147  314:dup             
	//  148  315:ldc1            #216 <String "Unexpected number of results">
	//  149  317:invokespecial   #186 <Method void FacebookException(String)>
	//  150  320:athrow          
_L4:
		i = 200;
	//  151  321:sipush          200
	//  152  324:istore_3        
		if(true) goto _L7; else goto _L6
	//  153  325:goto            70
_L6:
	}

	static List createResponsesFromStream(InputStream inputstream, HttpURLConnection httpurlconnection, GraphRequestBatch graphrequestbatch)
		throws FacebookException, JSONException, IOException
	{
		inputstream = ((InputStream) (Utility.readStreamToString(inputstream)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #223 <Method String Utility.readStreamToString(InputStream)>
	//    2    4:astore_0        
		Logger.log(LoggingBehavior.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", new Object[] {
			Integer.valueOf(((String) (inputstream)).length()), inputstream
		});
	//    3    5:getstatic       #229 <Field LoggingBehavior LoggingBehavior.INCLUDE_RAW_RESPONSES>
	//    4    8:ldc1            #20  <String "Response">
	//    5   10:ldc1            #231 <String "Response (raw)\n  Size: %d\n  Response:\n%s\n">
	//    6   12:iconst_2        
	//    7   13:anewarray       Object[]
	//    8   16:dup             
	//    9   17:iconst_0        
	//   10   18:aload_0         
	//   11   19:invokevirtual   #234 <Method int String.length()>
	//   12   22:invokestatic    #240 <Method Integer Integer.valueOf(int)>
	//   13   25:aastore         
	//   14   26:dup             
	//   15   27:iconst_1        
	//   16   28:aload_0         
	//   17   29:aastore         
	//   18   30:invokestatic    #246 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
		return createResponsesFromString(((String) (inputstream)), httpurlconnection, graphrequestbatch);
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:aload_2         
	//   22   36:invokestatic    #250 <Method List createResponsesFromString(String, HttpURLConnection, GraphRequestBatch)>
	//   23   39:areturn         
	}

	static List createResponsesFromString(String s, HttpURLConnection httpurlconnection, GraphRequestBatch graphrequestbatch)
		throws FacebookException, JSONException, IOException
	{
		httpurlconnection = ((HttpURLConnection) (createResponsesFromObject(httpurlconnection, ((List) (graphrequestbatch)), (new JSONTokener(s)).nextValue())));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:new             #253 <Class JSONTokener>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:invokespecial   #254 <Method void JSONTokener(String)>
	//    6   10:invokevirtual   #258 <Method Object JSONTokener.nextValue()>
	//    7   13:invokestatic    #260 <Method List createResponsesFromObject(HttpURLConnection, List, Object)>
	//    8   16:astore_1        
		Logger.log(LoggingBehavior.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", new Object[] {
			graphrequestbatch.getId(), Integer.valueOf(s.length()), httpurlconnection
		});
	//    9   17:getstatic       #263 <Field LoggingBehavior LoggingBehavior.REQUESTS>
	//   10   20:ldc1            #20  <String "Response">
	//   11   22:ldc2            #265 <String "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n">
	//   12   25:iconst_3        
	//   13   26:anewarray       Object[]
	//   14   29:dup             
	//   15   30:iconst_0        
	//   16   31:aload_2         
	//   17   32:invokevirtual   #270 <Method String GraphRequestBatch.getId()>
	//   18   35:aastore         
	//   19   36:dup             
	//   20   37:iconst_1        
	//   21   38:aload_0         
	//   22   39:invokevirtual   #234 <Method int String.length()>
	//   23   42:invokestatic    #240 <Method Integer Integer.valueOf(int)>
	//   24   45:aastore         
	//   25   46:dup             
	//   26   47:iconst_2        
	//   27   48:aload_1         
	//   28   49:aastore         
	//   29   50:invokestatic    #246 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
		return ((List) (httpurlconnection));
	//   30   53:aload_1         
	//   31   54:areturn         
	}

	static List fromHttpConnection(HttpURLConnection httpurlconnection, GraphRequestBatch graphrequestbatch)
	{
		InputStream inputstream;
		InputStream inputstream1;
		InputStream inputstream2;
		InputStream inputstream3;
		List list;
		Object obj1;
		list = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		obj1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          7
		inputstream = null;
	//    4    6:aconst_null     
	//    5    7:astore_2        
		inputstream1 = inputstream;
	//    6    8:aload_2         
	//    7    9:astore_3        
		inputstream2 = ((InputStream) (list));
	//    8   10:aload           6
	//    9   12:astore          4
		inputstream3 = ((InputStream) (obj1));
	//   10   14:aload           7
	//   11   16:astore          5
		if(httpurlconnection.getResponseCode() < 400)
			break MISSING_BLOCK_LABEL_46;
	//   12   18:aload_0         
	//   13   19:invokevirtual   #201 <Method int HttpURLConnection.getResponseCode()>
	//   14   22:sipush          400
	//   15   25:icmplt          46
		inputstream1 = inputstream;
	//   16   28:aload_2         
	//   17   29:astore_3        
		inputstream2 = ((InputStream) (list));
	//   18   30:aload           6
	//   19   32:astore          4
		inputstream3 = ((InputStream) (obj1));
	//   20   34:aload           7
	//   21   36:astore          5
		inputstream = httpurlconnection.getErrorStream();
	//   22   38:aload_0         
	//   23   39:invokevirtual   #279 <Method InputStream HttpURLConnection.getErrorStream()>
	//   24   42:astore_2        
		break MISSING_BLOCK_LABEL_61;
	//   25   43:goto            61
		inputstream1 = inputstream;
	//   26   46:aload_2         
	//   27   47:astore_3        
		inputstream2 = ((InputStream) (list));
	//   28   48:aload           6
	//   29   50:astore          4
		inputstream3 = ((InputStream) (obj1));
	//   30   52:aload           7
	//   31   54:astore          5
		inputstream = httpurlconnection.getInputStream();
	//   32   56:aload_0         
	//   33   57:invokevirtual   #282 <Method InputStream HttpURLConnection.getInputStream()>
	//   34   60:astore_2        
		inputstream1 = inputstream;
	//   35   61:aload_2         
	//   36   62:astore_3        
		inputstream2 = inputstream;
	//   37   63:aload_2         
	//   38   64:astore          4
		inputstream3 = inputstream;
	//   39   66:aload_2         
	//   40   67:astore          5
		list = createResponsesFromStream(inputstream, httpurlconnection, graphrequestbatch);
	//   41   69:aload_2         
	//   42   70:aload_0         
	//   43   71:aload_1         
	//   44   72:invokestatic    #284 <Method List createResponsesFromStream(InputStream, HttpURLConnection, GraphRequestBatch)>
	//   45   75:astore          6
		Utility.closeQuietly(((java.io.Closeable) (inputstream)));
	//   46   77:aload_2         
	//   47   78:invokestatic    #288 <Method void Utility.closeQuietly(java.io.Closeable)>
		return list;
	//   48   81:aload           6
	//   49   83:areturn         
		httpurlconnection;
	//   50   84:astore_0        
		break MISSING_BLOCK_LABEL_175;
	//   51   85:goto            175
		Object obj;
		obj;
	//   52   88:astore_2        
		inputstream1 = inputstream2;
	//   53   89:aload           4
	//   54   91:astore_3        
		Logger.log(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", new Object[] {
			obj
		});
	//   55   92:getstatic       #263 <Field LoggingBehavior LoggingBehavior.REQUESTS>
	//   56   95:ldc1            #20  <String "Response">
	//   57   97:ldc2            #290 <String "Response <Error>: %s">
	//   58  100:iconst_1        
	//   59  101:anewarray       Object[]
	//   60  104:dup             
	//   61  105:iconst_0        
	//   62  106:aload_2         
	//   63  107:aastore         
	//   64  108:invokestatic    #246 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
		inputstream1 = inputstream2;
	//   65  111:aload           4
	//   66  113:astore_3        
		httpurlconnection = ((HttpURLConnection) (constructErrorResponses(((List) (graphrequestbatch)), httpurlconnection, new FacebookException(((Throwable) (obj))))));
	//   67  114:aload_1         
	//   68  115:aload_0         
	//   69  116:new             #182 <Class FacebookException>
	//   70  119:dup             
	//   71  120:aload_2         
	//   72  121:invokespecial   #293 <Method void FacebookException(Throwable)>
	//   73  124:invokestatic    #295 <Method List constructErrorResponses(List, HttpURLConnection, FacebookException)>
	//   74  127:astore_0        
		Utility.closeQuietly(((java.io.Closeable) (inputstream2)));
	//   75  128:aload           4
	//   76  130:invokestatic    #288 <Method void Utility.closeQuietly(java.io.Closeable)>
		return ((List) (httpurlconnection));
	//   77  133:aload_0         
	//   78  134:areturn         
		obj;
	//   79  135:astore_2        
		inputstream1 = inputstream3;
	//   80  136:aload           5
	//   81  138:astore_3        
		Logger.log(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", new Object[] {
			obj
		});
	//   82  139:getstatic       #263 <Field LoggingBehavior LoggingBehavior.REQUESTS>
	//   83  142:ldc1            #20  <String "Response">
	//   84  144:ldc2            #290 <String "Response <Error>: %s">
	//   85  147:iconst_1        
	//   86  148:anewarray       Object[]
	//   87  151:dup             
	//   88  152:iconst_0        
	//   89  153:aload_2         
	//   90  154:aastore         
	//   91  155:invokestatic    #246 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
		inputstream1 = inputstream3;
	//   92  158:aload           5
	//   93  160:astore_3        
		httpurlconnection = ((HttpURLConnection) (constructErrorResponses(((List) (graphrequestbatch)), httpurlconnection, ((FacebookException) (obj)))));
	//   94  161:aload_1         
	//   95  162:aload_0         
	//   96  163:aload_2         
	//   97  164:invokestatic    #295 <Method List constructErrorResponses(List, HttpURLConnection, FacebookException)>
	//   98  167:astore_0        
		Utility.closeQuietly(((java.io.Closeable) (inputstream3)));
	//   99  168:aload           5
	//  100  170:invokestatic    #288 <Method void Utility.closeQuietly(java.io.Closeable)>
		return ((List) (httpurlconnection));
	//  101  173:aload_0         
	//  102  174:areturn         
		Utility.closeQuietly(((java.io.Closeable) (inputstream1)));
	//  103  175:aload_3         
	//  104  176:invokestatic    #288 <Method void Utility.closeQuietly(java.io.Closeable)>
		throw httpurlconnection;
	//  105  179:aload_0         
	//  106  180:athrow          
	}

	public final HttpURLConnection getConnection()
	{
		return connection;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field HttpURLConnection connection>
	//    2    4:areturn         
	}

	public final FacebookRequestError getError()
	{
		return error;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field FacebookRequestError error>
	//    2    4:areturn         
	}

	public final JSONArray getJSONArray()
	{
		return graphObjectArray;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field JSONArray graphObjectArray>
	//    2    4:areturn         
	}

	public final JSONObject getJSONObject()
	{
		return graphObject;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field JSONObject graphObject>
	//    2    4:areturn         
	}

	public String getRawResponse()
	{
		return rawResponse;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field String rawResponse>
	//    2    4:areturn         
	}

	public GraphRequest getRequest()
	{
		return request;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field GraphRequest request>
	//    2    4:areturn         
	}

	public GraphRequest getRequestForPagedResults(PagingDirection pagingdirection)
	{
label0:
		{
			JSONObject jsonobject = graphObject;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field JSONObject graphObject>
	//    2    4:astore_2        
			if(jsonobject != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          50
			{
				jsonobject = jsonobject.optJSONObject("paging");
	//    5    9:aload_2         
	//    6   10:ldc2            #313 <String "paging">
	//    7   13:invokevirtual   #317 <Method JSONObject JSONObject.optJSONObject(String)>
	//    8   16:astore_2        
				if(jsonobject != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          50
				{
					if(pagingdirection == PagingDirection.NEXT)
	//*  11   21:aload_1         
	//*  12   22:getstatic       #321 <Field GraphResponse$PagingDirection GraphResponse$PagingDirection.NEXT>
	//*  13   25:if_acmpne       39
						pagingdirection = ((PagingDirection) (jsonobject.optString("next")));
	//   14   28:aload_2         
	//   15   29:ldc2            #323 <String "next">
	//   16   32:invokevirtual   #327 <Method String JSONObject.optString(String)>
	//   17   35:astore_1        
					else
	//*  18   36:goto            52
						pagingdirection = ((PagingDirection) (jsonobject.optString("previous")));
	//   19   39:aload_2         
	//   20   40:ldc2            #329 <String "previous">
	//   21   43:invokevirtual   #327 <Method String JSONObject.optString(String)>
	//   22   46:astore_1        
					break label0;
	//   23   47:goto            52
				}
			}
			pagingdirection = null;
	//   24   50:aconst_null     
	//   25   51:astore_1        
		}
		if(Utility.isNullOrEmpty(((String) (pagingdirection))))
	//*  26   52:aload_1         
	//*  27   53:invokestatic    #333 <Method boolean Utility.isNullOrEmpty(String)>
	//*  28   56:ifeq            61
			return null;
	//   29   59:aconst_null     
	//   30   60:areturn         
		if(pagingdirection != null && ((String) (pagingdirection)).equals(((Object) (request.getUrlForSingleRequest()))))
	//*  31   61:aload_1         
	//*  32   62:ifnull          81
	//*  33   65:aload_1         
	//*  34   66:aload_0         
	//*  35   67:getfield        #51  <Field GraphRequest request>
	//*  36   70:invokevirtual   #336 <Method String GraphRequest.getUrlForSingleRequest()>
	//*  37   73:invokevirtual   #339 <Method boolean String.equals(Object)>
	//*  38   76:ifeq            81
			return null;
	//   39   79:aconst_null     
	//   40   80:areturn         
		try
		{
			pagingdirection = ((PagingDirection) (new GraphRequest(request.getAccessToken(), new URL(((String) (pagingdirection))))));
	//   41   81:new             #80  <Class GraphRequest>
	//   42   84:dup             
	//   43   85:aload_0         
	//   44   86:getfield        #51  <Field GraphRequest request>
	//   45   89:invokevirtual   #122 <Method AccessToken GraphRequest.getAccessToken()>
	//   46   92:new             #341 <Class URL>
	//   47   95:dup             
	//   48   96:aload_1         
	//   49   97:invokespecial   #342 <Method void URL(String)>
	//   50  100:invokespecial   #345 <Method void GraphRequest(AccessToken, URL)>
	//   51  103:astore_1        
		}
	//*  52  104:aload_1         
	//*  53  105:areturn         
		// Misplaced declaration of an exception variable
		catch(PagingDirection pagingdirection)
	//*  54  106:astore_1        
		{
			return null;
	//   55  107:aconst_null     
	//   56  108:areturn         
		}
		return ((GraphRequest) (pagingdirection));
	}

	public String toString()
	{
		Object obj = ((Object) (Locale.US));
	//    0    0:getstatic       #351 <Field Locale Locale.US>
	//    1    3:astore_2        
		if(connection == null) goto _L2; else goto _L1
	//    2    4:aload_0         
	//    3    5:getfield        #53  <Field HttpURLConnection connection>
	//    4    8:ifnull          129
_L1:
		int i = connection.getResponseCode();
	//    5   11:aload_0         
	//    6   12:getfield        #53  <Field HttpURLConnection connection>
	//    7   15:invokevirtual   #201 <Method int HttpURLConnection.getResponseCode()>
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
	//   11   23:ldc2            #353 <String "%d">
	//   12   26:iconst_1        
	//   13   27:anewarray       Object[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:iload_1         
	//   17   33:invokestatic    #240 <Method Integer Integer.valueOf(int)>
	//   18   36:aastore         
	//   19   37:invokestatic    #357 <Method String String.format(Locale, String, Object[])>
	//   20   40:astore_2        
		}
	//*  21   41:goto            48
	//*  22   44:ldc2            #359 <String "unknown">
	//*  23   47:astore_2        
	//*  24   48:new             #164 <Class StringBuilder>
	//*  25   51:dup             
	//*  26   52:invokespecial   #165 <Method void StringBuilder()>
	//*  27   55:astore_3        
	//*  28   56:aload_3         
	//*  29   57:ldc2            #361 <String "{Response: ">
	//*  30   60:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//*  31   63:pop             
	//*  32   64:aload_3         
	//*  33   65:ldc2            #363 <String " responseCode: ">
	//*  34   68:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//*  35   71:pop             
	//*  36   72:aload_3         
	//*  37   73:aload_2         
	//*  38   74:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//*  39   77:pop             
	//*  40   78:aload_3         
	//*  41   79:ldc2            #365 <String ", graphObject: ">
	//*  42   82:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//*  43   85:pop             
	//*  44   86:aload_3         
	//*  45   87:aload_0         
	//*  46   88:getfield        #57  <Field JSONObject graphObject>
	//*  47   91:invokevirtual   #368 <Method StringBuilder StringBuilder.append(Object)>
	//*  48   94:pop             
	//*  49   95:aload_3         
	//*  50   96:ldc2            #370 <String ", error: ">
	//*  51   99:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//*  52  102:pop             
	//*  53  103:aload_3         
	//*  54  104:aload_0         
	//*  55  105:getfield        #61  <Field FacebookRequestError error>
	//*  56  108:invokevirtual   #368 <Method StringBuilder StringBuilder.append(Object)>
	//*  57  111:pop             
	//*  58  112:aload_3         
	//*  59  113:ldc2            #372 <String "}">
	//*  60  116:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//*  61  119:pop             
	//*  62  120:aload_3         
	//*  63  121:invokevirtual   #183 <Method String StringBuilder.toString()>
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
	private static final String TAG = "GraphResponse";
	private final HttpURLConnection connection;
	private final FacebookRequestError error;
	private final JSONObject graphObject;
	private final JSONArray graphObjectArray;
	private final String rawResponse;
	private final GraphRequest request;

	static 
	{
	//    0    0:return          
	}
}
