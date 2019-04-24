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
//			DataUtils, zza

public static class DataUtils$BooleanUtils extends DataUtils
{

	public static Boolean getFromSharedPreferencesNoStrict(SharedPreferences sharedpreferences, String s, Boolean boolean1)
	{
		try
		{
			sharedpreferences = ((SharedPreferences) ((Boolean)StrictModeUtil.runWithLaxStrictMode(((java.util.concurrent.Callable) (new zza(sharedpreferences, s, boolean1))))));
	//    0    0:new             #22  <Class zza>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #25  <Method void zza(SharedPreferences, String, Boolean)>
	//    6   10:invokestatic    #31  <Method Object StrictModeUtil.runWithLaxStrictMode(java.util.concurrent.Callable)>
	//    7   13:checkcast       #33  <Class Boolean>
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
	//   14   24:invokestatic    #43  <Method String String.valueOf(Object)>
	//   15   27:astore_0        
			if(((String) (sharedpreferences)).length() != 0)
	//*  16   28:aload_0         
	//*  17   29:invokevirtual   #47  <Method int String.length()>
	//*  18   32:ifeq            45
				sharedpreferences = ((SharedPreferences) ("Flag value not available, returning default: ".concat(((String) (sharedpreferences)))));
	//   19   35:ldc1            #49  <String "Flag value not available, returning default: ">
	//   20   37:aload_0         
	//   21   38:invokevirtual   #53  <Method String String.concat(String)>
	//   22   41:astore_0        
			else
	//*  23   42:goto            55
				sharedpreferences = ((SharedPreferences) (new String("Flag value not available, returning default: ")));
	//   24   45:new             #39  <Class String>
	//   25   48:dup             
	//   26   49:ldc1            #49  <String "Flag value not available, returning default: ">
	//   27   51:invokespecial   #56  <Method void String(String)>
	//   28   54:astore_0        
			Log.w("FlagDataUtils", ((String) (sharedpreferences)));
	//   29   55:ldc1            #58  <String "FlagDataUtils">
	//   30   57:aload_0         
	//   31   58:invokestatic    #64  <Method int Log.w(String, String)>
	//   32   61:pop             
			return boolean1;
	//   33   62:aload_2         
	//   34   63:areturn         
		}
		return ((Boolean) (sharedpreferences));
	}

	public Boolean getFromJSONObject(JSONObject jsonobject)
	{
		return Boolean.valueOf(jsonobject.optBoolean(((Flag) (zzack)).getKey(), ((Boolean)((Flag) (zzack)).getDefault()).booleanValue()));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field com.google.android.gms.flags.Flag$BooleanFlag zzack>
	//    3    5:invokevirtual   #71  <Method String Flag.getKey()>
	//    4    8:aload_0         
	//    5    9:getfield        #15  <Field com.google.android.gms.flags.Flag$BooleanFlag zzack>
	//    6   12:invokevirtual   #75  <Method Object Flag.getDefault()>
	//    7   15:checkcast       #33  <Class Boolean>
	//    8   18:invokevirtual   #79  <Method boolean Boolean.booleanValue()>
	//    9   21:invokevirtual   #85  <Method boolean JSONObject.optBoolean(String, boolean)>
	//   10   24:invokestatic    #88  <Method Boolean Boolean.valueOf(boolean)>
	//   11   27:areturn         
	}

	public volatile Object getFromJSONObject(JSONObject jsonobject)
	{
		return ((Object) (getFromJSONObject(jsonobject)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #91  <Method Boolean getFromJSONObject(JSONObject)>
	//    3    5:areturn         
	}

	public Boolean getFromSharedPreferences(SharedPreferences sharedpreferences)
	{
		return Boolean.valueOf(sharedpreferences.getBoolean(((Flag) (zzack)).getKey(), ((Boolean)((Flag) (zzack)).getDefault()).booleanValue()));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field com.google.android.gms.flags.Flag$BooleanFlag zzack>
	//    3    5:invokevirtual   #71  <Method String Flag.getKey()>
	//    4    8:aload_0         
	//    5    9:getfield        #15  <Field com.google.android.gms.flags.Flag$BooleanFlag zzack>
	//    6   12:invokevirtual   #75  <Method Object Flag.getDefault()>
	//    7   15:checkcast       #33  <Class Boolean>
	//    8   18:invokevirtual   #79  <Method boolean Boolean.booleanValue()>
	//    9   21:invokeinterface #98  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   10   26:invokestatic    #88  <Method Boolean Boolean.valueOf(boolean)>
	//   11   29:areturn         
	}

	public volatile Object getFromSharedPreferences(SharedPreferences sharedpreferences)
	{
		return ((Object) (getFromSharedPreferences(sharedpreferences)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #101 <Method Boolean getFromSharedPreferences(SharedPreferences)>
	//    3    5:areturn         
	}

	public GservicesValue getGservicesValue()
	{
		return GservicesValue.value(((Flag) (zzack)).getKey(), ((Boolean)((Flag) (zzack)).getDefault()).booleanValue());
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field com.google.android.gms.flags.Flag$BooleanFlag zzack>
	//    2    4:invokevirtual   #71  <Method String Flag.getKey()>
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field com.google.android.gms.flags.Flag$BooleanFlag zzack>
	//    5   11:invokevirtual   #75  <Method Object Flag.getDefault()>
	//    6   14:checkcast       #33  <Class Boolean>
	//    7   17:invokevirtual   #79  <Method boolean Boolean.booleanValue()>
	//    8   20:invokestatic    #109 <Method GservicesValue GservicesValue.value(String, boolean)>
	//    9   23:areturn         
	}

	public void putInSharedPreferences(android.content.r r, Boolean boolean1)
	{
		r.putBoolean(((Flag) (zzack)).getKey(), boolean1.booleanValue());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field com.google.android.gms.flags.Flag$BooleanFlag zzack>
	//    3    5:invokevirtual   #71  <Method String Flag.getKey()>
	//    4    8:aload_2         
	//    5    9:invokevirtual   #79  <Method boolean Boolean.booleanValue()>
	//    6   12:invokeinterface #119 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    7   17:pop             
	//    8   18:return          
	}

	public volatile void putInSharedPreferences(android.content.r r, Object obj)
	{
		putInSharedPreferences(r, (Boolean)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #33  <Class Boolean>
	//    4    6:invokevirtual   #122 <Method void putInSharedPreferences(android.content.SharedPreferences$Editor, Boolean)>
	//    5    9:return          
	}

	public void putStringOverrideInSharedPreferences(android.content.r r, String s)
	{
		r.putBoolean(((Flag) (zzack)).getKey(), Boolean.parseBoolean(s));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field com.google.android.gms.flags.Flag$BooleanFlag zzack>
	//    3    5:invokevirtual   #71  <Method String Flag.getKey()>
	//    4    8:aload_2         
	//    5    9:invokestatic    #128 <Method boolean Boolean.parseBoolean(String)>
	//    6   12:invokeinterface #119 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    7   17:pop             
	//    8   18:return          
	}

	private final com.google.android.gms.flags.Flag.BooleanFlag zzack;

	DataUtils$BooleanUtils(com.google.android.gms.flags.Flag.BooleanFlag booleanflag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void DataUtils()>
		zzack = booleanflag;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field com.google.android.gms.flags.Flag$BooleanFlag zzack>
	//    5    9:return          
	}
}
