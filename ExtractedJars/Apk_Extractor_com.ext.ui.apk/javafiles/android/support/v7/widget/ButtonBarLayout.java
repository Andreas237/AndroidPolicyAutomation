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
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		super(context, attributeset);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:invokespecial   #21  <Method void LinearLayout(Context, AttributeSet)>
		mLastWidthSize = -1;
	//    6    8:aload_0         
	//    7    9:iconst_m1       
	//    8   10:putfield        #23  <Field int mLastWidthSize>
		mMinimumHeight = 0;
	//    9   13:aload_0         
	//   10   14:iconst_0        
	//   11   15:putfield        #25  <Field int mMinimumHeight>
		if(getResources().getConfiguration().screenHeightDp >= 320)
	//*  12   18:aload_0         
	//*  13   19:invokevirtual   #29  <Method Resources getResources()>
	//*  14   22:invokevirtual   #35  <Method Configuration Resources.getConfiguration()>
	//*  15   25:getfield        #40  <Field int Configuration.screenHeightDp>
	//*  16   28:sipush          320
	//*  17   31:icmplt          36
			flag = true;
	//   18   34:iconst_1        
	//   19   35:istore_3        
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ButtonBarLayout)));
	//   20   36:aload_1         
	//   21   37:aload_2         
	//   22   38:getstatic       #46  <Field int[] android.support.v7.appcompat.R$styleable.ButtonBarLayout>
	//   23   41:invokevirtual   #52  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   24   44:astore_1        
		mAllowStacking = ((TypedArray) (context)).getBoolean(android.support.v7.appcompat.R.styleable.ButtonBarLayout_allowStacking, flag);
	//   25   45:aload_0         
	//   26   46:aload_1         
	//   27   47:getstatic       #55  <Field int android.support.v7.appcompat.R$styleable.ButtonBarLayout_allowStacking>
	//   28   50:iload_3         
	//   29   51:invokevirtual   #61  <Method boolean TypedArray.getBoolean(int, boolean)>
	//   30   54:putfield        #63  <Field boolean mAllowStacking>
		((TypedArray) (context)).recycle();
	//   31   57:aload_1         
	//   32   58:invokevirtual   #67  <Method void TypedArray.recycle()>
	//   33   61:return          
	}

	private int getNextVisibleChildIndex(int i)
	{
		for(int j = getChildCount(); i < j; i++)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #74  <Method int getChildCount()>
	//*   2    4:istore_2        
	//*   3    5:iload_1         
	//*   4    6:iload_2         
	//*   5    7:icmpge          30
			if(getChildAt(i).getVisibility() == 0)
	//*   6   10:aload_0         
	//*   7   11:iload_1         
	//*   8   12:invokevirtual   #78  <Method View getChildAt(int)>
	//*   9   15:invokevirtual   #83  <Method int View.getVisibility()>
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
	//    1    1:invokevirtual   #88  <Method int getOrientation()>
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
		View view;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            73
			i = 1;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:aload_0         
	//*   5    7:iload_2         
	//*   6    8:invokevirtual   #94  <Method void setOrientation(int)>
	//*   7   11:iload_1         
	//*   8   12:ifeq            78
	//*   9   15:iconst_5        
	//*  10   16:istore_2        
	//*  11   17:aload_0         
	//*  12   18:iload_2         
	//*  13   19:invokevirtual   #97  <Method void setGravity(int)>
	//*  14   22:aload_0         
	//*  15   23:getstatic       #102 <Field int android.support.v7.appcompat.R$id.spacer>
	//*  16   26:invokevirtual   #105 <Method View findViewById(int)>
	//*  17   29:astore_3        
	//*  18   30:aload_3         
	//*  19   31:ifnull          46
	//*  20   34:iload_1         
	//*  21   35:ifeq            84
	//*  22   38:bipush          8
	//*  23   40:istore_2        
	//*  24   41:aload_3         
	//*  25   42:iload_2         
	//*  26   43:invokevirtual   #108 <Method void View.setVisibility(int)>
	//*  27   46:aload_0         
	//*  28   47:invokevirtual   #74  <Method int getChildCount()>
	//*  29   50:iconst_2        
	//*  30   51:isub            
	//*  31   52:istore_2        
	//*  32   53:iload_2         
	//*  33   54:iflt            89
	//*  34   57:aload_0         
	//*  35   58:aload_0         
	//*  36   59:iload_2         
	//*  37   60:invokevirtual   #78  <Method View getChildAt(int)>
	//*  38   63:invokevirtual   #112 <Method void bringChildToFront(View)>
	//*  39   66:iload_2         
	//*  40   67:iconst_1        
	//*  41   68:isub            
	//*  42   69:istore_2        
	//*  43   70:goto            53
			i = 0;
	//   44   73:iconst_0        
	//   45   74:istore_2        
		setOrientation(i);
		if(flag)
			i = 5;
		else
	//*  46   75:goto            6
			i = 80;
	//   47   78:bipush          80
	//   48   80:istore_2        
		setGravity(i);
		view = findViewById(android.support.v7.appcompat.R.id.spacer);
		if(view != null)
		{
			if(flag)
				i = 8;
			else
	//*  49   81:goto            17
				i = 4;
	//   50   84:iconst_4        
	//   51   85:istore_2        
			view.setVisibility(i);
		}
		for(i = getChildCount() - 2; i >= 0; i--)
			bringChildToFront(getChildAt(i));

	//*  52   86:goto            41
	//   53   89:return          
	}

	public int getMinimumHeight()
	{
		return Math.max(mMinimumHeight, super.getMinimumHeight());
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int mMinimumHeight>
	//    2    4:aload_0         
	//    3    5:invokespecial   #115 <Method int LinearLayout.getMinimumHeight()>
	//    4    8:invokestatic    #121 <Method int Math.max(int, int)>
	//    5   11:ireturn         
	}

	protected void onMeasure(int i, int j)
	{
		int k = android.view.View.MeasureSpec.getSize(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #128 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    2    4:istore_3        
		if(mAllowStacking)
	//*   3    5:aload_0         
	//*   4    6:getfield        #63  <Field boolean mAllowStacking>
	//*   5    9:ifeq            37
		{
			if(k > mLastWidthSize && isStacked())
	//*   6   12:iload_3         
	//*   7   13:aload_0         
	//*   8   14:getfield        #23  <Field int mLastWidthSize>
	//*   9   17:icmple          32
	//*  10   20:aload_0         
	//*  11   21:invokespecial   #130 <Method boolean isStacked()>
	//*  12   24:ifeq            32
				setStacked(false);
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:invokespecial   #132 <Method void setStacked(boolean)>
			mLastWidthSize = k;
	//   16   32:aload_0         
	//   17   33:iload_3         
	//   18   34:putfield        #23  <Field int mLastWidthSize>
		}
		int l;
		boolean flag;
		if(!isStacked() && android.view.View.MeasureSpec.getMode(i) == 0x40000000)
	//*  19   37:aload_0         
	//*  20   38:invokespecial   #130 <Method boolean isStacked()>
	//*  21   41:ifne            253
	//*  22   44:iload_1         
	//*  23   45:invokestatic    #135 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  24   48:ldc1            #136 <Int 0x40000000>
	//*  25   50:icmpne          253
		{
			l = android.view.View.MeasureSpec.makeMeasureSpec(k, 0x80000000);
	//   26   53:iload_3         
	//   27   54:ldc1            #137 <Int 0x80000000>
	//   28   56:invokestatic    #140 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   29   59:istore          4
			k = 1;
	//   30   61:iconst_1        
	//   31   62:istore_3        
		} else
	//*  32   63:aload_0         
	//*  33   64:iload           4
	//*  34   66:iload_2         
	//*  35   67:invokespecial   #142 <Method void LinearLayout.onMeasure(int, int)>
	//*  36   70:iload_3         
	//*  37   71:istore          5
	//*  38   73:aload_0         
	//*  39   74:getfield        #63  <Field boolean mAllowStacking>
	//*  40   77:ifeq            121
	//*  41   80:iload_3         
	//*  42   81:istore          5
	//*  43   83:aload_0         
	//*  44   84:invokespecial   #130 <Method boolean isStacked()>
	//*  45   87:ifne            121
	//*  46   90:aload_0         
	//*  47   91:invokevirtual   #145 <Method int getMeasuredWidthAndState()>
	//*  48   94:ldc1            #146 <Int 0xff000000>
	//*  49   96:iand            
	//*  50   97:ldc1            #147 <Int 0x1000000>
	//*  51   99:icmpne          261
	//*  52  102:iconst_1        
	//*  53  103:istore          4
	//*  54  105:iload_3         
	//*  55  106:istore          5
	//*  56  108:iload           4
	//*  57  110:ifeq            121
	//*  58  113:aload_0         
	//*  59  114:iconst_1        
	//*  60  115:invokespecial   #132 <Method void setStacked(boolean)>
	//*  61  118:iconst_1        
	//*  62  119:istore          5
	//*  63  121:iload           5
	//*  64  123:ifeq            132
	//*  65  126:aload_0         
	//*  66  127:iload_1         
	//*  67  128:iload_2         
	//*  68  129:invokespecial   #142 <Method void LinearLayout.onMeasure(int, int)>
	//*  69  132:aload_0         
	//*  70  133:iconst_0        
	//*  71  134:invokespecial   #149 <Method int getNextVisibleChildIndex(int)>
	//*  72  137:istore_1        
	//*  73  138:iload_1         
	//*  74  139:iflt            277
	//*  75  142:aload_0         
	//*  76  143:iload_1         
	//*  77  144:invokevirtual   #78  <Method View getChildAt(int)>
	//*  78  147:astore          6
	//*  79  149:aload           6
	//*  80  151:invokevirtual   #153 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  81  154:checkcast       #155 <Class android.widget.LinearLayout$LayoutParams>
	//*  82  157:astore          7
	//*  83  159:aload_0         
	//*  84  160:invokevirtual   #158 <Method int getPaddingTop()>
	//*  85  163:istore_2        
	//*  86  164:aload           6
	//*  87  166:invokevirtual   #161 <Method int View.getMeasuredHeight()>
	//*  88  169:istore_3        
	//*  89  170:aload           7
	//*  90  172:getfield        #164 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
	//*  91  175:istore          4
	//*  92  177:aload           7
	//*  93  179:getfield        #167 <Field int android.widget.LinearLayout$LayoutParams.bottomMargin>
	//*  94  182:iload_3         
	//*  95  183:iload_2         
	//*  96  184:iadd            
	//*  97  185:iload           4
	//*  98  187:iadd            
	//*  99  188:iadd            
	//* 100  189:iconst_0        
	//* 101  190:iadd            
	//* 102  191:istore_2        
	//* 103  192:aload_0         
	//* 104  193:invokespecial   #130 <Method boolean isStacked()>
	//* 105  196:ifeq            267
	//* 106  199:aload_0         
	//* 107  200:iload_1         
	//* 108  201:iconst_1        
	//* 109  202:iadd            
	//* 110  203:invokespecial   #149 <Method int getNextVisibleChildIndex(int)>
	//* 111  206:istore_3        
	//* 112  207:iload_2         
	//* 113  208:istore_1        
	//* 114  209:iload_3         
	//* 115  210:iflt            239
	//* 116  213:iload_2         
	//* 117  214:aload_0         
	//* 118  215:iload_3         
	//* 119  216:invokevirtual   #78  <Method View getChildAt(int)>
	//* 120  219:invokevirtual   #168 <Method int View.getPaddingTop()>
	//* 121  222:ldc1            #169 <Float 16F>
	//* 122  224:aload_0         
	//* 123  225:invokevirtual   #29  <Method Resources getResources()>
	//* 124  228:invokevirtual   #173 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//* 125  231:getfield        #179 <Field float DisplayMetrics.density>
	//* 126  234:fmul            
	//* 127  235:f2i             
	//* 128  236:iadd            
	//* 129  237:iadd            
	//* 130  238:istore_1        
	//* 131  239:aload_0         
	//* 132  240:invokestatic    #184 <Method int ViewCompat.getMinimumHeight(View)>
	//* 133  243:iload_1         
	//* 134  244:icmpeq          252
	//* 135  247:aload_0         
	//* 136  248:iload_1         
	//* 137  249:invokevirtual   #187 <Method void setMinimumHeight(int)>
	//* 138  252:return          
		{
			l = i;
	//  139  253:iload_1         
	//  140  254:istore          4
			k = 0;
	//  141  256:iconst_0        
	//  142  257:istore_3        
		}
		super.onMeasure(l, j);
		flag = ((boolean) (k));
		if(mAllowStacking)
		{
			flag = ((boolean) (k));
			if(!isStacked())
			{
				View view;
				android.widget.LinearLayout.LayoutParams layoutparams;
				if((getMeasuredWidthAndState() & 0xff000000) == 0x1000000)
					l = 1;
				else
	//* 143  258:goto            63
					l = 0;
	//  144  261:iconst_0        
	//  145  262:istore          4
				flag = ((boolean) (k));
				if(l != 0)
				{
					setStacked(true);
					flag = true;
				}
			}
		}
		if(flag)
			super.onMeasure(i, j);
		i = getNextVisibleChildIndex(0);
		if(i >= 0)
		{
			view = getChildAt(i);
			layoutparams = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
			j = getPaddingTop();
			k = view.getMeasuredHeight();
			l = layoutparams.topMargin;
			j = layoutparams.bottomMargin + (k + j + l) + 0;
			if(isStacked())
			{
				k = getNextVisibleChildIndex(i + 1);
				i = j;
				if(k >= 0)
					i = j + (getChildAt(k).getPaddingTop() + (int)(16F * getResources().getDisplayMetrics().density));
			} else
	//* 146  264:goto            105
			{
				i = j + getPaddingBottom();
	//  147  267:iload_2         
	//  148  268:aload_0         
	//  149  269:invokevirtual   #190 <Method int getPaddingBottom()>
	//  150  272:iadd            
	//  151  273:istore_1        
			}
		} else
	//* 152  274:goto            239
		{
			i = 0;
	//  153  277:iconst_0        
	//  154  278:istore_1        
		}
		if(ViewCompat.getMinimumHeight(((View) (this))) != i)
			setMinimumHeight(i);
	//* 155  279:goto            239
	}

	public void setAllowStacking(boolean flag)
	{
		if(mAllowStacking != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field boolean mAllowStacking>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          37
		{
			mAllowStacking = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #63  <Field boolean mAllowStacking>
			if(!mAllowStacking && getOrientation() == 1)
	//*   7   13:aload_0         
	//*   8   14:getfield        #63  <Field boolean mAllowStacking>
	//*   9   17:ifne            33
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #88  <Method int getOrientation()>
	//*  12   24:iconst_1        
	//*  13   25:icmpne          33
				setStacked(false);
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:invokespecial   #132 <Method void setStacked(boolean)>
			requestLayout();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #194 <Method void requestLayout()>
		}
	//   19   37:return          
	}

	private static final int ALLOW_STACKING_MIN_HEIGHT_DP = 320;
	private static final int PEEK_BUTTON_DP = 16;
	private boolean mAllowStacking;
	private int mLastWidthSize;
	private int mMinimumHeight;
}
