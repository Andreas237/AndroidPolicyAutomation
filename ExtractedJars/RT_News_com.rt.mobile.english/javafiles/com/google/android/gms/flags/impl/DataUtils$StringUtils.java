// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.flags.Flag;
import com.google.android.gms.flags.impl.util.StrictModeUtil;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.flags.impl:
//			DataUtils, zzd

public static class DataUtils$StringUtils extends DataUtils
{

	public static String getFromSharedPreferencesNoStrict(SharedPreferences sharedpreferences, String s, String s1)
	{
		try
		{
			sharedpreferences = ((SharedPreferences) ((String)StrictModeUtil.runWithLaxStrictMode(((java.util.concurrent.Callable) (new zzd(sharedpreferences, s, s1))))));
	//    0    0:new             #22  <Class zzd>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #25  <Method void zzd(SharedPreferences, String, String)>
	//    6   10:invokestatic    #31  <Method Object StrictModeUtil.runWithLaxStrictMode(java.util.concurrent.Callable)>
	//    7   13:checkcast       #33  <Class String>
	//    8   16:astore_0        
		}
	//*   9   17:aload_0         
	//*  10   18:areturn         
		// Misplaced declaration of an exception variable
		catch(SharedPreferences sharedpreferences)
	//*  11   19:astore_0        
		{
			sharedpreferences = ((SharedPreferences) (String.valueOf(((Object) (((Exception) (sharedpreferences)).getMessage())))));
	//   12   20:aload_0         
	//   13   21:invokevirtual   #37  <Method String Exception.getMessage()>
	//   14   24:invokestatic    #41  <Method String String.valueOf(Object)>
	//   15   27:astore_0        
			if(((String) (sharedpreferences)).length() != 0)
	//*  16   28:aload_0         
	//*  17   29:invokevirtual   #45  <Method int String.length()>
	//*  18   32:ifeq            45
				sharedpreferences = ((SharedPreferences) ("Flag value not available, returning default: ".concat(((String) (sharedpreferences)))));
	//   19   35:ldc1            #47  <String "Flag value not available, returning default: ">
	//   20   37:aload_0         
	//   21   38:invokevirtual   #51  <Method String String.concat(String)>
	//   22   41:astore_0        
			else
	//*  23   42:goto            55
				sharedpreferences = ((SharedPreferences) (new String("Flag value not available, returning default: ")));
	//   24   45:new             #33  <Class String>
	//   25   48:dup             
	//   26   49:ldc1            #47  <String "Flag value not available, returning default: ">
	//   27   51:invokespecial   #54  <Method void String(String)>
	//   28   54:astore_0        
			Log.w("FlagDataUtils", ((String) (sharedpreferences)));
	//   29   55:ldc1            #56  <String "FlagDataUtils">
	//   30   57:aload_0         
	//   31   58:invokestatic    #62  <Method int Log.w(String, String)>
	//   32   61:pop             
			return s1;
	//   33   62:aload_2         
	//   34   63:areturn         
		}
		return ((String) (sharedpreferences));
	}

	public volatile Object getFromJSONObject(JSONObject jsonobject)
	{
		return ((Object) (getFromJSONObject(jsonobject)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #67  <Method String getFromJSONObject(JSONObject)>
	//    3    5:areturn         
	}

	public String getFromJSONObject(JSONObject jsonobject)
	{
		return jsonobject.optString(((Flag) (zzacs)).getKey(), (String)((Flag) (zzacs)).getDefault());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field com.google.android.gms.flags.Flag$StringFlag zzacs>
	//    3    5:invokevirtual   #72  <Method String Flag.getKey()>
	//    4    8:aload_0         
	//    5    9:getfield        #15  <Field com.google.android.gms.flags.Flag$StringFlag zzacs>
	//    6   12:invokevirtual   #76  <Method Object Flag.getDefault()>
	//    7   15:checkcast       #33  <Class String>
	//    8   18:invokevirtual   #82  <Method String JSONObject.optString(String, String)>
	//    9   21:areturn         
	}

	public volatile Object getFromSharedPreferences(SharedPreferences sharedpreferences)
	{
		return ((Object) (getFromSharedPreferences(sharedpreferences)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #87  <Method String getFromSharedPreferences(SharedPreferences)>
	//    3    5:areturn         
	}

	public String getFromSharedPreferences(SharedPreferences sharedpreferences)
	{
		return sharedpreferences.getString(((Flag) (zzacs)).getKey(), (String)((Flag) (zzacs)).getDefault());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field com.google.android.gms.flags.Flag$StringFlag zzacs>
	//    3    5:invokevirtual   #72  <Method String Flag.getKey()>
	//    4    8:aload_0         
	//    5    9:getfield        #15  <Field com.google.android.gms.flags.Flag$StringFlag zzacs>
	//    6   12:invokevirtual   #76  <Method Object Flag.getDefault()>
	//    7   15:checkcast       #33  <Class String>
	//    8   18:invokeinterface #92  <Method String SharedPreferences.getString(String, String)>
	//    9   23:areturn         
	}

	public GservicesValue getGservicesValue()
	{
		return GservicesValue.value(((Flag) (zzacs)).getKey(), (String)((Flag) (zzacs)).getDefault());
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field com.google.android.gms.flags.Flag$StringFlag zzacs>
	//    2    4:invokevirtual   #72  <Method String Flag.getKey()>
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field com.google.android.gms.flags.Flag$StringFlag zzacs>
	//    5   11:invokevirtual   #76  <Method Object Flag.getDefault()>
	//    6   14:checkcast       #33  <Class String>
	//    7   17:invokestatic    #100 <Method GservicesValue GservicesValue.value(String, String)>
	//    8   20:areturn         
	}

	public volatile void putInSharedPreferences(android.content.or or, Object obj)
	{
		putInSharedPreferences(or, (String)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #33  <Class String>
	//    4    6:invokevirtual   #107 <Method void putInSharedPreferences(android.content.SharedPreferences$Editor, String)>
	//    5    9:return          
	}

	public void putInSharedPreferences(android.content.or or, String s)
	{
		or.putString(((Flag) (zzacs)).getKey(), s);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field com.google.android.gms.flags.Flag$StringFlag zzacs>
	//    3    5:invokevirtual   #72  <Method String Flag.getKey()>
	//    4    8:aload_2         
	//    5    9:invokeinterface #113 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void putStringOverrideInSharedPreferences(android.content.or or, String s)
	{
		or.putString(((Flag) (zzacs)).getKey(), String.valueOf(((Object) (s))));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field com.google.android.gms.flags.Flag$StringFlag zzacs>
	//    3    5:invokevirtual   #72  <Method String Flag.getKey()>
	//    4    8:aload_2         
	//    5    9:invokestatic    #41  <Method String String.valueOf(Object)>
	//    6   12:invokeinterface #113 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//    7   17:pop             
	//    8   18:return          
	}

	private final com.google.android.gms.flags.Flag.StringFlag zzacs;

	DataUtils$StringUtils(com.google.android.gms.flags.Flag.StringFlag stringflag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void DataUtils()>
		zzacs = stringflag;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field com.google.android.gms.flags.Flag$StringFlag zzacs>
	//    5    9:return          
	}
}
