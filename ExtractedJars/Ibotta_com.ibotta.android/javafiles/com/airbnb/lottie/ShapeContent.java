// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.Path;
import java.util.List;

// Referenced classes of package com.airbnb.lottie:
//			PathContent, ShapePath, AnimatableShapeValue, BaseLayer, 
//			BaseKeyframeAnimation, LottieDrawable, Utils, Content, 
//			TrimPathContent

class ShapeContent
	implements BaseKeyframeAnimation.AnimationListener, PathContent
{

	ShapeContent(LottieDrawable lottiedrawable, BaseLayer baselayer, ShapePath shapepath)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #29  <Class Path>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void Path()>
	//    6   12:putfield        #32  <Field Path path>
		name = shapepath.getName();
	//    7   15:aload_0         
	//    8   16:aload_3         
	//    9   17:invokevirtual   #38  <Method String ShapePath.getName()>
	//   10   20:putfield        #40  <Field String name>
		lottieDrawable = lottiedrawable;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #42  <Field LottieDrawable lottieDrawable>
		shapeAnimation = shapepath.getShapePath().createAnimation();
	//   14   28:aload_0         
	//   15   29:aload_3         
	//   16   30:invokevirtual   #46  <Method AnimatableShapeValue ShapePath.getShapePath()>
	//   17   33:invokevirtual   #52  <Method BaseKeyframeAnimation AnimatableShapeValue.createAnimation()>
	//   18   36:putfield        #54  <Field BaseKeyframeAnimation shapeAnimation>
		baselayer.addAnimation(shapeAnimation);
	//   19   39:aload_2         
	//   20   40:aload_0         
	//   21   41:getfield        #54  <Field BaseKeyframeAnimation shapeAnimation>
	//   22   44:invokevirtual   #60  <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		shapeAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//   23   47:aload_0         
	//   24   48:getfield        #54  <Field BaseKeyframeAnimation shapeAnimation>
	//   25   51:aload_0         
	//   26   52:invokevirtual   #66  <Method void BaseKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
	//   27   55:return          
	}

	private void invalidate()
	{
		isPathValid = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #70  <Field boolean isPathValid>
		lottieDrawable.invalidateSelf();
	//    3    5:aload_0         
	//    4    6:getfield        #42  <Field LottieDrawable lottieDrawable>
	//    5    9:invokevirtual   #75  <Method void LottieDrawable.invalidateSelf()>
	//    6   12:return          
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String name>
	//    2    4:areturn         
	}

	public Path getPath()
	{
		if(isPathValid)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field boolean isPathValid>
	//*   2    4:ifeq            12
		{
			return path;
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field Path path>
	//    5   11:areturn         
		} else
		{
			path.reset();
	//    6   12:aload_0         
	//    7   13:getfield        #32  <Field Path path>
	//    8   16:invokevirtual   #80  <Method void Path.reset()>
			path.set((Path)shapeAnimation.getValue());
	//    9   19:aload_0         
	//   10   20:getfield        #32  <Field Path path>
	//   11   23:aload_0         
	//   12   24:getfield        #54  <Field BaseKeyframeAnimation shapeAnimation>
	//   13   27:invokevirtual   #84  <Method Object BaseKeyframeAnimation.getValue()>
	//   14   30:checkcast       #29  <Class Path>
	//   15   33:invokevirtual   #88  <Method void Path.set(Path)>
			path.setFillType(android.graphics.Path.FillType.EVEN_ODD);
	//   16   36:aload_0         
	//   17   37:getfield        #32  <Field Path path>
	//   18   40:getstatic       #94  <Field android.graphics.Path$FillType android.graphics.Path$FillType.EVEN_ODD>
	//   19   43:invokevirtual   #98  <Method void Path.setFillType(android.graphics.Path$FillType)>
			Utils.applyTrimPathIfNeeded(path, trimPath);
	//   20   46:aload_0         
	//   21   47:getfield        #32  <Field Path path>
	//   22   50:aload_0         
	//   23   51:getfield        #100 <Field TrimPathContent trimPath>
	//   24   54:invokestatic    #106 <Method void Utils.applyTrimPathIfNeeded(Path, TrimPathContent)>
			isPathValid = true;
	//   25   57:aload_0         
	//   26   58:iconst_1        
	//   27   59:putfield        #70  <Field boolean isPathValid>
			return path;
	//   28   62:aload_0         
	//   29   63:getfield        #32  <Field Path path>
	//   30   66:areturn         
		}
	}

	public void onValueChanged()
	{
		invalidate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #109 <Method void invalidate()>
	//    2    4:return          
	}

	public void setContents(List list, List list1)
	{
		for(int i = 0; i < list.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_1         
	//*   4    4:invokeinterface #117 <Method int List.size()>
	//*   5    9:icmpge          65
		{
			list1 = ((List) ((Content)list.get(i)));
	//    6   12:aload_1         
	//    7   13:iload_3         
	//    8   14:invokeinterface #121 <Method Object List.get(int)>
	//    9   19:checkcast       #123 <Class Content>
	//   10   22:astore_2        
			if(!(list1 instanceof TrimPathContent))
				continue;
	//   11   23:aload_2         
	//   12   24:instanceof      #125 <Class TrimPathContent>
	//   13   27:ifeq            58
			list1 = ((List) ((TrimPathContent)list1));
	//   14   30:aload_2         
	//   15   31:checkcast       #125 <Class TrimPathContent>
	//   16   34:astore_2        
			if(((TrimPathContent) (list1)).getType() == ShapeTrimPath.Type.Simultaneously)
	//*  17   35:aload_2         
	//*  18   36:invokevirtual   #129 <Method ShapeTrimPath$Type TrimPathContent.getType()>
	//*  19   39:getstatic       #135 <Field ShapeTrimPath$Type ShapeTrimPath$Type.Simultaneously>
	//*  20   42:if_acmpne       58
			{
				trimPath = ((TrimPathContent) (list1));
	//   21   45:aload_0         
	//   22   46:aload_2         
	//   23   47:putfield        #100 <Field TrimPathContent trimPath>
				trimPath.addListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//   24   50:aload_0         
	//   25   51:getfield        #100 <Field TrimPathContent trimPath>
	//   26   54:aload_0         
	//   27   55:invokevirtual   #138 <Method void TrimPathContent.addListener(BaseKeyframeAnimation$AnimationListener)>
			}
		}

	//   28   58:iload_3         
	//   29   59:iconst_1        
	//   30   60:iadd            
	//   31   61:istore_3        
	//*  32   62:goto            2
	//   33   65:return          
	}

	private boolean isPathValid;
	private final LottieDrawable lottieDrawable;
	private final String name;
	private final Path path = new Path();
	private final BaseKeyframeAnimation shapeAnimation;
	private TrimPathContent trimPath;
}
