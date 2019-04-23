// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.*;
import android.graphics.drawable.Drawable;
import android.location.*;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.*;
import android.util.Log;
import java.io.*;
import java.net.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import org.apache.http.Header;
import org.apache.http.NameValuePair;
import org.json.*;

// Referenced classes of package com.appscend.mraid:
//			MadvertiseActivity

public class MadvertiseUtil
{
	class _cls1NetworkCheckTask extends AsyncTask
	{

		protected transient Boolean doInBackground(Void avoid[])
		{
			try
			{
				avoid = ((Void []) ((HttpURLConnection)(new URL("http://ad.madvertise.de/sync.html")).openConnection()));
		//    0    0:new             #19  <Class URL>
		//    1    3:dup             
		//    2    4:ldc1            #21  <String "http://ad.madvertise.de/sync.html">
		//    3    6:invokespecial   #24  <Method void URL(String)>
		//    4    9:invokevirtual   #28  <Method java.net.URLConnection URL.openConnection()>
		//    5   12:checkcast       #30  <Class HttpURLConnection>
		//    6   15:astore_1        
				((HttpURLConnection) (avoid)).setConnectTimeout(999);
		//    7   16:aload_1         
		//    8   17:sipush          999
		//    9   20:invokevirtual   #34  <Method void HttpURLConnection.setConnectTimeout(int)>
				((HttpURLConnection) (avoid)).setRequestMethod("GET");
		//   10   23:aload_1         
		//   11   24:ldc1            #36  <String "GET">
		//   12   26:invokevirtual   #39  <Method void HttpURLConnection.setRequestMethod(String)>
				((HttpURLConnection) (avoid)).setDoInput(true);
		//   13   29:aload_1         
		//   14   30:iconst_1        
		//   15   31:invokevirtual   #43  <Method void HttpURLConnection.setDoInput(boolean)>
				((HttpURLConnection) (avoid)).connect();
		//   16   34:aload_1         
		//   17   35:invokevirtual   #46  <Method void HttpURLConnection.connect()>
				if(((HttpURLConnection) (avoid)).getResponseCode() == 200)
		//*  18   38:aload_1         
		//*  19   39:invokevirtual   #50  <Method int HttpURLConnection.getResponseCode()>
		//*  20   42:sipush          200
		//*  21   45:icmpne          53
					return Boolean.valueOf(true);
		//   22   48:iconst_1        
		//   23   49:invokestatic    #56  <Method Boolean Boolean.valueOf(boolean)>
		//   24   52:areturn         
			}
		//*  25   53:iconst_0        
		//*  26   54:invokestatic    #56  <Method Boolean Boolean.valueOf(boolean)>
		//*  27   57:areturn         
		//*  28   58:iconst_0        
		//*  29   59:invokestatic    #56  <Method Boolean Boolean.valueOf(boolean)>
		//*  30   62:areturn         
			// Misplaced declaration of an exception variable
			catch(Void avoid[])
			{
				return Boolean.valueOf(false);
			}
			return Boolean.valueOf(false);
		//*  31   63:astore_1        
		//*  32   64:goto            58
		}

