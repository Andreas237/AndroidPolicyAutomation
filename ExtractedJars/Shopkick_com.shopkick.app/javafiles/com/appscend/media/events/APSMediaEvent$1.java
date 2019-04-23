// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.events;


// Referenced classes of package com.appscend.media.events:
//			APSMediaEvent

class APSMediaEvent$1
	implements Runnable
{

	public void run()
	{
		if(APSMediaEvent.access$000(APSMediaEvent.this) == SMediaEventState.APSMediaEventStatePreloading)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field APSMediaEvent this$0>
	//*   2    4:invokestatic    #23  <Method APSMediaEvent$APSMediaEventState APSMediaEvent.access$000(APSMediaEvent)>
	//*   3    7:getstatic       #29  <Field APSMediaEvent$APSMediaEventState APSMediaEvent$APSMediaEventState.APSMediaEventStatePreloading>
	//*   4   10:if_acmpne       20
			APSMediaEvent.access$100(APSMediaEvent.this);
	//    5   13:aload_0         
	//    6   14:getfield        #14  <Field APSMediaEvent this$0>
	//    7   17:invokestatic    #32  <Method void APSMediaEvent.access$100(APSMediaEvent)>
	//    8   20:return          
	}

	final APSMediaEvent this$0;

	APSMediaEvent$1()
	{
		this$0 = APSMediaEvent.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field APSMediaEvent this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
