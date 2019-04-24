// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.s;
import android.support.v7.widget.av;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.*;

// Referenced classes of package android.support.v7.view.menu:
//			j

public class ListMenuItemView extends LinearLayout
	implements p.a
{

	public ListMenuItemView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.a.a.a.listMenuViewStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #38  <Field int android.support.v7.a.a$a.listMenuViewStyle>
	//    4    6:invokespecial   #41  <Method void ListMenuItemView(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public ListMenuItemView(Context context, AttributeSet attributeset, int i1)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #44  <Method void LinearLayout(Context, AttributeSet)>
		attributeset = ((AttributeSet) (av.a(getContext(), attributeset, android.support.v7.a.a.j.MenuView, i1, 0)));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #48  <Method Context getContext()>
	//    6   10:aload_2         
	//    7   11:getstatic       #54  <Field int[] android.support.v7.a.a$j.MenuView>
	//    8   14:iload_3         
	//    9   15:iconst_0        
	//   10   16:invokestatic    #59  <Method av av.a(Context, AttributeSet, int[], int, int)>
	//   11   19:astore_2        
		h = ((av) (attributeset)).a(android.support.v7.a.a.j.MenuView_android_itemBackground);
	//   12   20:aload_0         
	//   13   21:aload_2         
	//   14   22:getstatic       #62  <Field int android.support.v7.a.a$j.MenuView_android_itemBackground>
	//   15   25:invokevirtual   #65  <Method Drawable av.a(int)>
	//   16   28:putfield        #67  <Field Drawable h>
		i = ((av) (attributeset)).g(android.support.v7.a.a.j.MenuView_android_itemTextAppearance, -1);
	//   17   31:aload_0         
	//   18   32:aload_2         
	//   19   33:getstatic       #70  <Field int android.support.v7.a.a$j.MenuView_android_itemTextAppearance>
	//   20   36:iconst_m1       
	//   21   37:invokevirtual   #73  <Method int av.g(int, int)>
	//   22   40:putfield        #75  <Field int i>
		k = ((av) (attributeset)).a(android.support.v7.a.a.j.MenuView_preserveIconSpacing, false);
	//   23   43:aload_0         
	//   24   44:aload_2         
	//   25   45:getstatic       #78  <Field int android.support.v7.a.a$j.MenuView_preserveIconSpacing>
	//   26   48:iconst_0        
	//   27   49:invokevirtual   #81  <Method boolean av.a(int, boolean)>
	//   28   52:putfield        #83  <Field boolean k>
		j = context;
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:putfield        #85  <Field Context j>
		l = ((av) (attributeset)).a(android.support.v7.a.a.j.MenuView_subMenuArrow);
	//   32   60:aload_0         
	//   33   61:aload_2         
	//   34   62:getstatic       #88  <Field int android.support.v7.a.a$j.MenuView_subMenuArrow>
	//   35   65:invokevirtual   #65  <Method Drawable av.a(int)>
	//   36   68:putfield        #90  <Field Drawable l>
		((av) (attributeset)).a();
	//   37   71:aload_2         
	//   38   72:invokevirtual   #93  <Method void av.a()>
	//   39   75:return          
	}

	private void b()
	{
		b = (ImageView)getInflater().inflate(android.support.v7.a.a.g.abc_list_menu_item_icon, ((android.view.ViewGroup) (this)), false);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #97  <Method LayoutInflater getInflater()>
	//    3    5:getstatic       #102 <Field int android.support.v7.a.a$g.abc_list_menu_item_icon>
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #108 <Method android.view.View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//    7   13:checkcast       #110 <Class ImageView>
	//    8   16:putfield        #112 <Field ImageView b>
		addView(((android.view.View) (b)), 0);
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #112 <Field ImageView b>
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #116 <Method void addView(android.view.View, int)>
	//   14   28:return          
	}

	private void c()
	{
		c = (RadioButton)getInflater().inflate(android.support.v7.a.a.g.abc_list_menu_item_radio, ((android.view.ViewGroup) (this)), false);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #97  <Method LayoutInflater getInflater()>
	//    3    5:getstatic       #119 <Field int android.support.v7.a.a$g.abc_list_menu_item_radio>
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #108 <Method android.view.View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//    7   13:checkcast       #121 <Class RadioButton>
	//    8   16:putfield        #123 <Field RadioButton c>
		addView(((android.view.View) (c)));
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #123 <Field RadioButton c>
	//   12   24:invokevirtual   #126 <Method void addView(android.view.View)>
	//   13   27:return          
	}

	private void d()
	{
		e = (CheckBox)getInflater().inflate(android.support.v7.a.a.g.abc_list_menu_item_checkbox, ((android.view.ViewGroup) (this)), false);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #97  <Method LayoutInflater getInflater()>
	//    3    5:getstatic       #129 <Field int android.support.v7.a.a$g.abc_list_menu_item_checkbox>
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #108 <Method android.view.View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//    7   13:checkcast       #131 <Class CheckBox>
	//    8   16:putfield        #133 <Field CheckBox e>
		addView(((android.view.View) (e)));
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #133 <Field CheckBox e>
	//   12   24:invokevirtual   #126 <Method void addView(android.view.View)>
	//   13   27:return          
	}

	private LayoutInflater getInflater()
	{
		if(n == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #135 <Field LayoutInflater n>
	//*   2    4:ifnonnull       18
			n = LayoutInflater.from(getContext());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #48  <Method Context getContext()>
	//    6   12:invokestatic    #139 <Method LayoutInflater LayoutInflater.from(Context)>
	//    7   15:putfield        #135 <Field LayoutInflater n>
		return n;
	//    8   18:aload_0         
	//    9   19:getfield        #135 <Field LayoutInflater n>
	//   10   22:areturn         
	}

	private void setSubMenuArrowVisible(boolean flag)
	{
		if(g != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field ImageView g>
	//*   2    4:ifnull          29
		{
			ImageView imageview = g;
	//    3    7:aload_0         
	//    4    8:getfield        #143 <Field ImageView g>
	//    5   11:astore_3        
			byte byte0;
			if(flag)
	//*   6   12:iload_1         
	//*   7   13:ifeq            21
				byte0 = 0;
	//    8   16:iconst_0        
	//    9   17:istore_2        
			else
	//*  10   18:goto            24
				byte0 = 8;
	//   11   21:bipush          8
	//   12   23:istore_2        
			imageview.setVisibility(((int) (byte0)));
	//   13   24:aload_3         
	//   14   25:iload_2         
	//   15   26:invokevirtual   #147 <Method void ImageView.setVisibility(int)>
		}
	//   16   29:return          
	}

	public void a(j j1, int i1)
	{
		a = j1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #150 <Field j a>
		m = i1;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #152 <Field int m>
		if(j1.isVisible())
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #158 <Method boolean j.isVisible()>
	//*   8   14:ifeq            22
			i1 = 0;
	//    9   17:iconst_0        
	//   10   18:istore_2        
		else
	//*  11   19:goto            25
			i1 = 8;
	//   12   22:bipush          8
	//   13   24:istore_2        
		setVisibility(i1);
	//   14   25:aload_0         
	//   15   26:iload_2         
	//   16   27:invokevirtual   #159 <Method void setVisibility(int)>
		setTitle(j1.a(((p.a) (this))));
	//   17   30:aload_0         
	//   18   31:aload_1         
	//   19   32:aload_0         
	//   20   33:invokevirtual   #162 <Method CharSequence j.a(p$a)>
	//   21   36:invokevirtual   #166 <Method void setTitle(CharSequence)>
		setCheckable(j1.isCheckable());
	//   22   39:aload_0         
	//   23   40:aload_1         
	//   24   41:invokevirtual   #169 <Method boolean j.isCheckable()>
	//   25   44:invokevirtual   #172 <Method void setCheckable(boolean)>
		a(j1.f(), j1.d());
	//   26   47:aload_0         
	//   27   48:aload_1         
	//   28   49:invokevirtual   #174 <Method boolean j.f()>
	//   29   52:aload_1         
	//   30   53:invokevirtual   #177 <Method char j.d()>
	//   31   56:invokevirtual   #180 <Method void a(boolean, char)>
		setIcon(j1.getIcon());
	//   32   59:aload_0         
	//   33   60:aload_1         
	//   34   61:invokevirtual   #184 <Method Drawable j.getIcon()>
	//   35   64:invokevirtual   #188 <Method void setIcon(Drawable)>
		setEnabled(j1.isEnabled());
	//   36   67:aload_0         
	//   37   68:aload_1         
	//   38   69:invokevirtual   #191 <Method boolean j.isEnabled()>
	//   39   72:invokevirtual   #194 <Method void setEnabled(boolean)>
		setSubMenuArrowVisible(j1.hasSubMenu());
	//   40   75:aload_0         
	//   41   76:aload_1         
	//   42   77:invokevirtual   #197 <Method boolean j.hasSubMenu()>
	//   43   80:invokespecial   #199 <Method void setSubMenuArrowVisible(boolean)>
		setContentDescription(j1.getContentDescription());
	//   44   83:aload_0         
	//   45   84:aload_1         
	//   46   85:invokevirtual   #203 <Method CharSequence j.getContentDescription()>
	//   47   88:invokevirtual   #206 <Method void setContentDescription(CharSequence)>
	//   48   91:return          
	}

	public void a(boolean flag, char c1)
	{
		if(flag && a.f())
	//*   0    0:iload_1         
	//*   1    1:ifeq            19
	//*   2    4:aload_0         
	//*   3    5:getfield        #150 <Field j a>
	//*   4    8:invokevirtual   #174 <Method boolean j.f()>
	//*   5   11:ifeq            19
			c1 = '\0';
	//    6   14:iconst_0        
	//    7   15:istore_2        
		else
	//*   8   16:goto            22
			c1 = '\b';
	//    9   19:bipush          8
	//   10   21:istore_2        
		if(c1 == 0)
	//*  11   22:iload_2         
	//*  12   23:ifne            40
			f.setText(((CharSequence) (a.e())));
	//   13   26:aload_0         
	//   14   27:getfield        #208 <Field TextView f>
	//   15   30:aload_0         
	//   16   31:getfield        #150 <Field j a>
	//   17   34:invokevirtual   #211 <Method String j.e()>
	//   18   37:invokevirtual   #216 <Method void TextView.setText(CharSequence)>
		if(f.getVisibility() != c1)
	//*  19   40:aload_0         
	//*  20   41:getfield        #208 <Field TextView f>
	//*  21   44:invokevirtual   #220 <Method int TextView.getVisibility()>
	//*  22   47:iload_2         
	//*  23   48:icmpeq          59
			f.setVisibility(((int) (c1)));
	//   24   51:aload_0         
	//   25   52:getfield        #208 <Field TextView f>
	//   26   55:iload_2         
	//   27   56:invokevirtual   #221 <Method void TextView.setVisibility(int)>
	//   28   59:return          
	}

	public boolean a()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public j getItemData()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field j a>
	//    2    4:areturn         
	}

	protected void onFinishInflate()
	{
		super.onFinishInflate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #226 <Method void LinearLayout.onFinishInflate()>
		s.a(((android.view.View) (this)), h);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #67  <Field Drawable h>
	//    5    9:invokestatic    #231 <Method void s.a(android.view.View, Drawable)>
		d = (TextView)findViewById(android.support.v7.a.a.f.title);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getstatic       #236 <Field int android.support.v7.a.a$f.title>
	//    9   17:invokevirtual   #240 <Method android.view.View findViewById(int)>
	//   10   20:checkcast       #213 <Class TextView>
	//   11   23:putfield        #242 <Field TextView d>
		if(i != -1)
	//*  12   26:aload_0         
	//*  13   27:getfield        #75  <Field int i>
	//*  14   30:iconst_m1       
	//*  15   31:icmpeq          49
			d.setTextAppearance(j, i);
	//   16   34:aload_0         
	//   17   35:getfield        #242 <Field TextView d>
	//   18   38:aload_0         
	//   19   39:getfield        #85  <Field Context j>
	//   20   42:aload_0         
	//   21   43:getfield        #75  <Field int i>
	//   22   46:invokevirtual   #246 <Method void TextView.setTextAppearance(Context, int)>
		f = (TextView)findViewById(android.support.v7.a.a.f.shortcut);
	//   23   49:aload_0         
	//   24   50:aload_0         
	//   25   51:getstatic       #249 <Field int android.support.v7.a.a$f.shortcut>
	//   26   54:invokevirtual   #240 <Method android.view.View findViewById(int)>
	//   27   57:checkcast       #213 <Class TextView>
	//   28   60:putfield        #208 <Field TextView f>
		g = (ImageView)findViewById(android.support.v7.a.a.f.submenuarrow);
	//   29   63:aload_0         
	//   30   64:aload_0         
	//   31   65:getstatic       #252 <Field int android.support.v7.a.a$f.submenuarrow>
	//   32   68:invokevirtual   #240 <Method android.view.View findViewById(int)>
	//   33   71:checkcast       #110 <Class ImageView>
	//   34   74:putfield        #143 <Field ImageView g>
		if(g != null)
	//*  35   77:aload_0         
	//*  36   78:getfield        #143 <Field ImageView g>
	//*  37   81:ifnull          95
			g.setImageDrawable(l);
	//   38   84:aload_0         
	//   39   85:getfield        #143 <Field ImageView g>
	//   40   88:aload_0         
	//   41   89:getfield        #90  <Field Drawable l>
	//   42   92:invokevirtual   #255 <Method void ImageView.setImageDrawable(Drawable)>
	//   43   95:return          
	}

	protected void onMeasure(int i1, int j1)
	{
		if(b != null && k)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field ImageView b>
	//*   2    4:ifnull          55
	//*   3    7:aload_0         
	//*   4    8:getfield        #83  <Field boolean k>
	//*   5   11:ifeq            55
		{
			android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #261 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//    8   18:astore_3        
			android.widget.LinearLayout.LayoutParams layoutparams1 = (android.widget.LinearLayout.LayoutParams)b.getLayoutParams();
	//    9   19:aload_0         
	//   10   20:getfield        #112 <Field ImageView b>
	//   11   23:invokevirtual   #262 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
	//   12   26:checkcast       #264 <Class android.widget.LinearLayout$LayoutParams>
	//   13   29:astore          4
			if(layoutparams.height > 0 && layoutparams1.width <= 0)
	//*  14   31:aload_3         
	//*  15   32:getfield        #269 <Field int android.view.ViewGroup$LayoutParams.height>
	//*  16   35:ifle            55
	//*  17   38:aload           4
	//*  18   40:getfield        #272 <Field int android.widget.LinearLayout$LayoutParams.width>
	//*  19   43:ifgt            55
				layoutparams1.width = layoutparams.height;
	//   20   46:aload           4
	//   21   48:aload_3         
	//   22   49:getfield        #269 <Field int android.view.ViewGroup$LayoutParams.height>
	//   23   52:putfield        #272 <Field int android.widget.LinearLayout$LayoutParams.width>
		}
		super.onMeasure(i1, j1);
	//   24   55:aload_0         
	//   25   56:iload_1         
	//   26   57:iload_2         
	//   27   58:invokespecial   #274 <Method void LinearLayout.onMeasure(int, int)>
	//   28   61:return          
	}

	public void setCheckable(boolean flag)
	{
		if(!flag && c == null && e == null)
	//*   0    0:iload_1         
	//*   1    1:ifne            19
	//*   2    4:aload_0         
	//*   3    5:getfield        #123 <Field RadioButton c>
	//*   4    8:ifnonnull       19
	//*   5   11:aload_0         
	//*   6   12:getfield        #133 <Field CheckBox e>
	//*   7   15:ifnonnull       19
			return;
	//    8   18:return          
		Object obj;
		Object obj1;
		if(a.g())
	//*   9   19:aload_0         
	//*  10   20:getfield        #150 <Field j a>
	//*  11   23:invokevirtual   #276 <Method boolean j.g()>
	//*  12   26:ifeq            54
		{
			if(c == null)
	//*  13   29:aload_0         
	//*  14   30:getfield        #123 <Field RadioButton c>
	//*  15   33:ifnonnull       40
				c();
	//   16   36:aload_0         
	//   17   37:invokespecial   #278 <Method void c()>
			obj = ((Object) (c));
	//   18   40:aload_0         
	//   19   41:getfield        #123 <Field RadioButton c>
	//   20   44:astore_3        
			obj1 = ((Object) (e));
	//   21   45:aload_0         
	//   22   46:getfield        #133 <Field CheckBox e>
	//   23   49:astore          4
		} else
	//*  24   51:goto            76
		{
			if(e == null)
	//*  25   54:aload_0         
	//*  26   55:getfield        #133 <Field CheckBox e>
	//*  27   58:ifnonnull       65
				d();
	//   28   61:aload_0         
	//   29   62:invokespecial   #280 <Method void d()>
			obj = ((Object) (e));
	//   30   65:aload_0         
	//   31   66:getfield        #133 <Field CheckBox e>
	//   32   69:astore_3        
			obj1 = ((Object) (c));
	//   33   70:aload_0         
	//   34   71:getfield        #123 <Field RadioButton c>
	//   35   74:astore          4
		}
		if(flag)
	//*  36   76:iload_1         
	//*  37   77:ifeq            139
		{
			((CompoundButton) (obj)).setChecked(a.isChecked());
	//   38   80:aload_3         
	//   39   81:aload_0         
	//   40   82:getfield        #150 <Field j a>
	//   41   85:invokevirtual   #283 <Method boolean j.isChecked()>
	//   42   88:invokevirtual   #288 <Method void CompoundButton.setChecked(boolean)>
			byte byte0;
			if(flag)
	//*  43   91:iload_1         
	//*  44   92:ifeq            100
				byte0 = 0;
	//   45   95:iconst_0        
	//   46   96:istore_2        
			else
	//*  47   97:goto            103
				byte0 = 8;
	//   48  100:bipush          8
	//   49  102:istore_2        
			if(((CompoundButton) (obj)).getVisibility() != byte0)
	//*  50  103:aload_3         
	//*  51  104:invokevirtual   #289 <Method int CompoundButton.getVisibility()>
	//*  52  107:iload_2         
	//*  53  108:icmpeq          116
				((CompoundButton) (obj)).setVisibility(((int) (byte0)));
	//   54  111:aload_3         
	//   55  112:iload_2         
	//   56  113:invokevirtual   #290 <Method void CompoundButton.setVisibility(int)>
			if(obj1 != null && ((CompoundButton) (obj1)).getVisibility() != 8)
	//*  57  116:aload           4
	//*  58  118:ifnull          171
	//*  59  121:aload           4
	//*  60  123:invokevirtual   #289 <Method int CompoundButton.getVisibility()>
	//*  61  126:bipush          8
	//*  62  128:icmpeq          171
			{
				((CompoundButton) (obj1)).setVisibility(8);
	//   63  131:aload           4
	//   64  133:bipush          8
	//   65  135:invokevirtual   #290 <Method void CompoundButton.setVisibility(int)>
				return;
	//   66  138:return          
			}
		} else
		{
			if(e != null)
	//*  67  139:aload_0         
	//*  68  140:getfield        #133 <Field CheckBox e>
	//*  69  143:ifnull          155
				e.setVisibility(8);
	//   70  146:aload_0         
	//   71  147:getfield        #133 <Field CheckBox e>
	//   72  150:bipush          8
	//   73  152:invokevirtual   #291 <Method void CheckBox.setVisibility(int)>
			if(c != null)
	//*  74  155:aload_0         
	//*  75  156:getfield        #123 <Field RadioButton c>
	//*  76  159:ifnull          171
				c.setVisibility(8);
	//   77  162:aload_0         
	//   78  163:getfield        #123 <Field RadioButton c>
	//   79  166:bipush          8
	//   80  168:invokevirtual   #292 <Method void RadioButton.setVisibility(int)>
		}
	//   81  171:return          
	}

	public void setChecked(boolean flag)
	{
		Object obj;
		if(a.g())
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field j a>
	//*   2    4:invokevirtual   #276 <Method boolean j.g()>
	//*   3    7:ifeq            29
		{
			if(c == null)
	//*   4   10:aload_0         
	//*   5   11:getfield        #123 <Field RadioButton c>
	//*   6   14:ifnonnull       21
				c();
	//    7   17:aload_0         
	//    8   18:invokespecial   #278 <Method void c()>
			obj = ((Object) (c));
	//    9   21:aload_0         
	//   10   22:getfield        #123 <Field RadioButton c>
	//   11   25:astore_2        
		} else
	//*  12   26:goto            45
		{
			if(e == null)
	//*  13   29:aload_0         
	//*  14   30:getfield        #133 <Field CheckBox e>
	//*  15   33:ifnonnull       40
				d();
	//   16   36:aload_0         
	//   17   37:invokespecial   #280 <Method void d()>
			obj = ((Object) (e));
	//   18   40:aload_0         
	//   19   41:getfield        #133 <Field CheckBox e>
	//   20   44:astore_2        
		}
		((CompoundButton) (obj)).setChecked(flag);
	//   21   45:aload_2         
	//   22   46:iload_1         
	//   23   47:invokevirtual   #288 <Method void CompoundButton.setChecked(boolean)>
	//   24   50:return          
	}

	public void setForceShowIcon(boolean flag)
	{
		o = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #295 <Field boolean o>
		k = flag;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #83  <Field boolean k>
	//    6   10:return          
	}

	public void setIcon(Drawable drawable)
	{
		boolean flag;
		if(!a.i() && !o)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field j a>
	//*   2    4:invokevirtual   #297 <Method boolean j.i()>
	//*   3    7:ifne            25
	//*   4   10:aload_0         
	//*   5   11:getfield        #295 <Field boolean o>
	//*   6   14:ifeq            20
	//*   7   17:goto            25
			flag = false;
	//    8   20:iconst_0        
	//    9   21:istore_2        
		else
	//*  10   22:goto            27
			flag = true;
	//   11   25:iconst_1        
	//   12   26:istore_2        
		if(!flag && !k)
	//*  13   27:iload_2         
	//*  14   28:ifne            39
	//*  15   31:aload_0         
	//*  16   32:getfield        #83  <Field boolean k>
	//*  17   35:ifne            39
			return;
	//   18   38:return          
		if(b == null && drawable == null && !k)
	//*  19   39:aload_0         
	//*  20   40:getfield        #112 <Field ImageView b>
	//*  21   43:ifnonnull       58
	//*  22   46:aload_1         
	//*  23   47:ifnonnull       58
	//*  24   50:aload_0         
	//*  25   51:getfield        #83  <Field boolean k>
	//*  26   54:ifne            58
			return;
	//   27   57:return          
		if(b == null)
	//*  28   58:aload_0         
	//*  29   59:getfield        #112 <Field ImageView b>
	//*  30   62:ifnonnull       69
			b();
	//   31   65:aload_0         
	//   32   66:invokespecial   #299 <Method void b()>
		if(drawable == null && !k)
	//*  33   69:aload_1         
	//*  34   70:ifnonnull       93
	//*  35   73:aload_0         
	//*  36   74:getfield        #83  <Field boolean k>
	//*  37   77:ifeq            83
	//*  38   80:goto            93
		{
			b.setVisibility(8);
	//   39   83:aload_0         
	//   40   84:getfield        #112 <Field ImageView b>
	//   41   87:bipush          8
	//   42   89:invokevirtual   #147 <Method void ImageView.setVisibility(int)>
			return;
	//   43   92:return          
		}
		ImageView imageview = b;
	//   44   93:aload_0         
	//   45   94:getfield        #112 <Field ImageView b>
	//   46   97:astore_3        
		if(!flag)
	//*  47   98:iload_2         
	//*  48   99:ifeq            105
	//*  49  102:goto            107
			drawable = null;
	//   50  105:aconst_null     
	//   51  106:astore_1        
		imageview.setImageDrawable(drawable);
	//   52  107:aload_3         
	//   53  108:aload_1         
	//   54  109:invokevirtual   #255 <Method void ImageView.setImageDrawable(Drawable)>
		if(b.getVisibility() != 0)
	//*  55  112:aload_0         
	//*  56  113:getfield        #112 <Field ImageView b>
	//*  57  116:invokevirtual   #300 <Method int ImageView.getVisibility()>
	//*  58  119:ifeq            130
			b.setVisibility(0);
	//   59  122:aload_0         
	//   60  123:getfield        #112 <Field ImageView b>
	//   61  126:iconst_0        
	//   62  127:invokevirtual   #147 <Method void ImageView.setVisibility(int)>
	//   63  130:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		if(charsequence == null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnull          35
_L1:
		d.setText(charsequence);
	//    2    4:aload_0         
	//    3    5:getfield        #242 <Field TextView d>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #216 <Method void TextView.setText(CharSequence)>
		if(d.getVisibility() == 0) goto _L4; else goto _L3
	//    6   12:aload_0         
	//    7   13:getfield        #242 <Field TextView d>
	//    8   16:invokevirtual   #220 <Method int TextView.getVisibility()>
	//    9   19:ifeq            60
_L3:
		int i1;
		charsequence = ((CharSequence) (d));
	//   10   22:aload_0         
	//   11   23:getfield        #242 <Field TextView d>
	//   12   26:astore_1        
		i1 = 0;
	//   13   27:iconst_0        
	//   14   28:istore_2        
_L5:
		((TextView) (charsequence)).setVisibility(i1);
	//   15   29:aload_1         
	//   16   30:iload_2         
	//   17   31:invokevirtual   #221 <Method void TextView.setVisibility(int)>
		return;
	//   18   34:return          
_L2:
		int j1 = d.getVisibility();
	//   19   35:aload_0         
	//   20   36:getfield        #242 <Field TextView d>
	//   21   39:invokevirtual   #220 <Method int TextView.getVisibility()>
	//   22   42:istore_3        
		i1 = 8;
	//   23   43:bipush          8
	//   24   45:istore_2        
		if(j1 == 8)
			break; /* Loop/switch isn't completed */
	//   25   46:iload_3         
	//   26   47:bipush          8
	//   27   49:icmpeq          60
		charsequence = ((CharSequence) (d));
	//   28   52:aload_0         
	//   29   53:getfield        #242 <Field TextView d>
	//   30   56:astore_1        
		if(true) goto _L5; else goto _L4
	//   31   57:goto            29
_L4:
	//   32   60:return          
	}

	private j a;
	private ImageView b;
	private RadioButton c;
	private TextView d;
	private CheckBox e;
	private TextView f;
	private ImageView g;
	private Drawable h;
	private int i;
	private Context j;
	private boolean k;
	private Drawable l;
	private int m;
	private LayoutInflater n;
	private boolean o;
}
