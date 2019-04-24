// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.util.algorithm;

import cn.com.fmsh.util.FM_Bytes;
import cn.com.fmsh.util.Util4Java;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package cn.com.fmsh.util.algorithm:
//			DES, Digest

public class AES
{

	public AES()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:return          
	}

	public static byte[] decrypt4ECB(byte abyte0[], byte abyte1[])
	{
		if(abyte0 == null || abyte0.length < 1)
	//*   0    0:aload_0         
	//*   1    1:ifnull          10
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:iconst_1        
	//*   5    7:icmpge          12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		if(abyte1 == null || abyte1.length < 1)
	//*   8   12:aload_1         
	//*   9   13:ifnull          22
	//*  10   16:aload_1         
	//*  11   17:arraylength     
	//*  12   18:iconst_1        
	//*  13   19:icmpge          24
			return null;
	//   14   22:aconst_null     
	//   15   23:areturn         
		abyte1 = ((byte []) (new SecretKeySpec(abyte1, "AES")));
	//   16   24:new             #47  <Class SecretKeySpec>
	//   17   27:dup             
	//   18   28:aload_1         
	//   19   29:ldc1            #49  <String "AES">
	//   20   31:invokespecial   #52  <Method void SecretKeySpec(byte[], String)>
	//   21   34:astore_1        
		Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
	//   22   35:ldc1            #54  <String "AES/ECB/NoPadding">
	//   23   37:invokestatic    #59  <Method Cipher Cipher.getInstance(String)>
	//   24   40:astore_2        
		cipher.init(2, ((java.security.Key) (abyte1)));
	//   25   41:aload_2         
	//   26   42:iconst_2        
	//   27   43:aload_1         
	//   28   44:invokevirtual   #63  <Method void Cipher.init(int, java.security.Key)>
		abyte0 = cipher.doFinal(abyte0);
	//   29   47:aload_2         
	//   30   48:aload_0         
	//   31   49:invokevirtual   #67  <Method byte[] Cipher.doFinal(byte[])>
	//   32   52:astore_0        
		return abyte0;
	//   33   53:aload_0         
	//   34   54:areturn         
		abyte0;
	//   35   55:astore_0        
		if(log != null)
	//*  36   56:getstatic       #23  <Field FMLog log>
	//*  37   59:ifnull          79
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   38   62:getstatic       #23  <Field FMLog log>
	//   39   65:ldc1            #69  <Class DES>
	//   40   67:invokevirtual   #75  <Method String Class.getName()>
	//   41   70:aload_0         
	//   42   71:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//   43   74:invokeinterface #87  <Method void FMLog.error(String, String)>
		System.out.println(Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   44   79:getstatic       #93  <Field PrintStream System.out>
	//   45   82:aload_0         
	//   46   83:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//   47   86:invokevirtual   #99  <Method void PrintStream.println(String)>
		break MISSING_BLOCK_LABEL_274;
	//   48   89:goto            274
		abyte0;
	//   49   92:astore_0        
		if(log != null)
	//*  50   93:getstatic       #23  <Field FMLog log>
	//*  51   96:ifnull          116
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   52   99:getstatic       #23  <Field FMLog log>
	//   53  102:ldc1            #69  <Class DES>
	//   54  104:invokevirtual   #75  <Method String Class.getName()>
	//   55  107:aload_0         
	//   56  108:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//   57  111:invokeinterface #87  <Method void FMLog.error(String, String)>
		System.out.println(Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   58  116:getstatic       #93  <Field PrintStream System.out>
	//   59  119:aload_0         
	//   60  120:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//   61  123:invokevirtual   #99  <Method void PrintStream.println(String)>
		break MISSING_BLOCK_LABEL_274;
	//   62  126:goto            274
		abyte0;
	//   63  129:astore_0        
		if(log != null)
	//*  64  130:getstatic       #23  <Field FMLog log>
	//*  65  133:ifnull          153
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   66  136:getstatic       #23  <Field FMLog log>
	//   67  139:ldc1            #69  <Class DES>
	//   68  141:invokevirtual   #75  <Method String Class.getName()>
	//   69  144:aload_0         
	//   70  145:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//   71  148:invokeinterface #87  <Method void FMLog.error(String, String)>
		System.out.println(Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   72  153:getstatic       #93  <Field PrintStream System.out>
	//   73  156:aload_0         
	//   74  157:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//   75  160:invokevirtual   #99  <Method void PrintStream.println(String)>
		break MISSING_BLOCK_LABEL_274;
	//   76  163:goto            274
		abyte0;
	//   77  166:astore_0        
		if(log != null)
	//*  78  167:getstatic       #23  <Field FMLog log>
	//*  79  170:ifnull          190
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   80  173:getstatic       #23  <Field FMLog log>
	//   81  176:ldc1            #69  <Class DES>
	//   82  178:invokevirtual   #75  <Method String Class.getName()>
	//   83  181:aload_0         
	//   84  182:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//   85  185:invokeinterface #87  <Method void FMLog.error(String, String)>
		System.out.println(Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   86  190:getstatic       #93  <Field PrintStream System.out>
	//   87  193:aload_0         
	//   88  194:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//   89  197:invokevirtual   #99  <Method void PrintStream.println(String)>
		break MISSING_BLOCK_LABEL_274;
	//   90  200:goto            274
		abyte0;
	//   91  203:astore_0        
		if(log != null)
	//*  92  204:getstatic       #23  <Field FMLog log>
	//*  93  207:ifnull          227
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   94  210:getstatic       #23  <Field FMLog log>
	//   95  213:ldc1            #69  <Class DES>
	//   96  215:invokevirtual   #75  <Method String Class.getName()>
	//   97  218:aload_0         
	//   98  219:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//   99  222:invokeinterface #87  <Method void FMLog.error(String, String)>
		System.out.println(Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//  100  227:getstatic       #93  <Field PrintStream System.out>
	//  101  230:aload_0         
	//  102  231:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//  103  234:invokevirtual   #99  <Method void PrintStream.println(String)>
		break MISSING_BLOCK_LABEL_274;
	//  104  237:goto            274
		abyte0;
	//  105  240:astore_0        
		if(log != null)
	//* 106  241:getstatic       #23  <Field FMLog log>
	//* 107  244:ifnull          264
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//  108  247:getstatic       #23  <Field FMLog log>
	//  109  250:ldc1            #69  <Class DES>
	//  110  252:invokevirtual   #75  <Method String Class.getName()>
	//  111  255:aload_0         
	//  112  256:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//  113  259:invokeinterface #87  <Method void FMLog.error(String, String)>
		System.out.println(Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//  114  264:getstatic       #93  <Field PrintStream System.out>
	//  115  267:aload_0         
	//  116  268:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//  117  271:invokevirtual   #99  <Method void PrintStream.println(String)>
		return null;
	//  118  274:aconst_null     
	//  119  275:areturn         
	}

	public static byte[] decrypt4ECB(byte abyte0[], byte abyte1[], int i)
	{
		Object obj;
		if(abyte0 == null || abyte0.length < 1)
	//*   0    0:aload_0         
	//*   1    1:ifnull          10
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:iconst_1        
	//*   5    7:icmpge          12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		if(abyte1 == null || abyte1.length < 1)
	//*   8   12:aload_1         
	//*   9   13:ifnull          22
	//*  10   16:aload_1         
	//*  11   17:arraylength     
	//*  12   18:iconst_1        
	//*  13   19:icmpge          24
			return null;
	//   14   22:aconst_null     
	//   15   23:areturn         
		obj = "AES/ECB/NoPadding";
	//   16   24:ldc1            #54  <String "AES/ECB/NoPadding">
	//   17   26:astore_3        
		if(i == PADDING_TYPE_PKCS5)
	//*  18   27:iload_2         
	//*  19   28:getstatic       #27  <Field int PADDING_TYPE_PKCS5>
	//*  20   31:icmpne          37
			obj = "AES/ECB/PKCS5Padding";
	//   21   34:ldc1            #102 <String "AES/ECB/PKCS5Padding">
	//   22   36:astore_3        
		abyte1 = ((byte []) (new SecretKeySpec(abyte1, "AES")));
	//   23   37:new             #47  <Class SecretKeySpec>
	//   24   40:dup             
	//   25   41:aload_1         
	//   26   42:ldc1            #49  <String "AES">
	//   27   44:invokespecial   #52  <Method void SecretKeySpec(byte[], String)>
	//   28   47:astore_1        
		obj = ((Object) (Cipher.getInstance(((String) (obj)))));
	//   29   48:aload_3         
	//   30   49:invokestatic    #59  <Method Cipher Cipher.getInstance(String)>
	//   31   52:astore_3        
		((Cipher) (obj)).init(2, ((java.security.Key) (abyte1)));
	//   32   53:aload_3         
	//   33   54:iconst_2        
	//   34   55:aload_1         
	//   35   56:invokevirtual   #63  <Method void Cipher.init(int, java.security.Key)>
		abyte0 = ((Cipher) (obj)).doFinal(abyte0);
	//   36   59:aload_3         
	//   37   60:aload_0         
	//   38   61:invokevirtual   #67  <Method byte[] Cipher.doFinal(byte[])>
	//   39   64:astore_0        
		return abyte0;
	//   40   65:aload_0         
	//   41   66:areturn         
		abyte0;
	//   42   67:astore_0        
		if(log != null)
	//*  43   68:getstatic       #23  <Field FMLog log>
	//*  44   71:ifnull          91
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   45   74:getstatic       #23  <Field FMLog log>
	//   46   77:ldc1            #69  <Class DES>
	//   47   79:invokevirtual   #75  <Method String Class.getName()>
	//   48   82:aload_0         
	//   49   83:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//   50   86:invokeinterface #87  <Method void FMLog.error(String, String)>
		System.out.println(Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   51   91:getstatic       #93  <Field PrintStream System.out>
	//   52   94:aload_0         
	//   53   95:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//   54   98:invokevirtual   #99  <Method void PrintStream.println(String)>
		break MISSING_BLOCK_LABEL_286;
	//   55  101:goto            286
		abyte0;
	//   56  104:astore_0        
		if(log != null)
	//*  57  105:getstatic       #23  <Field FMLog log>
	//*  58  108:ifnull          128
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   59  111:getstatic       #23  <Field FMLog log>
	//   60  114:ldc1            #69  <Class DES>
	//   61  116:invokevirtual   #75  <Method String Class.getName()>
	//   62  119:aload_0         
	//   63  120:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//   64  123:invokeinterface #87  <Method void FMLog.error(String, String)>
		System.out.println(Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   65  128:getstatic       #93  <Field PrintStream System.out>
	//   66  131:aload_0         
	//   67  132:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//   68  135:invokevirtual   #99  <Method void PrintStream.println(String)>
		break MISSING_BLOCK_LABEL_286;
	//   69  138:goto            286
		abyte0;
	//   70  141:astore_0        
		if(log != null)
	//*  71  142:getstatic       #23  <Field FMLog log>
	//*  72  145:ifnull          165
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   73  148:getstatic       #23  <Field FMLog log>
	//   74  151:ldc1            #69  <Class DES>
	//   75  153:invokevirtual   #75  <Method String Class.getName()>
	//   76  156:aload_0         
	//   77  157:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//   78  160:invokeinterface #87  <Method void FMLog.error(String, String)>
		System.out.println(Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   79  165:getstatic       #93  <Field PrintStream System.out>
	//   80  168:aload_0         
	//   81  169:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//   82  172:invokevirtual   #99  <Method void PrintStream.println(String)>
		break MISSING_BLOCK_LABEL_286;
	//   83  175:goto            286
		abyte0;
	//   84  178:astore_0        
		if(log != null)
	//*  85  179:getstatic       #23  <Field FMLog log>
	//*  86  182:ifnull          202
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   87  185:getstatic       #23  <Field FMLog log>
	//   88  188:ldc1            #69  <Class DES>
	//   89  190:invokevirtual   #75  <Method String Class.getName()>
	//   90  193:aload_0         
	//   91  194:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//   92  197:invokeinterface #87  <Method void FMLog.error(String, String)>
		System.out.println(Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   93  202:getstatic       #93  <Field PrintStream System.out>
	//   94  205:aload_0         
	//   95  206:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//   96  209:invokevirtual   #99  <Method void PrintStream.println(String)>
		break MISSING_BLOCK_LABEL_286;
	//   97  212:goto            286
		abyte0;
	//   98  215:astore_0        
		if(log != null)
	//*  99  216:getstatic       #23  <Field FMLog log>
	//* 100  219:ifnull          239
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//  101  222:getstatic       #23  <Field FMLog log>
	//  102  225:ldc1            #69  <Class DES>
	//  103  227:invokevirtual   #75  <Method String Class.getName()>
	//  104  230:aload_0         
	//  105  231:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//  106  234:invokeinterface #87  <Method void FMLog.error(String, String)>
		System.out.println(Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//  107  239:getstatic       #93  <Field PrintStream System.out>
	//  108  242:aload_0         
	//  109  243:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//  110  246:invokevirtual   #99  <Method void PrintStream.println(String)>
		break MISSING_BLOCK_LABEL_286;
	//  111  249:goto            286
		abyte0;
	//  112  252:astore_0        
		if(log != null)
	//* 113  253:getstatic       #23  <Field FMLog log>
	//* 114  256:ifnull          276
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//  115  259:getstatic       #23  <Field FMLog log>
	//  116  262:ldc1            #69  <Class DES>
	//  117  264:invokevirtual   #75  <Method String Class.getName()>
	//  118  267:aload_0         
	//  119  268:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//  120  271:invokeinterface #87  <Method void FMLog.error(String, String)>
		System.out.println(Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//  121  276:getstatic       #93  <Field PrintStream System.out>
	//  122  279:aload_0         
	//  123  280:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//  124  283:invokevirtual   #99  <Method void PrintStream.println(String)>
		return null;
	//  125  286:aconst_null     
	//  126  287:areturn         
	}

	public static byte[] encrypt4ECB(byte abyte0[], byte abyte1[])
	{
		if(abyte0 == null || abyte0.length < 1)
	//*   0    0:aload_0         
	//*   1    1:ifnull          10
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:iconst_1        
	//*   5    7:icmpge          12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		if(abyte1 == null || abyte1.length < 1)
	//*   8   12:aload_1         
	//*   9   13:ifnull          22
	//*  10   16:aload_1         
	//*  11   17:arraylength     
	//*  12   18:iconst_1        
	//*  13   19:icmpge          24
			return null;
	//   14   22:aconst_null     
	//   15   23:areturn         
		abyte1 = ((byte []) (new SecretKeySpec(abyte1, "AES")));
	//   16   24:new             #47  <Class SecretKeySpec>
	//   17   27:dup             
	//   18   28:aload_1         
	//   19   29:ldc1            #49  <String "AES">
	//   20   31:invokespecial   #52  <Method void SecretKeySpec(byte[], String)>
	//   21   34:astore_1        
		Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
	//   22   35:ldc1            #54  <String "AES/ECB/NoPadding">
	//   23   37:invokestatic    #59  <Method Cipher Cipher.getInstance(String)>
	//   24   40:astore_2        
		cipher.init(1, ((java.security.Key) (abyte1)));
	//   25   41:aload_2         
	//   26   42:iconst_1        
	//   27   43:aload_1         
	//   28   44:invokevirtual   #63  <Method void Cipher.init(int, java.security.Key)>
		abyte0 = cipher.doFinal(abyte0);
	//   29   47:aload_2         
	//   30   48:aload_0         
	//   31   49:invokevirtual   #67  <Method byte[] Cipher.doFinal(byte[])>
	//   32   52:astore_0        
		return abyte0;
	//   33   53:aload_0         
	//   34   54:areturn         
		abyte0;
	//   35   55:astore_0        
		if(log != null)
	//*  36   56:getstatic       #23  <Field FMLog log>
	//*  37   59:ifnull          79
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   38   62:getstatic       #23  <Field FMLog log>
	//   39   65:ldc1            #69  <Class DES>
	//   40   67:invokevirtual   #75  <Method String Class.getName()>
	//   41   70:aload_0         
	//   42   71:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//   43   74:invokeinterface #87  <Method void FMLog.error(String, String)>
		System.out.println(Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   44   79:getstatic       #93  <Field PrintStream System.out>
	//   45   82:aload_0         
	//   46   83:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//   47   86:invokevirtual   #99  <Method void PrintStream.println(String)>
		break MISSING_BLOCK_LABEL_274;
	//   48   89:goto            274
		abyte0;
	//   49   92:astore_0        
		if(log != null)
	//*  50   93:getstatic       #23  <Field FMLog log>
	//*  51   96:ifnull          116
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   52   99:getstatic       #23  <Field FMLog log>
	//   53  102:ldc1            #69  <Class DES>
	//   54  104:invokevirtual   #75  <Method String Class.getName()>
	//   55  107:aload_0         
	//   56  108:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//   57  111:invokeinterface #87  <Method void FMLog.error(String, String)>
		System.out.println(Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   58  116:getstatic       #93  <Field PrintStream System.out>
	//   59  119:aload_0         
	//   60  120:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//   61  123:invokevirtual   #99  <Method void PrintStream.println(String)>
		break MISSING_BLOCK_LABEL_274;
	//   62  126:goto            274
		abyte0;
	//   63  129:astore_0        
		if(log != null)
	//*  64  130:getstatic       #23  <Field FMLog log>
	//*  65  133:ifnull          153
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   66  136:getstatic       #23  <Field FMLog log>
	//   67  139:ldc1            #69  <Class DES>
	//   68  141:invokevirtual   #75  <Method String Class.getName()>
	//   69  144:aload_0         
	//   70  145:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//   71  148:invokeinterface #87  <Method void FMLog.error(String, String)>
		System.out.println(Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   72  153:getstatic       #93  <Field PrintStream System.out>
	//   73  156:aload_0         
	//   74  157:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//   75  160:invokevirtual   #99  <Method void PrintStream.println(String)>
		break MISSING_BLOCK_LABEL_274;
	//   76  163:goto            274
		abyte0;
	//   77  166:astore_0        
		if(log != null)
	//*  78  167:getstatic       #23  <Field FMLog log>
	//*  79  170:ifnull          190
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   80  173:getstatic       #23  <Field FMLog log>
	//   81  176:ldc1            #69  <Class DES>
	//   82  178:invokevirtual   #75  <Method String Class.getName()>
	//   83  181:aload_0         
	//   84  182:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//   85  185:invokeinterface #87  <Method void FMLog.error(String, String)>
		System.out.println(Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   86  190:getstatic       #93  <Field PrintStream System.out>
	//   87  193:aload_0         
	//   88  194:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//   89  197:invokevirtual   #99  <Method void PrintStream.println(String)>
		break MISSING_BLOCK_LABEL_274;
	//   90  200:goto            274
		abyte0;
	//   91  203:astore_0        
		if(log != null)
	//*  92  204:getstatic       #23  <Field FMLog log>
	//*  93  207:ifnull          227
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   94  210:getstatic       #23  <Field FMLog log>
	//   95  213:ldc1            #69  <Class DES>
	//   96  215:invokevirtual   #75  <Method String Class.getName()>
	//   97  218:aload_0         
	//   98  219:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//   99  222:invokeinterface #87  <Method void FMLog.error(String, String)>
		System.out.println(Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//  100  227:getstatic       #93  <Field PrintStream System.out>
	//  101  230:aload_0         
	//  102  231:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//  103  234:invokevirtual   #99  <Method void PrintStream.println(String)>
		break MISSING_BLOCK_LABEL_274;
	//  104  237:goto            274
		abyte0;
	//  105  240:astore_0        
		if(log != null)
	//* 106  241:getstatic       #23  <Field FMLog log>
	//* 107  244:ifnull          264
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//  108  247:getstatic       #23  <Field FMLog log>
	//  109  250:ldc1            #69  <Class DES>
	//  110  252:invokevirtual   #75  <Method String Class.getName()>
	//  111  255:aload_0         
	//  112  256:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//  113  259:invokeinterface #87  <Method void FMLog.error(String, String)>
		System.out.println(Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//  114  264:getstatic       #93  <Field PrintStream System.out>
	//  115  267:aload_0         
	//  116  268:invokestatic    #81  <Method String Util4Java.getExceptionInfo(Exception)>
	//  117  271:invokevirtual   #99  <Method void PrintStream.println(String)>
		return null;
	//  118  274:aconst_null     
	//  119  275:areturn         
	}

	public static void main(String args[])
	{
		args = null;
	//    0    0:aconst_null     
	//    1    1:astore_0        
		byte abyte0[] = FM_Bytes.bytesToHexString(Digest.md5("vd42ga56a5ragerDm0Q79Z17MDcgeGpQ".getBytes("UTF-8"))).toLowerCase().getBytes("UTF-8");
	//    2    2:ldc1            #109 <String "vd42ga56a5ragerDm0Q79Z17MDcgeGpQ">
	//    3    4:ldc1            #111 <String "UTF-8">
	//    4    6:invokevirtual   #117 <Method byte[] String.getBytes(String)>
	//    5    9:invokestatic    #122 <Method byte[] Digest.md5(byte[])>
	//    6   12:invokestatic    #128 <Method String FM_Bytes.bytesToHexString(byte[])>
	//    7   15:invokevirtual   #131 <Method String String.toLowerCase()>
	//    8   18:ldc1            #111 <String "UTF-8">
	//    9   20:invokevirtual   #117 <Method byte[] String.getBytes(String)>
	//   10   23:astore_1        
		args = ((String []) (abyte0));
	//   11   24:aload_1         
	//   12   25:astore_0        
		break MISSING_BLOCK_LABEL_34;
	//   13   26:goto            34
		UnsupportedEncodingException unsupportedencodingexception;
		unsupportedencodingexception;
	//   14   29:astore_1        
		unsupportedencodingexception.printStackTrace();
	//   15   30:aload_1         
	//   16   31:invokevirtual   #134 <Method void UnsupportedEncodingException.printStackTrace()>
		args = ((String []) (decrypt4ECB(FM_Bytes.hexStringToBytes("3B9D9A9CD4766BB542F615A4B50694C73EE580A006B485880D9629D32537F2094B5E76E0FAFAAE91CC15A2AE16E4946D38A53E1165409D2CA9F77E0185A818877D188B86AFE70C88D75866D4F2900305851B6E809A27F41C05A5865022EC5641CD6C73C95A2815BEFAA7DF0C29215BB557A3824D3D6B96230C3697D5B7393E598FCFF4CF41AF1A686F38A75D620E5B6D327C1928F3B65886F96C5849EBFE380CA092F239CFD457ACC4412FBA755C47AB04E7668B74F73F45B53704BE1CDAED2B2F23FC929896DA98349F2EC12A83E0B1D151842F559DEFF326AA2370607CAC2A36EC2910B171EABA25988D35259FF37A1D913F359CAC68051633EFCB6E35753842C01C95EE356213B356DAFF3619FE2236A2CCF325CBA2A36ADAAAD2A0E0C66660BC395AE208794199CCBCF2B8AE83F4503DE56564A3BE9B7BD50DE5536A8C1F4D7E3CA827E72E67B0729C5A2F6A08CC7995460E457FEFBD0E1506E61BE228F92B061BDB336C007141E28B381584E9407D2D8CC7765CF7063FC51D7B424CE0830530BC6A95642AA826BEC9901AF83CDF4833681888A3F7C891FDD7C26DE5E2F93CBD8B45C11760D840D8ED848E3C6473147B5044B4D9BDEEA95D5A413EECEA801ECFB8FE35A40C29D82715D50F85F991F47A0D5FDC2B4FF6F16A58133A844400DA5577251B25B69217D89C389338050BA49C1D750FBFDCD022737981376298568DE6B4333FBAD5C28290E24EC81CABE299E89E20437247A002463A45F71F3DA0E358C98BE203B544F537C26403C7F340D07CE127454606CA6D27AB487FA904267FF81715D34DA0317EE3C53DF287EC1F9698FAC92141B9E1F48EC15D35B16E771790FB5D30AD6F2660F4D24E26DD5E7BB15DF20FA3EE78C36B8D9737A3D21C8308E6BBB225460DA170F3FC1131AA3198B2ED1164E1E467AF2416C721AD136B00A4E46FCC8B536D196B04491599A96B4A6B24421D637EDFF940D997ED36AF448ED985AD7A1E669EAB3E859CDBC716D5B51A052BC1788007479A419D67363F4FB6DA2101C9594EB3B2BE4F7CD36EDF244350137F74849CF746E79C524C4BD68B4B926C2A55CD4569D93D635AB851554B9A"), ((byte []) (args)))));
	//   17   34:ldc1            #136 <String "3B9D9A9CD4766BB542F615A4B50694C73EE580A006B485880D9629D32537F2094B5E76E0FAFAAE91CC15A2AE16E4946D38A53E1165409D2CA9F77E0185A818877D188B86AFE70C88D75866D4F2900305851B6E809A27F41C05A5865022EC5641CD6C73C95A2815BEFAA7DF0C29215BB557A3824D3D6B96230C3697D5B7393E598FCFF4CF41AF1A686F38A75D620E5B6D327C1928F3B65886F96C5849EBFE380CA092F239CFD457ACC4412FBA755C47AB04E7668B74F73F45B53704BE1CDAED2B2F23FC929896DA98349F2EC12A83E0B1D151842F559DEFF326AA2370607CAC2A36EC2910B171EABA25988D35259FF37A1D913F359CAC68051633EFCB6E35753842C01C95EE356213B356DAFF3619FE2236A2CCF325CBA2A36ADAAAD2A0E0C66660BC395AE208794199CCBCF2B8AE83F4503DE56564A3BE9B7BD50DE5536A8C1F4D7E3CA827E72E67B0729C5A2F6A08CC7995460E457FEFBD0E1506E61BE228F92B061BDB336C007141E28B381584E9407D2D8CC7765CF7063FC51D7B424CE0830530BC6A95642AA826BEC9901AF83CDF4833681888A3F7C891FDD7C26DE5E2F93CBD8B45C11760D840D8ED848E3C6473147B5044B4D9BDEEA95D5A413EECEA801ECFB8FE35A40C29D82715D50F85F991F47A0D5FDC2B4FF6F16A58133A844400DA5577251B25B69217D89C389338050BA49C1D750FBFDCD022737981376298568DE6B4333FBAD5C28290E24EC81CABE299E89E20437247A002463A45F71F3DA0E358C98BE203B544F537C26403C7F340D07CE127454606CA6D27AB487FA904267FF81715D34DA0317EE3C53DF287EC1F9698FAC92141B9E1F48EC15D35B16E771790FB5D30AD6F2660F4D24E26DD5E7BB15DF20FA3EE78C36B8D9737A3D21C8308E6BBB225460DA170F3FC1131AA3198B2ED1164E1E467AF2416C721AD136B00A4E46FCC8B536D196B04491599A96B4A6B24421D637EDFF940D997ED36AF448ED985AD7A1E669EAB3E859CDBC716D5B51A052BC1788007479A419D67363F4FB6DA2101C9594EB3B2BE4F7CD36EDF244350137F74849CF746E79C524C4BD68B4B926C2A55CD4569D93D635AB851554B9A">
	//   18   36:invokestatic    #139 <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//   19   39:aload_0         
	//   20   40:invokestatic    #141 <Method byte[] decrypt4ECB(byte[], byte[])>
	//   21   43:astore_0        
		System.out.println((new StringBuilder("ciphertext:")).append(FM_Bytes.bytesToHexString(((byte []) (args)))).toString());
	//   22   44:getstatic       #93  <Field PrintStream System.out>
	//   23   47:new             #143 <Class StringBuilder>
	//   24   50:dup             
	//   25   51:ldc1            #145 <String "ciphertext:">
	//   26   53:invokespecial   #147 <Method void StringBuilder(String)>
	//   27   56:aload_0         
	//   28   57:invokestatic    #128 <Method String FM_Bytes.bytesToHexString(byte[])>
	//   29   60:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   30   63:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   31   66:invokevirtual   #99  <Method void PrintStream.println(String)>
		if(args != null)
	//*  32   69:aload_0         
	//*  33   70:ifnull          96
		{
			try
			{
				System.out.println(new String(((byte []) (args)), "UTF-8"));
	//   34   73:getstatic       #93  <Field PrintStream System.out>
	//   35   76:new             #113 <Class String>
	//   36   79:dup             
	//   37   80:aload_0         
	//   38   81:ldc1            #111 <String "UTF-8">
	//   39   83:invokespecial   #155 <Method void String(byte[], String)>
	//   40   86:invokevirtual   #99  <Method void PrintStream.println(String)>
				return;
	//   41   89:return          
			}
			// Misplaced declaration of an exception variable
			catch(String args[])
	//*  42   90:astore_0        
			{
				((UnsupportedEncodingException) (args)).printStackTrace();
	//   43   91:aload_0         
	//   44   92:invokevirtual   #134 <Method void UnsupportedEncodingException.printStackTrace()>
			}
			return;
	//   45   95:return          
		} else
		{
			System.out.println("\u52A0\u5BC6\u5931\u8D25");
	//   46   96:getstatic       #93  <Field PrintStream System.out>
	//   47   99:ldc1            #157 <String "\u52A0\u5BC6\u5931\u8D25">
	//   48  101:invokevirtual   #99  <Method void PrintStream.println(String)>
			return;
	//   49  104:return          
		}
	}

	public static int PADDING_TYPE_NO = 0;
	public static int PADDING_TYPE_PKCS5 = 1;
	private static FMLog log = LogFactory.getInstance().getLog();

	static 
	{
	//    0    0:invokestatic    #17  <Method LogFactory LogFactory.getInstance()>
	//    1    3:invokevirtual   #21  <Method FMLog LogFactory.getLog()>
	//    2    6:putstatic       #23  <Field FMLog log>
	//    3    9:iconst_0        
	//    4   10:putstatic       #25  <Field int PADDING_TYPE_NO>
	//    5   13:iconst_1        
	//    6   14:putstatic       #27  <Field int PADDING_TYPE_PKCS5>
	//*   7   17:return          
	}
}
