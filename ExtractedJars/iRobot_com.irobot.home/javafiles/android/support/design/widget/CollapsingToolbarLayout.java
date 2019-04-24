// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.a;
import android.support.v4.f.i;
import android.support.v4.view.aa;
import android.support.v4.view.o;
import android.support.v4.view.s;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

// Referenced classes of package android.support.design.widget:
//			n, e, a, p, 
//			AppBarLayout, o

public class CollapsingToolbarLayout extends FrameLayout
{
	public static class LayoutParams extends android.widget.FrameLayout.LayoutParams
	{

		public void a(float f1)
		{
			b = f1;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #20  <Field float b>
		//    3    5:return          
		}

		int a;
		float b;

		public LayoutParams(int i1, int j1)
		{
			super(i1, j1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #15  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
			a = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #17  <Field int a>
			b = 0.5F;
		//    7   11:aload_0         
		//    8   12:ldc1            #18  <Float 0.5F>
		//    9   14:putfield        #20  <Field float b>
		//   10   17:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #24  <Method void android.widget.FrameLayout$LayoutParams(Context, AttributeSet)>
			a = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #17  <Field int a>
			b = 0.5F;
		//    7   11:aload_0         
		//    8   12:ldc1            #18  <Float 0.5F>
		//    9   14:putfield        #20  <Field float b>
			context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.a.k.CollapsingToolbarLayout_Layout)));
		//   10   17:aload_1         
		//   11   18:aload_2         
		//   12   19:getstatic       #30  <Field int[] android.support.design.a$k.CollapsingToolbarLayout_Layout>
		//   13   22:invokevirtual   #36  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   14   25:astore_1        
			a = ((TypedArray) (context)).getInt(android.support.design.a.k.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
		//   15   26:aload_0         
		//   16   27:aload_1         
		//   17   28:getstatic       #39  <Field int android.support.design.a$k.CollapsingToolbarLayout_Layout_layout_collapseMode>
		//   18   31:iconst_0        
		//   19   32:invokevirtual   #45  <Method int TypedArray.getInt(int, int)>
		//   20   35:putfield        #17  <Field int a>
			a(((TypedArray) (context)).getFloat(android.support.design.a.k.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5F));
		//   21   38:aload_0         
		//   22   39:aload_1         
		//   23   40:getstatic       #48  <Field int android.support.design.a$k.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier>
		//   24   43:ldc1            #18  <Float 0.5F>
		//   25   45:invokevirtual   #52  <Method float TypedArray.getFloat(int, float)>
		//   26   48:invokevirtual   #55  <Method void a(float)>
			((TypedArray) (context)).recycle();
		//   27   51:aload_1         
		//   28   52:invokevirtual   #59  <Method void TypedArray.recycle()>
		//   29   55:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #62  <Method void android.widget.FrameLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
			a = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #17  <Field int a>
			b = 0.5F;
		//    6   10:aload_0         
		//    7   11:ldc1            #18  <Float 0.5F>
		//    8   13:putfield        #20  <Field float b>
		//    9   16:return          
		}
	}

	private class a
		implements AppBarLayout.a
	{

		public void a(AppBarLayout appbarlayout, int i1)
		{
			a.c = i1;
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field CollapsingToolbarLayout a>
		//    2    4:iload_2         
		//    3    5:putfield        #23  <Field int CollapsingToolbarLayout.c>
			int j1;
			if(a.d != null)
		//*   4    8:aload_0         
		//*   5    9:getfield        #14  <Field CollapsingToolbarLayout a>
		//*   6   12:getfield        #27  <Field aa CollapsingToolbarLayout.d>
		//*   7   15:ifnull          32
				j1 = a.d.b();
		//    8   18:aload_0         
		//    9   19:getfield        #14  <Field CollapsingToolbarLayout a>
		//   10   22:getfield        #27  <Field aa CollapsingToolbarLayout.d>
		//   11   25:invokevirtual   #33  <Method int aa.b()>
		//   12   28:istore_3        
			else
		//*  13   29:goto            34
				j1 = 0;
		//   14   32:iconst_0        
		//   15   33:istore_3        
			int j2 = a.getChildCount();
		//   16   34:aload_0         
		//   17   35:getfield        #14  <Field CollapsingToolbarLayout a>
		//   18   38:invokevirtual   #36  <Method int CollapsingToolbarLayout.getChildCount()>
		//   19   41:istore          6
			int k1 = 0;
		//   20   43:iconst_0        
		//   21   44:istore          4
label0:
			do
			{
label1:
				{
					if(k1 >= j2)
						break label0;
		//   22   46:iload           4
		//   23   48:iload           6
		//   24   50:icmpge          157
					appbarlayout = ((AppBarLayout) (a.getChildAt(k1)));
		//   25   53:aload_0         
		//   26   54:getfield        #14  <Field CollapsingToolbarLayout a>
		//   27   57:iload           4
		//   28   59:invokevirtual   #40  <Method View CollapsingToolbarLayout.getChildAt(int)>
		//   29   62:astore_1        
					LayoutParams layoutparams = (LayoutParams)((View) (appbarlayout)).getLayoutParams();
		//   30   63:aload_1         
		//   31   64:invokevirtual   #46  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   32   67:checkcast       #48  <Class CollapsingToolbarLayout$LayoutParams>
		//   33   70:astore          7
					p p1 = android.support.design.widget.CollapsingToolbarLayout.a(((View) (appbarlayout)));
		//   34   72:aload_1         
		//   35   73:invokestatic    #51  <Method p android.support.design.widget.CollapsingToolbarLayout.a(View)>
		//   36   76:astore          8
					int l1;
					switch(layoutparams.a)
		//*  37   78:aload           7
		//*  38   80:getfield        #53  <Field int android.support.design.widget.CollapsingToolbarLayout$LayoutParams.a>
					{
		//*  39   83:tableswitch     1 2: default 104
		//		               1 124
		//		               2 107
					default:
						break label1;
		//   40  104:goto            148

					case 2: // '\002'
						l1 = Math.round((float)(-i1) * layoutparams.b);
		//   41  107:iload_2         
		//   42  108:ineg            
		//   43  109:i2f             
		//   44  110:aload           7
		//   45  112:getfield        #56  <Field float CollapsingToolbarLayout$LayoutParams.b>
		//   46  115:fmul            
		//   47  116:invokestatic    #62  <Method int Math.round(float)>
		//   48  119:istore          5
						break;
		//   49  121:goto            140

					case 1: // '\001'
						l1 = android.support.v4.c.a.a(-i1, 0, a.b(((View) (appbarlayout))));
		//   50  124:iload_2         
		//   51  125:ineg            
		//   52  126:iconst_0        
		//   53  127:aload_0         
		//   54  128:getfield        #14  <Field CollapsingToolbarLayout a>
		//   55  131:aload_1         
		//   56  132:invokevirtual   #65  <Method int CollapsingToolbarLayout.b(View)>
		//   57  135:invokestatic    #70  <Method int android.support.v4.c.a.a(int, int, int)>
		//   58  138:istore          5
						break;
					}
					p1.a(l1);
		//   59  140:aload           8
		//   60  142:iload           5
		//   61  144:invokevirtual   #75  <Method boolean android.support.design.widget.p.a(int)>
		//   62  147:pop             
				}
				k1++;
		//   63  148:iload           4
		//   64  150:iconst_1        
		//   65  151:iadd            
		//   66  152:istore          4
			} while(true);
		//   67  154:goto            46
			a.b();
		//   68  157:aload_0         
		//   69  158:getfield        #14  <Field CollapsingToolbarLayout a>
		//   70  161:invokevirtual   #77  <Method void CollapsingToolbarLayout.b()>
			if(a.b != null && j1 > 0)
		//*  71  164:aload_0         
		//*  72  165:getfield        #14  <Field CollapsingToolbarLayout a>
		//*  73  168:getfield        #80  <Field Drawable CollapsingToolbarLayout.b>
		//*  74  171:ifnull          185
		//*  75  174:iload_3         
		//*  76  175:ifle            185
				android.support.v4.view.s.c(((View) (a)));
		//   77  178:aload_0         
		//   78  179:getfield        #14  <Field CollapsingToolbarLayout a>
		//   79  182:invokestatic    #85  <Method void s.c(View)>
			k1 = a.getHeight();
		//   80  185:aload_0         
		//   81  186:getfield        #14  <Field CollapsingToolbarLayout a>
		//   82  189:invokevirtual   #88  <Method int CollapsingToolbarLayout.getHeight()>
		//   83  192:istore          4
			int i2 = android.support.v4.view.s.j(((View) (a)));
		//   84  194:aload_0         
		//   85  195:getfield        #14  <Field CollapsingToolbarLayout a>
		//   86  198:invokestatic    #91  <Method int s.j(View)>
		//   87  201:istore          5
			a.a.b((float)Math.abs(i1) / (float)(k1 - i2 - j1));
		//   88  203:aload_0         
		//   89  204:getfield        #14  <Field CollapsingToolbarLayout a>
		//   90  207:getfield        #94  <Field e android.support.design.widget.CollapsingToolbarLayout.a>
		//   91  210:iload_2         
		//   92  211:invokestatic    #98  <Method int Math.abs(int)>
		//   93  214:i2f             
		//   94  215:iload           4
		//   95  217:iload           5
		//   96  219:isub            
		//   97  220:iload_3         
		//   98  221:isub            
		//   99  222:i2f             
		//  100  223:fdiv            
		//  101  224:invokevirtual   #103 <Method void e.b(float)>
		//  102  227:return          
		}

		final CollapsingToolbarLayout a;

		a()
		{
			a = CollapsingToolbarLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field CollapsingToolbarLayout a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #17  <Method void Object()>
		//    5    9:return          
		}
	}


	public CollapsingToolbarLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #52  <Method void CollapsingToolbarLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public CollapsingToolbarLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #56  <Method void CollapsingToolbarLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public CollapsingToolbarLayout(Context context, AttributeSet attributeset, int i1)
	{
		super(context, attributeset, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #57  <Method void FrameLayout(Context, AttributeSet, int)>
		e = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #59  <Field boolean e>
		n = new Rect();
	//    8   12:aload_0         
	//    9   13:new             #61  <Class Rect>
	//   10   16:dup             
	//   11   17:invokespecial   #64  <Method void Rect()>
	//   12   20:putfield        #66  <Field Rect n>
		v = -1;
	//   13   23:aload_0         
	//   14   24:iconst_m1       
	//   15   25:putfield        #68  <Field int v>
		android.support.design.widget.n.a(context);
	//   16   28:aload_1         
	//   17   29:invokestatic    #72  <Method void android.support.design.widget.n.a(Context)>
		a = new e(((View) (this)));
	//   18   32:aload_0         
	//   19   33:new             #74  <Class e>
	//   20   36:dup             
	//   21   37:aload_0         
	//   22   38:invokespecial   #77  <Method void e(View)>
	//   23   41:putfield        #79  <Field e a>
		a.a(android.support.design.widget.a.e);
	//   24   44:aload_0         
	//   25   45:getfield        #79  <Field e a>
	//   26   48:getstatic       #84  <Field android.view.animation.Interpolator a.e>
	//   27   51:invokevirtual   #87  <Method void android.support.design.widget.e.a(android.view.animation.Interpolator)>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.a.k.CollapsingToolbarLayout, i1, android.support.design.a.j.Widget_Design_CollapsingToolbar)));
	//   28   54:aload_1         
	//   29   55:aload_2         
	//   30   56:getstatic       #93  <Field int[] android.support.design.a$k.CollapsingToolbarLayout>
	//   31   59:iload_3         
	//   32   60:getstatic       #98  <Field int android.support.design.a$j.Widget_Design_CollapsingToolbar>
	//   33   63:invokevirtual   #104 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   34   66:astore_1        
		a.a(((TypedArray) (context)).getInt(android.support.design.a.k.CollapsingToolbarLayout_expandedTitleGravity, 0x800053));
	//   35   67:aload_0         
	//   36   68:getfield        #79  <Field e a>
	//   37   71:aload_1         
	//   38   72:getstatic       #107 <Field int android.support.design.a$k.CollapsingToolbarLayout_expandedTitleGravity>
	//   39   75:ldc1            #108 <Int 0x800053>
	//   40   77:invokevirtual   #114 <Method int TypedArray.getInt(int, int)>
	//   41   80:invokevirtual   #117 <Method void android.support.design.widget.e.a(int)>
		a.b(((TypedArray) (context)).getInt(android.support.design.a.k.CollapsingToolbarLayout_collapsedTitleGravity, 0x800013));
	//   42   83:aload_0         
	//   43   84:getfield        #79  <Field e a>
	//   44   87:aload_1         
	//   45   88:getstatic       #120 <Field int android.support.design.a$k.CollapsingToolbarLayout_collapsedTitleGravity>
	//   46   91:ldc1            #121 <Int 0x800013>
	//   47   93:invokevirtual   #114 <Method int TypedArray.getInt(int, int)>
	//   48   96:invokevirtual   #123 <Method void e.b(int)>
		i1 = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.a.k.CollapsingToolbarLayout_expandedTitleMargin, 0);
	//   49   99:aload_1         
	//   50  100:getstatic       #126 <Field int android.support.design.a$k.CollapsingToolbarLayout_expandedTitleMargin>
	//   51  103:iconst_0        
	//   52  104:invokevirtual   #129 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   53  107:istore_3        
		m = i1;
	//   54  108:aload_0         
	//   55  109:iload_3         
	//   56  110:putfield        #131 <Field int m>
		l = i1;
	//   57  113:aload_0         
	//   58  114:iload_3         
	//   59  115:putfield        #133 <Field int l>
		k = i1;
	//   60  118:aload_0         
	//   61  119:iload_3         
	//   62  120:putfield        #135 <Field int k>
		j = i1;
	//   63  123:aload_0         
	//   64  124:iload_3         
	//   65  125:putfield        #137 <Field int j>
		if(((TypedArray) (context)).hasValue(android.support.design.a.k.CollapsingToolbarLayout_expandedTitleMarginStart))
	//*  66  128:aload_1         
	//*  67  129:getstatic       #140 <Field int android.support.design.a$k.CollapsingToolbarLayout_expandedTitleMarginStart>
	//*  68  132:invokevirtual   #144 <Method boolean TypedArray.hasValue(int)>
	//*  69  135:ifeq            150
			j = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.a.k.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
	//   70  138:aload_0         
	//   71  139:aload_1         
	//   72  140:getstatic       #140 <Field int android.support.design.a$k.CollapsingToolbarLayout_expandedTitleMarginStart>
	//   73  143:iconst_0        
	//   74  144:invokevirtual   #129 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   75  147:putfield        #137 <Field int j>
		if(((TypedArray) (context)).hasValue(android.support.design.a.k.CollapsingToolbarLayout_expandedTitleMarginEnd))
	//*  76  150:aload_1         
	//*  77  151:getstatic       #147 <Field int android.support.design.a$k.CollapsingToolbarLayout_expandedTitleMarginEnd>
	//*  78  154:invokevirtual   #144 <Method boolean TypedArray.hasValue(int)>
	//*  79  157:ifeq            172
			l = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.a.k.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
	//   80  160:aload_0         
	//   81  161:aload_1         
	//   82  162:getstatic       #147 <Field int android.support.design.a$k.CollapsingToolbarLayout_expandedTitleMarginEnd>
	//   83  165:iconst_0        
	//   84  166:invokevirtual   #129 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   85  169:putfield        #133 <Field int l>
		if(((TypedArray) (context)).hasValue(android.support.design.a.k.CollapsingToolbarLayout_expandedTitleMarginTop))
	//*  86  172:aload_1         
	//*  87  173:getstatic       #150 <Field int android.support.design.a$k.CollapsingToolbarLayout_expandedTitleMarginTop>
	//*  88  176:invokevirtual   #144 <Method boolean TypedArray.hasValue(int)>
	//*  89  179:ifeq            194
			k = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.a.k.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
	//   90  182:aload_0         
	//   91  183:aload_1         
	//   92  184:getstatic       #150 <Field int android.support.design.a$k.CollapsingToolbarLayout_expandedTitleMarginTop>
	//   93  187:iconst_0        
	//   94  188:invokevirtual   #129 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   95  191:putfield        #135 <Field int k>
		if(((TypedArray) (context)).hasValue(android.support.design.a.k.CollapsingToolbarLayout_expandedTitleMarginBottom))
	//*  96  194:aload_1         
	//*  97  195:getstatic       #153 <Field int android.support.design.a$k.CollapsingToolbarLayout_expandedTitleMarginBottom>
	//*  98  198:invokevirtual   #144 <Method boolean TypedArray.hasValue(int)>
	//*  99  201:ifeq            216
			m = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.a.k.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
	//  100  204:aload_0         
	//  101  205:aload_1         
	//  102  206:getstatic       #153 <Field int android.support.design.a$k.CollapsingToolbarLayout_expandedTitleMarginBottom>
	//  103  209:iconst_0        
	//  104  210:invokevirtual   #129 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  105  213:putfield        #131 <Field int m>
		o = ((TypedArray) (context)).getBoolean(android.support.design.a.k.CollapsingToolbarLayout_titleEnabled, true);
	//  106  216:aload_0         
	//  107  217:aload_1         
	//  108  218:getstatic       #156 <Field int android.support.design.a$k.CollapsingToolbarLayout_titleEnabled>
	//  109  221:iconst_1        
	//  110  222:invokevirtual   #160 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  111  225:putfield        #162 <Field boolean o>
		setTitle(((TypedArray) (context)).getText(android.support.design.a.k.CollapsingToolbarLayout_title));
	//  112  228:aload_0         
	//  113  229:aload_1         
	//  114  230:getstatic       #165 <Field int android.support.design.a$k.CollapsingToolbarLayout_title>
	//  115  233:invokevirtual   #169 <Method CharSequence TypedArray.getText(int)>
	//  116  236:invokevirtual   #173 <Method void setTitle(CharSequence)>
		a.d(android.support.design.a.j.TextAppearance_Design_CollapsingToolbar_Expanded);
	//  117  239:aload_0         
	//  118  240:getfield        #79  <Field e a>
	//  119  243:getstatic       #176 <Field int android.support.design.a$j.TextAppearance_Design_CollapsingToolbar_Expanded>
	//  120  246:invokevirtual   #178 <Method void e.d(int)>
		a.c(android.support.v7.a.a.i.TextAppearance_AppCompat_Widget_ActionBar_Title);
	//  121  249:aload_0         
	//  122  250:getfield        #79  <Field e a>
	//  123  253:getstatic       #183 <Field int android.support.v7.a.a$i.TextAppearance_AppCompat_Widget_ActionBar_Title>
	//  124  256:invokevirtual   #185 <Method void e.c(int)>
		if(((TypedArray) (context)).hasValue(android.support.design.a.k.CollapsingToolbarLayout_expandedTitleTextAppearance))
	//* 125  259:aload_1         
	//* 126  260:getstatic       #188 <Field int android.support.design.a$k.CollapsingToolbarLayout_expandedTitleTextAppearance>
	//* 127  263:invokevirtual   #144 <Method boolean TypedArray.hasValue(int)>
	//* 128  266:ifeq            284
			a.d(((TypedArray) (context)).getResourceId(android.support.design.a.k.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
	//  129  269:aload_0         
	//  130  270:getfield        #79  <Field e a>
	//  131  273:aload_1         
	//  132  274:getstatic       #188 <Field int android.support.design.a$k.CollapsingToolbarLayout_expandedTitleTextAppearance>
	//  133  277:iconst_0        
	//  134  278:invokevirtual   #191 <Method int TypedArray.getResourceId(int, int)>
	//  135  281:invokevirtual   #178 <Method void e.d(int)>
		if(((TypedArray) (context)).hasValue(android.support.design.a.k.CollapsingToolbarLayout_collapsedTitleTextAppearance))
	//* 136  284:aload_1         
	//* 137  285:getstatic       #194 <Field int android.support.design.a$k.CollapsingToolbarLayout_collapsedTitleTextAppearance>
	//* 138  288:invokevirtual   #144 <Method boolean TypedArray.hasValue(int)>
	//* 139  291:ifeq            309
			a.c(((TypedArray) (context)).getResourceId(android.support.design.a.k.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
	//  140  294:aload_0         
	//  141  295:getfield        #79  <Field e a>
	//  142  298:aload_1         
	//  143  299:getstatic       #194 <Field int android.support.design.a$k.CollapsingToolbarLayout_collapsedTitleTextAppearance>
	//  144  302:iconst_0        
	//  145  303:invokevirtual   #191 <Method int TypedArray.getResourceId(int, int)>
	//  146  306:invokevirtual   #185 <Method void e.c(int)>
		v = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.a.k.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
	//  147  309:aload_0         
	//  148  310:aload_1         
	//  149  311:getstatic       #197 <Field int android.support.design.a$k.CollapsingToolbarLayout_scrimVisibleHeightTrigger>
	//  150  314:iconst_m1       
	//  151  315:invokevirtual   #129 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  152  318:putfield        #68  <Field int v>
		u = ((TypedArray) (context)).getInt(android.support.design.a.k.CollapsingToolbarLayout_scrimAnimationDuration, 600);
	//  153  321:aload_0         
	//  154  322:aload_1         
	//  155  323:getstatic       #200 <Field int android.support.design.a$k.CollapsingToolbarLayout_scrimAnimationDuration>
	//  156  326:sipush          600
	//  157  329:invokevirtual   #114 <Method int TypedArray.getInt(int, int)>
	//  158  332:i2l             
	//  159  333:putfield        #202 <Field long u>
		setContentScrim(((TypedArray) (context)).getDrawable(android.support.design.a.k.CollapsingToolbarLayout_contentScrim));
	//  160  336:aload_0         
	//  161  337:aload_1         
	//  162  338:getstatic       #205 <Field int android.support.design.a$k.CollapsingToolbarLayout_contentScrim>
	//  163  341:invokevirtual   #209 <Method Drawable TypedArray.getDrawable(int)>
	//  164  344:invokevirtual   #213 <Method void setContentScrim(Drawable)>
		setStatusBarScrim(((TypedArray) (context)).getDrawable(android.support.design.a.k.CollapsingToolbarLayout_statusBarScrim));
	//  165  347:aload_0         
	//  166  348:aload_1         
	//  167  349:getstatic       #216 <Field int android.support.design.a$k.CollapsingToolbarLayout_statusBarScrim>
	//  168  352:invokevirtual   #209 <Method Drawable TypedArray.getDrawable(int)>
	//  169  355:invokevirtual   #219 <Method void setStatusBarScrim(Drawable)>
		f = ((TypedArray) (context)).getResourceId(android.support.design.a.k.CollapsingToolbarLayout_toolbarId, -1);
	//  170  358:aload_0         
	//  171  359:aload_1         
	//  172  360:getstatic       #222 <Field int android.support.design.a$k.CollapsingToolbarLayout_toolbarId>
	//  173  363:iconst_m1       
	//  174  364:invokevirtual   #191 <Method int TypedArray.getResourceId(int, int)>
	//  175  367:putfield        #224 <Field int f>
		((TypedArray) (context)).recycle();
	//  176  370:aload_1         
	//  177  371:invokevirtual   #227 <Method void TypedArray.recycle()>
		setWillNotDraw(false);
	//  178  374:aload_0         
	//  179  375:iconst_0        
	//  180  376:invokevirtual   #231 <Method void setWillNotDraw(boolean)>
		android.support.v4.view.s.a(((View) (this)), new o() {

			public aa a(View view, aa aa1)
			{
				return a.a(aa1);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field CollapsingToolbarLayout a>
			//    2    4:aload_2         
			//    3    5:invokevirtual   #24  <Method aa android.support.design.widget.CollapsingToolbarLayout.a(aa)>
			//    4    8:areturn         
			}

			final CollapsingToolbarLayout a;

			
			{
				a = CollapsingToolbarLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CollapsingToolbarLayout a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  181  379:aload_0         
	//  182  380:new             #6   <Class CollapsingToolbarLayout$1>
	//  183  383:dup             
	//  184  384:aload_0         
	//  185  385:invokespecial   #234 <Method void CollapsingToolbarLayout$1(CollapsingToolbarLayout)>
	//  186  388:invokestatic    #239 <Method void s.a(View, o)>
	//  187  391:return          
	}

	static p a(View view)
	{
		p p2 = (p)view.getTag(android.support.design.a.f.view_offset_helper);
	//    0    0:aload_0         
	//    1    1:getstatic       #245 <Field int android.support.design.a$f.view_offset_helper>
	//    2    4:invokevirtual   #251 <Method Object View.getTag(int)>
	//    3    7:checkcast       #253 <Class p>
	//    4   10:astore_2        
		p p1 = p2;
	//    5   11:aload_2         
	//    6   12:astore_1        
		if(p2 == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       34
		{
			p1 = new p(view);
	//    9   17:new             #253 <Class p>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #254 <Method void p(View)>
	//   13   25:astore_1        
			view.setTag(android.support.design.a.f.view_offset_helper, ((Object) (p1)));
	//   14   26:aload_0         
	//   15   27:getstatic       #245 <Field int android.support.design.a$f.view_offset_helper>
	//   16   30:aload_1         
	//   17   31:invokevirtual   #258 <Method void View.setTag(int, Object)>
		}
		return p1;
	//   18   34:aload_1         
	//   19   35:areturn         
	}

	private void a(int i1)
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #260 <Method void c()>
		if(t == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #262 <Field ValueAnimator t>
	//*   4    8:ifnonnull       81
		{
			t = new ValueAnimator();
	//    5   11:aload_0         
	//    6   12:new             #264 <Class ValueAnimator>
	//    7   15:dup             
	//    8   16:invokespecial   #265 <Method void ValueAnimator()>
	//    9   19:putfield        #262 <Field ValueAnimator t>
			t.setDuration(u);
	//   10   22:aload_0         
	//   11   23:getfield        #262 <Field ValueAnimator t>
	//   12   26:aload_0         
	//   13   27:getfield        #202 <Field long u>
	//   14   30:invokevirtual   #269 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   15   33:pop             
			ValueAnimator valueanimator = t;
	//   16   34:aload_0         
	//   17   35:getfield        #262 <Field ValueAnimator t>
	//   18   38:astore_3        
			android.view.animation.Interpolator interpolator;
			if(i1 > r)
	//*  19   39:iload_1         
	//*  20   40:aload_0         
	//*  21   41:getfield        #271 <Field int r>
	//*  22   44:icmple          54
				interpolator = android.support.design.widget.a.c;
	//   23   47:getstatic       #273 <Field android.view.animation.Interpolator a.c>
	//   24   50:astore_2        
			else
	//*  25   51:goto            58
				interpolator = android.support.design.widget.a.d;
	//   26   54:getstatic       #275 <Field android.view.animation.Interpolator a.d>
	//   27   57:astore_2        
			valueanimator.setInterpolator(((android.animation.TimeInterpolator) (interpolator)));
	//   28   58:aload_3         
	//   29   59:aload_2         
	//   30   60:invokevirtual   #279 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
			t.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

				public void onAnimationUpdate(ValueAnimator valueanimator1)
				{
					a.setScrimAlpha(((Integer)valueanimator1.getAnimatedValue()).intValue());
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field CollapsingToolbarLayout a>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #28  <Method Object ValueAnimator.getAnimatedValue()>
				//    4    8:checkcast       #30  <Class Integer>
				//    5   11:invokevirtual   #34  <Method int Integer.intValue()>
				//    6   14:invokevirtual   #37  <Method void CollapsingToolbarLayout.setScrimAlpha(int)>
				//    7   17:return          
				}

				final CollapsingToolbarLayout a;

			
			{
				a = CollapsingToolbarLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CollapsingToolbarLayout a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   31   63:aload_0         
	//   32   64:getfield        #262 <Field ValueAnimator t>
	//   33   67:new             #8   <Class CollapsingToolbarLayout$2>
	//   34   70:dup             
	//   35   71:aload_0         
	//   36   72:invokespecial   #280 <Method void CollapsingToolbarLayout$2(CollapsingToolbarLayout)>
	//   37   75:invokevirtual   #284 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		} else
	//*  38   78:goto            98
		if(t.isRunning())
	//*  39   81:aload_0         
	//*  40   82:getfield        #262 <Field ValueAnimator t>
	//*  41   85:invokevirtual   #288 <Method boolean ValueAnimator.isRunning()>
	//*  42   88:ifeq            98
			t.cancel();
	//   43   91:aload_0         
	//   44   92:getfield        #262 <Field ValueAnimator t>
	//   45   95:invokevirtual   #291 <Method void ValueAnimator.cancel()>
		t.setIntValues(new int[] {
			r, i1
		});
	//   46   98:aload_0         
	//   47   99:getfield        #262 <Field ValueAnimator t>
	//   48  102:iconst_2        
	//   49  103:newarray        int[]
	//   50  105:dup             
	//   51  106:iconst_0        
	//   52  107:aload_0         
	//   53  108:getfield        #271 <Field int r>
	//   54  111:iastore         
	//   55  112:dup             
	//   56  113:iconst_1        
	//   57  114:iload_1         
	//   58  115:iastore         
	//   59  116:invokevirtual   #295 <Method void ValueAnimator.setIntValues(int[])>
		t.start();
	//   60  119:aload_0         
	//   61  120:getfield        #262 <Field ValueAnimator t>
	//   62  123:invokevirtual   #298 <Method void ValueAnimator.start()>
	//   63  126:return          
	}

	private void c()
	{
		if(!e)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field boolean e>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		Object obj1 = null;
	//    4    8:aconst_null     
	//    5    9:astore          4
		g = null;
	//    6   11:aload_0         
	//    7   12:aconst_null     
	//    8   13:putfield        #300 <Field Toolbar g>
		h = null;
	//    9   16:aload_0         
	//   10   17:aconst_null     
	//   11   18:putfield        #302 <Field View h>
		if(f != -1)
	//*  12   21:aload_0         
	//*  13   22:getfield        #224 <Field int f>
	//*  14   25:iconst_m1       
	//*  15   26:icmpeq          63
		{
			g = (Toolbar)findViewById(f);
	//   16   29:aload_0         
	//   17   30:aload_0         
	//   18   31:aload_0         
	//   19   32:getfield        #224 <Field int f>
	//   20   35:invokevirtual   #306 <Method View findViewById(int)>
	//   21   38:checkcast       #308 <Class Toolbar>
	//   22   41:putfield        #300 <Field Toolbar g>
			if(g != null)
	//*  23   44:aload_0         
	//*  24   45:getfield        #300 <Field Toolbar g>
	//*  25   48:ifnull          63
				h = d(((View) (g)));
	//   26   51:aload_0         
	//   27   52:aload_0         
	//   28   53:aload_0         
	//   29   54:getfield        #300 <Field Toolbar g>
	//   30   57:invokespecial   #311 <Method View d(View)>
	//   31   60:putfield        #302 <Field View h>
		}
		if(g == null)
	//*  32   63:aload_0         
	//*  33   64:getfield        #300 <Field Toolbar g>
	//*  34   67:ifnonnull       118
		{
			int j1 = getChildCount();
	//   35   70:aload_0         
	//   36   71:invokevirtual   #315 <Method int getChildCount()>
	//   37   74:istore_2        
			int i1 = 0;
	//   38   75:iconst_0        
	//   39   76:istore_1        
			Object obj;
			do
			{
				obj = ((Object) (obj1));
	//   40   77:aload           4
	//   41   79:astore_3        
				if(i1 >= j1)
					break;
	//   42   80:iload_1         
	//   43   81:iload_2         
	//   44   82:icmpge          113
				obj = ((Object) (getChildAt(i1)));
	//   45   85:aload_0         
	//   46   86:iload_1         
	//   47   87:invokevirtual   #318 <Method View getChildAt(int)>
	//   48   90:astore_3        
				if(obj instanceof Toolbar)
	//*  49   91:aload_3         
	//*  50   92:instanceof      #308 <Class Toolbar>
	//*  51   95:ifeq            106
				{
					obj = ((Object) ((Toolbar)obj));
	//   52   98:aload_3         
	//   53   99:checkcast       #308 <Class Toolbar>
	//   54  102:astore_3        
					break;
	//   55  103:goto            113
				}
				i1++;
	//   56  106:iload_1         
	//   57  107:iconst_1        
	//   58  108:iadd            
	//   59  109:istore_1        
			} while(true);
	//   60  110:goto            77
			g = ((Toolbar) (obj));
	//   61  113:aload_0         
	//   62  114:aload_3         
	//   63  115:putfield        #300 <Field Toolbar g>
		}
		d();
	//   64  118:aload_0         
	//   65  119:invokespecial   #320 <Method void d()>
		e = false;
	//   66  122:aload_0         
	//   67  123:iconst_0        
	//   68  124:putfield        #59  <Field boolean e>
	//   69  127:return          
	}

	private boolean c(View view)
	{
		View view1 = h;
	//    0    0:aload_0         
	//    1    1:getfield        #302 <Field View h>
	//    2    4:astore_3        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		if(view1 != null && h != this ? view == h : view == g)
	//*   5    7:aload_3         
	//*   6    8:ifnull          33
	//*   7   11:aload_0         
	//*   8   12:getfield        #302 <Field View h>
	//*   9   15:aload_0         
	//*  10   16:if_acmpne       22
	//*  11   19:goto            33
	//*  12   22:aload_1         
	//*  13   23:aload_0         
	//*  14   24:getfield        #302 <Field View h>
	//*  15   27:if_acmpne       43
	//*  16   30:goto            41
	//*  17   33:aload_1         
	//*  18   34:aload_0         
	//*  19   35:getfield        #300 <Field Toolbar g>
	//*  20   38:if_acmpne       43
			flag = true;
	//   21   41:iconst_1        
	//   22   42:istore_2        
		return flag;
	//   23   43:iload_2         
	//   24   44:ireturn         
	}

	private View d(View view)
	{
		ViewParent viewparent = view.getParent();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #325 <Method ViewParent View.getParent()>
	//    2    4:astore_3        
		View view1 = view;
	//    3    5:aload_1         
	//    4    6:astore_2        
		for(view = ((View) (viewparent)); view != this && view != null; view = ((View) (((ViewParent) (view)).getParent())))
	//*   5    7:aload_3         
	//*   6    8:astore_1        
	//*   7    9:aload_1         
	//*   8   10:aload_0         
	//*   9   11:if_acmpeq       40
	//*  10   14:aload_1         
	//*  11   15:ifnull          40
			if(view instanceof View)
	//*  12   18:aload_1         
	//*  13   19:instanceof      #247 <Class View>
	//*  14   22:ifeq            30
				view1 = (View)view;
	//   15   25:aload_1         
	//   16   26:checkcast       #247 <Class View>
	//   17   29:astore_2        

	//   18   30:aload_1         
	//   19   31:invokeinterface #328 <Method ViewParent ViewParent.getParent()>
	//   20   36:astore_1        
	//*  21   37:goto            9
		return view1;
	//   22   40:aload_2         
	//   23   41:areturn         
	}

	private void d()
	{
		if(!o && i != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #162 <Field boolean o>
	//*   2    4:ifne            40
	//*   3    7:aload_0         
	//*   4    8:getfield        #330 <Field View i>
	//*   5   11:ifnull          40
		{
			ViewParent viewparent = i.getParent();
	//    6   14:aload_0         
	//    7   15:getfield        #330 <Field View i>
	//    8   18:invokevirtual   #325 <Method ViewParent View.getParent()>
	//    9   21:astore_1        
			if(viewparent instanceof ViewGroup)
	//*  10   22:aload_1         
	//*  11   23:instanceof      #332 <Class ViewGroup>
	//*  12   26:ifeq            40
				((ViewGroup)viewparent).removeView(i);
	//   13   29:aload_1         
	//   14   30:checkcast       #332 <Class ViewGroup>
	//   15   33:aload_0         
	//   16   34:getfield        #330 <Field View i>
	//   17   37:invokevirtual   #335 <Method void ViewGroup.removeView(View)>
		}
		if(o && g != null)
	//*  18   40:aload_0         
	//*  19   41:getfield        #162 <Field boolean o>
	//*  20   44:ifeq            99
	//*  21   47:aload_0         
	//*  22   48:getfield        #300 <Field Toolbar g>
	//*  23   51:ifnull          99
		{
			if(i == null)
	//*  24   54:aload_0         
	//*  25   55:getfield        #330 <Field View i>
	//*  26   58:ifnonnull       76
				i = new View(getContext());
	//   27   61:aload_0         
	//   28   62:new             #247 <Class View>
	//   29   65:dup             
	//   30   66:aload_0         
	//   31   67:invokevirtual   #339 <Method Context getContext()>
	//   32   70:invokespecial   #341 <Method void View(Context)>
	//   33   73:putfield        #330 <Field View i>
			if(i.getParent() == null)
	//*  34   76:aload_0         
	//*  35   77:getfield        #330 <Field View i>
	//*  36   80:invokevirtual   #325 <Method ViewParent View.getParent()>
	//*  37   83:ifnonnull       99
				g.addView(i, -1, -1);
	//   38   86:aload_0         
	//   39   87:getfield        #300 <Field Toolbar g>
	//   40   90:aload_0         
	//   41   91:getfield        #330 <Field View i>
	//   42   94:iconst_m1       
	//   43   95:iconst_m1       
	//   44   96:invokevirtual   #345 <Method void Toolbar.addView(View, int, int)>
		}
	//   45   99:return          
	}

	private static int e(View view)
	{
		Object obj = ((Object) (view.getLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #350 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore_1        
		if(obj instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #352 <Class android.view.ViewGroup$MarginLayoutParams>
	//*   5    9:ifeq            32
		{
			obj = ((Object) ((android.view.ViewGroup.MarginLayoutParams)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #352 <Class android.view.ViewGroup$MarginLayoutParams>
	//    8   16:astore_1        
			return view.getHeight() + ((android.view.ViewGroup.MarginLayoutParams) (obj)).topMargin + ((android.view.ViewGroup.MarginLayoutParams) (obj)).bottomMargin;
	//    9   17:aload_0         
	//   10   18:invokevirtual   #355 <Method int View.getHeight()>
	//   11   21:aload_1         
	//   12   22:getfield        #358 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//   13   25:iadd            
	//   14   26:aload_1         
	//   15   27:getfield        #361 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//   16   30:iadd            
	//   17   31:ireturn         
		} else
		{
			return view.getHeight();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #355 <Method int View.getHeight()>
	//   20   36:ireturn         
		}
	}

	protected LayoutParams a()
	{
		return new LayoutParams(-1, -1);
	//    0    0:new             #10  <Class CollapsingToolbarLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:iconst_m1       
	//    3    5:iconst_m1       
	//    4    6:invokespecial   #365 <Method void CollapsingToolbarLayout$LayoutParams(int, int)>
	//    5    9:areturn         
	}

	aa a(aa aa1)
	{
		aa aa2;
		if(android.support.v4.view.s.q(((View) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #368 <Method boolean s.q(View)>
	//*   2    4:ifeq            12
			aa2 = aa1;
	//    3    7:aload_1         
	//    4    8:astore_2        
		else
	//*   5    9:goto            14
			aa2 = null;
	//    6   12:aconst_null     
	//    7   13:astore_2        
		if(!android.support.v4.f.i.a(((Object) (d)), ((Object) (aa2))))
	//*   8   14:aload_0         
	//*   9   15:getfield        #370 <Field aa d>
	//*  10   18:aload_2         
	//*  11   19:invokestatic    #375 <Method boolean i.a(Object, Object)>
	//*  12   22:ifne            34
		{
			d = aa2;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #370 <Field aa d>
			requestLayout();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #378 <Method void requestLayout()>
		}
		return aa1.g();
	//   18   34:aload_1         
	//   19   35:invokevirtual   #383 <Method aa aa.g()>
	//   20   38:areturn         
	}

	protected android.widget.FrameLayout.LayoutParams a(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.widget.FrameLayout.LayoutParams) (new LayoutParams(layoutparams)));
	//    0    0:new             #10  <Class CollapsingToolbarLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #387 <Method void CollapsingToolbarLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//    4    8:areturn         
	}

	public void a(boolean flag, boolean flag1)
	{
		if(s != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #390 <Field boolean s>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          54
		{
			boolean flag2 = false;
	//    4    8:iconst_0        
	//    5    9:istore          4
			char c1 = '\0';
	//    6   11:iconst_0        
	//    7   12:istore_3        
			if(flag1)
	//*   8   13:iload_2         
	//*   9   14:ifeq            33
			{
				if(flag)
	//*  10   17:iload_1         
	//*  11   18:ifeq            25
					c1 = '\377';
	//   12   21:sipush          255
	//   13   24:istore_3        
				a(((int) (c1)));
	//   14   25:aload_0         
	//   15   26:iload_3         
	//   16   27:invokespecial   #391 <Method void a(int)>
			} else
	//*  17   30:goto            49
			{
				char c2 = ((char) (flag2));
	//   18   33:iload           4
	//   19   35:istore_3        
				if(flag)
	//*  20   36:iload_1         
	//*  21   37:ifeq            44
					c2 = '\377';
	//   22   40:sipush          255
	//   23   43:istore_3        
				setScrimAlpha(((int) (c2)));
	//   24   44:aload_0         
	//   25   45:iload_3         
	//   26   46:invokevirtual   #394 <Method void setScrimAlpha(int)>
			}
			s = flag;
	//   27   49:aload_0         
	//   28   50:iload_1         
	//   29   51:putfield        #390 <Field boolean s>
		}
	//   30   54:return          
	}

	final int b(View view)
	{
		p p1 = a(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #396 <Method p a(View)>
	//    2    4:astore_2        
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #350 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    5    9:checkcast       #10  <Class CollapsingToolbarLayout$LayoutParams>
	//    6   12:astore_3        
		return getHeight() - p1.c() - view.getHeight() - layoutparams.bottomMargin;
	//    7   13:aload_0         
	//    8   14:invokevirtual   #397 <Method int getHeight()>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #399 <Method int p.c()>
	//   11   21:isub            
	//   12   22:aload_1         
	//   13   23:invokevirtual   #355 <Method int View.getHeight()>
	//   14   26:isub            
	//   15   27:aload_3         
	//   16   28:getfield        #400 <Field int CollapsingToolbarLayout$LayoutParams.bottomMargin>
	//   17   31:isub            
	//   18   32:ireturn         
	}

	final void b()
	{
		if(q != null || b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #402 <Field Drawable q>
	//*   2    4:ifnonnull       14
	//*   3    7:aload_0         
	//*   4    8:getfield        #404 <Field Drawable b>
	//*   5   11:ifnull          42
		{
			boolean flag;
			if(getHeight() + c < getScrimVisibleHeightTrigger())
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #397 <Method int getHeight()>
	//*   8   18:aload_0         
	//*   9   19:getfield        #406 <Field int c>
	//*  10   22:iadd            
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #409 <Method int getScrimVisibleHeightTrigger()>
	//*  13   27:icmpge          35
				flag = true;
	//   14   30:iconst_1        
	//   15   31:istore_1        
			else
	//*  16   32:goto            37
				flag = false;
	//   17   35:iconst_0        
	//   18   36:istore_1        
			setScrimsShown(flag);
	//   19   37:aload_0         
	//   20   38:iload_1         
	//   21   39:invokevirtual   #412 <Method void setScrimsShown(boolean)>
		}
	//   22   42:return          
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return layoutparams instanceof LayoutParams;
	//    0    0:aload_1         
	//    1    1:instanceof      #10  <Class CollapsingToolbarLayout$LayoutParams>
	//    2    4:ireturn         
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #418 <Method void FrameLayout.draw(Canvas)>
		c();
	//    3    5:aload_0         
	//    4    6:invokespecial   #260 <Method void c()>
		if(g == null && q != null && r > 0)
	//*   5    9:aload_0         
	//*   6   10:getfield        #300 <Field Toolbar g>
	//*   7   13:ifnonnull       52
	//*   8   16:aload_0         
	//*   9   17:getfield        #402 <Field Drawable q>
	//*  10   20:ifnull          52
	//*  11   23:aload_0         
	//*  12   24:getfield        #271 <Field int r>
	//*  13   27:ifle            52
		{
			q.mutate().setAlpha(r);
	//   14   30:aload_0         
	//   15   31:getfield        #402 <Field Drawable q>
	//   16   34:invokevirtual   #424 <Method Drawable Drawable.mutate()>
	//   17   37:aload_0         
	//   18   38:getfield        #271 <Field int r>
	//   19   41:invokevirtual   #427 <Method void Drawable.setAlpha(int)>
			q.draw(canvas);
	//   20   44:aload_0         
	//   21   45:getfield        #402 <Field Drawable q>
	//   22   48:aload_1         
	//   23   49:invokevirtual   #428 <Method void Drawable.draw(Canvas)>
		}
		if(o && p)
	//*  24   52:aload_0         
	//*  25   53:getfield        #162 <Field boolean o>
	//*  26   56:ifeq            74
	//*  27   59:aload_0         
	//*  28   60:getfield        #430 <Field boolean p>
	//*  29   63:ifeq            74
			a.a(canvas);
	//   30   66:aload_0         
	//   31   67:getfield        #79  <Field e a>
	//   32   70:aload_1         
	//   33   71:invokevirtual   #432 <Method void android.support.design.widget.e.a(Canvas)>
		if(b != null && r > 0)
	//*  34   74:aload_0         
	//*  35   75:getfield        #404 <Field Drawable b>
	//*  36   78:ifnull          157
	//*  37   81:aload_0         
	//*  38   82:getfield        #271 <Field int r>
	//*  39   85:ifle            157
		{
			int i1;
			if(d != null)
	//*  40   88:aload_0         
	//*  41   89:getfield        #370 <Field aa d>
	//*  42   92:ifnull          106
				i1 = d.b();
	//   43   95:aload_0         
	//   44   96:getfield        #370 <Field aa d>
	//   45   99:invokevirtual   #434 <Method int aa.b()>
	//   46  102:istore_2        
			else
	//*  47  103:goto            108
				i1 = 0;
	//   48  106:iconst_0        
	//   49  107:istore_2        
			if(i1 > 0)
	//*  50  108:iload_2         
	//*  51  109:ifle            157
			{
				b.setBounds(0, -c, getWidth(), i1 - c);
	//   52  112:aload_0         
	//   53  113:getfield        #404 <Field Drawable b>
	//   54  116:iconst_0        
	//   55  117:aload_0         
	//   56  118:getfield        #406 <Field int c>
	//   57  121:ineg            
	//   58  122:aload_0         
	//   59  123:invokevirtual   #437 <Method int getWidth()>
	//   60  126:iload_2         
	//   61  127:aload_0         
	//   62  128:getfield        #406 <Field int c>
	//   63  131:isub            
	//   64  132:invokevirtual   #441 <Method void Drawable.setBounds(int, int, int, int)>
				b.mutate().setAlpha(r);
	//   65  135:aload_0         
	//   66  136:getfield        #404 <Field Drawable b>
	//   67  139:invokevirtual   #424 <Method Drawable Drawable.mutate()>
	//   68  142:aload_0         
	//   69  143:getfield        #271 <Field int r>
	//   70  146:invokevirtual   #427 <Method void Drawable.setAlpha(int)>
				b.draw(canvas);
	//   71  149:aload_0         
	//   72  150:getfield        #404 <Field Drawable b>
	//   73  153:aload_1         
	//   74  154:invokevirtual   #428 <Method void Drawable.draw(Canvas)>
			}
		}
	//   75  157:return          
	}

	protected boolean drawChild(Canvas canvas, View view, long l1)
	{
		Drawable drawable = q;
	//    0    0:aload_0         
	//    1    1:getfield        #402 <Field Drawable q>
	//    2    4:astore          7
		boolean flag1 = true;
	//    3    6:iconst_1        
	//    4    7:istore          6
		boolean flag;
		if(drawable != null && r > 0 && c(view))
	//*   5    9:aload           7
	//*   6   11:ifnull          57
	//*   7   14:aload_0         
	//*   8   15:getfield        #271 <Field int r>
	//*   9   18:ifle            57
	//*  10   21:aload_0         
	//*  11   22:aload_2         
	//*  12   23:invokespecial   #445 <Method boolean c(View)>
	//*  13   26:ifeq            57
		{
			q.mutate().setAlpha(r);
	//   14   29:aload_0         
	//   15   30:getfield        #402 <Field Drawable q>
	//   16   33:invokevirtual   #424 <Method Drawable Drawable.mutate()>
	//   17   36:aload_0         
	//   18   37:getfield        #271 <Field int r>
	//   19   40:invokevirtual   #427 <Method void Drawable.setAlpha(int)>
			q.draw(canvas);
	//   20   43:aload_0         
	//   21   44:getfield        #402 <Field Drawable q>
	//   22   47:aload_1         
	//   23   48:invokevirtual   #428 <Method void Drawable.draw(Canvas)>
			flag = true;
	//   24   51:iconst_1        
	//   25   52:istore          5
		} else
	//*  26   54:goto            60
		{
			flag = false;
	//   27   57:iconst_0        
	//   28   58:istore          5
		}
		if(!super.drawChild(canvas, view, l1))
	//*  29   60:aload_0         
	//*  30   61:aload_1         
	//*  31   62:aload_2         
	//*  32   63:lload_3         
	//*  33   64:invokespecial   #447 <Method boolean FrameLayout.drawChild(Canvas, View, long)>
	//*  34   67:ifne            80
		{
			if(flag)
	//*  35   70:iload           5
	//*  36   72:ifeq            77
				return true;
	//   37   75:iconst_1        
	//   38   76:ireturn         
			flag1 = false;
	//   39   77:iconst_0        
	//   40   78:istore          6
		}
		return flag1;
	//   41   80:iload           6
	//   42   82:ireturn         
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #450 <Method void FrameLayout.drawableStateChanged()>
		int ai[] = getDrawableState();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #454 <Method int[] getDrawableState()>
	//    4    8:astore_3        
		Drawable drawable = b;
	//    5    9:aload_0         
	//    6   10:getfield        #404 <Field Drawable b>
	//    7   13:astore          4
		boolean flag1 = false;
	//    8   15:iconst_0        
	//    9   16:istore_2        
		boolean flag = flag1;
	//   10   17:iload_2         
	//   11   18:istore_1        
		if(drawable != null)
	//*  12   19:aload           4
	//*  13   21:ifnull          43
		{
			flag = flag1;
	//   14   24:iload_2         
	//   15   25:istore_1        
			if(drawable.isStateful())
	//*  16   26:aload           4
	//*  17   28:invokevirtual   #457 <Method boolean Drawable.isStateful()>
	//*  18   31:ifeq            43
				flag = false | drawable.setState(ai);
	//   19   34:iconst_0        
	//   20   35:aload           4
	//   21   37:aload_3         
	//   22   38:invokevirtual   #461 <Method boolean Drawable.setState(int[])>
	//   23   41:ior             
	//   24   42:istore_1        
		}
		drawable = q;
	//   25   43:aload_0         
	//   26   44:getfield        #402 <Field Drawable q>
	//   27   47:astore          4
		flag1 = flag;
	//   28   49:iload_1         
	//   29   50:istore_2        
		if(drawable != null)
	//*  30   51:aload           4
	//*  31   53:ifnull          75
		{
			flag1 = flag;
	//   32   56:iload_1         
	//   33   57:istore_2        
			if(drawable.isStateful())
	//*  34   58:aload           4
	//*  35   60:invokevirtual   #457 <Method boolean Drawable.isStateful()>
	//*  36   63:ifeq            75
				flag1 = flag | drawable.setState(ai);
	//   37   66:iload_1         
	//   38   67:aload           4
	//   39   69:aload_3         
	//   40   70:invokevirtual   #461 <Method boolean Drawable.setState(int[])>
	//   41   73:ior             
	//   42   74:istore_2        
		}
		flag = flag1;
	//   43   75:iload_2         
	//   44   76:istore_1        
		if(a != null)
	//*  45   77:aload_0         
	//*  46   78:getfield        #79  <Field e a>
	//*  47   81:ifnull          95
			flag = flag1 | a.a(ai);
	//   48   84:iload_2         
	//   49   85:aload_0         
	//   50   86:getfield        #79  <Field e a>
	//   51   89:aload_3         
	//   52   90:invokevirtual   #463 <Method boolean android.support.design.widget.e.a(int[])>
	//   53   93:ior             
	//   54   94:istore_1        
		if(flag)
	//*  55   95:iload_1         
	//*  56   96:ifeq            103
			invalidate();
	//   57   99:aload_0         
	//   58  100:invokevirtual   #466 <Method void invalidate()>
	//   59  103:return          
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #469 <Method CollapsingToolbarLayout$LayoutParams a()>
	//    2    4:areturn         
	}

	protected android.widget.FrameLayout.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.widget.FrameLayout.LayoutParams) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #469 <Method CollapsingToolbarLayout$LayoutParams a()>
	//    2    4:areturn         
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #475 <Method android.widget.FrameLayout$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (a(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #478 <Method android.widget.FrameLayout$LayoutParams a(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	public android.widget.FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.widget.FrameLayout.LayoutParams) (new LayoutParams(getContext(), attributeset)));
	//    0    0:new             #10  <Class CollapsingToolbarLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #339 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #479 <Method void CollapsingToolbarLayout$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	public int getCollapsedTitleGravity()
	{
		return a.c();
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field e a>
	//    2    4:invokevirtual   #481 <Method int e.c()>
	//    3    7:ireturn         
	}

	public Typeface getCollapsedTitleTypeface()
	{
		return a.d();
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field e a>
	//    2    4:invokevirtual   #485 <Method Typeface e.d()>
	//    3    7:areturn         
	}

	public Drawable getContentScrim()
	{
		return q;
	//    0    0:aload_0         
	//    1    1:getfield        #402 <Field Drawable q>
	//    2    4:areturn         
	}

	public int getExpandedTitleGravity()
	{
		return a.b();
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field e a>
	//    2    4:invokevirtual   #488 <Method int e.b()>
	//    3    7:ireturn         
	}

	public int getExpandedTitleMarginBottom()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field int m>
	//    2    4:ireturn         
	}

	public int getExpandedTitleMarginEnd()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field int l>
	//    2    4:ireturn         
	}

	public int getExpandedTitleMarginStart()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field int j>
	//    2    4:ireturn         
	}

	public int getExpandedTitleMarginTop()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field int k>
	//    2    4:ireturn         
	}

	public Typeface getExpandedTitleTypeface()
	{
		return a.e();
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field e a>
	//    2    4:invokevirtual   #495 <Method Typeface e.e()>
	//    3    7:areturn         
	}

	int getScrimAlpha()
	{
		return r;
	//    0    0:aload_0         
	//    1    1:getfield        #271 <Field int r>
	//    2    4:ireturn         
	}

	public long getScrimAnimationDuration()
	{
		return u;
	//    0    0:aload_0         
	//    1    1:getfield        #202 <Field long u>
	//    2    4:lreturn         
	}

	public int getScrimVisibleHeightTrigger()
	{
		if(v >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field int v>
	//*   2    4:iflt            12
			return v;
	//    3    7:aload_0         
	//    4    8:getfield        #68  <Field int v>
	//    5   11:ireturn         
		int i1;
		if(d != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #370 <Field aa d>
	//*   8   16:ifnull          30
			i1 = d.b();
	//    9   19:aload_0         
	//   10   20:getfield        #370 <Field aa d>
	//   11   23:invokevirtual   #434 <Method int aa.b()>
	//   12   26:istore_1        
		else
	//*  13   27:goto            32
			i1 = 0;
	//   14   30:iconst_0        
	//   15   31:istore_1        
		int j1 = android.support.v4.view.s.j(((View) (this)));
	//   16   32:aload_0         
	//   17   33:invokestatic    #500 <Method int s.j(View)>
	//   18   36:istore_2        
		if(j1 > 0)
	//*  19   37:iload_2         
	//*  20   38:ifle            54
			return Math.min(j1 * 2 + i1, getHeight());
	//   21   41:iload_2         
	//   22   42:iconst_2        
	//   23   43:imul            
	//   24   44:iload_1         
	//   25   45:iadd            
	//   26   46:aload_0         
	//   27   47:invokevirtual   #397 <Method int getHeight()>
	//   28   50:invokestatic    #505 <Method int Math.min(int, int)>
	//   29   53:ireturn         
		else
			return getHeight() / 3;
	//   30   54:aload_0         
	//   31   55:invokevirtual   #397 <Method int getHeight()>
	//   32   58:iconst_3        
	//   33   59:idiv            
	//   34   60:ireturn         
	}

	public Drawable getStatusBarScrim()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #404 <Field Drawable b>
	//    2    4:areturn         
	}

	public CharSequence getTitle()
	{
		if(o)
	//*   0    0:aload_0         
	//*   1    1:getfield        #162 <Field boolean o>
	//*   2    4:ifeq            15
			return a.j();
	//    3    7:aload_0         
	//    4    8:getfield        #79  <Field e a>
	//    5   11:invokevirtual   #510 <Method CharSequence e.j()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #513 <Method void FrameLayout.onAttachedToWindow()>
		ViewParent viewparent = getParent();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #514 <Method ViewParent getParent()>
	//    4    8:astore_1        
		if(viewparent instanceof AppBarLayout)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #516 <Class AppBarLayout>
	//*   7   13:ifeq            61
		{
			android.support.v4.view.s.b(((View) (this)), android.support.v4.view.s.q((View)viewparent));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:checkcast       #247 <Class View>
	//   11   21:invokestatic    #368 <Method boolean s.q(View)>
	//   12   24:invokestatic    #519 <Method void s.b(View, boolean)>
			if(w == null)
	//*  13   27:aload_0         
	//*  14   28:getfield        #521 <Field AppBarLayout$a w>
	//*  15   31:ifnonnull       46
				w = ((AppBarLayout.a) (new a()));
	//   16   34:aload_0         
	//   17   35:new             #13  <Class CollapsingToolbarLayout$a>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:invokespecial   #522 <Method void CollapsingToolbarLayout$a(CollapsingToolbarLayout)>
	//   21   43:putfield        #521 <Field AppBarLayout$a w>
			((AppBarLayout)viewparent).a(w);
	//   22   46:aload_1         
	//   23   47:checkcast       #516 <Class AppBarLayout>
	//   24   50:aload_0         
	//   25   51:getfield        #521 <Field AppBarLayout$a w>
	//   26   54:invokevirtual   #525 <Method void android.support.design.widget.AppBarLayout.a(AppBarLayout$a)>
			android.support.v4.view.s.p(((View) (this)));
	//   27   57:aload_0         
	//   28   58:invokestatic    #527 <Method void s.p(View)>
		}
	//   29   61:return          
	}

	protected void onDetachedFromWindow()
	{
		ViewParent viewparent = getParent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #514 <Method ViewParent getParent()>
	//    2    4:astore_1        
		if(w != null && (viewparent instanceof AppBarLayout))
	//*   3    5:aload_0         
	//*   4    6:getfield        #521 <Field AppBarLayout$a w>
	//*   5    9:ifnull          30
	//*   6   12:aload_1         
	//*   7   13:instanceof      #516 <Class AppBarLayout>
	//*   8   16:ifeq            30
			((AppBarLayout)viewparent).b(w);
	//    9   19:aload_1         
	//   10   20:checkcast       #516 <Class AppBarLayout>
	//   11   23:aload_0         
	//   12   24:getfield        #521 <Field AppBarLayout$a w>
	//   13   27:invokevirtual   #530 <Method void AppBarLayout.b(AppBarLayout$a)>
		super.onDetachedFromWindow();
	//   14   30:aload_0         
	//   15   31:invokespecial   #532 <Method void FrameLayout.onDetachedFromWindow()>
	//   16   34:return          
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
	{
		super.onLayout(flag, i1, j1, k1, l1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #536 <Method void FrameLayout.onLayout(boolean, int, int, int, int)>
		aa aa1 = d;
	//    7   11:aload_0         
	//    8   12:getfield        #370 <Field aa d>
	//    9   15:astore          15
		boolean flag2 = false;
	//   10   17:iconst_0        
	//   11   18:istore          9
		if(aa1 != null)
	//*  12   20:aload           15
	//*  13   22:ifnull          92
		{
			int k2 = d.b();
	//   14   25:aload_0         
	//   15   26:getfield        #370 <Field aa d>
	//   16   29:invokevirtual   #434 <Method int aa.b()>
	//   17   32:istore          7
			int i3 = getChildCount();
	//   18   34:aload_0         
	//   19   35:invokevirtual   #315 <Method int getChildCount()>
	//   20   38:istore          8
			for(int i2 = 0; i2 < i3; i2++)
	//*  21   40:iconst_0        
	//*  22   41:istore          6
	//*  23   43:iload           6
	//*  24   45:iload           8
	//*  25   47:icmpge          92
			{
				View view = getChildAt(i2);
	//   26   50:aload_0         
	//   27   51:iload           6
	//   28   53:invokevirtual   #318 <Method View getChildAt(int)>
	//   29   56:astore          15
				if(!android.support.v4.view.s.q(view) && view.getTop() < k2)
	//*  30   58:aload           15
	//*  31   60:invokestatic    #368 <Method boolean s.q(View)>
	//*  32   63:ifne            83
	//*  33   66:aload           15
	//*  34   68:invokevirtual   #539 <Method int View.getTop()>
	//*  35   71:iload           7
	//*  36   73:icmpge          83
					android.support.v4.view.s.c(view, k2);
	//   37   76:aload           15
	//   38   78:iload           7
	//   39   80:invokestatic    #542 <Method void s.c(View, int)>
			}

	//   40   83:iload           6
	//   41   85:iconst_1        
	//   42   86:iadd            
	//   43   87:istore          6
		}
	//*  44   89:goto            43
		if(o && i != null)
	//*  45   92:aload_0         
	//*  46   93:getfield        #162 <Field boolean o>
	//*  47   96:ifeq            437
	//*  48   99:aload_0         
	//*  49  100:getfield        #330 <Field View i>
	//*  50  103:ifnull          437
		{
			flag = android.support.v4.view.s.A(i);
	//   51  106:aload_0         
	//   52  107:getfield        #330 <Field View i>
	//   53  110:invokestatic    #545 <Method boolean s.A(View)>
	//   54  113:istore_1        
			boolean flag1 = true;
	//   55  114:iconst_1        
	//   56  115:istore          6
			if(flag && i.getVisibility() == 0)
	//*  57  117:iload_1         
	//*  58  118:ifeq            136
	//*  59  121:aload_0         
	//*  60  122:getfield        #330 <Field View i>
	//*  61  125:invokevirtual   #548 <Method int View.getVisibility()>
	//*  62  128:ifne            136
				flag = true;
	//   63  131:iconst_1        
	//   64  132:istore_1        
			else
	//*  65  133:goto            138
				flag = false;
	//   66  136:iconst_0        
	//   67  137:istore_1        
			p = flag;
	//   68  138:aload_0         
	//   69  139:iload_1         
	//   70  140:putfield        #430 <Field boolean p>
			if(p)
	//*  71  143:aload_0         
	//*  72  144:getfield        #430 <Field boolean p>
	//*  73  147:ifeq            437
			{
				if(android.support.v4.view.s.e(((View) (this))) != 1)
	//*  74  150:aload_0         
	//*  75  151:invokestatic    #550 <Method int s.e(View)>
	//*  76  154:iconst_1        
	//*  77  155:icmpne          161
	//*  78  158:goto            164
					flag1 = false;
	//   79  161:iconst_0        
	//   80  162:istore          6
				Object obj;
				if(h != null)
	//*  81  164:aload_0         
	//*  82  165:getfield        #302 <Field View h>
	//*  83  168:ifnull          180
					obj = ((Object) (h));
	//   84  171:aload_0         
	//   85  172:getfield        #302 <Field View h>
	//   86  175:astore          15
				else
	//*  87  177:goto            186
					obj = ((Object) (g));
	//   88  180:aload_0         
	//   89  181:getfield        #300 <Field Toolbar g>
	//   90  184:astore          15
				int k3 = b(((View) (obj)));
	//   91  186:aload_0         
	//   92  187:aload           15
	//   93  189:invokevirtual   #552 <Method int b(View)>
	//   94  192:istore          10
				android.support.design.widget.o.b(((ViewGroup) (this)), i, n);
	//   95  194:aload_0         
	//   96  195:aload_0         
	//   97  196:getfield        #330 <Field View i>
	//   98  199:aload_0         
	//   99  200:getfield        #66  <Field Rect n>
	//  100  203:invokestatic    #557 <Method void o.b(ViewGroup, View, Rect)>
				obj = ((Object) (a));
	//  101  206:aload_0         
	//  102  207:getfield        #79  <Field e a>
	//  103  210:astore          15
				int l3 = n.left;
	//  104  212:aload_0         
	//  105  213:getfield        #66  <Field Rect n>
	//  106  216:getfield        #560 <Field int Rect.left>
	//  107  219:istore          11
				int l2;
				if(flag1)
	//* 108  221:iload           6
	//* 109  223:ifeq            238
					l2 = g.getTitleMarginEnd();
	//  110  226:aload_0         
	//  111  227:getfield        #300 <Field Toolbar g>
	//  112  230:invokevirtual   #563 <Method int Toolbar.getTitleMarginEnd()>
	//  113  233:istore          7
				else
	//* 114  235:goto            247
					l2 = g.getTitleMarginStart();
	//  115  238:aload_0         
	//  116  239:getfield        #300 <Field Toolbar g>
	//  117  242:invokevirtual   #566 <Method int Toolbar.getTitleMarginStart()>
	//  118  245:istore          7
				int i4 = n.top;
	//  119  247:aload_0         
	//  120  248:getfield        #66  <Field Rect n>
	//  121  251:getfield        #569 <Field int Rect.top>
	//  122  254:istore          12
				int j4 = g.getTitleMarginTop();
	//  123  256:aload_0         
	//  124  257:getfield        #300 <Field Toolbar g>
	//  125  260:invokevirtual   #572 <Method int Toolbar.getTitleMarginTop()>
	//  126  263:istore          13
				int k4 = n.right;
	//  127  265:aload_0         
	//  128  266:getfield        #66  <Field Rect n>
	//  129  269:getfield        #575 <Field int Rect.right>
	//  130  272:istore          14
				int j3;
				if(flag1)
	//* 131  274:iload           6
	//* 132  276:ifeq            291
					j3 = g.getTitleMarginStart();
	//  133  279:aload_0         
	//  134  280:getfield        #300 <Field Toolbar g>
	//  135  283:invokevirtual   #566 <Method int Toolbar.getTitleMarginStart()>
	//  136  286:istore          8
				else
	//* 137  288:goto            300
					j3 = g.getTitleMarginEnd();
	//  138  291:aload_0         
	//  139  292:getfield        #300 <Field Toolbar g>
	//  140  295:invokevirtual   #563 <Method int Toolbar.getTitleMarginEnd()>
	//  141  298:istore          8
				((e) (obj)).b(l3 + l2, i4 + k3 + j4, k4 + j3, (n.bottom + k3) - g.getTitleMarginBottom());
	//  142  300:aload           15
	//  143  302:iload           11
	//  144  304:iload           7
	//  145  306:iadd            
	//  146  307:iload           12
	//  147  309:iload           10
	//  148  311:iadd            
	//  149  312:iload           13
	//  150  314:iadd            
	//  151  315:iload           14
	//  152  317:iload           8
	//  153  319:iadd            
	//  154  320:aload_0         
	//  155  321:getfield        #66  <Field Rect n>
	//  156  324:getfield        #578 <Field int Rect.bottom>
	//  157  327:iload           10
	//  158  329:iadd            
	//  159  330:aload_0         
	//  160  331:getfield        #300 <Field Toolbar g>
	//  161  334:invokevirtual   #581 <Method int Toolbar.getTitleMarginBottom()>
	//  162  337:isub            
	//  163  338:invokevirtual   #583 <Method void e.b(int, int, int, int)>
				obj = ((Object) (a));
	//  164  341:aload_0         
	//  165  342:getfield        #79  <Field e a>
	//  166  345:astore          15
				if(flag1)
	//* 167  347:iload           6
	//* 168  349:ifeq            361
					l2 = l;
	//  169  352:aload_0         
	//  170  353:getfield        #133 <Field int l>
	//  171  356:istore          7
				else
	//* 172  358:goto            367
					l2 = j;
	//  173  361:aload_0         
	//  174  362:getfield        #137 <Field int j>
	//  175  365:istore          7
				j3 = n.top;
	//  176  367:aload_0         
	//  177  368:getfield        #66  <Field Rect n>
	//  178  371:getfield        #569 <Field int Rect.top>
	//  179  374:istore          8
				k3 = k;
	//  180  376:aload_0         
	//  181  377:getfield        #135 <Field int k>
	//  182  380:istore          10
				int j2;
				if(flag1)
	//* 183  382:iload           6
	//* 184  384:ifeq            396
					j2 = j;
	//  185  387:aload_0         
	//  186  388:getfield        #137 <Field int j>
	//  187  391:istore          6
				else
	//* 188  393:goto            402
					j2 = l;
	//  189  396:aload_0         
	//  190  397:getfield        #133 <Field int l>
	//  191  400:istore          6
				((e) (obj)).a(l2, j3 + k3, k1 - i1 - j2, l1 - j1 - m);
	//  192  402:aload           15
	//  193  404:iload           7
	//  194  406:iload           8
	//  195  408:iload           10
	//  196  410:iadd            
	//  197  411:iload           4
	//  198  413:iload_2         
	//  199  414:isub            
	//  200  415:iload           6
	//  201  417:isub            
	//  202  418:iload           5
	//  203  420:iload_3         
	//  204  421:isub            
	//  205  422:aload_0         
	//  206  423:getfield        #131 <Field int m>
	//  207  426:isub            
	//  208  427:invokevirtual   #585 <Method void android.support.design.widget.e.a(int, int, int, int)>
				a.i();
	//  209  430:aload_0         
	//  210  431:getfield        #79  <Field e a>
	//  211  434:invokevirtual   #587 <Method void android.support.design.widget.e.i()>
			}
		}
		j1 = getChildCount();
	//  212  437:aload_0         
	//  213  438:invokevirtual   #315 <Method int getChildCount()>
	//  214  441:istore_3        
		for(i1 = ((int) (flag2)); i1 < j1; i1++)
	//* 215  442:iload           9
	//* 216  444:istore_2        
	//* 217  445:iload_2         
	//* 218  446:iload_3         
	//* 219  447:icmpge          468
			a(getChildAt(i1)).a();
	//  220  450:aload_0         
	//  221  451:iload_2         
	//  222  452:invokevirtual   #318 <Method View getChildAt(int)>
	//  223  455:invokestatic    #396 <Method p a(View)>
	//  224  458:invokevirtual   #589 <Method void android.support.design.widget.p.a()>

	//  225  461:iload_2         
	//  226  462:iconst_1        
	//  227  463:iadd            
	//  228  464:istore_2        
	//* 229  465:goto            445
		if(g != null)
	//* 230  468:aload_0         
	//* 231  469:getfield        #300 <Field Toolbar g>
	//* 232  472:ifnull          551
		{
			if(o && TextUtils.isEmpty(a.j()))
	//* 233  475:aload_0         
	//* 234  476:getfield        #162 <Field boolean o>
	//* 235  479:ifeq            509
	//* 236  482:aload_0         
	//* 237  483:getfield        #79  <Field e a>
	//* 238  486:invokevirtual   #510 <Method CharSequence e.j()>
	//* 239  489:invokestatic    #595 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 240  492:ifeq            509
				a.a(g.getTitle());
	//  241  495:aload_0         
	//  242  496:getfield        #79  <Field e a>
	//  243  499:aload_0         
	//  244  500:getfield        #300 <Field Toolbar g>
	//  245  503:invokevirtual   #597 <Method CharSequence Toolbar.getTitle()>
	//  246  506:invokevirtual   #599 <Method void android.support.design.widget.e.a(CharSequence)>
			Object obj1;
			if(h != null && h != this)
	//* 247  509:aload_0         
	//* 248  510:getfield        #302 <Field View h>
	//* 249  513:ifnull          536
	//* 250  516:aload_0         
	//* 251  517:getfield        #302 <Field View h>
	//* 252  520:aload_0         
	//* 253  521:if_acmpne       527
	//* 254  524:goto            536
				obj1 = ((Object) (h));
	//  255  527:aload_0         
	//  256  528:getfield        #302 <Field View h>
	//  257  531:astore          15
			else
	//* 258  533:goto            542
				obj1 = ((Object) (g));
	//  259  536:aload_0         
	//  260  537:getfield        #300 <Field Toolbar g>
	//  261  540:astore          15
			setMinimumHeight(e(((View) (obj1))));
	//  262  542:aload_0         
	//  263  543:aload           15
	//  264  545:invokestatic    #600 <Method int e(View)>
	//  265  548:invokevirtual   #603 <Method void setMinimumHeight(int)>
		}
		b();
	//  266  551:aload_0         
	//  267  552:invokevirtual   #605 <Method void b()>
	//  268  555:return          
	}

	protected void onMeasure(int i1, int j1)
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #260 <Method void c()>
		super.onMeasure(i1, j1);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #608 <Method void FrameLayout.onMeasure(int, int)>
		int k1 = android.view.View.MeasureSpec.getMode(j1);
	//    6   10:iload_2         
	//    7   11:invokestatic    #614 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    8   14:istore_3        
		if(d != null)
	//*   9   15:aload_0         
	//*  10   16:getfield        #370 <Field aa d>
	//*  11   19:ifnull          33
			j1 = d.b();
	//   12   22:aload_0         
	//   13   23:getfield        #370 <Field aa d>
	//   14   26:invokevirtual   #434 <Method int aa.b()>
	//   15   29:istore_2        
		else
	//*  16   30:goto            35
			j1 = 0;
	//   17   33:iconst_0        
	//   18   34:istore_2        
		if(k1 == 0 && j1 > 0)
	//*  19   35:iload_3         
	//*  20   36:ifne            60
	//*  21   39:iload_2         
	//*  22   40:ifle            60
			super.onMeasure(i1, android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + j1, 0x40000000));
	//   23   43:aload_0         
	//   24   44:iload_1         
	//   25   45:aload_0         
	//   26   46:invokevirtual   #617 <Method int getMeasuredHeight()>
	//   27   49:iload_2         
	//   28   50:iadd            
	//   29   51:ldc2            #618 <Int 0x40000000>
	//   30   54:invokestatic    #621 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   31   57:invokespecial   #608 <Method void FrameLayout.onMeasure(int, int)>
	//   32   60:return          
	}

	protected void onSizeChanged(int i1, int j1, int k1, int l1)
	{
		super.onSizeChanged(i1, j1, k1, l1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #624 <Method void FrameLayout.onSizeChanged(int, int, int, int)>
		if(q != null)
	//*   6    9:aload_0         
	//*   7   10:getfield        #402 <Field Drawable q>
	//*   8   13:ifnull          27
			q.setBounds(0, 0, i1, j1);
	//    9   16:aload_0         
	//   10   17:getfield        #402 <Field Drawable q>
	//   11   20:iconst_0        
	//   12   21:iconst_0        
	//   13   22:iload_1         
	//   14   23:iload_2         
	//   15   24:invokevirtual   #441 <Method void Drawable.setBounds(int, int, int, int)>
	//   16   27:return          
	}

	public void setCollapsedTitleGravity(int i1)
	{
		a.b(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field e a>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #123 <Method void e.b(int)>
	//    4    8:return          
	}

	public void setCollapsedTitleTextAppearance(int i1)
	{
		a.c(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field e a>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #185 <Method void e.c(int)>
	//    4    8:return          
	}

	public void setCollapsedTitleTextColor(int i1)
	{
		setCollapsedTitleTextColor(ColorStateList.valueOf(i1));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #633 <Method ColorStateList ColorStateList.valueOf(int)>
	//    3    5:invokevirtual   #636 <Method void setCollapsedTitleTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setCollapsedTitleTextColor(ColorStateList colorstatelist)
	{
		a.a(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field e a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #638 <Method void android.support.design.widget.e.a(ColorStateList)>
	//    4    8:return          
	}

	public void setCollapsedTitleTypeface(Typeface typeface)
	{
		a.a(typeface);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field e a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #642 <Method void android.support.design.widget.e.a(Typeface)>
	//    4    8:return          
	}

	public void setContentScrim(Drawable drawable)
	{
		if(q != drawable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #402 <Field Drawable q>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       88
		{
			Drawable drawable2 = q;
	//    4    8:aload_0         
	//    5    9:getfield        #402 <Field Drawable q>
	//    6   12:astore_3        
			Drawable drawable1 = null;
	//    7   13:aconst_null     
	//    8   14:astore_2        
			if(drawable2 != null)
	//*   9   15:aload_3         
	//*  10   16:ifnull          27
				q.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//   11   19:aload_0         
	//   12   20:getfield        #402 <Field Drawable q>
	//   13   23:aconst_null     
	//   14   24:invokevirtual   #646 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(drawable != null)
	//*  15   27:aload_1         
	//*  16   28:ifnull          36
				drawable1 = drawable.mutate();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #424 <Method Drawable Drawable.mutate()>
	//   19   35:astore_2        
			q = drawable1;
	//   20   36:aload_0         
	//   21   37:aload_2         
	//   22   38:putfield        #402 <Field Drawable q>
			if(q != null)
	//*  23   41:aload_0         
	//*  24   42:getfield        #402 <Field Drawable q>
	//*  25   45:ifnull          84
			{
				q.setBounds(0, 0, getWidth(), getHeight());
	//   26   48:aload_0         
	//   27   49:getfield        #402 <Field Drawable q>
	//   28   52:iconst_0        
	//   29   53:iconst_0        
	//   30   54:aload_0         
	//   31   55:invokevirtual   #437 <Method int getWidth()>
	//   32   58:aload_0         
	//   33   59:invokevirtual   #397 <Method int getHeight()>
	//   34   62:invokevirtual   #441 <Method void Drawable.setBounds(int, int, int, int)>
				q.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   35   65:aload_0         
	//   36   66:getfield        #402 <Field Drawable q>
	//   37   69:aload_0         
	//   38   70:invokevirtual   #646 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
				q.setAlpha(r);
	//   39   73:aload_0         
	//   40   74:getfield        #402 <Field Drawable q>
	//   41   77:aload_0         
	//   42   78:getfield        #271 <Field int r>
	//   43   81:invokevirtual   #427 <Method void Drawable.setAlpha(int)>
			}
			android.support.v4.view.s.c(((View) (this)));
	//   44   84:aload_0         
	//   45   85:invokestatic    #648 <Method void s.c(View)>
		}
	//   46   88:return          
	}

	public void setContentScrimColor(int i1)
	{
		setContentScrim(((Drawable) (new ColorDrawable(i1))));
	//    0    0:aload_0         
	//    1    1:new             #651 <Class ColorDrawable>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #653 <Method void ColorDrawable(int)>
	//    5    9:invokevirtual   #213 <Method void setContentScrim(Drawable)>
	//    6   12:return          
	}

	public void setContentScrimResource(int i1)
	{
		setContentScrim(android.support.v4.content.a.getDrawable(getContext(), i1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #339 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #659 <Method Drawable a.getDrawable(Context, int)>
	//    5    9:invokevirtual   #213 <Method void setContentScrim(Drawable)>
	//    6   12:return          
	}

	public void setExpandedTitleColor(int i1)
	{
		setExpandedTitleTextColor(ColorStateList.valueOf(i1));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #633 <Method ColorStateList ColorStateList.valueOf(int)>
	//    3    5:invokevirtual   #663 <Method void setExpandedTitleTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setExpandedTitleGravity(int i1)
	{
		a.a(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field e a>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #117 <Method void android.support.design.widget.e.a(int)>
	//    4    8:return          
	}

	public void setExpandedTitleMarginBottom(int i1)
	{
		m = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #131 <Field int m>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #378 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setExpandedTitleMarginEnd(int i1)
	{
		l = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #133 <Field int l>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #378 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setExpandedTitleMarginStart(int i1)
	{
		j = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #137 <Field int j>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #378 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setExpandedTitleMarginTop(int i1)
	{
		k = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #135 <Field int k>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #378 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setExpandedTitleTextAppearance(int i1)
	{
		a.d(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field e a>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #178 <Method void e.d(int)>
	//    4    8:return          
	}

	public void setExpandedTitleTextColor(ColorStateList colorstatelist)
	{
		a.b(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field e a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #671 <Method void e.b(ColorStateList)>
	//    4    8:return          
	}

	public void setExpandedTitleTypeface(Typeface typeface)
	{
		a.b(typeface);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field e a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #674 <Method void e.b(Typeface)>
	//    4    8:return          
	}

	void setScrimAlpha(int i1)
	{
		if(i1 != r)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #271 <Field int r>
	//*   3    5:icmpeq          38
		{
			if(q != null && g != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #402 <Field Drawable q>
	//*   6   12:ifnull          29
	//*   7   15:aload_0         
	//*   8   16:getfield        #300 <Field Toolbar g>
	//*   9   19:ifnull          29
				android.support.v4.view.s.c(((View) (g)));
	//   10   22:aload_0         
	//   11   23:getfield        #300 <Field Toolbar g>
	//   12   26:invokestatic    #648 <Method void s.c(View)>
			r = i1;
	//   13   29:aload_0         
	//   14   30:iload_1         
	//   15   31:putfield        #271 <Field int r>
			android.support.v4.view.s.c(((View) (this)));
	//   16   34:aload_0         
	//   17   35:invokestatic    #648 <Method void s.c(View)>
		}
	//   18   38:return          
	}

	public void setScrimAnimationDuration(long l1)
	{
		u = l1;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #202 <Field long u>
	//    3    5:return          
	}

	public void setScrimVisibleHeightTrigger(int i1)
	{
		if(v != i1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field int v>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			v = i1;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #68  <Field int v>
			b();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #605 <Method void b()>
		}
	//    9   17:return          
	}

	public void setScrimsShown(boolean flag)
	{
		boolean flag1;
		if(android.support.v4.view.s.x(((View) (this))) && !isInEditMode())
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #680 <Method boolean s.x(View)>
	//*   2    4:ifeq            19
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #683 <Method boolean isInEditMode()>
	//*   5   11:ifne            19
			flag1 = true;
	//    6   14:iconst_1        
	//    7   15:istore_2        
		else
	//*   8   16:goto            21
			flag1 = false;
	//    9   19:iconst_0        
	//   10   20:istore_2        
		a(flag, flag1);
	//   11   21:aload_0         
	//   12   22:iload_1         
	//   13   23:iload_2         
	//   14   24:invokevirtual   #685 <Method void a(boolean, boolean)>
	//   15   27:return          
	}

	public void setStatusBarScrim(Drawable drawable)
	{
		if(b != drawable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #404 <Field Drawable b>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       133
		{
			Drawable drawable2 = b;
	//    4    8:aload_0         
	//    5    9:getfield        #404 <Field Drawable b>
	//    6   12:astore          4
			Drawable drawable1 = null;
	//    7   14:aconst_null     
	//    8   15:astore_3        
			if(drawable2 != null)
	//*   9   16:aload           4
	//*  10   18:ifnull          29
				b.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//   11   21:aload_0         
	//   12   22:getfield        #404 <Field Drawable b>
	//   13   25:aconst_null     
	//   14   26:invokevirtual   #646 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(drawable != null)
	//*  15   29:aload_1         
	//*  16   30:ifnull          38
				drawable1 = drawable.mutate();
	//   17   33:aload_1         
	//   18   34:invokevirtual   #424 <Method Drawable Drawable.mutate()>
	//   19   37:astore_3        
			b = drawable1;
	//   20   38:aload_0         
	//   21   39:aload_3         
	//   22   40:putfield        #404 <Field Drawable b>
			if(b != null)
	//*  23   43:aload_0         
	//*  24   44:getfield        #404 <Field Drawable b>
	//*  25   47:ifnull          129
			{
				if(b.isStateful())
	//*  26   50:aload_0         
	//*  27   51:getfield        #404 <Field Drawable b>
	//*  28   54:invokevirtual   #457 <Method boolean Drawable.isStateful()>
	//*  29   57:ifeq            72
					b.setState(getDrawableState());
	//   30   60:aload_0         
	//   31   61:getfield        #404 <Field Drawable b>
	//   32   64:aload_0         
	//   33   65:invokevirtual   #454 <Method int[] getDrawableState()>
	//   34   68:invokevirtual   #461 <Method boolean Drawable.setState(int[])>
	//   35   71:pop             
				android.support.v4.a.a.a.b(b, android.support.v4.view.s.e(((View) (this))));
	//   36   72:aload_0         
	//   37   73:getfield        #404 <Field Drawable b>
	//   38   76:aload_0         
	//   39   77:invokestatic    #550 <Method int s.e(View)>
	//   40   80:invokestatic    #690 <Method boolean android.support.v4.a.a.a.b(Drawable, int)>
	//   41   83:pop             
				drawable = b;
	//   42   84:aload_0         
	//   43   85:getfield        #404 <Field Drawable b>
	//   44   88:astore_1        
				boolean flag;
				if(getVisibility() == 0)
	//*  45   89:aload_0         
	//*  46   90:invokevirtual   #691 <Method int getVisibility()>
	//*  47   93:ifne            101
					flag = true;
	//   48   96:iconst_1        
	//   49   97:istore_2        
				else
	//*  50   98:goto            103
					flag = false;
	//   51  101:iconst_0        
	//   52  102:istore_2        
				drawable.setVisible(flag, false);
	//   53  103:aload_1         
	//   54  104:iload_2         
	//   55  105:iconst_0        
	//   56  106:invokevirtual   #695 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   57  109:pop             
				b.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   58  110:aload_0         
	//   59  111:getfield        #404 <Field Drawable b>
	//   60  114:aload_0         
	//   61  115:invokevirtual   #646 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
				b.setAlpha(r);
	//   62  118:aload_0         
	//   63  119:getfield        #404 <Field Drawable b>
	//   64  122:aload_0         
	//   65  123:getfield        #271 <Field int r>
	//   66  126:invokevirtual   #427 <Method void Drawable.setAlpha(int)>
			}
			android.support.v4.view.s.c(((View) (this)));
	//   67  129:aload_0         
	//   68  130:invokestatic    #648 <Method void s.c(View)>
		}
	//   69  133:return          
	}

	public void setStatusBarScrimColor(int i1)
	{
		setStatusBarScrim(((Drawable) (new ColorDrawable(i1))));
	//    0    0:aload_0         
	//    1    1:new             #651 <Class ColorDrawable>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #653 <Method void ColorDrawable(int)>
	//    5    9:invokevirtual   #219 <Method void setStatusBarScrim(Drawable)>
	//    6   12:return          
	}

	public void setStatusBarScrimResource(int i1)
	{
		setStatusBarScrim(android.support.v4.content.a.getDrawable(getContext(), i1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #339 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #659 <Method Drawable a.getDrawable(Context, int)>
	//    5    9:invokevirtual   #219 <Method void setStatusBarScrim(Drawable)>
	//    6   12:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		a.a(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field e a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #599 <Method void android.support.design.widget.e.a(CharSequence)>
	//    4    8:return          
	}

	public void setTitleEnabled(boolean flag)
	{
		if(flag != o)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #162 <Field boolean o>
	//*   3    5:icmpeq          21
		{
			o = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #162 <Field boolean o>
			d();
	//    7   13:aload_0         
	//    8   14:invokespecial   #320 <Method void d()>
			requestLayout();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #378 <Method void requestLayout()>
		}
	//   11   21:return          
	}

	public void setVisibility(int i1)
	{
		super.setVisibility(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #701 <Method void FrameLayout.setVisibility(int)>
		boolean flag;
		if(i1 == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            14
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_2        
		else
	//*   7   11:goto            16
			flag = false;
	//    8   14:iconst_0        
	//    9   15:istore_2        
		if(b != null && b.isVisible() != flag)
	//*  10   16:aload_0         
	//*  11   17:getfield        #404 <Field Drawable b>
	//*  12   20:ifnull          44
	//*  13   23:aload_0         
	//*  14   24:getfield        #404 <Field Drawable b>
	//*  15   27:invokevirtual   #704 <Method boolean Drawable.isVisible()>
	//*  16   30:iload_2         
	//*  17   31:icmpeq          44
			b.setVisible(flag, false);
	//   18   34:aload_0         
	//   19   35:getfield        #404 <Field Drawable b>
	//   20   38:iload_2         
	//   21   39:iconst_0        
	//   22   40:invokevirtual   #695 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   23   43:pop             
		if(q != null && q.isVisible() != flag)
	//*  24   44:aload_0         
	//*  25   45:getfield        #402 <Field Drawable q>
	//*  26   48:ifnull          72
	//*  27   51:aload_0         
	//*  28   52:getfield        #402 <Field Drawable q>
	//*  29   55:invokevirtual   #704 <Method boolean Drawable.isVisible()>
	//*  30   58:iload_2         
	//*  31   59:icmpeq          72
			q.setVisible(flag, false);
	//   32   62:aload_0         
	//   33   63:getfield        #402 <Field Drawable q>
	//   34   66:iload_2         
	//   35   67:iconst_0        
	//   36   68:invokevirtual   #695 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   37   71:pop             
	//   38   72:return          
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || drawable == q || drawable == b;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #708 <Method boolean FrameLayout.verifyDrawable(Drawable)>
	//    3    5:ifne            29
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #402 <Field Drawable q>
	//    7   13:if_acmpeq       29
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #404 <Field Drawable b>
	//   11   21:if_acmpne       27
	//   12   24:goto            29
	//   13   27:iconst_0        
	//   14   28:ireturn         
	//   15   29:iconst_1        
	//   16   30:ireturn         
	}

	final e a;
	Drawable b;
	int c;
	aa d;
	private boolean e;
	private int f;
	private Toolbar g;
	private View h;
	private View i;
	private int j;
	private int k;
	private int l;
	private int m;
	private final Rect n;
	private boolean o;
	private boolean p;
	private Drawable q;
	private int r;
	private boolean s;
	private ValueAnimator t;
	private long u;
	private int v;
	private AppBarLayout.a w;
}
