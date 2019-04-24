// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.scheme.*;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.comscore.utils:
//			CSLog, Permissions

public class Connectivity
{

	public Connectivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	private static HttpClient a()
	{
		Object obj;
		try
		{
			obj = ((Object) (SSLSocketFactory.getSocketFactory()));
	//    0    0:invokestatic    #24  <Method SSLSocketFactory SSLSocketFactory.getSocketFactory()>
	//    1    3:astore_0        
			((SSLSocketFactory) (obj)).setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
	//    2    4:aload_0         
	//    3    5:getstatic       #28  <Field org.apache.http.conn.ssl.X509HostnameVerifier SSLSocketFactory.STRICT_HOSTNAME_VERIFIER>
	//    4    8:invokevirtual   #32  <Method void SSLSocketFactory.setHostnameVerifier(org.apache.http.conn.ssl.X509HostnameVerifier)>
			BasicHttpParams basichttpparams = new BasicHttpParams();
	//    5   11:new             #34  <Class BasicHttpParams>
	//    6   14:dup             
	//    7   15:invokespecial   #35  <Method void BasicHttpParams()>
	//    8   18:astore_1        
			((HttpParams) (basichttpparams)).setBooleanParameter("http.protocol.expect-continue", false);
	//    9   19:aload_1         
	//   10   20:ldc1            #37  <String "http.protocol.expect-continue">
	//   11   22:iconst_0        
	//   12   23:invokeinterface #43  <Method HttpParams HttpParams.setBooleanParameter(String, boolean)>
	//   13   28:pop             
			SchemeRegistry schemeregistry = new SchemeRegistry();
	//   14   29:new             #45  <Class SchemeRegistry>
	//   15   32:dup             
	//   16   33:invokespecial   #46  <Method void SchemeRegistry()>
	//   17   36:astore_2        
			schemeregistry.register(new Scheme("http", ((org.apache.http.conn.scheme.SocketFactory) (PlainSocketFactory.getSocketFactory())), 80));
	//   18   37:aload_2         
	//   19   38:new             #48  <Class Scheme>
	//   20   41:dup             
	//   21   42:ldc1            #50  <String "http">
	//   22   44:invokestatic    #55  <Method PlainSocketFactory PlainSocketFactory.getSocketFactory()>
	//   23   47:bipush          80
	//   24   49:invokespecial   #58  <Method void Scheme(String, org.apache.http.conn.scheme.SocketFactory, int)>
	//   25   52:invokevirtual   #62  <Method Scheme SchemeRegistry.register(Scheme)>
	//   26   55:pop             
			schemeregistry.register(new Scheme("https", ((org.apache.http.conn.scheme.SocketFactory) (obj)), 443));
	//   27   56:aload_2         
	//   28   57:new             #48  <Class Scheme>
	//   29   60:dup             
	//   30   61:ldc1            #64  <String "https">
	//   31   63:aload_0         
	//   32   64:sipush          443
	//   33   67:invokespecial   #58  <Method void Scheme(String, org.apache.http.conn.scheme.SocketFactory, int)>
	//   34   70:invokevirtual   #62  <Method Scheme SchemeRegistry.register(Scheme)>
	//   35   73:pop             
			obj = ((Object) (new DefaultHttpClient(((org.apache.http.conn.ClientConnectionManager) (new ThreadSafeClientConnManager(((HttpParams) (basichttpparams)), schemeregistry))), ((HttpParams) (basichttpparams)))));
	//   36   74:new             #66  <Class DefaultHttpClient>
	//   37   77:dup             
	//   38   78:new             #68  <Class ThreadSafeClientConnManager>
	//   39   81:dup             
	//   40   82:aload_1         
	//   41   83:aload_2         
	//   42   84:invokespecial   #71  <Method void ThreadSafeClientConnManager(HttpParams, SchemeRegistry)>
	//   43   87:aload_1         
	//   44   88:invokespecial   #74  <Method void DefaultHttpClient(org.apache.http.conn.ClientConnectionManager, HttpParams)>
	//   45   91:astore_0        
		}
	//*  46   92:aload_0         
	//*  47   93:areturn         
		catch(Exception exception)
	//*  48   94:astore_0        
		{
			CSLog.e("comScore", exception.getMessage());
	//   49   95:ldc1            #76  <String "comScore">
	//   50   97:aload_0         
	//   51   98:invokevirtual   #80  <Method String Exception.getMessage()>
	//   52  101:invokestatic    #86  <Method void CSLog.e(Object, String)>
			return ((HttpClient) (new DefaultHttpClient()));
	//   53  104:new             #66  <Class DefaultHttpClient>
	//   54  107:dup             
	//   55  108:invokespecial   #87  <Method void DefaultHttpClient()>
	//   56  111:areturn         
		}
		return ((HttpClient) (obj));
	}

