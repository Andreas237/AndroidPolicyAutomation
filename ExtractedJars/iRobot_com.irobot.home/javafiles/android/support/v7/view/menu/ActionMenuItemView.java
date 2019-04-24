// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.*;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.*;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package android.support.v7.view.menu:
//			j, s

public class ActionMenuItemView extends AppCompatTextView
	implements p.a, android.support.v7.widget.ActionMenuView.a, android.view.View.OnClickListener
{
	private class a extends ac
	{

		public s a()
		{
			if(a.c != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #12  <Field ActionMenuItemView a>
		//*   2    4:getfield        #21  <Field ActionMenuItemView$b ActionMenuItemView.c>
		//*   3    7:ifnull          21
				return a.c.a();
		//    4   10:aload_0         
		//    5   11:getfield        #12  <Field ActionMenuItemView a>
		//    6   14:getfield        #21  <Field ActionMenuItemView$b ActionMenuItemView.c>
		//    7   17:invokevirtual   #25  <Method s ActionMenuItemView$b.a()>
		//    8   20:areturn         
			else
				return null;
		//    9   21:aconst_null     
		//   10   22:areturn         
		}

		protected boolean b()
		{
			h.b b1 = a.b;
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field ActionMenuItemView a>
		//    2    4:getfield        #30  <Field h$b ActionMenuItemView.b>
		//    3    7:astore_3        
			boolean flag1 = false;
		//    4    8:iconst_0        
		//    5    9:istore_2        
			boolean flag = flag1;
		//    6   10:iload_2         
		//    7   11:istore_1        
			if(b1 != null)
		//*   8   12:aload_3         
		//*   9   13:ifnull          64
			{
				flag = flag1;
		//   10   16:iload_2         
		//   11   17:istore_1        
				if(a.b.a(a.a))
		//*  12   18:aload_0         
		//*  13   19:getfield        #12  <Field ActionMenuItemView a>
		//*  14   22:getfield        #30  <Field h$b ActionMenuItemView.b>
		//*  15   25:aload_0         
		//*  16   26:getfield        #12  <Field ActionMenuItemView a>
		//*  17   29:getfield        #33  <Field j ActionMenuItemView.a>
		//*  18   32:invokeinterface #38  <Method boolean h$b.a(j)>
		//*  19   37:ifeq            64
				{
					s s1 = a();
		//   20   40:aload_0         
		//   21   41:invokevirtual   #39  <Method s a()>
		//   22   44:astore_3        
					flag = flag1;
		//   23   45:iload_2         
		//   24   46:istore_1        
					if(s1 != null)
		//*  25   47:aload_3         
		//*  26   48:ifnull          64
					{
						flag = flag1;
		//   27   51:iload_2         
		//   28   52:istore_1        
						if(s1.f())
		//*  29   53:aload_3         
		//*  30   54:invokeinterface #44  <Method boolean s.f()>
		//*  31   59:ifeq            64
							flag = true;
		//   32   62:iconst_1        
		//   33   63:istore_1        
					}
				}
			}
			return flag;
		//   34   64:iload_1         
		//   35   65:ireturn         
		}

		final ActionMenuItemView a;

		public a()
		{
			a = ActionMenuItemView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field ActionMenuItemView a>
			super(((View) (ActionMenuItemView.this)));
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #15  <Method void ac(View)>
		//    6   10:return          
		}
	}

	public static abstract class b
	{

		public abstract s a();

		public b()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	public ActionMenuItemView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #38  <Method void ActionMenuItemView(Context, AttributeSet)>
	//    4    6:return          
	}

	public ActionMenuItemView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #42  <Method void ActionMenuItemView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public ActionMenuItemView(Context context, AttributeSet attributeset, int l)
	{
		super(context, attributeset, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #43  <Method void AppCompatTextView(Context, AttributeSet, int)>
		Resources resources = context.getResources();
	//    5    7:aload_1         
	//    6    8:invokevirtual   #49  <Method Resources Context.getResources()>
	//    7   11:astore          4
		g = e();
	//    8   13:aload_0         
	//    9   14:aload_0         
	//   10   15:invokespecial   #52  <Method boolean e()>
	//   11   18:putfield        #54  <Field boolean g>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.a.a.j.ActionMenuItemView, l, 0)));
	//   12   21:aload_1         
	//   13   22:aload_2         
	//   14   23:getstatic       #60  <Field int[] android.support.v7.a.a$j.ActionMenuItemView>
	//   15   26:iload_3         
	//   16   27:iconst_0        
	//   17   28:invokevirtual   #64  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   18   31:astore_1        
		i = ((TypedArray) (context)).getDimensionPixelSize(android.support.v7.a.a.j.ActionMenuItemView_android_minWidth, 0);
	//   19   32:aload_0         
	//   20   33:aload_1         
	//   21   34:getstatic       #67  <Field int android.support.v7.a.a$j.ActionMenuItemView_android_minWidth>
	//   22   37:iconst_0        
	//   23   38:invokevirtual   #73  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   24   41:putfield        #75  <Field int i>
		((TypedArray) (context)).recycle();
	//   25   44:aload_1         
	//   26   45:invokevirtual   #79  <Method void TypedArray.recycle()>
		k = (int)(resources.getDisplayMetrics().density * 32F + 0.5F);
	//   27   48:aload_0         
	//   28   49:aload           4
	//   29   51:invokevirtual   #85  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   30   54:getfield        #91  <Field float DisplayMetrics.density>
	//   31   57:ldc1            #92  <Float 32F>
	//   32   59:fmul            
	//   33   60:ldc1            #93  <Float 0.5F>
	//   34   62:fadd            
	//   35   63:f2i             
	//   36   64:putfield        #95  <Field int k>
		setOnClickListener(((android.view.View.OnClickListener) (this)));
	//   37   67:aload_0         
	//   38   68:aload_0         
	//   39   69:invokevirtual   #99  <Method void setOnClickListener(android.view.View$OnClickListener)>
		j = -1;
	//   40   72:aload_0         
	//   41   73:iconst_m1       
	//   42   74:putfield        #101 <Field int j>
		setSaveEnabled(false);
	//   43   77:aload_0         
	//   44   78:iconst_0        
	//   45   79:invokevirtual   #105 <Method void setSaveEnabled(boolean)>
	//   46   82:return          
	}

	private boolean e()
	{
		Configuration configuration = getContext().getResources().getConfiguration();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #109 <Method Context getContext()>
	//    2    4:invokevirtual   #49  <Method Resources Context.getResources()>
	//    3    7:invokevirtual   #113 <Method Configuration Resources.getConfiguration()>
	//    4   10:astore_3        
		int l = configuration.screenWidthDp;
	//    5   11:aload_3         
	//    6   12:getfield        #118 <Field int Configuration.screenWidthDp>
	//    7   15:istore_1        
		int i1 = configuration.screenHeightDp;
	//    8   16:aload_3         
	//    9   17:getfield        #121 <Field int Configuration.screenHeightDp>
	//   10   20:istore_2        
		return l >= 480 || l >= 640 && i1 >= 480 || configuration.orientation == 2;
	//   11   21:iload_1         
	//   12   22:sipush          480
	//   13   25:icmpge          55
	//   14   28:iload_1         
	//   15   29:sipush          640
	//   16   32:icmplt          42
	//   17   35:iload_2         
	//   18   36:sipush          480
	//   19   39:icmpge          55
	//   20   42:aload_3         
	//   21   43:getfield        #124 <Field int Configuration.orientation>
	//   22   46:iconst_2        
	//   23   47:icmpne          53
	//   24   50:goto            55
	//   25   53:iconst_0        
	//   26   54:ireturn         
	//   27   55:iconst_1        
	//   28   56:ireturn         
	}

	private void f()
	{
		boolean flag;
		boolean flag2;
label0:
		{
			flag2 = TextUtils.isEmpty(d);
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field CharSequence d>
	//    2    4:invokestatic    #132 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    3    7:istore_3        
			boolean flag1 = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
			flag = flag1;
	//    6   10:iload_2         
	//    7   11:istore_1        
			if(e == null)
				break label0;
	//    8   12:aload_0         
	//    9   13:getfield        #134 <Field Drawable e>
	//   10   16:ifnull          52
			if(a.m())
	//*  11   19:aload_0         
	//*  12   20:getfield        #136 <Field j a>
	//*  13   23:invokevirtual   #141 <Method boolean j.m()>
	//*  14   26:ifeq            50
			{
				flag = flag1;
	//   15   29:iload_2         
	//   16   30:istore_1        
				if(g)
					break label0;
	//   17   31:aload_0         
	//   18   32:getfield        #54  <Field boolean g>
	//   19   35:ifne            52
				if(h)
	//*  20   38:aload_0         
	//*  21   39:getfield        #143 <Field boolean h>
	//*  22   42:ifeq            50
				{
					flag = flag1;
	//   23   45:iload_2         
	//   24   46:istore_1        
					break label0;
	//   25   47:goto            52
				}
			}
			flag = false;
	//   26   50:iconst_0        
	//   27   51:istore_1        
		}
		flag = (flag2 ^ true) & flag;
	//   28   52:iload_3         
	//   29   53:iconst_1        
	//   30   54:ixor            
	//   31   55:iload_1         
	//   32   56:iand            
	//   33   57:istore_1        
		Object obj = null;
	//   34   58:aconst_null     
	//   35   59:astore          5
		CharSequence charsequence;
		if(flag)
	//*  36   61:iload_1         
	//*  37   62:ifeq            74
			charsequence = d;
	//   38   65:aload_0         
	//   39   66:getfield        #126 <Field CharSequence d>
	//   40   69:astore          4
		else
	//*  41   71:goto            77
			charsequence = null;
	//   42   74:aconst_null     
	//   43   75:astore          4
		setText(charsequence);
	//   44   77:aload_0         
	//   45   78:aload           4
	//   46   80:invokevirtual   #147 <Method void setText(CharSequence)>
		CharSequence charsequence1 = a.getContentDescription();
	//   47   83:aload_0         
	//   48   84:getfield        #136 <Field j a>
	//   49   87:invokevirtual   #151 <Method CharSequence j.getContentDescription()>
	//   50   90:astore          6
		charsequence = charsequence1;
	//   51   92:aload           6
	//   52   94:astore          4
		if(TextUtils.isEmpty(charsequence1))
	//*  53   96:aload           6
	//*  54   98:invokestatic    #132 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  55  101:ifeq            123
			if(flag)
	//*  56  104:iload_1         
	//*  57  105:ifeq            114
				charsequence = null;
	//   58  108:aconst_null     
	//   59  109:astore          4
			else
	//*  60  111:goto            123
				charsequence = a.getTitle();
	//   61  114:aload_0         
	//   62  115:getfield        #136 <Field j a>
	//   63  118:invokevirtual   #154 <Method CharSequence j.getTitle()>
	//   64  121:astore          4
		setContentDescription(charsequence);
	//   65  123:aload_0         
	//   66  124:aload           4
	//   67  126:invokevirtual   #157 <Method void setContentDescription(CharSequence)>
		charsequence = a.getTooltipText();
	//   68  129:aload_0         
	//   69  130:getfield        #136 <Field j a>
	//   70  133:invokevirtual   #160 <Method CharSequence j.getTooltipText()>
	//   71  136:astore          4
		if(TextUtils.isEmpty(charsequence))
	//*  72  138:aload           4
	//*  73  140:invokestatic    #132 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  74  143:ifeq            173
		{
			if(flag)
	//*  75  146:iload_1         
	//*  76  147:ifeq            157
				charsequence = ((CharSequence) (obj));
	//   77  150:aload           5
	//   78  152:astore          4
			else
	//*  79  154:goto            166
				charsequence = a.getTitle();
	//   80  157:aload_0         
	//   81  158:getfield        #136 <Field j a>
	//   82  161:invokevirtual   #154 <Method CharSequence j.getTitle()>
	//   83  164:astore          4
			ax.a(((View) (this)), charsequence);
	//   84  166:aload_0         
	//   85  167:aload           4
	//   86  169:invokestatic    #165 <Method void ax.a(View, CharSequence)>
			return;
	//   87  172:return          
		} else
		{
			ax.a(((View) (this)), charsequence);
	//   88  173:aload_0         
	//   89  174:aload           4
	//   90  176:invokestatic    #165 <Method void ax.a(View, CharSequence)>
			return;
	//   91  179:return          
		}
	}

	public void a(j j1, int l)
	{
		a = j1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #136 <Field j a>
		setIcon(j1.getIcon());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #170 <Method Drawable j.getIcon()>
	//    6   10:invokevirtual   #174 <Method void setIcon(Drawable)>
		setTitle(j1.a(((p.a) (this))));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #177 <Method CharSequence j.a(p$a)>
	//   11   19:invokevirtual   #180 <Method void setTitle(CharSequence)>
		setId(j1.getItemId());
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #184 <Method int j.getItemId()>
	//   15   27:invokevirtual   #188 <Method void setId(int)>
		if(j1.isVisible())
	//*  16   30:aload_1         
	//*  17   31:invokevirtual   #191 <Method boolean j.isVisible()>
	//*  18   34:ifeq            42
			l = 0;
	//   19   37:iconst_0        
	//   20   38:istore_2        
		else
	//*  21   39:goto            45
			l = 8;
	//   22   42:bipush          8
	//   23   44:istore_2        
		setVisibility(l);
	//   24   45:aload_0         
	//   25   46:iload_2         
	//   26   47:invokevirtual   #194 <Method void setVisibility(int)>
		setEnabled(j1.isEnabled());
	//   27   50:aload_0         
	//   28   51:aload_1         
	//   29   52:invokevirtual   #197 <Method boolean j.isEnabled()>
	//   30   55:invokevirtual   #200 <Method void setEnabled(boolean)>
		if(j1.hasSubMenu() && f == null)
	//*  31   58:aload_1         
	//*  32   59:invokevirtual   #203 <Method boolean j.hasSubMenu()>
	//*  33   62:ifeq            84
	//*  34   65:aload_0         
	//*  35   66:getfield        #205 <Field ac f>
	//*  36   69:ifnonnull       84
			f = ((ac) (new a()));
	//   37   72:aload_0         
	//   38   73:new             #12  <Class ActionMenuItemView$a>
	//   39   76:dup             
	//   40   77:aload_0         
	//   41   78:invokespecial   #208 <Method void ActionMenuItemView$a(ActionMenuItemView)>
	//   42   81:putfield        #205 <Field ac f>
	//   43   84:return          
	}

	public boolean a()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean b()
	{
		return TextUtils.isEmpty(getText()) ^ true;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #211 <Method CharSequence getText()>
	//    2    4:invokestatic    #132 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    3    7:iconst_1        
	//    4    8:ixor            
	//    5    9:ireturn         
	}

	public boolean c()
	{
		return b() && a.getIcon() == null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #213 <Method boolean b()>
	//    2    4:ifeq            19
	//    3    7:aload_0         
	//    4    8:getfield        #136 <Field j a>
	//    5   11:invokevirtual   #170 <Method Drawable j.getIcon()>
	//    6   14:ifnonnull       19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean d()
	{
		return b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #213 <Method boolean b()>
	//    2    4:ireturn         
	}

	public j getItemData()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field j a>
	//    2    4:areturn         
	}

	public void onClick(View view)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #219 <Field h$b b>
	//*   2    4:ifnull          21
			b.a(a);
	//    3    7:aload_0         
	//    4    8:getfield        #219 <Field h$b b>
	//    5   11:aload_0         
	//    6   12:getfield        #136 <Field j a>
	//    7   15:invokeinterface #224 <Method boolean h$b.a(j)>
	//    8   20:pop             
	//    9   21:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #228 <Method void AppCompatTextView.onConfigurationChanged(Configuration)>
		g = e();
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokespecial   #52  <Method boolean e()>
	//    6   10:putfield        #54  <Field boolean g>
		f();
	//    7   13:aload_0         
	//    8   14:invokespecial   #230 <Method void f()>
	//    9   17:return          
	}

	protected void onMeasure(int l, int i1)
	{
		boolean flag = b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #213 <Method boolean b()>
	//    2    4:istore          5
		if(flag && j >= 0)
	//*   3    6:iload           5
	//*   4    8:ifeq            38
	//*   5   11:aload_0         
	//*   6   12:getfield        #101 <Field int j>
	//*   7   15:iflt            38
			super.setPadding(j, getPaddingTop(), getPaddingRight(), getPaddingBottom());
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #101 <Field int j>
	//   11   23:aload_0         
	//   12   24:invokevirtual   #235 <Method int getPaddingTop()>
	//   13   27:aload_0         
	//   14   28:invokevirtual   #238 <Method int getPaddingRight()>
	//   15   31:aload_0         
	//   16   32:invokevirtual   #241 <Method int getPaddingBottom()>
	//   17   35:invokespecial   #245 <Method void AppCompatTextView.setPadding(int, int, int, int)>
		super.onMeasure(l, i1);
	//   18   38:aload_0         
	//   19   39:iload_1         
	//   20   40:iload_2         
	//   21   41:invokespecial   #247 <Method void AppCompatTextView.onMeasure(int, int)>
		int j1 = android.view.View.MeasureSpec.getMode(l);
	//   22   44:iload_1         
	//   23   45:invokestatic    #253 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   24   48:istore_3        
		l = android.view.View.MeasureSpec.getSize(l);
	//   25   49:iload_1         
	//   26   50:invokestatic    #256 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   27   53:istore_1        
		int k1 = getMeasuredWidth();
	//   28   54:aload_0         
	//   29   55:invokevirtual   #259 <Method int getMeasuredWidth()>
	//   30   58:istore          4
		if(j1 == 0x80000000)
	//*  31   60:iload_3         
	//*  32   61:ldc2            #260 <Int 0x80000000>
	//*  33   64:icmpne          79
			l = Math.min(l, i);
	//   34   67:iload_1         
	//   35   68:aload_0         
	//   36   69:getfield        #75  <Field int i>
	//   37   72:invokestatic    #265 <Method int Math.min(int, int)>
	//   38   75:istore_1        
		else
	//*  39   76:goto            84
			l = i;
	//   40   79:aload_0         
	//   41   80:getfield        #75  <Field int i>
	//   42   83:istore_1        
		if(j1 != 0x40000000 && i > 0 && k1 < l)
	//*  43   84:iload_3         
	//*  44   85:ldc2            #266 <Int 0x40000000>
	//*  45   88:icmpeq          116
	//*  46   91:aload_0         
	//*  47   92:getfield        #75  <Field int i>
	//*  48   95:ifle            116
	//*  49   98:iload           4
	//*  50  100:iload_1         
	//*  51  101:icmpge          116
			super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000), i1);
	//   52  104:aload_0         
	//   53  105:iload_1         
	//   54  106:ldc2            #266 <Int 0x40000000>
	//   55  109:invokestatic    #269 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   56  112:iload_2         
	//   57  113:invokespecial   #247 <Method void AppCompatTextView.onMeasure(int, int)>
		if(!flag && e != null)
	//*  58  116:iload           5
	//*  59  118:ifne            161
	//*  60  121:aload_0         
	//*  61  122:getfield        #134 <Field Drawable e>
	//*  62  125:ifnull          161
			super.setPadding((getMeasuredWidth() - e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
	//   63  128:aload_0         
	//   64  129:aload_0         
	//   65  130:invokevirtual   #259 <Method int getMeasuredWidth()>
	//   66  133:aload_0         
	//   67  134:getfield        #134 <Field Drawable e>
	//   68  137:invokevirtual   #275 <Method Rect Drawable.getBounds()>
	//   69  140:invokevirtual   #280 <Method int Rect.width()>
	//   70  143:isub            
	//   71  144:iconst_2        
	//   72  145:idiv            
	//   73  146:aload_0         
	//   74  147:invokevirtual   #235 <Method int getPaddingTop()>
	//   75  150:aload_0         
	//   76  151:invokevirtual   #238 <Method int getPaddingRight()>
	//   77  154:aload_0         
	//   78  155:invokevirtual   #241 <Method int getPaddingBottom()>
	//   79  158:invokespecial   #245 <Method void AppCompatTextView.setPadding(int, int, int, int)>
	//   80  161:return          
	}

	public void onRestoreInstanceState(Parcelable parcelable)
	{
		super.onRestoreInstanceState(((Parcelable) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #284 <Method void AppCompatTextView.onRestoreInstanceState(Parcelable)>
	//    3    5:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(a.hasSubMenu() && f != null && f.onTouch(((View) (this)), motionevent))
	//*   0    0:aload_0         
	//*   1    1:getfield        #136 <Field j a>
	//*   2    4:invokevirtual   #203 <Method boolean j.hasSubMenu()>
	//*   3    7:ifeq            31
	//*   4   10:aload_0         
	//*   5   11:getfield        #205 <Field ac f>
	//*   6   14:ifnull          31
	//*   7   17:aload_0         
	//*   8   18:getfield        #205 <Field ac f>
	//*   9   21:aload_0         
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #292 <Method boolean ac.onTouch(View, MotionEvent)>
	//*  12   26:ifeq            31
			return true;
	//   13   29:iconst_1        
	//   14   30:ireturn         
		else
			return super.onTouchEvent(motionevent);
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokespecial   #294 <Method boolean AppCompatTextView.onTouchEvent(MotionEvent)>
	//   18   36:ireturn         
	}

	public void setCheckable(boolean flag)
	{
	//    0    0:return          
	}

	public void setChecked(boolean flag)
	{
	//    0    0:return          
	}

	public void setExpandedFormat(boolean flag)
	{
		if(h != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field boolean h>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          27
		{
			h = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #143 <Field boolean h>
			if(a != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #136 <Field j a>
	//*   9   17:ifnull          27
				a.h();
	//   10   20:aload_0         
	//   11   21:getfield        #136 <Field j a>
	//   12   24:invokevirtual   #299 <Method void j.h()>
		}
	//   13   27:return          
	}

	public void setIcon(Drawable drawable)
	{
		e = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #134 <Field Drawable e>
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          109
		{
			int k1 = drawable.getIntrinsicWidth();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #302 <Method int Drawable.getIntrinsicWidth()>
	//    7   13:istore          6
			int j1 = drawable.getIntrinsicHeight();
	//    8   15:aload_1         
	//    9   16:invokevirtual   #305 <Method int Drawable.getIntrinsicHeight()>
	//   10   19:istore          5
			int l = k1;
	//   11   21:iload           6
	//   12   23:istore_3        
			int i1 = j1;
	//   13   24:iload           5
	//   14   26:istore          4
			if(k1 > k)
	//*  15   28:iload           6
	//*  16   30:aload_0         
	//*  17   31:getfield        #95  <Field int k>
	//*  18   34:icmple          60
			{
				float f1 = (float)k / (float)k1;
	//   19   37:aload_0         
	//   20   38:getfield        #95  <Field int k>
	//   21   41:i2f             
	//   22   42:iload           6
	//   23   44:i2f             
	//   24   45:fdiv            
	//   25   46:fstore_2        
				l = k;
	//   26   47:aload_0         
	//   27   48:getfield        #95  <Field int k>
	//   28   51:istore_3        
				i1 = (int)((float)j1 * f1);
	//   29   52:iload           5
	//   30   54:i2f             
	//   31   55:fload_2         
	//   32   56:fmul            
	//   33   57:f2i             
	//   34   58:istore          4
			}
			k1 = l;
	//   35   60:iload_3         
	//   36   61:istore          6
			j1 = i1;
	//   37   63:iload           4
	//   38   65:istore          5
			if(i1 > k)
	//*  39   67:iload           4
	//*  40   69:aload_0         
	//*  41   70:getfield        #95  <Field int k>
	//*  42   73:icmple          99
			{
				float f2 = (float)k / (float)i1;
	//   43   76:aload_0         
	//   44   77:getfield        #95  <Field int k>
	//   45   80:i2f             
	//   46   81:iload           4
	//   47   83:i2f             
	//   48   84:fdiv            
	//   49   85:fstore_2        
				j1 = k;
	//   50   86:aload_0         
	//   51   87:getfield        #95  <Field int k>
	//   52   90:istore          5
				k1 = (int)((float)l * f2);
	//   53   92:iload_3         
	//   54   93:i2f             
	//   55   94:fload_2         
	//   56   95:fmul            
	//   57   96:f2i             
	//   58   97:istore          6
			}
			drawable.setBounds(0, 0, k1, j1);
	//   59   99:aload_1         
	//   60  100:iconst_0        
	//   61  101:iconst_0        
	//   62  102:iload           6
	//   63  104:iload           5
	//   64  106:invokevirtual   #308 <Method void Drawable.setBounds(int, int, int, int)>
		}
		setCompoundDrawables(drawable, ((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)));
	//   65  109:aload_0         
	//   66  110:aload_1         
	//   67  111:aconst_null     
	//   68  112:aconst_null     
	//   69  113:aconst_null     
	//   70  114:invokevirtual   #312 <Method void setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
		f();
	//   71  117:aload_0         
	//   72  118:invokespecial   #230 <Method void f()>
	//   73  121:return          
	}

	public void setItemInvoker(h.b b1)
	{
		b = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #219 <Field h$b b>
	//    3    5:return          
	}

	public void setPadding(int l, int i1, int j1, int k1)
	{
		j = l;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #101 <Field int j>
		super.setPadding(l, i1, j1, k1);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iload_2         
	//    6    8:iload_3         
	//    7    9:iload           4
	//    8   11:invokespecial   #245 <Method void AppCompatTextView.setPadding(int, int, int, int)>
	//    9   14:return          
	}

	public void setPopupCallback(b b1)
	{
		c = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #318 <Field ActionMenuItemView$b c>
	//    3    5:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		d = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #126 <Field CharSequence d>
		f();
	//    3    5:aload_0         
	//    4    6:invokespecial   #230 <Method void f()>
	//    5    9:return          
	}

	j a;
	h.b b;
	b c;
	private CharSequence d;
	private Drawable e;
	private ac f;
	private boolean g;
	private boolean h;
	private int i;
	private int j;
	private int k;
}
