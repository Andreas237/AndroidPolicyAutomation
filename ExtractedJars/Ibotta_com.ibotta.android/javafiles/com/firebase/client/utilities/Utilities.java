// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.utilities;

import com.firebase.client.FirebaseException;
import com.firebase.client.core.Path;
import com.firebase.client.core.RepoInfo;
import java.io.UnsupportedEncodingException;
import java.net.*;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Map;

// Referenced classes of package com.firebase.client.utilities:
//			Validation, ParsedUrl, Base64

public class Utilities
{

	public Utilities()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Object castOrNull(Object obj, Class class1)
	{
		if(class1.isAssignableFrom(obj.getClass()))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #15  <Method Class Object.getClass()>
	//*   3    5:invokevirtual   #21  <Method boolean Class.isAssignableFrom(Class)>
	//*   4    8:ifeq            13
			return obj;
	//    5   11:aload_0         
	//    6   12:areturn         
		else
			return ((Object) (null));
	//    7   13:aconst_null     
	//    8   14:areturn         
	}

	public static int compareInts(int i, int j)
	{
		if(i < j)
	//*   0    0:iload_0         
	//*   1    1:iload_1         
	//*   2    2:icmpge          7
			return -1;
	//    3    5:iconst_m1       
	//    4    6:ireturn         
		return i != j ? 1 : 0;
	//    5    7:iload_0         
	//    6    8:iload_1         
	//    7    9:icmpne          14
	//    8   12:iconst_0        
	//    9   13:ireturn         
	//   10   14:iconst_1        
	//   11   15:ireturn         
	}

	public static int compareLongs(long l, long l1)
	{
		int i = l != l1;
	//    0    0:lload_0         
	//    1    1:lload_2         
	//    2    2:lcmp            
	//    3    3:istore          4
		if(i < 0)
	//*   4    5:iload           4
	//*   5    7:ifge            12
			return -1;
	//    6   10:iconst_m1       
	//    7   11:ireturn         
		return i != 0 ? 1 : 0;
	//    8   12:iload           4
	//    9   14:ifne            19
	//   10   17:iconst_0        
	//   11   18:ireturn         
	//   12   19:iconst_1        
	//   13   20:ireturn         
	}

	public static String doubleToHashString(double d)
	{
		StringBuilder stringbuilder = new StringBuilder(16);
	//    0    0:new             #31  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          16
	//    3    6:invokespecial   #34  <Method void StringBuilder(int)>
	//    4    9:astore_3        
		byte abyte0[] = new byte[8];
	//    5   10:bipush          8
	//    6   12:newarray        byte[]
	//    7   14:astore          4
		ByteBuffer.wrap(abyte0).putDouble(d);
	//    8   16:aload           4
	//    9   18:invokestatic    #40  <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   10   21:dload_0         
	//   11   22:invokevirtual   #44  <Method ByteBuffer ByteBuffer.putDouble(double)>
	//   12   25:pop             
		for(int i = 0; i < 8; i++)
	//*  13   26:iconst_0        
	//*  14   27:istore_2        
	//*  15   28:iload_2         
	//*  16   29:bipush          8
	//*  17   31:icmpge          65
			stringbuilder.append(String.format("%02x", new Object[] {
				Byte.valueOf(abyte0[i])
			}));
	//   18   34:aload_3         
	//   19   35:ldc1            #46  <String "%02x">
	//   20   37:iconst_1        
	//   21   38:anewarray       Object[]
	//   22   41:dup             
	//   23   42:iconst_0        
	//   24   43:aload           4
	//   25   45:iload_2         
	//   26   46:baload          
	//   27   47:invokestatic    #52  <Method Byte Byte.valueOf(byte)>
	//   28   50:aastore         
	//   29   51:invokestatic    #58  <Method String String.format(String, Object[])>
	//   30   54:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   31   57:pop             

	//   32   58:iload_2         
	//   33   59:iconst_1        
	//   34   60:iadd            
	//   35   61:istore_2        
	//*  36   62:goto            28
		return stringbuilder.toString();
	//   37   65:aload_3         
	//   38   66:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   39   69:areturn         
	}

