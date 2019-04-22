// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.airbnb.lottie:
//			Mask, AnimatableShapeValue

class MaskKeyframeAnimation
{

	MaskKeyframeAnimation(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		masks = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field List masks>
		maskAnimations = ((List) (new ArrayList(list.size())));
	//    5    9:aload_0         
	//    6   10:new             #18  <Class ArrayList>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokeinterface #24  <Method int List.size()>
	//   10   20:invokespecial   #27  <Method void ArrayList(int)>
	//   11   23:putfield        #29  <Field List maskAnimations>
		for(int i = 0; i < list.size(); i++)
	//*  12   26:iconst_0        
	//*  13   27:istore_2        
	//*  14   28:iload_2         
	//*  15   29:aload_1         
	//*  16   30:invokeinterface #24  <Method int List.size()>
	//*  17   35:icmpge          71
			maskAnimations.add(((Object) (((Mask)list.get(i)).getMaskPath().createAnimation())));
	//   18   38:aload_0         
	//   19   39:getfield        #29  <Field List maskAnimations>
	//   20   42:aload_1         
	//   21   43:iload_2         
	//   22   44:invokeinterface #33  <Method Object List.get(int)>
	//   23   49:checkcast       #35  <Class Mask>
	//   24   52:invokevirtual   #39  <Method AnimatableShapeValue Mask.getMaskPath()>
	//   25   55:invokevirtual   #45  <Method BaseKeyframeAnimation AnimatableShapeValue.createAnimation()>
	//   26   58:invokeinterface #49  <Method boolean List.add(Object)>
	//   27   63:pop             

	//   28   64:iload_2         
	//   29   65:iconst_1        
	//   30   66:iadd            
	//   31   67:istore_2        
	//*  32   68:goto            28
	//   33   71:return          
	}

	List getMaskAnimations()
	{
		return maskAnimations;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field List maskAnimations>
	//    2    4:areturn         
	}

	List getMasks()
	{
		return masks;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field List masks>
	//    2    4:areturn         
	}

	private final List maskAnimations;
	private final List masks;
}
