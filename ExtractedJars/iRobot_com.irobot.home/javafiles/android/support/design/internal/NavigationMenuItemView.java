// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.content.a.b;
import android.support.v4.view.a;
import android.support.v4.view.s;
import android.support.v4.widget.m;
import android.support.v7.view.menu.j;
import android.support.v7.widget.ax;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;

// Referenced classes of package android.support.design.internal:
//			ForegroundLinearLayout

public class NavigationMenuItemView extends ForegroundLinearLayout
	implements android.support.v7.view.menu.p.a
{

	public NavigationMenuItemView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #39  <Method void NavigationMenuItemView(Context, AttributeSet)>
	//    4    6:return          
	}

	public NavigationMenuItemView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #42  <Method void NavigationMenuItemView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public NavigationMenuItemView(Context context, AttributeSet attributeset, int i1)
	{
		super(context, attributeset, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #43  <Method void ForegroundLinearLayout(Context, AttributeSet, int)>
		m = ((a) (new a() {

			public void a(View view, android.support.v4.view.a.b b1)
			{
				super.a(view, b1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #19  <Method void a.a(View, android.support.v4.view.a.b)>
				b1.a(a.c);
			//    4    6:aload_2         
			//    5    7:aload_0         
			//    6    8:getfield        #12  <Field NavigationMenuItemView a>
			//    7   11:getfield        #23  <Field boolean NavigationMenuItemView.c>
			//    8   14:invokevirtual   #28  <Method void android.support.v4.view.a.b.a(boolean)>
			//    9   17:return          
			}

			final NavigationMenuItemView a;

			
			{
				a = NavigationMenuItemView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field NavigationMenuItemView a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void a()>
			//    5    9:return          
			}
		}
));
	//    5    7:aload_0         
	//    6    8:new             #8   <Class NavigationMenuItemView$1>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:invokespecial   #46  <Method void NavigationMenuItemView$1(NavigationMenuItemView)>
	//   10   16:putfield        #48  <Field a m>
		setOrientation(0);
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:invokevirtual   #52  <Method void setOrientation(int)>
		LayoutInflater.from(context).inflate(android.support.design.a.h.design_navigation_menu_item, ((android.view.ViewGroup) (this)), true);
	//   14   24:aload_1         
	//   15   25:invokestatic    #58  <Method LayoutInflater LayoutInflater.from(Context)>
	//   16   28:getstatic       #63  <Field int android.support.design.a$h.design_navigation_menu_item>
	//   17   31:aload_0         
	//   18   32:iconst_1        
	//   19   33:invokevirtual   #67  <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   20   36:pop             
		e = context.getResources().getDimensionPixelSize(android.support.design.a.d.design_navigation_icon_size);
	//   21   37:aload_0         
	//   22   38:aload_1         
	//   23   39:invokevirtual   #73  <Method Resources Context.getResources()>
	//   24   42:getstatic       #78  <Field int android.support.design.a$d.design_navigation_icon_size>
	//   25   45:invokevirtual   #84  <Method int Resources.getDimensionPixelSize(int)>
	//   26   48:putfield        #86  <Field int e>
		g = (CheckedTextView)findViewById(android.support.design.a.f.design_menu_item_text);
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:getstatic       #91  <Field int android.support.design.a$f.design_menu_item_text>
	//   30   56:invokevirtual   #95  <Method View findViewById(int)>
	//   31   59:checkcast       #97  <Class CheckedTextView>
	//   32   62:putfield        #99  <Field CheckedTextView g>
		g.setDuplicateParentStateEnabled(true);
	//   33   65:aload_0         
	//   34   66:getfield        #99  <Field CheckedTextView g>
	//   35   69:iconst_1        
	//   36   70:invokevirtual   #103 <Method void CheckedTextView.setDuplicateParentStateEnabled(boolean)>
		s.a(((View) (g)), m);
	//   37   73:aload_0         
	//   38   74:getfield        #99  <Field CheckedTextView g>
	//   39   77:aload_0         
	//   40   78:getfield        #48  <Field a m>
	//   41   81:invokestatic    #109 <Method void s.a(View, a)>
	//   42   84:return          
	}

	private boolean c()
	{
		return i.getTitle() == null && i.getIcon() == null && i.getActionView() != null;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field j i>
	//    2    4:invokevirtual   #118 <Method CharSequence j.getTitle()>
	//    3    7:ifnonnull       32
	//    4   10:aload_0         
	//    5   11:getfield        #112 <Field j i>
	//    6   14:invokevirtual   #122 <Method Drawable j.getIcon()>
	//    7   17:ifnonnull       32
	//    8   20:aload_0         
	//    9   21:getfield        #112 <Field j i>
	//   10   24:invokevirtual   #126 <Method View j.getActionView()>
	//   11   27:ifnull          32
	//   12   30:iconst_1        
	//   13   31:ireturn         
	//   14   32:iconst_0        
	//   15   33:ireturn         
	}

	private void d()
	{
		if(!c()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokespecial   #128 <Method boolean c()>
	//    2    4:ifeq            50
_L1:
		g.setVisibility(8);
	//    3    7:aload_0         
	//    4    8:getfield        #99  <Field CheckedTextView g>
	//    5   11:bipush          8
	//    6   13:invokevirtual   #131 <Method void CheckedTextView.setVisibility(int)>
		if(h == null) goto _L4; else goto _L3
	//    7   16:aload_0         
	//    8   17:getfield        #133 <Field FrameLayout h>
	//    9   20:ifnull          82
_L3:
		int i1;
		android.support.v7.widget.LinearLayoutCompat.LayoutParams layoutparams;
		layoutparams = (android.support.v7.widget.LinearLayoutCompat.LayoutParams)h.getLayoutParams();
	//   10   23:aload_0         
	//   11   24:getfield        #133 <Field FrameLayout h>
	//   12   27:invokevirtual   #139 <Method android.view.ViewGroup$LayoutParams FrameLayout.getLayoutParams()>
	//   13   30:checkcast       #141 <Class android.support.v7.widget.LinearLayoutCompat$LayoutParams>
	//   14   33:astore_2        
		i1 = -1;
	//   15   34:iconst_m1       
	//   16   35:istore_1        
_L5:
		layoutparams.width = i1;
	//   17   36:aload_2         
	//   18   37:iload_1         
	//   19   38:putfield        #144 <Field int android.support.v7.widget.LinearLayoutCompat$LayoutParams.width>
		h.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   20   41:aload_0         
	//   21   42:getfield        #133 <Field FrameLayout h>
	//   22   45:aload_2         
	//   23   46:invokevirtual   #148 <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		return;
	//   24   49:return          
_L2:
		g.setVisibility(0);
	//   25   50:aload_0         
	//   26   51:getfield        #99  <Field CheckedTextView g>
	//   27   54:iconst_0        
	//   28   55:invokevirtual   #131 <Method void CheckedTextView.setVisibility(int)>
		if(h == null)
			break; /* Loop/switch isn't completed */
	//   29   58:aload_0         
	//   30   59:getfield        #133 <Field FrameLayout h>
	//   31   62:ifnull          82
		layoutparams = (android.support.v7.widget.LinearLayoutCompat.LayoutParams)h.getLayoutParams();
	//   32   65:aload_0         
	//   33   66:getfield        #133 <Field FrameLayout h>
	//   34   69:invokevirtual   #139 <Method android.view.ViewGroup$LayoutParams FrameLayout.getLayoutParams()>
	//   35   72:checkcast       #141 <Class android.support.v7.widget.LinearLayoutCompat$LayoutParams>
	//   36   75:astore_2        
		i1 = -2;
	//   37   76:bipush          -2
	//   38   78:istore_1        
		if(true) goto _L5; else goto _L4
	//   39   79:goto            36
_L4:
	//   40   82:return          
	}

	private StateListDrawable e()
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #151 <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #153 <Method void TypedValue()>
	//    3    7:astore_1        
		if(getContext().getTheme().resolveAttribute(android.support.v7.a.a.a.colorControlHighlight, typedvalue, true))
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #157 <Method Context getContext()>
	//*   6   12:invokevirtual   #161 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*   7   15:getstatic       #166 <Field int android.support.v7.a.a$a.colorControlHighlight>
	//*   8   18:aload_1         
	//*   9   19:iconst_1        
	//*  10   20:invokevirtual   #172 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  11   23:ifeq            69
		{
			StateListDrawable statelistdrawable = new StateListDrawable();
	//   12   26:new             #174 <Class StateListDrawable>
	//   13   29:dup             
	//   14   30:invokespecial   #175 <Method void StateListDrawable()>
	//   15   33:astore_2        
			statelistdrawable.addState(d, ((Drawable) (new ColorDrawable(typedvalue.data))));
	//   16   34:aload_2         
	//   17   35:getstatic       #33  <Field int[] d>
	//   18   38:new             #177 <Class ColorDrawable>
	//   19   41:dup             
	//   20   42:aload_1         
	//   21   43:getfield        #180 <Field int TypedValue.data>
	//   22   46:invokespecial   #182 <Method void ColorDrawable(int)>
	//   23   49:invokevirtual   #186 <Method void StateListDrawable.addState(int[], Drawable)>
			statelistdrawable.addState(EMPTY_STATE_SET, ((Drawable) (new ColorDrawable(0))));
	//   24   52:aload_2         
	//   25   53:getstatic       #189 <Field int[] EMPTY_STATE_SET>
	//   26   56:new             #177 <Class ColorDrawable>
	//   27   59:dup             
	//   28   60:iconst_0        
	//   29   61:invokespecial   #182 <Method void ColorDrawable(int)>
	//   30   64:invokevirtual   #186 <Method void StateListDrawable.addState(int[], Drawable)>
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
	//*   3    5:getfield        #133 <Field FrameLayout h>
	//*   4    8:ifnonnull       31
				h = (FrameLayout)((ViewStub)findViewById(android.support.design.a.f.design_menu_item_action_area_stub)).inflate();
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getstatic       #194 <Field int android.support.design.a$f.design_menu_item_action_area_stub>
	//    8   16:invokevirtual   #95  <Method View findViewById(int)>
	//    9   19:checkcast       #196 <Class ViewStub>
	//   10   22:invokevirtual   #198 <Method View ViewStub.inflate()>
	//   11   25:checkcast       #135 <Class FrameLayout>
	//   12   28:putfield        #133 <Field FrameLayout h>
			h.removeAllViews();
	//   13   31:aload_0         
	//   14   32:getfield        #133 <Field FrameLayout h>
	//   15   35:invokevirtual   #201 <Method void FrameLayout.removeAllViews()>
			h.addView(view);
	//   16   38:aload_0         
	//   17   39:getfield        #133 <Field FrameLayout h>
	//   18   42:aload_1         
	//   19   43:invokevirtual   #204 <Method void FrameLayout.addView(View)>
		}
	//   20   46:return          
	}

	public void a(j j1, int i1)
	{
		i = j1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #112 <Field j i>
		if(j1.isVisible())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #208 <Method boolean j.isVisible()>
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
	//   13   22:invokevirtual   #209 <Method void setVisibility(int)>
		if(getBackground() == null)
	//*  14   25:aload_0         
	//*  15   26:invokevirtual   #212 <Method Drawable getBackground()>
	//*  16   29:ifnonnull       40
			s.a(((View) (this)), ((Drawable) (e())));
	//   17   32:aload_0         
	//   18   33:aload_0         
	//   19   34:invokespecial   #214 <Method StateListDrawable e()>
	//   20   37:invokestatic    #217 <Method void s.a(View, Drawable)>
		setCheckable(j1.isCheckable());
	//   21   40:aload_0         
	//   22   41:aload_1         
	//   23   42:invokevirtual   #220 <Method boolean j.isCheckable()>
	//   24   45:invokevirtual   #223 <Method void setCheckable(boolean)>
		setChecked(j1.isChecked());
	//   25   48:aload_0         
	//   26   49:aload_1         
	//   27   50:invokevirtual   #226 <Method boolean j.isChecked()>
	//   28   53:invokevirtual   #229 <Method void setChecked(boolean)>
		setEnabled(j1.isEnabled());
	//   29   56:aload_0         
	//   30   57:aload_1         
	//   31   58:invokevirtual   #232 <Method boolean j.isEnabled()>
	//   32   61:invokevirtual   #235 <Method void setEnabled(boolean)>
		setTitle(j1.getTitle());
	//   33   64:aload_0         
	//   34   65:aload_1         
	//   35   66:invokevirtual   #118 <Method CharSequence j.getTitle()>
	//   36   69:invokevirtual   #239 <Method void setTitle(CharSequence)>
		setIcon(j1.getIcon());
	//   37   72:aload_0         
	//   38   73:aload_1         
	//   39   74:invokevirtual   #122 <Method Drawable j.getIcon()>
	//   40   77:invokevirtual   #243 <Method void setIcon(Drawable)>
		setActionView(j1.getActionView());
	//   41   80:aload_0         
	//   42   81:aload_1         
	//   43   82:invokevirtual   #126 <Method View j.getActionView()>
	//   44   85:invokespecial   #245 <Method void setActionView(View)>
		setContentDescription(j1.getContentDescription());
	//   45   88:aload_0         
	//   46   89:aload_1         
	//   47   90:invokevirtual   #248 <Method CharSequence j.getContentDescription()>
	//   48   93:invokevirtual   #251 <Method void setContentDescription(CharSequence)>
		ax.a(((View) (this)), j1.getTooltipText());
	//   49   96:aload_0         
	//   50   97:aload_1         
	//   51   98:invokevirtual   #254 <Method CharSequence j.getTooltipText()>
	//   52  101:invokestatic    #259 <Method void ax.a(View, CharSequence)>
		d();
	//   53  104:aload_0         
	//   54  105:invokespecial   #261 <Method void d()>
	//   55  108:return          
	}

	public boolean a()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void b()
	{
		if(h != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #133 <Field FrameLayout h>
	//*   2    4:ifnull          14
			h.removeAllViews();
	//    3    7:aload_0         
	//    4    8:getfield        #133 <Field FrameLayout h>
	//    5   11:invokevirtual   #201 <Method void FrameLayout.removeAllViews()>
		g.setCompoundDrawables(((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)));
	//    6   14:aload_0         
	//    7   15:getfield        #99  <Field CheckedTextView g>
	//    8   18:aconst_null     
	//    9   19:aconst_null     
	//   10   20:aconst_null     
	//   11   21:aconst_null     
	//   12   22:invokevirtual   #266 <Method void CheckedTextView.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
	//   13   25:return          
	}

	public j getItemData()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field j i>
	//    2    4:areturn         
	}

	protected int[] onCreateDrawableState(int i1)
	{
		int ai[] = super.onCreateDrawableState(i1 + 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:iadd            
	//    4    4:invokespecial   #272 <Method int[] ForegroundLinearLayout.onCreateDrawableState(int)>
	//    5    7:astore_2        
		if(i != null && i.isCheckable() && i.isChecked())
	//*   6    8:aload_0         
	//*   7    9:getfield        #112 <Field j i>
	//*   8   12:ifnull          43
	//*   9   15:aload_0         
	//*  10   16:getfield        #112 <Field j i>
	//*  11   19:invokevirtual   #220 <Method boolean j.isCheckable()>
	//*  12   22:ifeq            43
	//*  13   25:aload_0         
	//*  14   26:getfield        #112 <Field j i>
	//*  15   29:invokevirtual   #226 <Method boolean j.isChecked()>
	//*  16   32:ifeq            43
			mergeDrawableStates(ai, d);
	//   17   35:aload_2         
	//   18   36:getstatic       #33  <Field int[] d>
	//   19   39:invokestatic    #276 <Method int[] mergeDrawableStates(int[], int[])>
	//   20   42:pop             
		return ai;
	//   21   43:aload_2         
	//   22   44:areturn         
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
			m.a(((View) (g)), 2048);
	//    9   17:aload_0         
	//   10   18:getfield        #48  <Field a m>
	//   11   21:aload_0         
	//   12   22:getfield        #99  <Field CheckedTextView g>
	//   13   25:sipush          2048
	//   14   28:invokevirtual   #286 <Method void a.a(View, int)>
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
	//    3    5:getfield        #99  <Field CheckedTextView g>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #287 <Method void CheckedTextView.setChecked(boolean)>
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
			if(k)
	//*   4    6:aload_0         
	//*   5    7:getfield        #289 <Field boolean k>
	//*   6   10:ifeq            46
			{
				obj = ((Object) (drawable.getConstantState()));
	//    7   13:aload_1         
	//    8   14:invokevirtual   #295 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//    9   17:astore_2        
				if(obj != null)
	//*  10   18:aload_2         
	//*  11   19:ifnonnull       25
	//*  12   22:goto            30
					drawable = ((android.graphics.drawable.Drawable.ConstantState) (obj)).newDrawable();
	//   13   25:aload_2         
	//   14   26:invokevirtual   #300 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
	//   15   29:astore_1        
				obj = ((Object) (android.support.v4.a.a.a.g(drawable).mutate()));
	//   16   30:aload_1         
	//   17   31:invokestatic    #305 <Method Drawable android.support.v4.a.a.a.g(Drawable)>
	//   18   34:invokevirtual   #308 <Method Drawable Drawable.mutate()>
	//   19   37:astore_2        
				android.support.v4.a.a.a.a(((Drawable) (obj)), j);
	//   20   38:aload_2         
	//   21   39:aload_0         
	//   22   40:getfield        #310 <Field ColorStateList j>
	//   23   43:invokestatic    #313 <Method void android.support.v4.a.a.a.a(Drawable, ColorStateList)>
			}
			((Drawable) (obj)).setBounds(0, 0, e, e);
	//   24   46:aload_2         
	//   25   47:iconst_0        
	//   26   48:iconst_0        
	//   27   49:aload_0         
	//   28   50:getfield        #86  <Field int e>
	//   29   53:aload_0         
	//   30   54:getfield        #86  <Field int e>
	//   31   57:invokevirtual   #317 <Method void Drawable.setBounds(int, int, int, int)>
			drawable = ((Drawable) (obj));
	//   32   60:aload_2         
	//   33   61:astore_1        
		} else
	//*  34   62:goto            129
		if(f)
	//*  35   65:aload_0         
	//*  36   66:getfield        #319 <Field boolean f>
	//*  37   69:ifeq            129
		{
			if(l == null)
	//*  38   72:aload_0         
	//*  39   73:getfield        #321 <Field Drawable l>
	//*  40   76:ifnonnull       124
			{
				l = android.support.v4.content.a.b.a(getResources(), android.support.design.a.e.navigation_empty_icon, getContext().getTheme());
	//   41   79:aload_0         
	//   42   80:aload_0         
	//   43   81:invokevirtual   #322 <Method Resources getResources()>
	//   44   84:getstatic       #327 <Field int android.support.design.a$e.navigation_empty_icon>
	//   45   87:aload_0         
	//   46   88:invokevirtual   #157 <Method Context getContext()>
	//   47   91:invokevirtual   #161 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   48   94:invokestatic    #332 <Method Drawable b.a(Resources, int, android.content.res.Resources$Theme)>
	//   49   97:putfield        #321 <Field Drawable l>
				if(l != null)
	//*  50  100:aload_0         
	//*  51  101:getfield        #321 <Field Drawable l>
	//*  52  104:ifnull          124
					l.setBounds(0, 0, e, e);
	//   53  107:aload_0         
	//   54  108:getfield        #321 <Field Drawable l>
	//   55  111:iconst_0        
	//   56  112:iconst_0        
	//   57  113:aload_0         
	//   58  114:getfield        #86  <Field int e>
	//   59  117:aload_0         
	//   60  118:getfield        #86  <Field int e>
	//   61  121:invokevirtual   #317 <Method void Drawable.setBounds(int, int, int, int)>
			}
			drawable = l;
	//   62  124:aload_0         
	//   63  125:getfield        #321 <Field Drawable l>
	//   64  128:astore_1        
		}
		android.support.v4.widget.m.a(((android.widget.TextView) (g)), drawable, ((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)));
	//   65  129:aload_0         
	//   66  130:getfield        #99  <Field CheckedTextView g>
	//   67  133:aload_1         
	//   68  134:aconst_null     
	//   69  135:aconst_null     
	//   70  136:aconst_null     
	//   71  137:invokestatic    #337 <Method void m.a(android.widget.TextView, Drawable, Drawable, Drawable, Drawable)>
	//   72  140:return          
	}

	void setIconTintList(ColorStateList colorstatelist)
	{
		j = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #310 <Field ColorStateList j>
		boolean flag;
		if(j != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #310 <Field ColorStateList j>
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
	//   13   21:putfield        #289 <Field boolean k>
		if(i != null)
	//*  14   24:aload_0         
	//*  15   25:getfield        #112 <Field j i>
	//*  16   28:ifnull          42
			setIcon(i.getIcon());
	//   17   31:aload_0         
	//   18   32:aload_0         
	//   19   33:getfield        #112 <Field j i>
	//   20   36:invokevirtual   #122 <Method Drawable j.getIcon()>
	//   21   39:invokevirtual   #243 <Method void setIcon(Drawable)>
	//   22   42:return          
	}

	public void setNeedsEmptyIcon(boolean flag)
	{
		f = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #319 <Field boolean f>
	//    3    5:return          
	}

	public void setTextAppearance(int i1)
	{
		android.support.v4.widget.m.a(((android.widget.TextView) (g)), i1);
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field CheckedTextView g>
	//    2    4:iload_1         
	//    3    5:invokestatic    #344 <Method void m.a(android.widget.TextView, int)>
	//    4    8:return          
	}

	public void setTextColor(ColorStateList colorstatelist)
	{
		g.setTextColor(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field CheckedTextView g>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #347 <Method void CheckedTextView.setTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		g.setText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field CheckedTextView g>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #350 <Method void CheckedTextView.setText(CharSequence)>
	//    4    8:return          
	}

	private static final int d[] = {
		0x10100a0
	};
	boolean c;
	private final int e;
	private boolean f;
	private final CheckedTextView g;
	private FrameLayout h;
	private j i;
	private ColorStateList j;
	private boolean k;
	private Drawable l;
	private final a m;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #31  <Int 0x10100a0>
	//    5    7:iastore         
	//    6    8:putstatic       #33  <Field int[] d>
	//*   7   11:return          
	}
}
