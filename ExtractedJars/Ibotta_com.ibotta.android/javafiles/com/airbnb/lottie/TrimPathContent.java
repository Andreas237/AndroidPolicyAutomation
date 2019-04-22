// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.airbnb.lottie:
//			Content, ShapeTrimPath, AnimatableFloatValue, BaseLayer, 
//			BaseKeyframeAnimation

class TrimPathContent
	implements BaseKeyframeAnimation.AnimationListener, Content
{

	TrimPathContent(BaseLayer baselayer, ShapeTrimPath shapetrimpath)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #27  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void ArrayList()>
	//    6   12:putfield        #30  <Field List listeners>
		name = shapetrimpath.getName();
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #36  <Method String ShapeTrimPath.getName()>
	//   10   20:putfield        #38  <Field String name>
		type = shapetrimpath.getType();
	//   11   23:aload_0         
	//   12   24:aload_2         
	//   13   25:invokevirtual   #42  <Method ShapeTrimPath$Type ShapeTrimPath.getType()>
	//   14   28:putfield        #44  <Field ShapeTrimPath$Type type>
		startAnimation = ((BaseKeyframeAnimation) (shapetrimpath.getStart().createAnimation()));
	//   15   31:aload_0         
	//   16   32:aload_2         
	//   17   33:invokevirtual   #48  <Method AnimatableFloatValue ShapeTrimPath.getStart()>
	//   18   36:invokevirtual   #54  <Method KeyframeAnimation AnimatableFloatValue.createAnimation()>
	//   19   39:putfield        #56  <Field BaseKeyframeAnimation startAnimation>
		endAnimation = ((BaseKeyframeAnimation) (shapetrimpath.getEnd().createAnimation()));
	//   20   42:aload_0         
	//   21   43:aload_2         
	//   22   44:invokevirtual   #59  <Method AnimatableFloatValue ShapeTrimPath.getEnd()>
	//   23   47:invokevirtual   #54  <Method KeyframeAnimation AnimatableFloatValue.createAnimation()>
	//   24   50:putfield        #61  <Field BaseKeyframeAnimation endAnimation>
		offsetAnimation = ((BaseKeyframeAnimation) (shapetrimpath.getOffset().createAnimation()));
	//   25   53:aload_0         
	//   26   54:aload_2         
	//   27   55:invokevirtual   #64  <Method AnimatableFloatValue ShapeTrimPath.getOffset()>
	//   28   58:invokevirtual   #54  <Method KeyframeAnimation AnimatableFloatValue.createAnimation()>
	//   29   61:putfield        #66  <Field BaseKeyframeAnimation offsetAnimation>
		baselayer.addAnimation(startAnimation);
	//   30   64:aload_1         
	//   31   65:aload_0         
	//   32   66:getfield        #56  <Field BaseKeyframeAnimation startAnimation>
	//   33   69:invokevirtual   #72  <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		baselayer.addAnimation(endAnimation);
	//   34   72:aload_1         
	//   35   73:aload_0         
	//   36   74:getfield        #61  <Field BaseKeyframeAnimation endAnimation>
	//   37   77:invokevirtual   #72  <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		baselayer.addAnimation(offsetAnimation);
	//   38   80:aload_1         
	//   39   81:aload_0         
	//   40   82:getfield        #66  <Field BaseKeyframeAnimation offsetAnimation>
	//   41   85:invokevirtual   #72  <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		startAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//   42   88:aload_0         
	//   43   89:getfield        #56  <Field BaseKeyframeAnimation startAnimation>
	//   44   92:aload_0         
	//   45   93:invokevirtual   #78  <Method void BaseKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
		endAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//   46   96:aload_0         
	//   47   97:getfield        #61  <Field BaseKeyframeAnimation endAnimation>
	//   48  100:aload_0         
	//   49  101:invokevirtual   #78  <Method void BaseKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
		offsetAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//   50  104:aload_0         
	//   51  105:getfield        #66  <Field BaseKeyframeAnimation offsetAnimation>
	//   52  108:aload_0         
	//   53  109:invokevirtual   #78  <Method void BaseKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
	//   54  112:return          
	}

	void addListener(BaseKeyframeAnimation.AnimationListener animationlistener)
	{
		listeners.add(((Object) (animationlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field List listeners>
	//    2    4:aload_1         
	//    3    5:invokeinterface #86  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public BaseKeyframeAnimation getEnd()
	{
		return endAnimation;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field BaseKeyframeAnimation endAnimation>
	//    2    4:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String name>
	//    2    4:areturn         
	}

	public BaseKeyframeAnimation getOffset()
	{
		return offsetAnimation;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field BaseKeyframeAnimation offsetAnimation>
	//    2    4:areturn         
	}

	public BaseKeyframeAnimation getStart()
	{
		return startAnimation;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field BaseKeyframeAnimation startAnimation>
	//    2    4:areturn         
	}

	ShapeTrimPath.Type getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field ShapeTrimPath$Type type>
	//    2    4:areturn         
	}

	public void onValueChanged()
	{
		for(int i = 0; i < listeners.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #30  <Field List listeners>
	//*   5    7:invokeinterface #94  <Method int List.size()>
	//*   6   12:icmpge          40
			((BaseKeyframeAnimation.AnimationListener)listeners.get(i)).onValueChanged();
	//    7   15:aload_0         
	//    8   16:getfield        #30  <Field List listeners>
	//    9   19:iload_1         
	//   10   20:invokeinterface #98  <Method Object List.get(int)>
	//   11   25:checkcast       #6   <Class BaseKeyframeAnimation$AnimationListener>
	//   12   28:invokeinterface #100 <Method void BaseKeyframeAnimation$AnimationListener.onValueChanged()>

	//   13   33:iload_1         
	//   14   34:iconst_1        
	//   15   35:iadd            
	//   16   36:istore_1        
	//*  17   37:goto            2
	//   18   40:return          
	}

	public void setContents(List list, List list1)
	{
	//    0    0:return          
	}

	private final BaseKeyframeAnimation endAnimation;
	private final List listeners = new ArrayList();
	private String name;
	private final BaseKeyframeAnimation offsetAnimation;
	private final BaseKeyframeAnimation startAnimation;
	private final ShapeTrimPath.Type type;
}