	public static Object getOrNull(Object obj, String s, Class class1)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		obj = ((Map)castOrNull(obj, java/util/Map)).get(((Object) (s)));
	//    4    6:aload_0         
	//    5    7:ldc1            #70  <Class Map>
	//    6    9:invokestatic    #72  <Method Object castOrNull(Object, Class)>
	//    7   12:checkcast       #70  <Class Map>
	//    8   15:aload_1         
	//    9   16:invokeinterface #76  <Method Object Map.get(Object)>
	//   10   21:astore_0        
		if(obj != null)
	//*  11   22:aload_0         
	//*  12   23:ifnull          32
			return castOrNull(obj, class1);
	//   13   26:aload_0         
	//   14   27:aload_2         
	//   15   28:invokestatic    #72  <Method Object castOrNull(Object, Class)>
	//   16   31:areturn         
		else
			return ((Object) (null));
	//   17   32:aconst_null     
	//   18   33:areturn         
	}

	public static void hardAssert(boolean flag)
	{
		hardAssert(flag, "");
	//    0    0:iload_0         
	//    1    1:ldc1            #81  <String "">
	//    2    3:invokestatic    #84  <Method void hardAssert(boolean, String)>
	//    3    6:return          
	}

	public static void hardAssert(boolean flag, String s)
	{
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            5
		{
			return;
	//    2    4:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #31  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #85  <Method void StringBuilder()>
	//    6   12:astore_2        
			stringbuilder.append("hardAssert failed: ");
	//    7   13:aload_2         
	//    8   14:ldc1            #87  <String "hardAssert failed: ">
	//    9   16:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   10   19:pop             
			stringbuilder.append(s);
	//   11   20:aload_2         
	//   12   21:aload_1         
	//   13   22:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
			throw new AssertionError(((Object) (stringbuilder.toString())));
	//   15   26:new             #89  <Class AssertionError>
	//   16   29:dup             
	//   17   30:aload_2         
	//   18   31:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   19   34:invokespecial   #92  <Method void AssertionError(Object)>
	//   20   37:athrow          
		}
	}

	public static Long longFromObject(Object obj)
	{
		if(obj instanceof Integer)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #96  <Class Integer>
	//*   2    4:ifeq            19
			return Long.valueOf(((Integer)obj).intValue());
	//    3    7:aload_0         
	//    4    8:checkcast       #96  <Class Integer>
	//    5   11:invokevirtual   #100 <Method int Integer.intValue()>
	//    6   14:i2l             
	//    7   15:invokestatic    #105 <Method Long Long.valueOf(long)>
	//    8   18:areturn         
		if(obj instanceof Long)
	//*   9   19:aload_0         
	//*  10   20:instanceof      #102 <Class Long>
	//*  11   23:ifeq            31
			return (Long)obj;
	//   12   26:aload_0         
	//   13   27:checkcast       #102 <Class Long>
	//   14   30:areturn         
		else
			return null;
	//   15   31:aconst_null     
	//   16   32:areturn         
	}

	public static ParsedUrl parseUrl(String s)
		throws FirebaseException
	{
		int i;
		int j;
		Object obj;
		String as[];
		ParsedUrl parsedurl;
		String s1;
		try
		{
			i = s.indexOf("//");
	//    0    0:aload_0         
	//    1    1:ldc1            #115 <String "//">
	//    2    3:invokevirtual   #119 <Method int String.indexOf(String)>
	//    3    6:istore_1        
		}
	//*   4    7:iload_1         
	//*   5    8:iconst_m1       
	//*   6    9:icmpeq          326
	//*   7   12:iload_1         
	//*   8   13:iconst_2        
	//*   9   14:iadd            
	//*  10   15:istore_1        
	//*  11   16:aload_0         
	//*  12   17:iload_1         
	//*  13   18:invokevirtual   #123 <Method String String.substring(int)>
	//*  14   21:ldc1            #125 <String "/">
	//*  15   23:invokevirtual   #119 <Method int String.indexOf(String)>
	//*  16   26:istore_2        
	//*  17   27:aload_0         
	//*  18   28:astore_3        
	//*  19   29:iload_2         
	//*  20   30:iconst_m1       
	//*  21   31:icmpeq          140
	//*  22   34:iload_2         
	//*  23   35:iload_1         
	//*  24   36:iadd            
	//*  25   37:istore_2        
	//*  26   38:aload_0         
	//*  27   39:iload_2         
	//*  28   40:invokevirtual   #123 <Method String String.substring(int)>
	//*  29   43:ldc1            #125 <String "/">
	//*  30   45:invokevirtual   #129 <Method String[] String.split(String)>
	//*  31   48:astore          4
	//*  32   50:new             #31  <Class StringBuilder>
	//*  33   53:dup             
	//*  34   54:invokespecial   #85  <Method void StringBuilder()>
	//*  35   57:astore_3        
	//*  36   58:iconst_0        
	//*  37   59:istore_1        
	//*  38   60:iload_1         
	//*  39   61:aload           4
	//*  40   63:arraylength     
	//*  41   64:icmpge          103
	//*  42   67:aload           4
	//*  43   69:iload_1         
	//*  44   70:aaload          
	//*  45   71:ldc1            #81  <String "">
	//*  46   73:invokevirtual   #133 <Method boolean String.equals(Object)>
	//*  47   76:ifne            361
	//*  48   79:aload_3         
	//*  49   80:ldc1            #125 <String "/">
	//*  50   82:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  51   85:pop             
	//*  52   86:aload_3         
	//*  53   87:aload           4
	//*  54   89:iload_1         
	//*  55   90:aaload          
	//*  56   91:ldc1            #135 <String "UTF-8">
	//*  57   93:invokestatic    #141 <Method String URLEncoder.encode(String, String)>
	//*  58   96:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  59   99:pop             
	//*  60  100:goto            361
	//*  61  103:new             #31  <Class StringBuilder>
	//*  62  106:dup             
	//*  63  107:invokespecial   #85  <Method void StringBuilder()>
	//*  64  110:astore          4
	//*  65  112:aload           4
	//*  66  114:aload_0         
	//*  67  115:iconst_0        
	//*  68  116:iload_2         
	//*  69  117:invokevirtual   #144 <Method String String.substring(int, int)>
	//*  70  120:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  71  123:pop             
	//*  72  124:aload           4
	//*  73  126:aload_3         
	//*  74  127:invokevirtual   #66  <Method String StringBuilder.toString()>
	//*  75  130:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  76  133:pop             
	//*  77  134:aload           4
	//*  78  136:invokevirtual   #66  <Method String StringBuilder.toString()>
	//*  79  139:astore_3        
	//*  80  140:new             #146 <Class URI>
	//*  81  143:dup             
	//*  82  144:aload_3         
	//*  83  145:invokespecial   #149 <Method void URI(String)>
	//*  84  148:astore          4
	//*  85  150:aload           4
	//*  86  152:invokevirtual   #152 <Method String URI.getPath()>
	//*  87  155:ldc1            #154 <String "+">
	//*  88  157:ldc1            #156 <String " ">
	//*  89  159:invokevirtual   #160 <Method String String.replace(CharSequence, CharSequence)>
	//*  90  162:astore_0        
	//*  91  163:aload_0         
	//*  92  164:invokestatic    #165 <Method void Validation.validateRootPathString(String)>
	//*  93  167:new             #167 <Class Path>
	//*  94  170:dup             
	//*  95  171:aload_0         
	//*  96  172:invokespecial   #168 <Method void Path(String)>
	//*  97  175:astore_0        
	//*  98  176:aload           4
	//*  99  178:invokevirtual   #171 <Method String URI.getScheme()>
	//* 100  181:astore          5
	//* 101  183:new             #173 <Class RepoInfo>
	//* 102  186:dup             
	//* 103  187:invokespecial   #174 <Method void RepoInfo()>
	//* 104  190:astore_3        
	//* 105  191:aload_3         
	//* 106  192:aload           4
	//* 107  194:invokevirtual   #177 <Method String URI.getHost()>
	//* 108  197:invokevirtual   #180 <Method String String.toLowerCase()>
	//* 109  200:putfield        #184 <Field String RepoInfo.host>
	//* 110  203:aload           4
	//* 111  205:invokevirtual   #187 <Method int URI.getPort()>
	//* 112  208:istore_1        
	//* 113  209:iload_1         
	//* 114  210:iconst_m1       
	//* 115  211:icmpeq          271
	//* 116  214:aload_3         
	//* 117  215:aload           5
	//* 118  217:ldc1            #189 <String "https">
	//* 119  219:invokevirtual   #133 <Method boolean String.equals(Object)>
	//* 120  222:putfield        #193 <Field boolean RepoInfo.secure>
	//* 121  225:new             #31  <Class StringBuilder>
	//* 122  228:dup             
	//* 123  229:invokespecial   #85  <Method void StringBuilder()>
	//* 124  232:astore          4
	//* 125  234:aload           4
	//* 126  236:aload_3         
	//* 127  237:getfield        #184 <Field String RepoInfo.host>
	//* 128  240:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//* 129  243:pop             
	//* 130  244:aload           4
	//* 131  246:ldc1            #195 <String ":">
	//* 132  248:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//* 133  251:pop             
	//* 134  252:aload           4
	//* 135  254:iload_1         
	//* 136  255:invokevirtual   #198 <Method StringBuilder StringBuilder.append(int)>
	//* 137  258:pop             
	//* 138  259:aload_3         
	//* 139  260:aload           4
	//* 140  262:invokevirtual   #66  <Method String StringBuilder.toString()>
	//* 141  265:putfield        #184 <Field String RepoInfo.host>
	//* 142  268:goto            276
	//* 143  271:aload_3         
	//* 144  272:iconst_1        
	//* 145  273:putfield        #193 <Field boolean RepoInfo.secure>
	//* 146  276:aload_3         
	//* 147  277:aload_3         
	//* 148  278:getfield        #184 <Field String RepoInfo.host>
	//* 149  281:ldc1            #200 <String "\\.">
	//* 150  283:invokevirtual   #129 <Method String[] String.split(String)>
	//* 151  286:iconst_0        
	//* 152  287:aaload          
	//* 153  288:invokevirtual   #180 <Method String String.toLowerCase()>
	//* 154  291:putfield        #203 <Field String RepoInfo.namespace>
	//* 155  294:aload_3         
	//* 156  295:aload_3         
	//* 157  296:getfield        #184 <Field String RepoInfo.host>
	//* 158  299:putfield        #206 <Field String RepoInfo.internalHost>
	//* 159  302:new             #208 <Class ParsedUrl>
	//* 160  305:dup             
	//* 161  306:invokespecial   #209 <Method void ParsedUrl()>
	//* 162  309:astore          4
	//* 163  311:aload           4
	//* 164  313:aload_0         
	//* 165  314:putfield        #213 <Field Path ParsedUrl.path>
	//* 166  317:aload           4
	//* 167  319:aload_3         
	//* 168  320:putfield        #217 <Field RepoInfo ParsedUrl.repoInfo>
	//* 169  323:aload           4
	//* 170  325:areturn         
	//* 171  326:new             #111 <Class URISyntaxException>
	//* 172  329:dup             
	//* 173  330:aload_0         
	//* 174  331:ldc1            #219 <String "Invalid scheme specified">
	//* 175  333:invokespecial   #222 <Method void URISyntaxException(String, String)>
	//* 176  336:athrow          
	//* 177  337:astore_0        
	//* 178  338:new             #109 <Class FirebaseException>
	//* 179  341:dup             
	//* 180  342:ldc1            #224 <String "Failed to URLEncode the path">
	//* 181  344:aload_0         
	//* 182  345:invokespecial   #227 <Method void FirebaseException(String, Throwable)>
	//* 183  348:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 184  349:astore_0        
		{
			throw new FirebaseException("Invalid Firebase url specified", ((Throwable) (s)));
	//  185  350:new             #109 <Class FirebaseException>
	//  186  353:dup             
	//  187  354:ldc1            #229 <String "Invalid Firebase url specified">
	//  188  356:aload_0         
	//  189  357:invokespecial   #227 <Method void FirebaseException(String, Throwable)>
	//  190  360:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw new FirebaseException("Failed to URLEncode the path", ((Throwable) (s)));
		}
		if(i == -1) goto _L2; else goto _L1
_L1:
		i += 2;
		j = s.substring(i).indexOf("/");
		obj = ((Object) (s));
		if(j == -1) goto _L4; else goto _L3
_L3:
		j += i;
		as = s.substring(j).split("/");
		obj = ((Object) (new StringBuilder()));
		i = 0;
_L9:
		if(i >= as.length) goto _L6; else goto _L5
_L5:
		if(!as[i].equals(""))
		{
			((StringBuilder) (obj)).append("/");
			((StringBuilder) (obj)).append(URLEncoder.encode(as[i], "UTF-8"));
		}
		  goto _L7
_L6:
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.append(s.substring(0, j));
		stringbuilder.append(((StringBuilder) (obj)).toString());
		obj = ((Object) (stringbuilder.toString()));
_L4:
		URI uri = new URI(((String) (obj)));
		s = uri.getPath().replace("+", " ");
		Validation.validateRootPathString(s);
		s = ((String) (new Path(s)));
		s1 = uri.getScheme();
		obj = ((Object) (new RepoInfo()));
		obj.host = uri.getHost().toLowerCase();
		i = uri.getPort();
		if(i == -1)
			break MISSING_BLOCK_LABEL_271;
		obj.secure = s1.equals("https");
		StringBuilder stringbuilder1 = new StringBuilder();
		stringbuilder1.append(((RepoInfo) (obj)).host);
		stringbuilder1.append(":");
		stringbuilder1.append(i);
		obj.host = stringbuilder1.toString();
		break MISSING_BLOCK_LABEL_276;
		obj.secure = true;
		obj.namespace = ((RepoInfo) (obj)).host.split("\\.")[0].toLowerCase();
		obj.internalHost = ((RepoInfo) (obj)).host;
		parsedurl = new ParsedUrl();
		parsedurl.path = ((Path) (s));
		parsedurl.repoInfo = ((RepoInfo) (obj));
		return parsedurl;
_L2:
		throw new URISyntaxException(s, "Invalid scheme specified");
_L7:
		i++;
	//  191  361:iload_1         
	//  192  362:iconst_1        
	//  193  363:iadd            
	//  194  364:istore_1        
		if(true) goto _L9; else goto _L8
	//  195  365:goto            60
_L8:
	}

	public static String sha1HexDigest(String s)
	{
		try
		{
			MessageDigest messagedigest = MessageDigest.getInstance("SHA-1");
	//    0    0:ldc1            #236 <String "SHA-1">
	//    1    2:invokestatic    #242 <Method MessageDigest MessageDigest.getInstance(String)>
	//    2    5:astore_1        
			messagedigest.update(s.getBytes("UTF-8"));
	//    3    6:aload_1         
	//    4    7:aload_0         
	//    5    8:ldc1            #135 <String "UTF-8">
	//    6   10:invokevirtual   #246 <Method byte[] String.getBytes(String)>
	//    7   13:invokevirtual   #250 <Method void MessageDigest.update(byte[])>
			s = Base64.encodeBytes(messagedigest.digest());
	//    8   16:aload_1         
	//    9   17:invokevirtual   #254 <Method byte[] MessageDigest.digest()>
	//   10   20:invokestatic    #260 <Method String Base64.encodeBytes(byte[])>
	//   11   23:astore_0        
		}
	//*  12   24:aload_0         
	//*  13   25:areturn         
	//*  14   26:new             #262 <Class RuntimeException>
	//*  15   29:dup             
	//*  16   30:ldc2            #264 <String "UTF-8 encoding is required for Firebase to run!">
	//*  17   33:invokespecial   #265 <Method void RuntimeException(String)>
	//*  18   36:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  19   37:astore_0        
		{
			throw new RuntimeException("Missing SHA-1 MessageDigest provider.", ((Throwable) (s)));
	//   20   38:new             #262 <Class RuntimeException>
	//   21   41:dup             
	//   22   42:ldc2            #267 <String "Missing SHA-1 MessageDigest provider.">
	//   23   45:aload_0         
	//   24   46:invokespecial   #268 <Method void RuntimeException(String, Throwable)>
	//   25   49:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw new RuntimeException("UTF-8 encoding is required for Firebase to run!");
		}
		return s;
	//*  26   50:astore_0        
	//*  27   51:goto            26
	}

	public static String[] splitIntoFrames(String s, int i)
	{
		int k = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #273 <Method int String.length()>
	//    2    4:istore_3        
		int j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		if(k <= i)
	//*   5    7:iload_3         
	//*   6    8:iload_1         
	//*   7    9:icmpgt          21
			return (new String[] {
				s
			});
	//    8   12:iconst_1        
	//    9   13:anewarray       String[]
	//   10   16:dup             
	//   11   17:iconst_0        
	//   12   18:aload_0         
	//   13   19:aastore         
	//   14   20:areturn         
		ArrayList arraylist = new ArrayList();
	//   15   21:new             #275 <Class ArrayList>
	//   16   24:dup             
	//   17   25:invokespecial   #276 <Method void ArrayList()>
	//   18   28:astore          4
		int l;
		for(; j < s.length(); j = l)
	//*  19   30:iload_2         
	//*  20   31:aload_0         
	//*  21   32:invokevirtual   #273 <Method int String.length()>
	//*  22   35:icmpge          66
		{
			l = j + i;
	//   23   38:iload_2         
	//   24   39:iload_1         
	//   25   40:iadd            
	//   26   41:istore_3        
			arraylist.add(((Object) (s.substring(j, Math.min(l, s.length())))));
	//   27   42:aload           4
	//   28   44:aload_0         
	//   29   45:iload_2         
	//   30   46:iload_3         
	//   31   47:aload_0         
	//   32   48:invokevirtual   #273 <Method int String.length()>
	//   33   51:invokestatic    #281 <Method int Math.min(int, int)>
	//   34   54:invokevirtual   #144 <Method String String.substring(int, int)>
	//   35   57:invokevirtual   #284 <Method boolean ArrayList.add(Object)>
	//   36   60:pop             
		}

	//   37   61:iload_3         
	//   38   62:istore_2        
	//*  39   63:goto            30
		return (String[])arraylist.toArray(((Object []) (new String[arraylist.size()])));
	//   40   66:aload           4
	//   41   68:aload           4
	//   42   70:invokevirtual   #287 <Method int ArrayList.size()>
	//   43   73:anewarray       String[]
	//   44   76:invokevirtual   #291 <Method Object[] ArrayList.toArray(Object[])>
	//   45   79:checkcast       #293 <Class String[]>
	//   46   82:areturn         
	}

	public static String stringHashV2Representation(String s)
	{
		String s1;
		if(s.indexOf('\\') != -1)
	//*   0    0:aload_0         
	//*   1    1:bipush          92
	//*   2    3:invokevirtual   #297 <Method int String.indexOf(int)>
	//*   3    6:iconst_m1       
	//*   4    7:icmpeq          24
			s1 = s.replace("\\", "\\\\");
	//    5   10:aload_0         
	//    6   11:ldc2            #299 <String "\\">
	//    7   14:ldc2            #301 <String "\\\\">
	//    8   17:invokevirtual   #160 <Method String String.replace(CharSequence, CharSequence)>
	//    9   20:astore_1        
		else
	//*  10   21:goto            26
			s1 = s;
	//   11   24:aload_0         
	//   12   25:astore_1        
		String s2 = s1;
	//   13   26:aload_1         
	//   14   27:astore_2        
		if(s.indexOf('"') != -1)
	//*  15   28:aload_0         
	//*  16   29:bipush          34
	//*  17   31:invokevirtual   #297 <Method int String.indexOf(int)>
	//*  18   34:iconst_m1       
	//*  19   35:icmpeq          49
			s2 = s1.replace("\"", "\\\"");
	//   20   38:aload_1         
	//   21   39:ldc2            #303 <String "\"">
	//   22   42:ldc2            #305 <String "\\\"">
	//   23   45:invokevirtual   #160 <Method String String.replace(CharSequence, CharSequence)>
	//   24   48:astore_2        
		s = ((String) (new StringBuilder()));
	//   25   49:new             #31  <Class StringBuilder>
	//   26   52:dup             
	//   27   53:invokespecial   #85  <Method void StringBuilder()>
	//   28   56:astore_0        
		((StringBuilder) (s)).append('"');
	//   29   57:aload_0         
	//   30   58:bipush          34
	//   31   60:invokevirtual   #308 <Method StringBuilder StringBuilder.append(char)>
	//   32   63:pop             
		((StringBuilder) (s)).append(s2);
	//   33   64:aload_0         
	//   34   65:aload_2         
	//   35   66:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   36   69:pop             
		((StringBuilder) (s)).append('"');
	//   37   70:aload_0         
	//   38   71:bipush          34
	//   39   73:invokevirtual   #308 <Method StringBuilder StringBuilder.append(char)>
	//   40   76:pop             
		return ((StringBuilder) (s)).toString();
	//   41   77:aload_0         
	//   42   78:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   43   81:areturn         
	}

	public static Integer tryParseInt(String s)
	{
		if(s.length() <= 11)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #273 <Method int String.length()>
	//*   2    4:bipush          11
	//*   3    6:icmpgt          150
		{
			if(s.length() == 0)
	//*   4    9:aload_0         
	//*   5   10:invokevirtual   #273 <Method int String.length()>
	//*   6   13:ifne            18
				return null;
	//    7   16:aconst_null     
	//    8   17:areturn         
			int i = 0;
	//    9   18:iconst_0        
	//   10   19:istore_1        
			char c = s.charAt(0);
	//   11   20:aload_0         
	//   12   21:iconst_0        
	//   13   22:invokevirtual   #314 <Method char String.charAt(int)>
	//   14   25:istore_3        
			boolean flag = true;
	//   15   26:iconst_1        
	//   16   27:istore_2        
			if(c == '-')
	//*  17   28:iload_3         
	//*  18   29:bipush          45
	//*  19   31:icmpne          49
			{
				if(s.length() == 1)
	//*  20   34:aload_0         
	//*  21   35:invokevirtual   #273 <Method int String.length()>
	//*  22   38:iconst_1        
	//*  23   39:icmpne          44
					return null;
	//   24   42:aconst_null     
	//   25   43:areturn         
				i = 1;
	//   26   44:iconst_1        
	//   27   45:istore_1        
			} else
	//*  28   46:goto            51
			{
				flag = false;
	//   29   49:iconst_0        
	//   30   50:istore_2        
			}
			long l = 0L;
	//   31   51:lconst_0        
	//   32   52:lstore          4
			while(i < s.length()) 
	//*  33   54:iload_1         
	//*  34   55:aload_0         
	//*  35   56:invokevirtual   #273 <Method int String.length()>
	//*  36   59:icmpge          105
			{
				char c1 = s.charAt(i);
	//   37   62:aload_0         
	//   38   63:iload_1         
	//   39   64:invokevirtual   #314 <Method char String.charAt(int)>
	//   40   67:istore_3        
				if(c1 >= '0')
	//*  41   68:iload_3         
	//*  42   69:bipush          48
	//*  43   71:icmplt          103
				{
					if(c1 > '9')
	//*  44   74:iload_3         
	//*  45   75:bipush          57
	//*  46   77:icmple          82
						return null;
	//   47   80:aconst_null     
	//   48   81:areturn         
					l = l * 10L + (long)(c1 - 48);
	//   49   82:lload           4
	//   50   84:ldc2w           #315 <Long 10L>
	//   51   87:lmul            
	//   52   88:iload_3         
	//   53   89:bipush          48
	//   54   91:isub            
	//   55   92:i2l             
	//   56   93:ladd            
	//   57   94:lstore          4
					i++;
	//   58   96:iload_1         
	//   59   97:iconst_1        
	//   60   98:iadd            
	//   61   99:istore_1        
				} else
	//*  62  100:goto            54
				{
					return null;
	//   63  103:aconst_null     
	//   64  104:areturn         
				}
			}
			if(flag)
	//*  65  105:iload_2         
	//*  66  106:ifeq            132
			{
				l = -l;
	//   67  109:lload           4
	//   68  111:lneg            
	//   69  112:lstore          4
				if(l < 0x80000000L)
	//*  70  114:lload           4
	//*  71  116:ldc2w           #317 <Long 0x80000000L>
	//*  72  119:lcmp            
	//*  73  120:ifge            125
					return null;
	//   74  123:aconst_null     
	//   75  124:areturn         
				else
					return Integer.valueOf((int)l);
	//   76  125:lload           4
	//   77  127:l2i             
	//   78  128:invokestatic    #321 <Method Integer Integer.valueOf(int)>
	//   79  131:areturn         
			}
			if(l > 0x7fffffffL)
	//*  80  132:lload           4
	//*  81  134:ldc2w           #322 <Long 0x7fffffffL>
	//*  82  137:lcmp            
	//*  83  138:ifle            143
				return null;
	//   84  141:aconst_null     
	//   85  142:areturn         
			else
				return Integer.valueOf((int)l);
	//   86  143:lload           4
	//   87  145:l2i             
	//   88  146:invokestatic    #321 <Method Integer Integer.valueOf(int)>
	//   89  149:areturn         
		} else
		{
			return null;
	//   90  150:aconst_null     
	//   91  151:areturn         
		}
	}
}
