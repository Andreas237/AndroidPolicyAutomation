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
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.*;
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
//			ProfileInformationCache, ImageDownloader, Validate, AttributionIdentifiers

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


	public Utility()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void Object()>
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
	//   10   14:invokevirtual   #77  <Method boolean Object.equals(Object)>
	//   11   17:ireturn         
	}

	public static transient ArrayList arrayList(Object aobj[])
	{
		ArrayList arraylist = new ArrayList(aobj.length);
	//    0    0:new             #83  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:arraylength     
	//    4    6:invokespecial   #86  <Method void ArrayList(int)>
	//    5    9:astore_3        
		int j = aobj.length;
	//    6   10:aload_0         
	//    7   11:arraylength     
	//    8   12:istore_2        
		for(int i = 0; i < j; i++)
	//*   9   13:iconst_0        
	//*  10   14:istore_1        
	//*  11   15:iload_1         
	//*  12   16:iload_2         
	//*  13   17:icmpge          35
			arraylist.add(aobj[i]);
	//   14   20:aload_3         
	//   15   21:aload_0         
	//   16   22:iload_1         
	//   17   23:aaload          
	//   18   24:invokevirtual   #89  <Method boolean ArrayList.add(Object)>
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
	//    0    0:new             #83  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void ArrayList()>
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
	//   20   31:invokevirtual   #89  <Method boolean ArrayList.add(Object)>
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
	//    1    1:invokestatic    #101 <Method JSONObject ProfileInformationCache.getProfileInformation(String)>
	//    2    4:astore_1        
		if(jsonobject != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return jsonobject;
	//    5    9:aload_1         
	//    6   10:areturn         
		s = ((String) (getGraphMeRequestWithCache(s).executeAndWait()));
	//    7   11:aload_0         
	//    8   12:invokestatic    #105 <Method GraphRequest getGraphMeRequestWithCache(String)>
	//    9   15:invokevirtual   #111 <Method GraphResponse GraphRequest.executeAndWait()>
	//   10   18:astore_0        
		if(((GraphResponse) (s)).getError() != null)
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #117 <Method FacebookRequestError GraphResponse.getError()>
	//*  13   23:ifnull          28
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
		else
			return ((GraphResponse) (s)).getJSONObject();
	//   16   28:aload_0         
	//   17   29:invokevirtual   #121 <Method JSONObject GraphResponse.getJSONObject()>
	//   18   32:areturn         
	}

	public static Uri buildUri(String s, String s1, Bundle bundle)
	{
		android.net.Uri.Builder builder = new android.net.Uri.Builder();
	//    0    0:new             #125 <Class android.net.Uri$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #126 <Method void android.net.Uri$Builder()>
	//    3    7:astore_3        
		builder.scheme("https");
	//    4    8:aload_3         
	//    5    9:ldc1            #46  <String "https">
	//    6   11:invokevirtual   #130 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//    7   14:pop             
		builder.authority(s);
	//    8   15:aload_3         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #133 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
	//   11   20:pop             
		builder.path(s1);
	//   12   21:aload_3         
	//   13   22:aload_1         
	//   14   23:invokevirtual   #136 <Method android.net.Uri$Builder android.net.Uri$Builder.path(String)>
	//   15   26:pop             
		if(bundle != null)
	//*  16   27:aload_2         
	//*  17   28:ifnull          89
		{
			s = ((String) (bundle.keySet().iterator()));
	//   18   31:aload_2         
	//   19   32:invokevirtual   #142 <Method Set Bundle.keySet()>
	//   20   35:invokeinterface #148 <Method Iterator Set.iterator()>
	//   21   40:astore_0        
			do
			{
				if(!((Iterator) (s)).hasNext())
					break;
	//   22   41:aload_0         
	//   23   42:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//   24   47:ifeq            89
				s1 = (String)((Iterator) (s)).next();
	//   25   50:aload_0         
	//   26   51:invokeinterface #158 <Method Object Iterator.next()>
	//   27   56:checkcast       #160 <Class String>
	//   28   59:astore_1        
				Object obj = bundle.get(s1);
	//   29   60:aload_2         
	//   30   61:aload_1         
	//   31   62:invokevirtual   #164 <Method Object Bundle.get(String)>
	//   32   65:astore          4
				if(obj instanceof String)
	//*  33   67:aload           4
	//*  34   69:instanceof      #160 <Class String>
	//*  35   72:ifeq            41
					builder.appendQueryParameter(s1, (String)obj);
	//   36   75:aload_3         
	//   37   76:aload_1         
	//   38   77:aload           4
	//   39   79:checkcast       #160 <Class String>
	//   40   82:invokevirtual   #168 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   41   85:pop             
			} while(true);
	//   42   86:goto            41
		}
		return builder.build();
	//   43   89:aload_3         
	//   44   90:invokevirtual   #172 <Method Uri android.net.Uri$Builder.build()>
	//   45   93:areturn         
	}

	public static void clearCaches(Context context)
	{
		ImageDownloader.clearCache(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #179 <Method void ImageDownloader.clearCache(Context)>
	//    2    4:return          
	}

	private static void clearCookiesForDomain(Context context, String s)
	{
		CookieSyncManager.createInstance(context).sync();
	//    0    0:aload_0         
	//    1    1:invokestatic    #187 <Method CookieSyncManager CookieSyncManager.createInstance(Context)>
	//    2    4:invokevirtual   #190 <Method void CookieSyncManager.sync()>
		context = ((Context) (CookieManager.getInstance()));
	//    3    7:invokestatic    #196 <Method CookieManager CookieManager.getInstance()>
	//    4   10:astore_0        
		String s1 = ((CookieManager) (context)).getCookie(s);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #200 <Method String CookieManager.getCookie(String)>
	//    8   16:astore          4
		if(s1 == null)
	//*   9   18:aload           4
	//*  10   20:ifnonnull       24
			return;
	//   11   23:return          
		String as[] = s1.split(";");
	//   12   24:aload           4
	//   13   26:ldc1            #202 <String ";">
	//   14   28:invokevirtual   #206 <Method String[] String.split(String)>
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
	//   27   48:ldc1            #208 <String "=">
	//   28   50:invokevirtual   #206 <Method String[] String.split(String)>
	//   29   53:astore          5
			if(as1.length > 0)
	//*  30   55:aload           5
	//*  31   57:arraylength     
	//*  32   58:ifle            101
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   33   61:new             #210 <Class StringBuilder>
	//   34   64:dup             
	//   35   65:invokespecial   #211 <Method void StringBuilder()>
	//   36   68:astore          6
				stringbuilder.append(as1[0].trim());
	//   37   70:aload           6
	//   38   72:aload           5
	//   39   74:iconst_0        
	//   40   75:aaload          
	//   41   76:invokevirtual   #215 <Method String String.trim()>
	//   42   79:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   43   82:pop             
				stringbuilder.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
	//   44   83:aload           6
	//   45   85:ldc1            #221 <String "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;">
	//   46   87:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   47   90:pop             
				((CookieManager) (context)).setCookie(s, stringbuilder.toString());
	//   48   91:aload_0         
	//   49   92:aload_1         
	//   50   93:aload           6
	//   51   95:invokevirtual   #224 <Method String StringBuilder.toString()>
	//   52   98:invokevirtual   #228 <Method void CookieManager.setCookie(String, String)>
			}
		}

	//   53  101:iload_2         
	//   54  102:iconst_1        
	//   55  103:iadd            
	//   56  104:istore_2        
	//*  57  105:goto            39
		((CookieManager) (context)).removeExpiredCookie();
	//   58  108:aload_0         
	//   59  109:invokevirtual   #231 <Method void CookieManager.removeExpiredCookie()>
	//   60  112:return          
	}

	public static void clearFacebookCookies(Context context)
	{
		clearCookiesForDomain(context, "facebook.com");
	//    0    0:aload_0         
	//    1    1:ldc1            #234 <String "facebook.com">
	//    2    3:invokestatic    #236 <Method void clearCookiesForDomain(Context, String)>
		clearCookiesForDomain(context, ".facebook.com");
	//    3    6:aload_0         
	//    4    7:ldc1            #238 <String ".facebook.com">
	//    5    9:invokestatic    #236 <Method void clearCookiesForDomain(Context, String)>
		clearCookiesForDomain(context, "https://facebook.com");
	//    6   12:aload_0         
	//    7   13:ldc1            #240 <String "https://facebook.com">
	//    8   15:invokestatic    #236 <Method void clearCookiesForDomain(Context, String)>
		clearCookiesForDomain(context, "https://.facebook.com");
	//    9   18:aload_0         
	//   10   19:ldc1            #242 <String "https://.facebook.com">
	//   11   21:invokestatic    #236 <Method void clearCookiesForDomain(Context, String)>
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
	//    3    5:invokeinterface #251 <Method void Closeable.close()>
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
	//*   1    1:invokestatic    #257 <Method boolean isNullOrEmpty(String)>
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
	//    1    1:ldc2w           #260 <Double 1073741824D>
	//    2    4:ddiv            
	//    3    5:invokestatic    #266 <Method long Math.round(double)>
	//    4    8:lreturn         
	}

	static Map convertJSONObjectToHashMap(JSONObject jsonobject)
	{
		int i;
		HashMap hashmap;
		JSONArray jsonarray;
		hashmap = new HashMap();
	//    0    0:new             #272 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #273 <Method void HashMap()>
	//    3    7:astore          4
		jsonarray = jsonobject.names();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #279 <Method JSONArray JSONObject.names()>
	//    6   13:astore          5
		i = 0;
	//    7   15:iconst_0        
	//    8   16:istore_1        
_L3:
		if(i >= jsonarray.length()) goto _L2; else goto _L1
	//    9   17:iload_1         
	//   10   18:aload           5
	//   11   20:invokevirtual   #285 <Method int JSONArray.length()>
	//   12   23:icmpge          74
_L1:
		Object obj1;
		String s;
		s = jsonarray.getString(i);
	//   13   26:aload           5
	//   14   28:iload_1         
	//   15   29:invokevirtual   #289 <Method String JSONArray.getString(int)>
	//   16   32:astore          6
		obj1 = jsonobject.get(s);
	//   17   34:aload_0         
	//   18   35:aload           6
	//   19   37:invokevirtual   #290 <Method Object JSONObject.get(String)>
	//   20   40:astore_3        
		Object obj = obj1;
	//   21   41:aload_3         
	//   22   42:astore_2        
		try
		{
			if(obj1 instanceof JSONObject)
	//*  23   43:aload_3         
	//*  24   44:instanceof      #275 <Class JSONObject>
	//*  25   47:ifeq            58
				obj = ((Object) (convertJSONObjectToHashMap((JSONObject)obj1)));
	//   26   50:aload_3         
	//   27   51:checkcast       #275 <Class JSONObject>
	//   28   54:invokestatic    #292 <Method Map convertJSONObjectToHashMap(JSONObject)>
	//   29   57:astore_2        
			hashmap.put(((Object) (s)), obj);
	//   30   58:aload           4
	//   31   60:aload           6
	//   32   62:aload_2         
	//   33   63:invokevirtual   #296 <Method Object HashMap.put(Object, Object)>
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
	//    0    0:new             #301 <Class BufferedInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #304 <Method void BufferedInputStream(InputStream)>
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
	//   12   23:invokevirtual   #308 <Method int BufferedInputStream.read(byte[])>
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
	//   21   37:invokevirtual   #314 <Method void OutputStream.write(byte[], int, int)>
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
	//   28   49:invokevirtual   #315 <Method void BufferedInputStream.close()>
		if(inputstream != null)
	//*  29   52:aload_0         
	//*  30   53:ifnull          60
			inputstream.close();
	//   31   56:aload_0         
	//   32   57:invokevirtual   #318 <Method void InputStream.close()>
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
	//   47   83:invokevirtual   #315 <Method void BufferedInputStream.close()>
		if(inputstream != null)
	//*  48   86:aload_0         
	//*  49   87:ifnull          94
			inputstream.close();
	//   50   90:aload_0         
	//   51   91:invokevirtual   #318 <Method void InputStream.close()>
		throw exception;
	//   52   94:aload           4
	//   53   96:athrow          
	}

	public static void deleteDirectory(File file)
	{
		if(!file.exists())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #326 <Method boolean File.exists()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(file.isDirectory())
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #329 <Method boolean File.isDirectory()>
	//*   6   12:ifeq            47
		{
			File afile[] = file.listFiles();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #333 <Method File[] File.listFiles()>
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
	//   23   37:invokestatic    #335 <Method void deleteDirectory(File)>

	//   24   40:iload_1         
	//   25   41:iconst_1        
	//   26   42:iadd            
	//   27   43:istore_1        
			}
		}
	//*  28   44:goto            29
		file.delete();
	//   29   47:aload_0         
	//   30   48:invokevirtual   #338 <Method boolean File.delete()>
	//   31   51:pop             
	//   32   52:return          
	}

	public static void disconnectQuietly(URLConnection urlconnection)
	{
		if(urlconnection != null && (urlconnection instanceof HttpURLConnection))
	//*   0    0:aload_0         
	//*   1    1:ifnull          18
	//*   2    4:aload_0         
	//*   3    5:instanceof      #342 <Class HttpURLConnection>
	//*   4    8:ifeq            18
			((HttpURLConnection)urlconnection).disconnect();
	//    5   11:aload_0         
	//    6   12:checkcast       #342 <Class HttpURLConnection>
	//    7   15:invokevirtual   #345 <Method void HttpURLConnection.disconnect()>
	//    8   18:return          
	}

	private static boolean externalStorageExists()
	{
		return "mounted".equals(((Object) (Environment.getExternalStorageState())));
	//    0    0:ldc2            #348 <String "mounted">
	//    1    3:invokestatic    #353 <Method String Environment.getExternalStorageState()>
	//    2    6:invokevirtual   #354 <Method boolean String.equals(Object)>
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
	//    4    6:new             #83  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #93  <Method void ArrayList()>
	//    7   13:astore_2        
		list = ((List) (list.iterator()));
	//    8   14:aload_0         
	//    9   15:invokeinterface #359 <Method Iterator List.iterator()>
	//   10   20:astore_0        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//   11   21:aload_0         
	//   12   22:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//   13   27:ifeq            58
			Object obj = ((Iterator) (list)).next();
	//   14   30:aload_0         
	//   15   31:invokeinterface #158 <Method Object Iterator.next()>
	//   16   36:astore_3        
			if(predicate.apply(obj))
	//*  17   37:aload_1         
	//*  18   38:aload_3         
	//*  19   39:invokeinterface #362 <Method boolean Utility$Predicate.apply(Object)>
	//*  20   44:ifeq            21
				((List) (arraylist)).add(obj);
	//   21   47:aload_2         
	//   22   48:aload_3         
	//   23   49:invokeinterface #363 <Method boolean List.add(Object)>
	//   24   54:pop             
		} while(true);
	//   25   55:goto            21
		if(((List) (arraylist)).size() == 0)
	//*  26   58:aload_2         
	//*  27   59:invokeinterface #366 <Method int List.size()>
	//*  28   64:ifne            69
			return null;
	//   29   67:aconst_null     
	//   30   68:areturn         
		else
			return ((List) (arraylist));
	//   31   69:aload_2         
	//   32   70:areturn         
	}

	public static String generateRandomString(int i)
	{
		return (new BigInteger(i * 5, new Random())).toString(32);
	//    0    0:new             #370 <Class BigInteger>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:iconst_5        
	//    4    6:imul            
	//    5    7:new             #372 <Class Random>
	//    6   10:dup             
	//    7   11:invokespecial   #373 <Method void Random()>
	//    8   14:invokespecial   #376 <Method void BigInteger(int, Random)>
	//    9   17:bipush          32
	//   10   19:invokevirtual   #378 <Method String BigInteger.toString(int)>
	//   11   22:areturn         
	}

	public static String getActivityName(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return "null";
	//    2    4:ldc2            #382 <String "null">
	//    3    7:areturn         
		if(context == context.getApplicationContext())
	//*   4    8:aload_0         
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #388 <Method Context Context.getApplicationContext()>
	//*   7   13:if_acmpne       20
			return "unknown";
	//    8   16:ldc2            #390 <String "unknown">
	//    9   19:areturn         
		else
			return ((Object) (context)).getClass().getSimpleName();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #394 <Method Class Object.getClass()>
	//   12   24:invokevirtual   #399 <Method String Class.getSimpleName()>
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
	//    6    8:invokevirtual   #164 <Method Object Bundle.get(String)>
	//    7   11:astore_0        
			long l;
			if(bundle instanceof Long)
	//*   8   12:aload_0         
	//*   9   13:instanceof      #405 <Class Long>
	//*  10   16:ifeq            30
			{
				l = ((Long)bundle).longValue();
	//   11   19:aload_0         
	//   12   20:checkcast       #405 <Class Long>
	//   13   23:invokevirtual   #409 <Method long Long.longValue()>
	//   14   26:lstore_3        
			} else
	//*  15   27:goto            45
			{
				if(!(bundle instanceof String))
					break label0;
	//   16   30:aload_0         
	//   17   31:instanceof      #160 <Class String>
	//   18   34:ifeq            80
				try
				{
					l = Long.parseLong((String)bundle);
	//   19   37:aload_0         
	//   20   38:checkcast       #160 <Class String>
	//   21   41:invokestatic    #413 <Method long Long.parseLong(String)>
	//   22   44:lstore_3        
				}
	//*  23   45:lload_3         
	//*  24   46:lconst_0        
	//*  25   47:lcmp            
	//*  26   48:ifne            62
	//*  27   51:new             #415 <Class Date>
	//*  28   54:dup             
	//*  29   55:ldc2w           #416 <Long 0xffffffffL>
	//*  30   58:invokespecial   #420 <Method void Date(long)>
	//*  31   61:areturn         
	//*  32   62:new             #415 <Class Date>
	//*  33   65:dup             
	//*  34   66:aload_2         
	//*  35   67:invokevirtual   #423 <Method long Date.getTime()>
	//*  36   70:lload_3         
	//*  37   71:ldc2w           #424 <Long 1000L>
	//*  38   74:lmul            
	//*  39   75:ladd            
	//*  40   76:invokespecial   #420 <Method void Date(long)>
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
	//    2    3:invokestatic    #430 <Method Context FacebookSdk.getApplicationContext()>
	//    3    6:invokevirtual   #434 <Method ContentResolver Context.getContentResolver()>
	//    4    9:aload_0         
	//    5   10:aconst_null     
	//    6   11:aconst_null     
	//    7   12:aconst_null     
	//    8   13:aconst_null     
	//    9   14:invokevirtual   #440 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   10   17:astore_0        
		uri1 = uri;
	//   11   18:aload_0         
	//   12   19:astore          4
		int i = ((Cursor) (uri)).getColumnIndex("_size");
	//   13   21:aload_0         
	//   14   22:ldc2            #442 <String "_size">
	//   15   25:invokeinterface #448 <Method int Cursor.getColumnIndex(String)>
	//   16   30:istore_1        
		uri1 = uri;
	//   17   31:aload_0         
	//   18   32:astore          4
		((Cursor) (uri)).moveToFirst();
	//   19   34:aload_0         
	//   20   35:invokeinterface #451 <Method boolean Cursor.moveToFirst()>
	//   21   40:pop             
		uri1 = uri;
	//   22   41:aload_0         
	//   23   42:astore          4
		long l = ((Cursor) (uri)).getLong(i);
	//   24   44:aload_0         
	//   25   45:iload_1         
	//   26   46:invokeinterface #455 <Method long Cursor.getLong(int)>
	//   27   51:lstore_2        
		if(uri != null)
	//*  28   52:aload_0         
	//*  29   53:ifnull          62
			((Cursor) (uri)).close();
	//   30   56:aload_0         
	//   31   57:invokeinterface #456 <Method void Cursor.close()>
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
	//   38   72:invokeinterface #456 <Method void Cursor.close()>
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
	//    0    0:invokestatic    #430 <Method Context FacebookSdk.getApplicationContext()>
	//    1    3:invokevirtual   #464 <Method Resources Context.getResources()>
	//    2    6:invokevirtual   #470 <Method Configuration Resources.getConfiguration()>
	//    3    9:getfield        #476 <Field Locale Configuration.locale>
	//    4   12:astore_0        
		}
	//*   5   13:aload_0         
	//*   6   14:areturn         
	//*   7   15:invokestatic    #481 <Method Locale Locale.getDefault()>
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
	//    0    0:new             #138 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #482 <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putString("fields", "id,name,first_name,middle_name,last_name,link");
	//    4    8:aload_1         
	//    5    9:ldc2            #484 <String "fields">
	//    6   12:ldc2            #486 <String "id,name,first_name,middle_name,last_name,link">
	//    7   15:invokevirtual   #489 <Method void Bundle.putString(String, String)>
		bundle.putString("access_token", s);
	//    8   18:aload_1         
	//    9   19:ldc2            #491 <String "access_token">
	//   10   22:aload_0         
	//   11   23:invokevirtual   #489 <Method void Bundle.putString(String, String)>
		return new GraphRequest(((AccessToken) (null)), "me", bundle, HttpMethod.GET, ((com.facebook.GraphRequest.Callback) (null)));
	//   12   26:new             #107 <Class GraphRequest>
	//   13   29:dup             
	//   14   30:aconst_null     
	//   15   31:ldc2            #493 <String "me">
	//   16   34:aload_1         
	//   17   35:getstatic       #499 <Field HttpMethod HttpMethod.GET>
	//   18   38:aconst_null     
	//   19   39:invokespecial   #502 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, com.facebook.GraphRequest$Callback)>
	//   20   42:areturn         
	}

	public static void getGraphMeRequestWithCacheAsync(String s, GraphMeRequestWithCacheCallback graphmerequestwithcachecallback)
	{
		JSONObject jsonobject = ProfileInformationCache.getProfileInformation(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #101 <Method JSONObject ProfileInformationCache.getProfileInformation(String)>
	//    2    4:astore_2        
		if(jsonobject != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
		{
			graphmerequestwithcachecallback.onSuccess(jsonobject);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokeinterface #508 <Method void Utility$GraphMeRequestWithCacheCallback.onSuccess(JSONObject)>
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
	//   13   23:invokespecial   #511 <Method void Utility$1(Utility$GraphMeRequestWithCacheCallback, String)>
	//   14   26:astore_1        
			s = ((String) (getGraphMeRequestWithCache(s)));
	//   15   27:aload_0         
	//   16   28:invokestatic    #105 <Method GraphRequest getGraphMeRequestWithCache(String)>
	//   17   31:astore_0        
			((GraphRequest) (s)).setCallback(((com.facebook.GraphRequest.Callback) (graphmerequestwithcachecallback)));
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #515 <Method void GraphRequest.setCallback(com.facebook.GraphRequest$Callback)>
			((GraphRequest) (s)).executeAsync();
	//   21   37:aload_0         
	//   22   38:invokevirtual   #519 <Method com.facebook.GraphRequestAsyncTask GraphRequest.executeAsync()>
	//   23   41:pop             
			return;
	//   24   42:return          
		}
	}

	public static String getMetadataApplicationId(Context context)
	{
		Validate.notNull(((Object) (context)), "context");
	//    0    0:aload_0         
	//    1    1:ldc2            #522 <String "context">
	//    2    4:invokestatic    #528 <Method void Validate.notNull(Object, String)>
		FacebookSdk.sdkInitialize(context);
	//    3    7:aload_0         
	//    4    8:invokestatic    #531 <Method void FacebookSdk.sdkInitialize(Context)>
		return FacebookSdk.getApplicationId();
	//    5   11:invokestatic    #534 <Method String FacebookSdk.getApplicationId()>
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
	//    3    3:invokevirtual   #542 <Method Method Class.getMethod(String, Class[])>
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
	//    1    1:invokestatic    #550 <Method Class Class.forName(String)>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #552 <Method Method getMethodQuietly(Class, String, Class[])>
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
	//    2    2:invokevirtual   #558 <Method Object JSONObject.opt(String)>
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
	//*  11   15:instanceof      #160 <Class String>
	//*  12   18:ifeq            36
				jsonobject = ((JSONObject) ((new JSONTokener((String)s)).nextValue()));
	//   13   21:new             #560 <Class JSONTokener>
	//   14   24:dup             
	//   15   25:aload_1         
	//   16   26:checkcast       #160 <Class String>
	//   17   29:invokespecial   #563 <Method void JSONTokener(String)>
	//   18   32:invokevirtual   #566 <Method Object JSONTokener.nextValue()>
	//   19   35:astore_0        
		}
		if(jsonobject != null && !(jsonobject instanceof JSONObject) && !(jsonobject instanceof JSONArray))
	//*  20   36:aload_0         
	//*  21   37:ifnull          86
	//*  22   40:aload_0         
	//*  23   41:instanceof      #275 <Class JSONObject>
	//*  24   44:ifne            86
	//*  25   47:aload_0         
	//*  26   48:instanceof      #281 <Class JSONArray>
	//*  27   51:ifne            86
		{
			if(s1 != null)
	//*  28   54:aload_2         
	//*  29   55:ifnull          75
			{
				s = ((String) (new JSONObject()));
	//   30   58:new             #275 <Class JSONObject>
	//   31   61:dup             
	//   32   62:invokespecial   #567 <Method void JSONObject()>
	//   33   65:astore_1        
				((JSONObject) (s)).putOpt(s1, ((Object) (jsonobject)));
	//   34   66:aload_1         
	//   35   67:aload_2         
	//   36   68:aload_0         
	//   37   69:invokevirtual   #571 <Method JSONObject JSONObject.putOpt(String, Object)>
	//   38   72:pop             
				return ((Object) (s));
	//   39   73:aload_1         
	//   40   74:areturn         
			} else
			{
				throw new FacebookException("Got an unexpected non-JSON object.");
	//   41   75:new             #573 <Class FacebookException>
	//   42   78:dup             
	//   43   79:ldc2            #575 <String "Got an unexpected non-JSON object.">
	//   44   82:invokespecial   #576 <Method void FacebookException(String)>
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
	//    5    7:invokevirtual   #581 <Method String Uri.toString()>
	//    6   10:areturn         
	}

	public static PermissionsPair handlePermissionResponse(JSONObject jsonobject)
		throws JSONException
	{
		jsonobject = ((JSONObject) (jsonobject.getJSONObject("permissions").getJSONArray("data")));
	//    0    0:aload_0         
	//    1    1:ldc2            #585 <String "permissions">
	//    2    4:invokevirtual   #587 <Method JSONObject JSONObject.getJSONObject(String)>
	//    3    7:ldc2            #589 <String "data">
	//    4   10:invokevirtual   #593 <Method JSONArray JSONObject.getJSONArray(String)>
	//    5   13:astore_0        
		ArrayList arraylist = new ArrayList(((JSONArray) (jsonobject)).length());
	//    6   14:new             #83  <Class ArrayList>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:invokevirtual   #285 <Method int JSONArray.length()>
	//   10   22:invokespecial   #86  <Method void ArrayList(int)>
	//   11   25:astore_2        
		ArrayList arraylist1 = new ArrayList(((JSONArray) (jsonobject)).length());
	//   12   26:new             #83  <Class ArrayList>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:invokevirtual   #285 <Method int JSONArray.length()>
	//   16   34:invokespecial   #86  <Method void ArrayList(int)>
	//   17   37:astore_3        
		for(int i = 0; i < ((JSONArray) (jsonobject)).length(); i++)
	//*  18   38:iconst_0        
	//*  19   39:istore_1        
	//*  20   40:iload_1         
	//*  21   41:aload_0         
	//*  22   42:invokevirtual   #285 <Method int JSONArray.length()>
	//*  23   45:icmpge          152
		{
			Object obj = ((Object) (((JSONArray) (jsonobject)).optJSONObject(i)));
	//   24   48:aload_0         
	//   25   49:iload_1         
	//   26   50:invokevirtual   #597 <Method JSONObject JSONArray.optJSONObject(int)>
	//   27   53:astore          5
			String s = ((JSONObject) (obj)).optString("permission");
	//   28   55:aload           5
	//   29   57:ldc2            #599 <String "permission">
	//   30   60:invokevirtual   #602 <Method String JSONObject.optString(String)>
	//   31   63:astore          4
			if(s == null || s.equals("installed"))
	//*  32   65:aload           4
	//*  33   67:ifnull          145
	//*  34   70:aload           4
	//*  35   72:ldc2            #604 <String "installed">
	//*  36   75:invokevirtual   #354 <Method boolean String.equals(Object)>
	//*  37   78:ifeq            84
				continue;
	//   38   81:goto            145
			obj = ((Object) (((JSONObject) (obj)).optString("status")));
	//   39   84:aload           5
	//   40   86:ldc2            #606 <String "status">
	//   41   89:invokevirtual   #602 <Method String JSONObject.optString(String)>
	//   42   92:astore          5
			if(obj == null)
	//*  43   94:aload           5
	//*  44   96:ifnonnull       102
				continue;
	//   45   99:goto            145
			if(((String) (obj)).equals("granted"))
	//*  46  102:aload           5
	//*  47  104:ldc2            #608 <String "granted">
	//*  48  107:invokevirtual   #354 <Method boolean String.equals(Object)>
	//*  49  110:ifeq            125
			{
				((List) (arraylist)).add(((Object) (s)));
	//   50  113:aload_2         
	//   51  114:aload           4
	//   52  116:invokeinterface #363 <Method boolean List.add(Object)>
	//   53  121:pop             
				continue;
	//   54  122:goto            145
			}
			if(((String) (obj)).equals("declined"))
	//*  55  125:aload           5
	//*  56  127:ldc2            #610 <String "declined">
	//*  57  130:invokevirtual   #354 <Method boolean String.equals(Object)>
	//*  58  133:ifeq            145
				((List) (arraylist1)).add(((Object) (s)));
	//   59  136:aload_3         
	//   60  137:aload           4
	//   61  139:invokeinterface #363 <Method boolean List.add(Object)>
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
	//   72  158:invokespecial   #613 <Method void Utility$PermissionsPair(List, List)>
	//   73  161:areturn         
	}

	public static boolean hasSameId(JSONObject jsonobject, JSONObject jsonobject1)
	{
		if(jsonobject != null && jsonobject1 != null && jsonobject.has("id"))
	//*   0    0:aload_0         
	//*   1    1:ifnull          74
	//*   2    4:aload_1         
	//*   3    5:ifnull          74
	//*   4    8:aload_0         
	//*   5    9:ldc2            #617 <String "id">
	//*   6   12:invokevirtual   #620 <Method boolean JSONObject.has(String)>
	//*   7   15:ifeq            74
		{
			if(!jsonobject1.has("id"))
	//*   8   18:aload_1         
	//*   9   19:ldc2            #617 <String "id">
	//*  10   22:invokevirtual   #620 <Method boolean JSONObject.has(String)>
	//*  11   25:ifne            30
				return false;
	//   12   28:iconst_0        
	//   13   29:ireturn         
			if(((Object) (jsonobject)).equals(((Object) (jsonobject1))))
	//*  14   30:aload_0         
	//*  15   31:aload_1         
	//*  16   32:invokevirtual   #77  <Method boolean Object.equals(Object)>
	//*  17   35:ifeq            40
				return true;
	//   18   38:iconst_1        
	//   19   39:ireturn         
			jsonobject = ((JSONObject) (jsonobject.optString("id")));
	//   20   40:aload_0         
	//   21   41:ldc2            #617 <String "id">
	//   22   44:invokevirtual   #602 <Method String JSONObject.optString(String)>
	//   23   47:astore_0        
			jsonobject1 = ((JSONObject) (jsonobject1.optString("id")));
	//   24   48:aload_1         
	//   25   49:ldc2            #617 <String "id">
	//   26   52:invokevirtual   #602 <Method String JSONObject.optString(String)>
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
	//   36   68:invokevirtual   #354 <Method boolean String.equals(Object)>
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
	//    2    2:invokevirtual   #628 <Method void MessageDigest.update(byte[])>
		messagedigest = ((MessageDigest) (messagedigest.digest()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #632 <Method byte[] MessageDigest.digest()>
	//    5    9:astore_0        
		abyte0 = ((byte []) (new StringBuilder()));
	//    6   10:new             #210 <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #211 <Method void StringBuilder()>
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
	//   28   41:invokestatic    #637 <Method String Integer.toHexString(int)>
	//   29   44:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   30   47:pop             
			((StringBuilder) (abyte0)).append(Integer.toHexString(byte0 >> 0 & 0xf));
	//   31   48:aload_1         
	//   32   49:iload           4
	//   33   51:iconst_0        
	//   34   52:ishr            
	//   35   53:bipush          15
	//   36   55:iand            
	//   37   56:invokestatic    #637 <Method String Integer.toHexString(int)>
	//   38   59:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   39   62:pop             
		}

	//   40   63:iload_2         
	//   41   64:iconst_1        
	//   42   65:iadd            
	//   43   66:istore_2        
	//*  44   67:goto            23
		return ((StringBuilder) (abyte0)).toString();
	//   45   70:aload_1         
	//   46   71:invokevirtual   #224 <Method String StringBuilder.toString()>
	//   47   74:areturn         
	}

	public static transient HashSet hashSet(Object aobj[])
	{
		HashSet hashset = new HashSet(aobj.length);
	//    0    0:new             #641 <Class HashSet>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:arraylength     
	//    4    6:invokespecial   #642 <Method void HashSet(int)>
	//    5    9:astore_3        
		int j = aobj.length;
	//    6   10:aload_0         
	//    7   11:arraylength     
	//    8   12:istore_2        
		for(int i = 0; i < j; i++)
	//*   9   13:iconst_0        
	//*  10   14:istore_1        
	//*  11   15:iload_1         
	//*  12   16:iload_2         
	//*  13   17:icmpge          35
			hashset.add(aobj[i]);
	//   14   20:aload_3         
	//   15   21:aload_0         
	//   16   22:iload_1         
	//   17   23:aaload          
	//   18   24:invokevirtual   #643 <Method boolean HashSet.add(Object)>
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
	//    2    2:invokevirtual   #648 <Method byte[] String.getBytes()>
	//    3    5:invokestatic    #651 <Method String hashWithAlgorithm(String, byte[])>
	//    4    8:areturn         
	}

	private static String hashWithAlgorithm(String s, byte abyte0[])
	{
		try
		{
			s = ((String) (MessageDigest.getInstance(s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #656 <Method MessageDigest MessageDigest.getInstance(String)>
	//    2    4:astore_0        
		}
	//*   3    5:aload_0         
	//*   4    6:aload_1         
	//*   5    7:invokestatic    #658 <Method String hashBytes(MessageDigest, byte[])>
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
		int i;
		int ai2[];
label0:
		{
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
			ai2 = new int[ai.length + ai1.length];
	//    8   12:aload_0         
	//    9   13:arraylength     
	//   10   14:aload_1         
	//   11   15:arraylength     
	//   12   16:iadd            
	//   13   17:newarray        int[]
	//   14   19:astore          10
			int j1 = 0;
	//   15   21:iconst_0        
	//   16   22:istore          7
			int k1 = 0;
	//   17   24:iconst_0        
	//   18   25:istore          8
			int i1 = k1;
	//   19   27:iload           8
	//   20   29:istore          6
			do
			{
				int j;
				int k;
				int l;
				do
				{
					i = i1;
	//   21   31:iload           6
	//   22   33:istore_2        
					if(j1 >= ai.length)
						break label0;
	//   23   34:iload           7
	//   24   36:aload_0         
	//   25   37:arraylength     
	//   26   38:icmpge          315
					i = i1;
	//   27   41:iload           6
	//   28   43:istore_2        
					if(k1 >= ai1.length)
						break label0;
	//   29   44:iload           8
	//   30   46:aload_1         
	//   31   47:arraylength     
	//   32   48:icmpge          315
					int l1 = ai[j1];
	//   33   51:aload_0         
	//   34   52:iload           7
	//   35   54:iaload          
	//   36   55:istore          9
					k = ai1[k1];
	//   37   57:aload_1         
	//   38   58:iload           8
	//   39   60:iaload          
	//   40   61:istore          4
					if(j1 < ai.length - 1)
	//*  41   63:iload           7
	//*  42   65:aload_0         
	//*  43   66:arraylength     
	//*  44   67:iconst_1        
	//*  45   68:isub            
	//*  46   69:icmpge          82
						j = ai[j1 + 1];
	//   47   72:aload_0         
	//   48   73:iload           7
	//   49   75:iconst_1        
	//   50   76:iadd            
	//   51   77:iaload          
	//   52   78:istore_3        
					else
	//*  53   79:goto            86
						j = 0x7fffffff;
	//   54   82:ldc2            #661 <Int 0x7fffffff>
	//   55   85:istore_3        
					if(k1 < ai1.length - 1)
	//*  56   86:iload           8
	//*  57   88:aload_1         
	//*  58   89:arraylength     
	//*  59   90:iconst_1        
	//*  60   91:isub            
	//*  61   92:icmpge          105
						i = ai1[k1 + 1];
	//   62   95:aload_1         
	//   63   96:iload           8
	//   64   98:iconst_1        
	//   65   99:iadd            
	//   66  100:iaload          
	//   67  101:istore_2        
					else
	//*  68  102:goto            109
						i = 0x7fffffff;
	//   69  105:ldc2            #661 <Int 0x7fffffff>
	//   70  108:istore_2        
					if(l1 < k)
	//*  71  109:iload           9
	//*  72  111:iload           4
	//*  73  113:icmpge          192
					{
						if(j > k)
	//*  74  116:iload_3         
	//*  75  117:iload           4
	//*  76  119:icmple          171
						{
							if(j > i)
	//*  77  122:iload_3         
	//*  78  123:iload_2         
	//*  79  124:icmple          151
							{
								l = k1 + 2;
	//   80  127:iload           8
	//   81  129:iconst_2        
	//   82  130:iadd            
	//   83  131:istore          5
								j = k;
	//   84  133:iload           4
	//   85  135:istore_3        
								k1 = i;
	//   86  136:iload_2         
	//   87  137:istore          8
								k = j1;
	//   88  139:iload           7
	//   89  141:istore          4
								i = j;
	//   90  143:iload_3         
	//   91  144:istore_2        
								j = k1;
	//   92  145:iload           8
	//   93  147:istore_3        
							} else
	//*  94  148:goto            255
							{
								l = j1 + 2;
	//   95  151:iload           7
	//   96  153:iconst_2        
	//   97  154:iadd            
	//   98  155:istore          5
								i = k;
	//   99  157:iload           4
	//  100  159:istore_2        
								k = l;
	//  101  160:iload           5
	//  102  162:istore          4
								l = k1;
	//  103  164:iload           8
	//  104  166:istore          5
							}
						} else
	//* 105  168:goto            255
						{
							k = j1 + 2;
	//  106  171:iload           7
	//  107  173:iconst_2        
	//  108  174:iadd            
	//  109  175:istore          4
							j = 0x7fffffff;
	//  110  177:ldc2            #661 <Int 0x7fffffff>
	//  111  180:istore_3        
							i = 0x80000000;
	//  112  181:ldc2            #662 <Int 0x80000000>
	//  113  184:istore_2        
							l = k1;
	//  114  185:iload           8
	//  115  187:istore          5
						}
					} else
	//* 116  189:goto            255
					if(i > l1)
	//* 117  192:iload_2         
	//* 118  193:iload           9
	//* 119  195:icmple          237
					{
						if(i > j)
	//* 120  198:iload_2         
	//* 121  199:iload_3         
	//* 122  200:icmple          219
						{
							k = j1 + 2;
	//  123  203:iload           7
	//  124  205:iconst_2        
	//  125  206:iadd            
	//  126  207:istore          4
							l = k1;
	//  127  209:iload           8
	//  128  211:istore          5
							i = l1;
	//  129  213:iload           9
	//  130  215:istore_2        
						} else
	//* 131  216:goto            255
						{
							l = k1 + 2;
	//  132  219:iload           8
	//  133  221:iconst_2        
	//  134  222:iadd            
	//  135  223:istore          5
							j = i;
	//  136  225:iload_2         
	//  137  226:istore_3        
							k = j1;
	//  138  227:iload           7
	//  139  229:istore          4
							i = l1;
	//  140  231:iload           9
	//  141  233:istore_2        
						}
					} else
	//* 142  234:goto            255
					{
						l = k1 + 2;
	//  143  237:iload           8
	//  144  239:iconst_2        
	//  145  240:iadd            
	//  146  241:istore          5
						j = 0x7fffffff;
	//  147  243:ldc2            #661 <Int 0x7fffffff>
	//  148  246:istore_3        
						i = 0x80000000;
	//  149  247:ldc2            #662 <Int 0x80000000>
	//  150  250:istore_2        
						k = j1;
	//  151  251:iload           7
	//  152  253:istore          4
					}
					j1 = k;
	//  153  255:iload           4
	//  154  257:istore          7
					k1 = l;
	//  155  259:iload           5
	//  156  261:istore          8
				} while(i == 0x80000000);
	//  157  263:iload_2         
	//  158  264:ldc2            #662 <Int 0x80000000>
	//  159  267:icmpeq          31
				j1 = i1 + 1;
	//  160  270:iload           6
	//  161  272:iconst_1        
	//  162  273:iadd            
	//  163  274:istore          7
				ai2[i1] = i;
	//  164  276:aload           10
	//  165  278:iload           6
	//  166  280:iload_2         
	//  167  281:iastore         
				if(j == 0x7fffffff)
					break;
	//  168  282:iload_3         
	//  169  283:ldc2            #661 <Int 0x7fffffff>
	//  170  286:icmpeq          312
				i1 = j1 + 1;
	//  171  289:iload           7
	//  172  291:iconst_1        
	//  173  292:iadd            
	//  174  293:istore          6
				ai2[j1] = j;
	//  175  295:aload           10
	//  176  297:iload           7
	//  177  299:iload_3         
	//  178  300:iastore         
				j1 = k;
	//  179  301:iload           4
	//  180  303:istore          7
				k1 = l;
	//  181  305:iload           5
	//  182  307:istore          8
			} while(true);
	//  183  309:goto            31
			i = j1;
	//  184  312:iload           7
	//  185  314:istore_2        
		}
		return Arrays.copyOf(ai2, i);
	//  186  315:aload           10
	//  187  317:iload_2         
	//  188  318:invokestatic    #668 <Method int[] Arrays.copyOf(int[], int)>
	//  189  321:areturn         
	}

	public static transient Object invokeMethodQuietly(Object obj, Method method, Object aobj[])
	{
		try
		{
			obj = method.invoke(obj, aobj);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #680 <Method Object Method.invoke(Object, Object[])>
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
	//    0    0:getstatic       #687 <Field int android.os.Build$VERSION.SDK_INT>
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
	//   10   15:ldc2            #689 <Class AutofillManager>
	//   11   18:invokevirtual   #693 <Method Object Context.getSystemService(Class)>
	//   12   21:checkcast       #689 <Class AutofillManager>
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
	//*  21   34:invokevirtual   #696 <Method boolean AutofillManager.isAutofillSupported()>
	//*  22   37:ifeq            51
			{
				flag = flag1;
	//   23   40:iload_3         
	//   24   41:istore_2        
				if(((AutofillManager) (context)).isEnabled())
	//*  25   42:aload_0         
	//*  26   43:invokevirtual   #699 <Method boolean AutofillManager.isEnabled()>
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
	//*   0    0:getstatic       #687 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          27
	//*   2    5:icmplt          19
			return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
	//    3    8:aload_0         
	//    4    9:invokevirtual   #704 <Method PackageManager Context.getPackageManager()>
	//    5   12:ldc2            #706 <String "android.hardware.type.pc">
	//    6   15:invokevirtual   #711 <Method boolean PackageManager.hasSystemFeature(String)>
	//    7   18:ireturn         
		return Build.DEVICE != null && Build.DEVICE.matches(".+_cheets|cheets_.+");
	//    8   19:getstatic       #716 <Field String Build.DEVICE>
	//    9   22:ifnull          38
	//   10   25:getstatic       #716 <Field String Build.DEVICE>
	//   11   28:ldc1            #24  <String ".+_cheets|cheets_.+">
	//   12   30:invokevirtual   #719 <Method boolean String.matches(String)>
	//   13   33:ifeq            38
	//   14   36:iconst_1        
	//   15   37:ireturn         
	//   16   38:iconst_0        
	//   17   39:ireturn         
	}

	public static boolean isContentUri(Uri uri)
	{
		return uri != null && "content".equalsIgnoreCase(uri.getScheme());
	//    0    0:aload_0         
	//    1    1:ifnull          19
	//    2    4:ldc2            #723 <String "content">
	//    3    7:aload_0         
	//    4    8:invokevirtual   #726 <Method String Uri.getScheme()>
	//    5   11:invokevirtual   #729 <Method boolean String.equalsIgnoreCase(String)>
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
	//    3    5:invokestatic    #737 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//    4    8:invokevirtual   #738 <Method boolean AccessToken.equals(Object)>
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
	//    2    4:ldc2            #741 <String "file">
	//    3    7:aload_0         
	//    4    8:invokevirtual   #726 <Method String Uri.getScheme()>
	//    5   11:invokevirtual   #729 <Method boolean String.equalsIgnoreCase(String)>
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
	//    3    5:invokevirtual   #742 <Method int String.length()>
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
	//    3    5:invokeinterface #746 <Method int Collection.size()>
	//    4   10:ifne            16
	//    5   13:goto            18
	//    6   16:iconst_0        
	//    7   17:ireturn         
	//    8   18:iconst_1        
	//    9   19:ireturn         
	}

	public static boolean isSubset(Collection collection, Collection collection1)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(collection1 != null && collection1.size() != 0)
	//*   2    2:aload_1         
	//*   3    3:ifnull          60
	//*   4    6:aload_1         
	//*   5    7:invokeinterface #746 <Method int Collection.size()>
	//*   6   12:ifne            18
	//*   7   15:goto            60
		{
			collection1 = ((Collection) (new HashSet(collection1)));
	//    8   18:new             #641 <Class HashSet>
	//    9   21:dup             
	//   10   22:aload_1         
	//   11   23:invokespecial   #752 <Method void HashSet(Collection)>
	//   12   26:astore_1        
			for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext();)
	//*  13   27:aload_0         
	//*  14   28:invokeinterface #753 <Method Iterator Collection.iterator()>
	//*  15   33:astore_0        
	//*  16   34:aload_0         
	//*  17   35:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//*  18   40:ifeq            58
				if(!((HashSet) (collection1)).contains(((Iterator) (collection)).next()))
	//*  19   43:aload_1         
	//*  20   44:aload_0         
	//*  21   45:invokeinterface #158 <Method Object Iterator.next()>
	//*  22   50:invokevirtual   #756 <Method boolean HashSet.contains(Object)>
	//*  23   53:ifne            34
					return false;
	//   24   56:iconst_0        
	//   25   57:ireturn         

			return true;
	//   26   58:iconst_1        
	//   27   59:ireturn         
		} else
		{
			if(collection == null || collection.size() == 0)
	//*  28   60:aload_0         
	//*  29   61:ifnull          73
	//*  30   64:aload_0         
	//*  31   65:invokeinterface #746 <Method int Collection.size()>
	//*  32   70:ifne            75
				flag = true;
	//   33   73:iconst_1        
	//   34   74:istore_2        
			return flag;
	//   35   75:iload_2         
	//   36   76:ireturn         
		}
	}

	public static boolean isWebUri(Uri uri)
	{
		return uri != null && ("http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme()));
	//    0    0:aload_0         
	//    1    1:ifnull          44
	//    2    4:ldc2            #760 <String "http">
	//    3    7:aload_0         
	//    4    8:invokevirtual   #726 <Method String Uri.getScheme()>
	//    5   11:invokevirtual   #729 <Method boolean String.equalsIgnoreCase(String)>
	//    6   14:ifne            42
	//    7   17:ldc1            #46  <String "https">
	//    8   19:aload_0         
	//    9   20:invokevirtual   #726 <Method String Uri.getScheme()>
	//   10   23:invokevirtual   #729 <Method boolean String.equalsIgnoreCase(String)>
	//   11   26:ifne            42
	//   12   29:ldc2            #762 <String "fbstaging">
	//   13   32:aload_0         
	//   14   33:invokevirtual   #726 <Method String Uri.getScheme()>
	//   15   36:invokevirtual   #729 <Method boolean String.equalsIgnoreCase(String)>
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
	//    0    0:new             #641 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #765 <Method void HashSet()>
	//    3    7:astore_2        
		for(int i = 0; i < jsonarray.length(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #285 <Method int JSONArray.length()>
	//*   9   15:icmpge          37
			((Set) (hashset)).add(((Object) (jsonarray.getString(i))));
	//   10   18:aload_2         
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #289 <Method String JSONArray.getString(int)>
	//   14   24:invokeinterface #766 <Method boolean Set.add(Object)>
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
	//    0    0:new             #83  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void ArrayList()>
	//    3    7:astore_2        
		for(int i = 0; i < jsonarray.length(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #285 <Method int JSONArray.length()>
	//*   9   15:icmpge          35
			arraylist.add(((Object) (jsonarray.getString(i))));
	//   10   18:aload_2         
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #289 <Method String JSONArray.getString(int)>
	//   14   24:invokevirtual   #89  <Method boolean ArrayList.add(Object)>
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
	//*   0    0:invokestatic    #775 <Method boolean FacebookSdk.isDebugEnabled()>
	//*   1    3:ifeq            60
	//*   2    6:aload_0         
	//*   3    7:ifnull          60
	//*   4   10:aload_1         
	//*   5   11:ifnull          60
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   14:new             #210 <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #211 <Method void StringBuilder()>
	//    9   21:astore_2        
			stringbuilder.append(((Object) (exception)).getClass().getSimpleName());
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #394 <Method Class Object.getClass()>
	//   13   27:invokevirtual   #399 <Method String Class.getSimpleName()>
	//   14   30:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:pop             
			stringbuilder.append(": ");
	//   16   34:aload_2         
	//   17   35:ldc2            #777 <String ": ">
	//   18   38:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   19   41:pop             
			stringbuilder.append(exception.getMessage());
	//   20   42:aload_2         
	//   21   43:aload_1         
	//   22   44:invokevirtual   #780 <Method String Exception.getMessage()>
	//   23   47:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   24   50:pop             
			Log.d(s, stringbuilder.toString());
	//   25   51:aload_0         
	//   26   52:aload_2         
	//   27   53:invokevirtual   #224 <Method String StringBuilder.toString()>
	//   28   56:invokestatic    #786 <Method int Log.d(String, String)>
	//   29   59:pop             
		}
	//   30   60:return          
	}

	public static void logd(String s, String s1)
	{
		if(FacebookSdk.isDebugEnabled() && s != null && s1 != null)
	//*   0    0:invokestatic    #775 <Method boolean FacebookSdk.isDebugEnabled()>
	//*   1    3:ifeq            20
	//*   2    6:aload_0         
	//*   3    7:ifnull          20
	//*   4   10:aload_1         
	//*   5   11:ifnull          20
			Log.d(s, s1);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokestatic    #786 <Method int Log.d(String, String)>
	//    9   19:pop             
	//   10   20:return          
	}

	public static void logd(String s, String s1, Throwable throwable)
	{
		if(FacebookSdk.isDebugEnabled() && !isNullOrEmpty(s))
	//*   0    0:invokestatic    #775 <Method boolean FacebookSdk.isDebugEnabled()>
	//*   1    3:ifeq            20
	//*   2    6:aload_0         
	//*   3    7:invokestatic    #257 <Method boolean isNullOrEmpty(String)>
	//*   4   10:ifne            20
			Log.d(s, s1, throwable);
	//    5   13:aload_0         
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:invokestatic    #790 <Method int Log.d(String, String, Throwable)>
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
	//    4    6:new             #83  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #93  <Method void ArrayList()>
	//    7   13:astore_2        
		list = ((List) (list.iterator()));
	//    8   14:aload_0         
	//    9   15:invokeinterface #359 <Method Iterator List.iterator()>
	//   10   20:astore_0        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//   11   21:aload_0         
	//   12   22:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//   13   27:ifeq            58
			Object obj = mapper.apply(((Iterator) (list)).next());
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:invokeinterface #158 <Method Object Iterator.next()>
	//   17   37:invokeinterface #795 <Method Object Utility$Mapper.apply(Object)>
	//   18   42:astore_3        
			if(obj != null)
	//*  19   43:aload_3         
	//*  20   44:ifnull          21
				((List) (arraylist)).add(obj);
	//   21   47:aload_2         
	//   22   48:aload_3         
	//   23   49:invokeinterface #363 <Method boolean List.add(Object)>
	//   24   54:pop             
		} while(true);
	//   25   55:goto            21
		if(((List) (arraylist)).size() == 0)
	//*  26   58:aload_2         
	//*  27   59:invokeinterface #366 <Method int List.size()>
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
	//    0    0:ldc1            #35  <String "MD5">
	//    1    2:aload_0         
	//    2    3:invokestatic    #799 <Method String hashWithAlgorithm(String, String)>
	//    3    6:areturn         
	}

	public static boolean mustFixWindowParamsForAutofill(Context context)
	{
		return isAutofillAvailable(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #802 <Method boolean isAutofillAvailable(Context)>
	//    2    4:ireturn         
	}

	public static Bundle parseUrlQueryString(String s)
	{
		int i;
		int j;
		Bundle bundle;
		bundle = new Bundle();
	//    0    0:new             #138 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #482 <Method void Bundle()>
	//    3    7:astore_3        
		if(isNullOrEmpty(s))
			break MISSING_BLOCK_LABEL_116;
	//    4    8:aload_0         
	//    5    9:invokestatic    #257 <Method boolean isNullOrEmpty(String)>
	//    6   12:ifne            116
		s = ((String) (s.split("&")));
	//    7   15:aload_0         
	//    8   16:ldc2            #808 <String "&">
	//    9   19:invokevirtual   #206 <Method String[] String.split(String)>
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
	//   18   30:icmpge          116
_L1:
		String as[] = ((String) (s[i])).split("=");
	//   19   33:aload_0         
	//   20   34:iload_1         
	//   21   35:aaload          
	//   22   36:ldc1            #208 <String "=">
	//   23   38:invokevirtual   #206 <Method String[] String.split(String)>
	//   24   41:astore          4
		if(as.length == 2)
	//*  25   43:aload           4
	//*  26   45:arraylength     
	//*  27   46:iconst_2        
	//*  28   47:icmpne          75
		{
			bundle.putString(URLDecoder.decode(as[0], "UTF-8"), URLDecoder.decode(as[1], "UTF-8"));
	//   29   50:aload_3         
	//   30   51:aload           4
	//   31   53:iconst_0        
	//   32   54:aaload          
	//   33   55:ldc1            #49  <String "UTF-8">
	//   34   57:invokestatic    #813 <Method String URLDecoder.decode(String, String)>
	//   35   60:aload           4
	//   36   62:iconst_1        
	//   37   63:aaload          
	//   38   64:ldc1            #49  <String "UTF-8">
	//   39   66:invokestatic    #813 <Method String URLDecoder.decode(String, String)>
	//   40   69:invokevirtual   #489 <Method void Bundle.putString(String, String)>
			continue; /* Loop/switch isn't completed */
	//   41   72:goto            109
		}
		try
		{
			if(as.length == 1)
	//*  42   75:aload           4
	//*  43   77:arraylength     
	//*  44   78:iconst_1        
	//*  45   79:icmpne          109
				bundle.putString(URLDecoder.decode(as[0], "UTF-8"), "");
	//   46   82:aload_3         
	//   47   83:aload           4
	//   48   85:iconst_0        
	//   49   86:aaload          
	//   50   87:ldc1            #49  <String "UTF-8">
	//   51   89:invokestatic    #813 <Method String URLDecoder.decode(String, String)>
	//   52   92:ldc1            #59  <String "">
	//   53   94:invokevirtual   #489 <Method void Bundle.putString(String, String)>
		}
	//*  54   97:goto            109
		catch(UnsupportedEncodingException unsupportedencodingexception)
	//*  55  100:astore          4
		{
			logd("FacebookSDK", ((Exception) (unsupportedencodingexception)));
	//   56  102:ldc1            #41  <String "FacebookSDK">
	//   57  104:aload           4
	//   58  106:invokestatic    #815 <Method void logd(String, Exception)>
		}
		i++;
	//   59  109:iload_1         
	//   60  110:iconst_1        
	//   61  111:iadd            
	//   62  112:istore_1        
		  goto _L3
	//*  63  113:goto            28
_L2:
		return bundle;
	//   64  116:aload_3         
	//   65  117:areturn         
	}

	public static void putCommaSeparatedStringList(Bundle bundle, String s, List list)
	{
		if(list != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          81
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #210 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #211 <Method void StringBuilder()>
	//    5   11:astore_3        
			for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); stringbuilder.append(","))
	//*   6   12:aload_2         
	//*   7   13:invokeinterface #359 <Method Iterator List.iterator()>
	//*   8   18:astore_2        
	//*   9   19:aload_2         
	//*  10   20:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//*  11   25:ifeq            53
				stringbuilder.append((String)((Iterator) (list)).next());
	//   12   28:aload_3         
	//   13   29:aload_2         
	//   14   30:invokeinterface #158 <Method Object Iterator.next()>
	//   15   35:checkcast       #160 <Class String>
	//   16   38:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   17   41:pop             

	//   18   42:aload_3         
	//   19   43:ldc2            #819 <String ",">
	//   20   46:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   21   49:pop             
	//*  22   50:goto            19
			list = "";
	//   23   53:ldc1            #59  <String "">
	//   24   55:astore_2        
			if(stringbuilder.length() > 0)
	//*  25   56:aload_3         
	//*  26   57:invokevirtual   #820 <Method int StringBuilder.length()>
	//*  27   60:ifle            75
				list = ((List) (stringbuilder.substring(0, stringbuilder.length() - 1)));
	//   28   63:aload_3         
	//   29   64:iconst_0        
	//   30   65:aload_3         
	//   31   66:invokevirtual   #820 <Method int StringBuilder.length()>
	//   32   69:iconst_1        
	//   33   70:isub            
	//   34   71:invokevirtual   #824 <Method String StringBuilder.substring(int, int)>
	//   35   74:astore_2        
			bundle.putString(s, ((String) (list)));
	//   36   75:aload_0         
	//   37   76:aload_1         
	//   38   77:aload_2         
	//   39   78:invokevirtual   #489 <Method void Bundle.putString(String, String)>
		}
	//   40   81:return          
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
	//    4    6:invokevirtual   #830 <Method void Bundle.remove(String)>
			else
	//*   5    9:goto            230
			if(obj instanceof Boolean)
	//*   6   12:aload_2         
	//*   7   13:instanceof      #832 <Class Boolean>
	//*   8   16:ifeq            34
				bundle.putBoolean(s, ((Boolean)obj).booleanValue());
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:checkcast       #832 <Class Boolean>
	//   13   25:invokevirtual   #835 <Method boolean Boolean.booleanValue()>
	//   14   28:invokevirtual   #839 <Method void Bundle.putBoolean(String, boolean)>
			else
	//*  15   31:goto            230
			if(obj instanceof boolean[])
	//*  16   34:aload_2         
	//*  17   35:instanceof      #841 <Class boolean[]>
	//*  18   38:ifeq            53
				bundle.putBooleanArray(s, (boolean[])obj);
	//   19   41:aload_0         
	//   20   42:aload_1         
	//   21   43:aload_2         
	//   22   44:checkcast       #841 <Class boolean[]>
	//   23   47:invokevirtual   #845 <Method void Bundle.putBooleanArray(String, boolean[])>
			else
	//*  24   50:goto            230
			if(obj instanceof Double)
	//*  25   53:aload_2         
	//*  26   54:instanceof      #847 <Class Double>
	//*  27   57:ifeq            75
				bundle.putDouble(s, ((Double)obj).doubleValue());
	//   28   60:aload_0         
	//   29   61:aload_1         
	//   30   62:aload_2         
	//   31   63:checkcast       #847 <Class Double>
	//   32   66:invokevirtual   #851 <Method double Double.doubleValue()>
	//   33   69:invokevirtual   #855 <Method void Bundle.putDouble(String, double)>
			else
	//*  34   72:goto            230
			if(obj instanceof double[])
	//*  35   75:aload_2         
	//*  36   76:instanceof      #857 <Class double[]>
	//*  37   79:ifeq            94
				bundle.putDoubleArray(s, (double[])obj);
	//   38   82:aload_0         
	//   39   83:aload_1         
	//   40   84:aload_2         
	//   41   85:checkcast       #857 <Class double[]>
	//   42   88:invokevirtual   #861 <Method void Bundle.putDoubleArray(String, double[])>
			else
	//*  43   91:goto            230
			if(obj instanceof Integer)
	//*  44   94:aload_2         
	//*  45   95:instanceof      #634 <Class Integer>
	//*  46   98:ifeq            116
				bundle.putInt(s, ((Integer)obj).intValue());
	//   47  101:aload_0         
	//   48  102:aload_1         
	//   49  103:aload_2         
	//   50  104:checkcast       #634 <Class Integer>
	//   51  107:invokevirtual   #864 <Method int Integer.intValue()>
	//   52  110:invokevirtual   #868 <Method void Bundle.putInt(String, int)>
			else
	//*  53  113:goto            230
			if(obj instanceof int[])
	//*  54  116:aload_2         
	//*  55  117:instanceof      #870 <Class int[]>
	//*  56  120:ifeq            135
				bundle.putIntArray(s, (int[])obj);
	//   57  123:aload_0         
	//   58  124:aload_1         
	//   59  125:aload_2         
	//   60  126:checkcast       #870 <Class int[]>
	//   61  129:invokevirtual   #874 <Method void Bundle.putIntArray(String, int[])>
			else
	//*  62  132:goto            230
			if(obj instanceof Long)
	//*  63  135:aload_2         
	//*  64  136:instanceof      #405 <Class Long>
	//*  65  139:ifeq            157
				bundle.putLong(s, ((Long)obj).longValue());
	//   66  142:aload_0         
	//   67  143:aload_1         
	//   68  144:aload_2         
	//   69  145:checkcast       #405 <Class Long>
	//   70  148:invokevirtual   #409 <Method long Long.longValue()>
	//   71  151:invokevirtual   #878 <Method void Bundle.putLong(String, long)>
			else
	//*  72  154:goto            230
			if(obj instanceof long[])
	//*  73  157:aload_2         
	//*  74  158:instanceof      #880 <Class long[]>
	//*  75  161:ifeq            176
				bundle.putLongArray(s, (long[])obj);
	//   76  164:aload_0         
	//   77  165:aload_1         
	//   78  166:aload_2         
	//   79  167:checkcast       #880 <Class long[]>
	//   80  170:invokevirtual   #884 <Method void Bundle.putLongArray(String, long[])>
			else
	//*  81  173:goto            230
			if(obj instanceof String)
	//*  82  176:aload_2         
	//*  83  177:instanceof      #160 <Class String>
	//*  84  180:ifeq            195
				bundle.putString(s, (String)obj);
	//   85  183:aload_0         
	//   86  184:aload_1         
	//   87  185:aload_2         
	//   88  186:checkcast       #160 <Class String>
	//   89  189:invokevirtual   #489 <Method void Bundle.putString(String, String)>
			else
	//*  90  192:goto            230
			if(obj instanceof JSONArray)
	//*  91  195:aload_2         
	//*  92  196:instanceof      #281 <Class JSONArray>
	//*  93  199:ifeq            214
			{
				bundle.putString(s, obj.toString());
	//   94  202:aload_0         
	//   95  203:aload_1         
	//   96  204:aload_2         
	//   97  205:invokevirtual   #885 <Method String Object.toString()>
	//   98  208:invokevirtual   #489 <Method void Bundle.putString(String, String)>
			} else
	//*  99  211:goto            230
			{
				if(!(obj instanceof JSONObject))
					break label0;
	//  100  214:aload_2         
	//  101  215:instanceof      #275 <Class JSONObject>
	//  102  218:ifeq            232
				bundle.putString(s, obj.toString());
	//  103  221:aload_0         
	//  104  222:aload_1         
	//  105  223:aload_2         
	//  106  224:invokevirtual   #885 <Method String Object.toString()>
	//  107  227:invokevirtual   #489 <Method void Bundle.putString(String, String)>
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
	//*   1    1:invokestatic    #257 <Method boolean isNullOrEmpty(String)>
	//*   2    4:ifne            13
			bundle.putString(s, s1);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #489 <Method void Bundle.putString(String, String)>
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
	//    5    7:invokevirtual   #581 <Method String Uri.toString()>
	//    6   10:invokestatic    #891 <Method void putNonEmptyString(Bundle, String, String)>
	//    7   13:return          
	}

	public static String readStreamToString(InputStream inputstream)
		throws IOException
	{
		BufferedInputStream bufferedinputstream = new BufferedInputStream(inputstream);
	//    0    0:new             #301 <Class BufferedInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #304 <Method void BufferedInputStream(InputStream)>
	//    4    8:astore_3        
		Object obj = ((Object) (new InputStreamReader(((InputStream) (bufferedinputstream)))));
	//    5    9:new             #895 <Class InputStreamReader>
	//    6   12:dup             
	//    7   13:aload_3         
	//    8   14:invokespecial   #896 <Method void InputStreamReader(InputStream)>
	//    9   17:astore_2        
		char ac[];
		inputstream = ((InputStream) (new StringBuilder()));
	//   10   18:new             #210 <Class StringBuilder>
	//   11   21:dup             
	//   12   22:invokespecial   #211 <Method void StringBuilder()>
	//   13   25:astore_0        
		ac = new char[2048];
	//   14   26:sipush          2048
	//   15   29:newarray        char[]
	//   16   31:astore          4
_L1:
		int i = ((InputStreamReader) (obj)).read(ac);
	//   17   33:aload_2         
	//   18   34:aload           4
	//   19   36:invokevirtual   #899 <Method int InputStreamReader.read(char[])>
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
	//   28   50:invokevirtual   #902 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//   29   53:pop             
		  goto _L1
	//*  30   54:goto            33
		inputstream = ((InputStream) (((StringBuilder) (inputstream)).toString()));
	//   31   57:aload_0         
	//   32   58:invokevirtual   #224 <Method String StringBuilder.toString()>
	//   33   61:astore_0        
		closeQuietly(((Closeable) (bufferedinputstream)));
	//   34   62:aload_3         
	//   35   63:invokestatic    #904 <Method void closeQuietly(Closeable)>
		closeQuietly(((Closeable) (obj)));
	//   36   66:aload_2         
	//   37   67:invokestatic    #904 <Method void closeQuietly(Closeable)>
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
	//   52   88:invokestatic    #904 <Method void closeQuietly(Closeable)>
		closeQuietly(((Closeable) (obj)));
	//   53   91:aload_2         
	//   54   92:invokestatic    #904 <Method void closeQuietly(Closeable)>
		throw inputstream;
	//   55   95:aload_0         
	//   56   96:athrow          
	}

	public static Map readStringMapFromParcel(Parcel parcel)
	{
		int j = parcel.readInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #911 <Method int Parcel.readInt()>
	//    2    4:istore_2        
		if(j < 0)
	//*   3    5:iload_2         
	//*   4    6:ifge            11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		HashMap hashmap = new HashMap();
	//    7   11:new             #272 <Class HashMap>
	//    8   14:dup             
	//    9   15:invokespecial   #273 <Method void HashMap()>
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
	//   18   28:invokevirtual   #914 <Method String Parcel.readString()>
	//   19   31:aload_0         
	//   20   32:invokevirtual   #914 <Method String Parcel.readString()>
	//   21   35:invokeinterface #917 <Method Object Map.put(Object, Object)>
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
	//*   0    0:invokestatic    #921 <Method boolean externalStorageExists()>
	//*   1    3:ifeq            34
			{
				StatFs statfs = new StatFs(Environment.getExternalStorageDirectory().getPath());
	//    2    6:new             #923 <Class StatFs>
	//    3    9:dup             
	//    4   10:invokestatic    #927 <Method File Environment.getExternalStorageDirectory()>
	//    5   13:invokevirtual   #930 <Method String File.getPath()>
	//    6   16:invokespecial   #931 <Method void StatFs(String)>
	//    7   19:astore_0        
				availableExternalStorageGB = (long)statfs.getAvailableBlocks() * (long)statfs.getBlockSize();
	//    8   20:aload_0         
	//    9   21:invokevirtual   #934 <Method int StatFs.getAvailableBlocks()>
	//   10   24:i2l             
	//   11   25:aload_0         
	//   12   26:invokevirtual   #937 <Method int StatFs.getBlockSize()>
	//   13   29:i2l             
	//   14   30:lmul            
	//   15   31:putstatic       #939 <Field long availableExternalStorageGB>
			}
			availableExternalStorageGB = convertBytesToGB(availableExternalStorageGB);
	//   16   34:getstatic       #939 <Field long availableExternalStorageGB>
	//   17   37:l2d             
	//   18   38:invokestatic    #941 <Method long convertBytesToGB(double)>
	//   19   41:putstatic       #939 <Field long availableExternalStorageGB>
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
	//    0    0:getstatic       #944 <Field int numCPUCores>
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
	//    6   10:new             #323 <Class File>
	//    7   13:dup             
	//    8   14:ldc2            #946 <String "/sys/devices/system/cpu/">
	//    9   17:invokespecial   #947 <Method void File(String)>
	//   10   20:new             #8   <Class Utility$2>
	//   11   23:dup             
	//   12   24:invokespecial   #948 <Method void Utility$2()>
	//   13   27:invokevirtual   #951 <Method File[] File.listFiles(FilenameFilter)>
	//   14   30:astore_1        
		if(afile != null)
	//*  15   31:aload_1         
	//*  16   32:ifnull          40
			try
			{
				numCPUCores = afile.length;
	//   17   35:aload_1         
	//   18   36:arraylength     
	//   19   37:putstatic       #944 <Field int numCPUCores>
			}
	//*  20   40:getstatic       #944 <Field int numCPUCores>
	//*  21   43:ifgt            59
	//*  22   46:invokestatic    #957 <Method Runtime Runtime.getRuntime()>
	//*  23   49:invokevirtual   #960 <Method int Runtime.availableProcessors()>
	//*  24   52:iconst_1        
	//*  25   53:invokestatic    #964 <Method int Math.max(int, int)>
	//*  26   56:putstatic       #944 <Field int numCPUCores>
	//*  27   59:getstatic       #944 <Field int numCPUCores>
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
	//    0    0:getstatic       #967 <Field String carrierName>
	//    1    3:ldc1            #56  <String "NoCarrier">
	//    2    5:invokevirtual   #354 <Method boolean String.equals(Object)>
	//    3    8:ifeq            27
		carrierName = ((TelephonyManager)context.getSystemService("phone")).getNetworkOperatorName();
	//    4   11:aload_0         
	//    5   12:ldc2            #969 <String "phone">
	//    6   15:invokevirtual   #971 <Method Object Context.getSystemService(String)>
	//    7   18:checkcast       #973 <Class TelephonyManager>
	//    8   21:invokevirtual   #976 <Method String TelephonyManager.getNetworkOperatorName()>
	//    9   24:putstatic       #967 <Field String carrierName>
		return;
	//   10   27:return          
		context;
	//   11   28:astore_0        
	//   12   29:return          
	}

	private static void refreshPeriodicExtendedDeviceInfo(Context context)
	{
		if(timestampOfLastCheck == -1L || System.currentTimeMillis() - timestampOfLastCheck >= 0x1b7740L)
	//*   0    0:getstatic       #979 <Field long timestampOfLastCheck>
	//*   1    3:ldc2w           #52  <Long -1L>
	//*   2    6:lcmp            
	//*   3    7:ifeq            24
	//*   4   10:invokestatic    #984 <Method long System.currentTimeMillis()>
	//*   5   13:getstatic       #979 <Field long timestampOfLastCheck>
	//*   6   16:lsub            
	//*   7   17:ldc2w           #985 <Long 0x1b7740L>
	//*   8   20:lcmp            
	//*   9   21:iflt            43
		{
			timestampOfLastCheck = System.currentTimeMillis();
	//   10   24:invokestatic    #984 <Method long System.currentTimeMillis()>
	//   11   27:putstatic       #979 <Field long timestampOfLastCheck>
			refreshTimezone();
	//   12   30:invokestatic    #989 <Method void refreshTimezone()>
			refreshCarrierName(context);
	//   13   33:aload_0         
	//   14   34:invokestatic    #991 <Method void refreshCarrierName(Context)>
			refreshTotalExternalStorage();
	//   15   37:invokestatic    #994 <Method void refreshTotalExternalStorage()>
			refreshAvailableExternalStorage();
	//   16   40:invokestatic    #996 <Method void refreshAvailableExternalStorage()>
		}
	//   17   43:return          
	}

	private static void refreshTimezone()
	{
		try
		{
			TimeZone timezone = TimeZone.getDefault();
	//    0    0:invokestatic    #1003 <Method TimeZone TimeZone.getDefault()>
	//    1    3:astore_0        
			deviceTimezoneAbbreviation = timezone.getDisplayName(timezone.inDaylightTime(new Date()), 0);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:new             #415 <Class Date>
	//    5    9:dup             
	//    6   10:invokespecial   #1004 <Method void Date()>
	//    7   13:invokevirtual   #1008 <Method boolean TimeZone.inDaylightTime(Date)>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #1012 <Method String TimeZone.getDisplayName(boolean, int)>
	//   10   20:putstatic       #1014 <Field String deviceTimezoneAbbreviation>
			deviceTimeZoneName = timezone.getID();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #1017 <Method String TimeZone.getID()>
	//   13   27:putstatic       #1019 <Field String deviceTimeZoneName>
			return;
	//   14   30:return          
		}
		catch(Object obj)
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
	//*   0    0:invokestatic    #921 <Method boolean externalStorageExists()>
	//*   1    3:ifeq            34
			{
				StatFs statfs = new StatFs(Environment.getExternalStorageDirectory().getPath());
	//    2    6:new             #923 <Class StatFs>
	//    3    9:dup             
	//    4   10:invokestatic    #927 <Method File Environment.getExternalStorageDirectory()>
	//    5   13:invokevirtual   #930 <Method String File.getPath()>
	//    6   16:invokespecial   #931 <Method void StatFs(String)>
	//    7   19:astore_0        
				totalExternalStorageGB = (long)statfs.getBlockCount() * (long)statfs.getBlockSize();
	//    8   20:aload_0         
	//    9   21:invokevirtual   #1022 <Method int StatFs.getBlockCount()>
	//   10   24:i2l             
	//   11   25:aload_0         
	//   12   26:invokevirtual   #937 <Method int StatFs.getBlockSize()>
	//   13   29:i2l             
	//   14   30:lmul            
	//   15   31:putstatic       #1024 <Field long totalExternalStorageGB>
			}
			totalExternalStorageGB = convertBytesToGB(totalExternalStorageGB);
	//   16   34:getstatic       #1024 <Field long totalExternalStorageGB>
	//   17   37:l2d             
	//   18   38:invokestatic    #941 <Method long convertBytesToGB(double)>
	//   19   41:putstatic       #1024 <Field long totalExternalStorageGB>
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
	//    4    6:ldc1            #59  <String "">
	//    5    8:invokevirtual   #1028 <Method String JSONObject.optString(String, String)>
	//    6   11:areturn         
		else
			return "";
	//    7   12:ldc1            #59  <String "">
	//    8   14:areturn         
	}

	public static void setAppEventAttributionParameters(JSONObject jsonobject, AttributionIdentifiers attributionidentifiers, String s, boolean flag)
		throws JSONException
	{
		if(attributionidentifiers != null && attributionidentifiers.getAttributionId() != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          23
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #1035 <Method String AttributionIdentifiers.getAttributionId()>
	//*   4    8:ifnull          23
			jsonobject.put("attribution", ((Object) (attributionidentifiers.getAttributionId())));
	//    5   11:aload_0         
	//    6   12:ldc2            #1037 <String "attribution">
	//    7   15:aload_1         
	//    8   16:invokevirtual   #1035 <Method String AttributionIdentifiers.getAttributionId()>
	//    9   19:invokevirtual   #1039 <Method JSONObject JSONObject.put(String, Object)>
	//   10   22:pop             
		if(attributionidentifiers != null && attributionidentifiers.getAndroidAdvertiserId() != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          60
	//*  13   27:aload_1         
	//*  14   28:invokevirtual   #1042 <Method String AttributionIdentifiers.getAndroidAdvertiserId()>
	//*  15   31:ifnull          60
		{
			jsonobject.put("advertiser_id", ((Object) (attributionidentifiers.getAndroidAdvertiserId())));
	//   16   34:aload_0         
	//   17   35:ldc2            #1044 <String "advertiser_id">
	//   18   38:aload_1         
	//   19   39:invokevirtual   #1042 <Method String AttributionIdentifiers.getAndroidAdvertiserId()>
	//   20   42:invokevirtual   #1039 <Method JSONObject JSONObject.put(String, Object)>
	//   21   45:pop             
			jsonobject.put("advertiser_tracking_enabled", attributionidentifiers.isTrackingLimited() ^ true);
	//   22   46:aload_0         
	//   23   47:ldc2            #1046 <String "advertiser_tracking_enabled">
	//   24   50:aload_1         
	//   25   51:invokevirtual   #1049 <Method boolean AttributionIdentifiers.isTrackingLimited()>
	//   26   54:iconst_1        
	//   27   55:ixor            
	//   28   56:invokevirtual   #1052 <Method JSONObject JSONObject.put(String, boolean)>
	//   29   59:pop             
		}
		if(attributionidentifiers != null && attributionidentifiers.getAndroidInstallerPackage() != null)
	//*  30   60:aload_1         
	//*  31   61:ifnull          83
	//*  32   64:aload_1         
	//*  33   65:invokevirtual   #1055 <Method String AttributionIdentifiers.getAndroidInstallerPackage()>
	//*  34   68:ifnull          83
			jsonobject.put("installer_package", ((Object) (attributionidentifiers.getAndroidInstallerPackage())));
	//   35   71:aload_0         
	//   36   72:ldc2            #1057 <String "installer_package">
	//   37   75:aload_1         
	//   38   76:invokevirtual   #1055 <Method String AttributionIdentifiers.getAndroidInstallerPackage()>
	//   39   79:invokevirtual   #1039 <Method JSONObject JSONObject.put(String, Object)>
	//   40   82:pop             
		jsonobject.put("anon_id", ((Object) (s)));
	//   41   83:aload_0         
	//   42   84:ldc2            #1059 <String "anon_id">
	//   43   87:aload_2         
	//   44   88:invokevirtual   #1039 <Method JSONObject JSONObject.put(String, Object)>
	//   45   91:pop             
		jsonobject.put("application_tracking_enabled", flag ^ true);
	//   46   92:aload_0         
	//   47   93:ldc2            #1061 <String "application_tracking_enabled">
	//   48   96:iload_3         
	//   49   97:iconst_1        
	//   50   98:ixor            
	//   51   99:invokevirtual   #1052 <Method JSONObject JSONObject.put(String, boolean)>
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
	//    0    0:new             #281 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #1066 <Method void JSONArray()>
	//    3    7:astore          9
		jsonarray.put("a2");
	//    4    9:aload           9
	//    5   11:ldc1            #30  <String "a2">
	//    6   13:invokevirtual   #1069 <Method JSONArray JSONArray.put(Object)>
	//    7   16:pop             
		refreshPeriodicExtendedDeviceInfo(context);
	//    8   17:aload_1         
	//    9   18:invokestatic    #1071 <Method void refreshPeriodicExtendedDeviceInfo(Context)>
		s = context.getPackageName();
	//   10   21:aload_1         
	//   11   22:invokevirtual   #1074 <Method String Context.getPackageName()>
	//   12   25:astore          10
		obj = "";
	//   13   27:ldc1            #59  <String "">
	//   14   29:astore          7
		j = -1;
	//   15   31:iconst_m1       
	//   16   32:istore          6
		i = j;
	//   17   34:iload           6
	//   18   36:istore          5
		Object obj1 = ((Object) (context.getPackageManager().getPackageInfo(s, 0)));
	//   19   38:aload_1         
	//   20   39:invokevirtual   #704 <Method PackageManager Context.getPackageManager()>
	//   21   42:aload           10
	//   22   44:iconst_0        
	//   23   45:invokevirtual   #1078 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   24   48:astore          8
		i = j;
	//   25   50:iload           6
	//   26   52:istore          5
		j = ((PackageInfo) (obj1)).versionCode;
	//   27   54:aload           8
	//   28   56:getfield        #1083 <Field int PackageInfo.versionCode>
	//   29   59:istore          6
		i = j;
	//   30   61:iload           6
	//   31   63:istore          5
		obj1 = ((Object) (((PackageInfo) (obj1)).versionName));
	//   32   65:aload           8
	//   33   67:getfield        #1086 <Field String PackageInfo.versionName>
	//   34   70:astore          8
		i = j;
	//   35   72:iload           6
	//   36   74:istore          5
		obj = obj1;
	//   37   76:aload           8
	//   38   78:astore          7
_L4:
		double d;
		jsonarray.put(((Object) (s)));
	//   39   80:aload           9
	//   40   82:aload           10
	//   41   84:invokevirtual   #1069 <Method JSONArray JSONArray.put(Object)>
	//   42   87:pop             
		jsonarray.put(i);
	//   43   88:aload           9
	//   44   90:iload           5
	//   45   92:invokevirtual   #1089 <Method JSONArray JSONArray.put(int)>
	//   46   95:pop             
		jsonarray.put(obj);
	//   47   96:aload           9
	//   48   98:aload           7
	//   49  100:invokevirtual   #1069 <Method JSONArray JSONArray.put(Object)>
	//   50  103:pop             
		jsonarray.put(((Object) (android.os.Build.VERSION.RELEASE)));
	//   51  104:aload           9
	//   52  106:getstatic       #1092 <Field String android.os.Build$VERSION.RELEASE>
	//   53  109:invokevirtual   #1069 <Method JSONArray JSONArray.put(Object)>
	//   54  112:pop             
		jsonarray.put(((Object) (Build.MODEL)));
	//   55  113:aload           9
	//   56  115:getstatic       #1095 <Field String Build.MODEL>
	//   57  118:invokevirtual   #1069 <Method JSONArray JSONArray.put(Object)>
	//   58  121:pop             
		try
		{
			obj = ((Object) (context.getResources().getConfiguration().locale));
	//   59  122:aload_1         
	//   60  123:invokevirtual   #464 <Method Resources Context.getResources()>
	//   61  126:invokevirtual   #470 <Method Configuration Resources.getConfiguration()>
	//   62  129:getfield        #476 <Field Locale Configuration.locale>
	//   63  132:astore          7
		}
	//*  64  134:goto            142
	//*  65  137:invokestatic    #481 <Method Locale Locale.getDefault()>
	//*  66  140:astore          7
	//*  67  142:new             #210 <Class StringBuilder>
	//*  68  145:dup             
	//*  69  146:invokespecial   #211 <Method void StringBuilder()>
	//*  70  149:astore          8
	//*  71  151:aload           8
	//*  72  153:aload           7
	//*  73  155:invokevirtual   #1098 <Method String Locale.getLanguage()>
	//*  74  158:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//*  75  161:pop             
	//*  76  162:aload           8
	//*  77  164:ldc2            #1100 <String "_">
	//*  78  167:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//*  79  170:pop             
	//*  80  171:aload           8
	//*  81  173:aload           7
	//*  82  175:invokevirtual   #1103 <Method String Locale.getCountry()>
	//*  83  178:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//*  84  181:pop             
	//*  85  182:aload           9
	//*  86  184:aload           8
	//*  87  186:invokevirtual   #224 <Method String StringBuilder.toString()>
	//*  88  189:invokevirtual   #1069 <Method JSONArray JSONArray.put(Object)>
	//*  89  192:pop             
	//*  90  193:aload           9
	//*  91  195:getstatic       #1014 <Field String deviceTimezoneAbbreviation>
	//*  92  198:invokevirtual   #1069 <Method JSONArray JSONArray.put(Object)>
	//*  93  201:pop             
	//*  94  202:aload           9
	//*  95  204:getstatic       #967 <Field String carrierName>
	//*  96  207:invokevirtual   #1069 <Method JSONArray JSONArray.put(Object)>
	//*  97  210:pop             
	//*  98  211:dconst_0        
	//*  99  212:dstore_2        
	//* 100  213:aload_1         
	//* 101  214:ldc2            #1105 <String "window">
	//* 102  217:invokevirtual   #971 <Method Object Context.getSystemService(String)>
	//* 103  220:checkcast       #1107 <Class WindowManager>
	//* 104  223:astore_1        
	//* 105  224:aload_1         
	//* 106  225:ifnull          284
	//* 107  228:aload_1         
	//* 108  229:invokeinterface #1111 <Method Display WindowManager.getDefaultDisplay()>
	//* 109  234:astore_1        
	//* 110  235:new             #1113 <Class DisplayMetrics>
	//* 111  238:dup             
	//* 112  239:invokespecial   #1114 <Method void DisplayMetrics()>
	//* 113  242:astore          7
	//* 114  244:aload_1         
	//* 115  245:aload           7
	//* 116  247:invokevirtual   #1120 <Method void Display.getMetrics(DisplayMetrics)>
	//* 117  250:aload           7
	//* 118  252:getfield        #1123 <Field int DisplayMetrics.widthPixels>
	//* 119  255:istore          6
	//* 120  257:aload           7
	//* 121  259:getfield        #1126 <Field int DisplayMetrics.heightPixels>
	//* 122  262:istore          5
	//* 123  264:aload           7
	//* 124  266:getfield        #1130 <Field float DisplayMetrics.density>
	//* 125  269:fstore          4
	//* 126  271:fload           4
	//* 127  273:f2d             
	//* 128  274:dstore_2        
	//* 129  275:goto            301
	//* 130  278:iconst_0        
	//* 131  279:istore          5
	//* 132  281:goto            301
	//* 133  284:iconst_0        
	//* 134  285:istore          6
	//* 135  287:iload           6
	//* 136  289:istore          5
	//* 137  291:goto            301
	//* 138  294:iconst_0        
	//* 139  295:istore          6
	//* 140  297:iload           6
	//* 141  299:istore          5
	//* 142  301:aload           9
	//* 143  303:iload           6
	//* 144  305:invokevirtual   #1089 <Method JSONArray JSONArray.put(int)>
	//* 145  308:pop             
	//* 146  309:aload           9
	//* 147  311:iload           5
	//* 148  313:invokevirtual   #1089 <Method JSONArray JSONArray.put(int)>
	//* 149  316:pop             
	//* 150  317:aload           9
	//* 151  319:ldc2            #1132 <String "%.2f">
	//* 152  322:iconst_1        
	//* 153  323:anewarray       Object[]
	//* 154  326:dup             
	//* 155  327:iconst_0        
	//* 156  328:dload_2         
	//* 157  329:invokestatic    #1136 <Method Double Double.valueOf(double)>
	//* 158  332:aastore         
	//* 159  333:invokestatic    #1140 <Method String String.format(String, Object[])>
	//* 160  336:invokevirtual   #1069 <Method JSONArray JSONArray.put(Object)>
	//* 161  339:pop             
	//* 162  340:aload           9
	//* 163  342:invokestatic    #1142 <Method int refreshBestGuessNumberOfCPUCores()>
	//* 164  345:invokevirtual   #1089 <Method JSONArray JSONArray.put(int)>
	//* 165  348:pop             
	//* 166  349:aload           9
	//* 167  351:getstatic       #1024 <Field long totalExternalStorageGB>
	//* 168  354:invokevirtual   #1145 <Method JSONArray JSONArray.put(long)>
	//* 169  357:pop             
	//* 170  358:aload           9
	//* 171  360:getstatic       #939 <Field long availableExternalStorageGB>
	//* 172  363:invokevirtual   #1145 <Method JSONArray JSONArray.put(long)>
	//* 173  366:pop             
	//* 174  367:aload           9
	//* 175  369:getstatic       #1019 <Field String deviceTimeZoneName>
	//* 176  372:invokevirtual   #1069 <Method JSONArray JSONArray.put(Object)>
	//* 177  375:pop             
	//* 178  376:aload_0         
	//* 179  377:ldc2            #1147 <String "extinfo">
	//* 180  380:aload           9
	//* 181  382:invokevirtual   #1148 <Method String JSONArray.toString()>
	//* 182  385:invokevirtual   #1039 <Method JSONObject JSONObject.put(String, Object)>
	//* 183  388:pop             
	//* 184  389:return          
	//* 185  390:astore          8
	//* 186  392:goto            80
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
_L6:
		i = 0;
		  goto _L3
_L2:
		j = 0;
		i = j;
		  goto _L3
_L5:
		j = 0;
		i = j;
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
		jsonobject.put("extinfo", ((Object) (jsonarray.toString())));
		return;
		Exception exception;
		android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
		namenotfoundexception;
		  goto _L4
	//* 187  395:astore          7
	//* 188  397:goto            137
		context;
	//  189  400:astore_1        
		  goto _L5
	//* 190  401:goto            294
		context;
	//  191  404:astore_1        
		  goto _L6
	//* 192  405:goto            278
		context;
	//  193  408:astore_1        
		  goto _L3
	//* 194  409:goto            301
	}

	public static String sha1hash(String s)
	{
		return hashWithAlgorithm("SHA-1", s);
	//    0    0:ldc1            #38  <String "SHA-1">
	//    1    2:aload_0         
	//    2    3:invokestatic    #799 <Method String hashWithAlgorithm(String, String)>
	//    3    6:areturn         
	}

	public static String sha1hash(byte abyte0[])
	{
		return hashWithAlgorithm("SHA-1", abyte0);
	//    0    0:ldc1            #38  <String "SHA-1">
	//    1    2:aload_0         
	//    2    3:invokestatic    #651 <Method String hashWithAlgorithm(String, byte[])>
	//    3    6:areturn         
	}

	public static boolean stringsEqualOrEmpty(String s, String s1)
	{
		boolean flag = TextUtils.isEmpty(((CharSequence) (s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #1158 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    2    4:istore_2        
		boolean flag1 = TextUtils.isEmpty(((CharSequence) (s1)));
	//    3    5:aload_1         
	//    4    6:invokestatic    #1158 <Method boolean TextUtils.isEmpty(CharSequence)>
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
	//   18   30:invokevirtual   #354 <Method boolean String.equals(Object)>
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
	//    4    6:invokevirtual   #1163 <Method JSONArray JSONObject.optJSONArray(String)>
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
	//    4    6:invokevirtual   #1167 <Method JSONObject JSONObject.optJSONObject(String)>
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
	//    1    1:invokestatic    #1172 <Method List Arrays.asList(Object[])>
	//    2    4:invokestatic    #1177 <Method Collection Collections.unmodifiableCollection(Collection)>
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
	//    4    6:invokevirtual   #1183 <Method void Parcel.writeInt(int)>
			return;
	//    5    9:return          
		}
		parcel.writeInt(map1.size());
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokeinterface #1184 <Method int Map.size()>
	//    9   17:invokevirtual   #1183 <Method void Parcel.writeInt(int)>
		java.util.Map.Entry entry;
		for(map1 = ((Map) (map1.entrySet().iterator())); ((Iterator) (map1)).hasNext(); parcel.writeString((String)entry.getValue()))
	//*  10   20:aload_1         
	//*  11   21:invokeinterface #1187 <Method Set Map.entrySet()>
	//*  12   26:invokeinterface #148 <Method Iterator Set.iterator()>
	//*  13   31:astore_1        
	//*  14   32:aload_1         
	//*  15   33:invokeinterface #154 <Method boolean Iterator.hasNext()>
	//*  16   38:ifeq            80
		{
			entry = (java.util.Map.Entry)((Iterator) (map1)).next();
	//   17   41:aload_1         
	//   18   42:invokeinterface #158 <Method Object Iterator.next()>
	//   19   47:checkcast       #1189 <Class java.util.Map$Entry>
	//   20   50:astore_2        
			parcel.writeString((String)entry.getKey());
	//   21   51:aload_0         
	//   22   52:aload_2         
	//   23   53:invokeinterface #1192 <Method Object java.util.Map$Entry.getKey()>
	//   24   58:checkcast       #160 <Class String>
	//   25   61:invokevirtual   #1195 <Method void Parcel.writeString(String)>
		}

	//   26   64:aload_0         
	//   27   65:aload_2         
	//   28   66:invokeinterface #1198 <Method Object java.util.Map$Entry.getValue()>
	//   29   71:checkcast       #160 <Class String>
	//   30   74:invokevirtual   #1195 <Method void Parcel.writeString(String)>
	//*  31   77:goto            32
	//   32   80:return          
	}

	private static final String ARC_DEVICE_PATTERN = ".+_cheets|cheets_.+";
	public static final int DEFAULT_STREAM_BUFFER_SIZE = 8192;
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
	private static String deviceTimeZoneName = "";
	private static String deviceTimezoneAbbreviation = "";
	private static final String noCarrierConstant = "NoCarrier";
	private static int numCPUCores = 0;
	private static long timestampOfLastCheck = -1L;
	private static long totalExternalStorageGB = -1L;

	static 
	{
	//    0    0:return          
	}
}
