// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.utils;

import com.github.mikephil.charting.interfaces.datasets.IDataSet;

public class SelectionDetail
{

	public SelectionDetail(float f, int i, IDataSet idataset)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		val = f;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #17  <Field float val>
		dataSetIndex = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #19  <Field int dataSetIndex>
		dataSet = idataset;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #21  <Field IDataSet dataSet>
	//   11   19:return          
	}

	public IDataSet dataSet;
	public int dataSetIndex;
	public float val;
}
