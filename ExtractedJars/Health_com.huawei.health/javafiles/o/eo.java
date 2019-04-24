// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.app.KeyguardManager;
import android.bluetooth.BluetoothAdapter;
import android.content.*;
import android.content.pm.*;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.*;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.*;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package o:
//			ei, em

public final class eo
{

	private eo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	private static String A()
	{
		Object obj = ((Object) (NetworkInterface.getNetworkInterfaces()));
	//    0    0:invokestatic    #25  <Method Enumeration NetworkInterface.getNetworkInterfaces()>
	//    1    3:astore_0        
_L2:
		Enumeration enumeration;
		if(!((Enumeration) (obj)).hasMoreElements())
			break MISSING_BLOCK_LABEL_75;
	//    2    4:aload_0         
	//    3    5:invokeinterface #31  <Method boolean Enumeration.hasMoreElements()>
	//    4   10:ifeq            75
		enumeration = ((NetworkInterface)((Enumeration) (obj)).nextElement()).getInetAddresses();
	//    5   13:aload_0         
	//    6   14:invokeinterface #35  <Method Object Enumeration.nextElement()>
	//    7   19:checkcast       #21  <Class NetworkInterface>
	//    8   22:invokevirtual   #38  <Method Enumeration NetworkInterface.getInetAddresses()>
	//    9   25:astore_1        
_L4:
		if(!enumeration.hasMoreElements()) goto _L2; else goto _L1
	//   10   26:aload_1         
	//   11   27:invokeinterface #31  <Method boolean Enumeration.hasMoreElements()>
	//   12   32:ifeq            72
_L1:
		InetAddress inetaddress = (InetAddress)enumeration.nextElement();
	//   13   35:aload_1         
	//   14   36:invokeinterface #35  <Method Object Enumeration.nextElement()>
	//   15   41:checkcast       #40  <Class InetAddress>
	//   16   44:astore_2        
		if(inetaddress.isLoopbackAddress() || !(inetaddress instanceof Inet4Address)) goto _L4; else goto _L3
	//   17   45:aload_2         
	//   18   46:invokevirtual   #43  <Method boolean InetAddress.isLoopbackAddress()>
	//   19   49:ifne            69
	//   20   52:aload_2         
	//   21   53:instanceof      #45  <Class Inet4Address>
	//   22   56:ifeq            69
_L3:
		obj = ((Object) (inetaddress.getHostAddress().toString()));
	//   23   59:aload_2         
	//   24   60:invokevirtual   #48  <Method String InetAddress.getHostAddress()>
	//   25   63:invokevirtual   #53  <Method String String.toString()>
	//   26   66:astore_0        
		return ((String) (obj));
	//   27   67:aload_0         
	//   28   68:areturn         
	//*  29   69:goto            26
	//*  30   72:goto            4
_L6:
		return "";
	//   31   75:ldc1            #55  <String "">
	//   32   77:areturn         
		Throwable throwable;
		throwable;
	//   33   78:astore_0        
		if(true) goto _L6; else goto _L5
_L5:
	//*  34   79:goto            75
	}

