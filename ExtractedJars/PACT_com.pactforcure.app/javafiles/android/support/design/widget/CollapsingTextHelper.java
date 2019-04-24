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
		return Color.argb((int)(f2 * f1 + f3 * f), (int)(f4 * f1 + f5 * f), (int)(f6 * f1 + f7 * f), (int)(f8 * f1 + f9 * f));
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
	//   60   90:fload           10
	//   61   92:fload_3         
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
	//    1    1:istore          6
		float f1 = mCurrentTextSize;
	//    2    3:aload_0         
	//    3    4:getfield        #154 <Field float mCurrentTextSize>
	//    4    7:fstore_2        
		calculateUsingTextSize(mCollapsedTextSize);
	//    5    8:aload_0         
	//    6    9:aload_0         
	//    7   10:getfield        #102 <Field float mCollapsedTextSize>
	//    8   13:invokespecial   #158 <Method void calculateUsingTextSize(float)>
		float f2;
		float f3;
		int j;
		if(mTextToDraw != null)
	//*   9   16:aload_0         
	//*  10   17:getfield        #160 <Field CharSequence mTextToDraw>
	//*  11   20:ifnull          382
			f = mTextPaint.measureText(mTextToDraw, 0, mTextToDraw.length());
	//   12   23:aload_0         
	//   13   24:getfield        #110 <Field TextPaint mTextPaint>
	//   14   27:aload_0         
	//   15   28:getfield        #160 <Field CharSequence mTextToDraw>
	//   16   31:iconst_0        
	//   17   32:aload_0         
	//   18   33:getfield        #160 <Field CharSequence mTextToDraw>
	//   19   36:invokeinterface #166 <Method int CharSequence.length()>
	//   20   41:invokevirtual   #170 <Method float TextPaint.measureText(CharSequence, int, int)>
	//   21   44:fstore_1        
		else
	//*  22   45:aload_0         
	//*  23   46:getfield        #97  <Field int mCollapsedTextGravity>
	//*  24   49:istore          7
	//*  25   51:aload_0         
	//*  26   52:getfield        #172 <Field boolean mIsRtl>
	//*  27   55:ifeq            387
	//*  28   58:iconst_1        
	//*  29   59:istore          5
	//*  30   61:iload           7
	//*  31   63:iload           5
	//*  32   65:invokestatic    #178 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//*  33   68:istore          5
	//*  34   70:iload           5
	//*  35   72:bipush          112
	//*  36   74:iand            
	//*  37   75:lookupswitch    2: default 100
	//	               48: 408
	//	               80: 393
	//*  38  100:aload_0         
	//*  39  101:getfield        #110 <Field TextPaint mTextPaint>
	//*  40  104:invokevirtual   #182 <Method float TextPaint.descent()>
	//*  41  107:aload_0         
	//*  42  108:getfield        #110 <Field TextPaint mTextPaint>
	//*  43  111:invokevirtual   #185 <Method float TextPaint.ascent()>
	//*  44  114:fsub            
	//*  45  115:fconst_2        
	//*  46  116:fdiv            
	//*  47  117:fstore_3        
	//*  48  118:aload_0         
	//*  49  119:getfield        #110 <Field TextPaint mTextPaint>
	//*  50  122:invokevirtual   #182 <Method float TextPaint.descent()>
	//*  51  125:fstore          4
	//*  52  127:aload_0         
	//*  53  128:aload_0         
	//*  54  129:getfield        #115 <Field Rect mCollapsedBounds>
	//*  55  132:invokevirtual   #188 <Method int Rect.centerY()>
	//*  56  135:i2f             
	//*  57  136:fload_3         
	//*  58  137:fload           4
	//*  59  139:fsub            
	//*  60  140:fadd            
	//*  61  141:putfield        #190 <Field float mCollapsedDrawY>
	//*  62  144:iload           5
	//*  63  146:ldc1            #191 <Int 0x800007>
	//*  64  148:iand            
	//*  65  149:lookupswitch    2: default 176
	//	               1: 431
	//	               5: 450
	//*  66  176:aload_0         
	//*  67  177:aload_0         
	//*  68  178:getfield        #115 <Field Rect mCollapsedBounds>
	//*  69  181:getfield        #194 <Field int Rect.left>
	//*  70  184:i2f             
	//*  71  185:putfield        #196 <Field float mCollapsedDrawX>
	//*  72  188:aload_0         
	//*  73  189:aload_0         
	//*  74  190:getfield        #100 <Field float mExpandedTextSize>
	//*  75  193:invokespecial   #158 <Method void calculateUsingTextSize(float)>
	//*  76  196:aload_0         
	//*  77  197:getfield        #160 <Field CharSequence mTextToDraw>
	//*  78  200:ifnull          467
	//*  79  203:aload_0         
	//*  80  204:getfield        #110 <Field TextPaint mTextPaint>
	//*  81  207:aload_0         
	//*  82  208:getfield        #160 <Field CharSequence mTextToDraw>
	//*  83  211:iconst_0        
	//*  84  212:aload_0         
	//*  85  213:getfield        #160 <Field CharSequence mTextToDraw>
	//*  86  216:invokeinterface #166 <Method int CharSequence.length()>
	//*  87  221:invokevirtual   #170 <Method float TextPaint.measureText(CharSequence, int, int)>
	//*  88  224:fstore_1        
	//*  89  225:aload_0         
	//*  90  226:getfield        #95  <Field int mExpandedTextGravity>
	//*  91  229:istore          7
	//*  92  231:aload_0         
	//*  93  232:getfield        #172 <Field boolean mIsRtl>
	//*  94  235:ifeq            472
	//*  95  238:iload           6
	//*  96  240:istore          5
	//*  97  242:iload           7
	//*  98  244:iload           5
	//*  99  246:invokestatic    #178 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//* 100  249:istore          5
	//* 101  251:iload           5
	//* 102  253:bipush          112
	//* 103  255:iand            
	//* 104  256:lookupswitch    2: default 284
	//	               48: 493
	//	               80: 478
	//* 105  284:aload_0         
	//* 106  285:getfield        #110 <Field TextPaint mTextPaint>
	//* 107  288:invokevirtual   #182 <Method float TextPaint.descent()>
	//* 108  291:aload_0         
	//* 109  292:getfield        #110 <Field TextPaint mTextPaint>
	//* 110  295:invokevirtual   #185 <Method float TextPaint.ascent()>
	//* 111  298:fsub            
	//* 112  299:fconst_2        
	//* 113  300:fdiv            
	//* 114  301:fstore_3        
	//* 115  302:aload_0         
	//* 116  303:getfield        #110 <Field TextPaint mTextPaint>
	//* 117  306:invokevirtual   #182 <Method float TextPaint.descent()>
	//* 118  309:fstore          4
	//* 119  311:aload_0         
	//* 120  312:aload_0         
	//* 121  313:getfield        #117 <Field Rect mExpandedBounds>
	//* 122  316:invokevirtual   #188 <Method int Rect.centerY()>
	//* 123  319:i2f             
	//* 124  320:fload_3         
	//* 125  321:fload           4
	//* 126  323:fsub            
	//* 127  324:fadd            
	//* 128  325:putfield        #198 <Field float mExpandedDrawY>
	//* 129  328:iload           5
	//* 130  330:ldc1            #191 <Int 0x800007>
	//* 131  332:iand            
	//* 132  333:lookupswitch    2: default 360
	//	               1: 516
	//	               5: 535
	//* 133  360:aload_0         
	//* 134  361:aload_0         
	//* 135  362:getfield        #117 <Field Rect mExpandedBounds>
	//* 136  365:getfield        #194 <Field int Rect.left>
	//* 137  368:i2f             
	//* 138  369:putfield        #200 <Field float mExpandedDrawX>
	//* 139  372:aload_0         
	//* 140  373:invokespecial   #203 <Method void clearTexture()>
	//* 141  376:aload_0         
	//* 142  377:fload_2         
	//* 143  378:invokespecial   #206 <Method void setInterpolatedTextSize(float)>
	//* 144  381:return          
			f = 0.0F;
	//  145  382:fconst_0        
	//  146  383:fstore_1        
		j = mCollapsedTextGravity;
		if(mIsRtl)
			i = 1;
		else
	//* 147  384:goto            45
			i = 0;
	//  148  387:iconst_0        
	//  149  388:istore          5
		i = GravityCompat.getAbsoluteGravity(j, i);
		i & 0x70;
		JVM INSTR lookupswitch 2: default 100
	//	               48: 408
	//	               80: 393;
		   goto _L1 _L2 _L3
