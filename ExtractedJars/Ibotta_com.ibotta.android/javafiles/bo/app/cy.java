// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.net.Uri;
import com.appboy.events.SubmitFeedbackFailed;
import com.appboy.events.SubmitFeedbackSucceeded;
import com.appboy.models.outgoing.Feedback;
import com.appboy.support.AppboyLogger;
import org.json.*;

// Referenced classes of package bo.app:
//			cu, ad, y, cr, 
//			cp

public final class cy extends cu
{

	public cy(String s, Feedback feedback)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #24  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(s);
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append("data");
	//    8   14:aload_3         
	//    9   15:ldc1            #32  <String "data">
	//   10   17:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		super(Uri.parse(stringbuilder.toString()), ((java.util.Map) (null)));
	//   12   21:aload_0         
	//   13   22:aload_3         
	//   14   23:invokevirtual   #36  <Method String StringBuilder.toString()>
	//   15   26:invokestatic    #42  <Method Uri Uri.parse(String)>
	//   16   29:aconst_null     
	//   17   30:invokespecial   #45  <Method void cu(Uri, java.util.Map)>
		c = feedback;
	//   18   33:aload_0         
	//   19   34:aload_2         
	//   20   35:putfield        #47  <Field Feedback c>
	//   21   38:return          
	}

	public void a(ad ad1, ad ad2, cr cr)
	{
		super.a(ad1, ad2, cr);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #51  <Method void cu.a(ad, ad, cr)>
		ad2.a(((Object) (new SubmitFeedbackFailed(c, cr))), com/appboy/events/SubmitFeedbackFailed);
	//    5    7:aload_2         
	//    6    8:new             #53  <Class SubmitFeedbackFailed>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:getfield        #47  <Field Feedback c>
	//   10   16:aload_3         
	//   11   17:invokespecial   #56  <Method void SubmitFeedbackFailed(Feedback, cr)>
	//   12   20:ldc1            #53  <Class SubmitFeedbackFailed>
	//   13   22:invokeinterface #61  <Method void ad.a(Object, Class)>
	//   14   27:return          
	}

	public void a(ad ad1, cp cp)
	{
		ad1.a(((Object) (new SubmitFeedbackSucceeded(c))), com/appboy/events/SubmitFeedbackSucceeded);
	//    0    0:aload_1         
	//    1    1:new             #64  <Class SubmitFeedbackSucceeded>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #47  <Field Feedback c>
	//    5    9:invokespecial   #67  <Method void SubmitFeedbackSucceeded(Feedback)>
	//    6   12:ldc1            #64  <Class SubmitFeedbackSucceeded>
	//    7   14:invokeinterface #61  <Method void ad.a(Object, Class)>
	//    8   19:return          
	}

	public JSONObject g()
	{
		JSONObject jsonobject = super.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method JSONObject cu.g()>
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
	//    7   11:new             #75  <Class JSONArray>
	//    8   14:dup             
	//    9   15:invokespecial   #76  <Method void JSONArray()>
	//   10   18:astore_2        
			jsonarray.put(((Object) (c.forJsonPut())));
	//   11   19:aload_2         
	//   12   20:aload_0         
	//   13   21:getfield        #47  <Field Feedback c>
	//   14   24:invokevirtual   #81  <Method JSONObject Feedback.forJsonPut()>
	//   15   27:invokevirtual   #85  <Method JSONArray JSONArray.put(Object)>
	//   16   30:pop             
			jsonobject.put("feedback", ((Object) (jsonarray)));
	//   17   31:aload_1         
	//   18   32:ldc1            #87  <String "feedback">
	//   19   34:aload_2         
	//   20   35:invokevirtual   #92  <Method JSONObject JSONObject.put(String, Object)>
	//   21   38:pop             
		}
	//*  22   39:aload_1         
	//*  23   40:areturn         
		catch(JSONException jsonexception)
	//*  24   41:astore_1        
		{
			AppboyLogger.w(b, "Experienced JSONException while retrieving parameters. Returning null.", ((Throwable) (jsonexception)));
	//   25   42:getstatic       #19  <Field String b>
	//   26   45:ldc1            #94  <String "Experienced JSONException while retrieving parameters. Returning null.">
	//   27   47:aload_1         
	//   28   48:invokestatic    #98  <Method int AppboyLogger.w(String, String, Throwable)>
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

	public y i()
	{
		return y.b;
	//    0    0:getstatic       #107 <Field y y.b>
	//    1    3:areturn         
	}

	private static final String b = AppboyLogger.getAppboyLogTag(bo/app/cy);
	private final Feedback c;

	static 
	{
	//    0    0:ldc1            #2   <Class cy>
	//    1    2:invokestatic    #17  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #19  <Field String b>
	//*   3    8:return          
	}
}
