// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.net.Uri;
import com.appboy.enums.inappmessage.InAppMessageFailureType;
import com.appboy.models.IInAppMessage;
import com.appboy.models.ResponseError;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			ci, ed, bs, fb, 
//			bu, cg, v, cc, 
//			bl, aa

public class cu extends ci
{

	public cu(String s, ed ed1, fb fb1, bl bl1, String s1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #31  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void StringBuilder()>
	//    3    7:astore          6
		stringbuilder.append(s);
	//    4    9:aload           6
	//    5   11:aload_1         
	//    6   12:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append("template");
	//    8   16:aload           6
	//    9   18:ldc1            #39  <String "template">
	//   10   20:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		super(Uri.parse(stringbuilder.toString()), ((java.util.Map) (null)));
	//   12   24:aload_0         
	//   13   25:aload           6
	//   14   27:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   15   30:invokestatic    #49  <Method Uri Uri.parse(String)>
	//   16   33:aconst_null     
	//   17   34:invokespecial   #52  <Method void ci(Uri, java.util.Map)>
		c = ed1.g();
	//   18   37:aload_0         
	//   19   38:aload_2         
	//   20   39:invokevirtual   #56  <Method String ed.g()>
	//   21   42:putfield        #58  <Field String c>
		d = ed1.f();
	//   22   45:aload_0         
	//   23   46:aload_2         
	//   24   47:invokevirtual   #61  <Method long ed.f()>
	//   25   50:putfield        #63  <Field long d>
		e = ed1.h();
	//   26   53:aload_0         
	//   27   54:aload_2         
	//   28   55:invokevirtual   #65  <Method String ed.h()>
	//   29   58:putfield        #67  <Field String e>
		f = fb1;
	//   30   61:aload_0         
	//   31   62:aload_3         
	//   32   63:putfield        #69  <Field fb f>
		g = (new cg.a()).a(s1).c();
	//   33   66:aload_0         
	//   34   67:new             #71  <Class cg$a>
	//   35   70:dup             
	//   36   71:invokespecial   #72  <Method void cg$a()>
	//   37   74:aload           5
	//   38   76:invokevirtual   #76  <Method cg$a cg$a.a(String)>
	//   39   79:invokevirtual   #79  <Method cg cg$a.c()>
	//   40   82:putfield        #81  <Field cg g>
		h = bl1;
	//   41   85:aload_0         
	//   42   86:aload           4
	//   43   88:putfield        #83  <Field bl h>
	//   44   91:return          
	}

	public void a(aa aa, bs bs1)
	{
		if(bs1 != null && bs1.b())
	//*   0    0:aload_2         
	//*   1    1:ifnull          35
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #89  <Method boolean bs.b()>
	//*   4    8:ifeq            35
		{
			if(!StringUtils.isNullOrBlank(e))
	//*   5   11:aload_0         
	//*   6   12:getfield        #67  <Field String e>
	//*   7   15:invokestatic    #95  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   8   18:ifne            39
			{
				bs1.h().setLocalAssetPathForPrefetch(e);
	//    9   21:aload_2         
	//   10   22:invokevirtual   #98  <Method IInAppMessage bs.h()>
	//   11   25:aload_0         
	//   12   26:getfield        #67  <Field String e>
	//   13   29:invokeinterface #104 <Method void IInAppMessage.setLocalAssetPathForPrefetch(String)>
				return;
	//   14   34:return          
			}
		} else
		{
			l();
	//   15   35:aload_0         
	//   16   36:invokevirtual   #107 <Method void l()>
		}
	//   17   39:return          
	}

	public void a(aa aa, ResponseError responseerror)
	{
		super.a(aa, responseerror);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #110 <Method void ci.a(aa, ResponseError)>
		l();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #107 <Method void l()>
	//    6   10:return          
	}

