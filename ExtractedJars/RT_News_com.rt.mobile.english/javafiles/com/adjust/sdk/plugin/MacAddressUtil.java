// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk.plugin;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import java.io.*;
import java.util.Locale;

public class MacAddressUtil
{

	public MacAddressUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String getMacAddress(Context context)
	{
		context = ((Context) (getRawMacAddress(context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #14  <Method String getRawMacAddress(Context)>
	//    2    4:astore_0        
		if(context == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return removeSpaceString(((String) (context)).toUpperCase(Locale.US));
	//    7   11:aload_0         
	//    8   12:getstatic       #20  <Field Locale Locale.US>
	//    9   15:invokevirtual   #26  <Method String String.toUpperCase(Locale)>
	//   10   18:invokestatic    #30  <Method String removeSpaceString(String)>
	//   11   21:areturn         
	}

	private static String getRawMacAddress(Context context)
	{
		String s = loadAddress("wlan0");
	//    0    0:ldc1            #34  <String "wlan0">
	//    1    2:invokestatic    #37  <Method String loadAddress(String)>
	//    2    5:astore_1        
		if(s != null)
	//*   3    6:aload_1         
	//*   4    7:ifnull          12
			return s;
	//    5   10:aload_1         
	//    6   11:areturn         
		s = loadAddress("eth0");
	//    7   12:ldc1            #39  <String "eth0">
	//    8   14:invokestatic    #37  <Method String loadAddress(String)>
	//    9   17:astore_1        
		if(s != null)
	//*  10   18:aload_1         
	//*  11   19:ifnull          24
			return s;
	//   12   22:aload_1         
	//   13   23:areturn         
		context = ((Context) (((WifiManager)context.getSystemService("wifi")).getConnectionInfo().getMacAddress()));
	//   14   24:aload_0         
	//   15   25:ldc1            #41  <String "wifi">
	//   16   27:invokevirtual   #47  <Method Object Context.getSystemService(String)>
	//   17   30:checkcast       #49  <Class WifiManager>
	//   18   33:invokevirtual   #53  <Method WifiInfo WifiManager.getConnectionInfo()>
	//   19   36:invokevirtual   #58  <Method String WifiInfo.getMacAddress()>
	//   20   39:astore_0        
		if(context != null)
	//*  21   40:aload_0         
	//*  22   41:ifnull          46
			return ((String) (context));
	//   23   44:aload_0         
	//   24   45:areturn         
_L2:
		return null;
	//   25   46:aconst_null     
	//   26   47:areturn         
		context;
	//   27   48:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  28   49:goto            46
	}

	private static String loadAddress(String s)
	{
		Object obj;
		char ac[];
		obj = ((Object) (new StringBuilder()));
	//    0    0:new             #62  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #63  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("/sys/class/net/");
	//    4    8:aload_2         
	//    5    9:ldc1            #65  <String "/sys/class/net/">
	//    6   11:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(s);
	//    8   15:aload_2         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		((StringBuilder) (obj)).append("/address");
	//   12   21:aload_2         
	//   13   22:ldc1            #71  <String "/address">
	//   14   24:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   16   28:aload_2         
	//   17   29:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   18   32:astore_2        
		s = ((String) (new StringBuilder(1000)));
	//   19   33:new             #62  <Class StringBuilder>
	//   20   36:dup             
	//   21   37:sipush          1000
	//   22   40:invokespecial   #77  <Method void StringBuilder(int)>
	//   23   43:astore_0        
		obj = ((Object) (new BufferedReader(((java.io.Reader) (new FileReader(((String) (obj))))), 1024)));
	//   24   44:new             #79  <Class BufferedReader>
	//   25   47:dup             
	//   26   48:new             #81  <Class FileReader>
	//   27   51:dup             
	//   28   52:aload_2         
	//   29   53:invokespecial   #84  <Method void FileReader(String)>
	//   30   56:sipush          1024
	//   31   59:invokespecial   #87  <Method void BufferedReader(java.io.Reader, int)>
	//   32   62:astore_2        
		ac = new char[1024];
	//   33   63:sipush          1024
	//   34   66:newarray        char[]
	//   35   68:astore_3        
_L1:
		int i = ((BufferedReader) (obj)).read(ac);
	//   36   69:aload_2         
	//   37   70:aload_3         
	//   38   71:invokevirtual   #91  <Method int BufferedReader.read(char[])>
	//   39   74:istore_1        
label0:
		{
			if(i == -1)
				break label0;
	//   40   75:iload_1         
	//   41   76:iconst_m1       
	//   42   77:icmpeq          94
			try
			{
				((StringBuilder) (s)).append(String.valueOf(ac, 0, i));
	//   43   80:aload_0         
	//   44   81:aload_3         
	//   45   82:iconst_0        
	//   46   83:iload_1         
	//   47   84:invokestatic    #95  <Method String String.valueOf(char[], int, int)>
	//   48   87:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   49   90:pop             
			}
	//*  50   91:goto            69
	//*  51   94:aload_2         
	//*  52   95:invokevirtual   #98  <Method void BufferedReader.close()>
	//*  53   98:aload_0         
	//*  54   99:invokevirtual   #74  <Method String StringBuilder.toString()>
	//*  55  102:astore_0        
	//*  56  103:aload_0         
	//*  57  104:areturn         
	//*  58  105:aconst_null     
	//*  59  106:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				return null;
			}
		}
		  goto _L1
		((BufferedReader) (obj)).close();
		s = ((StringBuilder) (s)).toString();
		return s;
	//*  60  107:astore_0        
	//*  61  108:goto            105
	}

	private static String removeSpaceString(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		s = s.replaceAll("\\s", "");
	//    4    6:aload_0         
	//    5    7:ldc1            #100 <String "\\s">
	//    6    9:ldc1            #102 <String "">
	//    7   11:invokevirtual   #106 <Method String String.replaceAll(String, String)>
	//    8   14:astore_0        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   9   15:aload_0         
	//*  10   16:invokestatic    #112 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  11   19:ifeq            24
			return null;
	//   12   22:aconst_null     
	//   13   23:areturn         
		else
			return s;
	//   14   24:aload_0         
	//   15   25:areturn         
	}
}
