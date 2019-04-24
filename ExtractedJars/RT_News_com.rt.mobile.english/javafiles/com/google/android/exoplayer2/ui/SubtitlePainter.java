// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.*;
import android.text.*;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.exoplayer2.text.CaptionStyleCompat;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Util;

final class SubtitlePainter
{

	public SubtitlePainter(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #66  <Class RectF>
	//    4    8:dup             
	//    5    9:invokespecial   #67  <Method void RectF()>
	//    6   12:putfield        #69  <Field RectF lineBounds>
		TypedArray typedarray = context.obtainStyledAttributes(((android.util.AttributeSet) (null)), new int[] {
			0x1010217, 0x1010218
		}, 0, 0);
	//    7   15:aload_1         
	//    8   16:aconst_null     
	//    9   17:iconst_2        
	//   10   18:newarray        int[]
	//   11   20:dup             
	//   12   21:iconst_0        
	//   13   22:ldc1            #70  <Int 0x1010217>
	//   14   24:iastore         
	//   15   25:dup             
	//   16   26:iconst_1        
	//   17   27:ldc1            #71  <Int 0x1010218>
	//   18   29:iastore         
	//   19   30:iconst_0        
	//   20   31:iconst_0        
	//   21   32:invokevirtual   #77  <Method TypedArray Context.obtainStyledAttributes(android.util.AttributeSet, int[], int, int)>
	//   22   35:astore_3        
		spacingAdd = typedarray.getDimensionPixelSize(0, 0);
	//   23   36:aload_0         
	//   24   37:aload_3         
	//   25   38:iconst_0        
	//   26   39:iconst_0        
	//   27   40:invokevirtual   #83  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   28   43:i2f             
	//   29   44:putfield        #85  <Field float spacingAdd>
		spacingMult = typedarray.getFloat(1, 1.0F);
	//   30   47:aload_0         
	//   31   48:aload_3         
	//   32   49:iconst_1        
	//   33   50:fconst_1        
	//   34   51:invokevirtual   #89  <Method float TypedArray.getFloat(int, float)>
	//   35   54:putfield        #91  <Field float spacingMult>
		typedarray.recycle();
	//   36   57:aload_3         
	//   37   58:invokevirtual   #94  <Method void TypedArray.recycle()>
		float f = Math.round((2.0F * (float)context.getResources().getDisplayMetrics().densityDpi) / 160F);
	//   38   61:fconst_2        
	//   39   62:aload_1         
	//   40   63:invokevirtual   #98  <Method Resources Context.getResources()>
	//   41   66:invokevirtual   #104 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   42   69:getfield        #109 <Field int DisplayMetrics.densityDpi>
	//   43   72:i2f             
	//   44   73:fmul            
	//   45   74:ldc1            #110 <Float 160F>
	//   46   76:fdiv            
	//   47   77:invokestatic    #116 <Method int Math.round(float)>
	//   48   80:i2f             
	//   49   81:fstore_2        
		cornerRadius = f;
	//   50   82:aload_0         
	//   51   83:fload_2         
	//   52   84:putfield        #118 <Field float cornerRadius>
		outlineWidth = f;
	//   53   87:aload_0         
	//   54   88:fload_2         
	//   55   89:putfield        #120 <Field float outlineWidth>
		shadowRadius = f;
	//   56   92:aload_0         
	//   57   93:fload_2         
	//   58   94:putfield        #122 <Field float shadowRadius>
		shadowOffset = f;
	//   59   97:aload_0         
	//   60   98:fload_2         
	//   61   99:putfield        #124 <Field float shadowOffset>
	//   62  102:aload_0         
	//   63  103:new             #126 <Class TextPaint>
	//   64  106:dup             
	//   65  107:invokespecial   #127 <Method void TextPaint()>
	//   66  110:putfield        #129 <Field TextPaint textPaint>
		textPaint.setAntiAlias(true);
	//   67  113:aload_0         
	//   68  114:getfield        #129 <Field TextPaint textPaint>
	//   69  117:iconst_1        
	//   70  118:invokevirtual   #133 <Method void TextPaint.setAntiAlias(boolean)>
		textPaint.setSubpixelText(true);
	//   71  121:aload_0         
	//   72  122:getfield        #129 <Field TextPaint textPaint>
	//   73  125:iconst_1        
	//   74  126:invokevirtual   #136 <Method void TextPaint.setSubpixelText(boolean)>
	//   75  129:aload_0         
	//   76  130:new             #138 <Class Paint>
	//   77  133:dup             
	//   78  134:invokespecial   #139 <Method void Paint()>
	//   79  137:putfield        #141 <Field Paint paint>
		paint.setAntiAlias(true);
	//   80  140:aload_0         
	//   81  141:getfield        #141 <Field Paint paint>
	//   82  144:iconst_1        
	//   83  145:invokevirtual   #142 <Method void Paint.setAntiAlias(boolean)>
		paint.setStyle(android.graphics.Paint.Style.FILL);
	//   84  148:aload_0         
	//   85  149:getfield        #141 <Field Paint paint>
	//   86  152:getstatic       #148 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   87  155:invokevirtual   #152 <Method void Paint.setStyle(android.graphics.Paint$Style)>
	//   88  158:return          
	}

