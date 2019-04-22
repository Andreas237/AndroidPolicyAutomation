// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appsflyer:
//			AFLogger

public class AppsFlyerProperties
{

	private AppsFlyerProperties()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		_fld02CF = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #27  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void HashMap()>
	//    6   12:putfield        #30  <Field Map _fld02CF>
		_fld02BD = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #32  <Field boolean _fld02BD>
	//   10   20:return          
	}

	public static AppsFlyerProperties getInstance()
	{
		return _fld02CE;
	//    0    0:getstatic       #23  <Field AppsFlyerProperties _fld02CE>
	//    1    3:areturn         
	}

	public boolean getBoolean(String s, boolean flag)
	{
		s = getString(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #40  <Method String getString(String)>
	//    3    5:astore_1        
		if(s == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       12
			return flag;
	//    6   10:iload_2         
	//    7   11:ireturn         
		else
			return Boolean.valueOf(s).booleanValue();
	//    8   12:aload_1         
	//    9   13:invokestatic    #46  <Method Boolean Boolean.valueOf(String)>
	//   10   16:invokevirtual   #50  <Method boolean Boolean.booleanValue()>
	//   11   19:ireturn         
	}

	public int getInt(String s, int i)
	{
		s = getString(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #40  <Method String getString(String)>
	//    3    5:astore_1        
		if(s == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       12
			return i;
	//    6   10:iload_2         
	//    7   11:ireturn         
		else
			return ((Number) (Integer.valueOf(s))).intValue();
	//    8   12:aload_1         
	//    9   13:invokestatic    #57  <Method Integer Integer.valueOf(String)>
	//   10   16:invokevirtual   #63  <Method int Number.intValue()>
	//   11   19:ireturn         
	}

	public String getReferrer(Context context)
	{
		String s = _fld02CA;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field String _fld02CA>
	//    2    4:astore_2        
		if(s != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          11
			return s;
	//    5    9:aload_2         
	//    6   10:areturn         
		if(getString("AF_REFERRER") != null)
	//*   7   11:aload_0         
	//*   8   12:ldc1            #69  <String "AF_REFERRER">
	//*   9   14:invokevirtual   #40  <Method String getString(String)>
	//*  10   17:ifnull          27
			return getString("AF_REFERRER");
	//   11   20:aload_0         
	//   12   21:ldc1            #69  <String "AF_REFERRER">
	//   13   23:invokevirtual   #40  <Method String getString(String)>
	//   14   26:areturn         
		if(context == null)
	//*  15   27:aload_1         
	//*  16   28:ifnonnull       33
			return null;
	//   17   31:aconst_null     
	//   18   32:areturn         
		else
			return context.getSharedPreferences("appsflyer-data", 0).getString("referrer", ((String) (null)));
	//   19   33:aload_1         
	//   20   34:ldc1            #71  <String "appsflyer-data">
	//   21   36:iconst_0        
	//   22   37:invokevirtual   #77  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   23   40:ldc1            #79  <String "referrer">
	//   24   42:aconst_null     
	//   25   43:invokeinterface #84  <Method String SharedPreferences.getString(String, String)>
	//   26   48:areturn         
	}

	public String getString(String s)
	{
		return (String)_fld02CF.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Map _fld02CF>
	//    2    4:aload_1         
	//    3    5:invokeinterface #90  <Method Object Map.get(Object)>
	//    4   10:checkcast       #92  <Class String>
	//    5   13:areturn         
	}

	protected boolean isFirstLaunchCalled()
	{
		return _fld0971;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field boolean _fld0971>
	//    2    4:ireturn         
	}

	public boolean isLogsDisabledCompletely()
	{
		return getBoolean("disableLogs", false);
	//    0    0:aload_0         
	//    1    1:ldc1            #98  <String "disableLogs">
	//    2    3:iconst_0        
	//    3    4:invokevirtual   #100 <Method boolean getBoolean(String, boolean)>
	//    4    7:ireturn         
	}

	public boolean isOtherSdkStringDisabled()
	{
		return getBoolean("disableOtherSdk", false);
	//    0    0:aload_0         
	//    1    1:ldc1            #103 <String "disableOtherSdk">
	//    2    3:iconst_0        
	//    3    4:invokevirtual   #100 <Method boolean getBoolean(String, boolean)>
	//    4    7:ireturn         
	}

	public void loadProperties(Context context)
	{
		if(_fld02BD)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field boolean _fld02BD>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		context = ((Context) (context.getSharedPreferences("appsflyer-data", 0).getString("savedProperties", ((String) (null)))));
	//    4    8:aload_1         
	//    5    9:ldc1            #71  <String "appsflyer-data">
	//    6   11:iconst_0        
	//    7   12:invokevirtual   #77  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    8   15:ldc1            #109 <String "savedProperties">
	//    9   17:aconst_null     
	//   10   18:invokeinterface #84  <Method String SharedPreferences.getString(String, String)>
	//   11   23:astore_1        
		if(context == null)
			break MISSING_BLOCK_LABEL_135;
	//   12   24:aload_1         
	//   13   25:ifnull          135
		AFLogger.afDebugLog("Loading properties..");
	//   14   28:ldc1            #111 <String "Loading properties..">
	//   15   30:invokestatic    #117 <Method void AFLogger.afDebugLog(String)>
		context = ((Context) (JSONObjectInstrumentation.init(((String) (context)))));
	//   16   33:aload_1         
	//   17   34:invokestatic    #123 <Method JSONObject JSONObjectInstrumentation.init(String)>
	//   18   37:astore_1        
		Iterator iterator = ((JSONObject) (context)).keys();
	//   19   38:aload_1         
	//   20   39:invokevirtual   #129 <Method Iterator JSONObject.keys()>
	//   21   42:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   22   43:aload_2         
	//   23   44:invokeinterface #134 <Method boolean Iterator.hasNext()>
	//   24   49:ifeq            94
			String s = (String)iterator.next();
	//   25   52:aload_2         
	//   26   53:invokeinterface #138 <Method Object Iterator.next()>
	//   27   58:checkcast       #92  <Class String>
	//   28   61:astore_3        
			if(_fld02CF.get(((Object) (s))) == null)
	//*  29   62:aload_0         
	//*  30   63:getfield        #30  <Field Map _fld02CF>
	//*  31   66:aload_3         
	//*  32   67:invokeinterface #90  <Method Object Map.get(Object)>
	//*  33   72:ifnonnull       43
				_fld02CF.put(((Object) (s)), ((Object) (((JSONObject) (context)).getString(s))));
	//   34   75:aload_0         
	//   35   76:getfield        #30  <Field Map _fld02CF>
	//   36   79:aload_3         
	//   37   80:aload_1         
	//   38   81:aload_3         
	//   39   82:invokevirtual   #139 <Method String JSONObject.getString(String)>
	//   40   85:invokeinterface #143 <Method Object Map.put(Object, Object)>
	//   41   90:pop             
		} while(true);
	//   42   91:goto            43
		try
		{
			_fld02BD = true;
	//   43   94:aload_0         
	//   44   95:iconst_1        
	//   45   96:putfield        #32  <Field boolean _fld02BD>
		}
	//*  46   99:goto            109
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  47  102:astore_1        
		{
			AFLogger.afErrorLog("Failed loading properties", ((Throwable) (context)));
	//   48  103:ldc1            #145 <String "Failed loading properties">
	//   49  105:aload_1         
	//   50  106:invokestatic    #149 <Method void AFLogger.afErrorLog(String, Throwable)>
		}
		context = ((Context) (new StringBuilder("Done loading properties: ")));
	//   51  109:new             #151 <Class StringBuilder>
	//   52  112:dup             
	//   53  113:ldc1            #153 <String "Done loading properties: ">
	//   54  115:invokespecial   #155 <Method void StringBuilder(String)>
	//   55  118:astore_1        
		((StringBuilder) (context)).append(_fld02BD);
	//   56  119:aload_1         
	//   57  120:aload_0         
	//   58  121:getfield        #32  <Field boolean _fld02BD>
	//   59  124:invokevirtual   #159 <Method StringBuilder StringBuilder.append(boolean)>
	//   60  127:pop             
		AFLogger.afDebugLog(((Object) (context)).toString());
	//   61  128:aload_1         
	//   62  129:invokevirtual   #163 <Method String Object.toString()>
	//   63  132:invokestatic    #117 <Method void AFLogger.afDebugLog(String)>
	//   64  135:return          
	}

	public void saveProperties(SharedPreferences sharedpreferences)
	{
		Object obj = ((Object) (new JSONObject(_fld02CF)));
	//    0    0:new             #125 <Class JSONObject>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field Map _fld02CF>
	//    4    8:invokespecial   #171 <Method void JSONObject(Map)>
	//    5   11:astore_2        
		if(!(obj instanceof JSONObject))
	//*   6   12:aload_2         
	//*   7   13:instanceof      #125 <Class JSONObject>
	//*   8   16:ifne            27
			obj = ((Object) (((JSONObject) (obj)).toString()));
	//    9   19:aload_2         
	//   10   20:invokevirtual   #172 <Method String JSONObject.toString()>
	//   11   23:astore_2        
		else
	//*  12   24:goto            35
			obj = ((Object) (JSONObjectInstrumentation.toString((JSONObject)obj)));
	//   13   27:aload_2         
	//   14   28:checkcast       #125 <Class JSONObject>
	//   15   31:invokestatic    #175 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   16   34:astore_2        
		sharedpreferences = ((SharedPreferences) (sharedpreferences.edit()));
	//   17   35:aload_1         
	//   18   36:invokeinterface #179 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   19   41:astore_1        
		((android.content.SharedPreferences.Editor) (sharedpreferences)).putString("savedProperties", ((String) (obj)));
	//   20   42:aload_1         
	//   21   43:ldc1            #109 <String "savedProperties">
	//   22   45:aload_2         
	//   23   46:invokeinterface #185 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   24   51:pop             
		if(android.os.Build.VERSION.SDK_INT >= 9)
	//*  25   52:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*  26   55:bipush          9
	//*  27   57:icmplt          67
		{
			((android.content.SharedPreferences.Editor) (sharedpreferences)).apply();
	//   28   60:aload_1         
	//   29   61:invokeinterface #194 <Method void android.content.SharedPreferences$Editor.apply()>
			return;
	//   30   66:return          
		} else
		{
			((android.content.SharedPreferences.Editor) (sharedpreferences)).commit();
	//   31   67:aload_1         
	//   32   68:invokeinterface #197 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   33   73:pop             
			return;
	//   34   74:return          
		}
	}

	public void set(String s, int i)
	{
		_fld02CF.put(((Object) (s)), ((Object) (Integer.toString(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Map _fld02CF>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #203 <Method String Integer.toString(int)>
	//    5    9:invokeinterface #143 <Method Object Map.put(Object, Object)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void set(String s, String s1)
	{
		_fld02CF.put(((Object) (s)), ((Object) (s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Map _fld02CF>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #143 <Method Object Map.put(Object, Object)>
	//    5   11:pop             
	//    6   12:return          
	}

	public void set(String s, boolean flag)
	{
		_fld02CF.put(((Object) (s)), ((Object) (Boolean.toString(flag))));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Map _fld02CF>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #208 <Method String Boolean.toString(boolean)>
	//    5    9:invokeinterface #143 <Method Object Map.put(Object, Object)>
	//    6   14:pop             
	//    7   15:return          
	}

	protected void setFirstLaunchCalled()
	{
		_fld0971 = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #95  <Field boolean _fld0971>
	//    3    5:return          
	}

	protected void setFirstLaunchCalled(boolean flag)
	{
		_fld0971 = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #95  <Field boolean _fld0971>
	//    3    5:return          
	}

	protected void setOnReceiveCalled()
	{
		_fld02CB = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #213 <Field boolean _fld02CB>
	//    3    5:return          
	}

	protected void setReferrer(String s)
	{
		set("AF_REFERRER", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #69  <String "AF_REFERRER">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #216 <Method void set(String, String)>
		_fld02CA = s;
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:putfield        #67  <Field String _fld02CA>
	//    7   12:return          
	}

	private static AppsFlyerProperties _fld02CE = new AppsFlyerProperties();
	private boolean _fld02BD;
	private String _fld02CA;
	private boolean _fld02CB;
	private Map _fld02CF;
	private boolean _fld0971;

	static 
	{
	//    0    0:new             #2   <Class AppsFlyerProperties>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void AppsFlyerProperties()>
	//    3    7:putstatic       #23  <Field AppsFlyerProperties _fld02CE>
	//*   4   10:return          
	}
}
