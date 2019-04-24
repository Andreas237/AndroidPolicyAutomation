// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.utils;


public class PointD
{

	public PointD(double d, double d1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		x = d;
	//    2    4:aload_0         
	//    3    5:dload_1         
	//    4    6:putfield        #14  <Field double x>
		y = d1;
	//    5    9:aload_0         
	//    6   10:dload_3         
	//    7   11:putfield        #16  <Field double y>
	//    8   14:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append("PointD, x: ").append(x).append(", y: ").append(y).toString();
	//    0    0:new             #21  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void StringBuilder()>
	//    3    7:ldc1            #24  <String "PointD, x: ">
	//    4    9:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #14  <Field double x>
	//    7   16:invokevirtual   #31  <Method StringBuilder StringBuilder.append(double)>
	//    8   19:ldc1            #33  <String ", y: ">
	//    9   21:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #16  <Field double y>
	//   12   28:invokevirtual   #31  <Method StringBuilder StringBuilder.append(double)>
	//   13   31:invokevirtual   #35  <Method String StringBuilder.toString()>
	//   14   34:areturn         
	}

	public double x;
	public double y;
}
