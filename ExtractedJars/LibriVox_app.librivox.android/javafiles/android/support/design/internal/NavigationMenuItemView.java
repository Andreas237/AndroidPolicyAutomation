// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.*;
import android.support.design.*;
import android.support.v4.a.a.k;
import android.support.v4.graphics.drawable.a;
import android.support.v4.view.ac;
import android.support.v4.view.b;
import android.support.v4.widget.ah;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.widget.TooltipCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.*;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;

// Referenced classes of package android.support.design.internal:
//			d, f

public class NavigationMenuItemView extends d
	implements android.support.v7.view.menu.MenuView.ItemView
{

	public NavigationMenuItemView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #37  <Method void NavigationMenuItemView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public NavigationMenuItemView(Context context, AttributeSet attributeset, int i1)
	{
		super(context, attributeset, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #38  <Method void d(Context, AttributeSet, int)>
		m = ((b) (new android.support.design.internal.f(this)));
	//    5    7:aload_0         
	//    6    8:new             #40  <Class android.support.design.internal.f>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:invokespecial   #43  <Method void android.support.design.internal.f(NavigationMenuItemView)>
	//   10   16:putfield        #45  <Field b m>
		setOrientation(0);
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:invokevirtual   #49  <Method void setOrientation(int)>
		LayoutInflater.from(context).inflate(i.design_navigation_menu_item, ((android.view.ViewGroup) (this)), true);
	//   14   24:aload_1         
	//   15   25:invokestatic    #55  <Method LayoutInflater LayoutInflater.from(Context)>
	//   16   28:getstatic       #60  <Field int i.design_navigation_menu_item>
	//   17   31:aload_0         
	//   18   32:iconst_1        
	//   19   33:invokevirtual   #64  <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   20   36:pop             
		e = context.getResources().getDimensionPixelSize(e.design_navigation_icon_size);
	//   21   37:aload_0         
	//   22   38:aload_1         
	//   23   39:invokevirtual   #70  <Method Resources Context.getResources()>
	//   24   42:getstatic       #75  <Field int e.design_navigation_icon_size>
	//   25   45:invokevirtual   #81  <Method int Resources.getDimensionPixelSize(int)>
	//   26   48:putfield        #83  <Field int e>
		g = (CheckedTextView)findViewById(g.design_menu_item_text);
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:getstatic       #88  <Field int g.design_menu_item_text>
	//   30   56:invokevirtual   #92  <Method View findViewById(int)>
	//   31   59:checkcast       #94  <Class CheckedTextView>
	//   32   62:putfield        #96  <Field CheckedTextView g>
		g.setDuplicateParentStateEnabled(true);
	//   33   65:aload_0         
	//   34   66:getfield        #96  <Field CheckedTextView g>
	//   35   69:iconst_1        
	//   36   70:invokevirtual   #100 <Method void CheckedTextView.setDuplicateParentStateEnabled(boolean)>
		ac.a(((View) (g)), m);
	//   37   73:aload_0         
	//   38   74:getfield        #96  <Field CheckedTextView g>
	//   39   77:aload_0         
	//   40   78:getfield        #45  <Field b m>
	//   41   81:invokestatic    #106 <Method void ac.a(View, b)>
	//   42   84:return          
	}

	private boolean b()
	{
		return i.getTitle() == null && i.getIcon() == null && i.getActionView() != null;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field MenuItemImpl i>
	//    2    4:invokevirtual   #116 <Method CharSequence MenuItemImpl.getTitle()>
	//    3    7:ifnonnull       32
	//    4   10:aload_0         
	//    5   11:getfield        #110 <Field MenuItemImpl i>
	//    6   14:invokevirtual   #120 <Method Drawable MenuItemImpl.getIcon()>
	//    7   17:ifnonnull       32
	//    8   20:aload_0         
	//    9   21:getfield        #110 <Field MenuItemImpl i>
	//   10   24:invokevirtual   #124 <Method View MenuItemImpl.getActionView()>
	//   11   27:ifnull          32
	//   12   30:iconst_1        
	//   13   31:ireturn         
	//   14   32:iconst_0        
	//   15   33:ireturn         
	}

	private void c()
	{
		if(b())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #126 <Method boolean b()>
	//*   2    4:ifeq            47
		{
			g.setVisibility(8);
	//    3    7:aload_0         
	//    4    8:getfield        #96  <Field CheckedTextView g>
	//    5   11:bipush          8
	//    6   13:invokevirtual   #129 <Method void CheckedTextView.setVisibility(int)>
			Object obj = ((Object) (h));
	//    7   16:aload_0         
	//    8   17:getfield        #131 <Field FrameLayout h>
	//    9   20:astore_1        
			if(obj != null)
	//*  10   21:aload_1         
	//*  11   22:ifnull          86
			{
				obj = ((Object) ((android.support.v7.widget.LinearLayoutCompat.LayoutParams)((FrameLayout) (obj)).getLayoutParams()));
	//   12   25:aload_1         
	//   13   26:invokevirtual   #137 <Method android.view.ViewGroup$LayoutParams FrameLayout.getLayoutParams()>
	//   14   29:checkcast       #139 <Class android.support.v7.widget.LinearLayoutCompat$LayoutParams>
	//   15   32:astore_1        
				obj.width = -1;
	//   16   33:aload_1         
	//   17   34:iconst_m1       
	//   18   35:putfield        #142 <Field int android.support.v7.widget.LinearLayoutCompat$LayoutParams.width>
				h.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
	//   19   38:aload_0         
	//   20   39:getfield        #131 <Field FrameLayout h>
	//   21   42:aload_1         
	//   22   43:invokevirtual   #146 <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
				return;
	//   23   46:return          
			}
		} else
		{
			g.setVisibility(0);
	//   24   47:aload_0         
	//   25   48:getfield        #96  <Field CheckedTextView g>
	//   26   51:iconst_0        
	//   27   52:invokevirtual   #129 <Method void CheckedTextView.setVisibility(int)>
			Object obj1 = ((Object) (h));
	//   28   55:aload_0         
	//   29   56:getfield        #131 <Field FrameLayout h>
	//   30   59:astore_1        
			if(obj1 != null)
	//*  31   60:aload_1         
	//*  32   61:ifnull          86
			{
				obj1 = ((Object) ((android.support.v7.widget.LinearLayoutCompat.LayoutParams)((FrameLayout) (obj1)).getLayoutParams()));
	//   33   64:aload_1         
	//   34   65:invokevirtual   #137 <Method android.view.ViewGroup$LayoutParams FrameLayout.getLayoutParams()>
	//   35   68:checkcast       #139 <Class android.support.v7.widget.LinearLayoutCompat$LayoutParams>
	//   36   71:astore_1        
				obj1.width = -2;
	//   37   72:aload_1         
	//   38   73:bipush          -2
	//   39   75:putfield        #142 <Field int android.support.v7.widget.LinearLayoutCompat$LayoutParams.width>
				h.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
	//   40   78:aload_0         
	//   41   79:getfield        #131 <Field FrameLayout h>
	//   42   82:aload_1         
	//   43   83:invokevirtual   #146 <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			}
		}
	//   44   86:return          
	}

	private StateListDrawable d()
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #149 <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #151 <Method void TypedValue()>
	//    3    7:astore_1        
		if(getContext().getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.colorControlHighlight, typedvalue, true))
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #155 <Method Context getContext()>
	//*   6   12:invokevirtual   #159 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*   7   15:getstatic       #164 <Field int android.support.v7.appcompat.R$attr.colorControlHighlight>
	//*   8   18:aload_1         
	//*   9   19:iconst_1        
	//*  10   20:invokevirtual   #170 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  11   23:ifeq            69
		{
			StateListDrawable statelistdrawable = new StateListDrawable();
	//   12   26:new             #172 <Class StateListDrawable>
	//   13   29:dup             
	//   14   30:invokespecial   #173 <Method void StateListDrawable()>
	//   15   33:astore_2        
			statelistdrawable.addState(d, ((Drawable) (new ColorDrawable(typedvalue.data))));
	//   16   34:aload_2         
	//   17   35:getstatic       #31  <Field int[] d>
	//   18   38:new             #175 <Class ColorDrawable>
	//   19   41:dup             
	//   20   42:aload_1         
	//   21   43:getfield        #178 <Field int TypedValue.data>
	//   22   46:invokespecial   #180 <Method void ColorDrawable(int)>
	//   23   49:invokevirtual   #184 <Method void StateListDrawable.addState(int[], Drawable)>
			statelistdrawable.addState(EMPTY_STATE_SET, ((Drawable) (new ColorDrawable(0))));
	//   24   52:aload_2         
	//   25   53:getstatic       #187 <Field int[] EMPTY_STATE_SET>
	//   26   56:new             #175 <Class ColorDrawable>
	//   27   59:dup             
	//   28   60:iconst_0        
	//   29   61:invokespecial   #180 <Method void ColorDrawable(int)>
	//   30   64:invokevirtual   #184 <Method void StateListDrawable.addState(int[], Drawable)>
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
			if(h == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #131 <Field FrameLayout h>
	//*   4    8:ifnonnull       31
				h = (FrameLayout)((ViewStub)findViewById(g.design_menu_item_action_area_stub)).inflate();
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getstatic       #192 <Field int g.design_menu_item_action_area_stub>
	//    8   16:invokevirtual   #92  <Method View findViewById(int)>
	//    9   19:checkcast       #194 <Class ViewStub>
	//   10   22:invokevirtual   #196 <Method View ViewStub.inflate()>
	//   11   25:checkcast       #133 <Class FrameLayout>
	//   12   28:putfield        #131 <Field FrameLayout h>
			h.removeAllViews();
	//   13   31:aload_0         
	//   14   32:getfield        #131 <Field FrameLayout h>
	//   15   35:invokevirtual   #199 <Method void FrameLayout.removeAllViews()>
			h.addView(view);
	//   16   38:aload_0         
	//   17   39:getfield        #131 <Field FrameLayout h>
	//   18   42:aload_1         
	//   19   43:invokevirtual   #202 <Method void FrameLayout.addView(View)>
		}
	//   20   46:return          
	}

	public void a()
	{
		FrameLayout framelayout = h;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field FrameLayout h>
	//    2    4:astore_1        
		if(framelayout != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			framelayout.removeAllViews();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #199 <Method void FrameLayout.removeAllViews()>
		g.setCompoundDrawables(((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)));
	//    7   13:aload_0         
	//    8   14:getfield        #96  <Field CheckedTextView g>
	//    9   17:aconst_null     
	//   10   18:aconst_null     
	//   11   19:aconst_null     
	//   12   20:aconst_null     
	//   13   21:invokevirtual   #206 <Method void CheckedTextView.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
	//   14   24:return          
	}

	public MenuItemImpl getItemData()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field MenuItemImpl i>
	//    2    4:areturn         
	}

	public void initialize(MenuItemImpl menuitemimpl, int i1)
	{
		i = menuitemimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #110 <Field MenuItemImpl i>
		if(menuitemimpl.isVisible())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #213 <Method boolean MenuItemImpl.isVisible()>
	//*   5    9:ifeq            17
			i1 = 0;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		else
	//*   8   14:goto            20
			i1 = 8;
	//    9   17:bipush          8
	//   10   19:istore_2        
		setVisibility(i1);
	//   11   20:aload_0         
	//   12   21:iload_2         
	//   13   22:invokevirtual   #214 <Method void setVisibility(int)>
		if(getBackground() == null)
	//*  14   25:aload_0         
	//*  15   26:invokevirtual   #217 <Method Drawable getBackground()>
	//*  16   29:ifnonnull       40
			ac.a(((View) (this)), ((Drawable) (d())));
	//   17   32:aload_0         
	//   18   33:aload_0         
	//   19   34:invokespecial   #219 <Method StateListDrawable d()>
	//   20   37:invokestatic    #222 <Method void ac.a(View, Drawable)>
		setCheckable(menuitemimpl.isCheckable());
	//   21   40:aload_0         
	//   22   41:aload_1         
	//   23   42:invokevirtual   #225 <Method boolean MenuItemImpl.isCheckable()>
	//   24   45:invokevirtual   #228 <Method void setCheckable(boolean)>
		setChecked(menuitemimpl.isChecked());
	//   25   48:aload_0         
	//   26   49:aload_1         
	//   27   50:invokevirtual   #231 <Method boolean MenuItemImpl.isChecked()>
	//   28   53:invokevirtual   #234 <Method void setChecked(boolean)>
		setEnabled(menuitemimpl.isEnabled());
	//   29   56:aload_0         
	//   30   57:aload_1         
	//   31   58:invokevirtual   #237 <Method boolean MenuItemImpl.isEnabled()>
	//   32   61:invokevirtual   #240 <Method void setEnabled(boolean)>
		setTitle(menuitemimpl.getTitle());
	//   33   64:aload_0         
	//   34   65:aload_1         
	//   35   66:invokevirtual   #116 <Method CharSequence MenuItemImpl.getTitle()>
	//   36   69:invokevirtual   #244 <Method void setTitle(CharSequence)>
		setIcon(menuitemimpl.getIcon());
	//   37   72:aload_0         
	//   38   73:aload_1         
	//   39   74:invokevirtual   #120 <Method Drawable MenuItemImpl.getIcon()>
	//   40   77:invokevirtual   #248 <Method void setIcon(Drawable)>
		setActionView(menuitemimpl.getActionView());
	//   41   80:aload_0         
	//   42   81:aload_1         
	//   43   82:invokevirtual   #124 <Method View MenuItemImpl.getActionView()>
	//   44   85:invokespecial   #250 <Method void setActionView(View)>
		setContentDescription(menuitemimpl.getContentDescription());
	//   45   88:aload_0         
	//   46   89:aload_1         
	//   47   90:invokevirtual   #253 <Method CharSequence MenuItemImpl.getContentDescription()>
	//   48   93:invokevirtual   #256 <Method void setContentDescription(CharSequence)>
		TooltipCompat.setTooltipText(((View) (this)), menuitemimpl.getTooltipText());
	//   49   96:aload_0         
	//   50   97:aload_1         
	//   51   98:invokevirtual   #259 <Method CharSequence MenuItemImpl.getTooltipText()>
	//   52  101:invokestatic    #265 <Method void TooltipCompat.setTooltipText(View, CharSequence)>
		c();
	//   53  104:aload_0         
	//   54  105:invokespecial   #267 <Method void c()>
	//   55  108:return          
	}

	protected int[] onCreateDrawableState(int i1)
	{
		int ai[] = super.onCreateDrawableState(i1 + 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:iadd            
	//    4    4:invokespecial   #271 <Method int[] d.onCreateDrawableState(int)>
	//    5    7:astore_2        
		MenuItemImpl menuitemimpl = i;
	//    6    8:aload_0         
	//    7    9:getfield        #110 <Field MenuItemImpl i>
	//    8   12:astore_3        
		if(menuitemimpl != null && menuitemimpl.isCheckable() && i.isChecked())
	//*   9   13:aload_3         
	//*  10   14:ifnull          42
	//*  11   17:aload_3         
	//*  12   18:invokevirtual   #225 <Method boolean MenuItemImpl.isCheckable()>
	//*  13   21:ifeq            42
	//*  14   24:aload_0         
	//*  15   25:getfield        #110 <Field MenuItemImpl i>
	//*  16   28:invokevirtual   #231 <Method boolean MenuItemImpl.isChecked()>
	//*  17   31:ifeq            42
			mergeDrawableStates(ai, d);
	//   18   34:aload_2         
	//   19   35:getstatic       #31  <Field int[] d>
	//   20   38:invokestatic    #275 <Method int[] mergeDrawableStates(int[], int[])>
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

	public void setCheckable(boolean flag)
	{
		refreshDrawableState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #279 <Method void refreshDrawableState()>
		if(c != flag)
	//*   2    4:aload_0         
	//*   3    5:getfield        #281 <Field boolean c>
	//*   4    8:iload_1         
	//*   5    9:icmpeq          31
		{
			c = flag;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #281 <Field boolean c>
			m.sendAccessibilityEvent(((View) (g)), 2048);
	//    9   17:aload_0         
	//   10   18:getfield        #45  <Field b m>
	//   11   21:aload_0         
	//   12   22:getfield        #96  <Field CheckedTextView g>
	//   13   25:sipush          2048
	//   14   28:invokevirtual   #287 <Method void b.sendAccessibilityEvent(View, int)>
		}
	//   15   31:return          
	}

	public void setChecked(boolean flag)
	{
		refreshDrawableState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #279 <Method void refreshDrawableState()>
		g.setChecked(flag);
	//    2    4:aload_0         
	//    3    5:getfield        #96  <Field CheckedTextView g>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #288 <Method void CheckedTextView.setChecked(boolean)>
	//    6   12:return          
	}

	public void setHorizontalPadding(int i1)
	{
		setPadding(i1, 0, i1, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:iload_1         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #293 <Method void setPadding(int, int, int, int)>
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
			if(k)
	//*   4    6:aload_0         
	//*   5    7:getfield        #295 <Field boolean k>
	//*   6   10:ifeq            46
			{
				obj = ((Object) (drawable.getConstantState()));
	//    7   13:aload_1         
	//    8   14:invokevirtual   #301 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//    9   17:astore_3        
				if(obj != null)
	//*  10   18:aload_3         
	//*  11   19:ifnonnull       25
	//*  12   22:goto            30
					drawable = ((android.graphics.drawable.Drawable.ConstantState) (obj)).newDrawable();
	//   13   25:aload_3         
	//   14   26:invokevirtual   #306 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//   15   29:astore_1        
				obj = ((Object) (android.support.v4.graphics.drawable.a.g(drawable).mutate()));
	//   16   30:aload_1         
	//   17   31:invokestatic    #311 <Method Drawable a.g(Drawable)>
	//   18   34:invokevirtual   #314 <Method Drawable Drawable.mutate()>
	//   19   37:astore_3        
				android.support.v4.graphics.drawable.a.a(((Drawable) (obj)), j);
	//   20   38:aload_3         
	//   21   39:aload_0         
	//   22   40:getfield        #316 <Field ColorStateList j>
	//   23   43:invokestatic    #319 <Method void a.a(Drawable, ColorStateList)>
			}
			int i1 = e;
	//   24   46:aload_0         
	//   25   47:getfield        #83  <Field int e>
	//   26   50:istore_2        
			((Drawable) (obj)).setBounds(0, 0, i1, i1);
	//   27   51:aload_3         
	//   28   52:iconst_0        
	//   29   53:iconst_0        
	//   30   54:iload_2         
	//   31   55:iload_2         
	//   32   56:invokevirtual   #322 <Method void Drawable.setBounds(int, int, int, int)>
			drawable = ((Drawable) (obj));
	//   33   59:aload_3         
	//   34   60:astore_1        
		} else
	//*  35   61:goto            126
		if(f)
	//*  36   64:aload_0         
	//*  37   65:getfield        #324 <Field boolean f>
	//*  38   68:ifeq            126
		{
			if(l == null)
	//*  39   71:aload_0         
	//*  40   72:getfield        #326 <Field Drawable l>
	//*  41   75:ifnonnull       121
			{
				l = android.support.v4.a.a.k.a(getResources(), f.navigation_empty_icon, getContext().getTheme());
	//   42   78:aload_0         
	//   43   79:aload_0         
	//   44   80:invokevirtual   #327 <Method Resources getResources()>
	//   45   83:getstatic       #332 <Field int f.navigation_empty_icon>
	//   46   86:aload_0         
	//   47   87:invokevirtual   #155 <Method Context getContext()>
	//   48   90:invokevirtual   #159 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   49   93:invokestatic    #337 <Method Drawable k.a(Resources, int, android.content.res.Resources$Theme)>
	//   50   96:putfield        #326 <Field Drawable l>
				drawable = l;
	//   51   99:aload_0         
	//   52  100:getfield        #326 <Field Drawable l>
	//   53  103:astore_1        
				if(drawable != null)
	//*  54  104:aload_1         
	//*  55  105:ifnull          121
				{
					int j1 = e;
	//   56  108:aload_0         
	//   57  109:getfield        #83  <Field int e>
	//   58  112:istore_2        
					drawable.setBounds(0, 0, j1, j1);
	//   59  113:aload_1         
	//   60  114:iconst_0        
	//   61  115:iconst_0        
	//   62  116:iload_2         
	//   63  117:iload_2         
	//   64  118:invokevirtual   #322 <Method void Drawable.setBounds(int, int, int, int)>
				}
			}
			drawable = l;
	//   65  121:aload_0         
	//   66  122:getfield        #326 <Field Drawable l>
	//   67  125:astore_1        
		}
		ah.a(((android.widget.TextView) (g)), drawable, ((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)));
	//   68  126:aload_0         
	//   69  127:getfield        #96  <Field CheckedTextView g>
	//   70  130:aload_1         
	//   71  131:aconst_null     
	//   72  132:aconst_null     
	//   73  133:aconst_null     
	//   74  134:invokestatic    #342 <Method void ah.a(android.widget.TextView, Drawable, Drawable, Drawable, Drawable)>
	//   75  137:return          
	}

	public void setIconPadding(int i1)
	{
		g.setCompoundDrawablePadding(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field CheckedTextView g>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #346 <Method void CheckedTextView.setCompoundDrawablePadding(int)>
	//    4    8:return          
	}

	void setIconTintList(ColorStateList colorstatelist)
	{
		j = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #316 <Field ColorStateList j>
		boolean flag;
		if(j != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #316 <Field ColorStateList j>
	//*   5    9:ifnull          17
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_2        
		else
	//*   8   14:goto            19
			flag = false;
	//    9   17:iconst_0        
	//   10   18:istore_2        
		k = flag;
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:putfield        #295 <Field boolean k>
		colorstatelist = ((ColorStateList) (i));
	//   14   24:aload_0         
	//   15   25:getfield        #110 <Field MenuItemImpl i>
	//   16   28:astore_1        
		if(colorstatelist != null)
	//*  17   29:aload_1         
	//*  18   30:ifnull          41
			setIcon(((MenuItemImpl) (colorstatelist)).getIcon());
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:invokevirtual   #120 <Method Drawable MenuItemImpl.getIcon()>
	//   22   38:invokevirtual   #248 <Method void setIcon(Drawable)>
	//   23   41:return          
	}

	public void setNeedsEmptyIcon(boolean flag)
	{
		f = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #324 <Field boolean f>
	//    3    5:return          
	}

	public void setShortcut(boolean flag, char c1)
	{
	//    0    0:return          
	}

	public void setTextAppearance(int i1)
	{
		ah.a(((android.widget.TextView) (g)), i1);
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field CheckedTextView g>
	//    2    4:iload_1         
	//    3    5:invokestatic    #355 <Method void ah.a(android.widget.TextView, int)>
	//    4    8:return          
	}

	public void setTextColor(ColorStateList colorstatelist)
	{
		g.setTextColor(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field CheckedTextView g>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #358 <Method void CheckedTextView.setTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		g.setText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field CheckedTextView g>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #361 <Method void CheckedTextView.setText(CharSequence)>
	//    4    8:return          
	}

	public boolean showsIcon()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final int d[] = {
		0x10100a0
	};
	boolean c;
	private final int e;
	private boolean f;
	private final CheckedTextView g;
	private FrameLayout h;
	private MenuItemImpl i;
	private ColorStateList j;
	private boolean k;
	private Drawable l;
	private final b m;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #29  <Int 0x10100a0>
	//    5    7:iastore         
	//    6    8:putstatic       #31  <Field int[] d>
	//*   7   11:return          
	}
}
