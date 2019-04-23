// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.appscend.media.events.APSMediaOverlay;
import com.appscend.mraid.MadvertiseMraidView;
import com.appscend.mraid.MadvertiseView;
import java.util.HashMap;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerClosableOverlayController

public class APSMediaPlayerMRAIDOverlayController extends APSMediaPlayerClosableOverlayController
{

	public APSMediaPlayerMRAIDOverlayController()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void APSMediaPlayerClosableOverlayController()>
	//    2    4:return          
	}

	public void addViewToContainer(ViewGroup viewgroup)
	{
		viewgroup.addView(((View) (_viewHolder)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #46  <Field RelativeLayout _viewHolder>
	//    3    5:invokevirtual   #52  <Method void ViewGroup.addView(View)>
		addCloseButtonWithParameters(((ViewGroup) (_viewHolder)), overlay.parameters);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #46  <Field RelativeLayout _viewHolder>
	//    7   13:aload_0         
	//    8   14:getfield        #56  <Field APSMediaOverlay overlay>
	//    9   17:getfield        #62  <Field HashMap APSMediaOverlay.parameters>
	//   10   20:invokevirtual   #66  <Method void addCloseButtonWithParameters(ViewGroup, HashMap)>
	//   11   23:return          
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
	//    1    1:getfield        #46  <Field RelativeLayout _viewHolder>
	//    2    4:areturn         
	}

	public void hideOverlay()
	{
		_viewHolder.removeAllViews();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field RelativeLayout _viewHolder>
	//    2    4:invokevirtual   #76  <Method void RelativeLayout.removeAllViews()>
	//    3    7:return          
	}

	public void load(Context context)
	{
		_viewHolder = new RelativeLayout(context);
	//    0    0:aload_0         
	//    1    1:new             #73  <Class RelativeLayout>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #80  <Method void RelativeLayout(Context)>
	//    5    9:putfield        #46  <Field RelativeLayout _viewHolder>
		adView = new MadvertiseMraidView(context, new com.appscend.mraid.MadvertiseView.MadvertiseViewCallbackListener() {

			public void onAdClicked()
			{
			//    0    0:return          
			}

			public void onApplicationPause()
			{
			//    0    0:return          
			}

			public void onApplicationResume()
			{
			//    0    0:return          
			}

			public void onError(Exception exception)
			{
			//    0    0:return          
			}

			public void onIllegalHttpStatusCode(int i, String s)
			{
			//    0    0:return          
			}

			public void onLoaded(boolean flag, MadvertiseView madvertiseview)
			{
			//    0    0:return          
			}

			final APSMediaPlayerMRAIDOverlayController this$0;

			
			{
				this$0 = APSMediaPlayerMRAIDOverlayController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayerMRAIDOverlayController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
, new com.appscend.mraid.MadvertiseView.AnimationEndListener() {

			public void onAnimationEnd()
			{
			//    0    0:return          
			}

			final APSMediaPlayerMRAIDOverlayController this$0;

			
			{
				this$0 = APSMediaPlayerMRAIDOverlayController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayerMRAIDOverlayController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
, new Handler(), new MadvertiseView(context));
	//    6   12:aload_0         
	//    7   13:new             #82  <Class MadvertiseMraidView>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:new             #6   <Class APSMediaPlayerMRAIDOverlayController$1>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:invokespecial   #85  <Method void APSMediaPlayerMRAIDOverlayController$1(APSMediaPlayerMRAIDOverlayController)>
	//   14   26:new             #8   <Class APSMediaPlayerMRAIDOverlayController$2>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:invokespecial   #86  <Method void APSMediaPlayerMRAIDOverlayController$2(APSMediaPlayerMRAIDOverlayController)>
	//   18   34:new             #88  <Class Handler>
	//   19   37:dup             
	//   20   38:invokespecial   #89  <Method void Handler()>
	//   21   41:new             #91  <Class MadvertiseView>
	//   22   44:dup             
	//   23   45:aload_1         
	//   24   46:invokespecial   #92  <Method void MadvertiseView(Context)>
	//   25   49:invokespecial   #95  <Method void MadvertiseMraidView(Context, com.appscend.mraid.MadvertiseView$MadvertiseViewCallbackListener, com.appscend.mraid.MadvertiseView$AnimationEndListener, Handler, MadvertiseView)>
	//   26   52:putfield        #97  <Field MadvertiseMraidView adView>
		if(overlay.parameters.get("aps_mraid_content") != null)
	//*  27   55:aload_0         
	//*  28   56:getfield        #56  <Field APSMediaOverlay overlay>
	//*  29   59:getfield        #62  <Field HashMap APSMediaOverlay.parameters>
	//*  30   62:ldc1            #18  <String "aps_mraid_content">
	//*  31   64:invokevirtual   #103 <Method Object HashMap.get(Object)>
	//*  32   67:ifnull          102
			adView.loadDataWithBaseURL("file:///android_asset/", (String)overlay.parameters.get("aps_mraid_content"), "text/html", "UTF-8", ((String) (null)));
	//   33   70:aload_0         
	//   34   71:getfield        #97  <Field MadvertiseMraidView adView>
	//   35   74:ldc1            #105 <String "file:///android_asset/">
	//   36   76:aload_0         
	//   37   77:getfield        #56  <Field APSMediaOverlay overlay>
	//   38   80:getfield        #62  <Field HashMap APSMediaOverlay.parameters>
	//   39   83:ldc1            #18  <String "aps_mraid_content">
	//   40   85:invokevirtual   #103 <Method Object HashMap.get(Object)>
	//   41   88:checkcast       #107 <Class String>
	//   42   91:ldc1            #109 <String "text/html">
	//   43   93:ldc1            #111 <String "UTF-8">
	//   44   95:aconst_null     
	//   45   96:invokevirtual   #115 <Method void MadvertiseMraidView.loadDataWithBaseURL(String, String, String, String, String)>
		else
	//*  46   99:goto            139
		if(overlay.parameters.get("aps_mraid_source") != null)
	//*  47  102:aload_0         
	//*  48  103:getfield        #56  <Field APSMediaOverlay overlay>
	//*  49  106:getfield        #62  <Field HashMap APSMediaOverlay.parameters>
	//*  50  109:ldc1            #30  <String "aps_mraid_source">
	//*  51  111:invokevirtual   #103 <Method Object HashMap.get(Object)>
	//*  52  114:ifnull          139
			adView.loadUrl((String)overlay.parameters.get("aps_mraid_source"));
	//   53  117:aload_0         
	//   54  118:getfield        #97  <Field MadvertiseMraidView adView>
	//   55  121:aload_0         
	//   56  122:getfield        #56  <Field APSMediaOverlay overlay>
	//   57  125:getfield        #62  <Field HashMap APSMediaOverlay.parameters>
	//   58  128:ldc1            #30  <String "aps_mraid_source">
	//   59  130:invokevirtual   #103 <Method Object HashMap.get(Object)>
	//   60  133:checkcast       #107 <Class String>
	//   61  136:invokevirtual   #119 <Method void MadvertiseMraidView.loadUrl(String)>
		_viewHolder.addView(((View) (adView)));
	//   62  139:aload_0         
	//   63  140:getfield        #46  <Field RelativeLayout _viewHolder>
	//   64  143:aload_0         
	//   65  144:getfield        #97  <Field MadvertiseMraidView adView>
	//   66  147:invokevirtual   #120 <Method void RelativeLayout.addView(View)>
	//   67  150:return          
	}

	public String type()
	{
		return "com.appscend.mp.overlays.mraid";
	//    0    0:ldc1            #12  <String "com.appscend.mp.overlays.mraid">
	//    1    2:areturn         
	}

	public static final String APSMRAIDOverlay = "com.appscend.mp.overlays.mraid";
	public static final String kAPSMRAIDClicktracking = "aps_mraid_clicktracking";
	public static final String kAPSMRAIDContent = "aps_mraid_content";
	public static final String kAPSMRAIDErrorURLs = "aps_mraid_error";
	public static final String kAPSMRAIDExpandedHeight = "aps_mraid_exph";
	public static final String kAPSMRAIDExpandedWidth = "aps_mraid_expw";
	public static final String kAPSMRAIDSource = "aps_mraid_source";
	public static final String kAPSMRAIDTrackingURLs = "aps_mraid_tracking";
	private RelativeLayout _viewHolder;
	private MadvertiseMraidView adView;
}
