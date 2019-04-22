// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.configuration;

import android.content.Context;
import android.content.pm.*;
import android.content.res.Resources;
import bo.app.*;
import com.appboy.enums.SdkFlavor;
import com.appboy.support.*;
import com.newrelic.agent.android.instrumentation.JSONArrayInstrumentation;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.appboy.configuration:
//			CachedConfigurationProvider

public class AppboyConfigurationProvider extends CachedConfigurationProvider
{
	static final class a extends Enum
	{

		public static a valueOf(String s)
		{
			return (a)Enum.valueOf(com/appboy/configuration/AppboyConfigurationProvider$a, s);
		//    0    0:ldc1            #2   <Class AppboyConfigurationProvider$a>
		//    1    2:aload_0         
		//    2    3:invokestatic    #36  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class AppboyConfigurationProvider$a>
		//    4    9:areturn         
		}

		public static a[] values()
		{
			return (a[])((a []) (c)).clone();
		//    0    0:getstatic       #28  <Field AppboyConfigurationProvider$a[] c>
		//    1    3:invokevirtual   #43  <Method Object _5B_Lcom.appboy.configuration.AppboyConfigurationProvider$a_3B_.clone()>
		//    2    6:checkcast       #39  <Class AppboyConfigurationProvider$a[]>
		//    3    9:areturn         
		}

		public static final a a;
		public static final a b;
		private static final a c[];

