// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net.ssl;

import java.security.*;

public class SecureRandomFactoryBean
{

	public SecureRandomFactoryBean()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public SecureRandom createSecureRandom()
	{
		Object obj1;
		Object obj;
		try
		{
			if(getProvider() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #22  <Method String getProvider()>
	//*   2    4:ifnull          19
				return SecureRandom.getInstance(getAlgorithm(), getProvider());
	//    3    7:aload_0         
	//    4    8:invokevirtual   #25  <Method String getAlgorithm()>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #22  <Method String getProvider()>
	//    7   15:invokestatic    #31  <Method SecureRandom SecureRandom.getInstance(String, String)>
	//    8   18:areturn         
			obj = ((Object) (SecureRandom.getInstance(getAlgorithm())));
	//    9   19:aload_0         
	//   10   20:invokevirtual   #25  <Method String getAlgorithm()>
	//   11   23:invokestatic    #34  <Method SecureRandom SecureRandom.getInstance(String)>
	//   12   26:astore_1        
		}
	//*  13   27:aload_1         
	//*  14   28:areturn         
	//*  15   29:new             #36  <Class StringBuilder>
	//*  16   32:dup             
	//*  17   33:invokespecial   #37  <Method void StringBuilder()>
	//*  18   36:astore_1        
	//*  19   37:aload_1         
	//*  20   38:ldc1            #39  <String "no such secure random algorithm: ">
	//*  21   40:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//*  22   43:pop             
	//*  23   44:aload_1         
	//*  24   45:aload_0         
	//*  25   46:invokevirtual   #25  <Method String getAlgorithm()>
	//*  26   49:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//*  27   52:pop             
	//*  28   53:new             #18  <Class NoSuchAlgorithmException>
	//*  29   56:dup             
	//*  30   57:aload_1         
	//*  31   58:invokevirtual   #46  <Method String StringBuilder.toString()>
	//*  32   61:invokespecial   #49  <Method void NoSuchAlgorithmException(String)>
	//*  33   64:athrow          
	//*  34   65:new             #36  <Class StringBuilder>
	//*  35   68:dup             
	//*  36   69:invokespecial   #37  <Method void StringBuilder()>
	//*  37   72:astore_1        
	//*  38   73:aload_1         
	//*  39   74:ldc1            #51  <String "no such secure random provider: ">
	//*  40   76:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//*  41   79:pop             
	//*  42   80:aload_1         
	//*  43   81:aload_0         
	//*  44   82:invokevirtual   #22  <Method String getProvider()>
	//*  45   85:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//*  46   88:pop             
	//*  47   89:new             #16  <Class NoSuchProviderException>
	//*  48   92:dup             
	//*  49   93:aload_1         
	//*  50   94:invokevirtual   #46  <Method String StringBuilder.toString()>
	//*  51   97:invokespecial   #52  <Method void NoSuchProviderException(String)>
	//*  52  100:athrow          
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append("no such secure random provider: ");
			((StringBuilder) (obj)).append(getProvider());
			throw new NoSuchProviderException(((StringBuilder) (obj)).toString());
		}
	//*  53  101:astore_1        
	//*  54  102:goto            65
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append("no such secure random algorithm: ");
			((StringBuilder) (obj)).append(getAlgorithm());
			throw new NoSuchAlgorithmException(((StringBuilder) (obj)).toString());
		}
		return ((SecureRandom) (obj));
	//*  55  105:astore_1        
	//*  56  106:goto            29
	}

	public String getAlgorithm()
	{
		if(algorithm == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field String algorithm>
	//*   2    4:ifnonnull       10
			return "SHA1PRNG";
	//    3    7:ldc1            #56  <String "SHA1PRNG">
	//    4    9:areturn         
		else
			return algorithm;
	//    5   10:aload_0         
	//    6   11:getfield        #54  <Field String algorithm>
	//    7   14:areturn         
	}

	public String getProvider()
	{
		return provider;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field String provider>
	//    2    4:areturn         
	}

	public void setAlgorithm(String s)
	{
		algorithm = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field String algorithm>
	//    3    5:return          
	}

	public void setProvider(String s)
	{
		provider = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field String provider>
	//    3    5:return          
	}

	private String algorithm;
	private String provider;
}
