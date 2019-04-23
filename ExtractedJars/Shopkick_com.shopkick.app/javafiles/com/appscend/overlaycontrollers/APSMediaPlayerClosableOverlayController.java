// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import com.appscend.media.APSMediaPlayer;
import com.appscend.utilities.ProgressWheel;
import com.appscend.utilities.VPUtilities;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerOverlayController

public class APSMediaPlayerClosableOverlayController extends APSMediaPlayerOverlayController
{

	public APSMediaPlayerClosableOverlayController()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void APSMediaPlayerOverlayController()>
		closeTapped = new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				if(_close_trackingURLs != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #14  <Field APSMediaPlayerClosableOverlayController this$0>
			//*   2    4:invokestatic    #24  <Method ArrayList APSMediaPlayerClosableOverlayController.access$500(APSMediaPlayerClosableOverlayController)>
			//*   3    7:ifnull          35
					APSMediaPlayer.getInstance().trackforEvent(_close_trackingURLs, "non-linear closed by user", com.appscend.media.APSMediaTrackingEvents.MediaEventType.CLOSE, ((com.appscend.media.events.APSMediaEvent) (overlay)));
			//    4   10:invokestatic    #30  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//    5   13:aload_0         
			//    6   14:getfield        #14  <Field APSMediaPlayerClosableOverlayController this$0>
			//    7   17:invokestatic    #24  <Method ArrayList APSMediaPlayerClosableOverlayController.access$500(APSMediaPlayerClosableOverlayController)>
			//    8   20:ldc1            #32  <String "non-linear closed by user">
			//    9   22:getstatic       #38  <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.CLOSE>
			//   10   25:aload_0         
			//   11   26:getfield        #14  <Field APSMediaPlayerClosableOverlayController this$0>
			//   12   29:getfield        #42  <Field com.appscend.media.events.APSMediaOverlay APSMediaPlayerClosableOverlayController.overlay>
			//   13   32:invokevirtual   #46  <Method void APSMediaPlayer.trackforEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, com.appscend.media.events.APSMediaEvent)>
				view = ((View) (new AlphaAnimation(1.0F, 0.0F)));
			//   14   35:new             #48  <Class AlphaAnimation>
			//   15   38:dup             
			//   16   39:fconst_1        
			//   17   40:fconst_0        
			//   18   41:invokespecial   #51  <Method void AlphaAnimation(float, float)>
			//   19   44:astore_1        
				((AlphaAnimation) (view)).setDuration(300L);
			//   20   45:aload_1         
			//   21   46:ldc2w           #52  <Long 300L>
			//   22   49:invokevirtual   #57  <Method void AlphaAnimation.setDuration(long)>
				((AlphaAnimation) (view)).setFillAfter(true);
			//   23   52:aload_1         
			//   24   53:iconst_1        
			//   25   54:invokevirtual   #61  <Method void AlphaAnimation.setFillAfter(boolean)>
				_viewGroup.startAnimation(((android.view.animation.Animation) (view)));
			//   26   57:aload_0         
			//   27   58:getfield        #14  <Field APSMediaPlayerClosableOverlayController this$0>
			//   28   61:invokestatic    #65  <Method ViewGroup APSMediaPlayerClosableOverlayController.access$600(APSMediaPlayerClosableOverlayController)>
			//   29   64:aload_1         
			//   30   65:invokevirtual   #71  <Method void ViewGroup.startAnimation(android.view.animation.Animation)>
				_current_alpha = 0.0F;
			//   31   68:aload_0         
			//   32   69:getfield        #14  <Field APSMediaPlayerClosableOverlayController this$0>
			//   33   72:fconst_0        
			//   34   73:invokestatic    #75  <Method float APSMediaPlayerClosableOverlayController.access$302(APSMediaPlayerClosableOverlayController, float)>
			//   35   76:pop             
				APSMediaPlayer.getInstance().resetDisplayedOverlays();
			//   36   77:invokestatic    #30  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//   37   80:invokevirtual   #78  <Method void APSMediaPlayer.resetDisplayedOverlays()>
			//   38   83:return          
			}

			final APSMediaPlayerClosableOverlayController this$0;

			
			{
				this$0 = APSMediaPlayerClosableOverlayController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field APSMediaPlayerClosableOverlayController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    2    4:aload_0         
	//    3    5:new             #8   <Class APSMediaPlayerClosableOverlayController$2>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #70  <Method void APSMediaPlayerClosableOverlayController$2(APSMediaPlayerClosableOverlayController)>
	//    7   13:putfield        #72  <Field android.view.View$OnClickListener closeTapped>
	//    8   16:return          
	}

