// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.graphics.*;

// Referenced classes of package android.support.v4.widget:
//			CircularProgressDrawable

private static class CircularProgressDrawable$Ring
{

	void draw(Canvas canvas, Rect rect)
	{
		RectF rectf = mTempBounds;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field RectF mTempBounds>
	//    2    4:astore          6
		float f = mRingCenterRadius + mStrokeWidth / 2.0F;
	//    3    6:aload_0         
	//    4    7:getfield        #102 <Field float mRingCenterRadius>
	//    5   10:aload_0         
	//    6   11:getfield        #62  <Field float mStrokeWidth>
	//    7   14:fconst_2        
	//    8   15:fdiv            
	//    9   16:fadd            
	//   10   17:fstore_3        
		if(mRingCenterRadius <= 0.0F)
	//*  11   18:aload_0         
	//*  12   19:getfield        #102 <Field float mRingCenterRadius>
	//*  13   22:fconst_0        
	//*  14   23:fcmpg           
	//*  15   24:ifgt            64
			f = (float)Math.min(rect.width(), rect.height()) / 2.0F - Math.max(((float)mArrowWidth * mArrowScale) / 2.0F, mStrokeWidth / 2.0F);
	//   16   27:aload_2         
	//   17   28:invokevirtual   #108 <Method int Rect.width()>
	//   18   31:aload_2         
	//   19   32:invokevirtual   #111 <Method int Rect.height()>
	//   20   35:invokestatic    #117 <Method int Math.min(int, int)>
	//   21   38:i2f             
	//   22   39:fconst_2        
	//   23   40:fdiv            
	//   24   41:aload_0         
	//   25   42:getfield        #119 <Field int mArrowWidth>
	//   26   45:i2f             
	//   27   46:aload_0         
	//   28   47:getfield        #64  <Field float mArrowScale>
	//   29   50:fmul            
	//   30   51:fconst_2        
	//   31   52:fdiv            
	//   32   53:aload_0         
	//   33   54:getfield        #62  <Field float mStrokeWidth>
	//   34   57:fconst_2        
	//   35   58:fdiv            
	//   36   59:invokestatic    #123 <Method float Math.max(float, float)>
	//   37   62:fsub            
	//   38   63:fstore_3        
		rectf.set((float)rect.centerX() - f, (float)rect.centerY() - f, (float)rect.centerX() + f, (float)rect.centerY() + f);
	//   39   64:aload           6
	//   40   66:aload_2         
	//   41   67:invokevirtual   #126 <Method int Rect.centerX()>
	//   42   70:i2f             
	//   43   71:fload_3         
	//   44   72:fsub            
	//   45   73:aload_2         
	//   46   74:invokevirtual   #129 <Method int Rect.centerY()>
	//   47   77:i2f             
	//   48   78:fload_3         
	//   49   79:fsub            
	//   50   80:aload_2         
	//   51   81:invokevirtual   #126 <Method int Rect.centerX()>
	//   52   84:i2f             
	//   53   85:fload_3         
	//   54   86:fadd            
	//   55   87:aload_2         
	//   56   88:invokevirtual   #129 <Method int Rect.centerY()>
	//   57   91:i2f             
	//   58   92:fload_3         
	//   59   93:fadd            
	//   60   94:invokevirtual   #133 <Method void RectF.set(float, float, float, float)>
		f = (mStartTrim + mRotation) * 360F;
	//   61   97:aload_0         
	//   62   98:getfield        #55  <Field float mStartTrim>
	//   63  101:aload_0         
	//   64  102:getfield        #59  <Field float mRotation>
	//   65  105:fadd            
	//   66  106:ldc1            #134 <Float 360F>
	//   67  108:fmul            
	//   68  109:fstore_3        
		float f1 = (mEndTrim + mRotation) * 360F - f;
	//   69  110:aload_0         
	//   70  111:getfield        #57  <Field float mEndTrim>
	//   71  114:aload_0         
	//   72  115:getfield        #59  <Field float mRotation>
	//   73  118:fadd            
	//   74  119:ldc1            #134 <Float 360F>
	//   75  121:fmul            
	//   76  122:fload_3         
	//   77  123:fsub            
	//   78  124:fstore          4
		mPaint.setColor(mCurrentColor);
	//   79  126:aload_0         
	//   80  127:getfield        #49  <Field Paint mPaint>
	//   81  130:aload_0         
	//   82  131:getfield        #136 <Field int mCurrentColor>
	//   83  134:invokevirtual   #97  <Method void Paint.setColor(int)>
		mPaint.setAlpha(mAlpha);
	//   84  137:aload_0         
	//   85  138:getfield        #49  <Field Paint mPaint>
	//   86  141:aload_0         
	//   87  142:getfield        #66  <Field int mAlpha>
	//   88  145:invokevirtual   #139 <Method void Paint.setAlpha(int)>
		float f2 = mStrokeWidth / 2.0F;
	//   89  148:aload_0         
	//   90  149:getfield        #62  <Field float mStrokeWidth>
	//   91  152:fconst_2        
	//   92  153:fdiv            
	//   93  154:fstore          5
		rectf.inset(f2, f2);
	//   94  156:aload           6
	//   95  158:fload           5
	//   96  160:fload           5
	//   97  162:invokevirtual   #143 <Method void RectF.inset(float, float)>
		canvas.drawCircle(rectf.centerX(), rectf.centerY(), rectf.width() / 2.0F, mCirclePaint);
	//   98  165:aload_1         
	//   99  166:aload           6
	//  100  168:invokevirtual   #146 <Method float RectF.centerX()>
	//  101  171:aload           6
	//  102  173:invokevirtual   #148 <Method float RectF.centerY()>
	//  103  176:aload           6
	//  104  178:invokevirtual   #150 <Method float RectF.width()>
	//  105  181:fconst_2        
	//  106  182:fdiv            
	//  107  183:aload_0         
	//  108  184:getfield        #53  <Field Paint mCirclePaint>
	//  109  187:invokevirtual   #156 <Method void Canvas.drawCircle(float, float, float, Paint)>
		rectf.inset(-f2, -f2);
	//  110  190:aload           6
	//  111  192:fload           5
	//  112  194:fneg            
	//  113  195:fload           5
	//  114  197:fneg            
	//  115  198:invokevirtual   #143 <Method void RectF.inset(float, float)>
		canvas.drawArc(rectf, f, f1, false, mPaint);
	//  116  201:aload_1         
	//  117  202:aload           6
	//  118  204:fload_3         
	//  119  205:fload           4
	//  120  207:iconst_0        
	//  121  208:aload_0         
	//  122  209:getfield        #49  <Field Paint mPaint>
	//  123  212:invokevirtual   #160 <Method void Canvas.drawArc(RectF, float, float, boolean, Paint)>
		drawTriangle(canvas, f, f1, rectf);
	//  124  215:aload_0         
	//  125  216:aload_1         
	//  126  217:fload_3         
	//  127  218:fload           4
	//  128  220:aload           6
	//  129  222:invokevirtual   #164 <Method void drawTriangle(Canvas, float, float, RectF)>
	//  130  225:return          
	}

