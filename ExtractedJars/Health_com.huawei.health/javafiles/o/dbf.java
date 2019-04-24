// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.app.ActivityManager;
import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.*;
import android.content.pm.*;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.*;
import android.os.Build;
import android.os.RemoteException;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hwcommonmodel.application.BaseApplication;
import java.io.*;
import java.lang.reflect.*;
import java.math.BigDecimal;
import java.security.PublicKey;
import java.security.cert.*;
import java.text.*;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package o:
//			dho, cwx, dhu, dbp, 
//			cxc, czx

public class dbf
{

	public dbf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static boolean A()
	{
		boolean flag;
		String s1 = Build.MANUFACTURER;
	//    0    0:getstatic       #41  <Field String Build.MANUFACTURER>
	//    1    3:astore_1        
		String s2 = Build.MODEL.toUpperCase();
	//    2    4:getstatic       #44  <Field String Build.MODEL>
	//    3    7:invokevirtual   #50  <Method String String.toUpperCase()>
	//    4   10:astore_2        
		if(!s1.equalsIgnoreCase("huawei"))
			break MISSING_BLOCK_LABEL_76;
	//    5   11:aload_1         
	//    6   12:ldc1            #52  <String "huawei">
	//    7   14:invokevirtual   #56  <Method boolean String.equalsIgnoreCase(String)>
	//    8   17:ifeq            51
		if(s2.contains("HMA") || s2.contains("LYA"))
			break MISSING_BLOCK_LABEL_49;
	//    9   20:aload_2         
	//   10   21:ldc1            #58  <String "HMA">
	//   11   23:invokevirtual   #62  <Method boolean String.contains(CharSequence)>
	//   12   26:ifne            49
	//   13   29:aload_2         
	//   14   30:ldc1            #64  <String "LYA">
	//   15   32:invokevirtual   #62  <Method boolean String.contains(CharSequence)>
	//   16   35:ifne            49
		flag = s2.contains("EVR");
	//   17   38:aload_2         
	//   18   39:ldc1            #66  <String "EVR">
	//   19   41:invokevirtual   #62  <Method boolean String.contains(CharSequence)>
	//   20   44:istore_0        
		if(!flag)
			break MISSING_BLOCK_LABEL_76;
	//   21   45:iload_0         
	//   22   46:ifeq            51
		return true;
	//   23   49:iconst_1        
	//   24   50:ireturn         
	//*  25   51:goto            76
		Exception exception;
		exception;
	//   26   54:astore_1        
		dho.f("CommonUtil", new Object[] {
			"isMATE20 --", exception.getMessage()
		});
	//   27   55:ldc1            #68  <String "CommonUtil">
	//   28   57:iconst_2        
	//   29   58:anewarray       Object[]
	//   30   61:dup             
	//   31   62:iconst_0        
	//   32   63:ldc1            #70  <String "isMATE20 --">
	//   33   65:aastore         
	//   34   66:dup             
	//   35   67:iconst_1        
	//   36   68:aload_1         
	//   37   69:invokevirtual   #73  <Method String Exception.getMessage()>
	//   38   72:aastore         
	//   39   73:invokestatic    #79  <Method void dho.f(String, Object[])>
		return false;
	//   40   76:iconst_0        
	//   41   77:ireturn         
	}

	public static boolean A(Context context)
	{
		boolean flag;
		boolean flag1;
		boolean flag2;
		String s1;
		ArrayList arraylist;
		s1 = p(context, "com.google.android.webview");
	//    0    0:aload_0         
	//    1    1:ldc1            #84  <String "com.google.android.webview">
	//    2    3:invokestatic    #88  <Method String p(Context, String)>
	//    3    6:astore          5
		arraylist = new ArrayList();
	//    4    8:new             #90  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #91  <Method void ArrayList()>
	//    7   15:astore          6
		arraylist.add("60.0.3112.116");
	//    8   17:aload           6
	//    9   19:ldc1            #93  <String "60.0.3112.116">
	//   10   21:invokevirtual   #97  <Method boolean ArrayList.add(Object)>
	//   11   24:pop             
		arraylist.add("60.0.3112.107");
	//   12   25:aload           6
	//   13   27:ldc1            #99  <String "60.0.3112.107">
	//   14   29:invokevirtual   #97  <Method boolean ArrayList.add(Object)>
	//   15   32:pop             
		arraylist.add("60.0.3112.78");
	//   16   33:aload           6
	//   17   35:ldc1            #101 <String "60.0.3112.78">
	//   18   37:invokevirtual   #97  <Method boolean ArrayList.add(Object)>
	//   19   40:pop             
		flag1 = false;
	//   20   41:iconst_0        
	//   21   42:istore_2        
		flag2 = false;
	//   22   43:iconst_0        
	//   23   44:istore_3        
		flag = flag1;
	//   24   45:iload_2         
	//   25   46:istore_1        
		context = ((Context) (context.getPackageManager().getPackageInfo("com.google.android.webview", 1)));
	//   26   47:aload_0         
	//   27   48:invokevirtual   #107 <Method PackageManager Context.getPackageManager()>
	//   28   51:ldc1            #84  <String "com.google.android.webview">
	//   29   53:iconst_1        
	//   30   54:invokevirtual   #113 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   31   57:astore_0        
		flag = flag1;
	//   32   58:iload_2         
	//   33   59:istore_1        
		flag1 = b(((PackageInfo) (context)));
	//   34   60:aload_0         
	//   35   61:invokestatic    #116 <Method boolean b(PackageInfo)>
	//   36   64:istore_2        
		flag = flag1;
	//   37   65:iload_2         
	//   38   66:istore_1        
		boolean flag3 = a(((PackageInfo) (context)));
	//   39   67:aload_0         
	//   40   68:invokestatic    #118 <Method boolean a(PackageInfo)>
	//   41   71:istore          4
		flag = flag3;
	//   42   73:iload           4
	//   43   75:istore_1        
		flag2 = flag;
	//   44   76:iload_1         
	//   45   77:istore_3        
		break MISSING_BLOCK_LABEL_118;
	//   46   78:goto            118
		context;
	//   47   81:astore_0        
		dho.b("CommonUtil", new Object[] {
			(new StringBuilder()).append("isErrorWebView: e").append(((android.content.pm.PackageManager.NameNotFoundException) (context)).getMessage()).toString()
		});
	//   48   82:ldc1            #68  <String "CommonUtil">
	//   49   84:iconst_1        
	//   50   85:anewarray       Object[]
	//   51   88:dup             
	//   52   89:iconst_0        
	//   53   90:new             #120 <Class StringBuilder>
	//   54   93:dup             
	//   55   94:invokespecial   #121 <Method void StringBuilder()>
	//   56   97:ldc1            #123 <String "isErrorWebView: e">
	//   57   99:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   58  102:aload_0         
	//   59  103:invokevirtual   #128 <Method String android.content.pm.PackageManager$NameNotFoundException.getMessage()>
	//   60  106:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   61  109:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   62  112:aastore         
	//   63  113:invokestatic    #133 <Method void dho.b(String, Object[])>
		flag1 = flag;
	//   64  116:iload_1         
	//   65  117:istore_2        
		dho.b("CommonUtil", new Object[] {
			" isSystemUpdateApp : ", Boolean.valueOf(flag1), "isUserApp : ", Boolean.valueOf(flag2)
		});
	//   66  118:ldc1            #68  <String "CommonUtil">
	//   67  120:iconst_4        
	//   68  121:anewarray       Object[]
	//   69  124:dup             
	//   70  125:iconst_0        
	//   71  126:ldc1            #135 <String " isSystemUpdateApp : ">
	//   72  128:aastore         
	//   73  129:dup             
	//   74  130:iconst_1        
	//   75  131:iload_2         
	//   76  132:invokestatic    #141 <Method Boolean Boolean.valueOf(boolean)>
	//   77  135:aastore         
	//   78  136:dup             
	//   79  137:iconst_2        
	//   80  138:ldc1            #143 <String "isUserApp : ">
	//   81  140:aastore         
	//   82  141:dup             
	//   83  142:iconst_3        
	//   84  143:iload_3         
	//   85  144:invokestatic    #141 <Method Boolean Boolean.valueOf(boolean)>
	//   86  147:aastore         
	//   87  148:invokestatic    #133 <Method void dho.b(String, Object[])>
		if(arraylist.contains(((Object) (s1))))
	//*  88  151:aload           6
	//*  89  153:aload           5
	//*  90  155:invokevirtual   #145 <Method boolean ArrayList.contains(Object)>
	//*  91  158:ifeq            195
		{
			dho.b("CommonUtil", new Object[] {
				"listErrorVersion.contains(webviewVersion)"
			});
	//   92  161:ldc1            #68  <String "CommonUtil">
	//   93  163:iconst_1        
	//   94  164:anewarray       Object[]
	//   95  167:dup             
	//   96  168:iconst_0        
	//   97  169:ldc1            #147 <String "listErrorVersion.contains(webviewVersion)">
	//   98  171:aastore         
	//   99  172:invokestatic    #133 <Method void dho.b(String, Object[])>
			if(flag1 || flag2 || "60.0.3112.107".equals(((Object) (s1))))
	//* 100  175:iload_2         
	//* 101  176:ifne            193
	//* 102  179:iload_3         
	//* 103  180:ifne            193
	//* 104  183:ldc1            #99  <String "60.0.3112.107">
	//* 105  185:aload           5
	//* 106  187:invokevirtual   #150 <Method boolean String.equals(Object)>
	//* 107  190:ifeq            195
				return true;
	//  108  193:iconst_1        
	//  109  194:ireturn         
		}
		return false;
	//  110  195:iconst_0        
	//  111  196:ireturn         
	}

	public static boolean B(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		String s1 = context.getPackageName();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #154 <Method String Context.getPackageName()>
	//    6   10:astore_1        
		dho.b("CommonUtil", new Object[] {
			(new StringBuilder()).append("isBackground packageName : ").append(s1).toString()
		});
	//    7   11:ldc1            #68  <String "CommonUtil">
	//    8   13:iconst_1        
	//    9   14:anewarray       Object[]
	//   10   17:dup             
	//   11   18:iconst_0        
	//   12   19:new             #120 <Class StringBuilder>
	//   13   22:dup             
	//   14   23:invokespecial   #121 <Method void StringBuilder()>
	//   15   26:ldc1            #156 <String "isBackground packageName : ">
	//   16   28:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   19   35:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   20   38:aastore         
	//   21   39:invokestatic    #133 <Method void dho.b(String, Object[])>
		context = ((Context) (((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses()));
	//   22   42:aload_0         
	//   23   43:ldc1            #158 <String "activity">
	//   24   45:invokevirtual   #162 <Method Object Context.getSystemService(String)>
	//   25   48:checkcast       #164 <Class ActivityManager>
	//   26   51:invokevirtual   #168 <Method List ActivityManager.getRunningAppProcesses()>
	//   27   54:astore_0        
		if(context == null || ((List) (context)).size() <= 0)
	//*  28   55:aload_0         
	//*  29   56:ifnull          68
	//*  30   59:aload_0         
	//*  31   60:invokeinterface #174 <Method int List.size()>
	//*  32   65:ifgt            84
		{
			dho.b("CommonUtil", new Object[] {
				"isBackground null == appProcesses || appProcesses.size() <= 0"
			});
	//   33   68:ldc1            #68  <String "CommonUtil">
	//   34   70:iconst_1        
	//   35   71:anewarray       Object[]
	//   36   74:dup             
	//   37   75:iconst_0        
	//   38   76:ldc1            #176 <String "isBackground null == appProcesses || appProcesses.size() <= 0">
	//   39   78:aastore         
	//   40   79:invokestatic    #133 <Method void dho.b(String, Object[])>
			return false;
	//   41   82:iconst_0        
	//   42   83:ireturn         
		}
		for(context = ((Context) (((List) (context)).iterator())); ((Iterator) (context)).hasNext();)
	//*  43   84:aload_0         
	//*  44   85:invokeinterface #180 <Method Iterator List.iterator()>
	//*  45   90:astore_0        
	//*  46   91:aload_0         
	//*  47   92:invokeinterface #185 <Method boolean Iterator.hasNext()>
	//*  48   97:ifeq            205
		{
			android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (context)).next();
	//   49  100:aload_0         
	//   50  101:invokeinterface #189 <Method Object Iterator.next()>
	//   51  106:checkcast       #191 <Class android.app.ActivityManager$RunningAppProcessInfo>
	//   52  109:astore_2        
			dho.b("CommonUtil", new Object[] {
				(new StringBuilder()).append("isBackground appProcess : ").append(runningappprocessinfo.processName).toString()
			});
	//   53  110:ldc1            #68  <String "CommonUtil">
	//   54  112:iconst_1        
	//   55  113:anewarray       Object[]
	//   56  116:dup             
	//   57  117:iconst_0        
	//   58  118:new             #120 <Class StringBuilder>
	//   59  121:dup             
	//   60  122:invokespecial   #121 <Method void StringBuilder()>
	//   61  125:ldc1            #193 <String "isBackground appProcess : ">
	//   62  127:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   63  130:aload_2         
	//   64  131:getfield        #196 <Field String android.app.ActivityManager$RunningAppProcessInfo.processName>
	//   65  134:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   66  137:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   67  140:aastore         
	//   68  141:invokestatic    #133 <Method void dho.b(String, Object[])>
			if(s1.equals(((Object) (runningappprocessinfo.processName))))
	//*  69  144:aload_1         
	//*  70  145:aload_2         
	//*  71  146:getfield        #196 <Field String android.app.ActivityManager$RunningAppProcessInfo.processName>
	//*  72  149:invokevirtual   #150 <Method boolean String.equals(Object)>
	//*  73  152:ifeq            202
			{
				dho.b("CommonUtil", new Object[] {
					(new StringBuilder()).append("isBackground appProcess packageName.equals  ").append(runningappprocessinfo.importance).toString()
				});
	//   74  155:ldc1            #68  <String "CommonUtil">
	//   75  157:iconst_1        
	//   76  158:anewarray       Object[]
	//   77  161:dup             
	//   78  162:iconst_0        
	//   79  163:new             #120 <Class StringBuilder>
	//   80  166:dup             
	//   81  167:invokespecial   #121 <Method void StringBuilder()>
	//   82  170:ldc1            #198 <String "isBackground appProcess packageName.equals  ">
	//   83  172:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   84  175:aload_2         
	//   85  176:getfield        #202 <Field int android.app.ActivityManager$RunningAppProcessInfo.importance>
	//   86  179:invokevirtual   #205 <Method StringBuilder StringBuilder.append(int)>
	//   87  182:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   88  185:aastore         
	//   89  186:invokestatic    #133 <Method void dho.b(String, Object[])>
				return runningappprocessinfo.importance != 100;
	//   90  189:aload_2         
	//   91  190:getfield        #202 <Field int android.app.ActivityManager$RunningAppProcessInfo.importance>
	//   92  193:bipush          100
	//   93  195:icmpeq          200
	//   94  198:iconst_1        
	//   95  199:ireturn         
	//   96  200:iconst_0        
	//   97  201:ireturn         
			}
		}

	//*  98  202:goto            91
		return false;
	//   99  205:iconst_0        
	//  100  206:ireturn         
	}

	private static String C()
	{
		UUID uuid = UUID.randomUUID();
	//    0    0:invokestatic    #212 <Method UUID UUID.randomUUID()>
	//    1    3:astore_0        
		String s1 = uuid.toString().replace("-", "");
	//    2    4:aload_0         
	//    3    5:invokevirtual   #213 <Method String UUID.toString()>
	//    4    8:ldc1            #215 <String "-">
	//    5   10:ldc1            #217 <String "">
	//    6   12:invokevirtual   #221 <Method String String.replace(CharSequence, CharSequence)>
	//    7   15:astore_1        
		dho.b("CommonUtil", new Object[] {
			(new StringBuilder()).append("random uuid = ").append(((Object) (uuid))).toString()
		});
	//    8   16:ldc1            #68  <String "CommonUtil">
	//    9   18:iconst_1        
	//   10   19:anewarray       Object[]
	//   11   22:dup             
	//   12   23:iconst_0        
	//   13   24:new             #120 <Class StringBuilder>
	//   14   27:dup             
	//   15   28:invokespecial   #121 <Method void StringBuilder()>
	//   16   31:ldc1            #223 <String "random uuid = ">
	//   17   33:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:aload_0         
	//   19   37:invokevirtual   #226 <Method StringBuilder StringBuilder.append(Object)>
	//   20   40:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   21   43:aastore         
	//   22   44:invokestatic    #133 <Method void dho.b(String, Object[])>
		return s1;
	//   23   47:aload_1         
	//   24   48:areturn         
	}

	public static boolean C(Context context)
	{
		int i1 = (new cwx(context.getApplicationContext())).c("com.huawei.bone");
	//    0    0:new             #228 <Class cwx>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #232 <Method Context Context.getApplicationContext()>
	//    4    8:invokespecial   #235 <Method void cwx(Context)>
	//    5   11:ldc1            #237 <String "com.huawei.bone">
	//    6   13:invokevirtual   #240 <Method int cwx.c(String)>
	//    7   16:istore_1        
		dho.f("CommonUtil", new Object[] {
			(new StringBuilder()).append("versionCode:").append(i1).append("  res:").append(i1 % 1000).toString()
		});
	//    8   17:ldc1            #68  <String "CommonUtil">
	//    9   19:iconst_1        
	//   10   20:anewarray       Object[]
	//   11   23:dup             
	//   12   24:iconst_0        
	//   13   25:new             #120 <Class StringBuilder>
	//   14   28:dup             
	//   15   29:invokespecial   #121 <Method void StringBuilder()>
	//   16   32:ldc1            #242 <String "versionCode:">
	//   17   34:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   18   37:iload_1         
	//   19   38:invokevirtual   #205 <Method StringBuilder StringBuilder.append(int)>
	//   20   41:ldc1            #244 <String "  res:">
	//   21   43:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   22   46:iload_1         
	//   23   47:sipush          1000
	//   24   50:irem            
	//   25   51:invokevirtual   #205 <Method StringBuilder StringBuilder.append(int)>
	//   26   54:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   27   57:aastore         
	//   28   58:invokestatic    #79  <Method void dho.f(String, Object[])>
		boolean flag1 = false;
	//   29   61:iconst_0        
	//   30   62:istore_3        
		boolean flag = flag1;
	//   31   63:iload_3         
	//   32   64:istore_2        
		if(i1 > 0)
	//*  33   65:iload_1         
	//*  34   66:ifle            84
		{
			flag = flag1;
	//   35   69:iload_3         
	//   36   70:istore_2        
			if(i1 % 1000 >= 375)
	//*  37   71:iload_1         
	//*  38   72:sipush          1000
	//*  39   75:irem            
	//*  40   76:sipush          375
	//*  41   79:icmplt          84
				flag = true;
	//   42   82:iconst_1        
	//   43   83:istore_2        
		}
		dho.f("CommonUtil", new Object[] {
			(new StringBuilder()).append("versionCode:").append(i1).append("  res:").append(flag).toString()
		});
	//   44   84:ldc1            #68  <String "CommonUtil">
	//   45   86:iconst_1        
	//   46   87:anewarray       Object[]
	//   47   90:dup             
	//   48   91:iconst_0        
	//   49   92:new             #120 <Class StringBuilder>
	//   50   95:dup             
	//   51   96:invokespecial   #121 <Method void StringBuilder()>
	//   52   99:ldc1            #242 <String "versionCode:">
	//   53  101:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   54  104:iload_1         
	//   55  105:invokevirtual   #205 <Method StringBuilder StringBuilder.append(int)>
	//   56  108:ldc1            #244 <String "  res:">
	//   57  110:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   58  113:iload_2         
	//   59  114:invokevirtual   #247 <Method StringBuilder StringBuilder.append(boolean)>
	//   60  117:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   61  120:aastore         
	//   62  121:invokestatic    #79  <Method void dho.f(String, Object[])>
		return flag;
	//   63  124:iload_2         
	//   64  125:ireturn         
	}

	public static boolean D()
	{
		return "debug".equals("release");
	//    0    0:ldc1            #250 <String "debug">
	//    1    2:ldc1            #252 <String "release">
	//    2    4:invokevirtual   #150 <Method boolean String.equals(Object)>
	//    3    7:ireturn         
	}

	public static boolean D(Context context)
	{
label0:
		{
			context = ((Context) (((ActivityManager)context.getSystemService("activity")).getRunningServices(300)));
	//    0    0:aload_0         
	//    1    1:ldc1            #158 <String "activity">
	//    2    3:invokevirtual   #162 <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #164 <Class ActivityManager>
	//    4    9:sipush          300
	//    5   12:invokevirtual   #256 <Method List ActivityManager.getRunningServices(int)>
	//    6   15:astore_0        
			if(context == null)
				break label0;
	//    7   16:aload_0         
	//    8   17:ifnull          120
			context = ((Context) (((List) (context)).iterator()));
	//    9   20:aload_0         
	//   10   21:invokeinterface #180 <Method Iterator List.iterator()>
	//   11   26:astore_0        
			android.app.ActivityManager.RunningServiceInfo runningserviceinfo;
			do
			{
				if(!((Iterator) (context)).hasNext())
					break label0;
	//   12   27:aload_0         
	//   13   28:invokeinterface #185 <Method boolean Iterator.hasNext()>
	//   14   33:ifeq            120
				runningserviceinfo = (android.app.ActivityManager.RunningServiceInfo)((Iterator) (context)).next();
	//   15   36:aload_0         
	//   16   37:invokeinterface #189 <Method Object Iterator.next()>
	//   17   42:checkcast       #258 <Class android.app.ActivityManager$RunningServiceInfo>
	//   18   45:astore_1        
				dho.b("CommonUtil", new Object[] {
					(new StringBuilder()).append("11111 serivce is :").append(runningserviceinfo.service.getClassName()).toString()
				});
	//   19   46:ldc1            #68  <String "CommonUtil">
	//   20   48:iconst_1        
	//   21   49:anewarray       Object[]
	//   22   52:dup             
	//   23   53:iconst_0        
	//   24   54:new             #120 <Class StringBuilder>
	//   25   57:dup             
	//   26   58:invokespecial   #121 <Method void StringBuilder()>
	//   27   61:ldc2            #260 <String "11111 serivce is :">
	//   28   64:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   29   67:aload_1         
	//   30   68:getfield        #264 <Field ComponentName android.app.ActivityManager$RunningServiceInfo.service>
	//   31   71:invokevirtual   #269 <Method String ComponentName.getClassName()>
	//   32   74:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   33   77:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   34   80:aastore         
	//   35   81:invokestatic    #133 <Method void dho.b(String, Object[])>
			} while(!"com.huawei.bone.ui.setting.NotificationPushListener".equals(((Object) (runningserviceinfo.service.getClassName()))));
	//   36   84:ldc2            #271 <String "com.huawei.bone.ui.setting.NotificationPushListener">
	//   37   87:aload_1         
	//   38   88:getfield        #264 <Field ComponentName android.app.ActivityManager$RunningServiceInfo.service>
	//   39   91:invokevirtual   #269 <Method String ComponentName.getClassName()>
	//   40   94:invokevirtual   #150 <Method boolean String.equals(Object)>
	//   41   97:ifeq            117
			dho.b("CommonUtil", new Object[] {
				"11111 serivce is running!!!"
			});
	//   42  100:ldc1            #68  <String "CommonUtil">
	//   43  102:iconst_1        
	//   44  103:anewarray       Object[]
	//   45  106:dup             
	//   46  107:iconst_0        
	//   47  108:ldc2            #273 <String "11111 serivce is running!!!">
	//   48  111:aastore         
	//   49  112:invokestatic    #133 <Method void dho.b(String, Object[])>
			return true;
	//   50  115:iconst_1        
	//   51  116:ireturn         
		}
	//*  52  117:goto            27
		return false;
	//   53  120:iconst_0        
	//   54  121:ireturn         
	}

	public static String E(Context context)
	{
		String s1 = "";
	//    0    0:ldc1            #217 <String "">
	//    1    2:astore_3        
		if(context == null)
	//*   2    3:aload_0         
	//*   3    4:ifnonnull       10
			return "";
	//    4    7:ldc1            #217 <String "">
	//    5    9:areturn         
		String as[] = context.getResources().getStringArray(com.huawei.hwcommonmodel.R.array.CountryCodes);
	//    6   10:aload_0         
	//    7   11:invokevirtual   #279 <Method Resources Context.getResources()>
	//    8   14:getstatic       #284 <Field int com.huawei.hwcommonmodel.R$array.CountryCodes>
	//    9   17:invokevirtual   #290 <Method String[] Resources.getStringArray(int)>
	//   10   20:astore          5
		if(as == null)
	//*  11   22:aload           5
	//*  12   24:ifnonnull       30
			return "";
	//   13   27:ldc1            #217 <String "">
	//   14   29:areturn         
		TelephonyManager telephonymanager = (TelephonyManager)context.getSystemService("phone");
	//   15   30:aload_0         
	//   16   31:ldc2            #292 <String "phone">
	//   17   34:invokevirtual   #162 <Method Object Context.getSystemService(String)>
	//   18   37:checkcast       #294 <Class TelephonyManager>
	//   19   40:astore          6
		Object obj = "";
	//   20   42:ldc1            #217 <String "">
	//   21   44:astore_2        
		context = "";
	//   22   45:ldc1            #217 <String "">
	//   23   47:astore_0        
		String s2 = "";
	//   24   48:ldc1            #217 <String "">
	//   25   50:astore          4
		if(telephonymanager != null)
	//*  26   52:aload           6
	//*  27   54:ifnull          69
		{
			obj = ((Object) (telephonymanager.getSimOperator()));
	//   28   57:aload           6
	//   29   59:invokevirtual   #297 <Method String TelephonyManager.getSimOperator()>
	//   30   62:astore_2        
			context = ((Context) (telephonymanager.getNetworkOperator()));
	//   31   63:aload           6
	//   32   65:invokevirtual   #300 <Method String TelephonyManager.getNetworkOperator()>
	//   33   68:astore_0        
		}
		if(!TextUtils.isEmpty(((CharSequence) (context))) && ((String) (context)).length() >= 3)
	//*  34   69:aload_0         
	//*  35   70:invokestatic    #305 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  36   73:ifne            94
	//*  37   76:aload_0         
	//*  38   77:invokevirtual   #308 <Method int String.length()>
	//*  39   80:iconst_3        
	//*  40   81:icmplt          94
		{
			context = ((Context) (((String) (context)).substring(0, 3)));
	//   41   84:aload_0         
	//   42   85:iconst_0        
	//   43   86:iconst_3        
	//   44   87:invokevirtual   #312 <Method String String.substring(int, int)>
	//   45   90:astore_0        
		} else
	//*  46   91:goto            122
		{
			context = ((Context) (s2));
	//   47   94:aload           4
	//   48   96:astore_0        
			if(!TextUtils.isEmpty(((CharSequence) (obj))))
	//*  49   97:aload_2         
	//*  50   98:invokestatic    #305 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  51  101:ifne            122
			{
				context = ((Context) (s2));
	//   52  104:aload           4
	//   53  106:astore_0        
				if(((String) (obj)).length() >= 3)
	//*  54  107:aload_2         
	//*  55  108:invokevirtual   #308 <Method int String.length()>
	//*  56  111:iconst_3        
	//*  57  112:icmplt          122
					context = ((Context) (((String) (obj)).substring(0, 3)));
	//   58  115:aload_2         
	//   59  116:iconst_0        
	//   60  117:iconst_3        
	//   61  118:invokevirtual   #312 <Method String String.substring(int, int)>
	//   62  121:astore_0        
			}
		}
		int i1 = 0;
	//   63  122:iconst_0        
	//   64  123:istore_1        
		do
		{
			obj = ((Object) (s1));
	//   65  124:aload_3         
	//   66  125:astore_2        
			if(i1 >= as.length)
				break;
	//   67  126:iload_1         
	//   68  127:aload           5
	//   69  129:arraylength     
	//   70  130:icmpge          181
			obj = ((Object) (as[i1].split(",")));
	//   71  133:aload           5
	//   72  135:iload_1         
	//   73  136:aaload          
	//   74  137:ldc2            #314 <String ",">
	//   75  140:invokevirtual   #318 <Method String[] String.split(String)>
	//   76  143:astore_2        
			if(obj != null && ((String) (obj[0])).trim().equals(((Object) (((String) (context)).trim()))))
	//*  77  144:aload_2         
	//*  78  145:ifnull          174
	//*  79  148:aload_2         
	//*  80  149:iconst_0        
	//*  81  150:aaload          
	//*  82  151:invokevirtual   #321 <Method String String.trim()>
	//*  83  154:aload_0         
	//*  84  155:invokevirtual   #321 <Method String String.trim()>
	//*  85  158:invokevirtual   #150 <Method boolean String.equals(Object)>
	//*  86  161:ifeq            174
			{
				obj = ((Object) (((String) (obj[1])).trim()));
	//   87  164:aload_2         
	//   88  165:iconst_1        
	//   89  166:aaload          
	//   90  167:invokevirtual   #321 <Method String String.trim()>
	//   91  170:astore_2        
				break;
	//   92  171:goto            181
			}
			i1++;
	//   93  174:iload_1         
	//   94  175:iconst_1        
	//   95  176:iadd            
	//   96  177:istore_1        
		} while(true);
	//   97  178:goto            124
		dho.d("CommonUtil", new Object[] {
			(new StringBuilder()).append("retStr = ").append(((String) (obj))).toString()
		});
	//   98  181:ldc1            #68  <String "CommonUtil">
	//   99  183:iconst_1        
	//  100  184:anewarray       Object[]
	//  101  187:dup             
	//  102  188:iconst_0        
	//  103  189:new             #120 <Class StringBuilder>
	//  104  192:dup             
	//  105  193:invokespecial   #121 <Method void StringBuilder()>
	//  106  196:ldc2            #323 <String "retStr = ">
	//  107  199:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  108  202:aload_2         
	//  109  203:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  110  206:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  111  209:aastore         
	//  112  210:invokestatic    #325 <Method void dho.d(String, Object[])>
		return ((String) (obj));
	//  113  213:aload_2         
	//  114  214:areturn         
	}

	public static boolean F(Context context)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		TelephonyManager telephonymanager = (TelephonyManager)context.getSystemService("phone");
	//    2    2:aload_0         
	//    3    3:ldc2            #292 <String "phone">
	//    4    6:invokevirtual   #162 <Method Object Context.getSystemService(String)>
	//    5    9:checkcast       #294 <Class TelephonyManager>
	//    6   12:astore_3        
		String s1 = "";
	//    7   13:ldc1            #217 <String "">
	//    8   15:astore_2        
		context = "";
	//    9   16:ldc1            #217 <String "">
	//   10   18:astore_0        
		if(telephonymanager != null)
	//*  11   19:aload_3         
	//*  12   20:ifnull          33
		{
			s1 = telephonymanager.getSimOperator();
	//   13   23:aload_3         
	//   14   24:invokevirtual   #297 <Method String TelephonyManager.getSimOperator()>
	//   15   27:astore_2        
			context = ((Context) (telephonymanager.getNetworkOperator()));
	//   16   28:aload_3         
	//   17   29:invokevirtual   #300 <Method String TelephonyManager.getNetworkOperator()>
	//   18   32:astore_0        
		}
		if(TextUtils.isEmpty(((CharSequence) (s1))) || s1.length() < 3)
	//*  19   33:aload_2         
	//*  20   34:invokestatic    #305 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  21   37:ifne            48
	//*  22   40:aload_2         
	//*  23   41:invokevirtual   #308 <Method int String.length()>
	//*  24   44:iconst_3        
	//*  25   45:icmpge          50
			return false;
	//   26   48:iconst_0        
	//   27   49:ireturn         
		if(TextUtils.isEmpty(((CharSequence) (context))) || ((String) (context)).length() < 3)
	//*  28   50:aload_0         
	//*  29   51:invokestatic    #305 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  30   54:ifne            65
	//*  31   57:aload_0         
	//*  32   58:invokevirtual   #308 <Method int String.length()>
	//*  33   61:iconst_3        
	//*  34   62:icmpge          67
			return false;
	//   35   65:iconst_0        
	//   36   66:ireturn         
		s1 = s1.substring(0, 3);
	//   37   67:aload_2         
	//   38   68:iconst_0        
	//   39   69:iconst_3        
	//   40   70:invokevirtual   #312 <Method String String.substring(int, int)>
	//   41   73:astore_2        
		context = ((Context) (((String) (context)).substring(0, 3)));
	//   42   74:aload_0         
	//   43   75:iconst_0        
	//   44   76:iconst_3        
	//   45   77:invokevirtual   #312 <Method String String.substring(int, int)>
	//   46   80:astore_0        
		dho.d("CommonUtil", new Object[] {
			(new StringBuilder()).append("strSimMcc = ").append(s1).toString()
		});
	//   47   81:ldc1            #68  <String "CommonUtil">
	//   48   83:iconst_1        
	//   49   84:anewarray       Object[]
	//   50   87:dup             
	//   51   88:iconst_0        
	//   52   89:new             #120 <Class StringBuilder>
	//   53   92:dup             
	//   54   93:invokespecial   #121 <Method void StringBuilder()>
	//   55   96:ldc2            #328 <String "strSimMcc = ">
	//   56   99:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   57  102:aload_2         
	//   58  103:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   59  106:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   60  109:aastore         
	//   61  110:invokestatic    #325 <Method void dho.d(String, Object[])>
		dho.d("CommonUtil", new Object[] {
			(new StringBuilder()).append("strNetWorkMcc = ").append(((String) (context))).toString()
		});
	//   62  113:ldc1            #68  <String "CommonUtil">
	//   63  115:iconst_1        
	//   64  116:anewarray       Object[]
	//   65  119:dup             
	//   66  120:iconst_0        
	//   67  121:new             #120 <Class StringBuilder>
	//   68  124:dup             
	//   69  125:invokespecial   #121 <Method void StringBuilder()>
	//   70  128:ldc2            #330 <String "strNetWorkMcc = ">
	//   71  131:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   72  134:aload_0         
	//   73  135:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   74  138:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   75  141:aastore         
	//   76  142:invokestatic    #325 <Method void dho.d(String, Object[])>
		if(s1.equals(((Object) (context))))
	//*  77  145:aload_2         
	//*  78  146:aload_0         
	//*  79  147:invokevirtual   #150 <Method boolean String.equals(Object)>
	//*  80  150:ifeq            170
		{
			dho.b("CommonUtil", new Object[] {
				"equals:return true."
			});
	//   81  153:ldc1            #68  <String "CommonUtil">
	//   82  155:iconst_1        
	//   83  156:anewarray       Object[]
	//   84  159:dup             
	//   85  160:iconst_0        
	//   86  161:ldc2            #332 <String "equals:return true.">
	//   87  164:aastore         
	//   88  165:invokestatic    #133 <Method void dho.b(String, Object[])>
			flag = true;
	//   89  168:iconst_1        
	//   90  169:istore_1        
		}
		return flag;
	//   91  170:iload_1         
	//   92  171:ireturn         
	}

	private static void G(Context context)
	{
		IntentFilter intentfilter = new IntentFilter();
	//    0    0:new             #335 <Class IntentFilter>
	//    1    3:dup             
	//    2    4:invokespecial   #336 <Method void IntentFilter()>
	//    3    7:astore_1        
		intentfilter.addAction("com.huawei.health.update_commonutils_area");
	//    4    8:aload_1         
	//    5    9:ldc2            #338 <String "com.huawei.health.update_commonutils_area">
	//    6   12:invokevirtual   #342 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("com.huawei.health.update_commonutils_LOGIN");
	//    7   15:aload_1         
	//    8   16:ldc2            #344 <String "com.huawei.health.update_commonutils_LOGIN">
	//    9   19:invokevirtual   #342 <Method void IntentFilter.addAction(String)>
		context.registerReceiver(d, intentfilter, "com.huawei.health.INTERNAL_PERMISSION", ((android.os.Handler) (null)));
	//   10   22:aload_0         
	//   11   23:getstatic       #29  <Field BroadcastReceiver d>
	//   12   26:aload_1         
	//   13   27:ldc2            #346 <String "com.huawei.health.INTERNAL_PERMISSION">
	//   14   30:aconst_null     
	//   15   31:invokevirtual   #350 <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter, String, android.os.Handler)>
	//   16   34:pop             
	//   17   35:return          
	}

	public static String H(Context context)
	{
		if(d())
	//*   0    0:invokestatic    #353 <Method boolean d()>
	//*   1    3:ifeq            40
		{
			String s1 = w();
	//    2    6:invokestatic    #356 <Method String w()>
	//    3    9:astore_1        
			if(s1 == null)
	//*   4   10:aload_1         
	//*   5   11:ifnonnull       22
			{
				context = ((Context) (n(context)));
	//    6   14:aload_0         
	//    7   15:invokestatic    #359 <Method String n(Context)>
	//    8   18:astore_0        
			} else
	//*   9   19:goto            44
			{
				context = ((Context) (s1));
	//   10   22:aload_1         
	//   11   23:astore_0        
				if("".equals(((Object) (s1))))
	//*  12   24:ldc1            #217 <String "">
	//*  13   26:aload_1         
	//*  14   27:invokevirtual   #150 <Method boolean String.equals(Object)>
	//*  15   30:ifeq            44
					context = ((Context) (x()));
	//   16   33:invokestatic    #362 <Method String x()>
	//   17   36:astore_0        
			}
		} else
	//*  18   37:goto            44
		{
			context = ((Context) (x()));
	//   19   40:invokestatic    #362 <Method String x()>
	//   20   43:astore_0        
		}
		Object obj = ((Object) (context));
	//   21   44:aload_0         
	//   22   45:astore_1        
		if("".equals(((Object) (context))))
	//*  23   46:ldc1            #217 <String "">
	//*  24   48:aload_0         
	//*  25   49:invokevirtual   #150 <Method boolean String.equals(Object)>
	//*  26   52:ifeq            59
			obj = ((Object) (C()));
	//   27   55:invokestatic    #364 <Method String C()>
	//   28   58:astore_1        
		dho.d("CommonUtil", new Object[] {
			(new StringBuilder()).append("getDeviceId():").append(((String) (obj))).toString()
		});
	//   29   59:ldc1            #68  <String "CommonUtil">
	//   30   61:iconst_1        
	//   31   62:anewarray       Object[]
	//   32   65:dup             
	//   33   66:iconst_0        
	//   34   67:new             #120 <Class StringBuilder>
	//   35   70:dup             
	//   36   71:invokespecial   #121 <Method void StringBuilder()>
	//   37   74:ldc2            #366 <String "getDeviceId():">
	//   38   77:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   39   80:aload_1         
	//   40   81:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   41   84:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   42   87:aastore         
	//   43   88:invokestatic    #325 <Method void dho.d(String, Object[])>
		return ((String) (obj));
	//   44   91:aload_1         
	//   45   92:areturn         
	}

	public static HashMap I(Context context)
	{
		long l1;
		long l2;
		long l3;
		long l4;
		Context context1;
		Context context2;
		Context context3;
		ArrayList arraylist;
		android.app.usage.NetworkStats.Bucket bucket;
		Object obj;
		HashMap hashmap;
		hashmap = new HashMap();
	//    0    0:new             #374 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #375 <Method void HashMap()>
	//    3    7:astore          20
		bucket = null;
	//    4    9:aconst_null     
	//    5   10:astore          18
		obj = null;
	//    6   12:aconst_null     
	//    7   13:astore          19
		arraylist = null;
	//    8   15:aconst_null     
	//    9   16:astore          17
		l1 = 0L;
	//   10   18:lconst_0        
	//   11   19:lstore_2        
		l2 = 0L;
	//   12   20:lconst_0        
	//   13   21:lstore          4
		l3 = 0L;
	//   14   23:lconst_0        
	//   15   24:lstore          6
		l4 = 0L;
	//   16   26:lconst_0        
	//   17   27:lstore          8
		context2 = ((Context) (arraylist));
	//   18   29:aload           17
	//   19   31:astore          15
		context3 = ((Context) (bucket));
	//   20   33:aload           18
	//   21   35:astore          16
		context1 = ((Context) (obj));
	//   22   37:aload           19
	//   23   39:astore          14
		Object obj1 = ((Object) (Calendar.getInstance()));
	//   24   41:invokestatic    #381 <Method Calendar Calendar.getInstance()>
	//   25   44:astore          21
		context2 = ((Context) (arraylist));
	//   26   46:aload           17
	//   27   48:astore          15
		context3 = ((Context) (bucket));
	//   28   50:aload           18
	//   29   52:astore          16
		context1 = ((Context) (obj));
	//   30   54:aload           19
	//   31   56:astore          14
		((Calendar) (obj1)).set(11, 0);
	//   32   58:aload           21
	//   33   60:bipush          11
	//   34   62:iconst_0        
	//   35   63:invokevirtual   #385 <Method void Calendar.set(int, int)>
		context2 = ((Context) (arraylist));
	//   36   66:aload           17
	//   37   68:astore          15
		context3 = ((Context) (bucket));
	//   38   70:aload           18
	//   39   72:astore          16
		context1 = ((Context) (obj));
	//   40   74:aload           19
	//   41   76:astore          14
		((Calendar) (obj1)).set(12, 0);
	//   42   78:aload           21
	//   43   80:bipush          12
	//   44   82:iconst_0        
	//   45   83:invokevirtual   #385 <Method void Calendar.set(int, int)>
		context2 = ((Context) (arraylist));
	//   46   86:aload           17
	//   47   88:astore          15
		context3 = ((Context) (bucket));
	//   48   90:aload           18
	//   49   92:astore          16
		context1 = ((Context) (obj));
	//   50   94:aload           19
	//   51   96:astore          14
		((Calendar) (obj1)).set(13, 0);
	//   52   98:aload           21
	//   53  100:bipush          13
	//   54  102:iconst_0        
	//   55  103:invokevirtual   #385 <Method void Calendar.set(int, int)>
		context2 = ((Context) (arraylist));
	//   56  106:aload           17
	//   57  108:astore          15
		context3 = ((Context) (bucket));
	//   58  110:aload           18
	//   59  112:astore          16
		context1 = ((Context) (obj));
	//   60  114:aload           19
	//   61  116:astore          14
		long l5 = ((Calendar) (obj1)).getTimeInMillis();
	//   62  118:aload           21
	//   63  120:invokevirtual   #389 <Method long Calendar.getTimeInMillis()>
	//   64  123:lstore          10
		context2 = ((Context) (arraylist));
	//   65  125:aload           17
	//   66  127:astore          15
		context3 = ((Context) (bucket));
	//   67  129:aload           18
	//   68  131:astore          16
		context1 = ((Context) (obj));
	//   69  133:aload           19
	//   70  135:astore          14
		long l6 = System.currentTimeMillis();
	//   71  137:invokestatic    #394 <Method long System.currentTimeMillis()>
	//   72  140:lstore          12
		context2 = ((Context) (arraylist));
	//   73  142:aload           17
	//   74  144:astore          15
		context3 = ((Context) (bucket));
	//   75  146:aload           18
	//   76  148:astore          16
		context1 = ((Context) (obj));
	//   77  150:aload           19
	//   78  152:astore          14
		((Calendar) (obj1)).clear();
	//   79  154:aload           21
	//   80  156:invokevirtual   #397 <Method void Calendar.clear()>
		context2 = ((Context) (arraylist));
	//   81  159:aload           17
	//   82  161:astore          15
		context3 = ((Context) (bucket));
	//   83  163:aload           18
	//   84  165:astore          16
		context1 = ((Context) (obj));
	//   85  167:aload           19
	//   86  169:astore          14
		NetworkStatsManager networkstatsmanager = (NetworkStatsManager)context.getSystemService("netstats");
	//   87  171:aload_0         
	//   88  172:ldc2            #399 <String "netstats">
	//   89  175:invokevirtual   #162 <Method Object Context.getSystemService(String)>
	//   90  178:checkcast       #401 <Class NetworkStatsManager>
	//   91  181:astore          22
		context2 = ((Context) (arraylist));
	//   92  183:aload           17
	//   93  185:astore          15
		context3 = ((Context) (bucket));
	//   94  187:aload           18
	//   95  189:astore          16
		context1 = ((Context) (obj));
	//   96  191:aload           19
	//   97  193:astore          14
		int i1 = context.getPackageManager().getApplicationInfo("com.huawei.health", 1).uid;
	//   98  195:aload_0         
	//   99  196:invokevirtual   #107 <Method PackageManager Context.getPackageManager()>
	//  100  199:ldc2            #403 <String "com.huawei.health">
	//  101  202:iconst_1        
	//  102  203:invokevirtual   #407 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//  103  206:getfield        #412 <Field int ApplicationInfo.uid>
	//  104  209:istore_1        
		context2 = ((Context) (arraylist));
	//  105  210:aload           17
	//  106  212:astore          15
		context3 = ((Context) (bucket));
	//  107  214:aload           18
	//  108  216:astore          16
		context1 = ((Context) (obj));
	//  109  218:aload           19
	//  110  220:astore          14
		context = ((Context) (networkstatsmanager.querySummary(1, ((String) (null)), l5, l6)));
	//  111  222:aload           22
	//  112  224:iconst_1        
	//  113  225:aconst_null     
	//  114  226:lload           10
	//  115  228:lload           12
	//  116  230:invokevirtual   #416 <Method NetworkStats NetworkStatsManager.querySummary(int, String, long, long)>
	//  117  233:astore_0        
		context2 = ((Context) (arraylist));
	//  118  234:aload           17
	//  119  236:astore          15
		context3 = ((Context) (bucket));
	//  120  238:aload           18
	//  121  240:astore          16
		context1 = ((Context) (obj));
	//  122  242:aload           19
	//  123  244:astore          14
		obj1 = ((Object) (new ArrayList()));
	//  124  246:new             #90  <Class ArrayList>
	//  125  249:dup             
	//  126  250:invokespecial   #91  <Method void ArrayList()>
	//  127  253:astore          21
_L2:
		context2 = ((Context) (arraylist));
	//  128  255:aload           17
	//  129  257:astore          15
		context3 = ((Context) (bucket));
	//  130  259:aload           18
	//  131  261:astore          16
		context1 = ((Context) (obj));
	//  132  263:aload           19
	//  133  265:astore          14
		if(!((NetworkStats) (context)).hasNextBucket())
			break; /* Loop/switch isn't completed */
	//  134  267:aload_0         
	//  135  268:invokevirtual   #421 <Method boolean NetworkStats.hasNextBucket()>
	//  136  271:ifeq            360
		context2 = ((Context) (arraylist));
	//  137  274:aload           17
	//  138  276:astore          15
		context3 = ((Context) (bucket));
	//  139  278:aload           18
	//  140  280:astore          16
		context1 = ((Context) (obj));
	//  141  282:aload           19
	//  142  284:astore          14
		android.app.usage.NetworkStats.Bucket bucket1 = new android.app.usage.NetworkStats.Bucket();
	//  143  286:new             #423 <Class android.app.usage.NetworkStats$Bucket>
	//  144  289:dup             
	//  145  290:invokespecial   #424 <Method void android.app.usage.NetworkStats$Bucket()>
	//  146  293:astore          23
		context2 = ((Context) (arraylist));
	//  147  295:aload           17
	//  148  297:astore          15
		context3 = ((Context) (bucket));
	//  149  299:aload           18
	//  150  301:astore          16
		context1 = ((Context) (obj));
	//  151  303:aload           19
	//  152  305:astore          14
		if(!((NetworkStats) (context)).getNextBucket(bucket1))
			continue; /* Loop/switch isn't completed */
	//  153  307:aload_0         
	//  154  308:aload           23
	//  155  310:invokevirtual   #428 <Method boolean NetworkStats.getNextBucket(android.app.usage.NetworkStats$Bucket)>
	//  156  313:ifeq            846
		context2 = ((Context) (arraylist));
	//  157  316:aload           17
	//  158  318:astore          15
		context3 = ((Context) (bucket));
	//  159  320:aload           18
	//  160  322:astore          16
		context1 = ((Context) (obj));
	//  161  324:aload           19
	//  162  326:astore          14
		if(bucket1.getUid() != i1)
			continue; /* Loop/switch isn't completed */
	//  163  328:aload           23
	//  164  330:invokevirtual   #431 <Method int android.app.usage.NetworkStats$Bucket.getUid()>
	//  165  333:iload_1         
	//  166  334:icmpne          846
		context2 = ((Context) (arraylist));
	//  167  337:aload           17
	//  168  339:astore          15
		context3 = ((Context) (bucket));
	//  169  341:aload           18
	//  170  343:astore          16
		context1 = ((Context) (obj));
	//  171  345:aload           19
	//  172  347:astore          14
		((ArrayList) (obj1)).add(((Object) (bucket1)));
	//  173  349:aload           21
	//  174  351:aload           23
	//  175  353:invokevirtual   #97  <Method boolean ArrayList.add(Object)>
	//  176  356:pop             
		if(true) goto _L2; else goto _L1
	//  177  357:goto            846
_L1:
		context2 = ((Context) (arraylist));
	//  178  360:aload           17
	//  179  362:astore          15
		context3 = ((Context) (bucket));
	//  180  364:aload           18
	//  181  366:astore          16
		context1 = ((Context) (obj));
	//  182  368:aload           19
	//  183  370:astore          14
		context = ((Context) (networkstatsmanager.querySummary(0, ((String) (null)), l5, l6)));
	//  184  372:aload           22
	//  185  374:iconst_0        
	//  186  375:aconst_null     
	//  187  376:lload           10
	//  188  378:lload           12
	//  189  380:invokevirtual   #416 <Method NetworkStats NetworkStatsManager.querySummary(int, String, long, long)>
	//  190  383:astore_0        
		context2 = context;
	//  191  384:aload_0         
	//  192  385:astore          15
		context3 = context;
	//  193  387:aload_0         
	//  194  388:astore          16
		context1 = context;
	//  195  390:aload_0         
	//  196  391:astore          14
		arraylist = new ArrayList();
	//  197  393:new             #90  <Class ArrayList>
	//  198  396:dup             
	//  199  397:invokespecial   #91  <Method void ArrayList()>
	//  200  400:astore          17
_L4:
		context2 = context;
	//  201  402:aload_0         
	//  202  403:astore          15
		context3 = context;
	//  203  405:aload_0         
	//  204  406:astore          16
		context1 = context;
	//  205  408:aload_0         
	//  206  409:astore          14
		if(!((NetworkStats) (context)).hasNextBucket())
			break; /* Loop/switch isn't completed */
	//  207  411:aload_0         
	//  208  412:invokevirtual   #421 <Method boolean NetworkStats.hasNextBucket()>
	//  209  415:ifeq            852
		context2 = context;
	//  210  418:aload_0         
	//  211  419:astore          15
		context3 = context;
	//  212  421:aload_0         
	//  213  422:astore          16
		context1 = context;
	//  214  424:aload_0         
	//  215  425:astore          14
		bucket = new android.app.usage.NetworkStats.Bucket();
	//  216  427:new             #423 <Class android.app.usage.NetworkStats$Bucket>
	//  217  430:dup             
	//  218  431:invokespecial   #424 <Method void android.app.usage.NetworkStats$Bucket()>
	//  219  434:astore          18
		context2 = context;
	//  220  436:aload_0         
	//  221  437:astore          15
		context3 = context;
	//  222  439:aload_0         
	//  223  440:astore          16
		context1 = context;
	//  224  442:aload_0         
	//  225  443:astore          14
		if(!((NetworkStats) (context)).getNextBucket(bucket))
			continue; /* Loop/switch isn't completed */
	//  226  445:aload_0         
	//  227  446:aload           18
	//  228  448:invokevirtual   #428 <Method boolean NetworkStats.getNextBucket(android.app.usage.NetworkStats$Bucket)>
	//  229  451:ifeq            849
		context2 = context;
	//  230  454:aload_0         
	//  231  455:astore          15
		context3 = context;
	//  232  457:aload_0         
	//  233  458:astore          16
		context1 = context;
	//  234  460:aload_0         
	//  235  461:astore          14
		if(bucket.getUid() != i1)
			continue; /* Loop/switch isn't completed */
	//  236  463:aload           18
	//  237  465:invokevirtual   #431 <Method int android.app.usage.NetworkStats$Bucket.getUid()>
	//  238  468:iload_1         
	//  239  469:icmpne          849
		context2 = context;
	//  240  472:aload_0         
	//  241  473:astore          15
		context3 = context;
	//  242  475:aload_0         
	//  243  476:astore          16
		context1 = context;
	//  244  478:aload_0         
	//  245  479:astore          14
		arraylist.add(((Object) (bucket)));
	//  246  481:aload           17
	//  247  483:aload           18
	//  248  485:invokevirtual   #97  <Method boolean ArrayList.add(Object)>
	//  249  488:pop             
		if(true) goto _L4; else goto _L3
	//  250  489:goto            849
_L5:
		context2 = context;
	//  251  492:aload_0         
	//  252  493:astore          15
		context3 = context;
	//  253  495:aload_0         
	//  254  496:astore          16
		context1 = context;
	//  255  498:aload_0         
	//  256  499:astore          14
		if(i1 >= ((ArrayList) (obj1)).size())
			break MISSING_BLOCK_LABEL_857;
	//  257  501:iload_1         
	//  258  502:aload           21
	//  259  504:invokevirtual   #432 <Method int ArrayList.size()>
	//  260  507:icmpge          857
		context2 = context;
	//  261  510:aload_0         
	//  262  511:astore          15
		context3 = context;
	//  263  513:aload_0         
	//  264  514:astore          16
		context1 = context;
	//  265  516:aload_0         
	//  266  517:astore          14
		l1 += ((android.app.usage.NetworkStats.Bucket)((ArrayList) (obj1)).get(i1)).getRxBytes();
	//  267  519:lload_2         
	//  268  520:aload           21
	//  269  522:iload_1         
	//  270  523:invokevirtual   #436 <Method Object ArrayList.get(int)>
	//  271  526:checkcast       #423 <Class android.app.usage.NetworkStats$Bucket>
	//  272  529:invokevirtual   #439 <Method long android.app.usage.NetworkStats$Bucket.getRxBytes()>
	//  273  532:ladd            
	//  274  533:lstore_2        
		context2 = context;
	//  275  534:aload_0         
	//  276  535:astore          15
		context3 = context;
	//  277  537:aload_0         
	//  278  538:astore          16
		context1 = context;
	//  279  540:aload_0         
	//  280  541:astore          14
		l2 += ((android.app.usage.NetworkStats.Bucket)((ArrayList) (obj1)).get(i1)).getTxBytes();
	//  281  543:lload           4
	//  282  545:aload           21
	//  283  547:iload_1         
	//  284  548:invokevirtual   #436 <Method Object ArrayList.get(int)>
	//  285  551:checkcast       #423 <Class android.app.usage.NetworkStats$Bucket>
	//  286  554:invokevirtual   #442 <Method long android.app.usage.NetworkStats$Bucket.getTxBytes()>
	//  287  557:ladd            
	//  288  558:lstore          4
		i1++;
	//  289  560:iload_1         
	//  290  561:iconst_1        
	//  291  562:iadd            
	//  292  563:istore_1        
		  goto _L5
	//* 293  564:goto            492
_L6:
		context2 = context;
	//  294  567:aload_0         
	//  295  568:astore          15
		context3 = context;
	//  296  570:aload_0         
	//  297  571:astore          16
		context1 = context;
	//  298  573:aload_0         
	//  299  574:astore          14
		if(i1 >= arraylist.size())
			break MISSING_BLOCK_LABEL_644;
	//  300  576:iload_1         
	//  301  577:aload           17
	//  302  579:invokevirtual   #432 <Method int ArrayList.size()>
	//  303  582:icmpge          644
		context2 = context;
	//  304  585:aload_0         
	//  305  586:astore          15
		context3 = context;
	//  306  588:aload_0         
	//  307  589:astore          16
		context1 = context;
	//  308  591:aload_0         
	//  309  592:astore          14
		l3 += ((android.app.usage.NetworkStats.Bucket)arraylist.get(i1)).getRxBytes();
	//  310  594:lload           6
	//  311  596:aload           17
	//  312  598:iload_1         
	//  313  599:invokevirtual   #436 <Method Object ArrayList.get(int)>
	//  314  602:checkcast       #423 <Class android.app.usage.NetworkStats$Bucket>
	//  315  605:invokevirtual   #439 <Method long android.app.usage.NetworkStats$Bucket.getRxBytes()>
	//  316  608:ladd            
	//  317  609:lstore          6
		context2 = context;
	//  318  611:aload_0         
	//  319  612:astore          15
		context3 = context;
	//  320  614:aload_0         
	//  321  615:astore          16
		context1 = context;
	//  322  617:aload_0         
	//  323  618:astore          14
		l4 += ((android.app.usage.NetworkStats.Bucket)arraylist.get(i1)).getTxBytes();
	//  324  620:lload           8
	//  325  622:aload           17
	//  326  624:iload_1         
	//  327  625:invokevirtual   #436 <Method Object ArrayList.get(int)>
	//  328  628:checkcast       #423 <Class android.app.usage.NetworkStats$Bucket>
	//  329  631:invokevirtual   #442 <Method long android.app.usage.NetworkStats$Bucket.getTxBytes()>
	//  330  634:ladd            
	//  331  635:lstore          8
		i1++;
	//  332  637:iload_1         
	//  333  638:iconst_1        
	//  334  639:iadd            
	//  335  640:istore_1        
		  goto _L6
	//* 336  641:goto            567
		context2 = context;
	//  337  644:aload_0         
	//  338  645:astore          15
		context3 = context;
	//  339  647:aload_0         
	//  340  648:astore          16
		context1 = context;
	//  341  650:aload_0         
	//  342  651:astore          14
		hashmap.put("wifi_rx", ((Object) (Double.valueOf((double)l1 / 1048576D))));
	//  343  653:aload           20
	//  344  655:ldc2            #444 <String "wifi_rx">
	//  345  658:lload_2         
	//  346  659:l2d             
	//  347  660:ldc2w           #445 <Double 1048576D>
	//  348  663:ddiv            
	//  349  664:invokestatic    #451 <Method Double Double.valueOf(double)>
	//  350  667:invokevirtual   #455 <Method Object HashMap.put(Object, Object)>
	//  351  670:pop             
		context2 = context;
	//  352  671:aload_0         
	//  353  672:astore          15
		context3 = context;
	//  354  674:aload_0         
	//  355  675:astore          16
		context1 = context;
	//  356  677:aload_0         
	//  357  678:astore          14
		hashmap.put("wifi_tx", ((Object) (Double.valueOf((double)l2 / 1048576D))));
	//  358  680:aload           20
	//  359  682:ldc2            #457 <String "wifi_tx">
	//  360  685:lload           4
	//  361  687:l2d             
	//  362  688:ldc2w           #445 <Double 1048576D>
	//  363  691:ddiv            
	//  364  692:invokestatic    #451 <Method Double Double.valueOf(double)>
	//  365  695:invokevirtual   #455 <Method Object HashMap.put(Object, Object)>
	//  366  698:pop             
		context2 = context;
	//  367  699:aload_0         
	//  368  700:astore          15
		context3 = context;
	//  369  702:aload_0         
	//  370  703:astore          16
		context1 = context;
	//  371  705:aload_0         
	//  372  706:astore          14
		hashmap.put("mobile_rx", ((Object) (Double.valueOf((double)l3 / 1048576D))));
	//  373  708:aload           20
	//  374  710:ldc2            #459 <String "mobile_rx">
	//  375  713:lload           6
	//  376  715:l2d             
	//  377  716:ldc2w           #445 <Double 1048576D>
	//  378  719:ddiv            
	//  379  720:invokestatic    #451 <Method Double Double.valueOf(double)>
	//  380  723:invokevirtual   #455 <Method Object HashMap.put(Object, Object)>
	//  381  726:pop             
		context2 = context;
	//  382  727:aload_0         
	//  383  728:astore          15
		context3 = context;
	//  384  730:aload_0         
	//  385  731:astore          16
		context1 = context;
	//  386  733:aload_0         
	//  387  734:astore          14
		hashmap.put("mobile_tx", ((Object) (Double.valueOf((double)l4 / 1048576D))));
	//  388  736:aload           20
	//  389  738:ldc2            #461 <String "mobile_tx">
	//  390  741:lload           8
	//  391  743:l2d             
	//  392  744:ldc2w           #445 <Double 1048576D>
	//  393  747:ddiv            
	//  394  748:invokestatic    #451 <Method Double Double.valueOf(double)>
	//  395  751:invokevirtual   #455 <Method Object HashMap.put(Object, Object)>
	//  396  754:pop             
		if(context != null)
	//* 397  755:aload_0         
	//* 398  756:ifnull          843
		{
			((NetworkStats) (context)).close();
	//  399  759:aload_0         
	//  400  760:invokevirtual   #464 <Method void NetworkStats.close()>
			return hashmap;
	//  401  763:aload           20
	//  402  765:areturn         
		}
		break MISSING_BLOCK_LABEL_843;
		context;
	//  403  766:astore_0        
		context1 = context2;
	//  404  767:aload           15
	//  405  769:astore          14
		dho.f("CommonUtil", new Object[] {
			""
		});
	//  406  771:ldc1            #68  <String "CommonUtil">
	//  407  773:iconst_1        
	//  408  774:anewarray       Object[]
	//  409  777:dup             
	//  410  778:iconst_0        
	//  411  779:ldc1            #217 <String "">
	//  412  781:aastore         
	//  413  782:invokestatic    #79  <Method void dho.f(String, Object[])>
		if(context2 != null)
	//* 414  785:aload           15
	//* 415  787:ifnull          843
		{
			((NetworkStats) (context2)).close();
	//  416  790:aload           15
	//  417  792:invokevirtual   #464 <Method void NetworkStats.close()>
			return hashmap;
	//  418  795:aload           20
	//  419  797:areturn         
		}
		break MISSING_BLOCK_LABEL_843;
		context;
	//  420  798:astore_0        
		context1 = context3;
	//  421  799:aload           16
	//  422  801:astore          14
		dho.f("CommonUtil", new Object[] {
			""
		});
	//  423  803:ldc1            #68  <String "CommonUtil">
	//  424  805:iconst_1        
	//  425  806:anewarray       Object[]
	//  426  809:dup             
	//  427  810:iconst_0        
	//  428  811:ldc1            #217 <String "">
	//  429  813:aastore         
	//  430  814:invokestatic    #79  <Method void dho.f(String, Object[])>
		if(context3 != null)
	//* 431  817:aload           16
	//* 432  819:ifnull          843
		{
			((NetworkStats) (context3)).close();
	//  433  822:aload           16
	//  434  824:invokevirtual   #464 <Method void NetworkStats.close()>
			return hashmap;
	//  435  827:aload           20
	//  436  829:areturn         
		}
		break MISSING_BLOCK_LABEL_843;
		context;
	//  437  830:astore_0        
		if(context1 != null)
	//* 438  831:aload           14
	//* 439  833:ifnull          841
			((NetworkStats) (context1)).close();
	//  440  836:aload           14
	//  441  838:invokevirtual   #464 <Method void NetworkStats.close()>
		throw context;
	//  442  841:aload_0         
	//  443  842:athrow          
		return hashmap;
	//  444  843:aload           20
	//  445  845:areturn         
	//* 446  846:goto            255
	//* 447  849:goto            402
_L3:
		i1 = 0;
	//  448  852:iconst_0        
	//  449  853:istore_1        
		  goto _L5
	//* 450  854:goto            492
		i1 = 0;
	//  451  857:iconst_0        
	//  452  858:istore_1        
		  goto _L6
	//* 453  859:goto            567
	}

	private static Object a(String s1, String s2, Class aclass[], Object aobj[])
	{
		dho.b("CommonUtil", new Object[] {
			"Enter staticFun with string"
		});
	//    0    0:ldc1            #68  <String "CommonUtil">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc2            #474 <String "Enter staticFun with string">
	//    6   11:aastore         
	//    7   12:invokestatic    #133 <Method void dho.b(String, Object[])>
		s1 = ((String) (d(Class.forName(s1), s2, aclass, aobj)));
	//    8   15:aload_0         
	//    9   16:invokestatic    #480 <Method Class Class.forName(String)>
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:aload_3         
	//   13   22:invokestatic    #483 <Method Object d(Class, String, Class[], Object[])>
	//   14   25:astore_0        
		return ((Object) (s1));
	//   15   26:aload_0         
	//   16   27:areturn         
		s1;
	//   17   28:astore_0        
		dho.c("CommonUtil", new Object[] {
			((ClassNotFoundException) (s1)).getMessage()
		});
	//   18   29:ldc1            #68  <String "CommonUtil">
	//   19   31:iconst_1        
	//   20   32:anewarray       Object[]
	//   21   35:dup             
	//   22   36:iconst_0        
	//   23   37:aload_0         
	//   24   38:invokevirtual   #484 <Method String ClassNotFoundException.getMessage()>
	//   25   41:aastore         
	//   26   42:invokestatic    #486 <Method void dho.c(String, Object[])>
		break MISSING_BLOCK_LABEL_85;
	//   27   45:goto            85
		s1;
	//   28   48:astore_0        
		dho.c("CommonUtil", new Object[] {
			((Exception) (s1)).getMessage()
		});
	//   29   49:ldc1            #68  <String "CommonUtil">
	//   30   51:iconst_1        
	//   31   52:anewarray       Object[]
	//   32   55:dup             
	//   33   56:iconst_0        
	//   34   57:aload_0         
	//   35   58:invokevirtual   #73  <Method String Exception.getMessage()>
	//   36   61:aastore         
	//   37   62:invokestatic    #486 <Method void dho.c(String, Object[])>
		break MISSING_BLOCK_LABEL_85;
	//   38   65:goto            85
		s1;
	//   39   68:astore_0        
		dho.c("CommonUtil", new Object[] {
			((Throwable) (s1)).getMessage()
		});
	//   40   69:ldc1            #68  <String "CommonUtil">
	//   41   71:iconst_1        
	//   42   72:anewarray       Object[]
	//   43   75:dup             
	//   44   76:iconst_0        
	//   45   77:aload_0         
	//   46   78:invokevirtual   #487 <Method String Throwable.getMessage()>
	//   47   81:aastore         
	//   48   82:invokestatic    #486 <Method void dho.c(String, Object[])>
		return ((Object) (null));
	//   49   85:aconst_null     
	//   50   86:areturn         
	}

	public static String a()
	{
		String s2 = "";
	//    0    0:ldc1            #217 <String "">
	//    1    2:astore_1        
		String s1;
		Object obj;
		try
		{
			Class class1 = Class.forName("android.os.SystemProperties");
	//    2    3:ldc2            #495 <String "android.os.SystemProperties">
	//    3    6:invokestatic    #480 <Method Class Class.forName(String)>
	//    4    9:astore_0        
			obj = ((Object) ((String)class1.getDeclaredMethod("get", new Class[] {
				java/lang/String
			}).invoke(((Object) (class1)), new Object[] {
				"ro.build.version.emui"
			})));
	//    5   10:aload_0         
	//    6   11:ldc2            #496 <String "get">
	//    7   14:iconst_1        
	//    8   15:anewarray       Class[]
	//    9   18:dup             
	//   10   19:iconst_0        
	//   11   20:ldc1            #46  <Class String>
	//   12   22:aastore         
	//   13   23:invokevirtual   #500 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   14   26:aload_0         
	//   15   27:iconst_1        
	//   16   28:anewarray       Object[]
	//   17   31:dup             
	//   18   32:iconst_0        
	//   19   33:ldc2            #502 <String "ro.build.version.emui">
	//   20   36:aastore         
	//   21   37:invokevirtual   #508 <Method Object Method.invoke(Object, Object[])>
	//   22   40:checkcast       #46  <Class String>
	//   23   43:astore_2        
			dho.d("CommonUtil", new Object[] {
				(new StringBuilder()).append("emui:").append(((String) (obj))).toString()
			});
	//   24   44:ldc1            #68  <String "CommonUtil">
	//   25   46:iconst_1        
	//   26   47:anewarray       Object[]
	//   27   50:dup             
	//   28   51:iconst_0        
	//   29   52:new             #120 <Class StringBuilder>
	//   30   55:dup             
	//   31   56:invokespecial   #121 <Method void StringBuilder()>
	//   32   59:ldc2            #510 <String "emui:">
	//   33   62:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   34   65:aload_2         
	//   35   66:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   36   69:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   37   72:aastore         
	//   38   73:invokestatic    #325 <Method void dho.d(String, Object[])>
		}
	//*  39   76:aload_1         
	//*  40   77:astore_0        
	//*  41   78:aload_2         
	//*  42   79:ifnull          108
	//*  43   82:ldc2            #512 <String "EmotionUI[ _]([0-9][0-9.]*)">
	//*  44   85:invokestatic    #518 <Method Pattern Pattern.compile(String)>
	//*  45   88:aload_2         
	//*  46   89:invokevirtual   #522 <Method Matcher Pattern.matcher(CharSequence)>
	//*  47   92:astore_2        
	//*  48   93:aload_1         
	//*  49   94:astore_0        
	//*  50   95:aload_2         
	//*  51   96:invokevirtual   #527 <Method boolean Matcher.find()>
	//*  52   99:ifeq            108
	//*  53  102:aload_2         
	//*  54  103:iconst_1        
	//*  55  104:invokevirtual   #531 <Method String Matcher.group(int)>
	//*  56  107:astore_0        
	//*  57  108:aload_0         
	//*  58  109:areturn         
		catch(ClassNotFoundException classnotfoundexception)
	//*  59  110:astore_0        
		{
			dho.d("CommonUtil", new Object[] {
				classnotfoundexception.getMessage()
			});
	//   60  111:ldc1            #68  <String "CommonUtil">
	//   61  113:iconst_1        
	//   62  114:anewarray       Object[]
	//   63  117:dup             
	//   64  118:iconst_0        
	//   65  119:aload_0         
	//   66  120:invokevirtual   #484 <Method String ClassNotFoundException.getMessage()>
	//   67  123:aastore         
	//   68  124:invokestatic    #325 <Method void dho.d(String, Object[])>
			return "";
	//   69  127:ldc1            #217 <String "">
	//   70  129:areturn         
		}
		catch(NoSuchMethodException nosuchmethodexception)
	//*  71  130:astore_0        
		{
			dho.d("CommonUtil", new Object[] {
				nosuchmethodexception.getMessage()
			});
	//   72  131:ldc1            #68  <String "CommonUtil">
	//   73  133:iconst_1        
	//   74  134:anewarray       Object[]
	//   75  137:dup             
	//   76  138:iconst_0        
	//   77  139:aload_0         
	//   78  140:invokevirtual   #532 <Method String NoSuchMethodException.getMessage()>
	//   79  143:aastore         
	//   80  144:invokestatic    #325 <Method void dho.d(String, Object[])>
			return "";
	//   81  147:ldc1            #217 <String "">
	//   82  149:areturn         
		}
		catch(InvocationTargetException invocationtargetexception)
	//*  83  150:astore_0        
		{
			dho.d("CommonUtil", new Object[] {
				invocationtargetexception.getMessage()
			});
	//   84  151:ldc1            #68  <String "CommonUtil">
	//   85  153:iconst_1        
	//   86  154:anewarray       Object[]
	//   87  157:dup             
	//   88  158:iconst_0        
	//   89  159:aload_0         
	//   90  160:invokevirtual   #533 <Method String InvocationTargetException.getMessage()>
	//   91  163:aastore         
	//   92  164:invokestatic    #325 <Method void dho.d(String, Object[])>
			return "";
	//   93  167:ldc1            #217 <String "">
	//   94  169:areturn         
		}
		catch(IllegalAccessException illegalaccessexception)
	//*  95  170:astore_0        
		{
			dho.d("CommonUtil", new Object[] {
				illegalaccessexception.getMessage()
			});
	//   96  171:ldc1            #68  <String "CommonUtil">
	//   97  173:iconst_1        
	//   98  174:anewarray       Object[]
	//   99  177:dup             
	//  100  178:iconst_0        
	//  101  179:aload_0         
	//  102  180:invokevirtual   #534 <Method String IllegalAccessException.getMessage()>
	//  103  183:aastore         
	//  104  184:invokestatic    #325 <Method void dho.d(String, Object[])>
			return "";
	//  105  187:ldc1            #217 <String "">
	//  106  189:areturn         
		}
		catch(Exception exception)
	//* 107  190:astore_0        
		{
			dho.d("CommonUtil", new Object[] {
				exception.getMessage()
			});
	//  108  191:ldc1            #68  <String "CommonUtil">
	//  109  193:iconst_1        
	//  110  194:anewarray       Object[]
	//  111  197:dup             
	//  112  198:iconst_0        
	//  113  199:aload_0         
	//  114  200:invokevirtual   #73  <Method String Exception.getMessage()>
	//  115  203:aastore         
	//  116  204:invokestatic    #325 <Method void dho.d(String, Object[])>
			return "";
	//  117  207:ldc1            #217 <String "">
	//  118  209:areturn         
		}
		s1 = s2;
		if(obj == null)
			break MISSING_BLOCK_LABEL_108;
		obj = ((Object) (Pattern.compile("EmotionUI[ _]([0-9][0-9.]*)").matcher(((CharSequence) (obj)))));
		s1 = s2;
		if(((Matcher) (obj)).find())
			s1 = ((Matcher) (obj)).group(1);
		return s1;
	}

	public static void a(Context context, String s1)
	{
		dho.b("CommonUtil", new Object[] {
			"sendUpdateAreaBroadcast"
		});
	//    0    0:ldc1            #68  <String "CommonUtil">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc2            #537 <String "sendUpdateAreaBroadcast">
	//    6   11:aastore         
	//    7   12:invokestatic    #133 <Method void dho.b(String, Object[])>
		c(context, "com.huawei.health.update_commonutils_area", s1);
	//    8   15:aload_0         
	//    9   16:ldc2            #338 <String "com.huawei.health.update_commonutils_area">
	//   10   19:aload_1         
	//   11   20:invokestatic    #540 <Method void c(Context, String, String)>
	//   12   23:return          
	}

	public static void a(String s1, String s2)
	{
		o/dbf;
	//    0    0:ldc1            #2   <Class dbf>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		long l1 = System.currentTimeMillis();
	//    2    3:invokestatic    #394 <Method long System.currentTimeMillis()>
	//    3    6:lstore_2        
		dho.b(s1, new Object[] {
			s2, " cost(ms): ", Long.valueOf(l1 - a)
		});
	//    4    7:aload_0         
	//    5    8:iconst_3        
	//    6    9:anewarray       Object[]
	//    7   12:dup             
	//    8   13:iconst_0        
	//    9   14:aload_1         
	//   10   15:aastore         
	//   11   16:dup             
	//   12   17:iconst_1        
	//   13   18:ldc2            #543 <String " cost(ms): ">
	//   14   21:aastore         
	//   15   22:dup             
	//   16   23:iconst_2        
	//   17   24:lload_2         
	//   18   25:getstatic       #31  <Field long a>
	//   19   28:lsub            
	//   20   29:invokestatic    #548 <Method Long Long.valueOf(long)>
	//   21   32:aastore         
	//   22   33:invokestatic    #133 <Method void dho.b(String, Object[])>
		a = l1;
	//   23   36:lload_2         
	//   24   37:putstatic       #31  <Field long a>
		o/dbf;
	//   25   40:ldc1            #2   <Class dbf>
		JVM INSTR monitorexit ;
	//   26   42:monitorexit     
		return;
	//   27   43:return          
		s1;
	//   28   44:astore_0        
	//*  29   45:ldc1            #2   <Class dbf>
		throw s1;
	//   30   47:monitorexit     
	//   31   48:aload_0         
	//   32   49:athrow          
	}

	public static boolean a(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		Object obj = ((Object) (context.getResources().getConfiguration()));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #279 <Method Resources Context.getResources()>
	//    6   10:invokevirtual   #552 <Method Configuration Resources.getConfiguration()>
	//    7   13:astore_2        
		context = ((Context) (((Configuration) (obj)).locale.getCountry()));
	//    8   14:aload_2         
	//    9   15:getfield        #558 <Field Locale Configuration.locale>
	//   10   18:invokevirtual   #563 <Method String Locale.getCountry()>
	//   11   21:astore_0        
		obj = ((Object) (((Configuration) (obj)).locale.getLanguage()));
	//   12   22:aload_2         
	//   13   23:getfield        #558 <Field Locale Configuration.locale>
	//   14   26:invokevirtual   #566 <Method String Locale.getLanguage()>
	//   15   29:astore_2        
		dho.d("CommonUtil", new Object[] {
			(new StringBuilder()).append("isChineseSimplified(): country = ").append(((String) (context))).append(", language = ").append(((String) (obj))).toString()
		});
	//   16   30:ldc1            #68  <String "CommonUtil">
	//   17   32:iconst_1        
	//   18   33:anewarray       Object[]
	//   19   36:dup             
	//   20   37:iconst_0        
	//   21   38:new             #120 <Class StringBuilder>
	//   22   41:dup             
	//   23   42:invokespecial   #121 <Method void StringBuilder()>
	//   24   45:ldc2            #568 <String "isChineseSimplified(): country = ">
	//   25   48:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   26   51:aload_0         
	//   27   52:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   28   55:ldc2            #570 <String ", language = ">
	//   29   58:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   30   61:aload_2         
	//   31   62:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   32   65:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   33   68:aastore         
	//   34   69:invokestatic    #325 <Method void dho.d(String, Object[])>
		boolean flag;
		if("zh".equalsIgnoreCase(((String) (obj))) && "cn".equalsIgnoreCase(((String) (context))))
	//*  35   72:ldc2            #572 <String "zh">
	//*  36   75:aload_2         
	//*  37   76:invokevirtual   #56  <Method boolean String.equalsIgnoreCase(String)>
	//*  38   79:ifeq            97
	//*  39   82:ldc2            #574 <String "cn">
	//*  40   85:aload_0         
	//*  41   86:invokevirtual   #56  <Method boolean String.equalsIgnoreCase(String)>
	//*  42   89:ifeq            97
			flag = true;
	//   43   92:iconst_1        
	//   44   93:istore_1        
		else
	//*  45   94:goto            99
			flag = false;
	//   46   97:iconst_0        
	//   47   98:istore_1        
		dho.d("CommonUtil", new Object[] {
			(new StringBuilder()).append("isChineseSimplified(): result = ").append(flag).toString()
		});
	//   48   99:ldc1            #68  <String "CommonUtil">
	//   49  101:iconst_1        
	//   50  102:anewarray       Object[]
	//   51  105:dup             
	//   52  106:iconst_0        
	//   53  107:new             #120 <Class StringBuilder>
	//   54  110:dup             
	//   55  111:invokespecial   #121 <Method void StringBuilder()>
	//   56  114:ldc2            #576 <String "isChineseSimplified(): result = ">
	//   57  117:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   58  120:iload_1         
	//   59  121:invokevirtual   #247 <Method StringBuilder StringBuilder.append(boolean)>
	//   60  124:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   61  127:aastore         
	//   62  128:invokestatic    #325 <Method void dho.d(String, Object[])>
		return flag;
	//   63  131:iload_1         
	//   64  132:ireturn         
	}

	public static boolean a(PackageInfo packageinfo)
	{
		return !d(packageinfo) && !b(packageinfo);
	//    0    0:aload_0         
	//    1    1:invokestatic    #578 <Method boolean d(PackageInfo)>
	//    2    4:ifne            16
	//    3    7:aload_0         
	//    4    8:invokestatic    #116 <Method boolean b(PackageInfo)>
	//    5   11:ifne            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public static boolean a(String s1, String s2, boolean flag)
	{
		String s3;
		String s4;
		String s5;
		String s6;
		String s7;
		String s8;
		byte abyte0[];
		Object obj;
		File file;
		File file1;
label0:
		{
			file = new File(s1);
	//    0    0:new             #585 <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #587 <Method void File(String)>
	//    4    8:astore          12
			if(!file.exists())
	//*   5   10:aload           12
	//*   6   12:invokevirtual   #590 <Method boolean File.exists()>
	//*   7   15:ifne            39
			{
				dho.b("CommonUtil", new Object[] {
					"source file is not exit, fileName : ", s1
				});
	//    8   18:ldc1            #68  <String "CommonUtil">
	//    9   20:iconst_2        
	//   10   21:anewarray       Object[]
	//   11   24:dup             
	//   12   25:iconst_0        
	//   13   26:ldc2            #592 <String "source file is not exit, fileName : ">
	//   14   29:aastore         
	//   15   30:dup             
	//   16   31:iconst_1        
	//   17   32:aload_0         
	//   18   33:aastore         
	//   19   34:invokestatic    #133 <Method void dho.b(String, Object[])>
				return false;
	//   20   37:iconst_0        
	//   21   38:ireturn         
			}
			if(!file.isFile())
	//*  22   39:aload           12
	//*  23   41:invokevirtual   #595 <Method boolean File.isFile()>
	//*  24   44:ifne            68
			{
				dho.b("CommonUtil", new Object[] {
					"srcFile is not a file, fileName : ", s1
				});
	//   25   47:ldc1            #68  <String "CommonUtil">
	//   26   49:iconst_2        
	//   27   50:anewarray       Object[]
	//   28   53:dup             
	//   29   54:iconst_0        
	//   30   55:ldc2            #597 <String "srcFile is not a file, fileName : ">
	//   31   58:aastore         
	//   32   59:dup             
	//   33   60:iconst_1        
	//   34   61:aload_0         
	//   35   62:aastore         
	//   36   63:invokestatic    #133 <Method void dho.b(String, Object[])>
				return false;
	//   37   66:iconst_0        
	//   38   67:ireturn         
			}
			file1 = new File(s2);
	//   39   68:new             #585 <Class File>
	//   40   71:dup             
	//   41   72:aload_1         
	//   42   73:invokespecial   #587 <Method void File(String)>
	//   43   76:astore          13
			if(file1.exists())
	//*  44   78:aload           13
	//*  45   80:invokevirtual   #590 <Method boolean File.exists()>
	//*  46   83:ifeq            130
			{
				if(!flag)
					break label0;
	//   47   86:iload_2         
	//   48   87:ifeq            154
				try
				{
					flag = (new File(s2)).delete();
	//   49   90:new             #585 <Class File>
	//   50   93:dup             
	//   51   94:aload_1         
	//   52   95:invokespecial   #587 <Method void File(String)>
	//   53   98:invokevirtual   #600 <Method boolean File.delete()>
	//   54  101:istore_2        
				}
	//*  55  102:iload_2         
	//*  56  103:ifne            108
	//*  57  106:iconst_0        
	//*  58  107:ireturn         
	//*  59  108:goto            154
				// Misplaced declaration of an exception variable
				catch(String s1)
	//*  60  111:astore_0        
				{
					dho.b("CommonUtil", new Object[] {
						"delete exception"
					});
	//   61  112:ldc1            #68  <String "CommonUtil">
	//   62  114:iconst_1        
	//   63  115:anewarray       Object[]
	//   64  118:dup             
	//   65  119:iconst_0        
	//   66  120:ldc2            #602 <String "delete exception">
	//   67  123:aastore         
	//   68  124:invokestatic    #133 <Method void dho.b(String, Object[])>
					break label0;
	//   69  127:goto            154
				}
				if(!flag)
					return false;
				break label0;
			}
			if(!file1.getParentFile().exists() && !file1.getParentFile().mkdirs())
	//*  70  130:aload           13
	//*  71  132:invokevirtual   #606 <Method File File.getParentFile()>
	//*  72  135:invokevirtual   #590 <Method boolean File.exists()>
	//*  73  138:ifne            154
	//*  74  141:aload           13
	//*  75  143:invokevirtual   #606 <Method File File.getParentFile()>
	//*  76  146:invokevirtual   #609 <Method boolean File.mkdirs()>
	//*  77  149:ifne            154
				return false;
	//   78  152:iconst_0        
	//   79  153:ireturn         
		}
		s4 = null;
	//   80  154:aconst_null     
	//   81  155:astore          5
		s6 = null;
	//   82  157:aconst_null     
	//   83  158:astore          7
		s3 = null;
	//   84  160:aconst_null     
	//   85  161:astore          4
		abyte0 = null;
	//   86  163:aconst_null     
	//   87  164:astore          10
		obj = null;
	//   88  166:aconst_null     
	//   89  167:astore          11
		s2 = null;
	//   90  169:aconst_null     
	//   91  170:astore_1        
		s5 = s2;
	//   92  171:aload_1         
	//   93  172:astore          6
		s7 = ((String) (abyte0));
	//   94  174:aload           10
	//   95  176:astore          8
		s8 = ((String) (obj));
	//   96  178:aload           11
	//   97  180:astore          9
		s1 = ((String) (new FileInputStream(file)));
	//   98  182:new             #611 <Class FileInputStream>
	//   99  185:dup             
	//  100  186:aload           12
	//  101  188:invokespecial   #614 <Method void FileInputStream(File)>
	//  102  191:astore_0        
		s3 = s1;
	//  103  192:aload_0         
	//  104  193:astore          4
		s5 = s2;
	//  105  195:aload_1         
	//  106  196:astore          6
		s4 = s1;
	//  107  198:aload_0         
	//  108  199:astore          5
		s7 = ((String) (abyte0));
	//  109  201:aload           10
	//  110  203:astore          8
		s6 = s1;
	//  111  205:aload_0         
	//  112  206:astore          7
		s8 = ((String) (obj));
	//  113  208:aload           11
	//  114  210:astore          9
		s2 = ((String) (new FileOutputStream(file1)));
	//  115  212:new             #616 <Class FileOutputStream>
	//  116  215:dup             
	//  117  216:aload           13
	//  118  218:invokespecial   #617 <Method void FileOutputStream(File)>
	//  119  221:astore_1        
		s3 = s1;
	//  120  222:aload_0         
	//  121  223:astore          4
		s5 = s2;
	//  122  225:aload_1         
	//  123  226:astore          6
		s4 = s1;
	//  124  228:aload_0         
	//  125  229:astore          5
		s7 = s2;
	//  126  231:aload_1         
	//  127  232:astore          8
		s6 = s1;
	//  128  234:aload_0         
	//  129  235:astore          7
		s8 = s2;
	//  130  237:aload_1         
	//  131  238:astore          9
		abyte0 = new byte[1024];
	//  132  240:sipush          1024
	//  133  243:newarray        byte[]
	//  134  245:astore          10
_L2:
		s3 = s1;
	//  135  247:aload_0         
	//  136  248:astore          4
		s5 = s2;
	//  137  250:aload_1         
	//  138  251:astore          6
		s4 = s1;
	//  139  253:aload_0         
	//  140  254:astore          5
		s7 = s2;
	//  141  256:aload_1         
	//  142  257:astore          8
		s6 = s1;
	//  143  259:aload_0         
	//  144  260:astore          7
		s8 = s2;
	//  145  262:aload_1         
	//  146  263:astore          9
		int i1 = ((InputStream) (s1)).read(abyte0);
	//  147  265:aload_0         
	//  148  266:aload           10
	//  149  268:invokevirtual   #623 <Method int InputStream.read(byte[])>
	//  150  271:istore_3        
		if(i1 == -1)
			break; /* Loop/switch isn't completed */
	//  151  272:iload_3         
	//  152  273:iconst_m1       
	//  153  274:icmpeq          306
		s3 = s1;
	//  154  277:aload_0         
	//  155  278:astore          4
		s5 = s2;
	//  156  280:aload_1         
	//  157  281:astore          6
		s4 = s1;
	//  158  283:aload_0         
	//  159  284:astore          5
		s7 = s2;
	//  160  286:aload_1         
	//  161  287:astore          8
		s6 = s1;
	//  162  289:aload_0         
	//  163  290:astore          7
		s8 = s2;
	//  164  292:aload_1         
	//  165  293:astore          9
		((OutputStream) (s2)).write(abyte0, 0, i1);
	//  166  295:aload_1         
	//  167  296:aload           10
	//  168  298:iconst_0        
	//  169  299:iload_3         
	//  170  300:invokevirtual   #629 <Method void OutputStream.write(byte[], int, int)>
		if(true) goto _L2; else goto _L1
	//  171  303:goto            247
_L1:
		if(s2 == null)
			break MISSING_BLOCK_LABEL_314;
	//  172  306:aload_1         
	//  173  307:ifnull          314
		((OutputStream) (s2)).close();
	//  174  310:aload_1         
	//  175  311:invokevirtual   #630 <Method void OutputStream.close()>
		if(s1 != null)
	//* 176  314:aload_0         
	//* 177  315:ifnull          322
			try
			{
				((InputStream) (s1)).close();
	//  178  318:aload_0         
	//  179  319:invokevirtual   #631 <Method void InputStream.close()>
			}
	//* 180  322:iconst_1        
	//* 181  323:ireturn         
			// Misplaced declaration of an exception variable
			catch(String s1)
	//* 182  324:astore_0        
			{
				dho.b("CommonUtil", new Object[] {
					"copyFile IOException"
				});
	//  183  325:ldc1            #68  <String "CommonUtil">
	//  184  327:iconst_1        
	//  185  328:anewarray       Object[]
	//  186  331:dup             
	//  187  332:iconst_0        
	//  188  333:ldc2            #633 <String "copyFile IOException">
	//  189  336:aastore         
	//  190  337:invokestatic    #133 <Method void dho.b(String, Object[])>
				return true;
	//  191  340:iconst_1        
	//  192  341:ireturn         
			}
		return true;
		s2;
	//  193  342:astore_1        
		dho.b("CommonUtil", new Object[] {
			"copyFile IOException"
		});
	//  194  343:ldc1            #68  <String "CommonUtil">
	//  195  345:iconst_1        
	//  196  346:anewarray       Object[]
	//  197  349:dup             
	//  198  350:iconst_0        
	//  199  351:ldc2            #633 <String "copyFile IOException">
	//  200  354:aastore         
	//  201  355:invokestatic    #133 <Method void dho.b(String, Object[])>
		if(s1 != null)
	//* 202  358:aload_0         
	//* 203  359:ifnull          366
			try
			{
				((InputStream) (s1)).close();
	//  204  362:aload_0         
	//  205  363:invokevirtual   #631 <Method void InputStream.close()>
			}
	//* 206  366:iconst_1        
	//* 207  367:ireturn         
			// Misplaced declaration of an exception variable
			catch(String s1)
	//* 208  368:astore_0        
			{
				dho.b("CommonUtil", new Object[] {
					"copyFile IOException"
				});
	//  209  369:ldc1            #68  <String "CommonUtil">
	//  210  371:iconst_1        
	//  211  372:anewarray       Object[]
	//  212  375:dup             
	//  213  376:iconst_0        
	//  214  377:ldc2            #633 <String "copyFile IOException">
	//  215  380:aastore         
	//  216  381:invokestatic    #133 <Method void dho.b(String, Object[])>
				return true;
	//  217  384:iconst_1        
	//  218  385:ireturn         
			}
		return true;
		s2;
	//  219  386:astore_1        
		if(s1 != null)
	//* 220  387:aload_0         
	//* 221  388:ifnull          395
			try
			{
				((InputStream) (s1)).close();
	//  222  391:aload_0         
	//  223  392:invokevirtual   #631 <Method void InputStream.close()>
			}
	//* 224  395:goto            414
			// Misplaced declaration of an exception variable
			catch(String s1)
	//* 225  398:astore_0        
			{
				dho.b("CommonUtil", new Object[] {
					"copyFile IOException"
				});
	//  226  399:ldc1            #68  <String "CommonUtil">
	//  227  401:iconst_1        
	//  228  402:anewarray       Object[]
	//  229  405:dup             
	//  230  406:iconst_0        
	//  231  407:ldc2            #633 <String "copyFile IOException">
	//  232  410:aastore         
	//  233  411:invokestatic    #133 <Method void dho.b(String, Object[])>
			}
		throw s2;
	//  234  414:aload_1         
	//  235  415:athrow          
		s1;
	//  236  416:astore_0        
		if(s5 == null)
			break MISSING_BLOCK_LABEL_427;
	//  237  417:aload           6
	//  238  419:ifnull          427
		((OutputStream) (s5)).close();
	//  239  422:aload           6
	//  240  424:invokevirtual   #630 <Method void OutputStream.close()>
		if(s3 != null)
	//* 241  427:aload           4
	//* 242  429:ifnull          437
			try
			{
				((InputStream) (s3)).close();
	//  243  432:aload           4
	//  244  434:invokevirtual   #631 <Method void InputStream.close()>
			}
	//* 245  437:iconst_0        
	//* 246  438:ireturn         
			// Misplaced declaration of an exception variable
			catch(String s1)
	//* 247  439:astore_0        
			{
				dho.b("CommonUtil", new Object[] {
					"copyFile IOException"
				});
	//  248  440:ldc1            #68  <String "CommonUtil">
	//  249  442:iconst_1        
	//  250  443:anewarray       Object[]
	//  251  446:dup             
	//  252  447:iconst_0        
	//  253  448:ldc2            #633 <String "copyFile IOException">
	//  254  451:aastore         
	//  255  452:invokestatic    #133 <Method void dho.b(String, Object[])>
				return false;
	//  256  455:iconst_0        
	//  257  456:ireturn         
			}
		return false;
		s1;
	//  258  457:astore_0        
		dho.b("CommonUtil", new Object[] {
			"copyFile IOException"
		});
	//  259  458:ldc1            #68  <String "CommonUtil">
	//  260  460:iconst_1        
	//  261  461:anewarray       Object[]
	//  262  464:dup             
	//  263  465:iconst_0        
	//  264  466:ldc2            #633 <String "copyFile IOException">
	//  265  469:aastore         
	//  266  470:invokestatic    #133 <Method void dho.b(String, Object[])>
		if(s3 != null)
	//* 267  473:aload           4
	//* 268  475:ifnull          483
			try
			{
				((InputStream) (s3)).close();
	//  269  478:aload           4
	//  270  480:invokevirtual   #631 <Method void InputStream.close()>
			}
	//* 271  483:iconst_0        
	//* 272  484:ireturn         
			// Misplaced declaration of an exception variable
			catch(String s1)
	//* 273  485:astore_0        
			{
				dho.b("CommonUtil", new Object[] {
					"copyFile IOException"
				});
	//  274  486:ldc1            #68  <String "CommonUtil">
	//  275  488:iconst_1        
	//  276  489:anewarray       Object[]
	//  277  492:dup             
	//  278  493:iconst_0        
	//  279  494:ldc2            #633 <String "copyFile IOException">
	//  280  497:aastore         
	//  281  498:invokestatic    #133 <Method void dho.b(String, Object[])>
				return false;
	//  282  501:iconst_0        
	//  283  502:ireturn         
			}
		return false;
		s1;
	//  284  503:astore_0        
		if(s3 != null)
	//* 285  504:aload           4
	//* 286  506:ifnull          514
			try
			{
				((InputStream) (s3)).close();
	//  287  509:aload           4
	//  288  511:invokevirtual   #631 <Method void InputStream.close()>
			}
	//* 289  514:goto            533
			// Misplaced declaration of an exception variable
			catch(String s2)
	//* 290  517:astore_1        
			{
				dho.b("CommonUtil", new Object[] {
					"copyFile IOException"
				});
	//  291  518:ldc1            #68  <String "CommonUtil">
	//  292  520:iconst_1        
	//  293  521:anewarray       Object[]
	//  294  524:dup             
	//  295  525:iconst_0        
	//  296  526:ldc2            #633 <String "copyFile IOException">
	//  297  529:aastore         
	//  298  530:invokestatic    #133 <Method void dho.b(String, Object[])>
			}
		throw s1;
	//  299  533:aload_0         
	//  300  534:athrow          
		s1;
	//  301  535:astore_0        
		if(s7 == null)
			break MISSING_BLOCK_LABEL_546;
	//  302  536:aload           8
	//  303  538:ifnull          546
		((OutputStream) (s7)).close();
	//  304  541:aload           8
	//  305  543:invokevirtual   #630 <Method void OutputStream.close()>
		if(s4 != null)
	//* 306  546:aload           5
	//* 307  548:ifnull          556
			try
			{
				((InputStream) (s4)).close();
	//  308  551:aload           5
	//  309  553:invokevirtual   #631 <Method void InputStream.close()>
			}
	//* 310  556:iconst_0        
	//* 311  557:ireturn         
			// Misplaced declaration of an exception variable
			catch(String s1)
	//* 312  558:astore_0        
			{
				dho.b("CommonUtil", new Object[] {
					"copyFile IOException"
				});
	//  313  559:ldc1            #68  <String "CommonUtil">
	//  314  561:iconst_1        
	//  315  562:anewarray       Object[]
	//  316  565:dup             
	//  317  566:iconst_0        
	//  318  567:ldc2            #633 <String "copyFile IOException">
	//  319  570:aastore         
	//  320  571:invokestatic    #133 <Method void dho.b(String, Object[])>
				return false;
	//  321  574:iconst_0        
	//  322  575:ireturn         
			}
		return false;
		s1;
	//  323  576:astore_0        
		dho.b("CommonUtil", new Object[] {
			"copyFile IOException"
		});
	//  324  577:ldc1            #68  <String "CommonUtil">
	//  325  579:iconst_1        
	//  326  580:anewarray       Object[]
	//  327  583:dup             
	//  328  584:iconst_0        
	//  329  585:ldc2            #633 <String "copyFile IOException">
	//  330  588:aastore         
	//  331  589:invokestatic    #133 <Method void dho.b(String, Object[])>
		if(s4 != null)
	//* 332  592:aload           5
	//* 333  594:ifnull          602
			try
			{
				((InputStream) (s4)).close();
	//  334  597:aload           5
	//  335  599:invokevirtual   #631 <Method void InputStream.close()>
			}
	//* 336  602:iconst_0        
	//* 337  603:ireturn         
			// Misplaced declaration of an exception variable
			catch(String s1)
	//* 338  604:astore_0        
			{
				dho.b("CommonUtil", new Object[] {
					"copyFile IOException"
				});
	//  339  605:ldc1            #68  <String "CommonUtil">
	//  340  607:iconst_1        
	//  341  608:anewarray       Object[]
	//  342  611:dup             
	//  343  612:iconst_0        
	//  344  613:ldc2            #633 <String "copyFile IOException">
	//  345  616:aastore         
	//  346  617:invokestatic    #133 <Method void dho.b(String, Object[])>
				return false;
	//  347  620:iconst_0        
	//  348  621:ireturn         
			}
		return false;
		s1;
	//  349  622:astore_0        
		if(s4 != null)
	//* 350  623:aload           5
	//* 351  625:ifnull          633
			try
			{
				((InputStream) (s4)).close();
	//  352  628:aload           5
	//  353  630:invokevirtual   #631 <Method void InputStream.close()>
			}
	//* 354  633:goto            652
			// Misplaced declaration of an exception variable
			catch(String s2)
	//* 355  636:astore_1        
			{
				dho.b("CommonUtil", new Object[] {
					"copyFile IOException"
				});
	//  356  637:ldc1            #68  <String "CommonUtil">
	//  357  639:iconst_1        
	//  358  640:anewarray       Object[]
	//  359  643:dup             
	//  360  644:iconst_0        
	//  361  645:ldc2            #633 <String "copyFile IOException">
	//  362  648:aastore         
	//  363  649:invokestatic    #133 <Method void dho.b(String, Object[])>
			}
		throw s1;
	//  364  652:aload_0         
	//  365  653:athrow          
		s1;
	//  366  654:astore_0        
		if(s8 == null)
			break MISSING_BLOCK_LABEL_665;
	//  367  655:aload           9
	//  368  657:ifnull          665
		((OutputStream) (s8)).close();
	//  369  660:aload           9
	//  370  662:invokevirtual   #630 <Method void OutputStream.close()>
		if(s6 != null)
	//* 371  665:aload           7
	//* 372  667:ifnull          675
			try
			{
				((InputStream) (s6)).close();
	//  373  670:aload           7
	//  374  672:invokevirtual   #631 <Method void InputStream.close()>
			}
	//* 375  675:goto            777
			// Misplaced declaration of an exception variable
			catch(String s2)
	//* 376  678:astore_1        
			{
				dho.b("CommonUtil", new Object[] {
					"copyFile IOException"
				});
	//  377  679:ldc1            #68  <String "CommonUtil">
	//  378  681:iconst_1        
	//  379  682:anewarray       Object[]
	//  380  685:dup             
	//  381  686:iconst_0        
	//  382  687:ldc2            #633 <String "copyFile IOException">
	//  383  690:aastore         
	//  384  691:invokestatic    #133 <Method void dho.b(String, Object[])>
			}
		break MISSING_BLOCK_LABEL_777;
	//  385  694:goto            777
		s2;
	//  386  697:astore_1        
		dho.b("CommonUtil", new Object[] {
			"copyFile IOException"
		});
	//  387  698:ldc1            #68  <String "CommonUtil">
	//  388  700:iconst_1        
	//  389  701:anewarray       Object[]
	//  390  704:dup             
	//  391  705:iconst_0        
	//  392  706:ldc2            #633 <String "copyFile IOException">
	//  393  709:aastore         
	//  394  710:invokestatic    #133 <Method void dho.b(String, Object[])>
		if(s6 != null)
	//* 395  713:aload           7
	//* 396  715:ifnull          723
			try
			{
				((InputStream) (s6)).close();
	//  397  718:aload           7
	//  398  720:invokevirtual   #631 <Method void InputStream.close()>
			}
	//* 399  723:goto            777
			// Misplaced declaration of an exception variable
			catch(String s2)
	//* 400  726:astore_1        
			{
				dho.b("CommonUtil", new Object[] {
					"copyFile IOException"
				});
	//  401  727:ldc1            #68  <String "CommonUtil">
	//  402  729:iconst_1        
	//  403  730:anewarray       Object[]
	//  404  733:dup             
	//  405  734:iconst_0        
	//  406  735:ldc2            #633 <String "copyFile IOException">
	//  407  738:aastore         
	//  408  739:invokestatic    #133 <Method void dho.b(String, Object[])>
			}
		break MISSING_BLOCK_LABEL_777;
	//  409  742:goto            777
		s1;
	//  410  745:astore_0        
		if(s6 != null)
	//* 411  746:aload           7
	//* 412  748:ifnull          756
			try
			{
				((InputStream) (s6)).close();
	//  413  751:aload           7
	//  414  753:invokevirtual   #631 <Method void InputStream.close()>
			}
	//* 415  756:goto            775
			// Misplaced declaration of an exception variable
			catch(String s2)
	//* 416  759:astore_1        
			{
				dho.b("CommonUtil", new Object[] {
					"copyFile IOException"
				});
	//  417  760:ldc1            #68  <String "CommonUtil">
	//  418  762:iconst_1        
	//  419  763:anewarray       Object[]
	//  420  766:dup             
	//  421  767:iconst_0        
	//  422  768:ldc2            #633 <String "copyFile IOException">
	//  423  771:aastore         
	//  424  772:invokestatic    #133 <Method void dho.b(String, Object[])>
			}
		throw s1;
	//  425  775:aload_0         
	//  426  776:athrow          
		throw s1;
	//  427  777:aload_0         
	//  428  778:athrow          
	}

	public static byte[] a(String s1)
	{
		byte abyte0[];
		String s2;
		ByteArrayOutputStream bytearrayoutputstream;
		ByteArrayOutputStream bytearrayoutputstream1;
		ByteArrayOutputStream bytearrayoutputstream2;
		String s3;
		ByteArrayOutputStream bytearrayoutputstream3;
		String s4;
		String s5;
		Object obj;
		byte abyte1[];
		Object obj1;
		Object obj2;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          11
		s4 = null;
	//    2    3:aconst_null     
	//    3    4:astore          9
		s5 = null;
	//    4    6:aconst_null     
	//    5    7:astore          10
		s2 = null;
	//    6    9:aconst_null     
	//    7   10:astore_3        
		s3 = null;
	//    8   11:aconst_null     
	//    9   12:astore          7
		abyte1 = null;
	//   10   14:aconst_null     
	//   11   15:astore          12
		obj1 = null;
	//   12   17:aconst_null     
	//   13   18:astore          13
		obj2 = null;
	//   14   20:aconst_null     
	//   15   21:astore          14
		bytearrayoutputstream = null;
	//   16   23:aconst_null     
	//   17   24:astore          4
		bytearrayoutputstream1 = bytearrayoutputstream;
	//   18   26:aload           4
	//   19   28:astore          5
		bytearrayoutputstream2 = ((ByteArrayOutputStream) (abyte1));
	//   20   30:aload           12
	//   21   32:astore          6
		bytearrayoutputstream3 = ((ByteArrayOutputStream) (obj1));
	//   22   34:aload           13
	//   23   36:astore          8
		abyte0 = ((byte []) (obj2));
	//   24   38:aload           14
	//   25   40:astore_2        
		s1 = ((String) (new FileInputStream(new File(s1))));
	//   26   41:new             #611 <Class FileInputStream>
	//   27   44:dup             
	//   28   45:new             #585 <Class File>
	//   29   48:dup             
	//   30   49:aload_0         
	//   31   50:invokespecial   #587 <Method void File(String)>
	//   32   53:invokespecial   #614 <Method void FileInputStream(File)>
	//   33   56:astore_0        
		s3 = s1;
	//   34   57:aload_0         
	//   35   58:astore          7
		bytearrayoutputstream1 = bytearrayoutputstream;
	//   36   60:aload           4
	//   37   62:astore          5
		s4 = s1;
	//   38   64:aload_0         
	//   39   65:astore          9
		bytearrayoutputstream2 = ((ByteArrayOutputStream) (abyte1));
	//   40   67:aload           12
	//   41   69:astore          6
		s5 = s1;
	//   42   71:aload_0         
	//   43   72:astore          10
		bytearrayoutputstream3 = ((ByteArrayOutputStream) (obj1));
	//   44   74:aload           13
	//   45   76:astore          8
		s2 = s1;
	//   46   78:aload_0         
	//   47   79:astore_3        
		abyte0 = ((byte []) (obj2));
	//   48   80:aload           14
	//   49   82:astore_2        
		bytearrayoutputstream = new ByteArrayOutputStream();
	//   50   83:new             #636 <Class ByteArrayOutputStream>
	//   51   86:dup             
	//   52   87:invokespecial   #637 <Method void ByteArrayOutputStream()>
	//   53   90:astore          4
		s3 = s1;
	//   54   92:aload_0         
	//   55   93:astore          7
		bytearrayoutputstream1 = bytearrayoutputstream;
	//   56   95:aload           4
	//   57   97:astore          5
		s4 = s1;
	//   58   99:aload_0         
	//   59  100:astore          9
		bytearrayoutputstream2 = bytearrayoutputstream;
	//   60  102:aload           4
	//   61  104:astore          6
		s5 = s1;
	//   62  106:aload_0         
	//   63  107:astore          10
		bytearrayoutputstream3 = bytearrayoutputstream;
	//   64  109:aload           4
	//   65  111:astore          8
		s2 = s1;
	//   66  113:aload_0         
	//   67  114:astore_3        
		abyte0 = ((byte []) (bytearrayoutputstream));
	//   68  115:aload           4
	//   69  117:astore_2        
		abyte1 = new byte[1024];
	//   70  118:sipush          1024
	//   71  121:newarray        byte[]
	//   72  123:astore          12
_L2:
		s3 = s1;
	//   73  125:aload_0         
	//   74  126:astore          7
		bytearrayoutputstream1 = bytearrayoutputstream;
	//   75  128:aload           4
	//   76  130:astore          5
		s4 = s1;
	//   77  132:aload_0         
	//   78  133:astore          9
		bytearrayoutputstream2 = bytearrayoutputstream;
	//   79  135:aload           4
	//   80  137:astore          6
		s5 = s1;
	//   81  139:aload_0         
	//   82  140:astore          10
		bytearrayoutputstream3 = bytearrayoutputstream;
	//   83  142:aload           4
	//   84  144:astore          8
		s2 = s1;
	//   85  146:aload_0         
	//   86  147:astore_3        
		abyte0 = ((byte []) (bytearrayoutputstream));
	//   87  148:aload           4
	//   88  150:astore_2        
		int i1 = ((FileInputStream) (s1)).read(abyte1);
	//   89  151:aload_0         
	//   90  152:aload           12
	//   91  154:invokevirtual   #638 <Method int FileInputStream.read(byte[])>
	//   92  157:istore_1        
		if(i1 == -1)
			break; /* Loop/switch isn't completed */
	//   93  158:iload_1         
	//   94  159:iconst_m1       
	//   95  160:icmpeq          201
		s3 = s1;
	//   96  163:aload_0         
	//   97  164:astore          7
		bytearrayoutputstream1 = bytearrayoutputstream;
	//   98  166:aload           4
	//   99  168:astore          5
		s4 = s1;
	//  100  170:aload_0         
	//  101  171:astore          9
		bytearrayoutputstream2 = bytearrayoutputstream;
	//  102  173:aload           4
	//  103  175:astore          6
		s5 = s1;
	//  104  177:aload_0         
	//  105  178:astore          10
		bytearrayoutputstream3 = bytearrayoutputstream;
	//  106  180:aload           4
	//  107  182:astore          8
		s2 = s1;
	//  108  184:aload_0         
	//  109  185:astore_3        
		abyte0 = ((byte []) (bytearrayoutputstream));
	//  110  186:aload           4
	//  111  188:astore_2        
		bytearrayoutputstream.write(abyte1, 0, i1);
	//  112  189:aload           4
	//  113  191:aload           12
	//  114  193:iconst_0        
	//  115  194:iload_1         
	//  116  195:invokevirtual   #639 <Method void ByteArrayOutputStream.write(byte[], int, int)>
		if(true) goto _L2; else goto _L1
	//  117  198:goto            125
_L1:
		s3 = s1;
	//  118  201:aload_0         
	//  119  202:astore          7
		bytearrayoutputstream1 = bytearrayoutputstream;
	//  120  204:aload           4
	//  121  206:astore          5
		s4 = s1;
	//  122  208:aload_0         
	//  123  209:astore          9
		bytearrayoutputstream2 = bytearrayoutputstream;
	//  124  211:aload           4
	//  125  213:astore          6
		s5 = s1;
	//  126  215:aload_0         
	//  127  216:astore          10
		bytearrayoutputstream3 = bytearrayoutputstream;
	//  128  218:aload           4
	//  129  220:astore          8
		s2 = s1;
	//  130  222:aload_0         
	//  131  223:astore_3        
		abyte0 = ((byte []) (bytearrayoutputstream));
	//  132  224:aload           4
	//  133  226:astore_2        
		abyte1 = bytearrayoutputstream.toByteArray();
	//  134  227:aload           4
	//  135  229:invokevirtual   #643 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//  136  232:astore          12
		abyte0 = abyte1;
	//  137  234:aload           12
	//  138  236:astore_2        
		if(s1 != null)
	//* 139  237:aload_0         
	//* 140  238:ifnull          284
			try
			{
				((FileInputStream) (s1)).close();
	//  141  241:aload_0         
	//  142  242:invokevirtual   #644 <Method void FileInputStream.close()>
			}
	//* 143  245:goto            284
			// Misplaced declaration of an exception variable
			catch(String s1)
	//* 144  248:astore_0        
			{
				dho.f("CommonUtil", new Object[] {
					(new StringBuilder()).append("loadCertificates Exception:").append(((IOException) (s1)).getMessage()).toString()
				});
	//  145  249:ldc1            #68  <String "CommonUtil">
	//  146  251:iconst_1        
	//  147  252:anewarray       Object[]
	//  148  255:dup             
	//  149  256:iconst_0        
	//  150  257:new             #120 <Class StringBuilder>
	//  151  260:dup             
	//  152  261:invokespecial   #121 <Method void StringBuilder()>
	//  153  264:ldc2            #646 <String "loadCertificates Exception:">
	//  154  267:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  155  270:aload_0         
	//  156  271:invokevirtual   #647 <Method String IOException.getMessage()>
	//  157  274:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  158  277:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  159  280:aastore         
	//  160  281:invokestatic    #79  <Method void dho.f(String, Object[])>
			}
		s1 = ((String) (abyte0));
	//  161  284:aload_2         
	//  162  285:astore_0        
		if(bytearrayoutputstream != null)
	//* 163  286:aload           4
	//* 164  288:ifnull          865
		{
			try
			{
				bytearrayoutputstream.close();
	//  165  291:aload           4
	//  166  293:invokevirtual   #648 <Method void ByteArrayOutputStream.close()>
			}
	//* 167  296:aload_2         
	//* 168  297:areturn         
			// Misplaced declaration of an exception variable
			catch(String s1)
	//* 169  298:astore_0        
			{
				dho.f("CommonUtil", new Object[] {
					(new StringBuilder()).append("loadCertificates Exception:").append(((IOException) (s1)).getMessage()).toString()
				});
	//  170  299:ldc1            #68  <String "CommonUtil">
	//  171  301:iconst_1        
	//  172  302:anewarray       Object[]
	//  173  305:dup             
	//  174  306:iconst_0        
	//  175  307:new             #120 <Class StringBuilder>
	//  176  310:dup             
	//  177  311:invokespecial   #121 <Method void StringBuilder()>
	//  178  314:ldc2            #646 <String "loadCertificates Exception:">
	//  179  317:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  180  320:aload_0         
	//  181  321:invokevirtual   #647 <Method String IOException.getMessage()>
	//  182  324:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  183  327:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  184  330:aastore         
	//  185  331:invokestatic    #79  <Method void dho.f(String, Object[])>
				return abyte0;
	//  186  334:aload_2         
	//  187  335:areturn         
			}
			return abyte0;
		}
		break MISSING_BLOCK_LABEL_865;
		s1;
	//  188  336:astore_0        
		s2 = s3;
	//  189  337:aload           7
	//  190  339:astore_3        
		abyte0 = ((byte []) (bytearrayoutputstream1));
	//  191  340:aload           5
	//  192  342:astore_2        
		dho.b("CommonUtil", new Object[] {
			(new StringBuilder()).append("file2byte FileNotFoundException : file : ").append(((FileNotFoundException) (s1)).getMessage()).toString()
		});
	//  193  343:ldc1            #68  <String "CommonUtil">
	//  194  345:iconst_1        
	//  195  346:anewarray       Object[]
	//  196  349:dup             
	//  197  350:iconst_0        
	//  198  351:new             #120 <Class StringBuilder>
	//  199  354:dup             
	//  200  355:invokespecial   #121 <Method void StringBuilder()>
	//  201  358:ldc2            #650 <String "file2byte FileNotFoundException : file : ">
	//  202  361:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  203  364:aload_0         
	//  204  365:invokevirtual   #651 <Method String FileNotFoundException.getMessage()>
	//  205  368:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  206  371:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  207  374:aastore         
	//  208  375:invokestatic    #133 <Method void dho.b(String, Object[])>
		if(s3 != null)
	//* 209  378:aload           7
	//* 210  380:ifnull          427
			try
			{
				((FileInputStream) (s3)).close();
	//  211  383:aload           7
	//  212  385:invokevirtual   #644 <Method void FileInputStream.close()>
			}
	//* 213  388:goto            427
			// Misplaced declaration of an exception variable
			catch(String s1)
	//* 214  391:astore_0        
			{
				dho.f("CommonUtil", new Object[] {
					(new StringBuilder()).append("loadCertificates Exception:").append(((IOException) (s1)).getMessage()).toString()
				});
	//  215  392:ldc1            #68  <String "CommonUtil">
	//  216  394:iconst_1        
	//  217  395:anewarray       Object[]
	//  218  398:dup             
	//  219  399:iconst_0        
	//  220  400:new             #120 <Class StringBuilder>
	//  221  403:dup             
	//  222  404:invokespecial   #121 <Method void StringBuilder()>
	//  223  407:ldc2            #646 <String "loadCertificates Exception:">
	//  224  410:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  225  413:aload_0         
	//  226  414:invokevirtual   #647 <Method String IOException.getMessage()>
	//  227  417:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  228  420:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  229  423:aastore         
	//  230  424:invokestatic    #79  <Method void dho.f(String, Object[])>
			}
		s1 = ((String) (obj));
	//  231  427:aload           11
	//  232  429:astore_0        
		if(bytearrayoutputstream1 != null)
	//* 233  430:aload           5
	//* 234  432:ifnull          865
		{
			try
			{
				bytearrayoutputstream1.close();
	//  235  435:aload           5
	//  236  437:invokevirtual   #648 <Method void ByteArrayOutputStream.close()>
			}
	//* 237  440:aconst_null     
	//* 238  441:areturn         
			// Misplaced declaration of an exception variable
			catch(String s1)
	//* 239  442:astore_0        
			{
				dho.f("CommonUtil", new Object[] {
					(new StringBuilder()).append("loadCertificates Exception:").append(((IOException) (s1)).getMessage()).toString()
				});
	//  240  443:ldc1            #68  <String "CommonUtil">
	//  241  445:iconst_1        
	//  242  446:anewarray       Object[]
	//  243  449:dup             
	//  244  450:iconst_0        
	//  245  451:new             #120 <Class StringBuilder>
	//  246  454:dup             
	//  247  455:invokespecial   #121 <Method void StringBuilder()>
	//  248  458:ldc2            #646 <String "loadCertificates Exception:">
	//  249  461:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  250  464:aload_0         
	//  251  465:invokevirtual   #647 <Method String IOException.getMessage()>
	//  252  468:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  253  471:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  254  474:aastore         
	//  255  475:invokestatic    #79  <Method void dho.f(String, Object[])>
				return null;
	//  256  478:aconst_null     
	//  257  479:areturn         
			}
			return null;
		}
		break MISSING_BLOCK_LABEL_865;
		s1;
	//  258  480:astore_0        
		s2 = s4;
	//  259  481:aload           9
	//  260  483:astore_3        
		abyte0 = ((byte []) (bytearrayoutputstream2));
	//  261  484:aload           6
	//  262  486:astore_2        
		dho.b("CommonUtil", new Object[] {
			(new StringBuilder()).append("file2byte IOException file : ").append(((IOException) (s1)).getMessage()).toString()
		});
	//  263  487:ldc1            #68  <String "CommonUtil">
	//  264  489:iconst_1        
	//  265  490:anewarray       Object[]
	//  266  493:dup             
	//  267  494:iconst_0        
	//  268  495:new             #120 <Class StringBuilder>
	//  269  498:dup             
	//  270  499:invokespecial   #121 <Method void StringBuilder()>
	//  271  502:ldc2            #653 <String "file2byte IOException file : ">
	//  272  505:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  273  508:aload_0         
	//  274  509:invokevirtual   #647 <Method String IOException.getMessage()>
	//  275  512:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  276  515:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  277  518:aastore         
	//  278  519:invokestatic    #133 <Method void dho.b(String, Object[])>
		if(s4 != null)
	//* 279  522:aload           9
	//* 280  524:ifnull          571
			try
			{
				((FileInputStream) (s4)).close();
	//  281  527:aload           9
	//  282  529:invokevirtual   #644 <Method void FileInputStream.close()>
			}
	//* 283  532:goto            571
			// Misplaced declaration of an exception variable
			catch(String s1)
	//* 284  535:astore_0        
			{
				dho.f("CommonUtil", new Object[] {
					(new StringBuilder()).append("loadCertificates Exception:").append(((IOException) (s1)).getMessage()).toString()
				});
	//  285  536:ldc1            #68  <String "CommonUtil">
	//  286  538:iconst_1        
	//  287  539:anewarray       Object[]
	//  288  542:dup             
	//  289  543:iconst_0        
	//  290  544:new             #120 <Class StringBuilder>
	//  291  547:dup             
	//  292  548:invokespecial   #121 <Method void StringBuilder()>
	//  293  551:ldc2            #646 <String "loadCertificates Exception:">
	//  294  554:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  295  557:aload_0         
	//  296  558:invokevirtual   #647 <Method String IOException.getMessage()>
	//  297  561:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  298  564:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  299  567:aastore         
	//  300  568:invokestatic    #79  <Method void dho.f(String, Object[])>
			}
		s1 = ((String) (obj));
	//  301  571:aload           11
	//  302  573:astore_0        
		if(bytearrayoutputstream2 != null)
	//* 303  574:aload           6
	//* 304  576:ifnull          865
		{
			try
			{
				bytearrayoutputstream2.close();
	//  305  579:aload           6
	//  306  581:invokevirtual   #648 <Method void ByteArrayOutputStream.close()>
			}
	//* 307  584:aconst_null     
	//* 308  585:areturn         
			// Misplaced declaration of an exception variable
			catch(String s1)
	//* 309  586:astore_0        
			{
				dho.f("CommonUtil", new Object[] {
					(new StringBuilder()).append("loadCertificates Exception:").append(((IOException) (s1)).getMessage()).toString()
				});
	//  310  587:ldc1            #68  <String "CommonUtil">
	//  311  589:iconst_1        
	//  312  590:anewarray       Object[]
	//  313  593:dup             
	//  314  594:iconst_0        
	//  315  595:new             #120 <Class StringBuilder>
	//  316  598:dup             
	//  317  599:invokespecial   #121 <Method void StringBuilder()>
	//  318  602:ldc2            #646 <String "loadCertificates Exception:">
	//  319  605:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  320  608:aload_0         
	//  321  609:invokevirtual   #647 <Method String IOException.getMessage()>
	//  322  612:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  323  615:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  324  618:aastore         
	//  325  619:invokestatic    #79  <Method void dho.f(String, Object[])>
				return null;
	//  326  622:aconst_null     
	//  327  623:areturn         
			}
			return null;
		}
		break MISSING_BLOCK_LABEL_865;
		s1;
	//  328  624:astore_0        
		s2 = s5;
	//  329  625:aload           10
	//  330  627:astore_3        
		abyte0 = ((byte []) (bytearrayoutputstream3));
	//  331  628:aload           8
	//  332  630:astore_2        
		dho.b("CommonUtil", new Object[] {
			(new StringBuilder()).append("file2byte Exception file : ").append(((Exception) (s1)).getMessage()).toString()
		});
	//  333  631:ldc1            #68  <String "CommonUtil">
	//  334  633:iconst_1        
	//  335  634:anewarray       Object[]
	//  336  637:dup             
	//  337  638:iconst_0        
	//  338  639:new             #120 <Class StringBuilder>
	//  339  642:dup             
	//  340  643:invokespecial   #121 <Method void StringBuilder()>
	//  341  646:ldc2            #655 <String "file2byte Exception file : ">
	//  342  649:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  343  652:aload_0         
	//  344  653:invokevirtual   #73  <Method String Exception.getMessage()>
	//  345  656:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  346  659:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  347  662:aastore         
	//  348  663:invokestatic    #133 <Method void dho.b(String, Object[])>
		if(s5 != null)
	//* 349  666:aload           10
	//* 350  668:ifnull          715
			try
			{
				((FileInputStream) (s5)).close();
	//  351  671:aload           10
	//  352  673:invokevirtual   #644 <Method void FileInputStream.close()>
			}
	//* 353  676:goto            715
			// Misplaced declaration of an exception variable
			catch(String s1)
	//* 354  679:astore_0        
			{
				dho.f("CommonUtil", new Object[] {
					(new StringBuilder()).append("loadCertificates Exception:").append(((IOException) (s1)).getMessage()).toString()
				});
	//  355  680:ldc1            #68  <String "CommonUtil">
	//  356  682:iconst_1        
	//  357  683:anewarray       Object[]
	//  358  686:dup             
	//  359  687:iconst_0        
	//  360  688:new             #120 <Class StringBuilder>
	//  361  691:dup             
	//  362  692:invokespecial   #121 <Method void StringBuilder()>
	//  363  695:ldc2            #646 <String "loadCertificates Exception:">
	//  364  698:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  365  701:aload_0         
	//  366  702:invokevirtual   #647 <Method String IOException.getMessage()>
	//  367  705:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  368  708:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  369  711:aastore         
	//  370  712:invokestatic    #79  <Method void dho.f(String, Object[])>
			}
		s1 = ((String) (obj));
	//  371  715:aload           11
	//  372  717:astore_0        
		if(bytearrayoutputstream3 != null)
	//* 373  718:aload           8
	//* 374  720:ifnull          865
		{
			try
			{
				bytearrayoutputstream3.close();
	//  375  723:aload           8
	//  376  725:invokevirtual   #648 <Method void ByteArrayOutputStream.close()>
			}
	//* 377  728:aconst_null     
	//* 378  729:areturn         
			// Misplaced declaration of an exception variable
			catch(String s1)
	//* 379  730:astore_0        
			{
				dho.f("CommonUtil", new Object[] {
					(new StringBuilder()).append("loadCertificates Exception:").append(((IOException) (s1)).getMessage()).toString()
				});
	//  380  731:ldc1            #68  <String "CommonUtil">
	//  381  733:iconst_1        
	//  382  734:anewarray       Object[]
	//  383  737:dup             
	//  384  738:iconst_0        
	//  385  739:new             #120 <Class StringBuilder>
	//  386  742:dup             
	//  387  743:invokespecial   #121 <Method void StringBuilder()>
	//  388  746:ldc2            #646 <String "loadCertificates Exception:">
	//  389  749:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  390  752:aload_0         
	//  391  753:invokevirtual   #647 <Method String IOException.getMessage()>
	//  392  756:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  393  759:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  394  762:aastore         
	//  395  763:invokestatic    #79  <Method void dho.f(String, Object[])>
				return null;
	//  396  766:aconst_null     
	//  397  767:areturn         
			}
			return null;
		}
		break MISSING_BLOCK_LABEL_865;
		s1;
	//  398  768:astore_0        
		if(s2 != null)
	//* 399  769:aload_3         
	//* 400  770:ifnull          816
			try
			{
				((FileInputStream) (s2)).close();
	//  401  773:aload_3         
	//  402  774:invokevirtual   #644 <Method void FileInputStream.close()>
			}
	//* 403  777:goto            816
			catch(IOException ioexception1)
	//* 404  780:astore_3        
			{
				dho.f("CommonUtil", new Object[] {
					(new StringBuilder()).append("loadCertificates Exception:").append(ioexception1.getMessage()).toString()
				});
	//  405  781:ldc1            #68  <String "CommonUtil">
	//  406  783:iconst_1        
	//  407  784:anewarray       Object[]
	//  408  787:dup             
	//  409  788:iconst_0        
	//  410  789:new             #120 <Class StringBuilder>
	//  411  792:dup             
	//  412  793:invokespecial   #121 <Method void StringBuilder()>
	//  413  796:ldc2            #646 <String "loadCertificates Exception:">
	//  414  799:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  415  802:aload_3         
	//  416  803:invokevirtual   #647 <Method String IOException.getMessage()>
	//  417  806:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  418  809:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  419  812:aastore         
	//  420  813:invokestatic    #79  <Method void dho.f(String, Object[])>
			}
		if(abyte0 != null)
	//* 421  816:aload_2         
	//* 422  817:ifnull          863
			try
			{
				((ByteArrayOutputStream) (abyte0)).close();
	//  423  820:aload_2         
	//  424  821:invokevirtual   #648 <Method void ByteArrayOutputStream.close()>
			}
	//* 425  824:goto            863
			catch(IOException ioexception)
	//* 426  827:astore_2        
			{
				dho.f("CommonUtil", new Object[] {
					(new StringBuilder()).append("loadCertificates Exception:").append(ioexception.getMessage()).toString()
				});
	//  427  828:ldc1            #68  <String "CommonUtil">
	//  428  830:iconst_1        
	//  429  831:anewarray       Object[]
	//  430  834:dup             
	//  431  835:iconst_0        
	//  432  836:new             #120 <Class StringBuilder>
	//  433  839:dup             
	//  434  840:invokespecial   #121 <Method void StringBuilder()>
	//  435  843:ldc2            #646 <String "loadCertificates Exception:">
	//  436  846:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  437  849:aload_2         
	//  438  850:invokevirtual   #647 <Method String IOException.getMessage()>
	//  439  853:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  440  856:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  441  859:aastore         
	//  442  860:invokestatic    #79  <Method void dho.f(String, Object[])>
			}
		throw s1;
	//  443  863:aload_0         
	//  444  864:athrow          
		return ((byte []) (s1));
	//  445  865:aload_0         
	//  446  866:areturn         
	}

	public static double b(double d1, int i1)
	{
		int j1 = i1;
	//    0    0:iload_2         
	//    1    1:istore_3        
		if(i1 < 0)
	//*   2    2:iload_2         
	//*   3    3:ifge            23
		{
			dho.e("CommonUtil", new Object[] {
				"round, parameter ERROR!"
			});
	//    4    6:ldc1            #68  <String "CommonUtil">
	//    5    8:iconst_1        
	//    6    9:anewarray       Object[]
	//    7   12:dup             
	//    8   13:iconst_0        
	//    9   14:ldc2            #658 <String "round, parameter ERROR!">
	//   10   17:aastore         
	//   11   18:invokestatic    #660 <Method void dho.e(String, Object[])>
			j1 = 0;
	//   12   21:iconst_0        
	//   13   22:istore_3        
		}
		return (new BigDecimal(Double.toString(d1))).divide(new BigDecimal("1"), j1, 4).doubleValue();
	//   14   23:new             #662 <Class BigDecimal>
	//   15   26:dup             
	//   16   27:dload_0         
	//   17   28:invokestatic    #665 <Method String Double.toString(double)>
	//   18   31:invokespecial   #666 <Method void BigDecimal(String)>
	//   19   34:new             #662 <Class BigDecimal>
	//   20   37:dup             
	//   21   38:ldc2            #668 <String "1">
	//   22   41:invokespecial   #666 <Method void BigDecimal(String)>
	//   23   44:iload_3         
	//   24   45:iconst_4        
	//   25   46:invokevirtual   #672 <Method BigDecimal BigDecimal.divide(BigDecimal, int, int)>
	//   26   49:invokevirtual   #676 <Method double BigDecimal.doubleValue()>
	//   27   52:dreturn         
	}

	public static int b(String s1)
	{
		return c(s1, 0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #679 <Method int c(String, int)>
	//    3    5:ireturn         
	}

	public static String b(double d1, String s1)
	{
		DecimalFormat decimalformat = new DecimalFormat();
	//    0    0:new             #682 <Class DecimalFormat>
	//    1    3:dup             
	//    2    4:invokespecial   #683 <Method void DecimalFormat()>
	//    3    7:astore_3        
		decimalformat.applyPattern(s1);
	//    4    8:aload_3         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #686 <Method void DecimalFormat.applyPattern(String)>
		return decimalformat.format(d1);
	//    7   13:aload_3         
	//    8   14:dload_0         
	//    9   15:invokevirtual   #689 <Method String DecimalFormat.format(double)>
	//   10   18:areturn         
	}

	private static String b(String s1, int i1, int j1)
	{
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #305 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return s1;
	//    3    7:aload_0         
	//    4    8:areturn         
		int l1 = s1.length();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #308 <Method int String.length()>
	//    7   13:istore          4
		if(i1 >= 0 && j1 >= 0 && l1 > i1 + j1)
	//*   8   15:iload_1         
	//*   9   16:iflt            97
	//*  10   19:iload_2         
	//*  11   20:iflt            97
	//*  12   23:iload           4
	//*  13   25:iload_1         
	//*  14   26:iload_2         
	//*  15   27:iadd            
	//*  16   28:icmple          97
		{
			s1 = ((String) (new StringBuilder(s1)));
	//   17   31:new             #120 <Class StringBuilder>
	//   18   34:dup             
	//   19   35:aload_0         
	//   20   36:invokespecial   #691 <Method void StringBuilder(String)>
	//   21   39:astore_0        
			StringBuilder stringbuilder = new StringBuilder();
	//   22   40:new             #120 <Class StringBuilder>
	//   23   43:dup             
	//   24   44:invokespecial   #121 <Method void StringBuilder()>
	//   25   47:astore          5
			for(int k1 = 0; k1 < l1 - i1 - j1; k1++)
	//*  26   49:iconst_0        
	//*  27   50:istore_3        
	//*  28   51:iload_3         
	//*  29   52:iload           4
	//*  30   54:iload_1         
	//*  31   55:isub            
	//*  32   56:iload_2         
	//*  33   57:isub            
	//*  34   58:icmpge          77
				stringbuilder.append("*");
	//   35   61:aload           5
	//   36   63:ldc2            #693 <String "*">
	//   37   66:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   38   69:pop             

	//   39   70:iload_3         
	//   40   71:iconst_1        
	//   41   72:iadd            
	//   42   73:istore_3        
	//*  43   74:goto            51
			((StringBuilder) (s1)).replace(i1, l1 - j1, stringbuilder.toString());
	//   44   77:aload_0         
	//   45   78:iload_1         
	//   46   79:iload           4
	//   47   81:iload_2         
	//   48   82:isub            
	//   49   83:aload           5
	//   50   85:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   51   88:invokevirtual   #696 <Method StringBuilder StringBuilder.replace(int, int, String)>
	//   52   91:pop             
			return ((StringBuilder) (s1)).toString();
	//   53   92:aload_0         
	//   54   93:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   55   96:areturn         
		} else
		{
			return "***";
	//   56   97:ldc2            #698 <String "***">
	//   57  100:areturn         
		}
	}

	private static void b(Class class1, Class aclass[], Object aobj[])
		throws Exception
	{
		dho.b("CommonUtil", new Object[] {
			"Enter paramsCheck"
		});
	//    0    0:ldc1            #68  <String "CommonUtil">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc2            #701 <String "Enter paramsCheck">
	//    6   11:aastore         
	//    7   12:invokestatic    #133 <Method void dho.b(String, Object[])>
		if(class1 == null)
	//*   8   15:aload_0         
	//*   9   16:ifnonnull       30
			throw new Exception("class is null in staticFun");
	//   10   19:new             #36  <Class Exception>
	//   11   22:dup             
	//   12   23:ldc2            #703 <String "class is null in staticFun">
	//   13   26:invokespecial   #704 <Method void Exception(String)>
	//   14   29:athrow          
		if(aclass == null)
	//*  15   30:aload_1         
	//*  16   31:ifnonnull       49
		{
			if(aobj != null)
	//*  17   34:aload_2         
	//*  18   35:ifnull          111
				throw new Exception("paramsType is null, but params is not null");
	//   19   38:new             #36  <Class Exception>
	//   20   41:dup             
	//   21   42:ldc2            #706 <String "paramsType is null, but params is not null">
	//   22   45:invokespecial   #704 <Method void Exception(String)>
	//   23   48:athrow          
		} else
		{
			if(aobj == null)
	//*  24   49:aload_2         
	//*  25   50:ifnonnull       64
				throw new Exception("paramsType or params should be same");
	//   26   53:new             #36  <Class Exception>
	//   27   56:dup             
	//   28   57:ldc2            #708 <String "paramsType or params should be same">
	//   29   60:invokespecial   #704 <Method void Exception(String)>
	//   30   63:athrow          
			if(aclass.length != aobj.length)
	//*  31   64:aload_1         
	//*  32   65:arraylength     
	//*  33   66:aload_2         
	//*  34   67:arraylength     
	//*  35   68:icmpeq          111
				throw new Exception((new StringBuilder()).append("paramsType len:").append(aclass.length).append(" should equal params.len:").append(aobj.length).toString());
	//   36   71:new             #36  <Class Exception>
	//   37   74:dup             
	//   38   75:new             #120 <Class StringBuilder>
	//   39   78:dup             
	//   40   79:invokespecial   #121 <Method void StringBuilder()>
	//   41   82:ldc2            #710 <String "paramsType len:">
	//   42   85:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   43   88:aload_1         
	//   44   89:arraylength     
	//   45   90:invokevirtual   #205 <Method StringBuilder StringBuilder.append(int)>
	//   46   93:ldc2            #712 <String " should equal params.len:">
	//   47   96:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   48   99:aload_2         
	//   49  100:arraylength     
	//   50  101:invokevirtual   #205 <Method StringBuilder StringBuilder.append(int)>
	//   51  104:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   52  107:invokespecial   #704 <Method void Exception(String)>
	//   53  110:athrow          
		}
	//   54  111:return          
	}

	public static boolean b()
	{
		return dhu.b();
	//    0    0:invokestatic    #717 <Method boolean dhu.b()>
	//    1    3:ireturn         
	}

	public static boolean b(Context context)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public static boolean b(Context context, String s1)
	{
		dho.b("CommonUtil", new Object[] {
			"getIfInEUAccountArea() enter"
		});
	//    0    0:ldc1            #68  <String "CommonUtil">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc2            #720 <String "getIfInEUAccountArea() enter">
	//    6   11:aastore         
	//    7   12:invokestatic    #133 <Method void dho.b(String, Object[])>
		String as[] = context.getResources().getStringArray(com.huawei.hwcommonmodel.R.array.eu_national_code);
	//    8   15:aload_0         
	//    9   16:invokevirtual   #279 <Method Resources Context.getResources()>
	//   10   19:getstatic       #723 <Field int com.huawei.hwcommonmodel.R$array.eu_national_code>
	//   11   22:invokevirtual   #290 <Method String[] Resources.getStringArray(int)>
	//   12   25:astore          4
		if(as == null || as.length < 1)
	//*  13   27:aload           4
	//*  14   29:ifnull          39
	//*  15   32:aload           4
	//*  16   34:arraylength     
	//*  17   35:iconst_1        
	//*  18   36:icmpge          56
		{
			dho.f("CommonUtil", new Object[] {
				"getIfInEUAccountArea() if (countryList == null || countryList.length < 1)"
			});
	//   19   39:ldc1            #68  <String "CommonUtil">
	//   20   41:iconst_1        
	//   21   42:anewarray       Object[]
	//   22   45:dup             
	//   23   46:iconst_0        
	//   24   47:ldc2            #725 <String "getIfInEUAccountArea() if (countryList == null || countryList.length < 1)">
	//   25   50:aastore         
	//   26   51:invokestatic    #79  <Method void dho.f(String, Object[])>
			return false;
	//   27   54:iconst_0        
	//   28   55:ireturn         
		}
		context = ((Context) (s1));
	//   29   56:aload_1         
	//   30   57:astore_0        
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*  31   58:aload_1         
	//*  32   59:invokestatic    #305 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  33   62:ifeq            72
			context = ((Context) (Locale.getDefault().getCountry()));
	//   34   65:invokestatic    #729 <Method Locale Locale.getDefault()>
	//   35   68:invokevirtual   #563 <Method String Locale.getCountry()>
	//   36   71:astore_0        
		dho.b("CommonUtil", new Object[] {
			(new StringBuilder()).append("getIfInEUAccountArea() country=").append(((String) (context))).toString()
		});
	//   37   72:ldc1            #68  <String "CommonUtil">
	//   38   74:iconst_1        
	//   39   75:anewarray       Object[]
	//   40   78:dup             
	//   41   79:iconst_0        
	//   42   80:new             #120 <Class StringBuilder>
	//   43   83:dup             
	//   44   84:invokespecial   #121 <Method void StringBuilder()>
	//   45   87:ldc2            #731 <String "getIfInEUAccountArea() country=">
	//   46   90:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   47   93:aload_0         
	//   48   94:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   49   97:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   50  100:aastore         
	//   51  101:invokestatic    #133 <Method void dho.b(String, Object[])>
		int j1 = as.length;
	//   52  104:aload           4
	//   53  106:arraylength     
	//   54  107:istore_3        
		for(int i1 = 0; i1 < j1; i1++)
	//*  55  108:iconst_0        
	//*  56  109:istore_2        
	//*  57  110:iload_2         
	//*  58  111:iload_3         
	//*  59  112:icmpge          135
			if(((String) (context)).equalsIgnoreCase(as[i1]))
	//*  60  115:aload_0         
	//*  61  116:aload           4
	//*  62  118:iload_2         
	//*  63  119:aaload          
	//*  64  120:invokevirtual   #56  <Method boolean String.equalsIgnoreCase(String)>
	//*  65  123:ifeq            128
				return true;
	//   66  126:iconst_1        
	//   67  127:ireturn         

	//   68  128:iload_2         
	//   69  129:iconst_1        
	//   70  130:iadd            
	//   71  131:istore_2        
	//*  72  132:goto            110
		return false;
	//   73  135:iconst_0        
	//   74  136:ireturn         
	}

	public static boolean b(PackageInfo packageinfo)
	{
		return (packageinfo.applicationInfo.flags & 0x80) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #737 <Field ApplicationInfo PackageInfo.applicationInfo>
	//    2    4:getfield        #740 <Field int ApplicationInfo.flags>
	//    3    7:sipush          128
	//    4   10:iand            
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public static boolean b(File file)
	{
		if(file.isDirectory())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #744 <Method boolean File.isDirectory()>
	//*   2    4:ifeq            55
		{
			String as[] = file.list();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #748 <Method String[] File.list()>
	//    5   11:astore_3        
			if(as != null && as.length > 0)
	//*   6   12:aload_3         
	//*   7   13:ifnull          55
	//*   8   16:aload_3         
	//*   9   17:arraylength     
	//*  10   18:ifle            55
			{
				for(int i1 = 0; i1 < as.length; i1++)
	//*  11   21:iconst_0        
	//*  12   22:istore_1        
	//*  13   23:iload_1         
	//*  14   24:aload_3         
	//*  15   25:arraylength     
	//*  16   26:icmpge          55
					if(!b(new File(file, as[i1])))
	//*  17   29:new             #585 <Class File>
	//*  18   32:dup             
	//*  19   33:aload_0         
	//*  20   34:aload_3         
	//*  21   35:iload_1         
	//*  22   36:aaload          
	//*  23   37:invokespecial   #751 <Method void File(File, String)>
	//*  24   40:invokestatic    #753 <Method boolean b(File)>
	//*  25   43:ifne            48
						return false;
	//   26   46:iconst_0        
	//   27   47:ireturn         

	//   28   48:iload_1         
	//   29   49:iconst_1        
	//   30   50:iadd            
	//   31   51:istore_1        
			}
		}
	//*  32   52:goto            23
		boolean flag;
		try
		{
			flag = file.delete();
	//   33   55:aload_0         
	//   34   56:invokevirtual   #600 <Method boolean File.delete()>
	//   35   59:istore_2        
		}
	//*  36   60:iload_2         
	//*  37   61:ifne            66
	//*  38   64:iconst_0        
	//*  39   65:ireturn         
	//*  40   66:goto            88
		// Misplaced declaration of an exception variable
		catch(File file)
	//*  41   69:astore_0        
		{
			dho.f("CommonUtil", new Object[] {
				((Exception) (file)).getMessage()
			});
	//   42   70:ldc1            #68  <String "CommonUtil">
	//   43   72:iconst_1        
	//   44   73:anewarray       Object[]
	//   45   76:dup             
	//   46   77:iconst_0        
	//   47   78:aload_0         
	//   48   79:invokevirtual   #73  <Method String Exception.getMessage()>
	//   49   82:aastore         
	//   50   83:invokestatic    #79  <Method void dho.f(String, Object[])>
			return false;
	//   51   86:iconst_0        
	//   52   87:ireturn         
		}
		return flag;
	//   53   88:iconst_1        
	//   54   89:ireturn         
	}

	public static boolean b(String s1, long l1)
	{
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #305 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		long l2 = Long.parseLong(s1);
	//    5    9:aload_0         
	//    6   10:invokestatic    #758 <Method long Long.parseLong(String)>
	//    7   13:lstore_3        
		if(l1 < l2)
	//*   8   14:lload_1         
	//*   9   15:lload_3         
	//*  10   16:lcmp            
	//*  11   17:ifge            22
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
		s1 = ((String) (Calendar.getInstance()));
	//   14   22:invokestatic    #381 <Method Calendar Calendar.getInstance()>
	//   15   25:astore_0        
		((Calendar) (s1)).setTimeInMillis(l2);
	//   16   26:aload_0         
	//   17   27:lload_3         
	//   18   28:invokevirtual   #762 <Method void Calendar.setTimeInMillis(long)>
		Calendar calendar = Calendar.getInstance();
	//   19   31:invokestatic    #381 <Method Calendar Calendar.getInstance()>
	//   20   34:astore          5
		calendar.setTimeInMillis(l1);
	//   21   36:aload           5
	//   22   38:lload_1         
	//   23   39:invokevirtual   #762 <Method void Calendar.setTimeInMillis(long)>
		if(((Calendar) (s1)).get(5) != calendar.get(5))
	//*  24   42:aload_0         
	//*  25   43:iconst_5        
	//*  26   44:invokevirtual   #765 <Method int Calendar.get(int)>
	//*  27   47:aload           5
	//*  28   49:iconst_5        
	//*  29   50:invokevirtual   #765 <Method int Calendar.get(int)>
	//*  30   53:icmpeq          58
			return true;
	//   31   56:iconst_1        
	//   32   57:ireturn         
		if(((Calendar) (s1)).get(2) != calendar.get(2))
	//*  33   58:aload_0         
	//*  34   59:iconst_2        
	//*  35   60:invokevirtual   #765 <Method int Calendar.get(int)>
	//*  36   63:aload           5
	//*  37   65:iconst_2        
	//*  38   66:invokevirtual   #765 <Method int Calendar.get(int)>
	//*  39   69:icmpeq          74
			return true;
	//   40   72:iconst_1        
	//   41   73:ireturn         
		return ((Calendar) (s1)).get(1) != calendar.get(1);
	//   42   74:aload_0         
	//   43   75:iconst_1        
	//   44   76:invokevirtual   #765 <Method int Calendar.get(int)>
	//   45   79:aload           5
	//   46   81:iconst_1        
	//   47   82:invokevirtual   #765 <Method int Calendar.get(int)>
	//   48   85:icmpeq          90
	//   49   88:iconst_1        
	//   50   89:ireturn         
	//   51   90:iconst_0        
	//   52   91:ireturn         
	}

	private static Certificate[] b(JarFile jarfile, JarEntry jarentry)
	{
		JarFile jarfile1;
		JarFile jarfile2;
		Object obj;
		Object obj1;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		obj = null;
	//    2    3:aconst_null     
	//    3    4:astore          5
		jarfile2 = ((JarFile) (obj));
	//    4    6:aload           5
	//    5    8:astore          4
		jarfile1 = ((JarFile) (obj1));
	//    6   10:aload           6
	//    7   12:astore_3        
		byte abyte0[] = new byte[2048];
	//    8   13:sipush          2048
	//    9   16:newarray        byte[]
	//   10   18:astore          7
		jarfile2 = ((JarFile) (obj));
	//   11   20:aload           5
	//   12   22:astore          4
		jarfile1 = ((JarFile) (obj1));
	//   13   24:aload           6
	//   14   26:astore_3        
		jarfile = ((JarFile) (jarfile.getInputStream(((java.util.zip.ZipEntry) (jarentry)))));
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #772 <Method InputStream JarFile.getInputStream(java.util.zip.ZipEntry)>
	//   18   32:astore_0        
_L1:
		jarfile2 = jarfile;
	//   19   33:aload_0         
	//   20   34:astore          4
		jarfile1 = jarfile;
	//   21   36:aload_0         
	//   22   37:astore_3        
		int i1 = abyte0.length;
	//   23   38:aload           7
	//   24   40:arraylength     
	//   25   41:istore_2        
		jarfile2 = jarfile;
	//   26   42:aload_0         
	//   27   43:astore          4
		jarfile1 = jarfile;
	//   28   45:aload_0         
	//   29   46:astore_3        
		if(((InputStream) (jarfile)).read(abyte0, 0, 2048) == -1) goto _L2; else goto _L1
	//   30   47:aload_0         
	//   31   48:aload           7
	//   32   50:iconst_0        
	//   33   51:sipush          2048
	//   34   54:invokevirtual   #775 <Method int InputStream.read(byte[], int, int)>
	//   35   57:iconst_m1       
	//   36   58:icmpeq          64
	//*  37   61:goto            33
_L2:
		jarfile2 = jarfile;
	//   38   64:aload_0         
	//   39   65:astore          4
		jarfile1 = jarfile;
	//   40   67:aload_0         
	//   41   68:astore_3        
		jarentry = ((JarEntry) (jarentry.getCertificates()));
	//   42   69:aload_1         
	//   43   70:invokevirtual   #781 <Method Certificate[] JarEntry.getCertificates()>
	//   44   73:astore_1        
		if(jarfile == null)
			break MISSING_BLOCK_LABEL_120;
	//   45   74:aload_0         
	//   46   75:ifnull          120
		((InputStream) (jarfile)).close();
	//   47   78:aload_0         
	//   48   79:invokevirtual   #631 <Method void InputStream.close()>
		return ((Certificate []) (jarentry));
	//   49   82:aload_1         
	//   50   83:areturn         
		jarfile;
	//   51   84:astore_0        
		dho.f("CommonUtil", new Object[] {
			(new StringBuilder()).append("loadCertificates Exception:").append(((IOException) (jarfile)).getMessage()).toString()
		});
	//   52   85:ldc1            #68  <String "CommonUtil">
	//   53   87:iconst_1        
	//   54   88:anewarray       Object[]
	//   55   91:dup             
	//   56   92:iconst_0        
	//   57   93:new             #120 <Class StringBuilder>
	//   58   96:dup             
	//   59   97:invokespecial   #121 <Method void StringBuilder()>
	//   60  100:ldc2            #646 <String "loadCertificates Exception:">
	//   61  103:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   62  106:aload_0         
	//   63  107:invokevirtual   #647 <Method String IOException.getMessage()>
	//   64  110:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   65  113:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   66  116:aastore         
	//   67  117:invokestatic    #79  <Method void dho.f(String, Object[])>
		return ((Certificate []) (jarentry));
	//   68  120:aload_1         
	//   69  121:areturn         
		jarfile;
	//   70  122:astore_0        
		jarfile1 = jarfile2;
	//   71  123:aload           4
	//   72  125:astore_3        
		dho.f("CommonUtil", new Object[] {
			(new StringBuilder()).append("loadCertificates Exception:").append(((IOException) (jarfile)).getMessage()).toString()
		});
	//   73  126:ldc1            #68  <String "CommonUtil">
	//   74  128:iconst_1        
	//   75  129:anewarray       Object[]
	//   76  132:dup             
	//   77  133:iconst_0        
	//   78  134:new             #120 <Class StringBuilder>
	//   79  137:dup             
	//   80  138:invokespecial   #121 <Method void StringBuilder()>
	//   81  141:ldc2            #646 <String "loadCertificates Exception:">
	//   82  144:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   83  147:aload_0         
	//   84  148:invokevirtual   #647 <Method String IOException.getMessage()>
	//   85  151:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   86  154:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   87  157:aastore         
	//   88  158:invokestatic    #79  <Method void dho.f(String, Object[])>
		if(jarfile2 != null)
	//*  89  161:aload           4
	//*  90  163:ifnull          263
			try
			{
				((InputStream) (jarfile2)).close();
	//   91  166:aload           4
	//   92  168:invokevirtual   #631 <Method void InputStream.close()>
			}
	//*  93  171:goto            263
			// Misplaced declaration of an exception variable
			catch(JarFile jarfile)
	//*  94  174:astore_0        
			{
				dho.f("CommonUtil", new Object[] {
					(new StringBuilder()).append("loadCertificates Exception:").append(((IOException) (jarfile)).getMessage()).toString()
				});
	//   95  175:ldc1            #68  <String "CommonUtil">
	//   96  177:iconst_1        
	//   97  178:anewarray       Object[]
	//   98  181:dup             
	//   99  182:iconst_0        
	//  100  183:new             #120 <Class StringBuilder>
	//  101  186:dup             
	//  102  187:invokespecial   #121 <Method void StringBuilder()>
	//  103  190:ldc2            #646 <String "loadCertificates Exception:">
	//  104  193:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  105  196:aload_0         
	//  106  197:invokevirtual   #647 <Method String IOException.getMessage()>
	//  107  200:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  108  203:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  109  206:aastore         
	//  110  207:invokestatic    #79  <Method void dho.f(String, Object[])>
			}
		break MISSING_BLOCK_LABEL_263;
	//  111  210:goto            263
		jarfile;
	//  112  213:astore_0        
		if(jarfile1 != null)
	//* 113  214:aload_3         
	//* 114  215:ifnull          261
			try
			{
				((InputStream) (jarfile1)).close();
	//  115  218:aload_3         
	//  116  219:invokevirtual   #631 <Method void InputStream.close()>
			}
	//* 117  222:goto            261
			// Misplaced declaration of an exception variable
			catch(JarEntry jarentry)
	//* 118  225:astore_1        
			{
				dho.f("CommonUtil", new Object[] {
					(new StringBuilder()).append("loadCertificates Exception:").append(((IOException) (jarentry)).getMessage()).toString()
				});
	//  119  226:ldc1            #68  <String "CommonUtil">
	//  120  228:iconst_1        
	//  121  229:anewarray       Object[]
	//  122  232:dup             
	//  123  233:iconst_0        
	//  124  234:new             #120 <Class StringBuilder>
	//  125  237:dup             
	//  126  238:invokespecial   #121 <Method void StringBuilder()>
	//  127  241:ldc2            #646 <String "loadCertificates Exception:">
	//  128  244:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  129  247:aload_1         
	//  130  248:invokevirtual   #647 <Method String IOException.getMessage()>
	//  131  251:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  132  254:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  133  257:aastore         
	//  134  258:invokestatic    #79  <Method void dho.f(String, Object[])>
			}
		throw jarfile;
	//  135  261:aload_0         
	//  136  262:athrow          
		return null;
	//  137  263:aconst_null     
	//  138  264:areturn         
	}

	public static int c(String s1, int i1)
	{
		if(s1 == null || s1.trim().length() == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #321 <Method String String.trim()>
	//*   4    8:invokevirtual   #308 <Method int String.length()>
	//*   5   11:ifne            16
			return i1;
	//    6   14:iload_1         
	//    7   15:ireturn         
		s1 = s1.trim();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #321 <Method String String.trim()>
	//   10   20:astore_0        
		int j1;
		try
		{
			j1 = Integer.parseInt(s1);
	//   11   21:aload_0         
	//   12   22:invokestatic    #786 <Method int Integer.parseInt(String)>
	//   13   25:istore_2        
		}
	//*  14   26:iload_2         
	//*  15   27:ireturn         
		catch(Exception exception)
	//*  16   28:astore_3        
		{
			dho.f("CommonUtil", new Object[] {
				(new StringBuilder()).append("getInteger()->Integer.valueOf(").append(s1).append(") Exception=").append(exception.getMessage()).toString()
			});
	//   17   29:ldc1            #68  <String "CommonUtil">
	//   18   31:iconst_1        
	//   19   32:anewarray       Object[]
	//   20   35:dup             
	//   21   36:iconst_0        
	//   22   37:new             #120 <Class StringBuilder>
	//   23   40:dup             
	//   24   41:invokespecial   #121 <Method void StringBuilder()>
	//   25   44:ldc2            #788 <String "getInteger()->Integer.valueOf(">
	//   26   47:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   27   50:aload_0         
	//   28   51:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   29   54:ldc2            #790 <String ") Exception=">
	//   30   57:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   31   60:aload_3         
	//   32   61:invokevirtual   #73  <Method String Exception.getMessage()>
	//   33   64:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   34   67:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   35   70:aastore         
	//   36   71:invokestatic    #79  <Method void dho.f(String, Object[])>
			int k1;
			try
			{
				k1 = Float.valueOf(Float.parseFloat(s1)).intValue();
	//   37   74:aload_0         
	//   38   75:invokestatic    #796 <Method float Float.parseFloat(String)>
	//   39   78:invokestatic    #799 <Method Float Float.valueOf(float)>
	//   40   81:invokevirtual   #802 <Method int Float.intValue()>
	//   41   84:istore_2        
			}
	//*  42   85:iload_2         
	//*  43   86:ireturn         
			catch(Exception exception1)
	//*  44   87:astore_3        
			{
				dho.f("CommonUtil", new Object[] {
					(new StringBuilder()).append("getInteger()->Float.valueOf(").append(s1).append(") Exception=").append(exception1.getMessage()).toString()
				});
	//   45   88:ldc1            #68  <String "CommonUtil">
	//   46   90:iconst_1        
	//   47   91:anewarray       Object[]
	//   48   94:dup             
	//   49   95:iconst_0        
	//   50   96:new             #120 <Class StringBuilder>
	//   51   99:dup             
	//   52  100:invokespecial   #121 <Method void StringBuilder()>
	//   53  103:ldc2            #804 <String "getInteger()->Float.valueOf(">
	//   54  106:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   55  109:aload_0         
	//   56  110:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   57  113:ldc2            #790 <String ") Exception=">
	//   58  116:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   59  119:aload_3         
	//   60  120:invokevirtual   #73  <Method String Exception.getMessage()>
	//   61  123:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   62  126:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   63  129:aastore         
	//   64  130:invokestatic    #79  <Method void dho.f(String, Object[])>
				return i1;
	//   65  133:iload_1         
	//   66  134:ireturn         
			}
			return k1;
		}
		return j1;
	}

	public static Object c(String s1, String s2, Class aclass[], Object aobj[])
	{
		Method method;
		Object obj;
		Object obj1;
		if(aclass == null || aobj == null || aclass.length != aobj.length)
	//*   0    0:aload_2         
	//*   1    1:ifnull          15
	//*   2    4:aload_3         
	//*   3    5:ifnull          15
	//*   4    8:aload_2         
	//*   5    9:arraylength     
	//*   6   10:aload_3         
	//*   7   11:arraylength     
	//*   8   12:icmpeq          32
		{
			dho.d("CommonUtil", new Object[] {
				"invokeFun params invalid"
			});
	//    9   15:ldc1            #68  <String "CommonUtil">
	//   10   17:iconst_1        
	//   11   18:anewarray       Object[]
	//   12   21:dup             
	//   13   22:iconst_0        
	//   14   23:ldc2            #808 <String "invokeFun params invalid">
	//   15   26:aastore         
	//   16   27:invokestatic    #325 <Method void dho.d(String, Object[])>
			return ((Object) (null));
	//   17   30:aconst_null     
	//   18   31:areturn         
		}
		obj1 = k(s1);
	//   19   32:aload_0         
	//   20   33:invokestatic    #811 <Method Object k(String)>
	//   21   36:astore          7
		if(obj1 == null)
	//*  22   38:aload           7
	//*  23   40:ifnonnull       45
			return ((Object) (null));
	//   24   43:aconst_null     
	//   25   44:areturn         
		obj = null;
	//   26   45:aconst_null     
	//   27   46:astore          5
		method = null;
	//   28   48:aconst_null     
	//   29   49:astore          4
		Class class1 = Class.forName(s1);
	//   30   51:aload_0         
	//   31   52:invokestatic    #480 <Method Class Class.forName(String)>
	//   32   55:astore          6
		s1 = ((String) (class1));
	//   33   57:aload           6
	//   34   59:astore_0        
		break MISSING_BLOCK_LABEL_100;
	//   35   60:goto            100
		ClassNotFoundException classnotfoundexception;
		classnotfoundexception;
	//   36   63:astore          6
		dho.f("CommonUtil", new Object[] {
			(new StringBuilder()).append("can not find class:").append(s1).toString()
		});
	//   37   65:ldc1            #68  <String "CommonUtil">
	//   38   67:iconst_1        
	//   39   68:anewarray       Object[]
	//   40   71:dup             
	//   41   72:iconst_0        
	//   42   73:new             #120 <Class StringBuilder>
	//   43   76:dup             
	//   44   77:invokespecial   #121 <Method void StringBuilder()>
	//   45   80:ldc2            #813 <String "can not find class:">
	//   46   83:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   47   86:aload_0         
	//   48   87:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   49   90:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   50   93:aastore         
	//   51   94:invokestatic    #79  <Method void dho.f(String, Object[])>
		s1 = ((String) (method));
	//   52   97:aload           4
	//   53   99:astore_0        
		method = ((Method) (obj));
	//   54  100:aload           5
	//   55  102:astore          4
		if(s1 != null)
	//*  56  104:aload_0         
	//*  57  105:ifnull          156
			try
			{
				method = ((Class) (s1)).getMethod(s2, aclass);
	//   58  108:aload_0         
	//   59  109:aload_1         
	//   60  110:aload_2         
	//   61  111:invokevirtual   #816 <Method Method Class.getMethod(String, Class[])>
	//   62  114:astore          4
			}
	//*  63  116:goto            156
			// Misplaced declaration of an exception variable
			catch(String s1)
	//*  64  119:astore_0        
			{
				dho.f("CommonUtil", new Object[] {
					(new StringBuilder()).append("can not find method:").append(s2).toString()
				});
	//   65  120:ldc1            #68  <String "CommonUtil">
	//   66  122:iconst_1        
	//   67  123:anewarray       Object[]
	//   68  126:dup             
	//   69  127:iconst_0        
	//   70  128:new             #120 <Class StringBuilder>
	//   71  131:dup             
	//   72  132:invokespecial   #121 <Method void StringBuilder()>
	//   73  135:ldc2            #818 <String "can not find method:">
	//   74  138:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   75  141:aload_1         
	//   76  142:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   77  145:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   78  148:aastore         
	//   79  149:invokestatic    #79  <Method void dho.f(String, Object[])>
				method = ((Method) (obj));
	//   80  152:aload           5
	//   81  154:astore          4
			}
		if(method == null)
			break MISSING_BLOCK_LABEL_286;
	//   82  156:aload           4
	//   83  158:ifnull          286
		s1 = ((String) (method.invoke(obj1, aobj)));
	//   84  161:aload           4
	//   85  163:aload           7
	//   86  165:aload_3         
	//   87  166:invokevirtual   #508 <Method Object Method.invoke(Object, Object[])>
	//   88  169:astore_0        
		return ((Object) (s1));
	//   89  170:aload_0         
	//   90  171:areturn         
		s1;
	//   91  172:astore_0        
		dho.f("CommonUtil", new Object[] {
			(new StringBuilder()).append("method can not invoke:").append(((IllegalAccessException) (s1)).getMessage()).toString()
		});
	//   92  173:ldc1            #68  <String "CommonUtil">
	//   93  175:iconst_1        
	//   94  176:anewarray       Object[]
	//   95  179:dup             
	//   96  180:iconst_0        
	//   97  181:new             #120 <Class StringBuilder>
	//   98  184:dup             
	//   99  185:invokespecial   #121 <Method void StringBuilder()>
	//  100  188:ldc2            #820 <String "method can not invoke:">
	//  101  191:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  102  194:aload_0         
	//  103  195:invokevirtual   #534 <Method String IllegalAccessException.getMessage()>
	//  104  198:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  105  201:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  106  204:aastore         
	//  107  205:invokestatic    #79  <Method void dho.f(String, Object[])>
		break MISSING_BLOCK_LABEL_286;
	//  108  208:goto            286
		s1;
	//  109  211:astore_0        
		dho.f("CommonUtil", new Object[] {
			(new StringBuilder()).append("method can not invoke:").append(((IllegalArgumentException) (s1)).getMessage()).toString()
		});
	//  110  212:ldc1            #68  <String "CommonUtil">
	//  111  214:iconst_1        
	//  112  215:anewarray       Object[]
	//  113  218:dup             
	//  114  219:iconst_0        
	//  115  220:new             #120 <Class StringBuilder>
	//  116  223:dup             
	//  117  224:invokespecial   #121 <Method void StringBuilder()>
	//  118  227:ldc2            #820 <String "method can not invoke:">
	//  119  230:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  120  233:aload_0         
	//  121  234:invokevirtual   #821 <Method String IllegalArgumentException.getMessage()>
	//  122  237:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  123  240:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  124  243:aastore         
	//  125  244:invokestatic    #79  <Method void dho.f(String, Object[])>
		break MISSING_BLOCK_LABEL_286;
	//  126  247:goto            286
		s1;
	//  127  250:astore_0        
		dho.f("CommonUtil", new Object[] {
			(new StringBuilder()).append("method can not invoke:").append(((InvocationTargetException) (s1)).getMessage()).toString()
		});
	//  128  251:ldc1            #68  <String "CommonUtil">
	//  129  253:iconst_1        
	//  130  254:anewarray       Object[]
	//  131  257:dup             
	//  132  258:iconst_0        
	//  133  259:new             #120 <Class StringBuilder>
	//  134  262:dup             
	//  135  263:invokespecial   #121 <Method void StringBuilder()>
	//  136  266:ldc2            #820 <String "method can not invoke:">
	//  137  269:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  138  272:aload_0         
	//  139  273:invokevirtual   #533 <Method String InvocationTargetException.getMessage()>
	//  140  276:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  141  279:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  142  282:aastore         
	//  143  283:invokestatic    #79  <Method void dho.f(String, Object[])>
		return ((Object) (null));
	//  144  286:aconst_null     
	//  145  287:areturn         
	}

	public static String c()
	{
		return c;
	//    0    0:getstatic       #26  <Field String c>
	//    1    3:areturn         
	}

	private static void c(Context context, String s1, String s2)
	{
		s1 = ((String) (new Intent(s1)));
	//    0    0:new             #824 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #825 <Method void Intent(String)>
	//    4    8:astore_1        
		((Intent) (s1)).setPackage("com.huawei.health");
	//    5    9:aload_1         
	//    6   10:ldc2            #403 <String "com.huawei.health">
	//    7   13:invokevirtual   #829 <Method Intent Intent.setPackage(String)>
	//    8   16:pop             
		((Intent) (s1)).putExtra("update_state", s2);
	//    9   17:aload_1         
	//   10   18:ldc2            #831 <String "update_state">
	//   11   21:aload_2         
	//   12   22:invokevirtual   #835 <Method Intent Intent.putExtra(String, String)>
	//   13   25:pop             
		context.sendBroadcast(((Intent) (s1)), "com.huawei.health.INTERNAL_PERMISSION");
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:ldc2            #346 <String "com.huawei.health.INTERNAL_PERMISSION">
	//   17   31:invokevirtual   #839 <Method void Context.sendBroadcast(Intent, String)>
	//   18   34:return          
	}

	public static void c(Intent intent, Context context)
	{
		if(!e("com.huawei.hwservicesmgr.PhoneService", context))
	//*   0    0:ldc2            #842 <String "com.huawei.hwservicesmgr.PhoneService">
	//*   1    3:aload_1         
	//*   2    4:invokestatic    #845 <Method boolean e(String, Context)>
	//*   3    7:ifne            32
		{
			context.startService(intent);
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:invokevirtual   #849 <Method ComponentName Context.startService(Intent)>
	//    7   15:pop             
			dho.b("CommonUtil", new Object[] {
				"startService to handleIntent - PhoneService"
			});
	//    8   16:ldc1            #68  <String "CommonUtil">
	//    9   18:iconst_1        
	//   10   19:anewarray       Object[]
	//   11   22:dup             
	//   12   23:iconst_0        
	//   13   24:ldc2            #851 <String "startService to handleIntent - PhoneService">
	//   14   27:aastore         
	//   15   28:invokestatic    #133 <Method void dho.b(String, Object[])>
			return;
	//   16   31:return          
		} else
		{
			dho.b("CommonUtil", new Object[] {
				"PhoneService was running..........don't need start"
			});
	//   17   32:ldc1            #68  <String "CommonUtil">
	//   18   34:iconst_1        
	//   19   35:anewarray       Object[]
	//   20   38:dup             
	//   21   39:iconst_0        
	//   22   40:ldc2            #853 <String "PhoneService was running..........don't need start">
	//   23   43:aastore         
	//   24   44:invokestatic    #133 <Method void dho.b(String, Object[])>
			return;
	//   25   47:return          
		}
	}

	public static void c(String s1)
	{
		e = s1;
	//    0    0:aload_0         
	//    1    1:putstatic       #24  <Field String e>
	//    2    4:return          
	}

	public static boolean c(Context context)
	{
		dho.b("CommonUtil", new Object[] {
			"getIfInEUAccountArea() enter"
		});
	//    0    0:ldc1            #68  <String "CommonUtil">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc2            #720 <String "getIfInEUAccountArea() enter">
	//    6   11:aastore         
	//    7   12:invokestatic    #133 <Method void dho.b(String, Object[])>
		context = ((Context) (context.getResources().getStringArray(com.huawei.hwcommonmodel.R.array.eu_national_code)));
	//    8   15:aload_0         
	//    9   16:invokevirtual   #279 <Method Resources Context.getResources()>
	//   10   19:getstatic       #723 <Field int com.huawei.hwcommonmodel.R$array.eu_national_code>
	//   11   22:invokevirtual   #290 <Method String[] Resources.getStringArray(int)>
	//   12   25:astore_0        
		if(context == null || context.length < 1)
	//*  13   26:aload_0         
	//*  14   27:ifnull          36
	//*  15   30:aload_0         
	//*  16   31:arraylength     
	//*  17   32:iconst_1        
	//*  18   33:icmpge          53
		{
			dho.f("CommonUtil", new Object[] {
				"getIfInEUAccountArea() if (countryList == null || countryList.length < 1)"
			});
	//   19   36:ldc1            #68  <String "CommonUtil">
	//   20   38:iconst_1        
	//   21   39:anewarray       Object[]
	//   22   42:dup             
	//   23   43:iconst_0        
	//   24   44:ldc2            #725 <String "getIfInEUAccountArea() if (countryList == null || countryList.length < 1)">
	//   25   47:aastore         
	//   26   48:invokestatic    #79  <Method void dho.f(String, Object[])>
			return false;
	//   27   51:iconst_0        
	//   28   52:ireturn         
		}
		String s1 = Locale.getDefault().getCountry();
	//   29   53:invokestatic    #729 <Method Locale Locale.getDefault()>
	//   30   56:invokevirtual   #563 <Method String Locale.getCountry()>
	//   31   59:astore_3        
		dho.b("CommonUtil", new Object[] {
			(new StringBuilder()).append("getIfInEUAccountArea() country=").append(s1).toString()
		});
	//   32   60:ldc1            #68  <String "CommonUtil">
	//   33   62:iconst_1        
	//   34   63:anewarray       Object[]
	//   35   66:dup             
	//   36   67:iconst_0        
	//   37   68:new             #120 <Class StringBuilder>
	//   38   71:dup             
	//   39   72:invokespecial   #121 <Method void StringBuilder()>
	//   40   75:ldc2            #731 <String "getIfInEUAccountArea() country=">
	//   41   78:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   42   81:aload_3         
	//   43   82:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   44   85:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   45   88:aastore         
	//   46   89:invokestatic    #133 <Method void dho.b(String, Object[])>
		int j1 = context.length;
	//   47   92:aload_0         
	//   48   93:arraylength     
	//   49   94:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*  50   95:iconst_0        
	//*  51   96:istore_1        
	//*  52   97:iload_1         
	//*  53   98:iload_2         
	//*  54   99:icmpge          121
			if(s1.equalsIgnoreCase(((String) (context[i1]))))
	//*  55  102:aload_3         
	//*  56  103:aload_0         
	//*  57  104:iload_1         
	//*  58  105:aaload          
	//*  59  106:invokevirtual   #56  <Method boolean String.equalsIgnoreCase(String)>
	//*  60  109:ifeq            114
				return true;
	//   61  112:iconst_1        
	//   62  113:ireturn         

	//   63  114:iload_1         
	//   64  115:iconst_1        
	//   65  116:iadd            
	//   66  117:istore_1        
	//*  67  118:goto            97
		return false;
	//   68  121:iconst_0        
	//   69  122:ireturn         
	}

	public static boolean c(Context context, String s1)
	{
		dho.b("CommonUtil", new Object[] {
			(new StringBuilder()).append("judgeIsCNAndEU() enter: ").append(s1).toString()
		});
	//    0    0:ldc1            #68  <String "CommonUtil">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:new             #120 <Class StringBuilder>
	//    6   11:dup             
	//    7   12:invokespecial   #121 <Method void StringBuilder()>
	//    8   15:ldc2            #855 <String "judgeIsCNAndEU() enter: ">
	//    9   18:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   10   21:aload_1         
	//   11   22:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   13   28:aastore         
	//   14   29:invokestatic    #133 <Method void dho.b(String, Object[])>
		if("cn".equalsIgnoreCase(s1))
	//*  15   32:ldc2            #574 <String "cn">
	//*  16   35:aload_1         
	//*  17   36:invokevirtual   #56  <Method boolean String.equalsIgnoreCase(String)>
	//*  18   39:ifeq            44
			return true;
	//   19   42:iconst_1        
	//   20   43:ireturn         
		context = ((Context) (context.getApplicationContext().getResources().getStringArray(com.huawei.hwcommonmodel.R.array.eu_national_code)));
	//   21   44:aload_0         
	//   22   45:invokevirtual   #232 <Method Context Context.getApplicationContext()>
	//   23   48:invokevirtual   #279 <Method Resources Context.getResources()>
	//   24   51:getstatic       #723 <Field int com.huawei.hwcommonmodel.R$array.eu_national_code>
	//   25   54:invokevirtual   #290 <Method String[] Resources.getStringArray(int)>
	//   26   57:astore_0        
		if(context == null || context.length < 1)
	//*  27   58:aload_0         
	//*  28   59:ifnull          68
	//*  29   62:aload_0         
	//*  30   63:arraylength     
	//*  31   64:iconst_1        
	//*  32   65:icmpge          85
		{
			dho.f("CommonUtil", new Object[] {
				"getIfInEUAccountArea() if (countryList == null || countryList.length < 1)"
			});
	//   33   68:ldc1            #68  <String "CommonUtil">
	//   34   70:iconst_1        
	//   35   71:anewarray       Object[]
	//   36   74:dup             
	//   37   75:iconst_0        
	//   38   76:ldc2            #725 <String "getIfInEUAccountArea() if (countryList == null || countryList.length < 1)">
	//   39   79:aastore         
	//   40   80:invokestatic    #79  <Method void dho.f(String, Object[])>
			return false;
	//   41   83:iconst_0        
	//   42   84:ireturn         
		}
		dho.b("CommonUtil", new Object[] {
			(new StringBuilder()).append("getIfInEUAccountArea() country=").append(s1).toString()
		});
	//   43   85:ldc1            #68  <String "CommonUtil">
	//   44   87:iconst_1        
	//   45   88:anewarray       Object[]
	//   46   91:dup             
	//   47   92:iconst_0        
	//   48   93:new             #120 <Class StringBuilder>
	//   49   96:dup             
	//   50   97:invokespecial   #121 <Method void StringBuilder()>
	//   51  100:ldc2            #731 <String "getIfInEUAccountArea() country=">
	//   52  103:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   53  106:aload_1         
	//   54  107:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   55  110:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   56  113:aastore         
	//   57  114:invokestatic    #133 <Method void dho.b(String, Object[])>
		int j1 = context.length;
	//   58  117:aload_0         
	//   59  118:arraylength     
	//   60  119:istore_3        
		for(int i1 = 0; i1 < j1; i1++)
	//*  61  120:iconst_0        
	//*  62  121:istore_2        
	//*  63  122:iload_2         
	//*  64  123:iload_3         
	//*  65  124:icmpge          146
			if(s1.equalsIgnoreCase(((String) (context[i1]))))
	//*  66  127:aload_1         
	//*  67  128:aload_0         
	//*  68  129:iload_2         
	//*  69  130:aaload          
	//*  70  131:invokevirtual   #56  <Method boolean String.equalsIgnoreCase(String)>
	//*  71  134:ifeq            139
				return true;
	//   72  137:iconst_1        
	//   73  138:ireturn         

	//   74  139:iload_2         
	//   75  140:iconst_1        
	//   76  141:iadd            
	//   77  142:istore_2        
	//*  78  143:goto            122
		return false;
	//   79  146:iconst_0        
	//   80  147:ireturn         
	}

	public static boolean c(File file, String s1)
		throws IOException
	{
		if(file.getCanonicalPath().startsWith(Normalizer.normalize(((CharSequence) ((new File(s1)).getCanonicalPath())), java.text.Normalizer.Form.NFKC)))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #859 <Method String File.getCanonicalPath()>
	//*   2    4:new             #585 <Class File>
	//*   3    7:dup             
	//*   4    8:aload_1         
	//*   5    9:invokespecial   #587 <Method void File(String)>
	//*   6   12:invokevirtual   #859 <Method String File.getCanonicalPath()>
	//*   7   15:getstatic       #865 <Field java.text.Normalizer$Form java.text.Normalizer$Form.NFKC>
	//*   8   18:invokestatic    #871 <Method String Normalizer.normalize(CharSequence, java.text.Normalizer$Form)>
	//*   9   21:invokevirtual   #874 <Method boolean String.startsWith(String)>
	//*  10   24:ifeq            29
		{
			return true;
	//   11   27:iconst_1        
	//   12   28:ireturn         
		} else
		{
			dho.f("CommonUtil", new Object[] {
				"File is outside extraction target directory."
			});
	//   13   29:ldc1            #68  <String "CommonUtil">
	//   14   31:iconst_1        
	//   15   32:anewarray       Object[]
	//   16   35:dup             
	//   17   36:iconst_0        
	//   18   37:ldc2            #876 <String "File is outside extraction target directory.">
	//   19   40:aastore         
	//   20   41:invokestatic    #79  <Method void dho.f(String, Object[])>
			return false;
	//   21   44:iconst_0        
	//   22   45:ireturn         
		}
	}

	private static int d(int i1)
	{
		Log.d("CommonUtil", "getNetworkClassByType-start");
	//    0    0:ldc1            #68  <String "CommonUtil">
	//    1    2:ldc2            #878 <String "getNetworkClassByType-start">
	//    2    5:invokestatic    #883 <Method int Log.d(String, String)>
	//    3    8:pop             
		switch(i1)
	//*   4    9:iload_0         
		{
	//*   5   10:tableswitch     1 15: default 84
	//	               1 87
	//	               2 87
	//	               3 92
	//	               4 87
	//	               5 92
	//	               6 92
	//	               7 87
	//	               8 92
	//	               9 92
	//	               10 92
	//	               11 87
	//	               12 92
	//	               13 97
	//	               14 92
	//	               15 92
	//*   6   84:goto            102
		case 1: // '\001'
		case 2: // '\002'
		case 4: // '\004'
		case 7: // '\007'
		case 11: // '\013'
			i1 = 2;
	//    7   87:iconst_2        
	//    8   88:istore_0        
			break;

	//*   9   89:goto            104
		case 3: // '\003'
		case 5: // '\005'
		case 6: // '\006'
		case 8: // '\b'
		case 9: // '\t'
		case 10: // '\n'
		case 12: // '\f'
		case 14: // '\016'
		case 15: // '\017'
			i1 = 3;
	//   10   92:iconst_3        
	//   11   93:istore_0        
			break;

	//*  12   94:goto            104
		case 13: // '\r'
			i1 = 4;
	//   13   97:iconst_4        
	//   14   98:istore_0        
			break;

	//*  15   99:goto            104
		default:
			i1 = -1;
	//   16  102:iconst_m1       
	//   17  103:istore_0        
			break;
		}
		Log.d("CommonUtil", "getNetworkClassByType-start");
	//   18  104:ldc1            #68  <String "CommonUtil">
	//   19  106:ldc2            #878 <String "getNetworkClassByType-start">
	//   20  109:invokestatic    #883 <Method int Log.d(String, String)>
	//   21  112:pop             
		return i1;
	//   22  113:iload_0         
	//   23  114:ireturn         
	}

	public static int d(Context context, String s1, int i1)
	{
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #305 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            24
		{
			dho.d("CommonUtil", new Object[] {
				"stringToInt str is empty"
			});
	//    3    7:ldc1            #68  <String "CommonUtil">
	//    4    9:iconst_1        
	//    5   10:anewarray       Object[]
	//    6   13:dup             
	//    7   14:iconst_0        
	//    8   15:ldc2            #888 <String "stringToInt str is empty">
	//    9   18:aastore         
	//   10   19:invokestatic    #325 <Method void dho.d(String, Object[])>
			return i1;
	//   11   22:iload_2         
	//   12   23:ireturn         
		}
		context = ((Context) (s1));
	//   13   24:aload_1         
	//   14   25:astore_0        
		int j1;
		try
		{
			if(s1.indexOf(".") > 0)
	//*  15   26:aload_1         
	//*  16   27:ldc2            #890 <String ".">
	//*  17   30:invokevirtual   #893 <Method int String.indexOf(String)>
	//*  18   33:ifle            49
				context = ((Context) (s1.substring(0, s1.indexOf("."))));
	//   19   36:aload_1         
	//   20   37:iconst_0        
	//   21   38:aload_1         
	//   22   39:ldc2            #890 <String ".">
	//   23   42:invokevirtual   #893 <Method int String.indexOf(String)>
	//   24   45:invokevirtual   #312 <Method String String.substring(int, int)>
	//   25   48:astore_0        
			j1 = Integer.parseInt(((String) (context)));
	//   26   49:aload_0         
	//   27   50:invokestatic    #786 <Method int Integer.parseInt(String)>
	//   28   53:istore_3        
		}
	//*  29   54:iload_3         
	//*  30   55:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  31   56:astore_0        
		{
			dho.f("CommonUtil", new Object[] {
				(new StringBuilder()).append("Exception e = ").append(((NumberFormatException) (context)).getMessage()).toString()
			});
	//   32   57:ldc1            #68  <String "CommonUtil">
	//   33   59:iconst_1        
	//   34   60:anewarray       Object[]
	//   35   63:dup             
	//   36   64:iconst_0        
	//   37   65:new             #120 <Class StringBuilder>
	//   38   68:dup             
	//   39   69:invokespecial   #121 <Method void StringBuilder()>
	//   40   72:ldc2            #895 <String "Exception e = ">
	//   41   75:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   42   78:aload_0         
	//   43   79:invokevirtual   #896 <Method String NumberFormatException.getMessage()>
	//   44   82:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   45   85:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   46   88:aastore         
	//   47   89:invokestatic    #79  <Method void dho.f(String, Object[])>
			return i1;
	//   48   92:iload_2         
	//   49   93:ireturn         
		}
		return j1;
	}

	private static Object d(Class class1, String s1, Class aclass[], Object aobj[])
		throws Exception
	{
		dho.b("CommonUtil", new Object[] {
			"Enter staticFun with class"
		});
	//    0    0:ldc1            #68  <String "CommonUtil">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc2            #898 <String "Enter staticFun with class">
	//    6   11:aastore         
	//    7   12:invokestatic    #133 <Method void dho.b(String, Object[])>
		b(class1, aclass, aobj);
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:aload_3         
	//   11   18:invokestatic    #900 <Method void b(Class, Class[], Object[])>
		class1 = ((Class) (class1.getMethod(s1, aclass)));
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:aload_2         
	//   15   24:invokevirtual   #816 <Method Method Class.getMethod(String, Class[])>
	//   16   27:astore_0        
		class1 = ((Class) (((Method) (class1)).invoke(((Object) (null)), aobj)));
	//   17   28:aload_0         
	//   18   29:aconst_null     
	//   19   30:aload_3         
	//   20   31:invokevirtual   #508 <Method Object Method.invoke(Object, Object[])>
	//   21   34:astore_0        
		return ((Object) (class1));
	//   22   35:aload_0         
	//   23   36:areturn         
		class1;
	//   24   37:astore_0        
		try
		{
			dho.c("CommonUtil", new Object[] {
				((IllegalAccessException) (class1)).getMessage()
			});
	//   25   38:ldc1            #68  <String "CommonUtil">
	//   26   40:iconst_1        
	//   27   41:anewarray       Object[]
	//   28   44:dup             
	//   29   45:iconst_0        
	//   30   46:aload_0         
	//   31   47:invokevirtual   #534 <Method String IllegalAccessException.getMessage()>
	//   32   50:aastore         
	//   33   51:invokestatic    #486 <Method void dho.c(String, Object[])>
		}
	//*  34   54:goto            94
	//*  35   57:astore_0        
	//*  36   58:ldc1            #68  <String "CommonUtil">
	//*  37   60:iconst_1        
	//*  38   61:anewarray       Object[]
	//*  39   64:dup             
	//*  40   65:iconst_0        
	//*  41   66:aload_0         
	//*  42   67:invokevirtual   #821 <Method String IllegalArgumentException.getMessage()>
	//*  43   70:aastore         
	//*  44   71:invokestatic    #486 <Method void dho.c(String, Object[])>
	//*  45   74:goto            94
	//*  46   77:astore_0        
	//*  47   78:ldc1            #68  <String "CommonUtil">
	//*  48   80:iconst_1        
	//*  49   81:anewarray       Object[]
	//*  50   84:dup             
	//*  51   85:iconst_0        
	//*  52   86:aload_0         
	//*  53   87:invokevirtual   #533 <Method String InvocationTargetException.getMessage()>
	//*  54   90:aastore         
	//*  55   91:invokestatic    #486 <Method void dho.c(String, Object[])>
	//*  56   94:goto            134
		// Misplaced declaration of an exception variable
		catch(Class class1)
	//*  57   97:astore_0        
		{
			dho.c("CommonUtil", new Object[] {
				((NoSuchMethodException) (class1)).getMessage()
			});
	//   58   98:ldc1            #68  <String "CommonUtil">
	//   59  100:iconst_1        
	//   60  101:anewarray       Object[]
	//   61  104:dup             
	//   62  105:iconst_0        
	//   63  106:aload_0         
	//   64  107:invokevirtual   #532 <Method String NoSuchMethodException.getMessage()>
	//   65  110:aastore         
	//   66  111:invokestatic    #486 <Method void dho.c(String, Object[])>
		}
	//*  67  114:goto            134
		// Misplaced declaration of an exception variable
		catch(Class class1)
	//*  68  117:astore_0        
		{
			dho.f("CommonUtil", new Object[] {
				((Exception) (class1)).getMessage()
			});
	//   69  118:ldc1            #68  <String "CommonUtil">
	//   70  120:iconst_1        
	//   71  121:anewarray       Object[]
	//   72  124:dup             
	//   73  125:iconst_0        
	//   74  126:aload_0         
	//   75  127:invokevirtual   #73  <Method String Exception.getMessage()>
	//   76  130:aastore         
	//   77  131:invokestatic    #79  <Method void dho.f(String, Object[])>
		}
		break MISSING_BLOCK_LABEL_134;
		class1;
		dho.c("CommonUtil", new Object[] {
			((IllegalArgumentException) (class1)).getMessage()
		});
		break MISSING_BLOCK_LABEL_134;
		class1;
		dho.c("CommonUtil", new Object[] {
			((InvocationTargetException) (class1)).getMessage()
		});
		return ((Object) (null));
	//   78  134:aconst_null     
	//   79  135:areturn         
	}

	public static void d(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       20
		{
			dho.e("CommonUtil", new Object[] {
				"init context null,init failed,return"
			});
	//    2    4:ldc1            #68  <String "CommonUtil">
	//    3    6:iconst_1        
	//    4    7:anewarray       Object[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:ldc2            #902 <String "init context null,init failed,return">
	//    8   15:aastore         
	//    9   16:invokestatic    #660 <Method void dho.e(String, Object[])>
			return;
	//   10   19:return          
		} else
		{
			G(context);
	//   11   20:aload_0         
	//   12   21:invokestatic    #904 <Method void G(Context)>
			return;
	//   13   24:return          
		}
	}

	public static void d(Context context, String s1)
	{
		dho.b("CommonUtil", new Object[] {
			"sendUpdateAreaBroadcast"
		});
	//    0    0:ldc1            #68  <String "CommonUtil">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc2            #537 <String "sendUpdateAreaBroadcast">
	//    6   11:aastore         
	//    7   12:invokestatic    #133 <Method void dho.b(String, Object[])>
		c(context, "com.huawei.health.update_commonutils_LOGIN", s1);
	//    8   15:aload_0         
	//    9   16:ldc2            #344 <String "com.huawei.health.update_commonutils_LOGIN">
	//   10   19:aload_1         
	//   11   20:invokestatic    #540 <Method void c(Context, String, String)>
	//   12   23:return          
	}

	public static void d(Context context, String as[])
	{
		int j1 = as.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i1 = 0; i1 < j1; i1++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          24
			m(context, as[i1]);
	//    8   10:aload_0         
	//    9   11:aload_1         
	//   10   12:iload_2         
	//   11   13:aaload          
	//   12   14:invokestatic    #908 <Method void m(Context, String)>

	//   13   17:iload_2         
	//   14   18:iconst_1        
	//   15   19:iadd            
	//   16   20:istore_2        
	//*  17   21:goto            5
	//   18   24:return          
	}

	public static void d(String s1)
	{
		a(s1, "");
	//    0    0:aload_0         
	//    1    1:ldc1            #217 <String "">
	//    2    3:invokestatic    #910 <Method void a(String, String)>
	//    3    6:return          
	}

	public static boolean d()
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int i1;
		boolean flag;
		Object obj;
		try
		{
			obj = ((Object) (Class.forName("android.os.SystemProperties")));
	//    2    2:ldc2            #495 <String "android.os.SystemProperties">
	//    3    5:invokestatic    #480 <Method Class Class.forName(String)>
	//    4    8:astore_3        
			obj = ((Object) ((String)((Class) (obj)).getDeclaredMethod("get", new Class[] {
				java/lang/String
			}).invoke(obj, new Object[] {
				"ro.build.version.emui"
			})));
	//    5    9:aload_3         
	//    6   10:ldc2            #496 <String "get">
	//    7   13:iconst_1        
	//    8   14:anewarray       Class[]
	//    9   17:dup             
	//   10   18:iconst_0        
	//   11   19:ldc1            #46  <Class String>
	//   12   21:aastore         
	//   13   22:invokevirtual   #500 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   14   25:aload_3         
	//   15   26:iconst_1        
	//   16   27:anewarray       Object[]
	//   17   30:dup             
	//   18   31:iconst_0        
	//   19   32:ldc2            #502 <String "ro.build.version.emui">
	//   20   35:aastore         
	//   21   36:invokevirtual   #508 <Method Object Method.invoke(Object, Object[])>
	//   22   39:checkcast       #46  <Class String>
	//   23   42:astore_3        
			dho.d("CommonUtil", new Object[] {
				(new StringBuilder()).append("emui:").append(((String) (obj))).toString()
			});
	//   24   43:ldc1            #68  <String "CommonUtil">
	//   25   45:iconst_1        
	//   26   46:anewarray       Object[]
	//   27   49:dup             
	//   28   50:iconst_0        
	//   29   51:new             #120 <Class StringBuilder>
	//   30   54:dup             
	//   31   55:invokespecial   #121 <Method void StringBuilder()>
	//   32   58:ldc2            #510 <String "emui:">
	//   33   61:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   34   64:aload_3         
	//   35   65:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   36   68:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   37   71:aastore         
	//   38   72:invokestatic    #325 <Method void dho.d(String, Object[])>
		}
	//*  39   75:iload_2         
	//*  40   76:istore_1        
	//*  41   77:aload_3         
	//*  42   78:ifnull          98
	//*  43   81:aload_3         
	//*  44   82:ldc2            #912 <String "EmotionUI">
	//*  45   85:invokevirtual   #893 <Method int String.indexOf(String)>
	//*  46   88:istore_0        
	//*  47   89:iload_2         
	//*  48   90:istore_1        
	//*  49   91:iload_0         
	//*  50   92:iconst_m1       
	//*  51   93:icmpeq          98
	//*  52   96:iconst_1        
	//*  53   97:istore_1        
	//*  54   98:iload_1         
	//*  55   99:ireturn         
		catch(ClassNotFoundException classnotfoundexception)
	//*  56  100:astore_3        
		{
			dho.d("CommonUtil", new Object[] {
				classnotfoundexception.getMessage()
			});
	//   57  101:ldc1            #68  <String "CommonUtil">
	//   58  103:iconst_1        
	//   59  104:anewarray       Object[]
	//   60  107:dup             
	//   61  108:iconst_0        
	//   62  109:aload_3         
	//   63  110:invokevirtual   #484 <Method String ClassNotFoundException.getMessage()>
	//   64  113:aastore         
	//   65  114:invokestatic    #325 <Method void dho.d(String, Object[])>
			return false;
	//   66  117:iconst_0        
	//   67  118:ireturn         
		}
		catch(NoSuchMethodException nosuchmethodexception)
	//*  68  119:astore_3        
		{
			dho.d("CommonUtil", new Object[] {
				nosuchmethodexception.getMessage()
			});
	//   69  120:ldc1            #68  <String "CommonUtil">
	//   70  122:iconst_1        
	//   71  123:anewarray       Object[]
	//   72  126:dup             
	//   73  127:iconst_0        
	//   74  128:aload_3         
	//   75  129:invokevirtual   #532 <Method String NoSuchMethodException.getMessage()>
	//   76  132:aastore         
	//   77  133:invokestatic    #325 <Method void dho.d(String, Object[])>
			return false;
	//   78  136:iconst_0        
	//   79  137:ireturn         
		}
		catch(InvocationTargetException invocationtargetexception)
	//*  80  138:astore_3        
		{
			dho.d("CommonUtil", new Object[] {
				invocationtargetexception.getMessage()
			});
	//   81  139:ldc1            #68  <String "CommonUtil">
	//   82  141:iconst_1        
	//   83  142:anewarray       Object[]
	//   84  145:dup             
	//   85  146:iconst_0        
	//   86  147:aload_3         
	//   87  148:invokevirtual   #533 <Method String InvocationTargetException.getMessage()>
	//   88  151:aastore         
	//   89  152:invokestatic    #325 <Method void dho.d(String, Object[])>
			return false;
	//   90  155:iconst_0        
	//   91  156:ireturn         
		}
		catch(IllegalAccessException illegalaccessexception)
	//*  92  157:astore_3        
		{
			dho.d("CommonUtil", new Object[] {
				illegalaccessexception.getMessage()
			});
	//   93  158:ldc1            #68  <String "CommonUtil">
	//   94  160:iconst_1        
	//   95  161:anewarray       Object[]
	//   96  164:dup             
	//   97  165:iconst_0        
	//   98  166:aload_3         
	//   99  167:invokevirtual   #534 <Method String IllegalAccessException.getMessage()>
	//  100  170:aastore         
	//  101  171:invokestatic    #325 <Method void dho.d(String, Object[])>
			return false;
	//  102  174:iconst_0        
	//  103  175:ireturn         
		}
		flag = flag1;
		if(obj == null)
			break MISSING_BLOCK_LABEL_98;
		i1 = ((String) (obj)).indexOf("EmotionUI");
		flag = flag1;
		if(i1 != -1)
			flag = true;
		return flag;
	}

	public static boolean d(PackageInfo packageinfo)
	{
		return (packageinfo.applicationInfo.flags & 1) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #737 <Field ApplicationInfo PackageInfo.applicationInfo>
	//    2    4:getfield        #740 <Field int ApplicationInfo.flags>
	//    3    7:iconst_1        
	//    4    8:iand            
	//    5    9:ifeq            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public static int e(Context context)
	{
		int i1;
		String s1;
		i1 = 1;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		s1 = context.getPackageName();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #154 <Method String Context.getPackageName()>
	//    4    6:astore_3        
		int j1 = context.getPackageManager().getPackageInfo(s1, 0).versionCode;
	//    5    7:aload_0         
	//    6    8:invokevirtual   #107 <Method PackageManager Context.getPackageManager()>
	//    7   11:aload_3         
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #113 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   10   16:getfield        #916 <Field int PackageInfo.versionCode>
	//   11   19:istore_2        
		i1 = j1;
	//   12   20:iload_2         
	//   13   21:istore_1        
		break MISSING_BLOCK_LABEL_61;
	//   14   22:goto            61
		context;
	//   15   25:astore_0        
		dho.f("CommonUtil", new Object[] {
			(new StringBuilder()).append("getAppVersion() Exception=").append(((android.content.pm.PackageManager.NameNotFoundException) (context)).getMessage()).toString()
		});
	//   16   26:ldc1            #68  <String "CommonUtil">
	//   17   28:iconst_1        
	//   18   29:anewarray       Object[]
	//   19   32:dup             
	//   20   33:iconst_0        
	//   21   34:new             #120 <Class StringBuilder>
	//   22   37:dup             
	//   23   38:invokespecial   #121 <Method void StringBuilder()>
	//   24   41:ldc2            #918 <String "getAppVersion() Exception=">
	//   25   44:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   26   47:aload_0         
	//   27   48:invokevirtual   #128 <Method String android.content.pm.PackageManager$NameNotFoundException.getMessage()>
	//   28   51:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   29   54:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   30   57:aastore         
	//   31   58:invokestatic    #79  <Method void dho.f(String, Object[])>
		dho.d("CommonUtil", new Object[] {
			(new StringBuilder()).append("getAppVersion() return=").append(i1).toString()
		});
	//   32   61:ldc1            #68  <String "CommonUtil">
	//   33   63:iconst_1        
	//   34   64:anewarray       Object[]
	//   35   67:dup             
	//   36   68:iconst_0        
	//   37   69:new             #120 <Class StringBuilder>
	//   38   72:dup             
	//   39   73:invokespecial   #121 <Method void StringBuilder()>
	//   40   76:ldc2            #920 <String "getAppVersion() return=">
	//   41   79:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   42   82:iload_1         
	//   43   83:invokevirtual   #205 <Method StringBuilder StringBuilder.append(int)>
	//   44   86:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   45   89:aastore         
	//   46   90:invokestatic    #325 <Method void dho.d(String, Object[])>
		return i1;
	//   47   93:iload_1         
	//   48   94:ireturn         
	}

	public static int e(Context context, String s1)
	{
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #305 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            24
		{
			dho.d("CommonUtil", new Object[] {
				"stringToInt str is empty"
			});
	//    3    7:ldc1            #68  <String "CommonUtil">
	//    4    9:iconst_1        
	//    5   10:anewarray       Object[]
	//    6   13:dup             
	//    7   14:iconst_0        
	//    8   15:ldc2            #888 <String "stringToInt str is empty">
	//    9   18:aastore         
	//   10   19:invokestatic    #325 <Method void dho.d(String, Object[])>
			return 0;
	//   11   22:iconst_0        
	//   12   23:ireturn         
		}
		context = ((Context) (s1));
	//   13   24:aload_1         
	//   14   25:astore_0        
		int i1;
		try
		{
			if(s1.indexOf(".") > 0)
	//*  15   26:aload_1         
	//*  16   27:ldc2            #890 <String ".">
	//*  17   30:invokevirtual   #893 <Method int String.indexOf(String)>
	//*  18   33:ifle            49
				context = ((Context) (s1.substring(0, s1.indexOf("."))));
	//   19   36:aload_1         
	//   20   37:iconst_0        
	//   21   38:aload_1         
	//   22   39:ldc2            #890 <String ".">
	//   23   42:invokevirtual   #893 <Method int String.indexOf(String)>
	//   24   45:invokevirtual   #312 <Method String String.substring(int, int)>
	//   25   48:astore_0        
			i1 = Integer.parseInt(((String) (context)));
	//   26   49:aload_0         
	//   27   50:invokestatic    #786 <Method int Integer.parseInt(String)>
	//   28   53:istore_2        
		}
	//*  29   54:iload_2         
	//*  30   55:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  31   56:astore_0        
		{
			dho.f("CommonUtil", new Object[] {
				(new StringBuilder()).append("Exception e = ").append(((NumberFormatException) (context)).getMessage()).toString()
			});
	//   32   57:ldc1            #68  <String "CommonUtil">
	//   33   59:iconst_1        
	//   34   60:anewarray       Object[]
	//   35   63:dup             
	//   36   64:iconst_0        
	//   37   65:new             #120 <Class StringBuilder>
	//   38   68:dup             
	//   39   69:invokespecial   #121 <Method void StringBuilder()>
	//   40   72:ldc2            #895 <String "Exception e = ">
	//   41   75:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   42   78:aload_0         
	//   43   79:invokevirtual   #896 <Method String NumberFormatException.getMessage()>
	//   44   82:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   45   85:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   46   88:aastore         
	//   47   89:invokestatic    #79  <Method void dho.f(String, Object[])>
			return 0;
	//   48   92:iconst_0        
	//   49   93:ireturn         
		}
		return i1;
	}

	public static String e()
	{
		return e;
	//    0    0:getstatic       #24  <Field String e>
	//    1    3:areturn         
	}

	public static String e(int i1)
	{
		String s1 = "";
	//    0    0:ldc1            #217 <String "">
	//    1    2:astore_1        
		Object obj = ((Object) ((ActivityManager)BaseApplication.a().getSystemService("activity")));
	//    2    3:invokestatic    #925 <Method Context BaseApplication.a()>
	//    3    6:ldc1            #158 <String "activity">
	//    4    8:invokevirtual   #162 <Method Object Context.getSystemService(String)>
	//    5   11:checkcast       #164 <Class ActivityManager>
	//    6   14:astore_2        
		if(obj == null)
	//*   7   15:aload_2         
	//*   8   16:ifnonnull       22
			return "";
	//    9   19:ldc1            #217 <String "">
	//   10   21:areturn         
		obj = ((Object) (((ActivityManager) (obj)).getRunningAppProcesses()));
	//   11   22:aload_2         
	//   12   23:invokevirtual   #168 <Method List ActivityManager.getRunningAppProcesses()>
	//   13   26:astore_2        
		if(obj == null)
	//*  14   27:aload_2         
	//*  15   28:ifnonnull       34
			return "";
	//   16   31:ldc1            #217 <String "">
	//   17   33:areturn         
		obj = ((Object) (((List) (obj)).iterator()));
	//   18   34:aload_2         
	//   19   35:invokeinterface #180 <Method Iterator List.iterator()>
	//   20   40:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   21   41:aload_2         
	//   22   42:invokeinterface #185 <Method boolean Iterator.hasNext()>
	//   23   47:ifeq            76
			android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
	//   24   50:aload_2         
	//   25   51:invokeinterface #189 <Method Object Iterator.next()>
	//   26   56:checkcast       #191 <Class android.app.ActivityManager$RunningAppProcessInfo>
	//   27   59:astore_3        
			if(runningappprocessinfo.pid == i1)
	//*  28   60:aload_3         
	//*  29   61:getfield        #928 <Field int android.app.ActivityManager$RunningAppProcessInfo.pid>
	//*  30   64:iload_0         
	//*  31   65:icmpne          73
				s1 = runningappprocessinfo.processName;
	//   32   68:aload_3         
	//   33   69:getfield        #196 <Field String android.app.ActivityManager$RunningAppProcessInfo.processName>
	//   34   72:astore_1        
		} while(true);
	//   35   73:goto            41
		return s1;
	//   36   76:aload_1         
	//   37   77:areturn         
	}

	public static void e(Context context, Class class1)
	{
		dho.b("CommonUtil", new Object[] {
			"toggleNotificationListenerService enter"
		});
	//    0    0:ldc1            #68  <String "CommonUtil">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc2            #931 <String "toggleNotificationListenerService enter">
	//    6   11:aastore         
	//    7   12:invokestatic    #133 <Method void dho.b(String, Object[])>
		PackageManager packagemanager = context.getPackageManager();
	//    8   15:aload_0         
	//    9   16:invokevirtual   #107 <Method PackageManager Context.getPackageManager()>
	//   10   19:astore_2        
		packagemanager.setComponentEnabledSetting(new ComponentName(context, class1), 2, 1);
	//   11   20:aload_2         
	//   12   21:new             #266 <Class ComponentName>
	//   13   24:dup             
	//   14   25:aload_0         
	//   15   26:aload_1         
	//   16   27:invokespecial   #933 <Method void ComponentName(Context, Class)>
	//   17   30:iconst_2        
	//   18   31:iconst_1        
	//   19   32:invokevirtual   #937 <Method void PackageManager.setComponentEnabledSetting(ComponentName, int, int)>
		packagemanager.setComponentEnabledSetting(new ComponentName(context, class1), 1, 1);
	//   20   35:aload_2         
	//   21   36:new             #266 <Class ComponentName>
	//   22   39:dup             
	//   23   40:aload_0         
	//   24   41:aload_1         
	//   25   42:invokespecial   #933 <Method void ComponentName(Context, Class)>
	//   26   45:iconst_1        
	//   27   46:iconst_1        
	//   28   47:invokevirtual   #937 <Method void PackageManager.setComponentEnabledSetting(ComponentName, int, int)>
	//   29   50:return          
	}

	public static void e(String s1)
	{
		c = s1;
	//    0    0:aload_0         
	//    1    1:putstatic       #26  <Field String c>
	//    2    4:return          
	}

	public static boolean e(String s1, Context context)
	{
		context = ((Context) (((ActivityManager)context.getSystemService("activity")).getRunningServices(100)));
	//    0    0:aload_1         
	//    1    1:ldc1            #158 <String "activity">
	//    2    3:invokevirtual   #162 <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #164 <Class ActivityManager>
	//    4    9:bipush          100
	//    5   11:invokevirtual   #256 <Method List ActivityManager.getRunningServices(int)>
	//    6   14:astore_1        
		if(context == null || ((List) (context)).size() <= 0)
	//*   7   15:aload_1         
	//*   8   16:ifnull          28
	//*   9   19:aload_1         
	//*  10   20:invokeinterface #174 <Method int List.size()>
	//*  11   25:ifgt            30
			return false;
	//   12   28:iconst_0        
	//   13   29:ireturn         
		for(int i1 = 0; i1 < ((List) (context)).size(); i1++)
	//*  14   30:iconst_0        
	//*  15   31:istore_2        
	//*  16   32:iload_2         
	//*  17   33:aload_1         
	//*  18   34:invokeinterface #174 <Method int List.size()>
	//*  19   39:icmpge          74
			if(((android.app.ActivityManager.RunningServiceInfo)((List) (context)).get(i1)).service.getClassName().equals(((Object) (s1))))
	//*  20   42:aload_1         
	//*  21   43:iload_2         
	//*  22   44:invokeinterface #939 <Method Object List.get(int)>
	//*  23   49:checkcast       #258 <Class android.app.ActivityManager$RunningServiceInfo>
	//*  24   52:getfield        #264 <Field ComponentName android.app.ActivityManager$RunningServiceInfo.service>
	//*  25   55:invokevirtual   #269 <Method String ComponentName.getClassName()>
	//*  26   58:aload_0         
	//*  27   59:invokevirtual   #150 <Method boolean String.equals(Object)>
	//*  28   62:ifeq            67
				return true;
	//   29   65:iconst_1        
	//   30   66:ireturn         

	//   31   67:iload_2         
	//   32   68:iconst_1        
	//   33   69:iadd            
	//   34   70:istore_2        
	//*  35   71:goto            32
		return false;
	//   36   74:iconst_0        
	//   37   75:ireturn         
	}

	public static boolean e(String s1, String s2, boolean flag)
	{
		String s3;
		File file;
label0:
		{
			file = new File(s1);
	//    0    0:new             #585 <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #587 <Method void File(String)>
	//    4    8:astore          7
			if(!file.exists())
	//*   5   10:aload           7
	//*   6   12:invokevirtual   #590 <Method boolean File.exists()>
	//*   7   15:ifne            39
			{
				dho.b("CommonUtil", new Object[] {
					"source dir is not exit, fileName : ", s1
				});
	//    8   18:ldc1            #68  <String "CommonUtil">
	//    9   20:iconst_2        
	//   10   21:anewarray       Object[]
	//   11   24:dup             
	//   12   25:iconst_0        
	//   13   26:ldc2            #941 <String "source dir is not exit, fileName : ">
	//   14   29:aastore         
	//   15   30:dup             
	//   16   31:iconst_1        
	//   17   32:aload_0         
	//   18   33:aastore         
	//   19   34:invokestatic    #133 <Method void dho.b(String, Object[])>
				return false;
	//   20   37:iconst_0        
	//   21   38:ireturn         
			}
			if(!file.isDirectory())
	//*  22   39:aload           7
	//*  23   41:invokevirtual   #744 <Method boolean File.isDirectory()>
	//*  24   44:ifne            68
			{
				dho.b("CommonUtil", new Object[] {
					"source dir is not a dir, fileName : ", s1
				});
	//   25   47:ldc1            #68  <String "CommonUtil">
	//   26   49:iconst_2        
	//   27   50:anewarray       Object[]
	//   28   53:dup             
	//   29   54:iconst_0        
	//   30   55:ldc2            #943 <String "source dir is not a dir, fileName : ">
	//   31   58:aastore         
	//   32   59:dup             
	//   33   60:iconst_1        
	//   34   61:aload_0         
	//   35   62:aastore         
	//   36   63:invokestatic    #133 <Method void dho.b(String, Object[])>
				return false;
	//   37   66:iconst_0        
	//   38   67:ireturn         
			}
			s3 = s2;
	//   39   68:aload_1         
	//   40   69:astore          6
			if(!s2.endsWith(File.separator))
	//*  41   71:aload_1         
	//*  42   72:getstatic       #946 <Field String File.separator>
	//*  43   75:invokevirtual   #949 <Method boolean String.endsWith(String)>
	//*  44   78:ifne            103
				s3 = (new StringBuilder()).append(s2).append(File.separator).toString();
	//   45   81:new             #120 <Class StringBuilder>
	//   46   84:dup             
	//   47   85:invokespecial   #121 <Method void StringBuilder()>
	//   48   88:aload_1         
	//   49   89:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   50   92:getstatic       #946 <Field String File.separator>
	//   51   95:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   52   98:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   53  101:astore          6
			s2 = ((String) (new File(s3)));
	//   54  103:new             #585 <Class File>
	//   55  106:dup             
	//   56  107:aload           6
	//   57  109:invokespecial   #587 <Method void File(String)>
	//   58  112:astore_1        
			if(((File) (s2)).exists())
	//*  59  113:aload_1         
	//*  60  114:invokevirtual   #590 <Method boolean File.exists()>
	//*  61  117:ifeq            189
				if(flag)
	//*  62  120:iload_2         
	//*  63  121:ifeq            167
				{
					boolean flag1;
					try
					{
						flag1 = (new File(s3)).delete();
	//   64  124:new             #585 <Class File>
	//   65  127:dup             
	//   66  128:aload           6
	//   67  130:invokespecial   #587 <Method void File(String)>
	//   68  133:invokevirtual   #600 <Method boolean File.delete()>
	//   69  136:istore          4
					}
	//*  70  138:iload           4
	//*  71  140:ifne            145
	//*  72  143:iconst_0        
	//*  73  144:ireturn         
	//*  74  145:goto            228
					// Misplaced declaration of an exception variable
					catch(String s2)
	//*  75  148:astore_1        
					{
						dho.b("CommonUtil", new Object[] {
							"delete Exception"
						});
	//   76  149:ldc1            #68  <String "CommonUtil">
	//   77  151:iconst_1        
	//   78  152:anewarray       Object[]
	//   79  155:dup             
	//   80  156:iconst_0        
	//   81  157:ldc2            #951 <String "delete Exception">
	//   82  160:aastore         
	//   83  161:invokestatic    #133 <Method void dho.b(String, Object[])>
						break label0;
	//   84  164:goto            228
					}
					if(!flag1)
						return false;
					break label0;
				} else
				{
					dho.b("CommonUtil", new Object[] {
						"copy dir fail:source dir has exit, fileName : ", s3
					});
	//   85  167:ldc1            #68  <String "CommonUtil">
	//   86  169:iconst_2        
	//   87  170:anewarray       Object[]
	//   88  173:dup             
	//   89  174:iconst_0        
	//   90  175:ldc2            #953 <String "copy dir fail:source dir has exit, fileName : ">
	//   91  178:aastore         
	//   92  179:dup             
	//   93  180:iconst_1        
	//   94  181:aload           6
	//   95  183:aastore         
	//   96  184:invokestatic    #133 <Method void dho.b(String, Object[])>
					return false;
	//   97  187:iconst_0        
	//   98  188:ireturn         
				}
			dho.b("CommonUtil", new Object[] {
				"create destDir enter"
			});
	//   99  189:ldc1            #68  <String "CommonUtil">
	//  100  191:iconst_1        
	//  101  192:anewarray       Object[]
	//  102  195:dup             
	//  103  196:iconst_0        
	//  104  197:ldc2            #955 <String "create destDir enter">
	//  105  200:aastore         
	//  106  201:invokestatic    #133 <Method void dho.b(String, Object[])>
			if(!((File) (s2)).mkdirs())
	//* 107  204:aload_1         
	//* 108  205:invokevirtual   #609 <Method boolean File.mkdirs()>
	//* 109  208:ifne            228
			{
				dho.b("CommonUtil", new Object[] {
					"copy dir fail: create destDir fail!"
				});
	//  110  211:ldc1            #68  <String "CommonUtil">
	//  111  213:iconst_1        
	//  112  214:anewarray       Object[]
	//  113  217:dup             
	//  114  218:iconst_0        
	//  115  219:ldc2            #957 <String "copy dir fail: create destDir fail!">
	//  116  222:aastore         
	//  117  223:invokestatic    #133 <Method void dho.b(String, Object[])>
				return false;
	//  118  226:iconst_0        
	//  119  227:ireturn         
			}
		}
		boolean flag2 = true;
	//  120  228:iconst_1        
	//  121  229:istore          4
		boolean flag3 = true;
	//  122  231:iconst_1        
	//  123  232:istore          5
		s2 = ((String) (file.listFiles()));
	//  124  234:aload           7
	//  125  236:invokevirtual   #961 <Method File[] File.listFiles()>
	//  126  239:astore_1        
		if(s2 != null)
	//* 127  240:aload_1         
	//* 128  241:ifnull          393
		{
			int i1 = 0;
	//  129  244:iconst_0        
	//  130  245:istore_3        
			do
			{
				flag2 = flag3;
	//  131  246:iload           5
	//  132  248:istore          4
				if(i1 >= s2.length)
					break;
	//  133  250:iload_3         
	//  134  251:aload_1         
	//  135  252:arraylength     
	//  136  253:icmpge          393
				if(((File) (s2[i1])).isFile())
	//* 137  256:aload_1         
	//* 138  257:iload_3         
	//* 139  258:aaload          
	//* 140  259:invokevirtual   #595 <Method boolean File.isFile()>
	//* 141  262:ifeq            317
				{
					flag3 = a(((File) (s2[i1])).getAbsolutePath(), (new StringBuilder()).append(s3).append(((File) (s2[i1])).getName()).toString(), flag);
	//  142  265:aload_1         
	//  143  266:iload_3         
	//  144  267:aaload          
	//  145  268:invokevirtual   #964 <Method String File.getAbsolutePath()>
	//  146  271:new             #120 <Class StringBuilder>
	//  147  274:dup             
	//  148  275:invokespecial   #121 <Method void StringBuilder()>
	//  149  278:aload           6
	//  150  280:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  151  283:aload_1         
	//  152  284:iload_3         
	//  153  285:aaload          
	//  154  286:invokevirtual   #967 <Method String File.getName()>
	//  155  289:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  156  292:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  157  295:iload_2         
	//  158  296:invokestatic    #969 <Method boolean a(String, String, boolean)>
	//  159  299:istore          5
					flag2 = flag3;
	//  160  301:iload           5
	//  161  303:istore          4
					if(!flag3)
	//* 162  305:iload           5
	//* 163  307:ifne            382
					{
						flag2 = flag3;
	//  164  310:iload           5
	//  165  312:istore          4
						break;
	//  166  314:goto            393
					}
				} else
				{
					flag2 = flag3;
	//  167  317:iload           5
	//  168  319:istore          4
					if(((File) (s2[i1])).isDirectory())
	//* 169  321:aload_1         
	//* 170  322:iload_3         
	//* 171  323:aaload          
	//* 172  324:invokevirtual   #744 <Method boolean File.isDirectory()>
	//* 173  327:ifeq            382
					{
						flag3 = e(((File) (s2[i1])).getAbsolutePath(), (new StringBuilder()).append(s3).append(((File) (s2[i1])).getName()).toString(), flag);
	//  174  330:aload_1         
	//  175  331:iload_3         
	//  176  332:aaload          
	//  177  333:invokevirtual   #964 <Method String File.getAbsolutePath()>
	//  178  336:new             #120 <Class StringBuilder>
	//  179  339:dup             
	//  180  340:invokespecial   #121 <Method void StringBuilder()>
	//  181  343:aload           6
	//  182  345:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  183  348:aload_1         
	//  184  349:iload_3         
	//  185  350:aaload          
	//  186  351:invokevirtual   #967 <Method String File.getName()>
	//  187  354:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  188  357:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  189  360:iload_2         
	//  190  361:invokestatic    #971 <Method boolean e(String, String, boolean)>
	//  191  364:istore          5
						flag2 = flag3;
	//  192  366:iload           5
	//  193  368:istore          4
						if(!flag3)
	//* 194  370:iload           5
	//* 195  372:ifne            382
						{
							flag2 = flag3;
	//  196  375:iload           5
	//  197  377:istore          4
							break;
	//  198  379:goto            393
						}
					}
				}
				i1++;
	//  199  382:iload_3         
	//  200  383:iconst_1        
	//  201  384:iadd            
	//  202  385:istore_3        
				flag3 = flag2;
	//  203  386:iload           4
	//  204  388:istore          5
			} while(true);
	//  205  390:goto            246
		}
		if(!flag2)
	//* 206  393:iload           4
	//* 207  395:ifne            436
		{
			dho.b("CommonUtil", new Object[] {
				"copy ", s1, "to", s3, "fail!"
			});
	//  208  398:ldc1            #68  <String "CommonUtil">
	//  209  400:iconst_5        
	//  210  401:anewarray       Object[]
	//  211  404:dup             
	//  212  405:iconst_0        
	//  213  406:ldc2            #973 <String "copy ">
	//  214  409:aastore         
	//  215  410:dup             
	//  216  411:iconst_1        
	//  217  412:aload_0         
	//  218  413:aastore         
	//  219  414:dup             
	//  220  415:iconst_2        
	//  221  416:ldc2            #975 <String "to">
	//  222  419:aastore         
	//  223  420:dup             
	//  224  421:iconst_3        
	//  225  422:aload           6
	//  226  424:aastore         
	//  227  425:dup             
	//  228  426:iconst_4        
	//  229  427:ldc2            #977 <String "fail!">
	//  230  430:aastore         
	//  231  431:invokestatic    #133 <Method void dho.b(String, Object[])>
			return false;
	//  232  434:iconst_0        
	//  233  435:ireturn         
		} else
		{
			return true;
	//  234  436:iconst_1        
	//  235  437:ireturn         
		}
	}

	private static PublicKey[] e(PackageInfo packageinfo)
	{
		PublicKey apublickey[];
		PublicKey apublickey1[];
		apublickey1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		apublickey = apublickey1;
	//    2    2:aload_3         
	//    3    3:astore_2        
label0:
		{
			if(packageinfo.signatures != null)
	//*   4    4:aload_0         
	//*   5    5:getfield        #982 <Field Signature[] PackageInfo.signatures>
	//*   6    8:ifnull          23
			{
				apublickey = apublickey1;
	//    7   11:aload_3         
	//    8   12:astore_2        
				int i1;
				byte abyte0[];
				try
				{
					i1 = packageinfo.signatures.length;
	//    9   13:aload_0         
	//   10   14:getfield        #982 <Field Signature[] PackageInfo.signatures>
	//   11   17:arraylength     
	//   12   18:istore_1        
				}
	//*  13   19:iload_1         
	//*  14   20:ifne            25
	//*  15   23:aconst_null     
	//*  16   24:areturn         
	//*  17   25:aload_3         
	//*  18   26:astore_2        
	//*  19   27:aload_0         
	//*  20   28:getfield        #982 <Field Signature[] PackageInfo.signatures>
	//*  21   31:arraylength     
	//*  22   32:anewarray       PublicKey[]
	//*  23   35:astore_3        
	//*  24   36:iconst_0        
	//*  25   37:istore_1        
	//*  26   38:aload_3         
	//*  27   39:astore_2        
	//*  28   40:iload_1         
	//*  29   41:aload_3         
	//*  30   42:arraylength     
	//*  31   43:icmpge          95
	//*  32   46:aload_3         
	//*  33   47:astore_2        
	//*  34   48:aload_0         
	//*  35   49:getfield        #982 <Field Signature[] PackageInfo.signatures>
	//*  36   52:iload_1         
	//*  37   53:aaload          
	//*  38   54:invokevirtual   #987 <Method byte[] Signature.toByteArray()>
	//*  39   57:astore          4
	//*  40   59:aload_3         
	//*  41   60:astore_2        
	//*  42   61:aload_3         
	//*  43   62:iload_1         
	//*  44   63:ldc2            #989 <String "X.509">
	//*  45   66:invokestatic    #994 <Method CertificateFactory CertificateFactory.getInstance(String)>
	//*  46   69:new             #996 <Class ByteArrayInputStream>
	//*  47   72:dup             
	//*  48   73:aload           4
	//*  49   75:invokespecial   #999 <Method void ByteArrayInputStream(byte[])>
	//*  50   78:invokevirtual   #1003 <Method Certificate CertificateFactory.generateCertificate(InputStream)>
	//*  51   81:checkcast       #1005 <Class X509Certificate>
	//*  52   84:invokevirtual   #1009 <Method PublicKey X509Certificate.getPublicKey()>
	//*  53   87:aastore         
	//*  54   88:iload_1         
	//*  55   89:iconst_1        
	//*  56   90:iadd            
	//*  57   91:istore_1        
	//*  58   92:goto            38
	//*  59   95:aload_3         
	//*  60   96:areturn         
				// Misplaced declaration of an exception variable
				catch(PackageInfo packageinfo)
	//*  61   97:astore_0        
				{
					dho.f("CommonUtil", new Object[] {
						(new StringBuilder()).append("getPublicKey Exception:").append(((Exception) (packageinfo)).getMessage()).toString()
					});
	//   62   98:ldc1            #68  <String "CommonUtil">
	//   63  100:iconst_1        
	//   64  101:anewarray       Object[]
	//   65  104:dup             
	//   66  105:iconst_0        
	//   67  106:new             #120 <Class StringBuilder>
	//   68  109:dup             
	//   69  110:invokespecial   #121 <Method void StringBuilder()>
	//   70  113:ldc2            #1011 <String "getPublicKey Exception:">
	//   71  116:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   72  119:aload_0         
	//   73  120:invokevirtual   #73  <Method String Exception.getMessage()>
	//   74  123:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   75  126:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   76  129:aastore         
	//   77  130:invokestatic    #79  <Method void dho.f(String, Object[])>
					return apublickey;
	//   78  133:aload_2         
	//   79  134:areturn         
				}
				if(i1 != 0)
					break label0;
			}
			return null;
		}
		apublickey = apublickey1;
		apublickey1 = new PublicKey[packageinfo.signatures.length];
		i1 = 0;
_L2:
		apublickey = apublickey1;
		if(i1 >= apublickey1.length)
			break; /* Loop/switch isn't completed */
		apublickey = apublickey1;
		abyte0 = packageinfo.signatures[i1].toByteArray();
		apublickey = apublickey1;
		apublickey1[i1] = ((X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(((InputStream) (new ByteArrayInputStream(abyte0))))).getPublicKey();
		i1++;
		if(true) goto _L2; else goto _L1
_L1:
		return apublickey1;
	}

	public static boolean f()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public static boolean f(Context context)
	{
		context = ((Context) (((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo()));
	//    0    0:aload_0         
	//    1    1:ldc2            #1013 <String "connectivity">
	//    2    4:invokevirtual   #162 <Method Object Context.getSystemService(String)>
	//    3    7:checkcast       #1015 <Class ConnectivityManager>
	//    4   10:invokevirtual   #1019 <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//    5   13:astore_0        
		return context != null && ((NetworkInfo) (context)).isConnected();
	//    6   14:aload_0         
	//    7   15:ifnull          27
	//    8   18:aload_0         
	//    9   19:invokevirtual   #1024 <Method boolean NetworkInfo.isConnected()>
	//   10   22:ifeq            27
	//   11   25:iconst_1        
	//   12   26:ireturn         
	//   13   27:iconst_0        
	//   14   28:ireturn         
	}

	public static boolean f(Context context, String s1)
	{
		Context context1;
		Context context2;
		Object obj;
		Object obj1;
		String s2;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          8
		obj = null;
	//    2    3:aconst_null     
	//    3    4:astore          7
		s2 = context.getPackageName();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #154 <Method String Context.getPackageName()>
	//    6   10:astore          9
		context2 = ((Context) (obj));
	//    7   12:aload           7
	//    8   14:astore          6
		context1 = ((Context) (obj1));
	//    9   16:aload           8
	//   10   18:astore          5
		PublicKey apublickey[] = r(context, s2);
	//   11   20:aload_0         
	//   12   21:aload           9
	//   13   23:invokestatic    #1028 <Method PublicKey[] r(Context, String)>
	//   14   26:astore          9
		if(apublickey == null)
			break MISSING_BLOCK_LABEL_47;
	//   15   28:aload           9
	//   16   30:ifnull          47
		context2 = ((Context) (obj));
	//   17   33:aload           7
	//   18   35:astore          6
		context1 = ((Context) (obj1));
	//   19   37:aload           8
	//   20   39:astore          5
		if(apublickey.length != 0)
			break MISSING_BLOCK_LABEL_66;
	//   21   41:aload           9
	//   22   43:arraylength     
	//   23   44:ifne            66
		context2 = ((Context) (obj));
	//   24   47:aload           7
	//   25   49:astore          6
		context1 = ((Context) (obj1));
	//   26   51:aload           8
	//   27   53:astore          5
		Log.e("CommonUtil", "verifySignature installedAppPubKeys == null||installedAppPubKeys.length==0");
	//   28   55:ldc1            #68  <String "CommonUtil">
	//   29   57:ldc2            #1030 <String "verifySignature installedAppPubKeys == null||installedAppPubKeys.length==0">
	//   30   60:invokestatic    #1032 <Method int Log.e(String, String)>
	//   31   63:pop             
		return false;
	//   32   64:iconst_0        
	//   33   65:ireturn         
		context2 = ((Context) (obj));
	//   34   66:aload           7
	//   35   68:astore          6
		context1 = ((Context) (obj1));
	//   36   70:aload           8
	//   37   72:astore          5
		context = ((Context) (new JarFile(s1)));
	//   38   74:new             #768 <Class JarFile>
	//   39   77:dup             
	//   40   78:aload_1         
	//   41   79:invokespecial   #1033 <Method void JarFile(String)>
	//   42   82:astore_0        
		context2 = context;
	//   43   83:aload_0         
	//   44   84:astore          6
		context1 = context;
	//   45   86:aload_0         
	//   46   87:astore          5
		obj = ((Object) (((JarFile) (context)).getJarEntry("classes.dex")));
	//   47   89:aload_0         
	//   48   90:ldc2            #1035 <String "classes.dex">
	//   49   93:invokevirtual   #1039 <Method JarEntry JarFile.getJarEntry(String)>
	//   50   96:astore          7
		s1 = null;
	//   51   98:aconst_null     
	//   52   99:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_118;
	//   53  100:aload           7
	//   54  102:ifnull          118
		context2 = context;
	//   55  105:aload_0         
	//   56  106:astore          6
		context1 = context;
	//   57  108:aload_0         
	//   58  109:astore          5
		s1 = ((String) (b(((JarFile) (context)), ((JarEntry) (obj)))));
	//   59  111:aload_0         
	//   60  112:aload           7
	//   61  114:invokestatic    #1041 <Method Certificate[] b(JarFile, JarEntry)>
	//   62  117:astore_1        
		if(s1 == null) goto _L2; else goto _L1
	//   63  118:aload_1         
	//   64  119:ifnull          260
_L1:
		context2 = context;
	//   65  122:aload_0         
	//   66  123:astore          6
		context1 = context;
	//   67  125:aload_0         
	//   68  126:astore          5
		if(s1.length <= 0) goto _L2; else goto _L3
	//   69  128:aload_1         
	//   70  129:arraylength     
	//   71  130:ifle            260
_L3:
		int i1 = 0;
	//   72  133:iconst_0        
	//   73  134:istore_2        
_L6:
		context2 = context;
	//   74  135:aload_0         
	//   75  136:astore          6
		context1 = context;
	//   76  138:aload_0         
	//   77  139:astore          5
		if(i1 >= s1.length)
			break; /* Loop/switch isn't completed */
	//   78  141:iload_2         
	//   79  142:aload_1         
	//   80  143:arraylength     
	//   81  144:icmpge          260
		context2 = context;
	//   82  147:aload_0         
	//   83  148:astore          6
		context1 = context;
	//   84  150:aload_0         
	//   85  151:astore          5
		obj = ((Object) (((Certificate) (s1[i1])).getPublicKey()));
	//   86  153:aload_1         
	//   87  154:iload_2         
	//   88  155:aaload          
	//   89  156:invokevirtual   #1044 <Method PublicKey Certificate.getPublicKey()>
	//   90  159:astore          7
		int j1 = 0;
	//   91  161:iconst_0        
	//   92  162:istore_3        
_L5:
		context2 = context;
	//   93  163:aload_0         
	//   94  164:astore          6
		context1 = context;
	//   95  166:aload_0         
	//   96  167:astore          5
		if(j1 >= apublickey.length)
			break; /* Loop/switch isn't completed */
	//   97  169:iload_3         
	//   98  170:aload           9
	//   99  172:arraylength     
	//  100  173:icmpge          253
		context2 = context;
	//  101  176:aload_0         
	//  102  177:astore          6
		context1 = context;
	//  103  179:aload_0         
	//  104  180:astore          5
		boolean flag = obj.equals(((Object) (apublickey[j1])));
	//  105  182:aload           7
	//  106  184:aload           9
	//  107  186:iload_3         
	//  108  187:aaload          
	//  109  188:invokevirtual   #1045 <Method boolean Object.equals(Object)>
	//  110  191:istore          4
		if(!flag)
			break MISSING_BLOCK_LABEL_246;
	//  111  193:iload           4
	//  112  195:ifeq            246
		if(context == null)
			break MISSING_BLOCK_LABEL_244;
	//  113  198:aload_0         
	//  114  199:ifnull          244
		((JarFile) (context)).close();
	//  115  202:aload_0         
	//  116  203:invokevirtual   #1046 <Method void JarFile.close()>
		return true;
	//  117  206:iconst_1        
	//  118  207:ireturn         
		context;
	//  119  208:astore_0        
		dho.f("CommonUtil", new Object[] {
			(new StringBuilder()).append("verifySignature Exception:").append(((IOException) (context)).getMessage()).toString()
		});
	//  120  209:ldc1            #68  <String "CommonUtil">
	//  121  211:iconst_1        
	//  122  212:anewarray       Object[]
	//  123  215:dup             
	//  124  216:iconst_0        
	//  125  217:new             #120 <Class StringBuilder>
	//  126  220:dup             
	//  127  221:invokespecial   #121 <Method void StringBuilder()>
	//  128  224:ldc2            #1048 <String "verifySignature Exception:">
	//  129  227:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  130  230:aload_0         
	//  131  231:invokevirtual   #647 <Method String IOException.getMessage()>
	//  132  234:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  133  237:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  134  240:aastore         
	//  135  241:invokestatic    #79  <Method void dho.f(String, Object[])>
		return true;
	//  136  244:iconst_1        
	//  137  245:ireturn         
		j1++;
	//  138  246:iload_3         
	//  139  247:iconst_1        
	//  140  248:iadd            
	//  141  249:istore_3        
		if(true) goto _L5; else goto _L4
	//  142  250:goto            163
_L4:
		i1++;
	//  143  253:iload_2         
	//  144  254:iconst_1        
	//  145  255:iadd            
	//  146  256:istore_2        
		if(true) goto _L6; else goto _L2
	//  147  257:goto            135
_L2:
		if(context != null)
	//* 148  260:aload_0         
	//* 149  261:ifnull          450
		{
			try
			{
				((JarFile) (context)).close();
	//  150  264:aload_0         
	//  151  265:invokevirtual   #1046 <Method void JarFile.close()>
			}
	//* 152  268:iconst_0        
	//* 153  269:ireturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
	//* 154  270:astore_0        
			{
				dho.f("CommonUtil", new Object[] {
					(new StringBuilder()).append("verifySignature Exception:").append(((IOException) (context)).getMessage()).toString()
				});
	//  155  271:ldc1            #68  <String "CommonUtil">
	//  156  273:iconst_1        
	//  157  274:anewarray       Object[]
	//  158  277:dup             
	//  159  278:iconst_0        
	//  160  279:new             #120 <Class StringBuilder>
	//  161  282:dup             
	//  162  283:invokespecial   #121 <Method void StringBuilder()>
	//  163  286:ldc2            #1048 <String "verifySignature Exception:">
	//  164  289:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  165  292:aload_0         
	//  166  293:invokevirtual   #647 <Method String IOException.getMessage()>
	//  167  296:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  168  299:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  169  302:aastore         
	//  170  303:invokestatic    #79  <Method void dho.f(String, Object[])>
				return false;
	//  171  306:iconst_0        
	//  172  307:ireturn         
			}
			return false;
		}
		break MISSING_BLOCK_LABEL_450;
		context;
	//  173  308:astore_0        
		context1 = context2;
	//  174  309:aload           6
	//  175  311:astore          5
		dho.f("CommonUtil", new Object[] {
			(new StringBuilder()).append("verifySignature Exception:").append(((Exception) (context)).getMessage()).toString()
		});
	//  176  313:ldc1            #68  <String "CommonUtil">
	//  177  315:iconst_1        
	//  178  316:anewarray       Object[]
	//  179  319:dup             
	//  180  320:iconst_0        
	//  181  321:new             #120 <Class StringBuilder>
	//  182  324:dup             
	//  183  325:invokespecial   #121 <Method void StringBuilder()>
	//  184  328:ldc2            #1048 <String "verifySignature Exception:">
	//  185  331:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  186  334:aload_0         
	//  187  335:invokevirtual   #73  <Method String Exception.getMessage()>
	//  188  338:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  189  341:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  190  344:aastore         
	//  191  345:invokestatic    #79  <Method void dho.f(String, Object[])>
		if(context2 != null)
	//* 192  348:aload           6
	//* 193  350:ifnull          450
		{
			try
			{
				((JarFile) (context2)).close();
	//  194  353:aload           6
	//  195  355:invokevirtual   #1046 <Method void JarFile.close()>
			}
	//* 196  358:iconst_0        
	//* 197  359:ireturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
	//* 198  360:astore_0        
			{
				dho.f("CommonUtil", new Object[] {
					(new StringBuilder()).append("verifySignature Exception:").append(((IOException) (context)).getMessage()).toString()
				});
	//  199  361:ldc1            #68  <String "CommonUtil">
	//  200  363:iconst_1        
	//  201  364:anewarray       Object[]
	//  202  367:dup             
	//  203  368:iconst_0        
	//  204  369:new             #120 <Class StringBuilder>
	//  205  372:dup             
	//  206  373:invokespecial   #121 <Method void StringBuilder()>
	//  207  376:ldc2            #1048 <String "verifySignature Exception:">
	//  208  379:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  209  382:aload_0         
	//  210  383:invokevirtual   #647 <Method String IOException.getMessage()>
	//  211  386:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  212  389:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  213  392:aastore         
	//  214  393:invokestatic    #79  <Method void dho.f(String, Object[])>
				return false;
	//  215  396:iconst_0        
	//  216  397:ireturn         
			}
			return false;
		}
		break MISSING_BLOCK_LABEL_450;
		context;
	//  217  398:astore_0        
		if(context1 != null)
	//* 218  399:aload           5
	//* 219  401:ifnull          448
			try
			{
				((JarFile) (context1)).close();
	//  220  404:aload           5
	//  221  406:invokevirtual   #1046 <Method void JarFile.close()>
			}
	//* 222  409:goto            448
			// Misplaced declaration of an exception variable
			catch(String s1)
	//* 223  412:astore_1        
			{
				dho.f("CommonUtil", new Object[] {
					(new StringBuilder()).append("verifySignature Exception:").append(((IOException) (s1)).getMessage()).toString()
				});
	//  224  413:ldc1            #68  <String "CommonUtil">
	//  225  415:iconst_1        
	//  226  416:anewarray       Object[]
	//  227  419:dup             
	//  228  420:iconst_0        
	//  229  421:new             #120 <Class StringBuilder>
	//  230  424:dup             
	//  231  425:invokespecial   #121 <Method void StringBuilder()>
	//  232  428:ldc2            #1048 <String "verifySignature Exception:">
	//  233  431:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  234  434:aload_1         
	//  235  435:invokevirtual   #647 <Method String IOException.getMessage()>
	//  236  438:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  237  441:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  238  444:aastore         
	//  239  445:invokestatic    #79  <Method void dho.f(String, Object[])>
			}
		throw context;
	//  240  448:aload_0         
	//  241  449:athrow          
		return false;
	//  242  450:iconst_0        
	//  243  451:ireturn         
	}

	public static boolean f(String s1)
	{
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #305 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		return !s1.contains(":") || s1.length() <= 16;
	//    5    9:aload_0         
	//    6   10:ldc2            #1050 <String ":">
	//    7   13:invokevirtual   #62  <Method boolean String.contains(CharSequence)>
	//    8   16:ifeq            30
	//    9   19:aload_0         
	//   10   20:invokevirtual   #308 <Method int String.length()>
	//   11   23:bipush          16
	//   12   25:icmple          30
	//   13   28:iconst_0        
	//   14   29:ireturn         
	//   15   30:iconst_1        
	//   16   31:ireturn         
	}

	public static int g(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return -1;
	//    2    4:iconst_m1       
	//    3    5:ireturn         
		int i1;
		try
		{
			i1 = ((TelephonyManager)context.getSystemService("phone")).getPhoneType();
	//    4    6:aload_0         
	//    5    7:ldc2            #292 <String "phone">
	//    6   10:invokevirtual   #162 <Method Object Context.getSystemService(String)>
	//    7   13:checkcast       #294 <Class TelephonyManager>
	//    8   16:invokevirtual   #1056 <Method int TelephonyManager.getPhoneType()>
	//    9   19:istore_1        
			dho.d("CommonUtil", new Object[] {
				(new StringBuilder()).append("getDeviceType() deviceType = ").append(i1).toString()
			});
	//   10   20:ldc1            #68  <String "CommonUtil">
	//   11   22:iconst_1        
	//   12   23:anewarray       Object[]
	//   13   26:dup             
	//   14   27:iconst_0        
	//   15   28:new             #120 <Class StringBuilder>
	//   16   31:dup             
	//   17   32:invokespecial   #121 <Method void StringBuilder()>
	//   18   35:ldc2            #1058 <String "getDeviceType() deviceType = ">
	//   19   38:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   20   41:iload_1         
	//   21   42:invokevirtual   #205 <Method StringBuilder StringBuilder.append(int)>
	//   22   45:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   23   48:aastore         
	//   24   49:invokestatic    #325 <Method void dho.d(String, Object[])>
		}
	//*  25   52:iload_1         
	//*  26   53:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  27   54:astore_0        
		{
			dho.d("CommonUtil", new Object[] {
				"getDeviceType() SecurityException "
			});
	//   28   55:ldc1            #68  <String "CommonUtil">
	//   29   57:iconst_1        
	//   30   58:anewarray       Object[]
	//   31   61:dup             
	//   32   62:iconst_0        
	//   33   63:ldc2            #1060 <String "getDeviceType() SecurityException ">
	//   34   66:aastore         
	//   35   67:invokestatic    #325 <Method void dho.d(String, Object[])>
			return -1;
	//   36   70:iconst_m1       
	//   37   71:ireturn         
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  38   72:astore_0        
		{
			dho.d("CommonUtil", new Object[] {
				"getDeviceType() Exception"
			});
	//   39   73:ldc1            #68  <String "CommonUtil">
	//   40   75:iconst_1        
	//   41   76:anewarray       Object[]
	//   42   79:dup             
	//   43   80:iconst_0        
	//   44   81:ldc2            #1062 <String "getDeviceType() Exception">
	//   45   84:aastore         
	//   46   85:invokestatic    #325 <Method void dho.d(String, Object[])>
			return -1;
	//   47   88:iconst_m1       
	//   48   89:ireturn         
		}
		return i1;
	}

	public static String g()
	{
		Object obj = ((Object) (BaseApplication.a().getResources().getConfiguration()));
	//    0    0:invokestatic    #925 <Method Context BaseApplication.a()>
	//    1    3:invokevirtual   #279 <Method Resources Context.getResources()>
	//    2    6:invokevirtual   #552 <Method Configuration Resources.getConfiguration()>
	//    3    9:astore_1        
		String s1 = ((Configuration) (obj)).locale.getLanguage();
	//    4   10:aload_1         
	//    5   11:getfield        #558 <Field Locale Configuration.locale>
	//    6   14:invokevirtual   #566 <Method String Locale.getLanguage()>
	//    7   17:astore_0        
		obj = ((Object) (((Configuration) (obj)).locale.getCountry()));
	//    8   18:aload_1         
	//    9   19:getfield        #558 <Field Locale Configuration.locale>
	//   10   22:invokevirtual   #563 <Method String Locale.getCountry()>
	//   11   25:astore_1        
		return (new StringBuilder()).append(s1).append("-").append(((String) (obj))).toString();
	//   12   26:new             #120 <Class StringBuilder>
	//   13   29:dup             
	//   14   30:invokespecial   #121 <Method void StringBuilder()>
	//   15   33:aload_0         
	//   16   34:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:ldc1            #215 <String "-">
	//   18   39:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   19   42:aload_1         
	//   20   43:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   21   46:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   22   49:areturn         
	}

	public static String g(String s1)
	{
		String s3 = "";
	//    0    0:ldc1            #217 <String "">
	//    1    2:astore_3        
		String s2 = s3;
	//    2    3:aload_3         
	//    3    4:astore_2        
		if(s1 != null)
	//*   4    5:aload_0         
	//*   5    6:ifnull          77
		{
			s2 = s3;
	//    6    9:aload_3         
	//    7   10:astore_2        
			if(!s1.trim().isEmpty())
	//*   8   11:aload_0         
	//*   9   12:invokevirtual   #321 <Method String String.trim()>
	//*  10   15:invokevirtual   #1065 <Method boolean String.isEmpty()>
	//*  11   18:ifne            77
			{
				Locale alocale[] = Locale.getAvailableLocales();
	//   12   21:invokestatic    #1069 <Method Locale[] Locale.getAvailableLocales()>
	//   13   24:astore          4
				int i1 = 0;
	//   14   26:iconst_0        
	//   15   27:istore_1        
				do
				{
					s2 = s3;
	//   16   28:aload_3         
	//   17   29:astore_2        
					if(i1 >= alocale.length)
						break;
	//   18   30:iload_1         
	//   19   31:aload           4
	//   20   33:arraylength     
	//   21   34:icmpge          77
					if(s1.equalsIgnoreCase(alocale[i1].getCountry()))
	//*  22   37:aload_0         
	//*  23   38:aload           4
	//*  24   40:iload_1         
	//*  25   41:aaload          
	//*  26   42:invokevirtual   #563 <Method String Locale.getCountry()>
	//*  27   45:invokevirtual   #56  <Method boolean String.equalsIgnoreCase(String)>
	//*  28   48:ifeq            70
					{
						s3 = alocale[i1].getDisplayCountry();
	//   29   51:aload           4
	//   30   53:iload_1         
	//   31   54:aaload          
	//   32   55:invokevirtual   #1072 <Method String Locale.getDisplayCountry()>
	//   33   58:astore_3        
						s2 = s3;
	//   34   59:aload_3         
	//   35   60:astore_2        
						if(!"".equals(((Object) (s3))))
							break;
	//   36   61:ldc1            #217 <String "">
	//   37   63:aload_3         
	//   38   64:invokevirtual   #150 <Method boolean String.equals(Object)>
	//   39   67:ifeq            77
					}
					i1++;
	//   40   70:iload_1         
	//   41   71:iconst_1        
	//   42   72:iadd            
	//   43   73:istore_1        
				} while(true);
	//   44   74:goto            28
			}
		}
		return s2;
	//   45   77:aload_2         
	//   46   78:areturn         
	}

	public static void g(Context context, String s1)
	{
		dho.b("CommonUtil", new Object[] {
			"downloadAPKByPKGName"
		});
	//    0    0:ldc1            #68  <String "CommonUtil">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc2            #1074 <String "downloadAPKByPKGName">
	//    6   11:aastore         
	//    7   12:invokestatic    #133 <Method void dho.b(String, Object[])>
		try
		{
			s1 = ((String) (Uri.parse((new StringBuilder()).append("market://details?id=").append(s1).toString())));
	//    8   15:new             #120 <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #121 <Method void StringBuilder()>
	//   11   22:ldc2            #1076 <String "market://details?id=">
	//   12   25:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   13   28:aload_1         
	//   14   29:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   15   32:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   16   35:invokestatic    #1082 <Method Uri Uri.parse(String)>
	//   17   38:astore_1        
		}
	//*  18   39:aload_1         
	//*  19   40:ifnull          86
	//*  20   43:ldc1            #68  <String "CommonUtil">
	//*  21   45:iconst_1        
	//*  22   46:anewarray       Object[]
	//*  23   49:dup             
	//*  24   50:iconst_0        
	//*  25   51:ldc2            #1084 <String "downloadAPKByPKGName startActivity">
	//*  26   54:aastore         
	//*  27   55:invokestatic    #133 <Method void dho.b(String, Object[])>
	//*  28   58:new             #824 <Class Intent>
	//*  29   61:dup             
	//*  30   62:ldc2            #1086 <String "android.intent.action.VIEW">
	//*  31   65:aload_1         
	//*  32   66:invokespecial   #1089 <Method void Intent(String, Uri)>
	//*  33   69:astore_1        
	//*  34   70:aload_1         
	//*  35   71:ldc2            #1090 <Int 0x10000000>
	//*  36   74:invokevirtual   #1094 <Method Intent Intent.addFlags(int)>
	//*  37   77:pop             
	//*  38   78:aload_0         
	//*  39   79:aload_1         
	//*  40   80:invokevirtual   #1098 <Method void Context.startActivity(Intent)>
	//*  41   83:goto            101
	//*  42   86:ldc1            #68  <String "CommonUtil">
	//*  43   88:iconst_1        
	//*  44   89:anewarray       Object[]
	//*  45   92:dup             
	//*  46   93:iconst_0        
	//*  47   94:ldc2            #1100 <String "uri is null!">
	//*  48   97:aastore         
	//*  49   98:invokestatic    #79  <Method void dho.f(String, Object[])>
	//*  50  101:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  51  102:astore_0        
		{
			dho.b("CommonUtil", new Object[] {
				(new StringBuilder()).append("Exception e = ").append(((Exception) (context)).getMessage()).toString()
			});
	//   52  103:ldc1            #68  <String "CommonUtil">
	//   53  105:iconst_1        
	//   54  106:anewarray       Object[]
	//   55  109:dup             
	//   56  110:iconst_0        
	//   57  111:new             #120 <Class StringBuilder>
	//   58  114:dup             
	//   59  115:invokespecial   #121 <Method void StringBuilder()>
	//   60  118:ldc2            #895 <String "Exception e = ">
	//   61  121:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   62  124:aload_0         
	//   63  125:invokevirtual   #73  <Method String Exception.getMessage()>
	//   64  128:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   65  131:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   66  134:aastore         
	//   67  135:invokestatic    #133 <Method void dho.b(String, Object[])>
			return;
	//   68  138:return          
		}
		if(s1 == null)
			break MISSING_BLOCK_LABEL_86;
		dho.b("CommonUtil", new Object[] {
			"downloadAPKByPKGName startActivity"
		});
		s1 = ((String) (new Intent("android.intent.action.VIEW", ((Uri) (s1)))));
		((Intent) (s1)).addFlags(0x10000000);
		context.startActivity(((Intent) (s1)));
		break MISSING_BLOCK_LABEL_101;
		dho.f("CommonUtil", new Object[] {
			"uri is null!"
		});
	}

	public static long h()
	{
		SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	//    0    0:new             #1105 <Class SimpleDateFormat>
	//    1    3:dup             
	//    2    4:ldc2            #1107 <String "yyyy/MM/dd HH:mm:ss">
	//    3    7:invokespecial   #1108 <Method void SimpleDateFormat(String)>
	//    4   10:astore_2        
		long l1;
		try
		{
			l1 = simpledateformat.parse("2019/02/06 23:59:59").getTime();
	//    5   11:aload_2         
	//    6   12:ldc2            #1110 <String "2019/02/06 23:59:59">
	//    7   15:invokevirtual   #1113 <Method Date SimpleDateFormat.parse(String)>
	//    8   18:invokevirtual   #1118 <Method long Date.getTime()>
	//    9   21:lstore_0        
		}
	//*  10   22:lload_0         
	//*  11   23:lreturn         
		catch(ParseException parseexception)
	//*  12   24:astore_2        
		{
			dho.b("CommonUtil", new Object[] {
				(new StringBuilder()).append("ParseException exception = ").append(parseexception.getMessage()).toString()
			});
	//   13   25:ldc1            #68  <String "CommonUtil">
	//   14   27:iconst_1        
	//   15   28:anewarray       Object[]
	//   16   31:dup             
	//   17   32:iconst_0        
	//   18   33:new             #120 <Class StringBuilder>
	//   19   36:dup             
	//   20   37:invokespecial   #121 <Method void StringBuilder()>
	//   21   40:ldc2            #1120 <String "ParseException exception = ">
	//   22   43:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   23   46:aload_2         
	//   24   47:invokevirtual   #1121 <Method String ParseException.getMessage()>
	//   25   50:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   26   53:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   27   56:aastore         
	//   28   57:invokestatic    #133 <Method void dho.b(String, Object[])>
			return 0L;
	//   29   60:lconst_0        
	//   30   61:lreturn         
		}
		return l1;
	}

	public static String h(Context context)
	{
		String s1 = "1.0.0.0";
	//    0    0:ldc2            #1123 <String "1.0.0.0">
	//    1    3:astore_1        
		if(context == null)
	//*   2    4:aload_0         
	//*   3    5:ifnonnull       12
			return "1.0.0.0";
	//    4    8:ldc2            #1123 <String "1.0.0.0">
	//    5   11:areturn         
		String s2 = context.getPackageName();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #154 <Method String Context.getPackageName()>
	//    8   16:astore_2        
		try
		{
			context = ((Context) (context.getPackageManager().getPackageInfo(s2, 0).versionName));
	//    9   17:aload_0         
	//   10   18:invokevirtual   #107 <Method PackageManager Context.getPackageManager()>
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #113 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   14   26:getfield        #1126 <Field String PackageInfo.versionName>
	//   15   29:astore_0        
		}
	//*  16   30:goto            71
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  17   33:astore_0        
		{
			dho.f("CommonUtil", new Object[] {
				(new StringBuilder()).append("getAppVersionName() Exception = ").append(((android.content.pm.PackageManager.NameNotFoundException) (context)).getMessage()).toString()
			});
	//   18   34:ldc1            #68  <String "CommonUtil">
	//   19   36:iconst_1        
	//   20   37:anewarray       Object[]
	//   21   40:dup             
	//   22   41:iconst_0        
	//   23   42:new             #120 <Class StringBuilder>
	//   24   45:dup             
	//   25   46:invokespecial   #121 <Method void StringBuilder()>
	//   26   49:ldc2            #1128 <String "getAppVersionName() Exception = ">
	//   27   52:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   28   55:aload_0         
	//   29   56:invokevirtual   #128 <Method String android.content.pm.PackageManager$NameNotFoundException.getMessage()>
	//   30   59:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   31   62:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   32   65:aastore         
	//   33   66:invokestatic    #79  <Method void dho.f(String, Object[])>
			context = ((Context) (s1));
	//   34   69:aload_1         
	//   35   70:astore_0        
		}
		dho.d("CommonUtil", new Object[] {
			(new StringBuilder()).append("getAppVersionName() version = ").append(((String) (context))).toString()
		});
	//   36   71:ldc1            #68  <String "CommonUtil">
	//   37   73:iconst_1        
	//   38   74:anewarray       Object[]
	//   39   77:dup             
	//   40   78:iconst_0        
	//   41   79:new             #120 <Class StringBuilder>
	//   42   82:dup             
	//   43   83:invokespecial   #121 <Method void StringBuilder()>
	//   44   86:ldc2            #1130 <String "getAppVersionName() version = ">
	//   45   89:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   46   92:aload_0         
	//   47   93:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   48   96:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   49   99:aastore         
	//   50  100:invokestatic    #325 <Method void dho.d(String, Object[])>
		return ((String) (context));
	//   51  103:aload_0         
	//   52  104:areturn         
	}

	public static String h(String s1)
	{
		if(s1 != null && !s1.trim().isEmpty())
	//*   0    0:aload_0         
	//*   1    1:ifnull          53
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #321 <Method String String.trim()>
	//*   4    8:invokevirtual   #1065 <Method boolean String.isEmpty()>
	//*   5   11:ifne            53
		{
			Locale alocale[] = Locale.getAvailableLocales();
	//    6   14:invokestatic    #1069 <Method Locale[] Locale.getAvailableLocales()>
	//    7   17:astore_2        
			for(int i1 = 0; i1 < alocale.length; i1++)
	//*   8   18:iconst_0        
	//*   9   19:istore_1        
	//*  10   20:iload_1         
	//*  11   21:aload_2         
	//*  12   22:arraylength     
	//*  13   23:icmpge          53
				if(s1.equalsIgnoreCase(alocale[i1].getDisplayCountry()))
	//*  14   26:aload_0         
	//*  15   27:aload_2         
	//*  16   28:iload_1         
	//*  17   29:aaload          
	//*  18   30:invokevirtual   #1072 <Method String Locale.getDisplayCountry()>
	//*  19   33:invokevirtual   #56  <Method boolean String.equalsIgnoreCase(String)>
	//*  20   36:ifeq            46
					return alocale[i1].getCountry();
	//   21   39:aload_2         
	//   22   40:iload_1         
	//   23   41:aaload          
	//   24   42:invokevirtual   #563 <Method String Locale.getCountry()>
	//   25   45:areturn         

	//   26   46:iload_1         
	//   27   47:iconst_1        
	//   28   48:iadd            
	//   29   49:istore_1        
		}
	//*  30   50:goto            20
		return "";
	//   31   53:ldc1            #217 <String "">
	//   32   55:areturn         
	}

	public static boolean h(Context context, String s1)
	{
		if(context == null || TextUtils.isEmpty(((CharSequence) (s1))))
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #305 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4    8:ifeq            13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		context = ((Context) (((ActivityManager)context.getSystemService("activity")).getRunningTasks(1)));
	//    7   13:aload_0         
	//    8   14:ldc1            #158 <String "activity">
	//    9   16:invokevirtual   #162 <Method Object Context.getSystemService(String)>
	//   10   19:checkcast       #164 <Class ActivityManager>
	//   11   22:iconst_1        
	//   12   23:invokevirtual   #1133 <Method List ActivityManager.getRunningTasks(int)>
	//   13   26:astore_0        
		if(context != null && ((List) (context)).size() > 0)
	//*  14   27:aload_0         
	//*  15   28:ifnull          102
	//*  16   31:aload_0         
	//*  17   32:invokeinterface #174 <Method int List.size()>
	//*  18   37:ifle            102
		{
			context = ((Context) (((android.app.ActivityManager.RunningTaskInfo)((List) (context)).get(0)).topActivity));
	//   19   40:aload_0         
	//   20   41:iconst_0        
	//   21   42:invokeinterface #939 <Method Object List.get(int)>
	//   22   47:checkcast       #1135 <Class android.app.ActivityManager$RunningTaskInfo>
	//   23   50:getfield        #1138 <Field ComponentName android.app.ActivityManager$RunningTaskInfo.topActivity>
	//   24   53:astore_0        
			dho.d("CommonUtil", new Object[] {
				(new StringBuilder()).append("isForeground getClassName = ").append(((ComponentName) (context)).getClassName()).toString()
			});
	//   25   54:ldc1            #68  <String "CommonUtil">
	//   26   56:iconst_1        
	//   27   57:anewarray       Object[]
	//   28   60:dup             
	//   29   61:iconst_0        
	//   30   62:new             #120 <Class StringBuilder>
	//   31   65:dup             
	//   32   66:invokespecial   #121 <Method void StringBuilder()>
	//   33   69:ldc2            #1140 <String "isForeground getClassName = ">
	//   34   72:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   35   75:aload_0         
	//   36   76:invokevirtual   #269 <Method String ComponentName.getClassName()>
	//   37   79:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   38   82:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   39   85:aastore         
	//   40   86:invokestatic    #325 <Method void dho.d(String, Object[])>
			if(s1.equals(((Object) (((ComponentName) (context)).getClassName()))))
	//*  41   89:aload_1         
	//*  42   90:aload_0         
	//*  43   91:invokevirtual   #269 <Method String ComponentName.getClassName()>
	//*  44   94:invokevirtual   #150 <Method boolean String.equals(Object)>
	//*  45   97:ifeq            102
				return true;
	//   46  100:iconst_1        
	//   47  101:ireturn         
		}
		return false;
	//   48  102:iconst_0        
	//   49  103:ireturn         
	}

	public static String i(String s1)
	{
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #305 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return s1;
	//    3    7:aload_0         
	//    4    8:areturn         
		int i1 = s1.length();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #308 <Method int String.length()>
	//    7   13:istore_1        
		if(i1 <= 2)
	//*   8   14:iload_1         
	//*   9   15:iconst_2        
	//*  10   16:icmpgt          23
			return "**";
	//   11   19:ldc2            #1143 <String "**">
	//   12   22:areturn         
		if(i1 <= 8)
	//*  13   23:iload_1         
	//*  14   24:bipush          8
	//*  15   26:icmpgt          40
			return b(s1, 1, i1 / 3 - 1);
	//   16   29:aload_0         
	//   17   30:iconst_1        
	//   18   31:iload_1         
	//   19   32:iconst_3        
	//   20   33:idiv            
	//   21   34:iconst_1        
	//   22   35:isub            
	//   23   36:invokestatic    #1145 <Method String b(String, int, int)>
	//   24   39:areturn         
		else
			return b(s1, 3, 4);
	//   25   40:aload_0         
	//   26   41:iconst_3        
	//   27   42:iconst_4        
	//   28   43:invokestatic    #1145 <Method String b(String, int, int)>
	//   29   46:areturn         
	}

	public static void i(Context context)
	{
		context.startActivity(new Intent("android.settings.SETTINGS"));
	//    0    0:aload_0         
	//    1    1:new             #824 <Class Intent>
	//    2    4:dup             
	//    3    5:ldc2            #1147 <String "android.settings.SETTINGS">
	//    4    8:invokespecial   #825 <Method void Intent(String)>
	//    5   11:invokevirtual   #1098 <Method void Context.startActivity(Intent)>
	//    6   14:return          
	}

	public static boolean i()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public static boolean i(Context context, String s1)
	{
		try
		{
			context = ((Context) (context.getPackageManager().getPackageInfo(s1, 0)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #107 <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #113 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    5    9:astore_0        
		}
	//*   6   10:goto            16
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   7   13:astore_0        
		{
			context = null;
	//    8   14:aconst_null     
	//    9   15:astore_0        
		}
		return context != null;
	//   10   16:aload_0         
	//   11   17:ifnull          22
	//   12   20:iconst_1        
	//   13   21:ireturn         
	//   14   22:iconst_0        
	//   15   23:ireturn         
	}

	private static int j()
	{
		int i1;
		boolean flag;
		dho.b("CommonUtil", new Object[] {
			"Enter getEmuiVersionCodeEx"
		});
	//    0    0:ldc1            #68  <String "CommonUtil">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc2            #1150 <String "Enter getEmuiVersionCodeEx">
	//    6   11:aastore         
	//    7   12:invokestatic    #133 <Method void dho.b(String, Object[])>
		flag = false;
	//    8   15:iconst_0        
	//    9   16:istore_1        
		i1 = 0;
	//   10   17:iconst_0        
	//   11   18:istore_0        
		Object obj = a("android.os.SystemProperties", "get", new Class[] {
			java/lang/String, java/lang/String
		}, new Object[] {
			"ro.build.hw_emui_api_level", ""
		});
	//   12   19:ldc2            #495 <String "android.os.SystemProperties">
	//   13   22:ldc2            #496 <String "get">
	//   14   25:iconst_2        
	//   15   26:anewarray       Class[]
	//   16   29:dup             
	//   17   30:iconst_0        
	//   18   31:ldc1            #46  <Class String>
	//   19   33:aastore         
	//   20   34:dup             
	//   21   35:iconst_1        
	//   22   36:ldc1            #46  <Class String>
	//   23   38:aastore         
	//   24   39:iconst_2        
	//   25   40:anewarray       Object[]
	//   26   43:dup             
	//   27   44:iconst_0        
	//   28   45:ldc2            #1152 <String "ro.build.hw_emui_api_level">
	//   29   48:aastore         
	//   30   49:dup             
	//   31   50:iconst_1        
	//   32   51:ldc1            #217 <String "">
	//   33   53:aastore         
	//   34   54:invokestatic    #1154 <Method Object a(String, String, Class[], Object[])>
	//   35   57:astore_2        
		if(obj != null)
	//*  36   58:aload_2         
	//*  37   59:ifnull          70
			try
			{
				i1 = Integer.parseInt(obj.toString());
	//   38   62:aload_2         
	//   39   63:invokevirtual   #1155 <Method String Object.toString()>
	//   40   66:invokestatic    #786 <Method int Integer.parseInt(String)>
	//   41   69:istore_0        
			}
	//*  42   70:goto            111
			catch(Exception exception)
	//*  43   73:astore_2        
			{
				dho.e("CommonUtil", new Object[] {
					(new StringBuilder()).append("getEmuiVersionCodeEx\u3000Exception\u3000").append(exception.getMessage()).toString()
				});
	//   44   74:ldc1            #68  <String "CommonUtil">
	//   45   76:iconst_1        
	//   46   77:anewarray       Object[]
	//   47   80:dup             
	//   48   81:iconst_0        
	//   49   82:new             #120 <Class StringBuilder>
	//   50   85:dup             
	//   51   86:invokespecial   #121 <Method void StringBuilder()>
	//   52   89:ldc2            #1157 <String "getEmuiVersionCodeEx\u3000Exception\u3000">
	//   53   92:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   54   95:aload_2         
	//   55   96:invokevirtual   #73  <Method String Exception.getMessage()>
	//   56   99:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   57  102:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   58  105:aastore         
	//   59  106:invokestatic    #660 <Method void dho.e(String, Object[])>
				i1 = ((int) (flag));
	//   60  109:iload_1         
	//   61  110:istore_0        
			}
		dho.b("CommonUtil", new Object[] {
			(new StringBuilder()).append("getEmuiVersionCodeEx\u3000emUIversion=\u3000").append(i1).toString()
		});
	//   62  111:ldc1            #68  <String "CommonUtil">
	//   63  113:iconst_1        
	//   64  114:anewarray       Object[]
	//   65  117:dup             
	//   66  118:iconst_0        
	//   67  119:new             #120 <Class StringBuilder>
	//   68  122:dup             
	//   69  123:invokespecial   #121 <Method void StringBuilder()>
	//   70  126:ldc2            #1159 <String "getEmuiVersionCodeEx\u3000emUIversion=\u3000">
	//   71  129:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   72  132:iload_0         
	//   73  133:invokevirtual   #205 <Method StringBuilder StringBuilder.append(int)>
	//   74  136:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   75  139:aastore         
	//   76  140:invokestatic    #133 <Method void dho.b(String, Object[])>
		return i1;
	//   77  143:iload_0         
	//   78  144:ireturn         
	}

	public static void j(Context context)
	{
		String s1;
		Object obj;
		Intent intent;
		try
		{
			PackageInfo packageinfo = context.getPackageManager().getPackageInfo("com.huawei.bone", 0);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #107 <Method PackageManager Context.getPackageManager()>
	//    2    4:ldc1            #237 <String "com.huawei.bone">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #113 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    5   10:astore_1        
			obj = ((Object) (new Intent("android.intent.action.MAIN", ((Uri) (null)))));
	//    6   11:new             #824 <Class Intent>
	//    7   14:dup             
	//    8   15:ldc2            #1161 <String "android.intent.action.MAIN">
	//    9   18:aconst_null     
	//   10   19:invokespecial   #1089 <Method void Intent(String, Uri)>
	//   11   22:astore_2        
			((Intent) (obj)).addCategory("android.intent.category.LAUNCHER");
	//   12   23:aload_2         
	//   13   24:ldc2            #1163 <String "android.intent.category.LAUNCHER">
	//   14   27:invokevirtual   #1166 <Method Intent Intent.addCategory(String)>
	//   15   30:pop             
			((Intent) (obj)).setPackage(packageinfo.packageName);
	//   16   31:aload_2         
	//   17   32:aload_1         
	//   18   33:getfield        #1169 <Field String PackageInfo.packageName>
	//   19   36:invokevirtual   #829 <Method Intent Intent.setPackage(String)>
	//   20   39:pop             
			obj = ((Object) ((ResolveInfo)context.getPackageManager().queryIntentActivities(((Intent) (obj)), 0).iterator().next()));
	//   21   40:aload_0         
	//   22   41:invokevirtual   #107 <Method PackageManager Context.getPackageManager()>
	//   23   44:aload_2         
	//   24   45:iconst_0        
	//   25   46:invokevirtual   #1173 <Method List PackageManager.queryIntentActivities(Intent, int)>
	//   26   49:invokeinterface #180 <Method Iterator List.iterator()>
	//   27   54:invokeinterface #189 <Method Object Iterator.next()>
	//   28   59:checkcast       #1175 <Class ResolveInfo>
	//   29   62:astore_2        
		}
	//*  30   63:aload_2         
	//*  31   64:ifnull          137
	//*  32   67:aload_2         
	//*  33   68:getfield        #1179 <Field ActivityInfo ResolveInfo.activityInfo>
	//*  34   71:getfield        #1182 <Field String ActivityInfo.packageName>
	//*  35   74:astore_1        
	//*  36   75:aload_2         
	//*  37   76:getfield        #1179 <Field ActivityInfo ResolveInfo.activityInfo>
	//*  38   79:getfield        #1185 <Field String ActivityInfo.name>
	//*  39   82:astore_2        
	//*  40   83:new             #824 <Class Intent>
	//*  41   86:dup             
	//*  42   87:ldc2            #1161 <String "android.intent.action.MAIN">
	//*  43   90:invokespecial   #825 <Method void Intent(String)>
	//*  44   93:astore_3        
	//*  45   94:aload_3         
	//*  46   95:ldc2            #1163 <String "android.intent.category.LAUNCHER">
	//*  47   98:invokevirtual   #1166 <Method Intent Intent.addCategory(String)>
	//*  48  101:pop             
	//*  49  102:aload_3         
	//*  50  103:new             #266 <Class ComponentName>
	//*  51  106:dup             
	//*  52  107:aload_1         
	//*  53  108:aload_2         
	//*  54  109:invokespecial   #1187 <Method void ComponentName(String, String)>
	//*  55  112:invokevirtual   #1191 <Method Intent Intent.setComponent(ComponentName)>
	//*  56  115:pop             
	//*  57  116:aload_3         
	//*  58  117:ldc2            #1192 <Int 0x10200000>
	//*  59  120:invokevirtual   #1195 <Method Intent Intent.setFlags(int)>
	//*  60  123:pop             
	//*  61  124:aload_3         
	//*  62  125:ldc2            #1086 <String "android.intent.action.VIEW">
	//*  63  128:invokevirtual   #1198 <Method Intent Intent.setAction(String)>
	//*  64  131:pop             
	//*  65  132:aload_0         
	//*  66  133:aload_3         
	//*  67  134:invokevirtual   #1098 <Method void Context.startActivity(Intent)>
	//*  68  137:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  69  138:astore_0        
		{
			dho.f("CommonUtil", new Object[] {
				(new StringBuilder()).append("Exception e = ").append(((android.content.pm.PackageManager.NameNotFoundException) (context)).getMessage()).toString()
			});
	//   70  139:ldc1            #68  <String "CommonUtil">
	//   71  141:iconst_1        
	//   72  142:anewarray       Object[]
	//   73  145:dup             
	//   74  146:iconst_0        
	//   75  147:new             #120 <Class StringBuilder>
	//   76  150:dup             
	//   77  151:invokespecial   #121 <Method void StringBuilder()>
	//   78  154:ldc2            #895 <String "Exception e = ">
	//   79  157:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   80  160:aload_0         
	//   81  161:invokevirtual   #128 <Method String android.content.pm.PackageManager$NameNotFoundException.getMessage()>
	//   82  164:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   83  167:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   84  170:aastore         
	//   85  171:invokestatic    #79  <Method void dho.f(String, Object[])>
			return;
	//   86  174:return          
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_137;
		s1 = ((ResolveInfo) (obj)).activityInfo.packageName;
		obj = ((Object) (((ResolveInfo) (obj)).activityInfo.name));
		intent = new Intent("android.intent.action.MAIN");
		intent.addCategory("android.intent.category.LAUNCHER");
		intent.setComponent(new ComponentName(s1, ((String) (obj))));
		intent.setFlags(0x10200000);
		intent.setAction("android.intent.action.VIEW");
		context.startActivity(intent);
	}

	public static long k()
	{
		SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	//    0    0:new             #1105 <Class SimpleDateFormat>
	//    1    3:dup             
	//    2    4:ldc2            #1107 <String "yyyy/MM/dd HH:mm:ss">
	//    3    7:invokespecial   #1108 <Method void SimpleDateFormat(String)>
	//    4   10:astore_2        
		long l1;
		try
		{
			l1 = simpledateformat.parse("2018/12/06 00:00:00").getTime();
	//    5   11:aload_2         
	//    6   12:ldc2            #1200 <String "2018/12/06 00:00:00">
	//    7   15:invokevirtual   #1113 <Method Date SimpleDateFormat.parse(String)>
	//    8   18:invokevirtual   #1118 <Method long Date.getTime()>
	//    9   21:lstore_0        
		}
	//*  10   22:lload_0         
	//*  11   23:lreturn         
		catch(ParseException parseexception)
	//*  12   24:astore_2        
		{
			dho.b("CommonUtil", new Object[] {
				(new StringBuilder()).append("ParseException exception = ").append(parseexception.getMessage()).toString()
			});
	//   13   25:ldc1            #68  <String "CommonUtil">
	//   14   27:iconst_1        
	//   15   28:anewarray       Object[]
	//   16   31:dup             
	//   17   32:iconst_0        
	//   18   33:new             #120 <Class StringBuilder>
	//   19   36:dup             
	//   20   37:invokespecial   #121 <Method void StringBuilder()>
	//   21   40:ldc2            #1120 <String "ParseException exception = ">
	//   22   43:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   23   46:aload_2         
	//   24   47:invokevirtual   #1121 <Method String ParseException.getMessage()>
	//   25   50:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   26   53:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   27   56:aastore         
	//   28   57:invokestatic    #133 <Method void dho.b(String, Object[])>
			return 0L;
	//   29   60:lconst_0        
	//   30   61:lreturn         
		}
		return l1;
	}

	public static long k(Context context, String s1)
	{
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #305 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            24
		{
			dho.d("CommonUtil", new Object[] {
				"stringToLong str is empty"
			});
	//    3    7:ldc1            #68  <String "CommonUtil">
	//    4    9:iconst_1        
	//    5   10:anewarray       Object[]
	//    6   13:dup             
	//    7   14:iconst_0        
	//    8   15:ldc2            #1203 <String "stringToLong str is empty">
	//    9   18:aastore         
	//   10   19:invokestatic    #325 <Method void dho.d(String, Object[])>
			return 0L;
	//   11   22:lconst_0        
	//   12   23:lreturn         
		}
		long l1;
		try
		{
			l1 = Long.parseLong(s1);
	//   13   24:aload_1         
	//   14   25:invokestatic    #758 <Method long Long.parseLong(String)>
	//   15   28:lstore_2        
		}
	//*  16   29:lload_2         
	//*  17   30:lreturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  18   31:astore_0        
		{
			dho.f("CommonUtil", new Object[] {
				(new StringBuilder()).append("Exception e = ").append(((NumberFormatException) (context)).getMessage()).toString()
			});
	//   19   32:ldc1            #68  <String "CommonUtil">
	//   20   34:iconst_1        
	//   21   35:anewarray       Object[]
	//   22   38:dup             
	//   23   39:iconst_0        
	//   24   40:new             #120 <Class StringBuilder>
	//   25   43:dup             
	//   26   44:invokespecial   #121 <Method void StringBuilder()>
	//   27   47:ldc2            #895 <String "Exception e = ">
	//   28   50:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   29   53:aload_0         
	//   30   54:invokevirtual   #896 <Method String NumberFormatException.getMessage()>
	//   31   57:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   32   60:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   33   63:aastore         
	//   34   64:invokestatic    #79  <Method void dho.f(String, Object[])>
			return 0L;
	//   35   67:lconst_0        
	//   36   68:lreturn         
		}
		return l1;
	}

	public static Object k(String s1)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		Class class1 = Class.forName(s1);
	//    2    2:aload_0         
	//    3    3:invokestatic    #480 <Method Class Class.forName(String)>
	//    4    6:astore_2        
		s1 = ((String) (class1));
	//    5    7:aload_2         
	//    6    8:astore_0        
		break MISSING_BLOCK_LABEL_47;
	//    7    9:goto            47
		ClassNotFoundException classnotfoundexception;
		classnotfoundexception;
	//    8   12:astore_2        
		dho.f("CommonUtil", new Object[] {
			(new StringBuilder()).append("can not find class:").append(s1).toString()
		});
	//    9   13:ldc1            #68  <String "CommonUtil">
	//   10   15:iconst_1        
	//   11   16:anewarray       Object[]
	//   12   19:dup             
	//   13   20:iconst_0        
	//   14   21:new             #120 <Class StringBuilder>
	//   15   24:dup             
	//   16   25:invokespecial   #121 <Method void StringBuilder()>
	//   17   28:ldc2            #813 <String "can not find class:">
	//   18   31:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   19   34:aload_0         
	//   20   35:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   21   38:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   22   41:aastore         
	//   23   42:invokestatic    #79  <Method void dho.f(String, Object[])>
		s1 = ((String) (obj));
	//   24   45:aload_1         
	//   25   46:astore_0        
		if(s1 != null)
	//*  26   47:aload_0         
	//*  27   48:ifnull          134
		{
			try
			{
				s1 = ((String) (((Class) (s1)).newInstance()));
	//   28   51:aload_0         
	//   29   52:invokevirtual   #1208 <Method Object Class.newInstance()>
	//   30   55:astore_0        
			}
	//*  31   56:aload_0         
	//*  32   57:areturn         
			// Misplaced declaration of an exception variable
			catch(String s1)
	//*  33   58:astore_0        
			{
				dho.f("CommonUtil", new Object[] {
					(new StringBuilder()).append("class creat instance error :").append(((InstantiationException) (s1)).getMessage()).toString()
				});
	//   34   59:ldc1            #68  <String "CommonUtil">
	//   35   61:iconst_1        
	//   36   62:anewarray       Object[]
	//   37   65:dup             
	//   38   66:iconst_0        
	//   39   67:new             #120 <Class StringBuilder>
	//   40   70:dup             
	//   41   71:invokespecial   #121 <Method void StringBuilder()>
	//   42   74:ldc2            #1210 <String "class creat instance error :">
	//   43   77:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   44   80:aload_0         
	//   45   81:invokevirtual   #1211 <Method String InstantiationException.getMessage()>
	//   46   84:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   47   87:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   48   90:aastore         
	//   49   91:invokestatic    #79  <Method void dho.f(String, Object[])>
				return ((Object) (null));
	//   50   94:aconst_null     
	//   51   95:areturn         
			}
			// Misplaced declaration of an exception variable
			catch(String s1)
	//*  52   96:astore_0        
			{
				dho.f("CommonUtil", new Object[] {
					(new StringBuilder()).append("class creat instance error :").append(((IllegalAccessException) (s1)).getMessage()).toString()
				});
	//   53   97:ldc1            #68  <String "CommonUtil">
	//   54   99:iconst_1        
	//   55  100:anewarray       Object[]
	//   56  103:dup             
	//   57  104:iconst_0        
	//   58  105:new             #120 <Class StringBuilder>
	//   59  108:dup             
	//   60  109:invokespecial   #121 <Method void StringBuilder()>
	//   61  112:ldc2            #1210 <String "class creat instance error :">
	//   62  115:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   63  118:aload_0         
	//   64  119:invokevirtual   #534 <Method String IllegalAccessException.getMessage()>
	//   65  122:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   66  125:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   67  128:aastore         
	//   68  129:invokestatic    #79  <Method void dho.f(String, Object[])>
				return ((Object) (null));
	//   69  132:aconst_null     
	//   70  133:areturn         
			}
			return ((Object) (s1));
		} else
		{
			return ((Object) (null));
	//   71  134:aconst_null     
	//   72  135:areturn         
		}
	}

	public static String k(Context context)
	{
		return (new StringBuilder()).append("and_health_").append(h(context)).toString();
	//    0    0:new             #120 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #121 <Method void StringBuilder()>
	//    3    7:ldc2            #1213 <String "and_health_">
	//    4   10:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//    5   13:aload_0         
	//    6   14:invokestatic    #1215 <Method String h(Context)>
	//    7   17:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//    8   20:invokevirtual   #131 <Method String StringBuilder.toString()>
	//    9   23:areturn         
	}

	static String l(String s1)
	{
		c = s1;
	//    0    0:aload_0         
	//    1    1:putstatic       #26  <Field String c>
		return s1;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

	public static boolean l()
	{
		dho.b("CommonUtil", new Object[] {
			"Enter isVersionUpEMUI_9_0"
		});
	//    0    0:ldc1            #68  <String "CommonUtil">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc2            #1218 <String "Enter isVersionUpEMUI_9_0">
	//    6   11:aastore         
	//    7   12:invokestatic    #133 <Method void dho.b(String, Object[])>
		boolean flag1 = false;
	//    8   15:iconst_0        
	//    9   16:istore_2        
		boolean flag = flag1;
	//   10   17:iload_2         
	//   11   18:istore_1        
		if(p("com.huawei.android.os.BuildEx"))
	//*  12   19:ldc2            #1220 <String "com.huawei.android.os.BuildEx">
	//*  13   22:invokestatic    #1222 <Method boolean p(String)>
	//*  14   25:ifeq            74
		{
			int i1 = j();
	//   15   28:invokestatic    #1224 <Method int j()>
	//   16   31:istore_0        
			dho.b("CommonUtil", new Object[] {
				(new StringBuilder()).append("EMUI Version = ").append(i1).toString()
			});
	//   17   32:ldc1            #68  <String "CommonUtil">
	//   18   34:iconst_1        
	//   19   35:anewarray       Object[]
	//   20   38:dup             
	//   21   39:iconst_0        
	//   22   40:new             #120 <Class StringBuilder>
	//   23   43:dup             
	//   24   44:invokespecial   #121 <Method void StringBuilder()>
	//   25   47:ldc2            #1226 <String "EMUI Version = ">
	//   26   50:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   27   53:iload_0         
	//   28   54:invokevirtual   #205 <Method StringBuilder StringBuilder.append(int)>
	//   29   57:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   30   60:aastore         
	//   31   61:invokestatic    #133 <Method void dho.b(String, Object[])>
			flag = flag1;
	//   32   64:iload_2         
	//   33   65:istore_1        
			if(i1 >= 14)
	//*  34   66:iload_0         
	//*  35   67:bipush          14
	//*  36   69:icmplt          74
				flag = true;
	//   37   72:iconst_1        
	//   38   73:istore_1        
		}
		return flag;
	//   39   74:iload_1         
	//   40   75:ireturn         
	}

	public static boolean l(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		Object obj = ((Object) (((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses()));
	//    4    6:aload_0         
	//    5    7:ldc1            #158 <String "activity">
	//    6    9:invokevirtual   #162 <Method Object Context.getSystemService(String)>
	//    7   12:checkcast       #164 <Class ActivityManager>
	//    8   15:invokevirtual   #168 <Method List ActivityManager.getRunningAppProcesses()>
	//    9   18:astore_1        
		if(obj == null)
	//*  10   19:aload_1         
	//*  11   20:ifnonnull       25
			return false;
	//   12   23:iconst_0        
	//   13   24:ireturn         
		context = ((Context) (context.getPackageName()));
	//   14   25:aload_0         
	//   15   26:invokevirtual   #154 <Method String Context.getPackageName()>
	//   16   29:astore_0        
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*  17   30:aload_1         
	//*  18   31:invokeinterface #180 <Method Iterator List.iterator()>
	//*  19   36:astore_1        
	//*  20   37:aload_1         
	//*  21   38:invokeinterface #185 <Method boolean Iterator.hasNext()>
	//*  22   43:ifeq            81
		{
			android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
	//   23   46:aload_1         
	//   24   47:invokeinterface #189 <Method Object Iterator.next()>
	//   25   52:checkcast       #191 <Class android.app.ActivityManager$RunningAppProcessInfo>
	//   26   55:astore_2        
			if(runningappprocessinfo.importance == 100 && runningappprocessinfo.processName.equals(((Object) (context))))
	//*  27   56:aload_2         
	//*  28   57:getfield        #202 <Field int android.app.ActivityManager$RunningAppProcessInfo.importance>
	//*  29   60:bipush          100
	//*  30   62:icmpne          78
	//*  31   65:aload_2         
	//*  32   66:getfield        #196 <Field String android.app.ActivityManager$RunningAppProcessInfo.processName>
	//*  33   69:aload_0         
	//*  34   70:invokevirtual   #150 <Method boolean String.equals(Object)>
	//*  35   73:ifeq            78
				return true;
	//   36   76:iconst_1        
	//   37   77:ireturn         
		}

	//*  38   78:goto            37
		return false;
	//   39   81:iconst_0        
	//   40   82:ireturn         
	}

	public static boolean l(Context context, String s1)
	{
		return context.getSharedPreferences("permissionList", 0).getBoolean(s1, true);
	//    0    0:aload_0         
	//    1    1:ldc2            #1228 <String "permissionList">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #1232 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    4    8:aload_1         
	//    5    9:iconst_1        
	//    6   10:invokeinterface #1238 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    7   15:ireturn         
	}

	public static void m(Context context, String s1)
	{
		context = ((Context) (context.getSharedPreferences("permissionList", 0).edit()));
	//    0    0:aload_0         
	//    1    1:ldc2            #1228 <String "permissionList">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #1232 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    4    8:invokeinterface #1242 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   13:astore_0        
		((android.content.SharedPreferences.Editor) (context)).putBoolean(s1, false);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:iconst_0        
	//    9   17:invokeinterface #1248 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   10   22:pop             
		((android.content.SharedPreferences.Editor) (context)).apply();
	//   11   23:aload_0         
	//   12   24:invokeinterface #1251 <Method void android.content.SharedPreferences$Editor.apply()>
	//   13   29:return          
	}

	public static boolean m()
	{
		dho.b("CommonUtil", new Object[] {
			"Enter isVersionUpEMUI_5_0"
		});
	//    0    0:ldc1            #68  <String "CommonUtil">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc2            #1253 <String "Enter isVersionUpEMUI_5_0">
	//    6   11:aastore         
	//    7   12:invokestatic    #133 <Method void dho.b(String, Object[])>
		boolean flag1 = false;
	//    8   15:iconst_0        
	//    9   16:istore_2        
		boolean flag = flag1;
	//   10   17:iload_2         
	//   11   18:istore_1        
		if(p("com.huawei.android.os.BuildEx"))
	//*  12   19:ldc2            #1220 <String "com.huawei.android.os.BuildEx">
	//*  13   22:invokestatic    #1222 <Method boolean p(String)>
	//*  14   25:ifeq            74
		{
			int i1 = j();
	//   15   28:invokestatic    #1224 <Method int j()>
	//   16   31:istore_0        
			dho.b("CommonUtil", new Object[] {
				(new StringBuilder()).append("EMUI Version = ").append(i1).toString()
			});
	//   17   32:ldc1            #68  <String "CommonUtil">
	//   18   34:iconst_1        
	//   19   35:anewarray       Object[]
	//   20   38:dup             
	//   21   39:iconst_0        
	//   22   40:new             #120 <Class StringBuilder>
	//   23   43:dup             
	//   24   44:invokespecial   #121 <Method void StringBuilder()>
	//   25   47:ldc2            #1226 <String "EMUI Version = ">
	//   26   50:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   27   53:iload_0         
	//   28   54:invokevirtual   #205 <Method StringBuilder StringBuilder.append(int)>
	//   29   57:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   30   60:aastore         
	//   31   61:invokestatic    #133 <Method void dho.b(String, Object[])>
			flag = flag1;
	//   32   64:iload_2         
	//   33   65:istore_1        
			if(i1 > 11)
	//*  34   66:iload_0         
	//*  35   67:bipush          11
	//*  36   69:icmple          74
				flag = true;
	//   37   72:iconst_1        
	//   38   73:istore_1        
		}
		return flag;
	//   39   74:iload_1         
	//   40   75:ireturn         
	}

	public static boolean m(Context context)
	{
		context = ((Context) (((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo()));
	//    0    0:aload_0         
	//    1    1:ldc2            #1013 <String "connectivity">
	//    2    4:invokevirtual   #162 <Method Object Context.getSystemService(String)>
	//    3    7:checkcast       #1015 <Class ConnectivityManager>
	//    4   10:invokevirtual   #1019 <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//    5   13:astore_0        
		return context != null && ((NetworkInfo) (context)).getType() == 0;
	//    6   14:aload_0         
	//    7   15:ifnull          27
	//    8   18:aload_0         
	//    9   19:invokevirtual   #1256 <Method int NetworkInfo.getType()>
	//   10   22:ifne            27
	//   11   25:iconst_1        
	//   12   26:ireturn         
	//   13   27:iconst_0        
	//   14   28:ireturn         
	}

	public static String n(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
			return "";
	//    2    4:ldc1            #217 <String "">
	//    3    6:areturn         
		try
		{
			context = ((Context) (((TelephonyManager)context.getSystemService("phone")).getDeviceId()));
	//    4    7:aload_0         
	//    5    8:ldc2            #292 <String "phone">
	//    6   11:invokevirtual   #162 <Method Object Context.getSystemService(String)>
	//    7   14:checkcast       #294 <Class TelephonyManager>
	//    8   17:invokevirtual   #1259 <Method String TelephonyManager.getDeviceId()>
	//    9   20:astore_0        
			dho.d("CommonUtil", new Object[] {
				(new StringBuilder()).append("getIMEI() imei = ").append(((String) (context))).toString()
			});
	//   10   21:ldc1            #68  <String "CommonUtil">
	//   11   23:iconst_1        
	//   12   24:anewarray       Object[]
	//   13   27:dup             
	//   14   28:iconst_0        
	//   15   29:new             #120 <Class StringBuilder>
	//   16   32:dup             
	//   17   33:invokespecial   #121 <Method void StringBuilder()>
	//   18   36:ldc2            #1261 <String "getIMEI() imei = ">
	//   19   39:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   20   42:aload_0         
	//   21   43:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   22   46:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   23   49:aastore         
	//   24   50:invokestatic    #325 <Method void dho.d(String, Object[])>
		}
	//*  25   53:aload_0         
	//*  26   54:ifnonnull       60
	//*  27   57:ldc1            #217 <String "">
	//*  28   59:areturn         
	//*  29   60:ldc1            #68  <String "CommonUtil">
	//*  30   62:iconst_1        
	//*  31   63:anewarray       Object[]
	//*  32   66:dup             
	//*  33   67:iconst_0        
	//*  34   68:ldc2            #1263 <String "getIMEI ok..">
	//*  35   71:aastore         
	//*  36   72:invokestatic    #133 <Method void dho.b(String, Object[])>
	//*  37   75:aload_0         
	//*  38   76:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  39   77:astore_0        
		{
			dho.d("CommonUtil", new Object[] {
				"getIMEI() SecurityException "
			});
	//   40   78:ldc1            #68  <String "CommonUtil">
	//   41   80:iconst_1        
	//   42   81:anewarray       Object[]
	//   43   84:dup             
	//   44   85:iconst_0        
	//   45   86:ldc2            #1265 <String "getIMEI() SecurityException ">
	//   46   89:aastore         
	//   47   90:invokestatic    #325 <Method void dho.d(String, Object[])>
			return "";
	//   48   93:ldc1            #217 <String "">
	//   49   95:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  50   96:astore_0        
		{
			dho.d("CommonUtil", new Object[] {
				"getIMEI() Exception"
			});
	//   51   97:ldc1            #68  <String "CommonUtil">
	//   52   99:iconst_1        
	//   53  100:anewarray       Object[]
	//   54  103:dup             
	//   55  104:iconst_0        
	//   56  105:ldc2            #1267 <String "getIMEI() Exception">
	//   57  108:aastore         
	//   58  109:invokestatic    #325 <Method void dho.d(String, Object[])>
			return "";
	//   59  112:ldc1            #217 <String "">
	//   60  114:areturn         
		}
		if(context == null)
			return "";
		dho.b("CommonUtil", new Object[] {
			"getIMEI ok.."
		});
		return ((String) (context));
	}

	private static String n(String s1)
	{
		String s2 = "";
	//    0    0:ldc1            #217 <String "">
	//    1    2:astore_1        
		Object obj;
		try
		{
			obj = c("android.os.SystemProperties", "get", new Class[] {
				java/lang/String
			}, new Object[] {
				s1
			});
	//    2    3:ldc2            #495 <String "android.os.SystemProperties">
	//    3    6:ldc2            #496 <String "get">
	//    4    9:iconst_1        
	//    5   10:anewarray       Class[]
	//    6   13:dup             
	//    7   14:iconst_0        
	//    8   15:ldc1            #46  <Class String>
	//    9   17:aastore         
	//   10   18:iconst_1        
	//   11   19:anewarray       Object[]
	//   12   22:dup             
	//   13   23:iconst_0        
	//   14   24:aload_0         
	//   15   25:aastore         
	//   16   26:invokestatic    #1269 <Method Object c(String, String, Class[], Object[])>
	//   17   29:astore_2        
		}
	//*  18   30:aload_1         
	//*  19   31:astore_0        
	//*  20   32:aload_2         
	//*  21   33:ifnull          41
	//*  22   36:aload_2         
	//*  23   37:checkcast       #46  <Class String>
	//*  24   40:astore_0        
	//*  25   41:aload_0         
	//*  26   42:areturn         
		// Misplaced declaration of an exception variable
		catch(String s1)
	//*  27   43:astore_0        
		{
			dho.b("CommonUtil", new Object[] {
				(new StringBuilder()).append("getSystemProperties can not get property: ").append(((Exception) (s1)).getMessage()).toString()
			});
	//   28   44:ldc1            #68  <String "CommonUtil">
	//   29   46:iconst_1        
	//   30   47:anewarray       Object[]
	//   31   50:dup             
	//   32   51:iconst_0        
	//   33   52:new             #120 <Class StringBuilder>
	//   34   55:dup             
	//   35   56:invokespecial   #121 <Method void StringBuilder()>
	//   36   59:ldc2            #1271 <String "getSystemProperties can not get property: ">
	//   37   62:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   38   65:aload_0         
	//   39   66:invokevirtual   #73  <Method String Exception.getMessage()>
	//   40   69:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   41   72:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   42   75:aastore         
	//   43   76:invokestatic    #133 <Method void dho.b(String, Object[])>
			return "";
	//   44   79:ldc1            #217 <String "">
	//   45   81:areturn         
		}
		s1 = s2;
		if(obj == null)
			break MISSING_BLOCK_LABEL_41;
		s1 = (String)obj;
		return s1;
	}

	public static boolean n()
	{
		return dbp.b();
	//    0    0:invokestatic    #1274 <Method boolean dbp.b()>
	//    1    3:ireturn         
	}

	public static boolean n(Context context, String s1)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public static int o(Context context)
	{
		int i1;
		byte byte0 = -1;
	//    0    0:iconst_m1       
	//    1    1:istore_2        
		int j1;
		NetworkInfo networkinfo;
		try
		{
			networkinfo = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
	//    2    2:aload_0         
	//    3    3:ldc2            #1013 <String "connectivity">
	//    4    6:invokevirtual   #162 <Method Object Context.getSystemService(String)>
	//    5    9:checkcast       #1015 <Class ConnectivityManager>
	//    6   12:invokevirtual   #1019 <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//    7   15:astore          4
		}
	//*   8   17:iload_2         
	//*   9   18:istore_1        
	//*  10   19:aload           4
	//*  11   21:ifnull          77
	//*  12   24:iload_2         
	//*  13   25:istore_1        
	//*  14   26:aload           4
	//*  15   28:invokevirtual   #1278 <Method boolean NetworkInfo.isAvailable()>
	//*  16   31:ifeq            77
	//*  17   34:iload_2         
	//*  18   35:istore_1        
	//*  19   36:aload           4
	//*  20   38:invokevirtual   #1024 <Method boolean NetworkInfo.isConnected()>
	//*  21   41:ifeq            77
	//*  22   44:aload           4
	//*  23   46:invokevirtual   #1256 <Method int NetworkInfo.getType()>
	//*  24   49:istore_3        
	//*  25   50:iload_3         
	//*  26   51:iconst_1        
	//*  27   52:icmpne          57
	//*  28   55:iconst_1        
	//*  29   56:ireturn         
	//*  30   57:iload_2         
	//*  31   58:istore_1        
	//*  32   59:iload_3         
	//*  33   60:ifne            77
	//*  34   63:aload_0         
	//*  35   64:ldc2            #292 <String "phone">
	//*  36   67:invokevirtual   #162 <Method Object Context.getSystemService(String)>
	//*  37   70:checkcast       #294 <Class TelephonyManager>
	//*  38   73:invokevirtual   #1281 <Method int TelephonyManager.getNetworkType()>
	//*  39   76:istore_1        
	//*  40   77:goto            99
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  41   80:astore_0        
		{
			dho.f("CommonUtil", new Object[] {
				((Exception) (context)).getMessage()
			});
	//   42   81:ldc1            #68  <String "CommonUtil">
	//   43   83:iconst_1        
	//   44   84:anewarray       Object[]
	//   45   87:dup             
	//   46   88:iconst_0        
	//   47   89:aload_0         
	//   48   90:invokevirtual   #73  <Method String Exception.getMessage()>
	//   49   93:aastore         
	//   50   94:invokestatic    #79  <Method void dho.f(String, Object[])>
			return -1;
	//   51   97:iconst_m1       
	//   52   98:ireturn         
		}
		i1 = ((int) (byte0));
		if(networkinfo == null)
			break MISSING_BLOCK_LABEL_99;
		i1 = ((int) (byte0));
		if(!networkinfo.isAvailable())
			break MISSING_BLOCK_LABEL_99;
		i1 = ((int) (byte0));
		if(!networkinfo.isConnected())
			break MISSING_BLOCK_LABEL_99;
		j1 = networkinfo.getType();
		if(j1 == 1)
			return 1;
		i1 = ((int) (byte0));
		if(j1 != 0)
			break MISSING_BLOCK_LABEL_99;
		i1 = ((TelephonyManager)context.getSystemService("phone")).getNetworkType();
		dho.d("CommonUtil", new Object[] {
			(new StringBuilder()).append("telephone networkType:").append(i1).toString()
		});
	//   53   99:ldc1            #68  <String "CommonUtil">
	//   54  101:iconst_1        
	//   55  102:anewarray       Object[]
	//   56  105:dup             
	//   57  106:iconst_0        
	//   58  107:new             #120 <Class StringBuilder>
	//   59  110:dup             
	//   60  111:invokespecial   #121 <Method void StringBuilder()>
	//   61  114:ldc2            #1283 <String "telephone networkType:">
	//   62  117:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   63  120:iload_1         
	//   64  121:invokevirtual   #205 <Method StringBuilder StringBuilder.append(int)>
	//   65  124:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   66  127:aastore         
	//   67  128:invokestatic    #325 <Method void dho.d(String, Object[])>
		return d(i1);
	//   68  131:iload_1         
	//   69  132:invokestatic    #1285 <Method int d(int)>
	//   70  135:ireturn         
	}

	static String o(String s1)
	{
		e = s1;
	//    0    0:aload_0         
	//    1    1:putstatic       #24  <Field String e>
		return s1;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

	public static void o(Context context, String s1)
	{
		context.startActivity(new Intent("android.intent.action.DELETE", Uri.parse((new StringBuilder()).append("package:").append(s1).toString())));
	//    0    0:aload_0         
	//    1    1:new             #824 <Class Intent>
	//    2    4:dup             
	//    3    5:ldc2            #1287 <String "android.intent.action.DELETE">
	//    4    8:new             #120 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #121 <Method void StringBuilder()>
	//    7   15:ldc2            #1289 <String "package:">
	//    8   18:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   12   28:invokestatic    #1082 <Method Uri Uri.parse(String)>
	//   13   31:invokespecial   #1089 <Method void Intent(String, Uri)>
	//   14   34:invokevirtual   #1098 <Method void Context.startActivity(Intent)>
	//   15   37:return          
	}

	public static boolean o()
	{
		dho.b("CommonUtil", new Object[] {
			"Enter isVersionUpEMUI_9_0"
		});
	//    0    0:ldc1            #68  <String "CommonUtil">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc2            #1218 <String "Enter isVersionUpEMUI_9_0">
	//    6   11:aastore         
	//    7   12:invokestatic    #133 <Method void dho.b(String, Object[])>
		boolean flag1 = false;
	//    8   15:iconst_0        
	//    9   16:istore_2        
		boolean flag = flag1;
	//   10   17:iload_2         
	//   11   18:istore_1        
		if(p("com.huawei.android.os.BuildEx"))
	//*  12   19:ldc2            #1220 <String "com.huawei.android.os.BuildEx">
	//*  13   22:invokestatic    #1222 <Method boolean p(String)>
	//*  14   25:ifeq            74
		{
			int i1 = j();
	//   15   28:invokestatic    #1224 <Method int j()>
	//   16   31:istore_0        
			dho.b("CommonUtil", new Object[] {
				(new StringBuilder()).append("EMUI Version = ").append(i1).toString()
			});
	//   17   32:ldc1            #68  <String "CommonUtil">
	//   18   34:iconst_1        
	//   19   35:anewarray       Object[]
	//   20   38:dup             
	//   21   39:iconst_0        
	//   22   40:new             #120 <Class StringBuilder>
	//   23   43:dup             
	//   24   44:invokespecial   #121 <Method void StringBuilder()>
	//   25   47:ldc2            #1226 <String "EMUI Version = ">
	//   26   50:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   27   53:iload_0         
	//   28   54:invokevirtual   #205 <Method StringBuilder StringBuilder.append(int)>
	//   29   57:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   30   60:aastore         
	//   31   61:invokestatic    #133 <Method void dho.b(String, Object[])>
			flag = flag1;
	//   32   64:iload_2         
	//   33   65:istore_1        
			if(i1 > 15)
	//*  34   66:iload_0         
	//*  35   67:bipush          15
	//*  36   69:icmple          74
				flag = true;
	//   37   72:iconst_1        
	//   38   73:istore_1        
		}
		return flag;
	//   39   74:iload_1         
	//   40   75:ireturn         
	}

	public static String p(Context context, String s1)
	{
		try
		{
			context = ((Context) (context.getPackageManager().getPackageInfo(s1, 0).versionName));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #107 <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #113 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    5    9:getfield        #1126 <Field String PackageInfo.versionName>
	//    6   12:astore_0        
		}
	//*   7   13:aload_0         
	//*   8   14:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   9   15:astore_0        
		{
			dho.b("CommonUtil", new Object[] {
				(new StringBuilder()).append("getVersion: e").append(((android.content.pm.PackageManager.NameNotFoundException) (context)).getMessage()).toString()
			});
	//   10   16:ldc1            #68  <String "CommonUtil">
	//   11   18:iconst_1        
	//   12   19:anewarray       Object[]
	//   13   22:dup             
	//   14   23:iconst_0        
	//   15   24:new             #120 <Class StringBuilder>
	//   16   27:dup             
	//   17   28:invokespecial   #121 <Method void StringBuilder()>
	//   18   31:ldc2            #1291 <String "getVersion: e">
	//   19   34:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   20   37:aload_0         
	//   21   38:invokevirtual   #128 <Method String android.content.pm.PackageManager$NameNotFoundException.getMessage()>
	//   22   41:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   23   44:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   24   47:aastore         
	//   25   48:invokestatic    #133 <Method void dho.b(String, Object[])>
			return "";
	//   26   51:ldc1            #217 <String "">
	//   27   53:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  28   54:astore_0        
		{
			dho.b("CommonUtil", new Object[] {
				(new StringBuilder()).append("getVersion: e").append(((Exception) (context)).getMessage()).toString()
			});
	//   29   55:ldc1            #68  <String "CommonUtil">
	//   30   57:iconst_1        
	//   31   58:anewarray       Object[]
	//   32   61:dup             
	//   33   62:iconst_0        
	//   34   63:new             #120 <Class StringBuilder>
	//   35   66:dup             
	//   36   67:invokespecial   #121 <Method void StringBuilder()>
	//   37   70:ldc2            #1291 <String "getVersion: e">
	//   38   73:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   39   76:aload_0         
	//   40   77:invokevirtual   #73  <Method String Exception.getMessage()>
	//   41   80:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   42   83:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   43   86:aastore         
	//   44   87:invokestatic    #133 <Method void dho.b(String, Object[])>
			return "";
	//   45   90:ldc1            #217 <String "">
	//   46   92:areturn         
		}
		return ((String) (context));
	}

	public static boolean p()
	{
		dho.b("CommonUtil", new Object[] {
			"Enter isVersionUpEMUI_5_0"
		});
	//    0    0:ldc1            #68  <String "CommonUtil">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc2            #1253 <String "Enter isVersionUpEMUI_5_0">
	//    6   11:aastore         
	//    7   12:invokestatic    #133 <Method void dho.b(String, Object[])>
		boolean flag1 = false;
	//    8   15:iconst_0        
	//    9   16:istore_2        
		boolean flag = flag1;
	//   10   17:iload_2         
	//   11   18:istore_1        
		if(p("com.huawei.android.os.BuildEx"))
	//*  12   19:ldc2            #1220 <String "com.huawei.android.os.BuildEx">
	//*  13   22:invokestatic    #1222 <Method boolean p(String)>
	//*  14   25:ifeq            74
		{
			int i1 = j();
	//   15   28:invokestatic    #1224 <Method int j()>
	//   16   31:istore_0        
			dho.b("CommonUtil", new Object[] {
				(new StringBuilder()).append("EMUI Version = ").append(i1).toString()
			});
	//   17   32:ldc1            #68  <String "CommonUtil">
	//   18   34:iconst_1        
	//   19   35:anewarray       Object[]
	//   20   38:dup             
	//   21   39:iconst_0        
	//   22   40:new             #120 <Class StringBuilder>
	//   23   43:dup             
	//   24   44:invokespecial   #121 <Method void StringBuilder()>
	//   25   47:ldc2            #1226 <String "EMUI Version = ">
	//   26   50:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   27   53:iload_0         
	//   28   54:invokevirtual   #205 <Method StringBuilder StringBuilder.append(int)>
	//   29   57:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   30   60:aastore         
	//   31   61:invokestatic    #133 <Method void dho.b(String, Object[])>
			flag = flag1;
	//   32   64:iload_2         
	//   33   65:istore_1        
			if(i1 >= 11)
	//*  34   66:iload_0         
	//*  35   67:bipush          11
	//*  36   69:icmplt          74
				flag = true;
	//   37   72:iconst_1        
	//   38   73:istore_1        
		}
		return flag;
	//   39   74:iload_1         
	//   40   75:ireturn         
	}

	public static boolean p(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		int i1;
		ComponentName componentname;
		try
		{
			context = ((Context) (((ActivityManager)context.getSystemService("activity")).getRunningTasks(10)));
	//    4    6:aload_0         
	//    5    7:ldc1            #158 <String "activity">
	//    6    9:invokevirtual   #162 <Method Object Context.getSystemService(String)>
	//    7   12:checkcast       #164 <Class ActivityManager>
	//    8   15:bipush          10
	//    9   17:invokevirtual   #1133 <Method List ActivityManager.getRunningTasks(int)>
	//   10   20:astore_0        
		}
	//*  11   21:aload_0         
	//*  12   22:ifnull          131
	//*  13   25:aload_0         
	//*  14   26:invokeinterface #174 <Method int List.size()>
	//*  15   31:ifle            131
	//*  16   34:iconst_0        
	//*  17   35:istore_1        
	//*  18   36:iload_1         
	//*  19   37:aload_0         
	//*  20   38:invokeinterface #174 <Method int List.size()>
	//*  21   43:icmpge          114
	//*  22   46:aload_0         
	//*  23   47:iload_1         
	//*  24   48:invokeinterface #939 <Method Object List.get(int)>
	//*  25   53:checkcast       #1135 <Class android.app.ActivityManager$RunningTaskInfo>
	//*  26   56:getfield        #1138 <Field ComponentName android.app.ActivityManager$RunningTaskInfo.topActivity>
	//*  27   59:astore_2        
	//*  28   60:aload_2         
	//*  29   61:ifnull          107
	//*  30   64:ldc2            #1295 <String "com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity">
	//*  31   67:aload_2         
	//*  32   68:invokevirtual   #269 <Method String ComponentName.getClassName()>
	//*  33   71:invokevirtual   #150 <Method boolean String.equals(Object)>
	//*  34   74:ifeq            107
	//*  35   77:ldc2            #403 <String "com.huawei.health">
	//*  36   80:aload_2         
	//*  37   81:invokevirtual   #1296 <Method String ComponentName.getPackageName()>
	//*  38   84:invokevirtual   #150 <Method boolean String.equals(Object)>
	//*  39   87:ifeq            107
	//*  40   90:ldc1            #68  <String "CommonUtil">
	//*  41   92:iconst_1        
	//*  42   93:anewarray       Object[]
	//*  43   96:dup             
	//*  44   97:iconst_0        
	//*  45   98:ldc2            #1298 <String "TrackMainMapActivity in stack.">
	//*  46  101:aastore         
	//*  47  102:invokestatic    #133 <Method void dho.b(String, Object[])>
	//*  48  105:iconst_1        
	//*  49  106:ireturn         
	//*  50  107:iload_1         
	//*  51  108:iconst_1        
	//*  52  109:iadd            
	//*  53  110:istore_1        
	//*  54  111:goto            36
	//*  55  114:ldc1            #68  <String "CommonUtil">
	//*  56  116:iconst_1        
	//*  57  117:anewarray       Object[]
	//*  58  120:dup             
	//*  59  121:iconst_0        
	//*  60  122:ldc2            #1300 <String "TrackMainMapActivity not find.">
	//*  61  125:aastore         
	//*  62  126:invokestatic    #133 <Method void dho.b(String, Object[])>
	//*  63  129:iconst_0        
	//*  64  130:ireturn         
	//*  65  131:ldc1            #68  <String "CommonUtil">
	//*  66  133:iconst_1        
	//*  67  134:anewarray       Object[]
	//*  68  137:dup             
	//*  69  138:iconst_0        
	//*  70  139:ldc2            #1302 <String "isActivityInStack am.getRunningTasks(1) is null.">
	//*  71  142:aastore         
	//*  72  143:invokestatic    #133 <Method void dho.b(String, Object[])>
	//*  73  146:iconst_0        
	//*  74  147:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  75  148:astore_0        
		{
			dho.b("CommonUtil", new Object[] {
				(new StringBuilder()).append("IndexOutOfBoundsException exception = ").append(((IndexOutOfBoundsException) (context)).getMessage()).toString()
			});
	//   76  149:ldc1            #68  <String "CommonUtil">
	//   77  151:iconst_1        
	//   78  152:anewarray       Object[]
	//   79  155:dup             
	//   80  156:iconst_0        
	//   81  157:new             #120 <Class StringBuilder>
	//   82  160:dup             
	//   83  161:invokespecial   #121 <Method void StringBuilder()>
	//   84  164:ldc2            #1304 <String "IndexOutOfBoundsException exception = ">
	//   85  167:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   86  170:aload_0         
	//   87  171:invokevirtual   #1305 <Method String IndexOutOfBoundsException.getMessage()>
	//   88  174:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   89  177:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   90  180:aastore         
	//   91  181:invokestatic    #133 <Method void dho.b(String, Object[])>
			return false;
	//   92  184:iconst_0        
	//   93  185:ireturn         
		}
		if(context == null)
			break MISSING_BLOCK_LABEL_131;
		if(((List) (context)).size() <= 0)
			break MISSING_BLOCK_LABEL_131;
		i1 = 0;
_L2:
		if(i1 >= ((List) (context)).size())
			break; /* Loop/switch isn't completed */
		componentname = ((android.app.ActivityManager.RunningTaskInfo)((List) (context)).get(i1)).topActivity;
		if(componentname == null)
			break MISSING_BLOCK_LABEL_107;
		if(!"com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity".equals(((Object) (componentname.getClassName()))) || !"com.huawei.health".equals(((Object) (componentname.getPackageName()))))
			break MISSING_BLOCK_LABEL_107;
		dho.b("CommonUtil", new Object[] {
			"TrackMainMapActivity in stack."
		});
		return true;
		i1++;
		if(true) goto _L2; else goto _L1
_L1:
		dho.b("CommonUtil", new Object[] {
			"TrackMainMapActivity not find."
		});
		return false;
		dho.b("CommonUtil", new Object[] {
			"isActivityInStack am.getRunningTasks(1) is null."
		});
		return false;
	}

	private static boolean p(String s1)
	{
		dho.b("CommonUtil", new Object[] {
			"Enter isExsitOfClass"
		});
	//    0    0:ldc1            #68  <String "CommonUtil">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc2            #1307 <String "Enter isExsitOfClass">
	//    6   11:aastore         
	//    7   12:invokestatic    #133 <Method void dho.b(String, Object[])>
		try
		{
			Class.forName(s1);
	//    8   15:aload_0         
	//    9   16:invokestatic    #480 <Method Class Class.forName(String)>
	//   10   19:pop             
		}
	//*  11   20:iconst_1        
	//*  12   21:ireturn         
		catch(ClassNotFoundException classnotfoundexception)
	//*  13   22:astore_1        
		{
			dho.f("CommonUtil", new Object[] {
				(new StringBuilder()).append("The class is not existing: ").append(s1).toString()
			});
	//   14   23:ldc1            #68  <String "CommonUtil">
	//   15   25:iconst_1        
	//   16   26:anewarray       Object[]
	//   17   29:dup             
	//   18   30:iconst_0        
	//   19   31:new             #120 <Class StringBuilder>
	//   20   34:dup             
	//   21   35:invokespecial   #121 <Method void StringBuilder()>
	//   22   38:ldc2            #1309 <String "The class is not existing: ">
	//   23   41:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   24   44:aload_0         
	//   25   45:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   26   48:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   27   51:aastore         
	//   28   52:invokestatic    #79  <Method void dho.f(String, Object[])>
			return false;
	//   29   55:iconst_0        
	//   30   56:ireturn         
		}
		return true;
	}

	public static boolean q()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public static boolean q(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		context = ((Context) ((ActivityManager)context.getSystemService("activity")));
	//    4    6:aload_0         
	//    5    7:ldc1            #158 <String "activity">
	//    6    9:invokevirtual   #162 <Method Object Context.getSystemService(String)>
	//    7   12:checkcast       #164 <Class ActivityManager>
	//    8   15:astore_0        
		if(((ActivityManager) (context)).getRunningTasks(1) == null || ((ActivityManager) (context)).getRunningTasks(1).size() <= 0)
			break MISSING_BLOCK_LABEL_80;
	//    9   16:aload_0         
	//   10   17:iconst_1        
	//   11   18:invokevirtual   #1133 <Method List ActivityManager.getRunningTasks(int)>
	//   12   21:ifnull          80
	//   13   24:aload_0         
	//   14   25:iconst_1        
	//   15   26:invokevirtual   #1133 <Method List ActivityManager.getRunningTasks(int)>
	//   16   29:invokeinterface #174 <Method int List.size()>
	//   17   34:ifle            80
		context = ((Context) (((android.app.ActivityManager.RunningTaskInfo)((ActivityManager) (context)).getRunningTasks(1).get(0)).topActivity.getPackageName()));
	//   18   37:aload_0         
	//   19   38:iconst_1        
	//   20   39:invokevirtual   #1133 <Method List ActivityManager.getRunningTasks(int)>
	//   21   42:iconst_0        
	//   22   43:invokeinterface #939 <Method Object List.get(int)>
	//   23   48:checkcast       #1135 <Class android.app.ActivityManager$RunningTaskInfo>
	//   24   51:getfield        #1138 <Field ComponentName android.app.ActivityManager$RunningTaskInfo.topActivity>
	//   25   54:invokevirtual   #1296 <Method String ComponentName.getPackageName()>
	//   26   57:astore_0        
		boolean flag;
		if(!TextUtils.isEmpty(((CharSequence) (context))) && ((String) (context)).equals("com.huawei.health"))
	//*  27   58:aload_0         
	//*  28   59:invokestatic    #305 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  29   62:ifne            135
	//*  30   65:aload_0         
	//*  31   66:ldc2            #403 <String "com.huawei.health">
	//*  32   69:invokevirtual   #150 <Method boolean String.equals(Object)>
	//*  33   72:ifeq            135
			flag = true;
	//   34   75:iconst_1        
	//   35   76:istore_1        
		else
	//*  36   77:goto            137
	//*  37   80:ldc1            #68  <String "CommonUtil">
	//*  38   82:iconst_1        
	//*  39   83:anewarray       Object[]
	//*  40   86:dup             
	//*  41   87:iconst_0        
	//*  42   88:ldc2            #1312 <String "isRunningForeground am.getRunningTasks(1) is null.">
	//*  43   91:aastore         
	//*  44   92:invokestatic    #133 <Method void dho.b(String, Object[])>
	//*  45   95:iconst_0        
	//*  46   96:ireturn         
	//*  47   97:astore_0        
	//*  48   98:ldc1            #68  <String "CommonUtil">
	//*  49  100:iconst_1        
	//*  50  101:anewarray       Object[]
	//*  51  104:dup             
	//*  52  105:iconst_0        
	//*  53  106:new             #120 <Class StringBuilder>
	//*  54  109:dup             
	//*  55  110:invokespecial   #121 <Method void StringBuilder()>
	//*  56  113:ldc2            #1304 <String "IndexOutOfBoundsException exception = ">
	//*  57  116:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//*  58  119:aload_0         
	//*  59  120:invokevirtual   #1305 <Method String IndexOutOfBoundsException.getMessage()>
	//*  60  123:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//*  61  126:invokevirtual   #131 <Method String StringBuilder.toString()>
	//*  62  129:aastore         
	//*  63  130:invokestatic    #133 <Method void dho.b(String, Object[])>
	//*  64  133:iconst_0        
	//*  65  134:ireturn         
			flag = false;
	//   66  135:iconst_0        
	//   67  136:istore_1        
		break MISSING_BLOCK_LABEL_137;
		try
		{
			dho.b("CommonUtil", new Object[] {
				"isRunningForeground am.getRunningTasks(1) is null."
			});
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			dho.b("CommonUtil", new Object[] {
				(new StringBuilder()).append("IndexOutOfBoundsException exception = ").append(((IndexOutOfBoundsException) (context)).getMessage()).toString()
			});
			return false;
		}
		return false;
		return flag;
	//   68  137:iload_1         
	//   69  138:ireturn         
	}

	public static boolean r()
	{
		dho.b("CommonUtil", new Object[] {
			"Enter isUPEMUI_5_1"
		});
	//    0    0:ldc1            #68  <String "CommonUtil">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc2            #1314 <String "Enter isUPEMUI_5_1">
	//    6   11:aastore         
	//    7   12:invokestatic    #133 <Method void dho.b(String, Object[])>
		boolean flag1 = false;
	//    8   15:iconst_0        
	//    9   16:istore_2        
		boolean flag = flag1;
	//   10   17:iload_2         
	//   11   18:istore_1        
		if(p("com.huawei.android.os.BuildEx"))
	//*  12   19:ldc2            #1220 <String "com.huawei.android.os.BuildEx">
	//*  13   22:invokestatic    #1222 <Method boolean p(String)>
	//*  14   25:ifeq            74
		{
			int i1 = j();
	//   15   28:invokestatic    #1224 <Method int j()>
	//   16   31:istore_0        
			dho.b("CommonUtil", new Object[] {
				(new StringBuilder()).append("EMUI Version = ").append(i1).toString()
			});
	//   17   32:ldc1            #68  <String "CommonUtil">
	//   18   34:iconst_1        
	//   19   35:anewarray       Object[]
	//   20   38:dup             
	//   21   39:iconst_0        
	//   22   40:new             #120 <Class StringBuilder>
	//   23   43:dup             
	//   24   44:invokespecial   #121 <Method void StringBuilder()>
	//   25   47:ldc2            #1226 <String "EMUI Version = ">
	//   26   50:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   27   53:iload_0         
	//   28   54:invokevirtual   #205 <Method StringBuilder StringBuilder.append(int)>
	//   29   57:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   30   60:aastore         
	//   31   61:invokestatic    #133 <Method void dho.b(String, Object[])>
			flag = flag1;
	//   32   64:iload_2         
	//   33   65:istore_1        
			if(i1 >= 12)
	//*  34   66:iload_0         
	//*  35   67:bipush          12
	//*  36   69:icmplt          74
				flag = true;
	//   37   72:iconst_1        
	//   38   73:istore_1        
		}
		return flag;
	//   39   74:iload_1         
	//   40   75:ireturn         
	}

	public static boolean r(Context context)
	{
		try
		{
			context = ((Context) (context.getPackageManager().getPackageInfo("com.huawei.appmarket", 0)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #107 <Method PackageManager Context.getPackageManager()>
	//    2    4:ldc2            #1316 <String "com.huawei.appmarket">
	//    3    7:iconst_0        
	//    4    8:invokevirtual   #113 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    5   11:astore_0        
		}
	//*   6   12:goto            18
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   7   15:astore_0        
		{
			context = null;
	//    8   16:aconst_null     
	//    9   17:astore_0        
		}
		return context != null;
	//   10   18:aload_0         
	//   11   19:ifnull          24
	//   12   22:iconst_1        
	//   13   23:ireturn         
	//   14   24:iconst_0        
	//   15   25:ireturn         
	}

	private static PublicKey[] r(Context context, String s1)
	{
		context = ((Context) (context.getPackageManager()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #107 <Method PackageManager Context.getPackageManager()>
	//    2    4:astore_0        
		context = ((Context) (((PackageManager) (context)).getPackageInfo(s1, 64)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:bipush          64
	//    6    9:invokevirtual   #113 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    7   12:astore_0        
		if(context == null)
			break MISSING_BLOCK_LABEL_73;
	//    8   13:aload_0         
	//    9   14:ifnull          31
		if(((PackageInfo) (context)).versionName == null)
			break MISSING_BLOCK_LABEL_73;
	//   10   17:aload_0         
	//   11   18:getfield        #1126 <Field String PackageInfo.versionName>
	//   12   21:ifnull          31
		context = ((Context) (e(((PackageInfo) (context)))));
	//   13   24:aload_0         
	//   14   25:invokestatic    #1318 <Method PublicKey[] e(PackageInfo)>
	//   15   28:astore_0        
		return ((PublicKey []) (context));
	//   16   29:aload_0         
	//   17   30:areturn         
	//*  18   31:goto            73
		context;
	//   19   34:astore_0        
		return null;
	//   20   35:aconst_null     
	//   21   36:areturn         
		context;
	//   22   37:astore_0        
		dho.f("CommonUtil", new Object[] {
			(new StringBuilder()).append("loadCertificates Exception:").append(((Exception) (context)).getMessage()).toString()
		});
	//   23   38:ldc1            #68  <String "CommonUtil">
	//   24   40:iconst_1        
	//   25   41:anewarray       Object[]
	//   26   44:dup             
	//   27   45:iconst_0        
	//   28   46:new             #120 <Class StringBuilder>
	//   29   49:dup             
	//   30   50:invokespecial   #121 <Method void StringBuilder()>
	//   31   53:ldc2            #646 <String "loadCertificates Exception:">
	//   32   56:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   33   59:aload_0         
	//   34   60:invokevirtual   #73  <Method String Exception.getMessage()>
	//   35   63:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   36   66:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   37   69:aastore         
	//   38   70:invokestatic    #79  <Method void dho.f(String, Object[])>
		return null;
	//   39   73:aconst_null     
	//   40   74:areturn         
	}

	public static String s(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       10
		{
			context = "";
	//    2    4:ldc1            #217 <String "">
	//    3    6:astore_0        
		} else
	//*   4    7:goto            107
		{
			context = ((Context) ((ActivityManager)context.getSystemService("activity")));
	//    5   10:aload_0         
	//    6   11:ldc1            #158 <String "activity">
	//    7   13:invokevirtual   #162 <Method Object Context.getSystemService(String)>
	//    8   16:checkcast       #164 <Class ActivityManager>
	//    9   19:astore_0        
			if(((ActivityManager) (context)).getRunningTasks(1) != null)
	//*  10   20:aload_0         
	//*  11   21:iconst_1        
	//*  12   22:invokevirtual   #1133 <Method List ActivityManager.getRunningTasks(int)>
	//*  13   25:ifnull          89
			{
				context = ((Context) (((android.app.ActivityManager.RunningTaskInfo)((ActivityManager) (context)).getRunningTasks(1).get(0)).topActivity));
	//   14   28:aload_0         
	//   15   29:iconst_1        
	//   16   30:invokevirtual   #1133 <Method List ActivityManager.getRunningTasks(int)>
	//   17   33:iconst_0        
	//   18   34:invokeinterface #939 <Method Object List.get(int)>
	//   19   39:checkcast       #1135 <Class android.app.ActivityManager$RunningTaskInfo>
	//   20   42:getfield        #1138 <Field ComponentName android.app.ActivityManager$RunningTaskInfo.topActivity>
	//   21   45:astore_0        
				dho.d("CommonUtil", new Object[] {
					(new StringBuilder()).append("getTopActvityName ComponentName is = ").append(((ComponentName) (context)).getClassName()).toString()
				});
	//   22   46:ldc1            #68  <String "CommonUtil">
	//   23   48:iconst_1        
	//   24   49:anewarray       Object[]
	//   25   52:dup             
	//   26   53:iconst_0        
	//   27   54:new             #120 <Class StringBuilder>
	//   28   57:dup             
	//   29   58:invokespecial   #121 <Method void StringBuilder()>
	//   30   61:ldc2            #1321 <String "getTopActvityName ComponentName is = ">
	//   31   64:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   32   67:aload_0         
	//   33   68:invokevirtual   #269 <Method String ComponentName.getClassName()>
	//   34   71:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   35   74:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   36   77:aastore         
	//   37   78:invokestatic    #325 <Method void dho.d(String, Object[])>
				context = ((Context) (((ComponentName) (context)).getClassName()));
	//   38   81:aload_0         
	//   39   82:invokevirtual   #269 <Method String ComponentName.getClassName()>
	//   40   85:astore_0        
			} else
	//*  41   86:goto            107
			{
				dho.b("CommonUtil", new Object[] {
					"am.getRunningTasks(1) is null."
				});
	//   42   89:ldc1            #68  <String "CommonUtil">
	//   43   91:iconst_1        
	//   44   92:anewarray       Object[]
	//   45   95:dup             
	//   46   96:iconst_0        
	//   47   97:ldc2            #1323 <String "am.getRunningTasks(1) is null.">
	//   48  100:aastore         
	//   49  101:invokestatic    #133 <Method void dho.b(String, Object[])>
				context = "";
	//   50  104:ldc1            #217 <String "">
	//   51  106:astore_0        
			}
		}
		dho.b("CommonUtil", new Object[] {
			(new StringBuilder()).append("Enter getTopActvityName res:").append(((String) (context))).toString()
		});
	//   52  107:ldc1            #68  <String "CommonUtil">
	//   53  109:iconst_1        
	//   54  110:anewarray       Object[]
	//   55  113:dup             
	//   56  114:iconst_0        
	//   57  115:new             #120 <Class StringBuilder>
	//   58  118:dup             
	//   59  119:invokespecial   #121 <Method void StringBuilder()>
	//   60  122:ldc2            #1325 <String "Enter getTopActvityName res:">
	//   61  125:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   62  128:aload_0         
	//   63  129:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   64  132:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   65  135:aastore         
	//   66  136:invokestatic    #133 <Method void dho.b(String, Object[])>
		return ((String) (context));
	//   67  139:aload_0         
	//   68  140:areturn         
	}

	public static boolean s()
	{
		dho.b("CommonUtil", new Object[] {
			"Enter isEMUI_4_0"
		});
	//    0    0:ldc1            #68  <String "CommonUtil">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc2            #1327 <String "Enter isEMUI_4_0">
	//    6   11:aastore         
	//    7   12:invokestatic    #133 <Method void dho.b(String, Object[])>
		boolean flag1 = false;
	//    8   15:iconst_0        
	//    9   16:istore_2        
		boolean flag = flag1;
	//   10   17:iload_2         
	//   11   18:istore_1        
		if(p("com.huawei.android.os.BuildEx"))
	//*  12   19:ldc2            #1220 <String "com.huawei.android.os.BuildEx">
	//*  13   22:invokestatic    #1222 <Method boolean p(String)>
	//*  14   25:ifeq            74
		{
			int i1 = j();
	//   15   28:invokestatic    #1224 <Method int j()>
	//   16   31:istore_0        
			dho.b("CommonUtil", new Object[] {
				(new StringBuilder()).append("EMUI Version = ").append(i1).toString()
			});
	//   17   32:ldc1            #68  <String "CommonUtil">
	//   18   34:iconst_1        
	//   19   35:anewarray       Object[]
	//   20   38:dup             
	//   21   39:iconst_0        
	//   22   40:new             #120 <Class StringBuilder>
	//   23   43:dup             
	//   24   44:invokespecial   #121 <Method void StringBuilder()>
	//   25   47:ldc2            #1226 <String "EMUI Version = ">
	//   26   50:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   27   53:iload_0         
	//   28   54:invokevirtual   #205 <Method StringBuilder StringBuilder.append(int)>
	//   29   57:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   30   60:aastore         
	//   31   61:invokestatic    #133 <Method void dho.b(String, Object[])>
			flag = flag1;
	//   32   64:iload_2         
	//   33   65:istore_1        
			if(i1 >= 9)
	//*  34   66:iload_0         
	//*  35   67:bipush          9
	//*  36   69:icmplt          74
				flag = true;
	//   37   72:iconst_1        
	//   38   73:istore_1        
		}
		return flag;
	//   39   74:iload_1         
	//   40   75:ireturn         
	}

	public static PackageInfo t(Context context)
	{
		try
		{
			context = ((Context) (context.getPackageManager().getPackageInfo("com.huawei.health", 0)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #107 <Method PackageManager Context.getPackageManager()>
	//    2    4:ldc2            #403 <String "com.huawei.health">
	//    3    7:iconst_0        
	//    4    8:invokevirtual   #113 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    5   11:astore_0        
		}
	//*   6   12:aload_0         
	//*   7   13:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   8   14:astore_0        
		{
			dho.d("CommonUtil", new Object[] {
				"checkHealth packageInfo == NULL"
			});
	//    9   15:ldc1            #68  <String "CommonUtil">
	//   10   17:iconst_1        
	//   11   18:anewarray       Object[]
	//   12   21:dup             
	//   13   22:iconst_0        
	//   14   23:ldc2            #1331 <String "checkHealth packageInfo == NULL">
	//   15   26:aastore         
	//   16   27:invokestatic    #325 <Method void dho.d(String, Object[])>
			return null;
	//   17   30:aconst_null     
	//   18   31:areturn         
		}
		return ((PackageInfo) (context));
	}

	public static boolean t()
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_0        
		Cursor cursor = BaseApplication.a().getContentResolver().query(Uri.parse("content://com.huawei.health.HwNotificationContentProvider/MidwareAuthority"), ((String []) (null)), ((String) (null)), ((String []) (null)), ((String) (null)));
	//    2    2:invokestatic    #925 <Method Context BaseApplication.a()>
	//    3    5:invokevirtual   #1335 <Method ContentResolver Context.getContentResolver()>
	//    4    8:ldc2            #1337 <String "content://com.huawei.health.HwNotificationContentProvider/MidwareAuthority">
	//    5   11:invokestatic    #1082 <Method Uri Uri.parse(String)>
	//    6   14:aconst_null     
	//    7   15:aconst_null     
	//    8   16:aconst_null     
	//    9   17:aconst_null     
	//   10   18:invokevirtual   #1343 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   11   21:astore_1        
		if(cursor != null)
	//*  12   22:aload_1         
	//*  13   23:ifnull          104
		{
			cursor.moveToFirst();
	//   14   26:aload_1         
	//   15   27:invokeinterface #1348 <Method boolean Cursor.moveToFirst()>
	//   16   32:pop             
			String s1 = cursor.getString(cursor.getColumnIndex("value"));
	//   17   33:aload_1         
	//   18   34:aload_1         
	//   19   35:ldc2            #1349 <String "value">
	//   20   38:invokeinterface #1352 <Method int Cursor.getColumnIndex(String)>
	//   21   43:invokeinterface #1355 <Method String Cursor.getString(int)>
	//   22   48:astore_2        
			dho.b("CommonUtil", new Object[] {
				(new StringBuilder()).append("isMidwareAuthority: ").append(s1).toString()
			});
	//   23   49:ldc1            #68  <String "CommonUtil">
	//   24   51:iconst_1        
	//   25   52:anewarray       Object[]
	//   26   55:dup             
	//   27   56:iconst_0        
	//   28   57:new             #120 <Class StringBuilder>
	//   29   60:dup             
	//   30   61:invokespecial   #121 <Method void StringBuilder()>
	//   31   64:ldc2            #1357 <String "isMidwareAuthority: ">
	//   32   67:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   33   70:aload_2         
	//   34   71:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   35   74:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   36   77:aastore         
	//   37   78:invokestatic    #133 <Method void dho.b(String, Object[])>
			cursor.close();
	//   38   81:aload_1         
	//   39   82:invokeinterface #1358 <Method void Cursor.close()>
			if(TextUtils.equals(((CharSequence) (s1)), "true"))
	//*  40   87:aload_2         
	//*  41   88:ldc2            #1360 <String "true">
	//*  42   91:invokestatic    #1363 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//*  43   94:ifeq            102
				flag = true;
	//   44   97:iconst_1        
	//   45   98:istore_0        
			else
	//*  46   99:goto            104
				flag = false;
	//   47  102:iconst_0        
	//   48  103:istore_0        
		}
		dho.b("CommonUtil", new Object[] {
			(new StringBuilder()).append("isMidwareAuthority   result: ").append(flag).toString()
		});
	//   49  104:ldc1            #68  <String "CommonUtil">
	//   50  106:iconst_1        
	//   51  107:anewarray       Object[]
	//   52  110:dup             
	//   53  111:iconst_0        
	//   54  112:new             #120 <Class StringBuilder>
	//   55  115:dup             
	//   56  116:invokespecial   #121 <Method void StringBuilder()>
	//   57  119:ldc2            #1365 <String "isMidwareAuthority   result: ">
	//   58  122:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   59  125:iload_0         
	//   60  126:invokevirtual   #247 <Method StringBuilder StringBuilder.append(boolean)>
	//   61  129:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   62  132:aastore         
	//   63  133:invokestatic    #133 <Method void dho.b(String, Object[])>
		return flag;
	//   64  136:iload_0         
	//   65  137:ireturn         
	}

	public static boolean u()
	{
		Object obj = ((Object) (BaseApplication.a().getPackageManager()));
	//    0    0:invokestatic    #925 <Method Context BaseApplication.a()>
	//    1    3:invokevirtual   #107 <Method PackageManager Context.getPackageManager()>
	//    2    6:astore_1        
		boolean flag;
		try
		{
			obj = ((Object) (((PackageManager) (obj)).getPackageInfo("com.huawei.synergy", 128).versionName));
	//    3    7:aload_1         
	//    4    8:ldc2            #1368 <String "com.huawei.synergy">
	//    5   11:sipush          128
	//    6   14:invokevirtual   #113 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    7   17:getfield        #1126 <Field String PackageInfo.versionName>
	//    8   20:astore_1        
			dho.b("CommonUtil", new Object[] {
				"com.huawei.synergy version:", obj
			});
	//    9   21:ldc1            #68  <String "CommonUtil">
	//   10   23:iconst_2        
	//   11   24:anewarray       Object[]
	//   12   27:dup             
	//   13   28:iconst_0        
	//   14   29:ldc2            #1370 <String "com.huawei.synergy version:">
	//   15   32:aastore         
	//   16   33:dup             
	//   17   34:iconst_1        
	//   18   35:aload_1         
	//   19   36:aastore         
	//   20   37:invokestatic    #133 <Method void dho.b(String, Object[])>
		}
	//*  21   40:aload_1         
	//*  22   41:ifnull          56
	//*  23   44:aload_1         
	//*  24   45:ldc2            #1372 <String "1.0">
	//*  25   48:invokevirtual   #150 <Method boolean String.equals(Object)>
	//*  26   51:istore_0        
	//*  27   52:iload_0         
	//*  28   53:ifeq            58
	//*  29   56:iconst_0        
	//*  30   57:ireturn         
	//*  31   58:goto            79
		catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
	//*  32   61:astore_1        
		{
			dho.b("CommonUtil", new Object[] {
				"com.huawei.synergy not exist"
			});
	//   33   62:ldc1            #68  <String "CommonUtil">
	//   34   64:iconst_1        
	//   35   65:anewarray       Object[]
	//   36   68:dup             
	//   37   69:iconst_0        
	//   38   70:ldc2            #1374 <String "com.huawei.synergy not exist">
	//   39   73:aastore         
	//   40   74:invokestatic    #133 <Method void dho.b(String, Object[])>
			return false;
	//   41   77:iconst_0        
	//   42   78:ireturn         
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_56;
		flag = ((String) (obj)).equals("1.0");
		if(!flag)
			break MISSING_BLOCK_LABEL_79;
		return false;
		return true;
	//   43   79:iconst_1        
	//   44   80:ireturn         
	}

	public static boolean u(Context context)
	{
		try
		{
			context = ((Context) (context.getPackageManager().getPackageInfo("com.huawei.health", 0)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #107 <Method PackageManager Context.getPackageManager()>
	//    2    4:ldc2            #403 <String "com.huawei.health">
	//    3    7:iconst_0        
	//    4    8:invokevirtual   #113 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    5   11:astore_0        
		}
	//*   6   12:goto            18
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   7   15:astore_0        
		{
			context = null;
	//    8   16:aconst_null     
	//    9   17:astore_0        
		}
		boolean flag;
		if(context != null)
	//*  10   18:aload_0         
	//*  11   19:ifnull          27
			flag = true;
	//   12   22:iconst_1        
	//   13   23:istore_1        
		else
	//*  14   24:goto            29
			flag = false;
	//   15   27:iconst_0        
	//   16   28:istore_1        
		dho.d("CommonUtil", new Object[] {
			(new StringBuilder()).append("checkHIsInstall res ").append(flag).toString()
		});
	//   17   29:ldc1            #68  <String "CommonUtil">
	//   18   31:iconst_1        
	//   19   32:anewarray       Object[]
	//   20   35:dup             
	//   21   36:iconst_0        
	//   22   37:new             #120 <Class StringBuilder>
	//   23   40:dup             
	//   24   41:invokespecial   #121 <Method void StringBuilder()>
	//   25   44:ldc2            #1376 <String "checkHIsInstall res ">
	//   26   47:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   27   50:iload_1         
	//   28   51:invokevirtual   #247 <Method StringBuilder StringBuilder.append(boolean)>
	//   29   54:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   30   57:aastore         
	//   31   58:invokestatic    #325 <Method void dho.d(String, Object[])>
		return flag;
	//   32   61:iload_1         
	//   33   62:ireturn         
	}

	public static boolean u(Context context, String s1)
	{
		if(context == null || TextUtils.isEmpty(((CharSequence) (s1))))
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #305 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4    8:ifeq            13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		dho.d("CommonUtil", new Object[] {
			(new StringBuilder()).append("judgeIfInAccountArea(): country = ").append(s1).toString()
		});
	//    7   13:ldc1            #68  <String "CommonUtil">
	//    8   15:iconst_1        
	//    9   16:anewarray       Object[]
	//   10   19:dup             
	//   11   20:iconst_0        
	//   12   21:new             #120 <Class StringBuilder>
	//   13   24:dup             
	//   14   25:invokespecial   #121 <Method void StringBuilder()>
	//   15   28:ldc2            #1378 <String "judgeIfInAccountArea(): country = ">
	//   16   31:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   17   34:aload_1         
	//   18   35:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   19   38:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   20   41:aastore         
	//   21   42:invokestatic    #325 <Method void dho.d(String, Object[])>
		boolean flag;
		if("cn".equalsIgnoreCase(s1))
	//*  22   45:ldc2            #574 <String "cn">
	//*  23   48:aload_1         
	//*  24   49:invokevirtual   #56  <Method boolean String.equalsIgnoreCase(String)>
	//*  25   52:ifeq            60
			flag = true;
	//   26   55:iconst_1        
	//   27   56:istore_2        
		else
	//*  28   57:goto            66
			flag = b(context, s1);
	//   29   60:aload_0         
	//   30   61:aload_1         
	//   31   62:invokestatic    #1380 <Method boolean b(Context, String)>
	//   32   65:istore_2        
		dho.d("CommonUtil", new Object[] {
			(new StringBuilder()).append("judgeIfInAccountArea() retState = ").append(flag).toString()
		});
	//   33   66:ldc1            #68  <String "CommonUtil">
	//   34   68:iconst_1        
	//   35   69:anewarray       Object[]
	//   36   72:dup             
	//   37   73:iconst_0        
	//   38   74:new             #120 <Class StringBuilder>
	//   39   77:dup             
	//   40   78:invokespecial   #121 <Method void StringBuilder()>
	//   41   81:ldc2            #1382 <String "judgeIfInAccountArea() retState = ">
	//   42   84:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   43   87:iload_2         
	//   44   88:invokevirtual   #247 <Method StringBuilder StringBuilder.append(boolean)>
	//   45   91:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   46   94:aastore         
	//   47   95:invokestatic    #325 <Method void dho.d(String, Object[])>
		return flag;
	//   48   98:iload_2         
	//   49   99:ireturn         
	}

	public static boolean v()
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_0        
		if(d())
	//*   2    2:invokestatic    #353 <Method boolean d()>
	//*   3    5:ifeq            35
		{
			String s1 = w();
	//    4    8:invokestatic    #356 <Method String w()>
	//    5   11:astore_1        
			if(s1 == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       21
				flag = false;
	//    8   16:iconst_0        
	//    9   17:istore_0        
			else
	//*  10   18:goto            32
			if("".equals(((Object) (s1))))
	//*  11   21:ldc1            #217 <String "">
	//*  12   23:aload_1         
	//*  13   24:invokevirtual   #150 <Method boolean String.equals(Object)>
	//*  14   27:ifeq            32
				flag = false;
	//   15   30:iconst_0        
	//   16   31:istore_0        
		} else
	//*  17   32:goto            37
		{
			flag = false;
	//   18   35:iconst_0        
	//   19   36:istore_0        
		}
		dho.b("CommonUtil", new Object[] {
			(new StringBuilder()).append("isPhoneSupportUdid: ").append(flag).toString()
		});
	//   20   37:ldc1            #68  <String "CommonUtil">
	//   21   39:iconst_1        
	//   22   40:anewarray       Object[]
	//   23   43:dup             
	//   24   44:iconst_0        
	//   25   45:new             #120 <Class StringBuilder>
	//   26   48:dup             
	//   27   49:invokespecial   #121 <Method void StringBuilder()>
	//   28   52:ldc2            #1385 <String "isPhoneSupportUdid: ">
	//   29   55:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   30   58:iload_0         
	//   31   59:invokevirtual   #247 <Method StringBuilder StringBuilder.append(boolean)>
	//   32   62:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   33   65:aastore         
	//   34   66:invokestatic    #133 <Method void dho.b(String, Object[])>
		return flag;
	//   35   69:iload_0         
	//   36   70:ireturn         
	}

	public static final boolean v(Context context)
	{
		boolean flag;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(context == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       8
			return false;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		boolean flag1;
		context = ((Context) ((String)Class.forName((new StringBuilder()).append(context.getPackageName()).append(".BuildConfig").toString()).getField("BUILD_TYPE").get(((Object) (null)))));
	//    6    8:new             #120 <Class StringBuilder>
	//    7   11:dup             
	//    8   12:invokespecial   #121 <Method void StringBuilder()>
	//    9   15:aload_0         
	//   10   16:invokevirtual   #154 <Method String Context.getPackageName()>
	//   11   19:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   12   22:ldc2            #1389 <String ".BuildConfig">
	//   13   25:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   14   28:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   15   31:invokestatic    #480 <Method Class Class.forName(String)>
	//   16   34:ldc2            #1391 <String "BUILD_TYPE">
	//   17   37:invokevirtual   #1395 <Method Field Class.getField(String)>
	//   18   40:aconst_null     
	//   19   41:invokevirtual   #1400 <Method Object Field.get(Object)>
	//   20   44:checkcast       #46  <Class String>
	//   21   47:astore_0        
		dho.b("CommonUtil", new Object[] {
			"BUILD_TYPE = ", context
		});
	//   22   48:ldc1            #68  <String "CommonUtil">
	//   23   50:iconst_2        
	//   24   51:anewarray       Object[]
	//   25   54:dup             
	//   26   55:iconst_0        
	//   27   56:ldc2            #1402 <String "BUILD_TYPE = ">
	//   28   59:aastore         
	//   29   60:dup             
	//   30   61:iconst_1        
	//   31   62:aload_0         
	//   32   63:aastore         
	//   33   64:invokestatic    #133 <Method void dho.b(String, Object[])>
		flag1 = ((String) (context)).equals("release");
	//   34   67:aload_0         
	//   35   68:ldc1            #252 <String "release">
	//   36   70:invokevirtual   #150 <Method boolean String.equals(Object)>
	//   37   73:istore_2        
		flag = flag1;
	//   38   74:iload_2         
	//   39   75:istore_1        
		break MISSING_BLOCK_LABEL_154;
	//   40   76:goto            154
		context;
	//   41   79:astore_0        
		dho.f("CommonUtil", new Object[] {
			"isRelease IllegalAccessException e = ", ((IllegalAccessException) (context)).getMessage()
		});
	//   42   80:ldc1            #68  <String "CommonUtil">
	//   43   82:iconst_2        
	//   44   83:anewarray       Object[]
	//   45   86:dup             
	//   46   87:iconst_0        
	//   47   88:ldc2            #1404 <String "isRelease IllegalAccessException e = ">
	//   48   91:aastore         
	//   49   92:dup             
	//   50   93:iconst_1        
	//   51   94:aload_0         
	//   52   95:invokevirtual   #534 <Method String IllegalAccessException.getMessage()>
	//   53   98:aastore         
	//   54   99:invokestatic    #79  <Method void dho.f(String, Object[])>
		break MISSING_BLOCK_LABEL_154;
	//   55  102:goto            154
		context;
	//   56  105:astore_0        
		dho.f("CommonUtil", new Object[] {
			"isRelease ClassNotFoundException e = ", ((ClassNotFoundException) (context)).getMessage()
		});
	//   57  106:ldc1            #68  <String "CommonUtil">
	//   58  108:iconst_2        
	//   59  109:anewarray       Object[]
	//   60  112:dup             
	//   61  113:iconst_0        
	//   62  114:ldc2            #1406 <String "isRelease ClassNotFoundException e = ">
	//   63  117:aastore         
	//   64  118:dup             
	//   65  119:iconst_1        
	//   66  120:aload_0         
	//   67  121:invokevirtual   #484 <Method String ClassNotFoundException.getMessage()>
	//   68  124:aastore         
	//   69  125:invokestatic    #79  <Method void dho.f(String, Object[])>
		break MISSING_BLOCK_LABEL_154;
	//   70  128:goto            154
		context;
	//   71  131:astore_0        
		dho.f("CommonUtil", new Object[] {
			"isRelease NoSuchFieldException e = ", ((NoSuchFieldException) (context)).getMessage()
		});
	//   72  132:ldc1            #68  <String "CommonUtil">
	//   73  134:iconst_2        
	//   74  135:anewarray       Object[]
	//   75  138:dup             
	//   76  139:iconst_0        
	//   77  140:ldc2            #1408 <String "isRelease NoSuchFieldException e = ">
	//   78  143:aastore         
	//   79  144:dup             
	//   80  145:iconst_1        
	//   81  146:aload_0         
	//   82  147:invokevirtual   #1409 <Method String NoSuchFieldException.getMessage()>
	//   83  150:aastore         
	//   84  151:invokestatic    #79  <Method void dho.f(String, Object[])>
		dho.b("CommonUtil", new Object[] {
			"isRelease = ", Boolean.valueOf(flag)
		});
	//   85  154:ldc1            #68  <String "CommonUtil">
	//   86  156:iconst_2        
	//   87  157:anewarray       Object[]
	//   88  160:dup             
	//   89  161:iconst_0        
	//   90  162:ldc2            #1411 <String "isRelease = ">
	//   91  165:aastore         
	//   92  166:dup             
	//   93  167:iconst_1        
	//   94  168:iload_1         
	//   95  169:invokestatic    #141 <Method Boolean Boolean.valueOf(boolean)>
	//   96  172:aastore         
	//   97  173:invokestatic    #133 <Method void dho.b(String, Object[])>
		return flag;
	//   98  176:iload_1         
	//   99  177:ireturn         
	}

	public static String w()
	{
		Object obj;
		try
		{
			obj = ((Object) (Class.forName("com.huawei.android.os.BuildEx")));
	//    0    0:ldc2            #1220 <String "com.huawei.android.os.BuildEx">
	//    1    3:invokestatic    #480 <Method Class Class.forName(String)>
	//    2    6:astore_0        
			obj = ((Object) ((String)((Class) (obj)).getMethod("getUDID", ((Class []) (null))).invoke(((Class) (obj)).newInstance(), ((Object []) (null)))));
	//    3    7:aload_0         
	//    4    8:ldc2            #1413 <String "getUDID">
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #816 <Method Method Class.getMethod(String, Class[])>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #1208 <Method Object Class.newInstance()>
	//    9   19:aconst_null     
	//   10   20:invokevirtual   #508 <Method Object Method.invoke(Object, Object[])>
	//   11   23:checkcast       #46  <Class String>
	//   12   26:astore_0        
			dho.d("CommonUtil", new Object[] {
				(new StringBuilder()).append("getEMUIDeviceUDID = ").append(((String) (obj))).toString()
			});
	//   13   27:ldc1            #68  <String "CommonUtil">
	//   14   29:iconst_1        
	//   15   30:anewarray       Object[]
	//   16   33:dup             
	//   17   34:iconst_0        
	//   18   35:new             #120 <Class StringBuilder>
	//   19   38:dup             
	//   20   39:invokespecial   #121 <Method void StringBuilder()>
	//   21   42:ldc2            #1415 <String "getEMUIDeviceUDID = ">
	//   22   45:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   23   48:aload_0         
	//   24   49:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   25   52:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   26   55:aastore         
	//   27   56:invokestatic    #325 <Method void dho.d(String, Object[])>
			dho.b("CommonUtil", new Object[] {
				"getEMUIDeviceUDID deviceUdid"
			});
	//   28   59:ldc1            #68  <String "CommonUtil">
	//   29   61:iconst_1        
	//   30   62:anewarray       Object[]
	//   31   65:dup             
	//   32   66:iconst_0        
	//   33   67:ldc2            #1417 <String "getEMUIDeviceUDID deviceUdid">
	//   34   70:aastore         
	//   35   71:invokestatic    #133 <Method void dho.b(String, Object[])>
		}
	//*  36   74:aload_0         
	//*  37   75:areturn         
		catch(ClassNotFoundException classnotfoundexception)
	//*  38   76:astore_0        
		{
			dho.f("CommonUtil", new Object[] {
				(new StringBuilder()).append("getEMUIDeviceUDID(),ClassNotFoundException,").append(classnotfoundexception.getMessage()).toString()
			});
	//   39   77:ldc1            #68  <String "CommonUtil">
	//   40   79:iconst_1        
	//   41   80:anewarray       Object[]
	//   42   83:dup             
	//   43   84:iconst_0        
	//   44   85:new             #120 <Class StringBuilder>
	//   45   88:dup             
	//   46   89:invokespecial   #121 <Method void StringBuilder()>
	//   47   92:ldc2            #1419 <String "getEMUIDeviceUDID(),ClassNotFoundException,">
	//   48   95:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   49   98:aload_0         
	//   50   99:invokevirtual   #484 <Method String ClassNotFoundException.getMessage()>
	//   51  102:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   52  105:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   53  108:aastore         
	//   54  109:invokestatic    #79  <Method void dho.f(String, Object[])>
			return null;
	//   55  112:aconst_null     
	//   56  113:areturn         
		}
		catch(NoSuchMethodException nosuchmethodexception)
	//*  57  114:astore_0        
		{
			dho.f("CommonUtil", new Object[] {
				(new StringBuilder()).append("getEMUIDeviceUDID(),NoSuchMethodException,").append(nosuchmethodexception.getMessage()).toString()
			});
	//   58  115:ldc1            #68  <String "CommonUtil">
	//   59  117:iconst_1        
	//   60  118:anewarray       Object[]
	//   61  121:dup             
	//   62  122:iconst_0        
	//   63  123:new             #120 <Class StringBuilder>
	//   64  126:dup             
	//   65  127:invokespecial   #121 <Method void StringBuilder()>
	//   66  130:ldc2            #1421 <String "getEMUIDeviceUDID(),NoSuchMethodException,">
	//   67  133:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   68  136:aload_0         
	//   69  137:invokevirtual   #532 <Method String NoSuchMethodException.getMessage()>
	//   70  140:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   71  143:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   72  146:aastore         
	//   73  147:invokestatic    #79  <Method void dho.f(String, Object[])>
			return null;
	//   74  150:aconst_null     
	//   75  151:areturn         
		}
		catch(InvocationTargetException invocationtargetexception)
	//*  76  152:astore_0        
		{
			dho.f("CommonUtil", new Object[] {
				(new StringBuilder()).append("getEMUIDeviceUDID(),InvocationTargetException,").append(invocationtargetexception.getMessage()).toString()
			});
	//   77  153:ldc1            #68  <String "CommonUtil">
	//   78  155:iconst_1        
	//   79  156:anewarray       Object[]
	//   80  159:dup             
	//   81  160:iconst_0        
	//   82  161:new             #120 <Class StringBuilder>
	//   83  164:dup             
	//   84  165:invokespecial   #121 <Method void StringBuilder()>
	//   85  168:ldc2            #1423 <String "getEMUIDeviceUDID(),InvocationTargetException,">
	//   86  171:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   87  174:aload_0         
	//   88  175:invokevirtual   #533 <Method String InvocationTargetException.getMessage()>
	//   89  178:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   90  181:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   91  184:aastore         
	//   92  185:invokestatic    #79  <Method void dho.f(String, Object[])>
			return "";
	//   93  188:ldc1            #217 <String "">
	//   94  190:areturn         
		}
		catch(Exception exception)
	//*  95  191:astore_0        
		{
			dho.f("CommonUtil", new Object[] {
				(new StringBuilder()).append("getEMUIDeviceUDID(),others:").append(exception.getMessage()).toString()
			});
	//   96  192:ldc1            #68  <String "CommonUtil">
	//   97  194:iconst_1        
	//   98  195:anewarray       Object[]
	//   99  198:dup             
	//  100  199:iconst_0        
	//  101  200:new             #120 <Class StringBuilder>
	//  102  203:dup             
	//  103  204:invokespecial   #121 <Method void StringBuilder()>
	//  104  207:ldc2            #1425 <String "getEMUIDeviceUDID(),others:">
	//  105  210:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  106  213:aload_0         
	//  107  214:invokevirtual   #73  <Method String Exception.getMessage()>
	//  108  217:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  109  220:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  110  223:aastore         
	//  111  224:invokestatic    #79  <Method void dho.f(String, Object[])>
			return "";
	//  112  227:ldc1            #217 <String "">
	//  113  229:areturn         
		}
		return ((String) (obj));
	}

	public static boolean w(Context context)
	{
		context = ((Context) (n("ro.product.locale.region")));
	//    0    0:ldc2            #1427 <String "ro.product.locale.region">
	//    1    3:invokestatic    #1429 <Method String n(String)>
	//    2    6:astore_0        
		dho.d("CommonUtil", new Object[] {
			(new StringBuilder()).append("isChinaROM():productRegion = ").append(((String) (context))).toString()
		});
	//    3    7:ldc1            #68  <String "CommonUtil">
	//    4    9:iconst_1        
	//    5   10:anewarray       Object[]
	//    6   13:dup             
	//    7   14:iconst_0        
	//    8   15:new             #120 <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #121 <Method void StringBuilder()>
	//   11   22:ldc2            #1431 <String "isChinaROM():productRegion = ">
	//   12   25:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   13   28:aload_0         
	//   14   29:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   15   32:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   16   35:aastore         
	//   17   36:invokestatic    #325 <Method void dho.d(String, Object[])>
		if(!TextUtils.isEmpty(((CharSequence) (context))))
	//*  18   39:aload_0         
	//*  19   40:invokestatic    #305 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  20   43:ifne            54
			return "cn".equalsIgnoreCase(((String) (context)));
	//   21   46:ldc2            #574 <String "cn">
	//   22   49:aload_0         
	//   23   50:invokevirtual   #56  <Method boolean String.equalsIgnoreCase(String)>
	//   24   53:ireturn         
		context = ((Context) (n("ro.product.locale")));
	//   25   54:ldc2            #1433 <String "ro.product.locale">
	//   26   57:invokestatic    #1429 <Method String n(String)>
	//   27   60:astore_0        
		dho.d("CommonUtil", new Object[] {
			(new StringBuilder()).append("isChinaROM():productLocal = ").append(((String) (context))).toString()
		});
	//   28   61:ldc1            #68  <String "CommonUtil">
	//   29   63:iconst_1        
	//   30   64:anewarray       Object[]
	//   31   67:dup             
	//   32   68:iconst_0        
	//   33   69:new             #120 <Class StringBuilder>
	//   34   72:dup             
	//   35   73:invokespecial   #121 <Method void StringBuilder()>
	//   36   76:ldc2            #1435 <String "isChinaROM():productLocal = ">
	//   37   79:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   38   82:aload_0         
	//   39   83:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   40   86:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   41   89:aastore         
	//   42   90:invokestatic    #325 <Method void dho.d(String, Object[])>
		if(!TextUtils.isEmpty(((CharSequence) (context))))
	//*  43   93:aload_0         
	//*  44   94:invokestatic    #305 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  45   97:ifne            114
			return ((String) (context)).toLowerCase(Locale.US).contains("cn");
	//   46  100:aload_0         
	//   47  101:getstatic       #1438 <Field Locale Locale.US>
	//   48  104:invokevirtual   #1442 <Method String String.toLowerCase(Locale)>
	//   49  107:ldc2            #574 <String "cn">
	//   50  110:invokevirtual   #62  <Method boolean String.contains(CharSequence)>
	//   51  113:ireturn         
		context = ((Context) (Locale.getDefault().getCountry()));
	//   52  114:invokestatic    #729 <Method Locale Locale.getDefault()>
	//   53  117:invokevirtual   #563 <Method String Locale.getCountry()>
	//   54  120:astore_0        
		dho.d("CommonUtil", new Object[] {
			(new StringBuilder()).append("isChinaROM():localCountry = ").append(((String) (context))).toString()
		});
	//   55  121:ldc1            #68  <String "CommonUtil">
	//   56  123:iconst_1        
	//   57  124:anewarray       Object[]
	//   58  127:dup             
	//   59  128:iconst_0        
	//   60  129:new             #120 <Class StringBuilder>
	//   61  132:dup             
	//   62  133:invokespecial   #121 <Method void StringBuilder()>
	//   63  136:ldc2            #1444 <String "isChinaROM():localCountry = ">
	//   64  139:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   65  142:aload_0         
	//   66  143:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   67  146:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   68  149:aastore         
	//   69  150:invokestatic    #325 <Method void dho.d(String, Object[])>
		if(!TextUtils.isEmpty(((CharSequence) (context))))
	//*  70  153:aload_0         
	//*  71  154:invokestatic    #305 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  72  157:ifne            168
			return "cn".equalsIgnoreCase(((String) (context)));
	//   73  160:ldc2            #574 <String "cn">
	//   74  163:aload_0         
	//   75  164:invokevirtual   #56  <Method boolean String.equalsIgnoreCase(String)>
	//   76  167:ireturn         
		else
			return false;
	//   77  168:iconst_0        
	//   78  169:ireturn         
	}

	public static String x()
	{
		String s1;
		try
		{
			s1 = Build.SERIAL;
	//    0    0:getstatic       #1449 <Field String Build.SERIAL>
	//    1    3:astore_0        
		}
	//*   2    4:aload_0         
	//*   3    5:ifnull          48
	//*   4    8:ldc1            #217 <String "">
	//*   5   10:aload_0         
	//*   6   11:invokevirtual   #150 <Method boolean String.equals(Object)>
	//*   7   14:ifne            48
	//*   8   17:aload_0         
	//*   9   18:ldc2            #1451 <String "UTF-8">
	//*  10   21:invokevirtual   #1454 <Method byte[] String.getBytes(String)>
	//*  11   24:invokestatic    #1459 <Method byte[] cxc.b(byte[])>
	//*  12   27:invokestatic    #1464 <Method String czx.e(byte[])>
	//*  13   30:astore_0        
	//*  14   31:ldc1            #68  <String "CommonUtil">
	//*  15   33:iconst_1        
	//*  16   34:anewarray       Object[]
	//*  17   37:dup             
	//*  18   38:iconst_0        
	//*  19   39:ldc2            #1466 <String "getUdidBySn udid.">
	//*  20   42:aastore         
	//*  21   43:invokestatic    #133 <Method void dho.b(String, Object[])>
	//*  22   46:aload_0         
	//*  23   47:areturn         
	//*  24   48:ldc1            #217 <String "">
	//*  25   50:areturn         
		catch(UnsupportedEncodingException unsupportedencodingexception)
	//*  26   51:astore_0        
		{
			dho.f("CommonUtil", new Object[] {
				(new StringBuilder()).append("getUdidBySn:").append(unsupportedencodingexception.getMessage()).toString()
			});
	//   27   52:ldc1            #68  <String "CommonUtil">
	//   28   54:iconst_1        
	//   29   55:anewarray       Object[]
	//   30   58:dup             
	//   31   59:iconst_0        
	//   32   60:new             #120 <Class StringBuilder>
	//   33   63:dup             
	//   34   64:invokespecial   #121 <Method void StringBuilder()>
	//   35   67:ldc2            #1468 <String "getUdidBySn:">
	//   36   70:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   37   73:aload_0         
	//   38   74:invokevirtual   #1469 <Method String UnsupportedEncodingException.getMessage()>
	//   39   77:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   40   80:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   41   83:aastore         
	//   42   84:invokestatic    #79  <Method void dho.f(String, Object[])>
			return "";
	//   43   87:ldc1            #217 <String "">
	//   44   89:areturn         
		}
		catch(Exception exception)
	//*  45   90:astore_0        
		{
			dho.f("CommonUtil", new Object[] {
				(new StringBuilder()).append("getUdidBySn Exception:").append(exception.getMessage()).toString()
			});
	//   46   91:ldc1            #68  <String "CommonUtil">
	//   47   93:iconst_1        
	//   48   94:anewarray       Object[]
	//   49   97:dup             
	//   50   98:iconst_0        
	//   51   99:new             #120 <Class StringBuilder>
	//   52  102:dup             
	//   53  103:invokespecial   #121 <Method void StringBuilder()>
	//   54  106:ldc2            #1471 <String "getUdidBySn Exception:">
	//   55  109:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   56  112:aload_0         
	//   57  113:invokevirtual   #73  <Method String Exception.getMessage()>
	//   58  116:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   59  119:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   60  122:aastore         
	//   61  123:invokestatic    #79  <Method void dho.f(String, Object[])>
			return "";
	//   62  126:ldc1            #217 <String "">
	//   63  128:areturn         
		}
		if(s1 == null)
			break MISSING_BLOCK_LABEL_48;
		if("".equals(((Object) (s1))))
			break MISSING_BLOCK_LABEL_48;
		s1 = czx.e(cxc.b(s1.getBytes("UTF-8")));
		dho.b("CommonUtil", new Object[] {
			"getUdidBySn udid."
		});
		return s1;
		return "";
	}

	public static void x(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		else
			return;
	//    3    5:return          
	}

	public static List y()
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #1474 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #1475 <Method void HashSet()>
	//    3    7:astore_1        
		Locale alocale[] = Locale.getAvailableLocales();
	//    4    8:invokestatic    #1069 <Method Locale[] Locale.getAvailableLocales()>
	//    5   11:astore_2        
		for(int i1 = 0; i1 < alocale.length; i1++)
	//*   6   12:iconst_0        
	//*   7   13:istore_0        
	//*   8   14:iload_0         
	//*   9   15:aload_2         
	//*  10   16:arraylength     
	//*  11   17:icmpge          105
		{
			String s1 = alocale[i1].getCountry();
	//   12   20:aload_2         
	//   13   21:iload_0         
	//   14   22:aaload          
	//   15   23:invokevirtual   #563 <Method String Locale.getCountry()>
	//   16   26:astore_3        
			if(s1 != null && !s1.trim().isEmpty() && s1.matches("[a-zA-Z]+") && alocale[i1].getDisplayCountry() != null && !alocale[i1].getDisplayCountry().trim().isEmpty() && !s1.equalsIgnoreCase("IL"))
	//*  17   27:aload_3         
	//*  18   28:ifnull          98
	//*  19   31:aload_3         
	//*  20   32:invokevirtual   #321 <Method String String.trim()>
	//*  21   35:invokevirtual   #1065 <Method boolean String.isEmpty()>
	//*  22   38:ifne            98
	//*  23   41:aload_3         
	//*  24   42:ldc2            #1477 <String "[a-zA-Z]+">
	//*  25   45:invokevirtual   #1480 <Method boolean String.matches(String)>
	//*  26   48:ifeq            98
	//*  27   51:aload_2         
	//*  28   52:iload_0         
	//*  29   53:aaload          
	//*  30   54:invokevirtual   #1072 <Method String Locale.getDisplayCountry()>
	//*  31   57:ifnull          98
	//*  32   60:aload_2         
	//*  33   61:iload_0         
	//*  34   62:aaload          
	//*  35   63:invokevirtual   #1072 <Method String Locale.getDisplayCountry()>
	//*  36   66:invokevirtual   #321 <Method String String.trim()>
	//*  37   69:invokevirtual   #1065 <Method boolean String.isEmpty()>
	//*  38   72:ifne            98
	//*  39   75:aload_3         
	//*  40   76:ldc2            #1482 <String "IL">
	//*  41   79:invokevirtual   #56  <Method boolean String.equalsIgnoreCase(String)>
	//*  42   82:ifne            98
				((Set) (hashset)).add(((Object) (alocale[i1].getDisplayCountry())));
	//   43   85:aload_1         
	//   44   86:aload_2         
	//   45   87:iload_0         
	//   46   88:aaload          
	//   47   89:invokevirtual   #1072 <Method String Locale.getDisplayCountry()>
	//   48   92:invokeinterface #1485 <Method boolean Set.add(Object)>
	//   49   97:pop             
		}

	//   50   98:iload_0         
	//   51   99:iconst_1        
	//   52  100:iadd            
	//   53  101:istore_0        
	//*  54  102:goto            14
		ArrayList arraylist = new ArrayList();
	//   55  105:new             #90  <Class ArrayList>
	//   56  108:dup             
	//   57  109:invokespecial   #91  <Method void ArrayList()>
	//   58  112:astore_2        
		((List) (arraylist)).addAll(((java.util.Collection) (hashset)));
	//   59  113:aload_2         
	//   60  114:aload_1         
	//   61  115:invokeinterface #1489 <Method boolean List.addAll(java.util.Collection)>
	//   62  120:pop             
		Collections.sort(((List) (arraylist)), ((java.util.Comparator) (Collator.getInstance(Locale.CHINA))));
	//   63  121:aload_2         
	//   64  122:getstatic       #1492 <Field Locale Locale.CHINA>
	//   65  125:invokestatic    #1497 <Method Collator Collator.getInstance(Locale)>
	//   66  128:invokestatic    #1503 <Method void Collections.sort(List, java.util.Comparator)>
		return ((List) (arraylist));
	//   67  131:aload_2         
	//   68  132:areturn         
	}

	public static void y(Context context)
	{
		if(context != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          34
		{
			Intent intent = new Intent("com.huawei.hihealth.action_receive_push_restart");
	//    2    4:new             #824 <Class Intent>
	//    3    7:dup             
	//    4    8:ldc2            #1506 <String "com.huawei.hihealth.action_receive_push_restart">
	//    5   11:invokespecial   #825 <Method void Intent(String)>
	//    6   14:astore_1        
			intent.setPackage("com.huawei.bone");
	//    7   15:aload_1         
	//    8   16:ldc1            #237 <String "com.huawei.bone">
	//    9   18:invokevirtual   #829 <Method Intent Intent.setPackage(String)>
	//   10   21:pop             
			intent.setFlags(32);
	//   11   22:aload_1         
	//   12   23:bipush          32
	//   13   25:invokevirtual   #1195 <Method Intent Intent.setFlags(int)>
	//   14   28:pop             
			context.sendBroadcast(intent);
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #1508 <Method void Context.sendBroadcast(Intent)>
		}
	//   18   34:return          
	}

	public static String z()
	{
		String s1;
		try
		{
			s1 = Build.SERIAL;
	//    0    0:getstatic       #1449 <Field String Build.SERIAL>
	//    1    3:astore_0        
		}
	//*   2    4:aload_0         
	//*   3    5:areturn         
		catch(Exception exception)
	//*   4    6:astore_0        
		{
			dho.f("CommonUtil", new Object[] {
				(new StringBuilder()).append("getPhoneSn Exception:").append(exception.getMessage()).toString()
			});
	//    5    7:ldc1            #68  <String "CommonUtil">
	//    6    9:iconst_1        
	//    7   10:anewarray       Object[]
	//    8   13:dup             
	//    9   14:iconst_0        
	//   10   15:new             #120 <Class StringBuilder>
	//   11   18:dup             
	//   12   19:invokespecial   #121 <Method void StringBuilder()>
	//   13   22:ldc2            #1511 <String "getPhoneSn Exception:">
	//   14   25:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   15   28:aload_0         
	//   16   29:invokevirtual   #73  <Method String Exception.getMessage()>
	//   17   32:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   18   35:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   19   38:aastore         
	//   20   39:invokestatic    #79  <Method void dho.f(String, Object[])>
			return "";
	//   21   42:ldc1            #217 <String "">
	//   22   44:areturn         
		}
		return s1;
	}

	public static String z(Context context)
	{
		context = ((Context) (dhu.g()));
	//    0    0:invokestatic    #1513 <Method String dhu.g()>
	//    1    3:astore_0        
		dho.b("CommonUtil", new Object[] {
			"pathPre = ", context
		});
	//    2    4:ldc1            #68  <String "CommonUtil">
	//    3    6:iconst_2        
	//    4    7:anewarray       Object[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:ldc2            #1515 <String "pathPre = ">
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_0         
	//   12   19:aastore         
	//   13   20:invokestatic    #133 <Method void dho.b(String, Object[])>
		return ((String) (context));
	//   14   23:aload_0         
	//   15   24:areturn         
	}

	private static long a = 0L;
	private static final Object b = new Object();
	private static String c = null;
	private static BroadcastReceiver d = new BroadcastReceiver() {

		public void onReceive(Context context, Intent intent)
		{
			if(context == null || intent == null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          8
		//*   2    4:aload_2         
		//*   3    5:ifnonnull       23
			{
				dho.e("CommonUtil", new Object[] {
					"update receive null,deal failed,return"
				});
		//    4    8:ldc1            #15  <String "CommonUtil">
		//    5   10:iconst_1        
		//    6   11:anewarray       Object[]
		//    7   14:dup             
		//    8   15:iconst_0        
		//    9   16:ldc1            #19  <String "update receive null,deal failed,return">
		//   10   18:aastore         
		//   11   19:invokestatic    #25  <Method void dho.e(String, Object[])>
				return;
		//   12   22:return          
			}
			context = ((Context) (intent.getAction()));
		//   13   23:aload_2         
		//   14   24:invokevirtual   #31  <Method String Intent.getAction()>
		//   15   27:astore_1        
			if(context == null)
		//*  16   28:aload_1         
		//*  17   29:ifnonnull       47
			{
				dho.e("CommonUtil", new Object[] {
					"updateReceiver receive action null,deal failed,return"
				});
		//   18   32:ldc1            #15  <String "CommonUtil">
		//   19   34:iconst_1        
		//   20   35:anewarray       Object[]
		//   21   38:dup             
		//   22   39:iconst_0        
		//   23   40:ldc1            #33  <String "updateReceiver receive action null,deal failed,return">
		//   24   42:aastore         
		//   25   43:invokestatic    #25  <Method void dho.e(String, Object[])>
				return;
		//   26   46:return          
			}
			dho.b("CommonUtil", new Object[] {
				(new StringBuilder()).append("update receive,action:").append(((String) (context))).toString()
			});
		//   27   47:ldc1            #15  <String "CommonUtil">
		//   28   49:iconst_1        
		//   29   50:anewarray       Object[]
		//   30   53:dup             
		//   31   54:iconst_0        
		//   32   55:new             #35  <Class StringBuilder>
		//   33   58:dup             
		//   34   59:invokespecial   #36  <Method void StringBuilder()>
		//   35   62:ldc1            #38  <String "update receive,action:">
		//   36   64:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   37   67:aload_1         
		//   38   68:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   39   71:invokevirtual   #45  <Method String StringBuilder.toString()>
		//   40   74:aastore         
		//   41   75:invokestatic    #48  <Method void dho.b(String, Object[])>
			intent = ((Intent) (intent.getStringExtra("update_state")));
		//   42   78:aload_2         
		//   43   79:ldc1            #50  <String "update_state">
		//   44   81:invokevirtual   #54  <Method String Intent.getStringExtra(String)>
		//   45   84:astore_2        
			if(intent == null)
		//*  46   85:aload_2         
		//*  47   86:ifnonnull       104
			{
				dho.e("CommonUtil", new Object[] {
					"updateReceiver receive state null,deal failed,return"
				});
		//   48   89:ldc1            #15  <String "CommonUtil">
		//   49   91:iconst_1        
		//   50   92:anewarray       Object[]
		//   51   95:dup             
		//   52   96:iconst_0        
		//   53   97:ldc1            #56  <String "updateReceiver receive state null,deal failed,return">
		//   54   99:aastore         
		//   55  100:invokestatic    #25  <Method void dho.e(String, Object[])>
				return;
		//   56  103:return          
			}
			dho.b("CommonUtil", new Object[] {
				(new StringBuilder()).append("update receive,state:").append(((String) (intent))).toString()
			});
		//   57  104:ldc1            #15  <String "CommonUtil">
		//   58  106:iconst_1        
		//   59  107:anewarray       Object[]
		//   60  110:dup             
		//   61  111:iconst_0        
		//   62  112:new             #35  <Class StringBuilder>
		//   63  115:dup             
		//   64  116:invokespecial   #36  <Method void StringBuilder()>
		//   65  119:ldc1            #58  <String "update receive,state:">
		//   66  121:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   67  124:aload_2         
		//   68  125:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   69  128:invokevirtual   #45  <Method String StringBuilder.toString()>
		//   70  131:aastore         
		//   71  132:invokestatic    #48  <Method void dho.b(String, Object[])>
			if(((String) (context)).equals("com.huawei.health.update_commonutils_area"))
		//*  72  135:aload_1         
		//*  73  136:ldc1            #60  <String "com.huawei.health.update_commonutils_area">
		//*  74  138:invokevirtual   #66  <Method boolean String.equals(Object)>
		//*  75  141:ifeq            150
			{
				dbf.o(((String) (intent)));
		//   76  144:aload_2         
		//   77  145:invokestatic    #69  <Method String dbf.o(String)>
		//   78  148:pop             
				return;
		//   79  149:return          
			}
			if(((String) (context)).equals("com.huawei.health.update_commonutils_LOGIN"))
		//*  80  150:aload_1         
		//*  81  151:ldc1            #71  <String "com.huawei.health.update_commonutils_LOGIN">
		//*  82  153:invokevirtual   #66  <Method boolean String.equals(Object)>
		//*  83  156:ifeq            164
				dbf.l(((String) (intent)));
		//   84  159:aload_2         
		//   85  160:invokestatic    #74  <Method String dbf.l(String)>
		//   86  163:pop             
		//   87  164:return          
		}

	}
;
	private static String e = null;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void Object()>
	//    3    7:putstatic       #22  <Field Object b>
	//    4   10:aconst_null     
	//    5   11:putstatic       #24  <Field String e>
	//    6   14:aconst_null     
	//    7   15:putstatic       #26  <Field String c>
	//    8   18:new             #6   <Class dbf$4>
	//    9   21:dup             
	//   10   22:invokespecial   #27  <Method void dbf$4()>
	//   11   25:putstatic       #29  <Field BroadcastReceiver d>
	//   12   28:lconst_0        
	//   13   29:putstatic       #31  <Field long a>
	//*  14   32:return          
	}
}
