// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity

public class VideoViewActivity extends BaseFragmentActivity
{
	public class LocalMediaController extends MediaController
	{

		public boolean dispatchKeyEvent(KeyEvent keyevent)
		{
			if(keyevent.getKeyCode() == 4)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #29  <Method int KeyEvent.getKeyCode()>
		//*   2    4:iconst_4        
		//*   3    5:icmpne          15
				a.finish();
		//    4    8:aload_0         
		//    5    9:getfield        #20  <Field Activity a>
		//    6   12:invokevirtual   #35  <Method void Activity.finish()>
			return super.dispatchKeyEvent(keyevent);
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:invokespecial   #37  <Method boolean MediaController.dispatchKeyEvent(KeyEvent)>
		//   10   20:ireturn         
		}

		Activity a;
		final VideoViewActivity b;

		LocalMediaController(Activity activity)
		{
			b = VideoViewActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field VideoViewActivity b>
			super(((android.content.Context) (activity)));
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #18  <Method void MediaController(android.content.Context)>
			a = activity;
		//    6   10:aload_0         
		//    7   11:aload_2         
		//    8   12:putfield        #20  <Field Activity a>
		//    9   15:return          
		}
	}


	public VideoViewActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void BaseFragmentActivity()>
		c = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #37  <Field boolean c>
		f = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #39  <Field int f>
		g = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #41  <Field boolean g>
	//   11   19:return          
	}

	static int a(VideoViewActivity videoviewactivity)
	{
		return videoviewactivity.f;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int f>
	//    2    4:ireturn         
	}

	void e()
	{
		Object obj = ((Object) (new LocalMediaController(((Activity) (this)))));
	//    0    0:new             #14  <Class VideoViewActivity$LocalMediaController>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokespecial   #45  <Method void VideoViewActivity$LocalMediaController(VideoViewActivity, Activity)>
	//    5    9:astore_1        
		((LocalMediaController) (obj)).setAnchorView(((View) (d)));
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:getfield        #47  <Field VideoView d>
	//    9   15:invokevirtual   #51  <Method void VideoViewActivity$LocalMediaController.setAnchorView(View)>
		d.setMediaController(((MediaController) (obj)));
	//   10   18:aload_0         
	//   11   19:getfield        #47  <Field VideoView d>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #57  <Method void VideoView.setMediaController(MediaController)>
		((LocalMediaController) (obj)).setMediaPlayer(((android.widget.MediaController.MediaPlayerControl) (d)));
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #47  <Field VideoView d>
	//   17   31:invokevirtual   #61  <Method void VideoViewActivity$LocalMediaController.setMediaPlayer(android.widget.MediaController$MediaPlayerControl)>
		obj = ((Object) (Uri.parse(b)));
	//   18   34:aload_0         
	//   19   35:getfield        #63  <Field String b>
	//   20   38:invokestatic    #69  <Method Uri Uri.parse(String)>
	//   21   41:astore_1        
		if(obj != null)
	//*  22   42:aload_1         
	//*  23   43:ifnull          119
		{
			d.setVideoURI(((Uri) (obj)));
	//   24   46:aload_0         
	//   25   47:getfield        #47  <Field VideoView d>
	//   26   50:aload_1         
	//   27   51:invokevirtual   #73  <Method void VideoView.setVideoURI(Uri)>
			d.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {

				public void onCompletion(MediaPlayer mediaplayer)
				{
					if(a.c)
				//*   0    0:aload_0         
				//*   1    1:getfield        #17  <Field VideoViewActivity a>
				//*   2    4:getfield        #26  <Field boolean VideoViewActivity.c>
				//*   3    7:ifeq            17
						a.finish();
				//    4   10:aload_0         
				//    5   11:getfield        #17  <Field VideoViewActivity a>
				//    6   14:invokevirtual   #29  <Method void VideoViewActivity.finish()>
					a.e.setVisibility(0);
				//    7   17:aload_0         
				//    8   18:getfield        #17  <Field VideoViewActivity a>
				//    9   21:getfield        #32  <Field ImageView VideoViewActivity.e>
				//   10   24:iconst_0        
				//   11   25:invokevirtual   #38  <Method void ImageView.setVisibility(int)>
				//   12   28:return          
				}

				final VideoViewActivity a;

			
			{
				a = VideoViewActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field VideoViewActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   28   54:aload_0         
	//   29   55:getfield        #47  <Field VideoView d>
	//   30   58:new             #6   <Class VideoViewActivity$1>
	//   31   61:dup             
	//   32   62:aload_0         
	//   33   63:invokespecial   #76  <Method void VideoViewActivity$1(VideoViewActivity)>
	//   34   66:invokevirtual   #80  <Method void VideoView.setOnCompletionListener(android.media.MediaPlayer$OnCompletionListener)>
			if(f > 0)
	//*  35   69:aload_0         
	//*  36   70:getfield        #39  <Field int f>
	//*  37   73:ifle            87
				d.seekTo(f);
	//   38   76:aload_0         
	//   39   77:getfield        #47  <Field VideoView d>
	//   40   80:aload_0         
	//   41   81:getfield        #39  <Field int f>
	//   42   84:invokevirtual   #84  <Method void VideoView.seekTo(int)>
			d.start();
	//   43   87:aload_0         
	//   44   88:getfield        #47  <Field VideoView d>
	//   45   91:invokevirtual   #87  <Method void VideoView.start()>
			e.setVisibility(8);
	//   46   94:aload_0         
	//   47   95:getfield        #89  <Field ImageView e>
	//   48   98:bipush          8
	//   49  100:invokevirtual   #94  <Method void ImageView.setVisibility(int)>
			e.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.e.setVisibility(8);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field VideoViewActivity a>
				//    2    4:getfield        #25  <Field ImageView VideoViewActivity.e>
				//    3    7:bipush          8
				//    4    9:invokevirtual   #31  <Method void ImageView.setVisibility(int)>
					a.d.start();
				//    5   12:aload_0         
				//    6   13:getfield        #17  <Field VideoViewActivity a>
				//    7   16:getfield        #35  <Field VideoView VideoViewActivity.d>
				//    8   19:invokevirtual   #40  <Method void VideoView.start()>
				//    9   22:return          
				}

				final VideoViewActivity a;

			
			{
				a = VideoViewActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field VideoViewActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   50  103:aload_0         
	//   51  104:getfield        #89  <Field ImageView e>
	//   52  107:new             #8   <Class VideoViewActivity$2>
	//   53  110:dup             
	//   54  111:aload_0         
	//   55  112:invokespecial   #95  <Method void VideoViewActivity$2(VideoViewActivity)>
	//   56  115:invokevirtual   #99  <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
			return;
	//   57  118:return          
		} else
		{
			String s = a;
	//   58  119:getstatic       #101 <Field String a>
	//   59  122:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   60  123:new             #103 <Class StringBuilder>
	//   61  126:dup             
	//   62  127:invokespecial   #104 <Method void StringBuilder()>
	//   63  130:astore_2        
			stringbuilder.append("the uri for the Help Video is null, Url given:");
	//   64  131:aload_2         
	//   65  132:ldc1            #106 <String "the uri for the Help Video is null, Url given:">
	//   66  134:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   67  137:pop             
			stringbuilder.append(b);
	//   68  138:aload_2         
	//   69  139:aload_0         
	//   70  140:getfield        #63  <Field String b>
	//   71  143:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   72  146:pop             
			o.b(s, stringbuilder.toString());
	//   73  147:aload_1         
	//   74  148:aload_2         
	//   75  149:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   76  152:invokestatic    #119 <Method void o.b(String, String)>
			return;
	//   77  155:return          
		}
	}

	public void onBackPressed()
	{
		super.onBackPressed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #122 <Method void BaseFragmentActivity.onBackPressed()>
		finish();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #125 <Method void finish()>
	//    4    8:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #129 <Method void BaseFragmentActivity.onCreate(Bundle)>
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          19
			f = bundle.getInt("SEEK_POSITION");
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:ldc1            #131 <String "SEEK_POSITION">
	//    8   13:invokevirtual   #137 <Method int Bundle.getInt(String)>
	//    9   16:putfield        #39  <Field int f>
		if(getResources().getConfiguration().orientation == 2)
	//*  10   19:aload_0         
	//*  11   20:invokevirtual   #141 <Method Resources getResources()>
	//*  12   23:invokevirtual   #147 <Method Configuration Resources.getConfiguration()>
	//*  13   26:getfield        #152 <Field int Configuration.orientation>
	//*  14   29:iconst_2        
	//*  15   30:icmpne          52
		{
			requestWindowFeature(1);
	//   16   33:aload_0         
	//   17   34:iconst_1        
	//   18   35:invokevirtual   #156 <Method boolean requestWindowFeature(int)>
	//   19   38:pop             
			getWindow().setFlags(1024, 1024);
	//   20   39:aload_0         
	//   21   40:invokevirtual   #160 <Method Window getWindow()>
	//   22   43:sipush          1024
	//   23   46:sipush          1024
	//   24   49:invokevirtual   #166 <Method void Window.setFlags(int, int)>
		}
	//   25   52:return          
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #169 <Method void BaseFragmentActivity.onPause()>
		g = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #41  <Field boolean g>
		if(d == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #47  <Field VideoView d>
	//*   7   13:ifnonnull       17
			return;
	//    8   16:return          
		f = d.getCurrentPosition();
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #47  <Field VideoView d>
	//   12   22:invokevirtual   #173 <Method int VideoView.getCurrentPosition()>
	//   13   25:putfield        #39  <Field int f>
		if(d.canPause())
	//*  14   28:aload_0         
	//*  15   29:getfield        #47  <Field VideoView d>
	//*  16   32:invokevirtual   #177 <Method boolean VideoView.canPause()>
	//*  17   35:ifeq            45
			d.pause();
	//   18   38:aload_0         
	//   19   39:getfield        #47  <Field VideoView d>
	//   20   42:invokevirtual   #180 <Method void VideoView.pause()>
	//   21   45:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #183 <Method void BaseFragmentActivity.onResume()>
		if(d == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #47  <Field VideoView d>
	//*   4    8:ifnonnull       17
		{
			g = false;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #41  <Field boolean g>
			return;
	//    8   16:return          
		}
		if(f > 0)
	//*   9   17:aload_0         
	//*  10   18:getfield        #39  <Field int f>
	//*  11   21:ifle            35
			d.seekTo(f);
	//   12   24:aload_0         
	//   13   25:getfield        #47  <Field VideoView d>
	//   14   28:aload_0         
	//   15   29:getfield        #39  <Field int f>
	//   16   32:invokevirtual   #84  <Method void VideoView.seekTo(int)>
		if(!g)
	//*  17   35:aload_0         
	//*  18   36:getfield        #41  <Field boolean g>
	//*  19   39:ifne            52
			d.start();
	//   20   42:aload_0         
	//   21   43:getfield        #47  <Field VideoView d>
	//   22   46:invokevirtual   #87  <Method void VideoView.start()>
		else
	//*  23   49:goto            67
			d.setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() {

				public void onPrepared(MediaPlayer mediaplayer)
				{
					a.d.seekTo(VideoViewActivity.a(a));
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field VideoViewActivity a>
				//    2    4:getfield        #28  <Field VideoView VideoViewActivity.d>
				//    3    7:aload_0         
				//    4    8:getfield        #19  <Field VideoViewActivity a>
				//    5   11:invokestatic    #31  <Method int VideoViewActivity.a(VideoViewActivity)>
				//    6   14:invokevirtual   #37  <Method void VideoView.seekTo(int)>
					a.d.start();
				//    7   17:aload_0         
				//    8   18:getfield        #19  <Field VideoViewActivity a>
				//    9   21:getfield        #28  <Field VideoView VideoViewActivity.d>
				//   10   24:invokevirtual   #40  <Method void VideoView.start()>
					a.d.postDelayed(new Runnable(this) {

						public void run()
						{
							a.a.d.pause();
						//    0    0:aload_0         
						//    1    1:getfield        #17  <Field VideoViewActivity$3 a>
						//    2    4:getfield        #25  <Field VideoViewActivity VideoViewActivity$3.a>
						//    3    7:getfield        #31  <Field VideoView VideoViewActivity.d>
						//    4   10:invokevirtual   #36  <Method void VideoView.pause()>
						//    5   13:return          
						}

						final _cls3 a;

			
			{
				a = _pcls3;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field VideoViewActivity$3 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
					}
, 400L);
				//   11   27:aload_0         
				//   12   28:getfield        #19  <Field VideoViewActivity a>
				//   13   31:getfield        #28  <Field VideoView VideoViewActivity.d>
				//   14   34:new             #13  <Class VideoViewActivity$3$1>
				//   15   37:dup             
				//   16   38:aload_0         
				//   17   39:invokespecial   #43  <Method void VideoViewActivity$3$1(VideoViewActivity$3)>
				//   18   42:ldc2w           #44  <Long 400L>
				//   19   45:invokevirtual   #49  <Method boolean VideoView.postDelayed(Runnable, long)>
				//   20   48:pop             
				//   21   49:return          
				}

				final VideoViewActivity a;

			
			{
				a = VideoViewActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field VideoViewActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   24   52:aload_0         
	//   25   53:getfield        #47  <Field VideoView d>
	//   26   56:new             #10  <Class VideoViewActivity$3>
	//   27   59:dup             
	//   28   60:aload_0         
	//   29   61:invokespecial   #184 <Method void VideoViewActivity$3(VideoViewActivity)>
	//   30   64:invokevirtual   #188 <Method void VideoView.setOnPreparedListener(android.media.MediaPlayer$OnPreparedListener)>
		g = false;
	//   31   67:aload_0         
	//   32   68:iconst_0        
	//   33   69:putfield        #41  <Field boolean g>
	//   34   72:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		if(d == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field VideoView d>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(f > 0)
	//*   4    8:aload_0         
	//*   5    9:getfield        #39  <Field int f>
	//*   6   12:ifle            25
			bundle.putInt("SEEK_POSITION", f);
	//    7   15:aload_1         
	//    8   16:ldc1            #131 <String "SEEK_POSITION">
	//    9   18:aload_0         
	//   10   19:getfield        #39  <Field int f>
	//   11   22:invokevirtual   #193 <Method void Bundle.putInt(String, int)>
	//   12   25:return          
	}

	public static final String a = "VideoViewActivity";
	String b;
	boolean c;
	VideoView d;
	ImageView e;
	private int f;
	private boolean g;

	static 
	{
	//    0    0:return          
	}
}
