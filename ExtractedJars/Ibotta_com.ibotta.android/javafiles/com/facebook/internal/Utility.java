// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.*;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.*;
import com.newrelic.agent.android.instrumentation.JSONArrayInstrumentation;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.regex.Pattern;
import org.json.*;

// Referenced classes of package com.facebook.internal:
//			ProfileInformationCache, Validate, AttributionIdentifiers

public final class Utility
{
	public static interface GraphMeRequestWithCacheCallback
	{

		public abstract void onFailure(FacebookException facebookexception);

		public abstract void onSuccess(JSONObject jsonobject);
	}

	public static interface Mapper
	{

		public abstract Object apply(Object obj);
	}

	public static class PermissionsPair
	{

		public List getDeclinedPermissions()
		{
			return declinedPermissions;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field List declinedPermissions>
		//    2    4:areturn         
		}

		public List getGrantedPermissions()
		{
			return grantedPermissions;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field List grantedPermissions>
		//    2    4:areturn         
		}

		List declinedPermissions;
		List grantedPermissions;

		public PermissionsPair(List list, List list1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			grantedPermissions = list;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field List grantedPermissions>
			declinedPermissions = list1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field List declinedPermissions>
		//    8   14:return          
		}
	}

	public static interface Predicate
	{

		public abstract boolean apply(Object obj);
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
	//   10   14:invokevirtual   #47  <Method boolean Object.equals(Object)>
	//   11   17:ireturn         
	}

	public static transient List asListNoNulls(Object aobj[])
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #53  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void ArrayList()>
	//    3    7:astore_3        
		int j = aobj.length;
	//    4    8:aload_0         
	//    5    9:arraylength     
	//    6   10:istore_2        
		for(int i = 0; i < j; i++)
	//*   7   11:iconst_0        
	//*   8   12:istore_1        
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
	//   20   31:invokevirtual   #59  <Method boolean ArrayList.add(Object)>
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
	//    1    1:invokestatic    #67  <Method JSONObject ProfileInformationCache.getProfileInformation(String)>
	//    2    4:astore_1        
		if(jsonobject != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return jsonobject;
	//    5    9:aload_1         
	//    6   10:areturn         
		s = ((String) (getGraphMeRequestWithCache(s).executeAndWait()));
	//    7   11:aload_0         
	//    8   12:invokestatic    #71  <Method GraphRequest getGraphMeRequestWithCache(String)>
	//    9   15:invokevirtual   #77  <Method GraphResponse GraphRequest.executeAndWait()>
	//   10   18:astore_0        
		if(((GraphResponse) (s)).getError() != null)
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #83  <Method FacebookRequestError GraphResponse.getError()>
	//*  13   23:ifnull          28
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
		else
			return ((GraphResponse) (s)).getJSONObject();
	//   16   28:aload_0         
	//   17   29:invokevirtual   #87  <Method JSONObject GraphResponse.getJSONObject()>
	//   18   32:areturn         
	}

	public static Uri buildUri(String s, String s1, Bundle bundle)
	{
		android.net.Uri.Builder builder = new android.net.Uri.Builder();
	//    0    0:new             #91  <Class android.net.Uri$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void android.net.Uri$Builder()>
	//    3    7:astore_3        
		builder.scheme("https");
	//    4    8:aload_3         
	//    5    9:ldc1            #94  <String "https">
	//    6   11:invokevirtual   #98  <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//    7   14:pop             
		builder.authority(s);
	//    8   15:aload_3         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #101 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
	//   11   20:pop             
		builder.path(s1);
	//   12   21:aload_3         
	//   13   22:aload_1         
	//   14   23:invokevirtual   #104 <Method android.net.Uri$Builder android.net.Uri$Builder.path(String)>
	//   15   26:pop             
		if(bundle != null)
	//*  16   27:aload_2         
	//*  17   28:ifnull          89
		{
			s = ((String) (bundle.keySet().iterator()));
	//   18   31:aload_2         
	//   19   32:invokevirtual   #110 <Method Set Bundle.keySet()>
	//   20   35:invokeinterface #116 <Method Iterator Set.iterator()>
	//   21   40:astore_0        
			do
			{
				if(!((Iterator) (s)).hasNext())
					break;
	//   22   41:aload_0         
	//   23   42:invokeinterface #122 <Method boolean Iterator.hasNext()>
	//   24   47:ifeq            89
				s1 = (String)((Iterator) (s)).next();
	//   25   50:aload_0         
	//   26   51:invokeinterface #126 <Method Object Iterator.next()>
	//   27   56:checkcast       #128 <Class String>
	//   28   59:astore_1        
				Object obj = bundle.get(s1);
	//   29   60:aload_2         
	//   30   61:aload_1         
	//   31   62:invokevirtual   #132 <Method Object Bundle.get(String)>
	//   32   65:astore          4
				if(obj instanceof String)
	//*  33   67:aload           4
	//*  34   69:instanceof      #128 <Class String>
	//*  35   72:ifeq            41
					builder.appendQueryParameter(s1, (String)obj);
	//   36   75:aload_3         
	//   37   76:aload_1         
	//   38   77:aload           4
	//   39   79:checkcast       #128 <Class String>
	//   40   82:invokevirtual   #136 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   41   85:pop             
			} while(true);
	//   42   86:goto            41
		}
		return builder.build();
	//   43   89:aload_3         
	//   44   90:invokevirtual   #140 <Method Uri android.net.Uri$Builder.build()>
	//   45   93:areturn         
	}

	private static void clearCookiesForDomain(Context context, String s)
	{
		CookieSyncManager.createInstance(context).sync();
	//    0    0:aload_0         
	//    1    1:invokestatic    #148 <Method CookieSyncManager CookieSyncManager.createInstance(Context)>
	//    2    4:invokevirtual   #151 <Method void CookieSyncManager.sync()>
		context = ((Context) (CookieManager.getInstance()));
	//    3    7:invokestatic    #157 <Method CookieManager CookieManager.getInstance()>
	//    4   10:astore_0        
		String s1 = ((CookieManager) (context)).getCookie(s);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #161 <Method String CookieManager.getCookie(String)>
	//    8   16:astore          4
		if(s1 == null)
	//*   9   18:aload           4
	//*  10   20:ifnonnull       24
			return;
	//   11   23:return          
		String as[] = s1.split(";");
	//   12   24:aload           4
	//   13   26:ldc1            #163 <String ";">
	//   14   28:invokevirtual   #167 <Method String[] String.split(String)>
	//   15   31:astore          4
		int j = as.length;
	//   16   33:aload           4
	//   17   35:arraylength     
	//   18   36:istore_3        
		for(int i = 0; i < j; i++)
	//*  19   37:iconst_0        
	//*  20   38:istore_2        
	//*  21   39:iload_2         
	//*  22   40:iload_3         
	//*  23   41:icmpge          108
		{
			String as1[] = as[i].split("=");
	//   24   44:aload           4
	//   25   46:iload_2         
	//   26   47:aaload          
	//   27   48:ldc1            #169 <String "=">
	//   28   50:invokevirtual   #167 <Method String[] String.split(String)>
	//   29   53:astore          5
			if(as1.length > 0)
	//*  30   55:aload           5
	//*  31   57:arraylength     
	//*  32   58:ifle            101
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   33   61:new             #171 <Class StringBuilder>
	//   34   64:dup             
	//   35   65:invokespecial   #172 <Method void StringBuilder()>
	//   36   68:astore          6
				stringbuilder.append(as1[0].trim());
	//   37   70:aload           6
	//   38   72:aload           5
	//   39   74:iconst_0        
	//   40   75:aaload          
	//   41   76:invokevirtual   #176 <Method String String.trim()>
	//   42   79:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   43   82:pop             
				stringbuilder.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
	//   44   83:aload           6
	//   45   85:ldc1            #182 <String "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;">
	//   46   87:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   47   90:pop             
				((CookieManager) (context)).setCookie(s, stringbuilder.toString());
	//   48   91:aload_0         
	//   49   92:aload_1         
	//   50   93:aload           6
	//   51   95:invokevirtual   #185 <Method String StringBuilder.toString()>
	//   52   98:invokevirtual   #189 <Method void CookieManager.setCookie(String, String)>
			}
		}

