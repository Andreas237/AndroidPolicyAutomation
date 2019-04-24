// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.trace;


public class TraceLocation
{

	public TraceLocation()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public TraceLocation(double d1, double d2, float f, float f1, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = a(d1);
	//    2    4:aload_0         
	//    3    5:dload_1         
	//    4    6:invokestatic    #21  <Method double a(double)>
	//    5    9:putfield        #23  <Field double a>
		b = a(d2);
	//    6   12:aload_0         
	//    7   13:dload_3         
	//    8   14:invokestatic    #21  <Method double a(double)>
	//    9   17:putfield        #25  <Field double b>
		c = (int)((3600F * f) / 1000F);
	//   10   20:aload_0         
	//   11   21:ldc1            #26  <Float 3600F>
	//   12   23:fload           5
	//   13   25:fmul            
	//   14   26:ldc1            #27  <Float 1000F>
	//   15   28:fdiv            
	//   16   29:f2i             
	//   17   30:i2f             
	//   18   31:putfield        #29  <Field float c>
		d = (int)f1;
	//   19   34:aload_0         
	//   20   35:fload           6
	//   21   37:f2i             
	//   22   38:i2f             
	//   23   39:putfield        #31  <Field float d>
		e = l;
	//   24   42:aload_0         
	//   25   43:lload           7
	//   26   45:putfield        #33  <Field long e>
	//   27   48:return          
	}

	private static double a(double d1)
	{
		return (double)Math.round(1000000D * d1) / 1000000D;
	//    0    0:ldc2w           #34  <Double 1000000D>
	//    1    3:dload_0         
	//    2    4:dmul            
	//    3    5:invokestatic    #41  <Method long Math.round(double)>
	//    4    8:l2d             
	//    5    9:ldc2w           #34  <Double 1000000D>
	//    6   12:ddiv            
	//    7   13:dreturn         
	}

	public TraceLocation copy()
	{
		TraceLocation tracelocation = new TraceLocation();
	//    0    0:new             #2   <Class TraceLocation>
	//    1    3:dup             
	//    2    4:invokespecial   #44  <Method void TraceLocation()>
	//    3    7:astore_1        
		tracelocation.d = d;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field float d>
	//    7   13:putfield        #31  <Field float d>
		tracelocation.a = a;
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #23  <Field double a>
	//   11   21:putfield        #23  <Field double a>
		tracelocation.b = b;
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #25  <Field double b>
	//   15   29:putfield        #25  <Field double b>
		tracelocation.c = c;
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #29  <Field float c>
	//   19   37:putfield        #29  <Field float c>
		tracelocation.e = e;
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #33  <Field long e>
	//   23   45:putfield        #33  <Field long e>
		return tracelocation;
	//   24   48:aload_1         
	//   25   49:areturn         
	}

	public float getBearing()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field float d>
	//    2    4:freturn         
	}

	public double getLatitude()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field double a>
	//    2    4:dreturn         
	}

	public double getLongitude()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field double b>
	//    2    4:dreturn         
	}

	public float getSpeed()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field float c>
	//    2    4:freturn         
	}

	public long getTime()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field long e>
	//    2    4:lreturn         
	}

	public void setBearing(float f)
	{
		d = (int)f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:f2i             
	//    3    3:i2f             
	//    4    4:putfield        #31  <Field float d>
	//    5    7:return          
	}

	public void setLatitude(double d1)
	{
		a = a(d1);
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:invokestatic    #21  <Method double a(double)>
	//    3    5:putfield        #23  <Field double a>
	//    4    8:return          
	}

	public void setLongitude(double d1)
	{
		b = a(d1);
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:invokestatic    #21  <Method double a(double)>
	//    3    5:putfield        #25  <Field double b>
	//    4    8:return          
	}

	public void setSpeed(float f)
	{
		c = (int)((3600F * f) / 1000F);
	//    0    0:aload_0         
	//    1    1:ldc1            #26  <Float 3600F>
	//    2    3:fload_1         
	//    3    4:fmul            
	//    4    5:ldc1            #27  <Float 1000F>
	//    5    7:fdiv            
	//    6    8:f2i             
	//    7    9:i2f             
	//    8   10:putfield        #29  <Field float c>
	//    9   13:return          
	}

	public void setTime(long l)
	{
		e = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #33  <Field long e>
	//    3    5:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append(a).append(",longtitude ").append(b).append(",speed ").append(c).append(",bearing ").append(d).append(",time ").append(e).toString();
	//    0    0:new             #64  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field double a>
	//    5   11:invokevirtual   #69  <Method StringBuilder StringBuilder.append(double)>
	//    6   14:ldc1            #71  <String ",longtitude ">
	//    7   16:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:aload_0         
	//    9   20:getfield        #25  <Field double b>
	//   10   23:invokevirtual   #69  <Method StringBuilder StringBuilder.append(double)>
	//   11   26:ldc1            #76  <String ",speed ">
	//   12   28:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:aload_0         
	//   14   32:getfield        #29  <Field float c>
	//   15   35:invokevirtual   #79  <Method StringBuilder StringBuilder.append(float)>
	//   16   38:ldc1            #81  <String ",bearing ">
	//   17   40:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   18   43:aload_0         
	//   19   44:getfield        #31  <Field float d>
	//   20   47:invokevirtual   #79  <Method StringBuilder StringBuilder.append(float)>
	//   21   50:ldc1            #83  <String ",time ">
	//   22   52:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   23   55:aload_0         
	//   24   56:getfield        #33  <Field long e>
	//   25   59:invokevirtual   #86  <Method StringBuilder StringBuilder.append(long)>
	//   26   62:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   27   65:areturn         
	}

	private double a;
	private double b;
	private float c;
	private float d;
	private long e;
}
