// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.*;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;

public class ButtonBarLayout extends LinearLayout
{

	public ButtonBarLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #20  <Method void LinearLayout(Context, AttributeSet)>
		mLastWidthSize = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #22  <Field int mLastWidthSize>
		boolean flag;
		if(getResources().getConfiguration().screenHeightDp >= 320)
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #26  <Method Resources getResources()>
	//*   9   15:invokevirtual   #32  <Method Configuration Resources.getConfiguration()>
	//*  10   18:getfield        #37  <Field int Configuration.screenHeightDp>
	//*  11   21:sipush          320
	//*  12   24:icmplt          32
			flag = true;
	//   13   27:iconst_1        
	//   14   28:istore_3        
		else
	//*  15   29:goto            34
			flag = false;
	//   16   32:iconst_0        
	//   17   33:istore_3        
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ButtonBarLayout)));
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:getstatic       #43  <Field int[] android.support.v7.appcompat.R$styleable.ButtonBarLayout>
	//   21   39:invokevirtual   #49  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   22   42:astore_1        
		mAllowStacking = ((TypedArray) (context)).getBoolean(android.support.v7.appcompat.R.styleable.ButtonBarLayout_allowStacking, flag);
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:getstatic       #52  <Field int android.support.v7.appcompat.R$styleable.ButtonBarLayout_allowStacking>
	//   26   48:iload_3         
	//   27   49:invokevirtual   #58  <Method boolean TypedArray.getBoolean(int, boolean)>
	//   28   52:putfield        #60  <Field boolean mAllowStacking>
		((TypedArray) (context)).recycle();
	//   29   55:aload_1         
	//   30   56:invokevirtual   #64  <Method void TypedArray.recycle()>
	//   31   59:return          
	}

	private int getNextVisibleChildIndex(int i)
	{
		for(int j = getChildCount(); i < j; i++)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #71  <Method int getChildCount()>
	//*   2    4:istore_2        
	//*   3    5:iload_1         
	//*   4    6:iload_2         
	//*   5    7:icmpge          30
			if(getChildAt(i).getVisibility() == 0)
	//*   6   10:aload_0         
	//*   7   11:iload_1         
	//*   8   12:invokevirtual   #75  <Method View getChildAt(int)>
	//*   9   15:invokevirtual   #80  <Method int View.getVisibility()>
	//*  10   18:ifne            23
				return i;
	//   11   21:iload_1         
	//   12   22:ireturn         

	//   13   23:iload_1         
	//   14   24:iconst_1        
	//   15   25:iadd            
	//   16   26:istore_1        
	//*  17   27:goto            5
		return -1;
	//   18   30:iconst_m1       
	//   19   31:ireturn         
	}

	private boolean isStacked()
	{
		return getOrientation() == 1;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #85  <Method int getOrientation()>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	private void setStacked(boolean flag)
	{
		int i;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            9
			i = 1;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:goto            11
			i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		setOrientation(i);
	//    7   11:aload_0         
	//    8   12:iload_2         
	//    9   13:invokevirtual   #91  <Method void setOrientation(int)>
		if(flag)
	//*  10   16:iload_1         
	//*  11   17:ifeq            25
			i = 5;
	//   12   20:iconst_5        
	//   13   21:istore_2        
		else
	//*  14   22:goto            28
			i = 80;
	//   15   25:bipush          80
	//   16   27:istore_2        
		setGravity(i);
	//   17   28:aload_0         
	//   18   29:iload_2         
	//   19   30:invokevirtual   #94  <Method void setGravity(int)>
		View view = findViewById(android.support.v7.appcompat.R.id.spacer);
	//   20   33:aload_0         
	//   21   34:getstatic       #99  <Field int android.support.v7.appcompat.R$id.spacer>
	//   22   37:invokevirtual   #102 <Method View findViewById(int)>
	//   23   40:astore_3        
		if(view != null)
	//*  24   41:aload_3         
	//*  25   42:ifnull          62
		{
			byte byte0;
			if(flag)
	//*  26   45:iload_1         
	//*  27   46:ifeq            55
				byte0 = 8;
	//   28   49:bipush          8
	//   29   51:istore_2        
			else
	//*  30   52:goto            57
				byte0 = 4;
	//   31   55:iconst_4        
	//   32   56:istore_2        
			view.setVisibility(((int) (byte0)));
	//   33   57:aload_3         
	//   34   58:iload_2         
	//   35   59:invokevirtual   #105 <Method void View.setVisibility(int)>
		}
		for(int j = getChildCount() - 2; j >= 0; j--)
	//*  36   62:aload_0         
	//*  37   63:invokevirtual   #71  <Method int getChildCount()>
	//*  38   66:iconst_2        
	//*  39   67:isub            
	//*  40   68:istore_2        
	//*  41   69:iload_2         
	//*  42   70:iflt            89
			bringChildToFront(getChildAt(j));
	//   43   73:aload_0         
	//   44   74:aload_0         
	//   45   75:iload_2         
	//   46   76:invokevirtual   #75  <Method View getChildAt(int)>
	//   47   79:invokevirtual   #109 <Method void bringChildToFront(View)>

	//   48   82:iload_2         
	//   49   83:iconst_1        
	//   50   84:isub            
	//   51   85:istore_2        
	//*  52   86:goto            69
	//   53   89:return          
	}

	protected void onMeasure(int i, int j)
	{
		int l = android.view.View.MeasureSpec.getSize(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #116 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    2    4:istore          4
		if(mAllowStacking)
	//*   3    6:aload_0         
	//*   4    7:getfield        #60  <Field boolean mAllowStacking>
	//*   5   10:ifeq            40
		{
			if(l > mLastWidthSize && isStacked())
	//*   6   13:iload           4
	//*   7   15:aload_0         
	//*   8   16:getfield        #22  <Field int mLastWidthSize>
	//*   9   19:icmple          34
	//*  10   22:aload_0         
	//*  11   23:invokespecial   #118 <Method boolean isStacked()>
	//*  12   26:ifeq            34
				setStacked(false);
	//   13   29:aload_0         
	//   14   30:iconst_0        
	//   15   31:invokespecial   #120 <Method void setStacked(boolean)>
			mLastWidthSize = l;
	//   16   34:aload_0         
	//   17   35:iload           4
	//   18   37:putfield        #22  <Field int mLastWidthSize>
		}
		int k = 0;
	//   19   40:iconst_0        
	//   20   41:istore_3        
		if(!isStacked() && android.view.View.MeasureSpec.getMode(i) == 0x40000000)
	//*  21   42:aload_0         
	//*  22   43:invokespecial   #118 <Method boolean isStacked()>
	//*  23   46:ifne            72
	//*  24   49:iload_1         
	//*  25   50:invokestatic    #123 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  26   53:ldc1            #124 <Int 0x40000000>
	//*  27   55:icmpne          72
		{
			l = android.view.View.MeasureSpec.makeMeasureSpec(l, 0x80000000);
	//   28   58:iload           4
	//   29   60:ldc1            #125 <Int 0x80000000>
	//   30   62:invokestatic    #129 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   31   65:istore          4
			k = 1;
	//   32   67:iconst_1        
	//   33   68:istore_3        
		} else
	//*  34   69:goto            75
		{
			l = i;
	//   35   72:iload_1         
	//   36   73:istore          4
		}
		super.onMeasure(l, j);
	//   37   75:aload_0         
	//   38   76:iload           4
	//   39   78:iload_2         
	//   40   79:invokespecial   #131 <Method void LinearLayout.onMeasure(int, int)>
		boolean flag1 = ((boolean) (k));
	//   41   82:iload_3         
	//   42   83:istore          5
		if(mAllowStacking)
	//*  43   85:aload_0         
	//*  44   86:getfield        #60  <Field boolean mAllowStacking>
	//*  45   89:ifeq            139
		{
			flag1 = ((boolean) (k));
	//   46   92:iload_3         
	//   47   93:istore          5
			if(!isStacked())
	//*  48   95:aload_0         
	//*  49   96:invokespecial   #118 <Method boolean isStacked()>
	//*  50   99:ifne            139
			{
				boolean flag;
				if((getMeasuredWidthAndState() & 0xff000000) == 0x1000000)
	//*  51  102:aload_0         
	//*  52  103:invokevirtual   #134 <Method int getMeasuredWidthAndState()>
	//*  53  106:ldc1            #135 <Int 0xff000000>
	//*  54  108:iand            
	//*  55  109:ldc1            #136 <Int 0x1000000>
	//*  56  111:icmpne          120
					flag = true;
	//   57  114:iconst_1        
	//   58  115:istore          4
				else
	//*  59  117:goto            123
					flag = false;
	//   60  120:iconst_0        
	//   61  121:istore          4
				flag1 = ((boolean) (k));
	//   62  123:iload_3         
	//   63  124:istore          5
				if(flag)
	//*  64  126:iload           4
	//*  65  128:ifeq            139
				{
					setStacked(true);
	//   66  131:aload_0         
	//   67  132:iconst_1        
	//   68  133:invokespecial   #120 <Method void setStacked(boolean)>
					flag1 = true;
	//   69  136:iconst_1        
	//   70  137:istore          5
				}
			}
		}
		if(flag1)
	//*  71  139:iload           5
	//*  72  141:ifeq            150
			super.onMeasure(i, j);
	//   73  144:aload_0         
	//   74  145:iload_1         
	//   75  146:iload_2         
	//   76  147:invokespecial   #131 <Method void LinearLayout.onMeasure(int, int)>
		i = 0;
	//   77  150:iconst_0        
	//   78  151:istore_1        
		k = getNextVisibleChildIndex(0);
	//   79  152:aload_0         
	//   80  153:iconst_0        
	//   81  154:invokespecial   #138 <Method int getNextVisibleChildIndex(int)>
	//   82  157:istore_3        
		if(k >= 0)
	//*  83  158:iload_3         
	//*  84  159:iflt            263
		{
			View view = getChildAt(k);
	//   85  162:aload_0         
	//   86  163:iload_3         
	//   87  164:invokevirtual   #75  <Method View getChildAt(int)>
	//   88  167:astore          6
			android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
	//   89  169:aload           6
	//   90  171:invokevirtual   #142 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   91  174:checkcast       #144 <Class android.widget.LinearLayout$LayoutParams>
	//   92  177:astore          7
			j = getPaddingTop() + view.getMeasuredHeight() + layoutparams.topMargin + layoutparams.bottomMargin + 0;
	//   93  179:aload_0         
	//   94  180:invokevirtual   #147 <Method int getPaddingTop()>
	//   95  183:aload           6
	//   96  185:invokevirtual   #150 <Method int View.getMeasuredHeight()>
	//   97  188:iadd            
	//   98  189:aload           7
	//   99  191:getfield        #153 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
	//  100  194:iadd            
	//  101  195:aload           7
	//  102  197:getfield        #156 <Field int android.widget.LinearLayout$LayoutParams.bottomMargin>
	//  103  200:iadd            
	//  104  201:iconst_0        
	//  105  202:iadd            
	//  106  203:istore_2        
			if(isStacked())
	//* 107  204:aload_0         
	//* 108  205:invokespecial   #118 <Method boolean isStacked()>
	//* 109  208:ifeq            256
			{
				k = getNextVisibleChildIndex(k + 1);
	//  110  211:aload_0         
	//  111  212:iload_3         
	//  112  213:iconst_1        
	//  113  214:iadd            
	//  114  215:invokespecial   #138 <Method int getNextVisibleChildIndex(int)>
	//  115  218:istore_3        
				i = j;
	//  116  219:iload_2         
	//  117  220:istore_1        
				if(k >= 0)
	//* 118  221:iload_3         
	//* 119  222:iflt            253
					i = (int)((float)j + ((float)getChildAt(k).getPaddingTop() + getResources().getDisplayMetrics().density * 16F));
	//  120  225:iload_2         
	//  121  226:i2f             
	//  122  227:aload_0         
	//  123  228:iload_3         
	//  124  229:invokevirtual   #75  <Method View getChildAt(int)>
	//  125  232:invokevirtual   #157 <Method int View.getPaddingTop()>
	//  126  235:i2f             
	//  127  236:aload_0         
	//  128  237:invokevirtual   #26  <Method Resources getResources()>
	//  129  240:invokevirtual   #161 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//  130  243:getfield        #167 <Field float DisplayMetrics.density>
	//  131  246:ldc1            #168 <Float 16F>
	//  132  248:fmul            
	//  133  249:fadd            
	//  134  250:fadd            
	//  135  251:f2i             
	//  136  252:istore_1        
			} else
	//* 137  253:goto            263
			{
				i = j + getPaddingBottom();
	//  138  256:iload_2         
	//  139  257:aload_0         
	//  140  258:invokevirtual   #171 <Method int getPaddingBottom()>
	//  141  261:iadd            
	//  142  262:istore_1        
			}
		}
		if(ViewCompat.getMinimumHeight(((View) (this))) != i)
	//* 143  263:aload_0         
	//* 144  264:invokestatic    #177 <Method int ViewCompat.getMinimumHeight(View)>
	//* 145  267:iload_1         
	//* 146  268:icmpeq          276
			setMinimumHeight(i);
	//  147  271:aload_0         
	//  148  272:iload_1         
	//  149  273:invokevirtual   #180 <Method void setMinimumHeight(int)>
	//  150  276:return          
	}

	public void setAllowStacking(boolean flag)
	{
		if(mAllowStacking != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field boolean mAllowStacking>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          37
		{
			mAllowStacking = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #60  <Field boolean mAllowStacking>
			if(!mAllowStacking && getOrientation() == 1)
	//*   7   13:aload_0         
	//*   8   14:getfield        #60  <Field boolean mAllowStacking>
	//*   9   17:ifne            33
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #85  <Method int getOrientation()>
	//*  12   24:iconst_1        
	//*  13   25:icmpne          33
				setStacked(false);
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:invokespecial   #120 <Method void setStacked(boolean)>
			requestLayout();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #184 <Method void requestLayout()>
		}
	//   19   37:return          
	}

	private static final int ALLOW_STACKING_MIN_HEIGHT_DP = 320;
	private static final int PEEK_BUTTON_DP = 16;
	private boolean mAllowStacking;
	private int mLastWidthSize;
}
