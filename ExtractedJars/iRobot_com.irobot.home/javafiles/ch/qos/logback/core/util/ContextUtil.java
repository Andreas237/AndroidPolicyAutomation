// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ContextAwareBase;
import java.util.*;

public class ContextUtil extends ContextAwareBase
{

	public ContextUtil(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void ContextAwareBase()>
		setContext(context);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #12  <Method void setContext(Context)>
	//    5    9:return          
	}

	public void addHostNameAsProperty()
	{
		context.putProperty("HOSTNAME", "localhost");
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context context>
	//    2    4:ldc1            #20  <String "HOSTNAME">
	//    3    6:ldc1            #22  <String "localhost">
	//    4    8:invokeinterface #28  <Method void Context.putProperty(String, String)>
	//    5   13:return          
	}

	public void addProperties(Properties properties)
	{
		if(properties == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		String s;
		for(Iterator iterator = properties.keySet().iterator(); iterator.hasNext(); context.putProperty(s, properties.getProperty(s)))
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #36  <Method Set Properties.keySet()>
	//*   5    9:invokeinterface #42  <Method Iterator Set.iterator()>
	//*   6   14:astore_2        
	//*   7   15:aload_2         
	//*   8   16:invokeinterface #48  <Method boolean Iterator.hasNext()>
	//*   9   21:ifeq            52
			s = (String)iterator.next();
	//   10   24:aload_2         
	//   11   25:invokeinterface #52  <Method Object Iterator.next()>
	//   12   30:checkcast       #54  <Class String>
	//   13   33:astore_3        

	//   14   34:aload_0         
	//   15   35:getfield        #18  <Field Context context>
	//   16   38:aload_3         
	//   17   39:aload_1         
	//   18   40:aload_3         
	//   19   41:invokevirtual   #58  <Method String Properties.getProperty(String)>
	//   20   44:invokeinterface #28  <Method void Context.putProperty(String, String)>
	//*  21   49:goto            15
	//   22   52:return          
	}
}
