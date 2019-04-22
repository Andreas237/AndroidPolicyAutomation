// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.net.Uri;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			cu, y, ad, cp

public final class cw extends cu
{

	public cw(String s, long l, long l1, String s1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #25  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void StringBuilder()>
	//    3    7:astore          7
		stringbuilder.append(s);
	//    4    9:aload           7
	//    5   11:aload_1         
	//    6   12:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append("content_cards/sync");
	//    8   16:aload           7
	//    9   18:ldc1            #33  <String "content_cards/sync">
	//   10   20:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		super(Uri.parse(stringbuilder.toString()), ((Map) (null)));
	//   12   24:aload_0         
	//   13   25:aload           7
	//   14   27:invokevirtual   #37  <Method String StringBuilder.toString()>
	//   15   30:invokestatic    #43  <Method Uri Uri.parse(String)>
	//   16   33:aconst_null     
	//   17   34:invokespecial   #46  <Method void cu(Uri, Map)>
		c = l;
	//   18   37:aload_0         
	//   19   38:lload_2         
	//   20   39:putfield        #48  <Field long c>
		d = l1;
	//   21   42:aload_0         
	//   22   43:lload           4
	//   23   45:putfield        #50  <Field long d>
		e = s1;
	//   24   48:aload_0         
	//   25   49:aload           6
	//   26   51:putfield        #52  <Field String e>
	//   27   54:return          
	}

	public void a(ad ad, cp cp)
	{
		AppboyLogger.d(b, "ContentCardsSyncRequest executed successfully.");
	//    0    0:getstatic       #20  <Field String b>
	//    1    3:ldc1            #56  <String "ContentCardsSyncRequest executed successfully.">
	//    2    5:invokestatic    #59  <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
	//    4    9:return          
	}

	public void a(Map map)
	{
		super.a(map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #62  <Method void cu.a(Map)>
		map.put("X-Braze-DataRequest", "true");
	//    3    5:aload_1         
	//    4    6:ldc1            #64  <String "X-Braze-DataRequest">
	//    5    8:ldc1            #66  <String "true">
	//    6   10:invokeinterface #72  <Method Object Map.put(Object, Object)>
	//    7   15:pop             
		map.put("X-Braze-ContentCardsRequest", "true");
	//    8   16:aload_1         
	//    9   17:ldc1            #74  <String "X-Braze-ContentCardsRequest">
	//   10   19:ldc1            #66  <String "true">
	//   11   21:invokeinterface #72  <Method Object Map.put(Object, Object)>
	//   12   26:pop             
	//   13   27:return          
	}

	public JSONObject g()
	{
		JSONObject jsonobject = super.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method JSONObject cu.g()>
	//    2    4:astore_1        
		if(jsonobject == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		try
		{
			jsonobject.put("last_full_sync_at", d);
	//    7   11:aload_1         
	//    8   12:ldc1            #84  <String "last_full_sync_at">
	//    9   14:aload_0         
	//   10   15:getfield        #50  <Field long d>
	//   11   18:invokevirtual   #89  <Method JSONObject JSONObject.put(String, long)>
	//   12   21:pop             
			jsonobject.put("last_card_updated_at", c);
	//   13   22:aload_1         
	//   14   23:ldc1            #91  <String "last_card_updated_at">
	//   15   25:aload_0         
	//   16   26:getfield        #48  <Field long c>
	//   17   29:invokevirtual   #89  <Method JSONObject JSONObject.put(String, long)>
	//   18   32:pop             
			if(!StringUtils.isNullOrBlank(e))
	//*  19   33:aload_0         
	//*  20   34:getfield        #52  <Field String e>
	//*  21   37:invokestatic    #97  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  22   40:ifne            54
				jsonobject.put("user_id", ((Object) (e)));
	//   23   43:aload_1         
	//   24   44:ldc1            #99  <String "user_id">
	//   25   46:aload_0         
	//   26   47:getfield        #52  <Field String e>
	//   27   50:invokevirtual   #102 <Method JSONObject JSONObject.put(String, Object)>
	//   28   53:pop             
		}
	//*  29   54:aload_1         
	//*  30   55:areturn         
		catch(JSONException jsonexception)
	//*  31   56:astore_1        
		{
			AppboyLogger.w(b, "Experienced JSONException while creating Content Cards request. Returning null.", ((Throwable) (jsonexception)));
	//   32   57:getstatic       #20  <Field String b>
	//   33   60:ldc1            #104 <String "Experienced JSONException while creating Content Cards request. Returning null.">
	//   34   62:aload_1         
	//   35   63:invokestatic    #108 <Method int AppboyLogger.w(String, String, Throwable)>
	//   36   66:pop             
			return null;
	//   37   67:aconst_null     
	//   38   68:areturn         
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
	//    0    0:getstatic       #117 <Field y y.b>
	//    1    3:areturn         
	}

	private static final String b = AppboyLogger.getAppboyLogTag(bo/app/cw);
	private final long c;
	private final long d;
	private final String e;

	static 
	{
	//    0    0:ldc1            #2   <Class cw>
	//    1    2:invokestatic    #18  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #20  <Field String b>
	//*   3    8:return          
	}
}
