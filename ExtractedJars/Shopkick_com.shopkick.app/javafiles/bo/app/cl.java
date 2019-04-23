// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.net.Uri;
import com.appboy.events.SubmitFeedbackFailed;
import com.appboy.events.SubmitFeedbackSucceeded;
import com.appboy.models.ResponseError;
import com.appboy.models.outgoing.Feedback;
import com.appboy.support.AppboyLogger;
import org.json.*;

// Referenced classes of package bo.app:
//			ci, aa, v, bs

public final class cl extends ci
{

	public cl(String s, Feedback feedback)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #23  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(s);
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append("data");
	//    8   14:aload_3         
	//    9   15:ldc1            #31  <String "data">
	//   10   17:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		super(Uri.parse(stringbuilder.toString()), ((java.util.Map) (null)));
	//   12   21:aload_0         
	//   13   22:aload_3         
	//   14   23:invokevirtual   #35  <Method String StringBuilder.toString()>
	//   15   26:invokestatic    #41  <Method Uri Uri.parse(String)>
	//   16   29:aconst_null     
	//   17   30:invokespecial   #44  <Method void ci(Uri, java.util.Map)>
		c = feedback;
	//   18   33:aload_0         
	//   19   34:aload_2         
	//   20   35:putfield        #46  <Field Feedback c>
	//   21   38:return          
	}

	public void a(aa aa1, bs bs)
	{
		aa1.a(((Object) (new SubmitFeedbackSucceeded(c))), com/appboy/events/SubmitFeedbackSucceeded);
	//    0    0:aload_1         
	//    1    1:new             #50  <Class SubmitFeedbackSucceeded>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #46  <Field Feedback c>
	//    5    9:invokespecial   #53  <Method void SubmitFeedbackSucceeded(Feedback)>
	//    6   12:ldc1            #50  <Class SubmitFeedbackSucceeded>
	//    7   14:invokeinterface #58  <Method void aa.a(Object, Class)>
	//    8   19:return          
	}

	public void a(aa aa1, ResponseError responseerror)
	{
		super.a(aa1, responseerror);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #61  <Method void ci.a(aa, ResponseError)>
		aa1.a(((Object) (new SubmitFeedbackFailed(c, responseerror))), com/appboy/events/SubmitFeedbackFailed);
	//    4    6:aload_1         
	//    5    7:new             #63  <Class SubmitFeedbackFailed>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:getfield        #46  <Field Feedback c>
	//    9   15:aload_2         
	//   10   16:invokespecial   #66  <Method void SubmitFeedbackFailed(Feedback, ResponseError)>
	//   11   19:ldc1            #63  <Class SubmitFeedbackFailed>
	//   12   21:invokeinterface #58  <Method void aa.a(Object, Class)>
	//   13   26:return          
	}

	public JSONObject g()
	{
		JSONObject jsonobject = super.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method JSONObject ci.g()>
	//    2    4:astore_1        
		if(jsonobject == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		try
		{
			JSONArray jsonarray = new JSONArray();
	//    7   11:new             #74  <Class JSONArray>
	//    8   14:dup             
	//    9   15:invokespecial   #75  <Method void JSONArray()>
	//   10   18:astore_2        
			jsonarray.put(((Object) (c.forJsonPut())));
	//   11   19:aload_2         
	//   12   20:aload_0         
	//   13   21:getfield        #46  <Field Feedback c>
	//   14   24:invokevirtual   #80  <Method JSONObject Feedback.forJsonPut()>
	//   15   27:invokevirtual   #84  <Method JSONArray JSONArray.put(Object)>
	//   16   30:pop             
			jsonobject.put("feedback", ((Object) (jsonarray)));
	//   17   31:aload_1         
	//   18   32:ldc1            #86  <String "feedback">
	//   19   34:aload_2         
	//   20   35:invokevirtual   #91  <Method JSONObject JSONObject.put(String, Object)>
	//   21   38:pop             
		}
	//*  22   39:aload_1         
	//*  23   40:areturn         
		catch(JSONException jsonexception)
	//*  24   41:astore_1        
		{
			AppboyLogger.w(b, "Experienced JSONException while retrieving parameters. Returning null.", ((Throwable) (jsonexception)));
	//   25   42:getstatic       #18  <Field String b>
	//   26   45:ldc1            #93  <String "Experienced JSONException while retrieving parameters. Returning null.">
	//   27   47:aload_1         
	//   28   48:invokestatic    #97  <Method int AppboyLogger.w(String, String, Throwable)>
	//   29   51:pop             
			return null;
	//   30   52:aconst_null     
	//   31   53:areturn         
		}
		return jsonobject;
	}

	public boolean h()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public v i()
	{
		return v.b;
	//    0    0:getstatic       #106 <Field v v.b>
	//    1    3:areturn         
	}

	private static final String b = AppboyLogger.getAppboyLogTag(bo/app/cl);
	private final Feedback c;

	static 
	{
	//    0    0:ldc1            #2   <Class cl>
	//    1    2:invokestatic    #16  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #18  <Field String b>
	//*   3    8:return          
	}
}