	public static String a(Context context)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		int i1 = android.provider.Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
	//    2    2:aload_0         
	//    3    3:invokevirtual   #63  <Method android.content.ContentResolver Context.getContentResolver()>
	//    4    6:ldc1            #65  <String "airplane_mode_on">
	//    5    8:iconst_0        
	//    6    9:invokestatic    #71  <Method int android.provider.Settings$System.getInt(android.content.ContentResolver, String, int)>
	//    7   12:istore_2        
		j = i1;
	//    8   13:iload_2         
	//    9   14:istore_1        
_L2:
		if(j == 1)
	//*  10   15:iload_1         
	//*  11   16:iconst_1        
	//*  12   17:icmpne          23
			return "1";
	//   13   20:ldc1            #73  <String "1">
	//   14   22:areturn         
		else
			return "0";
	//   15   23:ldc1            #75  <String "0">
	//   16   25:areturn         
		context;
	//   17   26:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  18   27:goto            15
	}

	public static String b()
	{
		long l1 = 0L;
	//    0    0:lconst_0        
	//    1    1:lstore_1        
		int j;
		long l2;
		StatFs statfs = new StatFs(Environment.getDataDirectory().getPath());
	//    2    2:new             #78  <Class StatFs>
	//    3    5:dup             
	//    4    6:invokestatic    #84  <Method File Environment.getDataDirectory()>
	//    5    9:invokevirtual   #89  <Method String File.getPath()>
	//    6   12:invokespecial   #92  <Method void StatFs(String)>
	//    7   15:astore          5
		l2 = statfs.getBlockSize();
	//    8   17:aload           5
	//    9   19:invokevirtual   #96  <Method int StatFs.getBlockSize()>
	//   10   22:i2l             
	//   11   23:lstore_3        
		j = statfs.getAvailableBlocks();
	//   12   24:aload           5
	//   13   26:invokevirtual   #99  <Method int StatFs.getAvailableBlocks()>
	//   14   29:istore_0        
		l1 = (long)j * l2;
	//   15   30:iload_0         
	//   16   31:i2l             
	//   17   32:lload_3         
	//   18   33:lmul            
	//   19   34:lstore_1        
_L2:
		return String.valueOf(l1);
	//   20   35:lload_1         
	//   21   36:invokestatic    #103 <Method String String.valueOf(long)>
	//   22   39:areturn         
		Throwable throwable;
		throwable;
	//   23   40:astore          5
		if(true) goto _L2; else goto _L1
	//   24   42:goto            35
_L1:
	}

	public static String b(Context context)
	{
		String s1;
		Object obj;
		Object obj1;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		obj1 = null;
	//    2    2:aconst_null     
	//    3    3:astore_3        
		if(d(context, "android.permission.READ_PHONE_STATE"))
	//*   4    4:aload_0         
	//*   5    5:ldc1            #105 <String "android.permission.READ_PHONE_STATE">
	//*   6    7:invokestatic    #109 <Method boolean d(Context, String)>
	//*   7   10:ifeq            16
			return "";
	//    8   13:ldc1            #55  <String "">
	//    9   15:areturn         
		s1 = ((String) (obj));
	//   10   16:aload_2         
	//   11   17:astore_1        
		if(context == null)
			break MISSING_BLOCK_LABEL_43;
	//   12   18:aload_0         
	//   13   19:ifnull          43
		context = ((Context) ((TelephonyManager)context.getSystemService("phone")));
	//   14   22:aload_0         
	//   15   23:ldc1            #111 <String "phone">
	//   16   25:invokevirtual   #115 <Method Object Context.getSystemService(String)>
	//   17   28:checkcast       #117 <Class TelephonyManager>
	//   18   31:astore_0        
		s1 = ((String) (obj1));
	//   19   32:aload_3         
	//   20   33:astore_1        
		if(context != null)
	//*  21   34:aload_0         
	//*  22   35:ifnull          43
			try
			{
				s1 = ((TelephonyManager) (context)).getDeviceId();
	//   23   38:aload_0         
	//   24   39:invokevirtual   #120 <Method String TelephonyManager.getDeviceId()>
	//   25   42:astore_1        
			}
	//*  26   43:aload_1         
	//*  27   44:astore_0        
	//*  28   45:aload_1         
	//*  29   46:ifnonnull       52
	//*  30   49:ldc1            #55  <String "">
	//*  31   51:astore_0        
	//*  32   52:aload_0         
	//*  33   53:areturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  34   54:astore_0        
			{
				s1 = ((String) (obj));
	//   35   55:aload_2         
	//   36   56:astore_1        
			}
		context = ((Context) (s1));
		if(s1 == null)
			context = "";
		return ((String) (context));
	//*  37   57:goto            43
	}

	private static String c(BluetoothAdapter bluetoothadapter)
	{
		Field field = ((Class) (android/bluetooth/BluetoothAdapter)).getDeclaredField("mService");
	//    0    0:ldc1            #123 <Class BluetoothAdapter>
	//    1    2:ldc1            #125 <String "mService">
	//    2    4:invokevirtual   #131 <Method Field Class.getDeclaredField(String)>
	//    3    7:astore_1        
		field.setAccessible(true);
	//    4    8:aload_1         
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #137 <Method void Field.setAccessible(boolean)>
		bluetoothadapter = ((BluetoothAdapter) (field.get(((Object) (bluetoothadapter)))));
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #141 <Method Object Field.get(Object)>
	//   10   18:astore_0        
		if(bluetoothadapter == null)
	//*  11   19:aload_0         
	//*  12   20:ifnonnull       25
			return null;
	//   13   23:aconst_null     
	//   14   24:areturn         
		Method method = ((Object) (bluetoothadapter)).getClass().getDeclaredMethod("getAddress", new Class[0]);
	//   15   25:aload_0         
	//   16   26:invokevirtual   #145 <Method Class Object.getClass()>
	//   17   29:ldc1            #147 <String "getAddress">
	//   18   31:iconst_0        
	//   19   32:anewarray       Class[]
	//   20   35:invokevirtual   #151 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   21   38:astore_1        
		method.setAccessible(true);
	//   22   39:aload_1         
	//   23   40:iconst_1        
	//   24   41:invokevirtual   #154 <Method void Method.setAccessible(boolean)>
		bluetoothadapter = ((BluetoothAdapter) (method.invoke(((Object) (bluetoothadapter)), new Object[0])));
	//   25   44:aload_1         
	//   26   45:aload_0         
	//   27   46:iconst_0        
	//   28   47:anewarray       Object[]
	//   29   50:invokevirtual   #158 <Method Object Method.invoke(Object, Object[])>
	//   30   53:astore_0        
		if(bluetoothadapter == null)
			break MISSING_BLOCK_LABEL_72;
	//   31   54:aload_0         
	//   32   55:ifnull          72
		if(!(bluetoothadapter instanceof String))
			break MISSING_BLOCK_LABEL_72;
	//   33   58:aload_0         
	//   34   59:instanceof      #50  <Class String>
	//   35   62:ifeq            72
		bluetoothadapter = ((BluetoothAdapter) ((String)bluetoothadapter));
	//   36   65:aload_0         
	//   37   66:checkcast       #50  <Class String>
	//   38   69:astore_0        
		return ((String) (bluetoothadapter));
	//   39   70:aload_0         
	//   40   71:areturn         
_L2:
		return null;
	//   41   72:aconst_null     
	//   42   73:areturn         
		bluetoothadapter;
	//   43   74:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  44   75:goto            72
	}

	public static String c(Context context)
	{
		String s1;
		String s2;
		s2 = "";
	//    0    0:ldc1            #55  <String "">
	//    1    2:astore_2        
		if(d(context, "android.permission.READ_PHONE_STATE"))
	//*   2    3:aload_0         
	//*   3    4:ldc1            #105 <String "android.permission.READ_PHONE_STATE">
	//*   4    6:invokestatic    #109 <Method boolean d(Context, String)>
	//*   5    9:ifeq            15
			return "";
	//    6   12:ldc1            #55  <String "">
	//    7   14:areturn         
		s1 = s2;
	//    8   15:aload_2         
	//    9   16:astore_1        
		if(context == null)
			break MISSING_BLOCK_LABEL_42;
	//   10   17:aload_0         
	//   11   18:ifnull          42
		context = ((Context) ((TelephonyManager)context.getSystemService("phone")));
	//   12   21:aload_0         
	//   13   22:ldc1            #111 <String "phone">
	//   14   24:invokevirtual   #115 <Method Object Context.getSystemService(String)>
	//   15   27:checkcast       #117 <Class TelephonyManager>
	//   16   30:astore_0        
		s1 = s2;
	//   17   31:aload_2         
	//   18   32:astore_1        
		if(context != null)
	//*  19   33:aload_0         
	//*  20   34:ifnull          42
			try
			{
				s1 = ((TelephonyManager) (context)).getSubscriberId();
	//   21   37:aload_0         
	//   22   38:invokevirtual   #161 <Method String TelephonyManager.getSubscriberId()>
	//   23   41:astore_1        
			}
	//*  24   42:aload_1         
	//*  25   43:astore_0        
	//*  26   44:aload_1         
	//*  27   45:ifnonnull       51
	//*  28   48:ldc1            #55  <String "">
	//*  29   50:astore_0        
	//*  30   51:aload_0         
	//*  31   52:areturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  32   53:astore_0        
			{
				s1 = s2;
	//   33   54:aload_2         
	//   34   55:astore_1        
			}
		context = ((Context) (s1));
		if(s1 == null)
			context = "";
		return ((String) (context));
	//*  35   56:goto            42
	}

	public static eo c()
	{
		return c;
	//    0    0:getstatic       #13  <Field eo c>
	//    1    3:areturn         
	}

	public static String d()
	{
		Object obj;
		Object obj1;
		FileInputStream fileinputstream1;
		InputStreamReader inputstreamreader;
		LineNumberReader linenumberreader;
		InputStreamReader inputstreamreader1;
		InputStreamReader inputstreamreader2;
		LineNumberReader linenumberreader1;
		LineNumberReader linenumberreader2;
		String s1;
		Object obj2;
		obj1 = "0000000000000000";
	//    0    0:ldc1            #164 <String "0000000000000000">
	//    1    2:astore_2        
		fileinputstream1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          4
		obj = null;
	//    4    6:aconst_null     
	//    5    7:astore_1        
		obj2 = null;
	//    6    8:aconst_null     
	//    7    9:astore          12
		inputstreamreader2 = null;
	//    8   11:aconst_null     
	//    9   12:astore          8
		s1 = null;
	//   10   14:aconst_null     
	//   11   15:astore          11
		linenumberreader2 = null;
	//   12   17:aconst_null     
	//   13   18:astore          10
		inputstreamreader = inputstreamreader2;
	//   14   20:aload           8
	//   15   22:astore          5
		linenumberreader = linenumberreader2;
	//   16   24:aload           10
	//   17   26:astore          6
		inputstreamreader1 = ((InputStreamReader) (obj2));
	//   18   28:aload           12
	//   19   30:astore          7
		linenumberreader1 = ((LineNumberReader) (s1));
	//   20   32:aload           11
	//   21   34:astore          9
		FileInputStream fileinputstream = new FileInputStream(new File("/proc/cpuinfo"));
	//   22   36:new             #166 <Class FileInputStream>
	//   23   39:dup             
	//   24   40:new             #86  <Class File>
	//   25   43:dup             
	//   26   44:ldc1            #168 <String "/proc/cpuinfo">
	//   27   46:invokespecial   #169 <Method void File(String)>
	//   28   49:invokespecial   #172 <Method void FileInputStream(File)>
	//   29   52:astore_3        
		obj = ((Object) (fileinputstream));
	//   30   53:aload_3         
	//   31   54:astore_1        
		inputstreamreader = inputstreamreader2;
	//   32   55:aload           8
	//   33   57:astore          5
		linenumberreader = linenumberreader2;
	//   34   59:aload           10
	//   35   61:astore          6
		fileinputstream1 = fileinputstream;
	//   36   63:aload_3         
	//   37   64:astore          4
		inputstreamreader1 = ((InputStreamReader) (obj2));
	//   38   66:aload           12
	//   39   68:astore          7
		linenumberreader1 = ((LineNumberReader) (s1));
	//   40   70:aload           11
	//   41   72:astore          9
		inputstreamreader2 = new InputStreamReader(((java.io.InputStream) (fileinputstream)));
	//   42   74:new             #174 <Class InputStreamReader>
	//   43   77:dup             
	//   44   78:aload_3         
	//   45   79:invokespecial   #177 <Method void InputStreamReader(java.io.InputStream)>
	//   46   82:astore          8
		obj = ((Object) (fileinputstream));
	//   47   84:aload_3         
	//   48   85:astore_1        
		inputstreamreader = inputstreamreader2;
	//   49   86:aload           8
	//   50   88:astore          5
		linenumberreader = linenumberreader2;
	//   51   90:aload           10
	//   52   92:astore          6
		fileinputstream1 = fileinputstream;
	//   53   94:aload_3         
	//   54   95:astore          4
		inputstreamreader1 = inputstreamreader2;
	//   55   97:aload           8
	//   56   99:astore          7
		linenumberreader1 = ((LineNumberReader) (s1));
	//   57  101:aload           11
	//   58  103:astore          9
		linenumberreader2 = new LineNumberReader(((java.io.Reader) (inputstreamreader2)));
	//   59  105:new             #179 <Class LineNumberReader>
	//   60  108:dup             
	//   61  109:aload           8
	//   62  111:invokespecial   #182 <Method void LineNumberReader(java.io.Reader)>
	//   63  114:astore          10
		int j = 1;
	//   64  116:iconst_1        
	//   65  117:istore_0        
_L2:
		obj = obj1;
	//   66  118:aload_2         
	//   67  119:astore_1        
		if(j >= 100)
			break; /* Loop/switch isn't completed */
	//   68  120:iload_0         
	//   69  121:bipush          100
	//   70  123:icmpge          250
		obj = ((Object) (fileinputstream));
	//   71  126:aload_3         
	//   72  127:astore_1        
		inputstreamreader = inputstreamreader2;
	//   73  128:aload           8
	//   74  130:astore          5
		linenumberreader = linenumberreader2;
	//   75  132:aload           10
	//   76  134:astore          6
		fileinputstream1 = fileinputstream;
	//   77  136:aload_3         
	//   78  137:astore          4
		inputstreamreader1 = inputstreamreader2;
	//   79  139:aload           8
	//   80  141:astore          7
		linenumberreader1 = linenumberreader2;
	//   81  143:aload           10
	//   82  145:astore          9
		s1 = linenumberreader2.readLine();
	//   83  147:aload           10
	//   84  149:invokevirtual   #185 <Method String LineNumberReader.readLine()>
	//   85  152:astore          11
		obj = obj1;
	//   86  154:aload_2         
	//   87  155:astore_1        
		if(s1 == null)
			break; /* Loop/switch isn't completed */
	//   88  156:aload           11
	//   89  158:ifnull          250
		obj = ((Object) (fileinputstream));
	//   90  161:aload_3         
	//   91  162:astore_1        
		inputstreamreader = inputstreamreader2;
	//   92  163:aload           8
	//   93  165:astore          5
		linenumberreader = linenumberreader2;
	//   94  167:aload           10
	//   95  169:astore          6
		fileinputstream1 = fileinputstream;
	//   96  171:aload_3         
	//   97  172:astore          4
		inputstreamreader1 = inputstreamreader2;
	//   98  174:aload           8
	//   99  176:astore          7
		linenumberreader1 = linenumberreader2;
	//  100  178:aload           10
	//  101  180:astore          9
		if(s1.indexOf("Serial") < 0)
			break MISSING_BLOCK_LABEL_243;
	//  102  182:aload           11
	//  103  184:ldc1            #187 <String "Serial">
	//  104  186:invokevirtual   #191 <Method int String.indexOf(String)>
	//  105  189:iflt            243
		obj = ((Object) (fileinputstream));
	//  106  192:aload_3         
	//  107  193:astore_1        
		inputstreamreader = inputstreamreader2;
	//  108  194:aload           8
	//  109  196:astore          5
		linenumberreader = linenumberreader2;
	//  110  198:aload           10
	//  111  200:astore          6
		fileinputstream1 = fileinputstream;
	//  112  202:aload_3         
	//  113  203:astore          4
		inputstreamreader1 = inputstreamreader2;
	//  114  205:aload           8
	//  115  207:astore          7
		linenumberreader1 = linenumberreader2;
	//  116  209:aload           10
	//  117  211:astore          9
		s1 = s1.substring(s1.indexOf(":") + 1, s1.length()).trim();
	//  118  213:aload           11
	//  119  215:aload           11
	//  120  217:ldc1            #193 <String ":">
	//  121  219:invokevirtual   #191 <Method int String.indexOf(String)>
	//  122  222:iconst_1        
	//  123  223:iadd            
	//  124  224:aload           11
	//  125  226:invokevirtual   #196 <Method int String.length()>
	//  126  229:invokevirtual   #200 <Method String String.substring(int, int)>
	//  127  232:invokevirtual   #203 <Method String String.trim()>
	//  128  235:astore          11
		obj = ((Object) (s1));
	//  129  237:aload           11
	//  130  239:astore_1        
		break; /* Loop/switch isn't completed */
	//  131  240:goto            250
		j++;
	//  132  243:iload_0         
	//  133  244:iconst_1        
	//  134  245:iadd            
	//  135  246:istore_0        
		if(true) goto _L2; else goto _L1
	//  136  247:goto            118
_L1:
		Throwable throwable;
		Exception exception;
		try
		{
			linenumberreader2.close();
	//  137  250:aload           10
	//  138  252:invokevirtual   #206 <Method void LineNumberReader.close()>
		}
	//* 139  255:aload           8
	//* 140  257:invokevirtual   #207 <Method void InputStreamReader.close()>
	//* 141  260:aload_3         
	//* 142  261:invokevirtual   #208 <Method void FileInputStream.close()>
	//* 143  264:goto            343
	//* 144  267:goto            343
	//* 145  270:aload           9
	//* 146  272:ifnull          280
	//* 147  275:aload           9
	//* 148  277:invokevirtual   #206 <Method void LineNumberReader.close()>
	//* 149  280:aload           7
	//* 150  282:ifnull          290
	//* 151  285:aload           7
	//* 152  287:invokevirtual   #207 <Method void InputStreamReader.close()>
	//* 153  290:aload_2         
	//* 154  291:astore_1        
	//* 155  292:aload           4
	//* 156  294:ifnull          343
	//* 157  297:aload           4
	//* 158  299:invokevirtual   #208 <Method void FileInputStream.close()>
	//* 159  302:aload_2         
	//* 160  303:astore_1        
	//* 161  304:goto            343
	//* 162  307:aload_2         
	//* 163  308:astore_1        
	//* 164  309:goto            343
	//* 165  312:astore_2        
	//* 166  313:aload           6
	//* 167  315:ifnull          323
	//* 168  318:aload           6
	//* 169  320:invokevirtual   #206 <Method void LineNumberReader.close()>
	//* 170  323:aload           5
	//* 171  325:ifnull          333
	//* 172  328:aload           5
	//* 173  330:invokevirtual   #207 <Method void InputStreamReader.close()>
	//* 174  333:aload_1         
	//* 175  334:ifnull          341
	//* 176  337:aload_1         
	//* 177  338:invokevirtual   #208 <Method void FileInputStream.close()>
	//* 178  341:aload_2         
	//* 179  342:athrow          
	//* 180  343:aload_1         
	//* 181  344:astore_2        
	//* 182  345:aload_1         
	//* 183  346:ifnonnull       352
	//* 184  349:ldc1            #55  <String "">
	//* 185  351:astore_2        
	//* 186  352:aload_2         
	//* 187  353:areturn         
	//* 188  354:astore_1        
	//* 189  355:goto            270
		catch(Throwable throwable5) { }
	//  190  358:astore_2        
		try
		{
			inputstreamreader2.close();
		}
	//* 191  359:goto            255
		catch(Throwable throwable6) { }
	//  192  362:astore_2        
		try
		{
			fileinputstream.close();
		}
	//* 193  363:goto            260
		catch(Throwable throwable7) { }
	//  194  366:astore_2        
		  goto _L3
_L5:
		if(linenumberreader1 != null)
			try
			{
				linenumberreader1.close();
			}
	//* 195  367:goto            267
			catch(Throwable throwable1) { }
	//  196  370:astore_1        
		if(inputstreamreader1 != null)
			try
			{
				inputstreamreader1.close();
			}
	//* 197  371:goto            280
			catch(Throwable throwable2) { }
	//  198  374:astore_1        
		obj = obj1;
		if(fileinputstream1 == null) goto _L3; else goto _L4
_L4:
		fileinputstream1.close();
		obj = obj1;
		  goto _L3
_L6:
		obj = obj1;
		  goto _L3
		exception;
		Throwable throwable3;
		if(linenumberreader != null)
			try
			{
				linenumberreader.close();
			}
	//* 199  375:goto            290
	//* 200  378:astore_1        
	//* 201  379:goto            307
			catch(Throwable throwable8) { }
	//  202  382:astore_3        
		if(inputstreamreader != null)
			try
			{
				inputstreamreader.close();
			}
	//* 203  383:goto            323
			catch(Throwable throwable9) { }
	//  204  386:astore_3        
		if(obj != null)
			try
			{
				((FileInputStream) (obj)).close();
			}
	//* 205  387:goto            333
			catch(Throwable throwable4) { }
	//  206  390:astore_1        
		throw exception;
_L3:
		exception = ((Exception) (obj));
		if(obj == null)
			exception = "";
		return ((String) (exception));
		throwable;
		  goto _L5
		throwable3;
		  goto _L6
	//* 207  391:goto            341
	}

	public static String d(Context context)
	{
		String s1;
		Object obj;
		Object obj1;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		obj1 = null;
	//    2    2:aconst_null     
	//    3    3:astore_3        
		s1 = ((String) (obj));
	//    4    4:aload_2         
	//    5    5:astore_1        
		if(context == null)
			break MISSING_BLOCK_LABEL_31;
	//    6    6:aload_0         
	//    7    7:ifnull          31
		context = ((Context) ((TelephonyManager)context.getSystemService("phone")));
	//    8   10:aload_0         
	//    9   11:ldc1            #111 <String "phone">
	//   10   13:invokevirtual   #115 <Method Object Context.getSystemService(String)>
	//   11   16:checkcast       #117 <Class TelephonyManager>
	//   12   19:astore_0        
		s1 = ((String) (obj1));
	//   13   20:aload_3         
	//   14   21:astore_1        
		if(context != null)
	//*  15   22:aload_0         
	//*  16   23:ifnull          31
			try
			{
				s1 = ((TelephonyManager) (context)).getNetworkOperatorName();
	//   17   26:aload_0         
	//   18   27:invokevirtual   #211 <Method String TelephonyManager.getNetworkOperatorName()>
	//   19   30:astore_1        
			}
	//*  20   31:aload_1         
	//*  21   32:ifnull          46
	//*  22   35:aload_1         
	//*  23   36:astore_0        
	//*  24   37:ldc1            #213 <String "null">
	//*  25   39:aload_1         
	//*  26   40:invokevirtual   #217 <Method boolean String.equals(Object)>
	//*  27   43:ifeq            49
	//*  28   46:ldc1            #55  <String "">
	//*  29   48:astore_0        
	//*  30   49:aload_0         
	//*  31   50:areturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  32   51:astore_0        
			{
				s1 = ((String) (obj));
	//   33   52:aload_2         
	//   34   53:astore_1        
			}
label0:
		{
			if(s1 != null)
			{
				context = ((Context) (s1));
				if(!"null".equals(((Object) (s1))))
					break label0;
			}
			context = "";
		}
		return ((String) (context));
	//*  35   54:goto            31
	}

	private static boolean d(Context context, String s1)
	{
		boolean flag;
		if(context.getPackageManager().checkPermission(s1, context.getPackageName()) == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #221 <Method PackageManager Context.getPackageManager()>
	//*   2    4:aload_1         
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #224 <Method String Context.getPackageName()>
	//*   5    9:invokevirtual   #230 <Method int PackageManager.checkPermission(String, String)>
	//*   6   12:ifne            20
			flag = true;
	//    7   15:iconst_1        
	//    8   16:istore_2        
		else
	//*   9   17:goto            22
			flag = false;
	//   10   20:iconst_0        
	//   11   21:istore_2        
		return !flag;
	//   12   22:iload_2         
	//   13   23:ifne            28
	//   14   26:iconst_1        
	//   15   27:ireturn         
	//   16   28:iconst_0        
	//   17   29:ireturn         
	}

	public static String e()
	{
		long l1;
		long l2;
		l2 = 0L;
	//    0    0:lconst_0        
	//    1    1:lstore_3        
		l1 = l2;
	//    2    2:lload_3         
	//    3    3:lstore_1        
		int j;
		if(!"mounted".equals(((Object) (Environment.getExternalStorageState()))))
			break MISSING_BLOCK_LABEL_48;
	//    4    4:ldc1            #233 <String "mounted">
	//    5    6:invokestatic    #236 <Method String Environment.getExternalStorageState()>
	//    6    9:invokevirtual   #217 <Method boolean String.equals(Object)>
	//    7   12:ifeq            48
		StatFs statfs = new StatFs(ei.b().getPath());
	//    8   15:new             #78  <Class StatFs>
	//    9   18:dup             
	//   10   19:invokestatic    #240 <Method File ei.b()>
	//   11   22:invokevirtual   #89  <Method String File.getPath()>
	//   12   25:invokespecial   #92  <Method void StatFs(String)>
	//   13   28:astore          5
		l1 = statfs.getBlockSize();
	//   14   30:aload           5
	//   15   32:invokevirtual   #96  <Method int StatFs.getBlockSize()>
	//   16   35:i2l             
	//   17   36:lstore_1        
		j = statfs.getAvailableBlocks();
	//   18   37:aload           5
	//   19   39:invokevirtual   #99  <Method int StatFs.getAvailableBlocks()>
	//   20   42:istore_0        
		l1 *= j;
	//   21   43:lload_1         
	//   22   44:iload_0         
	//   23   45:i2l             
	//   24   46:lmul            
	//   25   47:lstore_1        
_L2:
		return String.valueOf(l1);
	//   26   48:lload_1         
	//   27   49:invokestatic    #103 <Method String String.valueOf(long)>
	//   28   52:areturn         
		Throwable throwable;
		throwable;
	//   29   53:astore          5
		l1 = l2;
	//   30   55:lload_3         
	//   31   56:lstore_1        
		if(true) goto _L2; else goto _L1
	//   32   57:goto            48
_L1:
	}

	public static String e(Context context)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #242 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #243 <Method void JSONObject()>
	//    3    7:astore          7
		context = ((Context) ((AudioManager)context.getSystemService("audio")));
	//    4    9:aload_0         
	//    5   10:ldc1            #245 <String "audio">
	//    6   12:invokevirtual   #115 <Method Object Context.getSystemService(String)>
	//    7   15:checkcast       #247 <Class AudioManager>
	//    8   18:astore_0        
		int j;
		if(((AudioManager) (context)).getRingerMode() == 0)
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #250 <Method int AudioManager.getRingerMode()>
	//*  11   23:ifne            155
			j = 1;
	//   12   26:iconst_1        
	//   13   27:istore_1        
		else
	//*  14   28:goto            31
	//*  15   31:aload_0         
	//*  16   32:iconst_0        
	//*  17   33:invokevirtual   #254 <Method int AudioManager.getStreamVolume(int)>
	//*  18   36:istore_2        
	//*  19   37:aload_0         
	//*  20   38:iconst_1        
	//*  21   39:invokevirtual   #254 <Method int AudioManager.getStreamVolume(int)>
	//*  22   42:istore_3        
	//*  23   43:aload_0         
	//*  24   44:iconst_2        
	//*  25   45:invokevirtual   #254 <Method int AudioManager.getStreamVolume(int)>
	//*  26   48:istore          4
	//*  27   50:aload_0         
	//*  28   51:iconst_3        
	//*  29   52:invokevirtual   #254 <Method int AudioManager.getStreamVolume(int)>
	//*  30   55:istore          5
	//*  31   57:aload_0         
	//*  32   58:iconst_4        
	//*  33   59:invokevirtual   #254 <Method int AudioManager.getStreamVolume(int)>
	//*  34   62:istore          6
	//*  35   64:aload           7
	//*  36   66:ldc2            #256 <String "ringermode">
	//*  37   69:iload_1         
	//*  38   70:invokestatic    #259 <Method String String.valueOf(int)>
	//*  39   73:invokevirtual   #263 <Method JSONObject JSONObject.put(String, Object)>
	//*  40   76:pop             
	//*  41   77:aload           7
	//*  42   79:ldc2            #265 <String "call">
	//*  43   82:iload_2         
	//*  44   83:invokestatic    #259 <Method String String.valueOf(int)>
	//*  45   86:invokevirtual   #263 <Method JSONObject JSONObject.put(String, Object)>
	//*  46   89:pop             
	//*  47   90:aload           7
	//*  48   92:ldc2            #267 <String "system">
	//*  49   95:iload_3         
	//*  50   96:invokestatic    #259 <Method String String.valueOf(int)>
	//*  51   99:invokevirtual   #263 <Method JSONObject JSONObject.put(String, Object)>
	//*  52  102:pop             
	//*  53  103:aload           7
	//*  54  105:ldc2            #269 <String "ring">
	//*  55  108:iload           4
	//*  56  110:invokestatic    #259 <Method String String.valueOf(int)>
	//*  57  113:invokevirtual   #263 <Method JSONObject JSONObject.put(String, Object)>
	//*  58  116:pop             
	//*  59  117:aload           7
	//*  60  119:ldc2            #271 <String "music">
	//*  61  122:iload           5
	//*  62  124:invokestatic    #259 <Method String String.valueOf(int)>
	//*  63  127:invokevirtual   #263 <Method JSONObject JSONObject.put(String, Object)>
	//*  64  130:pop             
	//*  65  131:aload           7
	//*  66  133:ldc2            #273 <String "alarm">
	//*  67  136:iload           6
	//*  68  138:invokestatic    #259 <Method String String.valueOf(int)>
	//*  69  141:invokevirtual   #263 <Method JSONObject JSONObject.put(String, Object)>
	//*  70  144:pop             
	//*  71  145:aload           7
	//*  72  147:invokevirtual   #274 <Method String JSONObject.toString()>
	//*  73  150:areturn         
	//*  74  151:astore_0        
	//*  75  152:goto            145
			j = 0;
	//   76  155:iconst_0        
	//   77  156:istore_1        
		try
		{
			int i1 = ((AudioManager) (context)).getStreamVolume(0);
			int j1 = ((AudioManager) (context)).getStreamVolume(1);
			int k1 = ((AudioManager) (context)).getStreamVolume(2);
			int l1 = ((AudioManager) (context)).getStreamVolume(3);
			int i2 = ((AudioManager) (context)).getStreamVolume(4);
			jsonobject.put("ringermode", ((Object) (String.valueOf(j))));
			jsonobject.put("call", ((Object) (String.valueOf(i1))));
			jsonobject.put("system", ((Object) (String.valueOf(j1))));
			jsonobject.put("ring", ((Object) (String.valueOf(k1))));
			jsonobject.put("music", ((Object) (String.valueOf(l1))));
			jsonobject.put("alarm", ((Object) (String.valueOf(i2))));
		}
		// Misplaced declaration of an exception variable
		catch(Context context) { }
		return jsonobject.toString();
	//*  78  157:goto            31
	}

	public static String f()
	{
		BufferedReader bufferedreader;
		Object obj1;
		FileReader filereader;
		BufferedReader bufferedreader1;
		FileReader filereader2;
		BufferedReader bufferedreader2;
		filereader2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		filereader = null;
	//    2    3:aconst_null     
	//    3    4:astore_2        
		bufferedreader2 = null;
	//    4    5:aconst_null     
	//    5    6:astore          6
		bufferedreader = null;
	//    6    8:aconst_null     
	//    7    9:astore_0        
		obj1 = ((Object) (bufferedreader));
	//    8   10:aload_0         
	//    9   11:astore_1        
		bufferedreader1 = bufferedreader2;
	//   10   12:aload           6
	//   11   14:astore_3        
		FileReader filereader1 = new FileReader("/proc/cpuinfo");
	//   12   15:new             #277 <Class FileReader>
	//   13   18:dup             
	//   14   19:ldc1            #168 <String "/proc/cpuinfo">
	//   15   21:invokespecial   #278 <Method void FileReader(String)>
	//   16   24:astore          4
		filereader = filereader1;
	//   17   26:aload           4
	//   18   28:astore_2        
		obj1 = ((Object) (bufferedreader));
	//   19   29:aload_0         
	//   20   30:astore_1        
		filereader2 = filereader1;
	//   21   31:aload           4
	//   22   33:astore          5
		bufferedreader1 = bufferedreader2;
	//   23   35:aload           6
	//   24   37:astore_3        
		bufferedreader2 = new BufferedReader(((java.io.Reader) (filereader1)));
	//   25   38:new             #280 <Class BufferedReader>
	//   26   41:dup             
	//   27   42:aload           4
	//   28   44:invokespecial   #281 <Method void BufferedReader(java.io.Reader)>
	//   29   47:astore          6
		bufferedreader = bufferedreader2;
	//   30   49:aload           6
	//   31   51:astore_0        
		filereader = filereader1;
	//   32   52:aload           4
	//   33   54:astore_2        
		obj1 = ((Object) (bufferedreader));
	//   34   55:aload_0         
	//   35   56:astore_1        
		filereader2 = filereader1;
	//   36   57:aload           4
	//   37   59:astore          5
		bufferedreader1 = bufferedreader;
	//   38   61:aload_0         
	//   39   62:astore_3        
		String as[] = bufferedreader2.readLine().split(":\\s+", 2);
	//   40   63:aload           6
	//   41   65:invokevirtual   #282 <Method String BufferedReader.readLine()>
	//   42   68:ldc2            #284 <String ":\\s+">
	//   43   71:iconst_2        
	//   44   72:invokevirtual   #288 <Method String[] String.split(String, int)>
	//   45   75:astore          6
		if(as == null)
			break MISSING_BLOCK_LABEL_116;
	//   46   77:aload           6
	//   47   79:ifnull          116
		filereader = filereader1;
	//   48   82:aload           4
	//   49   84:astore_2        
		obj1 = ((Object) (bufferedreader));
	//   50   85:aload_0         
	//   51   86:astore_1        
		filereader2 = filereader1;
	//   52   87:aload           4
	//   53   89:astore          5
		bufferedreader1 = bufferedreader;
	//   54   91:aload_0         
	//   55   92:astore_3        
		if(as.length > 1)
	//*  56   93:aload           6
	//*  57   95:arraylength     
	//*  58   96:iconst_1        
	//*  59   97:icmple          116
		{
			obj1 = ((Object) (as[1]));
	//   60  100:aload           6
	//   61  102:iconst_1        
	//   62  103:aaload          
	//   63  104:astore_1        
			Object obj;
			try
			{
				filereader1.close();
	//   64  105:aload           4
	//   65  107:invokevirtual   #289 <Method void FileReader.close()>
			}
	//*  66  110:aload_0         
	//*  67  111:invokevirtual   #290 <Method void BufferedReader.close()>
	//*  68  114:aload_1         
	//*  69  115:areturn         
	//*  70  116:aload           4
	//*  71  118:invokevirtual   #289 <Method void FileReader.close()>
	//*  72  121:aload_0         
	//*  73  122:invokevirtual   #290 <Method void BufferedReader.close()>
	//*  74  125:goto            174
	//*  75  128:goto            174
	//*  76  131:aload           5
	//*  77  133:ifnull          141
	//*  78  136:aload           5
	//*  79  138:invokevirtual   #289 <Method void FileReader.close()>
	//*  80  141:aload_3         
	//*  81  142:ifnull          174
	//*  82  145:aload_3         
	//*  83  146:invokevirtual   #290 <Method void BufferedReader.close()>
	//*  84  149:goto            174
	//*  85  152:goto            174
	//*  86  155:astore_0        
	//*  87  156:aload_2         
	//*  88  157:ifnull          164
	//*  89  160:aload_2         
	//*  90  161:invokevirtual   #289 <Method void FileReader.close()>
	//*  91  164:aload_1         
	//*  92  165:ifnull          172
	//*  93  168:aload_1         
	//*  94  169:invokevirtual   #290 <Method void BufferedReader.close()>
	//*  95  172:aload_0         
	//*  96  173:athrow          
	//*  97  174:ldc1            #55  <String "">
	//*  98  176:areturn         
	//*  99  177:astore_0        
	//* 100  178:goto            131
			catch(Throwable throwable6) { }
	//  101  181:astore_2        
			try
			{
				bufferedreader.close();
			}
	//* 102  182:goto            110
			catch(Throwable throwable)
	//* 103  185:astore_0        
			{
				return ((String) (obj1));
	//  104  186:aload_1         
	//  105  187:areturn         
			}
			return ((String) (obj1));
		}
		try
		{
			filereader1.close();
		}
		catch(Throwable throwable4) { }
	//  106  188:astore_1        
		try
		{
			bufferedreader.close();
		}
	//* 107  189:goto            121
		catch(Throwable throwable1) { }
	//  108  192:astore_0        
		  goto _L1
_L2:
		if(filereader2 != null)
			try
			{
				filereader2.close();
			}
	//* 109  193:goto            128
			catch(Throwable throwable2) { }
	//  110  196:astore_0        
		if(bufferedreader1 != null)
			try
			{
				bufferedreader1.close();
			}
	//* 111  197:goto            141
			catch(Throwable throwable3) { }
	//  112  200:astore_0        
		  goto _L1
		obj;
		if(filereader != null)
			try
			{
				filereader.close();
			}
	//* 113  201:goto            152
			catch(Throwable throwable7) { }
	//  114  204:astore_2        
		if(obj1 != null)
			try
			{
				((BufferedReader) (obj1)).close();
			}
	//* 115  205:goto            164
			catch(Throwable throwable5) { }
	//  116  208:astore_1        
		throw obj;
_L1:
		return "";
		obj;
		  goto _L2
	//* 117  209:goto            172
	}

	public static String f(Context context)
	{
		try
		{
			context = ((Context) (context.getResources().getDisplayMetrics()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #294 <Method Resources Context.getResources()>
	//    2    4:invokevirtual   #300 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    3    7:astore_0        
			context = ((Context) ((new StringBuilder()).append(Integer.toString(((DisplayMetrics) (context)).widthPixels)).append("*").append(Integer.toString(((DisplayMetrics) (context)).heightPixels)).toString()));
	//    4    8:new             #302 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #303 <Method void StringBuilder()>
	//    7   15:aload_0         
	//    8   16:getfield        #309 <Field int DisplayMetrics.widthPixels>
	//    9   19:invokestatic    #313 <Method String Integer.toString(int)>
	//   10   22:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:ldc2            #319 <String "*">
	//   12   28:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   13   31:aload_0         
	//   14   32:getfield        #322 <Field int DisplayMetrics.heightPixels>
	//   15   35:invokestatic    #313 <Method String Integer.toString(int)>
	//   16   38:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   17   41:invokevirtual   #323 <Method String StringBuilder.toString()>
	//   18   44:astore_0        
		}
	//*  19   45:aload_0         
	//*  20   46:areturn         
	//*  21   47:ldc1            #55  <String "">
	//*  22   49:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return "";
		}
		return ((String) (context));
	//*  23   50:astore_0        
	//*  24   51:goto            47
	}

	public static String g()
	{
		long l2;
		BufferedReader bufferedreader;
		BufferedReader bufferedreader1;
		BufferedReader bufferedreader2;
		FileReader filereader;
		FileReader filereader1;
		Object obj1;
		l2 = 0L;
	//    0    0:lconst_0        
	//    1    1:lstore_3        
		obj1 = null;
	//    2    2:aconst_null     
	//    3    3:astore          11
		bufferedreader = null;
	//    4    5:aconst_null     
	//    5    6:astore          5
		filereader1 = null;
	//    6    8:aconst_null     
	//    7    9:astore          9
		filereader = null;
	//    8   11:aconst_null     
	//    9   12:astore          8
		bufferedreader1 = bufferedreader;
	//   10   14:aload           5
	//   11   16:astore          6
		bufferedreader2 = ((BufferedReader) (obj1));
	//   12   18:aload           11
	//   13   20:astore          7
		FileReader filereader2 = new FileReader("/proc/meminfo");
	//   14   22:new             #277 <Class FileReader>
	//   15   25:dup             
	//   16   26:ldc2            #326 <String "/proc/meminfo">
	//   17   29:invokespecial   #278 <Method void FileReader(String)>
	//   18   32:astore          10
		bufferedreader1 = bufferedreader;
	//   19   34:aload           5
	//   20   36:astore          6
		filereader = filereader2;
	//   21   38:aload           10
	//   22   40:astore          8
		bufferedreader2 = ((BufferedReader) (obj1));
	//   23   42:aload           11
	//   24   44:astore          7
		filereader1 = filereader2;
	//   25   46:aload           10
	//   26   48:astore          9
		obj1 = ((Object) (new BufferedReader(((java.io.Reader) (filereader2)), 8192)));
	//   27   50:new             #280 <Class BufferedReader>
	//   28   53:dup             
	//   29   54:aload           10
	//   30   56:sipush          8192
	//   31   59:invokespecial   #329 <Method void BufferedReader(java.io.Reader, int)>
	//   32   62:astore          11
		bufferedreader = ((BufferedReader) (obj1));
	//   33   64:aload           11
	//   34   66:astore          5
		bufferedreader1 = bufferedreader;
	//   35   68:aload           5
	//   36   70:astore          6
		filereader = filereader2;
	//   37   72:aload           10
	//   38   74:astore          8
		bufferedreader2 = bufferedreader;
	//   39   76:aload           5
	//   40   78:astore          7
		filereader1 = filereader2;
	//   41   80:aload           10
	//   42   82:astore          9
		obj1 = ((Object) (((BufferedReader) (obj1)).readLine()));
	//   43   84:aload           11
	//   44   86:invokevirtual   #282 <Method String BufferedReader.readLine()>
	//   45   89:astore          11
		long l1;
		l1 = l2;
	//   46   91:lload_3         
	//   47   92:lstore_1        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_131;
	//   48   93:aload           11
	//   49   95:ifnull          131
		bufferedreader1 = bufferedreader;
	//   50   98:aload           5
	//   51  100:astore          6
		filereader = filereader2;
	//   52  102:aload           10
	//   53  104:astore          8
		bufferedreader2 = bufferedreader;
	//   54  106:aload           5
	//   55  108:astore          7
		filereader1 = filereader2;
	//   56  110:aload           10
	//   57  112:astore          9
		int j = Integer.parseInt(((String) (obj1)).split("\\s+")[1]);
	//   58  114:aload           11
	//   59  116:ldc2            #331 <String "\\s+">
	//   60  119:invokevirtual   #334 <Method String[] String.split(String)>
	//   61  122:iconst_1        
	//   62  123:aaload          
	//   63  124:invokestatic    #337 <Method int Integer.parseInt(String)>
	//   64  127:istore_0        
		l1 = j;
	//   65  128:iload_0         
	//   66  129:i2l             
	//   67  130:lstore_1        
		Object obj;
		try
		{
			filereader2.close();
	//   68  131:aload           10
	//   69  133:invokevirtual   #289 <Method void FileReader.close()>
		}
	//*  70  136:aload           5
	//*  71  138:invokevirtual   #290 <Method void BufferedReader.close()>
	//*  72  141:goto            202
	//*  73  144:goto            202
	//*  74  147:aload           9
	//*  75  149:ifnull          157
	//*  76  152:aload           9
	//*  77  154:invokevirtual   #289 <Method void FileReader.close()>
	//*  78  157:aload           7
	//*  79  159:ifnull          167
	//*  80  162:aload           7
	//*  81  164:invokevirtual   #290 <Method void BufferedReader.close()>
	//*  82  167:lload_3         
	//*  83  168:lstore_1        
	//*  84  169:goto            202
	//*  85  172:lload_3         
	//*  86  173:lstore_1        
	//*  87  174:goto            202
	//*  88  177:astore          5
	//*  89  179:aload           8
	//*  90  181:ifnull          189
	//*  91  184:aload           8
	//*  92  186:invokevirtual   #289 <Method void FileReader.close()>
	//*  93  189:aload           6
	//*  94  191:ifnull          199
	//*  95  194:aload           6
	//*  96  196:invokevirtual   #290 <Method void BufferedReader.close()>
	//*  97  199:aload           5
	//*  98  201:athrow          
	//*  99  202:lload_1         
	//* 100  203:invokestatic    #103 <Method String String.valueOf(long)>
	//* 101  206:areturn         
	//* 102  207:astore          5
	//* 103  209:goto            147
		catch(Throwable throwable3) { }
	//  104  212:astore          6
		try
		{
			bufferedreader.close();
		}
	//* 105  214:goto            136
		catch(Throwable throwable) { }
	//  106  217:astore          5
		  goto _L1
_L2:
		if(filereader1 != null)
			try
			{
				filereader1.close();
			}
	//* 107  219:goto            144
			catch(Throwable throwable1) { }
	//  108  222:astore          5
		if(bufferedreader2 == null)
			break MISSING_BLOCK_LABEL_167;
		bufferedreader2.close();
		l1 = l2;
		  goto _L1
_L3:
		l1 = l2;
		  goto _L1
		obj;
		Throwable throwable2;
		if(filereader != null)
			try
			{
				filereader.close();
			}
	//* 109  224:goto            157
	//* 110  227:astore          5
	//* 111  229:goto            172
			catch(Throwable throwable5) { }
	//  112  232:astore          7
		if(bufferedreader1 != null)
			try
			{
				bufferedreader1.close();
			}
	//* 113  234:goto            189
			catch(Throwable throwable4) { }
	//  114  237:astore          6
		throw obj;
_L1:
		return String.valueOf(l1);
		obj;
		  goto _L2
		throwable2;
		  goto _L3
	//* 115  239:goto            199
	}

	public static String g(Context context)
	{
		Object obj;
		Object obj1;
		Object obj2;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		obj2 = null;
	//    2    2:aconst_null     
	//    3    3:astore_3        
		obj = ((Object) (obj1));
	//    4    4:aload_2         
	//    5    5:astore_1        
		if(context == null)
			break MISSING_BLOCK_LABEL_124;
	//    6    6:aload_0         
	//    7    7:ifnull          124
		obj = ((Object) ((SensorManager)context.getSystemService("sensor")));
	//    8   10:aload_0         
	//    9   11:ldc2            #339 <String "sensor">
	//   10   14:invokevirtual   #115 <Method Object Context.getSystemService(String)>
	//   11   17:checkcast       #341 <Class SensorManager>
	//   12   20:astore_1        
		context = ((Context) (obj2));
	//   13   21:aload_3         
	//   14   22:astore_0        
		if(obj == null)
			break MISSING_BLOCK_LABEL_122;
	//   15   23:aload_1         
	//   16   24:ifnull          122
		obj = ((Object) (((SensorManager) (obj)).getSensorList(-1)));
	//   17   27:aload_1         
	//   18   28:iconst_m1       
	//   19   29:invokevirtual   #345 <Method List SensorManager.getSensorList(int)>
	//   20   32:astore_1        
		context = ((Context) (obj2));
	//   21   33:aload_3         
	//   22   34:astore_0        
		if(obj == null)
			break MISSING_BLOCK_LABEL_122;
	//   23   35:aload_1         
	//   24   36:ifnull          122
		context = ((Context) (obj2));
	//   25   39:aload_3         
	//   26   40:astore_0        
		if(((List) (obj)).size() <= 0)
			break MISSING_BLOCK_LABEL_122;
	//   27   41:aload_1         
	//   28   42:invokeinterface #350 <Method int List.size()>
	//   29   47:ifle            122
		context = ((Context) (new StringBuilder()));
	//   30   50:new             #302 <Class StringBuilder>
	//   31   53:dup             
	//   32   54:invokespecial   #303 <Method void StringBuilder()>
	//   33   57:astore_0        
		Sensor sensor;
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((StringBuilder) (context)).append(sensor.getVendor()))
	//*  34   58:aload_1         
	//*  35   59:invokeinterface #354 <Method Iterator List.iterator()>
	//*  36   64:astore_1        
	//*  37   65:aload_1         
	//*  38   66:invokeinterface #359 <Method boolean Iterator.hasNext()>
	//*  39   71:ifeq            114
		{
			sensor = (Sensor)((Iterator) (obj)).next();
	//   40   74:aload_1         
	//   41   75:invokeinterface #362 <Method Object Iterator.next()>
	//   42   80:checkcast       #364 <Class Sensor>
	//   43   83:astore_3        
			((StringBuilder) (context)).append(sensor.getName());
	//   44   84:aload_0         
	//   45   85:aload_3         
	//   46   86:invokevirtual   #367 <Method String Sensor.getName()>
	//   47   89:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   48   92:pop             
			((StringBuilder) (context)).append(sensor.getVersion());
	//   49   93:aload_0         
	//   50   94:aload_3         
	//   51   95:invokevirtual   #370 <Method int Sensor.getVersion()>
	//   52   98:invokevirtual   #373 <Method StringBuilder StringBuilder.append(int)>
	//   53  101:pop             
		}

	//   54  102:aload_0         
	//   55  103:aload_3         
	//   56  104:invokevirtual   #376 <Method String Sensor.getVendor()>
	//   57  107:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   58  110:pop             
	//*  59  111:goto            65
		context = ((Context) (ei.d(((StringBuilder) (context)).toString())));
	//   60  114:aload_0         
	//   61  115:invokevirtual   #323 <Method String StringBuilder.toString()>
	//   62  118:invokestatic    #379 <Method String ei.d(String)>
	//   63  121:astore_0        
		obj = ((Object) (context));
	//   64  122:aload_0         
	//   65  123:astore_1        
_L2:
		context = ((Context) (obj));
	//   66  124:aload_1         
	//   67  125:astore_0        
		if(obj == null)
	//*  68  126:aload_1         
	//*  69  127:ifnonnull       133
			context = "";
	//   70  130:ldc1            #55  <String "">
	//   71  132:astore_0        
		return ((String) (context));
	//   72  133:aload_0         
	//   73  134:areturn         
		context;
	//   74  135:astore_0        
		obj = ((Object) (obj1));
	//   75  136:aload_2         
	//   76  137:astore_1        
		if(true) goto _L2; else goto _L1
	//   77  138:goto            124
_L1:
	}

	public static String h()
	{
		long l1 = 0L;
	//    0    0:lconst_0        
	//    1    1:lstore_1        
		int j;
		long l2;
		StatFs statfs = new StatFs(Environment.getDataDirectory().getPath());
	//    2    2:new             #78  <Class StatFs>
	//    3    5:dup             
	//    4    6:invokestatic    #84  <Method File Environment.getDataDirectory()>
	//    5    9:invokevirtual   #89  <Method String File.getPath()>
	//    6   12:invokespecial   #92  <Method void StatFs(String)>
	//    7   15:astore          5
		l2 = statfs.getBlockSize();
	//    8   17:aload           5
	//    9   19:invokevirtual   #96  <Method int StatFs.getBlockSize()>
	//   10   22:i2l             
	//   11   23:lstore_3        
		j = statfs.getBlockCount();
	//   12   24:aload           5
	//   13   26:invokevirtual   #383 <Method int StatFs.getBlockCount()>
	//   14   29:istore_0        
		l1 = (long)j * l2;
	//   15   30:iload_0         
	//   16   31:i2l             
	//   17   32:lload_3         
	//   18   33:lmul            
	//   19   34:lstore_1        
_L2:
		return String.valueOf(l1);
	//   20   35:lload_1         
	//   21   36:invokestatic    #103 <Method String String.valueOf(long)>
	//   22   39:areturn         
		Throwable throwable;
		throwable;
	//   23   40:astore          5
		if(true) goto _L2; else goto _L1
	//   24   42:goto            35
_L1:
	}

	public static String h(Context context)
	{
		String s1;
		String s2;
		if(d(context, "android.permission.READ_PHONE_STATE"))
	//*   0    0:aload_0         
	//*   1    1:ldc1            #105 <String "android.permission.READ_PHONE_STATE">
	//*   2    3:invokestatic    #109 <Method boolean d(Context, String)>
	//*   3    6:ifeq            12
			return "";
	//    4    9:ldc1            #55  <String "">
	//    5   11:areturn         
		s2 = "";
	//    6   12:ldc1            #55  <String "">
	//    7   14:astore_2        
		s1 = s2;
	//    8   15:aload_2         
	//    9   16:astore_1        
		if(context == null)
			break MISSING_BLOCK_LABEL_42;
	//   10   17:aload_0         
	//   11   18:ifnull          42
		context = ((Context) ((TelephonyManager)context.getSystemService("phone")));
	//   12   21:aload_0         
	//   13   22:ldc1            #111 <String "phone">
	//   14   24:invokevirtual   #115 <Method Object Context.getSystemService(String)>
	//   15   27:checkcast       #117 <Class TelephonyManager>
	//   16   30:astore_0        
		s1 = s2;
	//   17   31:aload_2         
	//   18   32:astore_1        
		if(context != null)
	//*  19   33:aload_0         
	//*  20   34:ifnull          42
			try
			{
				s1 = ((TelephonyManager) (context)).getLine1Number();
	//   21   37:aload_0         
	//   22   38:invokevirtual   #386 <Method String TelephonyManager.getLine1Number()>
	//   23   41:astore_1        
			}
	//*  24   42:aload_1         
	//*  25   43:astore_0        
	//*  26   44:aload_1         
	//*  27   45:ifnonnull       51
	//*  28   48:ldc1            #55  <String "">
	//*  29   50:astore_0        
	//*  30   51:aload_0         
	//*  31   52:areturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  32   53:astore_0        
			{
				s1 = s2;
	//   33   54:aload_2         
	//   34   55:astore_1        
			}
		context = ((Context) (s1));
		if(s1 == null)
			context = "";
		return ((String) (context));
	//*  35   56:goto            42
	}

	public static String i()
	{
		String s1 = w();
	//    0    0:invokestatic    #390 <Method String w()>
	//    1    3:astore_0        
		if(!ei.b(s1))
	//*   2    4:aload_0         
	//*   3    5:invokestatic    #393 <Method boolean ei.b(String)>
	//*   4    8:ifne            13
			return s1;
	//    5   11:aload_0         
	//    6   12:areturn         
		else
			return z();
	//    7   13:invokestatic    #396 <Method String z()>
	//    8   16:areturn         
	}

	public static String i(Context context)
	{
		try
		{
			context = ((Context) (context.getResources().getDisplayMetrics()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #294 <Method Resources Context.getResources()>
	//    2    4:invokevirtual   #300 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    3    7:astore_0        
			context = ((Context) ((new StringBuilder()).append(((DisplayMetrics) (context)).widthPixels).toString()));
	//    4    8:new             #302 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #303 <Method void StringBuilder()>
	//    7   15:aload_0         
	//    8   16:getfield        #309 <Field int DisplayMetrics.widthPixels>
	//    9   19:invokevirtual   #373 <Method StringBuilder StringBuilder.append(int)>
	//   10   22:invokevirtual   #323 <Method String StringBuilder.toString()>
	//   11   25:astore_0        
		}
	//*  12   26:aload_0         
	//*  13   27:areturn         
	//*  14   28:ldc1            #55  <String "">
	//*  15   30:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return "";
		}
		return ((String) (context));
	//*  16   31:astore_0        
	//*  17   32:goto            28
	}

	public static String k()
	{
		long l1;
		long l2;
		l2 = 0L;
	//    0    0:lconst_0        
	//    1    1:lstore_3        
		l1 = l2;
	//    2    2:lload_3         
	//    3    3:lstore_1        
		int j;
		if(!"mounted".equals(((Object) (Environment.getExternalStorageState()))))
			break MISSING_BLOCK_LABEL_48;
	//    4    4:ldc1            #233 <String "mounted">
	//    5    6:invokestatic    #236 <Method String Environment.getExternalStorageState()>
	//    6    9:invokevirtual   #217 <Method boolean String.equals(Object)>
	//    7   12:ifeq            48
		StatFs statfs = new StatFs(Environment.getExternalStorageDirectory().getPath());
	//    8   15:new             #78  <Class StatFs>
	//    9   18:dup             
	//   10   19:invokestatic    #400 <Method File Environment.getExternalStorageDirectory()>
	//   11   22:invokevirtual   #89  <Method String File.getPath()>
	//   12   25:invokespecial   #92  <Method void StatFs(String)>
	//   13   28:astore          5
		l1 = statfs.getBlockSize();
	//   14   30:aload           5
	//   15   32:invokevirtual   #96  <Method int StatFs.getBlockSize()>
	//   16   35:i2l             
	//   17   36:lstore_1        
		j = statfs.getBlockCount();
	//   18   37:aload           5
	//   19   39:invokevirtual   #383 <Method int StatFs.getBlockCount()>
	//   20   42:istore_0        
		l1 *= j;
	//   21   43:lload_1         
	//   22   44:iload_0         
	//   23   45:i2l             
	//   24   46:lmul            
	//   25   47:lstore_1        
_L2:
		return String.valueOf(l1);
	//   26   48:lload_1         
	//   27   49:invokestatic    #103 <Method String String.valueOf(long)>
	//   28   52:areturn         
		Throwable throwable;
		throwable;
	//   29   53:astore          5
		l1 = l2;
	//   30   55:lload_3         
	//   31   56:lstore_1        
		if(true) goto _L2; else goto _L1
	//   32   57:goto            48
_L1:
	}

	public static String k(Context context)
	{
		JSONArray jsonarray;
		jsonarray = new JSONArray();
	//    0    0:new             #402 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #403 <Method void JSONArray()>
	//    3    7:astore_1        
		if(context == null)
			break MISSING_BLOCK_LABEL_129;
	//    4    8:aload_0         
	//    5    9:ifnull          129
		context = ((Context) ((SensorManager)context.getSystemService("sensor")));
	//    6   12:aload_0         
	//    7   13:ldc2            #339 <String "sensor">
	//    8   16:invokevirtual   #115 <Method Object Context.getSystemService(String)>
	//    9   19:checkcast       #341 <Class SensorManager>
	//   10   22:astore_0        
		if(context == null)
			break MISSING_BLOCK_LABEL_129;
	//   11   23:aload_0         
	//   12   24:ifnull          129
		context = ((Context) (((SensorManager) (context)).getSensorList(-1)));
	//   13   27:aload_0         
	//   14   28:iconst_m1       
	//   15   29:invokevirtual   #345 <Method List SensorManager.getSensorList(int)>
	//   16   32:astore_0        
		if(context == null)
			break MISSING_BLOCK_LABEL_129;
	//   17   33:aload_0         
	//   18   34:ifnull          129
		if(((List) (context)).size() <= 0)
			break MISSING_BLOCK_LABEL_129;
	//   19   37:aload_0         
	//   20   38:invokeinterface #350 <Method int List.size()>
	//   21   43:ifle            129
		context = ((Context) (((List) (context)).iterator()));
	//   22   46:aload_0         
	//   23   47:invokeinterface #354 <Method Iterator List.iterator()>
	//   24   52:astore_0        
_L2:
		Sensor sensor;
		do
		{
			if(!((Iterator) (context)).hasNext())
				break MISSING_BLOCK_LABEL_129;
	//   25   53:aload_0         
	//   26   54:invokeinterface #359 <Method boolean Iterator.hasNext()>
	//   27   59:ifeq            129
			sensor = (Sensor)((Iterator) (context)).next();
	//   28   62:aload_0         
	//   29   63:invokeinterface #362 <Method Object Iterator.next()>
	//   30   68:checkcast       #364 <Class Sensor>
	//   31   71:astore_2        
		} while(sensor == null);
	//   32   72:aload_2         
	//   33   73:ifnull          126
		JSONObject jsonobject = new JSONObject();
	//   34   76:new             #242 <Class JSONObject>
	//   35   79:dup             
	//   36   80:invokespecial   #243 <Method void JSONObject()>
	//   37   83:astore_3        
		jsonobject.put("name", ((Object) (sensor.getName())));
	//   38   84:aload_3         
	//   39   85:ldc2            #405 <String "name">
	//   40   88:aload_2         
	//   41   89:invokevirtual   #367 <Method String Sensor.getName()>
	//   42   92:invokevirtual   #263 <Method JSONObject JSONObject.put(String, Object)>
	//   43   95:pop             
		jsonobject.put("version", sensor.getVersion());
	//   44   96:aload_3         
	//   45   97:ldc2            #407 <String "version">
	//   46  100:aload_2         
	//   47  101:invokevirtual   #370 <Method int Sensor.getVersion()>
	//   48  104:invokevirtual   #410 <Method JSONObject JSONObject.put(String, int)>
	//   49  107:pop             
		jsonobject.put("vendor", ((Object) (sensor.getVendor())));
	//   50  108:aload_3         
	//   51  109:ldc2            #412 <String "vendor">
	//   52  112:aload_2         
	//   53  113:invokevirtual   #376 <Method String Sensor.getVendor()>
	//   54  116:invokevirtual   #263 <Method JSONObject JSONObject.put(String, Object)>
	//   55  119:pop             
		jsonarray.put(((Object) (jsonobject)));
	//   56  120:aload_1         
	//   57  121:aload_3         
	//   58  122:invokevirtual   #415 <Method JSONArray JSONArray.put(Object)>
	//   59  125:pop             
		if(true) goto _L2; else goto _L1
	//   60  126:goto            53
_L1:
		return jsonarray.toString();
	//   61  129:aload_1         
	//   62  130:invokevirtual   #416 <Method String JSONArray.toString()>
	//   63  133:areturn         
		context;
	//   64  134:astore_0        
		if(true) goto _L1; else goto _L3
_L3:
	//*  65  135:goto            129
	}

	public static String l()
	{
		Throwable throwable;
		String s1;
		try
		{
			long l1 = System.currentTimeMillis() - SystemClock.elapsedRealtime();
	//    0    0:invokestatic    #423 <Method long System.currentTimeMillis()>
	//    1    3:invokestatic    #428 <Method long SystemClock.elapsedRealtime()>
	//    2    6:lsub            
	//    3    7:lstore_0        
			s1 = (new StringBuilder()).append(l1 - l1 % 1000L).toString();
	//    4    8:new             #302 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #303 <Method void StringBuilder()>
	//    7   15:lload_0         
	//    8   16:lload_0         
	//    9   17:ldc2w           #429 <Long 1000L>
	//   10   20:lrem            
	//   11   21:lsub            
	//   12   22:invokevirtual   #433 <Method StringBuilder StringBuilder.append(long)>
	//   13   25:invokevirtual   #323 <Method String StringBuilder.toString()>
	//   14   28:astore_2        
		}
	//*  15   29:aload_2         
	//*  16   30:areturn         
	//*  17   31:ldc1            #55  <String "">
	//*  18   33:areturn         
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			return "";
		}
		return s1;
	//*  19   34:astore_2        
	//*  20   35:goto            31
	}

	public static String l(Context context)
	{
		try
		{
			context = ((Context) (context.getResources().getDisplayMetrics()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #294 <Method Resources Context.getResources()>
	//    2    4:invokevirtual   #300 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    3    7:astore_0        
			context = ((Context) ((new StringBuilder()).append(((DisplayMetrics) (context)).heightPixels).toString()));
	//    4    8:new             #302 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #303 <Method void StringBuilder()>
	//    7   15:aload_0         
	//    8   16:getfield        #322 <Field int DisplayMetrics.heightPixels>
	//    9   19:invokevirtual   #373 <Method StringBuilder StringBuilder.append(int)>
	//   10   22:invokevirtual   #323 <Method String StringBuilder.toString()>
	//   11   25:astore_0        
		}
	//*  12   26:aload_0         
	//*  13   27:areturn         
	//*  14   28:ldc1            #55  <String "">
	//*  15   30:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return "";
		}
		return ((String) (context));
	//*  16   31:astore_0        
	//*  17   32:goto            28
	}

	public static String m()
	{
		String s1 = "";
	//    0    0:ldc1            #55  <String "">
	//    1    2:astore_0        
		Object obj;
		obj = ((Object) (Class.forName("android.os.SystemProperties")));
	//    2    3:ldc2            #436 <String "android.os.SystemProperties">
	//    3    6:invokestatic    #440 <Method Class Class.forName(String)>
	//    4    9:astore_1        
		Object obj1 = ((Class) (obj)).newInstance();
	//    5   10:aload_1         
	//    6   11:invokevirtual   #443 <Method Object Class.newInstance()>
	//    7   14:astore_2        
		obj = ((Object) ((String)((Class) (obj)).getMethod("get", new Class[] {
			java/lang/String, java/lang/String
		}).invoke(obj1, new Object[] {
			"gsm.version.baseband", "no message"
		})));
	//    8   15:aload_1         
	//    9   16:ldc2            #444 <String "get">
	//   10   19:iconst_2        
	//   11   20:anewarray       Class[]
	//   12   23:dup             
	//   13   24:iconst_0        
	//   14   25:ldc1            #50  <Class String>
	//   15   27:aastore         
	//   16   28:dup             
	//   17   29:iconst_1        
	//   18   30:ldc1            #50  <Class String>
	//   19   32:aastore         
	//   20   33:invokevirtual   #447 <Method Method Class.getMethod(String, Class[])>
	//   21   36:aload_2         
	//   22   37:iconst_2        
	//   23   38:anewarray       Object[]
	//   24   41:dup             
	//   25   42:iconst_0        
	//   26   43:ldc2            #449 <String "gsm.version.baseband">
	//   27   46:aastore         
	//   28   47:dup             
	//   29   48:iconst_1        
	//   30   49:ldc2            #451 <String "no message">
	//   31   52:aastore         
	//   32   53:invokevirtual   #158 <Method Object Method.invoke(Object, Object[])>
	//   33   56:checkcast       #50  <Class String>
	//   34   59:astore_1        
		s1 = ((String) (obj));
	//   35   60:aload_1         
	//   36   61:astore_0        
_L2:
		String s2 = s1;
	//   37   62:aload_0         
	//   38   63:astore_1        
		if(s1 == null)
	//*  39   64:aload_0         
	//*  40   65:ifnonnull       71
			s2 = "";
	//   41   68:ldc1            #55  <String "">
	//   42   70:astore_1        
		return s2;
	//   43   71:aload_1         
	//   44   72:areturn         
		Throwable throwable;
		throwable;
	//   45   73:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  46   74:goto            62
	}

	public static String m(Context context)
	{
		Object obj = "";
	//    0    0:ldc1            #55  <String "">
	//    1    2:astore_1        
		try
		{
			context = ((Context) (android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id")));
	//    2    3:aload_0         
	//    3    4:invokevirtual   #63  <Method android.content.ContentResolver Context.getContentResolver()>
	//    4    7:ldc2            #453 <String "android_id">
	//    5   10:invokestatic    #459 <Method String android.provider.Settings$Secure.getString(android.content.ContentResolver, String)>
	//    6   13:astore_0        
		}
	//*   7   14:aload_0         
	//*   8   15:astore_1        
	//*   9   16:aload_0         
	//*  10   17:ifnonnull       23
	//*  11   20:ldc1            #55  <String "">
	//*  12   22:astore_1        
	//*  13   23:aload_1         
	//*  14   24:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  15   25:astore_0        
		{
			context = ((Context) (obj));
	//   16   26:aload_1         
	//   17   27:astore_0        
		}
		obj = ((Object) (context));
		if(context == null)
			obj = "";
		return ((String) (obj));
	//*  18   28:goto            14
	}

	public static String n()
	{
		String s1 = "";
	//    0    0:ldc1            #55  <String "">
	//    1    2:astore_0        
		String s2 = Build.SERIAL;
	//    2    3:getstatic       #466 <Field String Build.SERIAL>
	//    3    6:astore_1        
		s1 = s2;
	//    4    7:aload_1         
	//    5    8:astore_0        
_L2:
		String s3 = s1;
	//    6    9:aload_0         
	//    7   10:astore_1        
		if(s1 == null)
	//*   8   11:aload_0         
	//*   9   12:ifnonnull       18
			s3 = "";
	//   10   15:ldc1            #55  <String "">
	//   11   17:astore_1        
		return s3;
	//   12   18:aload_1         
	//   13   19:areturn         
		Throwable throwable;
		throwable;
	//   14   20:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  15   21:goto            9
	}

	public static String n(Context context)
	{
		if(d(context, "android.permission.READ_PHONE_STATE"))
	//*   0    0:aload_0         
	//*   1    1:ldc1            #105 <String "android.permission.READ_PHONE_STATE">
	//*   2    3:invokestatic    #109 <Method boolean d(Context, String)>
	//*   3    6:ifeq            12
			return "";
	//    4    9:ldc1            #55  <String "">
	//    5   11:areturn         
		Object obj = "";
	//    6   12:ldc1            #55  <String "">
	//    7   14:astore_2        
		int j;
		String s1;
		try
		{
			s1 = ((TelephonyManager)context.getSystemService("phone")).getSimSerialNumber();
	//    8   15:aload_0         
	//    9   16:ldc1            #111 <String "phone">
	//   10   18:invokevirtual   #115 <Method Object Context.getSystemService(String)>
	//   11   21:checkcast       #117 <Class TelephonyManager>
	//   12   24:invokevirtual   #469 <Method String TelephonyManager.getSimSerialNumber()>
	//   13   27:astore_3        
		}
	//*  14   28:aload_3         
	//*  15   29:astore_0        
	//*  16   30:aload_3         
	//*  17   31:ifnull          53
	//*  18   34:aload_0         
	//*  19   35:astore_2        
	//*  20   36:aload_0         
	//*  21   37:ifnull          56
	//*  22   40:aload_0         
	//*  23   41:astore_2        
	//*  24   42:aload_0         
	//*  25   43:invokevirtual   #196 <Method int String.length()>
	//*  26   46:istore_1        
	//*  27   47:aload_0         
	//*  28   48:astore_2        
	//*  29   49:iload_1         
	//*  30   50:ifne            56
	//*  31   53:ldc1            #55  <String "">
	//*  32   55:astore_2        
	//*  33   56:aload_2         
	//*  34   57:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  35   58:astore_0        
		{
			return ((String) (obj));
	//   36   59:aload_2         
	//   37   60:areturn         
		}
		context = ((Context) (s1));
		if(s1 == null)
			break MISSING_BLOCK_LABEL_53;
		obj = ((Object) (context));
		if(context == null)
			break MISSING_BLOCK_LABEL_56;
		obj = ((Object) (context));
		j = ((String) (context)).length();
		obj = ((Object) (context));
		if(j != 0)
			break MISSING_BLOCK_LABEL_56;
		obj = "";
		return ((String) (obj));
	}

	public static String o()
	{
		String s1 = "";
	//    0    0:ldc1            #55  <String "">
	//    1    2:astore_0        
		String s2 = TimeZone.getDefault().getDisplayName(false, 0);
	//    2    3:invokestatic    #476 <Method TimeZone TimeZone.getDefault()>
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokevirtual   #480 <Method String TimeZone.getDisplayName(boolean, int)>
	//    6   11:astore_1        
		s1 = s2;
	//    7   12:aload_1         
	//    8   13:astore_0        
_L2:
		String s3 = s1;
	//    9   14:aload_0         
	//   10   15:astore_1        
		if(s1 == null)
	//*  11   16:aload_0         
	//*  12   17:ifnonnull       23
			s3 = "";
	//   13   20:ldc1            #55  <String "">
	//   14   22:astore_1        
		return s3;
	//   15   23:aload_1         
	//   16   24:areturn         
		Throwable throwable;
		throwable;
	//   17   25:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  18   26:goto            14
	}

	public static String o(Context context)
	{
		if(d(context, "android.permission.BLUETOOTH"))
	//*   0    0:aload_0         
	//*   1    1:ldc2            #482 <String "android.permission.BLUETOOTH">
	//*   2    4:invokestatic    #109 <Method boolean d(Context, String)>
	//*   3    7:ifeq            13
			return "";
	//    4   10:ldc1            #55  <String "">
	//    5   12:areturn         
		String s2 = v();
	//    6   13:invokestatic    #485 <Method String v()>
	//    7   16:astore_2        
		if(s2 == null)
			break MISSING_BLOCK_LABEL_40;
	//    8   17:aload_2         
	//    9   18:ifnull          40
		String s1;
		try
		{
			if(s2.length() == 0)
				break MISSING_BLOCK_LABEL_40;
	//   10   21:aload_2         
	//   11   22:invokevirtual   #196 <Method int String.length()>
	//   12   25:ifeq            40
		}
	//*  13   28:aload_2         
	//*  14   29:astore_1        
	//*  15   30:ldc2            #487 <String "02:00:00:00:00:00">
	//*  16   33:aload_2         
	//*  17   34:invokevirtual   #217 <Method boolean String.equals(Object)>
	//*  18   37:ifeq            51
	//*  19   40:aload_0         
	//*  20   41:invokevirtual   #63  <Method android.content.ContentResolver Context.getContentResolver()>
	//*  21   44:ldc2            #489 <String "bluetooth_address">
	//*  22   47:invokestatic    #459 <Method String android.provider.Settings$Secure.getString(android.content.ContentResolver, String)>
	//*  23   50:astore_1        
	//*  24   51:aload_1         
	//*  25   52:ifnonnull       61
	//*  26   55:ldc1            #55  <String "">
	//*  27   57:astore_1        
	//*  28   58:goto            61
	//*  29   61:aload_1         
	//*  30   62:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  31   63:astore_0        
		{
			return s2;
	//   32   64:aload_2         
	//   33   65:areturn         
		}
		s1 = s2;
		if(!"02:00:00:00:00:00".equals(((Object) (s2))))
			break MISSING_BLOCK_LABEL_51;
		s1 = android.provider.Settings.Secure.getString(context.getContentResolver(), "bluetooth_address");
		if(s1 == null)
			s1 = "";
		return s1;
	}

	public static String p()
	{
		String s1 = "";
	//    0    0:ldc1            #55  <String "">
	//    1    2:astore_0        
		String s2 = Locale.getDefault().toString();
	//    2    3:invokestatic    #495 <Method Locale Locale.getDefault()>
	//    3    6:invokevirtual   #496 <Method String Locale.toString()>
	//    4    9:astore_1        
		s1 = s2;
	//    5   10:aload_1         
	//    6   11:astore_0        
_L2:
		String s3 = s1;
	//    7   12:aload_0         
	//    8   13:astore_1        
		if(s1 == null)
	//*   9   14:aload_0         
	//*  10   15:ifnonnull       21
			s3 = "";
	//   11   18:ldc1            #55  <String "">
	//   12   20:astore_1        
		return s3;
	//   13   21:aload_1         
	//   14   22:areturn         
		Throwable throwable;
		throwable;
	//   15   23:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  16   24:goto            12
	}

	public static String p(Context context)
	{
		if(d(context, "android.permission.ACCESS_WIFI_STATE"))
	//*   0    0:aload_0         
	//*   1    1:ldc2            #498 <String "android.permission.ACCESS_WIFI_STATE">
	//*   2    4:invokestatic    #109 <Method boolean d(Context, String)>
	//*   3    7:ifeq            13
			return "";
	//    4   10:ldc1            #55  <String "">
	//    5   12:areturn         
		Object obj = "";
	//    6   13:ldc1            #55  <String "">
	//    7   15:astore_1        
		String s1;
		try
		{
			s1 = ((WifiManager)context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
	//    8   16:aload_0         
	//    9   17:ldc2            #500 <String "wifi">
	//   10   20:invokevirtual   #115 <Method Object Context.getSystemService(String)>
	//   11   23:checkcast       #502 <Class WifiManager>
	//   12   26:invokevirtual   #506 <Method WifiInfo WifiManager.getConnectionInfo()>
	//   13   29:invokevirtual   #511 <Method String WifiInfo.getMacAddress()>
	//   14   32:astore_2        
		}
	//*  15   33:aload_2         
	//*  16   34:astore_0        
	//*  17   35:aload_2         
	//*  18   36:ifnull          60
	//*  19   39:aload_0         
	//*  20   40:astore_1        
	//*  21   41:aload_0         
	//*  22   42:invokevirtual   #196 <Method int String.length()>
	//*  23   45:ifeq            60
	//*  24   48:aload_0         
	//*  25   49:astore_1        
	//*  26   50:ldc2            #487 <String "02:00:00:00:00:00">
	//*  27   53:aload_0         
	//*  28   54:invokevirtual   #217 <Method boolean String.equals(Object)>
	//*  29   57:ifeq            68
	//*  30   60:aload_0         
	//*  31   61:astore_1        
	//*  32   62:invokestatic    #514 <Method String y()>
	//*  33   65:astore_0        
	//*  34   66:aload_0         
	//*  35   67:areturn         
	//*  36   68:aload_0         
	//*  37   69:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  38   70:astore_0        
		{
			return ((String) (obj));
	//   39   71:aload_1         
	//   40   72:areturn         
		}
		context = ((Context) (s1));
		if(s1 == null)
			break MISSING_BLOCK_LABEL_60;
		obj = ((Object) (context));
		if(((String) (context)).length() == 0)
			break MISSING_BLOCK_LABEL_60;
		obj = ((Object) (context));
		if(!"02:00:00:00:00:00".equals(((Object) (context))))
			break MISSING_BLOCK_LABEL_68;
		obj = ((Object) (context));
		context = ((Context) (y()));
		return ((String) (context));
		return ((String) (context));
	}

	public static String q()
	{
		Throwable throwable;
		String s1;
		try
		{
			s1 = (new StringBuilder()).append(SystemClock.elapsedRealtime()).toString();
	//    0    0:new             #302 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #303 <Method void StringBuilder()>
	//    3    7:invokestatic    #428 <Method long SystemClock.elapsedRealtime()>
	//    4   10:invokevirtual   #433 <Method StringBuilder StringBuilder.append(long)>
	//    5   13:invokevirtual   #323 <Method String StringBuilder.toString()>
	//    6   16:astore_0        
		}
	//*   7   17:aload_0         
	//*   8   18:areturn         
	//*   9   19:ldc1            #55  <String "">
	//*  10   21:areturn         
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			return "";
		}
		return s1;
	//*  11   22:astore_0        
	//*  12   23:goto            19
	}

	public static String q(Context context)
	{
		Object obj;
		obj = "";
	//    0    0:ldc1            #55  <String "">
	//    1    2:astore_1        
		if(d(context, "android.permission.ACCESS_WIFI_STATE"))
	//*   2    3:aload_0         
	//*   3    4:ldc2            #498 <String "android.permission.ACCESS_WIFI_STATE">
	//*   4    7:invokestatic    #109 <Method boolean d(Context, String)>
	//*   5   10:ifeq            16
			return "";
	//    6   13:ldc1            #55  <String "">
	//    7   15:areturn         
		WifiManager wifimanager = (WifiManager)context.getSystemService("wifi");
	//    8   16:aload_0         
	//    9   17:ldc2            #500 <String "wifi">
	//   10   20:invokevirtual   #115 <Method Object Context.getSystemService(String)>
	//   11   23:checkcast       #502 <Class WifiManager>
	//   12   26:astore_2        
		context = ((Context) (obj));
	//   13   27:aload_1         
	//   14   28:astore_0        
		try
		{
			if(wifimanager.isWifiEnabled())
	//*  15   29:aload_2         
	//*  16   30:invokevirtual   #518 <Method boolean WifiManager.isWifiEnabled()>
	//*  17   33:ifeq            44
				context = ((Context) (wifimanager.getConnectionInfo().getBSSID()));
	//   18   36:aload_2         
	//   19   37:invokevirtual   #506 <Method WifiInfo WifiManager.getConnectionInfo()>
	//   20   40:invokevirtual   #521 <Method String WifiInfo.getBSSID()>
	//   21   43:astore_0        
		}
	//*  22   44:aload_0         
	//*  23   45:astore_1        
	//*  24   46:aload_0         
	//*  25   47:ifnonnull       53
	//*  26   50:ldc1            #55  <String "">
	//*  27   52:astore_1        
	//*  28   53:aload_1         
	//*  29   54:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  30   55:astore_0        
		{
			context = ((Context) (obj));
	//   31   56:aload_1         
	//   32   57:astore_0        
		}
		obj = ((Object) (context));
		if(context == null)
			obj = "";
		return ((String) (obj));
	//*  33   58:goto            44
	}

	public static String r()
	{
		Throwable throwable;
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #302 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #303 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("00");
	//    4    8:aload_1         
	//    5    9:ldc2            #524 <String "00">
	//    6   12:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(":");
	//    8   16:aload_1         
	//    9   17:ldc1            #193 <String ":">
	//   10   19:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		for(int j = 0; j <= 0; j++)
	//*  12   23:iconst_0        
	//*  13   24:istore_0        
	//*  14   25:iload_0         
	//*  15   26:ifgt            71
		{
			String s1 = (new String[] {
				"dalvik.system.Taint"
			})[0];
	//   16   29:iconst_1        
	//   17   30:anewarray       String[]
	//   18   33:dup             
	//   19   34:iconst_0        
	//   20   35:ldc2            #526 <String "dalvik.system.Taint">
	//   21   38:aastore         
	//   22   39:iconst_0        
	//   23   40:aaload          
	//   24   41:astore_2        
			try
			{
				Class.forName(s1);
	//   25   42:aload_2         
	//   26   43:invokestatic    #440 <Method Class Class.forName(String)>
	//   27   46:pop             
				stringbuilder.append("1");
	//   28   47:aload_1         
	//   29   48:ldc1            #73  <String "1">
	//   30   50:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   31   53:pop             
			}
	//*  32   54:goto            64
	//*  33   57:aload_1         
	//*  34   58:ldc1            #75  <String "0">
	//*  35   60:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//*  36   63:pop             
	//*  37   64:iload_0         
	//*  38   65:iconst_1        
	//*  39   66:iadd            
	//*  40   67:istore_0        
	//*  41   68:goto            25
	//*  42   71:aload_1         
	//*  43   72:invokevirtual   #323 <Method String StringBuilder.toString()>
	//*  44   75:areturn         
			// Misplaced declaration of an exception variable
			catch(Throwable throwable)
			{
				stringbuilder.append("0");
			}
		}

		return stringbuilder.toString();
	//*  45   76:astore_2        
	//*  46   77:goto            57
	}

	public static String r(Context context)
	{
		int j;
		boolean flag;
		long l1;
		long l2;
		long l3;
		try
		{
			flag = ((KeyguardManager)context.getSystemService("keyguard")).isKeyguardSecure();
	//    0    0:aload_0         
	//    1    1:ldc2            #528 <String "keyguard">
	//    2    4:invokevirtual   #115 <Method Object Context.getSystemService(String)>
	//    3    7:checkcast       #530 <Class KeyguardManager>
	//    4   10:invokevirtual   #533 <Method boolean KeyguardManager.isKeyguardSecure()>
	//    5   13:istore_2        
		}
	//*   6   14:lconst_0        
	//*   7   15:lstore_3        
	//*   8   16:iload_2         
	//*   9   17:ifne            24
	//*  10   20:ldc2            #535 <String "0:0">
	//*  11   23:areturn         
	//*  12   24:iconst_0        
	//*  13   25:istore_1        
	//*  14   26:iload_1         
	//*  15   27:iconst_5        
	//*  16   28:icmpge          104
	//*  17   31:iconst_5        
	//*  18   32:anewarray       String[]
	//*  19   35:dup             
	//*  20   36:iconst_0        
	//*  21   37:ldc2            #537 <String "/data/system/password.key">
	//*  22   40:aastore         
	//*  23   41:dup             
	//*  24   42:iconst_1        
	//*  25   43:ldc2            #539 <String "/data/system/gesture.key">
	//*  26   46:aastore         
	//*  27   47:dup             
	//*  28   48:iconst_2        
	//*  29   49:ldc2            #541 <String "/data/system/gatekeeper.password.key">
	//*  30   52:aastore         
	//*  31   53:dup             
	//*  32   54:iconst_3        
	//*  33   55:ldc2            #543 <String "/data/system/gatekeeper.gesture.key">
	//*  34   58:aastore         
	//*  35   59:dup             
	//*  36   60:iconst_4        
	//*  37   61:ldc2            #545 <String "/data/system/gatekeeper.pattern.key">
	//*  38   64:aastore         
	//*  39   65:iload_1         
	//*  40   66:aaload          
	//*  41   67:astore_0        
	//*  42   68:ldc2w           #546 <Long -1L>
	//*  43   71:lstore          5
	//*  44   73:new             #86  <Class File>
	//*  45   76:dup             
	//*  46   77:aload_0         
	//*  47   78:invokespecial   #169 <Method void File(String)>
	//*  48   81:invokevirtual   #550 <Method long File.lastModified()>
	//*  49   84:lstore          7
	//*  50   86:lload           7
	//*  51   88:lstore          5
	//*  52   90:lload           5
	//*  53   92:lload_3         
	//*  54   93:invokestatic    #556 <Method long Math.max(long, long)>
	//*  55   96:lstore_3        
	//*  56   97:iload_1         
	//*  57   98:iconst_1        
	//*  58   99:iadd            
	//*  59  100:istore_1        
	//*  60  101:goto            26
	//*  61  104:new             #302 <Class StringBuilder>
	//*  62  107:dup             
	//*  63  108:ldc2            #558 <String "1:">
	//*  64  111:invokespecial   #559 <Method void StringBuilder(String)>
	//*  65  114:lload_3         
	//*  66  115:invokevirtual   #433 <Method StringBuilder StringBuilder.append(long)>
	//*  67  118:invokevirtual   #323 <Method String StringBuilder.toString()>
	//*  68  121:astore_0        
	//*  69  122:aload_0         
	//*  70  123:areturn         
	//*  71  124:ldc1            #55  <String "">
	//*  72  126:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return "";
		}
		l1 = 0L;
		if(!flag)
			return "0:0";
		j = 0;
		if(j >= 5) goto _L2; else goto _L1
_L1:
		context = ((Context) ((new String[] {
			"/data/system/password.key", "/data/system/gesture.key", "/data/system/gatekeeper.password.key", "/data/system/gatekeeper.gesture.key", "/data/system/gatekeeper.pattern.key"
		})[j]));
		l2 = -1L;
		l3 = (new File(((String) (context)))).lastModified();
		l2 = l3;
_L4:
		l1 = Math.max(l2, l1);
		j++;
		break MISSING_BLOCK_LABEL_26;
_L2:
		context = ((Context) ((new StringBuilder("1:")).append(l1).toString()));
		return ((String) (context));
	//*  73  127:astore_0        
	//*  74  128:goto            124
		context;
	//   75  131:astore_0        
		if(true) goto _L4; else goto _L3
_L3:
	//*  76  132:goto            90
	}

	public static String s()
	{
		StringBuilder stringbuilder;
		LinkedHashMap linkedhashmap;
		Iterator iterator;
		stringbuilder = new StringBuilder();
	//    0    0:new             #302 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #303 <Method void StringBuilder()>
	//    3    7:astore          6
		linkedhashmap = new LinkedHashMap();
	//    4    9:new             #562 <Class LinkedHashMap>
	//    5   12:dup             
	//    6   13:invokespecial   #563 <Method void LinkedHashMap()>
	//    7   16:astore          7
		((Map) (linkedhashmap)).put("/system/build.prop", "ro.product.name=sdk");
	//    8   18:aload           7
	//    9   20:ldc2            #565 <String "/system/build.prop">
	//   10   23:ldc2            #567 <String "ro.product.name=sdk">
	//   11   26:invokeinterface #572 <Method Object Map.put(Object, Object)>
	//   12   31:pop             
		((Map) (linkedhashmap)).put("/proc/tty/drivers", "goldfish");
	//   13   32:aload           7
	//   14   34:ldc2            #574 <String "/proc/tty/drivers">
	//   15   37:ldc2            #576 <String "goldfish">
	//   16   40:invokeinterface #572 <Method Object Map.put(Object, Object)>
	//   17   45:pop             
		((Map) (linkedhashmap)).put("/proc/cpuinfo", "goldfish");
	//   18   46:aload           7
	//   19   48:ldc1            #168 <String "/proc/cpuinfo">
	//   20   50:ldc2            #576 <String "goldfish">
	//   21   53:invokeinterface #572 <Method Object Map.put(Object, Object)>
	//   22   58:pop             
		stringbuilder.append((new StringBuilder()).append("00").append(":").toString());
	//   23   59:aload           6
	//   24   61:new             #302 <Class StringBuilder>
	//   25   64:dup             
	//   26   65:invokespecial   #303 <Method void StringBuilder()>
	//   27   68:ldc2            #524 <String "00">
	//   28   71:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   29   74:ldc1            #193 <String ":">
	//   30   76:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   31   79:invokevirtual   #323 <Method String StringBuilder.toString()>
	//   32   82:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   33   85:pop             
		iterator = ((Map) (linkedhashmap)).keySet().iterator();
	//   34   86:aload           7
	//   35   88:invokeinterface #580 <Method Set Map.keySet()>
	//   36   93:invokeinterface #583 <Method Iterator Set.iterator()>
	//   37   98:astore          8
_L6:
		if(!iterator.hasNext()) goto _L2; else goto _L1
	//   38  100:aload           8
	//   39  102:invokeinterface #359 <Method boolean Iterator.hasNext()>
	//   40  107:ifeq            274
_L1:
		byte byte0;
		LineNumberReader linenumberreader;
		LineNumberReader linenumberreader1;
		String s1;
		s1 = (String)iterator.next();
	//   41  110:aload           8
	//   42  112:invokeinterface #362 <Method Object Iterator.next()>
	//   43  117:checkcast       #50  <Class String>
	//   44  120:astore          9
		byte0 = 48;
	//   45  122:bipush          48
	//   46  124:istore_1        
		linenumberreader1 = null;
	//   47  125:aconst_null     
	//   48  126:astore          4
		linenumberreader = null;
	//   49  128:aconst_null     
	//   50  129:astore_3        
		LineNumberReader linenumberreader2 = new LineNumberReader(((java.io.Reader) (new InputStreamReader(((java.io.InputStream) (new FileInputStream(s1)))))));
	//   51  130:new             #179 <Class LineNumberReader>
	//   52  133:dup             
	//   53  134:new             #174 <Class InputStreamReader>
	//   54  137:dup             
	//   55  138:new             #166 <Class FileInputStream>
	//   56  141:dup             
	//   57  142:aload           9
	//   58  144:invokespecial   #584 <Method void FileInputStream(String)>
	//   59  147:invokespecial   #177 <Method void InputStreamReader(java.io.InputStream)>
	//   60  150:invokespecial   #182 <Method void LineNumberReader(java.io.Reader)>
	//   61  153:astore          5
_L4:
		linenumberreader = linenumberreader2;
	//   62  155:aload           5
	//   63  157:astore_3        
		linenumberreader1 = linenumberreader2;
	//   64  158:aload           5
	//   65  160:astore          4
		String s2 = linenumberreader2.readLine();
	//   66  162:aload           5
	//   67  164:invokevirtual   #185 <Method String LineNumberReader.readLine()>
	//   68  167:astore          10
		char c1;
		c1 = ((char) (byte0));
	//   69  169:iload_1         
	//   70  170:istore_0        
		if(s2 == null)
			break; /* Loop/switch isn't completed */
	//   71  171:aload           10
	//   72  173:ifnull          211
		linenumberreader = linenumberreader2;
	//   73  176:aload           5
	//   74  178:astore_3        
		linenumberreader1 = linenumberreader2;
	//   75  179:aload           5
	//   76  181:astore          4
		boolean flag = s2.toLowerCase().contains((CharSequence)((Map) (linkedhashmap)).get(((Object) (s1))));
	//   77  183:aload           10
	//   78  185:invokevirtual   #587 <Method String String.toLowerCase()>
	//   79  188:aload           7
	//   80  190:aload           9
	//   81  192:invokeinterface #588 <Method Object Map.get(Object)>
	//   82  197:checkcast       #590 <Class CharSequence>
	//   83  200:invokevirtual   #594 <Method boolean String.contains(CharSequence)>
	//   84  203:istore_2        
		if(!flag)
			continue; /* Loop/switch isn't completed */
	//   85  204:iload_2         
	//   86  205:ifeq            155
		c1 = '1';
	//   87  208:bipush          49
	//   88  210:istore_0        
		break; /* Loop/switch isn't completed */
		if(true) goto _L4; else goto _L3
_L3:
		stringbuilder.append(c1);
	//   89  211:aload           6
	//   90  213:iload_0         
	//   91  214:invokevirtual   #597 <Method StringBuilder StringBuilder.append(char)>
	//   92  217:pop             
		Throwable throwable;
		Exception exception;
		try
		{
			linenumberreader2.close();
	//   93  218:aload           5
	//   94  220:invokevirtual   #206 <Method void LineNumberReader.close()>
		}
	//*  95  223:goto            100
	//*  96  226:goto            100
	//*  97  229:aload           6
	//*  98  231:bipush          48
	//*  99  233:invokevirtual   #597 <Method StringBuilder StringBuilder.append(char)>
	//* 100  236:pop             
	//* 101  237:aload           4
	//* 102  239:ifnull          247
	//* 103  242:aload           4
	//* 104  244:invokevirtual   #206 <Method void LineNumberReader.close()>
	//* 105  247:goto            100
	//* 106  250:goto            100
	//* 107  253:astore          4
	//* 108  255:aload           6
	//* 109  257:bipush          48
	//* 110  259:invokevirtual   #597 <Method StringBuilder StringBuilder.append(char)>
	//* 111  262:pop             
	//* 112  263:aload_3         
	//* 113  264:ifnull          271
	//* 114  267:aload_3         
	//* 115  268:invokevirtual   #206 <Method void LineNumberReader.close()>
	//* 116  271:aload           4
	//* 117  273:athrow          
	//* 118  274:aload           6
	//* 119  276:invokevirtual   #323 <Method String StringBuilder.toString()>
	//* 120  279:areturn         
	//* 121  280:astore_3        
	//* 122  281:goto            229
		catch(Throwable throwable1) { }
	//  123  284:astore_3        
		  goto _L5
_L7:
		stringbuilder.append('0');
		if(linenumberreader1 != null)
			try
			{
				linenumberreader1.close();
			}
	//* 124  285:goto            226
			catch(Throwable throwable2) { }
	//  125  288:astore_3        
_L5:
		if(true) goto _L6; else goto _L2
	//  126  289:goto            250
		exception;
		stringbuilder.append('0');
		if(linenumberreader != null)
			try
			{
				linenumberreader.close();
			}
			catch(Throwable throwable3) { }
	//  127  292:astore_3        
		throw exception;
_L2:
		return stringbuilder.toString();
		throwable;
		  goto _L7
	//* 128  293:goto            271
	}

	public static Map s(Context context)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #600 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #601 <Method void HashMap()>
	//    3    7:astore_1        
		PackageInfo packageinfo;
		try
		{
			context = ((Context) (context.getPackageManager().getInstalledPackages(0)));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #221 <Method PackageManager Context.getPackageManager()>
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #604 <Method List PackageManager.getInstalledPackages(int)>
	//    8   16:astore_0        
		}
	//*   9   17:aload_0         
	//*  10   18:ifnull          80
	//*  11   21:aload_0         
	//*  12   22:invokeinterface #350 <Method int List.size()>
	//*  13   27:ifle            80
	//*  14   30:aload_0         
	//*  15   31:invokeinterface #354 <Method Iterator List.iterator()>
	//*  16   36:astore_0        
	//*  17   37:aload_0         
	//*  18   38:invokeinterface #359 <Method boolean Iterator.hasNext()>
	//*  19   43:ifeq            80
	//*  20   46:aload_0         
	//*  21   47:invokeinterface #362 <Method Object Iterator.next()>
	//*  22   52:checkcast       #606 <Class PackageInfo>
	//*  23   55:astore_2        
	//*  24   56:aload_1         
	//*  25   57:aload_2         
	//*  26   58:getfield        #609 <Field String PackageInfo.packageName>
	//*  27   61:aload_2         
	//*  28   62:getfield        #613 <Field ApplicationInfo PackageInfo.applicationInfo>
	//*  29   65:getfield        #618 <Field int ApplicationInfo.uid>
	//*  30   68:invokestatic    #621 <Method Integer Integer.valueOf(int)>
	//*  31   71:invokeinterface #572 <Method Object Map.put(Object, Object)>
	//*  32   76:pop             
	//*  33   77:goto            37
	//*  34   80:aload_1         
	//*  35   81:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  36   82:astore_0        
		{
			return ((Map) (hashmap));
	//   37   83:aload_1         
	//   38   84:areturn         
		}
		if(context == null)
			break MISSING_BLOCK_LABEL_80;
		if(((List) (context)).size() > 0)
			for(context = ((Context) (((List) (context)).iterator())); ((Iterator) (context)).hasNext(); ((Map) (hashmap)).put(((Object) (packageinfo.packageName)), ((Object) (Integer.valueOf(packageinfo.applicationInfo.uid)))))
				packageinfo = (PackageInfo)((Iterator) (context)).next();

		return ((Map) (hashmap));
	}

	public static String t()
	{
		StringBuilder stringbuilder;
		LinkedHashMap linkedhashmap;
		Iterator iterator;
		stringbuilder = new StringBuilder();
	//    0    0:new             #302 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #303 <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append((new StringBuilder()).append("00").append(":").toString());
	//    4    9:aload           4
	//    5   11:new             #302 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #303 <Method void StringBuilder()>
	//    8   18:ldc2            #524 <String "00">
	//    9   21:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:ldc1            #193 <String ":">
	//   11   26:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   12   29:invokevirtual   #323 <Method String StringBuilder.toString()>
	//   13   32:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   14   35:pop             
		linkedhashmap = new LinkedHashMap();
	//   15   36:new             #562 <Class LinkedHashMap>
	//   16   39:dup             
	//   17   40:invokespecial   #563 <Method void LinkedHashMap()>
	//   18   43:astore          5
		((Map) (linkedhashmap)).put("BRAND", "generic");
	//   19   45:aload           5
	//   20   47:ldc2            #626 <String "BRAND">
	//   21   50:ldc2            #628 <String "generic">
	//   22   53:invokeinterface #572 <Method Object Map.put(Object, Object)>
	//   23   58:pop             
		((Map) (linkedhashmap)).put("BOARD", "unknown");
	//   24   59:aload           5
	//   25   61:ldc2            #630 <String "BOARD">
	//   26   64:ldc2            #632 <String "unknown">
	//   27   67:invokeinterface #572 <Method Object Map.put(Object, Object)>
	//   28   72:pop             
		((Map) (linkedhashmap)).put("DEVICE", "generic");
	//   29   73:aload           5
	//   30   75:ldc2            #634 <String "DEVICE">
	//   31   78:ldc2            #628 <String "generic">
	//   32   81:invokeinterface #572 <Method Object Map.put(Object, Object)>
	//   33   86:pop             
		((Map) (linkedhashmap)).put("HARDWARE", "goldfish");
	//   34   87:aload           5
	//   35   89:ldc2            #636 <String "HARDWARE">
	//   36   92:ldc2            #576 <String "goldfish">
	//   37   95:invokeinterface #572 <Method Object Map.put(Object, Object)>
	//   38  100:pop             
		((Map) (linkedhashmap)).put("PRODUCT", "sdk");
	//   39  101:aload           5
	//   40  103:ldc2            #638 <String "PRODUCT">
	//   41  106:ldc2            #640 <String "sdk">
	//   42  109:invokeinterface #572 <Method Object Map.put(Object, Object)>
	//   43  114:pop             
		((Map) (linkedhashmap)).put("MODEL", "sdk");
	//   44  115:aload           5
	//   45  117:ldc2            #642 <String "MODEL">
	//   46  120:ldc2            #640 <String "sdk">
	//   47  123:invokeinterface #572 <Method Object Map.put(Object, Object)>
	//   48  128:pop             
		iterator = ((Map) (linkedhashmap)).keySet().iterator();
	//   49  129:aload           5
	//   50  131:invokeinterface #580 <Method Set Map.keySet()>
	//   51  136:invokeinterface #583 <Method Iterator Set.iterator()>
	//   52  141:astore          6
_L2:
		byte byte0;
		String s1;
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//   53  143:aload           6
	//   54  145:invokeinterface #359 <Method boolean Iterator.hasNext()>
	//   55  150:ifeq            263
		s1 = (String)iterator.next();
	//   56  153:aload           6
	//   57  155:invokeinterface #362 <Method Object Iterator.next()>
	//   58  160:checkcast       #50  <Class String>
	//   59  163:astore_3        
		byte0 = 48;
	//   60  164:bipush          48
	//   61  166:istore_1        
		String s2;
		String s3;
		s2 = (String)((Class) (android/os/Build)).getField(s1).get(((Object) (null)));
	//   62  167:ldc2            #462 <Class Build>
	//   63  170:aload_3         
	//   64  171:invokevirtual   #645 <Method Field Class.getField(String)>
	//   65  174:aconst_null     
	//   66  175:invokevirtual   #141 <Method Object Field.get(Object)>
	//   67  178:checkcast       #50  <Class String>
	//   68  181:astore          7
		s3 = (String)((Map) (linkedhashmap)).get(((Object) (s1)));
	//   69  183:aload           5
	//   70  185:aload_3         
	//   71  186:invokeinterface #588 <Method Object Map.get(Object)>
	//   72  191:checkcast       #50  <Class String>
	//   73  194:astore          8
		s1 = null;
	//   74  196:aconst_null     
	//   75  197:astore_3        
		if(s2 == null)
			break MISSING_BLOCK_LABEL_209;
	//   76  198:aload           7
	//   77  200:ifnull          209
		s1 = s2.toLowerCase();
	//   78  203:aload           7
	//   79  205:invokevirtual   #587 <Method String String.toLowerCase()>
	//   80  208:astore_3        
		char c1;
		c1 = ((char) (byte0));
	//   81  209:iload_1         
	//   82  210:istore_0        
		if(s1 == null)
			break MISSING_BLOCK_LABEL_231;
	//   83  211:aload_3         
	//   84  212:ifnull          231
		boolean flag = s1.contains(((CharSequence) (s3)));
	//   85  215:aload_3         
	//   86  216:aload           8
	//   87  218:invokevirtual   #594 <Method boolean String.contains(CharSequence)>
	//   88  221:istore_2        
		c1 = ((char) (byte0));
	//   89  222:iload_1         
	//   90  223:istore_0        
		if(flag)
	//*  91  224:iload_2         
	//*  92  225:ifeq            231
			c1 = '1';
	//   93  228:bipush          49
	//   94  230:istore_0        
		stringbuilder.append(c1);
	//   95  231:aload           4
	//   96  233:iload_0         
	//   97  234:invokevirtual   #597 <Method StringBuilder StringBuilder.append(char)>
	//   98  237:pop             
		continue; /* Loop/switch isn't completed */
	//   99  238:goto            143
_L3:
		stringbuilder.append('0');
	//  100  241:aload           4
	//  101  243:bipush          48
	//  102  245:invokevirtual   #597 <Method StringBuilder StringBuilder.append(char)>
	//  103  248:pop             
		if(true) goto _L2; else goto _L1
	//  104  249:goto            143
		Object obj;
		obj;
	//  105  252:astore_3        
		stringbuilder.append('0');
	//  106  253:aload           4
	//  107  255:bipush          48
	//  108  257:invokevirtual   #597 <Method StringBuilder StringBuilder.append(char)>
	//  109  260:pop             
		throw obj;
	//  110  261:aload_3         
	//  111  262:athrow          
_L1:
		return stringbuilder.toString();
	//  112  263:aload           4
	//  113  265:invokevirtual   #323 <Method String StringBuilder.toString()>
	//  114  268:areturn         
		obj;
	//  115  269:astore_3        
		  goto _L3
	//* 116  270:goto            241
	}

	public static String t(Context context)
	{
		String s1 = "";
	//    0    0:ldc1            #55  <String "">
	//    1    2:astore_1        
		String s2;
		String s3;
		try
		{
			s2 = x(context);
	//    2    3:aload_0         
	//    3    4:invokestatic    #648 <Method String x(Context)>
	//    4    7:astore_2        
			s3 = A();
	//    5    8:invokestatic    #650 <Method String A()>
	//    6   11:astore_3        
		}
	//*   7   12:aload_1         
	//*   8   13:astore_0        
	//*   9   14:aload_2         
	//*  10   15:invokestatic    #652 <Method boolean ei.a(String)>
	//*  11   18:ifeq            56
	//*  12   21:aload_1         
	//*  13   22:astore_0        
	//*  14   23:aload_3         
	//*  15   24:invokestatic    #652 <Method boolean ei.a(String)>
	//*  16   27:ifeq            56
	//*  17   30:new             #302 <Class StringBuilder>
	//*  18   33:dup             
	//*  19   34:invokespecial   #303 <Method void StringBuilder()>
	//*  20   37:aload_2         
	//*  21   38:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//*  22   41:ldc1            #193 <String ":">
	//*  23   43:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//*  24   46:invokestatic    #650 <Method String A()>
	//*  25   49:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//*  26   52:invokevirtual   #323 <Method String StringBuilder.toString()>
	//*  27   55:astore_0        
	//*  28   56:aload_0         
	//*  29   57:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  30   58:astore_0        
		{
			return "";
	//   31   59:ldc1            #55  <String "">
	//   32   61:areturn         
		}
		context = ((Context) (s1));
		if(!ei.a(s2))
			break MISSING_BLOCK_LABEL_56;
		context = ((Context) (s1));
		if(ei.a(s3))
			context = ((Context) ((new StringBuilder()).append(s2).append(":").append(A()).toString()));
		return ((String) (context));
	}

	public static String u()
	{
		int j;
		Object obj;
		try
		{
			obj = ((Object) (new StringBuilder()));
	//    0    0:new             #302 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #303 <Method void StringBuilder()>
	//    3    7:astore_1        
			((StringBuilder) (obj)).append((new StringBuilder()).append("00").append(":").toString());
	//    4    8:aload_1         
	//    5    9:new             #302 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #303 <Method void StringBuilder()>
	//    8   16:ldc2            #524 <String "00">
	//    9   19:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:ldc1            #193 <String ":">
	//   11   24:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   12   27:invokevirtual   #323 <Method String StringBuilder.toString()>
	//   13   30:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   14   33:pop             
		}
	//*  15   34:iconst_0        
	//*  16   35:istore_0        
	//*  17   36:iload_0         
	//*  18   37:bipush          7
	//*  19   39:icmpge          125
	//*  20   42:new             #86  <Class File>
	//*  21   45:dup             
	//*  22   46:bipush          7
	//*  23   48:anewarray       String[]
	//*  24   51:dup             
	//*  25   52:iconst_0        
	//*  26   53:ldc2            #655 <String "/dev/qemu_pipe">
	//*  27   56:aastore         
	//*  28   57:dup             
	//*  29   58:iconst_1        
	//*  30   59:ldc2            #657 <String "/dev/socket/qemud">
	//*  31   62:aastore         
	//*  32   63:dup             
	//*  33   64:iconst_2        
	//*  34   65:ldc2            #659 <String "/system/lib/libc_malloc_debug_qemu.so">
	//*  35   68:aastore         
	//*  36   69:dup             
	//*  37   70:iconst_3        
	//*  38   71:ldc2            #661 <String "/sys/qemu_trace">
	//*  39   74:aastore         
	//*  40   75:dup             
	//*  41   76:iconst_4        
	//*  42   77:ldc2            #663 <String "/system/bin/qemu-props">
	//*  43   80:aastore         
	//*  44   81:dup             
	//*  45   82:iconst_5        
	//*  46   83:ldc2            #665 <String "/dev/socket/genyd">
	//*  47   86:aastore         
	//*  48   87:dup             
	//*  49   88:bipush          6
	//*  50   90:ldc2            #667 <String "/dev/socket/baseband_genyd">
	//*  51   93:aastore         
	//*  52   94:iload_0         
	//*  53   95:aaload          
	//*  54   96:invokespecial   #169 <Method void File(String)>
	//*  55   99:invokevirtual   #670 <Method boolean File.exists()>
	//*  56  102:ifeq            115
	//*  57  105:aload_1         
	//*  58  106:ldc1            #73  <String "1">
	//*  59  108:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//*  60  111:pop             
	//*  61  112:goto            139
	//*  62  115:aload_1         
	//*  63  116:ldc1            #75  <String "0">
	//*  64  118:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//*  65  121:pop             
	//*  66  122:goto            139
	//*  67  125:aload_1         
	//*  68  126:invokevirtual   #323 <Method String StringBuilder.toString()>
	//*  69  129:astore_1        
	//*  70  130:aload_1         
	//*  71  131:areturn         
	//*  72  132:ldc1            #55  <String "">
	//*  73  134:areturn         
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			return "";
		}
		j = 0;
_L2:
		if(j >= 7)
			break MISSING_BLOCK_LABEL_125;
		if((new File((new String[] {
	"/dev/qemu_pipe", "/dev/socket/qemud", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/genyd", "/dev/socket/baseband_genyd"
})[j])).exists())
		{
			((StringBuilder) (obj)).append("1");
			break MISSING_BLOCK_LABEL_139;
		}
		((StringBuilder) (obj)).append("0");
		break MISSING_BLOCK_LABEL_139;
		obj = ((Object) (((StringBuilder) (obj)).toString()));
		Throwable throwable;
		return ((String) (obj));
	//*  74  135:astore_1        
	//*  75  136:goto            132
		j++;
	//   76  139:iload_0         
	//   77  140:iconst_1        
	//   78  141:iadd            
	//   79  142:istore_0        
		if(true) goto _L2; else goto _L1
	//   80  143:goto            36
_L1:
	}

	public static String u(Context context)
	{
		context = ((Context) ((TelephonyManager)context.getSystemService("phone")));
	//    0    0:aload_0         
	//    1    1:ldc1            #111 <String "phone">
	//    2    3:invokevirtual   #115 <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #117 <Class TelephonyManager>
	//    4    9:astore_0        
		if(context == null)
			break MISSING_BLOCK_LABEL_24;
	//    5   10:aload_0         
	//    6   11:ifnull          24
		int j = ((TelephonyManager) (context)).getNetworkType();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #673 <Method int TelephonyManager.getNetworkType()>
	//    9   18:istore_1        
		return String.valueOf(j);
	//   10   19:iload_1         
	//   11   20:invokestatic    #259 <Method String String.valueOf(int)>
	//   12   23:areturn         
_L2:
		return "";
	//   13   24:ldc1            #55  <String "">
	//   14   26:areturn         
		context;
	//   15   27:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  16   28:goto            24
	}

	private static String v()
	{
		Object obj;
		Object obj2;
		obj2 = "";
	//    0    0:ldc1            #55  <String "">
	//    1    2:astore_3        
		obj = null;
	//    2    3:aconst_null     
	//    3    4:astore_1        
		Object obj3 = ((Object) (BluetoothAdapter.getDefaultAdapter()));
	//    4    5:invokestatic    #677 <Method BluetoothAdapter BluetoothAdapter.getDefaultAdapter()>
	//    5    8:astore          4
		Object obj1;
		obj1 = obj3;
	//    6   10:aload           4
	//    7   12:astore_2        
		if(obj3 == null)
			break MISSING_BLOCK_LABEL_32;
	//    8   13:aload           4
	//    9   15:ifnull          32
		obj = obj1;
	//   10   18:aload_2         
	//   11   19:astore_1        
		boolean flag = ((BluetoothAdapter) (obj1)).isEnabled();
	//   12   20:aload_2         
	//   13   21:invokevirtual   #680 <Method boolean BluetoothAdapter.isEnabled()>
	//   14   24:istore_0        
		if(!flag)
	//*  15   25:iload_0         
	//*  16   26:ifne            32
			return "";
	//   17   29:ldc1            #55  <String "">
	//   18   31:areturn         
		obj = obj1;
	//   19   32:aload_2         
	//   20   33:astore_1        
		obj3 = ((Object) (((BluetoothAdapter) (obj1)).getAddress()));
	//   21   34:aload_2         
	//   22   35:invokevirtual   #682 <Method String BluetoothAdapter.getAddress()>
	//   23   38:astore          4
		obj = obj3;
	//   24   40:aload           4
	//   25   42:astore_1        
		obj2 = obj1;
	//   26   43:aload_2         
	//   27   44:astore_3        
		obj1 = obj;
	//   28   45:aload_1         
	//   29   46:astore_2        
_L2:
label0:
		{
			if(obj1 != null)
	//*  30   47:aload_2         
	//*  31   48:ifnull          63
			{
				obj = obj1;
	//   32   51:aload_2         
	//   33   52:astore_1        
				if(!((String) (obj1)).endsWith("00:00:00:00:00"))
					break label0;
	//   34   53:aload_2         
	//   35   54:ldc2            #684 <String "00:00:00:00:00">
	//   36   57:invokevirtual   #687 <Method boolean String.endsWith(String)>
	//   37   60:ifeq            68
			}
			try
			{
				obj = ((Object) (c(((BluetoothAdapter) (obj2)))));
	//   38   63:aload_3         
	//   39   64:invokestatic    #689 <Method String c(BluetoothAdapter)>
	//   40   67:astore_1        
			}
	//*  41   68:aload_1         
	//*  42   69:astore_2        
	//*  43   70:aload_1         
	//*  44   71:ifnonnull       77
	//*  45   74:ldc1            #55  <String "">
	//*  46   76:astore_2        
	//*  47   77:aload_2         
	//*  48   78:areturn         
	//*  49   79:astore_2        
	//*  50   80:aload_3         
	//*  51   81:astore_2        
	//*  52   82:aload_1         
	//*  53   83:astore_3        
	//*  54   84:goto            47
			catch(Throwable throwable)
	//*  55   87:astore_1        
			{
				throwable = ((Throwable) (obj1));
	//   56   88:aload_2         
	//   57   89:astore_1        
			}
		}
		obj1 = obj;
		if(obj == null)
			obj1 = "";
		return ((String) (obj1));
		obj1;
		obj1 = obj2;
		obj2 = obj;
		if(true) goto _L2; else goto _L1
_L1:
	//*  58   90:goto            68
	}

	private static String w()
	{
		BufferedReader bufferedreader;
		FileReader filereader;
		BufferedReader bufferedreader1;
		FileReader filereader2;
		BufferedReader bufferedreader2;
		Object obj1;
		filereader2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		filereader = null;
	//    2    3:aconst_null     
	//    3    4:astore_1        
		obj1 = null;
	//    4    5:aconst_null     
	//    5    6:astore          6
		bufferedreader = null;
	//    6    8:aconst_null     
	//    7    9:astore_0        
		bufferedreader1 = bufferedreader;
	//    8   10:aload_0         
	//    9   11:astore_3        
		bufferedreader2 = ((BufferedReader) (obj1));
	//   10   12:aload           6
	//   11   14:astore          5
		FileReader filereader1 = new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
	//   12   16:new             #277 <Class FileReader>
	//   13   19:dup             
	//   14   20:ldc2            #691 <String "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq">
	//   15   23:invokespecial   #278 <Method void FileReader(String)>
	//   16   26:astore_2        
		filereader = filereader1;
	//   17   27:aload_2         
	//   18   28:astore_1        
		bufferedreader1 = bufferedreader;
	//   19   29:aload_0         
	//   20   30:astore_3        
		filereader2 = filereader1;
	//   21   31:aload_2         
	//   22   32:astore          4
		bufferedreader2 = ((BufferedReader) (obj1));
	//   23   34:aload           6
	//   24   36:astore          5
		obj1 = ((Object) (new BufferedReader(((java.io.Reader) (filereader1)), 8192)));
	//   25   38:new             #280 <Class BufferedReader>
	//   26   41:dup             
	//   27   42:aload_2         
	//   28   43:sipush          8192
	//   29   46:invokespecial   #329 <Method void BufferedReader(java.io.Reader, int)>
	//   30   49:astore          6
		bufferedreader = ((BufferedReader) (obj1));
	//   31   51:aload           6
	//   32   53:astore_0        
		filereader = filereader1;
	//   33   54:aload_2         
	//   34   55:astore_1        
		bufferedreader1 = bufferedreader;
	//   35   56:aload_0         
	//   36   57:astore_3        
		filereader2 = filereader1;
	//   37   58:aload_2         
	//   38   59:astore          4
		bufferedreader2 = bufferedreader;
	//   39   61:aload_0         
	//   40   62:astore          5
		obj1 = ((Object) (((BufferedReader) (obj1)).readLine()));
	//   41   64:aload           6
	//   42   66:invokevirtual   #282 <Method String BufferedReader.readLine()>
	//   43   69:astore          6
		filereader = filereader1;
	//   44   71:aload_2         
	//   45   72:astore_1        
		bufferedreader1 = bufferedreader;
	//   46   73:aload_0         
	//   47   74:astore_3        
		filereader2 = filereader1;
	//   48   75:aload_2         
	//   49   76:astore          4
		bufferedreader2 = bufferedreader;
	//   50   78:aload_0         
	//   51   79:astore          5
		if(ei.b(((String) (obj1))))
			break MISSING_BLOCK_LABEL_117;
	//   52   81:aload           6
	//   53   83:invokestatic    #393 <Method boolean ei.b(String)>
	//   54   86:ifne            117
		filereader = filereader1;
	//   55   89:aload_2         
	//   56   90:astore_1        
		bufferedreader1 = bufferedreader;
	//   57   91:aload_0         
	//   58   92:astore_3        
		filereader2 = filereader1;
	//   59   93:aload_2         
	//   60   94:astore          4
		bufferedreader2 = bufferedreader;
	//   61   96:aload_0         
	//   62   97:astore          5
		obj1 = ((Object) (((String) (obj1)).trim()));
	//   63   99:aload           6
	//   64  101:invokevirtual   #203 <Method String String.trim()>
	//   65  104:astore          6
		Object obj;
		try
		{
			bufferedreader.close();
	//   66  106:aload_0         
	//   67  107:invokevirtual   #290 <Method void BufferedReader.close()>
		}
	//*  68  110:aload_2         
	//*  69  111:invokevirtual   #289 <Method void FileReader.close()>
	//*  70  114:aload           6
	//*  71  116:areturn         
	//*  72  117:aload_0         
	//*  73  118:invokevirtual   #290 <Method void BufferedReader.close()>
	//*  74  121:aload_2         
	//*  75  122:invokevirtual   #289 <Method void FileReader.close()>
	//*  76  125:goto            176
	//*  77  128:goto            176
	//*  78  131:aload           5
	//*  79  133:ifnull          141
	//*  80  136:aload           5
	//*  81  138:invokevirtual   #290 <Method void BufferedReader.close()>
	//*  82  141:aload           4
	//*  83  143:ifnull          151
	//*  84  146:aload           4
	//*  85  148:invokevirtual   #289 <Method void FileReader.close()>
	//*  86  151:goto            176
	//*  87  154:goto            176
	//*  88  157:astore_0        
	//*  89  158:aload_3         
	//*  90  159:ifnull          166
	//*  91  162:aload_3         
	//*  92  163:invokevirtual   #290 <Method void BufferedReader.close()>
	//*  93  166:aload_1         
	//*  94  167:ifnull          174
	//*  95  170:aload_1         
	//*  96  171:invokevirtual   #289 <Method void FileReader.close()>
	//*  97  174:aload_0         
	//*  98  175:athrow          
	//*  99  176:ldc1            #55  <String "">
	//* 100  178:areturn         
	//* 101  179:astore_0        
	//* 102  180:goto            131
		catch(Throwable throwable) { }
	//  103  183:astore_0        
		try
		{
			filereader1.close();
		}
	//* 104  184:goto            110
		catch(Throwable throwable1)
	//* 105  187:astore_0        
		{
			return ((String) (obj1));
	//  106  188:aload           6
	//  107  190:areturn         
		}
		return ((String) (obj1));
		try
		{
			bufferedreader.close();
		}
		catch(Throwable throwable2) { }
	//  108  191:astore_0        
		try
		{
			filereader1.close();
		}
	//* 109  192:goto            121
		catch(Throwable throwable3) { }
	//  110  195:astore_0        
		  goto _L1
_L2:
		if(bufferedreader2 != null)
			try
			{
				bufferedreader2.close();
			}
	//* 111  196:goto            128
			catch(Throwable throwable4) { }
	//  112  199:astore_0        
		if(filereader2 != null)
			try
			{
				filereader2.close();
			}
	//* 113  200:goto            141
			catch(Throwable throwable5) { }
	//  114  203:astore_0        
		  goto _L1
		obj;
		if(bufferedreader1 != null)
			try
			{
				bufferedreader1.close();
			}
	//* 115  204:goto            154
			catch(Throwable throwable7) { }
	//  116  207:astore_2        
		if(filereader != null)
			try
			{
				filereader.close();
			}
	//* 117  208:goto            166
			catch(Throwable throwable6) { }
	//  118  211:astore_1        
		throw obj;
_L1:
		return "";
		obj;
		  goto _L2
	//* 119  212:goto            174
	}

	public static String x()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #302 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #303 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append((new StringBuilder()).append("00").append(":").toString());
	//    4    8:aload_2         
	//    5    9:new             #302 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #303 <Method void StringBuilder()>
	//    8   16:ldc2            #524 <String "00">
	//    9   19:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:ldc1            #193 <String ":">
	//   11   24:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   12   27:invokevirtual   #323 <Method String StringBuilder.toString()>
	//   13   30:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   14   33:pop             
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//   15   34:new             #562 <Class LinkedHashMap>
	//   16   37:dup             
	//   17   38:invokespecial   #563 <Method void LinkedHashMap()>
	//   18   41:astore_3        
		((Map) (linkedhashmap)).put("ro.hardware", "goldfish");
	//   19   42:aload_3         
	//   20   43:ldc2            #693 <String "ro.hardware">
	//   21   46:ldc2            #576 <String "goldfish">
	//   22   49:invokeinterface #572 <Method Object Map.put(Object, Object)>
	//   23   54:pop             
		((Map) (linkedhashmap)).put("ro.kernel.qemu", "1");
	//   24   55:aload_3         
	//   25   56:ldc2            #695 <String "ro.kernel.qemu">
	//   26   59:ldc1            #73  <String "1">
	//   27   61:invokeinterface #572 <Method Object Map.put(Object, Object)>
	//   28   66:pop             
		((Map) (linkedhashmap)).put("ro.product.device", "generic");
	//   29   67:aload_3         
	//   30   68:ldc2            #697 <String "ro.product.device">
	//   31   71:ldc2            #628 <String "generic">
	//   32   74:invokeinterface #572 <Method Object Map.put(Object, Object)>
	//   33   79:pop             
		((Map) (linkedhashmap)).put("ro.product.model", "sdk");
	//   34   80:aload_3         
	//   35   81:ldc2            #699 <String "ro.product.model">
	//   36   84:ldc2            #640 <String "sdk">
	//   37   87:invokeinterface #572 <Method Object Map.put(Object, Object)>
	//   38   92:pop             
		((Map) (linkedhashmap)).put("ro.product.brand", "generic");
	//   39   93:aload_3         
	//   40   94:ldc2            #701 <String "ro.product.brand">
	//   41   97:ldc2            #628 <String "generic">
	//   42  100:invokeinterface #572 <Method Object Map.put(Object, Object)>
	//   43  105:pop             
		((Map) (linkedhashmap)).put("ro.product.name", "sdk");
	//   44  106:aload_3         
	//   45  107:ldc2            #703 <String "ro.product.name">
	//   46  110:ldc2            #640 <String "sdk">
	//   47  113:invokeinterface #572 <Method Object Map.put(Object, Object)>
	//   48  118:pop             
		((Map) (linkedhashmap)).put("ro.build.fingerprint", "test-keys");
	//   49  119:aload_3         
	//   50  120:ldc2            #705 <String "ro.build.fingerprint">
	//   51  123:ldc2            #707 <String "test-keys">
	//   52  126:invokeinterface #572 <Method Object Map.put(Object, Object)>
	//   53  131:pop             
		((Map) (linkedhashmap)).put("ro.product.manufacturer", "unknow");
	//   54  132:aload_3         
	//   55  133:ldc2            #709 <String "ro.product.manufacturer">
	//   56  136:ldc2            #711 <String "unknow">
	//   57  139:invokeinterface #572 <Method Object Map.put(Object, Object)>
	//   58  144:pop             
		char c1;
		for(Iterator iterator = ((Map) (linkedhashmap)).keySet().iterator(); iterator.hasNext(); stringbuilder.append(c1))
	//*  59  145:aload_3         
	//*  60  146:invokeinterface #580 <Method Set Map.keySet()>
	//*  61  151:invokeinterface #583 <Method Iterator Set.iterator()>
	//*  62  156:astore          4
	//*  63  158:aload           4
	//*  64  160:invokeinterface #359 <Method boolean Iterator.hasNext()>
	//*  65  165:ifeq            236
		{
			String s2 = (String)iterator.next();
	//   66  168:aload           4
	//   67  170:invokeinterface #362 <Method Object Iterator.next()>
	//   68  175:checkcast       #50  <Class String>
	//   69  178:astore          6
			byte byte0 = 48;
	//   70  180:bipush          48
	//   71  182:istore_1        
			String s1 = (String)((Map) (linkedhashmap)).get(((Object) (s2)));
	//   72  183:aload_3         
	//   73  184:aload           6
	//   74  186:invokeinterface #588 <Method Object Map.get(Object)>
	//   75  191:checkcast       #50  <Class String>
	//   76  194:astore          5
			s2 = ei.d(s2, "");
	//   77  196:aload           6
	//   78  198:ldc1            #55  <String "">
	//   79  200:invokestatic    #714 <Method String ei.d(String, String)>
	//   80  203:astore          6
			c1 = ((char) (byte0));
	//   81  205:iload_1         
	//   82  206:istore_0        
			if(s2 == null)
				continue;
	//   83  207:aload           6
	//   84  209:ifnull          227
			c1 = ((char) (byte0));
	//   85  212:iload_1         
	//   86  213:istore_0        
			if(s2.contains(((CharSequence) (s1))))
	//*  87  214:aload           6
	//*  88  216:aload           5
	//*  89  218:invokevirtual   #594 <Method boolean String.contains(CharSequence)>
	//*  90  221:ifeq            227
				c1 = '1';
	//   91  224:bipush          49
	//   92  226:istore_0        
		}

	//   93  227:aload_2         
	//   94  228:iload_0         
	//   95  229:invokevirtual   #597 <Method StringBuilder StringBuilder.append(char)>
	//   96  232:pop             
	//*  97  233:goto            158
		return stringbuilder.toString();
	//   98  236:aload_2         
	//   99  237:invokevirtual   #323 <Method String StringBuilder.toString()>
	//  100  240:areturn         
	}

	private static String x(Context context)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(d(context, "android.permission.ACCESS_NETWORK_STATE"))
	//*   2    2:aload_0         
	//*   3    3:ldc2            #716 <String "android.permission.ACCESS_NETWORK_STATE">
	//*   4    6:invokestatic    #109 <Method boolean d(Context, String)>
	//*   5    9:ifeq            15
			return "";
	//    6   12:ldc1            #55  <String "">
	//    7   14:areturn         
		int j;
		NetworkInfo networkinfo;
		try
		{
			networkinfo = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
	//    8   15:aload_0         
	//    9   16:ldc2            #718 <String "connectivity">
	//   10   19:invokevirtual   #115 <Method Object Context.getSystemService(String)>
	//   11   22:checkcast       #720 <Class ConnectivityManager>
	//   12   25:invokevirtual   #724 <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//   13   28:astore_3        
		}
	//*  14   29:aload_3         
	//*  15   30:ifnonnull       35
	//*  16   33:aconst_null     
	//*  17   34:areturn         
	//*  18   35:aload_3         
	//*  19   36:invokevirtual   #729 <Method int NetworkInfo.getType()>
	//*  20   39:iconst_1        
	//*  21   40:icmpne          47
	//*  22   43:ldc2            #731 <String "WIFI">
	//*  23   46:areturn         
	//*  24   47:aload_2         
	//*  25   48:astore_0        
	//*  26   49:aload_3         
	//*  27   50:invokevirtual   #729 <Method int NetworkInfo.getType()>
	//*  28   53:ifne            162
	//*  29   56:aload_3         
	//*  30   57:invokevirtual   #734 <Method int NetworkInfo.getSubtype()>
	//*  31   60:istore_1        
	//*  32   61:iload_1         
	//*  33   62:iconst_4        
	//*  34   63:icmpeq          88
	//*  35   66:iload_1         
	//*  36   67:iconst_1        
	//*  37   68:icmpeq          88
	//*  38   71:iload_1         
	//*  39   72:iconst_2        
	//*  40   73:icmpeq          88
	//*  41   76:iload_1         
	//*  42   77:bipush          7
	//*  43   79:icmpeq          88
	//*  44   82:iload_1         
	//*  45   83:bipush          11
	//*  46   85:icmpne          92
	//*  47   88:ldc2            #736 <String "2G">
	//*  48   91:areturn         
	//*  49   92:iload_1         
	//*  50   93:iconst_3        
	//*  51   94:icmpeq          144
	//*  52   97:iload_1         
	//*  53   98:iconst_5        
	//*  54   99:icmpeq          144
	//*  55  102:iload_1         
	//*  56  103:bipush          6
	//*  57  105:icmpeq          144
	//*  58  108:iload_1         
	//*  59  109:bipush          8
	//*  60  111:icmpeq          144
	//*  61  114:iload_1         
	//*  62  115:bipush          9
	//*  63  117:icmpeq          144
	//*  64  120:iload_1         
	//*  65  121:bipush          10
	//*  66  123:icmpeq          144
	//*  67  126:iload_1         
	//*  68  127:bipush          12
	//*  69  129:icmpeq          144
	//*  70  132:iload_1         
	//*  71  133:bipush          14
	//*  72  135:icmpeq          144
	//*  73  138:iload_1         
	//*  74  139:bipush          15
	//*  75  141:icmpne          148
	//*  76  144:ldc2            #738 <String "3G">
	//*  77  147:areturn         
	//*  78  148:iload_1         
	//*  79  149:bipush          13
	//*  80  151:icmpne          158
	//*  81  154:ldc2            #740 <String "4G">
	//*  82  157:areturn         
	//*  83  158:ldc2            #742 <String "UNKNOW">
	//*  84  161:astore_0        
	//*  85  162:aload_0         
	//*  86  163:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  87  164:astore_0        
		{
			return null;
	//   88  165:aconst_null     
	//   89  166:areturn         
		}
		if(networkinfo == null)
			return null;
		if(networkinfo.getType() == 1)
			return "WIFI";
		context = ((Context) (obj));
		if(networkinfo.getType() != 0)
			break MISSING_BLOCK_LABEL_162;
		j = networkinfo.getSubtype();
		if(j == 4 || j == 1 || j == 2 || j == 7 || j == 11)
			return "2G";
		if(j == 3 || j == 5 || j == 6 || j == 8 || j == 9 || j == 10 || j == 12 || j == 14 || j == 15)
			return "3G";
		if(j == 13)
			return "4G";
		context = "UNKNOW";
		return ((String) (context));
	}

	private static String y()
	{
		Object obj = ((Object) (Collections.list(NetworkInterface.getNetworkInterfaces())));
	//    0    0:invokestatic    #25  <Method Enumeration NetworkInterface.getNetworkInterfaces()>
	//    1    3:invokestatic    #748 <Method java.util.ArrayList Collections.list(Enumeration)>
	//    2    6:astore_2        
		if(obj == null)
			break MISSING_BLOCK_LABEL_152;
	//    3    7:aload_2         
	//    4    8:ifnull          152
		obj = ((Object) (((List) (obj)).iterator()));
	//    5   11:aload_2         
	//    6   12:invokeinterface #354 <Method Iterator List.iterator()>
	//    7   17:astore_2        
_L2:
		Object obj1;
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break MISSING_BLOCK_LABEL_152;
	//    8   18:aload_2         
	//    9   19:invokeinterface #359 <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            152
			obj1 = ((Object) ((NetworkInterface)((Iterator) (obj)).next()));
	//   11   27:aload_2         
	//   12   28:invokeinterface #362 <Method Object Iterator.next()>
	//   13   33:checkcast       #21  <Class NetworkInterface>
	//   14   36:astore_3        
		} while(obj1 == null);
	//   15   37:aload_3         
	//   16   38:ifnull          18
		if(((NetworkInterface) (obj1)).getName() == null || !((NetworkInterface) (obj1)).getName().equalsIgnoreCase("wlan0")) goto _L2; else goto _L1
	//   17   41:aload_3         
	//   18   42:invokevirtual   #749 <Method String NetworkInterface.getName()>
	//   19   45:ifnull          18
	//   20   48:aload_3         
	//   21   49:invokevirtual   #749 <Method String NetworkInterface.getName()>
	//   22   52:ldc2            #751 <String "wlan0">
	//   23   55:invokevirtual   #754 <Method boolean String.equalsIgnoreCase(String)>
	//   24   58:ifeq            18
