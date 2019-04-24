// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net.ssl;

import javax.net.ssl.KeyManagerFactory;

public class KeyManagerFactoryFactoryBean
{

	public KeyManagerFactoryFactoryBean()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public KeyManagerFactory createKeyManagerFactory()
	{
		if(getProvider() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #18  <Method String getProvider()>
	//*   2    4:ifnull          19
			return KeyManagerFactory.getInstance(getAlgorithm(), getProvider());
	//    3    7:aload_0         
	//    4    8:invokevirtual   #21  <Method String getAlgorithm()>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #18  <Method String getProvider()>
	//    7   15:invokestatic    #27  <Method KeyManagerFactory KeyManagerFactory.getInstance(String, String)>
	//    8   18:areturn         
		else
			return KeyManagerFactory.getInstance(getAlgorithm());
	//    9   19:aload_0         
	//   10   20:invokevirtual   #21  <Method String getAlgorithm()>
	//   11   23:invokestatic    #30  <Method KeyManagerFactory KeyManagerFactory.getInstance(String)>
	//   12   26:areturn         
	}

	public String getAlgorithm()
	{
		if(algorithm == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field String algorithm>
	//*   2    4:ifnonnull       11
			return KeyManagerFactory.getDefaultAlgorithm();
	//    3    7:invokestatic    #35  <Method String KeyManagerFactory.getDefaultAlgorithm()>
	//    4   10:areturn         
		else
			return algorithm;
	//    5   11:aload_0         
	//    6   12:getfield        #32  <Field String algorithm>
	//    7   15:areturn         
	}

	public String getProvider()
	{
		return provider;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String provider>
	//    2    4:areturn         
	}

	public void setAlgorithm(String s)
	{
		algorithm = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field String algorithm>
	//    3    5:return          
	}

	public void setProvider(String s)
	{
		provider = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field String provider>
	//    3    5:return          
	}

	private String algorithm;
	private String provider;
}
