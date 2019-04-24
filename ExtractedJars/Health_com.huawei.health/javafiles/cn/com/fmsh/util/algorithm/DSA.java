// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.util.algorithm;

import cn.com.fmsh.util.Util4Java;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import java.io.PrintStream;
import java.security.*;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package cn.com.fmsh.util.algorithm:
//			RSA

public class DSA
{

	public DSA()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:return          
	}

	public static Map generateKey(int i)
	{
		Object obj;
		HashMap hashmap;
		hashmap = new HashMap();
	//    0    0:new             #40  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void HashMap()>
	//    3    7:astore_3        
		obj = null;
	//    4    8:aconst_null     
	//    5    9:astore_1        
		KeyPairGenerator keypairgenerator = KeyPairGenerator.getInstance("DSA");
	//    6   10:ldc1            #8   <String "DSA">
	//    7   12:invokestatic    #46  <Method KeyPairGenerator KeyPairGenerator.getInstance(String)>
	//    8   15:astore_2        
		obj = ((Object) (keypairgenerator));
	//    9   16:aload_2         
	//   10   17:astore_1        
		break MISSING_BLOCK_LABEL_70;
	//   11   18:goto            70
		NoSuchAlgorithmException nosuchalgorithmexception;
		nosuchalgorithmexception;
	//   12   21:astore_2        
		if(log != null)
	//*  13   22:getstatic       #30  <Field FMLog log>
	//*  14   25:ifnull          60
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "RSA\u4EA7\u751F\u5BC6\u94A5\u51FA\u73B0\u5F02\u5E38");
	//   15   28:getstatic       #30  <Field FMLog log>
	//   16   31:ldc1            #48  <Class RSA>
	//   17   33:invokevirtual   #54  <Method String Class.getName()>
	//   18   36:ldc1            #56  <String "RSA\u4EA7\u751F\u5BC6\u94A5\u51FA\u73B0\u5F02\u5E38">
	//   19   38:invokeinterface #62  <Method void FMLog.error(String, String)>
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (nosuchalgorithmexception))));
	//   20   43:getstatic       #30  <Field FMLog log>
	//   21   46:ldc1            #48  <Class RSA>
	//   22   48:invokevirtual   #54  <Method String Class.getName()>
	//   23   51:aload_2         
	//   24   52:invokestatic    #68  <Method String Util4Java.getExceptionInfo(Exception)>
	//   25   55:invokeinterface #62  <Method void FMLog.error(String, String)>
		}
		System.out.println(Util4Java.getExceptionInfo(((Exception) (nosuchalgorithmexception))));
	//   26   60:getstatic       #74  <Field PrintStream System.out>
	//   27   63:aload_2         
	//   28   64:invokestatic    #68  <Method String Util4Java.getExceptionInfo(Exception)>
	//   29   67:invokevirtual   #80  <Method void PrintStream.println(String)>
		if(obj != null)
	//*  30   70:aload_1         
	//*  31   71:ifnull          129
		{
			((KeyPairGenerator) (obj)).initialize(i, new SecureRandom());
	//   32   74:aload_1         
	//   33   75:iload_0         
	//   34   76:new             #82  <Class SecureRandom>
	//   35   79:dup             
	//   36   80:invokespecial   #83  <Method void SecureRandom()>
	//   37   83:invokevirtual   #87  <Method void KeyPairGenerator.initialize(int, SecureRandom)>
			obj = ((Object) (((KeyPairGenerator) (obj)).generateKeyPair()));
	//   38   86:aload_1         
	//   39   87:invokevirtual   #91  <Method KeyPair KeyPairGenerator.generateKeyPair()>
	//   40   90:astore_1        
			((Map) (hashmap)).put("PublicKey", ((Object) (((KeyPair) (obj)).getPublic().getEncoded())));
	//   41   91:aload_3         
	//   42   92:ldc1            #14  <String "PublicKey">
	//   43   94:aload_1         
	//   44   95:invokevirtual   #97  <Method PublicKey KeyPair.getPublic()>
	//   45   98:invokeinterface #103 <Method byte[] PublicKey.getEncoded()>
	//   46  103:invokeinterface #109 <Method Object Map.put(Object, Object)>
	//   47  108:pop             
			((Map) (hashmap)).put("PrivateKey", ((Object) (((KeyPair) (obj)).getPrivate().getEncoded())));
	//   48  109:aload_3         
	//   49  110:ldc1            #11  <String "PrivateKey">
	//   50  112:aload_1         
	//   51  113:invokevirtual   #113 <Method PrivateKey KeyPair.getPrivate()>
	//   52  116:invokeinterface #116 <Method byte[] PrivateKey.getEncoded()>
	//   53  121:invokeinterface #109 <Method Object Map.put(Object, Object)>
	//   54  126:pop             
			return ((Map) (hashmap));
	//   55  127:aload_3         
	//   56  128:areturn         
		} else
		{
			return null;
	//   57  129:aconst_null     
	//   58  130:areturn         
		}
	}

	public static void main(String args[])
	{
		new DSA();
	//    0    0:new             #2   <Class DSA>
	//    1    3:dup             
	//    2    4:invokespecial   #121 <Method void DSA()>
	//    3    7:pop             
		generateKey(1024);
	//    4    8:sipush          1024
	//    5   11:invokestatic    #123 <Method Map generateKey(int)>
	//    6   14:pop             
	//    7   15:return          
	}

	private static final String KEY_ALGORITHM = "DSA";
	private static final String PRIVATE_KEY = "PrivateKey";
	private static final String PUBLIC_KEY = "PublicKey";
	private static FMLog log = LogFactory.getInstance().getLog();

	static 
	{
	//    0    0:invokestatic    #24  <Method LogFactory LogFactory.getInstance()>
	//    1    3:invokevirtual   #28  <Method FMLog LogFactory.getLog()>
	//    2    6:putstatic       #30  <Field FMLog log>
	//*   3    9:return          
	}
}
