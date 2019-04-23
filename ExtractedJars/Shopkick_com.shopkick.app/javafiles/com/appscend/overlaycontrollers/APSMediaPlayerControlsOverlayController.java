// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.content.*;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.*;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.*;
import com.appscend.licensing.LicenseInvalidException;
import com.appscend.licensing.RootedPhoneException;
import com.appscend.media.APSMediaPlayer;
import com.appscend.media.events.APSMediaOverlay;
import com.appscend.utilities.VPUtilities;
import java.util.*;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerOverlayController

public class APSMediaPlayerControlsOverlayController extends APSMediaPlayerOverlayController
{

	public APSMediaPlayerControlsOverlayController()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #134 <Method void APSMediaPlayerOverlayController()>
		playDrawable = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #136 <Field BitmapDrawable playDrawable>
		pauseDrawable = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #138 <Field BitmapDrawable pauseDrawable>
		fullScreenDrawable = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #140 <Field BitmapDrawable fullScreenDrawable>
		playerTapped = ((BroadcastReceiver) (new BroadcastReceiver() {

			public void onReceive(Context context, Intent intent)
			{
				if(_isHidden)
			//*   0    0:aload_0         
			//*   1    1:getfield        #12  <Field APSMediaPlayerControlsOverlayController this$0>
			//*   2    4:invokestatic    #22  <Method boolean APSMediaPlayerControlsOverlayController.access$400(APSMediaPlayerControlsOverlayController)>
			//*   3    7:ifeq            18
				{
					setBarVisible();
			//    4   10:aload_0         
			//    5   11:getfield        #12  <Field APSMediaPlayerControlsOverlayController this$0>
			//    6   14:invokevirtual   #25  <Method void APSMediaPlayerControlsOverlayController.setBarVisible()>
					return;
			//    7   17:return          
				} else
				{
					setBarInvisible();
			//    8   18:aload_0         
			//    9   19:getfield        #12  <Field APSMediaPlayerControlsOverlayController this$0>
			//   10   22:invokevirtual   #28  <Method void APSMediaPlayerControlsOverlayController.setBarInvisible()>
					return;
			//   11   25:return          
				}
			}

			final APSMediaPlayerControlsOverlayController this$0;

			
			{
				this$0 = APSMediaPlayerControlsOverlayController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field APSMediaPlayerControlsOverlayController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
		}
));
	//   11   19:aload_0         
	//   12   20:new             #24  <Class APSMediaPlayerControlsOverlayController$6>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:invokespecial   #143 <Method void APSMediaPlayerControlsOverlayController$6(APSMediaPlayerControlsOverlayController)>
	//   16   28:putfield        #145 <Field BroadcastReceiver playerTapped>
		setBarInvisible = ((BroadcastReceiver) (new BroadcastReceiver() {

			public void onReceive(Context context, Intent intent)
			{
				setBarInvisible();
			//    0    0:aload_0         
			//    1    1:getfield        #12  <Field APSMediaPlayerControlsOverlayController this$0>
			//    2    4:invokevirtual   #21  <Method void APSMediaPlayerControlsOverlayController.setBarInvisible()>
			//    3    7:return          
			}

			final APSMediaPlayerControlsOverlayController this$0;

			
			{
				this$0 = APSMediaPlayerControlsOverlayController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field APSMediaPlayerControlsOverlayController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
		}
));
	//   17   31:aload_0         
	//   18   32:new             #26  <Class APSMediaPlayerControlsOverlayController$7>
	//   19   35:dup             
	//   20   36:aload_0         
	//   21   37:invokespecial   #146 <Method void APSMediaPlayerControlsOverlayController$7(APSMediaPlayerControlsOverlayController)>
	//   22   40:putfield        #148 <Field BroadcastReceiver setBarInvisible>
		setBarVisible = ((BroadcastReceiver) (new BroadcastReceiver() {

			public void onReceive(Context context, Intent intent)
			{
				setBarVisible();
			//    0    0:aload_0         
			//    1    1:getfield        #12  <Field APSMediaPlayerControlsOverlayController this$0>
			//    2    4:invokevirtual   #21  <Method void APSMediaPlayerControlsOverlayController.setBarVisible()>
			//    3    7:return          
			}

			final APSMediaPlayerControlsOverlayController this$0;

			
			{
				this$0 = APSMediaPlayerControlsOverlayController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field APSMediaPlayerControlsOverlayController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
		}
));
	//   23   43:aload_0         
	//   24   44:new             #28  <Class APSMediaPlayerControlsOverlayController$8>
	//   25   47:dup             
	//   26   48:aload_0         
	//   27   49:invokespecial   #149 <Method void APSMediaPlayerControlsOverlayController$8(APSMediaPlayerControlsOverlayController)>
	//   28   52:putfield        #151 <Field BroadcastReceiver setBarVisible>
	//   29   55:return          
	}

	private void setButtonDrawable(Button button, BitmapDrawable bitmapdrawable)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #186 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          14
		{
			button.setBackground(((Drawable) (bitmapdrawable)));
	//    3    8:aload_1         
	//    4    9:aload_2         
	//    5   10:invokevirtual   #192 <Method void Button.setBackground(Drawable)>
			return;
	//    6   13:return          
		} else
		{
			button.setBackgroundDrawable(((Drawable) (bitmapdrawable)));
	//    7   14:aload_1         
	//    8   15:aload_2         
	//    9   16:invokevirtual   #195 <Method void Button.setBackgroundDrawable(Drawable)>
			return;
	//   10   19:return          
		}
	}

	private void setControllerVisible(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            21
		{
			_viewHolder.getLayoutParams().height = oldHeight;
	//    2    4:aload_0         
	//    3    5:getfield        #197 <Field LinearLayout _viewHolder>
	//    4    8:invokevirtual   #203 <Method android.view.ViewGroup$LayoutParams LinearLayout.getLayoutParams()>
	//    5   11:aload_0         
	//    6   12:getfield        #205 <Field int oldHeight>
	//    7   15:putfield        #210 <Field int android.view.ViewGroup$LayoutParams.height>
		} else
	//*   8   18:goto            46
		{
			oldHeight = _viewHolder.getLayoutParams().height;
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:getfield        #197 <Field LinearLayout _viewHolder>
	//   12   26:invokevirtual   #203 <Method android.view.ViewGroup$LayoutParams LinearLayout.getLayoutParams()>
	//   13   29:getfield        #210 <Field int android.view.ViewGroup$LayoutParams.height>
	//   14   32:putfield        #205 <Field int oldHeight>
			_viewHolder.getLayoutParams().height = 0;
	//   15   35:aload_0         
	//   16   36:getfield        #197 <Field LinearLayout _viewHolder>
	//   17   39:invokevirtual   #203 <Method android.view.ViewGroup$LayoutParams LinearLayout.getLayoutParams()>
	//   18   42:iconst_0        
	//   19   43:putfield        #210 <Field int android.view.ViewGroup$LayoutParams.height>
		}
		_viewHolder.requestLayout();
	//   20   46:aload_0         
	//   21   47:getfield        #197 <Field LinearLayout _viewHolder>
	//   22   50:invokevirtual   #213 <Method void LinearLayout.requestLayout()>
	//   23   53:return          
	}

	private void setFullScreenDrawable()
	{
		BitmapDrawable bitmapdrawable = fullScreenDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field BitmapDrawable fullScreenDrawable>
	//    2    4:astore_1        
		if(bitmapdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          19
		{
			setButtonDrawable(_fullscreen, bitmapdrawable);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #216 <Field Button _fullscreen>
	//    8   14:aload_1         
	//    9   15:invokespecial   #218 <Method void setButtonDrawable(Button, BitmapDrawable)>
			return;
	//   10   18:return          
		} else
		{
			_fullscreen.setBackgroundResource(com.appscend.vastplayer.R.drawable.veeplay_fullscreen);
	//   11   19:aload_0         
	//   12   20:getfield        #216 <Field Button _fullscreen>
	//   13   23:getstatic       #223 <Field int com.appscend.vastplayer.R$drawable.veeplay_fullscreen>
	//   14   26:invokevirtual   #227 <Method void Button.setBackgroundResource(int)>
			return;
	//   15   29:return          
		}
	}

	private void setPauseDrawable()
	{
		BitmapDrawable bitmapdrawable = pauseDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field BitmapDrawable pauseDrawable>
	//    2    4:astore_1        
		if(bitmapdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          19
		{
			setButtonDrawable(_playPause, bitmapdrawable);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #229 <Field Button _playPause>
	//    8   14:aload_1         
	//    9   15:invokespecial   #218 <Method void setButtonDrawable(Button, BitmapDrawable)>
			return;
	//   10   18:return          
		} else
		{
			_playPause.setBackgroundResource(com.appscend.vastplayer.R.drawable.pause);
	//   11   19:aload_0         
	//   12   20:getfield        #229 <Field Button _playPause>
	//   13   23:getstatic       #232 <Field int com.appscend.vastplayer.R$drawable.pause>
	//   14   26:invokevirtual   #227 <Method void Button.setBackgroundResource(int)>
			return;
	//   15   29:return          
		}
	}

	private void setPlayDrawable()
	{
		BitmapDrawable bitmapdrawable = playDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field BitmapDrawable playDrawable>
	//    2    4:astore_1        
		if(bitmapdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          19
		{
			setButtonDrawable(_playPause, bitmapdrawable);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #229 <Field Button _playPause>
	//    8   14:aload_1         
	//    9   15:invokespecial   #218 <Method void setButtonDrawable(Button, BitmapDrawable)>
			return;
	//   10   18:return          
		} else
		{
			_playPause.setBackgroundResource(com.appscend.vastplayer.R.drawable.play);
	//   11   19:aload_0         
	//   12   20:getfield        #229 <Field Button _playPause>
	//   13   23:getstatic       #235 <Field int com.appscend.vastplayer.R$drawable.play>
	//   14   26:invokevirtual   #227 <Method void Button.setBackgroundResource(int)>
			return;
	//   15   29:return          
		}
	}

	public void addViewToContainer(ViewGroup viewgroup)
	{
		_lastBarVisibleTime = System.currentTimeMillis();
	//    0    0:aload_0         
	//    1    1:invokestatic    #245 <Method long System.currentTimeMillis()>
	//    2    4:putfield        #168 <Field long _lastBarVisibleTime>
		if(controlsVisibleOnlyInFullscreen)
	//*   3    7:aload_0         
	//*   4    8:getfield        #247 <Field boolean controlsVisibleOnlyInFullscreen>
	//*   5   11:ifeq            36
			if(APSMediaPlayer.getInstance().isFullscreen())
	//*   6   14:invokestatic    #253 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//*   7   17:invokevirtual   #257 <Method boolean APSMediaPlayer.isFullscreen()>
	//*   8   20:ifeq            31
				setControllerVisible(true);
	//    9   23:aload_0         
	//   10   24:iconst_1        
	//   11   25:invokespecial   #179 <Method void setControllerVisible(boolean)>
			else
	//*  12   28:goto            36
				setControllerVisible(false);
	//   13   31:aload_0         
	//   14   32:iconst_0        
	//   15   33:invokespecial   #179 <Method void setControllerVisible(boolean)>
		try
		{
			LocalBroadcastManager.getInstance(viewgroup.getContext()).sendBroadcast(new Intent("com.appscend.mp.notifications.controlsdisplayed"));
	//   16   36:aload_1         
	//   17   37:invokevirtual   #263 <Method Context ViewGroup.getContext()>
	//   18   40:invokestatic    #268 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//   19   43:new             #270 <Class Intent>
	//   20   46:dup             
	//   21   47:ldc2            #272 <String "com.appscend.mp.notifications.controlsdisplayed">
	//   22   50:invokespecial   #275 <Method void Intent(String)>
	//   23   53:invokevirtual   #279 <Method boolean LocalBroadcastManager.sendBroadcast(Intent)>
	//   24   56:pop             
		}
	//*  25   57:aload_1         
	//*  26   58:aload_0         
	//*  27   59:getfield        #197 <Field LinearLayout _viewHolder>
	//*  28   62:invokevirtual   #283 <Method void ViewGroup.addView(View)>
	//*  29   65:return          
		catch(Exception exception) { }
	//   30   66:astore_2        
		viewgroup.addView(((View) (_viewHolder)));
	//*  31   67:goto            57
	}

	public void fullscreenEntered()
	{
		fullscreenToggled();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #287 <Method void fullscreenToggled()>
	//    2    4:return          
	}

	public void fullscreenExited()
	{
		fullscreenToggled();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #287 <Method void fullscreenToggled()>
	//    2    4:return          
	}

	public void fullscreenToggled()
	{
		if(controlsVisibleOnlyInFullscreen)
	//*   0    0:aload_0         
	//*   1    1:getfield        #247 <Field boolean controlsVisibleOnlyInFullscreen>
	//*   2    4:ifeq            97
		{
			if(APSMediaPlayer.getInstance().isFullscreen())
	//*   3    7:invokestatic    #253 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//*   4   10:invokevirtual   #257 <Method boolean APSMediaPlayer.isFullscreen()>
	//*   5   13:ifeq            57
			{
				AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
	//    6   16:new             #290 <Class AlphaAnimation>
	//    7   19:dup             
	//    8   20:fconst_0        
	//    9   21:fconst_1        
	//   10   22:invokespecial   #293 <Method void AlphaAnimation(float, float)>
	//   11   25:astore_1        
				alphaanimation.setDuration(0L);
	//   12   26:aload_1         
	//   13   27:lconst_0        
	//   14   28:invokevirtual   #297 <Method void AlphaAnimation.setDuration(long)>
				alphaanimation.setFillAfter(true);
	//   15   31:aload_1         
	//   16   32:iconst_1        
	//   17   33:invokevirtual   #300 <Method void AlphaAnimation.setFillAfter(boolean)>
				alphaanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

					public void onAnimationEnd(Animation animation)
					{
					//    0    0:return          
					}

					public void onAnimationRepeat(Animation animation)
					{
					//    0    0:return          
					}

					public void onAnimationStart(Animation animation)
					{
						setControllerVisible(true);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
					//    2    4:iconst_1        
					//    3    5:invokestatic    #28  <Method void APSMediaPlayerControlsOverlayController.access$500(APSMediaPlayerControlsOverlayController, boolean)>
						_isHidden = false;
					//    4    8:aload_0         
					//    5    9:getfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
					//    6   12:iconst_0        
					//    7   13:invokestatic    #32  <Method boolean APSMediaPlayerControlsOverlayController.access$402(APSMediaPlayerControlsOverlayController, boolean)>
					//    8   16:pop             
					//    9   17:return          
					}

					final APSMediaPlayerControlsOverlayController this$0;

			
			{
				this$0 = APSMediaPlayerControlsOverlayController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
);
	//   18   36:aload_1         
	//   19   37:new             #12  <Class APSMediaPlayerControlsOverlayController$12>
	//   20   40:dup             
	//   21   41:aload_0         
	//   22   42:invokespecial   #301 <Method void APSMediaPlayerControlsOverlayController$12(APSMediaPlayerControlsOverlayController)>
	//   23   45:invokevirtual   #305 <Method void AlphaAnimation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
				_viewHolder.startAnimation(((Animation) (alphaanimation)));
	//   24   48:aload_0         
	//   25   49:getfield        #197 <Field LinearLayout _viewHolder>
	//   26   52:aload_1         
	//   27   53:invokevirtual   #309 <Method void LinearLayout.startAnimation(Animation)>
				return;
	//   28   56:return          
			}
			AlphaAnimation alphaanimation1 = new AlphaAnimation(1.0F, 0.0F);
	//   29   57:new             #290 <Class AlphaAnimation>
	//   30   60:dup             
	//   31   61:fconst_1        
	//   32   62:fconst_0        
	//   33   63:invokespecial   #293 <Method void AlphaAnimation(float, float)>
	//   34   66:astore_1        
			alphaanimation1.setDuration(0L);
	//   35   67:aload_1         
	//   36   68:lconst_0        
	//   37   69:invokevirtual   #297 <Method void AlphaAnimation.setDuration(long)>
			alphaanimation1.setFillAfter(true);
	//   38   72:aload_1         
	//   39   73:iconst_1        
	//   40   74:invokevirtual   #300 <Method void AlphaAnimation.setFillAfter(boolean)>
			alphaanimation1.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

				public void onAnimationEnd(Animation animation)
				{
				//    0    0:return          
				}

				public void onAnimationRepeat(Animation animation)
				{
				//    0    0:return          
				}

				public void onAnimationStart(Animation animation)
				{
					setControllerVisible(false);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
				//    2    4:iconst_0        
				//    3    5:invokestatic    #28  <Method void APSMediaPlayerControlsOverlayController.access$500(APSMediaPlayerControlsOverlayController, boolean)>
					_isHidden = true;
				//    4    8:aload_0         
				//    5    9:getfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
				//    6   12:iconst_1        
				//    7   13:invokestatic    #32  <Method boolean APSMediaPlayerControlsOverlayController.access$402(APSMediaPlayerControlsOverlayController, boolean)>
				//    8   16:pop             
				//    9   17:return          
				}

				final APSMediaPlayerControlsOverlayController this$0;

			
			{
				this$0 = APSMediaPlayerControlsOverlayController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   41   77:aload_1         
	//   42   78:new             #14  <Class APSMediaPlayerControlsOverlayController$13>
	//   43   81:dup             
	//   44   82:aload_0         
	//   45   83:invokespecial   #310 <Method void APSMediaPlayerControlsOverlayController$13(APSMediaPlayerControlsOverlayController)>
	//   46   86:invokevirtual   #305 <Method void AlphaAnimation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
			_viewHolder.startAnimation(((Animation) (alphaanimation1)));
	//   47   89:aload_0         
	//   48   90:getfield        #197 <Field LinearLayout _viewHolder>
	//   49   93:aload_1         
	//   50   94:invokevirtual   #309 <Method void LinearLayout.startAnimation(Animation)>
		}
	//   51   97:return          
	}

	public float getAlpha()
	{
		return 1.0F;
	//    0    0:fconst_1        
	//    1    1:freturn         
	}

	public View getView()
	{
		return ((View) (_viewHolder));
	//    0    0:aload_0         
	//    1    1:getfield        #197 <Field LinearLayout _viewHolder>
	//    2    4:areturn         
	}

	public void hideOverlay()
	{
		_viewHolder.removeAllViews();
	//    0    0:aload_0         
	//    1    1:getfield        #197 <Field LinearLayout _viewHolder>
	//    2    4:invokevirtual   #318 <Method void LinearLayout.removeAllViews()>
	//    3    7:return          
	}

	public void load(Context context)
	{
		boolean flag7;
		if(overlay.parameters.get("visibleInFullscreenOnly") != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #324 <Field APSMediaOverlay overlay>
	//*   2    4:getfield        #330 <Field HashMap APSMediaOverlay.parameters>
	//*   3    7:ldc1            #100 <String "visibleInFullscreenOnly">
	//*   4    9:invokevirtual   #336 <Method Object HashMap.get(Object)>
	//*   5   12:ifnull          38
			flag7 = ((Boolean)overlay.parameters.get("visibleInFullscreenOnly")).booleanValue();
	//    6   15:aload_0         
	//    7   16:getfield        #324 <Field APSMediaOverlay overlay>
	//    8   19:getfield        #330 <Field HashMap APSMediaOverlay.parameters>
	//    9   22:ldc1            #100 <String "visibleInFullscreenOnly">
	//   10   24:invokevirtual   #336 <Method Object HashMap.get(Object)>
	//   11   27:checkcast       #338 <Class Boolean>
	//   12   30:invokevirtual   #341 <Method boolean Boolean.booleanValue()>
	//   13   33:istore          14
		else
	//*  14   35:goto            41
			flag7 = false;
	//   15   38:iconst_0        
	//   16   39:istore          14
		controlsVisibleOnlyInFullscreen = flag7;
	//   17   41:aload_0         
	//   18   42:iload           14
	//   19   44:putfield        #247 <Field boolean controlsVisibleOnlyInFullscreen>
		if(overlay.parameters.get("autohideDuration") != null)
	//*  20   47:aload_0         
	//*  21   48:getfield        #324 <Field APSMediaOverlay overlay>
	//*  22   51:getfield        #330 <Field HashMap APSMediaOverlay.parameters>
	//*  23   54:ldc1            #58  <String "autohideDuration">
	//*  24   56:invokevirtual   #336 <Method Object HashMap.get(Object)>
	//*  25   59:ifnull          91
			autoHideDuration = Integer.parseInt((String)overlay.parameters.get("autohideDuration")) * 1000;
	//   26   62:aload_0         
	//   27   63:aload_0         
	//   28   64:getfield        #324 <Field APSMediaOverlay overlay>
	//   29   67:getfield        #330 <Field HashMap APSMediaOverlay.parameters>
	//   30   70:ldc1            #58  <String "autohideDuration">
	//   31   72:invokevirtual   #336 <Method Object HashMap.get(Object)>
	//   32   75:checkcast       #343 <Class String>
	//   33   78:invokestatic    #349 <Method int Integer.parseInt(String)>
	//   34   81:sipush          1000
	//   35   84:imul            
	//   36   85:putfield        #351 <Field int autoHideDuration>
		else
	//*  37   88:goto            98
			autoHideDuration = 5000;
	//   38   91:aload_0         
	//   39   92:sipush          5000
	//   40   95:putfield        #351 <Field int autoHideDuration>
		int i;
		if(overlay.parameters.get("components") != null)
	//*  41   98:aload_0         
	//*  42   99:getfield        #324 <Field APSMediaOverlay overlay>
	//*  43  102:getfield        #330 <Field HashMap APSMediaOverlay.parameters>
	//*  44  105:ldc1            #70  <String "components">
	//*  45  107:invokevirtual   #336 <Method Object HashMap.get(Object)>
	//*  46  110:ifnull          136
			i = ((Integer)overlay.parameters.get("components")).intValue();
	//   47  113:aload_0         
	//   48  114:getfield        #324 <Field APSMediaOverlay overlay>
	//   49  117:getfield        #330 <Field HashMap APSMediaOverlay.parameters>
	//   50  120:ldc1            #70  <String "components">
	//   51  122:invokevirtual   #336 <Method Object HashMap.get(Object)>
	//   52  125:checkcast       #345 <Class Integer>
	//   53  128:invokevirtual   #355 <Method int Integer.intValue()>
	//   54  131:istore          9
		else
	//*  55  133:goto            140
			i = 79;
	//   56  136:bipush          79
	//   57  138:istore          9
		boolean flag;
		if((i & 0x40) == 64)
	//*  58  140:iload           9
	//*  59  142:bipush          64
	//*  60  144:iand            
	//*  61  145:bipush          64
	//*  62  147:icmpne          155
			flag = true;
	//   63  150:iconst_1        
	//   64  151:istore_3        
		else
	//*  65  152:goto            157
			flag = false;
	//   66  155:iconst_0        
	//   67  156:istore_3        
		boolean flag1;
		if((i & 1) == 1)
	//*  68  157:iload           9
	//*  69  159:iconst_1        
	//*  70  160:iand            
	//*  71  161:iconst_1        
	//*  72  162:icmpne          171
			flag1 = true;
	//   73  165:iconst_1        
	//   74  166:istore          4
		else
	//*  75  168:goto            174
			flag1 = false;
	//   76  171:iconst_0        
	//   77  172:istore          4
		boolean flag2;
		if((i & 2) == 2)
	//*  78  174:iload           9
	//*  79  176:iconst_2        
	//*  80  177:iand            
	//*  81  178:iconst_2        
	//*  82  179:icmpne          188
			flag2 = true;
	//   83  182:iconst_1        
	//   84  183:istore          5
		else
	//*  85  185:goto            191
			flag2 = false;
	//   86  188:iconst_0        
	//   87  189:istore          5
		boolean flag3;
		if((i & 4) == 4)
	//*  88  191:iload           9
	//*  89  193:iconst_4        
	//*  90  194:iand            
	//*  91  195:iconst_4        
	//*  92  196:icmpne          205
			flag3 = true;
	//   93  199:iconst_1        
	//   94  200:istore          6
		else
	//*  95  202:goto            208
			flag3 = false;
	//   96  205:iconst_0        
	//   97  206:istore          6
		boolean flag4;
		if((i & 8) == 8)
	//*  98  208:iload           9
	//*  99  210:bipush          8
	//* 100  212:iand            
	//* 101  213:bipush          8
	//* 102  215:icmpne          224
			flag4 = true;
	//  103  218:iconst_1        
	//  104  219:istore          7
		else
	//* 105  221:goto            227
			flag4 = false;
	//  106  224:iconst_0        
	//  107  225:istore          7
		boolean flag5;
		if((i & 0x10) == 16)
	//* 108  227:iload           9
	//* 109  229:bipush          16
	//* 110  231:iand            
	//* 111  232:bipush          16
	//* 112  234:icmpne          243
			flag5 = true;
	//  113  237:iconst_1        
	//  114  238:istore          8
		else
	//* 115  240:goto            246
			flag5 = false;
	//  116  243:iconst_0        
	//  117  244:istore          8
		boolean flag6;
		if((i & 0x20) == 32)
	//* 118  246:iload           9
	//* 119  248:bipush          32
	//* 120  250:iand            
	//* 121  251:bipush          32
	//* 122  253:icmpne          262
			flag6 = true;
	//  123  256:iconst_1        
	//  124  257:istore          9
		else
	//* 125  259:goto            265
			flag6 = false;
	//  126  262:iconst_0        
	//  127  263:istore          9
		float f;
		int j;
		int k;
		int i1;
		int j1;
		Object obj;
		Object obj1;
		float af[];
		ShapeDrawable shapedrawable;
		Object obj2;
		String s;
		Paint paint;
		try
		{
			LocalBroadcastManager.getInstance(context).registerReceiver(playerTapped, new IntentFilter("com.appscend.mp.notifications.playertapped"));
	//  128  265:aload_1         
	//  129  266:invokestatic    #268 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//  130  269:aload_0         
	//  131  270:getfield        #145 <Field BroadcastReceiver playerTapped>
	//  132  273:new             #357 <Class IntentFilter>
	//  133  276:dup             
	//  134  277:ldc2            #359 <String "com.appscend.mp.notifications.playertapped">
	//  135  280:invokespecial   #360 <Method void IntentFilter(String)>
	//  136  283:invokevirtual   #364 <Method void LocalBroadcastManager.registerReceiver(BroadcastReceiver, IntentFilter)>
		}
	//* 137  286:aload_1         
	//* 138  287:invokestatic    #268 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//* 139  290:aload_0         
	//* 140  291:getfield        #148 <Field BroadcastReceiver setBarInvisible>
	//* 141  294:new             #357 <Class IntentFilter>
	//* 142  297:dup             
	//* 143  298:ldc1            #46  <String "com.appscend.mp.notifications.controls.hide">
	//* 144  300:invokespecial   #360 <Method void IntentFilter(String)>
	//* 145  303:invokevirtual   #364 <Method void LocalBroadcastManager.registerReceiver(BroadcastReceiver, IntentFilter)>
	//* 146  306:aload_1         
	//* 147  307:invokestatic    #268 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//* 148  310:aload_0         
	//* 149  311:getfield        #151 <Field BroadcastReceiver setBarVisible>
	//* 150  314:new             #357 <Class IntentFilter>
	//* 151  317:dup             
	//* 152  318:ldc1            #49  <String "com.appscend.mp.notifications.controls.show">
	//* 153  320:invokespecial   #360 <Method void IntentFilter(String)>
	//* 154  323:invokevirtual   #364 <Method void LocalBroadcastManager.registerReceiver(BroadcastReceiver, IntentFilter)>
	//* 155  326:aload_0         
	//* 156  327:new             #199 <Class LinearLayout>
	//* 157  330:dup             
	//* 158  331:aload_1         
	//* 159  332:invokespecial   #366 <Method void LinearLayout(Context)>
	//* 160  335:putfield        #197 <Field LinearLayout _viewHolder>
	//* 161  338:aload_0         
	//* 162  339:getfield        #197 <Field LinearLayout _viewHolder>
	//* 163  342:iconst_0        
	//* 164  343:invokevirtual   #369 <Method void LinearLayout.setOrientation(int)>
	//* 165  346:aload_0         
	//* 166  347:getfield        #197 <Field LinearLayout _viewHolder>
	//* 167  350:fconst_1        
	//* 168  351:invokevirtual   #373 <Method void LinearLayout.setWeightSum(float)>
	//* 169  354:aload_0         
	//* 170  355:getfield        #197 <Field LinearLayout _viewHolder>
	//* 171  358:bipush          17
	//* 172  360:invokevirtual   #376 <Method void LinearLayout.setGravity(int)>
	//* 173  363:new             #378 <Class StringBuilder>
	//* 174  366:dup             
	//* 175  367:invokespecial   #379 <Method void StringBuilder()>
	//* 176  370:astore          16
	//* 177  372:aload           16
	//* 178  374:ldc2            #381 <String "#">
	//* 179  377:invokevirtual   #385 <Method StringBuilder StringBuilder.append(String)>
	//* 180  380:pop             
	//* 181  381:aload_0         
	//* 182  382:getfield        #324 <Field APSMediaOverlay overlay>
	//* 183  385:getfield        #330 <Field HashMap APSMediaOverlay.parameters>
	//* 184  388:ldc1            #61  <String "barAlpha">
	//* 185  390:invokevirtual   #336 <Method Object HashMap.get(Object)>
	//* 186  393:ifnull          418
	//* 187  396:aload_0         
	//* 188  397:getfield        #324 <Field APSMediaOverlay overlay>
	//* 189  400:getfield        #330 <Field HashMap APSMediaOverlay.parameters>
	//* 190  403:ldc1            #61  <String "barAlpha">
	//* 191  405:invokevirtual   #336 <Method Object HashMap.get(Object)>
	//* 192  408:checkcast       #387 <Class Float>
	//* 193  411:invokevirtual   #390 <Method float Float.floatValue()>
	//* 194  414:fstore_2        
	//* 195  415:goto            422
	//* 196  418:ldc2            #391 <Float 0.5F>
	//* 197  421:fstore_2        
	//* 198  422:aload           16
	//* 199  424:fload_2         
	//* 200  425:ldc2            #392 <Float 255F>
	//* 201  428:fmul            
	//* 202  429:f2i             
	//* 203  430:invokestatic    #396 <Method String Integer.toHexString(int)>
	//* 204  433:invokevirtual   #385 <Method StringBuilder StringBuilder.append(String)>
	//* 205  436:pop             
	//* 206  437:aload_0         
	//* 207  438:getfield        #324 <Field APSMediaOverlay overlay>
	//* 208  441:getfield        #330 <Field HashMap APSMediaOverlay.parameters>
	//* 209  444:ldc1            #64  <String "barColor">
	//* 210  446:invokevirtual   #336 <Method Object HashMap.get(Object)>
	//* 211  449:ifnull          472
	//* 212  452:aload_0         
	//* 213  453:getfield        #324 <Field APSMediaOverlay overlay>
	//* 214  456:getfield        #330 <Field HashMap APSMediaOverlay.parameters>
	//* 215  459:ldc1            #64  <String "barColor">
	//* 216  461:invokevirtual   #336 <Method Object HashMap.get(Object)>
	//* 217  464:checkcast       #343 <Class String>
	//* 218  467:astore          15
	//* 219  469:goto            477
	//* 220  472:ldc2            #398 <String "000000">
	//* 221  475:astore          15
	//* 222  477:aload           16
	//* 223  479:aload           15
	//* 224  481:invokevirtual   #385 <Method StringBuilder StringBuilder.append(String)>
	//* 225  484:pop             
	//* 226  485:aload           16
	//* 227  487:invokevirtual   #402 <Method String StringBuilder.toString()>
	//* 228  490:astore          15
	//* 229  492:aload_0         
	//* 230  493:getfield        #197 <Field LinearLayout _viewHolder>
	//* 231  496:aload           15
	//* 232  498:invokestatic    #407 <Method int Color.parseColor(String)>
	//* 233  501:invokevirtual   #410 <Method void LinearLayout.setBackgroundColor(int)>
	//* 234  504:aload_0         
	//* 235  505:getfield        #324 <Field APSMediaOverlay overlay>
	//* 236  508:getfield        #330 <Field HashMap APSMediaOverlay.parameters>
	//* 237  511:ldc1            #97  <String "textColor">
	//* 238  513:invokevirtual   #336 <Method Object HashMap.get(Object)>
	//* 239  516:checkcast       #343 <Class String>
	//* 240  519:astore          15
	//* 241  521:aload           15
	//* 242  523:ifnull          536
	//* 243  526:aload           15
	//* 244  528:invokestatic    #413 <Method int VPUtilities.parseColor(String)>
	//* 245  531:istore          10
	//* 246  533:goto            539
	//* 247  536:iconst_m1       
	//* 248  537:istore          10
	//* 249  539:aload_0         
	//* 250  540:new             #188 <Class Button>
	//* 251  543:dup             
	//* 252  544:aload_1         
	//* 253  545:invokespecial   #414 <Method void Button(Context)>
	//* 254  548:putfield        #229 <Field Button _playPause>
	//* 255  551:aload_0         
	//* 256  552:new             #188 <Class Button>
	//* 257  555:dup             
	//* 258  556:aload_1         
	//* 259  557:invokespecial   #414 <Method void Button(Context)>
	//* 260  560:putfield        #416 <Field Button _back>
	//* 261  563:aload_0         
	//* 262  564:new             #188 <Class Button>
	//* 263  567:dup             
	//* 264  568:aload_1         
	//* 265  569:invokespecial   #414 <Method void Button(Context)>
	//* 266  572:putfield        #418 <Field Button _forward>
	//* 267  575:iconst_1        
	//* 268  576:ldc2            #419 <Float 30F>
	//* 269  579:aload_1         
	//* 270  580:invokevirtual   #425 <Method Resources Context.getResources()>
	//* 271  583:invokevirtual   #431 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//* 272  586:invokestatic    #437 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//* 273  589:f2i             
	//* 274  590:istore          12
	//* 275  592:aload_0         
	//* 276  593:getfield        #229 <Field Button _playPause>
	//* 277  596:new             #439 <Class android.widget.LinearLayout$LayoutParams>
	//* 278  599:dup             
	//* 279  600:iload           12
	//* 280  602:iload           12
	//* 281  604:invokespecial   #442 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//* 282  607:invokevirtual   #446 <Method void Button.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 283  610:aload_0         
	//* 284  611:getfield        #416 <Field Button _back>
	//* 285  614:new             #439 <Class android.widget.LinearLayout$LayoutParams>
	//* 286  617:dup             
	//* 287  618:iload           12
	//* 288  620:iload           12
	//* 289  622:invokespecial   #442 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//* 290  625:invokevirtual   #446 <Method void Button.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 291  628:aload_0         
	//* 292  629:getfield        #418 <Field Button _forward>
	//* 293  632:new             #439 <Class android.widget.LinearLayout$LayoutParams>
	//* 294  635:dup             
	//* 295  636:iload           12
	//* 296  638:iload           12
	//* 297  640:invokespecial   #442 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//* 298  643:invokevirtual   #446 <Method void Button.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 299  646:aload_0         
	//* 300  647:getfield        #416 <Field Button _back>
	//* 301  650:getstatic       #449 <Field int com.appscend.vastplayer.R$drawable.back>
	//* 302  653:invokevirtual   #227 <Method void Button.setBackgroundResource(int)>
	//* 303  656:aload_0         
	//* 304  657:getfield        #418 <Field Button _forward>
	//* 305  660:getstatic       #452 <Field int com.appscend.vastplayer.R$drawable.forward>
	//* 306  663:invokevirtual   #227 <Method void Button.setBackgroundResource(int)>
	//* 307  666:aload_0         
	//* 308  667:invokestatic    #253 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//* 309  670:invokevirtual   #455 <Method boolean APSMediaPlayer.shouldAutoplay()>
	//* 310  673:invokevirtual   #458 <Method void setStatusPlaying(boolean)>
	//* 311  676:aload_0         
	//* 312  677:getfield        #229 <Field Button _playPause>
	//* 313  680:new             #6   <Class APSMediaPlayerControlsOverlayController$1>
	//* 314  683:dup             
	//* 315  684:aload_0         
	//* 316  685:invokespecial   #459 <Method void APSMediaPlayerControlsOverlayController$1(APSMediaPlayerControlsOverlayController)>
	//* 317  688:invokevirtual   #463 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
	//* 318  691:aload_0         
	//* 319  692:getfield        #418 <Field Button _forward>
	//* 320  695:new             #16  <Class APSMediaPlayerControlsOverlayController$2>
	//* 321  698:dup             
	//* 322  699:aload_0         
	//* 323  700:invokespecial   #464 <Method void APSMediaPlayerControlsOverlayController$2(APSMediaPlayerControlsOverlayController)>
	//* 324  703:invokevirtual   #463 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
	//* 325  706:aload_0         
	//* 326  707:getfield        #416 <Field Button _back>
	//* 327  710:new             #18  <Class APSMediaPlayerControlsOverlayController$3>
	//* 328  713:dup             
	//* 329  714:aload_0         
	//* 330  715:invokespecial   #465 <Method void APSMediaPlayerControlsOverlayController$3(APSMediaPlayerControlsOverlayController)>
	//* 331  718:invokevirtual   #463 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
	//* 332  721:aload_0         
	//* 333  722:new             #467 <Class TextView>
	//* 334  725:dup             
	//* 335  726:aload_1         
	//* 336  727:invokespecial   #468 <Method void TextView(Context)>
	//* 337  730:putfield        #470 <Field TextView _currentTime>
	//* 338  733:aload_0         
	//* 339  734:getfield        #470 <Field TextView _currentTime>
	//* 340  737:new             #439 <Class android.widget.LinearLayout$LayoutParams>
	//* 341  740:dup             
	//* 342  741:bipush          -2
	//* 343  743:iconst_m1       
	//* 344  744:ldc2            #471 <Float 0.1F>
	//* 345  747:invokespecial   #474 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
	//* 346  750:invokevirtual   #475 <Method void TextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 347  753:aload_0         
	//* 348  754:getfield        #470 <Field TextView _currentTime>
	//* 349  757:ldc2            #477 <String "00:00">
	//* 350  760:invokevirtual   #481 <Method void TextView.setText(CharSequence)>
	//* 351  763:aload_0         
	//* 352  764:getfield        #470 <Field TextView _currentTime>
	//* 353  767:bipush          17
	//* 354  769:invokevirtual   #482 <Method void TextView.setGravity(int)>
	//* 355  772:aload_0         
	//* 356  773:getfield        #470 <Field TextView _currentTime>
	//* 357  776:iload           10
	//* 358  778:invokevirtual   #485 <Method void TextView.setTextColor(int)>
	//* 359  781:aload_0         
	//* 360  782:new             #487 <Class SeekBar>
	//* 361  785:dup             
	//* 362  786:aload_1         
	//* 363  787:invokespecial   #488 <Method void SeekBar(Context)>
	//* 364  790:putfield        #490 <Field SeekBar _seekBar>
	//* 365  793:bipush          8
	//* 366  795:newarray        float[]
	//* 367  797:astore          17
	//* 368  799:aload           17
	//* 369  801:dup             
	//* 370  802:iconst_0        
	//* 371  803:ldc2            #491 <Float 10F>
	//* 372  806:fastore         
	//* 373  807:dup             
	//* 374  808:iconst_1        
	//* 375  809:ldc2            #491 <Float 10F>
	//* 376  812:fastore         
	//* 377  813:dup             
	//* 378  814:iconst_2        
	//* 379  815:ldc2            #491 <Float 10F>
	//* 380  818:fastore         
	//* 381  819:dup             
	//* 382  820:iconst_3        
	//* 383  821:ldc2            #491 <Float 10F>
	//* 384  824:fastore         
	//* 385  825:dup             
	//* 386  826:iconst_4        
	//* 387  827:ldc2            #491 <Float 10F>
	//* 388  830:fastore         
	//* 389  831:dup             
	//* 390  832:iconst_5        
	//* 391  833:ldc2            #491 <Float 10F>
	//* 392  836:fastore         
	//* 393  837:dup             
	//* 394  838:bipush          6
	//* 395  840:ldc2            #491 <Float 10F>
	//* 396  843:fastore         
	//* 397  844:dup             
	//* 398  845:bipush          7
	//* 399  847:ldc2            #491 <Float 10F>
	//* 400  850:fastore         
	//* 401  851:pop             
	//* 402  852:new             #493 <Class ShapeDrawable>
	//* 403  855:dup             
	//* 404  856:new             #495 <Class RoundRectShape>
	//* 405  859:dup             
	//* 406  860:aload           17
	//* 407  862:aconst_null     
	//* 408  863:aload           17
	//* 409  865:invokespecial   #498 <Method void RoundRectShape(float[], android.graphics.RectF, float[])>
	//* 410  868:invokespecial   #501 <Method void ShapeDrawable(android.graphics.drawable.shapes.Shape)>
	//* 411  871:astore          16
	//* 412  873:aload_0         
	//* 413  874:getfield        #324 <Field APSMediaOverlay overlay>
	//* 414  877:getfield        #330 <Field HashMap APSMediaOverlay.parameters>
	//* 415  880:ldc1            #73  <String "emptyTrackColor">
	//* 416  882:invokevirtual   #336 <Method Object HashMap.get(Object)>
	//* 417  885:checkcast       #343 <Class String>
	//* 418  888:astore          15
	//* 419  890:aload           16
	//* 420  892:invokevirtual   #505 <Method Paint ShapeDrawable.getPaint()>
	//* 421  895:astore          18
	//* 422  897:aload           15
	//* 423  899:ifnull          912
	//* 424  902:aload           15
	//* 425  904:invokestatic    #413 <Method int VPUtilities.parseColor(String)>
	//* 426  907:istore          11
	//* 427  909:goto            915
	//* 428  912:iconst_m1       
	//* 429  913:istore          11
	//* 430  915:aload           18
	//* 431  917:iload           11
	//* 432  919:invokevirtual   #510 <Method void Paint.setColor(int)>
	//* 433  922:new             #493 <Class ShapeDrawable>
	//* 434  925:dup             
	//* 435  926:new             #495 <Class RoundRectShape>
	//* 436  929:dup             
	//* 437  930:aload           17
	//* 438  932:aconst_null     
	//* 439  933:aload           17
	//* 440  935:invokespecial   #498 <Method void RoundRectShape(float[], android.graphics.RectF, float[])>
	//* 441  938:invokespecial   #501 <Method void ShapeDrawable(android.graphics.drawable.shapes.Shape)>
	//* 442  941:astore          18
	//* 443  943:aload_0         
	//* 444  944:getfield        #324 <Field APSMediaOverlay overlay>
	//* 445  947:getfield        #330 <Field HashMap APSMediaOverlay.parameters>
	//* 446  950:ldc1            #67  <String "bufferedTrackColor">
	//* 447  952:invokevirtual   #336 <Method Object HashMap.get(Object)>
	//* 448  955:checkcast       #343 <Class String>
	//* 449  958:astore          19
	//* 450  960:aload           18
	//* 451  962:invokevirtual   #505 <Method Paint ShapeDrawable.getPaint()>
	//* 452  965:astore          20
	//* 453  967:aload           19
	//* 454  969:ifnull          982
	//* 455  972:aload           19
	//* 456  974:invokestatic    #413 <Method int VPUtilities.parseColor(String)>
	//* 457  977:istore          11
	//* 458  979:goto            987
	//* 459  982:ldc2            #511 <Int 0xffcccccc>
	//* 460  985:istore          11
	//* 461  987:aload           20
	//* 462  989:iload           11
	//* 463  991:invokevirtual   #510 <Method void Paint.setColor(int)>
	//* 464  994:new             #513 <Class ClipDrawable>
	//* 465  997:dup             
	//* 466  998:aload           18
	//* 467 1000:iconst_3        
	//* 468 1001:iconst_1        
	//* 469 1002:invokespecial   #516 <Method void ClipDrawable(Drawable, int, int)>
	//* 470 1005:astore          18
	//* 471 1007:new             #493 <Class ShapeDrawable>
	//* 472 1010:dup             
	//* 473 1011:new             #495 <Class RoundRectShape>
	//* 474 1014:dup             
	//* 475 1015:aload           17
	//* 476 1017:aconst_null     
	//* 477 1018:aload           17
	//* 478 1020:invokespecial   #498 <Method void RoundRectShape(float[], android.graphics.RectF, float[])>
	//* 479 1023:invokespecial   #501 <Method void ShapeDrawable(android.graphics.drawable.shapes.Shape)>
	//* 480 1026:astore          17
	//* 481 1028:aload_0         
	//* 482 1029:getfield        #324 <Field APSMediaOverlay overlay>
	//* 483 1032:getfield        #330 <Field HashMap APSMediaOverlay.parameters>
	//* 484 1035:ldc1            #91  <String "playedTrackColor">
	//* 485 1037:invokevirtual   #336 <Method Object HashMap.get(Object)>
	//* 486 1040:checkcast       #343 <Class String>
	//* 487 1043:astore          19
	//* 488 1045:aload           19
	//* 489 1047:ifnull          1060
	//* 490 1050:aload           19
	//* 491 1052:invokestatic    #413 <Method int VPUtilities.parseColor(String)>
	//* 492 1055:istore          11
	//* 493 1057:goto            1065
	//* 494 1060:ldc2            #517 <Int 0xffff0000>
	//* 495 1063:istore          11
	//* 496 1065:aload           17
	//* 497 1067:invokevirtual   #505 <Method Paint ShapeDrawable.getPaint()>
	//* 498 1070:iload           11
	//* 499 1072:invokevirtual   #510 <Method void Paint.setColor(int)>
	//* 500 1075:new             #519 <Class LayerDrawable>
	//* 501 1078:dup             
	//* 502 1079:iconst_3        
	//* 503 1080:anewarray       Drawable[]
	//* 504 1083:dup             
	//* 505 1084:iconst_0        
	//* 506 1085:aload           16
	//* 507 1087:aastore         
	//* 508 1088:dup             
	//* 509 1089:iconst_1        
	//* 510 1090:aload           18
	//* 511 1092:aastore         
	//* 512 1093:dup             
	//* 513 1094:iconst_2        
	//* 514 1095:new             #513 <Class ClipDrawable>
	//* 515 1098:dup             
	//* 516 1099:aload           17
	//* 517 1101:iconst_3        
	//* 518 1102:iconst_1        
	//* 519 1103:invokespecial   #516 <Method void ClipDrawable(Drawable, int, int)>
	//* 520 1106:aastore         
	//* 521 1107:invokespecial   #524 <Method void LayerDrawable(Drawable[])>
	//* 522 1110:astore          16
	//* 523 1112:aload           16
	//* 524 1114:iconst_0        
	//* 525 1115:ldc2            #525 <Int 0x1020000>
	//* 526 1118:invokevirtual   #528 <Method void LayerDrawable.setId(int, int)>
	//* 527 1121:aload           16
	//* 528 1123:iconst_1        
	//* 529 1124:ldc2            #529 <Int 0x102000f>
	//* 530 1127:invokevirtual   #528 <Method void LayerDrawable.setId(int, int)>
	//* 531 1130:aload           16
	//* 532 1132:iconst_2        
	//* 533 1133:ldc2            #530 <Int 0x102000d>
	//* 534 1136:invokevirtual   #528 <Method void LayerDrawable.setId(int, int)>
	//* 535 1139:aload_0         
	//* 536 1140:getfield        #490 <Field SeekBar _seekBar>
	//* 537 1143:aload           16
	//* 538 1145:invokevirtual   #533 <Method void SeekBar.setProgressDrawable(Drawable)>
	//* 539 1148:getstatic       #186 <Field int android.os.Build$VERSION.SDK_INT>
	//* 540 1151:bipush          21
	//* 541 1153:icmplt          1164
	//* 542 1156:aload_0         
	//* 543 1157:getfield        #490 <Field SeekBar _seekBar>
	//* 544 1160:iconst_0        
	//* 545 1161:invokevirtual   #536 <Method void SeekBar.setSplitTrack(boolean)>
	//* 546 1164:iconst_1        
	//* 547 1165:ldc2            #537 <Float 20F>
	//* 548 1168:aload_1         
	//* 549 1169:invokevirtual   #425 <Method Resources Context.getResources()>
	//* 550 1172:invokevirtual   #431 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//* 551 1175:invokestatic    #437 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//* 552 1178:f2i             
	//* 553 1179:istore          13
	//* 554 1181:aload_0         
	//* 555 1182:getfield        #324 <Field APSMediaOverlay overlay>
	//* 556 1185:getfield        #330 <Field HashMap APSMediaOverlay.parameters>
	//* 557 1188:ldc1            #94  <String "seekThumbImage">
	//* 558 1190:invokevirtual   #336 <Method Object HashMap.get(Object)>
	//* 559 1193:ifnull          1248
	//* 560 1196:aload_0         
	//* 561 1197:getfield        #324 <Field APSMediaOverlay overlay>
	//* 562 1200:getfield        #330 <Field HashMap APSMediaOverlay.parameters>
	//* 563 1203:ldc1            #94  <String "seekThumbImage">
	//* 564 1205:invokevirtual   #336 <Method Object HashMap.get(Object)>
	//* 565 1208:checkcast       #539 <Class Bitmap>
	//* 566 1211:iload           13
	//* 567 1213:iload           13
	//* 568 1215:iconst_1        
	//* 569 1216:invokestatic    #543 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
	//* 570 1219:astore          15
	//* 571 1221:new             #545 <Class BitmapDrawable>
	//* 572 1224:dup             
	//* 573 1225:aload_1         
	//* 574 1226:invokevirtual   #425 <Method Resources Context.getResources()>
	//* 575 1229:aload           15
	//* 576 1231:invokespecial   #548 <Method void BitmapDrawable(Resources, Bitmap)>
	//* 577 1234:astore          15
	//* 578 1236:aload_0         
	//* 579 1237:getfield        #490 <Field SeekBar _seekBar>
	//* 580 1240:aload           15
	//* 581 1242:invokevirtual   #551 <Method void SeekBar.setThumb(Drawable)>
	//* 582 1245:goto            1325
	//* 583 1248:new             #553 <Class GradientDrawable>
	//* 584 1251:dup             
	//* 585 1252:invokespecial   #554 <Method void GradientDrawable()>
	//* 586 1255:astore          16
	//* 587 1257:aload           16
	//* 588 1259:iconst_1        
	//* 589 1260:invokevirtual   #557 <Method void GradientDrawable.setShape(int)>
	//* 590 1263:aload           15
	//* 591 1265:ifnull          1278
	//* 592 1268:aload           15
	//* 593 1270:invokestatic    #413 <Method int VPUtilities.parseColor(String)>
	//* 594 1273:istore          11
	//* 595 1275:goto            1283
	//* 596 1278:ldc2            #517 <Int 0xffff0000>
	//* 597 1281:istore          11
	//* 598 1283:aload           16
	//* 599 1285:iconst_1        
	//* 600 1286:iload           11
	//* 601 1288:invokevirtual   #560 <Method void GradientDrawable.setStroke(int, int)>
	//* 602 1291:aload           16
	//* 603 1293:ldc2            #511 <Int 0xffcccccc>
	//* 604 1296:invokevirtual   #561 <Method void GradientDrawable.setColor(int)>
	//* 605 1299:aload           16
	//* 606 1301:sipush          230
	//* 607 1304:invokevirtual   #564 <Method void GradientDrawable.setAlpha(int)>
	//* 608 1307:aload           16
	//* 609 1309:iload           13
	//* 610 1311:iload           13
	//* 611 1313:invokevirtual   #567 <Method void GradientDrawable.setSize(int, int)>
	//* 612 1316:aload_0         
	//* 613 1317:getfield        #490 <Field SeekBar _seekBar>
	//* 614 1320:aload           16
	//* 615 1322:invokevirtual   #551 <Method void SeekBar.setThumb(Drawable)>
	//* 616 1325:aload_0         
	//* 617 1326:getfield        #324 <Field APSMediaOverlay overlay>
	//* 618 1329:getfield        #330 <Field HashMap APSMediaOverlay.parameters>
	//* 619 1332:ldc1            #85  <String "playImage">
	//* 620 1334:invokevirtual   #336 <Method Object HashMap.get(Object)>
	//* 621 1337:ifnull          1382
	//* 622 1340:aload_0         
	//* 623 1341:getfield        #324 <Field APSMediaOverlay overlay>
	//* 624 1344:getfield        #330 <Field HashMap APSMediaOverlay.parameters>
	//* 625 1347:ldc1            #85  <String "playImage">
	//* 626 1349:invokevirtual   #336 <Method Object HashMap.get(Object)>
	//* 627 1352:checkcast       #539 <Class Bitmap>
	//* 628 1355:iload           12
	//* 629 1357:iload           12
	//* 630 1359:iconst_1        
	//* 631 1360:invokestatic    #543 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
	//* 632 1363:astore          15
	//* 633 1365:aload_0         
	//* 634 1366:new             #545 <Class BitmapDrawable>
	//* 635 1369:dup             
	//* 636 1370:aload_1         
	//* 637 1371:invokevirtual   #425 <Method Resources Context.getResources()>
	//* 638 1374:aload           15
	//* 639 1376:invokespecial   #548 <Method void BitmapDrawable(Resources, Bitmap)>
	//* 640 1379:putfield        #136 <Field BitmapDrawable playDrawable>
	//* 641 1382:aload_0         
	//* 642 1383:getfield        #324 <Field APSMediaOverlay overlay>
	//* 643 1386:getfield        #330 <Field HashMap APSMediaOverlay.parameters>
	//* 644 1389:ldc1            #82  <String "pauseImage">
	//* 645 1391:invokevirtual   #336 <Method Object HashMap.get(Object)>
	//* 646 1394:ifnull          1439
	//* 647 1397:aload_0         
	//* 648 1398:getfield        #324 <Field APSMediaOverlay overlay>
	//* 649 1401:getfield        #330 <Field HashMap APSMediaOverlay.parameters>
	//* 650 1404:ldc1            #82  <String "pauseImage">
	//* 651 1406:invokevirtual   #336 <Method Object HashMap.get(Object)>
	//* 652 1409:checkcast       #539 <Class Bitmap>
	//* 653 1412:iload           12
	//* 654 1414:iload           12
	//* 655 1416:iconst_1        
	//* 656 1417:invokestatic    #543 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
	//* 657 1420:astore          15
	//* 658 1422:aload_0         
	//* 659 1423:new             #545 <Class BitmapDrawable>
	//* 660 1426:dup             
	//* 661 1427:aload_1         
	//* 662 1428:invokevirtual   #425 <Method Resources Context.getResources()>
	//* 663 1431:aload           15
	//* 664 1433:invokespecial   #548 <Method void BitmapDrawable(Resources, Bitmap)>
	//* 665 1436:putfield        #138 <Field BitmapDrawable pauseDrawable>
	//* 666 1439:aload_0         
	//* 667 1440:getfield        #324 <Field APSMediaOverlay overlay>
	//* 668 1443:getfield        #330 <Field HashMap APSMediaOverlay.parameters>
	//* 669 1446:ldc1            #76  <String "fullscreenImage">
	//* 670 1448:invokevirtual   #336 <Method Object HashMap.get(Object)>
	//* 671 1451:ifnull          1499
	//* 672 1454:aload_0         
	//* 673 1455:getfield        #324 <Field APSMediaOverlay overlay>
	//* 674 1458:getfield        #330 <Field HashMap APSMediaOverlay.parameters>
	//* 675 1461:ldc1            #76  <String "fullscreenImage">
	//* 676 1463:invokevirtual   #336 <Method Object HashMap.get(Object)>
	//* 677 1466:checkcast       #539 <Class Bitmap>
	//* 678 1469:iload           12
	//* 679 1471:iload           12
	//* 680 1473:iconst_1        
	//* 681 1474:invokestatic    #543 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
	//* 682 1477:astore          15
	//* 683 1479:aload_0         
	//* 684 1480:new             #545 <Class BitmapDrawable>
	//* 685 1483:dup             
	//* 686 1484:aload_1         
	//* 687 1485:invokevirtual   #425 <Method Resources Context.getResources()>
	//* 688 1488:aload           15
	//* 689 1490:invokespecial   #548 <Method void BitmapDrawable(Resources, Bitmap)>
	//* 690 1493:putfield        #140 <Field BitmapDrawable fullScreenDrawable>
	//* 691 1496:goto            1499
	//* 692 1499:new             #439 <Class android.widget.LinearLayout$LayoutParams>
	//* 693 1502:dup             
	//* 694 1503:iconst_0        
	//* 695 1504:iconst_1        
	//* 696 1505:ldc2            #537 <Float 20F>
	//* 697 1508:aload_1         
	//* 698 1509:invokevirtual   #425 <Method Resources Context.getResources()>
	//* 699 1512:invokevirtual   #431 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//* 700 1515:invokestatic    #437 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//* 701 1518:f2i             
	//* 702 1519:ldc2            #568 <Float 0.8F>
	//* 703 1522:invokespecial   #474 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
	//* 704 1525:astore          15
	//* 705 1527:aload           15
	//* 706 1529:bipush          16
	//* 707 1531:putfield        #571 <Field int android.widget.LinearLayout$LayoutParams.gravity>
	//* 708 1534:aload_0         
	//* 709 1535:getfield        #490 <Field SeekBar _seekBar>
	//* 710 1538:iconst_1        
	//* 711 1539:ldc2            #491 <Float 10F>
	//* 712 1542:aload_1         
	//* 713 1543:invokevirtual   #425 <Method Resources Context.getResources()>
	//* 714 1546:invokevirtual   #431 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//* 715 1549:invokestatic    #437 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//* 716 1552:f2i             
	//* 717 1553:iconst_0        
	//* 718 1554:iconst_1        
	//* 719 1555:ldc2            #491 <Float 10F>
	//* 720 1558:aload_1         
	//* 721 1559:invokevirtual   #425 <Method Resources Context.getResources()>
	//* 722 1562:invokevirtual   #431 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//* 723 1565:invokestatic    #437 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//* 724 1568:f2i             
	//* 725 1569:iconst_0        
	//* 726 1570:invokevirtual   #575 <Method void SeekBar.setPadding(int, int, int, int)>
	//* 727 1573:aload_0         
	//* 728 1574:getfield        #490 <Field SeekBar _seekBar>
	//* 729 1577:iconst_1        
	//* 730 1578:ldc2            #491 <Float 10F>
	//* 731 1581:aload_1         
	//* 732 1582:invokevirtual   #425 <Method Resources Context.getResources()>
	//* 733 1585:invokevirtual   #431 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//* 734 1588:invokestatic    #437 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//* 735 1591:f2i             
	//* 736 1592:invokevirtual   #578 <Method void SeekBar.setThumbOffset(int)>
	//* 737 1595:aload_0         
	//* 738 1596:getfield        #490 <Field SeekBar _seekBar>
	//* 739 1599:aload           15
	//* 740 1601:invokevirtual   #579 <Method void SeekBar.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 741 1604:aload_0         
	//* 742 1605:getfield        #490 <Field SeekBar _seekBar>
	//* 743 1608:new             #20  <Class APSMediaPlayerControlsOverlayController$4>
	//* 744 1611:dup             
	//* 745 1612:aload_0         
	//* 746 1613:invokespecial   #580 <Method void APSMediaPlayerControlsOverlayController$4(APSMediaPlayerControlsOverlayController)>
	//* 747 1616:invokevirtual   #584 <Method void SeekBar.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
	//* 748 1619:aload_0         
	//* 749 1620:new             #467 <Class TextView>
	//* 750 1623:dup             
	//* 751 1624:aload_1         
	//* 752 1625:invokespecial   #468 <Method void TextView(Context)>
	//* 753 1628:putfield        #586 <Field TextView _totalTime>
	//* 754 1631:aload_0         
	//* 755 1632:getfield        #586 <Field TextView _totalTime>
	//* 756 1635:new             #439 <Class android.widget.LinearLayout$LayoutParams>
	//* 757 1638:dup             
	//* 758 1639:bipush          -2
	//* 759 1641:iconst_m1       
	//* 760 1642:ldc2            #471 <Float 0.1F>
	//* 761 1645:invokespecial   #474 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
	//* 762 1648:invokevirtual   #475 <Method void TextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 763 1651:aload_0         
	//* 764 1652:getfield        #586 <Field TextView _totalTime>
	//* 765 1655:ldc2            #477 <String "00:00">
	//* 766 1658:invokevirtual   #481 <Method void TextView.setText(CharSequence)>
	//* 767 1661:aload_0         
	//* 768 1662:getfield        #586 <Field TextView _totalTime>
	//* 769 1665:bipush          17
	//* 770 1667:invokevirtual   #482 <Method void TextView.setGravity(int)>
	//* 771 1670:aload_0         
	//* 772 1671:getfield        #586 <Field TextView _totalTime>
	//* 773 1674:iload           10
	//* 774 1676:invokevirtual   #485 <Method void TextView.setTextColor(int)>
	//* 775 1679:aload_0         
	//* 776 1680:new             #188 <Class Button>
	//* 777 1683:dup             
	//* 778 1684:aload_1         
	//* 779 1685:invokespecial   #414 <Method void Button(Context)>
	//* 780 1688:putfield        #216 <Field Button _fullscreen>
	//* 781 1691:aload_0         
	//* 782 1692:getfield        #216 <Field Button _fullscreen>
	//* 783 1695:new             #439 <Class android.widget.LinearLayout$LayoutParams>
	//* 784 1698:dup             
	//* 785 1699:iload           12
	//* 786 1701:iload           12
	//* 787 1703:invokespecial   #442 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//* 788 1706:invokevirtual   #446 <Method void Button.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 789 1709:aload_0         
	//* 790 1710:invokespecial   #588 <Method void setFullScreenDrawable()>
	//* 791 1713:aload_0         
	//* 792 1714:getfield        #216 <Field Button _fullscreen>
	//* 793 1717:new             #22  <Class APSMediaPlayerControlsOverlayController$5>
	//* 794 1720:dup             
	//* 795 1721:aload_0         
	//* 796 1722:invokespecial   #589 <Method void APSMediaPlayerControlsOverlayController$5(APSMediaPlayerControlsOverlayController)>
	//* 797 1725:invokevirtual   #463 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
	//* 798 1728:aload_0         
	//* 799 1729:getfield        #197 <Field LinearLayout _viewHolder>
	//* 800 1732:aload_0         
	//* 801 1733:getfield        #229 <Field Button _playPause>
	//* 802 1736:invokevirtual   #590 <Method void LinearLayout.addView(View)>
	//* 803 1739:aload_0         
	//* 804 1740:getfield        #197 <Field LinearLayout _viewHolder>
	//* 805 1743:aload_0         
	//* 806 1744:getfield        #416 <Field Button _back>
	//* 807 1747:invokevirtual   #590 <Method void LinearLayout.addView(View)>
	//* 808 1750:aload_0         
	//* 809 1751:getfield        #197 <Field LinearLayout _viewHolder>
	//* 810 1754:aload_0         
	//* 811 1755:getfield        #470 <Field TextView _currentTime>
	//* 812 1758:invokevirtual   #590 <Method void LinearLayout.addView(View)>
	//* 813 1761:aload_0         
	//* 814 1762:getfield        #197 <Field LinearLayout _viewHolder>
	//* 815 1765:aload_0         
	//* 816 1766:getfield        #490 <Field SeekBar _seekBar>
	//* 817 1769:invokevirtual   #590 <Method void LinearLayout.addView(View)>
	//* 818 1772:aload_0         
	//* 819 1773:getfield        #197 <Field LinearLayout _viewHolder>
	//* 820 1776:aload_0         
	//* 821 1777:getfield        #586 <Field TextView _totalTime>
	//* 822 1780:invokevirtual   #590 <Method void LinearLayout.addView(View)>
	//* 823 1783:aload_0         
	//* 824 1784:getfield        #197 <Field LinearLayout _viewHolder>
	//* 825 1787:aload_0         
	//* 826 1788:getfield        #418 <Field Button _forward>
	//* 827 1791:invokevirtual   #590 <Method void LinearLayout.addView(View)>
	//* 828 1794:aload_0         
	//* 829 1795:getfield        #197 <Field LinearLayout _viewHolder>
	//* 830 1798:aload_0         
	//* 831 1799:getfield        #216 <Field Button _fullscreen>
	//* 832 1802:invokevirtual   #590 <Method void LinearLayout.addView(View)>
	//* 833 1805:iload_3         
	//* 834 1806:ifne            1820
	//* 835 1809:aload_0         
	//* 836 1810:getfield        #229 <Field Button _playPause>
	//* 837 1813:iconst_4        
	//* 838 1814:invokevirtual   #593 <Method void Button.setVisibility(int)>
	//* 839 1817:goto            1820
	//* 840 1820:iload           4
	//* 841 1822:ifne            1833
	//* 842 1825:aload_0         
	//* 843 1826:getfield        #470 <Field TextView _currentTime>
	//* 844 1829:iconst_4        
	//* 845 1830:invokevirtual   #594 <Method void TextView.setVisibility(int)>
	//* 846 1833:iload           5
	//* 847 1835:ifne            1846
	//* 848 1838:aload_0         
	//* 849 1839:getfield        #490 <Field SeekBar _seekBar>
	//* 850 1842:iconst_4        
	//* 851 1843:invokevirtual   #595 <Method void SeekBar.setVisibility(int)>
	//* 852 1846:iload           6
	//* 853 1848:ifne            1859
	//* 854 1851:aload_0         
	//* 855 1852:getfield        #586 <Field TextView _totalTime>
	//* 856 1855:iconst_4        
	//* 857 1856:invokevirtual   #594 <Method void TextView.setVisibility(int)>
	//* 858 1859:iload           7
	//* 859 1861:ifeq            1879
	//* 860 1864:invokestatic    #253 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//* 861 1867:invokevirtual   #598 <Method boolean APSMediaPlayer.isCurrentlyInFullscreenOverlayActivity()>
	//* 862 1870:ifeq            1876
	//* 863 1873:goto            1879
	//* 864 1876:goto            1888
	//* 865 1879:aload_0         
	//* 866 1880:getfield        #216 <Field Button _fullscreen>
	//* 867 1883:bipush          8
	//* 868 1885:invokevirtual   #593 <Method void Button.setVisibility(int)>
	//* 869 1888:iload           8
	//* 870 1890:ifne            1902
	//* 871 1893:aload_0         
	//* 872 1894:getfield        #416 <Field Button _back>
	//* 873 1897:bipush          8
	//* 874 1899:invokevirtual   #593 <Method void Button.setVisibility(int)>
	//* 875 1902:iload           9
	//* 876 1904:ifne            1916
	//* 877 1907:aload_0         
	//* 878 1908:getfield        #418 <Field Button _forward>
	//* 879 1911:bipush          8
	//* 880 1913:invokevirtual   #593 <Method void Button.setVisibility(int)>
	//* 881 1916:aload_0         
	//* 882 1917:getfield        #197 <Field LinearLayout _viewHolder>
	//* 883 1920:getstatic       #603 <Field int com.appscend.vastplayer.R$id.controlsoverlay>
	//* 884 1923:invokevirtual   #605 <Method void LinearLayout.setId(int)>
	//* 885 1926:return          
		catch(Exception exception) { }
	//  886 1927:astore          15
		try
		{
			LocalBroadcastManager.getInstance(context).registerReceiver(setBarInvisible, new IntentFilter("com.appscend.mp.notifications.controls.hide"));
		}
	//* 887 1929:goto            286
		catch(Exception exception1) { }
	//  888 1932:astore          15
		try
		{
			LocalBroadcastManager.getInstance(context).registerReceiver(setBarVisible, new IntentFilter("com.appscend.mp.notifications.controls.show"));
		}
	//* 889 1934:goto            306
		catch(Exception exception2) { }
	//  890 1937:astore          15
		_viewHolder = new LinearLayout(context);
		_viewHolder.setOrientation(0);
		_viewHolder.setWeightSum(1.0F);
		_viewHolder.setGravity(17);
		obj1 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj1)).append("#");
		if(overlay.parameters.get("barAlpha") != null)
			f = ((Float)overlay.parameters.get("barAlpha")).floatValue();
		else
			f = 0.5F;
		((StringBuilder) (obj1)).append(Integer.toHexString((int)(f * 255F)));
		if(overlay.parameters.get("barColor") != null)
			obj = ((Object) ((String)overlay.parameters.get("barColor")));
		else
			obj = "000000";
		((StringBuilder) (obj1)).append(((String) (obj)));
		obj = ((Object) (((StringBuilder) (obj1)).toString()));
		_viewHolder.setBackgroundColor(Color.parseColor(((String) (obj))));
		obj = ((Object) ((String)overlay.parameters.get("textColor")));
		if(obj != null)
			j = VPUtilities.parseColor(((String) (obj)));
		else
			j = -1;
		_playPause = new Button(context);
		_back = new Button(context);
		_forward = new Button(context);
		i1 = (int)TypedValue.applyDimension(1, 30F, context.getResources().getDisplayMetrics());
		_playPause.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.LinearLayout.LayoutParams(i1, i1))));
		_back.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.LinearLayout.LayoutParams(i1, i1))));
		_forward.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.LinearLayout.LayoutParams(i1, i1))));
		_back.setBackgroundResource(com.appscend.vastplayer.R.drawable.back);
		_forward.setBackgroundResource(com.appscend.vastplayer.R.drawable.forward);
		setStatusPlaying(APSMediaPlayer.getInstance().shouldAutoplay());
		_playPause.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				if(APSMediaPlayer.getInstance().isPlaying())
			//*   0    0:invokestatic    #33  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//*   1    3:invokevirtual   #37  <Method boolean APSMediaPlayer.isPlaying()>
			//*   2    6:ifeq            54
				{
					setPlayDrawable();
			//    3    9:aload_0         
			//    4   10:getfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
			//    5   13:invokestatic    #40  <Method void APSMediaPlayerControlsOverlayController.access$000(APSMediaPlayerControlsOverlayController)>
					APSMediaPlayer.getInstance().emitEvent(new ArrayList(), "user-pause", com.appscend.media.APSMediaTrackingEvents.MediaEventType.USER_PAUSE, new Bundle(), ((com.appscend.media.events.APSMediaEvent) (APSMediaPlayer.getInstance()._currentUnit)));
			//    6   16:invokestatic    #33  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//    7   19:new             #42  <Class ArrayList>
			//    8   22:dup             
			//    9   23:invokespecial   #43  <Method void ArrayList()>
			//   10   26:ldc1            #45  <String "user-pause">
			//   11   28:getstatic       #51  <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.USER_PAUSE>
			//   12   31:new             #53  <Class Bundle>
			//   13   34:dup             
			//   14   35:invokespecial   #54  <Method void Bundle()>
			//   15   38:invokestatic    #33  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//   16   41:getfield        #58  <Field com.appscend.media.events.APSMediaUnit APSMediaPlayer._currentUnit>
			//   17   44:invokevirtual   #62  <Method void APSMediaPlayer.emitEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, Bundle, com.appscend.media.events.APSMediaEvent)>
					APSMediaPlayer.getInstance().pause();
			//   18   47:invokestatic    #33  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//   19   50:invokevirtual   #65  <Method void APSMediaPlayer.pause()>
					return;
			//   20   53:return          
				}
				setPauseDrawable();
			//   21   54:aload_0         
			//   22   55:getfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
			//   23   58:invokestatic    #68  <Method void APSMediaPlayerControlsOverlayController.access$100(APSMediaPlayerControlsOverlayController)>
				try
				{
					APSMediaPlayer.getInstance().play();
			//   24   61:invokestatic    #33  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//   25   64:invokevirtual   #71  <Method void APSMediaPlayer.play()>
					APSMediaPlayer.getInstance().emitEvent(new ArrayList(), "user-unpause", com.appscend.media.APSMediaTrackingEvents.MediaEventType.USER_UNPAUSE, new Bundle(), ((com.appscend.media.events.APSMediaEvent) (APSMediaPlayer.getInstance()._currentUnit)));
			//   26   67:invokestatic    #33  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//   27   70:new             #42  <Class ArrayList>
			//   28   73:dup             
			//   29   74:invokespecial   #43  <Method void ArrayList()>
			//   30   77:ldc1            #73  <String "user-unpause">
			//   31   79:getstatic       #76  <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.USER_UNPAUSE>
			//   32   82:new             #53  <Class Bundle>
			//   33   85:dup             
			//   34   86:invokespecial   #54  <Method void Bundle()>
			//   35   89:invokestatic    #33  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//   36   92:getfield        #58  <Field com.appscend.media.events.APSMediaUnit APSMediaPlayer._currentUnit>
			//   37   95:invokevirtual   #62  <Method void APSMediaPlayer.emitEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, Bundle, com.appscend.media.events.APSMediaEvent)>
					return;
			//   38   98:return          
				}
			//*  39   99:astore_1        
			//*  40  100:goto            104
				// Misplaced declaration of an exception variable
				catch(View view) { }
			//   41  103:astore_1        
				// Misplaced declaration of an exception variable
				catch(View view) { }
				((Exception) (view)).printStackTrace();
			//   42  104:aload_1         
			//   43  105:invokevirtual   #81  <Method void Exception.printStackTrace()>
			//   44  108:return          
			}

			final APSMediaPlayerControlsOverlayController this$0;

			
			{
				this$0 = APSMediaPlayerControlsOverlayController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
		_forward.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				APSMediaPlayer.getInstance().skip();
			//    0    0:invokestatic    #29  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//    1    3:invokevirtual   #32  <Method void APSMediaPlayer.skip()>
			//    2    6:return          
			}

			final APSMediaPlayerControlsOverlayController this$0;

			
			{
				this$0 = APSMediaPlayerControlsOverlayController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
		_back.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				APSMediaPlayer.getInstance().back();
			//    0    0:invokestatic    #29  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//    1    3:invokevirtual   #32  <Method void APSMediaPlayer.back()>
			//    2    6:return          
			}

			final APSMediaPlayerControlsOverlayController this$0;

			
			{
				this$0 = APSMediaPlayerControlsOverlayController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
		_currentTime = new TextView(context);
		_currentTime.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.LinearLayout.LayoutParams(-2, -1, 0.1F))));
		_currentTime.setText("00:00");
		_currentTime.setGravity(17);
		_currentTime.setTextColor(j);
		_seekBar = new SeekBar(context);
		af = new float[8];
		float[] _tmp = af;
		af[0] = 10F;
		af[1] = 10F;
		af[2] = 10F;
		af[3] = 10F;
		af[4] = 10F;
		af[5] = 10F;
		af[6] = 10F;
		af[7] = 10F;
		obj1 = ((Object) (new ShapeDrawable(((android.graphics.drawable.shapes.Shape) (new RoundRectShape(af, ((android.graphics.RectF) (null)), af))))));
		obj = ((Object) ((String)overlay.parameters.get("emptyTrackColor")));
		obj2 = ((Object) (((ShapeDrawable) (obj1)).getPaint()));
		if(obj != null)
			k = VPUtilities.parseColor(((String) (obj)));
		else
			k = -1;
		((Paint) (obj2)).setColor(k);
		obj2 = ((Object) (new ShapeDrawable(((android.graphics.drawable.shapes.Shape) (new RoundRectShape(af, ((android.graphics.RectF) (null)), af))))));
		s = (String)overlay.parameters.get("bufferedTrackColor");
		paint = ((ShapeDrawable) (obj2)).getPaint();
		if(s != null)
			k = VPUtilities.parseColor(s);
		else
			k = 0xffcccccc;
		paint.setColor(k);
		obj2 = ((Object) (new ClipDrawable(((Drawable) (obj2)), 3, 1)));
		shapedrawable = new ShapeDrawable(((android.graphics.drawable.shapes.Shape) (new RoundRectShape(af, ((android.graphics.RectF) (null)), af))));
		s = (String)overlay.parameters.get("playedTrackColor");
		if(s != null)
			k = VPUtilities.parseColor(s);
		else
			k = 0xffff0000;
		shapedrawable.getPaint().setColor(k);
		obj1 = ((Object) (new LayerDrawable(new Drawable[] {
			obj1, obj2, new ClipDrawable(((Drawable) (shapedrawable)), 3, 1)
		})));
		((LayerDrawable) (obj1)).setId(0, 0x1020000);
		((LayerDrawable) (obj1)).setId(1, 0x102000f);
		((LayerDrawable) (obj1)).setId(2, 0x102000d);
		_seekBar.setProgressDrawable(((Drawable) (obj1)));
		if(android.os.Build.VERSION.SDK_INT >= 21)
			_seekBar.setSplitTrack(false);
		j1 = (int)TypedValue.applyDimension(1, 20F, context.getResources().getDisplayMetrics());
		if(overlay.parameters.get("seekThumbImage") != null)
		{
			obj = ((Object) (Bitmap.createScaledBitmap((Bitmap)overlay.parameters.get("seekThumbImage"), j1, j1, true)));
			obj = ((Object) (new BitmapDrawable(context.getResources(), ((Bitmap) (obj)))));
			_seekBar.setThumb(((Drawable) (obj)));
		} else
		{
			GradientDrawable gradientdrawable = new GradientDrawable();
			gradientdrawable.setShape(1);
			int l;
			if(obj != null)
				l = VPUtilities.parseColor(((String) (obj)));
			else
				l = 0xffff0000;
			gradientdrawable.setStroke(1, l);
			gradientdrawable.setColor(0xffcccccc);
			gradientdrawable.setAlpha(230);
			gradientdrawable.setSize(j1, j1);
			_seekBar.setThumb(((Drawable) (gradientdrawable)));
		}
		if(overlay.parameters.get("playImage") != null)
		{
			obj = ((Object) (Bitmap.createScaledBitmap((Bitmap)overlay.parameters.get("playImage"), i1, i1, true)));
			playDrawable = new BitmapDrawable(context.getResources(), ((Bitmap) (obj)));
		}
		if(overlay.parameters.get("pauseImage") != null)
		{
			obj = ((Object) (Bitmap.createScaledBitmap((Bitmap)overlay.parameters.get("pauseImage"), i1, i1, true)));
			pauseDrawable = new BitmapDrawable(context.getResources(), ((Bitmap) (obj)));
		}
		if(overlay.parameters.get("fullscreenImage") != null)
		{
			obj = ((Object) (Bitmap.createScaledBitmap((Bitmap)overlay.parameters.get("fullscreenImage"), i1, i1, true)));
			fullScreenDrawable = new BitmapDrawable(context.getResources(), ((Bitmap) (obj)));
		}
		obj = ((Object) (new android.widget.LinearLayout.LayoutParams(0, (int)TypedValue.applyDimension(1, 20F, context.getResources().getDisplayMetrics()), 0.8F)));
		obj.gravity = 16;
		_seekBar.setPadding((int)TypedValue.applyDimension(1, 10F, context.getResources().getDisplayMetrics()), 0, (int)TypedValue.applyDimension(1, 10F, context.getResources().getDisplayMetrics()), 0);
		_seekBar.setThumbOffset((int)TypedValue.applyDimension(1, 10F, context.getResources().getDisplayMetrics()));
		_seekBar.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
		_seekBar.setOnSeekBarChangeListener(new android.widget.SeekBar.OnSeekBarChangeListener() {

			public void onProgressChanged(SeekBar seekbar, int k1, boolean flag8)
			{
			//    0    0:return          
			}

			public void onStartTrackingTouch(SeekBar seekbar)
			{
				_isDragging = true;
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
			//    2    4:iconst_1        
			//    3    5:invokestatic    #29  <Method boolean APSMediaPlayerControlsOverlayController.access$202(APSMediaPlayerControlsOverlayController, boolean)>
			//    4    8:pop             
			//    5    9:return          
			}

			public void onStopTrackingTouch(SeekBar seekbar)
			{
				APSMediaPlayer.getInstance().seekTo(seekbar.getProgress());
			//    0    0:invokestatic    #36  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//    1    3:aload_1         
			//    2    4:invokevirtual   #42  <Method int SeekBar.getProgress()>
			//    3    7:invokevirtual   #46  <Method void APSMediaPlayer.seekTo(int)>
				_isDragging = false;
			//    4   10:aload_0         
			//    5   11:getfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
			//    6   14:iconst_0        
			//    7   15:invokestatic    #29  <Method boolean APSMediaPlayerControlsOverlayController.access$202(APSMediaPlayerControlsOverlayController, boolean)>
			//    8   18:pop             
				_lastBarVisibleTime = System.currentTimeMillis();
			//    9   19:aload_0         
			//   10   20:getfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
			//   11   23:invokestatic    #52  <Method long System.currentTimeMillis()>
			//   12   26:invokestatic    #56  <Method long APSMediaPlayerControlsOverlayController.access$302(APSMediaPlayerControlsOverlayController, long)>
			//   13   29:pop2            
			//   14   30:return          
			}

			final APSMediaPlayerControlsOverlayController this$0;

			
			{
				this$0 = APSMediaPlayerControlsOverlayController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
		_totalTime = new TextView(context);
		_totalTime.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.LinearLayout.LayoutParams(-2, -1, 0.1F))));
		_totalTime.setText("00:00");
		_totalTime.setGravity(17);
		_totalTime.setTextColor(j);
		_fullscreen = new Button(context);
		_fullscreen.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.LinearLayout.LayoutParams(i1, i1))));
		setFullScreenDrawable();
		_fullscreen.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				APSMediaPlayer.getInstance().toggleFullscreen();
			//    0    0:invokestatic    #29  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//    1    3:invokevirtual   #32  <Method void APSMediaPlayer.toggleFullscreen()>
			//    2    6:return          
			}

			final APSMediaPlayerControlsOverlayController this$0;

			
			{
				this$0 = APSMediaPlayerControlsOverlayController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
		_viewHolder.addView(((View) (_playPause)));
		_viewHolder.addView(((View) (_back)));
		_viewHolder.addView(((View) (_currentTime)));
		_viewHolder.addView(((View) (_seekBar)));
		_viewHolder.addView(((View) (_totalTime)));
		_viewHolder.addView(((View) (_forward)));
		_viewHolder.addView(((View) (_fullscreen)));
		if(!flag)
			_playPause.setVisibility(4);
		if(!flag1)
			_currentTime.setVisibility(4);
		if(!flag2)
			_seekBar.setVisibility(4);
		if(!flag3)
			_totalTime.setVisibility(4);
		if(!flag4 || APSMediaPlayer.getInstance().isCurrentlyInFullscreenOverlayActivity())
			_fullscreen.setVisibility(8);
		if(!flag5)
			_back.setVisibility(8);
		if(!flag6)
			_forward.setVisibility(8);
		_viewHolder.setId(com.appscend.vastplayer.R.id.controlsoverlay);
	//* 891 1939:goto            326
	}

	public void onDestroy()
	{
		try
		{
			LocalBroadcastManager.getInstance(_viewHolder.getContext()).unregisterReceiver(playerTapped);
	//    0    0:aload_0         
	//    1    1:getfield        #197 <Field LinearLayout _viewHolder>
	//    2    4:invokevirtual   #607 <Method Context LinearLayout.getContext()>
	//    3    7:invokestatic    #268 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//    4   10:aload_0         
	//    5   11:getfield        #145 <Field BroadcastReceiver playerTapped>
	//    6   14:invokevirtual   #611 <Method void LocalBroadcastManager.unregisterReceiver(BroadcastReceiver)>
		}
	//*   7   17:aload_0         
	//*   8   18:getfield        #197 <Field LinearLayout _viewHolder>
	//*   9   21:invokevirtual   #607 <Method Context LinearLayout.getContext()>
	//*  10   24:invokestatic    #268 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//*  11   27:aload_0         
	//*  12   28:getfield        #148 <Field BroadcastReceiver setBarInvisible>
	//*  13   31:invokevirtual   #611 <Method void LocalBroadcastManager.unregisterReceiver(BroadcastReceiver)>
	//*  14   34:aload_0         
	//*  15   35:getfield        #197 <Field LinearLayout _viewHolder>
	//*  16   38:invokevirtual   #607 <Method Context LinearLayout.getContext()>
	//*  17   41:invokestatic    #268 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//*  18   44:aload_0         
	//*  19   45:getfield        #151 <Field BroadcastReceiver setBarVisible>
	//*  20   48:invokevirtual   #611 <Method void LocalBroadcastManager.unregisterReceiver(BroadcastReceiver)>
	//*  21   51:return          
		catch(Exception exception) { }
	//   22   52:astore_1        
		try
		{
			LocalBroadcastManager.getInstance(_viewHolder.getContext()).unregisterReceiver(setBarInvisible);
		}
	//*  23   53:goto            17
		catch(Exception exception1) { }
	//   24   56:astore_1        
		try
		{
			LocalBroadcastManager.getInstance(_viewHolder.getContext()).unregisterReceiver(setBarVisible);
			return;
		}
	//*  25   57:goto            34
		catch(Exception exception2)
	//*  26   60:astore_1        
		{
			return;
	//   27   61:return          
		}
	}

	public void setBarInvisible()
	{
		_isHidden = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #172 <Field boolean _isHidden>
		if(_viewHolder.getVisibility() == 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #197 <Field LinearLayout _viewHolder>
	//*   5    9:invokevirtual   #614 <Method int LinearLayout.getVisibility()>
	//*   6   12:ifne            60
		{
			AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
	//    7   15:new             #290 <Class AlphaAnimation>
	//    8   18:dup             
	//    9   19:fconst_1        
	//   10   20:fconst_0        
	//   11   21:invokespecial   #293 <Method void AlphaAnimation(float, float)>
	//   12   24:astore_1        
			alphaanimation.setDuration(300L);
	//   13   25:aload_1         
	//   14   26:ldc2w           #615 <Long 300L>
	//   15   29:invokevirtual   #297 <Method void AlphaAnimation.setDuration(long)>
			alphaanimation.setFillAfter(true);
	//   16   32:aload_1         
	//   17   33:iconst_1        
	//   18   34:invokevirtual   #300 <Method void AlphaAnimation.setFillAfter(boolean)>
			alphaanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

				public void onAnimationEnd(Animation animation)
				{
				//    0    0:return          
				}

				public void onAnimationRepeat(Animation animation)
				{
				//    0    0:return          
				}

				public void onAnimationStart(Animation animation)
				{
					setControllerVisible(false);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
				//    2    4:iconst_0        
				//    3    5:invokestatic    #28  <Method void APSMediaPlayerControlsOverlayController.access$500(APSMediaPlayerControlsOverlayController, boolean)>
				//    4    8:return          
				}

				final APSMediaPlayerControlsOverlayController this$0;

			
			{
				this$0 = APSMediaPlayerControlsOverlayController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   19   37:aload_1         
	//   20   38:new             #8   <Class APSMediaPlayerControlsOverlayController$10>
	//   21   41:dup             
	//   22   42:aload_0         
	//   23   43:invokespecial   #617 <Method void APSMediaPlayerControlsOverlayController$10(APSMediaPlayerControlsOverlayController)>
	//   24   46:invokevirtual   #305 <Method void AlphaAnimation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
			_viewHolder.startAnimation(((Animation) (alphaanimation)));
	//   25   49:aload_0         
	//   26   50:getfield        #197 <Field LinearLayout _viewHolder>
	//   27   53:aload_1         
	//   28   54:invokevirtual   #309 <Method void LinearLayout.startAnimation(Animation)>
		} else
	//*  29   57:goto            100
		{
			AlphaAnimation alphaanimation1 = new AlphaAnimation(0.0F, 0.0F);
	//   30   60:new             #290 <Class AlphaAnimation>
	//   31   63:dup             
	//   32   64:fconst_0        
	//   33   65:fconst_0        
	//   34   66:invokespecial   #293 <Method void AlphaAnimation(float, float)>
	//   35   69:astore_1        
			alphaanimation1.setDuration(0L);
	//   36   70:aload_1         
	//   37   71:lconst_0        
	//   38   72:invokevirtual   #297 <Method void AlphaAnimation.setDuration(long)>
			alphaanimation1.setFillAfter(true);
	//   39   75:aload_1         
	//   40   76:iconst_1        
	//   41   77:invokevirtual   #300 <Method void AlphaAnimation.setFillAfter(boolean)>
			alphaanimation1.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

				public void onAnimationEnd(Animation animation)
				{
				//    0    0:return          
				}

				public void onAnimationRepeat(Animation animation)
				{
				//    0    0:return          
				}

				public void onAnimationStart(Animation animation)
				{
					setControllerVisible(false);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
				//    2    4:iconst_0        
				//    3    5:invokestatic    #28  <Method void APSMediaPlayerControlsOverlayController.access$500(APSMediaPlayerControlsOverlayController, boolean)>
				//    4    8:return          
				}

				final APSMediaPlayerControlsOverlayController this$0;

			
			{
				this$0 = APSMediaPlayerControlsOverlayController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   42   80:aload_1         
	//   43   81:new             #10  <Class APSMediaPlayerControlsOverlayController$11>
	//   44   84:dup             
	//   45   85:aload_0         
	//   46   86:invokespecial   #618 <Method void APSMediaPlayerControlsOverlayController$11(APSMediaPlayerControlsOverlayController)>
	//   47   89:invokevirtual   #305 <Method void AlphaAnimation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
			_viewHolder.startAnimation(((Animation) (alphaanimation1)));
	//   48   92:aload_0         
	//   49   93:getfield        #197 <Field LinearLayout _viewHolder>
	//   50   96:aload_1         
	//   51   97:invokevirtual   #309 <Method void LinearLayout.startAnimation(Animation)>
		}
		_lastBarVisibleTime = 0L;
	//   52  100:aload_0         
	//   53  101:lconst_0        
	//   54  102:putfield        #168 <Field long _lastBarVisibleTime>
		try
		{
			LocalBroadcastManager.getInstance(_seekBar.getContext()).sendBroadcast(new Intent("com.appscend.mp.notifications.controlshidden"));
	//   55  105:aload_0         
	//   56  106:getfield        #490 <Field SeekBar _seekBar>
	//   57  109:invokevirtual   #619 <Method Context SeekBar.getContext()>
	//   58  112:invokestatic    #268 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//   59  115:new             #270 <Class Intent>
	//   60  118:dup             
	//   61  119:ldc2            #621 <String "com.appscend.mp.notifications.controlshidden">
	//   62  122:invokespecial   #275 <Method void Intent(String)>
	//   63  125:invokevirtual   #279 <Method boolean LocalBroadcastManager.sendBroadcast(Intent)>
	//   64  128:pop             
		}
	//*  65  129:invokestatic    #253 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//*  66  132:invokevirtual   #624 <Method void APSMediaPlayer.resetDisplayedOverlays()>
	//*  67  135:return          
		catch(Exception exception) { }
	//   68  136:astore_1        
		APSMediaPlayer.getInstance().resetDisplayedOverlays();
	//*  69  137:goto            129
	}

	public void setBarVisible()
	{
		_isHidden = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #172 <Field boolean _isHidden>
		if(!controlsVisibleOnlyInFullscreen || APSMediaPlayer.getInstance().isFullscreen())
	//*   3    5:aload_0         
	//*   4    6:getfield        #247 <Field boolean controlsVisibleOnlyInFullscreen>
	//*   5    9:ifeq            21
	//*   6   12:invokestatic    #253 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//*   7   15:invokevirtual   #257 <Method boolean APSMediaPlayer.isFullscreen()>
	//*   8   18:ifeq            63
		{
			AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
	//    9   21:new             #290 <Class AlphaAnimation>
	//   10   24:dup             
	//   11   25:fconst_0        
	//   12   26:fconst_1        
	//   13   27:invokespecial   #293 <Method void AlphaAnimation(float, float)>
	//   14   30:astore_1        
			alphaanimation.setDuration(300L);
	//   15   31:aload_1         
	//   16   32:ldc2w           #615 <Long 300L>
	//   17   35:invokevirtual   #297 <Method void AlphaAnimation.setDuration(long)>
			alphaanimation.setFillAfter(true);
	//   18   38:aload_1         
	//   19   39:iconst_1        
	//   20   40:invokevirtual   #300 <Method void AlphaAnimation.setFillAfter(boolean)>
			alphaanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

				public void onAnimationEnd(Animation animation)
				{
				//    0    0:return          
				}

				public void onAnimationRepeat(Animation animation)
				{
				//    0    0:return          
				}

				public void onAnimationStart(Animation animation)
				{
					setControllerVisible(true);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
				//    2    4:iconst_1        
				//    3    5:invokestatic    #28  <Method void APSMediaPlayerControlsOverlayController.access$500(APSMediaPlayerControlsOverlayController, boolean)>
				//    4    8:return          
				}

				final APSMediaPlayerControlsOverlayController this$0;

			
			{
				this$0 = APSMediaPlayerControlsOverlayController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   21   43:aload_1         
	//   22   44:new             #30  <Class APSMediaPlayerControlsOverlayController$9>
	//   23   47:dup             
	//   24   48:aload_0         
	//   25   49:invokespecial   #625 <Method void APSMediaPlayerControlsOverlayController$9(APSMediaPlayerControlsOverlayController)>
	//   26   52:invokevirtual   #305 <Method void AlphaAnimation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
			_viewHolder.startAnimation(((Animation) (alphaanimation)));
	//   27   55:aload_0         
	//   28   56:getfield        #197 <Field LinearLayout _viewHolder>
	//   29   59:aload_1         
	//   30   60:invokevirtual   #309 <Method void LinearLayout.startAnimation(Animation)>
		}
		_lastBarVisibleTime = System.currentTimeMillis();
	//   31   63:aload_0         
	//   32   64:invokestatic    #245 <Method long System.currentTimeMillis()>
	//   33   67:putfield        #168 <Field long _lastBarVisibleTime>
		try
		{
			LocalBroadcastManager.getInstance(_viewHolder.getContext()).sendBroadcast(new Intent("com.appscend.mp.notifications.controlsdisplayed"));
	//   34   70:aload_0         
	//   35   71:getfield        #197 <Field LinearLayout _viewHolder>
	//   36   74:invokevirtual   #607 <Method Context LinearLayout.getContext()>
	//   37   77:invokestatic    #268 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//   38   80:new             #270 <Class Intent>
	//   39   83:dup             
	//   40   84:ldc2            #272 <String "com.appscend.mp.notifications.controlsdisplayed">
	//   41   87:invokespecial   #275 <Method void Intent(String)>
	//   42   90:invokevirtual   #279 <Method boolean LocalBroadcastManager.sendBroadcast(Intent)>
	//   43   93:pop             
		}
	//*  44   94:invokestatic    #253 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//*  45   97:invokevirtual   #624 <Method void APSMediaPlayer.resetDisplayedOverlays()>
	//*  46  100:return          
		catch(Exception exception) { }
	//   47  101:astore_1        
		APSMediaPlayer.getInstance().resetDisplayedOverlays();
	//*  48  102:goto            94
	}

	public void setSeekMax(int i)
	{
		_seekBar.setMax(i);
	//    0    0:aload_0         
	//    1    1:getfield        #490 <Field SeekBar _seekBar>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #629 <Method void SeekBar.setMax(int)>
		_totalTime.setText(((CharSequence) (stringFromTimeInterval(i))));
	//    4    8:aload_0         
	//    5    9:getfield        #586 <Field TextView _totalTime>
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokevirtual   #632 <Method String stringFromTimeInterval(int)>
	//    9   17:invokevirtual   #481 <Method void TextView.setText(CharSequence)>
	//   10   20:return          
	}

	public void setStatusPlaying(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            9
		{
			setPauseDrawable();
	//    2    4:aload_0         
	//    3    5:invokespecial   #160 <Method void setPauseDrawable()>
			return;
	//    4    8:return          
		} else
		{
			setPlayDrawable();
	//    5    9:aload_0         
	//    6   10:invokespecial   #156 <Method void setPlayDrawable()>
			return;
	//    7   13:return          
		}
	}

	public String stringFromTimeInterval(int i)
	{
		int k = i / 1000;
	//    0    0:iload_1         
	//    1    1:sipush          1000
	//    2    4:idiv            
	//    3    5:istore_3        
		i = k % 60;
	//    4    6:iload_3         
	//    5    7:bipush          60
	//    6    9:irem            
	//    7   10:istore_1        
		int j = (k / 60) % 60;
	//    8   11:iload_3         
	//    9   12:bipush          60
	//   10   14:idiv            
	//   11   15:bipush          60
	//   12   17:irem            
	//   13   18:istore_2        
		k /= 3600;
	//   14   19:iload_3         
	//   15   20:sipush          3600
	//   16   23:idiv            
	//   17   24:istore_3        
		if(k > 0)
	//*  18   25:iload_3         
	//*  19   26:ifle            64
			return String.format(Locale.US, "%02d:%02d:%02d", new Object[] {
				Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(i)
			});
	//   20   29:getstatic       #638 <Field Locale Locale.US>
	//   21   32:ldc2            #640 <String "%02d:%02d:%02d">
	//   22   35:iconst_3        
	//   23   36:anewarray       Object[]
	//   24   39:dup             
	//   25   40:iconst_0        
	//   26   41:iload_3         
	//   27   42:invokestatic    #646 <Method Integer Integer.valueOf(int)>
	//   28   45:aastore         
	//   29   46:dup             
	//   30   47:iconst_1        
	//   31   48:iload_2         
	//   32   49:invokestatic    #646 <Method Integer Integer.valueOf(int)>
	//   33   52:aastore         
	//   34   53:dup             
	//   35   54:iconst_2        
	//   36   55:iload_1         
	//   37   56:invokestatic    #646 <Method Integer Integer.valueOf(int)>
	//   38   59:aastore         
	//   39   60:invokestatic    #650 <Method String String.format(Locale, String, Object[])>
	//   40   63:areturn         
		else
			return String.format(Locale.US, "%02d:%02d", new Object[] {
				Integer.valueOf(j), Integer.valueOf(i)
			});
	//   41   64:getstatic       #638 <Field Locale Locale.US>
	//   42   67:ldc2            #652 <String "%02d:%02d">
	//   43   70:iconst_2        
	//   44   71:anewarray       Object[]
	//   45   74:dup             
	//   46   75:iconst_0        
	//   47   76:iload_2         
	//   48   77:invokestatic    #646 <Method Integer Integer.valueOf(int)>
	//   49   80:aastore         
	//   50   81:dup             
	//   51   82:iconst_1        
	//   52   83:iload_1         
	//   53   84:invokestatic    #646 <Method Integer Integer.valueOf(int)>
	//   54   87:aastore         
	//   55   88:invokestatic    #650 <Method String String.format(Locale, String, Object[])>
	//   56   91:areturn         
	}

	public String type()
	{
		return "controls";
	//    0    0:ldc1            #37  <String "controls">
	//    1    2:areturn         
	}

	public void update(int i, int j)
	{
		Object obj = ((Object) ((String)overlay.parameters.get("playbackTimeText")));
	//    0    0:aload_0         
	//    1    1:getfield        #324 <Field APSMediaOverlay overlay>
	//    2    4:getfield        #330 <Field HashMap APSMediaOverlay.parameters>
	//    3    7:ldc1            #88  <String "playbackTimeText">
	//    4    9:invokevirtual   #336 <Method Object HashMap.get(Object)>
	//    5   12:checkcast       #343 <Class String>
	//    6   15:astore_3        
		if(obj != null)
	//*   7   16:aload_3         
	//*   8   17:ifnull          28
			_currentTime.setText(((CharSequence) (obj)));
	//    9   20:aload_0         
	//   10   21:getfield        #470 <Field TextView _currentTime>
	//   11   24:aload_3         
	//   12   25:invokevirtual   #481 <Method void TextView.setText(CharSequence)>
		if(APSMediaPlayer.getInstance().movieSourceTypeIsLiveStream())
	//*  13   28:invokestatic    #253 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//*  14   31:invokevirtual   #657 <Method boolean APSMediaPlayer.movieSourceTypeIsLiveStream()>
	//*  15   34:ifeq            92
		{
			_seekBar.setEnabled(false);
	//   16   37:aload_0         
	//   17   38:getfield        #490 <Field SeekBar _seekBar>
	//   18   41:iconst_0        
	//   19   42:invokevirtual   #660 <Method void SeekBar.setEnabled(boolean)>
			String s = (String)overlay.parameters.get("liveText");
	//   20   45:aload_0         
	//   21   46:getfield        #324 <Field APSMediaOverlay overlay>
	//   22   49:getfield        #330 <Field HashMap APSMediaOverlay.parameters>
	//   23   52:ldc1            #79  <String "liveText">
	//   24   54:invokevirtual   #336 <Method Object HashMap.get(Object)>
	//   25   57:checkcast       #343 <Class String>
	//   26   60:astore          4
			if(s == null)
	//*  27   62:aload           4
	//*  28   64:ifnonnull       80
				_totalTime.setText("LIVE");
	//   29   67:aload_0         
	//   30   68:getfield        #586 <Field TextView _totalTime>
	//   31   71:ldc2            #662 <String "LIVE">
	//   32   74:invokevirtual   #481 <Method void TextView.setText(CharSequence)>
			else
	//*  33   77:goto            134
				_totalTime.setText(((CharSequence) (s)));
	//   34   80:aload_0         
	//   35   81:getfield        #586 <Field TextView _totalTime>
	//   36   84:aload           4
	//   37   86:invokevirtual   #481 <Method void TextView.setText(CharSequence)>
		} else
	//*  38   89:goto            134
		if(i > 0)
	//*  39   92:iload_1         
	//*  40   93:ifle            126
		{
			_seekBar.setEnabled(true);
	//   41   96:aload_0         
	//   42   97:getfield        #490 <Field SeekBar _seekBar>
	//   43  100:iconst_1        
	//   44  101:invokevirtual   #660 <Method void SeekBar.setEnabled(boolean)>
			setSeekMax(i);
	//   45  104:aload_0         
	//   46  105:iload_1         
	//   47  106:invokevirtual   #664 <Method void setSeekMax(int)>
			_seekBar.setSecondaryProgress(APSMediaPlayer.getInstance().playableDuration(i));
	//   48  109:aload_0         
	//   49  110:getfield        #490 <Field SeekBar _seekBar>
	//   50  113:invokestatic    #253 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   51  116:iload_1         
	//   52  117:invokevirtual   #668 <Method int APSMediaPlayer.playableDuration(int)>
	//   53  120:invokevirtual   #671 <Method void SeekBar.setSecondaryProgress(int)>
		} else
	//*  54  123:goto            134
		{
			_seekBar.setEnabled(false);
	//   55  126:aload_0         
	//   56  127:getfield        #490 <Field SeekBar _seekBar>
	//   57  130:iconst_0        
	//   58  131:invokevirtual   #660 <Method void SeekBar.setEnabled(boolean)>
		}
		if(!_isDragging && !APSMediaPlayer.getInstance().movieSourceTypeIsLiveStream())
	//*  59  134:aload_0         
	//*  60  135:getfield        #164 <Field boolean _isDragging>
	//*  61  138:ifne            158
	//*  62  141:invokestatic    #253 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//*  63  144:invokevirtual   #657 <Method boolean APSMediaPlayer.movieSourceTypeIsLiveStream()>
	//*  64  147:ifne            158
			_seekBar.setProgress(j);
	//   65  150:aload_0         
	//   66  151:getfield        #490 <Field SeekBar _seekBar>
	//   67  154:iload_2         
	//   68  155:invokevirtual   #674 <Method void SeekBar.setProgress(int)>
		if(obj == null)
	//*  69  158:aload_3         
	//*  70  159:ifnonnull       174
			_currentTime.setText(((CharSequence) (stringFromTimeInterval(j))));
	//   71  162:aload_0         
	//   72  163:getfield        #470 <Field TextView _currentTime>
	//   73  166:aload_0         
	//   74  167:iload_2         
	//   75  168:invokevirtual   #632 <Method String stringFromTimeInterval(int)>
	//   76  171:invokevirtual   #481 <Method void TextView.setText(CharSequence)>
		obj = ((Object) (APSMediaPlayer.getInstance().playbackState()));
	//   77  174:invokestatic    #253 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   78  177:invokevirtual   #678 <Method com.appscend.media.APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer.playbackState()>
	//   79  180:astore_3        
		if(obj != _lastPlaybackState)
	//*  80  181:aload_3         
	//*  81  182:aload_0         
	//*  82  183:getfield        #680 <Field com.appscend.media.APSMediaPlayer$MPMoviePlaybackState _lastPlaybackState>
	//*  83  186:if_acmpeq       221
			if(obj == com.appscend.media.APSMediaPlayer.MPMoviePlaybackState.MPMoviePlaybackPaused)
	//*  84  189:aload_3         
	//*  85  190:getstatic       #685 <Field com.appscend.media.APSMediaPlayer$MPMoviePlaybackState com.appscend.media.APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackPaused>
	//*  86  193:if_acmpne       203
				setPlayDrawable();
	//   87  196:aload_0         
	//   88  197:invokespecial   #156 <Method void setPlayDrawable()>
			else
	//*  89  200:goto            221
			if(obj == com.appscend.media.APSMediaPlayer.MPMoviePlaybackState.MPMoviePlaybackPlaying)
	//*  90  203:aload_3         
	//*  91  204:getstatic       #688 <Field com.appscend.media.APSMediaPlayer$MPMoviePlaybackState com.appscend.media.APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackPlaying>
	//*  92  207:if_acmpne       221
			{
				setPauseDrawable();
	//   93  210:aload_0         
	//   94  211:invokespecial   #160 <Method void setPauseDrawable()>
				_lastBarVisibleTime = System.currentTimeMillis();
	//   95  214:aload_0         
	//   96  215:invokestatic    #245 <Method long System.currentTimeMillis()>
	//   97  218:putfield        #168 <Field long _lastBarVisibleTime>
			}
		if(_lastBarVisibleTime != 0L && System.currentTimeMillis() - _lastBarVisibleTime >= (long)autoHideDuration && !_isDragging && APSMediaPlayer.getInstance().playbackState() == com.appscend.media.APSMediaPlayer.MPMoviePlaybackState.MPMoviePlaybackPlaying)
	//*  98  221:aload_0         
	//*  99  222:getfield        #168 <Field long _lastBarVisibleTime>
	//* 100  225:lconst_0        
	//* 101  226:lcmp            
	//* 102  227:ifeq            270
	//* 103  230:invokestatic    #245 <Method long System.currentTimeMillis()>
	//* 104  233:aload_0         
	//* 105  234:getfield        #168 <Field long _lastBarVisibleTime>
	//* 106  237:lsub            
	//* 107  238:aload_0         
	//* 108  239:getfield        #351 <Field int autoHideDuration>
	//* 109  242:i2l             
	//* 110  243:lcmp            
	//* 111  244:iflt            270
	//* 112  247:aload_0         
	//* 113  248:getfield        #164 <Field boolean _isDragging>
	//* 114  251:ifne            270
	//* 115  254:invokestatic    #253 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//* 116  257:invokevirtual   #678 <Method com.appscend.media.APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer.playbackState()>
	//* 117  260:getstatic       #688 <Field com.appscend.media.APSMediaPlayer$MPMoviePlaybackState com.appscend.media.APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackPlaying>
	//* 118  263:if_acmpne       270
			setBarInvisible();
	//  119  266:aload_0         
	//  120  267:invokevirtual   #690 <Method void setBarInvisible()>
		_lastPlaybackState = ((com.appscend.media.APSMediaPlayer.MPMoviePlaybackState) (obj));
	//  121  270:aload_0         
	//  122  271:aload_3         
	//  123  272:putfield        #680 <Field com.appscend.media.APSMediaPlayer$MPMoviePlaybackState _lastPlaybackState>
	//  124  275:return          
	}

	public static final int APSBackButtonControl = 16;
	public static final String APSControlsOverlay = "controls";
	public static final int APSCurrentTimeControl = 1;
	public static final int APSForwardButtonControl = 32;
	public static final int APSFullScreenControl = 8;
	public static final String APSMoviePlayerCommandHideControls = "com.appscend.mp.notifications.controls.hide";
	public static final String APSMoviePlayerCommandShowControls = "com.appscend.mp.notifications.controls.show";
	public static final int APSPlaybackControl = 64;
	public static final int APSTimeSliderControl = 2;
	public static final int APSTotalTimeControl = 4;
	public static final String kAPSControlsAutohideDuration = "autohideDuration";
	public static final String kAPSControlsBarAlpha = "barAlpha";
	public static final String kAPSControlsBarColor = "barColor";
	public static final String kAPSControlsBufferedTrackColor = "bufferedTrackColor";
	public static final String kAPSControlsComponents = "components";
	public static final String kAPSControlsEmptyTrackColor = "emptyTrackColor";
	public static final String kAPSControlsFullscreenImage = "fullscreenImage";
	public static final String kAPSControlsLiveText = "liveText";
	public static final String kAPSControlsPauseImage = "pauseImage";
	public static final String kAPSControlsPlayImage = "playImage";
	public static final String kAPSControlsPlaybackTimeText = "playbackTimeText";
	public static final String kAPSControlsPlayedTrackColor = "playedTrackColor";
	public static final String kAPSControlsSeekThumbImage = "seekThumbImage";
	public static final String kAPSControlsTextColor = "textColor";
	public static final String kAPSControlsVisibileOnlyInFullscreen = "visibleInFullscreenOnly";
	private Button _back;
	private TextView _currentTime;
	private Button _forward;
	private Button _fullscreen;
	private boolean _isDragging;
	private boolean _isHidden;
	private long _lastBarVisibleTime;
	private com.appscend.media.APSMediaPlayer.MPMoviePlaybackState _lastPlaybackState;
	private Button _playPause;
	private SeekBar _seekBar;
	private TextView _totalTime;
	private LinearLayout _viewHolder;
	private int autoHideDuration;
	private boolean controlsVisibleOnlyInFullscreen;
	private BitmapDrawable fullScreenDrawable;
	private int oldHeight;
	private BitmapDrawable pauseDrawable;
	private BitmapDrawable playDrawable;
	private BroadcastReceiver playerTapped;
	private BroadcastReceiver setBarInvisible;
	private BroadcastReceiver setBarVisible;


/*
	static void access$000(APSMediaPlayerControlsOverlayController apsmediaplayercontrolsoverlaycontroller)
	{
		apsmediaplayercontrolsoverlaycontroller.setPlayDrawable();
	//    0    0:aload_0         
	//    1    1:invokespecial   #156 <Method void setPlayDrawable()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$100(APSMediaPlayerControlsOverlayController apsmediaplayercontrolsoverlaycontroller)
	{
		apsmediaplayercontrolsoverlaycontroller.setPauseDrawable();
	//    0    0:aload_0         
	//    1    1:invokespecial   #160 <Method void setPauseDrawable()>
		return;
	//    2    4:return          
	}

*/


/*
	static boolean access$202(APSMediaPlayerControlsOverlayController apsmediaplayercontrolsoverlaycontroller, boolean flag)
	{
		apsmediaplayercontrolsoverlaycontroller._isDragging = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #164 <Field boolean _isDragging>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static long access$302(APSMediaPlayerControlsOverlayController apsmediaplayercontrolsoverlaycontroller, long l)
	{
		apsmediaplayercontrolsoverlaycontroller._lastBarVisibleTime = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #168 <Field long _lastBarVisibleTime>
		return l;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

*/


/*
	static boolean access$400(APSMediaPlayerControlsOverlayController apsmediaplayercontrolsoverlaycontroller)
	{
		return apsmediaplayercontrolsoverlaycontroller._isHidden;
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field boolean _isHidden>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$402(APSMediaPlayerControlsOverlayController apsmediaplayercontrolsoverlaycontroller, boolean flag)
	{
		apsmediaplayercontrolsoverlaycontroller._isHidden = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #172 <Field boolean _isHidden>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static void access$500(APSMediaPlayerControlsOverlayController apsmediaplayercontrolsoverlaycontroller, boolean flag)
	{
		apsmediaplayercontrolsoverlaycontroller.setControllerVisible(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #179 <Method void setControllerVisible(boolean)>
		return;
	//    3    5:return          
	}

*/
}
