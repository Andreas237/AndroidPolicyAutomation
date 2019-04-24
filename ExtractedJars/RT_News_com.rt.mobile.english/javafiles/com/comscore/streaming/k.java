// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.streaming;

import java.util.HashMap;
import java.util.TimerTask;

// Referenced classes of package com.comscore.streaming:
//			StreamSenseMediaPlayer

class k extends TimerTask
{

	k(StreamSenseMediaPlayer streamsensemediaplayer, long l, HashMap hashmap)
	{
		c = streamsensemediaplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field StreamSenseMediaPlayer c>
		a = l;
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:putfield        #16  <Field long a>
		b = hashmap;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #18  <Field HashMap b>
		super();
	//    9   16:aload_0         
	//   10   17:invokespecial   #21  <Method void TimerTask()>
	//   11   20:return          
	}

	public void run()
	{
		if(StreamSenseMediaPlayer.i(c) - a >= 500L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field StreamSenseMediaPlayer c>
	//*   2    4:invokestatic    #29  <Method long StreamSenseMediaPlayer.i(StreamSenseMediaPlayer)>
	//*   3    7:aload_0         
	//*   4    8:getfield        #16  <Field long a>
	//*   5   11:lsub            
	//*   6   12:ldc2w           #30  <Long 500L>
	//*   7   15:lcmp            
	//*   8   16:iflt            46
		{
			StreamSenseMediaPlayer.j(c);
	//    9   19:aload_0         
	//   10   20:getfield        #14  <Field StreamSenseMediaPlayer c>
	//   11   23:invokestatic    #35  <Method boolean StreamSenseMediaPlayer.j(StreamSenseMediaPlayer)>
	//   12   26:pop             
			StreamSenseMediaPlayer.a(c, b);
	//   13   27:aload_0         
	//   14   28:getfield        #14  <Field StreamSenseMediaPlayer c>
	//   15   31:aload_0         
	//   16   32:getfield        #18  <Field HashMap b>
	//   17   35:invokestatic    #38  <Method void StreamSenseMediaPlayer.a(StreamSenseMediaPlayer, HashMap)>
			StreamSenseMediaPlayer.k(c);
	//   18   38:aload_0         
	//   19   39:getfield        #14  <Field StreamSenseMediaPlayer c>
	//   20   42:invokestatic    #42  <Method void StreamSenseMediaPlayer.k(StreamSenseMediaPlayer)>
			return;
	//   21   45:return          
		} else
		{
			StreamSenseMediaPlayer.j(c);
	//   22   46:aload_0         
	//   23   47:getfield        #14  <Field StreamSenseMediaPlayer c>
	//   24   50:invokestatic    #35  <Method boolean StreamSenseMediaPlayer.j(StreamSenseMediaPlayer)>
	//   25   53:pop             
			StreamSenseMediaPlayer.b(c, b);
	//   26   54:aload_0         
	//   27   55:getfield        #14  <Field StreamSenseMediaPlayer c>
	//   28   58:aload_0         
	//   29   59:getfield        #18  <Field HashMap b>
	//   30   62:invokestatic    #44  <Method void StreamSenseMediaPlayer.b(StreamSenseMediaPlayer, HashMap)>
			return;
	//   31   65:return          
		}
	}

	final long a;
	final HashMap b;
	final StreamSenseMediaPlayer c;
}
