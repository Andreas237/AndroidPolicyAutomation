// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.*;
import android.support.design.animation.AnimationUtils;
import android.support.v4.math.MathUtils;
import android.support.v4.text.TextDirectionHeuristicCompat;
import android.support.v4.text.TextDirectionHeuristicsCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.TintTypedArray;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;

public final class CollapsingTextHelper
{

	public CollapsingTextHelper(View view1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method void Object()>
		expandedTextGravity = 16;
	//    2    4:aload_0         
	//    3    5:bipush          16
	//    4    7:putfield        #100 <Field int expandedTextGravity>
		collapsedTextGravity = 16;
	//    5   10:aload_0         
	//    6   11:bipush          16
	//    7   13:putfield        #102 <Field int collapsedTextGravity>
		expandedTextSize = 15F;
	//    8   16:aload_0         
	//    9   17:ldc1            #103 <Float 15F>
	//   10   19:putfield        #105 <Field float expandedTextSize>
		collapsedTextSize = 15F;
	//   11   22:aload_0         
	//   12   23:ldc1            #103 <Float 15F>
	//   13   25:putfield        #107 <Field float collapsedTextSize>
		view = view1;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:putfield        #109 <Field View view>
	//   17   33:aload_0         
	//   18   34:new             #111 <Class TextPaint>
	//   19   37:dup             
	//   20   38:sipush          129
	//   21   41:invokespecial   #113 <Method void TextPaint(int)>
	//   22   44:putfield        #115 <Field TextPaint textPaint>
		tmpPaint = new TextPaint(((Paint) (textPaint)));
	//   23   47:aload_0         
	//   24   48:new             #111 <Class TextPaint>
	//   25   51:dup             
	//   26   52:aload_0         
	//   27   53:getfield        #115 <Field TextPaint textPaint>
	//   28   56:invokespecial   #118 <Method void TextPaint(Paint)>
	//   29   59:putfield        #120 <Field TextPaint tmpPaint>
	//   30   62:aload_0         
	//   31   63:new             #122 <Class Rect>
	//   32   66:dup             
	//   33   67:invokespecial   #123 <Method void Rect()>
	//   34   70:putfield        #125 <Field Rect collapsedBounds>
	//   35   73:aload_0         
	//   36   74:new             #122 <Class Rect>
	//   37   77:dup             
	//   38   78:invokespecial   #123 <Method void Rect()>
	//   39   81:putfield        #127 <Field Rect expandedBounds>
	//   40   84:aload_0         
	//   41   85:new             #129 <Class RectF>
	//   42   88:dup             
	//   43   89:invokespecial   #130 <Method void RectF()>
	//   44   92:putfield        #132 <Field RectF currentBounds>
	//   45   95:return          
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
	//    5    5:invokestatic    #140 <Method int Color.alpha(int)>
	//    6    8:i2f             
	//    7    9:fstore          4
		float f3 = Color.alpha(j);
	//    8   11:iload_1         
	//    9   12:invokestatic    #140 <Method int Color.alpha(int)>
	//   10   15:i2f             
	//   11   16:fstore          5
		float f4 = Color.red(i);
	//   12   18:iload_0         
	//   13   19:invokestatic    #143 <Method int Color.red(int)>
	//   14   22:i2f             
	//   15   23:fstore          6
		float f5 = Color.red(j);
	//   16   25:iload_1         
	//   17   26:invokestatic    #143 <Method int Color.red(int)>
	//   18   29:i2f             
	//   19   30:fstore          7
		float f6 = Color.green(i);
	//   20   32:iload_0         
	//   21   33:invokestatic    #146 <Method int Color.green(int)>
	//   22   36:i2f             
	//   23   37:fstore          8
		float f7 = Color.green(j);
	//   24   39:iload_1         
	//   25   40:invokestatic    #146 <Method int Color.green(int)>
	//   26   43:i2f             
	//   27   44:fstore          9
		float f8 = Color.blue(i);
	//   28   46:iload_0         
	//   29   47:invokestatic    #149 <Method int Color.blue(int)>
	//   30   50:i2f             
	//   31   51:fstore          10
		float f9 = Color.blue(j);
	//   32   53:iload_1         
	//   33   54:invokestatic    #149 <Method int Color.blue(int)>
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
	//   68  100:invokestatic    #153 <Method int Color.argb(int, int, int, int)>
	//   69  103:ireturn         
	}

	private void calculateBaseOffsets()
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #156 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #158 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #163 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	private void calculateCurrentOffsets()
	{
		calculateOffsets(expandedFraction);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #166 <Field float expandedFraction>
	//    3    5:invokespecial   #170 <Method void calculateOffsets(float)>
	//    4    8:return          
	}

	private boolean calculateIsRtl(CharSequence charsequence)
	{
		int i = ViewCompat.getLayoutDirection(view);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field View view>
	//    2    4:invokestatic    #178 <Method int ViewCompat.getLayoutDirection(View)>
	//    3    7:istore_3        
		boolean flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
		if(i != 1)
	//*   6   10:iload_3         
	//*   7   11:iconst_1        
	//*   8   12:icmpne          18
	//*   9   15:goto            20
			flag = false;
	//   10   18:iconst_0        
	//   11   19:istore_2        
		TextDirectionHeuristicCompat textdirectionheuristiccompat;
		if(flag)
	//*  12   20:iload_2         
	//*  13   21:ifeq            32
			textdirectionheuristiccompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL;
	//   14   24:getstatic       #184 <Field TextDirectionHeuristicCompat TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL>
	//   15   27:astore          4
		else
	//*  16   29:goto            37
			textdirectionheuristiccompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
	//   17   32:getstatic       #187 <Field TextDirectionHeuristicCompat TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR>
	//   18   35:astore          4
		return textdirectionheuristiccompat.isRtl(charsequence, 0, charsequence.length());
	//   19   37:aload           4
	//   20   39:aload_1         
	//   21   40:iconst_0        
	//   22   41:aload_1         
	//   23   42:invokeinterface #193 <Method int CharSequence.length()>
	//   24   47:invokeinterface #198 <Method boolean TextDirectionHeuristicCompat.isRtl(CharSequence, int, int)>
	//   25   52:ireturn         
	}

