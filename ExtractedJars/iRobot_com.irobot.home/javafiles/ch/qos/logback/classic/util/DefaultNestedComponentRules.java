// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.util;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.UnsynchronizedAppenderBase;
import ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import ch.qos.logback.core.net.ssl.SSLNestedComponentRegistryRules;

public class DefaultNestedComponentRules
{

	public DefaultNestedComponentRules()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void addDefaultNestedComponentRegistryRules(DefaultNestedComponentRegistry defaultnestedcomponentregistry)
	{
		defaultnestedcomponentregistry.add(ch/qos/logback/core/AppenderBase, "layout", ch/qos/logback/classic/PatternLayout);
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <Class AppenderBase>
	//    2    3:ldc1            #15  <String "layout">
	//    3    5:ldc1            #17  <Class PatternLayout>
	//    4    7:invokevirtual   #23  <Method void DefaultNestedComponentRegistry.add(Class, String, Class)>
		defaultnestedcomponentregistry.add(ch/qos/logback/core/UnsynchronizedAppenderBase, "layout", ch/qos/logback/classic/PatternLayout);
	//    5   10:aload_0         
	//    6   11:ldc1            #25  <Class UnsynchronizedAppenderBase>
	//    7   13:ldc1            #15  <String "layout">
	//    8   15:ldc1            #17  <Class PatternLayout>
	//    9   17:invokevirtual   #23  <Method void DefaultNestedComponentRegistry.add(Class, String, Class)>
		defaultnestedcomponentregistry.add(ch/qos/logback/core/AppenderBase, "encoder", ch/qos/logback/classic/encoder/PatternLayoutEncoder);
	//   10   20:aload_0         
	//   11   21:ldc1            #13  <Class AppenderBase>
	//   12   23:ldc1            #27  <String "encoder">
	//   13   25:ldc1            #29  <Class PatternLayoutEncoder>
	//   14   27:invokevirtual   #23  <Method void DefaultNestedComponentRegistry.add(Class, String, Class)>
		defaultnestedcomponentregistry.add(ch/qos/logback/core/UnsynchronizedAppenderBase, "encoder", ch/qos/logback/classic/encoder/PatternLayoutEncoder);
	//   15   30:aload_0         
	//   16   31:ldc1            #25  <Class UnsynchronizedAppenderBase>
	//   17   33:ldc1            #27  <String "encoder">
	//   18   35:ldc1            #29  <Class PatternLayoutEncoder>
	//   19   37:invokevirtual   #23  <Method void DefaultNestedComponentRegistry.add(Class, String, Class)>
		SSLNestedComponentRegistryRules.addDefaultNestedComponentRegistryRules(defaultnestedcomponentregistry);
	//   20   40:aload_0         
	//   21   41:invokestatic    #33  <Method void SSLNestedComponentRegistryRules.addDefaultNestedComponentRegistryRules(DefaultNestedComponentRegistry)>
	//   22   44:return          
	}
}
