// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.*;
import com.appboy.enums.inappmessage.TextAlign;
import com.appboy.models.MessageButton;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.inappmessage.AppboyInAppMessageManager;
import com.appboy.ui.support.ViewUtils;
import java.util.List;

public class InAppMessageViewUtils
{

	public InAppMessageViewUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static void closeInAppMessageOnKeycodeBack()
	{
		AppboyLogger.d(TAG, "Back button intercepted by in-app message view, closing in-app message.");
	//    0    0:getstatic       #16  <Field String TAG>
	//    1    3:ldc1            #23  <String "Back button intercepted by in-app message view, closing in-app message.">
	//    2    5:invokestatic    #27  <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		AppboyInAppMessageManager.getInstance().hideCurrentlyDisplayingInAppMessage(true);
	//    4    9:invokestatic    #33  <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//    5   12:iconst_1        
	//    6   13:invokevirtual   #37  <Method void AppboyInAppMessageManager.hideCurrentlyDisplayingInAppMessage(boolean)>
	//    7   16:return          
	}

	public static boolean isValidIcon(String s)
	{
		return s != null;
	//    0    0:aload_0         
	//    1    1:ifnull          6
	//    2    4:iconst_1        
	//    3    5:ireturn         
	//    4    6:iconst_0        
	//    5    7:ireturn         
	}

	public static boolean isValidInAppMessageColor(int i)
	{
		return i != 0;
	//    0    0:iload_0         
	//    1    1:ifeq            6
	//    2    4:iconst_1        
	//    3    5:ireturn         
	//    4    6:iconst_0        
	//    5    7:ireturn         
	}

	protected static void resetButtonSizesIfNecessary(List list, List list1)
	{
		if(list1 != null && list1.size() == 1)
	//*   0    0:aload_1         
	//*   1    1:ifnull          40
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #49  <Method int List.size()>
	//*   4   10:iconst_1        
	//*   5   11:icmpne          40
		{
			list1 = ((List) (new android.widget.LinearLayout.LayoutParams(0, -2, 1.0F)));
	//    6   14:new             #51  <Class android.widget.LinearLayout$LayoutParams>
	//    7   17:dup             
	//    8   18:iconst_0        
	//    9   19:bipush          -2
	//   10   21:fconst_1        
	//   11   22:invokespecial   #54  <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
	//   12   25:astore_1        
			((View)list.get(0)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (list1)));
	//   13   26:aload_0         
	//   14   27:iconst_0        
	//   15   28:invokeinterface #58  <Method Object List.get(int)>
	//   16   33:checkcast       #60  <Class View>
	//   17   36:aload_1         
	//   18   37:invokevirtual   #64  <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		}
	//   19   40:return          
	}

	protected static void resetMessageMarginsIfNecessary(TextView textview, TextView textview1)
	{
		if(textview1 == null && textview != null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       43
	//*   2    4:aload_0         
	//*   3    5:ifnull          43
		{
			textview1 = ((TextView) (new android.widget.LinearLayout.LayoutParams(textview.getLayoutParams().width, textview.getLayoutParams().height)));
	//    4    8:new             #51  <Class android.widget.LinearLayout$LayoutParams>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #74  <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//    8   16:getfield        #80  <Field int android.view.ViewGroup$LayoutParams.width>
	//    9   19:aload_0         
	//   10   20:invokevirtual   #74  <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//   11   23:getfield        #83  <Field int android.view.ViewGroup$LayoutParams.height>
	//   12   26:invokespecial   #86  <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//   13   29:astore_1        
			((android.widget.LinearLayout.LayoutParams) (textview1)).setMargins(0, 0, 0, 0);
	//   14   30:aload_1         
	//   15   31:iconst_0        
	//   16   32:iconst_0        
	//   17   33:iconst_0        
	//   18   34:iconst_0        
	//   19   35:invokevirtual   #90  <Method void android.widget.LinearLayout$LayoutParams.setMargins(int, int, int, int)>
			textview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (textview1)));
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #91  <Method void TextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		}
	//   23   43:return          
	}

