// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.streaming;

import java.util.TimerTask;

// Referenced classes of package com.comscore.streaming:
//			StreamSenseMediaPlayer

class l extends TimerTask
{

	l(StreamSenseMediaPlayer streamsensemediaplayer, long l1)
	{
		b = streamsensemediaplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field StreamSenseMediaPlayer b>
		a = l1;
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:putfield        #14  <Field long a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #17  <Method void TimerTask()>
	//    8   14:return          
	}

	public void run()
	{
		if(StreamSenseMediaPlayer.l(b) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field StreamSenseMediaPlayer b>
	//*   2    4:invokestatic    #25  <Method java.util.Timer StreamSenseMediaPlayer.l(StreamSenseMediaPlayer)>
	//*   3    7:ifnull          134
		{
			long l1 = StreamSenseMediaPlayer.i(b);
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field StreamSenseMediaPlayer b>
	//    6   14:invokestatic    #29  <Method long StreamSenseMediaPlayer.i(StreamSenseMediaPlayer)>
	//    7   17:lstore_2        
			boolean flag;
			if(a == l1)
	//*   8   18:aload_0         
	//*   9   19:getfield        #14  <Field long a>
	//*  10   22:lload_2         
	//*  11   23:lcmp            
	//*  12   24:ifne            32
				flag = true;
	//   13   27:iconst_1        
	//   14   28:istore_1        
			else
	//*  15   29:goto            34
				flag = false;
	//   16   32:iconst_0        
	//   17   33:istore_1        
			if(StreamSenseMediaPlayer.m(b) && !b.isPlayerPausedForSeeking() && flag && !b.isPlayerPausedForBuffering())
	//*  18   34:aload_0         
	//*  19   35:getfield        #12  <Field StreamSenseMediaPlayer b>
	//*  20   38:invokestatic    #33  <Method boolean StreamSenseMediaPlayer.m(StreamSenseMediaPlayer)>
	//*  21   41:ifeq            78
	//*  22   44:aload_0         
	//*  23   45:getfield        #12  <Field StreamSenseMediaPlayer b>
	//*  24   48:invokevirtual   #37  <Method boolean StreamSenseMediaPlayer.isPlayerPausedForSeeking()>
	//*  25   51:ifne            78
	//*  26   54:iload_1         
	//*  27   55:ifeq            78
	//*  28   58:aload_0         
	//*  29   59:getfield        #12  <Field StreamSenseMediaPlayer b>
	//*  30   62:invokevirtual   #40  <Method boolean StreamSenseMediaPlayer.isPlayerPausedForBuffering()>
	//*  31   65:ifne            78
				StreamSenseMediaPlayer.d(b);
	//   32   68:aload_0         
	//   33   69:getfield        #12  <Field StreamSenseMediaPlayer b>
	//   34   72:invokestatic    #44  <Method void StreamSenseMediaPlayer.d(StreamSenseMediaPlayer)>
			else
	//*  35   75:goto            119
			if(StreamSenseMediaPlayer.m(b) && !b.isPlayerPausedForSeeking() && !flag && b.isPlayerPausedForBuffering())
	//*  36   78:aload_0         
	//*  37   79:getfield        #12  <Field StreamSenseMediaPlayer b>
	//*  38   82:invokestatic    #33  <Method boolean StreamSenseMediaPlayer.m(StreamSenseMediaPlayer)>
	//*  39   85:ifeq            119
	//*  40   88:aload_0         
	//*  41   89:getfield        #12  <Field StreamSenseMediaPlayer b>
	//*  42   92:invokevirtual   #37  <Method boolean StreamSenseMediaPlayer.isPlayerPausedForSeeking()>
	//*  43   95:ifne            119
	//*  44   98:iload_1         
	//*  45   99:ifne            119
	//*  46  102:aload_0         
	//*  47  103:getfield        #12  <Field StreamSenseMediaPlayer b>
	//*  48  106:invokevirtual   #40  <Method boolean StreamSenseMediaPlayer.isPlayerPausedForBuffering()>
	//*  49  109:ifeq            119
				StreamSenseMediaPlayer.e(b);
	//   50  112:aload_0         
	//   51  113:getfield        #12  <Field StreamSenseMediaPlayer b>
	//   52  116:invokestatic    #47  <Method void StreamSenseMediaPlayer.e(StreamSenseMediaPlayer)>
			StreamSenseMediaPlayer.n(b);
	//   53  119:aload_0         
	//   54  120:getfield        #12  <Field StreamSenseMediaPlayer b>
	//   55  123:invokestatic    #50  <Method boolean StreamSenseMediaPlayer.n(StreamSenseMediaPlayer)>
	//   56  126:pop             
			StreamSenseMediaPlayer.k(b);
	//   57  127:aload_0         
	//   58  128:getfield        #12  <Field StreamSenseMediaPlayer b>
	//   59  131:invokestatic    #53  <Method void StreamSenseMediaPlayer.k(StreamSenseMediaPlayer)>
		}
	//   60  134:return          
	}

	final long a;
	final StreamSenseMediaPlayer b;
}
