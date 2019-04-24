// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.*;
import android.support.v4.math.MathUtils;
import android.support.v4.text.TextDirectionHeuristicCompat;
import android.support.v4.text.TextDirectionHeuristicsCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.TintTypedArray;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.design.widget:
//			AnimationUtils

final class CollapsingTextHelper
{

	public CollapsingTextHelper(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #93  <Method void Object()>
		mExpandedTextGravity = 16;
	//    2    4:aload_0         
	//    3    5:bipush          16
	//    4    7:putfield        #95  <Field int mExpandedTextGravity>
		mCollapsedTextGravity = 16;
	//    5   10:aload_0         
	//    6   11:bipush          16
	//    7   13:putfield        #97  <Field int mCollapsedTextGravity>
		mExpandedTextSize = 15F;
	//    8   16:aload_0         
	//    9   17:ldc1            #98  <Float 15F>
	//   10   19:putfield        #100 <Field float mExpandedTextSize>
		mCollapsedTextSize = 15F;
	//   11   22:aload_0         
	//   12   23:ldc1            #98  <Float 15F>
	//   13   25:putfield        #102 <Field float mCollapsedTextSize>
		mView = view;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:putfield        #104 <Field View mView>
	//   17   33:aload_0         
	//   18   34:new             #106 <Class TextPaint>
	//   19   37:dup             
	//   20   38:sipush          129
	//   21   41:invokespecial   #108 <Method void TextPaint(int)>
	//   22   44:putfield        #110 <Field TextPaint mTextPaint>
	//   23   47:aload_0         
	//   24   48:new             #112 <Class Rect>
	//   25   51:dup             
	//   26   52:invokespecial   #113 <Method void Rect()>
	//   27   55:putfield        #115 <Field Rect mCollapsedBounds>
	//   28   58:aload_0         
	//   29   59:new             #112 <Class Rect>
	//   30   62:dup             
	//   31   63:invokespecial   #113 <Method void Rect()>
	//   32   66:putfield        #117 <Field Rect mExpandedBounds>
	//   33   69:aload_0         
	//   34   70:new             #119 <Class RectF>
	//   35   73:dup             
	//   36   74:invokespecial   #120 <Method void RectF()>
	//   37   77:putfield        #122 <Field RectF mCurrentBounds>
	//   38   80:return          
	}

	private boolean areTypefacesDifferent(Typeface typeface, Typeface typeface1)
	{
		return typeface != null && !typeface.equals(((Object) (typeface1))) || typeface == null && typeface1 != null;
	//    0    0:aload_1         
	//    1    1:ifnull          12
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #130 <Method boolean Typeface.equals(Object)>
	//    5    9:ifeq            20
	//    6   12:aload_1         
	//    7   13:ifnonnull       22
	//    8   16:aload_2         
	//    9   17:ifnull          22
	//   10   20:iconst_1        
	//   11   21:ireturn         
	//   12   22:iconst_0        
	//   13   23:ireturn         
	}

	private static int blendColors(int i, int j, float f)
	{
		float f1 = 1.0F - f;
	//    0    0:fconst_1        
	//    1    1:fload_2         
	//    2    2:fsub            
	//    3    3:fstore_3        
		float f2 = Color.alpha(i);
	//    4    4:iload_0         
	//    5    5:invokestatic    #138 <Method int Color.alpha(int)>
	//    6    8:i2f             
	//    7    9:fstore          4
		float f3 = Color.alpha(j);
	//    8   11:iload_1         
	//    9   12:invokestatic    #138 <Method int Color.alpha(int)>
	//   10   15:i2f             
	//   11   16:fstore          5
		float f4 = Color.red(i);
	//   12   18:iload_0         
	//   13   19:invokestatic    #141 <Method int Color.red(int)>
	//   14   22:i2f             
	//   15   23:fstore          6
		float f5 = Color.red(j);
	//   16   25:iload_1         
	//   17   26:invokestatic    #141 <Method int Color.red(int)>
	//   18   29:i2f             
	//   19   30:fstore          7
		float f6 = Color.green(i);
	//   20   32:iload_0         
	//   21   33:invokestatic    #144 <Method int Color.green(int)>
	//   22   36:i2f             
	//   23   37:fstore          8
		float f7 = Color.green(j);
	//   24   39:iload_1         
	//   25   40:invokestatic    #144 <Method int Color.green(int)>
	//   26   43:i2f             
	//   27   44:fstore          9
		float f8 = Color.blue(i);
	//   28   46:iload_0         
	//   29   47:invokestatic    #147 <Method int Color.blue(int)>
	//   30   50:i2f             
	//   31   51:fstore          10
		float f9 = Color.blue(j);
	//   32   53:iload_1         
	//   33   54:invokestatic    #147 <Method int Color.blue(int)>
	//   34   57:i2f             
	//   35   58:fstore          11
		return Color.argb((int)(f2 * f1 + f3 * f), (int)(f4 * f1 + f5 * f), (int)(f6 * f1 + f7 * f), (int)(f1 * f8 + f9 * f));
	//   36   60:fload           4
	//   37   62:fload_3         
	//   38   63:fmul            
	//   39   64:fload           5
	//   40   66:fload_2         
	//   41   67:fmul            
	//   42   68:fadd            
	//   43   69:f2i             
	//   44   70:fload           6
	//   45   72:fload_3         
	//   46   73:fmul            
	//   47   74:fload           7
	//   48   76:fload_2         
	//   49   77:fmul            
	//   50   78:fadd            
	//   51   79:f2i             
	//   52   80:fload           8
	//   53   82:fload_3         
	//   54   83:fmul            
	//   55   84:fload           9
	//   56   86:fload_2         
	//   57   87:fmul            
	//   58   88:fadd            
	//   59   89:f2i             
	//   60   90:fload_3         
	//   61   91:fload           10
	//   62   93:fmul            
	//   63   94:fload           11
	//   64   96:fload_2         
	//   65   97:fmul            
	//   66   98:fadd            
	//   67   99:f2i             
	//   68  100:invokestatic    #151 <Method int Color.argb(int, int, int, int)>
	//   69  103:ireturn         
	}

