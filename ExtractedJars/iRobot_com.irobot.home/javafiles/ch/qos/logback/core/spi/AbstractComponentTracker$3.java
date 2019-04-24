// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.spi;


// Referenced classes of package ch.qos.logback.core.spi:
//			AbstractComponentTracker

class AbstractComponentTracker$3
	implements movalPredicator
{

	public boolean isSlatedForRemoval(try try1, long l)
	{
		return AbstractComponentTracker.access$100(AbstractComponentTracker.this, try1, l);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AbstractComponentTracker this$0>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokestatic    #25  <Method boolean AbstractComponentTracker.access$100(AbstractComponentTracker, AbstractComponentTracker$Entry, long)>
	//    5    9:ireturn         
	}

	final AbstractComponentTracker this$0;

	AbstractComponentTracker$3()
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
