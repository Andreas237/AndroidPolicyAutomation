// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import java.util.Date;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.facebook:
//			AccessTokenManager, AccessToken, GraphRequestBatch

class AccessTokenManager$4
	implements lback
{

	public void onBatchCompleted(GraphRequestBatch graphrequestbatch)
	{
		if(AccessTokenManager.getInstance().getCurrentAccessToken() == null)
			break MISSING_BLOCK_LABEL_292;
	//    0    0:invokestatic    #45  <Method AccessTokenManager AccessTokenManager.getInstance()>
	//    1    3:invokevirtual   #49  <Method AccessToken AccessTokenManager.getCurrentAccessToken()>
	//    2    6:ifnull          292
		if(AccessTokenManager.getInstance().getCurrentAccessToken().getUserId() != val$accessToken.getUserId())
	//*   3    9:invokestatic    #45  <Method AccessTokenManager AccessTokenManager.getInstance()>
	//*   4   12:invokevirtual   #49  <Method AccessToken AccessTokenManager.getCurrentAccessToken()>
	//*   5   15:invokevirtual   #55  <Method String AccessToken.getUserId()>
	//*   6   18:aload_0         
	//*   7   19:getfield        #28  <Field AccessToken val$accessToken>
	//*   8   22:invokevirtual   #55  <Method String AccessToken.getUserId()>
	//*   9   25:if_acmpeq       29
			return;
	//   10   28:return          
		int i;
		if(val$permissionsCallSucceeded.get() || val$refreshResult.accessToken != null)
			break MISSING_BLOCK_LABEL_73;
	//   11   29:aload_0         
	//   12   30:getfield        #30  <Field AtomicBoolean val$permissionsCallSucceeded>
	//   13   33:invokevirtual   #61  <Method boolean AtomicBoolean.get()>
	//   14   36:ifne            73
	//   15   39:aload_0         
	//   16   40:getfield        #32  <Field AccessTokenManager$RefreshResult val$refreshResult>
	//   17   43:getfield        #67  <Field String AccessTokenManager$RefreshResult.accessToken>
	//   18   46:ifnonnull       73
		i = val$refreshResult.expiresAt;
	//   19   49:aload_0         
	//   20   50:getfield        #32  <Field AccessTokenManager$RefreshResult val$refreshResult>
	//   21   53:getfield        #71  <Field int AccessTokenManager$RefreshResult.expiresAt>
	//   22   56:istore_2        
		if(i == 0)
	//*  23   57:iload_2         
	//*  24   58:ifne            73
		{
			AccessTokenManager.access$200(AccessTokenManager.this).set(false);
	//   25   61:aload_0         
	//   26   62:getfield        #26  <Field AccessTokenManager this$0>
	//   27   65:invokestatic    #75  <Method AtomicBoolean AccessTokenManager.access$200(AccessTokenManager)>
	//   28   68:iconst_0        
	//   29   69:invokevirtual   #79  <Method void AtomicBoolean.set(boolean)>
			return;
	//   30   72:return          
		}
		if(val$refreshResult.accessToken != null)
	//*  31   73:aload_0         
	//*  32   74:getfield        #32  <Field AccessTokenManager$RefreshResult val$refreshResult>
	//*  33   77:getfield        #67  <Field String AccessTokenManager$RefreshResult.accessToken>
	//*  34   80:ifnull          94
		{
			graphrequestbatch = ((GraphRequestBatch) (val$refreshResult.accessToken));
	//   35   83:aload_0         
	//   36   84:getfield        #32  <Field AccessTokenManager$RefreshResult val$refreshResult>
	//   37   87:getfield        #67  <Field String AccessTokenManager$RefreshResult.accessToken>
	//   38   90:astore_1        
			break MISSING_BLOCK_LABEL_102;
	//   39   91:goto            102
		}
		graphrequestbatch = ((GraphRequestBatch) (val$accessToken.getToken()));
	//   40   94:aload_0         
	//   41   95:getfield        #28  <Field AccessToken val$accessToken>
	//   42   98:invokevirtual   #82  <Method String AccessToken.getToken()>
	//   43  101:astore_1        
		Set set;
		String s;
		String s1;
		s = val$accessToken.getApplicationId();
	//   44  102:aload_0         
	//   45  103:getfield        #28  <Field AccessToken val$accessToken>
	//   46  106:invokevirtual   #85  <Method String AccessToken.getApplicationId()>
	//   47  109:astore          6
		s1 = val$accessToken.getUserId();
	//   48  111:aload_0         
	//   49  112:getfield        #28  <Field AccessToken val$accessToken>
	//   50  115:invokevirtual   #55  <Method String AccessToken.getUserId()>
	//   51  118:astore          7
		if(val$permissionsCallSucceeded.get())
	//*  52  120:aload_0         
	//*  53  121:getfield        #30  <Field AtomicBoolean val$permissionsCallSucceeded>
	//*  54  124:invokevirtual   #61  <Method boolean AtomicBoolean.get()>
	//*  55  127:ifeq            138
		{
			set = val$permissions;
	//   56  130:aload_0         
	//   57  131:getfield        #34  <Field Set val$permissions>
	//   58  134:astore_3        
			break MISSING_BLOCK_LABEL_149;
	//   59  135:goto            293
		}
		set = val$accessToken.getPermissions();
	//   60  138:aload_0         
	//   61  139:getfield        #28  <Field AccessToken val$accessToken>
	//   62  142:invokevirtual   #89  <Method Set AccessToken.getPermissions()>
	//   63  145:astore_3        
	//*  64  146:goto            293
		Set set1;
		if(val$permissionsCallSucceeded.get())
	//*  65  149:aload_0         
	//*  66  150:getfield        #30  <Field AtomicBoolean val$permissionsCallSucceeded>
	//*  67  153:invokevirtual   #61  <Method boolean AtomicBoolean.get()>
	//*  68  156:ifeq            168
		{
			set1 = val$declinedPermissions;
	//   69  159:aload_0         
	//   70  160:getfield        #36  <Field Set val$declinedPermissions>
	//   71  163:astore          4
			break MISSING_BLOCK_LABEL_180;
	//   72  165:goto            296
		}
		set1 = val$accessToken.getDeclinedPermissions();
	//   73  168:aload_0         
	//   74  169:getfield        #28  <Field AccessToken val$accessToken>
	//   75  172:invokevirtual   #92  <Method Set AccessToken.getDeclinedPermissions()>
	//   76  175:astore          4
	//*  77  177:goto            296
		Date date;
		AccessTokenSource accesstokensource;
		accesstokensource = val$accessToken.getSource();
	//   78  180:aload_0         
	//   79  181:getfield        #28  <Field AccessToken val$accessToken>
	//   80  184:invokevirtual   #96  <Method AccessTokenSource AccessToken.getSource()>
	//   81  187:astore          8
		if(val$refreshResult.expiresAt != 0)
	//*  82  189:aload_0         
	//*  83  190:getfield        #32  <Field AccessTokenManager$RefreshResult val$refreshResult>
	//*  84  193:getfield        #71  <Field int AccessTokenManager$RefreshResult.expiresAt>
	//*  85  196:ifeq            223
		{
			date = new Date((long)val$refreshResult.expiresAt * 1000L);
	//   86  199:new             #98  <Class Date>
	//   87  202:dup             
	//   88  203:aload_0         
	//   89  204:getfield        #32  <Field AccessTokenManager$RefreshResult val$refreshResult>
	//   90  207:getfield        #71  <Field int AccessTokenManager$RefreshResult.expiresAt>
	//   91  210:i2l             
	//   92  211:ldc2w           #99  <Long 1000L>
	//   93  214:lmul            
	//   94  215:invokespecial   #103 <Method void Date(long)>
	//   95  218:astore          5
			break MISSING_BLOCK_LABEL_232;
	//   96  220:goto            232
		}
		date = val$accessToken.getExpires();
	//   97  223:aload_0         
	//   98  224:getfield        #28  <Field AccessToken val$accessToken>
	//   99  227:invokevirtual   #107 <Method Date AccessToken.getExpires()>
	//  100  230:astore          5
		graphrequestbatch = ((GraphRequestBatch) (new AccessToken(((String) (graphrequestbatch)), s, s1, ((java.util.Collection) (set)), ((java.util.Collection) (set1)), accesstokensource, date, new Date())));
	//  101  232:new             #51  <Class AccessToken>
	//  102  235:dup             
	//  103  236:aload_1         
	//  104  237:aload           6
	//  105  239:aload           7
	//  106  241:aload_3         
	//  107  242:aload           4
	//  108  244:aload           8
	//  109  246:aload           5
	//  110  248:new             #98  <Class Date>
	//  111  251:dup             
	//  112  252:invokespecial   #108 <Method void Date()>
	//  113  255:invokespecial   #111 <Method void AccessToken(String, String, String, java.util.Collection, java.util.Collection, AccessTokenSource, Date, Date)>
	//  114  258:astore_1        
		AccessTokenManager.getInstance().setCurrentAccessToken(((AccessToken) (graphrequestbatch)));
	//  115  259:invokestatic    #45  <Method AccessTokenManager AccessTokenManager.getInstance()>
	//  116  262:aload_1         
	//  117  263:invokevirtual   #115 <Method void AccessTokenManager.setCurrentAccessToken(AccessToken)>
		AccessTokenManager.access$200(AccessTokenManager.this).set(false);
	//  118  266:aload_0         
	//  119  267:getfield        #26  <Field AccessTokenManager this$0>
	//  120  270:invokestatic    #75  <Method AtomicBoolean AccessTokenManager.access$200(AccessTokenManager)>
	//  121  273:iconst_0        
	//  122  274:invokevirtual   #79  <Method void AtomicBoolean.set(boolean)>
		return;
	//  123  277:return          
		graphrequestbatch;
	//  124  278:astore_1        
		AccessTokenManager.access$200(AccessTokenManager.this).set(false);
	//  125  279:aload_0         
	//  126  280:getfield        #26  <Field AccessTokenManager this$0>
	//  127  283:invokestatic    #75  <Method AtomicBoolean AccessTokenManager.access$200(AccessTokenManager)>
	//  128  286:iconst_0        
	//  129  287:invokevirtual   #79  <Method void AtomicBoolean.set(boolean)>
		throw graphrequestbatch;
	//  130  290:aload_1         
	//  131  291:athrow          
	//  132  292:return          
	//* 133  293:goto            149
	//* 134  296:goto            180
	}

	final AccessTokenManager this$0;
	final AccessToken val$accessToken;
	final Set val$declinedPermissions;
	final Set val$permissions;
	final AtomicBoolean val$permissionsCallSucceeded;
	final freshResult val$refreshResult;

	AccessTokenManager$4()
	{
		this$0 = final_accesstokenmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field AccessTokenManager this$0>
		val$accessToken = accesstoken;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field AccessToken val$accessToken>
		val$permissionsCallSucceeded = atomicboolean;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #30  <Field AtomicBoolean val$permissionsCallSucceeded>
		val$refreshResult = freshresult;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #32  <Field AccessTokenManager$RefreshResult val$refreshResult>
		val$permissions = set;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #34  <Field Set val$permissions>
		val$declinedPermissions = Set.this;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #36  <Field Set val$declinedPermissions>
		super();
	//   18   33:aload_0         
	//   19   34:invokespecial   #38  <Method void Object()>
	//   20   37:return          
	}
}
