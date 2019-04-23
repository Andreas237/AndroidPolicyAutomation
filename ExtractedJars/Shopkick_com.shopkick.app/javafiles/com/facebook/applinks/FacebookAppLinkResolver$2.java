// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.applinks;

import android.net.Uri;
import bolts.AppLink;
import com.facebook.FacebookRequestError;
import com.facebook.GraphResponse;
import java.util.*;
import org.json.*;

// Referenced classes of package com.facebook.applinks:
//			FacebookAppLinkResolver

class FacebookAppLinkResolver$2
	implements com.facebook.GraphRequest.Callback
{

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
			val$taskCompletionSource.setError(((Exception) (((FacebookRequestError) (obj)).getException())));
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
			val$taskCompletionSource.setResult(((Object) (val$appLinkResults)));
	//   16   33:aload_0         
	//   17   34:getfield        #25  <Field bolts.Task$TaskCompletionSource val$taskCompletionSource>
	//   18   37:aload_0         
	//   19   38:getfield        #27  <Field Map val$appLinkResults>
	//   20   41:invokevirtual   #63  <Method void bolts.Task$TaskCompletionSource.setResult(Object)>
			return;
	//   21   44:return          
		}
		obj = ((Object) (val$urisToRequest.iterator()));
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
		Uri uri = (Uri)((Iterator) (obj)).next();
	//   29   64:aload           4
	//   30   66:invokeinterface #79  <Method Object Iterator.next()>
	//   31   71:checkcast       #81  <Class Uri>
	//   32   74:astore          5
		if(((JSONObject) (graphresponse)).has(uri.toString())) goto _L4; else goto _L3
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
		jsonobject = ((JSONObject) (graphresponse)).getJSONObject(uri.toString()).getJSONObject("app_links");
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
		target = FacebookAppLinkResolver.access$000(((JSONArray) (obj1)).getJSONObject(i));
		if(target == null)
			break MISSING_BLOCK_LABEL_260;
		((List) (arraylist)).add(((Object) (target)));
		break MISSING_BLOCK_LABEL_260;
		obj1 = ((Object) (new AppLink(uri, ((List) (arraylist)), FacebookAppLinkResolver.access$100(uri, jsonobject))));
		val$appLinkResults.put(((Object) (uri)), obj1);
		synchronized(FacebookAppLinkResolver.access$200(FacebookAppLinkResolver.this))
		{
			FacebookAppLinkResolver.access$200(FacebookAppLinkResolver.this).put(((Object) (uri)), obj1);
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
		val$taskCompletionSource.setResult(((Object) (val$appLinkResults)));
		return;
	//* 123  264:goto            134
	}

	final FacebookAppLinkResolver this$0;
	final Map val$appLinkResults;
	final bolts.Task$TaskCompletionSource val$taskCompletionSource;
	final HashSet val$urisToRequest;

	FacebookAppLinkResolver$2()
	{
		this$0 = final_facebookapplinkresolver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field FacebookAppLinkResolver this$0>
		val$taskCompletionSource = task$taskcompletionsource;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field bolts.Task$TaskCompletionSource val$taskCompletionSource>
		val$appLinkResults = map;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field Map val$appLinkResults>
		val$urisToRequest = HashSet.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field HashSet val$urisToRequest>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
