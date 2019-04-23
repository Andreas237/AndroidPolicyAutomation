// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.jsinterface;

import android.content.Context;
import com.appboy.Appboy;
import com.appboy.models.outgoing.AppboyProperties;
import com.appboy.support.AppboyLogger;
import java.math.BigDecimal;
import org.json.JSONObject;

// Referenced classes of package com.appboy.ui.inappmessage.jsinterface:
//			AppboyInAppMessageHtmlUserJavascriptInterface

public class AppboyInAppMessageHtmlJavascriptInterface
{

	public AppboyInAppMessageHtmlJavascriptInterface(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field Context mContext>
		mUserInterface = new AppboyInAppMessageHtmlUserJavascriptInterface(context);
	//    5    9:aload_0         
	//    6   10:new             #29  <Class AppboyInAppMessageHtmlUserJavascriptInterface>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #31  <Method void AppboyInAppMessageHtmlUserJavascriptInterface(Context)>
	//   10   18:putfield        #33  <Field AppboyInAppMessageHtmlUserJavascriptInterface mUserInterface>
	//   11   21:return          
	}

	public AppboyInAppMessageHtmlUserJavascriptInterface getUser()
	{
		return mUserInterface;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field AppboyInAppMessageHtmlUserJavascriptInterface mUserInterface>
	//    2    4:areturn         
	}

	public void logCustomEventWithJSON(String s, String s1)
	{
		s1 = ((String) (parseProperties(s1)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #43  <Method AppboyProperties parseProperties(String)>
	//    3    5:astore_2        
		Appboy.getInstance(mContext).logCustomEvent(s, ((AppboyProperties) (s1)));
	//    4    6:aload_0         
	//    5    7:getfield        #27  <Field Context mContext>
	//    6   10:invokestatic    #49  <Method Appboy Appboy.getInstance(Context)>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #53  <Method void Appboy.logCustomEvent(String, AppboyProperties)>
	//   10   18:return          
	}

	public void logPurchaseWithJSON(String s, double d, String s1, int i, String s2)
	{
		s2 = ((String) (parseProperties(s2)));
	//    0    0:aload_0         
	//    1    1:aload           6
	//    2    3:invokevirtual   #43  <Method AppboyProperties parseProperties(String)>
	//    3    6:astore          6
		Appboy.getInstance(mContext).logPurchase(s, s1, new BigDecimal(Double.toString(d)), i, ((AppboyProperties) (s2)));
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field Context mContext>
	//    6   12:invokestatic    #49  <Method Appboy Appboy.getInstance(Context)>
	//    7   15:aload_1         
	//    8   16:aload           4
	//    9   18:new             #57  <Class BigDecimal>
	//   10   21:dup             
	//   11   22:dload_2         
	//   12   23:invokestatic    #63  <Method String Double.toString(double)>
	//   13   26:invokespecial   #66  <Method void BigDecimal(String)>
	//   14   29:iload           5
	//   15   31:aload           6
	//   16   33:invokevirtual   #70  <Method void Appboy.logPurchase(String, String, BigDecimal, int, AppboyProperties)>
	//   17   36:return          
	}

	AppboyProperties parseProperties(String s)
	{
		if(s == null)
			break MISSING_BLOCK_LABEL_80;
	//    0    0:aload_1         
	//    1    1:ifnull          80
		AppboyProperties appboyproperties;
		if(s.equals("undefined") || s.equals("null"))
			break MISSING_BLOCK_LABEL_80;
	//    2    4:aload_1         
	//    3    5:ldc1            #75  <String "undefined">
	//    4    7:invokevirtual   #81  <Method boolean String.equals(Object)>
	//    5   10:ifne            80
	//    6   13:aload_1         
	//    7   14:ldc1            #83  <String "null">
	//    8   16:invokevirtual   #81  <Method boolean String.equals(Object)>
	//    9   19:ifne            80
		appboyproperties = new AppboyProperties(new JSONObject(s));
	//   10   22:new             #85  <Class AppboyProperties>
	//   11   25:dup             
	//   12   26:new             #87  <Class JSONObject>
	//   13   29:dup             
	//   14   30:aload_1         
	//   15   31:invokespecial   #88  <Method void JSONObject(String)>
	//   16   34:invokespecial   #91  <Method void AppboyProperties(JSONObject)>
	//   17   37:astore_2        
		return appboyproperties;
	//   18   38:aload_2         
	//   19   39:areturn         
		Exception exception;
		exception;
	//   20   40:astore_2        
		String s1 = TAG;
	//   21   41:getstatic       #20  <Field String TAG>
	//   22   44:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   23   45:new             #93  <Class StringBuilder>
	//   24   48:dup             
	//   25   49:invokespecial   #94  <Method void StringBuilder()>
	//   26   52:astore          4
		stringbuilder.append("Failed to parse properties JSON String: ");
	//   27   54:aload           4
	//   28   56:ldc1            #96  <String "Failed to parse properties JSON String: ">
	//   29   58:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   30   61:pop             
		stringbuilder.append(s);
	//   31   62:aload           4
	//   32   64:aload_1         
	//   33   65:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   34   68:pop             
		AppboyLogger.e(s1, stringbuilder.toString(), ((Throwable) (exception)));
	//   35   69:aload_3         
	//   36   70:aload           4
	//   37   72:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   38   75:aload_2         
	//   39   76:invokestatic    #107 <Method int AppboyLogger.e(String, String, Throwable)>
	//   40   79:pop             
		return null;
	//   41   80:aconst_null     
	//   42   81:areturn         
	}

	public void requestImmediateDataFlush()
	{
		Appboy.getInstance(mContext).requestImmediateDataFlush();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Context mContext>
	//    2    4:invokestatic    #49  <Method Appboy Appboy.getInstance(Context)>
	//    3    7:invokevirtual   #111 <Method void Appboy.requestImmediateDataFlush()>
	//    4   10:return          
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/inappmessage/jsinterface/AppboyInAppMessageHtmlJavascriptInterface);
	private Context mContext;
	private AppboyInAppMessageHtmlUserJavascriptInterface mUserInterface;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyInAppMessageHtmlJavascriptInterface>
	//    1    2:invokestatic    #18  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #20  <Field String TAG>
	//*   3    8:return          
	}
}