	public JSONObject g()
	{
		JSONObject jsonobject = super.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #115 <Method JSONObject ci.g()>
	//    2    4:astore_1        
		if(jsonobject == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		JSONObject jsonobject1 = new JSONObject();
	//    7   11:new             #117 <Class JSONObject>
	//    8   14:dup             
	//    9   15:invokespecial   #118 <Method void JSONObject()>
	//   10   18:astore_2        
		try
		{
			jsonobject1.put("trigger_id", ((Object) (c)));
	//   11   19:aload_2         
	//   12   20:ldc1            #120 <String "trigger_id">
	//   13   22:aload_0         
	//   14   23:getfield        #58  <Field String c>
	//   15   26:invokevirtual   #124 <Method JSONObject JSONObject.put(String, Object)>
	//   16   29:pop             
			jsonobject1.put("trigger_event_type", ((Object) (f.b())));
	//   17   30:aload_2         
	//   18   31:ldc1            #126 <String "trigger_event_type">
	//   19   33:aload_0         
	//   20   34:getfield        #69  <Field fb f>
	//   21   37:invokeinterface #130 <Method String fb.b()>
	//   22   42:invokevirtual   #124 <Method JSONObject JSONObject.put(String, Object)>
	//   23   45:pop             
			if(f.e() != null)
	//*  24   46:aload_0         
	//*  25   47:getfield        #69  <Field fb f>
	//*  26   50:invokeinterface #133 <Method bu fb.e()>
	//*  27   55:ifnull          79
				jsonobject1.put("data", f.e().forJsonPut());
	//   28   58:aload_2         
	//   29   59:ldc1            #135 <String "data">
	//   30   61:aload_0         
	//   31   62:getfield        #69  <Field fb f>
	//   32   65:invokeinterface #133 <Method bu fb.e()>
	//   33   70:invokeinterface #141 <Method Object bu.forJsonPut()>
	//   34   75:invokevirtual   #124 <Method JSONObject JSONObject.put(String, Object)>
	//   35   78:pop             
			jsonobject.put("template", ((Object) (jsonobject1)));
	//   36   79:aload_1         
	//   37   80:ldc1            #39  <String "template">
	//   38   82:aload_2         
	//   39   83:invokevirtual   #124 <Method JSONObject JSONObject.put(String, Object)>
	//   40   86:pop             
			if(g.f())
	//*  41   87:aload_0         
	//*  42   88:getfield        #81  <Field cg g>
	//*  43   91:invokevirtual   #145 <Method boolean cg.f()>
	//*  44   94:ifeq            111
				jsonobject.put("respond_with", ((Object) (g.a())));
	//   45   97:aload_1         
	//   46   98:ldc1            #147 <String "respond_with">
	//   47  100:aload_0         
	//   48  101:getfield        #81  <Field cg g>
	//   49  104:invokevirtual   #149 <Method JSONObject cg.a()>
	//   50  107:invokevirtual   #124 <Method JSONObject JSONObject.put(String, Object)>
	//   51  110:pop             
		}
	//*  52  111:aload_1         
	//*  53  112:areturn         
		catch(JSONException jsonexception)
	//*  54  113:astore_1        
		{
			AppboyLogger.w(b, "Experienced JSONException while retrieving parameters. Returning null.", ((Throwable) (jsonexception)));
	//   55  114:getstatic       #26  <Field String b>
	//   56  117:ldc1            #151 <String "Experienced JSONException while retrieving parameters. Returning null.">
	//   57  119:aload_1         
	//   58  120:invokestatic    #155 <Method int AppboyLogger.w(String, String, Throwable)>
	//   59  123:pop             
			return null;
	//   60  124:aconst_null     
	//   61  125:areturn         
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
	//    0    0:getstatic       #162 <Field v v.b>
	//    1    3:areturn         
	}

	public long k()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field long d>
	//    2    4:lreturn         
	}

	void l()
	{
		AppboyLogger.i(b, "Template request failed. Attempting to log in-app message template request failure.");
	//    0    0:getstatic       #26  <Field String b>
	//    1    3:ldc1            #166 <String "Template request failed. Attempting to log in-app message template request failure.">
	//    2    5:invokestatic    #169 <Method int AppboyLogger.i(String, String)>
	//    3    8:pop             
		if(StringUtils.isNullOrBlank(c))
	//*   4    9:aload_0         
	//*   5   10:getfield        #58  <Field String c>
	//*   6   13:invokestatic    #95  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   7   16:ifeq            29
		{
			AppboyLogger.d(b, "Trigger ID not found. Not logging in-app message template request failure.");
	//    8   19:getstatic       #26  <Field String b>
	//    9   22:ldc1            #171 <String "Trigger ID not found. Not logging in-app message template request failure.">
	//   10   24:invokestatic    #173 <Method int AppboyLogger.d(String, String)>
	//   11   27:pop             
			return;
	//   12   28:return          
		}
		if(h == null)
	//*  13   29:aload_0         
	//*  14   30:getfield        #83  <Field bl h>
	//*  15   33:ifnonnull       46
		{
			AppboyLogger.e(b, "Cannot log an in-app message template request failure because the IAppboyManager is null.");
	//   16   36:getstatic       #26  <Field String b>
	//   17   39:ldc1            #175 <String "Cannot log an in-app message template request failure because the IAppboyManager is null.">
	//   18   41:invokestatic    #177 <Method int AppboyLogger.e(String, String)>
	//   19   44:pop             
			return;
	//   20   45:return          
		}
		try
		{
			cc cc1 = cc.a(((String) (null)), ((String) (null)), c, InAppMessageFailureType.TEMPLATE_REQUEST);
	//   21   46:aconst_null     
	//   22   47:aconst_null     
	//   23   48:aload_0         
	//   24   49:getfield        #58  <Field String c>
	//   25   52:getstatic       #183 <Field InAppMessageFailureType InAppMessageFailureType.TEMPLATE_REQUEST>
	//   26   55:invokestatic    #188 <Method cc cc.a(String, String, String, InAppMessageFailureType)>
	//   27   58:astore_1        
			h.a(((bu) (cc1)));
	//   28   59:aload_0         
	//   29   60:getfield        #83  <Field bl h>
	//   30   63:aload_1         
	//   31   64:invokeinterface #193 <Method boolean bl.a(bu)>
	//   32   69:pop             
			return;
	//   33   70:return          
		}
		catch(JSONException jsonexception)
	//*  34   71:astore_1        
		{
			h.a(((Throwable) (jsonexception)));
	//   35   72:aload_0         
	//   36   73:getfield        #83  <Field bl h>
	//   37   76:aload_1         
	//   38   77:invokeinterface #196 <Method void bl.a(Throwable)>
		}
	//   39   82:return          
	}

	private static final String b = AppboyLogger.getAppboyLogTag(bo/app/cu);
	private final String c;
	private final long d;
	private final String e;
	private final fb f;
	private final cg g;
	private final bl h;

	static 
	{
	//    0    0:ldc1            #2   <Class cu>
	//    1    2:invokestatic    #24  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #26  <Field String b>
	//*   3    8:return          
	}
}
