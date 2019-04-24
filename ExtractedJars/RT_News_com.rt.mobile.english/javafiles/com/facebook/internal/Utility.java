// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.*;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.*;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.*;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.*;

// Referenced classes of package com.facebook.internal:
//			ProfileInformationCache, ImageDownloader, Validate, FacebookRequestErrorClassification, 
//			AttributionIdentifiers

public final class Utility
{
	public static class DialogFeatureConfig
	{

		private static DialogFeatureConfig parseDialogConfig(JSONObject jsonobject)
		{
			String s = jsonobject.optString("name");
		//    0    0:aload_0         
		//    1    1:ldc1            #35  <String "name">
		//    2    3:invokevirtual   #41  <Method String JSONObject.optString(String)>
		//    3    6:astore_3        
			boolean flag = Utility.isNullOrEmpty(s);
		//    4    7:aload_3         
		//    5    8:invokestatic    #45  <Method boolean Utility.isNullOrEmpty(String)>
		//    6   11:istore_1        
			Uri uri = null;
		//    7   12:aconst_null     
		//    8   13:astore_2        
			if(flag)
		//*   9   14:iload_1         
		//*  10   15:ifeq            20
				return null;
		//   11   18:aconst_null     
		//   12   19:areturn         
			String as[] = s.split("\\|");
		//   13   20:aload_3         
		//   14   21:ldc1            #47  <String "\\|">
		//   15   23:invokevirtual   #53  <Method String[] String.split(String)>
		//   16   26:astore          4
			if(as.length != 2)
		//*  17   28:aload           4
		//*  18   30:arraylength     
		//*  19   31:iconst_2        
		//*  20   32:icmpeq          37
				return null;
		//   21   35:aconst_null     
		//   22   36:areturn         
			s = as[0];
		//   23   37:aload           4
		//   24   39:iconst_0        
		//   25   40:aaload          
		//   26   41:astore_3        
			String s1 = as[1];
		//   27   42:aload           4
		//   28   44:iconst_1        
		//   29   45:aaload          
		//   30   46:astore          4
			if(!Utility.isNullOrEmpty(s))
		//*  31   48:aload_3         
		//*  32   49:invokestatic    #45  <Method boolean Utility.isNullOrEmpty(String)>
		//*  33   52:ifne            108
			{
				if(Utility.isNullOrEmpty(s1))
		//*  34   55:aload           4
		//*  35   57:invokestatic    #45  <Method boolean Utility.isNullOrEmpty(String)>
		//*  36   60:ifeq            65
					return null;
		//   37   63:aconst_null     
		//   38   64:areturn         
				String s2 = jsonobject.optString("url");
		//   39   65:aload_0         
		//   40   66:ldc1            #55  <String "url">
		//   41   68:invokevirtual   #41  <Method String JSONObject.optString(String)>
		//   42   71:astore          5
				if(!Utility.isNullOrEmpty(s2))
		//*  43   73:aload           5
		//*  44   75:invokestatic    #45  <Method boolean Utility.isNullOrEmpty(String)>
		//*  45   78:ifne            87
					uri = Uri.parse(s2);
		//   46   81:aload           5
		//   47   83:invokestatic    #61  <Method Uri Uri.parse(String)>
		//   48   86:astore_2        
				return new DialogFeatureConfig(s, s1, uri, parseVersionSpec(jsonobject.optJSONArray("versions")));
		//   49   87:new             #2   <Class Utility$DialogFeatureConfig>
		//   50   90:dup             
		//   51   91:aload_3         
		//   52   92:aload           4
		//   53   94:aload_2         
		//   54   95:aload_0         
		//   55   96:ldc1            #63  <String "versions">
		//   56   98:invokevirtual   #67  <Method JSONArray JSONObject.optJSONArray(String)>
		//   57  101:invokestatic    #71  <Method int[] parseVersionSpec(JSONArray)>
		//   58  104:invokespecial   #73  <Method void Utility$DialogFeatureConfig(String, String, Uri, int[])>
		//   59  107:areturn         
			} else
			{
				return null;
		//   60  108:aconst_null     
		//   61  109:areturn         
			}
		}

		private static int[] parseVersionSpec(JSONArray jsonarray)
		{
			Object obj;
			if(jsonarray != null)
		//*   0    0:aload_0         
		//*   1    1:ifnull          91
			{
				int l = jsonarray.length();
		//    2    4:aload_0         
		//    3    5:invokevirtual   #81  <Method int JSONArray.length()>
		//    4    8:istore          4
				int ai[] = new int[l];
		//    5   10:iload           4
		//    6   12:newarray        int[]
		//    7   14:astore          6
				int j = 0;
		//    8   16:iconst_0        
		//    9   17:istore_2        
				do
				{
					obj = ((Object) (ai));
		//   10   18:aload           6
		//   11   20:astore          5
					if(j >= l)
						break;
		//   12   22:iload_2         
		//   13   23:iload           4
		//   14   25:icmpge          94
					int k = jsonarray.optInt(j, -1);
		//   15   28:aload_0         
		//   16   29:iload_2         
		//   17   30:iconst_m1       
		//   18   31:invokevirtual   #85  <Method int JSONArray.optInt(int, int)>
		//   19   34:istore_3        
					int i = k;
		//   20   35:iload_3         
		//   21   36:istore_1        
					if(k == -1)
		//*  22   37:iload_3         
		//*  23   38:iconst_m1       
		//*  24   39:icmpne          79
					{
						obj = ((Object) (jsonarray.optString(j)));
		//   25   42:aload_0         
		//   26   43:iload_2         
		//   27   44:invokevirtual   #88  <Method String JSONArray.optString(int)>
		//   28   47:astore          5
						i = k;
		//   29   49:iload_3         
		//   30   50:istore_1        
						if(!Utility.isNullOrEmpty(((String) (obj))))
		//*  31   51:aload           5
		//*  32   53:invokestatic    #45  <Method boolean Utility.isNullOrEmpty(String)>
		//*  33   56:ifne            79
							try
							{
								i = Integer.parseInt(((String) (obj)));
		//   34   59:aload           5
		//   35   61:invokestatic    #94  <Method int Integer.parseInt(String)>
		//   36   64:istore_1        
							}
		//*  37   65:goto            79
							// Misplaced declaration of an exception variable
							catch(Object obj)
		//*  38   68:astore          5
							{
								Utility.logd("FacebookSDK", ((Exception) (obj)));
		//   39   70:ldc1            #96  <String "FacebookSDK">
		//   40   72:aload           5
		//   41   74:invokestatic    #100 <Method void Utility.logd(String, Exception)>
								i = -1;
		//   42   77:iconst_m1       
		//   43   78:istore_1        
							}
					}
					ai[j] = i;
		//   44   79:aload           6
		//   45   81:iload_2         
		//   46   82:iload_1         
		//   47   83:iastore         
					j++;
		//   48   84:iload_2         
		//   49   85:iconst_1        
		//   50   86:iadd            
		//   51   87:istore_2        
				} while(true);
		//   52   88:goto            18
			} else
			{
				obj = null;
		//   53   91:aconst_null     
		//   54   92:astore          5
			}
			return ((int []) (obj));
		//   55   94:aload           5
		//   56   96:areturn         
		}

		public String getDialogName()
		{
			return dialogName;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field String dialogName>
		//    2    4:areturn         
		}

		public Uri getFallbackUrl()
		{
			return fallbackUrl;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Uri fallbackUrl>
		//    2    4:areturn         
		}

		public String getFeatureName()
		{
			return featureName;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field String featureName>
		//    2    4:areturn         
		}

		public int[] getVersionSpec()
		{
			return featureVersionSpec;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field int[] featureVersionSpec>
		//    2    4:areturn         
		}

		private String dialogName;
		private Uri fallbackUrl;
		private String featureName;
		private int featureVersionSpec[];


/*
		static DialogFeatureConfig access$400(JSONObject jsonobject)
		{
			return parseDialogConfig(jsonobject);
		//    0    0:aload_0         
		//    1    1:invokestatic    #33  <Method Utility$DialogFeatureConfig parseDialogConfig(JSONObject)>
		//    2    4:areturn         
		}

*/

		private DialogFeatureConfig(String s, String s1, Uri uri, int ai[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			dialogName = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field String dialogName>
			featureName = s1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field String featureName>
			fallbackUrl = uri;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #25  <Field Uri fallbackUrl>
			featureVersionSpec = ai;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #27  <Field int[] featureVersionSpec>
		//   14   25:return          
		}
	}

	public static class FetchedAppSettings
	{

		public Map getDialogConfigurations()
		{
			return dialogConfigMap;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field Map dialogConfigMap>
		//    2    4:areturn         
		}

		public FacebookRequestErrorClassification getErrorClassification()
		{
			return errorClassification;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field FacebookRequestErrorClassification errorClassification>
		//    2    4:areturn         
		}

		public String getNuxContent()
		{
			return nuxContent;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field String nuxContent>
		//    2    4:areturn         
		}

		public boolean getNuxEnabled()
		{
			return nuxEnabled;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field boolean nuxEnabled>
		//    2    4:ireturn         
		}

		public boolean supportsImplicitLogging()
		{
			return supportsImplicitLogging;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field boolean supportsImplicitLogging>
		//    2    4:ireturn         
		}

		private Map dialogConfigMap;
		private FacebookRequestErrorClassification errorClassification;
		private String nuxContent;
		private boolean nuxEnabled;
		private boolean supportsImplicitLogging;

		private FetchedAppSettings(boolean flag, String s, boolean flag1, Map map1, FacebookRequestErrorClassification facebookrequesterrorclassification)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			supportsImplicitLogging = flag;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #24  <Field boolean supportsImplicitLogging>
			nuxContent = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #26  <Field String nuxContent>
			nuxEnabled = flag1;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #28  <Field boolean nuxEnabled>
			dialogConfigMap = map1;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #30  <Field Map dialogConfigMap>
			errorClassification = facebookrequesterrorclassification;
		//   14   25:aload_0         
		//   15   26:aload           5
		//   16   28:putfield        #32  <Field FacebookRequestErrorClassification errorClassification>
		//   17   31:return          
		}

	}

	public static interface GraphMeRequestWithCacheCallback
	{

		public abstract void onFailure(FacebookException facebookexception);

		public abstract void onSuccess(JSONObject jsonobject);
	}

	public static interface Mapper
	{

		public abstract Object apply(Object obj);
	}

	public static interface Predicate
	{

		public abstract boolean apply(Object obj);
	}