	public static String getCurrentSSID(Context context)
	{
		if(Permissions.check(context, "android.permission.ACCESS_WIFI_STATE").booleanValue() && ((ConnectivityManager)context.getSystemService("connectivity")).getNetworkInfo(1).isConnected())
	//*   0    0:aload_0         
	//*   1    1:ldc1            #91  <String "android.permission.ACCESS_WIFI_STATE">
	//*   2    3:invokestatic    #97  <Method Boolean Permissions.check(Context, String)>
	//*   3    6:invokevirtual   #103 <Method boolean Boolean.booleanValue()>
	//*   4    9:ifeq            53
	//*   5   12:aload_0         
	//*   6   13:ldc1            #105 <String "connectivity">
	//*   7   15:invokevirtual   #111 <Method Object Context.getSystemService(String)>
	//*   8   18:checkcast       #113 <Class ConnectivityManager>
	//*   9   21:iconst_1        
	//*  10   22:invokevirtual   #117 <Method NetworkInfo ConnectivityManager.getNetworkInfo(int)>
	//*  11   25:invokevirtual   #122 <Method boolean NetworkInfo.isConnected()>
	//*  12   28:ifeq            53
		{
			context = ((Context) (((WifiManager)context.getSystemService("wifi")).getConnectionInfo()));
	//   13   31:aload_0         
	//   14   32:ldc1            #124 <String "wifi">
	//   15   34:invokevirtual   #111 <Method Object Context.getSystemService(String)>
	//   16   37:checkcast       #126 <Class WifiManager>
	//   17   40:invokevirtual   #130 <Method WifiInfo WifiManager.getConnectionInfo()>
	//   18   43:astore_0        
			if(context != null)
	//*  19   44:aload_0         
	//*  20   45:ifnull          53
				return ((WifiInfo) (context)).getSSID();
	//   21   48:aload_0         
	//   22   49:invokevirtual   #135 <Method String WifiInfo.getSSID()>
	//   23   52:areturn         
		}
		return null;
	//   24   53:aconst_null     
	//   25   54:areturn         
	}

	public static HttpClient getHttpClient()
	{
		if(a == null)
	//*   0    0:getstatic       #138 <Field HttpClient a>
	//*   1    3:ifnonnull       12
			a = a();
	//    2    6:invokestatic    #140 <Method HttpClient a()>
	//    3    9:putstatic       #138 <Field HttpClient a>
		return a;
	//    4   12:getstatic       #138 <Field HttpClient a>
	//    5   15:areturn         
	}

	public static boolean isConnectBluetooth(Context context)
	{
		boolean flag2 = Permissions.check(context, "android.permission.ACCESS_NETWORK_STATE").booleanValue();
	//    0    0:aload_0         
	//    1    1:ldc1            #144 <String "android.permission.ACCESS_NETWORK_STATE">
	//    2    3:invokestatic    #97  <Method Boolean Permissions.check(Context, String)>
	//    3    6:invokevirtual   #103 <Method boolean Boolean.booleanValue()>
	//    4    9:istore_3        
		boolean flag1 = false;
	//    5   10:iconst_0        
	//    6   11:istore_2        
		boolean flag = flag1;
	//    7   12:iload_2         
	//    8   13:istore_1        
		if(flag2)
	//*   9   14:iload_3         
	//*  10   15:ifeq            60
		{
			flag = flag1;
	//   11   18:iload_2         
	//   12   19:istore_1        
			if(android.os.Build.VERSION.SDK_INT >= 13)
	//*  13   20:getstatic       #150 <Field int android.os.Build$VERSION.SDK_INT>
	//*  14   23:bipush          13
	//*  15   25:icmplt          60
			{
				context = ((Context) (((ConnectivityManager)context.getSystemService("connectivity")).getNetworkInfo(7)));
	//   16   28:aload_0         
	//   17   29:ldc1            #105 <String "connectivity">
	//   18   31:invokevirtual   #111 <Method Object Context.getSystemService(String)>
	//   19   34:checkcast       #113 <Class ConnectivityManager>
	//   20   37:bipush          7
	//   21   39:invokevirtual   #117 <Method NetworkInfo ConnectivityManager.getNetworkInfo(int)>
	//   22   42:astore_0        
				flag = flag1;
	//   23   43:iload_2         
	//   24   44:istore_1        
				if(context != null)
	//*  25   45:aload_0         
	//*  26   46:ifnull          60
				{
					flag = flag1;
	//   27   49:iload_2         
	//   28   50:istore_1        
					if(((NetworkInfo) (context)).isConnected())
	//*  29   51:aload_0         
	//*  30   52:invokevirtual   #122 <Method boolean NetworkInfo.isConnected()>
	//*  31   55:ifeq            60
						flag = true;
	//   32   58:iconst_1        
	//   33   59:istore_1        
				}
			}
		}
		return flag;
	//   34   60:iload_1         
	//   35   61:ireturn         
	}