	public void activateButton()
	{
		if(_close_button != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field ProgressWheel _close_button>
	//*   2    4:ifnull          58
		{
			AlphaAnimation alphaanimation = new AlphaAnimation(_close_initial_alpha, _close_final_alpha);
	//    3    7:new             #103 <Class AlphaAnimation>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #81  <Field float _close_initial_alpha>
	//    7   15:aload_0         
	//    8   16:getfield        #84  <Field float _close_final_alpha>
	//    9   19:invokespecial   #106 <Method void AlphaAnimation(float, float)>
	//   10   22:astore_1        
			alphaanimation.setDuration(0L);
	//   11   23:aload_1         
	//   12   24:lconst_0        
	//   13   25:invokevirtual   #110 <Method void AlphaAnimation.setDuration(long)>
			alphaanimation.setFillAfter(true);
	//   14   28:aload_1         
	//   15   29:iconst_1        
	//   16   30:invokevirtual   #114 <Method void AlphaAnimation.setFillAfter(boolean)>
			_close_button.startAnimation(((android.view.animation.Animation) (alphaanimation)));
	//   17   33:aload_0         
	//   18   34:getfield        #77  <Field ProgressWheel _close_button>
	//   19   37:aload_1         
	//   20   38:invokevirtual   #120 <Method void ProgressWheel.startAnimation(android.view.animation.Animation)>
			_close_button.setEnabled(true);
	//   21   41:aload_0         
	//   22   42:getfield        #77  <Field ProgressWheel _close_button>
	//   23   45:iconst_1        
	//   24   46:invokevirtual   #123 <Method void ProgressWheel.setEnabled(boolean)>
			_current_alpha = _close_final_alpha;
	//   25   49:aload_0         
	//   26   50:aload_0         
	//   27   51:getfield        #84  <Field float _close_final_alpha>
	//   28   54:putfield        #88  <Field float _current_alpha>
			return;
	//   29   57:return          
		} else
		{
			AlphaAnimation alphaanimation1 = new AlphaAnimation(_close_initial_alpha, _close_final_alpha);
	//   30   58:new             #103 <Class AlphaAnimation>
	//   31   61:dup             
	//   32   62:aload_0         
	//   33   63:getfield        #81  <Field float _close_initial_alpha>
	//   34   66:aload_0         
	//   35   67:getfield        #84  <Field float _close_final_alpha>
	//   36   70:invokespecial   #106 <Method void AlphaAnimation(float, float)>
	//   37   73:astore_1        
			alphaanimation1.setDuration(0L);
	//   38   74:aload_1         
	//   39   75:lconst_0        
	//   40   76:invokevirtual   #110 <Method void AlphaAnimation.setDuration(long)>
			alphaanimation1.setFillAfter(true);
	//   41   79:aload_1         
	//   42   80:iconst_1        
	//   43   81:invokevirtual   #114 <Method void AlphaAnimation.setFillAfter(boolean)>
			_close_image.startAnimation(((android.view.animation.Animation) (alphaanimation1)));
	//   44   84:aload_0         
	//   45   85:getfield        #92  <Field ImageView _close_image>
	//   46   88:aload_1         
	//   47   89:invokevirtual   #126 <Method void ImageView.startAnimation(android.view.animation.Animation)>
			_close_image.setEnabled(true);
	//   48   92:aload_0         
	//   49   93:getfield        #92  <Field ImageView _close_image>
	//   50   96:iconst_1        
	//   51   97:invokevirtual   #127 <Method void ImageView.setEnabled(boolean)>
			_current_alpha = _close_final_alpha;
	//   52  100:aload_0         
	//   53  101:aload_0         
	//   54  102:getfield        #84  <Field float _close_final_alpha>
	//   55  105:putfield        #88  <Field float _current_alpha>
			return;
	//   56  108:return          
		}
	}

	public void addCloseButtonWithParameters(ViewGroup viewgroup, HashMap hashmap)
	{
		if(hashmap.get("show") != null && ((Boolean)hashmap.get("show")).booleanValue())
	//*   0    0:aload_2         
	//*   1    1:ldc1            #18  <String "show">
	//*   2    3:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//*   3    6:ifnull          25
	//*   4    9:aload_2         
	//*   5   10:ldc1            #18  <String "show">
	//*   6   12:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//*   7   15:checkcast       #137 <Class Boolean>
	//*   8   18:invokevirtual   #141 <Method boolean Boolean.booleanValue()>
	//*   9   21:ifeq            25
			return;
	//   10   24:return          
		_viewGroup = viewgroup;
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:putfield        #100 <Field ViewGroup _viewGroup>
		int j;
		if(hashmap.get("size") != null)
	//*  14   30:aload_2         
	//*  15   31:ldc1            #42  <String "size">
	//*  16   33:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//*  17   36:ifnull          56
			j = ((Integer)hashmap.get("size")).intValue();
	//   18   39:aload_2         
	//   19   40:ldc1            #42  <String "size">
	//   20   42:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//   21   45:checkcast       #143 <Class Integer>
	//   22   48:invokevirtual   #147 <Method int Integer.intValue()>
	//   23   51:istore          6
		else
	//*  24   53:goto            60
			j = 20;
	//   25   56:bipush          20
	//   26   58:istore          6
		int k;
		if(hashmap.get("offsetX") != null)
	//*  27   60:aload_2         
	//*  28   61:ldc1            #30  <String "offsetX">
	//*  29   63:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//*  30   66:ifnull          86
			k = ((Integer)hashmap.get("offsetX")).intValue();
	//   31   69:aload_2         
	//   32   70:ldc1            #30  <String "offsetX">
	//   33   72:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//   34   75:checkcast       #143 <Class Integer>
	//   35   78:invokevirtual   #147 <Method int Integer.intValue()>
	//   36   81:istore          7
		else
	//*  37   83:goto            89
			k = 0;
	//   38   86:iconst_0        
	//   39   87:istore          7
		int l;
		if(hashmap.get("offsetY") != null)
	//*  40   89:aload_2         
	//*  41   90:ldc1            #33  <String "offsetY">
	//*  42   92:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//*  43   95:ifnull          115
			l = ((Integer)hashmap.get("offsetY")).intValue();
	//   44   98:aload_2         
	//   45   99:ldc1            #33  <String "offsetY">
	//   46  101:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//   47  104:checkcast       #143 <Class Integer>
	//   48  107:invokevirtual   #147 <Method int Integer.intValue()>
	//   49  110:istore          8
		else
	//*  50  112:goto            118
			l = 0;
	//   51  115:iconst_0        
	//   52  116:istore          8
		int i;
		if(hashmap.get("activationOffset") != null)
	//*  53  118:aload_2         
	//*  54  119:ldc1            #27  <String "activationOffset">
	//*  55  121:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//*  56  124:ifnull          144
			i = ((Integer)hashmap.get("activationOffset")).intValue();
	//   57  127:aload_2         
	//   58  128:ldc1            #27  <String "activationOffset">
	//   59  130:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//   60  133:checkcast       #143 <Class Integer>
	//   61  136:invokevirtual   #147 <Method int Integer.intValue()>
	//   62  139:istore          5
		else
	//*  63  141:goto            147
			i = 3;
	//   64  144:iconst_3        
	//   65  145:istore          5
		Object obj = hashmap.get("initialAlpha");
	//   66  147:aload_2         
	//   67  148:ldc1            #24  <String "initialAlpha">
	//   68  150:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//   69  153:astore          9
		float f = 0.5F;
	//   70  155:ldc1            #148 <Float 0.5F>
	//   71  157:fstore_3        
		float f1;
		if(obj != null)
	//*  72  158:aload           9
	//*  73  160:ifnull          180
			f1 = ((Float)hashmap.get("initialAlpha")).floatValue();
	//   74  163:aload_2         
	//   75  164:ldc1            #24  <String "initialAlpha">
	//   76  166:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//   77  169:checkcast       #150 <Class Float>
	//   78  172:invokevirtual   #154 <Method float Float.floatValue()>
	//   79  175:fstore          4
		else
	//*  80  177:goto            184
			f1 = 0.5F;
	//   81  180:ldc1            #148 <Float 0.5F>
	//   82  182:fstore          4
		_close_initial_alpha = f1;
	//   83  184:aload_0         
	//   84  185:fload           4
	//   85  187:putfield        #81  <Field float _close_initial_alpha>
		if(hashmap.get("finalAlpha") != null)
	//*  86  190:aload_2         
	//*  87  191:ldc1            #15  <String "finalAlpha">
	//*  88  193:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//*  89  196:ifnull          216
			f1 = ((Float)hashmap.get("finalAlpha")).floatValue();
	//   90  199:aload_2         
	//   91  200:ldc1            #15  <String "finalAlpha">
	//   92  202:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//   93  205:checkcast       #150 <Class Float>
	//   94  208:invokevirtual   #154 <Method float Float.floatValue()>
	//   95  211:fstore          4
		else
	//*  96  213:goto            220
			f1 = 0.7F;
	//   97  216:ldc1            #155 <Float 0.7F>
	//   98  218:fstore          4
		_close_final_alpha = f1;
	//   99  220:aload_0         
	//  100  221:fload           4
	//  101  223:putfield        #84  <Field float _close_final_alpha>
		if(hashmap.get("tracking") != null)
	//* 102  226:aload_2         
	//* 103  227:ldc1            #45  <String "tracking">
	//* 104  229:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//* 105  232:ifnull          249
			obj = ((Object) ((ArrayList)hashmap.get("tracking")));
	//  106  235:aload_2         
	//  107  236:ldc1            #45  <String "tracking">
	//  108  238:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//  109  241:checkcast       #157 <Class ArrayList>
	//  110  244:astore          9
		else
	//* 111  246:goto            252
			obj = null;
	//  112  249:aconst_null     
	//  113  250:astore          9
		_close_trackingURLs = ((ArrayList) (obj));
	//  114  252:aload_0         
	//  115  253:aload           9
	//  116  255:putfield        #96  <Field ArrayList _close_trackingURLs>
		if(hashmap.get("image") != null)
	//* 117  258:aload_2         
	//* 118  259:ldc1            #21  <String "image">
	//* 119  261:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//* 120  264:ifnull          487
		{
			_close_image = new ImageView(viewgroup.getContext());
	//  121  267:aload_0         
	//  122  268:new             #125 <Class ImageView>
	//  123  271:dup             
	//  124  272:aload_1         
	//  125  273:invokevirtual   #163 <Method Context ViewGroup.getContext()>
	//  126  276:invokespecial   #166 <Method void ImageView(Context)>
	//  127  279:putfield        #92  <Field ImageView _close_image>
			Object obj1 = ((Object) (new android.widget.RelativeLayout.LayoutParams(VPUtilities.iPhoneXToAndroid(j), VPUtilities.iPhoneYToAndroid(j))));
	//  128  282:new             #168 <Class android.widget.RelativeLayout$LayoutParams>
	//  129  285:dup             
	//  130  286:iload           6
	//  131  288:invokestatic    #174 <Method int VPUtilities.iPhoneXToAndroid(int)>
	//  132  291:iload           6
	//  133  293:invokestatic    #177 <Method int VPUtilities.iPhoneYToAndroid(int)>
	//  134  296:invokespecial   #180 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//  135  299:astore          9
			((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
	//  136  301:aload           9
	//  137  303:bipush          10
	//  138  305:invokevirtual   #184 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
			((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(11);
	//  139  308:aload           9
	//  140  310:bipush          11
	//  141  312:invokevirtual   #184 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
			obj1.leftMargin = VPUtilities.iPhoneXToAndroid(k);
	//  142  315:aload           9
	//  143  317:iload           7
	//  144  319:invokestatic    #174 <Method int VPUtilities.iPhoneXToAndroid(int)>
	//  145  322:putfield        #188 <Field int android.widget.RelativeLayout$LayoutParams.leftMargin>
			obj1.topMargin = VPUtilities.iPhoneYToAndroid(l);
	//  146  325:aload           9
	//  147  327:iload           8
	//  148  329:invokestatic    #177 <Method int VPUtilities.iPhoneYToAndroid(int)>
	//  149  332:putfield        #191 <Field int android.widget.RelativeLayout$LayoutParams.topMargin>
			_close_image.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
	//  150  335:aload_0         
	//  151  336:getfield        #92  <Field ImageView _close_image>
	//  152  339:aload           9
	//  153  341:invokevirtual   #195 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			_close_image.setImageBitmap((Bitmap)hashmap.get("image"));
	//  154  344:aload_0         
	//  155  345:getfield        #92  <Field ImageView _close_image>
	//  156  348:aload_2         
	//  157  349:ldc1            #21  <String "image">
	//  158  351:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//  159  354:checkcast       #197 <Class Bitmap>
	//  160  357:invokevirtual   #201 <Method void ImageView.setImageBitmap(Bitmap)>
			obj1 = ((Object) (_close_image));
	//  161  360:aload_0         
	//  162  361:getfield        #92  <Field ImageView _close_image>
	//  163  364:astore          9
			if(hashmap.get("closeBackgroundColor") != null)
	//* 164  366:aload_2         
	//* 165  367:ldc1            #12  <String "closeBackgroundColor">
	//* 166  369:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//* 167  372:ifnull          392
				j = VPUtilities.getColorFromString((String)hashmap.get("closeBackgroundColor"));
	//  168  375:aload_2         
	//  169  376:ldc1            #12  <String "closeBackgroundColor">
	//  170  378:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//  171  381:checkcast       #203 <Class String>
	//  172  384:invokestatic    #207 <Method int VPUtilities.getColorFromString(String)>
	//  173  387:istore          6
			else
	//* 174  389:goto            395
				j = 0;
	//  175  392:iconst_0        
	//  176  393:istore          6
			((ImageView) (obj1)).setBackgroundColor(j);
	//  177  395:aload           9
	//  178  397:iload           6
	//  179  399:invokevirtual   #210 <Method void ImageView.setBackgroundColor(int)>
			if(hashmap.get("initialAlpha") != null)
	//* 180  402:aload_2         
	//* 181  403:ldc1            #24  <String "initialAlpha">
	//* 182  405:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//* 183  408:ifnull          424
				f = ((Float)hashmap.get("initialAlpha")).floatValue();
	//  184  411:aload_2         
	//  185  412:ldc1            #24  <String "initialAlpha">
	//  186  414:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//  187  417:checkcast       #150 <Class Float>
	//  188  420:invokevirtual   #154 <Method float Float.floatValue()>
	//  189  423:fstore_3        
			hashmap = ((HashMap) (new AlphaAnimation(f, f)));
	//  190  424:new             #103 <Class AlphaAnimation>
	//  191  427:dup             
	//  192  428:fload_3         
	//  193  429:fload_3         
	//  194  430:invokespecial   #106 <Method void AlphaAnimation(float, float)>
	//  195  433:astore_2        
			((AlphaAnimation) (hashmap)).setDuration(0L);
	//  196  434:aload_2         
	//  197  435:lconst_0        
	//  198  436:invokevirtual   #110 <Method void AlphaAnimation.setDuration(long)>
			((AlphaAnimation) (hashmap)).setFillAfter(true);
	//  199  439:aload_2         
	//  200  440:iconst_1        
	//  201  441:invokevirtual   #114 <Method void AlphaAnimation.setFillAfter(boolean)>
			_close_image.startAnimation(((android.view.animation.Animation) (hashmap)));
	//  202  444:aload_0         
	//  203  445:getfield        #92  <Field ImageView _close_image>
	//  204  448:aload_2         
	//  205  449:invokevirtual   #126 <Method void ImageView.startAnimation(android.view.animation.Animation)>
			_close_image.setEnabled(false);
	//  206  452:aload_0         
	//  207  453:getfield        #92  <Field ImageView _close_image>
	//  208  456:iconst_0        
	//  209  457:invokevirtual   #127 <Method void ImageView.setEnabled(boolean)>
			_current_alpha = f;
	//  210  460:aload_0         
	//  211  461:fload_3         
	//  212  462:putfield        #88  <Field float _current_alpha>
			viewgroup.addView(((View) (_close_image)));
	//  213  465:aload_1         
	//  214  466:aload_0         
	//  215  467:getfield        #92  <Field ImageView _close_image>
	//  216  470:invokevirtual   #214 <Method void ViewGroup.addView(View)>
			_close_image.setOnClickListener(closeTapped);
	//  217  473:aload_0         
	//  218  474:getfield        #92  <Field ImageView _close_image>
	//  219  477:aload_0         
	//  220  478:getfield        #72  <Field android.view.View$OnClickListener closeTapped>
	//  221  481:invokevirtual   #218 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		} else
	//* 222  484:goto            875
		{
			_close_button = new ProgressWheel(viewgroup.getContext());
	//  223  487:aload_0         
	//  224  488:new             #116 <Class ProgressWheel>
	//  225  491:dup             
	//  226  492:aload_1         
	//  227  493:invokevirtual   #163 <Method Context ViewGroup.getContext()>
	//  228  496:invokespecial   #219 <Method void ProgressWheel(Context)>
	//  229  499:putfield        #77  <Field ProgressWheel _close_button>
			Object obj2 = ((Object) (new android.widget.RelativeLayout.LayoutParams(VPUtilities.iPhoneXToAndroid(j), VPUtilities.iPhoneYToAndroid(j))));
	//  230  502:new             #168 <Class android.widget.RelativeLayout$LayoutParams>
	//  231  505:dup             
	//  232  506:iload           6
	//  233  508:invokestatic    #174 <Method int VPUtilities.iPhoneXToAndroid(int)>
	//  234  511:iload           6
	//  235  513:invokestatic    #177 <Method int VPUtilities.iPhoneYToAndroid(int)>
	//  236  516:invokespecial   #180 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//  237  519:astore          9
			((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(10);
	//  238  521:aload           9
	//  239  523:bipush          10
	//  240  525:invokevirtual   #184 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
			((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(11);
	//  241  528:aload           9
	//  242  530:bipush          11
	//  243  532:invokevirtual   #184 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
			obj2.leftMargin = VPUtilities.iPhoneXToAndroid(k);
	//  244  535:aload           9
	//  245  537:iload           7
	//  246  539:invokestatic    #174 <Method int VPUtilities.iPhoneXToAndroid(int)>
	//  247  542:putfield        #188 <Field int android.widget.RelativeLayout$LayoutParams.leftMargin>
			obj2.topMargin = VPUtilities.iPhoneYToAndroid(l);
	//  248  545:aload           9
	//  249  547:iload           8
	//  250  549:invokestatic    #177 <Method int VPUtilities.iPhoneYToAndroid(int)>
	//  251  552:putfield        #191 <Field int android.widget.RelativeLayout$LayoutParams.topMargin>
			_close_button.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj2)));
	//  252  555:aload_0         
	//  253  556:getfield        #77  <Field ProgressWheel _close_button>
	//  254  559:aload           9
	//  255  561:invokevirtual   #220 <Method void ProgressWheel.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			obj2 = ((Object) (_close_button));
	//  256  564:aload_0         
	//  257  565:getfield        #77  <Field ProgressWheel _close_button>
	//  258  568:astore          9
			if(hashmap.get("closeBackgroundColor") != null)
	//* 259  570:aload_2         
	//* 260  571:ldc1            #12  <String "closeBackgroundColor">
	//* 261  573:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//* 262  576:ifnull          596
				j = VPUtilities.getColorFromString((String)hashmap.get("closeBackgroundColor"));
	//  263  579:aload_2         
	//  264  580:ldc1            #12  <String "closeBackgroundColor">
	//  265  582:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//  266  585:checkcast       #203 <Class String>
	//  267  588:invokestatic    #207 <Method int VPUtilities.getColorFromString(String)>
	//  268  591:istore          6
			else
	//* 269  593:goto            599
				j = 0;
	//  270  596:iconst_0        
	//  271  597:istore          6
			((ProgressWheel) (obj2)).setBackgroundColor(j);
	//  272  599:aload           9
	//  273  601:iload           6
	//  274  603:invokevirtual   #221 <Method void ProgressWheel.setBackgroundColor(int)>
			obj2 = ((Object) (_close_button));
	//  275  606:aload_0         
	//  276  607:getfield        #77  <Field ProgressWheel _close_button>
	//  277  610:astore          9
			Object obj3 = hashmap.get("xColor");
	//  278  612:aload_2         
	//  279  613:ldc1            #48  <String "xColor">
	//  280  615:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//  281  618:astore          10
			k = 0xff888888;
	//  282  620:ldc1            #222 <Int 0xff888888>
	//  283  622:istore          7
			if(obj3 != null)
	//* 284  624:aload           10
	//* 285  626:ifnull          646
				j = VPUtilities.getColorFromString((String)hashmap.get("xColor"));
	//  286  629:aload_2         
	//  287  630:ldc1            #48  <String "xColor">
	//  288  632:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//  289  635:checkcast       #203 <Class String>
	//  290  638:invokestatic    #207 <Method int VPUtilities.getColorFromString(String)>
	//  291  641:istore          6
			else
	//* 292  643:goto            650
				j = 0xff888888;
	//  293  646:ldc1            #222 <Int 0xff888888>
	//  294  648:istore          6
			((ProgressWheel) (obj2)).setTextColor(j);
	//  295  650:aload           9
	//  296  652:iload           6
	//  297  654:invokevirtual   #225 <Method void ProgressWheel.setTextColor(int)>
			obj2 = ((Object) (_close_button));
	//  298  657:aload_0         
	//  299  658:getfield        #77  <Field ProgressWheel _close_button>
	//  300  661:astore          9
			j = k;
	//  301  663:iload           7
	//  302  665:istore          6
			if(hashmap.get("progressColor") != null)
	//* 303  667:aload_2         
	//* 304  668:ldc1            #36  <String "progressColor">
	//* 305  670:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//* 306  673:ifnull          690
				j = VPUtilities.getColorFromString((String)hashmap.get("progressColor"));
	//  307  676:aload_2         
	//  308  677:ldc1            #36  <String "progressColor">
	//  309  679:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//  310  682:checkcast       #203 <Class String>
	//  311  685:invokestatic    #207 <Method int VPUtilities.getColorFromString(String)>
	//  312  688:istore          6
			((ProgressWheel) (obj2)).setBarColor(j);
	//  313  690:aload           9
	//  314  692:iload           6
	//  315  694:invokevirtual   #228 <Method void ProgressWheel.setBarColor(int)>
			obj2 = ((Object) (_close_button));
	//  316  697:aload_0         
	//  317  698:getfield        #77  <Field ProgressWheel _close_button>
	//  318  701:astore          9
			if(hashmap.get("trackColor") != null)
	//* 319  703:aload_2         
	//* 320  704:ldc1            #39  <String "trackColor">
	//* 321  706:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//* 322  709:ifnull          729
				j = VPUtilities.getColorFromString((String)hashmap.get("trackColor"));
	//  323  712:aload_2         
	//  324  713:ldc1            #39  <String "trackColor">
	//  325  715:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//  326  718:checkcast       #203 <Class String>
	//  327  721:invokestatic    #207 <Method int VPUtilities.getColorFromString(String)>
	//  328  724:istore          6
			else
	//* 329  726:goto            733
				j = 0xffcccccc;
	//  330  729:ldc1            #229 <Int 0xffcccccc>
	//  331  731:istore          6
			((ProgressWheel) (obj2)).setRimColor(j);
	//  332  733:aload           9
	//  333  735:iload           6
	//  334  737:invokevirtual   #232 <Method void ProgressWheel.setRimColor(int)>
			_close_button.setText("X");
	//  335  740:aload_0         
	//  336  741:getfield        #77  <Field ProgressWheel _close_button>
	//  337  744:ldc1            #234 <String "X">
	//  338  746:invokevirtual   #238 <Method void ProgressWheel.setText(String)>
			_close_button.setBarWidth(2);
	//  339  749:aload_0         
	//  340  750:getfield        #77  <Field ProgressWheel _close_button>
	//  341  753:iconst_2        
	//  342  754:invokevirtual   #241 <Method void ProgressWheel.setBarWidth(int)>
			_close_button.setRimWidth(2);
	//  343  757:aload_0         
	//  344  758:getfield        #77  <Field ProgressWheel _close_button>
	//  345  761:iconst_2        
	//  346  762:invokevirtual   #244 <Method void ProgressWheel.setRimWidth(int)>
			if(hashmap.get("initialAlpha") != null)
	//* 347  765:aload_2         
	//* 348  766:ldc1            #24  <String "initialAlpha">
	//* 349  768:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//* 350  771:ifnull          787
				f = ((Float)hashmap.get("initialAlpha")).floatValue();
	//  351  774:aload_2         
	//  352  775:ldc1            #24  <String "initialAlpha">
	//  353  777:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//  354  780:checkcast       #150 <Class Float>
	//  355  783:invokevirtual   #154 <Method float Float.floatValue()>
	//  356  786:fstore_3        
			hashmap = ((HashMap) (new AlphaAnimation(f, f)));
	//  357  787:new             #103 <Class AlphaAnimation>
	//  358  790:dup             
	//  359  791:fload_3         
	//  360  792:fload_3         
	//  361  793:invokespecial   #106 <Method void AlphaAnimation(float, float)>
	//  362  796:astore_2        
			((AlphaAnimation) (hashmap)).setDuration(0L);
	//  363  797:aload_2         
	//  364  798:lconst_0        
	//  365  799:invokevirtual   #110 <Method void AlphaAnimation.setDuration(long)>
			((AlphaAnimation) (hashmap)).setFillAfter(true);
	//  366  802:aload_2         
	//  367  803:iconst_1        
	//  368  804:invokevirtual   #114 <Method void AlphaAnimation.setFillAfter(boolean)>
			_close_button.startAnimation(((android.view.animation.Animation) (hashmap)));
	//  369  807:aload_0         
	//  370  808:getfield        #77  <Field ProgressWheel _close_button>
	//  371  811:aload_2         
	//  372  812:invokevirtual   #120 <Method void ProgressWheel.startAnimation(android.view.animation.Animation)>
			_close_button.setEnabled(false);
	//  373  815:aload_0         
	//  374  816:getfield        #77  <Field ProgressWheel _close_button>
	//  375  819:iconst_0        
	//  376  820:invokevirtual   #123 <Method void ProgressWheel.setEnabled(boolean)>
			_current_alpha = f;
	//  377  823:aload_0         
	//  378  824:fload_3         
	//  379  825:putfield        #88  <Field float _current_alpha>
			_close_button.setDelayMillis(Math.round((i * 1000) / 180));
	//  380  828:aload_0         
	//  381  829:getfield        #77  <Field ProgressWheel _close_button>
	//  382  832:iload           5
	//  383  834:sipush          1000
	//  384  837:imul            
	//  385  838:sipush          180
	//  386  841:idiv            
	//  387  842:i2f             
	//  388  843:invokestatic    #250 <Method int Math.round(float)>
	//  389  846:invokevirtual   #253 <Method void ProgressWheel.setDelayMillis(int)>
			_close_button.spinOnce();
	//  390  849:aload_0         
	//  391  850:getfield        #77  <Field ProgressWheel _close_button>
	//  392  853:invokevirtual   #256 <Method void ProgressWheel.spinOnce()>
			viewgroup.addView(((View) (_close_button)));
	//  393  856:aload_1         
	//  394  857:aload_0         
	//  395  858:getfield        #77  <Field ProgressWheel _close_button>
	//  396  861:invokevirtual   #214 <Method void ViewGroup.addView(View)>
			_close_button.setOnClickListener(closeTapped);
	//  397  864:aload_0         
	//  398  865:getfield        #77  <Field ProgressWheel _close_button>
	//  399  868:aload_0         
	//  400  869:getfield        #72  <Field android.view.View$OnClickListener closeTapped>
	//  401  872:invokevirtual   #257 <Method void ProgressWheel.setOnClickListener(android.view.View$OnClickListener)>
		}
		APSMediaPlayer.getInstance().getHandler().postDelayed(new Runnable() {

			public void run()
			{
				if(_close_button != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field APSMediaPlayerClosableOverlayController this$0>
			//*   2    4:invokestatic    #26  <Method ProgressWheel APSMediaPlayerClosableOverlayController.access$000(APSMediaPlayerClosableOverlayController)>
			//*   3    7:ifnull          79
				{
					Object obj4 = ((Object) (new AlphaAnimation(_close_initial_alpha, _close_final_alpha)));
			//    4   10:new             #28  <Class AlphaAnimation>
			//    5   13:dup             
			//    6   14:aload_0         
			//    7   15:getfield        #17  <Field APSMediaPlayerClosableOverlayController this$0>
			//    8   18:invokestatic    #32  <Method float APSMediaPlayerClosableOverlayController.access$100(APSMediaPlayerClosableOverlayController)>
			//    9   21:aload_0         
			//   10   22:getfield        #17  <Field APSMediaPlayerClosableOverlayController this$0>
			//   11   25:invokestatic    #35  <Method float APSMediaPlayerClosableOverlayController.access$200(APSMediaPlayerClosableOverlayController)>
			//   12   28:invokespecial   #38  <Method void AlphaAnimation(float, float)>
			//   13   31:astore_1        
					((AlphaAnimation) (obj4)).setDuration(0L);
			//   14   32:aload_1         
			//   15   33:lconst_0        
			//   16   34:invokevirtual   #42  <Method void AlphaAnimation.setDuration(long)>
					((AlphaAnimation) (obj4)).setFillAfter(true);
			//   17   37:aload_1         
			//   18   38:iconst_1        
			//   19   39:invokevirtual   #46  <Method void AlphaAnimation.setFillAfter(boolean)>
					_close_button.startAnimation(((android.view.animation.Animation) (obj4)));
			//   20   42:aload_0         
			//   21   43:getfield        #17  <Field APSMediaPlayerClosableOverlayController this$0>
			//   22   46:invokestatic    #26  <Method ProgressWheel APSMediaPlayerClosableOverlayController.access$000(APSMediaPlayerClosableOverlayController)>
			//   23   49:aload_1         
			//   24   50:invokevirtual   #52  <Method void ProgressWheel.startAnimation(android.view.animation.Animation)>
					obj4 = ((Object) (APSMediaPlayerClosableOverlayController.this));
			//   25   53:aload_0         
			//   26   54:getfield        #17  <Field APSMediaPlayerClosableOverlayController this$0>
			//   27   57:astore_1        
					obj4._current_alpha = ((APSMediaPlayerClosableOverlayController) (obj4))._close_final_alpha;
			//   28   58:aload_1         
			//   29   59:aload_1         
			//   30   60:invokestatic    #35  <Method float APSMediaPlayerClosableOverlayController.access$200(APSMediaPlayerClosableOverlayController)>
			//   31   63:invokestatic    #56  <Method float APSMediaPlayerClosableOverlayController.access$302(APSMediaPlayerClosableOverlayController, float)>
			//   32   66:pop             
					_close_button.setEnabled(true);
			//   33   67:aload_0         
			//   34   68:getfield        #17  <Field APSMediaPlayerClosableOverlayController this$0>
			//   35   71:invokestatic    #26  <Method ProgressWheel APSMediaPlayerClosableOverlayController.access$000(APSMediaPlayerClosableOverlayController)>
			//   36   74:iconst_1        
			//   37   75:invokevirtual   #59  <Method void ProgressWheel.setEnabled(boolean)>
					return;
			//   38   78:return          
				} else
				{
					Object obj5 = ((Object) (new AlphaAnimation(_close_initial_alpha, _close_final_alpha)));
			//   39   79:new             #28  <Class AlphaAnimation>
			//   40   82:dup             
			//   41   83:aload_0         
			//   42   84:getfield        #17  <Field APSMediaPlayerClosableOverlayController this$0>
			//   43   87:invokestatic    #32  <Method float APSMediaPlayerClosableOverlayController.access$100(APSMediaPlayerClosableOverlayController)>
			//   44   90:aload_0         
			//   45   91:getfield        #17  <Field APSMediaPlayerClosableOverlayController this$0>
			//   46   94:invokestatic    #35  <Method float APSMediaPlayerClosableOverlayController.access$200(APSMediaPlayerClosableOverlayController)>
			//   47   97:invokespecial   #38  <Method void AlphaAnimation(float, float)>
			//   48  100:astore_1        
					((AlphaAnimation) (obj5)).setDuration(0L);
			//   49  101:aload_1         
			//   50  102:lconst_0        
			//   51  103:invokevirtual   #42  <Method void AlphaAnimation.setDuration(long)>
					((AlphaAnimation) (obj5)).setFillAfter(true);
			//   52  106:aload_1         
			//   53  107:iconst_1        
			//   54  108:invokevirtual   #46  <Method void AlphaAnimation.setFillAfter(boolean)>
					_close_image.startAnimation(((android.view.animation.Animation) (obj5)));
			//   55  111:aload_0         
			//   56  112:getfield        #17  <Field APSMediaPlayerClosableOverlayController this$0>
			//   57  115:invokestatic    #63  <Method ImageView APSMediaPlayerClosableOverlayController.access$400(APSMediaPlayerClosableOverlayController)>
			//   58  118:aload_1         
			//   59  119:invokevirtual   #66  <Method void ImageView.startAnimation(android.view.animation.Animation)>
					obj5 = ((Object) (APSMediaPlayerClosableOverlayController.this));
			//   60  122:aload_0         
			//   61  123:getfield        #17  <Field APSMediaPlayerClosableOverlayController this$0>
			//   62  126:astore_1        
					obj5._current_alpha = ((APSMediaPlayerClosableOverlayController) (obj5))._close_final_alpha;
			//   63  127:aload_1         
			//   64  128:aload_1         
			//   65  129:invokestatic    #35  <Method float APSMediaPlayerClosableOverlayController.access$200(APSMediaPlayerClosableOverlayController)>
			//   66  132:invokestatic    #56  <Method float APSMediaPlayerClosableOverlayController.access$302(APSMediaPlayerClosableOverlayController, float)>
			//   67  135:pop             
					_close_image.setEnabled(true);
			//   68  136:aload_0         
			//   69  137:getfield        #17  <Field APSMediaPlayerClosableOverlayController this$0>
			//   70  140:invokestatic    #63  <Method ImageView APSMediaPlayerClosableOverlayController.access$400(APSMediaPlayerClosableOverlayController)>
			//   71  143:iconst_1        
			//   72  144:invokevirtual   #67  <Method void ImageView.setEnabled(boolean)>
					return;
			//   73  147:return          
				}
			}

			final APSMediaPlayerClosableOverlayController this$0;

			
			{
				this$0 = APSMediaPlayerClosableOverlayController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayerClosableOverlayController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
, i * 1000);
	//  402  875:invokestatic    #263 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//  403  878:invokevirtual   #267 <Method Handler APSMediaPlayer.getHandler()>
	//  404  881:new             #6   <Class APSMediaPlayerClosableOverlayController$1>
	//  405  884:dup             
	//  406  885:aload_0         
	//  407  886:invokespecial   #268 <Method void APSMediaPlayerClosableOverlayController$1(APSMediaPlayerClosableOverlayController)>
	//  408  889:iload           5
	//  409  891:sipush          1000
	//  410  894:imul            
	//  411  895:i2l             
	//  412  896:invokevirtual   #274 <Method boolean Handler.postDelayed(Runnable, long)>
	//  413  899:pop             
	//  414  900:return          
	}

	public void addViewToContainer(ViewGroup viewgroup)
	{
	//    0    0:return          
	}

	public float getAlpha()
	{
		return _current_alpha;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field float _current_alpha>
	//    2    4:freturn         
	}

	public View getView()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void hideOverlay()
	{
	//    0    0:return          
	}

	public void load(Context context)
	{
	//    0    0:return          
	}

	public void removeCloseButton()
	{
		ProgressWheel progresswheel = _close_button;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field ProgressWheel _close_button>
	//    2    4:astore_1        
		if(progresswheel != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			_viewGroup.removeView(((View) (progresswheel)));
	//    5    9:aload_0         
	//    6   10:getfield        #100 <Field ViewGroup _viewGroup>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #287 <Method void ViewGroup.removeView(View)>
			return;
	//    9   17:return          
		} else
		{
			_viewGroup.removeView(((View) (_close_image)));
	//   10   18:aload_0         
	//   11   19:getfield        #100 <Field ViewGroup _viewGroup>
	//   12   22:aload_0         
	//   13   23:getfield        #92  <Field ImageView _close_image>
	//   14   26:invokevirtual   #287 <Method void ViewGroup.removeView(View)>
			return;
	//   15   29:return          
		}
	}

	public String type()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public static final String kAPSCloseBackgroundColor = "closeBackgroundColor";
	public static final String kAPSCloseFinalAlpha = "finalAlpha";
	public static final String kAPSCloseHidden = "show";
	public static final String kAPSCloseImage = "image";
	public static final String kAPSCloseInitialAlpha = "initialAlpha";
	public static final String kAPSCloseOffset = "activationOffset";
	public static final String kAPSCloseOffsetX = "offsetX";
	public static final String kAPSCloseOffsetY = "offsetY";
	public static final String kAPSCloseProgressColor = "progressColor";
	public static final String kAPSCloseProgressTrackColor = "trackColor";
	public static final String kAPSCloseSize = "size";
	public static final String kAPSCloseTrackingURLs = "tracking";
	public static final String kAPSCloseXColor = "xColor";
	private ProgressWheel _close_button;
	private float _close_final_alpha;
	private ImageView _close_image;
	private float _close_initial_alpha;
	private ArrayList _close_trackingURLs;
	private float _current_alpha;
	private ViewGroup _viewGroup;
	private android.view.View.OnClickListener closeTapped;


/*
	static ProgressWheel access$000(APSMediaPlayerClosableOverlayController apsmediaplayerclosableoverlaycontroller)
	{
		return apsmediaplayerclosableoverlaycontroller._close_button;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field ProgressWheel _close_button>
	//    2    4:areturn         
	}

*/


/*
	static float access$100(APSMediaPlayerClosableOverlayController apsmediaplayerclosableoverlaycontroller)
	{
		return apsmediaplayerclosableoverlaycontroller._close_initial_alpha;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field float _close_initial_alpha>
	//    2    4:freturn         
	}

*/


/*
	static float access$200(APSMediaPlayerClosableOverlayController apsmediaplayerclosableoverlaycontroller)
	{
		return apsmediaplayerclosableoverlaycontroller._close_final_alpha;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field float _close_final_alpha>
	//    2    4:freturn         
	}

*/


/*
	static float access$302(APSMediaPlayerClosableOverlayController apsmediaplayerclosableoverlaycontroller, float f)
	{
		apsmediaplayerclosableoverlaycontroller._current_alpha = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #88  <Field float _current_alpha>
		return f;
	//    3    5:fload_1         
	//    4    6:freturn         
	}

*/


/*
	static ImageView access$400(APSMediaPlayerClosableOverlayController apsmediaplayerclosableoverlaycontroller)
	{
		return apsmediaplayerclosableoverlaycontroller._close_image;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field ImageView _close_image>
	//    2    4:areturn         
	}

*/


/*
	static ArrayList access$500(APSMediaPlayerClosableOverlayController apsmediaplayerclosableoverlaycontroller)
	{
		return apsmediaplayerclosableoverlaycontroller._close_trackingURLs;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field ArrayList _close_trackingURLs>
	//    2    4:areturn         
	}

*/


/*
	static ViewGroup access$600(APSMediaPlayerClosableOverlayController apsmediaplayerclosableoverlaycontroller)
	{
		return apsmediaplayerclosableoverlaycontroller._viewGroup;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field ViewGroup _viewGroup>
	//    2    4:areturn         
	}

*/
}
