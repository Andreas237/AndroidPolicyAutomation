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

	public NavigationMenuItemView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #43  <Method void NavigationMenuItemView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public NavigationMenuItemView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #44  <Method void ForegroundLinearLayout(Context, AttributeSet, int)>
		accessibilityDelegate = ((AccessibilityDelegateCompat) (new AccessibilityDelegateCompat() {

			public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
			{
				super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #20  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
				accessibilitynodeinfocompat.setCheckable(checkable);
			//    4    6:aload_2         
			//    5    7:aload_0         
			//    6    8:getfield        #12  <Field NavigationMenuItemView this$0>
			//    7   11:getfield        #24  <Field boolean NavigationMenuItemView.checkable>
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
	//    9   13:invokespecial   #47  <Method void NavigationMenuItemView$1(NavigationMenuItemView)>
	//   10   16:putfield        #49  <Field AccessibilityDelegateCompat accessibilityDelegate>
		setOrientation(0);
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:invokevirtual   #53  <Method void setOrientation(int)>
		LayoutInflater.from(context).inflate(android.support.design.R.layout.design_navigation_menu_item, ((android.view.ViewGroup) (this)), true);
	//   14   24:aload_1         
	//   15   25:invokestatic    #59  <Method LayoutInflater LayoutInflater.from(Context)>
	//   16   28:getstatic       #64  <Field int android.support.design.R$layout.design_navigation_menu_item>
	//   17   31:aload_0         
	//   18   32:iconst_1        
	//   19   33:invokevirtual   #68  <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   20   36:pop             
		iconSize = context.getResources().getDimensionPixelSize(android.support.design.R.dimen.design_navigation_icon_size);
	//   21   37:aload_0         
	//   22   38:aload_1         
	//   23   39:invokevirtual   #74  <Method Resources Context.getResources()>
	//   24   42:getstatic       #79  <Field int android.support.design.R$dimen.design_navigation_icon_size>
	//   25   45:invokevirtual   #85  <Method int Resources.getDimensionPixelSize(int)>
	//   26   48:putfield        #87  <Field int iconSize>
		textView = (CheckedTextView)findViewById(android.support.design.R.id.design_menu_item_text);
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:getstatic       #92  <Field int android.support.design.R$id.design_menu_item_text>
	//   30   56:invokevirtual   #96  <Method View findViewById(int)>
	//   31   59:checkcast       #98  <Class CheckedTextView>
	//   32   62:putfield        #100 <Field CheckedTextView textView>
		textView.setDuplicateParentStateEnabled(true);
	//   33   65:aload_0         
	//   34   66:getfield        #100 <Field CheckedTextView textView>
	//   35   69:iconst_1        
	//   36   70:invokevirtual   #104 <Method void CheckedTextView.setDuplicateParentStateEnabled(boolean)>
		ViewCompat.setAccessibilityDelegate(((View) (textView)), accessibilityDelegate);
	//   37   73:aload_0         
	//   38   74:getfield        #100 <Field CheckedTextView textView>
	//   39   77:aload_0         
	//   40   78:getfield        #49  <Field AccessibilityDelegateCompat accessibilityDelegate>
	//   41   81:invokestatic    #110 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
	//   42   84:return          
	}

	private void adjustAppearance()
	{
		if(shouldExpandActionArea())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #115 <Method boolean shouldExpandActionArea()>
	//*   2    4:ifeq            47
		{
			textView.setVisibility(8);
	//    3    7:aload_0         
	//    4    8:getfield        #100 <Field CheckedTextView textView>
	//    5   11:bipush          8
	//    6   13:invokevirtual   #118 <Method void CheckedTextView.setVisibility(int)>
			Object obj = ((Object) (actionArea));
	//    7   16:aload_0         
	//    8   17:getfield        #120 <Field FrameLayout actionArea>
	//    9   20:astore_1        
			if(obj != null)
	//*  10   21:aload_1         
	//*  11   22:ifnull          86
			{
				obj = ((Object) ((android.support.v7.widget.LinearLayoutCompat.LayoutParams)((FrameLayout) (obj)).getLayoutParams()));
	//   12   25:aload_1         
	//   13   26:invokevirtual   #126 <Method android.view.ViewGroup$LayoutParams FrameLayout.getLayoutParams()>
	//   14   29:checkcast       #128 <Class android.support.v7.widget.LinearLayoutCompat$LayoutParams>
	//   15   32:astore_1        
				obj.width = -1;
	//   16   33:aload_1         
	//   17   34:iconst_m1       
	//   18   35:putfield        #131 <Field int android.support.v7.widget.LinearLayoutCompat$LayoutParams.width>
				actionArea.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
	//   19   38:aload_0         
	//   20   39:getfield        #120 <Field FrameLayout actionArea>
	//   21   42:aload_1         
	//   22   43:invokevirtual   #135 <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
				return;
	//   23   46:return          
			}
		} else
		{
			textView.setVisibility(0);
	//   24   47:aload_0         
	//   25   48:getfield        #100 <Field CheckedTextView textView>
	//   26   51:iconst_0        
	//   27   52:invokevirtual   #118 <Method void CheckedTextView.setVisibility(int)>
			Object obj1 = ((Object) (actionArea));
	//   28   55:aload_0         
	//   29   56:getfield        #120 <Field FrameLayout actionArea>
	//   30   59:astore_1        
			if(obj1 != null)
	//*  31   60:aload_1         
	//*  32   61:ifnull          86
			{
				obj1 = ((Object) ((android.support.v7.widget.LinearLayoutCompat.LayoutParams)((FrameLayout) (obj1)).getLayoutParams()));
	//   33   64:aload_1         
	//   34   65:invokevirtual   #126 <Method android.view.ViewGroup$LayoutParams FrameLayout.getLayoutParams()>
	//   35   68:checkcast       #128 <Class android.support.v7.widget.LinearLayoutCompat$LayoutParams>
	//   36   71:astore_1        
				obj1.width = -2;
	//   37   72:aload_1         
	//   38   73:bipush          -2
	//   39   75:putfield        #131 <Field int android.support.v7.widget.LinearLayoutCompat$LayoutParams.width>
				actionArea.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
	//   40   78:aload_0         
	//   41   79:getfield        #120 <Field FrameLayout actionArea>
	//   42   82:aload_1         
	//   43   83:invokevirtual   #135 <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			}
		}
	//   44   86:return          
	}

	private StateListDrawable createDefaultBackground()
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #139 <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #141 <Method void TypedValue()>
	//    3    7:astore_1        
		if(getContext().getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.colorControlHighlight, typedvalue, true))
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #145 <Method Context getContext()>
	//*   6   12:invokevirtual   #149 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*   7   15:getstatic       #154 <Field int android.support.v7.appcompat.R$attr.colorControlHighlight>
	//*   8   18:aload_1         
	//*   9   19:iconst_1        
	//*  10   20:invokevirtual   #160 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  11   23:ifeq            69
		{
			StateListDrawable statelistdrawable = new StateListDrawable();
	//   12   26:new             #162 <Class StateListDrawable>
	//   13   29:dup             
	//   14   30:invokespecial   #163 <Method void StateListDrawable()>
	//   15   33:astore_2        
			statelistdrawable.addState(CHECKED_STATE_SET, ((Drawable) (new ColorDrawable(typedvalue.data))));
	//   16   34:aload_2         
	//   17   35:getstatic       #37  <Field int[] CHECKED_STATE_SET>
	//   18   38:new             #165 <Class ColorDrawable>
	//   19   41:dup             
	//   20   42:aload_1         
	//   21   43:getfield        #168 <Field int TypedValue.data>
	//   22   46:invokespecial   #170 <Method void ColorDrawable(int)>
	//   23   49:invokevirtual   #174 <Method void StateListDrawable.addState(int[], Drawable)>
			statelistdrawable.addState(EMPTY_STATE_SET, ((Drawable) (new ColorDrawable(0))));
	//   24   52:aload_2         
	//   25   53:getstatic       #177 <Field int[] EMPTY_STATE_SET>
	//   26   56:new             #165 <Class ColorDrawable>
	//   27   59:dup             
	//   28   60:iconst_0        
	//   29   61:invokespecial   #170 <Method void ColorDrawable(int)>
	//   30   64:invokevirtual   #174 <Method void StateListDrawable.addState(int[], Drawable)>
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
			if(actionArea == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #120 <Field FrameLayout actionArea>
	//*   4    8:ifnonnull       31
				actionArea = (FrameLayout)((ViewStub)findViewById(android.support.design.R.id.design_menu_item_action_area_stub)).inflate();
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getstatic       #182 <Field int android.support.design.R$id.design_menu_item_action_area_stub>
	//    8   16:invokevirtual   #96  <Method View findViewById(int)>
	//    9   19:checkcast       #184 <Class ViewStub>
	//   10   22:invokevirtual   #187 <Method View ViewStub.inflate()>
	//   11   25:checkcast       #122 <Class FrameLayout>
	//   12   28:putfield        #120 <Field FrameLayout actionArea>
			actionArea.removeAllViews();
	//   13   31:aload_0         
	//   14   32:getfield        #120 <Field FrameLayout actionArea>
	//   15   35:invokevirtual   #190 <Method void FrameLayout.removeAllViews()>
			actionArea.addView(view);
	//   16   38:aload_0         
	//   17   39:getfield        #120 <Field FrameLayout actionArea>
	//   18   42:aload_1         
	//   19   43:invokevirtual   #193 <Method void FrameLayout.addView(View)>
		}
	//   20   46:return          
	}

	private boolean shouldExpandActionArea()
	{
		return itemData.getTitle() == null && itemData.getIcon() == null && itemData.getActionView() != null;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field MenuItemImpl itemData>
	//    2    4:invokevirtual   #201 <Method CharSequence MenuItemImpl.getTitle()>
	//    3    7:ifnonnull       32
	//    4   10:aload_0         
	//    5   11:getfield        #195 <Field MenuItemImpl itemData>
	//    6   14:invokevirtual   #205 <Method Drawable MenuItemImpl.getIcon()>
	//    7   17:ifnonnull       32
	//    8   20:aload_0         
	//    9   21:getfield        #195 <Field MenuItemImpl itemData>
	//   10   24:invokevirtual   #208 <Method View MenuItemImpl.getActionView()>
	//   11   27:ifnull          32
	//   12   30:iconst_1        
	//   13   31:ireturn         
	//   14   32:iconst_0        
	//   15   33:ireturn         
	}

	public MenuItemImpl getItemData()
	{
		return itemData;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field MenuItemImpl itemData>
	//    2    4:areturn         
	}

	public void initialize(MenuItemImpl menuitemimpl, int i)
	{
		itemData = menuitemimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #195 <Field MenuItemImpl itemData>
		if(menuitemimpl.isVisible())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #215 <Method boolean MenuItemImpl.isVisible()>
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
	//   13   22:invokevirtual   #216 <Method void setVisibility(int)>
		if(getBackground() == null)
	//*  14   25:aload_0         
	//*  15   26:invokevirtual   #219 <Method Drawable getBackground()>
	//*  16   29:ifnonnull       40
			ViewCompat.setBackground(((View) (this)), ((Drawable) (createDefaultBackground())));
	//   17   32:aload_0         
	//   18   33:aload_0         
	//   19   34:invokespecial   #221 <Method StateListDrawable createDefaultBackground()>
	//   20   37:invokestatic    #225 <Method void ViewCompat.setBackground(View, Drawable)>
		setCheckable(menuitemimpl.isCheckable());
	//   21   40:aload_0         
	//   22   41:aload_1         
	//   23   42:invokevirtual   #228 <Method boolean MenuItemImpl.isCheckable()>
	//   24   45:invokevirtual   #231 <Method void setCheckable(boolean)>
		setChecked(menuitemimpl.isChecked());
	//   25   48:aload_0         
	//   26   49:aload_1         
	//   27   50:invokevirtual   #234 <Method boolean MenuItemImpl.isChecked()>
	//   28   53:invokevirtual   #237 <Method void setChecked(boolean)>
		setEnabled(menuitemimpl.isEnabled());
	//   29   56:aload_0         
	//   30   57:aload_1         
	//   31   58:invokevirtual   #240 <Method boolean MenuItemImpl.isEnabled()>
	//   32   61:invokevirtual   #243 <Method void setEnabled(boolean)>
		setTitle(menuitemimpl.getTitle());
	//   33   64:aload_0         
	//   34   65:aload_1         
	//   35   66:invokevirtual   #201 <Method CharSequence MenuItemImpl.getTitle()>
	//   36   69:invokevirtual   #247 <Method void setTitle(CharSequence)>
		setIcon(menuitemimpl.getIcon());
	//   37   72:aload_0         
	//   38   73:aload_1         
	//   39   74:invokevirtual   #205 <Method Drawable MenuItemImpl.getIcon()>
	//   40   77:invokevirtual   #251 <Method void setIcon(Drawable)>
		setActionView(menuitemimpl.getActionView());
	//   41   80:aload_0         
	//   42   81:aload_1         
	//   43   82:invokevirtual   #208 <Method View MenuItemImpl.getActionView()>
	//   44   85:invokespecial   #253 <Method void setActionView(View)>
		setContentDescription(menuitemimpl.getContentDescription());
	//   45   88:aload_0         
	//   46   89:aload_1         
	//   47   90:invokevirtual   #256 <Method CharSequence MenuItemImpl.getContentDescription()>
	//   48   93:invokevirtual   #259 <Method void setContentDescription(CharSequence)>
		TooltipCompat.setTooltipText(((View) (this)), menuitemimpl.getTooltipText());
	//   49   96:aload_0         
	//   50   97:aload_1         
	//   51   98:invokevirtual   #262 <Method CharSequence MenuItemImpl.getTooltipText()>
	//   52  101:invokestatic    #268 <Method void TooltipCompat.setTooltipText(View, CharSequence)>
		adjustAppearance();
	//   53  104:aload_0         
	//   54  105:invokespecial   #270 <Method void adjustAppearance()>
	//   55  108:return          
	}

	protected int[] onCreateDrawableState(int i)
	{
		int ai[] = super.onCreateDrawableState(i + 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:iadd            
	//    4    4:invokespecial   #274 <Method int[] ForegroundLinearLayout.onCreateDrawableState(int)>
	//    5    7:astore_2        
		MenuItemImpl menuitemimpl = itemData;
	//    6    8:aload_0         
	//    7    9:getfield        #195 <Field MenuItemImpl itemData>
	//    8   12:astore_3        
		if(menuitemimpl != null && menuitemimpl.isCheckable() && itemData.isChecked())
	//*   9   13:aload_3         
	//*  10   14:ifnull          42
	//*  11   17:aload_3         
	//*  12   18:invokevirtual   #228 <Method boolean MenuItemImpl.isCheckable()>
	//*  13   21:ifeq            42
	//*  14   24:aload_0         
	//*  15   25:getfield        #195 <Field MenuItemImpl itemData>
	//*  16   28:invokevirtual   #234 <Method boolean MenuItemImpl.isChecked()>
	//*  17   31:ifeq            42
			mergeDrawableStates(ai, CHECKED_STATE_SET);
	//   18   34:aload_2         
	//   19   35:getstatic       #37  <Field int[] CHECKED_STATE_SET>
	//   20   38:invokestatic    #278 <Method int[] mergeDrawableStates(int[], int[])>
	//   21   41:pop             
		return ai;
	//   22   42:aload_2         
	//   23   43:areturn         
	}

	public boolean prefersCondensedTitle()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void recycle()
	{
		FrameLayout framelayout = actionArea;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field FrameLayout actionArea>
	//    2    4:astore_1        
		if(framelayout != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			framelayout.removeAllViews();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #190 <Method void FrameLayout.removeAllViews()>
		textView.setCompoundDrawables(((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)));
	//    7   13:aload_0         
	//    8   14:getfield        #100 <Field CheckedTextView textView>
	//    9   17:aconst_null     
	//   10   18:aconst_null     
	//   11   19:aconst_null     
	//   12   20:aconst_null     
	//   13   21:invokevirtual   #284 <Method void CheckedTextView.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
	//   14   24:return          
	}

	public void setCheckable(boolean flag)
	{
		refreshDrawableState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #287 <Method void refreshDrawableState()>
		if(checkable != flag)
	//*   2    4:aload_0         
	//*   3    5:getfield        #289 <Field boolean checkable>
	//*   4    8:iload_1         
	//*   5    9:icmpeq          31
		{
			checkable = flag;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #289 <Field boolean checkable>
			accessibilityDelegate.sendAccessibilityEvent(((View) (textView)), 2048);
	//    9   17:aload_0         
	//   10   18:getfield        #49  <Field AccessibilityDelegateCompat accessibilityDelegate>
	//   11   21:aload_0         
	//   12   22:getfield        #100 <Field CheckedTextView textView>
	//   13   25:sipush          2048
	//   14   28:invokevirtual   #295 <Method void AccessibilityDelegateCompat.sendAccessibilityEvent(View, int)>
		}
	//   15   31:return          
	}

	public void setChecked(boolean flag)
	{
		refreshDrawableState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #287 <Method void refreshDrawableState()>
		textView.setChecked(flag);
	//    2    4:aload_0         
	//    3    5:getfield        #100 <Field CheckedTextView textView>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #296 <Method void CheckedTextView.setChecked(boolean)>
	//    6   12:return          
	}

	public void setHorizontalPadding(int i)
	{
		setPadding(i, 0, i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:iload_1         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #301 <Method void setPadding(int, int, int, int)>
	//    6    8:return          
	}

	public void setIcon(Drawable drawable)
	{
		if(drawable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          64
		{
			Object obj = ((Object) (drawable));
	//    2    4:aload_1         
	//    3    5:astore_3        
			if(hasIconTintList)
	//*   4    6:aload_0         
	//*   5    7:getfield        #303 <Field boolean hasIconTintList>
	//*   6   10:ifeq            46
			{
				obj = ((Object) (drawable.getConstantState()));
	//    7   13:aload_1         
	//    8   14:invokevirtual   #309 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//    9   17:astore_3        
				if(obj != null)
	//*  10   18:aload_3         
	//*  11   19:ifnonnull       25
	//*  12   22:goto            30
					drawable = ((android.graphics.drawable.Drawable.ConstantState) (obj)).newDrawable();
	//   13   25:aload_3         
	//   14   26:invokevirtual   #314 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//   15   29:astore_1        
				obj = ((Object) (DrawableCompat.wrap(drawable).mutate()));
	//   16   30:aload_1         
	//   17   31:invokestatic    #320 <Method Drawable DrawableCompat.wrap(Drawable)>
	//   18   34:invokevirtual   #323 <Method Drawable Drawable.mutate()>
	//   19   37:astore_3        
				DrawableCompat.setTintList(((Drawable) (obj)), iconTintList);
	//   20   38:aload_3         
	//   21   39:aload_0         
	//   22   40:getfield        #325 <Field ColorStateList iconTintList>
	//   23   43:invokestatic    #329 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			}
			int i = iconSize;
	//   24   46:aload_0         
	//   25   47:getfield        #87  <Field int iconSize>
	//   26   50:istore_2        
			((Drawable) (obj)).setBounds(0, 0, i, i);
	//   27   51:aload_3         
	//   28   52:iconst_0        
	//   29   53:iconst_0        
	//   30   54:iload_2         
	//   31   55:iload_2         
	//   32   56:invokevirtual   #332 <Method void Drawable.setBounds(int, int, int, int)>
			drawable = ((Drawable) (obj));
	//   33   59:aload_3         
	//   34   60:astore_1        
		} else
	//*  35   61:goto            126
		if(needsEmptyIcon)
	//*  36   64:aload_0         
	//*  37   65:getfield        #334 <Field boolean needsEmptyIcon>
	//*  38   68:ifeq            126
		{
			if(emptyDrawable == null)
	//*  39   71:aload_0         
	//*  40   72:getfield        #336 <Field Drawable emptyDrawable>
	//*  41   75:ifnonnull       121
			{
				emptyDrawable = ResourcesCompat.getDrawable(getResources(), android.support.design.R.drawable.navigation_empty_icon, getContext().getTheme());
	//   42   78:aload_0         
	//   43   79:aload_0         
	//   44   80:invokevirtual   #337 <Method Resources getResources()>
	//   45   83:getstatic       #342 <Field int android.support.design.R$drawable.navigation_empty_icon>
	//   46   86:aload_0         
	//   47   87:invokevirtual   #145 <Method Context getContext()>
	//   48   90:invokevirtual   #149 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   49   93:invokestatic    #348 <Method Drawable ResourcesCompat.getDrawable(Resources, int, android.content.res.Resources$Theme)>
	//   50   96:putfield        #336 <Field Drawable emptyDrawable>
				drawable = emptyDrawable;
	//   51   99:aload_0         
	//   52  100:getfield        #336 <Field Drawable emptyDrawable>
	//   53  103:astore_1        
				if(drawable != null)
	//*  54  104:aload_1         
	//*  55  105:ifnull          121
				{
					int j = iconSize;
	//   56  108:aload_0         
	//   57  109:getfield        #87  <Field int iconSize>
	//   58  112:istore_2        
					drawable.setBounds(0, 0, j, j);
	//   59  113:aload_1         
	//   60  114:iconst_0        
	//   61  115:iconst_0        
	//   62  116:iload_2         
	//   63  117:iload_2         
	//   64  118:invokevirtual   #332 <Method void Drawable.setBounds(int, int, int, int)>
				}
			}
			drawable = emptyDrawable;
	//   65  121:aload_0         
	//   66  122:getfield        #336 <Field Drawable emptyDrawable>
	//   67  125:astore_1        
		}
		TextViewCompat.setCompoundDrawablesRelative(((android.widget.TextView) (textView)), drawable, ((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)));
	//   68  126:aload_0         
	//   69  127:getfield        #100 <Field CheckedTextView textView>
	//   70  130:aload_1         
	//   71  131:aconst_null     
	//   72  132:aconst_null     
	//   73  133:aconst_null     
	//   74  134:invokestatic    #354 <Method void TextViewCompat.setCompoundDrawablesRelative(android.widget.TextView, Drawable, Drawable, Drawable, Drawable)>
	//   75  137:return          
	}

	public void setIconPadding(int i)
	{
		textView.setCompoundDrawablePadding(i);
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field CheckedTextView textView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #358 <Method void CheckedTextView.setCompoundDrawablePadding(int)>
	//    4    8:return          
	}

	void setIconTintList(ColorStateList colorstatelist)
	{
		iconTintList = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #325 <Field ColorStateList iconTintList>
		boolean flag;
		if(iconTintList != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #325 <Field ColorStateList iconTintList>
	//*   5    9:ifnull          17
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_2        
		else
	//*   8   14:goto            19
			flag = false;
	//    9   17:iconst_0        
	//   10   18:istore_2        
		hasIconTintList = flag;
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:putfield        #303 <Field boolean hasIconTintList>
		colorstatelist = ((ColorStateList) (itemData));
	//   14   24:aload_0         
	//   15   25:getfield        #195 <Field MenuItemImpl itemData>
	//   16   28:astore_1        
		if(colorstatelist != null)
	//*  17   29:aload_1         
	//*  18   30:ifnull          41
			setIcon(((MenuItemImpl) (colorstatelist)).getIcon());
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:invokevirtual   #205 <Method Drawable MenuItemImpl.getIcon()>
	//   22   38:invokevirtual   #251 <Method void setIcon(Drawable)>
	//   23   41:return          
	}

	public void setNeedsEmptyIcon(boolean flag)
	{
		needsEmptyIcon = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #334 <Field boolean needsEmptyIcon>
	//    3    5:return          
	}

	public void setShortcut(boolean flag, char c)
	{
	//    0    0:return          
	}

	public void setTextAppearance(int i)
	{
		TextViewCompat.setTextAppearance(((android.widget.TextView) (textView)), i);
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field CheckedTextView textView>
	//    2    4:iload_1         
	//    3    5:invokestatic    #367 <Method void TextViewCompat.setTextAppearance(android.widget.TextView, int)>
	//    4    8:return          
	}

	public void setTextColor(ColorStateList colorstatelist)
	{
		textView.setTextColor(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field CheckedTextView textView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #370 <Method void CheckedTextView.setTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		textView.setText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field CheckedTextView textView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #373 <Method void CheckedTextView.setText(CharSequence)>
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
	private final AccessibilityDelegateCompat accessibilityDelegate;
	private FrameLayout actionArea;
	boolean checkable;
	private Drawable emptyDrawable;
	private boolean hasIconTintList;
	private final int iconSize;
	private ColorStateList iconTintList;
	private MenuItemImpl itemData;
	private boolean needsEmptyIcon;
	private final CheckedTextView textView;

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