_L1:
		byte abyte0[] = ((NetworkInterface) (obj1)).getHardwareAddress();
	//   25   61:aload_3         
	//   26   62:invokevirtual   #758 <Method byte[] NetworkInterface.getHardwareAddress()>
	//   27   65:astore_2        
		if(abyte0 == null)
	//*  28   66:aload_2         
	//*  29   67:ifnonnull       74
			return "02:00:00:00:00:00";
	//   30   70:ldc2            #487 <String "02:00:00:00:00:00">
	//   31   73:areturn         
		int i1;
		obj1 = ((Object) (new StringBuilder()));
	//   32   74:new             #302 <Class StringBuilder>
	//   33   77:dup             
	//   34   78:invokespecial   #303 <Method void StringBuilder()>
	//   35   81:astore_3        
		i1 = abyte0.length;
	//   36   82:aload_2         
	//   37   83:arraylength     
	//   38   84:istore_1        
		int j = 0;
	//   39   85:iconst_0        
	//   40   86:istore_0        
_L4:
		if(j >= i1)
			break; /* Loop/switch isn't completed */
	//   41   87:iload_0         
	//   42   88:iload_1         
	//   43   89:icmpge          127
		((StringBuilder) (obj1)).append(String.format("%02X:", new Object[] {
			Integer.valueOf(abyte0[j] & 0xff)
		}));
	//   44   92:aload_3         
	//   45   93:ldc2            #760 <String "%02X:">
	//   46   96:iconst_1        
	//   47   97:anewarray       Object[]
	//   48  100:dup             
	//   49  101:iconst_0        
	//   50  102:aload_2         
	//   51  103:iload_0         
	//   52  104:baload          
	//   53  105:sipush          255
	//   54  108:iand            
	//   55  109:invokestatic    #621 <Method Integer Integer.valueOf(int)>
	//   56  112:aastore         
	//   57  113:invokestatic    #764 <Method String String.format(String, Object[])>
	//   58  116:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   59  119:pop             
		j++;
	//   60  120:iload_0         
	//   61  121:iconst_1        
	//   62  122:iadd            
	//   63  123:istore_0        
		if(true) goto _L4; else goto _L3
	//   64  124:goto            87
