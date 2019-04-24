// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.config;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.text.TextUtils;
import com.baidu.android.pushservice.PushSettings;
import com.baidu.android.pushservice.a;
import com.baidu.android.pushservice.d.b;
import com.baidu.android.pushservice.g.c;
import com.baidu.android.pushservice.g.d;
import com.baidu.android.pushservice.h;
import com.baidu.android.pushservice.h.m;
import com.baidu.android.pushservice.h.u;
import com.baidu.android.pushservice.i.e;
import com.xiaomi.mipush.sdk.PushMessageReceiver;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.lang.reflect.Method;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.baidu.android.pushservice.config:
//			b, c, d, e

public class ModeConfig extends com.baidu.android.pushservice.config.b
{
	public static interface a
	{

		public abstract void a();
	}


	protected ModeConfig(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #76  <Method void com.baidu.android.pushservice.config.b(Context)>
		updateConfigUrl = "https://api.tuisong.baidu.com/rest/3.0/clientfile/updatesdkconfig";
	//    3    5:aload_0         
	//    4    6:ldc1            #78  <String "https://api.tuisong.baidu.com/rest/3.0/clientfile/updatesdkconfig">
	//    5    8:putfield        #80  <Field String updateConfigUrl>
		mCurrentMode = MODE_O;
	//    6   11:aload_0         
	//    7   12:getstatic       #82  <Field int MODE_O>
	//    8   15:putfield        #84  <Field int mCurrentMode>
		mHighestVersion = ((int) (com.baidu.android.pushservice.a.a()));
	//    9   18:aload_0         
	//   10   19:invokestatic    #89  <Method short a.a()>
	//   11   22:putfield        #91  <Field int mHighestVersion>
		mHostPackage = null;
	//   12   25:aload_0         
	//   13   26:aconst_null     
	//   14   27:putfield        #93  <Field String mHostPackage>
		com.baidu.android.pushservice.e.a.c(TAG, "ModeConfig constructor......");
	//   15   30:getstatic       #95  <Field String TAG>
	//   16   33:ldc1            #97  <String "ModeConfig constructor......">
	//   17   35:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
		context = ((Context) (new StringBuilder()));
	//   18   38:new             #105 <Class StringBuilder>
	//   19   41:dup             
	//   20   42:invokespecial   #107 <Method void StringBuilder()>
	//   21   45:astore_1        
		((StringBuilder) (context)).append("/data/data/");
	//   22   46:aload_1         
	//   23   47:ldc1            #109 <String "/data/data/">
	//   24   49:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		((StringBuilder) (context)).append(mContext.getPackageName());
	//   26   53:aload_1         
	//   27   54:aload_0         
	//   28   55:getfield        #117 <Field Context mContext>
	//   29   58:invokevirtual   #123 <Method String Context.getPackageName()>
	//   30   61:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   31   64:pop             
		((StringBuilder) (context)).append("/files/bdpush_modeconfig.json");
	//   32   65:aload_1         
	//   33   66:ldc1            #125 <String "/files/bdpush_modeconfig.json">
	//   34   68:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   35   71:pop             
		localConfigPath = ((StringBuilder) (context)).toString();
	//   36   72:aload_0         
	//   37   73:aload_1         
	//   38   74:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   39   77:putfield        #131 <Field String localConfigPath>
		defaultConfigPath = "/com/baidu/android/pushservice/assets/defaultconfig.json";
	//   40   80:aload_0         
	//   41   81:ldc1            #133 <String "/com/baidu/android/pushservice/assets/defaultconfig.json">
	//   42   83:putfield        #136 <Field String defaultConfigPath>
		reload();
	//   43   86:aload_0         
	//   44   87:invokevirtual   #139 <Method void reload()>
	//   45   90:return          
	}

	private static String byte2HexFormatted(byte abyte0[])
	{
		StringBuffer stringbuffer = new StringBuffer(abyte0.length * 2);
	//    0    0:new             #158 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:arraylength     
	//    4    6:iconst_2        
	//    5    7:imul            
	//    6    8:invokespecial   #161 <Method void StringBuffer(int)>
	//    7   11:astore          5
		for(int i = 0; i < abyte0.length; i++)
	//*   8   13:iconst_0        
	//*   9   14:istore_1        
	//*  10   15:iload_1         
	//*  11   16:aload_0         
	//*  12   17:arraylength     
	//*  13   18:icmpge          109
		{
			Object obj1 = ((Object) (Integer.toHexString(((int) (abyte0[i])))));
	//   14   21:aload_0         
	//   15   22:iload_1         
	//   16   23:baload          
	//   17   24:invokestatic    #167 <Method String Integer.toHexString(int)>
	//   18   27:astore          4
			int j = ((String) (obj1)).length();
	//   19   29:aload           4
	//   20   31:invokevirtual   #171 <Method int String.length()>
	//   21   34:istore_2        
			Object obj = obj1;
	//   22   35:aload           4
	//   23   37:astore_3        
			if(j == 1)
	//*  24   38:iload_2         
	//*  25   39:iconst_1        
	//*  26   40:icmpne          70
			{
				obj = ((Object) (new StringBuilder()));
	//   27   43:new             #105 <Class StringBuilder>
	//   28   46:dup             
	//   29   47:invokespecial   #107 <Method void StringBuilder()>
	//   30   50:astore_3        
				((StringBuilder) (obj)).append("0");
	//   31   51:aload_3         
	//   32   52:ldc1            #173 <String "0">
	//   33   54:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   34   57:pop             
				((StringBuilder) (obj)).append(((String) (obj1)));
	//   35   58:aload_3         
	//   36   59:aload           4
	//   37   61:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   38   64:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   39   65:aload_3         
	//   40   66:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   41   69:astore_3        
			}
			obj1 = obj;
	//   42   70:aload_3         
	//   43   71:astore          4
			if(j > 2)
	//*  44   73:iload_2         
	//*  45   74:iconst_2        
	//*  46   75:icmple          88
				obj1 = ((Object) (((String) (obj)).substring(j - 2, j)));
	//   47   78:aload_3         
	//   48   79:iload_2         
	//   49   80:iconst_2        
	//   50   81:isub            
	//   51   82:iload_2         
	//   52   83:invokevirtual   #177 <Method String String.substring(int, int)>
	//   53   86:astore          4
			stringbuffer.append(((String) (obj1)).toUpperCase(Locale.ENGLISH));
	//   54   88:aload           5
	//   55   90:aload           4
	//   56   92:getstatic       #183 <Field Locale Locale.ENGLISH>
	//   57   95:invokevirtual   #187 <Method String String.toUpperCase(Locale)>
	//   58   98:invokevirtual   #190 <Method StringBuffer StringBuffer.append(String)>
	//   59  101:pop             
		}

	//   60  102:iload_1         
	//   61  103:iconst_1        
	//   62  104:iadd            
	//   63  105:istore_1        
	//*  64  106:goto            15
		return stringbuffer.toString();
	//   65  109:aload           5
	//   66  111:invokevirtual   #191 <Method String StringBuffer.toString()>
	//   67  114:areturn         
	}

	public static ModeConfig getInstance(Context context)
	{
		if(mInstance != null)
	//*   0    0:getstatic       #195 <Field ModeConfig mInstance>
	//*   1    3:ifnull          10
		{
			return mInstance;
	//    2    6:getstatic       #195 <Field ModeConfig mInstance>
	//    3    9:areturn         
		} else
		{
			mInstance = new ModeConfig(context);
	//    4   10:new             #2   <Class ModeConfig>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:invokespecial   #196 <Method void ModeConfig(Context)>
	//    8   18:putstatic       #195 <Field ModeConfig mInstance>
			return mInstance;
	//    9   21:getstatic       #195 <Field ModeConfig mInstance>
	//   10   24:areturn         
		}
	}

