// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.design.snackbar.ContentViewCallback;
import android.support.v4.view.ViewCompat;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.*;

public class SnackbarContentLayout extends LinearLayout
	implements ContentViewCallback
{

	public SnackbarContentLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #22  <Method void SnackbarContentLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public SnackbarContentLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #24  <Method void LinearLayout(Context, AttributeSet)>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.SnackbarLayout)));
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:getstatic       #30  <Field int[] android.support.design.R$styleable.SnackbarLayout>
	//    7   11:invokevirtual   #36  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    8   14:astore_1        
		maxWidth = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.SnackbarLayout_android_maxWidth, -1);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:getstatic       #39  <Field int android.support.design.R$styleable.SnackbarLayout_android_maxWidth>
	//   12   20:iconst_m1       
	//   13   21:invokevirtual   #45  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   14   24:putfield        #47  <Field int maxWidth>
		maxInlineActionWidth = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.SnackbarLayout_maxActionInlineWidth, -1);
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:getstatic       #50  <Field int android.support.design.R$styleable.SnackbarLayout_maxActionInlineWidth>
	//   18   32:iconst_m1       
	//   19   33:invokevirtual   #45  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   20   36:putfield        #52  <Field int maxInlineActionWidth>
		((TypedArray) (context)).recycle();
	//   21   39:aload_1         
	//   22   40:invokevirtual   #56  <Method void TypedArray.recycle()>
	//   23   43:return          
	}

	private static void updateTopBottomPadding(View view, int i, int j)
	{
		if(ViewCompat.isPaddingRelative(view))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #64  <Method boolean ViewCompat.isPaddingRelative(View)>
	//*   2    4:ifeq            22
		{
			ViewCompat.setPaddingRelative(view, ViewCompat.getPaddingStart(view), i, ViewCompat.getPaddingEnd(view), j);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokestatic    #68  <Method int ViewCompat.getPaddingStart(View)>
	//    6   12:iload_1         
	//    7   13:aload_0         
	//    8   14:invokestatic    #71  <Method int ViewCompat.getPaddingEnd(View)>
	//    9   17:iload_2         
	//   10   18:invokestatic    #75  <Method void ViewCompat.setPaddingRelative(View, int, int, int, int)>
			return;
	//   11   21:return          
		} else
		{
			view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), j);
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #81  <Method int View.getPaddingLeft()>
	//   15   27:iload_1         
	//   16   28:aload_0         
	//   17   29:invokevirtual   #84  <Method int View.getPaddingRight()>
	//   18   32:iload_2         
	//   19   33:invokevirtual   #88  <Method void View.setPadding(int, int, int, int)>
			return;
	//   20   36:return          
		}
	}

	private boolean updateViewsWithinLayout(int i, int j, int k)
	{
		boolean flag;
		if(i != getOrientation())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #93  <Method int getOrientation()>
	//*   3    5:icmpeq          19
		{
			setOrientation(i);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokevirtual   #97  <Method void setOrientation(int)>
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
		if(messageView.getPaddingTop() != j || messageView.getPaddingBottom() != k)
	//*  12   22:aload_0         
	//*  13   23:getfield        #99  <Field TextView messageView>
	//*  14   26:invokevirtual   #104 <Method int TextView.getPaddingTop()>
	//*  15   29:iload_2         
	//*  16   30:icmpne          44
	//*  17   33:aload_0         
	//*  18   34:getfield        #99  <Field TextView messageView>
	//*  19   37:invokevirtual   #107 <Method int TextView.getPaddingBottom()>
	//*  20   40:iload_3         
	//*  21   41:icmpeq          56
		{
			updateTopBottomPadding(((View) (messageView)), j, k);
	//   22   44:aload_0         
	//   23   45:getfield        #99  <Field TextView messageView>
	//   24   48:iload_2         
	//   25   49:iload_3         
	//   26   50:invokestatic    #109 <Method void updateTopBottomPadding(View, int, int)>
			flag = true;
	//   27   53:iconst_1        
	//   28   54:istore          4
		}
		return flag;
	//   29   56:iload           4
	//   30   58:ireturn         
	}

	public void animateContentIn(int i, int j)
	{
		messageView.setAlpha(0.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field TextView messageView>
	//    2    4:fconst_0        
	//    3    5:invokevirtual   #115 <Method void TextView.setAlpha(float)>
		ViewPropertyAnimator viewpropertyanimator = messageView.animate().alpha(1.0F);
	//    4    8:aload_0         
	//    5    9:getfield        #99  <Field TextView messageView>
	//    6   12:invokevirtual   #119 <Method ViewPropertyAnimator TextView.animate()>
	//    7   15:fconst_1        
	//    8   16:invokevirtual   #125 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//    9   19:astore          7
		long l = j;
	//   10   21:iload_2         
	//   11   22:i2l             
	//   12   23:lstore_3        
		viewpropertyanimator = viewpropertyanimator.setDuration(l);
	//   13   24:aload           7
	//   14   26:lload_3         
	//   15   27:invokevirtual   #129 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   16   30:astore          7
		long l1 = i;
	//   17   32:iload_1         
	//   18   33:i2l             
	//   19   34:lstore          5
		viewpropertyanimator.setStartDelay(l1).start();
	//   20   36:aload           7
	//   21   38:lload           5
	//   22   40:invokevirtual   #132 <Method ViewPropertyAnimator ViewPropertyAnimator.setStartDelay(long)>
	//   23   43:invokevirtual   #135 <Method void ViewPropertyAnimator.start()>
		if(actionView.getVisibility() == 0)
	//*  24   46:aload_0         
	//*  25   47:getfield        #137 <Field Button actionView>
	//*  26   50:invokevirtual   #142 <Method int Button.getVisibility()>
	//*  27   53:ifne            87
		{
			actionView.setAlpha(0.0F);
	//   28   56:aload_0         
	//   29   57:getfield        #137 <Field Button actionView>
	//   30   60:fconst_0        
	//   31   61:invokevirtual   #143 <Method void Button.setAlpha(float)>
			actionView.animate().alpha(1.0F).setDuration(l).setStartDelay(l1).start();
	//   32   64:aload_0         
	//   33   65:getfield        #137 <Field Button actionView>
	//   34   68:invokevirtual   #144 <Method ViewPropertyAnimator Button.animate()>
	//   35   71:fconst_1        
	//   36   72:invokevirtual   #125 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   37   75:lload_3         
	//   38   76:invokevirtual   #129 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   39   79:lload           5
	//   40   81:invokevirtual   #132 <Method ViewPropertyAnimator ViewPropertyAnimator.setStartDelay(long)>
	//   41   84:invokevirtual   #135 <Method void ViewPropertyAnimator.start()>
		}
	//   42   87:return          
	}

	public void animateContentOut(int i, int j)
	{
		messageView.setAlpha(1.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field TextView messageView>
	//    2    4:fconst_1        
	//    3    5:invokevirtual   #115 <Method void TextView.setAlpha(float)>
		ViewPropertyAnimator viewpropertyanimator = messageView.animate().alpha(0.0F);
	//    4    8:aload_0         
	//    5    9:getfield        #99  <Field TextView messageView>
	//    6   12:invokevirtual   #119 <Method ViewPropertyAnimator TextView.animate()>
	//    7   15:fconst_0        
	//    8   16:invokevirtual   #125 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//    9   19:astore          7
		long l = j;
	//   10   21:iload_2         
	//   11   22:i2l             
	//   12   23:lstore_3        
		viewpropertyanimator = viewpropertyanimator.setDuration(l);
	//   13   24:aload           7
	//   14   26:lload_3         
	//   15   27:invokevirtual   #129 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   16   30:astore          7
		long l1 = i;
	//   17   32:iload_1         
	//   18   33:i2l             
	//   19   34:lstore          5
		viewpropertyanimator.setStartDelay(l1).start();
	//   20   36:aload           7
	//   21   38:lload           5
	//   22   40:invokevirtual   #132 <Method ViewPropertyAnimator ViewPropertyAnimator.setStartDelay(long)>
	//   23   43:invokevirtual   #135 <Method void ViewPropertyAnimator.start()>
		if(actionView.getVisibility() == 0)
	//*  24   46:aload_0         
	//*  25   47:getfield        #137 <Field Button actionView>
	//*  26   50:invokevirtual   #142 <Method int Button.getVisibility()>
	//*  27   53:ifne            87
		{
			actionView.setAlpha(1.0F);
	//   28   56:aload_0         
	//   29   57:getfield        #137 <Field Button actionView>
	//   30   60:fconst_1        
	//   31   61:invokevirtual   #143 <Method void Button.setAlpha(float)>
			actionView.animate().alpha(0.0F).setDuration(l).setStartDelay(l1).start();
	//   32   64:aload_0         
	//   33   65:getfield        #137 <Field Button actionView>
	//   34   68:invokevirtual   #144 <Method ViewPropertyAnimator Button.animate()>
	//   35   71:fconst_0        
	//   36   72:invokevirtual   #125 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   37   75:lload_3         
	//   38   76:invokevirtual   #129 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   39   79:lload           5
	//   40   81:invokevirtual   #132 <Method ViewPropertyAnimator ViewPropertyAnimator.setStartDelay(long)>
	//   41   84:invokevirtual   #135 <Method void ViewPropertyAnimator.start()>
		}
	//   42   87:return          
	}

	public Button getActionView()
	{
		return actionView;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field Button actionView>
	//    2    4:areturn         
	}

	public TextView getMessageView()
	{
		return messageView;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field TextView messageView>
	//    2    4:areturn         
	}

	protected void onFinishInflate()
	{
		super.onFinishInflate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #152 <Method void LinearLayout.onFinishInflate()>
		messageView = (TextView)findViewById(android.support.design.R.id.snackbar_text);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getstatic       #157 <Field int android.support.design.R$id.snackbar_text>
	//    5    9:invokevirtual   #161 <Method View findViewById(int)>
	//    6   12:checkcast       #101 <Class TextView>
	//    7   15:putfield        #99  <Field TextView messageView>
		actionView = (Button)findViewById(android.support.design.R.id.snackbar_action);
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getstatic       #164 <Field int android.support.design.R$id.snackbar_action>
	//   11   23:invokevirtual   #161 <Method View findViewById(int)>
	//   12   26:checkcast       #139 <Class Button>
	//   13   29:putfield        #137 <Field Button actionView>
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
	//    3    3:invokespecial   #167 <Method void LinearLayout.onMeasure(int, int)>
			k = i;
	//    4    6:iload_1         
	//    5    7:istore_3        
			if(maxWidth > 0)
	//*   6    8:aload_0         
	//*   7    9:getfield        #47  <Field int maxWidth>
	//*   8   12:ifle            50
			{
				int l = getMeasuredWidth();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #170 <Method int getMeasuredWidth()>
	//   11   19:istore          4
				int i1 = maxWidth;
	//   12   21:aload_0         
	//   13   22:getfield        #47  <Field int maxWidth>
	//   14   25:istore          5
				k = i;
	//   15   27:iload_1         
	//   16   28:istore_3        
				if(l > i1)
	//*  17   29:iload           4
	//*  18   31:iload           5
	//*  19   33:icmple          50
				{
					k = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
	//   20   36:iload           5
	//   21   38:ldc1            #171 <Int 0x40000000>
	//   22   40:invokestatic    #176 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   23   43:istore_3        
					super.onMeasure(k, j);
	//   24   44:aload_0         
	//   25   45:iload_3         
	//   26   46:iload_2         
	//   27   47:invokespecial   #167 <Method void LinearLayout.onMeasure(int, int)>
				}
			}
			int j1 = getResources().getDimensionPixelSize(android.support.design.R.dimen.design_snackbar_padding_vertical_2lines);
	//   28   50:aload_0         
	//   29   51:invokevirtual   #180 <Method Resources getResources()>
	//   30   54:getstatic       #185 <Field int android.support.design.R$dimen.design_snackbar_padding_vertical_2lines>
	//   31   57:invokevirtual   #190 <Method int Resources.getDimensionPixelSize(int)>
	//   32   60:istore          5
			int k1 = getResources().getDimensionPixelSize(android.support.design.R.dimen.design_snackbar_padding_vertical);
	//   33   62:aload_0         
	//   34   63:invokevirtual   #180 <Method Resources getResources()>
	//   35   66:getstatic       #193 <Field int android.support.design.R$dimen.design_snackbar_padding_vertical>
	//   36   69:invokevirtual   #190 <Method int Resources.getDimensionPixelSize(int)>
	//   37   72:istore          6
			i = messageView.getLayout().getLineCount();
	//   38   74:aload_0         
	//   39   75:getfield        #99  <Field TextView messageView>
	//   40   78:invokevirtual   #197 <Method Layout TextView.getLayout()>
	//   41   81:invokevirtual   #202 <Method int Layout.getLineCount()>
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
			if(i != 0 && maxInlineActionWidth > 0 && actionView.getMeasuredWidth() > maxInlineActionWidth)
	//*  53  100:iload_1         
	//*  54  101:ifeq            146
	//*  55  104:aload_0         
	//*  56  105:getfield        #52  <Field int maxInlineActionWidth>
	//*  57  108:ifle            146
	//*  58  111:aload_0         
	//*  59  112:getfield        #137 <Field Button actionView>
	//*  60  115:invokevirtual   #203 <Method int Button.getMeasuredWidth()>
	//*  61  118:aload_0         
	//*  62  119:getfield        #52  <Field int maxInlineActionWidth>
	//*  63  122:icmple          146
			{
				if(updateViewsWithinLayout(1, j1, j1 - k1))
	//*  64  125:aload_0         
	//*  65  126:iconst_1        
	//*  66  127:iload           5
	//*  67  129:iload           5
	//*  68  131:iload           6
	//*  69  133:isub            
	//*  70  134:invokespecial   #205 <Method boolean updateViewsWithinLayout(int, int, int)>
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
					i = j1;
	//   77  150:iload           5
	//   78  152:istore_1        
				else
	//*  79  153:goto            159
					i = k1;
	//   80  156:iload           6
	//   81  158:istore_1        
				if(updateViewsWithinLayout(0, i, i))
	//*  82  159:aload_0         
	//*  83  160:iconst_0        
	//*  84  161:iload_1         
	//*  85  162:iload_1         
	//*  86  163:invokespecial   #205 <Method boolean updateViewsWithinLayout(int, int, int)>
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
	//   98  184:invokespecial   #167 <Method void LinearLayout.onMeasure(int, int)>
	//   99  187:return          
	}

	private Button actionView;
	private int maxInlineActionWidth;
	private int maxWidth;
	private TextView messageView;
}
