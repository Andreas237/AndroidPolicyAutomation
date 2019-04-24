// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.decoder;


// Referenced classes of package com.google.android.exoplayer2.decoder:
//			SimpleDecoder

class SimpleDecoder$1 extends Thread
{

	public void run()
	{
		SimpleDecoder.access$000(SimpleDecoder.this);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field SimpleDecoder this$0>
	//    2    4:invokestatic    #22  <Method void SimpleDecoder.access$000(SimpleDecoder)>
	//    3    7:return          
	}

	final SimpleDecoder this$0;

	SimpleDecoder$1()
	{
		this$0 = SimpleDecoder.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field SimpleDecoder this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Thread()>
	//    5    9:return          
	}
}
