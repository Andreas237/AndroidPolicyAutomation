// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.MarginLayoutParamsCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class FlowLayout extends ViewGroup
{

	public FlowLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #18  <Method void FlowLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public FlowLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #22  <Method void FlowLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public FlowLayout(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #23  <Method void ViewGroup(Context, AttributeSet, int)>
		singleLine = false;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #25  <Field boolean singleLine>
		loadFromAttributes(context, attributeset);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:aload_2         
	//   11   15:invokespecial   #28  <Method void loadFromAttributes(Context, AttributeSet)>
	//   12   18:return          
	}

	public FlowLayout(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #33  <Method void ViewGroup(Context, AttributeSet, int, int)>
		singleLine = false;
	//    6    9:aload_0         
	//    7   10:iconst_0        
	//    8   11:putfield        #25  <Field boolean singleLine>
		loadFromAttributes(context, attributeset);
	//    9   14:aload_0         
	//   10   15:aload_1         
	//   11   16:aload_2         
	//   12   17:invokespecial   #28  <Method void loadFromAttributes(Context, AttributeSet)>
	//   13   20:return          
	}

	private static int getMeasuredDimension(int i, int j, int k)
	{
		if(j != 0x80000000)
	//*   0    0:iload_1         
	//*   1    1:ldc1            #37  <Int 0x80000000>
	//*   2    3:icmpeq          16
		{
			if(j != 0x40000000)
	//*   3    6:iload_1         
	//*   4    7:ldc1            #38  <Int 0x40000000>
	//*   5    9:icmpeq          14
				return k;
	//    6   12:iload_2         
	//    7   13:ireturn         
			else
				return i;
	//    8   14:iload_0         
	//    9   15:ireturn         
		} else
		{
			return Math.min(k, i);
	//   10   16:iload_2         
	//   11   17:iload_0         
	//   12   18:invokestatic    #44  <Method int Math.min(int, int)>
	//   13   21:ireturn         
		}
	}

	private void loadFromAttributes(Context context, AttributeSet attributeset)
	{
		context = ((Context) (context.getTheme().obtainStyledAttributes(attributeset, android.support.design.R.styleable.FlowLayout, 0, 0)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #50  <Method android.content.res.Resources$Theme Context.getTheme()>
	//    2    4:aload_2         
	//    3    5:getstatic       #56  <Field int[] android.support.design.R$styleable.FlowLayout>
	//    4    8:iconst_0        
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #62  <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//    7   13:astore_1        
		lineSpacing = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.FlowLayout_lineSpacing, 0);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getstatic       #65  <Field int android.support.design.R$styleable.FlowLayout_lineSpacing>
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #70  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   13   23:putfield        #72  <Field int lineSpacing>
		itemSpacing = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.FlowLayout_itemSpacing, 0);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getstatic       #75  <Field int android.support.design.R$styleable.FlowLayout_itemSpacing>
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #70  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   19   35:putfield        #77  <Field int itemSpacing>
		((TypedArray) (context)).recycle();
	//   20   38:aload_1         
	//   21   39:invokevirtual   #81  <Method void TypedArray.recycle()>
	//   22   42:return          
	}

	protected int getItemSpacing()
	{
		return itemSpacing;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field int itemSpacing>
	//    2    4:ireturn         
	}

	protected int getLineSpacing()
	{
		return lineSpacing;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field int lineSpacing>
	//    2    4:ireturn         
	}

	protected boolean isSingleLine()
	{
		return singleLine;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field boolean singleLine>
	//    2    4:ireturn         
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #91  <Method int getChildCount()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		j = ViewCompat.getLayoutDirection(((View) (this)));
	//    4    8:aload_0         
	//    5    9:invokestatic    #97  <Method int ViewCompat.getLayoutDirection(View)>
	//    6   12:istore_3        
		boolean flag1 = true;
	//    7   13:iconst_1        
	//    8   14:istore          6
		if(j != 1)
	//*   9   16:iload_3         
	//*  10   17:iconst_1        
	//*  11   18:icmpne          24
	//*  12   21:goto            27
			flag1 = false;
	//   13   24:iconst_0        
	//   14   25:istore          6
		if(flag1)
	//*  15   27:iload           6
	//*  16   29:ifeq            40
			j = getPaddingRight();
	//   17   32:aload_0         
	//   18   33:invokevirtual   #100 <Method int getPaddingRight()>
	//   19   36:istore_3        
		else
	//*  20   37:goto            45
			j = getPaddingLeft();
	//   21   40:aload_0         
	//   22   41:invokevirtual   #103 <Method int getPaddingLeft()>
	//   23   44:istore_3        
		if(flag1)
	//*  24   45:iload           6
	//*  25   47:ifeq            59
			l = getPaddingLeft();
	//   26   50:aload_0         
	//   27   51:invokevirtual   #103 <Method int getPaddingLeft()>
	//   28   54:istore          5
		else
	//*  29   56:goto            65
			l = getPaddingRight();
	//   30   59:aload_0         
	//   31   60:invokevirtual   #100 <Method int getPaddingRight()>
	//   32   63:istore          5
		int j1 = getPaddingTop();
	//   33   65:aload_0         
	//   34   66:invokevirtual   #106 <Method int getPaddingTop()>
	//   35   69:istore          8
		int j2 = k - i - l;
	//   36   71:iload           4
	//   37   73:iload_2         
	//   38   74:isub            
	//   39   75:iload           5
	//   40   77:isub            
	//   41   78:istore          12
		k = j;
	//   42   80:iload_3         
	//   43   81:istore          4
		int i1 = 0;
	//   44   83:iconst_0        
	//   45   84:istore          7
		i = j1;
	//   46   86:iload           8
	//   47   88:istore_2        
		for(; i1 < getChildCount(); i1++)
	//*  48   89:iload           7
	//*  49   91:aload_0         
	//*  50   92:invokevirtual   #91  <Method int getChildCount()>
	//*  51   95:icmpge          318
		{
			View view = getChildAt(i1);
	//   52   98:aload_0         
	//   53   99:iload           7
	//   54  101:invokevirtual   #110 <Method View getChildAt(int)>
	//   55  104:astore          14
			if(view.getVisibility() == 8)
	//*  56  106:aload           14
	//*  57  108:invokevirtual   #115 <Method int View.getVisibility()>
	//*  58  111:bipush          8
	//*  59  113:icmpne          119
				continue;
	//   60  116:goto            309
			Object obj = ((Object) (view.getLayoutParams()));
	//   61  119:aload           14
	//   62  121:invokevirtual   #119 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   63  124:astore          15
			int k1;
			int l1;
			if(obj instanceof android.view.ViewGroup.MarginLayoutParams)
	//*  64  126:aload           15
	//*  65  128:instanceof      #121 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  66  131:ifeq            158
			{
				obj = ((Object) ((android.view.ViewGroup.MarginLayoutParams)obj));
	//   67  134:aload           15
	//   68  136:checkcast       #121 <Class android.view.ViewGroup$MarginLayoutParams>
	//   69  139:astore          15
				l1 = MarginLayoutParamsCompat.getMarginStart(((android.view.ViewGroup.MarginLayoutParams) (obj)));
	//   70  141:aload           15
	//   71  143:invokestatic    #127 <Method int MarginLayoutParamsCompat.getMarginStart(android.view.ViewGroup$MarginLayoutParams)>
	//   72  146:istore          10
				k1 = MarginLayoutParamsCompat.getMarginEnd(((android.view.ViewGroup.MarginLayoutParams) (obj)));
	//   73  148:aload           15
	//   74  150:invokestatic    #130 <Method int MarginLayoutParamsCompat.getMarginEnd(android.view.ViewGroup$MarginLayoutParams)>
	//   75  153:istore          9
			} else
	//*  76  155:goto            165
			{
				k1 = 0;
	//   77  158:iconst_0        
	//   78  159:istore          9
				l1 = k1;
	//   79  161:iload           9
	//   80  163:istore          10
			}
			int k2 = view.getMeasuredWidth();
	//   81  165:aload           14
	//   82  167:invokevirtual   #133 <Method int View.getMeasuredWidth()>
	//   83  170:istore          13
			int i2 = k;
	//   84  172:iload           4
	//   85  174:istore          11
			l = i;
	//   86  176:iload_2         
	//   87  177:istore          5
			if(!singleLine)
	//*  88  179:aload_0         
	//*  89  180:getfield        #25  <Field boolean singleLine>
	//*  90  183:ifne            218
			{
				i2 = k;
	//   91  186:iload           4
	//   92  188:istore          11
				l = i;
	//   93  190:iload_2         
	//   94  191:istore          5
				if(k + l1 + k2 > j2)
	//*  95  193:iload           4
	//*  96  195:iload           10
	//*  97  197:iadd            
	//*  98  198:iload           13
	//*  99  200:iadd            
	//* 100  201:iload           12
	//* 101  203:icmple          218
				{
					l = j1 + lineSpacing;
	//  102  206:iload           8
	//  103  208:aload_0         
	//  104  209:getfield        #72  <Field int lineSpacing>
	//  105  212:iadd            
	//  106  213:istore          5
					i2 = j;
	//  107  215:iload_3         
	//  108  216:istore          11
				}
			}
			i = i2 + l1;
	//  109  218:iload           11
	//  110  220:iload           10
	//  111  222:iadd            
	//  112  223:istore_2        
			k = view.getMeasuredWidth() + i;
	//  113  224:aload           14
	//  114  226:invokevirtual   #133 <Method int View.getMeasuredWidth()>
	//  115  229:iload_2         
	//  116  230:iadd            
	//  117  231:istore          4
			j1 = view.getMeasuredHeight() + l;
	//  118  233:aload           14
	//  119  235:invokevirtual   #136 <Method int View.getMeasuredHeight()>
	//  120  238:iload           5
	//  121  240:iadd            
	//  122  241:istore          8
			if(flag1)
	//* 123  243:iload           6
	//* 124  245:ifeq            273
				view.layout(j2 - k, l, j2 - i2 - l1, j1);
	//  125  248:aload           14
	//  126  250:iload           12
	//  127  252:iload           4
	//  128  254:isub            
	//  129  255:iload           5
	//  130  257:iload           12
	//  131  259:iload           11
	//  132  261:isub            
	//  133  262:iload           10
	//  134  264:isub            
	//  135  265:iload           8
	//  136  267:invokevirtual   #140 <Method void View.layout(int, int, int, int)>
			else
	//* 137  270:goto            285
				view.layout(i, l, k, j1);
	//  138  273:aload           14
	//  139  275:iload_2         
	//  140  276:iload           5
	//  141  278:iload           4
	//  142  280:iload           8
	//  143  282:invokevirtual   #140 <Method void View.layout(int, int, int, int)>
			k = i2 + (l1 + k1 + view.getMeasuredWidth() + itemSpacing);
	//  144  285:iload           11
	//  145  287:iload           10
	//  146  289:iload           9
	//  147  291:iadd            
	//  148  292:aload           14
	//  149  294:invokevirtual   #133 <Method int View.getMeasuredWidth()>
	//  150  297:iadd            
	//  151  298:aload_0         
	//  152  299:getfield        #77  <Field int itemSpacing>
	//  153  302:iadd            
	//  154  303:iadd            
	//  155  304:istore          4
			i = l;
	//  156  306:iload           5
	//  157  308:istore_2        
		}

	//  158  309:iload           7
	//  159  311:iconst_1        
	//  160  312:iadd            
	//  161  313:istore          7
	//* 162  315:goto            89
	//  163  318:return          
	}

	protected void onMeasure(int i, int j)
	{
		int j3 = android.view.View.MeasureSpec.getSize(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #148 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    2    4:istore          14
		int k3 = android.view.View.MeasureSpec.getMode(i);
	//    3    6:iload_1         
	//    4    7:invokestatic    #151 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    5   10:istore          15
		int l3 = android.view.View.MeasureSpec.getSize(j);
	//    6   12:iload_2         
	//    7   13:invokestatic    #148 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    8   16:istore          16
		int i4 = android.view.View.MeasureSpec.getMode(j);
	//    9   18:iload_2         
	//   10   19:invokestatic    #151 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   11   22:istore          17
		int k1;
		if(k3 != 0x80000000 && k3 != 0x40000000)
	//*  12   24:iload           15
	//*  13   26:ldc1            #37  <Int 0x80000000>
	//*  14   28:icmpeq          48
	//*  15   31:iload           15
	//*  16   33:ldc1            #38  <Int 0x40000000>
	//*  17   35:icmpne          41
	//*  18   38:goto            48
			k1 = 0x7fffffff;
	//   19   41:ldc1            #152 <Int 0x7fffffff>
	//   20   43:istore          7
		else
	//*  21   45:goto            52
			k1 = j3;
	//   22   48:iload           14
	//   23   50:istore          7
		int i1 = getPaddingLeft();
	//   24   52:aload_0         
	//   25   53:invokevirtual   #103 <Method int getPaddingLeft()>
	//   26   56:istore          5
		int k = getPaddingTop();
	//   27   58:aload_0         
	//   28   59:invokevirtual   #106 <Method int getPaddingTop()>
	//   29   62:istore_3        
		int j4 = getPaddingRight();
	//   30   63:aload_0         
	//   31   64:invokevirtual   #100 <Method int getPaddingRight()>
	//   32   67:istore          18
		int l = k;
	//   33   69:iload_3         
	//   34   70:istore          4
		int l1 = 0;
	//   35   72:iconst_0        
	//   36   73:istore          8
		boolean flag = false;
	//   37   75:iconst_0        
	//   38   76:istore          6
		int k2 = k;
	//   39   78:iload_3         
	//   40   79:istore          11
		k = ((int) (flag));
	//   41   81:iload           6
	//   42   83:istore_3        
		while(l1 < getChildCount()) 
	//*  43   84:iload           8
	//*  44   86:aload_0         
	//*  45   87:invokevirtual   #91  <Method int getChildCount()>
	//*  46   90:icmpge          324
		{
			View view = getChildAt(l1);
	//   47   93:aload_0         
	//   48   94:iload           8
	//   49   96:invokevirtual   #110 <Method View getChildAt(int)>
	//   50   99:astore          20
			int j1;
			if(view.getVisibility() == 8)
	//*  51  101:aload           20
	//*  52  103:invokevirtual   #115 <Method int View.getVisibility()>
	//*  53  106:bipush          8
	//*  54  108:icmpne          118
			{
				j1 = l;
	//   55  111:iload           4
	//   56  113:istore          6
			} else
	//*  57  115:goto            311
			{
				measureChild(view, i, j);
	//   58  118:aload_0         
	//   59  119:aload           20
	//   60  121:iload_1         
	//   61  122:iload_2         
	//   62  123:invokevirtual   #156 <Method void measureChild(View, int, int)>
				Object obj = ((Object) (view.getLayoutParams()));
	//   63  126:aload           20
	//   64  128:invokevirtual   #119 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   65  131:astore          21
				int i2;
				int j2;
				if(obj instanceof android.view.ViewGroup.MarginLayoutParams)
	//*  66  133:aload           21
	//*  67  135:instanceof      #121 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  68  138:ifeq            169
				{
					obj = ((Object) ((android.view.ViewGroup.MarginLayoutParams)obj));
	//   69  141:aload           21
	//   70  143:checkcast       #121 <Class android.view.ViewGroup$MarginLayoutParams>
	//   71  146:astore          21
					i2 = ((android.view.ViewGroup.MarginLayoutParams) (obj)).leftMargin + 0;
	//   72  148:aload           21
	//   73  150:getfield        #159 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//   74  153:iconst_0        
	//   75  154:iadd            
	//   76  155:istore          9
					j2 = ((android.view.ViewGroup.MarginLayoutParams) (obj)).rightMargin + 0;
	//   77  157:aload           21
	//   78  159:getfield        #162 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//   79  162:iconst_0        
	//   80  163:iadd            
	//   81  164:istore          10
				} else
	//*  82  166:goto            176
				{
					i2 = 0;
	//   83  169:iconst_0        
	//   84  170:istore          9
					j2 = i2;
	//   85  172:iload           9
	//   86  174:istore          10
				}
				int k4 = view.getMeasuredWidth();
	//   87  176:aload           20
	//   88  178:invokevirtual   #133 <Method int View.getMeasuredWidth()>
	//   89  181:istore          19
				int i3 = i1;
	//   90  183:iload           5
	//   91  185:istore          13
				j1 = l;
	//   92  187:iload           4
	//   93  189:istore          6
				int l2 = i3;
	//   94  191:iload           13
	//   95  193:istore          12
				if(i1 + i2 + k4 > k1 - j4)
	//*  96  195:iload           5
	//*  97  197:iload           9
	//*  98  199:iadd            
	//*  99  200:iload           19
	//* 100  202:iadd            
	//* 101  203:iload           7
	//* 102  205:iload           18
	//* 103  207:isub            
	//* 104  208:icmple          241
				{
					j1 = l;
	//  105  211:iload           4
	//  106  213:istore          6
					l2 = i3;
	//  107  215:iload           13
	//  108  217:istore          12
					if(!isSingleLine())
	//* 109  219:aload_0         
	//* 110  220:invokevirtual   #164 <Method boolean isSingleLine()>
	//* 111  223:ifne            241
					{
						l2 = getPaddingLeft();
	//  112  226:aload_0         
	//  113  227:invokevirtual   #103 <Method int getPaddingLeft()>
	//  114  230:istore          12
						j1 = lineSpacing + k2;
	//  115  232:aload_0         
	//  116  233:getfield        #72  <Field int lineSpacing>
	//  117  236:iload           11
	//  118  238:iadd            
	//  119  239:istore          6
					}
				}
				i1 = l2 + i2 + view.getMeasuredWidth();
	//  120  241:iload           12
	//  121  243:iload           9
	//  122  245:iadd            
	//  123  246:aload           20
	//  124  248:invokevirtual   #133 <Method int View.getMeasuredWidth()>
	//  125  251:iadd            
	//  126  252:istore          5
				k2 = view.getMeasuredHeight();
	//  127  254:aload           20
	//  128  256:invokevirtual   #136 <Method int View.getMeasuredHeight()>
	//  129  259:istore          11
				l = k;
	//  130  261:iload_3         
	//  131  262:istore          4
				if(i1 > k)
	//* 132  264:iload           5
	//* 133  266:iload_3         
	//* 134  267:icmple          274
					l = i1;
	//  135  270:iload           5
	//  136  272:istore          4
				k = view.getMeasuredWidth();
	//  137  274:aload           20
	//  138  276:invokevirtual   #133 <Method int View.getMeasuredWidth()>
	//  139  279:istore_3        
				i1 = itemSpacing;
	//  140  280:aload_0         
	//  141  281:getfield        #77  <Field int itemSpacing>
	//  142  284:istore          5
				k2 += j1;
	//  143  286:iload           11
	//  144  288:iload           6
	//  145  290:iadd            
	//  146  291:istore          11
				i1 = l2 + (i2 + j2 + k + i1);
	//  147  293:iload           12
	//  148  295:iload           9
	//  149  297:iload           10
	//  150  299:iadd            
	//  151  300:iload_3         
	//  152  301:iadd            
	//  153  302:iload           5
	//  154  304:iadd            
	//  155  305:iadd            
	//  156  306:istore          5
				k = l;
	//  157  308:iload           4
	//  158  310:istore_3        
			}
			l1++;
	//  159  311:iload           8
	//  160  313:iconst_1        
	//  161  314:iadd            
	//  162  315:istore          8
			l = j1;
	//  163  317:iload           6
	//  164  319:istore          4
		}
	//* 165  321:goto            84
		setMeasuredDimension(getMeasuredDimension(j3, k3, k), getMeasuredDimension(l3, i4, k2));
	//  166  324:aload_0         
	//  167  325:iload           14
	//  168  327:iload           15
	//  169  329:iload_3         
	//  170  330:invokestatic    #166 <Method int getMeasuredDimension(int, int, int)>
	//  171  333:iload           16
	//  172  335:iload           17
	//  173  337:iload           11
	//  174  339:invokestatic    #166 <Method int getMeasuredDimension(int, int, int)>
	//  175  342:invokevirtual   #169 <Method void setMeasuredDimension(int, int)>
	//  176  345:return          
	}

	protected void setItemSpacing(int i)
	{
		itemSpacing = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #77  <Field int itemSpacing>
	//    3    5:return          
	}

	protected void setLineSpacing(int i)
	{
		lineSpacing = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #72  <Field int lineSpacing>
	//    3    5:return          
	}

	public void setSingleLine(boolean flag)
	{
		singleLine = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #25  <Field boolean singleLine>
	//    3    5:return          
	}

	private int itemSpacing;
	private int lineSpacing;
	private boolean singleLine;
}
