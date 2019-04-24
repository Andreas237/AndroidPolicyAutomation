// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.streaming;


// Referenced classes of package com.comscore.streaming:
//			StreamSense, a, StreamSenseState

abstract class f
	implements Runnable
{

	private f(StreamSense streamsense)
	{
		d = streamsense;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field StreamSense d>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	f(StreamSense streamsense, a a)
	{
		this(streamsense);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void f(StreamSense)>
	//    3    5:return          
	}

	public abstract StreamSenseState getNextState();

	final StreamSense d;
}
