// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
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
	//    3    3:invokespecial   #19  <Method void LinearLayout(Context, AttributeSet)>
		mLastWidthSize = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #21  <Field int mLastWidthSize>
		mMinimumHeight = 0;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #23  <Field int mMinimumHeight>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ButtonBarLayout)));
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:getstatic       #29  <Field int[] android.support.v7.appcompat.R$styleable.ButtonBarLayout>
	//   13   21:invokevirtual   #35  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   14   24:astore_1        
		mAllowStacking = ((TypedArray) (context)).getBoolean(android.support.v7.appcompat.R.styleable.ButtonBarLayout_allowStacking, true);
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:getstatic       #38  <Field int android.support.v7.appcompat.R$styleable.ButtonBarLayout_allowStacking>
	//   18   30:iconst_1        
	//   19   31:invokevirtual   #44  <Method boolean TypedArray.getBoolean(int, boolean)>
	//   20   34:putfield        #46  <Field boolean mAllowStacking>
		((TypedArray) (context)).recycle();
	//   21   37:aload_1         
	//   22   38:invokevirtual   #50  <Method void TypedArray.recycle()>
	//   23   41:return          
	}

	private int getNextVisibleChildIndex(int i)
	{
		for(int j = getChildCount(); i < j; i++)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #57  <Method int getChildCount()>
	//*   2    4:istore_2        
	//*   3    5:iload_1         
	//*   4    6:iload_2         
	//*   5    7:icmpge          30
			if(getChildAt(i).getVisibility() == 0)
	//*   6   10:aload_0         
	//*   7   11:iload_1         
	//*   8   12:invokevirtual   #61  <Method View getChildAt(int)>
	//*   9   15:invokevirtual   #66  <Method int View.getVisibility()>
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
	//    1    1:invokevirtual   #71  <Method int getOrientation()>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	private void setStacked(boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #75  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #77  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #82  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public int getMinimumHeight()
	{
		return Math.max(mMinimumHeight, super.getMinimumHeight());
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int mMinimumHeight>
	//    2    4:aload_0         
	//    3    5:invokespecial   #85  <Method int LinearLayout.getMinimumHeight()>
	//    4    8:invokestatic    #91  <Method int Math.max(int, int)>
	//    5   11:ireturn         
	}

	protected void onMeasure(int i, int j)
	{
		int k = android.view.View.MeasureSpec.getSize(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #98  <Method int android.view.View$MeasureSpec.getSize(int)>
	//    2    4:istore_3        
		boolean flag3 = mAllowStacking;
	//    3    5:aload_0         
	//    4    6:getfield        #46  <Field boolean mAllowStacking>
	//    5    9:istore          7
		boolean flag2 = false;
	//    6   11:iconst_0        
	//    7   12:istore          6
		if(flag3)
	//*   8   14:iload           7
	//*   9   16:ifeq            44
		{
			if(k > mLastWidthSize && isStacked())
	//*  10   19:iload_3         
	//*  11   20:aload_0         
	//*  12   21:getfield        #21  <Field int mLastWidthSize>
	//*  13   24:icmple          39
	//*  14   27:aload_0         
	//*  15   28:invokespecial   #100 <Method boolean isStacked()>
	//*  16   31:ifeq            39
				setStacked(false);
	//   17   34:aload_0         
	//   18   35:iconst_0        
	//   19   36:invokespecial   #102 <Method void setStacked(boolean)>
			mLastWidthSize = k;
	//   20   39:aload_0         
	//   21   40:iload_3         
	//   22   41:putfield        #21  <Field int mLastWidthSize>
		}
		int l;
		if(!isStacked() && android.view.View.MeasureSpec.getMode(i) == 0x40000000)
	//*  23   44:aload_0         
	//*  24   45:invokespecial   #100 <Method boolean isStacked()>
	//*  25   48:ifne            73
	//*  26   51:iload_1         
	//*  27   52:invokestatic    #105 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  28   55:ldc1            #106 <Int 0x40000000>
	//*  29   57:icmpne          73
		{
			l = android.view.View.MeasureSpec.makeMeasureSpec(k, 0x80000000);
	//   30   60:iload_3         
	//   31   61:ldc1            #107 <Int 0x80000000>
	//   32   63:invokestatic    #110 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   33   66:istore          4
			k = 1;
	//   34   68:iconst_1        
	//   35   69:istore_3        
		} else
	//*  36   70:goto            78
		{
			l = i;
	//   37   73:iload_1         
	//   38   74:istore          4
			k = 0;
	//   39   76:iconst_0        
	//   40   77:istore_3        
		}
		super.onMeasure(l, j);
	//   41   78:aload_0         
	//   42   79:iload           4
	//   43   81:iload_2         
	//   44   82:invokespecial   #112 <Method void LinearLayout.onMeasure(int, int)>
		boolean flag1 = ((boolean) (k));
	//   45   85:iload_3         
	//   46   86:istore          5
		if(mAllowStacking)
	//*  47   88:aload_0         
	//*  48   89:getfield        #46  <Field boolean mAllowStacking>
	//*  49   92:ifeq            142
		{
			flag1 = ((boolean) (k));
	//   50   95:iload_3         
	//   51   96:istore          5
			if(!isStacked())
	//*  52   98:aload_0         
	//*  53   99:invokespecial   #100 <Method boolean isStacked()>
	//*  54  102:ifne            142
			{
				boolean flag;
				if((getMeasuredWidthAndState() & 0xff000000) == 0x1000000)
	//*  55  105:aload_0         
	//*  56  106:invokevirtual   #115 <Method int getMeasuredWidthAndState()>
	//*  57  109:ldc1            #116 <Int 0xff000000>
	//*  58  111:iand            
	//*  59  112:ldc1            #117 <Int 0x1000000>
	//*  60  114:icmpne          123
					flag = true;
	//   61  117:iconst_1        
	//   62  118:istore          4
				else
	//*  63  120:goto            126
					flag = false;
	//   64  123:iconst_0        
	//   65  124:istore          4
				flag1 = ((boolean) (k));
	//   66  126:iload_3         
	//   67  127:istore          5
				if(flag)
	//*  68  129:iload           4
	//*  69  131:ifeq            142
				{
					setStacked(true);
	//   70  134:aload_0         
	//   71  135:iconst_1        
	//   72  136:invokespecial   #102 <Method void setStacked(boolean)>
					flag1 = true;
	//   73  139:iconst_1        
	//   74  140:istore          5
				}
			}
		}
		if(flag1)
	//*  75  142:iload           5
	//*  76  144:ifeq            153
			super.onMeasure(i, j);
	//   77  147:aload_0         
	//   78  148:iload_1         
	//   79  149:iload_2         
	//   80  150:invokespecial   #112 <Method void LinearLayout.onMeasure(int, int)>
		j = getNextVisibleChildIndex(0);
	//   81  153:aload_0         
	//   82  154:iconst_0        
	//   83  155:invokespecial   #119 <Method int getNextVisibleChildIndex(int)>
	//   84  158:istore_2        
		i = ((int) (flag2));
	//   85  159:iload           6
	//   86  161:istore_1        
		if(j >= 0)
	//*  87  162:iload_2         
	//*  88  163:iflt            266
		{
			View view = getChildAt(j);
	//   89  166:aload_0         
	//   90  167:iload_2         
	//   91  168:invokevirtual   #61  <Method View getChildAt(int)>
	//   92  171:astore          8
			android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
	//   93  173:aload           8
	//   94  175:invokevirtual   #123 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   95  178:checkcast       #125 <Class android.widget.LinearLayout$LayoutParams>
	//   96  181:astore          9
			i = getPaddingTop() + view.getMeasuredHeight() + layoutparams.topMargin + layoutparams.bottomMargin + 0;
	//   97  183:aload_0         
	//   98  184:invokevirtual   #128 <Method int getPaddingTop()>
	//   99  187:aload           8
	//  100  189:invokevirtual   #131 <Method int View.getMeasuredHeight()>
	//  101  192:iadd            
	//  102  193:aload           9
	//  103  195:getfield        #134 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
	//  104  198:iadd            
	//  105  199:aload           9
	//  106  201:getfield        #137 <Field int android.widget.LinearLayout$LayoutParams.bottomMargin>
	//  107  204:iadd            
	//  108  205:iconst_0        
	//  109  206:iadd            
	//  110  207:istore_1        
			if(isStacked())
	//* 111  208:aload_0         
	//* 112  209:invokespecial   #100 <Method boolean isStacked()>
	//* 113  212:ifeq            259
			{
				j = getNextVisibleChildIndex(j + 1);
	//  114  215:aload_0         
	//  115  216:iload_2         
	//  116  217:iconst_1        
	//  117  218:iadd            
	//  118  219:invokespecial   #119 <Method int getNextVisibleChildIndex(int)>
	//  119  222:istore_2        
				if(j >= 0)
	//* 120  223:iload_2         
	//* 121  224:iflt            256
					i += getChildAt(j).getPaddingTop() + (int)(getResources().getDisplayMetrics().density * 16F);
	//  122  227:iload_1         
	//  123  228:aload_0         
	//  124  229:iload_2         
	//  125  230:invokevirtual   #61  <Method View getChildAt(int)>
	//  126  233:invokevirtual   #138 <Method int View.getPaddingTop()>
	//  127  236:aload_0         
	//  128  237:invokevirtual   #142 <Method Resources getResources()>
	//  129  240:invokevirtual   #148 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//  130  243:getfield        #154 <Field float DisplayMetrics.density>
	//  131  246:ldc1            #155 <Float 16F>
	//  132  248:fmul            
	//  133  249:f2i             
	//  134  250:iadd            
	//  135  251:iadd            
	//  136  252:istore_1        
			} else
	//* 137  253:goto            266
	//* 138  256:goto            266
			{
				i += getPaddingBottom();
	//  139  259:iload_1         
	//  140  260:aload_0         
	//  141  261:invokevirtual   #158 <Method int getPaddingBottom()>
	//  142  264:iadd            
	//  143  265:istore_1        
			}
		}
		if(ViewCompat.getMinimumHeight(((View) (this))) != i)
	//* 144  266:aload_0         
	//* 145  267:invokestatic    #163 <Method int ViewCompat.getMinimumHeight(View)>
	//* 146  270:iload_1         
	//* 147  271:icmpeq          279
			setMinimumHeight(i);
	//  148  274:aload_0         
	//  149  275:iload_1         
	//  150  276:invokevirtual   #167 <Method void setMinimumHeight(int)>
	//  151  279:return          
	}

	public void setAllowStacking(boolean flag)
	{
		if(mAllowStacking != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field boolean mAllowStacking>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          37
		{
			mAllowStacking = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #46  <Field boolean mAllowStacking>
			if(!mAllowStacking && getOrientation() == 1)
	//*   7   13:aload_0         
	//*   8   14:getfield        #46  <Field boolean mAllowStacking>
	//*   9   17:ifne            33
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #71  <Method int getOrientation()>
	//*  12   24:iconst_1        
	//*  13   25:icmpne          33
				setStacked(false);
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:invokespecial   #102 <Method void setStacked(boolean)>
			requestLayout();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #171 <Method void requestLayout()>
		}
	//   19   37:return          
	}

	private static final int PEEK_BUTTON_DP = 16;
	private boolean mAllowStacking;
	private int mLastWidthSize;
	private int mMinimumHeight;
}
