// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.net.Uri;
import android.widget.ImageView;

public final class zzacc extends ImageView
{

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void ImageView.onDraw(Canvas)>
	//    3    5:return          
	}

	protected void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #17  <Method void ImageView.onMeasure(int, int)>
	//    4    6:return          
	}

	public void zzcQ(int i)
	{
		zzaEU = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #21  <Field int zzaEU>
	//    3    5:return          
	}

	public void zzr(Uri uri)
	{
		zzaET = uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field Uri zzaET>
	//    3    5:return          
	}

	public int zzxu()
	{
		return zzaEU;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int zzaEU>
	//    2    4:ireturn         
	}

	private Uri zzaET;
	private int zzaEU;
}
