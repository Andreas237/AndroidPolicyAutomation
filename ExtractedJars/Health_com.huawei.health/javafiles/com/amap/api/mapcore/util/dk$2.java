// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.animation.ValueAnimator;
import com.amap.api.maps.model.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			dk

class dk$2
	implements android.animation.Animator.AnimatorUpdateListener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		try
		{
			if(dk.b(a) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field dk a>
	//*   2    4:invokestatic    #26  <Method Circle dk.b(dk)>
	//*   3    7:ifnull          40
			{
				valueanimator = ((ValueAnimator) ((LatLng)valueanimator.getAnimatedValue()));
	//    4   10:aload_1         
	//    5   11:invokevirtual   #32  <Method Object ValueAnimator.getAnimatedValue()>
	//    6   14:checkcast       #34  <Class LatLng>
	//    7   17:astore_1        
				dk.b(a).setCenter(((LatLng) (valueanimator)));
	//    8   18:aload_0         
	//    9   19:getfield        #14  <Field dk a>
	//   10   22:invokestatic    #26  <Method Circle dk.b(dk)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #40  <Method void Circle.setCenter(LatLng)>
				dk.c(a).setPosition(((LatLng) (valueanimator)));
	//   13   29:aload_0         
	//   14   30:getfield        #14  <Field dk a>
	//   15   33:invokestatic    #44  <Method Marker dk.c(dk)>
	//   16   36:aload_1         
	//   17   37:invokevirtual   #49  <Method void Marker.setPosition(LatLng)>
			}
			return;
	//   18   40:return          
		}
		// Misplaced declaration of an exception variable
		catch(ValueAnimator valueanimator)
	//*  19   41:astore_1        
		{
			((Throwable) (valueanimator)).printStackTrace();
	//   20   42:aload_1         
	//   21   43:invokevirtual   #52  <Method void Throwable.printStackTrace()>
		}
	//   22   46:return          
	}

	final dk a;

	dk$2(dk dk1)
	{
		a = dk1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field dk a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
