// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.streaming;

import com.comscore.utils.CSLog;
import java.util.HashMap;

// Referenced classes of package com.comscore.streaming:
//			f, StreamSense, StreamSenseState

class d extends f
{

	d(StreamSense streamsense, StreamSenseState streamsensestate, HashMap hashmap)
	{
		c = streamsense;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field StreamSense c>
		a = streamsensestate;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field StreamSenseState a>
		b = hashmap;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #18  <Field HashMap b>
		super(streamsense, ((a) (null)));
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:aconst_null     
	//   12   18:invokespecial   #21  <Method void f(StreamSense, a)>
	//   13   21:return          
	}

	public StreamSenseState getNextState()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field StreamSenseState a>
	//    2    4:areturn         
	}

	public void run()
	{
		CSLog.d(((Object) (c)), "Performing delayed transition");
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field StreamSense c>
	//    2    4:ldc1            #28  <String "Performing delayed transition">
	//    3    6:invokestatic    #34  <Method void CSLog.d(Object, String)>
		StreamSense.a(c, a, b);
	//    4    9:aload_0         
	//    5   10:getfield        #14  <Field StreamSense c>
	//    6   13:aload_0         
	//    7   14:getfield        #16  <Field StreamSenseState a>
	//    8   17:aload_0         
	//    9   18:getfield        #18  <Field HashMap b>
	//   10   21:invokestatic    #38  <Method void StreamSense.a(StreamSense, StreamSenseState, HashMap)>
	//   11   24:return          
	}

	final StreamSenseState a;
	final HashMap b;
	final StreamSense c;
}