	private static boolean areCharSequencesEqual(CharSequence charsequence, CharSequence charsequence1)
	{
		return charsequence == charsequence1 || charsequence != null && ((Object) (charsequence)).equals(((Object) (charsequence1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       22
	//    3    5:aload_0         
	//    4    6:ifnull          20
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #159 <Method boolean Object.equals(Object)>
	//    8   14:ifeq            20
	//    9   17:goto            22
	//   10   20:iconst_0        
	//   11   21:ireturn         
	//   12   22:iconst_1        
	//   13   23:ireturn         
	}

	private void drawBitmapLayout(Canvas canvas)
	{
		canvas.drawBitmap(cueBitmap, ((Rect) (null)), bitmapRect, ((Paint) (null)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #163 <Field Bitmap cueBitmap>
	//    3    5:aconst_null     
	//    4    6:aload_0         
	//    5    7:getfield        #165 <Field Rect bitmapRect>
	//    6   10:aconst_null     
	//    7   11:invokevirtual   #171 <Method void Canvas.drawBitmap(Bitmap, Rect, Rect, Paint)>
	//    8   14:return          
	}

	private void drawLayout(Canvas canvas, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            10
		{
			drawTextLayout(canvas);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #176 <Method void drawTextLayout(Canvas)>
			return;
	//    5    9:return          
		} else
		{
			drawBitmapLayout(canvas);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #178 <Method void drawBitmapLayout(Canvas)>
			return;
	//    9   15:return          
		}
	}

	private void drawTextLayout(Canvas canvas)
	{
		StaticLayout staticlayout = textLayout;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field StaticLayout textLayout>
	//    2    4:astore          9
		if(staticlayout == null)
	//*   3    6:aload           9
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		int j1 = canvas.save();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #184 <Method int Canvas.save()>
	//    8   16:istore          8
		canvas.translate(textLeft, textTop);
	//    9   18:aload_1         
	//   10   19:aload_0         
	//   11   20:getfield        #186 <Field int textLeft>
	//   12   23:i2f             
	//   13   24:aload_0         
	//   14   25:getfield        #188 <Field int textTop>
	//   15   28:i2f             
	//   16   29:invokevirtual   #192 <Method void Canvas.translate(float, float)>
		if(Color.alpha(windowColor) > 0)
	//*  17   32:aload_0         
	//*  18   33:getfield        #194 <Field int windowColor>
	//*  19   36:invokestatic    #200 <Method int Color.alpha(int)>
	//*  20   39:ifle            85
		{
			paint.setColor(windowColor);
	//   21   42:aload_0         
	//   22   43:getfield        #141 <Field Paint paint>
	//   23   46:aload_0         
	//   24   47:getfield        #194 <Field int windowColor>
	//   25   50:invokevirtual   #204 <Method void Paint.setColor(int)>
			canvas.drawRect(-textPaddingX, 0.0F, staticlayout.getWidth() + textPaddingX, staticlayout.getHeight(), paint);
	//   26   53:aload_1         
	//   27   54:aload_0         
	//   28   55:getfield        #206 <Field int textPaddingX>
	//   29   58:ineg            
	//   30   59:i2f             
	//   31   60:fconst_0        
	//   32   61:aload           9
	//   33   63:invokevirtual   #211 <Method int StaticLayout.getWidth()>
	//   34   66:aload_0         
	//   35   67:getfield        #206 <Field int textPaddingX>
	//   36   70:iadd            
	//   37   71:i2f             
	//   38   72:aload           9
	//   39   74:invokevirtual   #214 <Method int StaticLayout.getHeight()>
	//   40   77:i2f             
	//   41   78:aload_0         
	//   42   79:getfield        #141 <Field Paint paint>
	//   43   82:invokevirtual   #218 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}
		if(Color.alpha(backgroundColor) > 0)
	//*  44   85:aload_0         
	//*  45   86:getfield        #220 <Field int backgroundColor>
	//*  46   89:invokestatic    #200 <Method int Color.alpha(int)>
	//*  47   92:ifle            246
		{
			paint.setColor(backgroundColor);
	//   48   95:aload_0         
	//   49   96:getfield        #141 <Field Paint paint>
	//   50   99:aload_0         
	//   51  100:getfield        #220 <Field int backgroundColor>
	//   52  103:invokevirtual   #204 <Method void Paint.setColor(int)>
			float f = staticlayout.getLineTop(0);
	//   53  106:aload           9
	//   54  108:iconst_0        
	//   55  109:invokevirtual   #223 <Method int StaticLayout.getLineTop(int)>
	//   56  112:i2f             
	//   57  113:fstore_2        
			int j = staticlayout.getLineCount();
	//   58  114:aload           9
	//   59  116:invokevirtual   #226 <Method int StaticLayout.getLineCount()>
	//   60  119:istore          6
			for(int i = 0; i < j; i++)
	//*  61  121:iconst_0        
	//*  62  122:istore          5
	//*  63  124:iload           5
	//*  64  126:iload           6
	//*  65  128:icmpge          246
			{
				float f2 = staticlayout.getLineLeft(i);
	//   66  131:aload           9
	//   67  133:iload           5
	//   68  135:invokevirtual   #230 <Method float StaticLayout.getLineLeft(int)>
	//   69  138:fstore_3        
				float f4 = staticlayout.getLineRight(i);
	//   70  139:aload           9
	//   71  141:iload           5
	//   72  143:invokevirtual   #233 <Method float StaticLayout.getLineRight(int)>
	//   73  146:fstore          4
				lineBounds.left = f2 - (float)textPaddingX;
	//   74  148:aload_0         
	//   75  149:getfield        #69  <Field RectF lineBounds>
	//   76  152:fload_3         
	//   77  153:aload_0         
	//   78  154:getfield        #206 <Field int textPaddingX>
	//   79  157:i2f             
	//   80  158:fsub            
	//   81  159:putfield        #236 <Field float RectF.left>
				lineBounds.right = (float)textPaddingX + f4;
	//   82  162:aload_0         
	//   83  163:getfield        #69  <Field RectF lineBounds>
	//   84  166:aload_0         
	//   85  167:getfield        #206 <Field int textPaddingX>
	//   86  170:i2f             
	//   87  171:fload           4
	//   88  173:fadd            
	//   89  174:putfield        #239 <Field float RectF.right>
				lineBounds.top = f;
	//   90  177:aload_0         
	//   91  178:getfield        #69  <Field RectF lineBounds>
	//   92  181:fload_2         
	//   93  182:putfield        #242 <Field float RectF.top>
				lineBounds.bottom = staticlayout.getLineBottom(i);
	//   94  185:aload_0         
	//   95  186:getfield        #69  <Field RectF lineBounds>
	//   96  189:aload           9
	//   97  191:iload           5
	//   98  193:invokevirtual   #245 <Method int StaticLayout.getLineBottom(int)>
	//   99  196:i2f             
	//  100  197:putfield        #248 <Field float RectF.bottom>
				f = lineBounds.bottom;
	//  101  200:aload_0         
	//  102  201:getfield        #69  <Field RectF lineBounds>
	//  103  204:getfield        #248 <Field float RectF.bottom>
	//  104  207:fstore_2        
				if(f4 - f2 > 0.0F)
	//* 105  208:fload           4
	//* 106  210:fload_3         
	//* 107  211:fsub            
	//* 108  212:fconst_0        
	//* 109  213:fcmpl           
	//* 110  214:ifle            237
					canvas.drawRoundRect(lineBounds, cornerRadius, cornerRadius, paint);
	//  111  217:aload_1         
	//  112  218:aload_0         
	//  113  219:getfield        #69  <Field RectF lineBounds>
	//  114  222:aload_0         
	//  115  223:getfield        #118 <Field float cornerRadius>
	//  116  226:aload_0         
	//  117  227:getfield        #118 <Field float cornerRadius>
	//  118  230:aload_0         
	//  119  231:getfield        #141 <Field Paint paint>
	//  120  234:invokevirtual   #252 <Method void Canvas.drawRoundRect(RectF, float, float, Paint)>
			}

	//  121  237:iload           5
	//  122  239:iconst_1        
	//  123  240:iadd            
	//  124  241:istore          5
		}
	//* 125  243:goto            124
		int k = edgeType;
	//  126  246:aload_0         
	//  127  247:getfield        #254 <Field int edgeType>
	//  128  250:istore          6
		boolean flag = true;
	//  129  252:iconst_1        
	//  130  253:istore          5
		if(k == 1)
	//* 131  255:iload           6
	//* 132  257:iconst_1        
	//* 133  258:icmpne          312
		{
			textPaint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
	//  134  261:aload_0         
	//  135  262:getfield        #129 <Field TextPaint textPaint>
	//  136  265:getstatic       #260 <Field android.graphics.Paint$Join android.graphics.Paint$Join.ROUND>
	//  137  268:invokevirtual   #264 <Method void TextPaint.setStrokeJoin(android.graphics.Paint$Join)>
			textPaint.setStrokeWidth(outlineWidth);
	//  138  271:aload_0         
	//  139  272:getfield        #129 <Field TextPaint textPaint>
	//  140  275:aload_0         
	//  141  276:getfield        #120 <Field float outlineWidth>
	//  142  279:invokevirtual   #268 <Method void TextPaint.setStrokeWidth(float)>
			textPaint.setColor(edgeColor);
	//  143  282:aload_0         
	//  144  283:getfield        #129 <Field TextPaint textPaint>
	//  145  286:aload_0         
	//  146  287:getfield        #270 <Field int edgeColor>
	//  147  290:invokevirtual   #271 <Method void TextPaint.setColor(int)>
			textPaint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
	//  148  293:aload_0         
	//  149  294:getfield        #129 <Field TextPaint textPaint>
	//  150  297:getstatic       #274 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL_AND_STROKE>
	//  151  300:invokevirtual   #275 <Method void TextPaint.setStyle(android.graphics.Paint$Style)>
			staticlayout.draw(canvas);
	//  152  303:aload           9
	//  153  305:aload_1         
	//  154  306:invokevirtual   #278 <Method void StaticLayout.draw(Canvas)>
		} else
	//* 155  309:goto            483
		if(edgeType == 2)
	//* 156  312:aload_0         
	//* 157  313:getfield        #254 <Field int edgeType>
	//* 158  316:iconst_2        
	//* 159  317:icmpne          346
			textPaint.setShadowLayer(shadowRadius, shadowOffset, shadowOffset, edgeColor);
	//  160  320:aload_0         
	//  161  321:getfield        #129 <Field TextPaint textPaint>
	//  162  324:aload_0         
	//  163  325:getfield        #122 <Field float shadowRadius>
	//  164  328:aload_0         
	//  165  329:getfield        #124 <Field float shadowOffset>
	//  166  332:aload_0         
	//  167  333:getfield        #124 <Field float shadowOffset>
	//  168  336:aload_0         
	//  169  337:getfield        #270 <Field int edgeColor>
	//  170  340:invokevirtual   #282 <Method void TextPaint.setShadowLayer(float, float, float, int)>
		else
	//* 171  343:goto            483
		if(edgeType == 3 || edgeType == 4)
	//* 172  346:aload_0         
	//* 173  347:getfield        #254 <Field int edgeType>
	//* 174  350:iconst_3        
	//* 175  351:icmpeq          362
	//* 176  354:aload_0         
	//* 177  355:getfield        #254 <Field int edgeType>
	//* 178  358:iconst_4        
	//* 179  359:icmpne          483
		{
			if(edgeType != 3)
	//* 180  362:aload_0         
	//* 181  363:getfield        #254 <Field int edgeType>
	//* 182  366:iconst_3        
	//* 183  367:icmpne          373
	//* 184  370:goto            376
				flag = false;
	//  185  373:iconst_0        
	//  186  374:istore          5
			int i1 = -1;
	//  187  376:iconst_m1       
	//  188  377:istore          7
			int l;
			if(flag)
	//* 189  379:iload           5
	//* 190  381:ifeq            390
				l = -1;
	//  191  384:iconst_m1       
	//  192  385:istore          6
			else
	//* 193  387:goto            396
				l = edgeColor;
	//  194  390:aload_0         
	//  195  391:getfield        #270 <Field int edgeColor>
	//  196  394:istore          6
			if(flag)
	//* 197  396:iload           5
	//* 198  398:ifeq            407
				i1 = edgeColor;
	//  199  401:aload_0         
	//  200  402:getfield        #270 <Field int edgeColor>
	//  201  405:istore          7
			float f1 = shadowRadius / 2.0F;
	//  202  407:aload_0         
	//  203  408:getfield        #122 <Field float shadowRadius>
	//  204  411:fconst_2        
	//  205  412:fdiv            
	//  206  413:fstore_2        
			textPaint.setColor(foregroundColor);
	//  207  414:aload_0         
	//  208  415:getfield        #129 <Field TextPaint textPaint>
	//  209  418:aload_0         
	//  210  419:getfield        #284 <Field int foregroundColor>
	//  211  422:invokevirtual   #271 <Method void TextPaint.setColor(int)>
			textPaint.setStyle(android.graphics.Paint.Style.FILL);
	//  212  425:aload_0         
	//  213  426:getfield        #129 <Field TextPaint textPaint>
	//  214  429:getstatic       #148 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//  215  432:invokevirtual   #275 <Method void TextPaint.setStyle(android.graphics.Paint$Style)>
			TextPaint textpaint = textPaint;
	//  216  435:aload_0         
	//  217  436:getfield        #129 <Field TextPaint textPaint>
	//  218  439:astore          10
			float f3 = shadowRadius;
	//  219  441:aload_0         
	//  220  442:getfield        #122 <Field float shadowRadius>
	//  221  445:fstore_3        
			float f5 = -f1;
	//  222  446:fload_2         
	//  223  447:fneg            
	//  224  448:fstore          4
			textpaint.setShadowLayer(f3, f5, f5, l);
	//  225  450:aload           10
	//  226  452:fload_3         
	//  227  453:fload           4
	//  228  455:fload           4
	//  229  457:iload           6
	//  230  459:invokevirtual   #282 <Method void TextPaint.setShadowLayer(float, float, float, int)>
			staticlayout.draw(canvas);
	//  231  462:aload           9
	//  232  464:aload_1         
	//  233  465:invokevirtual   #278 <Method void StaticLayout.draw(Canvas)>
			textPaint.setShadowLayer(shadowRadius, f1, f1, i1);
	//  234  468:aload_0         
	//  235  469:getfield        #129 <Field TextPaint textPaint>
	//  236  472:aload_0         
	//  237  473:getfield        #122 <Field float shadowRadius>
	//  238  476:fload_2         
	//  239  477:fload_2         
	//  240  478:iload           7
	//  241  480:invokevirtual   #282 <Method void TextPaint.setShadowLayer(float, float, float, int)>
		}
		textPaint.setColor(foregroundColor);
	//  242  483:aload_0         
	//  243  484:getfield        #129 <Field TextPaint textPaint>
	//  244  487:aload_0         
	//  245  488:getfield        #284 <Field int foregroundColor>
	//  246  491:invokevirtual   #271 <Method void TextPaint.setColor(int)>
		textPaint.setStyle(android.graphics.Paint.Style.FILL);
	//  247  494:aload_0         
	//  248  495:getfield        #129 <Field TextPaint textPaint>
	//  249  498:getstatic       #148 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//  250  501:invokevirtual   #275 <Method void TextPaint.setStyle(android.graphics.Paint$Style)>
		staticlayout.draw(canvas);
	//  251  504:aload           9
	//  252  506:aload_1         
	//  253  507:invokevirtual   #278 <Method void StaticLayout.draw(Canvas)>
		textPaint.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
	//  254  510:aload_0         
	//  255  511:getfield        #129 <Field TextPaint textPaint>
	//  256  514:fconst_0        
	//  257  515:fconst_0        
	//  258  516:fconst_0        
	//  259  517:iconst_0        
	//  260  518:invokevirtual   #282 <Method void TextPaint.setShadowLayer(float, float, float, int)>
		canvas.restoreToCount(j1);
	//  261  521:aload_1         
	//  262  522:iload           8
	//  263  524:invokevirtual   #287 <Method void Canvas.restoreToCount(int)>
	//  264  527:return          
	}

	private void setupBitmapLayout()
	{
		float f2;
		float f3;
		int i;
		int j;
		i = parentRight;
	//    0    0:aload_0         
	//    1    1:getfield        #290 <Field int parentRight>
	//    2    4:istore          5
		j = parentLeft;
	//    3    6:aload_0         
	//    4    7:getfield        #292 <Field int parentLeft>
	//    5   10:istore          6
		int k = parentBottom;
	//    6   12:aload_0         
	//    7   13:getfield        #294 <Field int parentBottom>
	//    8   16:istore          7
		int i1 = parentTop;
	//    9   18:aload_0         
	//   10   19:getfield        #296 <Field int parentTop>
	//   11   22:istore          8
		f2 = parentLeft;
	//   12   24:aload_0         
	//   13   25:getfield        #292 <Field int parentLeft>
	//   14   28:i2f             
	//   15   29:fstore_2        
		float f = i - j;
	//   16   30:iload           5
	//   17   32:iload           6
	//   18   34:isub            
	//   19   35:i2f             
	//   20   36:fstore_1        
		f3 = f2 + cuePosition * f;
	//   21   37:fload_2         
	//   22   38:aload_0         
	//   23   39:getfield        #298 <Field float cuePosition>
	//   24   42:fload_1         
	//   25   43:fmul            
	//   26   44:fadd            
	//   27   45:fstore_3        
		f2 = parentTop;
	//   28   46:aload_0         
	//   29   47:getfield        #296 <Field int parentTop>
	//   30   50:i2f             
	//   31   51:fstore_2        
		float f4 = k - i1;
	//   32   52:iload           7
	//   33   54:iload           8
	//   34   56:isub            
	//   35   57:i2f             
	//   36   58:fstore          4
		f2 += cueLine * f4;
	//   37   60:fload_2         
	//   38   61:aload_0         
	//   39   62:getfield        #300 <Field float cueLine>
	//   40   65:fload           4
	//   41   67:fmul            
	//   42   68:fadd            
	//   43   69:fstore_2        
		j = Math.round(f * cueSize);
	//   44   70:fload_1         
	//   45   71:aload_0         
	//   46   72:getfield        #302 <Field float cueSize>
	//   47   75:fmul            
	//   48   76:invokestatic    #116 <Method int Math.round(float)>
	//   49   79:istore          6
		if(cueBitmapHeight != 1.401298E-45F)
	//*  50   81:aload_0         
	//*  51   82:getfield        #304 <Field float cueBitmapHeight>
	//*  52   85:ldc2            #305 <Float 1.401298E-45F>
	//*  53   88:fcmpl           
	//*  54   89:ifeq            107
			i = Math.round(f4 * cueBitmapHeight);
	//   55   92:fload           4
	//   56   94:aload_0         
	//   57   95:getfield        #304 <Field float cueBitmapHeight>
	//   58   98:fmul            
	//   59   99:invokestatic    #116 <Method int Math.round(float)>
	//   60  102:istore          5
		else
	//*  61  104:goto            133
			i = Math.round((float)j * ((float)cueBitmap.getHeight() / (float)cueBitmap.getWidth()));
	//   62  107:iload           6
	//   63  109:i2f             
	//   64  110:aload_0         
	//   65  111:getfield        #163 <Field Bitmap cueBitmap>
	//   66  114:invokevirtual   #308 <Method int Bitmap.getHeight()>
	//   67  117:i2f             
	//   68  118:aload_0         
	//   69  119:getfield        #163 <Field Bitmap cueBitmap>
	//   70  122:invokevirtual   #309 <Method int Bitmap.getWidth()>
	//   71  125:i2f             
	//   72  126:fdiv            
	//   73  127:fmul            
	//   74  128:invokestatic    #116 <Method int Math.round(float)>
	//   75  131:istore          5
		if(cueLineAnchor != 2) goto _L2; else goto _L1
	//   76  133:aload_0         
	//   77  134:getfield        #311 <Field int cueLineAnchor>
	//   78  137:iconst_2        
	//   79  138:icmpne          152
_L1:
		float f1 = j;
	//   80  141:iload           6
	//   81  143:i2f             
	//   82  144:fstore_1        
_L4:
		f1 = f3 - f1;
	//   83  145:fload_3         
	//   84  146:fload_1         
	//   85  147:fsub            
	//   86  148:fstore_1        
		break; /* Loop/switch isn't completed */
	//   87  149:goto            171
_L2:
		f1 = f3;
	//   88  152:fload_3         
	//   89  153:fstore_1        
		if(cueLineAnchor != 1)
			break; /* Loop/switch isn't completed */
	//   90  154:aload_0         
	//   91  155:getfield        #311 <Field int cueLineAnchor>
	//   92  158:iconst_1        
	//   93  159:icmpne          171
		f1 = j / 2;
	//   94  162:iload           6
	//   95  164:iconst_2        
	//   96  165:idiv            
	//   97  166:i2f             
	//   98  167:fstore_1        
		if(true) goto _L4; else goto _L3
	//   99  168:goto            145
_L3:
		int l = Math.round(f1);
	//  100  171:fload_1         
	//  101  172:invokestatic    #116 <Method int Math.round(float)>
	//  102  175:istore          7
		if(cuePositionAnchor != 2) goto _L6; else goto _L5
	//  103  177:aload_0         
	//  104  178:getfield        #313 <Field int cuePositionAnchor>
	//  105  181:iconst_2        
	//  106  182:icmpne          196
_L5:
		f1 = i;
	//  107  185:iload           5
	//  108  187:i2f             
	//  109  188:fstore_1        
_L8:
		f1 = f2 - f1;
	//  110  189:fload_2         
	//  111  190:fload_1         
	//  112  191:fsub            
	//  113  192:fstore_1        
		break; /* Loop/switch isn't completed */
	//  114  193:goto            215
_L6:
		f1 = f2;
	//  115  196:fload_2         
	//  116  197:fstore_1        
		if(cuePositionAnchor != 1)
			break; /* Loop/switch isn't completed */
	//  117  198:aload_0         
	//  118  199:getfield        #313 <Field int cuePositionAnchor>
	//  119  202:iconst_1        
	//  120  203:icmpne          215
		f1 = i / 2;
	//  121  206:iload           5
	//  122  208:iconst_2        
	//  123  209:idiv            
	//  124  210:i2f             
	//  125  211:fstore_1        
		if(true) goto _L8; else goto _L7
	//  126  212:goto            189
_L7:
		int j1 = Math.round(f1);
	//  127  215:fload_1         
	//  128  216:invokestatic    #116 <Method int Math.round(float)>
	//  129  219:istore          8
		bitmapRect = new Rect(l, j1, j + l, i + j1);
	//  130  221:aload_0         
	//  131  222:new             #315 <Class Rect>
	//  132  225:dup             
	//  133  226:iload           7
	//  134  228:iload           8
	//  135  230:iload           6
	//  136  232:iload           7
	//  137  234:iadd            
	//  138  235:iload           5
	//  139  237:iload           8
	//  140  239:iadd            
	//  141  240:invokespecial   #318 <Method void Rect(int, int, int, int)>
	//  142  243:putfield        #165 <Field Rect bitmapRect>
		return;
	//  143  246:return          
	}

	private void setupTextLayout()
	{
		int j2 = parentRight - parentLeft;
	//    0    0:aload_0         
	//    1    1:getfield        #290 <Field int parentRight>
	//    2    4:aload_0         
	//    3    5:getfield        #292 <Field int parentLeft>
	//    4    8:isub            
	//    5    9:istore          7
		int l1 = parentBottom - parentTop;
	//    6   11:aload_0         
	//    7   12:getfield        #294 <Field int parentBottom>
	//    8   15:aload_0         
	//    9   16:getfield        #296 <Field int parentTop>
	//   10   19:isub            
	//   11   20:istore          5
		textPaint.setTextSize(defaultTextSizePx);
	//   12   22:aload_0         
	//   13   23:getfield        #129 <Field TextPaint textPaint>
	//   14   26:aload_0         
	//   15   27:getfield        #321 <Field float defaultTextSizePx>
	//   16   30:invokevirtual   #324 <Method void TextPaint.setTextSize(float)>
		int k1 = (int)(defaultTextSizePx * 0.125F + 0.5F);
	//   17   33:aload_0         
	//   18   34:getfield        #321 <Field float defaultTextSizePx>
	//   19   37:ldc1            #7   <Float 0.125F>
	//   20   39:fmul            
	//   21   40:ldc2            #325 <Float 0.5F>
	//   22   43:fadd            
	//   23   44:f2i             
	//   24   45:istore          4
		int k2 = k1 * 2;
	//   25   47:iload           4
	//   26   49:iconst_2        
	//   27   50:imul            
	//   28   51:istore          8
		int l = j2 - k2;
	//   29   53:iload           7
	//   30   55:iload           8
	//   31   57:isub            
	//   32   58:istore_2        
		int i = l;
	//   33   59:iload_2         
	//   34   60:istore_1        
		if(cueSize != 1.401298E-45F)
	//*  35   61:aload_0         
	//*  36   62:getfield        #302 <Field float cueSize>
	//*  37   65:ldc2            #305 <Float 1.401298E-45F>
	//*  38   68:fcmpl           
	//*  39   69:ifeq            81
			i = (int)((float)l * cueSize);
	//   40   72:iload_2         
	//   41   73:i2f             
	//   42   74:aload_0         
	//   43   75:getfield        #302 <Field float cueSize>
	//   44   78:fmul            
	//   45   79:f2i             
	//   46   80:istore_1        
		if(i <= 0)
	//*  47   81:iload_1         
	//*  48   82:ifgt            95
		{
			Log.w("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
	//   49   85:ldc1            #11  <String "SubtitlePainter">
	//   50   87:ldc2            #327 <String "Skipped drawing subtitle cue (insufficient space)">
	//   51   90:invokestatic    #333 <Method int Log.w(String, String)>
	//   52   93:pop             
			return;
	//   53   94:return          
		}
		Object obj1 = ((Object) (cueText));
	//   54   95:aload_0         
	//   55   96:getfield        #335 <Field CharSequence cueText>
	//   56   99:astore          11
		Object obj;
		if(!applyEmbeddedStyles)
	//*  57  101:aload_0         
	//*  58  102:getfield        #337 <Field boolean applyEmbeddedStyles>
	//*  59  105:ifne            120
			obj = ((Object) (((CharSequence) (obj1)).toString()));
	//   60  108:aload           11
	//   61  110:invokeinterface #343 <Method String CharSequence.toString()>
	//   62  115:astore          10
		else
	//*  63  117:goto            282
		if(!applyEmbeddedFontSizes)
	//*  64  120:aload_0         
	//*  65  121:getfield        #345 <Field boolean applyEmbeddedFontSizes>
	//*  66  124:ifne            232
		{
			obj1 = ((Object) (new SpannableStringBuilder(((CharSequence) (obj1)))));
	//   67  127:new             #347 <Class SpannableStringBuilder>
	//   68  130:dup             
	//   69  131:aload           11
	//   70  133:invokespecial   #350 <Method void SpannableStringBuilder(CharSequence)>
	//   71  136:astore          11
			l = ((SpannableStringBuilder) (obj1)).length();
	//   72  138:aload           11
	//   73  140:invokevirtual   #353 <Method int SpannableStringBuilder.length()>
	//   74  143:istore_2        
			obj = ((Object) ((AbsoluteSizeSpan[])((SpannableStringBuilder) (obj1)).getSpans(0, l, android/text/style/AbsoluteSizeSpan)));
	//   75  144:aload           11
	//   76  146:iconst_0        
	//   77  147:iload_2         
	//   78  148:ldc2            #355 <Class AbsoluteSizeSpan>
	//   79  151:invokevirtual   #359 <Method Object[] SpannableStringBuilder.getSpans(int, int, Class)>
	//   80  154:checkcast       #361 <Class AbsoluteSizeSpan[]>
	//   81  157:astore          10
			RelativeSizeSpan arelativesizespan[] = (RelativeSizeSpan[])((SpannableStringBuilder) (obj1)).getSpans(0, l, android/text/style/RelativeSizeSpan);
	//   82  159:aload           11
	//   83  161:iconst_0        
	//   84  162:iload_2         
	//   85  163:ldc2            #363 <Class RelativeSizeSpan>
	//   86  166:invokevirtual   #359 <Method Object[] SpannableStringBuilder.getSpans(int, int, Class)>
	//   87  169:checkcast       #365 <Class RelativeSizeSpan[]>
	//   88  172:astore          12
			int i1 = obj.length;
	//   89  174:aload           10
	//   90  176:arraylength     
	//   91  177:istore_3        
			for(l = 0; l < i1; l++)
	//*  92  178:iconst_0        
	//*  93  179:istore_2        
	//*  94  180:iload_2         
	//*  95  181:iload_3         
	//*  96  182:icmpge          201
				((SpannableStringBuilder) (obj1)).removeSpan(((Object) (obj[l])));
	//   97  185:aload           11
	//   98  187:aload           10
	//   99  189:iload_2         
	//  100  190:aaload          
	//  101  191:invokevirtual   #369 <Method void SpannableStringBuilder.removeSpan(Object)>

	//  102  194:iload_2         
	//  103  195:iconst_1        
	//  104  196:iadd            
	//  105  197:istore_2        
	//* 106  198:goto            180
			i1 = arelativesizespan.length;
	//  107  201:aload           12
	//  108  203:arraylength     
	//  109  204:istore_3        
			l = 0;
	//  110  205:iconst_0        
	//  111  206:istore_2        
			do
			{
				obj = obj1;
	//  112  207:aload           11
	//  113  209:astore          10
				if(l >= i1)
					break;
	//  114  211:iload_2         
	//  115  212:iload_3         
	//  116  213:icmpge          282
				((SpannableStringBuilder) (obj1)).removeSpan(((Object) (arelativesizespan[l])));
	//  117  216:aload           11
	//  118  218:aload           12
	//  119  220:iload_2         
	//  120  221:aaload          
	//  121  222:invokevirtual   #369 <Method void SpannableStringBuilder.removeSpan(Object)>
				l++;
	//  122  225:iload_2         
	//  123  226:iconst_1        
	//  124  227:iadd            
	//  125  228:istore_2        
			} while(true);
	//  126  229:goto            207
		} else
		{
			obj = obj1;
	//  127  232:aload           11
	//  128  234:astore          10
			if(cueTextSizePx > 0.0F)
	//* 129  236:aload_0         
	//* 130  237:getfield        #371 <Field float cueTextSizePx>
	//* 131  240:fconst_0        
	//* 132  241:fcmpl           
	//* 133  242:ifle            117
			{
				obj = ((Object) (new SpannableStringBuilder(((CharSequence) (obj1)))));
	//  134  245:new             #347 <Class SpannableStringBuilder>
	//  135  248:dup             
	//  136  249:aload           11
	//  137  251:invokespecial   #350 <Method void SpannableStringBuilder(CharSequence)>
	//  138  254:astore          10
				((SpannableStringBuilder) (obj)).setSpan(((Object) (new AbsoluteSizeSpan((int)cueTextSizePx))), 0, ((SpannableStringBuilder) (obj)).length(), 0xff0000);
	//  139  256:aload           10
	//  140  258:new             #355 <Class AbsoluteSizeSpan>
	//  141  261:dup             
	//  142  262:aload_0         
	//  143  263:getfield        #371 <Field float cueTextSizePx>
	//  144  266:f2i             
	//  145  267:invokespecial   #373 <Method void AbsoluteSizeSpan(int)>
	//  146  270:iconst_0        
	//  147  271:aload           10
	//  148  273:invokevirtual   #353 <Method int SpannableStringBuilder.length()>
	//  149  276:ldc2            #374 <Int 0xff0000>
	//  150  279:invokevirtual   #378 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
			}
		}
		if(cueTextAlignment == null)
	//* 151  282:aload_0         
	//* 152  283:getfield        #380 <Field android.text.Layout$Alignment cueTextAlignment>
	//* 153  286:ifnonnull       297
			obj1 = ((Object) (android.text.Layout.Alignment.ALIGN_CENTER));
	//  154  289:getstatic       #385 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_CENTER>
	//  155  292:astore          11
		else
	//* 156  294:goto            306
			obj1 = ((Object) (cueTextAlignment));
	//  157  297:aload_0         
	//  158  298:getfield        #380 <Field android.text.Layout$Alignment cueTextAlignment>
	//  159  301:astore          11
	//* 160  303:goto            294
		textLayout = new StaticLayout(((CharSequence) (obj)), textPaint, i, ((android.text.Layout.Alignment) (obj1)), spacingMult, spacingAdd, true);
	//  161  306:aload_0         
	//  162  307:new             #208 <Class StaticLayout>
	//  163  310:dup             
	//  164  311:aload           10
	//  165  313:aload_0         
	//  166  314:getfield        #129 <Field TextPaint textPaint>
	//  167  317:iload_1         
	//  168  318:aload           11
	//  169  320:aload_0         
	//  170  321:getfield        #91  <Field float spacingMult>
	//  171  324:aload_0         
	//  172  325:getfield        #85  <Field float spacingAdd>
	//  173  328:iconst_1        
	//  174  329:invokespecial   #388 <Method void StaticLayout(CharSequence, TextPaint, int, android.text.Layout$Alignment, float, float, boolean)>
	//  175  332:putfield        #180 <Field StaticLayout textLayout>
		int i2 = textLayout.getHeight();
	//  176  335:aload_0         
	//  177  336:getfield        #180 <Field StaticLayout textLayout>
	//  178  339:invokevirtual   #214 <Method int StaticLayout.getHeight()>
	//  179  342:istore          6
		int l2 = textLayout.getLineCount();
	//  180  344:aload_0         
	//  181  345:getfield        #180 <Field StaticLayout textLayout>
	//  182  348:invokevirtual   #226 <Method int StaticLayout.getLineCount()>
	//  183  351:istore          9
		int j1 = 0;
	//  184  353:iconst_0        
	//  185  354:istore_3        
		l = 0;
	//  186  355:iconst_0        
	//  187  356:istore_2        
		for(; j1 < l2; j1++)
	//* 188  357:iload_3         
	//* 189  358:iload           9
	//* 190  360:icmpge          388
			l = Math.max((int)Math.ceil(textLayout.getLineWidth(j1)), l);
	//  191  363:aload_0         
	//  192  364:getfield        #180 <Field StaticLayout textLayout>
	//  193  367:iload_3         
	//  194  368:invokevirtual   #391 <Method float StaticLayout.getLineWidth(int)>
	//  195  371:f2d             
	//  196  372:invokestatic    #395 <Method double Math.ceil(double)>
	//  197  375:d2i             
	//  198  376:iload_2         
	//  199  377:invokestatic    #398 <Method int Math.max(int, int)>
	//  200  380:istore_2        

	//  201  381:iload_3         
	//  202  382:iconst_1        
	//  203  383:iadd            
	//  204  384:istore_3        
	//* 205  385:goto            357
		if(cueSize == 1.401298E-45F || l >= i)
	//* 206  388:aload_0         
	//* 207  389:getfield        #302 <Field float cueSize>
	//* 208  392:ldc2            #305 <Float 1.401298E-45F>
	//* 209  395:fcmpl           
	//* 210  396:ifeq            407
	//* 211  399:iload_2         
	//* 212  400:iload_1         
	//* 213  401:icmpge          407
	//* 214  404:goto            409
			i = l;
	//  215  407:iload_2         
	//  216  408:istore_1        
		k2 = i + k2;
	//  217  409:iload_1         
	//  218  410:iload           8
	//  219  412:iadd            
	//  220  413:istore          8
		if(cuePosition != 1.401298E-45F)
	//* 221  415:aload_0         
	//* 222  416:getfield        #298 <Field float cuePosition>
	//* 223  419:ldc2            #305 <Float 1.401298E-45F>
	//* 224  422:fcmpl           
	//* 225  423:ifeq            502
		{
			l = Math.round((float)j2 * cuePosition) + parentLeft;
	//  226  426:iload           7
	//  227  428:i2f             
	//  228  429:aload_0         
	//  229  430:getfield        #298 <Field float cuePosition>
	//  230  433:fmul            
	//  231  434:invokestatic    #116 <Method int Math.round(float)>
	//  232  437:aload_0         
	//  233  438:getfield        #292 <Field int parentLeft>
	//  234  441:iadd            
	//  235  442:istore_2        
			if(cuePositionAnchor == 2)
	//* 236  443:aload_0         
	//* 237  444:getfield        #313 <Field int cuePositionAnchor>
	//* 238  447:iconst_2        
	//* 239  448:icmpne          459
			{
				i = l - k2;
	//  240  451:iload_2         
	//  241  452:iload           8
	//  242  454:isub            
	//  243  455:istore_1        
			} else
	//* 244  456:goto            478
			{
				i = l;
	//  245  459:iload_2         
	//  246  460:istore_1        
				if(cuePositionAnchor == 1)
	//* 247  461:aload_0         
	//* 248  462:getfield        #313 <Field int cuePositionAnchor>
	//* 249  465:iconst_1        
	//* 250  466:icmpne          478
					i = (l * 2 - k2) / 2;
	//  251  469:iload_2         
	//  252  470:iconst_2        
	//  253  471:imul            
	//  254  472:iload           8
	//  255  474:isub            
	//  256  475:iconst_2        
	//  257  476:idiv            
	//  258  477:istore_1        
			}
			j1 = Math.max(i, parentLeft);
	//  259  478:iload_1         
	//  260  479:aload_0         
	//  261  480:getfield        #292 <Field int parentLeft>
	//  262  483:invokestatic    #398 <Method int Math.max(int, int)>
	//  263  486:istore_3        
			i = Math.min(k2 + j1, parentRight);
	//  264  487:iload           8
	//  265  489:iload_3         
	//  266  490:iadd            
	//  267  491:aload_0         
	//  268  492:getfield        #290 <Field int parentRight>
	//  269  495:invokestatic    #401 <Method int Math.min(int, int)>
	//  270  498:istore_1        
		} else
	//* 271  499:goto            515
		{
			j1 = (j2 - k2) / 2;
	//  272  502:iload           7
	//  273  504:iload           8
	//  274  506:isub            
	//  275  507:iconst_2        
	//  276  508:idiv            
	//  277  509:istore_3        
			i = j1 + k2;
	//  278  510:iload_3         
	//  279  511:iload           8
	//  280  513:iadd            
	//  281  514:istore_1        
		}
		j2 = i - j1;
	//  282  515:iload_1         
	//  283  516:iload_3         
	//  284  517:isub            
	//  285  518:istore          7
		if(j2 <= 0)
	//* 286  520:iload           7
	//* 287  522:ifgt            535
		{
			Log.w("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
	//  288  525:ldc1            #11  <String "SubtitlePainter">
	//  289  527:ldc2            #403 <String "Skipped drawing subtitle cue (invalid horizontal positioning)">
	//  290  530:invokestatic    #333 <Method int Log.w(String, String)>
	//  291  533:pop             
			return;
	//  292  534:return          
		}
		if(cueLine != 1.401298E-45F)
	//* 293  535:aload_0         
	//* 294  536:getfield        #300 <Field float cueLine>
	//* 295  539:ldc2            #305 <Float 1.401298E-45F>
	//* 296  542:fcmpl           
	//* 297  543:ifeq            712
		{
			if(cueLineType == 0)
	//* 298  546:aload_0         
	//* 299  547:getfield        #405 <Field int cueLineType>
	//* 300  550:ifne            573
			{
				l = Math.round((float)l1 * cueLine) + parentTop;
	//  301  553:iload           5
	//  302  555:i2f             
	//  303  556:aload_0         
	//  304  557:getfield        #300 <Field float cueLine>
	//  305  560:fmul            
	//  306  561:invokestatic    #116 <Method int Math.round(float)>
	//  307  564:aload_0         
	//  308  565:getfield        #296 <Field int parentTop>
	//  309  568:iadd            
	//  310  569:istore_2        
			} else
	//* 311  570:goto            637
			{
				int j = textLayout.getLineBottom(0) - textLayout.getLineTop(0);
	//  312  573:aload_0         
	//  313  574:getfield        #180 <Field StaticLayout textLayout>
	//  314  577:iconst_0        
	//  315  578:invokevirtual   #245 <Method int StaticLayout.getLineBottom(int)>
	//  316  581:aload_0         
	//  317  582:getfield        #180 <Field StaticLayout textLayout>
	//  318  585:iconst_0        
	//  319  586:invokevirtual   #223 <Method int StaticLayout.getLineTop(int)>
	//  320  589:isub            
	//  321  590:istore_1        
				if(cueLine >= 0.0F)
	//* 322  591:aload_0         
	//* 323  592:getfield        #300 <Field float cueLine>
	//* 324  595:fconst_0        
	//* 325  596:fcmpl           
	//* 326  597:iflt            619
					l = Math.round(cueLine * (float)j) + parentTop;
	//  327  600:aload_0         
	//  328  601:getfield        #300 <Field float cueLine>
	//  329  604:iload_1         
	//  330  605:i2f             
	//  331  606:fmul            
	//  332  607:invokestatic    #116 <Method int Math.round(float)>
	//  333  610:aload_0         
	//  334  611:getfield        #296 <Field int parentTop>
	//  335  614:iadd            
	//  336  615:istore_2        
				else
	//* 337  616:goto            637
					l = Math.round((cueLine + 1.0F) * (float)j) + parentBottom;
	//  338  619:aload_0         
	//  339  620:getfield        #300 <Field float cueLine>
	//  340  623:fconst_1        
	//  341  624:fadd            
	//  342  625:iload_1         
	//  343  626:i2f             
	//  344  627:fmul            
	//  345  628:invokestatic    #116 <Method int Math.round(float)>
	//  346  631:aload_0         
	//  347  632:getfield        #294 <Field int parentBottom>
	//  348  635:iadd            
	//  349  636:istore_2        
			}
			int k;
			if(cueLineAnchor == 2)
	//* 350  637:aload_0         
	//* 351  638:getfield        #311 <Field int cueLineAnchor>
	//* 352  641:iconst_2        
	//* 353  642:icmpne          653
			{
				k = l - i2;
	//  354  645:iload_2         
	//  355  646:iload           6
	//  356  648:isub            
	//  357  649:istore_1        
			} else
	//* 358  650:goto            672
			{
				k = l;
	//  359  653:iload_2         
	//  360  654:istore_1        
				if(cueLineAnchor == 1)
	//* 361  655:aload_0         
	//* 362  656:getfield        #311 <Field int cueLineAnchor>
	//* 363  659:iconst_1        
	//* 364  660:icmpne          672
					k = (l * 2 - i2) / 2;
	//  365  663:iload_2         
	//  366  664:iconst_2        
	//  367  665:imul            
	//  368  666:iload           6
	//  369  668:isub            
	//  370  669:iconst_2        
	//  371  670:idiv            
	//  372  671:istore_1        
			}
			if(k + i2 > parentBottom)
	//* 373  672:iload_1         
	//* 374  673:iload           6
	//* 375  675:iadd            
	//* 376  676:aload_0         
	//* 377  677:getfield        #294 <Field int parentBottom>
	//* 378  680:icmple          694
			{
				l = parentBottom - i2;
	//  379  683:aload_0         
	//  380  684:getfield        #294 <Field int parentBottom>
	//  381  687:iload           6
	//  382  689:isub            
	//  383  690:istore_2        
			} else
	//* 384  691:goto            730
			{
				l = k;
	//  385  694:iload_1         
	//  386  695:istore_2        
				if(k < parentTop)
	//* 387  696:iload_1         
	//* 388  697:aload_0         
	//* 389  698:getfield        #296 <Field int parentTop>
	//* 390  701:icmpge          730
					l = parentTop;
	//  391  704:aload_0         
	//  392  705:getfield        #296 <Field int parentTop>
	//  393  708:istore_2        
			}
		} else
	//* 394  709:goto            730
		{
			l = parentBottom - i2 - (int)((float)l1 * bottomPaddingFraction);
	//  395  712:aload_0         
	//  396  713:getfield        #294 <Field int parentBottom>
	//  397  716:iload           6
	//  398  718:isub            
	//  399  719:iload           5
	//  400  721:i2f             
	//  401  722:aload_0         
	//  402  723:getfield        #407 <Field float bottomPaddingFraction>
	//  403  726:fmul            
	//  404  727:f2i             
	//  405  728:isub            
	//  406  729:istore_2        
		}
		textLayout = new StaticLayout(((CharSequence) (obj)), textPaint, j2, ((android.text.Layout.Alignment) (obj1)), spacingMult, spacingAdd, true);
	//  407  730:aload_0         
	//  408  731:new             #208 <Class StaticLayout>
	//  409  734:dup             
	//  410  735:aload           10
	//  411  737:aload_0         
	//  412  738:getfield        #129 <Field TextPaint textPaint>
	//  413  741:iload           7
	//  414  743:aload           11
	//  415  745:aload_0         
	//  416  746:getfield        #91  <Field float spacingMult>
	//  417  749:aload_0         
	//  418  750:getfield        #85  <Field float spacingAdd>
	//  419  753:iconst_1        
	//  420  754:invokespecial   #388 <Method void StaticLayout(CharSequence, TextPaint, int, android.text.Layout$Alignment, float, float, boolean)>
	//  421  757:putfield        #180 <Field StaticLayout textLayout>
		textLeft = j1;
	//  422  760:aload_0         
	//  423  761:iload_3         
	//  424  762:putfield        #186 <Field int textLeft>
		textTop = l;
	//  425  765:aload_0         
	//  426  766:iload_2         
	//  427  767:putfield        #188 <Field int textTop>
		textPaddingX = k1;
	//  428  770:aload_0         
	//  429  771:iload           4
	//  430  773:putfield        #206 <Field int textPaddingX>
	//  431  776:return          
	}

	public void draw(Cue cue, boolean flag, boolean flag1, CaptionStyleCompat captionstylecompat, float f, float f1, float f2, 
			Canvas canvas, int i, int j, int k, int l)
	{
		boolean flag2;
		if(cue.bitmap == null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #413 <Field Bitmap Cue.bitmap>
	//*   2    4:ifnonnull       13
			flag2 = true;
	//    3    7:iconst_1        
	//    4    8:istore          14
		else
	//*   5   10:goto            16
			flag2 = false;
	//    6   13:iconst_0        
	//    7   14:istore          14
		int i1 = 0xff000000;
	//    8   16:ldc2            #414 <Int 0xff000000>
	//    9   19:istore          13
		if(flag2)
	//*  10   21:iload           14
	//*  11   23:ifeq            64
		{
			if(TextUtils.isEmpty(cue.text))
	//*  12   26:aload_1         
	//*  13   27:getfield        #417 <Field CharSequence Cue.text>
	//*  14   30:invokestatic    #423 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  15   33:ifeq            37
				return;
	//   16   36:return          
			if(cue.windowColorSet && flag)
	//*  17   37:aload_1         
	//*  18   38:getfield        #426 <Field boolean Cue.windowColorSet>
	//*  19   41:ifeq            57
	//*  20   44:iload_2         
	//*  21   45:ifeq            57
				i1 = cue.windowColor;
	//   22   48:aload_1         
	//   23   49:getfield        #427 <Field int Cue.windowColor>
	//   24   52:istore          13
			else
	//*  25   54:goto            64
				i1 = captionstylecompat.windowColor;
	//   26   57:aload           4
	//   27   59:getfield        #430 <Field int CaptionStyleCompat.windowColor>
	//   28   62:istore          13
		}
		if(areCharSequencesEqual(cueText, cue.text) && Util.areEqual(((Object) (cueTextAlignment)), ((Object) (cue.textAlignment))) && cueBitmap == cue.bitmap && cueLine == cue.line && cueLineType == cue.lineType && Util.areEqual(((Object) (Integer.valueOf(cueLineAnchor))), ((Object) (Integer.valueOf(cue.lineAnchor)))) && cuePosition == cue.position && Util.areEqual(((Object) (Integer.valueOf(cuePositionAnchor))), ((Object) (Integer.valueOf(cue.positionAnchor)))) && cueSize == cue.size && cueBitmapHeight == cue.bitmapHeight && applyEmbeddedStyles == flag && applyEmbeddedFontSizes == flag1 && foregroundColor == captionstylecompat.foregroundColor && backgroundColor == captionstylecompat.backgroundColor && windowColor == i1 && edgeType == captionstylecompat.edgeType && edgeColor == captionstylecompat.edgeColor && Util.areEqual(((Object) (textPaint.getTypeface())), ((Object) (captionstylecompat.typeface))) && defaultTextSizePx == f && cueTextSizePx == f1 && bottomPaddingFraction == f2 && parentLeft == i && parentTop == j && parentRight == k && parentBottom == l)
	//*  29   64:aload_0         
	//*  30   65:getfield        #335 <Field CharSequence cueText>
	//*  31   68:aload_1         
	//*  32   69:getfield        #417 <Field CharSequence Cue.text>
	//*  33   72:invokestatic    #432 <Method boolean areCharSequencesEqual(CharSequence, CharSequence)>
	//*  34   75:ifeq            368
	//*  35   78:aload_0         
	//*  36   79:getfield        #380 <Field android.text.Layout$Alignment cueTextAlignment>
	//*  37   82:aload_1         
	//*  38   83:getfield        #435 <Field android.text.Layout$Alignment Cue.textAlignment>
	//*  39   86:invokestatic    #441 <Method boolean Util.areEqual(Object, Object)>
	//*  40   89:ifeq            368
	//*  41   92:aload_0         
	//*  42   93:getfield        #163 <Field Bitmap cueBitmap>
	//*  43   96:aload_1         
	//*  44   97:getfield        #413 <Field Bitmap Cue.bitmap>
	//*  45  100:if_acmpne       368
	//*  46  103:aload_0         
	//*  47  104:getfield        #300 <Field float cueLine>
	//*  48  107:aload_1         
	//*  49  108:getfield        #444 <Field float Cue.line>
	//*  50  111:fcmpl           
	//*  51  112:ifne            368
	//*  52  115:aload_0         
	//*  53  116:getfield        #405 <Field int cueLineType>
	//*  54  119:aload_1         
	//*  55  120:getfield        #447 <Field int Cue.lineType>
	//*  56  123:icmpne          368
	//*  57  126:aload_0         
	//*  58  127:getfield        #311 <Field int cueLineAnchor>
	//*  59  130:invokestatic    #453 <Method Integer Integer.valueOf(int)>
	//*  60  133:aload_1         
	//*  61  134:getfield        #456 <Field int Cue.lineAnchor>
	//*  62  137:invokestatic    #453 <Method Integer Integer.valueOf(int)>
	//*  63  140:invokestatic    #441 <Method boolean Util.areEqual(Object, Object)>
	//*  64  143:ifeq            368
	//*  65  146:aload_0         
	//*  66  147:getfield        #298 <Field float cuePosition>
	//*  67  150:aload_1         
	//*  68  151:getfield        #459 <Field float Cue.position>
	//*  69  154:fcmpl           
	//*  70  155:ifne            368
	//*  71  158:aload_0         
	//*  72  159:getfield        #313 <Field int cuePositionAnchor>
	//*  73  162:invokestatic    #453 <Method Integer Integer.valueOf(int)>
	//*  74  165:aload_1         
	//*  75  166:getfield        #462 <Field int Cue.positionAnchor>
	//*  76  169:invokestatic    #453 <Method Integer Integer.valueOf(int)>
	//*  77  172:invokestatic    #441 <Method boolean Util.areEqual(Object, Object)>
	//*  78  175:ifeq            368
	//*  79  178:aload_0         
	//*  80  179:getfield        #302 <Field float cueSize>
	//*  81  182:aload_1         
	//*  82  183:getfield        #465 <Field float Cue.size>
	//*  83  186:fcmpl           
	//*  84  187:ifne            368
	//*  85  190:aload_0         
	//*  86  191:getfield        #304 <Field float cueBitmapHeight>
	//*  87  194:aload_1         
	//*  88  195:getfield        #468 <Field float Cue.bitmapHeight>
	//*  89  198:fcmpl           
	//*  90  199:ifne            368
	//*  91  202:aload_0         
	//*  92  203:getfield        #337 <Field boolean applyEmbeddedStyles>
	//*  93  206:iload_2         
	//*  94  207:icmpne          368
	//*  95  210:aload_0         
	//*  96  211:getfield        #345 <Field boolean applyEmbeddedFontSizes>
	//*  97  214:iload_3         
	//*  98  215:icmpne          368
	//*  99  218:aload_0         
	//* 100  219:getfield        #284 <Field int foregroundColor>
	//* 101  222:aload           4
	//* 102  224:getfield        #469 <Field int CaptionStyleCompat.foregroundColor>
	//* 103  227:icmpne          368
	//* 104  230:aload_0         
	//* 105  231:getfield        #220 <Field int backgroundColor>
	//* 106  234:aload           4
	//* 107  236:getfield        #470 <Field int CaptionStyleCompat.backgroundColor>
	//* 108  239:icmpne          368
	//* 109  242:aload_0         
	//* 110  243:getfield        #194 <Field int windowColor>
	//* 111  246:iload           13
	//* 112  248:icmpne          368
	//* 113  251:aload_0         
	//* 114  252:getfield        #254 <Field int edgeType>
	//* 115  255:aload           4
	//* 116  257:getfield        #471 <Field int CaptionStyleCompat.edgeType>
	//* 117  260:icmpne          368
	//* 118  263:aload_0         
	//* 119  264:getfield        #270 <Field int edgeColor>
	//* 120  267:aload           4
	//* 121  269:getfield        #472 <Field int CaptionStyleCompat.edgeColor>
	//* 122  272:icmpne          368
	//* 123  275:aload_0         
	//* 124  276:getfield        #129 <Field TextPaint textPaint>
	//* 125  279:invokevirtual   #476 <Method android.graphics.Typeface TextPaint.getTypeface()>
	//* 126  282:aload           4
	//* 127  284:getfield        #480 <Field android.graphics.Typeface CaptionStyleCompat.typeface>
	//* 128  287:invokestatic    #441 <Method boolean Util.areEqual(Object, Object)>
	//* 129  290:ifeq            368
	//* 130  293:aload_0         
	//* 131  294:getfield        #321 <Field float defaultTextSizePx>
	//* 132  297:fload           5
	//* 133  299:fcmpl           
	//* 134  300:ifne            368
	//* 135  303:aload_0         
	//* 136  304:getfield        #371 <Field float cueTextSizePx>
	//* 137  307:fload           6
	//* 138  309:fcmpl           
	//* 139  310:ifne            368
	//* 140  313:aload_0         
	//* 141  314:getfield        #407 <Field float bottomPaddingFraction>
	//* 142  317:fload           7
	//* 143  319:fcmpl           
	//* 144  320:ifne            368
	//* 145  323:aload_0         
	//* 146  324:getfield        #292 <Field int parentLeft>
	//* 147  327:iload           9
	//* 148  329:icmpne          368
	//* 149  332:aload_0         
	//* 150  333:getfield        #296 <Field int parentTop>
	//* 151  336:iload           10
	//* 152  338:icmpne          368
	//* 153  341:aload_0         
	//* 154  342:getfield        #290 <Field int parentRight>
	//* 155  345:iload           11
	//* 156  347:icmpne          368
	//* 157  350:aload_0         
	//* 158  351:getfield        #294 <Field int parentBottom>
	//* 159  354:iload           12
	//* 160  356:icmpne          368
		{
			drawLayout(canvas, flag2);
	//  161  359:aload_0         
	//  162  360:aload           8
	//  163  362:iload           14
	//  164  364:invokespecial   #482 <Method void drawLayout(Canvas, boolean)>
			return;
	//  165  367:return          
		}
		cueText = cue.text;
	//  166  368:aload_0         
	//  167  369:aload_1         
	//  168  370:getfield        #417 <Field CharSequence Cue.text>
	//  169  373:putfield        #335 <Field CharSequence cueText>
		cueTextAlignment = cue.textAlignment;
	//  170  376:aload_0         
	//  171  377:aload_1         
	//  172  378:getfield        #435 <Field android.text.Layout$Alignment Cue.textAlignment>
	//  173  381:putfield        #380 <Field android.text.Layout$Alignment cueTextAlignment>
		cueBitmap = cue.bitmap;
	//  174  384:aload_0         
	//  175  385:aload_1         
	//  176  386:getfield        #413 <Field Bitmap Cue.bitmap>
	//  177  389:putfield        #163 <Field Bitmap cueBitmap>
		cueLine = cue.line;
	//  178  392:aload_0         
	//  179  393:aload_1         
	//  180  394:getfield        #444 <Field float Cue.line>
	//  181  397:putfield        #300 <Field float cueLine>
		cueLineType = cue.lineType;
	//  182  400:aload_0         
	//  183  401:aload_1         
	//  184  402:getfield        #447 <Field int Cue.lineType>
	//  185  405:putfield        #405 <Field int cueLineType>
		cueLineAnchor = cue.lineAnchor;
	//  186  408:aload_0         
	//  187  409:aload_1         
	//  188  410:getfield        #456 <Field int Cue.lineAnchor>
	//  189  413:putfield        #311 <Field int cueLineAnchor>
		cuePosition = cue.position;
	//  190  416:aload_0         
	//  191  417:aload_1         
	//  192  418:getfield        #459 <Field float Cue.position>
	//  193  421:putfield        #298 <Field float cuePosition>
		cuePositionAnchor = cue.positionAnchor;
	//  194  424:aload_0         
	//  195  425:aload_1         
	//  196  426:getfield        #462 <Field int Cue.positionAnchor>
	//  197  429:putfield        #313 <Field int cuePositionAnchor>
		cueSize = cue.size;
	//  198  432:aload_0         
	//  199  433:aload_1         
	//  200  434:getfield        #465 <Field float Cue.size>
	//  201  437:putfield        #302 <Field float cueSize>
		cueBitmapHeight = cue.bitmapHeight;
	//  202  440:aload_0         
	//  203  441:aload_1         
	//  204  442:getfield        #468 <Field float Cue.bitmapHeight>
	//  205  445:putfield        #304 <Field float cueBitmapHeight>
		applyEmbeddedStyles = flag;
	//  206  448:aload_0         
	//  207  449:iload_2         
	//  208  450:putfield        #337 <Field boolean applyEmbeddedStyles>
		applyEmbeddedFontSizes = flag1;
	//  209  453:aload_0         
	//  210  454:iload_3         
	//  211  455:putfield        #345 <Field boolean applyEmbeddedFontSizes>
		foregroundColor = captionstylecompat.foregroundColor;
	//  212  458:aload_0         
	//  213  459:aload           4
	//  214  461:getfield        #469 <Field int CaptionStyleCompat.foregroundColor>
	//  215  464:putfield        #284 <Field int foregroundColor>
		backgroundColor = captionstylecompat.backgroundColor;
	//  216  467:aload_0         
	//  217  468:aload           4
	//  218  470:getfield        #470 <Field int CaptionStyleCompat.backgroundColor>
	//  219  473:putfield        #220 <Field int backgroundColor>
		windowColor = i1;
	//  220  476:aload_0         
	//  221  477:iload           13
	//  222  479:putfield        #194 <Field int windowColor>
		edgeType = captionstylecompat.edgeType;
	//  223  482:aload_0         
	//  224  483:aload           4
	//  225  485:getfield        #471 <Field int CaptionStyleCompat.edgeType>
	//  226  488:putfield        #254 <Field int edgeType>
		edgeColor = captionstylecompat.edgeColor;
	//  227  491:aload_0         
	//  228  492:aload           4
	//  229  494:getfield        #472 <Field int CaptionStyleCompat.edgeColor>
	//  230  497:putfield        #270 <Field int edgeColor>
		textPaint.setTypeface(captionstylecompat.typeface);
	//  231  500:aload_0         
	//  232  501:getfield        #129 <Field TextPaint textPaint>
	//  233  504:aload           4
	//  234  506:getfield        #480 <Field android.graphics.Typeface CaptionStyleCompat.typeface>
	//  235  509:invokevirtual   #486 <Method android.graphics.Typeface TextPaint.setTypeface(android.graphics.Typeface)>
	//  236  512:pop             
		defaultTextSizePx = f;
	//  237  513:aload_0         
	//  238  514:fload           5
	//  239  516:putfield        #321 <Field float defaultTextSizePx>
		cueTextSizePx = f1;
	//  240  519:aload_0         
	//  241  520:fload           6
	//  242  522:putfield        #371 <Field float cueTextSizePx>
		bottomPaddingFraction = f2;
	//  243  525:aload_0         
	//  244  526:fload           7
	//  245  528:putfield        #407 <Field float bottomPaddingFraction>
		parentLeft = i;
	//  246  531:aload_0         
	//  247  532:iload           9
	//  248  534:putfield        #292 <Field int parentLeft>
		parentTop = j;
	//  249  537:aload_0         
	//  250  538:iload           10
	//  251  540:putfield        #296 <Field int parentTop>
		parentRight = k;
	//  252  543:aload_0         
	//  253  544:iload           11
	//  254  546:putfield        #290 <Field int parentRight>
		parentBottom = l;
	//  255  549:aload_0         
	//  256  550:iload           12
	//  257  552:putfield        #294 <Field int parentBottom>
		if(flag2)
	//* 258  555:iload           14
	//* 259  557:ifeq            567
			setupTextLayout();
	//  260  560:aload_0         
	//  261  561:invokespecial   #488 <Method void setupTextLayout()>
		else
	//* 262  564:goto            571
			setupBitmapLayout();
	//  263  567:aload_0         
	//  264  568:invokespecial   #490 <Method void setupBitmapLayout()>
		drawLayout(canvas, flag2);
	//  265  571:aload_0         
	//  266  572:aload           8
	//  267  574:iload           14
	//  268  576:invokespecial   #482 <Method void drawLayout(Canvas, boolean)>
	//  269  579:return          
	}

	private static final float INNER_PADDING_RATIO = 0.125F;
	private static final String TAG = "SubtitlePainter";
	private boolean applyEmbeddedFontSizes;
	private boolean applyEmbeddedStyles;
	private int backgroundColor;
	private Rect bitmapRect;
	private float bottomPaddingFraction;
	private final float cornerRadius;
	private Bitmap cueBitmap;
	private float cueBitmapHeight;
	private float cueLine;
	private int cueLineAnchor;
	private int cueLineType;
	private float cuePosition;
	private int cuePositionAnchor;
	private float cueSize;
	private CharSequence cueText;
	private android.text.Layout.Alignment cueTextAlignment;
	private float cueTextSizePx;
	private float defaultTextSizePx;
	private int edgeColor;
	private int edgeType;
	private int foregroundColor;
	private final RectF lineBounds = new RectF();
	private final float outlineWidth;
	private final Paint paint = new Paint();
	private int parentBottom;
	private int parentLeft;
	private int parentRight;
	private int parentTop;
	private final float shadowOffset;
	private final float shadowRadius;
	private final float spacingAdd;
	private final float spacingMult;
	private StaticLayout textLayout;
	private int textLeft;
	private int textPaddingX;
	private final TextPaint textPaint = new TextPaint();
	private int textTop;
	private int windowColor;
}
