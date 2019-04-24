// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.widget.ListViewAutoScrollHelper;
import android.support.v7.graphics.drawable.DrawableWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.*;
import com.google.devtools.build.android.desugar.runtime.ThrowableExtension;
import java.lang.reflect.Field;

class DropDownListView extends ListView
{
	private static class GateKeeperDrawable extends DrawableWrapper
	{

		public void draw(Canvas canvas)
		{
			if(mEnabled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field boolean mEnabled>
		//*   2    4:ifeq            12
				super.draw(canvas);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokespecial   #20  <Method void DrawableWrapper.draw(Canvas)>
		//    6   12:return          
		}

		void setEnabled(boolean flag)
		{
			mEnabled = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #15  <Field boolean mEnabled>
		//    3    5:return          
		}

		public void setHotspot(float f, float f1)
		{
			if(mEnabled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field boolean mEnabled>
		//*   2    4:ifeq            13
				super.setHotspot(f, f1);
		//    3    7:aload_0         
		//    4    8:fload_1         
		//    5    9:fload_2         
		//    6   10:invokespecial   #26  <Method void DrawableWrapper.setHotspot(float, float)>
		//    7   13:return          
		}

		public void setHotspotBounds(int i, int j, int k, int l)
		{
			if(mEnabled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field boolean mEnabled>
		//*   2    4:ifeq            16
				super.setHotspotBounds(i, j, k, l);
		//    3    7:aload_0         
		//    4    8:iload_1         
		//    5    9:iload_2         
		//    6   10:iload_3         
		//    7   11:iload           4
		//    8   13:invokespecial   #30  <Method void DrawableWrapper.setHotspotBounds(int, int, int, int)>
		//    9   16:return          
		}

		public boolean setState(int ai[])
		{
			if(mEnabled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field boolean mEnabled>
		//*   2    4:ifeq            13
				return super.setState(ai);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokespecial   #34  <Method boolean DrawableWrapper.setState(int[])>
		//    6   12:ireturn         
			else
				return false;
		//    7   13:iconst_0        
		//    8   14:ireturn         
		}

		public boolean setVisible(boolean flag, boolean flag1)
		{
			if(mEnabled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field boolean mEnabled>
		//*   2    4:ifeq            14
				return super.setVisible(flag, flag1);
		//    3    7:aload_0         
		//    4    8:iload_1         
		//    5    9:iload_2         
		//    6   10:invokespecial   #38  <Method boolean DrawableWrapper.setVisible(boolean, boolean)>
		//    7   13:ireturn         
			else
				return false;
		//    8   14:iconst_0        
		//    9   15:ireturn         
		}

		private boolean mEnabled;

		GateKeeperDrawable(Drawable drawable)
		{
			super(drawable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #13  <Method void DrawableWrapper(Drawable)>
			mEnabled = true;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #15  <Field boolean mEnabled>
		//    6   10:return          
		}
	}

	private class ResolveHoverRunnable
		implements Runnable
	{

		public void cancel()
		{
			mResolveHoverRunnable = null;
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field DropDownListView this$0>
		//    2    4:aconst_null     
		//    3    5:invokestatic    #27  <Method DropDownListView$ResolveHoverRunnable DropDownListView.access$102(DropDownListView, DropDownListView$ResolveHoverRunnable)>
		//    4    8:pop             
			removeCallbacks(((Runnable) (this)));
		//    5    9:aload_0         
		//    6   10:getfield        #15  <Field DropDownListView this$0>
		//    7   13:aload_0         
		//    8   14:invokevirtual   #31  <Method boolean DropDownListView.removeCallbacks(Runnable)>
		//    9   17:pop             
		//   10   18:return          
		}

		public void post()
		{
			DropDownListView.this.post(((Runnable) (this)));
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field DropDownListView this$0>
		//    2    4:aload_0         
		//    3    5:invokevirtual   #34  <Method boolean DropDownListView.post(Runnable)>
		//    4    8:pop             
		//    5    9:return          
		}

		public void run()
		{
			mResolveHoverRunnable = null;
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field DropDownListView this$0>
		//    2    4:aconst_null     
		//    3    5:invokestatic    #27  <Method DropDownListView$ResolveHoverRunnable DropDownListView.access$102(DropDownListView, DropDownListView$ResolveHoverRunnable)>
		//    4    8:pop             
			drawableStateChanged();
		//    5    9:aload_0         
		//    6   10:getfield        #15  <Field DropDownListView this$0>
		//    7   13:invokevirtual   #38  <Method void DropDownListView.drawableStateChanged()>
		//    8   16:return          
		}

		final DropDownListView this$0;

		private ResolveHoverRunnable()
		{
			this$0 = DropDownListView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field DropDownListView this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}


	DropDownListView(Context context, boolean flag)
	{
		super(context, ((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.attr.dropDownListViewStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:getstatic       #46  <Field int android.support.v7.appcompat.R$attr.dropDownListViewStyle>
	//    4    6:invokespecial   #49  <Method void ListView(Context, android.util.AttributeSet, int)>
	//    5    9:aload_0         
	//    6   10:new             #51  <Class Rect>
	//    7   13:dup             
	//    8   14:invokespecial   #54  <Method void Rect()>
	//    9   17:putfield        #56  <Field Rect mSelectorRect>
		mSelectionLeftPadding = 0;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #58  <Field int mSelectionLeftPadding>
		mSelectionTopPadding = 0;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #60  <Field int mSelectionTopPadding>
		mSelectionRightPadding = 0;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #62  <Field int mSelectionRightPadding>
		mSelectionBottomPadding = 0;
	//   19   35:aload_0         
	//   20   36:iconst_0        
	//   21   37:putfield        #64  <Field int mSelectionBottomPadding>
		mHijackFocus = flag;
	//   22   40:aload_0         
	//   23   41:iload_2         
	//   24   42:putfield        #66  <Field boolean mHijackFocus>
		setCacheColorHint(0);
	//   25   45:aload_0         
	//   26   46:iconst_0        
	//   27   47:invokevirtual   #70  <Method void setCacheColorHint(int)>
		try
		{
			mIsChildViewEnabled = ((Class) (android/widget/AbsListView)).getDeclaredField("mIsChildViewEnabled");
	//   28   50:aload_0         
	//   29   51:ldc1            #72  <Class AbsListView>
	//   30   53:ldc1            #73  <String "mIsChildViewEnabled">
	//   31   55:invokevirtual   #79  <Method Field Class.getDeclaredField(String)>
	//   32   58:putfield        #81  <Field Field mIsChildViewEnabled>
			mIsChildViewEnabled.setAccessible(true);
	//   33   61:aload_0         
	//   34   62:getfield        #81  <Field Field mIsChildViewEnabled>
	//   35   65:iconst_1        
	//   36   66:invokevirtual   #87  <Method void Field.setAccessible(boolean)>
			return;
	//   37   69:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  38   70:astore_1        
		{
			ThrowableExtension.printStackTrace(((Throwable) (context)));
	//   39   71:aload_1         
	//   40   72:invokestatic    #93  <Method void ThrowableExtension.printStackTrace(Throwable)>
		}
	//   41   75:return          
	}

	private void clearPressedItem()
	{
		mDrawsInPressedState = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #101 <Field boolean mDrawsInPressedState>
		setPressed(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #104 <Method void setPressed(boolean)>
		drawableStateChanged();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #107 <Method void drawableStateChanged()>
		View view = getChildAt(mMotionPosition - getFirstVisiblePosition());
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #109 <Field int mMotionPosition>
	//   11   19:aload_0         
	//   12   20:invokevirtual   #113 <Method int getFirstVisiblePosition()>
	//   13   23:isub            
	//   14   24:invokevirtual   #117 <Method View getChildAt(int)>
	//   15   27:astore_1        
		if(view != null)
	//*  16   28:aload_1         
	//*  17   29:ifnull          37
			view.setPressed(false);
	//   18   32:aload_1         
	//   19   33:iconst_0        
	//   20   34:invokevirtual   #120 <Method void View.setPressed(boolean)>
		if(mClickAnimation != null)
	//*  21   37:aload_0         
	//*  22   38:getfield        #122 <Field ViewPropertyAnimatorCompat mClickAnimation>
	//*  23   41:ifnull          56
		{
			mClickAnimation.cancel();
	//   24   44:aload_0         
	//   25   45:getfield        #122 <Field ViewPropertyAnimatorCompat mClickAnimation>
	//   26   48:invokevirtual   #127 <Method void ViewPropertyAnimatorCompat.cancel()>
			mClickAnimation = null;
	//   27   51:aload_0         
	//   28   52:aconst_null     
	//   29   53:putfield        #122 <Field ViewPropertyAnimatorCompat mClickAnimation>
		}
	//   30   56:return          
	}

	private void clickPressedItem(View view, int i)
	{
		performItemClick(view, i, getItemIdAtPosition(i));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_0         
	//    4    4:iload_2         
	//    5    5:invokevirtual   #133 <Method long getItemIdAtPosition(int)>
	//    6    8:invokevirtual   #137 <Method boolean performItemClick(View, int, long)>
	//    7   11:pop             
	//    8   12:return          
	}

	private void drawSelectorCompat(Canvas canvas)
	{
		if(!mSelectorRect.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field Rect mSelectorRect>
	//*   2    4:invokevirtual   #143 <Method boolean Rect.isEmpty()>
	//*   3    7:ifne            32
		{
			Drawable drawable = getSelector();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #147 <Method Drawable getSelector()>
	//    6   14:astore_2        
			if(drawable != null)
	//*   7   15:aload_2         
	//*   8   16:ifnull          32
			{
				drawable.setBounds(mSelectorRect);
	//    9   19:aload_2         
	//   10   20:aload_0         
	//   11   21:getfield        #56  <Field Rect mSelectorRect>
	//   12   24:invokevirtual   #153 <Method void Drawable.setBounds(Rect)>
				drawable.draw(canvas);
	//   13   27:aload_2         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #156 <Method void Drawable.draw(Canvas)>
			}
		}
	//   16   32:return          
	}

	private void positionSelectorCompat(int i, View view)
	{
		Rect rect = mSelectorRect;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Rect mSelectorRect>
	//    2    4:astore          4
		rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
	//    3    6:aload           4
	//    4    8:aload_2         
	//    5    9:invokevirtual   #163 <Method int View.getLeft()>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #166 <Method int View.getTop()>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #169 <Method int View.getRight()>
	//   10   20:aload_2         
	//   11   21:invokevirtual   #172 <Method int View.getBottom()>
	//   12   24:invokevirtual   #176 <Method void Rect.set(int, int, int, int)>
		rect.left = rect.left - mSelectionLeftPadding;
	//   13   27:aload           4
	//   14   29:aload           4
	//   15   31:getfield        #179 <Field int Rect.left>
	//   16   34:aload_0         
	//   17   35:getfield        #58  <Field int mSelectionLeftPadding>
	//   18   38:isub            
	//   19   39:putfield        #179 <Field int Rect.left>
		rect.top = rect.top - mSelectionTopPadding;
	//   20   42:aload           4
	//   21   44:aload           4
	//   22   46:getfield        #182 <Field int Rect.top>
	//   23   49:aload_0         
	//   24   50:getfield        #60  <Field int mSelectionTopPadding>
	//   25   53:isub            
	//   26   54:putfield        #182 <Field int Rect.top>
		rect.right = rect.right + mSelectionRightPadding;
	//   27   57:aload           4
	//   28   59:aload           4
	//   29   61:getfield        #185 <Field int Rect.right>
	//   30   64:aload_0         
	//   31   65:getfield        #62  <Field int mSelectionRightPadding>
	//   32   68:iadd            
	//   33   69:putfield        #185 <Field int Rect.right>
		rect.bottom = rect.bottom + mSelectionBottomPadding;
	//   34   72:aload           4
	//   35   74:aload           4
	//   36   76:getfield        #188 <Field int Rect.bottom>
	//   37   79:aload_0         
	//   38   80:getfield        #64  <Field int mSelectionBottomPadding>
	//   39   83:iadd            
	//   40   84:putfield        #188 <Field int Rect.bottom>
		boolean flag = mIsChildViewEnabled.getBoolean(((Object) (this)));
	//   41   87:aload_0         
	//   42   88:getfield        #81  <Field Field mIsChildViewEnabled>
	//   43   91:aload_0         
	//   44   92:invokevirtual   #192 <Method boolean Field.getBoolean(Object)>
	//   45   95:istore_3        
		if(view.isEnabled() == flag)
			break MISSING_BLOCK_LABEL_133;
	//   46   96:aload_2         
	//   47   97:invokevirtual   #195 <Method boolean View.isEnabled()>
	//   48  100:iload_3         
	//   49  101:icmpeq          133
		mIsChildViewEnabled.set(((Object) (this)), ((Object) (Boolean.valueOf(flag ^ true))));
	//   50  104:aload_0         
	//   51  105:getfield        #81  <Field Field mIsChildViewEnabled>
	//   52  108:aload_0         
	//   53  109:iload_3         
	//   54  110:iconst_1        
	//   55  111:ixor            
	//   56  112:invokestatic    #201 <Method Boolean Boolean.valueOf(boolean)>
	//   57  115:invokevirtual   #204 <Method void Field.set(Object, Object)>
		if(i != -1)
	//*  58  118:iload_1         
	//*  59  119:iconst_m1       
	//*  60  120:icmpeq          133
			try
			{
				refreshDrawableState();
	//   61  123:aload_0         
	//   62  124:invokevirtual   #207 <Method void refreshDrawableState()>
				return;
	//   63  127:return          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  64  128:astore_2        
			{
				ThrowableExtension.printStackTrace(((Throwable) (view)));
	//   65  129:aload_2         
	//   66  130:invokestatic    #93  <Method void ThrowableExtension.printStackTrace(Throwable)>
			}
	//   67  133:return          
	}

	private void positionSelectorLikeFocusCompat(int i, View view)
	{
		Drawable drawable = getSelector();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #147 <Method Drawable getSelector()>
	//    2    4:astore          7
		boolean flag1 = true;
	//    3    6:iconst_1        
	//    4    7:istore          6
		boolean flag;
		if(drawable != null && i != -1)
	//*   5    9:aload           7
	//*   6   11:ifnull          25
	//*   7   14:iload_1         
	//*   8   15:iconst_m1       
	//*   9   16:icmpeq          25
			flag = true;
	//   10   19:iconst_1        
	//   11   20:istore          5
		else
	//*  12   22:goto            28
			flag = false;
	//   13   25:iconst_0        
	//   14   26:istore          5
		if(flag)
	//*  15   28:iload           5
	//*  16   30:ifeq            41
			drawable.setVisible(false, false);
	//   17   33:aload           7
	//   18   35:iconst_0        
	//   19   36:iconst_0        
	//   20   37:invokevirtual   #212 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   21   40:pop             
		positionSelectorCompat(i, view);
	//   22   41:aload_0         
	//   23   42:iload_1         
	//   24   43:aload_2         
	//   25   44:invokespecial   #214 <Method void positionSelectorCompat(int, View)>
		if(flag)
	//*  26   47:iload           5
	//*  27   49:ifeq            98
		{
			view = ((View) (mSelectorRect));
	//   28   52:aload_0         
	//   29   53:getfield        #56  <Field Rect mSelectorRect>
	//   30   56:astore_2        
			float f = ((Rect) (view)).exactCenterX();
	//   31   57:aload_2         
	//   32   58:invokevirtual   #218 <Method float Rect.exactCenterX()>
	//   33   61:fstore_3        
			float f1 = ((Rect) (view)).exactCenterY();
	//   34   62:aload_2         
	//   35   63:invokevirtual   #221 <Method float Rect.exactCenterY()>
	//   36   66:fstore          4
			if(getVisibility() != 0)
	//*  37   68:aload_0         
	//*  38   69:invokevirtual   #224 <Method int getVisibility()>
	//*  39   72:ifne            78
	//*  40   75:goto            81
				flag1 = false;
	//   41   78:iconst_0        
	//   42   79:istore          6
			drawable.setVisible(flag1, false);
	//   43   81:aload           7
	//   44   83:iload           6
	//   45   85:iconst_0        
	//   46   86:invokevirtual   #212 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   47   89:pop             
			DrawableCompat.setHotspot(drawable, f, f1);
	//   48   90:aload           7
	//   49   92:fload_3         
	//   50   93:fload           4
	//   51   95:invokestatic    #230 <Method void DrawableCompat.setHotspot(Drawable, float, float)>
		}
	//   52   98:return          
	}

	private void positionSelectorLikeTouchCompat(int i, View view, float f, float f1)
	{
		positionSelectorLikeFocusCompat(i, view);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #234 <Method void positionSelectorLikeFocusCompat(int, View)>
		view = ((View) (getSelector()));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #147 <Method Drawable getSelector()>
	//    6   10:astore_2        
		if(view != null && i != -1)
	//*   7   11:aload_2         
	//*   8   12:ifnull          27
	//*   9   15:iload_1         
	//*  10   16:iconst_m1       
	//*  11   17:icmpeq          27
			DrawableCompat.setHotspot(((Drawable) (view)), f, f1);
	//   12   20:aload_2         
	//   13   21:fload_3         
	//   14   22:fload           4
	//   15   24:invokestatic    #230 <Method void DrawableCompat.setHotspot(Drawable, float, float)>
	//   16   27:return          
	}

	private void setPressedItem(View view, int i, float f, float f1)
	{
		mDrawsInPressedState = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #101 <Field boolean mDrawsInPressedState>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   3    5:getstatic       #241 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          21
	//*   5   10:icmplt          20
			drawableHotspotChanged(f, f1);
	//    6   13:aload_0         
	//    7   14:fload_3         
	//    8   15:fload           4
	//    9   17:invokevirtual   #245 <Method void drawableHotspotChanged(float, float)>
		if(!isPressed())
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #248 <Method boolean isPressed()>
	//*  12   24:ifne            32
			setPressed(true);
	//   13   27:aload_0         
	//   14   28:iconst_1        
	//   15   29:invokevirtual   #104 <Method void setPressed(boolean)>
		layoutChildren();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #251 <Method void layoutChildren()>
		if(mMotionPosition != -1)
	//*  18   36:aload_0         
	//*  19   37:getfield        #109 <Field int mMotionPosition>
	//*  20   40:iconst_m1       
	//*  21   41:icmpeq          84
		{
			View view1 = getChildAt(mMotionPosition - getFirstVisiblePosition());
	//   22   44:aload_0         
	//   23   45:aload_0         
	//   24   46:getfield        #109 <Field int mMotionPosition>
	//   25   49:aload_0         
	//   26   50:invokevirtual   #113 <Method int getFirstVisiblePosition()>
	//   27   53:isub            
	//   28   54:invokevirtual   #117 <Method View getChildAt(int)>
	//   29   57:astore          7
			if(view1 != null && view1 != view && view1.isPressed())
	//*  30   59:aload           7
	//*  31   61:ifnull          84
	//*  32   64:aload           7
	//*  33   66:aload_1         
	//*  34   67:if_acmpeq       84
	//*  35   70:aload           7
	//*  36   72:invokevirtual   #252 <Method boolean View.isPressed()>
	//*  37   75:ifeq            84
				view1.setPressed(false);
	//   38   78:aload           7
	//   39   80:iconst_0        
	//   40   81:invokevirtual   #120 <Method void View.setPressed(boolean)>
		}
		mMotionPosition = i;
	//   41   84:aload_0         
	//   42   85:iload_2         
	//   43   86:putfield        #109 <Field int mMotionPosition>
		float f2 = view.getLeft();
	//   44   89:aload_1         
	//   45   90:invokevirtual   #163 <Method int View.getLeft()>
	//   46   93:i2f             
	//   47   94:fstore          5
		float f3 = view.getTop();
	//   48   96:aload_1         
	//   49   97:invokevirtual   #166 <Method int View.getTop()>
	//   50  100:i2f             
	//   51  101:fstore          6
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  52  103:getstatic       #241 <Field int android.os.Build$VERSION.SDK_INT>
	//*  53  106:bipush          21
	//*  54  108:icmplt          124
			view.drawableHotspotChanged(f - f2, f1 - f3);
	//   55  111:aload_1         
	//   56  112:fload_3         
	//   57  113:fload           5
	//   58  115:fsub            
	//   59  116:fload           4
	//   60  118:fload           6
	//   61  120:fsub            
	//   62  121:invokevirtual   #253 <Method void View.drawableHotspotChanged(float, float)>
		if(!view.isPressed())
	//*  63  124:aload_1         
	//*  64  125:invokevirtual   #252 <Method boolean View.isPressed()>
	//*  65  128:ifne            136
			view.setPressed(true);
	//   66  131:aload_1         
	//   67  132:iconst_1        
	//   68  133:invokevirtual   #120 <Method void View.setPressed(boolean)>
		positionSelectorLikeTouchCompat(i, view, f, f1);
	//   69  136:aload_0         
	//   70  137:iload_2         
	//   71  138:aload_1         
	//   72  139:fload_3         
	//   73  140:fload           4
	//   74  142:invokespecial   #255 <Method void positionSelectorLikeTouchCompat(int, View, float, float)>
		setSelectorEnabled(false);
	//   75  145:aload_0         
	//   76  146:iconst_0        
	//   77  147:invokespecial   #258 <Method void setSelectorEnabled(boolean)>
		refreshDrawableState();
	//   78  150:aload_0         
	//   79  151:invokevirtual   #207 <Method void refreshDrawableState()>
	//   80  154:return          
	}

	private void setSelectorEnabled(boolean flag)
	{
		if(mSelector != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #260 <Field DropDownListView$GateKeeperDrawable mSelector>
	//*   2    4:ifnull          15
			mSelector.setEnabled(flag);
	//    3    7:aload_0         
	//    4    8:getfield        #260 <Field DropDownListView$GateKeeperDrawable mSelector>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #263 <Method void DropDownListView$GateKeeperDrawable.setEnabled(boolean)>
	//    7   15:return          
	}

	private boolean touchModeDrawsInPressedStateCompat()
	{
		return mDrawsInPressedState;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field boolean mDrawsInPressedState>
	//    2    4:ireturn         
	}

	private void updateSelectorStateCompat()
	{
		Drawable drawable = getSelector();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #147 <Method Drawable getSelector()>
	//    2    4:astore_1        
		if(drawable != null && touchModeDrawsInPressedStateCompat() && isPressed())
	//*   3    5:aload_1         
	//*   4    6:ifnull          32
	//*   5    9:aload_0         
	//*   6   10:invokespecial   #267 <Method boolean touchModeDrawsInPressedStateCompat()>
	//*   7   13:ifeq            32
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #248 <Method boolean isPressed()>
	//*  10   20:ifeq            32
			drawable.setState(getDrawableState());
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:invokevirtual   #271 <Method int[] getDrawableState()>
	//   14   28:invokevirtual   #275 <Method boolean Drawable.setState(int[])>
	//   15   31:pop             
	//   16   32:return          
	}

	protected void dispatchDraw(Canvas canvas)
	{
		drawSelectorCompat(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #278 <Method void drawSelectorCompat(Canvas)>
		super.dispatchDraw(canvas);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #280 <Method void ListView.dispatchDraw(Canvas)>
	//    6   10:return          
	}

	protected void drawableStateChanged()
	{
		if(mResolveHoverRunnable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field DropDownListView$ResolveHoverRunnable mResolveHoverRunnable>
	//*   2    4:ifnull          8
		{
			return;
	//    3    7:return          
		} else
		{
			super.drawableStateChanged();
	//    4    8:aload_0         
	//    5    9:invokespecial   #281 <Method void ListView.drawableStateChanged()>
			setSelectorEnabled(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokespecial   #258 <Method void setSelectorEnabled(boolean)>
			updateSelectorStateCompat();
	//    9   17:aload_0         
	//   10   18:invokespecial   #283 <Method void updateSelectorStateCompat()>
			return;
	//   11   21:return          
		}
	}

	public boolean hasFocus()
	{
		return mHijackFocus || super.hasFocus();
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field boolean mHijackFocus>
	//    2    4:ifne            19
	//    3    7:aload_0         
	//    4    8:invokespecial   #286 <Method boolean ListView.hasFocus()>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public boolean hasWindowFocus()
	{
		return mHijackFocus || super.hasWindowFocus();
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field boolean mHijackFocus>
	//    2    4:ifne            19
	//    3    7:aload_0         
	//    4    8:invokespecial   #289 <Method boolean ListView.hasWindowFocus()>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public boolean isFocused()
	{
		return mHijackFocus || super.isFocused();
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field boolean mHijackFocus>
	//    2    4:ifne            19
	//    3    7:aload_0         
	//    4    8:invokespecial   #292 <Method boolean ListView.isFocused()>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public boolean isInTouchMode()
	{
		return mHijackFocus && mListSelectionHidden || super.isInTouchMode();
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field boolean mHijackFocus>
	//    2    4:ifeq            14
	//    3    7:aload_0         
	//    4    8:getfield        #295 <Field boolean mListSelectionHidden>
	//    5   11:ifne            21
	//    6   14:aload_0         
	//    7   15:invokespecial   #297 <Method boolean ListView.isInTouchMode()>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public int lookForSelectablePosition(int i, boolean flag)
	{
		ListAdapter listadapter = getAdapter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #303 <Method ListAdapter getAdapter()>
	//    2    4:astore          5
		if(listadapter != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          146
		{
			if(isInTouchMode())
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #304 <Method boolean isInTouchMode()>
	//*   7   15:ifeq            20
				return -1;
	//    8   18:iconst_m1       
	//    9   19:ireturn         
			int k = listadapter.getCount();
	//   10   20:aload           5
	//   11   22:invokeinterface #309 <Method int ListAdapter.getCount()>
	//   12   27:istore          4
			if(!getAdapter().areAllItemsEnabled())
	//*  13   29:aload_0         
	//*  14   30:invokevirtual   #303 <Method ListAdapter getAdapter()>
	//*  15   33:invokeinterface #312 <Method boolean ListAdapter.areAllItemsEnabled()>
	//*  16   38:ifne            130
			{
				int j;
				if(flag)
	//*  17   41:iload_2         
	//*  18   42:ifeq            79
				{
					i = Math.max(0, i);
	//   19   45:iconst_0        
	//   20   46:iload_1         
	//   21   47:invokestatic    #318 <Method int Math.max(int, int)>
	//   22   50:istore_1        
					do
					{
						j = i;
	//   23   51:iload_1         
	//   24   52:istore_3        
						if(i >= k)
							break;
	//   25   53:iload_1         
	//   26   54:iload           4
	//   27   56:icmpge          114
						j = i;
	//   28   59:iload_1         
	//   29   60:istore_3        
						if(listadapter.isEnabled(i))
							break;
	//   30   61:aload           5
	//   31   63:iload_1         
	//   32   64:invokeinterface #321 <Method boolean ListAdapter.isEnabled(int)>
	//   33   69:ifne            114
						i++;
	//   34   72:iload_1         
	//   35   73:iconst_1        
	//   36   74:iadd            
	//   37   75:istore_1        
					} while(true);
	//   38   76:goto            51
				} else
				{
					i = Math.min(i, k - 1);
	//   39   79:iload_1         
	//   40   80:iload           4
	//   41   82:iconst_1        
	//   42   83:isub            
	//   43   84:invokestatic    #324 <Method int Math.min(int, int)>
	//   44   87:istore_1        
					do
					{
						j = i;
	//   45   88:iload_1         
	//   46   89:istore_3        
						if(i < 0)
							break;
	//   47   90:iload_1         
	//   48   91:iflt            114
						j = i;
	//   49   94:iload_1         
	//   50   95:istore_3        
						if(listadapter.isEnabled(i))
							break;
	//   51   96:aload           5
	//   52   98:iload_1         
	//   53   99:invokeinterface #321 <Method boolean ListAdapter.isEnabled(int)>
	//   54  104:ifne            114
						i--;
	//   55  107:iload_1         
	//   56  108:iconst_1        
	//   57  109:isub            
	//   58  110:istore_1        
					} while(true);
	//   59  111:goto            88
				}
				if(j >= 0)
	//*  60  114:iload_3         
	//*  61  115:iflt            128
				{
					if(j >= k)
	//*  62  118:iload_3         
	//*  63  119:iload           4
	//*  64  121:icmplt          126
						return -1;
	//   65  124:iconst_m1       
	//   66  125:ireturn         
					else
						return j;
	//   67  126:iload_3         
	//   68  127:ireturn         
				} else
				{
					return -1;
	//   69  128:iconst_m1       
	//   70  129:ireturn         
				}
			}
			if(i >= 0)
	//*  71  130:iload_1         
	//*  72  131:iflt            144
			{
				if(i >= k)
	//*  73  134:iload_1         
	//*  74  135:iload           4
	//*  75  137:icmplt          142
					return -1;
	//   76  140:iconst_m1       
	//   77  141:ireturn         
				else
					return i;
	//   78  142:iload_1         
	//   79  143:ireturn         
			} else
			{
				return -1;
	//   80  144:iconst_m1       
	//   81  145:ireturn         
			}
		} else
		{
			return -1;
	//   82  146:iconst_m1       
	//   83  147:ireturn         
		}
	}

	public int measureHeightOfChildrenCompat(int i, int j, int k, int l, int i1)
	{
		j = getListPaddingTop();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #329 <Method int getListPaddingTop()>
	//    2    4:istore_2        
		k = getListPaddingBottom();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #332 <Method int getListPaddingBottom()>
	//    5    9:istore_3        
		getListPaddingLeft();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #335 <Method int getListPaddingLeft()>
	//    8   14:pop             
		getListPaddingRight();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #338 <Method int getListPaddingRight()>
	//   11   19:pop             
		int l1 = getDividerHeight();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #341 <Method int getDividerHeight()>
	//   14   24:istore          7
		Object obj = ((Object) (getDivider()));
	//   15   26:aload_0         
	//   16   27:invokevirtual   #344 <Method Drawable getDivider()>
	//   17   30:astore          12
		ListAdapter listadapter = getAdapter();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #303 <Method ListAdapter getAdapter()>
	//   20   36:astore          15
		if(listadapter == null)
	//*  21   38:aload           15
	//*  22   40:ifnonnull       47
			return j + k;
	//   23   43:iload_2         
	//   24   44:iload_3         
	//   25   45:iadd            
	//   26   46:ireturn         
		if(l1 <= 0 || obj == null)
	//*  27   47:iload           7
	//*  28   49:ifle            60
	//*  29   52:aload           12
	//*  30   54:ifnull          60
	//*  31   57:goto            63
			l1 = 0;
	//   32   60:iconst_0        
	//   33   61:istore          7
		int l2 = listadapter.getCount();
	//   34   63:aload           15
	//   35   65:invokeinterface #309 <Method int ListAdapter.getCount()>
	//   36   70:istore          11
		k = j + k;
	//   37   72:iload_2         
	//   38   73:iload_3         
	//   39   74:iadd            
	//   40   75:istore_3        
		int i2 = 0;
	//   41   76:iconst_0        
	//   42   77:istore          8
		int j1 = i2;
	//   43   79:iload           8
	//   44   81:istore          6
		j = j1;
	//   45   83:iload           6
	//   46   85:istore_2        
		obj = null;
	//   47   86:aconst_null     
	//   48   87:astore          12
		int j2 = j1;
	//   49   89:iload           6
	//   50   91:istore          9
		while(i2 < l2) 
	//*  51   93:iload           8
	//*  52   95:iload           11
	//*  53   97:icmpge          324
		{
			int k2 = listadapter.getItemViewType(i2);
	//   54  100:aload           15
	//   55  102:iload           8
	//   56  104:invokeinterface #348 <Method int ListAdapter.getItemViewType(int)>
	//   57  109:istore          10
			int k1 = j2;
	//   58  111:iload           9
	//   59  113:istore          6
			if(k2 != j2)
	//*  60  115:iload           10
	//*  61  117:iload           9
	//*  62  119:icmpeq          129
			{
				obj = null;
	//   63  122:aconst_null     
	//   64  123:astore          12
				k1 = k2;
	//   65  125:iload           10
	//   66  127:istore          6
			}
			View view = listadapter.getView(i2, ((View) (obj)), ((android.view.ViewGroup) (this)));
	//   67  129:aload           15
	//   68  131:iload           8
	//   69  133:aload           12
	//   70  135:aload_0         
	//   71  136:invokeinterface #352 <Method View ListAdapter.getView(int, View, android.view.ViewGroup)>
	//   72  141:astore          13
			android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
	//   73  143:aload           13
	//   74  145:invokevirtual   #356 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   75  148:astore          14
			obj = ((Object) (layoutparams));
	//   76  150:aload           14
	//   77  152:astore          12
			if(layoutparams == null)
	//*  78  154:aload           14
	//*  79  156:ifnonnull       172
			{
				obj = ((Object) (generateDefaultLayoutParams()));
	//   80  159:aload_0         
	//   81  160:invokevirtual   #359 <Method android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()>
	//   82  163:astore          12
				view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
	//   83  165:aload           13
	//   84  167:aload           12
	//   85  169:invokevirtual   #363 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			}
			if(((android.view.ViewGroup.LayoutParams) (obj)).height > 0)
	//*  86  172:aload           12
	//*  87  174:getfield        #368 <Field int android.view.ViewGroup$LayoutParams.height>
	//*  88  177:ifle            196
				j2 = android.view.View.MeasureSpec.makeMeasureSpec(((android.view.ViewGroup.LayoutParams) (obj)).height, 0x40000000);
	//   89  180:aload           12
	//   90  182:getfield        #368 <Field int android.view.ViewGroup$LayoutParams.height>
	//   91  185:ldc2            #369 <Int 0x40000000>
	//   92  188:invokestatic    #374 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   93  191:istore          9
			else
	//*  94  193:goto            203
				j2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//   95  196:iconst_0        
	//   96  197:iconst_0        
	//   97  198:invokestatic    #374 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   98  201:istore          9
			view.measure(i, j2);
	//   99  203:aload           13
	//  100  205:iload_1         
	//  101  206:iload           9
	//  102  208:invokevirtual   #378 <Method void View.measure(int, int)>
			view.forceLayout();
	//  103  211:aload           13
	//  104  213:invokevirtual   #381 <Method void View.forceLayout()>
			j2 = k;
	//  105  216:iload_3         
	//  106  217:istore          9
			if(i2 > 0)
	//* 107  219:iload           8
	//* 108  221:ifle            230
				j2 = k + l1;
	//  109  224:iload_3         
	//  110  225:iload           7
	//  111  227:iadd            
	//  112  228:istore          9
			k = j2 + view.getMeasuredHeight();
	//  113  230:iload           9
	//  114  232:aload           13
	//  115  234:invokevirtual   #384 <Method int View.getMeasuredHeight()>
	//  116  237:iadd            
	//  117  238:istore_3        
			if(k >= l)
	//* 118  239:iload_3         
	//* 119  240:iload           4
	//* 120  242:icmplt          283
			{
				i = l;
	//  121  245:iload           4
	//  122  247:istore_1        
				if(i1 >= 0)
	//* 123  248:iload           5
	//* 124  250:iflt            281
				{
					i = l;
	//  125  253:iload           4
	//  126  255:istore_1        
					if(i2 > i1)
	//* 127  256:iload           8
	//* 128  258:iload           5
	//* 129  260:icmple          281
					{
						i = l;
	//  130  263:iload           4
	//  131  265:istore_1        
						if(j > 0)
	//* 132  266:iload_2         
	//* 133  267:ifle            281
						{
							i = l;
	//  134  270:iload           4
	//  135  272:istore_1        
							if(k != l)
	//* 136  273:iload_3         
	//* 137  274:iload           4
	//* 138  276:icmpeq          281
								i = j;
	//  139  279:iload_2         
	//  140  280:istore_1        
						}
					}
				}
				return i;
	//  141  281:iload_1         
	//  142  282:ireturn         
			}
			k2 = j;
	//  143  283:iload_2         
	//  144  284:istore          10
			if(i1 >= 0)
	//* 145  286:iload           5
	//* 146  288:iflt            304
			{
				k2 = j;
	//  147  291:iload_2         
	//  148  292:istore          10
				if(i2 >= i1)
	//* 149  294:iload           8
	//* 150  296:iload           5
	//* 151  298:icmplt          304
					k2 = k;
	//  152  301:iload_3         
	//  153  302:istore          10
			}
			i2++;
	//  154  304:iload           8
	//  155  306:iconst_1        
	//  156  307:iadd            
	//  157  308:istore          8
			j2 = k1;
	//  158  310:iload           6
	//  159  312:istore          9
			obj = ((Object) (view));
	//  160  314:aload           13
	//  161  316:astore          12
			j = k2;
	//  162  318:iload           10
	//  163  320:istore_2        
		}
	//* 164  321:goto            93
		return k;
	//  165  324:iload_3         
	//  166  325:ireturn         
	}

	protected void onDetachedFromWindow()
	{
		mResolveHoverRunnable = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #98  <Field DropDownListView$ResolveHoverRunnable mResolveHoverRunnable>
		super.onDetachedFromWindow();
	//    3    5:aload_0         
	//    4    6:invokespecial   #387 <Method void ListView.onDetachedFromWindow()>
	//    5    9:return          
	}

	public boolean onForwardedEvent(MotionEvent motionevent, int i)
	{
		int j = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #394 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore_3        
		j;
	//    3    5:iload_3         
		JVM INSTR tableswitch 1 3: default 32
	//	               1 57
	//	               2 51
	//	               3 41;
	//    4    6:tableswitch     1 3: default 32
	//	               1 57
	//	               2 51
	//	               3 41
		   goto _L1 _L2 _L3 _L4
_L1:
		boolean flag;
		boolean flag1;
		flag1 = false;
	//    5   32:iconst_0        
	//    6   33:istore          7
		flag = true;
	//    7   35:iconst_1        
	//    8   36:istore          6
		break; /* Loop/switch isn't completed */
	//    9   38:goto            155
_L4:
		flag1 = false;
	//   10   41:iconst_0        
	//   11   42:istore          7
		flag = flag1;
	//   12   44:iload           7
	//   13   46:istore          6
		break; /* Loop/switch isn't completed */
	//   14   48:goto            155
_L3:
		flag = true;
	//   15   51:iconst_1        
	//   16   52:istore          6
		break; /* Loop/switch isn't completed */
	//   17   54:goto            60
_L2:
		flag = false;
	//   18   57:iconst_0        
	//   19   58:istore          6
		int k = motionevent.findPointerIndex(i);
	//   20   60:aload_1         
	//   21   61:iload_2         
	//   22   62:invokevirtual   #397 <Method int MotionEvent.findPointerIndex(int)>
	//   23   65:istore          4
		if(k >= 0) goto _L5; else goto _L4
	//   24   67:iload           4
	//   25   69:ifge            75
	//*  26   72:goto            41
_L5:
		i = (int)motionevent.getX(k);
	//   27   75:aload_1         
	//   28   76:iload           4
	//   29   78:invokevirtual   #401 <Method float MotionEvent.getX(int)>
	//   30   81:f2i             
	//   31   82:istore_2        
		k = (int)motionevent.getY(k);
	//   32   83:aload_1         
	//   33   84:iload           4
	//   34   86:invokevirtual   #404 <Method float MotionEvent.getY(int)>
	//   35   89:f2i             
	//   36   90:istore          4
		int l = pointToPosition(i, k);
	//   37   92:aload_0         
	//   38   93:iload_2         
	//   39   94:iload           4
	//   40   96:invokevirtual   #407 <Method int pointToPosition(int, int)>
	//   41   99:istore          5
		if(l == -1)
	//*  42  101:iload           5
	//*  43  103:iconst_m1       
	//*  44  104:icmpne          113
		{
			flag1 = true;
	//   45  107:iconst_1        
	//   46  108:istore          7
			break; /* Loop/switch isn't completed */
	//   47  110:goto            155
		}
		View view = getChildAt(l - getFirstVisiblePosition());
	//   48  113:aload_0         
	//   49  114:iload           5
	//   50  116:aload_0         
	//   51  117:invokevirtual   #113 <Method int getFirstVisiblePosition()>
	//   52  120:isub            
	//   53  121:invokevirtual   #117 <Method View getChildAt(int)>
	//   54  124:astore          8
		setPressedItem(view, l, i, k);
	//   55  126:aload_0         
	//   56  127:aload           8
	//   57  129:iload           5
	//   58  131:iload_2         
	//   59  132:i2f             
	//   60  133:iload           4
	//   61  135:i2f             
	//   62  136:invokespecial   #409 <Method void setPressedItem(View, int, float, float)>
		if(j == 1)
	//*  63  139:iload_3         
	//*  64  140:iconst_1        
	//*  65  141:icmpne          32
			clickPressedItem(view, l);
	//   66  144:aload_0         
	//   67  145:aload           8
	//   68  147:iload           5
	//   69  149:invokespecial   #411 <Method void clickPressedItem(View, int)>
		if(true) goto _L1; else goto _L6
	//   70  152:goto            32
_L6:
		if(!flag || flag1)
	//*  71  155:iload           6
	//*  72  157:ifeq            165
	//*  73  160:iload           7
	//*  74  162:ifeq            169
			clearPressedItem();
	//   75  165:aload_0         
	//   76  166:invokespecial   #413 <Method void clearPressedItem()>
		if(flag)
	//*  77  169:iload           6
	//*  78  171:ifeq            215
		{
			if(mScrollHelper == null)
	//*  79  174:aload_0         
	//*  80  175:getfield        #415 <Field ListViewAutoScrollHelper mScrollHelper>
	//*  81  178:ifnonnull       193
				mScrollHelper = new ListViewAutoScrollHelper(((ListView) (this)));
	//   82  181:aload_0         
	//   83  182:new             #417 <Class ListViewAutoScrollHelper>
	//   84  185:dup             
	//   85  186:aload_0         
	//   86  187:invokespecial   #420 <Method void ListViewAutoScrollHelper(ListView)>
	//   87  190:putfield        #415 <Field ListViewAutoScrollHelper mScrollHelper>
			mScrollHelper.setEnabled(true);
	//   88  193:aload_0         
	//   89  194:getfield        #415 <Field ListViewAutoScrollHelper mScrollHelper>
	//   90  197:iconst_1        
	//   91  198:invokevirtual   #423 <Method android.support.v4.widget.AutoScrollHelper ListViewAutoScrollHelper.setEnabled(boolean)>
	//   92  201:pop             
			mScrollHelper.onTouch(((View) (this)), motionevent);
	//   93  202:aload_0         
	//   94  203:getfield        #415 <Field ListViewAutoScrollHelper mScrollHelper>
	//   95  206:aload_0         
	//   96  207:aload_1         
	//   97  208:invokevirtual   #427 <Method boolean ListViewAutoScrollHelper.onTouch(View, MotionEvent)>
	//   98  211:pop             
			return flag;
	//   99  212:iload           6
	//  100  214:ireturn         
		}
		if(mScrollHelper != null)
	//* 101  215:aload_0         
	//* 102  216:getfield        #415 <Field ListViewAutoScrollHelper mScrollHelper>
	//* 103  219:ifnull          231
			mScrollHelper.setEnabled(false);
	//  104  222:aload_0         
	//  105  223:getfield        #415 <Field ListViewAutoScrollHelper mScrollHelper>
	//  106  226:iconst_0        
	//  107  227:invokevirtual   #423 <Method android.support.v4.widget.AutoScrollHelper ListViewAutoScrollHelper.setEnabled(boolean)>
	//  108  230:pop             
		return flag;
	//  109  231:iload           6
	//  110  233:ireturn         
	}

	public boolean onHoverEvent(MotionEvent motionevent)
	{
		if(android.os.Build.VERSION.SDK_INT < 26)
	//*   0    0:getstatic       #241 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmpge          14
			return super.onHoverEvent(motionevent);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokespecial   #432 <Method boolean ListView.onHoverEvent(MotionEvent)>
	//    6   13:ireturn         
		int i = motionevent.getActionMasked();
	//    7   14:aload_1         
	//    8   15:invokevirtual   #394 <Method int MotionEvent.getActionMasked()>
	//    9   18:istore_2        
		if(i == 10 && mResolveHoverRunnable == null)
	//*  10   19:iload_2         
	//*  11   20:bipush          10
	//*  12   22:icmpne          52
	//*  13   25:aload_0         
	//*  14   26:getfield        #98  <Field DropDownListView$ResolveHoverRunnable mResolveHoverRunnable>
	//*  15   29:ifnonnull       52
		{
			mResolveHoverRunnable = new ResolveHoverRunnable();
	//   16   32:aload_0         
	//   17   33:new             #11  <Class DropDownListView$ResolveHoverRunnable>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:aconst_null     
	//   21   39:invokespecial   #435 <Method void DropDownListView$ResolveHoverRunnable(DropDownListView, DropDownListView$1)>
	//   22   42:putfield        #98  <Field DropDownListView$ResolveHoverRunnable mResolveHoverRunnable>
			mResolveHoverRunnable.post();
	//   23   45:aload_0         
	//   24   46:getfield        #98  <Field DropDownListView$ResolveHoverRunnable mResolveHoverRunnable>
	//   25   49:invokevirtual   #438 <Method void DropDownListView$ResolveHoverRunnable.post()>
		}
		boolean flag = super.onHoverEvent(motionevent);
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokespecial   #432 <Method boolean ListView.onHoverEvent(MotionEvent)>
	//   29   57:istore_3        
		if(i != 9 && i != 7)
	//*  30   58:iload_2         
	//*  31   59:bipush          9
	//*  32   61:icmpeq          80
	//*  33   64:iload_2         
	//*  34   65:bipush          7
	//*  35   67:icmpne          73
	//*  36   70:goto            80
		{
			setSelection(-1);
	//   37   73:aload_0         
	//   38   74:iconst_m1       
	//   39   75:invokevirtual   #441 <Method void setSelection(int)>
			return flag;
	//   40   78:iload_3         
	//   41   79:ireturn         
		}
		i = pointToPosition((int)motionevent.getX(), (int)motionevent.getY());
	//   42   80:aload_0         
	//   43   81:aload_1         
	//   44   82:invokevirtual   #443 <Method float MotionEvent.getX()>
	//   45   85:f2i             
	//   46   86:aload_1         
	//   47   87:invokevirtual   #445 <Method float MotionEvent.getY()>
	//   48   90:f2i             
	//   49   91:invokevirtual   #407 <Method int pointToPosition(int, int)>
	//   50   94:istore_2        
		if(i != -1 && i != getSelectedItemPosition())
	//*  51   95:iload_2         
	//*  52   96:iconst_m1       
	//*  53   97:icmpeq          144
	//*  54  100:iload_2         
	//*  55  101:aload_0         
	//*  56  102:invokevirtual   #448 <Method int getSelectedItemPosition()>
	//*  57  105:icmpeq          144
		{
			motionevent = ((MotionEvent) (getChildAt(i - getFirstVisiblePosition())));
	//   58  108:aload_0         
	//   59  109:iload_2         
	//   60  110:aload_0         
	//   61  111:invokevirtual   #113 <Method int getFirstVisiblePosition()>
	//   62  114:isub            
	//   63  115:invokevirtual   #117 <Method View getChildAt(int)>
	//   64  118:astore_1        
			if(((View) (motionevent)).isEnabled())
	//*  65  119:aload_1         
	//*  66  120:invokevirtual   #195 <Method boolean View.isEnabled()>
	//*  67  123:ifeq            140
				setSelectionFromTop(i, ((View) (motionevent)).getTop() - getTop());
	//   68  126:aload_0         
	//   69  127:iload_2         
	//   70  128:aload_1         
	//   71  129:invokevirtual   #166 <Method int View.getTop()>
	//   72  132:aload_0         
	//   73  133:invokevirtual   #449 <Method int getTop()>
	//   74  136:isub            
	//   75  137:invokevirtual   #452 <Method void setSelectionFromTop(int, int)>
			updateSelectorStateCompat();
	//   76  140:aload_0         
	//   77  141:invokespecial   #283 <Method void updateSelectorStateCompat()>
		}
		return flag;
	//   78  144:iload_3         
	//   79  145:ireturn         
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(motionevent.getAction() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #457 <Method int MotionEvent.getAction()>
	//*   2    4:ifeq            10
	//*   3    7:goto            28
			mMotionPosition = pointToPosition((int)motionevent.getX(), (int)motionevent.getY());
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #443 <Method float MotionEvent.getX()>
	//    8   16:f2i             
	//    9   17:aload_1         
	//   10   18:invokevirtual   #445 <Method float MotionEvent.getY()>
	//   11   21:f2i             
	//   12   22:invokevirtual   #407 <Method int pointToPosition(int, int)>
	//   13   25:putfield        #109 <Field int mMotionPosition>
		if(mResolveHoverRunnable != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #98  <Field DropDownListView$ResolveHoverRunnable mResolveHoverRunnable>
	//*  16   32:ifnull          42
			mResolveHoverRunnable.cancel();
	//   17   35:aload_0         
	//   18   36:getfield        #98  <Field DropDownListView$ResolveHoverRunnable mResolveHoverRunnable>
	//   19   39:invokevirtual   #458 <Method void DropDownListView$ResolveHoverRunnable.cancel()>
		return super.onTouchEvent(motionevent);
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:invokespecial   #460 <Method boolean ListView.onTouchEvent(MotionEvent)>
	//   23   47:ireturn         
	}

	void setListSelectionHidden(boolean flag)
	{
		mListSelectionHidden = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #295 <Field boolean mListSelectionHidden>
	//    3    5:return          
	}

	public void setSelector(Drawable drawable)
	{
		Object obj;
		if(drawable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          16
			obj = ((Object) (new GateKeeperDrawable(drawable)));
	//    2    4:new             #8   <Class DropDownListView$GateKeeperDrawable>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #465 <Method void DropDownListView$GateKeeperDrawable(Drawable)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			obj = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		mSelector = ((GateKeeperDrawable) (obj));
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:putfield        #260 <Field DropDownListView$GateKeeperDrawable mSelector>
		super.setSelector(((Drawable) (mSelector)));
	//   13   23:aload_0         
	//   14   24:aload_0         
	//   15   25:getfield        #260 <Field DropDownListView$GateKeeperDrawable mSelector>
	//   16   28:invokespecial   #467 <Method void ListView.setSelector(Drawable)>
		obj = ((Object) (new Rect()));
	//   17   31:new             #51  <Class Rect>
	//   18   34:dup             
	//   19   35:invokespecial   #54  <Method void Rect()>
	//   20   38:astore_2        
		if(drawable != null)
	//*  21   39:aload_1         
	//*  22   40:ifnull          49
			drawable.getPadding(((Rect) (obj)));
	//   23   43:aload_1         
	//   24   44:aload_2         
	//   25   45:invokevirtual   #471 <Method boolean Drawable.getPadding(Rect)>
	//   26   48:pop             
		mSelectionLeftPadding = ((Rect) (obj)).left;
	//   27   49:aload_0         
	//   28   50:aload_2         
	//   29   51:getfield        #179 <Field int Rect.left>
	//   30   54:putfield        #58  <Field int mSelectionLeftPadding>
		mSelectionTopPadding = ((Rect) (obj)).top;
	//   31   57:aload_0         
	//   32   58:aload_2         
	//   33   59:getfield        #182 <Field int Rect.top>
	//   34   62:putfield        #60  <Field int mSelectionTopPadding>
		mSelectionRightPadding = ((Rect) (obj)).right;
	//   35   65:aload_0         
	//   36   66:aload_2         
	//   37   67:getfield        #185 <Field int Rect.right>
	//   38   70:putfield        #62  <Field int mSelectionRightPadding>
		mSelectionBottomPadding = ((Rect) (obj)).bottom;
	//   39   73:aload_0         
	//   40   74:aload_2         
	//   41   75:getfield        #188 <Field int Rect.bottom>
	//   42   78:putfield        #64  <Field int mSelectionBottomPadding>
	//   43   81:return          
	}

	public static final int INVALID_POSITION = -1;
	public static final int NO_POSITION = -1;
	private ViewPropertyAnimatorCompat mClickAnimation;
	private boolean mDrawsInPressedState;
	private boolean mHijackFocus;
	private Field mIsChildViewEnabled;
	private boolean mListSelectionHidden;
	private int mMotionPosition;
	private ResolveHoverRunnable mResolveHoverRunnable;
	private ListViewAutoScrollHelper mScrollHelper;
	private int mSelectionBottomPadding;
	private int mSelectionLeftPadding;
	private int mSelectionRightPadding;
	private int mSelectionTopPadding;
	private GateKeeperDrawable mSelector;
	private final Rect mSelectorRect = new Rect();


/*
	static ResolveHoverRunnable access$102(DropDownListView dropdownlistview, ResolveHoverRunnable resolvehoverrunnable)
	{
		dropdownlistview.mResolveHoverRunnable = resolvehoverrunnable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #98  <Field DropDownListView$ResolveHoverRunnable mResolveHoverRunnable>
		return resolvehoverrunnable;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/
}
