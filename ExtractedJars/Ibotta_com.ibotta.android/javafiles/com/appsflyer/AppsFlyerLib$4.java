// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;

import android.content.Context;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.*;
import org.json.JSONObject;

// Referenced classes of package com.appsflyer:
//			AppsFlyerLib, AppsFlyerConversionListener

final class AppsFlyerLib$4
	implements t.b
{

	private void _mth02CA(Map map)
	{
		if(((Reference) (_fld02CA)).get() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field WeakReference _fld02CA>
	//*   2    4:invokevirtual   #34  <Method Object Reference.get()>
	//*   3    7:ifnull          58
		{
			map = ((Map) (new JSONObject(map)));
	//    4   10:new             #36  <Class JSONObject>
	//    5   13:dup             
	//    6   14:aload_1         
	//    7   15:invokespecial   #38  <Method void JSONObject(Map)>
	//    8   18:astore_1        
			if(!(map instanceof JSONObject))
	//*   9   19:aload_1         
	//*  10   20:instanceof      #36  <Class JSONObject>
	//*  11   23:ifne            34
				map = ((Map) (((JSONObject) (map)).toString()));
	//   12   26:aload_1         
	//   13   27:invokevirtual   #42  <Method String JSONObject.toString()>
	//   14   30:astore_1        
			else
	//*  15   31:goto            42
				map = ((Map) (JSONObjectInstrumentation.toString((JSONObject)map)));
	//   16   34:aload_1         
	//   17   35:checkcast       #36  <Class JSONObject>
	//   18   38:invokestatic    #47  <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   19   41:astore_1        
			AppsFlyerLib._mth02CA((Context)((Reference) (_fld02CA)).get(), "deeplinkAttribution", ((String) (map)));
	//   20   42:aload_0         
	//   21   43:getfield        #23  <Field WeakReference _fld02CA>
	//   22   46:invokevirtual   #34  <Method Object Reference.get()>
	//   23   49:checkcast       #49  <Class Context>
	//   24   52:ldc1            #51  <String "deeplinkAttribution">
	//   25   54:aload_1         
	//   26   55:invokestatic    #54  <Method void AppsFlyerLib._mth02CA(Context, String, String)>
		}
	//   27   58:return          
	}

	public final void _mth02CE(Map map)
	{
		String s;
		for(Iterator iterator = map.keySet().iterator(); iterator.hasNext(); _fld02CF.put(((Object) (s)), map.get(((Object) (s)))))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #63  <Method Set Map.keySet()>
	//*   2    6:invokeinterface #69  <Method Iterator Set.iterator()>
	//*   3   11:astore_2        
	//*   4   12:aload_2         
	//*   5   13:invokeinterface #75  <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            52
			s = (String)iterator.next();
	//    7   21:aload_2         
	//    8   22:invokeinterface #78  <Method Object Iterator.next()>
	//    9   27:checkcast       #80  <Class String>
	//   10   30:astore_3        

	//   11   31:aload_0         
	//   12   32:getfield        #21  <Field Map _fld02CF>
	//   13   35:aload_3         
	//   14   36:aload_1         
	//   15   37:aload_3         
	//   16   38:invokeinterface #83  <Method Object Map.get(Object)>
	//   17   43:invokeinterface #87  <Method Object Map.put(Object, Object)>
	//   18   48:pop             
	//*  19   49:goto            12
		_mth02CA(_fld02CF);
	//   20   52:aload_0         
	//   21   53:aload_0         
	//   22   54:getfield        #21  <Field Map _fld02CF>
	//   23   57:invokespecial   #89  <Method void _mth02CA(Map)>
		AppsFlyerLib._mth02CF(_fld02CF);
	//   24   60:aload_0         
	//   25   61:getfield        #21  <Field Map _fld02CF>
	//   26   64:invokestatic    #91  <Method void AppsFlyerLib._mth02CF(Map)>
	//   27   67:return          
	}

	public final void _mth0971(String s)
	{
		if(AppsFlyerLib._mth02CB() != null)
	//*   0    0:invokestatic    #96  <Method AppsFlyerConversionListener AppsFlyerLib._mth02CB()>
	//*   1    3:ifnull          23
		{
			_mth02CA(_fld02CF);
	//    2    6:aload_0         
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field Map _fld02CF>
	//    5   11:invokespecial   #89  <Method void _mth02CA(Map)>
			AppsFlyerLib._mth02CB().onAttributionFailure(s);
	//    6   14:invokestatic    #96  <Method AppsFlyerConversionListener AppsFlyerLib._mth02CB()>
	//    7   17:aload_1         
	//    8   18:invokeinterface #101 <Method void AppsFlyerConversionListener.onAttributionFailure(String)>
		}
	//    9   23:return          
	}

	private WeakReference _fld02CA;
	private Map _fld02CF;
	private AppsFlyerLib _fld0971;

	AppsFlyerLib$4(AppsFlyerLib appsflyerlib, Map map, WeakReference weakreference)
	{
		_fld0971 = appsflyerlib;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AppsFlyerLib _fld0971>
		_fld02CF = map;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Map _fld02CF>
		_fld02CA = weakreference;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field WeakReference _fld02CA>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #26  <Method void Object()>
	//   11   19:return          
	}
}
