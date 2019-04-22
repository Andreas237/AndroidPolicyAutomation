// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import java.util.Date;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.facebook:
//			AccessTokenManager, AccessToken, FacebookException, GraphRequestBatch

class AccessTokenManager$4
	implements lback
{

	public void onBatchCompleted(GraphRequestBatch graphrequestbatch)
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		if(AccessTokenManager.getInstance().getCurrentAccessToken() == null || AccessTokenManager.getInstance().getCurrentAccessToken().getUserId() != val$accessToken.getUserId())
	//*   2    3:invokestatic    #50  <Method AccessTokenManager AccessTokenManager.getInstance()>
	//*   3    6:invokevirtual   #54  <Method AccessToken AccessTokenManager.getCurrentAccessToken()>
	//*   4    9:ifnull          322
	//*   5   12:invokestatic    #50  <Method AccessTokenManager AccessTokenManager.getInstance()>
	//*   6   15:invokevirtual   #54  <Method AccessToken AccessTokenManager.getCurrentAccessToken()>
	//*   7   18:invokevirtual   #60  <Method String AccessToken.getUserId()>
	//*   8   21:aload_0         
	//*   9   22:getfield        #30  <Field AccessToken val$accessToken>
	//*  10   25:invokevirtual   #60  <Method String AccessToken.getUserId()>
	//*  11   28:if_acmpeq       34
			break MISSING_BLOCK_LABEL_322;
	//   12   31:goto            322
		if(val$permissionsCallSucceeded.get() || val$refreshResult.accessToken != null || val$refreshResult.expiresAt != 0)
			break MISSING_BLOCK_LABEL_106;
	//   13   34:aload_0         
	//   14   35:getfield        #34  <Field AtomicBoolean val$permissionsCallSucceeded>
	//   15   38:invokevirtual   #66  <Method boolean AtomicBoolean.get()>
	//   16   41:ifne            106
	//   17   44:aload_0         
	//   18   45:getfield        #36  <Field AccessTokenManager$RefreshResult val$refreshResult>
	//   19   48:getfield        #72  <Field String AccessTokenManager$RefreshResult.accessToken>
	//   20   51:ifnonnull       106
	//   21   54:aload_0         
	//   22   55:getfield        #36  <Field AccessTokenManager$RefreshResult val$refreshResult>
	//   23   58:getfield        #76  <Field int AccessTokenManager$RefreshResult.expiresAt>
	//   24   61:ifne            106
		if(val$callback != null)
	//*  25   64:aload_0         
	//*  26   65:getfield        #32  <Field AccessToken$AccessTokenRefreshCallback val$callback>
	//*  27   68:ifnull          89
			val$callback.OnTokenRefreshFailed(new FacebookException("Failed to refresh access token"));
	//   28   71:aload_0         
	//   29   72:getfield        #32  <Field AccessToken$AccessTokenRefreshCallback val$callback>
	//   30   75:new             #78  <Class FacebookException>
	//   31   78:dup             
	//   32   79:ldc1            #80  <String "Failed to refresh access token">
	//   33   81:invokespecial   #83  <Method void FacebookException(String)>
	//   34   84:invokeinterface #89  <Method void AccessToken$AccessTokenRefreshCallback.OnTokenRefreshFailed(FacebookException)>
		AccessTokenManager.access$200(AccessTokenManager.this).set(false);
	//   35   89:aload_0         
	//   36   90:getfield        #28  <Field AccessTokenManager this$0>
	//   37   93:invokestatic    #93  <Method AtomicBoolean AccessTokenManager.access$200(AccessTokenManager)>
	//   38   96:iconst_0        
	//   39   97:invokevirtual   #97  <Method void AtomicBoolean.set(boolean)>
		graphrequestbatch = ((GraphRequestBatch) (val$callback));
	//   40  100:aload_0         
	//   41  101:getfield        #32  <Field AccessToken$AccessTokenRefreshCallback val$callback>
	//   42  104:astore_1        
		return;
	//   43  105:return          
		if(val$refreshResult.accessToken != null)
	//*  44  106:aload_0         
	//*  45  107:getfield        #36  <Field AccessTokenManager$RefreshResult val$refreshResult>
	//*  46  110:getfield        #72  <Field String AccessTokenManager$RefreshResult.accessToken>
	//*  47  113:ifnull          127
		{
			graphrequestbatch = ((GraphRequestBatch) (val$refreshResult.accessToken));
	//   48  116:aload_0         
	//   49  117:getfield        #36  <Field AccessTokenManager$RefreshResult val$refreshResult>
	//   50  120:getfield        #72  <Field String AccessTokenManager$RefreshResult.accessToken>
	//   51  123:astore_1        
			break MISSING_BLOCK_LABEL_135;
	//   52  124:goto            135
		}
		graphrequestbatch = ((GraphRequestBatch) (val$accessToken.getToken()));
	//   53  127:aload_0         
	//   54  128:getfield        #30  <Field AccessToken val$accessToken>
	//   55  131:invokevirtual   #100 <Method String AccessToken.getToken()>
	//   56  134:astore_1        
		Object obj;
		String s;
		String s1;
		s = val$accessToken.getApplicationId();
	//   57  135:aload_0         
	//   58  136:getfield        #30  <Field AccessToken val$accessToken>
	//   59  139:invokevirtual   #103 <Method String AccessToken.getApplicationId()>
	//   60  142:astore          6
		s1 = val$accessToken.getUserId();
	//   61  144:aload_0         
	//   62  145:getfield        #30  <Field AccessToken val$accessToken>
	//   63  148:invokevirtual   #60  <Method String AccessToken.getUserId()>
	//   64  151:astore          7
		if(val$permissionsCallSucceeded.get())
	//*  65  153:aload_0         
	//*  66  154:getfield        #34  <Field AtomicBoolean val$permissionsCallSucceeded>
	//*  67  157:invokevirtual   #66  <Method boolean AtomicBoolean.get()>
	//*  68  160:ifeq            171
		{
			obj = ((Object) (val$permissions));
	//   69  163:aload_0         
	//   70  164:getfield        #38  <Field Set val$permissions>
	//   71  167:astore_2        
			break MISSING_BLOCK_LABEL_179;
	//   72  168:goto            179
		}
		obj = ((Object) (val$accessToken.getPermissions()));
	//   73  171:aload_0         
	//   74  172:getfield        #30  <Field AccessToken val$accessToken>
	//   75  175:invokevirtual   #107 <Method Set AccessToken.getPermissions()>
	//   76  178:astore_2        
		Set set;
		if(val$permissionsCallSucceeded.get())
	//*  77  179:aload_0         
	//*  78  180:getfield        #34  <Field AtomicBoolean val$permissionsCallSucceeded>
	//*  79  183:invokevirtual   #66  <Method boolean AtomicBoolean.get()>
	//*  80  186:ifeq            197
		{
			set = val$declinedPermissions;
	//   81  189:aload_0         
	//   82  190:getfield        #40  <Field Set val$declinedPermissions>
	//   83  193:astore_3        
			break MISSING_BLOCK_LABEL_205;
	//   84  194:goto            205
		}
		set = val$accessToken.getDeclinedPermissions();
	//   85  197:aload_0         
	//   86  198:getfield        #30  <Field AccessToken val$accessToken>
	//   87  201:invokevirtual   #110 <Method Set AccessToken.getDeclinedPermissions()>
	//   88  204:astore_3        
		Date date;
		AccessTokenSource accesstokensource;
		accesstokensource = val$accessToken.getSource();
	//   89  205:aload_0         
	//   90  206:getfield        #30  <Field AccessToken val$accessToken>
	//   91  209:invokevirtual   #114 <Method AccessTokenSource AccessToken.getSource()>
	//   92  212:astore          8
		if(val$refreshResult.expiresAt != 0)
	//*  93  214:aload_0         
	//*  94  215:getfield        #36  <Field AccessTokenManager$RefreshResult val$refreshResult>
	//*  95  218:getfield        #76  <Field int AccessTokenManager$RefreshResult.expiresAt>
	//*  96  221:ifeq            248
		{
			date = new Date((long)val$refreshResult.expiresAt * 1000L);
	//   97  224:new             #116 <Class Date>
	//   98  227:dup             
	//   99  228:aload_0         
	//  100  229:getfield        #36  <Field AccessTokenManager$RefreshResult val$refreshResult>
	//  101  232:getfield        #76  <Field int AccessTokenManager$RefreshResult.expiresAt>
	//  102  235:i2l             
	//  103  236:ldc2w           #117 <Long 1000L>
	//  104  239:lmul            
	//  105  240:invokespecial   #121 <Method void Date(long)>
	//  106  243:astore          4
			break MISSING_BLOCK_LABEL_257;
	//  107  245:goto            257
		}
		date = val$accessToken.getExpires();
	//  108  248:aload_0         
	//  109  249:getfield        #30  <Field AccessToken val$accessToken>
	//  110  252:invokevirtual   #125 <Method Date AccessToken.getExpires()>
	//  111  255:astore          4
		obj = ((Object) (new AccessToken(((String) (graphrequestbatch)), s, s1, ((java.util.Collection) (obj)), ((java.util.Collection) (set)), accesstokensource, date, new Date())));
	//  112  257:new             #56  <Class AccessToken>
	//  113  260:dup             
	//  114  261:aload_1         
	//  115  262:aload           6
	//  116  264:aload           7
	//  117  266:aload_2         
	//  118  267:aload_3         
	//  119  268:aload           8
	//  120  270:aload           4
	//  121  272:new             #116 <Class Date>
	//  122  275:dup             
	//  123  276:invokespecial   #126 <Method void Date()>
	//  124  279:invokespecial   #129 <Method void AccessToken(String, String, String, java.util.Collection, java.util.Collection, AccessTokenSource, Date, Date)>
	//  125  282:astore_2        
		AccessTokenManager.getInstance().setCurrentAccessToken(((AccessToken) (obj)));
	//  126  283:invokestatic    #50  <Method AccessTokenManager AccessTokenManager.getInstance()>
	//  127  286:aload_2         
	//  128  287:invokevirtual   #133 <Method void AccessTokenManager.setCurrentAccessToken(AccessToken)>
		AccessTokenManager.access$200(AccessTokenManager.this).set(false);
	//  129  290:aload_0         
	//  130  291:getfield        #28  <Field AccessTokenManager this$0>
	//  131  294:invokestatic    #93  <Method AtomicBoolean AccessTokenManager.access$200(AccessTokenManager)>
	//  132  297:iconst_0        
	//  133  298:invokevirtual   #97  <Method void AtomicBoolean.set(boolean)>
		graphrequestbatch = ((GraphRequestBatch) (val$callback));
	//  134  301:aload_0         
	//  135  302:getfield        #32  <Field AccessToken$AccessTokenRefreshCallback val$callback>
	//  136  305:astore_1        
		if(graphrequestbatch != null)
	//* 137  306:aload_1         
	//* 138  307:ifnull          317
			((enRefreshCallback) (graphrequestbatch)).OnTokenRefreshed(((AccessToken) (obj)));
	//  139  310:aload_1         
	//  140  311:aload_2         
	//  141  312:invokeinterface #136 <Method void AccessToken$AccessTokenRefreshCallback.OnTokenRefreshed(AccessToken)>
		return;
	//  142  317:return          
		graphrequestbatch;
	//  143  318:astore_1        
		break MISSING_BLOCK_LABEL_368;
	//  144  319:goto            368
		if(val$callback != null)
	//* 145  322:aload_0         
	//* 146  323:getfield        #32  <Field AccessToken$AccessTokenRefreshCallback val$callback>
	//* 147  326:ifnull          347
			val$callback.OnTokenRefreshFailed(new FacebookException("No current access token to refresh"));
	//  148  329:aload_0         
	//  149  330:getfield        #32  <Field AccessToken$AccessTokenRefreshCallback val$callback>
	//  150  333:new             #78  <Class FacebookException>
	//  151  336:dup             
	//  152  337:ldc1            #138 <String "No current access token to refresh">
	//  153  339:invokespecial   #83  <Method void FacebookException(String)>
	//  154  342:invokeinterface #89  <Method void AccessToken$AccessTokenRefreshCallback.OnTokenRefreshFailed(FacebookException)>
		AccessTokenManager.access$200(AccessTokenManager.this).set(false);
	//  155  347:aload_0         
	//  156  348:getfield        #28  <Field AccessTokenManager this$0>
	//  157  351:invokestatic    #93  <Method AtomicBoolean AccessTokenManager.access$200(AccessTokenManager)>
	//  158  354:iconst_0        
	//  159  355:invokevirtual   #97  <Method void AtomicBoolean.set(boolean)>
		graphrequestbatch = ((GraphRequestBatch) (val$callback));
	//  160  358:aload_0         
	//  161  359:getfield        #32  <Field AccessToken$AccessTokenRefreshCallback val$callback>
	//  162  362:astore_1        
		return;
	//  163  363:return          
		graphrequestbatch;
	//  164  364:astore_1        
		obj = ((Object) (obj1));
	//  165  365:aload           5
	//  166  367:astore_2        
		AccessTokenManager.access$200(AccessTokenManager.this).set(false);
	//  167  368:aload_0         
	//  168  369:getfield        #28  <Field AccessTokenManager this$0>
	//  169  372:invokestatic    #93  <Method AtomicBoolean AccessTokenManager.access$200(AccessTokenManager)>
	//  170  375:iconst_0        
	//  171  376:invokevirtual   #97  <Method void AtomicBoolean.set(boolean)>
		enRefreshCallback enrefreshcallback = val$callback;
	//  172  379:aload_0         
	//  173  380:getfield        #32  <Field AccessToken$AccessTokenRefreshCallback val$callback>
	//  174  383:astore_3        
		if(enrefreshcallback != null && obj != null)
	//* 175  384:aload_3         
	//* 176  385:ifnull          399
	//* 177  388:aload_2         
	//* 178  389:ifnull          399
			enrefreshcallback.OnTokenRefreshed(((AccessToken) (obj)));
	//  179  392:aload_3         
	//  180  393:aload_2         
	//  181  394:invokeinterface #136 <Method void AccessToken$AccessTokenRefreshCallback.OnTokenRefreshed(AccessToken)>
		throw graphrequestbatch;
	//  182  399:aload_1         
	//  183  400:athrow          
	}

	final AccessTokenManager this$0;
	final AccessToken val$accessToken;
	final enRefreshCallback val$callback;
	final Set val$declinedPermissions;
	final Set val$permissions;
	final AtomicBoolean val$permissionsCallSucceeded;
	final freshResult val$refreshResult;

	AccessTokenManager$4()
	{
		this$0 = final_accesstokenmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field AccessTokenManager this$0>
		val$accessToken = accesstoken;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #30  <Field AccessToken val$accessToken>
		val$callback = enrefreshcallback;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #32  <Field AccessToken$AccessTokenRefreshCallback val$callback>
		val$permissionsCallSucceeded = atomicboolean;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #34  <Field AtomicBoolean val$permissionsCallSucceeded>
		val$refreshResult = freshresult;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #36  <Field AccessTokenManager$RefreshResult val$refreshResult>
		val$permissions = set;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #38  <Field Set val$permissions>
		val$declinedPermissions = Set.this;
	//   18   33:aload_0         
	//   19   34:aload           7
	//   20   36:putfield        #40  <Field Set val$declinedPermissions>
		super();
	//   21   39:aload_0         
	//   22   40:invokespecial   #43  <Method void Object()>
	//   23   43:return          
	}
}
