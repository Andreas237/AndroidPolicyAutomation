// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.*;
import android.widget.*;
import java.lang.ref.WeakReference;

public class ToolTipPopup
{
	private class PopupContentView extends FrameLayout
	{

		private void init()
		{
			LayoutInflater.from(getContext()).inflate(com.facebook.login.R.layout.com_facebook_tooltip_bubble, ((android.view.ViewGroup) (this)));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #45  <Method Context getContext()>
		//    2    4:invokestatic    #51  <Method LayoutInflater LayoutInflater.from(Context)>
		//    3    7:getstatic       #57  <Field int com.facebook.login.R$layout.com_facebook_tooltip_bubble>
		//    4   10:aload_0         
		//    5   11:invokevirtual   #61  <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
		//    6   14:pop             
			topArrow = (ImageView)findViewById(com.facebook.login.R.id.com_facebook_tooltip_bubble_view_top_pointer);
		//    7   15:aload_0         
		//    8   16:aload_0         
		//    9   17:getstatic       #66  <Field int com.facebook.login.R$id.com_facebook_tooltip_bubble_view_top_pointer>
		//   10   20:invokevirtual   #70  <Method View findViewById(int)>
		//   11   23:checkcast       #72  <Class ImageView>
		//   12   26:putfield        #38  <Field ImageView topArrow>
			bottomArrow = (ImageView)findViewById(com.facebook.login.R.id.com_facebook_tooltip_bubble_view_bottom_pointer);
		//   13   29:aload_0         
		//   14   30:aload_0         
		//   15   31:getstatic       #75  <Field int com.facebook.login.R$id.com_facebook_tooltip_bubble_view_bottom_pointer>
		//   16   34:invokevirtual   #70  <Method View findViewById(int)>
		//   17   37:checkcast       #72  <Class ImageView>
		//   18   40:putfield        #35  <Field ImageView bottomArrow>
			bodyFrame = findViewById(com.facebook.login.R.id.com_facebook_body_frame);
		//   19   43:aload_0         
		//   20   44:aload_0         
		//   21   45:getstatic       #78  <Field int com.facebook.login.R$id.com_facebook_body_frame>
		//   22   48:invokevirtual   #70  <Method View findViewById(int)>
		//   23   51:putfield        #31  <Field View bodyFrame>
			xOut = (ImageView)findViewById(com.facebook.login.R.id.com_facebook_button_xout);
		//   24   54:aload_0         
		//   25   55:aload_0         
		//   26   56:getstatic       #81  <Field int com.facebook.login.R$id.com_facebook_button_xout>
		//   27   59:invokevirtual   #70  <Method View findViewById(int)>
		//   28   62:checkcast       #72  <Class ImageView>
		//   29   65:putfield        #41  <Field ImageView xOut>
		//   30   68:return          
		}

		public void showBottomArrow()
		{
			topArrow.setVisibility(4);
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field ImageView topArrow>
		//    2    4:iconst_4        
		//    3    5:invokevirtual   #86  <Method void ImageView.setVisibility(int)>
			bottomArrow.setVisibility(0);
		//    4    8:aload_0         
		//    5    9:getfield        #35  <Field ImageView bottomArrow>
		//    6   12:iconst_0        
		//    7   13:invokevirtual   #86  <Method void ImageView.setVisibility(int)>
		//    8   16:return          
		}

		public void showTopArrow()
		{
			topArrow.setVisibility(0);
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field ImageView topArrow>
		//    2    4:iconst_0        
		//    3    5:invokevirtual   #86  <Method void ImageView.setVisibility(int)>
			bottomArrow.setVisibility(4);
		//    4    8:aload_0         
		//    5    9:getfield        #35  <Field ImageView bottomArrow>
		//    6   12:iconst_4        
		//    7   13:invokevirtual   #86  <Method void ImageView.setVisibility(int)>
		//    8   16:return          
		}

