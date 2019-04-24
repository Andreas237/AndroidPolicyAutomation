// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.view.s;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.*;

public class SnackbarContentLayout extends LinearLayout
	implements android.support.design.widget.b.c
{

	public SnackbarContentLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #18  <Method void SnackbarContentLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public SnackbarContentLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #20  <Method void LinearLayout(Context, AttributeSet)>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.a.k.SnackbarLayout)));
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:getstatic       #26  <Field int[] android.support.design.a$k.SnackbarLayout>
	//    7   11:invokevirtual   #32  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    8   14:astore_1        
		c = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.a.k.SnackbarLayout_android_maxWidth, -1);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:getstatic       #35  <Field int android.support.design.a$k.SnackbarLayout_android_maxWidth>
	//   12   20:iconst_m1       
	//   13   21:invokevirtual   #41  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   14   24:putfield        #43  <Field int c>
		d = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.a.k.SnackbarLayout_maxActionInlineWidth, -1);
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:getstatic       #46  <Field int android.support.design.a$k.SnackbarLayout_maxActionInlineWidth>
	//   18   32:iconst_m1       
	//   19   33:invokevirtual   #41  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   20   36:putfield        #48  <Field int d>
		((TypedArray) (context)).recycle();
	//   21   39:aload_1         
	//   22   40:invokevirtual   #52  <Method void TypedArray.recycle()>
	//   23   43:return          
	}

	private static void a(View view, int i, int j)
	{
		if(s.s(view))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #59  <Method boolean s.s(View)>
	//*   2    4:ifeq            22
		{
			s.b(view, s.g(view), i, s.h(view), j);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokestatic    #63  <Method int s.g(View)>
	//    6   12:iload_1         
	//    7   13:aload_0         
	//    8   14:invokestatic    #66  <Method int s.h(View)>
	//    9   17:iload_2         
	//   10   18:invokestatic    #69  <Method void s.b(View, int, int, int, int)>
			return;
	//   11   21:return          
		} else
		{
			view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), j);
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #75  <Method int View.getPaddingLeft()>
	//   15   27:iload_1         
	//   16   28:aload_0         
	//   17   29:invokevirtual   #78  <Method int View.getPaddingRight()>
	//   18   32:iload_2         
	//   19   33:invokevirtual   #82  <Method void View.setPadding(int, int, int, int)>
			return;
	//   20   36:return          
		}
	}

	private boolean a(int i, int j, int k)
	{
		boolean flag;
		if(i != getOrientation())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #86  <Method int getOrientation()>
	//*   3    5:icmpeq          19
		{
			setOrientation(i);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokevirtual   #90  <Method void setOrientation(int)>
			flag = true;
	//    7   13:iconst_1        
	//    8   14:istore          4
		} else
	//*   9   16:goto            22
		{
			flag = false;
	//   10   19:iconst_0        
	//   11   20:istore          4
		}
		if(a.getPaddingTop() != j || a.getPaddingBottom() != k)
	//*  12   22:aload_0         
	//*  13   23:getfield        #92  <Field TextView a>
	//*  14   26:invokevirtual   #97  <Method int TextView.getPaddingTop()>
	//*  15   29:iload_2         
	//*  16   30:icmpne          44
	//*  17   33:aload_0         
	//*  18   34:getfield        #92  <Field TextView a>
	//*  19   37:invokevirtual   #100 <Method int TextView.getPaddingBottom()>
	//*  20   40:iload_3         
	//*  21   41:icmpeq          56
		{
			a(((View) (a)), j, k);
	//   22   44:aload_0         
	//   23   45:getfield        #92  <Field TextView a>
	//   24   48:iload_2         
	//   25   49:iload_3         
	//   26   50:invokestatic    #102 <Method void a(View, int, int)>
			flag = true;
	//   27   53:iconst_1        
	//   28   54:istore          4
		}
		return flag;
	//   29   56:iload           4
	//   30   58:ireturn         
	}

	public void a(int i, int j)
	{
		a.setAlpha(0.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field TextView a>
	//    2    4:fconst_0        
	//    3    5:invokevirtual   #107 <Method void TextView.setAlpha(float)>
		ViewPropertyAnimator viewpropertyanimator = a.animate().alpha(1.0F);
	//    4    8:aload_0         
	//    5    9:getfield        #92  <Field TextView a>
	//    6   12:invokevirtual   #111 <Method ViewPropertyAnimator TextView.animate()>
	//    7   15:fconst_1        
	//    8   16:invokevirtual   #117 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//    9   19:astore          7
		long l = j;
	//   10   21:iload_2         
	//   11   22:i2l             
	//   12   23:lstore_3        
		viewpropertyanimator = viewpropertyanimator.setDuration(l);
	//   13   24:aload           7
	//   14   26:lload_3         
	//   15   27:invokevirtual   #121 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   16   30:astore          7
		long l1 = i;
	//   17   32:iload_1         
	//   18   33:i2l             
	//   19   34:lstore          5
		viewpropertyanimator.setStartDelay(l1).start();
	//   20   36:aload           7
	//   21   38:lload           5
	//   22   40:invokevirtual   #124 <Method ViewPropertyAnimator ViewPropertyAnimator.setStartDelay(long)>
	//   23   43:invokevirtual   #127 <Method void ViewPropertyAnimator.start()>
		if(b.getVisibility() == 0)
	//*  24   46:aload_0         
	//*  25   47:getfield        #129 <Field Button b>
	//*  26   50:invokevirtual   #134 <Method int Button.getVisibility()>
	//*  27   53:ifne            87
		{
			b.setAlpha(0.0F);
	//   28   56:aload_0         
	//   29   57:getfield        #129 <Field Button b>
	//   30   60:fconst_0        
	//   31   61:invokevirtual   #135 <Method void Button.setAlpha(float)>
			b.animate().alpha(1.0F).setDuration(l).setStartDelay(l1).start();
	//   32   64:aload_0         
	//   33   65:getfield        #129 <Field Button b>
	//   34   68:invokevirtual   #136 <Method ViewPropertyAnimator Button.animate()>
	//   35   71:fconst_1        
	//   36   72:invokevirtual   #117 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   37   75:lload_3         
	//   38   76:invokevirtual   #121 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   39   79:lload           5
	//   40   81:invokevirtual   #124 <Method ViewPropertyAnimator ViewPropertyAnimator.setStartDelay(long)>
	//   41   84:invokevirtual   #127 <Method void ViewPropertyAnimator.start()>
		}
	//   42   87:return          
	}

	public void b(int i, int j)
	{
		a.setAlpha(1.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field TextView a>
	//    2    4:fconst_1        
	//    3    5:invokevirtual   #107 <Method void TextView.setAlpha(float)>
		ViewPropertyAnimator viewpropertyanimator = a.animate().alpha(0.0F);
	//    4    8:aload_0         
	//    5    9:getfield        #92  <Field TextView a>
	//    6   12:invokevirtual   #111 <Method ViewPropertyAnimator TextView.animate()>
	//    7   15:fconst_0        
	//    8   16:invokevirtual   #117 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//    9   19:astore          7
		long l = j;
	//   10   21:iload_2         
	//   11   22:i2l             
	//   12   23:lstore_3        
		viewpropertyanimator = viewpropertyanimator.setDuration(l);
	//   13   24:aload           7
	//   14   26:lload_3         
	//   15   27:invokevirtual   #121 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   16   30:astore          7
		long l1 = i;
	//   17   32:iload_1         
	//   18   33:i2l             
	//   19   34:lstore          5
		viewpropertyanimator.setStartDelay(l1).start();
	//   20   36:aload           7
	//   21   38:lload           5
	//   22   40:invokevirtual   #124 <Method ViewPropertyAnimator ViewPropertyAnimator.setStartDelay(long)>
	//   23   43:invokevirtual   #127 <Method void ViewPropertyAnimator.start()>
		if(b.getVisibility() == 0)
	//*  24   46:aload_0         
	//*  25   47:getfield        #129 <Field Button b>
	//*  26   50:invokevirtual   #134 <Method int Button.getVisibility()>
	//*  27   53:ifne            87
		{
			b.setAlpha(1.0F);
	//   28   56:aload_0         
	//   29   57:getfield        #129 <Field Button b>
	//   30   60:fconst_1        
	//   31   61:invokevirtual   #135 <Method void Button.setAlpha(float)>
			b.animate().alpha(0.0F).setDuration(l).setStartDelay(l1).start();
	//   32   64:aload_0         
	//   33   65:getfield        #129 <Field Button b>
	//   34   68:invokevirtual   #136 <Method ViewPropertyAnimator Button.animate()>
	//   35   71:fconst_0        
	//   36   72:invokevirtual   #117 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   37   75:lload_3         
	//   38   76:invokevirtual   #121 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   39   79:lload           5
	//   40   81:invokevirtual   #124 <Method ViewPropertyAnimator ViewPropertyAnimator.setStartDelay(long)>
	//   41   84:invokevirtual   #127 <Method void ViewPropertyAnimator.start()>
		}
	//   42   87:return          
	}

	public Button getActionView()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field Button b>
	//    2    4:areturn         
	}

	public TextView getMessageView()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field TextView a>
	//    2    4:areturn         
	}

	protected void onFinishInflate()
	{
		super.onFinishInflate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #143 <Method void LinearLayout.onFinishInflate()>
		a = (TextView)findViewById(android.support.design.a.f.snackbar_text);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getstatic       #148 <Field int android.support.design.a$f.snackbar_text>
	//    5    9:invokevirtual   #152 <Method View findViewById(int)>
	//    6   12:checkcast       #94  <Class TextView>
	//    7   15:putfield        #92  <Field TextView a>
		b = (Button)findViewById(android.support.design.a.f.snackbar_action);
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getstatic       #155 <Field int android.support.design.a$f.snackbar_action>
	//   11   23:invokevirtual   #152 <Method View findViewById(int)>
	//   12   26:checkcast       #131 <Class Button>
	//   13   29:putfield        #129 <Field Button b>
	//   14   32:return          
	}

	protected void onMeasure(int i, int j)
	{
		int k;
label0:
		{
			super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #158 <Method void LinearLayout.onMeasure(int, int)>
			k = i;
	//    4    6:iload_1         
	//    5    7:istore_3        
			if(c > 0)
	//*   6    8:aload_0         
	//*   7    9:getfield        #43  <Field int c>
	//*   8   12:ifle            44
			{
				k = i;
	//    9   15:iload_1         
	//   10   16:istore_3        
				if(getMeasuredWidth() > c)
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #161 <Method int getMeasuredWidth()>
	//*  13   21:aload_0         
	//*  14   22:getfield        #43  <Field int c>
	//*  15   25:icmple          44
				{
					k = android.view.View.MeasureSpec.makeMeasureSpec(c, 0x40000000);
	//   16   28:aload_0         
	//   17   29:getfield        #43  <Field int c>
	//   18   32:ldc1            #162 <Int 0x40000000>
	//   19   34:invokestatic    #167 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   20   37:istore_3        
					super.onMeasure(k, j);
	//   21   38:aload_0         
	//   22   39:iload_3         
	//   23   40:iload_2         
	//   24   41:invokespecial   #158 <Method void LinearLayout.onMeasure(int, int)>
				}
			}
			int l = getResources().getDimensionPixelSize(android.support.design.a.d.design_snackbar_padding_vertical_2lines);
	//   25   44:aload_0         
	//   26   45:invokevirtual   #171 <Method Resources getResources()>
	//   27   48:getstatic       #176 <Field int android.support.design.a$d.design_snackbar_padding_vertical_2lines>
	//   28   51:invokevirtual   #181 <Method int Resources.getDimensionPixelSize(int)>
	//   29   54:istore          5
			int i1 = getResources().getDimensionPixelSize(android.support.design.a.d.design_snackbar_padding_vertical);
	//   30   56:aload_0         
	//   31   57:invokevirtual   #171 <Method Resources getResources()>
	//   32   60:getstatic       #184 <Field int android.support.design.a$d.design_snackbar_padding_vertical>
	//   33   63:invokevirtual   #181 <Method int Resources.getDimensionPixelSize(int)>
	//   34   66:istore          6
			i = a.getLayout().getLineCount();
	//   35   68:aload_0         
	//   36   69:getfield        #92  <Field TextView a>
	//   37   72:invokevirtual   #188 <Method Layout TextView.getLayout()>
	//   38   75:invokevirtual   #193 <Method int Layout.getLineCount()>
	//   39   78:istore_1        
			boolean flag = true;
	//   40   79:iconst_1        
	//   41   80:istore          4
			if(i > 1)
	//*  42   82:iload_1         
	//*  43   83:iconst_1        
	//*  44   84:icmple          92
				i = 1;
	//   45   87:iconst_1        
	//   46   88:istore_1        
			else
	//*  47   89:goto            94
				i = 0;
	//   48   92:iconst_0        
	//   49   93:istore_1        
			if(i != 0 && d > 0 && b.getMeasuredWidth() > d)
	//*  50   94:iload_1         
	//*  51   95:ifeq            140
	//*  52   98:aload_0         
	//*  53   99:getfield        #48  <Field int d>
	//*  54  102:ifle            140
	//*  55  105:aload_0         
	//*  56  106:getfield        #129 <Field Button b>
	//*  57  109:invokevirtual   #194 <Method int Button.getMeasuredWidth()>
	//*  58  112:aload_0         
	//*  59  113:getfield        #48  <Field int d>
	//*  60  116:icmple          140
			{
				if(a(1, l, l - i1))
	//*  61  119:aload_0         
	//*  62  120:iconst_1        
	//*  63  121:iload           5
	//*  64  123:iload           5
	//*  65  125:iload           6
	//*  66  127:isub            
	//*  67  128:invokespecial   #196 <Method boolean a(int, int, int)>
	//*  68  131:ifeq            169
				{
					i = ((int) (flag));
	//   69  134:iload           4
	//   70  136:istore_1        
					break label0;
	//   71  137:goto            171
				}
			} else
			{
				if(i != 0)
	//*  72  140:iload_1         
	//*  73  141:ifeq            150
					i = l;
	//   74  144:iload           5
	//   75  146:istore_1        
				else
	//*  76  147:goto            153
					i = i1;
	//   77  150:iload           6
	//   78  152:istore_1        
				if(a(0, i, i))
	//*  79  153:aload_0         
	//*  80  154:iconst_0        
	//*  81  155:iload_1         
	//*  82  156:iload_1         
	//*  83  157:invokespecial   #196 <Method boolean a(int, int, int)>
	//*  84  160:ifeq            169
				{
					i = ((int) (flag));
	//   85  163:iload           4
	//   86  165:istore_1        
					break label0;
	//   87  166:goto            171
				}
			}
			i = 0;
	//   88  169:iconst_0        
	//   89  170:istore_1        
		}
		if(i != 0)
	//*  90  171:iload_1         
	//*  91  172:ifeq            181
			super.onMeasure(k, j);
	//   92  175:aload_0         
	//   93  176:iload_3         
	//   94  177:iload_2         
	//   95  178:invokespecial   #158 <Method void LinearLayout.onMeasure(int, int)>
	//   96  181:return          
	}

	private TextView a;
	private Button b;
	private int c;
	private int d;
}