	public static boolean isConnectEthernet(Context context)
	{
		boolean flag2 = Permissions.check(context, "android.permission.ACCESS_NETWORK_STATE").booleanValue();
	//    0    0:aload_0         
	//    1    1:ldc1            #144 <String "android.permission.ACCESS_NETWORK_STATE">
	//    2    3:invokestatic    #97  <Method Boolean Permissions.check(Context, String)>
	//    3    6:invokevirtual   #103 <Method boolean Boolean.booleanValue()>
	//    4    9:istore_3        
		boolean flag1 = false;
	//    5   10:iconst_0        
	//    6   11:istore_2        
		boolean flag = flag1;
	//    7   12:iload_2         
	//    8   13:istore_1        
		if(flag2)
	//*   9   14:iload_3         
	//*  10   15:ifeq            60
		{
			flag = flag1;
	//   11   18:iload_2         
	//   12   19:istore_1        
			if(android.os.Build.VERSION.SDK_INT >= 13)
	//*  13   20:getstatic       #150 <Field int android.os.Build$VERSION.SDK_INT>
	//*  14   23:bipush          13
	//*  15   25:icmplt          60
			{
				context = ((Context) (((ConnectivityManager)context.getSystemService("connectivity")).getNetworkInfo(9)));
	//   16   28:aload_0         
	//   17   29:ldc1            #105 <String "connectivity">
	//   18   31:invokevirtual   #111 <Method Object Context.getSystemService(String)>
	//   19   34:checkcast       #113 <Class ConnectivityManager>
	//   20   37:bipush          9
	//   21   39:invokevirtual   #117 <Method NetworkInfo ConnectivityManager.getNetworkInfo(int)>
	//   22   42:astore_0        
				flag = flag1;
	//   23   43:iload_2         
	//   24   44:istore_1        
				if(context != null)
	//*  25   45:aload_0         
	//*  26   46:ifnull          60
				{
					flag = flag1;
	//   27   49:iload_2         
	//   28   50:istore_1        
					if(((NetworkInfo) (context)).isConnected())
	//*  29   51:aload_0         
	//*  30   52:invokevirtual   #122 <Method boolean NetworkInfo.isConnected()>
	//*  31   55:ifeq            60
						flag = true;
	//   32   58:iconst_1        
	//   33   59:istore_1        
				}
			}
		}
		return flag;
	//   34   60:iload_1         
	//   35   61:ireturn         
	}

	public static boolean isConnectedMobile(Context context)
	{
		boolean flag2 = Permissions.check(context, "android.permission.ACCESS_NETWORK_STATE").booleanValue();
	//    0    0:aload_0         
	//    1    1:ldc1            #144 <String "android.permission.ACCESS_NETWORK_STATE">
	//    2    3:invokestatic    #97  <Method Boolean Permissions.check(Context, String)>
	//    3    6:invokevirtual   #103 <Method boolean Boolean.booleanValue()>
	//    4    9:istore_3        
		boolean flag1 = false;
	//    5   10:iconst_0        
	//    6   11:istore_2        
		boolean flag = flag1;
	//    7   12:iload_2         
	//    8   13:istore_1        
		if(flag2)
	//*   9   14:iload_3         
	//*  10   15:ifeq            49
		{
			context = ((Context) (((ConnectivityManager)context.getSystemService("connectivity")).getNetworkInfo(0)));
	//   11   18:aload_0         
	//   12   19:ldc1            #105 <String "connectivity">
	//   13   21:invokevirtual   #111 <Method Object Context.getSystemService(String)>
	//   14   24:checkcast       #113 <Class ConnectivityManager>
	//   15   27:iconst_0        
	//   16   28:invokevirtual   #117 <Method NetworkInfo ConnectivityManager.getNetworkInfo(int)>
	//   17   31:astore_0        
			flag = flag1;
	//   18   32:iload_2         
	//   19   33:istore_1        
			if(context != null)
	//*  20   34:aload_0         
	//*  21   35:ifnull          49
			{
				flag = flag1;
	//   22   38:iload_2         
	//   23   39:istore_1        
				if(((NetworkInfo) (context)).isConnected())
	//*  24   40:aload_0         
	//*  25   41:invokevirtual   #122 <Method boolean NetworkInfo.isConnected()>
	//*  26   44:ifeq            49
					flag = true;
	//   27   47:iconst_1        
	//   28   48:istore_1        
			}
		}
		return flag;
	//   29   49:iload_1         
	//   30   50:ireturn         
	}

