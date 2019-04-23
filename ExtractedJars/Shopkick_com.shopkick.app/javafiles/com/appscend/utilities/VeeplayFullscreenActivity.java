// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.utilities;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.*;
import android.widget.RelativeLayout;
import com.appscend.media.APSMediaPlayer;
import java.util.ArrayList;

// Referenced classes of package com.appscend.utilities:
//			APSMediaPlayerTrackingEventListener, VPUtilities

public class VeeplayFullscreenActivity extends FragmentActivity
	implements APSMediaPlayerTrackingEventListener
{

	public VeeplayFullscreenActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void FragmentActivity()>
	//    2    4:return          
	}

	protected void onActivityResult(int i, int j, Intent intent)
	{
		intent = ((Intent) (APSMediaPlayer.getInstance()));
	//    0    0:invokestatic    #19  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    1    3:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #21  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #22  <Method void StringBuilder()>
	//    5   11:astore          4
		stringbuilder.append("Result: ");
	//    6   13:aload           4
	//    7   15:ldc1            #24  <String "Result: ">
	//    8   17:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
		stringbuilder.append(j);
	//   10   21:aload           4
	//   11   23:iload_2         
	//   12   24:invokevirtual   #31  <Method StringBuilder StringBuilder.append(int)>
	//   13   27:pop             
		stringbuilder.append(" req: ");
	//   14   28:aload           4
	//   15   30:ldc1            #33  <String " req: ">
	//   16   32:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
		stringbuilder.append(i);
	//   18   36:aload           4
	//   19   38:iload_1         
	//   20   39:invokevirtual   #31  <Method StringBuilder StringBuilder.append(int)>
	//   21   42:pop             
		((APSMediaPlayer) (intent)).log(stringbuilder.toString());
	//   22   43:aload_3         
	//   23   44:aload           4
	//   24   46:invokevirtual   #37  <Method String StringBuilder.toString()>
	//   25   49:invokevirtual   #41  <Method void APSMediaPlayer.log(String)>
		if(i == 999)
	//*  26   52:iload_1         
	//*  27   53:sipush          999
	//*  28   56:icmpne          63
			quitActivity();
	//   29   59:aload_0         
	//   30   60:invokevirtual   #44  <Method void quitActivity()>
	//   31   63:return          
	}

	public void onBackPressed()
	{
		super.onBackPressed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void FragmentActivity.onBackPressed()>
		quitActivity();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #44  <Method void quitActivity()>
	//    4    8:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #51  <Method void FragmentActivity.onConfigurationChanged(Configuration)>
		APSMediaPlayer.getInstance().setSize(VPUtilities.getWidth(), VPUtilities.getHeight());
	//    3    5:invokestatic    #19  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    4    8:invokestatic    #57  <Method int VPUtilities.getWidth()>
	//    5   11:invokestatic    #60  <Method int VPUtilities.getHeight()>
	//    6   14:invokevirtual   #64  <Method void APSMediaPlayer.setSize(int, int)>
		APSMediaPlayer.getInstance().computeSurfaceSize();
	//    7   17:invokestatic    #19  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    8   20:invokevirtual   #67  <Method void APSMediaPlayer.computeSurfaceSize()>
		APSMediaPlayer.getInstance().orientationWillChange();
	//    9   23:invokestatic    #19  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   10   26:invokevirtual   #70  <Method void APSMediaPlayer.orientationWillChange()>
	//   11   29:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #74  <Method void FragmentActivity.onCreate(Bundle)>
		setRequestedOrientation(10);
	//    3    5:aload_0         
	//    4    6:bipush          10
	//    5    8:invokevirtual   #78  <Method void setRequestedOrientation(int)>
		getWindow().getDecorView().setSystemUiVisibility(4);
	//    6   11:aload_0         
	//    7   12:invokevirtual   #82  <Method Window getWindow()>
	//    8   15:invokevirtual   #88  <Method View Window.getDecorView()>
	//    9   18:iconst_4        
	//   10   19:invokevirtual   #93  <Method void View.setSystemUiVisibility(int)>
		APSMediaPlayer.getInstance().setCurrentlyInFullscreenOverlayActivity(true);
	//   11   22:invokestatic    #19  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   12   25:iconst_1        
	//   13   26:invokevirtual   #97  <Method void APSMediaPlayer.setCurrentlyInFullscreenOverlayActivity(boolean)>
		bundle = ((Bundle) (new RelativeLayout(((android.content.Context) (this)))));
	//   14   29:new             #99  <Class RelativeLayout>
	//   15   32:dup             
	//   16   33:aload_0         
	//   17   34:invokespecial   #102 <Method void RelativeLayout(android.content.Context)>
	//   18   37:astore_1        
		((RelativeLayout) (bundle)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.RelativeLayout.LayoutParams(-1, -1))));
	//   19   38:aload_1         
	//   20   39:new             #104 <Class android.widget.RelativeLayout$LayoutParams>
	//   21   42:dup             
	//   22   43:iconst_m1       
	//   23   44:iconst_m1       
	//   24   45:invokespecial   #106 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   25   48:invokevirtual   #110 <Method void RelativeLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		((RelativeLayout) (bundle)).setBackgroundColor(0xff000000);
	//   26   51:aload_1         
	//   27   52:ldc1            #111 <Int 0xff000000>
	//   28   54:invokevirtual   #114 <Method void RelativeLayout.setBackgroundColor(int)>
		setContentView(((View) (bundle)));
	//   29   57:aload_0         
	//   30   58:aload_1         
	//   31   59:invokevirtual   #118 <Method void setContentView(View)>
		APSMediaPlayer.getInstance().init(((android.app.Activity) (this)), true);
	//   32   62:invokestatic    #19  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   33   65:aload_0         
	//   34   66:iconst_1        
	//   35   67:invokevirtual   #122 <Method void APSMediaPlayer.init(android.app.Activity, boolean)>
		APSMediaPlayer.getInstance().addTrackingEventListener(((APSMediaPlayerTrackingEventListener) (this)));
	//   36   70:invokestatic    #19  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   37   73:aload_0         
	//   38   74:invokevirtual   #126 <Method void APSMediaPlayer.addTrackingEventListener(APSMediaPlayerTrackingEventListener)>
		ViewGroup viewgroup = APSMediaPlayer.getInstance().viewController();
	//   39   77:invokestatic    #19  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   40   80:invokevirtual   #130 <Method ViewGroup APSMediaPlayer.viewController()>
	//   41   83:astore_2        
		if(((View) (viewgroup)).getParent() != null)
	//*  42   84:aload_2         
	//*  43   85:invokevirtual   #134 <Method android.view.ViewParent View.getParent()>
	//*  44   88:ifnull          102
			((ViewGroup)((View) (viewgroup)).getParent()).removeView(((View) (viewgroup)));
	//   45   91:aload_2         
	//   46   92:invokevirtual   #134 <Method android.view.ViewParent View.getParent()>
	//   47   95:checkcast       #136 <Class ViewGroup>
	//   48   98:aload_2         
	//   49   99:invokevirtual   #139 <Method void ViewGroup.removeView(View)>
		((RelativeLayout) (bundle)).addView(((View) (viewgroup)));
	//   50  102:aload_1         
	//   51  103:aload_2         
	//   52  104:invokevirtual   #142 <Method void RelativeLayout.addView(View)>
		APSMediaPlayer.getInstance().playAlreadySetMediaUnits();
	//   53  107:invokestatic    #19  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   54  110:invokevirtual   #145 <Method void APSMediaPlayer.playAlreadySetMediaUnits()>
	//   55  113:return          
	}

	public void onTrackingEventReceived(com.appscend.media.APSMediaTrackingEvents.MediaEventType mediaeventtype, Bundle bundle)
	{
		if(mediaeventtype == com.appscend.media.APSMediaTrackingEvents.MediaEventType.PLAYLIST_FINISHED)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #153 <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.PLAYLIST_FINISHED>
	//*   2    4:if_acmpne       11
			quitActivity();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #44  <Method void quitActivity()>
	//    5   11:return          
	}

	public void quitActivity()
	{
		APSMediaPlayer.getInstance().trackforEvent(new ArrayList(), "exit_fullscreen_overlay_activity", com.appscend.media.APSMediaTrackingEvents.MediaEventType.EXIT_FULLSCREEN_OVERLAY_ACTIVITY, ((com.appscend.media.events.APSMediaEvent) (null)));
	//    0    0:invokestatic    #19  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    1    3:new             #155 <Class ArrayList>
	//    2    6:dup             
	//    3    7:invokespecial   #156 <Method void ArrayList()>
	//    4   10:ldc1            #158 <String "exit_fullscreen_overlay_activity">
	//    5   12:getstatic       #161 <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.EXIT_FULLSCREEN_OVERLAY_ACTIVITY>
	//    6   15:aconst_null     
	//    7   16:invokevirtual   #165 <Method void APSMediaPlayer.trackforEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, com.appscend.media.events.APSMediaEvent)>
		APSMediaPlayer.getInstance().setCurrentlyInFullscreenOverlayActivity(false);
	//    8   19:invokestatic    #19  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    9   22:iconst_0        
	//   10   23:invokevirtual   #97  <Method void APSMediaPlayer.setCurrentlyInFullscreenOverlayActivity(boolean)>
		APSMediaPlayer.getInstance().finish();
	//   11   26:invokestatic    #19  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   12   29:invokevirtual   #168 <Method void APSMediaPlayer.finish()>
		finish();
	//   13   32:aload_0         
	//   14   33:invokevirtual   #169 <Method void finish()>
	//   15   36:return          
	}
}
