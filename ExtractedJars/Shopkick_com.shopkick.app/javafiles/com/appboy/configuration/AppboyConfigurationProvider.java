// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.configuration;

import android.content.Context;
import android.content.pm.*;
import android.content.res.Resources;
import bo.app.cb;
import bo.app.j;
import com.appboy.enums.SdkFlavor;
import com.appboy.support.*;
import java.util.Locale;
import java.util.Map;
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
	//    2    2:invokespecial   #25  <Method void CachedConfigurationProvider(Context)>
		b = context;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #27  <Field Context b>
	//    6   10:return          
	}

	private int a(a a1)
	{
		if(a1.equals(((Object) (a.b))))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #31  <Field AppboyConfigurationProvider$a AppboyConfigurationProvider$a.b>
	//*   2    4:invokevirtual   #35  <Method boolean AppboyConfigurationProvider$a.equals(Object)>
	//*   3    7:ifeq            16
			a1 = "com_appboy_push_large_notification_icon";
	//    4   10:ldc1            #37  <String "com_appboy_push_large_notification_icon">
	//    5   12:astore_1        
		else
	//*   6   13:goto            19
			a1 = "com_appboy_push_small_notification_icon";
	//    7   16:ldc1            #39  <String "com_appboy_push_small_notification_icon">
	//    8   18:astore_1        
		if(mConfigurationCache.containsKey(((Object) (a1))))
	//*   9   19:aload_0         
	//*  10   20:getfield        #43  <Field Map mConfigurationCache>
	//*  11   23:aload_1         
	//*  12   24:invokeinterface #48  <Method boolean Map.containsKey(Object)>
	//*  13   29:ifeq            49
			return ((Integer)mConfigurationCache.get(((Object) (a1)))).intValue();
	//   14   32:aload_0         
	//   15   33:getfield        #43  <Field Map mConfigurationCache>
	//   16   36:aload_1         
	//   17   37:invokeinterface #52  <Method Object Map.get(Object)>
	//   18   42:checkcast       #54  <Class Integer>
	//   19   45:invokevirtual   #58  <Method int Integer.intValue()>
	//   20   48:ireturn         
		if(mRuntimeAppConfigurationProvider.a(((String) (a1))))
	//*  21   49:aload_0         
	//*  22   50:getfield        #62  <Field j mRuntimeAppConfigurationProvider>
	//*  23   53:aload_1         
	//*  24   54:invokevirtual   #67  <Method boolean j.a(String)>
	//*  25   57:ifeq            164
		{
			String s = mRuntimeAppConfigurationProvider.a(((String) (a1)), "");
	//   26   60:aload_0         
	//   27   61:getfield        #62  <Field j mRuntimeAppConfigurationProvider>
	//   28   64:aload_1         
	//   29   65:ldc1            #69  <String "">
	//   30   67:invokevirtual   #72  <Method String j.a(String, String)>
	//   31   70:astore_3        
			int i = b.getResources().getIdentifier(s, "drawable", PackageUtils.getResourcePackageName(b));
	//   32   71:aload_0         
	//   33   72:getfield        #27  <Field Context b>
	//   34   75:invokevirtual   #78  <Method Resources Context.getResources()>
	//   35   78:aload_3         
	//   36   79:ldc1            #80  <String "drawable">
	//   37   81:aload_0         
	//   38   82:getfield        #27  <Field Context b>
	//   39   85:invokestatic    #86  <Method String PackageUtils.getResourcePackageName(Context)>
	//   40   88:invokevirtual   #92  <Method int Resources.getIdentifier(String, String, String)>
	//   41   91:istore_2        
			mConfigurationCache.put(((Object) (a1)), ((Object) (Integer.valueOf(i))));
	//   42   92:aload_0         
	//   43   93:getfield        #43  <Field Map mConfigurationCache>
	//   44   96:aload_1         
	//   45   97:iload_2         
	//   46   98:invokestatic    #96  <Method Integer Integer.valueOf(int)>
	//   47  101:invokeinterface #100 <Method Object Map.put(Object, Object)>
	//   48  106:pop             
			String s1 = a;
	//   49  107:getstatic       #20  <Field String a>
	//   50  110:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   51  112:new             #102 <Class StringBuilder>
	//   52  115:dup             
	//   53  116:invokespecial   #104 <Method void StringBuilder()>
	//   54  119:astore          5
			stringbuilder.append("Using runtime override value for key: ");
	//   55  121:aload           5
	//   56  123:ldc1            #106 <String "Using runtime override value for key: ">
	//   57  125:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   58  128:pop             
			stringbuilder.append(((String) (a1)));
	//   59  129:aload           5
	//   60  131:aload_1         
	//   61  132:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   62  135:pop             
			stringbuilder.append(" and value: ");
	//   63  136:aload           5
	//   64  138:ldc1            #112 <String " and value: ">
	//   65  140:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   66  143:pop             
			stringbuilder.append(s);
	//   67  144:aload           5
	//   68  146:aload_3         
	//   69  147:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   70  150:pop             
			AppboyLogger.d(s1, stringbuilder.toString());
	//   71  151:aload           4
	//   72  153:aload           5
	//   73  155:invokevirtual   #116 <Method String StringBuilder.toString()>
	//   74  158:invokestatic    #120 <Method int AppboyLogger.d(String, String)>
	//   75  161:pop             
			return i;
	//   76  162:iload_2         
	//   77  163:ireturn         
		} else
		{
			int k = b.getResources().getIdentifier(((String) (a1)), "drawable", PackageUtils.getResourcePackageName(b));
	//   78  164:aload_0         
	//   79  165:getfield        #27  <Field Context b>
	//   80  168:invokevirtual   #78  <Method Resources Context.getResources()>
	//   81  171:aload_1         
	//   82  172:ldc1            #80  <String "drawable">
	//   83  174:aload_0         
	//   84  175:getfield        #27  <Field Context b>
	//   85  178:invokestatic    #86  <Method String PackageUtils.getResourcePackageName(Context)>
	//   86  181:invokevirtual   #92  <Method int Resources.getIdentifier(String, String, String)>
	//   87  184:istore_2        
			mConfigurationCache.put(((Object) (a1)), ((Object) (Integer.valueOf(k))));
	//   88  185:aload_0         
	//   89  186:getfield        #43  <Field Map mConfigurationCache>
	//   90  189:aload_1         
	//   91  190:iload_2         
	//   92  191:invokestatic    #96  <Method Integer Integer.valueOf(int)>
	//   93  194:invokeinterface #100 <Method Object Map.put(Object, Object)>
	//   94  199:pop             
			return k;
	//   95  200:iload_2         
	//   96  201:ireturn         
		}
	}

	private String a()
	{
		return getStringValue("com_appboy_server_target", "PROD");
	//    0    0:aload_0         
	//    1    1:ldc1            #122 <String "com_appboy_server_target">
	//    2    3:ldc1            #124 <String "PROD">
	//    3    5:invokevirtual   #127 <Method String getStringValue(String, String)>
	//    4    8:areturn         
	}

	public cb getAppboyApiKey()
	{
		cb cb2 = (cb)mConfigurationCache.get("com_appboy_api_key");
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Map mConfigurationCache>
	//    2    4:ldc1            #131 <String "com_appboy_api_key">
	//    3    6:invokeinterface #52  <Method Object Map.get(Object)>
	//    4   11:checkcast       #133 <Class cb>
	//    5   14:astore_3        
		cb cb1 = cb2;
	//    6   15:aload_3         
	//    7   16:astore_2        
		if(cb2 == null)
	//*   8   17:aload_3         
	//*   9   18:ifnonnull       108
		{
			String s = mRuntimeAppConfigurationProvider.a("com_appboy_api_key", ((String) (null)));
	//   10   21:aload_0         
	//   11   22:getfield        #62  <Field j mRuntimeAppConfigurationProvider>
	//   12   25:ldc1            #131 <String "com_appboy_api_key">
	//   13   27:aconst_null     
	//   14   28:invokevirtual   #72  <Method String j.a(String, String)>
	//   15   31:astore_1        
			if(s != null)
	//*  16   32:aload_1         
	//*  17   33:ifnull          48
			{
				AppboyLogger.i(a, "Found an override api key. Using it to configure Appboy.");
	//   18   36:getstatic       #20  <Field String a>
	//   19   39:ldc1            #135 <String "Found an override api key. Using it to configure Appboy.">
	//   20   41:invokestatic    #138 <Method int AppboyLogger.i(String, String)>
	//   21   44:pop             
			} else
	//*  22   45:goto            80
			{
				s = getAppboyApiKeyStringFromLocaleMapping(Locale.getDefault());
	//   23   48:aload_0         
	//   24   49:invokestatic    #144 <Method Locale Locale.getDefault()>
	//   25   52:invokevirtual   #148 <Method String getAppboyApiKeyStringFromLocaleMapping(Locale)>
	//   26   55:astore_1        
				if(s != null)
	//*  27   56:aload_1         
	//*  28   57:ifnull          72
					AppboyLogger.i(a, "Found a locale that matches the current locale in appboy.xml. Using the associated api key");
	//   29   60:getstatic       #20  <Field String a>
	//   30   63:ldc1            #150 <String "Found a locale that matches the current locale in appboy.xml. Using the associated api key">
	//   31   65:invokestatic    #138 <Method int AppboyLogger.i(String, String)>
	//   32   68:pop             
				else
	//*  33   69:goto            80
					s = readStringResourceValue("com_appboy_api_key", ((String) (null)));
	//   34   72:aload_0         
	//   35   73:ldc1            #131 <String "com_appboy_api_key">
	//   36   75:aconst_null     
	//   37   76:invokevirtual   #153 <Method String readStringResourceValue(String, String)>
	//   38   79:astore_1        
			}
			cb1 = cb2;
	//   39   80:aload_3         
	//   40   81:astore_2        
			if(s != null)
	//*  41   82:aload_1         
	//*  42   83:ifnull          108
			{
				cb1 = new cb(s);
	//   43   86:new             #133 <Class cb>
	//   44   89:dup             
	//   45   90:aload_1         
	//   46   91:invokespecial   #156 <Method void cb(String)>
	//   47   94:astore_2        
				mConfigurationCache.put("com_appboy_api_key", ((Object) (cb1)));
	//   48   95:aload_0         
	//   49   96:getfield        #43  <Field Map mConfigurationCache>
	//   50   99:ldc1            #131 <String "com_appboy_api_key">
	//   51  101:aload_2         
	//   52  102:invokeinterface #100 <Method Object Map.put(Object, Object)>
	//   53  107:pop             
			}
		}
		if(cb1 != null)
	//*  54  108:aload_2         
	//*  55  109:ifnull          114
		{
			return cb1;
	//   56  112:aload_2         
	//   57  113:areturn         
		} else
		{
			AppboyLogger.e(a, "****************************************************");
	//   58  114:getstatic       #20  <Field String a>
	//   59  117:ldc1            #158 <String "****************************************************">
	//   60  119:invokestatic    #161 <Method int AppboyLogger.e(String, String)>
	//   61  122:pop             
			AppboyLogger.e(a, "**                                                **");
	//   62  123:getstatic       #20  <Field String a>
	//   63  126:ldc1            #163 <String "**                                                **">
	//   64  128:invokestatic    #161 <Method int AppboyLogger.e(String, String)>
	//   65  131:pop             
			AppboyLogger.e(a, "**                 !! WARNING !!                  **");
	//   66  132:getstatic       #20  <Field String a>
	//   67  135:ldc1            #165 <String "**                 !! WARNING !!                  **">
	//   68  137:invokestatic    #161 <Method int AppboyLogger.e(String, String)>
	//   69  140:pop             
			AppboyLogger.e(a, "**                                                **");
	//   70  141:getstatic       #20  <Field String a>
	//   71  144:ldc1            #163 <String "**                                                **">
	//   72  146:invokestatic    #161 <Method int AppboyLogger.e(String, String)>
	//   73  149:pop             
			AppboyLogger.e(a, "**     No API key set in res/values/appboy.xml    **");
	//   74  150:getstatic       #20  <Field String a>
	//   75  153:ldc1            #167 <String "**     No API key set in res/values/appboy.xml    **">
	//   76  155:invokestatic    #161 <Method int AppboyLogger.e(String, String)>
	//   77  158:pop             
			AppboyLogger.e(a, "** No cached API Key found from Appboy.configure  **");
	//   78  159:getstatic       #20  <Field String a>
	//   79  162:ldc1            #169 <String "** No cached API Key found from Appboy.configure  **">
	//   80  164:invokestatic    #161 <Method int AppboyLogger.e(String, String)>
	//   81  167:pop             
			AppboyLogger.e(a, "**          Braze functionality disabled          **");
	//   82  168:getstatic       #20  <Field String a>
	//   83  171:ldc1            #171 <String "**          Braze functionality disabled          **">
	//   84  173:invokestatic    #161 <Method int AppboyLogger.e(String, String)>
	//   85  176:pop             
			AppboyLogger.e(a, "**                                                **");
	//   86  177:getstatic       #20  <Field String a>
	//   87  180:ldc1            #163 <String "**                                                **">
	//   88  182:invokestatic    #161 <Method int AppboyLogger.e(String, String)>
	//   89  185:pop             
			AppboyLogger.e(a, "****************************************************");
	//   90  186:getstatic       #20  <Field String a>
	//   91  189:ldc1            #158 <String "****************************************************">
	//   92  191:invokestatic    #161 <Method int AppboyLogger.e(String, String)>
	//   93  194:pop             
			throw new RuntimeException("Unable to read the Braze API key from the res/values/appboy.xml file. See log for more details.");
	//   94  195:new             #173 <Class RuntimeException>
	//   95  198:dup             
	//   96  199:ldc1            #175 <String "Unable to read the Braze API key from the res/values/appboy.xml file. See log for more details.">
	//   97  201:invokespecial   #176 <Method void RuntimeException(String)>
	//   98  204:athrow          
		}
	}

	public String getAppboyApiKeyStringFromLocaleMapping(Locale locale)
	{
		String s;
		if(locale == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			AppboyLogger.d(a, "Passed in a null locale to match.");
	//    2    4:getstatic       #20  <Field String a>
	//    3    7:ldc1            #180 <String "Passed in a null locale to match.">
	//    4    9:invokestatic    #120 <Method int AppboyLogger.d(String, String)>
	//    5   12:pop             
			return null;
	//    6   13:aconst_null     
	//    7   14:areturn         
		}
		if(!mRuntimeAppConfigurationProvider.a("com_appboy_locale_api_key_map"))
			break MISSING_BLOCK_LABEL_124;
	//    8   15:aload_0         
	//    9   16:getfield        #62  <Field j mRuntimeAppConfigurationProvider>
	//   10   19:ldc1            #182 <String "com_appboy_locale_api_key_map">
	//   11   21:invokevirtual   #67  <Method boolean j.a(String)>
	//   12   24:ifeq            124
		s = mRuntimeAppConfigurationProvider.a("com_appboy_locale_api_key_map", ((String) (null)));
	//   13   27:aload_0         
	//   14   28:getfield        #62  <Field j mRuntimeAppConfigurationProvider>
	//   15   31:ldc1            #182 <String "com_appboy_locale_api_key_map">
	//   16   33:aconst_null     
	//   17   34:invokevirtual   #72  <Method String j.a(String, String)>
	//   18   37:astore          5
		String as1[];
		JSONArray jsonarray;
		jsonarray = new JSONArray(s);
	//   19   39:new             #184 <Class JSONArray>
	//   20   42:dup             
	//   21   43:aload           5
	//   22   45:invokespecial   #185 <Method void JSONArray(String)>
	//   23   48:astore          7
		as1 = new String[jsonarray.length()];
	//   24   50:aload           7
	//   25   52:invokevirtual   #188 <Method int JSONArray.length()>
	//   26   55:anewarray       String[]
	//   27   58:astore          6
		String as[];
		JSONException jsonexception;
		int i = 0;
	//   28   60:iconst_0        
	//   29   61:istore_2        
		do
		{
			as = as1;
	//   30   62:aload           6
	//   31   64:astore          5
			try
			{
				if(i >= jsonarray.length())
					break;
	//   32   66:iload_2         
	//   33   67:aload           7
	//   34   69:invokevirtual   #188 <Method int JSONArray.length()>
	//   35   72:icmpge          133
				as1[i] = jsonarray.getString(i);
	//   36   75:aload           6
	//   37   77:iload_2         
	//   38   78:aload           7
	//   39   80:iload_2         
	//   40   81:invokevirtual   #194 <Method String JSONArray.getString(int)>
	//   41   84:aastore         
			}
	//*  42   85:iload_2         
	//*  43   86:iconst_1        
	//*  44   87:iadd            
	//*  45   88:istore_2        
	//*  46   89:goto            62
			catch(JSONException jsonexception1)
	//*  47   92:astore          7
			{
				as = as1;
	//   48   94:aload           6
	//   49   96:astore          5
				jsonexception = jsonexception1;
	//   50   98:aload           7
	//   51  100:astore          6
				break MISSING_BLOCK_LABEL_110;
	//   52  102:goto            110
			}
			i++;
		} while(true);
		break MISSING_BLOCK_LABEL_133;
		jsonexception;
	//   53  105:astore          6
		as = null;
	//   54  107:aconst_null     
	//   55  108:astore          5
		AppboyLogger.e(a, "Caught exception creating locale to api key mapping from override cache", ((Throwable) (jsonexception)));
	//   56  110:getstatic       #20  <Field String a>
	//   57  113:ldc1            #196 <String "Caught exception creating locale to api key mapping from override cache">
	//   58  115:aload           6
	//   59  117:invokestatic    #199 <Method int AppboyLogger.e(String, String, Throwable)>
	//   60  120:pop             
		break MISSING_BLOCK_LABEL_133;
	//   61  121:goto            133
		as = readStringArrayResourceValue("com_appboy_locale_api_key_map", ((String []) (null)));
	//   62  124:aload_0         
	//   63  125:ldc1            #182 <String "com_appboy_locale_api_key_map">
	//   64  127:aconst_null     
	//   65  128:invokevirtual   #203 <Method String[] readStringArrayResourceValue(String, String[])>
	//   66  131:astore          5
label0:
		{
			if(as == null)
	//*  67  133:aload           5
	//*  68  135:ifnonnull       149
			{
				AppboyLogger.d(a, "Locale to api key mappings not present in XML.");
	//   69  138:getstatic       #20  <Field String a>
	//   70  141:ldc1            #205 <String "Locale to api key mappings not present in XML.">
	//   71  143:invokestatic    #120 <Method int AppboyLogger.d(String, String)>
	//   72  146:pop             
				return null;
	//   73  147:aconst_null     
	//   74  148:areturn         
			}
			int l = as.length;
	//   75  149:aload           5
	//   76  151:arraylength     
	//   77  152:istore_3        
			int k = 0;
	//   78  153:iconst_0        
	//   79  154:istore_2        
			String as2[];
			do
			{
				if(k >= l)
					break label0;
	//   80  155:iload_2         
	//   81  156:iload_3         
	//   82  157:icmpge          272
				String s1 = as[k];
	//   83  160:aload           5
	//   84  162:iload_2         
	//   85  163:aaload          
	//   86  164:astore          6
				if(StringUtils.countOccurrences(s1, ",") == 1)
	//*  87  166:aload           6
	//*  88  168:ldc1            #207 <String ",">
	//*  89  170:invokestatic    #212 <Method int StringUtils.countOccurrences(String, String)>
	//*  90  173:iconst_1        
	//*  91  174:icmpeq          180
	//*  92  177:goto            257
				{
					as2 = s1.split(",");
	//   93  180:aload           6
	//   94  182:ldc1            #207 <String ",">
	//   95  184:invokevirtual   #216 <Method String[] String.split(String)>
	//   96  187:astore          6
					if(as2.length == 2)
	//*  97  189:aload           6
	//*  98  191:arraylength     
	//*  99  192:iconst_2        
	//* 100  193:icmpeq          199
	//* 101  196:goto            257
					{
						String s2 = as2[0].trim().toLowerCase(Locale.US);
	//  102  199:aload           6
	//  103  201:iconst_0        
	//  104  202:aaload          
	//  105  203:invokevirtual   #219 <Method String String.trim()>
	//  106  206:getstatic       #223 <Field Locale Locale.US>
	//  107  209:invokevirtual   #226 <Method String String.toLowerCase(Locale)>
	//  108  212:astore          7
						boolean flag = s2.equals(((Object) (locale.toString().toLowerCase(Locale.US))));
	//  109  214:aload           7
	//  110  216:aload_1         
	//  111  217:invokevirtual   #227 <Method String Locale.toString()>
	//  112  220:getstatic       #223 <Field Locale Locale.US>
	//  113  223:invokevirtual   #226 <Method String String.toLowerCase(Locale)>
	//  114  226:invokevirtual   #228 <Method boolean String.equals(Object)>
	//  115  229:istore          4
						if(s2.equals(((Object) (locale.getCountry().toLowerCase(Locale.US)))) || flag)
	//* 116  231:aload           7
	//* 117  233:aload_1         
	//* 118  234:invokevirtual   #231 <Method String Locale.getCountry()>
	//* 119  237:getstatic       #223 <Field Locale Locale.US>
	//* 120  240:invokevirtual   #226 <Method String String.toLowerCase(Locale)>
	//* 121  243:invokevirtual   #228 <Method boolean String.equals(Object)>
	//* 122  246:ifne            264
	//* 123  249:iload           4
	//* 124  251:ifeq            257
							break;
	//  125  254:goto            264
					}
				}
				k++;
	//  126  257:iload_2         
	//  127  258:iconst_1        
	//  128  259:iadd            
	//  129  260:istore_2        
			} while(true);
	//  130  261:goto            155
			return as2[1].trim();
	//  131  264:aload           6
	//  132  266:iconst_1        
	//  133  267:aaload          
	//  134  268:invokevirtual   #219 <Method String String.trim()>
	//  135  271:areturn         
		}
		return null;
	//  136  272:aconst_null     
	//  137  273:areturn         
	}

	public int getApplicationIconResourceId()
	{
		int i;
		String s;
		if(mConfigurationCache.containsKey("application_icon"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field Map mConfigurationCache>
	//*   2    4:ldc1            #236 <String "application_icon">
	//*   3    6:invokeinterface #48  <Method boolean Map.containsKey(Object)>
	//*   4   11:ifeq            32
			return ((Integer)mConfigurationCache.get("application_icon")).intValue();
	//    5   14:aload_0         
	//    6   15:getfield        #43  <Field Map mConfigurationCache>
	//    7   18:ldc1            #236 <String "application_icon">
	//    8   20:invokeinterface #52  <Method Object Map.get(Object)>
	//    9   25:checkcast       #54  <Class Integer>
	//   10   28:invokevirtual   #58  <Method int Integer.intValue()>
	//   11   31:ireturn         
		s = b.getPackageName();
	//   12   32:aload_0         
	//   13   33:getfield        #27  <Field Context b>
	//   14   36:invokevirtual   #239 <Method String Context.getPackageName()>
	//   15   39:astore_3        
		i = 0;
	//   16   40:iconst_0        
	//   17   41:istore_1        
		int k = b.getPackageManager().getApplicationInfo(s, 0).icon;
	//   18   42:aload_0         
	//   19   43:getfield        #27  <Field Context b>
	//   20   46:invokevirtual   #243 <Method PackageManager Context.getPackageManager()>
	//   21   49:aload_3         
	//   22   50:iconst_0        
	//   23   51:invokevirtual   #249 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   24   54:getfield        #255 <Field int ApplicationInfo.icon>
	//   25   57:istore_2        
		i = k;
	//   26   58:iload_2         
	//   27   59:istore_1        
		  goto _L1
	//*  28   60:goto            172
_L2:
		String s1 = a;
	//   29   63:getstatic       #20  <Field String a>
	//   30   66:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   31   68:new             #102 <Class StringBuilder>
	//   32   71:dup             
	//   33   72:invokespecial   #104 <Method void StringBuilder()>
	//   34   75:astore          5
		stringbuilder.append("Cannot find package named ");
	//   35   77:aload           5
	//   36   79:ldc2            #257 <String "Cannot find package named ">
	//   37   82:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   38   85:pop             
		stringbuilder.append(s);
	//   39   86:aload           5
	//   40   88:aload_3         
	//   41   89:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   42   92:pop             
		AppboyLogger.e(s1, stringbuilder.toString());
	//   43   93:aload           4
	//   44   95:aload           5
	//   45   97:invokevirtual   #116 <Method String StringBuilder.toString()>
	//   46  100:invokestatic    #161 <Method int AppboyLogger.e(String, String)>
	//   47  103:pop             
		k = b.getPackageManager().getApplicationInfo(b.getPackageName(), 0).icon;
	//   48  104:aload_0         
	//   49  105:getfield        #27  <Field Context b>
	//   50  108:invokevirtual   #243 <Method PackageManager Context.getPackageManager()>
	//   51  111:aload_0         
	//   52  112:getfield        #27  <Field Context b>
	//   53  115:invokevirtual   #239 <Method String Context.getPackageName()>
	//   54  118:iconst_0        
	//   55  119:invokevirtual   #249 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   56  122:getfield        #255 <Field int ApplicationInfo.icon>
	//   57  125:istore_2        
		i = k;
	//   58  126:iload_2         
	//   59  127:istore_1        
		  goto _L1
	//*  60  128:goto            172
_L3:
		String s2 = a;
	//   61  131:getstatic       #20  <Field String a>
	//   62  134:astore          4
		StringBuilder stringbuilder1 = new StringBuilder();
	//   63  136:new             #102 <Class StringBuilder>
	//   64  139:dup             
	//   65  140:invokespecial   #104 <Method void StringBuilder()>
	//   66  143:astore          5
		stringbuilder1.append("Cannot find package named ");
	//   67  145:aload           5
	//   68  147:ldc2            #257 <String "Cannot find package named ">
	//   69  150:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   70  153:pop             
		stringbuilder1.append(s);
	//   71  154:aload           5
	//   72  156:aload_3         
	//   73  157:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   74  160:pop             
		AppboyLogger.e(s2, stringbuilder1.toString());
	//   75  161:aload           4
	//   76  163:aload           5
	//   77  165:invokevirtual   #116 <Method String StringBuilder.toString()>
	//   78  168:invokestatic    #161 <Method int AppboyLogger.e(String, String)>
	//   79  171:pop             
_L1:
		mConfigurationCache.put("application_icon", ((Object) (Integer.valueOf(i))));
	//   80  172:aload_0         
	//   81  173:getfield        #43  <Field Map mConfigurationCache>
	//   82  176:ldc1            #236 <String "application_icon">
	//   83  178:iload_1         
	//   84  179:invokestatic    #96  <Method Integer Integer.valueOf(int)>
	//   85  182:invokeinterface #100 <Method Object Map.put(Object, Object)>
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
	//*   0    0:ldc2            #260 <String "STAGING">
	//*   1    3:aload_0         
	//*   2    4:invokespecial   #262 <Method String a()>
	//*   3    7:getstatic       #223 <Field Locale Locale.US>
	//*   4   10:invokevirtual   #265 <Method String String.toUpperCase(Locale)>
	//*   5   13:invokevirtual   #228 <Method boolean String.equals(Object)>
	//*   6   16:ifeq            23
			return "https://sondheim.appboy.com/api/v3/";
	//    7   19:ldc2            #267 <String "https://sondheim.appboy.com/api/v3/">
	//    8   22:areturn         
		else
			return "https://dev.appboy.com/api/v3/";
	//    9   23:ldc2            #269 <String "https://dev.appboy.com/api/v3/">
	//   10   26:areturn         
	}

	public String getCustomEndpoint()
	{
		return getStringValue("com_appboy_custom_endpoint", ((String) (null)));
	//    0    0:aload_0         
	//    1    1:ldc2            #272 <String "com_appboy_custom_endpoint">
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #127 <Method String getStringValue(String, String)>
	//    4    8:areturn         
	}

	public int getDefaultNotificationAccentColor()
	{
		return getIntValue("com_appboy_default_notification_accent_color", 0);
	//    0    0:aload_0         
	//    1    1:ldc2            #278 <String "com_appboy_default_notification_accent_color">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #282 <Method int getIntValue(String, int)>
	//    4    8:ireturn         
	}

	public String getDefaultNotificationChannelDescription()
	{
		return getStringValue("com_appboy_default_notification_channel_description", "");
	//    0    0:aload_0         
	//    1    1:ldc2            #286 <String "com_appboy_default_notification_channel_description">
	//    2    4:ldc1            #69  <String "">
	//    3    6:invokevirtual   #127 <Method String getStringValue(String, String)>
	//    4    9:areturn         
	}

	public String getDefaultNotificationChannelName()
	{
		return getStringValue("com_appboy_default_notification_channel_name", "General");
	//    0    0:aload_0         
	//    1    1:ldc2            #289 <String "com_appboy_default_notification_channel_name">
	//    2    4:ldc2            #291 <String "General">
	//    3    7:invokevirtual   #127 <Method String getStringValue(String, String)>
	//    4   10:areturn         
	}

	public String getFirebaseCloudMessagingSenderIdKey()
	{
		return getStringValue("com_appboy_firebase_cloud_messaging_sender_id", ((String) (null)));
	//    0    0:aload_0         
	//    1    1:ldc2            #294 <String "com_appboy_firebase_cloud_messaging_sender_id">
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #127 <Method String getStringValue(String, String)>
	//    4    8:areturn         
	}

	public String getGcmSenderId()
	{
		return getStringValue("com_appboy_push_gcm_sender_id", ((String) (null)));
	//    0    0:aload_0         
	//    1    1:ldc2            #297 <String "com_appboy_push_gcm_sender_id">
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #127 <Method String getStringValue(String, String)>
	//    4    8:areturn         
	}

	public boolean getHandlePushDeepLinksAutomatically()
	{
		return getBooleanValue("com_appboy_handle_push_deep_links_automatically", false);
	//    0    0:aload_0         
	//    1    1:ldc2            #301 <String "com_appboy_handle_push_deep_links_automatically">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #305 <Method boolean getBooleanValue(String, boolean)>
	//    4    8:ireturn         
	}

	public boolean getIsFrescoLibraryUseEnabled()
	{
		return getBooleanValue("com_appboy_enable_fresco_library_use", false);
	//    0    0:aload_0         
	//    1    1:ldc2            #308 <String "com_appboy_enable_fresco_library_use">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #305 <Method boolean getBooleanValue(String, boolean)>
	//    4    8:ireturn         
	}

	public boolean getIsNewsfeedVisualIndicatorOn()
	{
		return getBooleanValue("com_appboy_newsfeed_unread_visual_indicator_on", true);
	//    0    0:aload_0         
	//    1    1:ldc2            #311 <String "com_appboy_newsfeed_unread_visual_indicator_on">
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #305 <Method boolean getBooleanValue(String, boolean)>
	//    4    8:ireturn         
	}

	public boolean getIsNotificationsEnabledTrackingOn()
	{
		return getBooleanValue("com_appboy_notifications_enabled_tracking_on", false);
	//    0    0:aload_0         
	//    1    1:ldc2            #315 <String "com_appboy_notifications_enabled_tracking_on">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #305 <Method boolean getBooleanValue(String, boolean)>
	//    4    8:ireturn         
	}

	public boolean getIsPushDeepLinkBackStackActivityEnabled()
	{
		return getBooleanValue("com_appboy_push_deep_link_back_stack_activity_enabled", true);
	//    0    0:aload_0         
	//    1    1:ldc2            #319 <String "com_appboy_push_deep_link_back_stack_activity_enabled">
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #305 <Method boolean getBooleanValue(String, boolean)>
	//    4    8:ireturn         
	}

	public boolean getIsSessionStartBasedTimeoutEnabled()
	{
		return getBooleanValue("com_appboy_session_start_based_timeout_enabled", false);
	//    0    0:aload_0         
	//    1    1:ldc2            #322 <String "com_appboy_session_start_based_timeout_enabled">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #305 <Method boolean getBooleanValue(String, boolean)>
	//    4    8:ireturn         
	}

	public int getLargeNotificationIconResourceId()
	{
		return a(a.b);
	//    0    0:aload_0         
	//    1    1:getstatic       #31  <Field AppboyConfigurationProvider$a AppboyConfigurationProvider$a.b>
	//    2    4:invokespecial   #325 <Method int a(AppboyConfigurationProvider$a)>
	//    3    7:ireturn         
	}

	public float getLocationUpdateDistanceInMeters()
	{
		return (float)getIntValue("com_appboy_location_update_distance", -1);
	//    0    0:aload_0         
	//    1    1:ldc2            #329 <String "com_appboy_location_update_distance">
	//    2    4:iconst_m1       
	//    3    5:invokevirtual   #282 <Method int getIntValue(String, int)>
	//    4    8:i2f             
	//    5    9:freturn         
	}

	public long getLocationUpdateTimeIntervalInMillis()
	{
		return (long)getIntValue("com_appboy_location_update_time_interval", -1) * 1000L;
	//    0    0:aload_0         
	//    1    1:ldc2            #333 <String "com_appboy_location_update_time_interval">
	//    2    4:iconst_m1       
	//    3    5:invokevirtual   #282 <Method int getIntValue(String, int)>
	//    4    8:i2l             
	//    5    9:ldc2w           #334 <Long 1000L>
	//    6   12:lmul            
	//    7   13:lreturn         
	}

	public String getPushDeepLinkBackStackActivityClassName()
	{
		return getStringValue("com_appboy_push_deep_link_back_stack_activity_class_name", "");
	//    0    0:aload_0         
	//    1    1:ldc2            #338 <String "com_appboy_push_deep_link_back_stack_activity_class_name">
	//    2    4:ldc1            #69  <String "">
	//    3    6:invokevirtual   #127 <Method String getStringValue(String, String)>
	//    4    9:areturn         
	}

	public SdkFlavor getSdkFlavor()
	{
		Object obj = ((Object) (getStringValue("com_appboy_sdk_flavor", ((String) (null)))));
	//    0    0:aload_0         
	//    1    1:ldc2            #344 <String "com_appboy_sdk_flavor">
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #127 <Method String getStringValue(String, String)>
	//    4    8:astore_1        
		if(StringUtils.isNullOrBlank(((String) (obj))))
	//*   5    9:aload_1         
	//*   6   10:invokestatic    #347 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   7   13:ifeq            18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		try
		{
			obj = ((Object) (SdkFlavor.valueOf(((String) (obj)).toUpperCase(Locale.US))));
	//   10   18:aload_1         
	//   11   19:getstatic       #223 <Field Locale Locale.US>
	//   12   22:invokevirtual   #265 <Method String String.toUpperCase(Locale)>
	//   13   25:invokestatic    #352 <Method SdkFlavor SdkFlavor.valueOf(String)>
	//   14   28:astore_1        
		}
	//*  15   29:aload_1         
	//*  16   30:areturn         
		catch(Exception exception)
	//*  17   31:astore_1        
		{
			AppboyLogger.e(a, "Exception while parsing stored SDK flavor. Returning null.", ((Throwable) (exception)));
	//   18   32:getstatic       #20  <Field String a>
	//   19   35:ldc2            #354 <String "Exception while parsing stored SDK flavor. Returning null.">
	//   20   38:aload_1         
	//   21   39:invokestatic    #199 <Method int AppboyLogger.e(String, String, Throwable)>
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
	//    1    1:ldc2            #357 <String "com_appboy_session_timeout">
	//    2    4:bipush          10
	//    3    6:invokevirtual   #282 <Method int getIntValue(String, int)>
	//    4    9:ireturn         
	}

	public int getSmallNotificationIconResourceId()
	{
		return a(a.a);
	//    0    0:aload_0         
	//    1    1:getstatic       #360 <Field AppboyConfigurationProvider$a AppboyConfigurationProvider$a.a>
	//    2    4:invokespecial   #325 <Method int a(AppboyConfigurationProvider$a)>
	//    3    7:ireturn         
	}

	public long getTriggerActionMinimumTimeIntervalInSeconds()
	{
		return (long)getIntValue("com_appboy_trigger_action_minimum_time_interval_seconds", 30);
	//    0    0:aload_0         
	//    1    1:ldc2            #363 <String "com_appboy_trigger_action_minimum_time_interval_seconds">
	//    2    4:bipush          30
	//    3    6:invokevirtual   #282 <Method int getIntValue(String, int)>
	//    4    9:i2l             
	//    5   10:lreturn         
	}

	public int getVersionCode()
	{
		if(mConfigurationCache.containsKey("version_code"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field Map mConfigurationCache>
	//*   2    4:ldc2            #366 <String "version_code">
	//*   3    7:invokeinterface #48  <Method boolean Map.containsKey(Object)>
	//*   4   12:ifeq            34
			return ((Integer)mConfigurationCache.get("version_code")).intValue();
	//    5   15:aload_0         
	//    6   16:getfield        #43  <Field Map mConfigurationCache>
	//    7   19:ldc2            #366 <String "version_code">
	//    8   22:invokeinterface #52  <Method Object Map.get(Object)>
	//    9   27:checkcast       #54  <Class Integer>
	//   10   30:invokevirtual   #58  <Method int Integer.intValue()>
	//   11   33:ireturn         
		int i;
		try
		{
			String s = PackageUtils.getResourcePackageName(b);
	//   12   34:aload_0         
	//   13   35:getfield        #27  <Field Context b>
	//   14   38:invokestatic    #86  <Method String PackageUtils.getResourcePackageName(Context)>
	//   15   41:astore_2        
			i = b.getPackageManager().getPackageInfo(s, 0).versionCode;
	//   16   42:aload_0         
	//   17   43:getfield        #27  <Field Context b>
	//   18   46:invokevirtual   #243 <Method PackageManager Context.getPackageManager()>
	//   19   49:aload_2         
	//   20   50:iconst_0        
	//   21   51:invokevirtual   #370 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   22   54:getfield        #375 <Field int PackageInfo.versionCode>
	//   23   57:istore_1        
		}
	//*  24   58:goto            75
		catch(Exception exception)
	//*  25   61:astore_2        
		{
			AppboyLogger.e(a, "Unable to read the version code.", ((Throwable) (exception)));
	//   26   62:getstatic       #20  <Field String a>
	//   27   65:ldc2            #377 <String "Unable to read the version code.">
	//   28   68:aload_2         
	//   29   69:invokestatic    #199 <Method int AppboyLogger.e(String, String, Throwable)>
	//   30   72:pop             
			i = -1;
	//   31   73:iconst_m1       
	//   32   74:istore_1        
		}
		mConfigurationCache.put("version_code", ((Object) (Integer.valueOf(i))));
	//   33   75:aload_0         
	//   34   76:getfield        #43  <Field Map mConfigurationCache>
	//   35   79:ldc2            #366 <String "version_code">
	//   36   82:iload_1         
	//   37   83:invokestatic    #96  <Method Integer Integer.valueOf(int)>
	//   38   86:invokeinterface #100 <Method Object Map.put(Object, Object)>
	//   39   91:pop             
		return i;
	//   40   92:iload_1         
	//   41   93:ireturn         
	}

	public boolean isAdmMessagingRegistrationEnabled()
	{
		return getBooleanValue("com_appboy_push_adm_messaging_registration_enabled", false);
	//    0    0:aload_0         
	//    1    1:ldc2            #380 <String "com_appboy_push_adm_messaging_registration_enabled">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #305 <Method boolean getBooleanValue(String, boolean)>
	//    4    8:ireturn         
	}

	public boolean isBackgroundLocationCollectionEnabled()
	{
		return getBooleanValue("com_appboy_enable_background_location_collection", false);
	//    0    0:aload_0         
	//    1    1:ldc2            #383 <String "com_appboy_enable_background_location_collection">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #305 <Method boolean getBooleanValue(String, boolean)>
	//    4    8:ireturn         
	}

	public boolean isFirebaseCloudMessagingRegistrationEnabled()
	{
		return getBooleanValue("com_appboy_firebase_cloud_messaging_registration_enabled", false);
	//    0    0:aload_0         
	//    1    1:ldc2            #386 <String "com_appboy_firebase_cloud_messaging_registration_enabled">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #305 <Method boolean getBooleanValue(String, boolean)>
	//    4    8:ireturn         
	}

	public boolean isGcmMessagingRegistrationEnabled()
	{
		return getBooleanValue("com_appboy_push_gcm_messaging_registration_enabled", false);
	//    0    0:aload_0         
	//    1    1:ldc2            #389 <String "com_appboy_push_gcm_messaging_registration_enabled">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #305 <Method boolean getBooleanValue(String, boolean)>
	//    4    8:ireturn         
	}

	public boolean isLocationCollectionEnabled()
	{
		return getBooleanValue("com_appboy_disable_location_collection", false) ^ true;
	//    0    0:aload_0         
	//    1    1:ldc2            #392 <String "com_appboy_disable_location_collection">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #305 <Method boolean getBooleanValue(String, boolean)>
	//    4    8:iconst_1        
	//    5    9:ixor            
	//    6   10:ireturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/configuration/AppboyConfigurationProvider);
	private final Context b;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyConfigurationProvider>
	//    1    2:invokestatic    #18  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #20  <Field String a>
	//*   3    8:return          
	}
}
