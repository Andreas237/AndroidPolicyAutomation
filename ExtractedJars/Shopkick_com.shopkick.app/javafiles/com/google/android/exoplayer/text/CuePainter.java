// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.*;
import android.text.*;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.exoplayer.util.Util;

// Referenced classes of package com.google.android.exoplayer.text:
//			Cue, CaptionStyleCompat

final class CuePainter
{

	public CuePainter(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #59  <Class RectF>
	//    4    8:dup             
	//    5    9:invokespecial   #60  <Method void RectF()>
	//    6   12:putfield        #62  <Field RectF lineBounds>
		TypedArray typedarray = context.obtainStyledAttributes(((android.util.AttributeSet) (null)), new int[] {
			0x1010217, 0x1010218
		}, 0, 0);
	//    7   15:aload_1         
	//    8   16:aconst_null     
	//    9   17:iconst_2        
	//   10   18:newarray        int[]
	//   11   20:dup             
	//   12   21:iconst_0        
	//   13   22:ldc1            #63  <Int 0x1010217>
	//   14   24:iastore         
	//   15   25:dup             
	//   16   26:iconst_1        
	//   17   27:ldc1            #64  <Int 0x1010218>
	//   18   29:iastore         
	//   19   30:iconst_0        
	//   20   31:iconst_0        
	//   21   32:invokevirtual   #70  <Method TypedArray Context.obtainStyledAttributes(android.util.AttributeSet, int[], int, int)>
	//   22   35:astore_3        
		spacingAdd = typedarray.getDimensionPixelSize(0, 0);
	//   23   36:aload_0         
	//   24   37:aload_3         
	//   25   38:iconst_0        
	//   26   39:iconst_0        
	//   27   40:invokevirtual   #76  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   28   43:i2f             
	//   29   44:putfield        #78  <Field float spacingAdd>
		spacingMult = typedarray.getFloat(1, 1.0F);
	//   30   47:aload_0         
	//   31   48:aload_3         
	//   32   49:iconst_1        
	//   33   50:fconst_1        
	//   34   51:invokevirtual   #82  <Method float TypedArray.getFloat(int, float)>
	//   35   54:putfield        #84  <Field float spacingMult>
		typedarray.recycle();
	//   36   57:aload_3         
	//   37   58:invokevirtual   #87  <Method void TypedArray.recycle()>
		float f = Math.round(((float)context.getResources().getDisplayMetrics().densityDpi * 2.0F) / 160F);
	//   38   61:aload_1         
	//   39   62:invokevirtual   #91  <Method Resources Context.getResources()>
	//   40   65:invokevirtual   #97  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   41   68:getfield        #102 <Field int DisplayMetrics.densityDpi>
	//   42   71:i2f             
	//   43   72:fconst_2        
	//   44   73:fmul            
	//   45   74:ldc1            #103 <Float 160F>
	//   46   76:fdiv            
	//   47   77:invokestatic    #109 <Method int Math.round(float)>
	//   48   80:i2f             
	//   49   81:fstore_2        
		cornerRadius = f;
	//   50   82:aload_0         
	//   51   83:fload_2         
	//   52   84:putfield        #111 <Field float cornerRadius>
		outlineWidth = f;
	//   53   87:aload_0         
	//   54   88:fload_2         
	//   55   89:putfield        #113 <Field float outlineWidth>
		shadowRadius = f;
	//   56   92:aload_0         
	//   57   93:fload_2         
	//   58   94:putfield        #115 <Field float shadowRadius>
		shadowOffset = f;
	//   59   97:aload_0         
	//   60   98:fload_2         
	//   61   99:putfield        #117 <Field float shadowOffset>
	//   62  102:aload_0         
	//   63  103:new             #119 <Class TextPaint>
	//   64  106:dup             
	//   65  107:invokespecial   #120 <Method void TextPaint()>
	//   66  110:putfield        #122 <Field TextPaint textPaint>
		textPaint.setAntiAlias(true);
	//   67  113:aload_0         
	//   68  114:getfield        #122 <Field TextPaint textPaint>
	//   69  117:iconst_1        
	//   70  118:invokevirtual   #126 <Method void TextPaint.setAntiAlias(boolean)>
		textPaint.setSubpixelText(true);
	//   71  121:aload_0         
	//   72  122:getfield        #122 <Field TextPaint textPaint>
	//   73  125:iconst_1        
	//   74  126:invokevirtual   #129 <Method void TextPaint.setSubpixelText(boolean)>
	//   75  129:aload_0         
	//   76  130:new             #131 <Class Paint>
	//   77  133:dup             
	//   78  134:invokespecial   #132 <Method void Paint()>
	//   79  137:putfield        #134 <Field Paint paint>
		paint.setAntiAlias(true);
	//   80  140:aload_0         
	//   81  141:getfield        #134 <Field Paint paint>
	//   82  144:iconst_1        
	//   83  145:invokevirtual   #135 <Method void Paint.setAntiAlias(boolean)>
		paint.setStyle(android.graphics.Paint.Style.FILL);
	//   84  148:aload_0         
	//   85  149:getfield        #134 <Field Paint paint>
	//   86  152:getstatic       #141 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   87  155:invokevirtual   #145 <Method void Paint.setStyle(android.graphics.Paint$Style)>
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
	//    7   11:invokevirtual   #152 <Method boolean Object.equals(Object)>
	//    8   14:ifeq            20
	//    9   17:goto            22
	//   10   20:iconst_0        
	//   11   21:ireturn         
	//   12   22:iconst_1        
	//   13   23:ireturn         
	}

