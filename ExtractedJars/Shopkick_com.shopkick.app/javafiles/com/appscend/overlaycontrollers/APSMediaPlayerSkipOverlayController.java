// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appscend.media.APSMediaPlayer;
import com.appscend.media.events.APSMediaOverlay;
import com.appscend.utilities.ProgressWheel;
import com.appscend.utilities.VPUtilities;
import java.util.HashMap;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerOverlayController

public class APSMediaPlayerSkipOverlayController extends APSMediaPlayerOverlayController
{
	public static final class APSSkipOverlayProgressPosition extends Enum
	{

		public static APSSkipOverlayProgressPosition valueOf(String s)
		{
			return (APSSkipOverlayProgressPosition)Enum.valueOf(com/appscend/overlaycontrollers/APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition, s);
		//    0    0:ldc1            #2   <Class APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition>
		//    4    9:areturn         
		}

		public static APSSkipOverlayProgressPosition[] values()
		{
			return (APSSkipOverlayProgressPosition[])((APSSkipOverlayProgressPosition []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.appscend.overlaycontrollers.APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition_3B_.clone()>
		//    2    6:checkcast       #42  <Class APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition[]>
		//    3    9:areturn         
		}

		private static final APSSkipOverlayProgressPosition $VALUES[];
		public static final APSSkipOverlayProgressPosition kAPSSkipOverlayProgressPositionHidden;
		public static final APSSkipOverlayProgressPosition kAPSSkipOverlayProgressPositionLeft;
		public static final APSSkipOverlayProgressPosition kAPSSkipOverlayProgressPositionRight;

		static 
		{
			kAPSSkipOverlayProgressPositionLeft = new APSSkipOverlayProgressPosition("kAPSSkipOverlayProgressPositionLeft", 0);
		//    0    0:new             #2   <Class APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "kAPSSkipOverlayProgressPositionLeft">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition(String, int)>
		//    5   10:putstatic       #23  <Field APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition kAPSSkipOverlayProgressPositionLeft>
			kAPSSkipOverlayProgressPositionRight = new APSSkipOverlayProgressPosition("kAPSSkipOverlayProgressPositionRight", 1);
		//    6   13:new             #2   <Class APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "kAPSSkipOverlayProgressPositionRight">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition(String, int)>
		//   11   23:putstatic       #26  <Field APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition kAPSSkipOverlayProgressPositionRight>
			kAPSSkipOverlayProgressPositionHidden = new APSSkipOverlayProgressPosition("kAPSSkipOverlayProgressPositionHidden", 2);
		//   12   26:new             #2   <Class APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "kAPSSkipOverlayProgressPositionHidden">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition(String, int)>
		//   17   36:putstatic       #29  <Field APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition kAPSSkipOverlayProgressPositionHidden>
			$VALUES = (new APSSkipOverlayProgressPosition[] {
				kAPSSkipOverlayProgressPositionLeft, kAPSSkipOverlayProgressPositionRight, kAPSSkipOverlayProgressPositionHidden
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       APSSkipOverlayProgressPosition[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition kAPSSkipOverlayProgressPositionLeft>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition kAPSSkipOverlayProgressPositionRight>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition kAPSSkipOverlayProgressPositionHidden>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition[] $VALUES>
		//*  33   64:return          
		}

		private APSSkipOverlayProgressPosition(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public APSMediaPlayerSkipOverlayController()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method void APSMediaPlayerOverlayController()>
		_animationStarted = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #63  <Field boolean _animationStarted>
	//    5    9:return          
	}

	private void setCountdownFinished()
	{
		_skip_button.setText("");
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field ProgressWheel _skip_button>
	//    2    4:ldc1            #69  <String "">
	//    3    6:invokevirtual   #75  <Method void ProgressWheel.setText(String)>
		_skip_button.setBackgroundResource(com.appscend.vastplayer.R.drawable.veeplay_skip);
	//    4    9:aload_0         
	//    5   10:getfield        #67  <Field ProgressWheel _skip_button>
	//    6   13:getstatic       #80  <Field int com.appscend.vastplayer.R$drawable.veeplay_skip>
	//    7   16:invokevirtual   #84  <Method void ProgressWheel.setBackgroundResource(int)>
	//    8   19:return          
	}

	public void addViewToContainer(ViewGroup viewgroup)
	{
		android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)_viewHolder.getLayoutParams();
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field RelativeLayout _viewHolder>
	//    2    4:invokevirtual   #94  <Method android.view.ViewGroup$LayoutParams RelativeLayout.getLayoutParams()>
	//    3    7:checkcast       #96  <Class android.widget.RelativeLayout$LayoutParams>
	//    4   10:astore_2        
		layoutparams.bottomMargin = VPUtilities.iPhoneYToAndroid(5);
	//    5   11:aload_2         
	//    6   12:iconst_5        
	//    7   13:invokestatic    #102 <Method int VPUtilities.iPhoneYToAndroid(int)>
	//    8   16:putfield        #105 <Field int android.widget.RelativeLayout$LayoutParams.bottomMargin>
		layoutparams.rightMargin = VPUtilities.iPhoneXToAndroid(5);
	//    9   19:aload_2         
	//   10   20:iconst_5        
	//   11   21:invokestatic    #108 <Method int VPUtilities.iPhoneXToAndroid(int)>
	//   12   24:putfield        #111 <Field int android.widget.RelativeLayout$LayoutParams.rightMargin>
		viewgroup.addView(((View) (_viewHolder)));
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #88  <Field RelativeLayout _viewHolder>
	//   16   32:invokevirtual   #117 <Method void ViewGroup.addView(View)>
	//   17   35:return          
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
	//    1    1:getfield        #88  <Field RelativeLayout _viewHolder>
	//    2    4:areturn         
	}

	public void hideOverlay()
	{
		_viewHolder.removeAllViews();
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field RelativeLayout _viewHolder>
	//    2    4:invokevirtual   #125 <Method void RelativeLayout.removeAllViews()>
	//    3    7:return          
	}

	public void load(Context context)
	{
		_offset = Integer.parseInt(overlay.parameters.get("defaultOffset").toString());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #134 <Field APSMediaOverlay overlay>
	//    3    5:getfield        #140 <Field HashMap APSMediaOverlay.parameters>
	//    4    8:ldc1            #25  <String "defaultOffset">
	//    5   10:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//    6   13:invokevirtual   #152 <Method String Object.toString()>
	//    7   16:invokestatic    #158 <Method int Integer.parseInt(String)>
	//    8   19:putfield        #160 <Field int _offset>
		int i;
		if(overlay.parameters.get("radius") != null)
	//*   9   22:aload_0         
	//*  10   23:getfield        #134 <Field APSMediaOverlay overlay>
	//*  11   26:getfield        #140 <Field HashMap APSMediaOverlay.parameters>
	//*  12   29:ldc1            #19  <String "radius">
	//*  13   31:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//*  14   34:ifnull          59
			i = ((Integer)overlay.parameters.get("radius")).intValue();
	//   15   37:aload_0         
	//   16   38:getfield        #134 <Field APSMediaOverlay overlay>
	//   17   41:getfield        #140 <Field HashMap APSMediaOverlay.parameters>
	//   18   44:ldc1            #19  <String "radius">
	//   19   46:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//   20   49:checkcast       #154 <Class Integer>
	//   21   52:invokevirtual   #164 <Method int Integer.intValue()>
	//   22   55:istore_2        
		else
	//*  23   56:goto            62
			i = 10;
	//   24   59:bipush          10
	//   25   61:istore_2        
		_radius = i;
	//   26   62:aload_0         
	//   27   63:iload_2         
	//   28   64:putfield        #166 <Field int _radius>
		if(overlay.parameters.get("color") != null)
	//*  29   67:aload_0         
	//*  30   68:getfield        #134 <Field APSMediaOverlay overlay>
	//*  31   71:getfield        #140 <Field HashMap APSMediaOverlay.parameters>
	//*  32   74:ldc1            #22  <String "color">
	//*  33   76:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//*  34   79:ifnull          104
			i = Color.parseColor((String)overlay.parameters.get("color"));
	//   35   82:aload_0         
	//   36   83:getfield        #134 <Field APSMediaOverlay overlay>
	//   37   86:getfield        #140 <Field HashMap APSMediaOverlay.parameters>
	//   38   89:ldc1            #22  <String "color">
	//   39   91:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//   40   94:checkcast       #168 <Class String>
	//   41   97:invokestatic    #173 <Method int Color.parseColor(String)>
	//   42  100:istore_2        
		else
	//*  43  101:goto            106
			i = 0;
	//   44  104:iconst_0        
	//   45  105:istore_2        
		_bgcolor = i;
	//   46  106:aload_0         
	//   47  107:iload_2         
	//   48  108:putfield        #175 <Field int _bgcolor>
		_viewHolder = new RelativeLayout(context);
	//   49  111:aload_0         
	//   50  112:new             #90  <Class RelativeLayout>
	//   51  115:dup             
	//   52  116:aload_1         
	//   53  117:invokespecial   #177 <Method void RelativeLayout(Context)>
	//   54  120:putfield        #88  <Field RelativeLayout _viewHolder>
		_textView = new TextView(context);
	//   55  123:aload_0         
	//   56  124:new             #179 <Class TextView>
	//   57  127:dup             
	//   58  128:aload_1         
	//   59  129:invokespecial   #180 <Method void TextView(Context)>
	//   60  132:putfield        #182 <Field TextView _textView>
		_skip_button = new ProgressWheel(context);
	//   61  135:aload_0         
	//   62  136:new             #71  <Class ProgressWheel>
	//   63  139:dup             
	//   64  140:aload_1         
	//   65  141:invokespecial   #183 <Method void ProgressWheel(Context)>
	//   66  144:putfield        #67  <Field ProgressWheel _skip_button>
		Object obj;
		if(overlay.parameters.get("position") != null)
	//*  67  147:aload_0         
	//*  68  148:getfield        #134 <Field APSMediaOverlay overlay>
	//*  69  151:getfield        #140 <Field HashMap APSMediaOverlay.parameters>
	//*  70  154:ldc1            #34  <String "position">
	//*  71  156:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//*  72  159:ifnull          182
			obj = ((Object) ((APSSkipOverlayProgressPosition)overlay.parameters.get("position")));
	//   73  162:aload_0         
	//   74  163:getfield        #134 <Field APSMediaOverlay overlay>
	//   75  166:getfield        #140 <Field HashMap APSMediaOverlay.parameters>
	//   76  169:ldc1            #34  <String "position">
	//   77  171:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//   78  174:checkcast       #8   <Class APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition>
	//   79  177:astore          5
		else
	//*  80  179:goto            187
			obj = ((Object) (APSSkipOverlayProgressPosition.kAPSSkipOverlayProgressPositionRight));
	//   81  182:getstatic       #187 <Field APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition.kAPSSkipOverlayProgressPositionRight>
	//   82  185:astore          5
		Object obj1 = ((Object) (new android.widget.RelativeLayout.LayoutParams(-2, -2)));
	//   83  187:new             #96  <Class android.widget.RelativeLayout$LayoutParams>
	//   84  190:dup             
	//   85  191:bipush          -2
	//   86  193:bipush          -2
	//   87  195:invokespecial   #190 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   88  198:astore          6
		if(_offset == 0)
	//*  89  200:aload_0         
	//*  90  201:getfield        #160 <Field int _offset>
	//*  91  204:ifne            217
			((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(13);
	//   92  207:aload           6
	//   93  209:bipush          13
	//   94  211:invokevirtual   #193 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
		else
	//*  95  214:goto            260
		if(obj == APSSkipOverlayProgressPosition.kAPSSkipOverlayProgressPositionLeft)
	//*  96  217:aload           5
	//*  97  219:getstatic       #196 <Field APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition.kAPSSkipOverlayProgressPositionLeft>
	//*  98  222:if_acmpne       244
		{
			((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(11);
	//   99  225:aload           6
	//  100  227:bipush          11
	//  101  229:invokevirtual   #193 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
			((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(1, com.appscend.vastplayer.R.id.skipbutton);
	//  102  232:aload           6
	//  103  234:iconst_1        
	//  104  235:getstatic       #201 <Field int com.appscend.vastplayer.R$id.skipbutton>
	//  105  238:invokevirtual   #203 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int, int)>
		} else
	//* 106  241:goto            260
		{
			((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(9);
	//  107  244:aload           6
	//  108  246:bipush          9
	//  109  248:invokevirtual   #193 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
			((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(0, com.appscend.vastplayer.R.id.skipbutton);
	//  110  251:aload           6
	//  111  253:iconst_0        
	//  112  254:getstatic       #201 <Field int com.appscend.vastplayer.R$id.skipbutton>
	//  113  257:invokevirtual   #203 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int, int)>
		}
		((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(15);
	//  114  260:aload           6
	//  115  262:bipush          15
	//  116  264:invokevirtual   #193 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
		obj1.leftMargin = 5;
	//  117  267:aload           6
	//  118  269:iconst_5        
	//  119  270:putfield        #206 <Field int android.widget.RelativeLayout$LayoutParams.leftMargin>
		obj1.rightMargin = 5;
	//  120  273:aload           6
	//  121  275:iconst_5        
	//  122  276:putfield        #111 <Field int android.widget.RelativeLayout$LayoutParams.rightMargin>
		_textView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
	//  123  279:aload_0         
	//  124  280:getfield        #182 <Field TextView _textView>
	//  125  283:aload           6
	//  126  285:invokevirtual   #210 <Method void TextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		if(overlay.parameters.get("text") != null)
	//* 127  288:aload_0         
	//* 128  289:getfield        #134 <Field APSMediaOverlay overlay>
	//* 129  292:getfield        #140 <Field HashMap APSMediaOverlay.parameters>
	//* 130  295:ldc1            #43  <String "text">
	//* 131  297:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//* 132  300:ifnull          323
			obj1 = ((Object) ((String)overlay.parameters.get("text")));
	//  133  303:aload_0         
	//  134  304:getfield        #134 <Field APSMediaOverlay overlay>
	//  135  307:getfield        #140 <Field HashMap APSMediaOverlay.parameters>
	//  136  310:ldc1            #43  <String "text">
	//  137  312:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//  138  315:checkcast       #168 <Class String>
	//  139  318:astore          6
		else
	//* 140  320:goto            327
			obj1 = "Skip";
	//  141  323:ldc1            #212 <String "Skip">
	//  142  325:astore          6
		_textTemplate = ((String) (obj1));
	//  143  327:aload_0         
	//  144  328:aload           6
	//  145  330:putfield        #214 <Field String _textTemplate>
		_textView.setText(((CharSequence) (_textTemplate.replace("__remaining__", ""))));
	//  146  333:aload_0         
	//  147  334:getfield        #182 <Field TextView _textView>
	//  148  337:aload_0         
	//  149  338:getfield        #214 <Field String _textTemplate>
	//  150  341:ldc1            #216 <String "__remaining__">
	//  151  343:ldc1            #69  <String "">
	//  152  345:invokevirtual   #220 <Method String String.replace(CharSequence, CharSequence)>
	//  153  348:invokevirtual   #223 <Method void TextView.setText(CharSequence)>
		_textView.setTextSize(14F);
	//  154  351:aload_0         
	//  155  352:getfield        #182 <Field TextView _textView>
	//  156  355:ldc1            #224 <Float 14F>
	//  157  357:invokevirtual   #228 <Method void TextView.setTextSize(float)>
		obj1 = overlay.parameters.get("textColor");
	//  158  360:aload_0         
	//  159  361:getfield        #134 <Field APSMediaOverlay overlay>
	//  160  364:getfield        #140 <Field HashMap APSMediaOverlay.parameters>
	//  161  367:ldc1            #37  <String "textColor">
	//  162  369:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//  163  372:astore          6
		byte byte0 = -1;
	//  164  374:iconst_m1       
	//  165  375:istore_3        
		if(obj1 != null)
	//* 166  376:aload           6
	//* 167  378:ifnull          409
			_textView.setTextColor(VPUtilities.getColorFromString((String)overlay.parameters.get("textColor")));
	//  168  381:aload_0         
	//  169  382:getfield        #182 <Field TextView _textView>
	//  170  385:aload_0         
	//  171  386:getfield        #134 <Field APSMediaOverlay overlay>
	//  172  389:getfield        #140 <Field HashMap APSMediaOverlay.parameters>
	//  173  392:ldc1            #37  <String "textColor">
	//  174  394:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//  175  397:checkcast       #168 <Class String>
	//  176  400:invokestatic    #231 <Method int VPUtilities.getColorFromString(String)>
	//  177  403:invokevirtual   #234 <Method void TextView.setTextColor(int)>
		else
	//* 178  406:goto            417
			_textView.setTextColor(-1);
	//  179  409:aload_0         
	//  180  410:getfield        #182 <Field TextView _textView>
	//  181  413:iconst_m1       
	//  182  414:invokevirtual   #234 <Method void TextView.setTextColor(int)>
		_textView.setMaxLines(1);
	//  183  417:aload_0         
	//  184  418:getfield        #182 <Field TextView _textView>
	//  185  421:iconst_1        
	//  186  422:invokevirtual   #237 <Method void TextView.setMaxLines(int)>
		_textView.setGravity(17);
	//  187  425:aload_0         
	//  188  426:getfield        #182 <Field TextView _textView>
	//  189  429:bipush          17
	//  190  431:invokevirtual   #240 <Method void TextView.setGravity(int)>
		obj1 = ((Object) (new android.widget.RelativeLayout.LayoutParams(VPUtilities.pixelsToDip(30, context), VPUtilities.pixelsToDip(30, context))));
	//  191  434:new             #96  <Class android.widget.RelativeLayout$LayoutParams>
	//  192  437:dup             
	//  193  438:bipush          30
	//  194  440:aload_1         
	//  195  441:invokestatic    #244 <Method int VPUtilities.pixelsToDip(int, Context)>
	//  196  444:bipush          30
	//  197  446:aload_1         
	//  198  447:invokestatic    #244 <Method int VPUtilities.pixelsToDip(int, Context)>
	//  199  450:invokespecial   #190 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//  200  453:astore          6
		if(obj == APSSkipOverlayProgressPosition.kAPSSkipOverlayProgressPositionLeft)
	//* 201  455:aload           5
	//* 202  457:getstatic       #196 <Field APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition.kAPSSkipOverlayProgressPositionLeft>
	//* 203  460:if_acmpne       484
		{
			((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(9);
	//  204  463:aload           6
	//  205  465:bipush          9
	//  206  467:invokevirtual   #193 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
			obj1.leftMargin = VPUtilities.pixelsToDip(10, context);
	//  207  470:aload           6
	//  208  472:bipush          10
	//  209  474:aload_1         
	//  210  475:invokestatic    #244 <Method int VPUtilities.pixelsToDip(int, Context)>
	//  211  478:putfield        #206 <Field int android.widget.RelativeLayout$LayoutParams.leftMargin>
		} else
	//* 212  481:goto            502
		{
			((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(11);
	//  213  484:aload           6
	//  214  486:bipush          11
	//  215  488:invokevirtual   #193 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
			obj1.rightMargin = VPUtilities.pixelsToDip(10, context);
	//  216  491:aload           6
	//  217  493:bipush          10
	//  218  495:aload_1         
	//  219  496:invokestatic    #244 <Method int VPUtilities.pixelsToDip(int, Context)>
	//  220  499:putfield        #111 <Field int android.widget.RelativeLayout$LayoutParams.rightMargin>
		}
		((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(15);
	//  221  502:aload           6
	//  222  504:bipush          15
	//  223  506:invokevirtual   #193 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
		_skip_button.setId(com.appscend.vastplayer.R.id.skipbutton);
	//  224  509:aload_0         
	//  225  510:getfield        #67  <Field ProgressWheel _skip_button>
	//  226  513:getstatic       #201 <Field int com.appscend.vastplayer.R$id.skipbutton>
	//  227  516:invokevirtual   #247 <Method void ProgressWheel.setId(int)>
		_skip_button.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
	//  228  519:aload_0         
	//  229  520:getfield        #67  <Field ProgressWheel _skip_button>
	//  230  523:aload           6
	//  231  525:invokevirtual   #248 <Method void ProgressWheel.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		if(overlay.parameters.get("padding") != null)
	//* 232  528:aload_0         
	//* 233  529:getfield        #134 <Field APSMediaOverlay overlay>
	//* 234  532:getfield        #140 <Field HashMap APSMediaOverlay.parameters>
	//* 235  535:ldc1            #28  <String "padding">
	//* 236  537:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//* 237  540:ifnull          573
		{
			i = ((Integer)overlay.parameters.get("padding")).intValue();
	//  238  543:aload_0         
	//  239  544:getfield        #134 <Field APSMediaOverlay overlay>
	//  240  547:getfield        #140 <Field HashMap APSMediaOverlay.parameters>
	//  241  550:ldc1            #28  <String "padding">
	//  242  552:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//  243  555:checkcast       #154 <Class Integer>
	//  244  558:invokevirtual   #164 <Method int Integer.intValue()>
	//  245  561:istore_2        
			_skip_button.setPadding(i, i, i, i);
	//  246  562:aload_0         
	//  247  563:getfield        #67  <Field ProgressWheel _skip_button>
	//  248  566:iload_2         
	//  249  567:iload_2         
	//  250  568:iload_2         
	//  251  569:iload_2         
	//  252  570:invokevirtual   #252 <Method void ProgressWheel.setPadding(int, int, int, int)>
		}
		context = ((Context) (_skip_button));
	//  253  573:aload_0         
	//  254  574:getfield        #67  <Field ProgressWheel _skip_button>
	//  255  577:astore_1        
		if(overlay.parameters.get("circleColor") != null)
	//* 256  578:aload_0         
	//* 257  579:getfield        #134 <Field APSMediaOverlay overlay>
	//* 258  582:getfield        #140 <Field HashMap APSMediaOverlay.parameters>
	//* 259  585:ldc1            #31  <String "circleColor">
	//* 260  587:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//* 261  590:ifnull          615
			i = VPUtilities.getColorFromString((String)overlay.parameters.get("circleColor"));
	//  262  593:aload_0         
	//  263  594:getfield        #134 <Field APSMediaOverlay overlay>
	//  264  597:getfield        #140 <Field HashMap APSMediaOverlay.parameters>
	//  265  600:ldc1            #31  <String "circleColor">
	//  266  602:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//  267  605:checkcast       #168 <Class String>
	//  268  608:invokestatic    #231 <Method int VPUtilities.getColorFromString(String)>
	//  269  611:istore_2        
		else
	//* 270  612:goto            618
			i = 0xff888888;
	//  271  615:ldc1            #253 <Int 0xff888888>
	//  272  617:istore_2        
		((ProgressWheel) (context)).setBarColor(i);
	//  273  618:aload_1         
	//  274  619:iload_2         
	//  275  620:invokevirtual   #256 <Method void ProgressWheel.setBarColor(int)>
		context = ((Context) (_skip_button));
	//  276  623:aload_0         
	//  277  624:getfield        #67  <Field ProgressWheel _skip_button>
	//  278  627:astore_1        
		obj = overlay.parameters.get("trackColor");
	//  279  628:aload_0         
	//  280  629:getfield        #134 <Field APSMediaOverlay overlay>
	//  281  632:getfield        #140 <Field HashMap APSMediaOverlay.parameters>
	//  282  635:ldc1            #40  <String "trackColor">
	//  283  637:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//  284  640:astore          5
		int j = 0xffcccccc;
	//  285  642:ldc2            #257 <Int 0xffcccccc>
	//  286  645:istore          4
		if(obj != null)
	//* 287  647:aload           5
	//* 288  649:ifnull          674
			i = VPUtilities.getColorFromString((String)overlay.parameters.get("trackColor"));
	//  289  652:aload_0         
	//  290  653:getfield        #134 <Field APSMediaOverlay overlay>
	//  291  656:getfield        #140 <Field HashMap APSMediaOverlay.parameters>
	//  292  659:ldc1            #40  <String "trackColor">
	//  293  661:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//  294  664:checkcast       #168 <Class String>
	//  295  667:invokestatic    #231 <Method int VPUtilities.getColorFromString(String)>
	//  296  670:istore_2        
		else
	//* 297  671:goto            678
			i = 0xffcccccc;
	//  298  674:ldc2            #257 <Int 0xffcccccc>
	//  299  677:istore_2        
		((ProgressWheel) (context)).setRimColor(i);
	//  300  678:aload_1         
	//  301  679:iload_2         
	//  302  680:invokevirtual   #260 <Method void ProgressWheel.setRimColor(int)>
		context = ((Context) (_skip_button));
	//  303  683:aload_0         
	//  304  684:getfield        #67  <Field ProgressWheel _skip_button>
	//  305  687:astore_1        
		i = ((int) (byte0));
	//  306  688:iload_3         
	//  307  689:istore_2        
		if(overlay.parameters.get("textColor") != null)
	//* 308  690:aload_0         
	//* 309  691:getfield        #134 <Field APSMediaOverlay overlay>
	//* 310  694:getfield        #140 <Field HashMap APSMediaOverlay.parameters>
	//* 311  697:ldc1            #37  <String "textColor">
	//* 312  699:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//* 313  702:ifnull          724
			i = VPUtilities.getColorFromString((String)overlay.parameters.get("textColor"));
	//  314  705:aload_0         
	//  315  706:getfield        #134 <Field APSMediaOverlay overlay>
	//  316  709:getfield        #140 <Field HashMap APSMediaOverlay.parameters>
	//  317  712:ldc1            #37  <String "textColor">
	//  318  714:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//  319  717:checkcast       #168 <Class String>
	//  320  720:invokestatic    #231 <Method int VPUtilities.getColorFromString(String)>
	//  321  723:istore_2        
		((ProgressWheel) (context)).setTextColor(i);
	//  322  724:aload_1         
	//  323  725:iload_2         
	//  324  726:invokevirtual   #261 <Method void ProgressWheel.setTextColor(int)>
		_skip_button.setBarWidth(2);
	//  325  729:aload_0         
	//  326  730:getfield        #67  <Field ProgressWheel _skip_button>
	//  327  733:iconst_2        
	//  328  734:invokevirtual   #264 <Method void ProgressWheel.setBarWidth(int)>
		_skip_button.setRimWidth(2);
	//  329  737:aload_0         
	//  330  738:getfield        #67  <Field ProgressWheel _skip_button>
	//  331  741:iconst_2        
	//  332  742:invokevirtual   #267 <Method void ProgressWheel.setRimWidth(int)>
		i = _offset;
	//  333  745:aload_0         
	//  334  746:getfield        #160 <Field int _offset>
	//  335  749:istore_2        
		if(i > 0)
	//* 336  750:iload_2         
	//* 337  751:ifle            768
			_skip_button.setText(String.valueOf(i));
	//  338  754:aload_0         
	//  339  755:getfield        #67  <Field ProgressWheel _skip_button>
	//  340  758:iload_2         
	//  341  759:invokestatic    #271 <Method String String.valueOf(int)>
	//  342  762:invokevirtual   #75  <Method void ProgressWheel.setText(String)>
		else
	//* 343  765:goto            772
			setCountdownFinished();
	//  344  768:aload_0         
	//  345  769:invokespecial   #273 <Method void setCountdownFinished()>
		_skip_button.setDelayMillis(Math.round((_offset * 1000) / 180));
	//  346  772:aload_0         
	//  347  773:getfield        #67  <Field ProgressWheel _skip_button>
	//  348  776:aload_0         
	//  349  777:getfield        #160 <Field int _offset>
	//  350  780:sipush          1000
	//  351  783:imul            
	//  352  784:sipush          180
	//  353  787:idiv            
	//  354  788:i2f             
	//  355  789:invokestatic    #279 <Method int Math.round(float)>
	//  356  792:invokevirtual   #282 <Method void ProgressWheel.setDelayMillis(int)>
		context = ((Context) (new GradientDrawable()));
	//  357  795:new             #284 <Class GradientDrawable>
	//  358  798:dup             
	//  359  799:invokespecial   #285 <Method void GradientDrawable()>
	//  360  802:astore_1        
		((GradientDrawable) (context)).setShape(0);
	//  361  803:aload_1         
	//  362  804:iconst_0        
	//  363  805:invokevirtual   #288 <Method void GradientDrawable.setShape(int)>
		((GradientDrawable) (context)).setCornerRadius(_radius);
	//  364  808:aload_1         
	//  365  809:aload_0         
	//  366  810:getfield        #166 <Field int _radius>
	//  367  813:i2f             
	//  368  814:invokevirtual   #291 <Method void GradientDrawable.setCornerRadius(float)>
		i = j;
	//  369  817:iload           4
	//  370  819:istore_2        
		if(overlay.parameters.get("borderColor") != null)
	//* 371  820:aload_0         
	//* 372  821:getfield        #134 <Field APSMediaOverlay overlay>
	//* 373  824:getfield        #140 <Field HashMap APSMediaOverlay.parameters>
	//* 374  827:ldc1            #16  <String "borderColor">
	//* 375  829:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//* 376  832:ifnull          854
			i = Color.parseColor((String)overlay.parameters.get("borderColor"));
	//  377  835:aload_0         
	//  378  836:getfield        #134 <Field APSMediaOverlay overlay>
	//  379  839:getfield        #140 <Field HashMap APSMediaOverlay.parameters>
	//  380  842:ldc1            #16  <String "borderColor">
	//  381  844:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//  382  847:checkcast       #168 <Class String>
	//  383  850:invokestatic    #173 <Method int Color.parseColor(String)>
	//  384  853:istore_2        
		((GradientDrawable) (context)).setStroke(2, i);
	//  385  854:aload_1         
	//  386  855:iconst_2        
	//  387  856:iload_2         
	//  388  857:invokevirtual   #294 <Method void GradientDrawable.setStroke(int, int)>
		((GradientDrawable) (context)).setColor(_bgcolor);
	//  389  860:aload_1         
	//  390  861:aload_0         
	//  391  862:getfield        #175 <Field int _bgcolor>
	//  392  865:invokevirtual   #297 <Method void GradientDrawable.setColor(int)>
		_viewHolder.setBackgroundDrawable(((android.graphics.drawable.Drawable) (context)));
	//  393  868:aload_0         
	//  394  869:getfield        #88  <Field RelativeLayout _viewHolder>
	//  395  872:aload_1         
	//  396  873:invokevirtual   #301 <Method void RelativeLayout.setBackgroundDrawable(android.graphics.drawable.Drawable)>
		_viewHolder.addView(((View) (_textView)));
	//  397  876:aload_0         
	//  398  877:getfield        #88  <Field RelativeLayout _viewHolder>
	//  399  880:aload_0         
	//  400  881:getfield        #182 <Field TextView _textView>
	//  401  884:invokevirtual   #302 <Method void RelativeLayout.addView(View)>
		if(_offset > 0)
	//* 402  887:aload_0         
	//* 403  888:getfield        #160 <Field int _offset>
	//* 404  891:ifle            905
			_viewHolder.addView(((View) (_skip_button)));
	//  405  894:aload_0         
	//  406  895:getfield        #88  <Field RelativeLayout _viewHolder>
	//  407  898:aload_0         
	//  408  899:getfield        #67  <Field ProgressWheel _skip_button>
	//  409  902:invokevirtual   #302 <Method void RelativeLayout.addView(View)>
		_viewHolder.setEnabled(false);
	//  410  905:aload_0         
	//  411  906:getfield        #88  <Field RelativeLayout _viewHolder>
	//  412  909:iconst_0        
	//  413  910:invokevirtual   #306 <Method void RelativeLayout.setEnabled(boolean)>
		_viewHolder.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				APSMediaPlayer.getInstance().skip();
			//    0    0:invokestatic    #29  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
			//    1    3:invokevirtual   #32  <Method void APSMediaPlayer.skip()>
			//    2    6:return          
			}

			final APSMediaPlayerSkipOverlayController this$0;

			
			{
				this$0 = APSMediaPlayerSkipOverlayController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field APSMediaPlayerSkipOverlayController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  414  913:aload_0         
	//  415  914:getfield        #88  <Field RelativeLayout _viewHolder>
	//  416  917:new             #6   <Class APSMediaPlayerSkipOverlayController$1>
	//  417  920:dup             
	//  418  921:aload_0         
	//  419  922:invokespecial   #309 <Method void APSMediaPlayerSkipOverlayController$1(APSMediaPlayerSkipOverlayController)>
	//  420  925:invokevirtual   #313 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
	//  421  928:return          
	}

	public String type()
	{
		return "com.appscend.mp.overlays.skip";
	//    0    0:ldc1            #13  <String "com.appscend.mp.overlays.skip">
	//    1    2:areturn         
	}

	public void update(int i, int j)
	{
		if(!_animationStarted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field boolean _animationStarted>
	//*   2    4:ifne            19
		{
			_skip_button.spinOnce();
	//    3    7:aload_0         
	//    4    8:getfield        #67  <Field ProgressWheel _skip_button>
	//    5   11:invokevirtual   #319 <Method void ProgressWheel.spinOnce()>
			_animationStarted = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #63  <Field boolean _animationStarted>
		}
		i = _offset - APSMediaPlayer.getInstance().currentPlaybackTime() / 1000;
	//    9   19:aload_0         
	//   10   20:getfield        #160 <Field int _offset>
	//   11   23:invokestatic    #325 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   12   26:invokevirtual   #328 <Method int APSMediaPlayer.currentPlaybackTime()>
	//   13   29:sipush          1000
	//   14   32:idiv            
	//   15   33:isub            
	//   16   34:istore_1        
		_textView.setText(((CharSequence) (_textTemplate.replace("__remaining__", ((CharSequence) (String.valueOf(i)))))));
	//   17   35:aload_0         
	//   18   36:getfield        #182 <Field TextView _textView>
	//   19   39:aload_0         
	//   20   40:getfield        #214 <Field String _textTemplate>
	//   21   43:ldc1            #216 <String "__remaining__">
	//   22   45:iload_1         
	//   23   46:invokestatic    #271 <Method String String.valueOf(int)>
	//   24   49:invokevirtual   #220 <Method String String.replace(CharSequence, CharSequence)>
	//   25   52:invokevirtual   #223 <Method void TextView.setText(CharSequence)>
		if(i > 0)
	//*  26   55:iload_1         
	//*  27   56:ifle            71
		{
			_skip_button.setText(String.valueOf(i));
	//   28   59:aload_0         
	//   29   60:getfield        #67  <Field ProgressWheel _skip_button>
	//   30   63:iload_1         
	//   31   64:invokestatic    #271 <Method String String.valueOf(int)>
	//   32   67:invokevirtual   #75  <Method void ProgressWheel.setText(String)>
			return;
	//   33   70:return          
		}
		setCountdownFinished();
	//   34   71:aload_0         
	//   35   72:invokespecial   #273 <Method void setCountdownFinished()>
		GradientDrawable gradientdrawable = new GradientDrawable();
	//   36   75:new             #284 <Class GradientDrawable>
	//   37   78:dup             
	//   38   79:invokespecial   #285 <Method void GradientDrawable()>
	//   39   82:astore_3        
		gradientdrawable.setShape(0);
	//   40   83:aload_3         
	//   41   84:iconst_0        
	//   42   85:invokevirtual   #288 <Method void GradientDrawable.setShape(int)>
		gradientdrawable.setCornerRadius(_radius);
	//   43   88:aload_3         
	//   44   89:aload_0         
	//   45   90:getfield        #166 <Field int _radius>
	//   46   93:i2f             
	//   47   94:invokevirtual   #291 <Method void GradientDrawable.setCornerRadius(float)>
		if(overlay.parameters.get("borderColor") != null)
	//*  48   97:aload_0         
	//*  49   98:getfield        #134 <Field APSMediaOverlay overlay>
	//*  50  101:getfield        #140 <Field HashMap APSMediaOverlay.parameters>
	//*  51  104:ldc1            #16  <String "borderColor">
	//*  52  106:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//*  53  109:ifnull          134
			i = Color.parseColor((String)overlay.parameters.get("borderColor"));
	//   54  112:aload_0         
	//   55  113:getfield        #134 <Field APSMediaOverlay overlay>
	//   56  116:getfield        #140 <Field HashMap APSMediaOverlay.parameters>
	//   57  119:ldc1            #16  <String "borderColor">
	//   58  121:invokevirtual   #146 <Method Object HashMap.get(Object)>
	//   59  124:checkcast       #168 <Class String>
	//   60  127:invokestatic    #173 <Method int Color.parseColor(String)>
	//   61  130:istore_1        
		else
	//*  62  131:goto            138
			i = 0xffcccccc;
	//   63  134:ldc2            #257 <Int 0xffcccccc>
	//   64  137:istore_1        
		gradientdrawable.setStroke(2, i);
	//   65  138:aload_3         
	//   66  139:iconst_2        
	//   67  140:iload_1         
	//   68  141:invokevirtual   #294 <Method void GradientDrawable.setStroke(int, int)>
		gradientdrawable.setColor(_bgcolor);
	//   69  144:aload_3         
	//   70  145:aload_0         
	//   71  146:getfield        #175 <Field int _bgcolor>
	//   72  149:invokevirtual   #297 <Method void GradientDrawable.setColor(int)>
		_viewHolder.setBackgroundDrawable(((android.graphics.drawable.Drawable) (gradientdrawable)));
	//   73  152:aload_0         
	//   74  153:getfield        #88  <Field RelativeLayout _viewHolder>
	//   75  156:aload_3         
	//   76  157:invokevirtual   #301 <Method void RelativeLayout.setBackgroundDrawable(android.graphics.drawable.Drawable)>
		_viewHolder.setEnabled(true);
	//   77  160:aload_0         
	//   78  161:getfield        #88  <Field RelativeLayout _viewHolder>
	//   79  164:iconst_1        
	//   80  165:invokevirtual   #306 <Method void RelativeLayout.setEnabled(boolean)>
	//   81  168:return          
	}

	public static final String APSSkipOverlay = "com.appscend.mp.overlays.skip";
	public static final String kAPSSkipOverlayBorderColor = "borderColor";
	public static final String kAPSSkipOverlayBorderRadius = "radius";
	public static final String kAPSSkipOverlayColor = "color";
	public static final String kAPSSkipOverlayOffset = "defaultOffset";
	public static final String kAPSSkipOverlayPadding = "padding";
	public static final String kAPSSkipOverlayProgressColor = "circleColor";
	public static final String kAPSSkipOverlayProgressPosition = "position";
	public static final String kAPSSkipOverlayProgressStringColor = "textColor";
	public static final String kAPSSkipOverlayProgressTrackColor = "trackColor";
	public static final String kAPSSkipOverlayString = "text";
	public static final String kAPSSkipOverlayStringColor = "textColor";
	private boolean _animationStarted;
	private int _bgcolor;
	private int _offset;
	private int _radius;
	private ProgressWheel _skip_button;
	private String _textTemplate;
	private TextView _textView;
	private RelativeLayout _viewHolder;
}
