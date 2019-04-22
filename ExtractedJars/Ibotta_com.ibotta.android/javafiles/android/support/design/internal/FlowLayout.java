// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.support.v4.view.MarginLayoutParamsCompat;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;

public class FlowLayout extends ViewGroup
{

	private static int getMeasuredDimension(int i, int j, int k)
	{
		if(j != 0x80000000)
	//*   0    0:iload_1         
	//*   1    1:ldc1            #16  <Int 0x80000000>
	//*   2    3:icmpeq          16
		{
			if(j != 0x40000000)
	//*   3    6:iload_1         
	//*   4    7:ldc1            #17  <Int 0x40000000>
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
	//   12   18:invokestatic    #23  <Method int Math.min(int, int)>
	//   13   21:ireturn         
		}
	}

	protected int getItemSpacing()
	{
		return itemSpacing;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int itemSpacing>
	//    2    4:ireturn         
	}

	protected int getLineSpacing()
	{
		return lineSpacing;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int lineSpacing>
	//    2    4:ireturn         
	}

	protected boolean isSingleLine()
	{
		return singleLine;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field boolean singleLine>
	//    2    4:ireturn         
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #40  <Method int getChildCount()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		j = ViewCompat.getLayoutDirection(((View) (this)));
	//    4    8:aload_0         
	//    5    9:invokestatic    #46  <Method int ViewCompat.getLayoutDirection(View)>
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
	//   18   33:invokevirtual   #49  <Method int getPaddingRight()>
	//   19   36:istore_3        
		else
	//*  20   37:goto            45
			j = getPaddingLeft();
	//   21   40:aload_0         
	//   22   41:invokevirtual   #52  <Method int getPaddingLeft()>
	//   23   44:istore_3        
		if(flag1)
	//*  24   45:iload           6
	//*  25   47:ifeq            59
			l = getPaddingLeft();
	//   26   50:aload_0         
	//   27   51:invokevirtual   #52  <Method int getPaddingLeft()>
	//   28   54:istore          5
		else
	//*  29   56:goto            65
			l = getPaddingRight();
	//   30   59:aload_0         
	//   31   60:invokevirtual   #49  <Method int getPaddingRight()>
	//   32   63:istore          5
		int j1 = getPaddingTop();
	//   33   65:aload_0         
	//   34   66:invokevirtual   #55  <Method int getPaddingTop()>
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
		i = j1;
	//   44   83:iload           8
	//   45   85:istore_2        
		for(int i1 = 0; i1 < getChildCount(); i1++)
	//*  46   86:iconst_0        
	//*  47   87:istore          7
	//*  48   89:iload           7
	//*  49   91:aload_0         
	//*  50   92:invokevirtual   #40  <Method int getChildCount()>
	//*  51   95:icmpge          317
		{
			View view = getChildAt(i1);
	//   52   98:aload_0         
	//   53   99:iload           7
	//   54  101:invokevirtual   #59  <Method View getChildAt(int)>
	//   55  104:astore          14
			if(view.getVisibility() == 8)
	//*  56  106:aload           14
	//*  57  108:invokevirtual   #64  <Method int View.getVisibility()>
	//*  58  111:bipush          8
	//*  59  113:icmpne          119
				continue;
	//   60  116:goto            308
			Object obj = ((Object) (view.getLayoutParams()));
	//   61  119:aload           14
	//   62  121:invokevirtual   #68  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   63  124:astore          15
			int k1;
			int l1;
			if(obj instanceof android.view.ViewGroup.MarginLayoutParams)
	//*  64  126:aload           15
	//*  65  128:instanceof      #70  <Class android.view.ViewGroup$MarginLayoutParams>
	//*  66  131:ifeq            158
			{
				obj = ((Object) ((android.view.ViewGroup.MarginLayoutParams)obj));
	//   67  134:aload           15
	//   68  136:checkcast       #70  <Class android.view.ViewGroup$MarginLayoutParams>
	//   69  139:astore          15
				l1 = MarginLayoutParamsCompat.getMarginStart(((android.view.ViewGroup.MarginLayoutParams) (obj)));
	//   70  141:aload           15
	//   71  143:invokestatic    #76  <Method int MarginLayoutParamsCompat.getMarginStart(android.view.ViewGroup$MarginLayoutParams)>
	//   72  146:istore          10
				k1 = MarginLayoutParamsCompat.getMarginEnd(((android.view.ViewGroup.MarginLayoutParams) (obj)));
	//   73  148:aload           15
	//   74  150:invokestatic    #79  <Method int MarginLayoutParamsCompat.getMarginEnd(android.view.ViewGroup$MarginLayoutParams)>
	//   75  153:istore          9
			} else
	//*  76  155:goto            164
			{
				k1 = 0;
	//   77  158:iconst_0        
	//   78  159:istore          9
				l1 = 0;
	//   79  161:iconst_0        
	//   80  162:istore          10
			}
			int k2 = view.getMeasuredWidth();
	//   81  164:aload           14
	//   82  166:invokevirtual   #82  <Method int View.getMeasuredWidth()>
	//   83  169:istore          13
			int i2 = k;
	//   84  171:iload           4
	//   85  173:istore          11
			l = i;
	//   86  175:iload_2         
	//   87  176:istore          5
			if(!singleLine)
	//*  88  178:aload_0         
	//*  89  179:getfield        #35  <Field boolean singleLine>
	//*  90  182:ifne            217
			{
				i2 = k;
	//   91  185:iload           4
	//   92  187:istore          11
				l = i;
	//   93  189:iload_2         
	//   94  190:istore          5
				if(k + l1 + k2 > j2)
	//*  95  192:iload           4
	//*  96  194:iload           10
	//*  97  196:iadd            
	//*  98  197:iload           13
	//*  99  199:iadd            
	//* 100  200:iload           12
	//* 101  202:icmple          217
				{
					l = j1 + lineSpacing;
	//  102  205:iload           8
	//  103  207:aload_0         
	//  104  208:getfield        #31  <Field int lineSpacing>
	//  105  211:iadd            
	//  106  212:istore          5
					i2 = j;
	//  107  214:iload_3         
	//  108  215:istore          11
				}
			}
			i = i2 + l1;
	//  109  217:iload           11
	//  110  219:iload           10
	//  111  221:iadd            
	//  112  222:istore_2        
			k = view.getMeasuredWidth() + i;
	//  113  223:aload           14
	//  114  225:invokevirtual   #82  <Method int View.getMeasuredWidth()>
	//  115  228:iload_2         
	//  116  229:iadd            
	//  117  230:istore          4
			j1 = view.getMeasuredHeight() + l;
	//  118  232:aload           14
	//  119  234:invokevirtual   #85  <Method int View.getMeasuredHeight()>
	//  120  237:iload           5
	//  121  239:iadd            
	//  122  240:istore          8
			if(flag1)
	//* 123  242:iload           6
	//* 124  244:ifeq            272
				view.layout(j2 - k, l, j2 - i2 - l1, j1);
	//  125  247:aload           14
	//  126  249:iload           12
	//  127  251:iload           4
	//  128  253:isub            
	//  129  254:iload           5
	//  130  256:iload           12
	//  131  258:iload           11
	//  132  260:isub            
	//  133  261:iload           10
	//  134  263:isub            
	//  135  264:iload           8
	//  136  266:invokevirtual   #89  <Method void View.layout(int, int, int, int)>
			else
	//* 137  269:goto            284
				view.layout(i, l, k, j1);
	//  138  272:aload           14
	//  139  274:iload_2         
	//  140  275:iload           5
	//  141  277:iload           4
	//  142  279:iload           8
	//  143  281:invokevirtual   #89  <Method void View.layout(int, int, int, int)>
			k = i2 + (l1 + k1 + view.getMeasuredWidth() + itemSpacing);
	//  144  284:iload           11
	//  145  286:iload           10
	//  146  288:iload           9
	//  147  290:iadd            
	//  148  291:aload           14
	//  149  293:invokevirtual   #82  <Method int View.getMeasuredWidth()>
	//  150  296:iadd            
	//  151  297:aload_0         
	//  152  298:getfield        #28  <Field int itemSpacing>
	//  153  301:iadd            
	//  154  302:iadd            
	//  155  303:istore          4
			i = l;
	//  156  305:iload           5
	//  157  307:istore_2        
		}

	//  158  308:iload           7
	//  159  310:iconst_1        
	//  160  311:iadd            
	//  161  312:istore          7
	//* 162  314:goto            89
	//  163  317:return          
	}

