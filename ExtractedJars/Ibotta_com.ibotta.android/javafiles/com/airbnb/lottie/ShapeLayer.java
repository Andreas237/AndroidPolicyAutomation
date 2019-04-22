// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.*;
import java.util.Collections;

// Referenced classes of package com.airbnb.lottie:
//			BaseLayer, ContentGroup, ShapeGroup, Layer, 
//			LottieDrawable

class ShapeLayer extends BaseLayer
{

	ShapeLayer(LottieDrawable lottiedrawable, Layer layer)
	{
		super(lottiedrawable, layer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void BaseLayer(LottieDrawable, Layer)>
	//    4    6:aload_0         
	//    5    7:new             #14  <Class Matrix>
	//    6   10:dup             
	//    7   11:invokespecial   #17  <Method void Matrix()>
	//    8   14:putfield        #19  <Field Matrix matrix>
		contentGroup = new ContentGroup(lottiedrawable, ((BaseLayer) (this)), new ShapeGroup(layer.getName(), layer.getShapes()));
	//    9   17:aload_0         
	//   10   18:new             #21  <Class ContentGroup>
	//   11   21:dup             
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:new             #23  <Class ShapeGroup>
	//   15   27:dup             
	//   16   28:aload_2         
	//   17   29:invokevirtual   #29  <Method String Layer.getName()>
	//   18   32:aload_2         
	//   19   33:invokevirtual   #33  <Method java.util.List Layer.getShapes()>
	//   20   36:invokespecial   #36  <Method void ShapeGroup(String, java.util.List)>
	//   21   39:invokespecial   #39  <Method void ContentGroup(LottieDrawable, BaseLayer, ShapeGroup)>
	//   22   42:putfield        #41  <Field ContentGroup contentGroup>
		contentGroup.setContents(Collections.emptyList(), Collections.emptyList());
	//   23   45:aload_0         
	//   24   46:getfield        #41  <Field ContentGroup contentGroup>
	//   25   49:invokestatic    #46  <Method java.util.List Collections.emptyList()>
	//   26   52:invokestatic    #46  <Method java.util.List Collections.emptyList()>
	//   27   55:invokevirtual   #50  <Method void ContentGroup.setContents(java.util.List, java.util.List)>
	//   28   58:return          
	}

	public void addColorFilter(String s, String s1, ColorFilter colorfilter)
	{
		contentGroup.addColorFilter(s, s1, colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field ContentGroup contentGroup>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #56  <Method void ContentGroup.addColorFilter(String, String, ColorFilter)>
	//    6   10:return          
	}

	void drawLayer(Canvas canvas, Matrix matrix1, int i)
	{
		contentGroup.draw(canvas, matrix1, i);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field ContentGroup contentGroup>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #63  <Method void ContentGroup.draw(Canvas, Matrix, int)>
	//    6   10:return          
	}

	public void getBounds(RectF rectf, Matrix matrix1)
	{
		super.getBounds(rectf, matrix1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #67  <Method void BaseLayer.getBounds(RectF, Matrix)>
		contentGroup.getBounds(rectf, boundsMatrix);
	//    4    6:aload_0         
	//    5    7:getfield        #41  <Field ContentGroup contentGroup>
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:getfield        #70  <Field Matrix boundsMatrix>
	//    9   15:invokevirtual   #71  <Method void ContentGroup.getBounds(RectF, Matrix)>
	//   10   18:return          
	}

	private final ContentGroup contentGroup;
	private final Matrix matrix = new Matrix();
}