	private void calculateBaseOffsets()
	{
		float f;
		int i;
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		float f1 = 0.0F;
	//    2    3:fconst_0        
	//    3    4:fstore_2        
		float f2 = mCurrentTextSize;
	//    4    5:aload_0         
	//    5    6:getfield        #154 <Field float mCurrentTextSize>
	//    6    9:fstore_3        
		calculateUsingTextSize(mCollapsedTextSize);
	//    7   10:aload_0         
	//    8   11:aload_0         
	//    9   12:getfield        #102 <Field float mCollapsedTextSize>
	//   10   15:invokespecial   #158 <Method void calculateUsingTextSize(float)>
		int j;
		if(mTextToDraw != null)
	//*  11   18:aload_0         
	//*  12   19:getfield        #160 <Field CharSequence mTextToDraw>
	//*  13   22:ifnull          370
			f = mTextPaint.measureText(mTextToDraw, 0, mTextToDraw.length());
	//   14   25:aload_0         
	//   15   26:getfield        #110 <Field TextPaint mTextPaint>
	//   16   29:aload_0         
	//   17   30:getfield        #160 <Field CharSequence mTextToDraw>
	//   18   33:iconst_0        
	//   19   34:aload_0         
	//   20   35:getfield        #160 <Field CharSequence mTextToDraw>
	//   21   38:invokeinterface #166 <Method int CharSequence.length()>
	//   22   43:invokevirtual   #170 <Method float TextPaint.measureText(CharSequence, int, int)>
	//   23   46:fstore_1        
		else
	//*  24   47:aload_0         
	//*  25   48:getfield        #97  <Field int mCollapsedTextGravity>
	//*  26   51:istore          6
	//*  27   53:aload_0         
	//*  28   54:getfield        #172 <Field boolean mIsRtl>
	//*  29   57:ifeq            375
	//*  30   60:iconst_1        
	//*  31   61:istore          4
	//*  32   63:iload           6
	//*  33   65:iload           4
	//*  34   67:invokestatic    #178 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//*  35   70:istore          4
	//*  36   72:iload           4
	//*  37   74:bipush          112
	//*  38   76:iand            
	//*  39   77:lookupswitch    2: default 104
	//	               48: 396
	//	               80: 381
	//*  40  104:aload_0         
	//*  41  105:aload_0         
	//*  42  106:getfield        #110 <Field TextPaint mTextPaint>
	//*  43  109:invokevirtual   #182 <Method float TextPaint.descent()>
	//*  44  112:aload_0         
	//*  45  113:getfield        #110 <Field TextPaint mTextPaint>
	//*  46  116:invokevirtual   #185 <Method float TextPaint.ascent()>
	//*  47  119:fsub            
	//*  48  120:fconst_2        
	//*  49  121:fdiv            
	//*  50  122:aload_0         
	//*  51  123:getfield        #110 <Field TextPaint mTextPaint>
	//*  52  126:invokevirtual   #182 <Method float TextPaint.descent()>
	//*  53  129:fsub            
	//*  54  130:aload_0         
	//*  55  131:getfield        #115 <Field Rect mCollapsedBounds>
	//*  56  134:invokevirtual   #188 <Method int Rect.centerY()>
	//*  57  137:i2f             
	//*  58  138:fadd            
	//*  59  139:putfield        #190 <Field float mCollapsedDrawY>
	//*  60  142:iload           4
	//*  61  144:ldc1            #191 <Int 0x800007>
	//*  62  146:iand            
	//*  63  147:lookupswitch    2: default 172
	//	               1: 419
	//	               5: 438
	//*  64  172:aload_0         
	//*  65  173:aload_0         
	//*  66  174:getfield        #115 <Field Rect mCollapsedBounds>
	//*  67  177:getfield        #194 <Field int Rect.left>
	//*  68  180:i2f             
	//*  69  181:putfield        #196 <Field float mCollapsedDrawX>
	//*  70  184:aload_0         
	//*  71  185:aload_0         
	//*  72  186:getfield        #100 <Field float mExpandedTextSize>
	//*  73  189:invokespecial   #158 <Method void calculateUsingTextSize(float)>
	//*  74  192:fload_2         
	//*  75  193:fstore_1        
	//*  76  194:aload_0         
	//*  77  195:getfield        #160 <Field CharSequence mTextToDraw>
	//*  78  198:ifnull          223
	//*  79  201:aload_0         
	//*  80  202:getfield        #110 <Field TextPaint mTextPaint>
	//*  81  205:aload_0         
	//*  82  206:getfield        #160 <Field CharSequence mTextToDraw>
	//*  83  209:iconst_0        
	//*  84  210:aload_0         
	//*  85  211:getfield        #160 <Field CharSequence mTextToDraw>
	//*  86  214:invokeinterface #166 <Method int CharSequence.length()>
	//*  87  219:invokevirtual   #170 <Method float TextPaint.measureText(CharSequence, int, int)>
	//*  88  222:fstore_1        
	//*  89  223:aload_0         
	//*  90  224:getfield        #95  <Field int mExpandedTextGravity>
	//*  91  227:istore          6
	//*  92  229:aload_0         
	//*  93  230:getfield        #172 <Field boolean mIsRtl>
	//*  94  233:ifeq            455
	//*  95  236:iload           5
	//*  96  238:istore          4
	//*  97  240:iload           6
	//*  98  242:iload           4
	//*  99  244:invokestatic    #178 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//* 100  247:istore          4
	//* 101  249:iload           4
	//* 102  251:bipush          112
	//* 103  253:iand            
	//* 104  254:lookupswitch    2: default 280
	//	               48: 476
	//	               80: 461
	//* 105  280:aload_0         
	//* 106  281:aload_0         
	//* 107  282:getfield        #110 <Field TextPaint mTextPaint>
	//* 108  285:invokevirtual   #182 <Method float TextPaint.descent()>
	//* 109  288:aload_0         
	//* 110  289:getfield        #110 <Field TextPaint mTextPaint>
	//* 111  292:invokevirtual   #185 <Method float TextPaint.ascent()>
	//* 112  295:fsub            
	//* 113  296:fconst_2        
	//* 114  297:fdiv            
	//* 115  298:aload_0         
	//* 116  299:getfield        #110 <Field TextPaint mTextPaint>
	//* 117  302:invokevirtual   #182 <Method float TextPaint.descent()>
	//* 118  305:fsub            
	//* 119  306:aload_0         
	//* 120  307:getfield        #117 <Field Rect mExpandedBounds>
	//* 121  310:invokevirtual   #188 <Method int Rect.centerY()>
	//* 122  313:i2f             
	//* 123  314:fadd            
	//* 124  315:putfield        #198 <Field float mExpandedDrawY>
	//* 125  318:iload           4
	//* 126  320:ldc1            #191 <Int 0x800007>
	//* 127  322:iand            
	//* 128  323:lookupswitch    2: default 348
	//	               1: 499
	//	               5: 518
	//* 129  348:aload_0         
	//* 130  349:aload_0         
	//* 131  350:getfield        #117 <Field Rect mExpandedBounds>
	//* 132  353:getfield        #194 <Field int Rect.left>
	//* 133  356:i2f             
	//* 134  357:putfield        #200 <Field float mExpandedDrawX>
	//* 135  360:aload_0         
	//* 136  361:invokespecial   #203 <Method void clearTexture()>
	//* 137  364:aload_0         
	//* 138  365:fload_3         
	//* 139  366:invokespecial   #206 <Method void setInterpolatedTextSize(float)>
	//* 140  369:return          
			f = 0.0F;
	//  141  370:fconst_0        
	//  142  371:fstore_1        
		j = mCollapsedTextGravity;
		if(mIsRtl)
			i = 1;
		else
	//* 143  372:goto            47
			i = 0;
	//  144  375:iconst_0        
	//  145  376:istore          4
		i = GravityCompat.getAbsoluteGravity(j, i);
		i & 0x70;
		JVM INSTR lookupswitch 2: default 104
	//	               48: 396
	//	               80: 381;
		   goto _L1 _L2 _L3
_L1:
		mCollapsedDrawY = ((mTextPaint.descent() - mTextPaint.ascent()) / 2.0F - mTextPaint.descent()) + (float)mCollapsedBounds.centerY();
_L13:
		i & 0x800007;
		JVM INSTR lookupswitch 2: default 172
	//	               1: 419
	//	               5: 438;
		   goto _L4 _L5 _L6
_L4:
		mCollapsedDrawX = mCollapsedBounds.left;
_L14:
		calculateUsingTextSize(mExpandedTextSize);
		f = f1;
		if(mTextToDraw != null)
			f = mTextPaint.measureText(mTextToDraw, 0, mTextToDraw.length());
		j = mExpandedTextGravity;
		if(mIsRtl)
			i = ((int) (flag));
		else
	//* 146  378:goto            63
	//* 147  381:aload_0         
	//* 148  382:aload_0         
	//* 149  383:getfield        #115 <Field Rect mCollapsedBounds>
	//* 150  386:getfield        #209 <Field int Rect.bottom>
	//* 151  389:i2f             
	//* 152  390:putfield        #190 <Field float mCollapsedDrawY>
	//* 153  393:goto            142
	//* 154  396:aload_0         
	//* 155  397:aload_0         
	//* 156  398:getfield        #115 <Field Rect mCollapsedBounds>
	//* 157  401:getfield        #212 <Field int Rect.top>
	//* 158  404:i2f             
	//* 159  405:aload_0         
	//* 160  406:getfield        #110 <Field TextPaint mTextPaint>
	//* 161  409:invokevirtual   #185 <Method float TextPaint.ascent()>
	//* 162  412:fsub            
	//* 163  413:putfield        #190 <Field float mCollapsedDrawY>
	//* 164  416:goto            142
	//* 165  419:aload_0         
	//* 166  420:aload_0         
	//* 167  421:getfield        #115 <Field Rect mCollapsedBounds>
	//* 168  424:invokevirtual   #215 <Method int Rect.centerX()>
	//* 169  427:i2f             
	//* 170  428:fload_1         
	//* 171  429:fconst_2        
	//* 172  430:fdiv            
	//* 173  431:fsub            
	//* 174  432:putfield        #196 <Field float mCollapsedDrawX>
	//* 175  435:goto            184
	//* 176  438:aload_0         
	//* 177  439:aload_0         
	//* 178  440:getfield        #115 <Field Rect mCollapsedBounds>
	//* 179  443:getfield        #218 <Field int Rect.right>
	//* 180  446:i2f             
	//* 181  447:fload_1         
	//* 182  448:fsub            
	//* 183  449:putfield        #196 <Field float mCollapsedDrawX>
	//* 184  452:goto            184
			i = 0;
	//  185  455:iconst_0        
	//  186  456:istore          4
		i = GravityCompat.getAbsoluteGravity(j, i);
		i & 0x70;
		JVM INSTR lookupswitch 2: default 280
	//	               48: 476
	//	               80: 461;
		   goto _L7 _L8 _L9
_L7:
		mExpandedDrawY = ((mTextPaint.descent() - mTextPaint.ascent()) / 2.0F - mTextPaint.descent()) + (float)mExpandedBounds.centerY();
_L15:
		i & 0x800007;
		JVM INSTR lookupswitch 2: default 348
	//	               1: 499
	//	               5: 518;
		   goto _L10 _L11 _L12
_L10:
		mExpandedDrawX = mExpandedBounds.left;
_L16:
		clearTexture();
		setInterpolatedTextSize(f2);
		return;
_L3:
		mCollapsedDrawY = mCollapsedBounds.bottom;
		  goto _L13
_L2:
		mCollapsedDrawY = (float)mCollapsedBounds.top - mTextPaint.ascent();
		  goto _L13
_L5:
		mCollapsedDrawX = (float)mCollapsedBounds.centerX() - f / 2.0F;
		  goto _L14
_L6:
		mCollapsedDrawX = (float)mCollapsedBounds.right - f;
		  goto _L14
	//* 187  458:goto            240
_L9:
		mExpandedDrawY = mExpandedBounds.bottom;
	//  188  461:aload_0         
	//  189  462:aload_0         
	//  190  463:getfield        #117 <Field Rect mExpandedBounds>
	//  191  466:getfield        #209 <Field int Rect.bottom>
	//  192  469:i2f             
	//  193  470:putfield        #198 <Field float mExpandedDrawY>
		  goto _L15
	//* 194  473:goto            318
_L8:
		mExpandedDrawY = (float)mExpandedBounds.top - mTextPaint.ascent();
	//  195  476:aload_0         
	//  196  477:aload_0         
	//  197  478:getfield        #117 <Field Rect mExpandedBounds>
	//  198  481:getfield        #212 <Field int Rect.top>
	//  199  484:i2f             
	//  200  485:aload_0         
	//  201  486:getfield        #110 <Field TextPaint mTextPaint>
	//  202  489:invokevirtual   #185 <Method float TextPaint.ascent()>
	//  203  492:fsub            
	//  204  493:putfield        #198 <Field float mExpandedDrawY>
		  goto _L15
	//* 205  496:goto            318
_L11:
		mExpandedDrawX = (float)mExpandedBounds.centerX() - f / 2.0F;
	//  206  499:aload_0         
	//  207  500:aload_0         
	//  208  501:getfield        #117 <Field Rect mExpandedBounds>
	//  209  504:invokevirtual   #215 <Method int Rect.centerX()>
	//  210  507:i2f             
	//  211  508:fload_1         
	//  212  509:fconst_2        
	//  213  510:fdiv            
	//  214  511:fsub            
	//  215  512:putfield        #200 <Field float mExpandedDrawX>
		  goto _L16
	//* 216  515:goto            360
_L12:
		mExpandedDrawX = (float)mExpandedBounds.right - f;
	//  217  518:aload_0         
	//  218  519:aload_0         
	//  219  520:getfield        #117 <Field Rect mExpandedBounds>
	//  220  523:getfield        #218 <Field int Rect.right>
	//  221  526:i2f             
	//  222  527:fload_1         
	//  223  528:fsub            
	//  224  529:putfield        #200 <Field float mExpandedDrawX>
		  goto _L16
	//* 225  532:goto            360
	}

	private void calculateCurrentOffsets()
	{
		calculateOffsets(mExpandedFraction);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #221 <Field float mExpandedFraction>
	//    3    5:invokespecial   #224 <Method void calculateOffsets(float)>
	//    4    8:return          
	}

