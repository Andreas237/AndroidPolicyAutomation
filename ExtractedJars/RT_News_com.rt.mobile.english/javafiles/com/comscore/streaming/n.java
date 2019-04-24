// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.streaming;

import java.util.TimerTask;

// Referenced classes of package com.comscore.streaming:
//			StreamSenseVideoView

class n extends TimerTask
{

	n(StreamSenseVideoView streamsensevideoview, long l)
	{
		b = streamsensevideoview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field StreamSenseVideoView b>
		a = l;
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
		if(StreamSenseVideoView.e(b) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field StreamSenseVideoView b>
	//*   2    4:invokestatic    #25  <Method java.util.Timer StreamSenseVideoView.e(StreamSenseVideoView)>
	//*   3    7:ifnull          89
		{
			long l = StreamSenseVideoView.a(b);
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field StreamSenseVideoView b>
	//    6   14:invokestatic    #28  <Method long StreamSenseVideoView.a(StreamSenseVideoView)>
	//    7   17:lstore_2        
			boolean flag;
			if(a == l)
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
			if(StreamSenseVideoView.f(b) && flag && !StreamSenseVideoView.g(b))
	//*  18   34:aload_0         
	//*  19   35:getfield        #12  <Field StreamSenseVideoView b>
	//*  20   38:invokestatic    #32  <Method boolean StreamSenseVideoView.f(StreamSenseVideoView)>
	//*  21   41:ifeq            74
	//*  22   44:iload_1         
	//*  23   45:ifeq            74
	//*  24   48:aload_0         
	//*  25   49:getfield        #12  <Field StreamSenseVideoView b>
	//*  26   52:invokestatic    #35  <Method boolean StreamSenseVideoView.g(StreamSenseVideoView)>
	//*  27   55:ifne            74
			{
				StreamSenseVideoView.h(b);
	//   28   58:aload_0         
	//   29   59:getfield        #12  <Field StreamSenseVideoView b>
	//   30   62:invokestatic    #38  <Method boolean StreamSenseVideoView.h(StreamSenseVideoView)>
	//   31   65:pop             
				StreamSenseVideoView.i(b);
	//   32   66:aload_0         
	//   33   67:getfield        #12  <Field StreamSenseVideoView b>
	//   34   70:invokestatic    #42  <Method void StreamSenseVideoView.i(StreamSenseVideoView)>
				return;
	//   35   73:return          
			}
			StreamSenseVideoView.h(b);
	//   36   74:aload_0         
	//   37   75:getfield        #12  <Field StreamSenseVideoView b>
	//   38   78:invokestatic    #38  <Method boolean StreamSenseVideoView.h(StreamSenseVideoView)>
	//   39   81:pop             
			StreamSenseVideoView.d(b);
	//   40   82:aload_0         
	//   41   83:getfield        #12  <Field StreamSenseVideoView b>
	//   42   86:invokestatic    #45  <Method void StreamSenseVideoView.d(StreamSenseVideoView)>
		}
	//   43   89:return          
	}

	final long a;
	final StreamSenseVideoView b;
}
