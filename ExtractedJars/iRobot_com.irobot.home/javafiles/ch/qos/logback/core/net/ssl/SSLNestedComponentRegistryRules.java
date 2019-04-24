// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net.ssl;

import ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;

// Referenced classes of package ch.qos.logback.core.net.ssl:
//			SSLComponent, SSLConfiguration, SSLParametersConfiguration, KeyStoreFactoryBean, 
//			KeyManagerFactoryFactoryBean, TrustManagerFactoryFactoryBean, SecureRandomFactoryBean

public class SSLNestedComponentRegistryRules
{

	public SSLNestedComponentRegistryRules()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void addDefaultNestedComponentRegistryRules(DefaultNestedComponentRegistry defaultnestedcomponentregistry)
	{
		defaultnestedcomponentregistry.add(ch/qos/logback/core/net/ssl/SSLComponent, "ssl", ch/qos/logback/core/net/ssl/SSLConfiguration);
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <Class SSLComponent>
	//    2    3:ldc1            #15  <String "ssl">
	//    3    5:ldc1            #17  <Class SSLConfiguration>
	//    4    7:invokevirtual   #23  <Method void DefaultNestedComponentRegistry.add(Class, String, Class)>
		defaultnestedcomponentregistry.add(ch/qos/logback/core/net/ssl/SSLConfiguration, "parameters", ch/qos/logback/core/net/ssl/SSLParametersConfiguration);
	//    5   10:aload_0         
	//    6   11:ldc1            #17  <Class SSLConfiguration>
	//    7   13:ldc1            #25  <String "parameters">
	//    8   15:ldc1            #27  <Class SSLParametersConfiguration>
	//    9   17:invokevirtual   #23  <Method void DefaultNestedComponentRegistry.add(Class, String, Class)>
		defaultnestedcomponentregistry.add(ch/qos/logback/core/net/ssl/SSLConfiguration, "keyStore", ch/qos/logback/core/net/ssl/KeyStoreFactoryBean);
	//   10   20:aload_0         
	//   11   21:ldc1            #17  <Class SSLConfiguration>
	//   12   23:ldc1            #29  <String "keyStore">
	//   13   25:ldc1            #31  <Class KeyStoreFactoryBean>
	//   14   27:invokevirtual   #23  <Method void DefaultNestedComponentRegistry.add(Class, String, Class)>
		defaultnestedcomponentregistry.add(ch/qos/logback/core/net/ssl/SSLConfiguration, "trustStore", ch/qos/logback/core/net/ssl/KeyStoreFactoryBean);
	//   15   30:aload_0         
	//   16   31:ldc1            #17  <Class SSLConfiguration>
	//   17   33:ldc1            #33  <String "trustStore">
	//   18   35:ldc1            #31  <Class KeyStoreFactoryBean>
	//   19   37:invokevirtual   #23  <Method void DefaultNestedComponentRegistry.add(Class, String, Class)>
		defaultnestedcomponentregistry.add(ch/qos/logback/core/net/ssl/SSLConfiguration, "keyManagerFactory", ch/qos/logback/core/net/ssl/KeyManagerFactoryFactoryBean);
	//   20   40:aload_0         
	//   21   41:ldc1            #17  <Class SSLConfiguration>
	//   22   43:ldc1            #35  <String "keyManagerFactory">
	//   23   45:ldc1            #37  <Class KeyManagerFactoryFactoryBean>
	//   24   47:invokevirtual   #23  <Method void DefaultNestedComponentRegistry.add(Class, String, Class)>
		defaultnestedcomponentregistry.add(ch/qos/logback/core/net/ssl/SSLConfiguration, "trustManagerFactory", ch/qos/logback/core/net/ssl/TrustManagerFactoryFactoryBean);
	//   25   50:aload_0         
	//   26   51:ldc1            #17  <Class SSLConfiguration>
	//   27   53:ldc1            #39  <String "trustManagerFactory">
	//   28   55:ldc1            #41  <Class TrustManagerFactoryFactoryBean>
	//   29   57:invokevirtual   #23  <Method void DefaultNestedComponentRegistry.add(Class, String, Class)>
		defaultnestedcomponentregistry.add(ch/qos/logback/core/net/ssl/SSLConfiguration, "secureRandom", ch/qos/logback/core/net/ssl/SecureRandomFactoryBean);
	//   30   60:aload_0         
	//   31   61:ldc1            #17  <Class SSLConfiguration>
	//   32   63:ldc1            #43  <String "secureRandom">
	//   33   65:ldc1            #45  <Class SecureRandomFactoryBean>
	//   34   67:invokevirtual   #23  <Method void DefaultNestedComponentRegistry.add(Class, String, Class)>
	//   35   70:return          
	}
}
