// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.view.ViewCompat;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.*;

public class SnackbarContentLayout extends LinearLayout
	implements android.support.design.widget.BaseTransientBottomBar.ContentViewCallback
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
		mMaxWidth = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.SnackbarLayout_android_maxWidth, -1);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:getstatic       #39  <Field int android.support.design.R$styleable.SnackbarLayout_android_maxWidth>
	//   12   20:iconst_m1       
	//   13   21:invokevirtual   #45  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   14   24:putfield        #47  <Field int mMaxWidth>
		mMaxInlineActionWidth = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.SnackbarLayout_maxActionInlineWidth, -1);
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:getstatic       #50  <Field int android.support.design.R$styleable.SnackbarLayout_maxActionInlineWidth>
	//   18   32:iconst_m1       
	//   19   33:invokevirtual   #45  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   20   36:putfield        #52  <Field int mMaxInlineActionWidth>
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
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(i != getOrientation())
	//*   2    3:iload_1         
	//*   3    4:aload_0         
	//*   4    5:invokevirtual   #93  <Method int getOrientation()>
	//*   5    8:icmpeq          19
		{
			setOrientation(i);
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:invokevirtual   #97  <Method void setOrientation(int)>
			flag = true;
	//    9   16:iconst_1        
	//   10   17:istore          4
		}
		if(mMessageView.getPaddingTop() != j || mMessageView.getPaddingBottom() != k)
	//*  11   19:aload_0         
	//*  12   20:getfield        #99  <Field TextView mMessageView>
	//*  13   23:invokevirtual   #104 <Method int TextView.getPaddingTop()>
	//*  14   26:iload_2         
	//*  15   27:icmpne          41
	//*  16   30:aload_0         
	//*  17   31:getfield        #99  <Field TextView mMessageView>
	//*  18   34:invokevirtual   #107 <Method int TextView.getPaddingBottom()>
	//*  19   37:iload_3         
	//*  20   38:icmpeq          53
		{
			updateTopBottomPadding(((View) (mMessageView)), j, k);
	//   21   41:aload_0         
	//   22   42:getfield        #99  <Field TextView mMessageView>
	//   23   45:iload_2         
	//   24   46:iload_3         
	//   25   47:invokestatic    #109 <Method void updateTopBottomPadding(View, int, int)>
			flag = true;
	//   26   50:iconst_1        
	//   27   51:istore          4
		}
		return flag;
	//   28   53:iload           4
	//   29   55:ireturn         
	}

	public void animateContentIn(int i, int j)
	{
		mMessageView.setAlpha(0.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field TextView mMessageView>
	//    2    4:fconst_0        
	//    3    5:invokevirtual   #115 <Method void TextView.setAlpha(float)>
		mMessageView.animate().alpha(1.0F).setDuration(j).setStartDelay(i).start();
	//    4    8:aload_0         
	//    5    9:getfield        #99  <Field TextView mMessageView>
	//    6   12:invokevirtual   #119 <Method ViewPropertyAnimator TextView.animate()>
	//    7   15:fconst_1        
	//    8   16:invokevirtual   #125 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//    9   19:iload_2         
	//   10   20:i2l             
	//   11   21:invokevirtual   #129 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   12   24:iload_1         
	//   13   25:i2l             
	//   14   26:invokevirtual   #132 <Method ViewPropertyAnimator ViewPropertyAnimator.setStartDelay(long)>
	//   15   29:invokevirtual   #135 <Method void ViewPropertyAnimator.start()>
		if(mActionView.getVisibility() == 0)
	//*  16   32:aload_0         
	//*  17   33:getfield        #137 <Field Button mActionView>
	//*  18   36:invokevirtual   #142 <Method int Button.getVisibility()>
	//*  19   39:ifne            74
		{
			mActionView.setAlpha(0.0F);
	//   20   42:aload_0         
	//   21   43:getfield        #137 <Field Button mActionView>
	//   22   46:fconst_0        
	//   23   47:invokevirtual   #143 <Method void Button.setAlpha(float)>
			mActionView.animate().alpha(1.0F).setDuration(j).setStartDelay(i).start();
	//   24   50:aload_0         
	//   25   51:getfield        #137 <Field Button mActionView>
	//   26   54:invokevirtual   #144 <Method ViewPropertyAnimator Button.animate()>
	//   27   57:fconst_1        
	//   28   58:invokevirtual   #125 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   29   61:iload_2         
	//   30   62:i2l             
	//   31   63:invokevirtual   #129 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   32   66:iload_1         
	//   33   67:i2l             
	//   34   68:invokevirtual   #132 <Method ViewPropertyAnimator ViewPropertyAnimator.setStartDelay(long)>
	//   35   71:invokevirtual   #135 <Method void ViewPropertyAnimator.start()>
		}
	//   36   74:return          
	}

	public void animateContentOut(int i, int j)
	{
		mMessageView.setAlpha(1.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field TextView mMessageView>
	//    2    4:fconst_1        
	//    3    5:invokevirtual   #115 <Method void TextView.setAlpha(float)>
		mMessageView.animate().alpha(0.0F).setDuration(j).setStartDelay(i).start();
	//    4    8:aload_0         
	//    5    9:getfield        #99  <Field TextView mMessageView>
	//    6   12:invokevirtual   #119 <Method ViewPropertyAnimator TextView.animate()>
	//    7   15:fconst_0        
	//    8   16:invokevirtual   #125 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//    9   19:iload_2         
	//   10   20:i2l             
	//   11   21:invokevirtual   #129 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   12   24:iload_1         
	//   13   25:i2l             
	//   14   26:invokevirtual   #132 <Method ViewPropertyAnimator ViewPropertyAnimator.setStartDelay(long)>
	//   15   29:invokevirtual   #135 <Method void ViewPropertyAnimator.start()>
		if(mActionView.getVisibility() == 0)
	//*  16   32:aload_0         
	//*  17   33:getfield        #137 <Field Button mActionView>
	//*  18   36:invokevirtual   #142 <Method int Button.getVisibility()>
	//*  19   39:ifne            74
		{
			mActionView.setAlpha(1.0F);
	//   20   42:aload_0         
	//   21   43:getfield        #137 <Field Button mActionView>
	//   22   46:fconst_1        
	//   23   47:invokevirtual   #143 <Method void Button.setAlpha(float)>
			mActionView.animate().alpha(0.0F).setDuration(j).setStartDelay(i).start();
	//   24   50:aload_0         
	//   25   51:getfield        #137 <Field Button mActionView>
	//   26   54:invokevirtual   #144 <Method ViewPropertyAnimator Button.animate()>
	//   27   57:fconst_0        
	//   28   58:invokevirtual   #125 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   29   61:iload_2         
	//   30   62:i2l             
	//   31   63:invokevirtual   #129 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   32   66:iload_1         
	//   33   67:i2l             
	//   34   68:invokevirtual   #132 <Method ViewPropertyAnimator ViewPropertyAnimator.setStartDelay(long)>
	//   35   71:invokevirtual   #135 <Method void ViewPropertyAnimator.start()>
		}
	//   36   74:return          
	}

	public Button getActionView()
	{
		return mActionView;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field Button mActionView>
	//    2    4:areturn         
	}

	public TextView getMessageView()
	{
		return mMessageView;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field TextView mMessageView>
	//    2    4:areturn         
	}

	protected void onFinishInflate()
	{
		super.onFinishInflate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #152 <Method void LinearLayout.onFinishInflate()>
		mMessageView = (TextView)findViewById(android.support.design.R.id.snackbar_text);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getstatic       #157 <Field int android.support.design.R$id.snackbar_text>
	//    5    9:invokevirtual   #161 <Method View findViewById(int)>
	//    6   12:checkcast       #101 <Class TextView>
	//    7   15:putfield        #99  <Field TextView mMessageView>
		mActionView = (Button)findViewById(android.support.design.R.id.snackbar_action);
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getstatic       #164 <Field int android.support.design.R$id.snackbar_action>
	//   11   23:invokevirtual   #161 <Method View findViewById(int)>
	//   12   26:checkcast       #139 <Class Button>
	//   13   29:putfield        #137 <Field Button mActionView>
	//   14   32:return          
	}

	protected void onMeasure(int i, int j)
	{
		int l;
		int i1;
		boolean flag;
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #167 <Method void LinearLayout.onMeasure(int, int)>
		int k = i;
	//    4    6:iload_1         
	//    5    7:istore_3        
		if(mMaxWidth > 0)
	//*   6    8:aload_0         
	//*   7    9:getfield        #47  <Field int mMaxWidth>
	//*   8   12:ifle            44
		{
			k = i;
	//    9   15:iload_1         
	//   10   16:istore_3        
			if(getMeasuredWidth() > mMaxWidth)
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #170 <Method int getMeasuredWidth()>
	//*  13   21:aload_0         
	//*  14   22:getfield        #47  <Field int mMaxWidth>
	//*  15   25:icmple          44
			{
				k = android.view.View.MeasureSpec.makeMeasureSpec(mMaxWidth, 0x40000000);
	//   16   28:aload_0         
	//   17   29:getfield        #47  <Field int mMaxWidth>
	//   18   32:ldc1            #171 <Int 0x40000000>
	//   19   34:invokestatic    #176 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   20   37:istore_3        
				super.onMeasure(k, j);
	//   21   38:aload_0         
	//   22   39:iload_3         
	//   23   40:iload_2         
	//   24   41:invokespecial   #167 <Method void LinearLayout.onMeasure(int, int)>
			}
		}
		l = getResources().getDimensionPixelSize(android.support.design.R.dimen.design_snackbar_padding_vertical_2lines);
	//   25   44:aload_0         
	//   26   45:invokevirtual   #180 <Method Resources getResources()>
	//   27   48:getstatic       #185 <Field int android.support.design.R$dimen.design_snackbar_padding_vertical_2lines>
	//   28   51:invokevirtual   #190 <Method int Resources.getDimensionPixelSize(int)>
	//   29   54:istore          4
		i1 = getResources().getDimensionPixelSize(android.support.design.R.dimen.design_snackbar_padding_vertical);
	//   30   56:aload_0         
	//   31   57:invokevirtual   #180 <Method Resources getResources()>
	//   32   60:getstatic       #193 <Field int android.support.design.R$dimen.design_snackbar_padding_vertical>
	//   33   63:invokevirtual   #190 <Method int Resources.getDimensionPixelSize(int)>
	//   34   66:istore          5
		if(mMessageView.getLayout().getLineCount() > 1)
	//*  35   68:aload_0         
	//*  36   69:getfield        #99  <Field TextView mMessageView>
	//*  37   72:invokevirtual   #197 <Method Layout TextView.getLayout()>
	//*  38   75:invokevirtual   #202 <Method int Layout.getLineCount()>
	//*  39   78:iconst_1        
	//*  40   79:icmple          143
			i = 1;
	//   41   82:iconst_1        
	//   42   83:istore_1        
		else
	//*  43   84:iconst_0        
	//*  44   85:istore          6
	//*  45   87:iload_1         
	//*  46   88:ifeq            148
	//*  47   91:aload_0         
	//*  48   92:getfield        #52  <Field int mMaxInlineActionWidth>
	//*  49   95:ifle            148
	//*  50   98:aload_0         
	//*  51   99:getfield        #137 <Field Button mActionView>
	//*  52  102:invokevirtual   #203 <Method int Button.getMeasuredWidth()>
	//*  53  105:aload_0         
	//*  54  106:getfield        #52  <Field int mMaxInlineActionWidth>
	//*  55  109:icmple          148
	//*  56  112:iload           6
	//*  57  114:istore_1        
	//*  58  115:aload_0         
	//*  59  116:iconst_1        
	//*  60  117:iload           4
	//*  61  119:iload           4
	//*  62  121:iload           5
	//*  63  123:isub            
	//*  64  124:invokespecial   #205 <Method boolean updateViewsWithinLayout(int, int, int)>
	//*  65  127:ifeq            132
	//*  66  130:iconst_1        
	//*  67  131:istore_1        
	//*  68  132:iload_1         
	//*  69  133:ifeq            142
	//*  70  136:aload_0         
	//*  71  137:iload_3         
	//*  72  138:iload_2         
	//*  73  139:invokespecial   #167 <Method void LinearLayout.onMeasure(int, int)>
	//*  74  142:return          
			i = 0;
	//   75  143:iconst_0        
	//   76  144:istore_1        
		flag = false;
		if(i == 0 || mMaxInlineActionWidth <= 0 || mActionView.getMeasuredWidth() <= mMaxInlineActionWidth) goto _L2; else goto _L1
_L1:
		i = ((int) (flag));
		if(updateViewsWithinLayout(1, l, l - i1))
			i = 1;
_L4:
		if(i != 0)
			super.onMeasure(k, j);
		return;
	//*  77  145:goto            84
_L2:
		if(i == 0)
	//*  78  148:iload_1         
	//*  79  149:ifeq            172
	//*  80  152:iload           6
	//*  81  154:istore_1        
	//*  82  155:aload_0         
	//*  83  156:iconst_0        
	//*  84  157:iload           4
	//*  85  159:iload           4
	//*  86  161:invokespecial   #205 <Method boolean updateViewsWithinLayout(int, int, int)>
	//*  87  164:ifeq            132
	//*  88  167:iconst_1        
	//*  89  168:istore_1        
	//*  90  169:goto            132
			l = i1;
	//   91  172:iload           5
	//   92  174:istore          4
		i = ((int) (flag));
		if(updateViewsWithinLayout(0, l, l))
			i = 1;
		if(true) goto _L4; else goto _L3
_L3:
	//*  93  176:goto            152
	}

	private Button mActionView;
	private int mMaxInlineActionWidth;
	private int mMaxWidth;
	private TextView mMessageView;
}
