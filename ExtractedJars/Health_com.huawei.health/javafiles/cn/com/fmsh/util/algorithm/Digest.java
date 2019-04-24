// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.util.algorithm;

import cn.com.fmsh.util.FM_Bytes;
import cn.com.fmsh.util.Util4Java;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import java.io.PrintStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class Digest
{

	public Digest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	public static void main(String args[])
	{
		args = ((String []) (new byte[64]));
	//    0    0:bipush          64
	//    1    2:newarray        byte[]
	//    2    4:astore_0        
		(new Random()).nextBytes(((byte []) (args)));
	//    3    5:new             #28  <Class Random>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void Random()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #33  <Method void Random.nextBytes(byte[])>
		args = ((String []) (md5(((byte []) (args)))));
	//    8   16:aload_0         
	//    9   17:invokestatic    #37  <Method byte[] md5(byte[])>
	//   10   20:astore_0        
		System.out.println((new StringBuilder("length:")).append(args.length).toString());
	//   11   21:getstatic       #43  <Field PrintStream System.out>
	//   12   24:new             #45  <Class StringBuilder>
	//   13   27:dup             
	//   14   28:ldc1            #47  <String "length:">
	//   15   30:invokespecial   #50  <Method void StringBuilder(String)>
	//   16   33:aload_0         
	//   17   34:arraylength     
	//   18   35:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   19   38:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   20   41:invokevirtual   #63  <Method void PrintStream.println(String)>
		System.out.println(FM_Bytes.bytesToHexString(((byte []) (args))));
	//   21   44:getstatic       #43  <Field PrintStream System.out>
	//   22   47:aload_0         
	//   23   48:invokestatic    #69  <Method String FM_Bytes.bytesToHexString(byte[])>
	//   24   51:invokevirtual   #63  <Method void PrintStream.println(String)>
	//   25   54:return          
	}

	public static byte[] md5(byte abyte0[])
	{
		MessageDigest messagedigest = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		MessageDigest messagedigest1 = MessageDigest.getInstance("MD5");
	//    2    2:ldc1            #73  <String "MD5">
	//    3    4:invokestatic    #78  <Method MessageDigest MessageDigest.getInstance(String)>
	//    4    7:astore_2        
		messagedigest = messagedigest1;
	//    5    8:aload_2         
	//    6    9:astore_1        
		break MISSING_BLOCK_LABEL_46;
	//    7   10:goto            46
		NoSuchAlgorithmException nosuchalgorithmexception;
		nosuchalgorithmexception;
	//    8   13:astore_2        
		log.error(((Class) (cn/com/fmsh/util/algorithm/Digest)).getName(), "\u521D\u59CB\u5316\u5931\u8D25\uFF0CMessageDigest\u4E0D\u652F\u6301MD5\u3002");
	//    9   14:getstatic       #20  <Field FMLog log>
	//   10   17:ldc1            #2   <Class Digest>
	//   11   19:invokevirtual   #83  <Method String Class.getName()>
	//   12   22:ldc1            #85  <String "\u521D\u59CB\u5316\u5931\u8D25\uFF0CMessageDigest\u4E0D\u652F\u6301MD5\u3002">
	//   13   24:invokeinterface #91  <Method void FMLog.error(String, String)>
		log.error(((Class) (cn/com/fmsh/util/algorithm/Digest)).getName(), Util4Java.getExceptionInfo(((Exception) (nosuchalgorithmexception))));
	//   14   29:getstatic       #20  <Field FMLog log>
	//   15   32:ldc1            #2   <Class Digest>
	//   16   34:invokevirtual   #83  <Method String Class.getName()>
	//   17   37:aload_2         
	//   18   38:invokestatic    #97  <Method String Util4Java.getExceptionInfo(Exception)>
	//   19   41:invokeinterface #91  <Method void FMLog.error(String, String)>
		messagedigest.update(abyte0);
	//   20   46:aload_1         
	//   21   47:aload_0         
	//   22   48:invokevirtual   #100 <Method void MessageDigest.update(byte[])>
		return messagedigest.digest();
	//   23   51:aload_1         
	//   24   52:invokevirtual   #104 <Method byte[] MessageDigest.digest()>
	//   25   55:areturn         
	}

	public static byte[] sha(byte abyte0[])
	{
		MessageDigest messagedigest = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		MessageDigest messagedigest1 = MessageDigest.getInstance("SHA");
	//    2    2:ldc1            #107 <String "SHA">
	//    3    4:invokestatic    #78  <Method MessageDigest MessageDigest.getInstance(String)>
	//    4    7:astore_2        
		messagedigest = messagedigest1;
	//    5    8:aload_2         
	//    6    9:astore_1        
		break MISSING_BLOCK_LABEL_46;
	//    7   10:goto            46
		NoSuchAlgorithmException nosuchalgorithmexception;
		nosuchalgorithmexception;
	//    8   13:astore_2        
		log.error(((Class) (cn/com/fmsh/util/algorithm/Digest)).getName(), "\u521D\u59CB\u5316\u5931\u8D25\uFF0CMessageDigest\u4E0D\u652F\u6301SHA\u3002");
	//    9   14:getstatic       #20  <Field FMLog log>
	//   10   17:ldc1            #2   <Class Digest>
	//   11   19:invokevirtual   #83  <Method String Class.getName()>
	//   12   22:ldc1            #109 <String "\u521D\u59CB\u5316\u5931\u8D25\uFF0CMessageDigest\u4E0D\u652F\u6301SHA\u3002">
	//   13   24:invokeinterface #91  <Method void FMLog.error(String, String)>
		log.error(((Class) (cn/com/fmsh/util/algorithm/Digest)).getName(), Util4Java.getExceptionInfo(((Exception) (nosuchalgorithmexception))));
	//   14   29:getstatic       #20  <Field FMLog log>
	//   15   32:ldc1            #2   <Class Digest>
	//   16   34:invokevirtual   #83  <Method String Class.getName()>
	//   17   37:aload_2         
	//   18   38:invokestatic    #97  <Method String Util4Java.getExceptionInfo(Exception)>
	//   19   41:invokeinterface #91  <Method void FMLog.error(String, String)>
		messagedigest.update(abyte0);
	//   20   46:aload_1         
	//   21   47:aload_0         
	//   22   48:invokevirtual   #100 <Method void MessageDigest.update(byte[])>
		return messagedigest.digest();
	//   23   51:aload_1         
	//   24   52:invokevirtual   #104 <Method byte[] MessageDigest.digest()>
	//   25   55:areturn         
	}

	private static FMLog log = LogFactory.getInstance().getLog();

	static 
	{
	//    0    0:invokestatic    #14  <Method LogFactory LogFactory.getInstance()>
	//    1    3:invokevirtual   #18  <Method FMLog LogFactory.getLog()>
	//    2    6:putstatic       #20  <Field FMLog log>
	//*   3    9:return          
	}
}
