// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net.ssl;


// Referenced classes of package ch.qos.logback.core.net.ssl:
//			SSLContextFactoryBean, SSLParametersConfiguration

public class SSLConfiguration extends SSLContextFactoryBean
{

	public SSLConfiguration()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void SSLContextFactoryBean()>
	//    2    4:return          
	}

	public SSLParametersConfiguration getParameters()
	{
		if(parameters == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field SSLParametersConfiguration parameters>
	//*   2    4:ifnonnull       18
			parameters = new SSLParametersConfiguration();
	//    3    7:aload_0         
	//    4    8:new             #17  <Class SSLParametersConfiguration>
	//    5   11:dup             
	//    6   12:invokespecial   #18  <Method void SSLParametersConfiguration()>
	//    7   15:putfield        #15  <Field SSLParametersConfiguration parameters>
		return parameters;
	//    8   18:aload_0         
	//    9   19:getfield        #15  <Field SSLParametersConfiguration parameters>
	//   10   22:areturn         
	}

	public void setParameters(SSLParametersConfiguration sslparametersconfiguration)
	{
		parameters = sslparametersconfiguration;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field SSLParametersConfiguration parameters>
	//    3    5:return          
	}

	private SSLParametersConfiguration parameters;
}
