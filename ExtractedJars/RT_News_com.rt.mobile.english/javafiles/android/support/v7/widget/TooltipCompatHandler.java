// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.*;
import android.view.accessibility.AccessibilityManager;

// Referenced classes of package android.support.v7.widget:
//			TooltipPopup

class TooltipCompatHandler
	implements android.view.View.OnLongClickListener, android.view.View.OnHoverListener, android.view.View.OnAttachStateChangeListener
{

	private TooltipCompatHandler(View view, CharSequence charsequence)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #12  <Class TooltipCompatHandler$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #57  <Method void TooltipCompatHandler$1(TooltipCompatHandler)>
	//    7   13:putfield        #59  <Field Runnable mShowRunnable>
	//    8   16:aload_0         
	//    9   17:new             #14  <Class TooltipCompatHandler$2>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #60  <Method void TooltipCompatHandler$2(TooltipCompatHandler)>
	//   13   25:putfield        #62  <Field Runnable mHideRunnable>
		mAnchor = view;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:putfield        #64  <Field View mAnchor>
		mTooltipText = charsequence;
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:putfield        #66  <Field CharSequence mTooltipText>
		mAnchor.setOnLongClickListener(((android.view.View.OnLongClickListener) (this)));
	//   20   38:aload_0         
	//   21   39:getfield        #64  <Field View mAnchor>
	//   22   42:aload_0         
	//   23   43:invokevirtual   #72  <Method void View.setOnLongClickListener(android.view.View$OnLongClickListener)>
		mAnchor.setOnHoverListener(((android.view.View.OnHoverListener) (this)));
	//   24   46:aload_0         
	//   25   47:getfield        #64  <Field View mAnchor>
	//   26   50:aload_0         
	//   27   51:invokevirtual   #76  <Method void View.setOnHoverListener(android.view.View$OnHoverListener)>
	//   28   54:return          
	}

	private void cancelPendingShow()
	{
		mAnchor.removeCallbacks(mShowRunnable);
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field View mAnchor>
	//    2    4:aload_0         
	//    3    5:getfield        #59  <Field Runnable mShowRunnable>
	//    4    8:invokevirtual   #92  <Method boolean View.removeCallbacks(Runnable)>
	//    5   11:pop             
	//    6   12:return          
	}

	private void hide()
	{
		if(sActiveHandler == this)
	//*   0    0:getstatic       #94  <Field TooltipCompatHandler sActiveHandler>
	//*   1    3:aload_0         
	//*   2    4:if_acmpne       49
		{
			sActiveHandler = null;
	//    3    7:aconst_null     
	//    4    8:putstatic       #94  <Field TooltipCompatHandler sActiveHandler>
			if(mPopup != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #96  <Field TooltipPopup mPopup>
	//*   7   15:ifnull          41
			{
				mPopup.hide();
	//    8   18:aload_0         
	//    9   19:getfield        #96  <Field TooltipPopup mPopup>
	//   10   22:invokevirtual   #99  <Method void TooltipPopup.hide()>
				mPopup = null;
	//   11   25:aload_0         
	//   12   26:aconst_null     
	//   13   27:putfield        #96  <Field TooltipPopup mPopup>
				mAnchor.removeOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (this)));
	//   14   30:aload_0         
	//   15   31:getfield        #64  <Field View mAnchor>
	//   16   34:aload_0         
	//   17   35:invokevirtual   #103 <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
			} else
	//*  18   38:goto            49
			{
				Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
	//   19   41:ldc1            #32  <String "TooltipCompatHandler">
	//   20   43:ldc1            #105 <String "sActiveHandler.mPopup == null">
	//   21   45:invokestatic    #111 <Method int Log.e(String, String)>
	//   22   48:pop             
			}
		}
		if(sPendingHandler == this)
	//*  23   49:getstatic       #113 <Field TooltipCompatHandler sPendingHandler>
	//*  24   52:aload_0         
	//*  25   53:if_acmpne       60
			setPendingHandler(((TooltipCompatHandler) (null)));
	//   26   56:aconst_null     
	//   27   57:invokestatic    #116 <Method void setPendingHandler(TooltipCompatHandler)>
		mAnchor.removeCallbacks(mHideRunnable);
	//   28   60:aload_0         
	//   29   61:getfield        #64  <Field View mAnchor>
	//   30   64:aload_0         
	//   31   65:getfield        #62  <Field Runnable mHideRunnable>
	//   32   68:invokevirtual   #92  <Method boolean View.removeCallbacks(Runnable)>
	//   33   71:pop             
	//   34   72:return          
	}

	private void scheduleShow()
	{
		mAnchor.postDelayed(mShowRunnable, ViewConfiguration.getLongPressTimeout());
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field View mAnchor>
	//    2    4:aload_0         
	//    3    5:getfield        #59  <Field Runnable mShowRunnable>
	//    4    8:invokestatic    #123 <Method int ViewConfiguration.getLongPressTimeout()>
	//    5   11:i2l             
	//    6   12:invokevirtual   #127 <Method boolean View.postDelayed(Runnable, long)>
	//    7   15:pop             
	//    8   16:return          
	}

	private static void setPendingHandler(TooltipCompatHandler tooltipcompathandler)
	{
		if(sPendingHandler != null)
	//*   0    0:getstatic       #113 <Field TooltipCompatHandler sPendingHandler>
	//*   1    3:ifnull          12
			sPendingHandler.cancelPendingShow();
	//    2    6:getstatic       #113 <Field TooltipCompatHandler sPendingHandler>
	//    3    9:invokespecial   #129 <Method void cancelPendingShow()>
		sPendingHandler = tooltipcompathandler;
	//    4   12:aload_0         
	//    5   13:putstatic       #113 <Field TooltipCompatHandler sPendingHandler>
		if(sPendingHandler != null)
	//*   6   16:getstatic       #113 <Field TooltipCompatHandler sPendingHandler>
	//*   7   19:ifnull          28
			sPendingHandler.scheduleShow();
	//    8   22:getstatic       #113 <Field TooltipCompatHandler sPendingHandler>
	//    9   25:invokespecial   #131 <Method void scheduleShow()>
	//   10   28:return          
	}

	public static void setTooltipText(View view, CharSequence charsequence)
	{
		if(sPendingHandler != null && sPendingHandler.mAnchor == view)
	//*   0    0:getstatic       #113 <Field TooltipCompatHandler sPendingHandler>
	//*   1    3:ifnull          20
	//*   2    6:getstatic       #113 <Field TooltipCompatHandler sPendingHandler>
	//*   3    9:getfield        #64  <Field View mAnchor>
	//*   4   12:aload_0         
	//*   5   13:if_acmpne       20
			setPendingHandler(((TooltipCompatHandler) (null)));
	//    6   16:aconst_null     
	//    7   17:invokestatic    #116 <Method void setPendingHandler(TooltipCompatHandler)>
		if(TextUtils.isEmpty(charsequence))
	//*   8   20:aload_1         
	//*   9   21:invokestatic    #138 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  10   24:ifeq            65
		{
			if(sActiveHandler != null && sActiveHandler.mAnchor == view)
	//*  11   27:getstatic       #94  <Field TooltipCompatHandler sActiveHandler>
	//*  12   30:ifnull          49
	//*  13   33:getstatic       #94  <Field TooltipCompatHandler sActiveHandler>
	//*  14   36:getfield        #64  <Field View mAnchor>
	//*  15   39:aload_0         
	//*  16   40:if_acmpne       49
				sActiveHandler.hide();
	//   17   43:getstatic       #94  <Field TooltipCompatHandler sActiveHandler>
	//   18   46:invokespecial   #87  <Method void hide()>
			view.setOnLongClickListener(((android.view.View.OnLongClickListener) (null)));
	//   19   49:aload_0         
	//   20   50:aconst_null     
	//   21   51:invokevirtual   #72  <Method void View.setOnLongClickListener(android.view.View$OnLongClickListener)>
			view.setLongClickable(false);
	//   22   54:aload_0         
	//   23   55:iconst_0        
	//   24   56:invokevirtual   #141 <Method void View.setLongClickable(boolean)>
			view.setOnHoverListener(((android.view.View.OnHoverListener) (null)));
	//   25   59:aload_0         
	//   26   60:aconst_null     
	//   27   61:invokevirtual   #76  <Method void View.setOnHoverListener(android.view.View$OnHoverListener)>
			return;
	//   28   64:return          
		} else
		{
			new TooltipCompatHandler(view, charsequence);
	//   29   65:new             #2   <Class TooltipCompatHandler>
	//   30   68:dup             
	//   31   69:aload_0         
	//   32   70:aload_1         
	//   33   71:invokespecial   #143 <Method void TooltipCompatHandler(View, CharSequence)>
	//   34   74:pop             
			return;
	//   35   75:return          
		}
	}

	private void show(boolean flag)
	{
		if(!ViewCompat.isAttachedToWindow(mAnchor))
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field View mAnchor>
	//*   2    4:invokestatic    #149 <Method boolean ViewCompat.isAttachedToWindow(View)>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		setPendingHandler(((TooltipCompatHandler) (null)));
	//    5   11:aconst_null     
	//    6   12:invokestatic    #116 <Method void setPendingHandler(TooltipCompatHandler)>
		if(sActiveHandler != null)
	//*   7   15:getstatic       #94  <Field TooltipCompatHandler sActiveHandler>
	//*   8   18:ifnull          27
			sActiveHandler.hide();
	//    9   21:getstatic       #94  <Field TooltipCompatHandler sActiveHandler>
	//   10   24:invokespecial   #87  <Method void hide()>
		sActiveHandler = this;
	//   11   27:aload_0         
	//   12   28:putstatic       #94  <Field TooltipCompatHandler sActiveHandler>
		mFromTouch = flag;
	//   13   31:aload_0         
	//   14   32:iload_1         
	//   15   33:putfield        #151 <Field boolean mFromTouch>
		mPopup = new TooltipPopup(mAnchor.getContext());
	//   16   36:aload_0         
	//   17   37:new             #98  <Class TooltipPopup>
	//   18   40:dup             
	//   19   41:aload_0         
	//   20   42:getfield        #64  <Field View mAnchor>
	//   21   45:invokevirtual   #155 <Method Context View.getContext()>
	//   22   48:invokespecial   #158 <Method void TooltipPopup(Context)>
	//   23   51:putfield        #96  <Field TooltipPopup mPopup>
		mPopup.show(mAnchor, mAnchorX, mAnchorY, mFromTouch, mTooltipText);
	//   24   54:aload_0         
	//   25   55:getfield        #96  <Field TooltipPopup mPopup>
	//   26   58:aload_0         
	//   27   59:getfield        #64  <Field View mAnchor>
	//   28   62:aload_0         
	//   29   63:getfield        #160 <Field int mAnchorX>
	//   30   66:aload_0         
	//   31   67:getfield        #162 <Field int mAnchorY>
	//   32   70:aload_0         
	//   33   71:getfield        #151 <Field boolean mFromTouch>
	//   34   74:aload_0         
	//   35   75:getfield        #66  <Field CharSequence mTooltipText>
	//   36   78:invokevirtual   #165 <Method void TooltipPopup.show(View, int, int, boolean, CharSequence)>
		mAnchor.addOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (this)));
	//   37   81:aload_0         
	//   38   82:getfield        #64  <Field View mAnchor>
	//   39   85:aload_0         
	//   40   86:invokevirtual   #168 <Method void View.addOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
		long l;
		if(mFromTouch)
	//*  41   89:aload_0         
	//*  42   90:getfield        #151 <Field boolean mFromTouch>
	//*  43   93:ifeq            103
			l = 2500L;
	//   44   96:ldc2w           #27  <Long 2500L>
	//   45   99:lstore_2        
		else
	//*  46  100:goto            137
		if((ViewCompat.getWindowSystemUiVisibility(mAnchor) & 1) == 1)
	//*  47  103:aload_0         
	//*  48  104:getfield        #64  <Field View mAnchor>
	//*  49  107:invokestatic    #172 <Method int ViewCompat.getWindowSystemUiVisibility(View)>
	//*  50  110:iconst_1        
	//*  51  111:iand            
	//*  52  112:iconst_1        
	//*  53  113:icmpne          128
			l = 3000L - (long)ViewConfiguration.getLongPressTimeout();
	//   54  116:ldc2w           #24  <Long 3000L>
	//   55  119:invokestatic    #123 <Method int ViewConfiguration.getLongPressTimeout()>
	//   56  122:i2l             
	//   57  123:lsub            
	//   58  124:lstore_2        
		else
	//*  59  125:goto            137
			l = 15000L - (long)ViewConfiguration.getLongPressTimeout();
	//   60  128:ldc2w           #21  <Long 15000L>
	//   61  131:invokestatic    #123 <Method int ViewConfiguration.getLongPressTimeout()>
	//   62  134:i2l             
	//   63  135:lsub            
	//   64  136:lstore_2        
		mAnchor.removeCallbacks(mHideRunnable);
	//   65  137:aload_0         
	//   66  138:getfield        #64  <Field View mAnchor>
	//   67  141:aload_0         
	//   68  142:getfield        #62  <Field Runnable mHideRunnable>
	//   69  145:invokevirtual   #92  <Method boolean View.removeCallbacks(Runnable)>
	//   70  148:pop             
		mAnchor.postDelayed(mHideRunnable, l);
	//   71  149:aload_0         
	//   72  150:getfield        #64  <Field View mAnchor>
	//   73  153:aload_0         
	//   74  154:getfield        #62  <Field Runnable mHideRunnable>
	//   75  157:lload_2         
	//   76  158:invokevirtual   #127 <Method boolean View.postDelayed(Runnable, long)>
	//   77  161:pop             
	//   78  162:return          
	}

	public boolean onHover(View view, MotionEvent motionevent)
	{
		if(mPopup != null && mFromTouch)
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field TooltipPopup mPopup>
	//*   2    4:ifnull          16
	//*   3    7:aload_0         
	//*   4    8:getfield        #151 <Field boolean mFromTouch>
	//*   5   11:ifeq            16
			return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
		view = ((View) ((AccessibilityManager)mAnchor.getContext().getSystemService("accessibility")));
	//    8   16:aload_0         
	//    9   17:getfield        #64  <Field View mAnchor>
	//   10   20:invokevirtual   #155 <Method Context View.getContext()>
	//   11   23:ldc1            #176 <String "accessibility">
	//   12   25:invokevirtual   #182 <Method Object Context.getSystemService(String)>
	//   13   28:checkcast       #184 <Class AccessibilityManager>
	//   14   31:astore_1        
		if(((AccessibilityManager) (view)).isEnabled() && ((AccessibilityManager) (view)).isTouchExplorationEnabled())
	//*  15   32:aload_1         
	//*  16   33:invokevirtual   #188 <Method boolean AccessibilityManager.isEnabled()>
	//*  17   36:ifeq            48
	//*  18   39:aload_1         
	//*  19   40:invokevirtual   #191 <Method boolean AccessibilityManager.isTouchExplorationEnabled()>
	//*  20   43:ifeq            48
			return false;
	//   21   46:iconst_0        
	//   22   47:ireturn         
		int i = motionevent.getAction();
	//   23   48:aload_2         
	//   24   49:invokevirtual   #196 <Method int MotionEvent.getAction()>
	//   25   52:istore_3        
		if(i != 7)
	//*  26   53:iload_3         
	//*  27   54:bipush          7
	//*  28   56:icmpeq          73
			if(i != 10)
	//*  29   59:iload_3         
	//*  30   60:bipush          10
	//*  31   62:icmpeq          67
			{
				return false;
	//   32   65:iconst_0        
	//   33   66:ireturn         
			} else
			{
				hide();
	//   34   67:aload_0         
	//   35   68:invokespecial   #87  <Method void hide()>
				return false;
	//   36   71:iconst_0        
	//   37   72:ireturn         
			}
		if(mAnchor.isEnabled() && mPopup == null)
	//*  38   73:aload_0         
	//*  39   74:getfield        #64  <Field View mAnchor>
	//*  40   77:invokevirtual   #197 <Method boolean View.isEnabled()>
	//*  41   80:ifeq            112
	//*  42   83:aload_0         
	//*  43   84:getfield        #96  <Field TooltipPopup mPopup>
	//*  44   87:ifnonnull       112
		{
			mAnchorX = (int)motionevent.getX();
	//   45   90:aload_0         
	//   46   91:aload_2         
	//   47   92:invokevirtual   #201 <Method float MotionEvent.getX()>
	//   48   95:f2i             
	//   49   96:putfield        #160 <Field int mAnchorX>
			mAnchorY = (int)motionevent.getY();
	//   50   99:aload_0         
	//   51  100:aload_2         
	//   52  101:invokevirtual   #204 <Method float MotionEvent.getY()>
	//   53  104:f2i             
	//   54  105:putfield        #162 <Field int mAnchorY>
			setPendingHandler(this);
	//   55  108:aload_0         
	//   56  109:invokestatic    #116 <Method void setPendingHandler(TooltipCompatHandler)>
		}
		return false;
	//   57  112:iconst_0        
	//   58  113:ireturn         
	}

	public boolean onLongClick(View view)
	{
		mAnchorX = view.getWidth() / 2;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #208 <Method int View.getWidth()>
	//    3    5:iconst_2        
	//    4    6:idiv            
	//    5    7:putfield        #160 <Field int mAnchorX>
		mAnchorY = view.getHeight() / 2;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #211 <Method int View.getHeight()>
	//    9   15:iconst_2        
	//   10   16:idiv            
	//   11   17:putfield        #162 <Field int mAnchorY>
		show(true);
	//   12   20:aload_0         
	//   13   21:iconst_1        
	//   14   22:invokespecial   #83  <Method void show(boolean)>
		return true;
	//   15   25:iconst_1        
	//   16   26:ireturn         
	}

	public void onViewAttachedToWindow(View view)
	{
	//    0    0:return          
	}

	public void onViewDetachedFromWindow(View view)
	{
		hide();
	//    0    0:aload_0         
	//    1    1:invokespecial   #87  <Method void hide()>
	//    2    4:return          
	}

	private static final long HOVER_HIDE_TIMEOUT_MS = 15000L;
	private static final long HOVER_HIDE_TIMEOUT_SHORT_MS = 3000L;
	private static final long LONG_CLICK_HIDE_TIMEOUT_MS = 2500L;
	private static final String TAG = "TooltipCompatHandler";
	private static TooltipCompatHandler sActiveHandler;
	private static TooltipCompatHandler sPendingHandler;
	private final View mAnchor;
	private int mAnchorX;
	private int mAnchorY;
	private boolean mFromTouch;
	private final Runnable mHideRunnable = new Runnable() {

		public void run()
		{
			hide();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field TooltipCompatHandler this$0>
		//    2    4:invokestatic    #22  <Method void TooltipCompatHandler.access$100(TooltipCompatHandler)>
		//    3    7:return          
		}

		final TooltipCompatHandler this$0;

			
			{
				this$0 = TooltipCompatHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field TooltipCompatHandler this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private TooltipPopup mPopup;
	private final Runnable mShowRunnable = new Runnable() {

		public void run()
		{
			show(false);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field TooltipCompatHandler this$0>
		//    2    4:iconst_0        
		//    3    5:invokestatic    #23  <Method void TooltipCompatHandler.access$000(TooltipCompatHandler, boolean)>
		//    4    8:return          
		}

		final TooltipCompatHandler this$0;

			
			{
				this$0 = TooltipCompatHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field TooltipCompatHandler this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private final CharSequence mTooltipText;


/*
	static void access$000(TooltipCompatHandler tooltipcompathandler, boolean flag)
	{
		tooltipcompathandler.show(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #83  <Method void show(boolean)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$100(TooltipCompatHandler tooltipcompathandler)
	{
		tooltipcompathandler.hide();
	//    0    0:aload_0         
	//    1    1:invokespecial   #87  <Method void hide()>
		return;
	//    2    4:return          
	}

*/
}
