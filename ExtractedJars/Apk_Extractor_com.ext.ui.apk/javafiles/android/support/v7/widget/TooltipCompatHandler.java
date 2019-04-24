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
	implements android.view.View.OnAttachStateChangeListener, android.view.View.OnHoverListener, android.view.View.OnLongClickListener
{

	private TooltipCompatHandler(View view, CharSequence charsequence)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #12  <Class TooltipCompatHandler$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #56  <Method void TooltipCompatHandler$1(TooltipCompatHandler)>
	//    7   13:putfield        #58  <Field Runnable mShowRunnable>
	//    8   16:aload_0         
	//    9   17:new             #14  <Class TooltipCompatHandler$2>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #59  <Method void TooltipCompatHandler$2(TooltipCompatHandler)>
	//   13   25:putfield        #61  <Field Runnable mHideRunnable>
		mAnchor = view;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:putfield        #63  <Field View mAnchor>
		mTooltipText = charsequence;
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:putfield        #65  <Field CharSequence mTooltipText>
		mAnchor.setOnLongClickListener(((android.view.View.OnLongClickListener) (this)));
	//   20   38:aload_0         
	//   21   39:getfield        #63  <Field View mAnchor>
	//   22   42:aload_0         
	//   23   43:invokevirtual   #71  <Method void View.setOnLongClickListener(android.view.View$OnLongClickListener)>
		mAnchor.setOnHoverListener(((android.view.View.OnHoverListener) (this)));
	//   24   46:aload_0         
	//   25   47:getfield        #63  <Field View mAnchor>
	//   26   50:aload_0         
	//   27   51:invokevirtual   #75  <Method void View.setOnHoverListener(android.view.View$OnHoverListener)>
	//   28   54:return          
	}

	private void hide()
	{
		if(sActiveHandler == this)
	//*   0    0:getstatic       #88  <Field TooltipCompatHandler sActiveHandler>
	//*   1    3:aload_0         
	//*   2    4:if_acmpne       38
		{
			sActiveHandler = null;
	//    3    7:aconst_null     
	//    4    8:putstatic       #88  <Field TooltipCompatHandler sActiveHandler>
			if(mPopup != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #90  <Field TooltipPopup mPopup>
	//*   7   15:ifnull          63
			{
				mPopup.hide();
	//    8   18:aload_0         
	//    9   19:getfield        #90  <Field TooltipPopup mPopup>
	//   10   22:invokevirtual   #93  <Method void TooltipPopup.hide()>
				mPopup = null;
	//   11   25:aload_0         
	//   12   26:aconst_null     
	//   13   27:putfield        #90  <Field TooltipPopup mPopup>
				mAnchor.removeOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (this)));
	//   14   30:aload_0         
	//   15   31:getfield        #63  <Field View mAnchor>
	//   16   34:aload_0         
	//   17   35:invokevirtual   #97  <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
			} else
	//*  18   38:aload_0         
	//*  19   39:getfield        #63  <Field View mAnchor>
	//*  20   42:aload_0         
	//*  21   43:getfield        #58  <Field Runnable mShowRunnable>
	//*  22   46:invokevirtual   #101 <Method boolean View.removeCallbacks(Runnable)>
	//*  23   49:pop             
	//*  24   50:aload_0         
	//*  25   51:getfield        #63  <Field View mAnchor>
	//*  26   54:aload_0         
	//*  27   55:getfield        #61  <Field Runnable mHideRunnable>
	//*  28   58:invokevirtual   #101 <Method boolean View.removeCallbacks(Runnable)>
	//*  29   61:pop             
	//*  30   62:return          
			{
				Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
	//   31   63:ldc1            #32  <String "TooltipCompatHandler">
	//   32   65:ldc1            #103 <String "sActiveHandler.mPopup == null">
	//   33   67:invokestatic    #109 <Method int Log.e(String, String)>
	//   34   70:pop             
			}
		}
		mAnchor.removeCallbacks(mShowRunnable);
		mAnchor.removeCallbacks(mHideRunnable);
	//*  35   71:goto            38
	}

	public static void setTooltipText(View view, CharSequence charsequence)
	{
		if(TextUtils.isEmpty(charsequence))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #116 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            45
		{
			if(sActiveHandler != null && sActiveHandler.mAnchor == view)
	//*   3    7:getstatic       #88  <Field TooltipCompatHandler sActiveHandler>
	//*   4   10:ifnull          29
	//*   5   13:getstatic       #88  <Field TooltipCompatHandler sActiveHandler>
	//*   6   16:getfield        #63  <Field View mAnchor>
	//*   7   19:aload_0         
	//*   8   20:if_acmpne       29
				sActiveHandler.hide();
	//    9   23:getstatic       #88  <Field TooltipCompatHandler sActiveHandler>
	//   10   26:invokespecial   #86  <Method void hide()>
			view.setOnLongClickListener(((android.view.View.OnLongClickListener) (null)));
	//   11   29:aload_0         
	//   12   30:aconst_null     
	//   13   31:invokevirtual   #71  <Method void View.setOnLongClickListener(android.view.View$OnLongClickListener)>
			view.setLongClickable(false);
	//   14   34:aload_0         
	//   15   35:iconst_0        
	//   16   36:invokevirtual   #119 <Method void View.setLongClickable(boolean)>
			view.setOnHoverListener(((android.view.View.OnHoverListener) (null)));
	//   17   39:aload_0         
	//   18   40:aconst_null     
	//   19   41:invokevirtual   #75  <Method void View.setOnHoverListener(android.view.View$OnHoverListener)>
			return;
	//   20   44:return          
		} else
		{
			new TooltipCompatHandler(view, charsequence);
	//   21   45:new             #2   <Class TooltipCompatHandler>
	//   22   48:dup             
	//   23   49:aload_0         
	//   24   50:aload_1         
	//   25   51:invokespecial   #121 <Method void TooltipCompatHandler(View, CharSequence)>
	//   26   54:pop             
			return;
	//   27   55:return          
		}
	}

	private void show(boolean flag)
	{
		if(!ViewCompat.isAttachedToWindow(mAnchor))
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field View mAnchor>
	//*   2    4:invokestatic    #127 <Method boolean ViewCompat.isAttachedToWindow(View)>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		if(sActiveHandler != null)
	//*   5   11:getstatic       #88  <Field TooltipCompatHandler sActiveHandler>
	//*   6   14:ifnull          23
			sActiveHandler.hide();
	//    7   17:getstatic       #88  <Field TooltipCompatHandler sActiveHandler>
	//    8   20:invokespecial   #86  <Method void hide()>
		sActiveHandler = this;
	//    9   23:aload_0         
	//   10   24:putstatic       #88  <Field TooltipCompatHandler sActiveHandler>
		mFromTouch = flag;
	//   11   27:aload_0         
	//   12   28:iload_1         
	//   13   29:putfield        #129 <Field boolean mFromTouch>
		mPopup = new TooltipPopup(mAnchor.getContext());
	//   14   32:aload_0         
	//   15   33:new             #92  <Class TooltipPopup>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:getfield        #63  <Field View mAnchor>
	//   19   41:invokevirtual   #133 <Method Context View.getContext()>
	//   20   44:invokespecial   #136 <Method void TooltipPopup(Context)>
	//   21   47:putfield        #90  <Field TooltipPopup mPopup>
		mPopup.show(mAnchor, mAnchorX, mAnchorY, mFromTouch, mTooltipText);
	//   22   50:aload_0         
	//   23   51:getfield        #90  <Field TooltipPopup mPopup>
	//   24   54:aload_0         
	//   25   55:getfield        #63  <Field View mAnchor>
	//   26   58:aload_0         
	//   27   59:getfield        #138 <Field int mAnchorX>
	//   28   62:aload_0         
	//   29   63:getfield        #140 <Field int mAnchorY>
	//   30   66:aload_0         
	//   31   67:getfield        #129 <Field boolean mFromTouch>
	//   32   70:aload_0         
	//   33   71:getfield        #65  <Field CharSequence mTooltipText>
	//   34   74:invokevirtual   #143 <Method void TooltipPopup.show(View, int, int, boolean, CharSequence)>
		mAnchor.addOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (this)));
	//   35   77:aload_0         
	//   36   78:getfield        #63  <Field View mAnchor>
	//   37   81:aload_0         
	//   38   82:invokevirtual   #146 <Method void View.addOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
		long l;
		if(mFromTouch)
	//*  39   85:aload_0         
	//*  40   86:getfield        #129 <Field boolean mFromTouch>
	//*  41   89:ifeq            122
			l = 2500L;
	//   42   92:ldc2w           #27  <Long 2500L>
	//   43   95:lstore_2        
		else
	//*  44   96:aload_0         
	//*  45   97:getfield        #63  <Field View mAnchor>
	//*  46  100:aload_0         
	//*  47  101:getfield        #61  <Field Runnable mHideRunnable>
	//*  48  104:invokevirtual   #101 <Method boolean View.removeCallbacks(Runnable)>
	//*  49  107:pop             
	//*  50  108:aload_0         
	//*  51  109:getfield        #63  <Field View mAnchor>
	//*  52  112:aload_0         
	//*  53  113:getfield        #61  <Field Runnable mHideRunnable>
	//*  54  116:lload_2         
	//*  55  117:invokevirtual   #150 <Method boolean View.postDelayed(Runnable, long)>
	//*  56  120:pop             
	//*  57  121:return          
		if((ViewCompat.getWindowSystemUiVisibility(mAnchor) & 1) == 1)
	//*  58  122:aload_0         
	//*  59  123:getfield        #63  <Field View mAnchor>
	//*  60  126:invokestatic    #154 <Method int ViewCompat.getWindowSystemUiVisibility(View)>
	//*  61  129:iconst_1        
	//*  62  130:iand            
	//*  63  131:iconst_1        
	//*  64  132:icmpne          147
			l = 3000L - (long)ViewConfiguration.getLongPressTimeout();
	//   65  135:ldc2w           #24  <Long 3000L>
	//   66  138:invokestatic    #160 <Method int ViewConfiguration.getLongPressTimeout()>
	//   67  141:i2l             
	//   68  142:lsub            
	//   69  143:lstore_2        
		else
	//*  70  144:goto            96
			l = 15000L - (long)ViewConfiguration.getLongPressTimeout();
	//   71  147:ldc2w           #21  <Long 15000L>
	//   72  150:invokestatic    #160 <Method int ViewConfiguration.getLongPressTimeout()>
	//   73  153:i2l             
	//   74  154:lsub            
	//   75  155:lstore_2        
		mAnchor.removeCallbacks(mHideRunnable);
		mAnchor.postDelayed(mHideRunnable, l);
	//*  76  156:goto            96
	}

	public boolean onHover(View view, MotionEvent motionevent)
	{
		if(mPopup == null || !mFromTouch) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field TooltipPopup mPopup>
	//    2    4:ifnull          16
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field boolean mFromTouch>
	//    5   11:ifeq            16
_L1:
		return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
	//*   8   16:aload_0         
	//*   9   17:getfield        #63  <Field View mAnchor>
	//*  10   20:invokevirtual   #133 <Method Context View.getContext()>
	//*  11   23:ldc1            #164 <String "accessibility">
	//*  12   25:invokevirtual   #170 <Method Object Context.getSystemService(String)>
	//*  13   28:checkcast       #172 <Class AccessibilityManager>
	//*  14   31:astore_1        
_L2:
		if(((AccessibilityManager) (view = ((View) ((AccessibilityManager)mAnchor.getContext().getSystemService("accessibility"))))).isEnabled() && ((AccessibilityManager) (view)).isTouchExplorationEnabled()) goto _L1; else goto _L3
	//   15   32:aload_1         
	//   16   33:invokevirtual   #176 <Method boolean AccessibilityManager.isEnabled()>
	//   17   36:ifeq            46
	//   18   39:aload_1         
	//   19   40:invokevirtual   #179 <Method boolean AccessibilityManager.isTouchExplorationEnabled()>
	//   20   43:ifne            14
_L3:
		switch(motionevent.getAction())
	//*  21   46:aload_2         
	//*  22   47:invokevirtual   #184 <Method int MotionEvent.getAction()>
		{
	//*  23   50:tableswitch     7 10: default 80
	//	               7 82
	//	               8 80
	//	               9 80
	//	               10 147
		case 8: // '\b'
		case 9: // '\t'
		default:
			return false;
	//   24   80:iconst_0        
	//   25   81:ireturn         

		case 7: // '\007'
			if(mAnchor.isEnabled() && mPopup == null)
	//*  26   82:aload_0         
	//*  27   83:getfield        #63  <Field View mAnchor>
	//*  28   86:invokevirtual   #185 <Method boolean View.isEnabled()>
	//*  29   89:ifeq            14
	//*  30   92:aload_0         
	//*  31   93:getfield        #90  <Field TooltipPopup mPopup>
	//*  32   96:ifnonnull       14
			{
				mAnchorX = (int)motionevent.getX();
	//   33   99:aload_0         
	//   34  100:aload_2         
	//   35  101:invokevirtual   #189 <Method float MotionEvent.getX()>
	//   36  104:f2i             
	//   37  105:putfield        #138 <Field int mAnchorX>
				mAnchorY = (int)motionevent.getY();
	//   38  108:aload_0         
	//   39  109:aload_2         
	//   40  110:invokevirtual   #192 <Method float MotionEvent.getY()>
	//   41  113:f2i             
	//   42  114:putfield        #140 <Field int mAnchorY>
				mAnchor.removeCallbacks(mShowRunnable);
	//   43  117:aload_0         
	//   44  118:getfield        #63  <Field View mAnchor>
	//   45  121:aload_0         
	//   46  122:getfield        #58  <Field Runnable mShowRunnable>
	//   47  125:invokevirtual   #101 <Method boolean View.removeCallbacks(Runnable)>
	//   48  128:pop             
				mAnchor.postDelayed(mShowRunnable, ViewConfiguration.getLongPressTimeout());
	//   49  129:aload_0         
	//   50  130:getfield        #63  <Field View mAnchor>
	//   51  133:aload_0         
	//   52  134:getfield        #58  <Field Runnable mShowRunnable>
	//   53  137:invokestatic    #160 <Method int ViewConfiguration.getLongPressTimeout()>
	//   54  140:i2l             
	//   55  141:invokevirtual   #150 <Method boolean View.postDelayed(Runnable, long)>
	//   56  144:pop             
				return false;
	//   57  145:iconst_0        
	//   58  146:ireturn         
			}
			break;

		case 10: // '\n'
			hide();
	//   59  147:aload_0         
	//   60  148:invokespecial   #86  <Method void hide()>
			return false;
	//   61  151:iconst_0        
	//   62  152:ireturn         
		}
		if(true) goto _L1; else goto _L4
_L4:
	}

	public boolean onLongClick(View view)
	{
		mAnchorX = view.getWidth() / 2;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #196 <Method int View.getWidth()>
	//    3    5:iconst_2        
	//    4    6:idiv            
	//    5    7:putfield        #138 <Field int mAnchorX>
		mAnchorY = view.getHeight() / 2;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #199 <Method int View.getHeight()>
	//    9   15:iconst_2        
	//   10   16:idiv            
	//   11   17:putfield        #140 <Field int mAnchorY>
		show(true);
	//   12   20:aload_0         
	//   13   21:iconst_1        
	//   14   22:invokespecial   #82  <Method void show(boolean)>
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
	//    1    1:invokespecial   #86  <Method void hide()>
	//    2    4:return          
	}

	private static final long HOVER_HIDE_TIMEOUT_MS = 15000L;
	private static final long HOVER_HIDE_TIMEOUT_SHORT_MS = 3000L;
	private static final long LONG_CLICK_HIDE_TIMEOUT_MS = 2500L;
	private static final String TAG = "TooltipCompatHandler";
	private static TooltipCompatHandler sActiveHandler;
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
	//    2    2:invokespecial   #82  <Method void show(boolean)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$100(TooltipCompatHandler tooltipcompathandler)
	{
		tooltipcompathandler.hide();
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method void hide()>
		return;
	//    2    4:return          
	}

*/
}
