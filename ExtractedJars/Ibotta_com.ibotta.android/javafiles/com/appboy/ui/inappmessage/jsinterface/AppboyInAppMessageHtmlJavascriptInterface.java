// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.jsinterface;

import android.content.Context;
import com.appboy.Appboy;
import com.appboy.models.outgoing.AppboyProperties;
import com.appboy.support.AppboyLogger;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.math.BigDecimal;

// Referenced classes of package com.appboy.ui.inappmessage.jsinterface:
//			AppboyInAppMessageHtmlUserJavascriptInterface

public class AppboyInAppMessageHtmlJavascriptInterface
{

	public AppboyInAppMessageHtmlJavascriptInterface(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field Context mContext>
		mUserInterface = new AppboyInAppMessageHtmlUserJavascriptInterface(context);
	//    5    9:aload_0         
	//    6   10:new             #30  <Class AppboyInAppMessageHtmlUserJavascriptInterface>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #32  <Method void AppboyInAppMessageHtmlUserJavascriptInterface(Context)>
	//   10   18:putfield        #34  <Field AppboyInAppMessageHtmlUserJavascriptInterface mUserInterface>
	//   11   21:return          
	}

	public AppboyInAppMessageHtmlUserJavascriptInterface getUser()
	{
		return mUserInterface;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field AppboyInAppMessageHtmlUserJavascriptInterface mUserInterface>
	//    2    4:areturn         
	}

	public void logCustomEventWithJSON(String s, String s1)
	{
		s1 = ((String) (parseProperties(s1)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #44  <Method AppboyProperties parseProperties(String)>
	//    3    5:astore_2        
		Appboy.getInstance(mContext).logCustomEvent(s, ((AppboyProperties) (s1)));
	//    4    6:aload_0         
	//    5    7:getfield        #28  <Field Context mContext>
	//    6   10:invokestatic    #50  <Method Appboy Appboy.getInstance(Context)>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #54  <Method void Appboy.logCustomEvent(String, AppboyProperties)>
	//   10   18:return          
	}

	public void logPurchaseWithJSON(String s, double d, String s1, int i, String s2)
	{
		s2 = ((String) (parseProperties(s2)));
	//    0    0:aload_0         
	//    1    1:aload           6
	//    2    3:invokevirtual   #44  <Method AppboyProperties parseProperties(String)>
	//    3    6:astore          6
		Appboy.getInstance(mContext).logPurchase(s, s1, new BigDecimal(Double.toString(d)), i, ((AppboyProperties) (s2)));
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field Context mContext>
	//    6   12:invokestatic    #50  <Method Appboy Appboy.getInstance(Context)>
	//    7   15:aload_1         
	//    8   16:aload           4
	//    9   18:new             #58  <Class BigDecimal>
	//   10   21:dup             
	//   11   22:dload_2         
	//   12   23:invokestatic    #64  <Method String Double.toString(double)>
	//   13   26:invokespecial   #67  <Method void BigDecimal(String)>
	//   14   29:iload           5
	//   15   31:aload           6
	//   16   33:invokevirtual   #71  <Method void Appboy.logPurchase(String, String, BigDecimal, int, AppboyProperties)>
	//   17   36:return          
	}

	AppboyProperties parseProperties(String s)
	{
		if(s == null)
			break MISSING_BLOCK_LABEL_76;
	//    0    0:aload_1         
	//    1    1:ifnull          76
		AppboyProperties appboyproperties;
		if(s.equals("undefined") || s.equals("null"))
			break MISSING_BLOCK_LABEL_76;
	//    2    4:aload_1         
	//    3    5:ldc1            #76  <String "undefined">
	//    4    7:invokevirtual   #82  <Method boolean String.equals(Object)>
	//    5   10:ifne            76
	//    6   13:aload_1         
	//    7   14:ldc1            #84  <String "null">
	//    8   16:invokevirtual   #82  <Method boolean String.equals(Object)>
	//    9   19:ifne            76
		appboyproperties = new AppboyProperties(JSONObjectInstrumentation.init(s));
	//   10   22:new             #86  <Class AppboyProperties>
	//   11   25:dup             
	//   12   26:aload_1         
	//   13   27:invokestatic    #92  <Method org.json.JSONObject JSONObjectInstrumentation.init(String)>
	//   14   30:invokespecial   #95  <Method void AppboyProperties(org.json.JSONObject)>
	//   15   33:astore_2        
		return appboyproperties;
	//   16   34:aload_2         
	//   17   35:areturn         
		Exception exception;
		exception;
	//   18   36:astore_2        
		String s1 = TAG;
	//   19   37:getstatic       #21  <Field String TAG>
	//   20   40:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   21   41:new             #97  <Class StringBuilder>
	//   22   44:dup             
	//   23   45:invokespecial   #98  <Method void StringBuilder()>
	//   24   48:astore          4
		stringbuilder.append("Failed to parse properties JSON String: ");
	//   25   50:aload           4
	//   26   52:ldc1            #100 <String "Failed to parse properties JSON String: ">
	//   27   54:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   28   57:pop             
		stringbuilder.append(s);
	//   29   58:aload           4
	//   30   60:aload_1         
	//   31   61:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   32   64:pop             
		AppboyLogger.e(s1, stringbuilder.toString(), ((Throwable) (exception)));
	//   33   65:aload_3         
	//   34   66:aload           4
	//   35   68:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   36   71:aload_2         
	//   37   72:invokestatic    #111 <Method int AppboyLogger.e(String, String, Throwable)>
	//   38   75:pop             
		return null;
	//   39   76:aconst_null     
	//   40   77:areturn         
	}

	public void requestImmediateDataFlush()
	{
		Appboy.getInstance(mContext).requestImmediateDataFlush();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Context mContext>
	//    2    4:invokestatic    #50  <Method Appboy Appboy.getInstance(Context)>
	//    3    7:invokevirtual   #115 <Method void Appboy.requestImmediateDataFlush()>
	//    4   10:return          
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/inappmessage/jsinterface/AppboyInAppMessageHtmlJavascriptInterface);
	private Context mContext;
	private AppboyInAppMessageHtmlUserJavascriptInterface mUserInterface;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyInAppMessageHtmlJavascriptInterface>
	//    1    2:invokestatic    #19  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #21  <Field String TAG>
	//*   3    8:return          
	}
}