		static 
		{
			a = new a("SMALL", 0);
		//    0    0:new             #2   <Class AppboyConfigurationProvider$a>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "SMALL">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void AppboyConfigurationProvider$a(String, int)>
		//    5   10:putstatic       #22  <Field AppboyConfigurationProvider$a a>
			b = new a("LARGE", 1);
		//    6   13:new             #2   <Class AppboyConfigurationProvider$a>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "LARGE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void AppboyConfigurationProvider$a(String, int)>
		//   11   23:putstatic       #26  <Field AppboyConfigurationProvider$a b>
			c = (new a[] {
				a, b
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       a[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field AppboyConfigurationProvider$a a>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #26  <Field AppboyConfigurationProvider$a b>
		//   21   41:aastore         
		//   22   42:putstatic       #28  <Field AppboyConfigurationProvider$a[] c>
		//*  23   45:return          
		}

		private a(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #30  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public AppboyConfigurationProvider(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void CachedConfigurationProvider(Context)>
		b = context;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #28  <Field Context b>
	//    6   10:return          
	}

	private int a(a a1)
	{
		if(a1.equals(((Object) (a.b))))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #32  <Field AppboyConfigurationProvider$a AppboyConfigurationProvider$a.b>
	//*   2    4:invokevirtual   #36  <Method boolean AppboyConfigurationProvider$a.equals(Object)>
	//*   3    7:ifeq            16
			a1 = "com_appboy_push_large_notification_icon";
	//    4   10:ldc1            #38  <String "com_appboy_push_large_notification_icon">
	//    5   12:astore_1        
		else
	//*   6   13:goto            19
			a1 = "com_appboy_push_small_notification_icon";
	//    7   16:ldc1            #40  <String "com_appboy_push_small_notification_icon">
	//    8   18:astore_1        
		if(mConfigurationCache.containsKey(((Object) (a1))))
	//*   9   19:aload_0         
	//*  10   20:getfield        #44  <Field Map mConfigurationCache>
	//*  11   23:aload_1         
	//*  12   24:invokeinterface #49  <Method boolean Map.containsKey(Object)>
	//*  13   29:ifeq            49
			return ((Integer)mConfigurationCache.get(((Object) (a1)))).intValue();
	//   14   32:aload_0         
	//   15   33:getfield        #44  <Field Map mConfigurationCache>
	//   16   36:aload_1         
	//   17   37:invokeinterface #53  <Method Object Map.get(Object)>
	//   18   42:checkcast       #55  <Class Integer>
	//   19   45:invokevirtual   #59  <Method int Integer.intValue()>
	//   20   48:ireturn         
		if(mRuntimeAppConfigurationProvider.a(((String) (a1))))
	//*  21   49:aload_0         
	//*  22   50:getfield        #63  <Field m mRuntimeAppConfigurationProvider>
	//*  23   53:aload_1         
	//*  24   54:invokevirtual   #68  <Method boolean m.a(String)>
	//*  25   57:ifeq            164
		{
			String s = mRuntimeAppConfigurationProvider.a(((String) (a1)), "");
	//   26   60:aload_0         
	//   27   61:getfield        #63  <Field m mRuntimeAppConfigurationProvider>
	//   28   64:aload_1         
	//   29   65:ldc1            #70  <String "">
	//   30   67:invokevirtual   #73  <Method String m.a(String, String)>
	//   31   70:astore_3        
			int i = b.getResources().getIdentifier(s, "drawable", PackageUtils.getResourcePackageName(b));
	//   32   71:aload_0         
	//   33   72:getfield        #28  <Field Context b>
	//   34   75:invokevirtual   #79  <Method Resources Context.getResources()>
	//   35   78:aload_3         
	//   36   79:ldc1            #81  <String "drawable">
	//   37   81:aload_0         
	//   38   82:getfield        #28  <Field Context b>
	//   39   85:invokestatic    #87  <Method String PackageUtils.getResourcePackageName(Context)>
	//   40   88:invokevirtual   #93  <Method int Resources.getIdentifier(String, String, String)>
	//   41   91:istore_2        
			mConfigurationCache.put(((Object) (a1)), ((Object) (Integer.valueOf(i))));
	//   42   92:aload_0         
	//   43   93:getfield        #44  <Field Map mConfigurationCache>
	//   44   96:aload_1         
	//   45   97:iload_2         
	//   46   98:invokestatic    #97  <Method Integer Integer.valueOf(int)>
	//   47  101:invokeinterface #101 <Method Object Map.put(Object, Object)>
	//   48  106:pop             
			String s1 = a;
	//   49  107:getstatic       #21  <Field String a>
	//   50  110:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   51  112:new             #103 <Class StringBuilder>
	//   52  115:dup             
	//   53  116:invokespecial   #105 <Method void StringBuilder()>
	//   54  119:astore          5
			stringbuilder.append("Using runtime override value for key: ");
	//   55  121:aload           5
	//   56  123:ldc1            #107 <String "Using runtime override value for key: ">
	//   57  125:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   58  128:pop             
			stringbuilder.append(((String) (a1)));
	//   59  129:aload           5
	//   60  131:aload_1         
	//   61  132:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   62  135:pop             
			stringbuilder.append(" and value: ");
	//   63  136:aload           5
	//   64  138:ldc1            #113 <String " and value: ">
	//   65  140:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   66  143:pop             
			stringbuilder.append(s);
	//   67  144:aload           5
	//   68  146:aload_3         
	//   69  147:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   70  150:pop             
			AppboyLogger.d(s1, stringbuilder.toString());
	//   71  151:aload           4
	//   72  153:aload           5
	//   73  155:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   74  158:invokestatic    #121 <Method int AppboyLogger.d(String, String)>
	//   75  161:pop             
			return i;
	//   76  162:iload_2         
	//   77  163:ireturn         
		} else
		{
			int j = b.getResources().getIdentifier(((String) (a1)), "drawable", PackageUtils.getResourcePackageName(b));
	//   78  164:aload_0         
	//   79  165:getfield        #28  <Field Context b>
	//   80  168:invokevirtual   #79  <Method Resources Context.getResources()>
	//   81  171:aload_1         
	//   82  172:ldc1            #81  <String "drawable">
	//   83  174:aload_0         
	//   84  175:getfield        #28  <Field Context b>
	//   85  178:invokestatic    #87  <Method String PackageUtils.getResourcePackageName(Context)>
	//   86  181:invokevirtual   #93  <Method int Resources.getIdentifier(String, String, String)>
	//   87  184:istore_2        
			mConfigurationCache.put(((Object) (a1)), ((Object) (Integer.valueOf(j))));
	//   88  185:aload_0         
	//   89  186:getfield        #44  <Field Map mConfigurationCache>
	//   90  189:aload_1         
	//   91  190:iload_2         
	//   92  191:invokestatic    #97  <Method Integer Integer.valueOf(int)>
	//   93  194:invokeinterface #101 <Method Object Map.put(Object, Object)>
	//   94  199:pop             
			return j;
	//   95  200:iload_2         
	//   96  201:ireturn         
		}
	}

	private String a()
	{
		return getStringValue("com_appboy_server_target", "PROD");
	//    0    0:aload_0         
	//    1    1:ldc1            #123 <String "com_appboy_server_target">
	//    2    3:ldc1            #125 <String "PROD">
	//    3    5:invokevirtual   #128 <Method String getStringValue(String, String)>
	//    4    8:areturn         
	}

	public ch getAppboyApiKey()
	{
		ch ch2 = (ch)mConfigurationCache.get("com_appboy_api_key");
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Map mConfigurationCache>
	//    2    4:ldc1            #132 <String "com_appboy_api_key">
	//    3    6:invokeinterface #53  <Method Object Map.get(Object)>
	//    4   11:checkcast       #134 <Class ch>
	//    5   14:astore_3        
		ch ch1 = ch2;
	//    6   15:aload_3         
	//    7   16:astore_2        
		if(ch2 == null)
	//*   8   17:aload_3         
	//*   9   18:ifnonnull       108
		{
			String s = mRuntimeAppConfigurationProvider.a("com_appboy_api_key", ((String) (null)));
	//   10   21:aload_0         
	//   11   22:getfield        #63  <Field m mRuntimeAppConfigurationProvider>
	//   12   25:ldc1            #132 <String "com_appboy_api_key">
	//   13   27:aconst_null     
	//   14   28:invokevirtual   #73  <Method String m.a(String, String)>
	//   15   31:astore_1        
			if(s != null)
	//*  16   32:aload_1         
	//*  17   33:ifnull          48
			{
				AppboyLogger.i(a, "Found an override api key. Using it to configure Appboy.");
	//   18   36:getstatic       #21  <Field String a>
	//   19   39:ldc1            #136 <String "Found an override api key. Using it to configure Appboy.">
	//   20   41:invokestatic    #139 <Method int AppboyLogger.i(String, String)>
	//   21   44:pop             
			} else
	//*  22   45:goto            80
			{
				s = getAppboyApiKeyStringFromLocaleMapping(Locale.getDefault());
	//   23   48:aload_0         
	//   24   49:invokestatic    #145 <Method Locale Locale.getDefault()>
	//   25   52:invokevirtual   #149 <Method String getAppboyApiKeyStringFromLocaleMapping(Locale)>
	//   26   55:astore_1        
				if(s != null)
	//*  27   56:aload_1         
	//*  28   57:ifnull          72
					AppboyLogger.i(a, "Found a locale that matches the current locale in appboy.xml. Using the associated api key");
	//   29   60:getstatic       #21  <Field String a>
	//   30   63:ldc1            #151 <String "Found a locale that matches the current locale in appboy.xml. Using the associated api key">
	//   31   65:invokestatic    #139 <Method int AppboyLogger.i(String, String)>
	//   32   68:pop             
				else
	//*  33   69:goto            80
					s = readStringResourceValue("com_appboy_api_key", ((String) (null)));
	//   34   72:aload_0         
	//   35   73:ldc1            #132 <String "com_appboy_api_key">
	//   36   75:aconst_null     
	//   37   76:invokevirtual   #154 <Method String readStringResourceValue(String, String)>
	//   38   79:astore_1        
			}
			ch1 = ch2;
	//   39   80:aload_3         
	//   40   81:astore_2        
			if(s != null)
	//*  41   82:aload_1         
	//*  42   83:ifnull          108
			{
				ch1 = new ch(s);
	//   43   86:new             #134 <Class ch>
	//   44   89:dup             
	//   45   90:aload_1         
	//   46   91:invokespecial   #157 <Method void ch(String)>
	//   47   94:astore_2        
				mConfigurationCache.put("com_appboy_api_key", ((Object) (ch1)));
	//   48   95:aload_0         
	//   49   96:getfield        #44  <Field Map mConfigurationCache>
	//   50   99:ldc1            #132 <String "com_appboy_api_key">
	//   51  101:aload_2         
	//   52  102:invokeinterface #101 <Method Object Map.put(Object, Object)>
	//   53  107:pop             
			}
		}
		if(ch1 != null)
	//*  54  108:aload_2         
	//*  55  109:ifnull          114
		{
			return ch1;
	//   56  112:aload_2         
	//   57  113:areturn         
		} else
		{
			AppboyLogger.e(a, "****************************************************");
	//   58  114:getstatic       #21  <Field String a>
	//   59  117:ldc1            #159 <String "****************************************************">
	//   60  119:invokestatic    #162 <Method int AppboyLogger.e(String, String)>
	//   61  122:pop             
			AppboyLogger.e(a, "**                                                **");
	//   62  123:getstatic       #21  <Field String a>
	//   63  126:ldc1            #164 <String "**                                                **">
	//   64  128:invokestatic    #162 <Method int AppboyLogger.e(String, String)>
	//   65  131:pop             
			AppboyLogger.e(a, "**                 !! WARNING !!                  **");
	//   66  132:getstatic       #21  <Field String a>
	//   67  135:ldc1            #166 <String "**                 !! WARNING !!                  **">
	//   68  137:invokestatic    #162 <Method int AppboyLogger.e(String, String)>
	//   69  140:pop             
			AppboyLogger.e(a, "**                                                **");
	//   70  141:getstatic       #21  <Field String a>
	//   71  144:ldc1            #164 <String "**                                                **">
	//   72  146:invokestatic    #162 <Method int AppboyLogger.e(String, String)>
	//   73  149:pop             
			AppboyLogger.e(a, "**     No API key set in res/values/appboy.xml    **");
	//   74  150:getstatic       #21  <Field String a>
	//   75  153:ldc1            #168 <String "**     No API key set in res/values/appboy.xml    **">
	//   76  155:invokestatic    #162 <Method int AppboyLogger.e(String, String)>
	//   77  158:pop             
			AppboyLogger.e(a, "** No cached API Key found from Appboy.configure  **");
	//   78  159:getstatic       #21  <Field String a>
	//   79  162:ldc1            #170 <String "** No cached API Key found from Appboy.configure  **">
	//   80  164:invokestatic    #162 <Method int AppboyLogger.e(String, String)>
	//   81  167:pop             
			AppboyLogger.e(a, "**          Braze functionality disabled          **");
	//   82  168:getstatic       #21  <Field String a>
	//   83  171:ldc1            #172 <String "**          Braze functionality disabled          **">
	//   84  173:invokestatic    #162 <Method int AppboyLogger.e(String, String)>
	//   85  176:pop             
			AppboyLogger.e(a, "**                                                **");
	//   86  177:getstatic       #21  <Field String a>
	//   87  180:ldc1            #164 <String "**                                                **">
	//   88  182:invokestatic    #162 <Method int AppboyLogger.e(String, String)>
	//   89  185:pop             
			AppboyLogger.e(a, "****************************************************");
	//   90  186:getstatic       #21  <Field String a>
	//   91  189:ldc1            #159 <String "****************************************************">
	//   92  191:invokestatic    #162 <Method int AppboyLogger.e(String, String)>
	//   93  194:pop             
			throw new RuntimeException("Unable to read the Braze API key from the res/values/appboy.xml file. See log for more details.");
	//   94  195:new             #174 <Class RuntimeException>
	//   95  198:dup             
	//   96  199:ldc1            #176 <String "Unable to read the Braze API key from the res/values/appboy.xml file. See log for more details.">
	//   97  201:invokespecial   #177 <Method void RuntimeException(String)>
	//   98  204:athrow          
		}
	}

	public String getAppboyApiKeyStringFromLocaleMapping(Locale locale)
	{
		if(locale == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			AppboyLogger.d(a, "Passed in a null locale to match.");
	//    2    4:getstatic       #21  <Field String a>
	//    3    7:ldc1            #181 <String "Passed in a null locale to match.">
	//    4    9:invokestatic    #121 <Method int AppboyLogger.d(String, String)>
	//    5   12:pop             
			return null;
	//    6   13:aconst_null     
	//    7   14:areturn         
		}
		if(!mRuntimeAppConfigurationProvider.a("com_appboy_locale_api_key_map")) goto _L2; else goto _L1
	//    8   15:aload_0         
	//    9   16:getfield        #63  <Field m mRuntimeAppConfigurationProvider>
	//   10   19:ldc1            #183 <String "com_appboy_locale_api_key_map">
	//   11   21:invokevirtual   #68  <Method boolean m.a(String)>
	//   12   24:ifeq            116
_L1:
		String s = mRuntimeAppConfigurationProvider.a("com_appboy_locale_api_key_map", ((String) (null)));
	//   13   27:aload_0         
	//   14   28:getfield        #63  <Field m mRuntimeAppConfigurationProvider>
	//   15   31:ldc1            #183 <String "com_appboy_locale_api_key_map">
	//   16   33:aconst_null     
	//   17   34:invokevirtual   #73  <Method String m.a(String, String)>
	//   18   37:astore          5
		String as1[];
		JSONArray jsonarray;
		jsonarray = JSONArrayInstrumentation.init(s);
	//   19   39:aload           5
	//   20   41:invokestatic    #189 <Method JSONArray JSONArrayInstrumentation.init(String)>
	//   21   44:astore          7
		as1 = new String[jsonarray.length()];
	//   22   46:aload           7
	//   23   48:invokevirtual   #194 <Method int JSONArray.length()>
	//   24   51:anewarray       String[]
	//   25   54:astore          6
		int i = 0;
	//   26   56:iconst_0        
	//   27   57:istore_2        
_L4:
		String as[] = as1;
	//   28   58:aload           6
	//   29   60:astore          5
		if(i >= jsonarray.length())
			break; /* Loop/switch isn't completed */
	//   30   62:iload_2         
	//   31   63:aload           7
	//   32   65:invokevirtual   #194 <Method int JSONArray.length()>
	//   33   68:icmpge          125
		as1[i] = jsonarray.getString(i);
	//   34   71:aload           6
	//   35   73:iload_2         
	//   36   74:aload           7
	//   37   76:iload_2         
	//   38   77:invokevirtual   #200 <Method String JSONArray.getString(int)>
	//   39   80:aastore         
		i++;
	//   40   81:iload_2         
	//   41   82:iconst_1        
	//   42   83:iadd            
	//   43   84:istore_2        
		if(true) goto _L4; else goto _L3
	//   44   85:goto            58
		JSONException jsonexception;
		jsonexception;
	//   45   88:astore          7
		as = as1;
	//   46   90:aload           6
	//   47   92:astore          5
		break MISSING_BLOCK_LABEL_102;
	//   48   94:goto            102
		jsonexception;
	//   49   97:astore          7
		as = null;
	//   50   99:aconst_null     
	//   51  100:astore          5
		AppboyLogger.e(a, "Caught exception creating locale to api key mapping from override cache", ((Throwable) (jsonexception)));
	//   52  102:getstatic       #21  <Field String a>
	//   53  105:ldc1            #202 <String "Caught exception creating locale to api key mapping from override cache">
	//   54  107:aload           7
	//   55  109:invokestatic    #205 <Method int AppboyLogger.e(String, String, Throwable)>
	//   56  112:pop             
		  goto _L3
	//*  57  113:goto            125
_L2:
		as = readStringArrayResourceValue("com_appboy_locale_api_key_map", ((String []) (null)));
	//   58  116:aload_0         
	//   59  117:ldc1            #183 <String "com_appboy_locale_api_key_map">
	//   60  119:aconst_null     
	//   61  120:invokevirtual   #209 <Method String[] readStringArrayResourceValue(String, String[])>
	//   62  123:astore          5
_L3:
label0:
		{
			if(as == null)
	//*  63  125:aload           5
	//*  64  127:ifnonnull       141
			{
				AppboyLogger.d(a, "Locale to api key mappings not present in XML.");
	//   65  130:getstatic       #21  <Field String a>
	//   66  133:ldc1            #211 <String "Locale to api key mappings not present in XML.">
	//   67  135:invokestatic    #121 <Method int AppboyLogger.d(String, String)>
	//   68  138:pop             
				return null;
	//   69  139:aconst_null     
	//   70  140:areturn         
			}
			int k = as.length;
	//   71  141:aload           5
	//   72  143:arraylength     
	//   73  144:istore_3        
			int j = 0;
	//   74  145:iconst_0        
	//   75  146:istore_2        
			String as2[];
			do
			{
				if(j >= k)
					break label0;
	//   76  147:iload_2         
	//   77  148:iload_3         
	//   78  149:icmpge          264
				String s1 = as[j];
	//   79  152:aload           5
	//   80  154:iload_2         
	//   81  155:aaload          
	//   82  156:astore          6
				if(StringUtils.countOccurrences(s1, ",") == 1)
	//*  83  158:aload           6
	//*  84  160:ldc1            #213 <String ",">
	//*  85  162:invokestatic    #218 <Method int StringUtils.countOccurrences(String, String)>
	//*  86  165:iconst_1        
	//*  87  166:icmpeq          172
	//*  88  169:goto            249
				{
					as2 = s1.split(",");
	//   89  172:aload           6
	//   90  174:ldc1            #213 <String ",">
	//   91  176:invokevirtual   #222 <Method String[] String.split(String)>
	//   92  179:astore          6
					if(as2.length == 2)
	//*  93  181:aload           6
	//*  94  183:arraylength     
	//*  95  184:iconst_2        
	//*  96  185:icmpeq          191
	//*  97  188:goto            249
					{
						String s2 = as2[0].trim().toLowerCase(Locale.US);
	//   98  191:aload           6
	//   99  193:iconst_0        
	//  100  194:aaload          
	//  101  195:invokevirtual   #225 <Method String String.trim()>
	//  102  198:getstatic       #229 <Field Locale Locale.US>
	//  103  201:invokevirtual   #232 <Method String String.toLowerCase(Locale)>
	//  104  204:astore          7
						boolean flag = s2.equals(((Object) (locale.toString().toLowerCase(Locale.US))));
	//  105  206:aload           7
	//  106  208:aload_1         
	//  107  209:invokevirtual   #233 <Method String Locale.toString()>
	//  108  212:getstatic       #229 <Field Locale Locale.US>
	//  109  215:invokevirtual   #232 <Method String String.toLowerCase(Locale)>
	//  110  218:invokevirtual   #234 <Method boolean String.equals(Object)>
	//  111  221:istore          4
						if(s2.equals(((Object) (locale.getCountry().toLowerCase(Locale.US)))) || flag)
	//* 112  223:aload           7
	//* 113  225:aload_1         
	//* 114  226:invokevirtual   #237 <Method String Locale.getCountry()>
	//* 115  229:getstatic       #229 <Field Locale Locale.US>
	//* 116  232:invokevirtual   #232 <Method String String.toLowerCase(Locale)>
	//* 117  235:invokevirtual   #234 <Method boolean String.equals(Object)>
	//* 118  238:ifne            256
	//* 119  241:iload           4
	//* 120  243:ifeq            249
							break;
	//  121  246:goto            256
					}
				}
				j++;
	//  122  249:iload_2         
	//  123  250:iconst_1        
	//  124  251:iadd            
	//  125  252:istore_2        
			} while(true);
	//  126  253:goto            147
			return as2[1].trim();
	//  127  256:aload           6
	//  128  258:iconst_1        
	//  129  259:aaload          
	//  130  260:invokevirtual   #225 <Method String String.trim()>
	//  131  263:areturn         
		}
		return null;
	//  132  264:aconst_null     
	//  133  265:areturn         
	}

	public int getApplicationIconResourceId()
	{
		int i;
		String s;
		if(mConfigurationCache.containsKey("application_icon"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field Map mConfigurationCache>
	//*   2    4:ldc1            #242 <String "application_icon">
	//*   3    6:invokeinterface #49  <Method boolean Map.containsKey(Object)>
	//*   4   11:ifeq            32
			return ((Integer)mConfigurationCache.get("application_icon")).intValue();
	//    5   14:aload_0         
	//    6   15:getfield        #44  <Field Map mConfigurationCache>
	//    7   18:ldc1            #242 <String "application_icon">
	//    8   20:invokeinterface #53  <Method Object Map.get(Object)>
	//    9   25:checkcast       #55  <Class Integer>
	//   10   28:invokevirtual   #59  <Method int Integer.intValue()>
	//   11   31:ireturn         
		s = b.getPackageName();
	//   12   32:aload_0         
	//   13   33:getfield        #28  <Field Context b>
	//   14   36:invokevirtual   #245 <Method String Context.getPackageName()>
	//   15   39:astore_3        
		i = 0;
	//   16   40:iconst_0        
	//   17   41:istore_1        
		int j = b.getPackageManager().getApplicationInfo(s, 0).icon;
	//   18   42:aload_0         
	//   19   43:getfield        #28  <Field Context b>
	//   20   46:invokevirtual   #249 <Method PackageManager Context.getPackageManager()>
	//   21   49:aload_3         
	//   22   50:iconst_0        
	//   23   51:invokevirtual   #255 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   24   54:getfield        #261 <Field int ApplicationInfo.icon>
	//   25   57:istore_2        
		i = j;
	//   26   58:iload_2         
	//   27   59:istore_1        
		  goto _L1
	//*  28   60:goto            172
_L2:
		String s1 = a;
	//   29   63:getstatic       #21  <Field String a>
	//   30   66:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   31   68:new             #103 <Class StringBuilder>
	//   32   71:dup             
	//   33   72:invokespecial   #105 <Method void StringBuilder()>
	//   34   75:astore          5
		stringbuilder.append("Cannot find package named ");
	//   35   77:aload           5
	//   36   79:ldc2            #263 <String "Cannot find package named ">
	//   37   82:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   38   85:pop             
		stringbuilder.append(s);
	//   39   86:aload           5
	//   40   88:aload_3         
	//   41   89:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   42   92:pop             
		AppboyLogger.e(s1, stringbuilder.toString());
	//   43   93:aload           4
	//   44   95:aload           5
	//   45   97:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   46  100:invokestatic    #162 <Method int AppboyLogger.e(String, String)>
	//   47  103:pop             
		j = b.getPackageManager().getApplicationInfo(b.getPackageName(), 0).icon;
	//   48  104:aload_0         
	//   49  105:getfield        #28  <Field Context b>
	//   50  108:invokevirtual   #249 <Method PackageManager Context.getPackageManager()>
	//   51  111:aload_0         
	//   52  112:getfield        #28  <Field Context b>
	//   53  115:invokevirtual   #245 <Method String Context.getPackageName()>
	//   54  118:iconst_0        
	//   55  119:invokevirtual   #255 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   56  122:getfield        #261 <Field int ApplicationInfo.icon>
	//   57  125:istore_2        
		i = j;
	//   58  126:iload_2         
	//   59  127:istore_1        
		  goto _L1
	//*  60  128:goto            172
_L3:
		String s2 = a;
	//   61  131:getstatic       #21  <Field String a>
	//   62  134:astore          4
		StringBuilder stringbuilder1 = new StringBuilder();
	//   63  136:new             #103 <Class StringBuilder>
	//   64  139:dup             
	//   65  140:invokespecial   #105 <Method void StringBuilder()>
	//   66  143:astore          5
		stringbuilder1.append("Cannot find package named ");
	//   67  145:aload           5
	//   68  147:ldc2            #263 <String "Cannot find package named ">
	//   69  150:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   70  153:pop             
		stringbuilder1.append(s);
	//   71  154:aload           5
	//   72  156:aload_3         
	//   73  157:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   74  160:pop             
		AppboyLogger.e(s2, stringbuilder1.toString());
	//   75  161:aload           4
	//   76  163:aload           5
	//   77  165:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   78  168:invokestatic    #162 <Method int AppboyLogger.e(String, String)>
	//   79  171:pop             
_L1:
		mConfigurationCache.put("application_icon", ((Object) (Integer.valueOf(i))));
	//   80  172:aload_0         
	//   81  173:getfield        #44  <Field Map mConfigurationCache>
	//   82  176:ldc1            #242 <String "application_icon">
	//   83  178:iload_1         
	//   84  179:invokestatic    #97  <Method Integer Integer.valueOf(int)>
	//   85  182:invokeinterface #101 <Method Object Map.put(Object, Object)>
	//   86  187:pop             
		return i;
	//   87  188:iload_1         
	//   88  189:ireturn         
		android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
		namenotfoundexception;
	//   89  190:astore          4
		  goto _L2
	//*  90  192:goto            63
		namenotfoundexception;
	//   91  195:astore          4
		  goto _L3
	//*  92  197:goto            131
	}

	public String getBaseUrlForRequests()
	{
		if("STAGING".equals(((Object) (a().toUpperCase(Locale.US)))))
	//*   0    0:ldc2            #266 <String "STAGING">
	//*   1    3:aload_0         
	//*   2    4:invokespecial   #268 <Method String a()>
	//*   3    7:getstatic       #229 <Field Locale Locale.US>
	//*   4   10:invokevirtual   #271 <Method String String.toUpperCase(Locale)>
	//*   5   13:invokevirtual   #234 <Method boolean String.equals(Object)>
	//*   6   16:ifeq            23
			return "https://sondheim.appboy.com/api/v3/";
	//    7   19:ldc2            #273 <String "https://sondheim.appboy.com/api/v3/">
	//    8   22:areturn         
		else
			return "https://dev.appboy.com/api/v3/";
	//    9   23:ldc2            #275 <String "https://dev.appboy.com/api/v3/">
	//   10   26:areturn         
	}

	public String getCustomEndpoint()
	{
		return getStringValue("com_appboy_custom_endpoint", ((String) (null)));
	//    0    0:aload_0         
	//    1    1:ldc2            #278 <String "com_appboy_custom_endpoint">
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #128 <Method String getStringValue(String, String)>
	//    4    8:areturn         
	}

	public int getDefaultNotificationAccentColor()
	{
		return getIntValue("com_appboy_default_notification_accent_color", 0);
	//    0    0:aload_0         
	//    1    1:ldc2            #284 <String "com_appboy_default_notification_accent_color">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #288 <Method int getIntValue(String, int)>
	//    4    8:ireturn         
	}

	public String getDefaultNotificationChannelDescription()
	{
		return getStringValue("com_appboy_default_notification_channel_description", "");
	//    0    0:aload_0         
	//    1    1:ldc2            #292 <String "com_appboy_default_notification_channel_description">
	//    2    4:ldc1            #70  <String "">
	//    3    6:invokevirtual   #128 <Method String getStringValue(String, String)>
	//    4    9:areturn         
	}

	public String getDefaultNotificationChannelName()
	{
		return getStringValue("com_appboy_default_notification_channel_name", "General");
	//    0    0:aload_0         
	//    1    1:ldc2            #295 <String "com_appboy_default_notification_channel_name">
	//    2    4:ldc2            #297 <String "General">
	//    3    7:invokevirtual   #128 <Method String getStringValue(String, String)>
	//    4   10:areturn         
	}

	public EnumSet getDeviceObjectWhitelist()
	{
		if(mConfigurationCache.containsKey("com_appboy_device_object_whitelist"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field Map mConfigurationCache>
	//*   2    4:ldc2            #301 <String "com_appboy_device_object_whitelist">
	//*   3    7:invokeinterface #49  <Method boolean Map.containsKey(Object)>
	//*   4   12:ifeq            31
		{
			return (EnumSet)mConfigurationCache.get("com_appboy_device_object_whitelist");
	//    5   15:aload_0         
	//    6   16:getfield        #44  <Field Map mConfigurationCache>
	//    7   19:ldc2            #301 <String "com_appboy_device_object_whitelist">
	//    8   22:invokeinterface #53  <Method Object Map.get(Object)>
	//    9   27:checkcast       #303 <Class EnumSet>
	//   10   30:areturn         
		} else
		{
			EnumSet enumset = ec.a(bo/app/v, getStringSetValue("com_appboy_device_object_whitelist", ((java.util.Set) (new HashSet()))));
	//   11   31:ldc2            #305 <Class v>
	//   12   34:aload_0         
	//   13   35:ldc2            #301 <String "com_appboy_device_object_whitelist">
	//   14   38:new             #307 <Class HashSet>
	//   15   41:dup             
	//   16   42:invokespecial   #308 <Method void HashSet()>
	//   17   45:invokevirtual   #312 <Method java.util.Set getStringSetValue(String, java.util.Set)>
	//   18   48:invokestatic    #317 <Method EnumSet ec.a(Class, java.util.Set)>
	//   19   51:astore_1        
			mConfigurationCache.put("com_appboy_device_object_whitelist", ((Object) (enumset)));
	//   20   52:aload_0         
	//   21   53:getfield        #44  <Field Map mConfigurationCache>
	//   22   56:ldc2            #301 <String "com_appboy_device_object_whitelist">
	//   23   59:aload_1         
	//   24   60:invokeinterface #101 <Method Object Map.put(Object, Object)>
	//   25   65:pop             
			return enumset;
	//   26   66:aload_1         
	//   27   67:areturn         
		}
	}

	public String getFirebaseCloudMessagingSenderIdKey()
	{
		return getStringValue("com_appboy_firebase_cloud_messaging_sender_id", ((String) (null)));
	//    0    0:aload_0         
	//    1    1:ldc2            #322 <String "com_appboy_firebase_cloud_messaging_sender_id">
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #128 <Method String getStringValue(String, String)>
	//    4    8:areturn         
	}

	public boolean getHandlePushDeepLinksAutomatically()
	{
		return getBooleanValue("com_appboy_handle_push_deep_links_automatically", false);
	//    0    0:aload_0         
	//    1    1:ldc2            #326 <String "com_appboy_handle_push_deep_links_automatically">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #330 <Method boolean getBooleanValue(String, boolean)>
	//    4    8:ireturn         
	}

	public boolean getIsDeviceObjectWhitelistEnabled()
	{
		return getBooleanValue("com_appboy_device_object_whitelisting_enabled", false);
	//    0    0:aload_0         
	//    1    1:ldc2            #333 <String "com_appboy_device_object_whitelisting_enabled">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #330 <Method boolean getBooleanValue(String, boolean)>
	//    4    8:ireturn         
	}

	public boolean getIsInAppMessageAccessibilityExclusiveModeEnabled()
	{
		return getBooleanValue("com_appboy_device_in_app_message_accessibility_exclusive_mode_enabled", false);
	//    0    0:aload_0         
	//    1    1:ldc2            #336 <String "com_appboy_device_in_app_message_accessibility_exclusive_mode_enabled">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #330 <Method boolean getBooleanValue(String, boolean)>
	//    4    8:ireturn         
	}

	public boolean getIsNewsfeedVisualIndicatorOn()
	{
		return getBooleanValue("com_appboy_newsfeed_unread_visual_indicator_on", true);
	//    0    0:aload_0         
	//    1    1:ldc2            #339 <String "com_appboy_newsfeed_unread_visual_indicator_on">
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #330 <Method boolean getBooleanValue(String, boolean)>
	//    4    8:ireturn         
	}

	public boolean getIsNotificationsEnabledTrackingOn()
	{
		return getBooleanValue("com_appboy_notifications_enabled_tracking_on", false);
	//    0    0:aload_0         
	//    1    1:ldc2            #343 <String "com_appboy_notifications_enabled_tracking_on">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #330 <Method boolean getBooleanValue(String, boolean)>
	//    4    8:ireturn         
	}

	public boolean getIsPushDeepLinkBackStackActivityEnabled()
	{
		return getBooleanValue("com_appboy_push_deep_link_back_stack_activity_enabled", true);
	//    0    0:aload_0         
	//    1    1:ldc2            #347 <String "com_appboy_push_deep_link_back_stack_activity_enabled">
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #330 <Method boolean getBooleanValue(String, boolean)>
	//    4    8:ireturn         
	}

	public boolean getIsPushWakeScreenForNotificationEnabled()
	{
		return getBooleanValue("com_appboy_push_wake_screen_for_notification_enabled", true);
	//    0    0:aload_0         
	//    1    1:ldc2            #350 <String "com_appboy_push_wake_screen_for_notification_enabled">
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #330 <Method boolean getBooleanValue(String, boolean)>
	//    4    8:ireturn         
	}

	public boolean getIsSessionStartBasedTimeoutEnabled()
	{
		return getBooleanValue("com_appboy_session_start_based_timeout_enabled", false);
	//    0    0:aload_0         
	//    1    1:ldc2            #353 <String "com_appboy_session_start_based_timeout_enabled">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #330 <Method boolean getBooleanValue(String, boolean)>
	//    4    8:ireturn         
	}

	public int getLargeNotificationIconResourceId()
	{
		return a(a.b);
	//    0    0:aload_0         
	//    1    1:getstatic       #32  <Field AppboyConfigurationProvider$a AppboyConfigurationProvider$a.b>
	//    2    4:invokespecial   #356 <Method int a(AppboyConfigurationProvider$a)>
	//    3    7:ireturn         
	}

	public String getPushDeepLinkBackStackActivityClassName()
	{
		return getStringValue("com_appboy_push_deep_link_back_stack_activity_class_name", "");
	//    0    0:aload_0         
	//    1    1:ldc2            #359 <String "com_appboy_push_deep_link_back_stack_activity_class_name">
	//    2    4:ldc1            #70  <String "">
	//    3    6:invokevirtual   #128 <Method String getStringValue(String, String)>
	//    4    9:areturn         
	}

	public SdkFlavor getSdkFlavor()
	{
		Object obj = ((Object) (getStringValue("com_appboy_sdk_flavor", ((String) (null)))));
	//    0    0:aload_0         
	//    1    1:ldc2            #365 <String "com_appboy_sdk_flavor">
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #128 <Method String getStringValue(String, String)>
	//    4    8:astore_1        
		if(StringUtils.isNullOrBlank(((String) (obj))))
	//*   5    9:aload_1         
	//*   6   10:invokestatic    #368 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   7   13:ifeq            18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		try
		{
			obj = ((Object) (SdkFlavor.valueOf(((String) (obj)).toUpperCase(Locale.US))));
	//   10   18:aload_1         
	//   11   19:getstatic       #229 <Field Locale Locale.US>
	//   12   22:invokevirtual   #271 <Method String String.toUpperCase(Locale)>
	//   13   25:invokestatic    #373 <Method SdkFlavor SdkFlavor.valueOf(String)>
	//   14   28:astore_1        
		}
	//*  15   29:aload_1         
	//*  16   30:areturn         
		catch(Exception exception)
	//*  17   31:astore_1        
		{
			AppboyLogger.e(a, "Exception while parsing stored SDK flavor. Returning null.", ((Throwable) (exception)));
	//   18   32:getstatic       #21  <Field String a>
	//   19   35:ldc2            #375 <String "Exception while parsing stored SDK flavor. Returning null.">
	//   20   38:aload_1         
	//   21   39:invokestatic    #205 <Method int AppboyLogger.e(String, String, Throwable)>
	//   22   42:pop             
			return null;
	//   23   43:aconst_null     
	//   24   44:areturn         
		}
		return ((SdkFlavor) (obj));
	}

	public int getSessionTimeoutSeconds()
	{
		return getIntValue("com_appboy_session_timeout", 10);
	//    0    0:aload_0         
	//    1    1:ldc2            #378 <String "com_appboy_session_timeout">
	//    2    4:bipush          10
	//    3    6:invokevirtual   #288 <Method int getIntValue(String, int)>
	//    4    9:ireturn         
	}

	public int getSmallNotificationIconResourceId()
	{
		return a(a.a);
	//    0    0:aload_0         
	//    1    1:getstatic       #381 <Field AppboyConfigurationProvider$a AppboyConfigurationProvider$a.a>
	//    2    4:invokespecial   #356 <Method int a(AppboyConfigurationProvider$a)>
	//    3    7:ireturn         
	}

	public long getTriggerActionMinimumTimeIntervalInSeconds()
	{
		return (long)getIntValue("com_appboy_trigger_action_minimum_time_interval_seconds", 30);
	//    0    0:aload_0         
	//    1    1:ldc2            #385 <String "com_appboy_trigger_action_minimum_time_interval_seconds">
	//    2    4:bipush          30
	//    3    6:invokevirtual   #288 <Method int getIntValue(String, int)>
	//    4    9:i2l             
	//    5   10:lreturn         
	}

	public int getVersionCode()
	{
		if(mConfigurationCache.containsKey("version_code"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field Map mConfigurationCache>
	//*   2    4:ldc2            #388 <String "version_code">
	//*   3    7:invokeinterface #49  <Method boolean Map.containsKey(Object)>
	//*   4   12:ifeq            34
			return ((Integer)mConfigurationCache.get("version_code")).intValue();
	//    5   15:aload_0         
	//    6   16:getfield        #44  <Field Map mConfigurationCache>
	//    7   19:ldc2            #388 <String "version_code">
	//    8   22:invokeinterface #53  <Method Object Map.get(Object)>
	//    9   27:checkcast       #55  <Class Integer>
	//   10   30:invokevirtual   #59  <Method int Integer.intValue()>
	//   11   33:ireturn         
		int i;
		try
		{
			String s = PackageUtils.getResourcePackageName(b);
	//   12   34:aload_0         
	//   13   35:getfield        #28  <Field Context b>
	//   14   38:invokestatic    #87  <Method String PackageUtils.getResourcePackageName(Context)>
	//   15   41:astore_2        
			i = b.getPackageManager().getPackageInfo(s, 0).versionCode;
	//   16   42:aload_0         
	//   17   43:getfield        #28  <Field Context b>
	//   18   46:invokevirtual   #249 <Method PackageManager Context.getPackageManager()>
	//   19   49:aload_2         
	//   20   50:iconst_0        
	//   21   51:invokevirtual   #392 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   22   54:getfield        #397 <Field int PackageInfo.versionCode>
	//   23   57:istore_1        
		}
	//*  24   58:goto            75
		catch(Exception exception)
	//*  25   61:astore_2        
		{
			AppboyLogger.e(a, "Unable to read the version code.", ((Throwable) (exception)));
	//   26   62:getstatic       #21  <Field String a>
	//   27   65:ldc2            #399 <String "Unable to read the version code.">
	//   28   68:aload_2         
	//   29   69:invokestatic    #205 <Method int AppboyLogger.e(String, String, Throwable)>
	//   30   72:pop             
			i = -1;
	//   31   73:iconst_m1       
	//   32   74:istore_1        
		}
		mConfigurationCache.put("version_code", ((Object) (Integer.valueOf(i))));
	//   33   75:aload_0         
	//   34   76:getfield        #44  <Field Map mConfigurationCache>
	//   35   79:ldc2            #388 <String "version_code">
	//   36   82:iload_1         
	//   37   83:invokestatic    #97  <Method Integer Integer.valueOf(int)>
	//   38   86:invokeinterface #101 <Method Object Map.put(Object, Object)>
	//   39   91:pop             
		return i;
	//   40   92:iload_1         
	//   41   93:ireturn         
	}

	public boolean isAdmMessagingRegistrationEnabled()
	{
		return getBooleanValue("com_appboy_push_adm_messaging_registration_enabled", false);
	//    0    0:aload_0         
	//    1    1:ldc2            #402 <String "com_appboy_push_adm_messaging_registration_enabled">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #330 <Method boolean getBooleanValue(String, boolean)>
	//    4    8:ireturn         
	}

	public boolean isContentCardsUnreadVisualIndicatorEnabled()
	{
		return getBooleanValue("com_appboy_content_cards_unread_visual_indicator_enabled", true);
	//    0    0:aload_0         
	//    1    1:ldc2            #405 <String "com_appboy_content_cards_unread_visual_indicator_enabled">
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #330 <Method boolean getBooleanValue(String, boolean)>
	//    4    8:ireturn         
	}

	public boolean isFirebaseCloudMessagingRegistrationEnabled()
	{
		return getBooleanValue("com_appboy_firebase_cloud_messaging_registration_enabled", false);
	//    0    0:aload_0         
	//    1    1:ldc2            #408 <String "com_appboy_firebase_cloud_messaging_registration_enabled">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #330 <Method boolean getBooleanValue(String, boolean)>
	//    4    8:ireturn         
	}

	public boolean isLocationCollectionEnabled()
	{
		return getBooleanValue("com_appboy_disable_location_collection", false) ^ true;
	//    0    0:aload_0         
	//    1    1:ldc2            #411 <String "com_appboy_disable_location_collection">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #330 <Method boolean getBooleanValue(String, boolean)>
	//    4    8:iconst_1        
	//    5    9:ixor            
	//    6   10:ireturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/configuration/AppboyConfigurationProvider);
	private final Context b;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyConfigurationProvider>
	//    1    2:invokestatic    #19  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #21  <Field String a>
	//*   3    8:return          
	}
}