_L3:
		if(((StringBuilder) (obj1)).length() > 0)
	//*  65  127:aload_3         
	//*  66  128:invokevirtual   #765 <Method int StringBuilder.length()>
	//*  67  131:ifle            145
			((StringBuilder) (obj1)).deleteCharAt(((StringBuilder) (obj1)).length() - 1);
	//   68  134:aload_3         
	//   69  135:aload_3         
	//   70  136:invokevirtual   #765 <Method int StringBuilder.length()>
	//   71  139:iconst_1        
	//   72  140:isub            
	//   73  141:invokevirtual   #768 <Method StringBuilder StringBuilder.deleteCharAt(int)>
	//   74  144:pop             
		abyte0 = ((byte []) (((StringBuilder) (obj1)).toString()));
	//   75  145:aload_3         
	//   76  146:invokevirtual   #323 <Method String StringBuilder.toString()>
	//   77  149:astore_2        
		return ((String) (abyte0));
	//   78  150:aload_2         
	//   79  151:areturn         
_L6:
		return "02:00:00:00:00:00";
	//   80  152:ldc2            #487 <String "02:00:00:00:00:00">
	//   81  155:areturn         
		Throwable throwable;
		throwable;
	//   82  156:astore_2        
		if(true) goto _L6; else goto _L5
