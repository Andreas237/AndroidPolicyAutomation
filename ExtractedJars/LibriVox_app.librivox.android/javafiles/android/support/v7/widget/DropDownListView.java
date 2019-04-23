// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.a;
import android.support.v4.view.au;
import android.support.v4.widget.s;
import android.view.MotionEvent;
import android.view.View;
import android.widget.*;
import java.lang.reflect.Field;

class DropDownListView extends ListView
{

	DropDownListView(Context context, boolean flag)
	{
		super(context, ((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.attr.dropDownListViewStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:getstatic       #38  <Field int android.support.v7.appcompat.R$attr.dropDownListViewStyle>
	//    4    6:invokespecial   #41  <Method void ListView(Context, android.util.AttributeSet, int)>
	//    5    9:aload_0         
	//    6   10:new             #43  <Class Rect>
	//    7   13:dup             
	//    8   14:invokespecial   #46  <Method void Rect()>
	//    9   17:putfield        #48  <Field Rect mSelectorRect>
		mSelectionLeftPadding = 0;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #50  <Field int mSelectionLeftPadding>
		mSelectionTopPadding = 0;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #52  <Field int mSelectionTopPadding>
		mSelectionRightPadding = 0;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #54  <Field int mSelectionRightPadding>
		mSelectionBottomPadding = 0;
	//   19   35:aload_0         
	//   20   36:iconst_0        
	//   21   37:putfield        #56  <Field int mSelectionBottomPadding>
		mHijackFocus = flag;
	//   22   40:aload_0         
	//   23   41:iload_2         
	//   24   42:putfield        #58  <Field boolean mHijackFocus>
		setCacheColorHint(0);
	//   25   45:aload_0         
	//   26   46:iconst_0        
	//   27   47:invokevirtual   #62  <Method void setCacheColorHint(int)>
		try
		{
			mIsChildViewEnabled = ((Class) (android/widget/AbsListView)).getDeclaredField("mIsChildViewEnabled");
	//   28   50:aload_0         
	//   29   51:ldc1            #64  <Class AbsListView>
	//   30   53:ldc1            #65  <String "mIsChildViewEnabled">
	//   31   55:invokevirtual   #71  <Method Field Class.getDeclaredField(String)>
	//   32   58:putfield        #73  <Field Field mIsChildViewEnabled>
			mIsChildViewEnabled.setAccessible(true);
	//   33   61:aload_0         
	//   34   62:getfield        #73  <Field Field mIsChildViewEnabled>
	//   35   65:iconst_1        
	//   36   66:invokevirtual   #79  <Method void Field.setAccessible(boolean)>
			return;
	//   37   69:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  38   70:astore_1        
		{
			((NoSuchFieldException) (context)).printStackTrace();
	//   39   71:aload_1         
	//   40   72:invokevirtual   #82  <Method void NoSuchFieldException.printStackTrace()>
		}
	//   41   75:return          
	}

	private void clearPressedItem()
	{
		mDrawsInPressedState = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #86  <Field boolean mDrawsInPressedState>
		setPressed(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #89  <Method void setPressed(boolean)>
		drawableStateChanged();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #92  <Method void drawableStateChanged()>
		Object obj = ((Object) (getChildAt(mMotionPosition - getFirstVisiblePosition())));
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #94  <Field int mMotionPosition>
	//   11   19:aload_0         
	//   12   20:invokevirtual   #98  <Method int getFirstVisiblePosition()>
	//   13   23:isub            
	//   14   24:invokevirtual   #102 <Method View getChildAt(int)>
	//   15   27:astore_1        
		if(obj != null)
	//*  16   28:aload_1         
	//*  17   29:ifnull          37
			((View) (obj)).setPressed(false);
	//   18   32:aload_1         
	//   19   33:iconst_0        
	//   20   34:invokevirtual   #105 <Method void View.setPressed(boolean)>
		obj = ((Object) (mClickAnimation));
	//   21   37:aload_0         
	//   22   38:getfield        #107 <Field au mClickAnimation>
	//   23   41:astore_1        
		if(obj != null)
	//*  24   42:aload_1         
	//*  25   43:ifnull          55
		{
			((au) (obj)).b();
	//   26   46:aload_1         
	//   27   47:invokevirtual   #112 <Method void au.b()>
			mClickAnimation = null;
	//   28   50:aload_0         
	//   29   51:aconst_null     
	//   30   52:putfield        #107 <Field au mClickAnimation>
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
	//    5    5:invokevirtual   #118 <Method long getItemIdAtPosition(int)>
	//    6    8:invokevirtual   #122 <Method boolean performItemClick(View, int, long)>
	//    7   11:pop             
	//    8   12:return          
	}

	private void drawSelectorCompat(Canvas canvas)
	{
		if(!mSelectorRect.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field Rect mSelectorRect>
	//*   2    4:invokevirtual   #128 <Method boolean Rect.isEmpty()>
	//*   3    7:ifne            32
		{
			Drawable drawable = getSelector();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #132 <Method Drawable getSelector()>
	//    6   14:astore_2        
			if(drawable != null)
	//*   7   15:aload_2         
	//*   8   16:ifnull          32
			{
				drawable.setBounds(mSelectorRect);
	//    9   19:aload_2         
	//   10   20:aload_0         
	//   11   21:getfield        #48  <Field Rect mSelectorRect>
	//   12   24:invokevirtual   #138 <Method void Drawable.setBounds(Rect)>
				drawable.draw(canvas);
	//   13   27:aload_2         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #141 <Method void Drawable.draw(Canvas)>
			}
		}
	//   16   32:return          
	}

	private void positionSelectorCompat(int i, View view)
	{
		Rect rect = mSelectorRect;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Rect mSelectorRect>
	//    2    4:astore          4
		rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
	//    3    6:aload           4
	//    4    8:aload_2         
	//    5    9:invokevirtual   #148 <Method int View.getLeft()>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #151 <Method int View.getTop()>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #154 <Method int View.getRight()>
	//   10   20:aload_2         
	//   11   21:invokevirtual   #157 <Method int View.getBottom()>
	//   12   24:invokevirtual   #161 <Method void Rect.set(int, int, int, int)>
		rect.left = rect.left - mSelectionLeftPadding;
	//   13   27:aload           4
	//   14   29:aload           4
	//   15   31:getfield        #164 <Field int Rect.left>
	//   16   34:aload_0         
	//   17   35:getfield        #50  <Field int mSelectionLeftPadding>
	//   18   38:isub            
	//   19   39:putfield        #164 <Field int Rect.left>
		rect.top = rect.top - mSelectionTopPadding;
	//   20   42:aload           4
	//   21   44:aload           4
	//   22   46:getfield        #167 <Field int Rect.top>
	//   23   49:aload_0         
	//   24   50:getfield        #52  <Field int mSelectionTopPadding>
	//   25   53:isub            
	//   26   54:putfield        #167 <Field int Rect.top>
		rect.right = rect.right + mSelectionRightPadding;
	//   27   57:aload           4
	//   28   59:aload           4
	//   29   61:getfield        #170 <Field int Rect.right>
	//   30   64:aload_0         
	//   31   65:getfield        #54  <Field int mSelectionRightPadding>
	//   32   68:iadd            
	//   33   69:putfield        #170 <Field int Rect.right>
		rect.bottom = rect.bottom + mSelectionBottomPadding;
	//   34   72:aload           4
	//   35   74:aload           4
	//   36   76:getfield        #173 <Field int Rect.bottom>
	//   37   79:aload_0         
	//   38   80:getfield        #56  <Field int mSelectionBottomPadding>
	//   39   83:iadd            
	//   40   84:putfield        #173 <Field int Rect.bottom>
		boolean flag;
		flag = mIsChildViewEnabled.getBoolean(((Object) (this)));
	//   41   87:aload_0         
	//   42   88:getfield        #73  <Field Field mIsChildViewEnabled>
	//   43   91:aload_0         
	//   44   92:invokevirtual   #177 <Method boolean Field.getBoolean(Object)>
	//   45   95:istore_3        
		if(view.isEnabled() == flag)
			break MISSING_BLOCK_LABEL_142;
	//   46   96:aload_2         
	//   47   97:invokevirtual   #180 <Method boolean View.isEnabled()>
	//   48  100:iload_3         
	//   49  101:icmpeq          142
		view = ((View) (mIsChildViewEnabled));
	//   50  104:aload_0         
	//   51  105:getfield        #73  <Field Field mIsChildViewEnabled>
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
	//*  61  121:invokestatic    #186 <Method Boolean Boolean.valueOf(boolean)>
	//*  62  124:invokevirtual   #189 <Method void Field.set(Object, Object)>
	//*  63  127:iload_1         
	//*  64  128:iconst_m1       
	//*  65  129:icmpeq          142
	//*  66  132:aload_0         
	//*  67  133:invokevirtual   #192 <Method void refreshDrawableState()>
	//*  68  136:return          
	//*  69  137:astore_2        
	//*  70  138:aload_2         
	//*  71  139:invokevirtual   #193 <Method void IllegalAccessException.printStackTrace()>
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
	//    1    1:invokevirtual   #132 <Method Drawable getSelector()>
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
	//   20   37:invokevirtual   #198 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   21   40:pop             
		positionSelectorCompat(i, view);
	//   22   41:aload_0         
	//   23   42:iload_1         
	//   24   43:aload_2         
	//   25   44:invokespecial   #200 <Method void positionSelectorCompat(int, View)>
		if(flag)
	//*  26   47:iload           5
	//*  27   49:ifeq            98
		{
			view = ((View) (mSelectorRect));
	//   28   52:aload_0         
	//   29   53:getfield        #48  <Field Rect mSelectorRect>
	//   30   56:astore_2        
			float f = ((Rect) (view)).exactCenterX();
	//   31   57:aload_2         
	//   32   58:invokevirtual   #204 <Method float Rect.exactCenterX()>
	//   33   61:fstore_3        
			float f1 = ((Rect) (view)).exactCenterY();
	//   34   62:aload_2         
	//   35   63:invokevirtual   #207 <Method float Rect.exactCenterY()>
	//   36   66:fstore          4
			if(getVisibility() != 0)
	//*  37   68:aload_0         
	//*  38   69:invokevirtual   #210 <Method int getVisibility()>
	//*  39   72:ifne            78
	//*  40   75:goto            81
				flag1 = false;
	//   41   78:iconst_0        
	//   42   79:istore          6
			drawable.setVisible(flag1, false);
	//   43   81:aload           7
	//   44   83:iload           6
	//   45   85:iconst_0        
	//   46   86:invokevirtual   #198 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   47   89:pop             
			a.a(drawable, f, f1);
	//   48   90:aload           7
	//   49   92:fload_3         
	//   50   93:fload           4
	//   51   95:invokestatic    #216 <Method void a.a(Drawable, float, float)>
		}
	//   52   98:return          
	}

	private void positionSelectorLikeTouchCompat(int i, View view, float f, float f1)
	{
		positionSelectorLikeFocusCompat(i, view);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #220 <Method void positionSelectorLikeFocusCompat(int, View)>
		view = ((View) (getSelector()));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #132 <Method Drawable getSelector()>
	//    6   10:astore_2        
		if(view != null && i != -1)
	//*   7   11:aload_2         
	//*   8   12:ifnull          27
	//*   9   15:iload_1         
	//*  10   16:iconst_m1       
	//*  11   17:icmpeq          27
			a.a(((Drawable) (view)), f, f1);
	//   12   20:aload_2         
	//   13   21:fload_3         
	//   14   22:fload           4
	//   15   24:invokestatic    #216 <Method void a.a(Drawable, float, float)>
	//   16   27:return          
	}

	private void setPressedItem(View view, int i, float f, float f1)
	{
		mDrawsInPressedState = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #86  <Field boolean mDrawsInPressedState>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   3    5:getstatic       #227 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          21
	//*   5   10:icmplt          20
			drawableHotspotChanged(f, f1);
	//    6   13:aload_0         
	//    7   14:fload_3         
	//    8   15:fload           4
	//    9   17:invokevirtual   #231 <Method void drawableHotspotChanged(float, float)>
		if(!isPressed())
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #234 <Method boolean isPressed()>
	//*  12   24:ifne            32
			setPressed(true);
	//   13   27:aload_0         
	//   14   28:iconst_1        
	//   15   29:invokevirtual   #89  <Method void setPressed(boolean)>
		layoutChildren();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #237 <Method void layoutChildren()>
		int j = mMotionPosition;
	//   18   36:aload_0         
	//   19   37:getfield        #94  <Field int mMotionPosition>
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
	//   27   52:invokevirtual   #98  <Method int getFirstVisiblePosition()>
	//   28   55:isub            
	//   29   56:invokevirtual   #102 <Method View getChildAt(int)>
	//   30   59:astore          8
			if(view1 != null && view1 != view && view1.isPressed())
	//*  31   61:aload           8
	//*  32   63:ifnull          86
	//*  33   66:aload           8
	//*  34   68:aload_1         
	//*  35   69:if_acmpeq       86
	//*  36   72:aload           8
	//*  37   74:invokevirtual   #238 <Method boolean View.isPressed()>
	//*  38   77:ifeq            86
				view1.setPressed(false);
	//   39   80:aload           8
	//   40   82:iconst_0        
	//   41   83:invokevirtual   #105 <Method void View.setPressed(boolean)>
		}
		mMotionPosition = i;
	//   42   86:aload_0         
	//   43   87:iload_2         
	//   44   88:putfield        #94  <Field int mMotionPosition>
		float f2 = view.getLeft();
	//   45   91:aload_1         
	//   46   92:invokevirtual   #148 <Method int View.getLeft()>
	//   47   95:i2f             
	//   48   96:fstore          5
		float f3 = view.getTop();
	//   49   98:aload_1         
	//   50   99:invokevirtual   #151 <Method int View.getTop()>
	//   51  102:i2f             
	//   52  103:fstore          6
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  53  105:getstatic       #227 <Field int android.os.Build$VERSION.SDK_INT>
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
	//   63  123:invokevirtual   #239 <Method void View.drawableHotspotChanged(float, float)>
		if(!view.isPressed())
	//*  64  126:aload_1         
	//*  65  127:invokevirtual   #238 <Method boolean View.isPressed()>
	//*  66  130:ifne            138
			view.setPressed(true);
	//   67  133:aload_1         
	//   68  134:iconst_1        
	//   69  135:invokevirtual   #105 <Method void View.setPressed(boolean)>
		positionSelectorLikeTouchCompat(i, view, f, f1);
	//   70  138:aload_0         
	//   71  139:iload_2         
	//   72  140:aload_1         
	//   73  141:fload_3         
	//   74  142:fload           4
	//   75  144:invokespecial   #241 <Method void positionSelectorLikeTouchCompat(int, View, float, float)>
		setSelectorEnabled(false);
	//   76  147:aload_0         
	//   77  148:iconst_0        
	//   78  149:invokespecial   #244 <Method void setSelectorEnabled(boolean)>
		refreshDrawableState();
	//   79  152:aload_0         
	//   80  153:invokevirtual   #192 <Method void refreshDrawableState()>
	//   81  156:return          
	}

	private void setSelectorEnabled(boolean flag)
	{
		GateKeeperDrawable gatekeeperdrawable = mSelector;
	//    0    0:aload_0         
	//    1    1:getfield        #246 <Field DropDownListView$GateKeeperDrawable mSelector>
	//    2    4:astore_2        
		if(gatekeeperdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			gatekeeperdrawable.setEnabled(flag);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #251 <Method void DropDownListView$GateKeeperDrawable.setEnabled(boolean)>
	//    8   14:return          
	}

	private boolean touchModeDrawsInPressedStateCompat()
	{
		return mDrawsInPressedState;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field boolean mDrawsInPressedState>
	//    2    4:ireturn         
	}

	private void updateSelectorStateCompat()
	{
		Drawable drawable = getSelector();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #132 <Method Drawable getSelector()>
	//    2    4:astore_1        
		if(drawable != null && touchModeDrawsInPressedStateCompat() && isPressed())
	//*   3    5:aload_1         
	//*   4    6:ifnull          32
	//*   5    9:aload_0         
	//*   6   10:invokespecial   #255 <Method boolean touchModeDrawsInPressedStateCompat()>
	//*   7   13:ifeq            32
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #234 <Method boolean isPressed()>
	//*  10   20:ifeq            32
			drawable.setState(getDrawableState());
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:invokevirtual   #259 <Method int[] getDrawableState()>
	//   14   28:invokevirtual   #263 <Method boolean Drawable.setState(int[])>
	//   15   31:pop             
	//   16   32:return          
	}

	protected void dispatchDraw(Canvas canvas)
	{
		drawSelectorCompat(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #266 <Method void drawSelectorCompat(Canvas)>
		super.dispatchDraw(canvas);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #268 <Method void ListView.dispatchDraw(Canvas)>
	//    6   10:return          
	}

	protected void drawableStateChanged()
	{
		if(mResolveHoverRunnable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #270 <Field DropDownListView$ResolveHoverRunnable mResolveHoverRunnable>
	//*   2    4:ifnull          8
		{
			return;
	//    3    7:return          
		} else
		{
			super.drawableStateChanged();
	//    4    8:aload_0         
	//    5    9:invokespecial   #271 <Method void ListView.drawableStateChanged()>
			setSelectorEnabled(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokespecial   #244 <Method void setSelectorEnabled(boolean)>
			updateSelectorStateCompat();
	//    9   17:aload_0         
	//   10   18:invokespecial   #273 <Method void updateSelectorStateCompat()>
			return;
	//   11   21:return          
		}
	}

	public boolean hasFocus()
	{
		return mHijackFocus || super.hasFocus();
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field boolean mHijackFocus>
	//    2    4:ifne            19
	//    3    7:aload_0         
	//    4    8:invokespecial   #276 <Method boolean ListView.hasFocus()>
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
	//    1    1:getfield        #58  <Field boolean mHijackFocus>
	//    2    4:ifne            19
	//    3    7:aload_0         
	//    4    8:invokespecial   #279 <Method boolean ListView.hasWindowFocus()>
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
	//    1    1:getfield        #58  <Field boolean mHijackFocus>
	//    2    4:ifne            19
	//    3    7:aload_0         
	//    4    8:invokespecial   #282 <Method boolean ListView.isFocused()>
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
	//    1    1:getfield        #58  <Field boolean mHijackFocus>
	//    2    4:ifeq            14
	//    3    7:aload_0         
	//    4    8:getfield        #285 <Field boolean mListSelectionHidden>
	//    5   11:ifne            21
	//    6   14:aload_0         
	//    7   15:invokespecial   #287 <Method boolean ListView.isInTouchMode()>
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
	//    1    1:invokevirtual   #293 <Method ListAdapter getAdapter()>
	//    2    4:astore          5
		if(listadapter != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          146
		{
			if(isInTouchMode())
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #294 <Method boolean isInTouchMode()>
	//*   7   15:ifeq            20
				return -1;
	//    8   18:iconst_m1       
	//    9   19:ireturn         
			int k = listadapter.getCount();
	//   10   20:aload           5
	//   11   22:invokeinterface #299 <Method int ListAdapter.getCount()>
	//   12   27:istore          4
			if(!getAdapter().areAllItemsEnabled())
	//*  13   29:aload_0         
	//*  14   30:invokevirtual   #293 <Method ListAdapter getAdapter()>
	//*  15   33:invokeinterface #302 <Method boolean ListAdapter.areAllItemsEnabled()>
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
	//   21   47:invokestatic    #308 <Method int Math.max(int, int)>
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
	//   32   64:invokeinterface #311 <Method boolean ListAdapter.isEnabled(int)>
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
	//   43   84:invokestatic    #314 <Method int Math.min(int, int)>
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
	//   53   99:invokeinterface #311 <Method boolean ListAdapter.isEnabled(int)>
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
	//    1    1:invokevirtual   #319 <Method int getListPaddingTop()>
	//    2    4:istore_2        
		k = getListPaddingBottom();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #322 <Method int getListPaddingBottom()>
	//    5    9:istore_3        
		getListPaddingLeft();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #325 <Method int getListPaddingLeft()>
	//    8   14:pop             
		getListPaddingRight();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #328 <Method int getListPaddingRight()>
	//   11   19:pop             
		int j1 = getDividerHeight();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #331 <Method int getDividerHeight()>
	//   14   24:istore          6
		Object obj = ((Object) (getDivider()));
	//   15   26:aload_0         
	//   16   27:invokevirtual   #334 <Method Drawable getDivider()>
	//   17   30:astore          12
		ListAdapter listadapter = getAdapter();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #293 <Method ListAdapter getAdapter()>
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
		int k2 = listadapter.getCount();
	//   34   63:aload           15
	//   35   65:invokeinterface #299 <Method int ListAdapter.getCount()>
	//   36   70:istore          11
		k = j + k;
	//   37   72:iload_2         
	//   38   73:iload_3         
	//   39   74:iadd            
	//   40   75:istore_3        
		obj = null;
	//   41   76:aconst_null     
	//   42   77:astore          12
		int k1 = 0;
	//   43   79:iconst_0        
	//   44   80:istore          7
		int i2 = 0;
	//   45   82:iconst_0        
	//   46   83:istore          9
		int j2;
		for(j = 0; k1 < k2; j = j2)
	//*  47   85:iconst_0        
	//*  48   86:istore_2        
	//*  49   87:iload           7
	//*  50   89:iload           11
	//*  51   91:icmpge          318
		{
			j2 = listadapter.getItemViewType(k1);
	//   52   94:aload           15
	//   53   96:iload           7
	//   54   98:invokeinterface #338 <Method int ListAdapter.getItemViewType(int)>
	//   55  103:istore          10
			int l1 = i2;
	//   56  105:iload           9
	//   57  107:istore          8
			if(j2 != i2)
	//*  58  109:iload           10
	//*  59  111:iload           9
	//*  60  113:icmpeq          123
			{
				obj = null;
	//   61  116:aconst_null     
	//   62  117:astore          12
				l1 = j2;
	//   63  119:iload           10
	//   64  121:istore          8
			}
			View view = listadapter.getView(k1, ((View) (obj)), ((android.view.ViewGroup) (this)));
	//   65  123:aload           15
	//   66  125:iload           7
	//   67  127:aload           12
	//   68  129:aload_0         
	//   69  130:invokeinterface #342 <Method View ListAdapter.getView(int, View, android.view.ViewGroup)>
	//   70  135:astore          13
			android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
	//   71  137:aload           13
	//   72  139:invokevirtual   #346 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   73  142:astore          14
			obj = ((Object) (layoutparams));
	//   74  144:aload           14
	//   75  146:astore          12
			if(layoutparams == null)
	//*  76  148:aload           14
	//*  77  150:ifnonnull       166
			{
				obj = ((Object) (generateDefaultLayoutParams()));
	//   78  153:aload_0         
	//   79  154:invokevirtual   #349 <Method android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()>
	//   80  157:astore          12
				view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
	//   81  159:aload           13
	//   82  161:aload           12
	//   83  163:invokevirtual   #353 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			}
			if(((android.view.ViewGroup.LayoutParams) (obj)).height > 0)
	//*  84  166:aload           12
	//*  85  168:getfield        #358 <Field int android.view.ViewGroup$LayoutParams.height>
	//*  86  171:ifle            190
				i2 = android.view.View.MeasureSpec.makeMeasureSpec(((android.view.ViewGroup.LayoutParams) (obj)).height, 0x40000000);
	//   87  174:aload           12
	//   88  176:getfield        #358 <Field int android.view.ViewGroup$LayoutParams.height>
	//   89  179:ldc2            #359 <Int 0x40000000>
	//   90  182:invokestatic    #364 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   91  185:istore          9
			else
	//*  92  187:goto            197
				i2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//   93  190:iconst_0        
	//   94  191:iconst_0        
	//   95  192:invokestatic    #364 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   96  195:istore          9
			view.measure(i, i2);
	//   97  197:aload           13
	//   98  199:iload_1         
	//   99  200:iload           9
	//  100  202:invokevirtual   #368 <Method void View.measure(int, int)>
			view.forceLayout();
	//  101  205:aload           13
	//  102  207:invokevirtual   #371 <Method void View.forceLayout()>
			i2 = k;
	//  103  210:iload_3         
	//  104  211:istore          9
			if(k1 > 0)
	//* 105  213:iload           7
	//* 106  215:ifle            224
				i2 = k + j1;
	//  107  218:iload_3         
	//  108  219:iload           6
	//  109  221:iadd            
	//  110  222:istore          9
			k = i2 + view.getMeasuredHeight();
	//  111  224:iload           9
	//  112  226:aload           13
	//  113  228:invokevirtual   #374 <Method int View.getMeasuredHeight()>
	//  114  231:iadd            
	//  115  232:istore_3        
			if(k >= l)
	//* 116  233:iload_3         
	//* 117  234:iload           4
	//* 118  236:icmplt          277
			{
				i = l;
	//  119  239:iload           4
	//  120  241:istore_1        
				if(i1 >= 0)
	//* 121  242:iload           5
	//* 122  244:iflt            275
				{
					i = l;
	//  123  247:iload           4
	//  124  249:istore_1        
					if(k1 > i1)
	//* 125  250:iload           7
	//* 126  252:iload           5
	//* 127  254:icmple          275
					{
						i = l;
	//  128  257:iload           4
	//  129  259:istore_1        
						if(j > 0)
	//* 130  260:iload_2         
	//* 131  261:ifle            275
						{
							i = l;
	//  132  264:iload           4
	//  133  266:istore_1        
							if(k != l)
	//* 134  267:iload_3         
	//* 135  268:iload           4
	//* 136  270:icmpeq          275
								i = j;
	//  137  273:iload_2         
	//  138  274:istore_1        
						}
					}
				}
				return i;
	//  139  275:iload_1         
	//  140  276:ireturn         
			}
			j2 = j;
	//  141  277:iload_2         
	//  142  278:istore          10
			if(i1 >= 0)
	//* 143  280:iload           5
	//* 144  282:iflt            298
			{
				j2 = j;
	//  145  285:iload_2         
	//  146  286:istore          10
				if(k1 >= i1)
	//* 147  288:iload           7
	//* 148  290:iload           5
	//* 149  292:icmplt          298
					j2 = k;
	//  150  295:iload_3         
	//  151  296:istore          10
			}
			k1++;
	//  152  298:iload           7
	//  153  300:iconst_1        
	//  154  301:iadd            
	//  155  302:istore          7
			i2 = l1;
	//  156  304:iload           8
	//  157  306:istore          9
			obj = ((Object) (view));
	//  158  308:aload           13
	//  159  310:astore          12
		}

	//  160  312:iload           10
	//  161  314:istore_2        
	//* 162  315:goto            87
		return k;
	//  163  318:iload_3         
	//  164  319:ireturn         
	}

	protected void onDetachedFromWindow()
	{
		mResolveHoverRunnable = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #270 <Field DropDownListView$ResolveHoverRunnable mResolveHoverRunnable>
		super.onDetachedFromWindow();
	//    3    5:aload_0         
	//    4    6:invokespecial   #377 <Method void ListView.onDetachedFromWindow()>
	//    5    9:return          
	}

	public boolean onForwardedEvent(MotionEvent motionevent, int i)
	{
		boolean flag;
label0:
		{
			int j = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #384 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore_3        
			switch(j)
	//*   3    5:iload_3         
			{
	//*   4    6:tableswitch     1 3: default 32
	//	               1 54
	//	               2 48
	//	               3 40
			default:
				i = 0;
	//    5   32:iconst_0        
	//    6   33:istore_2        
				flag = true;
	//    7   34:iconst_1        
	//    8   35:istore          6
				break label0;
	//    9   37:goto            158

			case 3: // '\003'
				i = 0;
	//   10   40:iconst_0        
	//   11   41:istore_2        
				flag = false;
	//   12   42:iconst_0        
	//   13   43:istore          6
				break label0;
	//   14   45:goto            158

			case 2: // '\002'
				flag = true;
	//   15   48:iconst_1        
	//   16   49:istore          6
				break;
	//   17   51:goto            57

			case 1: // '\001'
				flag = false;
	//   18   54:iconst_0        
	//   19   55:istore          6
				break;
			}
			int k = motionevent.findPointerIndex(i);
	//   20   57:aload_1         
	//   21   58:iload_2         
	//   22   59:invokevirtual   #387 <Method int MotionEvent.findPointerIndex(int)>
	//   23   62:istore          4
			if(k < 0)
	//*  24   64:iload           4
	//*  25   66:ifge            77
			{
				i = 0;
	//   26   69:iconst_0        
	//   27   70:istore_2        
				flag = false;
	//   28   71:iconst_0        
	//   29   72:istore          6
			} else
	//*  30   74:goto            158
			{
				i = (int)motionevent.getX(k);
	//   31   77:aload_1         
	//   32   78:iload           4
	//   33   80:invokevirtual   #391 <Method float MotionEvent.getX(int)>
	//   34   83:f2i             
	//   35   84:istore_2        
				k = (int)motionevent.getY(k);
	//   36   85:aload_1         
	//   37   86:iload           4
	//   38   88:invokevirtual   #394 <Method float MotionEvent.getY(int)>
	//   39   91:f2i             
	//   40   92:istore          4
				int l = pointToPosition(i, k);
	//   41   94:aload_0         
	//   42   95:iload_2         
	//   43   96:iload           4
	//   44   98:invokevirtual   #397 <Method int pointToPosition(int, int)>
	//   45  101:istore          5
				if(l == -1)
	//*  46  103:iload           5
	//*  47  105:iconst_m1       
	//*  48  106:icmpne          114
				{
					i = 1;
	//   49  109:iconst_1        
	//   50  110:istore_2        
				} else
	//*  51  111:goto            158
				{
					View view = getChildAt(l - getFirstVisiblePosition());
	//   52  114:aload_0         
	//   53  115:iload           5
	//   54  117:aload_0         
	//   55  118:invokevirtual   #98  <Method int getFirstVisiblePosition()>
	//   56  121:isub            
	//   57  122:invokevirtual   #102 <Method View getChildAt(int)>
	//   58  125:astore          7
					setPressedItem(view, l, i, k);
	//   59  127:aload_0         
	//   60  128:aload           7
	//   61  130:iload           5
	//   62  132:iload_2         
	//   63  133:i2f             
	//   64  134:iload           4
	//   65  136:i2f             
	//   66  137:invokespecial   #399 <Method void setPressedItem(View, int, float, float)>
					if(j == 1)
	//*  67  140:iload_3         
	//*  68  141:iconst_1        
	//*  69  142:icmpne          153
						clickPressedItem(view, l);
	//   70  145:aload_0         
	//   71  146:aload           7
	//   72  148:iload           5
	//   73  150:invokespecial   #401 <Method void clickPressedItem(View, int)>
					i = 0;
	//   74  153:iconst_0        
	//   75  154:istore_2        
					flag = true;
	//   76  155:iconst_1        
	//   77  156:istore          6
				}
			}
		}
		if(!flag || i != 0)
	//*  78  158:iload           6
	//*  79  160:ifeq            167
	//*  80  163:iload_2         
	//*  81  164:ifeq            171
			clearPressedItem();
	//   82  167:aload_0         
	//   83  168:invokespecial   #403 <Method void clearPressedItem()>
		if(flag)
	//*  84  171:iload           6
	//*  85  173:ifeq            217
		{
			if(mScrollHelper == null)
	//*  86  176:aload_0         
	//*  87  177:getfield        #405 <Field s mScrollHelper>
	//*  88  180:ifnonnull       195
				mScrollHelper = new s(((ListView) (this)));
	//   89  183:aload_0         
	//   90  184:new             #407 <Class s>
	//   91  187:dup             
	//   92  188:aload_0         
	//   93  189:invokespecial   #410 <Method void s(ListView)>
	//   94  192:putfield        #405 <Field s mScrollHelper>
			mScrollHelper.a(true);
	//   95  195:aload_0         
	//   96  196:getfield        #405 <Field s mScrollHelper>
	//   97  199:iconst_1        
	//   98  200:invokevirtual   #413 <Method android.support.v4.widget.a s.a(boolean)>
	//   99  203:pop             
			mScrollHelper.onTouch(((View) (this)), motionevent);
	//  100  204:aload_0         
	//  101  205:getfield        #405 <Field s mScrollHelper>
	//  102  208:aload_0         
	//  103  209:aload_1         
	//  104  210:invokevirtual   #417 <Method boolean s.onTouch(View, MotionEvent)>
	//  105  213:pop             
			return flag;
	//  106  214:iload           6
	//  107  216:ireturn         
		}
		motionevent = ((MotionEvent) (mScrollHelper));
	//  108  217:aload_0         
	//  109  218:getfield        #405 <Field s mScrollHelper>
	//  110  221:astore_1        
		if(motionevent != null)
	//* 111  222:aload_1         
	//* 112  223:ifnull          232
			((s) (motionevent)).a(false);
	//  113  226:aload_1         
	//  114  227:iconst_0        
	//  115  228:invokevirtual   #413 <Method android.support.v4.widget.a s.a(boolean)>
	//  116  231:pop             
		return flag;
	//  117  232:iload           6
	//  118  234:ireturn         
	}

	public boolean onHoverEvent(MotionEvent motionevent)
	{
		if(android.os.Build.VERSION.SDK_INT < 26)
	//*   0    0:getstatic       #227 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmpge          14
			return super.onHoverEvent(motionevent);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokespecial   #421 <Method boolean ListView.onHoverEvent(MotionEvent)>
	//    6   13:ireturn         
		int i = motionevent.getActionMasked();
	//    7   14:aload_1         
	//    8   15:invokevirtual   #384 <Method int MotionEvent.getActionMasked()>
	//    9   18:istore_2        
		if(i == 10 && mResolveHoverRunnable == null)
	//*  10   19:iload_2         
	//*  11   20:bipush          10
	//*  12   22:icmpne          51
	//*  13   25:aload_0         
	//*  14   26:getfield        #270 <Field DropDownListView$ResolveHoverRunnable mResolveHoverRunnable>
	//*  15   29:ifnonnull       51
		{
			mResolveHoverRunnable = new ResolveHoverRunnable();
	//   16   32:aload_0         
	//   17   33:new             #423 <Class DropDownListView$ResolveHoverRunnable>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:invokespecial   #426 <Method void DropDownListView$ResolveHoverRunnable(DropDownListView)>
	//   21   41:putfield        #270 <Field DropDownListView$ResolveHoverRunnable mResolveHoverRunnable>
			mResolveHoverRunnable.post();
	//   22   44:aload_0         
	//   23   45:getfield        #270 <Field DropDownListView$ResolveHoverRunnable mResolveHoverRunnable>
	//   24   48:invokevirtual   #429 <Method void DropDownListView$ResolveHoverRunnable.post()>
		}
		boolean flag = super.onHoverEvent(motionevent);
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:invokespecial   #421 <Method boolean ListView.onHoverEvent(MotionEvent)>
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
	//   38   74:invokevirtual   #432 <Method void setSelection(int)>
			return flag;
	//   39   77:iload_3         
	//   40   78:ireturn         
		}
		i = pointToPosition((int)motionevent.getX(), (int)motionevent.getY());
	//   41   79:aload_0         
	//   42   80:aload_1         
	//   43   81:invokevirtual   #434 <Method float MotionEvent.getX()>
	//   44   84:f2i             
	//   45   85:aload_1         
	//   46   86:invokevirtual   #436 <Method float MotionEvent.getY()>
	//   47   89:f2i             
	//   48   90:invokevirtual   #397 <Method int pointToPosition(int, int)>
	//   49   93:istore_2        
		if(i != -1 && i != getSelectedItemPosition())
	//*  50   94:iload_2         
	//*  51   95:iconst_m1       
	//*  52   96:icmpeq          143
	//*  53   99:iload_2         
	//*  54  100:aload_0         
	//*  55  101:invokevirtual   #439 <Method int getSelectedItemPosition()>
	//*  56  104:icmpeq          143
		{
			motionevent = ((MotionEvent) (getChildAt(i - getFirstVisiblePosition())));
	//   57  107:aload_0         
	//   58  108:iload_2         
	//   59  109:aload_0         
	//   60  110:invokevirtual   #98  <Method int getFirstVisiblePosition()>
	//   61  113:isub            
	//   62  114:invokevirtual   #102 <Method View getChildAt(int)>
	//   63  117:astore_1        
			if(((View) (motionevent)).isEnabled())
	//*  64  118:aload_1         
	//*  65  119:invokevirtual   #180 <Method boolean View.isEnabled()>
	//*  66  122:ifeq            139
				setSelectionFromTop(i, ((View) (motionevent)).getTop() - getTop());
	//   67  125:aload_0         
	//   68  126:iload_2         
	//   69  127:aload_1         
	//   70  128:invokevirtual   #151 <Method int View.getTop()>
	//   71  131:aload_0         
	//   72  132:invokevirtual   #440 <Method int getTop()>
	//   73  135:isub            
	//   74  136:invokevirtual   #443 <Method void setSelectionFromTop(int, int)>
			updateSelectorStateCompat();
	//   75  139:aload_0         
	//   76  140:invokespecial   #273 <Method void updateSelectorStateCompat()>
		}
		return flag;
	//   77  143:iload_3         
	//   78  144:ireturn         
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(motionevent.getAction() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #447 <Method int MotionEvent.getAction()>
	//*   2    4:ifeq            10
	//*   3    7:goto            28
			mMotionPosition = pointToPosition((int)motionevent.getX(), (int)motionevent.getY());
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #434 <Method float MotionEvent.getX()>
	//    8   16:f2i             
	//    9   17:aload_1         
	//   10   18:invokevirtual   #436 <Method float MotionEvent.getY()>
	//   11   21:f2i             
	//   12   22:invokevirtual   #397 <Method int pointToPosition(int, int)>
	//   13   25:putfield        #94  <Field int mMotionPosition>
		ResolveHoverRunnable resolvehoverrunnable = mResolveHoverRunnable;
	//   14   28:aload_0         
	//   15   29:getfield        #270 <Field DropDownListView$ResolveHoverRunnable mResolveHoverRunnable>
	//   16   32:astore_2        
		if(resolvehoverrunnable != null)
	//*  17   33:aload_2         
	//*  18   34:ifnull          41
			resolvehoverrunnable.cancel();
	//   19   37:aload_2         
	//   20   38:invokevirtual   #450 <Method void DropDownListView$ResolveHoverRunnable.cancel()>
		return super.onTouchEvent(motionevent);
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:invokespecial   #452 <Method boolean ListView.onTouchEvent(MotionEvent)>
	//   24   46:ireturn         
	}

	void setListSelectionHidden(boolean flag)
	{
		mListSelectionHidden = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #285 <Field boolean mListSelectionHidden>
	//    3    5:return          
	}

	public void setSelector(Drawable drawable)
	{
		Object obj;
		if(drawable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          16
			obj = ((Object) (new GateKeeperDrawable(drawable)));
	//    2    4:new             #248 <Class DropDownListView$GateKeeperDrawable>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #457 <Method void DropDownListView$GateKeeperDrawable(Drawable)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			obj = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		mSelector = ((GateKeeperDrawable) (obj));
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:putfield        #246 <Field DropDownListView$GateKeeperDrawable mSelector>
		super.setSelector(((Drawable) (mSelector)));
	//   13   23:aload_0         
	//   14   24:aload_0         
	//   15   25:getfield        #246 <Field DropDownListView$GateKeeperDrawable mSelector>
	//   16   28:invokespecial   #459 <Method void ListView.setSelector(Drawable)>
		obj = ((Object) (new Rect()));
	//   17   31:new             #43  <Class Rect>
	//   18   34:dup             
	//   19   35:invokespecial   #46  <Method void Rect()>
	//   20   38:astore_2        
		if(drawable != null)
	//*  21   39:aload_1         
	//*  22   40:ifnull          49
			drawable.getPadding(((Rect) (obj)));
	//   23   43:aload_1         
	//   24   44:aload_2         
	//   25   45:invokevirtual   #463 <Method boolean Drawable.getPadding(Rect)>
	//   26   48:pop             
		mSelectionLeftPadding = ((Rect) (obj)).left;
	//   27   49:aload_0         
	//   28   50:aload_2         
	//   29   51:getfield        #164 <Field int Rect.left>
	//   30   54:putfield        #50  <Field int mSelectionLeftPadding>
		mSelectionTopPadding = ((Rect) (obj)).top;
	//   31   57:aload_0         
	//   32   58:aload_2         
	//   33   59:getfield        #167 <Field int Rect.top>
	//   34   62:putfield        #52  <Field int mSelectionTopPadding>
		mSelectionRightPadding = ((Rect) (obj)).right;
	//   35   65:aload_0         
	//   36   66:aload_2         
	//   37   67:getfield        #170 <Field int Rect.right>
	//   38   70:putfield        #54  <Field int mSelectionRightPadding>
		mSelectionBottomPadding = ((Rect) (obj)).bottom;
	//   39   73:aload_0         
	//   40   74:aload_2         
	//   41   75:getfield        #173 <Field int Rect.bottom>
	//   42   78:putfield        #56  <Field int mSelectionBottomPadding>
	//   43   81:return          
	}

	public static final int INVALID_POSITION = -1;
	public static final int NO_POSITION = -1;
	private au mClickAnimation;
	private boolean mDrawsInPressedState;
	private boolean mHijackFocus;
	private Field mIsChildViewEnabled;
	private boolean mListSelectionHidden;
	private int mMotionPosition;
	ResolveHoverRunnable mResolveHoverRunnable;
	private s mScrollHelper;
	private int mSelectionBottomPadding;
	private int mSelectionLeftPadding;
	private int mSelectionRightPadding;
	private int mSelectionTopPadding;
	private GateKeeperDrawable mSelector;
	private final Rect mSelectorRect = new Rect();

	private class GateKeeperDrawable extends DrawableWrapper
	{

		public void draw(Canvas canvas)
		{
			if(mEnabled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #12  <Field boolean mEnabled>
		//*   2    4:ifeq            12
				super.draw(canvas);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokespecial   #17  <Method void DrawableWrapper.draw(Canvas)>
		//    6   12:return          
		}

		void setEnabled(boolean flag)
		{
			mEnabled = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #12  <Field boolean mEnabled>
		//    3    5:return          
		}

		public void setHotspot(float f, float f1)
		{
			if(mEnabled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #12  <Field boolean mEnabled>
		//*   2    4:ifeq            13
				super.setHotspot(f, f1);
		//    3    7:aload_0         
		//    4    8:fload_1         
		//    5    9:fload_2         
		//    6   10:invokespecial   #23  <Method void DrawableWrapper.setHotspot(float, float)>
		//    7   13:return          
		}

		public void setHotspotBounds(int i, int j, int k, int l)
		{
			if(mEnabled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #12  <Field boolean mEnabled>
		//*   2    4:ifeq            16
				super.setHotspotBounds(i, j, k, l);
		//    3    7:aload_0         
		//    4    8:iload_1         
		//    5    9:iload_2         
		//    6   10:iload_3         
		//    7   11:iload           4
		//    8   13:invokespecial   #27  <Method void DrawableWrapper.setHotspotBounds(int, int, int, int)>
		//    9   16:return          
		}

		public boolean setState(int ai[])
		{
			if(mEnabled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #12  <Field boolean mEnabled>
		//*   2    4:ifeq            13
				return super.setState(ai);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokespecial   #31  <Method boolean DrawableWrapper.setState(int[])>
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
		//*   1    1:getfield        #12  <Field boolean mEnabled>
		//*   2    4:ifeq            14
				return super.setVisible(flag, flag1);
		//    3    7:aload_0         
		//    4    8:iload_1         
		//    5    9:iload_2         
		//    6   10:invokespecial   #35  <Method boolean DrawableWrapper.setVisible(boolean, boolean)>
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
		//    2    2:invokespecial   #10  <Method void DrawableWrapper(Drawable)>
			mEnabled = true;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #12  <Field boolean mEnabled>
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
		//    1    1:getfield        #12  <Field DropDownListView this$0>
		//    2    4:astore_1        
			dropdownlistview.mResolveHoverRunnable = null;
		//    3    5:aload_1         
		//    4    6:aconst_null     
		//    5    7:putfield        #23  <Field DropDownListView$ResolveHoverRunnable DropDownListView.mResolveHoverRunnable>
			dropdownlistview.removeCallbacks(((Runnable) (this)));
		//    6   10:aload_1         
		//    7   11:aload_0         
		//    8   12:invokevirtual   #27  <Method boolean DropDownListView.removeCallbacks(Runnable)>
		//    9   15:pop             
		//   10   16:return          
		}

		public void post()
		{
			DropDownListView.this.post(((Runnable) (this)));
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field DropDownListView this$0>
		//    2    4:aload_0         
		//    3    5:invokevirtual   #30  <Method boolean DropDownListView.post(Runnable)>
		//    4    8:pop             
		//    5    9:return          
		}

		public void run()
		{
			DropDownListView dropdownlistview = DropDownListView.this;
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field DropDownListView this$0>
		//    2    4:astore_1        
			dropdownlistview.mResolveHoverRunnable = null;
		//    3    5:aload_1         
		//    4    6:aconst_null     
		//    5    7:putfield        #23  <Field DropDownListView$ResolveHoverRunnable DropDownListView.mResolveHoverRunnable>
			dropdownlistview.drawableStateChanged();
		//    6   10:aload_1         
		//    7   11:invokevirtual   #34  <Method void DropDownListView.drawableStateChanged()>
		//    8   14:return          
		}

		final DropDownListView this$0;

		ResolveHoverRunnable()
		{
			this$0 = DropDownListView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field DropDownListView this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}

}
