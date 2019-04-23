// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v4.util.Preconditions;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.util.DisplayMetrics;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.annotation.Annotation;

public class CircularProgressDrawable extends Drawable
	implements Animatable
{
	public static interface ProgressDrawableSize
		extends Annotation
	{
	}

	private static class Ring
	{

		void draw(Canvas canvas, Rect rect)
		{
			RectF rectf = mTempBounds;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field RectF mTempBounds>
		//    2    4:astore          6
			float f1 = mRingCenterRadius;
		//    3    6:aload_0         
		//    4    7:getfield        #102 <Field float mRingCenterRadius>
		//    5   10:fstore          4
			float f = mStrokeWidth / 2.0F + f1;
		//    6   12:aload_0         
		//    7   13:getfield        #62  <Field float mStrokeWidth>
		//    8   16:fconst_2        
		//    9   17:fdiv            
		//   10   18:fload           4
		//   11   20:fadd            
		//   12   21:fstore_3        
			if(f1 <= 0.0F)
		//*  13   22:fload           4
		//*  14   24:fconst_0        
		//*  15   25:fcmpg           
		//*  16   26:ifgt            66
				f = (float)Math.min(rect.width(), rect.height()) / 2.0F - Math.max(((float)mArrowWidth * mArrowScale) / 2.0F, mStrokeWidth / 2.0F);
		//   17   29:aload_2         
		//   18   30:invokevirtual   #108 <Method int Rect.width()>
		//   19   33:aload_2         
		//   20   34:invokevirtual   #111 <Method int Rect.height()>
		//   21   37:invokestatic    #117 <Method int Math.min(int, int)>
		//   22   40:i2f             
		//   23   41:fconst_2        
		//   24   42:fdiv            
		//   25   43:aload_0         
		//   26   44:getfield        #119 <Field int mArrowWidth>
		//   27   47:i2f             
		//   28   48:aload_0         
		//   29   49:getfield        #64  <Field float mArrowScale>
		//   30   52:fmul            
		//   31   53:fconst_2        
		//   32   54:fdiv            
		//   33   55:aload_0         
		//   34   56:getfield        #62  <Field float mStrokeWidth>
		//   35   59:fconst_2        
		//   36   60:fdiv            
		//   37   61:invokestatic    #123 <Method float Math.max(float, float)>
		//   38   64:fsub            
		//   39   65:fstore_3        
			rectf.set((float)rect.centerX() - f, (float)rect.centerY() - f, (float)rect.centerX() + f, (float)rect.centerY() + f);
		//   40   66:aload           6
		//   41   68:aload_2         
		//   42   69:invokevirtual   #126 <Method int Rect.centerX()>
		//   43   72:i2f             
		//   44   73:fload_3         
		//   45   74:fsub            
		//   46   75:aload_2         
		//   47   76:invokevirtual   #129 <Method int Rect.centerY()>
		//   48   79:i2f             
		//   49   80:fload_3         
		//   50   81:fsub            
		//   51   82:aload_2         
		//   52   83:invokevirtual   #126 <Method int Rect.centerX()>
		//   53   86:i2f             
		//   54   87:fload_3         
		//   55   88:fadd            
		//   56   89:aload_2         
		//   57   90:invokevirtual   #129 <Method int Rect.centerY()>
		//   58   93:i2f             
		//   59   94:fload_3         
		//   60   95:fadd            
		//   61   96:invokevirtual   #133 <Method void RectF.set(float, float, float, float)>
			f = mStartTrim;
		//   62   99:aload_0         
		//   63  100:getfield        #55  <Field float mStartTrim>
		//   64  103:fstore_3        
			f1 = mRotation;
		//   65  104:aload_0         
		//   66  105:getfield        #59  <Field float mRotation>
		//   67  108:fstore          4
			f = (f + f1) * 360F;
		//   68  110:fload_3         
		//   69  111:fload           4
		//   70  113:fadd            
		//   71  114:ldc1            #134 <Float 360F>
		//   72  116:fmul            
		//   73  117:fstore_3        
			f1 = (mEndTrim + f1) * 360F - f;
		//   74  118:aload_0         
		//   75  119:getfield        #57  <Field float mEndTrim>
		//   76  122:fload           4
		//   77  124:fadd            
		//   78  125:ldc1            #134 <Float 360F>
		//   79  127:fmul            
		//   80  128:fload_3         
		//   81  129:fsub            
		//   82  130:fstore          4
			mPaint.setColor(mCurrentColor);
		//   83  132:aload_0         
		//   84  133:getfield        #49  <Field Paint mPaint>
		//   85  136:aload_0         
		//   86  137:getfield        #136 <Field int mCurrentColor>
		//   87  140:invokevirtual   #97  <Method void Paint.setColor(int)>
			mPaint.setAlpha(mAlpha);
		//   88  143:aload_0         
		//   89  144:getfield        #49  <Field Paint mPaint>
		//   90  147:aload_0         
		//   91  148:getfield        #66  <Field int mAlpha>
		//   92  151:invokevirtual   #139 <Method void Paint.setAlpha(int)>
			float f2 = mStrokeWidth / 2.0F;
		//   93  154:aload_0         
		//   94  155:getfield        #62  <Field float mStrokeWidth>
		//   95  158:fconst_2        
		//   96  159:fdiv            
		//   97  160:fstore          5
			rectf.inset(f2, f2);
		//   98  162:aload           6
		//   99  164:fload           5
		//  100  166:fload           5
		//  101  168:invokevirtual   #143 <Method void RectF.inset(float, float)>
			canvas.drawCircle(rectf.centerX(), rectf.centerY(), rectf.width() / 2.0F, mCirclePaint);
		//  102  171:aload_1         
		//  103  172:aload           6
		//  104  174:invokevirtual   #146 <Method float RectF.centerX()>
		//  105  177:aload           6
		//  106  179:invokevirtual   #148 <Method float RectF.centerY()>
		//  107  182:aload           6
		//  108  184:invokevirtual   #150 <Method float RectF.width()>
		//  109  187:fconst_2        
		//  110  188:fdiv            
		//  111  189:aload_0         
		//  112  190:getfield        #53  <Field Paint mCirclePaint>
		//  113  193:invokevirtual   #156 <Method void Canvas.drawCircle(float, float, float, Paint)>
			f2 = -f2;
		//  114  196:fload           5
		//  115  198:fneg            
		//  116  199:fstore          5
			rectf.inset(f2, f2);
		//  117  201:aload           6
		//  118  203:fload           5
		//  119  205:fload           5
		//  120  207:invokevirtual   #143 <Method void RectF.inset(float, float)>
			canvas.drawArc(rectf, f, f1, false, mPaint);
		//  121  210:aload_1         
		//  122  211:aload           6
		//  123  213:fload_3         
		//  124  214:fload           4
		//  125  216:iconst_0        
		//  126  217:aload_0         
		//  127  218:getfield        #49  <Field Paint mPaint>
		//  128  221:invokevirtual   #160 <Method void Canvas.drawArc(RectF, float, float, boolean, Paint)>
			drawTriangle(canvas, f, f1, rectf);
		//  129  224:aload_0         
		//  130  225:aload_1         
		//  131  226:fload_3         
		//  132  227:fload           4
		//  133  229:aload           6
		//  134  231:invokevirtual   #164 <Method void drawTriangle(Canvas, float, float, RectF)>
		//  135  234:return          
		}

		void drawTriangle(Canvas canvas, float f, float f1, RectF rectf)
		{
			if(mShowArrow)
		//*   0    0:aload_0         
		//*   1    1:getfield        #166 <Field boolean mShowArrow>
		//*   2    4:ifeq            241
			{
				Path path = mArrow;
		//    3    7:aload_0         
		//    4    8:getfield        #168 <Field Path mArrow>
		//    5   11:astore          9
				if(path == null)
		//*   6   13:aload           9
		//*   7   15:ifnonnull       42
				{
					mArrow = new Path();
		//    8   18:aload_0         
		//    9   19:new             #170 <Class Path>
		//   10   22:dup             
		//   11   23:invokespecial   #171 <Method void Path()>
		//   12   26:putfield        #168 <Field Path mArrow>
					mArrow.setFillType(android.graphics.Path.FillType.EVEN_ODD);
		//   13   29:aload_0         
		//   14   30:getfield        #168 <Field Path mArrow>
		//   15   33:getstatic       #177 <Field android.graphics.Path$FillType android.graphics.Path$FillType.EVEN_ODD>
		//   16   36:invokevirtual   #181 <Method void Path.setFillType(android.graphics.Path$FillType)>
				} else
		//*  17   39:goto            47
				{
					path.reset();
		//   18   42:aload           9
		//   19   44:invokevirtual   #184 <Method void Path.reset()>
				}
				float f2 = Math.min(rectf.width(), rectf.height()) / 2.0F;
		//   20   47:aload           4
		//   21   49:invokevirtual   #150 <Method float RectF.width()>
		//   22   52:aload           4
		//   23   54:invokevirtual   #186 <Method float RectF.height()>
		//   24   57:invokestatic    #188 <Method float Math.min(float, float)>
		//   25   60:fconst_2        
		//   26   61:fdiv            
		//   27   62:fstore          5
				float f3 = ((float)mArrowWidth * mArrowScale) / 2.0F;
		//   28   64:aload_0         
		//   29   65:getfield        #119 <Field int mArrowWidth>
		//   30   68:i2f             
		//   31   69:aload_0         
		//   32   70:getfield        #64  <Field float mArrowScale>
		//   33   73:fmul            
		//   34   74:fconst_2        
		//   35   75:fdiv            
		//   36   76:fstore          6
				mArrow.moveTo(0.0F, 0.0F);
		//   37   78:aload_0         
		//   38   79:getfield        #168 <Field Path mArrow>
		//   39   82:fconst_0        
		//   40   83:fconst_0        
		//   41   84:invokevirtual   #191 <Method void Path.moveTo(float, float)>
				mArrow.lineTo((float)mArrowWidth * mArrowScale, 0.0F);
		//   42   87:aload_0         
		//   43   88:getfield        #168 <Field Path mArrow>
		//   44   91:aload_0         
		//   45   92:getfield        #119 <Field int mArrowWidth>
		//   46   95:i2f             
		//   47   96:aload_0         
		//   48   97:getfield        #64  <Field float mArrowScale>
		//   49  100:fmul            
		//   50  101:fconst_0        
		//   51  102:invokevirtual   #194 <Method void Path.lineTo(float, float)>
				path = mArrow;
		//   52  105:aload_0         
		//   53  106:getfield        #168 <Field Path mArrow>
		//   54  109:astore          9
				float f4 = mArrowWidth;
		//   55  111:aload_0         
		//   56  112:getfield        #119 <Field int mArrowWidth>
		//   57  115:i2f             
		//   58  116:fstore          7
				float f5 = mArrowScale;
		//   59  118:aload_0         
		//   60  119:getfield        #64  <Field float mArrowScale>
		//   61  122:fstore          8
				path.lineTo((f4 * f5) / 2.0F, (float)mArrowHeight * f5);
		//   62  124:aload           9
		//   63  126:fload           7
		//   64  128:fload           8
		//   65  130:fmul            
		//   66  131:fconst_2        
		//   67  132:fdiv            
		//   68  133:aload_0         
		//   69  134:getfield        #196 <Field int mArrowHeight>
		//   70  137:i2f             
		//   71  138:fload           8
		//   72  140:fmul            
		//   73  141:invokevirtual   #194 <Method void Path.lineTo(float, float)>
				mArrow.offset((f2 + rectf.centerX()) - f3, rectf.centerY() + mStrokeWidth / 2.0F);
		//   74  144:aload_0         
		//   75  145:getfield        #168 <Field Path mArrow>
		//   76  148:fload           5
		//   77  150:aload           4
		//   78  152:invokevirtual   #146 <Method float RectF.centerX()>
		//   79  155:fadd            
		//   80  156:fload           6
		//   81  158:fsub            
		//   82  159:aload           4
		//   83  161:invokevirtual   #148 <Method float RectF.centerY()>
		//   84  164:aload_0         
		//   85  165:getfield        #62  <Field float mStrokeWidth>
		//   86  168:fconst_2        
		//   87  169:fdiv            
		//   88  170:fadd            
		//   89  171:invokevirtual   #199 <Method void Path.offset(float, float)>
				mArrow.close();
		//   90  174:aload_0         
		//   91  175:getfield        #168 <Field Path mArrow>
		//   92  178:invokevirtual   #202 <Method void Path.close()>
				mArrowPaint.setColor(mCurrentColor);
		//   93  181:aload_0         
		//   94  182:getfield        #51  <Field Paint mArrowPaint>
		//   95  185:aload_0         
		//   96  186:getfield        #136 <Field int mCurrentColor>
		//   97  189:invokevirtual   #97  <Method void Paint.setColor(int)>
				mArrowPaint.setAlpha(mAlpha);
		//   98  192:aload_0         
		//   99  193:getfield        #51  <Field Paint mArrowPaint>
		//  100  196:aload_0         
		//  101  197:getfield        #66  <Field int mAlpha>
		//  102  200:invokevirtual   #139 <Method void Paint.setAlpha(int)>
				canvas.save();
		//  103  203:aload_1         
		//  104  204:invokevirtual   #205 <Method int Canvas.save()>
		//  105  207:pop             
				canvas.rotate(f + f1, rectf.centerX(), rectf.centerY());
		//  106  208:aload_1         
		//  107  209:fload_2         
		//  108  210:fload_3         
		//  109  211:fadd            
		//  110  212:aload           4
		//  111  214:invokevirtual   #146 <Method float RectF.centerX()>
		//  112  217:aload           4
		//  113  219:invokevirtual   #148 <Method float RectF.centerY()>
		//  114  222:invokevirtual   #209 <Method void Canvas.rotate(float, float, float)>
				canvas.drawPath(mArrow, mArrowPaint);
		//  115  225:aload_1         
		//  116  226:aload_0         
		//  117  227:getfield        #168 <Field Path mArrow>
		//  118  230:aload_0         
		//  119  231:getfield        #51  <Field Paint mArrowPaint>
		//  120  234:invokevirtual   #213 <Method void Canvas.drawPath(Path, Paint)>
				canvas.restore();
		//  121  237:aload_1         
		//  122  238:invokevirtual   #216 <Method void Canvas.restore()>
			}
		//  123  241:return          
		}

		int getAlpha()
		{
			return mAlpha;
		//    0    0:aload_0         
		//    1    1:getfield        #66  <Field int mAlpha>
		//    2    4:ireturn         
		}

		float getArrowHeight()
		{
			return (float)mArrowHeight;
		//    0    0:aload_0         
		//    1    1:getfield        #196 <Field int mArrowHeight>
		//    2    4:i2f             
		//    3    5:freturn         
		}

		float getArrowScale()
		{
			return mArrowScale;
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field float mArrowScale>
		//    2    4:freturn         
		}

		float getArrowWidth()
		{
			return (float)mArrowWidth;
		//    0    0:aload_0         
		//    1    1:getfield        #119 <Field int mArrowWidth>
		//    2    4:i2f             
		//    3    5:freturn         
		}

		int getBackgroundColor()
		{
			return mCirclePaint.getColor();
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field Paint mCirclePaint>
		//    2    4:invokevirtual   #224 <Method int Paint.getColor()>
		//    3    7:ireturn         
		}

		float getCenterRadius()
		{
			return mRingCenterRadius;
		//    0    0:aload_0         
		//    1    1:getfield        #102 <Field float mRingCenterRadius>
		//    2    4:freturn         
		}

		int[] getColors()
		{
			return mColors;
		//    0    0:aload_0         
		//    1    1:getfield        #229 <Field int[] mColors>
		//    2    4:areturn         
		}

		float getEndTrim()
		{
			return mEndTrim;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field float mEndTrim>
		//    2    4:freturn         
		}

		int getNextColor()
		{
			return mColors[getNextColorIndex()];
		//    0    0:aload_0         
		//    1    1:getfield        #229 <Field int[] mColors>
		//    2    4:aload_0         
		//    3    5:invokevirtual   #234 <Method int getNextColorIndex()>
		//    4    8:iaload          
		//    5    9:ireturn         
		}

		int getNextColorIndex()
		{
			return (mColorIndex + 1) % mColors.length;
		//    0    0:aload_0         
		//    1    1:getfield        #236 <Field int mColorIndex>
		//    2    4:iconst_1        
		//    3    5:iadd            
		//    4    6:aload_0         
		//    5    7:getfield        #229 <Field int[] mColors>
		//    6   10:arraylength     
		//    7   11:irem            
		//    8   12:ireturn         
		}

		float getRotation()
		{
			return mRotation;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field float mRotation>
		//    2    4:freturn         
		}

		boolean getShowArrow()
		{
			return mShowArrow;
		//    0    0:aload_0         
		//    1    1:getfield        #166 <Field boolean mShowArrow>
		//    2    4:ireturn         
		}

		float getStartTrim()
		{
			return mStartTrim;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field float mStartTrim>
		//    2    4:freturn         
		}

		int getStartingColor()
		{
			return mColors[mColorIndex];
		//    0    0:aload_0         
		//    1    1:getfield        #229 <Field int[] mColors>
		//    2    4:aload_0         
		//    3    5:getfield        #236 <Field int mColorIndex>
		//    4    8:iaload          
		//    5    9:ireturn         
		}

		float getStartingEndTrim()
		{
			return mStartingEndTrim;
		//    0    0:aload_0         
		//    1    1:getfield        #244 <Field float mStartingEndTrim>
		//    2    4:freturn         
		}

		float getStartingRotation()
		{
			return mStartingRotation;
		//    0    0:aload_0         
		//    1    1:getfield        #247 <Field float mStartingRotation>
		//    2    4:freturn         
		}

		float getStartingStartTrim()
		{
			return mStartingStartTrim;
		//    0    0:aload_0         
		//    1    1:getfield        #250 <Field float mStartingStartTrim>
		//    2    4:freturn         
		}

		android.graphics.Paint.Cap getStrokeCap()
		{
			return mPaint.getStrokeCap();
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field Paint mPaint>
		//    2    4:invokevirtual   #254 <Method android.graphics.Paint$Cap Paint.getStrokeCap()>
		//    3    7:areturn         
		}

		float getStrokeWidth()
		{
			return mStrokeWidth;
		//    0    0:aload_0         
		//    1    1:getfield        #62  <Field float mStrokeWidth>
		//    2    4:freturn         
		}

		void goToNextColor()
		{
			setColorIndex(getNextColorIndex());
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #234 <Method int getNextColorIndex()>
		//    3    5:invokevirtual   #259 <Method void setColorIndex(int)>
		//    4    8:return          
		}

		void resetOriginals()
		{
			mStartingStartTrim = 0.0F;
		//    0    0:aload_0         
		//    1    1:fconst_0        
		//    2    2:putfield        #250 <Field float mStartingStartTrim>
			mStartingEndTrim = 0.0F;
		//    3    5:aload_0         
		//    4    6:fconst_0        
		//    5    7:putfield        #244 <Field float mStartingEndTrim>
			mStartingRotation = 0.0F;
		//    6   10:aload_0         
		//    7   11:fconst_0        
		//    8   12:putfield        #247 <Field float mStartingRotation>
			setStartTrim(0.0F);
		//    9   15:aload_0         
		//   10   16:fconst_0        
		//   11   17:invokevirtual   #264 <Method void setStartTrim(float)>
			setEndTrim(0.0F);
		//   12   20:aload_0         
		//   13   21:fconst_0        
		//   14   22:invokevirtual   #267 <Method void setEndTrim(float)>
			setRotation(0.0F);
		//   15   25:aload_0         
		//   16   26:fconst_0        
		//   17   27:invokevirtual   #270 <Method void setRotation(float)>
		//   18   30:return          
		}

		void setAlpha(int i)
		{
			mAlpha = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #66  <Field int mAlpha>
		//    3    5:return          
		}

		void setArrowDimensions(float f, float f1)
		{
			mArrowWidth = (int)f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:f2i             
		//    3    3:putfield        #119 <Field int mArrowWidth>
			mArrowHeight = (int)f1;
		//    4    6:aload_0         
		//    5    7:fload_2         
		//    6    8:f2i             
		//    7    9:putfield        #196 <Field int mArrowHeight>
		//    8   12:return          
		}

		void setArrowScale(float f)
		{
			if(f != mArrowScale)
		//*   0    0:fload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #64  <Field float mArrowScale>
		//*   3    5:fcmpl           
		//*   4    6:ifeq            14
				mArrowScale = f;
		//    5    9:aload_0         
		//    6   10:fload_1         
		//    7   11:putfield        #64  <Field float mArrowScale>
		//    8   14:return          
		}

		void setBackgroundColor(int i)
		{
			mCirclePaint.setColor(i);
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field Paint mCirclePaint>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #97  <Method void Paint.setColor(int)>
		//    4    8:return          
		}

		void setCenterRadius(float f)
		{
			mRingCenterRadius = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #102 <Field float mRingCenterRadius>
		//    3    5:return          
		}

		void setColor(int i)
		{
			mCurrentColor = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #136 <Field int mCurrentColor>
		//    3    5:return          
		}

		void setColorFilter(ColorFilter colorfilter)
		{
			mPaint.setColorFilter(colorfilter);
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field Paint mPaint>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #279 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
		//    4    8:pop             
		//    5    9:return          
		}

		void setColorIndex(int i)
		{
			mColorIndex = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #236 <Field int mColorIndex>
			mCurrentColor = mColors[mColorIndex];
		//    3    5:aload_0         
		//    4    6:aload_0         
		//    5    7:getfield        #229 <Field int[] mColors>
		//    6   10:aload_0         
		//    7   11:getfield        #236 <Field int mColorIndex>
		//    8   14:iaload          
		//    9   15:putfield        #136 <Field int mCurrentColor>
		//   10   18:return          
		}

		void setColors(int ai[])
		{
			mColors = ai;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #229 <Field int[] mColors>
			setColorIndex(0);
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:invokevirtual   #259 <Method void setColorIndex(int)>
		//    6   10:return          
		}

		void setEndTrim(float f)
		{
			mEndTrim = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #57  <Field float mEndTrim>
		//    3    5:return          
		}

		void setRotation(float f)
		{
			mRotation = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #59  <Field float mRotation>
		//    3    5:return          
		}

		void setShowArrow(boolean flag)
		{
			if(mShowArrow != flag)
		//*   0    0:aload_0         
		//*   1    1:getfield        #166 <Field boolean mShowArrow>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          13
				mShowArrow = flag;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #166 <Field boolean mShowArrow>
		//    7   13:return          
		}

		void setStartTrim(float f)
		{
			mStartTrim = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #55  <Field float mStartTrim>
		//    3    5:return          
		}

		void setStrokeCap(android.graphics.Paint.Cap cap)
		{
			mPaint.setStrokeCap(cap);
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field Paint mPaint>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #76  <Method void Paint.setStrokeCap(android.graphics.Paint$Cap)>
		//    4    8:return          
		}

		void setStrokeWidth(float f)
		{
			mStrokeWidth = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #62  <Field float mStrokeWidth>
			mPaint.setStrokeWidth(f);
		//    3    5:aload_0         
		//    4    6:getfield        #49  <Field Paint mPaint>
		//    5    9:fload_1         
		//    6   10:invokevirtual   #287 <Method void Paint.setStrokeWidth(float)>
		//    7   13:return          
		}

		void storeOriginals()
		{
			mStartingStartTrim = mStartTrim;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #55  <Field float mStartTrim>
		//    3    5:putfield        #250 <Field float mStartingStartTrim>
			mStartingEndTrim = mEndTrim;
		//    4    8:aload_0         
		//    5    9:aload_0         
		//    6   10:getfield        #57  <Field float mEndTrim>
		//    7   13:putfield        #244 <Field float mStartingEndTrim>
			mStartingRotation = mRotation;
		//    8   16:aload_0         
		//    9   17:aload_0         
		//   10   18:getfield        #59  <Field float mRotation>
		//   11   21:putfield        #247 <Field float mStartingRotation>
		//   12   24:return          
		}

		int mAlpha;
		Path mArrow;
		int mArrowHeight;
		final Paint mArrowPaint = new Paint();
		float mArrowScale;
		int mArrowWidth;
		final Paint mCirclePaint = new Paint();
		int mColorIndex;
		int mColors[];
		int mCurrentColor;
		float mEndTrim;
		final Paint mPaint = new Paint();
		float mRingCenterRadius;
		float mRotation;
		boolean mShowArrow;
		float mStartTrim;
		float mStartingEndTrim;
		float mStartingRotation;
		float mStartingStartTrim;
		float mStrokeWidth;
		final RectF mTempBounds = new RectF();

		Ring()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #39  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #41  <Class RectF>
		//    4    8:dup             
		//    5    9:invokespecial   #42  <Method void RectF()>
		//    6   12:putfield        #44  <Field RectF mTempBounds>
		//    7   15:aload_0         
		//    8   16:new             #46  <Class Paint>
		//    9   19:dup             
		//   10   20:invokespecial   #47  <Method void Paint()>
		//   11   23:putfield        #49  <Field Paint mPaint>
		//   12   26:aload_0         
		//   13   27:new             #46  <Class Paint>
		//   14   30:dup             
		//   15   31:invokespecial   #47  <Method void Paint()>
		//   16   34:putfield        #51  <Field Paint mArrowPaint>
		//   17   37:aload_0         
		//   18   38:new             #46  <Class Paint>
		//   19   41:dup             
		//   20   42:invokespecial   #47  <Method void Paint()>
		//   21   45:putfield        #53  <Field Paint mCirclePaint>
			mStartTrim = 0.0F;
		//   22   48:aload_0         
		//   23   49:fconst_0        
		//   24   50:putfield        #55  <Field float mStartTrim>
			mEndTrim = 0.0F;
		//   25   53:aload_0         
		//   26   54:fconst_0        
		//   27   55:putfield        #57  <Field float mEndTrim>
			mRotation = 0.0F;
		//   28   58:aload_0         
		//   29   59:fconst_0        
		//   30   60:putfield        #59  <Field float mRotation>
			mStrokeWidth = 5F;
		//   31   63:aload_0         
		//   32   64:ldc1            #60  <Float 5F>
		//   33   66:putfield        #62  <Field float mStrokeWidth>
			mArrowScale = 1.0F;
		//   34   69:aload_0         
		//   35   70:fconst_1        
		//   36   71:putfield        #64  <Field float mArrowScale>
			mAlpha = 255;
		//   37   74:aload_0         
		//   38   75:sipush          255
		//   39   78:putfield        #66  <Field int mAlpha>
			mPaint.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
		//   40   81:aload_0         
		//   41   82:getfield        #49  <Field Paint mPaint>
		//   42   85:getstatic       #72  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.SQUARE>
		//   43   88:invokevirtual   #76  <Method void Paint.setStrokeCap(android.graphics.Paint$Cap)>
			mPaint.setAntiAlias(true);
		//   44   91:aload_0         
		//   45   92:getfield        #49  <Field Paint mPaint>
		//   46   95:iconst_1        
		//   47   96:invokevirtual   #80  <Method void Paint.setAntiAlias(boolean)>
			mPaint.setStyle(android.graphics.Paint.Style.STROKE);
		//   48   99:aload_0         
		//   49  100:getfield        #49  <Field Paint mPaint>
		//   50  103:getstatic       #86  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
		//   51  106:invokevirtual   #90  <Method void Paint.setStyle(android.graphics.Paint$Style)>
			mArrowPaint.setStyle(android.graphics.Paint.Style.FILL);
		//   52  109:aload_0         
		//   53  110:getfield        #51  <Field Paint mArrowPaint>
		//   54  113:getstatic       #93  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
		//   55  116:invokevirtual   #90  <Method void Paint.setStyle(android.graphics.Paint$Style)>
			mArrowPaint.setAntiAlias(true);
		//   56  119:aload_0         
		//   57  120:getfield        #51  <Field Paint mArrowPaint>
		//   58  123:iconst_1        
		//   59  124:invokevirtual   #80  <Method void Paint.setAntiAlias(boolean)>
			mCirclePaint.setColor(0);
		//   60  127:aload_0         
		//   61  128:getfield        #53  <Field Paint mCirclePaint>
		//   62  131:iconst_0        
		//   63  132:invokevirtual   #97  <Method void Paint.setColor(int)>
		//   64  135:return          
		}
	}


	public CircularProgressDrawable(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method void Drawable()>
		mResources = ((Context)Preconditions.checkNotNull(((Object) (context)))).getResources();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #94  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #96  <Class Context>
	//    6   12:invokevirtual   #100 <Method Resources Context.getResources()>
	//    7   15:putfield        #102 <Field Resources mResources>
	//    8   18:aload_0         
	//    9   19:new             #15  <Class CircularProgressDrawable$Ring>
	//   10   22:dup             
	//   11   23:invokespecial   #103 <Method void CircularProgressDrawable$Ring()>
	//   12   26:putfield        #105 <Field CircularProgressDrawable$Ring mRing>
		mRing.setColors(COLORS);
	//   13   29:aload_0         
	//   14   30:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//   15   33:getstatic       #84  <Field int[] COLORS>
	//   16   36:invokevirtual   #109 <Method void CircularProgressDrawable$Ring.setColors(int[])>
		setStrokeWidth(2.5F);
	//   17   39:aload_0         
	//   18   40:ldc1            #55  <Float 2.5F>
	//   19   42:invokevirtual   #113 <Method void setStrokeWidth(float)>
		setupAnimators();
	//   20   45:aload_0         
	//   21   46:invokespecial   #116 <Method void setupAnimators()>
	//   22   49:return          
	}

	private void applyFinishTranslation(float f, Ring ring)
	{
		updateRingColor(f, ring);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #122 <Method void updateRingColor(float, CircularProgressDrawable$Ring)>
		float f1 = (float)(Math.floor(ring.getStartingRotation() / 0.8F) + 1.0D);
	//    4    6:aload_2         
	//    5    7:invokevirtual   #126 <Method float CircularProgressDrawable$Ring.getStartingRotation()>
	//    6   10:ldc1            #47  <Float 0.8F>
	//    7   12:fdiv            
	//    8   13:f2d             
	//    9   14:invokestatic    #132 <Method double Math.floor(double)>
	//   10   17:dconst_1        
	//   11   18:dadd            
	//   12   19:d2f             
	//   13   20:fstore_3        
		ring.setStartTrim(ring.getStartingStartTrim() + (ring.getStartingEndTrim() - 0.01F - ring.getStartingStartTrim()) * f);
	//   14   21:aload_2         
	//   15   22:aload_2         
	//   16   23:invokevirtual   #135 <Method float CircularProgressDrawable$Ring.getStartingStartTrim()>
	//   17   26:aload_2         
	//   18   27:invokevirtual   #138 <Method float CircularProgressDrawable$Ring.getStartingEndTrim()>
	//   19   30:ldc1            #49  <Float 0.01F>
	//   20   32:fsub            
	//   21   33:aload_2         
	//   22   34:invokevirtual   #135 <Method float CircularProgressDrawable$Ring.getStartingStartTrim()>
	//   23   37:fsub            
	//   24   38:fload_1         
	//   25   39:fmul            
	//   26   40:fadd            
	//   27   41:invokevirtual   #141 <Method void CircularProgressDrawable$Ring.setStartTrim(float)>
		ring.setEndTrim(ring.getStartingEndTrim());
	//   28   44:aload_2         
	//   29   45:aload_2         
	//   30   46:invokevirtual   #138 <Method float CircularProgressDrawable$Ring.getStartingEndTrim()>
	//   31   49:invokevirtual   #144 <Method void CircularProgressDrawable$Ring.setEndTrim(float)>
		ring.setRotation(ring.getStartingRotation() + (f1 - ring.getStartingRotation()) * f);
	//   32   52:aload_2         
	//   33   53:aload_2         
	//   34   54:invokevirtual   #126 <Method float CircularProgressDrawable$Ring.getStartingRotation()>
	//   35   57:fload_3         
	//   36   58:aload_2         
	//   37   59:invokevirtual   #126 <Method float CircularProgressDrawable$Ring.getStartingRotation()>
	//   38   62:fsub            
	//   39   63:fload_1         
	//   40   64:fmul            
	//   41   65:fadd            
	//   42   66:invokevirtual   #147 <Method void CircularProgressDrawable$Ring.setRotation(float)>
	//   43   69:return          
	}

	private int evaluateColorChange(float f, int i, int j)
	{
		int k = i >> 24 & 0xff;
	//    0    0:iload_2         
	//    1    1:bipush          24
	//    2    3:ishr            
	//    3    4:sipush          255
	//    4    7:iand            
	//    5    8:istore          4
		int l = i >> 16 & 0xff;
	//    6   10:iload_2         
	//    7   11:bipush          16
	//    8   13:ishr            
	//    9   14:sipush          255
	//   10   17:iand            
	//   11   18:istore          5
		int i1 = i >> 8 & 0xff;
	//   12   20:iload_2         
	//   13   21:bipush          8
	//   14   23:ishr            
	//   15   24:sipush          255
	//   16   27:iand            
	//   17   28:istore          6
		i &= 0xff;
	//   18   30:iload_2         
	//   19   31:sipush          255
	//   20   34:iand            
	//   21   35:istore_2        
		return k + (int)((float)((j >> 24 & 0xff) - k) * f) << 24 | l + (int)((float)((j >> 16 & 0xff) - l) * f) << 16 | i1 + (int)((float)((j >> 8 & 0xff) - i1) * f) << 8 | i + (int)(f * (float)((j & 0xff) - i));
	//   22   36:iload           4
	//   23   38:iload_3         
	//   24   39:bipush          24
	//   25   41:ishr            
	//   26   42:sipush          255
	//   27   45:iand            
	//   28   46:iload           4
	//   29   48:isub            
	//   30   49:i2f             
	//   31   50:fload_1         
	//   32   51:fmul            
	//   33   52:f2i             
	//   34   53:iadd            
	//   35   54:bipush          24
	//   36   56:ishl            
	//   37   57:iload           5
	//   38   59:iload_3         
	//   39   60:bipush          16
	//   40   62:ishr            
	//   41   63:sipush          255
	//   42   66:iand            
	//   43   67:iload           5
	//   44   69:isub            
	//   45   70:i2f             
	//   46   71:fload_1         
	//   47   72:fmul            
	//   48   73:f2i             
	//   49   74:iadd            
	//   50   75:bipush          16
	//   51   77:ishl            
	//   52   78:ior             
	//   53   79:iload           6
	//   54   81:iload_3         
	//   55   82:bipush          8
	//   56   84:ishr            
	//   57   85:sipush          255
	//   58   88:iand            
	//   59   89:iload           6
	//   60   91:isub            
	//   61   92:i2f             
	//   62   93:fload_1         
	//   63   94:fmul            
	//   64   95:f2i             
	//   65   96:iadd            
	//   66   97:bipush          8
	//   67   99:ishl            
	//   68  100:ior             
	//   69  101:iload_2         
	//   70  102:fload_1         
	//   71  103:iload_3         
	//   72  104:sipush          255
	//   73  107:iand            
	//   74  108:iload_2         
	//   75  109:isub            
	//   76  110:i2f             
	//   77  111:fmul            
	//   78  112:f2i             
	//   79  113:iadd            
	//   80  114:ior             
	//   81  115:ireturn         
	}

	private float getRotation()
	{
		return mRotation;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field float mRotation>
	//    2    4:freturn         
	}

	private void setRotation(float f)
	{
		mRotation = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #152 <Field float mRotation>
	//    3    5:return          
	}

	private void setSizeParameters(float f, float f1, float f2, float f3)
	{
		Ring ring = mRing;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:astore          6
		float f4 = mResources.getDisplayMetrics().density;
	//    3    6:aload_0         
	//    4    7:getfield        #102 <Field Resources mResources>
	//    5   10:invokevirtual   #160 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    6   13:getfield        #165 <Field float DisplayMetrics.density>
	//    7   16:fstore          5
		ring.setStrokeWidth(f1 * f4);
	//    8   18:aload           6
	//    9   20:fload_2         
	//   10   21:fload           5
	//   11   23:fmul            
	//   12   24:invokevirtual   #166 <Method void CircularProgressDrawable$Ring.setStrokeWidth(float)>
		ring.setCenterRadius(f * f4);
	//   13   27:aload           6
	//   14   29:fload_1         
	//   15   30:fload           5
	//   16   32:fmul            
	//   17   33:invokevirtual   #169 <Method void CircularProgressDrawable$Ring.setCenterRadius(float)>
		ring.setColorIndex(0);
	//   18   36:aload           6
	//   19   38:iconst_0        
	//   20   39:invokevirtual   #173 <Method void CircularProgressDrawable$Ring.setColorIndex(int)>
		ring.setArrowDimensions(f2 * f4, f3 * f4);
	//   21   42:aload           6
	//   22   44:fload_3         
	//   23   45:fload           5
	//   24   47:fmul            
	//   25   48:fload           4
	//   26   50:fload           5
	//   27   52:fmul            
	//   28   53:invokevirtual   #177 <Method void CircularProgressDrawable$Ring.setArrowDimensions(float, float)>
	//   29   56:return          
	}

	private void setupAnimators()
	{
		final Ring ring = mRing;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:astore_1        
		ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
			0.0F, 1.0F
		});
	//    3    5:iconst_2        
	//    4    6:newarray        float[]
	//    5    8:dup             
	//    6    9:iconst_0        
	//    7   10:fconst_0        
	//    8   11:fastore         
	//    9   12:dup             
	//   10   13:iconst_1        
	//   11   14:fconst_1        
	//   12   15:fastore         
	//   13   16:invokestatic    #183 <Method ValueAnimator ValueAnimator.ofFloat(float[])>
	//   14   19:astore_2        
		valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

			public void onAnimationUpdate(ValueAnimator valueanimator1)
			{
				float f = ((Float)valueanimator1.getAnimatedValue()).floatValue();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #32  <Method Object ValueAnimator.getAnimatedValue()>
			//    2    4:checkcast       #34  <Class Float>
			//    3    7:invokevirtual   #38  <Method float Float.floatValue()>
			//    4   10:fstore_2        
				updateRingColor(f, ring);
			//    5   11:aload_0         
			//    6   12:getfield        #19  <Field CircularProgressDrawable this$0>
			//    7   15:fload_2         
			//    8   16:aload_0         
			//    9   17:getfield        #21  <Field CircularProgressDrawable$Ring val$ring>
			//   10   20:invokevirtual   #42  <Method void CircularProgressDrawable.updateRingColor(float, CircularProgressDrawable$Ring)>
				applyTransformation(f, ring, false);
			//   11   23:aload_0         
			//   12   24:getfield        #19  <Field CircularProgressDrawable this$0>
			//   13   27:fload_2         
			//   14   28:aload_0         
			//   15   29:getfield        #21  <Field CircularProgressDrawable$Ring val$ring>
			//   16   32:iconst_0        
			//   17   33:invokevirtual   #46  <Method void CircularProgressDrawable.applyTransformation(float, CircularProgressDrawable$Ring, boolean)>
				invalidateSelf();
			//   18   36:aload_0         
			//   19   37:getfield        #19  <Field CircularProgressDrawable this$0>
			//   20   40:invokevirtual   #49  <Method void CircularProgressDrawable.invalidateSelf()>
			//   21   43:return          
			}

			final CircularProgressDrawable this$0;
			final Ring val$ring;

			
			{
				this$0 = CircularProgressDrawable.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CircularProgressDrawable this$0>
				ring = ring1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CircularProgressDrawable$Ring val$ring>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   15   20:aload_2         
	//   16   21:new             #8   <Class CircularProgressDrawable$1>
	//   17   24:dup             
	//   18   25:aload_0         
	//   19   26:aload_1         
	//   20   27:invokespecial   #186 <Method void CircularProgressDrawable$1(CircularProgressDrawable, CircularProgressDrawable$Ring)>
	//   21   30:invokevirtual   #190 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		valueanimator.setRepeatCount(-1);
	//   22   33:aload_2         
	//   23   34:iconst_m1       
	//   24   35:invokevirtual   #193 <Method void ValueAnimator.setRepeatCount(int)>
		valueanimator.setRepeatMode(1);
	//   25   38:aload_2         
	//   26   39:iconst_1        
	//   27   40:invokevirtual   #196 <Method void ValueAnimator.setRepeatMode(int)>
		valueanimator.setInterpolator(((android.animation.TimeInterpolator) (LINEAR_INTERPOLATOR)));
	//   28   43:aload_2         
	//   29   44:getstatic       #76  <Field Interpolator LINEAR_INTERPOLATOR>
	//   30   47:invokevirtual   #200 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
		valueanimator.addListener(new android.animation.Animator.AnimatorListener() {

			public void onAnimationCancel(Animator animator)
			{
			//    0    0:return          
			}

			public void onAnimationEnd(Animator animator)
			{
			//    0    0:return          
			}

			public void onAnimationRepeat(Animator animator)
			{
				applyTransformation(1.0F, ring, true);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field CircularProgressDrawable this$0>
			//    2    4:fconst_1        
			//    3    5:aload_0         
			//    4    6:getfield        #21  <Field CircularProgressDrawable$Ring val$ring>
			//    5    9:iconst_1        
			//    6   10:invokevirtual   #32  <Method void CircularProgressDrawable.applyTransformation(float, CircularProgressDrawable$Ring, boolean)>
				ring.storeOriginals();
			//    7   13:aload_0         
			//    8   14:getfield        #21  <Field CircularProgressDrawable$Ring val$ring>
			//    9   17:invokevirtual   #37  <Method void CircularProgressDrawable$Ring.storeOriginals()>
				ring.goToNextColor();
			//   10   20:aload_0         
			//   11   21:getfield        #21  <Field CircularProgressDrawable$Ring val$ring>
			//   12   24:invokevirtual   #40  <Method void CircularProgressDrawable$Ring.goToNextColor()>
				if(mFinishing)
			//*  13   27:aload_0         
			//*  14   28:getfield        #19  <Field CircularProgressDrawable this$0>
			//*  15   31:getfield        #44  <Field boolean CircularProgressDrawable.mFinishing>
			//*  16   34:ifeq            70
				{
					mFinishing = false;
			//   17   37:aload_0         
			//   18   38:getfield        #19  <Field CircularProgressDrawable this$0>
			//   19   41:iconst_0        
			//   20   42:putfield        #44  <Field boolean CircularProgressDrawable.mFinishing>
					animator.cancel();
			//   21   45:aload_1         
			//   22   46:invokevirtual   #49  <Method void Animator.cancel()>
					animator.setDuration(1332L);
			//   23   49:aload_1         
			//   24   50:ldc2w           #50  <Long 1332L>
			//   25   53:invokevirtual   #55  <Method Animator Animator.setDuration(long)>
			//   26   56:pop             
					animator.start();
			//   27   57:aload_1         
			//   28   58:invokevirtual   #58  <Method void Animator.start()>
					ring.setShowArrow(false);
			//   29   61:aload_0         
			//   30   62:getfield        #21  <Field CircularProgressDrawable$Ring val$ring>
			//   31   65:iconst_0        
			//   32   66:invokevirtual   #62  <Method void CircularProgressDrawable$Ring.setShowArrow(boolean)>
					return;
			//   33   69:return          
				} else
				{
					animator = ((Animator) (CircularProgressDrawable.this));
			//   34   70:aload_0         
			//   35   71:getfield        #19  <Field CircularProgressDrawable this$0>
			//   36   74:astore_1        
					animator.mRotationCount = ((CircularProgressDrawable) (animator)).mRotationCount + 1.0F;
			//   37   75:aload_1         
			//   38   76:aload_1         
			//   39   77:getfield        #66  <Field float CircularProgressDrawable.mRotationCount>
			//   40   80:fconst_1        
			//   41   81:fadd            
			//   42   82:putfield        #66  <Field float CircularProgressDrawable.mRotationCount>
					return;
			//   43   85:return          
				}
			}

			public void onAnimationStart(Animator animator)
			{
				mRotationCount = 0.0F;
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field CircularProgressDrawable this$0>
			//    2    4:fconst_0        
			//    3    5:putfield        #66  <Field float CircularProgressDrawable.mRotationCount>
			//    4    8:return          
			}

			final CircularProgressDrawable this$0;
			final Ring val$ring;

			
			{
				this$0 = CircularProgressDrawable.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CircularProgressDrawable this$0>
				ring = ring1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CircularProgressDrawable$Ring val$ring>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   31   50:aload_2         
	//   32   51:new             #10  <Class CircularProgressDrawable$2>
	//   33   54:dup             
	//   34   55:aload_0         
	//   35   56:aload_1         
	//   36   57:invokespecial   #201 <Method void CircularProgressDrawable$2(CircularProgressDrawable, CircularProgressDrawable$Ring)>
	//   37   60:invokevirtual   #205 <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
		mAnimator = ((Animator) (valueanimator));
	//   38   63:aload_0         
	//   39   64:aload_2         
	//   40   65:putfield        #207 <Field Animator mAnimator>
	//   41   68:return          
	}

	void applyTransformation(float f, Ring ring, boolean flag)
	{
		if(mFinishing)
	//*   0    0:aload_0         
	//*   1    1:getfield        #211 <Field boolean mFinishing>
	//*   2    4:ifeq            14
		{
			applyFinishTranslation(f, ring);
	//    3    7:aload_0         
	//    4    8:fload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #213 <Method void applyFinishTranslation(float, CircularProgressDrawable$Ring)>
			return;
	//    7   13:return          
		}
		if(f != 1.0F || flag)
	//*   8   14:fload_1         
	//*   9   15:fconst_1        
	//*  10   16:fcmpl           
	//*  11   17:ifne            24
	//*  12   20:iload_3         
	//*  13   21:ifeq            154
		{
			float f3 = ring.getStartingRotation();
	//   14   24:aload_2         
	//   15   25:invokevirtual   #126 <Method float CircularProgressDrawable$Ring.getStartingRotation()>
	//   16   28:fstore          6
			float f1;
			float f2;
			if(f < 0.5F)
	//*  17   30:fload_1         
	//*  18   31:ldc1            #53  <Float 0.5F>
	//*  19   33:fcmpg           
	//*  20   34:ifge            73
			{
				f2 = f / 0.5F;
	//   21   37:fload_1         
	//   22   38:ldc1            #53  <Float 0.5F>
	//   23   40:fdiv            
	//   24   41:fstore          5
				f1 = ring.getStartingStartTrim();
	//   25   43:aload_2         
	//   26   44:invokevirtual   #135 <Method float CircularProgressDrawable$Ring.getStartingStartTrim()>
	//   27   47:fstore          4
				f2 = MATERIAL_INTERPOLATOR.getInterpolation(f2) * 0.79F + 0.01F + f1;
	//   28   49:getstatic       #81  <Field Interpolator MATERIAL_INTERPOLATOR>
	//   29   52:fload           5
	//   30   54:invokeinterface #219 <Method float Interpolator.getInterpolation(float)>
	//   31   59:ldc1            #220 <Float 0.79F>
	//   32   61:fmul            
	//   33   62:ldc1            #49  <Float 0.01F>
	//   34   64:fadd            
	//   35   65:fload           4
	//   36   67:fadd            
	//   37   68:fstore          5
			} else
	//*  38   70:goto            114
			{
				f1 = (f - 0.5F) / 0.5F;
	//   39   73:fload_1         
	//   40   74:ldc1            #53  <Float 0.5F>
	//   41   76:fsub            
	//   42   77:ldc1            #53  <Float 0.5F>
	//   43   79:fdiv            
	//   44   80:fstore          4
				f2 = ring.getStartingStartTrim() + 0.79F;
	//   45   82:aload_2         
	//   46   83:invokevirtual   #135 <Method float CircularProgressDrawable$Ring.getStartingStartTrim()>
	//   47   86:ldc1            #220 <Float 0.79F>
	//   48   88:fadd            
	//   49   89:fstore          5
				f1 = f2 - ((1.0F - MATERIAL_INTERPOLATOR.getInterpolation(f1)) * 0.79F + 0.01F);
	//   50   91:fload           5
	//   51   93:fconst_1        
	//   52   94:getstatic       #81  <Field Interpolator MATERIAL_INTERPOLATOR>
	//   53   97:fload           4
	//   54   99:invokeinterface #219 <Method float Interpolator.getInterpolation(float)>
	//   55  104:fsub            
	//   56  105:ldc1            #220 <Float 0.79F>
	//   57  107:fmul            
	//   58  108:ldc1            #49  <Float 0.01F>
	//   59  110:fadd            
	//   60  111:fsub            
	//   61  112:fstore          4
			}
			float f4 = mRotationCount;
	//   62  114:aload_0         
	//   63  115:getfield        #222 <Field float mRotationCount>
	//   64  118:fstore          7
			ring.setStartTrim(f1);
	//   65  120:aload_2         
	//   66  121:fload           4
	//   67  123:invokevirtual   #141 <Method void CircularProgressDrawable$Ring.setStartTrim(float)>
			ring.setEndTrim(f2);
	//   68  126:aload_2         
	//   69  127:fload           5
	//   70  129:invokevirtual   #144 <Method void CircularProgressDrawable$Ring.setEndTrim(float)>
			ring.setRotation(f3 + 0.21F * f);
	//   71  132:aload_2         
	//   72  133:fload           6
	//   73  135:ldc1            #51  <Float 0.21F>
	//   74  137:fload_1         
	//   75  138:fmul            
	//   76  139:fadd            
	//   77  140:invokevirtual   #147 <Method void CircularProgressDrawable$Ring.setRotation(float)>
			setRotation((f + f4) * 216F);
	//   78  143:aload_0         
	//   79  144:fload_1         
	//   80  145:fload           7
	//   81  147:fadd            
	//   82  148:ldc1            #40  <Float 216F>
	//   83  150:fmul            
	//   84  151:invokespecial   #223 <Method void setRotation(float)>
		}
	//   85  154:return          
	}

	public void draw(Canvas canvas)
	{
		Rect rect = getBounds();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #229 <Method Rect getBounds()>
	//    2    4:astore_2        
		canvas.save();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #235 <Method int Canvas.save()>
	//    5    9:pop             
		canvas.rotate(mRotation, rect.exactCenterX(), rect.exactCenterY());
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:getfield        #152 <Field float mRotation>
	//    9   15:aload_2         
	//   10   16:invokevirtual   #240 <Method float Rect.exactCenterX()>
	//   11   19:aload_2         
	//   12   20:invokevirtual   #243 <Method float Rect.exactCenterY()>
	//   13   23:invokevirtual   #247 <Method void Canvas.rotate(float, float, float)>
		mRing.draw(canvas, rect);
	//   14   26:aload_0         
	//   15   27:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//   16   30:aload_1         
	//   17   31:aload_2         
	//   18   32:invokevirtual   #250 <Method void CircularProgressDrawable$Ring.draw(Canvas, Rect)>
		canvas.restore();
	//   19   35:aload_1         
	//   20   36:invokevirtual   #253 <Method void Canvas.restore()>
	//   21   39:return          
	}

	public int getAlpha()
	{
		return mRing.getAlpha();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:invokevirtual   #256 <Method int CircularProgressDrawable$Ring.getAlpha()>
	//    3    7:ireturn         
	}

	public boolean getArrowEnabled()
	{
		return mRing.getShowArrow();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:invokevirtual   #261 <Method boolean CircularProgressDrawable$Ring.getShowArrow()>
	//    3    7:ireturn         
	}

	public float getArrowHeight()
	{
		return mRing.getArrowHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:invokevirtual   #264 <Method float CircularProgressDrawable$Ring.getArrowHeight()>
	//    3    7:freturn         
	}

	public float getArrowScale()
	{
		return mRing.getArrowScale();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:invokevirtual   #267 <Method float CircularProgressDrawable$Ring.getArrowScale()>
	//    3    7:freturn         
	}

	public float getArrowWidth()
	{
		return mRing.getArrowWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:invokevirtual   #270 <Method float CircularProgressDrawable$Ring.getArrowWidth()>
	//    3    7:freturn         
	}

	public int getBackgroundColor()
	{
		return mRing.getBackgroundColor();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:invokevirtual   #273 <Method int CircularProgressDrawable$Ring.getBackgroundColor()>
	//    3    7:ireturn         
	}

	public float getCenterRadius()
	{
		return mRing.getCenterRadius();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:invokevirtual   #276 <Method float CircularProgressDrawable$Ring.getCenterRadius()>
	//    3    7:freturn         
	}

	public int[] getColorSchemeColors()
	{
		return mRing.getColors();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:invokevirtual   #281 <Method int[] CircularProgressDrawable$Ring.getColors()>
	//    3    7:areturn         
	}

	public float getEndTrim()
	{
		return mRing.getEndTrim();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:invokevirtual   #285 <Method float CircularProgressDrawable$Ring.getEndTrim()>
	//    3    7:freturn         
	}

	public int getOpacity()
	{
		return -3;
	//    0    0:bipush          -3
	//    1    2:ireturn         
	}

	public float getProgressRotation()
	{
		return mRing.getRotation();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:invokevirtual   #289 <Method float CircularProgressDrawable$Ring.getRotation()>
	//    3    7:freturn         
	}

	public float getStartTrim()
	{
		return mRing.getStartTrim();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:invokevirtual   #292 <Method float CircularProgressDrawable$Ring.getStartTrim()>
	//    3    7:freturn         
	}

	public android.graphics.Paint.Cap getStrokeCap()
	{
		return mRing.getStrokeCap();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:invokevirtual   #296 <Method android.graphics.Paint$Cap CircularProgressDrawable$Ring.getStrokeCap()>
	//    3    7:areturn         
	}

	public float getStrokeWidth()
	{
		return mRing.getStrokeWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:invokevirtual   #299 <Method float CircularProgressDrawable$Ring.getStrokeWidth()>
	//    3    7:freturn         
	}

	public boolean isRunning()
	{
		return mAnimator.isRunning();
	//    0    0:aload_0         
	//    1    1:getfield        #207 <Field Animator mAnimator>
	//    2    4:invokevirtual   #304 <Method boolean Animator.isRunning()>
	//    3    7:ireturn         
	}

	public void setAlpha(int i)
	{
		mRing.setAlpha(i);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #307 <Method void CircularProgressDrawable$Ring.setAlpha(int)>
		invalidateSelf();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #310 <Method void invalidateSelf()>
	//    6   12:return          
	}

	public void setArrowDimensions(float f, float f1)
	{
		mRing.setArrowDimensions(f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #177 <Method void CircularProgressDrawable$Ring.setArrowDimensions(float, float)>
		invalidateSelf();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #310 <Method void invalidateSelf()>
	//    7   13:return          
	}

	public void setArrowEnabled(boolean flag)
	{
		mRing.setShowArrow(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #315 <Method void CircularProgressDrawable$Ring.setShowArrow(boolean)>
		invalidateSelf();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #310 <Method void invalidateSelf()>
	//    6   12:return          
	}

	public void setArrowScale(float f)
	{
		mRing.setArrowScale(f);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #318 <Method void CircularProgressDrawable$Ring.setArrowScale(float)>
		invalidateSelf();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #310 <Method void invalidateSelf()>
	//    6   12:return          
	}

	public void setBackgroundColor(int i)
	{
		mRing.setBackgroundColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #321 <Method void CircularProgressDrawable$Ring.setBackgroundColor(int)>
		invalidateSelf();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #310 <Method void invalidateSelf()>
	//    6   12:return          
	}

	public void setCenterRadius(float f)
	{
		mRing.setCenterRadius(f);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #169 <Method void CircularProgressDrawable$Ring.setCenterRadius(float)>
		invalidateSelf();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #310 <Method void invalidateSelf()>
	//    6   12:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		mRing.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #325 <Method void CircularProgressDrawable$Ring.setColorFilter(ColorFilter)>
		invalidateSelf();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #310 <Method void invalidateSelf()>
	//    6   12:return          
	}

	public transient void setColorSchemeColors(int ai[])
	{
		mRing.setColors(ai);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #109 <Method void CircularProgressDrawable$Ring.setColors(int[])>
		mRing.setColorIndex(0);
	//    4    8:aload_0         
	//    5    9:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #173 <Method void CircularProgressDrawable$Ring.setColorIndex(int)>
		invalidateSelf();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #310 <Method void invalidateSelf()>
	//   10   20:return          
	}

	public void setProgressRotation(float f)
	{
		mRing.setRotation(f);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #147 <Method void CircularProgressDrawable$Ring.setRotation(float)>
		invalidateSelf();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #310 <Method void invalidateSelf()>
	//    6   12:return          
	}

	public void setStartEndTrim(float f, float f1)
	{
		mRing.setStartTrim(f);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #141 <Method void CircularProgressDrawable$Ring.setStartTrim(float)>
		mRing.setEndTrim(f1);
	//    4    8:aload_0         
	//    5    9:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    6   12:fload_2         
	//    7   13:invokevirtual   #144 <Method void CircularProgressDrawable$Ring.setEndTrim(float)>
		invalidateSelf();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #310 <Method void invalidateSelf()>
	//   10   20:return          
	}

	public void setStrokeCap(android.graphics.Paint.Cap cap)
	{
		mRing.setStrokeCap(cap);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #332 <Method void CircularProgressDrawable$Ring.setStrokeCap(android.graphics.Paint$Cap)>
		invalidateSelf();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #310 <Method void invalidateSelf()>
	//    6   12:return          
	}

	public void setStrokeWidth(float f)
	{
		mRing.setStrokeWidth(f);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #166 <Method void CircularProgressDrawable$Ring.setStrokeWidth(float)>
		invalidateSelf();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #310 <Method void invalidateSelf()>
	//    6   12:return          
	}

	public void setStyle(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            21
			setSizeParameters(11F, 3F, 12F, 6F);
	//    2    4:aload_0         
	//    3    5:ldc1            #32  <Float 11F>
	//    4    7:ldc1            #57  <Float 3F>
	//    5    9:ldc2            #334 <Float 12F>
	//    6   12:ldc2            #335 <Float 6F>
	//    7   15:invokespecial   #337 <Method void setSizeParameters(float, float, float, float)>
		else
	//*   8   18:goto            35
			setSizeParameters(7.5F, 2.5F, 10F, 5F);
	//    9   21:aload_0         
	//   10   22:ldc1            #30  <Float 7.5F>
	//   11   24:ldc1            #55  <Float 2.5F>
	//   12   26:ldc2            #338 <Float 10F>
	//   13   29:ldc2            #339 <Float 5F>
	//   14   32:invokespecial   #337 <Method void setSizeParameters(float, float, float, float)>
		invalidateSelf();
	//   15   35:aload_0         
	//   16   36:invokevirtual   #310 <Method void invalidateSelf()>
	//   17   39:return          
	}

	public void start()
	{
		mAnimator.cancel();
	//    0    0:aload_0         
	//    1    1:getfield        #207 <Field Animator mAnimator>
	//    2    4:invokevirtual   #343 <Method void Animator.cancel()>
		mRing.storeOriginals();
	//    3    7:aload_0         
	//    4    8:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    5   11:invokevirtual   #346 <Method void CircularProgressDrawable$Ring.storeOriginals()>
		if(mRing.getEndTrim() != mRing.getStartTrim())
	//*   6   14:aload_0         
	//*   7   15:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//*   8   18:invokevirtual   #285 <Method float CircularProgressDrawable$Ring.getEndTrim()>
	//*   9   21:aload_0         
	//*  10   22:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//*  11   25:invokevirtual   #292 <Method float CircularProgressDrawable$Ring.getStartTrim()>
	//*  12   28:fcmpl           
	//*  13   29:ifeq            56
		{
			mFinishing = true;
	//   14   32:aload_0         
	//   15   33:iconst_1        
	//   16   34:putfield        #211 <Field boolean mFinishing>
			mAnimator.setDuration(666L);
	//   17   37:aload_0         
	//   18   38:getfield        #207 <Field Animator mAnimator>
	//   19   41:ldc2w           #347 <Long 666L>
	//   20   44:invokevirtual   #352 <Method Animator Animator.setDuration(long)>
	//   21   47:pop             
			mAnimator.start();
	//   22   48:aload_0         
	//   23   49:getfield        #207 <Field Animator mAnimator>
	//   24   52:invokevirtual   #354 <Method void Animator.start()>
			return;
	//   25   55:return          
		} else
		{
			mRing.setColorIndex(0);
	//   26   56:aload_0         
	//   27   57:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//   28   60:iconst_0        
	//   29   61:invokevirtual   #173 <Method void CircularProgressDrawable$Ring.setColorIndex(int)>
			mRing.resetOriginals();
	//   30   64:aload_0         
	//   31   65:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//   32   68:invokevirtual   #357 <Method void CircularProgressDrawable$Ring.resetOriginals()>
			mAnimator.setDuration(1332L);
	//   33   71:aload_0         
	//   34   72:getfield        #207 <Field Animator mAnimator>
	//   35   75:ldc2w           #358 <Long 1332L>
	//   36   78:invokevirtual   #352 <Method Animator Animator.setDuration(long)>
	//   37   81:pop             
			mAnimator.start();
	//   38   82:aload_0         
	//   39   83:getfield        #207 <Field Animator mAnimator>
	//   40   86:invokevirtual   #354 <Method void Animator.start()>
			return;
	//   41   89:return          
		}
	}

	public void stop()
	{
		mAnimator.cancel();
	//    0    0:aload_0         
	//    1    1:getfield        #207 <Field Animator mAnimator>
	//    2    4:invokevirtual   #343 <Method void Animator.cancel()>
		setRotation(0.0F);
	//    3    7:aload_0         
	//    4    8:fconst_0        
	//    5    9:invokespecial   #223 <Method void setRotation(float)>
		mRing.setShowArrow(false);
	//    6   12:aload_0         
	//    7   13:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #315 <Method void CircularProgressDrawable$Ring.setShowArrow(boolean)>
		mRing.setColorIndex(0);
	//   10   20:aload_0         
	//   11   21:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #173 <Method void CircularProgressDrawable$Ring.setColorIndex(int)>
		mRing.resetOriginals();
	//   14   28:aload_0         
	//   15   29:getfield        #105 <Field CircularProgressDrawable$Ring mRing>
	//   16   32:invokevirtual   #357 <Method void CircularProgressDrawable$Ring.resetOriginals()>
		invalidateSelf();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #310 <Method void invalidateSelf()>
	//   19   39:return          
	}

	void updateRingColor(float f, Ring ring)
	{
		if(f > 0.75F)
	//*   0    0:fload_1         
	//*   1    1:ldc1            #36  <Float 0.75F>
	//*   2    3:fcmpl           
	//*   3    4:ifle            32
		{
			ring.setColor(evaluateColorChange((f - 0.75F) / 0.25F, ring.getStartingColor(), ring.getNextColor()));
	//    4    7:aload_2         
	//    5    8:aload_0         
	//    6    9:fload_1         
	//    7   10:ldc1            #36  <Float 0.75F>
	//    8   12:fsub            
	//    9   13:ldc2            #361 <Float 0.25F>
	//   10   16:fdiv            
	//   11   17:aload_2         
	//   12   18:invokevirtual   #364 <Method int CircularProgressDrawable$Ring.getStartingColor()>
	//   13   21:aload_2         
	//   14   22:invokevirtual   #367 <Method int CircularProgressDrawable$Ring.getNextColor()>
	//   15   25:invokespecial   #369 <Method int evaluateColorChange(float, int, int)>
	//   16   28:invokevirtual   #372 <Method void CircularProgressDrawable$Ring.setColor(int)>
			return;
	//   17   31:return          
		} else
		{
			ring.setColor(ring.getStartingColor());
	//   18   32:aload_2         
	//   19   33:aload_2         
	//   20   34:invokevirtual   #364 <Method int CircularProgressDrawable$Ring.getStartingColor()>
	//   21   37:invokevirtual   #372 <Method void CircularProgressDrawable$Ring.setColor(int)>
			return;
	//   22   40:return          
		}
	}

	private static final int ANIMATION_DURATION = 1332;
	private static final int ARROW_HEIGHT = 5;
	private static final int ARROW_HEIGHT_LARGE = 6;
	private static final int ARROW_WIDTH = 10;
	private static final int ARROW_WIDTH_LARGE = 12;
	private static final float CENTER_RADIUS = 7.5F;
	private static final float CENTER_RADIUS_LARGE = 11F;
	private static final int COLORS[] = {
		0xff000000
	};
	private static final float COLOR_CHANGE_OFFSET = 0.75F;
	public static final int DEFAULT = 1;
	private static final float GROUP_FULL_ROTATION = 216F;
	public static final int LARGE = 0;
	private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
	private static final Interpolator MATERIAL_INTERPOLATOR = new FastOutSlowInInterpolator();
	private static final float MAX_PROGRESS_ARC = 0.8F;
	private static final float MIN_PROGRESS_ARC = 0.01F;
	private static final float RING_ROTATION = 0.21F;
	private static final float SHRINK_OFFSET = 0.5F;
	private static final float STROKE_WIDTH = 2.5F;
	private static final float STROKE_WIDTH_LARGE = 3F;
	private Animator mAnimator;
	boolean mFinishing;
	private Resources mResources;
	private final Ring mRing = new Ring();
	private float mRotation;
	float mRotationCount;

	static 
	{
	//    0    0:new             #71  <Class LinearInterpolator>
	//    1    3:dup             
	//    2    4:invokespecial   #74  <Method void LinearInterpolator()>
	//    3    7:putstatic       #76  <Field Interpolator LINEAR_INTERPOLATOR>
	//    4   10:new             #78  <Class FastOutSlowInInterpolator>
	//    5   13:dup             
	//    6   14:invokespecial   #79  <Method void FastOutSlowInInterpolator()>
	//    7   17:putstatic       #81  <Field Interpolator MATERIAL_INTERPOLATOR>
	//    8   20:iconst_1        
	//    9   21:newarray        int[]
	//   10   23:dup             
	//   11   24:iconst_0        
	//   12   25:ldc1            #82  <Int 0xff000000>
	//   13   27:iastore         
	//   14   28:putstatic       #84  <Field int[] COLORS>
	//*  15   31:return          
	}
}