	public static void setButtons(List list, View view, int i, List list1)
	{
		if(list1 != null && list1.size() != 0)
	//*   0    0:aload_3         
	//*   1    1:ifnull          140
	//*   2    4:aload_3         
	//*   3    5:invokeinterface #49  <Method int List.size()>
	//*   4   10:ifne            16
	//*   5   13:goto            140
		{
			for(int j = 0; j < list.size(); j++)
	//*   6   16:iconst_0        
	//*   7   17:istore          4
	//*   8   19:iload           4
	//*   9   21:aload_0         
	//*  10   22:invokeinterface #49  <Method int List.size()>
	//*  11   27:icmpge          139
			{
				if(list1.size() <= j)
	//*  12   30:aload_3         
	//*  13   31:invokeinterface #49  <Method int List.size()>
	//*  14   36:iload           4
	//*  15   38:icmpgt          60
				{
					((View)list.get(j)).setVisibility(8);
	//   16   41:aload_0         
	//   17   42:iload           4
	//   18   44:invokeinterface #58  <Method Object List.get(int)>
	//   19   49:checkcast       #60  <Class View>
	//   20   52:bipush          8
	//   21   54:invokevirtual   #97  <Method void View.setVisibility(int)>
					continue;
	//   22   57:goto            130
				}
				if(list.get(j) instanceof Button)
	//*  23   60:aload_0         
	//*  24   61:iload           4
	//*  25   63:invokeinterface #58  <Method Object List.get(int)>
	//*  26   68:instanceof      #99  <Class Button>
	//*  27   71:ifeq            130
				{
					view = ((View) ((Button)list.get(j)));
	//   28   74:aload_0         
	//   29   75:iload           4
	//   30   77:invokeinterface #58  <Method Object List.get(int)>
	//   31   82:checkcast       #99  <Class Button>
	//   32   85:astore_1        
					MessageButton messagebutton = (MessageButton)list1.get(j);
	//   33   86:aload_3         
	//   34   87:iload           4
	//   35   89:invokeinterface #58  <Method Object List.get(int)>
	//   36   94:checkcast       #101 <Class MessageButton>
	//   37   97:astore          5
					((Button) (view)).setText(((CharSequence) (messagebutton.getText())));
	//   38   99:aload_1         
	//   39  100:aload           5
	//   40  102:invokevirtual   #105 <Method String MessageButton.getText()>
	//   41  105:invokevirtual   #109 <Method void Button.setText(CharSequence)>
					setTextViewColor(((TextView) (view)), messagebutton.getTextColor());
	//   42  108:aload_1         
	//   43  109:aload           5
	//   44  111:invokevirtual   #112 <Method int MessageButton.getTextColor()>
	//   45  114:invokestatic    #116 <Method void setTextViewColor(TextView, int)>
					setDrawableColor(((Button) (view)).getBackground(), messagebutton.getBackgroundColor(), i);
	//   46  117:aload_1         
	//   47  118:invokevirtual   #120 <Method Drawable Button.getBackground()>
	//   48  121:aload           5
	//   49  123:invokevirtual   #123 <Method int MessageButton.getBackgroundColor()>
	//   50  126:iload_2         
	//   51  127:invokestatic    #127 <Method void setDrawableColor(Drawable, int, int)>
				}
			}

	//   52  130:iload           4
	//   53  132:iconst_1        
	//   54  133:iadd            
	//   55  134:istore          4
	//*  56  136:goto            19
			return;
	//   57  139:return          
		} else
		{
			ViewUtils.removeViewFromParent(view);
	//   58  140:aload_1         
	//   59  141:invokestatic    #133 <Method void ViewUtils.removeViewFromParent(View)>
			return;
	//   60  144:return          
		}
	}

	public static void setDrawableColor(Drawable drawable, int i, int j)
	{
		if(drawable instanceof GradientDrawable)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #136 <Class GradientDrawable>
	//*   2    4:ifeq            17
		{
			setDrawableColor((GradientDrawable)drawable, i, j);
	//    3    7:aload_0         
	//    4    8:checkcast       #136 <Class GradientDrawable>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:invokestatic    #139 <Method void setDrawableColor(GradientDrawable, int, int)>
			return;
	//    8   16:return          
		}
		if(isValidInAppMessageColor(i))
	//*   9   17:iload_1         
	//*  10   18:invokestatic    #141 <Method boolean isValidInAppMessageColor(int)>
	//*  11   21:ifeq            33
		{
			drawable.setColorFilter(i, android.graphics.PorterDuff.Mode.MULTIPLY);
	//   12   24:aload_0         
	//   13   25:iload_1         
	//   14   26:getstatic       #147 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//   15   29:invokevirtual   #153 <Method void Drawable.setColorFilter(int, android.graphics.PorterDuff$Mode)>
			return;
	//   16   32:return          
		} else
		{
			drawable.setColorFilter(j, android.graphics.PorterDuff.Mode.MULTIPLY);
	//   17   33:aload_0         
	//   18   34:iload_2         
	//   19   35:getstatic       #147 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//   20   38:invokevirtual   #153 <Method void Drawable.setColorFilter(int, android.graphics.PorterDuff$Mode)>
			return;
	//   21   41:return          
		}
	}

