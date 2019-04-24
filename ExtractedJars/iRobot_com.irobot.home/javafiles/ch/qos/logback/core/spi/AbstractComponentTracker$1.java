// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.spi;

import java.util.LinkedHashMap;

// Referenced classes of package ch.qos.logback.core.spi:
//			AbstractComponentTracker

class AbstractComponentTracker$1
	implements movalPredicator
{

	public boolean isSlatedForRemoval(try try1, long l)
	{
		return liveMap.size() > maxComponents;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AbstractComponentTracker this$0>
	//    2    4:getfield        #25  <Field LinkedHashMap AbstractComponentTracker.liveMap>
	//    3    7:invokevirtual   #31  <Method int LinkedHashMap.size()>
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field AbstractComponentTracker this$0>
	//    6   14:getfield        #35  <Field int AbstractComponentTracker.maxComponents>
	//    7   17:icmple          22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	final AbstractComponentTracker this$0;

	AbstractComponentTracker$1()
	{
		this$0 = AbstractComponentTracker.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field AbstractComponentTracker this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