		private View bodyFrame;
		private ImageView bottomArrow;
		final ToolTipPopup this$0;
		private ImageView topArrow;
		private ImageView xOut;


/*
		static View access$300(PopupContentView popupcontentview)
		{
			return popupcontentview.bodyFrame;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field View bodyFrame>
		//    2    4:areturn         
		}

*/


/*
		static ImageView access$400(PopupContentView popupcontentview)
		{
			return popupcontentview.bottomArrow;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field ImageView bottomArrow>
		//    2    4:areturn         
		}

*/


/*
		static ImageView access$500(PopupContentView popupcontentview)
		{
			return popupcontentview.topArrow;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field ImageView topArrow>
		//    2    4:areturn         
		}

*/


/*
		static ImageView access$600(PopupContentView popupcontentview)
		{
			return popupcontentview.xOut;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field ImageView xOut>
		//    2    4:areturn         
		}

*/

		public PopupContentView(Context context)
		{
			this$0 = ToolTipPopup.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field ToolTipPopup this$0>
			super(context);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #22  <Method void FrameLayout(Context)>
			init();
		//    6   10:aload_0         
		//    7   11:invokespecial   #26  <Method void init()>
		//    8   14:return          
		}
	}

	public static final class Style extends Enum
	{

		public static Style valueOf(String s)
		{
			return (Style)Enum.valueOf(com/facebook/login/widget/ToolTipPopup$Style, s);
		//    0    0:ldc1            #2   <Class ToolTipPopup$Style>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ToolTipPopup$Style>
		//    4    9:areturn         
		}