_L5:
	//*  83  157:goto            152
	}

	private static String z()
	{
		Object obj;
		FileReader filereader1;
		BufferedReader bufferedreader;
		BufferedReader bufferedreader1;
		FileReader filereader2;
		String s1;
		String s2;
		filereader2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		filereader1 = null;
	//    2    3:aconst_null     
	//    3    4:astore_2        
		s2 = null;
	//    4    5:aconst_null     
	//    5    6:astore          7
		bufferedreader1 = null;
	//    6    8:aconst_null     
	//    7    9:astore          4
		s1 = "";
	//    8   11:ldc1            #55  <String "">
	//    9   13:astore          6
		obj = ((Object) (bufferedreader1));
	//   10   15:aload           4
	//   11   17:astore_0        
		bufferedreader = ((BufferedReader) (s2));
	//   12   18:aload           7
	//   13   20:astore_3        
		FileReader filereader;
		Object obj1;
		String as[];
		try
		{
			filereader = new FileReader("/proc/cpuinfo");
	//   14   21:new             #277 <Class FileReader>
	//   15   24:dup             
	//   16   25:ldc1            #168 <String "/proc/cpuinfo">
	//   17   27:invokespecial   #278 <Method void FileReader(String)>
	//   18   30:astore_1        
		}
	//*  19   31:aload_1         
	//*  20   32:astore_2        
	//*  21   33:aload           4
	//*  22   35:astore_0        
	//*  23   36:aload_1         
	//*  24   37:astore          5
	//*  25   39:aload           7
	//*  26   41:astore_3        
	//*  27   42:new             #280 <Class BufferedReader>
	//*  28   45:dup             
	//*  29   46:aload_1         
	//*  30   47:sipush          8192
	//*  31   50:invokespecial   #329 <Method void BufferedReader(java.io.Reader, int)>
	//*  32   53:astore          4
	//*  33   55:aload_1         
	//*  34   56:astore_2        
	//*  35   57:aload           4
	//*  36   59:astore_0        
	//*  37   60:aload_1         
	//*  38   61:astore          5
	//*  39   63:aload           4
	//*  40   65:astore_3        
	//*  41   66:aload           4
	//*  42   68:invokevirtual   #282 <Method String BufferedReader.readLine()>
	//*  43   71:astore          7
	//*  44   73:aload           6
	//*  45   75:astore_0        
	//*  46   76:aload           7
	//*  47   78:ifnull          196
	//*  48   81:aload_1         
	//*  49   82:astore_2        
	//*  50   83:aload           4
	//*  51   85:astore_0        
	//*  52   86:aload_1         
	//*  53   87:astore          5
	//*  54   89:aload           4
	//*  55   91:astore_3        
	//*  56   92:aload           7
	//*  57   94:invokestatic    #393 <Method boolean ei.b(String)>
	//*  58   97:ifne            55
	//*  59  100:aload_1         
	//*  60  101:astore_2        
	//*  61  102:aload           4
	//*  62  104:astore_0        
	//*  63  105:aload_1         
	//*  64  106:astore          5
	//*  65  108:aload           4
	//*  66  110:astore_3        
	//*  67  111:aload           7
	//*  68  113:ldc1            #193 <String ":">
	//*  69  115:invokevirtual   #334 <Method String[] String.split(String)>
	//*  70  118:astore          7
	//*  71  120:aload           7
	//*  72  122:ifnull          193
	//*  73  125:aload_1         
	//*  74  126:astore_2        
	//*  75  127:aload           4
	//*  76  129:astore_0        
	//*  77  130:aload_1         
	//*  78  131:astore          5
	//*  79  133:aload           4
	//*  80  135:astore_3        
	//*  81  136:aload           7
	//*  82  138:arraylength     
	//*  83  139:iconst_1        
	//*  84  140:icmple          193
	//*  85  143:aload_1         
	//*  86  144:astore_2        
	//*  87  145:aload           4
	//*  88  147:astore_0        
	//*  89  148:aload_1         
	//*  90  149:astore          5
	//*  91  151:aload           4
	//*  92  153:astore_3        
	//*  93  154:aload           7
	//*  94  156:iconst_0        
	//*  95  157:aaload          
	//*  96  158:ldc2            #770 <String "BogoMIPS">
	//*  97  161:invokevirtual   #594 <Method boolean String.contains(CharSequence)>
	//*  98  164:ifeq            193
	//*  99  167:aload_1         
	//* 100  168:astore_2        
	//* 101  169:aload           4
	//* 102  171:astore_0        
	//* 103  172:aload_1         
	//* 104  173:astore          5
	//* 105  175:aload           4
	//* 106  177:astore_3        
	//* 107  178:aload           7
	//* 108  180:iconst_1        
	//* 109  181:aaload          
	//* 110  182:invokevirtual   #203 <Method String String.trim()>
	//* 111  185:astore          6
	//* 112  187:aload           6
	//* 113  189:astore_0        
	//* 114  190:goto            196
	//* 115  193:goto            55
	//* 116  196:aload_1         
	//* 117  197:invokevirtual   #289 <Method void FileReader.close()>
	//* 118  200:aload           4
	//* 119  202:invokevirtual   #290 <Method void BufferedReader.close()>
	//* 120  205:aload_0         
	//* 121  206:areturn         
	//* 122  207:aload           5
	//* 123  209:ifnull          217
	//* 124  212:aload           5
	//* 125  214:invokevirtual   #289 <Method void FileReader.close()>
	//* 126  217:aload_3         
	//* 127  218:ifnull          247
	//* 128  221:aload_3         
	//* 129  222:invokevirtual   #290 <Method void BufferedReader.close()>
	//* 130  225:ldc1            #55  <String "">
	//* 131  227:areturn         
	//* 132  228:astore_1        
	//* 133  229:aload_2         
	//* 134  230:ifnull          237
	//* 135  233:aload_2         
	//* 136  234:invokevirtual   #289 <Method void FileReader.close()>
	//* 137  237:aload_0         
	//* 138  238:ifnull          245
	//* 139  241:aload_0         
	//* 140  242:invokevirtual   #290 <Method void BufferedReader.close()>
	//* 141  245:aload_1         
	//* 142  246:athrow          
	//* 143  247:ldc1            #55  <String "">
	//* 144  249:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			if(filereader2 != null)
				try
				{
					filereader2.close();
				}
	//* 145  250:astore_0        
	//* 146  251:goto            207
	//* 147  254:astore_1        
	//* 148  255:goto            200
	//* 149  258:astore_1        
	//* 150  259:aload_0         
	//* 151  260:areturn         
				catch(Throwable throwable) { }
	//  152  261:astore_0        
			if(bufferedreader != null)
			{
				try
				{
					bufferedreader.close();
				}
	//* 153  262:goto            217
				catch(Throwable throwable1)
	//* 154  265:astore_0        
				{
					return "";
	//  155  266:ldc1            #55  <String "">
	//  156  268:areturn         
				}
				return "";
			} else
			{
				return "";
			}
		}
		filereader1 = filereader;
		obj = ((Object) (bufferedreader1));
		filereader2 = filereader;
		bufferedreader = ((BufferedReader) (s2));
		bufferedreader1 = new BufferedReader(((java.io.Reader) (filereader)), 8192);