	public static boolean isConnectedWiFi(Context context)
	{
		if(Permissions.check(context, "android.permission.ACCESS_NETWORK_STATE").booleanValue())
	//*   0    0:aload_0         
	//*   1    1:ldc1            #144 <String "android.permission.ACCESS_NETWORK_STATE">
	//*   2    3:invokestatic    #97  <Method Boolean Permissions.check(Context, String)>
	//*   3    6:invokevirtual   #103 <Method boolean Boolean.booleanValue()>
	//*   4    9:ifeq            41
		{
			context = ((Context) (((ConnectivityManager)context.getSystemService("connectivity")).getNetworkInfo(1)));
	//    5   12:aload_0         
	//    6   13:ldc1            #105 <String "connectivity">
	//    7   15:invokevirtual   #111 <Method Object Context.getSystemService(String)>
	//    8   18:checkcast       #113 <Class ConnectivityManager>
	//    9   21:iconst_1        
	//   10   22:invokevirtual   #117 <Method NetworkInfo ConnectivityManager.getNetworkInfo(int)>
	//   11   25:astore_0        
			return context != null && ((NetworkInfo) (context)).isConnected();
	//   12   26:aload_0         
	//   13   27:ifnull          39
	//   14   30:aload_0         
	//   15   31:invokevirtual   #122 <Method boolean NetworkInfo.isConnected()>
	//   16   34:ifeq            39
	//   17   37:iconst_1        
	//   18   38:ireturn         
	//   19   39:iconst_0        
	//   20   40:ireturn         
		} else
		{
			return false;
	//   21   41:iconst_0        
	//   22   42:ireturn         
		}
	}

	public static boolean isDataConnected(Context context)
	{
		boolean flag;
label0:
		{
			boolean flag2 = Permissions.check(context, "android.permission.READ_PHONE_STATE").booleanValue();
	//    0    0:aload_0         
	//    1    1:ldc1            #156 <String "android.permission.READ_PHONE_STATE">
	//    2    3:invokestatic    #97  <Method Boolean Permissions.check(Context, String)>
	//    3    6:invokevirtual   #103 <Method boolean Boolean.booleanValue()>
	//    4    9:istore_3        
			boolean flag1 = false;
	//    5   10:iconst_0        
	//    6   11:istore_2        
			flag = flag1;
	//    7   12:iload_2         
	//    8   13:istore_1        
			if(!flag2)
				break label0;
	//    9   14:iload_3         
	//   10   15:ifeq            56
			context = ((Context) ((TelephonyManager)context.getSystemService("phone")));
	//   11   18:aload_0         
	//   12   19:ldc1            #158 <String "phone">
	//   13   21:invokevirtual   #111 <Method Object Context.getSystemService(String)>
	//   14   24:checkcast       #160 <Class TelephonyManager>
	//   15   27:astore_0        
			if(((TelephonyManager) (context)).getDataActivity() != 3 && ((TelephonyManager) (context)).getDataActivity() != 1)
	//*  16   28:aload_0         
	//*  17   29:invokevirtual   #164 <Method int TelephonyManager.getDataActivity()>
	//*  18   32:iconst_3        
	//*  19   33:icmpeq          54
	//*  20   36:aload_0         
	//*  21   37:invokevirtual   #164 <Method int TelephonyManager.getDataActivity()>
	//*  22   40:iconst_1        
	//*  23   41:icmpeq          54
			{
				flag = flag1;
	//   24   44:iload_2         
	//   25   45:istore_1        
				if(((TelephonyManager) (context)).getDataActivity() != 2)
					break label0;
	//   26   46:aload_0         
	//   27   47:invokevirtual   #164 <Method int TelephonyManager.getDataActivity()>
	//   28   50:iconst_2        
	//   29   51:icmpne          56
			}
			flag = true;
	//   30   54:iconst_1        
	//   31   55:istore_1        
		}
		return flag;
	//   32   56:iload_1         
	//   33   57:ireturn         
	}

	public static boolean isEmulator()
	{
		return "sdk".equals(((Object) (Build.PRODUCT)));
	//    0    0:ldc1            #167 <String "sdk">
	//    1    2:getstatic       #173 <Field String Build.PRODUCT>
	//    2    5:invokevirtual   #179 <Method boolean String.equals(Object)>
	//    3    8:ireturn         
	}

	private static HttpClient a;

	static 
	{
	//    0    0:return          
	}
}
