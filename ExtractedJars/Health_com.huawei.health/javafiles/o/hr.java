// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.*;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.*;
import android.widget.LinearLayout;
import java.io.*;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package o:
//			ft, fx, fv, gj, 
//			hx, fn, hv

public final class hr
{
	public static final class a
	{

		public final boolean b()
		{
			if(e == null || e.length <= 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #20  <Field Signature[] e>
		//*   2    4:ifnull          15
		//*   3    7:aload_0         
		//*   4    8:getfield        #20  <Field Signature[] e>
		//*   5   11:arraylength     
		//*   6   12:ifgt            17
				return false;
		//    7   15:iconst_0        
		//    8   16:ireturn         
			for(int j = 0; j < e.length; j++)
		//*   9   17:iconst_0        
		//*  10   18:istore_1        
		//*  11   19:iload_1         
		//*  12   20:aload_0         
		//*  13   21:getfield        #20  <Field Signature[] e>
		//*  14   24:arraylength     
		//*  15   25:icmpge          71
			{
				String s = hr.e(e[j].toByteArray());
		//   16   28:aload_0         
		//   17   29:getfield        #20  <Field Signature[] e>
		//   18   32:iload_1         
		//   19   33:aaload          
		//   20   34:invokevirtual   #26  <Method byte[] Signature.toByteArray()>
		//   21   37:invokestatic    #29  <Method String hr.e(byte[])>
		//   22   40:astore_2        
				if(s != null && !TextUtils.equals(((CharSequence) (s)), "b6cbad6cbd5ed0d209afc69ad3b7a617efaae9b3c47eabe0be42d924936fa78c8001b1fd74b079e5ff9690061dacfa4768e981a526b9ca77156ca36251cf2f906d105481374998a7e6e6e18f75ca98b8ed2eaf86ff402c874cca0a263053f22237858206867d210020daa38c48b20cc9dfd82b44a51aeb5db459b22794e2d649"))
		//*  23   41:aload_2         
		//*  24   42:ifnull          64
		//*  25   45:aload_2         
		//*  26   46:ldc1            #31  <String "b6cbad6cbd5ed0d209afc69ad3b7a617efaae9b3c47eabe0be42d924936fa78c8001b1fd74b079e5ff9690061dacfa4768e981a526b9ca77156ca36251cf2f906d105481374998a7e6e6e18f75ca98b8ed2eaf86ff402c874cca0a263053f22237858206867d210020daa38c48b20cc9dfd82b44a51aeb5db459b22794e2d649">
		//*  27   48:invokestatic    #37  <Method boolean TextUtils.equals(CharSequence, CharSequence)>
		//*  28   51:ifne            64
				{
					ft.b("biz", "PublicKeyUnmatch", s);
		//   29   54:ldc1            #39  <String "biz">
		//   30   56:ldc1            #41  <String "PublicKeyUnmatch">
		//   31   58:aload_2         
		//   32   59:invokestatic    #46  <Method void ft.b(String, String, String)>
					return true;
		//   33   62:iconst_1        
		//   34   63:ireturn         
				}
			}

		//   35   64:iload_1         
		//   36   65:iconst_1        
		//   37   66:iadd            
		//   38   67:istore_1        
		//*  39   68:goto            19
			return false;
		//   40   71:iconst_0        
		//   41   72:ireturn         
		}

		public int d;
		public Signature e[];

		public a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:return          
		}
	}


	public hr()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static String a()
	{
		String s1 = e();
	//    0    0:invokestatic    #20  <Method String e()>
	//    1    3:astore_2        
		int j = s1.indexOf("-");
	//    2    4:aload_2         
	//    3    5:ldc1            #22  <String "-">
	//    4    7:invokevirtual   #28  <Method int String.indexOf(String)>
	//    5   10:istore_0        
		String s = s1;
	//    6   11:aload_2         
	//    7   12:astore_1        
		if(j != -1)
	//*   8   13:iload_0         
	//*   9   14:iconst_m1       
	//*  10   15:icmpeq          25
			s = s1.substring(0, j);
	//   11   18:aload_2         
	//   12   19:iconst_0        
	//   13   20:iload_0         
	//   14   21:invokevirtual   #32  <Method String String.substring(int, int)>
	//   15   24:astore_1        
		j = s.indexOf("\n");
	//   16   25:aload_1         
	//   17   26:ldc1            #34  <String "\n">
	//   18   28:invokevirtual   #28  <Method int String.indexOf(String)>
	//   19   31:istore_0        
		s1 = s;
	//   20   32:aload_1         
	//   21   33:astore_2        
		if(j != -1)
	//*  22   34:iload_0         
	//*  23   35:iconst_m1       
	//*  24   36:icmpeq          46
			s1 = s.substring(0, j);
	//   25   39:aload_1         
	//   26   40:iconst_0        
	//   27   41:iload_0         
	//   28   42:invokevirtual   #32  <Method String String.substring(int, int)>
	//   29   45:astore_2        
		return (new StringBuilder("Linux ")).append(s1).toString();
	//   30   46:new             #36  <Class StringBuilder>
	//   31   49:dup             
	//   32   50:ldc1            #38  <String "Linux ">
	//   33   52:invokespecial   #41  <Method void StringBuilder(String)>
	//   34   55:aload_2         
	//   35   56:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   36   59:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   37   62:areturn         
	}

