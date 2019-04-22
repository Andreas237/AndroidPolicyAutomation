// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.support.design.animation.MotionSpec;
import android.support.design.canvas.CanvasCompat;
import android.support.design.drawable.DrawableUtils;
import android.support.design.resources.TextAppearance;
import android.support.design.ripple.RippleUtils;
import android.support.v4.graphics.ColorUtils;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.graphics.drawable.TintAwareDrawable;
import android.support.v4.text.BidiFormatter;
import android.support.v7.content.res.AppCompatResources;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class ChipDrawable extends Drawable
	implements android.graphics.drawable.Drawable.Callback, TintAwareDrawable
{
	public static interface Delegate
	{

		public abstract void onChipDrawableSizeChange();
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
	//    4    6:invokevirtual   #107 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			DrawableCompat.setLayoutDirection(drawable, DrawableCompat.getLayoutDirection(((Drawable) (this))));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokestatic    #113 <Method int DrawableCompat.getLayoutDirection(Drawable)>
	//    8   14:invokestatic    #117 <Method boolean DrawableCompat.setLayoutDirection(Drawable, int)>
	//    9   17:pop             
			drawable.setLevel(getLevel());
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:invokevirtual   #121 <Method int getLevel()>
	//   13   23:invokevirtual   #125 <Method boolean Drawable.setLevel(int)>
	//   14   26:pop             
			drawable.setVisible(isVisible(), false);
	//   15   27:aload_1         
	//   16   28:aload_0         
	//   17   29:invokevirtual   #129 <Method boolean isVisible()>
	//   18   32:iconst_0        
	//   19   33:invokevirtual   #133 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   20   36:pop             
			if(drawable == closeIcon)
	//*  21   37:aload_1         
	//*  22   38:aload_0         
	//*  23   39:getfield        #135 <Field Drawable closeIcon>
	//*  24   42:if_acmpne       70
			{
				if(drawable.isStateful())
	//*  25   45:aload_1         
	//*  26   46:invokevirtual   #138 <Method boolean Drawable.isStateful()>
	//*  27   49:ifeq            61
					drawable.setState(getCloseIconState());
	//   28   52:aload_1         
	//   29   53:aload_0         
	//   30   54:invokevirtual   #142 <Method int[] getCloseIconState()>
	//   31   57:invokevirtual   #146 <Method boolean Drawable.setState(int[])>
	//   32   60:pop             
				DrawableCompat.setTintList(drawable, closeIconTint);
	//   33   61:aload_1         
	//   34   62:aload_0         
	//   35   63:getfield        #148 <Field ColorStateList closeIconTint>
	//   36   66:invokestatic    #152 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
				return;
	//   37   69:return          
			}
			if(drawable.isStateful())
	//*  38   70:aload_1         
	//*  39   71:invokevirtual   #138 <Method boolean Drawable.isStateful()>
	//*  40   74:ifeq            86
				drawable.setState(getState());
	//   41   77:aload_1         
	//   42   78:aload_0         
	//   43   79:invokevirtual   #155 <Method int[] getState()>
	//   44   82:invokevirtual   #146 <Method boolean Drawable.setState(int[])>
	//   45   85:pop             
		}
	//   46   86:return          
	}

	private void calculateChipIconBounds(Rect rect, RectF rectf)
	{
		rectf.setEmpty();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #163 <Method void RectF.setEmpty()>
		if(showsChipIcon() || showsCheckedIcon())
	//*   2    4:aload_0         
	//*   3    5:invokespecial   #166 <Method boolean showsChipIcon()>
	//*   4    8:ifne            18
	//*   5   11:aload_0         
	//*   6   12:invokespecial   #169 <Method boolean showsCheckedIcon()>
	//*   7   15:ifeq            114
		{
			float f = chipStartPadding + iconStartPadding;
	//    8   18:aload_0         
	//    9   19:getfield        #171 <Field float chipStartPadding>
	//   10   22:aload_0         
	//   11   23:getfield        #173 <Field float iconStartPadding>
	//   12   26:fadd            
	//   13   27:fstore_3        
			if(DrawableCompat.getLayoutDirection(((Drawable) (this))) == 0)
	//*  14   28:aload_0         
	//*  15   29:invokestatic    #113 <Method int DrawableCompat.getLayoutDirection(Drawable)>
	//*  16   32:ifne            62
			{
				rectf.left = (float)rect.left + f;
	//   17   35:aload_2         
	//   18   36:aload_1         
	//   19   37:getfield        #178 <Field int Rect.left>
	//   20   40:i2f             
	//   21   41:fload_3         
	//   22   42:fadd            
	//   23   43:putfield        #180 <Field float RectF.left>
				rectf.right = rectf.left + chipIconSize;
	//   24   46:aload_2         
	//   25   47:aload_2         
	//   26   48:getfield        #180 <Field float RectF.left>
	//   27   51:aload_0         
	//   28   52:getfield        #182 <Field float chipIconSize>
	//   29   55:fadd            
	//   30   56:putfield        #185 <Field float RectF.right>
			} else
	//*  31   59:goto            86
			{
				rectf.right = (float)rect.right - f;
	//   32   62:aload_2         
	//   33   63:aload_1         
	//   34   64:getfield        #187 <Field int Rect.right>
	//   35   67:i2f             
	//   36   68:fload_3         
	//   37   69:fsub            
	//   38   70:putfield        #185 <Field float RectF.right>
				rectf.left = rectf.right - chipIconSize;
	//   39   73:aload_2         
	//   40   74:aload_2         
	//   41   75:getfield        #185 <Field float RectF.right>
	//   42   78:aload_0         
	//   43   79:getfield        #182 <Field float chipIconSize>
	//   44   82:fsub            
	//   45   83:putfield        #180 <Field float RectF.left>
			}
			rectf.top = rect.exactCenterY() - chipIconSize / 2.0F;
	//   46   86:aload_2         
	//   47   87:aload_1         
	//   48   88:invokevirtual   #191 <Method float Rect.exactCenterY()>
	//   49   91:aload_0         
	//   50   92:getfield        #182 <Field float chipIconSize>
	//   51   95:fconst_2        
	//   52   96:fdiv            
	//   53   97:fsub            
	//   54   98:putfield        #194 <Field float RectF.top>
			rectf.bottom = rectf.top + chipIconSize;
	//   55  101:aload_2         
	//   56  102:aload_2         
	//   57  103:getfield        #194 <Field float RectF.top>
	//   58  106:aload_0         
	//   59  107:getfield        #182 <Field float chipIconSize>
	//   60  110:fadd            
	//   61  111:putfield        #197 <Field float RectF.bottom>
		}
	//   62  114:return          
	}

	private void calculateChipTouchBounds(Rect rect, RectF rectf)
	{
		rectf.set(rect);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #202 <Method void RectF.set(Rect)>
		if(showsCloseIcon())
	//*   3    5:aload_0         
	//*   4    6:invokespecial   #205 <Method boolean showsCloseIcon()>
	//*   5    9:ifeq            67
		{
			float f = chipEndPadding + closeIconEndPadding + closeIconSize + closeIconStartPadding + textEndPadding;
	//    6   12:aload_0         
	//    7   13:getfield        #207 <Field float chipEndPadding>
	//    8   16:aload_0         
	//    9   17:getfield        #209 <Field float closeIconEndPadding>
	//   10   20:fadd            
	//   11   21:aload_0         
	//   12   22:getfield        #211 <Field float closeIconSize>
	//   13   25:fadd            
	//   14   26:aload_0         
	//   15   27:getfield        #213 <Field float closeIconStartPadding>
	//   16   30:fadd            
	//   17   31:aload_0         
	//   18   32:getfield        #215 <Field float textEndPadding>
	//   19   35:fadd            
	//   20   36:fstore_3        
			if(DrawableCompat.getLayoutDirection(((Drawable) (this))) == 0)
	//*  21   37:aload_0         
	//*  22   38:invokestatic    #113 <Method int DrawableCompat.getLayoutDirection(Drawable)>
	//*  23   41:ifne            56
			{
				rectf.right = (float)rect.right - f;
	//   24   44:aload_2         
	//   25   45:aload_1         
	//   26   46:getfield        #187 <Field int Rect.right>
	//   27   49:i2f             
	//   28   50:fload_3         
	//   29   51:fsub            
	//   30   52:putfield        #185 <Field float RectF.right>
				return;
	//   31   55:return          
			}
			rectf.left = (float)rect.left + f;
	//   32   56:aload_2         
	//   33   57:aload_1         
	//   34   58:getfield        #178 <Field int Rect.left>
	//   35   61:i2f             
	//   36   62:fload_3         
	//   37   63:fadd            
	//   38   64:putfield        #180 <Field float RectF.left>
		}
	//   39   67:return          
	}

	private void calculateCloseIconBounds(Rect rect, RectF rectf)
	{
		rectf.setEmpty();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #163 <Method void RectF.setEmpty()>
		if(showsCloseIcon())
	//*   2    4:aload_0         
	//*   3    5:invokespecial   #205 <Method boolean showsCloseIcon()>
	//*   4    8:ifeq            107
		{
			float f = chipEndPadding + closeIconEndPadding;
	//    5   11:aload_0         
	//    6   12:getfield        #207 <Field float chipEndPadding>
	//    7   15:aload_0         
	//    8   16:getfield        #209 <Field float closeIconEndPadding>
	//    9   19:fadd            
	//   10   20:fstore_3        
			if(DrawableCompat.getLayoutDirection(((Drawable) (this))) == 0)
	//*  11   21:aload_0         
	//*  12   22:invokestatic    #113 <Method int DrawableCompat.getLayoutDirection(Drawable)>
	//*  13   25:ifne            55
			{
				rectf.right = (float)rect.right - f;
	//   14   28:aload_2         
	//   15   29:aload_1         
	//   16   30:getfield        #187 <Field int Rect.right>
	//   17   33:i2f             
	//   18   34:fload_3         
	//   19   35:fsub            
	//   20   36:putfield        #185 <Field float RectF.right>
				rectf.left = rectf.right - closeIconSize;
	//   21   39:aload_2         
	//   22   40:aload_2         
	//   23   41:getfield        #185 <Field float RectF.right>
	//   24   44:aload_0         
	//   25   45:getfield        #211 <Field float closeIconSize>
	//   26   48:fsub            
	//   27   49:putfield        #180 <Field float RectF.left>
			} else
	//*  28   52:goto            79
			{
				rectf.left = (float)rect.left + f;
	//   29   55:aload_2         
	//   30   56:aload_1         
	//   31   57:getfield        #178 <Field int Rect.left>
	//   32   60:i2f             
	//   33   61:fload_3         
	//   34   62:fadd            
	//   35   63:putfield        #180 <Field float RectF.left>
				rectf.right = rectf.left + closeIconSize;
	//   36   66:aload_2         
	//   37   67:aload_2         
	//   38   68:getfield        #180 <Field float RectF.left>
	//   39   71:aload_0         
	//   40   72:getfield        #211 <Field float closeIconSize>
	//   41   75:fadd            
	//   42   76:putfield        #185 <Field float RectF.right>
			}
			rectf.top = rect.exactCenterY() - closeIconSize / 2.0F;
	//   43   79:aload_2         
	//   44   80:aload_1         
	//   45   81:invokevirtual   #191 <Method float Rect.exactCenterY()>
	//   46   84:aload_0         
	//   47   85:getfield        #211 <Field float closeIconSize>
	//   48   88:fconst_2        
	//   49   89:fdiv            
	//   50   90:fsub            
	//   51   91:putfield        #194 <Field float RectF.top>
			rectf.bottom = rectf.top + closeIconSize;
	//   52   94:aload_2         
	//   53   95:aload_2         
	//   54   96:getfield        #194 <Field float RectF.top>
	//   55   99:aload_0         
	//   56  100:getfield        #211 <Field float closeIconSize>
	//   57  103:fadd            
	//   58  104:putfield        #197 <Field float RectF.bottom>
		}
	//   59  107:return          
	}

	private void calculateCloseIconTouchBounds(Rect rect, RectF rectf)
	{
		rectf.setEmpty();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #163 <Method void RectF.setEmpty()>
		if(showsCloseIcon())
	//*   2    4:aload_0         
	//*   3    5:invokespecial   #205 <Method boolean showsCloseIcon()>
	//*   4    8:ifeq            103
		{
			float f = chipEndPadding + closeIconEndPadding + closeIconSize + closeIconStartPadding + textEndPadding;
	//    5   11:aload_0         
	//    6   12:getfield        #207 <Field float chipEndPadding>
	//    7   15:aload_0         
	//    8   16:getfield        #209 <Field float closeIconEndPadding>
	//    9   19:fadd            
	//   10   20:aload_0         
	//   11   21:getfield        #211 <Field float closeIconSize>
	//   12   24:fadd            
	//   13   25:aload_0         
	//   14   26:getfield        #213 <Field float closeIconStartPadding>
	//   15   29:fadd            
	//   16   30:aload_0         
	//   17   31:getfield        #215 <Field float textEndPadding>
	//   18   34:fadd            
	//   19   35:fstore_3        
			if(DrawableCompat.getLayoutDirection(((Drawable) (this))) == 0)
	//*  20   36:aload_0         
	//*  21   37:invokestatic    #113 <Method int DrawableCompat.getLayoutDirection(Drawable)>
	//*  22   40:ifne            65
			{
				rectf.right = rect.right;
	//   23   43:aload_2         
	//   24   44:aload_1         
	//   25   45:getfield        #187 <Field int Rect.right>
	//   26   48:i2f             
	//   27   49:putfield        #185 <Field float RectF.right>
				rectf.left = rectf.right - f;
	//   28   52:aload_2         
	//   29   53:aload_2         
	//   30   54:getfield        #185 <Field float RectF.right>
	//   31   57:fload_3         
	//   32   58:fsub            
	//   33   59:putfield        #180 <Field float RectF.left>
			} else
	//*  34   62:goto            85
			{
				rectf.left = rect.left;
	//   35   65:aload_2         
	//   36   66:aload_1         
	//   37   67:getfield        #178 <Field int Rect.left>
	//   38   70:i2f             
	//   39   71:putfield        #180 <Field float RectF.left>
				rectf.right = (float)rect.left + f;
	//   40   74:aload_2         
	//   41   75:aload_1         
	//   42   76:getfield        #178 <Field int Rect.left>
	//   43   79:i2f             
	//   44   80:fload_3         
	//   45   81:fadd            
	//   46   82:putfield        #185 <Field float RectF.right>
			}
			rectf.top = rect.top;
	//   47   85:aload_2         
	//   48   86:aload_1         
	//   49   87:getfield        #219 <Field int Rect.top>
	//   50   90:i2f             
	//   51   91:putfield        #194 <Field float RectF.top>
			rectf.bottom = rect.bottom;
	//   52   94:aload_2         
	//   53   95:aload_1         
	//   54   96:getfield        #221 <Field int Rect.bottom>
	//   55   99:i2f             
	//   56  100:putfield        #197 <Field float RectF.bottom>
		}
	//   57  103:return          
	}

	private float calculateCloseIconWidth()
	{
		if(showsCloseIcon())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #205 <Method boolean showsCloseIcon()>
	//*   2    4:ifeq            22
			return closeIconStartPadding + closeIconSize + closeIconEndPadding;
	//    3    7:aload_0         
	//    4    8:getfield        #213 <Field float closeIconStartPadding>
	//    5   11:aload_0         
	//    6   12:getfield        #211 <Field float closeIconSize>
	//    7   15:fadd            
	//    8   16:aload_0         
	//    9   17:getfield        #209 <Field float closeIconEndPadding>
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
	//    1    1:invokevirtual   #163 <Method void RectF.setEmpty()>
		if(unicodeWrappedText != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #225 <Field CharSequence unicodeWrappedText>
	//*   4    8:ifnull          116
		{
			float f = chipStartPadding + calculateChipIconWidth() + textStartPadding;
	//    5   11:aload_0         
	//    6   12:getfield        #171 <Field float chipStartPadding>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #228 <Method float calculateChipIconWidth()>
	//    9   19:fadd            
	//   10   20:aload_0         
	//   11   21:getfield        #230 <Field float textStartPadding>
	//   12   24:fadd            
	//   13   25:fstore_3        
			float f1 = chipEndPadding + calculateCloseIconWidth() + textEndPadding;
	//   14   26:aload_0         
	//   15   27:getfield        #207 <Field float chipEndPadding>
	//   16   30:aload_0         
	//   17   31:invokespecial   #232 <Method float calculateCloseIconWidth()>
	//   18   34:fadd            
	//   19   35:aload_0         
	//   20   36:getfield        #215 <Field float textEndPadding>
	//   21   39:fadd            
	//   22   40:fstore          4
			if(DrawableCompat.getLayoutDirection(((Drawable) (this))) == 0)
	//*  23   42:aload_0         
	//*  24   43:invokestatic    #113 <Method int DrawableCompat.getLayoutDirection(Drawable)>
	//*  25   46:ifne            75
			{
				rectf.left = (float)rect.left + f;
	//   26   49:aload_2         
	//   27   50:aload_1         
	//   28   51:getfield        #178 <Field int Rect.left>
	//   29   54:i2f             
	//   30   55:fload_3         
	//   31   56:fadd            
	//   32   57:putfield        #180 <Field float RectF.left>
				rectf.right = (float)rect.right - f1;
	//   33   60:aload_2         
	//   34   61:aload_1         
	//   35   62:getfield        #187 <Field int Rect.right>
	//   36   65:i2f             
	//   37   66:fload           4
	//   38   68:fsub            
	//   39   69:putfield        #185 <Field float RectF.right>
			} else
	//*  40   72:goto            98
			{
				rectf.left = (float)rect.left + f1;
	//   41   75:aload_2         
	//   42   76:aload_1         
	//   43   77:getfield        #178 <Field int Rect.left>
	//   44   80:i2f             
	//   45   81:fload           4
	//   46   83:fadd            
	//   47   84:putfield        #180 <Field float RectF.left>
				rectf.right = (float)rect.right - f;
	//   48   87:aload_2         
	//   49   88:aload_1         
	//   50   89:getfield        #187 <Field int Rect.right>
	//   51   92:i2f             
	//   52   93:fload_3         
	//   53   94:fsub            
	//   54   95:putfield        #185 <Field float RectF.right>
			}
			rectf.top = rect.top;
	//   55   98:aload_2         
	//   56   99:aload_1         
	//   57  100:getfield        #219 <Field int Rect.top>
	//   58  103:i2f             
	//   59  104:putfield        #194 <Field float RectF.top>
			rectf.bottom = rect.bottom;
	//   60  107:aload_2         
	//   61  108:aload_1         
	//   62  109:getfield        #221 <Field int Rect.bottom>
	//   63  112:i2f             
	//   64  113:putfield        #197 <Field float RectF.bottom>
		}
	//   65  116:return          
	}

	private float calculateTextCenterFromBaseline()
	{
		textPaint.getFontMetrics(fontMetrics);
	//    0    0:aload_0         
	//    1    1:getfield        #235 <Field TextPaint textPaint>
	//    2    4:aload_0         
	//    3    5:getfield        #237 <Field android.graphics.Paint$FontMetrics fontMetrics>
	//    4    8:invokevirtual   #243 <Method float TextPaint.getFontMetrics(android.graphics.Paint$FontMetrics)>
	//    5   11:pop             
		return (fontMetrics.descent + fontMetrics.ascent) / 2.0F;
	//    6   12:aload_0         
	//    7   13:getfield        #237 <Field android.graphics.Paint$FontMetrics fontMetrics>
	//    8   16:getfield        #248 <Field float android.graphics.Paint$FontMetrics.descent>
	//    9   19:aload_0         
	//   10   20:getfield        #237 <Field android.graphics.Paint$FontMetrics fontMetrics>
	//   11   23:getfield        #251 <Field float android.graphics.Paint$FontMetrics.ascent>
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
	//    5    7:getfield        #235 <Field TextPaint textPaint>
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:aload_1         
	//    9   13:invokeinterface #258 <Method int CharSequence.length()>
	//   10   18:invokevirtual   #262 <Method float TextPaint.measureText(CharSequence, int, int)>
	//   11   21:freturn         
	}

	private boolean canShowCheckedIcon()
	{
		return checkedIconVisible && checkedIcon != null && checkable;
	//    0    0:aload_0         
	//    1    1:getfield        #265 <Field boolean checkedIconVisible>
	//    2    4:ifeq            23
	//    3    7:aload_0         
	//    4    8:getfield        #267 <Field Drawable checkedIcon>
	//    5   11:ifnull          23
	//    6   14:aload_0         
	//    7   15:getfield        #269 <Field boolean checkable>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	private void drawCheckedIcon(Canvas canvas, Rect rect)
	{
		if(showsCheckedIcon())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #169 <Method boolean showsCheckedIcon()>
	//*   2    4:ifeq            82
		{
			calculateChipIconBounds(rect, rectF);
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #274 <Field RectF rectF>
	//    7   13:invokespecial   #276 <Method void calculateChipIconBounds(Rect, RectF)>
			float f = rectF.left;
	//    8   16:aload_0         
	//    9   17:getfield        #274 <Field RectF rectF>
	//   10   20:getfield        #180 <Field float RectF.left>
	//   11   23:fstore_3        
			float f1 = rectF.top;
	//   12   24:aload_0         
	//   13   25:getfield        #274 <Field RectF rectF>
	//   14   28:getfield        #194 <Field float RectF.top>
	//   15   31:fstore          4
			canvas.translate(f, f1);
	//   16   33:aload_1         
	//   17   34:fload_3         
	//   18   35:fload           4
	//   19   37:invokevirtual   #282 <Method void Canvas.translate(float, float)>
			checkedIcon.setBounds(0, 0, (int)rectF.width(), (int)rectF.height());
	//   20   40:aload_0         
	//   21   41:getfield        #267 <Field Drawable checkedIcon>
	//   22   44:iconst_0        
	//   23   45:iconst_0        
	//   24   46:aload_0         
	//   25   47:getfield        #274 <Field RectF rectF>
	//   26   50:invokevirtual   #285 <Method float RectF.width()>
	//   27   53:f2i             
	//   28   54:aload_0         
	//   29   55:getfield        #274 <Field RectF rectF>
	//   30   58:invokevirtual   #288 <Method float RectF.height()>
	//   31   61:f2i             
	//   32   62:invokevirtual   #292 <Method void Drawable.setBounds(int, int, int, int)>
			checkedIcon.draw(canvas);
	//   33   65:aload_0         
	//   34   66:getfield        #267 <Field Drawable checkedIcon>
	//   35   69:aload_1         
	//   36   70:invokevirtual   #296 <Method void Drawable.draw(Canvas)>
			canvas.translate(-f, -f1);
	//   37   73:aload_1         
	//   38   74:fload_3         
	//   39   75:fneg            
	//   40   76:fload           4
	//   41   78:fneg            
	//   42   79:invokevirtual   #282 <Method void Canvas.translate(float, float)>
		}
	//   43   82:return          
	}

	private void drawChipBackground(Canvas canvas, Rect rect)
	{
		chipPaint.setColor(currentChipBackgroundColor);
	//    0    0:aload_0         
	//    1    1:getfield        #299 <Field Paint chipPaint>
	//    2    4:aload_0         
	//    3    5:getfield        #301 <Field int currentChipBackgroundColor>
	//    4    8:invokevirtual   #307 <Method void Paint.setColor(int)>
		chipPaint.setStyle(android.graphics.Paint.Style.FILL);
	//    5   11:aload_0         
	//    6   12:getfield        #299 <Field Paint chipPaint>
	//    7   15:getstatic       #313 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//    8   18:invokevirtual   #317 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		chipPaint.setColorFilter(getTintColorFilter());
	//    9   21:aload_0         
	//   10   22:getfield        #299 <Field Paint chipPaint>
	//   11   25:aload_0         
	//   12   26:invokespecial   #321 <Method ColorFilter getTintColorFilter()>
	//   13   29:invokevirtual   #325 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//   14   32:pop             
		rectF.set(rect);
	//   15   33:aload_0         
	//   16   34:getfield        #274 <Field RectF rectF>
	//   17   37:aload_2         
	//   18   38:invokevirtual   #202 <Method void RectF.set(Rect)>
		rect = ((Rect) (rectF));
	//   19   41:aload_0         
	//   20   42:getfield        #274 <Field RectF rectF>
	//   21   45:astore_2        
		float f = chipCornerRadius;
	//   22   46:aload_0         
	//   23   47:getfield        #327 <Field float chipCornerRadius>
	//   24   50:fstore_3        
		canvas.drawRoundRect(((RectF) (rect)), f, f, chipPaint);
	//   25   51:aload_1         
	//   26   52:aload_2         
	//   27   53:fload_3         
	//   28   54:fload_3         
	//   29   55:aload_0         
	//   30   56:getfield        #299 <Field Paint chipPaint>
	//   31   59:invokevirtual   #331 <Method void Canvas.drawRoundRect(RectF, float, float, Paint)>
	//   32   62:return          
	}

	private void drawChipIcon(Canvas canvas, Rect rect)
	{
		if(showsChipIcon())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #166 <Method boolean showsChipIcon()>
	//*   2    4:ifeq            82
		{
			calculateChipIconBounds(rect, rectF);
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #274 <Field RectF rectF>
	//    7   13:invokespecial   #276 <Method void calculateChipIconBounds(Rect, RectF)>
			float f = rectF.left;
	//    8   16:aload_0         
	//    9   17:getfield        #274 <Field RectF rectF>
	//   10   20:getfield        #180 <Field float RectF.left>
	//   11   23:fstore_3        
			float f1 = rectF.top;
	//   12   24:aload_0         
	//   13   25:getfield        #274 <Field RectF rectF>
	//   14   28:getfield        #194 <Field float RectF.top>
	//   15   31:fstore          4
			canvas.translate(f, f1);
	//   16   33:aload_1         
	//   17   34:fload_3         
	//   18   35:fload           4
	//   19   37:invokevirtual   #282 <Method void Canvas.translate(float, float)>
			chipIcon.setBounds(0, 0, (int)rectF.width(), (int)rectF.height());
	//   20   40:aload_0         
	//   21   41:getfield        #334 <Field Drawable chipIcon>
	//   22   44:iconst_0        
	//   23   45:iconst_0        
	//   24   46:aload_0         
	//   25   47:getfield        #274 <Field RectF rectF>
	//   26   50:invokevirtual   #285 <Method float RectF.width()>
	//   27   53:f2i             
	//   28   54:aload_0         
	//   29   55:getfield        #274 <Field RectF rectF>
	//   30   58:invokevirtual   #288 <Method float RectF.height()>
	//   31   61:f2i             
	//   32   62:invokevirtual   #292 <Method void Drawable.setBounds(int, int, int, int)>
			chipIcon.draw(canvas);
	//   33   65:aload_0         
	//   34   66:getfield        #334 <Field Drawable chipIcon>
	//   35   69:aload_1         
	//   36   70:invokevirtual   #296 <Method void Drawable.draw(Canvas)>
			canvas.translate(-f, -f1);
	//   37   73:aload_1         
	//   38   74:fload_3         
	//   39   75:fneg            
	//   40   76:fload           4
	//   41   78:fneg            
	//   42   79:invokevirtual   #282 <Method void Canvas.translate(float, float)>
		}
	//   43   82:return          
	}

	private void drawChipStroke(Canvas canvas, Rect rect)
	{
		if(chipStrokeWidth > 0.0F)
	//*   0    0:aload_0         
	//*   1    1:getfield        #337 <Field float chipStrokeWidth>
	//*   2    4:fconst_0        
	//*   3    5:fcmpl           
	//*   4    6:ifle            123
		{
			chipPaint.setColor(currentChipStrokeColor);
	//    5    9:aload_0         
	//    6   10:getfield        #299 <Field Paint chipPaint>
	//    7   13:aload_0         
	//    8   14:getfield        #339 <Field int currentChipStrokeColor>
	//    9   17:invokevirtual   #307 <Method void Paint.setColor(int)>
			chipPaint.setStyle(android.graphics.Paint.Style.STROKE);
	//   10   20:aload_0         
	//   11   21:getfield        #299 <Field Paint chipPaint>
	//   12   24:getstatic       #342 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   13   27:invokevirtual   #317 <Method void Paint.setStyle(android.graphics.Paint$Style)>
			chipPaint.setColorFilter(getTintColorFilter());
	//   14   30:aload_0         
	//   15   31:getfield        #299 <Field Paint chipPaint>
	//   16   34:aload_0         
	//   17   35:invokespecial   #321 <Method ColorFilter getTintColorFilter()>
	//   18   38:invokevirtual   #325 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//   19   41:pop             
			rectF.set((float)rect.left + chipStrokeWidth / 2.0F, (float)rect.top + chipStrokeWidth / 2.0F, (float)rect.right - chipStrokeWidth / 2.0F, (float)rect.bottom - chipStrokeWidth / 2.0F);
	//   20   42:aload_0         
	//   21   43:getfield        #274 <Field RectF rectF>
	//   22   46:aload_2         
	//   23   47:getfield        #178 <Field int Rect.left>
	//   24   50:i2f             
	//   25   51:aload_0         
	//   26   52:getfield        #337 <Field float chipStrokeWidth>
	//   27   55:fconst_2        
	//   28   56:fdiv            
	//   29   57:fadd            
	//   30   58:aload_2         
	//   31   59:getfield        #219 <Field int Rect.top>
	//   32   62:i2f             
	//   33   63:aload_0         
	//   34   64:getfield        #337 <Field float chipStrokeWidth>
	//   35   67:fconst_2        
	//   36   68:fdiv            
	//   37   69:fadd            
	//   38   70:aload_2         
	//   39   71:getfield        #187 <Field int Rect.right>
	//   40   74:i2f             
	//   41   75:aload_0         
	//   42   76:getfield        #337 <Field float chipStrokeWidth>
	//   43   79:fconst_2        
	//   44   80:fdiv            
	//   45   81:fsub            
	//   46   82:aload_2         
	//   47   83:getfield        #221 <Field int Rect.bottom>
	//   48   86:i2f             
	//   49   87:aload_0         
	//   50   88:getfield        #337 <Field float chipStrokeWidth>
	//   51   91:fconst_2        
	//   52   92:fdiv            
	//   53   93:fsub            
	//   54   94:invokevirtual   #345 <Method void RectF.set(float, float, float, float)>
			float f = chipCornerRadius - chipStrokeWidth / 2.0F;
	//   55   97:aload_0         
	//   56   98:getfield        #327 <Field float chipCornerRadius>
	//   57  101:aload_0         
	//   58  102:getfield        #337 <Field float chipStrokeWidth>
	//   59  105:fconst_2        
	//   60  106:fdiv            
	//   61  107:fsub            
	//   62  108:fstore_3        
			canvas.drawRoundRect(rectF, f, f, chipPaint);
	//   63  109:aload_1         
	//   64  110:aload_0         
	//   65  111:getfield        #274 <Field RectF rectF>
	//   66  114:fload_3         
	//   67  115:fload_3         
	//   68  116:aload_0         
	//   69  117:getfield        #299 <Field Paint chipPaint>
	//   70  120:invokevirtual   #331 <Method void Canvas.drawRoundRect(RectF, float, float, Paint)>
		}
	//   71  123:return          
	}

	private void drawCloseIcon(Canvas canvas, Rect rect)
	{
		if(showsCloseIcon())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #205 <Method boolean showsCloseIcon()>
	//*   2    4:ifeq            82
		{
			calculateCloseIconBounds(rect, rectF);
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #274 <Field RectF rectF>
	//    7   13:invokespecial   #348 <Method void calculateCloseIconBounds(Rect, RectF)>
			float f = rectF.left;
	//    8   16:aload_0         
	//    9   17:getfield        #274 <Field RectF rectF>
	//   10   20:getfield        #180 <Field float RectF.left>
	//   11   23:fstore_3        
			float f1 = rectF.top;
	//   12   24:aload_0         
	//   13   25:getfield        #274 <Field RectF rectF>
	//   14   28:getfield        #194 <Field float RectF.top>
	//   15   31:fstore          4
			canvas.translate(f, f1);
	//   16   33:aload_1         
	//   17   34:fload_3         
	//   18   35:fload           4
	//   19   37:invokevirtual   #282 <Method void Canvas.translate(float, float)>
			closeIcon.setBounds(0, 0, (int)rectF.width(), (int)rectF.height());
	//   20   40:aload_0         
	//   21   41:getfield        #135 <Field Drawable closeIcon>
	//   22   44:iconst_0        
	//   23   45:iconst_0        
	//   24   46:aload_0         
	//   25   47:getfield        #274 <Field RectF rectF>
	//   26   50:invokevirtual   #285 <Method float RectF.width()>
	//   27   53:f2i             
	//   28   54:aload_0         
	//   29   55:getfield        #274 <Field RectF rectF>
	//   30   58:invokevirtual   #288 <Method float RectF.height()>
	//   31   61:f2i             
	//   32   62:invokevirtual   #292 <Method void Drawable.setBounds(int, int, int, int)>
			closeIcon.draw(canvas);
	//   33   65:aload_0         
	//   34   66:getfield        #135 <Field Drawable closeIcon>
	//   35   69:aload_1         
	//   36   70:invokevirtual   #296 <Method void Drawable.draw(Canvas)>
			canvas.translate(-f, -f1);
	//   37   73:aload_1         
	//   38   74:fload_3         
	//   39   75:fneg            
	//   40   76:fload           4
	//   41   78:fneg            
	//   42   79:invokevirtual   #282 <Method void Canvas.translate(float, float)>
		}
	//   43   82:return          
	}

	private void drawCompatRipple(Canvas canvas, Rect rect)
	{
		chipPaint.setColor(currentCompatRippleColor);
	//    0    0:aload_0         
	//    1    1:getfield        #299 <Field Paint chipPaint>
	//    2    4:aload_0         
	//    3    5:getfield        #351 <Field int currentCompatRippleColor>
	//    4    8:invokevirtual   #307 <Method void Paint.setColor(int)>
		chipPaint.setStyle(android.graphics.Paint.Style.FILL);
	//    5   11:aload_0         
	//    6   12:getfield        #299 <Field Paint chipPaint>
	//    7   15:getstatic       #313 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//    8   18:invokevirtual   #317 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		rectF.set(rect);
	//    9   21:aload_0         
	//   10   22:getfield        #274 <Field RectF rectF>
	//   11   25:aload_2         
	//   12   26:invokevirtual   #202 <Method void RectF.set(Rect)>
		rect = ((Rect) (rectF));
	//   13   29:aload_0         
	//   14   30:getfield        #274 <Field RectF rectF>
	//   15   33:astore_2        
		float f = chipCornerRadius;
	//   16   34:aload_0         
	//   17   35:getfield        #327 <Field float chipCornerRadius>
	//   18   38:fstore_3        
		canvas.drawRoundRect(((RectF) (rect)), f, f, chipPaint);
	//   19   39:aload_1         
	//   20   40:aload_2         
	//   21   41:fload_3         
	//   22   42:fload_3         
	//   23   43:aload_0         
	//   24   44:getfield        #299 <Field Paint chipPaint>
	//   25   47:invokevirtual   #331 <Method void Canvas.drawRoundRect(RectF, float, float, Paint)>
	//   26   50:return          
	}

	private void drawDebug(Canvas canvas, Rect rect)
	{
		Paint paint = debugPaint;
	//    0    0:aload_0         
	//    1    1:getfield        #354 <Field Paint debugPaint>
	//    2    4:astore_3        
		if(paint != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          198
		{
			paint.setColor(ColorUtils.setAlphaComponent(0xff000000, 127));
	//    5    9:aload_3         
	//    6   10:ldc2            #355 <Int 0xff000000>
	//    7   13:bipush          127
	//    8   15:invokestatic    #361 <Method int ColorUtils.setAlphaComponent(int, int)>
	//    9   18:invokevirtual   #307 <Method void Paint.setColor(int)>
			canvas.drawRect(rect, debugPaint);
	//   10   21:aload_1         
	//   11   22:aload_2         
	//   12   23:aload_0         
	//   13   24:getfield        #354 <Field Paint debugPaint>
	//   14   27:invokevirtual   #365 <Method void Canvas.drawRect(Rect, Paint)>
			if(showsChipIcon() || showsCheckedIcon())
	//*  15   30:aload_0         
	//*  16   31:invokespecial   #166 <Method boolean showsChipIcon()>
	//*  17   34:ifne            44
	//*  18   37:aload_0         
	//*  19   38:invokespecial   #169 <Method boolean showsCheckedIcon()>
	//*  20   41:ifeq            65
			{
				calculateChipIconBounds(rect, rectF);
	//   21   44:aload_0         
	//   22   45:aload_2         
	//   23   46:aload_0         
	//   24   47:getfield        #274 <Field RectF rectF>
	//   25   50:invokespecial   #276 <Method void calculateChipIconBounds(Rect, RectF)>
				canvas.drawRect(rectF, debugPaint);
	//   26   53:aload_1         
	//   27   54:aload_0         
	//   28   55:getfield        #274 <Field RectF rectF>
	//   29   58:aload_0         
	//   30   59:getfield        #354 <Field Paint debugPaint>
	//   31   62:invokevirtual   #368 <Method void Canvas.drawRect(RectF, Paint)>
			}
			if(unicodeWrappedText != null)
	//*  32   65:aload_0         
	//*  33   66:getfield        #225 <Field CharSequence unicodeWrappedText>
	//*  34   69:ifnull          98
				canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), debugPaint);
	//   35   72:aload_1         
	//   36   73:aload_2         
	//   37   74:getfield        #178 <Field int Rect.left>
	//   38   77:i2f             
	//   39   78:aload_2         
	//   40   79:invokevirtual   #191 <Method float Rect.exactCenterY()>
	//   41   82:aload_2         
	//   42   83:getfield        #187 <Field int Rect.right>
	//   43   86:i2f             
	//   44   87:aload_2         
	//   45   88:invokevirtual   #191 <Method float Rect.exactCenterY()>
	//   46   91:aload_0         
	//   47   92:getfield        #354 <Field Paint debugPaint>
	//   48   95:invokevirtual   #372 <Method void Canvas.drawLine(float, float, float, float, Paint)>
			if(showsCloseIcon())
	//*  49   98:aload_0         
	//*  50   99:invokespecial   #205 <Method boolean showsCloseIcon()>
	//*  51  102:ifeq            126
			{
				calculateCloseIconBounds(rect, rectF);
	//   52  105:aload_0         
	//   53  106:aload_2         
	//   54  107:aload_0         
	//   55  108:getfield        #274 <Field RectF rectF>
	//   56  111:invokespecial   #348 <Method void calculateCloseIconBounds(Rect, RectF)>
				canvas.drawRect(rectF, debugPaint);
	//   57  114:aload_1         
	//   58  115:aload_0         
	//   59  116:getfield        #274 <Field RectF rectF>
	//   60  119:aload_0         
	//   61  120:getfield        #354 <Field Paint debugPaint>
	//   62  123:invokevirtual   #368 <Method void Canvas.drawRect(RectF, Paint)>
			}
			debugPaint.setColor(ColorUtils.setAlphaComponent(0xffff0000, 127));
	//   63  126:aload_0         
	//   64  127:getfield        #354 <Field Paint debugPaint>
	//   65  130:ldc2            #373 <Int 0xffff0000>
	//   66  133:bipush          127
	//   67  135:invokestatic    #361 <Method int ColorUtils.setAlphaComponent(int, int)>
	//   68  138:invokevirtual   #307 <Method void Paint.setColor(int)>
			calculateChipTouchBounds(rect, rectF);
	//   69  141:aload_0         
	//   70  142:aload_2         
	//   71  143:aload_0         
	//   72  144:getfield        #274 <Field RectF rectF>
	//   73  147:invokespecial   #375 <Method void calculateChipTouchBounds(Rect, RectF)>
			canvas.drawRect(rectF, debugPaint);
	//   74  150:aload_1         
	//   75  151:aload_0         
	//   76  152:getfield        #274 <Field RectF rectF>
	//   77  155:aload_0         
	//   78  156:getfield        #354 <Field Paint debugPaint>
	//   79  159:invokevirtual   #368 <Method void Canvas.drawRect(RectF, Paint)>
			debugPaint.setColor(ColorUtils.setAlphaComponent(0xff00ff00, 127));
	//   80  162:aload_0         
	//   81  163:getfield        #354 <Field Paint debugPaint>
	//   82  166:ldc2            #376 <Int 0xff00ff00>
	//   83  169:bipush          127
	//   84  171:invokestatic    #361 <Method int ColorUtils.setAlphaComponent(int, int)>
	//   85  174:invokevirtual   #307 <Method void Paint.setColor(int)>
			calculateCloseIconTouchBounds(rect, rectF);
	//   86  177:aload_0         
	//   87  178:aload_2         
	//   88  179:aload_0         
	//   89  180:getfield        #274 <Field RectF rectF>
	//   90  183:invokespecial   #378 <Method void calculateCloseIconTouchBounds(Rect, RectF)>
			canvas.drawRect(rectF, debugPaint);
	//   91  186:aload_1         
	//   92  187:aload_0         
	//   93  188:getfield        #274 <Field RectF rectF>
	//   94  191:aload_0         
	//   95  192:getfield        #354 <Field Paint debugPaint>
	//   96  195:invokevirtual   #368 <Method void Canvas.drawRect(RectF, Paint)>
		}
	//   97  198:return          
	}

	private void drawText(Canvas canvas, Rect rect)
	{
		if(unicodeWrappedText != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #225 <Field CharSequence unicodeWrappedText>
	//*   2    4:ifnull          207
		{
			android.graphics.Paint.Align align = calculateTextOriginAndAlignment(rect, pointF);
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #381 <Field PointF pointF>
	//    7   13:invokevirtual   #385 <Method android.graphics.Paint$Align calculateTextOriginAndAlignment(Rect, PointF)>
	//    8   16:astore          6
			calculateTextBounds(rect, rectF);
	//    9   18:aload_0         
	//   10   19:aload_2         
	//   11   20:aload_0         
	//   12   21:getfield        #274 <Field RectF rectF>
	//   13   24:invokespecial   #387 <Method void calculateTextBounds(Rect, RectF)>
			if(textAppearance != null)
	//*  14   27:aload_0         
	//*  15   28:getfield        #389 <Field TextAppearance textAppearance>
	//*  16   31:ifnull          64
			{
				textPaint.drawableState = getState();
	//   17   34:aload_0         
	//   18   35:getfield        #235 <Field TextPaint textPaint>
	//   19   38:aload_0         
	//   20   39:invokevirtual   #155 <Method int[] getState()>
	//   21   42:putfield        #392 <Field int[] TextPaint.drawableState>
				textAppearance.updateDrawState(context, textPaint, fontCallback);
	//   22   45:aload_0         
	//   23   46:getfield        #389 <Field TextAppearance textAppearance>
	//   24   49:aload_0         
	//   25   50:getfield        #394 <Field Context context>
	//   26   53:aload_0         
	//   27   54:getfield        #235 <Field TextPaint textPaint>
	//   28   57:aload_0         
	//   29   58:getfield        #396 <Field android.support.v4.content.res.ResourcesCompat$FontCallback fontCallback>
	//   30   61:invokevirtual   #402 <Method void TextAppearance.updateDrawState(Context, TextPaint, android.support.v4.content.res.ResourcesCompat$FontCallback)>
			}
			textPaint.setTextAlign(align);
	//   31   64:aload_0         
	//   32   65:getfield        #235 <Field TextPaint textPaint>
	//   33   68:aload           6
	//   34   70:invokevirtual   #406 <Method void TextPaint.setTextAlign(android.graphics.Paint$Align)>
			int i = Math.round(getTextWidth());
	//   35   73:aload_0         
	//   36   74:invokespecial   #409 <Method float getTextWidth()>
	//   37   77:invokestatic    #415 <Method int Math.round(float)>
	//   38   80:istore_3        
			int k = Math.round(rectF.width());
	//   39   81:aload_0         
	//   40   82:getfield        #274 <Field RectF rectF>
	//   41   85:invokevirtual   #285 <Method float RectF.width()>
	//   42   88:invokestatic    #415 <Method int Math.round(float)>
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
	//   57  114:invokevirtual   #418 <Method int Canvas.save()>
	//   58  117:istore          4
				canvas.clipRect(rectF);
	//   59  119:aload_1         
	//   60  120:aload_0         
	//   61  121:getfield        #274 <Field RectF rectF>
	//   62  124:invokevirtual   #422 <Method boolean Canvas.clipRect(RectF)>
	//   63  127:pop             
			}
			rect = ((Rect) (unicodeWrappedText));
	//   64  128:aload_0         
	//   65  129:getfield        #225 <Field CharSequence unicodeWrappedText>
	//   66  132:astore_2        
			if(flag && truncateAt != null)
	//*  67  133:iload_3         
	//*  68  134:ifeq            167
	//*  69  137:aload_0         
	//*  70  138:getfield        #424 <Field android.text.TextUtils$TruncateAt truncateAt>
	//*  71  141:ifnull          167
				rect = ((Rect) (TextUtils.ellipsize(((CharSequence) (rect)), textPaint, rectF.width(), truncateAt)));
	//   72  144:aload_2         
	//   73  145:aload_0         
	//   74  146:getfield        #235 <Field TextPaint textPaint>
	//   75  149:aload_0         
	//   76  150:getfield        #274 <Field RectF rectF>
	//   77  153:invokevirtual   #285 <Method float RectF.width()>
	//   78  156:aload_0         
	//   79  157:getfield        #424 <Field android.text.TextUtils$TruncateAt truncateAt>
	//   80  160:invokestatic    #430 <Method CharSequence TextUtils.ellipsize(CharSequence, TextPaint, float, android.text.TextUtils$TruncateAt)>
	//   81  163:astore_2        
	//*  82  164:goto            167
			canvas.drawText(((CharSequence) (rect)), 0, ((CharSequence) (rect)).length(), pointF.x, pointF.y, ((Paint) (textPaint)));
	//   83  167:aload_1         
	//   84  168:aload_2         
	//   85  169:iconst_0        
	//   86  170:aload_2         
	//   87  171:invokeinterface #258 <Method int CharSequence.length()>
	//   88  176:aload_0         
	//   89  177:getfield        #381 <Field PointF pointF>
	//   90  180:getfield        #435 <Field float PointF.x>
	//   91  183:aload_0         
	//   92  184:getfield        #381 <Field PointF pointF>
	//   93  187:getfield        #438 <Field float PointF.y>
	//   94  190:aload_0         
	//   95  191:getfield        #235 <Field TextPaint textPaint>
	//   96  194:invokevirtual   #441 <Method void Canvas.drawText(CharSequence, int, int, float, float, Paint)>
			if(flag)
	//*  97  197:iload_3         
	//*  98  198:ifeq            207
				canvas.restoreToCount(j);
	//   99  201:aload_1         
	//  100  202:iload           4
	//  101  204:invokevirtual   #444 <Method void Canvas.restoreToCount(int)>
		}
	//  102  207:return          
	}

	private float getTextWidth()
	{
		if(!textWidthDirty)
	//*   0    0:aload_0         
	//*   1    1:getfield        #446 <Field boolean textWidthDirty>
	//*   2    4:ifne            12
		{
			return textWidth;
	//    3    7:aload_0         
	//    4    8:getfield        #448 <Field float textWidth>
	//    5   11:freturn         
		} else
		{
			textWidth = calculateTextWidth(unicodeWrappedText);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #225 <Field CharSequence unicodeWrappedText>
	//   10   18:invokespecial   #450 <Method float calculateTextWidth(CharSequence)>
	//   11   21:putfield        #448 <Field float textWidth>
			textWidthDirty = false;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #446 <Field boolean textWidthDirty>
			return textWidth;
	//   15   29:aload_0         
	//   16   30:getfield        #448 <Field float textWidth>
	//   17   33:freturn         
		}
	}

	private ColorFilter getTintColorFilter()
	{
		ColorFilter colorfilter = colorFilter;
	//    0    0:aload_0         
	//    1    1:getfield        #452 <Field ColorFilter colorFilter>
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
	//    8   12:getfield        #454 <Field PorterDuffColorFilter tintFilter>
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
	//    3    5:invokevirtual   #462 <Method boolean ColorStateList.isStateful()>
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
	//    3    5:invokevirtual   #138 <Method boolean Drawable.isStateful()>
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
	//    3    5:getfield        #467 <Field ColorStateList TextAppearance.textColor>
	//    4    8:ifnull          23
	//    5   11:aload_0         
	//    6   12:getfield        #467 <Field ColorStateList TextAppearance.textColor>
	//    7   15:invokevirtual   #462 <Method boolean ColorStateList.isStateful()>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	private boolean onStateChange(int ai[], int ai1[])
	{
		boolean flag1 = super.onStateChange(ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #471 <Method boolean Drawable.onStateChange(int[])>
	//    3    5:istore          6
		Object obj = ((Object) (chipBackgroundColor));
	//    4    7:aload_0         
	//    5    8:getfield        #473 <Field ColorStateList chipBackgroundColor>
	//    6   11:astore          8
		int j = 0;
	//    7   13:iconst_0        
	//    8   14:istore          5
		int i;
		if(obj != null)
	//*   9   16:aload           8
	//*  10   18:ifnull          36
			i = ((ColorStateList) (obj)).getColorForState(ai, currentChipBackgroundColor);
	//   11   21:aload           8
	//   12   23:aload_1         
	//   13   24:aload_0         
	//   14   25:getfield        #301 <Field int currentChipBackgroundColor>
	//   15   28:invokevirtual   #477 <Method int ColorStateList.getColorForState(int[], int)>
	//   16   31:istore          4
		else
	//*  17   33:goto            39
			i = 0;
	//   18   36:iconst_0        
	//   19   37:istore          4
		if(currentChipBackgroundColor != i)
	//*  20   39:aload_0         
	//*  21   40:getfield        #301 <Field int currentChipBackgroundColor>
	//*  22   43:iload           4
	//*  23   45:icmpeq          57
		{
			currentChipBackgroundColor = i;
	//   24   48:aload_0         
	//   25   49:iload           4
	//   26   51:putfield        #301 <Field int currentChipBackgroundColor>
			flag1 = true;
	//   27   54:iconst_1        
	//   28   55:istore          6
		}
		obj = ((Object) (chipStrokeColor));
	//   29   57:aload_0         
	//   30   58:getfield        #479 <Field ColorStateList chipStrokeColor>
	//   31   61:astore          8
		if(obj != null)
	//*  32   63:aload           8
	//*  33   65:ifnull          83
			i = ((ColorStateList) (obj)).getColorForState(ai, currentChipStrokeColor);
	//   34   68:aload           8
	//   35   70:aload_1         
	//   36   71:aload_0         
	//   37   72:getfield        #339 <Field int currentChipStrokeColor>
	//   38   75:invokevirtual   #477 <Method int ColorStateList.getColorForState(int[], int)>
	//   39   78:istore          4
		else
	//*  40   80:goto            86
			i = 0;
	//   41   83:iconst_0        
	//   42   84:istore          4
		if(currentChipStrokeColor != i)
	//*  43   86:aload_0         
	//*  44   87:getfield        #339 <Field int currentChipStrokeColor>
	//*  45   90:iload           4
	//*  46   92:icmpeq          104
		{
			currentChipStrokeColor = i;
	//   47   95:aload_0         
	//   48   96:iload           4
	//   49   98:putfield        #339 <Field int currentChipStrokeColor>
			flag1 = true;
	//   50  101:iconst_1        
	//   51  102:istore          6
		}
		obj = ((Object) (compatRippleColor));
	//   52  104:aload_0         
	//   53  105:getfield        #481 <Field ColorStateList compatRippleColor>
	//   54  108:astore          8
		if(obj != null)
	//*  55  110:aload           8
	//*  56  112:ifnull          130
			i = ((ColorStateList) (obj)).getColorForState(ai, currentCompatRippleColor);
	//   57  115:aload           8
	//   58  117:aload_1         
	//   59  118:aload_0         
	//   60  119:getfield        #351 <Field int currentCompatRippleColor>
	//   61  122:invokevirtual   #477 <Method int ColorStateList.getColorForState(int[], int)>
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
	//*  69  138:getfield        #351 <Field int currentCompatRippleColor>
	//*  70  141:iload           4
	//*  71  143:icmpeq          166
		{
			currentCompatRippleColor = i;
	//   72  146:aload_0         
	//   73  147:iload           4
	//   74  149:putfield        #351 <Field int currentCompatRippleColor>
			flag2 = flag1;
	//   75  152:iload           6
	//   76  154:istore          7
			if(useCompatRipple)
	//*  77  156:aload_0         
	//*  78  157:getfield        #483 <Field boolean useCompatRipple>
	//*  79  160:ifeq            166
				flag2 = true;
	//   80  163:iconst_1        
	//   81  164:istore          7
		}
		obj = ((Object) (textAppearance));
	//   82  166:aload_0         
	//   83  167:getfield        #389 <Field TextAppearance textAppearance>
	//   84  170:astore          8
		if(obj != null && ((TextAppearance) (obj)).textColor != null)
	//*  85  172:aload           8
	//*  86  174:ifnull          205
	//*  87  177:aload           8
	//*  88  179:getfield        #467 <Field ColorStateList TextAppearance.textColor>
	//*  89  182:ifnull          205
			i = textAppearance.textColor.getColorForState(ai, currentTextColor);
	//   90  185:aload_0         
	//   91  186:getfield        #389 <Field TextAppearance textAppearance>
	//   92  189:getfield        #467 <Field ColorStateList TextAppearance.textColor>
	//   93  192:aload_1         
	//   94  193:aload_0         
	//   95  194:getfield        #485 <Field int currentTextColor>
	//   96  197:invokevirtual   #477 <Method int ColorStateList.getColorForState(int[], int)>
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
	//* 104  213:getfield        #485 <Field int currentTextColor>
	//* 105  216:iload           4
	//* 106  218:icmpeq          230
		{
			currentTextColor = i;
	//  107  221:aload_0         
	//  108  222:iload           4
	//  109  224:putfield        #485 <Field int currentTextColor>
			flag1 = true;
	//  110  227:iconst_1        
	//  111  228:istore          6
		}
		if(hasState(getState(), 0x10100a0) && checkable)
	//* 112  230:aload_0         
	//* 113  231:invokevirtual   #155 <Method int[] getState()>
	//* 114  234:ldc2            #486 <Int 0x10100a0>
	//* 115  237:invokestatic    #488 <Method boolean hasState(int[], int)>
	//* 116  240:ifeq            256
	//* 117  243:aload_0         
	//* 118  244:getfield        #269 <Field boolean checkable>
	//* 119  247:ifeq            256
			flag2 = true;
	//  120  250:iconst_1        
	//  121  251:istore          7
		else
	//* 122  253:goto            259
			flag2 = false;
	//  123  256:iconst_0        
	//  124  257:istore          7
		boolean flag;
		if(currentChecked != flag2 && checkedIcon != null)
	//* 125  259:aload_0         
	//* 126  260:getfield        #490 <Field boolean currentChecked>
	//* 127  263:iload           7
	//* 128  265:icmpeq          313
	//* 129  268:aload_0         
	//* 130  269:getfield        #267 <Field Drawable checkedIcon>
	//* 131  272:ifnull          313
		{
			float f = calculateChipIconWidth();
	//  132  275:aload_0         
	//  133  276:invokevirtual   #228 <Method float calculateChipIconWidth()>
	//  134  279:fstore_3        
			currentChecked = flag2;
	//  135  280:aload_0         
	//  136  281:iload           7
	//  137  283:putfield        #490 <Field boolean currentChecked>
			if(f != calculateChipIconWidth())
	//* 138  286:fload_3         
	//* 139  287:aload_0         
	//* 140  288:invokevirtual   #228 <Method float calculateChipIconWidth()>
	//* 141  291:fcmpl           
	//* 142  292:ifeq            304
			{
				flag1 = true;
	//  143  295:iconst_1        
	//  144  296:istore          6
				flag = true;
	//  145  298:iconst_1        
	//  146  299:istore          4
			} else
	//* 147  301:goto            316
			{
				flag1 = true;
	//  148  304:iconst_1        
	//  149  305:istore          6
				flag = false;
	//  150  307:iconst_0        
	//  151  308:istore          4
			}
		} else
	//* 152  310:goto            316
		{
			flag = false;
	//  153  313:iconst_0        
	//  154  314:istore          4
		}
		obj = ((Object) (tint));
	//  155  316:aload_0         
	//  156  317:getfield        #492 <Field ColorStateList tint>
	//  157  320:astore          8
		if(obj != null)
	//* 158  322:aload           8
	//* 159  324:ifnull          339
			j = ((ColorStateList) (obj)).getColorForState(ai, currentTint);
	//  160  327:aload           8
	//  161  329:aload_1         
	//  162  330:aload_0         
	//  163  331:getfield        #494 <Field int currentTint>
	//  164  334:invokevirtual   #477 <Method int ColorStateList.getColorForState(int[], int)>
	//  165  337:istore          5
		flag2 = flag1;
	//  166  339:iload           6
	//  167  341:istore          7
		if(currentTint != j)
	//* 168  343:aload_0         
	//* 169  344:getfield        #494 <Field int currentTint>
	//* 170  347:iload           5
	//* 171  349:icmpeq          377
		{
			currentTint = j;
	//  172  352:aload_0         
	//  173  353:iload           5
	//  174  355:putfield        #494 <Field int currentTint>
			tintFilter = DrawableUtils.updateTintFilter(((Drawable) (this)), tint, tintMode);
	//  175  358:aload_0         
	//  176  359:aload_0         
	//  177  360:aload_0         
	//  178  361:getfield        #492 <Field ColorStateList tint>
	//  179  364:aload_0         
	//  180  365:getfield        #496 <Field android.graphics.PorterDuff$Mode tintMode>
	//  181  368:invokestatic    #502 <Method PorterDuffColorFilter DrawableUtils.updateTintFilter(Drawable, ColorStateList, android.graphics.PorterDuff$Mode)>
	//  182  371:putfield        #454 <Field PorterDuffColorFilter tintFilter>
			flag2 = true;
	//  183  374:iconst_1        
	//  184  375:istore          7
		}
		flag1 = flag2;
	//  185  377:iload           7
	//  186  379:istore          6
		if(isStateful(chipIcon))
	//* 187  381:aload_0         
	//* 188  382:getfield        #334 <Field Drawable chipIcon>
	//* 189  385:invokestatic    #504 <Method boolean isStateful(Drawable)>
	//* 190  388:ifeq            404
			flag1 = flag2 | chipIcon.setState(ai);
	//  191  391:iload           7
	//  192  393:aload_0         
	//  193  394:getfield        #334 <Field Drawable chipIcon>
	//  194  397:aload_1         
	//  195  398:invokevirtual   #146 <Method boolean Drawable.setState(int[])>
	//  196  401:ior             
	//  197  402:istore          6
		flag2 = flag1;
	//  198  404:iload           6
	//  199  406:istore          7
		if(isStateful(checkedIcon))
	//* 200  408:aload_0         
	//* 201  409:getfield        #267 <Field Drawable checkedIcon>
	//* 202  412:invokestatic    #504 <Method boolean isStateful(Drawable)>
	//* 203  415:ifeq            431
			flag2 = flag1 | checkedIcon.setState(ai);
	//  204  418:iload           6
	//  205  420:aload_0         
	//  206  421:getfield        #267 <Field Drawable checkedIcon>
	//  207  424:aload_1         
	//  208  425:invokevirtual   #146 <Method boolean Drawable.setState(int[])>
	//  209  428:ior             
	//  210  429:istore          7
		flag1 = flag2;
	//  211  431:iload           7
	//  212  433:istore          6
		if(isStateful(closeIcon))
	//* 213  435:aload_0         
	//* 214  436:getfield        #135 <Field Drawable closeIcon>
	//* 215  439:invokestatic    #504 <Method boolean isStateful(Drawable)>
	//* 216  442:ifeq            458
			flag1 = flag2 | closeIcon.setState(ai1);
	//  217  445:iload           7
	//  218  447:aload_0         
	//  219  448:getfield        #135 <Field Drawable closeIcon>
	//  220  451:aload_2         
	//  221  452:invokevirtual   #146 <Method boolean Drawable.setState(int[])>
	//  222  455:ior             
	//  223  456:istore          6
		if(flag1)
	//* 224  458:iload           6
	//* 225  460:ifeq            467
			invalidateSelf();
	//  226  463:aload_0         
	//  227  464:invokevirtual   #507 <Method void invalidateSelf()>
		if(flag)
	//* 228  467:iload           4
	//* 229  469:ifeq            476
			onSizeChange();
	//  230  472:aload_0         
	//  231  473:invokevirtual   #510 <Method void onSizeChange()>
		return flag1;
	//  232  476:iload           6
	//  233  478:ireturn         
	}

	private boolean showsCheckedIcon()
	{
		return checkedIconVisible && checkedIcon != null && currentChecked;
	//    0    0:aload_0         
	//    1    1:getfield        #265 <Field boolean checkedIconVisible>
	//    2    4:ifeq            23
	//    3    7:aload_0         
	//    4    8:getfield        #267 <Field Drawable checkedIcon>
	//    5   11:ifnull          23
	//    6   14:aload_0         
	//    7   15:getfield        #490 <Field boolean currentChecked>
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
	//    1    1:getfield        #512 <Field boolean chipIconVisible>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:getfield        #334 <Field Drawable chipIcon>
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
	//    1    1:getfield        #514 <Field boolean closeIconVisible>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:getfield        #135 <Field Drawable closeIcon>
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
	//    4    6:invokevirtual   #107 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
	//    5    9:return          
	}

	private void updateCompatRippleColor()
	{
		ColorStateList colorstatelist;
		if(useCompatRipple)
	//*   0    0:aload_0         
	//*   1    1:getfield        #483 <Field boolean useCompatRipple>
	//*   2    4:ifeq            18
			colorstatelist = RippleUtils.convertToRippleDrawableColor(rippleColor);
	//    3    7:aload_0         
	//    4    8:getfield        #518 <Field ColorStateList rippleColor>
	//    5   11:invokestatic    #524 <Method ColorStateList RippleUtils.convertToRippleDrawableColor(ColorStateList)>
	//    6   14:astore_1        
		else
	//*   7   15:goto            20
			colorstatelist = null;
	//    8   18:aconst_null     
	//    9   19:astore_1        
		compatRippleColor = colorstatelist;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #481 <Field ColorStateList compatRippleColor>
	//   13   25:return          
	}

	float calculateChipIconWidth()
	{
		if(!showsChipIcon() && !showsCheckedIcon())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #166 <Method boolean showsChipIcon()>
	//*   2    4:ifne            19
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #169 <Method boolean showsCheckedIcon()>
	//*   5   11:ifeq            17
	//*   6   14:goto            19
			return 0.0F;
	//    7   17:fconst_0        
	//    8   18:freturn         
		else
			return iconStartPadding + chipIconSize + iconEndPadding;
	//    9   19:aload_0         
	//   10   20:getfield        #173 <Field float iconStartPadding>
	//   11   23:aload_0         
	//   12   24:getfield        #182 <Field float chipIconSize>
	//   13   27:fadd            
	//   14   28:aload_0         
	//   15   29:getfield        #526 <Field float iconEndPadding>
	//   16   32:fadd            
	//   17   33:freturn         
	}

	android.graphics.Paint.Align calculateTextOriginAndAlignment(Rect rect, PointF pointf)
	{
		pointf.set(0.0F, 0.0F);
	//    0    0:aload_2         
	//    1    1:fconst_0        
	//    2    2:fconst_0        
	//    3    3:invokevirtual   #528 <Method void PointF.set(float, float)>
		android.graphics.Paint.Align align = android.graphics.Paint.Align.LEFT;
	//    4    6:getstatic       #534 <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//    5    9:astore          4
		if(unicodeWrappedText != null)
	//*   6   11:aload_0         
	//*   7   12:getfield        #225 <Field CharSequence unicodeWrappedText>
	//*   8   15:ifnull          89
		{
			float f = chipStartPadding + calculateChipIconWidth() + textStartPadding;
	//    9   18:aload_0         
	//   10   19:getfield        #171 <Field float chipStartPadding>
	//   11   22:aload_0         
	//   12   23:invokevirtual   #228 <Method float calculateChipIconWidth()>
	//   13   26:fadd            
	//   14   27:aload_0         
	//   15   28:getfield        #230 <Field float textStartPadding>
	//   16   31:fadd            
	//   17   32:fstore_3        
			if(DrawableCompat.getLayoutDirection(((Drawable) (this))) == 0)
	//*  18   33:aload_0         
	//*  19   34:invokestatic    #113 <Method int DrawableCompat.getLayoutDirection(Drawable)>
	//*  20   37:ifne            59
			{
				pointf.x = (float)rect.left + f;
	//   21   40:aload_2         
	//   22   41:aload_1         
	//   23   42:getfield        #178 <Field int Rect.left>
	//   24   45:i2f             
	//   25   46:fload_3         
	//   26   47:fadd            
	//   27   48:putfield        #435 <Field float PointF.x>
				align = android.graphics.Paint.Align.LEFT;
	//   28   51:getstatic       #534 <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//   29   54:astore          4
			} else
	//*  30   56:goto            75
			{
				pointf.x = (float)rect.right - f;
	//   31   59:aload_2         
	//   32   60:aload_1         
	//   33   61:getfield        #187 <Field int Rect.right>
	//   34   64:i2f             
	//   35   65:fload_3         
	//   36   66:fsub            
	//   37   67:putfield        #435 <Field float PointF.x>
				align = android.graphics.Paint.Align.RIGHT;
	//   38   70:getstatic       #537 <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//   39   73:astore          4
			}
			pointf.y = (float)rect.centerY() - calculateTextCenterFromBaseline();
	//   40   75:aload_2         
	//   41   76:aload_1         
	//   42   77:invokevirtual   #540 <Method int Rect.centerY()>
	//   43   80:i2f             
	//   44   81:aload_0         
	//   45   82:invokespecial   #542 <Method float calculateTextCenterFromBaseline()>
	//   46   85:fsub            
	//   47   86:putfield        #438 <Field float PointF.y>
		}
		return align;
	//   48   89:aload           4
	//   49   91:areturn         
	}

	public void draw(Canvas canvas)
	{
		Rect rect = getBounds();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #546 <Method Rect getBounds()>
	//    2    4:astore_3        
		if(!rect.isEmpty())
	//*   3    5:aload_3         
	//*   4    6:invokevirtual   #549 <Method boolean Rect.isEmpty()>
	//*   5    9:ifne            132
		{
			if(getAlpha() == 0)
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #552 <Method int getAlpha()>
	//*   8   16:ifne            20
				return;
	//    9   19:return          
			int i = 0;
	//   10   20:iconst_0        
	//   11   21:istore_2        
			if(alpha < 255)
	//*  12   22:aload_0         
	//*  13   23:getfield        #554 <Field int alpha>
	//*  14   26:sipush          255
	//*  15   29:icmpge          61
				i = CanvasCompat.saveLayerAlpha(canvas, rect.left, rect.top, rect.right, rect.bottom, alpha);
	//   16   32:aload_1         
	//   17   33:aload_3         
	//   18   34:getfield        #178 <Field int Rect.left>
	//   19   37:i2f             
	//   20   38:aload_3         
	//   21   39:getfield        #219 <Field int Rect.top>
	//   22   42:i2f             
	//   23   43:aload_3         
	//   24   44:getfield        #187 <Field int Rect.right>
	//   25   47:i2f             
	//   26   48:aload_3         
	//   27   49:getfield        #221 <Field int Rect.bottom>
	//   28   52:i2f             
	//   29   53:aload_0         
	//   30   54:getfield        #554 <Field int alpha>
	//   31   57:invokestatic    #560 <Method int CanvasCompat.saveLayerAlpha(Canvas, float, float, float, float, int)>
	//   32   60:istore_2        
			drawChipBackground(canvas, rect);
	//   33   61:aload_0         
	//   34   62:aload_1         
	//   35   63:aload_3         
	//   36   64:invokespecial   #562 <Method void drawChipBackground(Canvas, Rect)>
			drawChipStroke(canvas, rect);
	//   37   67:aload_0         
	//   38   68:aload_1         
	//   39   69:aload_3         
	//   40   70:invokespecial   #564 <Method void drawChipStroke(Canvas, Rect)>
			drawCompatRipple(canvas, rect);
	//   41   73:aload_0         
	//   42   74:aload_1         
	//   43   75:aload_3         
	//   44   76:invokespecial   #566 <Method void drawCompatRipple(Canvas, Rect)>
			drawChipIcon(canvas, rect);
	//   45   79:aload_0         
	//   46   80:aload_1         
	//   47   81:aload_3         
	//   48   82:invokespecial   #568 <Method void drawChipIcon(Canvas, Rect)>
			drawCheckedIcon(canvas, rect);
	//   49   85:aload_0         
	//   50   86:aload_1         
	//   51   87:aload_3         
	//   52   88:invokespecial   #570 <Method void drawCheckedIcon(Canvas, Rect)>
			if(shouldDrawText)
	//*  53   91:aload_0         
	//*  54   92:getfield        #572 <Field boolean shouldDrawText>
	//*  55   95:ifeq            104
				drawText(canvas, rect);
	//   56   98:aload_0         
	//   57   99:aload_1         
	//   58  100:aload_3         
	//   59  101:invokespecial   #574 <Method void drawText(Canvas, Rect)>
			drawCloseIcon(canvas, rect);
	//   60  104:aload_0         
	//   61  105:aload_1         
	//   62  106:aload_3         
	//   63  107:invokespecial   #576 <Method void drawCloseIcon(Canvas, Rect)>
			drawDebug(canvas, rect);
	//   64  110:aload_0         
	//   65  111:aload_1         
	//   66  112:aload_3         
	//   67  113:invokespecial   #578 <Method void drawDebug(Canvas, Rect)>
			if(alpha < 255)
	//*  68  116:aload_0         
	//*  69  117:getfield        #554 <Field int alpha>
	//*  70  120:sipush          255
	//*  71  123:icmpge          131
				canvas.restoreToCount(i);
	//   72  126:aload_1         
	//   73  127:iload_2         
	//   74  128:invokevirtual   #444 <Method void Canvas.restoreToCount(int)>
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
	//    1    1:getfield        #554 <Field int alpha>
	//    2    4:ireturn         
	}

	public Drawable getCheckedIcon()
	{
		return checkedIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #267 <Field Drawable checkedIcon>
	//    2    4:areturn         
	}

	public ColorStateList getChipBackgroundColor()
	{
		return chipBackgroundColor;
	//    0    0:aload_0         
	//    1    1:getfield        #473 <Field ColorStateList chipBackgroundColor>
	//    2    4:areturn         
	}

	public float getChipCornerRadius()
	{
		return chipCornerRadius;
	//    0    0:aload_0         
	//    1    1:getfield        #327 <Field float chipCornerRadius>
	//    2    4:freturn         
	}

	public float getChipEndPadding()
	{
		return chipEndPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #207 <Field float chipEndPadding>
	//    2    4:freturn         
	}

	public Drawable getChipIcon()
	{
		Drawable drawable = chipIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #334 <Field Drawable chipIcon>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return DrawableCompat.unwrap(drawable);
	//    5    9:aload_1         
	//    6   10:invokestatic    #589 <Method Drawable DrawableCompat.unwrap(Drawable)>
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
	//    1    1:getfield        #182 <Field float chipIconSize>
	//    2    4:freturn         
	}

	public ColorStateList getChipIconTint()
	{
		return chipIconTint;
	//    0    0:aload_0         
	//    1    1:getfield        #593 <Field ColorStateList chipIconTint>
	//    2    4:areturn         
	}

	public float getChipMinHeight()
	{
		return chipMinHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #596 <Field float chipMinHeight>
	//    2    4:freturn         
	}

	public float getChipStartPadding()
	{
		return chipStartPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field float chipStartPadding>
	//    2    4:freturn         
	}

	public ColorStateList getChipStrokeColor()
	{
		return chipStrokeColor;
	//    0    0:aload_0         
	//    1    1:getfield        #479 <Field ColorStateList chipStrokeColor>
	//    2    4:areturn         
	}

	public float getChipStrokeWidth()
	{
		return chipStrokeWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #337 <Field float chipStrokeWidth>
	//    2    4:freturn         
	}

	public Drawable getCloseIcon()
	{
		Drawable drawable = closeIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field Drawable closeIcon>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return DrawableCompat.unwrap(drawable);
	//    5    9:aload_1         
	//    6   10:invokestatic    #589 <Method Drawable DrawableCompat.unwrap(Drawable)>
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
	//    1    1:getfield        #604 <Field CharSequence closeIconContentDescription>
	//    2    4:areturn         
	}

	public float getCloseIconEndPadding()
	{
		return closeIconEndPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field float closeIconEndPadding>
	//    2    4:freturn         
	}

	public float getCloseIconSize()
	{
		return closeIconSize;
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field float closeIconSize>
	//    2    4:freturn         
	}

	public float getCloseIconStartPadding()
	{
		return closeIconStartPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #213 <Field float closeIconStartPadding>
	//    2    4:freturn         
	}

	public int[] getCloseIconState()
	{
		return closeIconStateSet;
	//    0    0:aload_0         
	//    1    1:getfield        #609 <Field int[] closeIconStateSet>
	//    2    4:areturn         
	}

	public ColorStateList getCloseIconTint()
	{
		return closeIconTint;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field ColorStateList closeIconTint>
	//    2    4:areturn         
	}

	public void getCloseIconTouchBounds(RectF rectf)
	{
		calculateCloseIconTouchBounds(getBounds(), rectf);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #546 <Method Rect getBounds()>
	//    3    5:aload_1         
	//    4    6:invokespecial   #378 <Method void calculateCloseIconTouchBounds(Rect, RectF)>
	//    5    9:return          
	}

	public ColorFilter getColorFilter()
	{
		return colorFilter;
	//    0    0:aload_0         
	//    1    1:getfield        #452 <Field ColorFilter colorFilter>
	//    2    4:areturn         
	}

	public android.text.TextUtils.TruncateAt getEllipsize()
	{
		return truncateAt;
	//    0    0:aload_0         
	//    1    1:getfield        #424 <Field android.text.TextUtils$TruncateAt truncateAt>
	//    2    4:areturn         
	}

	public MotionSpec getHideMotionSpec()
	{
		return hideMotionSpec;
	//    0    0:aload_0         
	//    1    1:getfield        #619 <Field MotionSpec hideMotionSpec>
	//    2    4:areturn         
	}

	public float getIconEndPadding()
	{
		return iconEndPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #526 <Field float iconEndPadding>
	//    2    4:freturn         
	}

	public float getIconStartPadding()
	{
		return iconStartPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field float iconStartPadding>
	//    2    4:freturn         
	}

	public int getIntrinsicHeight()
	{
		return (int)chipMinHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #596 <Field float chipMinHeight>
	//    2    4:f2i             
	//    3    5:ireturn         
	}

	public int getIntrinsicWidth()
	{
		return Math.min(Math.round(chipStartPadding + calculateChipIconWidth() + textStartPadding + getTextWidth() + textEndPadding + calculateCloseIconWidth() + chipEndPadding), maxWidth);
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field float chipStartPadding>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #228 <Method float calculateChipIconWidth()>
	//    4    8:fadd            
	//    5    9:aload_0         
	//    6   10:getfield        #230 <Field float textStartPadding>
	//    7   13:fadd            
	//    8   14:aload_0         
	//    9   15:invokespecial   #409 <Method float getTextWidth()>
	//   10   18:fadd            
	//   11   19:aload_0         
	//   12   20:getfield        #215 <Field float textEndPadding>
	//   13   23:fadd            
	//   14   24:aload_0         
	//   15   25:invokespecial   #232 <Method float calculateCloseIconWidth()>
	//   16   28:fadd            
	//   17   29:aload_0         
	//   18   30:getfield        #207 <Field float chipEndPadding>
	//   19   33:fadd            
	//   20   34:invokestatic    #415 <Method int Math.round(float)>
	//   21   37:aload_0         
	//   22   38:getfield        #625 <Field int maxWidth>
	//   23   41:invokestatic    #628 <Method int Math.min(int, int)>
	//   24   44:ireturn         
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
	//    1    1:invokevirtual   #546 <Method Rect getBounds()>
	//    2    4:astore_2        
		if(!rect.isEmpty())
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #549 <Method boolean Rect.isEmpty()>
	//*   5    9:ifne            24
			outline.setRoundRect(rect, chipCornerRadius);
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:aload_0         
	//    9   15:getfield        #327 <Field float chipCornerRadius>
	//   10   18:invokevirtual   #640 <Method void Outline.setRoundRect(Rect, float)>
		else
	//*  11   21:goto            42
			outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), chipCornerRadius);
	//   12   24:aload_1         
	//   13   25:iconst_0        
	//   14   26:iconst_0        
	//   15   27:aload_0         
	//   16   28:invokevirtual   #642 <Method int getIntrinsicWidth()>
	//   17   31:aload_0         
	//   18   32:invokevirtual   #644 <Method int getIntrinsicHeight()>
	//   19   35:aload_0         
	//   20   36:getfield        #327 <Field float chipCornerRadius>
	//   21   39:invokevirtual   #647 <Method void Outline.setRoundRect(int, int, int, int, float)>
		outline.setAlpha((float)getAlpha() / 255F);
	//   22   42:aload_1         
	//   23   43:aload_0         
	//   24   44:invokevirtual   #552 <Method int getAlpha()>
	//   25   47:i2f             
	//   26   48:ldc2            #648 <Float 255F>
	//   27   51:fdiv            
	//   28   52:invokevirtual   #652 <Method void Outline.setAlpha(float)>
	//   29   55:return          
	}

	public ColorStateList getRippleColor()
	{
		return rippleColor;
	//    0    0:aload_0         
	//    1    1:getfield        #518 <Field ColorStateList rippleColor>
	//    2    4:areturn         
	}

	public MotionSpec getShowMotionSpec()
	{
		return showMotionSpec;
	//    0    0:aload_0         
	//    1    1:getfield        #656 <Field MotionSpec showMotionSpec>
	//    2    4:areturn         
	}

	public CharSequence getText()
	{
		return rawText;
	//    0    0:aload_0         
	//    1    1:getfield        #659 <Field CharSequence rawText>
	//    2    4:areturn         
	}

	public TextAppearance getTextAppearance()
	{
		return textAppearance;
	//    0    0:aload_0         
	//    1    1:getfield        #389 <Field TextAppearance textAppearance>
	//    2    4:areturn         
	}

	public float getTextEndPadding()
	{
		return textEndPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #215 <Field float textEndPadding>
	//    2    4:freturn         
	}

	public float getTextStartPadding()
	{
		return textStartPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #230 <Field float textStartPadding>
	//    2    4:freturn         
	}

	public void invalidateDrawable(Drawable drawable)
	{
		drawable = ((Drawable) (getCallback()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #668 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			((android.graphics.drawable.Drawable.Callback) (drawable)).invalidateDrawable(((Drawable) (this)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #670 <Method void android.graphics.drawable.Drawable$Callback.invalidateDrawable(Drawable)>
	//    8   16:return          
	}

	public boolean isCheckable()
	{
		return checkable;
	//    0    0:aload_0         
	//    1    1:getfield        #269 <Field boolean checkable>
	//    2    4:ireturn         
	}

	public boolean isCheckedIconVisible()
	{
		return checkedIconVisible;
	//    0    0:aload_0         
	//    1    1:getfield        #265 <Field boolean checkedIconVisible>
	//    2    4:ireturn         
	}

	public boolean isChipIconVisible()
	{
		return chipIconVisible;
	//    0    0:aload_0         
	//    1    1:getfield        #512 <Field boolean chipIconVisible>
	//    2    4:ireturn         
	}

	public boolean isCloseIconStateful()
	{
		return isStateful(closeIcon);
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field Drawable closeIcon>
	//    2    4:invokestatic    #504 <Method boolean isStateful(Drawable)>
	//    3    7:ireturn         
	}

	public boolean isCloseIconVisible()
	{
		return closeIconVisible;
	//    0    0:aload_0         
	//    1    1:getfield        #514 <Field boolean closeIconVisible>
	//    2    4:ireturn         
	}

	public boolean isStateful()
	{
		return isStateful(chipBackgroundColor) || isStateful(chipStrokeColor) || useCompatRipple && isStateful(compatRippleColor) || isStateful(textAppearance) || canShowCheckedIcon() || isStateful(chipIcon) || isStateful(checkedIcon) || isStateful(tint);
	//    0    0:aload_0         
	//    1    1:getfield        #473 <Field ColorStateList chipBackgroundColor>
	//    2    4:invokestatic    #677 <Method boolean isStateful(ColorStateList)>
	//    3    7:ifne            89
	//    4   10:aload_0         
	//    5   11:getfield        #479 <Field ColorStateList chipStrokeColor>
	//    6   14:invokestatic    #677 <Method boolean isStateful(ColorStateList)>
	//    7   17:ifne            89
	//    8   20:aload_0         
	//    9   21:getfield        #483 <Field boolean useCompatRipple>
	//   10   24:ifeq            37
	//   11   27:aload_0         
	//   12   28:getfield        #481 <Field ColorStateList compatRippleColor>
	//   13   31:invokestatic    #677 <Method boolean isStateful(ColorStateList)>
	//   14   34:ifne            89
	//   15   37:aload_0         
	//   16   38:getfield        #389 <Field TextAppearance textAppearance>
	//   17   41:invokestatic    #679 <Method boolean isStateful(TextAppearance)>
	//   18   44:ifne            89
	//   19   47:aload_0         
	//   20   48:invokespecial   #681 <Method boolean canShowCheckedIcon()>
	//   21   51:ifne            89
	//   22   54:aload_0         
	//   23   55:getfield        #334 <Field Drawable chipIcon>
	//   24   58:invokestatic    #504 <Method boolean isStateful(Drawable)>
	//   25   61:ifne            89
	//   26   64:aload_0         
	//   27   65:getfield        #267 <Field Drawable checkedIcon>
	//   28   68:invokestatic    #504 <Method boolean isStateful(Drawable)>
	//   29   71:ifne            89
	//   30   74:aload_0         
	//   31   75:getfield        #492 <Field ColorStateList tint>
	//   32   78:invokestatic    #677 <Method boolean isStateful(ColorStateList)>
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
	//    2    2:invokespecial   #685 <Method boolean Drawable.onLayoutDirectionChanged(int)>
	//    3    5:istore_3        
		boolean flag = flag1;
	//    4    6:iload_3         
	//    5    7:istore_2        
		if(showsChipIcon())
	//*   6    8:aload_0         
	//*   7    9:invokespecial   #166 <Method boolean showsChipIcon()>
	//*   8   12:ifeq            26
			flag = flag1 | chipIcon.setLayoutDirection(i);
	//    9   15:iload_3         
	//   10   16:aload_0         
	//   11   17:getfield        #334 <Field Drawable chipIcon>
	//   12   20:iload_1         
	//   13   21:invokevirtual   #687 <Method boolean Drawable.setLayoutDirection(int)>
	//   14   24:ior             
	//   15   25:istore_2        
		flag1 = flag;
	//   16   26:iload_2         
	//   17   27:istore_3        
		if(showsCheckedIcon())
	//*  18   28:aload_0         
	//*  19   29:invokespecial   #169 <Method boolean showsCheckedIcon()>
	//*  20   32:ifeq            46
			flag1 = flag | checkedIcon.setLayoutDirection(i);
	//   21   35:iload_2         
	//   22   36:aload_0         
	//   23   37:getfield        #267 <Field Drawable checkedIcon>
	//   24   40:iload_1         
	//   25   41:invokevirtual   #687 <Method boolean Drawable.setLayoutDirection(int)>
	//   26   44:ior             
	//   27   45:istore_3        
		flag = flag1;
	//   28   46:iload_3         
	//   29   47:istore_2        
		if(showsCloseIcon())
	//*  30   48:aload_0         
	//*  31   49:invokespecial   #205 <Method boolean showsCloseIcon()>
	//*  32   52:ifeq            66
			flag = flag1 | closeIcon.setLayoutDirection(i);
	//   33   55:iload_3         
	//   34   56:aload_0         
	//   35   57:getfield        #135 <Field Drawable closeIcon>
	//   36   60:iload_1         
	//   37   61:invokevirtual   #687 <Method boolean Drawable.setLayoutDirection(int)>
	//   38   64:ior             
	//   39   65:istore_2        
		if(flag)
	//*  40   66:iload_2         
	//*  41   67:ifeq            74
			invalidateSelf();
	//   42   70:aload_0         
	//   43   71:invokevirtual   #507 <Method void invalidateSelf()>
		return true;
	//   44   74:iconst_1        
	//   45   75:ireturn         
	}

	protected boolean onLevelChange(int i)
	{
		boolean flag1 = super.onLevelChange(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #690 <Method boolean Drawable.onLevelChange(int)>
	//    3    5:istore_3        
		boolean flag = flag1;
	//    4    6:iload_3         
	//    5    7:istore_2        
		if(showsChipIcon())
	//*   6    8:aload_0         
	//*   7    9:invokespecial   #166 <Method boolean showsChipIcon()>
	//*   8   12:ifeq            26
			flag = flag1 | chipIcon.setLevel(i);
	//    9   15:iload_3         
	//   10   16:aload_0         
	//   11   17:getfield        #334 <Field Drawable chipIcon>
	//   12   20:iload_1         
	//   13   21:invokevirtual   #125 <Method boolean Drawable.setLevel(int)>
	//   14   24:ior             
	//   15   25:istore_2        
		flag1 = flag;
	//   16   26:iload_2         
	//   17   27:istore_3        
		if(showsCheckedIcon())
	//*  18   28:aload_0         
	//*  19   29:invokespecial   #169 <Method boolean showsCheckedIcon()>
	//*  20   32:ifeq            46
			flag1 = flag | checkedIcon.setLevel(i);
	//   21   35:iload_2         
	//   22   36:aload_0         
	//   23   37:getfield        #267 <Field Drawable checkedIcon>
	//   24   40:iload_1         
	//   25   41:invokevirtual   #125 <Method boolean Drawable.setLevel(int)>
	//   26   44:ior             
	//   27   45:istore_3        
		flag = flag1;
	//   28   46:iload_3         
	//   29   47:istore_2        
		if(showsCloseIcon())
	//*  30   48:aload_0         
	//*  31   49:invokespecial   #205 <Method boolean showsCloseIcon()>
	//*  32   52:ifeq            66
			flag = flag1 | closeIcon.setLevel(i);
	//   33   55:iload_3         
	//   34   56:aload_0         
	//   35   57:getfield        #135 <Field Drawable closeIcon>
	//   36   60:iload_1         
	//   37   61:invokevirtual   #125 <Method boolean Drawable.setLevel(int)>
	//   38   64:ior             
	//   39   65:istore_2        
		if(flag)
	//*  40   66:iload_2         
	//*  41   67:ifeq            74
			invalidateSelf();
	//   42   70:aload_0         
	//   43   71:invokevirtual   #507 <Method void invalidateSelf()>
		return flag;
	//   44   74:iload_2         
	//   45   75:ireturn         
	}

	protected void onSizeChange()
	{
		Delegate delegate1 = (Delegate)_flddelegate.get();
	//    0    0:aload_0         
	//    1    1:getfield        #692 <Field WeakReference _flddelegate>
	//    2    4:invokevirtual   #698 <Method Object WeakReference.get()>
	//    3    7:checkcast       #10  <Class ChipDrawable$Delegate>
	//    4   10:astore_1        
		if(delegate1 != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          21
			delegate1.onChipDrawableSizeChange();
	//    7   15:aload_1         
	//    8   16:invokeinterface #701 <Method void ChipDrawable$Delegate.onChipDrawableSizeChange()>
	//    9   21:return          
	}

	protected boolean onStateChange(int ai[])
	{
		return onStateChange(ai, getCloseIconState());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #142 <Method int[] getCloseIconState()>
	//    4    6:invokespecial   #703 <Method boolean onStateChange(int[], int[])>
	//    5    9:ireturn         
	}

	public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
	{
		drawable = ((Drawable) (getCallback()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #668 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
			((android.graphics.drawable.Drawable.Callback) (drawable)).scheduleDrawable(((Drawable) (this)), runnable, l);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:lload_3         
	//    9   13:invokeinterface #707 <Method void android.graphics.drawable.Drawable$Callback.scheduleDrawable(Drawable, Runnable, long)>
	//   10   18:return          
	}

	public void setAlpha(int i)
	{
		if(alpha != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #554 <Field int alpha>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			alpha = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #554 <Field int alpha>
			invalidateSelf();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #507 <Method void invalidateSelf()>
		}
	//    9   17:return          
	}

	public void setCheckable(boolean flag)
	{
		if(checkable != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #269 <Field boolean checkable>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          53
		{
			checkable = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #269 <Field boolean checkable>
			float f = calculateChipIconWidth();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #228 <Method float calculateChipIconWidth()>
	//    9   17:fstore_2        
			if(!flag && currentChecked)
	//*  10   18:iload_1         
	//*  11   19:ifne            34
	//*  12   22:aload_0         
	//*  13   23:getfield        #490 <Field boolean currentChecked>
	//*  14   26:ifeq            34
				currentChecked = false;
	//   15   29:aload_0         
	//   16   30:iconst_0        
	//   17   31:putfield        #490 <Field boolean currentChecked>
			float f1 = calculateChipIconWidth();
	//   18   34:aload_0         
	//   19   35:invokevirtual   #228 <Method float calculateChipIconWidth()>
	//   20   38:fstore_3        
			invalidateSelf();
	//   21   39:aload_0         
	//   22   40:invokevirtual   #507 <Method void invalidateSelf()>
			if(f != f1)
	//*  23   43:fload_2         
	//*  24   44:fload_3         
	//*  25   45:fcmpl           
	//*  26   46:ifeq            53
				onSizeChange();
	//   27   49:aload_0         
	//   28   50:invokevirtual   #510 <Method void onSizeChange()>
		}
	//   29   53:return          
	}

	public void setCheckableResource(int i)
	{
		setCheckable(context.getResources().getBoolean(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:invokevirtual   #717 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #722 <Method boolean Resources.getBoolean(int)>
	//    6   12:invokevirtual   #724 <Method void setCheckable(boolean)>
	//    7   15:return          
	}

	public void setCheckedIcon(Drawable drawable)
	{
		if(checkedIcon != drawable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #267 <Field Drawable checkedIcon>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       53
		{
			float f = calculateChipIconWidth();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #228 <Method float calculateChipIconWidth()>
	//    6   12:fstore_2        
			checkedIcon = drawable;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:putfield        #267 <Field Drawable checkedIcon>
			float f1 = calculateChipIconWidth();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #228 <Method float calculateChipIconWidth()>
	//   12   22:fstore_3        
			unapplyChildDrawable(checkedIcon);
	//   13   23:aload_0         
	//   14   24:aload_0         
	//   15   25:getfield        #267 <Field Drawable checkedIcon>
	//   16   28:invokespecial   #727 <Method void unapplyChildDrawable(Drawable)>
			applyChildDrawable(checkedIcon);
	//   17   31:aload_0         
	//   18   32:aload_0         
	//   19   33:getfield        #267 <Field Drawable checkedIcon>
	//   20   36:invokespecial   #729 <Method void applyChildDrawable(Drawable)>
			invalidateSelf();
	//   21   39:aload_0         
	//   22   40:invokevirtual   #507 <Method void invalidateSelf()>
			if(f != f1)
	//*  23   43:fload_2         
	//*  24   44:fload_3         
	//*  25   45:fcmpl           
	//*  26   46:ifeq            53
				onSizeChange();
	//   27   49:aload_0         
	//   28   50:invokevirtual   #510 <Method void onSizeChange()>
		}
	//   29   53:return          
	}

	public void setCheckedIconResource(int i)
	{
		setCheckedIcon(AppCompatResources.getDrawable(context, i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:iload_1         
	//    4    6:invokestatic    #737 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #739 <Method void setCheckedIcon(Drawable)>
	//    6   12:return          
	}

	public void setCheckedIconVisible(int i)
	{
		setCheckedIconVisible(context.getResources().getBoolean(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:invokevirtual   #717 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #722 <Method boolean Resources.getBoolean(int)>
	//    6   12:invokevirtual   #742 <Method void setCheckedIconVisible(boolean)>
	//    7   15:return          
	}

	public void setCheckedIconVisible(boolean flag)
	{
		if(checkedIconVisible != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #265 <Field boolean checkedIconVisible>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          70
		{
			boolean flag2 = showsCheckedIcon();
	//    4    8:aload_0         
	//    5    9:invokespecial   #169 <Method boolean showsCheckedIcon()>
	//    6   12:istore_3        
			checkedIconVisible = flag;
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:putfield        #265 <Field boolean checkedIconVisible>
			flag = showsCheckedIcon();
	//   10   18:aload_0         
	//   11   19:invokespecial   #169 <Method boolean showsCheckedIcon()>
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
	//   27   45:getfield        #267 <Field Drawable checkedIcon>
	//   28   48:invokespecial   #729 <Method void applyChildDrawable(Drawable)>
				else
	//*  29   51:goto            62
					unapplyChildDrawable(checkedIcon);
	//   30   54:aload_0         
	//   31   55:aload_0         
	//   32   56:getfield        #267 <Field Drawable checkedIcon>
	//   33   59:invokespecial   #727 <Method void unapplyChildDrawable(Drawable)>
				invalidateSelf();
	//   34   62:aload_0         
	//   35   63:invokevirtual   #507 <Method void invalidateSelf()>
				onSizeChange();
	//   36   66:aload_0         
	//   37   67:invokevirtual   #510 <Method void onSizeChange()>
			}
		}
	//   38   70:return          
	}

	public void setChipBackgroundColor(ColorStateList colorstatelist)
	{
		if(chipBackgroundColor != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #473 <Field ColorStateList chipBackgroundColor>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       22
		{
			chipBackgroundColor = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #473 <Field ColorStateList chipBackgroundColor>
			onStateChange(getState());
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #155 <Method int[] getState()>
	//   10   18:invokevirtual   #745 <Method boolean onStateChange(int[])>
	//   11   21:pop             
		}
	//   12   22:return          
	}

	public void setChipBackgroundColorResource(int i)
	{
		setChipBackgroundColor(AppCompatResources.getColorStateList(context, i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:iload_1         
	//    4    6:invokestatic    #751 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//    5    9:invokevirtual   #753 <Method void setChipBackgroundColor(ColorStateList)>
	//    6   12:return          
	}

	public void setChipCornerRadius(float f)
	{
		if(chipCornerRadius != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #327 <Field float chipCornerRadius>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			chipCornerRadius = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #327 <Field float chipCornerRadius>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #507 <Method void invalidateSelf()>
		}
	//   10   18:return          
	}

	public void setChipCornerRadiusResource(int i)
	{
		setChipCornerRadius(context.getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:invokevirtual   #717 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #760 <Method float Resources.getDimension(int)>
	//    6   12:invokevirtual   #762 <Method void setChipCornerRadius(float)>
	//    7   15:return          
	}

	public void setChipEndPadding(float f)
	{
		if(chipEndPadding != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #207 <Field float chipEndPadding>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            22
		{
			chipEndPadding = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #207 <Field float chipEndPadding>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #507 <Method void invalidateSelf()>
			onSizeChange();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #510 <Method void onSizeChange()>
		}
	//   12   22:return          
	}

	public void setChipEndPaddingResource(int i)
	{
		setChipEndPadding(context.getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:invokevirtual   #717 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #760 <Method float Resources.getDimension(int)>
	//    6   12:invokevirtual   #766 <Method void setChipEndPadding(float)>
	//    7   15:return          
	}

	public void setChipIcon(Drawable drawable)
	{
		Drawable drawable1 = getChipIcon();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #769 <Method Drawable getChipIcon()>
	//    2    4:astore          4
		if(drawable1 != drawable)
	//*   3    6:aload           4
	//*   4    8:aload_1         
	//*   5    9:if_acmpeq       79
		{
			float f = calculateChipIconWidth();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #228 <Method float calculateChipIconWidth()>
	//    8   16:fstore_2        
			if(drawable != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          32
				drawable = DrawableCompat.wrap(drawable).mutate();
	//   11   21:aload_1         
	//   12   22:invokestatic    #772 <Method Drawable DrawableCompat.wrap(Drawable)>
	//   13   25:invokevirtual   #775 <Method Drawable Drawable.mutate()>
	//   14   28:astore_1        
			else
	//*  15   29:goto            34
				drawable = null;
	//   16   32:aconst_null     
	//   17   33:astore_1        
			chipIcon = drawable;
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:putfield        #334 <Field Drawable chipIcon>
			float f1 = calculateChipIconWidth();
	//   21   39:aload_0         
	//   22   40:invokevirtual   #228 <Method float calculateChipIconWidth()>
	//   23   43:fstore_3        
			unapplyChildDrawable(drawable1);
	//   24   44:aload_0         
	//   25   45:aload           4
	//   26   47:invokespecial   #727 <Method void unapplyChildDrawable(Drawable)>
			if(showsChipIcon())
	//*  27   50:aload_0         
	//*  28   51:invokespecial   #166 <Method boolean showsChipIcon()>
	//*  29   54:ifeq            65
				applyChildDrawable(chipIcon);
	//   30   57:aload_0         
	//   31   58:aload_0         
	//   32   59:getfield        #334 <Field Drawable chipIcon>
	//   33   62:invokespecial   #729 <Method void applyChildDrawable(Drawable)>
			invalidateSelf();
	//   34   65:aload_0         
	//   35   66:invokevirtual   #507 <Method void invalidateSelf()>
			if(f != f1)
	//*  36   69:fload_2         
	//*  37   70:fload_3         
	//*  38   71:fcmpl           
	//*  39   72:ifeq            79
				onSizeChange();
	//   40   75:aload_0         
	//   41   76:invokevirtual   #510 <Method void onSizeChange()>
		}
	//   42   79:return          
	}

	public void setChipIconResource(int i)
	{
		setChipIcon(AppCompatResources.getDrawable(context, i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:iload_1         
	//    4    6:invokestatic    #737 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #778 <Method void setChipIcon(Drawable)>
	//    6   12:return          
	}

	public void setChipIconSize(float f)
	{
		if(chipIconSize != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #182 <Field float chipIconSize>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            38
		{
			float f1 = calculateChipIconWidth();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #228 <Method float calculateChipIconWidth()>
	//    7   13:fstore_2        
			chipIconSize = f;
	//    8   14:aload_0         
	//    9   15:fload_1         
	//   10   16:putfield        #182 <Field float chipIconSize>
			f = calculateChipIconWidth();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #228 <Method float calculateChipIconWidth()>
	//   13   23:fstore_1        
			invalidateSelf();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #507 <Method void invalidateSelf()>
			if(f1 != f)
	//*  16   28:fload_2         
	//*  17   29:fload_1         
	//*  18   30:fcmpl           
	//*  19   31:ifeq            38
				onSizeChange();
	//   20   34:aload_0         
	//   21   35:invokevirtual   #510 <Method void onSizeChange()>
		}
	//   22   38:return          
	}

	public void setChipIconSizeResource(int i)
	{
		setChipIconSize(context.getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:invokevirtual   #717 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #760 <Method float Resources.getDimension(int)>
	//    6   12:invokevirtual   #782 <Method void setChipIconSize(float)>
	//    7   15:return          
	}

	public void setChipIconTint(ColorStateList colorstatelist)
	{
		if(chipIconTint != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #593 <Field ColorStateList chipIconTint>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       37
		{
			chipIconTint = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #593 <Field ColorStateList chipIconTint>
			if(showsChipIcon())
	//*   7   13:aload_0         
	//*   8   14:invokespecial   #166 <Method boolean showsChipIcon()>
	//*   9   17:ifeq            28
				DrawableCompat.setTintList(chipIcon, colorstatelist);
	//   10   20:aload_0         
	//   11   21:getfield        #334 <Field Drawable chipIcon>
	//   12   24:aload_1         
	//   13   25:invokestatic    #152 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			onStateChange(getState());
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:invokevirtual   #155 <Method int[] getState()>
	//   17   33:invokevirtual   #745 <Method boolean onStateChange(int[])>
	//   18   36:pop             
		}
	//   19   37:return          
	}

	public void setChipIconTintResource(int i)
	{
		setChipIconTint(AppCompatResources.getColorStateList(context, i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:iload_1         
	//    4    6:invokestatic    #751 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//    5    9:invokevirtual   #786 <Method void setChipIconTint(ColorStateList)>
	//    6   12:return          
	}

	public void setChipIconVisible(int i)
	{
		setChipIconVisible(context.getResources().getBoolean(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:invokevirtual   #717 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #722 <Method boolean Resources.getBoolean(int)>
	//    6   12:invokevirtual   #789 <Method void setChipIconVisible(boolean)>
	//    7   15:return          
	}

	public void setChipIconVisible(boolean flag)
	{
		if(chipIconVisible != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #512 <Field boolean chipIconVisible>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          70
		{
			boolean flag2 = showsChipIcon();
	//    4    8:aload_0         
	//    5    9:invokespecial   #166 <Method boolean showsChipIcon()>
	//    6   12:istore_3        
			chipIconVisible = flag;
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:putfield        #512 <Field boolean chipIconVisible>
			flag = showsChipIcon();
	//   10   18:aload_0         
	//   11   19:invokespecial   #166 <Method boolean showsChipIcon()>
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
	//   27   45:getfield        #334 <Field Drawable chipIcon>
	//   28   48:invokespecial   #729 <Method void applyChildDrawable(Drawable)>
				else
	//*  29   51:goto            62
					unapplyChildDrawable(chipIcon);
	//   30   54:aload_0         
	//   31   55:aload_0         
	//   32   56:getfield        #334 <Field Drawable chipIcon>
	//   33   59:invokespecial   #727 <Method void unapplyChildDrawable(Drawable)>
				invalidateSelf();
	//   34   62:aload_0         
	//   35   63:invokevirtual   #507 <Method void invalidateSelf()>
				onSizeChange();
	//   36   66:aload_0         
	//   37   67:invokevirtual   #510 <Method void onSizeChange()>
			}
		}
	//   38   70:return          
	}

	public void setChipMinHeight(float f)
	{
		if(chipMinHeight != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #596 <Field float chipMinHeight>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            22
		{
			chipMinHeight = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #596 <Field float chipMinHeight>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #507 <Method void invalidateSelf()>
			onSizeChange();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #510 <Method void onSizeChange()>
		}
	//   12   22:return          
	}

	public void setChipMinHeightResource(int i)
	{
		setChipMinHeight(context.getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:invokevirtual   #717 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #760 <Method float Resources.getDimension(int)>
	//    6   12:invokevirtual   #793 <Method void setChipMinHeight(float)>
	//    7   15:return          
	}

	public void setChipStartPadding(float f)
	{
		if(chipStartPadding != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #171 <Field float chipStartPadding>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            22
		{
			chipStartPadding = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #171 <Field float chipStartPadding>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #507 <Method void invalidateSelf()>
			onSizeChange();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #510 <Method void onSizeChange()>
		}
	//   12   22:return          
	}

	public void setChipStartPaddingResource(int i)
	{
		setChipStartPadding(context.getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:invokevirtual   #717 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #760 <Method float Resources.getDimension(int)>
	//    6   12:invokevirtual   #797 <Method void setChipStartPadding(float)>
	//    7   15:return          
	}

	public void setChipStrokeColor(ColorStateList colorstatelist)
	{
		if(chipStrokeColor != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #479 <Field ColorStateList chipStrokeColor>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       22
		{
			chipStrokeColor = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #479 <Field ColorStateList chipStrokeColor>
			onStateChange(getState());
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #155 <Method int[] getState()>
	//   10   18:invokevirtual   #745 <Method boolean onStateChange(int[])>
	//   11   21:pop             
		}
	//   12   22:return          
	}

	public void setChipStrokeColorResource(int i)
	{
		setChipStrokeColor(AppCompatResources.getColorStateList(context, i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:iload_1         
	//    4    6:invokestatic    #751 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//    5    9:invokevirtual   #801 <Method void setChipStrokeColor(ColorStateList)>
	//    6   12:return          
	}

	public void setChipStrokeWidth(float f)
	{
		if(chipStrokeWidth != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #337 <Field float chipStrokeWidth>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            26
		{
			chipStrokeWidth = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #337 <Field float chipStrokeWidth>
			chipPaint.setStrokeWidth(f);
	//    8   14:aload_0         
	//    9   15:getfield        #299 <Field Paint chipPaint>
	//   10   18:fload_1         
	//   11   19:invokevirtual   #805 <Method void Paint.setStrokeWidth(float)>
			invalidateSelf();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #507 <Method void invalidateSelf()>
		}
	//   14   26:return          
	}

	public void setChipStrokeWidthResource(int i)
	{
		setChipStrokeWidth(context.getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:invokevirtual   #717 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #760 <Method float Resources.getDimension(int)>
	//    6   12:invokevirtual   #808 <Method void setChipStrokeWidth(float)>
	//    7   15:return          
	}

	public void setCloseIcon(Drawable drawable)
	{
		Drawable drawable1 = getCloseIcon();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #811 <Method Drawable getCloseIcon()>
	//    2    4:astore          4
		if(drawable1 != drawable)
	//*   3    6:aload           4
	//*   4    8:aload_1         
	//*   5    9:if_acmpeq       79
		{
			float f = calculateCloseIconWidth();
	//    6   12:aload_0         
	//    7   13:invokespecial   #232 <Method float calculateCloseIconWidth()>
	//    8   16:fstore_2        
			if(drawable != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          32
				drawable = DrawableCompat.wrap(drawable).mutate();
	//   11   21:aload_1         
	//   12   22:invokestatic    #772 <Method Drawable DrawableCompat.wrap(Drawable)>
	//   13   25:invokevirtual   #775 <Method Drawable Drawable.mutate()>
	//   14   28:astore_1        
			else
	//*  15   29:goto            34
				drawable = null;
	//   16   32:aconst_null     
	//   17   33:astore_1        
			closeIcon = drawable;
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:putfield        #135 <Field Drawable closeIcon>
			float f1 = calculateCloseIconWidth();
	//   21   39:aload_0         
	//   22   40:invokespecial   #232 <Method float calculateCloseIconWidth()>
	//   23   43:fstore_3        
			unapplyChildDrawable(drawable1);
	//   24   44:aload_0         
	//   25   45:aload           4
	//   26   47:invokespecial   #727 <Method void unapplyChildDrawable(Drawable)>
			if(showsCloseIcon())
	//*  27   50:aload_0         
	//*  28   51:invokespecial   #205 <Method boolean showsCloseIcon()>
	//*  29   54:ifeq            65
				applyChildDrawable(closeIcon);
	//   30   57:aload_0         
	//   31   58:aload_0         
	//   32   59:getfield        #135 <Field Drawable closeIcon>
	//   33   62:invokespecial   #729 <Method void applyChildDrawable(Drawable)>
			invalidateSelf();
	//   34   65:aload_0         
	//   35   66:invokevirtual   #507 <Method void invalidateSelf()>
			if(f != f1)
	//*  36   69:fload_2         
	//*  37   70:fload_3         
	//*  38   71:fcmpl           
	//*  39   72:ifeq            79
				onSizeChange();
	//   40   75:aload_0         
	//   41   76:invokevirtual   #510 <Method void onSizeChange()>
		}
	//   42   79:return          
	}

	public void setCloseIconContentDescription(CharSequence charsequence)
	{
		if(closeIconContentDescription != charsequence)
	//*   0    0:aload_0         
	//*   1    1:getfield        #604 <Field CharSequence closeIconContentDescription>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       23
		{
			closeIconContentDescription = BidiFormatter.getInstance().unicodeWrap(charsequence);
	//    4    8:aload_0         
	//    5    9:invokestatic    #819 <Method BidiFormatter BidiFormatter.getInstance()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #823 <Method CharSequence BidiFormatter.unicodeWrap(CharSequence)>
	//    8   16:putfield        #604 <Field CharSequence closeIconContentDescription>
			invalidateSelf();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #507 <Method void invalidateSelf()>
		}
	//   11   23:return          
	}

	public void setCloseIconEndPadding(float f)
	{
		if(closeIconEndPadding != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #209 <Field float closeIconEndPadding>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            29
		{
			closeIconEndPadding = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #209 <Field float closeIconEndPadding>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #507 <Method void invalidateSelf()>
			if(showsCloseIcon())
	//*  10   18:aload_0         
	//*  11   19:invokespecial   #205 <Method boolean showsCloseIcon()>
	//*  12   22:ifeq            29
				onSizeChange();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #510 <Method void onSizeChange()>
		}
	//   15   29:return          
	}

	public void setCloseIconEndPaddingResource(int i)
	{
		setCloseIconEndPadding(context.getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:invokevirtual   #717 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #760 <Method float Resources.getDimension(int)>
	//    6   12:invokevirtual   #827 <Method void setCloseIconEndPadding(float)>
	//    7   15:return          
	}

	public void setCloseIconResource(int i)
	{
		setCloseIcon(AppCompatResources.getDrawable(context, i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:iload_1         
	//    4    6:invokestatic    #737 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #830 <Method void setCloseIcon(Drawable)>
	//    6   12:return          
	}

	public void setCloseIconSize(float f)
	{
		if(closeIconSize != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #211 <Field float closeIconSize>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            29
		{
			closeIconSize = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #211 <Field float closeIconSize>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #507 <Method void invalidateSelf()>
			if(showsCloseIcon())
	//*  10   18:aload_0         
	//*  11   19:invokespecial   #205 <Method boolean showsCloseIcon()>
	//*  12   22:ifeq            29
				onSizeChange();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #510 <Method void onSizeChange()>
		}
	//   15   29:return          
	}

	public void setCloseIconSizeResource(int i)
	{
		setCloseIconSize(context.getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:invokevirtual   #717 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #760 <Method float Resources.getDimension(int)>
	//    6   12:invokevirtual   #834 <Method void setCloseIconSize(float)>
	//    7   15:return          
	}

	public void setCloseIconStartPadding(float f)
	{
		if(closeIconStartPadding != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #213 <Field float closeIconStartPadding>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            29
		{
			closeIconStartPadding = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #213 <Field float closeIconStartPadding>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #507 <Method void invalidateSelf()>
			if(showsCloseIcon())
	//*  10   18:aload_0         
	//*  11   19:invokespecial   #205 <Method boolean showsCloseIcon()>
	//*  12   22:ifeq            29
				onSizeChange();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #510 <Method void onSizeChange()>
		}
	//   15   29:return          
	}

	public void setCloseIconStartPaddingResource(int i)
	{
		setCloseIconStartPadding(context.getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:invokevirtual   #717 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #760 <Method float Resources.getDimension(int)>
	//    6   12:invokevirtual   #838 <Method void setCloseIconStartPadding(float)>
	//    7   15:return          
	}

	public boolean setCloseIconState(int ai[])
	{
		if(!Arrays.equals(closeIconStateSet, ai))
	//*   0    0:aload_0         
	//*   1    1:getfield        #609 <Field int[] closeIconStateSet>
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #844 <Method boolean Arrays.equals(int[], int[])>
	//*   4    8:ifne            33
		{
			closeIconStateSet = ai;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #609 <Field int[] closeIconStateSet>
			if(showsCloseIcon())
	//*   8   16:aload_0         
	//*   9   17:invokespecial   #205 <Method boolean showsCloseIcon()>
	//*  10   20:ifeq            33
				return onStateChange(getState(), ai);
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:invokevirtual   #155 <Method int[] getState()>
	//   14   28:aload_1         
	//   15   29:invokespecial   #703 <Method boolean onStateChange(int[], int[])>
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
	//*   1    1:getfield        #148 <Field ColorStateList closeIconTint>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       37
		{
			closeIconTint = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #148 <Field ColorStateList closeIconTint>
			if(showsCloseIcon())
	//*   7   13:aload_0         
	//*   8   14:invokespecial   #205 <Method boolean showsCloseIcon()>
	//*   9   17:ifeq            28
				DrawableCompat.setTintList(closeIcon, colorstatelist);
	//   10   20:aload_0         
	//   11   21:getfield        #135 <Field Drawable closeIcon>
	//   12   24:aload_1         
	//   13   25:invokestatic    #152 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			onStateChange(getState());
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:invokevirtual   #155 <Method int[] getState()>
	//   17   33:invokevirtual   #745 <Method boolean onStateChange(int[])>
	//   18   36:pop             
		}
	//   19   37:return          
	}

	public void setCloseIconTintResource(int i)
	{
		setCloseIconTint(AppCompatResources.getColorStateList(context, i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:iload_1         
	//    4    6:invokestatic    #751 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//    5    9:invokevirtual   #848 <Method void setCloseIconTint(ColorStateList)>
	//    6   12:return          
	}

	public void setCloseIconVisible(int i)
	{
		setCloseIconVisible(context.getResources().getBoolean(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:invokevirtual   #717 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #722 <Method boolean Resources.getBoolean(int)>
	//    6   12:invokevirtual   #851 <Method void setCloseIconVisible(boolean)>
	//    7   15:return          
	}

	public void setCloseIconVisible(boolean flag)
	{
		if(closeIconVisible != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #514 <Field boolean closeIconVisible>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          70
		{
			boolean flag2 = showsCloseIcon();
	//    4    8:aload_0         
	//    5    9:invokespecial   #205 <Method boolean showsCloseIcon()>
	//    6   12:istore_3        
			closeIconVisible = flag;
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:putfield        #514 <Field boolean closeIconVisible>
			flag = showsCloseIcon();
	//   10   18:aload_0         
	//   11   19:invokespecial   #205 <Method boolean showsCloseIcon()>
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
	//   27   45:getfield        #135 <Field Drawable closeIcon>
	//   28   48:invokespecial   #729 <Method void applyChildDrawable(Drawable)>
				else
	//*  29   51:goto            62
					unapplyChildDrawable(closeIcon);
	//   30   54:aload_0         
	//   31   55:aload_0         
	//   32   56:getfield        #135 <Field Drawable closeIcon>
	//   33   59:invokespecial   #727 <Method void unapplyChildDrawable(Drawable)>
				invalidateSelf();
	//   34   62:aload_0         
	//   35   63:invokevirtual   #507 <Method void invalidateSelf()>
				onSizeChange();
	//   36   66:aload_0         
	//   37   67:invokevirtual   #510 <Method void onSizeChange()>
			}
		}
	//   38   70:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		if(colorFilter != colorfilter)
	//*   0    0:aload_0         
	//*   1    1:getfield        #452 <Field ColorFilter colorFilter>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			colorFilter = colorfilter;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #452 <Field ColorFilter colorFilter>
			invalidateSelf();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #507 <Method void invalidateSelf()>
		}
	//    9   17:return          
	}

	public void setDelegate(Delegate delegate1)
	{
		_flddelegate = new WeakReference(((Object) (delegate1)));
	//    0    0:aload_0         
	//    1    1:new             #694 <Class WeakReference>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #858 <Method void WeakReference(Object)>
	//    5    9:putfield        #692 <Field WeakReference _flddelegate>
	//    6   12:return          
	}

	public void setEllipsize(android.text.TextUtils.TruncateAt truncateat)
	{
		truncateAt = truncateat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #424 <Field android.text.TextUtils$TruncateAt truncateAt>
	//    3    5:return          
	}

	public void setHideMotionSpec(MotionSpec motionspec)
	{
		hideMotionSpec = motionspec;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #619 <Field MotionSpec hideMotionSpec>
	//    3    5:return          
	}

	public void setHideMotionSpecResource(int i)
	{
		setHideMotionSpec(MotionSpec.createFromResource(context, i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:iload_1         
	//    4    6:invokestatic    #870 <Method MotionSpec MotionSpec.createFromResource(Context, int)>
	//    5    9:invokevirtual   #872 <Method void setHideMotionSpec(MotionSpec)>
	//    6   12:return          
	}

	public void setIconEndPadding(float f)
	{
		if(iconEndPadding != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #526 <Field float iconEndPadding>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            38
		{
			float f1 = calculateChipIconWidth();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #228 <Method float calculateChipIconWidth()>
	//    7   13:fstore_2        
			iconEndPadding = f;
	//    8   14:aload_0         
	//    9   15:fload_1         
	//   10   16:putfield        #526 <Field float iconEndPadding>
			f = calculateChipIconWidth();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #228 <Method float calculateChipIconWidth()>
	//   13   23:fstore_1        
			invalidateSelf();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #507 <Method void invalidateSelf()>
			if(f1 != f)
	//*  16   28:fload_2         
	//*  17   29:fload_1         
	//*  18   30:fcmpl           
	//*  19   31:ifeq            38
				onSizeChange();
	//   20   34:aload_0         
	//   21   35:invokevirtual   #510 <Method void onSizeChange()>
		}
	//   22   38:return          
	}

	public void setIconEndPaddingResource(int i)
	{
		setIconEndPadding(context.getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:invokevirtual   #717 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #760 <Method float Resources.getDimension(int)>
	//    6   12:invokevirtual   #876 <Method void setIconEndPadding(float)>
	//    7   15:return          
	}

	public void setIconStartPadding(float f)
	{
		if(iconStartPadding != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #173 <Field float iconStartPadding>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            38
		{
			float f1 = calculateChipIconWidth();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #228 <Method float calculateChipIconWidth()>
	//    7   13:fstore_2        
			iconStartPadding = f;
	//    8   14:aload_0         
	//    9   15:fload_1         
	//   10   16:putfield        #173 <Field float iconStartPadding>
			f = calculateChipIconWidth();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #228 <Method float calculateChipIconWidth()>
	//   13   23:fstore_1        
			invalidateSelf();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #507 <Method void invalidateSelf()>
			if(f1 != f)
	//*  16   28:fload_2         
	//*  17   29:fload_1         
	//*  18   30:fcmpl           
	//*  19   31:ifeq            38
				onSizeChange();
	//   20   34:aload_0         
	//   21   35:invokevirtual   #510 <Method void onSizeChange()>
		}
	//   22   38:return          
	}

	public void setIconStartPaddingResource(int i)
	{
		setIconStartPadding(context.getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:invokevirtual   #717 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #760 <Method float Resources.getDimension(int)>
	//    6   12:invokevirtual   #880 <Method void setIconStartPadding(float)>
	//    7   15:return          
	}

	public void setMaxWidth(int i)
	{
		maxWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #625 <Field int maxWidth>
	//    3    5:return          
	}

	public void setRippleColor(ColorStateList colorstatelist)
	{
		if(rippleColor != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #518 <Field ColorStateList rippleColor>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       26
		{
			rippleColor = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #518 <Field ColorStateList rippleColor>
			updateCompatRippleColor();
	//    7   13:aload_0         
	//    8   14:invokespecial   #885 <Method void updateCompatRippleColor()>
			onStateChange(getState());
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #155 <Method int[] getState()>
	//   12   22:invokevirtual   #745 <Method boolean onStateChange(int[])>
	//   13   25:pop             
		}
	//   14   26:return          
	}

	public void setRippleColorResource(int i)
	{
		setRippleColor(AppCompatResources.getColorStateList(context, i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:iload_1         
	//    4    6:invokestatic    #751 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//    5    9:invokevirtual   #888 <Method void setRippleColor(ColorStateList)>
	//    6   12:return          
	}

	public void setShowMotionSpec(MotionSpec motionspec)
	{
		showMotionSpec = motionspec;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #656 <Field MotionSpec showMotionSpec>
	//    3    5:return          
	}

	public void setShowMotionSpecResource(int i)
	{
		setShowMotionSpec(MotionSpec.createFromResource(context, i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:iload_1         
	//    4    6:invokestatic    #870 <Method MotionSpec MotionSpec.createFromResource(Context, int)>
	//    5    9:invokevirtual   #892 <Method void setShowMotionSpec(MotionSpec)>
	//    6   12:return          
	}

	public void setText(CharSequence charsequence)
	{
		Object obj = ((Object) (charsequence));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(charsequence == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       10
			obj = "";
	//    4    6:ldc2            #895 <String "">
	//    5    9:astore_2        
		if(rawText != obj)
	//*   6   10:aload_0         
	//*   7   11:getfield        #659 <Field CharSequence rawText>
	//*   8   14:aload_2         
	//*   9   15:if_acmpeq       47
		{
			rawText = ((CharSequence) (obj));
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:putfield        #659 <Field CharSequence rawText>
			unicodeWrappedText = BidiFormatter.getInstance().unicodeWrap(((CharSequence) (obj)));
	//   13   23:aload_0         
	//   14   24:invokestatic    #819 <Method BidiFormatter BidiFormatter.getInstance()>
	//   15   27:aload_2         
	//   16   28:invokevirtual   #823 <Method CharSequence BidiFormatter.unicodeWrap(CharSequence)>
	//   17   31:putfield        #225 <Field CharSequence unicodeWrappedText>
			textWidthDirty = true;
	//   18   34:aload_0         
	//   19   35:iconst_1        
	//   20   36:putfield        #446 <Field boolean textWidthDirty>
			invalidateSelf();
	//   21   39:aload_0         
	//   22   40:invokevirtual   #507 <Method void invalidateSelf()>
			onSizeChange();
	//   23   43:aload_0         
	//   24   44:invokevirtual   #510 <Method void onSizeChange()>
		}
	//   25   47:return          
	}

	public void setTextAppearance(TextAppearance textappearance)
	{
		if(textAppearance != textappearance)
	//*   0    0:aload_0         
	//*   1    1:getfield        #389 <Field TextAppearance textAppearance>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       51
		{
			textAppearance = textappearance;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #389 <Field TextAppearance textAppearance>
			if(textappearance != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          38
			{
				textappearance.updateMeasureState(context, textPaint, fontCallback);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #394 <Field Context context>
	//   12   22:aload_0         
	//   13   23:getfield        #235 <Field TextPaint textPaint>
	//   14   26:aload_0         
	//   15   27:getfield        #396 <Field android.support.v4.content.res.ResourcesCompat$FontCallback fontCallback>
	//   16   30:invokevirtual   #900 <Method void TextAppearance.updateMeasureState(Context, TextPaint, android.support.v4.content.res.ResourcesCompat$FontCallback)>
				textWidthDirty = true;
	//   17   33:aload_0         
	//   18   34:iconst_1        
	//   19   35:putfield        #446 <Field boolean textWidthDirty>
			}
			onStateChange(getState());
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:invokevirtual   #155 <Method int[] getState()>
	//   23   43:invokevirtual   #745 <Method boolean onStateChange(int[])>
	//   24   46:pop             
			onSizeChange();
	//   25   47:aload_0         
	//   26   48:invokevirtual   #510 <Method void onSizeChange()>
		}
	//   27   51:return          
	}

	public void setTextAppearanceResource(int i)
	{
		setTextAppearance(new TextAppearance(context, i));
	//    0    0:aload_0         
	//    1    1:new             #398 <Class TextAppearance>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #394 <Field Context context>
	//    5    9:iload_1         
	//    6   10:invokespecial   #905 <Method void TextAppearance(Context, int)>
	//    7   13:invokevirtual   #907 <Method void setTextAppearance(TextAppearance)>
	//    8   16:return          
	}

	public void setTextEndPadding(float f)
	{
		if(textEndPadding != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #215 <Field float textEndPadding>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            22
		{
			textEndPadding = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #215 <Field float textEndPadding>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #507 <Method void invalidateSelf()>
			onSizeChange();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #510 <Method void onSizeChange()>
		}
	//   12   22:return          
	}

	public void setTextEndPaddingResource(int i)
	{
		setTextEndPadding(context.getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:invokevirtual   #717 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #760 <Method float Resources.getDimension(int)>
	//    6   12:invokevirtual   #911 <Method void setTextEndPadding(float)>
	//    7   15:return          
	}

	public void setTextStartPadding(float f)
	{
		if(textStartPadding != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #230 <Field float textStartPadding>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            22
		{
			textStartPadding = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #230 <Field float textStartPadding>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #507 <Method void invalidateSelf()>
			onSizeChange();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #510 <Method void onSizeChange()>
		}
	//   12   22:return          
	}

	public void setTextStartPaddingResource(int i)
	{
		setTextStartPadding(context.getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #394 <Field Context context>
	//    3    5:invokevirtual   #717 <Method Resources Context.getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #760 <Method float Resources.getDimension(int)>
	//    6   12:invokevirtual   #915 <Method void setTextStartPadding(float)>
	//    7   15:return          
	}

	public void setTintList(ColorStateList colorstatelist)
	{
		if(tint != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #492 <Field ColorStateList tint>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       22
		{
			tint = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #492 <Field ColorStateList tint>
			onStateChange(getState());
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #155 <Method int[] getState()>
	//   10   18:invokevirtual   #745 <Method boolean onStateChange(int[])>
	//   11   21:pop             
		}
	//   12   22:return          
	}

	public void setTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(tintMode != mode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #496 <Field android.graphics.PorterDuff$Mode tintMode>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       30
		{
			tintMode = mode;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #496 <Field android.graphics.PorterDuff$Mode tintMode>
			tintFilter = DrawableUtils.updateTintFilter(((Drawable) (this)), tint, mode);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #492 <Field ColorStateList tint>
	//   11   19:aload_1         
	//   12   20:invokestatic    #502 <Method PorterDuffColorFilter DrawableUtils.updateTintFilter(Drawable, ColorStateList, android.graphics.PorterDuff$Mode)>
	//   13   23:putfield        #454 <Field PorterDuffColorFilter tintFilter>
			invalidateSelf();
	//   14   26:aload_0         
	//   15   27:invokevirtual   #507 <Method void invalidateSelf()>
		}
	//   16   30:return          
	}

	public void setUseCompatRipple(boolean flag)
	{
		if(useCompatRipple != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #483 <Field boolean useCompatRipple>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          26
		{
			useCompatRipple = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #483 <Field boolean useCompatRipple>
			updateCompatRippleColor();
	//    7   13:aload_0         
	//    8   14:invokespecial   #885 <Method void updateCompatRippleColor()>
			onStateChange(getState());
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #155 <Method int[] getState()>
	//   12   22:invokevirtual   #745 <Method boolean onStateChange(int[])>
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
	//    3    3:invokespecial   #133 <Method boolean Drawable.setVisible(boolean, boolean)>
	//    4    6:istore          4
		boolean flag2 = flag3;
	//    5    8:iload           4
	//    6   10:istore_3        
		if(showsChipIcon())
	//*   7   11:aload_0         
	//*   8   12:invokespecial   #166 <Method boolean showsChipIcon()>
	//*   9   15:ifeq            31
			flag2 = flag3 | chipIcon.setVisible(flag, flag1);
	//   10   18:iload           4
	//   11   20:aload_0         
	//   12   21:getfield        #334 <Field Drawable chipIcon>
	//   13   24:iload_1         
	//   14   25:iload_2         
	//   15   26:invokevirtual   #133 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   16   29:ior             
	//   17   30:istore_3        
		flag3 = flag2;
	//   18   31:iload_3         
	//   19   32:istore          4
		if(showsCheckedIcon())
	//*  20   34:aload_0         
	//*  21   35:invokespecial   #169 <Method boolean showsCheckedIcon()>
	//*  22   38:ifeq            54
			flag3 = flag2 | checkedIcon.setVisible(flag, flag1);
	//   23   41:iload_3         
	//   24   42:aload_0         
	//   25   43:getfield        #267 <Field Drawable checkedIcon>
	//   26   46:iload_1         
	//   27   47:iload_2         
	//   28   48:invokevirtual   #133 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   29   51:ior             
	//   30   52:istore          4
		flag2 = flag3;
	//   31   54:iload           4
	//   32   56:istore_3        
		if(showsCloseIcon())
	//*  33   57:aload_0         
	//*  34   58:invokespecial   #205 <Method boolean showsCloseIcon()>
	//*  35   61:ifeq            77
			flag2 = flag3 | closeIcon.setVisible(flag, flag1);
	//   36   64:iload           4
	//   37   66:aload_0         
	//   38   67:getfield        #135 <Field Drawable closeIcon>
	//   39   70:iload_1         
	//   40   71:iload_2         
	//   41   72:invokevirtual   #133 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   42   75:ior             
	//   43   76:istore_3        
		if(flag2)
	//*  44   77:iload_3         
	//*  45   78:ifeq            85
			invalidateSelf();
	//   46   81:aload_0         
	//   47   82:invokevirtual   #507 <Method void invalidateSelf()>
		return flag2;
	//   48   85:iload_3         
	//   49   86:ireturn         
	}

	boolean shouldDrawText()
	{
		return shouldDrawText;
	//    0    0:aload_0         
	//    1    1:getfield        #572 <Field boolean shouldDrawText>
	//    2    4:ireturn         
	}

	public void unscheduleDrawable(Drawable drawable, Runnable runnable)
	{
		drawable = ((Drawable) (getCallback()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #668 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//    2    4:astore_1        
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
			((android.graphics.drawable.Drawable.Callback) (drawable)).unscheduleDrawable(((Drawable) (this)), runnable);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokeinterface #922 <Method void android.graphics.drawable.Drawable$Callback.unscheduleDrawable(Drawable, Runnable)>
	//    9   17:return          
	}

	private static final int DEFAULT_STATE[] = {
		0x101009e
	};
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
	private final Paint chipPaint;
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
	private final Paint debugPaint;
	private WeakReference _flddelegate;
	private final android.support.v4.content.res.ResourcesCompat.FontCallback fontCallback;
	private final android.graphics.Paint.FontMetrics fontMetrics;
	private MotionSpec hideMotionSpec;
	private float iconEndPadding;
	private float iconStartPadding;
	private int maxWidth;
	private final PointF pointF;
	private CharSequence rawText;
	private final RectF rectF;
	private ColorStateList rippleColor;
	private boolean shouldDrawText;
	private MotionSpec showMotionSpec;
	private TextAppearance textAppearance;
	private float textEndPadding;
	private final TextPaint textPaint;
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
	//    4    5:ldc1            #98  <Int 0x101009e>
	//    5    7:iastore         
	//    6    8:putstatic       #100 <Field int[] DEFAULT_STATE>
	//*   7   11:return          
	}
}