_L2:
		filereader1 = filereader;
		obj = ((Object) (bufferedreader1));
		filereader2 = filereader;
		bufferedreader = bufferedreader1;
		s2 = bufferedreader1.readLine();
		obj = ((Object) (s1));
		if(s2 == null)
			break MISSING_BLOCK_LABEL_196;
		filereader1 = filereader;
		obj = ((Object) (bufferedreader1));
		filereader2 = filereader;
		bufferedreader = bufferedreader1;
		if(ei.b(s2)) goto _L2; else goto _L1
_L1:
		filereader1 = filereader;
		obj = ((Object) (bufferedreader1));
		filereader2 = filereader;
		bufferedreader = bufferedreader1;
		as = s2.split(":");
		if(as == null) goto _L2; else goto _L3
_L3:
		filereader1 = filereader;
		obj = ((Object) (bufferedreader1));
		filereader2 = filereader;
		bufferedreader = bufferedreader1;
		if(as.length <= 1) goto _L2; else goto _L4
_L4:
		filereader1 = filereader;
		obj = ((Object) (bufferedreader1));
		filereader2 = filereader;
		bufferedreader = bufferedreader1;
		if(!as[0].contains("BogoMIPS")) goto _L2; else goto _L5
_L5:
		filereader1 = filereader;
		obj = ((Object) (bufferedreader1));
		filereader2 = filereader;
		bufferedreader = bufferedreader1;
		s1 = as[1].trim();
		obj = ((Object) (s1));
		try
		{
			filereader.close();
		}
		// Misplaced declaration of an exception variable
		catch(Object obj1) { }
		try
		{
			bufferedreader1.close();
		}
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			return ((String) (obj));
		}
		return ((String) (obj));
		obj1;
		if(filereader1 != null)
			try
			{
				filereader1.close();
			}
			catch(Throwable throwable3) { }
	//  157  269:astore_2        
		if(obj != null)
			try
			{
				((BufferedReader) (obj)).close();
			}
	//* 158  270:goto            237
			catch(Throwable throwable2) { }
	//  159  273:astore_0        
		throw obj1;
	//* 160  274:goto            245
	}

	public static String z(Context context)
	{
		int j;
		boolean flag;
		int i1;
		StringBuilder stringbuilder;
		try
		{
			context = ((Context) (context.registerReceiver(((android.content.BroadcastReceiver) (null)), new IntentFilter("android.intent.action.BATTERY_CHANGED"))));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:new             #772 <Class IntentFilter>
	//    3    5:dup             
	//    4    6:ldc2            #774 <String "android.intent.action.BATTERY_CHANGED">
	//    5    9:invokespecial   #775 <Method void IntentFilter(String)>
	//    6   12:invokevirtual   #779 <Method Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//    7   15:astore_0        
			i1 = ((Intent) (context)).getIntExtra("level", -1);
	//    8   16:aload_0         
	//    9   17:ldc2            #781 <String "level">
	//   10   20:iconst_m1       
	//   11   21:invokevirtual   #787 <Method int Intent.getIntExtra(String, int)>
	//   12   24:istore_2        
			j = ((Intent) (context)).getIntExtra("status", -1);
	//   13   25:aload_0         
	//   14   26:ldc2            #789 <String "status">
	//   15   29:iconst_m1       
	//   16   30:invokevirtual   #787 <Method int Intent.getIntExtra(String, int)>
	//   17   33:istore_1        
		}
	//*  18   34:iload_1         
	//*  19   35:iconst_2        
	//*  20   36:icmpeq          92
	//*  21   39:iload_1         
	//*  22   40:iconst_5        
	//*  23   41:icmpne          97
	//*  24   44:goto            92
	//*  25   47:new             #302 <Class StringBuilder>
	//*  26   50:dup             
	//*  27   51:invokespecial   #303 <Method void StringBuilder()>
	//*  28   54:astore_3        
	//*  29   55:iload_1         
	//*  30   56:ifeq            102
	//*  31   59:ldc1            #73  <String "1">
	//*  32   61:astore_0        
	//*  33   62:goto            65
	//*  34   65:aload_3         
	//*  35   66:aload_0         
	//*  36   67:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//*  37   70:ldc1            #193 <String ":">
	//*  38   72:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//*  39   75:iload_2         
	//*  40   76:invokevirtual   #373 <Method StringBuilder StringBuilder.append(int)>
	//*  41   79:invokevirtual   #323 <Method String StringBuilder.toString()>
	//*  42   82:astore_0        
	//*  43   83:aload_0         
	//*  44   84:areturn         
	//*  45   85:ldc1            #55  <String "">
	//*  46   87:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return "";
		}
		if(j == 2 || j == 5)
	//*  47   88:astore_0        
	//*  48   89:goto            85
			flag = true;
	//   49   92:iconst_1        
	//   50   93:istore_1        
		else
	//*  51   94:goto            47
			flag = false;
	//   52   97:iconst_0        
	//   53   98:istore_1        
		stringbuilder = new StringBuilder();
		if(flag)
			context = "1";
		else
	//*  54   99:goto            47
			context = "0";
	//   55  102:ldc1            #75  <String "0">
	//   56  104:astore_0        
		context = ((Context) (stringbuilder.append(((String) (context))).append(":").append(i1).toString()));
		return ((String) (context));
	//*  57  105:goto            65
	}

	public final String a()
	{
		Throwable throwable;
		int j;
		try
		{
			j = (new File("/sys/devices/system/cpu/")).listFiles(((java.io.FileFilter) (new em(this)))).length;
	//    0    0:new             #86  <Class File>
	//    1    3:dup             
	//    2    4:ldc2            #791 <String "/sys/devices/system/cpu/">
	//    3    7:invokespecial   #169 <Method void File(String)>
	//    4   10:new             #793 <Class em>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:invokespecial   #796 <Method void em(eo)>
	//    8   18:invokevirtual   #800 <Method File[] File.listFiles(java.io.FileFilter)>
	//    9   21:arraylength     
	//   10   22:istore_1        
		}
	//*  11   23:iload_1         
	//*  12   24:invokestatic    #259 <Method String String.valueOf(int)>
	//*  13   27:areturn         
	//*  14   28:ldc1            #73  <String "1">
	//*  15   30:areturn         
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			return "1";
		}
		return String.valueOf(j);
	//*  16   31:astore_2        
	//*  17   32:goto            28
	}

	private static eo c = new eo();

	static 
	{
	//    0    0:new             #2   <Class eo>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void eo()>
	//    3    7:putstatic       #13  <Field eo c>
	//*   4   10:return          
	}
}
