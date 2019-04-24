// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.animation.TypeEvaluator;
import com.amap.api.maps.model.LatLng;

// Referenced classes of package com.amap.api.mapcore.util:
//			dk

public static class dk$a
	implements TypeEvaluator
{

	public Object evaluate(float f, Object obj, Object obj1)
	{
		obj = ((Object) ((LatLng)obj));
	//    0    0:aload_2         
	//    1    1:checkcast       #18  <Class LatLng>
	//    2    4:astore_2        
		obj1 = ((Object) ((LatLng)obj1));
	//    3    5:aload_3         
	//    4    6:checkcast       #18  <Class LatLng>
	//    5    9:astore_3        
		return ((Object) (new LatLng(((LatLng) (obj)).latitude + (double)f * (((LatLng) (obj1)).latitude - ((LatLng) (obj)).latitude), ((LatLng) (obj)).longitude + (double)f * (((LatLng) (obj1)).longitude - ((LatLng) (obj)).longitude))));
	//    6   10:new             #18  <Class LatLng>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:getfield        #22  <Field double LatLng.latitude>
	//   10   18:fload_1         
	//   11   19:f2d             
	//   12   20:aload_3         
	//   13   21:getfield        #22  <Field double LatLng.latitude>
	//   14   24:aload_2         
	//   15   25:getfield        #22  <Field double LatLng.latitude>
	//   16   28:dsub            
	//   17   29:dmul            
	//   18   30:dadd            
	//   19   31:aload_2         
	//   20   32:getfield        #25  <Field double LatLng.longitude>
	//   21   35:fload_1         
	//   22   36:f2d             
	//   23   37:aload_3         
	//   24   38:getfield        #25  <Field double LatLng.longitude>
	//   25   41:aload_2         
	//   26   42:getfield        #25  <Field double LatLng.longitude>
	//   27   45:dsub            
	//   28   46:dmul            
	//   29   47:dadd            
	//   30   48:invokespecial   #28  <Method void LatLng(double, double)>
	//   31   51:areturn         
	}

	public dk$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
