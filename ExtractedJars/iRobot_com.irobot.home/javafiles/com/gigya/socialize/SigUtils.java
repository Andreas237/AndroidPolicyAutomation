// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize;

import java.net.URL;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.gigya.socialize:
//			GSObject, GSRequest, Base64

public class SigUtils
{

	public SigUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String calcOAuth1BaseString(String s, String s1, GSObject gsobject)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #13  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void StringBuilder()>
	//    3    7:astore          5
		s1 = ((String) (new URL(s1)));
	//    4    9:new             #16  <Class URL>
	//    5   12:dup             
	//    6   13:aload_1         
	//    7   14:invokespecial   #19  <Method void URL(String)>
	//    8   17:astore_1        
		stringbuilder.append(((URL) (s1)).getProtocol().toLowerCase());
	//    9   18:aload           5
	//   10   20:aload_1         
	//   11   21:invokevirtual   #23  <Method String URL.getProtocol()>
	//   12   24:invokevirtual   #28  <Method String String.toLowerCase()>
	//   13   27:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		stringbuilder.append("://");
	//   15   31:aload           5
	//   16   33:ldc1            #34  <String "://">
	//   17   35:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
		stringbuilder.append(((URL) (s1)).getHost().toLowerCase());
	//   19   39:aload           5
	//   20   41:aload_1         
	//   21   42:invokevirtual   #37  <Method String URL.getHost()>
	//   22   45:invokevirtual   #28  <Method String String.toLowerCase()>
	//   23   48:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   24   51:pop             
		if(((URL) (s1)).getProtocol().toUpperCase().equals("HTTP") && ((URL) (s1)).getPort() != 80 && ((URL) (s1)).getPort() != -1 || ((URL) (s1)).getProtocol().toUpperCase().equals("HTTPS") && ((URL) (s1)).getPort() != 443 && ((URL) (s1)).getPort() != -1)
	//*  25   52:aload_1         
	//*  26   53:invokevirtual   #23  <Method String URL.getProtocol()>
	//*  27   56:invokevirtual   #40  <Method String String.toUpperCase()>
	//*  28   59:ldc1            #42  <String "HTTP">
	//*  29   61:invokevirtual   #46  <Method boolean String.equals(Object)>
	//*  30   64:ifeq            84
	//*  31   67:aload_1         
	//*  32   68:invokevirtual   #50  <Method int URL.getPort()>
	//*  33   71:bipush          80
	//*  34   73:icmpeq          84
	//*  35   76:aload_1         
	//*  36   77:invokevirtual   #50  <Method int URL.getPort()>
	//*  37   80:iconst_m1       
	//*  38   81:icmpne          117
	//*  39   84:aload_1         
	//*  40   85:invokevirtual   #23  <Method String URL.getProtocol()>
	//*  41   88:invokevirtual   #40  <Method String String.toUpperCase()>
	//*  42   91:ldc1            #52  <String "HTTPS">
	//*  43   93:invokevirtual   #46  <Method boolean String.equals(Object)>
	//*  44   96:ifeq            135
	//*  45   99:aload_1         
	//*  46  100:invokevirtual   #50  <Method int URL.getPort()>
	//*  47  103:sipush          443
	//*  48  106:icmpeq          135
	//*  49  109:aload_1         
	//*  50  110:invokevirtual   #50  <Method int URL.getPort()>
	//*  51  113:iconst_m1       
	//*  52  114:icmpeq          135
		{
			stringbuilder.append(':');
	//   53  117:aload           5
	//   54  119:bipush          58
	//   55  121:invokevirtual   #55  <Method StringBuilder StringBuilder.append(char)>
	//   56  124:pop             
			stringbuilder.append(((URL) (s1)).getPort());
	//   57  125:aload           5
	//   58  127:aload_1         
	//   59  128:invokevirtual   #50  <Method int URL.getPort()>
	//   60  131:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
	//   61  134:pop             
		}
		stringbuilder.append(((URL) (s1)).getPath());
	//   62  135:aload           5
	//   63  137:aload_1         
	//   64  138:invokevirtual   #61  <Method String URL.getPath()>
	//   65  141:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   66  144:pop             
		s1 = ((String) (new StringBuilder()));
	//   67  145:new             #13  <Class StringBuilder>
	//   68  148:dup             
	//   69  149:invokespecial   #14  <Method void StringBuilder()>
	//   70  152:astore_1        
		String as[] = gsobject.getKeys();
	//   71  153:aload_2         
	//   72  154:invokevirtual   #67  <Method String[] GSObject.getKeys()>
	//   73  157:astore          6
		int j = as.length;
	//   74  159:aload           6
	//   75  161:arraylength     
	//   76  162:istore          4
		for(int i = 0; i < j; i++)
	//*  77  164:iconst_0        
	//*  78  165:istore_3        
	//*  79  166:iload_3         
	//*  80  167:iload           4
	//*  81  169:icmpge          221
		{
			String s2 = as[i];
	//   82  172:aload           6
	//   83  174:iload_3         
	//   84  175:aaload          
	//   85  176:astore          7
			((StringBuilder) (s1)).append(s2);
	//   86  178:aload_1         
	//   87  179:aload           7
	//   88  181:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   89  184:pop             
			((StringBuilder) (s1)).append("=");
	//   90  185:aload_1         
	//   91  186:ldc1            #69  <String "=">
	//   92  188:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   93  191:pop             
			((StringBuilder) (s1)).append(GSRequest.UrlEncode(gsobject.getString(s2, ((String) (null)))));
	//   94  192:aload_1         
	//   95  193:aload_2         
	//   96  194:aload           7
	//   97  196:aconst_null     
	//   98  197:invokevirtual   #73  <Method String GSObject.getString(String, String)>
	//   99  200:invokestatic    #79  <Method String GSRequest.UrlEncode(String)>
	//  100  203:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//  101  206:pop             
			((StringBuilder) (s1)).append("&");
	//  102  207:aload_1         
	//  103  208:ldc1            #81  <String "&">
	//  104  210:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//  105  213:pop             
		}

