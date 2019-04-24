// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.utils;

import android.graphics.*;
import android.view.View;

// Referenced classes of package com.github.mikephil.charting.utils:
//			Utils

public class ViewPortHandler
{

	public ViewPortHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #29  <Class Matrix>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void Matrix()>
	//    6   12:putfield        #32  <Field Matrix mMatrixTouch>
		mContentRect = new RectF();
	//    7   15:aload_0         
	//    8   16:new             #34  <Class RectF>
	//    9   19:dup             
	//   10   20:invokespecial   #35  <Method void RectF()>
	//   11   23:putfield        #37  <Field RectF mContentRect>
		mChartWidth = 0.0F;
	//   12   26:aload_0         
	//   13   27:fconst_0        
	//   14   28:putfield        #39  <Field float mChartWidth>
		mChartHeight = 0.0F;
	//   15   31:aload_0         
	//   16   32:fconst_0        
	//   17   33:putfield        #41  <Field float mChartHeight>
		mMinScaleY = 1.0F;
	//   18   36:aload_0         
	//   19   37:fconst_1        
	//   20   38:putfield        #43  <Field float mMinScaleY>
		mMaxScaleY = 3.402823E+38F;
	//   21   41:aload_0         
	//   22   42:ldc1            #44  <Float 3.402823E+38F>
	//   23   44:putfield        #46  <Field float mMaxScaleY>
		mMinScaleX = 1.0F;
	//   24   47:aload_0         
	//   25   48:fconst_1        
	//   26   49:putfield        #48  <Field float mMinScaleX>
		mMaxScaleX = 3.402823E+38F;
	//   27   52:aload_0         
	//   28   53:ldc1            #44  <Float 3.402823E+38F>
	//   29   55:putfield        #50  <Field float mMaxScaleX>
		mScaleX = 1.0F;
	//   30   58:aload_0         
	//   31   59:fconst_1        
	//   32   60:putfield        #52  <Field float mScaleX>
		mScaleY = 1.0F;
	//   33   63:aload_0         
	//   34   64:fconst_1        
	//   35   65:putfield        #54  <Field float mScaleY>
		mTransX = 0.0F;
	//   36   68:aload_0         
	//   37   69:fconst_0        
	//   38   70:putfield        #56  <Field float mTransX>
		mTransY = 0.0F;
	//   39   73:aload_0         
	//   40   74:fconst_0        
	//   41   75:putfield        #58  <Field float mTransY>
		mTransOffsetX = 0.0F;
	//   42   78:aload_0         
	//   43   79:fconst_0        
	//   44   80:putfield        #60  <Field float mTransOffsetX>
		mTransOffsetY = 0.0F;
	//   45   83:aload_0         
	//   46   84:fconst_0        
	//   47   85:putfield        #62  <Field float mTransOffsetY>
	//   48   88:aload_0         
	//   49   89:bipush          9
	//   50   91:newarray        float[]
	//   51   93:putfield        #64  <Field float[] matrixBuffer>
	//   52   96:return          
	}

	public boolean canZoomInMoreX()
	{
		return mScaleX < mMaxScaleX;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field float mScaleX>
	//    2    4:aload_0         
	//    3    5:getfield        #50  <Field float mMaxScaleX>
	//    4    8:fcmpg           
	//    5    9:ifge            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean canZoomOutMoreX()
	{
		return mScaleX > mMinScaleX;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field float mScaleX>
	//    2    4:aload_0         
	//    3    5:getfield        #48  <Field float mMinScaleX>
	//    4    8:fcmpl           
	//    5    9:ifle            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public void centerViewPort(float af[], View view)
	{
		Matrix matrix = new Matrix();
	//    0    0:new             #29  <Class Matrix>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void Matrix()>
	//    3    7:astore          7
		matrix.set(mMatrixTouch);
	//    4    9:aload           7
	//    5   11:aload_0         
	//    6   12:getfield        #32  <Field Matrix mMatrixTouch>
	//    7   15:invokevirtual   #74  <Method void Matrix.set(Matrix)>
		float f = af[0];
	//    8   18:aload_1         
	//    9   19:iconst_0        
	//   10   20:faload          
	//   11   21:fstore_3        
		float f1 = offsetLeft();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #78  <Method float offsetLeft()>
	//   14   26:fstore          4
		float f2 = af[1];
	//   15   28:aload_1         
	//   16   29:iconst_1        
	//   17   30:faload          
	//   18   31:fstore          5
		float f3 = offsetTop();
	//   19   33:aload_0         
	//   20   34:invokevirtual   #81  <Method float offsetTop()>
	//   21   37:fstore          6
		matrix.postTranslate(-(f - f1), -(f2 - f3));
	//   22   39:aload           7
	//   23   41:fload_3         
	//   24   42:fload           4
	//   25   44:fsub            
	//   26   45:fneg            
	//   27   46:fload           5
	//   28   48:fload           6
	//   29   50:fsub            
	//   30   51:fneg            
	//   31   52:invokevirtual   #85  <Method boolean Matrix.postTranslate(float, float)>
	//   32   55:pop             
		refresh(matrix, view, true);
	//   33   56:aload_0         
	//   34   57:aload           7
	//   35   59:aload_2         
	//   36   60:iconst_1        
	//   37   61:invokevirtual   #89  <Method Matrix refresh(Matrix, View, boolean)>
	//   38   64:pop             
	//   39   65:return          
	}

	public float contentBottom()
	{
		return mContentRect.bottom;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field RectF mContentRect>
	//    2    4:getfield        #93  <Field float RectF.bottom>
	//    3    7:freturn         
	}

	public float contentHeight()
	{
		return mContentRect.height();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field RectF mContentRect>
	//    2    4:invokevirtual   #97  <Method float RectF.height()>
	//    3    7:freturn         
	}

	public float contentLeft()
	{
		return mContentRect.left;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field RectF mContentRect>
	//    2    4:getfield        #101 <Field float RectF.left>
	//    3    7:freturn         
	}

	public float contentRight()
	{
		return mContentRect.right;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field RectF mContentRect>
	//    2    4:getfield        #105 <Field float RectF.right>
	//    3    7:freturn         
	}

	public float contentTop()
	{
		return mContentRect.top;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field RectF mContentRect>
	//    2    4:getfield        #109 <Field float RectF.top>
	//    3    7:freturn         
	}

	public float contentWidth()
	{
		return mContentRect.width();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field RectF mContentRect>
	//    2    4:invokevirtual   #113 <Method float RectF.width()>
	//    3    7:freturn         
	}

	public Matrix fitScreen()
	{
		mMinScaleX = 1.0F;
	//    0    0:aload_0         
	//    1    1:fconst_1        
	//    2    2:putfield        #48  <Field float mMinScaleX>
		mMinScaleY = 1.0F;
	//    3    5:aload_0         
	//    4    6:fconst_1        
	//    5    7:putfield        #43  <Field float mMinScaleY>
		Matrix matrix = new Matrix();
	//    6   10:new             #29  <Class Matrix>
	//    7   13:dup             
	//    8   14:invokespecial   #30  <Method void Matrix()>
	//    9   17:astore_1        
		matrix.set(mMatrixTouch);
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #32  <Field Matrix mMatrixTouch>
	//   13   23:invokevirtual   #74  <Method void Matrix.set(Matrix)>
		float af[] = new float[9];
	//   14   26:bipush          9
	//   15   28:newarray        float[]
	//   16   30:astore_2        
		matrix.getValues(af);
	//   17   31:aload_1         
	//   18   32:aload_2         
	//   19   33:invokevirtual   #119 <Method void Matrix.getValues(float[])>
		af[2] = 0.0F;
	//   20   36:aload_2         
	//   21   37:iconst_2        
	//   22   38:fconst_0        
	//   23   39:fastore         
		af[5] = 0.0F;
	//   24   40:aload_2         
	//   25   41:iconst_5        
	//   26   42:fconst_0        
	//   27   43:fastore         
		af[0] = 1.0F;
	//   28   44:aload_2         
	//   29   45:iconst_0        
	//   30   46:fconst_1        
	//   31   47:fastore         
		af[4] = 1.0F;
	//   32   48:aload_2         
	//   33   49:iconst_4        
	//   34   50:fconst_1        
	//   35   51:fastore         
		matrix.setValues(af);
	//   36   52:aload_1         
	//   37   53:aload_2         
	//   38   54:invokevirtual   #122 <Method void Matrix.setValues(float[])>
		return matrix;
	//   39   57:aload_1         
	//   40   58:areturn         
	}

	public float getChartHeight()
	{
		return mChartHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field float mChartHeight>
	//    2    4:freturn         
	}

	public float getChartWidth()
	{
		return mChartWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field float mChartWidth>
	//    2    4:freturn         
	}

	public PointF getContentCenter()
	{
		return new PointF(mContentRect.centerX(), mContentRect.centerY());
	//    0    0:new             #128 <Class PointF>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field RectF mContentRect>
	//    4    8:invokevirtual   #131 <Method float RectF.centerX()>
	//    5   11:aload_0         
	//    6   12:getfield        #37  <Field RectF mContentRect>
	//    7   15:invokevirtual   #134 <Method float RectF.centerY()>
	//    8   18:invokespecial   #137 <Method void PointF(float, float)>
	//    9   21:areturn         
	}

	public RectF getContentRect()
	{
		return mContentRect;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field RectF mContentRect>
	//    2    4:areturn         
	}

	public Matrix getMatrixTouch()
	{
		return mMatrixTouch;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Matrix mMatrixTouch>
	//    2    4:areturn         
	}

	public float getScaleX()
	{
		return mScaleX;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field float mScaleX>
	//    2    4:freturn         
	}

	public float getScaleY()
	{
		return mScaleY;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field float mScaleY>
	//    2    4:freturn         
	}

	public float getTransX()
	{
		return mTransX;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field float mTransX>
	//    2    4:freturn         
	}

	public float getTransY()
	{
		return mTransY;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field float mTransY>
	//    2    4:freturn         
	}

	public boolean hasChartDimens()
	{
		return mChartHeight > 0.0F && mChartWidth > 0.0F;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field float mChartHeight>
	//    2    4:fconst_0        
	//    3    5:fcmpl           
	//    4    6:ifle            20
	//    5    9:aload_0         
	//    6   10:getfield        #39  <Field float mChartWidth>
	//    7   13:fconst_0        
	//    8   14:fcmpl           
	//    9   15:ifle            20
	//   10   18:iconst_1        
	//   11   19:ireturn         
	//   12   20:iconst_0        
	//   13   21:ireturn         
	}

	public boolean hasNoDragOffset()
	{
		return mTransOffsetX <= 0.0F && mTransOffsetY <= 0.0F;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field float mTransOffsetX>
	//    2    4:fconst_0        
	//    3    5:fcmpg           
	//    4    6:ifgt            20
	//    5    9:aload_0         
	//    6   10:getfield        #62  <Field float mTransOffsetY>
	//    7   13:fconst_0        
	//    8   14:fcmpg           
	//    9   15:ifgt            20
	//   10   18:iconst_1        
	//   11   19:ireturn         
	//   12   20:iconst_0        
	//   13   21:ireturn         
	}

	public boolean isFullyZoomedOut()
	{
		return isFullyZoomedOutX() && isFullyZoomedOutY();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #150 <Method boolean isFullyZoomedOutX()>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:invokevirtual   #153 <Method boolean isFullyZoomedOutY()>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean isFullyZoomedOutX()
	{
		return mScaleX <= mMinScaleX && mMinScaleX <= 1.0F;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field float mScaleX>
	//    2    4:aload_0         
	//    3    5:getfield        #48  <Field float mMinScaleX>
	//    4    8:fcmpl           
	//    5    9:ifgt            21
	//    6   12:aload_0         
	//    7   13:getfield        #48  <Field float mMinScaleX>
	//    8   16:fconst_1        
	//    9   17:fcmpl           
	//   10   18:ifle            23
	//   11   21:iconst_0        
	//   12   22:ireturn         
	//   13   23:iconst_1        
	//   14   24:ireturn         
	}

	public boolean isFullyZoomedOutY()
	{
		return mScaleY <= mMinScaleY && mMinScaleY <= 1.0F;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field float mScaleY>
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field float mMinScaleY>
	//    4    8:fcmpl           
	//    5    9:ifgt            21
	//    6   12:aload_0         
	//    7   13:getfield        #43  <Field float mMinScaleY>
	//    8   16:fconst_1        
	//    9   17:fcmpl           
	//   10   18:ifle            23
	//   11   21:iconst_0        
	//   12   22:ireturn         
	//   13   23:iconst_1        
	//   14   24:ireturn         
	}

	public boolean isInBounds(float f, float f1)
	{
		return isInBoundsX(f) && isInBoundsY(f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #158 <Method boolean isInBoundsX(float)>
	//    3    5:ifeq            18
	//    4    8:aload_0         
	//    5    9:fload_2         
	//    6   10:invokevirtual   #161 <Method boolean isInBoundsY(float)>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public boolean isInBoundsBottom(float f)
	{
		f = (float)(int)(f * 100F) / 100F;
	//    0    0:fload_1         
	//    1    1:ldc1            #163 <Float 100F>
	//    2    3:fmul            
	//    3    4:f2i             
	//    4    5:i2f             
	//    5    6:ldc1            #163 <Float 100F>
	//    6    8:fdiv            
	//    7    9:fstore_1        
		return mContentRect.bottom >= f;
	//    8   10:aload_0         
	//    9   11:getfield        #37  <Field RectF mContentRect>
	//   10   14:getfield        #93  <Field float RectF.bottom>
	//   11   17:fload_1         
	//   12   18:fcmpl           
	//   13   19:iflt            24
	//   14   22:iconst_1        
	//   15   23:ireturn         
	//   16   24:iconst_0        
	//   17   25:ireturn         
	}

	public boolean isInBoundsLeft(float f)
	{
		return mContentRect.left <= f;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field RectF mContentRect>
	//    2    4:getfield        #101 <Field float RectF.left>
	//    3    7:fload_1         
	//    4    8:fcmpg           
	//    5    9:ifgt            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean isInBoundsRight(float f)
	{
		f = (float)(int)(f * 100F) / 100F;
	//    0    0:fload_1         
	//    1    1:ldc1            #163 <Float 100F>
	//    2    3:fmul            
	//    3    4:f2i             
	//    4    5:i2f             
	//    5    6:ldc1            #163 <Float 100F>
	//    6    8:fdiv            
	//    7    9:fstore_1        
		return mContentRect.right >= f;
	//    8   10:aload_0         
	//    9   11:getfield        #37  <Field RectF mContentRect>
	//   10   14:getfield        #105 <Field float RectF.right>
	//   11   17:fload_1         
	//   12   18:fcmpl           
	//   13   19:iflt            24
	//   14   22:iconst_1        
	//   15   23:ireturn         
	//   16   24:iconst_0        
	//   17   25:ireturn         
	}

	public boolean isInBoundsTop(float f)
	{
		return mContentRect.top <= f;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field RectF mContentRect>
	//    2    4:getfield        #109 <Field float RectF.top>
	//    3    7:fload_1         
	//    4    8:fcmpg           
	//    5    9:ifgt            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean isInBoundsX(float f)
	{
		return isInBoundsLeft(f) && isInBoundsRight(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #168 <Method boolean isInBoundsLeft(float)>
	//    3    5:ifeq            18
	//    4    8:aload_0         
	//    5    9:fload_1         
	//    6   10:invokevirtual   #170 <Method boolean isInBoundsRight(float)>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public boolean isInBoundsY(float f)
	{
		return isInBoundsTop(f) && isInBoundsBottom(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #172 <Method boolean isInBoundsTop(float)>
	//    3    5:ifeq            18
	//    4    8:aload_0         
	//    5    9:fload_1         
	//    6   10:invokevirtual   #174 <Method boolean isInBoundsBottom(float)>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public void limitTransAndScale(Matrix matrix, RectF rectf)
	{
		matrix.getValues(matrixBuffer);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #64  <Field float[] matrixBuffer>
	//    3    5:invokevirtual   #119 <Method void Matrix.getValues(float[])>
		float f3 = matrixBuffer[2];
	//    4    8:aload_0         
	//    5    9:getfield        #64  <Field float[] matrixBuffer>
	//    6   12:iconst_2        
	//    7   13:faload          
	//    8   14:fstore          6
		float f = matrixBuffer[0];
	//    9   16:aload_0         
	//   10   17:getfield        #64  <Field float[] matrixBuffer>
	//   11   20:iconst_0        
	//   12   21:faload          
	//   13   22:fstore_3        
		float f2 = matrixBuffer[5];
	//   14   23:aload_0         
	//   15   24:getfield        #64  <Field float[] matrixBuffer>
	//   16   27:iconst_5        
	//   17   28:faload          
	//   18   29:fstore          5
		float f1 = matrixBuffer[4];
	//   19   31:aload_0         
	//   20   32:getfield        #64  <Field float[] matrixBuffer>
	//   21   35:iconst_4        
	//   22   36:faload          
	//   23   37:fstore          4
		mScaleX = Math.min(Math.max(mMinScaleX, f), mMaxScaleX);
	//   24   39:aload_0         
	//   25   40:aload_0         
	//   26   41:getfield        #48  <Field float mMinScaleX>
	//   27   44:fload_3         
	//   28   45:invokestatic    #182 <Method float Math.max(float, float)>
	//   29   48:aload_0         
	//   30   49:getfield        #50  <Field float mMaxScaleX>
	//   31   52:invokestatic    #185 <Method float Math.min(float, float)>
	//   32   55:putfield        #52  <Field float mScaleX>
		mScaleY = Math.min(Math.max(mMinScaleY, f1), mMaxScaleY);
	//   33   58:aload_0         
	//   34   59:aload_0         
	//   35   60:getfield        #43  <Field float mMinScaleY>
	//   36   63:fload           4
	//   37   65:invokestatic    #182 <Method float Math.max(float, float)>
	//   38   68:aload_0         
	//   39   69:getfield        #46  <Field float mMaxScaleY>
	//   40   72:invokestatic    #185 <Method float Math.min(float, float)>
	//   41   75:putfield        #54  <Field float mScaleY>
		f1 = 0.0F;
	//   42   78:fconst_0        
	//   43   79:fstore          4
		f = 0.0F;
	//   44   81:fconst_0        
	//   45   82:fstore_3        
		if(rectf != null)
	//*  46   83:aload_2         
	//*  47   84:ifnull          98
		{
			f1 = rectf.width();
	//   48   87:aload_2         
	//   49   88:invokevirtual   #113 <Method float RectF.width()>
	//   50   91:fstore          4
			f = rectf.height();
	//   51   93:aload_2         
	//   52   94:invokevirtual   #97  <Method float RectF.height()>
	//   53   97:fstore_3        
		}
		mTransX = Math.min(Math.max(f3, -f1 * (mScaleX - 1.0F) - mTransOffsetX), mTransOffsetX);
	//   54   98:aload_0         
	//   55   99:fload           6
	//   56  101:fload           4
	//   57  103:fneg            
	//   58  104:aload_0         
	//   59  105:getfield        #52  <Field float mScaleX>
	//   60  108:fconst_1        
	//   61  109:fsub            
	//   62  110:fmul            
	//   63  111:aload_0         
	//   64  112:getfield        #60  <Field float mTransOffsetX>
	//   65  115:fsub            
	//   66  116:invokestatic    #182 <Method float Math.max(float, float)>
	//   67  119:aload_0         
	//   68  120:getfield        #60  <Field float mTransOffsetX>
	//   69  123:invokestatic    #185 <Method float Math.min(float, float)>
	//   70  126:putfield        #56  <Field float mTransX>
		f1 = mScaleY;
	//   71  129:aload_0         
	//   72  130:getfield        #54  <Field float mScaleY>
	//   73  133:fstore          4
		mTransY = Math.max(Math.min(f2, mTransOffsetY + f * (f1 - 1.0F)), -mTransOffsetY);
	//   74  135:aload_0         
	//   75  136:fload           5
	//   76  138:aload_0         
	//   77  139:getfield        #62  <Field float mTransOffsetY>
	//   78  142:fload_3         
	//   79  143:fload           4
	//   80  145:fconst_1        
	//   81  146:fsub            
	//   82  147:fmul            
	//   83  148:fadd            
	//   84  149:invokestatic    #185 <Method float Math.min(float, float)>
	//   85  152:aload_0         
	//   86  153:getfield        #62  <Field float mTransOffsetY>
	//   87  156:fneg            
	//   88  157:invokestatic    #182 <Method float Math.max(float, float)>
	//   89  160:putfield        #58  <Field float mTransY>
		matrixBuffer[2] = mTransX;
	//   90  163:aload_0         
	//   91  164:getfield        #64  <Field float[] matrixBuffer>
	//   92  167:iconst_2        
	//   93  168:aload_0         
	//   94  169:getfield        #56  <Field float mTransX>
	//   95  172:fastore         
		matrixBuffer[0] = mScaleX;
	//   96  173:aload_0         
	//   97  174:getfield        #64  <Field float[] matrixBuffer>
	//   98  177:iconst_0        
	//   99  178:aload_0         
	//  100  179:getfield        #52  <Field float mScaleX>
	//  101  182:fastore         
		matrixBuffer[5] = mTransY;
	//  102  183:aload_0         
	//  103  184:getfield        #64  <Field float[] matrixBuffer>
	//  104  187:iconst_5        
	//  105  188:aload_0         
	//  106  189:getfield        #58  <Field float mTransY>
	//  107  192:fastore         
		matrixBuffer[4] = mScaleY;
	//  108  193:aload_0         
	//  109  194:getfield        #64  <Field float[] matrixBuffer>
	//  110  197:iconst_4        
	//  111  198:aload_0         
	//  112  199:getfield        #54  <Field float mScaleY>
	//  113  202:fastore         
		matrix.setValues(matrixBuffer);
	//  114  203:aload_1         
	//  115  204:aload_0         
	//  116  205:getfield        #64  <Field float[] matrixBuffer>
	//  117  208:invokevirtual   #122 <Method void Matrix.setValues(float[])>
	//  118  211:return          
	}

	public float offsetBottom()
	{
		return mChartHeight - mContentRect.bottom;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field float mChartHeight>
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field RectF mContentRect>
	//    4    8:getfield        #93  <Field float RectF.bottom>
	//    5   11:fsub            
	//    6   12:freturn         
	}

	public float offsetLeft()
	{
		return mContentRect.left;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field RectF mContentRect>
	//    2    4:getfield        #101 <Field float RectF.left>
	//    3    7:freturn         
	}

	public float offsetRight()
	{
		return mChartWidth - mContentRect.right;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field float mChartWidth>
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field RectF mContentRect>
	//    4    8:getfield        #105 <Field float RectF.right>
	//    5   11:fsub            
	//    6   12:freturn         
	}

	public float offsetTop()
	{
		return mContentRect.top;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field RectF mContentRect>
	//    2    4:getfield        #109 <Field float RectF.top>
	//    3    7:freturn         
	}

	public Matrix refresh(Matrix matrix, View view, boolean flag)
	{
		mMatrixTouch.set(matrix);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Matrix mMatrixTouch>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #74  <Method void Matrix.set(Matrix)>
		limitTransAndScale(mMatrixTouch, mContentRect);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field Matrix mMatrixTouch>
	//    7   13:aload_0         
	//    8   14:getfield        #37  <Field RectF mContentRect>
	//    9   17:invokevirtual   #189 <Method void limitTransAndScale(Matrix, RectF)>
		if(flag)
	//*  10   20:iload_3         
	//*  11   21:ifeq            28
			view.invalidate();
	//   12   24:aload_2         
	//   13   25:invokevirtual   #194 <Method void View.invalidate()>
		matrix.set(mMatrixTouch);
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #32  <Field Matrix mMatrixTouch>
	//   17   33:invokevirtual   #74  <Method void Matrix.set(Matrix)>
		return matrix;
	//   18   36:aload_1         
	//   19   37:areturn         
	}

	public void restrainViewPort(float f, float f1, float f2, float f3)
	{
		mContentRect.set(f, f1, mChartWidth - f2, mChartHeight - f3);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field RectF mContentRect>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:aload_0         
	//    5    7:getfield        #39  <Field float mChartWidth>
	//    6   10:fload_3         
	//    7   11:fsub            
	//    8   12:aload_0         
	//    9   13:getfield        #41  <Field float mChartHeight>
	//   10   16:fload           4
	//   11   18:fsub            
	//   12   19:invokevirtual   #198 <Method void RectF.set(float, float, float, float)>
	//   13   22:return          
	}

	public void setChartDimens(float f, float f1)
	{
		float f2 = offsetLeft();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #78  <Method float offsetLeft()>
	//    2    4:fstore_3        
		float f3 = offsetTop();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #81  <Method float offsetTop()>
	//    5    9:fstore          4
		float f4 = offsetRight();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #201 <Method float offsetRight()>
	//    8   15:fstore          5
		float f5 = offsetBottom();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #203 <Method float offsetBottom()>
	//   11   21:fstore          6
		mChartHeight = f1;
	//   12   23:aload_0         
	//   13   24:fload_2         
	//   14   25:putfield        #41  <Field float mChartHeight>
		mChartWidth = f;
	//   15   28:aload_0         
	//   16   29:fload_1         
	//   17   30:putfield        #39  <Field float mChartWidth>
		restrainViewPort(f2, f3, f4, f5);
	//   18   33:aload_0         
	//   19   34:fload_3         
	//   20   35:fload           4
	//   21   37:fload           5
	//   22   39:fload           6
	//   23   41:invokevirtual   #205 <Method void restrainViewPort(float, float, float, float)>
	//   24   44:return          
	}

	public void setDragOffsetX(float f)
	{
		mTransOffsetX = Utils.convertDpToPixel(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #213 <Method float Utils.convertDpToPixel(float)>
	//    3    5:putfield        #60  <Field float mTransOffsetX>
	//    4    8:return          
	}

	public void setDragOffsetY(float f)
	{
		mTransOffsetY = Utils.convertDpToPixel(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #213 <Method float Utils.convertDpToPixel(float)>
	//    3    5:putfield        #62  <Field float mTransOffsetY>
	//    4    8:return          
	}

	public void setMaximumScaleX(float f)
	{
		mMaxScaleX = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #50  <Field float mMaxScaleX>
		limitTransAndScale(mMatrixTouch, mContentRect);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #32  <Field Matrix mMatrixTouch>
	//    6   10:aload_0         
	//    7   11:getfield        #37  <Field RectF mContentRect>
	//    8   14:invokevirtual   #189 <Method void limitTransAndScale(Matrix, RectF)>
	//    9   17:return          
	}

	public void setMaximumScaleY(float f)
	{
		mMaxScaleY = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #46  <Field float mMaxScaleY>
		limitTransAndScale(mMatrixTouch, mContentRect);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #32  <Field Matrix mMatrixTouch>
	//    6   10:aload_0         
	//    7   11:getfield        #37  <Field RectF mContentRect>
	//    8   14:invokevirtual   #189 <Method void limitTransAndScale(Matrix, RectF)>
	//    9   17:return          
	}

	public void setMinMaxScaleX(float f, float f1)
	{
		float f2 = f;
	//    0    0:fload_1         
	//    1    1:fstore_3        
		if(f < 1.0F)
	//*   2    2:fload_1         
	//*   3    3:fconst_1        
	//*   4    4:fcmpg           
	//*   5    5:ifge            10
			f2 = 1.0F;
	//    6    8:fconst_1        
	//    7    9:fstore_3        
		mMinScaleX = f2;
	//    8   10:aload_0         
	//    9   11:fload_3         
	//   10   12:putfield        #48  <Field float mMinScaleX>
		mMaxScaleX = f1;
	//   11   15:aload_0         
	//   12   16:fload_2         
	//   13   17:putfield        #50  <Field float mMaxScaleX>
		limitTransAndScale(mMatrixTouch, mContentRect);
	//   14   20:aload_0         
	//   15   21:aload_0         
	//   16   22:getfield        #32  <Field Matrix mMatrixTouch>
	//   17   25:aload_0         
	//   18   26:getfield        #37  <Field RectF mContentRect>
	//   19   29:invokevirtual   #189 <Method void limitTransAndScale(Matrix, RectF)>
	//   20   32:return          
	}

	public void setMinimumScaleX(float f)
	{
		float f1 = f;
	//    0    0:fload_1         
	//    1    1:fstore_2        
		if(f < 1.0F)
	//*   2    2:fload_1         
	//*   3    3:fconst_1        
	//*   4    4:fcmpg           
	//*   5    5:ifge            10
			f1 = 1.0F;
	//    6    8:fconst_1        
	//    7    9:fstore_2        
		mMinScaleX = f1;
	//    8   10:aload_0         
	//    9   11:fload_2         
	//   10   12:putfield        #48  <Field float mMinScaleX>
		limitTransAndScale(mMatrixTouch, mContentRect);
	//   11   15:aload_0         
	//   12   16:aload_0         
	//   13   17:getfield        #32  <Field Matrix mMatrixTouch>
	//   14   20:aload_0         
	//   15   21:getfield        #37  <Field RectF mContentRect>
	//   16   24:invokevirtual   #189 <Method void limitTransAndScale(Matrix, RectF)>
	//   17   27:return          
	}

	public void setMinimumScaleY(float f)
	{
		float f1 = f;
	//    0    0:fload_1         
	//    1    1:fstore_2        
		if(f < 1.0F)
	//*   2    2:fload_1         
	//*   3    3:fconst_1        
	//*   4    4:fcmpg           
	//*   5    5:ifge            10
			f1 = 1.0F;
	//    6    8:fconst_1        
	//    7    9:fstore_2        
		mMinScaleY = f1;
	//    8   10:aload_0         
	//    9   11:fload_2         
	//   10   12:putfield        #43  <Field float mMinScaleY>
		limitTransAndScale(mMatrixTouch, mContentRect);
	//   11   15:aload_0         
	//   12   16:aload_0         
	//   13   17:getfield        #32  <Field Matrix mMatrixTouch>
	//   14   20:aload_0         
	//   15   21:getfield        #37  <Field RectF mContentRect>
	//   16   24:invokevirtual   #189 <Method void limitTransAndScale(Matrix, RectF)>
	//   17   27:return          
	}

	public Matrix setZoom(float f, float f1)
	{
		Matrix matrix = new Matrix();
	//    0    0:new             #29  <Class Matrix>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void Matrix()>
	//    3    7:astore_3        
		matrix.set(mMatrixTouch);
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field Matrix mMatrixTouch>
	//    7   13:invokevirtual   #74  <Method void Matrix.set(Matrix)>
		matrix.setScale(f, f1);
	//    8   16:aload_3         
	//    9   17:fload_1         
	//   10   18:fload_2         
	//   11   19:invokevirtual   #224 <Method void Matrix.setScale(float, float)>
		return matrix;
	//   12   22:aload_3         
	//   13   23:areturn         
	}

	public Matrix setZoom(float f, float f1, float f2, float f3)
	{
		Matrix matrix = new Matrix();
	//    0    0:new             #29  <Class Matrix>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void Matrix()>
	//    3    7:astore          5
		matrix.set(mMatrixTouch);
	//    4    9:aload           5
	//    5   11:aload_0         
	//    6   12:getfield        #32  <Field Matrix mMatrixTouch>
	//    7   15:invokevirtual   #74  <Method void Matrix.set(Matrix)>
		matrix.setScale(f, f1, f2, f3);
	//    8   18:aload           5
	//    9   20:fload_1         
	//   10   21:fload_2         
	//   11   22:fload_3         
	//   12   23:fload           4
	//   13   25:invokevirtual   #227 <Method void Matrix.setScale(float, float, float, float)>
		return matrix;
	//   14   28:aload           5
	//   15   30:areturn         
	}

	public Matrix translate(float af[])
	{
		Matrix matrix = new Matrix();
	//    0    0:new             #29  <Class Matrix>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void Matrix()>
	//    3    7:astore          6
		matrix.set(mMatrixTouch);
	//    4    9:aload           6
	//    5   11:aload_0         
	//    6   12:getfield        #32  <Field Matrix mMatrixTouch>
	//    7   15:invokevirtual   #74  <Method void Matrix.set(Matrix)>
		float f = af[0];
	//    8   18:aload_1         
	//    9   19:iconst_0        
	//   10   20:faload          
	//   11   21:fstore_2        
		float f1 = offsetLeft();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #78  <Method float offsetLeft()>
	//   14   26:fstore_3        
		float f2 = af[1];
	//   15   27:aload_1         
	//   16   28:iconst_1        
	//   17   29:faload          
	//   18   30:fstore          4
		float f3 = offsetTop();
	//   19   32:aload_0         
	//   20   33:invokevirtual   #81  <Method float offsetTop()>
	//   21   36:fstore          5
		matrix.postTranslate(-(f - f1), -(f2 - f3));
	//   22   38:aload           6
	//   23   40:fload_2         
	//   24   41:fload_3         
	//   25   42:fsub            
	//   26   43:fneg            
	//   27   44:fload           4
	//   28   46:fload           5
	//   29   48:fsub            
	//   30   49:fneg            
	//   31   50:invokevirtual   #85  <Method boolean Matrix.postTranslate(float, float)>
	//   32   53:pop             
		return matrix;
	//   33   54:aload           6
	//   34   56:areturn         
	}

	public Matrix zoom(float f, float f1)
	{
		Matrix matrix = new Matrix();
	//    0    0:new             #29  <Class Matrix>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void Matrix()>
	//    3    7:astore_3        
		matrix.set(mMatrixTouch);
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field Matrix mMatrixTouch>
	//    7   13:invokevirtual   #74  <Method void Matrix.set(Matrix)>
		matrix.postScale(f, f1);
	//    8   16:aload_3         
	//    9   17:fload_1         
	//   10   18:fload_2         
	//   11   19:invokevirtual   #233 <Method boolean Matrix.postScale(float, float)>
	//   12   22:pop             
		return matrix;
	//   13   23:aload_3         
	//   14   24:areturn         
	}

	public Matrix zoom(float f, float f1, float f2, float f3)
	{
		Matrix matrix = new Matrix();
	//    0    0:new             #29  <Class Matrix>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void Matrix()>
	//    3    7:astore          5
		matrix.set(mMatrixTouch);
	//    4    9:aload           5
	//    5   11:aload_0         
	//    6   12:getfield        #32  <Field Matrix mMatrixTouch>
	//    7   15:invokevirtual   #74  <Method void Matrix.set(Matrix)>
		matrix.postScale(f, f1, f2, f3);
	//    8   18:aload           5
	//    9   20:fload_1         
	//   10   21:fload_2         
	//   11   22:fload_3         
	//   12   23:fload           4
	//   13   25:invokevirtual   #236 <Method boolean Matrix.postScale(float, float, float, float)>
	//   14   28:pop             
		return matrix;
	//   15   29:aload           5
	//   16   31:areturn         
	}

	public Matrix zoomIn(float f, float f1)
	{
		Matrix matrix = new Matrix();
	//    0    0:new             #29  <Class Matrix>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void Matrix()>
	//    3    7:astore_3        
		matrix.set(mMatrixTouch);
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field Matrix mMatrixTouch>
	//    7   13:invokevirtual   #74  <Method void Matrix.set(Matrix)>
		matrix.postScale(1.4F, 1.4F, f, f1);
	//    8   16:aload_3         
	//    9   17:ldc1            #238 <Float 1.4F>
	//   10   19:ldc1            #238 <Float 1.4F>
	//   11   21:fload_1         
	//   12   22:fload_2         
	//   13   23:invokevirtual   #236 <Method boolean Matrix.postScale(float, float, float, float)>
	//   14   26:pop             
		return matrix;
	//   15   27:aload_3         
	//   16   28:areturn         
	}

	public Matrix zoomOut(float f, float f1)
	{
		Matrix matrix = new Matrix();
	//    0    0:new             #29  <Class Matrix>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void Matrix()>
	//    3    7:astore_3        
		matrix.set(mMatrixTouch);
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field Matrix mMatrixTouch>
	//    7   13:invokevirtual   #74  <Method void Matrix.set(Matrix)>
		matrix.postScale(0.7F, 0.7F, f, f1);
	//    8   16:aload_3         
	//    9   17:ldc1            #240 <Float 0.7F>
	//   10   19:ldc1            #240 <Float 0.7F>
	//   11   21:fload_1         
	//   12   22:fload_2         
	//   13   23:invokevirtual   #236 <Method boolean Matrix.postScale(float, float, float, float)>
	//   14   26:pop             
		return matrix;
	//   15   27:aload_3         
	//   16   28:areturn         
	}

	protected float mChartHeight;
	protected float mChartWidth;
	protected RectF mContentRect;
	protected final Matrix mMatrixTouch = new Matrix();
	private float mMaxScaleX;
	private float mMaxScaleY;
	private float mMinScaleX;
	private float mMinScaleY;
	private float mScaleX;
	private float mScaleY;
	private float mTransOffsetX;
	private float mTransOffsetY;
	private float mTransX;
	private float mTransY;
	protected final float matrixBuffer[] = new float[9];
}
