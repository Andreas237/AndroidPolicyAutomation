// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import java.io.IOException;
import java.io.InputStream;
import java.security.*;
import java.util.HashMap;

public class DigestAlgorithms
{

	public DigestAlgorithms()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #123 <Method void Object()>
	//    2    4:return          
	}

	public static byte[] digest(InputStream inputstream, String s, String s1)
		throws GeneralSecurityException, IOException
	{
		return digest(inputstream, getMessageDigest(s, s1));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #133 <Method MessageDigest getMessageDigest(String, String)>
	//    4    6:invokestatic    #136 <Method byte[] digest(InputStream, MessageDigest)>
	//    5    9:areturn         
	}

	public static byte[] digest(InputStream inputstream, MessageDigest messagedigest)
		throws GeneralSecurityException, IOException
	{
		byte abyte0[] = new byte[8192];
	//    0    0:sipush          8192
	//    1    3:newarray        byte[]
	//    2    5:astore_3        
		do
		{
			int i = inputstream.read(abyte0);
	//    3    6:aload_0         
	//    4    7:aload_3         
	//    5    8:invokevirtual   #143 <Method int InputStream.read(byte[])>
	//    6   11:istore_2        
			if(i > 0)
	//*   7   12:iload_2         
	//*   8   13:ifle            26
				messagedigest.update(abyte0, 0, i);
	//    9   16:aload_1         
	//   10   17:aload_3         
	//   11   18:iconst_0        
	//   12   19:iload_2         
	//   13   20:invokevirtual   #149 <Method void MessageDigest.update(byte[], int, int)>
			else
	//*  14   23:goto            6
				return messagedigest.digest();
	//   15   26:aload_1         
	//   16   27:invokevirtual   #152 <Method byte[] MessageDigest.digest()>
	//   17   30:areturn         
		} while(true);
	}

	public static String getAllowedDigests(String s)
	{
		return (String)allowedDigests.get(((Object) (s.toUpperCase())));
	//    0    0:getstatic       #37  <Field HashMap allowedDigests>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #160 <Method String String.toUpperCase()>
	//    3    7:invokevirtual   #164 <Method Object HashMap.get(Object)>
	//    4   10:checkcast       #156 <Class String>
	//    5   13:areturn         
	}

	public static String getDigest(String s)
	{
		String s1 = (String)digestNames.get(((Object) (s)));
	//    0    0:getstatic       #33  <Field HashMap digestNames>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #164 <Method Object HashMap.get(Object)>
	//    3    7:checkcast       #156 <Class String>
	//    4   10:astore_1        
		if(s1 == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       17
			return s;
	//    7   15:aload_0         
	//    8   16:areturn         
		else
			return s1;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public static MessageDigest getMessageDigest(String s, String s1)
		throws NoSuchAlgorithmException, NoSuchProviderException
	{
		if(s1 == null || s1.startsWith("SunPKCS11") || s1.startsWith("SunMSCAPI"))
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:ldc1            #171 <String "SunPKCS11">
	//*   4    7:invokevirtual   #175 <Method boolean String.startsWith(String)>
	//*   5   10:ifne            22
	//*   6   13:aload_1         
	//*   7   14:ldc1            #177 <String "SunMSCAPI">
	//*   8   16:invokevirtual   #175 <Method boolean String.startsWith(String)>
	//*   9   19:ifeq            30
			return MessageDigest.getInstance(normalizeDigestName(s));
	//   10   22:aload_0         
	//   11   23:invokestatic    #180 <Method String normalizeDigestName(String)>
	//   12   26:invokestatic    #184 <Method MessageDigest MessageDigest.getInstance(String)>
	//   13   29:areturn         
		else
			return MessageDigest.getInstance(s, s1);
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:invokestatic    #186 <Method MessageDigest MessageDigest.getInstance(String, String)>
	//   17   35:areturn         
	}

	public static MessageDigest getMessageDigestFromOid(String s, String s1)
		throws NoSuchAlgorithmException, NoSuchProviderException
	{
		return getMessageDigest(getDigest(s), s1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #189 <Method String getDigest(String)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #133 <Method MessageDigest getMessageDigest(String, String)>
	//    4    8:areturn         
	}

	public static String normalizeDigestName(String s)
	{
		if(fixNames.containsKey(((Object) (s))))
	//*   0    0:getstatic       #35  <Field HashMap fixNames>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #193 <Method boolean HashMap.containsKey(Object)>
	//*   3    7:ifeq            21
			return (String)fixNames.get(((Object) (s)));
	//    4   10:getstatic       #35  <Field HashMap fixNames>
	//    5   13:aload_0         
	//    6   14:invokevirtual   #164 <Method Object HashMap.get(Object)>
	//    7   17:checkcast       #156 <Class String>
	//    8   20:areturn         
		else
			return s;
	//    9   21:aload_0         
	//   10   22:areturn         
	}

	public static final String RIPEMD160 = "RIPEMD160";
	public static final String SHA1 = "SHA-1";
	public static final String SHA256 = "SHA-256";
	public static final String SHA384 = "SHA-384";
	public static final String SHA512 = "SHA-512";
	private static final HashMap allowedDigests;
	private static final HashMap digestNames;
	private static final HashMap fixNames;

	static 
	{
		digestNames = new HashMap();
	//    0    0:new             #28  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void HashMap()>
	//    3    7:putstatic       #33  <Field HashMap digestNames>
		fixNames = new HashMap();
	//    4   10:new             #28  <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #31  <Method void HashMap()>
	//    7   17:putstatic       #35  <Field HashMap fixNames>
		allowedDigests = new HashMap();
	//    8   20:new             #28  <Class HashMap>
	//    9   23:dup             
	//   10   24:invokespecial   #31  <Method void HashMap()>
	//   11   27:putstatic       #37  <Field HashMap allowedDigests>
		digestNames.put("1.2.840.113549.2.5", "MD5");
	//   12   30:getstatic       #33  <Field HashMap digestNames>
	//   13   33:ldc1            #39  <String "1.2.840.113549.2.5">
	//   14   35:ldc1            #41  <String "MD5">
	//   15   37:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//   16   40:pop             
		digestNames.put("1.2.840.113549.2.2", "MD2");
	//   17   41:getstatic       #33  <Field HashMap digestNames>
	//   18   44:ldc1            #47  <String "1.2.840.113549.2.2">
	//   19   46:ldc1            #49  <String "MD2">
	//   20   48:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//   21   51:pop             
		digestNames.put("1.3.14.3.2.26", "SHA1");
	//   22   52:getstatic       #33  <Field HashMap digestNames>
	//   23   55:ldc1            #51  <String "1.3.14.3.2.26">
	//   24   57:ldc1            #52  <String "SHA1">
	//   25   59:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//   26   62:pop             
		digestNames.put("2.16.840.1.101.3.4.2.4", "SHA224");
	//   27   63:getstatic       #33  <Field HashMap digestNames>
	//   28   66:ldc1            #54  <String "2.16.840.1.101.3.4.2.4">
	//   29   68:ldc1            #56  <String "SHA224">
	//   30   70:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//   31   73:pop             
		digestNames.put("2.16.840.1.101.3.4.2.1", "SHA256");
	//   32   74:getstatic       #33  <Field HashMap digestNames>
	//   33   77:ldc1            #58  <String "2.16.840.1.101.3.4.2.1">
	//   34   79:ldc1            #59  <String "SHA256">
	//   35   81:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//   36   84:pop             
		digestNames.put("2.16.840.1.101.3.4.2.2", "SHA384");
	//   37   85:getstatic       #33  <Field HashMap digestNames>
	//   38   88:ldc1            #61  <String "2.16.840.1.101.3.4.2.2">
	//   39   90:ldc1            #62  <String "SHA384">
	//   40   92:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//   41   95:pop             
		digestNames.put("2.16.840.1.101.3.4.2.3", "SHA512");
	//   42   96:getstatic       #33  <Field HashMap digestNames>
	//   43   99:ldc1            #64  <String "2.16.840.1.101.3.4.2.3">
	//   44  101:ldc1            #65  <String "SHA512">
	//   45  103:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//   46  106:pop             
		digestNames.put("1.3.36.3.2.2", "RIPEMD128");
	//   47  107:getstatic       #33  <Field HashMap digestNames>
	//   48  110:ldc1            #67  <String "1.3.36.3.2.2">
	//   49  112:ldc1            #69  <String "RIPEMD128">
	//   50  114:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//   51  117:pop             
		digestNames.put("1.3.36.3.2.1", "RIPEMD160");
	//   52  118:getstatic       #33  <Field HashMap digestNames>
	//   53  121:ldc1            #71  <String "1.3.36.3.2.1">
	//   54  123:ldc1            #7   <String "RIPEMD160">
	//   55  125:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//   56  128:pop             
		digestNames.put("1.3.36.3.2.3", "RIPEMD256");
	//   57  129:getstatic       #33  <Field HashMap digestNames>
	//   58  132:ldc1            #73  <String "1.3.36.3.2.3">
	//   59  134:ldc1            #75  <String "RIPEMD256">
	//   60  136:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//   61  139:pop             
		digestNames.put("1.2.840.113549.1.1.4", "MD5");
	//   62  140:getstatic       #33  <Field HashMap digestNames>
	//   63  143:ldc1            #77  <String "1.2.840.113549.1.1.4">
	//   64  145:ldc1            #41  <String "MD5">
	//   65  147:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//   66  150:pop             
		digestNames.put("1.2.840.113549.1.1.2", "MD2");
	//   67  151:getstatic       #33  <Field HashMap digestNames>
	//   68  154:ldc1            #79  <String "1.2.840.113549.1.1.2">
	//   69  156:ldc1            #49  <String "MD2">
	//   70  158:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//   71  161:pop             
		digestNames.put("1.2.840.113549.1.1.5", "SHA1");
	//   72  162:getstatic       #33  <Field HashMap digestNames>
	//   73  165:ldc1            #81  <String "1.2.840.113549.1.1.5">
	//   74  167:ldc1            #52  <String "SHA1">
	//   75  169:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//   76  172:pop             
		digestNames.put("1.2.840.113549.1.1.14", "SHA224");
	//   77  173:getstatic       #33  <Field HashMap digestNames>
	//   78  176:ldc1            #83  <String "1.2.840.113549.1.1.14">
	//   79  178:ldc1            #56  <String "SHA224">
	//   80  180:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//   81  183:pop             
		digestNames.put("1.2.840.113549.1.1.11", "SHA256");
	//   82  184:getstatic       #33  <Field HashMap digestNames>
	//   83  187:ldc1            #85  <String "1.2.840.113549.1.1.11">
	//   84  189:ldc1            #59  <String "SHA256">
	//   85  191:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//   86  194:pop             
		digestNames.put("1.2.840.113549.1.1.12", "SHA384");
	//   87  195:getstatic       #33  <Field HashMap digestNames>
	//   88  198:ldc1            #87  <String "1.2.840.113549.1.1.12">
	//   89  200:ldc1            #62  <String "SHA384">
	//   90  202:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//   91  205:pop             
		digestNames.put("1.2.840.113549.1.1.13", "SHA512");
	//   92  206:getstatic       #33  <Field HashMap digestNames>
	//   93  209:ldc1            #89  <String "1.2.840.113549.1.1.13">
	//   94  211:ldc1            #65  <String "SHA512">
	//   95  213:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//   96  216:pop             
		digestNames.put("1.2.840.113549.2.5", "MD5");
	//   97  217:getstatic       #33  <Field HashMap digestNames>
	//   98  220:ldc1            #39  <String "1.2.840.113549.2.5">
	//   99  222:ldc1            #41  <String "MD5">
	//  100  224:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  101  227:pop             
		digestNames.put("1.2.840.113549.2.2", "MD2");
	//  102  228:getstatic       #33  <Field HashMap digestNames>
	//  103  231:ldc1            #47  <String "1.2.840.113549.2.2">
	//  104  233:ldc1            #49  <String "MD2">
	//  105  235:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  106  238:pop             
		digestNames.put("1.2.840.10040.4.3", "SHA1");
	//  107  239:getstatic       #33  <Field HashMap digestNames>
	//  108  242:ldc1            #91  <String "1.2.840.10040.4.3">
	//  109  244:ldc1            #52  <String "SHA1">
	//  110  246:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  111  249:pop             
		digestNames.put("2.16.840.1.101.3.4.3.1", "SHA224");
	//  112  250:getstatic       #33  <Field HashMap digestNames>
	//  113  253:ldc1            #93  <String "2.16.840.1.101.3.4.3.1">
	//  114  255:ldc1            #56  <String "SHA224">
	//  115  257:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  116  260:pop             
		digestNames.put("2.16.840.1.101.3.4.3.2", "SHA256");
	//  117  261:getstatic       #33  <Field HashMap digestNames>
	//  118  264:ldc1            #95  <String "2.16.840.1.101.3.4.3.2">
	//  119  266:ldc1            #59  <String "SHA256">
	//  120  268:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  121  271:pop             
		digestNames.put("2.16.840.1.101.3.4.3.3", "SHA384");
	//  122  272:getstatic       #33  <Field HashMap digestNames>
	//  123  275:ldc1            #97  <String "2.16.840.1.101.3.4.3.3">
	//  124  277:ldc1            #62  <String "SHA384">
	//  125  279:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  126  282:pop             
		digestNames.put("2.16.840.1.101.3.4.3.4", "SHA512");
	//  127  283:getstatic       #33  <Field HashMap digestNames>
	//  128  286:ldc1            #99  <String "2.16.840.1.101.3.4.3.4">
	//  129  288:ldc1            #65  <String "SHA512">
	//  130  290:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  131  293:pop             
		digestNames.put("1.3.36.3.3.1.3", "RIPEMD128");
	//  132  294:getstatic       #33  <Field HashMap digestNames>
	//  133  297:ldc1            #101 <String "1.3.36.3.3.1.3">
	//  134  299:ldc1            #69  <String "RIPEMD128">
	//  135  301:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  136  304:pop             
		digestNames.put("1.3.36.3.3.1.2", "RIPEMD160");
	//  137  305:getstatic       #33  <Field HashMap digestNames>
	//  138  308:ldc1            #103 <String "1.3.36.3.3.1.2">
	//  139  310:ldc1            #7   <String "RIPEMD160">
	//  140  312:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  141  315:pop             
		digestNames.put("1.3.36.3.3.1.4", "RIPEMD256");
	//  142  316:getstatic       #33  <Field HashMap digestNames>
	//  143  319:ldc1            #105 <String "1.3.36.3.3.1.4">
	//  144  321:ldc1            #75  <String "RIPEMD256">
	//  145  323:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  146  326:pop             
		digestNames.put("1.2.643.2.2.9", "GOST3411");
	//  147  327:getstatic       #33  <Field HashMap digestNames>
	//  148  330:ldc1            #107 <String "1.2.643.2.2.9">
	//  149  332:ldc1            #109 <String "GOST3411">
	//  150  334:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  151  337:pop             
		fixNames.put("SHA256", "SHA-256");
	//  152  338:getstatic       #35  <Field HashMap fixNames>
	//  153  341:ldc1            #59  <String "SHA256">
	//  154  343:ldc1            #13  <String "SHA-256">
	//  155  345:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  156  348:pop             
		fixNames.put("SHA384", "SHA-384");
	//  157  349:getstatic       #35  <Field HashMap fixNames>
	//  158  352:ldc1            #62  <String "SHA384">
	//  159  354:ldc1            #16  <String "SHA-384">
	//  160  356:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  161  359:pop             
		fixNames.put("SHA512", "SHA-512");
	//  162  360:getstatic       #35  <Field HashMap fixNames>
	//  163  363:ldc1            #65  <String "SHA512">
	//  164  365:ldc1            #19  <String "SHA-512">
	//  165  367:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  166  370:pop             
		allowedDigests.put("MD2", "1.2.840.113549.2.2");
	//  167  371:getstatic       #37  <Field HashMap allowedDigests>
	//  168  374:ldc1            #49  <String "MD2">
	//  169  376:ldc1            #47  <String "1.2.840.113549.2.2">
	//  170  378:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  171  381:pop             
		allowedDigests.put("MD-2", "1.2.840.113549.2.2");
	//  172  382:getstatic       #37  <Field HashMap allowedDigests>
	//  173  385:ldc1            #111 <String "MD-2">
	//  174  387:ldc1            #47  <String "1.2.840.113549.2.2">
	//  175  389:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  176  392:pop             
		allowedDigests.put("MD5", "1.2.840.113549.2.5");
	//  177  393:getstatic       #37  <Field HashMap allowedDigests>
	//  178  396:ldc1            #41  <String "MD5">
	//  179  398:ldc1            #39  <String "1.2.840.113549.2.5">
	//  180  400:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  181  403:pop             
		allowedDigests.put("MD-5", "1.2.840.113549.2.5");
	//  182  404:getstatic       #37  <Field HashMap allowedDigests>
	//  183  407:ldc1            #113 <String "MD-5">
	//  184  409:ldc1            #39  <String "1.2.840.113549.2.5">
	//  185  411:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  186  414:pop             
		allowedDigests.put("SHA1", "1.3.14.3.2.26");
	//  187  415:getstatic       #37  <Field HashMap allowedDigests>
	//  188  418:ldc1            #52  <String "SHA1">
	//  189  420:ldc1            #51  <String "1.3.14.3.2.26">
	//  190  422:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  191  425:pop             
		allowedDigests.put("SHA-1", "1.3.14.3.2.26");
	//  192  426:getstatic       #37  <Field HashMap allowedDigests>
	//  193  429:ldc1            #10  <String "SHA-1">
	//  194  431:ldc1            #51  <String "1.3.14.3.2.26">
	//  195  433:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  196  436:pop             
		allowedDigests.put("SHA224", "2.16.840.1.101.3.4.2.4");
	//  197  437:getstatic       #37  <Field HashMap allowedDigests>
	//  198  440:ldc1            #56  <String "SHA224">
	//  199  442:ldc1            #54  <String "2.16.840.1.101.3.4.2.4">
	//  200  444:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  201  447:pop             
		allowedDigests.put("SHA-224", "2.16.840.1.101.3.4.2.4");
	//  202  448:getstatic       #37  <Field HashMap allowedDigests>
	//  203  451:ldc1            #115 <String "SHA-224">
	//  204  453:ldc1            #54  <String "2.16.840.1.101.3.4.2.4">
	//  205  455:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  206  458:pop             
		allowedDigests.put("SHA256", "2.16.840.1.101.3.4.2.1");
	//  207  459:getstatic       #37  <Field HashMap allowedDigests>
	//  208  462:ldc1            #59  <String "SHA256">
	//  209  464:ldc1            #58  <String "2.16.840.1.101.3.4.2.1">
	//  210  466:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  211  469:pop             
		allowedDigests.put("SHA-256", "2.16.840.1.101.3.4.2.1");
	//  212  470:getstatic       #37  <Field HashMap allowedDigests>
	//  213  473:ldc1            #13  <String "SHA-256">
	//  214  475:ldc1            #58  <String "2.16.840.1.101.3.4.2.1">
	//  215  477:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  216  480:pop             
		allowedDigests.put("SHA384", "2.16.840.1.101.3.4.2.2");
	//  217  481:getstatic       #37  <Field HashMap allowedDigests>
	//  218  484:ldc1            #62  <String "SHA384">
	//  219  486:ldc1            #61  <String "2.16.840.1.101.3.4.2.2">
	//  220  488:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  221  491:pop             
		allowedDigests.put("SHA-384", "2.16.840.1.101.3.4.2.2");
	//  222  492:getstatic       #37  <Field HashMap allowedDigests>
	//  223  495:ldc1            #16  <String "SHA-384">
	//  224  497:ldc1            #61  <String "2.16.840.1.101.3.4.2.2">
	//  225  499:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  226  502:pop             
		allowedDigests.put("SHA512", "2.16.840.1.101.3.4.2.3");
	//  227  503:getstatic       #37  <Field HashMap allowedDigests>
	//  228  506:ldc1            #65  <String "SHA512">
	//  229  508:ldc1            #64  <String "2.16.840.1.101.3.4.2.3">
	//  230  510:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  231  513:pop             
		allowedDigests.put("SHA-512", "2.16.840.1.101.3.4.2.3");
	//  232  514:getstatic       #37  <Field HashMap allowedDigests>
	//  233  517:ldc1            #19  <String "SHA-512">
	//  234  519:ldc1            #64  <String "2.16.840.1.101.3.4.2.3">
	//  235  521:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  236  524:pop             
		allowedDigests.put("RIPEMD128", "1.3.36.3.2.2");
	//  237  525:getstatic       #37  <Field HashMap allowedDigests>
	//  238  528:ldc1            #69  <String "RIPEMD128">
	//  239  530:ldc1            #67  <String "1.3.36.3.2.2">
	//  240  532:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  241  535:pop             
		allowedDigests.put("RIPEMD-128", "1.3.36.3.2.2");
	//  242  536:getstatic       #37  <Field HashMap allowedDigests>
	//  243  539:ldc1            #117 <String "RIPEMD-128">
	//  244  541:ldc1            #67  <String "1.3.36.3.2.2">
	//  245  543:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  246  546:pop             
		allowedDigests.put("RIPEMD160", "1.3.36.3.2.1");
	//  247  547:getstatic       #37  <Field HashMap allowedDigests>
	//  248  550:ldc1            #7   <String "RIPEMD160">
	//  249  552:ldc1            #71  <String "1.3.36.3.2.1">
	//  250  554:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  251  557:pop             
		allowedDigests.put("RIPEMD-160", "1.3.36.3.2.1");
	//  252  558:getstatic       #37  <Field HashMap allowedDigests>
	//  253  561:ldc1            #119 <String "RIPEMD-160">
	//  254  563:ldc1            #71  <String "1.3.36.3.2.1">
	//  255  565:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  256  568:pop             
		allowedDigests.put("RIPEMD256", "1.3.36.3.2.3");
	//  257  569:getstatic       #37  <Field HashMap allowedDigests>
	//  258  572:ldc1            #75  <String "RIPEMD256">
	//  259  574:ldc1            #73  <String "1.3.36.3.2.3">
	//  260  576:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  261  579:pop             
		allowedDigests.put("RIPEMD-256", "1.3.36.3.2.3");
	//  262  580:getstatic       #37  <Field HashMap allowedDigests>
	//  263  583:ldc1            #121 <String "RIPEMD-256">
	//  264  585:ldc1            #73  <String "1.3.36.3.2.3">
	//  265  587:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  266  590:pop             
		allowedDigests.put("GOST3411", "1.2.643.2.2.9");
	//  267  591:getstatic       #37  <Field HashMap allowedDigests>
	//  268  594:ldc1            #109 <String "GOST3411">
	//  269  596:ldc1            #107 <String "1.2.643.2.2.9">
	//  270  598:invokevirtual   #45  <Method Object HashMap.put(Object, Object)>
	//  271  601:pop             
	//* 272  602:return          
	}
}