	//  106  214:iload_3         
	//  107  215:iconst_1        
	//  108  216:iadd            
	//  109  217:istore_3        
	//* 110  218:goto            166
		((StringBuilder) (s1)).deleteCharAt(((StringBuilder) (s1)).length() - 1);
	//  111  221:aload_1         
	//  112  222:aload_1         
	//  113  223:invokevirtual   #84  <Method int StringBuilder.length()>
	//  114  226:iconst_1        
	//  115  227:isub            
	//  116  228:invokevirtual   #87  <Method StringBuilder StringBuilder.deleteCharAt(int)>
	//  117  231:pop             
		gsobject = ((GSObject) (new StringBuilder()));
	//  118  232:new             #13  <Class StringBuilder>
	//  119  235:dup             
	//  120  236:invokespecial   #14  <Method void StringBuilder()>
	//  121  239:astore_2        
		((StringBuilder) (gsobject)).append(s.toUpperCase());
	//  122  240:aload_2         
	//  123  241:aload_0         
	//  124  242:invokevirtual   #40  <Method String String.toUpperCase()>
	//  125  245:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//  126  248:pop             
		((StringBuilder) (gsobject)).append("&");
	//  127  249:aload_2         
	//  128  250:ldc1            #81  <String "&">
	//  129  252:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//  130  255:pop             
		((StringBuilder) (gsobject)).append(GSRequest.UrlEncode(stringbuilder.toString()));
	//  131  256:aload_2         
	//  132  257:aload           5
	//  133  259:invokevirtual   #90  <Method String StringBuilder.toString()>
	//  134  262:invokestatic    #79  <Method String GSRequest.UrlEncode(String)>
	//  135  265:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//  136  268:pop             
		((StringBuilder) (gsobject)).append("&");
	//  137  269:aload_2         
	//  138  270:ldc1            #81  <String "&">
	//  139  272:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//  140  275:pop             
		((StringBuilder) (gsobject)).append(GSRequest.UrlEncode(((StringBuilder) (s1)).toString()));
	//  141  276:aload_2         
	//  142  277:aload_1         
	//  143  278:invokevirtual   #90  <Method String StringBuilder.toString()>
	//  144  281:invokestatic    #79  <Method String GSRequest.UrlEncode(String)>
	//  145  284:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//  146  287:pop             
		return ((StringBuilder) (gsobject)).toString();
	//  147  288:aload_2         
	//  148  289:invokevirtual   #90  <Method String StringBuilder.toString()>
	//  149  292:areturn         
	}

	private static String calcSignature(String s, String s1, byte abyte0[])
	{
		s1 = ((String) (s1.getBytes("UTF-8")));
	//    0    0:aload_1         
	//    1    1:ldc1            #96  <String "UTF-8">
	//    2    3:invokevirtual   #100 <Method byte[] String.getBytes(String)>
	//    3    6:astore_1        
		abyte0 = ((byte []) (new SecretKeySpec(abyte0, s)));
	//    4    7:new             #102 <Class SecretKeySpec>
	//    5   10:dup             
	//    6   11:aload_2         
	//    7   12:aload_0         
	//    8   13:invokespecial   #105 <Method void SecretKeySpec(byte[], String)>
	//    9   16:astore_2        
		try
		{
			s = ((String) (Mac.getInstance(s)));
	//   10   17:aload_0         
	//   11   18:invokestatic    #111 <Method Mac Mac.getInstance(String)>
	//   12   21:astore_0        
		}
	//*  13   22:aload_0         
	//*  14   23:aload_2         
	//*  15   24:invokevirtual   #115 <Method void Mac.init(java.security.Key)>
	//*  16   27:aload_0         
	//*  17   28:aload_1         
	//*  18   29:invokevirtual   #119 <Method byte[] Mac.doFinal(byte[])>
	//*  19   32:iconst_0        
	//*  20   33:invokestatic    #125 <Method String Base64.encodeToString(byte[], boolean)>
	//*  21   36:areturn         
	//*  22   37:aconst_null     
	//*  23   38:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return null;
		}
		((Mac) (s)).init(((java.security.Key) (abyte0)));
		return Base64.encodeToString(((Mac) (s)).doFinal(((byte []) (s1))), false);
	//*  24   39:astore_0        
	//*  25   40:goto            37
	}

	public static String getOAuth1Signature(String s, String s1)
	{
		return calcSignature("HmacSHA1", s, Base64.decode(s1));
	//    0    0:ldc1            #128 <String "HmacSHA1">
	//    1    2:aload_0         
	//    2    3:aload_1         
	//    3    4:invokestatic    #131 <Method byte[] Base64.decode(String)>
	//    4    7:invokestatic    #133 <Method String calcSignature(String, String, byte[])>
	//    5   10:areturn         
	}
}