		public static Style[] values()
		{
			return (Style[])((Style []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field ToolTipPopup$Style[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.login.widget.ToolTipPopup$Style_3B_.clone()>
		//    2    6:checkcast       #38  <Class ToolTipPopup$Style[]>
		//    3    9:areturn         
		}

		private static final Style $VALUES[];
		public static final Style BLACK;
		public static final Style BLUE;

		static 
		{
			BLUE = new Style("BLUE", 0);
		//    0    0:new             #2   <Class ToolTipPopup$Style>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "BLUE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void ToolTipPopup$Style(String, int)>
		//    5   10:putstatic       #22  <Field ToolTipPopup$Style BLUE>
			BLACK = new Style("BLACK", 1);
		//    6   13:new             #2   <Class ToolTipPopup$Style>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "BLACK">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void ToolTipPopup$Style(String, int)>
		//   11   23:putstatic       #25  <Field ToolTipPopup$Style BLACK>
			$VALUES = (new Style[] {
				BLUE, BLACK
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       Style[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field ToolTipPopup$Style BLUE>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field ToolTipPopup$Style BLACK>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field ToolTipPopup$Style[] $VALUES>
		//*  23   45:return          
		}

		private Style(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public ToolTipPopup(String s, View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		mStyle = Style.BLUE;
	//    2    4:aload_0         
	//    3    5:getstatic       #44  <Field ToolTipPopup$Style ToolTipPopup$Style.BLUE>
	//    4    8:putfield        #46  <Field ToolTipPopup$Style mStyle>
		mNuxDisplayTime = 6000L;
	//    5   11:aload_0         
	//    6   12:ldc2w           #19  <Long 6000L>
	//    7   15:putfield        #48  <Field long mNuxDisplayTime>
	//    8   18:aload_0         
	//    9   19:new             #6   <Class ToolTipPopup$1>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #51  <Method void ToolTipPopup$1(ToolTipPopup)>
	//   13   27:putfield        #53  <Field android.view.ViewTreeObserver$OnScrollChangedListener mScrollListener>
		mText = s;
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:putfield        #55  <Field String mText>
		mAnchorViewRef = new WeakReference(((Object) (view)));
	//   17   35:aload_0         
	//   18   36:new             #57  <Class WeakReference>
	//   19   39:dup             
	//   20   40:aload_2         
	//   21   41:invokespecial   #60  <Method void WeakReference(Object)>
	//   22   44:putfield        #62  <Field WeakReference mAnchorViewRef>
		mContext = view.getContext();
	//   23   47:aload_0         
	//   24   48:aload_2         
	//   25   49:invokevirtual   #68  <Method Context View.getContext()>
	//   26   52:putfield        #70  <Field Context mContext>
	//   27   55:return          
	}

	private void registerObserver()
	{
		unregisterObserver();
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void unregisterObserver()>
		if(mAnchorViewRef.get() != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #62  <Field WeakReference mAnchorViewRef>
	//*   4    8:invokevirtual   #89  <Method Object WeakReference.get()>
	//*   5   11:ifnull          34
			((View)mAnchorViewRef.get()).getViewTreeObserver().addOnScrollChangedListener(mScrollListener);
	//    6   14:aload_0         
	//    7   15:getfield        #62  <Field WeakReference mAnchorViewRef>
	//    8   18:invokevirtual   #89  <Method Object WeakReference.get()>
	//    9   21:checkcast       #64  <Class View>
	//   10   24:invokevirtual   #93  <Method ViewTreeObserver View.getViewTreeObserver()>
	//   11   27:aload_0         
	//   12   28:getfield        #53  <Field android.view.ViewTreeObserver$OnScrollChangedListener mScrollListener>
	//   13   31:invokevirtual   #99  <Method void ViewTreeObserver.addOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
	//   14   34:return          
	}

	private void unregisterObserver()
	{
		if(mAnchorViewRef.get() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field WeakReference mAnchorViewRef>
	//*   2    4:invokevirtual   #89  <Method Object WeakReference.get()>
	//*   3    7:ifnull          30
			((View)mAnchorViewRef.get()).getViewTreeObserver().removeOnScrollChangedListener(mScrollListener);
	//    4   10:aload_0         
	//    5   11:getfield        #62  <Field WeakReference mAnchorViewRef>
	//    6   14:invokevirtual   #89  <Method Object WeakReference.get()>
	//    7   17:checkcast       #64  <Class View>
	//    8   20:invokevirtual   #93  <Method ViewTreeObserver View.getViewTreeObserver()>
	//    9   23:aload_0         
	//   10   24:getfield        #53  <Field android.view.ViewTreeObserver$OnScrollChangedListener mScrollListener>
	//   11   27:invokevirtual   #102 <Method void ViewTreeObserver.removeOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
	//   12   30:return          
	}

	private void updateArrows()
	{
		PopupWindow popupwindow = mPopupWindow;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field PopupWindow mPopupWindow>
	//    2    4:astore_1        
		if(popupwindow != null && popupwindow.isShowing())
	//*   3    5:aload_1         
	//*   4    6:ifnull          41
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #109 <Method boolean PopupWindow.isShowing()>
	//*   7   13:ifeq            41
		{
			if(mPopupWindow.isAboveAnchor())
	//*   8   16:aload_0         
	//*   9   17:getfield        #77  <Field PopupWindow mPopupWindow>
	//*  10   20:invokevirtual   #112 <Method boolean PopupWindow.isAboveAnchor()>
	//*  11   23:ifeq            34
			{
				mPopupContent.showBottomArrow();
	//   12   26:aload_0         
	//   13   27:getfield        #81  <Field ToolTipPopup$PopupContentView mPopupContent>
	//   14   30:invokevirtual   #115 <Method void ToolTipPopup$PopupContentView.showBottomArrow()>
				return;
	//   15   33:return          
			}
			mPopupContent.showTopArrow();
	//   16   34:aload_0         
	//   17   35:getfield        #81  <Field ToolTipPopup$PopupContentView mPopupContent>
	//   18   38:invokevirtual   #118 <Method void ToolTipPopup$PopupContentView.showTopArrow()>
		}
	//   19   41:return          
	}

	public void dismiss()
	{
		unregisterObserver();
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void unregisterObserver()>
		PopupWindow popupwindow = mPopupWindow;
	//    2    4:aload_0         
	//    3    5:getfield        #77  <Field PopupWindow mPopupWindow>
	//    4    8:astore_1        
		if(popupwindow != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          17
			popupwindow.dismiss();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #121 <Method void PopupWindow.dismiss()>
	//    9   17:return          
	}

	public void setNuxDisplayTime(long l)
	{
		mNuxDisplayTime = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #48  <Field long mNuxDisplayTime>
	//    3    5:return          
	}

	public void setStyle(Style style)
	{
		mStyle = style;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field ToolTipPopup$Style mStyle>
	//    3    5:return          
	}

	public void show()
	{
		if(mAnchorViewRef.get() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field WeakReference mAnchorViewRef>
	//*   2    4:invokevirtual   #89  <Method Object WeakReference.get()>
	//*   3    7:ifnull          311
		{
			mPopupContent = new PopupContentView(mContext);
	//    4   10:aload_0         
	//    5   11:new             #12  <Class ToolTipPopup$PopupContentView>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field Context mContext>
	//   10   20:invokespecial   #129 <Method void ToolTipPopup$PopupContentView(ToolTipPopup, Context)>
	//   11   23:putfield        #81  <Field ToolTipPopup$PopupContentView mPopupContent>
			((TextView)mPopupContent.findViewById(com.facebook.login.R.id.com_facebook_tooltip_bubble_view_text_body)).setText(((CharSequence) (mText)));
	//   12   26:aload_0         
	//   13   27:getfield        #81  <Field ToolTipPopup$PopupContentView mPopupContent>
	//   14   30:getstatic       #135 <Field int com.facebook.login.R$id.com_facebook_tooltip_bubble_view_text_body>
	//   15   33:invokevirtual   #139 <Method View ToolTipPopup$PopupContentView.findViewById(int)>
	//   16   36:checkcast       #141 <Class TextView>
	//   17   39:aload_0         
	//   18   40:getfield        #55  <Field String mText>
	//   19   43:invokevirtual   #145 <Method void TextView.setText(CharSequence)>
			if(mStyle == Style.BLUE)
	//*  20   46:aload_0         
	//*  21   47:getfield        #46  <Field ToolTipPopup$Style mStyle>
	//*  22   50:getstatic       #44  <Field ToolTipPopup$Style ToolTipPopup$Style.BLUE>
	//*  23   53:if_acmpne       111
			{
				mPopupContent.bodyFrame.setBackgroundResource(com.facebook.login.R.drawable.com_facebook_tooltip_blue_background);
	//   24   56:aload_0         
	//   25   57:getfield        #81  <Field ToolTipPopup$PopupContentView mPopupContent>
	//   26   60:invokestatic    #149 <Method View ToolTipPopup$PopupContentView.access$300(ToolTipPopup$PopupContentView)>
	//   27   63:getstatic       #154 <Field int com.facebook.login.R$drawable.com_facebook_tooltip_blue_background>
	//   28   66:invokevirtual   #158 <Method void View.setBackgroundResource(int)>
				mPopupContent.bottomArrow.setImageResource(com.facebook.login.R.drawable.com_facebook_tooltip_blue_bottomnub);
	//   29   69:aload_0         
	//   30   70:getfield        #81  <Field ToolTipPopup$PopupContentView mPopupContent>
	//   31   73:invokestatic    #162 <Method ImageView ToolTipPopup$PopupContentView.access$400(ToolTipPopup$PopupContentView)>
	//   32   76:getstatic       #165 <Field int com.facebook.login.R$drawable.com_facebook_tooltip_blue_bottomnub>
	//   33   79:invokevirtual   #170 <Method void ImageView.setImageResource(int)>
				mPopupContent.topArrow.setImageResource(com.facebook.login.R.drawable.com_facebook_tooltip_blue_topnub);
	//   34   82:aload_0         
	//   35   83:getfield        #81  <Field ToolTipPopup$PopupContentView mPopupContent>
	//   36   86:invokestatic    #173 <Method ImageView ToolTipPopup$PopupContentView.access$500(ToolTipPopup$PopupContentView)>
	//   37   89:getstatic       #176 <Field int com.facebook.login.R$drawable.com_facebook_tooltip_blue_topnub>
	//   38   92:invokevirtual   #170 <Method void ImageView.setImageResource(int)>
				mPopupContent.xOut.setImageResource(com.facebook.login.R.drawable.com_facebook_tooltip_blue_xout);
	//   39   95:aload_0         
	//   40   96:getfield        #81  <Field ToolTipPopup$PopupContentView mPopupContent>
	//   41   99:invokestatic    #179 <Method ImageView ToolTipPopup$PopupContentView.access$600(ToolTipPopup$PopupContentView)>
	//   42  102:getstatic       #182 <Field int com.facebook.login.R$drawable.com_facebook_tooltip_blue_xout>
	//   43  105:invokevirtual   #170 <Method void ImageView.setImageResource(int)>
			} else
	//*  44  108:goto            163
			{
				mPopupContent.bodyFrame.setBackgroundResource(com.facebook.login.R.drawable.com_facebook_tooltip_black_background);
	//   45  111:aload_0         
	//   46  112:getfield        #81  <Field ToolTipPopup$PopupContentView mPopupContent>
	//   47  115:invokestatic    #149 <Method View ToolTipPopup$PopupContentView.access$300(ToolTipPopup$PopupContentView)>
	//   48  118:getstatic       #185 <Field int com.facebook.login.R$drawable.com_facebook_tooltip_black_background>
	//   49  121:invokevirtual   #158 <Method void View.setBackgroundResource(int)>
				mPopupContent.bottomArrow.setImageResource(com.facebook.login.R.drawable.com_facebook_tooltip_black_bottomnub);
	//   50  124:aload_0         
	//   51  125:getfield        #81  <Field ToolTipPopup$PopupContentView mPopupContent>
	//   52  128:invokestatic    #162 <Method ImageView ToolTipPopup$PopupContentView.access$400(ToolTipPopup$PopupContentView)>
	//   53  131:getstatic       #188 <Field int com.facebook.login.R$drawable.com_facebook_tooltip_black_bottomnub>
	//   54  134:invokevirtual   #170 <Method void ImageView.setImageResource(int)>
				mPopupContent.topArrow.setImageResource(com.facebook.login.R.drawable.com_facebook_tooltip_black_topnub);
	//   55  137:aload_0         
	//   56  138:getfield        #81  <Field ToolTipPopup$PopupContentView mPopupContent>
	//   57  141:invokestatic    #173 <Method ImageView ToolTipPopup$PopupContentView.access$500(ToolTipPopup$PopupContentView)>
	//   58  144:getstatic       #191 <Field int com.facebook.login.R$drawable.com_facebook_tooltip_black_topnub>
	//   59  147:invokevirtual   #170 <Method void ImageView.setImageResource(int)>
				mPopupContent.xOut.setImageResource(com.facebook.login.R.drawable.com_facebook_tooltip_black_xout);
	//   60  150:aload_0         
	//   61  151:getfield        #81  <Field ToolTipPopup$PopupContentView mPopupContent>
	//   62  154:invokestatic    #179 <Method ImageView ToolTipPopup$PopupContentView.access$600(ToolTipPopup$PopupContentView)>
	//   63  157:getstatic       #194 <Field int com.facebook.login.R$drawable.com_facebook_tooltip_black_xout>
	//   64  160:invokevirtual   #170 <Method void ImageView.setImageResource(int)>
			}
			Object obj = ((Object) (((Activity)mContext).getWindow().getDecorView()));
	//   65  163:aload_0         
	//   66  164:getfield        #70  <Field Context mContext>
	//   67  167:checkcast       #196 <Class Activity>
	//   68  170:invokevirtual   #200 <Method Window Activity.getWindow()>
	//   69  173:invokevirtual   #206 <Method View Window.getDecorView()>
	//   70  176:astore_3        
			int i = ((View) (obj)).getWidth();
	//   71  177:aload_3         
	//   72  178:invokevirtual   #210 <Method int View.getWidth()>
	//   73  181:istore_1        
			int j = ((View) (obj)).getHeight();
	//   74  182:aload_3         
	//   75  183:invokevirtual   #213 <Method int View.getHeight()>
	//   76  186:istore_2        
			registerObserver();
	//   77  187:aload_0         
	//   78  188:invokespecial   #215 <Method void registerObserver()>
			mPopupContent.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(j, 0x80000000));
	//   79  191:aload_0         
	//   80  192:getfield        #81  <Field ToolTipPopup$PopupContentView mPopupContent>
	//   81  195:iload_1         
	//   82  196:ldc1            #216 <Int 0x80000000>
	//   83  198:invokestatic    #222 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   84  201:iload_2         
	//   85  202:ldc1            #216 <Int 0x80000000>
	//   86  204:invokestatic    #222 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   87  207:invokevirtual   #226 <Method void ToolTipPopup$PopupContentView.measure(int, int)>
			obj = ((Object) (mPopupContent));
	//   88  210:aload_0         
	//   89  211:getfield        #81  <Field ToolTipPopup$PopupContentView mPopupContent>
	//   90  214:astore_3        
			mPopupWindow = new PopupWindow(((View) (obj)), ((PopupContentView) (obj)).getMeasuredWidth(), mPopupContent.getMeasuredHeight());
	//   91  215:aload_0         
	//   92  216:new             #105 <Class PopupWindow>
	//   93  219:dup             
	//   94  220:aload_3         
	//   95  221:aload_3         
	//   96  222:invokevirtual   #229 <Method int ToolTipPopup$PopupContentView.getMeasuredWidth()>
	//   97  225:aload_0         
	//   98  226:getfield        #81  <Field ToolTipPopup$PopupContentView mPopupContent>
	//   99  229:invokevirtual   #232 <Method int ToolTipPopup$PopupContentView.getMeasuredHeight()>
	//  100  232:invokespecial   #235 <Method void PopupWindow(View, int, int)>
	//  101  235:putfield        #77  <Field PopupWindow mPopupWindow>
			mPopupWindow.showAsDropDown((View)mAnchorViewRef.get());
	//  102  238:aload_0         
	//  103  239:getfield        #77  <Field PopupWindow mPopupWindow>
	//  104  242:aload_0         
	//  105  243:getfield        #62  <Field WeakReference mAnchorViewRef>
	//  106  246:invokevirtual   #89  <Method Object WeakReference.get()>
	//  107  249:checkcast       #64  <Class View>
	//  108  252:invokevirtual   #239 <Method void PopupWindow.showAsDropDown(View)>
			updateArrows();
	//  109  255:aload_0         
	//  110  256:invokespecial   #241 <Method void updateArrows()>
			if(mNuxDisplayTime > 0L)
	//* 111  259:aload_0         
	//* 112  260:getfield        #48  <Field long mNuxDisplayTime>
	//* 113  263:lconst_0        
	//* 114  264:lcmp            
	//* 115  265:ifle            288
				mPopupContent.postDelayed(new Runnable() {

					public void run()
					{
						dismiss();
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ToolTipPopup this$0>
					//    2    4:invokevirtual   #24  <Method void ToolTipPopup.dismiss()>
					//    3    7:return          
					}

					final ToolTipPopup this$0;

			
			{
				this$0 = ToolTipPopup.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ToolTipPopup this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
, mNuxDisplayTime);
	//  116  268:aload_0         
	//  117  269:getfield        #81  <Field ToolTipPopup$PopupContentView mPopupContent>
	//  118  272:new             #8   <Class ToolTipPopup$2>
	//  119  275:dup             
	//  120  276:aload_0         
	//  121  277:invokespecial   #242 <Method void ToolTipPopup$2(ToolTipPopup)>
	//  122  280:aload_0         
	//  123  281:getfield        #48  <Field long mNuxDisplayTime>
	//  124  284:invokevirtual   #246 <Method boolean ToolTipPopup$PopupContentView.postDelayed(Runnable, long)>
	//  125  287:pop             
			mPopupWindow.setTouchable(true);
	//  126  288:aload_0         
	//  127  289:getfield        #77  <Field PopupWindow mPopupWindow>
	//  128  292:iconst_1        
	//  129  293:invokevirtual   #250 <Method void PopupWindow.setTouchable(boolean)>
			mPopupContent.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					dismiss();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field ToolTipPopup this$0>
				//    2    4:invokevirtual   #25  <Method void ToolTipPopup.dismiss()>
				//    3    7:return          
				}

				final ToolTipPopup this$0;

			
			{
				this$0 = ToolTipPopup.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ToolTipPopup this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  130  296:aload_0         
	//  131  297:getfield        #81  <Field ToolTipPopup$PopupContentView mPopupContent>
	//  132  300:new             #10  <Class ToolTipPopup$3>
	//  133  303:dup             
	//  134  304:aload_0         
	//  135  305:invokespecial   #251 <Method void ToolTipPopup$3(ToolTipPopup)>
	//  136  308:invokevirtual   #255 <Method void ToolTipPopup$PopupContentView.setOnClickListener(android.view.View$OnClickListener)>
		}
	//  137  311:return          
	}

	public static final long DEFAULT_POPUP_DISPLAY_TIME = 6000L;
	private final WeakReference mAnchorViewRef;
	private final Context mContext;
	private long mNuxDisplayTime;
	private PopupContentView mPopupContent;
	private PopupWindow mPopupWindow;
	private final android.view.ViewTreeObserver.OnScrollChangedListener mScrollListener = new android.view.ViewTreeObserver.OnScrollChangedListener() {

		public void onScrollChanged()
		{
			if(mAnchorViewRef.get() != null && mPopupWindow != null && mPopupWindow.isShowing())
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field ToolTipPopup this$0>
		//*   2    4:invokestatic    #23  <Method WeakReference ToolTipPopup.access$000(ToolTipPopup)>
		//*   3    7:invokevirtual   #29  <Method Object WeakReference.get()>
		//*   4   10:ifnull          70
		//*   5   13:aload_0         
		//*   6   14:getfield        #14  <Field ToolTipPopup this$0>
		//*   7   17:invokestatic    #33  <Method PopupWindow ToolTipPopup.access$100(ToolTipPopup)>
		//*   8   20:ifnull          70
		//*   9   23:aload_0         
		//*  10   24:getfield        #14  <Field ToolTipPopup this$0>
		//*  11   27:invokestatic    #33  <Method PopupWindow ToolTipPopup.access$100(ToolTipPopup)>
		//*  12   30:invokevirtual   #39  <Method boolean PopupWindow.isShowing()>
		//*  13   33:ifeq            70
			{
				if(mPopupWindow.isAboveAnchor())
		//*  14   36:aload_0         
		//*  15   37:getfield        #14  <Field ToolTipPopup this$0>
		//*  16   40:invokestatic    #33  <Method PopupWindow ToolTipPopup.access$100(ToolTipPopup)>
		//*  17   43:invokevirtual   #42  <Method boolean PopupWindow.isAboveAnchor()>
		//*  18   46:ifeq            60
				{
					mPopupContent.showBottomArrow();
		//   19   49:aload_0         
		//   20   50:getfield        #14  <Field ToolTipPopup this$0>
		//   21   53:invokestatic    #46  <Method ToolTipPopup$PopupContentView ToolTipPopup.access$200(ToolTipPopup)>
		//   22   56:invokevirtual   #51  <Method void ToolTipPopup$PopupContentView.showBottomArrow()>
					return;
		//   23   59:return          
				}
				mPopupContent.showTopArrow();
		//   24   60:aload_0         
		//   25   61:getfield        #14  <Field ToolTipPopup this$0>
		//   26   64:invokestatic    #46  <Method ToolTipPopup$PopupContentView ToolTipPopup.access$200(ToolTipPopup)>
		//   27   67:invokevirtual   #54  <Method void ToolTipPopup$PopupContentView.showTopArrow()>
			}
		//   28   70:return          
		}

		final ToolTipPopup this$0;

			
			{
				this$0 = ToolTipPopup.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ToolTipPopup this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private Style mStyle;
	private final String mText;


/*
	static WeakReference access$000(ToolTipPopup tooltippopup)
	{
		return tooltippopup.mAnchorViewRef;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field WeakReference mAnchorViewRef>
	//    2    4:areturn         
	}

*/


/*
	static PopupWindow access$100(ToolTipPopup tooltippopup)
	{
		return tooltippopup.mPopupWindow;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field PopupWindow mPopupWindow>
	//    2    4:areturn         
	}

*/


/*
	static PopupContentView access$200(ToolTipPopup tooltippopup)
	{
		return tooltippopup.mPopupContent;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field ToolTipPopup$PopupContentView mPopupContent>
	//    2    4:areturn         
	}

*/
}