_L1:
		f2 = (mTextPaint.descent() - mTextPaint.ascent()) / 2.0F;
		f3 = mTextPaint.descent();
		mCollapsedDrawY = (float)mCollapsedBounds.centerY() + (f2 - f3);
_L13:
		i & 0x800007;
		JVM INSTR lookupswitch 2: default 176
	//	               1: 431
	//	               5: 450;
		   goto _L4 _L5 _L6
_L4:
		mCollapsedDrawX = mCollapsedBounds.left;
_L14:
		calculateUsingTextSize(mExpandedTextSize);
		if(mTextToDraw != null)
			f = mTextPaint.measureText(mTextToDraw, 0, mTextToDraw.length());
		else
	//* 150  390:goto            61
	//* 151  393:aload_0         
	//* 152  394:aload_0         
	//* 153  395:getfield        #115 <Field Rect mCollapsedBounds>
	//* 154  398:getfield        #209 <Field int Rect.bottom>
	//* 155  401:i2f             
	//* 156  402:putfield        #190 <Field float mCollapsedDrawY>
	//* 157  405:goto            144
	//* 158  408:aload_0         
	//* 159  409:aload_0         
	//* 160  410:getfield        #115 <Field Rect mCollapsedBounds>
	//* 161  413:getfield        #212 <Field int Rect.top>
	//* 162  416:i2f             
	//* 163  417:aload_0         
	//* 164  418:getfield        #110 <Field TextPaint mTextPaint>
	//* 165  421:invokevirtual   #185 <Method float TextPaint.ascent()>
	//* 166  424:fsub            
	//* 167  425:putfield        #190 <Field float mCollapsedDrawY>
	//* 168  428:goto            144
	//* 169  431:aload_0         
	//* 170  432:aload_0         
	//* 171  433:getfield        #115 <Field Rect mCollapsedBounds>
	//* 172  436:invokevirtual   #215 <Method int Rect.centerX()>
	//* 173  439:i2f             
	//* 174  440:fload_1         
	//* 175  441:fconst_2        
	//* 176  442:fdiv            
	//* 177  443:fsub            
	//* 178  444:putfield        #196 <Field float mCollapsedDrawX>
	//* 179  447:goto            188
	//* 180  450:aload_0         
	//* 181  451:aload_0         
	//* 182  452:getfield        #115 <Field Rect mCollapsedBounds>
	//* 183  455:getfield        #218 <Field int Rect.right>
	//* 184  458:i2f             
	//* 185  459:fload_1         
	//* 186  460:fsub            
	//* 187  461:putfield        #196 <Field float mCollapsedDrawX>
	//* 188  464:goto            188
			f = 0.0F;
	//  189  467:fconst_0        
	//  190  468:fstore_1        
		j = mExpandedTextGravity;
		if(mIsRtl)
			i = ((int) (flag));
		else
	//* 191  469:goto            225
			i = 0;
	//  192  472:iconst_0        
	//  193  473:istore          5
		i = GravityCompat.getAbsoluteGravity(j, i);
		i & 0x70;
		JVM INSTR lookupswitch 2: default 284
	//	               48: 493
	//	               80: 478;
		   goto _L7 _L8 _L9
