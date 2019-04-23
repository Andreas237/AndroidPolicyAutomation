// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.design.e;
import android.support.design.g;
import android.support.design.h.a;
import android.support.design.l;
import android.support.v4.view.ac;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.*;

public class SnackbarContentLayout extends LinearLayout
	implements a
{

	public SnackbarContentLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #17  <Method void LinearLayout(Context, AttributeSet)>
		context = ((Context) (context.obtainStyledAttributes(attributeset, l.SnackbarLayout)));
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:getstatic       #23  <Field int[] l.SnackbarLayout>
	//    7   11:invokevirtual   #29  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    8   14:astore_1        
		c = ((TypedArray) (context)).getDimensionPixelSize(l.SnackbarLayout_android_maxWidth, -1);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:getstatic       #32  <Field int l.SnackbarLayout_android_maxWidth>
	//   12   20:iconst_m1       
	//   13   21:invokevirtual   #38  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   14   24:putfield        #40  <Field int c>
		d = ((TypedArray) (context)).getDimensionPixelSize(l.SnackbarLayout_maxActionInlineWidth, -1);
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:getstatic       #43  <Field int l.SnackbarLayout_maxActionInlineWidth>
	//   18   32:iconst_m1       
	//   19   33:invokevirtual   #38  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   20   36:putfield        #45  <Field int d>
		((TypedArray) (context)).recycle();
	//   21   39:aload_1         
	//   22   40:invokevirtual   #49  <Method void TypedArray.recycle()>
	//   23   43:return          
	}

	private static void a(View view, int i, int j)
	{
		if(ac.s(view))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #57  <Method boolean ac.s(View)>
	//*   2    4:ifeq            22
		{
			ac.b(view, ac.h(view), i, ac.i(view), j);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokestatic    #61  <Method int ac.h(View)>
	//    6   12:iload_1         
	//    7   13:aload_0         
	//    8   14:invokestatic    #64  <Method int ac.i(View)>
	//    9   17:iload_2         
	//   10   18:invokestatic    #67  <Method void ac.b(View, int, int, int, int)>
			return;
	//   11   21:return          
		} else
		{
			view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), j);
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #73  <Method int View.getPaddingLeft()>
	//   15   27:iload_1         
	//   16   28:aload_0         
	//   17   29:invokevirtual   #76  <Method int View.getPaddingRight()>
	//   18   32:iload_2         
	//   19   33:invokevirtual   #80  <Method void View.setPadding(int, int, int, int)>
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
	//*   2    2:invokevirtual   #84  <Method int getOrientation()>
	//*   3    5:icmpeq          19
		{
			setOrientation(i);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokevirtual   #88  <Method void setOrientation(int)>
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
	//*  13   23:getfield        #90  <Field TextView a>
	//*  14   26:invokevirtual   #95  <Method int TextView.getPaddingTop()>
	//*  15   29:iload_2         
	//*  16   30:icmpne          44
	//*  17   33:aload_0         
	//*  18   34:getfield        #90  <Field TextView a>
	//*  19   37:invokevirtual   #98  <Method int TextView.getPaddingBottom()>
	//*  20   40:iload_3         
	//*  21   41:icmpeq          56
		{
			a(((View) (a)), j, k);
	//   22   44:aload_0         
	//   23   45:getfield        #90  <Field TextView a>
	//   24   48:iload_2         
	//   25   49:iload_3         
	//   26   50:invokestatic    #100 <Method void a(View, int, int)>
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
	//    1    1:getfield        #90  <Field TextView a>
	//    2    4:fconst_0        
	//    3    5:invokevirtual   #105 <Method void TextView.setAlpha(float)>
		ViewPropertyAnimator viewpropertyanimator = a.animate().alpha(1.0F);
	//    4    8:aload_0         
	//    5    9:getfield        #90  <Field TextView a>
	//    6   12:invokevirtual   #109 <Method ViewPropertyAnimator TextView.animate()>
	//    7   15:fconst_1        
	//    8   16:invokevirtual   #115 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//    9   19:astore          7
		long l1 = j;
	//   10   21:iload_2         
	//   11   22:i2l             
	//   12   23:lstore_3        
		viewpropertyanimator = viewpropertyanimator.setDuration(l1);
	//   13   24:aload           7
	//   14   26:lload_3         
	//   15   27:invokevirtual   #119 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   16   30:astore          7
		long l2 = i;
	//   17   32:iload_1         
	//   18   33:i2l             
	//   19   34:lstore          5
		viewpropertyanimator.setStartDelay(l2).start();
	//   20   36:aload           7
	//   21   38:lload           5
	//   22   40:invokevirtual   #122 <Method ViewPropertyAnimator ViewPropertyAnimator.setStartDelay(long)>
	//   23   43:invokevirtual   #125 <Method void ViewPropertyAnimator.start()>
		if(b.getVisibility() == 0)
	//*  24   46:aload_0         
	//*  25   47:getfield        #127 <Field Button b>
	//*  26   50:invokevirtual   #132 <Method int Button.getVisibility()>
	//*  27   53:ifne            87
		{
			b.setAlpha(0.0F);
	//   28   56:aload_0         
	//   29   57:getfield        #127 <Field Button b>
	//   30   60:fconst_0        
	//   31   61:invokevirtual   #133 <Method void Button.setAlpha(float)>
			b.animate().alpha(1.0F).setDuration(l1).setStartDelay(l2).start();
	//   32   64:aload_0         
	//   33   65:getfield        #127 <Field Button b>
	//   34   68:invokevirtual   #134 <Method ViewPropertyAnimator Button.animate()>
	//   35   71:fconst_1        
	//   36   72:invokevirtual   #115 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   37   75:lload_3         
	//   38   76:invokevirtual   #119 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   39   79:lload           5
	//   40   81:invokevirtual   #122 <Method ViewPropertyAnimator ViewPropertyAnimator.setStartDelay(long)>
	//   41   84:invokevirtual   #125 <Method void ViewPropertyAnimator.start()>
		}
	//   42   87:return          
	}

	public void b(int i, int j)
	{
		a.setAlpha(1.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field TextView a>
	//    2    4:fconst_1        
	//    3    5:invokevirtual   #105 <Method void TextView.setAlpha(float)>
		ViewPropertyAnimator viewpropertyanimator = a.animate().alpha(0.0F);
	//    4    8:aload_0         
	//    5    9:getfield        #90  <Field TextView a>
	//    6   12:invokevirtual   #109 <Method ViewPropertyAnimator TextView.animate()>
	//    7   15:fconst_0        
	//    8   16:invokevirtual   #115 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//    9   19:astore          7
		long l1 = j;
	//   10   21:iload_2         
	//   11   22:i2l             
	//   12   23:lstore_3        
		viewpropertyanimator = viewpropertyanimator.setDuration(l1);
	//   13   24:aload           7
	//   14   26:lload_3         
	//   15   27:invokevirtual   #119 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   16   30:astore          7
		long l2 = i;
	//   17   32:iload_1         
	//   18   33:i2l             
	//   19   34:lstore          5
		viewpropertyanimator.setStartDelay(l2).start();
	//   20   36:aload           7
	//   21   38:lload           5
	//   22   40:invokevirtual   #122 <Method ViewPropertyAnimator ViewPropertyAnimator.setStartDelay(long)>
	//   23   43:invokevirtual   #125 <Method void ViewPropertyAnimator.start()>
		if(b.getVisibility() == 0)
	//*  24   46:aload_0         
	//*  25   47:getfield        #127 <Field Button b>
	//*  26   50:invokevirtual   #132 <Method int Button.getVisibility()>
	//*  27   53:ifne            87
		{
			b.setAlpha(1.0F);
	//   28   56:aload_0         
	//   29   57:getfield        #127 <Field Button b>
	//   30   60:fconst_1        
	//   31   61:invokevirtual   #133 <Method void Button.setAlpha(float)>
			b.animate().alpha(0.0F).setDuration(l1).setStartDelay(l2).start();
	//   32   64:aload_0         
	//   33   65:getfield        #127 <Field Button b>
	//   34   68:invokevirtual   #134 <Method ViewPropertyAnimator Button.animate()>
	//   35   71:fconst_0        
	//   36   72:invokevirtual   #115 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   37   75:lload_3         
	//   38   76:invokevirtual   #119 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   39   79:lload           5
	//   40   81:invokevirtual   #122 <Method ViewPropertyAnimator ViewPropertyAnimator.setStartDelay(long)>
	//   41   84:invokevirtual   #125 <Method void ViewPropertyAnimator.start()>
		}
	//   42   87:return          
	}

	public Button getActionView()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field Button b>
	//    2    4:areturn         
	}

	public TextView getMessageView()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field TextView a>
	//    2    4:areturn         
	}

	protected void onFinishInflate()
	{
		super.onFinishInflate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #141 <Method void LinearLayout.onFinishInflate()>
		a = (TextView)findViewById(g.snackbar_text);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getstatic       #146 <Field int g.snackbar_text>
	//    5    9:invokevirtual   #150 <Method View findViewById(int)>
	//    6   12:checkcast       #92  <Class TextView>
	//    7   15:putfield        #90  <Field TextView a>
		b = (Button)findViewById(g.snackbar_action);
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getstatic       #153 <Field int g.snackbar_action>
	//   11   23:invokevirtual   #150 <Method View findViewById(int)>
	//   12   26:checkcast       #129 <Class Button>
	//   13   29:putfield        #127 <Field Button b>
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
	//    3    3:invokespecial   #156 <Method void LinearLayout.onMeasure(int, int)>
			k = i;
	//    4    6:iload_1         
	//    5    7:istore_3        
			if(c > 0)
	//*   6    8:aload_0         
	//*   7    9:getfield        #40  <Field int c>
	//*   8   12:ifle            50
			{
				int i1 = getMeasuredWidth();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #159 <Method int getMeasuredWidth()>
	//   11   19:istore          4
				int j1 = c;
	//   12   21:aload_0         
	//   13   22:getfield        #40  <Field int c>
	//   14   25:istore          5
				k = i;
	//   15   27:iload_1         
	//   16   28:istore_3        
				if(i1 > j1)
	//*  17   29:iload           4
	//*  18   31:iload           5
	//*  19   33:icmple          50
				{
					k = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000);
	//   20   36:iload           5
	//   21   38:ldc1            #160 <Int 0x40000000>
	//   22   40:invokestatic    #165 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   23   43:istore_3        
					super.onMeasure(k, j);
	//   24   44:aload_0         
	//   25   45:iload_3         
	//   26   46:iload_2         
	//   27   47:invokespecial   #156 <Method void LinearLayout.onMeasure(int, int)>
				}
			}
			int k1 = getResources().getDimensionPixelSize(e.design_snackbar_padding_vertical_2lines);
	//   28   50:aload_0         
	//   29   51:invokevirtual   #169 <Method Resources getResources()>
	//   30   54:getstatic       #174 <Field int e.design_snackbar_padding_vertical_2lines>
	//   31   57:invokevirtual   #179 <Method int Resources.getDimensionPixelSize(int)>
	//   32   60:istore          5
			int l1 = getResources().getDimensionPixelSize(e.design_snackbar_padding_vertical);
	//   33   62:aload_0         
	//   34   63:invokevirtual   #169 <Method Resources getResources()>
	//   35   66:getstatic       #182 <Field int e.design_snackbar_padding_vertical>
	//   36   69:invokevirtual   #179 <Method int Resources.getDimensionPixelSize(int)>
	//   37   72:istore          6
			i = a.getLayout().getLineCount();
	//   38   74:aload_0         
	//   39   75:getfield        #90  <Field TextView a>
	//   40   78:invokevirtual   #186 <Method Layout TextView.getLayout()>
	//   41   81:invokevirtual   #191 <Method int Layout.getLineCount()>
	//   42   84:istore_1        
			boolean flag = true;
	//   43   85:iconst_1        
	//   44   86:istore          4
			if(i > 1)
	//*  45   88:iload_1         
	//*  46   89:iconst_1        
	//*  47   90:icmple          98
				i = 1;
	//   48   93:iconst_1        
	//   49   94:istore_1        
			else
	//*  50   95:goto            100
				i = 0;
	//   51   98:iconst_0        
	//   52   99:istore_1        
			if(i != 0 && d > 0 && b.getMeasuredWidth() > d)
	//*  53  100:iload_1         
	//*  54  101:ifeq            146
	//*  55  104:aload_0         
	//*  56  105:getfield        #45  <Field int d>
	//*  57  108:ifle            146
	//*  58  111:aload_0         
	//*  59  112:getfield        #127 <Field Button b>
	//*  60  115:invokevirtual   #192 <Method int Button.getMeasuredWidth()>
	//*  61  118:aload_0         
	//*  62  119:getfield        #45  <Field int d>
	//*  63  122:icmple          146
			{
				if(a(1, k1, k1 - l1))
	//*  64  125:aload_0         
	//*  65  126:iconst_1        
	//*  66  127:iload           5
	//*  67  129:iload           5
	//*  68  131:iload           6
	//*  69  133:isub            
	//*  70  134:invokespecial   #194 <Method boolean a(int, int, int)>
	//*  71  137:ifeq            175
				{
					i = ((int) (flag));
	//   72  140:iload           4
	//   73  142:istore_1        
					break label0;
	//   74  143:goto            177
				}
			} else
			{
				if(i != 0)
	//*  75  146:iload_1         
	//*  76  147:ifeq            156
					i = k1;
	//   77  150:iload           5
	//   78  152:istore_1        
				else
	//*  79  153:goto            159
					i = l1;
	//   80  156:iload           6
	//   81  158:istore_1        
				if(a(0, i, i))
	//*  82  159:aload_0         
	//*  83  160:iconst_0        
	//*  84  161:iload_1         
	//*  85  162:iload_1         
	//*  86  163:invokespecial   #194 <Method boolean a(int, int, int)>
	//*  87  166:ifeq            175
				{
					i = ((int) (flag));
	//   88  169:iload           4
	//   89  171:istore_1        
					break label0;
	//   90  172:goto            177
				}
			}
			i = 0;
	//   91  175:iconst_0        
	//   92  176:istore_1        
		}
		if(i != 0)
	//*  93  177:iload_1         
	//*  94  178:ifeq            187
			super.onMeasure(k, j);
	//   95  181:aload_0         
	//   96  182:iload_3         
	//   97  183:iload_2         
	//   98  184:invokespecial   #156 <Method void LinearLayout.onMeasure(int, int)>
	//   99  187:return          
	}

	private TextView a;
	private Button b;
	private int c;
	private int d;
}
