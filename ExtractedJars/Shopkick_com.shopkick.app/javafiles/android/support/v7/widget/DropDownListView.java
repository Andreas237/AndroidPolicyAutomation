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
			DropDownListView dropdownlistview = DropDownListView.this;
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field DropDownListView this$0>
		//    2    4:astore_1        
			dropdownlistview.mResolveHoverRunnable = null;
		//    3    5:aload_1         
		//    4    6:aconst_null     
		//    5    7:putfield        #24  <Field DropDownListView$ResolveHoverRunnable DropDownListView.mResolveHoverRunnable>
			dropdownlistview.removeCallbacks(((Runnable) (this)));
		//    6   10:aload_1         
		//    7   11:aload_0         
		//    8   12:invokevirtual   #28  <Method boolean DropDownListView.removeCallbacks(Runnable)>
		//    9   15:pop             
		//   10   16:return          
		}

		public void post()
		{
			DropDownListView.this.post(((Runnable) (this)));
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field DropDownListView this$0>
		//    2    4:aload_0         
		//    3    5:invokevirtual   #31  <Method boolean DropDownListView.post(Runnable)>
		//    4    8:pop             
		//    5    9:return          
		}

		public void run()
		{
			DropDownListView dropdownlistview = DropDownListView.this;
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field DropDownListView this$0>
		//    2    4:astore_1        
			dropdownlistview.mResolveHoverRunnable = null;
		//    3    5:aload_1         
		//    4    6:aconst_null     
		//    5    7:putfield        #24  <Field DropDownListView$ResolveHoverRunnable DropDownListView.mResolveHoverRunnable>
			dropdownlistview.drawableStateChanged();
		//    6   10:aload_1         
		//    7   11:invokevirtual   #35  <Method void DropDownListView.drawableStateChanged()>
		//    8   14:return          
		}

		final DropDownListView this$0;

		ResolveHoverRunnable()
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
	//    3    3:getstatic       #44  <Field int android.support.v7.appcompat.R$attr.dropDownListViewStyle>
	//    4    6:invokespecial   #47  <Method void ListView(Context, android.util.AttributeSet, int)>
	//    5    9:aload_0         
	//    6   10:new             #49  <Class Rect>
	//    7   13:dup             
	//    8   14:invokespecial   #52  <Method void Rect()>
	//    9   17:putfield        #54  <Field Rect mSelectorRect>
		mSelectionLeftPadding = 0;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #56  <Field int mSelectionLeftPadding>
		mSelectionTopPadding = 0;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #58  <Field int mSelectionTopPadding>
		mSelectionRightPadding = 0;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #60  <Field int mSelectionRightPadding>
		mSelectionBottomPadding = 0;
	//   19   35:aload_0         
	//   20   36:iconst_0        
	//   21   37:putfield        #62  <Field int mSelectionBottomPadding>
		mHijackFocus = flag;
	//   22   40:aload_0         
	//   23   41:iload_2         
	//   24   42:putfield        #64  <Field boolean mHijackFocus>
		setCacheColorHint(0);
	//   25   45:aload_0         
	//   26   46:iconst_0        
	//   27   47:invokevirtual   #68  <Method void setCacheColorHint(int)>
		try
		{
			mIsChildViewEnabled = ((Class) (android/widget/AbsListView)).getDeclaredField("mIsChildViewEnabled");
	//   28   50:aload_0         
	//   29   51:ldc1            #70  <Class AbsListView>
	//   30   53:ldc1            #71  <String "mIsChildViewEnabled">
	//   31   55:invokevirtual   #77  <Method Field Class.getDeclaredField(String)>
	//   32   58:putfield        #79  <Field Field mIsChildViewEnabled>
			mIsChildViewEnabled.setAccessible(true);
	//   33   61:aload_0         
	//   34   62:getfield        #79  <Field Field mIsChildViewEnabled>
	//   35   65:iconst_1        
	//   36   66:invokevirtual   #85  <Method void Field.setAccessible(boolean)>
			return;
	//   37   69:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  38   70:astore_1        
		{
			((NoSuchFieldException) (context)).printStackTrace();
	//   39   71:aload_1         
	//   40   72:invokevirtual   #88  <Method void NoSuchFieldException.printStackTrace()>
		}
	//   41   75:return          
	}

	private void clearPressedItem()
	{
		mDrawsInPressedState = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #92  <Field boolean mDrawsInPressedState>
		setPressed(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #95  <Method void setPressed(boolean)>
		drawableStateChanged();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #98  <Method void drawableStateChanged()>
		Object obj = ((Object) (getChildAt(mMotionPosition - getFirstVisiblePosition())));
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #100 <Field int mMotionPosition>
	//   11   19:aload_0         
	//   12   20:invokevirtual   #104 <Method int getFirstVisiblePosition()>
	//   13   23:isub            
	//   14   24:invokevirtual   #108 <Method View getChildAt(int)>
	//   15   27:astore_1        
		if(obj != null)
	//*  16   28:aload_1         
	//*  17   29:ifnull          37
			((View) (obj)).setPressed(false);
	//   18   32:aload_1         
	//   19   33:iconst_0        
	//   20   34:invokevirtual   #111 <Method void View.setPressed(boolean)>
		obj = ((Object) (mClickAnimation));
	//   21   37:aload_0         
	//   22   38:getfield        #113 <Field ViewPropertyAnimatorCompat mClickAnimation>
	//   23   41:astore_1        
		if(obj != null)
	//*  24   42:aload_1         
	//*  25   43:ifnull          55
		{
			((ViewPropertyAnimatorCompat) (obj)).cancel();
	//   26   46:aload_1         
	//   27   47:invokevirtual   #118 <Method void ViewPropertyAnimatorCompat.cancel()>
			mClickAnimation = null;
	//   28   50:aload_0         
	//   29   51:aconst_null     
	//   30   52:putfield        #113 <Field ViewPropertyAnimatorCompat mClickAnimation>
		}
	//   31   55:return          
	}

	private void clickPressedItem(View view, int i)
	{
		performItemClick(view, i, getItemIdAtPosition(i));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_0         
	//    4    4:iload_2         
	//    5    5:invokevirtual   #124 <Method long getItemIdAtPosition(int)>
	//    6    8:invokevirtual   #128 <Method boolean performItemClick(View, int, long)>
	//    7   11:pop             
	//    8   12:return          
	}

	private void drawSelectorCompat(Canvas canvas)
	{
		if(!mSelectorRect.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field Rect mSelectorRect>
	//*   2    4:invokevirtual   #134 <Method boolean Rect.isEmpty()>
	//*   3    7:ifne            32
		{
			Drawable drawable = getSelector();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #138 <Method Drawable getSelector()>
	//    6   14:astore_2        
			if(drawable != null)
	//*   7   15:aload_2         
	//*   8   16:ifnull          32
			{
				drawable.setBounds(mSelectorRect);
	//    9   19:aload_2         
	//   10   20:aload_0         
	//   11   21:getfield        #54  <Field Rect mSelectorRect>
	//   12   24:invokevirtual   #144 <Method void Drawable.setBounds(Rect)>
				drawable.draw(canvas);
	//   13   27:aload_2         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #147 <Method void Drawable.draw(Canvas)>
			}
		}
	//   16   32:return          
	}

	private void positionSelectorCompat(int i, View view)
	{
		Rect rect = mSelectorRect;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Rect mSelectorRect>
	//    2    4:astore          4
		rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
	//    3    6:aload           4
	//    4    8:aload_2         
	//    5    9:invokevirtual   #154 <Method int View.getLeft()>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #157 <Method int View.getTop()>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #160 <Method int View.getRight()>
	//   10   20:aload_2         
	//   11   21:invokevirtual   #163 <Method int View.getBottom()>
	//   12   24:invokevirtual   #167 <Method void Rect.set(int, int, int, int)>
		rect.left = rect.left - mSelectionLeftPadding;
	//   13   27:aload           4
	//   14   29:aload           4
	//   15   31:getfield        #170 <Field int Rect.left>
	//   16   34:aload_0         
	//   17   35:getfield        #56  <Field int mSelectionLeftPadding>
	//   18   38:isub            
	//   19   39:putfield        #170 <Field int Rect.left>
		rect.top = rect.top - mSelectionTopPadding;
	//   20   42:aload           4
	//   21   44:aload           4
	//   22   46:getfield        #173 <Field int Rect.top>
	//   23   49:aload_0         
	//   24   50:getfield        #58  <Field int mSelectionTopPadding>
	//   25   53:isub            
	//   26   54:putfield        #173 <Field int Rect.top>
		rect.right = rect.right + mSelectionRightPadding;
	//   27   57:aload           4
	//   28   59:aload           4
	//   29   61:getfield        #176 <Field int Rect.right>
	//   30   64:aload_0         
	//   31   65:getfield        #60  <Field int mSelectionRightPadding>
	//   32   68:iadd            
	//   33   69:putfield        #176 <Field int Rect.right>
		rect.bottom = rect.bottom + mSelectionBottomPadding;
	//   34   72:aload           4
	//   35   74:aload           4
	//   36   76:getfield        #179 <Field int Rect.bottom>
	//   37   79:aload_0         
	//   38   80:getfield        #62  <Field int mSelectionBottomPadding>
	//   39   83:iadd            
	//   40   84:putfield        #179 <Field int Rect.bottom>
		boolean flag;
		flag = mIsChildViewEnabled.getBoolean(((Object) (this)));
	//   41   87:aload_0         
	//   42   88:getfield        #79  <Field Field mIsChildViewEnabled>
	//   43   91:aload_0         
	//   44   92:invokevirtual   #183 <Method boolean Field.getBoolean(Object)>
	//   45   95:istore_3        
		if(view.isEnabled() == flag)
			break MISSING_BLOCK_LABEL_142;
	//   46   96:aload_2         
	//   47   97:invokevirtual   #186 <Method boolean View.isEnabled()>
	//   48  100:iload_3         
	//   49  101:icmpeq          142
		view = ((View) (mIsChildViewEnabled));
	//   50  104:aload_0         
	//   51  105:getfield        #79  <Field Field mIsChildViewEnabled>
	//   52  108:astore_2        
		if(!flag)
	//*  53  109:iload_3         
	//*  54  110:ifne            143
			flag = true;
	//   55  113:iconst_1        
	//   56  114:istore_3        
		else
	//*  57  115:goto            118
	//*  58  118:aload_2         
	//*  59  119:aload_0         
	//*  60  120:iload_3         
	//*  61  121:invokestatic    #192 <Method Boolean Boolean.valueOf(boolean)>
	//*  62  124:invokevirtual   #195 <Method void Field.set(Object, Object)>
	//*  63  127:iload_1         
	//*  64  128:iconst_m1       
	//*  65  129:icmpeq          142
	//*  66  132:aload_0         
	//*  67  133:invokevirtual   #198 <Method void refreshDrawableState()>
	//*  68  136:return          
	//*  69  137:astore_2        
	//*  70  138:aload_2         
	//*  71  139:invokevirtual   #199 <Method void IllegalAccessException.printStackTrace()>
	//*  72  142:return          
			flag = false;
	//   73  143:iconst_0        
	//   74  144:istore_3        
		((Field) (view)).set(((Object) (this)), ((Object) (Boolean.valueOf(flag))));
		if(i != -1)
			try
			{
				refreshDrawableState();
				return;
			}
			// Misplaced declaration of an exception variable
			catch(View view)
			{
				((IllegalAccessException) (view)).printStackTrace();
			}
	//*  75  145:goto            118
	}

	private void positionSelectorLikeFocusCompat(int i, View view)
	{
		Drawable drawable = getSelector();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #138 <Method Drawable getSelector()>
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
	//   20   37:invokevirtual   #204 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   21   40:pop             
		positionSelectorCompat(i, view);
	//   22   41:aload_0         
	//   23   42:iload_1         
	//   24   43:aload_2         
	//   25   44:invokespecial   #206 <Method void positionSelectorCompat(int, View)>
		if(flag)
	//*  26   47:iload           5
	//*  27   49:ifeq            98
		{
			view = ((View) (mSelectorRect));
	//   28   52:aload_0         
	//   29   53:getfield        #54  <Field Rect mSelectorRect>
	//   30   56:astore_2        
			float f = ((Rect) (view)).exactCenterX();
	//   31   57:aload_2         
	//   32   58:invokevirtual   #210 <Method float Rect.exactCenterX()>
	//   33   61:fstore_3        
			float f1 = ((Rect) (view)).exactCenterY();
	//   34   62:aload_2         
	//   35   63:invokevirtual   #213 <Method float Rect.exactCenterY()>
	//   36   66:fstore          4
			if(getVisibility() != 0)
	//*  37   68:aload_0         
	//*  38   69:invokevirtual   #216 <Method int getVisibility()>
	//*  39   72:ifne            78
	//*  40   75:goto            81
				flag1 = false;
	//   41   78:iconst_0        
	//   42   79:istore          6
			drawable.setVisible(flag1, false);
	//   43   81:aload           7
	//   44   83:iload           6
	//   45   85:iconst_0        
	//   46   86:invokevirtual   #204 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   47   89:pop             
			DrawableCompat.setHotspot(drawable, f, f1);
	//   48   90:aload           7
	//   49   92:fload_3         
	//   50   93:fload           4
	//   51   95:invokestatic    #222 <Method void DrawableCompat.setHotspot(Drawable, float, float)>
		}
	//   52   98:return          
	}

	private void positionSelectorLikeTouchCompat(int i, View view, float f, float f1)
	{
		positionSelectorLikeFocusCompat(i, view);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #226 <Method void positionSelectorLikeFocusCompat(int, View)>
		view = ((View) (getSelector()));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #138 <Method Drawable getSelector()>
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
	//   15   24:invokestatic    #222 <Method void DrawableCompat.setHotspot(Drawable, float, float)>
	//   16   27:return          
	}

	private void setPressedItem(View view, int i, float f, float f1)
	{
		mDrawsInPressedState = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #92  <Field boolean mDrawsInPressedState>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   3    5:getstatic       #233 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          21
	//*   5   10:icmplt          20
			drawableHotspotChanged(f, f1);
	//    6   13:aload_0         
	//    7   14:fload_3         
	//    8   15:fload           4
	//    9   17:invokevirtual   #237 <Method void drawableHotspotChanged(float, float)>
		if(!isPressed())
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #240 <Method boolean isPressed()>
	//*  12   24:ifne            32
			setPressed(true);
	//   13   27:aload_0         
	//   14   28:iconst_1        
	//   15   29:invokevirtual   #95  <Method void setPressed(boolean)>
		layoutChildren();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #243 <Method void layoutChildren()>
		int j = mMotionPosition;
	//   18   36:aload_0         
	//   19   37:getfield        #100 <Field int mMotionPosition>
	//   20   40:istore          7
		if(j != -1)
	//*  21   42:iload           7
	//*  22   44:iconst_m1       
	//*  23   45:icmpeq          86
		{
			View view1 = getChildAt(j - getFirstVisiblePosition());
	//   24   48:aload_0         
	//   25   49:iload           7
	//   26   51:aload_0         
	//   27   52:invokevirtual   #104 <Method int getFirstVisiblePosition()>
	//   28   55:isub            
	//   29   56:invokevirtual   #108 <Method View getChildAt(int)>
	//   30   59:astore          8
			if(view1 != null && view1 != view && view1.isPressed())
	//*  31   61:aload           8
	//*  32   63:ifnull          86
	//*  33   66:aload           8
	//*  34   68:aload_1         
	//*  35   69:if_acmpeq       86
	//*  36   72:aload           8
	//*  37   74:invokevirtual   #244 <Method boolean View.isPressed()>
	//*  38   77:ifeq            86
				view1.setPressed(false);
	//   39   80:aload           8
	//   40   82:iconst_0        
	//   41   83:invokevirtual   #111 <Method void View.setPressed(boolean)>
		}
		mMotionPosition = i;
	//   42   86:aload_0         
	//   43   87:iload_2         
	//   44   88:putfield        #100 <Field int mMotionPosition>
		float f2 = view.getLeft();
	//   45   91:aload_1         
	//   46   92:invokevirtual   #154 <Method int View.getLeft()>
	//   47   95:i2f             
	//   48   96:fstore          5
		float f3 = view.getTop();
	//   49   98:aload_1         
	//   50   99:invokevirtual   #157 <Method int View.getTop()>
	//   51  102:i2f             
	//   52  103:fstore          6
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  53  105:getstatic       #233 <Field int android.os.Build$VERSION.SDK_INT>
	//*  54  108:bipush          21
	//*  55  110:icmplt          126
			view.drawableHotspotChanged(f - f2, f1 - f3);
	//   56  113:aload_1         
	//   57  114:fload_3         
	//   58  115:fload           5
	//   59  117:fsub            
	//   60  118:fload           4
	//   61  120:fload           6
	//   62  122:fsub            
	//   63  123:invokevirtual   #245 <Method void View.drawableHotspotChanged(float, float)>
		if(!view.isPressed())
	//*  64  126:aload_1         
	//*  65  127:invokevirtual   #244 <Method boolean View.isPressed()>
	//*  66  130:ifne            138
			view.setPressed(true);
	//   67  133:aload_1         
	//   68  134:iconst_1        
	//   69  135:invokevirtual   #111 <Method void View.setPressed(boolean)>
		positionSelectorLikeTouchCompat(i, view, f, f1);
	//   70  138:aload_0         
	//   71  139:iload_2         
	//   72  140:aload_1         
	//   73  141:fload_3         
	//   74  142:fload           4
	//   75  144:invokespecial   #247 <Method void positionSelectorLikeTouchCompat(int, View, float, float)>
		setSelectorEnabled(false);
	//   76  147:aload_0         
	//   77  148:iconst_0        
	//   78  149:invokespecial   #250 <Method void setSelectorEnabled(boolean)>
		refreshDrawableState();
	//   79  152:aload_0         
	//   80  153:invokevirtual   #198 <Method void refreshDrawableState()>
	//   81  156:return          
	}

	private void setSelectorEnabled(boolean flag)
	{
		GateKeeperDrawable gatekeeperdrawable = mSelector;
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field DropDownListView$GateKeeperDrawable mSelector>
	//    2    4:astore_2        
		if(gatekeeperdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			gatekeeperdrawable.setEnabled(flag);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #255 <Method void DropDownListView$GateKeeperDrawable.setEnabled(boolean)>
	//    8   14:return          
	}

	private boolean touchModeDrawsInPressedStateCompat()
	{
		return mDrawsInPressedState;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field boolean mDrawsInPressedState>
	//    2    4:ireturn         
	}

	private void updateSelectorStateCompat()
	{
		Drawable drawable = getSelector();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #138 <Method Drawable getSelector()>
	//    2    4:astore_1        
		if(drawable != null && touchModeDrawsInPressedStateCompat() && isPressed())
	//*   3    5:aload_1         
	//*   4    6:ifnull          32
	//*   5    9:aload_0         
	//*   6   10:invokespecial   #259 <Method boolean touchModeDrawsInPressedStateCompat()>
	//*   7   13:ifeq            32
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #240 <Method boolean isPressed()>
	//*  10   20:ifeq            32
			drawable.setState(getDrawableState());
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:invokevirtual   #263 <Method int[] getDrawableState()>
	//   14   28:invokevirtual   #267 <Method boolean Drawable.setState(int[])>
	//   15   31:pop             
	//   16   32:return          
	}

	protected void dispatchDraw(Canvas canvas)
	{
		drawSelectorCompat(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #270 <Method void drawSelectorCompat(Canvas)>
		super.dispatchDraw(canvas);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #272 <Method void ListView.dispatchDraw(Canvas)>
	//    6   10:return          
	}

	protected void drawableStateChanged()
	{
		if(mResolveHoverRunnable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #274 <Field DropDownListView$ResolveHoverRunnable mResolveHoverRunnable>
	//*   2    4:ifnull          8
		{
			return;
	//    3    7:return          
		} else
		{
			super.drawableStateChanged();
	//    4    8:aload_0         
	//    5    9:invokespecial   #275 <Method void ListView.drawableStateChanged()>
			setSelectorEnabled(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokespecial   #250 <Method void setSelectorEnabled(boolean)>
			updateSelectorStateCompat();
	//    9   17:aload_0         
	//   10   18:invokespecial   #277 <Method void updateSelectorStateCompat()>
			return;
	//   11   21:return          
		}
	}

	public boolean hasFocus()
	{
		return mHijackFocus || super.hasFocus();
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field boolean mHijackFocus>
	//    2    4:ifne            19
	//    3    7:aload_0         
	//    4    8:invokespecial   #280 <Method boolean ListView.hasFocus()>
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
	//    1    1:getfield        #64  <Field boolean mHijackFocus>
	//    2    4:ifne            19
	//    3    7:aload_0         
	//    4    8:invokespecial   #283 <Method boolean ListView.hasWindowFocus()>
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
	//    1    1:getfield        #64  <Field boolean mHijackFocus>
	//    2    4:ifne            19
	//    3    7:aload_0         
	//    4    8:invokespecial   #286 <Method boolean ListView.isFocused()>
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
	//    1    1:getfield        #64  <Field boolean mHijackFocus>
	//    2    4:ifeq            14
	//    3    7:aload_0         
	//    4    8:getfield        #289 <Field boolean mListSelectionHidden>
	//    5   11:ifne            21
	//    6   14:aload_0         
	//    7   15:invokespecial   #291 <Method boolean ListView.isInTouchMode()>
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
	//    1    1:invokevirtual   #297 <Method ListAdapter getAdapter()>
	//    2    4:astore          5
		if(listadapter != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          146
		{
			if(isInTouchMode())
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #298 <Method boolean isInTouchMode()>
	//*   7   15:ifeq            20
				return -1;
	//    8   18:iconst_m1       
	//    9   19:ireturn         
			int k = listadapter.getCount();
	//   10   20:aload           5
	//   11   22:invokeinterface #303 <Method int ListAdapter.getCount()>
	//   12   27:istore          4
			if(!getAdapter().areAllItemsEnabled())
	//*  13   29:aload_0         
	//*  14   30:invokevirtual   #297 <Method ListAdapter getAdapter()>
	//*  15   33:invokeinterface #306 <Method boolean ListAdapter.areAllItemsEnabled()>
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
	//   21   47:invokestatic    #312 <Method int Math.max(int, int)>
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
	//   32   64:invokeinterface #315 <Method boolean ListAdapter.isEnabled(int)>
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
	//   43   84:invokestatic    #318 <Method int Math.min(int, int)>
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
	//   53   99:invokeinterface #315 <Method boolean ListAdapter.isEnabled(int)>
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
	//    1    1:invokevirtual   #323 <Method int getListPaddingTop()>
	//    2    4:istore_2        
		k = getListPaddingBottom();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #326 <Method int getListPaddingBottom()>
	//    5    9:istore_3        
		getListPaddingLeft();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #329 <Method int getListPaddingLeft()>
	//    8   14:pop             
		getListPaddingRight();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #332 <Method int getListPaddingRight()>
	//   11   19:pop             
		int j1 = getDividerHeight();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #335 <Method int getDividerHeight()>
	//   14   24:istore          6
		Object obj = ((Object) (getDivider()));
	//   15   26:aload_0         
	//   16   27:invokevirtual   #338 <Method Drawable getDivider()>
	//   17   30:astore          12
		ListAdapter listadapter = getAdapter();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #297 <Method ListAdapter getAdapter()>
	//   20   36:astore          15
		if(listadapter == null)
	//*  21   38:aload           15
	//*  22   40:ifnonnull       47
			return j + k;
	//   23   43:iload_2         
	//   24   44:iload_3         
	//   25   45:iadd            
	//   26   46:ireturn         
		if(j1 <= 0 || obj == null)
	//*  27   47:iload           6
	//*  28   49:ifle            60
	//*  29   52:aload           12
	//*  30   54:ifnull          60
	//*  31   57:goto            63
			j1 = 0;
	//   32   60:iconst_0        
	//   33   61:istore          6
		int l2 = listadapter.getCount();
	//   34   63:aload           15
	//   35   65:invokeinterface #303 <Method int ListAdapter.getCount()>
	//   36   70:istore          11
		int l1 = j + k;
	//   37   72:iload_2         
	//   38   73:iload_3         
	//   39   74:iadd            
	//   40   75:istore          8
		int k1 = 0;
	//   41   77:iconst_0        
	//   42   78:istore          7
		k = k1;
	//   43   80:iload           7
	//   44   82:istore_3        
		j = k;
	//   45   83:iload_3         
	//   46   84:istore_2        
		obj = null;
	//   47   85:aconst_null     
	//   48   86:astore          12
		int j2 = k;
	//   49   88:iload_3         
	//   50   89:istore          9
		k = l1;
	//   51   91:iload           8
	//   52   93:istore_3        
		while(k1 < l2) 
	//*  53   94:iload           7
	//*  54   96:iload           11
	//*  55   98:icmpge          325
		{
			int k2 = listadapter.getItemViewType(k1);
	//   56  101:aload           15
	//   57  103:iload           7
	//   58  105:invokeinterface #342 <Method int ListAdapter.getItemViewType(int)>
	//   59  110:istore          10
			int i2 = j2;
	//   60  112:iload           9
	//   61  114:istore          8
			if(k2 != j2)
	//*  62  116:iload           10
	//*  63  118:iload           9
	//*  64  120:icmpeq          130
			{
				obj = null;
	//   65  123:aconst_null     
	//   66  124:astore          12
				i2 = k2;
	//   67  126:iload           10
	//   68  128:istore          8
			}
			View view = listadapter.getView(k1, ((View) (obj)), ((android.view.ViewGroup) (this)));
	//   69  130:aload           15
	//   70  132:iload           7
	//   71  134:aload           12
	//   72  136:aload_0         
	//   73  137:invokeinterface #346 <Method View ListAdapter.getView(int, View, android.view.ViewGroup)>
	//   74  142:astore          13
			android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
	//   75  144:aload           13
	//   76  146:invokevirtual   #350 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   77  149:astore          14
			obj = ((Object) (layoutparams));
	//   78  151:aload           14
	//   79  153:astore          12
			if(layoutparams == null)
	//*  80  155:aload           14
	//*  81  157:ifnonnull       173
			{
				obj = ((Object) (generateDefaultLayoutParams()));
	//   82  160:aload_0         
	//   83  161:invokevirtual   #353 <Method android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()>
	//   84  164:astore          12
				view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
	//   85  166:aload           13
	//   86  168:aload           12
	//   87  170:invokevirtual   #357 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			}
			if(((android.view.ViewGroup.LayoutParams) (obj)).height > 0)
	//*  88  173:aload           12
	//*  89  175:getfield        #362 <Field int android.view.ViewGroup$LayoutParams.height>
	//*  90  178:ifle            197
				j2 = android.view.View.MeasureSpec.makeMeasureSpec(((android.view.ViewGroup.LayoutParams) (obj)).height, 0x40000000);
	//   91  181:aload           12
	//   92  183:getfield        #362 <Field int android.view.ViewGroup$LayoutParams.height>
	//   93  186:ldc2            #363 <Int 0x40000000>
	//   94  189:invokestatic    #368 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   95  192:istore          9
			else
	//*  96  194:goto            204
				j2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//   97  197:iconst_0        
	//   98  198:iconst_0        
	//   99  199:invokestatic    #368 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  100  202:istore          9
			view.measure(i, j2);
	//  101  204:aload           13
	//  102  206:iload_1         
	//  103  207:iload           9
	//  104  209:invokevirtual   #372 <Method void View.measure(int, int)>
			view.forceLayout();
	//  105  212:aload           13
	//  106  214:invokevirtual   #375 <Method void View.forceLayout()>
			j2 = k;
	//  107  217:iload_3         
	//  108  218:istore          9
			if(k1 > 0)
	//* 109  220:iload           7
	//* 110  222:ifle            231
				j2 = k + j1;
	//  111  225:iload_3         
	//  112  226:iload           6
	//  113  228:iadd            
	//  114  229:istore          9
			k = j2 + view.getMeasuredHeight();
	//  115  231:iload           9
	//  116  233:aload           13
	//  117  235:invokevirtual   #378 <Method int View.getMeasuredHeight()>
	//  118  238:iadd            
	//  119  239:istore_3        
			if(k >= l)
	//* 120  240:iload_3         
	//* 121  241:iload           4
	//* 122  243:icmplt          284
			{
				i = l;
	//  123  246:iload           4
	//  124  248:istore_1        
				if(i1 >= 0)
	//* 125  249:iload           5
	//* 126  251:iflt            282
				{
					i = l;
	//  127  254:iload           4
	//  128  256:istore_1        
					if(k1 > i1)
	//* 129  257:iload           7
	//* 130  259:iload           5
	//* 131  261:icmple          282
					{
						i = l;
	//  132  264:iload           4
	//  133  266:istore_1        
						if(j > 0)
	//* 134  267:iload_2         
	//* 135  268:ifle            282
						{
							i = l;
	//  136  271:iload           4
	//  137  273:istore_1        
							if(k != l)
	//* 138  274:iload_3         
	//* 139  275:iload           4
	//* 140  277:icmpeq          282
								i = j;
	//  141  280:iload_2         
	//  142  281:istore_1        
						}
					}
				}
				return i;
	//  143  282:iload_1         
	//  144  283:ireturn         
			}
			k2 = j;
	//  145  284:iload_2         
	//  146  285:istore          10
			if(i1 >= 0)
	//* 147  287:iload           5
	//* 148  289:iflt            305
			{
				k2 = j;
	//  149  292:iload_2         
	//  150  293:istore          10
				if(k1 >= i1)
	//* 151  295:iload           7
	//* 152  297:iload           5
	//* 153  299:icmplt          305
					k2 = k;
	//  154  302:iload_3         
	//  155  303:istore          10
			}
			k1++;
	//  156  305:iload           7
	//  157  307:iconst_1        
	//  158  308:iadd            
	//  159  309:istore          7
			j2 = i2;
	//  160  311:iload           8
	//  161  313:istore          9
			obj = ((Object) (view));
	//  162  315:aload           13
	//  163  317:astore          12
			j = k2;
	//  164  319:iload           10
	//  165  321:istore_2        
		}
	//* 166  322:goto            94
		return k;
	//  167  325:iload_3         
	//  168  326:ireturn         
	}

	protected void onDetachedFromWindow()
	{
		mResolveHoverRunnable = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #274 <Field DropDownListView$ResolveHoverRunnable mResolveHoverRunnable>
		super.onDetachedFromWindow();
	//    3    5:aload_0         
	//    4    6:invokespecial   #381 <Method void ListView.onDetachedFromWindow()>
	//    5    9:return          
	}

	public boolean onForwardedEvent(MotionEvent motionevent, int i)
	{
		boolean flag;
		boolean flag1;
label0:
		{
			int j = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #388 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore_3        
			switch(j)
	//*   3    5:iload_3         
			{
	//*   4    6:tableswitch     1 3: default 32
	//	               1 57
	//	               2 51
	//	               3 41
			default:
				flag1 = false;
	//    5   32:iconst_0        
	//    6   33:istore          7
				flag = true;
	//    7   35:iconst_1        
	//    8   36:istore          6
				break label0;
	//    9   38:goto            165

			case 3: // '\003'
				flag1 = false;
	//   10   41:iconst_0        
	//   11   42:istore          7
				flag = flag1;
	//   12   44:iload           7
	//   13   46:istore          6
				break label0;
	//   14   48:goto            165

			case 2: // '\002'
				flag = true;
	//   15   51:iconst_1        
	//   16   52:istore          6
				break;
	//   17   54:goto            60

			case 1: // '\001'
				flag = false;
	//   18   57:iconst_0        
	//   19   58:istore          6
				break;
			}
			int k = motionevent.findPointerIndex(i);
	//   20   60:aload_1         
	//   21   61:iload_2         
	//   22   62:invokevirtual   #391 <Method int MotionEvent.findPointerIndex(int)>
	//   23   65:istore          4
			if(k < 0)
	//*  24   67:iload           4
	//*  25   69:ifge            82
			{
				flag1 = false;
	//   26   72:iconst_0        
	//   27   73:istore          7
				flag = flag1;
	//   28   75:iload           7
	//   29   77:istore          6
			} else
	//*  30   79:goto            165
			{
				i = (int)motionevent.getX(k);
	//   31   82:aload_1         
	//   32   83:iload           4
	//   33   85:invokevirtual   #395 <Method float MotionEvent.getX(int)>
	//   34   88:f2i             
	//   35   89:istore_2        
				k = (int)motionevent.getY(k);
	//   36   90:aload_1         
	//   37   91:iload           4
	//   38   93:invokevirtual   #398 <Method float MotionEvent.getY(int)>
	//   39   96:f2i             
	//   40   97:istore          4
				int l = pointToPosition(i, k);
	//   41   99:aload_0         
	//   42  100:iload_2         
	//   43  101:iload           4
	//   44  103:invokevirtual   #401 <Method int pointToPosition(int, int)>
	//   45  106:istore          5
				if(l == -1)
	//*  46  108:iload           5
	//*  47  110:iconst_m1       
	//*  48  111:icmpne          120
				{
					flag1 = true;
	//   49  114:iconst_1        
	//   50  115:istore          7
				} else
	//*  51  117:goto            165
				{
					View view = getChildAt(l - getFirstVisiblePosition());
	//   52  120:aload_0         
	//   53  121:iload           5
	//   54  123:aload_0         
	//   55  124:invokevirtual   #104 <Method int getFirstVisiblePosition()>
	//   56  127:isub            
	//   57  128:invokevirtual   #108 <Method View getChildAt(int)>
	//   58  131:astore          8
					setPressedItem(view, l, i, k);
	//   59  133:aload_0         
	//   60  134:aload           8
	//   61  136:iload           5
	//   62  138:iload_2         
	//   63  139:i2f             
	//   64  140:iload           4
	//   65  142:i2f             
	//   66  143:invokespecial   #403 <Method void setPressedItem(View, int, float, float)>
					if(j == 1)
	//*  67  146:iload_3         
	//*  68  147:iconst_1        
	//*  69  148:icmpne          159
						clickPressedItem(view, l);
	//   70  151:aload_0         
	//   71  152:aload           8
	//   72  154:iload           5
	//   73  156:invokespecial   #405 <Method void clickPressedItem(View, int)>
					flag1 = false;
	//   74  159:iconst_0        
	//   75  160:istore          7
					flag = true;
	//   76  162:iconst_1        
	//   77  163:istore          6
				}
			}
		}
		if(!flag || flag1)
	//*  78  165:iload           6
	//*  79  167:ifeq            175
	//*  80  170:iload           7
	//*  81  172:ifeq            179
			clearPressedItem();
	//   82  175:aload_0         
	//   83  176:invokespecial   #407 <Method void clearPressedItem()>
		if(flag)
	//*  84  179:iload           6
	//*  85  181:ifeq            225
		{
			if(mScrollHelper == null)
	//*  86  184:aload_0         
	//*  87  185:getfield        #409 <Field ListViewAutoScrollHelper mScrollHelper>
	//*  88  188:ifnonnull       203
				mScrollHelper = new ListViewAutoScrollHelper(((ListView) (this)));
	//   89  191:aload_0         
	//   90  192:new             #411 <Class ListViewAutoScrollHelper>
	//   91  195:dup             
	//   92  196:aload_0         
	//   93  197:invokespecial   #414 <Method void ListViewAutoScrollHelper(ListView)>
	//   94  200:putfield        #409 <Field ListViewAutoScrollHelper mScrollHelper>
			mScrollHelper.setEnabled(true);
	//   95  203:aload_0         
	//   96  204:getfield        #409 <Field ListViewAutoScrollHelper mScrollHelper>
	//   97  207:iconst_1        
	//   98  208:invokevirtual   #417 <Method android.support.v4.widget.AutoScrollHelper ListViewAutoScrollHelper.setEnabled(boolean)>
	//   99  211:pop             
			mScrollHelper.onTouch(((View) (this)), motionevent);
	//  100  212:aload_0         
	//  101  213:getfield        #409 <Field ListViewAutoScrollHelper mScrollHelper>
	//  102  216:aload_0         
	//  103  217:aload_1         
	//  104  218:invokevirtual   #421 <Method boolean ListViewAutoScrollHelper.onTouch(View, MotionEvent)>
	//  105  221:pop             
			return flag;
	//  106  222:iload           6
	//  107  224:ireturn         
		}
		motionevent = ((MotionEvent) (mScrollHelper));
	//  108  225:aload_0         
	//  109  226:getfield        #409 <Field ListViewAutoScrollHelper mScrollHelper>
	//  110  229:astore_1        
		if(motionevent != null)
	//* 111  230:aload_1         
	//* 112  231:ifnull          240
			((ListViewAutoScrollHelper) (motionevent)).setEnabled(false);
	//  113  234:aload_1         
	//  114  235:iconst_0        
	//  115  236:invokevirtual   #417 <Method android.support.v4.widget.AutoScrollHelper ListViewAutoScrollHelper.setEnabled(boolean)>
	//  116  239:pop             
		return flag;
	//  117  240:iload           6
	//  118  242:ireturn         
	}

	public boolean onHoverEvent(MotionEvent motionevent)
	{
		if(android.os.Build.VERSION.SDK_INT < 26)
	//*   0    0:getstatic       #233 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmpge          14
			return super.onHoverEvent(motionevent);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokespecial   #426 <Method boolean ListView.onHoverEvent(MotionEvent)>
	//    6   13:ireturn         
		int i = motionevent.getActionMasked();
	//    7   14:aload_1         
	//    8   15:invokevirtual   #388 <Method int MotionEvent.getActionMasked()>
	//    9   18:istore_2        
		if(i == 10 && mResolveHoverRunnable == null)
	//*  10   19:iload_2         
	//*  11   20:bipush          10
	//*  12   22:icmpne          51
	//*  13   25:aload_0         
	//*  14   26:getfield        #274 <Field DropDownListView$ResolveHoverRunnable mResolveHoverRunnable>
	//*  15   29:ifnonnull       51
		{
			mResolveHoverRunnable = new ResolveHoverRunnable();
	//   16   32:aload_0         
	//   17   33:new             #9   <Class DropDownListView$ResolveHoverRunnable>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:invokespecial   #429 <Method void DropDownListView$ResolveHoverRunnable(DropDownListView)>
	//   21   41:putfield        #274 <Field DropDownListView$ResolveHoverRunnable mResolveHoverRunnable>
			mResolveHoverRunnable.post();
	//   22   44:aload_0         
	//   23   45:getfield        #274 <Field DropDownListView$ResolveHoverRunnable mResolveHoverRunnable>
	//   24   48:invokevirtual   #432 <Method void DropDownListView$ResolveHoverRunnable.post()>
		}
		boolean flag = super.onHoverEvent(motionevent);
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:invokespecial   #426 <Method boolean ListView.onHoverEvent(MotionEvent)>
	//   28   56:istore_3        
		if(i != 9 && i != 7)
	//*  29   57:iload_2         
	//*  30   58:bipush          9
	//*  31   60:icmpeq          79
	//*  32   63:iload_2         
	//*  33   64:bipush          7
	//*  34   66:icmpne          72
	//*  35   69:goto            79
		{
			setSelection(-1);
	//   36   72:aload_0         
	//   37   73:iconst_m1       
	//   38   74:invokevirtual   #435 <Method void setSelection(int)>
			return flag;
	//   39   77:iload_3         
	//   40   78:ireturn         
		}
		i = pointToPosition((int)motionevent.getX(), (int)motionevent.getY());
	//   41   79:aload_0         
	//   42   80:aload_1         
	//   43   81:invokevirtual   #437 <Method float MotionEvent.getX()>
	//   44   84:f2i             
	//   45   85:aload_1         
	//   46   86:invokevirtual   #439 <Method float MotionEvent.getY()>
	//   47   89:f2i             
	//   48   90:invokevirtual   #401 <Method int pointToPosition(int, int)>
	//   49   93:istore_2        
		if(i != -1 && i != getSelectedItemPosition())
	//*  50   94:iload_2         
	//*  51   95:iconst_m1       
	//*  52   96:icmpeq          143
	//*  53   99:iload_2         
	//*  54  100:aload_0         
	//*  55  101:invokevirtual   #442 <Method int getSelectedItemPosition()>
	//*  56  104:icmpeq          143
		{
			motionevent = ((MotionEvent) (getChildAt(i - getFirstVisiblePosition())));
	//   57  107:aload_0         
	//   58  108:iload_2         
	//   59  109:aload_0         
	//   60  110:invokevirtual   #104 <Method int getFirstVisiblePosition()>
	//   61  113:isub            
	//   62  114:invokevirtual   #108 <Method View getChildAt(int)>
	//   63  117:astore_1        
			if(((View) (motionevent)).isEnabled())
	//*  64  118:aload_1         
	//*  65  119:invokevirtual   #186 <Method boolean View.isEnabled()>
	//*  66  122:ifeq            139
				setSelectionFromTop(i, ((View) (motionevent)).getTop() - getTop());
	//   67  125:aload_0         
	//   68  126:iload_2         
	//   69  127:aload_1         
	//   70  128:invokevirtual   #157 <Method int View.getTop()>
	//   71  131:aload_0         
	//   72  132:invokevirtual   #443 <Method int getTop()>
	//   73  135:isub            
	//   74  136:invokevirtual   #446 <Method void setSelectionFromTop(int, int)>
			updateSelectorStateCompat();
	//   75  139:aload_0         
	//   76  140:invokespecial   #277 <Method void updateSelectorStateCompat()>
		}
		return flag;
	//   77  143:iload_3         
	//   78  144:ireturn         
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(motionevent.getAction() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #451 <Method int MotionEvent.getAction()>
	//*   2    4:ifeq            10
	//*   3    7:goto            28
			mMotionPosition = pointToPosition((int)motionevent.getX(), (int)motionevent.getY());
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #437 <Method float MotionEvent.getX()>
	//    8   16:f2i             
	//    9   17:aload_1         
	//   10   18:invokevirtual   #439 <Method float MotionEvent.getY()>
	//   11   21:f2i             
	//   12   22:invokevirtual   #401 <Method int pointToPosition(int, int)>
	//   13   25:putfield        #100 <Field int mMotionPosition>
		ResolveHoverRunnable resolvehoverrunnable = mResolveHoverRunnable;
	//   14   28:aload_0         
	//   15   29:getfield        #274 <Field DropDownListView$ResolveHoverRunnable mResolveHoverRunnable>
	//   16   32:astore_2        
		if(resolvehoverrunnable != null)
	//*  17   33:aload_2         
	//*  18   34:ifnull          41
			resolvehoverrunnable.cancel();
	//   19   37:aload_2         
	//   20   38:invokevirtual   #452 <Method void DropDownListView$ResolveHoverRunnable.cancel()>
		return super.onTouchEvent(motionevent);
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:invokespecial   #454 <Method boolean ListView.onTouchEvent(MotionEvent)>
	//   24   46:ireturn         
	}

	void setListSelectionHidden(boolean flag)
	{
		mListSelectionHidden = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #289 <Field boolean mListSelectionHidden>
	//    3    5:return          
	}

	public void setSelector(Drawable drawable)
	{
		Object obj;
		if(drawable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          16
			obj = ((Object) (new GateKeeperDrawable(drawable)));
	//    2    4:new             #6   <Class DropDownListView$GateKeeperDrawable>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #459 <Method void DropDownListView$GateKeeperDrawable(Drawable)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			obj = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		mSelector = ((GateKeeperDrawable) (obj));
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:putfield        #252 <Field DropDownListView$GateKeeperDrawable mSelector>
		super.setSelector(((Drawable) (mSelector)));
	//   13   23:aload_0         
	//   14   24:aload_0         
	//   15   25:getfield        #252 <Field DropDownListView$GateKeeperDrawable mSelector>
	//   16   28:invokespecial   #461 <Method void ListView.setSelector(Drawable)>
		obj = ((Object) (new Rect()));
	//   17   31:new             #49  <Class Rect>
	//   18   34:dup             
	//   19   35:invokespecial   #52  <Method void Rect()>
	//   20   38:astore_2        
		if(drawable != null)
	//*  21   39:aload_1         
	//*  22   40:ifnull          49
			drawable.getPadding(((Rect) (obj)));
	//   23   43:aload_1         
	//   24   44:aload_2         
	//   25   45:invokevirtual   #465 <Method boolean Drawable.getPadding(Rect)>
	//   26   48:pop             
		mSelectionLeftPadding = ((Rect) (obj)).left;
	//   27   49:aload_0         
	//   28   50:aload_2         
	//   29   51:getfield        #170 <Field int Rect.left>
	//   30   54:putfield        #56  <Field int mSelectionLeftPadding>
		mSelectionTopPadding = ((Rect) (obj)).top;
	//   31   57:aload_0         
	//   32   58:aload_2         
	//   33   59:getfield        #173 <Field int Rect.top>
	//   34   62:putfield        #58  <Field int mSelectionTopPadding>
		mSelectionRightPadding = ((Rect) (obj)).right;
	//   35   65:aload_0         
	//   36   66:aload_2         
	//   37   67:getfield        #176 <Field int Rect.right>
	//   38   70:putfield        #60  <Field int mSelectionRightPadding>
		mSelectionBottomPadding = ((Rect) (obj)).bottom;
	//   39   73:aload_0         
	//   40   74:aload_2         
	//   41   75:getfield        #179 <Field int Rect.bottom>
	//   42   78:putfield        #62  <Field int mSelectionBottomPadding>
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
	ResolveHoverRunnable mResolveHoverRunnable;
	private ListViewAutoScrollHelper mScrollHelper;
	private int mSelectionBottomPadding;
	private int mSelectionLeftPadding;
	private int mSelectionRightPadding;
	private int mSelectionTopPadding;
	private GateKeeperDrawable mSelector;
	private final Rect mSelectorRect = new Rect();
}
