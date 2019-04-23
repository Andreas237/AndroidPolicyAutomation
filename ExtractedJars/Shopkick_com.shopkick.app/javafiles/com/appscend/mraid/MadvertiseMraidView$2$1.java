// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.VideoView;
import java.io.IOException;

// Referenced classes of package com.appscend.mraid:
//			MadvertiseMraidView, MadvertiseUtil

class MadvertiseMraidView$2$1
	implements android.media.Listener
{

	public void onCompletion(MediaPlayer mediaplayer)
	{
		mediaplayer.stop();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #28  <Method void MediaPlayer.stop()>
	//    2    4:return          
	}

	final MadvertiseMraidView._cls2 this$1;

	MadvertiseMraidView$2$1()
	{
		this$1 = MadvertiseMraidView._cls2.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MadvertiseMraidView$2 this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/appscend/mraid/MadvertiseMraidView$2

/* anonymous class */
	class MadvertiseMraidView._cls2 extends WebChromeClient
	{

		public void onHideCustomView()
		{
			if(MadvertiseMraidView.access$500(MadvertiseMraidView.this) != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field MadvertiseMraidView this$0>
		//*   2    4:invokestatic    #27  <Method VideoView MadvertiseMraidView.access$500(MadvertiseMraidView)>
		//*   3    7:ifnull          53
			{
				((ViewGroup)getParent()).removeView(((View) (MadvertiseMraidView.access$500(MadvertiseMraidView.this))));
		//    4   10:aload_0         
		//    5   11:getfield        #18  <Field MadvertiseMraidView this$0>
		//    6   14:invokevirtual   #31  <Method android.view.ViewParent MadvertiseMraidView.getParent()>
		//    7   17:checkcast       #33  <Class ViewGroup>
		//    8   20:aload_0         
		//    9   21:getfield        #18  <Field MadvertiseMraidView this$0>
		//   10   24:invokestatic    #27  <Method VideoView MadvertiseMraidView.access$500(MadvertiseMraidView)>
		//   11   27:invokevirtual   #37  <Method void ViewGroup.removeView(View)>
				if(MadvertiseMraidView.access$500(MadvertiseMraidView.this).isPlaying())
		//*  12   30:aload_0         
		//*  13   31:getfield        #18  <Field MadvertiseMraidView this$0>
		//*  14   34:invokestatic    #27  <Method VideoView MadvertiseMraidView.access$500(MadvertiseMraidView)>
		//*  15   37:invokevirtual   #43  <Method boolean VideoView.isPlaying()>
		//*  16   40:ifeq            53
					MadvertiseMraidView.access$500(MadvertiseMraidView.this).stopPlayback();
		//   17   43:aload_0         
		//   18   44:getfield        #18  <Field MadvertiseMraidView this$0>
		//   19   47:invokestatic    #27  <Method VideoView MadvertiseMraidView.access$500(MadvertiseMraidView)>
		//   20   50:invokevirtual   #46  <Method void VideoView.stopPlayback()>
			}
		//   21   53:return          
		}

		public void onShowCustomView(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
		{
			MadvertiseUtil.logMessage(((String) (null)), 4, "showing VideoView");
		//    0    0:aconst_null     
		//    1    1:iconst_4        
		//    2    2:ldc1            #50  <String "showing VideoView">
		//    3    4:invokestatic    #56  <Method void MadvertiseUtil.logMessage(String, int, String)>
			super.onShowCustomView(view, customviewcallback);
		//    4    7:aload_0         
		//    5    8:aload_1         
		//    6    9:aload_2         
		//    7   10:invokespecial   #58  <Method void WebChromeClient.onShowCustomView(View, android.webkit.WebChromeClient$CustomViewCallback)>
			if(view instanceof FrameLayout)
		//*   8   13:aload_1         
		//*   9   14:instanceof      #60  <Class FrameLayout>
		//*  10   17:ifeq            127
			{
				view = ((View) ((FrameLayout)view));
		//   11   20:aload_1         
		//   12   21:checkcast       #60  <Class FrameLayout>
		//   13   24:astore_1        
				if(((FrameLayout) (view)).getFocusedChild() instanceof VideoView)
		//*  14   25:aload_1         
		//*  15   26:invokevirtual   #64  <Method View FrameLayout.getFocusedChild()>
		//*  16   29:instanceof      #39  <Class VideoView>
		//*  17   32:ifeq            127
				{
					MadvertiseMraidView.access$502(MadvertiseMraidView.this, (VideoView)((FrameLayout) (view)).getFocusedChild());
		//   18   35:aload_0         
		//   19   36:getfield        #18  <Field MadvertiseMraidView this$0>
		//   20   39:aload_1         
		//   21   40:invokevirtual   #64  <Method View FrameLayout.getFocusedChild()>
		//   22   43:checkcast       #39  <Class VideoView>
		//   23   46:invokestatic    #68  <Method VideoView MadvertiseMraidView.access$502(MadvertiseMraidView, VideoView)>
		//   24   49:pop             
					((FrameLayout) (view)).removeView(((View) (MadvertiseMraidView.access$500(MadvertiseMraidView.this))));
		//   25   50:aload_1         
		//   26   51:aload_0         
		//   27   52:getfield        #18  <Field MadvertiseMraidView this$0>
		//   28   55:invokestatic    #27  <Method VideoView MadvertiseMraidView.access$500(MadvertiseMraidView)>
		//   29   58:invokevirtual   #69  <Method void FrameLayout.removeView(View)>
					((ViewGroup)getParent()).addView(((View) (MadvertiseMraidView.access$500(MadvertiseMraidView.this))));
		//   30   61:aload_0         
		//   31   62:getfield        #18  <Field MadvertiseMraidView this$0>
		//   32   65:invokevirtual   #31  <Method android.view.ViewParent MadvertiseMraidView.getParent()>
		//   33   68:checkcast       #33  <Class ViewGroup>
		//   34   71:aload_0         
		//   35   72:getfield        #18  <Field MadvertiseMraidView this$0>
		//   36   75:invokestatic    #27  <Method VideoView MadvertiseMraidView.access$500(MadvertiseMraidView)>
		//   37   78:invokevirtual   #72  <Method void ViewGroup.addView(View)>
					MadvertiseMraidView.access$500(MadvertiseMraidView.this).setOnCompletionListener(((android.media.MediaPlayer.OnCompletionListener) (new MadvertiseMraidView._cls2._cls1())));
		//   38   81:aload_0         
		//   39   82:getfield        #18  <Field MadvertiseMraidView this$0>
		//   40   85:invokestatic    #27  <Method VideoView MadvertiseMraidView.access$500(MadvertiseMraidView)>
		//   41   88:new             #11  <Class MadvertiseMraidView$2$1>
		//   42   91:dup             
		//   43   92:aload_0         
		//   44   93:invokespecial   #75  <Method void MadvertiseMraidView$2$1(MadvertiseMraidView$2)>
		//   45   96:invokevirtual   #79  <Method void VideoView.setOnCompletionListener(android.media.MediaPlayer$OnCompletionListener)>
					MadvertiseMraidView.access$500(MadvertiseMraidView.this).setOnErrorListener(new MadvertiseMraidView._cls2._cls2());
		//   46   99:aload_0         
		//   47  100:getfield        #18  <Field MadvertiseMraidView this$0>
		//   48  103:invokestatic    #27  <Method VideoView MadvertiseMraidView.access$500(MadvertiseMraidView)>
		//   49  106:new             #13  <Class MadvertiseMraidView$2$2>
		//   50  109:dup             
		//   51  110:aload_0         
		//   52  111:invokespecial   #80  <Method void MadvertiseMraidView$2$2(MadvertiseMraidView$2)>
		//   53  114:invokevirtual   #84  <Method void VideoView.setOnErrorListener(android.media.MediaPlayer$OnErrorListener)>
					MadvertiseMraidView.access$500(MadvertiseMraidView.this).start();
		//   54  117:aload_0         
		//   55  118:getfield        #18  <Field MadvertiseMraidView this$0>
		//   56  121:invokestatic    #27  <Method VideoView MadvertiseMraidView.access$500(MadvertiseMraidView)>
		//   57  124:invokevirtual   #87  <Method void VideoView.start()>
				}
			}
		//   58  127:return          
		}

		final MadvertiseMraidView this$0;

			
			{
				this$0 = MadvertiseMraidView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field MadvertiseMraidView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void WebChromeClient()>
			//    5    9:return          
			}

		// Unreferenced inner class com/appscend/mraid/MadvertiseMraidView$2$2

/* anonymous class */
		class MadvertiseMraidView._cls2._cls2
			implements android.media.MediaPlayer.OnErrorListener
		{

			public boolean onError(MediaPlayer mediaplayer, int i, int j)
			{
				MadvertiseUtil.logMessage(((String) (null)), 5, "Error while playing video");
			//    0    0:aconst_null     
			//    1    1:iconst_5        
			//    2    2:ldc1            #25  <String "Error while playing video">
			//    3    4:invokestatic    #31  <Method void MadvertiseUtil.logMessage(String, int, String)>
				if(MadvertiseMraidView.access$000(this$0) != null)
			//*   4    7:aload_0         
			//*   5    8:getfield        #17  <Field MadvertiseMraidView$2 this$1>
			//*   6   11:getfield        #35  <Field MadvertiseMraidView MadvertiseMraidView$2.this$0>
			//*   7   14:invokestatic    #41  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseMraidView.access$000(MadvertiseMraidView)>
			//*   8   17:ifnull          44
					MadvertiseMraidView.access$000(this$0).onError(((Exception) (new IOException("Error while playing video"))));
			//    9   20:aload_0         
			//   10   21:getfield        #17  <Field MadvertiseMraidView$2 this$1>
			//   11   24:getfield        #35  <Field MadvertiseMraidView MadvertiseMraidView$2.this$0>
			//   12   27:invokestatic    #41  <Method MadvertiseView$MadvertiseViewCallbackListener MadvertiseMraidView.access$000(MadvertiseMraidView)>
			//   13   30:new             #43  <Class IOException>
			//   14   33:dup             
			//   15   34:ldc1            #25  <String "Error while playing video">
			//   16   36:invokespecial   #46  <Method void IOException(String)>
			//   17   39:invokeinterface #51  <Method void MadvertiseView$MadvertiseViewCallbackListener.onError(Exception)>
				return false;
			//   18   44:iconst_0        
			//   19   45:ireturn         
			}

			final MadvertiseMraidView._cls2 this$1;

					
					{
						this$1 = MadvertiseMraidView._cls2.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #17  <Field MadvertiseMraidView$2 this$1>
						super();
					//    3    5:aload_0         
					//    4    6:invokespecial   #20  <Method void Object()>
					//    5    9:return          
					}
		}

	}

}