	private boolean initFromCache()
	{
		mConfigVersion = m.b(mContext, "com.baidu.android.pushservice.config.MODE_CONFIG_VERSION", -1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #117 <Field Context mContext>
	//    3    5:ldc1            #199 <String "com.baidu.android.pushservice.config.MODE_CONFIG_VERSION">
	//    4    7:iconst_m1       
	//    5    8:invokestatic    #205 <Method int m.b(Context, String, int)>
	//    6   11:putfield        #143 <Field int mConfigVersion>
		if(mConfigVersion == -1)
	//*   7   14:aload_0         
	//*   8   15:getfield        #143 <Field int mConfigVersion>
	//*   9   18:iconst_m1       
	//*  10   19:icmpne          24
			return false;
	//   11   22:iconst_0        
	//   12   23:ireturn         
		String s = m.a(mContext, "com.baidu.android.pushservice.config.MODE_MANUFACTURER_CACHE");
	//   13   24:aload_0         
	//   14   25:getfield        #117 <Field Context mContext>
	//   15   28:ldc1            #207 <String "com.baidu.android.pushservice.config.MODE_MANUFACTURER_CACHE">
	//   16   30:invokestatic    #210 <Method String m.a(Context, String)>
	//   17   33:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  18   34:aload_1         
	//*  19   35:invokestatic    #216 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  20   38:ifeq            43
			return false;
	//   21   41:iconst_0        
	//   22   42:ireturn         
		if(!s.equals("CONFIG_MANUFACTURER_DEFAULT"))
	//*  23   43:aload_1         
	//*  24   44:ldc1            #14  <String "CONFIG_MANUFACTURER_DEFAULT">
	//*  25   46:invokevirtual   #220 <Method boolean String.equals(Object)>
	//*  26   49:ifne            64
			mFacturer = new com.baidu.android.pushservice.config.c(s);
	//   27   52:aload_0         
	//   28   53:new             #222 <Class com.baidu.android.pushservice.config.c>
	//   29   56:dup             
	//   30   57:aload_1         
	//   31   58:invokespecial   #225 <Method void com.baidu.android.pushservice.config.c(String)>
	//   32   61:putfield        #227 <Field com.baidu.android.pushservice.config.c mFacturer>
		return true;
	//   33   64:iconst_1        
	//   34   65:ireturn         
	}

	public static boolean isHuaweiProxyMode(Context context)
	{
		return getInstance(context).getCurrentMode() == MODE_I_HW && PushSettings.n(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #231 <Method ModeConfig getInstance(Context)>
	//    2    4:invokevirtual   #234 <Method int getCurrentMode()>
	//    3    7:getstatic       #236 <Field int MODE_I_HW>
	//    4   10:icmpne          22
	//    5   13:aload_0         
	//    6   14:invokestatic    #241 <Method boolean PushSettings.n(Context)>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public static boolean isProxyMode(Context context)
	{
		return isHuaweiProxyMode(context) || isXiaomiProxyMode(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #244 <Method boolean isHuaweiProxyMode(Context)>
	//    2    4:ifne            19
	//    3    7:aload_0         
	//    4    8:invokestatic    #247 <Method boolean isXiaomiProxyMode(Context)>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public static boolean isXiaomiProxyMode(Context context)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		boolean flag;
		boolean flag2;
		try
		{
			PushMessageReceiver.isMipushPatch();
	//    2    2:invokestatic    #254 <Method boolean PushMessageReceiver.isMipushPatch()>
	//    3    5:pop             
		}
	//*   4    6:iload_2         
	//*   5    7:istore_1        
	//*   6    8:aload_0         
	//*   7    9:invokestatic    #231 <Method ModeConfig getInstance(Context)>
	//*   8   12:invokevirtual   #234 <Method int getCurrentMode()>
	//*   9   15:getstatic       #256 <Field int MODE_I_XM>
	//*  10   18:icmpne          34
	//*  11   21:aload_0         
	//*  12   22:invokestatic    #259 <Method boolean PushSettings.m(Context)>
	//*  13   25:istore_3        
	//*  14   26:iload_2         
	//*  15   27:istore_1        
	//*  16   28:iload_3         
	//*  17   29:ifeq            34
	//*  18   32:iconst_1        
	//*  19   33:istore_1        
	//*  20   34:iload_1         
	//*  21   35:ireturn         
	//*  22   36:getstatic       #95  <Field String TAG>
	//*  23   39:ldc2            #261 <String "not found com.xiaomi.mipush pkg, not xiaomiproxy mode!!!">
	//*  24   42:invokestatic    #264 <Method void com.baidu.android.pushservice.e.a.e(String, String)>
	//*  25   45:iconst_0        
	//*  26   46:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			com.baidu.android.pushservice.e.a.e(TAG, "not found com.xiaomi.mipush pkg, not xiaomiproxy mode!!!");
			return false;
		}
		flag = flag1;
		if(getInstance(context).getCurrentMode() != MODE_I_XM)
			break MISSING_BLOCK_LABEL_34;
		flag2 = PushSettings.m(context);
		flag = flag1;
		if(flag2)
			flag = true;
		return flag;
	//*  27   47:astore_0        
	//*  28   48:goto            36
	}

	private boolean manufacturerMatched(com.baidu.android.pushservice.config.c c1, String s)
	{
		int j;
		if(c1 == null || c1.d() == null || c1.d().size() <= 0)
			break MISSING_BLOCK_LABEL_489;
	//    0    0:aload_1         
	//    1    1:ifnull          489
	//    2    4:aload_1         
	//    3    5:invokevirtual   #274 <Method ArrayList com.baidu.android.pushservice.config.c.d()>
	//    4    8:ifnull          489
	//    5   11:aload_1         
	//    6   12:invokevirtual   #274 <Method ArrayList com.baidu.android.pushservice.config.c.d()>
	//    7   15:invokevirtual   #279 <Method int ArrayList.size()>
	//    8   18:ifle            489
		com.baidu.android.pushservice.e.a.c(TAG, "getPropValues");
	//    9   21:getstatic       #95  <Field String TAG>
	//   10   24:ldc2            #281 <String "getPropValues">
	//   11   27:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
		j = 0;
	//   12   30:iconst_0        
	//   13   31:istore          8
_L3:
		if(j >= c1.d().size()) goto _L2; else goto _L1
	//   14   33:iload           8
	//   15   35:aload_1         
	//   16   36:invokevirtual   #274 <Method ArrayList com.baidu.android.pushservice.config.c.d()>
	//   17   39:invokevirtual   #279 <Method int ArrayList.size()>
	//   18   42:icmpge          489
_L1:
		Object obj = ((Object) ((com.baidu.android.pushservice.config.d)c1.d().get(j)));
	//   19   45:aload_1         
	//   20   46:invokevirtual   #274 <Method ArrayList com.baidu.android.pushservice.config.c.d()>
	//   21   49:iload           8
	//   22   51:invokevirtual   #285 <Method Object ArrayList.get(int)>
	//   23   54:checkcast       #287 <Class com.baidu.android.pushservice.config.d>
	//   24   57:astore          11
		boolean flag1;
		Object obj1;
		Object obj2;
		obj1 = ((Object) (com.baidu.android.pushservice.h.a.a().a(((com.baidu.android.pushservice.config.d) (obj)).a(), "")));
	//   25   59:invokestatic    #292 <Method com.baidu.android.pushservice.h.a com.baidu.android.pushservice.h.a.a()>
	//   26   62:aload           11
	//   27   64:invokevirtual   #294 <Method String com.baidu.android.pushservice.config.d.a()>
	//   28   67:ldc2            #296 <String "">
	//   29   70:invokevirtual   #299 <Method String com.baidu.android.pushservice.h.a.a(String, String)>
	//   30   73:astore          12
		obj2 = ((Object) (((com.baidu.android.pushservice.config.d) (obj)).b()));
	//   31   75:aload           11
	//   32   77:invokevirtual   #301 <Method String com.baidu.android.pushservice.config.d.b()>
	//   33   80:astore          13
		String s1 = TAG;
	//   34   82:getstatic       #95  <Field String TAG>
	//   35   85:astore          14
		StringBuilder stringbuilder1 = new StringBuilder();
	//   36   87:new             #105 <Class StringBuilder>
	//   37   90:dup             
	//   38   91:invokespecial   #107 <Method void StringBuilder()>
	//   39   94:astore          15
		stringbuilder1.append("MatchValue=");
	//   40   96:aload           15
	//   41   98:ldc2            #303 <String "MatchValue=">
	//   42  101:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   43  104:pop             
		stringbuilder1.append(((com.baidu.android.pushservice.config.d) (obj)).c());
	//   44  105:aload           15
	//   45  107:aload           11
	//   46  109:invokevirtual   #305 <Method int com.baidu.android.pushservice.config.d.c()>
	//   47  112:invokevirtual   #308 <Method StringBuilder StringBuilder.append(int)>
	//   48  115:pop             
		stringbuilder1.append(" | ");
	//   49  116:aload           15
	//   50  118:ldc2            #310 <String " | ">
	//   51  121:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   52  124:pop             
		stringbuilder1.append(((String) (obj1)));
	//   53  125:aload           15
	//   54  127:aload           12
	//   55  129:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   56  132:pop             
		stringbuilder1.append("--");
	//   57  133:aload           15
	//   58  135:ldc2            #312 <String "--">
	//   59  138:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   60  141:pop             
		stringbuilder1.append(((String) (obj2)));
	//   61  142:aload           15
	//   62  144:aload           13
	//   63  146:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   64  149:pop             
		com.baidu.android.pushservice.e.a.c(s1, stringbuilder1.toString());
	//   65  150:aload           14
	//   66  152:aload           15
	//   67  154:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   68  157:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
		if(((com.baidu.android.pushservice.config.d) (obj)).c() != 0)
			break MISSING_BLOCK_LABEL_292;
	//   69  160:aload           11
	//   70  162:invokevirtual   #305 <Method int com.baidu.android.pushservice.config.d.c()>
	//   71  165:ifne            292
		if(TextUtils.isEmpty(((CharSequence) (obj2))))
			continue; /* Loop/switch isn't completed */
	//   72  168:aload           13
	//   73  170:invokestatic    #216 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   74  173:ifne            480
		flag1 = TextUtils.isEmpty(((CharSequence) (obj1)));
	//   75  176:aload           12
	//   76  178:invokestatic    #216 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   77  181:istore          10
		if(flag1)
			continue; /* Loop/switch isn't completed */
	//   78  183:iload           10
	//   79  185:ifne            480
		double d1 = Double.parseDouble(((String) (obj2)));
	//   80  188:aload           13
	//   81  190:invokestatic    #318 <Method double Double.parseDouble(String)>
	//   82  193:dstore_3        
		double d2;
		try
		{
			d2 = Double.parseDouble(((String) (obj1)));
	//   83  194:aload           12
	//   84  196:invokestatic    #318 <Method double Double.parseDouble(String)>
	//   85  199:dstore          5
			break MISSING_BLOCK_LABEL_274;
	//   86  201:goto            274
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//   87  204:astore          11
		break MISSING_BLOCK_LABEL_213;
	//   88  206:goto            213
		obj;
	//   89  209:astore          11
		d1 = 0.0D;
	//   90  211:dconst_0        
	//   91  212:dstore_3        
		obj1 = ((Object) (TAG));
	//   92  213:getstatic       #95  <Field String TAG>
	//   93  216:astore          12
		obj2 = ((Object) (new StringBuilder()));
	//   94  218:new             #105 <Class StringBuilder>
	//   95  221:dup             
	//   96  222:invokespecial   #107 <Method void StringBuilder()>
	//   97  225:astore          13
		((StringBuilder) (obj2)).append("number format exception  confv ");
	//   98  227:aload           13
	//   99  229:ldc2            #320 <String "number format exception  confv ">
	//  100  232:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  101  235:pop             
		((StringBuilder) (obj2)).append(d1);
	//  102  236:aload           13
	//  103  238:dload_3         
	//  104  239:invokevirtual   #323 <Method StringBuilder StringBuilder.append(double)>
	//  105  242:pop             
		((StringBuilder) (obj2)).append(" val ");
	//  106  243:aload           13
	//  107  245:ldc2            #325 <String " val ">
	//  108  248:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  109  251:pop             
		((StringBuilder) (obj2)).append(0.0D);
	//  110  252:aload           13
	//  111  254:dconst_0        
	//  112  255:invokevirtual   #323 <Method StringBuilder StringBuilder.append(double)>
	//  113  258:pop             
		com.baidu.android.pushservice.e.a.a(((String) (obj1)), ((StringBuilder) (obj2)).toString(), ((Throwable) (obj)));
	//  114  259:aload           12
	//  115  261:aload           13
	//  116  263:invokevirtual   #128 <Method String StringBuilder.toString()>
	//  117  266:aload           11
	//  118  268:invokestatic    #328 <Method void com.baidu.android.pushservice.e.a.a(String, String, Throwable)>
		d2 = 0.0D;
	//  119  271:dconst_0        
	//  120  272:dstore          5
		if(d2 < d1)
			continue; /* Loop/switch isn't completed */
	//  121  274:dload           5
	//  122  276:dload_3         
	//  123  277:dcmpl           
	//  124  278:iflt            480
		com.baidu.android.pushservice.e.a.c(TAG, "manufacturerMatched success!!!");
	//  125  281:getstatic       #95  <Field String TAG>
	//  126  284:ldc2            #330 <String "manufacturerMatched success!!!">
	//  127  287:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
		return true;
	//  128  290:iconst_1        
	//  129  291:ireturn         
		if(((com.baidu.android.pushservice.config.d) (obj)).c() != 1)
			break MISSING_BLOCK_LABEL_428;
	//  130  292:aload           11
	//  131  294:invokevirtual   #305 <Method int com.baidu.android.pushservice.config.d.c()>
	//  132  297:iconst_1        
	//  133  298:icmpne          428
		if(TextUtils.isEmpty(((CharSequence) (obj2))))
			continue; /* Loop/switch isn't completed */
	//  134  301:aload           13
	//  135  303:invokestatic    #216 <Method boolean TextUtils.isEmpty(CharSequence)>
	//  136  306:ifne            480
		flag1 = TextUtils.isEmpty(((CharSequence) (obj1)));
	//  137  309:aload           12
	//  138  311:invokestatic    #216 <Method boolean TextUtils.isEmpty(CharSequence)>
	//  139  314:istore          10
		if(flag1)
			continue; /* Loop/switch isn't completed */
	//  140  316:iload           10
	//  141  318:ifne            480
		int i = Integer.parseInt(((String) (obj2)));
	//  142  321:aload           13
	//  143  323:invokestatic    #334 <Method int Integer.parseInt(String)>
	//  144  326:istore          7
		int k;
		try
		{
			k = Integer.parseInt(((String) (obj1)));
	//  145  328:aload           12
	//  146  330:invokestatic    #334 <Method int Integer.parseInt(String)>
	//  147  333:istore          9
			break MISSING_BLOCK_LABEL_410;
	//  148  335:goto            410
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//  149  338:astore          11
		break MISSING_BLOCK_LABEL_348;
	//  150  340:goto            348
		obj;
	//  151  343:astore          11
		i = 0;
	//  152  345:iconst_0        
	//  153  346:istore          7
		obj1 = ((Object) (TAG));
	//  154  348:getstatic       #95  <Field String TAG>
	//  155  351:astore          12
		obj2 = ((Object) (new StringBuilder()));
	//  156  353:new             #105 <Class StringBuilder>
	//  157  356:dup             
	//  158  357:invokespecial   #107 <Method void StringBuilder()>
	//  159  360:astore          13
		((StringBuilder) (obj2)).append("number format exception  confv ");
	//  160  362:aload           13
	//  161  364:ldc2            #320 <String "number format exception  confv ">
	//  162  367:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  163  370:pop             
		((StringBuilder) (obj2)).append(i);
	//  164  371:aload           13
	//  165  373:iload           7
	//  166  375:invokevirtual   #308 <Method StringBuilder StringBuilder.append(int)>
	//  167  378:pop             
		((StringBuilder) (obj2)).append(" val ");
	//  168  379:aload           13
	//  169  381:ldc2            #325 <String " val ">
	//  170  384:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  171  387:pop             
		((StringBuilder) (obj2)).append(0);
	//  172  388:aload           13
	//  173  390:iconst_0        
	//  174  391:invokevirtual   #308 <Method StringBuilder StringBuilder.append(int)>
	//  175  394:pop             
		com.baidu.android.pushservice.e.a.a(((String) (obj1)), ((StringBuilder) (obj2)).toString(), ((Throwable) (obj)));
	//  176  395:aload           12
	//  177  397:aload           13
	//  178  399:invokevirtual   #128 <Method String StringBuilder.toString()>
	//  179  402:aload           11
	//  180  404:invokestatic    #328 <Method void com.baidu.android.pushservice.e.a.a(String, String, Throwable)>
		k = 0;
	//  181  407:iconst_0        
	//  182  408:istore          9
		if(k != i)
			continue; /* Loop/switch isn't completed */
	//  183  410:iload           9
	//  184  412:iload           7
	//  185  414:icmpne          480
		com.baidu.android.pushservice.e.a.c(TAG, "manufacturerMatched success!!!");
	//  186  417:getstatic       #95  <Field String TAG>
	//  187  420:ldc2            #330 <String "manufacturerMatched success!!!">
	//  188  423:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
		return true;
	//  189  426:iconst_1        
	//  190  427:ireturn         
		if(((com.baidu.android.pushservice.config.d) (obj)).c() != 2)
			continue; /* Loop/switch isn't completed */
	//  191  428:aload           11
	//  192  430:invokevirtual   #305 <Method int com.baidu.android.pushservice.config.d.c()>
	//  193  433:iconst_2        
	//  194  434:icmpne          480
		if(!Pattern.matches(((String) (obj2)), ((CharSequence) (obj1))))
			break MISSING_BLOCK_LABEL_458;
	//  195  437:aload           13
	//  196  439:aload           12
	//  197  441:invokestatic    #340 <Method boolean Pattern.matches(String, CharSequence)>
	//  198  444:ifeq            458
		com.baidu.android.pushservice.e.a.c(TAG, "manufacturerMatched success!!!");
	//  199  447:getstatic       #95  <Field String TAG>
	//  200  450:ldc2            #330 <String "manufacturerMatched success!!!">
	//  201  453:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
		return true;
	//  202  456:iconst_1        
	//  203  457:ireturn         
		try
		{
			com.baidu.android.pushservice.e.a.c(TAG, "manufacturerMatched failure!!!");
	//  204  458:getstatic       #95  <Field String TAG>
	//  205  461:ldc2            #342 <String "manufacturerMatched failure!!!">
	//  206  464:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
		}
	//* 207  467:goto            480
		catch(Exception exception)
	//* 208  470:astore          11
		{
			com.baidu.android.pushservice.e.a.a(TAG, ((Throwable) (exception)));
	//  209  472:getstatic       #95  <Field String TAG>
	//  210  475:aload           11
	//  211  477:invokestatic    #345 <Method void com.baidu.android.pushservice.e.a.a(String, Throwable)>
		}
		j++;
	//  212  480:iload           8
	//  213  482:iconst_1        
	//  214  483:iadd            
	//  215  484:istore          8
		  goto _L3
	//* 216  486:goto            33
_L2:
		if(c1.e() == null || c1.e().size() <= 0)
			break MISSING_BLOCK_LABEL_856;
	//  217  489:aload_1         
	//  218  490:invokevirtual   #347 <Method ArrayList com.baidu.android.pushservice.config.c.e()>
	//  219  493:ifnull          856
	//  220  496:aload_1         
	//  221  497:invokevirtual   #347 <Method ArrayList com.baidu.android.pushservice.config.c.e()>
	//  222  500:invokevirtual   #279 <Method int ArrayList.size()>
	//  223  503:ifle            856
		com.baidu.android.pushservice.e.a.c(TAG, "getSystemProps");
	//  224  506:getstatic       #95  <Field String TAG>
	//  225  509:ldc2            #349 <String "getSystemProps">
	//  226  512:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
		i = 0;
	//  227  515:iconst_0        
	//  228  516:istore          7
_L6:
		if(i >= c1.e().size()) goto _L5; else goto _L4
	//  229  518:iload           7
	//  230  520:aload_1         
	//  231  521:invokevirtual   #347 <Method ArrayList com.baidu.android.pushservice.config.c.e()>
	//  232  524:invokevirtual   #279 <Method int ArrayList.size()>
	//  233  527:icmpge          856
_L4:
		obj2 = ((Object) ((com.baidu.android.pushservice.config.e)c1.e().get(i)));
	//  234  530:aload_1         
	//  235  531:invokevirtual   #347 <Method ArrayList com.baidu.android.pushservice.config.c.e()>
	//  236  534:iload           7
	//  237  536:invokevirtual   #285 <Method Object ArrayList.get(int)>
	//  238  539:checkcast       #351 <Class com.baidu.android.pushservice.config.e>
	//  239  542:astore          13
		exception = ((Exception) (Class.forName("android.os.SystemProperties")));
	//  240  544:ldc2            #353 <String "android.os.SystemProperties">
	//  241  547:invokestatic    #359 <Method Class Class.forName(String)>
	//  242  550:astore          11
		obj1 = ((Object) ((String)((Class) (exception)).getDeclaredMethod("get", new Class[] {
			java/lang/String
		}).invoke(((Object) (exception)), new Object[] {
			((com.baidu.android.pushservice.config.e) (obj2)).a()
		})));
	//  243  552:aload           11
	//  244  554:ldc2            #360 <String "get">
	//  245  557:iconst_1        
	//  246  558:anewarray       Class[]
	//  247  561:dup             
	//  248  562:iconst_0        
	//  249  563:ldc1            #61  <Class String>
	//  250  565:aastore         
	//  251  566:invokevirtual   #364 <Method Method Class.getDeclaredMethod(String, Class[])>
	//  252  569:aload           11
	//  253  571:iconst_1        
	//  254  572:anewarray       Object[]
	//  255  575:dup             
	//  256  576:iconst_0        
	//  257  577:aload           13
	//  258  579:invokevirtual   #367 <Method String com.baidu.android.pushservice.config.e.a()>
	//  259  582:aastore         
	//  260  583:invokevirtual   #373 <Method Object Method.invoke(Object, Object[])>
	//  261  586:checkcast       #61  <Class String>
	//  262  589:astore          12
		exception = ((Exception) (TAG));
	//  263  591:getstatic       #95  <Field String TAG>
	//  264  594:astore          11
		StringBuilder stringbuilder = new StringBuilder();
	//  265  596:new             #105 <Class StringBuilder>
	//  266  599:dup             
	//  267  600:invokespecial   #107 <Method void StringBuilder()>
	//  268  603:astore          14
		stringbuilder.append(" buildVersion ");
	//  269  605:aload           14
	//  270  607:ldc2            #375 <String " buildVersion ">
	//  271  610:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  272  613:pop             
		stringbuilder.append(((String) (obj1)));
	//  273  614:aload           14
	//  274  616:aload           12
	//  275  618:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  276  621:pop             
		com.baidu.android.pushservice.e.a.c(((String) (exception)), stringbuilder.toString());
	//  277  622:aload           11
	//  278  624:aload           14
	//  279  626:invokevirtual   #128 <Method String StringBuilder.toString()>
	//  280  629:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
		exception = ((Exception) (Build.MODEL.toLowerCase()));
	//  281  632:getstatic       #380 <Field String Build.MODEL>
	//  282  635:invokevirtual   #383 <Method String String.toLowerCase()>
	//  283  638:astore          11
		boolean flag;
		Exception exception1;
		if(!TextUtils.isEmpty(((CharSequence) (exception))) && ((String) (exception)).contains("nexus"))
	//* 284  640:aload           11
	//* 285  642:invokestatic    #216 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 286  645:ifne            858
	//* 287  648:aload           11
	//* 288  650:ldc2            #385 <String "nexus">
	//* 289  653:invokevirtual   #388 <Method boolean String.contains(CharSequence)>
	//* 290  656:ifeq            858
			flag = true;
	//  291  659:iconst_1        
	//  292  660:istore          8
		else
	//* 293  662:goto            665
	//* 294  665:aload           12
	//* 295  667:astore          11
	//* 296  669:aload_2         
	//* 297  670:ldc2            #390 <String "HUAWEI">
	//* 298  673:invokevirtual   #394 <Method boolean String.equalsIgnoreCase(String)>
	//* 299  676:ifeq            734
	//* 300  679:aload           12
	//* 301  681:astore          11
	//* 302  683:iload           8
	//* 303  685:ifne            734
	//* 304  688:aload           12
	//* 305  690:astore          11
	//* 306  692:aload           12
	//* 307  694:ldc2            #396 <String "\\d+\\.\\d+$">
	//* 308  697:invokevirtual   #398 <Method boolean String.matches(String)>
	//* 309  700:ifne            734
	//* 310  703:aload           12
	//* 311  705:astore          11
	//* 312  707:getstatic       #403 <Field int android.os.Build$VERSION.SDK_INT>
	//* 313  710:bipush          21
	//* 314  712:icmplt          734
	//* 315  715:aload           12
	//* 316  717:astore          11
	//* 317  719:aload_0         
	//* 318  720:getfield        #117 <Field Context mContext>
	//* 319  723:invokestatic    #241 <Method boolean PushSettings.n(Context)>
	//* 320  726:ifeq            734
	//* 321  729:ldc2            #405 <String "3.1">
	//* 322  732:astore          11
	//* 323  734:aload           13
	//* 324  736:invokevirtual   #407 <Method String com.baidu.android.pushservice.config.e.c()>
	//* 325  739:invokestatic    #411 <Method Pattern Pattern.compile(String)>
	//* 326  742:aload           11
	//* 327  744:invokevirtual   #415 <Method Matcher Pattern.matcher(CharSequence)>
	//* 328  747:astore          11
	//* 329  749:aload           11
	//* 330  751:invokevirtual   #420 <Method boolean Matcher.find()>
	//* 331  754:ifeq            847
	//* 332  757:aload           11
	//* 333  759:invokevirtual   #423 <Method String Matcher.group()>
	//* 334  762:invokestatic    #427 <Method Double Double.valueOf(String)>
	//* 335  765:astore          11
	//* 336  767:aload           13
	//* 337  769:invokevirtual   #428 <Method String com.baidu.android.pushservice.config.e.b()>
	//* 338  772:invokestatic    #427 <Method Double Double.valueOf(String)>
	//* 339  775:astore          12
	//* 340  777:aload           13
	//* 341  779:invokevirtual   #430 <Method int com.baidu.android.pushservice.config.e.d()>
	//* 342  782:ifne            810
	//* 343  785:aload           11
	//* 344  787:invokevirtual   #434 <Method double Double.doubleValue()>
	//* 345  790:aload           12
	//* 346  792:invokevirtual   #434 <Method double Double.doubleValue()>
	//* 347  795:dcmpl           
	//* 348  796:iflt            847
	//* 349  799:getstatic       #95  <Field String TAG>
	//* 350  802:ldc2            #436 <String "versioncode >= configversioncode, manufacturerMatched success!!!">
	//* 351  805:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
	//* 352  808:iconst_1        
	//* 353  809:ireturn         
	//* 354  810:aload           13
	//* 355  812:invokevirtual   #430 <Method int com.baidu.android.pushservice.config.e.d()>
	//* 356  815:iconst_1        
	//* 357  816:icmpne          847
	//* 358  819:aload           11
	//* 359  821:aload           12
	//* 360  823:if_acmpne       847
	//* 361  826:getstatic       #95  <Field String TAG>
	//* 362  829:ldc2            #438 <String "versioncode == configversioncode, manufacturerMatched success!!!">
	//* 363  832:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
	//* 364  835:iconst_1        
	//* 365  836:ireturn         
	//* 366  837:astore          11
	//* 367  839:getstatic       #95  <Field String TAG>
	//* 368  842:aload           11
	//* 369  844:invokestatic    #345 <Method void com.baidu.android.pushservice.e.a.a(String, Throwable)>
	//* 370  847:iload           7
	//* 371  849:iconst_1        
	//* 372  850:iadd            
	//* 373  851:istore          7
	//* 374  853:goto            518
	//* 375  856:iconst_0        
	//* 376  857:ireturn         
			flag = false;
	//  377  858:iconst_0        
	//  378  859:istore          8
		exception = ((Exception) (obj1));
		if(!s.equalsIgnoreCase("HUAWEI"))
			break MISSING_BLOCK_LABEL_734;
		exception = ((Exception) (obj1));
		if(flag)
			break MISSING_BLOCK_LABEL_734;
		exception = ((Exception) (obj1));
		if(((String) (obj1)).matches("\\d+\\.\\d+$"))
			break MISSING_BLOCK_LABEL_734;
		exception = ((Exception) (obj1));
		if(android.os.Build.VERSION.SDK_INT < 21)
			break MISSING_BLOCK_LABEL_734;
		exception = ((Exception) (obj1));
		if(PushSettings.n(mContext))
			exception = "3.1";
		exception = ((Exception) (Pattern.compile(((com.baidu.android.pushservice.config.e) (obj2)).c()).matcher(((CharSequence) (exception)))));
		if(!((Matcher) (exception)).find())
			continue; /* Loop/switch isn't completed */
		exception = ((Exception) (Double.valueOf(((Matcher) (exception)).group())));
		obj1 = ((Object) (Double.valueOf(((com.baidu.android.pushservice.config.e) (obj2)).b())));
		if(((com.baidu.android.pushservice.config.e) (obj2)).d() != 0)
			break MISSING_BLOCK_LABEL_810;
		if(((Double) (exception)).doubleValue() < ((Double) (obj1)).doubleValue())
			continue; /* Loop/switch isn't completed */
		com.baidu.android.pushservice.e.a.c(TAG, "versioncode >= configversioncode, manufacturerMatched success!!!");
		return true;
		if(((com.baidu.android.pushservice.config.e) (obj2)).d() != 1 || exception != obj1)
			continue; /* Loop/switch isn't completed */
		com.baidu.android.pushservice.e.a.c(TAG, "versioncode == configversioncode, manufacturerMatched success!!!");
		return true;
		exception1;
		com.baidu.android.pushservice.e.a.a(TAG, ((Throwable) (exception1)));
		i++;
		  goto _L6
_L5:
		return false;
	//* 379  861:goto            665
	}

	private boolean needReload()
	{
		long l = m.c(mContext, "com.baidu.android.pushservice.config.MODE_CONFIG_LAST_CACHE");
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field Context mContext>
	//    2    4:ldc2            #441 <String "com.baidu.android.pushservice.config.MODE_CONFIG_LAST_CACHE">
	//    3    7:invokestatic    #444 <Method long m.c(Context, String)>
	//    4   10:lstore_3        
		if(System.currentTimeMillis() - l > 0x240c8400L)
	//*   5   11:invokestatic    #450 <Method long System.currentTimeMillis()>
	//*   6   14:lload_3         
	//*   7   15:lsub            
	//*   8   16:ldc2w           #451 <Long 0x240c8400L>
	//*   9   19:lcmp            
	//*  10   20:ifle            25
			return true;
	//   11   23:iconst_1        
	//   12   24:ireturn         
		l = m.c(mContext, "com.baidu.android.pushservice.config.MODE_CONFIG_LAST_MODIFIED");
	//   13   25:aload_0         
	//   14   26:getfield        #117 <Field Context mContext>
	//   15   29:ldc2            #454 <String "com.baidu.android.pushservice.config.MODE_CONFIG_LAST_MODIFIED">
	//   16   32:invokestatic    #444 <Method long m.c(Context, String)>
	//   17   35:lstore_3        
		File file1 = new File(localConfigPath);
	//   18   36:new             #456 <Class File>
	//   19   39:dup             
	//   20   40:aload_0         
	//   21   41:getfield        #131 <Field String localConfigPath>
	//   22   44:invokespecial   #457 <Method void File(String)>
	//   23   47:astore          10
		File file = file1;
	//   24   49:aload           10
	//   25   51:astore          9
		if(!file1.exists())
	//*  26   53:aload           10
	//*  27   55:invokevirtual   #460 <Method boolean File.exists()>
	//*  28   58:ifne            74
			file = new File(defaultConfigPath);
	//   29   61:new             #456 <Class File>
	//   30   64:dup             
	//   31   65:aload_0         
	//   32   66:getfield        #136 <Field String defaultConfigPath>
	//   33   69:invokespecial   #457 <Method void File(String)>
	//   34   72:astore          9
		if(l > 0L)
	//*  35   74:lload_3         
	//*  36   75:lconst_0        
	//*  37   76:lcmp            
	//*  38   77:ifle            180
		{
			if(l != file.lastModified())
	//*  39   80:lload_3         
	//*  40   81:aload           9
	//*  41   83:invokevirtual   #463 <Method long File.lastModified()>
	//*  42   86:lcmp            
	//*  43   87:ifeq            92
				return true;
	//   44   90:iconst_1        
	//   45   91:ireturn         
			long l2 = m.c(mContext, "com.baidu.android.pushservice.config.BUILD_LAST_MODIFIED");
	//   46   92:aload_0         
	//   47   93:getfield        #117 <Field Context mContext>
	//   48   96:ldc2            #465 <String "com.baidu.android.pushservice.config.BUILD_LAST_MODIFIED">
	//   49   99:invokestatic    #444 <Method long m.c(Context, String)>
	//   50  102:lstore          7
			String as[] = BUILD_PROP_FILES;
	//   51  104:getstatic       #71  <Field String[] BUILD_PROP_FILES>
	//   52  107:astore          9
			int j = as.length;
	//   53  109:aload           9
	//   54  111:arraylength     
	//   55  112:istore_2        
			l = 0L;
	//   56  113:lconst_0        
	//   57  114:lstore_3        
			for(int i = 0; i < j;)
	//*  58  115:iconst_0        
	//*  59  116:istore_1        
	//*  60  117:iload_1         
	//*  61  118:iload_2         
	//*  62  119:icmpge          169
			{
				File file2 = new File(as[i]);
	//   63  122:new             #456 <Class File>
	//   64  125:dup             
	//   65  126:aload           9
	//   66  128:iload_1         
	//   67  129:aaload          
	//   68  130:invokespecial   #457 <Method void File(String)>
	//   69  133:astore          10
				long l1 = l;
	//   70  135:lload_3         
	//   71  136:lstore          5
				if(file2.exists())
	//*  72  138:aload           10
	//*  73  140:invokevirtual   #460 <Method boolean File.exists()>
	//*  74  143:ifeq            159
					l1 = file2.lastModified() / 10L + l;
	//   75  146:aload           10
	//   76  148:invokevirtual   #463 <Method long File.lastModified()>
	//   77  151:ldc2w           #466 <Long 10L>
	//   78  154:ldiv            
	//   79  155:lload_3         
	//   80  156:ladd            
	//   81  157:lstore          5
				i++;
	//   82  159:iload_1         
	//   83  160:iconst_1        
	//   84  161:iadd            
	//   85  162:istore_1        
				l = l1;
	//   86  163:lload           5
	//   87  165:lstore_3        
			}

	//*  88  166:goto            117
			return l2 != l;
	//   89  169:lload           7
	//   90  171:lload_3         
	//   91  172:lcmp            
	//   92  173:ifeq            178
	//   93  176:iconst_1        
	//   94  177:ireturn         
	//   95  178:iconst_0        
	//   96  179:ireturn         
		} else
		{
			return true;
	//   97  180:iconst_1        
	//   98  181:ireturn         
		}
	}

	private boolean parseConfig()
	{
		com.baidu.android.pushservice.e.a.c(TAG, "parseConfig begin.....");
	//    0    0:getstatic       #95  <Field String TAG>
	//    1    3:ldc2            #472 <String "parseConfig begin.....">
	//    2    6:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
		int i;
		Object obj;
		com.baidu.android.pushservice.config.c c1;
		String s;
		StringBuilder stringbuilder;
		try
		{
			obj = ((Object) (new JSONObject(mConfigContent)));
	//    3    9:new             #474 <Class JSONObject>
	//    4   12:dup             
	//    5   13:aload_0         
	//    6   14:getfield        #477 <Field String mConfigContent>
	//    7   17:invokespecial   #478 <Method void JSONObject(String)>
	//    8   20:astore_2        
			mConfigVersion = ((JSONObject) (obj)).getInt("version");
	//    9   21:aload_0         
	//   10   22:aload_2         
	//   11   23:ldc1            #41  <String "version">
	//   12   25:invokevirtual   #481 <Method int JSONObject.getInt(String)>
	//   13   28:putfield        #143 <Field int mConfigVersion>
			mManufacturers = new HashMap();
	//   14   31:aload_0         
	//   15   32:new             #483 <Class HashMap>
	//   16   35:dup             
	//   17   36:invokespecial   #484 <Method void HashMap()>
	//   18   39:putfield        #486 <Field HashMap mManufacturers>
			obj = ((Object) (((JSONObject) (obj)).getJSONArray("modeconfig")));
	//   19   42:aload_2         
	//   20   43:ldc1            #20  <String "modeconfig">
	//   21   45:invokevirtual   #490 <Method JSONArray JSONObject.getJSONArray(String)>
	//   22   48:astore_2        
		}
	//*  23   49:iconst_0        
	//*  24   50:istore_1        
	//*  25   51:iload_1         
	//*  26   52:aload_2         
	//*  27   53:invokevirtual   #493 <Method int JSONArray.length()>
	//*  28   56:icmpge          151
	//*  29   59:new             #222 <Class com.baidu.android.pushservice.config.c>
	//*  30   62:dup             
	//*  31   63:aload_2         
	//*  32   64:iload_1         
	//*  33   65:invokevirtual   #496 <Method String JSONArray.getString(int)>
	//*  34   68:invokespecial   #225 <Method void com.baidu.android.pushservice.config.c(String)>
	//*  35   71:astore_3        
	//*  36   72:aload_0         
	//*  37   73:getfield        #486 <Field HashMap mManufacturers>
	//*  38   76:aload_3         
	//*  39   77:invokevirtual   #497 <Method String com.baidu.android.pushservice.config.c.b()>
	//*  40   80:aload_3         
	//*  41   81:invokevirtual   #501 <Method Object HashMap.put(Object, Object)>
	//*  42   84:pop             
	//*  43   85:getstatic       #95  <Field String TAG>
	//*  44   88:astore          4
	//*  45   90:new             #105 <Class StringBuilder>
	//*  46   93:dup             
	//*  47   94:invokespecial   #107 <Method void StringBuilder()>
	//*  48   97:astore          5
	//*  49   99:aload           5
	//*  50  101:ldc2            #503 <String "mManufacturers put key">
	//*  51  104:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//*  52  107:pop             
	//*  53  108:aload           5
	//*  54  110:iload_1         
	//*  55  111:invokevirtual   #308 <Method StringBuilder StringBuilder.append(int)>
	//*  56  114:pop             
	//*  57  115:aload           5
	//*  58  117:ldc2            #505 <String " = ">
	//*  59  120:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//*  60  123:pop             
	//*  61  124:aload           5
	//*  62  126:aload_3         
	//*  63  127:invokevirtual   #497 <Method String com.baidu.android.pushservice.config.c.b()>
	//*  64  130:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//*  65  133:pop             
	//*  66  134:aload           4
	//*  67  136:aload           5
	//*  68  138:invokevirtual   #128 <Method String StringBuilder.toString()>
	//*  69  141:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
	//*  70  144:iload_1         
	//*  71  145:iconst_1        
	//*  72  146:iadd            
	//*  73  147:istore_1        
	//*  74  148:goto            51
	//*  75  151:aload_0         
	//*  76  152:aload_0         
	//*  77  153:getstatic       #508 <Field String Build.MANUFACTURER>
	//*  78  156:invokevirtual   #510 <Method String String.toUpperCase()>
	//*  79  159:invokespecial   #514 <Method com.baidu.android.pushservice.config.c selectCurrentManufacturer(String)>
	//*  80  162:putfield        #227 <Field com.baidu.android.pushservice.config.c mFacturer>
	//*  81  165:aload_0         
	//*  82  166:aload_0         
	//*  83  167:getfield        #227 <Field com.baidu.android.pushservice.config.c mFacturer>
	//*  84  170:invokespecial   #518 <Method void setCache(com.baidu.android.pushservice.config.c)>
	//*  85  173:iconst_1        
	//*  86  174:ireturn         
		catch(JSONException jsonexception)
	//*  87  175:astore_2        
		{
			com.baidu.android.pushservice.e.a.a(TAG, ((Throwable) (jsonexception)));
	//   88  176:getstatic       #95  <Field String TAG>
	//   89  179:aload_2         
	//   90  180:invokestatic    #345 <Method void com.baidu.android.pushservice.e.a.a(String, Throwable)>
			return false;
	//   91  183:iconst_0        
	//   92  184:ireturn         
		}
		i = 0;
		if(i >= ((JSONArray) (obj)).length())
			break; /* Loop/switch isn't completed */
		c1 = new com.baidu.android.pushservice.config.c(((JSONArray) (obj)).getString(i));
		mManufacturers.put(((Object) (c1.b())), ((Object) (c1)));
		s = TAG;
		stringbuilder = new StringBuilder();
		stringbuilder.append("mManufacturers put key");
		stringbuilder.append(i);
		stringbuilder.append(" = ");
		stringbuilder.append(c1.b());
		com.baidu.android.pushservice.e.a.c(s, stringbuilder.toString());
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_51;
_L1:
		mFacturer = selectCurrentManufacturer(Build.MANUFACTURER.toUpperCase());
		setCache(mFacturer);
		return true;
	}

	private String requestConfig(HashMap hashmap)
	{
		String s;
		if(h.f())
	//*   0    0:invokestatic    #523 <Method boolean h.f()>
	//*   1    3:ifeq            14
			s = h.a();
	//    2    6:invokestatic    #524 <Method String h.a()>
	//    3    9:astore          4
		else
	//*   4   11:goto            19
			s = h.b();
	//    5   14:invokestatic    #525 <Method String h.b()>
	//    6   17:astore          4
		StringBuilder stringbuilder;
		if(u.a() && PushSettings.m(mContext) || u.b() && PushSettings.n(mContext))
	//*   7   19:invokestatic    #529 <Method boolean u.a()>
	//*   8   22:ifeq            35
	//*   9   25:aload_0         
	//*  10   26:getfield        #117 <Field Context mContext>
	//*  11   29:invokestatic    #259 <Method boolean PushSettings.m(Context)>
	//*  12   32:ifne            51
	//*  13   35:invokestatic    #531 <Method boolean u.b()>
	//*  14   38:ifeq            93
	//*  15   41:aload_0         
	//*  16   42:getfield        #117 <Field Context mContext>
	//*  17   45:invokestatic    #241 <Method boolean PushSettings.n(Context)>
	//*  18   48:ifeq            93
		{
			stringbuilder = new StringBuilder();
	//   19   51:new             #105 <Class StringBuilder>
	//   20   54:dup             
	//   21   55:invokespecial   #107 <Method void StringBuilder()>
	//   22   58:astore          5
			stringbuilder.append(s);
	//   23   60:aload           5
	//   24   62:aload           4
	//   25   64:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   26   67:pop             
			s = "/rest/3.0/clientfile/updateconf";
	//   27   68:ldc2            #533 <String "/rest/3.0/clientfile/updateconf">
	//   28   71:astore          4
		} else
	//*  29   73:aload           5
	//*  30   75:aload           4
	//*  31   77:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//*  32   80:pop             
	//*  33   81:aload_0         
	//*  34   82:aload           5
	//*  35   84:invokevirtual   #128 <Method String StringBuilder.toString()>
	//*  36   87:putfield        #80  <Field String updateConfigUrl>
	//*  37   90:goto            118
		{
			stringbuilder = new StringBuilder();
	//   38   93:new             #105 <Class StringBuilder>
	//   39   96:dup             
	//   40   97:invokespecial   #107 <Method void StringBuilder()>
	//   41  100:astore          5
			stringbuilder.append(s);
	//   42  102:aload           5
	//   43  104:aload           4
	//   44  106:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   45  109:pop             
			s = "/rest/3.0/clientfile/updatesdkconfig";
	//   46  110:ldc2            #535 <String "/rest/3.0/clientfile/updatesdkconfig">
	//   47  113:astore          4
		}
		stringbuilder.append(s);
		updateConfigUrl = stringbuilder.toString();
	//*  48  115:goto            73
		com.baidu.android.pushservice.e.a.c(TAG, updateConfigUrl);
	//   49  118:getstatic       #95  <Field String TAG>
	//   50  121:aload_0         
	//   51  122:getfield        #80  <Field String updateConfigUrl>
	//   52  125:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
		int i = 2;
	//   53  128:iconst_2        
	//   54  129:istore_2        
		int k;
		do
		{
			Object obj = ((Object) (b.a(updateConfigUrl, "POST", hashmap, "BCCS_SDK/3.0")));
	//   55  130:aload_0         
	//   56  131:getfield        #80  <Field String updateConfigUrl>
	//   57  134:ldc2            #537 <String "POST">
	//   58  137:aload_1         
	//   59  138:ldc2            #539 <String "BCCS_SDK/3.0">
	//   60  141:invokestatic    #544 <Method com.baidu.android.pushservice.d.a b.a(String, String, HashMap, String)>
	//   61  144:astore          4
			if(obj != null)
	//*  62  146:aload           4
	//*  63  148:ifnull          234
			{
				int j = ((com.baidu.android.pushservice.d.a) (obj)).b();
	//   64  151:aload           4
	//   65  153:invokevirtual   #548 <Method int com.baidu.android.pushservice.d.a.b()>
	//   66  156:istore_3        
				obj = ((Object) (com.baidu.android.pushservice.f.a.b.a(((com.baidu.android.pushservice.d.a) (obj)).a())));
	//   67  157:aload           4
	//   68  159:invokevirtual   #551 <Method java.io.InputStream com.baidu.android.pushservice.d.a.a()>
	//   69  162:invokestatic    #556 <Method String com.baidu.android.pushservice.f.a.b.a(java.io.InputStream)>
	//   70  165:astore          4
				String s1 = TAG;
	//   71  167:getstatic       #95  <Field String TAG>
	//   72  170:astore          5
				StringBuilder stringbuilder1 = new StringBuilder();
	//   73  172:new             #105 <Class StringBuilder>
	//   74  175:dup             
	//   75  176:invokespecial   #107 <Method void StringBuilder()>
	//   76  179:astore          6
				stringbuilder1.append("update config request response, code=");
	//   77  181:aload           6
	//   78  183:ldc2            #558 <String "update config request response, code=">
	//   79  186:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   80  189:pop             
				stringbuilder1.append(j);
	//   81  190:aload           6
	//   82  192:iload_3         
	//   83  193:invokevirtual   #308 <Method StringBuilder StringBuilder.append(int)>
	//   84  196:pop             
				stringbuilder1.append(", result=");
	//   85  197:aload           6
	//   86  199:ldc2            #560 <String ", result=">
	//   87  202:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   88  205:pop             
				stringbuilder1.append(((String) (obj)));
	//   89  206:aload           6
	//   90  208:aload           4
	//   91  210:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   92  213:pop             
				com.baidu.android.pushservice.e.a.c(s1, stringbuilder1.toString());
	//   93  214:aload           5
	//   94  216:aload           6
	//   95  218:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   96  221:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
				if(j == 200)
	//*  97  224:iload_3         
	//*  98  225:sipush          200
	//*  99  228:icmpne          234
					return ((String) (obj));
	//  100  231:aload           4
	//  101  233:areturn         
			}
			k = i - 1;
	//  102  234:iload_2         
	//  103  235:iconst_1        
	//  104  236:isub            
	//  105  237:istore_3        
			i = k;
	//  106  238:iload_3         
	//  107  239:istore_2        
		} while(k > 0);
	//  108  240:iload_3         
	//  109  241:ifgt            130
		return null;
	//  110  244:aconst_null     
	//  111  245:areturn         
	}

	private com.baidu.android.pushservice.config.c selectCurrentManufacturer(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #216 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            18
		{
			com.baidu.android.pushservice.e.a.c(TAG, "facturerName is null!");
	//    3    7:getstatic       #95  <Field String TAG>
	//    4   10:ldc2            #564 <String "facturerName is null!">
	//    5   13:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
			return null;
	//    6   16:aconst_null     
	//    7   17:areturn         
		}
		s = s.toUpperCase();
	//    8   18:aload_1         
	//    9   19:invokevirtual   #510 <Method String String.toUpperCase()>
	//   10   22:astore_1        
		if(!Build.MANUFACTURER.toUpperCase().equalsIgnoreCase("unknown") || mManufacturers == null) goto _L2; else goto _L1
	//   11   23:getstatic       #508 <Field String Build.MANUFACTURER>
	//   12   26:invokevirtual   #510 <Method String String.toUpperCase()>
	//   13   29:ldc2            #566 <String "unknown">
	//   14   32:invokevirtual   #394 <Method boolean String.equalsIgnoreCase(String)>
	//   15   35:ifeq            127
	//   16   38:aload_0         
	//   17   39:getfield        #486 <Field HashMap mManufacturers>
	//   18   42:ifnull          127
_L1:
		com.baidu.android.pushservice.e.a.c(TAG, "manufacturer is unknown!");
	//   19   45:getstatic       #95  <Field String TAG>
	//   20   48:ldc2            #568 <String "manufacturer is unknown!">
	//   21   51:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
		s = ((String) (mManufacturers.entrySet().iterator()));
	//   22   54:aload_0         
	//   23   55:getfield        #486 <Field HashMap mManufacturers>
	//   24   58:invokevirtual   #572 <Method Set HashMap.entrySet()>
	//   25   61:invokeinterface #578 <Method Iterator Set.iterator()>
	//   26   66:astore_1        
_L6:
		if(!((Iterator) (s)).hasNext()) goto _L4; else goto _L3
	//   27   67:aload_1         
	//   28   68:invokeinterface #583 <Method boolean Iterator.hasNext()>
	//   29   73:ifeq            210
_L3:
		String s1 = (String)((java.util.Map.Entry)((Iterator) (s)).next()).getKey();
	//   30   76:aload_1         
	//   31   77:invokeinterface #587 <Method Object Iterator.next()>
	//   32   82:checkcast       #589 <Class java.util.Map$Entry>
	//   33   85:invokeinterface #592 <Method Object java.util.Map$Entry.getKey()>
	//   34   90:checkcast       #61  <Class String>
	//   35   93:astore_2        
		if(!manufacturerMatched((com.baidu.android.pushservice.config.c)mManufacturers.get(((Object) (s1))), s1)) goto _L6; else goto _L5
	//   36   94:aload_0         
	//   37   95:aload_0         
	//   38   96:getfield        #486 <Field HashMap mManufacturers>
	//   39   99:aload_2         
	//   40  100:invokevirtual   #595 <Method Object HashMap.get(Object)>
	//   41  103:checkcast       #222 <Class com.baidu.android.pushservice.config.c>
	//   42  106:aload_2         
	//   43  107:invokespecial   #597 <Method boolean manufacturerMatched(com.baidu.android.pushservice.config.c, String)>
	//   44  110:ifeq            67
_L5:
		s = ((String) (mManufacturers.get(((Object) (s1)))));
	//   45  113:aload_0         
	//   46  114:getfield        #486 <Field HashMap mManufacturers>
	//   47  117:aload_2         
	//   48  118:invokevirtual   #595 <Method Object HashMap.get(Object)>
	//   49  121:astore_1        
_L7:
		return (com.baidu.android.pushservice.config.c)s;
	//   50  122:aload_1         
	//   51  123:checkcast       #222 <Class com.baidu.android.pushservice.config.c>
	//   52  126:areturn         
_L2:
		if(mManufacturers == null || !mManufacturers.containsKey(((Object) (s))))
			break; /* Loop/switch isn't completed */
	//   53  127:aload_0         
	//   54  128:getfield        #486 <Field HashMap mManufacturers>
	//   55  131:ifnull          210
	//   56  134:aload_0         
	//   57  135:getfield        #486 <Field HashMap mManufacturers>
	//   58  138:aload_1         
	//   59  139:invokevirtual   #600 <Method boolean HashMap.containsKey(Object)>
	//   60  142:ifeq            210
		String s2 = TAG;
	//   61  145:getstatic       #95  <Field String TAG>
	//   62  148:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   63  149:new             #105 <Class StringBuilder>
	//   64  152:dup             
	//   65  153:invokespecial   #107 <Method void StringBuilder()>
	//   66  156:astore_3        
		stringbuilder.append("mManufacturers containsKey ");
	//   67  157:aload_3         
	//   68  158:ldc2            #602 <String "mManufacturers containsKey ">
	//   69  161:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   70  164:pop             
		stringbuilder.append(s);
	//   71  165:aload_3         
	//   72  166:aload_1         
	//   73  167:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   74  170:pop             
		com.baidu.android.pushservice.e.a.c(s2, stringbuilder.toString());
	//   75  171:aload_2         
	//   76  172:aload_3         
	//   77  173:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   78  176:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
		if(!manufacturerMatched((com.baidu.android.pushservice.config.c)mManufacturers.get(((Object) (s))), s))
			break; /* Loop/switch isn't completed */
	//   79  179:aload_0         
	//   80  180:aload_0         
	//   81  181:getfield        #486 <Field HashMap mManufacturers>
	//   82  184:aload_1         
	//   83  185:invokevirtual   #595 <Method Object HashMap.get(Object)>
	//   84  188:checkcast       #222 <Class com.baidu.android.pushservice.config.c>
	//   85  191:aload_1         
	//   86  192:invokespecial   #597 <Method boolean manufacturerMatched(com.baidu.android.pushservice.config.c, String)>
	//   87  195:ifeq            210
		s = ((String) (mManufacturers.get(((Object) (s)))));
	//   88  198:aload_0         
	//   89  199:getfield        #486 <Field HashMap mManufacturers>
	//   90  202:aload_1         
	//   91  203:invokevirtual   #595 <Method Object HashMap.get(Object)>
	//   92  206:astore_1        
		if(true) goto _L7; else goto _L4
	//   93  207:goto            122
_L4:
		return null;
	//   94  210:aconst_null     
	//   95  211:areturn         
	}

	private void setCache(com.baidu.android.pushservice.config.c c1)
	{
		String s = "CONFIG_MANUFACTURER_DEFAULT";
	//    0    0:ldc1            #14  <String "CONFIG_MANUFACTURER_DEFAULT">
	//    1    2:astore_2        
		if(c1 != null)
	//*   2    3:aload_1         
	//*   3    4:ifnull          12
			s = c1.toString();
	//    4    7:aload_1         
	//    5    8:invokevirtual   #603 <Method String c.toString()>
	//    6   11:astore_2        
		m.a(mContext, "com.baidu.android.pushservice.config.MODE_MANUFACTURER_CACHE", s);
	//    7   12:aload_0         
	//    8   13:getfield        #117 <Field Context mContext>
	//    9   16:ldc1            #207 <String "com.baidu.android.pushservice.config.MODE_MANUFACTURER_CACHE">
	//   10   18:aload_2         
	//   11   19:invokestatic    #606 <Method boolean m.a(Context, String, String)>
	//   12   22:pop             
		m.a(mContext, "com.baidu.android.pushservice.config.MODE_CONFIG_VERSION", mConfigVersion);
	//   13   23:aload_0         
	//   14   24:getfield        #117 <Field Context mContext>
	//   15   27:ldc1            #199 <String "com.baidu.android.pushservice.config.MODE_CONFIG_VERSION">
	//   16   29:aload_0         
	//   17   30:getfield        #143 <Field int mConfigVersion>
	//   18   33:invokestatic    #609 <Method void m.a(Context, String, int)>
		setReloadCache();
	//   19   36:aload_0         
	//   20   37:invokespecial   #612 <Method void setReloadCache()>
	//   21   40:return          
	}

	private void setReloadCache()
	{
		File file1 = new File(localConfigPath);
	//    0    0:new             #456 <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #131 <Field String localConfigPath>
	//    4    8:invokespecial   #457 <Method void File(String)>
	//    5   11:astore          8
		File file = file1;
	//    6   13:aload           8
	//    7   15:astore          7
		if(!file1.exists())
	//*   8   17:aload           8
	//*   9   19:invokevirtual   #460 <Method boolean File.exists()>
	//*  10   22:ifne            38
			file = new File(defaultConfigPath);
	//   11   25:new             #456 <Class File>
	//   12   28:dup             
	//   13   29:aload_0         
	//   14   30:getfield        #136 <Field String defaultConfigPath>
	//   15   33:invokespecial   #457 <Method void File(String)>
	//   16   36:astore          7
		long l = file.lastModified();
	//   17   38:aload           7
	//   18   40:invokevirtual   #463 <Method long File.lastModified()>
	//   19   43:lstore_3        
		m.a(mContext, "com.baidu.android.pushservice.config.MODE_CONFIG_LAST_MODIFIED", l);
	//   20   44:aload_0         
	//   21   45:getfield        #117 <Field Context mContext>
	//   22   48:ldc2            #454 <String "com.baidu.android.pushservice.config.MODE_CONFIG_LAST_MODIFIED">
	//   23   51:lload_3         
	//   24   52:invokestatic    #615 <Method void m.a(Context, String, long)>
		l = 0L;
	//   25   55:lconst_0        
	//   26   56:lstore_3        
		String as[] = BUILD_PROP_FILES;
	//   27   57:getstatic       #71  <Field String[] BUILD_PROP_FILES>
	//   28   60:astore          7
		int j = as.length;
	//   29   62:aload           7
	//   30   64:arraylength     
	//   31   65:istore_2        
		for(int i = 0; i < j;)
	//*  32   66:iconst_0        
	//*  33   67:istore_1        
	//*  34   68:iload_1         
	//*  35   69:iload_2         
	//*  36   70:icmpge          120
		{
			File file2 = new File(as[i]);
	//   37   73:new             #456 <Class File>
	//   38   76:dup             
	//   39   77:aload           7
	//   40   79:iload_1         
	//   41   80:aaload          
	//   42   81:invokespecial   #457 <Method void File(String)>
	//   43   84:astore          8
			long l1 = l;
	//   44   86:lload_3         
	//   45   87:lstore          5
			if(file2.exists())
	//*  46   89:aload           8
	//*  47   91:invokevirtual   #460 <Method boolean File.exists()>
	//*  48   94:ifeq            110
				l1 = file2.lastModified() / 10L + l;
	//   49   97:aload           8
	//   50   99:invokevirtual   #463 <Method long File.lastModified()>
	//   51  102:ldc2w           #466 <Long 10L>
	//   52  105:ldiv            
	//   53  106:lload_3         
	//   54  107:ladd            
	//   55  108:lstore          5
			i++;
	//   56  110:iload_1         
	//   57  111:iconst_1        
	//   58  112:iadd            
	//   59  113:istore_1        
			l = l1;
	//   60  114:lload           5
	//   61  116:lstore_3        
		}

	//*  62  117:goto            68
		m.a(mContext, "com.baidu.android.pushservice.config.BUILD_LAST_MODIFIED", l);
	//   63  120:aload_0         
	//   64  121:getfield        #117 <Field Context mContext>
	//   65  124:ldc2            #465 <String "com.baidu.android.pushservice.config.BUILD_LAST_MODIFIED">
	//   66  127:lload_3         
	//   67  128:invokestatic    #615 <Method void m.a(Context, String, long)>
		m.a(mContext, "com.baidu.android.pushservice.config.MODE_CONFIG_LAST_CACHE", System.currentTimeMillis());
	//   68  131:aload_0         
	//   69  132:getfield        #117 <Field Context mContext>
	//   70  135:ldc2            #441 <String "com.baidu.android.pushservice.config.MODE_CONFIG_LAST_CACHE">
	//   71  138:invokestatic    #450 <Method long System.currentTimeMillis()>
	//   72  141:invokestatic    #615 <Method void m.a(Context, String, long)>
	//   73  144:return          
	}

	public int getConfigVersion()
	{
		return mConfigVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field int mConfigVersion>
	//    2    4:ireturn         
	}

	public int getCurrentMode()
	{
		return mCurrentMode;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field int mCurrentMode>
	//    2    4:ireturn         
	}

	public int getHighestVersion()
	{
		return mHighestVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field int mHighestVersion>
	//    2    4:ireturn         
	}

	public String getHostPackageName()
	{
		return mHostPackage;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field String mHostPackage>
	//    2    4:areturn         
	}

	public boolean refreshMode()
	{
label0:
		{
label1:
			{
				if(mFacturer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #227 <Field com.baidu.android.pushservice.config.c mFacturer>
	//*   2    4:ifnonnull       9
					return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
				if(mFacturer.c() == MODE_I_HW)
	//*   5    9:aload_0         
	//*   6   10:getfield        #227 <Field com.baidu.android.pushservice.config.c mFacturer>
	//*   7   13:invokevirtual   #624 <Method int com.baidu.android.pushservice.config.c.c()>
	//*   8   16:getstatic       #236 <Field int MODE_I_HW>
	//*   9   19:icmpne          31
				{
					mCurrentMode = MODE_I_HW;
	//   10   22:aload_0         
	//   11   23:getstatic       #236 <Field int MODE_I_HW>
	//   12   26:putfield        #84  <Field int mCurrentMode>
					return true;
	//   13   29:iconst_1        
	//   14   30:ireturn         
				}
				if(mFacturer.c() == MODE_I_XM)
	//*  15   31:aload_0         
	//*  16   32:getfield        #227 <Field com.baidu.android.pushservice.config.c mFacturer>
	//*  17   35:invokevirtual   #624 <Method int com.baidu.android.pushservice.config.c.c()>
	//*  18   38:getstatic       #256 <Field int MODE_I_XM>
	//*  19   41:icmpne          53
				{
					mCurrentMode = MODE_I_XM;
	//   20   44:aload_0         
	//   21   45:getstatic       #256 <Field int MODE_I_XM>
	//   22   48:putfield        #84  <Field int mCurrentMode>
					return true;
	//   23   51:iconst_1        
	//   24   52:ireturn         
				}
				if(mFacturer.c() != MODE_C || TextUtils.isEmpty(((CharSequence) (mFacturer.f()))))
					break label0;
	//   25   53:aload_0         
	//   26   54:getfield        #227 <Field com.baidu.android.pushservice.config.c mFacturer>
	//   27   57:invokevirtual   #624 <Method int com.baidu.android.pushservice.config.c.c()>
	//   28   60:getstatic       #626 <Field int MODE_C>
	//   29   63:icmpne          600
	//   30   66:aload_0         
	//   31   67:getfield        #227 <Field com.baidu.android.pushservice.config.c mFacturer>
	//   32   70:invokevirtual   #628 <Method String c.f()>
	//   33   73:invokestatic    #216 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   34   76:ifne            600
				int i;
				boolean flag1;
				Object obj;
				String s;
				Object obj1;
				try
				{
					obj = ((Object) (mContext.getPackageManager().getPackageInfo(mFacturer.f(), 16448)));
	//   35   79:aload_0         
	//   36   80:getfield        #117 <Field Context mContext>
	//   37   83:invokevirtual   #632 <Method PackageManager Context.getPackageManager()>
	//   38   86:aload_0         
	//   39   87:getfield        #227 <Field com.baidu.android.pushservice.config.c mFacturer>
	//   40   90:invokevirtual   #628 <Method String c.f()>
	//   41   93:sipush          16448
	//   42   96:invokevirtual   #638 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   43   99:astore          4
				}
	//*  44  101:aload           4
	//*  45  103:ifnull          600
	//*  46  106:aload           4
	//*  47  108:getfield        #643 <Field int PackageInfo.versionCode>
	//*  48  111:istore_2        
	//*  49  112:getstatic       #95  <Field String TAG>
	//*  50  115:astore          5
	//*  51  117:new             #105 <Class StringBuilder>
	//*  52  120:dup             
	//*  53  121:invokespecial   #107 <Method void StringBuilder()>
	//*  54  124:astore          6
	//*  55  126:aload           6
	//*  56  128:ldc2            #645 <String "version code = ">
	//*  57  131:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//*  58  134:pop             
	//*  59  135:aload           6
	//*  60  137:iload_2         
	//*  61  138:invokevirtual   #308 <Method StringBuilder StringBuilder.append(int)>
	//*  62  141:pop             
	//*  63  142:aload           5
	//*  64  144:aload           6
	//*  65  146:invokevirtual   #128 <Method String StringBuilder.toString()>
	//*  66  149:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
	//*  67  152:aload_0         
	//*  68  153:getfield        #227 <Field com.baidu.android.pushservice.config.c mFacturer>
	//*  69  156:invokevirtual   #648 <Method c$a com.baidu.android.pushservice.config.c.a()>
	//*  70  159:ifnull          262
	//*  71  162:aload_0         
	//*  72  163:getfield        #227 <Field com.baidu.android.pushservice.config.c mFacturer>
	//*  73  166:invokevirtual   #648 <Method c$a com.baidu.android.pushservice.config.c.a()>
	//*  74  169:getfield        #652 <Field int com.baidu.android.pushservice.config.c$a.b>
	//*  75  172:iconst_m1       
	//*  76  173:icmpne          204
	//*  77  176:getstatic       #95  <Field String TAG>
	//*  78  179:ldc2            #654 <String "to = -1">
	//*  79  182:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
	//*  80  185:iload_2         
	//*  81  186:aload_0         
	//*  82  187:getfield        #227 <Field com.baidu.android.pushservice.config.c mFacturer>
	//*  83  190:invokevirtual   #648 <Method c$a com.baidu.android.pushservice.config.c.a()>
	//*  84  193:getfield        #656 <Field int com.baidu.android.pushservice.config.c$a.a>
	//*  85  196:icmplt          262
	//*  86  199:iconst_1        
	//*  87  200:istore_3        
	//*  88  201:goto            264
	//*  89  204:getstatic       #95  <Field String TAG>
	//*  90  207:ldc2            #658 <String "from">
	//*  91  210:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
	//*  92  213:iload_2         
	//*  93  214:aload_0         
	//*  94  215:getfield        #227 <Field com.baidu.android.pushservice.config.c mFacturer>
	//*  95  218:invokevirtual   #648 <Method c$a com.baidu.android.pushservice.config.c.a()>
	//*  96  221:getfield        #656 <Field int com.baidu.android.pushservice.config.c$a.a>
	//*  97  224:icmplt          232
	//*  98  227:iconst_1        
	//*  99  228:istore_1        
	//* 100  229:goto            234
	//* 101  232:iconst_0        
	//* 102  233:istore_1        
	//* 103  234:iload_2         
	//* 104  235:aload_0         
	//* 105  236:getfield        #227 <Field com.baidu.android.pushservice.config.c mFacturer>
	//* 106  239:invokevirtual   #648 <Method c$a com.baidu.android.pushservice.config.c.a()>
	//* 107  242:getfield        #652 <Field int com.baidu.android.pushservice.config.c$a.b>
	//* 108  245:icmpgt          253
	//* 109  248:iconst_1        
	//* 110  249:istore_2        
	//* 111  250:goto            255
	//* 112  253:iconst_0        
	//* 113  254:istore_2        
	//* 114  255:iload_2         
	//* 115  256:iload_1         
	//* 116  257:iand            
	//* 117  258:istore_3        
	//* 118  259:goto            264
	//* 119  262:iconst_0        
	//* 120  263:istore_3        
	//* 121  264:getstatic       #95  <Field String TAG>
	//* 122  267:astore          5
	//* 123  269:new             #105 <Class StringBuilder>
	//* 124  272:dup             
	//* 125  273:invokespecial   #107 <Method void StringBuilder()>
	//* 126  276:astore          6
	//* 127  278:aload           6
	//* 128  280:ldc2            #660 <String "version ret ">
	//* 129  283:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//* 130  286:pop             
	//* 131  287:aload           6
	//* 132  289:iload_3         
	//* 133  290:invokevirtual   #663 <Method StringBuilder StringBuilder.append(boolean)>
	//* 134  293:pop             
	//* 135  294:aload           5
	//* 136  296:aload           6
	//* 137  298:invokevirtual   #128 <Method String StringBuilder.toString()>
	//* 138  301:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
	//* 139  304:iload_3         
	//* 140  305:ifeq            600
	//* 141  308:new             #665 <Class ByteArrayInputStream>
	//* 142  311:dup             
	//* 143  312:aload           4
	//* 144  314:getfield        #669 <Field Signature[] PackageInfo.signatures>
	//* 145  317:iconst_0        
	//* 146  318:aaload          
	//* 147  319:invokevirtual   #675 <Method byte[] Signature.toByteArray()>
	//* 148  322:invokespecial   #678 <Method void ByteArrayInputStream(byte[])>
	//* 149  325:astore          6
	//* 150  327:aconst_null     
	//* 151  328:astore          5
	//* 152  330:ldc2            #680 <String "X509">
	//* 153  333:invokestatic    #685 <Method CertificateFactory CertificateFactory.getInstance(String)>
	//* 154  336:astore          4
	//* 155  338:goto            354
	//* 156  341:astore          4
	//* 157  343:getstatic       #95  <Field String TAG>
	//* 158  346:aload           4
	//* 159  348:invokestatic    #345 <Method void com.baidu.android.pushservice.e.a.a(String, Throwable)>
	//* 160  351:aconst_null     
	//* 161  352:astore          4
	//* 162  354:aload           4
	//* 163  356:aload           6
	//* 164  358:invokevirtual   #689 <Method java.security.cert.Certificate CertificateFactory.generateCertificate(java.io.InputStream)>
	//* 165  361:checkcast       #691 <Class X509Certificate>
	//* 166  364:astore          4
	//* 167  366:goto            382
	//* 168  369:astore          4
	//* 169  371:getstatic       #95  <Field String TAG>
	//* 170  374:aload           4
	//* 171  376:invokestatic    #345 <Method void com.baidu.android.pushservice.e.a.a(String, Throwable)>
	//* 172  379:aconst_null     
	//* 173  380:astore          4
	//* 174  382:aload           4
	//* 175  384:invokevirtual   #694 <Method byte[] X509Certificate.getEncoded()>
	//* 176  387:invokestatic    #699 <Method byte[] com.baidu.android.pushservice.i.h.a(byte[])>
	//* 177  390:astore          4
	//* 178  392:goto            409
	//* 179  395:astore          4
	//* 180  397:getstatic       #95  <Field String TAG>
	//* 181  400:aload           4
	//* 182  402:invokestatic    #345 <Method void com.baidu.android.pushservice.e.a.a(String, Throwable)>
	//* 183  405:aload           5
	//* 184  407:astore          4
	//* 185  409:aload           4
	//* 186  411:invokestatic    #701 <Method String byte2HexFormatted(byte[])>
	//* 187  414:astore          4
	//* 188  416:getstatic       #95  <Field String TAG>
	//* 189  419:astore          5
	//* 190  421:new             #105 <Class StringBuilder>
	//* 191  424:dup             
	//* 192  425:invokespecial   #107 <Method void StringBuilder()>
	//* 193  428:astore          6
	//* 194  430:aload           6
	//* 195  432:ldc2            #703 <String "hexString ">
	//* 196  435:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//* 197  438:pop             
	//* 198  439:aload           6
	//* 199  441:aload           4
	//* 200  443:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//* 201  446:pop             
	//* 202  447:aload           5
	//* 203  449:aload           6
	//* 204  451:invokevirtual   #128 <Method String StringBuilder.toString()>
	//* 205  454:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
	//* 206  457:getstatic       #95  <Field String TAG>
	//* 207  460:astore          5
	//* 208  462:new             #105 <Class StringBuilder>
	//* 209  465:dup             
	//* 210  466:invokespecial   #107 <Method void StringBuilder()>
	//* 211  469:astore          6
	//* 212  471:aload           6
	//* 213  473:ldc2            #705 <String "apkSignture">
	//* 214  476:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//* 215  479:pop             
	//* 216  480:aload           6
	//* 217  482:aload_0         
	//* 218  483:getfield        #227 <Field com.baidu.android.pushservice.config.c mFacturer>
	//* 219  486:invokevirtual   #708 <Method String c.g()>
	//* 220  489:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//* 221  492:pop             
	//* 222  493:aload           5
	//* 223  495:aload           6
	//* 224  497:invokevirtual   #128 <Method String StringBuilder.toString()>
	//* 225  500:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
	//* 226  503:aload           4
	//* 227  505:aload_0         
	//* 228  506:getfield        #227 <Field com.baidu.android.pushservice.config.c mFacturer>
	//* 229  509:invokevirtual   #708 <Method String c.g()>
	//* 230  512:invokevirtual   #394 <Method boolean String.equalsIgnoreCase(String)>
	//* 231  515:ifeq            600
	//* 232  518:aload_0         
	//* 233  519:aload_0         
	//* 234  520:getfield        #227 <Field com.baidu.android.pushservice.config.c mFacturer>
	//* 235  523:invokevirtual   #628 <Method String c.f()>
	//* 236  526:putfield        #93  <Field String mHostPackage>
	//* 237  529:aload_0         
	//* 238  530:aload_0         
	//* 239  531:getfield        #117 <Field Context mContext>
	//* 240  534:aload_0         
	//* 241  535:getfield        #93  <Field String mHostPackage>
	//* 242  538:invokestatic    #712 <Method int u.l(Context, String)>
	//* 243  541:putfield        #91  <Field int mHighestVersion>
	//* 244  544:aload_0         
	//* 245  545:getfield        #117 <Field Context mContext>
	//* 246  548:invokevirtual   #123 <Method String Context.getPackageName()>
	//* 247  551:aload_0         
	//* 248  552:getfield        #227 <Field com.baidu.android.pushservice.config.c mFacturer>
	//* 249  555:invokevirtual   #628 <Method String c.f()>
	//* 250  558:invokevirtual   #394 <Method boolean String.equalsIgnoreCase(String)>
	//* 251  561:ifeq            582
	//* 252  564:aload_0         
	//* 253  565:getstatic       #714 <Field int MODE_C_H>
	//* 254  568:putfield        #84  <Field int mCurrentMode>
	//* 255  571:getstatic       #95  <Field String TAG>
	//* 256  574:ldc2            #716 <String "return true c_h">
	//* 257  577:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
	//* 258  580:iconst_1        
	//* 259  581:ireturn         
	//* 260  582:aload_0         
	//* 261  583:getstatic       #718 <Field int MODE_C_C>
	//* 262  586:putfield        #84  <Field int mCurrentMode>
	//* 263  589:getstatic       #95  <Field String TAG>
	//* 264  592:ldc2            #720 <String "return true c_c">
	//* 265  595:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
	//* 266  598:iconst_1        
	//* 267  599:ireturn         
	//* 268  600:iconst_0        
	//* 269  601:ireturn         
				catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
	//* 270  602:astore          4
				{
					return false;
	//  271  604:iconst_0        
	//  272  605:ireturn         
				}
				if(obj == null)
					break label0;
				i = ((PackageInfo) (obj)).versionCode;
				s = TAG;
				obj1 = ((Object) (new StringBuilder()));
				((StringBuilder) (obj1)).append("version code = ");
				((StringBuilder) (obj1)).append(i);
				com.baidu.android.pushservice.e.a.c(s, ((StringBuilder) (obj1)).toString());
				if(mFacturer.a() != null)
					if(mFacturer.a().b == -1)
					{
						com.baidu.android.pushservice.e.a.c(TAG, "to = -1");
						if(i >= mFacturer.a().a)
						{
							flag1 = true;
							break label1;
						}
					} else
					{
						com.baidu.android.pushservice.e.a.c(TAG, "from");
						boolean flag;
						if(i >= mFacturer.a().a)
							flag = true;
						else
							flag = false;
						if(i <= mFacturer.a().b)
							i = 1;
						else
							i = 0;
						flag1 = i & flag;
						break label1;
					}
				flag1 = false;
			}
			s = TAG;
			obj1 = ((Object) (new StringBuilder()));
			((StringBuilder) (obj1)).append("version ret ");
			((StringBuilder) (obj1)).append(flag1);
			com.baidu.android.pushservice.e.a.c(s, ((StringBuilder) (obj1)).toString());
			if(flag1)
			{
				obj1 = ((Object) (new ByteArrayInputStream(((PackageInfo) (obj)).signatures[0].toByteArray())));
				s = null;
				try
				{
					obj = ((Object) (CertificateFactory.getInstance("X509")));
				}
				// Misplaced declaration of an exception variable
				catch(Object obj)
				{
					com.baidu.android.pushservice.e.a.a(TAG, ((Throwable) (obj)));
					obj = null;
				}
				try
				{
					obj = ((Object) ((X509Certificate)((CertificateFactory) (obj)).generateCertificate(((java.io.InputStream) (obj1)))));
				}
				// Misplaced declaration of an exception variable
				catch(Object obj)
				{
					com.baidu.android.pushservice.e.a.a(TAG, ((Throwable) (obj)));
					obj = null;
				}
				try
				{
					obj = ((Object) (com.baidu.android.pushservice.i.h.a(((X509Certificate) (obj)).getEncoded())));
				}
				// Misplaced declaration of an exception variable
				catch(Object obj)
				{
					com.baidu.android.pushservice.e.a.a(TAG, ((Throwable) (obj)));
					obj = ((Object) (s));
				}
				obj = ((Object) (byte2HexFormatted(((byte []) (obj)))));
				s = TAG;
				obj1 = ((Object) (new StringBuilder()));
				((StringBuilder) (obj1)).append("hexString ");
				((StringBuilder) (obj1)).append(((String) (obj)));
				com.baidu.android.pushservice.e.a.c(s, ((StringBuilder) (obj1)).toString());
				s = TAG;
				obj1 = ((Object) (new StringBuilder()));
				((StringBuilder) (obj1)).append("apkSignture");
				((StringBuilder) (obj1)).append(mFacturer.g());
				com.baidu.android.pushservice.e.a.c(s, ((StringBuilder) (obj1)).toString());
				if(((String) (obj)).equalsIgnoreCase(mFacturer.g()))
				{
					mHostPackage = mFacturer.f();
					mHighestVersion = u.l(mContext, mHostPackage);
					if(mContext.getPackageName().equalsIgnoreCase(mFacturer.f()))
					{
						mCurrentMode = MODE_C_H;
						com.baidu.android.pushservice.e.a.c(TAG, "return true c_h");
						return true;
					} else
					{
						mCurrentMode = MODE_C_C;
						com.baidu.android.pushservice.e.a.c(TAG, "return true c_c");
						return true;
					}
				}
			}
		}
		return false;
	}

	public void reload()
	{
		boolean flag = needReload();
	//    0    0:aload_0         
	//    1    1:invokespecial   #722 <Method boolean needReload()>
	//    2    4:istore_1        
		boolean flag1 = initFromCache();
	//    3    5:aload_0         
	//    4    6:invokespecial   #724 <Method boolean initFromCache()>
	//    5    9:istore_2        
		String s = TAG;
	//    6   10:getstatic       #95  <Field String TAG>
	//    7   13:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    8   14:new             #105 <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #107 <Method void StringBuilder()>
	//   11   21:astore          4
		stringbuilder.append("needReload = ");
	//   12   23:aload           4
	//   13   25:ldc2            #726 <String "needReload = ">
	//   14   28:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		stringbuilder.append(flag);
	//   16   32:aload           4
	//   17   34:iload_1         
	//   18   35:invokevirtual   #663 <Method StringBuilder StringBuilder.append(boolean)>
	//   19   38:pop             
		stringbuilder.append(", initFromCache = ");
	//   20   39:aload           4
	//   21   41:ldc2            #728 <String ", initFromCache = ">
	//   22   44:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
		stringbuilder.append(flag1);
	//   24   48:aload           4
	//   25   50:iload_2         
	//   26   51:invokevirtual   #663 <Method StringBuilder StringBuilder.append(boolean)>
	//   27   54:pop             
		com.baidu.android.pushservice.e.a.c(s, stringbuilder.toString());
	//   28   55:aload_3         
	//   29   56:aload           4
	//   30   58:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   31   61:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
		if((flag || !flag1) && loadConfig())
	//*  32   64:iload_1         
	//*  33   65:ifne            72
	//*  34   68:iload_2         
	//*  35   69:ifne            84
	//*  36   72:aload_0         
	//*  37   73:invokevirtual   #731 <Method boolean loadConfig()>
	//*  38   76:ifeq            84
			parseConfig();
	//   39   79:aload_0         
	//   40   80:invokespecial   #733 <Method boolean parseConfig()>
	//   41   83:pop             
		if(mFacturer != null)
	//*  42   84:aload_0         
	//*  43   85:getfield        #227 <Field com.baidu.android.pushservice.config.c mFacturer>
	//*  44   88:ifnull          96
			refreshMode();
	//   45   91:aload_0         
	//   46   92:invokevirtual   #735 <Method boolean refreshMode()>
	//   47   95:pop             
	//   48   96:return          
	}

	public void updateConfig(a a1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		hasCallBack = false;
	//    2    2:iconst_0        
	//    3    3:putstatic       #154 <Field boolean hasCallBack>
		com.baidu.android.pushservice.e.a.c(TAG, "updateConfig......");
	//    4    6:getstatic       #95  <Field String TAG>
	//    5    9:ldc2            #739 <String "updateConfig......">
	//    6   12:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
		if(!u.a() || !PushSettings.m(mContext)) goto _L2; else goto _L1
	//    7   15:invokestatic    #529 <Method boolean u.a()>
	//    8   18:ifeq            106
	//    9   21:aload_0         
	//   10   22:getfield        #117 <Field Context mContext>
	//   11   25:invokestatic    #259 <Method boolean PushSettings.m(Context)>
	//   12   28:ifeq            106
_L1:
		boolean flag = isXiaomiProxyMode(mContext);
	//   13   31:aload_0         
	//   14   32:getfield        #117 <Field Context mContext>
	//   15   35:invokestatic    #247 <Method boolean isXiaomiProxyMode(Context)>
	//   16   38:istore_2        
		if(flag) goto _L2; else goto _L3
	//   17   39:iload_2         
	//   18   40:ifne            106
_L3:
		com.baidu.android.pushservice.e.a.c(TAG, "XiaomiProxyMode......");
	//   19   43:getstatic       #95  <Field String TAG>
	//   20   46:ldc2            #741 <String "XiaomiProxyMode......">
	//   21   49:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
		String s = u.G(mContext);
	//   22   52:aload_0         
	//   23   53:getfield        #117 <Field Context mContext>
	//   24   56:invokestatic    #745 <Method String u.G(Context)>
	//   25   59:astore          7
		if(!TextUtils.isEmpty(((CharSequence) (s))) && (double)Float.parseFloat(s) >= 4D)
	//*  26   61:aload           7
	//*  27   63:invokestatic    #216 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  28   66:ifne            209
	//*  29   69:aload           7
	//*  30   71:invokestatic    #751 <Method float Float.parseFloat(String)>
	//*  31   74:f2d             
	//*  32   75:ldc2w           #752 <Double 4D>
	//*  33   78:dcmpl           
	//*  34   79:iflt            209
			updateConfigTime = 0;
	//   35   82:iconst_0        
	//   36   83:putstatic       #755 <Field int updateConfigTime>
		break MISSING_BLOCK_LABEL_209;
	//   37   86:goto            209
		Exception exception;
		exception;
	//   38   89:astore          7
		String s2 = TAG;
	//   39   91:getstatic       #95  <Field String TAG>
	//   40   94:astore          8
_L4:
		com.baidu.android.pushservice.e.a.a(s2, ((Throwable) (exception)));
	//   41   96:aload           8
	//   42   98:aload           7
	//   43  100:invokestatic    #345 <Method void com.baidu.android.pushservice.e.a.a(String, Throwable)>
		break MISSING_BLOCK_LABEL_209;
	//   44  103:goto            209
_L2:
		if(!u.b() || !PushSettings.n(mContext))
			break MISSING_BLOCK_LABEL_190;
	//   45  106:invokestatic    #531 <Method boolean u.b()>
	//   46  109:ifeq            190
	//   47  112:aload_0         
	//   48  113:getfield        #117 <Field Context mContext>
	//   49  116:invokestatic    #241 <Method boolean PushSettings.n(Context)>
	//   50  119:ifeq            190
		flag = isHuaweiProxyMode(mContext);
	//   51  122:aload_0         
	//   52  123:getfield        #117 <Field Context mContext>
	//   53  126:invokestatic    #244 <Method boolean isHuaweiProxyMode(Context)>
	//   54  129:istore_2        
		if(flag)
			break MISSING_BLOCK_LABEL_190;
	//   55  130:iload_2         
	//   56  131:ifne            190
		try
		{
			com.baidu.android.pushservice.e.a.c(TAG, "HuaweiProxyMode......");
	//   57  134:getstatic       #95  <Field String TAG>
	//   58  137:ldc2            #757 <String "HuaweiProxyMode......">
	//   59  140:invokestatic    #103 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
			String s1 = u.G(mContext);
	//   60  143:aload_0         
	//   61  144:getfield        #117 <Field Context mContext>
	//   62  147:invokestatic    #745 <Method String u.G(Context)>
	//   63  150:astore          7
			if(!TextUtils.isEmpty(((CharSequence) (s1))) && (double)Float.parseFloat(s1) >= 3.1000000000000001D)
	//*  64  152:aload           7
	//*  65  154:invokestatic    #216 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  66  157:ifne            209
	//*  67  160:aload           7
	//*  68  162:invokestatic    #751 <Method float Float.parseFloat(String)>
	//*  69  165:f2d             
	//*  70  166:ldc2w           #758 <Double 3.1000000000000001D>
	//*  71  169:dcmpl           
	//*  72  170:iflt            209
				updateConfigTime = 0;
	//   73  173:iconst_0        
	//   74  174:putstatic       #755 <Field int updateConfigTime>
			break MISSING_BLOCK_LABEL_209;
	//   75  177:goto            209
		}
		// Misplaced declaration of an exception variable
		catch(String s1) { }
	//   76  180:astore          7
		s2 = TAG;
	//   77  182:getstatic       #95  <Field String TAG>
	//   78  185:astore          8
		  goto _L4
	//*  79  187:goto            96
		updateConfigTime = 0xf731400;
	//   80  190:ldc1            #47  <Int 0xf731400>
	//   81  192:putstatic       #755 <Field int updateConfigTime>
		if(a1 == null)
			break MISSING_BLOCK_LABEL_209;
	//   82  195:aload_1         
	//   83  196:ifnull          209
		hasCallBack = true;
	//   84  199:iconst_1        
	//   85  200:putstatic       #154 <Field boolean hasCallBack>
		a1.a();
	//   86  203:aload_1         
	//   87  204:invokeinterface #761 <Method void com.baidu.android.pushservice.config.ModeConfig$a.a()>
		long l1;
		long l = m.c(mContext, "last_update_config_time");
	//   88  209:aload_0         
	//   89  210:getfield        #117 <Field Context mContext>
	//   90  213:ldc1            #17  <String "last_update_config_time">
	//   91  215:invokestatic    #444 <Method long m.c(Context, String)>
	//   92  218:lstore_3        
		l1 = System.currentTimeMillis();
	//   93  219:invokestatic    #450 <Method long System.currentTimeMillis()>
	//   94  222:lstore          5
		if(l1 - l > (long)updateConfigTime)
			break MISSING_BLOCK_LABEL_255;
	//   95  224:lload           5
	//   96  226:lload_3         
	//   97  227:lsub            
	//   98  228:getstatic       #755 <Field int updateConfigTime>
	//   99  231:i2l             
	//  100  232:lcmp            
	//  101  233:ifgt            255
		if(a1 == null)
			break MISSING_BLOCK_LABEL_252;
	//  102  236:aload_1         
	//  103  237:ifnull          252
		if(!hasCallBack)
	//* 104  240:getstatic       #154 <Field boolean hasCallBack>
	//* 105  243:ifne            252
			a1.a();
	//  106  246:aload_1         
	//  107  247:invokeinterface #761 <Method void com.baidu.android.pushservice.config.ModeConfig$a.a()>
		this;
	//  108  252:aload_0         
		JVM INSTR monitorexit ;
	//  109  253:monitorexit     
		return;
	//  110  254:return          
		d.a().a(((c) (new c("ModeConfig-updateConfig", (short)100, l1, a1) {

			public void a()
			{
				Object obj2;
				obj2 = ((Object) (new HashMap()));
			//    0    0:new             #32  <Class HashMap>
			//    1    3:dup             
			//    2    4:invokespecial   #34  <Method void HashMap()>
			//    3    7:astore          4
				com.baidu.android.pushservice.c.b.b(((HashMap) (obj2)));
			//    4    9:aload           4
			//    5   11:invokestatic    #39  <Method void com.baidu.android.pushservice.c.b.b(HashMap)>
				StringBuilder stringbuilder = new StringBuilder();
			//    6   14:new             #41  <Class StringBuilder>
			//    7   17:dup             
			//    8   18:invokespecial   #42  <Method void StringBuilder()>
			//    9   21:astore_2        
				stringbuilder.append(c.mConfigVersion);
			//   10   22:aload_2         
			//   11   23:aload_0         
			//   12   24:getfield        #19  <Field ModeConfig c>
			//   13   27:invokestatic    #46  <Method int ModeConfig.access$000(ModeConfig)>
			//   14   30:invokevirtual   #50  <Method StringBuilder StringBuilder.append(int)>
			//   15   33:pop             
				stringbuilder.append("");
			//   16   34:aload_2         
			//   17   35:ldc1            #52  <String "">
			//   18   37:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
			//   19   40:pop             
				((HashMap) (obj2)).put("version", ((Object) (stringbuilder.toString())));
			//   20   41:aload           4
			//   21   43:ldc1            #57  <String "version">
			//   22   45:aload_2         
			//   23   46:invokevirtual   #61  <Method String StringBuilder.toString()>
			//   24   49:invokevirtual   #65  <Method Object HashMap.put(Object, Object)>
			//   25   52:pop             
				((HashMap) (obj2)).put("model", ((Object) (Build.MODEL)));
			//   26   53:aload           4
			//   27   55:ldc1            #67  <String "model">
			//   28   57:getstatic       #73  <Field String Build.MODEL>
			//   29   60:invokevirtual   #65  <Method Object HashMap.put(Object, Object)>
			//   30   63:pop             
				stringbuilder = new StringBuilder();
			//   31   64:new             #41  <Class StringBuilder>
			//   32   67:dup             
			//   33   68:invokespecial   #42  <Method void StringBuilder()>
			//   34   71:astore_2        
				stringbuilder.append(android.os.Build.VERSION.SDK_INT);
			//   35   72:aload_2         
			//   36   73:getstatic       #79  <Field int android.os.Build$VERSION.SDK_INT>
			//   37   76:invokevirtual   #50  <Method StringBuilder StringBuilder.append(int)>
			//   38   79:pop             
				stringbuilder.append("");
			//   39   80:aload_2         
			//   40   81:ldc1            #52  <String "">
			//   41   83:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
			//   42   86:pop             
				((HashMap) (obj2)).put("osSdkInt", ((Object) (stringbuilder.toString())));
			//   43   87:aload           4
			//   44   89:ldc1            #81  <String "osSdkInt">
			//   45   91:aload_2         
			//   46   92:invokevirtual   #61  <Method String StringBuilder.toString()>
			//   47   95:invokevirtual   #65  <Method Object HashMap.put(Object, Object)>
			//   48   98:pop             
				if((!u.a() || !PushSettings.m(c.mContext)) && (!u.b() || !PushSettings.n(c.mContext))) goto _L2; else goto _L1
			//   49   99:invokestatic    #86  <Method boolean u.a()>
			//   50  102:ifeq            118
			//   51  105:aload_0         
			//   52  106:getfield        #19  <Field ModeConfig c>
			//   53  109:getfield        #90  <Field Context ModeConfig.mContext>
			//   54  112:invokestatic    #96  <Method boolean PushSettings.m(Context)>
			//   55  115:ifne            137
			//   56  118:invokestatic    #98  <Method boolean u.b()>
			//   57  121:ifeq            290
			//   58  124:aload_0         
			//   59  125:getfield        #19  <Field ModeConfig c>
			//   60  128:getfield        #90  <Field Context ModeConfig.mContext>
			//   61  131:invokestatic    #101 <Method boolean PushSettings.n(Context)>
			//   62  134:ifeq            290
_L1:
				((HashMap) (obj2)).put("manufacture", ((Object) (Build.MANUFACTURER)));
			//   63  137:aload           4
			//   64  139:ldc1            #103 <String "manufacture">
			//   65  141:getstatic       #106 <Field String Build.MANUFACTURER>
			//   66  144:invokevirtual   #65  <Method Object HashMap.put(Object, Object)>
			//   67  147:pop             
				StringBuilder stringbuilder1 = new StringBuilder();
			//   68  148:new             #41  <Class StringBuilder>
			//   69  151:dup             
			//   70  152:invokespecial   #42  <Method void StringBuilder()>
			//   71  155:astore_2        
				stringbuilder1.append(((int) (com.baidu.android.pushservice.a.a())));
			//   72  156:aload_2         
			//   73  157:invokestatic    #111 <Method short a.a()>
			//   74  160:invokevirtual   #50  <Method StringBuilder StringBuilder.append(int)>
			//   75  163:pop             
				stringbuilder1.append("");
			//   76  164:aload_2         
			//   77  165:ldc1            #52  <String "">
			//   78  167:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
			//   79  170:pop             
				((HashMap) (obj2)).put("sdk_version", ((Object) (stringbuilder1.toString())));
			//   80  171:aload           4
			//   81  173:ldc1            #113 <String "sdk_version">
			//   82  175:aload_2         
			//   83  176:invokevirtual   #61  <Method String StringBuilder.toString()>
			//   84  179:invokevirtual   #65  <Method Object HashMap.put(Object, Object)>
			//   85  182:pop             
				((HashMap) (obj2)).put("cuid", ((Object) (e.a(c.mContext))));
			//   86  183:aload           4
			//   87  185:ldc1            #115 <String "cuid">
			//   88  187:aload_0         
			//   89  188:getfield        #19  <Field ModeConfig c>
			//   90  191:getfield        #90  <Field Context ModeConfig.mContext>
			//   91  194:invokestatic    #120 <Method String e.a(Context)>
			//   92  197:invokevirtual   #65  <Method Object HashMap.put(Object, Object)>
			//   93  200:pop             
				((HashMap) (obj2)).put("channelid", ((Object) (PushSettings.a(c.mContext))));
			//   94  201:aload           4
			//   95  203:ldc1            #122 <String "channelid">
			//   96  205:aload_0         
			//   97  206:getfield        #19  <Field ModeConfig c>
			//   98  209:getfield        #90  <Field Context ModeConfig.mContext>
			//   99  212:invokestatic    #123 <Method String PushSettings.a(Context)>
			//  100  215:invokevirtual   #65  <Method Object HashMap.put(Object, Object)>
			//  101  218:pop             
				((HashMap) (obj2)).put("package_name", ((Object) (c.mContext.getPackageName())));
			//  102  219:aload           4
			//  103  221:ldc1            #125 <String "package_name">
			//  104  223:aload_0         
			//  105  224:getfield        #19  <Field ModeConfig c>
			//  106  227:getfield        #90  <Field Context ModeConfig.mContext>
			//  107  230:invokevirtual   #130 <Method String Context.getPackageName()>
			//  108  233:invokevirtual   #65  <Method Object HashMap.put(Object, Object)>
			//  109  236:pop             
				((HashMap) (obj2)).put("pkg_sign", ((Object) (u.q(c.mContext, c.mContext.getPackageName()))));
			//  110  237:aload           4
			//  111  239:ldc1            #132 <String "pkg_sign">
			//  112  241:aload_0         
			//  113  242:getfield        #19  <Field ModeConfig c>
			//  114  245:getfield        #90  <Field Context ModeConfig.mContext>
			//  115  248:aload_0         
			//  116  249:getfield        #19  <Field ModeConfig c>
			//  117  252:getfield        #90  <Field Context ModeConfig.mContext>
			//  118  255:invokevirtual   #130 <Method String Context.getPackageName()>
			//  119  258:invokestatic    #136 <Method String u.q(Context, String)>
			//  120  261:invokevirtual   #65  <Method Object HashMap.put(Object, Object)>
			//  121  264:pop             
				String s3 = "rom_version";
			//  122  265:ldc1            #138 <String "rom_version">
			//  123  267:astore_2        
				Object obj1 = ((Object) (u.G(c.mContext)));
			//  124  268:aload_0         
			//  125  269:getfield        #19  <Field ModeConfig c>
			//  126  272:getfield        #90  <Field Context ModeConfig.mContext>
			//  127  275:invokestatic    #141 <Method String u.G(Context)>
			//  128  278:astore_3        
_L3:
				((HashMap) (obj2)).put(((Object) (s3)), obj1);
			//  129  279:aload           4
			//  130  281:aload_2         
			//  131  282:aload_3         
			//  132  283:invokevirtual   #65  <Method Object HashMap.put(Object, Object)>
			//  133  286:pop             
				break MISSING_BLOCK_LABEL_335;
			//  134  287:goto            335
_L2:
				((HashMap) (obj2)).put("manufacturer", ((Object) (Build.MANUFACTURER)));
			//  135  290:aload           4
			//  136  292:ldc1            #143 <String "manufacturer">
			//  137  294:getstatic       #106 <Field String Build.MANUFACTURER>
			//  138  297:invokevirtual   #65  <Method Object HashMap.put(Object, Object)>
			//  139  300:pop             
				s3 = "pushSdkInt";
			//  140  301:ldc1            #145 <String "pushSdkInt">
			//  141  303:astore_2        
				obj1 = ((Object) (new StringBuilder()));
			//  142  304:new             #41  <Class StringBuilder>
			//  143  307:dup             
			//  144  308:invokespecial   #42  <Method void StringBuilder()>
			//  145  311:astore_3        
				((StringBuilder) (obj1)).append(((int) (com.baidu.android.pushservice.a.a())));
			//  146  312:aload_3         
			//  147  313:invokestatic    #111 <Method short a.a()>
			//  148  316:invokevirtual   #50  <Method StringBuilder StringBuilder.append(int)>
			//  149  319:pop             
				((StringBuilder) (obj1)).append("");
			//  150  320:aload_3         
			//  151  321:ldc1            #52  <String "">
			//  152  323:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
			//  153  326:pop             
				obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
			//  154  327:aload_3         
			//  155  328:invokevirtual   #61  <Method String StringBuilder.toString()>
			//  156  331:astore_3        
				  goto _L3
			//* 157  332:goto            279
				Object obj = ((Object) (ModeConfig.TAG));
			//  158  335:invokestatic    #148 <Method String ModeConfig.access$100()>
			//  159  338:astore_2        
				obj1 = ((Object) (new StringBuilder()));
			//  160  339:new             #41  <Class StringBuilder>
			//  161  342:dup             
			//  162  343:invokespecial   #42  <Method void StringBuilder()>
			//  163  346:astore_3        
				((StringBuilder) (obj1)).append("update config request send, params=");
			//  164  347:aload_3         
			//  165  348:ldc1            #150 <String "update config request send, params=">
			//  166  350:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
			//  167  353:pop             
				((StringBuilder) (obj1)).append(com.baidu.android.pushservice.c.b.a(((HashMap) (obj2))));
			//  168  354:aload_3         
			//  169  355:aload           4
			//  170  357:invokestatic    #153 <Method String com.baidu.android.pushservice.c.b.a(HashMap)>
			//  171  360:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
			//  172  363:pop             
				com.baidu.android.pushservice.e.a.c(((String) (obj)), ((StringBuilder) (obj1)).toString());
			//  173  364:aload_2         
			//  174  365:aload_3         
			//  175  366:invokevirtual   #61  <Method String StringBuilder.toString()>
			//  176  369:invokestatic    #158 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
				obj = ((Object) (c.requestConfig(((HashMap) (obj2)))));
			//  177  372:aload_0         
			//  178  373:getfield        #19  <Field ModeConfig c>
			//  179  376:aload           4
			//  180  378:invokestatic    #162 <Method String ModeConfig.access$200(ModeConfig, HashMap)>
			//  181  381:astore_2        
				if(TextUtils.isEmpty(((CharSequence) (obj))))
					break MISSING_BLOCK_LABEL_558;
			//  182  382:aload_2         
			//  183  383:invokestatic    #168 <Method boolean TextUtils.isEmpty(CharSequence)>
			//  184  386:ifne            558
				obj = ((Object) (new JSONObject(((String) (obj)))));
			//  185  389:new             #170 <Class JSONObject>
			//  186  392:dup             
			//  187  393:aload_2         
			//  188  394:invokespecial   #173 <Method void JSONObject(String)>
			//  189  397:astore_2        
				obj1 = ((Object) ((JSONObject)((JSONObject) (obj)).get("response_params")));
			//  190  398:aload_2         
			//  191  399:ldc1            #175 <String "response_params">
			//  192  401:invokevirtual   #179 <Method Object JSONObject.get(String)>
			//  193  404:checkcast       #170 <Class JSONObject>
			//  194  407:astore_3        
				obj2 = ((Object) (ModeConfig.TAG));
			//  195  408:invokestatic    #148 <Method String ModeConfig.access$100()>
			//  196  411:astore          4
				StringBuilder stringbuilder2 = new StringBuilder();
			//  197  413:new             #41  <Class StringBuilder>
			//  198  416:dup             
			//  199  417:invokespecial   #42  <Method void StringBuilder()>
			//  200  420:astore          5
				stringbuilder2.append("new config content=");
			//  201  422:aload           5
			//  202  424:ldc1            #181 <String "new config content=">
			//  203  426:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
			//  204  429:pop             
				stringbuilder2.append(((JSONObject) (obj)).toString());
			//  205  430:aload           5
			//  206  432:aload_2         
			//  207  433:invokevirtual   #182 <Method String JSONObject.toString()>
			//  208  436:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
			//  209  439:pop             
				com.baidu.android.pushservice.e.a.c(((String) (obj2)), stringbuilder2.toString());
			//  210  440:aload           4
			//  211  442:aload           5
			//  212  444:invokevirtual   #61  <Method String StringBuilder.toString()>
			//  213  447:invokestatic    #158 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
				if(obj1 == null)
					break MISSING_BLOCK_LABEL_558;
			//  214  450:aload_3         
			//  215  451:ifnull          558
				boolean flag1;
				if(((JSONObject) (obj1)).getInt("status") != 1)
					break MISSING_BLOCK_LABEL_558;
			//  216  454:aload_3         
			//  217  455:ldc1            #184 <String "status">
			//  218  457:invokevirtual   #188 <Method int JSONObject.getInt(String)>
			//  219  460:iconst_1        
			//  220  461:icmpne          558
				String s4 = ((JSONObject) (obj1)).getString("sdkconfig");
			//  221  464:aload_3         
			//  222  465:ldc1            #190 <String "sdkconfig">
			//  223  467:invokevirtual   #194 <Method String JSONObject.getString(String)>
			//  224  470:astore_2        
				if(TextUtils.isEmpty(((CharSequence) (s4))))
					break MISSING_BLOCK_LABEL_558;
			//  225  471:aload_2         
			//  226  472:invokestatic    #168 <Method boolean TextUtils.isEmpty(CharSequence)>
			//  227  475:ifne            558
				flag1 = c.writeConfig(s4);
			//  228  478:aload_0         
			//  229  479:getfield        #19  <Field ModeConfig c>
			//  230  482:aload_2         
			//  231  483:invokevirtual   #198 <Method boolean ModeConfig.writeConfig(String)>
			//  232  486:istore_1        
				s4 = ModeConfig.TAG;
			//  233  487:invokestatic    #148 <Method String ModeConfig.access$100()>
			//  234  490:astore_2        
				obj1 = ((Object) (new StringBuilder()));
			//  235  491:new             #41  <Class StringBuilder>
			//  236  494:dup             
			//  237  495:invokespecial   #42  <Method void StringBuilder()>
			//  238  498:astore_3        
				((StringBuilder) (obj1)).append("write config >> ");
			//  239  499:aload_3         
			//  240  500:ldc1            #200 <String "write config >> ">
			//  241  502:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
			//  242  505:pop             
				((StringBuilder) (obj1)).append(flag1);
			//  243  506:aload_3         
			//  244  507:iload_1         
			//  245  508:invokevirtual   #203 <Method StringBuilder StringBuilder.append(boolean)>
			//  246  511:pop             
				com.baidu.android.pushservice.e.a.c(s4, ((StringBuilder) (obj1)).toString());
			//  247  512:aload_2         
			//  248  513:aload_3         
			//  249  514:invokevirtual   #61  <Method String StringBuilder.toString()>
			//  250  517:invokestatic    #158 <Method void com.baidu.android.pushservice.e.a.c(String, String)>
				if(flag1)
			//* 251  520:iload_1         
			//* 252  521:ifeq            558
					try
					{
						c.reload();
			//  253  524:aload_0         
			//  254  525:getfield        #19  <Field ModeConfig c>
			//  255  528:invokevirtual   #206 <Method void ModeConfig.reload()>
						m.a(c.mContext, "last_update_config_time", a);
			//  256  531:aload_0         
			//  257  532:getfield        #19  <Field ModeConfig c>
			//  258  535:getfield        #90  <Field Context ModeConfig.mContext>
			//  259  538:ldc1            #208 <String "last_update_config_time">
			//  260  540:aload_0         
			//  261  541:getfield        #21  <Field long a>
			//  262  544:invokestatic    #213 <Method void m.a(Context, String, long)>
					}
			//* 263  547:goto            558
					catch(Exception exception1)
			//* 264  550:astore_2        
					{
						com.baidu.android.pushservice.e.a.a(ModeConfig.TAG, ((Throwable) (exception1)));
			//  265  551:invokestatic    #148 <Method String ModeConfig.access$100()>
			//  266  554:aload_2         
			//  267  555:invokestatic    #216 <Method void com.baidu.android.pushservice.e.a.a(String, Throwable)>
					}
				if(b != null && !ModeConfig.hasCallBack)
			//* 268  558:aload_0         
			//* 269  559:getfield        #23  <Field ModeConfig$a b>
			//* 270  562:ifnull          580
			//* 271  565:invokestatic    #219 <Method boolean ModeConfig.access$300()>
			//* 272  568:ifne            580
					b.a();
			//  273  571:aload_0         
			//  274  572:getfield        #23  <Field ModeConfig$a b>
			//  275  575:invokeinterface #223 <Method void com.baidu.android.pushservice.config.ModeConfig$a.a()>
				return;
			//  276  580:return          
			}

			final long a;
			final a b;
			final ModeConfig c;

			
			{
				c = ModeConfig.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ModeConfig c>
				a = l;
			//    3    5:aload_0         
			//    4    6:lload           4
			//    5    8:putfield        #21  <Field long a>
				b = a1;
			//    6   11:aload_0         
			//    7   12:aload           6
			//    8   14:putfield        #23  <Field ModeConfig$a b>
				super(s, word0);
			//    9   17:aload_0         
			//   10   18:aload_2         
			//   11   19:iload_3         
			//   12   20:invokespecial   #26  <Method void c(String, short)>
			//   13   23:return          
			}
		}
)));
	//  111  255:invokestatic    #766 <Method d d.a()>
	//  112  258:new             #6   <Class ModeConfig$1>
	//  113  261:dup             
	//  114  262:aload_0         
	//  115  263:ldc2            #768 <String "ModeConfig-updateConfig">
	//  116  266:bipush          100
	//  117  268:lload           5
	//  118  270:aload_1         
	//  119  271:invokespecial   #771 <Method void ModeConfig$1(ModeConfig, String, short, long, ModeConfig$a)>
	//  120  274:invokevirtual   #774 <Method boolean d.a(c)>
	//  121  277:pop             
		this;
	//  122  278:aload_0         
		JVM INSTR monitorexit ;
	//  123  279:monitorexit     
		return;
	//  124  280:return          
		a1;
	//  125  281:astore_1        
	//* 126  282:aload_0         
		throw a1;
	//  127  283:monitorexit     
	//  128  284:aload_1         
	//  129  285:athrow          
	}

	private static String BUILD_PROP_FILES[] = {
		"/default.prop", "/system/build.prop", "/system/default.prop", "/data/local.prop"
	};
	private static final String CONFIG_MANUFACTURER_DEFAULT = "CONFIG_MANUFACTURER_DEFAULT";
	private static final String LAST_UPDATE_CONFIG_TIME = "last_update_config_time";
	private static final String MODECONFIG = "modeconfig";
	public static int MODE_C = 2;
	public static int MODE_C_C = 4;
	public static int MODE_C_H = 3;
	public static int MODE_I = 1;
	public static int MODE_I_HW = 5;
	public static int MODE_I_XM = 6;
	public static int MODE_O = 0;
	private static final String TAG = "ModeConfig";
	private static final String VERSION = "version";
	private static boolean hasCallBack = false;
	private static ModeConfig mInstance;
	private static int updateConfigTime = 0xf731400;
	private int mConfigVersion;
	private int mCurrentMode;
	private com.baidu.android.pushservice.config.c mFacturer;
	private int mHighestVersion;
	private String mHostPackage;
	public HashMap mManufacturers;
	private String updateConfigUrl;

	static 
	{
	//    0    0:iconst_4        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #63  <String "/default.prop">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #65  <String "/system/build.prop">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #67  <String "/system/default.prop">
	//   13   18:aastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #69  <String "/data/local.prop">
	//   17   23:aastore         
	//   18   24:putstatic       #71  <Field String[] BUILD_PROP_FILES>
	//*  19   27:return          
	}


/*
	static int access$000(ModeConfig modeconfig)
	{
		return modeconfig.mConfigVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field int mConfigVersion>
	//    2    4:ireturn         
	}

*/


/*
	static String access$100()
	{
		return TAG;
	//    0    0:getstatic       #95  <Field String TAG>
	//    1    3:areturn         
	}

*/


/*
	static String access$200(ModeConfig modeconfig, HashMap hashmap)
	{
		return modeconfig.requestConfig(hashmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #150 <Method String requestConfig(HashMap)>
	//    3    5:areturn         
	}

*/


/*
	static boolean access$300()
	{
		return hasCallBack;
	//    0    0:getstatic       #154 <Field boolean hasCallBack>
	//    1    3:ireturn         
	}

*/
}