_L7:
		f2 = (mTextPaint.descent() - mTextPaint.ascent()) / 2.0F;
		f3 = mTextPaint.descent();
		mExpandedDrawY = (float)mExpandedBounds.centerY() + (f2 - f3);
_L15:
		i & 0x800007;
		JVM INSTR lookupswitch 2: default 360
	//	               1: 516
	//	               5: 535;
		   goto _L10 _L11 _L12
_L10:
		mExpandedDrawX = mExpandedBounds.left;
_L16:
		clearTexture();
		setInterpolatedTextSize(f1);
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
	//* 194  475:goto            242
_L9:
		mExpandedDrawY = mExpandedBounds.bottom;
	//  195  478:aload_0         
	//  196  479:aload_0         
	//  197  480:getfield        #117 <Field Rect mExpandedBounds>
	//  198  483:getfield        #209 <Field int Rect.bottom>
	//  199  486:i2f             
	//  200  487:putfield        #198 <Field float mExpandedDrawY>
		  goto _L15
	//* 201  490:goto            328
_L8:
		mExpandedDrawY = (float)mExpandedBounds.top - mTextPaint.ascent();
	//  202  493:aload_0         
	//  203  494:aload_0         
	//  204  495:getfield        #117 <Field Rect mExpandedBounds>
	//  205  498:getfield        #212 <Field int Rect.top>
	//  206  501:i2f             
	//  207  502:aload_0         
	//  208  503:getfield        #110 <Field TextPaint mTextPaint>
	//  209  506:invokevirtual   #185 <Method float TextPaint.ascent()>
	//  210  509:fsub            
	//  211  510:putfield        #198 <Field float mExpandedDrawY>
		  goto _L15
	//* 212  513:goto            328