	private void drawLayout(Canvas canvas)
	{
		StaticLayout staticlayout = textLayout;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field StaticLayout textLayout>
	//    2    4:astore          9
		if(staticlayout == null)
	//*   3    6:aload           9
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		int j1 = canvas.save();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #162 <Method int Canvas.save()>
	//    8   16:istore          8
		canvas.translate(textLeft, textTop);
	//    9   18:aload_1         
	//   10   19:aload_0         
	//   11   20:getfield        #164 <Field int textLeft>
	//   12   23:i2f             
	//   13   24:aload_0         
	//   14   25:getfield        #166 <Field int textTop>
	//   15   28:i2f             
	//   16   29:invokevirtual   #170 <Method void Canvas.translate(float, float)>
		if(Color.alpha(windowColor) > 0)
	//*  17   32:aload_0         
	//*  18   33:getfield        #172 <Field int windowColor>
	//*  19   36:invokestatic    #178 <Method int Color.alpha(int)>
	//*  20   39:ifle            85
		{
			paint.setColor(windowColor);
	//   21   42:aload_0         
	//   22   43:getfield        #134 <Field Paint paint>
	//   23   46:aload_0         
	//   24   47:getfield        #172 <Field int windowColor>
	//   25   50:invokevirtual   #182 <Method void Paint.setColor(int)>
			canvas.drawRect(-textPaddingX, 0.0F, staticlayout.getWidth() + textPaddingX, staticlayout.getHeight(), paint);
	//   26   53:aload_1         
	//   27   54:aload_0         
	//   28   55:getfield        #184 <Field int textPaddingX>
	//   29   58:ineg            
	//   30   59:i2f             
	//   31   60:fconst_0        
	//   32   61:aload           9
	//   33   63:invokevirtual   #189 <Method int StaticLayout.getWidth()>
	//   34   66:aload_0         
	//   35   67:getfield        #184 <Field int textPaddingX>
	//   36   70:iadd            
	//   37   71:i2f             
	//   38   72:aload           9
	//   39   74:invokevirtual   #192 <Method int StaticLayout.getHeight()>
	//   40   77:i2f             
	//   41   78:aload_0         
	//   42   79:getfield        #134 <Field Paint paint>
	//   43   82:invokevirtual   #196 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}
		if(Color.alpha(backgroundColor) > 0)
	//*  44   85:aload_0         
	//*  45   86:getfield        #198 <Field int backgroundColor>
	//*  46   89:invokestatic    #178 <Method int Color.alpha(int)>
	//*  47   92:ifle            236
		{
			paint.setColor(backgroundColor);
	//   48   95:aload_0         
	//   49   96:getfield        #134 <Field Paint paint>
	//   50   99:aload_0         
	//   51  100:getfield        #198 <Field int backgroundColor>
	//   52  103:invokevirtual   #182 <Method void Paint.setColor(int)>
			float f = staticlayout.getLineTop(0);
	//   53  106:aload           9
	//   54  108:iconst_0        
	//   55  109:invokevirtual   #201 <Method int StaticLayout.getLineTop(int)>
	//   56  112:i2f             
	//   57  113:fstore_2        
			int j = staticlayout.getLineCount();
	//   58  114:aload           9
	//   59  116:invokevirtual   #204 <Method int StaticLayout.getLineCount()>
	//   60  119:istore          6
			for(int i = 0; i < j; i++)
	//*  61  121:iconst_0        
	//*  62  122:istore          5
	//*  63  124:iload           5
	//*  64  126:iload           6
	//*  65  128:icmpge          236
			{
				lineBounds.left = staticlayout.getLineLeft(i) - (float)textPaddingX;
	//   66  131:aload_0         
	//   67  132:getfield        #62  <Field RectF lineBounds>
	//   68  135:aload           9
	//   69  137:iload           5
	//   70  139:invokevirtual   #208 <Method float StaticLayout.getLineLeft(int)>
	//   71  142:aload_0         
	//   72  143:getfield        #184 <Field int textPaddingX>
	//   73  146:i2f             
	//   74  147:fsub            
	//   75  148:putfield        #211 <Field float RectF.left>
				lineBounds.right = staticlayout.getLineRight(i) + (float)textPaddingX;
	//   76  151:aload_0         
	//   77  152:getfield        #62  <Field RectF lineBounds>
	//   78  155:aload           9
	//   79  157:iload           5
	//   80  159:invokevirtual   #214 <Method float StaticLayout.getLineRight(int)>
	//   81  162:aload_0         
	//   82  163:getfield        #184 <Field int textPaddingX>
	//   83  166:i2f             
	//   84  167:fadd            
	//   85  168:putfield        #217 <Field float RectF.right>
				RectF rectf = lineBounds;
	//   86  171:aload_0         
	//   87  172:getfield        #62  <Field RectF lineBounds>
	//   88  175:astore          10
				rectf.top = f;
	//   89  177:aload           10
	//   90  179:fload_2         
	//   91  180:putfield        #220 <Field float RectF.top>
				rectf.bottom = staticlayout.getLineBottom(i);
	//   92  183:aload           10
	//   93  185:aload           9
	//   94  187:iload           5
	//   95  189:invokevirtual   #223 <Method int StaticLayout.getLineBottom(int)>
	//   96  192:i2f             
	//   97  193:putfield        #226 <Field float RectF.bottom>
				f = lineBounds.bottom;
	//   98  196:aload_0         
	//   99  197:getfield        #62  <Field RectF lineBounds>
	//  100  200:getfield        #226 <Field float RectF.bottom>
	//  101  203:fstore_2        
				rectf = lineBounds;
	//  102  204:aload_0         
	//  103  205:getfield        #62  <Field RectF lineBounds>
	//  104  208:astore          10
				float f3 = cornerRadius;
	//  105  210:aload_0         
	//  106  211:getfield        #111 <Field float cornerRadius>
	//  107  214:fstore_3        
				canvas.drawRoundRect(rectf, f3, f3, paint);
	//  108  215:aload_1         
	//  109  216:aload           10
	//  110  218:fload_3         
	//  111  219:fload_3         
	//  112  220:aload_0         
	//  113  221:getfield        #134 <Field Paint paint>
	//  114  224:invokevirtual   #230 <Method void Canvas.drawRoundRect(RectF, float, float, Paint)>
			}

	//  115  227:iload           5
	//  116  229:iconst_1        
	//  117  230:iadd            
	//  118  231:istore          5
		}
	//* 119  233:goto            124
		int k = edgeType;
	//  120  236:aload_0         
	//  121  237:getfield        #232 <Field int edgeType>
	//  122  240:istore          6
		boolean flag = true;
	//  123  242:iconst_1        
	//  124  243:istore          5
		if(k == 1)
	//* 125  245:iload           6
	//* 126  247:iconst_1        
	//* 127  248:icmpne          302
		{
			textPaint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
	//  128  251:aload_0         
	//  129  252:getfield        #122 <Field TextPaint textPaint>
	//  130  255:getstatic       #238 <Field android.graphics.Paint$Join android.graphics.Paint$Join.ROUND>
	//  131  258:invokevirtual   #242 <Method void TextPaint.setStrokeJoin(android.graphics.Paint$Join)>
			textPaint.setStrokeWidth(outlineWidth);
	//  132  261:aload_0         
	//  133  262:getfield        #122 <Field TextPaint textPaint>
	//  134  265:aload_0         
	//  135  266:getfield        #113 <Field float outlineWidth>
	//  136  269:invokevirtual   #246 <Method void TextPaint.setStrokeWidth(float)>
			textPaint.setColor(edgeColor);
	//  137  272:aload_0         
	//  138  273:getfield        #122 <Field TextPaint textPaint>
	//  139  276:aload_0         
	//  140  277:getfield        #248 <Field int edgeColor>
	//  141  280:invokevirtual   #249 <Method void TextPaint.setColor(int)>
			textPaint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
	//  142  283:aload_0         
	//  143  284:getfield        #122 <Field TextPaint textPaint>
	//  144  287:getstatic       #252 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL_AND_STROKE>
	//  145  290:invokevirtual   #253 <Method void TextPaint.setStyle(android.graphics.Paint$Style)>
			staticlayout.draw(canvas);
	//  146  293:aload           9
	//  147  295:aload_1         
	//  148  296:invokevirtual   #256 <Method void StaticLayout.draw(Canvas)>
		} else
	//* 149  299:goto            472
		if(k == 2)
	//* 150  302:iload           6
	//* 151  304:iconst_2        
	//* 152  305:icmpne          339
		{
			TextPaint textpaint = textPaint;
	//  153  308:aload_0         
	//  154  309:getfield        #122 <Field TextPaint textPaint>
	//  155  312:astore          10
			float f1 = shadowRadius;
	//  156  314:aload_0         
	//  157  315:getfield        #115 <Field float shadowRadius>
	//  158  318:fstore_2        
			float f4 = shadowOffset;
	//  159  319:aload_0         
	//  160  320:getfield        #117 <Field float shadowOffset>
	//  161  323:fstore_3        
			textpaint.setShadowLayer(f1, f4, f4, edgeColor);
	//  162  324:aload           10
	//  163  326:fload_2         
	//  164  327:fload_3         
	//  165  328:fload_3         
	//  166  329:aload_0         
	//  167  330:getfield        #248 <Field int edgeColor>
	//  168  333:invokevirtual   #260 <Method void TextPaint.setShadowLayer(float, float, float, int)>
		} else
	//* 169  336:goto            472
		if(k == 3 || k == 4)
	//* 170  339:iload           6
	//* 171  341:iconst_3        
	//* 172  342:icmpeq          351
	//* 173  345:iload           6
	//* 174  347:iconst_4        
	//* 175  348:icmpne          472
		{
			if(edgeType != 3)
	//* 176  351:aload_0         
	//* 177  352:getfield        #232 <Field int edgeType>
	//* 178  355:iconst_3        
	//* 179  356:icmpne          362
	//* 180  359:goto            365
				flag = false;
	//  181  362:iconst_0        
	//  182  363:istore          5
			int i1 = -1;
	//  183  365:iconst_m1       
	//  184  366:istore          7
			int l;
			if(flag)
	//* 185  368:iload           5
	//* 186  370:ifeq            379
				l = -1;
	//  187  373:iconst_m1       
	//  188  374:istore          6
			else
	//* 189  376:goto            385
				l = edgeColor;
	//  190  379:aload_0         
	//  191  380:getfield        #248 <Field int edgeColor>
	//  192  383:istore          6
			if(flag)
	//* 193  385:iload           5
	//* 194  387:ifeq            396
				i1 = edgeColor;
	//  195  390:aload_0         
	//  196  391:getfield        #248 <Field int edgeColor>
	//  197  394:istore          7
			float f2 = shadowRadius / 2.0F;
	//  198  396:aload_0         
	//  199  397:getfield        #115 <Field float shadowRadius>
	//  200  400:fconst_2        
	//  201  401:fdiv            
	//  202  402:fstore_2        
			textPaint.setColor(foregroundColor);
	//  203  403:aload_0         
	//  204  404:getfield        #122 <Field TextPaint textPaint>
	//  205  407:aload_0         
	//  206  408:getfield        #262 <Field int foregroundColor>
	//  207  411:invokevirtual   #249 <Method void TextPaint.setColor(int)>
			textPaint.setStyle(android.graphics.Paint.Style.FILL);
	//  208  414:aload_0         
	//  209  415:getfield        #122 <Field TextPaint textPaint>
	//  210  418:getstatic       #141 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//  211  421:invokevirtual   #253 <Method void TextPaint.setStyle(android.graphics.Paint$Style)>
			TextPaint textpaint1 = textPaint;
	//  212  424:aload_0         
	//  213  425:getfield        #122 <Field TextPaint textPaint>
	//  214  428:astore          10
			float f5 = shadowRadius;
	//  215  430:aload_0         
	//  216  431:getfield        #115 <Field float shadowRadius>
	//  217  434:fstore_3        
			float f6 = -f2;
	//  218  435:fload_2         
	//  219  436:fneg            
	//  220  437:fstore          4
			textpaint1.setShadowLayer(f5, f6, f6, l);
	//  221  439:aload           10
	//  222  441:fload_3         
	//  223  442:fload           4
	//  224  444:fload           4
	//  225  446:iload           6
	//  226  448:invokevirtual   #260 <Method void TextPaint.setShadowLayer(float, float, float, int)>
			staticlayout.draw(canvas);
	//  227  451:aload           9
	//  228  453:aload_1         
	//  229  454:invokevirtual   #256 <Method void StaticLayout.draw(Canvas)>
			textPaint.setShadowLayer(shadowRadius, f2, f2, i1);
	//  230  457:aload_0         
	//  231  458:getfield        #122 <Field TextPaint textPaint>
	//  232  461:aload_0         
	//  233  462:getfield        #115 <Field float shadowRadius>
	//  234  465:fload_2         
	//  235  466:fload_2         
	//  236  467:iload           7
	//  237  469:invokevirtual   #260 <Method void TextPaint.setShadowLayer(float, float, float, int)>
		}
		textPaint.setColor(foregroundColor);
	//  238  472:aload_0         
	//  239  473:getfield        #122 <Field TextPaint textPaint>
	//  240  476:aload_0         
	//  241  477:getfield        #262 <Field int foregroundColor>
	//  242  480:invokevirtual   #249 <Method void TextPaint.setColor(int)>
		textPaint.setStyle(android.graphics.Paint.Style.FILL);
	//  243  483:aload_0         
	//  244  484:getfield        #122 <Field TextPaint textPaint>
	//  245  487:getstatic       #141 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//  246  490:invokevirtual   #253 <Method void TextPaint.setStyle(android.graphics.Paint$Style)>
		staticlayout.draw(canvas);
	//  247  493:aload           9
	//  248  495:aload_1         
	//  249  496:invokevirtual   #256 <Method void StaticLayout.draw(Canvas)>
		textPaint.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
	//  250  499:aload_0         
	//  251  500:getfield        #122 <Field TextPaint textPaint>
	//  252  503:fconst_0        
	//  253  504:fconst_0        
	//  254  505:fconst_0        
	//  255  506:iconst_0        
	//  256  507:invokevirtual   #260 <Method void TextPaint.setShadowLayer(float, float, float, int)>
		canvas.restoreToCount(j1);
	//  257  510:aload_1         
	//  258  511:iload           8
	//  259  513:invokevirtual   #265 <Method void Canvas.restoreToCount(int)>
	//  260  516:return          
	}

	public void draw(Cue cue, boolean flag, CaptionStyleCompat captionstylecompat, float f, float f1, Canvas canvas, int i, 
			int j, int k, int l)
	{
		CharSequence charsequence = cue.text;
	//    0    0:aload_1         
	//    1    1:getfield        #271 <Field CharSequence Cue.text>
	//    2    4:astore          17
		if(TextUtils.isEmpty(charsequence))
	//*   3    6:aload           17
	//*   4    8:invokestatic    #277 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5   11:ifeq            15
			return;
	//    6   14:return          
		Object obj = ((Object) (charsequence));
	//    7   15:aload           17
	//    8   17:astore          16
		if(!flag)
	//*   9   19:iload_2         
	//*  10   20:ifne            32
			obj = ((Object) (charsequence.toString()));
	//   11   23:aload           17
	//   12   25:invokeinterface #283 <Method String CharSequence.toString()>
	//   13   30:astore          16
		if(areCharSequencesEqual(cueText, ((CharSequence) (obj))) && Util.areEqual(((Object) (cueTextAlignment)), ((Object) (cue.textAlignment))) && cueLine == cue.line && cueLineType == cue.lineType && Util.areEqual(((Object) (Integer.valueOf(cueLineAnchor))), ((Object) (Integer.valueOf(cue.lineAnchor)))) && cuePosition == cue.position && Util.areEqual(((Object) (Integer.valueOf(cuePositionAnchor))), ((Object) (Integer.valueOf(cue.positionAnchor)))) && cueSize == cue.size && applyEmbeddedStyles == flag && foregroundColor == captionstylecompat.foregroundColor && backgroundColor == captionstylecompat.backgroundColor && windowColor == captionstylecompat.windowColor && edgeType == captionstylecompat.edgeType && edgeColor == captionstylecompat.edgeColor && Util.areEqual(((Object) (textPaint.getTypeface())), ((Object) (captionstylecompat.typeface))) && textSizePx == f && bottomPaddingFraction == f1 && parentLeft == i && parentTop == j && parentRight == k && parentBottom == l)
	//*  14   32:aload_0         
	//*  15   33:getfield        #285 <Field CharSequence cueText>
	//*  16   36:aload           16
	//*  17   38:invokestatic    #287 <Method boolean areCharSequencesEqual(CharSequence, CharSequence)>
	//*  18   41:ifeq            288
	//*  19   44:aload_0         
	//*  20   45:getfield        #289 <Field android.text.Layout$Alignment cueTextAlignment>
	//*  21   48:aload_1         
	//*  22   49:getfield        #292 <Field android.text.Layout$Alignment Cue.textAlignment>
	//*  23   52:invokestatic    #298 <Method boolean Util.areEqual(Object, Object)>
	//*  24   55:ifeq            288
	//*  25   58:aload_0         
	//*  26   59:getfield        #300 <Field float cueLine>
	//*  27   62:aload_1         
	//*  28   63:getfield        #303 <Field float Cue.line>
	//*  29   66:fcmpl           
	//*  30   67:ifne            288
	//*  31   70:aload_0         
	//*  32   71:getfield        #305 <Field int cueLineType>
	//*  33   74:aload_1         
	//*  34   75:getfield        #308 <Field int Cue.lineType>
	//*  35   78:icmpne          288
	//*  36   81:aload_0         
	//*  37   82:getfield        #310 <Field int cueLineAnchor>
	//*  38   85:invokestatic    #316 <Method Integer Integer.valueOf(int)>
	//*  39   88:aload_1         
	//*  40   89:getfield        #319 <Field int Cue.lineAnchor>
	//*  41   92:invokestatic    #316 <Method Integer Integer.valueOf(int)>
	//*  42   95:invokestatic    #298 <Method boolean Util.areEqual(Object, Object)>
	//*  43   98:ifeq            288
	//*  44  101:aload_0         
	//*  45  102:getfield        #321 <Field float cuePosition>
	//*  46  105:aload_1         
	//*  47  106:getfield        #324 <Field float Cue.position>
	//*  48  109:fcmpl           
	//*  49  110:ifne            288
	//*  50  113:aload_0         
	//*  51  114:getfield        #326 <Field int cuePositionAnchor>
	//*  52  117:invokestatic    #316 <Method Integer Integer.valueOf(int)>
	//*  53  120:aload_1         
	//*  54  121:getfield        #329 <Field int Cue.positionAnchor>
	//*  55  124:invokestatic    #316 <Method Integer Integer.valueOf(int)>
	//*  56  127:invokestatic    #298 <Method boolean Util.areEqual(Object, Object)>
	//*  57  130:ifeq            288
	//*  58  133:aload_0         
	//*  59  134:getfield        #331 <Field float cueSize>
	//*  60  137:aload_1         
	//*  61  138:getfield        #334 <Field float Cue.size>
	//*  62  141:fcmpl           
	//*  63  142:ifne            288
	//*  64  145:aload_0         
	//*  65  146:getfield        #336 <Field boolean applyEmbeddedStyles>
	//*  66  149:iload_2         
	//*  67  150:icmpne          288
	//*  68  153:aload_0         
	//*  69  154:getfield        #262 <Field int foregroundColor>
	//*  70  157:aload_3         
	//*  71  158:getfield        #339 <Field int CaptionStyleCompat.foregroundColor>
	//*  72  161:icmpne          288
	//*  73  164:aload_0         
	//*  74  165:getfield        #198 <Field int backgroundColor>
	//*  75  168:aload_3         
	//*  76  169:getfield        #340 <Field int CaptionStyleCompat.backgroundColor>
	//*  77  172:icmpne          288
	//*  78  175:aload_0         
	//*  79  176:getfield        #172 <Field int windowColor>
	//*  80  179:aload_3         
	//*  81  180:getfield        #341 <Field int CaptionStyleCompat.windowColor>
	//*  82  183:icmpne          288
	//*  83  186:aload_0         
	//*  84  187:getfield        #232 <Field int edgeType>
	//*  85  190:aload_3         
	//*  86  191:getfield        #342 <Field int CaptionStyleCompat.edgeType>
	//*  87  194:icmpne          288
	//*  88  197:aload_0         
	//*  89  198:getfield        #248 <Field int edgeColor>
	//*  90  201:aload_3         
	//*  91  202:getfield        #343 <Field int CaptionStyleCompat.edgeColor>
	//*  92  205:icmpne          288
	//*  93  208:aload_0         
	//*  94  209:getfield        #122 <Field TextPaint textPaint>
	//*  95  212:invokevirtual   #347 <Method android.graphics.Typeface TextPaint.getTypeface()>
	//*  96  215:aload_3         
	//*  97  216:getfield        #351 <Field android.graphics.Typeface CaptionStyleCompat.typeface>
	//*  98  219:invokestatic    #298 <Method boolean Util.areEqual(Object, Object)>
	//*  99  222:ifeq            288
	//* 100  225:aload_0         
	//* 101  226:getfield        #353 <Field float textSizePx>
	//* 102  229:fload           4
	//* 103  231:fcmpl           
	//* 104  232:ifne            288
	//* 105  235:aload_0         
	//* 106  236:getfield        #355 <Field float bottomPaddingFraction>
	//* 107  239:fload           5
	//* 108  241:fcmpl           
	//* 109  242:ifne            288
	//* 110  245:aload_0         
	//* 111  246:getfield        #357 <Field int parentLeft>
	//* 112  249:iload           7
	//* 113  251:icmpne          288
	//* 114  254:aload_0         
	//* 115  255:getfield        #359 <Field int parentTop>
	//* 116  258:iload           8
	//* 117  260:icmpne          288
	//* 118  263:aload_0         
	//* 119  264:getfield        #361 <Field int parentRight>
	//* 120  267:iload           9
	//* 121  269:icmpne          288
	//* 122  272:aload_0         
	//* 123  273:getfield        #363 <Field int parentBottom>
	//* 124  276:iload           10
	//* 125  278:icmpne          288
		{
			drawLayout(canvas);
	//  126  281:aload_0         
	//  127  282:aload           6
	//  128  284:invokespecial   #365 <Method void drawLayout(Canvas)>
			return;
	//  129  287:return          
		}
		cueText = ((CharSequence) (obj));
	//  130  288:aload_0         
	//  131  289:aload           16
	//  132  291:putfield        #285 <Field CharSequence cueText>
		cueTextAlignment = cue.textAlignment;
	//  133  294:aload_0         
	//  134  295:aload_1         
	//  135  296:getfield        #292 <Field android.text.Layout$Alignment Cue.textAlignment>
	//  136  299:putfield        #289 <Field android.text.Layout$Alignment cueTextAlignment>
		cueLine = cue.line;
	//  137  302:aload_0         
	//  138  303:aload_1         
	//  139  304:getfield        #303 <Field float Cue.line>
	//  140  307:putfield        #300 <Field float cueLine>
		cueLineType = cue.lineType;
	//  141  310:aload_0         
	//  142  311:aload_1         
	//  143  312:getfield        #308 <Field int Cue.lineType>
	//  144  315:putfield        #305 <Field int cueLineType>
		cueLineAnchor = cue.lineAnchor;
	//  145  318:aload_0         
	//  146  319:aload_1         
	//  147  320:getfield        #319 <Field int Cue.lineAnchor>
	//  148  323:putfield        #310 <Field int cueLineAnchor>
		cuePosition = cue.position;
	//  149  326:aload_0         
	//  150  327:aload_1         
	//  151  328:getfield        #324 <Field float Cue.position>
	//  152  331:putfield        #321 <Field float cuePosition>
		cuePositionAnchor = cue.positionAnchor;
	//  153  334:aload_0         
	//  154  335:aload_1         
	//  155  336:getfield        #329 <Field int Cue.positionAnchor>
	//  156  339:putfield        #326 <Field int cuePositionAnchor>
		cueSize = cue.size;
	//  157  342:aload_0         
	//  158  343:aload_1         
	//  159  344:getfield        #334 <Field float Cue.size>
	//  160  347:putfield        #331 <Field float cueSize>
		applyEmbeddedStyles = flag;
	//  161  350:aload_0         
	//  162  351:iload_2         
	//  163  352:putfield        #336 <Field boolean applyEmbeddedStyles>
		foregroundColor = captionstylecompat.foregroundColor;
	//  164  355:aload_0         
	//  165  356:aload_3         
	//  166  357:getfield        #339 <Field int CaptionStyleCompat.foregroundColor>
	//  167  360:putfield        #262 <Field int foregroundColor>
		backgroundColor = captionstylecompat.backgroundColor;
	//  168  363:aload_0         
	//  169  364:aload_3         
	//  170  365:getfield        #340 <Field int CaptionStyleCompat.backgroundColor>
	//  171  368:putfield        #198 <Field int backgroundColor>
		windowColor = captionstylecompat.windowColor;
	//  172  371:aload_0         
	//  173  372:aload_3         
	//  174  373:getfield        #341 <Field int CaptionStyleCompat.windowColor>
	//  175  376:putfield        #172 <Field int windowColor>
		edgeType = captionstylecompat.edgeType;
	//  176  379:aload_0         
	//  177  380:aload_3         
	//  178  381:getfield        #342 <Field int CaptionStyleCompat.edgeType>
	//  179  384:putfield        #232 <Field int edgeType>
		edgeColor = captionstylecompat.edgeColor;
	//  180  387:aload_0         
	//  181  388:aload_3         
	//  182  389:getfield        #343 <Field int CaptionStyleCompat.edgeColor>
	//  183  392:putfield        #248 <Field int edgeColor>
		textPaint.setTypeface(captionstylecompat.typeface);
	//  184  395:aload_0         
	//  185  396:getfield        #122 <Field TextPaint textPaint>
	//  186  399:aload_3         
	//  187  400:getfield        #351 <Field android.graphics.Typeface CaptionStyleCompat.typeface>
	//  188  403:invokevirtual   #369 <Method android.graphics.Typeface TextPaint.setTypeface(android.graphics.Typeface)>
	//  189  406:pop             
		textSizePx = f;
	//  190  407:aload_0         
	//  191  408:fload           4
	//  192  410:putfield        #353 <Field float textSizePx>
		bottomPaddingFraction = f1;
	//  193  413:aload_0         
	//  194  414:fload           5
	//  195  416:putfield        #355 <Field float bottomPaddingFraction>
		parentLeft = i;
	//  196  419:aload_0         
	//  197  420:iload           7
	//  198  422:putfield        #357 <Field int parentLeft>
		parentTop = j;
	//  199  425:aload_0         
	//  200  426:iload           8
	//  201  428:putfield        #359 <Field int parentTop>
		parentRight = k;
	//  202  431:aload_0         
	//  203  432:iload           9
	//  204  434:putfield        #361 <Field int parentRight>
		parentBottom = l;
	//  205  437:aload_0         
	//  206  438:iload           10
	//  207  440:putfield        #363 <Field int parentBottom>
		int i1 = parentRight - parentLeft;
	//  208  443:aload_0         
	//  209  444:getfield        #361 <Field int parentRight>
	//  210  447:aload_0         
	//  211  448:getfield        #357 <Field int parentLeft>
	//  212  451:isub            
	//  213  452:istore          11
		int k1 = parentBottom - parentTop;
	//  214  454:aload_0         
	//  215  455:getfield        #363 <Field int parentBottom>
	//  216  458:aload_0         
	//  217  459:getfield        #359 <Field int parentTop>
	//  218  462:isub            
	//  219  463:istore          13
		textPaint.setTextSize(f);
	//  220  465:aload_0         
	//  221  466:getfield        #122 <Field TextPaint textPaint>
	//  222  469:fload           4
	//  223  471:invokevirtual   #372 <Method void TextPaint.setTextSize(float)>
		int j1 = (int)(0.125F * f + 0.5F);
	//  224  474:ldc1            #7   <Float 0.125F>
	//  225  476:fload           4
	//  226  478:fmul            
	//  227  479:ldc2            #373 <Float 0.5F>
	//  228  482:fadd            
	//  229  483:f2i             
	//  230  484:istore          12
		int l1 = j1 * 2;
	//  231  486:iload           12
	//  232  488:iconst_2        
	//  233  489:imul            
	//  234  490:istore          14
		j = i1 - l1;
	//  235  492:iload           11
	//  236  494:iload           14
	//  237  496:isub            
	//  238  497:istore          8
		f = cueSize;
	//  239  499:aload_0         
	//  240  500:getfield        #331 <Field float cueSize>
	//  241  503:fstore          4
		i = j;
	//  242  505:iload           8
	//  243  507:istore          7
		if(f != 1.401298E-45F)
	//* 244  509:fload           4
	//* 245  511:ldc2            #374 <Float 1.401298E-45F>
	//* 246  514:fcmpl           
	//* 247  515:ifeq            527
			i = (int)((float)j * f);
	//  248  518:iload           8
	//  249  520:i2f             
	//  250  521:fload           4
	//  251  523:fmul            
	//  252  524:f2i             
	//  253  525:istore          7
		if(i <= 0)
	//* 254  527:iload           7
	//* 255  529:ifgt            542
		{
			Log.w("CuePainter", "Skipped drawing subtitle cue (insufficient space)");
	//  256  532:ldc1            #11  <String "CuePainter">
	//  257  534:ldc2            #376 <String "Skipped drawing subtitle cue (insufficient space)">
	//  258  537:invokestatic    #382 <Method int Log.w(String, String)>
	//  259  540:pop             
			return;
	//  260  541:return          
		}
		captionstylecompat = ((CaptionStyleCompat) (cueTextAlignment));
	//  261  542:aload_0         
	//  262  543:getfield        #289 <Field android.text.Layout$Alignment cueTextAlignment>
	//  263  546:astore_3        
		cue = ((Cue) (captionstylecompat));
	//  264  547:aload_3         
	//  265  548:astore_1        
		if(captionstylecompat == null)
	//* 266  549:aload_3         
	//* 267  550:ifnonnull       557
			cue = ((Cue) (android.text.Layout.Alignment.ALIGN_CENTER));
	//  268  553:getstatic       #387 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_CENTER>
	//  269  556:astore_1        
		textLayout = new StaticLayout(((CharSequence) (obj)), textPaint, i, ((android.text.Layout.Alignment) (cue)), spacingMult, spacingAdd, true);
	//  270  557:aload_0         
	//  271  558:new             #186 <Class StaticLayout>
	//  272  561:dup             
	//  273  562:aload           16
	//  274  564:aload_0         
	//  275  565:getfield        #122 <Field TextPaint textPaint>
	//  276  568:iload           7
	//  277  570:aload_1         
	//  278  571:aload_0         
	//  279  572:getfield        #84  <Field float spacingMult>
	//  280  575:aload_0         
	//  281  576:getfield        #78  <Field float spacingAdd>
	//  282  579:iconst_1        
	//  283  580:invokespecial   #390 <Method void StaticLayout(CharSequence, TextPaint, int, android.text.Layout$Alignment, float, float, boolean)>
	//  284  583:putfield        #156 <Field StaticLayout textLayout>
		k = textLayout.getHeight();
	//  285  586:aload_0         
	//  286  587:getfield        #156 <Field StaticLayout textLayout>
	//  287  590:invokevirtual   #192 <Method int StaticLayout.getHeight()>
	//  288  593:istore          9
		int i2 = textLayout.getLineCount();
	//  289  595:aload_0         
	//  290  596:getfield        #156 <Field StaticLayout textLayout>
	//  291  599:invokevirtual   #204 <Method int StaticLayout.getLineCount()>
	//  292  602:istore          15
		l = 0;
	//  293  604:iconst_0        
	//  294  605:istore          10
		j = 0;
	//  295  607:iconst_0        
	//  296  608:istore          8
		for(; l < i2; l++)
	//* 297  610:iload           10
	//* 298  612:iload           15
	//* 299  614:icmpge          647
			j = Math.max((int)Math.ceil(textLayout.getLineWidth(l)), j);
	//  300  617:aload_0         
	//  301  618:getfield        #156 <Field StaticLayout textLayout>
	//  302  621:iload           10
	//  303  623:invokevirtual   #393 <Method float StaticLayout.getLineWidth(int)>
	//  304  626:f2d             
	//  305  627:invokestatic    #397 <Method double Math.ceil(double)>
	//  306  630:d2i             
	//  307  631:iload           8
	//  308  633:invokestatic    #400 <Method int Math.max(int, int)>
	//  309  636:istore          8

	//  310  638:iload           10
	//  311  640:iconst_1        
	//  312  641:iadd            
	//  313  642:istore          10
	//* 314  644:goto            610
		if(cueSize == 1.401298E-45F || j >= i)
	//* 315  647:aload_0         
	//* 316  648:getfield        #331 <Field float cueSize>
	//* 317  651:ldc2            #374 <Float 1.401298E-45F>
	//* 318  654:fcmpl           
	//* 319  655:ifeq            668
	//* 320  658:iload           8
	//* 321  660:iload           7
	//* 322  662:icmpge          668
	//* 323  665:goto            672
			i = j;
	//  324  668:iload           8
	//  325  670:istore          7
		l1 = i + l1;
	//  326  672:iload           7
	//  327  674:iload           14
	//  328  676:iadd            
	//  329  677:istore          14
		f = cuePosition;
	//  330  679:aload_0         
	//  331  680:getfield        #321 <Field float cuePosition>
	//  332  683:fstore          4
		if(f != 1.401298E-45F)
	//* 333  685:fload           4
	//* 334  687:ldc2            #374 <Float 1.401298E-45F>
	//* 335  690:fcmpl           
	//* 336  691:ifeq            781
		{
			j = Math.round((float)i1 * f) + parentLeft;
	//  337  694:iload           11
	//  338  696:i2f             
	//  339  697:fload           4
	//  340  699:fmul            
	//  341  700:invokestatic    #109 <Method int Math.round(float)>
	//  342  703:aload_0         
	//  343  704:getfield        #357 <Field int parentLeft>
	//  344  707:iadd            
	//  345  708:istore          8
			l = cuePositionAnchor;
	//  346  710:aload_0         
	//  347  711:getfield        #326 <Field int cuePositionAnchor>
	//  348  714:istore          10
			if(l == 2)
	//* 349  716:iload           10
	//* 350  718:iconst_2        
	//* 351  719:icmpne          732
			{
				i = j - l1;
	//  352  722:iload           8
	//  353  724:iload           14
	//  354  726:isub            
	//  355  727:istore          7
			} else
	//* 356  729:goto            753
			{
				i = j;
	//  357  732:iload           8
	//  358  734:istore          7
				if(l == 1)
	//* 359  736:iload           10
	//* 360  738:iconst_1        
	//* 361  739:icmpne          753
					i = (j * 2 - l1) / 2;
	//  362  742:iload           8
	//  363  744:iconst_2        
	//  364  745:imul            
	//  365  746:iload           14
	//  366  748:isub            
	//  367  749:iconst_2        
	//  368  750:idiv            
	//  369  751:istore          7
			}
			l = Math.max(i, parentLeft);
	//  370  753:iload           7
	//  371  755:aload_0         
	//  372  756:getfield        #357 <Field int parentLeft>
	//  373  759:invokestatic    #400 <Method int Math.max(int, int)>
	//  374  762:istore          10
			i1 = Math.min(l1 + l, parentRight);
	//  375  764:iload           14
	//  376  766:iload           10
	//  377  768:iadd            
	//  378  769:aload_0         
	//  379  770:getfield        #361 <Field int parentRight>
	//  380  773:invokestatic    #403 <Method int Math.min(int, int)>
	//  381  776:istore          11
		} else
	//* 382  778:goto            797
		{
			l = (i1 - l1) / 2;
	//  383  781:iload           11
	//  384  783:iload           14
	//  385  785:isub            
	//  386  786:iconst_2        
	//  387  787:idiv            
	//  388  788:istore          10
			i1 = l + l1;
	//  389  790:iload           10
	//  390  792:iload           14
	//  391  794:iadd            
	//  392  795:istore          11
		}
		f = cueLine;
	//  393  797:aload_0         
	//  394  798:getfield        #300 <Field float cueLine>
	//  395  801:fstore          4
		if(f != 1.401298E-45F)
	//* 396  803:fload           4
	//* 397  805:ldc2            #374 <Float 1.401298E-45F>
	//* 398  808:fcmpl           
	//* 399  809:ifeq            998
		{
			if(cueLineType == 0)
	//* 400  812:aload_0         
	//* 401  813:getfield        #305 <Field int cueLineType>
	//* 402  816:ifne            838
			{
				j = Math.round((float)k1 * f) + parentTop;
	//  403  819:iload           13
	//  404  821:i2f             
	//  405  822:fload           4
	//  406  824:fmul            
	//  407  825:invokestatic    #109 <Method int Math.round(float)>
	//  408  828:aload_0         
	//  409  829:getfield        #359 <Field int parentTop>
	//  410  832:iadd            
	//  411  833:istore          8
			} else
	//* 412  835:goto            905
			{
				i = textLayout.getLineBottom(0) - textLayout.getLineTop(0);
	//  413  838:aload_0         
	//  414  839:getfield        #156 <Field StaticLayout textLayout>
	//  415  842:iconst_0        
	//  416  843:invokevirtual   #223 <Method int StaticLayout.getLineBottom(int)>
	//  417  846:aload_0         
	//  418  847:getfield        #156 <Field StaticLayout textLayout>
	//  419  850:iconst_0        
	//  420  851:invokevirtual   #201 <Method int StaticLayout.getLineTop(int)>
	//  421  854:isub            
	//  422  855:istore          7
				f = cueLine;
	//  423  857:aload_0         
	//  424  858:getfield        #300 <Field float cueLine>
	//  425  861:fstore          4
				if(f >= 0.0F)
	//* 426  863:fload           4
	//* 427  865:fconst_0        
	//* 428  866:fcmpl           
	//* 429  867:iflt            889
					j = Math.round(f * (float)i) + parentTop;
	//  430  870:fload           4
	//  431  872:iload           7
	//  432  874:i2f             
	//  433  875:fmul            
	//  434  876:invokestatic    #109 <Method int Math.round(float)>
	//  435  879:aload_0         
	//  436  880:getfield        #359 <Field int parentTop>
	//  437  883:iadd            
	//  438  884:istore          8
				else
	//* 439  886:goto            905
					j = Math.round(f * (float)i) + parentBottom;
	//  440  889:fload           4
	//  441  891:iload           7
	//  442  893:i2f             
	//  443  894:fmul            
	//  444  895:invokestatic    #109 <Method int Math.round(float)>
	//  445  898:aload_0         
	//  446  899:getfield        #363 <Field int parentBottom>
	//  447  902:iadd            
	//  448  903:istore          8
			}
			k1 = cueLineAnchor;
	//  449  905:aload_0         
	//  450  906:getfield        #310 <Field int cueLineAnchor>
	//  451  909:istore          13
			if(k1 == 2)
	//* 452  911:iload           13
	//* 453  913:iconst_2        
	//* 454  914:icmpne          927
			{
				i = j - k;
	//  455  917:iload           8
	//  456  919:iload           9
	//  457  921:isub            
	//  458  922:istore          7
			} else
	//* 459  924:goto            948
			{
				i = j;
	//  460  927:iload           8
	//  461  929:istore          7
				if(k1 == 1)
	//* 462  931:iload           13
	//* 463  933:iconst_1        
	//* 464  934:icmpne          948
					i = (j * 2 - k) / 2;
	//  465  937:iload           8
	//  466  939:iconst_2        
	//  467  940:imul            
	//  468  941:iload           9
	//  469  943:isub            
	//  470  944:iconst_2        
	//  471  945:idiv            
	//  472  946:istore          7
			}
			j = parentBottom;
	//  473  948:aload_0         
	//  474  949:getfield        #363 <Field int parentBottom>
	//  475  952:istore          8
			if(i + k > j)
	//* 476  954:iload           7
	//* 477  956:iload           9
	//* 478  958:iadd            
	//* 479  959:iload           8
	//* 480  961:icmple          974
			{
				j -= k;
	//  481  964:iload           8
	//  482  966:iload           9
	//  483  968:isub            
	//  484  969:istore          8
			} else
	//* 485  971:goto            1015
			{
				k = parentTop;
	//  486  974:aload_0         
	//  487  975:getfield        #359 <Field int parentTop>
	//  488  978:istore          9
				j = i;
	//  489  980:iload           7
	//  490  982:istore          8
				if(i < k)
	//* 491  984:iload           7
	//* 492  986:iload           9
	//* 493  988:icmpge          1015
					j = k;
	//  494  991:iload           9
	//  495  993:istore          8
			}
		} else
	//* 496  995:goto            1015
		{
			j = parentBottom - k - (int)((float)k1 * f1);
	//  497  998:aload_0         
	//  498  999:getfield        #363 <Field int parentBottom>
	//  499 1002:iload           9
	//  500 1004:isub            
	//  501 1005:iload           13
	//  502 1007:i2f             
	//  503 1008:fload           5
	//  504 1010:fmul            
	//  505 1011:f2i             
	//  506 1012:isub            
	//  507 1013:istore          8
		}
		textLayout = new StaticLayout(((CharSequence) (obj)), textPaint, i1 - l, ((android.text.Layout.Alignment) (cue)), spacingMult, spacingAdd, true);
	//  508 1015:aload_0         
	//  509 1016:new             #186 <Class StaticLayout>
	//  510 1019:dup             
	//  511 1020:aload           16
	//  512 1022:aload_0         
	//  513 1023:getfield        #122 <Field TextPaint textPaint>
	//  514 1026:iload           11
	//  515 1028:iload           10
	//  516 1030:isub            
	//  517 1031:aload_1         
	//  518 1032:aload_0         
	//  519 1033:getfield        #84  <Field float spacingMult>
	//  520 1036:aload_0         
	//  521 1037:getfield        #78  <Field float spacingAdd>
	//  522 1040:iconst_1        
	//  523 1041:invokespecial   #390 <Method void StaticLayout(CharSequence, TextPaint, int, android.text.Layout$Alignment, float, float, boolean)>
	//  524 1044:putfield        #156 <Field StaticLayout textLayout>
		textLeft = l;
	//  525 1047:aload_0         
	//  526 1048:iload           10
	//  527 1050:putfield        #164 <Field int textLeft>
		textTop = j;
	//  528 1053:aload_0         
	//  529 1054:iload           8
	//  530 1056:putfield        #166 <Field int textTop>
		textPaddingX = j1;
	//  531 1059:aload_0         
	//  532 1060:iload           12
	//  533 1062:putfield        #184 <Field int textPaddingX>
		drawLayout(canvas);
	//  534 1065:aload_0         
	//  535 1066:aload           6
	//  536 1068:invokespecial   #365 <Method void drawLayout(Canvas)>
	//  537 1071:return          
	}

	private static final float INNER_PADDING_RATIO = 0.125F;
	private static final String TAG = "CuePainter";
	private boolean applyEmbeddedStyles;
	private int backgroundColor;
	private float bottomPaddingFraction;
	private final float cornerRadius;
	private float cueLine;
	private int cueLineAnchor;
	private int cueLineType;
	private float cuePosition;
	private int cuePositionAnchor;
	private float cueSize;
	private CharSequence cueText;
	private android.text.Layout.Alignment cueTextAlignment;
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
	private float textSizePx;
	private int textTop;
	private int windowColor;
}
