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
		if(AccessTokenManager.getInstance().getCurrentAccessToken() == null || AccessTokenManager.getInstance().getCurrentAccessToken().getUserId() != val$accessToken.getUserId())
	//*   0    0:invokestatic    #50  <Method AccessTokenManager AccessTokenManager.getInstance()>
	//*   1    3:invokevirtual   #54  <Method AccessToken AccessTokenManager.getCurrentAccessToken()>
	//*   2    6:ifnull          370
	//*   3    9:invokestatic    #50  <Method AccessTokenManager AccessTokenManager.getInstance()>
	//*   4   12:invokevirtual   #54  <Method AccessToken AccessTokenManager.getCurrentAccessToken()>
	//*   5   15:invokevirtual   #60  <Method String AccessToken.getUserId()>
	//*   6   18:aload_0         
	//*   7   19:getfield        #30  <Field AccessToken val$accessToken>
	//*   8   22:invokevirtual   #60  <Method String AccessToken.getUserId()>
	//*   9   25:if_acmpeq       31
			break MISSING_BLOCK_LABEL_370;
	//   10   28:goto            370
		if(val$permissionsCallSucceeded.get() || val$refreshResult.accessToken != null || val$refreshResult.expiresAt != 0)
			break MISSING_BLOCK_LABEL_103;
	//   11   31:aload_0         
	//   12   32:getfield        #34  <Field AtomicBoolean val$permissionsCallSucceeded>
	//   13   35:invokevirtual   #66  <Method boolean AtomicBoolean.get()>
	//   14   38:ifne            103
	//   15   41:aload_0         
	//   16   42:getfield        #36  <Field AccessTokenManager$RefreshResult val$refreshResult>
	//   17   45:getfield        #72  <Field String AccessTokenManager$RefreshResult.accessToken>
	//   18   48:ifnonnull       103
	//   19   51:aload_0         
	//   20   52:getfield        #36  <Field AccessTokenManager$RefreshResult val$refreshResult>
	//   21   55:getfield        #76  <Field int AccessTokenManager$RefreshResult.expiresAt>
	//   22   58:ifne            103
		if(val$callback != null)
	//*  23   61:aload_0         
	//*  24   62:getfield        #32  <Field AccessToken$AccessTokenRefreshCallback val$callback>
	//*  25   65:ifnull          86
			val$callback.OnTokenRefreshFailed(new FacebookException("Failed to refresh access token"));
	//   26   68:aload_0         
	//   27   69:getfield        #32  <Field AccessToken$AccessTokenRefreshCallback val$callback>
	//   28   72:new             #78  <Class FacebookException>
	//   29   75:dup             
	//   30   76:ldc1            #80  <String "Failed to refresh access token">
	//   31   78:invokespecial   #83  <Method void FacebookException(String)>
	//   32   81:invokeinterface #89  <Method void AccessToken$AccessTokenRefreshCallback.OnTokenRefreshFailed(FacebookException)>
		AccessTokenManager.access$200(AccessTokenManager.this).set(false);
	//   33   86:aload_0         
	//   34   87:getfield        #28  <Field AccessTokenManager this$0>
	//   35   90:invokestatic    #93  <Method AtomicBoolean AccessTokenManager.access$200(AccessTokenManager)>
	//   36   93:iconst_0        
	//   37   94:invokevirtual   #97  <Method void AtomicBoolean.set(boolean)>
		graphrequestbatch = ((GraphRequestBatch) (val$callback));
	//   38   97:aload_0         
	//   39   98:getfield        #32  <Field AccessToken$AccessTokenRefreshCallback val$callback>
	//   40  101:astore_1        
		return;
	//   41  102:return          
		if(val$refreshResult.accessToken != null)
	//*  42  103:aload_0         
	//*  43  104:getfield        #36  <Field AccessTokenManager$RefreshResult val$refreshResult>
	//*  44  107:getfield        #72  <Field String AccessTokenManager$RefreshResult.accessToken>
	//*  45  110:ifnull          124
		{
			graphrequestbatch = ((GraphRequestBatch) (val$refreshResult.accessToken));
	//   46  113:aload_0         
	//   47  114:getfield        #36  <Field AccessTokenManager$RefreshResult val$refreshResult>
	//   48  117:getfield        #72  <Field String AccessTokenManager$RefreshResult.accessToken>
	//   49  120:astore_1        
			break MISSING_BLOCK_LABEL_132;
	//   50  121:goto            132
		}
		graphrequestbatch = ((GraphRequestBatch) (val$accessToken.getToken()));
	//   51  124:aload_0         
	//   52  125:getfield        #30  <Field AccessToken val$accessToken>
	//   53  128:invokevirtual   #100 <Method String AccessToken.getToken()>
	//   54  131:astore_1        
		Object obj;
		String s;
		String s1;
		s = val$accessToken.getApplicationId();
	//   55  132:aload_0         
	//   56  133:getfield        #30  <Field AccessToken val$accessToken>
	//   57  136:invokevirtual   #103 <Method String AccessToken.getApplicationId()>
	//   58  139:astore          6
		s1 = val$accessToken.getUserId();
	//   59  141:aload_0         
	//   60  142:getfield        #30  <Field AccessToken val$accessToken>
	//   61  145:invokevirtual   #60  <Method String AccessToken.getUserId()>
	//   62  148:astore          7
		if(val$permissionsCallSucceeded.get())
	//*  63  150:aload_0         
	//*  64  151:getfield        #34  <Field AtomicBoolean val$permissionsCallSucceeded>
	//*  65  154:invokevirtual   #66  <Method boolean AtomicBoolean.get()>
	//*  66  157:ifeq            168
		{
			obj = ((Object) (val$permissions));
	//   67  160:aload_0         
	//   68  161:getfield        #38  <Field Set val$permissions>
	//   69  164:astore_2        
			break MISSING_BLOCK_LABEL_176;
	//   70  165:goto            176
		}
		obj = ((Object) (val$accessToken.getPermissions()));
	//   71  168:aload_0         
	//   72  169:getfield        #30  <Field AccessToken val$accessToken>
	//   73  172:invokevirtual   #107 <Method Set AccessToken.getPermissions()>
	//   74  175:astore_2        
		Set set;
		if(val$permissionsCallSucceeded.get())
	//*  75  176:aload_0         
	//*  76  177:getfield        #34  <Field AtomicBoolean val$permissionsCallSucceeded>
	//*  77  180:invokevirtual   #66  <Method boolean AtomicBoolean.get()>
	//*  78  183:ifeq            194
		{
			set = val$declinedPermissions;
	//   79  186:aload_0         
	//   80  187:getfield        #40  <Field Set val$declinedPermissions>
	//   81  190:astore_3        
			break MISSING_BLOCK_LABEL_202;
	//   82  191:goto            202
		}
		set = val$accessToken.getDeclinedPermissions();
	//   83  194:aload_0         
	//   84  195:getfield        #30  <Field AccessToken val$accessToken>
	//   85  198:invokevirtual   #110 <Method Set AccessToken.getDeclinedPermissions()>
	//   86  201:astore_3        
		Date date;
		AccessTokenSource accesstokensource;
		accesstokensource = val$accessToken.getSource();
	//   87  202:aload_0         
	//   88  203:getfield        #30  <Field AccessToken val$accessToken>
	//   89  206:invokevirtual   #114 <Method AccessTokenSource AccessToken.getSource()>
	//   90  209:astore          8
		if(val$refreshResult.expiresAt != 0)
	//*  91  211:aload_0         
	//*  92  212:getfield        #36  <Field AccessTokenManager$RefreshResult val$refreshResult>
	//*  93  215:getfield        #76  <Field int AccessTokenManager$RefreshResult.expiresAt>
	//*  94  218:ifeq            245
		{
			date = new Date((long)val$refreshResult.expiresAt * 1000L);
	//   95  221:new             #116 <Class Date>
	//   96  224:dup             
	//   97  225:aload_0         
	//   98  226:getfield        #36  <Field AccessTokenManager$RefreshResult val$refreshResult>
	//   99  229:getfield        #76  <Field int AccessTokenManager$RefreshResult.expiresAt>
	//  100  232:i2l             
	//  101  233:ldc2w           #117 <Long 1000L>
	//  102  236:lmul            
	//  103  237:invokespecial   #121 <Method void Date(long)>
	//  104  240:astore          4
			break MISSING_BLOCK_LABEL_254;
	//  105  242:goto            254
		}
		date = val$accessToken.getExpires();
	//  106  245:aload_0         
	//  107  246:getfield        #30  <Field AccessToken val$accessToken>
	//  108  249:invokevirtual   #125 <Method Date AccessToken.getExpires()>
	//  109  252:astore          4
		Date date1;
		Date date2;
		date2 = new Date();
	//  110  254:new             #116 <Class Date>
	//  111  257:dup             
	//  112  258:invokespecial   #126 <Method void Date()>
	//  113  261:astore          9
		if(val$refreshResult.dataAccessExpirationTime != null)
	//* 114  263:aload_0         
	//* 115  264:getfield        #36  <Field AccessTokenManager$RefreshResult val$refreshResult>
	//* 116  267:getfield        #130 <Field Long AccessTokenManager$RefreshResult.dataAccessExpirationTime>
	//* 117  270:ifnull          299
		{
			date1 = new Date(1000L * val$refreshResult.dataAccessExpirationTime.longValue());
	//  118  273:new             #116 <Class Date>
	//  119  276:dup             
	//  120  277:ldc2w           #117 <Long 1000L>
	//  121  280:aload_0         
	//  122  281:getfield        #36  <Field AccessTokenManager$RefreshResult val$refreshResult>
	//  123  284:getfield        #130 <Field Long AccessTokenManager$RefreshResult.dataAccessExpirationTime>
	//  124  287:invokevirtual   #136 <Method long Long.longValue()>
	//  125  290:lmul            
	//  126  291:invokespecial   #121 <Method void Date(long)>
	//  127  294:astore          5
			break MISSING_BLOCK_LABEL_308;
	//  128  296:goto            308
		}
		date1 = val$accessToken.getDataAccessExpirationTime();
	//  129  299:aload_0         
	//  130  300:getfield        #30  <Field AccessToken val$accessToken>
	//  131  303:invokevirtual   #139 <Method Date AccessToken.getDataAccessExpirationTime()>
	//  132  306:astore          5
		obj = ((Object) (new AccessToken(((String) (graphrequestbatch)), s, s1, ((java.util.Collection) (obj)), ((java.util.Collection) (set)), accesstokensource, date, date2, date1)));
	//  133  308:new             #56  <Class AccessToken>
	//  134  311:dup             
	//  135  312:aload_1         
	//  136  313:aload           6
	//  137  315:aload           7
	//  138  317:aload_2         
	//  139  318:aload_3         
	//  140  319:aload           8
	//  141  321:aload           4
	//  142  323:aload           9
	//  143  325:aload           5
	//  144  327:invokespecial   #142 <Method void AccessToken(String, String, String, java.util.Collection, java.util.Collection, AccessTokenSource, Date, Date, Date)>
	//  145  330:astore_2        
		AccessTokenManager.getInstance().setCurrentAccessToken(((AccessToken) (obj)));
	//  146  331:invokestatic    #50  <Method AccessTokenManager AccessTokenManager.getInstance()>
	//  147  334:aload_2         
	//  148  335:invokevirtual   #146 <Method void AccessTokenManager.setCurrentAccessToken(AccessToken)>
		AccessTokenManager.access$200(AccessTokenManager.this).set(false);
	//  149  338:aload_0         
	//  150  339:getfield        #28  <Field AccessTokenManager this$0>
	//  151  342:invokestatic    #93  <Method AtomicBoolean AccessTokenManager.access$200(AccessTokenManager)>
	//  152  345:iconst_0        
	//  153  346:invokevirtual   #97  <Method void AtomicBoolean.set(boolean)>
		graphrequestbatch = ((GraphRequestBatch) (val$callback));
	//  154  349:aload_0         
	//  155  350:getfield        #32  <Field AccessToken$AccessTokenRefreshCallback val$callback>
	//  156  353:astore_1        
		if(graphrequestbatch != null)
	//* 157  354:aload_1         
	//* 158  355:ifnull          365
			((enRefreshCallback) (graphrequestbatch)).OnTokenRefreshed(((AccessToken) (obj)));
	//  159  358:aload_1         
	//  160  359:aload_2         
	//  161  360:invokeinterface #149 <Method void AccessToken$AccessTokenRefreshCallback.OnTokenRefreshed(AccessToken)>
		return;
	//  162  365:return          
		graphrequestbatch;
	//  163  366:astore_1        
		break MISSING_BLOCK_LABEL_415;
	//  164  367:goto            415
		if(val$callback != null)
	//* 165  370:aload_0         
	//* 166  371:getfield        #32  <Field AccessToken$AccessTokenRefreshCallback val$callback>
	//* 167  374:ifnull          395
			val$callback.OnTokenRefreshFailed(new FacebookException("No current access token to refresh"));
	//  168  377:aload_0         
	//  169  378:getfield        #32  <Field AccessToken$AccessTokenRefreshCallback val$callback>
	//  170  381:new             #78  <Class FacebookException>
	//  171  384:dup             
	//  172  385:ldc1            #151 <String "No current access token to refresh">
	//  173  387:invokespecial   #83  <Method void FacebookException(String)>
	//  174  390:invokeinterface #89  <Method void AccessToken$AccessTokenRefreshCallback.OnTokenRefreshFailed(FacebookException)>
		AccessTokenManager.access$200(AccessTokenManager.this).set(false);
	//  175  395:aload_0         
	//  176  396:getfield        #28  <Field AccessTokenManager this$0>
	//  177  399:invokestatic    #93  <Method AtomicBoolean AccessTokenManager.access$200(AccessTokenManager)>
	//  178  402:iconst_0        
	//  179  403:invokevirtual   #97  <Method void AtomicBoolean.set(boolean)>
		graphrequestbatch = ((GraphRequestBatch) (val$callback));
	//  180  406:aload_0         
	//  181  407:getfield        #32  <Field AccessToken$AccessTokenRefreshCallback val$callback>
	//  182  410:astore_1        
		return;
	//  183  411:return          
		graphrequestbatch;
	//  184  412:astore_1        
		obj = null;
	//  185  413:aconst_null     
	//  186  414:astore_2        
		AccessTokenManager.access$200(AccessTokenManager.this).set(false);
	//  187  415:aload_0         
	//  188  416:getfield        #28  <Field AccessTokenManager this$0>
	//  189  419:invokestatic    #93  <Method AtomicBoolean AccessTokenManager.access$200(AccessTokenManager)>
	//  190  422:iconst_0        
	//  191  423:invokevirtual   #97  <Method void AtomicBoolean.set(boolean)>
		enRefreshCallback enrefreshcallback = val$callback;
	//  192  426:aload_0         
	//  193  427:getfield        #32  <Field AccessToken$AccessTokenRefreshCallback val$callback>
	//  194  430:astore_3        
		if(enrefreshcallback != null && obj != null)
	//* 195  431:aload_3         
	//* 196  432:ifnull          446
	//* 197  435:aload_2         
	//* 198  436:ifnull          446
			enrefreshcallback.OnTokenRefreshed(((AccessToken) (obj)));
	//  199  439:aload_3         
	//  200  440:aload_2         
	//  201  441:invokeinterface #149 <Method void AccessToken$AccessTokenRefreshCallback.OnTokenRefreshed(AccessToken)>
		throw graphrequestbatch;
	//  202  446:aload_1         
	//  203  447:athrow          
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
