// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.appscend.media.APSMediaPlayer;
import com.appscend.media.events.APSMediaOverlay;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerOverlayController, DismissActionContainer

public class APSMediaPlayerButtonOverlayController extends APSMediaPlayerOverlayController
{

	public APSMediaPlayerButtonOverlayController()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void APSMediaPlayerOverlayController()>
	//    2    4:return          
	}

	public void addViewToContainer(ViewGroup viewgroup)
	{
		viewgroup.addView(((View) (_view)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #32  <Field Button _view>
	//    3    5:invokevirtual   #38  <Method void ViewGroup.addView(View)>
	//    4    8:return          
	}

	public float getAlpha()
	{
		return 1.0F;
	//    0    0:fconst_1        
	//    1    1:freturn         
	}

	public View getView()
	{
		return ((View) (_view));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Button _view>
	//    2    4:areturn         
	}

	public void hideOverlay()
	{
		_view.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Button _view>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #49  <Method void Button.setVisibility(int)>
	//    4    9:return          
	}

	public void load(Context context)
	{
		_view = new Button(context);
	//    0    0:aload_0         
	//    1    1:new             #45  <Class Button>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #53  <Method void Button(Context)>
	//    5    9:putfield        #32  <Field Button _view>
		_view.setBackgroundColor(0);
	//    6   12:aload_0         
	//    7   13:getfield        #32  <Field Button _view>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #56  <Method void Button.setBackgroundColor(int)>
		_view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
	//   10   20:aload_0         
	//   11   21:getfield        #32  <Field Button _view>
	//   12   24:new             #58  <Class android.view.ViewGroup$LayoutParams>
	//   13   27:dup             
	//   14   28:iconst_m1       
	//   15   29:iconst_m1       
	//   16   30:invokespecial   #61  <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   17   33:invokevirtual   #65  <Method void Button.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		if(overlay.parameters.get("clickThrough") != null)
	//*  18   36:aload_0         
	//*  19   37:getfield        #69  <Field APSMediaOverlay overlay>
	//*  20   40:getfield        #75  <Field HashMap APSMediaOverlay.parameters>
	//*  21   43:ldc1            #13  <String "clickThrough">
	//*  22   45:invokevirtual   #81  <Method Object HashMap.get(Object)>
	//*  23   48:ifnull          66
			_view.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					overlayClicked();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field APSMediaPlayerButtonOverlayController this$0>
				//    2    4:invokevirtual   #26  <Method void APSMediaPlayerButtonOverlayController.overlayClicked()>
				//    3    7:return          
				}

				final APSMediaPlayerButtonOverlayController this$0;

			
			{
				this$0 = APSMediaPlayerButtonOverlayController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayerButtonOverlayController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   24   51:aload_0         
	//   25   52:getfield        #32  <Field Button _view>
	//   26   55:new             #6   <Class APSMediaPlayerButtonOverlayController$1>
	//   27   58:dup             
	//   28   59:aload_0         
	//   29   60:invokespecial   #84  <Method void APSMediaPlayerButtonOverlayController$1(APSMediaPlayerButtonOverlayController)>
	//   30   63:invokevirtual   #88  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		if(overlay.parameters.get("dismissAction") == null)
	//*  31   66:aload_0         
	//*  32   67:getfield        #69  <Field APSMediaOverlay overlay>
	//*  33   70:getfield        #75  <Field HashMap APSMediaOverlay.parameters>
	//*  34   73:ldc1            #19  <String "dismissAction">
	//*  35   75:invokevirtual   #81  <Method Object HashMap.get(Object)>
	//*  36   78:ifnonnull       89
		{
			dismissedAction = com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss;
	//   37   81:aload_0         
	//   38   82:getstatic       #93  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss>
	//   39   85:putfield        #95  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction dismissedAction>
			return;
	//   40   88:return          
		}
		if(overlay.parameters.get("dismissAction") instanceof com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction)
	//*  41   89:aload_0         
	//*  42   90:getfield        #69  <Field APSMediaOverlay overlay>
	//*  43   93:getfield        #75  <Field HashMap APSMediaOverlay.parameters>
	//*  44   96:ldc1            #19  <String "dismissAction">
	//*  45   98:invokevirtual   #81  <Method Object HashMap.get(Object)>
	//*  46  101:instanceof      #90  <Class com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction>
	//*  47  104:ifeq            127
		{
			dismissedAction = (com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction)overlay.parameters.get("dismissAction");
	//   48  107:aload_0         
	//   49  108:aload_0         
	//   50  109:getfield        #69  <Field APSMediaOverlay overlay>
	//   51  112:getfield        #75  <Field HashMap APSMediaOverlay.parameters>
	//   52  115:ldc1            #19  <String "dismissAction">
	//   53  117:invokevirtual   #81  <Method Object HashMap.get(Object)>
	//   54  120:checkcast       #90  <Class com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction>
	//   55  123:putfield        #95  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction dismissedAction>
			return;
	//   56  126:return          
		}
		context = ((Context) ((String)overlay.parameters.get("dismissAction")));
	//   57  127:aload_0         
	//   58  128:getfield        #69  <Field APSMediaOverlay overlay>
	//   59  131:getfield        #75  <Field HashMap APSMediaOverlay.parameters>
	//   60  134:ldc1            #19  <String "dismissAction">
	//   61  136:invokevirtual   #81  <Method Object HashMap.get(Object)>
	//   62  139:checkcast       #97  <Class String>
	//   63  142:astore_1        
		if(((String) (context)).equals("doNothing"))
	//*  64  143:aload_1         
	//*  65  144:ldc1            #99  <String "doNothing">
	//*  66  146:invokevirtual   #103 <Method boolean String.equals(Object)>
	//*  67  149:ifeq            160
		{
			dismissedAction = com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss;
	//   68  152:aload_0         
	//   69  153:getstatic       #93  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSDoNothingOnWebviewDismiss>
	//   70  156:putfield        #95  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction dismissedAction>
			return;
	//   71  159:return          
		}
		if(((String) (context)).equals("skipUnit"))
	//*  72  160:aload_1         
	//*  73  161:ldc1            #105 <String "skipUnit">
	//*  74  163:invokevirtual   #103 <Method boolean String.equals(Object)>
	//*  75  166:ifeq            177
		{
			dismissedAction = com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.APSSkipUnitOnWebviewDismiss;
	//   76  169:aload_0         
	//   77  170:getstatic       #108 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSSkipUnitOnWebviewDismiss>
	//   78  173:putfield        #95  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction dismissedAction>
			return;
	//   79  176:return          
		}
		if(((String) (context)).equals("closeOverlay"))
	//*  80  177:aload_1         
	//*  81  178:ldc1            #110 <String "closeOverlay">
	//*  82  180:invokevirtual   #103 <Method boolean String.equals(Object)>
	//*  83  183:ifeq            193
			dismissedAction = com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.APSHideOverlayOnWebviewDismiss;
	//   84  186:aload_0         
	//   85  187:getstatic       #113 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSHideOverlayOnWebviewDismiss>
	//   86  190:putfield        #95  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction dismissedAction>
	//   87  193:return          
	}

	public void overlayClicked()
	{
		if(APSMediaPlayer.getInstance().openURL((String)overlay.parameters.get("clickThrough")))
	//*   0    0:invokestatic    #120 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//*   1    3:aload_0         
	//*   2    4:getfield        #69  <Field APSMediaOverlay overlay>
	//*   3    7:getfield        #75  <Field HashMap APSMediaOverlay.parameters>
	//*   4   10:ldc1            #13  <String "clickThrough">
	//*   5   12:invokevirtual   #81  <Method Object HashMap.get(Object)>
	//*   6   15:checkcast       #97  <Class String>
	//*   7   18:invokevirtual   #124 <Method boolean APSMediaPlayer.openURL(String)>
	//*   8   21:ifeq            101
		{
			if(overlay.parameters.get("clickTracking") != null)
	//*   9   24:aload_0         
	//*  10   25:getfield        #69  <Field APSMediaOverlay overlay>
	//*  11   28:getfield        #75  <Field HashMap APSMediaOverlay.parameters>
	//*  12   31:ldc1            #16  <String "clickTracking">
	//*  13   33:invokevirtual   #81  <Method Object HashMap.get(Object)>
	//*  14   36:ifnull          69
				APSMediaPlayer.getInstance().trackforEvent((ArrayList)overlay.parameters.get("clickTracking"), "linear clickTracking", com.appscend.media.APSMediaTrackingEvents.MediaEventType.CLICK, ((com.appscend.media.events.APSMediaEvent) (overlay)));
	//   15   39:invokestatic    #120 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   16   42:aload_0         
	//   17   43:getfield        #69  <Field APSMediaOverlay overlay>
	//   18   46:getfield        #75  <Field HashMap APSMediaOverlay.parameters>
	//   19   49:ldc1            #16  <String "clickTracking">
	//   20   51:invokevirtual   #81  <Method Object HashMap.get(Object)>
	//   21   54:checkcast       #126 <Class ArrayList>
	//   22   57:ldc1            #128 <String "linear clickTracking">
	//   23   59:getstatic       #134 <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.CLICK>
	//   24   62:aload_0         
	//   25   63:getfield        #69  <Field APSMediaOverlay overlay>
	//   26   66:invokevirtual   #138 <Method void APSMediaPlayer.trackforEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, com.appscend.media.events.APSMediaEvent)>
			if(dismissedAction == com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction.APSHideOverlayOnWebviewDismiss)
	//*  27   69:aload_0         
	//*  28   70:getfield        #95  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction dismissedAction>
	//*  29   73:getstatic       #113 <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSHideOverlayOnWebviewDismiss>
	//*  30   76:if_acmpne       91
			{
				DismissActionContainer.INSTANCE.setDismissAction(dismissedAction, ((APSMediaPlayerOverlayController) (this)));
	//   31   79:getstatic       #144 <Field DismissActionContainer DismissActionContainer.INSTANCE>
	//   32   82:aload_0         
	//   33   83:getfield        #95  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction dismissedAction>
	//   34   86:aload_0         
	//   35   87:invokevirtual   #148 <Method void DismissActionContainer.setDismissAction(com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction, APSMediaPlayerOverlayController)>
				return;
	//   36   90:return          
			}
			DismissActionContainer.INSTANCE.setDismissAction(dismissedAction);
	//   37   91:getstatic       #144 <Field DismissActionContainer DismissActionContainer.INSTANCE>
	//   38   94:aload_0         
	//   39   95:getfield        #95  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction dismissedAction>
	//   40   98:invokevirtual   #151 <Method void DismissActionContainer.setDismissAction(com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction)>
		}
	//   41  101:return          
	}

	public String type()
	{
		return "button";
	//    0    0:ldc1            #10  <String "button">
	//    1    2:areturn         
	}

	public static final String APSButtonOverlay = "button";
	public static final String kAPSButtonOverlayClickthrough = "clickThrough";
	public static final String kAPSButtonOverlayClicktracking = "clickTracking";
	public static final String kAPSButtonOverlayWebviewDismissAction = "dismissAction";
	private Button _view;
	private com.appscend.media.APSMediaBuilder.APSWebviewDismissedAction dismissedAction;
}