	private void calculateOffsets(float f)
	{
		interpolateBounds(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokespecial   #201 <Method void interpolateBounds(float)>
		currentDrawX = lerp(expandedDrawX, collapsedDrawX, f, positionInterpolator);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #203 <Field float expandedDrawX>
	//    6   10:aload_0         
	//    7   11:getfield        #205 <Field float collapsedDrawX>
	//    8   14:fload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #207 <Field TimeInterpolator positionInterpolator>
	//   11   19:invokestatic    #211 <Method float lerp(float, float, float, TimeInterpolator)>
	//   12   22:putfield        #213 <Field float currentDrawX>
		currentDrawY = lerp(expandedDrawY, collapsedDrawY, f, positionInterpolator);
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #215 <Field float expandedDrawY>
	//   16   30:aload_0         
	//   17   31:getfield        #217 <Field float collapsedDrawY>
	//   18   34:fload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #207 <Field TimeInterpolator positionInterpolator>
	//   21   39:invokestatic    #211 <Method float lerp(float, float, float, TimeInterpolator)>
	//   22   42:putfield        #219 <Field float currentDrawY>
		setInterpolatedTextSize(lerp(expandedTextSize, collapsedTextSize, f, textSizeInterpolator));
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #105 <Field float expandedTextSize>
	//   26   50:aload_0         
	//   27   51:getfield        #107 <Field float collapsedTextSize>
	//   28   54:fload_1         
	//   29   55:aload_0         
	//   30   56:getfield        #221 <Field TimeInterpolator textSizeInterpolator>
	//   31   59:invokestatic    #211 <Method float lerp(float, float, float, TimeInterpolator)>
	//   32   62:invokespecial   #224 <Method void setInterpolatedTextSize(float)>
		if(collapsedTextColor != expandedTextColor)
	//*  33   65:aload_0         
	//*  34   66:getfield        #226 <Field ColorStateList collapsedTextColor>
	//*  35   69:aload_0         
	//*  36   70:getfield        #228 <Field ColorStateList expandedTextColor>
	//*  37   73:if_acmpeq       98
			textPaint.setColor(blendColors(getCurrentExpandedTextColor(), getCurrentCollapsedTextColor(), f));
	//   38   76:aload_0         
	//   39   77:getfield        #115 <Field TextPaint textPaint>
	//   40   80:aload_0         
	//   41   81:invokespecial   #231 <Method int getCurrentExpandedTextColor()>
	//   42   84:aload_0         
	//   43   85:invokevirtual   #234 <Method int getCurrentCollapsedTextColor()>
	//   44   88:fload_1         
	//   45   89:invokestatic    #236 <Method int blendColors(int, int, float)>
	//   46   92:invokevirtual   #237 <Method void TextPaint.setColor(int)>
		else
	//*  47   95:goto            109
			textPaint.setColor(getCurrentCollapsedTextColor());
	//   48   98:aload_0         
	//   49   99:getfield        #115 <Field TextPaint textPaint>
	//   50  102:aload_0         
	//   51  103:invokevirtual   #234 <Method int getCurrentCollapsedTextColor()>
	//   52  106:invokevirtual   #237 <Method void TextPaint.setColor(int)>
		textPaint.setShadowLayer(lerp(expandedShadowRadius, collapsedShadowRadius, f, ((TimeInterpolator) (null))), lerp(expandedShadowDx, collapsedShadowDx, f, ((TimeInterpolator) (null))), lerp(expandedShadowDy, collapsedShadowDy, f, ((TimeInterpolator) (null))), blendColors(expandedShadowColor, collapsedShadowColor, f));
	//   53  109:aload_0         
	//   54  110:getfield        #115 <Field TextPaint textPaint>
	//   55  113:aload_0         
	//   56  114:getfield        #239 <Field float expandedShadowRadius>
	//   57  117:aload_0         
	//   58  118:getfield        #241 <Field float collapsedShadowRadius>
	//   59  121:fload_1         
	//   60  122:aconst_null     
	//   61  123:invokestatic    #211 <Method float lerp(float, float, float, TimeInterpolator)>
	//   62  126:aload_0         
	//   63  127:getfield        #243 <Field float expandedShadowDx>
	//   64  130:aload_0         
	//   65  131:getfield        #245 <Field float collapsedShadowDx>
	//   66  134:fload_1         
	//   67  135:aconst_null     
	//   68  136:invokestatic    #211 <Method float lerp(float, float, float, TimeInterpolator)>
	//   69  139:aload_0         
	//   70  140:getfield        #247 <Field float expandedShadowDy>
	//   71  143:aload_0         
	//   72  144:getfield        #249 <Field float collapsedShadowDy>
	//   73  147:fload_1         
	//   74  148:aconst_null     
	//   75  149:invokestatic    #211 <Method float lerp(float, float, float, TimeInterpolator)>
	//   76  152:aload_0         
	//   77  153:getfield        #251 <Field int expandedShadowColor>
	//   78  156:aload_0         
	//   79  157:getfield        #253 <Field int collapsedShadowColor>
	//   80  160:fload_1         
	//   81  161:invokestatic    #236 <Method int blendColors(int, int, float)>
	//   82  164:invokevirtual   #257 <Method void TextPaint.setShadowLayer(float, float, float, int)>
		ViewCompat.postInvalidateOnAnimation(view);
	//   83  167:aload_0         
	//   84  168:getfield        #109 <Field View view>
	//   85  171:invokestatic    #260 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//   86  174:return          
	}

	private void calculateUsingTextSize(float f)
	{
		if(text == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #263 <Field CharSequence text>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		float f2 = collapsedBounds.width();
	//    4    8:aload_0         
	//    5    9:getfield        #125 <Field Rect collapsedBounds>
	//    6   12:invokevirtual   #266 <Method int Rect.width()>
	//    7   15:i2f             
	//    8   16:fstore_3        
		float f3 = expandedBounds.width();
	//    9   17:aload_0         
	//   10   18:getfield        #127 <Field Rect expandedBounds>
	//   11   21:invokevirtual   #266 <Method int Rect.width()>
	//   12   24:i2f             
	//   13   25:fstore          4
		boolean flag3 = isClose(f, collapsedTextSize);
	//   14   27:fload_1         
	//   15   28:aload_0         
	//   16   29:getfield        #107 <Field float collapsedTextSize>
	//   17   32:invokestatic    #270 <Method boolean isClose(float, float)>
	//   18   35:istore          8
		boolean flag2 = true;
	//   19   37:iconst_1        
	//   20   38:istore          7
		float f1;
		boolean flag;
		if(flag3)
	//*  21   40:iload           8
	//*  22   42:ifeq            94
		{
			f1 = collapsedTextSize;
	//   23   45:aload_0         
	//   24   46:getfield        #107 <Field float collapsedTextSize>
	//   25   49:fstore_2        
			scale = 1.0F;
	//   26   50:aload_0         
	//   27   51:fconst_1        
	//   28   52:putfield        #272 <Field float scale>
			Typeface typeface = currentTypeface;
	//   29   55:aload_0         
	//   30   56:getfield        #274 <Field Typeface currentTypeface>
	//   31   59:astore          9
			Typeface typeface2 = collapsedTypeface;
	//   32   61:aload_0         
	//   33   62:getfield        #276 <Field Typeface collapsedTypeface>
	//   34   65:astore          10
			if(typeface != typeface2)
	//*  35   67:aload           9
	//*  36   69:aload           10
	//*  37   71:if_acmpeq       86
			{
				currentTypeface = typeface2;
	//   38   74:aload_0         
	//   39   75:aload           10
	//   40   77:putfield        #274 <Field Typeface currentTypeface>
				flag = true;
	//   41   80:iconst_1        
	//   42   81:istore          5
			} else
	//*  43   83:goto            89
			{
				flag = false;
	//   44   86:iconst_0        
	//   45   87:istore          5
			}
			f = f2;
	//   46   89:fload_3         
	//   47   90:fstore_1        
		} else
	//*  48   91:goto            196
		{
			f1 = expandedTextSize;
	//   49   94:aload_0         
	//   50   95:getfield        #105 <Field float expandedTextSize>
	//   51   98:fstore_2        
			Typeface typeface1 = currentTypeface;
	//   52   99:aload_0         
	//   53  100:getfield        #274 <Field Typeface currentTypeface>
	//   54  103:astore          9
			Typeface typeface3 = expandedTypeface;
	//   55  105:aload_0         
	//   56  106:getfield        #278 <Field Typeface expandedTypeface>
	//   57  109:astore          10
			if(typeface1 != typeface3)
	//*  58  111:aload           9
	//*  59  113:aload           10
	//*  60  115:if_acmpeq       130
			{
				currentTypeface = typeface3;
	//   61  118:aload_0         
	//   62  119:aload           10
	//   63  121:putfield        #274 <Field Typeface currentTypeface>
				flag = true;
	//   64  124:iconst_1        
	//   65  125:istore          5
			} else
	//*  66  127:goto            133
			{
				flag = false;
	//   67  130:iconst_0        
	//   68  131:istore          5
			}
			if(isClose(f, expandedTextSize))
	//*  69  133:fload_1         
	//*  70  134:aload_0         
	//*  71  135:getfield        #105 <Field float expandedTextSize>
	//*  72  138:invokestatic    #270 <Method boolean isClose(float, float)>
	//*  73  141:ifeq            152
				scale = 1.0F;
	//   74  144:aload_0         
	//   75  145:fconst_1        
	//   76  146:putfield        #272 <Field float scale>
			else
	//*  77  149:goto            162
				scale = f / expandedTextSize;
	//   78  152:aload_0         
	//   79  153:fload_1         
	//   80  154:aload_0         
	//   81  155:getfield        #105 <Field float expandedTextSize>
	//   82  158:fdiv            
	//   83  159:putfield        #272 <Field float scale>
			f = collapsedTextSize / expandedTextSize;
	//   84  162:aload_0         
	//   85  163:getfield        #107 <Field float collapsedTextSize>
	//   86  166:aload_0         
	//   87  167:getfield        #105 <Field float expandedTextSize>
	//   88  170:fdiv            
	//   89  171:fstore_1        
			if(f3 * f > f2)
	//*  90  172:fload           4
	//*  91  174:fload_1         
	//*  92  175:fmul            
	//*  93  176:fload_3         
	//*  94  177:fcmpl           
	//*  95  178:ifle            193
				f = Math.min(f2 / f, f3);
	//   96  181:fload_3         
	//   97  182:fload_1         
	//   98  183:fdiv            
	//   99  184:fload           4
	//  100  186:invokestatic    #284 <Method float Math.min(float, float)>
	//  101  189:fstore_1        
			else
	//* 102  190:goto            196
				f = f3;
	//  103  193:fload           4
	//  104  195:fstore_1        
		}
		boolean flag1 = flag;
	//  105  196:iload           5
	//  106  198:istore          6
		if(f > 0.0F)
	//* 107  200:fload_1         
	//* 108  201:fconst_0        
	//* 109  202:fcmpl           
	//* 110  203:ifle            253
		{
			if(currentTextSize == f1 && !boundsChanged && !flag)
	//* 111  206:aload_0         
	//* 112  207:getfield        #286 <Field float currentTextSize>
	//* 113  210:fload_2         
	//* 114  211:fcmpl           
	//* 115  212:ifne            236
	//* 116  215:aload_0         
	//* 117  216:getfield        #288 <Field boolean boundsChanged>
	//* 118  219:ifne            236
	//* 119  222:iload           5
	//* 120  224:ifeq            230
	//* 121  227:goto            236
				flag = false;
	//  122  230:iconst_0        
	//  123  231:istore          5
			else
	//* 124  233:goto            239
				flag = true;
	//  125  236:iconst_1        
	//  126  237:istore          5
			currentTextSize = f1;
	//  127  239:aload_0         
	//  128  240:fload_2         
	//  129  241:putfield        #286 <Field float currentTextSize>
			boundsChanged = false;
	//  130  244:aload_0         
	//  131  245:iconst_0        
	//  132  246:putfield        #288 <Field boolean boundsChanged>
			flag1 = flag;
	//  133  249:iload           5
	//  134  251:istore          6
		}
		if(textToDraw == null || flag1)
	//* 135  253:aload_0         
	//* 136  254:getfield        #290 <Field CharSequence textToDraw>
	//* 137  257:ifnull          265
	//* 138  260:iload           6
	//* 139  262:ifeq            363
		{
			textPaint.setTextSize(currentTextSize);
	//  140  265:aload_0         
	//  141  266:getfield        #115 <Field TextPaint textPaint>
	//  142  269:aload_0         
	//  143  270:getfield        #286 <Field float currentTextSize>
	//  144  273:invokevirtual   #293 <Method void TextPaint.setTextSize(float)>
			textPaint.setTypeface(currentTypeface);
	//  145  276:aload_0         
	//  146  277:getfield        #115 <Field TextPaint textPaint>
	//  147  280:aload_0         
	//  148  281:getfield        #274 <Field Typeface currentTypeface>
	//  149  284:invokevirtual   #297 <Method Typeface TextPaint.setTypeface(Typeface)>
	//  150  287:pop             
			Object obj = ((Object) (textPaint));
	//  151  288:aload_0         
	//  152  289:getfield        #115 <Field TextPaint textPaint>
	//  153  292:astore          9
			if(scale == 1.0F)
	//* 154  294:aload_0         
	//* 155  295:getfield        #272 <Field float scale>
	//* 156  298:fconst_1        
	//* 157  299:fcmpl           
	//* 158  300:ifeq            306
	//* 159  303:goto            309
				flag2 = false;
	//  160  306:iconst_0        
	//  161  307:istore          7
			((TextPaint) (obj)).setLinearText(flag2);
	//  162  309:aload           9
	//  163  311:iload           7
	//  164  313:invokevirtual   #300 <Method void TextPaint.setLinearText(boolean)>
			obj = ((Object) (TextUtils.ellipsize(text, textPaint, f, android.text.TextUtils.TruncateAt.END)));
	//  165  316:aload_0         
	//  166  317:getfield        #263 <Field CharSequence text>
	//  167  320:aload_0         
	//  168  321:getfield        #115 <Field TextPaint textPaint>
	//  169  324:fload_1         
	//  170  325:getstatic       #306 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//  171  328:invokestatic    #312 <Method CharSequence TextUtils.ellipsize(CharSequence, TextPaint, float, android.text.TextUtils$TruncateAt)>
	//  172  331:astore          9
			if(!TextUtils.equals(((CharSequence) (obj)), textToDraw))
	//* 173  333:aload           9
	//* 174  335:aload_0         
	//* 175  336:getfield        #290 <Field CharSequence textToDraw>
	//* 176  339:invokestatic    #316 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//* 177  342:ifne            363
			{
				textToDraw = ((CharSequence) (obj));
	//  178  345:aload_0         
	//  179  346:aload           9
	//  180  348:putfield        #290 <Field CharSequence textToDraw>
				isRtl = calculateIsRtl(textToDraw);
	//  181  351:aload_0         
	//  182  352:aload_0         
	//  183  353:aload_0         
	//  184  354:getfield        #290 <Field CharSequence textToDraw>
	//  185  357:invokespecial   #318 <Method boolean calculateIsRtl(CharSequence)>
	//  186  360:putfield        #320 <Field boolean isRtl>
			}
		}
	//  187  363:return          
	}

	private void clearTexture()
	{
		Bitmap bitmap = expandedTitleTexture;
	//    0    0:aload_0         
	//    1    1:getfield        #323 <Field Bitmap expandedTitleTexture>
	//    2    4:astore_1        
		if(bitmap != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			bitmap.recycle();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #328 <Method void Bitmap.recycle()>
			expandedTitleTexture = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #323 <Field Bitmap expandedTitleTexture>
		}
	//   10   18:return          
	}

	private void ensureExpandedTexture()
	{
		if(expandedTitleTexture == null && !expandedBounds.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #323 <Field Bitmap expandedTitleTexture>
	//*   2    4:ifnonnull       186
	//*   3    7:aload_0         
	//*   4    8:getfield        #127 <Field Rect expandedBounds>
	//*   5   11:invokevirtual   #333 <Method boolean Rect.isEmpty()>
	//*   6   14:ifne            186
		{
			if(TextUtils.isEmpty(textToDraw))
	//*   7   17:aload_0         
	//*   8   18:getfield        #290 <Field CharSequence textToDraw>
	//*   9   21:invokestatic    #335 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  10   24:ifeq            28
				return;
	//   11   27:return          
			calculateOffsets(0.0F);
	//   12   28:aload_0         
	//   13   29:fconst_0        
	//   14   30:invokespecial   #170 <Method void calculateOffsets(float)>
			textureAscent = textPaint.ascent();
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #115 <Field TextPaint textPaint>
	//   18   38:invokevirtual   #339 <Method float TextPaint.ascent()>
	//   19   41:putfield        #341 <Field float textureAscent>
			textureDescent = textPaint.descent();
	//   20   44:aload_0         
	//   21   45:aload_0         
	//   22   46:getfield        #115 <Field TextPaint textPaint>
	//   23   49:invokevirtual   #344 <Method float TextPaint.descent()>
	//   24   52:putfield        #346 <Field float textureDescent>
			TextPaint textpaint = textPaint;
	//   25   55:aload_0         
	//   26   56:getfield        #115 <Field TextPaint textPaint>
	//   27   59:astore_3        
			CharSequence charsequence = textToDraw;
	//   28   60:aload_0         
	//   29   61:getfield        #290 <Field CharSequence textToDraw>
	//   30   64:astore          4
			int i = Math.round(textpaint.measureText(charsequence, 0, charsequence.length()));
	//   31   66:aload_3         
	//   32   67:aload           4
	//   33   69:iconst_0        
	//   34   70:aload           4
	//   35   72:invokeinterface #193 <Method int CharSequence.length()>
	//   36   77:invokevirtual   #350 <Method float TextPaint.measureText(CharSequence, int, int)>
	//   37   80:invokestatic    #354 <Method int Math.round(float)>
	//   38   83:istore_1        
			int j = Math.round(textureDescent - textureAscent);
	//   39   84:aload_0         
	//   40   85:getfield        #346 <Field float textureDescent>
	//   41   88:aload_0         
	//   42   89:getfield        #341 <Field float textureAscent>
	//   43   92:fsub            
	//   44   93:invokestatic    #354 <Method int Math.round(float)>
	//   45   96:istore_2        
			if(i > 0)
	//*  46   97:iload_1         
	//*  47   98:ifle            185
			{
				if(j <= 0)
	//*  48  101:iload_2         
	//*  49  102:ifgt            106
					return;
	//   50  105:return          
				expandedTitleTexture = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
	//   51  106:aload_0         
	//   52  107:iload_1         
	//   53  108:iload_2         
	//   54  109:getstatic       #360 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   55  112:invokestatic    #364 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   56  115:putfield        #323 <Field Bitmap expandedTitleTexture>
				Canvas canvas = new Canvas(expandedTitleTexture);
	//   57  118:new             #366 <Class Canvas>
	//   58  121:dup             
	//   59  122:aload_0         
	//   60  123:getfield        #323 <Field Bitmap expandedTitleTexture>
	//   61  126:invokespecial   #369 <Method void Canvas(Bitmap)>
	//   62  129:astore_3        
				CharSequence charsequence1 = textToDraw;
	//   63  130:aload_0         
	//   64  131:getfield        #290 <Field CharSequence textToDraw>
	//   65  134:astore          4
				canvas.drawText(charsequence1, 0, charsequence1.length(), 0.0F, (float)j - textPaint.descent(), ((Paint) (textPaint)));
	//   66  136:aload_3         
	//   67  137:aload           4
	//   68  139:iconst_0        
	//   69  140:aload           4
	//   70  142:invokeinterface #193 <Method int CharSequence.length()>
	//   71  147:fconst_0        
	//   72  148:iload_2         
	//   73  149:i2f             
	//   74  150:aload_0         
	//   75  151:getfield        #115 <Field TextPaint textPaint>
	//   76  154:invokevirtual   #344 <Method float TextPaint.descent()>
	//   77  157:fsub            
	//   78  158:aload_0         
	//   79  159:getfield        #115 <Field TextPaint textPaint>
	//   80  162:invokevirtual   #373 <Method void Canvas.drawText(CharSequence, int, int, float, float, Paint)>
				if(texturePaint == null)
	//*  81  165:aload_0         
	//*  82  166:getfield        #375 <Field Paint texturePaint>
	//*  83  169:ifnonnull       184
					texturePaint = new Paint(3);
	//   84  172:aload_0         
	//   85  173:new             #84  <Class Paint>
	//   86  176:dup             
	//   87  177:iconst_3        
	//   88  178:invokespecial   #376 <Method void Paint(int)>
	//   89  181:putfield        #375 <Field Paint texturePaint>
				return;
	//   90  184:return          
			} else
			{
				return;
	//   91  185:return          
			}
		} else
		{
			return;
	//   92  186:return          
		}
	}

	private int getCurrentExpandedTextColor()
	{
		int ai[] = state;
	//    0    0:aload_0         
	//    1    1:getfield        #379 <Field int[] state>
	//    2    4:astore_1        
		if(ai != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          19
			return expandedTextColor.getColorForState(ai, 0);
	//    5    9:aload_0         
	//    6   10:getfield        #228 <Field ColorStateList expandedTextColor>
	//    7   13:aload_1         
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #385 <Method int ColorStateList.getColorForState(int[], int)>
	//   10   18:ireturn         
		else
			return expandedTextColor.getDefaultColor();
	//   11   19:aload_0         
	//   12   20:getfield        #228 <Field ColorStateList expandedTextColor>
	//   13   23:invokevirtual   #388 <Method int ColorStateList.getDefaultColor()>
	//   14   26:ireturn         
	}

	private void getTextPaintCollapsed(TextPaint textpaint)
	{
		textpaint.setTextSize(collapsedTextSize);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #107 <Field float collapsedTextSize>
	//    3    5:invokevirtual   #293 <Method void TextPaint.setTextSize(float)>
		textpaint.setTypeface(collapsedTypeface);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #276 <Field Typeface collapsedTypeface>
	//    7   13:invokevirtual   #297 <Method Typeface TextPaint.setTypeface(Typeface)>
	//    8   16:pop             
	//    9   17:return          
	}

	private void interpolateBounds(float f)
	{
		currentBounds.left = lerp(expandedBounds.left, collapsedBounds.left, f, positionInterpolator);
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field RectF currentBounds>
	//    2    4:aload_0         
	//    3    5:getfield        #127 <Field Rect expandedBounds>
	//    4    8:getfield        #394 <Field int Rect.left>
	//    5   11:i2f             
	//    6   12:aload_0         
	//    7   13:getfield        #125 <Field Rect collapsedBounds>
	//    8   16:getfield        #394 <Field int Rect.left>
	//    9   19:i2f             
	//   10   20:fload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #207 <Field TimeInterpolator positionInterpolator>
	//   13   25:invokestatic    #211 <Method float lerp(float, float, float, TimeInterpolator)>
	//   14   28:putfield        #396 <Field float RectF.left>
		currentBounds.top = lerp(expandedDrawY, collapsedDrawY, f, positionInterpolator);
	//   15   31:aload_0         
	//   16   32:getfield        #132 <Field RectF currentBounds>
	//   17   35:aload_0         
	//   18   36:getfield        #215 <Field float expandedDrawY>
	//   19   39:aload_0         
	//   20   40:getfield        #217 <Field float collapsedDrawY>
	//   21   43:fload_1         
	//   22   44:aload_0         
	//   23   45:getfield        #207 <Field TimeInterpolator positionInterpolator>
	//   24   48:invokestatic    #211 <Method float lerp(float, float, float, TimeInterpolator)>
	//   25   51:putfield        #399 <Field float RectF.top>
		currentBounds.right = lerp(expandedBounds.right, collapsedBounds.right, f, positionInterpolator);
	//   26   54:aload_0         
	//   27   55:getfield        #132 <Field RectF currentBounds>
	//   28   58:aload_0         
	//   29   59:getfield        #127 <Field Rect expandedBounds>
	//   30   62:getfield        #402 <Field int Rect.right>
	//   31   65:i2f             
	//   32   66:aload_0         
	//   33   67:getfield        #125 <Field Rect collapsedBounds>
	//   34   70:getfield        #402 <Field int Rect.right>
	//   35   73:i2f             
	//   36   74:fload_1         
	//   37   75:aload_0         
	//   38   76:getfield        #207 <Field TimeInterpolator positionInterpolator>
	//   39   79:invokestatic    #211 <Method float lerp(float, float, float, TimeInterpolator)>
	//   40   82:putfield        #404 <Field float RectF.right>
		currentBounds.bottom = lerp(expandedBounds.bottom, collapsedBounds.bottom, f, positionInterpolator);
	//   41   85:aload_0         
	//   42   86:getfield        #132 <Field RectF currentBounds>
	//   43   89:aload_0         
	//   44   90:getfield        #127 <Field Rect expandedBounds>
	//   45   93:getfield        #407 <Field int Rect.bottom>
	//   46   96:i2f             
	//   47   97:aload_0         
	//   48   98:getfield        #125 <Field Rect collapsedBounds>
	//   49  101:getfield        #407 <Field int Rect.bottom>
	//   50  104:i2f             
	//   51  105:fload_1         
	//   52  106:aload_0         
	//   53  107:getfield        #207 <Field TimeInterpolator positionInterpolator>
	//   54  110:invokestatic    #211 <Method float lerp(float, float, float, TimeInterpolator)>
	//   55  113:putfield        #409 <Field float RectF.bottom>
	//   56  116:return          
	}

	private static boolean isClose(float f, float f1)
	{
		return Math.abs(f - f1) < 0.001F;
	//    0    0:fload_0         
	//    1    1:fload_1         
	//    2    2:fsub            
	//    3    3:invokestatic    #413 <Method float Math.abs(float)>
	//    4    6:ldc2            #414 <Float 0.001F>
	//    5    9:fcmpg           
	//    6   10:ifge            15
	//    7   13:iconst_1        
	//    8   14:ireturn         
	//    9   15:iconst_0        
	//   10   16:ireturn         
	}

	private static float lerp(float f, float f1, float f2, TimeInterpolator timeinterpolator)
	{
		float f3 = f2;
	//    0    0:fload_2         
	//    1    1:fstore          4
		if(timeinterpolator != null)
	//*   2    3:aload_3         
	//*   3    4:ifnull          16
			f3 = timeinterpolator.getInterpolation(f2);
	//    4    7:aload_3         
	//    5    8:fload_2         
	//    6    9:invokeinterface #419 <Method float TimeInterpolator.getInterpolation(float)>
	//    7   14:fstore          4
		return AnimationUtils.lerp(f, f1, f3);
	//    8   16:fload_0         
	//    9   17:fload_1         
	//   10   18:fload           4
	//   11   20:invokestatic    #424 <Method float AnimationUtils.lerp(float, float, float)>
	//   12   23:freturn         
	}

	private Typeface readFontFamilyTypeface(int i)
	{
		TypedArray typedarray = view.getContext().obtainStyledAttributes(i, new int[] {
			0x10103ac
		});
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field View view>
	//    2    4:invokevirtual   #432 <Method Context View.getContext()>
	//    3    7:iload_1         
	//    4    8:iconst_1        
	//    5    9:newarray        int[]
	//    6   11:dup             
	//    7   12:iconst_0        
	//    8   13:ldc2            #433 <Int 0x10103ac>
	//    9   16:iastore         
	//   10   17:invokevirtual   #439 <Method TypedArray Context.obtainStyledAttributes(int, int[])>
	//   11   20:astore_2        
		Object obj = ((Object) (typedarray.getString(0)));
	//   12   21:aload_2         
	//   13   22:iconst_0        
	//   14   23:invokevirtual   #445 <Method String TypedArray.getString(int)>
	//   15   26:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_43;
	//   16   27:aload_3         
	//   17   28:ifnull          43
		obj = ((Object) (Typeface.create(((String) (obj)), 0)));
	//   18   31:aload_3         
	//   19   32:iconst_0        
	//   20   33:invokestatic    #451 <Method Typeface Typeface.create(String, int)>
	//   21   36:astore_3        
		typedarray.recycle();
	//   22   37:aload_2         
	//   23   38:invokevirtual   #452 <Method void TypedArray.recycle()>
		return ((Typeface) (obj));
	//   24   41:aload_3         
	//   25   42:areturn         
		typedarray.recycle();
	//   26   43:aload_2         
	//   27   44:invokevirtual   #452 <Method void TypedArray.recycle()>
		return null;
	//   28   47:aconst_null     
	//   29   48:areturn         
		Exception exception;
		exception;
	//   30   49:astore_3        
		typedarray.recycle();
	//   31   50:aload_2         
	//   32   51:invokevirtual   #452 <Method void TypedArray.recycle()>
		throw exception;
	//   33   54:aload_3         
	//   34   55:athrow          
	}

	private static boolean rectEquals(Rect rect, int i, int j, int k, int l)
	{
		return rect.left == i && rect.top == j && rect.right == k && rect.bottom == l;
	//    0    0:aload_0         
	//    1    1:getfield        #394 <Field int Rect.left>
	//    2    4:iload_1         
	//    3    5:icmpne          35
	//    4    8:aload_0         
	//    5    9:getfield        #456 <Field int Rect.top>
	//    6   12:iload_2         
	//    7   13:icmpne          35
	//    8   16:aload_0         
	//    9   17:getfield        #402 <Field int Rect.right>
	//   10   20:iload_3         
	//   11   21:icmpne          35
	//   12   24:aload_0         
	//   13   25:getfield        #407 <Field int Rect.bottom>
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
	//    2    2:invokespecial   #458 <Method void calculateUsingTextSize(float)>
		boolean flag;
		if(USE_SCALING_TEXTURE && scale != 1.0F)
	//*   3    5:getstatic       #80  <Field boolean USE_SCALING_TEXTURE>
	//*   4    8:ifeq            25
	//*   5   11:aload_0         
	//*   6   12:getfield        #272 <Field float scale>
	//*   7   15:fconst_1        
	//*   8   16:fcmpl           
	//*   9   17:ifeq            25
			flag = true;
	//   10   20:iconst_1        
	//   11   21:istore_2        
		else
	//*  12   22:goto            27
			flag = false;
	//   13   25:iconst_0        
	//   14   26:istore_2        
		useTexture = flag;
	//   15   27:aload_0         
	//   16   28:iload_2         
	//   17   29:putfield        #460 <Field boolean useTexture>
		if(useTexture)
	//*  18   32:aload_0         
	//*  19   33:getfield        #460 <Field boolean useTexture>
	//*  20   36:ifeq            43
			ensureExpandedTexture();
	//   21   39:aload_0         
	//   22   40:invokespecial   #462 <Method void ensureExpandedTexture()>
		ViewCompat.postInvalidateOnAnimation(view);
	//   23   43:aload_0         
	//   24   44:getfield        #109 <Field View view>
	//   25   47:invokestatic    #260 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//   26   50:return          
	}

	public float calculateCollapsedTextWidth()
	{
		if(text == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #263 <Field CharSequence text>
	//*   2    4:ifnonnull       9
		{
			return 0.0F;
	//    3    7:fconst_0        
	//    4    8:freturn         
		} else
		{
			getTextPaintCollapsed(tmpPaint);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #120 <Field TextPaint tmpPaint>
	//    8   14:invokespecial   #465 <Method void getTextPaintCollapsed(TextPaint)>
			TextPaint textpaint = tmpPaint;
	//    9   17:aload_0         
	//   10   18:getfield        #120 <Field TextPaint tmpPaint>
	//   11   21:astore_1        
			CharSequence charsequence = text;
	//   12   22:aload_0         
	//   13   23:getfield        #263 <Field CharSequence text>
	//   14   26:astore_2        
			return textpaint.measureText(charsequence, 0, charsequence.length());
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:iconst_0        
	//   18   30:aload_2         
	//   19   31:invokeinterface #193 <Method int CharSequence.length()>
	//   20   36:invokevirtual   #350 <Method float TextPaint.measureText(CharSequence, int, int)>
	//   21   39:freturn         
		}
	}

	public void draw(Canvas canvas)
	{
		int i = canvas.save();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #470 <Method int Canvas.save()>
	//    2    4:istore          7
		if(textToDraw != null && drawTitle)
	//*   3    6:aload_0         
	//*   4    7:getfield        #290 <Field CharSequence textToDraw>
	//*   5   10:ifnull          189
	//*   6   13:aload_0         
	//*   7   14:getfield        #472 <Field boolean drawTitle>
	//*   8   17:ifeq            189
		{
			float f2 = currentDrawX;
	//    9   20:aload_0         
	//   10   21:getfield        #213 <Field float currentDrawX>
	//   11   24:fstore          4
			float f1 = currentDrawY;
	//   12   26:aload_0         
	//   13   27:getfield        #219 <Field float currentDrawY>
	//   14   30:fstore_3        
			boolean flag;
			if(useTexture && expandedTitleTexture != null)
	//*  15   31:aload_0         
	//*  16   32:getfield        #460 <Field boolean useTexture>
	//*  17   35:ifeq            51
	//*  18   38:aload_0         
	//*  19   39:getfield        #323 <Field Bitmap expandedTitleTexture>
	//*  20   42:ifnull          51
				flag = true;
	//   21   45:iconst_1        
	//   22   46:istore          6
			else
	//*  23   48:goto            54
				flag = false;
	//   24   51:iconst_0        
	//   25   52:istore          6
			float f;
			if(flag)
	//*  26   54:iload           6
	//*  27   56:ifeq            78
			{
				f = textureAscent * scale;
	//   28   59:aload_0         
	//   29   60:getfield        #341 <Field float textureAscent>
	//   30   63:aload_0         
	//   31   64:getfield        #272 <Field float scale>
	//   32   67:fmul            
	//   33   68:fstore_2        
				float f3 = textureDescent;
	//   34   69:aload_0         
	//   35   70:getfield        #346 <Field float textureDescent>
	//   36   73:fstore          5
			} else
	//*  37   75:goto            105
			{
				f = textPaint.ascent() * scale;
	//   38   78:aload_0         
	//   39   79:getfield        #115 <Field TextPaint textPaint>
	//   40   82:invokevirtual   #339 <Method float TextPaint.ascent()>
	//   41   85:aload_0         
	//   42   86:getfield        #272 <Field float scale>
	//   43   89:fmul            
	//   44   90:fstore_2        
				textPaint.descent();
	//   45   91:aload_0         
	//   46   92:getfield        #115 <Field TextPaint textPaint>
	//   47   95:invokevirtual   #344 <Method float TextPaint.descent()>
	//   48   98:pop             
				float f4 = scale;
	//   49   99:aload_0         
	//   50  100:getfield        #272 <Field float scale>
	//   51  103:fstore          5
			}
			if(flag)
	//*  52  105:iload           6
	//*  53  107:ifeq            117
				f = f1 + f;
	//   54  110:fload_3         
	//   55  111:fload_2         
	//   56  112:fadd            
	//   57  113:fstore_2        
			else
	//*  58  114:goto            119
				f = f1;
	//   59  117:fload_3         
	//   60  118:fstore_2        
			f1 = scale;
	//   61  119:aload_0         
	//   62  120:getfield        #272 <Field float scale>
	//   63  123:fstore_3        
			if(f1 != 1.0F)
	//*  64  124:fload_3         
	//*  65  125:fconst_1        
	//*  66  126:fcmpl           
	//*  67  127:ifeq            139
				canvas.scale(f1, f1, f2, f);
	//   68  130:aload_1         
	//   69  131:fload_3         
	//   70  132:fload_3         
	//   71  133:fload           4
	//   72  135:fload_2         
	//   73  136:invokevirtual   #475 <Method void Canvas.scale(float, float, float, float)>
			if(flag)
	//*  74  139:iload           6
	//*  75  141:ifeq            162
			{
				canvas.drawBitmap(expandedTitleTexture, f2, f, texturePaint);
	//   76  144:aload_1         
	//   77  145:aload_0         
	//   78  146:getfield        #323 <Field Bitmap expandedTitleTexture>
	//   79  149:fload           4
	//   80  151:fload_2         
	//   81  152:aload_0         
	//   82  153:getfield        #375 <Field Paint texturePaint>
	//   83  156:invokevirtual   #479 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
			} else
	//*  84  159:goto            189
			{
				CharSequence charsequence = textToDraw;
	//   85  162:aload_0         
	//   86  163:getfield        #290 <Field CharSequence textToDraw>
	//   87  166:astore          8
				canvas.drawText(charsequence, 0, charsequence.length(), f2, f, ((Paint) (textPaint)));
	//   88  168:aload_1         
	//   89  169:aload           8
	//   90  171:iconst_0        
	//   91  172:aload           8
	//   92  174:invokeinterface #193 <Method int CharSequence.length()>
	//   93  179:fload           4
	//   94  181:fload_2         
	//   95  182:aload_0         
	//   96  183:getfield        #115 <Field TextPaint textPaint>
	//   97  186:invokevirtual   #373 <Method void Canvas.drawText(CharSequence, int, int, float, float, Paint)>
			}
		}
		canvas.restoreToCount(i);
	//   98  189:aload_1         
	//   99  190:iload           7
	//  100  192:invokevirtual   #482 <Method void Canvas.restoreToCount(int)>
	//  101  195:return          
	}

	public void getCollapsedTextActualBounds(RectF rectf)
	{
		boolean flag = calculateIsRtl(text);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #263 <Field CharSequence text>
	//    3    5:invokespecial   #318 <Method boolean calculateIsRtl(CharSequence)>
	//    4    8:istore_3        
		float f;
		if(!flag)
	//*   5    9:iload_3         
	//*   6   10:ifne            25
			f = collapsedBounds.left;
	//    7   13:aload_0         
	//    8   14:getfield        #125 <Field Rect collapsedBounds>
	//    9   17:getfield        #394 <Field int Rect.left>
	//   10   20:i2f             
	//   11   21:fstore_2        
		else
	//*  12   22:goto            39
			f = (float)collapsedBounds.right - calculateCollapsedTextWidth();
	//   13   25:aload_0         
	//   14   26:getfield        #125 <Field Rect collapsedBounds>
	//   15   29:getfield        #402 <Field int Rect.right>
	//   16   32:i2f             
	//   17   33:aload_0         
	//   18   34:invokevirtual   #486 <Method float calculateCollapsedTextWidth()>
	//   19   37:fsub            
	//   20   38:fstore_2        
		rectf.left = f;
	//   21   39:aload_1         
	//   22   40:fload_2         
	//   23   41:putfield        #396 <Field float RectF.left>
		rectf.top = collapsedBounds.top;
	//   24   44:aload_1         
	//   25   45:aload_0         
	//   26   46:getfield        #125 <Field Rect collapsedBounds>
	//   27   49:getfield        #456 <Field int Rect.top>
	//   28   52:i2f             
	//   29   53:putfield        #399 <Field float RectF.top>
		if(!flag)
	//*  30   56:iload_3         
	//*  31   57:ifne            73
			f = rectf.left + calculateCollapsedTextWidth();
	//   32   60:aload_1         
	//   33   61:getfield        #396 <Field float RectF.left>
	//   34   64:aload_0         
	//   35   65:invokevirtual   #486 <Method float calculateCollapsedTextWidth()>
	//   36   68:fadd            
	//   37   69:fstore_2        
		else
	//*  38   70:goto            82
			f = collapsedBounds.right;
	//   39   73:aload_0         
	//   40   74:getfield        #125 <Field Rect collapsedBounds>
	//   41   77:getfield        #402 <Field int Rect.right>
	//   42   80:i2f             
	//   43   81:fstore_2        
		rectf.right = f;
	//   44   82:aload_1         
	//   45   83:fload_2         
	//   46   84:putfield        #404 <Field float RectF.right>
		rectf.bottom = (float)collapsedBounds.top + getCollapsedTextHeight();
	//   47   87:aload_1         
	//   48   88:aload_0         
	//   49   89:getfield        #125 <Field Rect collapsedBounds>
	//   50   92:getfield        #456 <Field int Rect.top>
	//   51   95:i2f             
	//   52   96:aload_0         
	//   53   97:invokevirtual   #489 <Method float getCollapsedTextHeight()>
	//   54  100:fadd            
	//   55  101:putfield        #409 <Field float RectF.bottom>
	//   56  104:return          
	}

	public ColorStateList getCollapsedTextColor()
	{
		return collapsedTextColor;
	//    0    0:aload_0         
	//    1    1:getfield        #226 <Field ColorStateList collapsedTextColor>
	//    2    4:areturn         
	}

	public int getCollapsedTextGravity()
	{
		return collapsedTextGravity;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field int collapsedTextGravity>
	//    2    4:ireturn         
	}

	public float getCollapsedTextHeight()
	{
		getTextPaintCollapsed(tmpPaint);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #120 <Field TextPaint tmpPaint>
	//    3    5:invokespecial   #465 <Method void getTextPaintCollapsed(TextPaint)>
		return -tmpPaint.ascent();
	//    4    8:aload_0         
	//    5    9:getfield        #120 <Field TextPaint tmpPaint>
	//    6   12:invokevirtual   #339 <Method float TextPaint.ascent()>
	//    7   15:fneg            
	//    8   16:freturn         
	}

	public float getCollapsedTextSize()
	{
		return collapsedTextSize;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field float collapsedTextSize>
	//    2    4:freturn         
	}

	public Typeface getCollapsedTypeface()
	{
		Typeface typeface = collapsedTypeface;
	//    0    0:aload_0         
	//    1    1:getfield        #276 <Field Typeface collapsedTypeface>
	//    2    4:astore_1        
		if(typeface != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return typeface;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			return Typeface.DEFAULT;
	//    7   11:getstatic       #498 <Field Typeface Typeface.DEFAULT>
	//    8   14:areturn         
	}

	public int getCurrentCollapsedTextColor()
	{
		int ai[] = state;
	//    0    0:aload_0         
	//    1    1:getfield        #379 <Field int[] state>
	//    2    4:astore_1        
		if(ai != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          19
			return collapsedTextColor.getColorForState(ai, 0);
	//    5    9:aload_0         
	//    6   10:getfield        #226 <Field ColorStateList collapsedTextColor>
	//    7   13:aload_1         
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #385 <Method int ColorStateList.getColorForState(int[], int)>
	//   10   18:ireturn         
		else
			return collapsedTextColor.getDefaultColor();
	//   11   19:aload_0         
	//   12   20:getfield        #226 <Field ColorStateList collapsedTextColor>
	//   13   23:invokevirtual   #388 <Method int ColorStateList.getDefaultColor()>
	//   14   26:ireturn         
	}

	public ColorStateList getExpandedTextColor()
	{
		return expandedTextColor;
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field ColorStateList expandedTextColor>
	//    2    4:areturn         
	}

	public int getExpandedTextGravity()
	{
		return expandedTextGravity;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field int expandedTextGravity>
	//    2    4:ireturn         
	}

	public float getExpandedTextSize()
	{
		return expandedTextSize;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field float expandedTextSize>
	//    2    4:freturn         
	}

	public Typeface getExpandedTypeface()
	{
		Typeface typeface = expandedTypeface;
	//    0    0:aload_0         
	//    1    1:getfield        #278 <Field Typeface expandedTypeface>
	//    2    4:astore_1        
		if(typeface != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return typeface;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			return Typeface.DEFAULT;
	//    7   11:getstatic       #498 <Field Typeface Typeface.DEFAULT>
	//    8   14:areturn         
	}

	public float getExpansionFraction()
	{
		return expandedFraction;
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field float expandedFraction>
	//    2    4:freturn         
	}

	public CharSequence getText()
	{
		return text;
	//    0    0:aload_0         
	//    1    1:getfield        #263 <Field CharSequence text>
	//    2    4:areturn         
	}

	public final boolean isStateful()
	{
label0:
		{
			ColorStateList colorstatelist = collapsedTextColor;
	//    0    0:aload_0         
	//    1    1:getfield        #226 <Field ColorStateList collapsedTextColor>
	//    2    4:astore_1        
			if(colorstatelist == null || !colorstatelist.isStateful())
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #509 <Method boolean ColorStateList.isStateful()>
	//*   7   13:ifne            32
			{
				ColorStateList colorstatelist1 = expandedTextColor;
	//    8   16:aload_0         
	//    9   17:getfield        #228 <Field ColorStateList expandedTextColor>
	//   10   20:astore_1        
				if(colorstatelist1 == null || !colorstatelist1.isStateful())
					break label0;
	//   11   21:aload_1         
	//   12   22:ifnull          34
	//   13   25:aload_1         
	//   14   26:invokevirtual   #509 <Method boolean ColorStateList.isStateful()>
	//   15   29:ifeq            34
			}
			return true;
	//   16   32:iconst_1        
	//   17   33:ireturn         
		}
		return false;
	//   18   34:iconst_0        
	//   19   35:ireturn         
	}

	void onBoundsChanged()
	{
		boolean flag;
		if(collapsedBounds.width() > 0 && collapsedBounds.height() > 0 && expandedBounds.width() > 0 && expandedBounds.height() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field Rect collapsedBounds>
	//*   2    4:invokevirtual   #266 <Method int Rect.width()>
	//*   3    7:ifle            45
	//*   4   10:aload_0         
	//*   5   11:getfield        #125 <Field Rect collapsedBounds>
	//*   6   14:invokevirtual   #513 <Method int Rect.height()>
	//*   7   17:ifle            45
	//*   8   20:aload_0         
	//*   9   21:getfield        #127 <Field Rect expandedBounds>
	//*  10   24:invokevirtual   #266 <Method int Rect.width()>
	//*  11   27:ifle            45
	//*  12   30:aload_0         
	//*  13   31:getfield        #127 <Field Rect expandedBounds>
	//*  14   34:invokevirtual   #513 <Method int Rect.height()>
	//*  15   37:ifle            45
			flag = true;
	//   16   40:iconst_1        
	//   17   41:istore_1        
		else
	//*  18   42:goto            47
			flag = false;
	//   19   45:iconst_0        
	//   20   46:istore_1        
		drawTitle = flag;
	//   21   47:aload_0         
	//   22   48:iload_1         
	//   23   49:putfield        #472 <Field boolean drawTitle>
	//   24   52:return          
	}

	public void recalculate()
	{
		if(view.getHeight() > 0 && view.getWidth() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #109 <Field View view>
	//*   2    4:invokevirtual   #517 <Method int View.getHeight()>
	//*   3    7:ifle            28
	//*   4   10:aload_0         
	//*   5   11:getfield        #109 <Field View view>
	//*   6   14:invokevirtual   #520 <Method int View.getWidth()>
	//*   7   17:ifle            28
		{
			calculateBaseOffsets();
	//    8   20:aload_0         
	//    9   21:invokespecial   #522 <Method void calculateBaseOffsets()>
			calculateCurrentOffsets();
	//   10   24:aload_0         
	//   11   25:invokespecial   #524 <Method void calculateCurrentOffsets()>
		}
	//   12   28:return          
	}

	public void setCollapsedBounds(int i, int j, int k, int l)
	{
		if(!rectEquals(collapsedBounds, i, j, k, l))
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field Rect collapsedBounds>
	//*   2    4:iload_1         
	//*   3    5:iload_2         
	//*   4    6:iload_3         
	//*   5    7:iload           4
	//*   6    9:invokestatic    #528 <Method boolean rectEquals(Rect, int, int, int, int)>
	//*   7   12:ifne            36
		{
			collapsedBounds.set(i, j, k, l);
	//    8   15:aload_0         
	//    9   16:getfield        #125 <Field Rect collapsedBounds>
	//   10   19:iload_1         
	//   11   20:iload_2         
	//   12   21:iload_3         
	//   13   22:iload           4
	//   14   24:invokevirtual   #531 <Method void Rect.set(int, int, int, int)>
			boundsChanged = true;
	//   15   27:aload_0         
	//   16   28:iconst_1        
	//   17   29:putfield        #288 <Field boolean boundsChanged>
			onBoundsChanged();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #533 <Method void onBoundsChanged()>
		}
	//   20   36:return          
	}

	public void setCollapsedTextAppearance(int i)
	{
		TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(view.getContext(), i, android.support.v7.appcompat.R.styleable.TextAppearance);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field View view>
	//    2    4:invokevirtual   #432 <Method Context View.getContext()>
	//    3    7:iload_1         
	//    4    8:getstatic       #539 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//    5   11:invokestatic    #544 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, int, int[])>
	//    6   14:astore_2        
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor))
	//*   7   15:aload_2         
	//*   8   16:getstatic       #547 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//*   9   19:invokevirtual   #551 <Method boolean TintTypedArray.hasValue(int)>
	//*  10   22:ifeq            36
			collapsedTextColor = tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor);
	//   11   25:aload_0         
	//   12   26:aload_2         
	//   13   27:getstatic       #547 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//   14   30:invokevirtual   #555 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   15   33:putfield        #226 <Field ColorStateList collapsedTextColor>
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize))
	//*  16   36:aload_2         
	//*  17   37:getstatic       #558 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//*  18   40:invokevirtual   #551 <Method boolean TintTypedArray.hasValue(int)>
	//*  19   43:ifeq            63
			collapsedTextSize = tinttypedarray.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize, (int)collapsedTextSize);
	//   20   46:aload_0         
	//   21   47:aload_2         
	//   22   48:getstatic       #558 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//   23   51:aload_0         
	//   24   52:getfield        #107 <Field float collapsedTextSize>
	//   25   55:f2i             
	//   26   56:invokevirtual   #562 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//   27   59:i2f             
	//   28   60:putfield        #107 <Field float collapsedTextSize>
		collapsedShadowColor = tinttypedarray.getInt(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowColor, 0);
	//   29   63:aload_0         
	//   30   64:aload_2         
	//   31   65:getstatic       #565 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowColor>
	//   32   68:iconst_0        
	//   33   69:invokevirtual   #568 <Method int TintTypedArray.getInt(int, int)>
	//   34   72:putfield        #253 <Field int collapsedShadowColor>
		collapsedShadowDx = tinttypedarray.getFloat(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowDx, 0.0F);
	//   35   75:aload_0         
	//   36   76:aload_2         
	//   37   77:getstatic       #571 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowDx>
	//   38   80:fconst_0        
	//   39   81:invokevirtual   #575 <Method float TintTypedArray.getFloat(int, float)>
	//   40   84:putfield        #245 <Field float collapsedShadowDx>
		collapsedShadowDy = tinttypedarray.getFloat(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowDy, 0.0F);
	//   41   87:aload_0         
	//   42   88:aload_2         
	//   43   89:getstatic       #578 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowDy>
	//   44   92:fconst_0        
	//   45   93:invokevirtual   #575 <Method float TintTypedArray.getFloat(int, float)>
	//   46   96:putfield        #249 <Field float collapsedShadowDy>
		collapsedShadowRadius = tinttypedarray.getFloat(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowRadius, 0.0F);
	//   47   99:aload_0         
	//   48  100:aload_2         
	//   49  101:getstatic       #581 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowRadius>
	//   50  104:fconst_0        
	//   51  105:invokevirtual   #575 <Method float TintTypedArray.getFloat(int, float)>
	//   52  108:putfield        #241 <Field float collapsedShadowRadius>
		tinttypedarray.recycle();
	//   53  111:aload_2         
	//   54  112:invokevirtual   #582 <Method void TintTypedArray.recycle()>
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  55  115:getstatic       #78  <Field int android.os.Build$VERSION.SDK_INT>
	//*  56  118:bipush          16
	//*  57  120:icmplt          132
			collapsedTypeface = readFontFamilyTypeface(i);
	//   58  123:aload_0         
	//   59  124:aload_0         
	//   60  125:iload_1         
	//   61  126:invokespecial   #584 <Method Typeface readFontFamilyTypeface(int)>
	//   62  129:putfield        #276 <Field Typeface collapsedTypeface>
		recalculate();
	//   63  132:aload_0         
	//   64  133:invokevirtual   #586 <Method void recalculate()>
	//   65  136:return          
	}

	public void setCollapsedTextColor(ColorStateList colorstatelist)
	{
		if(collapsedTextColor != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #226 <Field ColorStateList collapsedTextColor>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			collapsedTextColor = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #226 <Field ColorStateList collapsedTextColor>
			recalculate();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #586 <Method void recalculate()>
		}
	//    9   17:return          
	}

	public void setCollapsedTextGravity(int i)
	{
		if(collapsedTextGravity != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field int collapsedTextGravity>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			collapsedTextGravity = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #102 <Field int collapsedTextGravity>
			recalculate();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #586 <Method void recalculate()>
		}
	//    9   17:return          
	}

	public void setCollapsedTextSize(float f)
	{
		if(collapsedTextSize != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field float collapsedTextSize>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			collapsedTextSize = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #107 <Field float collapsedTextSize>
			recalculate();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #586 <Method void recalculate()>
		}
	//   10   18:return          
	}

	public void setCollapsedTypeface(Typeface typeface)
	{
		if(collapsedTypeface != typeface)
	//*   0    0:aload_0         
	//*   1    1:getfield        #276 <Field Typeface collapsedTypeface>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			collapsedTypeface = typeface;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #276 <Field Typeface collapsedTypeface>
			recalculate();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #586 <Method void recalculate()>
		}
	//    9   17:return          
	}

	public void setExpandedBounds(int i, int j, int k, int l)
	{
		if(!rectEquals(expandedBounds, i, j, k, l))
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field Rect expandedBounds>
	//*   2    4:iload_1         
	//*   3    5:iload_2         
	//*   4    6:iload_3         
	//*   5    7:iload           4
	//*   6    9:invokestatic    #528 <Method boolean rectEquals(Rect, int, int, int, int)>
	//*   7   12:ifne            36
		{
			expandedBounds.set(i, j, k, l);
	//    8   15:aload_0         
	//    9   16:getfield        #127 <Field Rect expandedBounds>
	//   10   19:iload_1         
	//   11   20:iload_2         
	//   12   21:iload_3         
	//   13   22:iload           4
	//   14   24:invokevirtual   #531 <Method void Rect.set(int, int, int, int)>
			boundsChanged = true;
	//   15   27:aload_0         
	//   16   28:iconst_1        
	//   17   29:putfield        #288 <Field boolean boundsChanged>
			onBoundsChanged();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #533 <Method void onBoundsChanged()>
		}
	//   20   36:return          
	}

	public void setExpandedTextAppearance(int i)
	{
		TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(view.getContext(), i, android.support.v7.appcompat.R.styleable.TextAppearance);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field View view>
	//    2    4:invokevirtual   #432 <Method Context View.getContext()>
	//    3    7:iload_1         
	//    4    8:getstatic       #539 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//    5   11:invokestatic    #544 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, int, int[])>
	//    6   14:astore_2        
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor))
	//*   7   15:aload_2         
	//*   8   16:getstatic       #547 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//*   9   19:invokevirtual   #551 <Method boolean TintTypedArray.hasValue(int)>
	//*  10   22:ifeq            36
			expandedTextColor = tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor);
	//   11   25:aload_0         
	//   12   26:aload_2         
	//   13   27:getstatic       #547 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//   14   30:invokevirtual   #555 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   15   33:putfield        #228 <Field ColorStateList expandedTextColor>
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize))
	//*  16   36:aload_2         
	//*  17   37:getstatic       #558 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//*  18   40:invokevirtual   #551 <Method boolean TintTypedArray.hasValue(int)>
	//*  19   43:ifeq            63
			expandedTextSize = tinttypedarray.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize, (int)expandedTextSize);
	//   20   46:aload_0         
	//   21   47:aload_2         
	//   22   48:getstatic       #558 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//   23   51:aload_0         
	//   24   52:getfield        #105 <Field float expandedTextSize>
	//   25   55:f2i             
	//   26   56:invokevirtual   #562 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//   27   59:i2f             
	//   28   60:putfield        #105 <Field float expandedTextSize>
		expandedShadowColor = tinttypedarray.getInt(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowColor, 0);
	//   29   63:aload_0         
	//   30   64:aload_2         
	//   31   65:getstatic       #565 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowColor>
	//   32   68:iconst_0        
	//   33   69:invokevirtual   #568 <Method int TintTypedArray.getInt(int, int)>
	//   34   72:putfield        #251 <Field int expandedShadowColor>
		expandedShadowDx = tinttypedarray.getFloat(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowDx, 0.0F);
	//   35   75:aload_0         
	//   36   76:aload_2         
	//   37   77:getstatic       #571 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowDx>
	//   38   80:fconst_0        
	//   39   81:invokevirtual   #575 <Method float TintTypedArray.getFloat(int, float)>
	//   40   84:putfield        #243 <Field float expandedShadowDx>
		expandedShadowDy = tinttypedarray.getFloat(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowDy, 0.0F);
	//   41   87:aload_0         
	//   42   88:aload_2         
	//   43   89:getstatic       #578 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowDy>
	//   44   92:fconst_0        
	//   45   93:invokevirtual   #575 <Method float TintTypedArray.getFloat(int, float)>
	//   46   96:putfield        #247 <Field float expandedShadowDy>
		expandedShadowRadius = tinttypedarray.getFloat(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowRadius, 0.0F);
	//   47   99:aload_0         
	//   48  100:aload_2         
	//   49  101:getstatic       #581 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowRadius>
	//   50  104:fconst_0        
	//   51  105:invokevirtual   #575 <Method float TintTypedArray.getFloat(int, float)>
	//   52  108:putfield        #239 <Field float expandedShadowRadius>
		tinttypedarray.recycle();
	//   53  111:aload_2         
	//   54  112:invokevirtual   #582 <Method void TintTypedArray.recycle()>
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  55  115:getstatic       #78  <Field int android.os.Build$VERSION.SDK_INT>
	//*  56  118:bipush          16
	//*  57  120:icmplt          132
			expandedTypeface = readFontFamilyTypeface(i);
	//   58  123:aload_0         
	//   59  124:aload_0         
	//   60  125:iload_1         
	//   61  126:invokespecial   #584 <Method Typeface readFontFamilyTypeface(int)>
	//   62  129:putfield        #278 <Field Typeface expandedTypeface>
		recalculate();
	//   63  132:aload_0         
	//   64  133:invokevirtual   #586 <Method void recalculate()>
	//   65  136:return          
	}

	public void setExpandedTextColor(ColorStateList colorstatelist)
	{
		if(expandedTextColor != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #228 <Field ColorStateList expandedTextColor>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			expandedTextColor = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #228 <Field ColorStateList expandedTextColor>
			recalculate();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #586 <Method void recalculate()>
		}
	//    9   17:return          
	}

	public void setExpandedTextGravity(int i)
	{
		if(expandedTextGravity != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #100 <Field int expandedTextGravity>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			expandedTextGravity = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #100 <Field int expandedTextGravity>
			recalculate();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #586 <Method void recalculate()>
		}
	//    9   17:return          
	}

	public void setExpandedTextSize(float f)
	{
		if(expandedTextSize != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field float expandedTextSize>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			expandedTextSize = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #105 <Field float expandedTextSize>
			recalculate();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #586 <Method void recalculate()>
		}
	//   10   18:return          
	}

	public void setExpandedTypeface(Typeface typeface)
	{
		if(expandedTypeface != typeface)
	//*   0    0:aload_0         
	//*   1    1:getfield        #278 <Field Typeface expandedTypeface>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			expandedTypeface = typeface;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #278 <Field Typeface expandedTypeface>
			recalculate();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #586 <Method void recalculate()>
		}
	//    9   17:return          
	}

	public void setExpansionFraction(float f)
	{
		f = MathUtils.clamp(f, 0.0F, 1.0F);
	//    0    0:fload_1         
	//    1    1:fconst_0        
	//    2    2:fconst_1        
	//    3    3:invokestatic    #604 <Method float MathUtils.clamp(float, float, float)>
	//    4    6:fstore_1        
		if(f != expandedFraction)
	//*   5    7:fload_1         
	//*   6    8:aload_0         
	//*   7    9:getfield        #166 <Field float expandedFraction>
	//*   8   12:fcmpl           
	//*   9   13:ifeq            25
		{
			expandedFraction = f;
	//   10   16:aload_0         
	//   11   17:fload_1         
	//   12   18:putfield        #166 <Field float expandedFraction>
			calculateCurrentOffsets();
	//   13   21:aload_0         
	//   14   22:invokespecial   #524 <Method void calculateCurrentOffsets()>
		}
	//   15   25:return          
	}

	public void setPositionInterpolator(TimeInterpolator timeinterpolator)
	{
		positionInterpolator = timeinterpolator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #207 <Field TimeInterpolator positionInterpolator>
		recalculate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #586 <Method void recalculate()>
	//    5    9:return          
	}

	public final boolean setState(int ai[])
	{
		state = ai;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #379 <Field int[] state>
		if(isStateful())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #609 <Method boolean isStateful()>
	//*   5    9:ifeq            18
		{
			recalculate();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #586 <Method void recalculate()>
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

	public void setText(CharSequence charsequence)
	{
		if(charsequence == null || !((Object) (charsequence)).equals(((Object) (text))))
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
	//*   2    4:aload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #263 <Field CharSequence text>
	//*   5    9:invokevirtual   #614 <Method boolean Object.equals(Object)>
	//*   6   12:ifne            33
		{
			text = charsequence;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #263 <Field CharSequence text>
			textToDraw = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #290 <Field CharSequence textToDraw>
			clearTexture();
	//   13   25:aload_0         
	//   14   26:invokespecial   #616 <Method void clearTexture()>
			recalculate();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #586 <Method void recalculate()>
		}
	//   17   33:return          
	}

	public void setTextSizeInterpolator(TimeInterpolator timeinterpolator)
	{
		textSizeInterpolator = timeinterpolator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #221 <Field TimeInterpolator textSizeInterpolator>
		recalculate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #586 <Method void recalculate()>
	//    5    9:return          
	}

	public void setTypefaces(Typeface typeface)
	{
		expandedTypeface = typeface;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #278 <Field Typeface expandedTypeface>
		collapsedTypeface = typeface;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #276 <Field Typeface collapsedTypeface>
		recalculate();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #586 <Method void recalculate()>
	//    8   14:return          
	}

	private static final boolean DEBUG_DRAW = false;
	private static final Paint DEBUG_DRAW_PAINT;
	private static final boolean USE_SCALING_TEXTURE;
	private boolean boundsChanged;
	private final Rect collapsedBounds = new Rect();
	private float collapsedDrawX;
	private float collapsedDrawY;
	private int collapsedShadowColor;
	private float collapsedShadowDx;
	private float collapsedShadowDy;
	private float collapsedShadowRadius;
	private ColorStateList collapsedTextColor;
	private int collapsedTextGravity;
	private float collapsedTextSize;
	private Typeface collapsedTypeface;
	private final RectF currentBounds = new RectF();
	private float currentDrawX;
	private float currentDrawY;
	private float currentTextSize;
	private Typeface currentTypeface;
	private boolean drawTitle;
	private final Rect expandedBounds = new Rect();
	private float expandedDrawX;
	private float expandedDrawY;
	private float expandedFraction;
	private int expandedShadowColor;
	private float expandedShadowDx;
	private float expandedShadowDy;
	private float expandedShadowRadius;
	private ColorStateList expandedTextColor;
	private int expandedTextGravity;
	private float expandedTextSize;
	private Bitmap expandedTitleTexture;
	private Typeface expandedTypeface;
	private boolean isRtl;
	private TimeInterpolator positionInterpolator;
	private float scale;
	private int state[];
	private CharSequence text;
	private final TextPaint textPaint = new TextPaint(129);
	private TimeInterpolator textSizeInterpolator;
	private CharSequence textToDraw;
	private float textureAscent;
	private float textureDescent;
	private Paint texturePaint;
	private final TextPaint tmpPaint;
	private boolean useTexture;
	private final View view;

	static 
	{
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT < 18)
	//*   0    0:getstatic       #78  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmpge          13
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:goto            15
			flag = false;
	//    6   13:iconst_0        
	//    7   14:istore_0        
		USE_SCALING_TEXTURE = flag;
	//    8   15:iload_0         
	//    9   16:putstatic       #80  <Field boolean USE_SCALING_TEXTURE>
		DEBUG_DRAW_PAINT = null;
	//   10   19:aconst_null     
	//   11   20:putstatic       #82  <Field Paint DEBUG_DRAW_PAINT>
		Paint paint = DEBUG_DRAW_PAINT;
	//   12   23:getstatic       #82  <Field Paint DEBUG_DRAW_PAINT>
	//   13   26:astore_1        
		if(paint != null)
	//*  14   27:aload_1         
	//*  15   28:ifnull          44
		{
			paint.setAntiAlias(true);
	//   16   31:aload_1         
	//   17   32:iconst_1        
	//   18   33:invokevirtual   #88  <Method void Paint.setAntiAlias(boolean)>
			DEBUG_DRAW_PAINT.setColor(-65281);
	//   19   36:getstatic       #82  <Field Paint DEBUG_DRAW_PAINT>
	//   20   39:ldc1            #89  <Int -65281>
	//   21   41:invokevirtual   #93  <Method void Paint.setColor(int)>
		}
	//*  22   44:return          
	}
}