	public Utility()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #131 <Method void Object()>
	//    2    4:return          
	}

	public static boolean areObjectsEqual(Object obj, Object obj1)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
			return obj1 == null;
	//    2    4:aload_1         
	//    3    5:ifnonnull       10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
		else
			return obj.equals(obj1);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokevirtual   #149 <Method boolean Object.equals(Object)>
	//   11   17:ireturn         
	}

	public static transient ArrayList arrayList(Object aobj[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		ArrayList arraylist = new ArrayList(aobj.length);
	//    2    2:new             #155 <Class ArrayList>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:invokespecial   #158 <Method void ArrayList(int)>
	//    7   11:astore_3        
		for(int j = aobj.length; i < j; i++)
	//*   8   12:aload_0         
	//*   9   13:arraylength     
	//*  10   14:istore_2        
	//*  11   15:iload_1         
	//*  12   16:iload_2         
	//*  13   17:icmpge          35
			arraylist.add(aobj[i]);
	//   14   20:aload_3         
	//   15   21:aload_0         
	//   16   22:iload_1         
	//   17   23:aaload          
	//   18   24:invokevirtual   #161 <Method boolean ArrayList.add(Object)>
	//   19   27:pop             

	//   20   28:iload_1         
	//   21   29:iconst_1        
	//   22   30:iadd            
	//   23   31:istore_1        
	//*  24   32:goto            15
		return arraylist;
	//   25   35:aload_3         
	//   26   36:areturn         
	}

	public static transient List asListNoNulls(Object aobj[])
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #155 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #165 <Method void ArrayList()>
	//    3    7:astore_3        
		int i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_1        
		for(int j = aobj.length; i < j; i++)
	//*   6   10:aload_0         
	//*   7   11:arraylength     
	//*   8   12:istore_2        
	//*   9   13:iload_1         
	//*  10   14:iload_2         
	//*  11   15:icmpge          42
		{
			Object obj = aobj[i];
	//   12   18:aload_0         
	//   13   19:iload_1         
	//   14   20:aaload          
	//   15   21:astore          4
			if(obj != null)
	//*  16   23:aload           4
	//*  17   25:ifnull          35
				arraylist.add(obj);
	//   18   28:aload_3         
	//   19   29:aload           4
	//   20   31:invokevirtual   #161 <Method boolean ArrayList.add(Object)>
	//   21   34:pop             
		}

	//   22   35:iload_1         
	//   23   36:iconst_1        
	//   24   37:iadd            
	//   25   38:istore_1        
	//*  26   39:goto            13
		return ((List) (arraylist));
	//   27   42:aload_3         
	//   28   43:areturn         
	}

	public static JSONObject awaitGetGraphMeRequestWithCache(String s)
	{
		JSONObject jsonobject = ProfileInformationCache.getProfileInformation(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #172 <Method JSONObject ProfileInformationCache.getProfileInformation(String)>
	//    2    4:astore_1        
		if(jsonobject != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return jsonobject;
	//    5    9:aload_1         
	//    6   10:areturn         
		s = ((String) (getGraphMeRequestWithCache(s).executeAndWait()));
	//    7   11:aload_0         
	//    8   12:invokestatic    #176 <Method GraphRequest getGraphMeRequestWithCache(String)>
	//    9   15:invokevirtual   #182 <Method GraphResponse GraphRequest.executeAndWait()>
	//   10   18:astore_0        
		if(((GraphResponse) (s)).getError() != null)
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #188 <Method FacebookRequestError GraphResponse.getError()>
	//*  13   23:ifnull          28
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
		else
			return ((GraphResponse) (s)).getJSONObject();
	//   16   28:aload_0         
	//   17   29:invokevirtual   #192 <Method JSONObject GraphResponse.getJSONObject()>
	//   18   32:areturn         
	}

	public static Uri buildUri(String s, String s1, Bundle bundle)
	{
		android.net.Uri.Builder builder = new android.net.Uri.Builder();
	//    0    0:new             #196 <Class android.net.Uri$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #197 <Method void android.net.Uri$Builder()>
	//    3    7:astore_3        
		builder.scheme("https");
	//    4    8:aload_3         
	//    5    9:ldc1            #86  <String "https">
	//    6   11:invokevirtual   #201 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//    7   14:pop             
		builder.authority(s);
	//    8   15:aload_3         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #204 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
	//   11   20:pop             
		builder.path(s1);
	//   12   21:aload_3         
	//   13   22:aload_1         
	//   14   23:invokevirtual   #207 <Method android.net.Uri$Builder android.net.Uri$Builder.path(String)>
	//   15   26:pop             
		if(bundle != null)
	//*  16   27:aload_2         
	//*  17   28:ifnull          89
		{
			s = ((String) (bundle.keySet().iterator()));
	//   18   31:aload_2         
	//   19   32:invokevirtual   #213 <Method Set Bundle.keySet()>
	//   20   35:invokeinterface #219 <Method Iterator Set.iterator()>
	//   21   40:astore_0        
			do
			{
				if(!((Iterator) (s)).hasNext())
					break;
	//   22   41:aload_0         
	//   23   42:invokeinterface #225 <Method boolean Iterator.hasNext()>
	//   24   47:ifeq            89
				s1 = (String)((Iterator) (s)).next();
	//   25   50:aload_0         
	//   26   51:invokeinterface #229 <Method Object Iterator.next()>
	//   27   56:checkcast       #113 <Class String>
	//   28   59:astore_1        
				Object obj = bundle.get(s1);
	//   29   60:aload_2         
	//   30   61:aload_1         
	//   31   62:invokevirtual   #233 <Method Object Bundle.get(String)>
	//   32   65:astore          4
				if(obj instanceof String)
	//*  33   67:aload           4
	//*  34   69:instanceof      #113 <Class String>
	//*  35   72:ifeq            41
					builder.appendQueryParameter(s1, (String)obj);
	//   36   75:aload_3         
	//   37   76:aload_1         
	//   38   77:aload           4
	//   39   79:checkcast       #113 <Class String>
	//   40   82:invokevirtual   #237 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   41   85:pop             
			} while(true);
	//   42   86:goto            41
		}
		return builder.build();
	//   43   89:aload_3         
	//   44   90:invokevirtual   #241 <Method Uri android.net.Uri$Builder.build()>
	//   45   93:areturn         
	}

	public static void clearCaches(Context context)
	{
		ImageDownloader.clearCache(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #248 <Method void ImageDownloader.clearCache(Context)>
	//    2    4:return          
	}

	private static void clearCookiesForDomain(Context context, String s)
	{
		CookieSyncManager.createInstance(context).sync();
	//    0    0:aload_0         
	//    1    1:invokestatic    #256 <Method CookieSyncManager CookieSyncManager.createInstance(Context)>
	//    2    4:invokevirtual   #259 <Method void CookieSyncManager.sync()>
		context = ((Context) (CookieManager.getInstance()));
	//    3    7:invokestatic    #265 <Method CookieManager CookieManager.getInstance()>
	//    4   10:astore_0        
		String s1 = ((CookieManager) (context)).getCookie(s);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #269 <Method String CookieManager.getCookie(String)>
	//    8   16:astore          4
		if(s1 == null)
	//*   9   18:aload           4
	//*  10   20:ifnonnull       24
			return;
	//   11   23:return          
		String as[] = s1.split(";");
	//   12   24:aload           4
	//   13   26:ldc2            #271 <String ";">
	//   14   29:invokevirtual   #275 <Method String[] String.split(String)>
	//   15   32:astore          4
		int j = as.length;
	//   16   34:aload           4
	//   17   36:arraylength     
	//   18   37:istore_3        
		for(int i = 0; i < j; i++)
	//*  19   38:iconst_0        
	//*  20   39:istore_2        
	//*  21   40:iload_2         
	//*  22   41:iload_3         
	//*  23   42:icmpge          111
		{
			String as1[] = as[i].split("=");
	//   24   45:aload           4
	//   25   47:iload_2         
	//   26   48:aaload          
	//   27   49:ldc2            #277 <String "=">
	//   28   52:invokevirtual   #275 <Method String[] String.split(String)>
	//   29   55:astore          5
			if(as1.length > 0)
	//*  30   57:aload           5
	//*  31   59:arraylength     
	//*  32   60:ifle            104
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   33   63:new             #279 <Class StringBuilder>
	//   34   66:dup             
	//   35   67:invokespecial   #280 <Method void StringBuilder()>
	//   36   70:astore          6
				stringbuilder.append(as1[0].trim());
	//   37   72:aload           6
	//   38   74:aload           5
	//   39   76:iconst_0        
	//   40   77:aaload          
	//   41   78:invokevirtual   #284 <Method String String.trim()>
	//   42   81:invokevirtual   #288 <Method StringBuilder StringBuilder.append(String)>
	//   43   84:pop             
				stringbuilder.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
	//   44   85:aload           6
	//   45   87:ldc2            #290 <String "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;">
	//   46   90:invokevirtual   #288 <Method StringBuilder StringBuilder.append(String)>
	//   47   93:pop             
				((CookieManager) (context)).setCookie(s, stringbuilder.toString());
	//   48   94:aload_0         
	//   49   95:aload_1         
	//   50   96:aload           6
	//   51   98:invokevirtual   #293 <Method String StringBuilder.toString()>
	//   52  101:invokevirtual   #297 <Method void CookieManager.setCookie(String, String)>
			}
		}

	//   53  104:iload_2         
	//   54  105:iconst_1        
	//   55  106:iadd            
	//   56  107:istore_2        
	//*  57  108:goto            40
		((CookieManager) (context)).removeExpiredCookie();
	//   58  111:aload_0         
	//   59  112:invokevirtual   #300 <Method void CookieManager.removeExpiredCookie()>
	//   60  115:return          
	}

	public static void clearFacebookCookies(Context context)
	{
		clearCookiesForDomain(context, "facebook.com");
	//    0    0:aload_0         
	//    1    1:ldc2            #303 <String "facebook.com">
	//    2    4:invokestatic    #305 <Method void clearCookiesForDomain(Context, String)>
		clearCookiesForDomain(context, ".facebook.com");
	//    3    7:aload_0         
	//    4    8:ldc2            #307 <String ".facebook.com">
	//    5   11:invokestatic    #305 <Method void clearCookiesForDomain(Context, String)>
		clearCookiesForDomain(context, "https://facebook.com");
	//    6   14:aload_0         
	//    7   15:ldc2            #309 <String "https://facebook.com">
	//    8   18:invokestatic    #305 <Method void clearCookiesForDomain(Context, String)>
		clearCookiesForDomain(context, "https://.facebook.com");
	//    9   21:aload_0         
	//   10   22:ldc2            #311 <String "https://.facebook.com">
	//   11   25:invokestatic    #305 <Method void clearCookiesForDomain(Context, String)>
	//   12   28:return          
	}

	public static void closeQuietly(Closeable closeable)
	{
		if(closeable == null)
			break MISSING_BLOCK_LABEL_10;
	//    0    0:aload_0         
	//    1    1:ifnull          10
		closeable.close();
	//    2    4:aload_0         
	//    3    5:invokeinterface #320 <Method void Closeable.close()>
		return;
	//    4   10:return          
		closeable;
	//    5   11:astore_0        
	//    6   12:return          
	}

	public static String coerceValueIfNullOrEmpty(String s, String s1)
	{
		if(isNullOrEmpty(s))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #326 <Method boolean isNullOrEmpty(String)>
	//*   2    4:ifeq            9
			return s1;
	//    3    7:aload_1         
	//    4    8:areturn         
		else
			return s;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	private static long convertBytesToGB(double d)
	{
		return Math.round(d / 1073741824D);
	//    0    0:dload_0         
	//    1    1:ldc2w           #329 <Double 1073741824D>
	//    2    4:ddiv            
	//    3    5:invokestatic    #335 <Method long Math.round(double)>
	//    4    8:lreturn         
	}

	static Map convertJSONObjectToHashMap(JSONObject jsonobject)
	{
		int i;
		HashMap hashmap;
		JSONArray jsonarray;
		hashmap = new HashMap();
	//    0    0:new             #341 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #342 <Method void HashMap()>
	//    3    7:astore          4
		jsonarray = jsonobject.names();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #348 <Method JSONArray JSONObject.names()>
	//    6   13:astore          5
		i = 0;
	//    7   15:iconst_0        
	//    8   16:istore_1        
_L3:
		if(i >= jsonarray.length()) goto _L2; else goto _L1
	//    9   17:iload_1         
	//   10   18:aload           5
	//   11   20:invokevirtual   #354 <Method int JSONArray.length()>
	//   12   23:icmpge          74
_L1:
		Object obj1;
		String s;
		s = jsonarray.getString(i);
	//   13   26:aload           5
	//   14   28:iload_1         
	//   15   29:invokevirtual   #358 <Method String JSONArray.getString(int)>
	//   16   32:astore          6
		obj1 = jsonobject.get(s);
	//   17   34:aload_0         
	//   18   35:aload           6
	//   19   37:invokevirtual   #359 <Method Object JSONObject.get(String)>
	//   20   40:astore_3        
		Object obj = obj1;
	//   21   41:aload_3         
	//   22   42:astore_2        
		try
		{
			if(obj1 instanceof JSONObject)
	//*  23   43:aload_3         
	//*  24   44:instanceof      #344 <Class JSONObject>
	//*  25   47:ifeq            58
				obj = ((Object) (convertJSONObjectToHashMap((JSONObject)obj1)));
	//   26   50:aload_3         
	//   27   51:checkcast       #344 <Class JSONObject>
	//   28   54:invokestatic    #361 <Method Map convertJSONObjectToHashMap(JSONObject)>
	//   29   57:astore_2        
			hashmap.put(((Object) (s)), obj);
	//   30   58:aload           4
	//   31   60:aload           6
	//   32   62:aload_2         
	//   33   63:invokevirtual   #365 <Method Object HashMap.put(Object, Object)>
	//   34   66:pop             
		}
	//*  35   67:iload_1         
	//*  36   68:iconst_1        
	//*  37   69:iadd            
	//*  38   70:istore_1        
	//*  39   71:goto            17
	//*  40   74:aload           4
	//*  41   76:areturn         
		catch(JSONException jsonexception) { }
	//   42   77:astore_2        
		i++;
		if(true) goto _L3; else goto _L2
	//   43   78:goto            67
_L2:
		return ((Map) (hashmap));
	}

	public static int copyAndCloseInputStream(InputStream inputstream, OutputStream outputstream)
		throws IOException
	{
		BufferedInputStream bufferedinputstream = new BufferedInputStream(inputstream);
	//    0    0:new             #370 <Class BufferedInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #373 <Method void BufferedInputStream(InputStream)>
	//    4    8:astore          4
		byte abyte0[] = new byte[8192];
	//    5   10:sipush          8192
	//    6   13:newarray        byte[]
	//    7   15:astore          5
		int i = 0;
	//    8   17:iconst_0        
	//    9   18:istore_2        
_L2:
		int j = bufferedinputstream.read(abyte0);
	//   10   19:aload           4
	//   11   21:aload           5
	//   12   23:invokevirtual   #377 <Method int BufferedInputStream.read(byte[])>
	//   13   26:istore_3        
		if(j == -1)
			break; /* Loop/switch isn't completed */
	//   14   27:iload_3         
	//   15   28:iconst_m1       
	//   16   29:icmpeq          47
		outputstream.write(abyte0, 0, j);
	//   17   32:aload_1         
	//   18   33:aload           5
	//   19   35:iconst_0        
	//   20   36:iload_3         
	//   21   37:invokevirtual   #383 <Method void OutputStream.write(byte[], int, int)>
		i += j;
	//   22   40:iload_2         
	//   23   41:iload_3         
	//   24   42:iadd            
	//   25   43:istore_2        
		if(true) goto _L2; else goto _L1
	//   26   44:goto            19
_L1:
		if(bufferedinputstream != null)
	//*  27   47:aload           4
	//*  28   49:ifnull          57
			bufferedinputstream.close();
	//   29   52:aload           4
	//   30   54:invokevirtual   #384 <Method void BufferedInputStream.close()>
		if(inputstream != null)
	//*  31   57:aload_0         
	//*  32   58:ifnull          65
			inputstream.close();
	//   33   61:aload_0         
	//   34   62:invokevirtual   #387 <Method void InputStream.close()>
		return i;
	//   35   65:iload_2         
	//   36   66:ireturn         
		Exception exception1;
		exception1;
	//   37   67:astore          5
		Exception exception;
		outputstream = ((OutputStream) (bufferedinputstream));
	//   38   69:aload           4
	//   39   71:astore_1        
		exception = exception1;
	//   40   72:aload           5
	//   41   74:astore          4
		break MISSING_BLOCK_LABEL_83;
	//   42   76:goto            83
		exception;
	//   43   79:astore          4
		outputstream = null;
	//   44   81:aconst_null     
	//   45   82:astore_1        
		if(outputstream != null)
	//*  46   83:aload_1         
	//*  47   84:ifnull          91
			((BufferedInputStream) (outputstream)).close();
	//   48   87:aload_1         
	//   49   88:invokevirtual   #384 <Method void BufferedInputStream.close()>
		if(inputstream != null)
	//*  50   91:aload_0         
	//*  51   92:ifnull          99
			inputstream.close();
	//   52   95:aload_0         
	//   53   96:invokevirtual   #387 <Method void InputStream.close()>
		throw exception;
	//   54   99:aload           4
	//   55  101:athrow          
	}

	public static void deleteDirectory(File file)
	{
		if(!file.exists())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #395 <Method boolean File.exists()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(file.isDirectory())
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #398 <Method boolean File.isDirectory()>
	//*   6   12:ifeq            43
		{
			File afile[] = file.listFiles();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #402 <Method File[] File.listFiles()>
	//    9   19:astore_3        
			int j = afile.length;
	//   10   20:aload_3         
	//   11   21:arraylength     
	//   12   22:istore_2        
			for(int i = 0; i < j; i++)
	//*  13   23:iconst_0        
	//*  14   24:istore_1        
	//*  15   25:iload_1         
	//*  16   26:iload_2         
	//*  17   27:icmpge          43
				deleteDirectory(afile[i]);
	//   18   30:aload_3         
	//   19   31:iload_1         
	//   20   32:aaload          
	//   21   33:invokestatic    #404 <Method void deleteDirectory(File)>

	//   22   36:iload_1         
	//   23   37:iconst_1        
	//   24   38:iadd            
	//   25   39:istore_1        
		}
	//*  26   40:goto            25
		file.delete();
	//   27   43:aload_0         
	//   28   44:invokevirtual   #407 <Method boolean File.delete()>
	//   29   47:pop             
	//   30   48:return          
	}

	public static void disconnectQuietly(URLConnection urlconnection)
	{
		if(urlconnection instanceof HttpURLConnection)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #411 <Class HttpURLConnection>
	//*   2    4:ifeq            14
			((HttpURLConnection)urlconnection).disconnect();
	//    3    7:aload_0         
	//    4    8:checkcast       #411 <Class HttpURLConnection>
	//    5   11:invokevirtual   #414 <Method void HttpURLConnection.disconnect()>
	//    6   14:return          
	}

	private static boolean externalStorageExists()
	{
		return "mounted".equals(((Object) (Environment.getExternalStorageState())));
	//    0    0:ldc2            #417 <String "mounted">
	//    1    3:invokestatic    #422 <Method String Environment.getExternalStorageState()>
	//    2    6:invokevirtual   #423 <Method boolean String.equals(Object)>
	//    3    9:ireturn         
	}

	public static List filter(List list, Predicate predicate)
	{
		if(list == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		ArrayList arraylist = new ArrayList();
	//    4    6:new             #155 <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #165 <Method void ArrayList()>
	//    7   13:astore_2        
		list = ((List) (list.iterator()));
	//    8   14:aload_0         
	//    9   15:invokeinterface #428 <Method Iterator List.iterator()>
	//   10   20:astore_0        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//   11   21:aload_0         
	//   12   22:invokeinterface #225 <Method boolean Iterator.hasNext()>
	//   13   27:ifeq            58
			Object obj = ((Iterator) (list)).next();
	//   14   30:aload_0         
	//   15   31:invokeinterface #229 <Method Object Iterator.next()>
	//   16   36:astore_3        
			if(predicate.apply(obj))
	//*  17   37:aload_1         
	//*  18   38:aload_3         
	//*  19   39:invokeinterface #431 <Method boolean Utility$Predicate.apply(Object)>
	//*  20   44:ifeq            21
				((List) (arraylist)).add(obj);
	//   21   47:aload_2         
	//   22   48:aload_3         
	//   23   49:invokeinterface #432 <Method boolean List.add(Object)>
	//   24   54:pop             
		} while(true);
	//   25   55:goto            21
		if(((List) (arraylist)).size() == 0)
	//*  26   58:aload_2         
	//*  27   59:invokeinterface #435 <Method int List.size()>
	//*  28   64:ifne            69
			return null;
	//   29   67:aconst_null     
	//   30   68:areturn         
		else
			return ((List) (arraylist));
	//   31   69:aload_2         
	//   32   70:areturn         
	}

	public static String getActivityName(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return "null";
	//    2    4:ldc2            #440 <String "null">
	//    3    7:areturn         
		if(context == context.getApplicationContext())
	//*   4    8:aload_0         
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #446 <Method Context Context.getApplicationContext()>
	//*   7   13:if_acmpne       20
			return "unknown";
	//    8   16:ldc2            #448 <String "unknown">
	//    9   19:areturn         
		else
			return ((Object) (context)).getClass().getSimpleName();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #452 <Method Class Object.getClass()>
	//   12   24:invokevirtual   #457 <Method String Class.getSimpleName()>
	//   13   27:areturn         
	}

	private static JSONObject getAppSettingsQueryResponse(String s)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #209 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #458 <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putString("fields", TextUtils.join(",", ((Object []) (APP_SETTING_FIELDS))));
	//    4    8:aload_1         
	//    5    9:ldc1            #29  <String "fields">
	//    6   11:ldc2            #460 <String ",">
	//    7   14:getstatic       #115 <Field String[] APP_SETTING_FIELDS>
	//    8   17:invokestatic    #466 <Method String TextUtils.join(CharSequence, Object[])>
	//    9   20:invokevirtual   #469 <Method void Bundle.putString(String, String)>
		s = ((String) (GraphRequest.newGraphPathRequest(((AccessToken) (null)), s, ((com.facebook.GraphRequest.Callback) (null)))));
	//   10   23:aconst_null     
	//   11   24:aload_0         
	//   12   25:aconst_null     
	//   13   26:invokestatic    #473 <Method GraphRequest GraphRequest.newGraphPathRequest(AccessToken, String, com.facebook.GraphRequest$Callback)>
	//   14   29:astore_0        
		((GraphRequest) (s)).setSkipClientToken(true);
	//   15   30:aload_0         
	//   16   31:iconst_1        
	//   17   32:invokevirtual   #476 <Method void GraphRequest.setSkipClientToken(boolean)>
		((GraphRequest) (s)).setParameters(bundle);
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:invokevirtual   #480 <Method void GraphRequest.setParameters(Bundle)>
		return ((GraphRequest) (s)).executeAndWait().getJSONObject();
	//   21   40:aload_0         
	//   22   41:invokevirtual   #182 <Method GraphResponse GraphRequest.executeAndWait()>
	//   23   44:invokevirtual   #192 <Method JSONObject GraphResponse.getJSONObject()>
	//   24   47:areturn         
	}

	public static FetchedAppSettings getAppSettingsWithoutQuery(String s)
	{
		if(s != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          17
			return (FetchedAppSettings)fetchedAppSettings.get(((Object) (s)));
	//    2    4:getstatic       #122 <Field Map fetchedAppSettings>
	//    3    7:aload_0         
	//    4    8:invokeinterface #487 <Method Object Map.get(Object)>
	//    5   13:checkcast       #15  <Class Utility$FetchedAppSettings>
	//    6   16:areturn         
		else
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
	}

	public static Date getBundleLongAsDate(Bundle bundle, String s, Date date)
	{
label0:
		{
			if(bundle == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
				return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
			bundle = ((Bundle) (bundle.get(s)));
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #233 <Method Object Bundle.get(String)>
	//    7   11:astore_0        
			long l;
			if(bundle instanceof Long)
	//*   8   12:aload_0         
	//*   9   13:instanceof      #493 <Class Long>
	//*  10   16:ifeq            30
			{
				l = ((Long)bundle).longValue();
	//   11   19:aload_0         
	//   12   20:checkcast       #493 <Class Long>
	//   13   23:invokevirtual   #497 <Method long Long.longValue()>
	//   14   26:lstore_3        
			} else
	//*  15   27:goto            45
			{
				if(!(bundle instanceof String))
					break label0;
	//   16   30:aload_0         
	//   17   31:instanceof      #113 <Class String>
	//   18   34:ifeq            80
				try
				{
					l = Long.parseLong((String)bundle);
	//   19   37:aload_0         
	//   20   38:checkcast       #113 <Class String>
	//   21   41:invokestatic    #501 <Method long Long.parseLong(String)>
	//   22   44:lstore_3        
				}
	//*  23   45:lload_3         
	//*  24   46:lconst_0        
	//*  25   47:lcmp            
	//*  26   48:ifne            62
	//*  27   51:new             #503 <Class Date>
	//*  28   54:dup             
	//*  29   55:ldc2w           #504 <Long 0xffffffffL>
	//*  30   58:invokespecial   #508 <Method void Date(long)>
	//*  31   61:areturn         
	//*  32   62:new             #503 <Class Date>
	//*  33   65:dup             
	//*  34   66:aload_2         
	//*  35   67:invokevirtual   #511 <Method long Date.getTime()>
	//*  36   70:lload_3         
	//*  37   71:ldc2w           #512 <Long 1000L>
	//*  38   74:lmul            
	//*  39   75:ladd            
	//*  40   76:invokespecial   #508 <Method void Date(long)>
	//*  41   79:areturn         
	//*  42   80:aconst_null     
	//*  43   81:areturn         
				// Misplaced declaration of an exception variable
				catch(Bundle bundle)
	//*  44   82:astore_0        
				{
					return null;
	//   45   83:aconst_null     
	//   46   84:areturn         
				}
			}
			if(l == 0L)
				return new Date(0xffffffffL);
			else
				return new Date(date.getTime() + l * 1000L);
		}
		return null;
	}

	public static long getContentSize(Uri uri)
	{
		Cursor cursor = FacebookSdk.getApplicationContext().getContentResolver().query(uri, ((String []) (null)), ((String) (null)), ((String []) (null)), ((String) (null)));
	//    0    0:invokestatic    #518 <Method Context FacebookSdk.getApplicationContext()>
	//    1    3:invokevirtual   #522 <Method ContentResolver Context.getContentResolver()>
	//    2    6:aload_0         
	//    3    7:aconst_null     
	//    4    8:aconst_null     
	//    5    9:aconst_null     
	//    6   10:aconst_null     
	//    7   11:invokevirtual   #528 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//    8   14:astore          4
		long l;
		int i = cursor.getColumnIndex("_size");
	//    9   16:aload           4
	//   10   18:ldc2            #530 <String "_size">
	//   11   21:invokeinterface #536 <Method int Cursor.getColumnIndex(String)>
	//   12   26:istore_1        
		cursor.moveToFirst();
	//   13   27:aload           4
	//   14   29:invokeinterface #539 <Method boolean Cursor.moveToFirst()>
	//   15   34:pop             
		l = cursor.getLong(i);
	//   16   35:aload           4
	//   17   37:iload_1         
	//   18   38:invokeinterface #543 <Method long Cursor.getLong(int)>
	//   19   43:lstore_2        
		if(cursor != null)
	//*  20   44:aload           4
	//*  21   46:ifnull          56
			cursor.close();
	//   22   49:aload           4
	//   23   51:invokeinterface #544 <Method void Cursor.close()>
		return l;
	//   24   56:lload_2         
	//   25   57:lreturn         
		uri;
	//   26   58:astore_0        
		break MISSING_BLOCK_LABEL_66;
	//   27   59:goto            66
		uri;
	//   28   62:astore_0        
		cursor = null;
	//   29   63:aconst_null     
	//   30   64:astore          4
		if(cursor != null)
	//*  31   66:aload           4
	//*  32   68:ifnull          78
			cursor.close();
	//   33   71:aload           4
	//   34   73:invokeinterface #544 <Method void Cursor.close()>
		throw uri;
	//   35   78:aload_0         
	//   36   79:athrow          
	}

	public static DialogFeatureConfig getDialogFeatureConfig(String s, String s1, String s2)
	{
		if(!isNullOrEmpty(s1))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #326 <Method boolean isNullOrEmpty(String)>
	//*   2    4:ifne            64
		{
			if(isNullOrEmpty(s2))
	//*   3    7:aload_2         
	//*   4    8:invokestatic    #326 <Method boolean isNullOrEmpty(String)>
	//*   5   11:ifeq            16
				return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
			s = ((String) ((FetchedAppSettings)fetchedAppSettings.get(((Object) (s)))));
	//    8   16:getstatic       #122 <Field Map fetchedAppSettings>
	//    9   19:aload_0         
	//   10   20:invokeinterface #487 <Method Object Map.get(Object)>
	//   11   25:checkcast       #15  <Class Utility$FetchedAppSettings>
	//   12   28:astore_0        
			if(s != null)
	//*  13   29:aload_0         
	//*  14   30:ifnull          62
			{
				s = ((String) ((Map)((FetchedAppSettings) (s)).getDialogConfigurations().get(((Object) (s1)))));
	//   15   33:aload_0         
	//   16   34:invokevirtual   #550 <Method Map Utility$FetchedAppSettings.getDialogConfigurations()>
	//   17   37:aload_1         
	//   18   38:invokeinterface #487 <Method Object Map.get(Object)>
	//   19   43:checkcast       #484 <Class Map>
	//   20   46:astore_0        
				if(s != null)
	//*  21   47:aload_0         
	//*  22   48:ifnull          62
					return (DialogFeatureConfig)((Map) (s)).get(((Object) (s2)));
	//   23   51:aload_0         
	//   24   52:aload_2         
	//   25   53:invokeinterface #487 <Method Object Map.get(Object)>
	//   26   58:checkcast       #12  <Class Utility$DialogFeatureConfig>
	//   27   61:areturn         
			}
			return null;
	//   28   62:aconst_null     
	//   29   63:areturn         
		} else
		{
			return null;
	//   30   64:aconst_null     
	//   31   65:areturn         
		}
	}

	private static GraphRequest getGraphMeRequestWithCache(String s)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #209 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #458 <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putString("fields", "id,name,first_name,middle_name,last_name,link");
	//    4    8:aload_1         
	//    5    9:ldc1            #29  <String "fields">
	//    6   11:ldc2            #552 <String "id,name,first_name,middle_name,last_name,link">
	//    7   14:invokevirtual   #469 <Method void Bundle.putString(String, String)>
		bundle.putString("access_token", s);
	//    8   17:aload_1         
	//    9   18:ldc2            #554 <String "access_token">
	//   10   21:aload_0         
	//   11   22:invokevirtual   #469 <Method void Bundle.putString(String, String)>
		return new GraphRequest(((AccessToken) (null)), "me", bundle, HttpMethod.GET, ((com.facebook.GraphRequest.Callback) (null)));
	//   12   25:new             #178 <Class GraphRequest>
	//   13   28:dup             
	//   14   29:aconst_null     
	//   15   30:ldc2            #556 <String "me">
	//   16   33:aload_1         
	//   17   34:getstatic       #562 <Field HttpMethod HttpMethod.GET>
	//   18   37:aconst_null     
	//   19   38:invokespecial   #565 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, com.facebook.GraphRequest$Callback)>
	//   20   41:areturn         
	}

	public static void getGraphMeRequestWithCacheAsync(String s, GraphMeRequestWithCacheCallback graphmerequestwithcachecallback)
	{
		JSONObject jsonobject = ProfileInformationCache.getProfileInformation(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #172 <Method JSONObject ProfileInformationCache.getProfileInformation(String)>
	//    2    4:astore_2        
		if(jsonobject != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
		{
			graphmerequestwithcachecallback.onSuccess(jsonobject);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #571 <Method void Utility$GraphMeRequestWithCacheCallback.onSuccess(JSONObject)>
			return;
	//    8   16:return          
		} else
		{
			graphmerequestwithcachecallback = ((GraphMeRequestWithCacheCallback) (new com.facebook.GraphRequest.Callback(graphmerequestwithcachecallback, s) {

				public void onCompleted(GraphResponse graphresponse)
				{
					if(graphresponse.getError() != null)
				//*   0    0:aload_1         
				//*   1    1:invokevirtual   #33  <Method FacebookRequestError GraphResponse.getError()>
				//*   2    4:ifnull          24
					{
						callback.onFailure(graphresponse.getError().getException());
				//    3    7:aload_0         
				//    4    8:getfield        #19  <Field Utility$GraphMeRequestWithCacheCallback val$callback>
				//    5   11:aload_1         
				//    6   12:invokevirtual   #33  <Method FacebookRequestError GraphResponse.getError()>
				//    7   15:invokevirtual   #39  <Method FacebookException FacebookRequestError.getException()>
				//    8   18:invokeinterface #45  <Method void Utility$GraphMeRequestWithCacheCallback.onFailure(FacebookException)>
						return;
				//    9   23:return          
					} else
					{
						ProfileInformationCache.putProfileInformation(accessToken, graphresponse.getJSONObject());
				//   10   24:aload_0         
				//   11   25:getfield        #21  <Field String val$accessToken>
				//   12   28:aload_1         
				//   13   29:invokevirtual   #49  <Method JSONObject GraphResponse.getJSONObject()>
				//   14   32:invokestatic    #55  <Method void ProfileInformationCache.putProfileInformation(String, JSONObject)>
						callback.onSuccess(graphresponse.getJSONObject());
				//   15   35:aload_0         
				//   16   36:getfield        #19  <Field Utility$GraphMeRequestWithCacheCallback val$callback>
				//   17   39:aload_1         
				//   18   40:invokevirtual   #49  <Method JSONObject GraphResponse.getJSONObject()>
				//   19   43:invokeinterface #59  <Method void Utility$GraphMeRequestWithCacheCallback.onSuccess(JSONObject)>
						return;
				//   20   48:return          
					}
				}

				final String val$accessToken;
				final GraphMeRequestWithCacheCallback val$callback;

			
			{
				callback = graphmerequestwithcachecallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Utility$GraphMeRequestWithCacheCallback val$callback>
				accessToken = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String val$accessToken>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
));
	//    9   17:new             #8   <Class Utility$2>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:invokespecial   #574 <Method void Utility$2(Utility$GraphMeRequestWithCacheCallback, String)>
	//   14   26:astore_1        
			s = ((String) (getGraphMeRequestWithCache(s)));
	//   15   27:aload_0         
	//   16   28:invokestatic    #176 <Method GraphRequest getGraphMeRequestWithCache(String)>
	//   17   31:astore_0        
			((GraphRequest) (s)).setCallback(((com.facebook.GraphRequest.Callback) (graphmerequestwithcachecallback)));
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #578 <Method void GraphRequest.setCallback(com.facebook.GraphRequest$Callback)>
			((GraphRequest) (s)).executeAsync();
	//   21   37:aload_0         
	//   22   38:invokevirtual   #582 <Method com.facebook.GraphRequestAsyncTask GraphRequest.executeAsync()>
	//   23   41:pop             
			return;
	//   24   42:return          
		}
	}

	public static String getMetadataApplicationId(Context context)
	{
		Validate.notNull(((Object) (context)), "context");
	//    0    0:aload_0         
	//    1    1:ldc2            #585 <String "context">
	//    2    4:invokestatic    #591 <Method void Validate.notNull(Object, String)>
		FacebookSdk.sdkInitialize(context);
	//    3    7:aload_0         
	//    4    8:invokestatic    #594 <Method void FacebookSdk.sdkInitialize(Context)>
		return FacebookSdk.getApplicationId();
	//    5   11:invokestatic    #597 <Method String FacebookSdk.getApplicationId()>
	//    6   14:areturn         
	}

	public static transient Method getMethodQuietly(Class class1, String s, Class aclass[])
	{
		try
		{
			class1 = ((Class) (class1.getMethod(s, aclass)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #605 <Method Method Class.getMethod(String, Class[])>
	//    4    6:astore_0        
		}
	//*   5    7:aload_0         
	//*   6    8:areturn         
	//*   7    9:aconst_null     
	//*   8   10:areturn         
		// Misplaced declaration of an exception variable
		catch(Class class1)
		{
			return null;
		}
		return ((Method) (class1));
	//*   9   11:astore_0        
	//*  10   12:goto            9
	}

	public static transient Method getMethodQuietly(String s, String s1, Class aclass[])
	{
		try
		{
			s = ((String) (getMethodQuietly(Class.forName(s), s1, aclass)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #613 <Method Class Class.forName(String)>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #615 <Method Method getMethodQuietly(Class, String, Class[])>
	//    5    9:astore_0        
		}
	//*   6   10:aload_0         
	//*   7   11:areturn         
	//*   8   12:aconst_null     
	//*   9   13:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return null;
		}
		return ((Method) (s));
	//*  10   14:astore_0        
	//*  11   15:goto            12
	}

	public static Object getStringPropertyAsJSON(JSONObject jsonobject, String s, String s1)
		throws JSONException
	{
		s = ((String) (jsonobject.opt(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #621 <Method Object JSONObject.opt(String)>
	//    3    5:astore_1        
		jsonobject = ((JSONObject) (s));
	//    4    6:aload_1         
	//    5    7:astore_0        
		if(s != null)
	//*   6    8:aload_1         
	//*   7    9:ifnull          36
		{
			jsonobject = ((JSONObject) (s));
	//    8   12:aload_1         
	//    9   13:astore_0        
			if(s instanceof String)
	//*  10   14:aload_1         
	//*  11   15:instanceof      #113 <Class String>
	//*  12   18:ifeq            36
				jsonobject = ((JSONObject) ((new JSONTokener((String)s)).nextValue()));
	//   13   21:new             #623 <Class JSONTokener>
	//   14   24:dup             
	//   15   25:aload_1         
	//   16   26:checkcast       #113 <Class String>
	//   17   29:invokespecial   #626 <Method void JSONTokener(String)>
	//   18   32:invokevirtual   #629 <Method Object JSONTokener.nextValue()>
	//   19   35:astore_0        
		}
		if(jsonobject != null && !(jsonobject instanceof JSONObject) && !(jsonobject instanceof JSONArray))
	//*  20   36:aload_0         
	//*  21   37:ifnull          86
	//*  22   40:aload_0         
	//*  23   41:instanceof      #344 <Class JSONObject>
	//*  24   44:ifne            86
	//*  25   47:aload_0         
	//*  26   48:instanceof      #350 <Class JSONArray>
	//*  27   51:ifne            86
		{
			if(s1 != null)
	//*  28   54:aload_2         
	//*  29   55:ifnull          75
			{
				s = ((String) (new JSONObject()));
	//   30   58:new             #344 <Class JSONObject>
	//   31   61:dup             
	//   32   62:invokespecial   #630 <Method void JSONObject()>
	//   33   65:astore_1        
				((JSONObject) (s)).putOpt(s1, ((Object) (jsonobject)));
	//   34   66:aload_1         
	//   35   67:aload_2         
	//   36   68:aload_0         
	//   37   69:invokevirtual   #634 <Method JSONObject JSONObject.putOpt(String, Object)>
	//   38   72:pop             
				return ((Object) (s));
	//   39   73:aload_1         
	//   40   74:areturn         
			} else
			{
				throw new FacebookException("Got an unexpected non-JSON object.");
	//   41   75:new             #636 <Class FacebookException>
	//   42   78:dup             
	//   43   79:ldc2            #638 <String "Got an unexpected non-JSON object.">
	//   44   82:invokespecial   #639 <Method void FacebookException(String)>
	//   45   85:athrow          
			}
		} else
		{
			return ((Object) (jsonobject));
	//   46   86:aload_0         
	//   47   87:areturn         
		}
	}

	public static String getUriString(Uri uri)
	{
		if(uri == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return uri.toString();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #644 <Method String Uri.toString()>
	//    6   10:areturn         
	}

	public static boolean hasSameId(JSONObject jsonobject, JSONObject jsonobject1)
	{
		if(jsonobject != null && jsonobject1 != null && jsonobject.has("id"))
	//*   0    0:aload_0         
	//*   1    1:ifnull          74
	//*   2    4:aload_1         
	//*   3    5:ifnull          74
	//*   4    8:aload_0         
	//*   5    9:ldc2            #648 <String "id">
	//*   6   12:invokevirtual   #651 <Method boolean JSONObject.has(String)>
	//*   7   15:ifeq            74
		{
			if(!jsonobject1.has("id"))
	//*   8   18:aload_1         
	//*   9   19:ldc2            #648 <String "id">
	//*  10   22:invokevirtual   #651 <Method boolean JSONObject.has(String)>
	//*  11   25:ifne            30
				return false;
	//   12   28:iconst_0        
	//   13   29:ireturn         
			if(((Object) (jsonobject)).equals(((Object) (jsonobject1))))
	//*  14   30:aload_0         
	//*  15   31:aload_1         
	//*  16   32:invokevirtual   #149 <Method boolean Object.equals(Object)>
	//*  17   35:ifeq            40
				return true;
	//   18   38:iconst_1        
	//   19   39:ireturn         
			jsonobject = ((JSONObject) (jsonobject.optString("id")));
	//   20   40:aload_0         
	//   21   41:ldc2            #648 <String "id">
	//   22   44:invokevirtual   #654 <Method String JSONObject.optString(String)>
	//   23   47:astore_0        
			jsonobject1 = ((JSONObject) (jsonobject1.optString("id")));
	//   24   48:aload_1         
	//   25   49:ldc2            #648 <String "id">
	//   26   52:invokevirtual   #654 <Method String JSONObject.optString(String)>
	//   27   55:astore_1        
			if(jsonobject != null)
	//*  28   56:aload_0         
	//*  29   57:ifnull          72
			{
				if(jsonobject1 == null)
	//*  30   60:aload_1         
	//*  31   61:ifnonnull       66
					return false;
	//   32   64:iconst_0        
	//   33   65:ireturn         
				else
					return ((String) (jsonobject)).equals(((Object) (jsonobject1)));
	//   34   66:aload_0         
	//   35   67:aload_1         
	//   36   68:invokevirtual   #423 <Method boolean String.equals(Object)>
	//   37   71:ireturn         
			} else
			{
				return false;
	//   38   72:iconst_0        
	//   39   73:ireturn         
			}
		} else
		{
			return false;
	//   40   74:iconst_0        
	//   41   75:ireturn         
		}
	}

	private static String hashBytes(MessageDigest messagedigest, byte abyte0[])
	{
		messagedigest.update(abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #662 <Method void MessageDigest.update(byte[])>
		messagedigest = ((MessageDigest) (messagedigest.digest()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #666 <Method byte[] MessageDigest.digest()>
	//    5    9:astore_0        
		abyte0 = ((byte []) (new StringBuilder()));
	//    6   10:new             #279 <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #280 <Method void StringBuilder()>
	//    9   17:astore_1        
		int j = messagedigest.length;
	//   10   18:aload_0         
	//   11   19:arraylength     
	//   12   20:istore_3        
		for(int i = 0; i < j; i++)
	//*  13   21:iconst_0        
	//*  14   22:istore_2        
	//*  15   23:iload_2         
	//*  16   24:iload_3         
	//*  17   25:icmpge          70
		{
			byte byte0 = messagedigest[i];
	//   18   28:aload_0         
	//   19   29:iload_2         
	//   20   30:baload          
	//   21   31:istore          4
			((StringBuilder) (abyte0)).append(Integer.toHexString(byte0 >> 4 & 0xf));
	//   22   33:aload_1         
	//   23   34:iload           4
	//   24   36:iconst_4        
	//   25   37:ishr            
	//   26   38:bipush          15
	//   27   40:iand            
	//   28   41:invokestatic    #671 <Method String Integer.toHexString(int)>
	//   29   44:invokevirtual   #288 <Method StringBuilder StringBuilder.append(String)>
	//   30   47:pop             
			((StringBuilder) (abyte0)).append(Integer.toHexString(byte0 >> 0 & 0xf));
	//   31   48:aload_1         
	//   32   49:iload           4
	//   33   51:iconst_0        
	//   34   52:ishr            
	//   35   53:bipush          15
	//   36   55:iand            
	//   37   56:invokestatic    #671 <Method String Integer.toHexString(int)>
	//   38   59:invokevirtual   #288 <Method StringBuilder StringBuilder.append(String)>
	//   39   62:pop             
		}

	//   40   63:iload_2         
	//   41   64:iconst_1        
	//   42   65:iadd            
	//   43   66:istore_2        
	//*  44   67:goto            23
		return ((StringBuilder) (abyte0)).toString();
	//   45   70:aload_1         
	//   46   71:invokevirtual   #293 <Method String StringBuilder.toString()>
	//   47   74:areturn         
	}

	public static transient HashSet hashSet(Object aobj[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		HashSet hashset = new HashSet(aobj.length);
	//    2    2:new             #675 <Class HashSet>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:invokespecial   #676 <Method void HashSet(int)>
	//    7   11:astore_3        
		for(int j = aobj.length; i < j; i++)
	//*   8   12:aload_0         
	//*   9   13:arraylength     
	//*  10   14:istore_2        
	//*  11   15:iload_1         
	//*  12   16:iload_2         
	//*  13   17:icmpge          35
			hashset.add(aobj[i]);
	//   14   20:aload_3         
	//   15   21:aload_0         
	//   16   22:iload_1         
	//   17   23:aaload          
	//   18   24:invokevirtual   #677 <Method boolean HashSet.add(Object)>
	//   19   27:pop             

	//   20   28:iload_1         
	//   21   29:iconst_1        
	//   22   30:iadd            
	//   23   31:istore_1        
	//*  24   32:goto            15
		return hashset;
	//   25   35:aload_3         
	//   26   36:areturn         
	}

	private static String hashWithAlgorithm(String s, String s1)
	{
		return hashWithAlgorithm(s, s1.getBytes());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #682 <Method byte[] String.getBytes()>
	//    3    5:invokestatic    #685 <Method String hashWithAlgorithm(String, byte[])>
	//    4    8:areturn         
	}

	private static String hashWithAlgorithm(String s, byte abyte0[])
	{
		try
		{
			s = ((String) (MessageDigest.getInstance(s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #690 <Method MessageDigest MessageDigest.getInstance(String)>
	//    2    4:astore_0        
		}
	//*   3    5:aload_0         
	//*   4    6:aload_1         
	//*   5    7:invokestatic    #692 <Method String hashBytes(MessageDigest, byte[])>
	//*   6   10:areturn         
	//*   7   11:aconst_null     
	//*   8   12:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return null;
		}
		return hashBytes(((MessageDigest) (s)), abyte0);
	//*   9   13:astore_0        
	//*  10   14:goto            11
	}

	public static int[] intersectRanges(int ai[], int ai1[])
	{
		int k;
		int l;
		int i1;
		int ai2[];
		if(ai == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return ai1;
	//    2    4:aload_1         
	//    3    5:areturn         
		if(ai1 == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       12
			return ai;
	//    6   10:aload_0         
	//    7   11:areturn         
		l = 0;
	//    8   12:iconst_0        
	//    9   13:istore          5
		ai2 = new int[ai.length + ai1.length];
	//   10   15:aload_0         
	//   11   16:arraylength     
	//   12   17:aload_1         
	//   13   18:arraylength     
	//   14   19:iadd            
	//   15   20:newarray        int[]
	//   16   22:astore          9
		i1 = 0;
	//   17   24:iconst_0        
	//   18   25:istore          6
		k = i1;
	//   19   27:iload           6
	//   20   29:istore          4
_L10:
		int i;
		int j;
		int j1;
		int k1;
		i = k;
	//   21   31:iload           4
	//   22   33:istore_2        
		if(l >= ai.length)
			break MISSING_BLOCK_LABEL_291;
	//   23   34:iload           5
	//   24   36:aload_0         
	//   25   37:arraylength     
	//   26   38:icmpge          291
		i = k;
	//   27   41:iload           4
	//   28   43:istore_2        
		if(i1 >= ai1.length)
			break MISSING_BLOCK_LABEL_291;
	//   29   44:iload           6
	//   30   46:aload_1         
	//   31   47:arraylength     
	//   32   48:icmpge          291
		j = ai[l];
	//   33   51:aload_0         
	//   34   52:iload           5
	//   35   54:iaload          
	//   36   55:istore_3        
		j1 = ai1[i1];
	//   37   56:aload_1         
	//   38   57:iload           6
	//   39   59:iaload          
	//   40   60:istore          7
		if(l < ai.length - 1)
	//*  41   62:iload           5
	//*  42   64:aload_0         
	//*  43   65:arraylength     
	//*  44   66:iconst_1        
	//*  45   67:isub            
	//*  46   68:icmpge          82
			k1 = ai[l + 1];
	//   47   71:aload_0         
	//   48   72:iload           5
	//   49   74:iconst_1        
	//   50   75:iadd            
	//   51   76:iaload          
	//   52   77:istore          8
		else
	//*  53   79:goto            87
			k1 = 0x7fffffff;
	//   54   82:ldc2            #695 <Int 0x7fffffff>
	//   55   85:istore          8
		if(i1 < ai1.length - 1)
	//*  56   87:iload           6
	//*  57   89:aload_1         
	//*  58   90:arraylength     
	//*  59   91:iconst_1        
	//*  60   92:isub            
	//*  61   93:icmpge          106
			i = ai1[i1 + 1];
	//   62   96:aload_1         
	//   63   97:iload           6
	//   64   99:iconst_1        
	//   65  100:iadd            
	//   66  101:iaload          
	//   67  102:istore_2        
		else
	//*  68  103:goto            110
			i = 0x7fffffff;
	//   69  106:ldc2            #695 <Int 0x7fffffff>
	//   70  109:istore_2        
		if(j >= j1) goto _L2; else goto _L1
	//   71  110:iload_3         
	//   72  111:iload           7
	//   73  113:icmpge          187
_L1:
		if(k1 <= j1) goto _L4; else goto _L3
	//   74  116:iload           8
	//   75  118:iload           7
	//   76  120:icmple          166
_L3:
		if(k1 <= i) goto _L6; else goto _L5
	//   77  123:iload           8
	//   78  125:iload_2         
	//   79  126:icmple          151
_L5:
		i1 += 2;
	//   80  129:iload           6
	//   81  131:iconst_2        
	//   82  132:iadd            
	//   83  133:istore          6
		j = j1;
	//   84  135:iload           7
	//   85  137:istore_3        
		j1 = i1;
	//   86  138:iload           6
	//   87  140:istore          7
_L7:
		k1 = i;
	//   88  142:iload_2         
	//   89  143:istore          8
		i = l;
	//   90  145:iload           5
	//   91  147:istore_2        
		break MISSING_BLOCK_LABEL_231;
	//   92  148:goto            231
_L6:
		i = l + 2;
	//   93  151:iload           5
	//   94  153:iconst_2        
	//   95  154:iadd            
	//   96  155:istore_2        
		j = j1;
	//   97  156:iload           7
	//   98  158:istore_3        
		j1 = i1;
	//   99  159:iload           6
	//  100  161:istore          7
		break MISSING_BLOCK_LABEL_231;
	//  101  163:goto            231
_L4:
		i = l + 2;
	//  102  166:iload           5
	//  103  168:iconst_2        
	//  104  169:iadd            
	//  105  170:istore_2        
_L8:
		k1 = 0x7fffffff;
	//  106  171:ldc2            #695 <Int 0x7fffffff>
	//  107  174:istore          8
		j = 0x80000000;
	//  108  176:ldc2            #696 <Int 0x80000000>
	//  109  179:istore_3        
		j1 = i1;
	//  110  180:iload           6
	//  111  182:istore          7
		break MISSING_BLOCK_LABEL_231;
	//  112  184:goto            231
_L2:
label0:
		{
			if(i <= j)
				break label0;
	//  113  187:iload_2         
	//  114  188:iload_3         
	//  115  189:icmple          219
			if(i > k1)
	//* 116  192:iload_2         
	//* 117  193:iload           8
	//* 118  195:icmple          210
			{
				i = l + 2;
	//  119  198:iload           5
	//  120  200:iconst_2        
	//  121  201:iadd            
	//  122  202:istore_2        
				j1 = i1;
	//  123  203:iload           6
	//  124  205:istore          7
				break MISSING_BLOCK_LABEL_231;
	//  125  207:goto            231
			}
			j1 = i1 + 2;
	//  126  210:iload           6
	//  127  212:iconst_2        
	//  128  213:iadd            
	//  129  214:istore          7
		}
		  goto _L7
	//* 130  216:goto            142
		i1 += 2;
	//  131  219:iload           6
	//  132  221:iconst_2        
	//  133  222:iadd            
	//  134  223:istore          6
		i = l;
	//  135  225:iload           5
	//  136  227:istore_2        
		  goto _L8
	//* 137  228:goto            171
		l = i;
	//  138  231:iload_2         
	//  139  232:istore          5
		i1 = j1;
	//  140  234:iload           7
	//  141  236:istore          6
		if(j == 0x80000000)
			continue; /* Loop/switch isn't completed */
	//  142  238:iload_3         
	//  143  239:ldc2            #696 <Int 0x80000000>
	//  144  242:icmpeq          31
		l = k + 1;
	//  145  245:iload           4
	//  146  247:iconst_1        
	//  147  248:iadd            
	//  148  249:istore          5
		ai2[k] = j;
	//  149  251:aload           9
	//  150  253:iload           4
	//  151  255:iload_3         
	//  152  256:iastore         
		if(k1 == 0x7fffffff)
			break; /* Loop/switch isn't completed */
	//  153  257:iload           8
	//  154  259:ldc2            #695 <Int 0x7fffffff>
	//  155  262:icmpeq          288
		k = l + 1;
	//  156  265:iload           5
	//  157  267:iconst_1        
	//  158  268:iadd            
	//  159  269:istore          4
		ai2[l] = k1;
	//  160  271:aload           9
	//  161  273:iload           5
	//  162  275:iload           8
	//  163  277:iastore         
		l = i;
	//  164  278:iload_2         
	//  165  279:istore          5
		i1 = j1;
	//  166  281:iload           7
	//  167  283:istore          6
		if(true) goto _L10; else goto _L9
	//  168  285:goto            31
_L9:
		i = l;
	//  169  288:iload           5
	//  170  290:istore_2        
		return Arrays.copyOf(ai2, i);
	//  171  291:aload           9
	//  172  293:iload_2         
	//  173  294:invokestatic    #702 <Method int[] Arrays.copyOf(int[], int)>
	//  174  297:areturn         
	}

	public static transient Object invokeMethodQuietly(Object obj, Method method, Object aobj[])
	{
		try
		{
			obj = method.invoke(obj, aobj);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #714 <Method Object Method.invoke(Object, Object[])>
	//    4    6:astore_0        
		}
	//*   5    7:aload_0         
	//*   6    8:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   7    9:astore_0        
		{
			return ((Object) (null));
	//    8   10:aconst_null     
	//    9   11:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  10   12:astore_0        
		{
			return ((Object) (null));
	//   11   13:aconst_null     
	//   12   14:areturn         
		}
		return obj;
	}

	public static boolean isContentUri(Uri uri)
	{
		return uri != null && "content".equalsIgnoreCase(uri.getScheme());
	//    0    0:aload_0         
	//    1    1:ifnull          19
	//    2    4:ldc2            #718 <String "content">
	//    3    7:aload_0         
	//    4    8:invokevirtual   #721 <Method String Uri.getScheme()>
	//    5   11:invokevirtual   #724 <Method boolean String.equalsIgnoreCase(String)>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public static boolean isCurrentAccessToken(AccessToken accesstoken)
	{
		if(accesstoken != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          12
			return accesstoken.equals(((Object) (AccessToken.getCurrentAccessToken())));
	//    2    4:aload_0         
	//    3    5:invokestatic    #732 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//    4    8:invokevirtual   #733 <Method boolean AccessToken.equals(Object)>
	//    5   11:ireturn         
		else
			return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public static boolean isFileUri(Uri uri)
	{
		return uri != null && "file".equalsIgnoreCase(uri.getScheme());
	//    0    0:aload_0         
	//    1    1:ifnull          19
	//    2    4:ldc2            #736 <String "file">
	//    3    7:aload_0         
	//    4    8:invokevirtual   #721 <Method String Uri.getScheme()>
	//    5   11:invokevirtual   #724 <Method boolean String.equalsIgnoreCase(String)>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public static boolean isNullOrEmpty(String s)
	{
		return s == null || s.length() == 0;
	//    0    0:aload_0         
	//    1    1:ifnull          16
	//    2    4:aload_0         
	//    3    5:invokevirtual   #737 <Method int String.length()>
	//    4    8:ifne            14
	//    5   11:goto            16
	//    6   14:iconst_0        
	//    7   15:ireturn         
	//    8   16:iconst_1        
	//    9   17:ireturn         
	}

	public static boolean isNullOrEmpty(Collection collection)
	{
		return collection == null || collection.size() == 0;
	//    0    0:aload_0         
	//    1    1:ifnull          18
	//    2    4:aload_0         
	//    3    5:invokeinterface #741 <Method int Collection.size()>
	//    4   10:ifne            16
	//    5   13:goto            18
	//    6   16:iconst_0        
	//    7   17:ireturn         
	//    8   18:iconst_1        
	//    9   19:ireturn         
	}

	public static boolean isSubset(Collection collection, Collection collection1)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		if(collection1 != null && collection1.size() != 0)
	//*   2    2:aload_1         
	//*   3    3:ifnull          60
	//*   4    6:aload_1         
	//*   5    7:invokeinterface #741 <Method int Collection.size()>
	//*   6   12:ifne            18
	//*   7   15:goto            60
		{
			collection1 = ((Collection) (new HashSet(collection1)));
	//    8   18:new             #675 <Class HashSet>
	//    9   21:dup             
	//   10   22:aload_1         
	//   11   23:invokespecial   #747 <Method void HashSet(Collection)>
	//   12   26:astore_1        
			for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext();)
	//*  13   27:aload_0         
	//*  14   28:invokeinterface #748 <Method Iterator Collection.iterator()>
	//*  15   33:astore_0        
	//*  16   34:aload_0         
	//*  17   35:invokeinterface #225 <Method boolean Iterator.hasNext()>
	//*  18   40:ifeq            58
				if(!((HashSet) (collection1)).contains(((Iterator) (collection)).next()))
	//*  19   43:aload_1         
	//*  20   44:aload_0         
	//*  21   45:invokeinterface #229 <Method Object Iterator.next()>
	//*  22   50:invokevirtual   #751 <Method boolean HashSet.contains(Object)>
	//*  23   53:ifne            34
					return false;
	//   24   56:iconst_0        
	//   25   57:ireturn         

			return true;
	//   26   58:iconst_1        
	//   27   59:ireturn         
		} else
		{
			if(collection != null)
	//*  28   60:aload_0         
	//*  29   61:ifnull          77
			{
				if(collection.size() == 0)
	//*  30   64:aload_0         
	//*  31   65:invokeinterface #741 <Method int Collection.size()>
	//*  32   70:ifne            75
					return true;
	//   33   73:iconst_1        
	//   34   74:ireturn         
				flag = false;
	//   35   75:iconst_0        
	//   36   76:istore_2        
			}
			return flag;
	//   37   77:iload_2         
	//   38   78:ireturn         
		}
	}

	public static boolean isWebUri(Uri uri)
	{
		return uri != null && ("http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme()));
	//    0    0:aload_0         
	//    1    1:ifnull          31
	//    2    4:ldc2            #755 <String "http">
	//    3    7:aload_0         
	//    4    8:invokevirtual   #721 <Method String Uri.getScheme()>
	//    5   11:invokevirtual   #724 <Method boolean String.equalsIgnoreCase(String)>
	//    6   14:ifne            29
	//    7   17:ldc1            #86  <String "https">
	//    8   19:aload_0         
	//    9   20:invokevirtual   #721 <Method String Uri.getScheme()>
	//   10   23:invokevirtual   #724 <Method boolean String.equalsIgnoreCase(String)>
	//   11   26:ifeq            31
	//   12   29:iconst_1        
	//   13   30:ireturn         
	//   14   31:iconst_0        
	//   15   32:ireturn         
	}

	public static Set jsonArrayToSet(JSONArray jsonarray)
		throws JSONException
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #675 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #758 <Method void HashSet()>
	//    3    7:astore_2        
		for(int i = 0; i < jsonarray.length(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #354 <Method int JSONArray.length()>
	//*   9   15:icmpge          37
			((Set) (hashset)).add(((Object) (jsonarray.getString(i))));
	//   10   18:aload_2         
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #358 <Method String JSONArray.getString(int)>
	//   14   24:invokeinterface #759 <Method boolean Set.add(Object)>
	//   15   29:pop             

	//   16   30:iload_1         
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:istore_1        
	//*  20   34:goto            10
		return ((Set) (hashset));
	//   21   37:aload_2         
	//   22   38:areturn         
	}

	public static List jsonArrayToStringList(JSONArray jsonarray)
		throws JSONException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #155 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #165 <Method void ArrayList()>
	//    3    7:astore_2        
		for(int i = 0; i < jsonarray.length(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #354 <Method int JSONArray.length()>
	//*   9   15:icmpge          35
			arraylist.add(((Object) (jsonarray.getString(i))));
	//   10   18:aload_2         
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #358 <Method String JSONArray.getString(int)>
	//   14   24:invokevirtual   #161 <Method boolean ArrayList.add(Object)>
	//   15   27:pop             

	//   16   28:iload_1         
	//   17   29:iconst_1        
	//   18   30:iadd            
	//   19   31:istore_1        
	//*  20   32:goto            10
		return ((List) (arraylist));
	//   21   35:aload_2         
	//   22   36:areturn         
	}

	public static void loadAppSettingsAsync(Context context, String s)
	{
		boolean flag = loadingSettings.compareAndSet(false, true);
	//    0    0:getstatic       #129 <Field AtomicBoolean loadingSettings>
	//    1    3:iconst_0        
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #768 <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//    4    8:istore_2        
		if(!isNullOrEmpty(s) && !fetchedAppSettings.containsKey(((Object) (s))))
	//*   5    9:aload_1         
	//*   6   10:invokestatic    #326 <Method boolean isNullOrEmpty(String)>
	//*   7   13:ifne            66
	//*   8   16:getstatic       #122 <Field Map fetchedAppSettings>
	//*   9   19:aload_1         
	//*  10   20:invokeinterface #771 <Method boolean Map.containsKey(Object)>
	//*  11   25:ifne            66
		{
			if(!flag)
	//*  12   28:iload_2         
	//*  13   29:ifne            33
			{
				return;
	//   14   32:return          
			} else
			{
				String s1 = String.format("com.facebook.internal.APP_SETTINGS.%s", new Object[] {
					s
				});
	//   15   33:ldc1            #32  <String "com.facebook.internal.APP_SETTINGS.%s">
	//   16   35:iconst_1        
	//   17   36:anewarray       Object[]
	//   18   39:dup             
	//   19   40:iconst_0        
	//   20   41:aload_1         
	//   21   42:aastore         
	//   22   43:invokestatic    #775 <Method String String.format(String, Object[])>
	//   23   46:astore_3        
				FacebookSdk.getExecutor().execute(new Runnable(context, s1, s) {

					public void run()
					{
						JSONObject jsonobject;
						Object obj;
						SharedPreferences sharedpreferences;
						sharedpreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field Context val$context>
					//    2    4:ldc1            #33  <String "com.facebook.internal.preferences.APP_SETTINGS">
					//    3    6:iconst_0        
					//    4    7:invokevirtual   #39  <Method SharedPreferences Context.getSharedPreferences(String, int)>
					//    5   10:astore_3        
						obj = ((Object) (settingsKey));
					//    6   11:aload_0         
					//    7   12:getfield        #22  <Field String val$settingsKey>
					//    8   15:astore_2        
						jsonobject = null;
					//    9   16:aconst_null     
					//   10   17:astore_1        
						obj = ((Object) (sharedpreferences.getString(((String) (obj)), ((String) (null)))));
					//   11   18:aload_3         
					//   12   19:aload_2         
					//   13   20:aconst_null     
					//   14   21:invokeinterface #45  <Method String SharedPreferences.getString(String, String)>
					//   15   26:astore_2        
						if(Utility.isNullOrEmpty(((String) (obj))))
							break MISSING_BLOCK_LABEL_68;
					//   16   27:aload_2         
					//   17   28:invokestatic    #49  <Method boolean Utility.isNullOrEmpty(String)>
					//   18   31:ifne            68
						obj = ((Object) (new JSONObject(((String) (obj)))));
					//   19   34:new             #51  <Class JSONObject>
					//   20   37:dup             
					//   21   38:aload_2         
					//   22   39:invokespecial   #54  <Method void JSONObject(String)>
					//   23   42:astore_2        
						jsonobject = ((JSONObject) (obj));
					//   24   43:aload_2         
					//   25   44:astore_1        
						break MISSING_BLOCK_LABEL_55;
					//   26   45:goto            55
						JSONException jsonexception;
						jsonexception;
					//   27   48:astore_2        
						Utility.logd("FacebookSDK", ((Exception) (jsonexception)));
					//   28   49:ldc1            #56  <String "FacebookSDK">
					//   29   51:aload_2         
					//   30   52:invokestatic    #60  <Method void Utility.logd(String, Exception)>
						if(jsonobject != null)
					//*  31   55:aload_1         
					//*  32   56:ifnull          68
							Utility.parseAppSettingsFromJSON(applicationId, jsonobject);
					//   33   59:aload_0         
					//   34   60:getfield        #24  <Field String val$applicationId>
					//   35   63:aload_1         
					//   36   64:invokestatic    #64  <Method Utility$FetchedAppSettings Utility.access$000(String, JSONObject)>
					//   37   67:pop             
						JSONObject jsonobject1 = Utility.getAppSettingsQueryResponse(applicationId);
					//   38   68:aload_0         
					//   39   69:getfield        #24  <Field String val$applicationId>
					//   40   72:invokestatic    #68  <Method JSONObject Utility.access$100(String)>
					//   41   75:astore_1        
						if(jsonobject1 != null)
					//*  42   76:aload_1         
					//*  43   77:ifnull          113
						{
							Utility.parseAppSettingsFromJSON(applicationId, jsonobject1);
					//   44   80:aload_0         
					//   45   81:getfield        #24  <Field String val$applicationId>
					//   46   84:aload_1         
					//   47   85:invokestatic    #64  <Method Utility$FetchedAppSettings Utility.access$000(String, JSONObject)>
					//   48   88:pop             
							sharedpreferences.edit().putString(settingsKey, jsonobject1.toString()).apply();
					//   49   89:aload_3         
					//   50   90:invokeinterface #72  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
					//   51   95:aload_0         
					//   52   96:getfield        #22  <Field String val$settingsKey>
					//   53   99:aload_1         
					//   54  100:invokevirtual   #76  <Method String JSONObject.toString()>
					//   55  103:invokeinterface #82  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
					//   56  108:invokeinterface #85  <Method void android.content.SharedPreferences$Editor.apply()>
						}
						Utility.loadingSettings.set(false);
					//   57  113:invokestatic    #89  <Method AtomicBoolean Utility.access$200()>
					//   58  116:iconst_0        
					//   59  117:invokevirtual   #95  <Method void AtomicBoolean.set(boolean)>
						return;
					//   60  120:return          
					}

					final String val$applicationId;
					final Context val$context;
					final String val$settingsKey;

			
			{
				context = context1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field Context val$context>
				settingsKey = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field String val$settingsKey>
				applicationId = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field String val$applicationId>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
				}
);
	//   24   47:invokestatic    #779 <Method Executor FacebookSdk.getExecutor()>
	//   25   50:new             #6   <Class Utility$1>
	//   26   53:dup             
	//   27   54:aload_0         
	//   28   55:aload_3         
	//   29   56:aload_1         
	//   30   57:invokespecial   #782 <Method void Utility$1(Context, String, String)>
	//   31   60:invokeinterface #788 <Method void Executor.execute(Runnable)>
				return;
	//   32   65:return          
			}
		} else
		{
			return;
	//   33   66:return          
		}
	}

	public static void logd(String s, Exception exception)
	{
		if(FacebookSdk.isDebugEnabled() && s != null && exception != null)
	//*   0    0:invokestatic    #793 <Method boolean FacebookSdk.isDebugEnabled()>
	//*   1    3:ifeq            60
	//*   2    6:aload_0         
	//*   3    7:ifnull          60
	//*   4   10:aload_1         
	//*   5   11:ifnull          60
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   14:new             #279 <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #280 <Method void StringBuilder()>
	//    9   21:astore_2        
			stringbuilder.append(((Object) (exception)).getClass().getSimpleName());
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #452 <Method Class Object.getClass()>
	//   13   27:invokevirtual   #457 <Method String Class.getSimpleName()>
	//   14   30:invokevirtual   #288 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:pop             
			stringbuilder.append(": ");
	//   16   34:aload_2         
	//   17   35:ldc2            #795 <String ": ">
	//   18   38:invokevirtual   #288 <Method StringBuilder StringBuilder.append(String)>
	//   19   41:pop             
			stringbuilder.append(exception.getMessage());
	//   20   42:aload_2         
	//   21   43:aload_1         
	//   22   44:invokevirtual   #800 <Method String Exception.getMessage()>
	//   23   47:invokevirtual   #288 <Method StringBuilder StringBuilder.append(String)>
	//   24   50:pop             
			Log.d(s, stringbuilder.toString());
	//   25   51:aload_0         
	//   26   52:aload_2         
	//   27   53:invokevirtual   #293 <Method String StringBuilder.toString()>
	//   28   56:invokestatic    #806 <Method int Log.d(String, String)>
	//   29   59:pop             
		}
	//   30   60:return          
	}

	public static void logd(String s, String s1)
	{
		if(FacebookSdk.isDebugEnabled() && s != null && s1 != null)
	//*   0    0:invokestatic    #793 <Method boolean FacebookSdk.isDebugEnabled()>
	//*   1    3:ifeq            20
	//*   2    6:aload_0         
	//*   3    7:ifnull          20
	//*   4   10:aload_1         
	//*   5   11:ifnull          20
			Log.d(s, s1);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokestatic    #806 <Method int Log.d(String, String)>
	//    9   19:pop             
	//   10   20:return          
	}

	public static void logd(String s, String s1, Throwable throwable)
	{
		if(FacebookSdk.isDebugEnabled() && !isNullOrEmpty(s))
	//*   0    0:invokestatic    #793 <Method boolean FacebookSdk.isDebugEnabled()>
	//*   1    3:ifeq            20
	//*   2    6:aload_0         
	//*   3    7:invokestatic    #326 <Method boolean isNullOrEmpty(String)>
	//*   4   10:ifne            20
			Log.d(s, s1, throwable);
	//    5   13:aload_0         
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:invokestatic    #810 <Method int Log.d(String, String, Throwable)>
	//    9   19:pop             
	//   10   20:return          
	}

	public static List map(List list, Mapper mapper)
	{
		if(list == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		ArrayList arraylist = new ArrayList();
	//    4    6:new             #155 <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #165 <Method void ArrayList()>
	//    7   13:astore_2        
		list = ((List) (list.iterator()));
	//    8   14:aload_0         
	//    9   15:invokeinterface #428 <Method Iterator List.iterator()>
	//   10   20:astore_0        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//   11   21:aload_0         
	//   12   22:invokeinterface #225 <Method boolean Iterator.hasNext()>
	//   13   27:ifeq            58
			Object obj = mapper.apply(((Iterator) (list)).next());
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:invokeinterface #229 <Method Object Iterator.next()>
	//   17   37:invokeinterface #814 <Method Object Utility$Mapper.apply(Object)>
	//   18   42:astore_3        
			if(obj != null)
	//*  19   43:aload_3         
	//*  20   44:ifnull          21
				((List) (arraylist)).add(obj);
	//   21   47:aload_2         
	//   22   48:aload_3         
	//   23   49:invokeinterface #432 <Method boolean List.add(Object)>
	//   24   54:pop             
		} while(true);
	//   25   55:goto            21
		if(((List) (arraylist)).size() == 0)
	//*  26   58:aload_2         
	//*  27   59:invokeinterface #435 <Method int List.size()>
	//*  28   64:ifne            69
			return null;
	//   29   67:aconst_null     
	//   30   68:areturn         
		else
			return ((List) (arraylist));
	//   31   69:aload_2         
	//   32   70:areturn         
	}

	public static String md5hash(String s)
	{
		return hashWithAlgorithm("MD5", s);
	//    0    0:ldc1            #75  <String "MD5">
	//    1    2:aload_0         
	//    2    3:invokestatic    #818 <Method String hashWithAlgorithm(String, String)>
	//    3    6:areturn         
	}

	private static FetchedAppSettings parseAppSettingsFromJSON(String s, JSONObject jsonobject)
	{
		Object obj = ((Object) (jsonobject.optJSONArray("android_sdk_error_categories")));
	//    0    0:aload_1         
	//    1    1:ldc1            #38  <String "android_sdk_error_categories">
	//    2    3:invokevirtual   #822 <Method JSONArray JSONObject.optJSONArray(String)>
	//    3    6:astore_2        
		if(obj == null)
	//*   4    7:aload_2         
	//*   5    8:ifnonnull       18
			obj = ((Object) (FacebookRequestErrorClassification.getDefaultErrorClassification()));
	//    6   11:invokestatic    #828 <Method FacebookRequestErrorClassification FacebookRequestErrorClassification.getDefaultErrorClassification()>
	//    7   14:astore_2        
		else
	//*   8   15:goto            26
			obj = ((Object) (FacebookRequestErrorClassification.createFromJSON(((JSONArray) (obj)))));
	//    9   18:aload_2         
	//   10   19:invokestatic    #832 <Method FacebookRequestErrorClassification FacebookRequestErrorClassification.createFromJSON(JSONArray)>
	//   11   22:astore_2        
	//*  12   23:goto            15
		jsonobject = ((JSONObject) (new FetchedAppSettings(jsonobject.optBoolean("supports_implicit_sdk_logging", false), jsonobject.optString("gdpv4_nux_content", ""), jsonobject.optBoolean("gdpv4_nux_enabled", false), parseDialogConfigurations(jsonobject.optJSONObject("android_dialog_configs")), ((FacebookRequestErrorClassification) (obj)))));
	//   13   26:new             #15  <Class Utility$FetchedAppSettings>
	//   14   29:dup             
	//   15   30:aload_1         
	//   16   31:ldc1            #52  <String "supports_implicit_sdk_logging">
	//   17   33:iconst_0        
	//   18   34:invokevirtual   #836 <Method boolean JSONObject.optBoolean(String, boolean)>
	//   19   37:aload_1         
	//   20   38:ldc1            #46  <String "gdpv4_nux_content">
	//   21   40:ldc1            #99  <String "">
	//   22   42:invokevirtual   #838 <Method String JSONObject.optString(String, String)>
	//   23   45:aload_1         
	//   24   46:ldc1            #49  <String "gdpv4_nux_enabled">
	//   25   48:iconst_0        
	//   26   49:invokevirtual   #836 <Method boolean JSONObject.optBoolean(String, boolean)>
	//   27   52:aload_1         
	//   28   53:ldc1            #41  <String "android_dialog_configs">
	//   29   55:invokevirtual   #841 <Method JSONObject JSONObject.optJSONObject(String)>
	//   30   58:invokestatic    #844 <Method Map parseDialogConfigurations(JSONObject)>
	//   31   61:aload_2         
	//   32   62:aconst_null     
	//   33   63:invokespecial   #847 <Method void Utility$FetchedAppSettings(boolean, String, boolean, Map, FacebookRequestErrorClassification, Utility$1)>
	//   34   66:astore_1        
		fetchedAppSettings.put(((Object) (s)), ((Object) (jsonobject)));
	//   35   67:getstatic       #122 <Field Map fetchedAppSettings>
	//   36   70:aload_0         
	//   37   71:aload_1         
	//   38   72:invokeinterface #848 <Method Object Map.put(Object, Object)>
	//   39   77:pop             
		return ((FetchedAppSettings) (jsonobject));
	//   40   78:aload_1         
	//   41   79:areturn         
	}

	private static Map parseDialogConfigurations(JSONObject jsonobject)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #341 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #342 <Method void HashMap()>
	//    3    7:astore_3        
		if(jsonobject != null)
	//*   4    8:aload_0         
	//*   5    9:ifnull          116
		{
			JSONArray jsonarray = jsonobject.optJSONArray("data");
	//    6   12:aload_0         
	//    7   13:ldc2            #850 <String "data">
	//    8   16:invokevirtual   #822 <Method JSONArray JSONObject.optJSONArray(String)>
	//    9   19:astore          4
			if(jsonarray != null)
	//*  10   21:aload           4
	//*  11   23:ifnull          116
			{
				for(int i = 0; i < jsonarray.length(); i++)
	//*  12   26:iconst_0        
	//*  13   27:istore_1        
	//*  14   28:iload_1         
	//*  15   29:aload           4
	//*  16   31:invokevirtual   #354 <Method int JSONArray.length()>
	//*  17   34:icmpge          116
				{
					DialogFeatureConfig dialogfeatureconfig = DialogFeatureConfig.parseDialogConfig(jsonarray.optJSONObject(i));
	//   18   37:aload           4
	//   19   39:iload_1         
	//   20   40:invokevirtual   #853 <Method JSONObject JSONArray.optJSONObject(int)>
	//   21   43:invokestatic    #857 <Method Utility$DialogFeatureConfig Utility$DialogFeatureConfig.access$400(JSONObject)>
	//   22   46:astore          5
					if(dialogfeatureconfig == null)
	//*  23   48:aload           5
	//*  24   50:ifnonnull       56
						continue;
	//   25   53:goto            109
					String s = dialogfeatureconfig.getDialogName();
	//   26   56:aload           5
	//   27   58:invokevirtual   #860 <Method String Utility$DialogFeatureConfig.getDialogName()>
	//   28   61:astore          6
					Map map1 = (Map)hashmap.get(((Object) (s)));
	//   29   63:aload_3         
	//   30   64:aload           6
	//   31   66:invokevirtual   #861 <Method Object HashMap.get(Object)>
	//   32   69:checkcast       #484 <Class Map>
	//   33   72:astore_2        
					jsonobject = ((JSONObject) (map1));
	//   34   73:aload_2         
	//   35   74:astore_0        
					if(map1 == null)
	//*  36   75:aload_2         
	//*  37   76:ifnonnull       95
					{
						jsonobject = ((JSONObject) (new HashMap()));
	//   38   79:new             #341 <Class HashMap>
	//   39   82:dup             
	//   40   83:invokespecial   #342 <Method void HashMap()>
	//   41   86:astore_0        
						hashmap.put(((Object) (s)), ((Object) (jsonobject)));
	//   42   87:aload_3         
	//   43   88:aload           6
	//   44   90:aload_0         
	//   45   91:invokevirtual   #365 <Method Object HashMap.put(Object, Object)>
	//   46   94:pop             
					}
					((Map) (jsonobject)).put(((Object) (dialogfeatureconfig.getFeatureName())), ((Object) (dialogfeatureconfig)));
	//   47   95:aload_0         
	//   48   96:aload           5
	//   49   98:invokevirtual   #864 <Method String Utility$DialogFeatureConfig.getFeatureName()>
	//   50  101:aload           5
	//   51  103:invokeinterface #848 <Method Object Map.put(Object, Object)>
	//   52  108:pop             
				}

	//   53  109:iload_1         
	//   54  110:iconst_1        
	//   55  111:iadd            
	//   56  112:istore_1        
			}
		}
	//*  57  113:goto            28
		return ((Map) (hashmap));
	//   58  116:aload_3         
	//   59  117:areturn         
	}

	public static Bundle parseUrlQueryString(String s)
	{
		int i;
		int j;
		Bundle bundle;
		bundle = new Bundle();
	//    0    0:new             #209 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #458 <Method void Bundle()>
	//    3    7:astore_3        
		if(isNullOrEmpty(s))
			break MISSING_BLOCK_LABEL_117;
	//    4    8:aload_0         
	//    5    9:invokestatic    #326 <Method boolean isNullOrEmpty(String)>
	//    6   12:ifne            117
		s = ((String) (s.split("&")));
	//    7   15:aload_0         
	//    8   16:ldc2            #871 <String "&">
	//    9   19:invokevirtual   #275 <Method String[] String.split(String)>
	//   10   22:astore_0        
		j = s.length;
	//   11   23:aload_0         
	//   12   24:arraylength     
	//   13   25:istore_2        
		i = 0;
	//   14   26:iconst_0        
	//   15   27:istore_1        
_L3:
		if(i >= j) goto _L2; else goto _L1
	//   16   28:iload_1         
	//   17   29:iload_2         
	//   18   30:icmpge          117
_L1:
		String as[] = ((String) (s[i])).split("=");
	//   19   33:aload_0         
	//   20   34:iload_1         
	//   21   35:aaload          
	//   22   36:ldc2            #277 <String "=">
	//   23   39:invokevirtual   #275 <Method String[] String.split(String)>
	//   24   42:astore          4
		if(as.length == 2)
	//*  25   44:aload           4
	//*  26   46:arraylength     
	//*  27   47:iconst_2        
	//*  28   48:icmpne          76
		{
			bundle.putString(URLDecoder.decode(as[0], "UTF-8"), URLDecoder.decode(as[1], "UTF-8"));
	//   29   51:aload_3         
	//   30   52:aload           4
	//   31   54:iconst_0        
	//   32   55:aaload          
	//   33   56:ldc1            #89  <String "UTF-8">
	//   34   58:invokestatic    #876 <Method String URLDecoder.decode(String, String)>
	//   35   61:aload           4
	//   36   63:iconst_1        
	//   37   64:aaload          
	//   38   65:ldc1            #89  <String "UTF-8">
	//   39   67:invokestatic    #876 <Method String URLDecoder.decode(String, String)>
	//   40   70:invokevirtual   #469 <Method void Bundle.putString(String, String)>
			continue; /* Loop/switch isn't completed */
	//   41   73:goto            110
		}
		try
		{
			if(as.length == 1)
	//*  42   76:aload           4
	//*  43   78:arraylength     
	//*  44   79:iconst_1        
	//*  45   80:icmpne          110
				bundle.putString(URLDecoder.decode(as[0], "UTF-8"), "");
	//   46   83:aload_3         
	//   47   84:aload           4
	//   48   86:iconst_0        
	//   49   87:aaload          
	//   50   88:ldc1            #89  <String "UTF-8">
	//   51   90:invokestatic    #876 <Method String URLDecoder.decode(String, String)>
	//   52   93:ldc1            #99  <String "">
	//   53   95:invokevirtual   #469 <Method void Bundle.putString(String, String)>
		}
	//*  54   98:goto            110
		catch(UnsupportedEncodingException unsupportedencodingexception)
	//*  55  101:astore          4
		{
			logd("FacebookSDK", ((Exception) (unsupportedencodingexception)));
	//   56  103:ldc1            #81  <String "FacebookSDK">
	//   57  105:aload           4
	//   58  107:invokestatic    #878 <Method void logd(String, Exception)>
		}
		i++;
	//   59  110:iload_1         
	//   60  111:iconst_1        
	//   61  112:iadd            
	//   62  113:istore_1        
		  goto _L3
	//*  63  114:goto            28
_L2:
		return bundle;
	//   64  117:aload_3         
	//   65  118:areturn         
	}

	public static void putCommaSeparatedStringList(Bundle bundle, String s, ArrayList arraylist)
	{
		if(arraylist != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          79
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #279 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #280 <Method void StringBuilder()>
	//    5   11:astore_3        
			for(arraylist = ((ArrayList) (arraylist.iterator())); ((Iterator) (arraylist)).hasNext(); stringbuilder.append(","))
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #881 <Method Iterator ArrayList.iterator()>
	//*   8   16:astore_2        
	//*   9   17:aload_2         
	//*  10   18:invokeinterface #225 <Method boolean Iterator.hasNext()>
	//*  11   23:ifeq            51
				stringbuilder.append((String)((Iterator) (arraylist)).next());
	//   12   26:aload_3         
	//   13   27:aload_2         
	//   14   28:invokeinterface #229 <Method Object Iterator.next()>
	//   15   33:checkcast       #113 <Class String>
	//   16   36:invokevirtual   #288 <Method StringBuilder StringBuilder.append(String)>
	//   17   39:pop             

	//   18   40:aload_3         
	//   19   41:ldc2            #460 <String ",">
	//   20   44:invokevirtual   #288 <Method StringBuilder StringBuilder.append(String)>
	//   21   47:pop             
	//*  22   48:goto            17
			arraylist = "";
	//   23   51:ldc1            #99  <String "">
	//   24   53:astore_2        
			if(stringbuilder.length() > 0)
	//*  25   54:aload_3         
	//*  26   55:invokevirtual   #882 <Method int StringBuilder.length()>
	//*  27   58:ifle            73
				arraylist = ((ArrayList) (stringbuilder.substring(0, stringbuilder.length() - 1)));
	//   28   61:aload_3         
	//   29   62:iconst_0        
	//   30   63:aload_3         
	//   31   64:invokevirtual   #882 <Method int StringBuilder.length()>
	//   32   67:iconst_1        
	//   33   68:isub            
	//   34   69:invokevirtual   #886 <Method String StringBuilder.substring(int, int)>
	//   35   72:astore_2        
			bundle.putString(s, ((String) (arraylist)));
	//   36   73:aload_0         
	//   37   74:aload_1         
	//   38   75:aload_2         
	//   39   76:invokevirtual   #469 <Method void Bundle.putString(String, String)>
		}
	//   40   79:return          
	}

	public static boolean putJSONValueInBundle(Bundle bundle, String s, Object obj)
	{
label0:
		{
			if(obj == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       12
				bundle.remove(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #892 <Method void Bundle.remove(String)>
			else
	//*   5    9:goto            236
			if(obj instanceof Boolean)
	//*   6   12:aload_2         
	//*   7   13:instanceof      #894 <Class Boolean>
	//*   8   16:ifeq            34
				bundle.putBoolean(s, ((Boolean)obj).booleanValue());
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:checkcast       #894 <Class Boolean>
	//   13   25:invokevirtual   #897 <Method boolean Boolean.booleanValue()>
	//   14   28:invokevirtual   #901 <Method void Bundle.putBoolean(String, boolean)>
			else
	//*  15   31:goto            236
			if(obj instanceof boolean[])
	//*  16   34:aload_2         
	//*  17   35:instanceof      #903 <Class boolean[]>
	//*  18   38:ifeq            53
				bundle.putBooleanArray(s, (boolean[])obj);
	//   19   41:aload_0         
	//   20   42:aload_1         
	//   21   43:aload_2         
	//   22   44:checkcast       #903 <Class boolean[]>
	//   23   47:invokevirtual   #907 <Method void Bundle.putBooleanArray(String, boolean[])>
			else
	//*  24   50:goto            236
			if(obj instanceof Double)
	//*  25   53:aload_2         
	//*  26   54:instanceof      #909 <Class Double>
	//*  27   57:ifeq            75
				bundle.putDouble(s, ((Double)obj).doubleValue());
	//   28   60:aload_0         
	//   29   61:aload_1         
	//   30   62:aload_2         
	//   31   63:checkcast       #909 <Class Double>
	//   32   66:invokevirtual   #913 <Method double Double.doubleValue()>
	//   33   69:invokevirtual   #917 <Method void Bundle.putDouble(String, double)>
			else
	//*  34   72:goto            236
			if(obj instanceof double[])
	//*  35   75:aload_2         
	//*  36   76:instanceof      #919 <Class double[]>
	//*  37   79:ifeq            94
				bundle.putDoubleArray(s, (double[])obj);
	//   38   82:aload_0         
	//   39   83:aload_1         
	//   40   84:aload_2         
	//   41   85:checkcast       #919 <Class double[]>
	//   42   88:invokevirtual   #923 <Method void Bundle.putDoubleArray(String, double[])>
			else
	//*  43   91:goto            236
			if(obj instanceof Integer)
	//*  44   94:aload_2         
	//*  45   95:instanceof      #668 <Class Integer>
	//*  46   98:ifeq            116
				bundle.putInt(s, ((Integer)obj).intValue());
	//   47  101:aload_0         
	//   48  102:aload_1         
	//   49  103:aload_2         
	//   50  104:checkcast       #668 <Class Integer>
	//   51  107:invokevirtual   #926 <Method int Integer.intValue()>
	//   52  110:invokevirtual   #930 <Method void Bundle.putInt(String, int)>
			else
	//*  53  113:goto            236
			if(obj instanceof int[])
	//*  54  116:aload_2         
	//*  55  117:instanceof      #932 <Class int[]>
	//*  56  120:ifeq            135
				bundle.putIntArray(s, (int[])obj);
	//   57  123:aload_0         
	//   58  124:aload_1         
	//   59  125:aload_2         
	//   60  126:checkcast       #932 <Class int[]>
	//   61  129:invokevirtual   #936 <Method void Bundle.putIntArray(String, int[])>
			else
	//*  62  132:goto            236
			if(obj instanceof Long)
	//*  63  135:aload_2         
	//*  64  136:instanceof      #493 <Class Long>
	//*  65  139:ifeq            157
				bundle.putLong(s, ((Long)obj).longValue());
	//   66  142:aload_0         
	//   67  143:aload_1         
	//   68  144:aload_2         
	//   69  145:checkcast       #493 <Class Long>
	//   70  148:invokevirtual   #497 <Method long Long.longValue()>
	//   71  151:invokevirtual   #940 <Method void Bundle.putLong(String, long)>
			else
	//*  72  154:goto            236
			if(obj instanceof long[])
	//*  73  157:aload_2         
	//*  74  158:instanceof      #942 <Class long[]>
	//*  75  161:ifeq            176
				bundle.putLongArray(s, (long[])obj);
	//   76  164:aload_0         
	//   77  165:aload_1         
	//   78  166:aload_2         
	//   79  167:checkcast       #942 <Class long[]>
	//   80  170:invokevirtual   #946 <Method void Bundle.putLongArray(String, long[])>
			else
	//*  81  173:goto            236
			if(obj instanceof String)
	//*  82  176:aload_2         
	//*  83  177:instanceof      #113 <Class String>
	//*  84  180:ifeq            195
				bundle.putString(s, (String)obj);
	//   85  183:aload_0         
	//   86  184:aload_1         
	//   87  185:aload_2         
	//   88  186:checkcast       #113 <Class String>
	//   89  189:invokevirtual   #469 <Method void Bundle.putString(String, String)>
			else
	//*  90  192:goto            236
			if(obj instanceof JSONArray)
	//*  91  195:aload_2         
	//*  92  196:instanceof      #350 <Class JSONArray>
	//*  93  199:ifeq            217
			{
				bundle.putString(s, ((JSONArray)obj).toString());
	//   94  202:aload_0         
	//   95  203:aload_1         
	//   96  204:aload_2         
	//   97  205:checkcast       #350 <Class JSONArray>
	//   98  208:invokevirtual   #947 <Method String JSONArray.toString()>
	//   99  211:invokevirtual   #469 <Method void Bundle.putString(String, String)>
			} else
	//* 100  214:goto            236
			{
				if(!(obj instanceof JSONObject))
					break label0;
	//  101  217:aload_2         
	//  102  218:instanceof      #344 <Class JSONObject>
	//  103  221:ifeq            238
				bundle.putString(s, ((JSONObject)obj).toString());
	//  104  224:aload_0         
	//  105  225:aload_1         
	//  106  226:aload_2         
	//  107  227:checkcast       #344 <Class JSONObject>
	//  108  230:invokevirtual   #948 <Method String JSONObject.toString()>
	//  109  233:invokevirtual   #469 <Method void Bundle.putString(String, String)>
			}
			return true;
	//  110  236:iconst_1        
	//  111  237:ireturn         
		}
		return false;
	//  112  238:iconst_0        
	//  113  239:ireturn         
	}

	public static void putNonEmptyString(Bundle bundle, String s, String s1)
	{
		if(!isNullOrEmpty(s1))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #326 <Method boolean isNullOrEmpty(String)>
	//*   2    4:ifne            13
			bundle.putString(s, s1);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #469 <Method void Bundle.putString(String, String)>
	//    7   13:return          
	}

	public static void putUri(Bundle bundle, String s, Uri uri)
	{
		if(uri != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          13
			putNonEmptyString(bundle, s, uri.toString());
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #644 <Method String Uri.toString()>
	//    6   10:invokestatic    #954 <Method void putNonEmptyString(Bundle, String, String)>
	//    7   13:return          
	}

	public static FetchedAppSettings queryAppSettings(String s, boolean flag)
	{
		if(!flag && fetchedAppSettings.containsKey(((Object) (s))))
	//*   0    0:iload_1         
	//*   1    1:ifne            29
	//*   2    4:getstatic       #122 <Field Map fetchedAppSettings>
	//*   3    7:aload_0         
	//*   4    8:invokeinterface #771 <Method boolean Map.containsKey(Object)>
	//*   5   13:ifeq            29
			return (FetchedAppSettings)fetchedAppSettings.get(((Object) (s)));
	//    6   16:getstatic       #122 <Field Map fetchedAppSettings>
	//    7   19:aload_0         
	//    8   20:invokeinterface #487 <Method Object Map.get(Object)>
	//    9   25:checkcast       #15  <Class Utility$FetchedAppSettings>
	//   10   28:areturn         
		JSONObject jsonobject = getAppSettingsQueryResponse(s);
	//   11   29:aload_0         
	//   12   30:invokestatic    #141 <Method JSONObject getAppSettingsQueryResponse(String)>
	//   13   33:astore_2        
		if(jsonobject == null)
	//*  14   34:aload_2         
	//*  15   35:ifnonnull       40
			return null;
	//   16   38:aconst_null     
	//   17   39:areturn         
		else
			return parseAppSettingsFromJSON(s, jsonobject);
	//   18   40:aload_0         
	//   19   41:aload_2         
	//   20   42:invokestatic    #136 <Method Utility$FetchedAppSettings parseAppSettingsFromJSON(String, JSONObject)>
	//   21   45:areturn         
	}

	public static String readStreamToString(InputStream inputstream)
		throws IOException
	{
		BufferedInputStream bufferedinputstream = new BufferedInputStream(inputstream);
	//    0    0:new             #370 <Class BufferedInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #373 <Method void BufferedInputStream(InputStream)>
	//    4    8:astore_3        
		Object obj = ((Object) (new InputStreamReader(((InputStream) (bufferedinputstream)))));
	//    5    9:new             #960 <Class InputStreamReader>
	//    6   12:dup             
	//    7   13:aload_3         
	//    8   14:invokespecial   #961 <Method void InputStreamReader(InputStream)>
	//    9   17:astore_2        
		char ac[];
		inputstream = ((InputStream) (new StringBuilder()));
	//   10   18:new             #279 <Class StringBuilder>
	//   11   21:dup             
	//   12   22:invokespecial   #280 <Method void StringBuilder()>
	//   13   25:astore_0        
		ac = new char[2048];
	//   14   26:sipush          2048
	//   15   29:newarray        char[]
	//   16   31:astore          4
_L1:
		int i = ((InputStreamReader) (obj)).read(ac);
	//   17   33:aload_2         
	//   18   34:aload           4
	//   19   36:invokevirtual   #964 <Method int InputStreamReader.read(char[])>
	//   20   39:istore_1        
		if(i == -1)
			break MISSING_BLOCK_LABEL_57;
	//   21   40:iload_1         
	//   22   41:iconst_m1       
	//   23   42:icmpeq          57
		((StringBuilder) (inputstream)).append(ac, 0, i);
	//   24   45:aload_0         
	//   25   46:aload           4
	//   26   48:iconst_0        
	//   27   49:iload_1         
	//   28   50:invokevirtual   #967 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//   29   53:pop             
		  goto _L1
	//*  30   54:goto            33
		inputstream = ((InputStream) (((StringBuilder) (inputstream)).toString()));
	//   31   57:aload_0         
	//   32   58:invokevirtual   #293 <Method String StringBuilder.toString()>
	//   33   61:astore_0        
		closeQuietly(((Closeable) (bufferedinputstream)));
	//   34   62:aload_3         
	//   35   63:invokestatic    #969 <Method void closeQuietly(Closeable)>
		closeQuietly(((Closeable) (obj)));
	//   36   66:aload_2         
	//   37   67:invokestatic    #969 <Method void closeQuietly(Closeable)>
		return ((String) (inputstream));
	//   38   70:aload_0         
	//   39   71:areturn         
		inputstream;
	//   40   72:astore_0        
		break MISSING_BLOCK_LABEL_87;
	//   41   73:goto            87
		inputstream;
	//   42   76:astore_0        
		obj = null;
	//   43   77:aconst_null     
	//   44   78:astore_2        
		break MISSING_BLOCK_LABEL_87;
	//   45   79:goto            87
		inputstream;
	//   46   82:astore_0        
		bufferedinputstream = null;
	//   47   83:aconst_null     
	//   48   84:astore_3        
		obj = ((Object) (bufferedinputstream));
	//   49   85:aload_3         
	//   50   86:astore_2        
		closeQuietly(((Closeable) (bufferedinputstream)));
	//   51   87:aload_3         
	//   52   88:invokestatic    #969 <Method void closeQuietly(Closeable)>
		closeQuietly(((Closeable) (obj)));
	//   53   91:aload_2         
	//   54   92:invokestatic    #969 <Method void closeQuietly(Closeable)>
		throw inputstream;
	//   55   95:aload_0         
	//   56   96:athrow          
	}

	public static Map readStringMapFromParcel(Parcel parcel)
	{
		int j = parcel.readInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #976 <Method int Parcel.readInt()>
	//    2    4:istore_2        
		if(j < 0)
	//*   3    5:iload_2         
	//*   4    6:ifge            11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		HashMap hashmap = new HashMap();
	//    7   11:new             #341 <Class HashMap>
	//    8   14:dup             
	//    9   15:invokespecial   #342 <Method void HashMap()>
	//   10   18:astore_3        
		for(int i = 0; i < j; i++)
	//*  11   19:iconst_0        
	//*  12   20:istore_1        
	//*  13   21:iload_1         
	//*  14   22:iload_2         
	//*  15   23:icmpge          48
			((Map) (hashmap)).put(((Object) (parcel.readString())), ((Object) (parcel.readString())));
	//   16   26:aload_3         
	//   17   27:aload_0         
	//   18   28:invokevirtual   #979 <Method String Parcel.readString()>
	//   19   31:aload_0         
	//   20   32:invokevirtual   #979 <Method String Parcel.readString()>
	//   21   35:invokeinterface #848 <Method Object Map.put(Object, Object)>
	//   22   40:pop             

	//   23   41:iload_1         
	//   24   42:iconst_1        
	//   25   43:iadd            
	//   26   44:istore_1        
	//*  27   45:goto            21
		return ((Map) (hashmap));
	//   28   48:aload_3         
	//   29   49:areturn         
	}

	private static void refreshAvailableExternalStorage()
	{
		try
		{
			if(externalStorageExists())
	//*   0    0:invokestatic    #983 <Method boolean externalStorageExists()>
	//*   1    3:ifeq            34
			{
				StatFs statfs = new StatFs(Environment.getExternalStorageDirectory().getPath());
	//    2    6:new             #985 <Class StatFs>
	//    3    9:dup             
	//    4   10:invokestatic    #989 <Method File Environment.getExternalStorageDirectory()>
	//    5   13:invokevirtual   #992 <Method String File.getPath()>
	//    6   16:invokespecial   #993 <Method void StatFs(String)>
	//    7   19:astore_0        
				availableExternalStorageGB = (long)statfs.getAvailableBlocks() * (long)statfs.getBlockSize();
	//    8   20:aload_0         
	//    9   21:invokevirtual   #996 <Method int StatFs.getAvailableBlocks()>
	//   10   24:i2l             
	//   11   25:aload_0         
	//   12   26:invokevirtual   #999 <Method int StatFs.getBlockSize()>
	//   13   29:i2l             
	//   14   30:lmul            
	//   15   31:putstatic       #1001 <Field long availableExternalStorageGB>
			}
			availableExternalStorageGB = convertBytesToGB(availableExternalStorageGB);
	//   16   34:getstatic       #1001 <Field long availableExternalStorageGB>
	//   17   37:l2d             
	//   18   38:invokestatic    #1003 <Method long convertBytesToGB(double)>
	//   19   41:putstatic       #1001 <Field long availableExternalStorageGB>
			return;
	//   20   44:return          
		}
		catch(Exception exception)
	//*  21   45:astore_0        
		{
			return;
	//   22   46:return          
		}
	}

	private static int refreshBestGuessNumberOfCPUCores()
	{
		if(numCPUCores > 0)
	//*   0    0:getstatic       #1006 <Field int numCPUCores>
	//*   1    3:ifle            10
			return numCPUCores;
	//    2    6:getstatic       #1006 <Field int numCPUCores>
	//    3    9:ireturn         
		try
		{
			numCPUCores = (new File("/sys/devices/system/cpu/")).listFiles(new FilenameFilter() {

				public boolean accept(File file, String s)
				{
					return Pattern.matches("cpu[0-9]+", ((CharSequence) (s)));
				//    0    0:ldc1            #20  <String "cpu[0-9]+">
				//    1    2:aload_2         
				//    2    3:invokestatic    #26  <Method boolean Pattern.matches(String, CharSequence)>
				//    3    6:ireturn         
				}

			}
).length;
	//    4   10:new             #392 <Class File>
	//    5   13:dup             
	//    6   14:ldc2            #1008 <String "/sys/devices/system/cpu/">
	//    7   17:invokespecial   #1009 <Method void File(String)>
	//    8   20:new             #10  <Class Utility$3>
	//    9   23:dup             
	//   10   24:invokespecial   #1010 <Method void Utility$3()>
	//   11   27:invokevirtual   #1013 <Method File[] File.listFiles(FilenameFilter)>
	//   12   30:arraylength     
	//   13   31:putstatic       #1006 <Field int numCPUCores>
		}
	//*  14   34:getstatic       #1006 <Field int numCPUCores>
	//*  15   37:ifgt            53
	//*  16   40:invokestatic    #1019 <Method Runtime Runtime.getRuntime()>
	//*  17   43:invokevirtual   #1022 <Method int Runtime.availableProcessors()>
	//*  18   46:iconst_1        
	//*  19   47:invokestatic    #1026 <Method int Math.max(int, int)>
	//*  20   50:putstatic       #1006 <Field int numCPUCores>
	//*  21   53:getstatic       #1006 <Field int numCPUCores>
	//*  22   56:ireturn         
		catch(Exception exception) { }
	//   23   57:astore_0        
		if(numCPUCores <= 0)
			numCPUCores = Math.max(Runtime.getRuntime().availableProcessors(), 1);
		return numCPUCores;
	//*  24   58:goto            34
	}

	private static void refreshCarrierName(Context context)
	{
		if(!carrierName.equals("NoCarrier"))
			break MISSING_BLOCK_LABEL_27;
	//    0    0:getstatic       #1029 <Field String carrierName>
	//    1    3:ldc1            #96  <String "NoCarrier">
	//    2    5:invokevirtual   #423 <Method boolean String.equals(Object)>
	//    3    8:ifeq            27
		carrierName = ((TelephonyManager)context.getSystemService("phone")).getNetworkOperatorName();
	//    4   11:aload_0         
	//    5   12:ldc2            #1031 <String "phone">
	//    6   15:invokevirtual   #1034 <Method Object Context.getSystemService(String)>
	//    7   18:checkcast       #1036 <Class TelephonyManager>
	//    8   21:invokevirtual   #1039 <Method String TelephonyManager.getNetworkOperatorName()>
	//    9   24:putstatic       #1029 <Field String carrierName>
		return;
	//   10   27:return          
		context;
	//   11   28:astore_0        
	//   12   29:return          
	}

	private static void refreshPeriodicExtendedDeviceInfo(Context context)
	{
		if(timestampOfLastCheck == -1L || System.currentTimeMillis() - timestampOfLastCheck >= 0x1b7740L)
	//*   0    0:getstatic       #1042 <Field long timestampOfLastCheck>
	//*   1    3:ldc2w           #92  <Long -1L>
	//*   2    6:lcmp            
	//*   3    7:ifeq            24
	//*   4   10:invokestatic    #1047 <Method long System.currentTimeMillis()>
	//*   5   13:getstatic       #1042 <Field long timestampOfLastCheck>
	//*   6   16:lsub            
	//*   7   17:ldc2w           #1048 <Long 0x1b7740L>
	//*   8   20:lcmp            
	//*   9   21:iflt            43
		{
			timestampOfLastCheck = System.currentTimeMillis();
	//   10   24:invokestatic    #1047 <Method long System.currentTimeMillis()>
	//   11   27:putstatic       #1042 <Field long timestampOfLastCheck>
			refreshTimezone();
	//   12   30:invokestatic    #1052 <Method void refreshTimezone()>
			refreshCarrierName(context);
	//   13   33:aload_0         
	//   14   34:invokestatic    #1054 <Method void refreshCarrierName(Context)>
			refreshTotalExternalStorage();
	//   15   37:invokestatic    #1057 <Method void refreshTotalExternalStorage()>
			refreshAvailableExternalStorage();
	//   16   40:invokestatic    #1059 <Method void refreshAvailableExternalStorage()>
		}
	//   17   43:return          
	}

	private static void refreshTimezone()
	{
		try
		{
			TimeZone timezone = TimeZone.getDefault();
	//    0    0:invokestatic    #1065 <Method TimeZone TimeZone.getDefault()>
	//    1    3:astore_0        
			deviceTimezone = timezone.getDisplayName(timezone.inDaylightTime(new Date()), 0);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:new             #503 <Class Date>
	//    5    9:dup             
	//    6   10:invokespecial   #1066 <Method void Date()>
	//    7   13:invokevirtual   #1070 <Method boolean TimeZone.inDaylightTime(Date)>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #1074 <Method String TimeZone.getDisplayName(boolean, int)>
	//   10   20:putstatic       #1076 <Field String deviceTimezone>
			return;
	//   11   23:return          
		}
		catch(Exception exception)
	//*  12   24:astore_0        
		{
			return;
	//   13   25:return          
		}
	}

	private static void refreshTotalExternalStorage()
	{
		try
		{
			if(externalStorageExists())
	//*   0    0:invokestatic    #983 <Method boolean externalStorageExists()>
	//*   1    3:ifeq            34
			{
				StatFs statfs = new StatFs(Environment.getExternalStorageDirectory().getPath());
	//    2    6:new             #985 <Class StatFs>
	//    3    9:dup             
	//    4   10:invokestatic    #989 <Method File Environment.getExternalStorageDirectory()>
	//    5   13:invokevirtual   #992 <Method String File.getPath()>
	//    6   16:invokespecial   #993 <Method void StatFs(String)>
	//    7   19:astore_0        
				totalExternalStorageGB = (long)statfs.getBlockCount() * (long)statfs.getBlockSize();
	//    8   20:aload_0         
	//    9   21:invokevirtual   #1079 <Method int StatFs.getBlockCount()>
	//   10   24:i2l             
	//   11   25:aload_0         
	//   12   26:invokevirtual   #999 <Method int StatFs.getBlockSize()>
	//   13   29:i2l             
	//   14   30:lmul            
	//   15   31:putstatic       #1081 <Field long totalExternalStorageGB>
			}
			totalExternalStorageGB = convertBytesToGB(totalExternalStorageGB);
	//   16   34:getstatic       #1081 <Field long totalExternalStorageGB>
	//   17   37:l2d             
	//   18   38:invokestatic    #1003 <Method long convertBytesToGB(double)>
	//   19   41:putstatic       #1081 <Field long totalExternalStorageGB>
			return;
	//   20   44:return          
		}
		catch(Exception exception)
	//*  21   45:astore_0        
		{
			return;
	//   22   46:return          
		}
	}

	public static String safeGetStringFromResponse(JSONObject jsonobject, String s)
	{
		if(jsonobject != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          12
			return jsonobject.optString(s, "");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #99  <String "">
	//    5    8:invokevirtual   #838 <Method String JSONObject.optString(String, String)>
	//    6   11:areturn         
		else
			return "";
	//    7   12:ldc1            #99  <String "">
	//    8   14:areturn         
	}

	public static void setAppEventAttributionParameters(JSONObject jsonobject, AttributionIdentifiers attributionidentifiers, String s, boolean flag)
		throws JSONException
	{
		if(attributionidentifiers != null && attributionidentifiers.getAttributionId() != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          23
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #1090 <Method String AttributionIdentifiers.getAttributionId()>
	//*   4    8:ifnull          23
			jsonobject.put("attribution", ((Object) (attributionidentifiers.getAttributionId())));
	//    5   11:aload_0         
	//    6   12:ldc2            #1092 <String "attribution">
	//    7   15:aload_1         
	//    8   16:invokevirtual   #1090 <Method String AttributionIdentifiers.getAttributionId()>
	//    9   19:invokevirtual   #1094 <Method JSONObject JSONObject.put(String, Object)>
	//   10   22:pop             
		if(attributionidentifiers != null && attributionidentifiers.getAndroidAdvertiserId() != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          60
	//*  13   27:aload_1         
	//*  14   28:invokevirtual   #1097 <Method String AttributionIdentifiers.getAndroidAdvertiserId()>
	//*  15   31:ifnull          60
		{
			jsonobject.put("advertiser_id", ((Object) (attributionidentifiers.getAndroidAdvertiserId())));
	//   16   34:aload_0         
	//   17   35:ldc2            #1099 <String "advertiser_id">
	//   18   38:aload_1         
	//   19   39:invokevirtual   #1097 <Method String AttributionIdentifiers.getAndroidAdvertiserId()>
	//   20   42:invokevirtual   #1094 <Method JSONObject JSONObject.put(String, Object)>
	//   21   45:pop             
			jsonobject.put("advertiser_tracking_enabled", attributionidentifiers.isTrackingLimited() ^ true);
	//   22   46:aload_0         
	//   23   47:ldc2            #1101 <String "advertiser_tracking_enabled">
	//   24   50:aload_1         
	//   25   51:invokevirtual   #1104 <Method boolean AttributionIdentifiers.isTrackingLimited()>
	//   26   54:iconst_1        
	//   27   55:ixor            
	//   28   56:invokevirtual   #1107 <Method JSONObject JSONObject.put(String, boolean)>
	//   29   59:pop             
		}
		if(attributionidentifiers != null && attributionidentifiers.getAndroidInstallerPackage() != null)
	//*  30   60:aload_1         
	//*  31   61:ifnull          83
	//*  32   64:aload_1         
	//*  33   65:invokevirtual   #1110 <Method String AttributionIdentifiers.getAndroidInstallerPackage()>
	//*  34   68:ifnull          83
			jsonobject.put("installer_package", ((Object) (attributionidentifiers.getAndroidInstallerPackage())));
	//   35   71:aload_0         
	//   36   72:ldc2            #1112 <String "installer_package">
	//   37   75:aload_1         
	//   38   76:invokevirtual   #1110 <Method String AttributionIdentifiers.getAndroidInstallerPackage()>
	//   39   79:invokevirtual   #1094 <Method JSONObject JSONObject.put(String, Object)>
	//   40   82:pop             
		jsonobject.put("anon_id", ((Object) (s)));
	//   41   83:aload_0         
	//   42   84:ldc2            #1114 <String "anon_id">
	//   43   87:aload_2         
	//   44   88:invokevirtual   #1094 <Method JSONObject JSONObject.put(String, Object)>
	//   45   91:pop             
		jsonobject.put("application_tracking_enabled", flag ^ true);
	//   46   92:aload_0         
	//   47   93:ldc2            #1116 <String "application_tracking_enabled">
	//   48   96:iload_3         
	//   49   97:iconst_1        
	//   50   98:ixor            
	//   51   99:invokevirtual   #1107 <Method JSONObject JSONObject.put(String, boolean)>
	//   52  102:pop             
	//   53  103:return          
	}

	public static void setAppEventExtendedDeviceInfoParameters(JSONObject jsonobject, Context context)
		throws JSONException
	{
		Object obj;
		JSONArray jsonarray;
		String s;
		jsonarray = new JSONArray();
	//    0    0:new             #350 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #1121 <Method void JSONArray()>
	//    3    7:astore          9
		jsonarray.put("a2");
	//    4    9:aload           9
	//    5   11:ldc1            #70  <String "a2">
	//    6   13:invokevirtual   #1124 <Method JSONArray JSONArray.put(Object)>
	//    7   16:pop             
		refreshPeriodicExtendedDeviceInfo(context);
	//    8   17:aload_1         
	//    9   18:invokestatic    #1126 <Method void refreshPeriodicExtendedDeviceInfo(Context)>
		s = context.getPackageName();
	//   10   21:aload_1         
	//   11   22:invokevirtual   #1129 <Method String Context.getPackageName()>
	//   12   25:astore          10
		obj = "";
	//   13   27:ldc1            #99  <String "">
	//   14   29:astore          7
		int i;
		Object obj1;
		obj1 = ((Object) (context.getPackageManager().getPackageInfo(s, 0)));
	//   15   31:aload_1         
	//   16   32:invokevirtual   #1133 <Method PackageManager Context.getPackageManager()>
	//   17   35:aload           10
	//   18   37:iconst_0        
	//   19   38:invokevirtual   #1139 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   20   41:astore          8
		i = ((PackageInfo) (obj1)).versionCode;
	//   21   43:aload           8
	//   22   45:getfield        #1144 <Field int PackageInfo.versionCode>
	//   23   48:istore          5
		obj1 = ((Object) (((PackageInfo) (obj1)).versionName));
	//   24   50:aload           8
	//   25   52:getfield        #1147 <Field String PackageInfo.versionName>
	//   26   55:astore          8
		obj = obj1;
	//   27   57:aload           8
	//   28   59:astore          7
		  goto _L1
	//*  29   61:goto            67
_L5:
		i = -1;
	//   30   64:iconst_m1       
	//   31   65:istore          5
_L1:
		double d;
		jsonarray.put(((Object) (s)));
	//   32   67:aload           9
	//   33   69:aload           10
	//   34   71:invokevirtual   #1124 <Method JSONArray JSONArray.put(Object)>
	//   35   74:pop             
		jsonarray.put(i);
	//   36   75:aload           9
	//   37   77:iload           5
	//   38   79:invokevirtual   #1150 <Method JSONArray JSONArray.put(int)>
	//   39   82:pop             
		jsonarray.put(obj);
	//   40   83:aload           9
	//   41   85:aload           7
	//   42   87:invokevirtual   #1124 <Method JSONArray JSONArray.put(Object)>
	//   43   90:pop             
		jsonarray.put(((Object) (android.os.Build.VERSION.RELEASE)));
	//   44   91:aload           9
	//   45   93:getstatic       #1155 <Field String android.os.Build$VERSION.RELEASE>
	//   46   96:invokevirtual   #1124 <Method JSONArray JSONArray.put(Object)>
	//   47   99:pop             
		jsonarray.put(((Object) (Build.MODEL)));
	//   48  100:aload           9
	//   49  102:getstatic       #1160 <Field String Build.MODEL>
	//   50  105:invokevirtual   #1124 <Method JSONArray JSONArray.put(Object)>
	//   51  108:pop             
		try
		{
			obj = ((Object) (context.getResources().getConfiguration().locale));
	//   52  109:aload_1         
	//   53  110:invokevirtual   #1164 <Method Resources Context.getResources()>
	//   54  113:invokevirtual   #1170 <Method Configuration Resources.getConfiguration()>
	//   55  116:getfield        #1176 <Field Locale Configuration.locale>
	//   56  119:astore          7
		}
	//*  57  121:goto            129
	//*  58  124:invokestatic    #1181 <Method Locale Locale.getDefault()>
	//*  59  127:astore          7
	//*  60  129:new             #279 <Class StringBuilder>
	//*  61  132:dup             
	//*  62  133:invokespecial   #280 <Method void StringBuilder()>
	//*  63  136:astore          8
	//*  64  138:aload           8
	//*  65  140:aload           7
	//*  66  142:invokevirtual   #1184 <Method String Locale.getLanguage()>
	//*  67  145:invokevirtual   #288 <Method StringBuilder StringBuilder.append(String)>
	//*  68  148:pop             
	//*  69  149:aload           8
	//*  70  151:ldc2            #1186 <String "_">
	//*  71  154:invokevirtual   #288 <Method StringBuilder StringBuilder.append(String)>
	//*  72  157:pop             
	//*  73  158:aload           8
	//*  74  160:aload           7
	//*  75  162:invokevirtual   #1189 <Method String Locale.getCountry()>
	//*  76  165:invokevirtual   #288 <Method StringBuilder StringBuilder.append(String)>
	//*  77  168:pop             
	//*  78  169:aload           9
	//*  79  171:aload           8
	//*  80  173:invokevirtual   #293 <Method String StringBuilder.toString()>
	//*  81  176:invokevirtual   #1124 <Method JSONArray JSONArray.put(Object)>
	//*  82  179:pop             
	//*  83  180:aload           9
	//*  84  182:getstatic       #1076 <Field String deviceTimezone>
	//*  85  185:invokevirtual   #1124 <Method JSONArray JSONArray.put(Object)>
	//*  86  188:pop             
	//*  87  189:aload           9
	//*  88  191:getstatic       #1029 <Field String carrierName>
	//*  89  194:invokevirtual   #1124 <Method JSONArray JSONArray.put(Object)>
	//*  90  197:pop             
	//*  91  198:dconst_0        
	//*  92  199:dstore_2        
	//*  93  200:aload_1         
	//*  94  201:ldc2            #1191 <String "window">
	//*  95  204:invokevirtual   #1034 <Method Object Context.getSystemService(String)>
	//*  96  207:checkcast       #1193 <Class WindowManager>
	//*  97  210:astore_1        
	//*  98  211:aload_1         
	//*  99  212:ifnull          271
	//* 100  215:aload_1         
	//* 101  216:invokeinterface #1197 <Method Display WindowManager.getDefaultDisplay()>
	//* 102  221:astore_1        
	//* 103  222:new             #1199 <Class DisplayMetrics>
	//* 104  225:dup             
	//* 105  226:invokespecial   #1200 <Method void DisplayMetrics()>
	//* 106  229:astore          7
	//* 107  231:aload_1         
	//* 108  232:aload           7
	//* 109  234:invokevirtual   #1206 <Method void Display.getMetrics(DisplayMetrics)>
	//* 110  237:aload           7
	//* 111  239:getfield        #1209 <Field int DisplayMetrics.widthPixels>
	//* 112  242:istore          6
	//* 113  244:aload           7
	//* 114  246:getfield        #1212 <Field int DisplayMetrics.heightPixels>
	//* 115  249:istore          5
	//* 116  251:aload           7
	//* 117  253:getfield        #1216 <Field float DisplayMetrics.density>
	//* 118  256:fstore          4
	//* 119  258:fload           4
	//* 120  260:f2d             
	//* 121  261:dstore_2        
	//* 122  262:goto            278
	//* 123  265:iconst_0        
	//* 124  266:istore          5
	//* 125  268:goto            278
	//* 126  271:iconst_0        
	//* 127  272:istore          6
	//* 128  274:iload           6
	//* 129  276:istore          5
	//* 130  278:aload           9
	//* 131  280:iload           6
	//* 132  282:invokevirtual   #1150 <Method JSONArray JSONArray.put(int)>
	//* 133  285:pop             
	//* 134  286:aload           9
	//* 135  288:iload           5
	//* 136  290:invokevirtual   #1150 <Method JSONArray JSONArray.put(int)>
	//* 137  293:pop             
	//* 138  294:aload           9
	//* 139  296:ldc2            #1218 <String "%.2f">
	//* 140  299:iconst_1        
	//* 141  300:anewarray       Object[]
	//* 142  303:dup             
	//* 143  304:iconst_0        
	//* 144  305:dload_2         
	//* 145  306:invokestatic    #1222 <Method Double Double.valueOf(double)>
	//* 146  309:aastore         
	//* 147  310:invokestatic    #775 <Method String String.format(String, Object[])>
	//* 148  313:invokevirtual   #1124 <Method JSONArray JSONArray.put(Object)>
	//* 149  316:pop             
	//* 150  317:aload           9
	//* 151  319:invokestatic    #1224 <Method int refreshBestGuessNumberOfCPUCores()>
	//* 152  322:invokevirtual   #1150 <Method JSONArray JSONArray.put(int)>
	//* 153  325:pop             
	//* 154  326:aload           9
	//* 155  328:getstatic       #1081 <Field long totalExternalStorageGB>
	//* 156  331:invokevirtual   #1227 <Method JSONArray JSONArray.put(long)>
	//* 157  334:pop             
	//* 158  335:aload           9
	//* 159  337:getstatic       #1001 <Field long availableExternalStorageGB>
	//* 160  340:invokevirtual   #1227 <Method JSONArray JSONArray.put(long)>
	//* 161  343:pop             
	//* 162  344:aload_0         
	//* 163  345:ldc2            #1229 <String "extinfo">
	//* 164  348:aload           9
	//* 165  350:invokevirtual   #947 <Method String JSONArray.toString()>
	//* 166  353:invokevirtual   #1094 <Method JSONObject JSONObject.put(String, Object)>
	//* 167  356:pop             
	//* 168  357:return          
	//* 169  358:astore          8
	//* 170  360:goto            64
	//* 171  363:astore          8
	//* 172  365:goto            67
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			obj = ((Object) (Locale.getDefault()));
		}
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.append(((Locale) (obj)).getLanguage());
		stringbuilder.append("_");
		stringbuilder.append(((Locale) (obj)).getCountry());
		jsonarray.put(((Object) (stringbuilder.toString())));
		jsonarray.put(((Object) (deviceTimezone)));
		jsonarray.put(((Object) (carrierName)));
		d = 0.0D;
		context = ((Context) ((WindowManager)context.getSystemService("window")));
		if(context == null) goto _L3; else goto _L2
_L2:
		int j;
		context = ((Context) (((WindowManager) (context)).getDefaultDisplay()));
		obj = ((Object) (new DisplayMetrics()));
		((Display) (context)).getMetrics(((DisplayMetrics) (obj)));
		j = ((DisplayMetrics) (obj)).widthPixels;
		i = ((DisplayMetrics) (obj)).heightPixels;
		float f = ((DisplayMetrics) (obj)).density;
		d = f;
		  goto _L4
_L6:
		i = 0;
		  goto _L4
_L3:
		j = 0;
		i = j;
_L4:
		jsonarray.put(j);
		jsonarray.put(i);
		jsonarray.put(((Object) (String.format("%.2f", new Object[] {
			Double.valueOf(d)
		}))));
		jsonarray.put(refreshBestGuessNumberOfCPUCores());
		jsonarray.put(totalExternalStorageGB);
		jsonarray.put(availableExternalStorageGB);
		jsonobject.put("extinfo", ((Object) (jsonarray.toString())));
		return;
		android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
		namenotfoundexception;
		  goto _L5
		Exception exception;
		namenotfoundexception;
		  goto _L1
	//* 173  368:astore          7
	//* 174  370:goto            124
		context;
	//  175  373:astore_1        
		  goto _L3
	//* 176  374:goto            271
		context;
	//  177  377:astore_1        
		  goto _L6
	//* 178  378:goto            265
		context;
	//  179  381:astore_1        
		  goto _L4
	//* 180  382:goto            278
	}

	public static String sha1hash(String s)
	{
		return hashWithAlgorithm("SHA-1", s);
	//    0    0:ldc1            #78  <String "SHA-1">
	//    1    2:aload_0         
	//    2    3:invokestatic    #818 <Method String hashWithAlgorithm(String, String)>
	//    3    6:areturn         
	}

	public static String sha1hash(byte abyte0[])
	{
		return hashWithAlgorithm("SHA-1", abyte0);
	//    0    0:ldc1            #78  <String "SHA-1">
	//    1    2:aload_0         
	//    2    3:invokestatic    #685 <Method String hashWithAlgorithm(String, byte[])>
	//    3    6:areturn         
	}

	public static boolean stringsEqualOrEmpty(String s, String s1)
	{
		boolean flag = TextUtils.isEmpty(((CharSequence) (s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #1237 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    2    4:istore_2        
		boolean flag1 = TextUtils.isEmpty(((CharSequence) (s1)));
	//    3    5:aload_1         
	//    4    6:invokestatic    #1237 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    5    9:istore_3        
		if(flag && flag1)
	//*   6   10:iload_2         
	//*   7   11:ifeq            20
	//*   8   14:iload_3         
	//*   9   15:ifeq            20
			return true;
	//   10   18:iconst_1        
	//   11   19:ireturn         
		if(!flag && !flag1)
	//*  12   20:iload_2         
	//*  13   21:ifne            34
	//*  14   24:iload_3         
	//*  15   25:ifne            34
			return s.equals(((Object) (s1)));
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #423 <Method boolean String.equals(Object)>
	//   19   33:ireturn         
		else
			return false;
	//   20   34:iconst_0        
	//   21   35:ireturn         
	}

	public static JSONArray tryGetJSONArrayFromResponse(JSONObject jsonobject, String s)
	{
		if(jsonobject != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          10
			return jsonobject.optJSONArray(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #822 <Method JSONArray JSONObject.optJSONArray(String)>
	//    5    9:areturn         
		else
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
	}

	public static JSONObject tryGetJSONObjectFromResponse(JSONObject jsonobject, String s)
	{
		if(jsonobject != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          10
			return jsonobject.optJSONObject(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #841 <Method JSONObject JSONObject.optJSONObject(String)>
	//    5    9:areturn         
		else
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
	}

	public static transient Collection unmodifiableCollection(Object aobj[])
	{
		return Collections.unmodifiableCollection(((Collection) (Arrays.asList(aobj))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #1246 <Method List Arrays.asList(Object[])>
	//    2    4:invokestatic    #1251 <Method Collection Collections.unmodifiableCollection(Collection)>
	//    3    7:areturn         
	}

	public static void writeStringMapToParcel(Parcel parcel, Map map1)
	{
		if(map1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
		{
			parcel.writeInt(-1);
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:invokevirtual   #1257 <Method void Parcel.writeInt(int)>
			return;
	//    5    9:return          
		}
		parcel.writeInt(map1.size());
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokeinterface #1258 <Method int Map.size()>
	//    9   17:invokevirtual   #1257 <Method void Parcel.writeInt(int)>
		java.util.Map.Entry entry;
		for(map1 = ((Map) (map1.entrySet().iterator())); ((Iterator) (map1)).hasNext(); parcel.writeString((String)entry.getValue()))
	//*  10   20:aload_1         
	//*  11   21:invokeinterface #1261 <Method Set Map.entrySet()>
	//*  12   26:invokeinterface #219 <Method Iterator Set.iterator()>
	//*  13   31:astore_1        
	//*  14   32:aload_1         
	//*  15   33:invokeinterface #225 <Method boolean Iterator.hasNext()>
	//*  16   38:ifeq            80
		{
			entry = (java.util.Map.Entry)((Iterator) (map1)).next();
	//   17   41:aload_1         
	//   18   42:invokeinterface #229 <Method Object Iterator.next()>
	//   19   47:checkcast       #1263 <Class java.util.Map$Entry>
	//   20   50:astore_2        
			parcel.writeString((String)entry.getKey());
	//   21   51:aload_0         
	//   22   52:aload_2         
	//   23   53:invokeinterface #1266 <Method Object java.util.Map$Entry.getKey()>
	//   24   58:checkcast       #113 <Class String>
	//   25   61:invokevirtual   #1269 <Method void Parcel.writeString(String)>
		}

	//   26   64:aload_0         
	//   27   65:aload_2         
	//   28   66:invokeinterface #1272 <Method Object java.util.Map$Entry.getValue()>
	//   29   71:checkcast       #113 <Class String>
	//   30   74:invokevirtual   #1269 <Method void Parcel.writeString(String)>
	//*  31   77:goto            32
	//   32   80:return          
	}

	private static final String APPLICATION_FIELDS = "fields";
	private static final String APP_SETTINGS_PREFS_KEY_FORMAT = "com.facebook.internal.APP_SETTINGS.%s";
	private static final String APP_SETTINGS_PREFS_STORE = "com.facebook.internal.preferences.APP_SETTINGS";
	private static final String APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES = "android_sdk_error_categories";
	private static final String APP_SETTING_DIALOG_CONFIGS = "android_dialog_configs";
	private static final String APP_SETTING_FIELDS[] = {
		"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories"
	};
	private static final String APP_SETTING_NUX_CONTENT = "gdpv4_nux_content";
	private static final String APP_SETTING_NUX_ENABLED = "gdpv4_nux_enabled";
	private static final String APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING = "supports_implicit_sdk_logging";
	public static final int DEFAULT_STREAM_BUFFER_SIZE = 8192;
	private static final String DIALOG_CONFIG_DIALOG_NAME_FEATURE_NAME_SEPARATOR = "\\|";
	private static final String DIALOG_CONFIG_NAME_KEY = "name";
	private static final String DIALOG_CONFIG_URL_KEY = "url";
	private static final String DIALOG_CONFIG_VERSIONS_KEY = "versions";
	private static final String EXTRA_APP_EVENTS_INFO_FORMAT_VERSION = "a2";
	private static final int GINGERBREAD_MR1 = 10;
	private static final String HASH_ALGORITHM_MD5 = "MD5";
	private static final String HASH_ALGORITHM_SHA1 = "SHA-1";
	static final String LOG_TAG = "FacebookSDK";
	private static final int REFRESH_TIME_FOR_EXTENDED_DEVICE_INFO_MILLIS = 0x1b7740;
	private static final String URL_SCHEME = "https";
	private static final String UTF8 = "UTF-8";
	private static long availableExternalStorageGB = -1L;
	private static String carrierName = "NoCarrier";
	private static String deviceTimezone = "";
	private static Map fetchedAppSettings = new ConcurrentHashMap();
	private static AtomicBoolean loadingSettings = new AtomicBoolean(false);
	private static final String noCarrierConstant = "NoCarrier";
	private static int numCPUCores = 0;
	private static long timestampOfLastCheck = -1L;
	private static long totalExternalStorageGB = -1L;

	static 
	{
	//    0    0:iconst_5        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #52  <String "supports_implicit_sdk_logging">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #46  <String "gdpv4_nux_content">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #49  <String "gdpv4_nux_enabled">
	//   13   18:aastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #41  <String "android_dialog_configs">
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_4        
	//   20   26:ldc1            #38  <String "android_sdk_error_categories">
	//   21   28:aastore         
	//   22   29:putstatic       #115 <Field String[] APP_SETTING_FIELDS>
	//   23   32:new             #117 <Class ConcurrentHashMap>
	//   24   35:dup             
	//   25   36:invokespecial   #120 <Method void ConcurrentHashMap()>
	//   26   39:putstatic       #122 <Field Map fetchedAppSettings>
	//   27   42:new             #124 <Class AtomicBoolean>
	//   28   45:dup             
	//   29   46:iconst_0        
	//   30   47:invokespecial   #127 <Method void AtomicBoolean(boolean)>
	//   31   50:putstatic       #129 <Field AtomicBoolean loadingSettings>
	//*  32   53:return          
	}


/*
	static FetchedAppSettings access$000(String s, JSONObject jsonobject)
	{
		return parseAppSettingsFromJSON(s, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #136 <Method Utility$FetchedAppSettings parseAppSettingsFromJSON(String, JSONObject)>
	//    3    5:areturn         
	}

*/


/*
	static JSONObject access$100(String s)
	{
		return getAppSettingsQueryResponse(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #141 <Method JSONObject getAppSettingsQueryResponse(String)>
	//    2    4:areturn         
	}

*/


/*
	static AtomicBoolean access$200()
	{
		return loadingSettings;
	//    0    0:getstatic       #129 <Field AtomicBoolean loadingSettings>
	//    1    3:areturn         
	}

*/
}
