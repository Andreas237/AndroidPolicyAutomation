// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import com.appboy.events.InAppMessageEvent;
import com.appboy.models.IInAppMessage;
import com.appboy.models.IInAppMessageHtml;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			ee, eb, dt, ds, 
//			ev, bl, aa, fr, 
//			ez, fb

public final class ec extends ee
	implements eb
{

	public ec(JSONObject jsonobject, bl bl1)
	{
		super(jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #29  <Method void ee(JSONObject)>
		String s = a;
	//    3    5:getstatic       #23  <Field String a>
	//    4    8:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #31  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #33  <Method void StringBuilder()>
	//    8   16:astore          4
		stringbuilder.append("Parsing in-app message triggered action with JSON: ");
	//    9   18:aload           4
	//   10   20:ldc1            #35  <String "Parsing in-app message triggered action with JSON: ">
	//   11   22:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
		stringbuilder.append(dt.a(jsonobject));
	//   13   26:aload           4
	//   14   28:aload_1         
	//   15   29:invokestatic    #44  <Method String dt.a(JSONObject)>
	//   16   32:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
		AppboyLogger.d(s, stringbuilder.toString());
	//   18   36:aload_3         
	//   19   37:aload           4
	//   20   39:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   21   42:invokestatic    #51  <Method int AppboyLogger.d(String, String)>
	//   22   45:pop             
		jsonobject = jsonobject.getJSONObject("data");
	//   23   46:aload_1         
	//   24   47:ldc1            #53  <String "data">
	//   25   49:invokevirtual   #59  <Method JSONObject JSONObject.getJSONObject(String)>
	//   26   52:astore_1        
		if(jsonobject != null)
	//*  27   53:aload_1         
	//*  28   54:ifnull          75
		{
			c = bl1;
	//   29   57:aload_0         
	//   30   58:aload_2         
	//   31   59:putfield        #61  <Field bl c>
			b = ds.a(jsonobject, c);
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:aload_0         
	//   35   65:getfield        #61  <Field bl c>
	//   36   68:invokestatic    #66  <Method IInAppMessage ds.a(JSONObject, bl)>
	//   37   71:putfield        #68  <Field IInAppMessage b>
			return;
	//   38   74:return          
		} else
		{
			AppboyLogger.w(a, "InAppMessageTriggeredAction Json did not contain in-app message.");
	//   39   75:getstatic       #23  <Field String a>
	//   40   78:ldc1            #70  <String "InAppMessageTriggeredAction Json did not contain in-app message.">
	//   41   80:invokestatic    #73  <Method int AppboyLogger.w(String, String)>
	//   42   83:pop             
			return;
	//   43   84:return          
		}
	}

	public void a(Context context, aa aa1, fb fb, long l)
	{
		try
		{
			context = ((Context) (a));
	//    0    0:getstatic       #23  <Field String a>
	//    1    3:astore_1        
			fb = ((fb) (new StringBuilder()));
	//    2    4:new             #31  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #33  <Method void StringBuilder()>
	//    5   11:astore_3        
			((StringBuilder) (fb)).append("Attempting to publish in-app message after delay of ");
	//    6   12:aload_3         
	//    7   13:ldc1            #78  <String "Attempting to publish in-app message after delay of ">
	//    8   15:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
			((StringBuilder) (fb)).append(c().d());
	//   10   19:aload_3         
	//   11   20:aload_0         
	//   12   21:invokevirtual   #81  <Method ev c()>
	//   13   24:invokeinterface #86  <Method int ev.d()>
	//   14   29:invokevirtual   #89  <Method StringBuilder StringBuilder.append(int)>
	//   15   32:pop             
			((StringBuilder) (fb)).append(" seconds.");
	//   16   33:aload_3         
	//   17   34:ldc1            #91  <String " seconds.">
	//   18   36:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
			AppboyLogger.d(((String) (context)), ((StringBuilder) (fb)).toString());
	//   20   40:aload_1         
	//   21   41:aload_3         
	//   22   42:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   23   45:invokestatic    #51  <Method int AppboyLogger.d(String, String)>
	//   24   48:pop             
			if(!StringUtils.isNullOrBlank(d))
	//*  25   49:aload_0         
	//*  26   50:getfield        #93  <Field String d>
	//*  27   53:invokestatic    #99  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  28   56:ifne            72
				b.setLocalAssetPathForPrefetch(d);
	//   29   59:aload_0         
	//   30   60:getfield        #68  <Field IInAppMessage b>
	//   31   63:aload_0         
	//   32   64:getfield        #93  <Field String d>
	//   33   67:invokeinterface #105 <Method void IInAppMessage.setLocalAssetPathForPrefetch(String)>
			b.setExpirationTimestamp(l);
	//   34   72:aload_0         
	//   35   73:getfield        #68  <Field IInAppMessage b>
	//   36   76:lload           4
	//   37   78:invokeinterface #109 <Method void IInAppMessage.setExpirationTimestamp(long)>
			aa1.a(((Object) (new InAppMessageEvent(b, c.e()))), com/appboy/events/InAppMessageEvent);
	//   38   83:aload_2         
	//   39   84:new             #111 <Class InAppMessageEvent>
	//   40   87:dup             
	//   41   88:aload_0         
	//   42   89:getfield        #68  <Field IInAppMessage b>
	//   43   92:aload_0         
	//   44   93:getfield        #61  <Field bl c>
	//   45   96:invokeinterface #116 <Method String bl.e()>
	//   46  101:invokespecial   #119 <Method void InAppMessageEvent(IInAppMessage, String)>
	//   47  104:ldc1            #111 <Class InAppMessageEvent>
	//   48  106:invokeinterface #124 <Method void aa.a(Object, Class)>
			return;
	//   49  111:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  50  112:astore_1        
		{
			AppboyLogger.w(a, "Caught exception while performing triggered action.", ((Throwable) (context)));
	//   51  113:getstatic       #23  <Field String a>
	//   52  116:ldc1            #126 <String "Caught exception while performing triggered action.">
	//   53  118:aload_1         
	//   54  119:invokestatic    #129 <Method int AppboyLogger.w(String, String, Throwable)>
	//   55  122:pop             
		}
	//   56  123:return          
	}

	public void a(String s)
	{
		d = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #93  <Field String d>
	//    3    5:return          
	}

	public fr d()
	{
		if(StringUtils.isNullOrBlank(b.getRemoteAssetPathForPrefetch()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field IInAppMessage b>
	//*   2    4:invokeinterface #133 <Method String IInAppMessage.getRemoteAssetPathForPrefetch()>
	//*   3    9:invokestatic    #99  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   4   12:ifeq            17
			return null;
	//    5   15:aconst_null     
	//    6   16:areturn         
		if(b instanceof IInAppMessageHtml)
	//*   7   17:aload_0         
	//*   8   18:getfield        #68  <Field IInAppMessage b>
	//*   9   21:instanceof      #135 <Class IInAppMessageHtml>
	//*  10   24:ifeq            47
			return new fr(ez.a, b.getRemoteAssetPathForPrefetch());
	//   11   27:new             #137 <Class fr>
	//   12   30:dup             
	//   13   31:getstatic       #142 <Field ez ez.a>
	//   14   34:aload_0         
	//   15   35:getfield        #68  <Field IInAppMessage b>
	//   16   38:invokeinterface #133 <Method String IInAppMessage.getRemoteAssetPathForPrefetch()>
	//   17   43:invokespecial   #145 <Method void fr(ez, String)>
	//   18   46:areturn         
		else
			return new fr(ez.b, b.getRemoteAssetPathForPrefetch());
	//   19   47:new             #137 <Class fr>
	//   20   50:dup             
	//   21   51:getstatic       #147 <Field ez ez.b>
	//   22   54:aload_0         
	//   23   55:getfield        #68  <Field IInAppMessage b>
	//   24   58:invokeinterface #133 <Method String IInAppMessage.getRemoteAssetPathForPrefetch()>
	//   25   63:invokespecial   #145 <Method void fr(ez, String)>
	//   26   66:areturn         
	}

	public JSONObject e()
	{
		JSONException jsonexception;
		JSONObject jsonobject;
		try
		{
			jsonobject = super.e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #152 <Method JSONObject ee.e()>
	//    2    4:astore_1        
			jsonobject.put("data", b.forJsonPut());
	//    3    5:aload_1         
	//    4    6:ldc1            #53  <String "data">
	//    5    8:aload_0         
	//    6    9:getfield        #68  <Field IInAppMessage b>
	//    7   12:invokeinterface #156 <Method Object IInAppMessage.forJsonPut()>
	//    8   17:invokevirtual   #160 <Method JSONObject JSONObject.put(String, Object)>
	//    9   20:pop             
			jsonobject.put("type", "inapp");
	//   10   21:aload_1         
	//   11   22:ldc1            #162 <String "type">
	//   12   24:ldc1            #164 <String "inapp">
	//   13   26:invokevirtual   #160 <Method JSONObject JSONObject.put(String, Object)>
	//   14   29:pop             
		}
	//*  15   30:aload_1         
	//*  16   31:areturn         
	//*  17   32:aconst_null     
	//*  18   33:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONException jsonexception)
		{
			return null;
		}
		return jsonobject;
	//*  19   34:astore_1        
	//*  20   35:goto            32
	}

	public Object forJsonPut()
	{
		return ((Object) (e()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #165 <Method JSONObject e()>
	//    2    4:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/ec);
	private IInAppMessage b;
	private bl c;
	private String d;

	static 
	{
	//    0    0:ldc1            #2   <Class ec>
	//    1    2:invokestatic    #21  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #23  <Field String a>
	//*   3    8:return          
	}
}
