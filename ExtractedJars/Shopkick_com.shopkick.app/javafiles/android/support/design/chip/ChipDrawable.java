// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.chip;

import android.content.Context;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.support.design.animation.MotionSpec;
import android.support.design.canvas.CanvasCompat;
import android.support.design.drawable.DrawableUtils;
import android.support.design.internal.ThemeEnforcement;
import android.support.design.resources.MaterialResources;
import android.support.design.resources.TextAppearance;
import android.support.design.ripple.RippleUtils;
import android.support.v4.graphics.ColorUtils;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.graphics.drawable.TintAwareDrawable;
import android.support.v4.text.BidiFormatter;
import android.support.v7.content.res.AppCompatResources;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.*;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ChipDrawable extends Drawable
	implements TintAwareDrawable, android.graphics.drawable.Drawable.Callback
{
	public static interface Delegate
	{

		public abstract void onChipDrawableSizeChange();
	}


	private ChipDrawable(Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #113 <Method void Drawable()>
	//    2    4:aload_0         
	//    3    5:new             #10  <Class ChipDrawable$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #116 <Method void ChipDrawable$1(ChipDrawable)>
	//    7   13:putfield        #118 <Field android.support.v4.content.res.ResourcesCompat$FontCallback fontCallback>
	//    8   16:aload_0         
	//    9   17:new             #120 <Class TextPaint>
	//   10   20:dup             
	//   11   21:iconst_1        
	//   12   22:invokespecial   #123 <Method void TextPaint(int)>
	//   13   25:putfield        #125 <Field TextPaint textPaint>
	//   14   28:aload_0         
	//   15   29:new             #127 <Class Paint>
	//   16   32:dup             
	//   17   33:iconst_1        
	//   18   34:invokespecial   #128 <Method void Paint(int)>
	//   19   37:putfield        #130 <Field Paint chipPaint>
	//   20   40:aload_0         
	//   21   41:new             #132 <Class android.graphics.Paint$FontMetrics>
	//   22   44:dup             
	//   23   45:invokespecial   #133 <Method void android.graphics.Paint$FontMetrics()>
	//   24   48:putfield        #135 <Field android.graphics.Paint$FontMetrics fontMetrics>
	//   25   51:aload_0         
	//   26   52:new             #137 <Class RectF>
	//   27   55:dup             
	//   28   56:invokespecial   #138 <Method void RectF()>
	//   29   59:putfield        #140 <Field RectF rectF>
	//   30   62:aload_0         
	//   31   63:new             #142 <Class PointF>
	//   32   66:dup             
	//   33   67:invokespecial   #143 <Method void PointF()>
	//   34   70:putfield        #145 <Field PointF pointF>
		alpha = 255;
	//   35   73:aload_0         
	//   36   74:sipush          255
	//   37   77:putfield        #147 <Field int alpha>
		tintMode = android.graphics.PorterDuff.Mode.SRC_IN;
	//   38   80:aload_0         
	//   39   81:getstatic       #152 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   40   84:putfield        #154 <Field android.graphics.PorterDuff$Mode tintMode>
		_flddelegate = new WeakReference(((Object) (null)));
	//   41   87:aload_0         
	//   42   88:new             #156 <Class WeakReference>
	//   43   91:dup             
	//   44   92:aconst_null     
	//   45   93:invokespecial   #159 <Method void WeakReference(Object)>
	//   46   96:putfield        #161 <Field WeakReference _flddelegate>
		textWidthDirty = true;
	//   47   99:aload_0         
	//   48  100:iconst_1        
	//   49  101:putfield        #163 <Field boolean textWidthDirty>
		context = context1;
	//   50  104:aload_0         
	//   51  105:aload_1         
	//   52  106:putfield        #165 <Field Context context>
		rawText = "";
	//   53  109:aload_0         
	//   54  110:ldc1            #167 <String "">
	//   55  112:putfield        #169 <Field CharSequence rawText>
		textPaint.density = context1.getResources().getDisplayMetrics().density;
	//   56  115:aload_0         
	//   57  116:getfield        #125 <Field TextPaint textPaint>
	//   58  119:aload_1         
	//   59  120:invokevirtual   #175 <Method Resources Context.getResources()>
	//   60  123:invokevirtual   #181 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   61  126:getfield        #186 <Field float DisplayMetrics.density>
	//   62  129:putfield        #187 <Field float TextPaint.density>
	//   63  132:aload_0         
	//   64  133:aconst_null     
	//   65  134:putfield        #189 <Field Paint debugPaint>
		context1 = ((Context) (debugPaint));
	//   66  137:aload_0         
	//   67  138:getfield        #189 <Field Paint debugPaint>
	//   68  141:astore_1        
		if(context1 != null)
	//*  69  142:aload_1         
	//*  70  143:ifnull          153
			((Paint) (context1)).setStyle(android.graphics.Paint.Style.STROKE);
	//   71  146:aload_1         
	//   72  147:getstatic       #195 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   73  150:invokevirtual   #199 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		setState(DEFAULT_STATE);
	//   74  153:aload_0         
	//   75  154:getstatic       #108 <Field int[] DEFAULT_STATE>
	//   76  157:invokevirtual   #203 <Method boolean setState(int[])>
	//   77  160:pop             
		setCloseIconState(DEFAULT_STATE);
	//   78  161:aload_0         
	//   79  162:getstatic       #108 <Field int[] DEFAULT_STATE>
	//   80  165:invokevirtual   #206 <Method boolean setCloseIconState(int[])>
	//   81  168:pop             
		shouldDrawText = true;
	//   82  169:aload_0         
	//   83  170:iconst_1        
	//   84  171:putfield        #208 <Field boolean shouldDrawText>
	//   85  174:return          
	}

	private void applyChildDrawable(Drawable drawable)
	{
		if(drawable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          86
		{
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #216 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			DrawableCompat.setLayoutDirection(drawable, DrawableCompat.getLayoutDirection(((Drawable) (this))));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokestatic    #222 <Method int DrawableCompat.getLayoutDirection(Drawable)>
	//    8   14:invokestatic    #226 <Method boolean DrawableCompat.setLayoutDirection(Drawable, int)>
	//    9   17:pop             
			drawable.setLevel(getLevel());
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:invokevirtual   #230 <Method int getLevel()>
	//   13   23:invokevirtual   #234 <Method boolean Drawable.setLevel(int)>
	//   14   26:pop             
			drawable.setVisible(isVisible(), false);
	//   15   27:aload_1         
	//   16   28:aload_0         
	//   17   29:invokevirtual   #238 <Method boolean isVisible()>
	//   18   32:iconst_0        
	//   19   33:invokevirtual   #242 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   20   36:pop             
			if(drawable == closeIcon)
	//*  21   37:aload_1         
	//*  22   38:aload_0         
	//*  23   39:getfield        #244 <Field Drawable closeIcon>
	//*  24   42:if_acmpne       70
			{
				if(drawable.isStateful())
	//*  25   45:aload_1         
	//*  26   46:invokevirtual   #247 <Method boolean Drawable.isStateful()>
	//*  27   49:ifeq            61
					drawable.setState(getCloseIconState());
	//   28   52:aload_1         
	//   29   53:aload_0         
	//   30   54:invokevirtual   #251 <Method int[] getCloseIconState()>
	//   31   57:invokevirtual   #252 <Method boolean Drawable.setState(int[])>
	//   32   60:pop             
				DrawableCompat.setTintList(drawable, closeIconTint);
	//   33   61:aload_1         
	//   34   62:aload_0         
	//   35   63:getfield        #254 <Field ColorStateList closeIconTint>
	//   36   66:invokestatic    #258 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
				return;
	//   37   69:return          
			}
			if(drawable.isStateful())
	//*  38   70:aload_1         
	//*  39   71:invokevirtual   #247 <Method boolean Drawable.isStateful()>
	//*  40   74:ifeq            86
				drawable.setState(getState());
	//   41   77:aload_1         
	//   42   78:aload_0         
	//   43   79:invokevirtual   #261 <Method int[] getState()>
	//   44   82:invokevirtual   #252 <Method boolean Drawable.setState(int[])>
	//   45   85:pop             
		}
	//   46   86:return          
	}

	private void calculateChipIconBounds(Rect rect, RectF rectf)
	{
		rectf.setEmpty();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #267 <Method void RectF.setEmpty()>
		if(showsChipIcon() || showsCheckedIcon())
	//*   2    4:aload_0         
	//*   3    5:invokespecial   #270 <Method boolean showsChipIcon()>
	//*   4    8:ifne            18
	//*   5   11:aload_0         
	//*   6   12:invokespecial   #273 <Method boolean showsCheckedIcon()>
	//*   7   15:ifeq            114
		{
			float f = chipStartPadding + iconStartPadding;
	//    8   18:aload_0         
	//    9   19:getfield        #275 <Field float chipStartPadding>
	//   10   22:aload_0         
	//   11   23:getfield        #277 <Field float iconStartPadding>
	//   12   26:fadd            
	//   13   27:fstore_3        
			if(DrawableCompat.getLayoutDirection(((Drawable) (this))) == 0)
	//*  14   28:aload_0         
	//*  15   29:invokestatic    #222 <Method int DrawableCompat.getLayoutDirection(Drawable)>
	//*  16   32:ifne            62
			{
				rectf.left = (float)rect.left + f;
	//   17   35:aload_2         
	//   18   36:aload_1         
	//   19   37:getfield        #282 <Field int Rect.left>
	//   20   40:i2f             
	//   21   41:fload_3         
	//   22   42:fadd            
	//   23   43:putfield        #284 <Field float RectF.left>
				rectf.right = rectf.left + chipIconSize;
	//   24   46:aload_2         
	//   25   47:aload_2         
	//   26   48:getfield        #284 <Field float RectF.left>
	//   27   51:aload_0         
	//   28   52:getfield        #286 <Field float chipIconSize>
	//   29   55:fadd            
	//   30   56:putfield        #289 <Field float RectF.right>
			} else
	//*  31   59:goto            86
			{
				rectf.right = (float)rect.right - f;
	//   32   62:aload_2         
	//   33   63:aload_1         
	//   34   64:getfield        #291 <Field int Rect.right>
	//   35   67:i2f             
	//   36   68:fload_3         
	//   37   69:fsub            
	//   38   70:putfield        #289 <Field float RectF.right>
				rectf.left = rectf.right - chipIconSize;
	//   39   73:aload_2         
	//   40   74:aload_2         
	//   41   75:getfield        #289 <Field float RectF.right>
	//   42   78:aload_0         
	//   43   79:getfield        #286 <Field float chipIconSize>
	//   44   82:fsub            
	//   45   83:putfield        #284 <Field float RectF.left>
			}
			rectf.top = rect.exactCenterY() - chipIconSize / 2.0F;
	//   46   86:aload_2         
	//   47   87:aload_1         
	//   48   88:invokevirtual   #295 <Method float Rect.exactCenterY()>
	//   49   91:aload_0         
	//   50   92:getfield        #286 <Field float chipIconSize>
	//   51   95:fconst_2        
	//   52   96:fdiv            
	//   53   97:fsub            
	//   54   98:putfield        #298 <Field float RectF.top>
			rectf.bottom = rectf.top + chipIconSize;
	//   55  101:aload_2         
	//   56  102:aload_2         
	//   57  103:getfield        #298 <Field float RectF.top>
	//   58  106:aload_0         
	//   59  107:getfield        #286 <Field float chipIconSize>
	//   60  110:fadd            
	//   61  111:putfield        #301 <Field float RectF.bottom>
		}
	//   62  114:return          
	}

	private void calculateChipTouchBounds(Rect rect, RectF rectf)
	{
		rectf.set(rect);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #306 <Method void RectF.set(Rect)>
		if(showsCloseIcon())
	//*   3    5:aload_0         
	//*   4    6:invokespecial   #309 <Method boolean showsCloseIcon()>
	//*   5    9:ifeq            67
		{
			float f = chipEndPadding + closeIconEndPadding + closeIconSize + closeIconStartPadding + textEndPadding;
	//    6   12:aload_0         
	//    7   13:getfield        #311 <Field float chipEndPadding>
	//    8   16:aload_0         
	//    9   17:getfield        #313 <Field float closeIconEndPadding>
	//   10   20:fadd            
	//   11   21:aload_0         
	//   12   22:getfield        #315 <Field float closeIconSize>
	//   13   25:fadd            
	//   14   26:aload_0         
	//   15   27:getfield        #317 <Field float closeIconStartPadding>
	//   16   30:fadd            
	//   17   31:aload_0         
	//   18   32:getfield        #319 <Field float textEndPadding>
	//   19   35:fadd            
	//   20   36:fstore_3        
			if(DrawableCompat.getLayoutDirection(((Drawable) (this))) == 0)
	//*  21   37:aload_0         
	//*  22   38:invokestatic    #222 <Method int DrawableCompat.getLayoutDirection(Drawable)>
	//*  23   41:ifne            56
			{
				rectf.right = (float)rect.right - f;
	//   24   44:aload_2         
	//   25   45:aload_1         
	//   26   46:getfield        #291 <Field int Rect.right>
	//   27   49:i2f             
	//   28   50:fload_3         
	//   29   51:fsub            
	//   30   52:putfield        #289 <Field float RectF.right>
				return;
	//   31   55:return          
			}
			rectf.left = (float)rect.left + f;
	//   32   56:aload_2         
	//   33   57:aload_1         
	//   34   58:getfield        #282 <Field int Rect.left>
	//   35   61:i2f             
	//   36   62:fload_3         
	//   37   63:fadd            
	//   38   64:putfield        #284 <Field float RectF.left>
		}
	//   39   67:return          
	}

	private void calculateCloseIconBounds(Rect rect, RectF rectf)
	{
		rectf.setEmpty();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #267 <Method void RectF.setEmpty()>
		if(showsCloseIcon())
	//*   2    4:aload_0         
	//*   3    5:invokespecial   #309 <Method boolean showsCloseIcon()>
	//*   4    8:ifeq            107
		{
			float f = chipEndPadding + closeIconEndPadding;
	//    5   11:aload_0         
	//    6   12:getfield        #311 <Field float chipEndPadding>
	//    7   15:aload_0         
	//    8   16:getfield        #313 <Field float closeIconEndPadding>
	//    9   19:fadd            
	//   10   20:fstore_3        
			if(DrawableCompat.getLayoutDirection(((Drawable) (this))) == 0)
	//*  11   21:aload_0         
	//*  12   22:invokestatic    #222 <Method int DrawableCompat.getLayoutDirection(Drawable)>
	//*  13   25:ifne            55
			{
				rectf.right = (float)rect.right - f;
	//   14   28:aload_2         
	//   15   29:aload_1         
	//   16   30:getfield        #291 <Field int Rect.right>
	//   17   33:i2f             
	//   18   34:fload_3         
	//   19   35:fsub            
	//   20   36:putfield        #289 <Field float RectF.right>
				rectf.left = rectf.right - closeIconSize;
	//   21   39:aload_2         
	//   22   40:aload_2         
	//   23   41:getfield        #289 <Field float RectF.right>
	//   24   44:aload_0         
	//   25   45:getfield        #315 <Field float closeIconSize>
	//   26   48:fsub            
	//   27   49:putfield        #284 <Field float RectF.left>
			} else
	//*  28   52:goto            79
			{
				rectf.left = (float)rect.left + f;
	//   29   55:aload_2         
	//   30   56:aload_1         
	//   31   57:getfield        #282 <Field int Rect.left>
	//   32   60:i2f             
	//   33   61:fload_3         
	//   34   62:fadd            
	//   35   63:putfield        #284 <Field float RectF.left>
				rectf.right = rectf.left + closeIconSize;
	//   36   66:aload_2         
	//   37   67:aload_2         
	//   38   68:getfield        #284 <Field float RectF.left>
	//   39   71:aload_0         
	//   40   72:getfield        #315 <Field float closeIconSize>
	//   41   75:fadd            
	//   42   76:putfield        #289 <Field float RectF.right>
			}
			rectf.top = rect.exactCenterY() - closeIconSize / 2.0F;
	//   43   79:aload_2         
	//   44   80:aload_1         
	//   45   81:invokevirtual   #295 <Method float Rect.exactCenterY()>
	//   46   84:aload_0         
	//   47   85:getfield        #315 <Field float closeIconSize>
	//   48   88:fconst_2        
	//   49   89:fdiv            
	//   50   90:fsub            
	//   51   91:putfield        #298 <Field float RectF.top>
			rectf.bottom = rectf.top + closeIconSize;
	//   52   94:aload_2         
	//   53   95:aload_2         
	//   54   96:getfield        #298 <Field float RectF.top>
	//   55   99:aload_0         
	//   56  100:getfield        #315 <Field float closeIconSize>
	//   57  103:fadd            
	//   58  104:putfield        #301 <Field float RectF.bottom>
		}
	//   59  107:return          
	}

	private void calculateCloseIconTouchBounds(Rect rect, RectF rectf)
	{
		rectf.setEmpty();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #267 <Method void RectF.setEmpty()>
		if(showsCloseIcon())
	//*   2    4:aload_0         
	//*   3    5:invokespecial   #309 <Method boolean showsCloseIcon()>
	//*   4    8:ifeq            103
		{
			float f = chipEndPadding + closeIconEndPadding + closeIconSize + closeIconStartPadding + textEndPadding;
	//    5   11:aload_0         
	//    6   12:getfield        #311 <Field float chipEndPadding>
	//    7   15:aload_0         
	//    8   16:getfield        #313 <Field float closeIconEndPadding>
	//    9   19:fadd            
	//   10   20:aload_0         
	//   11   21:getfield        #315 <Field float closeIconSize>
	//   12   24:fadd            
	//   13   25:aload_0         
	//   14   26:getfield        #317 <Field float closeIconStartPadding>
	//   15   29:fadd            
	//   16   30:aload_0         
	//   17   31:getfield        #319 <Field float textEndPadding>
	//   18   34:fadd            
	//   19   35:fstore_3        
			if(DrawableCompat.getLayoutDirection(((Drawable) (this))) == 0)
	//*  20   36:aload_0         
	//*  21   37:invokestatic    #222 <Method int DrawableCompat.getLayoutDirection(Drawable)>
	//*  22   40:ifne            65
			{
				rectf.right = rect.right;
	//   23   43:aload_2         
	//   24   44:aload_1         
	//   25   45:getfield        #291 <Field int Rect.right>
	//   26   48:i2f             
	//   27   49:putfield        #289 <Field float RectF.right>
				rectf.left = rectf.right - f;
	//   28   52:aload_2         
	//   29   53:aload_2         
	//   30   54:getfield        #289 <Field float RectF.right>
	//   31   57:fload_3         
	//   32   58:fsub            
	//   33   59:putfield        #284 <Field float RectF.left>
			} else
	//*  34   62:goto            85
			{
				rectf.left = rect.left;
	//   35   65:aload_2         
	//   36   66:aload_1         
	//   37   67:getfield        #282 <Field int Rect.left>
	//   38   70:i2f             
	//   39   71:putfield        #284 <Field float RectF.left>
				rectf.right = (float)rect.left + f;
	//   40   74:aload_2         
	//   41   75:aload_1         
	//   42   76:getfield        #282 <Field int Rect.left>
	//   43   79:i2f             
	//   44   80:fload_3         
	//   45   81:fadd            
	//   46   82:putfield        #289 <Field float RectF.right>
			}
			rectf.top = rect.top;
	//   47   85:aload_2         
	//   48   86:aload_1         
	//   49   87:getfield        #323 <Field int Rect.top>
	//   50   90:i2f             
	//   51   91:putfield        #298 <Field float RectF.top>
			rectf.bottom = rect.bottom;
	//   52   94:aload_2         
	//   53   95:aload_1         
	//   54   96:getfield        #325 <Field int Rect.bottom>
	//   55   99:i2f             
	//   56  100:putfield        #301 <Field float RectF.bottom>
		}
	//   57  103:return          
	}

	private float calculateCloseIconWidth()
	{
		if(showsCloseIcon())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #309 <Method boolean showsCloseIcon()>
	//*   2    4:ifeq            22
			return closeIconStartPadding + closeIconSize + closeIconEndPadding;
	//    3    7:aload_0         
	//    4    8:getfield        #317 <Field float closeIconStartPadding>
	//    5   11:aload_0         
	//    6   12:getfield        #315 <Field float closeIconSize>
	//    7   15:fadd            
	//    8   16:aload_0         
	//    9   17:getfield        #313 <Field float closeIconEndPadding>
	//   10   20:fadd            
	//   11   21:freturn         
		else
			return 0.0F;
	//   12   22:fconst_0        
	//   13   23:freturn         
	}

	private void calculateTextBounds(Rect rect, RectF rectf)
	{
		rectf.setEmpty();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #267 <Method void RectF.setEmpty()>
		if(unicodeWrappedText != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #329 <Field CharSequence unicodeWrappedText>
	//*   4    8:ifnull          116
		{
			float f = chipStartPadding + calculateChipIconWidth() + textStartPadding;
	//    5   11:aload_0         
	//    6   12:getfield        #275 <Field float chipStartPadding>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #332 <Method float calculateChipIconWidth()>
	//    9   19:fadd            
	//   10   20:aload_0         
	//   11   21:getfield        #334 <Field float textStartPadding>
	//   12   24:fadd            
	//   13   25:fstore_3        
			float f1 = chipEndPadding + calculateCloseIconWidth() + textEndPadding;
	//   14   26:aload_0         
	//   15   27:getfield        #311 <Field float chipEndPadding>
	//   16   30:aload_0         
	//   17   31:invokespecial   #336 <Method float calculateCloseIconWidth()>
	//   18   34:fadd            
	//   19   35:aload_0         
	//   20   36:getfield        #319 <Field float textEndPadding>
	//   21   39:fadd            
	//   22   40:fstore          4
			if(DrawableCompat.getLayoutDirection(((Drawable) (this))) == 0)
	//*  23   42:aload_0         
	//*  24   43:invokestatic    #222 <Method int DrawableCompat.getLayoutDirection(Drawable)>
	//*  25   46:ifne            75
			{
				rectf.left = (float)rect.left + f;
	//   26   49:aload_2         
	//   27   50:aload_1         
	//   28   51:getfield        #282 <Field int Rect.left>
	//   29   54:i2f             
	//   30   55:fload_3         
	//   31   56:fadd            
	//   32   57:putfield        #284 <Field float RectF.left>
				rectf.right = (float)rect.right - f1;
	//   33   60:aload_2         
	//   34   61:aload_1         
	//   35   62:getfield        #291 <Field int Rect.right>
	//   36   65:i2f             
	//   37   66:fload           4
	//   38   68:fsub            
	//   39   69:putfield        #289 <Field float RectF.right>
			} else
	//*  40   72:goto            98
			{
				rectf.left = (float)rect.left + f1;
	//   41   75:aload_2         
	//   42   76:aload_1         
	//   43   77:getfield        #282 <Field int Rect.left>
	//   44   80:i2f             
	//   45   81:fload           4
	//   46   83:fadd            
	//   47   84:putfield        #284 <Field float RectF.left>
				rectf.right = (float)rect.right - f;
	//   48   87:aload_2         
	//   49   88:aload_1         
	//   50   89:getfield        #291 <Field int Rect.right>
	//   51   92:i2f             
	//   52   93:fload_3         
	//   53   94:fsub            
	//   54   95:putfield        #289 <Field float RectF.right>
			}
			rectf.top = rect.top;
	//   55   98:aload_2         
	//   56   99:aload_1         
	//   57  100:getfield        #323 <Field int Rect.top>
	//   58  103:i2f             
	//   59  104:putfield        #298 <Field float RectF.top>
			rectf.bottom = rect.bottom;
	//   60  107:aload_2         
	//   61  108:aload_1         
	//   62  109:getfield        #325 <Field int Rect.bottom>
	//   63  112:i2f             
	//   64  113:putfield        #301 <Field float RectF.bottom>
		}
	//   65  116:return          
	}

	private float calculateTextCenterFromBaseline()
	{
		textPaint.getFontMetrics(fontMetrics);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field TextPaint textPaint>
	//    2    4:aload_0         
	//    3    5:getfield        #135 <Field android.graphics.Paint$FontMetrics fontMetrics>
	//    4    8:invokevirtual   #341 <Method float TextPaint.getFontMetrics(android.graphics.Paint$FontMetrics)>
	//    5   11:pop             
		return (fontMetrics.descent + fontMetrics.ascent) / 2.0F;
	//    6   12:aload_0         
	//    7   13:getfield        #135 <Field android.graphics.Paint$FontMetrics fontMetrics>
	//    8   16:getfield        #344 <Field float android.graphics.Paint$FontMetrics.descent>
	//    9   19:aload_0         
	//   10   20:getfield        #135 <Field android.graphics.Paint$FontMetrics fontMetrics>
	//   11   23:getfield        #347 <Field float android.graphics.Paint$FontMetrics.ascent>
	//   12   26:fadd            
	//   13   27:fconst_2        
	//   14   28:fdiv            
	//   15   29:freturn         
	}

	private float calculateTextWidth(CharSequence charsequence)
	{
		if(charsequence == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return 0.0F;
	//    2    4:fconst_0        
	//    3    5:freturn         
		else
			return textPaint.measureText(charsequence, 0, charsequence.length());
	//    4    6:aload_0         
	//    5    7:getfield        #125 <Field TextPaint textPaint>
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:aload_1         
	//    9   13:invokeinterface #354 <Method int CharSequence.length()>
	//   10   18:invokevirtual   #358 <Method float TextPaint.measureText(CharSequence, int, int)>
	//   11   21:freturn         
	}

	private boolean canShowCheckedIcon()
	{
		return checkedIconVisible && checkedIcon != null && checkable;
	//    0    0:aload_0         
	//    1    1:getfield        #361 <Field boolean checkedIconVisible>
	//    2    4:ifeq            23
	//    3    7:aload_0         
	//    4    8:getfield        #363 <Field Drawable checkedIcon>
	//    5   11:ifnull          23
	//    6   14:aload_0         
	//    7   15:getfield        #365 <Field boolean checkable>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public static ChipDrawable createFromAttributes(Context context1, AttributeSet attributeset, int i, int j)
	{
		context1 = ((Context) (new ChipDrawable(context1)));
	//    0    0:new             #2   <Class ChipDrawable>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #371 <Method void ChipDrawable(Context)>
	//    4    8:astore_0        
		((ChipDrawable) (context1)).loadFromAttributes(attributeset, i, j);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:iload_3         
	//    9   13:invokespecial   #375 <Method void loadFromAttributes(AttributeSet, int, int)>
		return ((ChipDrawable) (context1));
	//   10   16:aload_0         
	//   11   17:areturn         
	}

	public static ChipDrawable createFromResource(Context context1, int i)
	{
		Object obj = ((Object) (context1.getResources().getXml(i)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #175 <Method Resources Context.getResources()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #386 <Method android.content.res.XmlResourceParser Resources.getXml(int)>
	//    4    8:astore          4
		int j;
		do
			j = ((XmlPullParser) (obj)).next();
	//    5   10:aload           4
	//    6   12:invokeinterface #391 <Method int XmlPullParser.next()>
	//    7   17:istore_2        
		while(j != 2 && j != 1);
	//    8   18:iload_2         
	//    9   19:iconst_2        
	//   10   20:icmpeq          28
	//   11   23:iload_2         
	//   12   24:iconst_1        
	//   13   25:icmpne          10
		if(j != 2)
			break MISSING_BLOCK_LABEL_96;
	//   14   28:iload_2         
	//   15   29:iconst_2        
	//   16   30:icmpne          96
		int l;
		if(!TextUtils.equals(((CharSequence) (((XmlPullParser) (obj)).getName())), "chip"))
			break MISSING_BLOCK_LABEL_85;
	//   17   33:aload           4
	//   18   35:invokeinterface #395 <Method String XmlPullParser.getName()>
	//   19   40:ldc2            #397 <String "chip">
	//   20   43:invokestatic    #403 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   21   46:ifeq            85
		obj = ((Object) (Xml.asAttributeSet(((XmlPullParser) (obj)))));
	//   22   49:aload           4
	//   23   51:invokestatic    #409 <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//   24   54:astore          4
		l = ((AttributeSet) (obj)).getStyleAttribute();
	//   25   56:aload           4
	//   26   58:invokeinterface #414 <Method int AttributeSet.getStyleAttribute()>
	//   27   63:istore_3        
		int k;
		k = l;
	//   28   64:iload_3         
	//   29   65:istore_2        
		if(l != 0)
			break MISSING_BLOCK_LABEL_74;
	//   30   66:iload_3         
	//   31   67:ifne            74
		k = android.support.design.R.style.Widget_MaterialComponents_Chip_Entry;
	//   32   70:getstatic       #419 <Field int android.support.design.R$style.Widget_MaterialComponents_Chip_Entry>
	//   33   73:istore_2        
		return createFromAttributes(context1, ((AttributeSet) (obj)), android.support.design.R.attr.chipStandaloneStyle, k);
	//   34   74:aload_0         
	//   35   75:aload           4
	//   36   77:getstatic       #424 <Field int android.support.design.R$attr.chipStandaloneStyle>
	//   37   80:iload_2         
	//   38   81:invokestatic    #426 <Method ChipDrawable createFromAttributes(Context, AttributeSet, int, int)>
	//   39   84:areturn         
		throw new XmlPullParserException("Must have a <chip> start tag");
	//   40   85:new             #380 <Class XmlPullParserException>
	//   41   88:dup             
	//   42   89:ldc2            #428 <String "Must have a <chip> start tag">
	//   43   92:invokespecial   #431 <Method void XmlPullParserException(String)>
	//   44   95:athrow          
		throw new XmlPullParserException("No start tag found");
	//   45   96:new             #380 <Class XmlPullParserException>
	//   46   99:dup             
	//   47  100:ldc2            #433 <String "No start tag found">
	//   48  103:invokespecial   #431 <Method void XmlPullParserException(String)>
	//   49  106:athrow          
		context1;
	//   50  107:astore_0        
		break MISSING_BLOCK_LABEL_112;
	//   51  108:goto            112
		context1;
	//   52  111:astore_0        
		Object obj1 = ((Object) (new StringBuilder()));
	//   53  112:new             #435 <Class StringBuilder>
	//   54  115:dup             
	//   55  116:invokespecial   #436 <Method void StringBuilder()>
	//   56  119:astore          4
		((StringBuilder) (obj1)).append("Can't load chip resource ID #0x");
	//   57  121:aload           4
	//   58  123:ldc2            #438 <String "Can't load chip resource ID #0x">
	//   59  126:invokevirtual   #442 <Method StringBuilder StringBuilder.append(String)>
	//   60  129:pop             
		((StringBuilder) (obj1)).append(Integer.toHexString(i));
	//   61  130:aload           4
	//   62  132:iload_1         
	//   63  133:invokestatic    #448 <Method String Integer.toHexString(int)>
	//   64  136:invokevirtual   #442 <Method StringBuilder StringBuilder.append(String)>
	//   65  139:pop             
		obj1 = ((Object) (new android.content.res.Resources.NotFoundException(((StringBuilder) (obj1)).toString())));
	//   66  140:new             #450 <Class android.content.res.Resources$NotFoundException>
	//   67  143:dup             
	//   68  144:aload           4
	//   69  146:invokevirtual   #453 <Method String StringBuilder.toString()>
	//   70  149:invokespecial   #454 <Method void android.content.res.Resources$NotFoundException(String)>
	//   71  152:astore          4
		((android.content.res.Resources.NotFoundException) (obj1)).initCause(((Throwable) (context1)));
	//   72  154:aload           4
	//   73  156:aload_0         
	//   74  157:invokevirtual   #458 <Method Throwable android.content.res.Resources$NotFoundException.initCause(Throwable)>
	//   75  160:pop             
		throw obj1;
	//   76  161:aload           4
	//   77  163:athrow          
	}

	private void drawCheckedIcon(Canvas canvas, Rect rect)
	{
		if(showsCheckedIcon())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #273 <Method boolean showsCheckedIcon()>
	//*   2    4:ifeq            82
		{
			calculateChipIconBounds(rect, rectF);
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #140 <Field RectF rectF>
	//    7   13:invokespecial   #463 <Method void calculateChipIconBounds(Rect, RectF)>
			float f = rectF.left;
	//    8   16:aload_0         
	//    9   17:getfield        #140 <Field RectF rectF>
	//   10   20:getfield        #284 <Field float RectF.left>
	//   11   23:fstore_3        
			float f1 = rectF.top;
	//   12   24:aload_0         
	//   13   25:getfield        #140 <Field RectF rectF>
	//   14   28:getfield        #298 <Field float RectF.top>
	//   15   31:fstore          4
			canvas.translate(f, f1);
	//   16   33:aload_1         
	//   17   34:fload_3         
	//   18   35:fload           4
	//   19   37:invokevirtual   #469 <Method void Canvas.translate(float, float)>
			checkedIcon.setBounds(0, 0, (int)rectF.width(), (int)rectF.height());
	//   20   40:aload_0         
	//   21   41:getfield        #363 <Field Drawable checkedIcon>
	//   22   44:iconst_0        
	//   23   45:iconst_0        
	//   24   46:aload_0         
	//   25   47:getfield        #140 <Field RectF rectF>
	//   26   50:invokevirtual   #472 <Method float RectF.width()>
	//   27   53:f2i             
	//   28   54:aload_0         
	//   29   55:getfield        #140 <Field RectF rectF>
	//   30   58:invokevirtual   #475 <Method float RectF.height()>
	//   31   61:f2i             
	//   32   62:invokevirtual   #479 <Method void Drawable.setBounds(int, int, int, int)>
			checkedIcon.draw(canvas);
	//   33   65:aload_0         
	//   34   66:getfield        #363 <Field Drawable checkedIcon>
	//   35   69:aload_1         
	//   36   70:invokevirtual   #483 <Method void Drawable.draw(Canvas)>
			canvas.translate(-f, -f1);
	//   37   73:aload_1         
	//   38   74:fload_3         
	//   39   75:fneg            
	//   40   76:fload           4
	//   41   78:fneg            
	//   42   79:invokevirtual   #469 <Method void Canvas.translate(float, float)>
		}
	//   43   82:return          
	}

	private void drawChipBackground(Canvas canvas, Rect rect)
	{
		chipPaint.setColor(currentChipBackgroundColor);
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field Paint chipPaint>
	//    2    4:aload_0         
	//    3    5:getfield        #486 <Field int currentChipBackgroundColor>
	//    4    8:invokevirtual   #489 <Method void Paint.setColor(int)>
		chipPaint.setStyle(android.graphics.Paint.Style.FILL);
	//    5   11:aload_0         
	//    6   12:getfield        #130 <Field Paint chipPaint>
	//    7   15:getstatic       #492 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//    8   18:invokevirtual   #199 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		chipPaint.setColorFilter(getTintColorFilter());
	//    9   21:aload_0         
	//   10   22:getfield        #130 <Field Paint chipPaint>
	//   11   25:aload_0         
	//   12   26:invokespecial   #496 <Method ColorFilter getTintColorFilter()>
	//   13   29:invokevirtual   #500 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//   14   32:pop             
		rectF.set(rect);
	//   15   33:aload_0         
	//   16   34:getfield        #140 <Field RectF rectF>
	//   17   37:aload_2         
	//   18   38:invokevirtual   #306 <Method void RectF.set(Rect)>
		rect = ((Rect) (rectF));
	//   19   41:aload_0         
	//   20   42:getfield        #140 <Field RectF rectF>
	//   21   45:astore_2        
		float f = chipCornerRadius;
	//   22   46:aload_0         
	//   23   47:getfield        #502 <Field float chipCornerRadius>
	//   24   50:fstore_3        
		canvas.drawRoundRect(((RectF) (rect)), f, f, chipPaint);
	//   25   51:aload_1         
	//   26   52:aload_2         
	//   27   53:fload_3         
	//   28   54:fload_3         
	//   29   55:aload_0         
	//   30   56:getfield        #130 <Field Paint chipPaint>
	//   31   59:invokevirtual   #506 <Method void Canvas.drawRoundRect(RectF, float, float, Paint)>
	//   32   62:return          
	}

	private void drawChipIcon(Canvas canvas, Rect rect)
	{
		if(showsChipIcon())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #270 <Method boolean showsChipIcon()>
	//*   2    4:ifeq            82
		{
			calculateChipIconBounds(rect, rectF);
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #140 <Field RectF rectF>
	//    7   13:invokespecial   #463 <Method void calculateChipIconBounds(Rect, RectF)>
			float f = rectF.left;
	//    8   16:aload_0         
	//    9   17:getfield        #140 <Field RectF rectF>
	//   10   20:getfield        #284 <Field float RectF.left>
	//   11   23:fstore_3        
			float f1 = rectF.top;
	//   12   24:aload_0         
	//   13   25:getfield        #140 <Field RectF rectF>
	//   14   28:getfield        #298 <Field float RectF.top>
	//   15   31:fstore          4
			canvas.translate(f, f1);
	//   16   33:aload_1         
	//   17   34:fload_3         
	//   18   35:fload           4
	//   19   37:invokevirtual   #469 <Method void Canvas.translate(float, float)>
			chipIcon.setBounds(0, 0, (int)rectF.width(), (int)rectF.height());
	//   20   40:aload_0         
	//   21   41:getfield        #509 <Field Drawable chipIcon>
	//   22   44:iconst_0        
	//   23   45:iconst_0        
	//   24   46:aload_0         
	//   25   47:getfield        #140 <Field RectF rectF>
	//   26   50:invokevirtual   #472 <Method float RectF.width()>
	//   27   53:f2i             
	//   28   54:aload_0         
	//   29   55:getfield        #140 <Field RectF rectF>
	//   30   58:invokevirtual   #475 <Method float RectF.height()>
	//   31   61:f2i             
	//   32   62:invokevirtual   #479 <Method void Drawable.setBounds(int, int, int, int)>
			chipIcon.draw(canvas);
	//   33   65:aload_0         
	//   34   66:getfield        #509 <Field Drawable chipIcon>
	//   35   69:aload_1         
	//   36   70:invokevirtual   #483 <Method void Drawable.draw(Canvas)>
			canvas.translate(-f, -f1);
	//   37   73:aload_1         
	//   38   74:fload_3         
	//   39   75:fneg            
	//   40   76:fload           4
	//   41   78:fneg            
	//   42   79:invokevirtual   #469 <Method void Canvas.translate(float, float)>
		}
	//   43   82:return          
	}

	private void drawChipStroke(Canvas canvas, Rect rect)
	{
		if(chipStrokeWidth > 0.0F)
	//*   0    0:aload_0         
	//*   1    1:getfield        #512 <Field float chipStrokeWidth>
	//*   2    4:fconst_0        
	//*   3    5:fcmpl           
	//*   4    6:ifle            123
		{
			chipPaint.setColor(currentChipStrokeColor);
	//    5    9:aload_0         
	//    6   10:getfield        #130 <Field Paint chipPaint>
	//    7   13:aload_0         
	//    8   14:getfield        #514 <Field int currentChipStrokeColor>
	//    9   17:invokevirtual   #489 <Method void Paint.setColor(int)>
			chipPaint.setStyle(android.graphics.Paint.Style.STROKE);
	//   10   20:aload_0         
	//   11   21:getfield        #130 <Field Paint chipPaint>
	//   12   24:getstatic       #195 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   13   27:invokevirtual   #199 <Method void Paint.setStyle(android.graphics.Paint$Style)>
			chipPaint.setColorFilter(getTintColorFilter());
	//   14   30:aload_0         
	//   15   31:getfield        #130 <Field Paint chipPaint>
	//   16   34:aload_0         
	//   17   35:invokespecial   #496 <Method ColorFilter getTintColorFilter()>
	//   18   38:invokevirtual   #500 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//   19   41:pop             
			rectF.set((float)rect.left + chipStrokeWidth / 2.0F, (float)rect.top + chipStrokeWidth / 2.0F, (float)rect.right - chipStrokeWidth / 2.0F, (float)rect.bottom - chipStrokeWidth / 2.0F);
	//   20   42:aload_0         
	//   21   43:getfield        #140 <Field RectF rectF>
	//   22   46:aload_2         
	//   23   47:getfield        #282 <Field int Rect.left>
	//   24   50:i2f             
	//   25   51:aload_0         
	//   26   52:getfield        #512 <Field float chipStrokeWidth>
	//   27   55:fconst_2        
	//   28   56:fdiv            
	//   29   57:fadd            
	//   30   58:aload_2         
	//   31   59:getfield        #323 <Field int Rect.top>
	//   32   62:i2f             
	//   33   63:aload_0         
	//   34   64:getfield        #512 <Field float chipStrokeWidth>
	//   35   67:fconst_2        
	//   36   68:fdiv            
	//   37   69:fadd            
	//   38   70:aload_2         
	//   39   71:getfield        #291 <Field int Rect.right>
	//   40   74:i2f             
	//   41   75:aload_0         
	//   42   76:getfield        #512 <Field float chipStrokeWidth>
	//   43   79:fconst_2        
	//   44   80:fdiv            
	//   45   81:fsub            
	//   46   82:aload_2         
	//   47   83:getfield        #325 <Field int Rect.bottom>
	//   48   86:i2f             
	//   49   87:aload_0         
	//   50   88:getfield        #512 <Field float chipStrokeWidth>
	//   51   91:fconst_2        
	//   52   92:fdiv            
	//   53   93:fsub            
	//   54   94:invokevirtual   #517 <Method void RectF.set(float, float, float, float)>
			float f = chipCornerRadius - chipStrokeWidth / 2.0F;
	//   55   97:aload_0         
	//   56   98:getfield        #502 <Field float chipCornerRadius>
	//   57  101:aload_0         
	//   58  102:getfield        #512 <Field float chipStrokeWidth>
	//   59  105:fconst_2        
	//   60  106:fdiv            
	//   61  107:fsub            
	//   62  108:fstore_3        
			canvas.drawRoundRect(rectF, f, f, chipPaint);
	//   63  109:aload_1         
	//   64  110:aload_0         
	//   65  111:getfield        #140 <Field RectF rectF>
	//   66  114:fload_3         
	//   67  115:fload_3         
	//   68  116:aload_0         
	//   69  117:getfield        #130 <Field Paint chipPaint>
	//   70  120:invokevirtual   #506 <Method void Canvas.drawRoundRect(RectF, float, float, Paint)>
		}
	//   71  123:return          
	}

	private void drawCloseIcon(Canvas canvas, Rect rect)
	{
		if(showsCloseIcon())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #309 <Method boolean showsCloseIcon()>
	//*   2    4:ifeq            82
		{
			calculateCloseIconBounds(rect, rectF);
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #140 <Field RectF rectF>
	//    7   13:invokespecial   #520 <Method void calculateCloseIconBounds(Rect, RectF)>
			float f = rectF.left;
	//    8   16:aload_0         
	//    9   17:getfield        #140 <Field RectF rectF>
	//   10   20:getfield        #284 <Field float RectF.left>
	//   11   23:fstore_3        
			float f1 = rectF.top;
	//   12   24:aload_0         
	//   13   25:getfield        #140 <Field RectF rectF>
	//   14   28:getfield        #298 <Field float RectF.top>
	//   15   31:fstore          4
			canvas.translate(f, f1);
	//   16   33:aload_1         
	//   17   34:fload_3         
	//   18   35:fload           4
	//   19   37:invokevirtual   #469 <Method void Canvas.translate(float, float)>
			closeIcon.setBounds(0, 0, (int)rectF.width(), (int)rectF.height());
	//   20   40:aload_0         
	//   21   41:getfield        #244 <Field Drawable closeIcon>
	//   22   44:iconst_0        
	//   23   45:iconst_0        
	//   24   46:aload_0         
	//   25   47:getfield        #140 <Field RectF rectF>
	//   26   50:invokevirtual   #472 <Method float RectF.width()>
	//   27   53:f2i             
	//   28   54:aload_0         
	//   29   55:getfield        #140 <Field RectF rectF>
	//   30   58:invokevirtual   #475 <Method float RectF.height()>
	//   31   61:f2i             
	//   32   62:invokevirtual   #479 <Method void Drawable.setBounds(int, int, int, int)>
			closeIcon.draw(canvas);
	//   33   65:aload_0         
	//   34   66:getfield        #244 <Field Drawable closeIcon>
	//   35   69:aload_1         
	//   36   70:invokevirtual   #483 <Method void Drawable.draw(Canvas)>
			canvas.translate(-f, -f1);
	//   37   73:aload_1         
	//   38   74:fload_3         
	//   39   75:fneg            
	//   40   76:fload           4
	//   41   78:fneg            
	//   42   79:invokevirtual   #469 <Method void Canvas.translate(float, float)>
		}
	//   43   82:return          
	}

	private void drawCompatRipple(Canvas canvas, Rect rect)
	{
		chipPaint.setColor(currentCompatRippleColor);
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field Paint chipPaint>
	//    2    4:aload_0         
	//    3    5:getfield        #523 <Field int currentCompatRippleColor>
	//    4    8:invokevirtual   #489 <Method void Paint.setColor(int)>
		chipPaint.setStyle(android.graphics.Paint.Style.FILL);
	//    5   11:aload_0         
	//    6   12:getfield        #130 <Field Paint chipPaint>
	//    7   15:getstatic       #492 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//    8   18:invokevirtual   #199 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		rectF.set(rect);
	//    9   21:aload_0         
	//   10   22:getfield        #140 <Field RectF rectF>
	//   11   25:aload_2         
	//   12   26:invokevirtual   #306 <Method void RectF.set(Rect)>
		rect = ((Rect) (rectF));
	//   13   29:aload_0         
	//   14   30:getfield        #140 <Field RectF rectF>
	//   15   33:astore_2        
		float f = chipCornerRadius;
	//   16   34:aload_0         
	//   17   35:getfield        #502 <Field float chipCornerRadius>
	//   18   38:fstore_3        
		canvas.drawRoundRect(((RectF) (rect)), f, f, chipPaint);
	//   19   39:aload_1         
	//   20   40:aload_2         
	//   21   41:fload_3         
	//   22   42:fload_3         
	//   23   43:aload_0         
	//   24   44:getfield        #130 <Field Paint chipPaint>
	//   25   47:invokevirtual   #506 <Method void Canvas.drawRoundRect(RectF, float, float, Paint)>
	//   26   50:return          
	}

	private void drawDebug(Canvas canvas, Rect rect)
	{
		Paint paint = debugPaint;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field Paint debugPaint>
	//    2    4:astore_3        
		if(paint != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          198
		{
			paint.setColor(ColorUtils.setAlphaComponent(0xff000000, 127));
	//    5    9:aload_3         
	//    6   10:ldc2            #525 <Int 0xff000000>
	//    7   13:bipush          127
	//    8   15:invokestatic    #531 <Method int ColorUtils.setAlphaComponent(int, int)>
	//    9   18:invokevirtual   #489 <Method void Paint.setColor(int)>
			canvas.drawRect(rect, debugPaint);
	//   10   21:aload_1         
	//   11   22:aload_2         
	//   12   23:aload_0         
	//   13   24:getfield        #189 <Field Paint debugPaint>
	//   14   27:invokevirtual   #535 <Method void Canvas.drawRect(Rect, Paint)>
			if(showsChipIcon() || showsCheckedIcon())
	//*  15   30:aload_0         
	//*  16   31:invokespecial   #270 <Method boolean showsChipIcon()>
	//*  17   34:ifne            44
	//*  18   37:aload_0         
	//*  19   38:invokespecial   #273 <Method boolean showsCheckedIcon()>
	//*  20   41:ifeq            65
			{
				calculateChipIconBounds(rect, rectF);
	//   21   44:aload_0         
	//   22   45:aload_2         
	//   23   46:aload_0         
	//   24   47:getfield        #140 <Field RectF rectF>
	//   25   50:invokespecial   #463 <Method void calculateChipIconBounds(Rect, RectF)>
				canvas.drawRect(rectF, debugPaint);
	//   26   53:aload_1         
	//   27   54:aload_0         
	//   28   55:getfield        #140 <Field RectF rectF>
	//   29   58:aload_0         
	//   30   59:getfield        #189 <Field Paint debugPaint>
	//   31   62:invokevirtual   #538 <Method void Canvas.drawRect(RectF, Paint)>
			}
			if(unicodeWrappedText != null)
	//*  32   65:aload_0         
	//*  33   66:getfield        #329 <Field CharSequence unicodeWrappedText>
	//*  34   69:ifnull          98
				canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), debugPaint);
	//   35   72:aload_1         
	//   36   73:aload_2         
	//   37   74:getfield        #282 <Field int Rect.left>
	//   38   77:i2f             
	//   39   78:aload_2         
	//   40   79:invokevirtual   #295 <Method float Rect.exactCenterY()>
	//   41   82:aload_2         
	//   42   83:getfield        #291 <Field int Rect.right>
	//   43   86:i2f             
	//   44   87:aload_2         
	//   45   88:invokevirtual   #295 <Method float Rect.exactCenterY()>
	//   46   91:aload_0         
	//   47   92:getfield        #189 <Field Paint debugPaint>
	//   48   95:invokevirtual   #542 <Method void Canvas.drawLine(float, float, float, float, Paint)>
			if(showsCloseIcon())
	//*  49   98:aload_0         
	//*  50   99:invokespecial   #309 <Method boolean showsCloseIcon()>
	//*  51  102:ifeq            126
			{
				calculateCloseIconBounds(rect, rectF);
	//   52  105:aload_0         
	//   53  106:aload_2         
	//   54  107:aload_0         
	//   55  108:getfield        #140 <Field RectF rectF>
	//   56  111:invokespecial   #520 <Method void calculateCloseIconBounds(Rect, RectF)>
				canvas.drawRect(rectF, debugPaint);
	//   57  114:aload_1         
	//   58  115:aload_0         
	//   59  116:getfield        #140 <Field RectF rectF>
	//   60  119:aload_0         
	//   61  120:getfield        #189 <Field Paint debugPaint>
	//   62  123:invokevirtual   #538 <Method void Canvas.drawRect(RectF, Paint)>
			}
			debugPaint.setColor(ColorUtils.setAlphaComponent(0xffff0000, 127));
	//   63  126:aload_0         
	//   64  127:getfield        #189 <Field Paint debugPaint>
	//   65  130:ldc2            #543 <Int 0xffff0000>
	//   66  133:bipush          127
	//   67  135:invokestatic    #531 <Method int ColorUtils.setAlphaComponent(int, int)>
	//   68  138:invokevirtual   #489 <Method void Paint.setColor(int)>
			calculateChipTouchBounds(rect, rectF);
	//   69  141:aload_0         
	//   70  142:aload_2         
	//   71  143:aload_0         
	//   72  144:getfield        #140 <Field RectF rectF>
	//   73  147:invokespecial   #545 <Method void calculateChipTouchBounds(Rect, RectF)>
			canvas.drawRect(rectF, debugPaint);
	//   74  150:aload_1         
	//   75  151:aload_0         
	//   76  152:getfield        #140 <Field RectF rectF>
	//   77  155:aload_0         
	//   78  156:getfield        #189 <Field Paint debugPaint>
	//   79  159:invokevirtual   #538 <Method void Canvas.drawRect(RectF, Paint)>
			debugPaint.setColor(ColorUtils.setAlphaComponent(0xff00ff00, 127));
	//   80  162:aload_0         
	//   81  163:getfield        #189 <Field Paint debugPaint>
	//   82  166:ldc2            #546 <Int 0xff00ff00>
	//   83  169:bipush          127
	//   84  171:invokestatic    #531 <Method int ColorUtils.setAlphaComponent(int, int)>
	//   85  174:invokevirtual   #489 <Method void Paint.setColor(int)>
			calculateCloseIconTouchBounds(rect, rectF);
	//   86  177:aload_0         
	//   87  178:aload_2         
	//   88  179:aload_0         
	//   89  180:getfield        #140 <Field RectF rectF>
	//   90  183:invokespecial   #548 <Method void calculateCloseIconTouchBounds(Rect, RectF)>
			canvas.drawRect(rectF, debugPaint);
	//   91  186:aload_1         
	//   92  187:aload_0         
	//   93  188:getfield        #140 <Field RectF rectF>
	//   94  191:aload_0         
	//   95  192:getfield        #189 <Field Paint debugPaint>
	//   96  195:invokevirtual   #538 <Method void Canvas.drawRect(RectF, Paint)>
		}
	//   97  198:return          
	}

	private void drawText(Canvas canvas, Rect rect)
	{
		if(unicodeWrappedText != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #329 <Field CharSequence unicodeWrappedText>
	//*   2    4:ifnull          207
		{
			android.graphics.Paint.Align align = calculateTextOriginAndAlignment(rect, pointF);
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #145 <Field PointF pointF>
	//    7   13:invokevirtual   #553 <Method android.graphics.Paint$Align calculateTextOriginAndAlignment(Rect, PointF)>
	//    8   16:astore          6
			calculateTextBounds(rect, rectF);
	//    9   18:aload_0         
	//   10   19:aload_2         
	//   11   20:aload_0         
	//   12   21:getfield        #140 <Field RectF rectF>
	//   13   24:invokespecial   #555 <Method void calculateTextBounds(Rect, RectF)>
			if(textAppearance != null)
	//*  14   27:aload_0         
	//*  15   28:getfield        #557 <Field TextAppearance textAppearance>
	//*  16   31:ifnull          64
			{
				textPaint.drawableState = getState();
	//   17   34:aload_0         
	//   18   35:getfield        #125 <Field TextPaint textPaint>
	//   19   38:aload_0         
	//   20   39:invokevirtual   #261 <Method int[] getState()>
	//   21   42:putfield        #560 <Field int[] TextPaint.drawableState>
				textAppearance.updateDrawState(context, textPaint, fontCallback);
	//   22   45:aload_0         
	//   23   46:getfield        #557 <Field TextAppearance textAppearance>
	//   24   49:aload_0         
	//   25   50:getfield        #165 <Field Context context>
	//   26   53:aload_0         
	//   27   54:getfield        #125 <Field TextPaint textPaint>
	//   28   57:aload_0         
	//   29   58:getfield        #118 <Field android.support.v4.content.res.ResourcesCompat$FontCallback fontCallback>
	//   30   61:invokevirtual   #566 <Method void TextAppearance.updateDrawState(Context, TextPaint, android.support.v4.content.res.ResourcesCompat$FontCallback)>
			}
			textPaint.setTextAlign(align);
	//   31   64:aload_0         
	//   32   65:getfield        #125 <Field TextPaint textPaint>
	//   33   68:aload           6
	//   34   70:invokevirtual   #570 <Method void TextPaint.setTextAlign(android.graphics.Paint$Align)>
			int i = Math.round(getTextWidth());
	//   35   73:aload_0         
	//   36   74:invokespecial   #573 <Method float getTextWidth()>
	//   37   77:invokestatic    #579 <Method int Math.round(float)>
	//   38   80:istore_3        
			int k = Math.round(rectF.width());
	//   39   81:aload_0         
	//   40   82:getfield        #140 <Field RectF rectF>
	//   41   85:invokevirtual   #472 <Method float RectF.width()>
	//   42   88:invokestatic    #579 <Method int Math.round(float)>
	//   43   91:istore          5
			int j = 0;
	//   44   93:iconst_0        
	//   45   94:istore          4
			boolean flag;
			if(i > k)
	//*  46   96:iload_3         
	//*  47   97:iload           5
	//*  48   99:icmple          107
				flag = true;
	//   49  102:iconst_1        
	//   50  103:istore_3        
			else
	//*  51  104:goto            109
				flag = false;
	//   52  107:iconst_0        
	//   53  108:istore_3        
			if(flag)
	//*  54  109:iload_3         
	//*  55  110:ifeq            128
			{
				j = canvas.save();
	//   56  113:aload_1         
	//   57  114:invokevirtual   #582 <Method int Canvas.save()>
	//   58  117:istore          4
				canvas.clipRect(rectF);
	//   59  119:aload_1         
	//   60  120:aload_0         
	//   61  121:getfield        #140 <Field RectF rectF>
	//   62  124:invokevirtual   #586 <Method boolean Canvas.clipRect(RectF)>
	//   63  127:pop             
			}
			rect = ((Rect) (unicodeWrappedText));
	//   64  128:aload_0         
	//   65  129:getfield        #329 <Field CharSequence unicodeWrappedText>
	//   66  132:astore_2        
			if(flag && truncateAt != null)
	//*  67  133:iload_3         
	//*  68  134:ifeq            167
	//*  69  137:aload_0         
	//*  70  138:getfield        #588 <Field android.text.TextUtils$TruncateAt truncateAt>
	//*  71  141:ifnull          167
				rect = ((Rect) (TextUtils.ellipsize(((CharSequence) (rect)), textPaint, rectF.width(), truncateAt)));
	//   72  144:aload_2         
	//   73  145:aload_0         
	//   74  146:getfield        #125 <Field TextPaint textPaint>
	//   75  149:aload_0         
	//   76  150:getfield        #140 <Field RectF rectF>
	//   77  153:invokevirtual   #472 <Method float RectF.width()>
	//   78  156:aload_0         
	//   79  157:getfield        #588 <Field android.text.TextUtils$TruncateAt truncateAt>
	//   80  160:invokestatic    #592 <Method CharSequence TextUtils.ellipsize(CharSequence, TextPaint, float, android.text.TextUtils$TruncateAt)>
	//   81  163:astore_2        
	//*  82  164:goto            167
			canvas.drawText(((CharSequence) (rect)), 0, ((CharSequence) (rect)).length(), pointF.x, pointF.y, ((Paint) (textPaint)));
	//   83  167:aload_1         
	//   84  168:aload_2         
	//   85  169:iconst_0        
	//   86  170:aload_2         
	//   87  171:invokeinterface #354 <Method int CharSequence.length()>
	//   88  176:aload_0         
	//   89  177:getfield        #145 <Field PointF pointF>
	//   90  180:getfield        #595 <Field float PointF.x>
	//   91  183:aload_0         
	//   92  184:getfield        #145 <Field PointF pointF>
	//   93  187:getfield        #598 <Field float PointF.y>
	//   94  190:aload_0         
	//   95  191:getfield        #125 <Field TextPaint textPaint>
	//   96  194:invokevirtual   #601 <Method void Canvas.drawText(CharSequence, int, int, float, float, Paint)>
			if(flag)
	//*  97  197:iload_3         
	//*  98  198:ifeq            207
				canvas.restoreToCount(j);
	//   99  201:aload_1         
	//  100  202:iload           4
	//  101  204:invokevirtual   #604 <Method void Canvas.restoreToCount(int)>
		}
	//  102  207:return          
	}

	private float getTextWidth()
	{
		if(!textWidthDirty)
	//*   0    0:aload_0         
	//*   1    1:getfield        #163 <Field boolean textWidthDirty>
	//*   2    4:ifne            12
		{
			return textWidth;
	//    3    7:aload_0         
	//    4    8:getfield        #606 <Field float textWidth>
	//    5   11:freturn         
		} else
		{
			textWidth = calculateTextWidth(unicodeWrappedText);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #329 <Field CharSequence unicodeWrappedText>
	//   10   18:invokespecial   #608 <Method float calculateTextWidth(CharSequence)>
	//   11   21:putfield        #606 <Field float textWidth>
			textWidthDirty = false;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #163 <Field boolean textWidthDirty>
			return textWidth;
	//   15   29:aload_0         
	//   16   30:getfield        #606 <Field float textWidth>
	//   17   33:freturn         
		}
	}

	private ColorFilter getTintColorFilter()
	{
		ColorFilter colorfilter = colorFilter;
	//    0    0:aload_0         
	//    1    1:getfield        #610 <Field ColorFilter colorFilter>
	//    2    4:astore_1        
		if(colorfilter != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return colorfilter;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			return ((ColorFilter) (tintFilter));
	//    7   11:aload_0         
	//    8   12:getfield        #612 <Field PorterDuffColorFilter tintFilter>
	//    9   15:areturn         
	}

	private static boolean hasState(int ai[], int i)
	{
		if(ai == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		int k = ai.length;
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:istore_3        
		for(int j = 0; j < k; j++)
	//*   7    9:iconst_0        
	//*   8   10:istore_2        
	//*   9   11:iload_2         
	//*  10   12:iload_3         
	//*  11   13:icmpge          32
			if(ai[j] == i)
	//*  12   16:aload_0         
	//*  13   17:iload_2         
	//*  14   18:iaload          
	//*  15   19:iload_1         
	//*  16   20:icmpne          25
				return true;
	//   17   23:iconst_1        
	//   18   24:ireturn         

	//   19   25:iload_2         
	//   20   26:iconst_1        
	//   21   27:iadd            
	//   22   28:istore_2        
	//*  23   29:goto            11
		return false;
	//   24   32:iconst_0        
	//   25   33:ireturn         
	}

	private static boolean isStateful(ColorStateList colorstatelist)
	{
		return colorstatelist != null && colorstatelist.isStateful();
	//    0    0:aload_0         
	//    1    1:ifnull          13
	//    2    4:aload_0         
	//    3    5:invokevirtual   #619 <Method boolean ColorStateList.isStateful()>
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private static boolean isStateful(Drawable drawable)
	{
		return drawable != null && drawable.isStateful();
	//    0    0:aload_0         
	//    1    1:ifnull          13
	//    2    4:aload_0         
	//    3    5:invokevirtual   #247 <Method boolean Drawable.isStateful()>
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private static boolean isStateful(TextAppearance textappearance)
	{
		return textappearance != null && textappearance.textColor != null && textappearance.textColor.isStateful();
	//    0    0:aload_0         
	//    1    1:ifnull          23
	//    2    4:aload_0         
	//    3    5:getfield        #624 <Field ColorStateList TextAppearance.textColor>
	//    4    8:ifnull          23
	//    5   11:aload_0         
	//    6   12:getfield        #624 <Field ColorStateList TextAppearance.textColor>
	//    7   15:invokevirtual   #619 <Method boolean ColorStateList.isStateful()>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	private void loadFromAttributes(AttributeSet attributeset, int i, int j)
	{
		TypedArray typedarray = ThemeEnforcement.obtainStyledAttributes(context, attributeset, android.support.design.R.styleable.Chip, i, j, new int[0]);
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field Context context>
	//    2    4:aload_1         
	//    3    5:getstatic       #629 <Field int[] android.support.design.R$styleable.Chip>
	//    4    8:iload_2         
	//    5    9:iload_3         
	//    6   10:iconst_0        
	//    7   11:newarray        int[]
	//    8   13:invokestatic    #635 <Method TypedArray ThemeEnforcement.obtainStyledAttributes(Context, AttributeSet, int[], int, int, int[])>
	//    9   16:astore          4
		setChipBackgroundColor(MaterialResources.getColorStateList(context, typedarray, android.support.design.R.styleable.Chip_chipBackgroundColor));
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #165 <Field Context context>
	//   13   23:aload           4
	//   14   25:getstatic       #638 <Field int android.support.design.R$styleable.Chip_chipBackgroundColor>
	//   15   28:invokestatic    #644 <Method ColorStateList MaterialResources.getColorStateList(Context, TypedArray, int)>
	//   16   31:invokevirtual   #648 <Method void setChipBackgroundColor(ColorStateList)>
		setChipMinHeight(typedarray.getDimension(android.support.design.R.styleable.Chip_chipMinHeight, 0.0F));
	//   17   34:aload_0         
	//   18   35:aload           4
	//   19   37:getstatic       #651 <Field int android.support.design.R$styleable.Chip_chipMinHeight>
	//   20   40:fconst_0        
	//   21   41:invokevirtual   #657 <Method float TypedArray.getDimension(int, float)>
	//   22   44:invokevirtual   #661 <Method void setChipMinHeight(float)>
		setChipCornerRadius(typedarray.getDimension(android.support.design.R.styleable.Chip_chipCornerRadius, 0.0F));
	//   23   47:aload_0         
	//   24   48:aload           4
	//   25   50:getstatic       #664 <Field int android.support.design.R$styleable.Chip_chipCornerRadius>
	//   26   53:fconst_0        
	//   27   54:invokevirtual   #657 <Method float TypedArray.getDimension(int, float)>
	//   28   57:invokevirtual   #667 <Method void setChipCornerRadius(float)>
		setChipStrokeColor(MaterialResources.getColorStateList(context, typedarray, android.support.design.R.styleable.Chip_chipStrokeColor));
	//   29   60:aload_0         
	//   30   61:aload_0         
	//   31   62:getfield        #165 <Field Context context>
	//   32   65:aload           4
	//   33   67:getstatic       #670 <Field int android.support.design.R$styleable.Chip_chipStrokeColor>
	//   34   70:invokestatic    #644 <Method ColorStateList MaterialResources.getColorStateList(Context, TypedArray, int)>
	//   35   73:invokevirtual   #673 <Method void setChipStrokeColor(ColorStateList)>
		setChipStrokeWidth(typedarray.getDimension(android.support.design.R.styleable.Chip_chipStrokeWidth, 0.0F));
	//   36   76:aload_0         
	//   37   77:aload           4
	//   38   79:getstatic       #676 <Field int android.support.design.R$styleable.Chip_chipStrokeWidth>
	//   39   82:fconst_0        
	//   40   83:invokevirtual   #657 <Method float TypedArray.getDimension(int, float)>
	//   41   86:invokevirtual   #679 <Method void setChipStrokeWidth(float)>
		setRippleColor(MaterialResources.getColorStateList(context, typedarray, android.support.design.R.styleable.Chip_rippleColor));
	//   42   89:aload_0         
	//   43   90:aload_0         
	//   44   91:getfield        #165 <Field Context context>
	//   45   94:aload           4
	//   46   96:getstatic       #682 <Field int android.support.design.R$styleable.Chip_rippleColor>
	//   47   99:invokestatic    #644 <Method ColorStateList MaterialResources.getColorStateList(Context, TypedArray, int)>
	//   48  102:invokevirtual   #685 <Method void setRippleColor(ColorStateList)>
		setText(typedarray.getText(android.support.design.R.styleable.Chip_android_text));
	//   49  105:aload_0         
	//   50  106:aload           4
	//   51  108:getstatic       #688 <Field int android.support.design.R$styleable.Chip_android_text>
	//   52  111:invokevirtual   #692 <Method CharSequence TypedArray.getText(int)>
	//   53  114:invokevirtual   #696 <Method void setText(CharSequence)>
		setTextAppearance(MaterialResources.getTextAppearance(context, typedarray, android.support.design.R.styleable.Chip_android_textAppearance));
	//   54  117:aload_0         
	//   55  118:aload_0         
	//   56  119:getfield        #165 <Field Context context>
	//   57  122:aload           4
	//   58  124:getstatic       #699 <Field int android.support.design.R$styleable.Chip_android_textAppearance>
	//   59  127:invokestatic    #703 <Method TextAppearance MaterialResources.getTextAppearance(Context, TypedArray, int)>
	//   60  130:invokevirtual   #707 <Method void setTextAppearance(TextAppearance)>
		switch(typedarray.getInt(android.support.design.R.styleable.Chip_android_ellipsize, 0))
	//*  61  133:aload           4
	//*  62  135:getstatic       #710 <Field int android.support.design.R$styleable.Chip_android_ellipsize>
	//*  63  138:iconst_0        
	//*  64  139:invokevirtual   #713 <Method int TypedArray.getInt(int, int)>
		{
	//*  65  142:tableswitch     1 3: default 168
	//	               1 191
	//	               2 181
	//	               3 171
	//*  66  168:goto            198
		case 3: // '\003'
			setEllipsize(android.text.TextUtils.TruncateAt.END);
	//   67  171:aload_0         
	//   68  172:getstatic       #718 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//   69  175:invokevirtual   #722 <Method void setEllipsize(android.text.TextUtils$TruncateAt)>
			break;

	//*  70  178:goto            198
		case 2: // '\002'
			setEllipsize(android.text.TextUtils.TruncateAt.MIDDLE);
	//   71  181:aload_0         
	//   72  182:getstatic       #725 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.MIDDLE>
	//   73  185:invokevirtual   #722 <Method void setEllipsize(android.text.TextUtils$TruncateAt)>
			break;

	//*  74  188:goto            198
		case 1: // '\001'
			setEllipsize(android.text.TextUtils.TruncateAt.START);
	//   75  191:aload_0         
	//   76  192:getstatic       #728 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.START>
	//   77  195:invokevirtual   #722 <Method void setEllipsize(android.text.TextUtils$TruncateAt)>
			break;
		}
		setChipIconVisible(typedarray.getBoolean(android.support.design.R.styleable.Chip_chipIconVisible, false));
	//   78  198:aload_0         
	//   79  199:aload           4
	//   80  201:getstatic       #731 <Field int android.support.design.R$styleable.Chip_chipIconVisible>
	//   81  204:iconst_0        
	//   82  205:invokevirtual   #735 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   83  208:invokevirtual   #739 <Method void setChipIconVisible(boolean)>
		if(attributeset != null && attributeset.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeset.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null)
	//*  84  211:aload_1         
	//*  85  212:ifnull          256
	//*  86  215:aload_1         
	//*  87  216:ldc1            #22  <String "http://schemas.android.com/apk/res-auto">
	//*  88  218:ldc2            #741 <String "chipIconEnabled">
	//*  89  221:invokeinterface #745 <Method String AttributeSet.getAttributeValue(String, String)>
	//*  90  226:ifnull          256
	//*  91  229:aload_1         
	//*  92  230:ldc1            #22  <String "http://schemas.android.com/apk/res-auto">
	//*  93  232:ldc2            #746 <String "chipIconVisible">
	//*  94  235:invokeinterface #745 <Method String AttributeSet.getAttributeValue(String, String)>
	//*  95  240:ifnonnull       256
			setChipIconVisible(typedarray.getBoolean(android.support.design.R.styleable.Chip_chipIconEnabled, false));
	//   96  243:aload_0         
	//   97  244:aload           4
	//   98  246:getstatic       #749 <Field int android.support.design.R$styleable.Chip_chipIconEnabled>
	//   99  249:iconst_0        
	//  100  250:invokevirtual   #735 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  101  253:invokevirtual   #739 <Method void setChipIconVisible(boolean)>
		setChipIcon(MaterialResources.getDrawable(context, typedarray, android.support.design.R.styleable.Chip_chipIcon));
	//  102  256:aload_0         
	//  103  257:aload_0         
	//  104  258:getfield        #165 <Field Context context>
	//  105  261:aload           4
	//  106  263:getstatic       #752 <Field int android.support.design.R$styleable.Chip_chipIcon>
	//  107  266:invokestatic    #756 <Method Drawable MaterialResources.getDrawable(Context, TypedArray, int)>
	//  108  269:invokevirtual   #759 <Method void setChipIcon(Drawable)>
		setChipIconTint(MaterialResources.getColorStateList(context, typedarray, android.support.design.R.styleable.Chip_chipIconTint));
	//  109  272:aload_0         
	//  110  273:aload_0         
	//  111  274:getfield        #165 <Field Context context>
	//  112  277:aload           4
	//  113  279:getstatic       #762 <Field int android.support.design.R$styleable.Chip_chipIconTint>
	//  114  282:invokestatic    #644 <Method ColorStateList MaterialResources.getColorStateList(Context, TypedArray, int)>
	//  115  285:invokevirtual   #765 <Method void setChipIconTint(ColorStateList)>
		setChipIconSize(typedarray.getDimension(android.support.design.R.styleable.Chip_chipIconSize, 0.0F));
	//  116  288:aload_0         
	//  117  289:aload           4
	//  118  291:getstatic       #768 <Field int android.support.design.R$styleable.Chip_chipIconSize>
	//  119  294:fconst_0        
	//  120  295:invokevirtual   #657 <Method float TypedArray.getDimension(int, float)>
	//  121  298:invokevirtual   #771 <Method void setChipIconSize(float)>
		setCloseIconVisible(typedarray.getBoolean(android.support.design.R.styleable.Chip_closeIconVisible, false));
	//  122  301:aload_0         
	//  123  302:aload           4
	//  124  304:getstatic       #774 <Field int android.support.design.R$styleable.Chip_closeIconVisible>
	//  125  307:iconst_0        
	//  126  308:invokevirtual   #735 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  127  311:invokevirtual   #777 <Method void setCloseIconVisible(boolean)>
		if(attributeset != null && attributeset.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeset.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null)
	//* 128  314:aload_1         
	//* 129  315:ifnull          359
	//* 130  318:aload_1         
	//* 131  319:ldc1            #22  <String "http://schemas.android.com/apk/res-auto">
	//* 132  321:ldc2            #779 <String "closeIconEnabled">
	//* 133  324:invokeinterface #745 <Method String AttributeSet.getAttributeValue(String, String)>
	//* 134  329:ifnull          359
	//* 135  332:aload_1         
	//* 136  333:ldc1            #22  <String "http://schemas.android.com/apk/res-auto">
	//* 137  335:ldc2            #780 <String "closeIconVisible">
	//* 138  338:invokeinterface #745 <Method String AttributeSet.getAttributeValue(String, String)>
	//* 139  343:ifnonnull       359
			setCloseIconVisible(typedarray.getBoolean(android.support.design.R.styleable.Chip_closeIconEnabled, false));
	//  140  346:aload_0         
	//  141  347:aload           4
	//  142  349:getstatic       #783 <Field int android.support.design.R$styleable.Chip_closeIconEnabled>
	//  143  352:iconst_0        
	//  144  353:invokevirtual   #735 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  145  356:invokevirtual   #777 <Method void setCloseIconVisible(boolean)>
		setCloseIcon(MaterialResources.getDrawable(context, typedarray, android.support.design.R.styleable.Chip_closeIcon));
	//  146  359:aload_0         
	//  147  360:aload_0         
	//  148  361:getfield        #165 <Field Context context>
	//  149  364:aload           4
	//  150  366:getstatic       #786 <Field int android.support.design.R$styleable.Chip_closeIcon>
	//  151  369:invokestatic    #756 <Method Drawable MaterialResources.getDrawable(Context, TypedArray, int)>
	//  152  372:invokevirtual   #789 <Method void setCloseIcon(Drawable)>
		setCloseIconTint(MaterialResources.getColorStateList(context, typedarray, android.support.design.R.styleable.Chip_closeIconTint));
	//  153  375:aload_0         
	//  154  376:aload_0         
	//  155  377:getfield        #165 <Field Context context>
	//  156  380:aload           4
	//  157  382:getstatic       #792 <Field int android.support.design.R$styleable.Chip_closeIconTint>
	//  158  385:invokestatic    #644 <Method ColorStateList MaterialResources.getColorStateList(Context, TypedArray, int)>
	//  159  388:invokevirtual   #795 <Method void setCloseIconTint(ColorStateList)>
		setCloseIconSize(typedarray.getDimension(android.support.design.R.styleable.Chip_closeIconSize, 0.0F));
	//  160  391:aload_0         
	//  161  392:aload           4
	//  162  394:getstatic       #798 <Field int android.support.design.R$styleable.Chip_closeIconSize>
	//  163  397:fconst_0        
	//  164  398:invokevirtual   #657 <Method float TypedArray.getDimension(int, float)>
	//  165  401:invokevirtual   #801 <Method void setCloseIconSize(float)>
		setCheckable(typedarray.getBoolean(android.support.design.R.styleable.Chip_android_checkable, false));
	//  166  404:aload_0         
	//  167  405:aload           4
	//  168  407:getstatic       #804 <Field int android.support.design.R$styleable.Chip_android_checkable>
	//  169  410:iconst_0        
	//  170  411:invokevirtual   #735 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  171  414:invokevirtual   #807 <Method void setCheckable(boolean)>
		setCheckedIconVisible(typedarray.getBoolean(android.support.design.R.styleable.Chip_checkedIconVisible, false));
	//  172  417:aload_0         
	//  173  418:aload           4
	//  174  420:getstatic       #810 <Field int android.support.design.R$styleable.Chip_checkedIconVisible>
	//  175  423:iconst_0        
	//  176  424:invokevirtual   #735 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  177  427:invokevirtual   #813 <Method void setCheckedIconVisible(boolean)>
		if(attributeset != null && attributeset.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeset.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null)
	//* 178  430:aload_1         
	//* 179  431:ifnull          475
	//* 180  434:aload_1         
	//* 181  435:ldc1            #22  <String "http://schemas.android.com/apk/res-auto">
	//* 182  437:ldc2            #815 <String "checkedIconEnabled">
	//* 183  440:invokeinterface #745 <Method String AttributeSet.getAttributeValue(String, String)>
	//* 184  445:ifnull          475
	//* 185  448:aload_1         
	//* 186  449:ldc1            #22  <String "http://schemas.android.com/apk/res-auto">
	//* 187  451:ldc2            #816 <String "checkedIconVisible">
	//* 188  454:invokeinterface #745 <Method String AttributeSet.getAttributeValue(String, String)>
	//* 189  459:ifnonnull       475
			setCheckedIconVisible(typedarray.getBoolean(android.support.design.R.styleable.Chip_checkedIconEnabled, false));
	//  190  462:aload_0         
	//  191  463:aload           4
	//  192  465:getstatic       #819 <Field int android.support.design.R$styleable.Chip_checkedIconEnabled>
	//  193  468:iconst_0        
	//  194  469:invokevirtual   #735 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  195  472:invokevirtual   #813 <Method void setCheckedIconVisible(boolean)>
		setCheckedIcon(MaterialResources.getDrawable(context, typedarray, android.support.design.R.styleable.Chip_checkedIcon));
	//  196  475:aload_0         
	//  197  476:aload_0         
	//  198  477:getfield        #165 <Field Context context>
	//  199  480:aload           4
	//  200  482:getstatic       #822 <Field int android.support.design.R$styleable.Chip_checkedIcon>
	//  201  485:invokestatic    #756 <Method Drawable MaterialResources.getDrawable(Context, TypedArray, int)>
	//  202  488:invokevirtual   #825 <Method void setCheckedIcon(Drawable)>
		setShowMotionSpec(MotionSpec.createFromAttribute(context, typedarray, android.support.design.R.styleable.Chip_showMotionSpec));
	//  203  491:aload_0         
	//  204  492:aload_0         
	//  205  493:getfield        #165 <Field Context context>
	//  206  496:aload           4
	//  207  498:getstatic       #828 <Field int android.support.design.R$styleable.Chip_showMotionSpec>
	//  208  501:invokestatic    #834 <Method MotionSpec MotionSpec.createFromAttribute(Context, TypedArray, int)>
	//  209  504:invokevirtual   #838 <Method void setShowMotionSpec(MotionSpec)>
		setHideMotionSpec(MotionSpec.createFromAttribute(context, typedarray, android.support.design.R.styleable.Chip_hideMotionSpec));
	//  210  507:aload_0         
	//  211  508:aload_0         
	//  212  509:getfield        #165 <Field Context context>
	//  213  512:aload           4
	//  214  514:getstatic       #841 <Field int android.support.design.R$styleable.Chip_hideMotionSpec>
	//  215  517:invokestatic    #834 <Method MotionSpec MotionSpec.createFromAttribute(Context, TypedArray, int)>
	//  216  520:invokevirtual   #844 <Method void setHideMotionSpec(MotionSpec)>
		setChipStartPadding(typedarray.getDimension(android.support.design.R.styleable.Chip_chipStartPadding, 0.0F));
	//  217  523:aload_0         
	//  218  524:aload           4
	//  219  526:getstatic       #847 <Field int android.support.design.R$styleable.Chip_chipStartPadding>
	//  220  529:fconst_0        
	//  221  530:invokevirtual   #657 <Method float TypedArray.getDimension(int, float)>
	//  222  533:invokevirtual   #850 <Method void setChipStartPadding(float)>
		setIconStartPadding(typedarray.getDimension(android.support.design.R.styleable.Chip_iconStartPadding, 0.0F));
	//  223  536:aload_0         
	//  224  537:aload           4
	//  225  539:getstatic       #853 <Field int android.support.design.R$styleable.Chip_iconStartPadding>
	//  226  542:fconst_0        
	//  227  543:invokevirtual   #657 <Method float TypedArray.getDimension(int, float)>
	//  228  546:invokevirtual   #856 <Method void setIconStartPadding(float)>
		setIconEndPadding(typedarray.getDimension(android.support.design.R.styleable.Chip_iconEndPadding, 0.0F));
	//  229  549:aload_0         
	//  230  550:aload           4
	//  231  552:getstatic       #859 <Field int android.support.design.R$styleable.Chip_iconEndPadding>
	//  232  555:fconst_0        
	//  233  556:invokevirtual   #657 <Method float TypedArray.getDimension(int, float)>
	//  234  559:invokevirtual   #862 <Method void setIconEndPadding(float)>
		setTextStartPadding(typedarray.getDimension(android.support.design.R.styleable.Chip_textStartPadding, 0.0F));
	//  235  562:aload_0         
	//  236  563:aload           4
	//  237  565:getstatic       #865 <Field int android.support.design.R$styleable.Chip_textStartPadding>
	//  238  568:fconst_0        
	//  239  569:invokevirtual   #657 <Method float TypedArray.getDimension(int, float)>
	//  240  572:invokevirtual   #868 <Method void setTextStartPadding(float)>
		setTextEndPadding(typedarray.getDimension(android.support.design.R.styleable.Chip_textEndPadding, 0.0F));
	//  241  575:aload_0         
	//  242  576:aload           4
	//  243  578:getstatic       #871 <Field int android.support.design.R$styleable.Chip_textEndPadding>
	//  244  581:fconst_0        
	//  245  582:invokevirtual   #657 <Method float TypedArray.getDimension(int, float)>
	//  246  585:invokevirtual   #874 <Method void setTextEndPadding(float)>
		setCloseIconStartPadding(typedarray.getDimension(android.support.design.R.styleable.Chip_closeIconStartPadding, 0.0F));
	//  247  588:aload_0         
	//  248  589:aload           4
	//  249  591:getstatic       #877 <Field int android.support.design.R$styleable.Chip_closeIconStartPadding>
	//  250  594:fconst_0        
	//  251  595:invokevirtual   #657 <Method float TypedArray.getDimension(int, float)>
	//  252  598:invokevirtual   #880 <Method void setCloseIconStartPadding(float)>
		setCloseIconEndPadding(typedarray.getDimension(android.support.design.R.styleable.Chip_closeIconEndPadding, 0.0F));
	//  253  601:aload_0         
	//  254  602:aload           4
	//  255  604:getstatic       #883 <Field int android.support.design.R$styleable.Chip_closeIconEndPadding>
	//  256  607:fconst_0        
	//  257  608:invokevirtual   #657 <Method float TypedArray.getDimension(int, float)>
	//  258  611:invokevirtual   #886 <Method void setCloseIconEndPadding(float)>
		setChipEndPadding(typedarray.getDimension(android.support.design.R.styleable.Chip_chipEndPadding, 0.0F));
	//  259  614:aload_0         
	//  260  615:aload           4
	//  261  617:getstatic       #889 <Field int android.support.design.R$styleable.Chip_chipEndPadding>
	//  262  620:fconst_0        
	//  263  621:invokevirtual   #657 <Method float TypedArray.getDimension(int, float)>
	//  264  624:invokevirtual   #892 <Method void setChipEndPadding(float)>
		setMaxWidth(typedarray.getDimensionPixelSize(android.support.design.R.styleable.Chip_android_maxWidth, 0x7fffffff));
	//  265  627:aload_0         
	//  266  628:aload           4
	//  267  630:getstatic       #895 <Field int android.support.design.R$styleable.Chip_android_maxWidth>
	//  268  633:ldc2            #896 <Int 0x7fffffff>
	//  269  636:invokevirtual   #899 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  270  639:invokevirtual   #902 <Method void setMaxWidth(int)>
		typedarray.recycle();
	//  271  642:aload           4
	//  272  644:invokevirtual   #905 <Method void TypedArray.recycle()>
	//  273  647:return          
	}

	private boolean onStateChange(int ai[], int ai1[])
	{
		boolean flag1 = super.onStateChange(ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #909 <Method boolean Drawable.onStateChange(int[])>
	//    3    5:istore          6
		Object obj = ((Object) (chipBackgroundColor));
	//    4    7:aload_0         
	//    5    8:getfield        #911 <Field ColorStateList chipBackgroundColor>
	//    6   11:astore          9
		boolean flag = false;
	//    7   13:iconst_0        
	//    8   14:istore          5
		int i;
		if(obj != null)
	//*   9   16:aload           9
	//*  10   18:ifnull          36
			i = ((ColorStateList) (obj)).getColorForState(ai, currentChipBackgroundColor);
	//   11   21:aload           9
	//   12   23:aload_1         
	//   13   24:aload_0         
	//   14   25:getfield        #486 <Field int currentChipBackgroundColor>
	//   15   28:invokevirtual   #915 <Method int ColorStateList.getColorForState(int[], int)>
	//   16   31:istore          4
		else
	//*  17   33:goto            39
			i = 0;
	//   18   36:iconst_0        
	//   19   37:istore          4
		if(currentChipBackgroundColor != i)
	//*  20   39:aload_0         
	//*  21   40:getfield        #486 <Field int currentChipBackgroundColor>
	//*  22   43:iload           4
	//*  23   45:icmpeq          57
		{
			currentChipBackgroundColor = i;
	//   24   48:aload_0         
	//   25   49:iload           4
	//   26   51:putfield        #486 <Field int currentChipBackgroundColor>
			flag1 = true;
	//   27   54:iconst_1        
	//   28   55:istore          6
		}
		obj = ((Object) (chipStrokeColor));
	//   29   57:aload_0         
	//   30   58:getfield        #917 <Field ColorStateList chipStrokeColor>
	//   31   61:astore          9
		if(obj != null)
	//*  32   63:aload           9
	//*  33   65:ifnull          83
			i = ((ColorStateList) (obj)).getColorForState(ai, currentChipStrokeColor);
	//   34   68:aload           9
	//   35   70:aload_1         
	//   36   71:aload_0         
	//   37   72:getfield        #514 <Field int currentChipStrokeColor>
	//   38   75:invokevirtual   #915 <Method int ColorStateList.getColorForState(int[], int)>
	//   39   78:istore          4
		else
	//*  40   80:goto            86
			i = 0;
	//   41   83:iconst_0        
	//   42   84:istore          4
		if(currentChipStrokeColor != i)
	//*  43   86:aload_0         
	//*  44   87:getfield        #514 <Field int currentChipStrokeColor>
	//*  45   90:iload           4
	//*  46   92:icmpeq          104
		{
			currentChipStrokeColor = i;
	//   47   95:aload_0         
	//   48   96:iload           4
	//   49   98:putfield        #514 <Field int currentChipStrokeColor>
			flag1 = true;
	//   50  101:iconst_1        
	//   51  102:istore          6
		}
		obj = ((Object) (compatRippleColor));
	//   52  104:aload_0         
	//   53  105:getfield        #919 <Field ColorStateList compatRippleColor>
	//   54  108:astore          9
		if(obj != null)
	//*  55  110:aload           9
	//*  56  112:ifnull          130
			i = ((ColorStateList) (obj)).getColorForState(ai, currentCompatRippleColor);
	//   57  115:aload           9
	//   58  117:aload_1         
	//   59  118:aload_0         
	//   60  119:getfield        #523 <Field int currentCompatRippleColor>
	//   61  122:invokevirtual   #915 <Method int ColorStateList.getColorForState(int[], int)>
	//   62  125:istore          4
		else
	//*  63  127:goto            133
			i = 0;
	//   64  130:iconst_0        
	//   65  131:istore          4
		boolean flag2 = flag1;
	//   66  133:iload           6
	//   67  135:istore          7
		if(currentCompatRippleColor != i)
	//*  68  137:aload_0         
	//*  69  138:getfield        #523 <Field int currentCompatRippleColor>
	//*  70  141:iload           4
	//*  71  143:icmpeq          166
		{
			currentCompatRippleColor = i;
	//   72  146:aload_0         
	//   73  147:iload           4
	//   74  149:putfield        #523 <Field int currentCompatRippleColor>
			flag2 = flag1;
	//   75  152:iload           6
	//   76  154:istore          7
			if(useCompatRipple)
	//*  77  156:aload_0         
	//*  78  157:getfield        #921 <Field boolean useCompatRipple>
	//*  79  160:ifeq            166
				flag2 = true;
	//   80  163:iconst_1        
	//   81  164:istore          7
		}
		obj = ((Object) (textAppearance));
	//   82  166:aload_0         
	//   83  167:getfield        #557 <Field TextAppearance textAppearance>
	//   84  170:astore          9
		if(obj != null && ((TextAppearance) (obj)).textColor != null)
	//*  85  172:aload           9
	//*  86  174:ifnull          205
	//*  87  177:aload           9
	//*  88  179:getfield        #624 <Field ColorStateList TextAppearance.textColor>
	//*  89  182:ifnull          205
			i = textAppearance.textColor.getColorForState(ai, currentTextColor);
	//   90  185:aload_0         
	//   91  186:getfield        #557 <Field TextAppearance textAppearance>
	//   92  189:getfield        #624 <Field ColorStateList TextAppearance.textColor>
	//   93  192:aload_1         
	//   94  193:aload_0         
	//   95  194:getfield        #923 <Field int currentTextColor>
	//   96  197:invokevirtual   #915 <Method int ColorStateList.getColorForState(int[], int)>
	//   97  200:istore          4
		else
	//*  98  202:goto            208
			i = 0;
	//   99  205:iconst_0        
	//  100  206:istore          4
		flag1 = flag2;
	//  101  208:iload           7
	//  102  210:istore          6
		if(currentTextColor != i)
	//* 103  212:aload_0         
	//* 104  213:getfield        #923 <Field int currentTextColor>
	//* 105  216:iload           4
	//* 106  218:icmpeq          230
		{
			currentTextColor = i;
	//  107  221:aload_0         
	//  108  222:iload           4
	//  109  224:putfield        #923 <Field int currentTextColor>
			flag1 = true;
	//  110  227:iconst_1        
	//  111  228:istore          6
		}
		if(hasState(getState(), 0x10100a0) && checkable)
	//* 112  230:aload_0         
	//* 113  231:invokevirtual   #261 <Method int[] getState()>
	//* 114  234:ldc2            #924 <Int 0x10100a0>
	//* 115  237:invokestatic    #926 <Method boolean hasState(int[], int)>
	//* 116  240:ifeq            256
	//* 117  243:aload_0         
	//* 118  244:getfield        #365 <Field boolean checkable>
	//* 119  247:ifeq            256
			flag2 = true;
	//  120  250:iconst_1        
	//  121  251:istore          7
		else
	//* 122  253:goto            259
			flag2 = false;
	//  123  256:iconst_0        
	//  124  257:istore          7
		if(currentChecked != flag2 && checkedIcon != null)
	//* 125  259:aload_0         
	//* 126  260:getfield        #928 <Field boolean currentChecked>
	//* 127  263:iload           7
	//* 128  265:icmpeq          314
	//* 129  268:aload_0         
	//* 130  269:getfield        #363 <Field Drawable checkedIcon>
	//* 131  272:ifnull          314
		{
			float f = calculateChipIconWidth();
	//  132  275:aload_0         
	//  133  276:invokevirtual   #332 <Method float calculateChipIconWidth()>
	//  134  279:fstore_3        
			currentChecked = flag2;
	//  135  280:aload_0         
	//  136  281:iload           7
	//  137  283:putfield        #928 <Field boolean currentChecked>
			if(f != calculateChipIconWidth())
	//* 138  286:fload_3         
	//* 139  287:aload_0         
	//* 140  288:invokevirtual   #332 <Method float calculateChipIconWidth()>
	//* 141  291:fcmpl           
	//* 142  292:ifeq            305
			{
				flag1 = true;
	//  143  295:iconst_1        
	//  144  296:istore          6
				flag2 = flag1;
	//  145  298:iload           6
	//  146  300:istore          7
			} else
	//* 147  302:goto            317
			{
				flag2 = false;
	//  148  305:iconst_0        
	//  149  306:istore          7
				flag1 = true;
	//  150  308:iconst_1        
	//  151  309:istore          6
			}
		} else
	//* 152  311:goto            317
		{
			flag2 = false;
	//  153  314:iconst_0        
	//  154  315:istore          7
		}
		obj = ((Object) (tint));
	//  155  317:aload_0         
	//  156  318:getfield        #930 <Field ColorStateList tint>
	//  157  321:astore          9
		i = ((int) (flag));
	//  158  323:iload           5
	//  159  325:istore          4
		if(obj != null)
	//* 160  327:aload           9
	//* 161  329:ifnull          344
			i = ((ColorStateList) (obj)).getColorForState(ai, currentTint);
	//  162  332:aload           9
	//  163  334:aload_1         
	//  164  335:aload_0         
	//  165  336:getfield        #932 <Field int currentTint>
	//  166  339:invokevirtual   #915 <Method int ColorStateList.getColorForState(int[], int)>
	//  167  342:istore          4
		boolean flag3 = flag1;
	//  168  344:iload           6
	//  169  346:istore          8
		if(currentTint != i)
	//* 170  348:aload_0         
	//* 171  349:getfield        #932 <Field int currentTint>
	//* 172  352:iload           4
	//* 173  354:icmpeq          382
		{
			currentTint = i;
	//  174  357:aload_0         
	//  175  358:iload           4
	//  176  360:putfield        #932 <Field int currentTint>
			tintFilter = DrawableUtils.updateTintFilter(((Drawable) (this)), tint, tintMode);
	//  177  363:aload_0         
	//  178  364:aload_0         
	//  179  365:aload_0         
	//  180  366:getfield        #930 <Field ColorStateList tint>
	//  181  369:aload_0         
	//  182  370:getfield        #154 <Field android.graphics.PorterDuff$Mode tintMode>
	//  183  373:invokestatic    #938 <Method PorterDuffColorFilter DrawableUtils.updateTintFilter(Drawable, ColorStateList, android.graphics.PorterDuff$Mode)>
	//  184  376:putfield        #612 <Field PorterDuffColorFilter tintFilter>
			flag3 = true;
	//  185  379:iconst_1        
	//  186  380:istore          8
		}
		flag1 = flag3;
	//  187  382:iload           8
	//  188  384:istore          6
		if(isStateful(chipIcon))
	//* 189  386:aload_0         
	//* 190  387:getfield        #509 <Field Drawable chipIcon>
	//* 191  390:invokestatic    #940 <Method boolean isStateful(Drawable)>
	//* 192  393:ifeq            409
			flag1 = flag3 | chipIcon.setState(ai);
	//  193  396:iload           8
	//  194  398:aload_0         
	//  195  399:getfield        #509 <Field Drawable chipIcon>
	//  196  402:aload_1         
	//  197  403:invokevirtual   #252 <Method boolean Drawable.setState(int[])>
	//  198  406:ior             
	//  199  407:istore          6
		flag3 = flag1;
	//  200  409:iload           6
	//  201  411:istore          8
		if(isStateful(checkedIcon))
	//* 202  413:aload_0         
	//* 203  414:getfield        #363 <Field Drawable checkedIcon>
	//* 204  417:invokestatic    #940 <Method boolean isStateful(Drawable)>
	//* 205  420:ifeq            436
			flag3 = flag1 | checkedIcon.setState(ai);
	//  206  423:iload           6
	//  207  425:aload_0         
	//  208  426:getfield        #363 <Field Drawable checkedIcon>
	//  209  429:aload_1         
	//  210  430:invokevirtual   #252 <Method boolean Drawable.setState(int[])>
	//  211  433:ior             
	//  212  434:istore          8
		flag1 = flag3;
	//  213  436:iload           8
	//  214  438:istore          6
		if(isStateful(closeIcon))
	//* 215  440:aload_0         
	//* 216  441:getfield        #244 <Field Drawable closeIcon>
	//* 217  444:invokestatic    #940 <Method boolean isStateful(Drawable)>
	//* 218  447:ifeq            463
			flag1 = flag3 | closeIcon.setState(ai1);
	//  219  450:iload           8
	//  220  452:aload_0         
	//  221  453:getfield        #244 <Field Drawable closeIcon>
	//  222  456:aload_2         
	//  223  457:invokevirtual   #252 <Method boolean Drawable.setState(int[])>
	//  224  460:ior             
	//  225  461:istore          6
		if(flag1)
	//* 226  463:iload           6
	//* 227  465:ifeq            472
			invalidateSelf();
	//  228  468:aload_0         
	//  229  469:invokevirtual   #943 <Method void invalidateSelf()>
		if(flag2)
	//* 230  472:iload           7
	//* 231  474:ifeq            481
			onSizeChange();
	//  232  477:aload_0         
	//  233  478:invokevirtual   #946 <Method void onSizeChange()>
		return flag1;
	//  234  481:iload           6
	//  235  483:ireturn         
	}

	private boolean showsCheckedIcon()
	{
		return checkedIconVisible && checkedIcon != null && currentChecked;
	//    0    0:aload_0         
	//    1    1:getfield        #361 <Field boolean checkedIconVisible>
	//    2    4:ifeq            23
	//    3    7:aload_0         
	//    4    8:getfield        #363 <Field Drawable checkedIcon>
	//    5   11:ifnull          23
	//    6   14:aload_0         
	//    7   15:getfield        #928 <Field boolean currentChecked>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	private boolean showsChipIcon()
	{
		return chipIconVisible && chipIcon != null;
	//    0    0:aload_0         
	//    1    1:getfield        #948 <Field boolean chipIconVisible>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:getfield        #509 <Field Drawable chipIcon>
	//    5   11:ifnull          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	private boolean showsCloseIcon()
	{
		return closeIconVisible && closeIcon != null;
	//    0    0:aload_0         
	//    1    1:getfield        #950 <Field boolean closeIconVisible>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:getfield        #244 <Field Drawable closeIcon>
	//    5   11:ifnull          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	private void unapplyChildDrawable(Drawable drawable)
	{
		if(drawable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #216 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
	//    5    9:return          
	}

	private void updateCompatRippleColor()
	{
		ColorStateList colorstatelist;
		if(useCompatRipple)
	//*   0    0:aload_0         
	//*   1    1:getfield        #921 <Field boolean useCompatRipple>
	//*   2    4:ifeq            18
			colorstatelist = RippleUtils.convertToRippleDrawableColor(rippleColor);
	//    3    7:aload_0         
	//    4    8:getfield        #954 <Field ColorStateList rippleColor>
	//    5   11:invokestatic    #960 <Method ColorStateList RippleUtils.convertToRippleDrawableColor(ColorStateList)>
	//    6   14:astore_1        
		else
	//*   7   15:goto            20
			colorstatelist = null;
	//    8   18:aconst_null     
	//    9   19:astore_1        
		compatRippleColor = colorstatelist;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #919 <Field ColorStateList compatRippleColor>
	//   13   25:return          
	}

	float calculateChipIconWidth()
	{
		if(!showsChipIcon() && !showsCheckedIcon())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #270 <Method boolean showsChipIcon()>
	//*   2    4:ifne            19
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #273 <Method boolean showsCheckedIcon()>
	//*   5   11:ifeq            17
	//*   6   14:goto            19
			return 0.0F;
	//    7   17:fconst_0        
	//    8   18:freturn         
		else
			return iconStartPadding + chipIconSize + iconEndPadding;
	//    9   19:aload_0         
	//   10   20:getfield        #277 <Field float iconStartPadding>
	//   11   23:aload_0         
	//   12   24:getfield        #286 <Field float chipIconSize>
	//   13   27:fadd            
	//   14   28:aload_0         
	//   15   29:getfield        #962 <Field float iconEndPadding>
	//   16   32:fadd            
	//   17   33:freturn         
	}

	android.graphics.Paint.Align calculateTextOriginAndAlignment(Rect rect, PointF pointf)
	{
		pointf.set(0.0F, 0.0F);
	//    0    0:aload_2         
	//    1    1:fconst_0        
	//    2    2:fconst_0        
	//    3    3:invokevirtual   #964 <Method void PointF.set(float, float)>
		android.graphics.Paint.Align align = android.graphics.Paint.Align.LEFT;
	//    4    6:getstatic       #970 <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//    5    9:astore          4
		if(unicodeWrappedText != null)
	//*   6   11:aload_0         
	//*   7   12:getfield        #329 <Field CharSequence unicodeWrappedText>
	//*   8   15:ifnull          89
		{
			float f = chipStartPadding + calculateChipIconWidth() + textStartPadding;
	//    9   18:aload_0         
	//   10   19:getfield        #275 <Field float chipStartPadding>
	//   11   22:aload_0         
	//   12   23:invokevirtual   #332 <Method float calculateChipIconWidth()>
	//   13   26:fadd            
	//   14   27:aload_0         
	//   15   28:getfield        #334 <Field float textStartPadding>
	//   16   31:fadd            
	//   17   32:fstore_3        
			if(DrawableCompat.getLayoutDirection(((Drawable) (this))) == 0)
	//*  18   33:aload_0         
	//*  19   34:invokestatic    #222 <Method int DrawableCompat.getLayoutDirection(Drawable)>
	//*  20   37:ifne            59
			{
				pointf.x = (float)rect.left + f;
	//   21   40:aload_2         
	//   22   41:aload_1         
	//   23   42:getfield        #282 <Field int Rect.left>
	//   24   45:i2f             
	//   25   46:fload_3         
	//   26   47:fadd            
	//   27   48:putfield        #595 <Field float PointF.x>
				align = android.graphics.Paint.Align.LEFT;
	//   28   51:getstatic       #970 <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//   29   54:astore          4
			} else
	//*  30   56:goto            75
			{
				pointf.x = (float)rect.right - f;
	//   31   59:aload_2         
	//   32   60:aload_1         
	//   33   61:getfield        #291 <Field int Rect.right>
	//   34   64:i2f             
	//   35   65:fload_3         
	//   36   66:fsub            
	//   37   67:putfield        #595 <Field float PointF.x>
				align = android.graphics.Paint.Align.RIGHT;
	//   38   70:getstatic       #973 <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//   39   73:astore          4
			}
			pointf.y = (float)rect.centerY() - calculateTextCenterFromBaseline();
	//   40   75:aload_2         
	//   41   76:aload_1         
	//   42   77:invokevirtual   #976 <Method int Rect.centerY()>
	//   43   80:i2f             
	//   44   81:aload_0         
	//   45   82:invokespecial   #978 <Method float calculateTextCenterFromBaseline()>
	//   46   85:fsub            
	//   47   86:putfield        #598 <Field float PointF.y>
		}
		return align;
	//   48   89:aload           4
	//   49   91:areturn         
	}

	public void draw(Canvas canvas)
	{
		Rect rect = getBounds();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #982 <Method Rect getBounds()>
	//    2    4:astore_3        
		if(!rect.isEmpty())
	//*   3    5:aload_3         
	//*   4    6:invokevirtual   #985 <Method boolean Rect.isEmpty()>
	//*   5    9:ifne            132
		{
			if(getAlpha() == 0)
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #988 <Method int getAlpha()>
	//*   8   16:ifne            20
				return;
	//    9   19:return          
			int i = 0;
	//   10   20:iconst_0        
	//   11   21:istore_2        
			if(alpha < 255)
	//*  12   22:aload_0         
	//*  13   23:getfield        #147 <Field int alpha>
	//*  14   26:sipush          255
	//*  15   29:icmpge          61
				i = CanvasCompat.saveLayerAlpha(canvas, rect.left, rect.top, rect.right, rect.bottom, alpha);
	//   16   32:aload_1         
	//   17   33:aload_3         
	//   18   34:getfield        #282 <Field int Rect.left>
	//   19   37:i2f             
	//   20   38:aload_3         
	//   21   39:getfield        #323 <Field int Rect.top>
	//   22   42:i2f             
	//   23   43:aload_3         
	//   24   44:getfield        #291 <Field int Rect.right>
	//   25   47:i2f             
	//   26   48:aload_3         
	//   27   49:getfield        #325 <Field int Rect.bottom>
	//   28   52:i2f             
	//   29   53:aload_0         
	//   30   54:getfield        #147 <Field int alpha>
	//   31   57:invokestatic    #994 <Method int CanvasCompat.saveLayerAlpha(Canvas, float, float, float, float, int)>
	//   32   60:istore_2        
			drawChipBackground(canvas, rect);
	//   33   61:aload_0         
	//   34   62:aload_1         
	//   35   63:aload_3         
	//   36   64:invokespecial   #996 <Method void drawChipBackground(Canvas, Rect)>
			drawChipStroke(canvas, rect);
	//   37   67:aload_0         
	//   38   68:aload_1         
	//   39   69:aload_3         
	//   40   70:invokespecial   #998 <Method void drawChipStroke(Canvas, Rect)>
			drawCompatRipple(canvas, rect);
	//   41   73:aload_0         
	//   42   74:aload_1         
	//   43   75:aload_3         
	//   44   76:invokespecial   #1000 <Method void drawCompatRipple(Canvas, Rect)>
			drawChipIcon(canvas, rect);
	//   45   79:aload_0         
	//   46   80:aload_1         
	//   47   81:aload_3         
	//   48   82:invokespecial   #1002 <Method void drawChipIcon(Canvas, Rect)>
			drawCheckedIcon(canvas, rect);
	//   49   85:aload_0         
	//   50   86:aload_1         
	//   51   87:aload_3         
	//   52   88:invokespecial   #1004 <Method void drawCheckedIcon(Canvas, Rect)>
			if(shouldDrawText)
	//*  53   91:aload_0         
	//*  54   92:getfield        #208 <Field boolean shouldDrawText>
	//*  55   95:ifeq            104
				drawText(canvas, rect);
	//   56   98:aload_0         
	//   57   99:aload_1         
	//   58  100:aload_3         
	//   59  101:invokespecial   #1006 <Method void drawText(Canvas, Rect)>
			drawCloseIcon(canvas, rect);
	//   60  104:aload_0         
	//   61  105:aload_1         
	//   62  106:aload_3         
	//   63  107:invokespecial   #1008 <Method void drawCloseIcon(Canvas, Rect)>
			drawDebug(canvas, rect);
	//   64  110:aload_0         
	//   65  111:aload_1         
	//   66  112:aload_3         
	//   67  113:invokespecial   #1010 <Method void drawDebug(Canvas, Rect)>
			if(alpha < 255)
	//*  68  116:aload_0         
	//*  69  117:getfield        #147 <Field int alpha>
	//*  70  120:sipush          255
	//*  71  123:icmpge          131
				canvas.restoreToCount(i);
	//   72  126:aload_1         
	//   73  127:iload_2         
	//   74  128:invokevirtual   #604 <Method void Canvas.restoreToCount(int)>
			return;
	//   75  131:return          
		} else
		{
			return;
	//   76  132:return          
		}
	}

	public int getAlpha()
	{
		return alpha;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field int alpha>
	//    2    4:ireturn         
	}

	public Drawable getCheckedIcon()
	{
		return checkedIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #363 <Field Drawable checkedIcon>
	//    2    4:areturn         
	}

	public ColorStateList getChipBackgroundColor()
	{
		return chipBackgroundColor;
	//    0    0:aload_0         
	//    1    1:getfield        #911 <Field ColorStateList chipBackgroundColor>
	//    2    4:areturn         
	}

	public float getChipCornerRadius()
	{
		return chipCornerRadius;
	//    0    0:aload_0         
	//    1    1:getfield        #502 <Field float chipCornerRadius>
	//    2    4:freturn         
	}

	public float getChipEndPadding()
	{
		return chipEndPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #311 <Field float chipEndPadding>
	//    2    4:freturn         
	}

	public Drawable getChipIcon()
	{
		Drawable drawable = chipIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #509 <Field Drawable chipIcon>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return DrawableCompat.unwrap(drawable);
	//    5    9:aload_1         
	//    6   10:invokestatic    #1021 <Method Drawable DrawableCompat.unwrap(Drawable)>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public float getChipIconSize()
	{
		return chipIconSize;
	//    0    0:aload_0         
	//    1    1:getfield        #286 <Field float chipIconSize>
	//    2    4:freturn         
	}

	public ColorStateList getChipIconTint()
	{
		return chipIconTint;
	//    0    0:aload_0         
	//    1    1:getfield        #1025 <Field ColorStateList chipIconTint>
	//    2    4:areturn         
	}

	public float getChipMinHeight()
	{
		return chipMinHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #1028 <Field float chipMinHeight>
	//    2    4:freturn         
	}

	public float getChipStartPadding()
	{
		return chipStartPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #275 <Field float chipStartPadding>
	//    2    4:freturn         
	}

	public ColorStateList getChipStrokeColor()
	{
		return chipStrokeColor;
	//    0    0:aload_0         
	//    1    1:getfield        #917 <Field ColorStateList chipStrokeColor>
	//    2    4:areturn         
	}

	public float getChipStrokeWidth()
	{
		return chipStrokeWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #512 <Field float chipStrokeWidth>
	//    2    4:freturn         
	}

	public void getChipTouchBounds(RectF rectf)
	{
		calculateChipTouchBounds(getBounds(), rectf);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #982 <Method Rect getBounds()>
	//    3    5:aload_1         
	//    4    6:invokespecial   #545 <Method void calculateChipTouchBounds(Rect, RectF)>
	//    5    9:return          
	}

	public Drawable getCloseIcon()
	{
		Drawable drawable = closeIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field Drawable closeIcon>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return DrawableCompat.unwrap(drawable);
	//    5    9:aload_1         
	//    6   10:invokestatic    #1021 <Method Drawable DrawableCompat.unwrap(Drawable)>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public CharSequence getCloseIconContentDescription()
	{
		return closeIconContentDescription;
	//    0    0:aload_0         
	//    1    1:getfield        #1038 <Field CharSequence closeIconContentDescription>
	//    2    4:areturn         
	}

	public float getCloseIconEndPadding()
	{
		return closeIconEndPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #313 <Field float closeIconEndPadding>
	//    2    4:freturn         
	}

	public float getCloseIconSize()
	{
		return closeIconSize;
	//    0    0:aload_0         
	//    1    1:getfield        #315 <Field float closeIconSize>
	//    2    4:freturn         
	}

	public float getCloseIconStartPadding()
	{
		return closeIconStartPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #317 <Field float closeIconStartPadding>
	//    2    4:freturn         
	}

	public int[] getCloseIconState()
	{
		return closeIconStateSet;
	//    0    0:aload_0         
	//    1    1:getfield        #1043 <Field int[] closeIconStateSet>
	//    2    4:areturn         
	}

	public ColorStateList getCloseIconTint()
	{
		return closeIconTint;
	//    0    0:aload_0         
	//    1    1:getfield        #254 <Field ColorStateList closeIconTint>
	//    2    4:areturn         
	}

	public void getCloseIconTouchBounds(RectF rectf)
	{
		calculateCloseIconTouchBounds(getBounds(), rectf);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #982 <Method Rect getBounds()>
	//    3    5:aload_1         
	//    4    6:invokespecial   #548 <Method void calculateCloseIconTouchBounds(Rect, RectF)>
	//    5    9:return          
	}

	public ColorFilter getColorFilter()
	{
		return colorFilter;
	//    0    0:aload_0         
	//    1    1:getfield        #610 <Field ColorFilter colorFilter>
	//    2    4:areturn         
	}

	public android.text.TextUtils.TruncateAt getEllipsize()
	{
		return truncateAt;
	//    0    0:aload_0         
	//    1    1:getfield        #588 <Field android.text.TextUtils$TruncateAt truncateAt>
	//    2    4:areturn         
	}

	public MotionSpec getHideMotionSpec()
	{
		return hideMotionSpec;
	//    0    0:aload_0         
	//    1    1:getfield        #1052 <Field MotionSpec hideMotionSpec>
	//    2    4:areturn         
	}

	public float getIconEndPadding()
	{
		return iconEndPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #962 <Field float iconEndPadding>
	//    2    4:freturn         
	}

	public float getIconStartPadding()
	{
		return iconStartPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #277 <Field float iconStartPadding>
	//    2    4:freturn         
	}

	public int getIntrinsicHeight()
	{
		return (int)chipMinHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #1028 <Field float chipMinHeight>
	//    2    4:f2i             
	//    3    5:ireturn         
	}

	public int getIntrinsicWidth()
	{
		return Math.min(Math.round(chipStartPadding + calculateChipIconWidth() + textStartPadding + getTextWidth() + textEndPadding + calculateCloseIconWidth() + chipEndPadding), maxWidth);
	//    0    0:aload_0         
	//    1    1:getfield        #275 <Field float chipStartPadding>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #332 <Method float calculateChipIconWidth()>
	//    4    8:fadd            
	//    5    9:aload_0         
	//    6   10:getfield        #334 <Field float textStartPadding>
	//    7   13:fadd            
	//    8   14:aload_0         
	//    9   15:invokespecial   #573 <Method float getTextWidth()>
	//   10   18:fadd            
	//   11   19:aload_0         
	//   12   20:getfield        #319 <Field float textEndPadding>
	//   13   23:fadd            
	//   14   24:aload_0         
	//   15   25:invokespecial   #336 <Method float calculateCloseIconWidth()>
	//   16   28:fadd            
	//   17   29:aload_0         
	//   18   30:getfield        #311 <Field float chipEndPadding>
	//   19   33:fadd            
	//   20   34:invokestatic    #579 <Method int Math.round(float)>
	//   21   37:aload_0         
	//   22   38:getfield        #1058 <Field int maxWidth>
	//   23   41:invokestatic    #1061 <Method int Math.min(int, int)>
	//   24   44:ireturn         
	}

	public int getMaxWidth()
	{
		return maxWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #1058 <Field int maxWidth>
	//    2    4:ireturn         
	}

	public int getOpacity()
	{
		return -3;
	//    0    0:bipush          -3
	//    1    2:ireturn         
	}

	public void getOutline(Outline outline)
	{
		Rect rect = getBounds();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #982 <Method Rect getBounds()>
	//    2    4:astore_2        
		if(!rect.isEmpty())
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #985 <Method boolean Rect.isEmpty()>
	//*   5    9:ifne            24
			outline.setRoundRect(rect, chipCornerRadius);
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:aload_0         
	//    9   15:getfield        #502 <Field float chipCornerRadius>
	//   10   18:invokevirtual   #1075 <Method void Outline.setRoundRect(Rect, float)>
		else
	//*  11   21:goto            42
			outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), chipCornerRadius);
	//   12   24:aload_1         
	//   13   25:iconst_0        
	//   14   26:iconst_0        
	//   15   27:aload_0         
	//   16   28:invokevirtual   #1077 <Method int getIntrinsicWidth()>
	//   17   31:aload_0         
	//   18   32:invokevirtual   #1079 <Method int getIntrinsicHeight()>
	//   19   35:aload_0         
	//   20   36:getfield        #502 <Field float chipCornerRadius>
	//   21   39:invokevirtual   #1082 <Method void Outline.setRoundRect(int, int, int, int, float)>
		outline.setAlpha((float)getAlpha() / 255F);
	//   22   42:aload_1         
	//   23   43:aload_0         
	//   24   44:invokevirtual   #988 <Method int getAlpha()>
	//   25   47:i2f             
	//   26   48:ldc2            #1083 <Float 255F>
	//   27   51:fdiv            
	//   28   52:invokevirtual   #1086 <Method void Outline.setAlpha(float)>
	//   29   55:return          
	}

	public ColorStateList getRippleColor()
	{
		return rippleColor;
	//    0    0:aload_0         
	//    1    1:getfield        #954 <Field ColorStateList rippleColor>
	//    2    4:areturn         
	}

	public MotionSpec getShowMotionSpec()
	{
		return showMotionSpec;
	//    0    0:aload_0         
	//    1    1:getfield        #1090 <Field MotionSpec showMotionSpec>
	//    2    4:areturn         
	}

	public CharSequence getText()
	{
		return rawText;
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field CharSequence rawText>
	//    2    4:areturn         
	}

	public TextAppearance getTextAppearance()
	{
		return textAppearance;
	//    0    0:aload_0         
	//    1    1:getfield        #557 <Field TextAppearance textAppearance>
	//    2    4:areturn         
	}

	public float getTextEndPadding()
	{
		return textEndPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #319 <Field float textEndPadding>
	//    2    4:freturn         
	}

	public float getTextStartPadding()
	{
		return textStartPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #334 <Field float textStartPadding>
	//    2    4:freturn         
	}

	public boolean getUseCompatRipple()
	{
		return useCompatRipple;
	//    0    0:aload_0         
	//    1    1:getfield        #921 <Field boolean useCompatRipple>
	//    2    4:ireturn         
	}

	public void invalidateDrawable(Drawable drawable)
	{
		drawable = ((Drawable) (getCallback()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1099 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			((android.graphics.drawable.Drawable.Callback) (drawable)).invalidateDrawable(((Drawable) (this)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #1101 <Method void android.graphics.drawable.Drawable$Callback.invalidateDrawable(Drawable)>
	//    8   16:return          
	}

	public boolean isCheckable()
	{
		return checkable;
	//    0    0:aload_0         
	//    1    1:getfield        #365 <Field boolean checkable>
	//    2    4:ireturn         
	}

	public boolean isCheckedIconEnabled()
	{
		return isCheckedIconVisible();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1107 <Method boolean isCheckedIconVisible()>
	//    2    4:ireturn         
	}

	public boolean isCheckedIconVisible()
	{
		return checkedIconVisible;
	//    0    0:aload_0         
	//    1    1:getfield        #361 <Field boolean checkedIconVisible>
	//    2    4:ireturn         
	}

	public boolean isChipIconEnabled()
	{
		return isChipIconVisible();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1112 <Method boolean isChipIconVisible()>
	//    2    4:ireturn         
	}

	public boolean isChipIconVisible()
	{
		return chipIconVisible;
	//    0    0:aload_0         
	//    1    1:getfield        #948 <Field boolean chipIconVisible>
	//    2    4:ireturn         
	}

	public boolean isCloseIconEnabled()
	{
		return isCloseIconVisible();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1116 <Method boolean isCloseIconVisible()>
	//    2    4:ireturn         
	}

	public boolean isCloseIconStateful()
	{
		return isStateful(closeIcon);
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field Drawable closeIcon>
	//    2    4:invokestatic    #940 <Method boolean isStateful(Drawable)>
	//    3    7:ireturn         
	}

	public boolean isCloseIconVisible()
	{
		return closeIconVisible;
	//    0    0:aload_0         
	//    1    1:getfield        #950 <Field boolean closeIconVisible>
	//    2    4:ireturn         
	}

	public boolean isStateful()
	{
		return isStateful(chipBackgroundColor) || isStateful(chipStrokeColor) || useCompatRipple && isStateful(compatRippleColor) || isStateful(textAppearance) || canShowCheckedIcon() || isStateful(chipIcon) || isStateful(checkedIcon) || isStateful(tint);
	//    0    0:aload_0         
	//    1    1:getfield        #911 <Field ColorStateList chipBackgroundColor>
	//    2    4:invokestatic    #1119 <Method boolean isStateful(ColorStateList)>
	//    3    7:ifne            89
	//    4   10:aload_0         
	//    5   11:getfield        #917 <Field ColorStateList chipStrokeColor>
	//    6   14:invokestatic    #1119 <Method boolean isStateful(ColorStateList)>
	//    7   17:ifne            89
	//    8   20:aload_0         
	//    9   21:getfield        #921 <Field boolean useCompatRipple>
	//   10   24:ifeq            37
	//   11   27:aload_0         
	//   12   28:getfield        #919 <Field ColorStateList compatRippleColor>
	//   13   31:invokestatic    #1119 <Method boolean isStateful(ColorStateList)>
	//   14   34:ifne            89
	//   15   37:aload_0         
	//   16   38:getfield        #557 <Field TextAppearance textAppearance>
	//   17   41:invokestatic    #1121 <Method boolean isStateful(TextAppearance)>
	//   18   44:ifne            89
	//   19   47:aload_0         
	//   20   48:invokespecial   #1123 <Method boolean canShowCheckedIcon()>
	//   21   51:ifne            89
	//   22   54:aload_0         
	//   23   55:getfield        #509 <Field Drawable chipIcon>
	//   24   58:invokestatic    #940 <Method boolean isStateful(Drawable)>
	//   25   61:ifne            89
	//   26   64:aload_0         
	//   27   65:getfield        #363 <Field Drawable checkedIcon>
	//   28   68:invokestatic    #940 <Method boolean isStateful(Drawable)>
	//   29   71:ifne            89
	//   30   74:aload_0         
	//   31   75:getfield        #930 <Field ColorStateList tint>
	//   32   78:invokestatic    #1119 <Method boolean isStateful(ColorStateList)>
	//   33   81:ifeq            87
	//   34   84:goto            89
	//   35   87:iconst_0        
	//   36   88:ireturn         
	//   37   89:iconst_1        
	//   38   90:ireturn         
	}

	public boolean onLayoutDirectionChanged(int i)
	{
		boolean flag1 = super.onLayoutDirectionChanged(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #1127 <Method boolean Drawable.onLayoutDirectionChanged(int)>
	//    3    5:istore_3        
		boolean flag = flag1;
	//    4    6:iload_3         
	//    5    7:istore_2        
		if(showsChipIcon())
	//*   6    8:aload_0         
	//*   7    9:invokespecial   #270 <Method boolean showsChipIcon()>
	//*   8   12:ifeq            26
			flag = flag1 | chipIcon.setLayoutDirection(i);
	//    9   15:iload_3         
	//   10   16:aload_0         
	//   11   17:getfield        #509 <Field Drawable chipIcon>
	//   12   20:iload_1         
	//   13   21:invokevirtual   #1129 <Method boolean Drawable.setLayoutDirection(int)>
	//   14   24:ior             
	//   15   25:istore_2        
		flag1 = flag;
	//   16   26:iload_2         
	//   17   27:istore_3        
		if(showsCheckedIcon())
	//*  18   28:aload_0         
	//*  19   29:invokespecial   #273 <Method boolean showsCheckedIcon()>
	//*  20   32:ifeq            46
			flag1 = flag | checkedIcon.setLayoutDirection(i);
	//   21   35:iload_2         
	//   22   36:aload_0         
	//   23   37:getfield        #363 <Field Drawable checkedIcon>
	//   24   40:iload_1         
	//   25   41:invokevirtual   #1129 <Method boolean Drawable.setLayoutDirection(int)>
	//   26   44:ior             
	//   27   45:istore_3        
		flag = flag1;
	//   28   46:iload_3         
	//   29   47:istore_2        
		if(showsCloseIcon())
	//*  30   48:aload_0         
	//*  31   49:invokespecial   #309 <Method boolean showsCloseIcon()>
	//*  32   52:ifeq            66
			flag = flag1 | closeIcon.setLayoutDirection(i);
	//   33   55:iload_3         
	//   34   56:aload_0         
	//   35   57:getfield        #244 <Field Drawable closeIcon>
	//   36   60:iload_1         
	//   37   61:invokevirtual   #1129 <Method boolean Drawable.setLayoutDirection(int)>
	//   38   64:ior             
	//   39   65:istore_2        
		if(flag)
	//*  40   66:iload_2         
	//*  41   67:ifeq            74
			invalidateSelf();
	//   42   70:aload_0         
	//   43   71:invokevirtual   #943 <Method void invalidateSelf()>
		return true;
	//   44   74:iconst_1        
	//   45   75:ireturn         
	}

	protected boolean onLevelChange(int i)
	{
		boolean flag1 = super.onLevelChange(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #1132 <Method boolean Drawable.onLevelChange(int)>
	//    3    5:istore_3        
		boolean flag = flag1;
	//    4    6:iload_3         
	//    5    7:istore_2        
		if(showsChipIcon())
	//*   6    8:aload_0         
	//*   7    9:invokespecial   #270 <Method boolean showsChipIcon()>
	//*   8   12:ifeq            26
			flag = flag1 | chipIcon.setLevel(i);
	//    9   15:iload_3         
	//   10   16:aload_0         
	//   11   17:getfield        #509 <Field Drawable chipIcon>
	//   12   20:iload_1         
	//   13   21:invokevirtual   #234 <Method boolean Drawable.setLevel(int)>
	//   14   24:ior             
	//   15   25:istore_2        
		flag1 = flag;
	//   16   26:iload_2         
	//   17   27:istore_3        
		if(showsCheckedIcon())
	//*  18   28:aload_0         
	//*  19   29:invokespecial   #273 <Method boolean showsCheckedIcon()>
	//*  20   32:ifeq            46
			flag1 = flag | checkedIcon.setLevel(i);
	//   21   35:iload_2         
	//   22   36:aload_0         
	//   23   37:getfield        #363 <Field Drawable checkedIcon>
	//   24   40:iload_1         
	//   25   41:invokevirtual   #234 <Method boolean Drawable.setLevel(int)>
	//   26   44:ior             
	//   27   45:istore_3        
		flag = flag1;
	//   28   46:iload_3         
	//   29   47:istore_2        
		if(showsCloseIcon())
	//*  30   48:aload_0         
	//*  31   49:invokespecial   #309 <Method boolean showsCloseIcon()>
	//*  32   52:ifeq            66
			flag = flag1 | closeIcon.setLevel(i);
	//   33   55:iload_3         
	//   34   56:aload_0         
	//   35   57:getfield        #244 <Field Drawable closeIcon>
	//   36   60:iload_1         
	//   37   61:invokevirtual   #234 <Method boolean Drawable.setLevel(int)>
	//   38   64:ior             
	//   39   65:istore_2        
		if(flag)
	//*  40   66:iload_2         
	//*  41   67:ifeq            74
			invalidateSelf();
	//   42   70:aload_0         
	//   43   71:invokevirtual   #943 <Method void invalidateSelf()>
		return flag;
	//   44   74:iload_2         
	//   45   75:ireturn         
	}

	protected void onSizeChange()
	{
		Delegate delegate1 = (Delegate)_flddelegate.get();
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field WeakReference _flddelegate>
	//    2    4:invokevirtual   #1136 <Method Object WeakReference.get()>
	//    3    7:checkcast       #12  <Class ChipDrawable$Delegate>
	//    4   10:astore_1        
		if(delegate1 != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          21
			delegate1.onChipDrawableSizeChange();
	//    7   15:aload_1         
	//    8   16:invokeinterface #1139 <Method void ChipDrawable$Delegate.onChipDrawableSizeChange()>
	//    9   21:return          
	}

	protected boolean onStateChange(int ai[])
	{
		return onStateChange(ai, getCloseIconState());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #251 <Method int[] getCloseIconState()>
	//    4    6:invokespecial   #1141 <Method boolean onStateChange(int[], int[])>
	//    5    9:ireturn         
	}

	public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
	{
		drawable = ((Drawable) (getCallback()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1099 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
			((android.graphics.drawable.Drawable.Callback) (drawable)).scheduleDrawable(((Drawable) (this)), runnable, l);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:lload_3         
	//    9   13:invokeinterface #1145 <Method void android.graphics.drawable.Drawable$Callback.scheduleDrawable(Drawable, Runnable, long)>
	//   10   18:return          
	}

	public void setAlpha(int i)
	{
		if(alpha != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #147 <Field int alpha>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			alpha = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #147 <Field int alpha>
			invalidateSelf();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #943 <Method void invalidateSelf()>
		}
	//    9   17:return          
	}

	public void setCheckable(boolean flag)
	{
		if(checkable != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #365 <Field boolean checkable>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          53
		{
			checkable = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #365 <Field boolean checkable>
			float f = calculateChipIconWidth();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #332 <Method float calculateChipIconWidth()>
	//    9   17:fstore_2        
			if(!flag && currentChecked)
	//*  10   18:iload_1         
	//*  11   19:ifne            34
	//*  12   22:aload_0         
	//*  13   23:getfield        #928 <Field boolean currentChecked>
	//*  14   26:ifeq            34
				currentChecked = false;
	//   15   29:aload_0         
	//   16   30:iconst_0        
	//   17   31:putfield        #928 <Field boolean currentChecked>
			float f1 = calculateChipIconWidth();
	//   18   34:aload_0         
	//   19   35:invokevirtual   #332 <Method float calculateChipIconWidth()>
	//   20   38:fstore_3        
			invalidateSelf();
	//   21   39:aload_0         
	//   22   40:invokevirtual   #943 <Method void invalidateSelf()>
			if(f != f1)
	//*  23   43:fload_2         
	//*  24   44:fload_3         
	//*  25   45:fcmpl           
	//*  26   46:ifeq            53
				onSizeChange();
	//   27   49:aload_0         
	//   28   50:invokevirtual   #946 <Method void onSizeChange()>
		}
	//   29   53:return          
	}

	public void setCheckableResource(int i)
	{
		setCheckable(context.getResources().getBoolean(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:invokevirtual   #175 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #1149 <Method boolean Resources.getBoolean(int)>
	//    6   12:invokevirtual   #807 <Method void setCheckable(boolean)>
	//    7   15:return          
	}

	public void setCheckedIcon(Drawable drawable)
	{
		if(checkedIcon != drawable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #363 <Field Drawable checkedIcon>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       53
		{
			float f = calculateChipIconWidth();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #332 <Method float calculateChipIconWidth()>
	//    6   12:fstore_2        
			checkedIcon = drawable;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:putfield        #363 <Field Drawable checkedIcon>
			float f1 = calculateChipIconWidth();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #332 <Method float calculateChipIconWidth()>
	//   12   22:fstore_3        
			unapplyChildDrawable(checkedIcon);
	//   13   23:aload_0         
	//   14   24:aload_0         
	//   15   25:getfield        #363 <Field Drawable checkedIcon>
	//   16   28:invokespecial   #1151 <Method void unapplyChildDrawable(Drawable)>
			applyChildDrawable(checkedIcon);
	//   17   31:aload_0         
	//   18   32:aload_0         
	//   19   33:getfield        #363 <Field Drawable checkedIcon>
	//   20   36:invokespecial   #1153 <Method void applyChildDrawable(Drawable)>
			invalidateSelf();
	//   21   39:aload_0         
	//   22   40:invokevirtual   #943 <Method void invalidateSelf()>
			if(f != f1)
	//*  23   43:fload_2         
	//*  24   44:fload_3         
	//*  25   45:fcmpl           
	//*  26   46:ifeq            53
				onSizeChange();
	//   27   49:aload_0         
	//   28   50:invokevirtual   #946 <Method void onSizeChange()>
		}
	//   29   53:return          
	}

	public void setCheckedIconEnabled(boolean flag)
	{
		setCheckedIconVisible(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #813 <Method void setCheckedIconVisible(boolean)>
	//    3    5:return          
	}

	public void setCheckedIconEnabledResource(int i)
	{
		setCheckedIconVisible(context.getResources().getBoolean(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:invokevirtual   #175 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #1149 <Method boolean Resources.getBoolean(int)>
	//    6   12:invokevirtual   #813 <Method void setCheckedIconVisible(boolean)>
	//    7   15:return          
	}

	public void setCheckedIconResource(int i)
	{
		setCheckedIcon(AppCompatResources.getDrawable(context, i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:iload_1         
	//    4    6:invokestatic    #1162 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #825 <Method void setCheckedIcon(Drawable)>
	//    6   12:return          
	}

	public void setCheckedIconVisible(int i)
	{
		setCheckedIconVisible(context.getResources().getBoolean(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:invokevirtual   #175 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #1149 <Method boolean Resources.getBoolean(int)>
	//    6   12:invokevirtual   #813 <Method void setCheckedIconVisible(boolean)>
	//    7   15:return          
	}

	public void setCheckedIconVisible(boolean flag)
	{
		if(checkedIconVisible != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #361 <Field boolean checkedIconVisible>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          70
		{
			boolean flag2 = showsCheckedIcon();
	//    4    8:aload_0         
	//    5    9:invokespecial   #273 <Method boolean showsCheckedIcon()>
	//    6   12:istore_3        
			checkedIconVisible = flag;
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:putfield        #361 <Field boolean checkedIconVisible>
			flag = showsCheckedIcon();
	//   10   18:aload_0         
	//   11   19:invokespecial   #273 <Method boolean showsCheckedIcon()>
	//   12   22:istore_1        
			boolean flag1;
			if(flag2 != flag)
	//*  13   23:iload_3         
	//*  14   24:iload_1         
	//*  15   25:icmpeq          33
				flag1 = true;
	//   16   28:iconst_1        
	//   17   29:istore_2        
			else
	//*  18   30:goto            35
				flag1 = false;
	//   19   33:iconst_0        
	//   20   34:istore_2        
			if(flag1)
	//*  21   35:iload_2         
	//*  22   36:ifeq            70
			{
				if(flag)
	//*  23   39:iload_1         
	//*  24   40:ifeq            54
					applyChildDrawable(checkedIcon);
	//   25   43:aload_0         
	//   26   44:aload_0         
	//   27   45:getfield        #363 <Field Drawable checkedIcon>
	//   28   48:invokespecial   #1153 <Method void applyChildDrawable(Drawable)>
				else
	//*  29   51:goto            62
					unapplyChildDrawable(checkedIcon);
	//   30   54:aload_0         
	//   31   55:aload_0         
	//   32   56:getfield        #363 <Field Drawable checkedIcon>
	//   33   59:invokespecial   #1151 <Method void unapplyChildDrawable(Drawable)>
				invalidateSelf();
	//   34   62:aload_0         
	//   35   63:invokevirtual   #943 <Method void invalidateSelf()>
				onSizeChange();
	//   36   66:aload_0         
	//   37   67:invokevirtual   #946 <Method void onSizeChange()>
			}
		}
	//   38   70:return          
	}

	public void setChipBackgroundColor(ColorStateList colorstatelist)
	{
		if(chipBackgroundColor != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #911 <Field ColorStateList chipBackgroundColor>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       22
		{
			chipBackgroundColor = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #911 <Field ColorStateList chipBackgroundColor>
			onStateChange(getState());
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #261 <Method int[] getState()>
	//   10   18:invokevirtual   #1163 <Method boolean onStateChange(int[])>
	//   11   21:pop             
		}
	//   12   22:return          
	}

	public void setChipBackgroundColorResource(int i)
	{
		setChipBackgroundColor(AppCompatResources.getColorStateList(context, i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:iload_1         
	//    4    6:invokestatic    #1168 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//    5    9:invokevirtual   #648 <Method void setChipBackgroundColor(ColorStateList)>
	//    6   12:return          
	}

	public void setChipCornerRadius(float f)
	{
		if(chipCornerRadius != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #502 <Field float chipCornerRadius>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			chipCornerRadius = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #502 <Field float chipCornerRadius>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #943 <Method void invalidateSelf()>
		}
	//   10   18:return          
	}

	public void setChipCornerRadiusResource(int i)
	{
		setChipCornerRadius(context.getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:invokevirtual   #175 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #1173 <Method float Resources.getDimension(int)>
	//    6   12:invokevirtual   #667 <Method void setChipCornerRadius(float)>
	//    7   15:return          
	}

	public void setChipEndPadding(float f)
	{
		if(chipEndPadding != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #311 <Field float chipEndPadding>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            22
		{
			chipEndPadding = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #311 <Field float chipEndPadding>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #943 <Method void invalidateSelf()>
			onSizeChange();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #946 <Method void onSizeChange()>
		}
	//   12   22:return          
	}

	public void setChipEndPaddingResource(int i)
	{
		setChipEndPadding(context.getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:invokevirtual   #175 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #1173 <Method float Resources.getDimension(int)>
	//    6   12:invokevirtual   #892 <Method void setChipEndPadding(float)>
	//    7   15:return          
	}

	public void setChipIcon(Drawable drawable)
	{
		Drawable drawable1 = getChipIcon();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1176 <Method Drawable getChipIcon()>
	//    2    4:astore          4
		if(drawable1 != drawable)
	//*   3    6:aload           4
	//*   4    8:aload_1         
	//*   5    9:if_acmpeq       79
		{
			float f = calculateChipIconWidth();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #332 <Method float calculateChipIconWidth()>
	//    8   16:fstore_2        
			if(drawable != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          32
				drawable = DrawableCompat.wrap(drawable).mutate();
	//   11   21:aload_1         
	//   12   22:invokestatic    #1179 <Method Drawable DrawableCompat.wrap(Drawable)>
	//   13   25:invokevirtual   #1182 <Method Drawable Drawable.mutate()>
	//   14   28:astore_1        
			else
	//*  15   29:goto            34
				drawable = null;
	//   16   32:aconst_null     
	//   17   33:astore_1        
			chipIcon = drawable;
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:putfield        #509 <Field Drawable chipIcon>
			float f1 = calculateChipIconWidth();
	//   21   39:aload_0         
	//   22   40:invokevirtual   #332 <Method float calculateChipIconWidth()>
	//   23   43:fstore_3        
			unapplyChildDrawable(drawable1);
	//   24   44:aload_0         
	//   25   45:aload           4
	//   26   47:invokespecial   #1151 <Method void unapplyChildDrawable(Drawable)>
			if(showsChipIcon())
	//*  27   50:aload_0         
	//*  28   51:invokespecial   #270 <Method boolean showsChipIcon()>
	//*  29   54:ifeq            65
				applyChildDrawable(chipIcon);
	//   30   57:aload_0         
	//   31   58:aload_0         
	//   32   59:getfield        #509 <Field Drawable chipIcon>
	//   33   62:invokespecial   #1153 <Method void applyChildDrawable(Drawable)>
			invalidateSelf();
	//   34   65:aload_0         
	//   35   66:invokevirtual   #943 <Method void invalidateSelf()>
			if(f != f1)
	//*  36   69:fload_2         
	//*  37   70:fload_3         
	//*  38   71:fcmpl           
	//*  39   72:ifeq            79
				onSizeChange();
	//   40   75:aload_0         
	//   41   76:invokevirtual   #946 <Method void onSizeChange()>
		}
	//   42   79:return          
	}

	public void setChipIconEnabled(boolean flag)
	{
		setChipIconVisible(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #739 <Method void setChipIconVisible(boolean)>
	//    3    5:return          
	}

	public void setChipIconEnabledResource(int i)
	{
		setChipIconVisible(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #1186 <Method void setChipIconVisible(int)>
	//    3    5:return          
	}

	public void setChipIconResource(int i)
	{
		setChipIcon(AppCompatResources.getDrawable(context, i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:iload_1         
	//    4    6:invokestatic    #1162 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #759 <Method void setChipIcon(Drawable)>
	//    6   12:return          
	}

	public void setChipIconSize(float f)
	{
		if(chipIconSize != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #286 <Field float chipIconSize>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            38
		{
			float f1 = calculateChipIconWidth();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #332 <Method float calculateChipIconWidth()>
	//    7   13:fstore_2        
			chipIconSize = f;
	//    8   14:aload_0         
	//    9   15:fload_1         
	//   10   16:putfield        #286 <Field float chipIconSize>
			f = calculateChipIconWidth();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #332 <Method float calculateChipIconWidth()>
	//   13   23:fstore_1        
			invalidateSelf();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #943 <Method void invalidateSelf()>
			if(f1 != f)
	//*  16   28:fload_2         
	//*  17   29:fload_1         
	//*  18   30:fcmpl           
	//*  19   31:ifeq            38
				onSizeChange();
	//   20   34:aload_0         
	//   21   35:invokevirtual   #946 <Method void onSizeChange()>
		}
	//   22   38:return          
	}

	public void setChipIconSizeResource(int i)
	{
		setChipIconSize(context.getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:invokevirtual   #175 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #1173 <Method float Resources.getDimension(int)>
	//    6   12:invokevirtual   #771 <Method void setChipIconSize(float)>
	//    7   15:return          
	}

	public void setChipIconTint(ColorStateList colorstatelist)
	{
		if(chipIconTint != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1025 <Field ColorStateList chipIconTint>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       37
		{
			chipIconTint = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #1025 <Field ColorStateList chipIconTint>
			if(showsChipIcon())
	//*   7   13:aload_0         
	//*   8   14:invokespecial   #270 <Method boolean showsChipIcon()>
	//*   9   17:ifeq            28
				DrawableCompat.setTintList(chipIcon, colorstatelist);
	//   10   20:aload_0         
	//   11   21:getfield        #509 <Field Drawable chipIcon>
	//   12   24:aload_1         
	//   13   25:invokestatic    #258 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			onStateChange(getState());
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:invokevirtual   #261 <Method int[] getState()>
	//   17   33:invokevirtual   #1163 <Method boolean onStateChange(int[])>
	//   18   36:pop             
		}
	//   19   37:return          
	}

	public void setChipIconTintResource(int i)
	{
		setChipIconTint(AppCompatResources.getColorStateList(context, i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:iload_1         
	//    4    6:invokestatic    #1168 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//    5    9:invokevirtual   #765 <Method void setChipIconTint(ColorStateList)>
	//    6   12:return          
	}

	public void setChipIconVisible(int i)
	{
		setChipIconVisible(context.getResources().getBoolean(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:invokevirtual   #175 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #1149 <Method boolean Resources.getBoolean(int)>
	//    6   12:invokevirtual   #739 <Method void setChipIconVisible(boolean)>
	//    7   15:return          
	}

	public void setChipIconVisible(boolean flag)
	{
		if(chipIconVisible != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #948 <Field boolean chipIconVisible>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          70
		{
			boolean flag2 = showsChipIcon();
	//    4    8:aload_0         
	//    5    9:invokespecial   #270 <Method boolean showsChipIcon()>
	//    6   12:istore_3        
			chipIconVisible = flag;
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:putfield        #948 <Field boolean chipIconVisible>
			flag = showsChipIcon();
	//   10   18:aload_0         
	//   11   19:invokespecial   #270 <Method boolean showsChipIcon()>
	//   12   22:istore_1        
			boolean flag1;
			if(flag2 != flag)
	//*  13   23:iload_3         
	//*  14   24:iload_1         
	//*  15   25:icmpeq          33
				flag1 = true;
	//   16   28:iconst_1        
	//   17   29:istore_2        
			else
	//*  18   30:goto            35
				flag1 = false;
	//   19   33:iconst_0        
	//   20   34:istore_2        
			if(flag1)
	//*  21   35:iload_2         
	//*  22   36:ifeq            70
			{
				if(flag)
	//*  23   39:iload_1         
	//*  24   40:ifeq            54
					applyChildDrawable(chipIcon);
	//   25   43:aload_0         
	//   26   44:aload_0         
	//   27   45:getfield        #509 <Field Drawable chipIcon>
	//   28   48:invokespecial   #1153 <Method void applyChildDrawable(Drawable)>
				else
	//*  29   51:goto            62
					unapplyChildDrawable(chipIcon);
	//   30   54:aload_0         
	//   31   55:aload_0         
	//   32   56:getfield        #509 <Field Drawable chipIcon>
	//   33   59:invokespecial   #1151 <Method void unapplyChildDrawable(Drawable)>
				invalidateSelf();
	//   34   62:aload_0         
	//   35   63:invokevirtual   #943 <Method void invalidateSelf()>
				onSizeChange();
	//   36   66:aload_0         
	//   37   67:invokevirtual   #946 <Method void onSizeChange()>
			}
		}
	//   38   70:return          
	}

	public void setChipMinHeight(float f)
	{
		if(chipMinHeight != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1028 <Field float chipMinHeight>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            22
		{
			chipMinHeight = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #1028 <Field float chipMinHeight>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #943 <Method void invalidateSelf()>
			onSizeChange();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #946 <Method void onSizeChange()>
		}
	//   12   22:return          
	}

	public void setChipMinHeightResource(int i)
	{
		setChipMinHeight(context.getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:invokevirtual   #175 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #1173 <Method float Resources.getDimension(int)>
	//    6   12:invokevirtual   #661 <Method void setChipMinHeight(float)>
	//    7   15:return          
	}

	public void setChipStartPadding(float f)
	{
		if(chipStartPadding != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #275 <Field float chipStartPadding>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            22
		{
			chipStartPadding = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #275 <Field float chipStartPadding>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #943 <Method void invalidateSelf()>
			onSizeChange();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #946 <Method void onSizeChange()>
		}
	//   12   22:return          
	}

	public void setChipStartPaddingResource(int i)
	{
		setChipStartPadding(context.getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:invokevirtual   #175 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #1173 <Method float Resources.getDimension(int)>
	//    6   12:invokevirtual   #850 <Method void setChipStartPadding(float)>
	//    7   15:return          
	}

	public void setChipStrokeColor(ColorStateList colorstatelist)
	{
		if(chipStrokeColor != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #917 <Field ColorStateList chipStrokeColor>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       22
		{
			chipStrokeColor = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #917 <Field ColorStateList chipStrokeColor>
			onStateChange(getState());
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #261 <Method int[] getState()>
	//   10   18:invokevirtual   #1163 <Method boolean onStateChange(int[])>
	//   11   21:pop             
		}
	//   12   22:return          
	}

	public void setChipStrokeColorResource(int i)
	{
		setChipStrokeColor(AppCompatResources.getColorStateList(context, i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:iload_1         
	//    4    6:invokestatic    #1168 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//    5    9:invokevirtual   #673 <Method void setChipStrokeColor(ColorStateList)>
	//    6   12:return          
	}

	public void setChipStrokeWidth(float f)
	{
		if(chipStrokeWidth != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #512 <Field float chipStrokeWidth>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            26
		{
			chipStrokeWidth = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #512 <Field float chipStrokeWidth>
			chipPaint.setStrokeWidth(f);
	//    8   14:aload_0         
	//    9   15:getfield        #130 <Field Paint chipPaint>
	//   10   18:fload_1         
	//   11   19:invokevirtual   #1195 <Method void Paint.setStrokeWidth(float)>
			invalidateSelf();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #943 <Method void invalidateSelf()>
		}
	//   14   26:return          
	}

	public void setChipStrokeWidthResource(int i)
	{
		setChipStrokeWidth(context.getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:invokevirtual   #175 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #1173 <Method float Resources.getDimension(int)>
	//    6   12:invokevirtual   #679 <Method void setChipStrokeWidth(float)>
	//    7   15:return          
	}

	public void setCloseIcon(Drawable drawable)
	{
		Drawable drawable1 = getCloseIcon();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1198 <Method Drawable getCloseIcon()>
	//    2    4:astore          4
		if(drawable1 != drawable)
	//*   3    6:aload           4
	//*   4    8:aload_1         
	//*   5    9:if_acmpeq       79
		{
			float f = calculateCloseIconWidth();
	//    6   12:aload_0         
	//    7   13:invokespecial   #336 <Method float calculateCloseIconWidth()>
	//    8   16:fstore_2        
			if(drawable != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          32
				drawable = DrawableCompat.wrap(drawable).mutate();
	//   11   21:aload_1         
	//   12   22:invokestatic    #1179 <Method Drawable DrawableCompat.wrap(Drawable)>
	//   13   25:invokevirtual   #1182 <Method Drawable Drawable.mutate()>
	//   14   28:astore_1        
			else
	//*  15   29:goto            34
				drawable = null;
	//   16   32:aconst_null     
	//   17   33:astore_1        
			closeIcon = drawable;
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:putfield        #244 <Field Drawable closeIcon>
			float f1 = calculateCloseIconWidth();
	//   21   39:aload_0         
	//   22   40:invokespecial   #336 <Method float calculateCloseIconWidth()>
	//   23   43:fstore_3        
			unapplyChildDrawable(drawable1);
	//   24   44:aload_0         
	//   25   45:aload           4
	//   26   47:invokespecial   #1151 <Method void unapplyChildDrawable(Drawable)>
			if(showsCloseIcon())
	//*  27   50:aload_0         
	//*  28   51:invokespecial   #309 <Method boolean showsCloseIcon()>
	//*  29   54:ifeq            65
				applyChildDrawable(closeIcon);
	//   30   57:aload_0         
	//   31   58:aload_0         
	//   32   59:getfield        #244 <Field Drawable closeIcon>
	//   33   62:invokespecial   #1153 <Method void applyChildDrawable(Drawable)>
			invalidateSelf();
	//   34   65:aload_0         
	//   35   66:invokevirtual   #943 <Method void invalidateSelf()>
			if(f != f1)
	//*  36   69:fload_2         
	//*  37   70:fload_3         
	//*  38   71:fcmpl           
	//*  39   72:ifeq            79
				onSizeChange();
	//   40   75:aload_0         
	//   41   76:invokevirtual   #946 <Method void onSizeChange()>
		}
	//   42   79:return          
	}

	public void setCloseIconContentDescription(CharSequence charsequence)
	{
		if(closeIconContentDescription != charsequence)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1038 <Field CharSequence closeIconContentDescription>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       23
		{
			closeIconContentDescription = BidiFormatter.getInstance().unicodeWrap(charsequence);
	//    4    8:aload_0         
	//    5    9:invokestatic    #1205 <Method BidiFormatter BidiFormatter.getInstance()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #1209 <Method CharSequence BidiFormatter.unicodeWrap(CharSequence)>
	//    8   16:putfield        #1038 <Field CharSequence closeIconContentDescription>
			invalidateSelf();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #943 <Method void invalidateSelf()>
		}
	//   11   23:return          
	}

	public void setCloseIconEnabled(boolean flag)
	{
		setCloseIconVisible(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #777 <Method void setCloseIconVisible(boolean)>
	//    3    5:return          
	}

	public void setCloseIconEnabledResource(int i)
	{
		setCloseIconVisible(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #1213 <Method void setCloseIconVisible(int)>
	//    3    5:return          
	}

	public void setCloseIconEndPadding(float f)
	{
		if(closeIconEndPadding != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field float closeIconEndPadding>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            29
		{
			closeIconEndPadding = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #313 <Field float closeIconEndPadding>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #943 <Method void invalidateSelf()>
			if(showsCloseIcon())
	//*  10   18:aload_0         
	//*  11   19:invokespecial   #309 <Method boolean showsCloseIcon()>
	//*  12   22:ifeq            29
				onSizeChange();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #946 <Method void onSizeChange()>
		}
	//   15   29:return          
	}

	public void setCloseIconEndPaddingResource(int i)
	{
		setCloseIconEndPadding(context.getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:invokevirtual   #175 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #1173 <Method float Resources.getDimension(int)>
	//    6   12:invokevirtual   #886 <Method void setCloseIconEndPadding(float)>
	//    7   15:return          
	}

	public void setCloseIconResource(int i)
	{
		setCloseIcon(AppCompatResources.getDrawable(context, i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:iload_1         
	//    4    6:invokestatic    #1162 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #789 <Method void setCloseIcon(Drawable)>
	//    6   12:return          
	}

	public void setCloseIconSize(float f)
	{
		if(closeIconSize != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field float closeIconSize>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            29
		{
			closeIconSize = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #315 <Field float closeIconSize>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #943 <Method void invalidateSelf()>
			if(showsCloseIcon())
	//*  10   18:aload_0         
	//*  11   19:invokespecial   #309 <Method boolean showsCloseIcon()>
	//*  12   22:ifeq            29
				onSizeChange();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #946 <Method void onSizeChange()>
		}
	//   15   29:return          
	}

	public void setCloseIconSizeResource(int i)
	{
		setCloseIconSize(context.getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:invokevirtual   #175 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #1173 <Method float Resources.getDimension(int)>
	//    6   12:invokevirtual   #801 <Method void setCloseIconSize(float)>
	//    7   15:return          
	}

	public void setCloseIconStartPadding(float f)
	{
		if(closeIconStartPadding != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #317 <Field float closeIconStartPadding>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            29
		{
			closeIconStartPadding = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #317 <Field float closeIconStartPadding>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #943 <Method void invalidateSelf()>
			if(showsCloseIcon())
	//*  10   18:aload_0         
	//*  11   19:invokespecial   #309 <Method boolean showsCloseIcon()>
	//*  12   22:ifeq            29
				onSizeChange();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #946 <Method void onSizeChange()>
		}
	//   15   29:return          
	}

	public void setCloseIconStartPaddingResource(int i)
	{
		setCloseIconStartPadding(context.getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:invokevirtual   #175 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #1173 <Method float Resources.getDimension(int)>
	//    6   12:invokevirtual   #880 <Method void setCloseIconStartPadding(float)>
	//    7   15:return          
	}

	public boolean setCloseIconState(int ai[])
	{
		if(!Arrays.equals(closeIconStateSet, ai))
	//*   0    0:aload_0         
	//*   1    1:getfield        #1043 <Field int[] closeIconStateSet>
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #1221 <Method boolean Arrays.equals(int[], int[])>
	//*   4    8:ifne            33
		{
			closeIconStateSet = ai;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #1043 <Field int[] closeIconStateSet>
			if(showsCloseIcon())
	//*   8   16:aload_0         
	//*   9   17:invokespecial   #309 <Method boolean showsCloseIcon()>
	//*  10   20:ifeq            33
				return onStateChange(getState(), ai);
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:invokevirtual   #261 <Method int[] getState()>
	//   14   28:aload_1         
	//   15   29:invokespecial   #1141 <Method boolean onStateChange(int[], int[])>
	//   16   32:ireturn         
		}
		return false;
	//   17   33:iconst_0        
	//   18   34:ireturn         
	}

	public void setCloseIconTint(ColorStateList colorstatelist)
	{
		if(closeIconTint != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #254 <Field ColorStateList closeIconTint>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       37
		{
			closeIconTint = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #254 <Field ColorStateList closeIconTint>
			if(showsCloseIcon())
	//*   7   13:aload_0         
	//*   8   14:invokespecial   #309 <Method boolean showsCloseIcon()>
	//*   9   17:ifeq            28
				DrawableCompat.setTintList(closeIcon, colorstatelist);
	//   10   20:aload_0         
	//   11   21:getfield        #244 <Field Drawable closeIcon>
	//   12   24:aload_1         
	//   13   25:invokestatic    #258 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			onStateChange(getState());
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:invokevirtual   #261 <Method int[] getState()>
	//   17   33:invokevirtual   #1163 <Method boolean onStateChange(int[])>
	//   18   36:pop             
		}
	//   19   37:return          
	}

	public void setCloseIconTintResource(int i)
	{
		setCloseIconTint(AppCompatResources.getColorStateList(context, i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:iload_1         
	//    4    6:invokestatic    #1168 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//    5    9:invokevirtual   #795 <Method void setCloseIconTint(ColorStateList)>
	//    6   12:return          
	}

	public void setCloseIconVisible(int i)
	{
		setCloseIconVisible(context.getResources().getBoolean(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:invokevirtual   #175 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #1149 <Method boolean Resources.getBoolean(int)>
	//    6   12:invokevirtual   #777 <Method void setCloseIconVisible(boolean)>
	//    7   15:return          
	}

	public void setCloseIconVisible(boolean flag)
	{
		if(closeIconVisible != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #950 <Field boolean closeIconVisible>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          70
		{
			boolean flag2 = showsCloseIcon();
	//    4    8:aload_0         
	//    5    9:invokespecial   #309 <Method boolean showsCloseIcon()>
	//    6   12:istore_3        
			closeIconVisible = flag;
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:putfield        #950 <Field boolean closeIconVisible>
			flag = showsCloseIcon();
	//   10   18:aload_0         
	//   11   19:invokespecial   #309 <Method boolean showsCloseIcon()>
	//   12   22:istore_1        
			boolean flag1;
			if(flag2 != flag)
	//*  13   23:iload_3         
	//*  14   24:iload_1         
	//*  15   25:icmpeq          33
				flag1 = true;
	//   16   28:iconst_1        
	//   17   29:istore_2        
			else
	//*  18   30:goto            35
				flag1 = false;
	//   19   33:iconst_0        
	//   20   34:istore_2        
			if(flag1)
	//*  21   35:iload_2         
	//*  22   36:ifeq            70
			{
				if(flag)
	//*  23   39:iload_1         
	//*  24   40:ifeq            54
					applyChildDrawable(closeIcon);
	//   25   43:aload_0         
	//   26   44:aload_0         
	//   27   45:getfield        #244 <Field Drawable closeIcon>
	//   28   48:invokespecial   #1153 <Method void applyChildDrawable(Drawable)>
				else
	//*  29   51:goto            62
					unapplyChildDrawable(closeIcon);
	//   30   54:aload_0         
	//   31   55:aload_0         
	//   32   56:getfield        #244 <Field Drawable closeIcon>
	//   33   59:invokespecial   #1151 <Method void unapplyChildDrawable(Drawable)>
				invalidateSelf();
	//   34   62:aload_0         
	//   35   63:invokevirtual   #943 <Method void invalidateSelf()>
				onSizeChange();
	//   36   66:aload_0         
	//   37   67:invokevirtual   #946 <Method void onSizeChange()>
			}
		}
	//   38   70:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		if(colorFilter != colorfilter)
	//*   0    0:aload_0         
	//*   1    1:getfield        #610 <Field ColorFilter colorFilter>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			colorFilter = colorfilter;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #610 <Field ColorFilter colorFilter>
			invalidateSelf();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #943 <Method void invalidateSelf()>
		}
	//    9   17:return          
	}

	public void setDelegate(Delegate delegate1)
	{
		_flddelegate = new WeakReference(((Object) (delegate1)));
	//    0    0:aload_0         
	//    1    1:new             #156 <Class WeakReference>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #159 <Method void WeakReference(Object)>
	//    5    9:putfield        #161 <Field WeakReference _flddelegate>
	//    6   12:return          
	}

	public void setEllipsize(android.text.TextUtils.TruncateAt truncateat)
	{
		truncateAt = truncateat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #588 <Field android.text.TextUtils$TruncateAt truncateAt>
	//    3    5:return          
	}

	public void setHideMotionSpec(MotionSpec motionspec)
	{
		hideMotionSpec = motionspec;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1052 <Field MotionSpec hideMotionSpec>
	//    3    5:return          
	}

	public void setHideMotionSpecResource(int i)
	{
		setHideMotionSpec(MotionSpec.createFromResource(context, i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:iload_1         
	//    4    6:invokestatic    #1230 <Method MotionSpec MotionSpec.createFromResource(Context, int)>
	//    5    9:invokevirtual   #844 <Method void setHideMotionSpec(MotionSpec)>
	//    6   12:return          
	}

	public void setIconEndPadding(float f)
	{
		if(iconEndPadding != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #962 <Field float iconEndPadding>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            38
		{
			float f1 = calculateChipIconWidth();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #332 <Method float calculateChipIconWidth()>
	//    7   13:fstore_2        
			iconEndPadding = f;
	//    8   14:aload_0         
	//    9   15:fload_1         
	//   10   16:putfield        #962 <Field float iconEndPadding>
			f = calculateChipIconWidth();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #332 <Method float calculateChipIconWidth()>
	//   13   23:fstore_1        
			invalidateSelf();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #943 <Method void invalidateSelf()>
			if(f1 != f)
	//*  16   28:fload_2         
	//*  17   29:fload_1         
	//*  18   30:fcmpl           
	//*  19   31:ifeq            38
				onSizeChange();
	//   20   34:aload_0         
	//   21   35:invokevirtual   #946 <Method void onSizeChange()>
		}
	//   22   38:return          
	}

	public void setIconEndPaddingResource(int i)
	{
		setIconEndPadding(context.getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:invokevirtual   #175 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #1173 <Method float Resources.getDimension(int)>
	//    6   12:invokevirtual   #862 <Method void setIconEndPadding(float)>
	//    7   15:return          
	}

	public void setIconStartPadding(float f)
	{
		if(iconStartPadding != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #277 <Field float iconStartPadding>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            38
		{
			float f1 = calculateChipIconWidth();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #332 <Method float calculateChipIconWidth()>
	//    7   13:fstore_2        
			iconStartPadding = f;
	//    8   14:aload_0         
	//    9   15:fload_1         
	//   10   16:putfield        #277 <Field float iconStartPadding>
			f = calculateChipIconWidth();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #332 <Method float calculateChipIconWidth()>
	//   13   23:fstore_1        
			invalidateSelf();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #943 <Method void invalidateSelf()>
			if(f1 != f)
	//*  16   28:fload_2         
	//*  17   29:fload_1         
	//*  18   30:fcmpl           
	//*  19   31:ifeq            38
				onSizeChange();
	//   20   34:aload_0         
	//   21   35:invokevirtual   #946 <Method void onSizeChange()>
		}
	//   22   38:return          
	}

	public void setIconStartPaddingResource(int i)
	{
		setIconStartPadding(context.getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:invokevirtual   #175 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #1173 <Method float Resources.getDimension(int)>
	//    6   12:invokevirtual   #856 <Method void setIconStartPadding(float)>
	//    7   15:return          
	}

	public void setMaxWidth(int i)
	{
		maxWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #1058 <Field int maxWidth>
	//    3    5:return          
	}

	public void setRippleColor(ColorStateList colorstatelist)
	{
		if(rippleColor != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #954 <Field ColorStateList rippleColor>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       26
		{
			rippleColor = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #954 <Field ColorStateList rippleColor>
			updateCompatRippleColor();
	//    7   13:aload_0         
	//    8   14:invokespecial   #1234 <Method void updateCompatRippleColor()>
			onStateChange(getState());
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #261 <Method int[] getState()>
	//   12   22:invokevirtual   #1163 <Method boolean onStateChange(int[])>
	//   13   25:pop             
		}
	//   14   26:return          
	}

	public void setRippleColorResource(int i)
	{
		setRippleColor(AppCompatResources.getColorStateList(context, i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:iload_1         
	//    4    6:invokestatic    #1168 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//    5    9:invokevirtual   #685 <Method void setRippleColor(ColorStateList)>
	//    6   12:return          
	}

	void setShouldDrawText(boolean flag)
	{
		shouldDrawText = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #208 <Field boolean shouldDrawText>
	//    3    5:return          
	}

	public void setShowMotionSpec(MotionSpec motionspec)
	{
		showMotionSpec = motionspec;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1090 <Field MotionSpec showMotionSpec>
	//    3    5:return          
	}

	public void setShowMotionSpecResource(int i)
	{
		setShowMotionSpec(MotionSpec.createFromResource(context, i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:iload_1         
	//    4    6:invokestatic    #1230 <Method MotionSpec MotionSpec.createFromResource(Context, int)>
	//    5    9:invokevirtual   #838 <Method void setShowMotionSpec(MotionSpec)>
	//    6   12:return          
	}

	public void setText(CharSequence charsequence)
	{
		Object obj = ((Object) (charsequence));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(charsequence == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       9
			obj = "";
	//    4    6:ldc1            #167 <String "">
	//    5    8:astore_2        
		if(rawText != obj)
	//*   6    9:aload_0         
	//*   7   10:getfield        #169 <Field CharSequence rawText>
	//*   8   13:aload_2         
	//*   9   14:if_acmpeq       46
		{
			rawText = ((CharSequence) (obj));
	//   10   17:aload_0         
	//   11   18:aload_2         
	//   12   19:putfield        #169 <Field CharSequence rawText>
			unicodeWrappedText = BidiFormatter.getInstance().unicodeWrap(((CharSequence) (obj)));
	//   13   22:aload_0         
	//   14   23:invokestatic    #1205 <Method BidiFormatter BidiFormatter.getInstance()>
	//   15   26:aload_2         
	//   16   27:invokevirtual   #1209 <Method CharSequence BidiFormatter.unicodeWrap(CharSequence)>
	//   17   30:putfield        #329 <Field CharSequence unicodeWrappedText>
			textWidthDirty = true;
	//   18   33:aload_0         
	//   19   34:iconst_1        
	//   20   35:putfield        #163 <Field boolean textWidthDirty>
			invalidateSelf();
	//   21   38:aload_0         
	//   22   39:invokevirtual   #943 <Method void invalidateSelf()>
			onSizeChange();
	//   23   42:aload_0         
	//   24   43:invokevirtual   #946 <Method void onSizeChange()>
		}
	//   25   46:return          
	}

	public void setTextAppearance(TextAppearance textappearance)
	{
		if(textAppearance != textappearance)
	//*   0    0:aload_0         
	//*   1    1:getfield        #557 <Field TextAppearance textAppearance>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       51
		{
			textAppearance = textappearance;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #557 <Field TextAppearance textAppearance>
			if(textappearance != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          38
			{
				textappearance.updateMeasureState(context, textPaint, fontCallback);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #165 <Field Context context>
	//   12   22:aload_0         
	//   13   23:getfield        #125 <Field TextPaint textPaint>
	//   14   26:aload_0         
	//   15   27:getfield        #118 <Field android.support.v4.content.res.ResourcesCompat$FontCallback fontCallback>
	//   16   30:invokevirtual   #1240 <Method void TextAppearance.updateMeasureState(Context, TextPaint, android.support.v4.content.res.ResourcesCompat$FontCallback)>
				textWidthDirty = true;
	//   17   33:aload_0         
	//   18   34:iconst_1        
	//   19   35:putfield        #163 <Field boolean textWidthDirty>
			}
			onStateChange(getState());
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:invokevirtual   #261 <Method int[] getState()>
	//   23   43:invokevirtual   #1163 <Method boolean onStateChange(int[])>
	//   24   46:pop             
			onSizeChange();
	//   25   47:aload_0         
	//   26   48:invokevirtual   #946 <Method void onSizeChange()>
		}
	//   27   51:return          
	}

	public void setTextAppearanceResource(int i)
	{
		setTextAppearance(new TextAppearance(context, i));
	//    0    0:aload_0         
	//    1    1:new             #562 <Class TextAppearance>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #165 <Field Context context>
	//    5    9:iload_1         
	//    6   10:invokespecial   #1244 <Method void TextAppearance(Context, int)>
	//    7   13:invokevirtual   #707 <Method void setTextAppearance(TextAppearance)>
	//    8   16:return          
	}

	public void setTextEndPadding(float f)
	{
		if(textEndPadding != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #319 <Field float textEndPadding>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            22
		{
			textEndPadding = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #319 <Field float textEndPadding>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #943 <Method void invalidateSelf()>
			onSizeChange();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #946 <Method void onSizeChange()>
		}
	//   12   22:return          
	}

	public void setTextEndPaddingResource(int i)
	{
		setTextEndPadding(context.getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:invokevirtual   #175 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #1173 <Method float Resources.getDimension(int)>
	//    6   12:invokevirtual   #874 <Method void setTextEndPadding(float)>
	//    7   15:return          
	}

	public void setTextResource(int i)
	{
		setText(((CharSequence) (context.getResources().getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:invokevirtual   #175 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #1250 <Method String Resources.getString(int)>
	//    6   12:invokevirtual   #696 <Method void setText(CharSequence)>
	//    7   15:return          
	}

	public void setTextStartPadding(float f)
	{
		if(textStartPadding != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #334 <Field float textStartPadding>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            22
		{
			textStartPadding = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #334 <Field float textStartPadding>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #943 <Method void invalidateSelf()>
			onSizeChange();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #946 <Method void onSizeChange()>
		}
	//   12   22:return          
	}

	public void setTextStartPaddingResource(int i)
	{
		setTextStartPadding(context.getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #165 <Field Context context>
	//    3    5:invokevirtual   #175 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #1173 <Method float Resources.getDimension(int)>
	//    6   12:invokevirtual   #868 <Method void setTextStartPadding(float)>
	//    7   15:return          
	}

	public void setTintList(ColorStateList colorstatelist)
	{
		if(tint != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #930 <Field ColorStateList tint>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       22
		{
			tint = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #930 <Field ColorStateList tint>
			onStateChange(getState());
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #261 <Method int[] getState()>
	//   10   18:invokevirtual   #1163 <Method boolean onStateChange(int[])>
	//   11   21:pop             
		}
	//   12   22:return          
	}

	public void setTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(tintMode != mode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #154 <Field android.graphics.PorterDuff$Mode tintMode>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       30
		{
			tintMode = mode;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #154 <Field android.graphics.PorterDuff$Mode tintMode>
			tintFilter = DrawableUtils.updateTintFilter(((Drawable) (this)), tint, mode);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #930 <Field ColorStateList tint>
	//   11   19:aload_1         
	//   12   20:invokestatic    #938 <Method PorterDuffColorFilter DrawableUtils.updateTintFilter(Drawable, ColorStateList, android.graphics.PorterDuff$Mode)>
	//   13   23:putfield        #612 <Field PorterDuffColorFilter tintFilter>
			invalidateSelf();
	//   14   26:aload_0         
	//   15   27:invokevirtual   #943 <Method void invalidateSelf()>
		}
	//   16   30:return          
	}

	public void setUseCompatRipple(boolean flag)
	{
		if(useCompatRipple != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #921 <Field boolean useCompatRipple>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          26
		{
			useCompatRipple = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #921 <Field boolean useCompatRipple>
			updateCompatRippleColor();
	//    7   13:aload_0         
	//    8   14:invokespecial   #1234 <Method void updateCompatRippleColor()>
			onStateChange(getState());
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #261 <Method int[] getState()>
	//   12   22:invokevirtual   #1163 <Method boolean onStateChange(int[])>
	//   13   25:pop             
		}
	//   14   26:return          
	}

	public boolean setVisible(boolean flag, boolean flag1)
	{
		boolean flag3 = super.setVisible(flag, flag1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #242 <Method boolean Drawable.setVisible(boolean, boolean)>
	//    4    6:istore          4
		boolean flag2 = flag3;
	//    5    8:iload           4
	//    6   10:istore_3        
		if(showsChipIcon())
	//*   7   11:aload_0         
	//*   8   12:invokespecial   #270 <Method boolean showsChipIcon()>
	//*   9   15:ifeq            31
			flag2 = flag3 | chipIcon.setVisible(flag, flag1);
	//   10   18:iload           4
	//   11   20:aload_0         
	//   12   21:getfield        #509 <Field Drawable chipIcon>
	//   13   24:iload_1         
	//   14   25:iload_2         
	//   15   26:invokevirtual   #242 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   16   29:ior             
	//   17   30:istore_3        
		flag3 = flag2;
	//   18   31:iload_3         
	//   19   32:istore          4
		if(showsCheckedIcon())
	//*  20   34:aload_0         
	//*  21   35:invokespecial   #273 <Method boolean showsCheckedIcon()>
	//*  22   38:ifeq            54
			flag3 = flag2 | checkedIcon.setVisible(flag, flag1);
	//   23   41:iload_3         
	//   24   42:aload_0         
	//   25   43:getfield        #363 <Field Drawable checkedIcon>
	//   26   46:iload_1         
	//   27   47:iload_2         
	//   28   48:invokevirtual   #242 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   29   51:ior             
	//   30   52:istore          4
		flag2 = flag3;
	//   31   54:iload           4
	//   32   56:istore_3        
		if(showsCloseIcon())
	//*  33   57:aload_0         
	//*  34   58:invokespecial   #309 <Method boolean showsCloseIcon()>
	//*  35   61:ifeq            77
			flag2 = flag3 | closeIcon.setVisible(flag, flag1);
	//   36   64:iload           4
	//   37   66:aload_0         
	//   38   67:getfield        #244 <Field Drawable closeIcon>
	//   39   70:iload_1         
	//   40   71:iload_2         
	//   41   72:invokevirtual   #242 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   42   75:ior             
	//   43   76:istore_3        
		if(flag2)
	//*  44   77:iload_3         
	//*  45   78:ifeq            85
			invalidateSelf();
	//   46   81:aload_0         
	//   47   82:invokevirtual   #943 <Method void invalidateSelf()>
		return flag2;
	//   48   85:iload_3         
	//   49   86:ireturn         
	}

	boolean shouldDrawText()
	{
		return shouldDrawText;
	//    0    0:aload_0         
	//    1    1:getfield        #208 <Field boolean shouldDrawText>
	//    2    4:ireturn         
	}

	public void unscheduleDrawable(Drawable drawable, Runnable runnable)
	{
		drawable = ((Drawable) (getCallback()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1099 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
			((android.graphics.drawable.Drawable.Callback) (drawable)).unscheduleDrawable(((Drawable) (this)), runnable);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokeinterface #1258 <Method void android.graphics.drawable.Drawable$Callback.unscheduleDrawable(Drawable, Runnable)>
	//    9   17:return          
	}

	private static final boolean DEBUG = false;
	private static final int DEFAULT_STATE[] = {
		0x101009e
	};
	private static final String NAMESPACE_APP = "http://schemas.android.com/apk/res-auto";
	private int alpha;
	private boolean checkable;
	private Drawable checkedIcon;
	private boolean checkedIconVisible;
	private ColorStateList chipBackgroundColor;
	private float chipCornerRadius;
	private float chipEndPadding;
	private Drawable chipIcon;
	private float chipIconSize;
	private ColorStateList chipIconTint;
	private boolean chipIconVisible;
	private float chipMinHeight;
	private final Paint chipPaint = new Paint(1);
	private float chipStartPadding;
	private ColorStateList chipStrokeColor;
	private float chipStrokeWidth;
	private Drawable closeIcon;
	private CharSequence closeIconContentDescription;
	private float closeIconEndPadding;
	private float closeIconSize;
	private float closeIconStartPadding;
	private int closeIconStateSet[];
	private ColorStateList closeIconTint;
	private boolean closeIconVisible;
	private ColorFilter colorFilter;
	private ColorStateList compatRippleColor;
	private final Context context;
	private boolean currentChecked;
	private int currentChipBackgroundColor;
	private int currentChipStrokeColor;
	private int currentCompatRippleColor;
	private int currentTextColor;
	private int currentTint;
	private final Paint debugPaint = null;
	private WeakReference _flddelegate;
	private final android.support.v4.content.res.ResourcesCompat.FontCallback fontCallback = new android.support.v4.content.res.ResourcesCompat.FontCallback() {

		public void onFontRetrievalFailed(int i)
		{
		//    0    0:return          
		}

		public void onFontRetrieved(Typeface typeface)
		{
			textWidthDirty = true;
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field ChipDrawable this$0>
		//    2    4:iconst_1        
		//    3    5:invokestatic    #25  <Method boolean ChipDrawable.access$002(ChipDrawable, boolean)>
		//    4    8:pop             
			onSizeChange();
		//    5    9:aload_0         
		//    6   10:getfield        #12  <Field ChipDrawable this$0>
		//    7   13:invokevirtual   #28  <Method void ChipDrawable.onSizeChange()>
			invalidateSelf();
		//    8   16:aload_0         
		//    9   17:getfield        #12  <Field ChipDrawable this$0>
		//   10   20:invokevirtual   #31  <Method void ChipDrawable.invalidateSelf()>
		//   11   23:return          
		}

		final ChipDrawable this$0;

			
			{
				this$0 = ChipDrawable.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field ChipDrawable this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void android.support.v4.content.res.ResourcesCompat$FontCallback()>
			//    5    9:return          
			}
	}
;
	private final android.graphics.Paint.FontMetrics fontMetrics = new android.graphics.Paint.FontMetrics();
	private MotionSpec hideMotionSpec;
	private float iconEndPadding;
	private float iconStartPadding;
	private int maxWidth;
	private final PointF pointF = new PointF();
	private CharSequence rawText;
	private final RectF rectF = new RectF();
	private ColorStateList rippleColor;
	private boolean shouldDrawText;
	private MotionSpec showMotionSpec;
	private TextAppearance textAppearance;
	private float textEndPadding;
	private final TextPaint textPaint = new TextPaint(1);
	private float textStartPadding;
	private float textWidth;
	private boolean textWidthDirty;
	private ColorStateList tint;
	private PorterDuffColorFilter tintFilter;
	private android.graphics.PorterDuff.Mode tintMode;
	private android.text.TextUtils.TruncateAt truncateAt;
	private CharSequence unicodeWrappedText;
	private boolean useCompatRipple;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #106 <Int 0x101009e>
	//    5    7:iastore         
	//    6    8:putstatic       #108 <Field int[] DEFAULT_STATE>
	//*   7   11:return          
	}


/*
	static boolean access$002(ChipDrawable chipdrawable, boolean flag)
	{
		chipdrawable.textWidthDirty = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #163 <Field boolean textWidthDirty>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/
}
