// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.os.Bundle;
import com.facebook.*;
import com.facebook.internal.Utility;
import java.util.ArrayList;
import java.util.Date;

// Referenced classes of package com.facebook.login:
//			LoginManager, LoginMethodHandler, LoginLogger

class LoginManager$4
	implements com.facebook.internal.Client.CompletedListener
{

	public void completed(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          227
		{
			Object obj = ((Object) (bundle.getString("com.facebook.platform.status.ERROR_TYPE")));
	//    2    4:aload_1         
	//    3    5:ldc1            #40  <String "com.facebook.platform.status.ERROR_TYPE">
	//    4    7:invokevirtual   #46  <Method String Bundle.getString(String)>
	//    5   10:astore_2        
			String s = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
	//    6   11:aload_1         
	//    7   12:ldc1            #48  <String "com.facebook.platform.status.ERROR_DESCRIPTION">
	//    8   14:invokevirtual   #46  <Method String Bundle.getString(String)>
	//    9   17:astore_3        
			if(obj != null)
	//*  10   18:aload_2         
	//*  11   19:ifnull          40
			{
				LoginManager.access$100(((String) (obj)), s, val$loggerRef, val$logger, val$responseCallback);
	//   12   22:aload_2         
	//   13   23:aload_3         
	//   14   24:aload_0         
	//   15   25:getfield        #26  <Field String val$loggerRef>
	//   16   28:aload_0         
	//   17   29:getfield        #28  <Field LoginLogger val$logger>
	//   18   32:aload_0         
	//   19   33:getfield        #30  <Field LoginStatusCallback val$responseCallback>
	//   20   36:invokestatic    #52  <Method void LoginManager.access$100(String, String, String, LoginLogger, LoginStatusCallback)>
				return;
	//   21   39:return          
			}
			s = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
	//   22   40:aload_1         
	//   23   41:ldc1            #54  <String "com.facebook.platform.extra.ACCESS_TOKEN">
	//   24   43:invokevirtual   #46  <Method String Bundle.getString(String)>
	//   25   46:astore_3        
			Date date = Utility.getBundleLongAsDate(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
	//   26   47:aload_1         
	//   27   48:ldc1            #56  <String "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH">
	//   28   50:new             #58  <Class Date>
	//   29   53:dup             
	//   30   54:lconst_0        
	//   31   55:invokespecial   #61  <Method void Date(long)>
	//   32   58:invokestatic    #67  <Method Date Utility.getBundleLongAsDate(Bundle, String, Date)>
	//   33   61:astore          4
			ArrayList arraylist = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
	//   34   63:aload_1         
	//   35   64:ldc1            #69  <String "com.facebook.platform.extra.PERMISSIONS">
	//   36   66:invokevirtual   #73  <Method ArrayList Bundle.getStringArrayList(String)>
	//   37   69:astore          5
			obj = ((Object) (bundle.getString("signed request")));
	//   38   71:aload_1         
	//   39   72:ldc1            #75  <String "signed request">
	//   40   74:invokevirtual   #46  <Method String Bundle.getString(String)>
	//   41   77:astore_2        
			Date date1 = Utility.getBundleLongAsDate(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
	//   42   78:aload_1         
	//   43   79:ldc1            #77  <String "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME">
	//   44   81:new             #58  <Class Date>
	//   45   84:dup             
	//   46   85:lconst_0        
	//   47   86:invokespecial   #61  <Method void Date(long)>
	//   48   89:invokestatic    #67  <Method Date Utility.getBundleLongAsDate(Bundle, String, Date)>
	//   49   92:astore          6
			if(!Utility.isNullOrEmpty(((String) (obj))))
	//*  50   94:aload_2         
	//*  51   95:invokestatic    #81  <Method boolean Utility.isNullOrEmpty(String)>
	//*  52   98:ifne            109
				obj = ((Object) (LoginMethodHandler.getUserIDFromSignedRequest(((String) (obj)))));
	//   53  101:aload_2         
	//   54  102:invokestatic    #86  <Method String LoginMethodHandler.getUserIDFromSignedRequest(String)>
	//   55  105:astore_2        
			else
	//*  56  106:goto            111
				obj = null;
	//   57  109:aconst_null     
	//   58  110:astore_2        
			if(!Utility.isNullOrEmpty(s) && arraylist != null && !arraylist.isEmpty() && !Utility.isNullOrEmpty(((String) (obj))))
	//*  59  111:aload_3         
	//*  60  112:invokestatic    #81  <Method boolean Utility.isNullOrEmpty(String)>
	//*  61  115:ifne            206
	//*  62  118:aload           5
	//*  63  120:ifnull          206
	//*  64  123:aload           5
	//*  65  125:invokevirtual   #92  <Method boolean ArrayList.isEmpty()>
	//*  66  128:ifne            206
	//*  67  131:aload_2         
	//*  68  132:invokestatic    #81  <Method boolean Utility.isNullOrEmpty(String)>
	//*  69  135:ifne            206
			{
				obj = ((Object) (new AccessToken(s, val$applicationId, ((String) (obj)), ((java.util.Collection) (arraylist)), ((java.util.Collection) (null)), ((com.facebook.AccessTokenSource) (null)), date, ((Date) (null)), date1)));
	//   70  138:new             #94  <Class AccessToken>
	//   71  141:dup             
	//   72  142:aload_3         
	//   73  143:aload_0         
	//   74  144:getfield        #32  <Field String val$applicationId>
	//   75  147:aload_2         
	//   76  148:aload           5
	//   77  150:aconst_null     
	//   78  151:aconst_null     
	//   79  152:aload           4
	//   80  154:aconst_null     
	//   81  155:aload           6
	//   82  157:invokespecial   #97  <Method void AccessToken(String, String, String, java.util.Collection, java.util.Collection, com.facebook.AccessTokenSource, Date, Date, Date)>
	//   83  160:astore_2        
				AccessToken.setCurrentAccessToken(((AccessToken) (obj)));
	//   84  161:aload_2         
	//   85  162:invokestatic    #101 <Method void AccessToken.setCurrentAccessToken(AccessToken)>
				bundle = ((Bundle) (LoginManager.access$200(bundle)));
	//   86  165:aload_1         
	//   87  166:invokestatic    #105 <Method Profile LoginManager.access$200(Bundle)>
	//   88  169:astore_1        
				if(bundle != null)
	//*  89  170:aload_1         
	//*  90  171:ifnull          181
					Profile.setCurrentProfile(((Profile) (bundle)));
	//   91  174:aload_1         
	//   92  175:invokestatic    #111 <Method void Profile.setCurrentProfile(Profile)>
				else
	//*  93  178:goto            184
					Profile.fetchProfileForCurrentAccessToken();
	//   94  181:invokestatic    #114 <Method void Profile.fetchProfileForCurrentAccessToken()>
				val$logger.logLoginStatusSuccess(val$loggerRef);
	//   95  184:aload_0         
	//   96  185:getfield        #28  <Field LoginLogger val$logger>
	//   97  188:aload_0         
	//   98  189:getfield        #26  <Field String val$loggerRef>
	//   99  192:invokevirtual   #120 <Method void LoginLogger.logLoginStatusSuccess(String)>
				val$responseCallback.onCompleted(((AccessToken) (obj)));
	//  100  195:aload_0         
	//  101  196:getfield        #30  <Field LoginStatusCallback val$responseCallback>
	//  102  199:aload_2         
	//  103  200:invokeinterface #125 <Method void LoginStatusCallback.onCompleted(AccessToken)>
				return;
	//  104  205:return          
			} else
			{
				val$logger.logLoginStatusFailure(val$loggerRef);
	//  105  206:aload_0         
	//  106  207:getfield        #28  <Field LoginLogger val$logger>
	//  107  210:aload_0         
	//  108  211:getfield        #26  <Field String val$loggerRef>
	//  109  214:invokevirtual   #128 <Method void LoginLogger.logLoginStatusFailure(String)>
				val$responseCallback.onFailure();
	//  110  217:aload_0         
	//  111  218:getfield        #30  <Field LoginStatusCallback val$responseCallback>
	//  112  221:invokeinterface #131 <Method void LoginStatusCallback.onFailure()>
				return;
	//  113  226:return          
			}
		} else
		{
			val$logger.logLoginStatusFailure(val$loggerRef);
	//  114  227:aload_0         
	//  115  228:getfield        #28  <Field LoginLogger val$logger>
	//  116  231:aload_0         
	//  117  232:getfield        #26  <Field String val$loggerRef>
	//  118  235:invokevirtual   #128 <Method void LoginLogger.logLoginStatusFailure(String)>
			val$responseCallback.onFailure();
	//  119  238:aload_0         
	//  120  239:getfield        #30  <Field LoginStatusCallback val$responseCallback>
	//  121  242:invokeinterface #131 <Method void LoginStatusCallback.onFailure()>
			return;
	//  122  247:return          
		}
	}

	final LoginManager this$0;
	final String val$applicationId;
	final LoginLogger val$logger;
	final String val$loggerRef;
	final LoginStatusCallback val$responseCallback;

	LoginManager$4()
	{
		this$0 = final_loginmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field LoginManager this$0>
		val$loggerRef = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field String val$loggerRef>
		val$logger = loginlogger;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field LoginLogger val$logger>
		val$responseCallback = loginstatuscallback;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #30  <Field LoginStatusCallback val$responseCallback>
		val$applicationId = String.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #32  <Field String val$applicationId>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #35  <Method void Object()>
	//   17   31:return          
	}
}
