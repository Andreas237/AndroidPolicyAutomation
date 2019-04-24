// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.graphics.Bitmap;

public class CrossOverlayOptions
{

	public CrossOverlayOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #14  <Field com.autonavi.ae.gmap.gloverlay.GLCrossVector$AVectorCrossAttr a>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #16  <Field Bitmap b>
	//    8   14:return          
	}

	public com.autonavi.ae.gmap.gloverlay.GLCrossVector.AVectorCrossAttr getAttribute()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field com.autonavi.ae.gmap.gloverlay.GLCrossVector$AVectorCrossAttr a>
	//    2    4:areturn         
	}

	public Bitmap getRes()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Bitmap b>
	//    2    4:areturn         
	}

	public CrossOverlayOptions setAttribute(com.autonavi.ae.gmap.gloverlay.GLCrossVector.AVectorCrossAttr avectorcrossattr)
	{
		a = avectorcrossattr;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field com.autonavi.ae.gmap.gloverlay.GLCrossVector$AVectorCrossAttr a>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public CrossOverlayOptions setRes(Bitmap bitmap)
	{
		b = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field Bitmap b>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	com.autonavi.ae.gmap.gloverlay.GLCrossVector.AVectorCrossAttr a;
	private Bitmap b;
}
