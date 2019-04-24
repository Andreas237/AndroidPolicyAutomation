// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.animation;

import com.amap.api.maps.model.LatLng;

// Referenced classes of package com.autonavi.amap.mapcore.animation:
//			GLAnimation, GLTransformation

public class GLEmergeAnimation extends GLAnimation
{

	public GLEmergeAnimation(LatLng latlng)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void GLAnimation()>
		mStartPoint = latlng;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field LatLng mStartPoint>
	//    5    9:return          
	}

	protected void applyTransformation(float f, GLTransformation gltransformation)
	{
	//    0    0:return          
	}

	public LatLng mStartPoint;
}
