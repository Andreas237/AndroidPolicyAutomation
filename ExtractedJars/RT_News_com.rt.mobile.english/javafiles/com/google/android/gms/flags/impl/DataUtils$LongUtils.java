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
//			DataUtils, zzc

public static class DataUtils$LongUtils extends DataUtils
{

	public static Long getFromSharedPreferencesNoStrict(SharedPreferences sharedpreferences, String s, Long long1)
	{
		try
		{
			sharedpreferences = ((SharedPreferences) ((Long)StrictModeUtil.runWithLaxStrictMode(((java.util.concurrent.Callable) (new zzc(sharedpreferences, s, long1))))));
	//    0    0:new             #22  <Class zzc>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #25  <Method void zzc(SharedPreferences, String, Long)>
	//    6   10:invokestatic    #31  <Method Object StrictModeUtil.runWithLaxStrictMode(java.util.concurrent.Callable)>
	//    7   13:checkcast       #33  <Class Long>
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
			return long1;
	//   33   62:aload_2         
	//   34   63:areturn         
		}
		return ((Long) (sharedpreferences));
	}

	public Long getFromJSONObject(JSONObject jsonobject)
	{
		return Long.valueOf(jsonobject.optLong(((Flag) (zzacq)).getKey(), ((Long)((Flag) (zzacq)).getDefault()).longValue()));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field com.google.android.gms.flags.Flag$LongFlag zzacq>
	//    3    5:invokevirtual   #71  <Method String Flag.getKey()>
	//    4    8:aload_0         
	//    5    9:getfield        #15  <Field com.google.android.gms.flags.Flag$LongFlag zzacq>
	//    6   12:invokevirtual   #75  <Method Object Flag.getDefault()>
	//    7   15:checkcast       #33  <Class Long>
	//    8   18:invokevirtual   #79  <Method long Long.longValue()>
	//    9   21:invokevirtual   #85  <Method long JSONObject.optLong(String, long)>
	//   10   24:invokestatic    #88  <Method Long Long.valueOf(long)>
	//   11   27:areturn         
	}

	public volatile Object getFromJSONObject(JSONObject jsonobject)
	{
		return ((Object) (getFromJSONObject(jsonobject)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #91  <Method Long getFromJSONObject(JSONObject)>
	//    3    5:areturn         
	}

	public Long getFromSharedPreferences(SharedPreferences sharedpreferences)
	{
		return Long.valueOf(sharedpreferences.getLong(((Flag) (zzacq)).getKey(), ((Long)((Flag) (zzacq)).getDefault()).longValue()));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field com.google.android.gms.flags.Flag$LongFlag zzacq>
	//    3    5:invokevirtual   #71  <Method String Flag.getKey()>
	//    4    8:aload_0         
	//    5    9:getfield        #15  <Field com.google.android.gms.flags.Flag$LongFlag zzacq>
	//    6   12:invokevirtual   #75  <Method Object Flag.getDefault()>
	//    7   15:checkcast       #33  <Class Long>
	//    8   18:invokevirtual   #79  <Method long Long.longValue()>
	//    9   21:invokeinterface #98  <Method long SharedPreferences.getLong(String, long)>
	//   10   26:invokestatic    #88  <Method Long Long.valueOf(long)>
	//   11   29:areturn         
	}

	public volatile Object getFromSharedPreferences(SharedPreferences sharedpreferences)
	{
		return ((Object) (getFromSharedPreferences(sharedpreferences)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #101 <Method Long getFromSharedPreferences(SharedPreferences)>
	//    3    5:areturn         
	}

	public GservicesValue getGservicesValue()
	{
		return GservicesValue.value(((Flag) (zzacq)).getKey(), (Long)((Flag) (zzacq)).getDefault());
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field com.google.android.gms.flags.Flag$LongFlag zzacq>
	//    2    4:invokevirtual   #71  <Method String Flag.getKey()>
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field com.google.android.gms.flags.Flag$LongFlag zzacq>
	//    5   11:invokevirtual   #75  <Method Object Flag.getDefault()>
	//    6   14:checkcast       #33  <Class Long>
	//    7   17:invokestatic    #109 <Method GservicesValue GservicesValue.value(String, Long)>
	//    8   20:areturn         
	}

	public void putInSharedPreferences(android.content.itor itor, Long long1)
	{
		itor.putLong(((Flag) (zzacq)).getKey(), long1.longValue());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field com.google.android.gms.flags.Flag$LongFlag zzacq>
	//    3    5:invokevirtual   #71  <Method String Flag.getKey()>
	//    4    8:aload_2         
	//    5    9:invokevirtual   #79  <Method long Long.longValue()>
	//    6   12:invokeinterface #119 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//    7   17:pop             
	//    8   18:return          
	}

	public volatile void putInSharedPreferences(android.content.itor itor, Object obj)
	{
		putInSharedPreferences(itor, (Long)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #33  <Class Long>
	//    4    6:invokevirtual   #122 <Method void putInSharedPreferences(android.content.SharedPreferences$Editor, Long)>
	//    5    9:return          
	}

	public void putStringOverrideInSharedPreferences(android.content.itor itor, String s)
	{
		itor.putLong(((Flag) (zzacq)).getKey(), Long.parseLong(s));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field com.google.android.gms.flags.Flag$LongFlag zzacq>
	//    3    5:invokevirtual   #71  <Method String Flag.getKey()>
	//    4    8:aload_2         
	//    5    9:invokestatic    #128 <Method long Long.parseLong(String)>
	//    6   12:invokeinterface #119 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//    7   17:pop             
	//    8   18:return          
	}

	private final com.google.android.gms.flags.Flag.LongFlag zzacq;

	DataUtils$LongUtils(com.google.android.gms.flags.Flag.LongFlag longflag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void DataUtils()>
		zzacq = longflag;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field com.google.android.gms.flags.Flag$LongFlag zzacq>
	//    5    9:return          
	}
}
