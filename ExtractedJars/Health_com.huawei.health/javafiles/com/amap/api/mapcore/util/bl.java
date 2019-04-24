// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import com.amap.api.maps.AMapException;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amap.api.mapcore.util:
//			cc, cb, hm

public class bl extends cc
{

	public bl(Context context, String s)
	{
		super(context, ((Object) (s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void cc(Context, Object)>
	//    4    6:return          
	}

	protected String a()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #17  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("015");
	//    4    8:aload_1         
	//    5    9:ldc1            #22  <String "015">
	//    6   11:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		return stringbuilder.toString();
	//    8   15:aload_1         
	//    9   16:invokevirtual   #29  <Method String StringBuilder.toString()>
	//   10   19:areturn         
	}

	protected List a(JSONObject jsonobject)
		throws AMapException
	{
		List list = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		try
		{
			if(d != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #38  <Field Context d>
	//*   4    6:ifnull          20
				cb.c(jsonobject.toString(), d);
	//    5    9:aload_1         
	//    6   10:invokevirtual   #41  <Method String JSONObject.toString()>
	//    7   13:aload_0         
	//    8   14:getfield        #38  <Field Context d>
	//    9   17:invokestatic    #47  <Method void cb.c(String, Context)>
		}
	//*  10   20:goto            36
		catch(Throwable throwable)
	//*  11   23:astore_3        
		{
			hm.c(throwable, "OfflineUpdateCityHandlerAbstract", "loadData jsonInit");
	//   12   24:aload_3         
	//   13   25:ldc1            #49  <String "OfflineUpdateCityHandlerAbstract">
	//   14   27:ldc1            #51  <String "loadData jsonInit">
	//   15   29:invokestatic    #56  <Method void hm.c(Throwable, String, String)>
			throwable.printStackTrace();
	//   16   32:aload_3         
	//   17   33:invokevirtual   #59  <Method void Throwable.printStackTrace()>
		}
		try
		{
			if(d != null)
	//*  18   36:aload_0         
	//*  19   37:getfield        #38  <Field Context d>
	//*  20   40:ifnull          52
				list = cb.a(jsonobject, d);
	//   21   43:aload_1         
	//   22   44:aload_0         
	//   23   45:getfield        #38  <Field Context d>
	//   24   48:invokestatic    #62  <Method List cb.a(JSONObject, Context)>
	//   25   51:astore_2        
		}
	//*  26   52:aload_2         
	//*  27   53:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*  28   54:astore_1        
		{
			hm.c(((Throwable) (jsonobject)), "OfflineUpdateCityHandlerAbstract", "loadData parseJson");
	//   29   55:aload_1         
	//   30   56:ldc1            #49  <String "OfflineUpdateCityHandlerAbstract">
	//   31   58:ldc1            #64  <String "loadData parseJson">
	//   32   60:invokestatic    #56  <Method void hm.c(Throwable, String, String)>
			((JSONException) (jsonobject)).printStackTrace();
	//   33   63:aload_1         
	//   34   64:invokevirtual   #65  <Method void JSONException.printStackTrace()>
			return null;
	//   35   67:aconst_null     
	//   36   68:areturn         
		}
		return list;
	}

	protected JSONObject a(gp.a a1)
	{
		JSONObject jsonobject;
		if(a1 == null || a1.w == null)
			break MISSING_BLOCK_LABEL_67;
	//    0    0:aload_1         
	//    1    1:ifnull          67
	//    2    4:aload_1         
	//    3    5:getfield        #75  <Field JSONObject gp$a.w>
	//    4    8:ifnull          67
		a1 = ((gp.a) (a1.w.optJSONObject("015")));
	//    5   11:aload_1         
	//    6   12:getfield        #75  <Field JSONObject gp$a.w>
	//    7   15:ldc1            #22  <String "015">
	//    8   17:invokevirtual   #79  <Method JSONObject JSONObject.optJSONObject(String)>
	//    9   20:astore_1        
		if(((JSONObject) (a1)).has("result"))
			break MISSING_BLOCK_LABEL_65;
	//   10   21:aload_1         
	//   11   22:ldc1            #81  <String "result">
	//   12   24:invokevirtual   #85  <Method boolean JSONObject.has(String)>
	//   13   27:ifne            65
		jsonobject = new JSONObject();
	//   14   30:new             #40  <Class JSONObject>
	//   15   33:dup             
	//   16   34:invokespecial   #86  <Method void JSONObject()>
	//   17   37:astore_2        
		jsonobject.put("result", ((Object) ((new JSONObject()).put("offlinemap_with_province_vfour", ((Object) (a1))))));
	//   18   38:aload_2         
	//   19   39:ldc1            #81  <String "result">
	//   20   41:new             #40  <Class JSONObject>
	//   21   44:dup             
	//   22   45:invokespecial   #86  <Method void JSONObject()>
	//   23   48:ldc1            #88  <String "offlinemap_with_province_vfour">
	//   24   50:aload_1         
	//   25   51:invokevirtual   #92  <Method JSONObject JSONObject.put(String, Object)>
	//   26   54:invokevirtual   #92  <Method JSONObject JSONObject.put(String, Object)>
	//   27   57:pop             
		return jsonobject;
	//   28   58:aload_2         
	//   29   59:areturn         
		JSONException jsonexception;
		jsonexception;
	//   30   60:astore_2        
		jsonexception.printStackTrace();
	//   31   61:aload_2         
	//   32   62:invokevirtual   #65  <Method void JSONException.printStackTrace()>
		return ((JSONObject) (a1));
	//   33   65:aload_1         
	//   34   66:areturn         
		return null;
	//   35   67:aconst_null     
	//   36   68:areturn         
	}

	public void a(Context context)
	{
		d = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field Context d>
	//    3    5:return          
	}

	protected Object b(JSONObject jsonobject)
		throws AMapException
	{
		return ((Object) (a(jsonobject)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #97  <Method List a(JSONObject)>
	//    3    5:areturn         
	}

	protected Map b()
	{
		Hashtable hashtable = new Hashtable(16);
	//    0    0:new             #100 <Class Hashtable>
	//    1    3:dup             
	//    2    4:bipush          16
	//    3    6:invokespecial   #103 <Method void Hashtable(int)>
	//    4    9:astore_1        
		((Map) (hashtable)).put("mapver", a);
	//    5   10:aload_1         
	//    6   11:ldc1            #105 <String "mapver">
	//    7   13:aload_0         
	//    8   14:getfield        #108 <Field Object a>
	//    9   17:invokeinterface #113 <Method Object Map.put(Object, Object)>
	//   10   22:pop             
		return ((Map) (hashtable));
	//   11   23:aload_1         
	//   12   24:areturn         
	}

	private Context d;
}
