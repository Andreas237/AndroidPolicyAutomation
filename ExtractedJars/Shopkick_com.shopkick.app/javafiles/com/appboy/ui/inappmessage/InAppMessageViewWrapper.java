// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage;

import android.app.Activity;
import android.view.*;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.appboy.enums.inappmessage.DismissType;
import com.appboy.enums.inappmessage.SlideFrom;
import com.appboy.models.*;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.appboy.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener;
import com.appboy.ui.inappmessage.views.AppboyInAppMessageHtmlBaseView;
import com.appboy.ui.support.ViewUtils;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.appboy.ui.inappmessage:
//			IInAppMessageViewWrapper, IInAppMessageImmersiveView, InAppMessageCloser, AppboyInAppMessageManager

public class InAppMessageViewWrapper
	implements IInAppMessageViewWrapper
{

	public InAppMessageViewWrapper(View view, IInAppMessage iinappmessage, IInAppMessageViewLifecycleListener iinappmessageviewlifecyclelistener, Animation animation, Animation animation1, View view1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void Object()>
		mInAppMessageView = view;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #61  <Field View mInAppMessageView>
		mInAppMessage = iinappmessage;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #63  <Field IInAppMessage mInAppMessage>
		mInAppMessageViewLifecycleListener = iinappmessageviewlifecyclelistener;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #65  <Field IInAppMessageViewLifecycleListener mInAppMessageViewLifecycleListener>
		mIsAnimatingClose = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #67  <Field boolean mIsAnimatingClose>
		if(view1 != null)
	//*  14   24:aload           6
	//*  15   26:ifnull          38
			mClickableInAppMessageView = view1;
	//   16   29:aload_0         
	//   17   30:aload           6
	//   18   32:putfield        #69  <Field View mClickableInAppMessageView>
		else
	//*  19   35:goto            46
			mClickableInAppMessageView = mInAppMessageView;
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:getfield        #61  <Field View mInAppMessageView>
	//   23   43:putfield        #69  <Field View mClickableInAppMessageView>
		if(mInAppMessage instanceof InAppMessageSlideup)
	//*  24   46:aload_0         
	//*  25   47:getfield        #63  <Field IInAppMessage mInAppMessage>
	//*  26   50:instanceof      #71  <Class InAppMessageSlideup>
	//*  27   53:ifeq            86
		{
			view = ((View) (new TouchAwareSwipeDismissTouchListener(view, ((Object) (null)), createDismissCallbacks())));
	//   28   56:new             #73  <Class TouchAwareSwipeDismissTouchListener>
	//   29   59:dup             
	//   30   60:aload_1         
	//   31   61:aconst_null     
	//   32   62:aload_0         
	//   33   63:invokespecial   #77  <Method com.appboy.ui.inappmessage.listeners.SwipeDismissTouchListener$DismissCallbacks createDismissCallbacks()>
	//   34   66:invokespecial   #80  <Method void TouchAwareSwipeDismissTouchListener(View, Object, com.appboy.ui.inappmessage.listeners.SwipeDismissTouchListener$DismissCallbacks)>
	//   35   69:astore_1        
			((TouchAwareSwipeDismissTouchListener) (view)).setTouchListener(createTouchAwareListener());
	//   36   70:aload_1         
	//   37   71:aload_0         
	//   38   72:invokespecial   #84  <Method com.appboy.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener$ITouchListener createTouchAwareListener()>
	//   39   75:invokevirtual   #88  <Method void TouchAwareSwipeDismissTouchListener.setTouchListener(com.appboy.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener$ITouchListener)>
			mClickableInAppMessageView.setOnTouchListener(((android.view.View.OnTouchListener) (view)));
	//   40   78:aload_0         
	//   41   79:getfield        #69  <Field View mClickableInAppMessageView>
	//   42   82:aload_1         
	//   43   83:invokevirtual   #94  <Method void View.setOnTouchListener(android.view.View$OnTouchListener)>
		}
		mOpeningAnimation = animation;
	//   44   86:aload_0         
	//   45   87:aload           4
	//   46   89:putfield        #96  <Field Animation mOpeningAnimation>
		mClosingAnimation = animation1;
	//   47   92:aload_0         
	//   48   93:aload           5
	//   49   95:putfield        #98  <Field Animation mClosingAnimation>
		mClickableInAppMessageView.setOnClickListener(createClickListener());
	//   50   98:aload_0         
	//   51   99:getfield        #69  <Field View mClickableInAppMessageView>
	//   52  102:aload_0         
	//   53  103:invokespecial   #102 <Method android.view.View$OnClickListener createClickListener()>
	//   54  106:invokevirtual   #106 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
	//   55  109:return          
	}

	public InAppMessageViewWrapper(View view, IInAppMessage iinappmessage, IInAppMessageViewLifecycleListener iinappmessageviewlifecyclelistener, Animation animation, Animation animation1, View view1, List list, 
			View view2)
	{
		this(view, iinappmessage, iinappmessageviewlifecyclelistener, animation, animation1, view1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:invokespecial   #109 <Method void InAppMessageViewWrapper(View, IInAppMessage, IInAppMessageViewLifecycleListener, Animation, Animation, View)>
		if(view2 != null)
	//*   8   13:aload           8
	//*   9   15:ifnull          35
		{
			mCloseButton = view2;
	//   10   18:aload_0         
	//   11   19:aload           8
	//   12   21:putfield        #111 <Field View mCloseButton>
			mCloseButton.setOnClickListener(createCloseInAppMessageClickListener());
	//   13   24:aload_0         
	//   14   25:getfield        #111 <Field View mCloseButton>
	//   15   28:aload_0         
	//   16   29:invokespecial   #114 <Method android.view.View$OnClickListener createCloseInAppMessageClickListener()>
	//   17   32:invokevirtual   #106 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		}
		if(list != null)
	//*  18   35:aload           7
	//*  19   37:ifnull          84
		{
			mButtons = list;
	//   20   40:aload_0         
	//   21   41:aload           7
	//   22   43:putfield        #116 <Field List mButtons>
			for(view = ((View) (mButtons.iterator())); ((Iterator) (view)).hasNext(); ((View)((Iterator) (view)).next()).setOnClickListener(createButtonClickListener()));
	//   23   46:aload_0         
	//   24   47:getfield        #116 <Field List mButtons>
	//   25   50:invokeinterface #122 <Method Iterator List.iterator()>
	//   26   55:astore_1        
	//   27   56:aload_1         
	//   28   57:invokeinterface #128 <Method boolean Iterator.hasNext()>
	//   29   62:ifeq            84
	//   30   65:aload_1         
	//   31   66:invokeinterface #132 <Method Object Iterator.next()>
	//   32   71:checkcast       #90  <Class View>
	//   33   74:aload_0         
	//   34   75:invokespecial   #135 <Method android.view.View$OnClickListener createButtonClickListener()>
	//   35   78:invokevirtual   #106 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		}
	//*  36   81:goto            56
	//   37   84:return          
	}

	private void addDismissRunnable()
	{
		if(mDismissRunnable == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #157 <Field Runnable mDismissRunnable>
	//*   2    4:ifnonnull       41
		{
			mDismissRunnable = new Runnable() {

				public void run()
				{
					AppboyInAppMessageManager.getInstance().hideCurrentlyDisplayingInAppMessage(true);
				//    0    0:invokestatic    #27  <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
				//    1    3:iconst_1        
				//    2    4:invokevirtual   #31  <Method void AppboyInAppMessageManager.hideCurrentlyDisplayingInAppMessage(boolean)>
				//    3    7:return          
				}

				final InAppMessageViewWrapper this$0;

			
			{
				this$0 = InAppMessageViewWrapper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field InAppMessageViewWrapper this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//    3    7:aload_0         
	//    4    8:new             #16  <Class InAppMessageViewWrapper$5>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #172 <Method void InAppMessageViewWrapper$5(InAppMessageViewWrapper)>
	//    8   16:putfield        #157 <Field Runnable mDismissRunnable>
			mInAppMessageView.postDelayed(mDismissRunnable, mInAppMessage.getDurationInMilliseconds());
	//    9   19:aload_0         
	//   10   20:getfield        #61  <Field View mInAppMessageView>
	//   11   23:aload_0         
	//   12   24:getfield        #157 <Field Runnable mDismissRunnable>
	//   13   27:aload_0         
	//   14   28:getfield        #63  <Field IInAppMessage mInAppMessage>
	//   15   31:invokeinterface #178 <Method int IInAppMessage.getDurationInMilliseconds()>
	//   16   36:i2l             
	//   17   37:invokevirtual   #182 <Method boolean View.postDelayed(Runnable, long)>
	//   18   40:pop             
		}
	//   19   41:return          
	}

	private void announceForAccessibilityIfNecessary()
	{
		if(android.os.Build.VERSION.SDK_INT > 16)
	//*   0    0:getstatic       #188 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmple          47
		{
			View view = mInAppMessageView;
	//    3    8:aload_0         
	//    4    9:getfield        #61  <Field View mInAppMessageView>
	//    5   12:astore_1        
			if(view instanceof IInAppMessageImmersiveView)
	//*   6   13:aload_1         
	//*   7   14:instanceof      #190 <Class IInAppMessageImmersiveView>
	//*   8   17:ifeq            34
			{
				view.announceForAccessibility(((CharSequence) (mInAppMessage.getMessage())));
	//    9   20:aload_1         
	//   10   21:aload_0         
	//   11   22:getfield        #63  <Field IInAppMessage mInAppMessage>
	//   12   25:invokeinterface #193 <Method String IInAppMessage.getMessage()>
	//   13   30:invokevirtual   #197 <Method void View.announceForAccessibility(CharSequence)>
				return;
	//   14   33:return          
			}
			if(view instanceof AppboyInAppMessageHtmlBaseView)
	//*  15   34:aload_1         
	//*  16   35:instanceof      #199 <Class AppboyInAppMessageHtmlBaseView>
	//*  17   38:ifeq            47
				view.announceForAccessibility("In-app message displayed.");
	//   18   41:aload_1         
	//   19   42:ldc1            #201 <String "In-app message displayed.">
	//   20   44:invokevirtual   #197 <Method void View.announceForAccessibility(CharSequence)>
		}
	//   21   47:return          
	}

	private void closeInAppMessageView()
	{
		AppboyLogger.d(TAG, "Closing in-app message view");
	//    0    0:getstatic       #54  <Field String TAG>
	//    1    3:ldc1            #203 <String "Closing in-app message view">
	//    2    5:invokestatic    #207 <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		ViewUtils.removeViewFromParent(mInAppMessageView);
	//    4    9:aload_0         
	//    5   10:getfield        #61  <Field View mInAppMessageView>
	//    6   13:invokestatic    #213 <Method void ViewUtils.removeViewFromParent(View)>
		Object obj = ((Object) (mInAppMessageView));
	//    7   16:aload_0         
	//    8   17:getfield        #61  <Field View mInAppMessageView>
	//    9   20:astore_1        
		if(obj instanceof AppboyInAppMessageHtmlBaseView)
	//*  10   21:aload_1         
	//*  11   22:instanceof      #199 <Class AppboyInAppMessageHtmlBaseView>
	//*  12   25:ifeq            56
		{
			obj = ((Object) ((AppboyInAppMessageHtmlBaseView)obj));
	//   13   28:aload_1         
	//   14   29:checkcast       #199 <Class AppboyInAppMessageHtmlBaseView>
	//   15   32:astore_1        
			if(((AppboyInAppMessageHtmlBaseView) (obj)).getMessageWebView() != null)
	//*  16   33:aload_1         
	//*  17   34:invokevirtual   #217 <Method WebView AppboyInAppMessageHtmlBaseView.getMessageWebView()>
	//*  18   37:ifnull          56
			{
				AppboyLogger.d(TAG, "Called destroy on the AppboyInAppMessageHtmlBaseView WebView");
	//   19   40:getstatic       #54  <Field String TAG>
	//   20   43:ldc1            #219 <String "Called destroy on the AppboyInAppMessageHtmlBaseView WebView">
	//   21   45:invokestatic    #207 <Method int AppboyLogger.d(String, String)>
	//   22   48:pop             
				((AppboyInAppMessageHtmlBaseView) (obj)).getMessageWebView().destroy();
	//   23   49:aload_1         
	//   24   50:invokevirtual   #217 <Method WebView AppboyInAppMessageHtmlBaseView.getMessageWebView()>
	//   25   53:invokevirtual   #224 <Method void WebView.destroy()>
			}
		}
		mInAppMessageViewLifecycleListener.afterClosed(mInAppMessage);
	//   26   56:aload_0         
	//   27   57:getfield        #65  <Field IInAppMessageViewLifecycleListener mInAppMessageViewLifecycleListener>
	//   28   60:aload_0         
	//   29   61:getfield        #63  <Field IInAppMessage mInAppMessage>
	//   30   64:invokeinterface #230 <Method void IInAppMessageViewLifecycleListener.afterClosed(IInAppMessage)>
	//   31   69:return          
	}

	private android.view.animation.Animation.AnimationListener createAnimationListener(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            13
			return new android.view.animation.Animation.AnimationListener() {

				public void onAnimationEnd(Animation animation)
				{
					if(mInAppMessage.getDismissType() == DismissType.AUTO_DISMISS)
				//*   0    0:aload_0         
				//*   1    1:getfield        #17  <Field InAppMessageViewWrapper this$0>
				//*   2    4:invokestatic    #27  <Method IInAppMessage InAppMessageViewWrapper.access$300(InAppMessageViewWrapper)>
				//*   3    7:invokeinterface #33  <Method DismissType IInAppMessage.getDismissType()>
				//*   4   12:getstatic       #39  <Field DismissType DismissType.AUTO_DISMISS>
				//*   5   15:if_acmpne       25
						addDismissRunnable();
				//    6   18:aload_0         
				//    7   19:getfield        #17  <Field InAppMessageViewWrapper this$0>
				//    8   22:invokestatic    #42  <Method void InAppMessageViewWrapper.access$700(InAppMessageViewWrapper)>
					AppboyLogger.d(InAppMessageViewWrapper.TAG, "In-app message animated into view.");
				//    9   25:invokestatic    #46  <Method String InAppMessageViewWrapper.access$000()>
				//   10   28:ldc1            #48  <String "In-app message animated into view.">
				//   11   30:invokestatic    #54  <Method int AppboyLogger.d(String, String)>
				//   12   33:pop             
					ViewUtils.setFocusableInTouchModeAndRequestFocus(mInAppMessageView);
				//   13   34:aload_0         
				//   14   35:getfield        #17  <Field InAppMessageViewWrapper this$0>
				//   15   38:invokestatic    #58  <Method View InAppMessageViewWrapper.access$100(InAppMessageViewWrapper)>
				//   16   41:invokestatic    #64  <Method void ViewUtils.setFocusableInTouchModeAndRequestFocus(View)>
					announceForAccessibilityIfNecessary();
				//   17   44:aload_0         
				//   18   45:getfield        #17  <Field InAppMessageViewWrapper this$0>
				//   19   48:invokestatic    #67  <Method void InAppMessageViewWrapper.access$800(InAppMessageViewWrapper)>
					mInAppMessageViewLifecycleListener.afterOpened(mInAppMessageView, mInAppMessage);
				//   20   51:aload_0         
				//   21   52:getfield        #17  <Field InAppMessageViewWrapper this$0>
				//   22   55:invokestatic    #71  <Method IInAppMessageViewLifecycleListener InAppMessageViewWrapper.access$400(InAppMessageViewWrapper)>
				//   23   58:aload_0         
				//   24   59:getfield        #17  <Field InAppMessageViewWrapper this$0>
				//   25   62:invokestatic    #58  <Method View InAppMessageViewWrapper.access$100(InAppMessageViewWrapper)>
				//   26   65:aload_0         
				//   27   66:getfield        #17  <Field InAppMessageViewWrapper this$0>
				//   28   69:invokestatic    #27  <Method IInAppMessage InAppMessageViewWrapper.access$300(InAppMessageViewWrapper)>
				//   29   72:invokeinterface #77  <Method void IInAppMessageViewLifecycleListener.afterOpened(View, IInAppMessage)>
				//   30   77:return          
				}

				public void onAnimationRepeat(Animation animation)
				{
				//    0    0:return          
				}

				public void onAnimationStart(Animation animation)
				{
				//    0    0:return          
				}

				final InAppMessageViewWrapper this$0;

			
			{
				this$0 = InAppMessageViewWrapper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field InAppMessageViewWrapper this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//    2    4:new             #22  <Class InAppMessageViewWrapper$8>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #233 <Method void InAppMessageViewWrapper$8(InAppMessageViewWrapper)>
	//    6   12:areturn         
		else
			return new android.view.animation.Animation.AnimationListener() {

				public void onAnimationEnd(Animation animation)
				{
					mInAppMessageView.clearAnimation();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field InAppMessageViewWrapper this$0>
				//    2    4:invokestatic    #27  <Method View InAppMessageViewWrapper.access$100(InAppMessageViewWrapper)>
				//    3    7:invokevirtual   #32  <Method void View.clearAnimation()>
					mInAppMessageView.setVisibility(8);
				//    4   10:aload_0         
				//    5   11:getfield        #17  <Field InAppMessageViewWrapper this$0>
				//    6   14:invokestatic    #27  <Method View InAppMessageViewWrapper.access$100(InAppMessageViewWrapper)>
				//    7   17:bipush          8
				//    8   19:invokevirtual   #36  <Method void View.setVisibility(int)>
					closeInAppMessageView();
				//    9   22:aload_0         
				//   10   23:getfield        #17  <Field InAppMessageViewWrapper this$0>
				//   11   26:invokestatic    #39  <Method void InAppMessageViewWrapper.access$900(InAppMessageViewWrapper)>
				//   12   29:return          
				}

				public void onAnimationRepeat(Animation animation)
				{
				//    0    0:return          
				}

				public void onAnimationStart(Animation animation)
				{
				//    0    0:return          
				}

				final InAppMessageViewWrapper this$0;

			
			{
				this$0 = InAppMessageViewWrapper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field InAppMessageViewWrapper this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//    7   13:new             #24  <Class InAppMessageViewWrapper$9>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokespecial   #234 <Method void InAppMessageViewWrapper$9(InAppMessageViewWrapper)>
	//   11   21:areturn         
	}

	private android.view.View.OnClickListener createButtonClickListener()
	{
		return new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				IInAppMessageImmersive iinappmessageimmersive = (IInAppMessageImmersive)mInAppMessage;
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field InAppMessageViewWrapper this$0>
			//    2    4:invokestatic    #27  <Method IInAppMessage InAppMessageViewWrapper.access$300(InAppMessageViewWrapper)>
			//    3    7:checkcast       #29  <Class IInAppMessageImmersive>
			//    4   10:astore_3        
				for(int i = 0; i < mButtons.size(); i++)
			//*   5   11:iconst_0        
			//*   6   12:istore_2        
			//*   7   13:iload_2         
			//*   8   14:aload_0         
			//*   9   15:getfield        #17  <Field InAppMessageViewWrapper this$0>
			//*  10   18:invokestatic    #33  <Method List InAppMessageViewWrapper.access$500(InAppMessageViewWrapper)>
			//*  11   21:invokeinterface #39  <Method int List.size()>
			//*  12   26:icmpge          104
					if(view.getId() == ((View)mButtons.get(i)).getId())
			//*  13   29:aload_1         
			//*  14   30:invokevirtual   #44  <Method int View.getId()>
			//*  15   33:aload_0         
			//*  16   34:getfield        #17  <Field InAppMessageViewWrapper this$0>
			//*  17   37:invokestatic    #33  <Method List InAppMessageViewWrapper.access$500(InAppMessageViewWrapper)>
			//*  18   40:iload_2         
			//*  19   41:invokeinterface #48  <Method Object List.get(int)>
			//*  20   46:checkcast       #41  <Class View>
			//*  21   49:invokevirtual   #44  <Method int View.getId()>
			//*  22   52:icmpne          97
					{
						view = ((View) ((MessageButton)iinappmessageimmersive.getMessageButtons().get(i)));
			//   23   55:aload_3         
			//   24   56:invokeinterface #52  <Method List IInAppMessageImmersive.getMessageButtons()>
			//   25   61:iload_2         
			//   26   62:invokeinterface #48  <Method Object List.get(int)>
			//   27   67:checkcast       #54  <Class MessageButton>
			//   28   70:astore_1        
						mInAppMessageViewLifecycleListener.onButtonClicked(new InAppMessageCloser(InAppMessageViewWrapper.this), ((MessageButton) (view)), iinappmessageimmersive);
			//   29   71:aload_0         
			//   30   72:getfield        #17  <Field InAppMessageViewWrapper this$0>
			//   31   75:invokestatic    #58  <Method IInAppMessageViewLifecycleListener InAppMessageViewWrapper.access$400(InAppMessageViewWrapper)>
			//   32   78:new             #60  <Class InAppMessageCloser>
			//   33   81:dup             
			//   34   82:aload_0         
			//   35   83:getfield        #17  <Field InAppMessageViewWrapper this$0>
			//   36   86:invokespecial   #62  <Method void InAppMessageCloser(InAppMessageViewWrapper)>
			//   37   89:aload_1         
			//   38   90:aload_3         
			//   39   91:invokeinterface #68  <Method void IInAppMessageViewLifecycleListener.onButtonClicked(InAppMessageCloser, MessageButton, IInAppMessageImmersive)>
						return;
			//   40   96:return          
					}

			//   41   97:iload_2         
			//   42   98:iconst_1        
			//   43   99:iadd            
			//   44  100:istore_2        
			//*  45  101:goto            13
			//   46  104:return          
			}

			final InAppMessageViewWrapper this$0;

			
			{
				this$0 = InAppMessageViewWrapper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field InAppMessageViewWrapper this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #12  <Class InAppMessageViewWrapper$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #235 <Method void InAppMessageViewWrapper$3(InAppMessageViewWrapper)>
	//    4    8:areturn         
	}

	private android.view.View.OnClickListener createClickListener()
	{
		return new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				if(mInAppMessage instanceof IInAppMessageImmersive)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field InAppMessageViewWrapper this$0>
			//*   2    4:invokestatic    #27  <Method IInAppMessage InAppMessageViewWrapper.access$300(InAppMessageViewWrapper)>
			//*   3    7:instanceof      #29  <Class IInAppMessageImmersive>
			//*   4   10:ifeq            85
				{
					view = ((View) ((IInAppMessageImmersive)mInAppMessage));
			//    5   13:aload_0         
			//    6   14:getfield        #17  <Field InAppMessageViewWrapper this$0>
			//    7   17:invokestatic    #27  <Method IInAppMessage InAppMessageViewWrapper.access$300(InAppMessageViewWrapper)>
			//    8   20:checkcast       #29  <Class IInAppMessageImmersive>
			//    9   23:astore_1        
					if(((IInAppMessageImmersive) (view)).getMessageButtons() == null || ((IInAppMessageImmersive) (view)).getMessageButtons().size() == 0)
			//*  10   24:aload_1         
			//*  11   25:invokeinterface #33  <Method List IInAppMessageImmersive.getMessageButtons()>
			//*  12   30:ifnull          47
			//*  13   33:aload_1         
			//*  14   34:invokeinterface #33  <Method List IInAppMessageImmersive.getMessageButtons()>
			//*  15   39:invokeinterface #39  <Method int List.size()>
			//*  16   44:ifne            122
					{
						mInAppMessageViewLifecycleListener.onClicked(new InAppMessageCloser(InAppMessageViewWrapper.this), mInAppMessageView, mInAppMessage);
			//   17   47:aload_0         
			//   18   48:getfield        #17  <Field InAppMessageViewWrapper this$0>
			//   19   51:invokestatic    #43  <Method IInAppMessageViewLifecycleListener InAppMessageViewWrapper.access$400(InAppMessageViewWrapper)>
			//   20   54:new             #45  <Class InAppMessageCloser>
			//   21   57:dup             
			//   22   58:aload_0         
			//   23   59:getfield        #17  <Field InAppMessageViewWrapper this$0>
			//   24   62:invokespecial   #47  <Method void InAppMessageCloser(InAppMessageViewWrapper)>
			//   25   65:aload_0         
			//   26   66:getfield        #17  <Field InAppMessageViewWrapper this$0>
			//   27   69:invokestatic    #51  <Method View InAppMessageViewWrapper.access$100(InAppMessageViewWrapper)>
			//   28   72:aload_0         
			//   29   73:getfield        #17  <Field InAppMessageViewWrapper this$0>
			//   30   76:invokestatic    #27  <Method IInAppMessage InAppMessageViewWrapper.access$300(InAppMessageViewWrapper)>
			//   31   79:invokeinterface #57  <Method void IInAppMessageViewLifecycleListener.onClicked(InAppMessageCloser, View, IInAppMessage)>
						return;
			//   32   84:return          
					}
				} else
				{
					mInAppMessageViewLifecycleListener.onClicked(new InAppMessageCloser(InAppMessageViewWrapper.this), mInAppMessageView, mInAppMessage);
			//   33   85:aload_0         
			//   34   86:getfield        #17  <Field InAppMessageViewWrapper this$0>
			//   35   89:invokestatic    #43  <Method IInAppMessageViewLifecycleListener InAppMessageViewWrapper.access$400(InAppMessageViewWrapper)>
			//   36   92:new             #45  <Class InAppMessageCloser>
			//   37   95:dup             
			//   38   96:aload_0         
			//   39   97:getfield        #17  <Field InAppMessageViewWrapper this$0>
			//   40  100:invokespecial   #47  <Method void InAppMessageCloser(InAppMessageViewWrapper)>
			//   41  103:aload_0         
			//   42  104:getfield        #17  <Field InAppMessageViewWrapper this$0>
			//   43  107:invokestatic    #51  <Method View InAppMessageViewWrapper.access$100(InAppMessageViewWrapper)>
			//   44  110:aload_0         
			//   45  111:getfield        #17  <Field InAppMessageViewWrapper this$0>
			//   46  114:invokestatic    #27  <Method IInAppMessage InAppMessageViewWrapper.access$300(InAppMessageViewWrapper)>
			//   47  117:invokeinterface #57  <Method void IInAppMessageViewLifecycleListener.onClicked(InAppMessageCloser, View, IInAppMessage)>
				}
			//   48  122:return          
			}

			final InAppMessageViewWrapper this$0;

			
			{
				this$0 = InAppMessageViewWrapper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field InAppMessageViewWrapper this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #10  <Class InAppMessageViewWrapper$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #236 <Method void InAppMessageViewWrapper$2(InAppMessageViewWrapper)>
	//    4    8:areturn         
	}

	private android.view.View.OnClickListener createCloseInAppMessageClickListener()
	{
		return new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				AppboyInAppMessageManager.getInstance().hideCurrentlyDisplayingInAppMessage(true);
			//    0    0:invokestatic    #29  <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
			//    1    3:iconst_1        
			//    2    4:invokevirtual   #33  <Method void AppboyInAppMessageManager.hideCurrentlyDisplayingInAppMessage(boolean)>
			//    3    7:return          
			}

			final InAppMessageViewWrapper this$0;

			
			{
				this$0 = InAppMessageViewWrapper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field InAppMessageViewWrapper this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #14  <Class InAppMessageViewWrapper$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #237 <Method void InAppMessageViewWrapper$4(InAppMessageViewWrapper)>
	//    4    8:areturn         
	}

	private com.appboy.ui.inappmessage.listeners.SwipeDismissTouchListener.DismissCallbacks createDismissCallbacks()
	{
		return new com.appboy.ui.inappmessage.listeners.SwipeDismissTouchListener.DismissCallbacks() {

			public boolean canDismiss(Object obj)
			{
				return true;
			//    0    0:iconst_1        
			//    1    1:ireturn         
			}

			public void onDismiss(View view, Object obj)
			{
				mInAppMessage.setAnimateOut(false);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field InAppMessageViewWrapper this$0>
			//    2    4:invokestatic    #29  <Method IInAppMessage InAppMessageViewWrapper.access$300(InAppMessageViewWrapper)>
			//    3    7:iconst_0        
			//    4    8:invokeinterface #35  <Method void IInAppMessage.setAnimateOut(boolean)>
				AppboyInAppMessageManager.getInstance().hideCurrentlyDisplayingInAppMessage(true);
			//    5   13:invokestatic    #41  <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
			//    6   16:iconst_1        
			//    7   17:invokevirtual   #44  <Method void AppboyInAppMessageManager.hideCurrentlyDisplayingInAppMessage(boolean)>
			//    8   20:return          
			}

			final InAppMessageViewWrapper this$0;

			
			{
				this$0 = InAppMessageViewWrapper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field InAppMessageViewWrapper this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #18  <Class InAppMessageViewWrapper$6>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #238 <Method void InAppMessageViewWrapper$6(InAppMessageViewWrapper)>
	//    4    8:areturn         
	}

	private com.appboy.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener.ITouchListener createTouchAwareListener()
	{
		return new com.appboy.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener.ITouchListener() {

			public void onTouchEnded()
			{
				if(mInAppMessage.getDismissType() == DismissType.AUTO_DISMISS)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field InAppMessageViewWrapper this$0>
			//*   2    4:invokestatic    #26  <Method IInAppMessage InAppMessageViewWrapper.access$300(InAppMessageViewWrapper)>
			//*   3    7:invokeinterface #32  <Method DismissType IInAppMessage.getDismissType()>
			//*   4   12:getstatic       #38  <Field DismissType DismissType.AUTO_DISMISS>
			//*   5   15:if_acmpne       25
					addDismissRunnable();
			//    6   18:aload_0         
			//    7   19:getfield        #17  <Field InAppMessageViewWrapper this$0>
			//    8   22:invokestatic    #41  <Method void InAppMessageViewWrapper.access$700(InAppMessageViewWrapper)>
			//    9   25:return          
			}

			public void onTouchStartedOrContinued()
			{
				mInAppMessageView.removeCallbacks(mDismissRunnable);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field InAppMessageViewWrapper this$0>
			//    2    4:invokestatic    #46  <Method View InAppMessageViewWrapper.access$100(InAppMessageViewWrapper)>
			//    3    7:aload_0         
			//    4    8:getfield        #17  <Field InAppMessageViewWrapper this$0>
			//    5   11:invokestatic    #50  <Method Runnable InAppMessageViewWrapper.access$600(InAppMessageViewWrapper)>
			//    6   14:invokevirtual   #56  <Method boolean View.removeCallbacks(Runnable)>
			//    7   17:pop             
			//    8   18:return          
			}

			final InAppMessageViewWrapper this$0;

			
			{
				this$0 = InAppMessageViewWrapper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field InAppMessageViewWrapper this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #20  <Class InAppMessageViewWrapper$7>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #239 <Method void InAppMessageViewWrapper$7(InAppMessageViewWrapper)>
	//    4    8:areturn         
	}

	private android.widget.FrameLayout.LayoutParams getLayoutParams(FrameLayout framelayout, int i)
	{
		android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -2);
	//    0    0:new             #243 <Class android.widget.FrameLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:iconst_m1       
	//    3    5:bipush          -2
	//    4    7:invokespecial   #246 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//    5   10:astore          4
		IInAppMessage iinappmessage = mInAppMessage;
	//    6   12:aload_0         
	//    7   13:getfield        #63  <Field IInAppMessage mInAppMessage>
	//    8   16:astore          5
		if(iinappmessage instanceof InAppMessageSlideup)
	//*   9   18:aload           5
	//*  10   20:instanceof      #71  <Class InAppMessageSlideup>
	//*  11   23:ifeq            55
		{
			int j;
			if(((InAppMessageSlideup)iinappmessage).getSlideFrom() == SlideFrom.TOP)
	//*  12   26:aload           5
	//*  13   28:checkcast       #71  <Class InAppMessageSlideup>
	//*  14   31:invokevirtual   #250 <Method SlideFrom InAppMessageSlideup.getSlideFrom()>
	//*  15   34:getstatic       #256 <Field SlideFrom SlideFrom.TOP>
	//*  16   37:if_acmpne       46
				j = 48;
	//   17   40:bipush          48
	//   18   42:istore_3        
			else
	//*  19   43:goto            49
				j = 80;
	//   20   46:bipush          80
	//   21   48:istore_3        
			layoutparams.gravity = j;
	//   22   49:aload           4
	//   23   51:iload_3         
	//   24   52:putfield        #259 <Field int android.widget.FrameLayout$LayoutParams.gravity>
		}
		if(i > 0 && i == framelayout.getHeight())
	//*  25   55:iload_2         
	//*  26   56:ifle            129
	//*  27   59:iload_2         
	//*  28   60:aload_1         
	//*  29   61:invokevirtual   #264 <Method int FrameLayout.getHeight()>
	//*  30   64:icmpne          129
		{
			i = ViewUtils.getTopVisibleCoordinate(((View) (framelayout)));
	//   31   67:aload_1         
	//   32   68:invokestatic    #268 <Method int ViewUtils.getTopVisibleCoordinate(View)>
	//   33   71:istore_2        
			framelayout = ((FrameLayout) (TAG));
	//   34   72:getstatic       #54  <Field String TAG>
	//   35   75:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   36   76:new             #270 <Class StringBuilder>
	//   37   79:dup             
	//   38   80:invokespecial   #271 <Method void StringBuilder()>
	//   39   83:astore          5
			stringbuilder.append("Detected status bar height of ");
	//   40   85:aload           5
	//   41   87:ldc2            #273 <String "Detected status bar height of ">
	//   42   90:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//   43   93:pop             
			stringbuilder.append(i);
	//   44   94:aload           5
	//   45   96:iload_2         
	//   46   97:invokevirtual   #280 <Method StringBuilder StringBuilder.append(int)>
	//   47  100:pop             
			stringbuilder.append(".");
	//   48  101:aload           5
	//   49  103:ldc2            #282 <String ".">
	//   50  106:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//   51  109:pop             
			AppboyLogger.d(((String) (framelayout)), stringbuilder.toString());
	//   52  110:aload_1         
	//   53  111:aload           5
	//   54  113:invokevirtual   #285 <Method String StringBuilder.toString()>
	//   55  116:invokestatic    #207 <Method int AppboyLogger.d(String, String)>
	//   56  119:pop             
			layoutparams.setMargins(0, i, 0, 0);
	//   57  120:aload           4
	//   58  122:iconst_0        
	//   59  123:iload_2         
	//   60  124:iconst_0        
	//   61  125:iconst_0        
	//   62  126:invokevirtual   #289 <Method void android.widget.FrameLayout$LayoutParams.setMargins(int, int, int, int)>
		}
		return layoutparams;
	//   63  129:aload           4
	//   64  131:areturn         
	}

	private void open(FrameLayout framelayout, int i)
	{
		mInAppMessageViewLifecycleListener.beforeOpened(mInAppMessageView, mInAppMessage);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field IInAppMessageViewLifecycleListener mInAppMessageViewLifecycleListener>
	//    2    4:aload_0         
	//    3    5:getfield        #61  <Field View mInAppMessageView>
	//    4    8:aload_0         
	//    5    9:getfield        #63  <Field IInAppMessage mInAppMessage>
	//    6   12:invokeinterface #293 <Method void IInAppMessageViewLifecycleListener.beforeOpened(View, IInAppMessage)>
		AppboyLogger.d(TAG, "Adding In-app message view to root FrameLayout.");
	//    7   17:getstatic       #54  <Field String TAG>
	//    8   20:ldc2            #295 <String "Adding In-app message view to root FrameLayout.">
	//    9   23:invokestatic    #207 <Method int AppboyLogger.d(String, String)>
	//   10   26:pop             
		framelayout.addView(mInAppMessageView, ((android.view.ViewGroup.LayoutParams) (getLayoutParams(framelayout, i))));
	//   11   27:aload_1         
	//   12   28:aload_0         
	//   13   29:getfield        #61  <Field View mInAppMessageView>
	//   14   32:aload_0         
	//   15   33:aload_1         
	//   16   34:iload_2         
	//   17   35:invokespecial   #297 <Method android.widget.FrameLayout$LayoutParams getLayoutParams(FrameLayout, int)>
	//   18   38:invokevirtual   #301 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
		if(mInAppMessage.getAnimateIn())
	//*  19   41:aload_0         
	//*  20   42:getfield        #63  <Field IInAppMessage mInAppMessage>
	//*  21   45:invokeinterface #304 <Method boolean IInAppMessage.getAnimateIn()>
	//*  22   50:ifeq            69
		{
			AppboyLogger.d(TAG, "In-app message view will animate into the visible area.");
	//   23   53:getstatic       #54  <Field String TAG>
	//   24   56:ldc2            #306 <String "In-app message view will animate into the visible area.">
	//   25   59:invokestatic    #207 <Method int AppboyLogger.d(String, String)>
	//   26   62:pop             
			setAndStartAnimation(true);
	//   27   63:aload_0         
	//   28   64:iconst_1        
	//   29   65:invokespecial   #310 <Method void setAndStartAnimation(boolean)>
			return;
	//   30   68:return          
		}
		AppboyLogger.d(TAG, "In-app message view will be placed instantly into the visible area.");
	//   31   69:getstatic       #54  <Field String TAG>
	//   32   72:ldc2            #312 <String "In-app message view will be placed instantly into the visible area.">
	//   33   75:invokestatic    #207 <Method int AppboyLogger.d(String, String)>
	//   34   78:pop             
		if(mInAppMessage.getDismissType() == DismissType.AUTO_DISMISS)
	//*  35   79:aload_0         
	//*  36   80:getfield        #63  <Field IInAppMessage mInAppMessage>
	//*  37   83:invokeinterface #316 <Method DismissType IInAppMessage.getDismissType()>
	//*  38   88:getstatic       #322 <Field DismissType DismissType.AUTO_DISMISS>
	//*  39   91:if_acmpne       98
			addDismissRunnable();
	//   40   94:aload_0         
	//   41   95:invokespecial   #162 <Method void addDismissRunnable()>
		ViewUtils.setFocusableInTouchModeAndRequestFocus(mInAppMessageView);
	//   42   98:aload_0         
	//   43   99:getfield        #61  <Field View mInAppMessageView>
	//   44  102:invokestatic    #325 <Method void ViewUtils.setFocusableInTouchModeAndRequestFocus(View)>
		announceForAccessibilityIfNecessary();
	//   45  105:aload_0         
	//   46  106:invokespecial   #166 <Method void announceForAccessibilityIfNecessary()>
		mInAppMessageViewLifecycleListener.afterOpened(mInAppMessageView, mInAppMessage);
	//   47  109:aload_0         
	//   48  110:getfield        #65  <Field IInAppMessageViewLifecycleListener mInAppMessageViewLifecycleListener>
	//   49  113:aload_0         
	//   50  114:getfield        #61  <Field View mInAppMessageView>
	//   51  117:aload_0         
	//   52  118:getfield        #63  <Field IInAppMessage mInAppMessage>
	//   53  121:invokeinterface #328 <Method void IInAppMessageViewLifecycleListener.afterOpened(View, IInAppMessage)>
	//   54  126:return          
	}

	private void setAndStartAnimation(boolean flag)
	{
		Animation animation;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            12
			animation = mOpeningAnimation;
	//    2    4:aload_0         
	//    3    5:getfield        #96  <Field Animation mOpeningAnimation>
	//    4    8:astore_2        
		else
	//*   5    9:goto            17
			animation = mClosingAnimation;
	//    6   12:aload_0         
	//    7   13:getfield        #98  <Field Animation mClosingAnimation>
	//    8   16:astore_2        
		animation.setAnimationListener(createAnimationListener(flag));
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:invokespecial   #330 <Method android.view.animation.Animation$AnimationListener createAnimationListener(boolean)>
	//   13   23:invokevirtual   #336 <Method void Animation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
		mInAppMessageView.clearAnimation();
	//   14   26:aload_0         
	//   15   27:getfield        #61  <Field View mInAppMessageView>
	//   16   30:invokevirtual   #339 <Method void View.clearAnimation()>
		mInAppMessageView.setAnimation(animation);
	//   17   33:aload_0         
	//   18   34:getfield        #61  <Field View mInAppMessageView>
	//   19   37:aload_2         
	//   20   38:invokevirtual   #343 <Method void View.setAnimation(Animation)>
		animation.startNow();
	//   21   41:aload_2         
	//   22   42:invokevirtual   #346 <Method void Animation.startNow()>
		mInAppMessageView.invalidate();
	//   23   45:aload_0         
	//   24   46:getfield        #61  <Field View mInAppMessageView>
	//   25   49:invokevirtual   #349 <Method void View.invalidate()>
	//   26   52:return          
	}

	public void close()
	{
		mInAppMessageView.removeCallbacks(mDismissRunnable);
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field View mInAppMessageView>
	//    2    4:aload_0         
	//    3    5:getfield        #157 <Field Runnable mDismissRunnable>
	//    4    8:invokevirtual   #354 <Method boolean View.removeCallbacks(Runnable)>
	//    5   11:pop             
		mInAppMessageViewLifecycleListener.beforeClosed(mInAppMessageView, mInAppMessage);
	//    6   12:aload_0         
	//    7   13:getfield        #65  <Field IInAppMessageViewLifecycleListener mInAppMessageViewLifecycleListener>
	//    8   16:aload_0         
	//    9   17:getfield        #61  <Field View mInAppMessageView>
	//   10   20:aload_0         
	//   11   21:getfield        #63  <Field IInAppMessage mInAppMessage>
	//   12   24:invokeinterface #357 <Method void IInAppMessageViewLifecycleListener.beforeClosed(View, IInAppMessage)>
		if(mInAppMessage.getAnimateOut())
	//*  13   29:aload_0         
	//*  14   30:getfield        #63  <Field IInAppMessage mInAppMessage>
	//*  15   33:invokeinterface #360 <Method boolean IInAppMessage.getAnimateOut()>
	//*  16   38:ifeq            52
		{
			mIsAnimatingClose = true;
	//   17   41:aload_0         
	//   18   42:iconst_1        
	//   19   43:putfield        #67  <Field boolean mIsAnimatingClose>
			setAndStartAnimation(false);
	//   20   46:aload_0         
	//   21   47:iconst_0        
	//   22   48:invokespecial   #310 <Method void setAndStartAnimation(boolean)>
			return;
	//   23   51:return          
		} else
		{
			closeInAppMessageView();
	//   24   52:aload_0         
	//   25   53:invokespecial   #170 <Method void closeInAppMessageView()>
			return;
	//   26   56:return          
		}
	}

	public IInAppMessage getInAppMessage()
	{
		return mInAppMessage;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field IInAppMessage mInAppMessage>
	//    2    4:areturn         
	}

	public View getInAppMessageView()
	{
		return mInAppMessageView;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field View mInAppMessageView>
	//    2    4:areturn         
	}

	public boolean getIsAnimatingClose()
	{
		return mIsAnimatingClose;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field boolean mIsAnimatingClose>
	//    2    4:ireturn         
	}

	public void open(Activity activity)
	{
		final FrameLayout frameLayout = (FrameLayout)activity.getWindow().getDecorView().findViewById(0x1020002);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #372 <Method Window Activity.getWindow()>
	//    2    4:invokevirtual   #377 <Method View Window.getDecorView()>
	//    3    7:ldc2            #378 <Int 0x1020002>
	//    4   10:invokevirtual   #382 <Method View View.findViewById(int)>
	//    5   13:checkcast       #261 <Class FrameLayout>
	//    6   16:astore          4
		int i = frameLayout.getHeight();
	//    7   18:aload           4
	//    8   20:invokevirtual   #264 <Method int FrameLayout.getHeight()>
	//    9   23:istore_2        
		final int displayHeight = ViewUtils.getDisplayHeight(activity);
	//   10   24:aload_1         
	//   11   25:invokestatic    #386 <Method int ViewUtils.getDisplayHeight(Activity)>
	//   12   28:istore_3        
		if(i == 0)
	//*  13   29:iload_2         
	//*  14   30:ifne            62
		{
			activity = ((Activity) (frameLayout.getViewTreeObserver()));
	//   15   33:aload           4
	//   16   35:invokevirtual   #390 <Method ViewTreeObserver FrameLayout.getViewTreeObserver()>
	//   17   38:astore_1        
			if(((ViewTreeObserver) (activity)).isAlive())
	//*  18   39:aload_1         
	//*  19   40:invokevirtual   #395 <Method boolean ViewTreeObserver.isAlive()>
	//*  20   43:ifeq            124
			{
				((ViewTreeObserver) (activity)).addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

					public void onGlobalLayout()
					{
						String s = InAppMessageViewWrapper.TAG;
					//    0    0:invokestatic    #34  <Method String InAppMessageViewWrapper.access$000()>
					//    1    3:astore_1        
						StringBuilder stringbuilder1 = new StringBuilder();
					//    2    4:new             #36  <Class StringBuilder>
					//    3    7:dup             
					//    4    8:invokespecial   #37  <Method void StringBuilder()>
					//    5   11:astore_2        
						stringbuilder1.append("Detected root view height of ");
					//    6   12:aload_2         
					//    7   13:ldc1            #39  <String "Detected root view height of ">
					//    8   15:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
					//    9   18:pop             
						stringbuilder1.append(frameLayout.getHeight());
					//   10   19:aload_2         
					//   11   20:aload_0         
					//   12   21:getfield        #23  <Field FrameLayout val$frameLayout>
					//   13   24:invokevirtual   #49  <Method int FrameLayout.getHeight()>
					//   14   27:invokevirtual   #52  <Method StringBuilder StringBuilder.append(int)>
					//   15   30:pop             
						stringbuilder1.append(", display height of ");
					//   16   31:aload_2         
					//   17   32:ldc1            #54  <String ", display height of ">
					//   18   34:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
					//   19   37:pop             
						stringbuilder1.append(displayHeight);
					//   20   38:aload_2         
					//   21   39:aload_0         
					//   22   40:getfield        #25  <Field int val$displayHeight>
					//   23   43:invokevirtual   #52  <Method StringBuilder StringBuilder.append(int)>
					//   24   46:pop             
						stringbuilder1.append(" in onGlobalLayout");
					//   25   47:aload_2         
					//   26   48:ldc1            #56  <String " in onGlobalLayout">
					//   27   50:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
					//   28   53:pop             
						AppboyLogger.d(s, stringbuilder1.toString());
					//   29   54:aload_1         
					//   30   55:aload_2         
					//   31   56:invokevirtual   #59  <Method String StringBuilder.toString()>
					//   32   59:invokestatic    #65  <Method int AppboyLogger.d(String, String)>
					//   33   62:pop             
						frameLayout.removeView(mInAppMessageView);
					//   34   63:aload_0         
					//   35   64:getfield        #23  <Field FrameLayout val$frameLayout>
					//   36   67:aload_0         
					//   37   68:getfield        #21  <Field InAppMessageViewWrapper this$0>
					//   38   71:invokestatic    #69  <Method View InAppMessageViewWrapper.access$100(InAppMessageViewWrapper)>
					//   39   74:invokevirtual   #73  <Method void FrameLayout.removeView(View)>
						open(frameLayout, displayHeight);
					//   40   77:aload_0         
					//   41   78:getfield        #21  <Field InAppMessageViewWrapper this$0>
					//   42   81:aload_0         
					//   43   82:getfield        #23  <Field FrameLayout val$frameLayout>
					//   44   85:aload_0         
					//   45   86:getfield        #25  <Field int val$displayHeight>
					//   46   89:invokestatic    #76  <Method void InAppMessageViewWrapper.access$200(InAppMessageViewWrapper, FrameLayout, int)>
						ViewUtils.removeOnGlobalLayoutListenerSafe(frameLayout.getViewTreeObserver(), ((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
					//   47   92:aload_0         
					//   48   93:getfield        #23  <Field FrameLayout val$frameLayout>
					//   49   96:invokevirtual   #80  <Method ViewTreeObserver FrameLayout.getViewTreeObserver()>
					//   50   99:aload_0         
					//   51  100:invokestatic    #86  <Method void ViewUtils.removeOnGlobalLayoutListenerSafe(ViewTreeObserver, android.view.ViewTreeObserver$OnGlobalLayoutListener)>
					//   52  103:return          
					}

					final InAppMessageViewWrapper this$0;
					final int val$displayHeight;
					final FrameLayout val$frameLayout;

			
			{
				this$0 = InAppMessageViewWrapper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field InAppMessageViewWrapper this$0>
				frameLayout = framelayout;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field FrameLayout val$frameLayout>
				displayHeight = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #25  <Field int val$displayHeight>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
				}
);
	//   21   46:aload_1         
	//   22   47:new             #8   <Class InAppMessageViewWrapper$1>
	//   23   50:dup             
	//   24   51:aload_0         
	//   25   52:aload           4
	//   26   54:iload_3         
	//   27   55:invokespecial   #397 <Method void InAppMessageViewWrapper$1(InAppMessageViewWrapper, FrameLayout, int)>
	//   28   58:invokevirtual   #401 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
				return;
	//   29   61:return          
			}
		} else
		{
			activity = ((Activity) (TAG));
	//   30   62:getstatic       #54  <Field String TAG>
	//   31   65:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   32   66:new             #270 <Class StringBuilder>
	//   33   69:dup             
	//   34   70:invokespecial   #271 <Method void StringBuilder()>
	//   35   73:astore          5
			stringbuilder.append("Detected root view height of ");
	//   36   75:aload           5
	//   37   77:ldc2            #403 <String "Detected root view height of ">
	//   38   80:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//   39   83:pop             
			stringbuilder.append(i);
	//   40   84:aload           5
	//   41   86:iload_2         
	//   42   87:invokevirtual   #280 <Method StringBuilder StringBuilder.append(int)>
	//   43   90:pop             
			stringbuilder.append(", display height of ");
	//   44   91:aload           5
	//   45   93:ldc2            #405 <String ", display height of ">
	//   46   96:invokevirtual   #277 <Method StringBuilder StringBuilder.append(String)>
	//   47   99:pop             
			stringbuilder.append(displayHeight);
	//   48  100:aload           5
	//   49  102:iload_3         
	//   50  103:invokevirtual   #280 <Method StringBuilder StringBuilder.append(int)>
	//   51  106:pop             
			AppboyLogger.d(((String) (activity)), stringbuilder.toString());
	//   52  107:aload_1         
	//   53  108:aload           5
	//   54  110:invokevirtual   #285 <Method String StringBuilder.toString()>
	//   55  113:invokestatic    #207 <Method int AppboyLogger.d(String, String)>
	//   56  116:pop             
			open(frameLayout, displayHeight);
	//   57  117:aload_0         
	//   58  118:aload           4
	//   59  120:iload_3         
	//   60  121:invokespecial   #147 <Method void open(FrameLayout, int)>
		}
	//   61  124:return          
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/inappmessage/InAppMessageViewWrapper);
	private List mButtons;
	private View mClickableInAppMessageView;
	private View mCloseButton;
	private final Animation mClosingAnimation;
	private Runnable mDismissRunnable;
	private final IInAppMessage mInAppMessage;
	private final View mInAppMessageView;
	private final IInAppMessageViewLifecycleListener mInAppMessageViewLifecycleListener;
	private boolean mIsAnimatingClose;
	private final Animation mOpeningAnimation;

	static 
	{
	//    0    0:ldc1            #2   <Class InAppMessageViewWrapper>
	//    1    2:invokestatic    #52  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #54  <Field String TAG>
	//*   3    8:return          
	}


/*
	static String access$000()
	{
		return TAG;
	//    0    0:getstatic       #54  <Field String TAG>
	//    1    3:areturn         
	}

*/


/*
	static View access$100(InAppMessageViewWrapper inappmessageviewwrapper)
	{
		return inappmessageviewwrapper.mInAppMessageView;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field View mInAppMessageView>
	//    2    4:areturn         
	}

*/


/*
	static void access$200(InAppMessageViewWrapper inappmessageviewwrapper, FrameLayout framelayout, int i)
	{
		inappmessageviewwrapper.open(framelayout, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #147 <Method void open(FrameLayout, int)>
		return;
	//    4    6:return          
	}

*/


/*
	static IInAppMessage access$300(InAppMessageViewWrapper inappmessageviewwrapper)
	{
		return inappmessageviewwrapper.mInAppMessage;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field IInAppMessage mInAppMessage>
	//    2    4:areturn         
	}

*/


/*
	static IInAppMessageViewLifecycleListener access$400(InAppMessageViewWrapper inappmessageviewwrapper)
	{
		return inappmessageviewwrapper.mInAppMessageViewLifecycleListener;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field IInAppMessageViewLifecycleListener mInAppMessageViewLifecycleListener>
	//    2    4:areturn         
	}

*/


/*
	static List access$500(InAppMessageViewWrapper inappmessageviewwrapper)
	{
		return inappmessageviewwrapper.mButtons;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field List mButtons>
	//    2    4:areturn         
	}

*/


/*
	static Runnable access$600(InAppMessageViewWrapper inappmessageviewwrapper)
	{
		return inappmessageviewwrapper.mDismissRunnable;
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field Runnable mDismissRunnable>
	//    2    4:areturn         
	}

*/


/*
	static void access$700(InAppMessageViewWrapper inappmessageviewwrapper)
	{
		inappmessageviewwrapper.addDismissRunnable();
	//    0    0:aload_0         
	//    1    1:invokespecial   #162 <Method void addDismissRunnable()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$800(InAppMessageViewWrapper inappmessageviewwrapper)
	{
		inappmessageviewwrapper.announceForAccessibilityIfNecessary();
	//    0    0:aload_0         
	//    1    1:invokespecial   #166 <Method void announceForAccessibilityIfNecessary()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$900(InAppMessageViewWrapper inappmessageviewwrapper)
	{
		inappmessageviewwrapper.closeInAppMessageView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #170 <Method void closeInAppMessageView()>
		return;
	//    2    4:return          
	}

*/
}
