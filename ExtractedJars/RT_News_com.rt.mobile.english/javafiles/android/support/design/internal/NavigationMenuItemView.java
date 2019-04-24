// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.*;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.widget.TooltipCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.*;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;

// Referenced classes of package android.support.design.internal:
//			ForegroundLinearLayout

public class NavigationMenuItemView extends ForegroundLinearLayout
	implements android.support.v7.view.menu.MenuView.ItemView
{

	public NavigationMenuItemView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #43  <Method void NavigationMenuItemView(Context, AttributeSet)>
	//    4    6:return          
	}

	public NavigationMenuItemView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #46  <Method void NavigationMenuItemView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public NavigationMenuItemView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #47  <Method void ForegroundLinearLayout(Context, AttributeSet, int)>
		mAccessibilityDelegate = ((AccessibilityDelegateCompat) (new AccessibilityDelegateCompat() {

			public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
			{
				super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #20  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
				accessibilitynodeinfocompat.setCheckable(mCheckable);
			//    4    6:aload_2         
			//    5    7:aload_0         
			//    6    8:getfield        #12  <Field NavigationMenuItemView this$0>
			//    7   11:getfield        #24  <Field boolean NavigationMenuItemView.mCheckable>
			//    8   14:invokevirtual   #30  <Method void AccessibilityNodeInfoCompat.setCheckable(boolean)>
			//    9   17:return          
			}

			final NavigationMenuItemView this$0;

			
			{
				this$0 = NavigationMenuItemView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field NavigationMenuItemView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void AccessibilityDelegateCompat()>
			//    5    9:return          
			}
		}
));
	//    5    7:aload_0         
	//    6    8:new             #8   <Class NavigationMenuItemView$1>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:invokespecial   #50  <Method void NavigationMenuItemView$1(NavigationMenuItemView)>
	//   10   16:putfield        #52  <Field AccessibilityDelegateCompat mAccessibilityDelegate>
		setOrientation(0);
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:invokevirtual   #56  <Method void setOrientation(int)>
		LayoutInflater.from(context).inflate(android.support.design.R.layout.design_navigation_menu_item, ((android.view.ViewGroup) (this)), true);
	//   14   24:aload_1         
	//   15   25:invokestatic    #62  <Method LayoutInflater LayoutInflater.from(Context)>
	//   16   28:getstatic       #67  <Field int android.support.design.R$layout.design_navigation_menu_item>
	//   17   31:aload_0         
	//   18   32:iconst_1        
	//   19   33:invokevirtual   #71  <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   20   36:pop             
		mIconSize = context.getResources().getDimensionPixelSize(android.support.design.R.dimen.design_navigation_icon_size);
	//   21   37:aload_0         
	//   22   38:aload_1         
	//   23   39:invokevirtual   #77  <Method Resources Context.getResources()>
	//   24   42:getstatic       #82  <Field int android.support.design.R$dimen.design_navigation_icon_size>
	//   25   45:invokevirtual   #88  <Method int Resources.getDimensionPixelSize(int)>
	//   26   48:putfield        #90  <Field int mIconSize>
		mTextView = (CheckedTextView)findViewById(android.support.design.R.id.design_menu_item_text);
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:getstatic       #95  <Field int android.support.design.R$id.design_menu_item_text>
	//   30   56:invokevirtual   #99  <Method View findViewById(int)>
	//   31   59:checkcast       #101 <Class CheckedTextView>
	//   32   62:putfield        #103 <Field CheckedTextView mTextView>
		mTextView.setDuplicateParentStateEnabled(true);
	//   33   65:aload_0         
	//   34   66:getfield        #103 <Field CheckedTextView mTextView>
	//   35   69:iconst_1        
	//   36   70:invokevirtual   #107 <Method void CheckedTextView.setDuplicateParentStateEnabled(boolean)>
		ViewCompat.setAccessibilityDelegate(((View) (mTextView)), mAccessibilityDelegate);
	//   37   73:aload_0         
	//   38   74:getfield        #103 <Field CheckedTextView mTextView>
	//   39   77:aload_0         
	//   40   78:getfield        #52  <Field AccessibilityDelegateCompat mAccessibilityDelegate>
	//   41   81:invokestatic    #113 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
	//   42   84:return          
	}

	private void adjustAppearance()
	{
		if(shouldExpandActionArea())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #118 <Method boolean shouldExpandActionArea()>
	//*   2    4:ifeq            48
		{
			mTextView.setVisibility(8);
	//    3    7:aload_0         
	//    4    8:getfield        #103 <Field CheckedTextView mTextView>
	//    5   11:bipush          8
	//    6   13:invokevirtual   #121 <Method void CheckedTextView.setVisibility(int)>
			if(mActionArea != null)
	//*   7   16:aload_0         
	//*   8   17:getfield        #123 <Field FrameLayout mActionArea>
	//*   9   20:ifnull          88
			{
				android.support.v7.widget.LinearLayoutCompat.LayoutParams layoutparams = (android.support.v7.widget.LinearLayoutCompat.LayoutParams)mActionArea.getLayoutParams();
	//   10   23:aload_0         
	//   11   24:getfield        #123 <Field FrameLayout mActionArea>
	//   12   27:invokevirtual   #129 <Method android.view.ViewGroup$LayoutParams FrameLayout.getLayoutParams()>
	//   13   30:checkcast       #131 <Class android.support.v7.widget.LinearLayoutCompat$LayoutParams>
	//   14   33:astore_1        
				layoutparams.width = -1;
	//   15   34:aload_1         
	//   16   35:iconst_m1       
	//   17   36:putfield        #134 <Field int android.support.v7.widget.LinearLayoutCompat$LayoutParams.width>
				mActionArea.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   18   39:aload_0         
	//   19   40:getfield        #123 <Field FrameLayout mActionArea>
	//   20   43:aload_1         
	//   21   44:invokevirtual   #138 <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
				return;
	//   22   47:return          
			}
		} else
		{
			mTextView.setVisibility(0);
	//   23   48:aload_0         
	//   24   49:getfield        #103 <Field CheckedTextView mTextView>
	//   25   52:iconst_0        
	//   26   53:invokevirtual   #121 <Method void CheckedTextView.setVisibility(int)>
			if(mActionArea != null)
	//*  27   56:aload_0         
	//*  28   57:getfield        #123 <Field FrameLayout mActionArea>
	//*  29   60:ifnull          88
			{
				android.support.v7.widget.LinearLayoutCompat.LayoutParams layoutparams1 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams)mActionArea.getLayoutParams();
	//   30   63:aload_0         
	//   31   64:getfield        #123 <Field FrameLayout mActionArea>
	//   32   67:invokevirtual   #129 <Method android.view.ViewGroup$LayoutParams FrameLayout.getLayoutParams()>
	//   33   70:checkcast       #131 <Class android.support.v7.widget.LinearLayoutCompat$LayoutParams>
	//   34   73:astore_1        
				layoutparams1.width = -2;
	//   35   74:aload_1         
	//   36   75:bipush          -2
	//   37   77:putfield        #134 <Field int android.support.v7.widget.LinearLayoutCompat$LayoutParams.width>
				mActionArea.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams1)));
	//   38   80:aload_0         
	//   39   81:getfield        #123 <Field FrameLayout mActionArea>
	//   40   84:aload_1         
	//   41   85:invokevirtual   #138 <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			}
		}
	//   42   88:return          
	}

	private StateListDrawable createDefaultBackground()
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #142 <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #144 <Method void TypedValue()>
	//    3    7:astore_1        
		if(getContext().getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.colorControlHighlight, typedvalue, true))
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #148 <Method Context getContext()>
	//*   6   12:invokevirtual   #152 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*   7   15:getstatic       #157 <Field int android.support.v7.appcompat.R$attr.colorControlHighlight>
	//*   8   18:aload_1         
	//*   9   19:iconst_1        
	//*  10   20:invokevirtual   #163 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  11   23:ifeq            69
		{
			StateListDrawable statelistdrawable = new StateListDrawable();
	//   12   26:new             #165 <Class StateListDrawable>
	//   13   29:dup             
	//   14   30:invokespecial   #166 <Method void StateListDrawable()>
	//   15   33:astore_2        
			statelistdrawable.addState(CHECKED_STATE_SET, ((Drawable) (new ColorDrawable(typedvalue.data))));
	//   16   34:aload_2         
	//   17   35:getstatic       #37  <Field int[] CHECKED_STATE_SET>
	//   18   38:new             #168 <Class ColorDrawable>
	//   19   41:dup             
	//   20   42:aload_1         
	//   21   43:getfield        #171 <Field int TypedValue.data>
	//   22   46:invokespecial   #173 <Method void ColorDrawable(int)>
	//   23   49:invokevirtual   #177 <Method void StateListDrawable.addState(int[], Drawable)>
			statelistdrawable.addState(EMPTY_STATE_SET, ((Drawable) (new ColorDrawable(0))));
	//   24   52:aload_2         
	//   25   53:getstatic       #180 <Field int[] EMPTY_STATE_SET>
	//   26   56:new             #168 <Class ColorDrawable>
	//   27   59:dup             
	//   28   60:iconst_0        
	//   29   61:invokespecial   #173 <Method void ColorDrawable(int)>
	//   30   64:invokevirtual   #177 <Method void StateListDrawable.addState(int[], Drawable)>
			return statelistdrawable;
	//   31   67:aload_2         
	//   32   68:areturn         
		} else
		{
			return null;
	//   33   69:aconst_null     
	//   34   70:areturn         
		}
	}

	private void setActionView(View view)
	{
		if(view != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          46
		{
			if(mActionArea == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #123 <Field FrameLayout mActionArea>
	//*   4    8:ifnonnull       31
				mActionArea = (FrameLayout)((ViewStub)findViewById(android.support.design.R.id.design_menu_item_action_area_stub)).inflate();
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getstatic       #185 <Field int android.support.design.R$id.design_menu_item_action_area_stub>
	//    8   16:invokevirtual   #99  <Method View findViewById(int)>
	//    9   19:checkcast       #187 <Class ViewStub>
	//   10   22:invokevirtual   #190 <Method View ViewStub.inflate()>
	//   11   25:checkcast       #125 <Class FrameLayout>
	//   12   28:putfield        #123 <Field FrameLayout mActionArea>
			mActionArea.removeAllViews();
	//   13   31:aload_0         
	//   14   32:getfield        #123 <Field FrameLayout mActionArea>
	//   15   35:invokevirtual   #193 <Method void FrameLayout.removeAllViews()>
			mActionArea.addView(view);
	//   16   38:aload_0         
	//   17   39:getfield        #123 <Field FrameLayout mActionArea>
	//   18   42:aload_1         
	//   19   43:invokevirtual   #196 <Method void FrameLayout.addView(View)>
		}
	//   20   46:return          
	}

	private boolean shouldExpandActionArea()
	{
		return mItemData.getTitle() == null && mItemData.getIcon() == null && mItemData.getActionView() != null;
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field MenuItemImpl mItemData>
	//    2    4:invokevirtual   #204 <Method CharSequence MenuItemImpl.getTitle()>
	//    3    7:ifnonnull       32
	//    4   10:aload_0         
	//    5   11:getfield        #198 <Field MenuItemImpl mItemData>
	//    6   14:invokevirtual   #208 <Method Drawable MenuItemImpl.getIcon()>
	//    7   17:ifnonnull       32
	//    8   20:aload_0         
	//    9   21:getfield        #198 <Field MenuItemImpl mItemData>
	//   10   24:invokevirtual   #211 <Method View MenuItemImpl.getActionView()>
	//   11   27:ifnull          32
	//   12   30:iconst_1        
	//   13   31:ireturn         
	//   14   32:iconst_0        
	//   15   33:ireturn         
	}

	public MenuItemImpl getItemData()
	{
		return mItemData;
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field MenuItemImpl mItemData>
	//    2    4:areturn         
	}

	public void initialize(MenuItemImpl menuitemimpl, int i)
	{
		mItemData = menuitemimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #198 <Field MenuItemImpl mItemData>
		if(menuitemimpl.isVisible())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #218 <Method boolean MenuItemImpl.isVisible()>
	//*   5    9:ifeq            17
			i = 0;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		else
	//*   8   14:goto            20
			i = 8;
	//    9   17:bipush          8
	//   10   19:istore_2        
		setVisibility(i);
	//   11   20:aload_0         
	//   12   21:iload_2         
	//   13   22:invokevirtual   #219 <Method void setVisibility(int)>
		if(getBackground() == null)
	//*  14   25:aload_0         
	//*  15   26:invokevirtual   #222 <Method Drawable getBackground()>
	//*  16   29:ifnonnull       40
			ViewCompat.setBackground(((View) (this)), ((Drawable) (createDefaultBackground())));
	//   17   32:aload_0         
	//   18   33:aload_0         
	//   19   34:invokespecial   #224 <Method StateListDrawable createDefaultBackground()>
	//   20   37:invokestatic    #228 <Method void ViewCompat.setBackground(View, Drawable)>
		setCheckable(menuitemimpl.isCheckable());
	//   21   40:aload_0         
	//   22   41:aload_1         
	//   23   42:invokevirtual   #231 <Method boolean MenuItemImpl.isCheckable()>
	//   24   45:invokevirtual   #234 <Method void setCheckable(boolean)>
		setChecked(menuitemimpl.isChecked());
	//   25   48:aload_0         
	//   26   49:aload_1         
	//   27   50:invokevirtual   #237 <Method boolean MenuItemImpl.isChecked()>
	//   28   53:invokevirtual   #240 <Method void setChecked(boolean)>
		setEnabled(menuitemimpl.isEnabled());
	//   29   56:aload_0         
	//   30   57:aload_1         
	//   31   58:invokevirtual   #243 <Method boolean MenuItemImpl.isEnabled()>
	//   32   61:invokevirtual   #246 <Method void setEnabled(boolean)>
		setTitle(menuitemimpl.getTitle());
	//   33   64:aload_0         
	//   34   65:aload_1         
	//   35   66:invokevirtual   #204 <Method CharSequence MenuItemImpl.getTitle()>
	//   36   69:invokevirtual   #250 <Method void setTitle(CharSequence)>
		setIcon(menuitemimpl.getIcon());
	//   37   72:aload_0         
	//   38   73:aload_1         
	//   39   74:invokevirtual   #208 <Method Drawable MenuItemImpl.getIcon()>
	//   40   77:invokevirtual   #254 <Method void setIcon(Drawable)>
		setActionView(menuitemimpl.getActionView());
	//   41   80:aload_0         
	//   42   81:aload_1         
	//   43   82:invokevirtual   #211 <Method View MenuItemImpl.getActionView()>
	//   44   85:invokespecial   #256 <Method void setActionView(View)>
		setContentDescription(menuitemimpl.getContentDescription());
	//   45   88:aload_0         
	//   46   89:aload_1         
	//   47   90:invokevirtual   #259 <Method CharSequence MenuItemImpl.getContentDescription()>
	//   48   93:invokevirtual   #262 <Method void setContentDescription(CharSequence)>
		TooltipCompat.setTooltipText(((View) (this)), menuitemimpl.getTooltipText());
	//   49   96:aload_0         
	//   50   97:aload_1         
	//   51   98:invokevirtual   #265 <Method CharSequence MenuItemImpl.getTooltipText()>
	//   52  101:invokestatic    #271 <Method void TooltipCompat.setTooltipText(View, CharSequence)>
		adjustAppearance();
	//   53  104:aload_0         
	//   54  105:invokespecial   #273 <Method void adjustAppearance()>
	//   55  108:return          
	}

	protected int[] onCreateDrawableState(int i)
	{
		int ai[] = super.onCreateDrawableState(i + 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:iadd            
	//    4    4:invokespecial   #277 <Method int[] ForegroundLinearLayout.onCreateDrawableState(int)>
	//    5    7:astore_2        
		if(mItemData != null && mItemData.isCheckable() && mItemData.isChecked())
	//*   6    8:aload_0         
	//*   7    9:getfield        #198 <Field MenuItemImpl mItemData>
	//*   8   12:ifnull          43
	//*   9   15:aload_0         
	//*  10   16:getfield        #198 <Field MenuItemImpl mItemData>
	//*  11   19:invokevirtual   #231 <Method boolean MenuItemImpl.isCheckable()>
	//*  12   22:ifeq            43
	//*  13   25:aload_0         
	//*  14   26:getfield        #198 <Field MenuItemImpl mItemData>
	//*  15   29:invokevirtual   #237 <Method boolean MenuItemImpl.isChecked()>
	//*  16   32:ifeq            43
			mergeDrawableStates(ai, CHECKED_STATE_SET);
	//   17   35:aload_2         
	//   18   36:getstatic       #37  <Field int[] CHECKED_STATE_SET>
	//   19   39:invokestatic    #281 <Method int[] mergeDrawableStates(int[], int[])>
	//   20   42:pop             
		return ai;
	//   21   43:aload_2         
	//   22   44:areturn         
	}

	public boolean prefersCondensedTitle()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void recycle()
	{
		if(mActionArea != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #123 <Field FrameLayout mActionArea>
	//*   2    4:ifnull          14
			mActionArea.removeAllViews();
	//    3    7:aload_0         
	//    4    8:getfield        #123 <Field FrameLayout mActionArea>
	//    5   11:invokevirtual   #193 <Method void FrameLayout.removeAllViews()>
		mTextView.setCompoundDrawables(((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)));
	//    6   14:aload_0         
	//    7   15:getfield        #103 <Field CheckedTextView mTextView>
	//    8   18:aconst_null     
	//    9   19:aconst_null     
	//   10   20:aconst_null     
	//   11   21:aconst_null     
	//   12   22:invokevirtual   #287 <Method void CheckedTextView.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
	//   13   25:return          
	}

	public void setCheckable(boolean flag)
	{
		refreshDrawableState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #290 <Method void refreshDrawableState()>
		if(mCheckable != flag)
	//*   2    4:aload_0         
	//*   3    5:getfield        #292 <Field boolean mCheckable>
	//*   4    8:iload_1         
	//*   5    9:icmpeq          31
		{
			mCheckable = flag;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #292 <Field boolean mCheckable>
			mAccessibilityDelegate.sendAccessibilityEvent(((View) (mTextView)), 2048);
	//    9   17:aload_0         
	//   10   18:getfield        #52  <Field AccessibilityDelegateCompat mAccessibilityDelegate>
	//   11   21:aload_0         
	//   12   22:getfield        #103 <Field CheckedTextView mTextView>
	//   13   25:sipush          2048
	//   14   28:invokevirtual   #298 <Method void AccessibilityDelegateCompat.sendAccessibilityEvent(View, int)>
		}
	//   15   31:return          
	}

	public void setChecked(boolean flag)
	{
		refreshDrawableState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #290 <Method void refreshDrawableState()>
		mTextView.setChecked(flag);
	//    2    4:aload_0         
	//    3    5:getfield        #103 <Field CheckedTextView mTextView>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #299 <Method void CheckedTextView.setChecked(boolean)>
	//    6   12:return          
	}

	public void setIcon(Drawable drawable)
	{
		if(drawable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          65
		{
			Object obj = ((Object) (drawable));
	//    2    4:aload_1         
	//    3    5:astore_2        
			if(mHasIconTintList)
	//*   4    6:aload_0         
	//*   5    7:getfield        #301 <Field boolean mHasIconTintList>
	//*   6   10:ifeq            46
			{
				obj = ((Object) (drawable.getConstantState()));
	//    7   13:aload_1         
	//    8   14:invokevirtual   #307 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//    9   17:astore_2        
				if(obj != null)
	//*  10   18:aload_2         
	//*  11   19:ifnonnull       25
	//*  12   22:goto            30
					drawable = ((android.graphics.drawable.Drawable.ConstantState) (obj)).newDrawable();
	//   13   25:aload_2         
	//   14   26:invokevirtual   #312 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//   15   29:astore_1        
				obj = ((Object) (DrawableCompat.wrap(drawable).mutate()));
	//   16   30:aload_1         
	//   17   31:invokestatic    #318 <Method Drawable DrawableCompat.wrap(Drawable)>
	//   18   34:invokevirtual   #321 <Method Drawable Drawable.mutate()>
	//   19   37:astore_2        
				DrawableCompat.setTintList(((Drawable) (obj)), mIconTintList);
	//   20   38:aload_2         
	//   21   39:aload_0         
	//   22   40:getfield        #323 <Field ColorStateList mIconTintList>
	//   23   43:invokestatic    #327 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			}
			((Drawable) (obj)).setBounds(0, 0, mIconSize, mIconSize);
	//   24   46:aload_2         
	//   25   47:iconst_0        
	//   26   48:iconst_0        
	//   27   49:aload_0         
	//   28   50:getfield        #90  <Field int mIconSize>
	//   29   53:aload_0         
	//   30   54:getfield        #90  <Field int mIconSize>
	//   31   57:invokevirtual   #331 <Method void Drawable.setBounds(int, int, int, int)>
			drawable = ((Drawable) (obj));
	//   32   60:aload_2         
	//   33   61:astore_1        
		} else
	//*  34   62:goto            129
		if(mNeedsEmptyIcon)
	//*  35   65:aload_0         
	//*  36   66:getfield        #333 <Field boolean mNeedsEmptyIcon>
	//*  37   69:ifeq            129
		{
			if(mEmptyDrawable == null)
	//*  38   72:aload_0         
	//*  39   73:getfield        #335 <Field Drawable mEmptyDrawable>
	//*  40   76:ifnonnull       124
			{
				mEmptyDrawable = ResourcesCompat.getDrawable(getResources(), android.support.design.R.drawable.navigation_empty_icon, getContext().getTheme());
	//   41   79:aload_0         
	//   42   80:aload_0         
	//   43   81:invokevirtual   #336 <Method Resources getResources()>
	//   44   84:getstatic       #341 <Field int android.support.design.R$drawable.navigation_empty_icon>
	//   45   87:aload_0         
	//   46   88:invokevirtual   #148 <Method Context getContext()>
	//   47   91:invokevirtual   #152 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   48   94:invokestatic    #347 <Method Drawable ResourcesCompat.getDrawable(Resources, int, android.content.res.Resources$Theme)>
	//   49   97:putfield        #335 <Field Drawable mEmptyDrawable>
				if(mEmptyDrawable != null)
	//*  50  100:aload_0         
	//*  51  101:getfield        #335 <Field Drawable mEmptyDrawable>
	//*  52  104:ifnull          124
					mEmptyDrawable.setBounds(0, 0, mIconSize, mIconSize);
	//   53  107:aload_0         
	//   54  108:getfield        #335 <Field Drawable mEmptyDrawable>
	//   55  111:iconst_0        
	//   56  112:iconst_0        
	//   57  113:aload_0         
	//   58  114:getfield        #90  <Field int mIconSize>
	//   59  117:aload_0         
	//   60  118:getfield        #90  <Field int mIconSize>
	//   61  121:invokevirtual   #331 <Method void Drawable.setBounds(int, int, int, int)>
			}
			drawable = mEmptyDrawable;
	//   62  124:aload_0         
	//   63  125:getfield        #335 <Field Drawable mEmptyDrawable>
	//   64  128:astore_1        
		}
		TextViewCompat.setCompoundDrawablesRelative(((android.widget.TextView) (mTextView)), drawable, ((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)));
	//   65  129:aload_0         
	//   66  130:getfield        #103 <Field CheckedTextView mTextView>
	//   67  133:aload_1         
	//   68  134:aconst_null     
	//   69  135:aconst_null     
	//   70  136:aconst_null     
	//   71  137:invokestatic    #353 <Method void TextViewCompat.setCompoundDrawablesRelative(android.widget.TextView, Drawable, Drawable, Drawable, Drawable)>
	//   72  140:return          
	}

	void setIconTintList(ColorStateList colorstatelist)
	{
		mIconTintList = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #323 <Field ColorStateList mIconTintList>
		boolean flag;
		if(mIconTintList != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #323 <Field ColorStateList mIconTintList>
	//*   5    9:ifnull          17
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_2        
		else
	//*   8   14:goto            19
			flag = false;
	//    9   17:iconst_0        
	//   10   18:istore_2        
		mHasIconTintList = flag;
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:putfield        #301 <Field boolean mHasIconTintList>
		if(mItemData != null)
	//*  14   24:aload_0         
	//*  15   25:getfield        #198 <Field MenuItemImpl mItemData>
	//*  16   28:ifnull          42
			setIcon(mItemData.getIcon());
	//   17   31:aload_0         
	//   18   32:aload_0         
	//   19   33:getfield        #198 <Field MenuItemImpl mItemData>
	//   20   36:invokevirtual   #208 <Method Drawable MenuItemImpl.getIcon()>
	//   21   39:invokevirtual   #254 <Method void setIcon(Drawable)>
	//   22   42:return          
	}

	public void setNeedsEmptyIcon(boolean flag)
	{
		mNeedsEmptyIcon = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #333 <Field boolean mNeedsEmptyIcon>
	//    3    5:return          
	}

	public void setShortcut(boolean flag, char c)
	{
	//    0    0:return          
	}

	public void setTextAppearance(int i)
	{
		TextViewCompat.setTextAppearance(((android.widget.TextView) (mTextView)), i);
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field CheckedTextView mTextView>
	//    2    4:iload_1         
	//    3    5:invokestatic    #362 <Method void TextViewCompat.setTextAppearance(android.widget.TextView, int)>
	//    4    8:return          
	}

	public void setTextColor(ColorStateList colorstatelist)
	{
		mTextView.setTextColor(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field CheckedTextView mTextView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #365 <Method void CheckedTextView.setTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		mTextView.setText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field CheckedTextView mTextView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #368 <Method void CheckedTextView.setText(CharSequence)>
	//    4    8:return          
	}

	public boolean showsIcon()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final int CHECKED_STATE_SET[] = {
		0x10100a0
	};
	private final AccessibilityDelegateCompat mAccessibilityDelegate;
	private FrameLayout mActionArea;
	boolean mCheckable;
	private Drawable mEmptyDrawable;
	private boolean mHasIconTintList;
	private final int mIconSize;
	private ColorStateList mIconTintList;
	private MenuItemImpl mItemData;
	private boolean mNeedsEmptyIcon;
	private final CheckedTextView mTextView;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #35  <Int 0x10100a0>
	//    5    7:iastore         
	//    6    8:putstatic       #37  <Field int[] CHECKED_STATE_SET>
	//*   7   11:return          
	}
}
