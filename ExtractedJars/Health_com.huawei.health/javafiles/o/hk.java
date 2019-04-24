// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;

// Referenced classes of package o:
//			hq

public final class hk
{

	private hk(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		String s1;
		TelephonyManager telephonymanager = (TelephonyManager)context.getApplicationContext().getSystemService("phone");
	//    2    4:aload_1         
	//    3    5:invokevirtual   #27  <Method Context Context.getApplicationContext()>
	//    4    8:ldc1            #29  <String "phone">
	//    5   10:invokevirtual   #33  <Method Object Context.getSystemService(String)>
	//    6   13:checkcast       #35  <Class TelephonyManager>
	//    7   16:astore_2        
		b(telephonymanager.getDeviceId());
	//    8   17:aload_0         
	//    9   18:aload_2         
	//   10   19:invokevirtual   #39  <Method String TelephonyManager.getDeviceId()>
	//   11   22:invokespecial   #42  <Method void b(String)>
		s1 = telephonymanager.getSubscriberId();
	//   12   25:aload_2         
	//   13   26:invokevirtual   #45  <Method String TelephonyManager.getSubscriberId()>
	//   14   29:astore_3        
		String s;
		s = s1;
	//   15   30:aload_3         
	//   16   31:astore_2        
		if(s1 == null)
			break MISSING_BLOCK_LABEL_62;
	//   17   32:aload_3         
	//   18   33:ifnull          62
		s = (new StringBuilder()).append(s1).append("000000000000000").toString().substring(0, 15);
	//   19   36:new             #47  <Class StringBuilder>
	//   20   39:dup             
	//   21   40:invokespecial   #48  <Method void StringBuilder()>
	//   22   43:aload_3         
	//   23   44:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   24   47:ldc1            #54  <String "000000000000000">
	//   25   49:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   26   52:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   27   55:iconst_0        
	//   28   56:bipush          15
	//   29   58:invokevirtual   #63  <Method String String.substring(int, int)>
	//   30   61:astore_2        
		b = s;
	//   31   62:aload_0         
	//   32   63:aload_2         
	//   33   64:putfield        #65  <Field String b>
		a = ((WifiManager)context.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getMacAddress();
	//   34   67:aload_0         
	//   35   68:aload_1         
	//   36   69:invokevirtual   #27  <Method Context Context.getApplicationContext()>
	//   37   72:ldc1            #67  <String "wifi">
	//   38   74:invokevirtual   #33  <Method Object Context.getSystemService(String)>
	//   39   77:checkcast       #69  <Class WifiManager>
	//   40   80:invokevirtual   #73  <Method WifiInfo WifiManager.getConnectionInfo()>
	//   41   83:invokevirtual   #78  <Method String WifiInfo.getMacAddress()>
	//   42   86:putfield        #80  <Field String a>
		if(TextUtils.isEmpty(((CharSequence) (a))))
	//*  43   89:aload_0         
	//*  44   90:getfield        #80  <Field String a>
	//*  45   93:invokestatic    #86  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  46   96:ifeq            147
		{
			a = "00:00:00:00:00:00";
	//   47   99:aload_0         
	//   48  100:ldc1            #88  <String "00:00:00:00:00:00">
	//   49  102:putfield        #80  <Field String a>
			return;
	//   50  105:return          
		}
		break MISSING_BLOCK_LABEL_147;
		context;
	//   51  106:astore_1        
		((Exception) (context)).printStackTrace();
	//   52  107:aload_1         
	//   53  108:invokevirtual   #91  <Method void Exception.printStackTrace()>
		if(TextUtils.isEmpty(((CharSequence) (a))))
	//*  54  111:aload_0         
	//*  55  112:getfield        #80  <Field String a>
	//*  56  115:invokestatic    #86  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  57  118:ifeq            147
		{
			a = "00:00:00:00:00:00";
	//   58  121:aload_0         
	//   59  122:ldc1            #88  <String "00:00:00:00:00:00">
	//   60  124:putfield        #80  <Field String a>
			return;
	//   61  127:return          
		}
		break MISSING_BLOCK_LABEL_147;
		context;
	//   62  128:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (a))))
	//*  63  129:aload_0         
	//*  64  130:getfield        #80  <Field String a>
	//*  65  133:invokestatic    #86  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  66  136:ifeq            145
			a = "00:00:00:00:00:00";
	//   67  139:aload_0         
	//   68  140:ldc1            #88  <String "00:00:00:00:00:00">
	//   69  142:putfield        #80  <Field String a>
		throw context;
	//   70  145:aload_1         
	//   71  146:athrow          
	//   72  147:return          
	}

	public static String a(Context context)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
			return "";
	//    2    4:ldc1            #96  <String "">
	//    3    6:areturn         
		try
		{
			context = ((Context) (context.getResources().getConfiguration().locale.toString()));
	//    4    7:aload_0         
	//    5    8:invokevirtual   #100 <Method Resources Context.getResources()>
	//    6   11:invokevirtual   #106 <Method Configuration Resources.getConfiguration()>
	//    7   14:getfield        #112 <Field Locale Configuration.locale>
	//    8   17:invokevirtual   #115 <Method String Locale.toString()>
	//    9   20:astore_0        
		}
	//*  10   21:aload_0         
	//*  11   22:areturn         
	//*  12   23:ldc1            #96  <String "">
	//*  13   25:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return "";
		}
		return ((String) (context));
	//*  14   26:astore_0        
	//*  15   27:goto            23
	}

	public static hq b(Context context)
	{
		context = ((Context) ((ConnectivityManager)context.getApplicationContext().getSystemService("connectivity")));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method Context Context.getApplicationContext()>
	//    2    4:ldc1            #118 <String "connectivity">
	//    3    6:invokevirtual   #33  <Method Object Context.getSystemService(String)>
	//    4    9:checkcast       #120 <Class ConnectivityManager>
	//    5   12:astore_0        
		try
		{
			context = ((Context) (((ConnectivityManager) (context)).getActiveNetworkInfo()));
	//    6   13:aload_0         
	//    7   14:invokevirtual   #124 <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//    8   17:astore_0        
		}
	//*   9   18:aload_0         
	//*  10   19:ifnull          39
	//*  11   22:aload_0         
	//*  12   23:invokevirtual   #130 <Method int NetworkInfo.getType()>
	//*  13   26:ifne            39
	//*  14   29:aload_0         
	//*  15   30:invokevirtual   #133 <Method int NetworkInfo.getSubtype()>
	//*  16   33:invokestatic    #138 <Method hq hq.a(int)>
	//*  17   36:astore_0        
	//*  18   37:aload_0         
	//*  19   38:areturn         
	//*  20   39:aload_0         
	//*  21   40:ifnull          57
	//*  22   43:aload_0         
	//*  23   44:invokevirtual   #130 <Method int NetworkInfo.getType()>
	//*  24   47:iconst_1        
	//*  25   48:icmpne          57
	//*  26   51:getstatic       #141 <Field hq hq.d>
	//*  27   54:astore_0        
	//*  28   55:aload_0         
	//*  29   56:areturn         
	//*  30   57:getstatic       #144 <Field hq hq.n>
	//*  31   60:astore_0        
	//*  32   61:aload_0         
	//*  33   62:areturn         
	//*  34   63:getstatic       #144 <Field hq hq.n>
	//*  35   66:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return hq.n;
		}
		if(context == null)
			break MISSING_BLOCK_LABEL_39;
		if(((NetworkInfo) (context)).getType() != 0)
			break MISSING_BLOCK_LABEL_39;
		context = ((Context) (hq.a(((NetworkInfo) (context)).getSubtype())));
		return ((hq) (context));
		if(context == null)
			break MISSING_BLOCK_LABEL_57;
		if(((NetworkInfo) (context)).getType() != 1)
			break MISSING_BLOCK_LABEL_57;
		context = ((Context) (hq.d));
		return ((hq) (context));
		context = ((Context) (hq.n));
		return ((hq) (context));
	//*  36   67:astore_0        
	//*  37   68:goto            63
	}

	private void b(String s)
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(s != null)
	//*   2    2:aload_1         
	//*   3    3:ifnull          82
		{
			s = ((String) (s.getBytes()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #148 <Method byte[] String.getBytes()>
	//    6   10:astore_1        
			for(int i = 0; i < s.length; i++)
	//*   7   11:iconst_0        
	//*   8   12:istore_2        
	//*   9   13:iload_2         
	//*  10   14:aload_1         
	//*  11   15:arraylength     
	//*  12   16:icmpge          47
				if(s[i] < 48 || s[i] > 57)
	//*  13   19:aload_1         
	//*  14   20:iload_2         
	//*  15   21:baload          
	//*  16   22:bipush          48
	//*  17   24:icmplt          35
	//*  18   27:aload_1         
	//*  19   28:iload_2         
	//*  20   29:baload          
	//*  21   30:bipush          57
	//*  22   32:icmple          40
					s[i] = 48;
	//   23   35:aload_1         
	//   24   36:iload_2         
	//   25   37:bipush          48
	//   26   39:bastore         

	//   27   40:iload_2         
	//   28   41:iconst_1        
	//   29   42:iadd            
	//   30   43:istore_2        
	//*  31   44:goto            13
			s = new String(((byte []) (s)));
	//   32   47:new             #59  <Class String>
	//   33   50:dup             
	//   34   51:aload_1         
	//   35   52:invokespecial   #151 <Method void String(byte[])>
	//   36   55:astore_1        
			s1 = (new StringBuilder()).append(s).append("000000000000000").toString().substring(0, 15);
	//   37   56:new             #47  <Class StringBuilder>
	//   38   59:dup             
	//   39   60:invokespecial   #48  <Method void StringBuilder()>
	//   40   63:aload_1         
	//   41   64:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   42   67:ldc1            #54  <String "000000000000000">
	//   43   69:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   44   72:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   45   75:iconst_0        
	//   46   76:bipush          15
	//   47   78:invokevirtual   #63  <Method String String.substring(int, int)>
	//   48   81:astore_3        
		}
		d = s1;
	//   49   82:aload_0         
	//   50   83:aload_3         
	//   51   84:putfield        #153 <Field String d>
	//   52   87:return          
	}

	public static String c(Context context)
	{
		context = ((Context) (d(context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #156 <Method hk d(Context)>
	//    2    4:astore_0        
		String s = ((hk) (context)).b();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #158 <Method String b()>
	//    5    9:astore_1        
		s = (new StringBuilder()).append(s).append("|").toString();
	//    6   10:new             #47  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #48  <Method void StringBuilder()>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:ldc1            #160 <String "|">
	//   12   23:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   14   29:astore_1        
		context = ((Context) (((hk) (context)).e()));
	//   15   30:aload_0         
	//   16   31:invokevirtual   #163 <Method String e()>
	//   17   34:astore_0        
		if(TextUtils.isEmpty(((CharSequence) (context))))
	//*  18   35:aload_0         
	//*  19   36:invokestatic    #86  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  20   39:ifeq            65
			context = ((Context) ((new StringBuilder()).append(s).append("000000000000000").toString()));
	//   21   42:new             #47  <Class StringBuilder>
	//   22   45:dup             
	//   23   46:invokespecial   #48  <Method void StringBuilder()>
	//   24   49:aload_1         
	//   25   50:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   26   53:ldc1            #54  <String "000000000000000">
	//   27   55:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   28   58:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   29   61:astore_0        
		else
	//*  30   62:goto            84
			context = ((Context) ((new StringBuilder()).append(s).append(((String) (context))).toString()));
	//   31   65:new             #47  <Class StringBuilder>
	//   32   68:dup             
	//   33   69:invokespecial   #48  <Method void StringBuilder()>
	//   34   72:aload_1         
	//   35   73:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   36   76:aload_0         
	//   37   77:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   38   80:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   39   83:astore_0        
		return ((String) (context)).substring(0, 8);
	//   40   84:aload_0         
	//   41   85:iconst_0        
	//   42   86:bipush          8
	//   43   88:invokevirtual   #63  <Method String String.substring(int, int)>
	//   44   91:areturn         
	}

	public static hk d(Context context)
	{
		if(c == null)
	//*   0    0:getstatic       #14  <Field hk c>
	//*   1    3:ifnonnull       17
			c = new hk(context);
	//    2    6:new             #2   <Class hk>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:invokespecial   #165 <Method void hk(Context)>
	//    6   14:putstatic       #14  <Field hk c>
		return c;
	//    7   17:getstatic       #14  <Field hk c>
	//    8   20:areturn         
	}

	public final String b()
	{
		if(TextUtils.isEmpty(((CharSequence) (d))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field String d>
	//*   2    4:invokestatic    #86  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   3    7:ifeq            16
			d = "000000000000000";
	//    4   10:aload_0         
	//    5   11:ldc1            #54  <String "000000000000000">
	//    6   13:putfield        #153 <Field String d>
		return d;
	//    7   16:aload_0         
	//    8   17:getfield        #153 <Field String d>
	//    9   20:areturn         
	}

	public final String e()
	{
		if(TextUtils.isEmpty(((CharSequence) (b))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field String b>
	//*   2    4:invokestatic    #86  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   3    7:ifeq            16
			b = "000000000000000";
	//    4   10:aload_0         
	//    5   11:ldc1            #54  <String "000000000000000">
	//    6   13:putfield        #65  <Field String b>
		return b;
	//    7   16:aload_0         
	//    8   17:getfield        #65  <Field String b>
	//    9   20:areturn         
	}

	private static hk c = null;
	public String a;
	private String b;
	private String d;

	static 
	{
	//    0    0:aconst_null     
	//    1    1:putstatic       #14  <Field hk c>
	//*   2    4:return          
	}
}
