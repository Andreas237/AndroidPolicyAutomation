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
		int l = android.view.View.MeasureSpec.getSize(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #128 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    2    4:istore          4
		if(mAllowStacking)
	//*   3    6:aload_0         
	//*   4    7:getfield        #63  <Field boolean mAllowStacking>
	//*   5   10:ifeq            40
		{
			if(l > mLastWidthSize && isStacked())
	//*   6   13:iload           4
	//*   7   15:aload_0         
	//*   8   16:getfield        #23  <Field int mLastWidthSize>
	//*   9   19:icmple          34
	//*  10   22:aload_0         
	//*  11   23:invokespecial   #130 <Method boolean isStacked()>
	//*  12   26:ifeq            34
				setStacked(false);
	//   13   29:aload_0         
	//   14   30:iconst_0        
	//   15   31:invokespecial   #132 <Method void setStacked(boolean)>
			mLastWidthSize = l;
	//   16   34:aload_0         
	//   17   35:iload           4
	//   18   37:putfield        #23  <Field int mLastWidthSize>
		}
		int k = 0;
	//   19   40:iconst_0        
	//   20   41:istore_3        
		boolean flag;
		if(!isStacked() && android.view.View.MeasureSpec.getMode(i) == 0x40000000)
	//*  21   42:aload_0         
	//*  22   43:invokespecial   #130 <Method boolean isStacked()>
	//*  23   46:ifne            253
	//*  24   49:iload_1         
	//*  25   50:invokestatic    #135 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  26   53:ldc1            #136 <Int 0x40000000>
	//*  27   55:icmpne          253
		{
			l = android.view.View.MeasureSpec.makeMeasureSpec(l, 0x80000000);
	//   28   58:iload           4
	//   29   60:ldc1            #137 <Int 0x80000000>
	//   30   62:invokestatic    #140 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   31   65:istore          4
			k = 1;
	//   32   67:iconst_1        
	//   33   68:istore_3        
		} else
	//*  34   69:aload_0         
	//*  35   70:iload           4
	//*  36   72:iload_2         
	//*  37   73:invokespecial   #142 <Method void LinearLayout.onMeasure(int, int)>
	//*  38   76:iload_3         
	//*  39   77:istore          5
	//*  40   79:aload_0         
	//*  41   80:getfield        #63  <Field boolean mAllowStacking>
	//*  42   83:ifeq            127
	//*  43   86:iload_3         
	//*  44   87:istore          5
	//*  45   89:aload_0         
	//*  46   90:invokespecial   #130 <Method boolean isStacked()>
	//*  47   93:ifne            127
	//*  48   96:aload_0         
	//*  49   97:invokevirtual   #145 <Method int getMeasuredWidthAndState()>
	//*  50  100:ldc1            #146 <Int 0xff000000>
	//*  51  102:iand            
	//*  52  103:ldc1            #147 <Int 0x1000000>
	//*  53  105:icmpne          259
	//*  54  108:iconst_1        
	//*  55  109:istore          4
	//*  56  111:iload_3         
	//*  57  112:istore          5
	//*  58  114:iload           4
	//*  59  116:ifeq            127
	//*  60  119:aload_0         
	//*  61  120:iconst_1        
	//*  62  121:invokespecial   #132 <Method void setStacked(boolean)>
	//*  63  124:iconst_1        
	//*  64  125:istore          5
	//*  65  127:iload           5
	//*  66  129:ifeq            138
	//*  67  132:aload_0         
	//*  68  133:iload_1         
	//*  69  134:iload_2         
	//*  70  135:invokespecial   #142 <Method void LinearLayout.onMeasure(int, int)>
	//*  71  138:iconst_0        
	//*  72  139:istore_1        
	//*  73  140:aload_0         
	//*  74  141:iconst_0        
	//*  75  142:invokespecial   #149 <Method int getNextVisibleChildIndex(int)>
	//*  76  145:istore_3        
	//*  77  146:iload_3         
	//*  78  147:iflt            239
	//*  79  150:aload_0         
	//*  80  151:iload_3         
	//*  81  152:invokevirtual   #78  <Method View getChildAt(int)>
	//*  82  155:astore          6
	//*  83  157:aload           6
	//*  84  159:invokevirtual   #153 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  85  162:checkcast       #155 <Class android.widget.LinearLayout$LayoutParams>
	//*  86  165:astore          7
	//*  87  167:iconst_0        
	//*  88  168:aload_0         
	//*  89  169:invokevirtual   #158 <Method int getPaddingTop()>
	//*  90  172:aload           6
	//*  91  174:invokevirtual   #161 <Method int View.getMeasuredHeight()>
	//*  92  177:iadd            
	//*  93  178:aload           7
	//*  94  180:getfield        #164 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
	//*  95  183:iadd            
	//*  96  184:aload           7
	//*  97  186:getfield        #167 <Field int android.widget.LinearLayout$LayoutParams.bottomMargin>
	//*  98  189:iadd            
	//*  99  190:iadd            
	//* 100  191:istore_2        
	//* 101  192:aload_0         
	//* 102  193:invokespecial   #130 <Method boolean isStacked()>
	//* 103  196:ifeq            265
	//* 104  199:aload_0         
	//* 105  200:iload_3         
	//* 106  201:iconst_1        
	//* 107  202:iadd            
	//* 108  203:invokespecial   #149 <Method int getNextVisibleChildIndex(int)>
	//* 109  206:istore_3        
	//* 110  207:iload_2         
	//* 111  208:istore_1        
	//* 112  209:iload_3         
	//* 113  210:iflt            239
	//* 114  213:iload_2         
	//* 115  214:aload_0         
	//* 116  215:iload_3         
	//* 117  216:invokevirtual   #78  <Method View getChildAt(int)>
	//* 118  219:invokevirtual   #168 <Method int View.getPaddingTop()>
	//* 119  222:ldc1            #169 <Float 16F>
	//* 120  224:aload_0         
	//* 121  225:invokevirtual   #29  <Method Resources getResources()>
	//* 122  228:invokevirtual   #173 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//* 123  231:getfield        #179 <Field float DisplayMetrics.density>
	//* 124  234:fmul            
	//* 125  235:f2i             
	//* 126  236:iadd            
	//* 127  237:iadd            
	//* 128  238:istore_1        
	//* 129  239:aload_0         
	//* 130  240:invokestatic    #184 <Method int ViewCompat.getMinimumHeight(View)>
	//* 131  243:iload_1         
	//* 132  244:icmpeq          252
	//* 133  247:aload_0         
	//* 134  248:iload_1         
	//* 135  249:invokevirtual   #187 <Method void setMinimumHeight(int)>
	//* 136  252:return          
		{
			l = i;
	//  137  253:iload_1         
	//  138  254:istore          4
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
	//* 139  256:goto            69
					l = 0;
	//  140  259:iconst_0        
	//  141  260:istore          4
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
		i = 0;
		k = getNextVisibleChildIndex(0);
		if(k >= 0)
		{
			view = getChildAt(k);
			layoutparams = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
			j = 0 + (getPaddingTop() + view.getMeasuredHeight() + layoutparams.topMargin + layoutparams.bottomMargin);
			if(isStacked())
			{
				k = getNextVisibleChildIndex(k + 1);
				i = j;
				if(k >= 0)
					i = j + (getChildAt(k).getPaddingTop() + (int)(16F * getResources().getDisplayMetrics().density));
			} else
	//* 142  262:goto            111
			{
				i = j + getPaddingBottom();
	//  143  265:iload_2         
	//  144  266:aload_0         
	//  145  267:invokevirtual   #190 <Method int getPaddingBottom()>
	//  146  270:iadd            
	//  147  271:istore_1        
			}
		}
		if(ViewCompat.getMinimumHeight(((View) (this))) != i)
			setMinimumHeight(i);
	//* 148  272:goto            239
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
