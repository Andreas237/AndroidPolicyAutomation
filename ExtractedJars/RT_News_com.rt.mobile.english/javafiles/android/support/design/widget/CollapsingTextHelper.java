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
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #154 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #156 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #161 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	private void calculateCurrentOffsets()
	{
		calculateOffsets(mExpandedFraction);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #164 <Field float mExpandedFraction>
	//    3    5:invokespecial   #168 <Method void calculateOffsets(float)>
	//    4    8:return          
	}

	private boolean calculateIsRtl(CharSequence charsequence)
	{
		int i = ViewCompat.getLayoutDirection(mView);
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field View mView>
	//    2    4:invokestatic    #176 <Method int ViewCompat.getLayoutDirection(View)>
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
	//   14   24:getstatic       #182 <Field TextDirectionHeuristicCompat TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL>
	//   15   27:astore          4
		else
	//*  16   29:goto            37
			textdirectionheuristiccompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
	//   17   32:getstatic       #185 <Field TextDirectionHeuristicCompat TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR>
	//   18   35:astore          4
		return textdirectionheuristiccompat.isRtl(charsequence, 0, charsequence.length());
	//   19   37:aload           4
	//   20   39:aload_1         
	//   21   40:iconst_0        
	//   22   41:aload_1         
	//   23   42:invokeinterface #191 <Method int CharSequence.length()>
	//   24   47:invokeinterface #197 <Method boolean TextDirectionHeuristicCompat.isRtl(CharSequence, int, int)>
	//   25   52:ireturn         
	}

	private void calculateOffsets(float f)
	{
		interpolateBounds(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokespecial   #200 <Method void interpolateBounds(float)>
		mCurrentDrawX = lerp(mExpandedDrawX, mCollapsedDrawX, f, mPositionInterpolator);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #202 <Field float mExpandedDrawX>
	//    6   10:aload_0         
	//    7   11:getfield        #204 <Field float mCollapsedDrawX>
	//    8   14:fload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #206 <Field Interpolator mPositionInterpolator>
	//   11   19:invokestatic    #210 <Method float lerp(float, float, float, Interpolator)>
	//   12   22:putfield        #212 <Field float mCurrentDrawX>
		mCurrentDrawY = lerp(mExpandedDrawY, mCollapsedDrawY, f, mPositionInterpolator);
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #214 <Field float mExpandedDrawY>
	//   16   30:aload_0         
	//   17   31:getfield        #216 <Field float mCollapsedDrawY>
	//   18   34:fload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #206 <Field Interpolator mPositionInterpolator>
	//   21   39:invokestatic    #210 <Method float lerp(float, float, float, Interpolator)>
	//   22   42:putfield        #218 <Field float mCurrentDrawY>
		setInterpolatedTextSize(lerp(mExpandedTextSize, mCollapsedTextSize, f, mTextSizeInterpolator));
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #100 <Field float mExpandedTextSize>
	//   26   50:aload_0         
	//   27   51:getfield        #102 <Field float mCollapsedTextSize>
	//   28   54:fload_1         
	//   29   55:aload_0         
	//   30   56:getfield        #220 <Field Interpolator mTextSizeInterpolator>
	//   31   59:invokestatic    #210 <Method float lerp(float, float, float, Interpolator)>
	//   32   62:invokespecial   #223 <Method void setInterpolatedTextSize(float)>
		if(mCollapsedTextColor != mExpandedTextColor)
	//*  33   65:aload_0         
	//*  34   66:getfield        #225 <Field ColorStateList mCollapsedTextColor>
	//*  35   69:aload_0         
	//*  36   70:getfield        #227 <Field ColorStateList mExpandedTextColor>
	//*  37   73:if_acmpeq       98
			mTextPaint.setColor(blendColors(getCurrentExpandedTextColor(), getCurrentCollapsedTextColor(), f));
	//   38   76:aload_0         
	//   39   77:getfield        #110 <Field TextPaint mTextPaint>
	//   40   80:aload_0         
	//   41   81:invokespecial   #230 <Method int getCurrentExpandedTextColor()>
	//   42   84:aload_0         
	//   43   85:invokespecial   #233 <Method int getCurrentCollapsedTextColor()>
	//   44   88:fload_1         
	//   45   89:invokestatic    #235 <Method int blendColors(int, int, float)>
	//   46   92:invokevirtual   #236 <Method void TextPaint.setColor(int)>
		else
	//*  47   95:goto            109
			mTextPaint.setColor(getCurrentCollapsedTextColor());
	//   48   98:aload_0         
	//   49   99:getfield        #110 <Field TextPaint mTextPaint>
	//   50  102:aload_0         
	//   51  103:invokespecial   #233 <Method int getCurrentCollapsedTextColor()>
	//   52  106:invokevirtual   #236 <Method void TextPaint.setColor(int)>
		mTextPaint.setShadowLayer(lerp(mExpandedShadowRadius, mCollapsedShadowRadius, f, ((Interpolator) (null))), lerp(mExpandedShadowDx, mCollapsedShadowDx, f, ((Interpolator) (null))), lerp(mExpandedShadowDy, mCollapsedShadowDy, f, ((Interpolator) (null))), blendColors(mExpandedShadowColor, mCollapsedShadowColor, f));
	//   53  109:aload_0         
	//   54  110:getfield        #110 <Field TextPaint mTextPaint>
	//   55  113:aload_0         
	//   56  114:getfield        #238 <Field float mExpandedShadowRadius>
	//   57  117:aload_0         
	//   58  118:getfield        #240 <Field float mCollapsedShadowRadius>
	//   59  121:fload_1         
	//   60  122:aconst_null     
	//   61  123:invokestatic    #210 <Method float lerp(float, float, float, Interpolator)>
	//   62  126:aload_0         
	//   63  127:getfield        #242 <Field float mExpandedShadowDx>
	//   64  130:aload_0         
	//   65  131:getfield        #244 <Field float mCollapsedShadowDx>
	//   66  134:fload_1         
	//   67  135:aconst_null     
	//   68  136:invokestatic    #210 <Method float lerp(float, float, float, Interpolator)>
	//   69  139:aload_0         
	//   70  140:getfield        #246 <Field float mExpandedShadowDy>
	//   71  143:aload_0         
	//   72  144:getfield        #248 <Field float mCollapsedShadowDy>
	//   73  147:fload_1         
	//   74  148:aconst_null     
	//   75  149:invokestatic    #210 <Method float lerp(float, float, float, Interpolator)>
	//   76  152:aload_0         
	//   77  153:getfield        #250 <Field int mExpandedShadowColor>
	//   78  156:aload_0         
	//   79  157:getfield        #252 <Field int mCollapsedShadowColor>
	//   80  160:fload_1         
	//   81  161:invokestatic    #235 <Method int blendColors(int, int, float)>
	//   82  164:invokevirtual   #256 <Method void TextPaint.setShadowLayer(float, float, float, int)>
		ViewCompat.postInvalidateOnAnimation(mView);
	//   83  167:aload_0         
	//   84  168:getfield        #104 <Field View mView>
	//   85  171:invokestatic    #259 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//   86  174:return          
	}

	private void calculateUsingTextSize(float f)
	{
		if(mText == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #262 <Field CharSequence mText>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		float f2 = mCollapsedBounds.width();
	//    4    8:aload_0         
	//    5    9:getfield        #115 <Field Rect mCollapsedBounds>
	//    6   12:invokevirtual   #265 <Method int Rect.width()>
	//    7   15:i2f             
	//    8   16:fstore_3        
		float f3 = mExpandedBounds.width();
	//    9   17:aload_0         
	//   10   18:getfield        #117 <Field Rect mExpandedBounds>
	//   11   21:invokevirtual   #265 <Method int Rect.width()>
	//   12   24:i2f             
	//   13   25:fstore          4
		boolean flag3 = isClose(f, mCollapsedTextSize);
	//   14   27:fload_1         
	//   15   28:aload_0         
	//   16   29:getfield        #102 <Field float mCollapsedTextSize>
	//   17   32:invokestatic    #269 <Method boolean isClose(float, float)>
	//   18   35:istore          8
		boolean flag2 = true;
	//   19   37:iconst_1        
	//   20   38:istore          7
		float f1;
		boolean flag;
		if(flag3)
	//*  21   40:iload           8
	//*  22   42:ifeq            92
		{
			f1 = mCollapsedTextSize;
	//   23   45:aload_0         
	//   24   46:getfield        #102 <Field float mCollapsedTextSize>
	//   25   49:fstore_2        
			mScale = 1.0F;
	//   26   50:aload_0         
	//   27   51:fconst_1        
	//   28   52:putfield        #271 <Field float mScale>
			if(areTypefacesDifferent(mCurrentTypeface, mCollapsedTypeface))
	//*  29   55:aload_0         
	//*  30   56:aload_0         
	//*  31   57:getfield        #273 <Field Typeface mCurrentTypeface>
	//*  32   60:aload_0         
	//*  33   61:getfield        #275 <Field Typeface mCollapsedTypeface>
	//*  34   64:invokespecial   #277 <Method boolean areTypefacesDifferent(Typeface, Typeface)>
	//*  35   67:ifeq            84
			{
				mCurrentTypeface = mCollapsedTypeface;
	//   36   70:aload_0         
	//   37   71:aload_0         
	//   38   72:getfield        #275 <Field Typeface mCollapsedTypeface>
	//   39   75:putfield        #273 <Field Typeface mCurrentTypeface>
				flag = true;
	//   40   78:iconst_1        
	//   41   79:istore          5
			} else
	//*  42   81:goto            87
			{
				flag = false;
	//   43   84:iconst_0        
	//   44   85:istore          5
			}
			f = f2;
	//   45   87:fload_3         
	//   46   88:fstore_1        
		} else
	//*  47   89:goto            192
		{
			f1 = mExpandedTextSize;
	//   48   92:aload_0         
	//   49   93:getfield        #100 <Field float mExpandedTextSize>
	//   50   96:fstore_2        
			if(areTypefacesDifferent(mCurrentTypeface, mExpandedTypeface))
	//*  51   97:aload_0         
	//*  52   98:aload_0         
	//*  53   99:getfield        #273 <Field Typeface mCurrentTypeface>
	//*  54  102:aload_0         
	//*  55  103:getfield        #279 <Field Typeface mExpandedTypeface>
	//*  56  106:invokespecial   #277 <Method boolean areTypefacesDifferent(Typeface, Typeface)>
	//*  57  109:ifeq            126
			{
				mCurrentTypeface = mExpandedTypeface;
	//   58  112:aload_0         
	//   59  113:aload_0         
	//   60  114:getfield        #279 <Field Typeface mExpandedTypeface>
	//   61  117:putfield        #273 <Field Typeface mCurrentTypeface>
				flag = true;
	//   62  120:iconst_1        
	//   63  121:istore          5
			} else
	//*  64  123:goto            129
			{
				flag = false;
	//   65  126:iconst_0        
	//   66  127:istore          5
			}
			if(isClose(f, mExpandedTextSize))
	//*  67  129:fload_1         
	//*  68  130:aload_0         
	//*  69  131:getfield        #100 <Field float mExpandedTextSize>
	//*  70  134:invokestatic    #269 <Method boolean isClose(float, float)>
	//*  71  137:ifeq            148
				mScale = 1.0F;
	//   72  140:aload_0         
	//   73  141:fconst_1        
	//   74  142:putfield        #271 <Field float mScale>
			else
	//*  75  145:goto            158
				mScale = f / mExpandedTextSize;
	//   76  148:aload_0         
	//   77  149:fload_1         
	//   78  150:aload_0         
	//   79  151:getfield        #100 <Field float mExpandedTextSize>
	//   80  154:fdiv            
	//   81  155:putfield        #271 <Field float mScale>
			f = mCollapsedTextSize / mExpandedTextSize;
	//   82  158:aload_0         
	//   83  159:getfield        #102 <Field float mCollapsedTextSize>
	//   84  162:aload_0         
	//   85  163:getfield        #100 <Field float mExpandedTextSize>
	//   86  166:fdiv            
	//   87  167:fstore_1        
			if(f3 * f > f2)
	//*  88  168:fload           4
	//*  89  170:fload_1         
	//*  90  171:fmul            
	//*  91  172:fload_3         
	//*  92  173:fcmpl           
	//*  93  174:ifle            189
				f = Math.min(f2 / f, f3);
	//   94  177:fload_3         
	//   95  178:fload_1         
	//   96  179:fdiv            
	//   97  180:fload           4
	//   98  182:invokestatic    #285 <Method float Math.min(float, float)>
	//   99  185:fstore_1        
			else
	//* 100  186:goto            192
				f = f3;
	//  101  189:fload           4
	//  102  191:fstore_1        
		}
		boolean flag1 = flag;
	//  103  192:iload           5
	//  104  194:istore          6
		if(f > 0.0F)
	//* 105  196:fload_1         
	//* 106  197:fconst_0        
	//* 107  198:fcmpl           
	//* 108  199:ifle            249
		{
			if(mCurrentTextSize == f1 && !mBoundsChanged && !flag)
	//* 109  202:aload_0         
	//* 110  203:getfield        #287 <Field float mCurrentTextSize>
	//* 111  206:fload_2         
	//* 112  207:fcmpl           
	//* 113  208:ifne            232
	//* 114  211:aload_0         
	//* 115  212:getfield        #289 <Field boolean mBoundsChanged>
	//* 116  215:ifne            232
	//* 117  218:iload           5
	//* 118  220:ifeq            226
	//* 119  223:goto            232
				flag = false;
	//  120  226:iconst_0        
	//  121  227:istore          5
			else
	//* 122  229:goto            235
				flag = true;
	//  123  232:iconst_1        
	//  124  233:istore          5
			mCurrentTextSize = f1;
	//  125  235:aload_0         
	//  126  236:fload_2         
	//  127  237:putfield        #287 <Field float mCurrentTextSize>
			mBoundsChanged = false;
	//  128  240:aload_0         
	//  129  241:iconst_0        
	//  130  242:putfield        #289 <Field boolean mBoundsChanged>
			flag1 = flag;
	//  131  245:iload           5
	//  132  247:istore          6
		}
		if(mTextToDraw == null || flag1)
	//* 133  249:aload_0         
	//* 134  250:getfield        #291 <Field CharSequence mTextToDraw>
	//* 135  253:ifnull          261
	//* 136  256:iload           6
	//* 137  258:ifeq            359
		{
			mTextPaint.setTextSize(mCurrentTextSize);
	//  138  261:aload_0         
	//  139  262:getfield        #110 <Field TextPaint mTextPaint>
	//  140  265:aload_0         
	//  141  266:getfield        #287 <Field float mCurrentTextSize>
	//  142  269:invokevirtual   #294 <Method void TextPaint.setTextSize(float)>
			mTextPaint.setTypeface(mCurrentTypeface);
	//  143  272:aload_0         
	//  144  273:getfield        #110 <Field TextPaint mTextPaint>
	//  145  276:aload_0         
	//  146  277:getfield        #273 <Field Typeface mCurrentTypeface>
	//  147  280:invokevirtual   #298 <Method Typeface TextPaint.setTypeface(Typeface)>
	//  148  283:pop             
			Object obj = ((Object) (mTextPaint));
	//  149  284:aload_0         
	//  150  285:getfield        #110 <Field TextPaint mTextPaint>
	//  151  288:astore          9
			if(mScale == 1.0F)
	//* 152  290:aload_0         
	//* 153  291:getfield        #271 <Field float mScale>
	//* 154  294:fconst_1        
	//* 155  295:fcmpl           
	//* 156  296:ifeq            302
	//* 157  299:goto            305
				flag2 = false;
	//  158  302:iconst_0        
	//  159  303:istore          7
			((TextPaint) (obj)).setLinearText(flag2);
	//  160  305:aload           9
	//  161  307:iload           7
	//  162  309:invokevirtual   #301 <Method void TextPaint.setLinearText(boolean)>
			obj = ((Object) (TextUtils.ellipsize(mText, mTextPaint, f, android.text.TextUtils.TruncateAt.END)));
	//  163  312:aload_0         
	//  164  313:getfield        #262 <Field CharSequence mText>
	//  165  316:aload_0         
	//  166  317:getfield        #110 <Field TextPaint mTextPaint>
	//  167  320:fload_1         
	//  168  321:getstatic       #307 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//  169  324:invokestatic    #313 <Method CharSequence TextUtils.ellipsize(CharSequence, TextPaint, float, android.text.TextUtils$TruncateAt)>
	//  170  327:astore          9
			if(!TextUtils.equals(((CharSequence) (obj)), mTextToDraw))
	//* 171  329:aload           9
	//* 172  331:aload_0         
	//* 173  332:getfield        #291 <Field CharSequence mTextToDraw>
	//* 174  335:invokestatic    #316 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//* 175  338:ifne            359
			{
				mTextToDraw = ((CharSequence) (obj));
	//  176  341:aload_0         
	//  177  342:aload           9
	//  178  344:putfield        #291 <Field CharSequence mTextToDraw>
				mIsRtl = calculateIsRtl(mTextToDraw);
	//  179  347:aload_0         
	//  180  348:aload_0         
	//  181  349:aload_0         
	//  182  350:getfield        #291 <Field CharSequence mTextToDraw>
	//  183  353:invokespecial   #318 <Method boolean calculateIsRtl(CharSequence)>
	//  184  356:putfield        #320 <Field boolean mIsRtl>
			}
		}
	//  185  359:return          
	}

	private void clearTexture()
	{
		if(mExpandedTitleTexture != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #323 <Field Bitmap mExpandedTitleTexture>
	//*   2    4:ifnull          19
		{
			mExpandedTitleTexture.recycle();
	//    3    7:aload_0         
	//    4    8:getfield        #323 <Field Bitmap mExpandedTitleTexture>
	//    5   11:invokevirtual   #328 <Method void Bitmap.recycle()>
			mExpandedTitleTexture = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #323 <Field Bitmap mExpandedTitleTexture>
		}
	//    9   19:return          
	}

	private void ensureExpandedTexture()
	{
		if(mExpandedTitleTexture == null && !mExpandedBounds.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #323 <Field Bitmap mExpandedTitleTexture>
	//*   2    4:ifnonnull       178
	//*   3    7:aload_0         
	//*   4    8:getfield        #117 <Field Rect mExpandedBounds>
	//*   5   11:invokevirtual   #333 <Method boolean Rect.isEmpty()>
	//*   6   14:ifne            178
		{
			if(TextUtils.isEmpty(mTextToDraw))
	//*   7   17:aload_0         
	//*   8   18:getfield        #291 <Field CharSequence mTextToDraw>
	//*   9   21:invokestatic    #335 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  10   24:ifeq            28
				return;
	//   11   27:return          
			calculateOffsets(0.0F);
	//   12   28:aload_0         
	//   13   29:fconst_0        
	//   14   30:invokespecial   #168 <Method void calculateOffsets(float)>
			mTextureAscent = mTextPaint.ascent();
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #110 <Field TextPaint mTextPaint>
	//   18   38:invokevirtual   #339 <Method float TextPaint.ascent()>
	//   19   41:putfield        #341 <Field float mTextureAscent>
			mTextureDescent = mTextPaint.descent();
	//   20   44:aload_0         
	//   21   45:aload_0         
	//   22   46:getfield        #110 <Field TextPaint mTextPaint>
	//   23   49:invokevirtual   #344 <Method float TextPaint.descent()>
	//   24   52:putfield        #346 <Field float mTextureDescent>
			int i = Math.round(mTextPaint.measureText(mTextToDraw, 0, mTextToDraw.length()));
	//   25   55:aload_0         
	//   26   56:getfield        #110 <Field TextPaint mTextPaint>
	//   27   59:aload_0         
	//   28   60:getfield        #291 <Field CharSequence mTextToDraw>
	//   29   63:iconst_0        
	//   30   64:aload_0         
	//   31   65:getfield        #291 <Field CharSequence mTextToDraw>
	//   32   68:invokeinterface #191 <Method int CharSequence.length()>
	//   33   73:invokevirtual   #350 <Method float TextPaint.measureText(CharSequence, int, int)>
	//   34   76:invokestatic    #354 <Method int Math.round(float)>
	//   35   79:istore_1        
			int j = Math.round(mTextureDescent - mTextureAscent);
	//   36   80:aload_0         
	//   37   81:getfield        #346 <Field float mTextureDescent>
	//   38   84:aload_0         
	//   39   85:getfield        #341 <Field float mTextureAscent>
	//   40   88:fsub            
	//   41   89:invokestatic    #354 <Method int Math.round(float)>
	//   42   92:istore_2        
			if(i > 0)
	//*  43   93:iload_1         
	//*  44   94:ifle            177
			{
				if(j <= 0)
	//*  45   97:iload_2         
	//*  46   98:ifgt            102
					return;
	//   47  101:return          
				mExpandedTitleTexture = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
	//   48  102:aload_0         
	//   49  103:iload_1         
	//   50  104:iload_2         
	//   51  105:getstatic       #360 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   52  108:invokestatic    #364 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   53  111:putfield        #323 <Field Bitmap mExpandedTitleTexture>
				(new Canvas(mExpandedTitleTexture)).drawText(mTextToDraw, 0, mTextToDraw.length(), 0.0F, (float)j - mTextPaint.descent(), ((Paint) (mTextPaint)));
	//   54  114:new             #366 <Class Canvas>
	//   55  117:dup             
	//   56  118:aload_0         
	//   57  119:getfield        #323 <Field Bitmap mExpandedTitleTexture>
	//   58  122:invokespecial   #369 <Method void Canvas(Bitmap)>
	//   59  125:aload_0         
	//   60  126:getfield        #291 <Field CharSequence mTextToDraw>
	//   61  129:iconst_0        
	//   62  130:aload_0         
	//   63  131:getfield        #291 <Field CharSequence mTextToDraw>
	//   64  134:invokeinterface #191 <Method int CharSequence.length()>
	//   65  139:fconst_0        
	//   66  140:iload_2         
	//   67  141:i2f             
	//   68  142:aload_0         
	//   69  143:getfield        #110 <Field TextPaint mTextPaint>
	//   70  146:invokevirtual   #344 <Method float TextPaint.descent()>
	//   71  149:fsub            
	//   72  150:aload_0         
	//   73  151:getfield        #110 <Field TextPaint mTextPaint>
	//   74  154:invokevirtual   #373 <Method void Canvas.drawText(CharSequence, int, int, float, float, Paint)>
				if(mTexturePaint == null)
	//*  75  157:aload_0         
	//*  76  158:getfield        #375 <Field Paint mTexturePaint>
	//*  77  161:ifnonnull       176
					mTexturePaint = new Paint(3);
	//   78  164:aload_0         
	//   79  165:new             #79  <Class Paint>
	//   80  168:dup             
	//   81  169:iconst_3        
	//   82  170:invokespecial   #376 <Method void Paint(int)>
	//   83  173:putfield        #375 <Field Paint mTexturePaint>
				return;
	//   84  176:return          
			} else
			{
				return;
	//   85  177:return          
			}
		} else
		{
			return;
	//   86  178:return          
		}
	}

	private int getCurrentCollapsedTextColor()
	{
		if(mState != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #379 <Field int[] mState>
	//*   2    4:ifnull          20
			return mCollapsedTextColor.getColorForState(mState, 0);
	//    3    7:aload_0         
	//    4    8:getfield        #225 <Field ColorStateList mCollapsedTextColor>
	//    5   11:aload_0         
	//    6   12:getfield        #379 <Field int[] mState>
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #385 <Method int ColorStateList.getColorForState(int[], int)>
	//    9   19:ireturn         
		else
			return mCollapsedTextColor.getDefaultColor();
	//   10   20:aload_0         
	//   11   21:getfield        #225 <Field ColorStateList mCollapsedTextColor>
	//   12   24:invokevirtual   #388 <Method int ColorStateList.getDefaultColor()>
	//   13   27:ireturn         
	}

	private int getCurrentExpandedTextColor()
	{
		if(mState != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #379 <Field int[] mState>
	//*   2    4:ifnull          20
			return mExpandedTextColor.getColorForState(mState, 0);
	//    3    7:aload_0         
	//    4    8:getfield        #227 <Field ColorStateList mExpandedTextColor>
	//    5   11:aload_0         
	//    6   12:getfield        #379 <Field int[] mState>
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #385 <Method int ColorStateList.getColorForState(int[], int)>
	//    9   19:ireturn         
		else
			return mExpandedTextColor.getDefaultColor();
	//   10   20:aload_0         
	//   11   21:getfield        #227 <Field ColorStateList mExpandedTextColor>
	//   12   24:invokevirtual   #388 <Method int ColorStateList.getDefaultColor()>
	//   13   27:ireturn         
	}

	private void interpolateBounds(float f)
	{
		mCurrentBounds.left = lerp(mExpandedBounds.left, mCollapsedBounds.left, f, mPositionInterpolator);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field RectF mCurrentBounds>
	//    2    4:aload_0         
	//    3    5:getfield        #117 <Field Rect mExpandedBounds>
	//    4    8:getfield        #392 <Field int Rect.left>
	//    5   11:i2f             
	//    6   12:aload_0         
	//    7   13:getfield        #115 <Field Rect mCollapsedBounds>
	//    8   16:getfield        #392 <Field int Rect.left>
	//    9   19:i2f             
	//   10   20:fload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #206 <Field Interpolator mPositionInterpolator>
	//   13   25:invokestatic    #210 <Method float lerp(float, float, float, Interpolator)>
	//   14   28:putfield        #394 <Field float RectF.left>
		mCurrentBounds.top = lerp(mExpandedDrawY, mCollapsedDrawY, f, mPositionInterpolator);
	//   15   31:aload_0         
	//   16   32:getfield        #122 <Field RectF mCurrentBounds>
	//   17   35:aload_0         
	//   18   36:getfield        #214 <Field float mExpandedDrawY>
	//   19   39:aload_0         
	//   20   40:getfield        #216 <Field float mCollapsedDrawY>
	//   21   43:fload_1         
	//   22   44:aload_0         
	//   23   45:getfield        #206 <Field Interpolator mPositionInterpolator>
	//   24   48:invokestatic    #210 <Method float lerp(float, float, float, Interpolator)>
	//   25   51:putfield        #397 <Field float RectF.top>
		mCurrentBounds.right = lerp(mExpandedBounds.right, mCollapsedBounds.right, f, mPositionInterpolator);
	//   26   54:aload_0         
	//   27   55:getfield        #122 <Field RectF mCurrentBounds>
	//   28   58:aload_0         
	//   29   59:getfield        #117 <Field Rect mExpandedBounds>
	//   30   62:getfield        #400 <Field int Rect.right>
	//   31   65:i2f             
	//   32   66:aload_0         
	//   33   67:getfield        #115 <Field Rect mCollapsedBounds>
	//   34   70:getfield        #400 <Field int Rect.right>
	//   35   73:i2f             
	//   36   74:fload_1         
	//   37   75:aload_0         
	//   38   76:getfield        #206 <Field Interpolator mPositionInterpolator>
	//   39   79:invokestatic    #210 <Method float lerp(float, float, float, Interpolator)>
	//   40   82:putfield        #402 <Field float RectF.right>
		mCurrentBounds.bottom = lerp(mExpandedBounds.bottom, mCollapsedBounds.bottom, f, mPositionInterpolator);
	//   41   85:aload_0         
	//   42   86:getfield        #122 <Field RectF mCurrentBounds>
	//   43   89:aload_0         
	//   44   90:getfield        #117 <Field Rect mExpandedBounds>
	//   45   93:getfield        #405 <Field int Rect.bottom>
	//   46   96:i2f             
	//   47   97:aload_0         
	//   48   98:getfield        #115 <Field Rect mCollapsedBounds>
	//   49  101:getfield        #405 <Field int Rect.bottom>
	//   50  104:i2f             
	//   51  105:fload_1         
	//   52  106:aload_0         
	//   53  107:getfield        #206 <Field Interpolator mPositionInterpolator>
	//   54  110:invokestatic    #210 <Method float lerp(float, float, float, Interpolator)>
	//   55  113:putfield        #407 <Field float RectF.bottom>
	//   56  116:return          
	}

	private static boolean isClose(float f, float f1)
	{
		return Math.abs(f - f1) < 0.001F;
	//    0    0:fload_0         
	//    1    1:fload_1         
	//    2    2:fsub            
	//    3    3:invokestatic    #411 <Method float Math.abs(float)>
	//    4    6:ldc2            #412 <Float 0.001F>
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
	//    6    9:invokeinterface #417 <Method float Interpolator.getInterpolation(float)>
	//    7   14:fstore          4
		return AnimationUtils.lerp(f, f1, f3);
	//    8   16:fload_0         
	//    9   17:fload_1         
	//   10   18:fload           4
	//   11   20:invokestatic    #422 <Method float AnimationUtils.lerp(float, float, float)>
	//   12   23:freturn         
	}

	private Typeface readFontFamilyTypeface(int i)
	{
		TypedArray typedarray = mView.getContext().obtainStyledAttributes(i, new int[] {
			0x10103ac
		});
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field View mView>
	//    2    4:invokevirtual   #430 <Method Context View.getContext()>
	//    3    7:iload_1         
	//    4    8:iconst_1        
	//    5    9:newarray        int[]
	//    6   11:dup             
	//    7   12:iconst_0        
	//    8   13:ldc2            #431 <Int 0x10103ac>
	//    9   16:iastore         
	//   10   17:invokevirtual   #437 <Method TypedArray Context.obtainStyledAttributes(int, int[])>
	//   11   20:astore_2        
		Object obj = ((Object) (typedarray.getString(0)));
	//   12   21:aload_2         
	//   13   22:iconst_0        
	//   14   23:invokevirtual   #443 <Method String TypedArray.getString(int)>
	//   15   26:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_43;
	//   16   27:aload_3         
	//   17   28:ifnull          43
		obj = ((Object) (Typeface.create(((String) (obj)), 0)));
	//   18   31:aload_3         
	//   19   32:iconst_0        
	//   20   33:invokestatic    #447 <Method Typeface Typeface.create(String, int)>
	//   21   36:astore_3        
		typedarray.recycle();
	//   22   37:aload_2         
	//   23   38:invokevirtual   #448 <Method void TypedArray.recycle()>
		return ((Typeface) (obj));
	//   24   41:aload_3         
	//   25   42:areturn         
		typedarray.recycle();
	//   26   43:aload_2         
	//   27   44:invokevirtual   #448 <Method void TypedArray.recycle()>
		return null;
	//   28   47:aconst_null     
	//   29   48:areturn         
		Exception exception;
		exception;
	//   30   49:astore_3        
		typedarray.recycle();
	//   31   50:aload_2         
	//   32   51:invokevirtual   #448 <Method void TypedArray.recycle()>
		throw exception;
	//   33   54:aload_3         
	//   34   55:athrow          
	}

	private static boolean rectEquals(Rect rect, int i, int j, int k, int l)
	{
		return rect.left == i && rect.top == j && rect.right == k && rect.bottom == l;
	//    0    0:aload_0         
	//    1    1:getfield        #392 <Field int Rect.left>
	//    2    4:iload_1         
	//    3    5:icmpne          35
	//    4    8:aload_0         
	//    5    9:getfield        #452 <Field int Rect.top>
	//    6   12:iload_2         
	//    7   13:icmpne          35
	//    8   16:aload_0         
	//    9   17:getfield        #400 <Field int Rect.right>
	//   10   20:iload_3         
	//   11   21:icmpne          35
	//   12   24:aload_0         
	//   13   25:getfield        #405 <Field int Rect.bottom>
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
	//    2    2:invokespecial   #454 <Method void calculateUsingTextSize(float)>
		boolean flag;
		if(USE_SCALING_TEXTURE && mScale != 1.0F)
	//*   3    5:getstatic       #75  <Field boolean USE_SCALING_TEXTURE>
	//*   4    8:ifeq            25
	//*   5   11:aload_0         
	//*   6   12:getfield        #271 <Field float mScale>
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
		mUseTexture = flag;
	//   15   27:aload_0         
	//   16   28:iload_2         
	//   17   29:putfield        #456 <Field boolean mUseTexture>
		if(mUseTexture)
	//*  18   32:aload_0         
	//*  19   33:getfield        #456 <Field boolean mUseTexture>
	//*  20   36:ifeq            43
			ensureExpandedTexture();
	//   21   39:aload_0         
	//   22   40:invokespecial   #458 <Method void ensureExpandedTexture()>
		ViewCompat.postInvalidateOnAnimation(mView);
	//   23   43:aload_0         
	//   24   44:getfield        #104 <Field View mView>
	//   25   47:invokestatic    #259 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//   26   50:return          
	}

	public void draw(Canvas canvas)
	{
		int i = canvas.save();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #463 <Method int Canvas.save()>
	//    2    4:istore          7
		if(mTextToDraw != null && mDrawTitle)
	//*   3    6:aload_0         
	//*   4    7:getfield        #291 <Field CharSequence mTextToDraw>
	//*   5   10:ifnull          194
	//*   6   13:aload_0         
	//*   7   14:getfield        #465 <Field boolean mDrawTitle>
	//*   8   17:ifeq            194
		{
			float f5 = mCurrentDrawX;
	//    9   20:aload_0         
	//   10   21:getfield        #212 <Field float mCurrentDrawX>
	//   11   24:fstore          5
			float f4 = mCurrentDrawY;
	//   12   26:aload_0         
	//   13   27:getfield        #218 <Field float mCurrentDrawY>
	//   14   30:fstore          4
			boolean flag;
			if(mUseTexture && mExpandedTitleTexture != null)
	//*  15   32:aload_0         
	//*  16   33:getfield        #456 <Field boolean mUseTexture>
	//*  17   36:ifeq            52
	//*  18   39:aload_0         
	//*  19   40:getfield        #323 <Field Bitmap mExpandedTitleTexture>
	//*  20   43:ifnull          52
				flag = true;
	//   21   46:iconst_1        
	//   22   47:istore          6
			else
	//*  23   49:goto            55
				flag = false;
	//   24   52:iconst_0        
	//   25   53:istore          6
			float f;
			if(flag)
	//*  26   55:iload           6
	//*  27   57:ifeq            83
			{
				f = mTextureAscent * mScale;
	//   28   60:aload_0         
	//   29   61:getfield        #341 <Field float mTextureAscent>
	//   30   64:aload_0         
	//   31   65:getfield        #271 <Field float mScale>
	//   32   68:fmul            
	//   33   69:fstore_2        
				float f1 = mTextureDescent;
	//   34   70:aload_0         
	//   35   71:getfield        #346 <Field float mTextureDescent>
	//   36   74:fstore_3        
				f1 = mScale;
	//   37   75:aload_0         
	//   38   76:getfield        #271 <Field float mScale>
	//   39   79:fstore_3        
			} else
	//*  40   80:goto            109
			{
				f = mTextPaint.ascent() * mScale;
	//   41   83:aload_0         
	//   42   84:getfield        #110 <Field TextPaint mTextPaint>
	//   43   87:invokevirtual   #339 <Method float TextPaint.ascent()>
	//   44   90:aload_0         
	//   45   91:getfield        #271 <Field float mScale>
	//   46   94:fmul            
	//   47   95:fstore_2        
				mTextPaint.descent();
	//   48   96:aload_0         
	//   49   97:getfield        #110 <Field TextPaint mTextPaint>
	//   50  100:invokevirtual   #344 <Method float TextPaint.descent()>
	//   51  103:pop             
				float f2 = mScale;
	//   52  104:aload_0         
	//   53  105:getfield        #271 <Field float mScale>
	//   54  108:fstore_3        
			}
			float f3 = f4;
	//   55  109:fload           4
	//   56  111:fstore_3        
			if(flag)
	//*  57  112:iload           6
	//*  58  114:ifeq            122
				f3 = f4 + f;
	//   59  117:fload           4
	//   60  119:fload_2         
	//   61  120:fadd            
	//   62  121:fstore_3        
			if(mScale != 1.0F)
	//*  63  122:aload_0         
	//*  64  123:getfield        #271 <Field float mScale>
	//*  65  126:fconst_1        
	//*  66  127:fcmpl           
	//*  67  128:ifeq            146
				canvas.scale(mScale, mScale, f5, f3);
	//   68  131:aload_1         
	//   69  132:aload_0         
	//   70  133:getfield        #271 <Field float mScale>
	//   71  136:aload_0         
	//   72  137:getfield        #271 <Field float mScale>
	//   73  140:fload           5
	//   74  142:fload_3         
	//   75  143:invokevirtual   #469 <Method void Canvas.scale(float, float, float, float)>
			if(flag)
	//*  76  146:iload           6
	//*  77  148:ifeq            169
				canvas.drawBitmap(mExpandedTitleTexture, f5, f3, mTexturePaint);
	//   78  151:aload_1         
	//   79  152:aload_0         
	//   80  153:getfield        #323 <Field Bitmap mExpandedTitleTexture>
	//   81  156:fload           5
	//   82  158:fload_3         
	//   83  159:aload_0         
	//   84  160:getfield        #375 <Field Paint mTexturePaint>
	//   85  163:invokevirtual   #473 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
			else
	//*  86  166:goto            194
				canvas.drawText(mTextToDraw, 0, mTextToDraw.length(), f5, f3, ((Paint) (mTextPaint)));
	//   87  169:aload_1         
	//   88  170:aload_0         
	//   89  171:getfield        #291 <Field CharSequence mTextToDraw>
	//   90  174:iconst_0        
	//   91  175:aload_0         
	//   92  176:getfield        #291 <Field CharSequence mTextToDraw>
	//   93  179:invokeinterface #191 <Method int CharSequence.length()>
	//   94  184:fload           5
	//   95  186:fload_3         
	//   96  187:aload_0         
	//   97  188:getfield        #110 <Field TextPaint mTextPaint>
	//   98  191:invokevirtual   #373 <Method void Canvas.drawText(CharSequence, int, int, float, float, Paint)>
		}
		canvas.restoreToCount(i);
	//   99  194:aload_1         
	//  100  195:iload           7
	//  101  197:invokevirtual   #476 <Method void Canvas.restoreToCount(int)>
	//  102  200:return          
	}

	ColorStateList getCollapsedTextColor()
	{
		return mCollapsedTextColor;
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field ColorStateList mCollapsedTextColor>
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
	//*   1    1:getfield        #275 <Field Typeface mCollapsedTypeface>
	//*   2    4:ifnull          12
			return mCollapsedTypeface;
	//    3    7:aload_0         
	//    4    8:getfield        #275 <Field Typeface mCollapsedTypeface>
	//    5   11:areturn         
		else
			return Typeface.DEFAULT;
	//    6   12:getstatic       #485 <Field Typeface Typeface.DEFAULT>
	//    7   15:areturn         
	}

	ColorStateList getExpandedTextColor()
	{
		return mExpandedTextColor;
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field ColorStateList mExpandedTextColor>
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
	//*   1    1:getfield        #279 <Field Typeface mExpandedTypeface>
	//*   2    4:ifnull          12
			return mExpandedTypeface;
	//    3    7:aload_0         
	//    4    8:getfield        #279 <Field Typeface mExpandedTypeface>
	//    5   11:areturn         
		else
			return Typeface.DEFAULT;
	//    6   12:getstatic       #485 <Field Typeface Typeface.DEFAULT>
	//    7   15:areturn         
	}

	float getExpansionFraction()
	{
		return mExpandedFraction;
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field float mExpandedFraction>
	//    2    4:freturn         
	}

	CharSequence getText()
	{
		return mText;
	//    0    0:aload_0         
	//    1    1:getfield        #262 <Field CharSequence mText>
	//    2    4:areturn         
	}

	final boolean isStateful()
	{
		return mCollapsedTextColor != null && mCollapsedTextColor.isStateful() || mExpandedTextColor != null && mExpandedTextColor.isStateful();
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field ColorStateList mCollapsedTextColor>
	//    2    4:ifnull          17
	//    3    7:aload_0         
	//    4    8:getfield        #225 <Field ColorStateList mCollapsedTextColor>
	//    5   11:invokevirtual   #495 <Method boolean ColorStateList.isStateful()>
	//    6   14:ifne            34
	//    7   17:aload_0         
	//    8   18:getfield        #227 <Field ColorStateList mExpandedTextColor>
	//    9   21:ifnull          36
	//   10   24:aload_0         
	//   11   25:getfield        #227 <Field ColorStateList mExpandedTextColor>
	//   12   28:invokevirtual   #495 <Method boolean ColorStateList.isStateful()>
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
	//*   2    4:invokevirtual   #265 <Method int Rect.width()>
	//*   3    7:ifle            45
	//*   4   10:aload_0         
	//*   5   11:getfield        #115 <Field Rect mCollapsedBounds>
	//*   6   14:invokevirtual   #499 <Method int Rect.height()>
	//*   7   17:ifle            45
	//*   8   20:aload_0         
	//*   9   21:getfield        #117 <Field Rect mExpandedBounds>
	//*  10   24:invokevirtual   #265 <Method int Rect.width()>
	//*  11   27:ifle            45
	//*  12   30:aload_0         
	//*  13   31:getfield        #117 <Field Rect mExpandedBounds>
	//*  14   34:invokevirtual   #499 <Method int Rect.height()>
	//*  15   37:ifle            45
			flag = true;
	//   16   40:iconst_1        
	//   17   41:istore_1        
		else
	//*  18   42:goto            47
			flag = false;
	//   19   45:iconst_0        
	//   20   46:istore_1        
		mDrawTitle = flag;
	//   21   47:aload_0         
	//   22   48:iload_1         
	//   23   49:putfield        #465 <Field boolean mDrawTitle>
	//   24   52:return          
	}

	public void recalculate()
	{
		if(mView.getHeight() > 0 && mView.getWidth() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field View mView>
	//*   2    4:invokevirtual   #503 <Method int View.getHeight()>
	//*   3    7:ifle            28
	//*   4   10:aload_0         
	//*   5   11:getfield        #104 <Field View mView>
	//*   6   14:invokevirtual   #506 <Method int View.getWidth()>
	//*   7   17:ifle            28
		{
			calculateBaseOffsets();
	//    8   20:aload_0         
	//    9   21:invokespecial   #508 <Method void calculateBaseOffsets()>
			calculateCurrentOffsets();
	//   10   24:aload_0         
	//   11   25:invokespecial   #510 <Method void calculateCurrentOffsets()>
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
	//*   6    9:invokestatic    #514 <Method boolean rectEquals(Rect, int, int, int, int)>
	//*   7   12:ifne            36
		{
			mCollapsedBounds.set(i, j, k, l);
	//    8   15:aload_0         
	//    9   16:getfield        #115 <Field Rect mCollapsedBounds>
	//   10   19:iload_1         
	//   11   20:iload_2         
	//   12   21:iload_3         
	//   13   22:iload           4
	//   14   24:invokevirtual   #517 <Method void Rect.set(int, int, int, int)>
			mBoundsChanged = true;
	//   15   27:aload_0         
	//   16   28:iconst_1        
	//   17   29:putfield        #289 <Field boolean mBoundsChanged>
			onBoundsChanged();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #519 <Method void onBoundsChanged()>
		}
	//   20   36:return          
	}

	void setCollapsedTextAppearance(int i)
	{
		TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(mView.getContext(), i, android.support.v7.appcompat.R.styleable.TextAppearance);
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field View mView>
	//    2    4:invokevirtual   #430 <Method Context View.getContext()>
	//    3    7:iload_1         
	//    4    8:getstatic       #525 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//    5   11:invokestatic    #530 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, int, int[])>
	//    6   14:astore_2        
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor))
	//*   7   15:aload_2         
	//*   8   16:getstatic       #533 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//*   9   19:invokevirtual   #537 <Method boolean TintTypedArray.hasValue(int)>
	//*  10   22:ifeq            36
			mCollapsedTextColor = tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor);
	//   11   25:aload_0         
	//   12   26:aload_2         
	//   13   27:getstatic       #533 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//   14   30:invokevirtual   #541 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   15   33:putfield        #225 <Field ColorStateList mCollapsedTextColor>
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize))
	//*  16   36:aload_2         
	//*  17   37:getstatic       #544 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//*  18   40:invokevirtual   #537 <Method boolean TintTypedArray.hasValue(int)>
	//*  19   43:ifeq            63
			mCollapsedTextSize = tinttypedarray.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize, (int)mCollapsedTextSize);
	//   20   46:aload_0         
	//   21   47:aload_2         
	//   22   48:getstatic       #544 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//   23   51:aload_0         
	//   24   52:getfield        #102 <Field float mCollapsedTextSize>
	//   25   55:f2i             
	//   26   56:invokevirtual   #548 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//   27   59:i2f             
	//   28   60:putfield        #102 <Field float mCollapsedTextSize>
		mCollapsedShadowColor = tinttypedarray.getInt(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowColor, 0);
	//   29   63:aload_0         
	//   30   64:aload_2         
	//   31   65:getstatic       #551 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowColor>
	//   32   68:iconst_0        
	//   33   69:invokevirtual   #554 <Method int TintTypedArray.getInt(int, int)>
	//   34   72:putfield        #252 <Field int mCollapsedShadowColor>
		mCollapsedShadowDx = tinttypedarray.getFloat(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowDx, 0.0F);
	//   35   75:aload_0         
	//   36   76:aload_2         
	//   37   77:getstatic       #557 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowDx>
	//   38   80:fconst_0        
	//   39   81:invokevirtual   #561 <Method float TintTypedArray.getFloat(int, float)>
	//   40   84:putfield        #244 <Field float mCollapsedShadowDx>
		mCollapsedShadowDy = tinttypedarray.getFloat(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowDy, 0.0F);
	//   41   87:aload_0         
	//   42   88:aload_2         
	//   43   89:getstatic       #564 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowDy>
	//   44   92:fconst_0        
	//   45   93:invokevirtual   #561 <Method float TintTypedArray.getFloat(int, float)>
	//   46   96:putfield        #248 <Field float mCollapsedShadowDy>
		mCollapsedShadowRadius = tinttypedarray.getFloat(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowRadius, 0.0F);
	//   47   99:aload_0         
	//   48  100:aload_2         
	//   49  101:getstatic       #567 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowRadius>
	//   50  104:fconst_0        
	//   51  105:invokevirtual   #561 <Method float TintTypedArray.getFloat(int, float)>
	//   52  108:putfield        #240 <Field float mCollapsedShadowRadius>
		tinttypedarray.recycle();
	//   53  111:aload_2         
	//   54  112:invokevirtual   #568 <Method void TintTypedArray.recycle()>
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  55  115:getstatic       #73  <Field int android.os.Build$VERSION.SDK_INT>
	//*  56  118:bipush          16
	//*  57  120:icmplt          132
			mCollapsedTypeface = readFontFamilyTypeface(i);
	//   58  123:aload_0         
	//   59  124:aload_0         
	//   60  125:iload_1         
	//   61  126:invokespecial   #570 <Method Typeface readFontFamilyTypeface(int)>
	//   62  129:putfield        #275 <Field Typeface mCollapsedTypeface>
		recalculate();
	//   63  132:aload_0         
	//   64  133:invokevirtual   #572 <Method void recalculate()>
	//   65  136:return          
	}

	void setCollapsedTextColor(ColorStateList colorstatelist)
	{
		if(mCollapsedTextColor != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #225 <Field ColorStateList mCollapsedTextColor>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			mCollapsedTextColor = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #225 <Field ColorStateList mCollapsedTextColor>
			recalculate();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #572 <Method void recalculate()>
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
	//    8   14:invokevirtual   #572 <Method void recalculate()>
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
	//    9   15:invokevirtual   #572 <Method void recalculate()>
		}
	//   10   18:return          
	}

	void setCollapsedTypeface(Typeface typeface)
	{
		if(areTypefacesDifferent(mCollapsedTypeface, typeface))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:getfield        #275 <Field Typeface mCollapsedTypeface>
	//*   3    5:aload_1         
	//*   4    6:invokespecial   #277 <Method boolean areTypefacesDifferent(Typeface, Typeface)>
	//*   5    9:ifeq            21
		{
			mCollapsedTypeface = typeface;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #275 <Field Typeface mCollapsedTypeface>
			recalculate();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #572 <Method void recalculate()>
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
	//*   6    9:invokestatic    #514 <Method boolean rectEquals(Rect, int, int, int, int)>
	//*   7   12:ifne            36
		{
			mExpandedBounds.set(i, j, k, l);
	//    8   15:aload_0         
	//    9   16:getfield        #117 <Field Rect mExpandedBounds>
	//   10   19:iload_1         
	//   11   20:iload_2         
	//   12   21:iload_3         
	//   13   22:iload           4
	//   14   24:invokevirtual   #517 <Method void Rect.set(int, int, int, int)>
			mBoundsChanged = true;
	//   15   27:aload_0         
	//   16   28:iconst_1        
	//   17   29:putfield        #289 <Field boolean mBoundsChanged>
			onBoundsChanged();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #519 <Method void onBoundsChanged()>
		}
	//   20   36:return          
	}

	void setExpandedTextAppearance(int i)
	{
		TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(mView.getContext(), i, android.support.v7.appcompat.R.styleable.TextAppearance);
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field View mView>
	//    2    4:invokevirtual   #430 <Method Context View.getContext()>
	//    3    7:iload_1         
	//    4    8:getstatic       #525 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//    5   11:invokestatic    #530 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, int, int[])>
	//    6   14:astore_2        
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor))
	//*   7   15:aload_2         
	//*   8   16:getstatic       #533 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//*   9   19:invokevirtual   #537 <Method boolean TintTypedArray.hasValue(int)>
	//*  10   22:ifeq            36
			mExpandedTextColor = tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor);
	//   11   25:aload_0         
	//   12   26:aload_2         
	//   13   27:getstatic       #533 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//   14   30:invokevirtual   #541 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   15   33:putfield        #227 <Field ColorStateList mExpandedTextColor>
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize))
	//*  16   36:aload_2         
	//*  17   37:getstatic       #544 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//*  18   40:invokevirtual   #537 <Method boolean TintTypedArray.hasValue(int)>
	//*  19   43:ifeq            63
			mExpandedTextSize = tinttypedarray.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize, (int)mExpandedTextSize);
	//   20   46:aload_0         
	//   21   47:aload_2         
	//   22   48:getstatic       #544 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//   23   51:aload_0         
	//   24   52:getfield        #100 <Field float mExpandedTextSize>
	//   25   55:f2i             
	//   26   56:invokevirtual   #548 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//   27   59:i2f             
	//   28   60:putfield        #100 <Field float mExpandedTextSize>
		mExpandedShadowColor = tinttypedarray.getInt(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowColor, 0);
	//   29   63:aload_0         
	//   30   64:aload_2         
	//   31   65:getstatic       #551 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowColor>
	//   32   68:iconst_0        
	//   33   69:invokevirtual   #554 <Method int TintTypedArray.getInt(int, int)>
	//   34   72:putfield        #250 <Field int mExpandedShadowColor>
		mExpandedShadowDx = tinttypedarray.getFloat(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowDx, 0.0F);
	//   35   75:aload_0         
	//   36   76:aload_2         
	//   37   77:getstatic       #557 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowDx>
	//   38   80:fconst_0        
	//   39   81:invokevirtual   #561 <Method float TintTypedArray.getFloat(int, float)>
	//   40   84:putfield        #242 <Field float mExpandedShadowDx>
		mExpandedShadowDy = tinttypedarray.getFloat(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowDy, 0.0F);
	//   41   87:aload_0         
	//   42   88:aload_2         
	//   43   89:getstatic       #564 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowDy>
	//   44   92:fconst_0        
	//   45   93:invokevirtual   #561 <Method float TintTypedArray.getFloat(int, float)>
	//   46   96:putfield        #246 <Field float mExpandedShadowDy>
		mExpandedShadowRadius = tinttypedarray.getFloat(android.support.v7.appcompat.R.styleable.TextAppearance_android_shadowRadius, 0.0F);
	//   47   99:aload_0         
	//   48  100:aload_2         
	//   49  101:getstatic       #567 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_shadowRadius>
	//   50  104:fconst_0        
	//   51  105:invokevirtual   #561 <Method float TintTypedArray.getFloat(int, float)>
	//   52  108:putfield        #238 <Field float mExpandedShadowRadius>
		tinttypedarray.recycle();
	//   53  111:aload_2         
	//   54  112:invokevirtual   #568 <Method void TintTypedArray.recycle()>
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  55  115:getstatic       #73  <Field int android.os.Build$VERSION.SDK_INT>
	//*  56  118:bipush          16
	//*  57  120:icmplt          132
			mExpandedTypeface = readFontFamilyTypeface(i);
	//   58  123:aload_0         
	//   59  124:aload_0         
	//   60  125:iload_1         
	//   61  126:invokespecial   #570 <Method Typeface readFontFamilyTypeface(int)>
	//   62  129:putfield        #279 <Field Typeface mExpandedTypeface>
		recalculate();
	//   63  132:aload_0         
	//   64  133:invokevirtual   #572 <Method void recalculate()>
	//   65  136:return          
	}

	void setExpandedTextColor(ColorStateList colorstatelist)
	{
		if(mExpandedTextColor != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #227 <Field ColorStateList mExpandedTextColor>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			mExpandedTextColor = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #227 <Field ColorStateList mExpandedTextColor>
			recalculate();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #572 <Method void recalculate()>
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
	//    8   14:invokevirtual   #572 <Method void recalculate()>
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
	//    9   15:invokevirtual   #572 <Method void recalculate()>
		}
	//   10   18:return          
	}

	void setExpandedTypeface(Typeface typeface)
	{
		if(areTypefacesDifferent(mExpandedTypeface, typeface))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:getfield        #279 <Field Typeface mExpandedTypeface>
	//*   3    5:aload_1         
	//*   4    6:invokespecial   #277 <Method boolean areTypefacesDifferent(Typeface, Typeface)>
	//*   5    9:ifeq            21
		{
			mExpandedTypeface = typeface;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #279 <Field Typeface mExpandedTypeface>
			recalculate();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #572 <Method void recalculate()>
		}
	//   11   21:return          
	}

	void setExpansionFraction(float f)
	{
		f = MathUtils.clamp(f, 0.0F, 1.0F);
	//    0    0:fload_1         
	//    1    1:fconst_0        
	//    2    2:fconst_1        
	//    3    3:invokestatic    #590 <Method float MathUtils.clamp(float, float, float)>
	//    4    6:fstore_1        
		if(f != mExpandedFraction)
	//*   5    7:fload_1         
	//*   6    8:aload_0         
	//*   7    9:getfield        #164 <Field float mExpandedFraction>
	//*   8   12:fcmpl           
	//*   9   13:ifeq            25
		{
			mExpandedFraction = f;
	//   10   16:aload_0         
	//   11   17:fload_1         
	//   12   18:putfield        #164 <Field float mExpandedFraction>
			calculateCurrentOffsets();
	//   13   21:aload_0         
	//   14   22:invokespecial   #510 <Method void calculateCurrentOffsets()>
		}
	//   15   25:return          
	}

	void setPositionInterpolator(Interpolator interpolator)
	{
		mPositionInterpolator = interpolator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #206 <Field Interpolator mPositionInterpolator>
		recalculate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #572 <Method void recalculate()>
	//    5    9:return          
	}

	final boolean setState(int ai[])
	{
		mState = ai;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #379 <Field int[] mState>
		if(isStateful())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #595 <Method boolean isStateful()>
	//*   5    9:ifeq            18
		{
			recalculate();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #572 <Method void recalculate()>
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
	//*   4    6:getfield        #262 <Field CharSequence mText>
	//*   5    9:invokevirtual   #598 <Method boolean Object.equals(Object)>
	//*   6   12:ifne            33
		{
			mText = charsequence;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #262 <Field CharSequence mText>
			mTextToDraw = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #291 <Field CharSequence mTextToDraw>
			clearTexture();
	//   13   25:aload_0         
	//   14   26:invokespecial   #600 <Method void clearTexture()>
			recalculate();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #572 <Method void recalculate()>
		}
	//   17   33:return          
	}

	void setTextSizeInterpolator(Interpolator interpolator)
	{
		mTextSizeInterpolator = interpolator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #220 <Field Interpolator mTextSizeInterpolator>
		recalculate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #572 <Method void recalculate()>
	//    5    9:return          
	}

	void setTypefaces(Typeface typeface)
	{
		mExpandedTypeface = typeface;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #279 <Field Typeface mExpandedTypeface>
		mCollapsedTypeface = typeface;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #275 <Field Typeface mCollapsedTypeface>
		recalculate();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #572 <Method void recalculate()>
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
	//    9   16:putstatic       #75  <Field boolean USE_SCALING_TEXTURE>
		if(DEBUG_DRAW_PAINT != null)
	//*  10   19:getstatic       #77  <Field Paint DEBUG_DRAW_PAINT>
	//*  11   22:ifnull          40
		{
			DEBUG_DRAW_PAINT.setAntiAlias(true);
	//   12   25:getstatic       #77  <Field Paint DEBUG_DRAW_PAINT>
	//   13   28:iconst_1        
	//   14   29:invokevirtual   #83  <Method void Paint.setAntiAlias(boolean)>
			DEBUG_DRAW_PAINT.setColor(-65281);
	//   15   32:getstatic       #77  <Field Paint DEBUG_DRAW_PAINT>
	//   16   35:ldc1            #84  <Int -65281>
	//   17   37:invokevirtual   #88  <Method void Paint.setColor(int)>
		}
	//*  18   40:return          
	}
}
