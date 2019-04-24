// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.takeoverinapp;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.*;
import android.view.animation.*;
import android.widget.*;
import com.mixpanel.android.a.f;
import com.mixpanel.android.a.i;
import com.mixpanel.android.mpmetrics.*;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.takeoverinapp:
//			FadingImageView

public class TakeoverInAppActivity extends Activity
{

	public TakeoverInAppActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Activity()>
		c = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #27  <Field int c>
	//    5    9:return          
	}

	static int a(TakeoverInAppActivity takeoverinappactivity)
	{
		return takeoverinappactivity.c;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int c>
	//    2    4:ireturn         
	}

	private void a()
	{
		setContentView(com.mixpanel.android.a.d.com_mixpanel_android_activity_notification_full);
	//    0    0:aload_0         
	//    1    1:getstatic       #34  <Field int com.mixpanel.android.a$d.com_mixpanel_android_activity_notification_full>
	//    2    4:invokevirtual   #38  <Method void setContentView(int)>
		ImageView imageview1 = (ImageView)findViewById(com.mixpanel.android.a.c.com_mixpanel_android_notification_gradient);
	//    3    7:aload_0         
	//    4    8:getstatic       #43  <Field int com.mixpanel.android.a$c.com_mixpanel_android_notification_gradient>
	//    5   11:invokevirtual   #47  <Method View findViewById(int)>
	//    6   14:checkcast       #49  <Class ImageView>
	//    7   17:astore          11
		FadingImageView fadingimageview = (FadingImageView)findViewById(com.mixpanel.android.a.c.com_mixpanel_android_notification_image);
	//    8   19:aload_0         
	//    9   20:getstatic       #52  <Field int com.mixpanel.android.a$c.com_mixpanel_android_notification_image>
	//   10   23:invokevirtual   #47  <Method View findViewById(int)>
	//   11   26:checkcast       #54  <Class FadingImageView>
	//   12   29:astore_3        
		TextView textview = (TextView)findViewById(com.mixpanel.android.a.c.com_mixpanel_android_notification_title);
	//   13   30:aload_0         
	//   14   31:getstatic       #57  <Field int com.mixpanel.android.a$c.com_mixpanel_android_notification_title>
	//   15   34:invokevirtual   #47  <Method View findViewById(int)>
	//   16   37:checkcast       #59  <Class TextView>
	//   17   40:astore          4
		TextView textview1 = (TextView)findViewById(com.mixpanel.android.a.c.com_mixpanel_android_notification_subtext);
	//   18   42:aload_0         
	//   19   43:getstatic       #62  <Field int com.mixpanel.android.a$c.com_mixpanel_android_notification_subtext>
	//   20   46:invokevirtual   #47  <Method View findViewById(int)>
	//   21   49:checkcast       #59  <Class TextView>
	//   22   52:astore          5
		ArrayList arraylist = new ArrayList();
	//   23   54:new             #64  <Class ArrayList>
	//   24   57:dup             
	//   25   58:invokespecial   #65  <Method void ArrayList()>
	//   26   61:astore          6
		Button button = (Button)findViewById(com.mixpanel.android.a.c.com_mixpanel_android_notification_button);
	//   27   63:aload_0         
	//   28   64:getstatic       #68  <Field int com.mixpanel.android.a$c.com_mixpanel_android_notification_button>
	//   29   67:invokevirtual   #47  <Method View findViewById(int)>
	//   30   70:checkcast       #70  <Class Button>
	//   31   73:astore          7
		arraylist.add(((Object) (button)));
	//   32   75:aload           6
	//   33   77:aload           7
	//   34   79:invokevirtual   #74  <Method boolean ArrayList.add(Object)>
	//   35   82:pop             
		arraylist.add(((Object) ((Button)findViewById(com.mixpanel.android.a.c.com_mixpanel_android_notification_second_button))));
	//   36   83:aload           6
	//   37   85:aload_0         
	//   38   86:getstatic       #77  <Field int com.mixpanel.android.a$c.com_mixpanel_android_notification_second_button>
	//   39   89:invokevirtual   #47  <Method View findViewById(int)>
	//   40   92:checkcast       #70  <Class Button>
	//   41   95:invokevirtual   #74  <Method boolean ArrayList.add(Object)>
	//   42   98:pop             
		LinearLayout linearlayout = (LinearLayout)findViewById(com.mixpanel.android.a.c.com_mixpanel_android_button_exit_wrapper);
	//   43   99:aload_0         
	//   44  100:getstatic       #80  <Field int com.mixpanel.android.a$c.com_mixpanel_android_button_exit_wrapper>
	//   45  103:invokevirtual   #47  <Method View findViewById(int)>
	//   46  106:checkcast       #82  <Class LinearLayout>
	//   47  109:astore          8
		ImageView imageview = (ImageView)findViewById(com.mixpanel.android.a.c.com_mixpanel_android_image_close);
	//   48  111:aload_0         
	//   49  112:getstatic       #85  <Field int com.mixpanel.android.a$c.com_mixpanel_android_image_close>
	//   50  115:invokevirtual   #47  <Method View findViewById(int)>
	//   51  118:checkcast       #49  <Class ImageView>
	//   52  121:astore          9
		TakeoverInAppNotification takeoverinappnotification = (TakeoverInAppNotification)((com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.InAppNotificationState)b.c()).a();
	//   53  123:aload_0         
	//   54  124:getfield        #87  <Field UpdateDisplayState b>
	//   55  127:invokevirtual   #92  <Method com.mixpanel.android.mpmetrics.UpdateDisplayState$DisplayState UpdateDisplayState.c()>
	//   56  130:checkcast       #94  <Class com.mixpanel.android.mpmetrics.UpdateDisplayState$DisplayState$InAppNotificationState>
	//   57  133:invokevirtual   #97  <Method InAppNotification com.mixpanel.android.mpmetrics.UpdateDisplayState$DisplayState$InAppNotificationState.a()>
	//   58  136:checkcast       #99  <Class TakeoverInAppNotification>
	//   59  139:astore          10
		Display display = getWindowManager().getDefaultDisplay();
	//   60  141:aload_0         
	//   61  142:invokevirtual   #103 <Method WindowManager getWindowManager()>
	//   62  145:invokeinterface #109 <Method Display WindowManager.getDefaultDisplay()>
	//   63  150:astore          13
		Point point = new Point();
	//   64  152:new             #111 <Class Point>
	//   65  155:dup             
	//   66  156:invokespecial   #112 <Method void Point()>
	//   67  159:astore          12
		display.getSize(point);
	//   68  161:aload           13
	//   69  163:aload           12
	//   70  165:invokevirtual   #118 <Method void Display.getSize(Point)>
		int l = getResources().getConfiguration().orientation;
	//   71  168:aload_0         
	//   72  169:invokevirtual   #122 <Method Resources getResources()>
	//   73  172:invokevirtual   #128 <Method Configuration Resources.getConfiguration()>
	//   74  175:getfield        #133 <Field int Configuration.orientation>
	//   75  178:istore_2        
		int k = 0;
	//   76  179:iconst_0        
	//   77  180:istore_1        
		if(l == 1)
	//*  78  181:iload_2         
	//*  79  182:iconst_1        
	//*  80  183:icmpne          221
		{
			android.widget.RelativeLayout.LayoutParams layoutparams1 = (android.widget.RelativeLayout.LayoutParams)linearlayout.getLayoutParams();
	//   81  186:aload           8
	//   82  188:invokevirtual   #137 <Method android.view.ViewGroup$LayoutParams LinearLayout.getLayoutParams()>
	//   83  191:checkcast       #139 <Class android.widget.RelativeLayout$LayoutParams>
	//   84  194:astore          13
			layoutparams1.setMargins(0, 0, 0, (int)((float)point.y * 0.06F));
	//   85  196:aload           13
	//   86  198:iconst_0        
	//   87  199:iconst_0        
	//   88  200:iconst_0        
	//   89  201:aload           12
	//   90  203:getfield        #142 <Field int Point.y>
	//   91  206:i2f             
	//   92  207:ldc1            #143 <Float 0.06F>
	//   93  209:fmul            
	//   94  210:f2i             
	//   95  211:invokevirtual   #147 <Method void android.widget.RelativeLayout$LayoutParams.setMargins(int, int, int, int)>
			linearlayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams1)));
	//   96  214:aload           8
	//   97  216:aload           13
	//   98  218:invokevirtual   #151 <Method void LinearLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		}
		fadingimageview.a(takeoverinappnotification.s());
	//   99  221:aload_3         
	//  100  222:aload           10
	//  101  224:invokevirtual   #155 <Method boolean TakeoverInAppNotification.s()>
	//  102  227:invokevirtual   #158 <Method void FadingImageView.a(boolean)>
		imageview1.setBackgroundColor(takeoverinappnotification.e());
	//  103  230:aload           11
	//  104  232:aload           10
	//  105  234:invokevirtual   #162 <Method int TakeoverInAppNotification.e()>
	//  106  237:invokevirtual   #165 <Method void ImageView.setBackgroundColor(int)>
		if(takeoverinappnotification.n())
	//* 107  240:aload           10
	//* 108  242:invokevirtual   #168 <Method boolean TakeoverInAppNotification.n()>
	//* 109  245:ifeq            277
		{
			textview.setVisibility(0);
	//  110  248:aload           4
	//  111  250:iconst_0        
	//  112  251:invokevirtual   #171 <Method void TextView.setVisibility(int)>
			textview.setText(((CharSequence) (takeoverinappnotification.o())));
	//  113  254:aload           4
	//  114  256:aload           10
	//  115  258:invokevirtual   #175 <Method String TakeoverInAppNotification.o()>
	//  116  261:invokevirtual   #179 <Method void TextView.setText(CharSequence)>
			textview.setTextColor(takeoverinappnotification.p());
	//  117  264:aload           4
	//  118  266:aload           10
	//  119  268:invokevirtual   #182 <Method int TakeoverInAppNotification.p()>
	//  120  271:invokevirtual   #185 <Method void TextView.setTextColor(int)>
		} else
	//* 121  274:goto            284
		{
			textview.setVisibility(8);
	//  122  277:aload           4
	//  123  279:bipush          8
	//  124  281:invokevirtual   #171 <Method void TextView.setVisibility(int)>
		}
		if(takeoverinappnotification.f())
	//* 125  284:aload           10
	//* 126  286:invokevirtual   #188 <Method boolean TakeoverInAppNotification.f()>
	//* 127  289:ifeq            321
		{
			textview1.setVisibility(0);
	//  128  292:aload           5
	//  129  294:iconst_0        
	//  130  295:invokevirtual   #171 <Method void TextView.setVisibility(int)>
			textview1.setText(((CharSequence) (takeoverinappnotification.g())));
	//  131  298:aload           5
	//  132  300:aload           10
	//  133  302:invokevirtual   #191 <Method String TakeoverInAppNotification.g()>
	//  134  305:invokevirtual   #179 <Method void TextView.setText(CharSequence)>
			textview1.setTextColor(takeoverinappnotification.h());
	//  135  308:aload           5
	//  136  310:aload           10
	//  137  312:invokevirtual   #194 <Method int TakeoverInAppNotification.h()>
	//  138  315:invokevirtual   #185 <Method void TextView.setTextColor(int)>
		} else
	//* 139  318:goto            328
		{
			textview1.setVisibility(8);
	//  140  321:aload           5
	//  141  323:bipush          8
	//  142  325:invokevirtual   #171 <Method void TextView.setVisibility(int)>
		}
		fadingimageview.setImageBitmap(takeoverinappnotification.l());
	//  143  328:aload_3         
	//  144  329:aload           10
	//  145  331:invokevirtual   #198 <Method android.graphics.Bitmap TakeoverInAppNotification.l()>
	//  146  334:invokevirtual   #202 <Method void FadingImageView.setImageBitmap(android.graphics.Bitmap)>
		for(; k < arraylist.size(); k++)
	//* 147  337:iload_1         
	//* 148  338:aload           6
	//* 149  340:invokevirtual   #205 <Method int ArrayList.size()>
	//* 150  343:icmpge          379
		{
			InAppButton inappbutton = takeoverinappnotification.a(k);
	//  151  346:aload           10
	//  152  348:iload_1         
	//  153  349:invokevirtual   #208 <Method InAppButton TakeoverInAppNotification.a(int)>
	//  154  352:astore          11
			a((Button)arraylist.get(k), inappbutton, ((InAppNotification) (takeoverinappnotification)), k);
	//  155  354:aload_0         
	//  156  355:aload           6
	//  157  357:iload_1         
	//  158  358:invokevirtual   #212 <Method Object ArrayList.get(int)>
	//  159  361:checkcast       #70  <Class Button>
	//  160  364:aload           11
	//  161  366:aload           10
	//  162  368:iload_1         
	//  163  369:invokespecial   #215 <Method void a(Button, InAppButton, InAppNotification, int)>
		}

	//  164  372:iload_1         
	//  165  373:iconst_1        
	//  166  374:iadd            
	//  167  375:istore_1        
	//* 168  376:goto            337
		if(takeoverinappnotification.r() == 1)
	//* 169  379:aload           10
	//* 170  381:invokevirtual   #218 <Method int TakeoverInAppNotification.r()>
	//* 171  384:iconst_1        
	//* 172  385:icmpne          418
		{
			android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)button.getLayoutParams();
	//  173  388:aload           7
	//  174  390:invokevirtual   #219 <Method android.view.ViewGroup$LayoutParams Button.getLayoutParams()>
	//  175  393:checkcast       #221 <Class android.widget.LinearLayout$LayoutParams>
	//  176  396:astore          11
			layoutparams.weight = 0.0F;
	//  177  398:aload           11
	//  178  400:fconst_0        
	//  179  401:putfield        #225 <Field float android.widget.LinearLayout$LayoutParams.weight>
			layoutparams.width = -2;
	//  180  404:aload           11
	//  181  406:bipush          -2
	//  182  408:putfield        #228 <Field int android.widget.LinearLayout$LayoutParams.width>
			button.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//  183  411:aload           7
	//  184  413:aload           11
	//  185  415:invokevirtual   #229 <Method void Button.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		}
		imageview.setColorFilter(takeoverinappnotification.q());
	//  186  418:aload           9
	//  187  420:aload           10
	//  188  422:invokevirtual   #232 <Method int TakeoverInAppNotification.q()>
	//  189  425:invokevirtual   #235 <Method void ImageView.setColorFilter(int)>
		linearlayout.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				a.finish();
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field TakeoverInAppActivity a>
			//    2    4:invokevirtual   #24  <Method void TakeoverInAppActivity.finish()>
				UpdateDisplayState.a(TakeoverInAppActivity.a(a));
			//    3    7:aload_0         
			//    4    8:getfield        #16  <Field TakeoverInAppActivity a>
			//    5   11:invokestatic    #27  <Method int TakeoverInAppActivity.a(TakeoverInAppActivity)>
			//    6   14:invokestatic    #32  <Method void UpdateDisplayState.a(int)>
			//    7   17:return          
			}

			final TakeoverInAppActivity a;

			
			{
				a = TakeoverInAppActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field TakeoverInAppActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  190  428:aload           8
	//  191  430:new             #6   <Class TakeoverInAppActivity$1>
	//  192  433:dup             
	//  193  434:aload_0         
	//  194  435:invokespecial   #238 <Method void TakeoverInAppActivity$1(TakeoverInAppActivity)>
	//  195  438:invokevirtual   #242 <Method void LinearLayout.setOnClickListener(android.view.View$OnClickListener)>
		a(((ImageView) (fadingimageview)), textview, textview1, arraylist, linearlayout);
	//  196  441:aload_0         
	//  197  442:aload_3         
	//  198  443:aload           4
	//  199  445:aload           5
	//  200  447:aload           6
	//  201  449:aload           8
	//  202  451:invokespecial   #245 <Method void a(ImageView, TextView, TextView, ArrayList, LinearLayout)>
	//  203  454:return          
	}

	private void a(Button button, InAppButton inappbutton, InAppNotification inappnotification, int k)
	{
		if(inappbutton != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          162
		{
			button.setVisibility(0);
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #246 <Method void Button.setVisibility(int)>
			button.setText(((CharSequence) (inappbutton.a())));
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #250 <Method String InAppButton.a()>
	//    8   14:invokevirtual   #251 <Method void Button.setText(CharSequence)>
			button.setTextColor(inappbutton.b());
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokevirtual   #253 <Method int InAppButton.b()>
	//   12   22:invokevirtual   #254 <Method void Button.setTextColor(int)>
			button.setTransformationMethod(((android.text.method.TransformationMethod) (null)));
	//   13   25:aload_1         
	//   14   26:aconst_null     
	//   15   27:invokevirtual   #258 <Method void Button.setTransformationMethod(android.text.method.TransformationMethod)>
			GradientDrawable gradientdrawable = new GradientDrawable();
	//   16   30:new             #260 <Class GradientDrawable>
	//   17   33:dup             
	//   18   34:invokespecial   #261 <Method void GradientDrawable()>
	//   19   37:astore          7
			int i1 = inappbutton.c();
	//   20   39:aload_2         
	//   21   40:invokevirtual   #263 <Method int InAppButton.c()>
	//   22   43:istore          6
			int l = 0x33868686;
	//   23   45:ldc2            #264 <Int 0x33868686>
	//   24   48:istore          5
			if(i1 != 0)
	//*  25   50:iload           6
	//*  26   52:ifeq            67
				l = i.a(inappbutton.c(), 0x33868686);
	//   27   55:aload_2         
	//   28   56:invokevirtual   #263 <Method int InAppButton.c()>
	//   29   59:ldc2            #264 <Int 0x33868686>
	//   30   62:invokestatic    #269 <Method int i.a(int, int)>
	//   31   65:istore          5
			button.setOnTouchListener(new android.view.View.OnTouchListener(l, gradientdrawable, inappbutton) {

				public boolean onTouch(View view, MotionEvent motionevent)
				{
					if(motionevent.getAction() == 0)
				//*   0    0:aload_2         
				//*   1    1:invokevirtual   #40  <Method int MotionEvent.getAction()>
				//*   2    4:ifne            23
					{
						int j1 = a;
				//    3    7:aload_0         
				//    4    8:getfield        #24  <Field int a>
				//    5   11:istore_3        
						b.setColor(j1);
				//    6   12:aload_0         
				//    7   13:getfield        #26  <Field GradientDrawable b>
				//    8   16:iload_3         
				//    9   17:invokevirtual   #46  <Method void GradientDrawable.setColor(int)>
					} else
				//*  10   20:goto            37
					{
						b.setColor(c.c());
				//   11   23:aload_0         
				//   12   24:getfield        #26  <Field GradientDrawable b>
				//   13   27:aload_0         
				//   14   28:getfield        #28  <Field InAppButton c>
				//   15   31:invokevirtual   #50  <Method int InAppButton.c()>
				//   16   34:invokevirtual   #46  <Method void GradientDrawable.setColor(int)>
					}
					return false;
				//   17   37:iconst_0        
				//   18   38:ireturn         
				}

				final int a;
				final GradientDrawable b;
				final InAppButton c;
				final TakeoverInAppActivity d;

			
			{
				d = TakeoverInAppActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field TakeoverInAppActivity d>
				a = k;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #24  <Field int a>
				b = gradientdrawable;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field GradientDrawable b>
				c = inappbutton;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #28  <Field InAppButton c>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #31  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//   32   67:aload_1         
	//   33   68:new             #8   <Class TakeoverInAppActivity$2>
	//   34   71:dup             
	//   35   72:aload_0         
	//   36   73:iload           5
	//   37   75:aload           7
	//   38   77:aload_2         
	//   39   78:invokespecial   #272 <Method void TakeoverInAppActivity$2(TakeoverInAppActivity, int, GradientDrawable, InAppButton)>
	//   40   81:invokevirtual   #276 <Method void Button.setOnTouchListener(android.view.View$OnTouchListener)>
			gradientdrawable.setColor(inappbutton.c());
	//   41   84:aload           7
	//   42   86:aload_2         
	//   43   87:invokevirtual   #263 <Method int InAppButton.c()>
	//   44   90:invokevirtual   #279 <Method void GradientDrawable.setColor(int)>
			gradientdrawable.setStroke((int)i.a(2.0F, ((android.content.Context) (this))), inappbutton.d());
	//   45   93:aload           7
	//   46   95:fconst_2        
	//   47   96:aload_0         
	//   48   97:invokestatic    #282 <Method float i.a(float, android.content.Context)>
	//   49  100:f2i             
	//   50  101:aload_2         
	//   51  102:invokevirtual   #285 <Method int InAppButton.d()>
	//   52  105:invokevirtual   #289 <Method void GradientDrawable.setStroke(int, int)>
			gradientdrawable.setCornerRadius((int)i.a(5F, ((android.content.Context) (this))));
	//   53  108:aload           7
	//   54  110:ldc2            #290 <Float 5F>
	//   55  113:aload_0         
	//   56  114:invokestatic    #282 <Method float i.a(float, android.content.Context)>
	//   57  117:f2i             
	//   58  118:i2f             
	//   59  119:invokevirtual   #294 <Method void GradientDrawable.setCornerRadius(float)>
			if(android.os.Build.VERSION.SDK_INT < 16)
	//*  60  122:getstatic       #299 <Field int android.os.Build$VERSION.SDK_INT>
	//*  61  125:bipush          16
	//*  62  127:icmpge          139
				button.setBackgroundDrawable(((android.graphics.drawable.Drawable) (gradientdrawable)));
	//   63  130:aload_1         
	//   64  131:aload           7
	//   65  133:invokevirtual   #303 <Method void Button.setBackgroundDrawable(android.graphics.drawable.Drawable)>
			else
	//*  66  136:goto            145
				button.setBackground(((android.graphics.drawable.Drawable) (gradientdrawable)));
	//   67  139:aload_1         
	//   68  140:aload           7
	//   69  142:invokevirtual   #306 <Method void Button.setBackground(android.graphics.drawable.Drawable)>
			button.setOnClickListener(new android.view.View.OnClickListener(inappbutton, inappnotification, k) {

				public void onClick(View view)
				{
					Object obj;
					String s;
					String s1;
					s1 = a.e();
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field InAppButton a>
				//    2    4:invokevirtual   #46  <Method String InAppButton.e()>
				//    3    7:astore          4
					s = null;
				//    4    9:aconst_null     
				//    5   10:astore_3        
					obj = null;
				//    6   11:aconst_null     
				//    7   12:astore_2        
					view = ((View) (s));
				//    8   13:aload_3         
				//    9   14:astore_1        
					if(s1 == null) goto _L2; else goto _L1
				//   10   15:aload           4
				//   11   17:ifnull          105
_L1:
					view = ((View) (s));
				//   12   20:aload_3         
				//   13   21:astore_1        
					if(s1.length() <= 0) goto _L2; else goto _L3
				//   14   22:aload           4
				//   15   24:invokevirtual   #52  <Method int String.length()>
				//   16   27:ifle            105
_L3:
					try
					{
						view = ((View) (Uri.parse(s1)));
				//   17   30:aload           4
				//   18   32:invokestatic    #58  <Method Uri Uri.parse(String)>
				//   19   35:astore_1        
					}
				//*  20   36:new             #60  <Class Intent>
				//*  21   39:dup             
				//*  22   40:ldc1            #62  <String "android.intent.action.VIEW">
				//*  23   42:aload_1         
				//*  24   43:invokespecial   #65  <Method void Intent(String, Uri)>
				//*  25   46:astore_1        
				//*  26   47:aload_0         
				//*  27   48:getfield        #22  <Field TakeoverInAppActivity d>
				//*  28   51:aload_1         
				//*  29   52:invokevirtual   #69  <Method void TakeoverInAppActivity.startActivity(Intent)>
				//*  30   55:goto            65
				//*  31   58:ldc1            #71  <String "MixpanelAPI.TakeoverInAppActivity">
				//*  32   60:ldc1            #73  <String "User doesn't have an activity for notification URI">
				//*  33   62:invokestatic    #78  <Method void f.c(String, String)>
				//*  34   65:new             #80  <Class JSONObject>
				//*  35   68:dup             
				//*  36   69:invokespecial   #81  <Method void JSONObject()>
				//*  37   72:astore_1        
				//*  38   73:aload_1         
				//*  39   74:ldc1            #83  <String "url">
				//*  40   76:aload           4
				//*  41   78:invokevirtual   #87  <Method JSONObject JSONObject.put(String, Object)>
				//*  42   81:pop             
				//*  43   82:goto            105
				//*  44   85:ldc1            #71  <String "MixpanelAPI.TakeoverInAppActivity">
				//*  45   87:ldc1            #89  <String "Can't put url into json properties">
				//*  46   89:invokestatic    #91  <Method void f.e(String, String)>
				//*  47   92:goto            105
					// Misplaced declaration of an exception variable
					catch(View view)
				//*  48   95:astore_1        
					{
						f.c("MixpanelAPI.TakeoverInAppActivity", "Can't parse notification URI, will not take any action", ((Throwable) (view)));
				//   49   96:ldc1            #71  <String "MixpanelAPI.TakeoverInAppActivity">
				//   50   98:ldc1            #93  <String "Can't parse notification URI, will not take any action">
				//   51  100:aload_1         
				//   52  101:invokestatic    #96  <Method void f.c(String, String, Throwable)>
						return;
				//   53  104:return          
					}
					try
					{
						view = ((View) (new Intent("android.intent.action.VIEW", ((Uri) (view)))));
						d.startActivity(((Intent) (view)));
					}
				//*  54  105:ldc1            #98  <String "primary">
				//*  55  107:astore_3        
				//*  56  108:aload_0         
				//*  57  109:getfield        #26  <Field InAppNotification b>
				//*  58  112:checkcast       #100 <Class TakeoverInAppNotification>
				//*  59  115:invokevirtual   #103 <Method int TakeoverInAppNotification.r()>
				//*  60  118:iconst_2        
				//*  61  119:icmpne          138
				//*  62  122:aload_0         
				//*  63  123:getfield        #28  <Field int c>
				//*  64  126:ifne            135
				//*  65  129:ldc1            #105 <String "secondary">
				//*  66  131:astore_3        
				//*  67  132:goto            138
				//*  68  135:ldc1            #98  <String "primary">
				//*  69  137:astore_3        
				//*  70  138:aload_1         
				//*  71  139:astore_2        
				//*  72  140:aload_1         
				//*  73  141:ifnonnull       152
				//*  74  144:new             #80  <Class JSONObject>
				//*  75  147:dup             
				//*  76  148:invokespecial   #81  <Method void JSONObject()>
				//*  77  151:astore_2        
				//*  78  152:aload_2         
				//*  79  153:astore_1        
				//*  80  154:aload_2         
				//*  81  155:ldc1            #107 <String "button">
				//*  82  157:aload_3         
				//*  83  158:invokevirtual   #87  <Method JSONObject JSONObject.put(String, Object)>
				//*  84  161:pop             
				//*  85  162:aload_2         
				//*  86  163:astore_1        
				//*  87  164:goto            174
				//*  88  167:ldc1            #71  <String "MixpanelAPI.TakeoverInAppActivity">
				//*  89  169:ldc1            #109 <String "Can't put button type into json properties">
				//*  90  171:invokestatic    #91  <Method void f.e(String, String)>
				//*  91  174:aload_0         
				//*  92  175:getfield        #22  <Field TakeoverInAppActivity d>
				//*  93  178:invokestatic    #112 <Method j TakeoverInAppActivity.b(TakeoverInAppActivity)>
				//*  94  181:invokevirtual   #117 <Method com.mixpanel.android.mpmetrics.j$c j.c()>
				//*  95  184:ldc1            #119 <String "$campaign_open">
				//*  96  186:aload_0         
				//*  97  187:getfield        #26  <Field InAppNotification b>
				//*  98  190:aload_1         
				//*  99  191:invokeinterface #124 <Method void com.mixpanel.android.mpmetrics.j$c.a(String, InAppNotification, JSONObject)>
				//* 100  196:aload_0         
				//* 101  197:getfield        #22  <Field TakeoverInAppActivity d>
				//* 102  200:invokevirtual   #127 <Method void TakeoverInAppActivity.finish()>
				//* 103  203:aload_0         
				//* 104  204:getfield        #22  <Field TakeoverInAppActivity d>
				//* 105  207:invokestatic    #130 <Method int TakeoverInAppActivity.a(TakeoverInAppActivity)>
				//* 106  210:invokestatic    #135 <Method void UpdateDisplayState.a(int)>
				//* 107  213:return          
					// Misplaced declaration of an exception variable
					catch(View view)
					{
						f.c("MixpanelAPI.TakeoverInAppActivity", "User doesn't have an activity for notification URI");
					}
					view = ((View) (new JSONObject()));
					((JSONObject) (view)).put("url", ((Object) (s1)));
					  goto _L2
_L5:
					f.e("MixpanelAPI.TakeoverInAppActivity", "Can't put url into json properties");
_L2:
					s = "primary";
					if(((TakeoverInAppNotification)b).r() == 2)
						if(c == 0)
							s = "secondary";
						else
							s = "primary";
					obj = ((Object) (view));
					if(view != null)
						break MISSING_BLOCK_LABEL_152;
					obj = ((Object) (new JSONObject()));
					view = ((View) (obj));
					((JSONObject) (obj)).put("button", ((Object) (s)));
					view = ((View) (obj));
					  goto _L4
_L6:
					f.e("MixpanelAPI.TakeoverInAppActivity", "Can't put button type into json properties");
_L4:
					TakeoverInAppActivity.b(d).c().a("$campaign_open", b, ((JSONObject) (view)));
					d.finish();
					UpdateDisplayState.a(TakeoverInAppActivity.a(d));
					return;
				//* 108  214:astore_1        
				//* 109  215:goto            58
					view;
				//  110  218:astore_1        
					view = ((View) (obj));
				//  111  219:aload_2         
				//  112  220:astore_1        
					  goto _L5
				//* 113  221:goto            85
					JSONException jsonexception;
					jsonexception;
				//  114  224:astore_2        
					  goto _L5
				//* 115  225:goto            85
					jsonexception;
				//  116  228:astore_2        
					  goto _L6
				//* 117  229:goto            167
				}

				final InAppButton a;
				final InAppNotification b;
				final int c;
				final TakeoverInAppActivity d;

			
			{
				d = TakeoverInAppActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field TakeoverInAppActivity d>
				a = inappbutton;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field InAppButton a>
				b = inappnotification;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field InAppNotification b>
				c = k;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #28  <Field int c>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #31  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//   70  145:aload_1         
	//   71  146:new             #10  <Class TakeoverInAppActivity$3>
	//   72  149:dup             
	//   73  150:aload_0         
	//   74  151:aload_2         
	//   75  152:aload_3         
	//   76  153:iload           4
	//   77  155:invokespecial   #309 <Method void TakeoverInAppActivity$3(TakeoverInAppActivity, InAppButton, InAppNotification, int)>
	//   78  158:invokevirtual   #310 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
			return;
	//   79  161:return          
		} else
		{
			button.setVisibility(8);
	//   80  162:aload_1         
	//   81  163:bipush          8
	//   82  165:invokevirtual   #246 <Method void Button.setVisibility(int)>
			return;
	//   83  168:return          
		}
	}

	private void a(ImageView imageview, TextView textview, TextView textview1, ArrayList arraylist, LinearLayout linearlayout)
	{
		ScaleAnimation scaleanimation = new ScaleAnimation(0.95F, 1.0F, 0.95F, 1.0F, 1, 0.5F, 1, 1.0F);
	//    0    0:new             #312 <Class ScaleAnimation>
	//    1    3:dup             
	//    2    4:ldc2            #313 <Float 0.95F>
	//    3    7:fconst_1        
	//    4    8:ldc2            #313 <Float 0.95F>
	//    5   11:fconst_1        
	//    6   12:iconst_1        
	//    7   13:ldc2            #314 <Float 0.5F>
	//    8   16:iconst_1        
	//    9   17:fconst_1        
	//   10   18:invokespecial   #317 <Method void ScaleAnimation(float, float, float, float, int, float, int, float)>
	//   11   21:astore          6
		scaleanimation.setDuration(200L);
	//   12   23:aload           6
	//   13   25:ldc2w           #318 <Long 200L>
	//   14   28:invokevirtual   #323 <Method void ScaleAnimation.setDuration(long)>
		imageview.startAnimation(((android.view.animation.Animation) (scaleanimation)));
	//   15   31:aload_1         
	//   16   32:aload           6
	//   17   34:invokevirtual   #327 <Method void ImageView.startAnimation(android.view.animation.Animation)>
		imageview = ((ImageView) (new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.5F, 1, 0.0F)));
	//   18   37:new             #329 <Class TranslateAnimation>
	//   19   40:dup             
	//   20   41:iconst_1        
	//   21   42:fconst_0        
	//   22   43:iconst_1        
	//   23   44:fconst_0        
	//   24   45:iconst_1        
	//   25   46:ldc2            #314 <Float 0.5F>
	//   26   49:iconst_1        
	//   27   50:fconst_0        
	//   28   51:invokespecial   #332 <Method void TranslateAnimation(int, float, int, float, int, float, int, float)>
	//   29   54:astore_1        
		((TranslateAnimation) (imageview)).setInterpolator(((android.view.animation.Interpolator) (new DecelerateInterpolator())));
	//   30   55:aload_1         
	//   31   56:new             #334 <Class DecelerateInterpolator>
	//   32   59:dup             
	//   33   60:invokespecial   #335 <Method void DecelerateInterpolator()>
	//   34   63:invokevirtual   #339 <Method void TranslateAnimation.setInterpolator(android.view.animation.Interpolator)>
		((TranslateAnimation) (imageview)).setDuration(200L);
	//   35   66:aload_1         
	//   36   67:ldc2w           #318 <Long 200L>
	//   37   70:invokevirtual   #340 <Method void TranslateAnimation.setDuration(long)>
		textview.startAnimation(((android.view.animation.Animation) (imageview)));
	//   38   73:aload_2         
	//   39   74:aload_1         
	//   40   75:invokevirtual   #341 <Method void TextView.startAnimation(android.view.animation.Animation)>
		textview1.startAnimation(((android.view.animation.Animation) (imageview)));
	//   41   78:aload_3         
	//   42   79:aload_1         
	//   43   80:invokevirtual   #341 <Method void TextView.startAnimation(android.view.animation.Animation)>
		for(textview = ((TextView) (arraylist.iterator())); ((Iterator) (textview)).hasNext(); ((Button)((Iterator) (textview)).next()).startAnimation(((android.view.animation.Animation) (imageview))));
	//   44   83:aload           4
	//   45   85:invokevirtual   #345 <Method Iterator ArrayList.iterator()>
	//   46   88:astore_2        
	//   47   89:aload_2         
	//   48   90:invokeinterface #350 <Method boolean Iterator.hasNext()>
	//   49   95:ifeq            114
	//   50   98:aload_2         
	//   51   99:invokeinterface #354 <Method Object Iterator.next()>
	//   52  104:checkcast       #70  <Class Button>
	//   53  107:aload_1         
	//   54  108:invokevirtual   #355 <Method void Button.startAnimation(android.view.animation.Animation)>
	//*  55  111:goto            89
		linearlayout.startAnimation(AnimationUtils.loadAnimation(((android.content.Context) (this)), com.mixpanel.android.a.a.com_mixpanel_android_fade_in));
	//   56  114:aload           5
	//   57  116:aload_0         
	//   58  117:getstatic       #360 <Field int com.mixpanel.android.a$a.com_mixpanel_android_fade_in>
	//   59  120:invokestatic    #366 <Method android.view.animation.Animation AnimationUtils.loadAnimation(android.content.Context, int)>
	//   60  123:invokevirtual   #367 <Method void LinearLayout.startAnimation(android.view.animation.Animation)>
	//   61  126:return          
	}

	static j b(TakeoverInAppActivity takeoverinappactivity)
	{
		return takeoverinappactivity.a;
	//    0    0:aload_0         
	//    1    1:getfield        #372 <Field j a>
	//    2    4:areturn         
	}

	public void onBackPressed()
	{
		UpdateDisplayState.a(c);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int c>
	//    2    4:invokestatic    #375 <Method void UpdateDisplayState.a(int)>
		super.onBackPressed();
	//    3    7:aload_0         
	//    4    8:invokespecial   #377 <Method void Activity.onBackPressed()>
	//    5   11:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #381 <Method void Activity.onCreate(Bundle)>
		c = getIntent().getIntExtra("com.mixpanel.android.takeoverinapp.TakeoverInAppActivity.INTENT_ID_KEY", 0x7fffffff);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #385 <Method Intent getIntent()>
	//    6   10:ldc2            #387 <String "com.mixpanel.android.takeoverinapp.TakeoverInAppActivity.INTENT_ID_KEY">
	//    7   13:ldc2            #388 <Int 0x7fffffff>
	//    8   16:invokevirtual   #394 <Method int Intent.getIntExtra(String, int)>
	//    9   19:putfield        #27  <Field int c>
		b = UpdateDisplayState.b(c);
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #27  <Field int c>
	//   13   27:invokestatic    #397 <Method UpdateDisplayState UpdateDisplayState.b(int)>
	//   14   30:putfield        #87  <Field UpdateDisplayState b>
		if(b == null)
	//*  15   33:aload_0         
	//*  16   34:getfield        #87  <Field UpdateDisplayState b>
	//*  17   37:ifnonnull       54
		{
			f.e("MixpanelAPI.TakeoverInAppActivity", "TakeoverInAppActivity intent received, but nothing was found to show.");
	//   18   40:ldc2            #399 <String "MixpanelAPI.TakeoverInAppActivity">
	//   19   43:ldc2            #401 <String "TakeoverInAppActivity intent received, but nothing was found to show.">
	//   20   46:invokestatic    #406 <Method void f.e(String, String)>
			finish();
	//   21   49:aload_0         
	//   22   50:invokevirtual   #409 <Method void finish()>
			return;
	//   23   53:return          
		} else
		{
			a = j.a(((android.content.Context) (this)), b.d());
	//   24   54:aload_0         
	//   25   55:aload_0         
	//   26   56:aload_0         
	//   27   57:getfield        #87  <Field UpdateDisplayState b>
	//   28   60:invokevirtual   #411 <Method String UpdateDisplayState.d()>
	//   29   63:invokestatic    #416 <Method j j.a(android.content.Context, String)>
	//   30   66:putfield        #372 <Field j a>
			a();
	//   31   69:aload_0         
	//   32   70:invokespecial   #418 <Method void a()>
			return;
	//   33   73:return          
		}
	}

	private j a;
	private UpdateDisplayState b;
	private int c;
}
