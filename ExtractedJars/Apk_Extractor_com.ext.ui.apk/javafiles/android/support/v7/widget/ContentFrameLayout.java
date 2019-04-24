// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v4.view.ViewCompat;
import android.util.*;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout
{
	public static interface OnAttachListener
	{

		public abstract void onAttachedFromWindow();

		public abstract void onDetachedFromWindow();
	}


	public ContentFrameLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #23  <Method void ContentFrameLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public ContentFrameLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #27  <Method void ContentFrameLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public ContentFrameLayout(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #28  <Method void FrameLayout(Context, AttributeSet, int)>
		mDecorPadding = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #30  <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #33  <Method void Rect()>
	//    9   15:putfield        #35  <Field Rect mDecorPadding>
	//   10   18:return          
	}

	public void dispatchFitSystemWindows(Rect rect)
	{
		fitSystemWindows(rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #45  <Method boolean fitSystemWindows(Rect)>
	//    3    5:pop             
	//    4    6:return          
	}

	public TypedValue getFixedHeightMajor()
	{
		if(mFixedHeightMajor == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field TypedValue mFixedHeightMajor>
	//*   2    4:ifnonnull       18
			mFixedHeightMajor = new TypedValue();
	//    3    7:aload_0         
	//    4    8:new             #52  <Class TypedValue>
	//    5   11:dup             
	//    6   12:invokespecial   #53  <Method void TypedValue()>
	//    7   15:putfield        #50  <Field TypedValue mFixedHeightMajor>
		return mFixedHeightMajor;
	//    8   18:aload_0         
	//    9   19:getfield        #50  <Field TypedValue mFixedHeightMajor>
	//   10   22:areturn         
	}

	public TypedValue getFixedHeightMinor()
	{
		if(mFixedHeightMinor == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field TypedValue mFixedHeightMinor>
	//*   2    4:ifnonnull       18
			mFixedHeightMinor = new TypedValue();
	//    3    7:aload_0         
	//    4    8:new             #52  <Class TypedValue>
	//    5   11:dup             
	//    6   12:invokespecial   #53  <Method void TypedValue()>
	//    7   15:putfield        #56  <Field TypedValue mFixedHeightMinor>
		return mFixedHeightMinor;
	//    8   18:aload_0         
	//    9   19:getfield        #56  <Field TypedValue mFixedHeightMinor>
	//   10   22:areturn         
	}

	public TypedValue getFixedWidthMajor()
	{
		if(mFixedWidthMajor == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field TypedValue mFixedWidthMajor>
	//*   2    4:ifnonnull       18
			mFixedWidthMajor = new TypedValue();
	//    3    7:aload_0         
	//    4    8:new             #52  <Class TypedValue>
	//    5   11:dup             
	//    6   12:invokespecial   #53  <Method void TypedValue()>
	//    7   15:putfield        #59  <Field TypedValue mFixedWidthMajor>
		return mFixedWidthMajor;
	//    8   18:aload_0         
	//    9   19:getfield        #59  <Field TypedValue mFixedWidthMajor>
	//   10   22:areturn         
	}

	public TypedValue getFixedWidthMinor()
	{
		if(mFixedWidthMinor == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field TypedValue mFixedWidthMinor>
	//*   2    4:ifnonnull       18
			mFixedWidthMinor = new TypedValue();
	//    3    7:aload_0         
	//    4    8:new             #52  <Class TypedValue>
	//    5   11:dup             
	//    6   12:invokespecial   #53  <Method void TypedValue()>
	//    7   15:putfield        #62  <Field TypedValue mFixedWidthMinor>
		return mFixedWidthMinor;
	//    8   18:aload_0         
	//    9   19:getfield        #62  <Field TypedValue mFixedWidthMinor>
	//   10   22:areturn         
	}

	public TypedValue getMinWidthMajor()
	{
		if(mMinWidthMajor == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field TypedValue mMinWidthMajor>
	//*   2    4:ifnonnull       18
			mMinWidthMajor = new TypedValue();
	//    3    7:aload_0         
	//    4    8:new             #52  <Class TypedValue>
	//    5   11:dup             
	//    6   12:invokespecial   #53  <Method void TypedValue()>
	//    7   15:putfield        #65  <Field TypedValue mMinWidthMajor>
		return mMinWidthMajor;
	//    8   18:aload_0         
	//    9   19:getfield        #65  <Field TypedValue mMinWidthMajor>
	//   10   22:areturn         
	}

	public TypedValue getMinWidthMinor()
	{
		if(mMinWidthMinor == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field TypedValue mMinWidthMinor>
	//*   2    4:ifnonnull       18
			mMinWidthMinor = new TypedValue();
	//    3    7:aload_0         
	//    4    8:new             #52  <Class TypedValue>
	//    5   11:dup             
	//    6   12:invokespecial   #53  <Method void TypedValue()>
	//    7   15:putfield        #68  <Field TypedValue mMinWidthMinor>
		return mMinWidthMinor;
	//    8   18:aload_0         
	//    9   19:getfield        #68  <Field TypedValue mMinWidthMinor>
	//   10   22:areturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void FrameLayout.onAttachedToWindow()>
		if(mAttachListener != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #73  <Field ContentFrameLayout$OnAttachListener mAttachListener>
	//*   4    8:ifnull          20
			mAttachListener.onAttachedFromWindow();
	//    5   11:aload_0         
	//    6   12:getfield        #73  <Field ContentFrameLayout$OnAttachListener mAttachListener>
	//    7   15:invokeinterface #76  <Method void ContentFrameLayout$OnAttachListener.onAttachedFromWindow()>
	//    8   20:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void FrameLayout.onDetachedFromWindow()>
		if(mAttachListener != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #73  <Field ContentFrameLayout$OnAttachListener mAttachListener>
	//*   4    8:ifnull          20
			mAttachListener.onDetachedFromWindow();
	//    5   11:aload_0         
	//    6   12:getfield        #73  <Field ContentFrameLayout$OnAttachListener mAttachListener>
	//    7   15:invokeinterface #80  <Method void ContentFrameLayout$OnAttachListener.onDetachedFromWindow()>
	//    8   20:return          
	}

	protected void onMeasure(int i, int j)
	{
		int k;
		boolean flag1;
		int l;
		boolean flag2;
		TypedValue typedvalue;
		DisplayMetrics displaymetrics;
		flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
		displaymetrics = getContext().getResources().getDisplayMetrics();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #86  <Method Context getContext()>
	//    4    7:invokevirtual   #92  <Method Resources Context.getResources()>
	//    5   10:invokevirtual   #98  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    6   13:astore          11
		boolean flag;
		int i1;
		int j1;
		if(displaymetrics.widthPixels < displaymetrics.heightPixels)
	//*   7   15:aload           11
	//*   8   17:getfield        #104 <Field int DisplayMetrics.widthPixels>
	//*   9   20:aload           11
	//*  10   22:getfield        #107 <Field int DisplayMetrics.heightPixels>
	//*  11   25:icmpge          347
			flag = true;
	//   12   28:iconst_1        
	//   13   29:istore          4
		else
	//*  14   31:iload_1         
	//*  15   32:invokestatic    #113 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  16   35:istore          8
	//*  17   37:iload_2         
	//*  18   38:invokestatic    #113 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  19   41:istore          9
	//*  20   43:iload           8
	//*  21   45:ldc1            #114 <Int 0x80000000>
	//*  22   47:icmpne          495
	//*  23   50:iload           4
	//*  24   52:ifeq            353
	//*  25   55:aload_0         
	//*  26   56:getfield        #62  <Field TypedValue mFixedWidthMinor>
	//*  27   59:astore          10
	//*  28   61:aload           10
	//*  29   63:ifnull          495
	//*  30   66:aload           10
	//*  31   68:getfield        #117 <Field int TypedValue.type>
	//*  32   71:ifeq            495
	//*  33   74:aload           10
	//*  34   76:getfield        #117 <Field int TypedValue.type>
	//*  35   79:iconst_5        
	//*  36   80:icmpne          362
	//*  37   83:aload           10
	//*  38   85:aload           11
	//*  39   87:invokevirtual   #121 <Method float TypedValue.getDimension(DisplayMetrics)>
	//*  40   90:f2i             
	//*  41   91:istore_3        
	//*  42   92:iload_3         
	//*  43   93:ifle            495
	//*  44   96:iload_3         
	//*  45   97:aload_0         
	//*  46   98:getfield        #35  <Field Rect mDecorPadding>
	//*  47  101:getfield        #124 <Field int Rect.left>
	//*  48  104:aload_0         
	//*  49  105:getfield        #35  <Field Rect mDecorPadding>
	//*  50  108:getfield        #127 <Field int Rect.right>
	//*  51  111:iadd            
	//*  52  112:isub            
	//*  53  113:iload_1         
	//*  54  114:invokestatic    #130 <Method int android.view.View$MeasureSpec.getSize(int)>
	//*  55  117:invokestatic    #136 <Method int Math.min(int, int)>
	//*  56  120:ldc1            #137 <Int 0x40000000>
	//*  57  122:invokestatic    #140 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//*  58  125:istore          6
	//*  59  127:iconst_1        
	//*  60  128:istore          5
	//*  61  130:iload_2         
	//*  62  131:istore_3        
	//*  63  132:iload           9
	//*  64  134:ldc1            #114 <Int 0x80000000>
	//*  65  136:icmpne          221
	//*  66  139:iload           4
	//*  67  141:ifeq            394
	//*  68  144:aload_0         
	//*  69  145:getfield        #50  <Field TypedValue mFixedHeightMajor>
	//*  70  148:astore          10
	//*  71  150:iload_2         
	//*  72  151:istore_3        
	//*  73  152:aload           10
	//*  74  154:ifnull          221
	//*  75  157:iload_2         
	//*  76  158:istore_3        
	//*  77  159:aload           10
	//*  78  161:getfield        #117 <Field int TypedValue.type>
	//*  79  164:ifeq            221
	//*  80  167:aload           10
	//*  81  169:getfield        #117 <Field int TypedValue.type>
	//*  82  172:iconst_5        
	//*  83  173:icmpne          403
	//*  84  176:aload           10
	//*  85  178:aload           11
	//*  86  180:invokevirtual   #121 <Method float TypedValue.getDimension(DisplayMetrics)>
	//*  87  183:f2i             
	//*  88  184:istore_1        
	//*  89  185:iload_2         
	//*  90  186:istore_3        
	//*  91  187:iload_1         
	//*  92  188:ifle            221
	//*  93  191:iload_1         
	//*  94  192:aload_0         
	//*  95  193:getfield        #35  <Field Rect mDecorPadding>
	//*  96  196:getfield        #143 <Field int Rect.top>
	//*  97  199:aload_0         
	//*  98  200:getfield        #35  <Field Rect mDecorPadding>
	//*  99  203:getfield        #146 <Field int Rect.bottom>
	//* 100  206:iadd            
	//* 101  207:isub            
	//* 102  208:iload_2         
	//* 103  209:invokestatic    #130 <Method int android.view.View$MeasureSpec.getSize(int)>
	//* 104  212:invokestatic    #136 <Method int Math.min(int, int)>
	//* 105  215:ldc1            #137 <Int 0x40000000>
	//* 106  217:invokestatic    #140 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 107  220:istore_3        
	//* 108  221:aload_0         
	//* 109  222:iload           6
	//* 110  224:iload_3         
	//* 111  225:invokespecial   #148 <Method void FrameLayout.onMeasure(int, int)>
	//* 112  228:aload_0         
	//* 113  229:invokevirtual   #152 <Method int getMeasuredWidth()>
	//* 114  232:istore          9
	//* 115  234:iload           9
	//* 116  236:ldc1            #137 <Int 0x40000000>
	//* 117  238:invokestatic    #140 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 118  241:istore          6
	//* 119  243:iload           5
	//* 120  245:ifne            476
	//* 121  248:iload           8
	//* 122  250:ldc1            #114 <Int 0x80000000>
	//* 123  252:icmpne          476
	//* 124  255:iload           4
	//* 125  257:ifeq            435
	//* 126  260:aload_0         
	//* 127  261:getfield        #68  <Field TypedValue mMinWidthMinor>
	//* 128  264:astore          10
	//* 129  266:aload           10
	//* 130  268:ifnull          476
	//* 131  271:aload           10
	//* 132  273:getfield        #117 <Field int TypedValue.type>
	//* 133  276:ifeq            476
	//* 134  279:aload           10
	//* 135  281:getfield        #117 <Field int TypedValue.type>
	//* 136  284:iconst_5        
	//* 137  285:icmpne          444
	//* 138  288:aload           10
	//* 139  290:aload           11
	//* 140  292:invokevirtual   #121 <Method float TypedValue.getDimension(DisplayMetrics)>
	//* 141  295:f2i             
	//* 142  296:istore_1        
	//* 143  297:iload_1         
	//* 144  298:istore_2        
	//* 145  299:iload_1         
	//* 146  300:ifle            321
	//* 147  303:iload_1         
	//* 148  304:aload_0         
	//* 149  305:getfield        #35  <Field Rect mDecorPadding>
	//* 150  308:getfield        #124 <Field int Rect.left>
	//* 151  311:aload_0         
	//* 152  312:getfield        #35  <Field Rect mDecorPadding>
	//* 153  315:getfield        #127 <Field int Rect.right>
	//* 154  318:iadd            
	//* 155  319:isub            
	//* 156  320:istore_2        
	//* 157  321:iload           9
	//* 158  323:iload_2         
	//* 159  324:icmpge          476
	//* 160  327:iload_2         
	//* 161  328:ldc1            #137 <Int 0x40000000>
	//* 162  330:invokestatic    #140 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 163  333:istore_1        
	//* 164  334:iconst_1        
	//* 165  335:istore_2        
	//* 166  336:iload_2         
	//* 167  337:ifeq            346
	//* 168  340:aload_0         
	//* 169  341:iload_1         
	//* 170  342:iload_3         
	//* 171  343:invokespecial   #148 <Method void FrameLayout.onMeasure(int, int)>
	//* 172  346:return          
			flag = false;
	//  173  347:iconst_0        
	//  174  348:istore          4
		i1 = android.view.View.MeasureSpec.getMode(i);
		j1 = android.view.View.MeasureSpec.getMode(j);
		if(i1 != 0x80000000) goto _L2; else goto _L1
_L1:
		if(flag)
			typedvalue = mFixedWidthMinor;
		else
	//* 175  350:goto            31
			typedvalue = mFixedWidthMajor;
	//  176  353:aload_0         
	//  177  354:getfield        #59  <Field TypedValue mFixedWidthMajor>
	//  178  357:astore          10
		if(typedvalue == null || typedvalue.type == 0) goto _L2; else goto _L3
_L3:
		if(typedvalue.type == 5)
			k = (int)typedvalue.getDimension(displaymetrics);
		else
	//* 179  359:goto            61
		if(typedvalue.type == 6)
	//* 180  362:aload           10
	//* 181  364:getfield        #117 <Field int TypedValue.type>
	//* 182  367:bipush          6
	//* 183  369:icmpne          504
			k = (int)typedvalue.getFraction(displaymetrics.widthPixels, displaymetrics.widthPixels);
	//  184  372:aload           10
	//  185  374:aload           11
	//  186  376:getfield        #104 <Field int DisplayMetrics.widthPixels>
	//  187  379:i2f             
	//  188  380:aload           11
	//  189  382:getfield        #104 <Field int DisplayMetrics.widthPixels>
	//  190  385:i2f             
	//  191  386:invokevirtual   #156 <Method float TypedValue.getFraction(float, float)>
	//  192  389:f2i             
	//  193  390:istore_3        
		else
	//* 194  391:goto            92
	//* 195  394:aload_0         
	//* 196  395:getfield        #56  <Field TypedValue mFixedHeightMinor>
	//* 197  398:astore          10
	//* 198  400:goto            150
	//* 199  403:aload           10
	//* 200  405:getfield        #117 <Field int TypedValue.type>
	//* 201  408:bipush          6
	//* 202  410:icmpne          490
	//* 203  413:aload           10
	//* 204  415:aload           11
	//* 205  417:getfield        #107 <Field int DisplayMetrics.heightPixels>
	//* 206  420:i2f             
	//* 207  421:aload           11
	//* 208  423:getfield        #107 <Field int DisplayMetrics.heightPixels>
	//* 209  426:i2f             
	//* 210  427:invokevirtual   #156 <Method float TypedValue.getFraction(float, float)>
	//* 211  430:f2i             
	//* 212  431:istore_1        
	//* 213  432:goto            185
	//* 214  435:aload_0         
	//* 215  436:getfield        #65  <Field TypedValue mMinWidthMajor>
	//* 216  439:astore          10
	//* 217  441:goto            266
	//* 218  444:aload           10
	//* 219  446:getfield        #117 <Field int TypedValue.type>
	//* 220  449:bipush          6
	//* 221  451:icmpne          485
	//* 222  454:aload           10
	//* 223  456:aload           11
	//* 224  458:getfield        #104 <Field int DisplayMetrics.widthPixels>
	//* 225  461:i2f             
	//* 226  462:aload           11
	//* 227  464:getfield        #104 <Field int DisplayMetrics.widthPixels>
	//* 228  467:i2f             
	//* 229  468:invokevirtual   #156 <Method float TypedValue.getFraction(float, float)>
	//* 230  471:f2i             
	//* 231  472:istore_1        
	//* 232  473:goto            297
	//* 233  476:iload           6
	//* 234  478:istore_1        
	//* 235  479:iload           7
	//* 236  481:istore_2        
	//* 237  482:goto            336
	//* 238  485:iconst_0        
	//* 239  486:istore_1        
	//* 240  487:goto            297
	//* 241  490:iconst_0        
	//* 242  491:istore_1        
	//* 243  492:goto            185
	//* 244  495:iconst_0        
	//* 245  496:istore          5
	//* 246  498:iload_1         
	//* 247  499:istore          6
	//* 248  501:goto            130
			k = 0;
	//  249  504:iconst_0        
	//  250  505:istore_3        
		if(k <= 0) goto _L2; else goto _L4
_L4:
		l = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(k - (mDecorPadding.left + mDecorPadding.right), android.view.View.MeasureSpec.getSize(i)), 0x40000000);
		flag1 = true;
_L11:
		k = j;
		if(j1 == 0x80000000)
		{
			if(flag)
				typedvalue = mFixedHeightMajor;
			else
				typedvalue = mFixedHeightMinor;
			k = j;
			if(typedvalue != null)
			{
				k = j;
				if(typedvalue.type != 0)
				{
					if(typedvalue.type == 5)
						i = (int)typedvalue.getDimension(displaymetrics);
					else
					if(typedvalue.type == 6)
						i = (int)typedvalue.getFraction(displaymetrics.heightPixels, displaymetrics.heightPixels);
					else
						i = 0;
					k = j;
					if(i > 0)
						k = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(i - (mDecorPadding.top + mDecorPadding.bottom), android.view.View.MeasureSpec.getSize(j)), 0x40000000);
				}
			}
		}
		super.onMeasure(l, k);
		j1 = getMeasuredWidth();
		l = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000);
		if(flag1 || i1 != 0x80000000) goto _L6; else goto _L5
_L5:
		if(flag)
			typedvalue = mMinWidthMinor;
		else
			typedvalue = mMinWidthMajor;
		if(typedvalue == null || typedvalue.type == 0) goto _L6; else goto _L7
_L7:
		if(typedvalue.type == 5)
			i = (int)typedvalue.getDimension(displaymetrics);
		else
		if(typedvalue.type == 6)
			i = (int)typedvalue.getFraction(displaymetrics.widthPixels, displaymetrics.widthPixels);
		else
			i = 0;
		j = i;
		if(i > 0)
			j = i - (mDecorPadding.left + mDecorPadding.right);
		if(j1 >= j) goto _L6; else goto _L8
_L8:
		i = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
		j = 1;
_L9:
		if(j != 0)
			super.onMeasure(i, k);
		return;
_L6:
		i = l;
		j = ((int) (flag2));
		if(true) goto _L9; else goto _L2
_L2:
		flag1 = false;
		l = i;
		if(true) goto _L11; else goto _L10
_L10:
	//* 251  506:goto            92
	}

	public void setAttachListener(OnAttachListener onattachlistener)
	{
		mAttachListener = onattachlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #73  <Field ContentFrameLayout$OnAttachListener mAttachListener>
	//    3    5:return          
	}

	public void setDecorPadding(int i, int j, int k, int l)
	{
		mDecorPadding.set(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Rect mDecorPadding>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #163 <Method void Rect.set(int, int, int, int)>
		if(ViewCompat.isLaidOut(((android.view.View) (this))))
	//*   7   12:aload_0         
	//*   8   13:invokestatic    #169 <Method boolean ViewCompat.isLaidOut(android.view.View)>
	//*   9   16:ifeq            23
			requestLayout();
	//   10   19:aload_0         
	//   11   20:invokevirtual   #172 <Method void requestLayout()>
	//   12   23:return          
	}

	private OnAttachListener mAttachListener;
	private final Rect mDecorPadding;
	private TypedValue mFixedHeightMajor;
	private TypedValue mFixedHeightMinor;
	private TypedValue mFixedWidthMajor;
	private TypedValue mFixedWidthMinor;
	private TypedValue mMinWidthMajor;
	private TypedValue mMinWidthMinor;
}