		protected volatile Object doInBackground(Object aobj[])
		{
			return ((Object) (doInBackground((Void[])aobj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #59  <Class Void[]>
		//    3    5:invokevirtual   #61  <Method Boolean doInBackground(Void[])>
		//    4    8:areturn         
		}

		_cls1NetworkCheckTask()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void AsyncTask()>
		//    2    4:return          
		}
	}

	public static final class HashType extends Enum
	{

		public static HashType valueOf(String s)
		{
			return (HashType)Enum.valueOf(com/appscend/mraid/MadvertiseUtil$HashType, s);
		//    0    0:ldc1            #2   <Class MadvertiseUtil$HashType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class MadvertiseUtil$HashType>
		//    4    9:areturn         
		}

		public static HashType[] values()
		{
			return (HashType[])((HashType []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field MadvertiseUtil$HashType[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.appscend.mraid.MadvertiseUtil$HashType_3B_.clone()>
		//    2    6:checkcast       #38  <Class MadvertiseUtil$HashType[]>
		//    3    9:areturn         
		}

		private static final HashType $VALUES[];
		public static final HashType MD5;
		public static final HashType SHA1;

		static 
		{
			MD5 = new HashType("MD5", 0);
		//    0    0:new             #2   <Class MadvertiseUtil$HashType>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "MD5">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void MadvertiseUtil$HashType(String, int)>
		//    5   10:putstatic       #22  <Field MadvertiseUtil$HashType MD5>
			SHA1 = new HashType("SHA1", 1);
		//    6   13:new             #2   <Class MadvertiseUtil$HashType>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "SHA1">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void MadvertiseUtil$HashType(String, int)>
		//   11   23:putstatic       #25  <Field MadvertiseUtil$HashType SHA1>
			$VALUES = (new HashType[] {
				MD5, SHA1
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       HashType[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field MadvertiseUtil$HashType MD5>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field MadvertiseUtil$HashType SHA1>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field MadvertiseUtil$HashType[] $VALUES>
		//*  23   45:return          
		}

		private HashType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	static class PInfo
	{

		private void prettyPrint()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #47  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #48  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append(appname);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #23  <Field String appname>
		//    7   13:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
		//    8   16:pop             
			stringbuilder.append("\t ");
		//    9   17:aload_1         
		//   10   18:ldc1            #54  <String "\t ">
		//   11   20:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
		//   12   23:pop             
			stringbuilder.append(pname);
		//   13   24:aload_1         
		//   14   25:aload_0         
		//   15   26:getfield        #25  <Field String pname>
		//   16   29:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
		//   17   32:pop             
			stringbuilder.append("\t ");
		//   18   33:aload_1         
		//   19   34:ldc1            #54  <String "\t ">
		//   20   36:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
		//   21   39:pop             
			stringbuilder.append(versionName);
		//   22   40:aload_1         
		//   23   41:aload_0         
		//   24   42:getfield        #27  <Field String versionName>
		//   25   45:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
		//   26   48:pop             
			stringbuilder.append("\t ");
		//   27   49:aload_1         
		//   28   50:ldc1            #54  <String "\t ">
		//   29   52:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
		//   30   55:pop             
			stringbuilder.append(versionCode);
		//   31   56:aload_1         
		//   32   57:aload_0         
		//   33   58:getfield        #29  <Field int versionCode>
		//   34   61:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
		//   35   64:pop             
			MadvertiseUtil.logMessage(((String) (null)), 3, stringbuilder.toString());
		//   36   65:aconst_null     
		//   37   66:iconst_3        
		//   38   67:aload_1         
		//   39   68:invokevirtual   #61  <Method String StringBuilder.toString()>
		//   40   71:invokestatic    #65  <Method void MadvertiseUtil.logMessage(String, int, String)>
		//   41   74:return          
		}

		private String appname;
		private Drawable icon;
		private String pname;
		private int versionCode;
		private String versionName;


/*
		static void access$200(PInfo pinfo)
		{
			pinfo.prettyPrint();
		//    0    0:aload_0         
		//    1    1:invokespecial   #35  <Method void prettyPrint()>
			return;
		//    2    4:return          
		}

*/


/*
		static String access$302(PInfo pinfo, String s)
		{
			pinfo.appname = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #23  <Field String appname>
			return s;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static String access$402(PInfo pinfo, String s)
		{
			pinfo.pname = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #25  <Field String pname>
			return s;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static String access$502(PInfo pinfo, String s)
		{
			pinfo.versionName = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #27  <Field String versionName>
			return s;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static int access$602(PInfo pinfo, int i)
		{
			pinfo.versionCode = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #29  <Field int versionCode>
			return i;
		//    3    5:iload_1         
		//    4    6:ireturn         
		}

*/


/*
		static Drawable access$702(PInfo pinfo, Drawable drawable)
		{
			pinfo.icon = drawable;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #45  <Field Drawable icon>
			return drawable;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/

		PInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			appname = "";
		//    2    4:aload_0         
		//    3    5:ldc1            #21  <String "">
		//    4    7:putfield        #23  <Field String appname>
			pname = "";
		//    5   10:aload_0         
		//    6   11:ldc1            #21  <String "">
		//    7   13:putfield        #25  <Field String pname>
			versionName = "";
		//    8   16:aload_0         
		//    9   17:ldc1            #21  <String "">
		//   10   19:putfield        #27  <Field String versionName>
			versionCode = 0;
		//   11   22:aload_0         
		//   12   23:iconst_0        
		//   13   24:putfield        #29  <Field int versionCode>
		//   14   27:return          
		}
	}


	public MadvertiseUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #125 <Method void Object()>
	//    2    4:return          
	}

	private static void checkEmptyJson(JSONObject jsonobject, String s)
		throws JSONException
	{
		if(jsonobject != null && !s.equals(""))
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
	//*   2    4:aload_1         
	//*   3    5:ldc1            #139 <String "">
	//*   4    7:invokevirtual   #145 <Method boolean String.equals(Object)>
	//*   5   10:ifne            14
			return;
	//    6   13:return          
		else
			throw new JSONException("Empty JSON or key");
	//    7   14:new             #137 <Class JSONException>
	//    8   17:dup             
	//    9   18:ldc1            #147 <String "Empty JSON or key">
	//   10   20:invokespecial   #150 <Method void JSONException(String)>
	//   11   23:athrow          
	}

	public static boolean checkForBrowserDeclaration(Context context)
	{
		PackageManager packagemanager = context.getPackageManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #159 <Method PackageManager Context.getPackageManager()>
	//    2    4:astore_2        
		context = ((Context) (new Intent(context, com/appscend/mraid/MadvertiseActivity)));
	//    3    5:new             #161 <Class Intent>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:ldc1            #163 <Class MadvertiseActivity>
	//    7   12:invokespecial   #166 <Method void Intent(Context, Class)>
	//    8   15:astore_0        
		boolean flag = false;
	//    9   16:iconst_0        
	//   10   17:istore_1        
		if(packagemanager.queryIntentActivities(((Intent) (context)), 0).size() > 0)
	//*  11   18:aload_2         
	//*  12   19:aload_0         
	//*  13   20:iconst_0        
	//*  14   21:invokevirtual   #172 <Method List PackageManager.queryIntentActivities(Intent, int)>
	//*  15   24:invokeinterface #178 <Method int List.size()>
	//*  16   29:ifle            34
			flag = true;
	//   17   32:iconst_1        
	//   18   33:istore_1        
		return flag;
	//   19   34:iload_1         
	//   20   35:ireturn         
	}

	public static boolean checkPermissionGranted(String s, Context context)
	{
		return context.checkCallingOrSelfPermission(s) == 0;
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #184 <Method int Context.checkCallingOrSelfPermission(String)>
	//    3    5:ifne            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public static String convertStreamToString(InputStream inputstream)
	{
		Object obj;
		BufferedReader bufferedreader;
		bufferedreader = new BufferedReader(((java.io.Reader) (new InputStreamReader(inputstream))));
	//    0    0:new             #190 <Class BufferedReader>
	//    1    3:dup             
	//    2    4:new             #192 <Class InputStreamReader>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #195 <Method void InputStreamReader(InputStream)>
	//    6   12:invokespecial   #198 <Method void BufferedReader(java.io.Reader)>
	//    7   15:astore_2        
		obj = ((Object) (new StringBuilder()));
	//    8   16:new             #200 <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #201 <Method void StringBuilder()>
	//   11   23:astore_1        
_L2:
		String s = bufferedreader.readLine();
	//   12   24:aload_2         
	//   13   25:invokevirtual   #205 <Method String BufferedReader.readLine()>
	//   14   28:astore_3        
		if(s == null)
			break; /* Loop/switch isn't completed */
	//   15   29:aload_3         
	//   16   30:ifnull          70
		StringBuilder stringbuilder = new StringBuilder();
	//   17   33:new             #200 <Class StringBuilder>
	//   18   36:dup             
	//   19   37:invokespecial   #201 <Method void StringBuilder()>
	//   20   40:astore          4
		stringbuilder.append(s);
	//   21   42:aload           4
	//   22   44:aload_3         
	//   23   45:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   24   48:pop             
		stringbuilder.append("\n");
	//   25   49:aload           4
	//   26   51:ldc1            #211 <String "\n">
	//   27   53:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
		((StringBuilder) (obj)).append(stringbuilder.toString());
	//   29   57:aload_1         
	//   30   58:aload           4
	//   31   60:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   32   63:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   33   66:pop             
		if(true) goto _L2; else goto _L1
	//   34   67:goto            24
_L1:
		try
		{
			inputstream.close();
	//   35   70:aload_0         
	//   36   71:invokevirtual   #219 <Method void InputStream.close()>
		}
	//*  37   74:goto            98
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  38   77:astore_0        
		{
			((IOException) (inputstream)).printStackTrace();
	//   39   78:aload_0         
	//   40   79:invokevirtual   #222 <Method void IOException.printStackTrace()>
		}
		break MISSING_BLOCK_LABEL_98;
	//   41   82:goto            98
		obj;
	//   42   85:astore_1        
		break MISSING_BLOCK_LABEL_103;
	//   43   86:goto            103
		IOException ioexception;
		ioexception;
	//   44   89:astore_2        
		ioexception.printStackTrace();
	//   45   90:aload_2         
	//   46   91:invokevirtual   #222 <Method void IOException.printStackTrace()>
		inputstream.close();
	//   47   94:aload_0         
	//   48   95:invokevirtual   #219 <Method void InputStream.close()>
		return ((StringBuilder) (obj)).toString();
	//   49   98:aload_1         
	//   50   99:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   51  102:areturn         
		try
		{
			inputstream.close();
	//   52  103:aload_0         
	//   53  104:invokevirtual   #219 <Method void InputStream.close()>
		}
	//*  54  107:goto            115
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  55  110:astore_0        
		{
			((IOException) (inputstream)).printStackTrace();
	//   56  111:aload_0         
	//   57  112:invokevirtual   #222 <Method void IOException.printStackTrace()>
		}
		throw obj;
	//   58  115:aload_1         
	//   59  116:athrow          
	}

	public static String getAllHeadersAsString(Header aheader[])
	{
		String s = "";
	//    0    0:ldc1            #139 <String "">
	//    1    2:astore_2        
		for(int i = 0; i < aheader.length; i++)
	//*   2    3:iconst_0        
	//*   3    4:istore_1        
	//*   4    5:iload_1         
	//*   5    6:aload_0         
	//*   6    7:arraylength     
	//*   7    8:icmpge          84
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    8   11:new             #200 <Class StringBuilder>
	//    9   14:dup             
	//   10   15:invokespecial   #201 <Method void StringBuilder()>
	//   11   18:astore_3        
			stringbuilder.append(s);
	//   12   19:aload_3         
	//   13   20:aload_2         
	//   14   21:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   15   24:pop             
			stringbuilder.append("<< ");
	//   16   25:aload_3         
	//   17   26:ldc1            #226 <String "<< ">
	//   18   28:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   19   31:pop             
			stringbuilder.append(aheader[i].getName());
	//   20   32:aload_3         
	//   21   33:aload_0         
	//   22   34:iload_1         
	//   23   35:aaload          
	//   24   36:invokeinterface #231 <Method String Header.getName()>
	//   25   41:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   26   44:pop             
			stringbuilder.append(" : ");
	//   27   45:aload_3         
	//   28   46:ldc1            #233 <String " : ">
	//   29   48:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   30   51:pop             
			stringbuilder.append(aheader[i].getValue());
	//   31   52:aload_3         
	//   32   53:aload_0         
	//   33   54:iload_1         
	//   34   55:aaload          
	//   35   56:invokeinterface #236 <Method String Header.getValue()>
	//   36   61:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   37   64:pop             
			stringbuilder.append(" >>");
	//   38   65:aload_3         
	//   39   66:ldc1            #238 <String " >>">
	//   40   68:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   41   71:pop             
			s = stringbuilder.toString();
	//   42   72:aload_3         
	//   43   73:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   44   76:astore_2        
		}

	//   45   77:iload_1         
	//   46   78:iconst_1        
	//   47   79:iadd            
	//   48   80:istore_1        
	//*  49   81:goto            5
		return s;
	//   50   84:aload_2         
	//   51   85:areturn         
	}

	public static String getApplicationName(Context context)
	{
		PackageManager packagemanager = context.getPackageManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #159 <Method PackageManager Context.getPackageManager()>
	//    2    4:astore_1        
		try
		{
			context = ((Context) (packagemanager.getApplicationLabel(packagemanager.getApplicationInfo(context.getPackageName(), 128)).toString()));
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #245 <Method String Context.getPackageName()>
	//    7   11:sipush          128
	//    8   14:invokevirtual   #249 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//    9   17:invokevirtual   #253 <Method CharSequence PackageManager.getApplicationLabel(ApplicationInfo)>
	//   10   20:invokeinterface #256 <Method String CharSequence.toString()>
	//   11   25:astore_0        
		}
	//*  12   26:aload_0         
	//*  13   27:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  14   28:astore_0        
		{
			((android.content.pm.PackageManager.NameNotFoundException) (context)).printStackTrace();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #257 <Method void android.content.pm.PackageManager$NameNotFoundException.printStackTrace()>
			return "";
	//   17   33:ldc1            #139 <String "">
	//   18   35:areturn         
		}
		return ((String) (context));
	}

	public static String getApplicationVersion(Context context)
	{
		PackageManager packagemanager = context.getPackageManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #159 <Method PackageManager Context.getPackageManager()>
	//    2    4:astore_1        
		try
		{
			context = ((Context) (packagemanager.getPackageInfo(context.getPackageName(), 0).versionName));
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #245 <Method String Context.getPackageName()>
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #262 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    8   14:getfield        #267 <Field String PackageInfo.versionName>
	//    9   17:astore_0        
		}
	//*  10   18:aload_0         
	//*  11   19:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  12   20:astore_0        
		{
			((android.content.pm.PackageManager.NameNotFoundException) (context)).printStackTrace();
	//   13   21:aload_0         
	//   14   22:invokevirtual   #257 <Method void android.content.pm.PackageManager$NameNotFoundException.printStackTrace()>
			return "";
	//   15   25:ldc1            #139 <String "">
	//   16   27:areturn         
		}
		return ((String) (context));
	}

	public static String getHash(String s, HashType hashtype)
	{
		com/appscend/mraid/MadvertiseUtil;
	//    0    0:ldc1            #2   <Class MadvertiseUtil>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		hashtype = ((HashType) (MessageDigest.getInstance(hashtype.toString())));
	//    2    3:aload_1         
	//    3    4:invokevirtual   #272 <Method String MadvertiseUtil$HashType.toString()>
	//    4    7:invokestatic    #278 <Method MessageDigest MessageDigest.getInstance(String)>
	//    5   10:astore_1        
		byte abyte0[];
		StringBuffer stringbuffer;
		((MessageDigest) (hashtype)).update(s.getBytes());
	//    6   11:aload_1         
	//    7   12:aload_0         
	//    8   13:invokevirtual   #282 <Method byte[] String.getBytes()>
	//    9   16:invokevirtual   #286 <Method void MessageDigest.update(byte[])>
		abyte0 = ((MessageDigest) (hashtype)).digest();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #289 <Method byte[] MessageDigest.digest()>
	//   12   23:astore_3        
		stringbuffer = new StringBuffer();
	//   13   24:new             #291 <Class StringBuffer>
	//   14   27:dup             
	//   15   28:invokespecial   #292 <Method void StringBuffer()>
	//   16   31:astore          4
		int i = 0;
	//   17   33:iconst_0        
	//   18   34:istore_2        
_L2:
		if(i >= abyte0.length)
			break; /* Loop/switch isn't completed */
	//   19   35:iload_2         
	//   20   36:aload_3         
	//   21   37:arraylength     
	//   22   38:icmpge          103
		hashtype = ((HashType) (Integer.toHexString(abyte0[i] & 0xff)));
	//   23   41:aload_3         
	//   24   42:iload_2         
	//   25   43:baload          
	//   26   44:sipush          255
	//   27   47:iand            
	//   28   48:invokestatic    #298 <Method String Integer.toHexString(int)>
	//   29   51:astore_1        
		s = ((String) (hashtype));
	//   30   52:aload_1         
	//   31   53:astore_0        
		if(((String) (hashtype)).length() < 2)
	//*  32   54:aload_1         
	//*  33   55:invokevirtual   #301 <Method int String.length()>
	//*  34   58:iconst_2        
	//*  35   59:icmpge          89
		{
			s = ((String) (new StringBuilder()));
	//   36   62:new             #200 <Class StringBuilder>
	//   37   65:dup             
	//   38   66:invokespecial   #201 <Method void StringBuilder()>
	//   39   69:astore_0        
			((StringBuilder) (s)).append("0");
	//   40   70:aload_0         
	//   41   71:ldc2            #303 <String "0">
	//   42   74:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   43   77:pop             
			((StringBuilder) (s)).append(((String) (hashtype)));
	//   44   78:aload_0         
	//   45   79:aload_1         
	//   46   80:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   47   83:pop             
			s = ((StringBuilder) (s)).toString();
	//   48   84:aload_0         
	//   49   85:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   50   88:astore_0        
		}
		stringbuffer.append(s);
	//   51   89:aload           4
	//   52   91:aload_0         
	//   53   92:invokevirtual   #306 <Method StringBuffer StringBuffer.append(String)>
	//   54   95:pop             
		i++;
	//   55   96:iload_2         
	//   56   97:iconst_1        
	//   57   98:iadd            
	//   58   99:istore_2        
		if(true) goto _L2; else goto _L1
	//   59  100:goto            35
_L1:
		s = stringbuffer.toString();
	//   60  103:aload           4
	//   61  105:invokevirtual   #307 <Method String StringBuffer.toString()>
	//   62  108:astore_0        
		com/appscend/mraid/MadvertiseUtil;
	//   63  109:ldc1            #2   <Class MadvertiseUtil>
		JVM INSTR monitorexit ;
	//   64  111:monitorexit     
		return s;
	//   65  112:aload_0         
	//   66  113:areturn         
		s;
	//   67  114:astore_0        
		break MISSING_BLOCK_LABEL_139;
	//   68  115:goto            137
		s;
	//   69  118:astore_0        
		((NoSuchAlgorithmException) (s)).printStackTrace();
	//   70  119:aload_0         
	//   71  120:invokevirtual   #308 <Method void NoSuchAlgorithmException.printStackTrace()>
		logMessage(((String) (null)), 3, "Could not create hash value");
	//   72  123:aconst_null     
	//   73  124:iconst_3        
	//   74  125:ldc2            #310 <String "Could not create hash value">
	//   75  128:invokestatic    #314 <Method void logMessage(String, int, String)>
		com/appscend/mraid/MadvertiseUtil;
	//   76  131:ldc1            #2   <Class MadvertiseUtil>
		JVM INSTR monitorexit ;
	//   77  133:monitorexit     
		return "";
	//   78  134:ldc1            #139 <String "">
	//   79  136:areturn         
	//*  80  137:ldc1            #2   <Class MadvertiseUtil>
		throw s;
	//   81  139:monitorexit     
	//   82  140:aload_0         
	//   83  141:athrow          
	}

	public static String getHashedAndroidID(Context context, HashType hashtype)
	{
		context = ((Context) (android.provider.Settings.Secure.getString(context.getApplicationContext().getContentResolver(), "android_id")));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #320 <Method Context Context.getApplicationContext()>
	//    2    4:invokevirtual   #324 <Method android.content.ContentResolver Context.getContentResolver()>
	//    3    7:ldc2            #326 <String "android_id">
	//    4   10:invokestatic    #332 <Method String android.provider.Settings$Secure.getString(android.content.ContentResolver, String)>
	//    5   13:astore_0        
		if(context == null)
	//*   6   14:aload_0         
	//*   7   15:ifnonnull       21
			return "";
	//    8   18:ldc1            #139 <String "">
	//    9   20:areturn         
		else
			return getHash(((String) (context)), hashtype);
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:invokestatic    #334 <Method String getHash(String, MadvertiseUtil$HashType)>
	//   13   26:areturn         
	}

	public static String getHashedMacAddress(Context context, HashType hashtype)
	{
		if(checkPermissionGranted("android.permission.ACCESS_WIFI_STATE", context))
	//*   0    0:ldc2            #337 <String "android.permission.ACCESS_WIFI_STATE">
	//*   1    3:aload_0         
	//*   2    4:invokestatic    #339 <Method boolean checkPermissionGranted(String, Context)>
	//*   3    7:ifeq            30
			context = ((Context) (((WifiManager)context.getSystemService("wifi")).getConnectionInfo().getMacAddress()));
	//    4   10:aload_0         
	//    5   11:ldc2            #341 <String "wifi">
	//    6   14:invokevirtual   #345 <Method Object Context.getSystemService(String)>
	//    7   17:checkcast       #347 <Class WifiManager>
	//    8   20:invokevirtual   #351 <Method WifiInfo WifiManager.getConnectionInfo()>
	//    9   23:invokevirtual   #356 <Method String WifiInfo.getMacAddress()>
	//   10   26:astore_0        
		else
	//*  11   27:goto            32
			context = null;
	//   12   30:aconst_null     
	//   13   31:astore_0        
		if(context == null)
	//*  14   32:aload_0         
	//*  15   33:ifnonnull       39
			return "";
	//   16   36:ldc1            #139 <String "">
	//   17   38:areturn         
		else
			return getHash(((String) (context)), hashtype);
	//   18   39:aload_0         
	//   19   40:aload_1         
	//   20   41:invokestatic    #334 <Method String getHash(String, MadvertiseUtil$HashType)>
	//   21   44:areturn         
	}

	private static ArrayList getInstalledApps(boolean flag, Context context)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #360 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #361 <Method void ArrayList()>
	//    3    7:astore_3        
		Object obj = ((Object) (context.getPackageManager()));
	//    4    8:aload_1         
	//    5    9:invokevirtual   #159 <Method PackageManager Context.getPackageManager()>
	//    6   12:astore          4
		int i = 0;
	//    7   14:iconst_0        
	//    8   15:istore_2        
		for(obj = ((Object) (((PackageManager) (obj)).getInstalledPackages(0))); i < ((List) (obj)).size(); i++)
	//*   9   16:aload           4
	//*  10   18:iconst_0        
	//*  11   19:invokevirtual   #365 <Method List PackageManager.getInstalledPackages(int)>
	//*  12   22:astore          4
	//*  13   24:iload_2         
	//*  14   25:aload           4
	//*  15   27:invokeinterface #178 <Method int List.size()>
	//*  16   32:icmpge          160
		{
			PackageInfo packageinfo = (PackageInfo)((List) (obj)).get(i);
	//   17   35:aload           4
	//   18   37:iload_2         
	//   19   38:invokeinterface #369 <Method Object List.get(int)>
	//   20   43:checkcast       #264 <Class PackageInfo>
	//   21   46:astore          5
			if(flag || packageinfo.versionName != null)
	//*  22   48:iload_0         
	//*  23   49:ifne            63
	//*  24   52:aload           5
	//*  25   54:getfield        #267 <Field String PackageInfo.versionName>
	//*  26   57:ifnonnull       63
	//*  27   60:goto            153
			{
				PInfo pinfo = new PInfo();
	//   28   63:new             #14  <Class MadvertiseUtil$PInfo>
	//   29   66:dup             
	//   30   67:invokespecial   #370 <Method void MadvertiseUtil$PInfo()>
	//   31   70:astore          6
				pinfo.appname = packageinfo.applicationInfo.loadLabel(context.getPackageManager()).toString();
	//   32   72:aload           6
	//   33   74:aload           5
	//   34   76:getfield        #374 <Field ApplicationInfo PackageInfo.applicationInfo>
	//   35   79:aload_1         
	//   36   80:invokevirtual   #159 <Method PackageManager Context.getPackageManager()>
	//   37   83:invokevirtual   #380 <Method CharSequence ApplicationInfo.loadLabel(PackageManager)>
	//   38   86:invokeinterface #256 <Method String CharSequence.toString()>
	//   39   91:invokestatic    #384 <Method String MadvertiseUtil$PInfo.access$302(MadvertiseUtil$PInfo, String)>
	//   40   94:pop             
				pinfo.pname = packageinfo.packageName;
	//   41   95:aload           6
	//   42   97:aload           5
	//   43   99:getfield        #387 <Field String PackageInfo.packageName>
	//   44  102:invokestatic    #390 <Method String MadvertiseUtil$PInfo.access$402(MadvertiseUtil$PInfo, String)>
	//   45  105:pop             
				pinfo.versionName = packageinfo.versionName;
	//   46  106:aload           6
	//   47  108:aload           5
	//   48  110:getfield        #267 <Field String PackageInfo.versionName>
	//   49  113:invokestatic    #393 <Method String MadvertiseUtil$PInfo.access$502(MadvertiseUtil$PInfo, String)>
	//   50  116:pop             
				pinfo.versionCode = packageinfo.versionCode;
	//   51  117:aload           6
	//   52  119:aload           5
	//   53  121:getfield        #396 <Field int PackageInfo.versionCode>
	//   54  124:invokestatic    #400 <Method int MadvertiseUtil$PInfo.access$602(MadvertiseUtil$PInfo, int)>
	//   55  127:pop             
				pinfo.icon = packageinfo.applicationInfo.loadIcon(context.getPackageManager());
	//   56  128:aload           6
	//   57  130:aload           5
	//   58  132:getfield        #374 <Field ApplicationInfo PackageInfo.applicationInfo>
	//   59  135:aload_1         
	//   60  136:invokevirtual   #159 <Method PackageManager Context.getPackageManager()>
	//   61  139:invokevirtual   #404 <Method Drawable ApplicationInfo.loadIcon(PackageManager)>
	//   62  142:invokestatic    #408 <Method Drawable MadvertiseUtil$PInfo.access$702(MadvertiseUtil$PInfo, Drawable)>
	//   63  145:pop             
				arraylist.add(((Object) (pinfo)));
	//   64  146:aload_3         
	//   65  147:aload           6
	//   66  149:invokevirtual   #411 <Method boolean ArrayList.add(Object)>
	//   67  152:pop             
			}
		}

	//   68  153:iload_2         
	//   69  154:iconst_1        
	//   70  155:iadd            
	//   71  156:istore_2        
	//*  72  157:goto            24
		return arraylist;
	//   73  160:aload_3         
	//   74  161:areturn         
	}

	public static JSONArray getJSONArray(JSONObject jsonobject, String s)
		throws JSONException
	{
		checkEmptyJson(jsonobject, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #417 <Method void checkEmptyJson(JSONObject, String)>
		if(jsonobject.has(s))
	//*   3    5:aload_0         
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #423 <Method boolean JSONObject.has(String)>
	//*   6   10:ifeq            19
			return jsonobject.getJSONArray(s);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #426 <Method JSONArray JSONObject.getJSONArray(String)>
	//   10   18:areturn         
		else
			return new JSONArray();
	//   11   19:new             #428 <Class JSONArray>
	//   12   22:dup             
	//   13   23:invokespecial   #429 <Method void JSONArray()>
	//   14   26:areturn         
	}

	public static boolean getJSONBoolean(JSONObject jsonobject, String s)
		throws JSONException
	{
		checkEmptyJson(jsonobject, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #417 <Method void checkEmptyJson(JSONObject, String)>
		if(jsonobject.has(s))
	//*   3    5:aload_0         
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #423 <Method boolean JSONObject.has(String)>
	//*   6   10:ifeq            19
			return jsonobject.getBoolean(s);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #434 <Method boolean JSONObject.getBoolean(String)>
	//   10   18:ireturn         
		else
			return false;
	//   11   19:iconst_0        
	//   12   20:ireturn         
	}

	public static JSONObject getJSONObject(JSONObject jsonobject, String s)
		throws JSONException
	{
		checkEmptyJson(jsonobject, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #417 <Method void checkEmptyJson(JSONObject, String)>
		if(jsonobject.has(s))
	//*   3    5:aload_0         
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #423 <Method boolean JSONObject.has(String)>
	//*   6   10:ifeq            19
			return jsonobject.getJSONObject(s);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #439 <Method JSONObject JSONObject.getJSONObject(String)>
	//   10   18:areturn         
		else
			return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
	}

	public static String getJSONValue(JSONObject jsonobject, String s)
		throws JSONException
	{
		checkEmptyJson(jsonobject, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #417 <Method void checkEmptyJson(JSONObject, String)>
		if(jsonobject.has(s))
	//*   3    5:aload_0         
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #423 <Method boolean JSONObject.has(String)>
	//*   6   10:ifeq            19
			return jsonobject.getString(s);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #444 <Method String JSONObject.getString(String)>
	//   10   18:areturn         
		else
			return "";
	//   11   19:ldc1            #139 <String "">
	//   12   21:areturn         
	}

	public static String getLocalIpAddress(MadvertiseView.MadvertiseViewCallbackListener madvertiseviewcallbacklistener)
	{
		Object obj = ((Object) (NetworkInterface.getNetworkInterfaces()));
	//    0    0:invokestatic    #454 <Method Enumeration NetworkInterface.getNetworkInterfaces()>
	//    1    3:astore_1        
_L2:
		Enumeration enumeration;
		if(!((Enumeration) (obj)).hasMoreElements())
			break MISSING_BLOCK_LABEL_85;
	//    2    4:aload_1         
	//    3    5:invokeinterface #460 <Method boolean Enumeration.hasMoreElements()>
	//    4   10:ifeq            85
		enumeration = ((NetworkInterface)((Enumeration) (obj)).nextElement()).getInetAddresses();
	//    5   13:aload_1         
	//    6   14:invokeinterface #464 <Method Object Enumeration.nextElement()>
	//    7   19:checkcast       #450 <Class NetworkInterface>
	//    8   22:invokevirtual   #467 <Method Enumeration NetworkInterface.getInetAddresses()>
	//    9   25:astore_2        
_L4:
		if(!enumeration.hasMoreElements()) goto _L2; else goto _L1
	//   10   26:aload_2         
	//   11   27:invokeinterface #460 <Method boolean Enumeration.hasMoreElements()>
	//   12   32:ifeq            4
_L1:
		InetAddress inetaddress = (InetAddress)enumeration.nextElement();
	//   13   35:aload_2         
	//   14   36:invokeinterface #464 <Method Object Enumeration.nextElement()>
	//   15   41:checkcast       #469 <Class InetAddress>
	//   16   44:astore_3        
		if(inetaddress.isLoopbackAddress() || !(inetaddress instanceof Inet4Address)) goto _L4; else goto _L3
	//   17   45:aload_3         
	//   18   46:invokevirtual   #472 <Method boolean InetAddress.isLoopbackAddress()>
	//   19   49:ifne            26
	//   20   52:aload_3         
	//   21   53:instanceof      #474 <Class Inet4Address>
	//   22   56:ifeq            26
_L3:
		obj = ((Object) (inetaddress.getHostAddress().toString()));
	//   23   59:aload_3         
	//   24   60:invokevirtual   #477 <Method String InetAddress.getHostAddress()>
	//   25   63:invokevirtual   #478 <Method String String.toString()>
	//   26   66:astore_1        
		return ((String) (obj));
	//   27   67:aload_1         
	//   28   68:areturn         
		SocketException socketexception;
		socketexception;
	//   29   69:astore_1        
		if(madvertiseviewcallbacklistener != null)
	//*  30   70:aload_0         
	//*  31   71:ifnull          81
			madvertiseviewcallbacklistener.onError(((Exception) (socketexception)));
	//   32   74:aload_0         
	//   33   75:aload_1         
	//   34   76:invokeinterface #484 <Method void MadvertiseView$MadvertiseViewCallbackListener.onError(Exception)>
		socketexception.printStackTrace();
	//   35   81:aload_1         
	//   36   82:invokevirtual   #485 <Method void SocketException.printStackTrace()>
		if(madvertiseviewcallbacklistener != null)
	//*  37   85:aload_0         
	//*  38   86:ifnull          105
			madvertiseviewcallbacklistener.onError(((Exception) (new IllegalArgumentException("Couldn't obtain the local ip address"))));
	//   39   89:aload_0         
	//   40   90:new             #487 <Class IllegalArgumentException>
	//   41   93:dup             
	//   42   94:ldc2            #489 <String "Couldn't obtain the local ip address">
	//   43   97:invokespecial   #490 <Method void IllegalArgumentException(String)>
	//   44  100:invokeinterface #484 <Method void MadvertiseView$MadvertiseViewCallbackListener.onError(Exception)>
		return "";
	//   45  105:ldc1            #139 <String "">
	//   46  107:areturn         
	}

	public static Location getLocation()
	{
		return sCurrentLocation;
	//    0    0:getstatic       #129 <Field Location sCurrentLocation>
	//    1    3:areturn         
	}

	public static ArrayList getPackages(Context context)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		context = ((Context) (getInstalledApps(false, context)));
	//    2    2:iconst_0        
	//    3    3:aload_0         
	//    4    4:invokestatic    #496 <Method ArrayList getInstalledApps(boolean, Context)>
	//    5    7:astore_0        
		for(int j = ((ArrayList) (context)).size(); i < j; i++)
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #497 <Method int ArrayList.size()>
	//*   8   12:istore_2        
	//*   9   13:iload_1         
	//*  10   14:iload_2         
	//*  11   15:icmpge          36
			((PInfo)((ArrayList) (context)).get(i)).prettyPrint();
	//   12   18:aload_0         
	//   13   19:iload_1         
	//   14   20:invokevirtual   #498 <Method Object ArrayList.get(int)>
	//   15   23:checkcast       #14  <Class MadvertiseUtil$PInfo>
	//   16   26:invokestatic    #502 <Method void MadvertiseUtil$PInfo.access$200(MadvertiseUtil$PInfo)>

	//   17   29:iload_1         
	//   18   30:iconst_1        
	//   19   31:iadd            
	//   20   32:istore_1        
	//*  21   33:goto            13
		return ((ArrayList) (context));
	//   22   36:aload_0         
	//   23   37:areturn         
	}

	public static String getToken(Context context, MadvertiseView.MadvertiseViewCallbackListener madvertiseviewcallbacklistener)
	{
		PackageManager packagemanager = context.getPackageManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #159 <Method PackageManager Context.getPackageManager()>
	//    2    4:astore_2        
		try
		{
			context = ((Context) (packagemanager.getApplicationInfo(context.getPackageName(), 128).metaData.getString("madvertise_site_token")));
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #245 <Method String Context.getPackageName()>
	//    6   10:sipush          128
	//    7   13:invokevirtual   #249 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//    8   16:getfield        #511 <Field Bundle ApplicationInfo.metaData>
	//    9   19:ldc1            #88  <String "madvertise_site_token">
	//   10   21:invokevirtual   #514 <Method String Bundle.getString(String)>
	//   11   24:astore_0        
		}
	//*  12   25:goto            35
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  13   28:astore_0        
		{
			((Exception) (context)).printStackTrace();
	//   14   29:aload_0         
	//   15   30:invokevirtual   #515 <Method void Exception.printStackTrace()>
			context = null;
	//   16   33:aconst_null     
	//   17   34:astore_0        
		}
		if(context == null)
	//*  18   35:aload_0         
	//*  19   36:ifnonnull       67
		{
			logMessage(((String) (null)), 3, "Could not fetch \"madvertise_site_token\" from AndroidManifest.xml");
	//   20   39:aconst_null     
	//   21   40:iconst_3        
	//   22   41:ldc2            #517 <String "Could not fetch \"madvertise_site_token\" from AndroidManifest.xml">
	//   23   44:invokestatic    #314 <Method void logMessage(String, int, String)>
			if(madvertiseviewcallbacklistener != null)
	//*  24   47:aload_1         
	//*  25   48:ifnull          67
				madvertiseviewcallbacklistener.onError(((Exception) (new IllegalArgumentException("Could not fetch \"madvertise_site_token\" from AndroidManifest.xml"))));
	//   26   51:aload_1         
	//   27   52:new             #487 <Class IllegalArgumentException>
	//   28   55:dup             
	//   29   56:ldc2            #517 <String "Could not fetch \"madvertise_site_token\" from AndroidManifest.xml">
	//   30   59:invokespecial   #490 <Method void IllegalArgumentException(String)>
	//   31   62:invokeinterface #484 <Method void MadvertiseView$MadvertiseViewCallbackListener.onError(Exception)>
		}
		return ((String) (context));
	//   32   67:aload_0         
	//   33   68:areturn         
	}

	public static String getUA()
	{
		Object obj = ((Object) (sUA));
	//    0    0:getstatic       #520 <Field String sUA>
	//    1    3:astore_0        
		if(obj != null)
	//*   2    4:aload_0         
	//*   3    5:ifnull          10
			return ((String) (obj));
	//    4    8:aload_0         
	//    5    9:areturn         
		obj = ((Object) (new StringBuffer()));
	//    6   10:new             #291 <Class StringBuffer>
	//    7   13:dup             
	//    8   14:invokespecial   #292 <Method void StringBuffer()>
	//    9   17:astore_0        
		Object obj1 = ((Object) (android.os.Build.VERSION.RELEASE));
	//   10   18:getstatic       #525 <Field String android.os.Build$VERSION.RELEASE>
	//   11   21:astore_1        
		if(((String) (obj1)).length() > 0)
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #301 <Method int String.length()>
	//*  14   26:ifle            38
			((StringBuffer) (obj)).append(((String) (obj1)));
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #306 <Method StringBuffer StringBuffer.append(String)>
	//   18   34:pop             
		else
	//*  19   35:goto            46
			((StringBuffer) (obj)).append("1.0");
	//   20   38:aload_0         
	//   21   39:ldc2            #527 <String "1.0">
	//   22   42:invokevirtual   #306 <Method StringBuffer StringBuffer.append(String)>
	//   23   45:pop             
		((StringBuffer) (obj)).append("; ");
	//   24   46:aload_0         
	//   25   47:ldc2            #529 <String "; ">
	//   26   50:invokevirtual   #306 <Method StringBuffer StringBuffer.append(String)>
	//   27   53:pop             
		obj1 = ((Object) (Locale.getDefault()));
	//   28   54:invokestatic    #535 <Method Locale Locale.getDefault()>
	//   29   57:astore_1        
		String s = ((Locale) (obj1)).getLanguage();
	//   30   58:aload_1         
	//   31   59:invokevirtual   #538 <Method String Locale.getLanguage()>
	//   32   62:astore_2        
		if(s != null)
	//*  33   63:aload_2         
	//*  34   64:ifnull          105
		{
			((StringBuffer) (obj)).append(s.toLowerCase());
	//   35   67:aload_0         
	//   36   68:aload_2         
	//   37   69:invokevirtual   #541 <Method String String.toLowerCase()>
	//   38   72:invokevirtual   #306 <Method StringBuffer StringBuffer.append(String)>
	//   39   75:pop             
			obj1 = ((Object) (((Locale) (obj1)).getCountry()));
	//   40   76:aload_1         
	//   41   77:invokevirtual   #544 <Method String Locale.getCountry()>
	//   42   80:astore_1        
			if(obj1 != null)
	//*  43   81:aload_1         
	//*  44   82:ifnull          113
			{
				((StringBuffer) (obj)).append("-");
	//   45   85:aload_0         
	//   46   86:ldc2            #546 <String "-">
	//   47   89:invokevirtual   #306 <Method StringBuffer StringBuffer.append(String)>
	//   48   92:pop             
				((StringBuffer) (obj)).append(((String) (obj1)).toLowerCase());
	//   49   93:aload_0         
	//   50   94:aload_1         
	//   51   95:invokevirtual   #541 <Method String String.toLowerCase()>
	//   52   98:invokevirtual   #306 <Method StringBuffer StringBuffer.append(String)>
	//   53  101:pop             
			}
		} else
	//*  54  102:goto            113
		{
			((StringBuffer) (obj)).append("de");
	//   55  105:aload_0         
	//   56  106:ldc2            #548 <String "de">
	//   57  109:invokevirtual   #306 <Method StringBuffer StringBuffer.append(String)>
	//   58  112:pop             
		}
		obj1 = ((Object) (Build.MODEL));
	//   59  113:getstatic       #553 <Field String Build.MODEL>
	//   60  116:astore_1        
		if(((String) (obj1)).length() > 0)
	//*  61  117:aload_1         
	//*  62  118:invokevirtual   #301 <Method int String.length()>
	//*  63  121:ifle            138
		{
			((StringBuffer) (obj)).append("; ");
	//   64  124:aload_0         
	//   65  125:ldc2            #529 <String "; ">
	//   66  128:invokevirtual   #306 <Method StringBuffer StringBuffer.append(String)>
	//   67  131:pop             
			((StringBuffer) (obj)).append(((String) (obj1)));
	//   68  132:aload_0         
	//   69  133:aload_1         
	//   70  134:invokevirtual   #306 <Method StringBuffer StringBuffer.append(String)>
	//   71  137:pop             
		}
		obj1 = ((Object) (Build.ID));
	//   72  138:getstatic       #556 <Field String Build.ID>
	//   73  141:astore_1        
		if(((String) (obj1)).length() > 0)
	//*  74  142:aload_1         
	//*  75  143:invokevirtual   #301 <Method int String.length()>
	//*  76  146:ifle            163
		{
			((StringBuffer) (obj)).append(" Build/");
	//   77  149:aload_0         
	//   78  150:ldc2            #558 <String " Build/">
	//   79  153:invokevirtual   #306 <Method StringBuffer StringBuffer.append(String)>
	//   80  156:pop             
			((StringBuffer) (obj)).append(((String) (obj1)));
	//   81  157:aload_0         
	//   82  158:aload_1         
	//   83  159:invokevirtual   #306 <Method StringBuffer StringBuffer.append(String)>
	//   84  162:pop             
		}
		sUA = String.format("Mozilla/5.0 (Linux; U; Android %s) AppleWebKit/525.10+ (KHTML, like Gecko) Version/3.0.4 Mobile Safari/523.12.2", new Object[] {
			obj
		});
	//   85  163:ldc2            #560 <String "Mozilla/5.0 (Linux; U; Android %s) AppleWebKit/525.10+ (KHTML, like Gecko) Version/3.0.4 Mobile Safari/523.12.2">
	//   86  166:iconst_1        
	//   87  167:anewarray       Object[]
	//   88  170:dup             
	//   89  171:iconst_0        
	//   90  172:aload_0         
	//   91  173:aastore         
	//   92  174:invokestatic    #564 <Method String String.format(String, Object[])>
	//   93  177:putstatic       #520 <Field String sUA>
		return sUA;
	//   94  180:getstatic       #520 <Field String sUA>
	//   95  183:areturn         
	}

	public static boolean isConnectionAvailable()
	{
		boolean flag;
		try
		{
			_cls1NetworkCheckTask _lcls1networkchecktask = new _cls1NetworkCheckTask();
	//    0    0:new             #8   <Class MadvertiseUtil$1NetworkCheckTask>
	//    1    3:dup             
	//    2    4:invokespecial   #566 <Method void MadvertiseUtil$1NetworkCheckTask()>
	//    3    7:astore_1        
			_lcls1networkchecktask.execute(((Object []) (new Void[0])));
	//    4    8:aload_1         
	//    5    9:iconst_0        
	//    6   10:anewarray       Void[]
	//    7   13:invokevirtual   #572 <Method AsyncTask MadvertiseUtil$1NetworkCheckTask.execute(Object[])>
	//    8   16:pop             
			flag = ((Boolean)_lcls1networkchecktask.get()).booleanValue();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #574 <Method Object MadvertiseUtil$1NetworkCheckTask.get()>
	//   11   21:checkcast       #576 <Class Boolean>
	//   12   24:invokevirtual   #579 <Method boolean Boolean.booleanValue()>
	//   13   27:istore_0        
		}
	//*  14   28:iload_0         
	//*  15   29:ireturn         
		catch(Exception exception)
	//*  16   30:astore_1        
		{
			return false;
	//   17   31:iconst_0        
	//   18   32:ireturn         
		}
		return flag;
	}

	public static void logMessage(String s, int i, String s1)
	{
		logMessage(s, i, s1, ((Throwable) (null)), Thread.currentThread().getStackTrace()[3]);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokestatic    #585 <Method Thread Thread.currentThread()>
	//    5    7:invokevirtual   #589 <Method StackTraceElement[] Thread.getStackTrace()>
	//    6   10:iconst_3        
	//    7   11:aaload          
	//    8   12:invokestatic    #592 <Method void logMessage(String, int, String, Throwable, StackTraceElement)>
	//    9   15:return          
	}

	public static void logMessage(String s, int i, String s1, Throwable throwable)
	{
		logMessage(s, i, s1, throwable, Thread.currentThread().getStackTrace()[3]);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #585 <Method Thread Thread.currentThread()>
	//    5    7:invokevirtual   #589 <Method StackTraceElement[] Thread.getStackTrace()>
	//    6   10:iconst_3        
	//    7   11:aaload          
	//    8   12:invokestatic    #592 <Method void logMessage(String, int, String, Throwable, StackTraceElement)>
	//    9   15:return          
	}

	static void logMessage(String s, int i, String s1, Throwable throwable, StackTraceElement stacktraceelement)
	{
		String s2 = s;
	//    0    0:aload_0         
	//    1    1:astore          6
		if(s == null)
	//*   2    3:aload_0         
	//*   3    4:ifnonnull       11
			s2 = "MAD_LOG";
	//    4    7:ldc1            #85  <String "MAD_LOG">
	//    5    9:astore          6
		s = s1;
	//    6   11:aload_2         
	//    7   12:astore_0        
		if(s1 == null)
	//*   8   13:aload_2         
	//*   9   14:ifnonnull       20
			s = "";
	//   10   17:ldc1            #139 <String "">
	//   11   19:astore_0        
		s1 = stacktraceelement.getClassName();
	//   12   20:aload           4
	//   13   22:invokevirtual   #598 <Method String StackTraceElement.getClassName()>
	//   14   25:astore_2        
		s1 = s1.substring(s1.lastIndexOf(".") + 1);
	//   15   26:aload_2         
	//   16   27:aload_2         
	//   17   28:ldc2            #600 <String ".">
	//   18   31:invokevirtual   #603 <Method int String.lastIndexOf(String)>
	//   19   34:iconst_1        
	//   20   35:iadd            
	//   21   36:invokevirtual   #606 <Method String String.substring(int)>
	//   22   39:astore_2        
		int j = stacktraceelement.getLineNumber();
	//   23   40:aload           4
	//   24   42:invokevirtual   #609 <Method int StackTraceElement.getLineNumber()>
	//   25   45:istore          5
		stacktraceelement = ((StackTraceElement) (new StringBuilder()));
	//   26   47:new             #200 <Class StringBuilder>
	//   27   50:dup             
	//   28   51:invokespecial   #201 <Method void StringBuilder()>
	//   29   54:astore          4
		((StringBuilder) (stacktraceelement)).append("(");
	//   30   56:aload           4
	//   31   58:ldc2            #611 <String "(">
	//   32   61:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   33   64:pop             
		((StringBuilder) (stacktraceelement)).append(s1);
	//   34   65:aload           4
	//   35   67:aload_2         
	//   36   68:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   37   71:pop             
		((StringBuilder) (stacktraceelement)).append(":");
	//   38   72:aload           4
	//   39   74:ldc2            #613 <String ":">
	//   40   77:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   41   80:pop             
		((StringBuilder) (stacktraceelement)).append(j);
	//   42   81:aload           4
	//   43   83:iload           5
	//   44   85:invokevirtual   #616 <Method StringBuilder StringBuilder.append(int)>
	//   45   88:pop             
		((StringBuilder) (stacktraceelement)).append(") : ");
	//   46   89:aload           4
	//   47   91:ldc2            #618 <String ") : ">
	//   48   94:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   49   97:pop             
		((StringBuilder) (stacktraceelement)).append(s);
	//   50   98:aload           4
	//   51  100:aload_0         
	//   52  101:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   53  104:pop             
		s1 = ((StringBuilder) (stacktraceelement)).toString();
	//   54  105:aload           4
	//   55  107:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   56  110:astore_2        
		s = s1;
	//   57  111:aload_2         
	//   58  112:astore_0        
		if(throwable != null)
	//*  59  113:aload_3         
	//*  60  114:ifnull          152
		{
			s = ((String) (new StringBuilder()));
	//   61  117:new             #200 <Class StringBuilder>
	//   62  120:dup             
	//   63  121:invokespecial   #201 <Method void StringBuilder()>
	//   64  124:astore_0        
			((StringBuilder) (s)).append(s1);
	//   65  125:aload_0         
	//   66  126:aload_2         
	//   67  127:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   68  130:pop             
			((StringBuilder) (s)).append('\n');
	//   69  131:aload_0         
	//   70  132:bipush          10
	//   71  134:invokevirtual   #621 <Method StringBuilder StringBuilder.append(char)>
	//   72  137:pop             
			((StringBuilder) (s)).append(Log.getStackTraceString(throwable));
	//   73  138:aload_0         
	//   74  139:aload_3         
	//   75  140:invokestatic    #627 <Method String Log.getStackTraceString(Throwable)>
	//   76  143:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   77  146:pop             
			s = ((StringBuilder) (s)).toString();
	//   78  147:aload_0         
	//   79  148:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   80  151:astore_0        
		}
		Log.println(i, s2, s);
	//   81  152:iload_1         
	//   82  153:aload           6
	//   83  155:aload_0         
	//   84  156:invokestatic    #631 <Method int Log.println(int, String, String)>
	//   85  159:pop             
	//   86  160:return          
	}

	public static String printRequestParameters(List list)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #200 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #201 <Method void StringBuilder()>
	//    3    7:astore_1        
		StringBuilder stringbuilder1;
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); stringbuilder.append(stringbuilder1.toString()))
	//*   4    8:aload_0         
	//*   5    9:invokeinterface #637 <Method Iterator List.iterator()>
	//*   6   14:astore_0        
	//*   7   15:aload_0         
	//*   8   16:invokeinterface #642 <Method boolean Iterator.hasNext()>
	//*   9   21:ifeq            91
		{
			NameValuePair namevaluepair = (NameValuePair)((Iterator) (list)).next();
	//   10   24:aload_0         
	//   11   25:invokeinterface #645 <Method Object Iterator.next()>
	//   12   30:checkcast       #647 <Class NameValuePair>
	//   13   33:astore_2        
			stringbuilder1 = new StringBuilder();
	//   14   34:new             #200 <Class StringBuilder>
	//   15   37:dup             
	//   16   38:invokespecial   #201 <Method void StringBuilder()>
	//   17   41:astore_3        
			stringbuilder1.append(namevaluepair.getName());
	//   18   42:aload_3         
	//   19   43:aload_2         
	//   20   44:invokeinterface #648 <Method String NameValuePair.getName()>
	//   21   49:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   22   52:pop             
			stringbuilder1.append("=");
	//   23   53:aload_3         
	//   24   54:ldc2            #650 <String "=">
	//   25   57:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   26   60:pop             
			stringbuilder1.append(namevaluepair.getValue());
	//   27   61:aload_3         
	//   28   62:aload_2         
	//   29   63:invokeinterface #651 <Method String NameValuePair.getValue()>
	//   30   68:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   31   71:pop             
			stringbuilder1.append("\n");
	//   32   72:aload_3         
	//   33   73:ldc1            #211 <String "\n">
	//   34   75:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   35   78:pop             
		}

	//   36   79:aload_1         
	//   37   80:aload_3         
	//   38   81:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   39   84:invokevirtual   #209 <Method StringBuilder StringBuilder.append(String)>
	//   40   87:pop             
	//*  41   88:goto            15
		return stringbuilder.toString();
	//   42   91:aload_1         
	//   43   92:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   44   95:areturn         
	}

	public static void refreshCoordinates(Context context)
	{
		logMessage(((String) (null)), 3, "Trying to veeplay_refresh location");
	//    0    0:aconst_null     
	//    1    1:iconst_3        
	//    2    2:ldc2            #656 <String "Trying to veeplay_refresh location">
	//    3    5:invokestatic    #314 <Method void logMessage(String, int, String)>
		if(context == null)
	//*   4    8:aload_0         
	//*   5    9:ifnonnull       21
		{
			logMessage(((String) (null)), 3, "Context not set - quit location veeplay_refresh");
	//    6   12:aconst_null     
	//    7   13:iconst_3        
	//    8   14:ldc2            #658 <String "Context not set - quit location veeplay_refresh">
	//    9   17:invokestatic    #314 <Method void logMessage(String, int, String)>
			return;
	//   10   20:return          
		}
		if(sLocationUpdateTimestamp + 0xdbba0L > System.currentTimeMillis())
	//*  11   21:getstatic       #133 <Field long sLocationUpdateTimestamp>
	//*  12   24:ldc2w           #659 <Long 0xdbba0L>
	//*  13   27:ladd            
	//*  14   28:invokestatic    #666 <Method long System.currentTimeMillis()>
	//*  15   31:lcmp            
	//*  16   32:ifle            44
		{
			logMessage(((String) (null)), 3, "It's not time yet for refreshing the location");
	//   17   35:aconst_null     
	//   18   36:iconst_3        
	//   19   37:ldc2            #668 <String "It's not time yet for refreshing the location">
	//   20   40:invokestatic    #314 <Method void logMessage(String, int, String)>
			return;
	//   21   43:return          
		}
		context;
	//   22   44:aload_0         
		JVM INSTR monitorenter ;
	//   23   45:monitorenter    
		if(sLocationUpdateTimestamp + 0xdbba0L <= System.currentTimeMillis())
			break MISSING_BLOCK_LABEL_71;
	//   24   46:getstatic       #133 <Field long sLocationUpdateTimestamp>
	//   25   49:ldc2w           #659 <Long 0xdbba0L>
	//   26   52:ladd            
	//   27   53:invokestatic    #666 <Method long System.currentTimeMillis()>
	//   28   56:lcmp            
	//   29   57:ifle            71
		logMessage(((String) (null)), 3, "Another thread updated the loation already");
	//   30   60:aconst_null     
	//   31   61:iconst_3        
	//   32   62:ldc2            #670 <String "Another thread updated the loation already">
	//   33   65:invokestatic    #314 <Method void logMessage(String, int, String)>
		context;
	//   34   68:aload_0         
		JVM INSTR monitorexit ;
	//   35   69:monitorexit     
		return;
	//   36   70:return          
		boolean flag;
		boolean flag1;
		flag = checkPermissionGranted("android.permission.ACCESS_COARSE_LOCATION", context);
	//   37   71:ldc2            #672 <String "android.permission.ACCESS_COARSE_LOCATION">
	//   38   74:aload_0         
	//   39   75:invokestatic    #339 <Method boolean checkPermissionGranted(String, Context)>
	//   40   78:istore_1        
		flag1 = checkPermissionGranted("android.permission.ACCESS_FINE_LOCATION", context);
	//   41   79:ldc2            #674 <String "android.permission.ACCESS_FINE_LOCATION">
	//   42   82:aload_0         
	//   43   83:invokestatic    #339 <Method boolean checkPermissionGranted(String, Context)>
	//   44   86:istore_2        
		if(flag || flag1)
			break MISSING_BLOCK_LABEL_106;
	//   45   87:iload_1         
	//   46   88:ifne            106
	//   47   91:iload_2         
	//   48   92:ifne            106
		logMessage(((String) (null)), 3, "No permissions for requesting the location");
	//   49   95:aconst_null     
	//   50   96:iconst_3        
	//   51   97:ldc2            #676 <String "No permissions for requesting the location">
	//   52  100:invokestatic    #314 <Method void logMessage(String, int, String)>
		context;
	//   53  103:aload_0         
		JVM INSTR monitorexit ;
	//   54  104:monitorexit     
		return;
	//   55  105:return          
		LocationManager locationmanager = (LocationManager)context.getSystemService("location");
	//   56  106:aload_0         
	//   57  107:ldc2            #678 <String "location">
	//   58  110:invokevirtual   #345 <Method Object Context.getSystemService(String)>
	//   59  113:checkcast       #680 <Class LocationManager>
	//   60  116:astore          4
		if(locationmanager != null)
			break MISSING_BLOCK_LABEL_134;
	//   61  118:aload           4
	//   62  120:ifnonnull       134
		logMessage(((String) (null)), 3, "Unable to fetch a location manger");
	//   63  123:aconst_null     
	//   64  124:iconst_3        
	//   65  125:ldc2            #682 <String "Unable to fetch a location manger">
	//   66  128:invokestatic    #314 <Method void logMessage(String, int, String)>
		context;
	//   67  131:aload_0         
		JVM INSTR monitorexit ;
	//   68  132:monitorexit     
		return;
	//   69  133:return          
		Criteria criteria;
		criteria = new Criteria();
	//   70  134:new             #684 <Class Criteria>
	//   71  137:dup             
	//   72  138:invokespecial   #685 <Method void Criteria()>
	//   73  141:astore          5
		criteria.setCostAllowed(false);
	//   74  143:aload           5
	//   75  145:iconst_0        
	//   76  146:invokevirtual   #689 <Method void Criteria.setCostAllowed(boolean)>
		if(!flag) goto _L2; else goto _L1
	//   77  149:iload_1         
	//   78  150:ifeq            247
_L1:
		Object obj;
		criteria.setAccuracy(2);
	//   79  153:aload           5
	//   80  155:iconst_2        
	//   81  156:invokevirtual   #693 <Method void Criteria.setAccuracy(int)>
		obj = ((Object) (locationmanager.getBestProvider(criteria, true)));
	//   82  159:aload           4
	//   83  161:aload           5
	//   84  163:iconst_1        
	//   85  164:invokevirtual   #697 <Method String LocationManager.getBestProvider(Criteria, boolean)>
	//   86  167:astore_3        
	//*  87  168:goto            171
_L4:
		if(obj != null || !flag1)
			break MISSING_BLOCK_LABEL_197;
	//   88  171:aload_3         
	//   89  172:ifnonnull       252
	//   90  175:iload_2         
	//   91  176:ifeq            252
		criteria.setAccuracy(1);
	//   92  179:aload           5
	//   93  181:iconst_1        
	//   94  182:invokevirtual   #693 <Method void Criteria.setAccuracy(int)>
		obj = ((Object) (locationmanager.getBestProvider(criteria, true)));
	//   95  185:aload           4
	//   96  187:aload           5
	//   97  189:iconst_1        
	//   98  190:invokevirtual   #697 <Method String LocationManager.getBestProvider(Criteria, boolean)>
	//   99  193:astore_3        
	//* 100  194:goto            197
		if(obj != null)
			break MISSING_BLOCK_LABEL_212;
	//  101  197:aload_3         
	//  102  198:ifnonnull       212
		logMessage(((String) (null)), 3, "Unable to fetch a location provider");
	//  103  201:aconst_null     
	//  104  202:iconst_3        
	//  105  203:ldc2            #699 <String "Unable to fetch a location provider">
	//  106  206:invokestatic    #314 <Method void logMessage(String, int, String)>
		context;
	//  107  209:aload_0         
		JVM INSTR monitorexit ;
	//  108  210:monitorexit     
		return;
	//  109  211:return          
		sLocationUpdateTimestamp = System.currentTimeMillis();
	//  110  212:invokestatic    #666 <Method long System.currentTimeMillis()>
	//  111  215:putstatic       #133 <Field long sLocationUpdateTimestamp>
		locationmanager.requestLocationUpdates(((String) (obj)), 0L, 0.0F, new LocationListener(locationmanager) {

			public void onLocationChanged(Location location)
			{
				MadvertiseUtil.logMessage(((String) (null)), 3, "Refreshing location");
			//    0    0:aconst_null     
			//    1    1:iconst_3        
			//    2    2:ldc1            #25  <String "Refreshing location">
			//    3    4:invokestatic    #29  <Method void MadvertiseUtil.logMessage(String, int, String)>
				MadvertiseUtil.sCurrentLocation = location;
			//    4    7:aload_1         
			//    5    8:invokestatic    #33  <Method Location MadvertiseUtil.access$002(Location)>
			//    6   11:pop             
				MadvertiseUtil.sLocationUpdateTimestamp = System.currentTimeMillis();
			//    7   12:invokestatic    #39  <Method long System.currentTimeMillis()>
			//    8   15:invokestatic    #43  <Method long MadvertiseUtil.access$102(long)>
			//    9   18:pop2            
				finalizedLocationManager.removeUpdates(((LocationListener) (this)));
			//   10   19:aload_0         
			//   11   20:getfield        #17  <Field LocationManager val$finalizedLocationManager>
			//   12   23:aload_0         
			//   13   24:invokevirtual   #49  <Method void LocationManager.removeUpdates(LocationListener)>
			//   14   27:return          
			}

			public void onProviderDisabled(String s)
			{
			//    0    0:return          
			}

			public void onProviderEnabled(String s)
			{
			//    0    0:return          
			}

			public void onStatusChanged(String s, int i, Bundle bundle)
			{
			//    0    0:return          
			}

			final LocationManager val$finalizedLocationManager;

			
			{
				finalizedLocationManager = locationmanager;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field LocationManager val$finalizedLocationManager>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
, context.getMainLooper());
	//  112  218:aload           4
	//  113  220:aload_3         
	//  114  221:lconst_0        
	//  115  222:fconst_0        
	//  116  223:new             #6   <Class MadvertiseUtil$1>
	//  117  226:dup             
	//  118  227:aload           4
	//  119  229:invokespecial   #702 <Method void MadvertiseUtil$1(LocationManager)>
	//  120  232:aload_0         
	//  121  233:invokevirtual   #706 <Method android.os.Looper Context.getMainLooper()>
	//  122  236:invokevirtual   #710 <Method void LocationManager.requestLocationUpdates(String, long, float, LocationListener, android.os.Looper)>
		context;
	//  123  239:aload_0         
		JVM INSTR monitorexit ;
	//  124  240:monitorexit     
		return;
	//  125  241:return          
		obj;
	//  126  242:astore_3        
		context;
	//  127  243:aload_0         
		JVM INSTR monitorexit ;
	//  128  244:monitorexit     
		throw obj;
	//  129  245:aload_3         
	//  130  246:athrow          
_L2:
		obj = null;
	//  131  247:aconst_null     
	//  132  248:astore_3        
		if(true) goto _L4; else goto _L3
	//  133  249:goto            171
_L3:
	//* 134  252:goto            197
	}

	static final String AD_PROVIDER_TEXT = "ad by madvertise";
	static final String ANIMATION_TYPE_DEFAULT = "fade";
	static final String ANIMATION_TYPE_FADE = "fade";
	static final String ANIMATION_TYPE_LEFT_TO_RIGHT = "left_to_right";
	static final String ANIMATION_TYPE_TOP_DOWN = "top_down";
	static final int BACKGROUND_COLOR_DEFAULT = 0;
	static final int BANNER_HEIGHT_DEFAULT = 53;
	public static final String BANNER_TYPE_ALL = "all";
	public static final String BANNER_TYPE_DEFAULT = "mma";
	public static final String BANNER_TYPE_FULLSCREEN = "fullscreen";
	public static final String BANNER_TYPE_LANDSCAPE = "landscape";
	public static final String BANNER_TYPE_LEADERBOARD = "leaderboard";
	static final String BANNER_TYPE_MEDIUM_RECTANGLE = "medium_rectangle";
	public static final String BANNER_TYPE_MMA = "mma";
	public static final String BANNER_TYPE_PORTRAIT = "portrait";
	public static final String BANNER_TYPE_RICH_MEDIA = "rich_media";
	public static final String BANNER_TYPE_RICH_MEDIA_SHORT = "rm";
	static final int BANNER_WIDTH_DEFAULT = 320;
	static final int CONNECTION_TIMEOUT = 5000;
	static final boolean DELIVER_ONLY_TEXT_DEFAULT = false;
	static final String ENCODING = "UTF-8";
	static final int FULLSCREEN_BANNER_HEIGHT = 768;
	static final int FULLSCREEN_BANNER_WIDTH = 768;
	static final int LANDSCAPE_BANNER_HEIGHT = 66;
	static final int LANDSCAPE_BANNER_WIDTH = 1024;
	static final int LEADERBOARD_BANNER_HEIGHT = 90;
	static final int LEADERBOARD_BANNER_WIDTH = 728;
	static final String LOG = "MAD_LOG";
	private static final String MADVERTISE_SITE_TOKEN = "madvertise_site_token";
	static final String MAD_SERVER = "http://ad.madvertise.de";
	static final int MEDIUM_RECTANGLE_BANNER_HEIGHT = 250;
	static final int MEDIUM_RECTANGLE_BANNER_WIDTH = 300;
	static final int MMA_BANNER_HEIGHT = 53;
	static final int MMA_BANNER_WIDTH = 320;
	public static final int PLACEMENT_TYPE_INLINE = 0;
	public static final int PLACEMENT_TYPE_INTERSTITIAL = 1;
	static final int PORTRAIT_BANNER_HEIGHT = 66;
	static final int PORTRAIT_BANNER_WIDTH = 766;
	static final boolean PRINT_LOG = true;
	static final int SECONDS_TO_REFRESH_AD_DEFAULT = 45;
	static final int SECONDS_TO_REFRESH_LOCATION = 900;
	static final int TEXT_COLOR_DEFAULT = -1;
	static final int TEXT_SIZE_DEFAULT = 18;
	static final int TEXT_SIZE_PROVIDER = 10;
	private static Location sCurrentLocation;
	private static long sLocationUpdateTimestamp;
	private static String sUA;

	static 
	{
	//    0    0:return          
	}


/*
	static Location access$002(Location location)
	{
		sCurrentLocation = location;
	//    0    0:aload_0         
	//    1    1:putstatic       #129 <Field Location sCurrentLocation>
		return location;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

*/


/*
	static long access$102(long l)
	{
		sLocationUpdateTimestamp = l;
	//    0    0:lload_0         
	//    1    1:putstatic       #133 <Field long sLocationUpdateTimestamp>
		return l;
	//    2    4:lload_0         
	//    3    5:lreturn         
	}

*/
}
