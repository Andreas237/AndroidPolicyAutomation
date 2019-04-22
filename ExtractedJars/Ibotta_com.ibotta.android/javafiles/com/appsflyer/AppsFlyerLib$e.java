// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;

import android.content.Context;
import com.appsflyer.cache.CacheManager;
import com.appsflyer.cache.RequestCacheData;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.appsflyer:
//			AppsFlyerLib, AFHelper, AFLogger

final class AppsFlyerLib$e
	implements Runnable
{

	public final void run()
	{
		if(_fld02BC.isTrackingStopped())
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field AppsFlyerLib _fld02BC>
	//*   2    4:invokevirtual   #61  <Method boolean AppsFlyerLib.isTrackingStopped()>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		String s = null;
	//    5   11:aconst_null     
	//    6   12:astore_1        
		if(_fld02CB && _fld02CE <= 2 && AppsFlyerLib._mth02CA(_fld02BC))
	//*   7   13:aload_0         
	//*   8   14:getfield        #44  <Field boolean _fld02CB>
	//*   9   17:ifeq            57
	//*  10   20:aload_0         
	//*  11   21:getfield        #46  <Field int _fld02CE>
	//*  12   24:iconst_2        
	//*  13   25:icmpgt          57
	//*  14   28:aload_0         
	//*  15   29:getfield        #28  <Field AppsFlyerLib _fld02BC>
	//*  16   32:invokestatic    #64  <Method boolean AppsFlyerLib._mth02CA(AppsFlyerLib)>
	//*  17   35:ifeq            57
			_fld02CF.put("rfr", ((Object) (AppsFlyerLib._mth02CF(_fld02BC))));
	//   18   38:aload_0         
	//   19   39:getfield        #37  <Field Map _fld02CF>
	//   20   42:ldc1            #66  <String "rfr">
	//   21   44:aload_0         
	//   22   45:getfield        #28  <Field AppsFlyerLib _fld02BC>
	//   23   48:invokestatic    #69  <Method Map AppsFlyerLib._mth02CF(AppsFlyerLib)>
	//   24   51:invokeinterface #75  <Method Object Map.put(Object, Object)>
	//   25   56:pop             
		String s1 = s;
	//   26   57:aload_1         
	//   27   58:astore_2        
		String s2;
		JSONObject jsonobject;
		try
		{
			s2 = (String)_fld02CF.get("appsflyerKey");
	//   28   59:aload_0         
	//   29   60:getfield        #37  <Field Map _fld02CF>
	//   30   63:ldc1            #77  <String "appsflyerKey">
	//   31   65:invokeinterface #81  <Method Object Map.get(Object)>
	//   32   70:checkcast       #83  <Class String>
	//   33   73:astore_3        
		}
	//*  34   74:aload_1         
	//*  35   75:astore_2        
	//*  36   76:aload_0         
	//*  37   77:getfield        #37  <Field Map _fld02CF>
	//*  38   80:invokestatic    #89  <Method JSONObject AFHelper.convertToJsonObject(Map)>
	//*  39   83:astore          4
	//*  40   85:aload_1         
	//*  41   86:astore_2        
	//*  42   87:aload           4
	//*  43   89:instanceof      #91  <Class JSONObject>
	//*  44   92:ifne            106
	//*  45   95:aload_1         
	//*  46   96:astore_2        
	//*  47   97:aload           4
	//*  48   99:invokevirtual   #95  <Method String JSONObject.toString()>
	//*  49  102:astore_1        
	//*  50  103:goto            117
	//*  51  106:aload_1         
	//*  52  107:astore_2        
	//*  53  108:aload           4
	//*  54  110:checkcast       #91  <Class JSONObject>
	//*  55  113:invokestatic    #100 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//*  56  116:astore_1        
	//*  57  117:aload_1         
	//*  58  118:astore_2        
	//*  59  119:aload_0         
	//*  60  120:getfield        #28  <Field AppsFlyerLib _fld02BC>
	//*  61  123:aload_0         
	//*  62  124:getfield        #35  <Field String _fld0971>
	//*  63  127:aload_1         
	//*  64  128:aload_3         
	//*  65  129:aload_0         
	//*  66  130:getfield        #33  <Field WeakReference _fld02CA>
	//*  67  133:aconst_null     
	//*  68  134:aload_0         
	//*  69  135:getfield        #44  <Field boolean _fld02CB>
	//*  70  138:invokestatic    #103 <Method void AppsFlyerLib._mth02CB(AppsFlyerLib, String, String, String, WeakReference, String, boolean)>
	//*  71  141:return          
	//*  72  142:astore_1        
	//*  73  143:aload_1         
	//*  74  144:invokevirtual   #106 <Method String Throwable.getMessage()>
	//*  75  147:aload_1         
	//*  76  148:invokestatic    #112 <Method void AFLogger.afErrorLog(String, Throwable)>
	//*  77  151:return          
		catch(IOException ioexception)
	//*  78  152:astore_1        
		{
			AFLogger.afErrorLog("Exception while sending request to server. ", ((Throwable) (ioexception)));
	//   79  153:ldc1            #114 <String "Exception while sending request to server. ">
	//   80  155:aload_1         
	//   81  156:invokestatic    #112 <Method void AFLogger.afErrorLog(String, Throwable)>
			if(s1 != null && _fld02CA != null && !_fld0971.contains("&isCachedRequest=true&timeincache="))
	//*  82  159:aload_2         
	//*  83  160:ifnull          220
	//*  84  163:aload_0         
	//*  85  164:getfield        #33  <Field WeakReference _fld02CA>
	//*  86  167:ifnull          220
	//*  87  170:aload_0         
	//*  88  171:getfield        #35  <Field String _fld0971>
	//*  89  174:ldc1            #116 <String "&isCachedRequest=true&timeincache=">
	//*  90  176:invokevirtual   #120 <Method boolean String.contains(CharSequence)>
	//*  91  179:ifne            220
			{
				CacheManager.getInstance().cacheRequest(new RequestCacheData(_fld0971, s1, "4.8.9"), (Context)((Reference) (_fld02CA)).get());
	//   92  182:invokestatic    #126 <Method CacheManager CacheManager.getInstance()>
	//   93  185:new             #128 <Class RequestCacheData>
	//   94  188:dup             
	//   95  189:aload_0         
	//   96  190:getfield        #35  <Field String _fld0971>
	//   97  193:aload_2         
	//   98  194:ldc1            #130 <String "4.8.9">
	//   99  196:invokespecial   #133 <Method void RequestCacheData(String, String, String)>
	//  100  199:aload_0         
	//  101  200:getfield        #33  <Field WeakReference _fld02CA>
	//  102  203:invokevirtual   #138 <Method Object Reference.get()>
	//  103  206:checkcast       #140 <Class Context>
	//  104  209:invokevirtual   #144 <Method void CacheManager.cacheRequest(RequestCacheData, Context)>
				AFLogger.afErrorLog(((Throwable) (ioexception)).getMessage(), ((Throwable) (ioexception)));
	//  105  212:aload_1         
	//  106  213:invokevirtual   #106 <Method String Throwable.getMessage()>
	//  107  216:aload_1         
	//  108  217:invokestatic    #112 <Method void AFLogger.afErrorLog(String, Throwable)>
			}
			return;
	//  109  220:return          
		}
		catch(Throwable throwable)
		{
			AFLogger.afErrorLog(throwable.getMessage(), throwable);
			return;
		}
		s1 = s;
		jsonobject = AFHelper.convertToJsonObject(_fld02CF);
		s1 = s;
		if(jsonobject instanceof JSONObject)
			break MISSING_BLOCK_LABEL_106;
		s1 = s;
		s = jsonobject.toString();
		break MISSING_BLOCK_LABEL_117;
		s1 = s;
		s = JSONObjectInstrumentation.toString((JSONObject)jsonobject);
		s1 = s;
		AppsFlyerLib._mth02CB(_fld02BC, _fld0971, s, s2, _fld02CA, ((String) (null)), _fld02CB);
		return;
	}

	private AppsFlyerLib _fld02BC;
	private WeakReference _fld02CA;
	private boolean _fld02CB;
	private int _fld02CE;
	private Map _fld02CF;
	private String _fld0971;

	private AppsFlyerLib$e(AppsFlyerLib appsflyerlib, String s, Map map, Context context, boolean flag, int i)
	{
		_fld02BC = appsflyerlib;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field AppsFlyerLib _fld02BC>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #31  <Method void Object()>
		_fld02CA = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #33  <Field WeakReference _fld02CA>
		_fld0971 = s;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #35  <Field String _fld0971>
		_fld02CF = map;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #37  <Field Map _fld02CF>
		_fld02CA = new WeakReference(((Object) (context)));
	//   14   24:aload_0         
	//   15   25:new             #39  <Class WeakReference>
	//   16   28:dup             
	//   17   29:aload           4
	//   18   31:invokespecial   #42  <Method void WeakReference(Object)>
	//   19   34:putfield        #33  <Field WeakReference _fld02CA>
		_fld02CB = flag;
	//   20   37:aload_0         
	//   21   38:iload           5
	//   22   40:putfield        #44  <Field boolean _fld02CB>
		_fld02CE = i;
	//   23   43:aload_0         
	//   24   44:iload           6
	//   25   46:putfield        #46  <Field int _fld02CE>
	//   26   49:return          
	}

	AppsFlyerLib$e(AppsFlyerLib appsflyerlib, String s, Map map, Context context, boolean flag, int i, byte byte0)
	{
		this(appsflyerlib, s, map, context, flag, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:iload           6
	//    7   10:invokespecial   #52  <Method void AppsFlyerLib$e(AppsFlyerLib, String, Map, Context, boolean, int)>
	//    8   13:return          
	}
}
