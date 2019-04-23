// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.applinks;

import android.net.Uri;
import android.os.Bundle;
import bolts.*;
import com.facebook.*;
import java.util.*;
import org.json.*;

public class FacebookAppLinkResolver
	implements AppLinkResolver
{

	public FacebookAppLinkResolver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #44  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #45  <Method void HashMap()>
	//    6   12:putfield        #47  <Field HashMap cachedAppLinks>
	//    7   15:return          
	}

	private static bolts.AppLink.Target getAndroidTargetFromJson(JSONObject jsonobject)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		String s = tryGetStringFromJson(jsonobject, "package", ((String) (null)));
	//    2    2:aload_0         
	//    3    3:ldc1            #26  <String "package">
	//    4    5:aconst_null     
	//    5    6:invokestatic    #64  <Method String tryGetStringFromJson(JSONObject, String, String)>
	//    6    9:astore_2        
		if(s == null)
	//*   7   10:aload_2         
	//*   8   11:ifnonnull       16
			return null;
	//    9   14:aconst_null     
	//   10   15:areturn         
		String s1 = tryGetStringFromJson(jsonobject, "class", ((String) (null)));
	//   11   16:aload_0         
	//   12   17:ldc1            #23  <String "class">
	//   13   19:aconst_null     
	//   14   20:invokestatic    #64  <Method String tryGetStringFromJson(JSONObject, String, String)>
	//   15   23:astore_3        
		String s2 = tryGetStringFromJson(jsonobject, "app_name", ((String) (null)));
	//   16   24:aload_0         
	//   17   25:ldc1            #20  <String "app_name">
	//   18   27:aconst_null     
	//   19   28:invokestatic    #64  <Method String tryGetStringFromJson(JSONObject, String, String)>
	//   20   31:astore          4
		String s3 = tryGetStringFromJson(jsonobject, "url", ((String) (null)));
	//   21   33:aload_0         
	//   22   34:ldc1            #32  <String "url">
	//   23   36:aconst_null     
	//   24   37:invokestatic    #64  <Method String tryGetStringFromJson(JSONObject, String, String)>
	//   25   40:astore          5
		jsonobject = ((JSONObject) (obj));
	//   26   42:aload_1         
	//   27   43:astore_0        
		if(s3 != null)
	//*  28   44:aload           5
	//*  29   46:ifnull          55
			jsonobject = ((JSONObject) (Uri.parse(s3)));
	//   30   49:aload           5
	//   31   51:invokestatic    #70  <Method Uri Uri.parse(String)>
	//   32   54:astore_0        
		return new bolts.AppLink.Target(s, s1, ((Uri) (jsonobject)), s2);
	//   33   55:new             #72  <Class bolts.AppLink$Target>
	//   34   58:dup             
	//   35   59:aload_2         
	//   36   60:aload_3         
	//   37   61:aload_0         
	//   38   62:aload           4
	//   39   64:invokespecial   #75  <Method void bolts.AppLink$Target(String, String, Uri, String)>
	//   40   67:areturn         
	}

	private static Uri getWebFallbackUriFromJson(Uri uri, JSONObject jsonobject)
	{
		jsonobject = jsonobject.getJSONObject("web");
	//    0    0:aload_1         
	//    1    1:ldc1            #35  <String "web">
	//    2    3:invokevirtual   #83  <Method JSONObject JSONObject.getJSONObject(String)>
	//    3    6:astore_1        
		if(!tryGetBooleanFromJson(jsonobject, "should_fallback", true))
	//*   4    7:aload_1         
	//*   5    8:ldc1            #29  <String "should_fallback">
	//*   6   10:iconst_1        
	//*   7   11:invokestatic    #87  <Method boolean tryGetBooleanFromJson(JSONObject, String, boolean)>
	//*   8   14:ifne            19
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
		try
		{
			jsonobject = ((JSONObject) (tryGetStringFromJson(jsonobject, "url", ((String) (null)))));
	//   11   19:aload_1         
	//   12   20:ldc1            #32  <String "url">
	//   13   22:aconst_null     
	//   14   23:invokestatic    #64  <Method String tryGetStringFromJson(JSONObject, String, String)>
	//   15   26:astore_1        
		}
	//*  16   27:aload_1         
	//*  17   28:ifnull          39
	//*  18   31:aload_1         
	//*  19   32:invokestatic    #70  <Method Uri Uri.parse(String)>
	//*  20   35:astore_1        
	//*  21   36:goto            41
	//*  22   39:aconst_null     
	//*  23   40:astore_1        
	//*  24   41:aload_1         
	//*  25   42:ifnull          47
	//*  26   45:aload_1         
	//*  27   46:astore_0        
	//*  28   47:aload_0         
	//*  29   48:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*  30   49:astore_1        
		{
			return uri;
	//   31   50:aload_0         
	//   32   51:areturn         
		}
		if(jsonobject == null)
			break MISSING_BLOCK_LABEL_39;
		jsonobject = ((JSONObject) (Uri.parse(((String) (jsonobject)))));
		break MISSING_BLOCK_LABEL_41;
		jsonobject = null;
		if(jsonobject != null)
			uri = ((Uri) (jsonobject));
		return uri;
	}

	private static boolean tryGetBooleanFromJson(JSONObject jsonobject, String s, boolean flag)
	{
		boolean flag1;
		try
		{
			flag1 = jsonobject.getBoolean(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #91  <Method boolean JSONObject.getBoolean(String)>
	//    3    5:istore_3        
		}
	//*   4    6:iload_3         
	//*   5    7:ireturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*   6    8:astore_0        
		{
			return flag;
	//    7    9:iload_2         
	//    8   10:ireturn         
		}
		return flag1;
	}

	private static String tryGetStringFromJson(JSONObject jsonobject, String s, String s1)
	{
		try
		{
			jsonobject = ((JSONObject) (jsonobject.getString(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #95  <Method String JSONObject.getString(String)>
	//    3    5:astore_0        
		}
	//*   4    6:aload_0         
	//*   5    7:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*   6    8:astore_0        
		{
			return s1;
	//    7    9:aload_2         
	//    8   10:areturn         
		}
		return ((String) (jsonobject));
	}

	public Task getAppLinkFromUrlInBackground(final Uri uri)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #99  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #100 <Method void ArrayList()>
	//    3    7:astore_2        
		arraylist.add(((Object) (uri)));
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #104 <Method boolean ArrayList.add(Object)>
	//    7   13:pop             
		return getAppLinkFromUrlsInBackground(((List) (arraylist))).onSuccess(new Continuation() {

			public AppLink then(Task task)
				throws Exception
			{
				return (AppLink)((Map)task.getResult()).get(((Object) (uri)));
			//    0    0:aload_1         
			//    1    1:invokevirtual   #36  <Method Object Task.getResult()>
			//    2    4:checkcast       #38  <Class Map>
			//    3    7:aload_0         
			//    4    8:getfield        #22  <Field Uri val$uri>
			//    5   11:invokeinterface #42  <Method Object Map.get(Object)>
			//    6   16:checkcast       #44  <Class AppLink>
			//    7   19:areturn         
			}

			public volatile Object then(Task task)
				throws Exception
			{
				return ((Object) (then(task)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #50  <Method AppLink then(Task)>
			//    3    5:areturn         
			}

			final FacebookAppLinkResolver this$0;
			final Uri val$uri;

			
			{
				this$0 = FacebookAppLinkResolver.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field FacebookAppLinkResolver this$0>
				uri = uri1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Uri val$uri>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #108 <Method Task getAppLinkFromUrlsInBackground(List)>
	//   11   19:new             #8   <Class FacebookAppLinkResolver$1>
	//   12   22:dup             
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokespecial   #111 <Method void FacebookAppLinkResolver$1(FacebookAppLinkResolver, Uri)>
	//   16   28:invokevirtual   #117 <Method Task Task.onSuccess(Continuation)>
	//   17   31:areturn         
	}

	public Task getAppLinkFromUrlsInBackground(final List taskCompletionSource)
	{
		final HashSet urisToRequest;
		StringBuilder stringbuilder;
		appLinkResults = ((Object) (new HashMap()));
	//    0    0:new             #44  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void HashMap()>
	//    3    7:astore_2        
		urisToRequest = new HashSet();
	//    4    8:new             #121 <Class HashSet>
	//    5   11:dup             
	//    6   12:invokespecial   #122 <Method void HashSet()>
	//    7   15:astore_3        
		stringbuilder = new StringBuilder();
	//    8   16:new             #124 <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #125 <Method void StringBuilder()>
	//   11   23:astore          4
		for(Iterator iterator = taskCompletionSource.iterator(); iterator.hasNext();)
	//*  12   25:aload_1         
	//*  13   26:invokeinterface #131 <Method Iterator List.iterator()>
	//*  14   31:astore          5
	//*  15   33:aload           5
	//*  16   35:invokeinterface #137 <Method boolean Iterator.hasNext()>
	//*  17   40:ifeq            138
		{
			Uri uri = (Uri)iterator.next();
	//   18   43:aload           5
	//   19   45:invokeinterface #141 <Method Object Iterator.next()>
	//   20   50:checkcast       #66  <Class Uri>
	//   21   53:astore          6
			AppLink applink;
			synchronized(cachedAppLinks)
	//*  22   55:aload_0         
	//*  23   56:getfield        #47  <Field HashMap cachedAppLinks>
	//*  24   59:astore_1        
	//*  25   60:aload_1         
	//*  26   61:monitorenter    
			{
				applink = (AppLink)cachedAppLinks.get(((Object) (uri)));
	//   27   62:aload_0         
	//   28   63:getfield        #47  <Field HashMap cachedAppLinks>
	//   29   66:aload           6
	//   30   68:invokevirtual   #145 <Method Object HashMap.get(Object)>
	//   31   71:checkcast       #147 <Class AppLink>
	//   32   74:astore          7
			}
	//   33   76:aload_1         
	//   34   77:monitorexit     
			if(applink != null)
	//*  35   78:aload           7
	//*  36   80:ifnull          97
			{
				((Map) (appLinkResults)).put(((Object) (uri)), ((Object) (applink)));
	//   37   83:aload_2         
	//   38   84:aload           6
	//   39   86:aload           7
	//   40   88:invokeinterface #153 <Method Object Map.put(Object, Object)>
	//   41   93:pop             
			} else
	//*  42   94:goto            33
			{
				if(!urisToRequest.isEmpty())
	//*  43   97:aload_3         
	//*  44   98:invokevirtual   #156 <Method boolean HashSet.isEmpty()>
	//*  45  101:ifne            112
					stringbuilder.append(',');
	//   46  104:aload           4
	//   47  106:bipush          44
	//   48  108:invokevirtual   #160 <Method StringBuilder StringBuilder.append(char)>
	//   49  111:pop             
				stringbuilder.append(uri.toString());
	//   50  112:aload           4
	//   51  114:aload           6
	//   52  116:invokevirtual   #164 <Method String Uri.toString()>
	//   53  119:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   54  122:pop             
				urisToRequest.add(((Object) (uri)));
	//   55  123:aload_3         
	//   56  124:aload           6
	//   57  126:invokevirtual   #168 <Method boolean HashSet.add(Object)>
	//   58  129:pop             
			}
		}

		break MISSING_BLOCK_LABEL_138;
	//   59  130:goto            33
		appLinkResults;
	//   60  133:astore_2        
		taskCompletionSource;
	//   61  134:aload_1         
		JVM INSTR monitorexit ;
	//   62  135:monitorexit     
		throw appLinkResults;
	//   63  136:aload_2         
	//   64  137:athrow          
		if(urisToRequest.isEmpty())
	//*  65  138:aload_3         
	//*  66  139:invokevirtual   #156 <Method boolean HashSet.isEmpty()>
	//*  67  142:ifeq            150
		{
			return Task.forResult(appLinkResults);
	//   68  145:aload_2         
	//   69  146:invokestatic    #172 <Method Task Task.forResult(Object)>
	//   70  149:areturn         
		} else
		{
			taskCompletionSource = ((List) (Task.create()));
	//   71  150:invokestatic    #176 <Method bolts.Task$TaskCompletionSource Task.create()>
	//   72  153:astore_1        
			Bundle bundle = new Bundle();
	//   73  154:new             #178 <Class Bundle>
	//   74  157:dup             
	//   75  158:invokespecial   #179 <Method void Bundle()>
	//   76  161:astore          5
			bundle.putString("ids", stringbuilder.toString());
	//   77  163:aload           5
	//   78  165:ldc1            #181 <String "ids">
	//   79  167:aload           4
	//   80  169:invokevirtual   #182 <Method String StringBuilder.toString()>
	//   81  172:invokevirtual   #186 <Method void Bundle.putString(String, String)>
			bundle.putString("fields", String.format("%s.fields(%s,%s)", new Object[] {
				"app_links", "android", "web"
			}));
	//   82  175:aload           5
	//   83  177:ldc1            #188 <String "fields">
	//   84  179:ldc1            #190 <String "%s.fields(%s,%s)">
	//   85  181:iconst_3        
	//   86  182:anewarray       Object[]
	//   87  185:dup             
	//   88  186:iconst_0        
	//   89  187:ldc1            #17  <String "app_links">
	//   90  189:aastore         
	//   91  190:dup             
	//   92  191:iconst_1        
	//   93  192:ldc1            #14  <String "android">
	//   94  194:aastore         
	//   95  195:dup             
	//   96  196:iconst_2        
	//   97  197:ldc1            #35  <String "web">
	//   98  199:aastore         
	//   99  200:invokestatic    #196 <Method String String.format(String, Object[])>
	//  100  203:invokevirtual   #186 <Method void Bundle.putString(String, String)>
			(new GraphRequest(AccessToken.getCurrentAccessToken(), "", bundle, ((com.facebook.HttpMethod) (null)), new com.facebook.GraphRequest.Callback() {

				public void onCompleted(GraphResponse graphresponse)
				{
					Object obj;
					obj = ((Object) (graphresponse.getError()));
				//    0    0:aload_1         
				//    1    1:invokevirtual   #43  <Method FacebookRequestError GraphResponse.getError()>
				//    2    4:astore          4
					if(obj != null)
				//*   3    6:aload           4
				//*   4    8:ifnull          24
					{
						taskCompletionSource.setError(((Exception) (((FacebookRequestError) (obj)).getException())));
				//    5   11:aload_0         
				//    6   12:getfield        #25  <Field bolts.Task$TaskCompletionSource val$taskCompletionSource>
				//    7   15:aload           4
				//    8   17:invokevirtual   #49  <Method com.facebook.FacebookException FacebookRequestError.getException()>
				//    9   20:invokevirtual   #55  <Method void bolts.Task$TaskCompletionSource.setError(Exception)>
						return;
				//   10   23:return          
					}
					graphresponse = ((GraphResponse) (graphresponse.getJSONObject()));
				//   11   24:aload_1         
				//   12   25:invokevirtual   #59  <Method JSONObject GraphResponse.getJSONObject()>
				//   13   28:astore_1        
					if(graphresponse == null)
				//*  14   29:aload_1         
				//*  15   30:ifnonnull       45
					{
						taskCompletionSource.setResult(((Object) (appLinkResults)));
				//   16   33:aload_0         
				//   17   34:getfield        #25  <Field bolts.Task$TaskCompletionSource val$taskCompletionSource>
				//   18   37:aload_0         
				//   19   38:getfield        #27  <Field Map val$appLinkResults>
				//   20   41:invokevirtual   #63  <Method void bolts.Task$TaskCompletionSource.setResult(Object)>
						return;
				//   21   44:return          
					}
					obj = ((Object) (urisToRequest.iterator()));
				//   22   45:aload_0         
				//   23   46:getfield        #29  <Field HashSet val$urisToRequest>
				//   24   49:invokevirtual   #69  <Method Iterator HashSet.iterator()>
				//   25   52:astore          4
_L5:
					if(!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
				//   26   54:aload           4
				//   27   56:invokeinterface #75  <Method boolean Iterator.hasNext()>
				//   28   61:ifeq            243
_L1:
					Uri uri1 = (Uri)((Iterator) (obj)).next();
				//   29   64:aload           4
				//   30   66:invokeinterface #79  <Method Object Iterator.next()>
				//   31   71:checkcast       #81  <Class Uri>
				//   32   74:astore          5
					if(((JSONObject) (graphresponse)).has(uri1.toString())) goto _L4; else goto _L3
				//   33   76:aload_1         
				//   34   77:aload           5
				//   35   79:invokevirtual   #85  <Method String Uri.toString()>
				//   36   82:invokevirtual   #91  <Method boolean JSONObject.has(String)>
				//   37   85:ifne            91
				//*  38   88:goto            54
_L4:
					int j;
					JSONObject jsonobject;
					Object obj1;
					ArrayList arraylist;
					jsonobject = ((JSONObject) (graphresponse)).getJSONObject(uri1.toString()).getJSONObject("app_links");
				//   39   91:aload_1         
				//   40   92:aload           5
				//   41   94:invokevirtual   #85  <Method String Uri.toString()>
				//   42   97:invokevirtual   #94  <Method JSONObject JSONObject.getJSONObject(String)>
				//   43  100:ldc1            #96  <String "app_links">
				//   44  102:invokevirtual   #94  <Method JSONObject JSONObject.getJSONObject(String)>
				//   45  105:astore          6
					obj1 = ((Object) (jsonobject.getJSONArray("android")));
				//   46  107:aload           6
				//   47  109:ldc1            #98  <String "android">
				//   48  111:invokevirtual   #102 <Method JSONArray JSONObject.getJSONArray(String)>
				//   49  114:astore          7
					j = ((JSONArray) (obj1)).length();
				//   50  116:aload           7
				//   51  118:invokevirtual   #108 <Method int JSONArray.length()>
				//   52  121:istore_3        
					arraylist = new ArrayList(j);
				//   53  122:new             #110 <Class ArrayList>
				//   54  125:dup             
				//   55  126:iload_3         
				//   56  127:invokespecial   #113 <Method void ArrayList(int)>
				//   57  130:astore          8
					JSONException jsonexception;
					bolts.AppLink.Target target;
					for(int i = 0; i >= j; i++)
						break MISSING_BLOCK_LABEL_168;

				//   58  132:iconst_0        
				//   59  133:istore_2        
				//   60  134:iload_2         
				//   61  135:iload_3         
				//   62  136:icmpge          168
				//   63  139:aload           7
				//   64  141:iload_2         
				//   65  142:invokevirtual   #116 <Method JSONObject JSONArray.getJSONObject(int)>
				//   66  145:invokestatic    #120 <Method bolts.AppLink$Target FacebookAppLinkResolver.access$000(JSONObject)>
				//   67  148:astore          9
				//   68  150:aload           9
				//   69  152:ifnull          260
				//   70  155:aload           8
				//   71  157:aload           9
				//   72  159:invokeinterface #126 <Method boolean List.add(Object)>
				//   73  164:pop             
				//   74  165:goto            260
				//   75  168:new             #128 <Class AppLink>
				//   76  171:dup             
				//   77  172:aload           5
				//   78  174:aload           8
				//   79  176:aload           5
				//   80  178:aload           6
				//   81  180:invokestatic    #132 <Method Uri FacebookAppLinkResolver.access$100(Uri, JSONObject)>
				//   82  183:invokespecial   #135 <Method void AppLink(Uri, List, Uri)>
				//   83  186:astore          7
				//   84  188:aload_0         
				//   85  189:getfield        #27  <Field Map val$appLinkResults>
				//   86  192:aload           5
				//   87  194:aload           7
				//   88  196:invokeinterface #141 <Method Object Map.put(Object, Object)>
				//   89  201:pop             
				//   90  202:aload_0         
				//   91  203:getfield        #23  <Field FacebookAppLinkResolver this$0>
				//   92  206:invokestatic    #145 <Method HashMap FacebookAppLinkResolver.access$200(FacebookAppLinkResolver)>
				//   93  209:astore          6
				//   94  211:aload           6
				//   95  213:monitorenter    
				//   96  214:aload_0         
				//   97  215:getfield        #23  <Field FacebookAppLinkResolver this$0>
				//   98  218:invokestatic    #145 <Method HashMap FacebookAppLinkResolver.access$200(FacebookAppLinkResolver)>
				//   99  221:aload           5
				//  100  223:aload           7
				//  101  225:invokevirtual   #148 <Method Object HashMap.put(Object, Object)>
				//  102  228:pop             
				//  103  229:aload           6
				//  104  231:monitorexit     
				//  105  232:goto            54
				//  106  235:astore          5
				//  107  237:aload           6
				//  108  239:monitorexit     
				//  109  240:aload           5
				//  110  242:athrow          
				//  111  243:aload_0         
				//  112  244:getfield        #25  <Field bolts.Task$TaskCompletionSource val$taskCompletionSource>
				//  113  247:aload_0         
				//  114  248:getfield        #27  <Field Map val$appLinkResults>
				//  115  251:invokevirtual   #63  <Method void bolts.Task$TaskCompletionSource.setResult(Object)>
				//  116  254:return          
				//  117  255:astore          5
				//  118  257:goto            54
				//  119  260:iload_2         
				//  120  261:iconst_1        
				//  121  262:iadd            
				//  122  263:istore_2        
					target = FacebookAppLinkResolver.getAndroidTargetFromJson(((JSONArray) (obj1)).getJSONObject(i));
					if(target == null)
						break MISSING_BLOCK_LABEL_260;
					((List) (arraylist)).add(((Object) (target)));
					break MISSING_BLOCK_LABEL_260;
					obj1 = ((Object) (new AppLink(uri1, ((List) (arraylist)), FacebookAppLinkResolver.getWebFallbackUriFromJson(uri1, jsonobject))));
					appLinkResults.put(((Object) (uri1)), obj1);
					synchronized(cachedAppLinks)
					{
						cachedAppLinks.put(((Object) (uri1)), obj1);
					}
					  goto _L3
					exception;
					hashmap;
					JVM INSTR monitorexit ;
					try
					{
						throw exception;
					}
					// Misplaced declaration of an exception variable
					catch(JSONException jsonexception) { }
_L3:
					if(true) goto _L5; else goto _L2
_L2:
					taskCompletionSource.setResult(((Object) (appLinkResults)));
					return;
				//* 123  264:goto            134
				}

				final FacebookAppLinkResolver this$0;
				final Map val$appLinkResults;
				final bolts.Task.TaskCompletionSource val$taskCompletionSource;
				final HashSet val$urisToRequest;

			
			{
				this$0 = FacebookAppLinkResolver.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field FacebookAppLinkResolver this$0>
				taskCompletionSource = taskcompletionsource;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field bolts.Task$TaskCompletionSource val$taskCompletionSource>
				appLinkResults = map;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field Map val$appLinkResults>
				urisToRequest = hashset;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field HashSet val$urisToRequest>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
			}
)).executeAsync();
	//  101  206:new             #198 <Class GraphRequest>
	//  102  209:dup             
	//  103  210:invokestatic    #204 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//  104  213:ldc1            #206 <String "">
	//  105  215:aload           5
	//  106  217:aconst_null     
	//  107  218:new             #10  <Class FacebookAppLinkResolver$2>
	//  108  221:dup             
	//  109  222:aload_0         
	//  110  223:aload_1         
	//  111  224:aload_2         
	//  112  225:aload_3         
	//  113  226:invokespecial   #209 <Method void FacebookAppLinkResolver$2(FacebookAppLinkResolver, bolts.Task$TaskCompletionSource, Map, HashSet)>
	//  114  229:invokespecial   #212 <Method void GraphRequest(AccessToken, String, Bundle, com.facebook.HttpMethod, com.facebook.GraphRequest$Callback)>
	//  115  232:invokevirtual   #216 <Method com.facebook.GraphRequestAsyncTask GraphRequest.executeAsync()>
	//  116  235:pop             
			return ((bolts.Task.TaskCompletionSource) (taskCompletionSource)).getTask();
	//  117  236:aload_1         
	//  118  237:invokevirtual   #222 <Method Task bolts.Task$TaskCompletionSource.getTask()>
	//  119  240:areturn         
		}
	}

	private static final String APP_LINK_ANDROID_TARGET_KEY = "android";
	private static final String APP_LINK_KEY = "app_links";
	private static final String APP_LINK_TARGET_APP_NAME_KEY = "app_name";
	private static final String APP_LINK_TARGET_CLASS_KEY = "class";
	private static final String APP_LINK_TARGET_PACKAGE_KEY = "package";
	private static final String APP_LINK_TARGET_SHOULD_FALLBACK_KEY = "should_fallback";
	private static final String APP_LINK_TARGET_URL_KEY = "url";
	private static final String APP_LINK_WEB_TARGET_KEY = "web";
	private final HashMap cachedAppLinks = new HashMap();


/*
	static bolts.AppLink.Target access$000(JSONObject jsonobject)
	{
		return getAndroidTargetFromJson(jsonobject);
	//    0    0:aload_0         
	//    1    1:invokestatic    #53  <Method bolts.AppLink$Target getAndroidTargetFromJson(JSONObject)>
	//    2    4:areturn         
	}

*/


/*
	static Uri access$100(Uri uri, JSONObject jsonobject)
	{
		return getWebFallbackUriFromJson(uri, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #58  <Method Uri getWebFallbackUriFromJson(Uri, JSONObject)>
	//    3    5:areturn         
	}

*/


/*
	static HashMap access$200(FacebookAppLinkResolver facebookapplinkresolver)
	{
		return facebookapplinkresolver.cachedAppLinks;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field HashMap cachedAppLinks>
	//    2    4:areturn         
	}

*/
}
