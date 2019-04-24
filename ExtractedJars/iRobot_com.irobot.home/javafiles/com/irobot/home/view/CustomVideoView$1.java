// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.media.MediaPlayer;
import android.os.Handler;

// Referenced classes of package com.irobot.home.view:
//			CustomVideoView

class CustomVideoView$1
	implements android.media.aredListener
{

	public void onPrepared(MediaPlayer mediaplayer)
	{
		CustomVideoView.a(a, CustomVideoView.a(a).getVideoWidth(), CustomVideoView.a(a).getVideoHeight());
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field CustomVideoView a>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field CustomVideoView a>
	//    4    8:invokestatic    #28  <Method MediaPlayer CustomVideoView.a(CustomVideoView)>
	//    5   11:invokevirtual   #34  <Method int MediaPlayer.getVideoWidth()>
	//    6   14:aload_0         
	//    7   15:getfield        #19  <Field CustomVideoView a>
	//    8   18:invokestatic    #28  <Method MediaPlayer CustomVideoView.a(CustomVideoView)>
	//    9   21:invokevirtual   #37  <Method int MediaPlayer.getVideoHeight()>
	//   10   24:invokestatic    #40  <Method void CustomVideoView.a(CustomVideoView, int, int)>
		mediaplayer.start();
	//   11   27:aload_1         
	//   12   28:invokevirtual   #43  <Method void MediaPlayer.start()>
		(new Handler()).post(new Runnable(mediaplayer) {

			public void run()
			{
				if(CustomVideoView.b(b.a))
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field CustomVideoView$1 b>
			//*   2    4:getfield        #31  <Field CustomVideoView CustomVideoView$1.a>
			//*   3    7:invokestatic    #36  <Method boolean CustomVideoView.b(CustomVideoView)>
			//*   4   10:ifeq            14
					return;
			//    5   13:return          
				if(a.getCurrentPosition() != 0)
			//*   6   14:aload_0         
			//*   7   15:getfield        #21  <Field MediaPlayer a>
			//*   8   18:invokevirtual   #42  <Method int MediaPlayer.getCurrentPosition()>
			//*   9   21:ifeq            53
				{
					if(CustomVideoView.c(b.a) != null)
			//*  10   24:aload_0         
			//*  11   25:getfield        #19  <Field CustomVideoView$1 b>
			//*  12   28:getfield        #31  <Field CustomVideoView CustomVideoView$1.a>
			//*  13   31:invokestatic    #46  <Method CustomVideoView$a CustomVideoView.c(CustomVideoView)>
			//*  14   34:ifnull          91
					{
						CustomVideoView.c(b.a).e_();
			//   15   37:aload_0         
			//   16   38:getfield        #19  <Field CustomVideoView$1 b>
			//   17   41:getfield        #31  <Field CustomVideoView CustomVideoView$1.a>
			//   18   44:invokestatic    #46  <Method CustomVideoView$a CustomVideoView.c(CustomVideoView)>
			//   19   47:invokeinterface #51  <Method void CustomVideoView$a.e_()>
						return;
			//   20   52:return          
					}
					break MISSING_BLOCK_LABEL_91;
				}
				try
				{
					(new Handler()).postDelayed(((Runnable) (this)), 50L);
			//   21   53:new             #53  <Class Handler>
			//   22   56:dup             
			//   23   57:invokespecial   #54  <Method void Handler()>
			//   24   60:aload_0         
			//   25   61:ldc2w           #55  <Long 50L>
			//   26   64:invokevirtual   #60  <Method boolean Handler.postDelayed(Runnable, long)>
			//   27   67:pop             
					return;
			//   28   68:return          
				}
				catch(IllegalStateException illegalstateexception)
			//*  29   69:astore_1        
				{
					illegalstateexception.printStackTrace();
			//   30   70:aload_1         
			//   31   71:invokevirtual   #63  <Method void IllegalStateException.printStackTrace()>
				}
				b.a.onError(a, -1, -1);
			//   32   74:aload_0         
			//   33   75:getfield        #19  <Field CustomVideoView$1 b>
			//   34   78:getfield        #31  <Field CustomVideoView CustomVideoView$1.a>
			//   35   81:aload_0         
			//   36   82:getfield        #21  <Field MediaPlayer a>
			//   37   85:iconst_m1       
			//   38   86:iconst_m1       
			//   39   87:invokevirtual   #67  <Method boolean CustomVideoView.onError(MediaPlayer, int, int)>
			//   40   90:pop             
			//   41   91:return          
			}

			final MediaPlayer a;
			final CustomVideoView._cls1 b;

			
			{
				b = CustomVideoView._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CustomVideoView$1 b>
				a = mediaplayer;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field MediaPlayer a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   13   31:new             #45  <Class Handler>
	//   14   34:dup             
	//   15   35:invokespecial   #46  <Method void Handler()>
	//   16   38:new             #13  <Class CustomVideoView$1$1>
	//   17   41:dup             
	//   18   42:aload_0         
	//   19   43:aload_1         
	//   20   44:invokespecial   #49  <Method void CustomVideoView$1$1(CustomVideoView$1, MediaPlayer)>
	//   21   47:invokevirtual   #53  <Method boolean Handler.post(Runnable)>
	//   22   50:pop             
	//   23   51:return          
	}

	final CustomVideoView a;

	CustomVideoView$1(CustomVideoView customvideoview)
	{
		a = customvideoview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CustomVideoView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
	//    5    9:return          
	}
}
