// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images.internal;

import android.graphics.*;

public final class ColorFilters
{

	private ColorFilters()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:return          
	}

	public static final ColorFilter COLOR_FILTER_BW;
	private static final ColorMatrix zzpv;

	static 
	{
		ColorMatrix colormatrix = new ColorMatrix();
	//    0    0:new             #12  <Class ColorMatrix>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void ColorMatrix()>
	//    3    7:astore_0        
		zzpv = colormatrix;
	//    4    8:aload_0         
	//    5    9:putstatic       #17  <Field ColorMatrix zzpv>
		colormatrix.setSaturation(0.0F);
	//    6   12:aload_0         
	//    7   13:fconst_0        
	//    8   14:invokevirtual   #21  <Method void ColorMatrix.setSaturation(float)>
		COLOR_FILTER_BW = ((ColorFilter) (new ColorMatrixColorFilter(zzpv)));
	//    9   17:new             #23  <Class ColorMatrixColorFilter>
	//   10   20:dup             
	//   11   21:getstatic       #17  <Field ColorMatrix zzpv>
	//   12   24:invokespecial   #26  <Method void ColorMatrixColorFilter(ColorMatrix)>
	//   13   27:putstatic       #28  <Field ColorFilter COLOR_FILTER_BW>
	//*  14   30:return          
	}
}
