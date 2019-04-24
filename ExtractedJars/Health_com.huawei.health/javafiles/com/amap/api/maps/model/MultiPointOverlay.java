// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import com.autonavi.amap.mapcore.interfaces.IMultiPointOverlay;
import java.util.List;

public class MultiPointOverlay
{

	public MultiPointOverlay(IMultiPointOverlay imultipointoverlay)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		a = imultipointoverlay;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field IMultiPointOverlay a>
	//    5    9:return          
	}

	public void destroy()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field IMultiPointOverlay a>
	//*   2    4:ifnull          17
			a.destroy(true);
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field IMultiPointOverlay a>
	//    5   11:iconst_1        
	//    6   12:invokeinterface #20  <Method void IMultiPointOverlay.destroy(boolean)>
	//    7   17:return          
	}

	public void remove()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field IMultiPointOverlay a>
	//*   2    4:ifnull          17
			a.remove(true);
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field IMultiPointOverlay a>
	//    5   11:iconst_1        
	//    6   12:invokeinterface #23  <Method void IMultiPointOverlay.remove(boolean)>
	//    7   17:return          
	}

	public void setAnchor(float f, float f1)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field IMultiPointOverlay a>
	//*   2    4:ifnull          18
			a.setAnchor(f, f1);
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field IMultiPointOverlay a>
	//    5   11:fload_1         
	//    6   12:fload_2         
	//    7   13:invokeinterface #27  <Method void IMultiPointOverlay.setAnchor(float, float)>
	//    8   18:return          
	}

	public void setEnable(boolean flag)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field IMultiPointOverlay a>
	//*   2    4:ifnull          17
			a.setVisible(flag);
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field IMultiPointOverlay a>
	//    5   11:iload_1         
	//    6   12:invokeinterface #31  <Method void IMultiPointOverlay.setVisible(boolean)>
	//    7   17:return          
	}

	public void setItems(List list)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field IMultiPointOverlay a>
	//*   2    4:ifnull          17
			a.addItems(list);
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field IMultiPointOverlay a>
	//    5   11:aload_1         
	//    6   12:invokeinterface #36  <Method void IMultiPointOverlay.addItems(List)>
	//    7   17:return          
	}

	IMultiPointOverlay a;
}
