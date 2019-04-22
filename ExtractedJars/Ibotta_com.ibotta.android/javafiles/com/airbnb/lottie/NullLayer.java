// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.*;

// Referenced classes of package com.airbnb.lottie:
//			BaseLayer, LottieDrawable, Layer

class NullLayer extends BaseLayer
{

	NullLayer(LottieDrawable lottiedrawable, Layer layer)
	{
		super(lottiedrawable, layer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #8   <Method void BaseLayer(LottieDrawable, Layer)>
	//    4    6:return          
	}

	void drawLayer(Canvas canvas, Matrix matrix, int i)
	{
	//    0    0:return          
	}

	public void getBounds(RectF rectf, Matrix matrix)
	{
		super.getBounds(rectf, matrix);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void BaseLayer.getBounds(RectF, Matrix)>
		rectf.set(0.0F, 0.0F, 0.0F, 0.0F);
	//    4    6:aload_1         
	//    5    7:fconst_0        
	//    6    8:fconst_0        
	//    7    9:fconst_0        
	//    8   10:fconst_0        
	//    9   11:invokevirtual   #21  <Method void RectF.set(float, float, float, float)>
	//   10   14:return          
	}
}
