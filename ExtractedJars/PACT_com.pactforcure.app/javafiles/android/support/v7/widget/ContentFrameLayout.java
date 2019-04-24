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
		int l;
		boolean flag;
		int i1;
		int j1;
		int k1;
		int l1;
		TypedValue typedvalue;
		if(displaymetrics.widthPixels < displaymetrics.heightPixels)
	//*   5   12:aload           11
	//*   6   14:getfield        #104 <Field int DisplayMetrics.widthPixels>
	//*   7   17:aload           11
	//*   8   19:getfield        #107 <Field int DisplayMetrics.heightPixels>
	//*   9   22:icmpge          418
			l = 1;
	//   10   25:iconst_1        
	//   11   26:istore          4
		else
	//*  12   28:iload_1         
	//*  13   29:invokestatic    #113 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  14   32:istore          8
	//*  15   34:iload_2         
	//*  16   35:invokestatic    #113 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  17   38:istore          9
	//*  18   40:iconst_0        
	//*  19   41:istore          7
	//*  20   43:iload           7
	//*  21   45:istore          5
	//*  22   47:iload_1         
	//*  23   48:istore          6
	//*  24   50:iload           8
	//*  25   52:ldc1            #114 <Int 0x80000000>
	//*  26   54:icmpne          160
	//*  27   57:iload           4
	//*  28   59:ifeq            424
	//*  29   62:aload_0         
	//*  30   63:getfield        #62  <Field TypedValue mFixedWidthMinor>
	//*  31   66:astore          10
	//*  32   68:iload           7
	//*  33   70:istore          5
	//*  34   72:iload_1         
	//*  35   73:istore          6
	//*  36   75:aload           10
	//*  37   77:ifnull          160
	//*  38   80:iload           7
	//*  39   82:istore          5
	//*  40   84:iload_1         
	//*  41   85:istore          6
	//*  42   87:aload           10
	//*  43   89:getfield        #117 <Field int TypedValue.type>
	//*  44   92:ifeq            160
	//*  45   95:iconst_0        
	//*  46   96:istore_3        
	//*  47   97:aload           10
	//*  48   99:getfield        #117 <Field int TypedValue.type>
	//*  49  102:iconst_5        
	//*  50  103:icmpne          433
	//*  51  106:aload           10
	//*  52  108:aload           11
	//*  53  110:invokevirtual   #121 <Method float TypedValue.getDimension(DisplayMetrics)>
	//*  54  113:f2i             
	//*  55  114:istore_3        
	//*  56  115:iload           7
	//*  57  117:istore          5
	//*  58  119:iload_1         
	//*  59  120:istore          6
	//*  60  122:iload_3         
	//*  61  123:ifle            160
	//*  62  126:iload_3         
	//*  63  127:aload_0         
	//*  64  128:getfield        #35  <Field Rect mDecorPadding>
	//*  65  131:getfield        #124 <Field int Rect.left>
	//*  66  134:aload_0         
	//*  67  135:getfield        #35  <Field Rect mDecorPadding>
	//*  68  138:getfield        #127 <Field int Rect.right>
	//*  69  141:iadd            
	//*  70  142:isub            
	//*  71  143:iload_1         
	//*  72  144:invokestatic    #130 <Method int android.view.View$MeasureSpec.getSize(int)>
	//*  73  147:invokestatic    #136 <Method int Math.min(int, int)>
	//*  74  150:ldc1            #137 <Int 0x40000000>
	//*  75  152:invokestatic    #140 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//*  76  155:istore          6
	//*  77  157:iconst_1        
	//*  78  158:istore          5
	//*  79  160:iload_2         
	//*  80  161:istore_3        
	//*  81  162:iload           9
	//*  82  164:ldc1            #114 <Int 0x80000000>
	//*  83  166:icmpne          253
	//*  84  169:iload           4
	//*  85  171:ifeq            465
	//*  86  174:aload_0         
	//*  87  175:getfield        #50  <Field TypedValue mFixedHeightMajor>
	//*  88  178:astore          10
	//*  89  180:iload_2         
	//*  90  181:istore_3        
	//*  91  182:aload           10
	//*  92  184:ifnull          253
	//*  93  187:iload_2         
	//*  94  188:istore_3        
	//*  95  189:aload           10
	//*  96  191:getfield        #117 <Field int TypedValue.type>
	//*  97  194:ifeq            253
	//*  98  197:iconst_0        
	//*  99  198:istore_1        
	//* 100  199:aload           10
	//* 101  201:getfield        #117 <Field int TypedValue.type>
	//* 102  204:iconst_5        
	//* 103  205:icmpne          474
	//* 104  208:aload           10
	//* 105  210:aload           11
	//* 106  212:invokevirtual   #121 <Method float TypedValue.getDimension(DisplayMetrics)>
	//* 107  215:f2i             
	//* 108  216:istore_1        
	//* 109  217:iload_2         
	//* 110  218:istore_3        
	//* 111  219:iload_1         
	//* 112  220:ifle            253
	//* 113  223:iload_1         
	//* 114  224:aload_0         
	//* 115  225:getfield        #35  <Field Rect mDecorPadding>
	//* 116  228:getfield        #143 <Field int Rect.top>
	//* 117  231:aload_0         
	//* 118  232:getfield        #35  <Field Rect mDecorPadding>
	//* 119  235:getfield        #146 <Field int Rect.bottom>
	//* 120  238:iadd            
	//* 121  239:isub            
	//* 122  240:iload_2         
	//* 123  241:invokestatic    #130 <Method int android.view.View$MeasureSpec.getSize(int)>
	//* 124  244:invokestatic    #136 <Method int Math.min(int, int)>
	//* 125  247:ldc1            #137 <Int 0x40000000>
	//* 126  249:invokestatic    #140 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 127  252:istore_3        
	//* 128  253:aload_0         
	//* 129  254:iload           6
	//* 130  256:iload_3         
	//* 131  257:invokespecial   #148 <Method void FrameLayout.onMeasure(int, int)>
	//* 132  260:aload_0         
	//* 133  261:invokevirtual   #152 <Method int getMeasuredWidth()>
	//* 134  264:istore          9
	//* 135  266:iconst_0        
	//* 136  267:istore          6
	//* 137  269:iload           9
	//* 138  271:ldc1            #137 <Int 0x40000000>
	//* 139  273:invokestatic    #140 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 140  276:istore          7
	//* 141  278:iload           6
	//* 142  280:istore_2        
	//* 143  281:iload           7
	//* 144  283:istore_1        
	//* 145  284:iload           5
	//* 146  286:ifne            407
	//* 147  289:iload           6
	//* 148  291:istore_2        
	//* 149  292:iload           7
	//* 150  294:istore_1        
	//* 151  295:iload           8
	//* 152  297:ldc1            #114 <Int 0x80000000>
	//* 153  299:icmpne          407
	//* 154  302:iload           4
	//* 155  304:ifeq            506
	//* 156  307:aload_0         
	//* 157  308:getfield        #68  <Field TypedValue mMinWidthMinor>
	//* 158  311:astore          10
	//* 159  313:iload           6
	//* 160  315:istore_2        
	//* 161  316:iload           7
	//* 162  318:istore_1        
	//* 163  319:aload           10
	//* 164  321:ifnull          407
	//* 165  324:iload           6
	//* 166  326:istore_2        
	//* 167  327:iload           7
	//* 168  329:istore_1        
	//* 169  330:aload           10
	//* 170  332:getfield        #117 <Field int TypedValue.type>
	//* 171  335:ifeq            407
	//* 172  338:iconst_0        
	//* 173  339:istore_1        
	//* 174  340:aload           10
	//* 175  342:getfield        #117 <Field int TypedValue.type>
	//* 176  345:iconst_5        
	//* 177  346:icmpne          515
	//* 178  349:aload           10
	//* 179  351:aload           11
	//* 180  353:invokevirtual   #121 <Method float TypedValue.getDimension(DisplayMetrics)>
	//* 181  356:f2i             
	//* 182  357:istore_1        
	//* 183  358:iload_1         
	//* 184  359:istore          4
	//* 185  361:iload_1         
	//* 186  362:ifle            384
	//* 187  365:iload_1         
	//* 188  366:aload_0         
	//* 189  367:getfield        #35  <Field Rect mDecorPadding>
	//* 190  370:getfield        #124 <Field int Rect.left>
	//* 191  373:aload_0         
	//* 192  374:getfield        #35  <Field Rect mDecorPadding>
	//* 193  377:getfield        #127 <Field int Rect.right>
	//* 194  380:iadd            
	//* 195  381:isub            
	//* 196  382:istore          4
	//* 197  384:iload           6
	//* 198  386:istore_2        
	//* 199  387:iload           7
	//* 200  389:istore_1        
	//* 201  390:iload           9
	//* 202  392:iload           4
	//* 203  394:icmpge          407
	//* 204  397:iload           4
	//* 205  399:ldc1            #137 <Int 0x40000000>
	//* 206  401:invokestatic    #140 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 207  404:istore_1        
	//* 208  405:iconst_1        
	//* 209  406:istore_2        
	//* 210  407:iload_2         
	//* 211  408:ifeq            417
	//* 212  411:aload_0         
	//* 213  412:iload_1         
	//* 214  413:iload_3         
	//* 215  414:invokespecial   #148 <Method void FrameLayout.onMeasure(int, int)>
	//* 216  417:return          
			l = 0;
	//  217  418:iconst_0        
	//  218  419:istore          4
		k1 = android.view.View.MeasureSpec.getMode(i);
		l1 = android.view.View.MeasureSpec.getMode(j);
		j1 = 0;
		flag = ((boolean) (j1));
		i1 = i;
		if(k1 == 0x80000000)
		{
			if(l != 0)
				typedvalue = mFixedWidthMinor;
			else
	//* 219  421:goto            28
				typedvalue = mFixedWidthMajor;
	//  220  424:aload_0         
	//  221  425:getfield        #59  <Field TypedValue mFixedWidthMajor>
	//  222  428:astore          10
			flag = ((boolean) (j1));
			i1 = i;
			if(typedvalue != null)
			{
				flag = ((boolean) (j1));
				i1 = i;
				if(typedvalue.type != 0)
				{
					int k = 0;
					if(typedvalue.type == 5)
						k = (int)typedvalue.getDimension(displaymetrics);
					else
	//* 223  430:goto            68
					if(typedvalue.type == 6)
	//* 224  433:aload           10
	//* 225  435:getfield        #117 <Field int TypedValue.type>
	//* 226  438:bipush          6
	//* 227  440:icmpne          115
						k = (int)typedvalue.getFraction(displaymetrics.widthPixels, displaymetrics.widthPixels);
	//  228  443:aload           10
	//  229  445:aload           11
	//  230  447:getfield        #104 <Field int DisplayMetrics.widthPixels>
	//  231  450:i2f             
	//  232  451:aload           11
	//  233  453:getfield        #104 <Field int DisplayMetrics.widthPixels>
	//  234  456:i2f             
	//  235  457:invokevirtual   #156 <Method float TypedValue.getFraction(float, float)>
	//  236  460:f2i             
	//  237  461:istore_3        
					flag = ((boolean) (j1));
					i1 = i;
					if(k > 0)
					{
						i1 = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(k - (mDecorPadding.left + mDecorPadding.right), android.view.View.MeasureSpec.getSize(i)), 0x40000000);
						flag = true;
					}
				}
			}
		}
		k = j;
		if(l1 == 0x80000000)
		{
			if(l != 0)
				typedvalue = mFixedHeightMajor;
			else
	//* 238  462:goto            115
				typedvalue = mFixedHeightMinor;
	//  239  465:aload_0         
	//  240  466:getfield        #56  <Field TypedValue mFixedHeightMinor>
	//  241  469:astore          10
			k = j;
			if(typedvalue != null)
			{
				k = j;
				if(typedvalue.type != 0)
				{
					i = 0;
					if(typedvalue.type == 5)
						i = (int)typedvalue.getDimension(displaymetrics);
					else
	//* 242  471:goto            180
					if(typedvalue.type == 6)
	//* 243  474:aload           10
	//* 244  476:getfield        #117 <Field int TypedValue.type>
	//* 245  479:bipush          6
	//* 246  481:icmpne          217
						i = (int)typedvalue.getFraction(displaymetrics.heightPixels, displaymetrics.heightPixels);
	//  247  484:aload           10
	//  248  486:aload           11
	//  249  488:getfield        #107 <Field int DisplayMetrics.heightPixels>
	//  250  491:i2f             
	//  251  492:aload           11
	//  252  494:getfield        #107 <Field int DisplayMetrics.heightPixels>
	//  253  497:i2f             
	//  254  498:invokevirtual   #156 <Method float TypedValue.getFraction(float, float)>
	//  255  501:f2i             
	//  256  502:istore_1        
					k = j;
					if(i > 0)
						k = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(i - (mDecorPadding.top + mDecorPadding.bottom), android.view.View.MeasureSpec.getSize(j)), 0x40000000);
				}
			}
		}
		super.onMeasure(i1, k);
		l1 = getMeasuredWidth();
		i1 = 0;
		j1 = android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000);
		j = i1;
		i = j1;
		if(!flag)
		{
			j = i1;
			i = j1;
			if(k1 == 0x80000000)
			{
				if(l != 0)
					typedvalue = mMinWidthMinor;
				else
	//* 257  503:goto            217
					typedvalue = mMinWidthMajor;
	//  258  506:aload_0         
	//  259  507:getfield        #65  <Field TypedValue mMinWidthMajor>
	//  260  510:astore          10
				j = i1;
				i = j1;
				if(typedvalue != null)
				{
					j = i1;
					i = j1;
					if(typedvalue.type != 0)
					{
						i = 0;
						if(typedvalue.type == 5)
							i = (int)typedvalue.getDimension(displaymetrics);
						else
	//* 261  512:goto            313
						if(typedvalue.type == 6)
	//* 262  515:aload           10
	//* 263  517:getfield        #117 <Field int TypedValue.type>
	//* 264  520:bipush          6
	//* 265  522:icmpne          358
							i = (int)typedvalue.getFraction(displaymetrics.widthPixels, displaymetrics.widthPixels);
	//  266  525:aload           10
	//  267  527:aload           11
	//  268  529:getfield        #104 <Field int DisplayMetrics.widthPixels>
	//  269  532:i2f             
	//  270  533:aload           11
	//  271  535:getfield        #104 <Field int DisplayMetrics.widthPixels>
	//  272  538:i2f             
	//  273  539:invokevirtual   #156 <Method float TypedValue.getFraction(float, float)>
	//  274  542:f2i             
	//  275  543:istore_1        
						l = i;
						if(i > 0)
							l = i - (mDecorPadding.left + mDecorPadding.right);
						j = i1;
						i = j1;
						if(l1 < l)
						{
							i = android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000);
							j = 1;
						}
					}
				}
			}
		}
		if(j != 0)
			super.onMeasure(i, k);
	//* 276  544:goto            358
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