	private boolean calculateIsRtl(CharSequence charsequence)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		TextDirectionHeuristicCompat textdirectionheuristiccompat;
		if(ViewCompat.getLayoutDirection(mView) != 1)
	//*   2    2:aload_0         
	//*   3    3:getfield        #104 <Field View mView>
	//*   4    6:invokestatic    #232 <Method int ViewCompat.getLayoutDirection(View)>
	//*   5    9:iconst_1        
	//*   6   10:icmpne          36
	//*   7   13:iload_2         
	//*   8   14:ifeq            41
	//*   9   17:getstatic       #238 <Field TextDirectionHeuristicCompat TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL>
	//*  10   20:astore_3        
	//*  11   21:aload_3         
	//*  12   22:aload_1         
	//*  13   23:iconst_0        
	//*  14   24:aload_1         
	//*  15   25:invokeinterface #166 <Method int CharSequence.length()>
	//*  16   30:invokeinterface #244 <Method boolean TextDirectionHeuristicCompat.isRtl(CharSequence, int, int)>
	//*  17   35:ireturn         
			flag = false;
	//   18   36:iconst_0        
	//   19   37:istore_2        
		if(flag)
			textdirectionheuristiccompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL;
		else
	//*  20   38:goto            13
			textdirectionheuristiccompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
	//   21   41:getstatic       #247 <Field TextDirectionHeuristicCompat TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR>
	//   22   44:astore_3        
		return textdirectionheuristiccompat.isRtl(charsequence, 0, charsequence.length());
	//*  23   45:goto            21
	}

	private void calculateOffsets(float f)
	{
		interpolateBounds(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokespecial   #250 <Method void interpolateBounds(float)>
		mCurrentDrawX = lerp(mExpandedDrawX, mCollapsedDrawX, f, mPositionInterpolator);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #200 <Field float mExpandedDrawX>
	//    6   10:aload_0         
	//    7   11:getfield        #196 <Field float mCollapsedDrawX>
	//    8   14:fload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #252 <Field Interpolator mPositionInterpolator>
	//   11   19:invokestatic    #256 <Method float lerp(float, float, float, Interpolator)>
	//   12   22:putfield        #258 <Field float mCurrentDrawX>
		mCurrentDrawY = lerp(mExpandedDrawY, mCollapsedDrawY, f, mPositionInterpolator);
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #198 <Field float mExpandedDrawY>
	//   16   30:aload_0         
	//   17   31:getfield        #190 <Field float mCollapsedDrawY>
	//   18   34:fload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #252 <Field Interpolator mPositionInterpolator>
	//   21   39:invokestatic    #256 <Method float lerp(float, float, float, Interpolator)>
	//   22   42:putfield        #260 <Field float mCurrentDrawY>
		setInterpolatedTextSize(lerp(mExpandedTextSize, mCollapsedTextSize, f, mTextSizeInterpolator));
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #100 <Field float mExpandedTextSize>
	//   26   50:aload_0         
	//   27   51:getfield        #102 <Field float mCollapsedTextSize>
	//   28   54:fload_1         
	//   29   55:aload_0         
	//   30   56:getfield        #262 <Field Interpolator mTextSizeInterpolator>
	//   31   59:invokestatic    #256 <Method float lerp(float, float, float, Interpolator)>
	//   32   62:invokespecial   #206 <Method void setInterpolatedTextSize(float)>
		if(mCollapsedTextColor != mExpandedTextColor)
	//*  33   65:aload_0         
	//*  34   66:getfield        #264 <Field ColorStateList mCollapsedTextColor>
	//*  35   69:aload_0         
	//*  36   70:getfield        #266 <Field ColorStateList mExpandedTextColor>
	//*  37   73:if_acmpeq       161
			mTextPaint.setColor(blendColors(getCurrentExpandedTextColor(), getCurrentCollapsedTextColor(), f));
	//   38   76:aload_0         
	//   39   77:getfield        #110 <Field TextPaint mTextPaint>
	//   40   80:aload_0         
	//   41   81:invokespecial   #269 <Method int getCurrentExpandedTextColor()>
	//   42   84:aload_0         
	//   43   85:invokespecial   #272 <Method int getCurrentCollapsedTextColor()>
	//   44   88:fload_1         
	//   45   89:invokestatic    #274 <Method int blendColors(int, int, float)>
	//   46   92:invokevirtual   #275 <Method void TextPaint.setColor(int)>
		else
	//*  47   95:aload_0         
	//*  48   96:getfield        #110 <Field TextPaint mTextPaint>
	//*  49   99:aload_0         
	//*  50  100:getfield        #277 <Field float mExpandedShadowRadius>
	//*  51  103:aload_0         
	//*  52  104:getfield        #279 <Field float mCollapsedShadowRadius>
	//*  53  107:fload_1         
	//*  54  108:aconst_null     
	//*  55  109:invokestatic    #256 <Method float lerp(float, float, float, Interpolator)>
	//*  56  112:aload_0         
	//*  57  113:getfield        #281 <Field float mExpandedShadowDx>
	//*  58  116:aload_0         
	//*  59  117:getfield        #283 <Field float mCollapsedShadowDx>
	//*  60  120:fload_1         
	//*  61  121:aconst_null     
	//*  62  122:invokestatic    #256 <Method float lerp(float, float, float, Interpolator)>
	//*  63  125:aload_0         
	//*  64  126:getfield        #285 <Field float mExpandedShadowDy>
	//*  65  129:aload_0         
	//*  66  130:getfield        #287 <Field float mCollapsedShadowDy>
	//*  67  133:fload_1         
	//*  68  134:aconst_null     
	//*  69  135:invokestatic    #256 <Method float lerp(float, float, float, Interpolator)>
	//*  70  138:aload_0         
	//*  71  139:getfield        #289 <Field int mExpandedShadowColor>
	//*  72  142:aload_0         
	//*  73  143:getfield        #291 <Field int mCollapsedShadowColor>
	//*  74  146:fload_1         
	//*  75  147:invokestatic    #274 <Method int blendColors(int, int, float)>
	//*  76  150:invokevirtual   #295 <Method void TextPaint.setShadowLayer(float, float, float, int)>
	//*  77  153:aload_0         
	//*  78  154:getfield        #104 <Field View mView>
	//*  79  157:invokestatic    #298 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//*  80  160:return          
			mTextPaint.setColor(getCurrentCollapsedTextColor());
	//   81  161:aload_0         
	//   82  162:getfield        #110 <Field TextPaint mTextPaint>
	//   83  165:aload_0         
	//   84  166:invokespecial   #272 <Method int getCurrentCollapsedTextColor()>
	//   85  169:invokevirtual   #275 <Method void TextPaint.setColor(int)>
		mTextPaint.setShadowLayer(lerp(mExpandedShadowRadius, mCollapsedShadowRadius, f, ((Interpolator) (null))), lerp(mExpandedShadowDx, mCollapsedShadowDx, f, ((Interpolator) (null))), lerp(mExpandedShadowDy, mCollapsedShadowDy, f, ((Interpolator) (null))), blendColors(mExpandedShadowColor, mCollapsedShadowColor, f));
		ViewCompat.postInvalidateOnAnimation(mView);
	//*  86  172:goto            95
	}

	private void calculateUsingTextSize(float f)
	{
		boolean flag2 = true;
	//    0    0:iconst_1        
	//    1    1:istore          7
		if(mText != null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #300 <Field CharSequence mText>
	//*   4    7:ifnonnull       11
	//*   5   10:return          
		{
			float f2 = mCollapsedBounds.width();
	//    6   11:aload_0         
	//    7   12:getfield        #115 <Field Rect mCollapsedBounds>
	//    8   15:invokevirtual   #303 <Method int Rect.width()>
	//    9   18:i2f             
	//   10   19:fstore_3        
			float f3 = mExpandedBounds.width();
	//   11   20:aload_0         
	//   12   21:getfield        #117 <Field Rect mExpandedBounds>
	//   13   24:invokevirtual   #303 <Method int Rect.width()>
	//   14   27:i2f             
	//   15   28:fstore          4
			if(isClose(f, mCollapsedTextSize))
	//*  16   30:fload_1         
	//*  17   31:aload_0         
	//*  18   32:getfield        #102 <Field float mCollapsedTextSize>
	//*  19   35:invokestatic    #307 <Method boolean isClose(float, float)>
	//*  20   38:ifeq            232
			{
				float f1 = mCollapsedTextSize;
	//   21   41:aload_0         
	//   22   42:getfield        #102 <Field float mCollapsedTextSize>
	//   23   45:fstore_2        
				mScale = 1.0F;
	//   24   46:aload_0         
	//   25   47:fconst_1        
	//   26   48:putfield        #309 <Field float mScale>
				boolean flag;
				boolean flag1;
				Object obj;
				if(areTypefacesDifferent(mCurrentTypeface, mCollapsedTypeface))
	//*  27   51:aload_0         
	//*  28   52:aload_0         
	//*  29   53:getfield        #311 <Field Typeface mCurrentTypeface>
	//*  30   56:aload_0         
	//*  31   57:getfield        #313 <Field Typeface mCollapsedTypeface>
	//*  32   60:invokespecial   #315 <Method boolean areTypefacesDifferent(Typeface, Typeface)>
	//*  33   63:ifeq            347
				{
					mCurrentTypeface = mCollapsedTypeface;
	//   34   66:aload_0         
	//   35   67:aload_0         
	//   36   68:getfield        #313 <Field Typeface mCollapsedTypeface>
	//   37   71:putfield        #311 <Field Typeface mCurrentTypeface>
					flag = true;
	//   38   74:iconst_1        
	//   39   75:istore          5
					f = f2;
	//   40   77:fload_3         
	//   41   78:fstore_1        
				} else
	//*  42   79:iload           5
	//*  43   81:istore          6
	//*  44   83:fload_1         
	//*  45   84:fconst_0        
	//*  46   85:fcmpl           
	//*  47   86:ifle            127
	//*  48   89:aload_0         
	//*  49   90:getfield        #154 <Field float mCurrentTextSize>
	//*  50   93:fload_2         
	//*  51   94:fcmpl           
	//*  52   95:ifne            110
	//*  53   98:aload_0         
	//*  54   99:getfield        #317 <Field boolean mBoundsChanged>
	//*  55  102:ifne            110
	//*  56  105:iload           5
	//*  57  107:ifeq            329
	//*  58  110:iconst_1        
	//*  59  111:istore          5
	//*  60  113:aload_0         
	//*  61  114:fload_2         
	//*  62  115:putfield        #154 <Field float mCurrentTextSize>
	//*  63  118:aload_0         
	//*  64  119:iconst_0        
	//*  65  120:putfield        #317 <Field boolean mBoundsChanged>
	//*  66  123:iload           5
	//*  67  125:istore          6
	//*  68  127:aload_0         
	//*  69  128:getfield        #160 <Field CharSequence mTextToDraw>
	//*  70  131:ifnull          139
	//*  71  134:iload           6
	//*  72  136:ifeq            10
	//*  73  139:aload_0         
	//*  74  140:getfield        #110 <Field TextPaint mTextPaint>
	//*  75  143:aload_0         
	//*  76  144:getfield        #154 <Field float mCurrentTextSize>
	//*  77  147:invokevirtual   #320 <Method void TextPaint.setTextSize(float)>
	//*  78  150:aload_0         
	//*  79  151:getfield        #110 <Field TextPaint mTextPaint>
	//*  80  154:aload_0         
	//*  81  155:getfield        #311 <Field Typeface mCurrentTypeface>
	//*  82  158:invokevirtual   #324 <Method Typeface TextPaint.setTypeface(Typeface)>
	//*  83  161:pop             
	//*  84  162:aload_0         
	//*  85  163:getfield        #110 <Field TextPaint mTextPaint>
	//*  86  166:astore          8
	//*  87  168:aload_0         
	//*  88  169:getfield        #309 <Field float mScale>
	//*  89  172:fconst_1        
	//*  90  173:fcmpl           
	//*  91  174:ifeq            335
	//*  92  177:aload           8
	//*  93  179:iload           7
	//*  94  181:invokevirtual   #327 <Method void TextPaint.setLinearText(boolean)>
	//*  95  184:aload_0         
	//*  96  185:getfield        #300 <Field CharSequence mText>
	//*  97  188:aload_0         
	//*  98  189:getfield        #110 <Field TextPaint mTextPaint>
	//*  99  192:fload_1         
	//* 100  193:getstatic       #333 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//* 101  196:invokestatic    #339 <Method CharSequence TextUtils.ellipsize(CharSequence, TextPaint, float, android.text.TextUtils$TruncateAt)>
	//* 102  199:astore          8
	//* 103  201:aload           8
	//* 104  203:aload_0         
	//* 105  204:getfield        #160 <Field CharSequence mTextToDraw>
	//* 106  207:invokestatic    #342 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//* 107  210:ifne            10
	//* 108  213:aload_0         
	//* 109  214:aload           8
	//* 110  216:putfield        #160 <Field CharSequence mTextToDraw>
	//* 111  219:aload_0         
	//* 112  220:aload_0         
	//* 113  221:aload_0         
	//* 114  222:getfield        #160 <Field CharSequence mTextToDraw>
	//* 115  225:invokespecial   #344 <Method boolean calculateIsRtl(CharSequence)>
	//* 116  228:putfield        #172 <Field boolean mIsRtl>
	//* 117  231:return          
	//* 118  232:aload_0         
	//* 119  233:getfield        #100 <Field float mExpandedTextSize>
	//* 120  236:fstore_2        
	//* 121  237:aload_0         
	//* 122  238:aload_0         
	//* 123  239:getfield        #311 <Field Typeface mCurrentTypeface>
	//* 124  242:aload_0         
	//* 125  243:getfield        #346 <Field Typeface mExpandedTypeface>
	//* 126  246:invokespecial   #315 <Method boolean areTypefacesDifferent(Typeface, Typeface)>
	//* 127  249:ifeq            341
	//* 128  252:aload_0         
	//* 129  253:aload_0         
	//* 130  254:getfield        #346 <Field Typeface mExpandedTypeface>
	//* 131  257:putfield        #311 <Field Typeface mCurrentTypeface>
	//* 132  260:iconst_1        
	//* 133  261:istore          5
	//* 134  263:fload_1         
	//* 135  264:aload_0         
	//* 136  265:getfield        #100 <Field float mExpandedTextSize>
	//* 137  268:invokestatic    #307 <Method boolean isClose(float, float)>
	//* 138  271:ifeq            310
	//* 139  274:aload_0         
	//* 140  275:fconst_1        
	//* 141  276:putfield        #309 <Field float mScale>
	//* 142  279:aload_0         
	//* 143  280:getfield        #102 <Field float mCollapsedTextSize>
	//* 144  283:aload_0         
	//* 145  284:getfield        #100 <Field float mExpandedTextSize>
	//* 146  287:fdiv            
	//* 147  288:fstore_1        
	//* 148  289:fload           4
	//* 149  291:fload_1         
	//* 150  292:fmul            
	//* 151  293:fload_3         
	//* 152  294:fcmpl           
	//* 153  295:ifle            323
	//* 154  298:fload_3         
	//* 155  299:fload_1         
	//* 156  300:fdiv            
	//* 157  301:fload           4
	//* 158  303:invokestatic    #352 <Method float Math.min(float, float)>
	//* 159  306:fstore_1        
	//* 160  307:goto            79
	//* 161  310:aload_0         
	//* 162  311:fload_1         
	//* 163  312:aload_0         
	//* 164  313:getfield        #100 <Field float mExpandedTextSize>
	//* 165  316:fdiv            
	//* 166  317:putfield        #309 <Field float mScale>
	//* 167  320:goto            279
	//* 168  323:fload           4
	//* 169  325:fstore_1        
	//* 170  326:goto            79
	//* 171  329:iconst_0        
	//* 172  330:istore          5
	//* 173  332:goto            113
	//* 174  335:iconst_0        
	//* 175  336:istore          7
	//* 176  338:goto            177
	//* 177  341:iconst_0        
	//* 178  342:istore          5
	//* 179  344:goto            263
				{
					flag = false;
	//  180  347:iconst_0        
	//  181  348:istore          5
					f = f2;
	//  182  350:fload_3         
	//  183  351:fstore_1        
				}
			} else
			{
				f1 = mExpandedTextSize;
				if(areTypefacesDifferent(mCurrentTypeface, mExpandedTypeface))
				{
					mCurrentTypeface = mExpandedTypeface;
					flag = true;
				} else
				{
					flag = false;
				}
				if(isClose(f, mExpandedTextSize))
					mScale = 1.0F;
				else
					mScale = f / mExpandedTextSize;
				f = mCollapsedTextSize / mExpandedTextSize;
				if(f3 * f > f2)
					f = Math.min(f2 / f, f3);
				else
					f = f3;
			}
			flag1 = flag;
			if(f > 0.0F)
			{
				if(mCurrentTextSize != f1 || mBoundsChanged || flag)
					flag = true;
				else
					flag = false;
				mCurrentTextSize = f1;
				mBoundsChanged = false;
				flag1 = flag;
			}
			if(mTextToDraw == null || flag1)
			{
				mTextPaint.setTextSize(mCurrentTextSize);
				mTextPaint.setTypeface(mCurrentTypeface);
				obj = ((Object) (mTextPaint));
				if(mScale == 1.0F)
					flag2 = false;
				((TextPaint) (obj)).setLinearText(flag2);
				obj = ((Object) (TextUtils.ellipsize(mText, mTextPaint, f, android.text.TextUtils.TruncateAt.END)));
				if(!TextUtils.equals(((CharSequence) (obj)), mTextToDraw))
				{
					mTextToDraw = ((CharSequence) (obj));
					mIsRtl = calculateIsRtl(mTextToDraw);
					return;
				}
			}
		}
	//* 184  352:goto            79
	}

	private void clearTexture()
	{
		if(mExpandedTitleTexture != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #354 <Field Bitmap mExpandedTitleTexture>
	//*   2    4:ifnull          19
		{
			mExpandedTitleTexture.recycle();
	//    3    7:aload_0         
	//    4    8:getfield        #354 <Field Bitmap mExpandedTitleTexture>
	//    5   11:invokevirtual   #359 <Method void Bitmap.recycle()>
			mExpandedTitleTexture = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #354 <Field Bitmap mExpandedTitleTexture>
		}
	//    9   19:return          
	}

	private void ensureExpandedTexture()
	{
		if(mExpandedTitleTexture == null && !mExpandedBounds.isEmpty() && !TextUtils.isEmpty(mTextToDraw))
	//*   0    0:aload_0         
	//*   1    1:getfield        #354 <Field Bitmap mExpandedTitleTexture>
	//*   2    4:ifnonnull       27
	//*   3    7:aload_0         
	//*   4    8:getfield        #117 <Field Rect mExpandedBounds>
	//*   5   11:invokevirtual   #364 <Method boolean Rect.isEmpty()>
	//*   6   14:ifne            27
	//*   7   17:aload_0         
	//*   8   18:getfield        #160 <Field CharSequence mTextToDraw>
	//*   9   21:invokestatic    #366 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  10   24:ifeq            28
	//*  11   27:return          
		{
			calculateOffsets(0.0F);
	//   12   28:aload_0         
	//   13   29:fconst_0        
	//   14   30:invokespecial   #224 <Method void calculateOffsets(float)>
			mTextureAscent = mTextPaint.ascent();
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #110 <Field TextPaint mTextPaint>
	//   18   38:invokevirtual   #185 <Method float TextPaint.ascent()>
	//   19   41:putfield        #368 <Field float mTextureAscent>
			mTextureDescent = mTextPaint.descent();
	//   20   44:aload_0         
	//   21   45:aload_0         
	//   22   46:getfield        #110 <Field TextPaint mTextPaint>
	//   23   49:invokevirtual   #182 <Method float TextPaint.descent()>
	//   24   52:putfield        #370 <Field float mTextureDescent>
			int i = Math.round(mTextPaint.measureText(mTextToDraw, 0, mTextToDraw.length()));
	//   25   55:aload_0         
	//   26   56:getfield        #110 <Field TextPaint mTextPaint>
	//   27   59:aload_0         
	//   28   60:getfield        #160 <Field CharSequence mTextToDraw>
	//   29   63:iconst_0        
	//   30   64:aload_0         
	//   31   65:getfield        #160 <Field CharSequence mTextToDraw>
	//   32   68:invokeinterface #166 <Method int CharSequence.length()>
	//   33   73:invokevirtual   #170 <Method float TextPaint.measureText(CharSequence, int, int)>
	//   34   76:invokestatic    #374 <Method int Math.round(float)>
	//   35   79:istore_1        
			int j = Math.round(mTextureDescent - mTextureAscent);
	//   36   80:aload_0         
	//   37   81:getfield        #370 <Field float mTextureDescent>
	//   38   84:aload_0         
	//   39   85:getfield        #368 <Field float mTextureAscent>
	//   40   88:fsub            
	//   41   89:invokestatic    #374 <Method int Math.round(float)>
	//   42   92:istore_2        
			if(i > 0 && j > 0)
	//*  43   93:iload_1         
	//*  44   94:ifle            27
	//*  45   97:iload_2         
	//*  46   98:ifle            27
			{
				mExpandedTitleTexture = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
	//   47  101:aload_0         
	//   48  102:iload_1         
	//   49  103:iload_2         
	//   50  104:getstatic       #380 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   51  107:invokestatic    #384 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   52  110:putfield        #354 <Field Bitmap mExpandedTitleTexture>
				(new Canvas(mExpandedTitleTexture)).drawText(mTextToDraw, 0, mTextToDraw.length(), 0.0F, (float)j - mTextPaint.descent(), ((Paint) (mTextPaint)));
	//   53  113:new             #386 <Class Canvas>
	//   54  116:dup             
	//   55  117:aload_0         
	//   56  118:getfield        #354 <Field Bitmap mExpandedTitleTexture>
	//   57  121:invokespecial   #389 <Method void Canvas(Bitmap)>
	//   58  124:aload_0         
	//   59  125:getfield        #160 <Field CharSequence mTextToDraw>
	//   60  128:iconst_0        
	//   61  129:aload_0         
	//   62  130:getfield        #160 <Field CharSequence mTextToDraw>
	//   63  133:invokeinterface #166 <Method int CharSequence.length()>
	//   64  138:fconst_0        
	//   65  139:iload_2         
	//   66  140:i2f             
	//   67  141:aload_0         
	//   68  142:getfield        #110 <Field TextPaint mTextPaint>
	//   69  145:invokevirtual   #182 <Method float TextPaint.descent()>
	//   70  148:fsub            
	//   71  149:aload_0         
	//   72  150:getfield        #110 <Field TextPaint mTextPaint>
	//   73  153:invokevirtual   #393 <Method void Canvas.drawText(CharSequence, int, int, float, float, Paint)>
				if(mTexturePaint == null)
	//*  74  156:aload_0         
	//*  75  157:getfield        #395 <Field Paint mTexturePaint>
	//*  76  160:ifnonnull       27
				{
					mTexturePaint = new Paint(3);
	//   77  163:aload_0         
	//   78  164:new             #79  <Class Paint>
	//   79  167:dup             
	//   80  168:iconst_3        
	//   81  169:invokespecial   #396 <Method void Paint(int)>
	//   82  172:putfield        #395 <Field Paint mTexturePaint>
					return;
	//   83  175:return          
				}
			}
		}
	}

	private int getCurrentCollapsedTextColor()
	{
		if(mState != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #399 <Field int[] mState>
	//*   2    4:ifnull          20
			return mCollapsedTextColor.getColorForState(mState, 0);
	//    3    7:aload_0         
	//    4    8:getfield        #264 <Field ColorStateList mCollapsedTextColor>
	//    5   11:aload_0         
	//    6   12:getfield        #399 <Field int[] mState>
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #405 <Method int ColorStateList.getColorForState(int[], int)>
	//    9   19:ireturn         
		else
			return mCollapsedTextColor.getDefaultColor();
	//   10   20:aload_0         
	//   11   21:getfield        #264 <Field ColorStateList mCollapsedTextColor>
	//   12   24:invokevirtual   #408 <Method int ColorStateList.getDefaultColor()>
	//   13   27:ireturn         
	}

	private int getCurrentExpandedTextColor()
	{
		if(mState != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #399 <Field int[] mState>
	//*   2    4:ifnull          20
			return mExpandedTextColor.getColorForState(mState, 0);
	//    3    7:aload_0         
	//    4    8:getfield        #266 <Field ColorStateList mExpandedTextColor>
	//    5   11:aload_0         
	//    6   12:getfield        #399 <Field int[] mState>
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #405 <Method int ColorStateList.getColorForState(int[], int)>
	//    9   19:ireturn         
		else
			return mExpandedTextColor.getDefaultColor();
	//   10   20:aload_0         
	//   11   21:getfield        #266 <Field ColorStateList mExpandedTextColor>
	//   12   24:invokevirtual   #408 <Method int ColorStateList.getDefaultColor()>
	//   13   27:ireturn         
	}

	private void interpolateBounds(float f)
	{
		mCurrentBounds.left = lerp(mExpandedBounds.left, mCollapsedBounds.left, f, mPositionInterpolator);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field RectF mCurrentBounds>
	//    2    4:aload_0         
	//    3    5:getfield        #117 <Field Rect mExpandedBounds>
	//    4    8:getfield        #194 <Field int Rect.left>
	//    5   11:i2f             
	//    6   12:aload_0         
	//    7   13:getfield        #115 <Field Rect mCollapsedBounds>
	//    8   16:getfield        #194 <Field int Rect.left>
	//    9   19:i2f             
	//   10   20:fload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #252 <Field Interpolator mPositionInterpolator>
	//   13   25:invokestatic    #256 <Method float lerp(float, float, float, Interpolator)>
	//   14   28:putfield        #411 <Field float RectF.left>
		mCurrentBounds.top = lerp(mExpandedDrawY, mCollapsedDrawY, f, mPositionInterpolator);
	//   15   31:aload_0         
	//   16   32:getfield        #122 <Field RectF mCurrentBounds>
	//   17   35:aload_0         
	//   18   36:getfield        #198 <Field float mExpandedDrawY>
	//   19   39:aload_0         
	//   20   40:getfield        #190 <Field float mCollapsedDrawY>
	//   21   43:fload_1         
	//   22   44:aload_0         
	//   23   45:getfield        #252 <Field Interpolator mPositionInterpolator>
	//   24   48:invokestatic    #256 <Method float lerp(float, float, float, Interpolator)>
	//   25   51:putfield        #413 <Field float RectF.top>
		mCurrentBounds.right = lerp(mExpandedBounds.right, mCollapsedBounds.right, f, mPositionInterpolator);
	//   26   54:aload_0         
	//   27   55:getfield        #122 <Field RectF mCurrentBounds>
	//   28   58:aload_0         
	//   29   59:getfield        #117 <Field Rect mExpandedBounds>
	//   30   62:getfield        #218 <Field int Rect.right>
	//   31   65:i2f             
	//   32   66:aload_0         
	//   33   67:getfield        #115 <Field Rect mCollapsedBounds>
	//   34   70:getfield        #218 <Field int Rect.right>
	//   35   73:i2f             
	//   36   74:fload_1         
	//   37   75:aload_0         
	//   38   76:getfield        #252 <Field Interpolator mPositionInterpolator>
	//   39   79:invokestatic    #256 <Method float lerp(float, float, float, Interpolator)>
	//   40   82:putfield        #415 <Field float RectF.right>
		mCurrentBounds.bottom = lerp(mExpandedBounds.bottom, mCollapsedBounds.bottom, f, mPositionInterpolator);
	//   41   85:aload_0         
	//   42   86:getfield        #122 <Field RectF mCurrentBounds>
	//   43   89:aload_0         
	//   44   90:getfield        #117 <Field Rect mExpandedBounds>
	//   45   93:getfield        #209 <Field int Rect.bottom>
	//   46   96:i2f             
	//   47   97:aload_0         
	//   48   98:getfield        #115 <Field Rect mCollapsedBounds>
	//   49  101:getfield        #209 <Field int Rect.bottom>
	//   50  104:i2f             
	//   51  105:fload_1         
	//   52  106:aload_0         
	//   53  107:getfield        #252 <Field Interpolator mPositionInterpolator>
	//   54  110:invokestatic    #256 <Method float lerp(float, float, float, Interpolator)>
	//   55  113:putfield        #417 <Field float RectF.bottom>
	//   56  116:return          
	}

	private static boolean isClose(float f, float f1)
	{
		return Math.abs(f - f1) < 0.001F;
	//    0    0:fload_0         
	//    1    1:fload_1         
	//    2    2:fsub            
	//    3    3:invokestatic    #421 <Method float Math.abs(float)>
	//    4    6:ldc2            #422 <Float 0.001F>
	//    5    9:fcmpg           
	//    6   10:ifge            15
	//    7   13:iconst_1        
	//    8   14:ireturn         
	//    9   15:iconst_0        
	//   10   16:ireturn         
	}

	private static float lerp(float f, float f1, float f2, Interpolator interpolator)
	{
		float f3 = f2;
	//    0    0:fload_2         
	//    1    1:fstore          4
		if(interpolator != null)
	//*   2    3:aload_3         
	//*   3    4:ifnull          16
			f3 = interpolator.getInterpolation(f2);
	//    4    7:aload_3         
	//    5    8:fload_2         
	//    6    9:invokeinterface #427 <Method float Interpolator.getInterpolation(float)>
	//    7   14:fstore          4
		return AnimationUtils.lerp(f, f1, f3);
	//    8   16:fload_0         
	//    9   17:fload_1         
	//   10   18:fload           4
	//   11   20:invokestatic    #432 <Method float AnimationUtils.lerp(float, float, float)>
	//   12   23:freturn         
	}

	private Typeface readFontFamilyTypeface(int i)
	{
		TypedArray typedarray = mView.getContext().obtainStyledAttributes(i, new int[] {
			0x10103ac
		});
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field View mView>
	//    2    4:invokevirtual   #440 <Method Context View.getContext()>
	//    3    7:iload_1         
	//    4    8:iconst_1        
	//    5    9:newarray        int[]
	//    6   11:dup             
	//    7   12:iconst_0        
	//    8   13:ldc2            #441 <Int 0x10103ac>
	//    9   16:iastore         
	//   10   17:invokevirtual   #447 <Method TypedArray Context.obtainStyledAttributes(int, int[])>
	//   11   20:astore_2        
		Object obj = ((Object) (typedarray.getString(0)));
	//   12   21:aload_2         
	//   13   22:iconst_0        
	//   14   23:invokevirtual   #453 <Method String TypedArray.getString(int)>
	//   15   26:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_43;
	//   16   27:aload_3         
	//   17   28:ifnull          43
		obj = ((Object) (Typeface.create(((String) (obj)), 0)));
	//   18   31:aload_3         
	//   19   32:iconst_0        
	//   20   33:invokestatic    #457 <Method Typeface Typeface.create(String, int)>
	//   21   36:astore_3        
		typedarray.recycle();
	//   22   37:aload_2         
	//   23   38:invokevirtual   #458 <Method void TypedArray.recycle()>
		return ((Typeface) (obj));
	//   24   41:aload_3         
	//   25   42:areturn         
		typedarray.recycle();
	//   26   43:aload_2         
	//   27   44:invokevirtual   #458 <Method void TypedArray.recycle()>
		return null;
	//   28   47:aconst_null     
	//   29   48:areturn         
		Exception exception;
		exception;
	//   30   49:astore_3        
		typedarray.recycle();
	//   31   50:aload_2         
	//   32   51:invokevirtual   #458 <Method void TypedArray.recycle()>
		throw exception;
	//   33   54:aload_3         
	//   34   55:athrow          
	}

	private static boolean rectEquals(Rect rect, int i, int j, int k, int l)
	{
		return rect.left == i && rect.top == j && rect.right == k && rect.bottom == l;
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field int Rect.left>
	//    2    4:iload_1         
	//    3    5:icmpne          35
	//    4    8:aload_0         
	//    5    9:getfield        #212 <Field int Rect.top>
	//    6   12:iload_2         
	//    7   13:icmpne          35
	//    8   16:aload_0         
	//    9   17:getfield        #218 <Field int Rect.right>
	//   10   20:iload_3         
	//   11   21:icmpne          35
	//   12   24:aload_0         
	//   13   25:getfield        #209 <Field int Rect.bottom>
	//   14   28:iload           4
	//   15   30:icmpne          35
	//   16   33:iconst_1        
	//   17   34:ireturn         
	//   18   35:iconst_0        
	//   19   36:ireturn         
	}

	private void setInterpolatedTextSize(float f)
	{
		calculateUsingTextSize(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokespecial   #158 <Method void calculateUsingTextSize(float)>
		boolean flag;
		if(USE_SCALING_TEXTURE && mScale != 1.0F)
	//*   3    5:getstatic       #75  <Field boolean USE_SCALING_TEXTURE>
	//*   4    8:ifeq            46
	//*   5   11:aload_0         
	//*   6   12:getfield        #309 <Field float mScale>
	//*   7   15:fconst_1        
	//*   8   16:fcmpl           
	//*   9   17:ifeq            46
			flag = true;
	//   10   20:iconst_1        
	//   11   21:istore_2        
		else
	//*  12   22:aload_0         
	//*  13   23:iload_2         
	//*  14   24:putfield        #462 <Field boolean mUseTexture>
	//*  15   27:aload_0         
	//*  16   28:getfield        #462 <Field boolean mUseTexture>
	//*  17   31:ifeq            38
	//*  18   34:aload_0         
	//*  19   35:invokespecial   #464 <Method void ensureExpandedTexture()>
	//*  20   38:aload_0         
	//*  21   39:getfield        #104 <Field View mView>
	//*  22   42:invokestatic    #298 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//*  23   45:return          
			flag = false;
	//   24   46:iconst_0        
	//   25   47:istore_2        
		mUseTexture = flag;
		if(mUseTexture)
			ensureExpandedTexture();
		ViewCompat.postInvalidateOnAnimation(mView);
	//*  26   48:goto            22
	}

	public void draw(Canvas canvas)
	{
		int i = canvas.save();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #469 <Method int Canvas.save()>
	//    2    4:istore          7
		if(mTextToDraw != null && mDrawTitle)
	//*   3    6:aload_0         
	//*   4    7:getfield        #160 <Field CharSequence mTextToDraw>
	//*   5   10:ifnull          131
	//*   6   13:aload_0         
	//*   7   14:getfield        #471 <Field boolean mDrawTitle>
	//*   8   17:ifeq            131
		{
			float f4 = mCurrentDrawX;
	//    9   20:aload_0         
	//   10   21:getfield        #258 <Field float mCurrentDrawX>
	//   11   24:fstore          5
			float f3 = mCurrentDrawY;
	//   12   26:aload_0         
	//   13   27:getfield        #260 <Field float mCurrentDrawY>
	//   14   30:fstore          4
			float f;
			float f2;
			boolean flag;
			if(mUseTexture && mExpandedTitleTexture != null)
	//*  15   32:aload_0         
	//*  16   33:getfield        #462 <Field boolean mUseTexture>
	//*  17   36:ifeq            138
	//*  18   39:aload_0         
	//*  19   40:getfield        #354 <Field Bitmap mExpandedTitleTexture>
	//*  20   43:ifnull          138
				flag = true;
	//   21   46:iconst_1        
	//   22   47:istore          6
			else
	//*  23   49:iload           6
	//*  24   51:ifeq            144
	//*  25   54:aload_0         
	//*  26   55:getfield        #368 <Field float mTextureAscent>
	//*  27   58:aload_0         
	//*  28   59:getfield        #309 <Field float mScale>
	//*  29   62:fmul            
	//*  30   63:fstore_2        
	//*  31   64:aload_0         
	//*  32   65:getfield        #370 <Field float mTextureDescent>
	//*  33   68:fstore_3        
	//*  34   69:aload_0         
	//*  35   70:getfield        #309 <Field float mScale>
	//*  36   73:fstore_3        
	//*  37   74:fload           4
	//*  38   76:fstore_3        
	//*  39   77:iload           6
	//*  40   79:ifeq            87
	//*  41   82:fload           4
	//*  42   84:fload_2         
	//*  43   85:fadd            
	//*  44   86:fstore_3        
	//*  45   87:aload_0         
	//*  46   88:getfield        #309 <Field float mScale>
	//*  47   91:fconst_1        
	//*  48   92:fcmpl           
	//*  49   93:ifeq            111
	//*  50   96:aload_1         
	//*  51   97:aload_0         
	//*  52   98:getfield        #309 <Field float mScale>
	//*  53  101:aload_0         
	//*  54  102:getfield        #309 <Field float mScale>
	//*  55  105:fload           5
	//*  56  107:fload_3         
	//*  57  108:invokevirtual   #475 <Method void Canvas.scale(float, float, float, float)>
	//*  58  111:iload           6
	//*  59  113:ifeq            173
	//*  60  116:aload_1         
	//*  61  117:aload_0         
	//*  62  118:getfield        #354 <Field Bitmap mExpandedTitleTexture>
	//*  63  121:fload           5
	//*  64  123:fload_3         
	//*  65  124:aload_0         
	//*  66  125:getfield        #395 <Field Paint mTexturePaint>
	//*  67  128:invokevirtual   #479 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
	//*  68  131:aload_1         
	//*  69  132:iload           7
	//*  70  134:invokevirtual   #482 <Method void Canvas.restoreToCount(int)>
	//*  71  137:return          
				flag = false;
	//   72  138:iconst_0        
	//   73  139:istore          6
			if(flag)
			{
				f = mTextureAscent * mScale;
				float f1 = mTextureDescent;
				f1 = mScale;
			} else
	//*  74  141:goto            49
			{
				f = mTextPaint.ascent() * mScale;
	//   75  144:aload_0         
	//   76  145:getfield        #110 <Field TextPaint mTextPaint>
	//   77  148:invokevirtual   #185 <Method float TextPaint.ascent()>
	//   78  151:aload_0         
	//   79  152:getfield        #309 <Field float mScale>
	//   80  155:fmul            
	//   81  156:fstore_2        
				mTextPaint.descent();
	//   82  157:aload_0         
	//   83  158:getfield        #110 <Field TextPaint mTextPaint>
	//   84  161:invokevirtual   #182 <Method float TextPaint.descent()>
	//   85  164:pop             
				f2 = mScale;
	//   86  165:aload_0         
	//   87  166:getfield        #309 <Field float mScale>
	//   88  169:fstore_3        
			}
			f2 = f3;
			if(flag)
				f2 = f3 + f;
			if(mScale != 1.0F)
				canvas.scale(mScale, mScale, f4, f2);
			if(flag)
				canvas.drawBitmap(mExpandedTitleTexture, f4, f2, mTexturePaint);
			else
	//*  89  170:goto            74
				canvas.drawText(mTextToDraw, 0, mTextToDraw.length(), f4, f2, ((Paint) (mTextPaint)));
	//   90  173:aload_1         
	//   91  174:aload_0         
	//   92  175:getfield        #160 <Field CharSequence mTextToDraw>
	//   93  178:iconst_0        
	//   94  179:aload_0         
	//   95  180:getfield        #160 <Field CharSequence mTextToDraw>
	//   96  183:invokeinterface #166 <Method int CharSequence.length()>
	//   97  188:fload           5
	//   98  190:fload_3         
	//   99  191:aload_0         
	//  100  192:getfield        #110 <Field TextPaint mTextPaint>
	//  101  195:invokevirtual   #393 <Method void Canvas.drawText(CharSequence, int, int, float, float, Paint)>
		}
		canvas.restoreToCount(i);
	//* 102  198:goto            131
	}

	ColorStateList getCollapsedTextColor()
	{
		return mCollapsedTextColor;
	//    0    0:aload_0         
	//    1    1:getfield        #264 <Field ColorStateList mCollapsedTextColor>
	//    2    4:areturn         
	}

	int getCollapsedTextGravity()
	{
		return mCollapsedTextGravity;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field int mCollapsedTextGravity>
	//    2    4:ireturn         
	}

	float getCollapsedTextSize()
	{
		return mCollapsedTextSize;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field float mCollapsedTextSize>
	//    2    4:freturn         
	}

	Typeface getCollapsedTypeface()
	{
		if(mCollapsedTypeface != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field Typeface mCollapsedTypeface>
	//*   2    4:ifnull          12
			return mCollapsedTypeface;
	//    3    7:aload_0         
	//    4    8:getfield        #313 <Field Typeface mCollapsedTypeface>
	//    5   11:areturn         
		else
			return Typeface.DEFAULT;
	//    6   12:getstatic       #491 <Field Typeface Typeface.DEFAULT>
	//    7   15:areturn         
	}

	ColorStateList getExpandedTextColor()
	{
		return mExpandedTextColor;
	//    0    0:aload_0         
	//    1    1:getfield        #266 <Field ColorStateList mExpandedTextColor>
	//    2    4:areturn         
	}

	int getExpandedTextGravity()
	{
		return mExpandedTextGravity;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field int mExpandedTextGravity>
	//    2    4:ireturn         
	}

	float getExpandedTextSize()
	{
		return mExpandedTextSize;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field float mExpandedTextSize>
	//    2    4:freturn         
	}

	Typeface getExpandedTypeface()
	{
		if(mExpandedTypeface != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #346 <Field Typeface mExpandedTypeface>
	//*   2    4:ifnull          12
			return mExpandedTypeface;
	//    3    7:aload_0         
	//    4    8:getfield        #346 <Field Typeface mExpandedTypeface>
	//    5   11:areturn         
		else
			return Typeface.DEFAULT;
	//    6   12:getstatic       #491 <Field Typeface Typeface.DEFAULT>
	//    7   15:areturn         
	}

	float getExpansionFraction()
	{
		return mExpandedFraction;
	//    0    0:aload_0         
	//    1    1:getfield        #221 <Field float mExpandedFraction>
	//    2    4:freturn         
	}

	CharSequence getText()
	{
		return mText;
	//    0    0:aload_0         
	//    1    1:getfield        #300 <Field CharSequence mText>
	//    2    4:areturn         
	}

	final boolean isStateful()
	{
		return mCollapsedTextColor != null && mCollapsedTextColor.isStateful() || mExpandedTextColor != null && mExpandedTextColor.isStateful();
	//    0    0:aload_0         
	//    1    1:getfield        #264 <Field ColorStateList mCollapsedTextColor>
	//    2    4:ifnull          17
	//    3    7:aload_0         
	//    4    8:getfield        #264 <Field ColorStateList mCollapsedTextColor>
	//    5   11:invokevirtual   #501 <Method boolean ColorStateList.isStateful()>
	//    6   14:ifne            34
	//    7   17:aload_0         
	//    8   18:getfield        #266 <Field ColorStateList mExpandedTextColor>
	//    9   21:ifnull          36
	//   10   24:aload_0         
	//   11   25:getfield        #266 <Field ColorStateList mExpandedTextColor>
	//   12   28:invokevirtual   #501 <Method boolean ColorStateList.isStateful()>
	//   13   31:ifeq            36
	//   14   34:iconst_1        
	//   15   35:ireturn         
	//   16   36:iconst_0        
	//   17   37:ireturn         
	}

	void onBoundsChanged()
	{
		boolean flag;
		if(mCollapsedBounds.width() > 0 && mCollapsedBounds.height() > 0 && mExpandedBounds.width() > 0 && mExpandedBounds.height() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field Rect mCollapsedBounds>
	//*   2    4:invokevirtual   #303 <Method int Rect.width()>
	//*   3    7:ifle            48
	//*   4   10:aload_0         
	//*   5   11:getfield        #115 <Field Rect mCollapsedBounds>
	//*   6   14:invokevirtual   #505 <Method int Rect.height()>
	//*   7   17:ifle            48
	//*   8   20:aload_0         
	//*   9   21:getfield        #117 <Field Rect mExpandedBounds>
	//*  10   24:invokevirtual   #303 <Method int Rect.width()>
	//*  11   27:ifle            48
	//*  12   30:aload_0         
	//*  13   31:getfield        #117 <Field Rect mExpandedBounds>
	//*  14   34:invokevirtual   #505 <Method int Rect.height()>
	//*  15   37:ifle            48
			flag = true;
	//   16   40:iconst_1        
	//   17   41:istore_1        
		else
	//*  18   42:aload_0         
	//*  19   43:iload_1         
	//*  20   44:putfield        #471 <Field boolean mDrawTitle>
	//*  21   47:return          
			flag = false;
	//   22   48:iconst_0        
	//   23   49:istore_1        
		mDrawTitle = flag;
	//*  24   50:goto            42
	}

	public void recalculate()
	{
		if(mView.getHeight() > 0 && mView.getWidth() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field View mView>
	//*   2    4:invokevirtual   #509 <Method int View.getHeight()>
	//*   3    7:ifle            28
	//*   4   10:aload_0         
	//*   5   11:getfield        #104 <Field View mView>
	//*   6   14:invokevirtual   #512 <Method int View.getWidth()>
	//*   7   17:ifle            28
		{
			calculateBaseOffsets();
	//    8   20:aload_0         
	//    9   21:invokespecial   #514 <Method void calculateBaseOffsets()>
			calculateCurrentOffsets();
	//   10   24:aload_0         
	//   11   25:invokespecial   #516 <Method void calculateCurrentOffsets()>
		}
	//   12   28:return          
	}

	void setCollapsedBounds(int i, int j, int k, int l)
	{
		if(!rectEquals(mCollapsedBounds, i, j, k, l))
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field Rect mCollapsedBounds>
	//*   2    4:iload_1         
	//*   3    5:iload_2         
	//*   4    6:iload_3         
	//*   5    7:iload           4
	//*   6    9:invokestatic    #520 <Method boolean rectEquals(Rect, int, int, int, int)>
	//*   7   12:ifne            36
		{
			mCollapsedBounds.set(i, j, k, l);
	//    8   15:aload_0         
	//    9   16:getfield        #115 <Field Rect mCollapsedBounds>
	//   10   19:iload_1         
	//   11   20:iload_2         
	//   12   21:iload_3         
	//   13   22:iload           4
	//   14   24:invokevirtual   #523 <Method void Rect.set(int, int, int, int)>
			mBoundsChanged = true;
	//   15   27:aload_0         
	//   16   28:iconst_1        
	//   17   29:putfield        #317 <Field boolean mBoundsChanged>
			onBoundsChanged();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #525 <Method void onBoundsChanged()>
		}
	//   20   36:return          
	}

	void setCollapsedTextAppearance(int i)
	{
		TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(mView.getContext(), i, android.support.v7.appcompat.R.styleable.TextAppearance);
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field View mView>
	//    2    4:invokevirtual   #440 <Method Context View.getContext()>
	//    3    7:iload_1         
	//    4    8:getstatic       #531 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//    5   11:invokestatic    #536 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, int, int[])>
	//    6   14:astore_2        
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor))
	//*   7   15:aload_2         
	//*   8   16:getstatic       #539 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//*   9   19:invokevirtual   #543 <Method boolean TintTypedArray.hasValue(int)>
	//*  10   22:ifeq            36
			mCollapsedTextColor = tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor);
	//   11   25:aload_0         
	//   12   26:aload_2         
	//   13   27:getstatic       #539 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//   14   30:invokevirtual   #547 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   15   33:putfield        #264 <Field ColorStateList mCollapsedTextColor>
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize))
	//*  16   36:aload_2         
	//*  17   37:getstatic       #550 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//*  18   40:invokevirtual   #543 <Method boolean TintTypedArray.hasValue(int)>
	//*  19   43:ifeq            63
			mCollapsedTextSize = tinttypedarray.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize, (int)mCollapsedTextSize);
	//   20   46:aload_0         
	//   21   47:aload_2         
	//   22   48:getstatic       #550 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//   23   51:aload_0         
	//   24   52:getfield        #102 <Field float mCollapsedTextSize>
	//   25   55:f2i             
	//   26   56:invokevirtual   #553 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//   27   59:i2f             
	//   28   60:putfield        #102 <Field float mCollapsedTextSize>
		mCollapsedShadowColor = tinttypedarray.getInt(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowColor, 0);
	//   29   63:aload_0         
	//   30   64:aload_2         
	//   31   65:getstatic       #556 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowColor>
	//   32   68:iconst_0        
	//   33   69:invokevirtual   #559 <Method int TintTypedArray.getInt(int, int)>
	//   34   72:putfield        #291 <Field int mCollapsedShadowColor>
		mCollapsedShadowDx = tinttypedarray.getFloat(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowDx, 0.0F);
	//   35   75:aload_0         
	//   36   76:aload_2         
	//   37   77:getstatic       #562 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowDx>
	//   38   80:fconst_0        
	//   39   81:invokevirtual   #566 <Method float TintTypedArray.getFloat(int, float)>
	//   40   84:putfield        #283 <Field float mCollapsedShadowDx>
		mCollapsedShadowDy = tinttypedarray.getFloat(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowDy, 0.0F);
	//   41   87:aload_0         
	//   42   88:aload_2         
	//   43   89:getstatic       #569 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowDy>
	//   44   92:fconst_0        
	//   45   93:invokevirtual   #566 <Method float TintTypedArray.getFloat(int, float)>
	//   46   96:putfield        #287 <Field float mCollapsedShadowDy>
		mCollapsedShadowRadius = tinttypedarray.getFloat(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowRadius, 0.0F);
	//   47   99:aload_0         
	//   48  100:aload_2         
	//   49  101:getstatic       #572 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowRadius>
	//   50  104:fconst_0        
	//   51  105:invokevirtual   #566 <Method float TintTypedArray.getFloat(int, float)>
	//   52  108:putfield        #279 <Field float mCollapsedShadowRadius>
		tinttypedarray.recycle();
	//   53  111:aload_2         
	//   54  112:invokevirtual   #573 <Method void TintTypedArray.recycle()>
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  55  115:getstatic       #73  <Field int android.os.Build$VERSION.SDK_INT>
	//*  56  118:bipush          16
	//*  57  120:icmplt          132
			mCollapsedTypeface = readFontFamilyTypeface(i);
	//   58  123:aload_0         
	//   59  124:aload_0         
	//   60  125:iload_1         
	//   61  126:invokespecial   #575 <Method Typeface readFontFamilyTypeface(int)>
	//   62  129:putfield        #313 <Field Typeface mCollapsedTypeface>
		recalculate();
	//   63  132:aload_0         
	//   64  133:invokevirtual   #577 <Method void recalculate()>
	//   65  136:return          
	}

	void setCollapsedTextColor(ColorStateList colorstatelist)
	{
		if(mCollapsedTextColor != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #264 <Field ColorStateList mCollapsedTextColor>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			mCollapsedTextColor = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #264 <Field ColorStateList mCollapsedTextColor>
			recalculate();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #577 <Method void recalculate()>
		}
	//    9   17:return          
	}

	void setCollapsedTextGravity(int i)
	{
		if(mCollapsedTextGravity != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field int mCollapsedTextGravity>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			mCollapsedTextGravity = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #97  <Field int mCollapsedTextGravity>
			recalculate();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #577 <Method void recalculate()>
		}
	//    9   17:return          
	}

	void setCollapsedTextSize(float f)
	{
		if(mCollapsedTextSize != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field float mCollapsedTextSize>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mCollapsedTextSize = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #102 <Field float mCollapsedTextSize>
			recalculate();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #577 <Method void recalculate()>
		}
	//   10   18:return          
	}

	void setCollapsedTypeface(Typeface typeface)
	{
		if(areTypefacesDifferent(mCollapsedTypeface, typeface))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:getfield        #313 <Field Typeface mCollapsedTypeface>
	//*   3    5:aload_1         
	//*   4    6:invokespecial   #315 <Method boolean areTypefacesDifferent(Typeface, Typeface)>
	//*   5    9:ifeq            21
		{
			mCollapsedTypeface = typeface;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #313 <Field Typeface mCollapsedTypeface>
			recalculate();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #577 <Method void recalculate()>
		}
	//   11   21:return          
	}

	void setExpandedBounds(int i, int j, int k, int l)
	{
		if(!rectEquals(mExpandedBounds, i, j, k, l))
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field Rect mExpandedBounds>
	//*   2    4:iload_1         
	//*   3    5:iload_2         
	//*   4    6:iload_3         
	//*   5    7:iload           4
	//*   6    9:invokestatic    #520 <Method boolean rectEquals(Rect, int, int, int, int)>
	//*   7   12:ifne            36
		{
			mExpandedBounds.set(i, j, k, l);
	//    8   15:aload_0         
	//    9   16:getfield        #117 <Field Rect mExpandedBounds>
	//   10   19:iload_1         
	//   11   20:iload_2         
	//   12   21:iload_3         
	//   13   22:iload           4
	//   14   24:invokevirtual   #523 <Method void Rect.set(int, int, int, int)>
			mBoundsChanged = true;
	//   15   27:aload_0         
	//   16   28:iconst_1        
	//   17   29:putfield        #317 <Field boolean mBoundsChanged>
			onBoundsChanged();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #525 <Method void onBoundsChanged()>
		}
	//   20   36:return          
	}

	void setExpandedTextAppearance(int i)
	{
		TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(mView.getContext(), i, android.support.v7.appcompat.R.styleable.TextAppearance);
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field View mView>
	//    2    4:invokevirtual   #440 <Method Context View.getContext()>
	//    3    7:iload_1         
	//    4    8:getstatic       #531 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//    5   11:invokestatic    #536 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, int, int[])>
	//    6   14:astore_2        
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor))
	//*   7   15:aload_2         
	//*   8   16:getstatic       #539 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//*   9   19:invokevirtual   #543 <Method boolean TintTypedArray.hasValue(int)>
	//*  10   22:ifeq            36
			mExpandedTextColor = tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor);
	//   11   25:aload_0         
	//   12   26:aload_2         
	//   13   27:getstatic       #539 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//   14   30:invokevirtual   #547 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   15   33:putfield        #266 <Field ColorStateList mExpandedTextColor>
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize))
	//*  16   36:aload_2         
	//*  17   37:getstatic       #550 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//*  18   40:invokevirtual   #543 <Method boolean TintTypedArray.hasValue(int)>
	//*  19   43:ifeq            63
			mExpandedTextSize = tinttypedarray.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize, (int)mExpandedTextSize);
	//   20   46:aload_0         
	//   21   47:aload_2         
	//   22   48:getstatic       #550 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//   23   51:aload_0         
	//   24   52:getfield        #100 <Field float mExpandedTextSize>
	//   25   55:f2i             
	//   26   56:invokevirtual   #553 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//   27   59:i2f             
	//   28   60:putfield        #100 <Field float mExpandedTextSize>
		mExpandedShadowColor = tinttypedarray.getInt(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowColor, 0);
	//   29   63:aload_0         
	//   30   64:aload_2         
	//   31   65:getstatic       #556 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowColor>
	//   32   68:iconst_0        
	//   33   69:invokevirtual   #559 <Method int TintTypedArray.getInt(int, int)>
	//   34   72:putfield        #289 <Field int mExpandedShadowColor>
		mExpandedShadowDx = tinttypedarray.getFloat(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowDx, 0.0F);
	//   35   75:aload_0         
	//   36   76:aload_2         
	//   37   77:getstatic       #562 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowDx>
	//   38   80:fconst_0        
	//   39   81:invokevirtual   #566 <Method float TintTypedArray.getFloat(int, float)>
	//   40   84:putfield        #281 <Field float mExpandedShadowDx>
		mExpandedShadowDy = tinttypedarray.getFloat(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowDy, 0.0F);
	//   41   87:aload_0         
	//   42   88:aload_2         
	//   43   89:getstatic       #569 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowDy>
	//   44   92:fconst_0        
	//   45   93:invokevirtual   #566 <Method float TintTypedArray.getFloat(int, float)>
	//   46   96:putfield        #285 <Field float mExpandedShadowDy>
		mExpandedShadowRadius = tinttypedarray.getFloat(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowRadius, 0.0F);
	//   47   99:aload_0         
	//   48  100:aload_2         
	//   49  101:getstatic       #572 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowRadius>
	//   50  104:fconst_0        
	//   51  105:invokevirtual   #566 <Method float TintTypedArray.getFloat(int, float)>
	//   52  108:putfield        #277 <Field float mExpandedShadowRadius>
		tinttypedarray.recycle();
	//   53  111:aload_2         
	//   54  112:invokevirtual   #573 <Method void TintTypedArray.recycle()>
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  55  115:getstatic       #73  <Field int android.os.Build$VERSION.SDK_INT>
	//*  56  118:bipush          16
	//*  57  120:icmplt          132
			mExpandedTypeface = readFontFamilyTypeface(i);
	//   58  123:aload_0         
	//   59  124:aload_0         
	//   60  125:iload_1         
	//   61  126:invokespecial   #575 <Method Typeface readFontFamilyTypeface(int)>
	//   62  129:putfield        #346 <Field Typeface mExpandedTypeface>
		recalculate();
	//   63  132:aload_0         
	//   64  133:invokevirtual   #577 <Method void recalculate()>
	//   65  136:return          
	}

	void setExpandedTextColor(ColorStateList colorstatelist)
	{
		if(mExpandedTextColor != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #266 <Field ColorStateList mExpandedTextColor>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			mExpandedTextColor = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #266 <Field ColorStateList mExpandedTextColor>
			recalculate();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #577 <Method void recalculate()>
		}
	//    9   17:return          
	}

	void setExpandedTextGravity(int i)
	{
		if(mExpandedTextGravity != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field int mExpandedTextGravity>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			mExpandedTextGravity = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #95  <Field int mExpandedTextGravity>
			recalculate();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #577 <Method void recalculate()>
		}
	//    9   17:return          
	}

	void setExpandedTextSize(float f)
	{
		if(mExpandedTextSize != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #100 <Field float mExpandedTextSize>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mExpandedTextSize = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #100 <Field float mExpandedTextSize>
			recalculate();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #577 <Method void recalculate()>
		}
	//   10   18:return          
	}

	void setExpandedTypeface(Typeface typeface)
	{
		if(areTypefacesDifferent(mExpandedTypeface, typeface))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:getfield        #346 <Field Typeface mExpandedTypeface>
	//*   3    5:aload_1         
	//*   4    6:invokespecial   #315 <Method boolean areTypefacesDifferent(Typeface, Typeface)>
	//*   5    9:ifeq            21
		{
			mExpandedTypeface = typeface;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #346 <Field Typeface mExpandedTypeface>
			recalculate();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #577 <Method void recalculate()>
		}
	//   11   21:return          
	}

	void setExpansionFraction(float f)
	{
		f = MathUtils.clamp(f, 0.0F, 1.0F);
	//    0    0:fload_1         
	//    1    1:fconst_0        
	//    2    2:fconst_1        
	//    3    3:invokestatic    #595 <Method float MathUtils.clamp(float, float, float)>
	//    4    6:fstore_1        
		if(f != mExpandedFraction)
	//*   5    7:fload_1         
	//*   6    8:aload_0         
	//*   7    9:getfield        #221 <Field float mExpandedFraction>
	//*   8   12:fcmpl           
	//*   9   13:ifeq            25
		{
			mExpandedFraction = f;
	//   10   16:aload_0         
	//   11   17:fload_1         
	//   12   18:putfield        #221 <Field float mExpandedFraction>
			calculateCurrentOffsets();
	//   13   21:aload_0         
	//   14   22:invokespecial   #516 <Method void calculateCurrentOffsets()>
		}
	//   15   25:return          
	}

	void setPositionInterpolator(Interpolator interpolator)
	{
		mPositionInterpolator = interpolator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #252 <Field Interpolator mPositionInterpolator>
		recalculate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #577 <Method void recalculate()>
	//    5    9:return          
	}

	final boolean setState(int ai[])
	{
		mState = ai;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #399 <Field int[] mState>
		if(isStateful())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #600 <Method boolean isStateful()>
	//*   5    9:ifeq            18
		{
			recalculate();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #577 <Method void recalculate()>
			return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		} else
		{
			return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
		}
	}

	void setText(CharSequence charsequence)
	{
		if(charsequence == null || !((Object) (charsequence)).equals(((Object) (mText))))
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
	//*   2    4:aload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #300 <Field CharSequence mText>
	//*   5    9:invokevirtual   #603 <Method boolean Object.equals(Object)>
	//*   6   12:ifne            33
		{
			mText = charsequence;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #300 <Field CharSequence mText>
			mTextToDraw = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #160 <Field CharSequence mTextToDraw>
			clearTexture();
	//   13   25:aload_0         
	//   14   26:invokespecial   #203 <Method void clearTexture()>
			recalculate();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #577 <Method void recalculate()>
		}
	//   17   33:return          
	}

	void setTextSizeInterpolator(Interpolator interpolator)
	{
		mTextSizeInterpolator = interpolator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #262 <Field Interpolator mTextSizeInterpolator>
		recalculate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #577 <Method void recalculate()>
	//    5    9:return          
	}

	void setTypefaces(Typeface typeface)
	{
		mExpandedTypeface = typeface;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #346 <Field Typeface mExpandedTypeface>
		mCollapsedTypeface = typeface;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #313 <Field Typeface mCollapsedTypeface>
		recalculate();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #577 <Method void recalculate()>
	//    8   14:return          
	}

	private static final boolean DEBUG_DRAW = false;
	private static final Paint DEBUG_DRAW_PAINT;
	private static final boolean USE_SCALING_TEXTURE;
	private boolean mBoundsChanged;
	private final Rect mCollapsedBounds = new Rect();
	private float mCollapsedDrawX;
	private float mCollapsedDrawY;
	private int mCollapsedShadowColor;
	private float mCollapsedShadowDx;
	private float mCollapsedShadowDy;
	private float mCollapsedShadowRadius;
	private ColorStateList mCollapsedTextColor;
	private int mCollapsedTextGravity;
	private float mCollapsedTextSize;
	private Typeface mCollapsedTypeface;
	private final RectF mCurrentBounds = new RectF();
	private float mCurrentDrawX;
	private float mCurrentDrawY;
	private float mCurrentTextSize;
	private Typeface mCurrentTypeface;
	private boolean mDrawTitle;
	private final Rect mExpandedBounds = new Rect();
	private float mExpandedDrawX;
	private float mExpandedDrawY;
	private float mExpandedFraction;
	private int mExpandedShadowColor;
	private float mExpandedShadowDx;
	private float mExpandedShadowDy;
	private float mExpandedShadowRadius;
	private ColorStateList mExpandedTextColor;
	private int mExpandedTextGravity;
	private float mExpandedTextSize;
	private Bitmap mExpandedTitleTexture;
	private Typeface mExpandedTypeface;
	private boolean mIsRtl;
	private Interpolator mPositionInterpolator;
	private float mScale;
	private int mState[];
	private CharSequence mText;
	private final TextPaint mTextPaint = new TextPaint(129);
	private Interpolator mTextSizeInterpolator;
	private CharSequence mTextToDraw;
	private float mTextureAscent;
	private float mTextureDescent;
	private Paint mTexturePaint;
	private boolean mUseTexture;
	private final View mView;

	static 
	{
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT < 18)
	//*   0    0:getstatic       #73  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmpge          40
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:iload_0         
	//*   6   11:putstatic       #75  <Field boolean USE_SCALING_TEXTURE>
	//*   7   14:aconst_null     
	//*   8   15:putstatic       #77  <Field Paint DEBUG_DRAW_PAINT>
	//*   9   18:getstatic       #77  <Field Paint DEBUG_DRAW_PAINT>
	//*  10   21:ifnull          39
	//*  11   24:getstatic       #77  <Field Paint DEBUG_DRAW_PAINT>
	//*  12   27:iconst_1        
	//*  13   28:invokevirtual   #83  <Method void Paint.setAntiAlias(boolean)>
	//*  14   31:getstatic       #77  <Field Paint DEBUG_DRAW_PAINT>
	//*  15   34:ldc1            #84  <Int -65281>
	//*  16   36:invokevirtual   #88  <Method void Paint.setColor(int)>
	//*  17   39:return          
			flag = false;
	//   18   40:iconst_0        
	//   19   41:istore_0        
		USE_SCALING_TEXTURE = flag;
		DEBUG_DRAW_PAINT = null;
		if(DEBUG_DRAW_PAINT != null)
		{
			DEBUG_DRAW_PAINT.setAntiAlias(true);
			DEBUG_DRAW_PAINT.setColor(-65281);
		}
	//*  20   42:goto            10
	}
}