	//   53  101:iload_2         
	//   54  102:iconst_1        
	//   55  103:iadd            
	//   56  104:istore_2        
	//*  57  105:goto            39
		((CookieManager) (context)).removeExpiredCookie();
	//   58  108:aload_0         
	//   59  109:invokevirtual   #192 <Method void CookieManager.removeExpiredCookie()>
	//   60  112:return          
	}

	public static void clearFacebookCookies(Context context)
	{
		clearCookiesForDomain(context, "facebook.com");
	//    0    0:aload_0         
	//    1    1:ldc1            #196 <String "facebook.com">
	//    2    3:invokestatic    #198 <Method void clearCookiesForDomain(Context, String)>
		clearCookiesForDomain(context, ".facebook.com");
	//    3    6:aload_0         
	//    4    7:ldc1            #200 <String ".facebook.com">
	//    5    9:invokestatic    #198 <Method void clearCookiesForDomain(Context, String)>
		clearCookiesForDomain(context, "https://facebook.com");
	//    6   12:aload_0         
	//    7   13:ldc1            #202 <String "https://facebook.com">
	//    8   15:invokestatic    #198 <Method void clearCookiesForDomain(Context, String)>
		clearCookiesForDomain(context, "https://.facebook.com");
	//    9   18:aload_0         
	//   10   19:ldc1            #204 <String "https://.facebook.com">
	//   11   21:invokestatic    #198 <Method void clearCookiesForDomain(Context, String)>
	//   12   24:return          
	}

	public static void closeQuietly(Closeable closeable)
	{
		if(closeable == null)
			break MISSING_BLOCK_LABEL_10;
	//    0    0:aload_0         
	//    1    1:ifnull          10
		closeable.close();
	//    2    4:aload_0         
	//    3    5:invokeinterface #213 <Method void Closeable.close()>
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
	//*   1    1:invokestatic    #219 <Method boolean isNullOrEmpty(String)>
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
	//    1    1:ldc2w           #222 <Double 1073741824D>
	//    2    4:ddiv            
	//    3    5:invokestatic    #228 <Method long Math.round(double)>
	//    4    8:lreturn         
	}

	public static int copyAndCloseInputStream(InputStream inputstream, OutputStream outputstream)
		throws IOException
	{
		BufferedInputStream bufferedinputstream = new BufferedInputStream(inputstream);
	//    0    0:new             #232 <Class BufferedInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #235 <Method void BufferedInputStream(InputStream)>
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
	//   12   23:invokevirtual   #239 <Method int BufferedInputStream.read(byte[])>
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
	//   21   37:invokevirtual   #245 <Method void OutputStream.write(byte[], int, int)>
		i += j;
	//   22   40:iload_2         
	//   23   41:iload_3         
	//   24   42:iadd            
	//   25   43:istore_2        
		if(true) goto _L2; else goto _L1
	//   26   44:goto            19
_L1:
		bufferedinputstream.close();
	//   27   47:aload           4
	//   28   49:invokevirtual   #246 <Method void BufferedInputStream.close()>
		if(inputstream != null)
	//*  29   52:aload_0         
	//*  30   53:ifnull          60
			inputstream.close();
	//   31   56:aload_0         
	//   32   57:invokevirtual   #249 <Method void InputStream.close()>
		return i;
	//   33   60:iload_2         
	//   34   61:ireturn         
		Exception exception1;
		exception1;
	//   35   62:astore          5
		Exception exception;
		outputstream = ((OutputStream) (bufferedinputstream));
	//   36   64:aload           4
	//   37   66:astore_1        
		exception = exception1;
	//   38   67:aload           5
	//   39   69:astore          4
		break MISSING_BLOCK_LABEL_78;
	//   40   71:goto            78
		exception;
	//   41   74:astore          4
		outputstream = null;
	//   42   76:aconst_null     
	//   43   77:astore_1        
		if(outputstream != null)
	//*  44   78:aload_1         
	//*  45   79:ifnull          86
			((BufferedInputStream) (outputstream)).close();
	//   46   82:aload_1         
	//   47   83:invokevirtual   #246 <Method void BufferedInputStream.close()>
		if(inputstream != null)
	//*  48   86:aload_0         
	//*  49   87:ifnull          94
			inputstream.close();
	//   50   90:aload_0         
	//   51   91:invokevirtual   #249 <Method void InputStream.close()>
		throw exception;
	//   52   94:aload           4
	//   53   96:athrow          
	}

	public static void deleteDirectory(File file)
	{
		if(!file.exists())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #257 <Method boolean File.exists()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(file.isDirectory())
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #260 <Method boolean File.isDirectory()>
	//*   6   12:ifeq            47
		{
			File afile[] = file.listFiles();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #264 <Method File[] File.listFiles()>
	//    9   19:astore_3        
			if(afile != null)
	//*  10   20:aload_3         
	//*  11   21:ifnull          47
			{
				int j = afile.length;
	//   12   24:aload_3         
	//   13   25:arraylength     
	//   14   26:istore_2        
				for(int i = 0; i < j; i++)
	//*  15   27:iconst_0        
	//*  16   28:istore_1        
	//*  17   29:iload_1         
	//*  18   30:iload_2         
	//*  19   31:icmpge          47
					deleteDirectory(afile[i]);
	//   20   34:aload_3         
	//   21   35:iload_1         
	//   22   36:aaload          
	//   23   37:invokestatic    #266 <Method void deleteDirectory(File)>

	//   24   40:iload_1         
	//   25   41:iconst_1        
	//   26   42:iadd            
	//   27   43:istore_1        
			}
		}
	//*  28   44:goto            29
		file.delete();
	//   29   47:aload_0         
	//   30   48:invokevirtual   #269 <Method boolean File.delete()>
	//   31   51:pop             
	//   32   52:return          
	}

	public static void disconnectQuietly(URLConnection urlconnection)
	{
		if(urlconnection != null && (urlconnection instanceof HttpURLConnection))
	//*   0    0:aload_0         
	//*   1    1:ifnull          18
	//*   2    4:aload_0         
	//*   3    5:instanceof      #273 <Class HttpURLConnection>
	//*   4    8:ifeq            18
			((HttpURLConnection)urlconnection).disconnect();
	//    5   11:aload_0         
	//    6   12:checkcast       #273 <Class HttpURLConnection>
	//    7   15:invokevirtual   #276 <Method void HttpURLConnection.disconnect()>
	//    8   18:return          
	}

	private static boolean externalStorageExists()
	{
		return "mounted".equals(((Object) (Environment.getExternalStorageState())));
	//    0    0:ldc2            #279 <String "mounted">
	//    1    3:invokestatic    #284 <Method String Environment.getExternalStorageState()>
	//    2    6:invokevirtual   #285 <Method boolean String.equals(Object)>
	//    3    9:ireturn         
	}

	public static String generateRandomString(int i)
	{
		return (new BigInteger(i * 5, new Random())).toString(32);
	//    0    0:new             #289 <Class BigInteger>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:iconst_5        
	//    4    6:imul            
	//    5    7:new             #291 <Class Random>
	//    6   10:dup             
	//    7   11:invokespecial   #292 <Method void Random()>
	//    8   14:invokespecial   #295 <Method void BigInteger(int, Random)>
	//    9   17:bipush          32
	//   10   19:invokevirtual   #297 <Method String BigInteger.toString(int)>
	//   11   22:areturn         
	}

	public static String getActivityName(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return "null";
	//    2    4:ldc2            #301 <String "null">
	//    3    7:areturn         
		if(context == context.getApplicationContext())
	//*   4    8:aload_0         
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #307 <Method Context Context.getApplicationContext()>
	//*   7   13:if_acmpne       20
			return "unknown";
	//    8   16:ldc2            #309 <String "unknown">
	//    9   19:areturn         
		else
			return ((Object) (context)).getClass().getSimpleName();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #313 <Method Class Object.getClass()>
	//   12   24:invokevirtual   #318 <Method String Class.getSimpleName()>
	//   13   27:areturn         
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
	//    6    8:invokevirtual   #132 <Method Object Bundle.get(String)>
	//    7   11:astore_0        
			long l;
			if(bundle instanceof Long)
	//*   8   12:aload_0         
	//*   9   13:instanceof      #324 <Class Long>
	//*  10   16:ifeq            30
			{
				l = ((Long)bundle).longValue();
	//   11   19:aload_0         
	//   12   20:checkcast       #324 <Class Long>
	//   13   23:invokevirtual   #328 <Method long Long.longValue()>
	//   14   26:lstore_3        
			} else
	//*  15   27:goto            45
			{
				if(!(bundle instanceof String))
					break label0;
	//   16   30:aload_0         
	//   17   31:instanceof      #128 <Class String>
	//   18   34:ifeq            80
				try
				{
					l = Long.parseLong((String)bundle);
	//   19   37:aload_0         
	//   20   38:checkcast       #128 <Class String>
	//   21   41:invokestatic    #332 <Method long Long.parseLong(String)>
	//   22   44:lstore_3        
				}
	//*  23   45:lload_3         
	//*  24   46:lconst_0        
	//*  25   47:lcmp            
	//*  26   48:ifne            62
	//*  27   51:new             #334 <Class Date>
	//*  28   54:dup             
	//*  29   55:ldc2w           #335 <Long 0xffffffffL>
	//*  30   58:invokespecial   #339 <Method void Date(long)>
	//*  31   61:areturn         
	//*  32   62:new             #334 <Class Date>
	//*  33   65:dup             
	//*  34   66:aload_2         
	//*  35   67:invokevirtual   #342 <Method long Date.getTime()>
	//*  36   70:lload_3         
	//*  37   71:ldc2w           #343 <Long 1000L>
	//*  38   74:lmul            
	//*  39   75:ladd            
	//*  40   76:invokespecial   #339 <Method void Date(long)>
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
		Uri uri1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		uri = ((Uri) (FacebookSdk.getApplicationContext().getContentResolver().query(uri, ((String []) (null)), ((String) (null)), ((String []) (null)), ((String) (null)))));
	//    2    3:invokestatic    #349 <Method Context FacebookSdk.getApplicationContext()>
	//    3    6:invokevirtual   #353 <Method ContentResolver Context.getContentResolver()>
	//    4    9:aload_0         
	//    5   10:aconst_null     
	//    6   11:aconst_null     
	//    7   12:aconst_null     
	//    8   13:aconst_null     
	//    9   14:invokevirtual   #359 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   10   17:astore_0        
		uri1 = uri;
	//   11   18:aload_0         
	//   12   19:astore          4
		int i = ((Cursor) (uri)).getColumnIndex("_size");
	//   13   21:aload_0         
	//   14   22:ldc2            #361 <String "_size">
	//   15   25:invokeinterface #367 <Method int Cursor.getColumnIndex(String)>
	//   16   30:istore_1        
		uri1 = uri;
	//   17   31:aload_0         
	//   18   32:astore          4
		((Cursor) (uri)).moveToFirst();
	//   19   34:aload_0         
	//   20   35:invokeinterface #370 <Method boolean Cursor.moveToFirst()>
	//   21   40:pop             
		uri1 = uri;
	//   22   41:aload_0         
	//   23   42:astore          4
		long l = ((Cursor) (uri)).getLong(i);
	//   24   44:aload_0         
	//   25   45:iload_1         
	//   26   46:invokeinterface #374 <Method long Cursor.getLong(int)>
	//   27   51:lstore_2        
		if(uri != null)
	//*  28   52:aload_0         
	//*  29   53:ifnull          62
			((Cursor) (uri)).close();
	//   30   56:aload_0         
	//   31   57:invokeinterface #375 <Method void Cursor.close()>
		return l;
	//   32   62:lload_2         
	//   33   63:lreturn         
		uri;
	//   34   64:astore_0        
		if(uri1 != null)
	//*  35   65:aload           4
	//*  36   67:ifnull          77
			((Cursor) (uri1)).close();
	//   37   70:aload           4
	//   38   72:invokeinterface #375 <Method void Cursor.close()>
		throw uri;
	//   39   77:aload_0         
	//   40   78:athrow          
	}

	public static Locale getCurrentLocale()
	{
		Exception exception;
		Locale locale;
		try
		{
			locale = FacebookSdk.getApplicationContext().getResources().getConfiguration().locale;
	//    0    0:invokestatic    #349 <Method Context FacebookSdk.getApplicationContext()>
	//    1    3:invokevirtual   #383 <Method Resources Context.getResources()>
	//    2    6:invokevirtual   #389 <Method Configuration Resources.getConfiguration()>
	//    3    9:getfield        #395 <Field Locale Configuration.locale>
	//    4   12:astore_0        
		}
	//*   5   13:aload_0         
	//*   6   14:areturn         
	//*   7   15:invokestatic    #400 <Method Locale Locale.getDefault()>
	//*   8   18:areturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			return Locale.getDefault();
		}
		return locale;
	//*   9   19:astore_0        
	//*  10   20:goto            15
	}

	private static GraphRequest getGraphMeRequestWithCache(String s)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #106 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #401 <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putString("fields", "id,name,first_name,middle_name,last_name,link");
	//    4    8:aload_1         
	//    5    9:ldc2            #403 <String "fields">
	//    6   12:ldc2            #405 <String "id,name,first_name,middle_name,last_name,link">
	//    7   15:invokevirtual   #408 <Method void Bundle.putString(String, String)>
		bundle.putString("access_token", s);
	//    8   18:aload_1         
	//    9   19:ldc2            #410 <String "access_token">
	//   10   22:aload_0         
	//   11   23:invokevirtual   #408 <Method void Bundle.putString(String, String)>
		return new GraphRequest(((AccessToken) (null)), "me", bundle, HttpMethod.GET, ((com.facebook.GraphRequest.Callback) (null)));
	//   12   26:new             #73  <Class GraphRequest>
	//   13   29:dup             
	//   14   30:aconst_null     
	//   15   31:ldc2            #412 <String "me">
	//   16   34:aload_1         
	//   17   35:getstatic       #418 <Field HttpMethod HttpMethod.GET>
	//   18   38:aconst_null     
	//   19   39:invokespecial   #421 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, com.facebook.GraphRequest$Callback)>
	//   20   42:areturn         
	}

	public static void getGraphMeRequestWithCacheAsync(String s, GraphMeRequestWithCacheCallback graphmerequestwithcachecallback)
	{
		JSONObject jsonobject = ProfileInformationCache.getProfileInformation(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #67  <Method JSONObject ProfileInformationCache.getProfileInformation(String)>
	//    2    4:astore_2        
		if(jsonobject != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
		{
			graphmerequestwithcachecallback.onSuccess(jsonobject);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #427 <Method void Utility$GraphMeRequestWithCacheCallback.onSuccess(JSONObject)>
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
	//    9   17:new             #6   <Class Utility$1>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:invokespecial   #430 <Method void Utility$1(Utility$GraphMeRequestWithCacheCallback, String)>
	//   14   26:astore_1        
			s = ((String) (getGraphMeRequestWithCache(s)));
	//   15   27:aload_0         
	//   16   28:invokestatic    #71  <Method GraphRequest getGraphMeRequestWithCache(String)>
	//   17   31:astore_0        
			((GraphRequest) (s)).setCallback(((com.facebook.GraphRequest.Callback) (graphmerequestwithcachecallback)));
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #434 <Method void GraphRequest.setCallback(com.facebook.GraphRequest$Callback)>
			((GraphRequest) (s)).executeAsync();
	//   21   37:aload_0         
	//   22   38:invokevirtual   #438 <Method com.facebook.GraphRequestAsyncTask GraphRequest.executeAsync()>
	//   23   41:pop             
			return;
	//   24   42:return          
		}
	}

	public static String getMetadataApplicationId(Context context)
	{
		Validate.notNull(((Object) (context)), "context");
	//    0    0:aload_0         
	//    1    1:ldc2            #441 <String "context">
	//    2    4:invokestatic    #447 <Method void Validate.notNull(Object, String)>
		FacebookSdk.sdkInitialize(context);
	//    3    7:aload_0         
	//    4    8:invokestatic    #450 <Method void FacebookSdk.sdkInitialize(Context)>
		return FacebookSdk.getApplicationId();
	//    5   11:invokestatic    #453 <Method String FacebookSdk.getApplicationId()>
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
	//    3    3:invokevirtual   #461 <Method Method Class.getMethod(String, Class[])>
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
	//    1    1:invokestatic    #469 <Method Class Class.forName(String)>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #471 <Method Method getMethodQuietly(Class, String, Class[])>
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
	//    2    2:invokevirtual   #481 <Method Object JSONObject.opt(String)>
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
	//*  11   15:instanceof      #128 <Class String>
	//*  12   18:ifeq            36
				jsonobject = ((JSONObject) ((new JSONTokener((String)s)).nextValue()));
	//   13   21:new             #483 <Class JSONTokener>
	//   14   24:dup             
	//   15   25:aload_1         
	//   16   26:checkcast       #128 <Class String>
	//   17   29:invokespecial   #486 <Method void JSONTokener(String)>
	//   18   32:invokevirtual   #489 <Method Object JSONTokener.nextValue()>
	//   19   35:astore_0        
		}
		if(jsonobject != null && !(jsonobject instanceof JSONObject) && !(jsonobject instanceof JSONArray))
	//*  20   36:aload_0         
	//*  21   37:ifnull          86
	//*  22   40:aload_0         
	//*  23   41:instanceof      #478 <Class JSONObject>
	//*  24   44:ifne            86
	//*  25   47:aload_0         
	//*  26   48:instanceof      #491 <Class JSONArray>
	//*  27   51:ifne            86
		{
			if(s1 != null)
	//*  28   54:aload_2         
	//*  29   55:ifnull          75
			{
				s = ((String) (new JSONObject()));
	//   30   58:new             #478 <Class JSONObject>
	//   31   61:dup             
	//   32   62:invokespecial   #492 <Method void JSONObject()>
	//   33   65:astore_1        
				((JSONObject) (s)).putOpt(s1, ((Object) (jsonobject)));
	//   34   66:aload_1         
	//   35   67:aload_2         
	//   36   68:aload_0         
	//   37   69:invokevirtual   #496 <Method JSONObject JSONObject.putOpt(String, Object)>
	//   38   72:pop             
				return ((Object) (s));
	//   39   73:aload_1         
	//   40   74:areturn         
			} else
			{
				throw new FacebookException("Got an unexpected non-JSON object.");
	//   41   75:new             #498 <Class FacebookException>
	//   42   78:dup             
	//   43   79:ldc2            #500 <String "Got an unexpected non-JSON object.">
	//   44   82:invokespecial   #501 <Method void FacebookException(String)>
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
	//    5    7:invokevirtual   #506 <Method String Uri.toString()>
	//    6   10:areturn         
	}

	public static PermissionsPair handlePermissionResponse(JSONObject jsonobject)
		throws JSONException
	{
		jsonobject = ((JSONObject) (jsonobject.getJSONObject("permissions").getJSONArray("data")));
	//    0    0:aload_0         
	//    1    1:ldc2            #510 <String "permissions">
	//    2    4:invokevirtual   #512 <Method JSONObject JSONObject.getJSONObject(String)>
	//    3    7:ldc2            #514 <String "data">
	//    4   10:invokevirtual   #518 <Method JSONArray JSONObject.getJSONArray(String)>
	//    5   13:astore_0        
		ArrayList arraylist = new ArrayList(((JSONArray) (jsonobject)).length());
	//    6   14:new             #53  <Class ArrayList>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:invokevirtual   #522 <Method int JSONArray.length()>
	//   10   22:invokespecial   #525 <Method void ArrayList(int)>
	//   11   25:astore_2        
		ArrayList arraylist1 = new ArrayList(((JSONArray) (jsonobject)).length());
	//   12   26:new             #53  <Class ArrayList>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:invokevirtual   #522 <Method int JSONArray.length()>
	//   16   34:invokespecial   #525 <Method void ArrayList(int)>
	//   17   37:astore_3        
		for(int i = 0; i < ((JSONArray) (jsonobject)).length(); i++)
	//*  18   38:iconst_0        
	//*  19   39:istore_1        
	//*  20   40:iload_1         
	//*  21   41:aload_0         
	//*  22   42:invokevirtual   #522 <Method int JSONArray.length()>
	//*  23   45:icmpge          152
		{
			Object obj = ((Object) (((JSONArray) (jsonobject)).optJSONObject(i)));
	//   24   48:aload_0         
	//   25   49:iload_1         
	//   26   50:invokevirtual   #529 <Method JSONObject JSONArray.optJSONObject(int)>
	//   27   53:astore          5
			String s = ((JSONObject) (obj)).optString("permission");
	//   28   55:aload           5
	//   29   57:ldc2            #531 <String "permission">
	//   30   60:invokevirtual   #534 <Method String JSONObject.optString(String)>
	//   31   63:astore          4
			if(s == null || s.equals("installed"))
	//*  32   65:aload           4
	//*  33   67:ifnull          145
	//*  34   70:aload           4
	//*  35   72:ldc2            #536 <String "installed">
	//*  36   75:invokevirtual   #285 <Method boolean String.equals(Object)>
	//*  37   78:ifeq            84
				continue;
	//   38   81:goto            145
			obj = ((Object) (((JSONObject) (obj)).optString("status")));
	//   39   84:aload           5
	//   40   86:ldc2            #538 <String "status">
	//   41   89:invokevirtual   #534 <Method String JSONObject.optString(String)>
	//   42   92:astore          5
			if(obj == null)
	//*  43   94:aload           5
	//*  44   96:ifnonnull       102
				continue;
	//   45   99:goto            145
			if(((String) (obj)).equals("granted"))
	//*  46  102:aload           5
	//*  47  104:ldc2            #540 <String "granted">
	//*  48  107:invokevirtual   #285 <Method boolean String.equals(Object)>
	//*  49  110:ifeq            125
			{
				((List) (arraylist)).add(((Object) (s)));
	//   50  113:aload_2         
	//   51  114:aload           4
	//   52  116:invokeinterface #543 <Method boolean List.add(Object)>
	//   53  121:pop             
				continue;
	//   54  122:goto            145
			}
			if(((String) (obj)).equals("declined"))
	//*  55  125:aload           5
	//*  56  127:ldc2            #545 <String "declined">
	//*  57  130:invokevirtual   #285 <Method boolean String.equals(Object)>
	//*  58  133:ifeq            145
				((List) (arraylist1)).add(((Object) (s)));
	//   59  136:aload_3         
	//   60  137:aload           4
	//   61  139:invokeinterface #543 <Method boolean List.add(Object)>
	//   62  144:pop             
		}

	//   63  145:iload_1         
	//   64  146:iconst_1        
	//   65  147:iadd            
	//   66  148:istore_1        
	//*  67  149:goto            40
		return new PermissionsPair(((List) (arraylist)), ((List) (arraylist1)));
	//   68  152:new             #16  <Class Utility$PermissionsPair>
	//   69  155:dup             
	//   70  156:aload_2         
	//   71  157:aload_3         
	//   72  158:invokespecial   #548 <Method void Utility$PermissionsPair(List, List)>
	//   73  161:areturn         
	}

	private static String hashBytes(MessageDigest messagedigest, byte abyte0[])
	{
		messagedigest.update(abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #556 <Method void MessageDigest.update(byte[])>
		messagedigest = ((MessageDigest) (messagedigest.digest()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #560 <Method byte[] MessageDigest.digest()>
	//    5    9:astore_0        
		abyte0 = ((byte []) (new StringBuilder()));
	//    6   10:new             #171 <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #172 <Method void StringBuilder()>
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
	//   28   41:invokestatic    #565 <Method String Integer.toHexString(int)>
	//   29   44:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   30   47:pop             
			((StringBuilder) (abyte0)).append(Integer.toHexString(byte0 >> 0 & 0xf));
	//   31   48:aload_1         
	//   32   49:iload           4
	//   33   51:iconst_0        
	//   34   52:ishr            
	//   35   53:bipush          15
	//   36   55:iand            
	//   37   56:invokestatic    #565 <Method String Integer.toHexString(int)>
	//   38   59:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   39   62:pop             
		}

	//   40   63:iload_2         
	//   41   64:iconst_1        
	//   42   65:iadd            
	//   43   66:istore_2        
	//*  44   67:goto            23
		return ((StringBuilder) (abyte0)).toString();
	//   45   70:aload_1         
	//   46   71:invokevirtual   #185 <Method String StringBuilder.toString()>
	//   47   74:areturn         
	}

	private static String hashWithAlgorithm(String s, String s1)
	{
		return hashWithAlgorithm(s, s1.getBytes());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #569 <Method byte[] String.getBytes()>
	//    3    5:invokestatic    #572 <Method String hashWithAlgorithm(String, byte[])>
	//    4    8:areturn         
	}

	private static String hashWithAlgorithm(String s, byte abyte0[])
	{
		try
		{
			s = ((String) (MessageDigest.getInstance(s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #577 <Method MessageDigest MessageDigest.getInstance(String)>
	//    2    4:astore_0        
		}
	//*   3    5:aload_0         
	//*   4    6:aload_1         
	//*   5    7:invokestatic    #579 <Method String hashBytes(MessageDigest, byte[])>
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

	public static transient Object invokeMethodQuietly(Object obj, Method method, Object aobj[])
	{
		try
		{
			obj = method.invoke(obj, aobj);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #591 <Method Object Method.invoke(Object, Object[])>
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

	public static boolean isAutofillAvailable(Context context)
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #598 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_1        
		boolean flag1 = false;
	//    2    4:iconst_0        
	//    3    5:istore_3        
		if(i < 26)
	//*   4    6:iload_1         
	//*   5    7:bipush          26
	//*   6    9:icmpge          14
			return false;
	//    7   12:iconst_0        
	//    8   13:ireturn         
		context = ((Context) ((AutofillManager)context.getSystemService(android/view/autofill/AutofillManager)));
	//    9   14:aload_0         
	//   10   15:ldc2            #600 <Class AutofillManager>
	//   11   18:invokevirtual   #604 <Method Object Context.getSystemService(Class)>
	//   12   21:checkcast       #600 <Class AutofillManager>
	//   13   24:astore_0        
		boolean flag = flag1;
	//   14   25:iload_3         
	//   15   26:istore_2        
		if(context != null)
	//*  16   27:aload_0         
	//*  17   28:ifnull          51
		{
			flag = flag1;
	//   18   31:iload_3         
	//   19   32:istore_2        
			if(((AutofillManager) (context)).isAutofillSupported())
	//*  20   33:aload_0         
	//*  21   34:invokevirtual   #607 <Method boolean AutofillManager.isAutofillSupported()>
	//*  22   37:ifeq            51
			{
				flag = flag1;
	//   23   40:iload_3         
	//   24   41:istore_2        
				if(((AutofillManager) (context)).isEnabled())
	//*  25   42:aload_0         
	//*  26   43:invokevirtual   #610 <Method boolean AutofillManager.isEnabled()>
	//*  27   46:ifeq            51
					flag = true;
	//   28   49:iconst_1        
	//   29   50:istore_2        
			}
		}
		return flag;
	//   30   51:iload_2         
	//   31   52:ireturn         
	}

	public static boolean isChromeOS(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 27)
	//*   0    0:getstatic       #598 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          27
	//*   2    5:icmplt          19
			return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
	//    3    8:aload_0         
	//    4    9:invokevirtual   #615 <Method PackageManager Context.getPackageManager()>
	//    5   12:ldc2            #617 <String "android.hardware.type.pc">
	//    6   15:invokevirtual   #622 <Method boolean PackageManager.hasSystemFeature(String)>
	//    7   18:ireturn         
		return Build.DEVICE != null && Build.DEVICE.matches(".+_cheets|cheets_.+");
	//    8   19:getstatic       #627 <Field String Build.DEVICE>
	//    9   22:ifnull          39
	//   10   25:getstatic       #627 <Field String Build.DEVICE>
	//   11   28:ldc2            #629 <String ".+_cheets|cheets_.+">
	//   12   31:invokevirtual   #632 <Method boolean String.matches(String)>
	//   13   34:ifeq            39
	//   14   37:iconst_1        
	//   15   38:ireturn         
	//   16   39:iconst_0        
	//   17   40:ireturn         
	}

	public static boolean isContentUri(Uri uri)
	{
		return uri != null && "content".equalsIgnoreCase(uri.getScheme());
	//    0    0:aload_0         
	//    1    1:ifnull          19
	//    2    4:ldc2            #636 <String "content">
	//    3    7:aload_0         
	//    4    8:invokevirtual   #639 <Method String Uri.getScheme()>
	//    5   11:invokevirtual   #642 <Method boolean String.equalsIgnoreCase(String)>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public static boolean isCurrentAccessToken(AccessToken accesstoken)
	{
		return accesstoken != null && accesstoken.equals(((Object) (AccessToken.getCurrentAccessToken())));
	//    0    0:aload_0         
	//    1    1:ifnull          16
	//    2    4:aload_0         
	//    3    5:invokestatic    #650 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//    4    8:invokevirtual   #651 <Method boolean AccessToken.equals(Object)>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public static boolean isFileUri(Uri uri)
	{
		return uri != null && "file".equalsIgnoreCase(uri.getScheme());
	//    0    0:aload_0         
	//    1    1:ifnull          19
	//    2    4:ldc2            #654 <String "file">
	//    3    7:aload_0         
	//    4    8:invokevirtual   #639 <Method String Uri.getScheme()>
	//    5   11:invokevirtual   #642 <Method boolean String.equalsIgnoreCase(String)>
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
	//    3    5:invokevirtual   #655 <Method int String.length()>
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
	//    3    5:invokeinterface #661 <Method int Collection.size()>
	//    4   10:ifne            16
	//    5   13:goto            18
	//    6   16:iconst_0        
	//    7   17:ireturn         
	//    8   18:iconst_1        
	//    9   19:ireturn         
	}

	public static boolean isWebUri(Uri uri)
	{
		return uri != null && ("http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme()));
	//    0    0:aload_0         
	//    1    1:ifnull          44
	//    2    4:ldc2            #665 <String "http">
	//    3    7:aload_0         
	//    4    8:invokevirtual   #639 <Method String Uri.getScheme()>
	//    5   11:invokevirtual   #642 <Method boolean String.equalsIgnoreCase(String)>
	//    6   14:ifne            42
	//    7   17:ldc1            #94  <String "https">
	//    8   19:aload_0         
	//    9   20:invokevirtual   #639 <Method String Uri.getScheme()>
	//   10   23:invokevirtual   #642 <Method boolean String.equalsIgnoreCase(String)>
	//   11   26:ifne            42
	//   12   29:ldc2            #667 <String "fbstaging">
	//   13   32:aload_0         
	//   14   33:invokevirtual   #639 <Method String Uri.getScheme()>
	//   15   36:invokevirtual   #642 <Method boolean String.equalsIgnoreCase(String)>
	//   16   39:ifeq            44
	//   17   42:iconst_1        
	//   18   43:ireturn         
	//   19   44:iconst_0        
	//   20   45:ireturn         
	}

	public static Set jsonArrayToSet(JSONArray jsonarray)
		throws JSONException
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #671 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #672 <Method void HashSet()>
	//    3    7:astore_2        
		for(int i = 0; i < jsonarray.length(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #522 <Method int JSONArray.length()>
	//*   9   15:icmpge          37
			((Set) (hashset)).add(((Object) (jsonarray.getString(i))));
	//   10   18:aload_2         
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #675 <Method String JSONArray.getString(int)>
	//   14   24:invokeinterface #676 <Method boolean Set.add(Object)>
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
	//    0    0:new             #53  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void ArrayList()>
	//    3    7:astore_2        
		for(int i = 0; i < jsonarray.length(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #522 <Method int JSONArray.length()>
	//*   9   15:icmpge          35
			arraylist.add(((Object) (jsonarray.getString(i))));
	//   10   18:aload_2         
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #675 <Method String JSONArray.getString(int)>
	//   14   24:invokevirtual   #59  <Method boolean ArrayList.add(Object)>
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

	public static void logd(String s, Exception exception)
	{
		if(FacebookSdk.isDebugEnabled() && s != null && exception != null)
	//*   0    0:invokestatic    #685 <Method boolean FacebookSdk.isDebugEnabled()>
	//*   1    3:ifeq            60
	//*   2    6:aload_0         
	//*   3    7:ifnull          60
	//*   4   10:aload_1         
	//*   5   11:ifnull          60
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   14:new             #171 <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #172 <Method void StringBuilder()>
	//    9   21:astore_2        
			stringbuilder.append(((Object) (exception)).getClass().getSimpleName());
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #313 <Method Class Object.getClass()>
	//   13   27:invokevirtual   #318 <Method String Class.getSimpleName()>
	//   14   30:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:pop             
			stringbuilder.append(": ");
	//   16   34:aload_2         
	//   17   35:ldc2            #687 <String ": ">
	//   18   38:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   19   41:pop             
			stringbuilder.append(exception.getMessage());
	//   20   42:aload_2         
	//   21   43:aload_1         
	//   22   44:invokevirtual   #690 <Method String Exception.getMessage()>
	//   23   47:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   24   50:pop             
			Log.d(s, stringbuilder.toString());
	//   25   51:aload_0         
	//   26   52:aload_2         
	//   27   53:invokevirtual   #185 <Method String StringBuilder.toString()>
	//   28   56:invokestatic    #696 <Method int Log.d(String, String)>
	//   29   59:pop             
		}
	//   30   60:return          
	}

	public static void logd(String s, String s1)
	{
		if(FacebookSdk.isDebugEnabled() && s != null && s1 != null)
	//*   0    0:invokestatic    #685 <Method boolean FacebookSdk.isDebugEnabled()>
	//*   1    3:ifeq            20
	//*   2    6:aload_0         
	//*   3    7:ifnull          20
	//*   4   10:aload_1         
	//*   5   11:ifnull          20
			Log.d(s, s1);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokestatic    #696 <Method int Log.d(String, String)>
	//    9   19:pop             
	//   10   20:return          
	}

	public static void logd(String s, String s1, Throwable throwable)
	{
		if(FacebookSdk.isDebugEnabled() && !isNullOrEmpty(s))
	//*   0    0:invokestatic    #685 <Method boolean FacebookSdk.isDebugEnabled()>
	//*   1    3:ifeq            20
	//*   2    6:aload_0         
	//*   3    7:invokestatic    #219 <Method boolean isNullOrEmpty(String)>
	//*   4   10:ifne            20
			Log.d(s, s1, throwable);
	//    5   13:aload_0         
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:invokestatic    #700 <Method int Log.d(String, String, Throwable)>
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
	//    4    6:new             #53  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #56  <Method void ArrayList()>
	//    7   13:astore_2        
		list = ((List) (list.iterator()));
	//    8   14:aload_0         
	//    9   15:invokeinterface #703 <Method Iterator List.iterator()>
	//   10   20:astore_0        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//   11   21:aload_0         
	//   12   22:invokeinterface #122 <Method boolean Iterator.hasNext()>
	//   13   27:ifeq            58
			Object obj = mapper.apply(((Iterator) (list)).next());
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:invokeinterface #126 <Method Object Iterator.next()>
	//   17   37:invokeinterface #707 <Method Object Utility$Mapper.apply(Object)>
	//   18   42:astore_3        
			if(obj != null)
	//*  19   43:aload_3         
	//*  20   44:ifnull          21
				((List) (arraylist)).add(obj);
	//   21   47:aload_2         
	//   22   48:aload_3         
	//   23   49:invokeinterface #543 <Method boolean List.add(Object)>
	//   24   54:pop             
		} while(true);
	//   25   55:goto            21
		if(((List) (arraylist)).size() == 0)
	//*  26   58:aload_2         
	//*  27   59:invokeinterface #708 <Method int List.size()>
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
	//    0    0:ldc2            #712 <String "MD5">
	//    1    3:aload_0         
	//    2    4:invokestatic    #714 <Method String hashWithAlgorithm(String, String)>
	//    3    7:areturn         
	}

	public static boolean mustFixWindowParamsForAutofill(Context context)
	{
		return isAutofillAvailable(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #717 <Method boolean isAutofillAvailable(Context)>
	//    2    4:ireturn         
	}

	public static Bundle parseUrlQueryString(String s)
	{
		int i;
		int j;
		Bundle bundle;
		bundle = new Bundle();
	//    0    0:new             #106 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #401 <Method void Bundle()>
	//    3    7:astore_3        
		if(isNullOrEmpty(s))
			break MISSING_BLOCK_LABEL_120;
	//    4    8:aload_0         
	//    5    9:invokestatic    #219 <Method boolean isNullOrEmpty(String)>
	//    6   12:ifne            120
		s = ((String) (s.split("&")));
	//    7   15:aload_0         
	//    8   16:ldc2            #723 <String "&">
	//    9   19:invokevirtual   #167 <Method String[] String.split(String)>
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
	//   18   30:icmpge          120
_L1:
		String as[] = ((String) (s[i])).split("=");
	//   19   33:aload_0         
	//   20   34:iload_1         
	//   21   35:aaload          
	//   22   36:ldc1            #169 <String "=">
	//   23   38:invokevirtual   #167 <Method String[] String.split(String)>
	//   24   41:astore          4
		if(as.length == 2)
	//*  25   43:aload           4
	//*  26   45:arraylength     
	//*  27   46:iconst_2        
	//*  28   47:icmpne          77
		{
			bundle.putString(URLDecoder.decode(as[0], "UTF-8"), URLDecoder.decode(as[1], "UTF-8"));
	//   29   50:aload_3         
	//   30   51:aload           4
	//   31   53:iconst_0        
	//   32   54:aaload          
	//   33   55:ldc2            #725 <String "UTF-8">
	//   34   58:invokestatic    #730 <Method String URLDecoder.decode(String, String)>
	//   35   61:aload           4
	//   36   63:iconst_1        
	//   37   64:aaload          
	//   38   65:ldc2            #725 <String "UTF-8">
	//   39   68:invokestatic    #730 <Method String URLDecoder.decode(String, String)>
	//   40   71:invokevirtual   #408 <Method void Bundle.putString(String, String)>
			continue; /* Loop/switch isn't completed */
	//   41   74:goto            113
		}
		try
		{
			if(as.length == 1)
	//*  42   77:aload           4
	//*  43   79:arraylength     
	//*  44   80:iconst_1        
	//*  45   81:icmpne          113
				bundle.putString(URLDecoder.decode(as[0], "UTF-8"), "");
	//   46   84:aload_3         
	//   47   85:aload           4
	//   48   87:iconst_0        
	//   49   88:aaload          
	//   50   89:ldc2            #725 <String "UTF-8">
	//   51   92:invokestatic    #730 <Method String URLDecoder.decode(String, String)>
	//   52   95:ldc1            #32  <String "">
	//   53   97:invokevirtual   #408 <Method void Bundle.putString(String, String)>
		}
	//*  54  100:goto            113
		catch(UnsupportedEncodingException unsupportedencodingexception)
	//*  55  103:astore          4
		{
			logd("FacebookSDK", ((Exception) (unsupportedencodingexception)));
	//   56  105:ldc2            #732 <String "FacebookSDK">
	//   57  108:aload           4
	//   58  110:invokestatic    #734 <Method void logd(String, Exception)>
		}
		i++;
	//   59  113:iload_1         
	//   60  114:iconst_1        
	//   61  115:iadd            
	//   62  116:istore_1        
		  goto _L3
	//*  63  117:goto            28
_L2:
		return bundle;
	//   64  120:aload_3         
	//   65  121:areturn         
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
	//    4    6:invokevirtual   #739 <Method void Bundle.remove(String)>
			else
	//*   5    9:goto            230
			if(obj instanceof Boolean)
	//*   6   12:aload_2         
	//*   7   13:instanceof      #741 <Class Boolean>
	//*   8   16:ifeq            34
				bundle.putBoolean(s, ((Boolean)obj).booleanValue());
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:checkcast       #741 <Class Boolean>
	//   13   25:invokevirtual   #744 <Method boolean Boolean.booleanValue()>
	//   14   28:invokevirtual   #748 <Method void Bundle.putBoolean(String, boolean)>
			else
	//*  15   31:goto            230
			if(obj instanceof boolean[])
	//*  16   34:aload_2         
	//*  17   35:instanceof      #750 <Class boolean[]>
	//*  18   38:ifeq            53
				bundle.putBooleanArray(s, (boolean[])obj);
	//   19   41:aload_0         
	//   20   42:aload_1         
	//   21   43:aload_2         
	//   22   44:checkcast       #750 <Class boolean[]>
	//   23   47:invokevirtual   #754 <Method void Bundle.putBooleanArray(String, boolean[])>
			else
	//*  24   50:goto            230
			if(obj instanceof Double)
	//*  25   53:aload_2         
	//*  26   54:instanceof      #756 <Class Double>
	//*  27   57:ifeq            75
				bundle.putDouble(s, ((Double)obj).doubleValue());
	//   28   60:aload_0         
	//   29   61:aload_1         
	//   30   62:aload_2         
	//   31   63:checkcast       #756 <Class Double>
	//   32   66:invokevirtual   #760 <Method double Double.doubleValue()>
	//   33   69:invokevirtual   #764 <Method void Bundle.putDouble(String, double)>
			else
	//*  34   72:goto            230
			if(obj instanceof double[])
	//*  35   75:aload_2         
	//*  36   76:instanceof      #766 <Class double[]>
	//*  37   79:ifeq            94
				bundle.putDoubleArray(s, (double[])obj);
	//   38   82:aload_0         
	//   39   83:aload_1         
	//   40   84:aload_2         
	//   41   85:checkcast       #766 <Class double[]>
	//   42   88:invokevirtual   #770 <Method void Bundle.putDoubleArray(String, double[])>
			else
	//*  43   91:goto            230
			if(obj instanceof Integer)
	//*  44   94:aload_2         
	//*  45   95:instanceof      #562 <Class Integer>
	//*  46   98:ifeq            116
				bundle.putInt(s, ((Integer)obj).intValue());
	//   47  101:aload_0         
	//   48  102:aload_1         
	//   49  103:aload_2         
	//   50  104:checkcast       #562 <Class Integer>
	//   51  107:invokevirtual   #773 <Method int Integer.intValue()>
	//   52  110:invokevirtual   #777 <Method void Bundle.putInt(String, int)>
			else
	//*  53  113:goto            230
			if(obj instanceof int[])
	//*  54  116:aload_2         
	//*  55  117:instanceof      #779 <Class int[]>
	//*  56  120:ifeq            135
				bundle.putIntArray(s, (int[])obj);
	//   57  123:aload_0         
	//   58  124:aload_1         
	//   59  125:aload_2         
	//   60  126:checkcast       #779 <Class int[]>
	//   61  129:invokevirtual   #783 <Method void Bundle.putIntArray(String, int[])>
			else
	//*  62  132:goto            230
			if(obj instanceof Long)
	//*  63  135:aload_2         
	//*  64  136:instanceof      #324 <Class Long>
	//*  65  139:ifeq            157
				bundle.putLong(s, ((Long)obj).longValue());
	//   66  142:aload_0         
	//   67  143:aload_1         
	//   68  144:aload_2         
	//   69  145:checkcast       #324 <Class Long>
	//   70  148:invokevirtual   #328 <Method long Long.longValue()>
	//   71  151:invokevirtual   #787 <Method void Bundle.putLong(String, long)>
			else
	//*  72  154:goto            230
			if(obj instanceof long[])
	//*  73  157:aload_2         
	//*  74  158:instanceof      #789 <Class long[]>
	//*  75  161:ifeq            176
				bundle.putLongArray(s, (long[])obj);
	//   76  164:aload_0         
	//   77  165:aload_1         
	//   78  166:aload_2         
	//   79  167:checkcast       #789 <Class long[]>
	//   80  170:invokevirtual   #793 <Method void Bundle.putLongArray(String, long[])>
			else
	//*  81  173:goto            230
			if(obj instanceof String)
	//*  82  176:aload_2         
	//*  83  177:instanceof      #128 <Class String>
	//*  84  180:ifeq            195
				bundle.putString(s, (String)obj);
	//   85  183:aload_0         
	//   86  184:aload_1         
	//   87  185:aload_2         
	//   88  186:checkcast       #128 <Class String>
	//   89  189:invokevirtual   #408 <Method void Bundle.putString(String, String)>
			else
	//*  90  192:goto            230
			if(obj instanceof JSONArray)
	//*  91  195:aload_2         
	//*  92  196:instanceof      #491 <Class JSONArray>
	//*  93  199:ifeq            214
			{
				bundle.putString(s, obj.toString());
	//   94  202:aload_0         
	//   95  203:aload_1         
	//   96  204:aload_2         
	//   97  205:invokevirtual   #794 <Method String Object.toString()>
	//   98  208:invokevirtual   #408 <Method void Bundle.putString(String, String)>
			} else
	//*  99  211:goto            230
			{
				if(!(obj instanceof JSONObject))
					break label0;
	//  100  214:aload_2         
	//  101  215:instanceof      #478 <Class JSONObject>
	//  102  218:ifeq            232
				bundle.putString(s, obj.toString());
	//  103  221:aload_0         
	//  104  222:aload_1         
	//  105  223:aload_2         
	//  106  224:invokevirtual   #794 <Method String Object.toString()>
	//  107  227:invokevirtual   #408 <Method void Bundle.putString(String, String)>
			}
			return true;
	//  108  230:iconst_1        
	//  109  231:ireturn         
		}
		return false;
	//  110  232:iconst_0        
	//  111  233:ireturn         
	}

	public static void putNonEmptyString(Bundle bundle, String s, String s1)
	{
		if(!isNullOrEmpty(s1))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #219 <Method boolean isNullOrEmpty(String)>
	//*   2    4:ifne            13
			bundle.putString(s, s1);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #408 <Method void Bundle.putString(String, String)>
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
	//    5    7:invokevirtual   #506 <Method String Uri.toString()>
	//    6   10:invokestatic    #800 <Method void putNonEmptyString(Bundle, String, String)>
	//    7   13:return          
	}

	public static String readStreamToString(InputStream inputstream)
		throws IOException
	{
		BufferedInputStream bufferedinputstream = new BufferedInputStream(inputstream);
	//    0    0:new             #232 <Class BufferedInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #235 <Method void BufferedInputStream(InputStream)>
	//    4    8:astore_3        
		Object obj = ((Object) (new InputStreamReader(((InputStream) (bufferedinputstream)))));
	//    5    9:new             #804 <Class InputStreamReader>
	//    6   12:dup             
	//    7   13:aload_3         
	//    8   14:invokespecial   #805 <Method void InputStreamReader(InputStream)>
	//    9   17:astore_2        
		char ac[];
		inputstream = ((InputStream) (new StringBuilder()));
	//   10   18:new             #171 <Class StringBuilder>
	//   11   21:dup             
	//   12   22:invokespecial   #172 <Method void StringBuilder()>
	//   13   25:astore_0        
		ac = new char[2048];
	//   14   26:sipush          2048
	//   15   29:newarray        char[]
	//   16   31:astore          4
_L1:
		int i = ((InputStreamReader) (obj)).read(ac);
	//   17   33:aload_2         
	//   18   34:aload           4
	//   19   36:invokevirtual   #808 <Method int InputStreamReader.read(char[])>
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
	//   28   50:invokevirtual   #811 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//   29   53:pop             
		  goto _L1
	//*  30   54:goto            33
		inputstream = ((InputStream) (((StringBuilder) (inputstream)).toString()));
	//   31   57:aload_0         
	//   32   58:invokevirtual   #185 <Method String StringBuilder.toString()>
	//   33   61:astore_0        
		closeQuietly(((Closeable) (bufferedinputstream)));
	//   34   62:aload_3         
	//   35   63:invokestatic    #813 <Method void closeQuietly(Closeable)>
		closeQuietly(((Closeable) (obj)));
	//   36   66:aload_2         
	//   37   67:invokestatic    #813 <Method void closeQuietly(Closeable)>
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
	//   52   88:invokestatic    #813 <Method void closeQuietly(Closeable)>
		closeQuietly(((Closeable) (obj)));
	//   53   91:aload_2         
	//   54   92:invokestatic    #813 <Method void closeQuietly(Closeable)>
		throw inputstream;
	//   55   95:aload_0         
	//   56   96:athrow          
	}

	public static Map readStringMapFromParcel(Parcel parcel)
	{
		int j = parcel.readInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #820 <Method int Parcel.readInt()>
	//    2    4:istore_2        
		if(j < 0)
	//*   3    5:iload_2         
	//*   4    6:ifge            11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		HashMap hashmap = new HashMap();
	//    7   11:new             #822 <Class HashMap>
	//    8   14:dup             
	//    9   15:invokespecial   #823 <Method void HashMap()>
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
	//   18   28:invokevirtual   #826 <Method String Parcel.readString()>
	//   19   31:aload_0         
	//   20   32:invokevirtual   #826 <Method String Parcel.readString()>
	//   21   35:invokeinterface #832 <Method Object Map.put(Object, Object)>
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
	//*   0    0:invokestatic    #836 <Method boolean externalStorageExists()>
	//*   1    3:ifeq            34
			{
				StatFs statfs = new StatFs(Environment.getExternalStorageDirectory().getPath());
	//    2    6:new             #838 <Class StatFs>
	//    3    9:dup             
	//    4   10:invokestatic    #842 <Method File Environment.getExternalStorageDirectory()>
	//    5   13:invokevirtual   #845 <Method String File.getPath()>
	//    6   16:invokespecial   #846 <Method void StatFs(String)>
	//    7   19:astore_0        
				availableExternalStorageGB = (long)statfs.getAvailableBlocks() * (long)statfs.getBlockSize();
	//    8   20:aload_0         
	//    9   21:invokevirtual   #849 <Method int StatFs.getAvailableBlocks()>
	//   10   24:i2l             
	//   11   25:aload_0         
	//   12   26:invokevirtual   #852 <Method int StatFs.getBlockSize()>
	//   13   29:i2l             
	//   14   30:lmul            
	//   15   31:putstatic       #854 <Field long availableExternalStorageGB>
			}
			availableExternalStorageGB = convertBytesToGB(availableExternalStorageGB);
	//   16   34:getstatic       #854 <Field long availableExternalStorageGB>
	//   17   37:l2d             
	//   18   38:invokestatic    #856 <Method long convertBytesToGB(double)>
	//   19   41:putstatic       #854 <Field long availableExternalStorageGB>
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
		int i = numCPUCores;
	//    0    0:getstatic       #859 <Field int numCPUCores>
	//    1    3:istore_0        
		if(i > 0)
	//*   2    4:iload_0         
	//*   3    5:ifle            10
			return i;
	//    4    8:iload_0         
	//    5    9:ireturn         
		File afile[] = (new File("/sys/devices/system/cpu/")).listFiles(new FilenameFilter() {

			public boolean accept(File file, String s)
			{
				return Pattern.matches("cpu[0-9]+", ((CharSequence) (s)));
			//    0    0:ldc1            #20  <String "cpu[0-9]+">
			//    1    2:aload_2         
			//    2    3:invokestatic    #26  <Method boolean Pattern.matches(String, CharSequence)>
			//    3    6:ireturn         
			}

		}
);
	//    6   10:new             #254 <Class File>
	//    7   13:dup             
	//    8   14:ldc2            #861 <String "/sys/devices/system/cpu/">
	//    9   17:invokespecial   #862 <Method void File(String)>
	//   10   20:new             #8   <Class Utility$2>
	//   11   23:dup             
	//   12   24:invokespecial   #863 <Method void Utility$2()>
	//   13   27:invokevirtual   #866 <Method File[] File.listFiles(FilenameFilter)>
	//   14   30:astore_1        
		if(afile != null)
	//*  15   31:aload_1         
	//*  16   32:ifnull          40
			try
			{
				numCPUCores = afile.length;
	//   17   35:aload_1         
	//   18   36:arraylength     
	//   19   37:putstatic       #859 <Field int numCPUCores>
			}
	//*  20   40:getstatic       #859 <Field int numCPUCores>
	//*  21   43:ifgt            59
	//*  22   46:invokestatic    #872 <Method Runtime Runtime.getRuntime()>
	//*  23   49:invokevirtual   #875 <Method int Runtime.availableProcessors()>
	//*  24   52:iconst_1        
	//*  25   53:invokestatic    #879 <Method int Math.max(int, int)>
	//*  26   56:putstatic       #859 <Field int numCPUCores>
	//*  27   59:getstatic       #859 <Field int numCPUCores>
	//*  28   62:ireturn         
			catch(Exception exception) { }
	//   29   63:astore_1        
		if(numCPUCores <= 0)
			numCPUCores = Math.max(Runtime.getRuntime().availableProcessors(), 1);
		return numCPUCores;
	//*  30   64:goto            40
	}

	private static void refreshCarrierName(Context context)
	{
		if(!carrierName.equals("NoCarrier"))
			break MISSING_BLOCK_LABEL_27;
	//    0    0:getstatic       #882 <Field String carrierName>
	//    1    3:ldc1            #29  <String "NoCarrier">
	//    2    5:invokevirtual   #285 <Method boolean String.equals(Object)>
	//    3    8:ifeq            27
		carrierName = ((TelephonyManager)context.getSystemService("phone")).getNetworkOperatorName();
	//    4   11:aload_0         
	//    5   12:ldc2            #884 <String "phone">
	//    6   15:invokevirtual   #886 <Method Object Context.getSystemService(String)>
	//    7   18:checkcast       #888 <Class TelephonyManager>
	//    8   21:invokevirtual   #891 <Method String TelephonyManager.getNetworkOperatorName()>
	//    9   24:putstatic       #882 <Field String carrierName>
		return;
	//   10   27:return          
		context;
	//   11   28:astore_0        
	//   12   29:return          
	}

	private static void refreshPeriodicExtendedDeviceInfo(Context context)
	{
		if(timestampOfLastCheck == -1L || System.currentTimeMillis() - timestampOfLastCheck >= 0x1b7740L)
	//*   0    0:getstatic       #894 <Field long timestampOfLastCheck>
	//*   1    3:ldc2w           #24  <Long -1L>
	//*   2    6:lcmp            
	//*   3    7:ifeq            24
	//*   4   10:invokestatic    #899 <Method long System.currentTimeMillis()>
	//*   5   13:getstatic       #894 <Field long timestampOfLastCheck>
	//*   6   16:lsub            
	//*   7   17:ldc2w           #900 <Long 0x1b7740L>
	//*   8   20:lcmp            
	//*   9   21:iflt            43
		{
			timestampOfLastCheck = System.currentTimeMillis();
	//   10   24:invokestatic    #899 <Method long System.currentTimeMillis()>
	//   11   27:putstatic       #894 <Field long timestampOfLastCheck>
			refreshTimezone();
	//   12   30:invokestatic    #904 <Method void refreshTimezone()>
			refreshCarrierName(context);
	//   13   33:aload_0         
	//   14   34:invokestatic    #906 <Method void refreshCarrierName(Context)>
			refreshTotalExternalStorage();
	//   15   37:invokestatic    #909 <Method void refreshTotalExternalStorage()>
			refreshAvailableExternalStorage();
	//   16   40:invokestatic    #911 <Method void refreshAvailableExternalStorage()>
		}
	//   17   43:return          
	}

	private static void refreshTimezone()
	{
		try
		{
			TimeZone timezone = TimeZone.getDefault();
	//    0    0:invokestatic    #916 <Method TimeZone TimeZone.getDefault()>
	//    1    3:astore_0        
			deviceTimezoneAbbreviation = timezone.getDisplayName(timezone.inDaylightTime(new Date()), 0);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:new             #334 <Class Date>
	//    5    9:dup             
	//    6   10:invokespecial   #917 <Method void Date()>
	//    7   13:invokevirtual   #921 <Method boolean TimeZone.inDaylightTime(Date)>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #925 <Method String TimeZone.getDisplayName(boolean, int)>
	//   10   20:putstatic       #927 <Field String deviceTimezoneAbbreviation>
			deviceTimeZoneName = timezone.getID();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #930 <Method String TimeZone.getID()>
	//   13   27:putstatic       #932 <Field String deviceTimeZoneName>
			return;
	//   14   30:return          
		}
		catch(Exception exception)
	//*  15   31:astore_0        
		{
			return;
	//   16   32:return          
		}
	}

	private static void refreshTotalExternalStorage()
	{
		try
		{
			if(externalStorageExists())
	//*   0    0:invokestatic    #836 <Method boolean externalStorageExists()>
	//*   1    3:ifeq            34
			{
				StatFs statfs = new StatFs(Environment.getExternalStorageDirectory().getPath());
	//    2    6:new             #838 <Class StatFs>
	//    3    9:dup             
	//    4   10:invokestatic    #842 <Method File Environment.getExternalStorageDirectory()>
	//    5   13:invokevirtual   #845 <Method String File.getPath()>
	//    6   16:invokespecial   #846 <Method void StatFs(String)>
	//    7   19:astore_0        
				totalExternalStorageGB = (long)statfs.getBlockCount() * (long)statfs.getBlockSize();
	//    8   20:aload_0         
	//    9   21:invokevirtual   #935 <Method int StatFs.getBlockCount()>
	//   10   24:i2l             
	//   11   25:aload_0         
	//   12   26:invokevirtual   #852 <Method int StatFs.getBlockSize()>
	//   13   29:i2l             
	//   14   30:lmul            
	//   15   31:putstatic       #937 <Field long totalExternalStorageGB>
			}
			totalExternalStorageGB = convertBytesToGB(totalExternalStorageGB);
	//   16   34:getstatic       #937 <Field long totalExternalStorageGB>
	//   17   37:l2d             
	//   18   38:invokestatic    #856 <Method long convertBytesToGB(double)>
	//   19   41:putstatic       #937 <Field long totalExternalStorageGB>
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
	//    4    6:ldc1            #32  <String "">
	//    5    8:invokevirtual   #941 <Method String JSONObject.optString(String, String)>
	//    6   11:areturn         
		else
			return "";
	//    7   12:ldc1            #32  <String "">
	//    8   14:areturn         
	}

	public static void setAppEventAttributionParameters(JSONObject jsonobject, AttributionIdentifiers attributionidentifiers, String s, boolean flag)
		throws JSONException
	{
		if(attributionidentifiers != null && attributionidentifiers.getAttributionId() != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          23
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #948 <Method String AttributionIdentifiers.getAttributionId()>
	//*   4    8:ifnull          23
			jsonobject.put("attribution", ((Object) (attributionidentifiers.getAttributionId())));
	//    5   11:aload_0         
	//    6   12:ldc2            #950 <String "attribution">
	//    7   15:aload_1         
	//    8   16:invokevirtual   #948 <Method String AttributionIdentifiers.getAttributionId()>
	//    9   19:invokevirtual   #952 <Method JSONObject JSONObject.put(String, Object)>
	//   10   22:pop             
		if(attributionidentifiers != null && attributionidentifiers.getAndroidAdvertiserId() != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          60
	//*  13   27:aload_1         
	//*  14   28:invokevirtual   #955 <Method String AttributionIdentifiers.getAndroidAdvertiserId()>
	//*  15   31:ifnull          60
		{
			jsonobject.put("advertiser_id", ((Object) (attributionidentifiers.getAndroidAdvertiserId())));
	//   16   34:aload_0         
	//   17   35:ldc2            #957 <String "advertiser_id">
	//   18   38:aload_1         
	//   19   39:invokevirtual   #955 <Method String AttributionIdentifiers.getAndroidAdvertiserId()>
	//   20   42:invokevirtual   #952 <Method JSONObject JSONObject.put(String, Object)>
	//   21   45:pop             
			jsonobject.put("advertiser_tracking_enabled", attributionidentifiers.isTrackingLimited() ^ true);
	//   22   46:aload_0         
	//   23   47:ldc2            #959 <String "advertiser_tracking_enabled">
	//   24   50:aload_1         
	//   25   51:invokevirtual   #962 <Method boolean AttributionIdentifiers.isTrackingLimited()>
	//   26   54:iconst_1        
	//   27   55:ixor            
	//   28   56:invokevirtual   #965 <Method JSONObject JSONObject.put(String, boolean)>
	//   29   59:pop             
		}
		if(attributionidentifiers != null && attributionidentifiers.getAndroidInstallerPackage() != null)
	//*  30   60:aload_1         
	//*  31   61:ifnull          83
	//*  32   64:aload_1         
	//*  33   65:invokevirtual   #968 <Method String AttributionIdentifiers.getAndroidInstallerPackage()>
	//*  34   68:ifnull          83
			jsonobject.put("installer_package", ((Object) (attributionidentifiers.getAndroidInstallerPackage())));
	//   35   71:aload_0         
	//   36   72:ldc2            #970 <String "installer_package">
	//   37   75:aload_1         
	//   38   76:invokevirtual   #968 <Method String AttributionIdentifiers.getAndroidInstallerPackage()>
	//   39   79:invokevirtual   #952 <Method JSONObject JSONObject.put(String, Object)>
	//   40   82:pop             
		jsonobject.put("anon_id", ((Object) (s)));
	//   41   83:aload_0         
	//   42   84:ldc2            #972 <String "anon_id">
	//   43   87:aload_2         
	//   44   88:invokevirtual   #952 <Method JSONObject JSONObject.put(String, Object)>
	//   45   91:pop             
		jsonobject.put("application_tracking_enabled", flag ^ true);
	//   46   92:aload_0         
	//   47   93:ldc2            #974 <String "application_tracking_enabled">
	//   48   96:iload_3         
	//   49   97:iconst_1        
	//   50   98:ixor            
	//   51   99:invokevirtual   #965 <Method JSONObject JSONObject.put(String, boolean)>
	//   52  102:pop             
	//   53  103:return          
	}

	public static void setAppEventExtendedDeviceInfoParameters(JSONObject jsonobject, Context context)
		throws JSONException
	{
		int i;
		int j;
		Object obj;
		JSONArray jsonarray;
		String s;
		jsonarray = new JSONArray();
	//    0    0:new             #491 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #979 <Method void JSONArray()>
	//    3    7:astore          9
		jsonarray.put("a2");
	//    4    9:aload           9
	//    5   11:ldc2            #981 <String "a2">
	//    6   14:invokevirtual   #984 <Method JSONArray JSONArray.put(Object)>
	//    7   17:pop             
		refreshPeriodicExtendedDeviceInfo(context);
	//    8   18:aload_1         
	//    9   19:invokestatic    #986 <Method void refreshPeriodicExtendedDeviceInfo(Context)>
		s = context.getPackageName();
	//   10   22:aload_1         
	//   11   23:invokevirtual   #989 <Method String Context.getPackageName()>
	//   12   26:astore          10
		obj = "";
	//   13   28:ldc1            #32  <String "">
	//   14   30:astore          7
		j = -1;
	//   15   32:iconst_m1       
	//   16   33:istore          6
		i = j;
	//   17   35:iload           6
	//   18   37:istore          5
		Object obj1 = ((Object) (context.getPackageManager().getPackageInfo(s, 0)));
	//   19   39:aload_1         
	//   20   40:invokevirtual   #615 <Method PackageManager Context.getPackageManager()>
	//   21   43:aload           10
	//   22   45:iconst_0        
	//   23   46:invokevirtual   #993 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   24   49:astore          8
		i = j;
	//   25   51:iload           6
	//   26   53:istore          5
		j = ((PackageInfo) (obj1)).versionCode;
	//   27   55:aload           8
	//   28   57:getfield        #998 <Field int PackageInfo.versionCode>
	//   29   60:istore          6
		i = j;
	//   30   62:iload           6
	//   31   64:istore          5
		obj1 = ((Object) (((PackageInfo) (obj1)).versionName));
	//   32   66:aload           8
	//   33   68:getfield        #1001 <Field String PackageInfo.versionName>
	//   34   71:astore          8
		i = j;
	//   35   73:iload           6
	//   36   75:istore          5
		obj = obj1;
	//   37   77:aload           8
	//   38   79:astore          7
_L4:
		double d;
		jsonarray.put(((Object) (s)));
	//   39   81:aload           9
	//   40   83:aload           10
	//   41   85:invokevirtual   #984 <Method JSONArray JSONArray.put(Object)>
	//   42   88:pop             
		jsonarray.put(i);
	//   43   89:aload           9
	//   44   91:iload           5
	//   45   93:invokevirtual   #1004 <Method JSONArray JSONArray.put(int)>
	//   46   96:pop             
		jsonarray.put(obj);
	//   47   97:aload           9
	//   48   99:aload           7
	//   49  101:invokevirtual   #984 <Method JSONArray JSONArray.put(Object)>
	//   50  104:pop             
		jsonarray.put(((Object) (android.os.Build.VERSION.RELEASE)));
	//   51  105:aload           9
	//   52  107:getstatic       #1007 <Field String android.os.Build$VERSION.RELEASE>
	//   53  110:invokevirtual   #984 <Method JSONArray JSONArray.put(Object)>
	//   54  113:pop             
		jsonarray.put(((Object) (Build.MODEL)));
	//   55  114:aload           9
	//   56  116:getstatic       #1010 <Field String Build.MODEL>
	//   57  119:invokevirtual   #984 <Method JSONArray JSONArray.put(Object)>
	//   58  122:pop             
		try
		{
			obj = ((Object) (context.getResources().getConfiguration().locale));
	//   59  123:aload_1         
	//   60  124:invokevirtual   #383 <Method Resources Context.getResources()>
	//   61  127:invokevirtual   #389 <Method Configuration Resources.getConfiguration()>
	//   62  130:getfield        #395 <Field Locale Configuration.locale>
	//   63  133:astore          7
		}
	//*  64  135:goto            143
	//*  65  138:invokestatic    #400 <Method Locale Locale.getDefault()>
	//*  66  141:astore          7
	//*  67  143:new             #171 <Class StringBuilder>
	//*  68  146:dup             
	//*  69  147:invokespecial   #172 <Method void StringBuilder()>
	//*  70  150:astore          8
	//*  71  152:aload           8
	//*  72  154:aload           7
	//*  73  156:invokevirtual   #1013 <Method String Locale.getLanguage()>
	//*  74  159:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//*  75  162:pop             
	//*  76  163:aload           8
	//*  77  165:ldc2            #1015 <String "_">
	//*  78  168:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//*  79  171:pop             
	//*  80  172:aload           8
	//*  81  174:aload           7
	//*  82  176:invokevirtual   #1018 <Method String Locale.getCountry()>
	//*  83  179:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//*  84  182:pop             
	//*  85  183:aload           9
	//*  86  185:aload           8
	//*  87  187:invokevirtual   #185 <Method String StringBuilder.toString()>
	//*  88  190:invokevirtual   #984 <Method JSONArray JSONArray.put(Object)>
	//*  89  193:pop             
	//*  90  194:aload           9
	//*  91  196:getstatic       #927 <Field String deviceTimezoneAbbreviation>
	//*  92  199:invokevirtual   #984 <Method JSONArray JSONArray.put(Object)>
	//*  93  202:pop             
	//*  94  203:aload           9
	//*  95  205:getstatic       #882 <Field String carrierName>
	//*  96  208:invokevirtual   #984 <Method JSONArray JSONArray.put(Object)>
	//*  97  211:pop             
	//*  98  212:dconst_0        
	//*  99  213:dstore_2        
	//* 100  214:aload_1         
	//* 101  215:ldc2            #1020 <String "window">
	//* 102  218:invokevirtual   #886 <Method Object Context.getSystemService(String)>
	//* 103  221:checkcast       #1022 <Class WindowManager>
	//* 104  224:astore_1        
	//* 105  225:aload_1         
	//* 106  226:ifnull          279
	//* 107  229:aload_1         
	//* 108  230:invokeinterface #1026 <Method Display WindowManager.getDefaultDisplay()>
	//* 109  235:astore_1        
	//* 110  236:new             #1028 <Class DisplayMetrics>
	//* 111  239:dup             
	//* 112  240:invokespecial   #1029 <Method void DisplayMetrics()>
	//* 113  243:astore          7
	//* 114  245:aload_1         
	//* 115  246:aload           7
	//* 116  248:invokevirtual   #1035 <Method void Display.getMetrics(DisplayMetrics)>
	//* 117  251:aload           7
	//* 118  253:getfield        #1038 <Field int DisplayMetrics.widthPixels>
	//* 119  256:istore          6
	//* 120  258:aload           7
	//* 121  260:getfield        #1041 <Field int DisplayMetrics.heightPixels>
	//* 122  263:istore          5
	//* 123  265:aload           7
	//* 124  267:getfield        #1045 <Field float DisplayMetrics.density>
	//* 125  270:fstore          4
	//* 126  272:fload           4
	//* 127  274:f2d             
	//* 128  275:dstore_2        
	//* 129  276:goto            294
	//* 130  279:iconst_0        
	//* 131  280:istore          6
	//* 132  282:iconst_0        
	//* 133  283:istore          5
	//* 134  285:goto            294
	//* 135  288:iconst_0        
	//* 136  289:istore          6
	//* 137  291:iconst_0        
	//* 138  292:istore          5
	//* 139  294:aload           9
	//* 140  296:iload           6
	//* 141  298:invokevirtual   #1004 <Method JSONArray JSONArray.put(int)>
	//* 142  301:pop             
	//* 143  302:aload           9
	//* 144  304:iload           5
	//* 145  306:invokevirtual   #1004 <Method JSONArray JSONArray.put(int)>
	//* 146  309:pop             
	//* 147  310:aload           9
	//* 148  312:ldc2            #1047 <String "%.2f">
	//* 149  315:iconst_1        
	//* 150  316:anewarray       Object[]
	//* 151  319:dup             
	//* 152  320:iconst_0        
	//* 153  321:dload_2         
	//* 154  322:invokestatic    #1051 <Method Double Double.valueOf(double)>
	//* 155  325:aastore         
	//* 156  326:invokestatic    #1055 <Method String String.format(String, Object[])>
	//* 157  329:invokevirtual   #984 <Method JSONArray JSONArray.put(Object)>
	//* 158  332:pop             
	//* 159  333:aload           9
	//* 160  335:invokestatic    #1057 <Method int refreshBestGuessNumberOfCPUCores()>
	//* 161  338:invokevirtual   #1004 <Method JSONArray JSONArray.put(int)>
	//* 162  341:pop             
	//* 163  342:aload           9
	//* 164  344:getstatic       #937 <Field long totalExternalStorageGB>
	//* 165  347:invokevirtual   #1060 <Method JSONArray JSONArray.put(long)>
	//* 166  350:pop             
	//* 167  351:aload           9
	//* 168  353:getstatic       #854 <Field long availableExternalStorageGB>
	//* 169  356:invokevirtual   #1060 <Method JSONArray JSONArray.put(long)>
	//* 170  359:pop             
	//* 171  360:aload           9
	//* 172  362:getstatic       #932 <Field String deviceTimeZoneName>
	//* 173  365:invokevirtual   #984 <Method JSONArray JSONArray.put(Object)>
	//* 174  368:pop             
	//* 175  369:aload           9
	//* 176  371:instanceof      #491 <Class JSONArray>
	//* 177  374:ifne            386
	//* 178  377:aload           9
	//* 179  379:invokevirtual   #1061 <Method String JSONArray.toString()>
	//* 180  382:astore_1        
	//* 181  383:goto            395
	//* 182  386:aload           9
	//* 183  388:checkcast       #491 <Class JSONArray>
	//* 184  391:invokestatic    #1066 <Method String JSONArrayInstrumentation.toString(JSONArray)>
	//* 185  394:astore_1        
	//* 186  395:aload_0         
	//* 187  396:ldc2            #1068 <String "extinfo">
	//* 188  399:aload_1         
	//* 189  400:invokevirtual   #952 <Method JSONObject JSONObject.put(String, Object)>
	//* 190  403:pop             
	//* 191  404:return          
	//* 192  405:astore          8
	//* 193  407:goto            81
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
		jsonarray.put(((Object) (deviceTimezoneAbbreviation)));
		jsonarray.put(((Object) (carrierName)));
		d = 0.0D;
		context = ((Context) ((WindowManager)context.getSystemService("window")));
		if(context == null) goto _L2; else goto _L1
_L1:
		context = ((Context) (((WindowManager) (context)).getDefaultDisplay()));
		obj = ((Object) (new DisplayMetrics()));
		((Display) (context)).getMetrics(((DisplayMetrics) (obj)));
		j = ((DisplayMetrics) (obj)).widthPixels;
		i = ((DisplayMetrics) (obj)).heightPixels;
		float f = ((DisplayMetrics) (obj)).density;
		d = f;
		  goto _L3
_L2:
		j = 0;
		i = 0;
		  goto _L3
_L5:
		j = 0;
_L6:
		i = 0;
_L3:
		jsonarray.put(j);
		jsonarray.put(i);
		jsonarray.put(((Object) (String.format("%.2f", new Object[] {
			Double.valueOf(d)
		}))));
		jsonarray.put(refreshBestGuessNumberOfCPUCores());
		jsonarray.put(totalExternalStorageGB);
		jsonarray.put(availableExternalStorageGB);
		jsonarray.put(((Object) (deviceTimeZoneName)));
		if(!(jsonarray instanceof JSONArray))
			context = ((Context) (jsonarray.toString()));
		else
			context = ((Context) (JSONArrayInstrumentation.toString((JSONArray)jsonarray)));
		jsonobject.put("extinfo", ((Object) (context)));
		return;
		Exception exception;
		android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
		namenotfoundexception;
		  goto _L4
	//* 194  410:astore          7
	//* 195  412:goto            138
		context;
	//  196  415:astore_1        
		  goto _L5
	//* 197  416:goto            288
		context;
	//  198  419:astore_1        
		  goto _L6
	//* 199  420:goto            291
		context;
	//  200  423:astore_1        
		  goto _L3
	//* 201  424:goto            294
	}

	public static String sha1hash(byte abyte0[])
	{
		return hashWithAlgorithm("SHA-1", abyte0);
	//    0    0:ldc2            #1072 <String "SHA-1">
	//    1    3:aload_0         
	//    2    4:invokestatic    #572 <Method String hashWithAlgorithm(String, byte[])>
	//    3    7:areturn         
	}

	public static JSONArray tryGetJSONArrayFromResponse(JSONObject jsonobject, String s)
	{
		if(jsonobject != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          10
			return jsonobject.optJSONArray(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1077 <Method JSONArray JSONObject.optJSONArray(String)>
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
	//    4    6:invokevirtual   #1081 <Method JSONObject JSONObject.optJSONObject(String)>
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
	//    1    1:invokestatic    #1088 <Method List Arrays.asList(Object[])>
	//    2    4:invokestatic    #1093 <Method Collection Collections.unmodifiableCollection(Collection)>
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
	//    4    6:invokevirtual   #1099 <Method void Parcel.writeInt(int)>
			return;
	//    5    9:return          
		}
		parcel.writeInt(map1.size());
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokeinterface #1100 <Method int Map.size()>
	//    9   17:invokevirtual   #1099 <Method void Parcel.writeInt(int)>
		java.util.Map.Entry entry;
		for(map1 = ((Map) (map1.entrySet().iterator())); ((Iterator) (map1)).hasNext(); parcel.writeString((String)entry.getValue()))
	//*  10   20:aload_1         
	//*  11   21:invokeinterface #1103 <Method Set Map.entrySet()>
	//*  12   26:invokeinterface #116 <Method Iterator Set.iterator()>
	//*  13   31:astore_1        
	//*  14   32:aload_1         
	//*  15   33:invokeinterface #122 <Method boolean Iterator.hasNext()>
	//*  16   38:ifeq            80
		{
			entry = (java.util.Map.Entry)((Iterator) (map1)).next();
	//   17   41:aload_1         
	//   18   42:invokeinterface #126 <Method Object Iterator.next()>
	//   19   47:checkcast       #1105 <Class java.util.Map$Entry>
	//   20   50:astore_2        
			parcel.writeString((String)entry.getKey());
	//   21   51:aload_0         
	//   22   52:aload_2         
	//   23   53:invokeinterface #1108 <Method Object java.util.Map$Entry.getKey()>
	//   24   58:checkcast       #128 <Class String>
	//   25   61:invokevirtual   #1111 <Method void Parcel.writeString(String)>
		}

	//   26   64:aload_0         
	//   27   65:aload_2         
	//   28   66:invokeinterface #1114 <Method Object java.util.Map$Entry.getValue()>
	//   29   71:checkcast       #128 <Class String>
	//   30   74:invokevirtual   #1111 <Method void Parcel.writeString(String)>
	//*  31   77:goto            32
	//   32   80:return          
	}

	private static long availableExternalStorageGB = -1L;
	private static String carrierName = "NoCarrier";
	private static String deviceTimeZoneName = "";
	private static String deviceTimezoneAbbreviation = "";
	private static int numCPUCores = 0;
	private static long timestampOfLastCheck = -1L;
	private static long totalExternalStorageGB = -1L;

	static 
	{
	//    0    0:return          
	}
}
