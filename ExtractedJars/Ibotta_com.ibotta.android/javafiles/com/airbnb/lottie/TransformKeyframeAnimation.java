// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.Matrix;
import android.graphics.PointF;

// Referenced classes of package com.airbnb.lottie:
//			AnimatableTransform, AnimatablePathValue, AnimatableValue, AnimatableScaleValue, 
//			AnimatableFloatValue, AnimatableIntegerValue, BaseLayer, BaseKeyframeAnimation, 
//			ScaleXY

class TransformKeyframeAnimation
{

	TransformKeyframeAnimation(AnimatableTransform animatabletransform)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class Matrix>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void Matrix()>
	//    6   12:putfield        #26  <Field Matrix matrix>
		anchorPoint = animatabletransform.getAnchorPoint().createAnimation();
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #32  <Method AnimatablePathValue AnimatableTransform.getAnchorPoint()>
	//   10   20:invokevirtual   #38  <Method BaseKeyframeAnimation AnimatablePathValue.createAnimation()>
	//   11   23:putfield        #40  <Field BaseKeyframeAnimation anchorPoint>
		position = animatabletransform.getPosition().createAnimation();
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokevirtual   #44  <Method AnimatableValue AnimatableTransform.getPosition()>
	//   15   31:invokeinterface #47  <Method BaseKeyframeAnimation AnimatableValue.createAnimation()>
	//   16   36:putfield        #49  <Field BaseKeyframeAnimation position>
		scale = ((BaseKeyframeAnimation) (animatabletransform.getScale().createAnimation()));
	//   17   39:aload_0         
	//   18   40:aload_1         
	//   19   41:invokevirtual   #53  <Method AnimatableScaleValue AnimatableTransform.getScale()>
	//   20   44:invokevirtual   #58  <Method KeyframeAnimation AnimatableScaleValue.createAnimation()>
	//   21   47:putfield        #60  <Field BaseKeyframeAnimation scale>
		rotation = ((BaseKeyframeAnimation) (animatabletransform.getRotation().createAnimation()));
	//   22   50:aload_0         
	//   23   51:aload_1         
	//   24   52:invokevirtual   #64  <Method AnimatableFloatValue AnimatableTransform.getRotation()>
	//   25   55:invokevirtual   #67  <Method KeyframeAnimation AnimatableFloatValue.createAnimation()>
	//   26   58:putfield        #69  <Field BaseKeyframeAnimation rotation>
		opacity = ((BaseKeyframeAnimation) (animatabletransform.getOpacity().createAnimation()));
	//   27   61:aload_0         
	//   28   62:aload_1         
	//   29   63:invokevirtual   #73  <Method AnimatableIntegerValue AnimatableTransform.getOpacity()>
	//   30   66:invokevirtual   #76  <Method KeyframeAnimation AnimatableIntegerValue.createAnimation()>
	//   31   69:putfield        #78  <Field BaseKeyframeAnimation opacity>
	//   32   72:return          
	}

	void addAnimationsToLayer(BaseLayer baselayer)
	{
		baselayer.addAnimation(anchorPoint);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field BaseKeyframeAnimation anchorPoint>
	//    3    5:invokevirtual   #87  <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		baselayer.addAnimation(position);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #49  <Field BaseKeyframeAnimation position>
	//    7   13:invokevirtual   #87  <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		baselayer.addAnimation(scale);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #60  <Field BaseKeyframeAnimation scale>
	//   11   21:invokevirtual   #87  <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		baselayer.addAnimation(rotation);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #69  <Field BaseKeyframeAnimation rotation>
	//   15   29:invokevirtual   #87  <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		baselayer.addAnimation(opacity);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #78  <Field BaseKeyframeAnimation opacity>
	//   19   37:invokevirtual   #87  <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
	//   20   40:return          
	}

	void addListener(BaseKeyframeAnimation.AnimationListener animationlistener)
	{
		anchorPoint.addUpdateListener(animationlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field BaseKeyframeAnimation anchorPoint>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #94  <Method void BaseKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
		position.addUpdateListener(animationlistener);
	//    4    8:aload_0         
	//    5    9:getfield        #49  <Field BaseKeyframeAnimation position>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #94  <Method void BaseKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
		scale.addUpdateListener(animationlistener);
	//    8   16:aload_0         
	//    9   17:getfield        #60  <Field BaseKeyframeAnimation scale>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #94  <Method void BaseKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
		rotation.addUpdateListener(animationlistener);
	//   12   24:aload_0         
	//   13   25:getfield        #69  <Field BaseKeyframeAnimation rotation>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #94  <Method void BaseKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
		opacity.addUpdateListener(animationlistener);
	//   16   32:aload_0         
	//   17   33:getfield        #78  <Field BaseKeyframeAnimation opacity>
	//   18   36:aload_1         
	//   19   37:invokevirtual   #94  <Method void BaseKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
	//   20   40:return          
	}

	Matrix getMatrix()
	{
		matrix.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Matrix matrix>
	//    2    4:invokevirtual   #99  <Method void Matrix.reset()>
		Object obj = ((Object) ((PointF)position.getValue()));
	//    3    7:aload_0         
	//    4    8:getfield        #49  <Field BaseKeyframeAnimation position>
	//    5   11:invokevirtual   #103 <Method Object BaseKeyframeAnimation.getValue()>
	//    6   14:checkcast       #105 <Class PointF>
	//    7   17:astore_2        
		if(((PointF) (obj)).x != 0.0F || ((PointF) (obj)).y != 0.0F)
	//*   8   18:aload_2         
	//*   9   19:getfield        #109 <Field float PointF.x>
	//*  10   22:fconst_0        
	//*  11   23:fcmpl           
	//*  12   24:ifne            36
	//*  13   27:aload_2         
	//*  14   28:getfield        #112 <Field float PointF.y>
	//*  15   31:fconst_0        
	//*  16   32:fcmpl           
	//*  17   33:ifeq            52
			matrix.preTranslate(((PointF) (obj)).x, ((PointF) (obj)).y);
	//   18   36:aload_0         
	//   19   37:getfield        #26  <Field Matrix matrix>
	//   20   40:aload_2         
	//   21   41:getfield        #109 <Field float PointF.x>
	//   22   44:aload_2         
	//   23   45:getfield        #112 <Field float PointF.y>
	//   24   48:invokevirtual   #116 <Method boolean Matrix.preTranslate(float, float)>
	//   25   51:pop             
		float f = ((Float)rotation.getValue()).floatValue();
	//   26   52:aload_0         
	//   27   53:getfield        #69  <Field BaseKeyframeAnimation rotation>
	//   28   56:invokevirtual   #103 <Method Object BaseKeyframeAnimation.getValue()>
	//   29   59:checkcast       #118 <Class Float>
	//   30   62:invokevirtual   #122 <Method float Float.floatValue()>
	//   31   65:fstore_1        
		if(f != 0.0F)
	//*  32   66:fload_1         
	//*  33   67:fconst_0        
	//*  34   68:fcmpl           
	//*  35   69:ifeq            81
			matrix.preRotate(f);
	//   36   72:aload_0         
	//   37   73:getfield        #26  <Field Matrix matrix>
	//   38   76:fload_1         
	//   39   77:invokevirtual   #126 <Method boolean Matrix.preRotate(float)>
	//   40   80:pop             
		obj = ((Object) ((ScaleXY)scale.getValue()));
	//   41   81:aload_0         
	//   42   82:getfield        #60  <Field BaseKeyframeAnimation scale>
	//   43   85:invokevirtual   #103 <Method Object BaseKeyframeAnimation.getValue()>
	//   44   88:checkcast       #128 <Class ScaleXY>
	//   45   91:astore_2        
		if(((ScaleXY) (obj)).getScaleX() != 1.0F || ((ScaleXY) (obj)).getScaleY() != 1.0F)
	//*  46   92:aload_2         
	//*  47   93:invokevirtual   #131 <Method float ScaleXY.getScaleX()>
	//*  48   96:fconst_1        
	//*  49   97:fcmpl           
	//*  50   98:ifne            110
	//*  51  101:aload_2         
	//*  52  102:invokevirtual   #134 <Method float ScaleXY.getScaleY()>
	//*  53  105:fconst_1        
	//*  54  106:fcmpl           
	//*  55  107:ifeq            126
			matrix.preScale(((ScaleXY) (obj)).getScaleX(), ((ScaleXY) (obj)).getScaleY());
	//   56  110:aload_0         
	//   57  111:getfield        #26  <Field Matrix matrix>
	//   58  114:aload_2         
	//   59  115:invokevirtual   #131 <Method float ScaleXY.getScaleX()>
	//   60  118:aload_2         
	//   61  119:invokevirtual   #134 <Method float ScaleXY.getScaleY()>
	//   62  122:invokevirtual   #137 <Method boolean Matrix.preScale(float, float)>
	//   63  125:pop             
		obj = ((Object) ((PointF)anchorPoint.getValue()));
	//   64  126:aload_0         
	//   65  127:getfield        #40  <Field BaseKeyframeAnimation anchorPoint>
	//   66  130:invokevirtual   #103 <Method Object BaseKeyframeAnimation.getValue()>
	//   67  133:checkcast       #105 <Class PointF>
	//   68  136:astore_2        
		if(((PointF) (obj)).x != 0.0F || ((PointF) (obj)).y != 0.0F)
	//*  69  137:aload_2         
	//*  70  138:getfield        #109 <Field float PointF.x>
	//*  71  141:fconst_0        
	//*  72  142:fcmpl           
	//*  73  143:ifne            155
	//*  74  146:aload_2         
	//*  75  147:getfield        #112 <Field float PointF.y>
	//*  76  150:fconst_0        
	//*  77  151:fcmpl           
	//*  78  152:ifeq            173
			matrix.preTranslate(-((PointF) (obj)).x, -((PointF) (obj)).y);
	//   79  155:aload_0         
	//   80  156:getfield        #26  <Field Matrix matrix>
	//   81  159:aload_2         
	//   82  160:getfield        #109 <Field float PointF.x>
	//   83  163:fneg            
	//   84  164:aload_2         
	//   85  165:getfield        #112 <Field float PointF.y>
	//   86  168:fneg            
	//   87  169:invokevirtual   #116 <Method boolean Matrix.preTranslate(float, float)>
	//   88  172:pop             
		return matrix;
	//   89  173:aload_0         
	//   90  174:getfield        #26  <Field Matrix matrix>
	//   91  177:areturn         
	}

	BaseKeyframeAnimation getOpacity()
	{
		return opacity;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field BaseKeyframeAnimation opacity>
	//    2    4:areturn         
	}

	private final BaseKeyframeAnimation anchorPoint;
	private final Matrix matrix = new Matrix();
	private final BaseKeyframeAnimation opacity;
	private final BaseKeyframeAnimation position;
	private final BaseKeyframeAnimation rotation;
	private final BaseKeyframeAnimation scale;
}
