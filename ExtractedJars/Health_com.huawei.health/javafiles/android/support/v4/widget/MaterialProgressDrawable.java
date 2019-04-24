// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.*;
import java.lang.annotation.Annotation;
import java.util.ArrayList;

class MaterialProgressDrawable extends Drawable
	implements Animatable
{
	public static interface ProgressDrawableSize
		extends Annotation
	{
	}

	static class Ring
	{

		private void drawTriangle(Canvas canvas, float f, float f1, Rect rect)
		{
			if(mShowArrow)
		//*   0    0:aload_0         
		//*   1    1:getfield        #108 <Field boolean mShowArrow>
		//*   2    4:ifeq            222
			{
				if(mArrow == null)
		//*   3    7:aload_0         
		//*   4    8:getfield        #110 <Field Path mArrow>
		//*   5   11:ifnonnull       38
				{
					mArrow = new Path();
		//    6   14:aload_0         
		//    7   15:new             #112 <Class Path>
		//    8   18:dup             
		//    9   19:invokespecial   #113 <Method void Path()>
		//   10   22:putfield        #110 <Field Path mArrow>
					mArrow.setFillType(android.graphics.Path.FillType.EVEN_ODD);
		//   11   25:aload_0         
		//   12   26:getfield        #110 <Field Path mArrow>
		//   13   29:getstatic       #119 <Field android.graphics.Path$FillType android.graphics.Path$FillType.EVEN_ODD>
		//   14   32:invokevirtual   #123 <Method void Path.setFillType(android.graphics.Path$FillType)>
				} else
		//*  15   35:goto            45
				{
					mArrow.reset();
		//   16   38:aload_0         
		//   17   39:getfield        #110 <Field Path mArrow>
		//   18   42:invokevirtual   #126 <Method void Path.reset()>
				}
				float f2 = (int)mStrokeInset / 2;
		//   19   45:aload_0         
		//   20   46:getfield        #69  <Field float mStrokeInset>
		//   21   49:f2i             
		//   22   50:iconst_2        
		//   23   51:idiv            
		//   24   52:i2f             
		//   25   53:fstore          5
				float f3 = mArrowScale;
		//   26   55:aload_0         
		//   27   56:getfield        #128 <Field float mArrowScale>
		//   28   59:fstore          6
				float f4 = (float)(mRingCenterRadius * Math.cos(0.0D) + (double)rect.exactCenterX());
		//   29   61:aload_0         
		//   30   62:getfield        #130 <Field double mRingCenterRadius>
		//   31   65:dconst_0        
		//   32   66:invokestatic    #136 <Method double Math.cos(double)>
		//   33   69:dmul            
		//   34   70:aload           4
		//   35   72:invokevirtual   #142 <Method float Rect.exactCenterX()>
		//   36   75:f2d             
		//   37   76:dadd            
		//   38   77:d2f             
		//   39   78:fstore          7
				float f5 = (float)(mRingCenterRadius * Math.sin(0.0D) + (double)rect.exactCenterY());
		//   40   80:aload_0         
		//   41   81:getfield        #130 <Field double mRingCenterRadius>
		//   42   84:dconst_0        
		//   43   85:invokestatic    #145 <Method double Math.sin(double)>
		//   44   88:dmul            
		//   45   89:aload           4
		//   46   91:invokevirtual   #148 <Method float Rect.exactCenterY()>
		//   47   94:f2d             
		//   48   95:dadd            
		//   49   96:d2f             
		//   50   97:fstore          8
				mArrow.moveTo(0.0F, 0.0F);
		//   51   99:aload_0         
		//   52  100:getfield        #110 <Field Path mArrow>
		//   53  103:fconst_0        
		//   54  104:fconst_0        
		//   55  105:invokevirtual   #152 <Method void Path.moveTo(float, float)>
				mArrow.lineTo((float)mArrowWidth * mArrowScale, 0.0F);
		//   56  108:aload_0         
		//   57  109:getfield        #110 <Field Path mArrow>
		//   58  112:aload_0         
		//   59  113:getfield        #154 <Field int mArrowWidth>
		//   60  116:i2f             
		//   61  117:aload_0         
		//   62  118:getfield        #128 <Field float mArrowScale>
		//   63  121:fmul            
		//   64  122:fconst_0        
		//   65  123:invokevirtual   #157 <Method void Path.lineTo(float, float)>
				mArrow.lineTo(((float)mArrowWidth * mArrowScale) / 2.0F, (float)mArrowHeight * mArrowScale);
		//   66  126:aload_0         
		//   67  127:getfield        #110 <Field Path mArrow>
		//   68  130:aload_0         
		//   69  131:getfield        #154 <Field int mArrowWidth>
		//   70  134:i2f             
		//   71  135:aload_0         
		//   72  136:getfield        #128 <Field float mArrowScale>
		//   73  139:fmul            
		//   74  140:fconst_2        
		//   75  141:fdiv            
		//   76  142:aload_0         
		//   77  143:getfield        #159 <Field int mArrowHeight>
		//   78  146:i2f             
		//   79  147:aload_0         
		//   80  148:getfield        #128 <Field float mArrowScale>
		//   81  151:fmul            
		//   82  152:invokevirtual   #157 <Method void Path.lineTo(float, float)>
				mArrow.offset(f4 - f2 * f3, f5);
		//   83  155:aload_0         
		//   84  156:getfield        #110 <Field Path mArrow>
		//   85  159:fload           7
		//   86  161:fload           5
		//   87  163:fload           6
		//   88  165:fmul            
		//   89  166:fsub            
		//   90  167:fload           8
		//   91  169:invokevirtual   #162 <Method void Path.offset(float, float)>
				mArrow.close();
		//   92  172:aload_0         
		//   93  173:getfield        #110 <Field Path mArrow>
		//   94  176:invokevirtual   #165 <Method void Path.close()>
				mArrowPaint.setColor(mCurrentColor);
		//   95  179:aload_0         
		//   96  180:getfield        #57  <Field Paint mArrowPaint>
		//   97  183:aload_0         
		//   98  184:getfield        #167 <Field int mCurrentColor>
		//   99  187:invokevirtual   #170 <Method void Paint.setColor(int)>
				canvas.rotate((f + f1) - 5F, rect.exactCenterX(), rect.exactCenterY());
		//  100  190:aload_1         
		//  101  191:fload_2         
		//  102  192:fload_3         
		//  103  193:fadd            
		//  104  194:ldc1            #64  <Float 5F>
		//  105  196:fsub            
		//  106  197:aload           4
		//  107  199:invokevirtual   #142 <Method float Rect.exactCenterX()>
		//  108  202:aload           4
		//  109  204:invokevirtual   #148 <Method float Rect.exactCenterY()>
		//  110  207:invokevirtual   #176 <Method void Canvas.rotate(float, float, float)>
				canvas.drawPath(mArrow, mArrowPaint);
		//  111  210:aload_1         
		//  112  211:aload_0         
		//  113  212:getfield        #110 <Field Path mArrow>
		//  114  215:aload_0         
		//  115  216:getfield        #57  <Field Paint mArrowPaint>
		//  116  219:invokevirtual   #180 <Method void Canvas.drawPath(Path, Paint)>
			}
		//  117  222:return          
		}

		private int getNextColorIndex()
		{
			return (mColorIndex + 1) % mColors.length;
		//    0    0:aload_0         
		//    1    1:getfield        #184 <Field int mColorIndex>
		//    2    4:iconst_1        
		//    3    5:iadd            
		//    4    6:aload_0         
		//    5    7:getfield        #186 <Field int[] mColors>
		//    6   10:arraylength     
		//    7   11:irem            
		//    8   12:ireturn         
		}

		private void invalidateSelf()
		{
			mCallback.invalidateDrawable(((Drawable) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #76  <Field android.graphics.drawable.Drawable$Callback mCallback>
		//    2    4:aconst_null     
		//    3    5:invokeinterface #193 <Method void android.graphics.drawable.Drawable$Callback.invalidateDrawable(Drawable)>
		//    4   10:return          
		}

		public void draw(Canvas canvas, Rect rect)
		{
			RectF rectf = mTempBounds;
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field RectF mTempBounds>
		//    2    4:astore          5
			rectf.set(rect);
		//    3    6:aload           5
		//    4    8:aload_2         
		//    5    9:invokevirtual   #199 <Method void RectF.set(Rect)>
			rectf.inset(mStrokeInset, mStrokeInset);
		//    6   12:aload           5
		//    7   14:aload_0         
		//    8   15:getfield        #69  <Field float mStrokeInset>
		//    9   18:aload_0         
		//   10   19:getfield        #69  <Field float mStrokeInset>
		//   11   22:invokevirtual   #202 <Method void RectF.inset(float, float)>
			float f = (mStartTrim + mRotation) * 360F;
		//   12   25:aload_0         
		//   13   26:getfield        #59  <Field float mStartTrim>
		//   14   29:aload_0         
		//   15   30:getfield        #63  <Field float mRotation>
		//   16   33:fadd            
		//   17   34:ldc1            #203 <Float 360F>
		//   18   36:fmul            
		//   19   37:fstore_3        
			float f1 = (mEndTrim + mRotation) * 360F - f;
		//   20   38:aload_0         
		//   21   39:getfield        #61  <Field float mEndTrim>
		//   22   42:aload_0         
		//   23   43:getfield        #63  <Field float mRotation>
		//   24   46:fadd            
		//   25   47:ldc1            #203 <Float 360F>
		//   26   49:fmul            
		//   27   50:fload_3         
		//   28   51:fsub            
		//   29   52:fstore          4
			mPaint.setColor(mCurrentColor);
		//   30   54:aload_0         
		//   31   55:getfield        #55  <Field Paint mPaint>
		//   32   58:aload_0         
		//   33   59:getfield        #167 <Field int mCurrentColor>
		//   34   62:invokevirtual   #170 <Method void Paint.setColor(int)>
			canvas.drawArc(rectf, f, f1, false, mPaint);
		//   35   65:aload_1         
		//   36   66:aload           5
		//   37   68:fload_3         
		//   38   69:fload           4
		//   39   71:iconst_0        
		//   40   72:aload_0         
		//   41   73:getfield        #55  <Field Paint mPaint>
		//   42   76:invokevirtual   #207 <Method void Canvas.drawArc(RectF, float, float, boolean, Paint)>
			drawTriangle(canvas, f, f1, rect);
		//   43   79:aload_0         
		//   44   80:aload_1         
		//   45   81:fload_3         
		//   46   82:fload           4
		//   47   84:aload_2         
		//   48   85:invokespecial   #209 <Method void drawTriangle(Canvas, float, float, Rect)>
			if(mAlpha < 255)
		//*  49   88:aload_0         
		//*  50   89:getfield        #211 <Field int mAlpha>
		//*  51   92:sipush          255
		//*  52   95:icmpge          147
			{
				mCirclePaint.setColor(mBackgroundColor);
		//   53   98:aload_0         
		//   54   99:getfield        #74  <Field Paint mCirclePaint>
		//   55  102:aload_0         
		//   56  103:getfield        #213 <Field int mBackgroundColor>
		//   57  106:invokevirtual   #170 <Method void Paint.setColor(int)>
				mCirclePaint.setAlpha(255 - mAlpha);
		//   58  109:aload_0         
		//   59  110:getfield        #74  <Field Paint mCirclePaint>
		//   60  113:sipush          255
		//   61  116:aload_0         
		//   62  117:getfield        #211 <Field int mAlpha>
		//   63  120:isub            
		//   64  121:invokevirtual   #216 <Method void Paint.setAlpha(int)>
				canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), rect.width() / 2, mCirclePaint);
		//   65  124:aload_1         
		//   66  125:aload_2         
		//   67  126:invokevirtual   #142 <Method float Rect.exactCenterX()>
		//   68  129:aload_2         
		//   69  130:invokevirtual   #148 <Method float Rect.exactCenterY()>
		//   70  133:aload_2         
		//   71  134:invokevirtual   #219 <Method int Rect.width()>
		//   72  137:iconst_2        
		//   73  138:idiv            
		//   74  139:i2f             
		//   75  140:aload_0         
		//   76  141:getfield        #74  <Field Paint mCirclePaint>
		//   77  144:invokevirtual   #223 <Method void Canvas.drawCircle(float, float, float, Paint)>
			}
		//   78  147:return          
		}

		public int getAlpha()
		{
			return mAlpha;
		//    0    0:aload_0         
		//    1    1:getfield        #211 <Field int mAlpha>
		//    2    4:ireturn         
		}

		public double getCenterRadius()
		{
			return mRingCenterRadius;
		//    0    0:aload_0         
		//    1    1:getfield        #130 <Field double mRingCenterRadius>
		//    2    4:dreturn         
		}

		public float getEndTrim()
		{
			return mEndTrim;
		//    0    0:aload_0         
		//    1    1:getfield        #61  <Field float mEndTrim>
		//    2    4:freturn         
		}

		public float getInsets()
		{
			return mStrokeInset;
		//    0    0:aload_0         
		//    1    1:getfield        #69  <Field float mStrokeInset>
		//    2    4:freturn         
		}

		public int getNextColor()
		{
			return mColors[getNextColorIndex()];
		//    0    0:aload_0         
		//    1    1:getfield        #186 <Field int[] mColors>
		//    2    4:aload_0         
		//    3    5:invokespecial   #231 <Method int getNextColorIndex()>
		//    4    8:iaload          
		//    5    9:ireturn         
		}

		public float getRotation()
		{
			return mRotation;
		//    0    0:aload_0         
		//    1    1:getfield        #63  <Field float mRotation>
		//    2    4:freturn         
		}

		public float getStartTrim()
		{
			return mStartTrim;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field float mStartTrim>
		//    2    4:freturn         
		}

		public int getStartingColor()
		{
			return mColors[mColorIndex];
		//    0    0:aload_0         
		//    1    1:getfield        #186 <Field int[] mColors>
		//    2    4:aload_0         
		//    3    5:getfield        #184 <Field int mColorIndex>
		//    4    8:iaload          
		//    5    9:ireturn         
		}

		public float getStartingEndTrim()
		{
			return mStartingEndTrim;
		//    0    0:aload_0         
		//    1    1:getfield        #237 <Field float mStartingEndTrim>
		//    2    4:freturn         
		}

		public float getStartingRotation()
		{
			return mStartingRotation;
		//    0    0:aload_0         
		//    1    1:getfield        #240 <Field float mStartingRotation>
		//    2    4:freturn         
		}

		public float getStartingStartTrim()
		{
			return mStartingStartTrim;
		//    0    0:aload_0         
		//    1    1:getfield        #243 <Field float mStartingStartTrim>
		//    2    4:freturn         
		}

		public float getStrokeWidth()
		{
			return mStrokeWidth;
		//    0    0:aload_0         
		//    1    1:getfield        #66  <Field float mStrokeWidth>
		//    2    4:freturn         
		}

		public void goToNextColor()
		{
			setColorIndex(getNextColorIndex());
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:invokespecial   #231 <Method int getNextColorIndex()>
		//    3    5:invokevirtual   #248 <Method void setColorIndex(int)>
		//    4    8:return          
		}

		public void resetOriginals()
		{
			mStartingStartTrim = 0.0F;
		//    0    0:aload_0         
		//    1    1:fconst_0        
		//    2    2:putfield        #243 <Field float mStartingStartTrim>
			mStartingEndTrim = 0.0F;
		//    3    5:aload_0         
		//    4    6:fconst_0        
		//    5    7:putfield        #237 <Field float mStartingEndTrim>
			mStartingRotation = 0.0F;
		//    6   10:aload_0         
		//    7   11:fconst_0        
		//    8   12:putfield        #240 <Field float mStartingRotation>
			setStartTrim(0.0F);
		//    9   15:aload_0         
		//   10   16:fconst_0        
		//   11   17:invokevirtual   #253 <Method void setStartTrim(float)>
			setEndTrim(0.0F);
		//   12   20:aload_0         
		//   13   21:fconst_0        
		//   14   22:invokevirtual   #256 <Method void setEndTrim(float)>
			setRotation(0.0F);
		//   15   25:aload_0         
		//   16   26:fconst_0        
		//   17   27:invokevirtual   #259 <Method void setRotation(float)>
		//   18   30:return          
		}

		public void setAlpha(int i)
		{
			mAlpha = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #211 <Field int mAlpha>
		//    3    5:return          
		}

		public void setArrowDimensions(float f, float f1)
		{
			mArrowWidth = (int)f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:f2i             
		//    3    3:putfield        #154 <Field int mArrowWidth>
			mArrowHeight = (int)f1;
		//    4    6:aload_0         
		//    5    7:fload_2         
		//    6    8:f2i             
		//    7    9:putfield        #159 <Field int mArrowHeight>
		//    8   12:return          
		}

		public void setArrowScale(float f)
		{
			if(f != mArrowScale)
		//*   0    0:fload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #128 <Field float mArrowScale>
		//*   3    5:fcmpl           
		//*   4    6:ifeq            18
			{
				mArrowScale = f;
		//    5    9:aload_0         
		//    6   10:fload_1         
		//    7   11:putfield        #128 <Field float mArrowScale>
				invalidateSelf();
		//    8   14:aload_0         
		//    9   15:invokespecial   #263 <Method void invalidateSelf()>
			}
		//   10   18:return          
		}

		public void setBackgroundColor(int i)
		{
			mBackgroundColor = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #213 <Field int mBackgroundColor>
		//    3    5:return          
		}

		public void setCenterRadius(double d)
		{
			mRingCenterRadius = d;
		//    0    0:aload_0         
		//    1    1:dload_1         
		//    2    2:putfield        #130 <Field double mRingCenterRadius>
		//    3    5:return          
		}

		public void setColor(int i)
		{
			mCurrentColor = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #167 <Field int mCurrentColor>
		//    3    5:return          
		}

		public void setColorFilter(ColorFilter colorfilter)
		{
			mPaint.setColorFilter(colorfilter);
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field Paint mPaint>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #271 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
		//    4    8:pop             
			invalidateSelf();
		//    5    9:aload_0         
		//    6   10:invokespecial   #263 <Method void invalidateSelf()>
		//    7   13:return          
		}

		public void setColorIndex(int i)
		{
			mColorIndex = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #184 <Field int mColorIndex>
			mCurrentColor = mColors[mColorIndex];
		//    3    5:aload_0         
		//    4    6:aload_0         
		//    5    7:getfield        #186 <Field int[] mColors>
		//    6   10:aload_0         
		//    7   11:getfield        #184 <Field int mColorIndex>
		//    8   14:iaload          
		//    9   15:putfield        #167 <Field int mCurrentColor>
		//   10   18:return          
		}

		public void setColors(int ai[])
		{
			mColors = ai;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #186 <Field int[] mColors>
			setColorIndex(0);
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:invokevirtual   #248 <Method void setColorIndex(int)>
		//    6   10:return          
		}

		public void setEndTrim(float f)
		{
			mEndTrim = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #61  <Field float mEndTrim>
			invalidateSelf();
		//    3    5:aload_0         
		//    4    6:invokespecial   #263 <Method void invalidateSelf()>
		//    5    9:return          
		}

		public void setInsets(int i, int j)
		{
			float f = Math.min(i, j);
		//    0    0:iload_1         
		//    1    1:iload_2         
		//    2    2:invokestatic    #281 <Method int Math.min(int, int)>
		//    3    5:i2f             
		//    4    6:fstore_3        
			if(mRingCenterRadius <= 0.0D || f < 0.0F)
		//*   5    7:aload_0         
		//*   6    8:getfield        #130 <Field double mRingCenterRadius>
		//*   7   11:dconst_0        
		//*   8   12:dcmpg           
		//*   9   13:ifle            22
		//*  10   16:fload_3         
		//*  11   17:fconst_0        
		//*  12   18:fcmpg           
		//*  13   19:ifge            37
				f = (float)Math.ceil(mStrokeWidth / 2.0F);
		//   14   22:aload_0         
		//   15   23:getfield        #66  <Field float mStrokeWidth>
		//   16   26:fconst_2        
		//   17   27:fdiv            
		//   18   28:f2d             
		//   19   29:invokestatic    #284 <Method double Math.ceil(double)>
		//   20   32:d2f             
		//   21   33:fstore_3        
			else
		//*  22   34:goto            48
				f = (float)((double)(f / 2.0F) - mRingCenterRadius);
		//   23   37:fload_3         
		//   24   38:fconst_2        
		//   25   39:fdiv            
		//   26   40:f2d             
		//   27   41:aload_0         
		//   28   42:getfield        #130 <Field double mRingCenterRadius>
		//   29   45:dsub            
		//   30   46:d2f             
		//   31   47:fstore_3        
			mStrokeInset = f;
		//   32   48:aload_0         
		//   33   49:fload_3         
		//   34   50:putfield        #69  <Field float mStrokeInset>
		//   35   53:return          
		}

		public void setRotation(float f)
		{
			mRotation = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #63  <Field float mRotation>
			invalidateSelf();
		//    3    5:aload_0         
		//    4    6:invokespecial   #263 <Method void invalidateSelf()>
		//    5    9:return          
		}

		public void setShowArrow(boolean flag)
		{
			if(mShowArrow != flag)
		//*   0    0:aload_0         
		//*   1    1:getfield        #108 <Field boolean mShowArrow>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          17
			{
				mShowArrow = flag;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #108 <Field boolean mShowArrow>
				invalidateSelf();
		//    7   13:aload_0         
		//    8   14:invokespecial   #263 <Method void invalidateSelf()>
			}
		//    9   17:return          
		}

		public void setStartTrim(float f)
		{
			mStartTrim = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #59  <Field float mStartTrim>
			invalidateSelf();
		//    3    5:aload_0         
		//    4    6:invokespecial   #263 <Method void invalidateSelf()>
		//    5    9:return          
		}

		public void setStrokeWidth(float f)
		{
			mStrokeWidth = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #66  <Field float mStrokeWidth>
			mPaint.setStrokeWidth(f);
		//    3    5:aload_0         
		//    4    6:getfield        #55  <Field Paint mPaint>
		//    5    9:fload_1         
		//    6   10:invokevirtual   #288 <Method void Paint.setStrokeWidth(float)>
			invalidateSelf();
		//    7   13:aload_0         
		//    8   14:invokespecial   #263 <Method void invalidateSelf()>
		//    9   17:return          
		}

		public void storeOriginals()
		{
			mStartingStartTrim = mStartTrim;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #59  <Field float mStartTrim>
		//    3    5:putfield        #243 <Field float mStartingStartTrim>
			mStartingEndTrim = mEndTrim;
		//    4    8:aload_0         
		//    5    9:aload_0         
		//    6   10:getfield        #61  <Field float mEndTrim>
		//    7   13:putfield        #237 <Field float mStartingEndTrim>
			mStartingRotation = mRotation;
		//    8   16:aload_0         
		//    9   17:aload_0         
		//   10   18:getfield        #63  <Field float mRotation>
		//   11   21:putfield        #240 <Field float mStartingRotation>
		//   12   24:return          
		}

		private int mAlpha;
		private Path mArrow;
		private int mArrowHeight;
		private final Paint mArrowPaint = new Paint();
		private float mArrowScale;
		private int mArrowWidth;
		private int mBackgroundColor;
		private final android.graphics.drawable.Drawable.Callback mCallback;
		private final Paint mCirclePaint = new Paint(1);
		private int mColorIndex;
		private int mColors[];
		private int mCurrentColor;
		private float mEndTrim;
		private final Paint mPaint = new Paint();
		private double mRingCenterRadius;
		private float mRotation;
		private boolean mShowArrow;
		private float mStartTrim;
		private float mStartingEndTrim;
		private float mStartingRotation;
		private float mStartingStartTrim;
		private float mStrokeInset;
		private float mStrokeWidth;
		private final RectF mTempBounds = new RectF();

		Ring(android.graphics.drawable.Drawable.Callback callback)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #45  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #47  <Class RectF>
		//    4    8:dup             
		//    5    9:invokespecial   #48  <Method void RectF()>
		//    6   12:putfield        #50  <Field RectF mTempBounds>
		//    7   15:aload_0         
		//    8   16:new             #52  <Class Paint>
		//    9   19:dup             
		//   10   20:invokespecial   #53  <Method void Paint()>
		//   11   23:putfield        #55  <Field Paint mPaint>
		//   12   26:aload_0         
		//   13   27:new             #52  <Class Paint>
		//   14   30:dup             
		//   15   31:invokespecial   #53  <Method void Paint()>
		//   16   34:putfield        #57  <Field Paint mArrowPaint>
			mStartTrim = 0.0F;
		//   17   37:aload_0         
		//   18   38:fconst_0        
		//   19   39:putfield        #59  <Field float mStartTrim>
			mEndTrim = 0.0F;
		//   20   42:aload_0         
		//   21   43:fconst_0        
		//   22   44:putfield        #61  <Field float mEndTrim>
			mRotation = 0.0F;
		//   23   47:aload_0         
		//   24   48:fconst_0        
		//   25   49:putfield        #63  <Field float mRotation>
			mStrokeWidth = 5F;
		//   26   52:aload_0         
		//   27   53:ldc1            #64  <Float 5F>
		//   28   55:putfield        #66  <Field float mStrokeWidth>
			mStrokeInset = 2.5F;
		//   29   58:aload_0         
		//   30   59:ldc1            #67  <Float 2.5F>
		//   31   61:putfield        #69  <Field float mStrokeInset>
		//   32   64:aload_0         
		//   33   65:new             #52  <Class Paint>
		//   34   68:dup             
		//   35   69:iconst_1        
		//   36   70:invokespecial   #72  <Method void Paint(int)>
		//   37   73:putfield        #74  <Field Paint mCirclePaint>
			mCallback = callback;
		//   38   76:aload_0         
		//   39   77:aload_1         
		//   40   78:putfield        #76  <Field android.graphics.drawable.Drawable$Callback mCallback>
			mPaint.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
		//   41   81:aload_0         
		//   42   82:getfield        #55  <Field Paint mPaint>
		//   43   85:getstatic       #82  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.SQUARE>
		//   44   88:invokevirtual   #86  <Method void Paint.setStrokeCap(android.graphics.Paint$Cap)>
			mPaint.setAntiAlias(true);
		//   45   91:aload_0         
		//   46   92:getfield        #55  <Field Paint mPaint>
		//   47   95:iconst_1        
		//   48   96:invokevirtual   #90  <Method void Paint.setAntiAlias(boolean)>
			mPaint.setStyle(android.graphics.Paint.Style.STROKE);
		//   49   99:aload_0         
		//   50  100:getfield        #55  <Field Paint mPaint>
		//   51  103:getstatic       #96  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
		//   52  106:invokevirtual   #100 <Method void Paint.setStyle(android.graphics.Paint$Style)>
			mArrowPaint.setStyle(android.graphics.Paint.Style.FILL);
		//   53  109:aload_0         
		//   54  110:getfield        #57  <Field Paint mArrowPaint>
		//   55  113:getstatic       #103 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
		//   56  116:invokevirtual   #100 <Method void Paint.setStyle(android.graphics.Paint$Style)>
			mArrowPaint.setAntiAlias(true);
		//   57  119:aload_0         
		//   58  120:getfield        #57  <Field Paint mArrowPaint>
		//   59  123:iconst_1        
		//   60  124:invokevirtual   #90  <Method void Paint.setAntiAlias(boolean)>
		//   61  127:return          
		}
	}


	MaterialProgressDrawable(Context context, View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #103 <Method void Drawable()>
	//    2    4:aload_0         
	//    3    5:new             #105 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #106 <Method void ArrayList()>
	//    6   12:putfield        #108 <Field ArrayList mAnimators>
	//    7   15:aload_0         
	//    8   16:new             #12  <Class MaterialProgressDrawable$3>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #111 <Method void MaterialProgressDrawable$3(MaterialProgressDrawable)>
	//   12   24:putfield        #113 <Field android.graphics.drawable.Drawable$Callback mCallback>
		mParent = view;
	//   13   27:aload_0         
	//   14   28:aload_2         
	//   15   29:putfield        #115 <Field View mParent>
		mResources = context.getResources();
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #121 <Method Resources Context.getResources()>
	//   19   37:putfield        #123 <Field Resources mResources>
		mRing = new Ring(mCallback);
	//   20   40:aload_0         
	//   21   41:new             #17  <Class MaterialProgressDrawable$Ring>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:getfield        #113 <Field android.graphics.drawable.Drawable$Callback mCallback>
	//   25   49:invokespecial   #126 <Method void MaterialProgressDrawable$Ring(android.graphics.drawable.Drawable$Callback)>
	//   26   52:putfield        #128 <Field MaterialProgressDrawable$Ring mRing>
		mRing.setColors(COLORS);
	//   27   55:aload_0         
	//   28   56:getfield        #128 <Field MaterialProgressDrawable$Ring mRing>
	//   29   59:getstatic       #100 <Field int[] COLORS>
	//   30   62:invokevirtual   #132 <Method void MaterialProgressDrawable$Ring.setColors(int[])>
		updateSizes(1);
	//   31   65:aload_0         
	//   32   66:iconst_1        
	//   33   67:invokevirtual   #136 <Method void updateSizes(int)>
		setupAnimators();
	//   34   70:aload_0         
	//   35   71:invokespecial   #139 <Method void setupAnimators()>
	//   36   74:return          
	}

	private int evaluateColorChange(float f, int i, int j)
	{
		int i1 = Integer.valueOf(i).intValue();
	//    0    0:iload_2         
	//    1    1:invokestatic    #147 <Method Integer Integer.valueOf(int)>
	//    2    4:invokevirtual   #151 <Method int Integer.intValue()>
	//    3    7:istore          6
		i = i1 >> 24 & 0xff;
	//    4    9:iload           6
	//    5   11:bipush          24
	//    6   13:ishr            
	//    7   14:sipush          255
	//    8   17:iand            
	//    9   18:istore_2        
		int k = i1 >> 16 & 0xff;
	//   10   19:iload           6
	//   11   21:bipush          16
	//   12   23:ishr            
	//   13   24:sipush          255
	//   14   27:iand            
	//   15   28:istore          4
		int l = i1 >> 8 & 0xff;
	//   16   30:iload           6
	//   17   32:bipush          8
	//   18   34:ishr            
	//   19   35:sipush          255
	//   20   38:iand            
	//   21   39:istore          5
		i1 &= 0xff;
	//   22   41:iload           6
	//   23   43:sipush          255
	//   24   46:iand            
	//   25   47:istore          6
		j = Integer.valueOf(j).intValue();
	//   26   49:iload_3         
	//   27   50:invokestatic    #147 <Method Integer Integer.valueOf(int)>
	//   28   53:invokevirtual   #151 <Method int Integer.intValue()>
	//   29   56:istore_3        
		return (int)((float)((j >> 24 & 0xff) - i) * f) + i << 24 | (int)((float)((j >> 16 & 0xff) - k) * f) + k << 16 | (int)((float)((j >> 8 & 0xff) - l) * f) + l << 8 | (int)((float)((j & 0xff) - i1) * f) + i1;
	//   30   57:iload_3         
	//   31   58:bipush          24
	//   32   60:ishr            
	//   33   61:sipush          255
	//   34   64:iand            
	//   35   65:iload_2         
	//   36   66:isub            
	//   37   67:i2f             
	//   38   68:fload_1         
	//   39   69:fmul            
	//   40   70:f2i             
	//   41   71:iload_2         
	//   42   72:iadd            
	//   43   73:bipush          24
	//   44   75:ishl            
	//   45   76:iload_3         
	//   46   77:bipush          16
	//   47   79:ishr            
	//   48   80:sipush          255
	//   49   83:iand            
	//   50   84:iload           4
	//   51   86:isub            
	//   52   87:i2f             
	//   53   88:fload_1         
	//   54   89:fmul            
	//   55   90:f2i             
	//   56   91:iload           4
	//   57   93:iadd            
	//   58   94:bipush          16
	//   59   96:ishl            
	//   60   97:ior             
	//   61   98:iload_3         
	//   62   99:bipush          8
	//   63  101:ishr            
	//   64  102:sipush          255
	//   65  105:iand            
	//   66  106:iload           5
	//   67  108:isub            
	//   68  109:i2f             
	//   69  110:fload_1         
	//   70  111:fmul            
	//   71  112:f2i             
	//   72  113:iload           5
	//   73  115:iadd            
	//   74  116:bipush          8
	//   75  118:ishl            
	//   76  119:ior             
	//   77  120:iload_3         
	//   78  121:sipush          255
	//   79  124:iand            
	//   80  125:iload           6
	//   81  127:isub            
	//   82  128:i2f             
	//   83  129:fload_1         
	//   84  130:fmul            
	//   85  131:f2i             
	//   86  132:iload           6
	//   87  134:iadd            
	//   88  135:ior             
	//   89  136:ireturn         
	}

	private float getRotation()
	{
		return mRotation;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field float mRotation>
	//    2    4:freturn         
	}

	private void setSizeParameters(double d, double d1, double d2, double d3, float f, float f1)
	{
		Ring ring = mRing;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field MaterialProgressDrawable$Ring mRing>
	//    2    4:astore          12
		float f2 = mResources.getDisplayMetrics().density;
	//    3    6:aload_0         
	//    4    7:getfield        #123 <Field Resources mResources>
	//    5   10:invokevirtual   #163 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    6   13:getfield        #168 <Field float DisplayMetrics.density>
	//    7   16:fstore          11
		mWidth = (double)f2 * d;
	//    8   18:aload_0         
	//    9   19:fload           11
	//   10   21:f2d             
	//   11   22:dload_1         
	//   12   23:dmul            
	//   13   24:putfield        #170 <Field double mWidth>
		mHeight = (double)f2 * d1;
	//   14   27:aload_0         
	//   15   28:fload           11
	//   16   30:f2d             
	//   17   31:dload_3         
	//   18   32:dmul            
	//   19   33:putfield        #172 <Field double mHeight>
		ring.setStrokeWidth((float)d3 * f2);
	//   20   36:aload           12
	//   21   38:dload           7
	//   22   40:d2f             
	//   23   41:fload           11
	//   24   43:fmul            
	//   25   44:invokevirtual   #176 <Method void MaterialProgressDrawable$Ring.setStrokeWidth(float)>
		ring.setCenterRadius((double)f2 * d2);
	//   26   47:aload           12
	//   27   49:fload           11
	//   28   51:f2d             
	//   29   52:dload           5
	//   30   54:dmul            
	//   31   55:invokevirtual   #180 <Method void MaterialProgressDrawable$Ring.setCenterRadius(double)>
		ring.setColorIndex(0);
	//   32   58:aload           12
	//   33   60:iconst_0        
	//   34   61:invokevirtual   #183 <Method void MaterialProgressDrawable$Ring.setColorIndex(int)>
		ring.setArrowDimensions(f * f2, f1 * f2);
	//   35   64:aload           12
	//   36   66:fload           9
	//   37   68:fload           11
	//   38   70:fmul            
	//   39   71:fload           10
	//   40   73:fload           11
	//   41   75:fmul            
	//   42   76:invokevirtual   #187 <Method void MaterialProgressDrawable$Ring.setArrowDimensions(float, float)>
		ring.setInsets((int)mWidth, (int)mHeight);
	//   43   79:aload           12
	//   44   81:aload_0         
	//   45   82:getfield        #170 <Field double mWidth>
	//   46   85:d2i             
	//   47   86:aload_0         
	//   48   87:getfield        #172 <Field double mHeight>
	//   49   90:d2i             
	//   50   91:invokevirtual   #191 <Method void MaterialProgressDrawable$Ring.setInsets(int, int)>
	//   51   94:return          
	}

	private void setupAnimators()
	{
		final Ring ring = mRing;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field MaterialProgressDrawable$Ring mRing>
	//    2    4:astore_1        
		Animation animation = new Animation() {

			public void applyTransformation(float f, Transformation transformation)
			{
				if(mFinishing)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field MaterialProgressDrawable this$0>
			//*   2    4:getfield        #28  <Field boolean MaterialProgressDrawable.mFinishing>
			//*   3    7:ifeq            23
				{
					applyFinishTranslation(f, ring);
			//    4   10:aload_0         
			//    5   11:getfield        #17  <Field MaterialProgressDrawable this$0>
			//    6   14:fload_1         
			//    7   15:aload_0         
			//    8   16:getfield        #19  <Field MaterialProgressDrawable$Ring val$ring>
			//    9   19:invokevirtual   #32  <Method void MaterialProgressDrawable.applyFinishTranslation(float, MaterialProgressDrawable$Ring)>
					return;
			//   10   22:return          
				}
				float f1 = getMinProgressArc(ring);
			//   11   23:aload_0         
			//   12   24:getfield        #17  <Field MaterialProgressDrawable this$0>
			//   13   27:aload_0         
			//   14   28:getfield        #19  <Field MaterialProgressDrawable$Ring val$ring>
			//   15   31:invokevirtual   #36  <Method float MaterialProgressDrawable.getMinProgressArc(MaterialProgressDrawable$Ring)>
			//   16   34:fstore_3        
				float f2 = ring.getStartingEndTrim();
			//   17   35:aload_0         
			//   18   36:getfield        #19  <Field MaterialProgressDrawable$Ring val$ring>
			//   19   39:invokevirtual   #42  <Method float MaterialProgressDrawable$Ring.getStartingEndTrim()>
			//   20   42:fstore          4
				float f4 = ring.getStartingStartTrim();
			//   21   44:aload_0         
			//   22   45:getfield        #19  <Field MaterialProgressDrawable$Ring val$ring>
			//   23   48:invokevirtual   #45  <Method float MaterialProgressDrawable$Ring.getStartingStartTrim()>
			//   24   51:fstore          6
				float f3 = ring.getStartingRotation();
			//   25   53:aload_0         
			//   26   54:getfield        #19  <Field MaterialProgressDrawable$Ring val$ring>
			//   27   57:invokevirtual   #48  <Method float MaterialProgressDrawable$Ring.getStartingRotation()>
			//   28   60:fstore          5
				updateRingColor(f, ring);
			//   29   62:aload_0         
			//   30   63:getfield        #17  <Field MaterialProgressDrawable this$0>
			//   31   66:fload_1         
			//   32   67:aload_0         
			//   33   68:getfield        #19  <Field MaterialProgressDrawable$Ring val$ring>
			//   34   71:invokevirtual   #51  <Method void MaterialProgressDrawable.updateRingColor(float, MaterialProgressDrawable$Ring)>
				if(f <= 0.5F)
			//*  35   74:fload_1         
			//*  36   75:ldc1            #52  <Float 0.5F>
			//*  37   77:fcmpg           
			//*  38   78:ifgt            116
				{
					float f6 = f / 0.5F;
			//   39   81:fload_1         
			//   40   82:ldc1            #52  <Float 0.5F>
			//   41   84:fdiv            
			//   42   85:fstore          7
					f6 = MaterialProgressDrawable.MATERIAL_INTERPOLATOR.getInterpolation(f6);
			//   43   87:getstatic       #56  <Field Interpolator MaterialProgressDrawable.MATERIAL_INTERPOLATOR>
			//   44   90:fload           7
			//   45   92:invokeinterface #62  <Method float Interpolator.getInterpolation(float)>
			//   46   97:fstore          7
					ring.setStartTrim(f4 + (0.8F - f1) * f6);
			//   47   99:aload_0         
			//   48  100:getfield        #19  <Field MaterialProgressDrawable$Ring val$ring>
			//   49  103:fload           6
			//   50  105:ldc1            #63  <Float 0.8F>
			//   51  107:fload_3         
			//   52  108:fsub            
			//   53  109:fload           7
			//   54  111:fmul            
			//   55  112:fadd            
			//   56  113:invokevirtual   #67  <Method void MaterialProgressDrawable$Ring.setStartTrim(float)>
				}
				if(f > 0.5F)
			//*  57  116:fload_1         
			//*  58  117:ldc1            #52  <Float 0.5F>
			//*  59  119:fcmpl           
			//*  60  120:ifle            161
				{
					float f5 = (f - 0.5F) / 0.5F;
			//   61  123:fload_1         
			//   62  124:ldc1            #52  <Float 0.5F>
			//   63  126:fsub            
			//   64  127:ldc1            #52  <Float 0.5F>
			//   65  129:fdiv            
			//   66  130:fstore          6
					f5 = MaterialProgressDrawable.MATERIAL_INTERPOLATOR.getInterpolation(f5);
			//   67  132:getstatic       #56  <Field Interpolator MaterialProgressDrawable.MATERIAL_INTERPOLATOR>
			//   68  135:fload           6
			//   69  137:invokeinterface #62  <Method float Interpolator.getInterpolation(float)>
			//   70  142:fstore          6
					ring.setEndTrim(f2 + f5 * (0.8F - f1));
			//   71  144:aload_0         
			//   72  145:getfield        #19  <Field MaterialProgressDrawable$Ring val$ring>
			//   73  148:fload           4
			//   74  150:fload           6
			//   75  152:ldc1            #63  <Float 0.8F>
			//   76  154:fload_3         
			//   77  155:fsub            
			//   78  156:fmul            
			//   79  157:fadd            
			//   80  158:invokevirtual   #70  <Method void MaterialProgressDrawable$Ring.setEndTrim(float)>
				}
				ring.setRotation(f3 + 0.25F * f);
			//   81  161:aload_0         
			//   82  162:getfield        #19  <Field MaterialProgressDrawable$Ring val$ring>
			//   83  165:fload           5
			//   84  167:ldc1            #71  <Float 0.25F>
			//   85  169:fload_1         
			//   86  170:fmul            
			//   87  171:fadd            
			//   88  172:invokevirtual   #74  <Method void MaterialProgressDrawable$Ring.setRotation(float)>
				f1 = mRotationCount / 5F;
			//   89  175:aload_0         
			//   90  176:getfield        #17  <Field MaterialProgressDrawable this$0>
			//   91  179:getfield        #78  <Field float MaterialProgressDrawable.mRotationCount>
			//   92  182:ldc1            #79  <Float 5F>
			//   93  184:fdiv            
			//   94  185:fstore_3        
				setRotation(216F * f + f1 * 1080F);
			//   95  186:aload_0         
			//   96  187:getfield        #17  <Field MaterialProgressDrawable this$0>
			//   97  190:ldc1            #80  <Float 216F>
			//   98  192:fload_1         
			//   99  193:fmul            
			//  100  194:fload_3         
			//  101  195:ldc1            #81  <Float 1080F>
			//  102  197:fmul            
			//  103  198:fadd            
			//  104  199:invokevirtual   #82  <Method void MaterialProgressDrawable.setRotation(float)>
			//  105  202:return          
			}

			final MaterialProgressDrawable this$0;
			final Ring val$ring;

			
			{
				this$0 = MaterialProgressDrawable.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MaterialProgressDrawable this$0>
				ring = ring1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field MaterialProgressDrawable$Ring val$ring>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #21  <Method void Animation()>
			//    8   14:return          
			}
		}
;
	//    3    5:new             #8   <Class MaterialProgressDrawable$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #194 <Method void MaterialProgressDrawable$1(MaterialProgressDrawable, MaterialProgressDrawable$Ring)>
	//    8   14:astore_2        
		((Animation) (animation)).setRepeatCount(-1);
	//    9   15:aload_2         
	//   10   16:iconst_m1       
	//   11   17:invokevirtual   #199 <Method void Animation.setRepeatCount(int)>
		((Animation) (animation)).setRepeatMode(1);
	//   12   20:aload_2         
	//   13   21:iconst_1        
	//   14   22:invokevirtual   #202 <Method void Animation.setRepeatMode(int)>
		((Animation) (animation)).setInterpolator(LINEAR_INTERPOLATOR);
	//   15   25:aload_2         
	//   16   26:getstatic       #92  <Field Interpolator LINEAR_INTERPOLATOR>
	//   17   29:invokevirtual   #206 <Method void Animation.setInterpolator(Interpolator)>
		((Animation) (animation)).setAnimationListener(new android.view.animation.Animation.AnimationListener() {

			public void onAnimationEnd(Animation animation1)
			{
			//    0    0:return          
			}

			public void onAnimationRepeat(Animation animation1)
			{
				ring.storeOriginals();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field MaterialProgressDrawable$Ring val$ring>
			//    2    4:invokevirtual   #32  <Method void MaterialProgressDrawable$Ring.storeOriginals()>
				ring.goToNextColor();
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field MaterialProgressDrawable$Ring val$ring>
			//    5   11:invokevirtual   #35  <Method void MaterialProgressDrawable$Ring.goToNextColor()>
				ring.setStartTrim(ring.getEndTrim());
			//    6   14:aload_0         
			//    7   15:getfield        #21  <Field MaterialProgressDrawable$Ring val$ring>
			//    8   18:aload_0         
			//    9   19:getfield        #21  <Field MaterialProgressDrawable$Ring val$ring>
			//   10   22:invokevirtual   #39  <Method float MaterialProgressDrawable$Ring.getEndTrim()>
			//   11   25:invokevirtual   #43  <Method void MaterialProgressDrawable$Ring.setStartTrim(float)>
				if(mFinishing)
			//*  12   28:aload_0         
			//*  13   29:getfield        #19  <Field MaterialProgressDrawable this$0>
			//*  14   32:getfield        #47  <Field boolean MaterialProgressDrawable.mFinishing>
			//*  15   35:ifeq            62
				{
					mFinishing = false;
			//   16   38:aload_0         
			//   17   39:getfield        #19  <Field MaterialProgressDrawable this$0>
			//   18   42:iconst_0        
			//   19   43:putfield        #47  <Field boolean MaterialProgressDrawable.mFinishing>
					animation1.setDuration(1332L);
			//   20   46:aload_1         
			//   21   47:ldc2w           #48  <Long 1332L>
			//   22   50:invokevirtual   #55  <Method void Animation.setDuration(long)>
					ring.setShowArrow(false);
			//   23   53:aload_0         
			//   24   54:getfield        #21  <Field MaterialProgressDrawable$Ring val$ring>
			//   25   57:iconst_0        
			//   26   58:invokevirtual   #59  <Method void MaterialProgressDrawable$Ring.setShowArrow(boolean)>
					return;
			//   27   61:return          
				} else
				{
					mRotationCount = (mRotationCount + 1.0F) % 5F;
			//   28   62:aload_0         
			//   29   63:getfield        #19  <Field MaterialProgressDrawable this$0>
			//   30   66:aload_0         
			//   31   67:getfield        #19  <Field MaterialProgressDrawable this$0>
			//   32   70:getfield        #63  <Field float MaterialProgressDrawable.mRotationCount>
			//   33   73:fconst_1        
			//   34   74:fadd            
			//   35   75:ldc1            #64  <Float 5F>
			//   36   77:frem            
			//   37   78:putfield        #63  <Field float MaterialProgressDrawable.mRotationCount>
					return;
			//   38   81:return          
				}
			}

			public void onAnimationStart(Animation animation1)
			{
				mRotationCount = 0.0F;
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field MaterialProgressDrawable this$0>
			//    2    4:fconst_0        
			//    3    5:putfield        #63  <Field float MaterialProgressDrawable.mRotationCount>
			//    4    8:return          
			}

			final MaterialProgressDrawable this$0;
			final Ring val$ring;

			
			{
				this$0 = MaterialProgressDrawable.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field MaterialProgressDrawable this$0>
				ring = ring1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field MaterialProgressDrawable$Ring val$ring>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   18   32:aload_2         
	//   19   33:new             #10  <Class MaterialProgressDrawable$2>
	//   20   36:dup             
	//   21   37:aload_0         
	//   22   38:aload_1         
	//   23   39:invokespecial   #207 <Method void MaterialProgressDrawable$2(MaterialProgressDrawable, MaterialProgressDrawable$Ring)>
	//   24   42:invokevirtual   #211 <Method void Animation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
		mAnimation = ((Animation) (animation));
	//   25   45:aload_0         
	//   26   46:aload_2         
	//   27   47:putfield        #213 <Field Animation mAnimation>
	//   28   50:return          
	}

	void applyFinishTranslation(float f, Ring ring)
	{
		updateRingColor(f, ring);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #218 <Method void updateRingColor(float, MaterialProgressDrawable$Ring)>
		float f1 = (float)(Math.floor(ring.getStartingRotation() / 0.8F) + 1.0D);
	//    4    6:aload_2         
	//    5    7:invokevirtual   #221 <Method float MaterialProgressDrawable$Ring.getStartingRotation()>
	//    6   10:ldc1            #57  <Float 0.8F>
	//    7   12:fdiv            
	//    8   13:f2d             
	//    9   14:invokestatic    #227 <Method double Math.floor(double)>
	//   10   17:dconst_1        
	//   11   18:dadd            
	//   12   19:d2f             
	//   13   20:fstore_3        
		float f2 = getMinProgressArc(ring);
	//   14   21:aload_0         
	//   15   22:aload_2         
	//   16   23:invokevirtual   #231 <Method float getMinProgressArc(MaterialProgressDrawable$Ring)>
	//   17   26:fstore          4
		ring.setStartTrim(ring.getStartingStartTrim() + (ring.getStartingEndTrim() - f2 - ring.getStartingStartTrim()) * f);
	//   18   28:aload_2         
	//   19   29:aload_2         
	//   20   30:invokevirtual   #234 <Method float MaterialProgressDrawable$Ring.getStartingStartTrim()>
	//   21   33:aload_2         
	//   22   34:invokevirtual   #237 <Method float MaterialProgressDrawable$Ring.getStartingEndTrim()>
	//   23   37:fload           4
	//   24   39:fsub            
	//   25   40:aload_2         
	//   26   41:invokevirtual   #234 <Method float MaterialProgressDrawable$Ring.getStartingStartTrim()>
	//   27   44:fsub            
	//   28   45:fload_1         
	//   29   46:fmul            
	//   30   47:fadd            
	//   31   48:invokevirtual   #240 <Method void MaterialProgressDrawable$Ring.setStartTrim(float)>
		ring.setEndTrim(ring.getStartingEndTrim());
	//   32   51:aload_2         
	//   33   52:aload_2         
	//   34   53:invokevirtual   #237 <Method float MaterialProgressDrawable$Ring.getStartingEndTrim()>
	//   35   56:invokevirtual   #243 <Method void MaterialProgressDrawable$Ring.setEndTrim(float)>
		ring.setRotation(ring.getStartingRotation() + (f1 - ring.getStartingRotation()) * f);
	//   36   59:aload_2         
	//   37   60:aload_2         
	//   38   61:invokevirtual   #221 <Method float MaterialProgressDrawable$Ring.getStartingRotation()>
	//   39   64:fload_3         
	//   40   65:aload_2         
	//   41   66:invokevirtual   #221 <Method float MaterialProgressDrawable$Ring.getStartingRotation()>
	//   42   69:fsub            
	//   43   70:fload_1         
	//   44   71:fmul            
	//   45   72:fadd            
	//   46   73:invokevirtual   #246 <Method void MaterialProgressDrawable$Ring.setRotation(float)>
	//   47   76:return          
	}

	public void draw(Canvas canvas)
	{
		Rect rect = getBounds();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #252 <Method Rect getBounds()>
	//    2    4:astore_3        
		int i = canvas.save();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #257 <Method int Canvas.save()>
	//    5    9:istore_2        
		canvas.rotate(mRotation, rect.exactCenterX(), rect.exactCenterY());
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:getfield        #155 <Field float mRotation>
	//    9   15:aload_3         
	//   10   16:invokevirtual   #262 <Method float Rect.exactCenterX()>
	//   11   19:aload_3         
	//   12   20:invokevirtual   #265 <Method float Rect.exactCenterY()>
	//   13   23:invokevirtual   #269 <Method void Canvas.rotate(float, float, float)>
		mRing.draw(canvas, rect);
	//   14   26:aload_0         
	//   15   27:getfield        #128 <Field MaterialProgressDrawable$Ring mRing>
	//   16   30:aload_1         
	//   17   31:aload_3         
	//   18   32:invokevirtual   #272 <Method void MaterialProgressDrawable$Ring.draw(Canvas, Rect)>
		canvas.restoreToCount(i);
	//   19   35:aload_1         
	//   20   36:iload_2         
	//   21   37:invokevirtual   #275 <Method void Canvas.restoreToCount(int)>
	//   22   40:return          
	}

	public int getAlpha()
	{
		return mRing.getAlpha();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field MaterialProgressDrawable$Ring mRing>
	//    2    4:invokevirtual   #278 <Method int MaterialProgressDrawable$Ring.getAlpha()>
	//    3    7:ireturn         
	}

	public int getIntrinsicHeight()
	{
		return (int)mHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field double mHeight>
	//    2    4:d2i             
	//    3    5:ireturn         
	}

	public int getIntrinsicWidth()
	{
		return (int)mWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #170 <Field double mWidth>
	//    2    4:d2i             
	//    3    5:ireturn         
	}

	float getMinProgressArc(Ring ring)
	{
		return (float)Math.toRadians((double)ring.getStrokeWidth() / (ring.getCenterRadius() * 6.2831853071795862D));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #283 <Method float MaterialProgressDrawable$Ring.getStrokeWidth()>
	//    2    4:f2d             
	//    3    5:aload_1         
	//    4    6:invokevirtual   #287 <Method double MaterialProgressDrawable$Ring.getCenterRadius()>
	//    5    9:ldc2w           #288 <Double 6.2831853071795862D>
	//    6   12:dmul            
	//    7   13:ddiv            
	//    8   14:invokestatic    #292 <Method double Math.toRadians(double)>
	//    9   17:d2f             
	//   10   18:freturn         
	}

	public int getOpacity()
	{
		return -3;
	//    0    0:bipush          -3
	//    1    2:ireturn         
	}

	public boolean isRunning()
	{
		ArrayList arraylist = mAnimators;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field ArrayList mAnimators>
	//    2    4:astore_3        
		int j = arraylist.size();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #298 <Method int ArrayList.size()>
	//    5    9:istore_2        
		for(int i = 0; i < j; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_1        
	//*   8   12:iload_1         
	//*   9   13:iload_2         
	//*  10   14:icmpge          52
		{
			Animation animation = (Animation)arraylist.get(i);
	//   11   17:aload_3         
	//   12   18:iload_1         
	//   13   19:invokevirtual   #302 <Method Object ArrayList.get(int)>
	//   14   22:checkcast       #196 <Class Animation>
	//   15   25:astore          4
			if(animation.hasStarted() && !animation.hasEnded())
	//*  16   27:aload           4
	//*  17   29:invokevirtual   #305 <Method boolean Animation.hasStarted()>
	//*  18   32:ifeq            45
	//*  19   35:aload           4
	//*  20   37:invokevirtual   #308 <Method boolean Animation.hasEnded()>
	//*  21   40:ifne            45
				return true;
	//   22   43:iconst_1        
	//   23   44:ireturn         
		}

	//   24   45:iload_1         
	//   25   46:iconst_1        
	//   26   47:iadd            
	//   27   48:istore_1        
	//*  28   49:goto            12
		return false;
	//   29   52:iconst_0        
	//   30   53:ireturn         
	}

	public void setAlpha(int i)
	{
		mRing.setAlpha(i);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field MaterialProgressDrawable$Ring mRing>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #311 <Method void MaterialProgressDrawable$Ring.setAlpha(int)>
	//    4    8:return          
	}

	public void setArrowScale(float f)
	{
		mRing.setArrowScale(f);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field MaterialProgressDrawable$Ring mRing>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #314 <Method void MaterialProgressDrawable$Ring.setArrowScale(float)>
	//    4    8:return          
	}

	public void setBackgroundColor(int i)
	{
		mRing.setBackgroundColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field MaterialProgressDrawable$Ring mRing>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #317 <Method void MaterialProgressDrawable$Ring.setBackgroundColor(int)>
	//    4    8:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		mRing.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field MaterialProgressDrawable$Ring mRing>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #321 <Method void MaterialProgressDrawable$Ring.setColorFilter(ColorFilter)>
	//    4    8:return          
	}

	public transient void setColorSchemeColors(int ai[])
	{
		mRing.setColors(ai);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field MaterialProgressDrawable$Ring mRing>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #132 <Method void MaterialProgressDrawable$Ring.setColors(int[])>
		mRing.setColorIndex(0);
	//    4    8:aload_0         
	//    5    9:getfield        #128 <Field MaterialProgressDrawable$Ring mRing>
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #183 <Method void MaterialProgressDrawable$Ring.setColorIndex(int)>
	//    8   16:return          
	}

	public void setProgressRotation(float f)
	{
		mRing.setRotation(f);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field MaterialProgressDrawable$Ring mRing>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #246 <Method void MaterialProgressDrawable$Ring.setRotation(float)>
	//    4    8:return          
	}

	void setRotation(float f)
	{
		mRotation = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #155 <Field float mRotation>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #326 <Method void invalidateSelf()>
	//    5    9:return          
	}

	public void setStartEndTrim(float f, float f1)
	{
		mRing.setStartTrim(f);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field MaterialProgressDrawable$Ring mRing>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #240 <Method void MaterialProgressDrawable$Ring.setStartTrim(float)>
		mRing.setEndTrim(f1);
	//    4    8:aload_0         
	//    5    9:getfield        #128 <Field MaterialProgressDrawable$Ring mRing>
	//    6   12:fload_2         
	//    7   13:invokevirtual   #243 <Method void MaterialProgressDrawable$Ring.setEndTrim(float)>
	//    8   16:return          
	}

	public void showArrow(boolean flag)
	{
		mRing.setShowArrow(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field MaterialProgressDrawable$Ring mRing>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #332 <Method void MaterialProgressDrawable$Ring.setShowArrow(boolean)>
	//    4    8:return          
	}

	public void start()
	{
		mAnimation.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #213 <Field Animation mAnimation>
	//    2    4:invokevirtual   #336 <Method void Animation.reset()>
		mRing.storeOriginals();
	//    3    7:aload_0         
	//    4    8:getfield        #128 <Field MaterialProgressDrawable$Ring mRing>
	//    5   11:invokevirtual   #339 <Method void MaterialProgressDrawable$Ring.storeOriginals()>
		if(mRing.getEndTrim() != mRing.getStartTrim())
	//*   6   14:aload_0         
	//*   7   15:getfield        #128 <Field MaterialProgressDrawable$Ring mRing>
	//*   8   18:invokevirtual   #342 <Method float MaterialProgressDrawable$Ring.getEndTrim()>
	//*   9   21:aload_0         
	//*  10   22:getfield        #128 <Field MaterialProgressDrawable$Ring mRing>
	//*  11   25:invokevirtual   #345 <Method float MaterialProgressDrawable$Ring.getStartTrim()>
	//*  12   28:fcmpl           
	//*  13   29:ifeq            59
		{
			mFinishing = true;
	//   14   32:aload_0         
	//   15   33:iconst_1        
	//   16   34:putfield        #347 <Field boolean mFinishing>
			mAnimation.setDuration(666L);
	//   17   37:aload_0         
	//   18   38:getfield        #213 <Field Animation mAnimation>
	//   19   41:ldc2w           #348 <Long 666L>
	//   20   44:invokevirtual   #353 <Method void Animation.setDuration(long)>
			mParent.startAnimation(mAnimation);
	//   21   47:aload_0         
	//   22   48:getfield        #115 <Field View mParent>
	//   23   51:aload_0         
	//   24   52:getfield        #213 <Field Animation mAnimation>
	//   25   55:invokevirtual   #359 <Method void View.startAnimation(Animation)>
			return;
	//   26   58:return          
		} else
		{
			mRing.setColorIndex(0);
	//   27   59:aload_0         
	//   28   60:getfield        #128 <Field MaterialProgressDrawable$Ring mRing>
	//   29   63:iconst_0        
	//   30   64:invokevirtual   #183 <Method void MaterialProgressDrawable$Ring.setColorIndex(int)>
			mRing.resetOriginals();
	//   31   67:aload_0         
	//   32   68:getfield        #128 <Field MaterialProgressDrawable$Ring mRing>
	//   33   71:invokevirtual   #362 <Method void MaterialProgressDrawable$Ring.resetOriginals()>
			mAnimation.setDuration(1332L);
	//   34   74:aload_0         
	//   35   75:getfield        #213 <Field Animation mAnimation>
	//   36   78:ldc2w           #363 <Long 1332L>
	//   37   81:invokevirtual   #353 <Method void Animation.setDuration(long)>
			mParent.startAnimation(mAnimation);
	//   38   84:aload_0         
	//   39   85:getfield        #115 <Field View mParent>
	//   40   88:aload_0         
	//   41   89:getfield        #213 <Field Animation mAnimation>
	//   42   92:invokevirtual   #359 <Method void View.startAnimation(Animation)>
			return;
	//   43   95:return          
		}
	}

	public void stop()
	{
		mParent.clearAnimation();
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field View mParent>
	//    2    4:invokevirtual   #368 <Method void View.clearAnimation()>
		setRotation(0.0F);
	//    3    7:aload_0         
	//    4    8:fconst_0        
	//    5    9:invokevirtual   #369 <Method void setRotation(float)>
		mRing.setShowArrow(false);
	//    6   12:aload_0         
	//    7   13:getfield        #128 <Field MaterialProgressDrawable$Ring mRing>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #332 <Method void MaterialProgressDrawable$Ring.setShowArrow(boolean)>
		mRing.setColorIndex(0);
	//   10   20:aload_0         
	//   11   21:getfield        #128 <Field MaterialProgressDrawable$Ring mRing>
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #183 <Method void MaterialProgressDrawable$Ring.setColorIndex(int)>
		mRing.resetOriginals();
	//   14   28:aload_0         
	//   15   29:getfield        #128 <Field MaterialProgressDrawable$Ring mRing>
	//   16   32:invokevirtual   #362 <Method void MaterialProgressDrawable$Ring.resetOriginals()>
	//   17   35:return          
	}

	void updateRingColor(float f, Ring ring)
	{
		if(f > 0.75F)
	//*   0    0:fload_1         
	//*   1    1:ldc1            #44  <Float 0.75F>
	//*   2    3:fcmpl           
	//*   3    4:ifle            31
			ring.setColor(evaluateColorChange((f - 0.75F) / 0.25F, ring.getStartingColor(), ring.getNextColor()));
	//    4    7:aload_2         
	//    5    8:aload_0         
	//    6    9:fload_1         
	//    7   10:ldc1            #44  <Float 0.75F>
	//    8   12:fsub            
	//    9   13:ldc2            #370 <Float 0.25F>
	//   10   16:fdiv            
	//   11   17:aload_2         
	//   12   18:invokevirtual   #373 <Method int MaterialProgressDrawable$Ring.getStartingColor()>
	//   13   21:aload_2         
	//   14   22:invokevirtual   #376 <Method int MaterialProgressDrawable$Ring.getNextColor()>
	//   15   25:invokespecial   #378 <Method int evaluateColorChange(float, int, int)>
	//   16   28:invokevirtual   #381 <Method void MaterialProgressDrawable$Ring.setColor(int)>
	//   17   31:return          
	}

	public void updateSizes(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            27
		{
			setSizeParameters(56D, 56D, 12.5D, 3D, 12F, 6F);
	//    2    4:aload_0         
	//    3    5:ldc2w           #382 <Double 56D>
	//    4    8:ldc2w           #382 <Double 56D>
	//    5   11:ldc2w           #384 <Double 12.5D>
	//    6   14:ldc2w           #386 <Double 3D>
	//    7   17:ldc2            #388 <Float 12F>
	//    8   20:ldc2            #389 <Float 6F>
	//    9   23:invokespecial   #391 <Method void setSizeParameters(double, double, double, double, float, float)>
			return;
	//   10   26:return          
		} else
		{
			setSizeParameters(40D, 40D, 8.75D, 2.5D, 10F, 5F);
	//   11   27:aload_0         
	//   12   28:ldc2w           #392 <Double 40D>
	//   13   31:ldc2w           #392 <Double 40D>
	//   14   34:ldc2w           #394 <Double 8.75D>
	//   15   37:ldc2w           #396 <Double 2.5D>
	//   16   40:ldc2            #398 <Float 10F>
	//   17   43:ldc1            #28  <Float 5F>
	//   18   45:invokespecial   #391 <Method void setSizeParameters(double, double, double, double, float, float)>
			return;
	//   19   48:return          
		}
	}

	private static final int ANIMATION_DURATION = 1332;
	private static final int ARROW_HEIGHT = 5;
	private static final int ARROW_HEIGHT_LARGE = 6;
	private static final float ARROW_OFFSET_ANGLE = 5F;
	private static final int ARROW_WIDTH = 10;
	private static final int ARROW_WIDTH_LARGE = 12;
	private static final float CENTER_RADIUS = 8.75F;
	private static final float CENTER_RADIUS_LARGE = 12.5F;
	private static final int CIRCLE_DIAMETER = 40;
	private static final int CIRCLE_DIAMETER_LARGE = 56;
	private static final int COLORS[] = {
		0xff000000
	};
	private static final float COLOR_START_DELAY_OFFSET = 0.75F;
	static final int DEFAULT = 1;
	private static final float END_TRIM_START_DELAY_OFFSET = 0.5F;
	private static final float FULL_ROTATION = 1080F;
	static final int LARGE = 0;
	private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
	static final Interpolator MATERIAL_INTERPOLATOR = new FastOutSlowInInterpolator();
	private static final float MAX_PROGRESS_ARC = 0.8F;
	private static final float NUM_POINTS = 5F;
	private static final float START_TRIM_DURATION_OFFSET = 0.5F;
	private static final float STROKE_WIDTH = 2.5F;
	private static final float STROKE_WIDTH_LARGE = 3F;
	private Animation mAnimation;
	private final ArrayList mAnimators = new ArrayList();
	private final android.graphics.drawable.Drawable.Callback mCallback = new android.graphics.drawable.Drawable.Callback() {

		public void invalidateDrawable(Drawable drawable)
		{
			invalidateSelf();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field MaterialProgressDrawable this$0>
		//    2    4:invokevirtual   #23  <Method void MaterialProgressDrawable.invalidateSelf()>
		//    3    7:return          
		}

		public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
		{
			scheduleSelf(runnable, l);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field MaterialProgressDrawable this$0>
		//    2    4:aload_2         
		//    3    5:lload_3         
		//    4    6:invokevirtual   #29  <Method void MaterialProgressDrawable.scheduleSelf(Runnable, long)>
		//    5    9:return          
		}

		public void unscheduleDrawable(Drawable drawable, Runnable runnable)
		{
			unscheduleSelf(runnable);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field MaterialProgressDrawable this$0>
		//    2    4:aload_2         
		//    3    5:invokevirtual   #35  <Method void MaterialProgressDrawable.unscheduleSelf(Runnable)>
		//    4    8:return          
		}

		final MaterialProgressDrawable this$0;

			
			{
				this$0 = MaterialProgressDrawable.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field MaterialProgressDrawable this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	boolean mFinishing;
	private double mHeight;
	private View mParent;
	private Resources mResources;
	private final Ring mRing;
	private float mRotation;
	float mRotationCount;
	private double mWidth;

	static 
	{
	//    0    0:new             #87  <Class LinearInterpolator>
	//    1    3:dup             
	//    2    4:invokespecial   #90  <Method void LinearInterpolator()>
	//    3    7:putstatic       #92  <Field Interpolator LINEAR_INTERPOLATOR>
	//    4   10:new             #94  <Class FastOutSlowInInterpolator>
	//    5   13:dup             
	//    6   14:invokespecial   #95  <Method void FastOutSlowInInterpolator()>
	//    7   17:putstatic       #97  <Field Interpolator MATERIAL_INTERPOLATOR>
	//    8   20:iconst_1        
	//    9   21:newarray        int[]
	//   10   23:dup             
	//   11   24:iconst_0        
	//   12   25:ldc1            #98  <Int 0xff000000>
	//   13   27:iastore         
	//   14   28:putstatic       #100 <Field int[] COLORS>
	//*  15   31:return          
	}
}
