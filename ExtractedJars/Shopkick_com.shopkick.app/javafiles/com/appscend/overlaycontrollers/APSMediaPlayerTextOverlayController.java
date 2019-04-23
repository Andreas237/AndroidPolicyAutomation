// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.appscend.media.APSMediaPlayer;
import com.appscend.media.events.APSMediaOverlay;
import com.appscend.media.events.APSMediaUnit;
import com.appscend.utilities.VPUtilities;
import java.util.HashMap;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerOverlayController

public class APSMediaPlayerTextOverlayController extends APSMediaPlayerOverlayController
{

	public APSMediaPlayerTextOverlayController()
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
	//    2    2:getfield        #32  <Field TextView _view>
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
	//    1    1:getfield        #32  <Field TextView _view>
	//    2    4:areturn         
	}

	public void hideOverlay()
	{
		_view.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field TextView _view>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #49  <Method void TextView.setVisibility(int)>
	//    4    9:return          
	}

	public void load(Context context)
	{
		_view = new TextView(context);
	//    0    0:aload_0         
	//    1    1:new             #45  <Class TextView>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #53  <Method void TextView(Context)>
	//    5    9:putfield        #32  <Field TextView _view>
		_view.setBackgroundColor(0);
	//    6   12:aload_0         
	//    7   13:getfield        #32  <Field TextView _view>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #56  <Method void TextView.setBackgroundColor(int)>
		_view.setMaxLines(1);
	//   10   20:aload_0         
	//   11   21:getfield        #32  <Field TextView _view>
	//   12   24:iconst_1        
	//   13   25:invokevirtual   #59  <Method void TextView.setMaxLines(int)>
		_view.setTypeface(Typeface.DEFAULT);
	//   14   28:aload_0         
	//   15   29:getfield        #32  <Field TextView _view>
	//   16   32:getstatic       #65  <Field Typeface Typeface.DEFAULT>
	//   17   35:invokevirtual   #69  <Method void TextView.setTypeface(Typeface)>
		String s = (String)overlay.parameters.get("color");
	//   18   38:aload_0         
	//   19   39:getfield        #73  <Field APSMediaOverlay overlay>
	//   20   42:getfield        #79  <Field HashMap APSMediaOverlay.parameters>
	//   21   45:ldc1            #14  <String "color">
	//   22   47:invokevirtual   #85  <Method Object HashMap.get(Object)>
	//   23   50:checkcast       #87  <Class String>
	//   24   53:astore_2        
		if(s != null)
	//*  25   54:aload_2         
	//*  26   55:ifnull          72
			_view.setTextColor(VPUtilities.parseColor(s));
	//   27   58:aload_0         
	//   28   59:getfield        #32  <Field TextView _view>
	//   29   62:aload_2         
	//   30   63:invokestatic    #93  <Method int VPUtilities.parseColor(String)>
	//   31   66:invokevirtual   #96  <Method void TextView.setTextColor(int)>
		else
	//*  32   69:goto            80
			_view.setTextColor(-1);
	//   33   72:aload_0         
	//   34   73:getfield        #32  <Field TextView _view>
	//   35   76:iconst_m1       
	//   36   77:invokevirtual   #96  <Method void TextView.setTextColor(int)>
		_textTemplate = (String)overlay.parameters.get("text");
	//   37   80:aload_0         
	//   38   81:aload_0         
	//   39   82:getfield        #73  <Field APSMediaOverlay overlay>
	//   40   85:getfield        #79  <Field HashMap APSMediaOverlay.parameters>
	//   41   88:ldc1            #11  <String "text">
	//   42   90:invokevirtual   #85  <Method Object HashMap.get(Object)>
	//   43   93:checkcast       #87  <Class String>
	//   44   96:putfield        #98  <Field String _textTemplate>
		if(_textTemplate != null)
	//*  45   99:aload_0         
	//*  46  100:getfield        #98  <Field String _textTemplate>
	//*  47  103:ifnull          204
		{
			if(overlay.parentUnit.metadata.get("aps_vast_adbreak_total") != null)
	//*  48  106:aload_0         
	//*  49  107:getfield        #73  <Field APSMediaOverlay overlay>
	//*  50  110:getfield        #102 <Field APSMediaUnit APSMediaOverlay.parentUnit>
	//*  51  113:getfield        #107 <Field HashMap APSMediaUnit.metadata>
	//*  52  116:ldc1            #109 <String "aps_vast_adbreak_total">
	//*  53  118:invokevirtual   #85  <Method Object HashMap.get(Object)>
	//*  54  121:ifnull          155
				_textTemplate = _textTemplate.replace("__total_ads__", ((CharSequence) (String.valueOf(overlay.parentUnit.metadata.get("aps_vast_adbreak_total")))));
	//   55  124:aload_0         
	//   56  125:aload_0         
	//   57  126:getfield        #98  <Field String _textTemplate>
	//   58  129:ldc1            #111 <String "__total_ads__">
	//   59  131:aload_0         
	//   60  132:getfield        #73  <Field APSMediaOverlay overlay>
	//   61  135:getfield        #102 <Field APSMediaUnit APSMediaOverlay.parentUnit>
	//   62  138:getfield        #107 <Field HashMap APSMediaUnit.metadata>
	//   63  141:ldc1            #109 <String "aps_vast_adbreak_total">
	//   64  143:invokevirtual   #85  <Method Object HashMap.get(Object)>
	//   65  146:invokestatic    #115 <Method String String.valueOf(Object)>
	//   66  149:invokevirtual   #119 <Method String String.replace(CharSequence, CharSequence)>
	//   67  152:putfield        #98  <Field String _textTemplate>
			if(overlay.parentUnit.metadata.get("aps_vast_adbreak_index") != null)
	//*  68  155:aload_0         
	//*  69  156:getfield        #73  <Field APSMediaOverlay overlay>
	//*  70  159:getfield        #102 <Field APSMediaUnit APSMediaOverlay.parentUnit>
	//*  71  162:getfield        #107 <Field HashMap APSMediaUnit.metadata>
	//*  72  165:ldc1            #121 <String "aps_vast_adbreak_index">
	//*  73  167:invokevirtual   #85  <Method Object HashMap.get(Object)>
	//*  74  170:ifnull          204
				_textTemplate = _textTemplate.replace("__ad_index__", ((CharSequence) (String.valueOf(overlay.parentUnit.metadata.get("aps_vast_adbreak_index")))));
	//   75  173:aload_0         
	//   76  174:aload_0         
	//   77  175:getfield        #98  <Field String _textTemplate>
	//   78  178:ldc1            #123 <String "__ad_index__">
	//   79  180:aload_0         
	//   80  181:getfield        #73  <Field APSMediaOverlay overlay>
	//   81  184:getfield        #102 <Field APSMediaUnit APSMediaOverlay.parentUnit>
	//   82  187:getfield        #107 <Field HashMap APSMediaUnit.metadata>
	//   83  190:ldc1            #121 <String "aps_vast_adbreak_index">
	//   84  192:invokevirtual   #85  <Method Object HashMap.get(Object)>
	//   85  195:invokestatic    #115 <Method String String.valueOf(Object)>
	//   86  198:invokevirtual   #119 <Method String String.replace(CharSequence, CharSequence)>
	//   87  201:putfield        #98  <Field String _textTemplate>
		}
		if(_textTemplate == null)
	//*  88  204:aload_0         
	//*  89  205:getfield        #98  <Field String _textTemplate>
	//*  90  208:ifnonnull       217
			_textTemplate = "Your content will start in __remaining__ seconds";
	//   91  211:aload_0         
	//   92  212:ldc1            #125 <String "Your content will start in __remaining__ seconds">
	//   93  214:putfield        #98  <Field String _textTemplate>
		_view.setGravity(16);
	//   94  217:aload_0         
	//   95  218:getfield        #32  <Field TextView _view>
	//   96  221:bipush          16
	//   97  223:invokevirtual   #128 <Method void TextView.setGravity(int)>
		if(overlay.position == com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionBottomRight || overlay.position == com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionTopRight)
	//*  98  226:aload_0         
	//*  99  227:getfield        #73  <Field APSMediaOverlay overlay>
	//* 100  230:getfield        #132 <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay.position>
	//* 101  233:getstatic       #137 <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionBottomRight>
	//* 102  236:if_acmpeq       252
	//* 103  239:aload_0         
	//* 104  240:getfield        #73  <Field APSMediaOverlay overlay>
	//* 105  243:getfield        #132 <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay.position>
	//* 106  246:getstatic       #140 <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionTopRight>
	//* 107  249:if_acmpne       276
		{
			_view.setGravity(5);
	//  108  252:aload_0         
	//  109  253:getfield        #32  <Field TextView _view>
	//  110  256:iconst_5        
	//  111  257:invokevirtual   #128 <Method void TextView.setGravity(int)>
			_view.setPadding(0, 0, VPUtilities.pixelsToDip(10, context), 0);
	//  112  260:aload_0         
	//  113  261:getfield        #32  <Field TextView _view>
	//  114  264:iconst_0        
	//  115  265:iconst_0        
	//  116  266:bipush          10
	//  117  268:aload_1         
	//  118  269:invokestatic    #144 <Method int VPUtilities.pixelsToDip(int, Context)>
	//  119  272:iconst_0        
	//  120  273:invokevirtual   #148 <Method void TextView.setPadding(int, int, int, int)>
		}
		if(overlay.position == com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionBottomLeft || overlay.position == com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionTopLeft)
	//* 121  276:aload_0         
	//* 122  277:getfield        #73  <Field APSMediaOverlay overlay>
	//* 123  280:getfield        #132 <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay.position>
	//* 124  283:getstatic       #151 <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionBottomLeft>
	//* 125  286:if_acmpeq       302
	//* 126  289:aload_0         
	//* 127  290:getfield        #73  <Field APSMediaOverlay overlay>
	//* 128  293:getfield        #132 <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay.position>
	//* 129  296:getstatic       #154 <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionTopLeft>
	//* 130  299:if_acmpne       318
			_view.setPadding(VPUtilities.pixelsToDip(10, context), 0, 0, 0);
	//  131  302:aload_0         
	//  132  303:getfield        #32  <Field TextView _view>
	//  133  306:bipush          10
	//  134  308:aload_1         
	//  135  309:invokestatic    #144 <Method int VPUtilities.pixelsToDip(int, Context)>
	//  136  312:iconst_0        
	//  137  313:iconst_0        
	//  138  314:iconst_0        
	//  139  315:invokevirtual   #148 <Method void TextView.setPadding(int, int, int, int)>
	//  140  318:return          
	}

	public String type()
	{
		return "com.appscend.mp.overlays.text";
	//    0    0:ldc1            #8   <String "com.appscend.mp.overlays.text">
	//    1    2:areturn         
	}

	public void update(int i, int j)
	{
		i = (APSMediaPlayer.getInstance().duration() - APSMediaPlayer.getInstance().currentPlaybackTime()) / 1000;
	//    0    0:invokestatic    #164 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    1    3:invokevirtual   #168 <Method int APSMediaPlayer.duration()>
	//    2    6:invokestatic    #164 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    3    9:invokevirtual   #171 <Method int APSMediaPlayer.currentPlaybackTime()>
	//    4   12:isub            
	//    5   13:sipush          1000
	//    6   16:idiv            
	//    7   17:istore_1        
		if(i <= 0)
	//*   8   18:iload_1         
	//*   9   19:ifgt            23
		{
			return;
	//   10   22:return          
		} else
		{
			_view.setText(((CharSequence) (_textTemplate.replaceAll("__remaining__", String.valueOf(i)))));
	//   11   23:aload_0         
	//   12   24:getfield        #32  <Field TextView _view>
	//   13   27:aload_0         
	//   14   28:getfield        #98  <Field String _textTemplate>
	//   15   31:ldc1            #173 <String "__remaining__">
	//   16   33:iload_1         
	//   17   34:invokestatic    #176 <Method String String.valueOf(int)>
	//   18   37:invokevirtual   #180 <Method String String.replaceAll(String, String)>
	//   19   40:invokevirtual   #184 <Method void TextView.setText(CharSequence)>
			return;
	//   20   43:return          
		}
	}

	public static final String APSTextOverlay = "com.appscend.mp.overlays.text";
	public static final String kAPSTextOverlayString = "text";
	public static final String kAPSTextOverlayStringColor = "color";
	public static final String kAPSTextOverlayStringFont = "font";
	public static final String kAPSTextOverlayStringSize = "size";
	private String _textTemplate;
	private TextView _view;
}
