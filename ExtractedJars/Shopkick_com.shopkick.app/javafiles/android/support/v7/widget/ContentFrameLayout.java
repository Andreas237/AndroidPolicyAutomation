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
	//    3    3:invokespecial   #27  <Method void ContentFrameLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public ContentFrameLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #31  <Method void ContentFrameLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public ContentFrameLayout(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #32  <Method void FrameLayout(Context, AttributeSet, int)>
		mDecorPadding = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #34  <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #37  <Method void Rect()>
	//    9   15:putfield        #39  <Field Rect mDecorPadding>
	//   10   18:return          
	}

	public void dispatchFitSystemWindows(Rect rect)
	{
		fitSystemWindows(rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #46  <Method boolean fitSystemWindows(Rect)>
	//    3    5:pop             
	//    4    6:return          
	}

	public TypedValue getFixedHeightMajor()
	{
		if(mFixedHeightMajor == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field TypedValue mFixedHeightMajor>
	//*   2    4:ifnonnull       18
			mFixedHeightMajor = new TypedValue();
	//    3    7:aload_0         
	//    4    8:new             #53  <Class TypedValue>
	//    5   11:dup             
	//    6   12:invokespecial   #54  <Method void TypedValue()>
	//    7   15:putfield        #51  <Field TypedValue mFixedHeightMajor>
		return mFixedHeightMajor;
	//    8   18:aload_0         
	//    9   19:getfield        #51  <Field TypedValue mFixedHeightMajor>
	//   10   22:areturn         
	}

	public TypedValue getFixedHeightMinor()
	{
		if(mFixedHeightMinor == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field TypedValue mFixedHeightMinor>
	//*   2    4:ifnonnull       18
			mFixedHeightMinor = new TypedValue();
	//    3    7:aload_0         
	//    4    8:new             #53  <Class TypedValue>
	//    5   11:dup             
	//    6   12:invokespecial   #54  <Method void TypedValue()>
	//    7   15:putfield        #57  <Field TypedValue mFixedHeightMinor>
		return mFixedHeightMinor;
	//    8   18:aload_0         
	//    9   19:getfield        #57  <Field TypedValue mFixedHeightMinor>
	//   10   22:areturn         
	}

	public TypedValue getFixedWidthMajor()
	{
		if(mFixedWidthMajor == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field TypedValue mFixedWidthMajor>
	//*   2    4:ifnonnull       18
			mFixedWidthMajor = new TypedValue();
	//    3    7:aload_0         
	//    4    8:new             #53  <Class TypedValue>
	//    5   11:dup             
	//    6   12:invokespecial   #54  <Method void TypedValue()>
	//    7   15:putfield        #60  <Field TypedValue mFixedWidthMajor>
		return mFixedWidthMajor;
	//    8   18:aload_0         
	//    9   19:getfield        #60  <Field TypedValue mFixedWidthMajor>
	//   10   22:areturn         
	}

	public TypedValue getFixedWidthMinor()
	{
		if(mFixedWidthMinor == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field TypedValue mFixedWidthMinor>
	//*   2    4:ifnonnull       18
			mFixedWidthMinor = new TypedValue();
	//    3    7:aload_0         
	//    4    8:new             #53  <Class TypedValue>
	//    5   11:dup             
	//    6   12:invokespecial   #54  <Method void TypedValue()>
	//    7   15:putfield        #63  <Field TypedValue mFixedWidthMinor>
		return mFixedWidthMinor;
	//    8   18:aload_0         
	//    9   19:getfield        #63  <Field TypedValue mFixedWidthMinor>
	//   10   22:areturn         
	}

	public TypedValue getMinWidthMajor()
	{
		if(mMinWidthMajor == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field TypedValue mMinWidthMajor>
	//*   2    4:ifnonnull       18
			mMinWidthMajor = new TypedValue();
	//    3    7:aload_0         
	//    4    8:new             #53  <Class TypedValue>
	//    5   11:dup             
	//    6   12:invokespecial   #54  <Method void TypedValue()>
	//    7   15:putfield        #66  <Field TypedValue mMinWidthMajor>
		return mMinWidthMajor;
	//    8   18:aload_0         
	//    9   19:getfield        #66  <Field TypedValue mMinWidthMajor>
	//   10   22:areturn         
	}

	public TypedValue getMinWidthMinor()
	{
		if(mMinWidthMinor == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field TypedValue mMinWidthMinor>
	//*   2    4:ifnonnull       18
			mMinWidthMinor = new TypedValue();
	//    3    7:aload_0         
	//    4    8:new             #53  <Class TypedValue>
	//    5   11:dup             
	//    6   12:invokespecial   #54  <Method void TypedValue()>
	//    7   15:putfield        #69  <Field TypedValue mMinWidthMinor>
		return mMinWidthMinor;
	//    8   18:aload_0         
	//    9   19:getfield        #69  <Field TypedValue mMinWidthMinor>
	//   10   22:areturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void FrameLayout.onAttachedToWindow()>
		OnAttachListener onattachlistener = mAttachListener;
	//    2    4:aload_0         
	//    3    5:getfield        #74  <Field ContentFrameLayout$OnAttachListener mAttachListener>
	//    4    8:astore_1        
		if(onattachlistener != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          19
			onattachlistener.onAttachedFromWindow();
	//    7   13:aload_1         
	//    8   14:invokeinterface #77  <Method void ContentFrameLayout$OnAttachListener.onAttachedFromWindow()>
	//    9   19:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method void FrameLayout.onDetachedFromWindow()>
		OnAttachListener onattachlistener = mAttachListener;
	//    2    4:aload_0         
	//    3    5:getfield        #74  <Field ContentFrameLayout$OnAttachListener mAttachListener>
	//    4    8:astore_1        
		if(onattachlistener != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          19
			onattachlistener.onDetachedFromWindow();
	//    7   13:aload_1         
	//    8   14:invokeinterface #81  <Method void ContentFrameLayout$OnAttachListener.onDetachedFromWindow()>
	//    9   19:return          
	}

	protected void onMeasure(int i, int j)
	{
		boolean flag;
		boolean flag1;
		int k1;
		boolean flag2;
		int l1;
		int i2;
		DisplayMetrics displaymetrics;
label0:
		{
			displaymetrics = getContext().getResources().getDisplayMetrics();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #87  <Method Context getContext()>
	//    2    4:invokevirtual   #93  <Method Resources Context.getResources()>
	//    3    7:invokevirtual   #99  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    4   10:astore          11
			int k = displaymetrics.widthPixels;
	//    5   12:aload           11
	//    6   14:getfield        #105 <Field int DisplayMetrics.widthPixels>
	//    7   17:istore_3        
			int j1 = displaymetrics.heightPixels;
	//    8   18:aload           11
	//    9   20:getfield        #108 <Field int DisplayMetrics.heightPixels>
	//   10   23:istore          4
			flag2 = true;
	//   11   25:iconst_1        
	//   12   26:istore          7
			if(k < j1)
	//*  13   28:iload_3         
	//*  14   29:iload           4
	//*  15   31:icmpge          40
				flag = true;
	//   16   34:iconst_1        
	//   17   35:istore          4
			else
	//*  18   37:goto            43
				flag = false;
	//   19   40:iconst_0        
	//   20   41:istore          4
			l1 = android.view.View.MeasureSpec.getMode(i);
	//   21   43:iload_1         
	//   22   44:invokestatic    #114 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   23   47:istore          8
			i2 = android.view.View.MeasureSpec.getMode(j);
	//   24   49:iload_2         
	//   25   50:invokestatic    #114 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   26   53:istore          9
			if(l1 == 0x80000000)
	//*  27   55:iload           8
	//*  28   57:ldc1            #115 <Int 0x80000000>
	//*  29   59:icmpne          191
			{
				TypedValue typedvalue;
				if(flag)
	//*  30   62:iload           4
	//*  31   64:ifeq            76
					typedvalue = mFixedWidthMinor;
	//   32   67:aload_0         
	//   33   68:getfield        #63  <Field TypedValue mFixedWidthMinor>
	//   34   71:astore          10
				else
	//*  35   73:goto            82
					typedvalue = mFixedWidthMajor;
	//   36   76:aload_0         
	//   37   77:getfield        #60  <Field TypedValue mFixedWidthMajor>
	//   38   80:astore          10
				if(typedvalue != null && typedvalue.type != 0)
	//*  39   82:aload           10
	//*  40   84:ifnull          191
	//*  41   87:aload           10
	//*  42   89:getfield        #118 <Field int TypedValue.type>
	//*  43   92:ifeq            191
				{
					int l;
					if(typedvalue.type == 5)
	//*  44   95:aload           10
	//*  45   97:getfield        #118 <Field int TypedValue.type>
	//*  46  100:iconst_5        
	//*  47  101:icmpne          116
						l = (int)typedvalue.getDimension(displaymetrics);
	//   48  104:aload           10
	//   49  106:aload           11
	//   50  108:invokevirtual   #122 <Method float TypedValue.getDimension(DisplayMetrics)>
	//   51  111:f2i             
	//   52  112:istore_3        
					else
	//*  53  113:goto            150
					if(typedvalue.type == 6)
	//*  54  116:aload           10
	//*  55  118:getfield        #118 <Field int TypedValue.type>
	//*  56  121:bipush          6
	//*  57  123:icmpne          148
						l = (int)typedvalue.getFraction(displaymetrics.widthPixels, displaymetrics.widthPixels);
	//   58  126:aload           10
	//   59  128:aload           11
	//   60  130:getfield        #105 <Field int DisplayMetrics.widthPixels>
	//   61  133:i2f             
	//   62  134:aload           11
	//   63  136:getfield        #105 <Field int DisplayMetrics.widthPixels>
	//   64  139:i2f             
	//   65  140:invokevirtual   #126 <Method float TypedValue.getFraction(float, float)>
	//   66  143:f2i             
	//   67  144:istore_3        
					else
	//*  68  145:goto            150
						l = 0;
	//   69  148:iconst_0        
	//   70  149:istore_3        
					if(l > 0)
	//*  71  150:iload_3         
	//*  72  151:ifle            191
					{
						k1 = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(l - (mDecorPadding.left + mDecorPadding.right), android.view.View.MeasureSpec.getSize(i)), 0x40000000);
	//   73  154:iload_3         
	//   74  155:aload_0         
	//   75  156:getfield        #39  <Field Rect mDecorPadding>
	//   76  159:getfield        #129 <Field int Rect.left>
	//   77  162:aload_0         
	//   78  163:getfield        #39  <Field Rect mDecorPadding>
	//   79  166:getfield        #132 <Field int Rect.right>
	//   80  169:iadd            
	//   81  170:isub            
	//   82  171:iload_1         
	//   83  172:invokestatic    #135 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   84  175:invokestatic    #141 <Method int Math.min(int, int)>
	//   85  178:ldc1            #142 <Int 0x40000000>
	//   86  180:invokestatic    #145 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   87  183:istore          6
						flag1 = true;
	//   88  185:iconst_1        
	//   89  186:istore          5
						break label0;
	//   90  188:goto            197
					}
				}
			}
			flag1 = false;
	//   91  191:iconst_0        
	//   92  192:istore          5
			k1 = i;
	//   93  194:iload_1         
	//   94  195:istore          6
		}
		int i1;
label1:
		{
			i1 = j;
	//   95  197:iload_2         
	//   96  198:istore_3        
			if(i2 == 0x80000000)
	//*  97  199:iload           9
	//*  98  201:ldc1            #115 <Int 0x80000000>
	//*  99  203:icmpne          334
			{
				TypedValue typedvalue1;
				if(flag)
	//* 100  206:iload           4
	//* 101  208:ifeq            220
					typedvalue1 = mFixedHeightMajor;
	//  102  211:aload_0         
	//  103  212:getfield        #51  <Field TypedValue mFixedHeightMajor>
	//  104  215:astore          10
				else
	//* 105  217:goto            226
					typedvalue1 = mFixedHeightMinor;
	//  106  220:aload_0         
	//  107  221:getfield        #57  <Field TypedValue mFixedHeightMinor>
	//  108  224:astore          10
				i1 = j;
	//  109  226:iload_2         
	//  110  227:istore_3        
				if(typedvalue1 != null)
	//* 111  228:aload           10
	//* 112  230:ifnull          334
				{
					i1 = j;
	//  113  233:iload_2         
	//  114  234:istore_3        
					if(typedvalue1.type != 0)
	//* 115  235:aload           10
	//* 116  237:getfield        #118 <Field int TypedValue.type>
	//* 117  240:ifeq            334
					{
						if(typedvalue1.type == 5)
	//* 118  243:aload           10
	//* 119  245:getfield        #118 <Field int TypedValue.type>
	//* 120  248:iconst_5        
	//* 121  249:icmpne          264
							i = (int)typedvalue1.getDimension(displaymetrics);
	//  122  252:aload           10
	//  123  254:aload           11
	//  124  256:invokevirtual   #122 <Method float TypedValue.getDimension(DisplayMetrics)>
	//  125  259:f2i             
	//  126  260:istore_1        
						else
	//* 127  261:goto            298
						if(typedvalue1.type == 6)
	//* 128  264:aload           10
	//* 129  266:getfield        #118 <Field int TypedValue.type>
	//* 130  269:bipush          6
	//* 131  271:icmpne          296
							i = (int)typedvalue1.getFraction(displaymetrics.heightPixels, displaymetrics.heightPixels);
	//  132  274:aload           10
	//  133  276:aload           11
	//  134  278:getfield        #108 <Field int DisplayMetrics.heightPixels>
	//  135  281:i2f             
	//  136  282:aload           11
	//  137  284:getfield        #108 <Field int DisplayMetrics.heightPixels>
	//  138  287:i2f             
	//  139  288:invokevirtual   #126 <Method float TypedValue.getFraction(float, float)>
	//  140  291:f2i             
	//  141  292:istore_1        
						else
	//* 142  293:goto            298
							i = 0;
	//  143  296:iconst_0        
	//  144  297:istore_1        
						i1 = j;
	//  145  298:iload_2         
	//  146  299:istore_3        
						if(i > 0)
	//* 147  300:iload_1         
	//* 148  301:ifle            334
							i1 = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(i - (mDecorPadding.top + mDecorPadding.bottom), android.view.View.MeasureSpec.getSize(j)), 0x40000000);
	//  149  304:iload_1         
	//  150  305:aload_0         
	//  151  306:getfield        #39  <Field Rect mDecorPadding>
	//  152  309:getfield        #148 <Field int Rect.top>
	//  153  312:aload_0         
	//  154  313:getfield        #39  <Field Rect mDecorPadding>
	//  155  316:getfield        #151 <Field int Rect.bottom>
	//  156  319:iadd            
	//  157  320:isub            
	//  158  321:iload_2         
	//  159  322:invokestatic    #135 <Method int android.view.View$MeasureSpec.getSize(int)>
	//  160  325:invokestatic    #141 <Method int Math.min(int, int)>
	//  161  328:ldc1            #142 <Int 0x40000000>
	//  162  330:invokestatic    #145 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  163  333:istore_3        
					}
				}
			}
			super.onMeasure(k1, i1);
	//  164  334:aload_0         
	//  165  335:iload           6
	//  166  337:iload_3         
	//  167  338:invokespecial   #153 <Method void FrameLayout.onMeasure(int, int)>
			i2 = getMeasuredWidth();
	//  168  341:aload_0         
	//  169  342:invokevirtual   #157 <Method int getMeasuredWidth()>
	//  170  345:istore          9
			k1 = android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x40000000);
	//  171  347:iload           9
	//  172  349:ldc1            #142 <Int 0x40000000>
	//  173  351:invokestatic    #145 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  174  354:istore          6
			if(!flag1 && l1 == 0x80000000)
	//* 175  356:iload           5
	//* 176  358:ifne            499
	//* 177  361:iload           8
	//* 178  363:ldc1            #115 <Int 0x80000000>
	//* 179  365:icmpne          499
			{
				TypedValue typedvalue2;
				if(flag)
	//* 180  368:iload           4
	//* 181  370:ifeq            382
					typedvalue2 = mMinWidthMinor;
	//  182  373:aload_0         
	//  183  374:getfield        #69  <Field TypedValue mMinWidthMinor>
	//  184  377:astore          10
				else
	//* 185  379:goto            388
					typedvalue2 = mMinWidthMajor;
	//  186  382:aload_0         
	//  187  383:getfield        #66  <Field TypedValue mMinWidthMajor>
	//  188  386:astore          10
				if(typedvalue2 != null && typedvalue2.type != 0)
	//* 189  388:aload           10
	//* 190  390:ifnull          499
	//* 191  393:aload           10
	//* 192  395:getfield        #118 <Field int TypedValue.type>
	//* 193  398:ifeq            499
				{
					if(typedvalue2.type == 5)
	//* 194  401:aload           10
	//* 195  403:getfield        #118 <Field int TypedValue.type>
	//* 196  406:iconst_5        
	//* 197  407:icmpne          422
						i = (int)typedvalue2.getDimension(displaymetrics);
	//  198  410:aload           10
	//  199  412:aload           11
	//  200  414:invokevirtual   #122 <Method float TypedValue.getDimension(DisplayMetrics)>
	//  201  417:f2i             
	//  202  418:istore_1        
					else
	//* 203  419:goto            456
					if(typedvalue2.type == 6)
	//* 204  422:aload           10
	//* 205  424:getfield        #118 <Field int TypedValue.type>
	//* 206  427:bipush          6
	//* 207  429:icmpne          454
						i = (int)typedvalue2.getFraction(displaymetrics.widthPixels, displaymetrics.widthPixels);
	//  208  432:aload           10
	//  209  434:aload           11
	//  210  436:getfield        #105 <Field int DisplayMetrics.widthPixels>
	//  211  439:i2f             
	//  212  440:aload           11
	//  213  442:getfield        #105 <Field int DisplayMetrics.widthPixels>
	//  214  445:i2f             
	//  215  446:invokevirtual   #126 <Method float TypedValue.getFraction(float, float)>
	//  216  449:f2i             
	//  217  450:istore_1        
					else
	//* 218  451:goto            456
						i = 0;
	//  219  454:iconst_0        
	//  220  455:istore_1        
					j = i;
	//  221  456:iload_1         
	//  222  457:istore_2        
					if(i > 0)
	//* 223  458:iload_1         
	//* 224  459:ifle            480
						j = i - (mDecorPadding.left + mDecorPadding.right);
	//  225  462:iload_1         
	//  226  463:aload_0         
	//  227  464:getfield        #39  <Field Rect mDecorPadding>
	//  228  467:getfield        #129 <Field int Rect.left>
	//  229  470:aload_0         
	//  230  471:getfield        #39  <Field Rect mDecorPadding>
	//  231  474:getfield        #132 <Field int Rect.right>
	//  232  477:iadd            
	//  233  478:isub            
	//  234  479:istore_2        
					if(i2 < j)
	//* 235  480:iload           9
	//* 236  482:iload_2         
	//* 237  483:icmpge          499
					{
						j = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
	//  238  486:iload_2         
	//  239  487:ldc1            #142 <Int 0x40000000>
	//  240  489:invokestatic    #145 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  241  492:istore_2        
						i = ((int) (flag2));
	//  242  493:iload           7
	//  243  495:istore_1        
						break label1;
	//  244  496:goto            504
					}
				}
			}
			i = 0;
	//  245  499:iconst_0        
	//  246  500:istore_1        
			j = k1;
	//  247  501:iload           6
	//  248  503:istore_2        
		}
		if(i != 0)
	//* 249  504:iload_1         
	//* 250  505:ifeq            514
			super.onMeasure(j, i1);
	//  251  508:aload_0         
	//  252  509:iload_2         
	//  253  510:iload_3         
	//  254  511:invokespecial   #153 <Method void FrameLayout.onMeasure(int, int)>
	//  255  514:return          
	}

	public void setAttachListener(OnAttachListener onattachlistener)
	{
		mAttachListener = onattachlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #74  <Field ContentFrameLayout$OnAttachListener mAttachListener>
	//    3    5:return          
	}

	public void setDecorPadding(int i, int j, int k, int l)
	{
		mDecorPadding.set(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Rect mDecorPadding>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #164 <Method void Rect.set(int, int, int, int)>
		if(ViewCompat.isLaidOut(((android.view.View) (this))))
	//*   7   12:aload_0         
	//*   8   13:invokestatic    #170 <Method boolean ViewCompat.isLaidOut(android.view.View)>
	//*   9   16:ifeq            23
			requestLayout();
	//   10   19:aload_0         
	//   11   20:invokevirtual   #173 <Method void requestLayout()>
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
