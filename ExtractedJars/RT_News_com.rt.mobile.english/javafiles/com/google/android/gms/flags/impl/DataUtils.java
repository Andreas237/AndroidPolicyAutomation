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
//			zza, zzb, zzc, zzd

public abstract class DataUtils
{
	public static class BooleanUtils extends DataUtils
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

		public void putInSharedPreferences(android.content.SharedPreferences.Editor editor, Boolean boolean1)
		{
			editor.putBoolean(((Flag) (zzack)).getKey(), boolean1.booleanValue());
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

		public volatile void putInSharedPreferences(android.content.SharedPreferences.Editor editor, Object obj)
		{
			putInSharedPreferences(editor, (Boolean)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #33  <Class Boolean>
		//    4    6:invokevirtual   #122 <Method void putInSharedPreferences(android.content.SharedPreferences$Editor, Boolean)>
		//    5    9:return          
		}

		public void putStringOverrideInSharedPreferences(android.content.SharedPreferences.Editor editor, String s)
		{
			editor.putBoolean(((Flag) (zzack)).getKey(), Boolean.parseBoolean(s));
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

		BooleanUtils(com.google.android.gms.flags.Flag.BooleanFlag booleanflag)
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

	public static class IntegerUtils extends DataUtils
	{

		public static Integer getFromSharedPreferencesNoStrict(SharedPreferences sharedpreferences, String s, Integer integer)
		{
			try
			{
				sharedpreferences = ((SharedPreferences) ((Integer)StrictModeUtil.runWithLaxStrictMode(((java.util.concurrent.Callable) (new zzb(sharedpreferences, s, integer))))));
		//    0    0:new             #22  <Class zzb>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #25  <Method void zzb(SharedPreferences, String, Integer)>
		//    6   10:invokestatic    #31  <Method Object StrictModeUtil.runWithLaxStrictMode(java.util.concurrent.Callable)>
		//    7   13:checkcast       #33  <Class Integer>
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
				return integer;
		//   33   62:aload_2         
		//   34   63:areturn         
			}
			return ((Integer) (sharedpreferences));
		}

		public Integer getFromJSONObject(JSONObject jsonobject)
		{
			return Integer.valueOf(jsonobject.optInt(((Flag) (zzaco)).getKey(), ((Integer)((Flag) (zzaco)).getDefault()).intValue()));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #15  <Field com.google.android.gms.flags.Flag$IntegerFlag zzaco>
		//    3    5:invokevirtual   #71  <Method String Flag.getKey()>
		//    4    8:aload_0         
		//    5    9:getfield        #15  <Field com.google.android.gms.flags.Flag$IntegerFlag zzaco>
		//    6   12:invokevirtual   #75  <Method Object Flag.getDefault()>
		//    7   15:checkcast       #33  <Class Integer>
		//    8   18:invokevirtual   #78  <Method int Integer.intValue()>
		//    9   21:invokevirtual   #84  <Method int JSONObject.optInt(String, int)>
		//   10   24:invokestatic    #87  <Method Integer Integer.valueOf(int)>
		//   11   27:areturn         
		}

		public volatile Object getFromJSONObject(JSONObject jsonobject)
		{
			return ((Object) (getFromJSONObject(jsonobject)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #90  <Method Integer getFromJSONObject(JSONObject)>
		//    3    5:areturn         
		}

		public Integer getFromSharedPreferences(SharedPreferences sharedpreferences)
		{
			return Integer.valueOf(sharedpreferences.getInt(((Flag) (zzaco)).getKey(), ((Integer)((Flag) (zzaco)).getDefault()).intValue()));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #15  <Field com.google.android.gms.flags.Flag$IntegerFlag zzaco>
		//    3    5:invokevirtual   #71  <Method String Flag.getKey()>
		//    4    8:aload_0         
		//    5    9:getfield        #15  <Field com.google.android.gms.flags.Flag$IntegerFlag zzaco>
		//    6   12:invokevirtual   #75  <Method Object Flag.getDefault()>
		//    7   15:checkcast       #33  <Class Integer>
		//    8   18:invokevirtual   #78  <Method int Integer.intValue()>
		//    9   21:invokeinterface #97  <Method int SharedPreferences.getInt(String, int)>
		//   10   26:invokestatic    #87  <Method Integer Integer.valueOf(int)>
		//   11   29:areturn         
		}

		public volatile Object getFromSharedPreferences(SharedPreferences sharedpreferences)
		{
			return ((Object) (getFromSharedPreferences(sharedpreferences)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #100 <Method Integer getFromSharedPreferences(SharedPreferences)>
		//    3    5:areturn         
		}

		public GservicesValue getGservicesValue()
		{
			return GservicesValue.value(((Flag) (zzaco)).getKey(), (Integer)((Flag) (zzaco)).getDefault());
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field com.google.android.gms.flags.Flag$IntegerFlag zzaco>
		//    2    4:invokevirtual   #71  <Method String Flag.getKey()>
		//    3    7:aload_0         
		//    4    8:getfield        #15  <Field com.google.android.gms.flags.Flag$IntegerFlag zzaco>
		//    5   11:invokevirtual   #75  <Method Object Flag.getDefault()>
		//    6   14:checkcast       #33  <Class Integer>
		//    7   17:invokestatic    #108 <Method GservicesValue GservicesValue.value(String, Integer)>
		//    8   20:areturn         
		}

		public void putInSharedPreferences(android.content.SharedPreferences.Editor editor, Integer integer)
		{
			editor.putInt(((Flag) (zzaco)).getKey(), integer.intValue());
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #15  <Field com.google.android.gms.flags.Flag$IntegerFlag zzaco>
		//    3    5:invokevirtual   #71  <Method String Flag.getKey()>
		//    4    8:aload_2         
		//    5    9:invokevirtual   #78  <Method int Integer.intValue()>
		//    6   12:invokeinterface #118 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
		//    7   17:pop             
		//    8   18:return          
		}

		public volatile void putInSharedPreferences(android.content.SharedPreferences.Editor editor, Object obj)
		{
			putInSharedPreferences(editor, (Integer)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #33  <Class Integer>
		//    4    6:invokevirtual   #121 <Method void putInSharedPreferences(android.content.SharedPreferences$Editor, Integer)>
		//    5    9:return          
		}

		public void putStringOverrideInSharedPreferences(android.content.SharedPreferences.Editor editor, String s)
		{
			editor.putInt(((Flag) (zzaco)).getKey(), Integer.parseInt(s));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #15  <Field com.google.android.gms.flags.Flag$IntegerFlag zzaco>
		//    3    5:invokevirtual   #71  <Method String Flag.getKey()>
		//    4    8:aload_2         
		//    5    9:invokestatic    #127 <Method int Integer.parseInt(String)>
		//    6   12:invokeinterface #118 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
		//    7   17:pop             
		//    8   18:return          
		}

		private final com.google.android.gms.flags.Flag.IntegerFlag zzaco;

		IntegerUtils(com.google.android.gms.flags.Flag.IntegerFlag integerflag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void DataUtils()>
			zzaco = integerflag;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #15  <Field com.google.android.gms.flags.Flag$IntegerFlag zzaco>
		//    5    9:return          
		}
	}

	public static class LongUtils extends DataUtils
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

		public void putInSharedPreferences(android.content.SharedPreferences.Editor editor, Long long1)
		{
			editor.putLong(((Flag) (zzacq)).getKey(), long1.longValue());
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

		public volatile void putInSharedPreferences(android.content.SharedPreferences.Editor editor, Object obj)
		{
			putInSharedPreferences(editor, (Long)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #33  <Class Long>
		//    4    6:invokevirtual   #122 <Method void putInSharedPreferences(android.content.SharedPreferences$Editor, Long)>
		//    5    9:return          
		}

		public void putStringOverrideInSharedPreferences(android.content.SharedPreferences.Editor editor, String s)
		{
			editor.putLong(((Flag) (zzacq)).getKey(), Long.parseLong(s));
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

		LongUtils(com.google.android.gms.flags.Flag.LongFlag longflag)
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

	public static class StringUtils extends DataUtils
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

		public volatile void putInSharedPreferences(android.content.SharedPreferences.Editor editor, Object obj)
		{
			putInSharedPreferences(editor, (String)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #33  <Class String>
		//    4    6:invokevirtual   #107 <Method void putInSharedPreferences(android.content.SharedPreferences$Editor, String)>
		//    5    9:return          
		}

		public void putInSharedPreferences(android.content.SharedPreferences.Editor editor, String s)
		{
			editor.putString(((Flag) (zzacs)).getKey(), s);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #15  <Field com.google.android.gms.flags.Flag$StringFlag zzacs>
		//    3    5:invokevirtual   #72  <Method String Flag.getKey()>
		//    4    8:aload_2         
		//    5    9:invokeinterface #113 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
		//    6   14:pop             
		//    7   15:return          
		}

		public void putStringOverrideInSharedPreferences(android.content.SharedPreferences.Editor editor, String s)
		{
			editor.putString(((Flag) (zzacs)).getKey(), String.valueOf(((Object) (s))));
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

		StringUtils(com.google.android.gms.flags.Flag.StringFlag stringflag)
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


	public DataUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	public static DataUtils forFlag(Flag flag)
	{
		if(flag instanceof com.google.android.gms.flags.Flag.BooleanFlag)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #26  <Class com.google.android.gms.flags.Flag$BooleanFlag>
	//*   2    4:ifeq            19
			return ((DataUtils) (new BooleanUtils((com.google.android.gms.flags.Flag.BooleanFlag)flag)));
	//    3    7:new             #7   <Class DataUtils$BooleanUtils>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:checkcast       #26  <Class com.google.android.gms.flags.Flag$BooleanFlag>
	//    7   15:invokespecial   #29  <Method void DataUtils$BooleanUtils(com.google.android.gms.flags.Flag$BooleanFlag)>
	//    8   18:areturn         
		if(flag instanceof com.google.android.gms.flags.Flag.IntegerFlag)
	//*   9   19:aload_0         
	//*  10   20:instanceof      #31  <Class com.google.android.gms.flags.Flag$IntegerFlag>
	//*  11   23:ifeq            38
			return ((DataUtils) (new IntegerUtils((com.google.android.gms.flags.Flag.IntegerFlag)flag)));
	//   12   26:new             #10  <Class DataUtils$IntegerUtils>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:checkcast       #31  <Class com.google.android.gms.flags.Flag$IntegerFlag>
	//   16   34:invokespecial   #34  <Method void DataUtils$IntegerUtils(com.google.android.gms.flags.Flag$IntegerFlag)>
	//   17   37:areturn         
		if(flag instanceof com.google.android.gms.flags.Flag.LongFlag)
	//*  18   38:aload_0         
	//*  19   39:instanceof      #36  <Class com.google.android.gms.flags.Flag$LongFlag>
	//*  20   42:ifeq            57
			return ((DataUtils) (new LongUtils((com.google.android.gms.flags.Flag.LongFlag)flag)));
	//   21   45:new             #13  <Class DataUtils$LongUtils>
	//   22   48:dup             
	//   23   49:aload_0         
	//   24   50:checkcast       #36  <Class com.google.android.gms.flags.Flag$LongFlag>
	//   25   53:invokespecial   #39  <Method void DataUtils$LongUtils(com.google.android.gms.flags.Flag$LongFlag)>
	//   26   56:areturn         
		if(flag instanceof com.google.android.gms.flags.Flag.StringFlag)
	//*  27   57:aload_0         
	//*  28   58:instanceof      #41  <Class com.google.android.gms.flags.Flag$StringFlag>
	//*  29   61:ifeq            76
			return ((DataUtils) (new StringUtils((com.google.android.gms.flags.Flag.StringFlag)flag)));
	//   30   64:new             #16  <Class DataUtils$StringUtils>
	//   31   67:dup             
	//   32   68:aload_0         
	//   33   69:checkcast       #41  <Class com.google.android.gms.flags.Flag$StringFlag>
	//   34   72:invokespecial   #44  <Method void DataUtils$StringUtils(com.google.android.gms.flags.Flag$StringFlag)>
	//   35   75:areturn         
		flag = ((Flag) (String.valueOf(((Object) (((Object) (flag)).getClass().getName())))));
	//   36   76:aload_0         
	//   37   77:invokevirtual   #48  <Method Class Object.getClass()>
	//   38   80:invokevirtual   #54  <Method String Class.getName()>
	//   39   83:invokestatic    #60  <Method String String.valueOf(Object)>
	//   40   86:astore_0        
		if(((String) (flag)).length() != 0)
	//*  41   87:aload_0         
	//*  42   88:invokevirtual   #64  <Method int String.length()>
	//*  43   91:ifeq            104
			flag = ((Flag) ("Unexpected flag type: ".concat(((String) (flag)))));
	//   44   94:ldc1            #66  <String "Unexpected flag type: ">
	//   45   96:aload_0         
	//   46   97:invokevirtual   #70  <Method String String.concat(String)>
	//   47  100:astore_0        
		else
	//*  48  101:goto            114
			flag = ((Flag) (new String("Unexpected flag type: ")));
	//   49  104:new             #56  <Class String>
	//   50  107:dup             
	//   51  108:ldc1            #66  <String "Unexpected flag type: ">
	//   52  110:invokespecial   #73  <Method void String(String)>
	//   53  113:astore_0        
		throw new IllegalArgumentException(((String) (flag)));
	//   54  114:new             #75  <Class IllegalArgumentException>
	//   55  117:dup             
	//   56  118:aload_0         
	//   57  119:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//   58  122:athrow          
	}

	public abstract Object getFromJSONObject(JSONObject jsonobject);

	public abstract Object getFromSharedPreferences(SharedPreferences sharedpreferences);

	public abstract GservicesValue getGservicesValue();

	public abstract void putInSharedPreferences(android.content.SharedPreferences.Editor editor, Object obj);

	public abstract void putStringOverrideInSharedPreferences(android.content.SharedPreferences.Editor editor, String s);
}
