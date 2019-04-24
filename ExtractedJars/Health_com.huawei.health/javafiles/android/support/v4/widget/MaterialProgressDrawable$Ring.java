// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.graphics.*;

// Referenced classes of package android.support.v4.widget:
//			MaterialProgressDrawable

static class MaterialProgressDrawable$Ring
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
		mCallback.invalidateDrawable(((android.graphics.drawable.Drawable) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field android.graphics.drawable.Drawable$Callback mCallback>
	//    2    4:aconst_null     
	//    3    5:invokeinterface #193 <Method void android.graphics.drawable.Drawable$Callback.invalidateDrawable(android.graphics.drawable.Drawable)>
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

	MaterialProgressDrawable$Ring(android.graphics.drawable.Drawable.Callback callback)
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
