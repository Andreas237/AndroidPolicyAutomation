// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.net.http;

import java.security.cert.X509Certificate;

// Referenced classes of package android.net.http:
//			SslCertificate

public class SslError
{

	public SslError(int i, SslCertificate sslcertificate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		addError(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #27  <Method boolean addError(int)>
	//    5    9:pop             
		mCertificate = sslcertificate;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #29  <Field SslCertificate mCertificate>
	//    9   15:return          
	}

	public SslError(int i, X509Certificate x509certificate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		addError(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #27  <Method boolean addError(int)>
	//    5    9:pop             
		mCertificate = new SslCertificate(x509certificate);
	//    6   10:aload_0         
	//    7   11:new             #33  <Class SslCertificate>
	//    8   14:dup             
	//    9   15:aload_2         
	//   10   16:invokespecial   #36  <Method void SslCertificate(X509Certificate)>
	//   11   19:putfield        #29  <Field SslCertificate mCertificate>
	//   12   22:return          
	}

	public boolean addError(int i)
	{
		boolean flag;
		if(i >= 0 && i < 4)
	//*   0    0:iload_1         
	//*   1    1:iflt            14
	//*   2    4:iload_1         
	//*   3    5:iconst_4        
	//*   4    6:icmpge          14
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_2        
		else
	//*   7   11:goto            16
			flag = false;
	//    8   14:iconst_0        
	//    9   15:istore_2        
		if(flag)
	//*  10   16:iload_2         
	//*  11   17:ifeq            32
			mErrors = 1 << i | mErrors;
	//   12   20:aload_0         
	//   13   21:iconst_1        
	//   14   22:iload_1         
	//   15   23:ishl            
	//   16   24:aload_0         
	//   17   25:getfield        #38  <Field int mErrors>
	//   18   28:ior             
	//   19   29:putfield        #38  <Field int mErrors>
		return flag;
	//   20   32:iload_2         
	//   21   33:ireturn         
	}

	public SslCertificate getCertificate()
	{
		return mCertificate;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field SslCertificate mCertificate>
	//    2    4:areturn         
	}

	public int getPrimaryError()
	{
		if(mErrors != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field int mErrors>
	//*   2    4:ifeq            33
		{
			for(int i = 3; i >= 0; i--)
	//*   3    7:iconst_3        
	//*   4    8:istore_1        
	//*   5    9:iload_1         
	//*   6   10:iflt            33
				if((mErrors & 1 << i) != 0)
	//*   7   13:aload_0         
	//*   8   14:getfield        #38  <Field int mErrors>
	//*   9   17:iconst_1        
	//*  10   18:iload_1         
	//*  11   19:ishl            
	//*  12   20:iand            
	//*  13   21:ifeq            26
					return i;
	//   14   24:iload_1         
	//   15   25:ireturn         

	//   16   26:iload_1         
	//   17   27:iconst_1        
	//   18   28:isub            
	//   19   29:istore_1        
		}
	//*  20   30:goto            9
		return 0;
	//   21   33:iconst_0        
	//   22   34:ireturn         
	}

	public boolean hasError(int i)
	{
		boolean flag;
		if(i >= 0 && i < 4)
	//*   0    0:iload_1         
	//*   1    1:iflt            14
	//*   2    4:iload_1         
	//*   3    5:iconst_4        
	//*   4    6:icmpge          14
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_2        
		else
	//*   7   11:goto            16
			flag = false;
	//    8   14:iconst_0        
	//    9   15:istore_2        
		boolean flag1 = flag;
	//   10   16:iload_2         
	//   11   17:istore_3        
		if(flag)
	//*  12   18:iload_2         
	//*  13   19:ifeq            37
		{
			if((1 << i & mErrors) != 0)
	//*  14   22:iconst_1        
	//*  15   23:iload_1         
	//*  16   24:ishl            
	//*  17   25:aload_0         
	//*  18   26:getfield        #38  <Field int mErrors>
	//*  19   29:iand            
	//*  20   30:ifeq            35
				return true;
	//   21   33:iconst_1        
	//   22   34:ireturn         
			flag1 = false;
	//   23   35:iconst_0        
	//   24   36:istore_3        
		}
		return flag1;
	//   25   37:iload_3         
	//   26   38:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #47  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("primary error: ");
	//    4    8:aload_1         
	//    5    9:ldc1            #50  <String "primary error: ">
	//    6   11:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(getPrimaryError());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #56  <Method int getPrimaryError()>
	//   11   20:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(" certificate: ");
	//   13   24:aload_1         
	//   14   25:ldc1            #61  <String " certificate: ">
	//   15   27:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(((Object) (getCertificate())));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:invokevirtual   #63  <Method SslCertificate getCertificate()>
	//   20   36:invokevirtual   #66  <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		return stringbuilder.toString();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   24   44:areturn         
	}

	public static final int SSL_EXPIRED = 1;
	public static final int SSL_IDMISMATCH = 2;
	public static final int SSL_MAX_ERROR = 4;
	public static final int SSL_NOTYETVALID = 0;
	public static final int SSL_UNTRUSTED = 3;
	SslCertificate mCertificate;
	int mErrors;
}
