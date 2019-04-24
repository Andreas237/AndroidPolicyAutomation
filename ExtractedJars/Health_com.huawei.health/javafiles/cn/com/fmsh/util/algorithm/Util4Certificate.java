// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.util.algorithm;

import cn.com.fmsh.util.Util4Java;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.cert.*;

// Referenced classes of package cn.com.fmsh.util.algorithm:
//			DES

public class Util4Certificate
{

	public Util4Certificate()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	public static Certificate decodeCertificate(byte abyte0[])
	{
		try
		{
			abyte0 = ((byte []) ((X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(((InputStream) (new ByteArrayInputStream(abyte0))))));
	//    0    0:ldc1            #30  <String "X.509">
	//    1    2:invokestatic    #35  <Method CertificateFactory CertificateFactory.getInstance(String)>
	//    2    5:new             #37  <Class ByteArrayInputStream>
	//    3    8:dup             
	//    4    9:aload_0         
	//    5   10:invokespecial   #40  <Method void ByteArrayInputStream(byte[])>
	//    6   13:invokevirtual   #44  <Method Certificate CertificateFactory.generateCertificate(InputStream)>
	//    7   16:checkcast       #46  <Class X509Certificate>
	//    8   19:astore_0        
		}
	//*   9   20:aload_0         
	//*  10   21:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  11   22:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   12   23:getstatic       #20  <Field FMLog log>
	//   13   26:ldc1            #48  <Class DES>
	//   14   28:invokevirtual   #54  <Method String Class.getName()>
	//   15   31:aload_0         
	//   16   32:invokestatic    #60  <Method String Util4Java.getExceptionInfo(Exception)>
	//   17   35:invokeinterface #66  <Method void FMLog.error(String, String)>
			return null;
	//   18   40:aconst_null     
	//   19   41:areturn         
		}
		return ((Certificate) (abyte0));
	}

	public static Certificate getCertificate(InputStream inputstream)
		throws Exception
	{
		return CertificateFactory.getInstance("X509").generateCertificate(inputstream);
	//    0    0:ldc1            #71  <String "X509">
	//    1    2:invokestatic    #35  <Method CertificateFactory CertificateFactory.getInstance(String)>
	//    2    5:aload_0         
	//    3    6:invokevirtual   #44  <Method Certificate CertificateFactory.generateCertificate(InputStream)>
	//    4    9:areturn         
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
