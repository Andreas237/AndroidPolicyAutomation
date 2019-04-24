// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.exception;


public class DrawingDataSetNotCreatedException extends RuntimeException
{

	public DrawingDataSetNotCreatedException()
	{
		super("Have to create a new drawing set first. Call ChartData's createNewDrawingDataSet() method");
	//    0    0:aload_0         
	//    1    1:ldc1            #12  <String "Have to create a new drawing set first. Call ChartData's createNewDrawingDataSet() method">
	//    2    3:invokespecial   #15  <Method void RuntimeException(String)>
	//    3    6:return          
	}

	private static final long serialVersionUID = 1L;
}
