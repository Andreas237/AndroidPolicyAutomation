// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.amap.api.maps.model.LatLng;

// Referenced classes of package com.amap.api.mapcore.util:
//			w

public abstract class k
	implements w
{

	public k()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public abstract String getId();

	public abstract LatLng getPosition();

	public abstract String getSnippet();

	public abstract String getTitle();

	public boolean isDraggable()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isInfoWindowAutoOverturn()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public abstract boolean isVisible();
}