	protected void onMeasure(int i, int j)
	{
		int j3 = android.view.View.MeasureSpec.getSize(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #97  <Method int android.view.View$MeasureSpec.getSize(int)>
	//    2    4:istore          14
		int k3 = android.view.View.MeasureSpec.getMode(i);
	//    3    6:iload_1         
	//    4    7:invokestatic    #100 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    5   10:istore          15
		int l3 = android.view.View.MeasureSpec.getSize(j);
	//    6   12:iload_2         
	//    7   13:invokestatic    #97  <Method int android.view.View$MeasureSpec.getSize(int)>
	//    8   16:istore          16
		int i4 = android.view.View.MeasureSpec.getMode(j);
	//    9   18:iload_2         
	//   10   19:invokestatic    #100 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   11   22:istore          17
		int k1;
		if(k3 != 0x80000000 && k3 != 0x40000000)
	//*  12   24:iload           15
	//*  13   26:ldc1            #16  <Int 0x80000000>
	//*  14   28:icmpeq          48
	//*  15   31:iload           15
	//*  16   33:ldc1            #17  <Int 0x40000000>
	//*  17   35:icmpne          41
	//*  18   38:goto            48
			k1 = 0x7fffffff;
	//   19   41:ldc1            #101 <Int 0x7fffffff>
	//   20   43:istore          7
		else
	//*  21   45:goto            52
			k1 = j3;
	//   22   48:iload           14
	//   23   50:istore          7
		int i1 = getPaddingLeft();
	//   24   52:aload_0         
	//   25   53:invokevirtual   #52  <Method int getPaddingLeft()>
	//   26   56:istore          5
		int k = getPaddingTop();
	//   27   58:aload_0         
	//   28   59:invokevirtual   #55  <Method int getPaddingTop()>
	//   29   62:istore_3        
		int j4 = getPaddingRight();
	//   30   63:aload_0         
	//   31   64:invokevirtual   #49  <Method int getPaddingRight()>
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
	//*  45   87:invokevirtual   #40  <Method int getChildCount()>
	//*  46   90:icmpge          323
		{
			View view = getChildAt(l1);
	//   47   93:aload_0         
	//   48   94:iload           8
	//   49   96:invokevirtual   #59  <Method View getChildAt(int)>
	//   50   99:astore          20
			int j1;
			if(view.getVisibility() == 8)
	//*  51  101:aload           20
	//*  52  103:invokevirtual   #64  <Method int View.getVisibility()>
	//*  53  106:bipush          8
	//*  54  108:icmpne          118
			{
				j1 = l;
	//   55  111:iload           4
	//   56  113:istore          6
			} else
	//*  57  115:goto            310
			{
				measureChild(view, i, j);
	//   58  118:aload_0         
	//   59  119:aload           20
	//   60  121:iload_1         
	//   61  122:iload_2         
	//   62  123:invokevirtual   #105 <Method void measureChild(View, int, int)>
				Object obj = ((Object) (view.getLayoutParams()));
	//   63  126:aload           20
	//   64  128:invokevirtual   #68  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   65  131:astore          21
				int i2;
				int j2;
				if(obj instanceof android.view.ViewGroup.MarginLayoutParams)
	//*  66  133:aload           21
	//*  67  135:instanceof      #70  <Class android.view.ViewGroup$MarginLayoutParams>
	//*  68  138:ifeq            169
				{
					obj = ((Object) ((android.view.ViewGroup.MarginLayoutParams)obj));
	//   69  141:aload           21
	//   70  143:checkcast       #70  <Class android.view.ViewGroup$MarginLayoutParams>
	//   71  146:astore          21
					i2 = ((android.view.ViewGroup.MarginLayoutParams) (obj)).leftMargin + 0;
	//   72  148:aload           21
	//   73  150:getfield        #108 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//   74  153:iconst_0        
	//   75  154:iadd            
	//   76  155:istore          9
					j2 = ((android.view.ViewGroup.MarginLayoutParams) (obj)).rightMargin + 0;
	//   77  157:aload           21
	//   78  159:getfield        #111 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//   79  162:iconst_0        
	//   80  163:iadd            
	//   81  164:istore          10
				} else
	//*  82  166:goto            175
				{
					i2 = 0;
	//   83  169:iconst_0        
	//   84  170:istore          9
					j2 = 0;
	//   85  172:iconst_0        
	//   86  173:istore          10
				}
				int k4 = view.getMeasuredWidth();
	//   87  175:aload           20
	//   88  177:invokevirtual   #82  <Method int View.getMeasuredWidth()>
	//   89  180:istore          19
				int i3 = i1;
	//   90  182:iload           5
	//   91  184:istore          13
				j1 = l;
	//   92  186:iload           4
	//   93  188:istore          6
				int l2 = i3;
	//   94  190:iload           13
	//   95  192:istore          12
				if(i1 + i2 + k4 > k1 - j4)
	//*  96  194:iload           5
	//*  97  196:iload           9
	//*  98  198:iadd            
	//*  99  199:iload           19
	//* 100  201:iadd            
	//* 101  202:iload           7
	//* 102  204:iload           18
	//* 103  206:isub            
	//* 104  207:icmple          240
				{
					j1 = l;
	//  105  210:iload           4
	//  106  212:istore          6
					l2 = i3;
	//  107  214:iload           13
	//  108  216:istore          12
					if(!isSingleLine())
	//* 109  218:aload_0         
	//* 110  219:invokevirtual   #113 <Method boolean isSingleLine()>
	//* 111  222:ifne            240
					{
						l2 = getPaddingLeft();
	//  112  225:aload_0         
	//  113  226:invokevirtual   #52  <Method int getPaddingLeft()>
	//  114  229:istore          12
						j1 = lineSpacing + k2;
	//  115  231:aload_0         
	//  116  232:getfield        #31  <Field int lineSpacing>
	//  117  235:iload           11
	//  118  237:iadd            
	//  119  238:istore          6
					}
				}
				i1 = l2 + i2 + view.getMeasuredWidth();
	//  120  240:iload           12
	//  121  242:iload           9
	//  122  244:iadd            
	//  123  245:aload           20
	//  124  247:invokevirtual   #82  <Method int View.getMeasuredWidth()>
	//  125  250:iadd            
	//  126  251:istore          5
				k2 = view.getMeasuredHeight();
	//  127  253:aload           20
	//  128  255:invokevirtual   #85  <Method int View.getMeasuredHeight()>
	//  129  258:istore          11
				l = k;
	//  130  260:iload_3         
	//  131  261:istore          4
				if(i1 > k)
	//* 132  263:iload           5
	//* 133  265:iload_3         
	//* 134  266:icmple          273
					l = i1;
	//  135  269:iload           5
	//  136  271:istore          4
				k = view.getMeasuredWidth();
	//  137  273:aload           20
	//  138  275:invokevirtual   #82  <Method int View.getMeasuredWidth()>
	//  139  278:istore_3        
				i1 = itemSpacing;
	//  140  279:aload_0         
	//  141  280:getfield        #28  <Field int itemSpacing>
	//  142  283:istore          5
				k2 += j1;
	//  143  285:iload           11
	//  144  287:iload           6
	//  145  289:iadd            
	//  146  290:istore          11
				i1 = l2 + (i2 + j2 + k + i1);
	//  147  292:iload           12
	//  148  294:iload           9
	//  149  296:iload           10
	//  150  298:iadd            
	//  151  299:iload_3         
	//  152  300:iadd            
	//  153  301:iload           5
	//  154  303:iadd            
	//  155  304:iadd            
	//  156  305:istore          5
				k = l;
	//  157  307:iload           4
	//  158  309:istore_3        
			}
			l1++;
	//  159  310:iload           8
	//  160  312:iconst_1        
	//  161  313:iadd            
	//  162  314:istore          8
			l = j1;
	//  163  316:iload           6
	//  164  318:istore          4
		}
	//* 165  320:goto            84
		setMeasuredDimension(getMeasuredDimension(j3, k3, k), getMeasuredDimension(l3, i4, k2));
	//  166  323:aload_0         
	//  167  324:iload           14
	//  168  326:iload           15
	//  169  328:iload_3         
	//  170  329:invokestatic    #115 <Method int getMeasuredDimension(int, int, int)>
	//  171  332:iload           16
	//  172  334:iload           17
	//  173  336:iload           11
	//  174  338:invokestatic    #115 <Method int getMeasuredDimension(int, int, int)>
	//  175  341:invokevirtual   #118 <Method void setMeasuredDimension(int, int)>
	//  176  344:return          
	}

	protected void setItemSpacing(int i)
	{
		itemSpacing = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #28  <Field int itemSpacing>
	//    3    5:return          
	}

	protected void setLineSpacing(int i)
	{
		lineSpacing = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #31  <Field int lineSpacing>
	//    3    5:return          
	}

	public void setSingleLine(boolean flag)
	{
		singleLine = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #35  <Field boolean singleLine>
	//    3    5:return          
	}

	private int itemSpacing;
	private int lineSpacing;
	private boolean singleLine;
}
