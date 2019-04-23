// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.util.Log;
import android.widget.SeekBar;

// Referenced classes of package android.support.v7.app:
//			MediaRouteControllerDialog

class MediaRouteControllerDialog$VolumeChangeListener
	implements android.widget.SeekBar.OnSeekBarChangeListener
{

	public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
	{
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            66
		{
			seekbar = ((SeekBar) ((android.support.v7.media.MediaRouter.RouteInfo)seekbar.getTag()));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #33  <Method Object SeekBar.getTag()>
	//    4    8:checkcast       #35  <Class android.support.v7.media.MediaRouter$RouteInfo>
	//    5   11:astore_1        
			if(MediaRouteControllerDialog.DEBUG)
	//*   6   12:getstatic       #41  <Field boolean MediaRouteControllerDialog.DEBUG>
	//*   7   15:ifeq            61
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    8   18:new             #43  <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #44  <Method void StringBuilder()>
	//   11   25:astore          4
				stringbuilder.append("onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(");
	//   12   27:aload           4
	//   13   29:ldc1            #46  <String "onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(">
	//   14   31:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   15   34:pop             
				stringbuilder.append(i);
	//   16   35:aload           4
	//   17   37:iload_2         
	//   18   38:invokevirtual   #53  <Method StringBuilder StringBuilder.append(int)>
	//   19   41:pop             
				stringbuilder.append(")");
	//   20   42:aload           4
	//   21   44:ldc1            #55  <String ")">
	//   22   46:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   23   49:pop             
				Log.d("MediaRouteCtrlDialog", stringbuilder.toString());
	//   24   50:ldc1            #57  <String "MediaRouteCtrlDialog">
	//   25   52:aload           4
	//   26   54:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   27   57:invokestatic    #67  <Method int Log.d(String, String)>
	//   28   60:pop             
			}
			((android.support.v7.media.MediaRouter.RouteInfo) (seekbar)).requestSetVolume(i);
	//   29   61:aload_1         
	//   30   62:iload_2         
	//   31   63:invokevirtual   #71  <Method void android.support.v7.media.MediaRouter$RouteInfo.requestSetVolume(int)>
		}
	//   32   66:return          
	}

	public void onStartTrackingTouch(SeekBar seekbar)
	{
		if(mRouteInVolumeSliderTouched != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field MediaRouteControllerDialog this$0>
	//*   2    4:getfield        #77  <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteControllerDialog.mRouteInVolumeSliderTouched>
	//*   3    7:ifnull          25
			mVolumeSlider.removeCallbacks(mStopTrackingTouch);
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field MediaRouteControllerDialog this$0>
	//    6   14:getfield        #81  <Field SeekBar MediaRouteControllerDialog.mVolumeSlider>
	//    7   17:aload_0         
	//    8   18:getfield        #24  <Field Runnable mStopTrackingTouch>
	//    9   21:invokevirtual   #85  <Method boolean SeekBar.removeCallbacks(Runnable)>
	//   10   24:pop             
		mRouteInVolumeSliderTouched = (android.support.v7.media.MediaRouter.RouteInfo)seekbar.getTag();
	//   11   25:aload_0         
	//   12   26:getfield        #14  <Field MediaRouteControllerDialog this$0>
	//   13   29:aload_1         
	//   14   30:invokevirtual   #33  <Method Object SeekBar.getTag()>
	//   15   33:checkcast       #35  <Class android.support.v7.media.MediaRouter$RouteInfo>
	//   16   36:putfield        #77  <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteControllerDialog.mRouteInVolumeSliderTouched>
	//   17   39:return          
	}

	public void onStopTrackingTouch(SeekBar seekbar)
	{
		mVolumeSlider.postDelayed(mStopTrackingTouch, 500L);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field MediaRouteControllerDialog this$0>
	//    2    4:getfield        #81  <Field SeekBar MediaRouteControllerDialog.mVolumeSlider>
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field Runnable mStopTrackingTouch>
	//    5   11:ldc2w           #87  <Long 500L>
	//    6   14:invokevirtual   #92  <Method boolean SeekBar.postDelayed(Runnable, long)>
	//    7   17:pop             
	//    8   18:return          
	}

	private final Runnable mStopTrackingTouch = new _cls1();
	final MediaRouteControllerDialog this$0;

	MediaRouteControllerDialog$VolumeChangeListener()
	{
		this$0 = MediaRouteControllerDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field MediaRouteControllerDialog this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
		class _cls1
			implements Runnable
		{

			public void run()
			{
				if(mRouteInVolumeSliderTouched != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #12  <Field MediaRouteControllerDialog$VolumeChangeListener this$1>
			//*   2    4:getfield        #23  <Field MediaRouteControllerDialog MediaRouteControllerDialog$VolumeChangeListener.this$0>
			//*   3    7:getfield        #29  <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteControllerDialog.mRouteInVolumeSliderTouched>
			//*   4   10:ifnull          57
				{
					mRouteInVolumeSliderTouched = null;
			//    5   13:aload_0         
			//    6   14:getfield        #12  <Field MediaRouteControllerDialog$VolumeChangeListener this$1>
			//    7   17:getfield        #23  <Field MediaRouteControllerDialog MediaRouteControllerDialog$VolumeChangeListener.this$0>
			//    8   20:aconst_null     
			//    9   21:putfield        #29  <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteControllerDialog.mRouteInVolumeSliderTouched>
					if(mHasPendingUpdate)
			//*  10   24:aload_0         
			//*  11   25:getfield        #12  <Field MediaRouteControllerDialog$VolumeChangeListener this$1>
			//*  12   28:getfield        #23  <Field MediaRouteControllerDialog MediaRouteControllerDialog$VolumeChangeListener.this$0>
			//*  13   31:getfield        #33  <Field boolean MediaRouteControllerDialog.mHasPendingUpdate>
			//*  14   34:ifeq            57
						update(mPendingUpdateAnimationNeeded);
			//   15   37:aload_0         
			//   16   38:getfield        #12  <Field MediaRouteControllerDialog$VolumeChangeListener this$1>
			//   17   41:getfield        #23  <Field MediaRouteControllerDialog MediaRouteControllerDialog$VolumeChangeListener.this$0>
			//   18   44:aload_0         
			//   19   45:getfield        #12  <Field MediaRouteControllerDialog$VolumeChangeListener this$1>
			//   20   48:getfield        #23  <Field MediaRouteControllerDialog MediaRouteControllerDialog$VolumeChangeListener.this$0>
			//   21   51:getfield        #36  <Field boolean MediaRouteControllerDialog.mPendingUpdateAnimationNeeded>
			//   22   54:invokevirtual   #40  <Method void MediaRouteControllerDialog.update(boolean)>
				}
			//   23   57:return          
			}

			final MediaRouteControllerDialog.VolumeChangeListener this$1;

			_cls1()
			{
				this$1 = MediaRouteControllerDialog.VolumeChangeListener.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field MediaRouteControllerDialog$VolumeChangeListener this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void Object()>
			//    5    9:return          
			}
		}

	//    5    9:aload_0         
	//    6   10:new             #19  <Class MediaRouteControllerDialog$VolumeChangeListener$1>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #22  <Method void MediaRouteControllerDialog$VolumeChangeListener$1(MediaRouteControllerDialog$VolumeChangeListener)>
	//   10   18:putfield        #24  <Field Runnable mStopTrackingTouch>
	//   11   21:return          
	}
}
