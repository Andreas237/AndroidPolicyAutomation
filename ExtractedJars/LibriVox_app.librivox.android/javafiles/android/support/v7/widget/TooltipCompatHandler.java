// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.support.v4.view.ac;
import android.support.v4.view.ag;
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
	//    1    1:invokespecial   #47  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #49  <Class TooltipCompatHandler$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #52  <Method void TooltipCompatHandler$1(TooltipCompatHandler)>
	//    7   13:putfield        #54  <Field Runnable mShowRunnable>
	//    8   16:aload_0         
	//    9   17:new             #56  <Class TooltipCompatHandler$2>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #57  <Method void TooltipCompatHandler$2(TooltipCompatHandler)>
	//   13   25:putfield        #59  <Field Runnable mHideRunnable>
		mAnchor = view;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:putfield        #61  <Field View mAnchor>
		mTooltipText = charsequence;
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:putfield        #63  <Field CharSequence mTooltipText>
		mHoverSlop = ag.a(ViewConfiguration.get(mAnchor.getContext()));
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:getfield        #61  <Field View mAnchor>
	//   23   43:invokevirtual   #69  <Method Context View.getContext()>
	//   24   46:invokestatic    #75  <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   25   49:invokestatic    #81  <Method int ag.a(ViewConfiguration)>
	//   26   52:putfield        #83  <Field int mHoverSlop>
		clearAnchorPos();
	//   27   55:aload_0         
	//   28   56:invokespecial   #86  <Method void clearAnchorPos()>
		mAnchor.setOnLongClickListener(((android.view.View.OnLongClickListener) (this)));
	//   29   59:aload_0         
	//   30   60:getfield        #61  <Field View mAnchor>
	//   31   63:aload_0         
	//   32   64:invokevirtual   #90  <Method void View.setOnLongClickListener(android.view.View$OnLongClickListener)>
		mAnchor.setOnHoverListener(((android.view.View.OnHoverListener) (this)));
	//   33   67:aload_0         
	//   34   68:getfield        #61  <Field View mAnchor>
	//   35   71:aload_0         
	//   36   72:invokevirtual   #94  <Method void View.setOnHoverListener(android.view.View$OnHoverListener)>
	//   37   75:return          
	}

	private void cancelPendingShow()
	{
		mAnchor.removeCallbacks(mShowRunnable);
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field View mAnchor>
	//    2    4:aload_0         
	//    3    5:getfield        #54  <Field Runnable mShowRunnable>
	//    4    8:invokevirtual   #100 <Method boolean View.removeCallbacks(Runnable)>
	//    5   11:pop             
	//    6   12:return          
	}

	private void clearAnchorPos()
	{
		mAnchorX = 0x7fffffff;
	//    0    0:aload_0         
	//    1    1:ldc1            #101 <Int 0x7fffffff>
	//    2    3:putfield        #103 <Field int mAnchorX>
		mAnchorY = 0x7fffffff;
	//    3    6:aload_0         
	//    4    7:ldc1            #101 <Int 0x7fffffff>
	//    5    9:putfield        #105 <Field int mAnchorY>
	//    6   12:return          
	}

	private void scheduleShow()
	{
		mAnchor.postDelayed(mShowRunnable, ViewConfiguration.getLongPressTimeout());
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field View mAnchor>
	//    2    4:aload_0         
	//    3    5:getfield        #54  <Field Runnable mShowRunnable>
	//    4    8:invokestatic    #110 <Method int ViewConfiguration.getLongPressTimeout()>
	//    5   11:i2l             
	//    6   12:invokevirtual   #114 <Method boolean View.postDelayed(Runnable, long)>
	//    7   15:pop             
	//    8   16:return          
	}

	private static void setPendingHandler(TooltipCompatHandler tooltipcompathandler)
	{
		TooltipCompatHandler tooltipcompathandler1 = sPendingHandler;
	//    0    0:getstatic       #117 <Field TooltipCompatHandler sPendingHandler>
	//    1    3:astore_1        
		if(tooltipcompathandler1 != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          12
			tooltipcompathandler1.cancelPendingShow();
	//    4    8:aload_1         
	//    5    9:invokespecial   #119 <Method void cancelPendingShow()>
		sPendingHandler = tooltipcompathandler;
	//    6   12:aload_0         
	//    7   13:putstatic       #117 <Field TooltipCompatHandler sPendingHandler>
		tooltipcompathandler = sPendingHandler;
	//    8   16:getstatic       #117 <Field TooltipCompatHandler sPendingHandler>
	//    9   19:astore_0        
		if(tooltipcompathandler != null)
	//*  10   20:aload_0         
	//*  11   21:ifnull          28
			tooltipcompathandler.scheduleShow();
	//   12   24:aload_0         
	//   13   25:invokespecial   #121 <Method void scheduleShow()>
	//   14   28:return          
	}

	public static void setTooltipText(View view, CharSequence charsequence)
	{
		TooltipCompatHandler tooltipcompathandler = sPendingHandler;
	//    0    0:getstatic       #117 <Field TooltipCompatHandler sPendingHandler>
	//    1    3:astore_2        
		if(tooltipcompathandler != null && tooltipcompathandler.mAnchor == view)
	//*   2    4:aload_2         
	//*   3    5:ifnull          20
	//*   4    8:aload_2         
	//*   5    9:getfield        #61  <Field View mAnchor>
	//*   6   12:aload_0         
	//*   7   13:if_acmpne       20
			setPendingHandler(((TooltipCompatHandler) (null)));
	//    8   16:aconst_null     
	//    9   17:invokestatic    #124 <Method void setPendingHandler(TooltipCompatHandler)>
		if(TextUtils.isEmpty(charsequence))
	//*  10   20:aload_1         
	//*  11   21:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  12   24:ifeq            63
		{
			charsequence = ((CharSequence) (sActiveHandler));
	//   13   27:getstatic       #132 <Field TooltipCompatHandler sActiveHandler>
	//   14   30:astore_1        
			if(charsequence != null && ((TooltipCompatHandler) (charsequence)).mAnchor == view)
	//*  15   31:aload_1         
	//*  16   32:ifnull          47
	//*  17   35:aload_1         
	//*  18   36:getfield        #61  <Field View mAnchor>
	//*  19   39:aload_0         
	//*  20   40:if_acmpne       47
				((TooltipCompatHandler) (charsequence)).hide();
	//   21   43:aload_1         
	//   22   44:invokevirtual   #135 <Method void hide()>
			view.setOnLongClickListener(((android.view.View.OnLongClickListener) (null)));
	//   23   47:aload_0         
	//   24   48:aconst_null     
	//   25   49:invokevirtual   #90  <Method void View.setOnLongClickListener(android.view.View$OnLongClickListener)>
			view.setLongClickable(false);
	//   26   52:aload_0         
	//   27   53:iconst_0        
	//   28   54:invokevirtual   #139 <Method void View.setLongClickable(boolean)>
			view.setOnHoverListener(((android.view.View.OnHoverListener) (null)));
	//   29   57:aload_0         
	//   30   58:aconst_null     
	//   31   59:invokevirtual   #94  <Method void View.setOnHoverListener(android.view.View$OnHoverListener)>
			return;
	//   32   62:return          
		} else
		{
			new TooltipCompatHandler(view, charsequence);
	//   33   63:new             #2   <Class TooltipCompatHandler>
	//   34   66:dup             
	//   35   67:aload_0         
	//   36   68:aload_1         
	//   37   69:invokespecial   #141 <Method void TooltipCompatHandler(View, CharSequence)>
	//   38   72:pop             
			return;
	//   39   73:return          
		}
	}

	private boolean updateAnchorPos(MotionEvent motionevent)
	{
		int i = (int)motionevent.getX();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #149 <Method float MotionEvent.getX()>
	//    2    4:f2i             
	//    3    5:istore_2        
		int j = (int)motionevent.getY();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #152 <Method float MotionEvent.getY()>
	//    6   10:f2i             
	//    7   11:istore_3        
		if(Math.abs(i - mAnchorX) <= mHoverSlop && Math.abs(j - mAnchorY) <= mHoverSlop)
	//*   8   12:iload_2         
	//*   9   13:aload_0         
	//*  10   14:getfield        #103 <Field int mAnchorX>
	//*  11   17:isub            
	//*  12   18:invokestatic    #158 <Method int Math.abs(int)>
	//*  13   21:aload_0         
	//*  14   22:getfield        #83  <Field int mHoverSlop>
	//*  15   25:icmpgt          46
	//*  16   28:iload_3         
	//*  17   29:aload_0         
	//*  18   30:getfield        #105 <Field int mAnchorY>
	//*  19   33:isub            
	//*  20   34:invokestatic    #158 <Method int Math.abs(int)>
	//*  21   37:aload_0         
	//*  22   38:getfield        #83  <Field int mHoverSlop>
	//*  23   41:icmpgt          46
		{
			return false;
	//   24   44:iconst_0        
	//   25   45:ireturn         
		} else
		{
			mAnchorX = i;
	//   26   46:aload_0         
	//   27   47:iload_2         
	//   28   48:putfield        #103 <Field int mAnchorX>
			mAnchorY = j;
	//   29   51:aload_0         
	//   30   52:iload_3         
	//   31   53:putfield        #105 <Field int mAnchorY>
			return true;
	//   32   56:iconst_1        
	//   33   57:ireturn         
		}
	}

	void hide()
	{
		if(sActiveHandler == this)
	//*   0    0:getstatic       #132 <Field TooltipCompatHandler sActiveHandler>
	//*   1    3:aload_0         
	//*   2    4:if_acmpne       52
		{
			sActiveHandler = null;
	//    3    7:aconst_null     
	//    4    8:putstatic       #132 <Field TooltipCompatHandler sActiveHandler>
			TooltipPopup tooltippopup = mPopup;
	//    5   11:aload_0         
	//    6   12:getfield        #160 <Field TooltipPopup mPopup>
	//    7   15:astore_1        
			if(tooltippopup != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          44
			{
				tooltippopup.hide();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #163 <Method void TooltipPopup.hide()>
				mPopup = null;
	//   12   24:aload_0         
	//   13   25:aconst_null     
	//   14   26:putfield        #160 <Field TooltipPopup mPopup>
				clearAnchorPos();
	//   15   29:aload_0         
	//   16   30:invokespecial   #86  <Method void clearAnchorPos()>
				mAnchor.removeOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (this)));
	//   17   33:aload_0         
	//   18   34:getfield        #61  <Field View mAnchor>
	//   19   37:aload_0         
	//   20   38:invokevirtual   #167 <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
			} else
	//*  21   41:goto            52
			{
				Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
	//   22   44:ldc1            #24  <String "TooltipCompatHandler">
	//   23   46:ldc1            #169 <String "sActiveHandler.mPopup == null">
	//   24   48:invokestatic    #175 <Method int Log.e(String, String)>
	//   25   51:pop             
			}
		}
		if(sPendingHandler == this)
	//*  26   52:getstatic       #117 <Field TooltipCompatHandler sPendingHandler>
	//*  27   55:aload_0         
	//*  28   56:if_acmpne       63
			setPendingHandler(((TooltipCompatHandler) (null)));
	//   29   59:aconst_null     
	//   30   60:invokestatic    #124 <Method void setPendingHandler(TooltipCompatHandler)>
		mAnchor.removeCallbacks(mHideRunnable);
	//   31   63:aload_0         
	//   32   64:getfield        #61  <Field View mAnchor>
	//   33   67:aload_0         
	//   34   68:getfield        #59  <Field Runnable mHideRunnable>
	//   35   71:invokevirtual   #100 <Method boolean View.removeCallbacks(Runnable)>
	//   36   74:pop             
	//   37   75:return          
	}

	public boolean onHover(View view, MotionEvent motionevent)
	{
		if(mPopup != null && mFromTouch)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field TooltipPopup mPopup>
	//*   2    4:ifnull          16
	//*   3    7:aload_0         
	//*   4    8:getfield        #179 <Field boolean mFromTouch>
	//*   5   11:ifeq            16
			return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
		view = ((View) ((AccessibilityManager)mAnchor.getContext().getSystemService("accessibility")));
	//    8   16:aload_0         
	//    9   17:getfield        #61  <Field View mAnchor>
	//   10   20:invokevirtual   #69  <Method Context View.getContext()>
	//   11   23:ldc1            #181 <String "accessibility">
	//   12   25:invokevirtual   #187 <Method Object Context.getSystemService(String)>
	//   13   28:checkcast       #189 <Class AccessibilityManager>
	//   14   31:astore_1        
		if(((AccessibilityManager) (view)).isEnabled() && ((AccessibilityManager) (view)).isTouchExplorationEnabled())
	//*  15   32:aload_1         
	//*  16   33:invokevirtual   #193 <Method boolean AccessibilityManager.isEnabled()>
	//*  17   36:ifeq            48
	//*  18   39:aload_1         
	//*  19   40:invokevirtual   #196 <Method boolean AccessibilityManager.isTouchExplorationEnabled()>
	//*  20   43:ifeq            48
			return false;
	//   21   46:iconst_0        
	//   22   47:ireturn         
		int i = motionevent.getAction();
	//   23   48:aload_2         
	//   24   49:invokevirtual   #199 <Method int MotionEvent.getAction()>
	//   25   52:istore_3        
		if(i != 7)
	//*  26   53:iload_3         
	//*  27   54:bipush          7
	//*  28   56:icmpeq          77
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
				clearAnchorPos();
	//   34   67:aload_0         
	//   35   68:invokespecial   #86  <Method void clearAnchorPos()>
				hide();
	//   36   71:aload_0         
	//   37   72:invokevirtual   #135 <Method void hide()>
				return false;
	//   38   75:iconst_0        
	//   39   76:ireturn         
			}
		if(mAnchor.isEnabled() && mPopup == null && updateAnchorPos(motionevent))
	//*  40   77:aload_0         
	//*  41   78:getfield        #61  <Field View mAnchor>
	//*  42   81:invokevirtual   #200 <Method boolean View.isEnabled()>
	//*  43   84:ifeq            106
	//*  44   87:aload_0         
	//*  45   88:getfield        #160 <Field TooltipPopup mPopup>
	//*  46   91:ifnonnull       106
	//*  47   94:aload_0         
	//*  48   95:aload_2         
	//*  49   96:invokespecial   #202 <Method boolean updateAnchorPos(MotionEvent)>
	//*  50   99:ifeq            106
			setPendingHandler(this);
	//   51  102:aload_0         
	//   52  103:invokestatic    #124 <Method void setPendingHandler(TooltipCompatHandler)>
		return false;
	//   53  106:iconst_0        
	//   54  107:ireturn         
	}

	public boolean onLongClick(View view)
	{
		mAnchorX = view.getWidth() / 2;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #207 <Method int View.getWidth()>
	//    3    5:iconst_2        
	//    4    6:idiv            
	//    5    7:putfield        #103 <Field int mAnchorX>
		mAnchorY = view.getHeight() / 2;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #210 <Method int View.getHeight()>
	//    9   15:iconst_2        
	//   10   16:idiv            
	//   11   17:putfield        #105 <Field int mAnchorY>
		show(true);
	//   12   20:aload_0         
	//   13   21:iconst_1        
	//   14   22:invokevirtual   #213 <Method void show(boolean)>
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
	//    1    1:invokevirtual   #135 <Method void hide()>
	//    2    4:return          
	}

	void show(boolean flag)
	{
		if(!ac.A(mAnchor))
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field View mAnchor>
	//*   2    4:invokestatic    #221 <Method boolean ac.A(View)>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		setPendingHandler(((TooltipCompatHandler) (null)));
	//    5   11:aconst_null     
	//    6   12:invokestatic    #124 <Method void setPendingHandler(TooltipCompatHandler)>
		TooltipCompatHandler tooltipcompathandler = sActiveHandler;
	//    7   15:getstatic       #132 <Field TooltipCompatHandler sActiveHandler>
	//    8   18:astore          4
		if(tooltipcompathandler != null)
	//*   9   20:aload           4
	//*  10   22:ifnull          30
			tooltipcompathandler.hide();
	//   11   25:aload           4
	//   12   27:invokevirtual   #135 <Method void hide()>
		sActiveHandler = this;
	//   13   30:aload_0         
	//   14   31:putstatic       #132 <Field TooltipCompatHandler sActiveHandler>
		mFromTouch = flag;
	//   15   34:aload_0         
	//   16   35:iload_1         
	//   17   36:putfield        #179 <Field boolean mFromTouch>
		mPopup = new TooltipPopup(mAnchor.getContext());
	//   18   39:aload_0         
	//   19   40:new             #162 <Class TooltipPopup>
	//   20   43:dup             
	//   21   44:aload_0         
	//   22   45:getfield        #61  <Field View mAnchor>
	//   23   48:invokevirtual   #69  <Method Context View.getContext()>
	//   24   51:invokespecial   #224 <Method void TooltipPopup(Context)>
	//   25   54:putfield        #160 <Field TooltipPopup mPopup>
		mPopup.show(mAnchor, mAnchorX, mAnchorY, mFromTouch, mTooltipText);
	//   26   57:aload_0         
	//   27   58:getfield        #160 <Field TooltipPopup mPopup>
	//   28   61:aload_0         
	//   29   62:getfield        #61  <Field View mAnchor>
	//   30   65:aload_0         
	//   31   66:getfield        #103 <Field int mAnchorX>
	//   32   69:aload_0         
	//   33   70:getfield        #105 <Field int mAnchorY>
	//   34   73:aload_0         
	//   35   74:getfield        #179 <Field boolean mFromTouch>
	//   36   77:aload_0         
	//   37   78:getfield        #63  <Field CharSequence mTooltipText>
	//   38   81:invokevirtual   #227 <Method void TooltipPopup.show(View, int, int, boolean, CharSequence)>
		mAnchor.addOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (this)));
	//   39   84:aload_0         
	//   40   85:getfield        #61  <Field View mAnchor>
	//   41   88:aload_0         
	//   42   89:invokevirtual   #230 <Method void View.addOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
		long l;
		if(mFromTouch)
	//*  43   92:aload_0         
	//*  44   93:getfield        #179 <Field boolean mFromTouch>
	//*  45   96:ifeq            106
			l = 2500L;
	//   46   99:ldc2w           #19  <Long 2500L>
	//   47  102:lstore_2        
		else
	//*  48  103:goto            140
		if((ac.o(mAnchor) & 1) == 1)
	//*  49  106:aload_0         
	//*  50  107:getfield        #61  <Field View mAnchor>
	//*  51  110:invokestatic    #234 <Method int ac.o(View)>
	//*  52  113:iconst_1        
	//*  53  114:iand            
	//*  54  115:iconst_1        
	//*  55  116:icmpne          131
			l = 3000L - (long)ViewConfiguration.getLongPressTimeout();
	//   56  119:ldc2w           #16  <Long 3000L>
	//   57  122:invokestatic    #110 <Method int ViewConfiguration.getLongPressTimeout()>
	//   58  125:i2l             
	//   59  126:lsub            
	//   60  127:lstore_2        
		else
	//*  61  128:goto            140
			l = 15000L - (long)ViewConfiguration.getLongPressTimeout();
	//   62  131:ldc2w           #13  <Long 15000L>
	//   63  134:invokestatic    #110 <Method int ViewConfiguration.getLongPressTimeout()>
	//   64  137:i2l             
	//   65  138:lsub            
	//   66  139:lstore_2        
		mAnchor.removeCallbacks(mHideRunnable);
	//   67  140:aload_0         
	//   68  141:getfield        #61  <Field View mAnchor>
	//   69  144:aload_0         
	//   70  145:getfield        #59  <Field Runnable mHideRunnable>
	//   71  148:invokevirtual   #100 <Method boolean View.removeCallbacks(Runnable)>
	//   72  151:pop             
		mAnchor.postDelayed(mHideRunnable, l);
	//   73  152:aload_0         
	//   74  153:getfield        #61  <Field View mAnchor>
	//   75  156:aload_0         
	//   76  157:getfield        #59  <Field Runnable mHideRunnable>
	//   77  160:lload_2         
	//   78  161:invokevirtual   #114 <Method boolean View.postDelayed(Runnable, long)>
	//   79  164:pop             
	//   80  165:return          
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
	private final Runnable mHideRunnable = new _cls2();
	private final int mHoverSlop;
	private TooltipPopup mPopup;
	private final Runnable mShowRunnable = new _cls1();
	private final CharSequence mTooltipText;

	private class _cls1
		implements Runnable
	{

		public void run()
		{
			show(false);
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field TooltipCompatHandler this$0>
		//    2    4:iconst_0        
		//    3    5:invokevirtual   #23  <Method void TooltipCompatHandler.show(boolean)>
		//    4    8:return          
		}

		final TooltipCompatHandler this$0;

		_cls1()
		{
			this$0 = TooltipCompatHandler.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field TooltipCompatHandler this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}


	private class _cls2
		implements Runnable
	{

		public void run()
		{
			hide();
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field TooltipCompatHandler this$0>
		//    2    4:invokevirtual   #22  <Method void TooltipCompatHandler.hide()>
		//    3    7:return          
		}

		final TooltipCompatHandler this$0;

		_cls2()
		{
			this$0 = TooltipCompatHandler.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field TooltipCompatHandler this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}

}