	void drawTriangle(Canvas canvas, float f, float f1, RectF rectf)
	{
		if(mShowArrow)
	//*   0    0:aload_0         
	//*   1    1:getfield        #166 <Field boolean mShowArrow>
	//*   2    4:ifeq            219
		{
			float f2;
			float f3;
			if(mArrow == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #168 <Field Path mArrow>
	//*   5   11:ifnonnull       220
			{
				mArrow = new Path();
	//    6   14:aload_0         
	//    7   15:new             #170 <Class Path>
	//    8   18:dup             
	//    9   19:invokespecial   #171 <Method void Path()>
	//   10   22:putfield        #168 <Field Path mArrow>
				mArrow.setFillType(android.graphics.Path.FillType.EVEN_ODD);
	//   11   25:aload_0         
	//   12   26:getfield        #168 <Field Path mArrow>
	//   13   29:getstatic       #177 <Field android.graphics.Path$FillType android.graphics.Path$FillType.EVEN_ODD>
	//   14   32:invokevirtual   #181 <Method void Path.setFillType(android.graphics.Path$FillType)>
			} else
	//*  15   35:aload           4
	//*  16   37:invokevirtual   #150 <Method float RectF.width()>
	//*  17   40:aload           4
	//*  18   42:invokevirtual   #183 <Method float RectF.height()>
	//*  19   45:invokestatic    #185 <Method float Math.min(float, float)>
	//*  20   48:fconst_2        
	//*  21   49:fdiv            
	//*  22   50:fstore          5
	//*  23   52:aload_0         
	//*  24   53:getfield        #119 <Field int mArrowWidth>
	//*  25   56:i2f             
	//*  26   57:aload_0         
	//*  27   58:getfield        #64  <Field float mArrowScale>
	//*  28   61:fmul            
	//*  29   62:fconst_2        
	//*  30   63:fdiv            
	//*  31   64:fstore          6
	//*  32   66:aload_0         
	//*  33   67:getfield        #168 <Field Path mArrow>
	//*  34   70:fconst_0        
	//*  35   71:fconst_0        
	//*  36   72:invokevirtual   #188 <Method void Path.moveTo(float, float)>
	//*  37   75:aload_0         
	//*  38   76:getfield        #168 <Field Path mArrow>
	//*  39   79:aload_0         
	//*  40   80:getfield        #119 <Field int mArrowWidth>
	//*  41   83:i2f             
	//*  42   84:aload_0         
	//*  43   85:getfield        #64  <Field float mArrowScale>
	//*  44   88:fmul            
	//*  45   89:fconst_0        
	//*  46   90:invokevirtual   #191 <Method void Path.lineTo(float, float)>
	//*  47   93:aload_0         
	//*  48   94:getfield        #168 <Field Path mArrow>
	//*  49   97:aload_0         
	//*  50   98:getfield        #119 <Field int mArrowWidth>
	//*  51  101:i2f             
	//*  52  102:aload_0         
	//*  53  103:getfield        #64  <Field float mArrowScale>
	//*  54  106:fmul            
	//*  55  107:fconst_2        
	//*  56  108:fdiv            
	//*  57  109:aload_0         
	//*  58  110:getfield        #193 <Field int mArrowHeight>
	//*  59  113:i2f             
	//*  60  114:aload_0         
	//*  61  115:getfield        #64  <Field float mArrowScale>
	//*  62  118:fmul            
	//*  63  119:invokevirtual   #191 <Method void Path.lineTo(float, float)>
	//*  64  122:aload_0         
	//*  65  123:getfield        #168 <Field Path mArrow>
	//*  66  126:aload           4
	//*  67  128:invokevirtual   #146 <Method float RectF.centerX()>
	//*  68  131:fload           5
	//*  69  133:fadd            
	//*  70  134:fload           6
	//*  71  136:fsub            
	//*  72  137:aload           4
	//*  73  139:invokevirtual   #148 <Method float RectF.centerY()>
	//*  74  142:aload_0         
	//*  75  143:getfield        #62  <Field float mStrokeWidth>
	//*  76  146:fconst_2        
	//*  77  147:fdiv            
	//*  78  148:fadd            
	//*  79  149:invokevirtual   #196 <Method void Path.offset(float, float)>
	//*  80  152:aload_0         
	//*  81  153:getfield        #168 <Field Path mArrow>
	//*  82  156:invokevirtual   #199 <Method void Path.close()>
	//*  83  159:aload_0         
	//*  84  160:getfield        #51  <Field Paint mArrowPaint>
	//*  85  163:aload_0         
	//*  86  164:getfield        #136 <Field int mCurrentColor>
	//*  87  167:invokevirtual   #97  <Method void Paint.setColor(int)>
	//*  88  170:aload_0         
	//*  89  171:getfield        #51  <Field Paint mArrowPaint>
	//*  90  174:aload_0         
	//*  91  175:getfield        #66  <Field int mAlpha>
	//*  92  178:invokevirtual   #139 <Method void Paint.setAlpha(int)>
	//*  93  181:aload_1         
	//*  94  182:invokevirtual   #202 <Method int Canvas.save()>
	//*  95  185:pop             
	//*  96  186:aload_1         
	//*  97  187:fload_2         
	//*  98  188:fload_3         
	//*  99  189:fadd            
	//* 100  190:aload           4
	//* 101  192:invokevirtual   #146 <Method float RectF.centerX()>
	//* 102  195:aload           4
	//* 103  197:invokevirtual   #148 <Method float RectF.centerY()>
	//* 104  200:invokevirtual   #206 <Method void Canvas.rotate(float, float, float)>
	//* 105  203:aload_1         
	//* 106  204:aload_0         
	//* 107  205:getfield        #168 <Field Path mArrow>
	//* 108  208:aload_0         
	//* 109  209:getfield        #51  <Field Paint mArrowPaint>
	//* 110  212:invokevirtual   #210 <Method void Canvas.drawPath(Path, Paint)>
	//* 111  215:aload_1         
	//* 112  216:invokevirtual   #213 <Method void Canvas.restore()>
	//* 113  219:return          
			{
				mArrow.reset();
	//  114  220:aload_0         
	//  115  221:getfield        #168 <Field Path mArrow>
	//  116  224:invokevirtual   #216 <Method void Path.reset()>
			}
			f2 = Math.min(rectf.width(), rectf.height()) / 2.0F;
			f3 = ((float)mArrowWidth * mArrowScale) / 2.0F;
			mArrow.moveTo(0.0F, 0.0F);
			mArrow.lineTo((float)mArrowWidth * mArrowScale, 0.0F);
			mArrow.lineTo(((float)mArrowWidth * mArrowScale) / 2.0F, (float)mArrowHeight * mArrowScale);
			mArrow.offset((rectf.centerX() + f2) - f3, rectf.centerY() + mStrokeWidth / 2.0F);
			mArrow.close();
			mArrowPaint.setColor(mCurrentColor);
			mArrowPaint.setAlpha(mAlpha);
			canvas.save();
			canvas.rotate(f + f1, rectf.centerX(), rectf.centerY());
			canvas.drawPath(mArrow, mArrowPaint);
			canvas.restore();
		}
	//* 117  227:goto            35
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
	//    1    1:getfield        #193 <Field int mArrowHeight>
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
	//    7    9:putfield        #193 <Field int mArrowHeight>
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

	CircularProgressDrawable$Ring()
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