	public static boolean a(Context context)
	{
		try
		{
			context = ((Context) (context.getPackageManager().getPackageInfo("com.alipay.android.app", 128)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method PackageManager Context.getPackageManager()>
	//    2    4:ldc1            #59  <String "com.alipay.android.app">
	//    3    6:sipush          128
	//    4    9:invokevirtual   #65  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    5   12:astore_0        
		}
	//*   6   13:aload_0         
	//*   7   14:ifnonnull       19
	//*   8   17:iconst_0        
	//*   9   18:ireturn         
	//*  10   19:goto            24
	//*  11   22:iconst_0        
	//*  12   23:ireturn         
	//*  13   24:iconst_1        
	//*  14   25:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return false;
		}
		return context != null;
	//*  15   26:astore_0        
	//*  16   27:goto            22
	}

	private static PackageInfo b(Context context, String s)
	{
		for(context = ((Context) (context.getPackageManager().getInstalledPackages(192).iterator())); ((Iterator) (context)).hasNext();)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #57  <Method PackageManager Context.getPackageManager()>
	//*   2    4:sipush          192
	//*   3    7:invokevirtual   #71  <Method List PackageManager.getInstalledPackages(int)>
	//*   4   10:invokeinterface #77  <Method Iterator List.iterator()>
	//*   5   15:astore_0        
	//*   6   16:aload_0         
	//*   7   17:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//*   8   22:ifeq            51
		{
			PackageInfo packageinfo = (PackageInfo)((Iterator) (context)).next();
	//    9   25:aload_0         
	//   10   26:invokeinterface #87  <Method Object Iterator.next()>
	//   11   31:checkcast       #89  <Class PackageInfo>
	//   12   34:astore_2        
			if(packageinfo.packageName.equals(((Object) (s))))
	//*  13   35:aload_2         
	//*  14   36:getfield        #93  <Field String PackageInfo.packageName>
	//*  15   39:aload_1         
	//*  16   40:invokevirtual   #97  <Method boolean String.equals(Object)>
	//*  17   43:ifeq            48
				return packageinfo;
	//   18   46:aload_2         
	//   19   47:areturn         
		}

	//*  20   48:goto            16
		return null;
	//   21   51:aconst_null     
	//   22   52:areturn         
	}

	public static String b()
	{
		Random random = new Random();
	//    0    0:new             #99  <Class Random>
	//    1    3:dup             
	//    2    4:invokespecial   #100 <Method void Random()>
	//    3    7:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #36  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #101 <Method void StringBuilder()>
	//    7   15:astore_2        
		for(int j = 0; j < 24; j++)
	//*   8   16:iconst_0        
	//*   9   17:istore_0        
	//*  10   18:iload_0         
	//*  11   19:bipush          24
	//*  12   21:icmpge          140
			switch(random.nextInt(3))
	//*  13   24:aload_1         
	//*  14   25:iconst_3        
	//*  15   26:invokevirtual   #105 <Method int Random.nextInt(int)>
			{
	//*  16   29:tableswitch     0 2: default 56
	//	               0 59
	//	               1 86
	//	               2 113
	//*  17   56:goto            133
			case 0: // '\0'
				stringbuilder.append(String.valueOf((char)(int)Math.round(Math.random() * 25D + 65D)));
	//   18   59:aload_2         
	//   19   60:invokestatic    #111 <Method double Math.random()>
	//   20   63:ldc2w           #112 <Double 25D>
	//   21   66:dmul            
	//   22   67:ldc2w           #114 <Double 65D>
	//   23   70:dadd            
	//   24   71:invokestatic    #119 <Method long Math.round(double)>
	//   25   74:l2i             
	//   26   75:int2char        
	//   27   76:invokestatic    #123 <Method String String.valueOf(char)>
	//   28   79:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   29   82:pop             
				break;

	//*  30   83:goto            133
			case 1: // '\001'
				stringbuilder.append(String.valueOf((char)(int)Math.round(Math.random() * 25D + 97D)));
	//   31   86:aload_2         
	//   32   87:invokestatic    #111 <Method double Math.random()>
	//   33   90:ldc2w           #112 <Double 25D>
	//   34   93:dmul            
	//   35   94:ldc2w           #124 <Double 97D>
	//   36   97:dadd            
	//   37   98:invokestatic    #119 <Method long Math.round(double)>
	//   38  101:l2i             
	//   39  102:int2char        
	//   40  103:invokestatic    #123 <Method String String.valueOf(char)>
	//   41  106:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   42  109:pop             
				break;

	//*  43  110:goto            133
			case 2: // '\002'
				stringbuilder.append(String.valueOf((new Random()).nextInt(10)));
	//   44  113:aload_2         
	//   45  114:new             #99  <Class Random>
	//   46  117:dup             
	//   47  118:invokespecial   #100 <Method void Random()>
	//   48  121:bipush          10
	//   49  123:invokevirtual   #105 <Method int Random.nextInt(int)>
	//   50  126:invokestatic    #128 <Method String String.valueOf(int)>
	//   51  129:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   52  132:pop             
				break;
			}

	//   53  133:iload_0         
	//   54  134:iconst_1        
	//   55  135:iadd            
	//   56  136:istore_0        
	//*  57  137:goto            18
		return stringbuilder.toString();
	//   58  140:aload_2         
	//   59  141:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   60  144:areturn         
	}

	public static boolean b(Context context)
	{
		int j;
		try
		{
			context = ((Context) (context.getPackageManager().getPackageInfo(c(), 128)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method PackageManager Context.getPackageManager()>
	//    2    4:invokestatic    #133 <Method String c()>
	//    3    7:sipush          128
	//    4   10:invokevirtual   #65  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    5   13:astore_0        
		}
	//*   6   14:aload_0         
	//*   7   15:ifnonnull       20
	//*   8   18:iconst_0        
	//*   9   19:ireturn         
	//*  10   20:aload_0         
	//*  11   21:getfield        #137 <Field int PackageInfo.versionCode>
	//*  12   24:istore_1        
	//*  13   25:iload_1         
	//*  14   26:bipush          99
	//*  15   28:icmpge          33
	//*  16   31:iconst_1        
	//*  17   32:ireturn         
	//*  18   33:iconst_0        
	//*  19   34:ireturn         
	//*  20   35:iconst_0        
	//*  21   36:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return false;
		}
		if(context == null)
			return false;
		j = ((PackageInfo) (context)).versionCode;
		return j < 99;
	//*  22   37:astore_0        
	//*  23   38:goto            35
	}

	private static boolean b(PackageInfo packageinfo)
	{
		String s = "";
	//    0    0:ldc1            #140 <String "">
	//    1    2:astore_2        
		boolean flag = false;
	//    2    3:iconst_0        
	//    3    4:istore_1        
		if(packageinfo == null)
	//*   4    5:aload_0         
	//*   5    6:ifnonnull       33
			packageinfo = ((PackageInfo) ((new StringBuilder()).append("").append("info == null").toString()));
	//    6    9:new             #36  <Class StringBuilder>
	//    7   12:dup             
	//    8   13:invokespecial   #101 <Method void StringBuilder()>
	//    9   16:ldc1            #140 <String "">
	//   10   18:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:ldc1            #142 <String "info == null">
	//   12   23:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   14   29:astore_0        
		else
	//*  15   30:goto            100
		if(packageinfo.signatures == null)
	//*  16   33:aload_0         
	//*  17   34:getfield        #146 <Field Signature[] PackageInfo.signatures>
	//*  18   37:ifnonnull       64
			packageinfo = ((PackageInfo) ((new StringBuilder()).append("").append("info.signatures == null").toString()));
	//   19   40:new             #36  <Class StringBuilder>
	//   20   43:dup             
	//   21   44:invokespecial   #101 <Method void StringBuilder()>
	//   22   47:ldc1            #140 <String "">
	//   23   49:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   24   52:ldc1            #148 <String "info.signatures == null">
	//   25   54:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   26   57:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   27   60:astore_0        
		else
	//*  28   61:goto            100
		if(packageinfo.signatures.length <= 0)
	//*  29   64:aload_0         
	//*  30   65:getfield        #146 <Field Signature[] PackageInfo.signatures>
	//*  31   68:arraylength     
	//*  32   69:ifgt            96
		{
			packageinfo = ((PackageInfo) ((new StringBuilder()).append("").append("info.signatures.length <= 0").toString()));
	//   33   72:new             #36  <Class StringBuilder>
	//   34   75:dup             
	//   35   76:invokespecial   #101 <Method void StringBuilder()>
	//   36   79:ldc1            #140 <String "">
	//   37   81:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   38   84:ldc1            #150 <String "info.signatures.length <= 0">
	//   39   86:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   40   89:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   41   92:astore_0        
		} else
	//*  42   93:goto            100
		{
			flag = true;
	//   43   96:iconst_1        
	//   44   97:istore_1        
			packageinfo = ((PackageInfo) (s));
	//   45   98:aload_2         
	//   46   99:astore_0        
		}
		if(!flag)
	//*  47  100:iload_1         
	//*  48  101:ifne            112
			ft.b("auth", "NotIncludeSignatures", ((String) (packageinfo)));
	//   49  104:ldc1            #152 <String "auth">
	//   50  106:ldc1            #154 <String "NotIncludeSignatures">
	//   51  108:aload_0         
	//   52  109:invokestatic    #159 <Method void ft.b(String, String, String)>
		return flag;
	//   53  112:iload_1         
	//   54  113:ireturn         
	}

	public static boolean b(WebView webview, String s, Activity activity)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #168 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(!s.toLowerCase().startsWith("alipays://platformapi/startApp?".toLowerCase()) && !s.toLowerCase().startsWith("intent://platformapi/startapp?".toLowerCase()))
			break MISSING_BLOCK_LABEL_100;
	//    5    9:aload_1         
	//    6   10:invokevirtual   #171 <Method String String.toLowerCase()>
	//    7   13:ldc1            #173 <String "alipays://platformapi/startApp?">
	//    8   15:invokevirtual   #171 <Method String String.toLowerCase()>
	//    9   18:invokevirtual   #177 <Method boolean String.startsWith(String)>
	//   10   21:ifne            39
	//   11   24:aload_1         
	//   12   25:invokevirtual   #171 <Method String String.toLowerCase()>
	//   13   28:ldc1            #179 <String "intent://platformapi/startapp?">
	//   14   30:invokevirtual   #171 <Method String String.toLowerCase()>
	//   15   33:invokevirtual   #177 <Method boolean String.startsWith(String)>
	//   16   36:ifeq            100
		webview = ((WebView) (d(((Context) (activity)))));
	//   17   39:aload_2         
	//   18   40:invokestatic    #183 <Method hr$a d(Context)>
	//   19   43:astore_0        
		if(webview == null)
			break MISSING_BLOCK_LABEL_59;
	//   20   44:aload_0         
	//   21   45:ifnull          59
		boolean flag = ((a) (webview)).b();
	//   22   48:aload_0         
	//   23   49:invokevirtual   #185 <Method boolean hr$a.b()>
	//   24   52:istore          5
		if(!flag)
			break MISSING_BLOCK_LABEL_61;
	//   25   54:iload           5
	//   26   56:ifeq            61
		return true;
	//   27   59:iconst_1        
	//   28   60:ireturn         
		webview = ((WebView) (s));
	//   29   61:aload_1         
	//   30   62:astore_0        
		int j;
		int l;
		String s1;
		try
		{
			if(s.startsWith("intent://platformapi/startapp"))
	//*  31   63:aload_1         
	//*  32   64:ldc1            #187 <String "intent://platformapi/startapp">
	//*  33   66:invokevirtual   #177 <Method boolean String.startsWith(String)>
	//*  34   69:ifeq            81
				webview = ((WebView) (s.replaceFirst("intent://platformapi/startapp\\?", "alipays://platformapi/startApp?")));
	//   35   72:aload_1         
	//   36   73:ldc1            #189 <String "intent://platformapi/startapp\\?">
	//   37   75:ldc1            #173 <String "alipays://platformapi/startApp?">
	//   38   77:invokevirtual   #193 <Method String String.replaceFirst(String, String)>
	//   39   80:astore_0        
			activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((String) (webview)))));
	//   40   81:aload_2         
	//   41   82:new             #195 <Class Intent>
	//   42   85:dup             
	//   43   86:ldc1            #197 <String "android.intent.action.VIEW">
	//   44   88:aload_0         
	//   45   89:invokestatic    #203 <Method Uri Uri.parse(String)>
	//   46   92:invokespecial   #206 <Method void Intent(String, Uri)>
	//   47   95:invokevirtual   #212 <Method void Activity.startActivity(Intent)>
		}
	//*  48   98:iconst_1        
	//*  49   99:ireturn         
	//*  50  100:aload_1         
	//*  51  101:ldc1            #214 <String "sdklite://h5quit">
	//*  52  103:invokestatic    #217 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//*  53  106:ifne            118
	//*  54  109:aload_1         
	//*  55  110:ldc1            #219 <String "http://m.alipay.com/?action=h5quit">
	//*  56  112:invokestatic    #217 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//*  57  115:ifeq            130
	//*  58  118:invokestatic    #222 <Method String fx.e()>
	//*  59  121:putstatic       #224 <Field String fx.d>
	//*  60  124:aload_2         
	//*  61  125:invokevirtual   #227 <Method void Activity.finish()>
	//*  62  128:iconst_1        
	//*  63  129:ireturn         
	//*  64  130:aload_1         
	//*  65  131:ldc1            #229 <String "sdklite://h5quit?result=">
	//*  66  133:invokevirtual   #177 <Method boolean String.startsWith(String)>
	//*  67  136:ifeq            431
	//*  68  139:aload_1         
	//*  69  140:aload_1         
	//*  70  141:ldc1            #229 <String "sdklite://h5quit?result=">
	//*  71  143:invokevirtual   #28  <Method int String.indexOf(String)>
	//*  72  146:bipush          24
	//*  73  148:iadd            
	//*  74  149:invokevirtual   #231 <Method String String.substring(int)>
	//*  75  152:astore_0        
	//*  76  153:aload_0         
	//*  77  154:aload_0         
	//*  78  155:ldc1            #233 <String "&end_code=">
	//*  79  157:invokevirtual   #236 <Method int String.lastIndexOf(String)>
	//*  80  160:bipush          10
	//*  81  162:iadd            
	//*  82  163:invokevirtual   #231 <Method String String.substring(int)>
	//*  83  166:invokestatic    #241 <Method int Integer.parseInt(String)>
	//*  84  169:istore_3        
	//*  85  170:iload_3         
	//*  86  171:getstatic       #246 <Field fv fv.d>
	//*  87  174:getfield        #249 <Field int fv.i>
	//*  88  177:icmpeq          190
	//*  89  180:iload_3         
	//*  90  181:getstatic       #252 <Field fv fv.g>
	//*  91  184:getfield        #249 <Field int fv.i>
	//*  92  187:icmpne          362
	//*  93  190:getstatic       #257 <Field boolean gj.a>
	//*  94  193:ifeq            314
	//*  95  196:new             #36  <Class StringBuilder>
	//*  96  199:dup             
	//*  97  200:invokespecial   #101 <Method void StringBuilder()>
	//*  98  203:astore_0        
	//*  99  204:aload_1         
	//* 100  205:invokestatic    #263 <Method String URLDecoder.decode(String)>
	//* 101  208:astore_1        
	//* 102  209:aload_1         
	//* 103  210:invokestatic    #263 <Method String URLDecoder.decode(String)>
	//* 104  213:astore          6
	//* 105  215:aload           6
	//* 106  217:aload           6
	//* 107  219:ldc1            #229 <String "sdklite://h5quit?result=">
	//* 108  221:invokevirtual   #28  <Method int String.indexOf(String)>
	//* 109  224:bipush          24
	//* 110  226:iadd            
	//* 111  227:aload           6
	//* 112  229:ldc1            #233 <String "&end_code=">
	//* 113  231:invokevirtual   #236 <Method int String.lastIndexOf(String)>
	//* 114  234:invokevirtual   #32  <Method String String.substring(int, int)>
	//* 115  237:ldc2            #265 <String "&return_url=">
	//* 116  240:invokevirtual   #269 <Method String[] String.split(String)>
	//* 117  243:iconst_0        
	//* 118  244:aaload          
	//* 119  245:astore          6
	//* 120  247:aload_1         
	//* 121  248:ldc2            #265 <String "&return_url=">
	//* 122  251:invokevirtual   #28  <Method int String.indexOf(String)>
	//* 123  254:bipush          12
	//* 124  256:iadd            
	//* 125  257:istore          4
	//* 126  259:aload_0         
	//* 127  260:aload           6
	//* 128  262:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//* 129  265:ldc2            #265 <String "&return_url=">
	//* 130  268:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//* 131  271:aload_1         
	//* 132  272:iload           4
	//* 133  274:aload_1         
	//* 134  275:ldc2            #271 <String "&">
	//* 135  278:iload           4
	//* 136  280:invokevirtual   #274 <Method int String.indexOf(String, int)>
	//* 137  283:invokevirtual   #32  <Method String String.substring(int, int)>
	//* 138  286:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//* 139  289:aload_1         
	//* 140  290:aload_1         
	//* 141  291:ldc2            #271 <String "&">
	//* 142  294:iload           4
	//* 143  296:invokevirtual   #274 <Method int String.indexOf(String, int)>
	//* 144  299:invokevirtual   #231 <Method String String.substring(int)>
	//* 145  302:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//* 146  305:pop             
	//* 147  306:aload_0         
	//* 148  307:invokevirtual   #48  <Method String StringBuilder.toString()>
	//* 149  310:astore_0        
	//* 150  311:goto            339
	//* 151  314:aload_1         
	//* 152  315:invokestatic    #263 <Method String URLDecoder.decode(String)>
	//* 153  318:astore_0        
	//* 154  319:aload_0         
	//* 155  320:aload_0         
	//* 156  321:ldc1            #229 <String "sdklite://h5quit?result=">
	//* 157  323:invokevirtual   #28  <Method int String.indexOf(String)>
	//* 158  326:bipush          24
	//* 159  328:iadd            
	//* 160  329:aload_0         
	//* 161  330:ldc1            #233 <String "&end_code=">
	//* 162  332:invokevirtual   #236 <Method int String.lastIndexOf(String)>
	//* 163  335:invokevirtual   #32  <Method String String.substring(int, int)>
	//* 164  338:astore_0        
	//* 165  339:iload_3         
	//* 166  340:invokestatic    #277 <Method fv fv.b(int)>
	//* 167  343:astore_1        
	//* 168  344:aload_1         
	//* 169  345:getfield        #249 <Field int fv.i>
	//* 170  348:aload_1         
	//* 171  349:getfield        #280 <Field String fv.k>
	//* 172  352:aload_0         
	//* 173  353:invokestatic    #283 <Method String fx.d(int, String, String)>
	//* 174  356:putstatic       #224 <Field String fx.d>
	//* 175  359:goto            417
	//* 176  362:getstatic       #285 <Field fv fv.c>
	//* 177  365:getfield        #249 <Field int fv.i>
	//* 178  368:invokestatic    #277 <Method fv fv.b(int)>
	//* 179  371:astore_0        
	//* 180  372:aload_0         
	//* 181  373:getfield        #249 <Field int fv.i>
	//* 182  376:aload_0         
	//* 183  377:getfield        #280 <Field String fv.k>
	//* 184  380:ldc1            #140 <String "">
	//* 185  382:invokestatic    #283 <Method String fx.d(int, String, String)>
	//* 186  385:putstatic       #224 <Field String fx.d>
	//* 187  388:goto            417
	//* 188  391:getstatic       #287 <Field fv fv.e>
	//* 189  394:getfield        #249 <Field int fv.i>
	//* 190  397:invokestatic    #277 <Method fv fv.b(int)>
	//* 191  400:astore_0        
	//* 192  401:aload_0         
	//* 193  402:getfield        #249 <Field int fv.i>
	//* 194  405:aload_0         
	//* 195  406:getfield        #280 <Field String fv.k>
	//* 196  409:ldc1            #140 <String "">
	//* 197  411:invokestatic    #283 <Method String fx.d(int, String, String)>
	//* 198  414:putstatic       #224 <Field String fx.d>
	//* 199  417:aload_2         
	//* 200  418:new             #289 <Class hx>
	//* 201  421:dup             
	//* 202  422:aload_2         
	//* 203  423:invokespecial   #292 <Method void hx(Activity)>
	//* 204  426:invokevirtual   #296 <Method void Activity.runOnUiThread(Runnable)>
	//* 205  429:iconst_1        
	//* 206  430:ireturn         
	//* 207  431:aload_0         
	//* 208  432:aload_1         
	//* 209  433:invokevirtual   #301 <Method void WebView.loadUrl(String)>
	//* 210  436:iconst_1        
	//* 211  437:ireturn         
		// Misplaced declaration of an exception variable
		catch(WebView webview) { }
	//  212  438:astore_0        
		return true;
		if(TextUtils.equals(((CharSequence) (s)), "sdklite://h5quit") || TextUtils.equals(((CharSequence) (s)), "http://m.alipay.com/?action=h5quit"))
		{
			fx.d = fx.e();
			activity.finish();
			return true;
		}
		if(!s.startsWith("sdklite://h5quit?result="))
			break MISSING_BLOCK_LABEL_431;
		webview = ((WebView) (s.substring(s.indexOf("sdklite://h5quit?result=") + 24)));
		j = Integer.parseInt(((String) (webview)).substring(((String) (webview)).lastIndexOf("&end_code=") + 10));
		if(j != fv.d.i && j != fv.g.i)
			break MISSING_BLOCK_LABEL_362;
		if(gj.a)
		{
			webview = ((WebView) (new StringBuilder()));
			s = URLDecoder.decode(s);
			s1 = URLDecoder.decode(s);
			s1 = s1.substring(s1.indexOf("sdklite://h5quit?result=") + 24, s1.lastIndexOf("&end_code=")).split("&return_url=")[0];
			l = s.indexOf("&return_url=") + 12;
			((StringBuilder) (webview)).append(s1).append("&return_url=").append(s.substring(l, s.indexOf("&", l))).append(s.substring(s.indexOf("&", l)));
			webview = ((WebView) (((StringBuilder) (webview)).toString()));
			break MISSING_BLOCK_LABEL_339;
		}
		webview = ((WebView) (URLDecoder.decode(s)));
		webview = ((WebView) (((String) (webview)).substring(((String) (webview)).indexOf("sdklite://h5quit?result=") + 24, ((String) (webview)).lastIndexOf("&end_code="))));
		s = ((String) (fv.b(j)));
		fx.d = fx.d(((fv) (s)).i, ((fv) (s)).k, ((String) (webview)));
		break MISSING_BLOCK_LABEL_417;
		try
		{
			webview = ((WebView) (fv.b(fv.c.i)));
			fx.d = fx.d(((fv) (webview)).i, ((fv) (webview)).k, "");
		}
	//* 213  439:goto            98
		// Misplaced declaration of an exception variable
		catch(WebView webview)
		{
			webview = ((WebView) (fv.b(fv.e.i)));
			fx.d = fx.d(((fv) (webview)).i, ((fv) (webview)).k, "");
		}
		activity.runOnUiThread(((Runnable) (new hx(activity))));
		return true;
		webview.loadUrl(s);
		return true;
	//* 214  442:astore_0        
	//* 215  443:goto            391
	}

	public static String c()
	{
		if(fn.b())
	//*   0    0:invokestatic    #304 <Method boolean fn.b()>
	//*   1    3:ifeq            10
			return "com.eg.android.AlipayGphoneRC";
	//    2    6:ldc2            #306 <String "com.eg.android.AlipayGphoneRC">
	//    3    9:areturn         
		else
			return "com.eg.android.AlipayGphone";
	//    4   10:ldc2            #308 <String "com.eg.android.AlipayGphone">
	//    5   13:areturn         
	}

	public static String c(Context context)
	{
		String s = d();
	//    0    0:invokestatic    #311 <Method String d()>
	//    1    3:astore_1        
		String s1 = a();
	//    2    4:invokestatic    #313 <Method String a()>
	//    3    7:astore_2        
		String s2 = i(context);
	//    4    8:aload_0         
	//    5    9:invokestatic    #315 <Method String i(Context)>
	//    6   12:astore_3        
		context = ((Context) (k(context)));
	//    7   13:aload_0         
	//    8   14:invokestatic    #317 <Method String k(Context)>
	//    9   17:astore_0        
		return (new StringBuilder(" (")).append(s).append(";").append(s1).append(";").append(s2).append(";;").append(((String) (context))).append(")(sdk android)").toString();
	//   10   18:new             #36  <Class StringBuilder>
	//   11   21:dup             
	//   12   22:ldc2            #319 <String " (">
	//   13   25:invokespecial   #41  <Method void StringBuilder(String)>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:ldc2            #321 <String ";">
	//   17   35:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   18   38:aload_2         
	//   19   39:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   20   42:ldc2            #321 <String ";">
	//   21   45:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   22   48:aload_3         
	//   23   49:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   24   52:ldc2            #323 <String ";;">
	//   25   55:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   26   58:aload_0         
	//   27   59:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   28   62:ldc2            #325 <String ")(sdk android)">
	//   29   65:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   30   68:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   31   71:areturn         
	}

	public static WebView d(Activity activity, String s, String s1)
	{
		Context context = activity.getApplicationContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #330 <Method Context Activity.getApplicationContext()>
	//    2    4:astore_3        
		if(!TextUtils.isEmpty(((CharSequence) (s1))))
	//*   3    5:aload_2         
	//*   4    6:invokestatic    #168 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5    9:ifne            33
		{
			CookieSyncManager.createInstance(context).sync();
	//    6   12:aload_3         
	//    7   13:invokestatic    #336 <Method CookieSyncManager CookieSyncManager.createInstance(Context)>
	//    8   16:invokevirtual   #339 <Method void CookieSyncManager.sync()>
			CookieManager.getInstance().setCookie(s, s1);
	//    9   19:invokestatic    #345 <Method CookieManager CookieManager.getInstance()>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #349 <Method void CookieManager.setCookie(String, String)>
			CookieSyncManager.getInstance().sync();
	//   13   27:invokestatic    #352 <Method CookieSyncManager CookieSyncManager.getInstance()>
	//   14   30:invokevirtual   #339 <Method void CookieSyncManager.sync()>
		}
		s1 = ((String) (new LinearLayout(context)));
	//   15   33:new             #354 <Class LinearLayout>
	//   16   36:dup             
	//   17   37:aload_3         
	//   18   38:invokespecial   #357 <Method void LinearLayout(Context)>
	//   19   41:astore_2        
		android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -1);
	//   20   42:new             #359 <Class android.widget.LinearLayout$LayoutParams>
	//   21   45:dup             
	//   22   46:iconst_m1       
	//   23   47:iconst_m1       
	//   24   48:invokespecial   #362 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//   25   51:astore          4
		((LinearLayout) (s1)).setOrientation(1);
	//   26   53:aload_2         
	//   27   54:iconst_1        
	//   28   55:invokevirtual   #366 <Method void LinearLayout.setOrientation(int)>
		activity.setContentView(((android.view.View) (s1)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   29   58:aload_0         
	//   30   59:aload_2         
	//   31   60:aload           4
	//   32   62:invokevirtual   #370 <Method void Activity.setContentView(android.view.View, android.view.ViewGroup$LayoutParams)>
		activity = ((Activity) (new WebView(context)));
	//   33   65:new             #298 <Class WebView>
	//   34   68:dup             
	//   35   69:aload_3         
	//   36   70:invokespecial   #371 <Method void WebView(Context)>
	//   37   73:astore_0        
		layoutparams.weight = 1.0F;
	//   38   74:aload           4
	//   39   76:fconst_1        
	//   40   77:putfield        #375 <Field float android.widget.LinearLayout$LayoutParams.weight>
		((WebView) (activity)).setVisibility(0);
	//   41   80:aload_0         
	//   42   81:iconst_0        
	//   43   82:invokevirtual   #378 <Method void WebView.setVisibility(int)>
		((LinearLayout) (s1)).addView(((android.view.View) (activity)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   44   85:aload_2         
	//   45   86:aload_0         
	//   46   87:aload           4
	//   47   89:invokevirtual   #381 <Method void LinearLayout.addView(android.view.View, android.view.ViewGroup$LayoutParams)>
		s1 = ((String) (((WebView) (activity)).getSettings()));
	//   48   92:aload_0         
	//   49   93:invokevirtual   #385 <Method WebSettings WebView.getSettings()>
	//   50   96:astore_2        
		((WebSettings) (s1)).setUserAgentString((new StringBuilder()).append(((WebSettings) (s1)).getUserAgentString()).append(c(context)).toString());
	//   51   97:aload_2         
	//   52   98:new             #36  <Class StringBuilder>
	//   53  101:dup             
	//   54  102:invokespecial   #101 <Method void StringBuilder()>
	//   55  105:aload_2         
	//   56  106:invokevirtual   #390 <Method String WebSettings.getUserAgentString()>
	//   57  109:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   58  112:aload_3         
	//   59  113:invokestatic    #392 <Method String c(Context)>
	//   60  116:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   61  119:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   62  122:invokevirtual   #395 <Method void WebSettings.setUserAgentString(String)>
		((WebSettings) (s1)).setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
	//   63  125:aload_2         
	//   64  126:getstatic       #401 <Field android.webkit.WebSettings$RenderPriority android.webkit.WebSettings$RenderPriority.HIGH>
	//   65  129:invokevirtual   #405 <Method void WebSettings.setRenderPriority(android.webkit.WebSettings$RenderPriority)>
		((WebSettings) (s1)).setSupportMultipleWindows(true);
	//   66  132:aload_2         
	//   67  133:iconst_1        
	//   68  134:invokevirtual   #409 <Method void WebSettings.setSupportMultipleWindows(boolean)>
		((WebSettings) (s1)).setJavaScriptEnabled(true);
	//   69  137:aload_2         
	//   70  138:iconst_1        
	//   71  139:invokevirtual   #412 <Method void WebSettings.setJavaScriptEnabled(boolean)>
		((WebSettings) (s1)).setSavePassword(false);
	//   72  142:aload_2         
	//   73  143:iconst_0        
	//   74  144:invokevirtual   #415 <Method void WebSettings.setSavePassword(boolean)>
		((WebSettings) (s1)).setJavaScriptCanOpenWindowsAutomatically(true);
	//   75  147:aload_2         
	//   76  148:iconst_1        
	//   77  149:invokevirtual   #418 <Method void WebSettings.setJavaScriptCanOpenWindowsAutomatically(boolean)>
		((WebSettings) (s1)).setMinimumFontSize(((WebSettings) (s1)).getMinimumFontSize() + 8);
	//   78  152:aload_2         
	//   79  153:aload_2         
	//   80  154:invokevirtual   #422 <Method int WebSettings.getMinimumFontSize()>
	//   81  157:bipush          8
	//   82  159:iadd            
	//   83  160:invokevirtual   #425 <Method void WebSettings.setMinimumFontSize(int)>
		((WebSettings) (s1)).setAllowFileAccess(false);
	//   84  163:aload_2         
	//   85  164:iconst_0        
	//   86  165:invokevirtual   #428 <Method void WebSettings.setAllowFileAccess(boolean)>
		((WebSettings) (s1)).setTextSize(android.webkit.WebSettings.TextSize.NORMAL);
	//   87  168:aload_2         
	//   88  169:getstatic       #434 <Field android.webkit.WebSettings$TextSize android.webkit.WebSettings$TextSize.NORMAL>
	//   89  172:invokevirtual   #438 <Method void WebSettings.setTextSize(android.webkit.WebSettings$TextSize)>
		((WebView) (activity)).setVerticalScrollbarOverlay(true);
	//   90  175:aload_0         
	//   91  176:iconst_1        
	//   92  177:invokevirtual   #441 <Method void WebView.setVerticalScrollbarOverlay(boolean)>
		((WebView) (activity)).setDownloadListener(((android.webkit.DownloadListener) (new hv(context))));
	//   93  180:aload_0         
	//   94  181:new             #443 <Class hv>
	//   95  184:dup             
	//   96  185:aload_3         
	//   97  186:invokespecial   #444 <Method void hv(Context)>
	//   98  189:invokevirtual   #448 <Method void WebView.setDownloadListener(android.webkit.DownloadListener)>
		if(android.os.Build.VERSION.SDK_INT < 7)
			break MISSING_BLOCK_LABEL_248;
	//   99  192:getstatic       #453 <Field int android.os.Build$VERSION.SDK_INT>
	//  100  195:bipush          7
	//  101  197:icmplt          248
		s1 = ((String) (((Object) (((WebView) (activity)).getSettings())).getClass().getMethod("setDomStorageEnabled", new Class[] {
			Boolean.TYPE
		})));
	//  102  200:aload_0         
	//  103  201:invokevirtual   #385 <Method WebSettings WebView.getSettings()>
	//  104  204:invokevirtual   #457 <Method Class Object.getClass()>
	//  105  207:ldc2            #459 <String "setDomStorageEnabled">
	//  106  210:iconst_1        
	//  107  211:anewarray       Class[]
	//  108  214:dup             
	//  109  215:iconst_0        
	//  110  216:getstatic       #467 <Field Class Boolean.TYPE>
	//  111  219:aastore         
	//  112  220:invokevirtual   #471 <Method Method Class.getMethod(String, Class[])>
	//  113  223:astore_2        
		if(s1 != null)
	//* 114  224:aload_2         
	//* 115  225:ifnull          248
			try
			{
				((Method) (s1)).invoke(((Object) (((WebView) (activity)).getSettings())), new Object[] {
					Boolean.valueOf(true)
				});
	//  116  228:aload_2         
	//  117  229:aload_0         
	//  118  230:invokevirtual   #385 <Method WebSettings WebView.getSettings()>
	//  119  233:iconst_1        
	//  120  234:anewarray       Object[]
	//  121  237:dup             
	//  122  238:iconst_0        
	//  123  239:iconst_1        
	//  124  240:invokestatic    #474 <Method Boolean Boolean.valueOf(boolean)>
	//  125  243:aastore         
	//  126  244:invokevirtual   #480 <Method Object Method.invoke(Object, Object[])>
	//  127  247:pop             
			}
	//* 128  248:aload_0         
	//* 129  249:ldc2            #482 <String "searchBoxJavaBridge_">
	//* 130  252:invokevirtual   #485 <Method void WebView.removeJavascriptInterface(String)>
	//* 131  255:aload_0         
	//* 132  256:ldc2            #487 <String "accessibility">
	//* 133  259:invokevirtual   #485 <Method void WebView.removeJavascriptInterface(String)>
	//* 134  262:aload_0         
	//* 135  263:ldc2            #489 <String "accessibilityTraversal">
	//* 136  266:invokevirtual   #485 <Method void WebView.removeJavascriptInterface(String)>
	//* 137  269:goto            339
	//* 138  272:aload_0         
	//* 139  273:invokevirtual   #457 <Method Class Object.getClass()>
	//* 140  276:ldc2            #490 <String "removeJavascriptInterface">
	//* 141  279:iconst_0        
	//* 142  280:anewarray       Class[]
	//* 143  283:invokevirtual   #471 <Method Method Class.getMethod(String, Class[])>
	//* 144  286:astore_2        
	//* 145  287:aload_2         
	//* 146  288:ifnull          339
	//* 147  291:aload_2         
	//* 148  292:aload_0         
	//* 149  293:iconst_1        
	//* 150  294:anewarray       Object[]
	//* 151  297:dup             
	//* 152  298:iconst_0        
	//* 153  299:ldc2            #482 <String "searchBoxJavaBridge_">
	//* 154  302:aastore         
	//* 155  303:invokevirtual   #480 <Method Object Method.invoke(Object, Object[])>
	//* 156  306:pop             
	//* 157  307:aload_2         
	//* 158  308:aload_0         
	//* 159  309:iconst_1        
	//* 160  310:anewarray       Object[]
	//* 161  313:dup             
	//* 162  314:iconst_0        
	//* 163  315:ldc2            #487 <String "accessibility">
	//* 164  318:aastore         
	//* 165  319:invokevirtual   #480 <Method Object Method.invoke(Object, Object[])>
	//* 166  322:pop             
	//* 167  323:aload_2         
	//* 168  324:aload_0         
	//* 169  325:iconst_1        
	//* 170  326:anewarray       Object[]
	//* 171  329:dup             
	//* 172  330:iconst_0        
	//* 173  331:ldc2            #489 <String "accessibilityTraversal">
	//* 174  334:aastore         
	//* 175  335:invokevirtual   #480 <Method Object Method.invoke(Object, Object[])>
	//* 176  338:pop             
	//* 177  339:getstatic       #453 <Field int android.os.Build$VERSION.SDK_INT>
	//* 178  342:bipush          19
	//* 179  344:icmplt          355
	//* 180  347:aload_0         
	//* 181  348:invokevirtual   #385 <Method WebSettings WebView.getSettings()>
	//* 182  351:iconst_2        
	//* 183  352:invokevirtual   #493 <Method void WebSettings.setCacheMode(int)>
	//* 184  355:aload_0         
	//* 185  356:aload_1         
	//* 186  357:invokevirtual   #301 <Method void WebView.loadUrl(String)>
	//* 187  360:aload_0         
	//* 188  361:areturn         
			// Misplaced declaration of an exception variable
			catch(String s1) { }
	//  189  362:astore_2        
		((WebView) (activity)).removeJavascriptInterface("searchBoxJavaBridge_");
		((WebView) (activity)).removeJavascriptInterface("accessibility");
		((WebView) (activity)).removeJavascriptInterface("accessibilityTraversal");
		  goto _L1
_L3:
		s1 = ((String) (((Object) (activity)).getClass().getMethod("removeJavascriptInterface", new Class[0])));
		if(s1 != null)
			try
			{
				((Method) (s1)).invoke(((Object) (activity)), new Object[] {
					"searchBoxJavaBridge_"
				});
				((Method) (s1)).invoke(((Object) (activity)), new Object[] {
					"accessibility"
				});
				((Method) (s1)).invoke(((Object) (activity)), new Object[] {
					"accessibilityTraversal"
				});
			}
	//* 190  363:goto            248
	//* 191  366:astore_2        
	//* 192  367:goto            272
			// Misplaced declaration of an exception variable
			catch(String s1) { }
	//  193  370:astore_2        
_L1:
		if(android.os.Build.VERSION.SDK_INT >= 19)
			((WebView) (activity)).getSettings().setCacheMode(2);
		((WebView) (activity)).loadUrl(s);
		return ((WebView) (activity));
		s1;
		if(true) goto _L3; else goto _L2
_L2:
	//* 194  371:goto            339
	}

	public static String d()
	{
		return (new StringBuilder("Android ")).append(android.os.Build.VERSION.RELEASE).toString();
	//    0    0:new             #36  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc2            #495 <String "Android ">
	//    3    7:invokespecial   #41  <Method void StringBuilder(String)>
	//    4   10:getstatic       #498 <Field String android.os.Build$VERSION.RELEASE>
	//    5   13:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//    6   16:invokevirtual   #48  <Method String StringBuilder.toString()>
	//    7   19:areturn         
	}

	public static a d(Context context)
	{
		return e(context, c());
	//    0    0:aload_0         
	//    1    1:invokestatic    #133 <Method String c()>
	//    2    4:invokestatic    #501 <Method hr$a e(Context, String)>
	//    3    7:areturn         
	}

	public static boolean d(String s)
	{
		return Pattern.compile("^http(s)?://([a-z0-9_\\-]+\\.)*(alipaydev|alipay|taobao)\\.(com|net)(:\\d+)?(/.*)?$").matcher(((CharSequence) (s))).matches();
	//    0    0:ldc2            #503 <String "^http(s)?://([a-z0-9_\\-]+\\.)*(alipaydev|alipay|taobao)\\.(com|net)(:\\d+)?(/.*)?$">
	//    1    3:invokestatic    #509 <Method Pattern Pattern.compile(String)>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #513 <Method Matcher Pattern.matcher(CharSequence)>
	//    4   10:invokevirtual   #518 <Method boolean Matcher.matches()>
	//    5   13:ireturn         
	}

	private static String e()
	{
		int j;
		boolean flag;
		Object obj;
		Object obj1;
		try
		{
			obj = ((Object) (new BufferedReader(((java.io.Reader) (new FileReader("/proc/version"))), 256)));
	//    0    0:new             #522 <Class BufferedReader>
	//    1    3:dup             
	//    2    4:new             #524 <Class FileReader>
	//    3    7:dup             
	//    4    8:ldc2            #526 <String "/proc/version">
	//    5   11:invokespecial   #527 <Method void FileReader(String)>
	//    6   14:sipush          256
	//    7   17:invokespecial   #530 <Method void BufferedReader(java.io.Reader, int)>
	//    8   20:astore_2        
		}
	//*   9   21:aload_2         
	//*  10   22:invokevirtual   #533 <Method String BufferedReader.readLine()>
	//*  11   25:astore_3        
	//*  12   26:aload_2         
	//*  13   27:invokevirtual   #536 <Method void BufferedReader.close()>
	//*  14   30:goto            40
	//*  15   33:astore_3        
	//*  16   34:aload_2         
	//*  17   35:invokevirtual   #536 <Method void BufferedReader.close()>
	//*  18   38:aload_3         
	//*  19   39:athrow          
	//*  20   40:ldc2            #538 <String "\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\((?:[^(]*\\([^)]*\\))?[^)]*\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)">
	//*  21   43:invokestatic    #509 <Method Pattern Pattern.compile(String)>
	//*  22   46:aload_3         
	//*  23   47:invokevirtual   #513 <Method Matcher Pattern.matcher(CharSequence)>
	//*  24   50:astore_2        
	//*  25   51:aload_2         
	//*  26   52:invokevirtual   #518 <Method boolean Matcher.matches()>
	//*  27   55:istore_1        
	//*  28   56:iload_1         
	//*  29   57:ifne            64
	//*  30   60:ldc2            #540 <String "Unavailable">
	//*  31   63:areturn         
	//*  32   64:aload_2         
	//*  33   65:invokevirtual   #543 <Method int Matcher.groupCount()>
	//*  34   68:istore_0        
	//*  35   69:iload_0         
	//*  36   70:iconst_4        
	//*  37   71:icmpge          78
	//*  38   74:ldc2            #540 <String "Unavailable">
	//*  39   77:areturn         
	//*  40   78:new             #36  <Class StringBuilder>
	//*  41   81:dup             
	//*  42   82:aload_2         
	//*  43   83:iconst_1        
	//*  44   84:invokevirtual   #546 <Method String Matcher.group(int)>
	//*  45   87:invokespecial   #41  <Method void StringBuilder(String)>
	//*  46   90:ldc1            #34  <String "\n">
	//*  47   92:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//*  48   95:aload_2         
	//*  49   96:iconst_2        
	//*  50   97:invokevirtual   #546 <Method String Matcher.group(int)>
	//*  51  100:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//*  52  103:ldc2            #548 <String " ">
	//*  53  106:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//*  54  109:aload_2         
	//*  55  110:iconst_3        
	//*  56  111:invokevirtual   #546 <Method String Matcher.group(int)>
	//*  57  114:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//*  58  117:ldc1            #34  <String "\n">
	//*  59  119:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//*  60  122:aload_2         
	//*  61  123:iconst_4        
	//*  62  124:invokevirtual   #546 <Method String Matcher.group(int)>
	//*  63  127:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//*  64  130:invokevirtual   #48  <Method String StringBuilder.toString()>
	//*  65  133:astore_2        
	//*  66  134:aload_2         
	//*  67  135:areturn         
	//*  68  136:ldc2            #540 <String "Unavailable">
	//*  69  139:areturn         
		// Misplaced declaration of an exception variable
		catch(IOException ioexception)
		{
			return "Unavailable";
		}
		obj1 = ((Object) (((BufferedReader) (obj)).readLine()));
		((BufferedReader) (obj)).close();
		break MISSING_BLOCK_LABEL_40;
		obj1;
		((BufferedReader) (obj)).close();
		throw obj1;
		obj = ((Object) (Pattern.compile("\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\((?:[^(]*\\([^)]*\\))?[^)]*\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)").matcher(((CharSequence) (obj1)))));
		flag = ((Matcher) (obj)).matches();
		if(!flag)
			return "Unavailable";
		j = ((Matcher) (obj)).groupCount();
		if(j < 4)
			return "Unavailable";
		obj = ((Object) ((new StringBuilder(((Matcher) (obj)).group(1))).append("\n").append(((Matcher) (obj)).group(2)).append(" ").append(((Matcher) (obj)).group(3)).append("\n").append(((Matcher) (obj)).group(4)).toString()));
		IOException ioexception;
		return ((String) (obj));
	//*  70  140:astore_2        
	//*  71  141:goto            136
	}

	public static String e(byte abyte0[])
	{
		abyte0 = ((byte []) (((Object) (((X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(((java.io.InputStream) (new ByteArrayInputStream(abyte0))))).getPublicKey())).toString()));
	//    0    0:ldc2            #551 <String "X.509">
	//    1    3:invokestatic    #556 <Method CertificateFactory CertificateFactory.getInstance(String)>
	//    2    6:new             #558 <Class ByteArrayInputStream>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:invokespecial   #561 <Method void ByteArrayInputStream(byte[])>
	//    6   14:invokevirtual   #565 <Method java.security.cert.Certificate CertificateFactory.generateCertificate(java.io.InputStream)>
	//    7   17:checkcast       #567 <Class X509Certificate>
	//    8   20:invokevirtual   #571 <Method java.security.PublicKey X509Certificate.getPublicKey()>
	//    9   23:invokevirtual   #572 <Method String Object.toString()>
	//   10   26:astore_0        
		if(((String) (abyte0)).indexOf("modulus") == -1)
			break MISSING_BLOCK_LABEL_78;
	//   11   27:aload_0         
	//   12   28:ldc2            #574 <String "modulus">
	//   13   31:invokevirtual   #28  <Method int String.indexOf(String)>
	//   14   34:iconst_m1       
	//   15   35:icmpeq          65
		abyte0 = ((byte []) (((String) (abyte0)).substring(((String) (abyte0)).indexOf("modulus") + 8, ((String) (abyte0)).lastIndexOf(",")).trim()));
	//   16   38:aload_0         
	//   17   39:aload_0         
	//   18   40:ldc2            #574 <String "modulus">
	//   19   43:invokevirtual   #28  <Method int String.indexOf(String)>
	//   20   46:bipush          8
	//   21   48:iadd            
	//   22   49:aload_0         
	//   23   50:ldc2            #576 <String ",">
	//   24   53:invokevirtual   #236 <Method int String.lastIndexOf(String)>
	//   25   56:invokevirtual   #32  <Method String String.substring(int, int)>
	//   26   59:invokevirtual   #579 <Method String String.trim()>
	//   27   62:astore_0        
		return ((String) (abyte0));
	//   28   63:aload_0         
	//   29   64:areturn         
	//*  30   65:goto            78
		abyte0;
	//   31   68:astore_0        
		ft.e("auth", "GetPublicKeyFromSignEx", ((Throwable) (abyte0)));
	//   32   69:ldc1            #152 <String "auth">
	//   33   71:ldc2            #581 <String "GetPublicKeyFromSignEx">
	//   34   74:aload_0         
	//   35   75:invokestatic    #584 <Method void ft.e(String, String, Throwable)>
		return null;
	//   36   78:aconst_null     
	//   37   79:areturn         
	}

	private static a e(Context context, String s)
	{
		PackageInfo packageinfo = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		Object obj = ((Object) (context.getPackageManager().getPackageInfo(s, 192)));
	//    2    2:aload_0         
	//    3    3:invokevirtual   #57  <Method PackageManager Context.getPackageManager()>
	//    4    6:aload_1         
	//    5    7:sipush          192
	//    6   10:invokevirtual   #65  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    7   13:astore_2        
		packageinfo = ((PackageInfo) (obj));
	//    8   14:aload_2         
	//    9   15:astore_3        
		obj = ((Object) (packageinfo));
	//   10   16:aload_3         
	//   11   17:astore_2        
		if(!b(packageinfo))
	//*  12   18:aload_3         
	//*  13   19:invokestatic    #586 <Method boolean b(PackageInfo)>
	//*  14   22:ifne            121
			try
			{
				obj = ((Object) (b(context, s)));
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:invokestatic    #588 <Method PackageInfo b(Context, String)>
	//   18   30:astore_2        
			}
	//*  19   31:goto            121
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  20   34:astore_0        
			{
				ft.e("auth", "GetInstalledPackagesEx", ((Throwable) (context)));
	//   21   35:ldc1            #152 <String "auth">
	//   22   37:ldc2            #590 <String "GetInstalledPackagesEx">
	//   23   40:aload_0         
	//   24   41:invokestatic    #584 <Method void ft.e(String, String, Throwable)>
				obj = ((Object) (packageinfo));
	//   25   44:aload_3         
	//   26   45:astore_2        
			}
		break MISSING_BLOCK_LABEL_121;
	//   27   46:goto            121
		obj;
	//   28   49:astore_2        
		ft.e("auth", "GetPackageInfoEx", ((Throwable) (obj)));
	//   29   50:ldc1            #152 <String "auth">
	//   30   52:ldc2            #592 <String "GetPackageInfoEx">
	//   31   55:aload_2         
	//   32   56:invokestatic    #584 <Method void ft.e(String, String, Throwable)>
		obj = ((Object) (packageinfo));
	//   33   59:aload_3         
	//   34   60:astore_2        
		if(!b(((PackageInfo) (null))))
	//*  35   61:aconst_null     
	//*  36   62:invokestatic    #586 <Method boolean b(PackageInfo)>
	//*  37   65:ifne            121
			try
			{
				obj = ((Object) (b(context, s)));
	//   38   68:aload_0         
	//   39   69:aload_1         
	//   40   70:invokestatic    #588 <Method PackageInfo b(Context, String)>
	//   41   73:astore_2        
			}
	//*  42   74:goto            121
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  43   77:astore_0        
			{
				ft.e("auth", "GetInstalledPackagesEx", ((Throwable) (context)));
	//   44   78:ldc1            #152 <String "auth">
	//   45   80:ldc2            #590 <String "GetInstalledPackagesEx">
	//   46   83:aload_0         
	//   47   84:invokestatic    #584 <Method void ft.e(String, String, Throwable)>
				obj = ((Object) (packageinfo));
	//   48   87:aload_3         
	//   49   88:astore_2        
			}
		break MISSING_BLOCK_LABEL_121;
	//   50   89:goto            121
		obj;
	//   51   92:astore_2        
		if(!b(((PackageInfo) (null))))
	//*  52   93:aconst_null     
	//*  53   94:invokestatic    #586 <Method boolean b(PackageInfo)>
	//*  54   97:ifne            119
			try
			{
				b(context, s);
	//   55  100:aload_0         
	//   56  101:aload_1         
	//   57  102:invokestatic    #588 <Method PackageInfo b(Context, String)>
	//   58  105:pop             
			}
	//*  59  106:goto            119
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  60  109:astore_0        
			{
				ft.e("auth", "GetInstalledPackagesEx", ((Throwable) (context)));
	//   61  110:ldc1            #152 <String "auth">
	//   62  112:ldc2            #590 <String "GetInstalledPackagesEx">
	//   63  115:aload_0         
	//   64  116:invokestatic    #584 <Method void ft.e(String, String, Throwable)>
			}
		throw obj;
	//   65  119:aload_2         
	//   66  120:athrow          
		if(!b(((PackageInfo) (obj))))
	//*  67  121:aload_2         
	//*  68  122:invokestatic    #586 <Method boolean b(PackageInfo)>
	//*  69  125:ifne            130
			return null;
	//   70  128:aconst_null     
	//   71  129:areturn         
		if(obj == null)
	//*  72  130:aload_2         
	//*  73  131:ifnonnull       136
		{
			return null;
	//   74  134:aconst_null     
	//   75  135:areturn         
		} else
		{
			context = ((Context) (new a()));
	//   76  136:new             #6   <Class hr$a>
	//   77  139:dup             
	//   78  140:invokespecial   #593 <Method void hr$a()>
	//   79  143:astore_0        
			context.e = ((PackageInfo) (obj)).signatures;
	//   80  144:aload_0         
	//   81  145:aload_2         
	//   82  146:getfield        #146 <Field Signature[] PackageInfo.signatures>
	//   83  149:putfield        #595 <Field Signature[] hr$a.e>
			context.d = ((PackageInfo) (obj)).versionCode;
	//   84  152:aload_0         
	//   85  153:aload_2         
	//   86  154:getfield        #137 <Field int PackageInfo.versionCode>
	//   87  157:putfield        #597 <Field int hr$a.d>
			return ((a) (context));
	//   88  160:aload_0         
	//   89  161:areturn         
		}
	}

	public static boolean e(Context context)
	{
		int j;
		try
		{
			String s = c();
	//    0    0:invokestatic    #133 <Method String c()>
	//    1    3:astore_2        
			context = ((Context) (context.getPackageManager().getPackageInfo(s, 128)));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #57  <Method PackageManager Context.getPackageManager()>
	//    4    8:aload_2         
	//    5    9:sipush          128
	//    6   12:invokevirtual   #65  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    7   15:astore_0        
		}
	//*   8   16:aload_0         
	//*   9   17:ifnonnull       22
	//*  10   20:iconst_0        
	//*  11   21:ireturn         
	//*  12   22:aload_0         
	//*  13   23:getfield        #137 <Field int PackageInfo.versionCode>
	//*  14   26:istore_1        
	//*  15   27:iload_1         
	//*  16   28:bipush          73
	//*  17   30:icmpgt          35
	//*  18   33:iconst_0        
	//*  19   34:ireturn         
	//*  20   35:goto            51
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  21   38:astore_0        
		{
			ft.e("biz", "CheckClientExistEx", ((Throwable) (context)));
	//   22   39:ldc2            #599 <String "biz">
	//   23   42:ldc2            #601 <String "CheckClientExistEx">
	//   24   45:aload_0         
	//   25   46:invokestatic    #584 <Method void ft.e(String, String, Throwable)>
			return false;
	//   26   49:iconst_0        
	//   27   50:ireturn         
		}
		if(context == null)
			return false;
		j = ((PackageInfo) (context)).versionCode;
		return j > 73;
	//   28   51:iconst_1        
	//   29   52:ireturn         
	}

	public static String g(Context context)
	{
		Object obj = "";
	//    0    0:ldc1            #140 <String "">
	//    1    2:astore_1        
		Iterator iterator = ((ActivityManager)context.getApplicationContext().getSystemService("activity")).getRunningAppProcesses().iterator();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #602 <Method Context Context.getApplicationContext()>
	//    4    7:ldc2            #604 <String "activity">
	//    5   10:invokevirtual   #608 <Method Object Context.getSystemService(String)>
	//    6   13:checkcast       #610 <Class ActivityManager>
	//    7   16:invokevirtual   #614 <Method List ActivityManager.getRunningAppProcesses()>
	//    8   19:invokeinterface #77  <Method Iterator List.iterator()>
	//    9   24:astore_2        
		context = ((Context) (obj));
	//   10   25:aload_1         
	//   11   26:astore_0        
_L2:
		android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//   12   27:aload_2         
	//   13   28:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//   14   33:ifeq            177
		runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)iterator.next();
	//   15   36:aload_2         
	//   16   37:invokeinterface #87  <Method Object Iterator.next()>
	//   17   42:checkcast       #616 <Class android.app.ActivityManager$RunningAppProcessInfo>
	//   18   45:astore_3        
		if(runningappprocessinfo.processName.equals(((Object) (c()))))
	//*  19   46:aload_3         
	//*  20   47:getfield        #619 <Field String android.app.ActivityManager$RunningAppProcessInfo.processName>
	//*  21   50:invokestatic    #133 <Method String c()>
	//*  22   53:invokevirtual   #97  <Method boolean String.equals(Object)>
	//*  23   56:ifeq            83
		{
			context = ((Context) ((new StringBuilder()).append(((String) (context))).append("#M").toString()));
	//   24   59:new             #36  <Class StringBuilder>
	//   25   62:dup             
	//   26   63:invokespecial   #101 <Method void StringBuilder()>
	//   27   66:aload_0         
	//   28   67:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   29   70:ldc2            #621 <String "#M">
	//   30   73:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   31   76:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   32   79:astore_0        
			continue; /* Loop/switch isn't completed */
	//   33   80:goto            27
		}
		obj = ((Object) (context));
	//   34   83:aload_0         
	//   35   84:astore_1        
		if(runningappprocessinfo.processName.startsWith((new StringBuilder()).append(c()).append(":").toString()))
	//*  36   85:aload_3         
	//*  37   86:getfield        #619 <Field String android.app.ActivityManager$RunningAppProcessInfo.processName>
	//*  38   89:new             #36  <Class StringBuilder>
	//*  39   92:dup             
	//*  40   93:invokespecial   #101 <Method void StringBuilder()>
	//*  41   96:invokestatic    #133 <Method String c()>
	//*  42   99:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//*  43  102:ldc2            #623 <String ":">
	//*  44  105:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//*  45  108:invokevirtual   #48  <Method String StringBuilder.toString()>
	//*  46  111:invokevirtual   #177 <Method boolean String.startsWith(String)>
	//*  47  114:ifeq            172
			obj = ((Object) ((new StringBuilder()).append(((String) (context))).append("#").append(runningappprocessinfo.processName.replace(((CharSequence) ((new StringBuilder()).append(c()).append(":").toString())), "")).toString()));
	//   48  117:new             #36  <Class StringBuilder>
	//   49  120:dup             
	//   50  121:invokespecial   #101 <Method void StringBuilder()>
	//   51  124:aload_0         
	//   52  125:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   53  128:ldc2            #625 <String "#">
	//   54  131:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   55  134:aload_3         
	//   56  135:getfield        #619 <Field String android.app.ActivityManager$RunningAppProcessInfo.processName>
	//   57  138:new             #36  <Class StringBuilder>
	//   58  141:dup             
	//   59  142:invokespecial   #101 <Method void StringBuilder()>
	//   60  145:invokestatic    #133 <Method String c()>
	//   61  148:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   62  151:ldc2            #623 <String ":">
	//   63  154:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   64  157:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   65  160:ldc1            #140 <String "">
	//   66  162:invokevirtual   #629 <Method String String.replace(CharSequence, CharSequence)>
	//   67  165:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   68  168:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   69  171:astore_1        
		context = ((Context) (obj));
	//   70  172:aload_1         
	//   71  173:astore_0        
		if(true) goto _L2; else goto _L1
	//   72  174:goto            27
_L1:
		obj = ((Object) (context));
	//   73  177:aload_0         
	//   74  178:astore_1        
		  goto _L3
	//*  75  179:goto            185
_L5:
		obj = "";
	//   76  182:ldc1            #140 <String "">
	//   77  184:astore_1        
_L3:
		context = ((Context) (obj));
	//   78  185:aload_1         
	//   79  186:astore_0        
		if(((String) (obj)).length() > 0)
	//*  80  187:aload_1         
	//*  81  188:invokevirtual   #632 <Method int String.length()>
	//*  82  191:ifle            200
			context = ((Context) (((String) (obj)).substring(1)));
	//   83  194:aload_1         
	//   84  195:iconst_1        
	//   85  196:invokevirtual   #231 <Method String String.substring(int)>
	//   86  199:astore_0        
		obj = ((Object) (context));
	//   87  200:aload_0         
	//   88  201:astore_1        
		if(((String) (context)).length() == 0)
	//*  89  202:aload_0         
	//*  90  203:invokevirtual   #632 <Method int String.length()>
	//*  91  206:ifne            213
			obj = "N";
	//   92  209:ldc2            #634 <String "N">
	//   93  212:astore_1        
		return ((String) (obj));
	//   94  213:aload_1         
	//   95  214:areturn         
		context;
	//   96  215:astore_0        
		if(true) goto _L5; else goto _L4
_L4:
	//*  97  216:goto            182
	}

	public static String h(Context context)
	{
		int j;
		int l;
		StringBuilder stringbuilder;
		PackageInfo packageinfo;
		try
		{
			context = ((Context) (context.getPackageManager().getInstalledPackages(0)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method PackageManager Context.getPackageManager()>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #71  <Method List PackageManager.getInstalledPackages(int)>
	//    4    8:astore_0        
			stringbuilder = new StringBuilder();
	//    5    9:new             #36  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #101 <Method void StringBuilder()>
	//    8   16:astore_3        
		}
	//*   9   17:iconst_0        
	//*  10   18:istore_1        
	//*  11   19:iload_1         
	//*  12   20:aload_0         
	//*  13   21:invokeinterface #638 <Method int List.size()>
	//*  14   26:icmpge          173
	//*  15   29:aload_0         
	//*  16   30:iload_1         
	//*  17   31:invokeinterface #642 <Method Object List.get(int)>
	//*  18   36:checkcast       #89  <Class PackageInfo>
	//*  19   39:astore          4
	//*  20   41:aload           4
	//*  21   43:getfield        #646 <Field ApplicationInfo PackageInfo.applicationInfo>
	//*  22   46:getfield        #651 <Field int ApplicationInfo.flags>
	//*  23   49:istore_2        
	//*  24   50:iload_2         
	//*  25   51:iconst_1        
	//*  26   52:iand            
	//*  27   53:ifne            194
	//*  28   56:iload_2         
	//*  29   57:sipush          128
	//*  30   60:iand            
	//*  31   61:ifne            194
	//*  32   64:iconst_1        
	//*  33   65:istore_2        
	//*  34   66:goto            69
	//*  35   69:iload_2         
	//*  36   70:ifeq            199
	//*  37   73:aload           4
	//*  38   75:getfield        #93  <Field String PackageInfo.packageName>
	//*  39   78:invokestatic    #133 <Method String c()>
	//*  40   81:invokevirtual   #97  <Method boolean String.equals(Object)>
	//*  41   84:ifeq            113
	//*  42   87:aload_3         
	//*  43   88:aload           4
	//*  44   90:getfield        #93  <Field String PackageInfo.packageName>
	//*  45   93:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//*  46   96:aload           4
	//*  47   98:getfield        #137 <Field int PackageInfo.versionCode>
	//*  48  101:invokevirtual   #654 <Method StringBuilder StringBuilder.append(int)>
	//*  49  104:ldc1            #22  <String "-">
	//*  50  106:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//*  51  109:pop             
	//*  52  110:goto            199
	//*  53  113:aload           4
	//*  54  115:getfield        #93  <Field String PackageInfo.packageName>
	//*  55  118:ldc2            #656 <String "theme">
	//*  56  121:invokevirtual   #659 <Method boolean String.contains(CharSequence)>
	//*  57  124:ifne            199
	//*  58  127:aload           4
	//*  59  129:getfield        #93  <Field String PackageInfo.packageName>
	//*  60  132:ldc2            #661 <String "com.google.">
	//*  61  135:invokevirtual   #177 <Method boolean String.startsWith(String)>
	//*  62  138:ifne            199
	//*  63  141:aload           4
	//*  64  143:getfield        #93  <Field String PackageInfo.packageName>
	//*  65  146:ldc2            #663 <String "com.android.">
	//*  66  149:invokevirtual   #177 <Method boolean String.startsWith(String)>
	//*  67  152:ifne            199
	//*  68  155:aload_3         
	//*  69  156:aload           4
	//*  70  158:getfield        #93  <Field String PackageInfo.packageName>
	//*  71  161:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//*  72  164:ldc1            #22  <String "-">
	//*  73  166:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//*  74  169:pop             
	//*  75  170:goto            199
	//*  76  173:aload_3         
	//*  77  174:invokevirtual   #48  <Method String StringBuilder.toString()>
	//*  78  177:astore_0        
	//*  79  178:aload_0         
	//*  80  179:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  81  180:astore_0        
		{
			ft.e("biz", "GetInstalledAppEx", ((Throwable) (context)));
	//   82  181:ldc2            #599 <String "biz">
	//   83  184:ldc2            #665 <String "GetInstalledAppEx">
	//   84  187:aload_0         
	//   85  188:invokestatic    #584 <Method void ft.e(String, String, Throwable)>
			return "";
	//   86  191:ldc1            #140 <String "">
	//   87  193:areturn         
		}
		j = 0;
_L2:
		if(j >= ((List) (context)).size())
			break MISSING_BLOCK_LABEL_173;
		packageinfo = (PackageInfo)((List) (context)).get(j);
		l = packageinfo.applicationInfo.flags;
		boolean flag;
		if((l & 1) == 0 && (l & 0x80) == 0)
			flag = true;
		else
			flag = false;
	//   88  194:iconst_0        
	//   89  195:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_199;
		if(packageinfo.packageName.equals(((Object) (c()))))
		{
			stringbuilder.append(packageinfo.packageName).append(packageinfo.versionCode).append("-");
			break MISSING_BLOCK_LABEL_199;
		}
		if(!packageinfo.packageName.contains("theme") && !packageinfo.packageName.startsWith("com.google.") && !packageinfo.packageName.startsWith("com.android."))
			stringbuilder.append(packageinfo.packageName).append("-");
		break MISSING_BLOCK_LABEL_199;
		context = ((Context) (stringbuilder.toString()));
		return ((String) (context));
	//*  90  196:goto            69
		j++;
	//   91  199:iload_1         
	//   92  200:iconst_1        
	//   93  201:iadd            
	//   94  202:istore_1        
		if(true) goto _L2; else goto _L1
	//   95  203:goto            19
_L1:
	}

	public static String i(Context context)
	{
		return context.getResources().getConfiguration().locale.toString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #669 <Method Resources Context.getResources()>
	//    2    4:invokevirtual   #675 <Method Configuration Resources.getConfiguration()>
	//    3    7:getfield        #681 <Field Locale Configuration.locale>
	//    4   10:invokevirtual   #684 <Method String Locale.toString()>
	//    5   13:areturn         
	}

	public static String k(Context context)
	{
		DisplayMetrics displaymetrics = new DisplayMetrics();
	//    0    0:new             #686 <Class DisplayMetrics>
	//    1    3:dup             
	//    2    4:invokespecial   #687 <Method void DisplayMetrics()>
	//    3    7:astore_1        
		((WindowManager)context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
	//    4    8:aload_0         
	//    5    9:invokevirtual   #602 <Method Context Context.getApplicationContext()>
	//    6   12:ldc2            #689 <String "window">
	//    7   15:invokevirtual   #608 <Method Object Context.getSystemService(String)>
	//    8   18:checkcast       #691 <Class WindowManager>
	//    9   21:invokeinterface #695 <Method Display WindowManager.getDefaultDisplay()>
	//   10   26:aload_1         
	//   11   27:invokevirtual   #701 <Method void Display.getMetrics(DisplayMetrics)>
		context = ((Context) (new StringBuilder()));
	//   12   30:new             #36  <Class StringBuilder>
	//   13   33:dup             
	//   14   34:invokespecial   #101 <Method void StringBuilder()>
	//   15   37:astore_0        
		((StringBuilder) (context)).append(displaymetrics.widthPixels);
	//   16   38:aload_0         
	//   17   39:aload_1         
	//   18   40:getfield        #704 <Field int DisplayMetrics.widthPixels>
	//   19   43:invokevirtual   #654 <Method StringBuilder StringBuilder.append(int)>
	//   20   46:pop             
		((StringBuilder) (context)).append("*");
	//   21   47:aload_0         
	//   22   48:ldc2            #706 <String "*">
	//   23   51:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   24   54:pop             
		((StringBuilder) (context)).append(displaymetrics.heightPixels);
	//   25   55:aload_0         
	//   26   56:aload_1         
	//   27   57:getfield        #709 <Field int DisplayMetrics.heightPixels>
	//   28   60:invokevirtual   #654 <Method StringBuilder StringBuilder.append(int)>
	//   29   63:pop             
		return ((StringBuilder) (context)).toString();
	//   30   64:aload_0         
	//   31   65:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   32   68:areturn         
	}
}
