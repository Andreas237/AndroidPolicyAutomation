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
