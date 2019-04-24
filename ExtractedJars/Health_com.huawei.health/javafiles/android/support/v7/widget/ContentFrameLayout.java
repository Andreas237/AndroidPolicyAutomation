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
		DisplayMetrics displaymetrics = getContext().getResources().getDisplayMetrics();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #86  <Method Context getContext()>
	//    2    4:invokevirtual   #92  <Method Resources Context.getResources()>
	//    3    7:invokevirtual   #98  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    4   10:astore          11
		boolean flag;
		if(displaymetrics.widthPixels < displaymetrics.heightPixels)
	//*   5   12:aload           11
	//*   6   14:getfield        #104 <Field int DisplayMetrics.widthPixels>
	//*   7   17:aload           11
	//*   8   19:getfield        #107 <Field int DisplayMetrics.heightPixels>
	//*   9   22:icmpge          31
			flag = true;
	//   10   25:iconst_1        
	//   11   26:istore          4
		else
	//*  12   28:goto            34
			flag = false;
	//   13   31:iconst_0        
	//   14   32:istore          4
		int l1 = android.view.View.MeasureSpec.getMode(i);
	//   15   34:iload_1         
	//   16   35:invokestatic    #113 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   17   38:istore          8
		int i2 = android.view.View.MeasureSpec.getMode(j);
	//   18   40:iload_2         
	//   19   41:invokestatic    #113 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   20   44:istore          9
		int k1 = 0;
	//   21   46:iconst_0        
	//   22   47:istore          7
		boolean flag1 = ((boolean) (k1));
	//   23   49:iload           7
	//   24   51:istore          5
		int j1 = i;
	//   25   53:iload_1         
	//   26   54:istore          6
		if(l1 == 0x80000000)
	//*  27   56:iload           8
	//*  28   58:ldc1            #114 <Int 0x80000000>
	//*  29   60:icmpne          207
		{
			TypedValue typedvalue;
			if(flag)
	//*  30   63:iload           4
	//*  31   65:ifeq            77
				typedvalue = mFixedWidthMinor;
	//   32   68:aload_0         
	//   33   69:getfield        #62  <Field TypedValue mFixedWidthMinor>
	//   34   72:astore          10
			else
	//*  35   74:goto            83
				typedvalue = mFixedWidthMajor;
	//   36   77:aload_0         
	//   37   78:getfield        #59  <Field TypedValue mFixedWidthMajor>
	//   38   81:astore          10
			flag1 = ((boolean) (k1));
	//   39   83:iload           7
	//   40   85:istore          5
			j1 = i;
	//   41   87:iload_1         
	//   42   88:istore          6
			if(typedvalue != null)
	//*  43   90:aload           10
	//*  44   92:ifnull          207
			{
				flag1 = ((boolean) (k1));
	//   45   95:iload           7
	//   46   97:istore          5
				j1 = i;
	//   47   99:iload_1         
	//   48  100:istore          6
				if(typedvalue.type != 0)
	//*  49  102:aload           10
	//*  50  104:getfield        #117 <Field int TypedValue.type>
	//*  51  107:ifeq            207
				{
					int k = 0;
	//   52  110:iconst_0        
	//   53  111:istore_3        
					if(typedvalue.type == 5)
	//*  54  112:aload           10
	//*  55  114:getfield        #117 <Field int TypedValue.type>
	//*  56  117:iconst_5        
	//*  57  118:icmpne          133
						k = (int)typedvalue.getDimension(displaymetrics);
	//   58  121:aload           10
	//   59  123:aload           11
	//   60  125:invokevirtual   #121 <Method float TypedValue.getDimension(DisplayMetrics)>
	//   61  128:f2i             
	//   62  129:istore_3        
					else
	//*  63  130:goto            162
					if(typedvalue.type == 6)
	//*  64  133:aload           10
	//*  65  135:getfield        #117 <Field int TypedValue.type>
	//*  66  138:bipush          6
	//*  67  140:icmpne          162
						k = (int)typedvalue.getFraction(displaymetrics.widthPixels, displaymetrics.widthPixels);
	//   68  143:aload           10
	//   69  145:aload           11
	//   70  147:getfield        #104 <Field int DisplayMetrics.widthPixels>
	//   71  150:i2f             
	//   72  151:aload           11
	//   73  153:getfield        #104 <Field int DisplayMetrics.widthPixels>
	//   74  156:i2f             
	//   75  157:invokevirtual   #125 <Method float TypedValue.getFraction(float, float)>
	//   76  160:f2i             
	//   77  161:istore_3        
					flag1 = ((boolean) (k1));
	//   78  162:iload           7
	//   79  164:istore          5
					j1 = i;
	//   80  166:iload_1         
	//   81  167:istore          6
					if(k > 0)
	//*  82  169:iload_3         
	//*  83  170:ifle            207
					{
						j1 = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(k - (mDecorPadding.left + mDecorPadding.right), android.view.View.MeasureSpec.getSize(i)), 0x40000000);
	//   84  173:iload_3         
	//   85  174:aload_0         
	//   86  175:getfield        #35  <Field Rect mDecorPadding>
	//   87  178:getfield        #128 <Field int Rect.left>
	//   88  181:aload_0         
	//   89  182:getfield        #35  <Field Rect mDecorPadding>
	//   90  185:getfield        #131 <Field int Rect.right>
	//   91  188:iadd            
	//   92  189:isub            
	//   93  190:iload_1         
	//   94  191:invokestatic    #134 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   95  194:invokestatic    #140 <Method int Math.min(int, int)>
	//   96  197:ldc1            #141 <Int 0x40000000>
	//   97  199:invokestatic    #144 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   98  202:istore          6
						flag1 = true;
	//   99  204:iconst_1        
	//  100  205:istore          5
					}
				}
			}
		}
		int l = j;
	//  101  207:iload_2         
	//  102  208:istore_3        
		if(i2 == 0x80000000)
	//* 103  209:iload           9
	//* 104  211:ldc1            #114 <Int 0x80000000>
	//* 105  213:icmpne          341
		{
			TypedValue typedvalue1;
			if(flag)
	//* 106  216:iload           4
	//* 107  218:ifeq            230
				typedvalue1 = mFixedHeightMajor;
	//  108  221:aload_0         
	//  109  222:getfield        #50  <Field TypedValue mFixedHeightMajor>
	//  110  225:astore          10
			else
	//* 111  227:goto            236
				typedvalue1 = mFixedHeightMinor;
	//  112  230:aload_0         
	//  113  231:getfield        #56  <Field TypedValue mFixedHeightMinor>
	//  114  234:astore          10
			l = j;
	//  115  236:iload_2         
	//  116  237:istore_3        
			if(typedvalue1 != null)
	//* 117  238:aload           10
	//* 118  240:ifnull          341
			{
				l = j;
	//  119  243:iload_2         
	//  120  244:istore_3        
				if(typedvalue1.type != 0)
	//* 121  245:aload           10
	//* 122  247:getfield        #117 <Field int TypedValue.type>
	//* 123  250:ifeq            341
				{
					i = 0;
	//  124  253:iconst_0        
	//  125  254:istore_1        
					if(typedvalue1.type == 5)
	//* 126  255:aload           10
	//* 127  257:getfield        #117 <Field int TypedValue.type>
	//* 128  260:iconst_5        
	//* 129  261:icmpne          276
						i = (int)typedvalue1.getDimension(displaymetrics);
	//  130  264:aload           10
	//  131  266:aload           11
	//  132  268:invokevirtual   #121 <Method float TypedValue.getDimension(DisplayMetrics)>
	//  133  271:f2i             
	//  134  272:istore_1        
					else
	//* 135  273:goto            305
					if(typedvalue1.type == 6)
	//* 136  276:aload           10
	//* 137  278:getfield        #117 <Field int TypedValue.type>
	//* 138  281:bipush          6
	//* 139  283:icmpne          305
						i = (int)typedvalue1.getFraction(displaymetrics.heightPixels, displaymetrics.heightPixels);
	//  140  286:aload           10
	//  141  288:aload           11
	//  142  290:getfield        #107 <Field int DisplayMetrics.heightPixels>
	//  143  293:i2f             
	//  144  294:aload           11
	//  145  296:getfield        #107 <Field int DisplayMetrics.heightPixels>
	//  146  299:i2f             
	//  147  300:invokevirtual   #125 <Method float TypedValue.getFraction(float, float)>
	//  148  303:f2i             
	//  149  304:istore_1        
					l = j;
	//  150  305:iload_2         
	//  151  306:istore_3        
					if(i > 0)
	//* 152  307:iload_1         
	//* 153  308:ifle            341
						l = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(i - (mDecorPadding.top + mDecorPadding.bottom), android.view.View.MeasureSpec.getSize(j)), 0x40000000);
	//  154  311:iload_1         
	//  155  312:aload_0         
	//  156  313:getfield        #35  <Field Rect mDecorPadding>
	//  157  316:getfield        #147 <Field int Rect.top>
	//  158  319:aload_0         
	//  159  320:getfield        #35  <Field Rect mDecorPadding>
	//  160  323:getfield        #150 <Field int Rect.bottom>
	//  161  326:iadd            
	//  162  327:isub            
	//  163  328:iload_2         
	//  164  329:invokestatic    #134 <Method int android.view.View$MeasureSpec.getSize(int)>
	//  165  332:invokestatic    #140 <Method int Math.min(int, int)>
	//  166  335:ldc1            #141 <Int 0x40000000>
	//  167  337:invokestatic    #144 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  168  340:istore_3        
				}
			}
		}
		super.onMeasure(j1, l);
	//  169  341:aload_0         
	//  170  342:iload           6
	//  171  344:iload_3         
	//  172  345:invokespecial   #152 <Method void FrameLayout.onMeasure(int, int)>
		i2 = getMeasuredWidth();
	//  173  348:aload_0         
	//  174  349:invokevirtual   #156 <Method int getMeasuredWidth()>
	//  175  352:istore          9
		j1 = 0;
	//  176  354:iconst_0        
	//  177  355:istore          6
		k1 = android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x40000000);
	//  178  357:iload           9
	//  179  359:ldc1            #141 <Int 0x40000000>
	//  180  361:invokestatic    #144 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  181  364:istore          7
		j = j1;
	//  182  366:iload           6
	//  183  368:istore_2        
		i = k1;
	//  184  369:iload           7
	//  185  371:istore_1        
		if(!flag1)
	//* 186  372:iload           5
	//* 187  374:ifne            536
		{
			j = j1;
	//  188  377:iload           6
	//  189  379:istore_2        
			i = k1;
	//  190  380:iload           7
	//  191  382:istore_1        
			if(l1 == 0x80000000)
	//* 192  383:iload           8
	//* 193  385:ldc1            #114 <Int 0x80000000>
	//* 194  387:icmpne          536
			{
				TypedValue typedvalue2;
				if(flag)
	//* 195  390:iload           4
	//* 196  392:ifeq            404
					typedvalue2 = mMinWidthMinor;
	//  197  395:aload_0         
	//  198  396:getfield        #68  <Field TypedValue mMinWidthMinor>
	//  199  399:astore          10
				else
	//* 200  401:goto            410
					typedvalue2 = mMinWidthMajor;
	//  201  404:aload_0         
	//  202  405:getfield        #65  <Field TypedValue mMinWidthMajor>
	//  203  408:astore          10
				j = j1;
	//  204  410:iload           6
	//  205  412:istore_2        
				i = k1;
	//  206  413:iload           7
	//  207  415:istore_1        
				if(typedvalue2 != null)
	//* 208  416:aload           10
	//* 209  418:ifnull          536
				{
					j = j1;
	//  210  421:iload           6
	//  211  423:istore_2        
					i = k1;
	//  212  424:iload           7
	//  213  426:istore_1        
					if(typedvalue2.type != 0)
	//* 214  427:aload           10
	//* 215  429:getfield        #117 <Field int TypedValue.type>
	//* 216  432:ifeq            536
					{
						i = 0;
	//  217  435:iconst_0        
	//  218  436:istore_1        
						if(typedvalue2.type == 5)
	//* 219  437:aload           10
	//* 220  439:getfield        #117 <Field int TypedValue.type>
	//* 221  442:iconst_5        
	//* 222  443:icmpne          458
							i = (int)typedvalue2.getDimension(displaymetrics);
	//  223  446:aload           10
	//  224  448:aload           11
	//  225  450:invokevirtual   #121 <Method float TypedValue.getDimension(DisplayMetrics)>
	//  226  453:f2i             
	//  227  454:istore_1        
						else
	//* 228  455:goto            487
						if(typedvalue2.type == 6)
	//* 229  458:aload           10
	//* 230  460:getfield        #117 <Field int TypedValue.type>
	//* 231  463:bipush          6
	//* 232  465:icmpne          487
							i = (int)typedvalue2.getFraction(displaymetrics.widthPixels, displaymetrics.widthPixels);
	//  233  468:aload           10
	//  234  470:aload           11
	//  235  472:getfield        #104 <Field int DisplayMetrics.widthPixels>
	//  236  475:i2f             
	//  237  476:aload           11
	//  238  478:getfield        #104 <Field int DisplayMetrics.widthPixels>
	//  239  481:i2f             
	//  240  482:invokevirtual   #125 <Method float TypedValue.getFraction(float, float)>
	//  241  485:f2i             
	//  242  486:istore_1        
						int i1 = i;
	//  243  487:iload_1         
	//  244  488:istore          4
						if(i > 0)
	//* 245  490:iload_1         
	//* 246  491:ifle            513
							i1 = i - (mDecorPadding.left + mDecorPadding.right);
	//  247  494:iload_1         
	//  248  495:aload_0         
	//  249  496:getfield        #35  <Field Rect mDecorPadding>
	//  250  499:getfield        #128 <Field int Rect.left>
	//  251  502:aload_0         
	//  252  503:getfield        #35  <Field Rect mDecorPadding>
	//  253  506:getfield        #131 <Field int Rect.right>
	//  254  509:iadd            
	//  255  510:isub            
	//  256  511:istore          4
						j = j1;
	//  257  513:iload           6
	//  258  515:istore_2        
						i = k1;
	//  259  516:iload           7
	//  260  518:istore_1        
						if(i2 < i1)
	//* 261  519:iload           9
	//* 262  521:iload           4
	//* 263  523:icmpge          536
						{
							i = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
	//  264  526:iload           4
	//  265  528:ldc1            #141 <Int 0x40000000>
	//  266  530:invokestatic    #144 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  267  533:istore_1        
							j = 1;
	//  268  534:iconst_1        
	//  269  535:istore_2        
						}
					}
				}
			}
		}
		if(j != 0)
	//* 270  536:iload_2         
	//* 271  537:ifeq            546
			super.onMeasure(i, l);
	//  272  540:aload_0         
	//  273  541:iload_1         
	//  274  542:iload_3         
	//  275  543:invokespecial   #152 <Method void FrameLayout.onMeasure(int, int)>
	//  276  546:return          
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