_L11:
		mExpandedDrawX = (float)mExpandedBounds.centerX() - f / 2.0F;
	//  213  516:aload_0         
	//  214  517:aload_0         
	//  215  518:getfield        #117 <Field Rect mExpandedBounds>
	//  216  521:invokevirtual   #215 <Method int Rect.centerX()>
	//  217  524:i2f             
	//  218  525:fload_1         
	//  219  526:fconst_2        
	//  220  527:fdiv            
	//  221  528:fsub            
	//  222  529:putfield        #200 <Field float mExpandedDrawX>
		  goto _L16
	//* 223  532:goto            372
_L12:
		mExpandedDrawX = (float)mExpandedBounds.right - f;
	//  224  535:aload_0         
	//  225  536:aload_0         
	//  226  537:getfield        #117 <Field Rect mExpandedBounds>
	//  227  540:getfield        #218 <Field int Rect.right>
	//  228  543:i2f             
	//  229  544:fload_1         
	//  230  545:fsub            
	//  231  546:putfield        #200 <Field float mExpandedDrawX>
		  goto _L16
	//* 232  549:goto            372
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
			boolean flag1 = false;
	//   16   30:iconst_0        
	//   17   31:istore          6
			boolean flag = false;
	//   18   33:iconst_0        
	//   19   34:istore          5
			float f1;
			if(isClose(f, mCollapsedTextSize))
	//*  20   36:fload_1         
	//*  21   37:aload_0         
	//*  22   38:getfield        #102 <Field float mCollapsedTextSize>
	//*  23   41:invokestatic    #307 <Method boolean isClose(float, float)>
	//*  24   44:ifeq            238
			{
				f1 = mCollapsedTextSize;
	//   25   47:aload_0         
	//   26   48:getfield        #102 <Field float mCollapsedTextSize>
	//   27   51:fstore_2        
				mScale = 1.0F;
	//   28   52:aload_0         
	//   29   53:fconst_1        
	//   30   54:putfield        #309 <Field float mScale>
				if(areTypefacesDifferent(mCurrentTypeface, mCollapsedTypeface))
	//*  31   57:aload_0         
	//*  32   58:aload_0         
	//*  33   59:getfield        #311 <Field Typeface mCurrentTypeface>
	//*  34   62:aload_0         
	//*  35   63:getfield        #313 <Field Typeface mCollapsedTypeface>
	//*  36   66:invokespecial   #315 <Method boolean areTypefacesDifferent(Typeface, Typeface)>
	//*  37   69:ifeq            83
				{
					mCurrentTypeface = mCollapsedTypeface;
	//   38   72:aload_0         
	//   39   73:aload_0         
	//   40   74:getfield        #313 <Field Typeface mCollapsedTypeface>
	//   41   77:putfield        #311 <Field Typeface mCurrentTypeface>
					flag = true;
	//   42   80:iconst_1        
	//   43   81:istore          5
				}
				f = f2;
	//   44   83:fload_3         
	//   45   84:fstore_1        
			} else
	//*  46   85:iload           5
	//*  47   87:istore          6
	//*  48   89:fload_1         
	//*  49   90:fconst_0        
	//*  50   91:fcmpl           
	//*  51   92:ifle            133
	//*  52   95:aload_0         
	//*  53   96:getfield        #154 <Field float mCurrentTextSize>
	//*  54   99:fload_2         
	//*  55  100:fcmpl           
	//*  56  101:ifne            116
	//*  57  104:aload_0         
	//*  58  105:getfield        #317 <Field boolean mBoundsChanged>
	//*  59  108:ifne            116
	//*  60  111:iload           5
	//*  61  113:ifeq            339
	//*  62  116:iconst_1        
	//*  63  117:istore          5
	//*  64  119:aload_0         
	//*  65  120:fload_2         
	//*  66  121:putfield        #154 <Field float mCurrentTextSize>
	//*  67  124:aload_0         
	//*  68  125:iconst_0        
	//*  69  126:putfield        #317 <Field boolean mBoundsChanged>
	//*  70  129:iload           5
	//*  71  131:istore          6
	//*  72  133:aload_0         
	//*  73  134:getfield        #160 <Field CharSequence mTextToDraw>
	//*  74  137:ifnull          145
	//*  75  140:iload           6
	//*  76  142:ifeq            10
	//*  77  145:aload_0         
	//*  78  146:getfield        #110 <Field TextPaint mTextPaint>
	//*  79  149:aload_0         
	//*  80  150:getfield        #154 <Field float mCurrentTextSize>
	//*  81  153:invokevirtual   #320 <Method void TextPaint.setTextSize(float)>
	//*  82  156:aload_0         
	//*  83  157:getfield        #110 <Field TextPaint mTextPaint>
	//*  84  160:aload_0         
	//*  85  161:getfield        #311 <Field Typeface mCurrentTypeface>
	//*  86  164:invokevirtual   #324 <Method Typeface TextPaint.setTypeface(Typeface)>
	//*  87  167:pop             
	//*  88  168:aload_0         
	//*  89  169:getfield        #110 <Field TextPaint mTextPaint>
	//*  90  172:astore          8
	//*  91  174:aload_0         
	//*  92  175:getfield        #309 <Field float mScale>
	//*  93  178:fconst_1        
	//*  94  179:fcmpl           
	//*  95  180:ifeq            345
	//*  96  183:aload           8
	//*  97  185:iload           7
	//*  98  187:invokevirtual   #327 <Method void TextPaint.setLinearText(boolean)>
	//*  99  190:aload_0         
	//* 100  191:getfield        #300 <Field CharSequence mText>
	//* 101  194:aload_0         
	//* 102  195:getfield        #110 <Field TextPaint mTextPaint>
	//* 103  198:fload_1         
	//* 104  199:getstatic       #333 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//* 105  202:invokestatic    #339 <Method CharSequence TextUtils.ellipsize(CharSequence, TextPaint, float, android.text.TextUtils$TruncateAt)>
	//* 106  205:astore          8
	//* 107  207:aload           8
	//* 108  209:aload_0         
	//* 109  210:getfield        #160 <Field CharSequence mTextToDraw>
	//* 110  213:invokestatic    #342 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//* 111  216:ifne            10
	//* 112  219:aload_0         
	//* 113  220:aload           8
	//* 114  222:putfield        #160 <Field CharSequence mTextToDraw>
	//* 115  225:aload_0         
	//* 116  226:aload_0         
	//* 117  227:aload_0         
	//* 118  228:getfield        #160 <Field CharSequence mTextToDraw>
	//* 119  231:invokespecial   #344 <Method boolean calculateIsRtl(CharSequence)>
	//* 120  234:putfield        #172 <Field boolean mIsRtl>
	//* 121  237:return          
			{
				f1 = mExpandedTextSize;
	//  122  238:aload_0         
	//  123  239:getfield        #100 <Field float mExpandedTextSize>
	//  124  242:fstore_2        
				flag = flag1;
	//  125  243:iload           6
	//  126  245:istore          5
				if(areTypefacesDifferent(mCurrentTypeface, mExpandedTypeface))
	//* 127  247:aload_0         
	//* 128  248:aload_0         
	//* 129  249:getfield        #311 <Field Typeface mCurrentTypeface>
	//* 130  252:aload_0         
	//* 131  253:getfield        #346 <Field Typeface mExpandedTypeface>
	//* 132  256:invokespecial   #315 <Method boolean areTypefacesDifferent(Typeface, Typeface)>
	//* 133  259:ifeq            273
				{
					mCurrentTypeface = mExpandedTypeface;
	//  134  262:aload_0         
	//  135  263:aload_0         
	//  136  264:getfield        #346 <Field Typeface mExpandedTypeface>
	//  137  267:putfield        #311 <Field Typeface mCurrentTypeface>
					flag = true;
	//  138  270:iconst_1        
	//  139  271:istore          5
				}
				if(isClose(f, mExpandedTextSize))
	//* 140  273:fload_1         
	//* 141  274:aload_0         
	//* 142  275:getfield        #100 <Field float mExpandedTextSize>
	//* 143  278:invokestatic    #307 <Method boolean isClose(float, float)>
	//* 144  281:ifeq            320
					mScale = 1.0F;
	//  145  284:aload_0         
	//  146  285:fconst_1        
	//  147  286:putfield        #309 <Field float mScale>
				else
	//* 148  289:aload_0         
	//* 149  290:getfield        #102 <Field float mCollapsedTextSize>
	//* 150  293:aload_0         
	//* 151  294:getfield        #100 <Field float mExpandedTextSize>
	//* 152  297:fdiv            
	//* 153  298:fstore_1        
	//* 154  299:fload           4
	//* 155  301:fload_1         
	//* 156  302:fmul            
	//* 157  303:fload_3         
	//* 158  304:fcmpl           
	//* 159  305:ifle            333
	//* 160  308:fload_3         
	//* 161  309:fload_1         
	//* 162  310:fdiv            
	//* 163  311:fload           4
	//* 164  313:invokestatic    #352 <Method float Math.min(float, float)>
	//* 165  316:fstore_1        
	//* 166  317:goto            85
					mScale = f / mExpandedTextSize;
	//  167  320:aload_0         
	//  168  321:fload_1         
	//  169  322:aload_0         
	//  170  323:getfield        #100 <Field float mExpandedTextSize>
	//  171  326:fdiv            
	//  172  327:putfield        #309 <Field float mScale>
				f = mCollapsedTextSize / mExpandedTextSize;
				if(f3 * f > f2)
					f = Math.min(f2 / f, f3);
				else
	//* 173  330:goto            289
					f = f3;
	//  174  333:fload           4
	//  175  335:fstore_1        
			}
			flag1 = flag;
			if(f > 0.0F)
			{
				Object obj;
				if(mCurrentTextSize != f1 || mBoundsChanged || flag)
					flag = true;
				else
	//* 176  336:goto            85
					flag = false;
	//  177  339:iconst_0        
	//  178  340:istore          5
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
	//* 179  342:goto            119
					flag2 = false;
	//  180  345:iconst_0        
	//  181  346:istore          7
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
	//* 182  348:goto            183
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
