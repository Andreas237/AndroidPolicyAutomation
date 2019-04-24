// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize;

import com.gigya.socialize.android.GSAPI;
import java.io.*;
import java.net.*;
import java.security.InvalidKeyException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.zip.GZIPInputStream;

// Referenced classes of package com.gigya.socialize:
//			GSLogger, GSObject, SigUtils, GSResponse, 
//			GSResponseListener, GSArray

public class GSRequest
{

	public GSRequest(String s, String s1)
	{
		this(((String) (null)), ((String) (null)), s, s1, ((GSObject) (null)), true, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:aconst_null     
	//    6    6:iconst_1        
	//    7    7:aconst_null     
	//    8    8:invokespecial   #74  <Method void GSRequest(String, String, String, String, GSObject, boolean, String)>
	//    9   11:return          
	}

	public GSRequest(String s, String s1, GSObject gsobject)
	{
		this(((String) (null)), ((String) (null)), s, s1, gsobject, true, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:aload_3         
	//    6    6:iconst_1        
	//    7    7:aconst_null     
	//    8    8:invokespecial   #74  <Method void GSRequest(String, String, String, String, GSObject, boolean, String)>
	//    9   11:return          
	}

	public GSRequest(String s, String s1, String s2)
	{
		this(s, s1, ((String) (null)), s2, ((GSObject) (null)), false, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload_3         
	//    5    5:aconst_null     
	//    6    6:iconst_0        
	//    7    7:aconst_null     
	//    8    8:invokespecial   #74  <Method void GSRequest(String, String, String, String, GSObject, boolean, String)>
	//    9   11:return          
	}

	public GSRequest(String s, String s1, String s2, GSObject gsobject)
	{
		this(s, s1, ((String) (null)), s2, gsobject, false, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload_3         
	//    5    5:aload           4
	//    6    7:iconst_0        
	//    7    8:aconst_null     
	//    8    9:invokespecial   #74  <Method void GSRequest(String, String, String, String, GSObject, boolean, String)>
	//    9   12:return          
	}

	public GSRequest(String s, String s1, String s2, GSObject gsobject, boolean flag)
	{
		this(s, s1, ((String) (null)), s2, gsobject, flag, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload_3         
	//    5    5:aload           4
	//    6    7:iload           5
	//    7    9:aconst_null     
	//    8   10:invokespecial   #74  <Method void GSRequest(String, String, String, String, GSObject, boolean, String)>
	//    9   13:return          
	}

	public GSRequest(String s, String s1, String s2, GSObject gsobject, boolean flag, String s3)
	{
		this(s, s1, ((String) (null)), s2, gsobject, flag, s3);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload_3         
	//    5    5:aload           4
	//    6    7:iload           5
	//    7    9:aload           6
	//    8   11:invokespecial   #74  <Method void GSRequest(String, String, String, String, GSObject, boolean, String)>
	//    9   14:return          
	}

	public GSRequest(String s, String s1, String s2, String s3, GSObject gsobject, boolean flag)
	{
		this(s, s1, s2, s3, gsobject, flag, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:iload           6
	//    7   10:aconst_null     
	//    8   11:invokespecial   #74  <Method void GSRequest(String, String, String, String, GSObject, boolean, String)>
	//    9   14:return          
	}

	public GSRequest(String s, String s1, String s2, String s3, GSObject gsobject, boolean flag, String s4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void Object()>
		httpMethod = "POST";
	//    2    4:aload_0         
	//    3    5:ldc1            #83  <String "POST">
	//    4    7:putfield        #85  <Field String httpMethod>
		isTimestampExpiredRetry = false;
	//    5   10:aload_0         
	//    6   11:iconst_0        
	//    7   12:putfield        #87  <Field boolean isTimestampExpiredRetry>
		isUnauthorizedUserRetry = false;
	//    8   15:aload_0         
	//    9   16:iconst_0        
	//   10   17:putfield        #89  <Field boolean isUnauthorizedUserRetry>
		apiDomain = "us1.gigya.com";
	//   11   20:aload_0         
	//   12   21:ldc1            #10  <String "us1.gigya.com">
	//   13   23:putfield        #91  <Field String apiDomain>
		hostOverride = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #93  <Field String hostOverride>
		logger = new GSLogger();
	//   17   31:aload_0         
	//   18   32:new             #95  <Class GSLogger>
	//   19   35:dup             
	//   20   36:invokespecial   #96  <Method void GSLogger()>
	//   21   39:putfield        #98  <Field GSLogger logger>
		proxy = null;
	//   22   42:aload_0         
	//   23   43:aconst_null     
	//   24   44:putfield        #100 <Field Proxy proxy>
		if(s3 != null)
	//*  25   47:aload           4
	//*  26   49:ifnull          127
		{
			if(s3.length() == 0)
	//*  27   52:aload           4
	//*  28   54:invokevirtual   #104 <Method int String.length()>
	//*  29   57:ifne            61
				return;
	//   30   60:return          
			if(gsobject == null)
	//*  31   61:aload           5
	//*  32   63:ifnonnull       84
				gsobject = new GSObject();
	//   33   66:new             #106 <Class GSObject>
	//   34   69:dup             
	//   35   70:invokespecial   #107 <Method void GSObject()>
	//   36   73:astore          5
			else
	//*  37   75:aload_0         
	//*  38   76:aload           5
	//*  39   78:putfield        #109 <Field GSObject params>
	//*  40   81:goto            94
				gsobject = gsobject.clone();
	//   41   84:aload           5
	//   42   86:invokevirtual   #113 <Method GSObject GSObject.clone()>
	//   43   89:astore          5
			params = gsobject;
	//*  44   91:goto            75
			apiMethod = s3;
	//   45   94:aload_0         
	//   46   95:aload           4
	//   47   97:putfield        #115 <Field String apiMethod>
			apiKey = s;
	//   48  100:aload_0         
	//   49  101:aload_1         
	//   50  102:putfield        #117 <Field String apiKey>
			secretKey = s1;
	//   51  105:aload_0         
	//   52  106:aload_2         
	//   53  107:putfield        #119 <Field String secretKey>
			accessToken = s2;
	//   54  110:aload_0         
	//   55  111:aload_3         
	//   56  112:putfield        #121 <Field String accessToken>
			useHTTPS = flag;
	//   57  115:aload_0         
	//   58  116:iload           6
	//   59  118:putfield        #123 <Field boolean useHTTPS>
			userKey = s4;
	//   60  121:aload_0         
	//   61  122:aload           7
	//   62  124:putfield        #125 <Field String userKey>
		}
	//   63  127:return          
	}

	public GSRequest(String s, String s1, String s2, boolean flag)
	{
		this(s, s1, ((String) (null)), s2, ((GSObject) (null)), flag, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload_3         
	//    5    5:aconst_null     
	//    6    6:iload           4
	//    7    8:aconst_null     
	//    8    9:invokespecial   #74  <Method void GSRequest(String, String, String, String, GSObject, boolean, String)>
	//    9   12:return          
	}

	public static String UrlEncode(String s)
	{
		try
		{
			s = URLEncoder.encode(s, "UTF-8").replace("+", "%20").replace("*", "%2A").replace("%7E", "~");
	//    0    0:aload_0         
	//    1    1:ldc1            #132 <String "UTF-8">
	//    2    3:invokestatic    #138 <Method String URLEncoder.encode(String, String)>
	//    3    6:ldc1            #140 <String "+">
	//    4    8:ldc1            #142 <String "%20">
	//    5   10:invokevirtual   #146 <Method String String.replace(CharSequence, CharSequence)>
	//    6   13:ldc1            #148 <String "*">
	//    7   15:ldc1            #150 <String "%2A">
	//    8   17:invokevirtual   #146 <Method String String.replace(CharSequence, CharSequence)>
	//    9   20:ldc1            #152 <String "%7E">
	//   10   22:ldc1            #154 <String "~">
	//   11   24:invokevirtual   #146 <Method String String.replace(CharSequence, CharSequence)>
	//   12   27:astore_0        
		}
	//*  13   28:aload_0         
	//*  14   29:areturn         
	//*  15   30:aconst_null     
	//*  16   31:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return null;
		}
		return s;
	//*  17   32:astore_0        
	//*  18   33:goto            30
	}

	public static void addSignatureParams(GSObject gsobject, String s, String s1, String s2, long l)
	{
		Object obj = ((Object) (new Random()));
	//    0    0:new             #48  <Class Random>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void Random()>
	//    3    7:astore          7
		String s3 = Long.toString(System.currentTimeMillis() / 1000L + l);
	//    4    9:invokestatic    #162 <Method long System.currentTimeMillis()>
	//    5   12:ldc2w           #163 <Long 1000L>
	//    6   15:ldiv            
	//    7   16:lload           4
	//    8   18:ladd            
	//    9   19:invokestatic    #170 <Method String Long.toString(long)>
	//   10   22:astore          6
		StringBuilder stringbuilder = new StringBuilder();
	//   11   24:new             #172 <Class StringBuilder>
	//   12   27:dup             
	//   13   28:invokespecial   #173 <Method void StringBuilder()>
	//   14   31:astore          8
		stringbuilder.append(Long.toString(System.currentTimeMillis()));
	//   15   33:aload           8
	//   16   35:invokestatic    #162 <Method long System.currentTimeMillis()>
	//   17   38:invokestatic    #170 <Method String Long.toString(long)>
	//   18   41:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   19   44:pop             
		stringbuilder.append("_");
	//   20   45:aload           8
	//   21   47:ldc1            #179 <String "_">
	//   22   49:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   23   52:pop             
		stringbuilder.append(((Random) (obj)).nextInt());
	//   24   53:aload           8
	//   25   55:aload           7
	//   26   57:invokevirtual   #182 <Method int Random.nextInt()>
	//   27   60:invokevirtual   #185 <Method StringBuilder StringBuilder.append(int)>
	//   28   63:pop             
		obj = ((Object) (stringbuilder.toString()));
	//   29   64:aload           8
	//   30   66:invokevirtual   #188 <Method String StringBuilder.toString()>
	//   31   69:astore          7
		gsobject.put("timestamp", s3);
	//   32   71:aload_0         
	//   33   72:ldc1            #190 <String "timestamp">
	//   34   74:aload           6
	//   35   76:invokevirtual   #193 <Method void GSObject.put(String, String)>
		gsobject.put("nonce", ((String) (obj)));
	//   36   79:aload_0         
	//   37   80:ldc1            #195 <String "nonce">
	//   38   82:aload           7
	//   39   84:invokevirtual   #193 <Method void GSObject.put(String, String)>
		gsobject.put("sig", SigUtils.getOAuth1Signature(SigUtils.calcOAuth1BaseString(s, s1, gsobject), s2));
	//   40   87:aload_0         
	//   41   88:ldc1            #197 <String "sig">
	//   42   90:aload_1         
	//   43   91:aload_2         
	//   44   92:aload_0         
	//   45   93:invokestatic    #203 <Method String SigUtils.calcOAuth1BaseString(String, String, GSObject)>
	//   46   96:aload_3         
	//   47   97:invokestatic    #206 <Method String SigUtils.getOAuth1Signature(String, String)>
	//   48  100:invokevirtual   #193 <Method void GSObject.put(String, String)>
	//   49  103:return          
	}

	private String buildQS()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #172 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #173 <Method void StringBuilder()>
	//    3    7:astore_3        
		String as[] = params.getKeys();
	//    4    8:aload_0         
	//    5    9:getfield        #109 <Field GSObject params>
	//    6   12:invokevirtual   #211 <Method String[] GSObject.getKeys()>
	//    7   15:astore          4
		int j = as.length;
	//    8   17:aload           4
	//    9   19:arraylength     
	//   10   20:istore_2        
		for(int i = 0; i < j; i++)
	//*  11   21:iconst_0        
	//*  12   22:istore_1        
	//*  13   23:iload_1         
	//*  14   24:iload_2         
	//*  15   25:icmpge          82
		{
			String s = as[i];
	//   16   28:aload           4
	//   17   30:iload_1         
	//   18   31:aaload          
	//   19   32:astore          5
			String s1 = urlEncodedParam(s);
	//   20   34:aload_0         
	//   21   35:aload           5
	//   22   37:invokevirtual   #214 <Method String urlEncodedParam(String)>
	//   23   40:astore          6
			if(s1 != null)
	//*  24   42:aload           6
	//*  25   44:ifnull          75
			{
				stringbuilder.append(s);
	//   26   47:aload_3         
	//   27   48:aload           5
	//   28   50:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
				stringbuilder.append('=');
	//   30   54:aload_3         
	//   31   55:bipush          61
	//   32   57:invokevirtual   #217 <Method StringBuilder StringBuilder.append(char)>
	//   33   60:pop             
				stringbuilder.append(s1);
	//   34   61:aload_3         
	//   35   62:aload           6
	//   36   64:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   37   67:pop             
				stringbuilder.append('&');
	//   38   68:aload_3         
	//   39   69:bipush          38
	//   40   71:invokevirtual   #217 <Method StringBuilder StringBuilder.append(char)>
	//   41   74:pop             
			}
		}

	//   42   75:iload_1         
	//   43   76:iconst_1        
	//   44   77:iadd            
	//   45   78:istore_1        
	//*  46   79:goto            23
		if(stringbuilder.length() > 0)
	//*  47   82:aload_3         
	//*  48   83:invokevirtual   #218 <Method int StringBuilder.length()>
	//*  49   86:ifle            100
			stringbuilder.deleteCharAt(stringbuilder.length() - 1);
	//   50   89:aload_3         
	//   51   90:aload_3         
	//   52   91:invokevirtual   #218 <Method int StringBuilder.length()>
	//   53   94:iconst_1        
	//   54   95:isub            
	//   55   96:invokevirtual   #221 <Method StringBuilder StringBuilder.deleteCharAt(int)>
	//   56   99:pop             
		return stringbuilder.toString();
	//   57  100:aload_3         
	//   58  101:invokevirtual   #188 <Method String StringBuilder.toString()>
	//   59  104:areturn         
	}

	public static String buildQS(GSObject gsobject)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #172 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #173 <Method void StringBuilder()>
	//    3    7:astore_3        
		String as[] = gsobject.getKeys();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #211 <Method String[] GSObject.getKeys()>
	//    6   12:astore          4
		int j = as.length;
	//    7   14:aload           4
	//    8   16:arraylength     
	//    9   17:istore_2        
		for(int i = 0; i < j; i++)
	//*  10   18:iconst_0        
	//*  11   19:istore_1        
	//*  12   20:iload_1         
	//*  13   21:iload_2         
	//*  14   22:icmpge          84
		{
			String s = as[i];
	//   15   25:aload           4
	//   16   27:iload_1         
	//   17   28:aaload          
	//   18   29:astore          5
			if(gsobject.getString(s, ((String) (null))) != null)
	//*  19   31:aload_0         
	//*  20   32:aload           5
	//*  21   34:aconst_null     
	//*  22   35:invokevirtual   #225 <Method String GSObject.getString(String, String)>
	//*  23   38:ifnull          77
			{
				stringbuilder.append(s);
	//   24   41:aload_3         
	//   25   42:aload           5
	//   26   44:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   27   47:pop             
				stringbuilder.append('=');
	//   28   48:aload_3         
	//   29   49:bipush          61
	//   30   51:invokevirtual   #217 <Method StringBuilder StringBuilder.append(char)>
	//   31   54:pop             
				stringbuilder.append(UrlEncode(gsobject.getString(s, ((String) (null)))));
	//   32   55:aload_3         
	//   33   56:aload_0         
	//   34   57:aload           5
	//   35   59:aconst_null     
	//   36   60:invokevirtual   #225 <Method String GSObject.getString(String, String)>
	//   37   63:invokestatic    #227 <Method String UrlEncode(String)>
	//   38   66:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   39   69:pop             
				stringbuilder.append('&');
	//   40   70:aload_3         
	//   41   71:bipush          38
	//   42   73:invokevirtual   #217 <Method StringBuilder StringBuilder.append(char)>
	//   43   76:pop             
			}
		}

	//   44   77:iload_1         
	//   45   78:iconst_1        
	//   46   79:iadd            
	//   47   80:istore_1        
	//*  48   81:goto            20
		if(stringbuilder.length() > 0)
	//*  49   84:aload_3         
	//*  50   85:invokevirtual   #218 <Method int StringBuilder.length()>
	//*  51   88:ifle            102
			stringbuilder.deleteCharAt(stringbuilder.length() - 1);
	//   52   91:aload_3         
	//   53   92:aload_3         
	//   54   93:invokevirtual   #218 <Method int StringBuilder.length()>
	//   55   96:iconst_1        
	//   56   97:isub            
	//   57   98:invokevirtual   #221 <Method StringBuilder StringBuilder.deleteCharAt(int)>
	//   58  101:pop             
		return stringbuilder.toString();
	//   59  102:aload_3         
	//   60  103:invokevirtual   #188 <Method String StringBuilder.toString()>
	//   61  106:areturn         
	}

	public void clearParams()
	{
		originalParams = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #230 <Field GSObject originalParams>
		params = new GSObject();
	//    3    5:aload_0         
	//    4    6:new             #106 <Class GSObject>
	//    5    9:dup             
	//    6   10:invokespecial   #107 <Method void GSObject()>
	//    7   13:putfield        #109 <Field GSObject params>
	//    8   16:return          
	}

	protected void clearSession()
	{
	//    0    0:return          
	}

	public String getHttpMethod()
	{
		return httpMethod;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field String httpMethod>
	//    2    4:areturn         
	}

	public GSLogger getLogger()
	{
		return logger;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field GSLogger logger>
	//    2    4:areturn         
	}

	public String getMethod()
	{
		return apiMethod;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field String apiMethod>
	//    2    4:areturn         
	}

	public GSObject getParams()
	{
		return params;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field GSObject params>
	//    2    4:areturn         
	}

	protected void invokeLogoutEvents()
	{
	//    0    0:return          
	}

	public GSResponse send()
	{
		return send(-1);
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:invokevirtual   #242 <Method GSResponse send(int)>
	//    3    5:areturn         
	}

	public GSResponse send(int i)
	{
		if(apiMethod.startsWith("/"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field String apiMethod>
	//*   2    4:ldc1            #254 <String "/">
	//*   3    6:invokevirtual   #258 <Method boolean String.startsWith(String)>
	//*   4    9:ifeq            28
			apiMethod = apiMethod.replaceFirst("/", "");
	//    5   12:aload_0         
	//    6   13:aload_0         
	//    7   14:getfield        #115 <Field String apiMethod>
	//    8   17:ldc1            #254 <String "/">
	//    9   19:ldc2            #260 <String "">
	//   10   22:invokevirtual   #263 <Method String String.replaceFirst(String, String)>
	//   11   25:putfield        #115 <Field String apiMethod>
		Object obj;
		Object obj1;
		if(apiMethod.indexOf(".") == -1)
	//*  12   28:aload_0         
	//*  13   29:getfield        #115 <Field String apiMethod>
	//*  14   32:ldc2            #265 <String ".">
	//*  15   35:invokevirtual   #269 <Method int String.indexOf(String)>
	//*  16   38:iconst_m1       
	//*  17   39:icmpne          113
		{
			obj = ((Object) (new StringBuilder()));
	//   18   42:new             #172 <Class StringBuilder>
	//   19   45:dup             
	//   20   46:invokespecial   #173 <Method void StringBuilder()>
	//   21   49:astore_2        
			((StringBuilder) (obj)).append("socialize.");
	//   22   50:aload_2         
	//   23   51:ldc2            #271 <String "socialize.">
	//   24   54:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   25   57:pop             
			((StringBuilder) (obj)).append(apiDomain);
	//   26   58:aload_2         
	//   27   59:aload_0         
	//   28   60:getfield        #91  <Field String apiDomain>
	//   29   63:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   30   66:pop             
			host = ((StringBuilder) (obj)).toString();
	//   31   67:aload_0         
	//   32   68:aload_2         
	//   33   69:invokevirtual   #188 <Method String StringBuilder.toString()>
	//   34   72:putfield        #273 <Field String host>
			obj = ((Object) (new StringBuilder()));
	//   35   75:new             #172 <Class StringBuilder>
	//   36   78:dup             
	//   37   79:invokespecial   #173 <Method void StringBuilder()>
	//   38   82:astore_2        
			obj1 = "/socialize.";
	//   39   83:ldc2            #275 <String "/socialize.">
	//   40   86:astore_3        
		} else
	//*  41   87:aload_2         
	//*  42   88:aload_3         
	//*  43   89:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//*  44   92:pop             
	//*  45   93:aload_2         
	//*  46   94:aload_0         
	//*  47   95:getfield        #115 <Field String apiMethod>
	//*  48   98:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//*  49  101:pop             
	//*  50  102:aload_0         
	//*  51  103:aload_2         
	//*  52  104:invokevirtual   #188 <Method String StringBuilder.toString()>
	//*  53  107:putfield        #277 <Field String path>
	//*  54  110:goto            179
		{
			obj = ((Object) (apiMethod.split("\\.")));
	//   55  113:aload_0         
	//   56  114:getfield        #115 <Field String apiMethod>
	//   57  117:ldc2            #279 <String "\\.">
	//   58  120:invokevirtual   #283 <Method String[] String.split(String)>
	//   59  123:astore_2        
			obj1 = ((Object) (new StringBuilder()));
	//   60  124:new             #172 <Class StringBuilder>
	//   61  127:dup             
	//   62  128:invokespecial   #173 <Method void StringBuilder()>
	//   63  131:astore_3        
			((StringBuilder) (obj1)).append(obj[0]);
	//   64  132:aload_3         
	//   65  133:aload_2         
	//   66  134:iconst_0        
	//   67  135:aaload          
	//   68  136:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   69  139:pop             
			((StringBuilder) (obj1)).append(".");
	//   70  140:aload_3         
	//   71  141:ldc2            #265 <String ".">
	//   72  144:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   73  147:pop             
			((StringBuilder) (obj1)).append(apiDomain);
	//   74  148:aload_3         
	//   75  149:aload_0         
	//   76  150:getfield        #91  <Field String apiDomain>
	//   77  153:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   78  156:pop             
			host = ((StringBuilder) (obj1)).toString();
	//   79  157:aload_0         
	//   80  158:aload_3         
	//   81  159:invokevirtual   #188 <Method String StringBuilder.toString()>
	//   82  162:putfield        #273 <Field String host>
			obj = ((Object) (new StringBuilder()));
	//   83  165:new             #172 <Class StringBuilder>
	//   84  168:dup             
	//   85  169:invokespecial   #173 <Method void StringBuilder()>
	//   86  172:astore_2        
			obj1 = "/";
	//   87  173:ldc1            #254 <String "/">
	//   88  175:astore_3        
		}
		((StringBuilder) (obj)).append(((String) (obj1)));
		((StringBuilder) (obj)).append(apiMethod);
		path = ((StringBuilder) (obj)).toString();
	//*  89  176:goto            87
		host = params.getString("_host", host);
	//   90  179:aload_0         
	//   91  180:aload_0         
	//   92  181:getfield        #109 <Field GSObject params>
	//   93  184:ldc2            #285 <String "_host">
	//   94  187:aload_0         
	//   95  188:getfield        #273 <Field String host>
	//   96  191:invokevirtual   #225 <Method String GSObject.getString(String, String)>
	//   97  194:putfield        #273 <Field String host>
		params.remove("_host");
	//   98  197:aload_0         
	//   99  198:getfield        #109 <Field GSObject params>
	//  100  201:ldc2            #285 <String "_host">
	//  101  204:invokevirtual   #289 <Method void GSObject.remove(String)>
		format = params.getString("format", "json");
	//  102  207:aload_0         
	//  103  208:aload_0         
	//  104  209:getfield        #109 <Field GSObject params>
	//  105  212:ldc2            #290 <String "format">
	//  106  215:ldc2            #292 <String "json">
	//  107  218:invokevirtual   #225 <Method String GSObject.getString(String, String)>
	//  108  221:putfield        #294 <Field String format>
		setParam("format", format);
	//  109  224:aload_0         
	//  110  225:ldc2            #290 <String "format">
	//  111  228:aload_0         
	//  112  229:getfield        #294 <Field String format>
	//  113  232:invokevirtual   #297 <Method void setParam(String, String)>
		logger.write("apiKey", ((Object) (apiKey)));
	//  114  235:aload_0         
	//  115  236:getfield        #98  <Field GSLogger logger>
	//  116  239:ldc2            #298 <String "apiKey">
	//  117  242:aload_0         
	//  118  243:getfield        #117 <Field String apiKey>
	//  119  246:invokevirtual   #302 <Method void GSLogger.write(String, Object)>
		logger.write("userKey", ((Object) (userKey)));
	//  120  249:aload_0         
	//  121  250:getfield        #98  <Field GSLogger logger>
	//  122  253:ldc2            #303 <String "userKey">
	//  123  256:aload_0         
	//  124  257:getfield        #125 <Field String userKey>
	//  125  260:invokevirtual   #302 <Method void GSLogger.write(String, Object)>
		logger.write("apiMethod", ((Object) (apiMethod)));
	//  126  263:aload_0         
	//  127  264:getfield        #98  <Field GSLogger logger>
	//  128  267:ldc2            #304 <String "apiMethod">
	//  129  270:aload_0         
	//  130  271:getfield        #115 <Field String apiMethod>
	//  131  274:invokevirtual   #302 <Method void GSLogger.write(String, Object)>
		logger.write("params", ((Object) (params)));
	//  132  277:aload_0         
	//  133  278:getfield        #98  <Field GSLogger logger>
	//  134  281:ldc2            #305 <String "params">
	//  135  284:aload_0         
	//  136  285:getfield        #109 <Field GSObject params>
	//  137  288:invokevirtual   #302 <Method void GSLogger.write(String, Object)>
		logger.write("useHTTPS", ((Object) (Boolean.valueOf(useHTTPS))));
	//  138  291:aload_0         
	//  139  292:getfield        #98  <Field GSLogger logger>
	//  140  295:ldc2            #306 <String "useHTTPS">
	//  141  298:aload_0         
	//  142  299:getfield        #123 <Field boolean useHTTPS>
	//  143  302:invokestatic    #312 <Method Boolean Boolean.valueOf(boolean)>
	//  144  305:invokevirtual   #302 <Method void GSLogger.write(String, Object)>
		if(accessToken == null && (apiKey == null || apiKey == null && userKey == null || secretKey == null && userKey != null))
	//* 145  308:aload_0         
	//* 146  309:getfield        #121 <Field String accessToken>
	//* 147  312:ifnonnull       373
	//* 148  315:aload_0         
	//* 149  316:getfield        #117 <Field String apiKey>
	//* 150  319:ifnull          350
	//* 151  322:aload_0         
	//* 152  323:getfield        #117 <Field String apiKey>
	//* 153  326:ifnonnull       336
	//* 154  329:aload_0         
	//* 155  330:getfield        #125 <Field String userKey>
	//* 156  333:ifnull          350
	//* 157  336:aload_0         
	//* 158  337:getfield        #119 <Field String secretKey>
	//* 159  340:ifnonnull       373
	//* 160  343:aload_0         
	//* 161  344:getfield        #125 <Field String userKey>
	//* 162  347:ifnull          373
			return new GSResponse(apiMethod, params, 0x61a82, logger);
	//  163  350:new             #314 <Class GSResponse>
	//  164  353:dup             
	//  165  354:aload_0         
	//  166  355:getfield        #115 <Field String apiMethod>
	//  167  358:aload_0         
	//  168  359:getfield        #109 <Field GSObject params>
	//  169  362:ldc2            #315 <Int 0x61a82>
	//  170  365:aload_0         
	//  171  366:getfield        #98  <Field GSLogger logger>
	//  172  369:invokespecial   #318 <Method void GSResponse(String, GSObject, int, GSLogger)>
	//  173  372:areturn         
		try
		{
			obj1 = ((Object) (sendRequest(httpMethod, host, path, params, apiKey, secretKey, useHTTPS, isLoggedIn, i)));
	//  174  373:aload_0         
	//  175  374:aload_0         
	//  176  375:getfield        #85  <Field String httpMethod>
	//  177  378:aload_0         
	//  178  379:getfield        #273 <Field String host>
	//  179  382:aload_0         
	//  180  383:getfield        #277 <Field String path>
	//  181  386:aload_0         
	//  182  387:getfield        #109 <Field GSObject params>
	//  183  390:aload_0         
	//  184  391:getfield        #117 <Field String apiKey>
	//  185  394:aload_0         
	//  186  395:getfield        #119 <Field String secretKey>
	//  187  398:aload_0         
	//  188  399:getfield        #123 <Field boolean useHTTPS>
	//  189  402:aload_0         
	//  190  403:getfield        #320 <Field boolean isLoggedIn>
	//  191  406:iload_1         
	//  192  407:invokevirtual   #324 <Method GSResponse sendRequest(String, String, String, GSObject, String, String, boolean, boolean, int)>
	//  193  410:astore_3        
			if(((GSResponse) (obj1)).getErrorCode() == 0x6263a && !isTimestampExpiredRetry)
	//* 194  411:aload_3         
	//* 195  412:invokevirtual   #327 <Method int GSResponse.getErrorCode()>
	//* 196  415:ldc2            #328 <Int 0x6263a>
	//* 197  418:icmpne          447
	//* 198  421:aload_0         
	//* 199  422:getfield        #87  <Field boolean isTimestampExpiredRetry>
	//* 200  425:ifne            447
			{
				isTimestampExpiredRetry = true;
	//  201  428:aload_0         
	//  202  429:iconst_1        
	//  203  430:putfield        #87  <Field boolean isTimestampExpiredRetry>
				params.remove("sig");
	//  204  433:aload_0         
	//  205  434:getfield        #109 <Field GSObject params>
	//  206  437:ldc1            #197 <String "sig">
	//  207  439:invokevirtual   #289 <Method void GSObject.remove(String)>
				return send();
	//  208  442:aload_0         
	//  209  443:invokevirtual   #330 <Method GSResponse send()>
	//  210  446:areturn         
			}
			if(((GSResponse) (obj1)).getErrorCode() != 0x6263d || isUnauthorizedUserRetry)
				break MISSING_BLOCK_LABEL_558;
	//  211  447:aload_3         
	//  212  448:invokevirtual   #327 <Method int GSResponse.getErrorCode()>
	//  213  451:ldc2            #331 <Int 0x6263d>
	//  214  454:icmpne          558
	//  215  457:aload_0         
	//  216  458:getfield        #89  <Field boolean isUnauthorizedUserRetry>
	//  217  461:ifne            558
			isUnauthorizedUserRetry = true;
	//  218  464:aload_0         
	//  219  465:iconst_1        
	//  220  466:putfield        #89  <Field boolean isUnauthorizedUserRetry>
			clearSession();
	//  221  469:aload_0         
	//  222  470:invokevirtual   #333 <Method void clearSession()>
			invokeLogoutEvents();
	//  223  473:aload_0         
	//  224  474:invokevirtual   #335 <Method void invokeLogoutEvents()>
			if(originalParams != null)
	//* 225  477:aload_0         
	//* 226  478:getfield        #230 <Field GSObject originalParams>
	//* 227  481:ifnull          495
			{
				obj = ((Object) (originalParams.clone()));
	//  228  484:aload_0         
	//  229  485:getfield        #230 <Field GSObject originalParams>
	//  230  488:invokevirtual   #113 <Method GSObject GSObject.clone()>
	//  231  491:astore_2        
				break MISSING_BLOCK_LABEL_503;
	//  232  492:goto            503
			}
		}
	//* 233  495:new             #106 <Class GSObject>
	//* 234  498:dup             
	//* 235  499:invokespecial   #107 <Method void GSObject()>
	//* 236  502:astore_2        
	//* 237  503:aload_0         
	//* 238  504:invokevirtual   #337 <Method void clearParams()>
	//* 239  507:aload_0         
	//* 240  508:invokestatic    #343 <Method GSAPI GSAPI.getInstance()>
	//* 241  511:invokevirtual   #346 <Method String GSAPI.getAPIKey()>
	//* 242  514:putfield        #117 <Field String apiKey>
	//* 243  517:aload_0         
	//* 244  518:aconst_null     
	//* 245  519:putfield        #119 <Field String secretKey>
	//* 246  522:aload_0         
	//* 247  523:aload_2         
	//* 248  524:invokevirtual   #350 <Method void setParams(GSObject)>
	//* 249  527:aload_0         
	//* 250  528:invokevirtual   #330 <Method GSResponse send()>
	//* 251  531:astore_2        
	//* 252  532:aload_2         
	//* 253  533:invokevirtual   #327 <Method int GSResponse.getErrorCode()>
	//* 254  536:ldc2            #315 <Int 0x61a82>
	//* 255  539:icmpeq          558
	//* 256  542:aload_2         
	//* 257  543:invokevirtual   #327 <Method int GSResponse.getErrorCode()>
	//* 258  546:istore_1        
	//* 259  547:iload_1         
	//* 260  548:ldc2            #351 <Int 0x6263f>
	//* 261  551:icmpne          556
	//* 262  554:aload_3         
	//* 263  555:areturn         
	//* 264  556:aload_2         
	//* 265  557:areturn         
	//* 266  558:aload_3         
	//* 267  559:areturn         
	//* 268  560:astore_2        
	//* 269  561:new             #314 <Class GSResponse>
	//* 270  564:dup             
	//* 271  565:aload_0         
	//* 272  566:getfield        #115 <Field String apiMethod>
	//* 273  569:aload_0         
	//* 274  570:getfield        #109 <Field GSObject params>
	//* 275  573:ldc2            #352 <Int 0x7a120>
	//* 276  576:aload_2         
	//* 277  577:invokevirtual   #353 <Method String Exception.toString()>
	//* 278  580:aload_0         
	//* 279  581:getfield        #98  <Field GSLogger logger>
	//* 280  584:invokespecial   #356 <Method void GSResponse(String, GSObject, int, String, GSLogger)>
	//* 281  587:areturn         
	//* 282  588:astore_2        
	//* 283  589:new             #314 <Class GSResponse>
	//* 284  592:dup             
	//* 285  593:aload_0         
	//* 286  594:getfield        #115 <Field String apiMethod>
	//* 287  597:aload_0         
	//* 288  598:getfield        #109 <Field GSObject params>
	//* 289  601:ldc2            #357 <Int 0x7b0c2>
	//* 290  604:aload_2         
	//* 291  605:invokevirtual   #358 <Method String ConnectException.toString()>
	//* 292  608:aload_0         
	//* 293  609:getfield        #98  <Field GSLogger logger>
	//* 294  612:invokespecial   #356 <Method void GSResponse(String, GSObject, int, String, GSLogger)>
	//* 295  615:areturn         
	//* 296  616:astore_2        
	//* 297  617:new             #314 <Class GSResponse>
	//* 298  620:dup             
	//* 299  621:aload_0         
	//* 300  622:getfield        #115 <Field String apiMethod>
	//* 301  625:aload_0         
	//* 302  626:getfield        #109 <Field GSObject params>
	//* 303  629:ldc2            #357 <Int 0x7b0c2>
	//* 304  632:aload_2         
	//* 305  633:invokevirtual   #359 <Method String SocketTimeoutException.toString()>
	//* 306  636:aload_0         
	//* 307  637:getfield        #98  <Field GSLogger logger>
	//* 308  640:invokespecial   #356 <Method void GSResponse(String, GSObject, int, String, GSLogger)>
	//* 309  643:areturn         
	//* 310  644:astore_2        
	//* 311  645:aload_0         
	//* 312  646:getfield        #115 <Field String apiMethod>
	//* 313  649:astore_3        
	//* 314  650:aload_0         
	//* 315  651:getfield        #109 <Field GSObject params>
	//* 316  654:astore          4
	//* 317  656:new             #172 <Class StringBuilder>
	//* 318  659:dup             
	//* 319  660:invokespecial   #173 <Method void StringBuilder()>
	//* 320  663:astore          5
	//* 321  665:aload           5
	//* 322  667:ldc2            #361 <String "Invalid parameter value: ">
	//* 323  670:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//* 324  673:pop             
	//* 325  674:aload           5
	//* 326  676:aload_2         
	//* 327  677:invokevirtual   #364 <Method String IllegalArgumentException.getMessage()>
	//* 328  680:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//* 329  683:pop             
	//* 330  684:new             #314 <Class GSResponse>
	//* 331  687:dup             
	//* 332  688:aload_3         
	//* 333  689:aload           4
	//* 334  691:ldc2            #365 <Int 0x61a86>
	//* 335  694:aload           5
	//* 336  696:invokevirtual   #188 <Method String StringBuilder.toString()>
	//* 337  699:aload_0         
	//* 338  700:getfield        #98  <Field GSLogger logger>
	//* 339  703:invokespecial   #356 <Method void GSResponse(String, GSObject, int, String, GSLogger)>
	//* 340  706:areturn         
	//* 341  707:astore_2        
	//* 342  708:aload_0         
	//* 343  709:getfield        #115 <Field String apiMethod>
	//* 344  712:astore_3        
	//* 345  713:aload_0         
	//* 346  714:getfield        #109 <Field GSObject params>
	//* 347  717:astore          4
	//* 348  719:new             #172 <Class StringBuilder>
	//* 349  722:dup             
	//* 350  723:invokespecial   #173 <Method void StringBuilder()>
	//* 351  726:astore          5
	//* 352  728:aload           5
	//* 353  730:ldc2            #361 <String "Invalid parameter value: ">
	//* 354  733:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//* 355  736:pop             
	//* 356  737:aload           5
	//* 357  739:aload_2         
	//* 358  740:invokevirtual   #366 <Method String UnsupportedEncodingException.getMessage()>
	//* 359  743:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//* 360  746:pop             
	//* 361  747:new             #314 <Class GSResponse>
	//* 362  750:dup             
	//* 363  751:aload_3         
	//* 364  752:aload           4
	//* 365  754:ldc2            #365 <Int 0x61a86>
	//* 366  757:aload           5
	//* 367  759:invokevirtual   #188 <Method String StringBuilder.toString()>
	//* 368  762:aload_0         
	//* 369  763:getfield        #98  <Field GSLogger logger>
	//* 370  766:invokespecial   #356 <Method void GSResponse(String, GSObject, int, String, GSLogger)>
	//* 371  769:areturn         
		catch(InvalidKeyException invalidkeyexception)
	//* 372  770:astore_2        
		{
			String s2 = apiMethod;
	//  373  771:aload_0         
	//  374  772:getfield        #115 <Field String apiMethod>
	//  375  775:astore_3        
			GSObject gsobject2 = params;
	//  376  776:aload_0         
	//  377  777:getfield        #109 <Field GSObject params>
	//  378  780:astore          4
			StringBuilder stringbuilder2 = new StringBuilder();
	//  379  782:new             #172 <Class StringBuilder>
	//  380  785:dup             
	//  381  786:invokespecial   #173 <Method void StringBuilder()>
	//  382  789:astore          5
			stringbuilder2.append("Invalid parameter value:");
	//  383  791:aload           5
	//  384  793:ldc2            #368 <String "Invalid parameter value:">
	//  385  796:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//  386  799:pop             
			stringbuilder2.append(invalidkeyexception.getMessage());
	//  387  800:aload           5
	//  388  802:aload_2         
	//  389  803:invokevirtual   #369 <Method String InvalidKeyException.getMessage()>
	//  390  806:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//  391  809:pop             
			return new GSResponse(s2, gsobject2, 0x61a86, stringbuilder2.toString(), logger);
	//  392  810:new             #314 <Class GSResponse>
	//  393  813:dup             
	//  394  814:aload_3         
	//  395  815:aload           4
	//  396  817:ldc2            #365 <Int 0x61a86>
	//  397  820:aload           5
	//  398  822:invokevirtual   #188 <Method String StringBuilder.toString()>
	//  399  825:aload_0         
	//  400  826:getfield        #98  <Field GSLogger logger>
	//  401  829:invokespecial   #356 <Method void GSResponse(String, GSObject, int, String, GSLogger)>
	//  402  832:areturn         
		}
		catch(UnsupportedEncodingException unsupportedencodingexception)
		{
			String s1 = apiMethod;
			GSObject gsobject1 = params;
			StringBuilder stringbuilder1 = new StringBuilder();
			stringbuilder1.append("Invalid parameter value: ");
			stringbuilder1.append(unsupportedencodingexception.getMessage());
			return new GSResponse(s1, gsobject1, 0x61a86, stringbuilder1.toString(), logger);
		}
		catch(IllegalArgumentException illegalargumentexception)
		{
			String s = apiMethod;
			GSObject gsobject = params;
			StringBuilder stringbuilder = new StringBuilder();
			stringbuilder.append("Invalid parameter value: ");
			stringbuilder.append(illegalargumentexception.getMessage());
			return new GSResponse(s, gsobject, 0x61a86, stringbuilder.toString(), logger);
		}
		catch(SocketTimeoutException sockettimeoutexception)
		{
			return new GSResponse(apiMethod, params, 0x7b0c2, sockettimeoutexception.toString(), logger);
		}
		catch(ConnectException connectexception)
		{
			return new GSResponse(apiMethod, params, 0x7b0c2, connectexception.toString(), logger);
		}
		catch(Exception exception)
		{
			return new GSResponse(apiMethod, params, 0x7a120, exception.toString(), logger);
		}
		obj = ((Object) (new GSObject()));
		clearParams();
		apiKey = GSAPI.getInstance().getAPIKey();
		secretKey = null;
		setParams(((GSObject) (obj)));
		obj = ((Object) (send()));
		if(((GSResponse) (obj)).getErrorCode() == 0x61a82)
			break MISSING_BLOCK_LABEL_558;
		i = ((GSResponse) (obj)).getErrorCode();
		if(i == 0x6263f)
			return ((GSResponse) (obj1));
		else
			return ((GSResponse) (obj));
		return ((GSResponse) (obj1));
	}

	public void send(GSResponseListener gsresponselistener)
	{
		send(gsresponselistener, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #373 <Method void send(GSResponseListener, Object)>
	//    4    6:return          
	}

	public void send(final GSResponseListener listener, final Object context)
	{
		(new Thread(new Runnable() {

			public void run()
			{
				GSResponse gsresponse = send();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field GSRequest this$0>
			//    2    4:invokevirtual   #33  <Method GSResponse GSRequest.send()>
			//    3    7:astore_1        
				if(listener != null)
			//*   4    8:aload_0         
			//*   5    9:getfield        #23  <Field GSResponseListener val$listener>
			//*   6   12:ifnull          36
					listener.onGSResponse(apiMethod, gsresponse, context);
			//    7   15:aload_0         
			//    8   16:getfield        #23  <Field GSResponseListener val$listener>
			//    9   19:aload_0         
			//   10   20:getfield        #21  <Field GSRequest this$0>
			//   11   23:getfield        #37  <Field String GSRequest.apiMethod>
			//   12   26:aload_1         
			//   13   27:aload_0         
			//   14   28:getfield        #25  <Field Object val$context>
			//   15   31:invokeinterface #43  <Method void GSResponseListener.onGSResponse(String, GSResponse, Object)>
			//   16   36:return          
			}

			final GSRequest this$0;
			final Object val$context;
			final GSResponseListener val$listener;

			
			{
				this$0 = GSRequest.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field GSRequest this$0>
				listener = gsresponselistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field GSResponseListener val$listener>
				context = obj;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field Object val$context>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
)).start();
	//    0    0:new             #375 <Class Thread>
	//    1    3:dup             
	//    2    4:new             #6   <Class GSRequest$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #378 <Method void GSRequest$1(GSRequest, GSResponseListener, Object)>
	//    8   14:invokespecial   #381 <Method void Thread(Runnable)>
	//    9   17:invokevirtual   #384 <Method void Thread.start()>
	//   10   20:return          
	}

	protected GSResponse sendRequest(String s, String s1, String s2, GSObject gsobject, String s3, String s4, boolean flag, 
			boolean flag1, int i)
	{
		long l;
		Object obj;
		Object obj1;
		StringBuilder stringbuilder;
		originalParams = gsobject.clone();
	//    0    0:aload_0         
	//    1    1:aload           4
	//    2    3:invokevirtual   #113 <Method GSObject GSObject.clone()>
	//    3    6:putfield        #230 <Field GSObject originalParams>
		l = (new Date()).getTime();
	//    4    9:new             #388 <Class Date>
	//    5   12:dup             
	//    6   13:invokespecial   #389 <Method void Date()>
	//    7   16:invokevirtual   #392 <Method long Date.getTime()>
	//    8   19:lstore          11
		stringbuilder = new StringBuilder();
	//    9   21:new             #172 <Class StringBuilder>
	//   10   24:dup             
	//   11   25:invokespecial   #173 <Method void StringBuilder()>
	//   12   28:astore          18
		obj1 = null;
	//   13   30:aconst_null     
	//   14   31:astore          17
		obj = null;
	//   15   33:aconst_null     
	//   16   34:astore          16
		if(hostOverride != null)
	//*  17   36:aload_0         
	//*  18   37:getfield        #93  <Field String hostOverride>
	//*  19   40:ifnull          936
			s1 = hostOverride;
	//   20   43:aload_0         
	//   21   44:getfield        #93  <Field String hostOverride>
	//   22   47:astore_2        
	//*  23   48:goto            51
		if(flag) goto _L2; else goto _L1
	//   24   51:iload           7
	//   25   53:ifne            947
_L1:
		if(accessToken == null) goto _L3; else goto _L2
	//   26   56:aload_0         
	//   27   57:getfield        #121 <Field String accessToken>
	//   28   60:ifnull          939
	//*  29   63:goto            947
_L5:
		String s5;
		StringBuilder stringbuilder1 = new StringBuilder();
	//   30   66:new             #172 <Class StringBuilder>
	//   31   69:dup             
	//   32   70:invokespecial   #173 <Method void StringBuilder()>
	//   33   73:astore          19
		stringbuilder1.append(s5);
	//   34   75:aload           19
	//   35   77:aload           15
	//   36   79:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   37   82:pop             
		stringbuilder1.append("://");
	//   38   83:aload           19
	//   39   85:ldc2            #394 <String "://">
	//   40   88:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   41   91:pop             
		stringbuilder1.append(s1);
	//   42   92:aload           19
	//   43   94:aload_2         
	//   44   95:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   45   98:pop             
		stringbuilder1.append(s2);
	//   46   99:aload           19
	//   47  101:aload_3         
	//   48  102:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   49  105:pop             
		s2 = stringbuilder1.toString();
	//   50  106:aload           19
	//   51  108:invokevirtual   #188 <Method String StringBuilder.toString()>
	//   52  111:astore_3        
		setParam("httpStatusCodes", "false");
	//   53  112:aload_0         
	//   54  113:ldc2            #396 <String "httpStatusCodes">
	//   55  116:ldc2            #398 <String "false">
	//   56  119:invokevirtual   #297 <Method void setParam(String, String)>
		if(!gsobject.containsKey("sdk"))
	//*  57  122:aload           4
	//*  58  124:ldc2            #400 <String "sdk">
	//*  59  127:invokevirtual   #403 <Method boolean GSObject.containsKey(String)>
	//*  60  130:ifne            143
			setParam("sdk", "android_3.3.26");
	//   61  133:aload_0         
	//   62  134:ldc2            #400 <String "sdk">
	//   63  137:ldc2            #405 <String "android_3.3.26">
	//   64  140:invokevirtual   #297 <Method void setParam(String, String)>
		logger.write("sdk", ((Object) (gsobject.getString("sdk"))));
	//   65  143:aload_0         
	//   66  144:getfield        #98  <Field GSLogger logger>
	//   67  147:ldc2            #400 <String "sdk">
	//   68  150:aload           4
	//   69  152:ldc2            #400 <String "sdk">
	//   70  155:invokevirtual   #407 <Method String GSObject.getString(String)>
	//   71  158:invokevirtual   #302 <Method void GSLogger.write(String, Object)>
		if(accessToken != null)
	//*  72  161:aload_0         
	//*  73  162:getfield        #121 <Field String accessToken>
	//*  74  165:ifnull          183
		{
			gsobject.put("oauth_token", accessToken);
	//   75  168:aload           4
	//   76  170:ldc2            #409 <String "oauth_token">
	//   77  173:aload_0         
	//   78  174:getfield        #121 <Field String accessToken>
	//   79  177:invokevirtual   #193 <Method void GSObject.put(String, String)>
			break MISSING_BLOCK_LABEL_240;
	//   80  180:goto            240
		}
		if(!gsobject.containsKey("oauth_token"))
	//*  81  183:aload           4
	//*  82  185:ldc2            #409 <String "oauth_token">
	//*  83  188:invokevirtual   #403 <Method boolean GSObject.containsKey(String)>
	//*  84  191:ifne            204
			gsobject.put("apiKey", s3);
	//   85  194:aload           4
	//   86  196:ldc2            #298 <String "apiKey">
	//   87  199:aload           5
	//   88  201:invokevirtual   #193 <Method void GSObject.put(String, String)>
		if(userKey != null)
	//*  89  204:aload_0         
	//*  90  205:getfield        #125 <Field String userKey>
	//*  91  208:ifnull          223
			gsobject.put("userKey", userKey);
	//   92  211:aload           4
	//   93  213:ldc2            #303 <String "userKey">
	//   94  216:aload_0         
	//   95  217:getfield        #125 <Field String userKey>
	//   96  220:invokevirtual   #193 <Method void GSObject.put(String, String)>
		if(s4 == null)
			break MISSING_BLOCK_LABEL_240;
	//   97  223:aload           6
	//   98  225:ifnull          240
		addSignatureParams(gsobject, s, s2, s4, timestampOffsetSec);
	//   99  228:aload           4
	//  100  230:aload_1         
	//  101  231:aload_3         
	//  102  232:aload           6
	//  103  234:getstatic       #411 <Field long timestampOffsetSec>
	//  104  237:invokestatic    #413 <Method void addSignatureParams(GSObject, String, String, String, long)>
		s3 = buildQS();
	//  105  240:aload_0         
	//  106  241:invokespecial   #415 <Method String buildQS()>
	//  107  244:astore          5
		logger.write("post_data", ((Object) (s3)));
	//  108  246:aload_0         
	//  109  247:getfield        #98  <Field GSLogger logger>
	//  110  250:ldc2            #417 <String "post_data">
	//  111  253:aload           5
	//  112  255:invokevirtual   #302 <Method void GSLogger.write(String, Object)>
		s1 = s2;
	//  113  258:aload_3         
	//  114  259:astore_2        
		if(s.equals("GET"))
	//* 115  260:aload_1         
	//* 116  261:ldc2            #419 <String "GET">
	//* 117  264:invokevirtual   #423 <Method boolean String.equals(Object)>
	//* 118  267:ifeq            304
		{
			s1 = ((String) (new StringBuilder()));
	//  119  270:new             #172 <Class StringBuilder>
	//  120  273:dup             
	//  121  274:invokespecial   #173 <Method void StringBuilder()>
	//  122  277:astore_2        
			((StringBuilder) (s1)).append(s2);
	//  123  278:aload_2         
	//  124  279:aload_3         
	//  125  280:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//  126  283:pop             
			((StringBuilder) (s1)).append("?");
	//  127  284:aload_2         
	//  128  285:ldc2            #425 <String "?">
	//  129  288:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//  130  291:pop             
			((StringBuilder) (s1)).append(s3);
	//  131  292:aload_2         
	//  132  293:aload           5
	//  133  295:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//  134  298:pop             
			s1 = ((StringBuilder) (s1)).toString();
	//  135  299:aload_2         
	//  136  300:invokevirtual   #188 <Method String StringBuilder.toString()>
	//  137  303:astore_2        
		}
		s1 = ((String) (new URL(s1)));
	//  138  304:new             #427 <Class URL>
	//  139  307:dup             
	//  140  308:aload_2         
	//  141  309:invokespecial   #429 <Method void URL(String)>
	//  142  312:astore_2        
		logger.write("url", ((Object) (s1)));
	//  143  313:aload_0         
	//  144  314:getfield        #98  <Field GSLogger logger>
	//  145  317:ldc2            #431 <String "url">
	//  146  320:aload_2         
	//  147  321:invokevirtual   #302 <Method void GSLogger.write(String, Object)>
		if(proxy == null)
	//* 148  324:aload_0         
	//* 149  325:getfield        #100 <Field Proxy proxy>
	//* 150  328:ifnonnull       339
		{
			s1 = ((String) (((URL) (s1)).openConnection()));
	//  151  331:aload_2         
	//  152  332:invokevirtual   #435 <Method URLConnection URL.openConnection()>
	//  153  335:astore_2        
			break MISSING_BLOCK_LABEL_348;
	//  154  336:goto            348
		}
		s1 = ((String) (((URL) (s1)).openConnection(proxy)));
	//  155  339:aload_2         
	//  156  340:aload_0         
	//  157  341:getfield        #100 <Field Proxy proxy>
	//  158  344:invokevirtual   #438 <Method URLConnection URL.openConnection(Proxy)>
	//  159  347:astore_2        
		boolean flag2 = false;
	//  160  348:iconst_0        
	//  161  349:istore          10
		long l1;
		try
		{
			((URLConnection) (s1)).setUseCaches(false);
	//  162  351:aload_2         
	//  163  352:iconst_0        
	//  164  353:invokevirtual   #444 <Method void URLConnection.setUseCaches(boolean)>
		}
	//* 165  356:iload           9
	//* 166  358:iconst_m1       
	//* 167  359:icmpeq          375
	//* 168  362:aload_2         
	//* 169  363:sipush          10000
	//* 170  366:invokevirtual   #448 <Method void URLConnection.setConnectTimeout(int)>
	//* 171  369:aload_2         
	//* 172  370:iload           9
	//* 173  372:invokevirtual   #451 <Method void URLConnection.setReadTimeout(int)>
	//* 174  375:aload_2         
	//* 175  376:ldc2            #453 <String "Accept-Encoding">
	//* 176  379:ldc2            #455 <String "gzip">
	//* 177  382:invokevirtual   #458 <Method void URLConnection.setRequestProperty(String, String)>
	//* 178  385:aload_2         
	//* 179  386:ldc2            #460 <String "connection">
	//* 180  389:ldc2            #462 <String "close">
	//* 181  392:invokevirtual   #458 <Method void URLConnection.setRequestProperty(String, String)>
	//* 182  395:aload_2         
	//* 183  396:checkcast       #464 <Class HttpURLConnection>
	//* 184  399:aload_1         
	//* 185  400:invokevirtual   #467 <Method void HttpURLConnection.setRequestMethod(String)>
	//* 186  403:aload_1         
	//* 187  404:ldc1            #83  <String "POST">
	//* 188  406:invokevirtual   #423 <Method boolean String.equals(Object)>
	//* 189  409:ifeq            955
	//* 190  412:aload_2         
	//* 191  413:iconst_1        
	//* 192  414:invokevirtual   #470 <Method void URLConnection.setDoOutput(boolean)>
	//* 193  417:new             #472 <Class OutputStreamWriter>
	//* 194  420:dup             
	//* 195  421:aload_2         
	//* 196  422:invokevirtual   #476 <Method java.io.OutputStream URLConnection.getOutputStream()>
	//* 197  425:invokespecial   #479 <Method void OutputStreamWriter(java.io.OutputStream)>
	//* 198  428:astore_1        
	//* 199  429:aload_1         
	//* 200  430:astore_3        
	//* 201  431:aload_1         
	//* 202  432:astore          4
	//* 203  434:aload_1         
	//* 204  435:aload           5
	//* 205  437:invokevirtual   #481 <Method void OutputStreamWriter.write(String)>
	//* 206  440:aload_1         
	//* 207  441:astore_3        
	//* 208  442:aload_1         
	//* 209  443:astore          4
	//* 210  445:aload_1         
	//* 211  446:invokevirtual   #484 <Method void OutputStreamWriter.flush()>
	//* 212  449:goto            452
	//* 213  452:iload           10
	//* 214  454:istore          9
	//* 215  456:aload_1         
	//* 216  457:astore_3        
	//* 217  458:aload_1         
	//* 218  459:astore          4
	//* 219  461:aload_2         
	//* 220  462:checkcast       #464 <Class HttpURLConnection>
	//* 221  465:invokevirtual   #487 <Method int HttpURLConnection.getResponseCode()>
	//* 222  468:sipush          400
	//* 223  471:icmplt          477
	//* 224  474:iconst_1        
	//* 225  475:istore          9
	//* 226  477:iload           9
	//* 227  479:ifeq            499
	//* 228  482:aload_1         
	//* 229  483:astore_3        
	//* 230  484:aload_1         
	//* 231  485:astore          4
	//* 232  487:aload_2         
	//* 233  488:checkcast       #464 <Class HttpURLConnection>
	//* 234  491:invokevirtual   #491 <Method java.io.InputStream HttpURLConnection.getErrorStream()>
	//* 235  494:astore          5
	//* 236  496:goto            510
	//* 237  499:aload_1         
	//* 238  500:astore_3        
	//* 239  501:aload_1         
	//* 240  502:astore          4
	//* 241  504:aload_2         
	//* 242  505:invokevirtual   #494 <Method java.io.InputStream URLConnection.getInputStream()>
	//* 243  508:astore          5
	//* 244  510:aload_1         
	//* 245  511:astore_3        
	//* 246  512:aload_1         
	//* 247  513:astore          4
	//* 248  515:ldc2            #455 <String "gzip">
	//* 249  518:aload_2         
	//* 250  519:invokevirtual   #497 <Method String URLConnection.getContentEncoding()>
	//* 251  522:invokevirtual   #423 <Method boolean String.equals(Object)>
	//* 252  525:ifeq            960
	//* 253  528:aload_1         
	//* 254  529:astore_3        
	//* 255  530:aload_1         
	//* 256  531:astore          4
	//* 257  533:new             #499 <Class GZIPInputStream>
	//* 258  536:dup             
	//* 259  537:aload           5
	//* 260  539:invokespecial   #502 <Method void GZIPInputStream(java.io.InputStream)>
	//* 261  542:astore          5
	//* 262  544:goto            547
	//* 263  547:aload_1         
	//* 264  548:astore_3        
	//* 265  549:aload_1         
	//* 266  550:astore          4
	//* 267  552:new             #504 <Class BufferedReader>
	//* 268  555:dup             
	//* 269  556:new             #506 <Class InputStreamReader>
	//* 270  559:dup             
	//* 271  560:aload           5
	//* 272  562:ldc1            #132 <String "UTF-8">
	//* 273  564:invokespecial   #509 <Method void InputStreamReader(java.io.InputStream, String)>
	//* 274  567:invokespecial   #512 <Method void BufferedReader(java.io.Reader)>
	//* 275  570:astore          5
	//* 276  572:aload           5
	//* 277  574:invokevirtual   #515 <Method String BufferedReader.readLine()>
	//* 278  577:astore_3        
	//* 279  578:aload_3         
	//* 280  579:ifnull          592
	//* 281  582:aload           18
	//* 282  584:aload_3         
	//* 283  585:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//* 284  588:pop             
	//* 285  589:goto            572
	//* 286  592:aload_0         
	//* 287  593:getfield        #98  <Field GSLogger logger>
	//* 288  596:ldc2            #517 <String "server">
	//* 289  599:aload_2         
	//* 290  600:ldc2            #519 <String "x-server">
	//* 291  603:invokevirtual   #522 <Method String URLConnection.getHeaderField(String)>
	//* 292  606:invokevirtual   #302 <Method void GSLogger.write(String, Object)>
	//* 293  609:aload_0         
	//* 294  610:getfield        #98  <Field GSLogger logger>
	//* 295  613:ldc2            #524 <String "raw_response">
	//* 296  616:aload           18
	//* 297  618:invokevirtual   #188 <Method String StringBuilder.toString()>
	//* 298  621:invokevirtual   #302 <Method void GSLogger.write(String, Object)>
	//* 299  624:aload_2         
	//* 300  625:ldc2            #526 <String "Date">
	//* 301  628:invokevirtual   #522 <Method String URLConnection.getHeaderField(String)>
	//* 302  631:astore_3        
	//* 303  632:aload_3         
	//* 304  633:ifnull          667
	//* 305  636:new             #528 <Class SimpleDateFormat>
	//* 306  639:dup             
	//* 307  640:ldc2            #530 <String "EEE, dd MMM yyyy HH:mm:ss zzz">
	//* 308  643:getstatic       #536 <Field Locale Locale.ENGLISH>
	//* 309  646:invokespecial   #539 <Method void SimpleDateFormat(String, Locale)>
	//* 310  649:aload_3         
	//* 311  650:invokevirtual   #543 <Method Date SimpleDateFormat.parse(String)>
	//* 312  653:invokevirtual   #392 <Method long Date.getTime()>
	//* 313  656:invokestatic    #162 <Method long System.currentTimeMillis()>
	//* 314  659:lsub            
	//* 315  660:ldc2w           #163 <Long 1000L>
	//* 316  663:ldiv            
	//* 317  664:putstatic       #411 <Field long timestampOffsetSec>
	//* 318  667:new             #388 <Class Date>
	//* 319  670:dup             
	//* 320  671:invokespecial   #389 <Method void Date()>
	//* 321  674:invokevirtual   #392 <Method long Date.getTime()>
	//* 322  677:lstore          13
	//* 323  679:aload_0         
	//* 324  680:getfield        #98  <Field GSLogger logger>
	//* 325  683:ldc2            #545 <String "request_duration">
	//* 326  686:lload           13
	//* 327  688:lload           11
	//* 328  690:lsub            
	//* 329  691:invokestatic    #548 <Method Long Long.valueOf(long)>
	//* 330  694:invokevirtual   #302 <Method void GSLogger.write(String, Object)>
	//* 331  697:iload           9
	//* 332  699:ifeq            715
	//* 333  702:new             #130 <Class Exception>
	//* 334  705:dup             
	//* 335  706:aload           18
	//* 336  708:invokevirtual   #188 <Method String StringBuilder.toString()>
	//* 337  711:invokespecial   #549 <Method void Exception(String)>
	//* 338  714:athrow          
	//* 339  715:new             #314 <Class GSResponse>
	//* 340  718:dup             
	//* 341  719:aload_0         
	//* 342  720:getfield        #115 <Field String apiMethod>
	//* 343  723:aload           18
	//* 344  725:invokevirtual   #188 <Method String StringBuilder.toString()>
	//* 345  728:aload_0         
	//* 346  729:getfield        #98  <Field GSLogger logger>
	//* 347  732:invokespecial   #552 <Method void GSResponse(String, String, GSLogger)>
	//* 348  735:astore_3        
	//* 349  736:aload_3         
	//* 350  737:aload_2         
	//* 351  738:invokevirtual   #556 <Method java.util.Map URLConnection.getHeaderFields()>
	//* 352  741:putfield        #560 <Field java.util.Map GSResponse.headers>
	//* 353  744:aload_1         
	//* 354  745:ifnull          752
	//* 355  748:aload_1         
	//* 356  749:invokevirtual   #562 <Method void OutputStreamWriter.close()>
	//* 357  752:aload           5
	//* 358  754:ifnull          762
	//* 359  757:aload           5
	//* 360  759:invokevirtual   #563 <Method void BufferedReader.close()>
	//* 361  762:aload_2         
	//* 362  763:ifnull          773
	//* 363  766:aload_2         
	//* 364  767:checkcast       #464 <Class HttpURLConnection>
	//* 365  770:invokevirtual   #566 <Method void HttpURLConnection.disconnect()>
	//* 366  773:aload_3         
	//* 367  774:areturn         
	//* 368  775:astore_3        
	//* 369  776:aload_1         
	//* 370  777:astore          4
	//* 371  779:aload           5
	//* 372  781:astore_1        
	//* 373  782:goto            874
	//* 374  785:astore_3        
	//* 375  786:aload_1         
	//* 376  787:astore          4
	//* 377  789:aload           5
	//* 378  791:astore_1        
	//* 379  792:goto            863
	//* 380  795:astore_1        
	//* 381  796:aload_2         
	//* 382  797:astore          4
	//* 383  799:aconst_null     
	//* 384  800:astore_2        
	//* 385  801:aload_3         
	//* 386  802:astore          5
	//* 387  804:aload           4
	//* 388  806:astore_3        
	//* 389  807:aload           5
	//* 390  809:astore          4
	//* 391  811:goto            884
	//* 392  814:astore_3        
	//* 393  815:aconst_null     
	//* 394  816:astore_1        
	//* 395  817:goto            863
	//* 396  820:astore_1        
	//* 397  821:aload_2         
	//* 398  822:astore_3        
	//* 399  823:aconst_null     
	//* 400  824:astore_2        
	//* 401  825:aload           17
	//* 402  827:astore          4
	//* 403  829:goto            884
		// Misplaced declaration of an exception variable
		catch(String s2)
	//* 404  832:astore_3        
		{
			s = null;
	//  405  833:aconst_null     
	//  406  834:astore_1        
			gsobject = ((GSObject) (obj));
	//  407  835:aload           16
	//  408  837:astore          4
			break MISSING_BLOCK_LABEL_863;
	//  409  839:goto            863
		}
		if(i == -1)
			break MISSING_BLOCK_LABEL_375;
		((URLConnection) (s1)).setConnectTimeout(10000);
		((URLConnection) (s1)).setReadTimeout(i);
		((URLConnection) (s1)).setRequestProperty("Accept-Encoding", "gzip");
		((URLConnection) (s1)).setRequestProperty("connection", "close");
		((HttpURLConnection)s1).setRequestMethod(s);
		if(!s.equals("POST"))
			break MISSING_BLOCK_LABEL_955;
		((URLConnection) (s1)).setDoOutput(true);
		s = ((String) (new OutputStreamWriter(((URLConnection) (s1)).getOutputStream())));
		s2 = s;
		gsobject = ((GSObject) (s));
		try
		{
			((OutputStreamWriter) (s)).write(s3);
		}
		// Misplaced declaration of an exception variable
		catch(String s2)
		{
			s = null;
			break MISSING_BLOCK_LABEL_863;
		}
		s2 = s;
		gsobject = ((GSObject) (s));
		((OutputStreamWriter) (s)).flush();
_L6:
		i = ((int) (flag2));
		s2 = s;
		gsobject = ((GSObject) (s));
		if(((HttpURLConnection)s1).getResponseCode() >= 400)
			i = 1;
		if(i == 0)
			break MISSING_BLOCK_LABEL_499;
		s2 = s;
		gsobject = ((GSObject) (s));
		s3 = ((String) (((HttpURLConnection)s1).getErrorStream()));
		break MISSING_BLOCK_LABEL_510;
		s2 = s;
		gsobject = ((GSObject) (s));
		s3 = ((String) (((URLConnection) (s1)).getInputStream()));
		s2 = s;
		gsobject = ((GSObject) (s));
		if(!"gzip".equals(((Object) (((URLConnection) (s1)).getContentEncoding()))))
			break MISSING_BLOCK_LABEL_547;
		s2 = s;
		gsobject = ((GSObject) (s));
		s3 = ((String) (new GZIPInputStream(((java.io.InputStream) (s3)))));
		s2 = s;
		gsobject = ((GSObject) (s));
		s3 = ((String) (new BufferedReader(((java.io.Reader) (new InputStreamReader(((java.io.InputStream) (s3)), "UTF-8"))))));
_L4:
		try
		{
			s2 = ((BufferedReader) (s3)).readLine();
		}
		// Misplaced declaration of an exception variable
		catch(String s2)
		{
			gsobject = ((GSObject) (s));
			s = s3;
			break MISSING_BLOCK_LABEL_863;
		}
		if(s2 == null)
			break MISSING_BLOCK_LABEL_592;
		stringbuilder.append(s2);
		  goto _L4
		logger.write("server", ((Object) (((URLConnection) (s1)).getHeaderField("x-server"))));
		logger.write("raw_response", ((Object) (stringbuilder.toString())));
		s2 = ((URLConnection) (s1)).getHeaderField("Date");
		if(s2 == null)
			break MISSING_BLOCK_LABEL_667;
		try
		{
			timestampOffsetSec = ((new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.ENGLISH)).parse(s2).getTime() - System.currentTimeMillis()) / 1000L;
		}
	//* 410  842:astore_1        
	//* 411  843:aconst_null     
	//* 412  844:astore_2        
	//* 413  845:aload_2         
	//* 414  846:astore_3        
	//* 415  847:aload           17
	//* 416  849:astore          4
	//* 417  851:goto            884
	//* 418  854:astore_3        
	//* 419  855:aconst_null     
	//* 420  856:astore_1        
	//* 421  857:aload_1         
	//* 422  858:astore_2        
	//* 423  859:aload           16
	//* 424  861:astore          4
	//* 425  863:aload_0         
	//* 426  864:getfield        #98  <Field GSLogger logger>
	//* 427  867:aload_3         
	//* 428  868:invokevirtual   #569 <Method void GSLogger.write(Exception)>
	//* 429  871:aload_3         
	//* 430  872:athrow          
	//* 431  873:astore_3        
	//* 432  874:aload_3         
	//* 433  875:astore          5
	//* 434  877:aload_2         
	//* 435  878:astore_3        
	//* 436  879:aload_1         
	//* 437  880:astore_2        
	//* 438  881:aload           5
	//* 439  883:astore_1        
	//* 440  884:aload           4
	//* 441  886:ifnull          894
	//* 442  889:aload           4
	//* 443  891:invokevirtual   #562 <Method void OutputStreamWriter.close()>
	//* 444  894:aload_2         
	//* 445  895:ifnull          902
	//* 446  898:aload_2         
	//* 447  899:invokevirtual   #563 <Method void BufferedReader.close()>
	//* 448  902:aload_3         
	//* 449  903:ifnull          913
	//* 450  906:aload_3         
	//* 451  907:checkcast       #464 <Class HttpURLConnection>
	//* 452  910:invokevirtual   #566 <Method void HttpURLConnection.disconnect()>
	//* 453  913:aload_1         
	//* 454  914:athrow          
		// Misplaced declaration of an exception variable
		catch(String s2) { }
	//  455  915:astore_3        
		l1 = (new Date()).getTime();
		logger.write("request_duration", ((Object) (Long.valueOf(l1 - l))));
		if(i == 0)
			break MISSING_BLOCK_LABEL_715;
		throw new Exception(stringbuilder.toString());
		s2 = ((String) (new GSResponse(apiMethod, stringbuilder.toString(), logger)));
		s2.headers = ((URLConnection) (s1)).getHeaderFields();
		if(s != null)
			try
			{
				((OutputStreamWriter) (s)).close();
			}
	//* 456  916:goto            667
			// Misplaced declaration of an exception variable
			catch(String s) { }
	//  457  919:astore_1        
		if(s3 != null)
			try
			{
				((BufferedReader) (s3)).close();
			}
	//* 458  920:goto            752
			// Misplaced declaration of an exception variable
			catch(String s) { }
	//  459  923:astore_1        
		if(s1 != null)
			((HttpURLConnection)s1).disconnect();
		return ((GSResponse) (s2));
		s2;
		gsobject = ((GSObject) (s));
		s = s3;
		break MISSING_BLOCK_LABEL_874;
		s;
		gsobject = ((GSObject) (s1));
		s1 = null;
		s3 = s2;
		s2 = ((String) (gsobject));
		gsobject = ((GSObject) (s3));
		break MISSING_BLOCK_LABEL_884;
		s;
		s2 = s1;
		s1 = null;
		gsobject = ((GSObject) (obj1));
		break MISSING_BLOCK_LABEL_884;
		s;
		s1 = null;
		s2 = s1;
		gsobject = ((GSObject) (obj1));
		break MISSING_BLOCK_LABEL_884;
		s2;
		s = null;
		s1 = s;
		gsobject = ((GSObject) (obj));
		logger.write(((Exception) (s2)));
		throw s2;
		s2;
		s3 = s2;
		s2 = s1;
		s1 = s;
		s = s3;
		if(gsobject != null)
			try
			{
				((OutputStreamWriter) (gsobject)).close();
			}
	//* 460  924:goto            762
			// Misplaced declaration of an exception variable
			catch(GSObject gsobject) { }
	//  461  927:astore          4
		if(s1 != null)
			try
			{
				((BufferedReader) (s1)).close();
			}
	//* 462  929:goto            894
			// Misplaced declaration of an exception variable
			catch(String s1) { }
	//  463  932:astore_2        
		if(s2 != null)
			((HttpURLConnection)s2).disconnect();
		throw s;
	//* 464  933:goto            902
	//* 465  936:goto            51
_L3:
		s5 = "http";
	//  466  939:ldc2            #571 <String "http">
	//  467  942:astore          15
		  goto _L5
	//* 468  944:goto            66
_L2:
		s5 = "https";
	//  469  947:ldc2            #573 <String "https">
	//  470  950:astore          15
		  goto _L5
	//* 471  952:goto            66
		s = null;
	//  472  955:aconst_null     
	//  473  956:astore_1        
		  goto _L6
	//* 474  957:goto            452
	//* 475  960:goto            547
	}

	public void setAPIDomain(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
	//*   2    4:aload_0         
	//*   3    5:aload_1         
	//*   4    6:putfield        #91  <Field String apiDomain>
	//*   5    9:return          
			s = "us1.gigya.com";
	//    6   10:ldc1            #10  <String "us1.gigya.com">
	//    7   12:astore_1        
		apiDomain = s;
	//*   8   13:goto            4
	}

	public void setHostOverride(String s)
	{
		hostOverride = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #93  <Field String hostOverride>
	//    3    5:return          
	}

	public void setHttpMethod(String s)
	{
		httpMethod = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #85  <Field String httpMethod>
	//    3    5:return          
	}

	public void setLogger(GSLogger gslogger)
	{
		if(gslogger != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
			logger.write(((Object) (gslogger.toString())));
	//    2    4:aload_0         
	//    3    5:getfield        #98  <Field GSLogger logger>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #579 <Method String GSLogger.toString()>
	//    6   12:invokevirtual   #582 <Method void GSLogger.write(Object)>
	//    7   15:return          
	}

	public void setMethod(String s)
	{
		apiMethod = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #115 <Field String apiMethod>
	//    3    5:return          
	}

	public void setParam(String s, int i)
	{
		params.put(s, i);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field GSObject params>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #586 <Method void GSObject.put(String, int)>
	//    5    9:return          
	}

	public void setParam(String s, long l)
	{
		params.put(s, l);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field GSObject params>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #589 <Method void GSObject.put(String, long)>
	//    5    9:return          
	}

	public void setParam(String s, GSArray gsarray)
	{
		params.put(s, gsarray);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field GSObject params>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #592 <Method void GSObject.put(String, GSArray)>
	//    5    9:return          
	}

	public void setParam(String s, GSObject gsobject)
	{
		params.put(s, gsobject);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field GSObject params>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #595 <Method void GSObject.put(String, GSObject)>
	//    5    9:return          
	}

	public void setParam(String s, String s1)
	{
		params.put(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field GSObject params>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #193 <Method void GSObject.put(String, String)>
	//    5    9:return          
	}

	public void setParam(String s, boolean flag)
	{
		params.put(s, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field GSObject params>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #598 <Method void GSObject.put(String, boolean)>
	//    5    9:return          
	}

	public void setParams(GSObject gsobject)
	{
		if(gsobject == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       18
			gsobject = new GSObject();
	//    2    4:new             #106 <Class GSObject>
	//    3    7:dup             
	//    4    8:invokespecial   #107 <Method void GSObject()>
	//    5   11:astore_1        
		else
	//*   6   12:aload_0         
	//*   7   13:aload_1         
	//*   8   14:putfield        #109 <Field GSObject params>
	//*   9   17:return          
			gsobject = gsobject.clone();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #113 <Method GSObject GSObject.clone()>
	//   12   22:astore_1        
		params = gsobject;
	//*  13   23:goto            12
	}

	public void setProxy(Proxy proxy1)
	{
		proxy = proxy1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #100 <Field Proxy proxy>
	//    3    5:return          
	}

	public void setUseHTTPS(boolean flag)
	{
		useHTTPS = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #123 <Field boolean useHTTPS>
	//    3    5:return          
	}

	public String urlEncodedParam(String s)
	{
		return UrlEncode(params.getString(s, ((String) (null))));
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field GSObject params>
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #225 <Method String GSObject.getString(String, String)>
	//    5    9:invokestatic    #227 <Method String UrlEncode(String)>
	//    6   12:areturn         
	}

	private static final String DEFAULT_API_DOMAIN = "us1.gigya.com";
	private static Random randomGenerator = new Random();
	protected static long timestampOffsetSec = 0L;
	private static char unreservedChars[];
	private static String unreservedCharsString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_.~";
	private String accessToken;
	protected String apiDomain;
	private String apiKey;
	protected String apiMethod;
	protected String format;
	private String host;
	protected String hostOverride;
	private String httpMethod;
	private boolean isLoggedIn;
	private boolean isTimestampExpiredRetry;
	private boolean isUnauthorizedUserRetry;
	private GSLogger logger;
	private GSObject originalParams;
	private GSObject params;
	private String path;
	private Proxy proxy;
	private String secretKey;
	private boolean useHTTPS;
	private String userKey;

	static 
	{
	//    0    0:new             #48  <Class Random>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void Random()>
	//    3    7:putstatic       #53  <Field Random randomGenerator>
		unreservedChars = unreservedCharsString.toCharArray();
	//    4   10:getstatic       #55  <Field String unreservedCharsString>
	//    5   13:invokevirtual   #61  <Method char[] String.toCharArray()>
	//    6   16:putstatic       #63  <Field char[] unreservedChars>
		Arrays.sort(unreservedChars);
	//    7   19:getstatic       #63  <Field char[] unreservedChars>
	//    8   22:invokestatic    #69  <Method void Arrays.sort(char[])>
	//*   9   25:return          
	}
}