	public static void setDrawableColor(GradientDrawable gradientdrawable, int i, int j)
	{
		if(isValidInAppMessageColor(i))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #141 <Method boolean isValidInAppMessageColor(int)>
	//*   2    4:ifeq            13
		{
			gradientdrawable.setColor(i);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokevirtual   #156 <Method void GradientDrawable.setColor(int)>
			return;
	//    6   12:return          
		} else
		{
			gradientdrawable.setColor(j);
	//    7   13:aload_0         
	//    8   14:iload_2         
	//    9   15:invokevirtual   #156 <Method void GradientDrawable.setColor(int)>
			return;
	//   10   18:return          
		}
	}

	public static void setFrameColor(View view, Integer integer)
	{
		if(integer != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
			view.setBackgroundColor(integer.intValue());
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #163 <Method int Integer.intValue()>
	//    5    9:invokevirtual   #166 <Method void View.setBackgroundColor(int)>
	//    6   12:return          
	}

	public static void setIcon(Context context, String s, int i, int j, TextView textview)
	{
		if(isValidIcon(s))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #172 <Method boolean isValidIcon(String)>
	//*   2    4:ifeq            80
		{
			try
			{
				textview.setTypeface(Typeface.createFromAsset(context.getAssets(), "fontawesome-webfont.ttf"));
	//    3    7:aload           4
	//    4    9:aload_0         
	//    5   10:invokevirtual   #178 <Method android.content.res.AssetManager Context.getAssets()>
	//    6   13:ldc1            #180 <String "fontawesome-webfont.ttf">
	//    7   15:invokestatic    #186 <Method Typeface Typeface.createFromAsset(android.content.res.AssetManager, String)>
	//    8   18:invokevirtual   #190 <Method void TextView.setTypeface(Typeface)>
			}
	//*   9   21:aload           4
	//*  10   23:aload_1         
	//*  11   24:invokevirtual   #191 <Method void TextView.setText(CharSequence)>
	//*  12   27:aload           4
	//*  13   29:iload_2         
	//*  14   30:invokestatic    #116 <Method void setTextViewColor(TextView, int)>
	//*  15   33:aload           4
	//*  16   35:invokevirtual   #192 <Method Drawable TextView.getBackground()>
	//*  17   38:ifnull          61
	//*  18   41:aload           4
	//*  19   43:invokevirtual   #192 <Method Drawable TextView.getBackground()>
	//*  20   46:iload_3         
	//*  21   47:aload_0         
	//*  22   48:invokevirtual   #196 <Method Resources Context.getResources()>
	//*  23   51:getstatic       #201 <Field int com.appboy.ui.R$color.com_appboy_inappmessage_icon_background>
	//*  24   54:invokevirtual   #207 <Method int Resources.getColor(int)>
	//*  25   57:invokestatic    #127 <Method void setDrawableColor(Drawable, int, int)>
	//*  26   60:return          
	//*  27   61:aload           4
	//*  28   63:iload_3         
	//*  29   64:invokestatic    #211 <Method void setViewBackgroundColor(View, int)>
	//*  30   67:return          
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  31   68:astore_0        
			{
				AppboyLogger.e(TAG, "Caught exception setting icon typeface. Not rendering icon.", ((Throwable) (context)));
	//   32   69:getstatic       #16  <Field String TAG>
	//   33   72:ldc1            #213 <String "Caught exception setting icon typeface. Not rendering icon.">
	//   34   74:aload_0         
	//   35   75:invokestatic    #217 <Method int AppboyLogger.e(String, String, Throwable)>
	//   36   78:pop             
				return;
	//   37   79:return          
			}
			textview.setText(((CharSequence) (s)));
			setTextViewColor(textview, i);
			if(textview.getBackground() != null)
			{
				setDrawableColor(textview.getBackground(), j, context.getResources().getColor(com.appboy.ui.R.color.com_appboy_inappmessage_icon_background));
				return;
			} else
			{
				setViewBackgroundColor(((View) (textview)), j);
				return;
			}
		} else
		{
			return;
	//   38   80:return          
		}
	}

	public static void setImage(Bitmap bitmap, ImageView imageview)
	{
		if(bitmap != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          9
			imageview.setImageBitmap(bitmap);
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #225 <Method void ImageView.setImageBitmap(Bitmap)>
	//    5    9:return          
	}

	public static void setTextAlignment(TextView textview, TextAlign textalign)
	{
		if(textalign.equals(((Object) (TextAlign.START))))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #233 <Field TextAlign TextAlign.START>
	//*   2    4:invokevirtual   #237 <Method boolean TextAlign.equals(Object)>
	//*   3    7:ifeq            17
		{
			textview.setGravity(0x800003);
	//    4   10:aload_0         
	//    5   11:ldc1            #238 <Int 0x800003>
	//    6   13:invokevirtual   #241 <Method void TextView.setGravity(int)>
			return;
	//    7   16:return          
		}
		if(textalign.equals(((Object) (TextAlign.END))))
	//*   8   17:aload_1         
	//*   9   18:getstatic       #244 <Field TextAlign TextAlign.END>
	//*  10   21:invokevirtual   #237 <Method boolean TextAlign.equals(Object)>
	//*  11   24:ifeq            34
		{
			textview.setGravity(0x800005);
	//   12   27:aload_0         
	//   13   28:ldc1            #245 <Int 0x800005>
	//   14   30:invokevirtual   #241 <Method void TextView.setGravity(int)>
			return;
	//   15   33:return          
		}
		if(textalign.equals(((Object) (TextAlign.CENTER))))
	//*  16   34:aload_1         
	//*  17   35:getstatic       #248 <Field TextAlign TextAlign.CENTER>
	//*  18   38:invokevirtual   #237 <Method boolean TextAlign.equals(Object)>
	//*  19   41:ifeq            50
			textview.setGravity(17);
	//   20   44:aload_0         
	//   21   45:bipush          17
	//   22   47:invokevirtual   #241 <Method void TextView.setGravity(int)>
	//   23   50:return          
	}

	public static void setTextViewColor(TextView textview, int i)
	{
		if(isValidInAppMessageColor(i))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #141 <Method boolean isValidInAppMessageColor(int)>
	//*   2    4:ifeq            12
			textview.setTextColor(i);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokevirtual   #251 <Method void TextView.setTextColor(int)>
	//    6   12:return          
	}

	public static void setViewBackgroundColor(View view, int i)
	{
		if(isValidInAppMessageColor(i))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #141 <Method boolean isValidInAppMessageColor(int)>
	//*   2    4:ifeq            12
			view.setBackgroundColor(i);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokevirtual   #166 <Method void View.setBackgroundColor(int)>
	//    6   12:return          
	}

	public static void setViewBackgroundColorFilter(View view, int i, int j)
	{
		if(isValidInAppMessageColor(i))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #141 <Method boolean isValidInAppMessageColor(int)>
	//*   2    4:ifeq            19
		{
			view.getBackground().setColorFilter(i, android.graphics.PorterDuff.Mode.MULTIPLY);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #254 <Method Drawable View.getBackground()>
	//    5   11:iload_1         
	//    6   12:getstatic       #147 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//    7   15:invokevirtual   #153 <Method void Drawable.setColorFilter(int, android.graphics.PorterDuff$Mode)>
			return;
	//    8   18:return          
		} else
		{
			view.getBackground().setColorFilter(j, android.graphics.PorterDuff.Mode.MULTIPLY);
	//    9   19:aload_0         
	//   10   20:invokevirtual   #254 <Method Drawable View.getBackground()>
	//   11   23:iload_2         
	//   12   24:getstatic       #147 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//   13   27:invokevirtual   #153 <Method void Drawable.setColorFilter(int, android.graphics.PorterDuff$Mode)>
			return;
	//   14   30:return          
		}
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/inappmessage/views/InAppMessageViewUtils);

	static 
	{
	//    0    0:ldc1            #2   <Class InAppMessageViewUtils>
	//    1    2:invokestatic    #14  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #16  <Field String TAG>
	//*   3    8:return          
	}
}
