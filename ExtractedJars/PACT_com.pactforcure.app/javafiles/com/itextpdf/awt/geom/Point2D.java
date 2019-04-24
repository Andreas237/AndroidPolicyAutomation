// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom;

import com.itextpdf.awt.geom.misc.HashCode;

public abstract class Point2D
	implements Cloneable
{
	public static class Double extends Point2D
	{

		public double getX()
		{
			return x;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field double x>
		//    2    4:dreturn         
		}

		public double getY()
		{
			return y;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field double y>
		//    2    4:dreturn         
		}

		public void setLocation(double d, double d1)
		{
			x = d;
		//    0    0:aload_0         
		//    1    1:dload_1         
		//    2    2:putfield        #16  <Field double x>
			y = d1;
		//    3    5:aload_0         
		//    4    6:dload_3         
		//    5    7:putfield        #18  <Field double y>
		//    6   10:return          
		}

		public String toString()
		{
			return (new StringBuilder()).append(((Object)this).getClass().getName()).append("[x=").append(x).append(",y=").append(y).append("]").toString();
		//    0    0:new             #26  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #27  <Method void StringBuilder()>
		//    3    7:aload_0         
		//    4    8:invokevirtual   #33  <Method Class Object.getClass()>
		//    5   11:invokevirtual   #38  <Method String Class.getName()>
		//    6   14:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//    7   17:ldc1            #44  <String "[x=">
		//    8   19:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//    9   22:aload_0         
		//   10   23:getfield        #16  <Field double x>
		//   11   26:invokevirtual   #47  <Method StringBuilder StringBuilder.append(double)>
		//   12   29:ldc1            #49  <String ",y=">
		//   13   31:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   14   34:aload_0         
		//   15   35:getfield        #18  <Field double y>
		//   16   38:invokevirtual   #47  <Method StringBuilder StringBuilder.append(double)>
		//   17   41:ldc1            #51  <String "]">
		//   18   43:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   19   46:invokevirtual   #53  <Method String StringBuilder.toString()>
		//   20   49:areturn         
		}

		public double x;
		public double y;

		public Double()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Point2D()>
		//    2    4:return          
		}

		public Double(double d, double d1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Point2D()>
			x = d;
		//    2    4:aload_0         
		//    3    5:dload_1         
		//    4    6:putfield        #16  <Field double x>
			y = d1;
		//    5    9:aload_0         
		//    6   10:dload_3         
		//    7   11:putfield        #18  <Field double y>
		//    8   14:return          
		}
	}

	public static class Float extends Point2D
	{

		public double getX()
		{
			return (double)x;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field float x>
		//    2    4:f2d             
		//    3    5:dreturn         
		}

		public double getY()
		{
			return (double)y;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field float y>
		//    2    4:f2d             
		//    3    5:dreturn         
		}

		public void setLocation(double d, double d1)
		{
			x = (float)d;
		//    0    0:aload_0         
		//    1    1:dload_1         
		//    2    2:d2f             
		//    3    3:putfield        #16  <Field float x>
			y = (float)d1;
		//    4    6:aload_0         
		//    5    7:dload_3         
		//    6    8:d2f             
		//    7    9:putfield        #18  <Field float y>
		//    8   12:return          
		}

		public void setLocation(float f, float f1)
		{
			x = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #16  <Field float x>
			y = f1;
		//    3    5:aload_0         
		//    4    6:fload_2         
		//    5    7:putfield        #18  <Field float y>
		//    6   10:return          
		}

		public String toString()
		{
			return (new StringBuilder()).append(((Object)this).getClass().getName()).append("[x=").append(x).append(",y=").append(y).append("]").toString();
		//    0    0:new             #27  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #28  <Method void StringBuilder()>
		//    3    7:aload_0         
		//    4    8:invokevirtual   #34  <Method Class Object.getClass()>
		//    5   11:invokevirtual   #39  <Method String Class.getName()>
		//    6   14:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//    7   17:ldc1            #45  <String "[x=">
		//    8   19:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//    9   22:aload_0         
		//   10   23:getfield        #16  <Field float x>
		//   11   26:invokevirtual   #48  <Method StringBuilder StringBuilder.append(float)>
		//   12   29:ldc1            #50  <String ",y=">
		//   13   31:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//   14   34:aload_0         
		//   15   35:getfield        #18  <Field float y>
		//   16   38:invokevirtual   #48  <Method StringBuilder StringBuilder.append(float)>
		//   17   41:ldc1            #52  <String "]">
		//   18   43:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//   19   46:invokevirtual   #54  <Method String StringBuilder.toString()>
		//   20   49:areturn         
		}

		public float x;
		public float y;

		public Float()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Point2D()>
		//    2    4:return          
		}

		public Float(float f, float f1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Point2D()>
			x = f;
		//    2    4:aload_0         
		//    3    5:fload_1         
		//    4    6:putfield        #16  <Field float x>
			y = f1;
		//    5    9:aload_0         
		//    6   10:fload_2         
		//    7   11:putfield        #18  <Field float y>
		//    8   14:return          
		}
	}


	protected Point2D()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public static double distance(double d, double d1, double d2, double d3)
	{
		return Math.sqrt(distanceSq(d, d1, d2, d3));
	//    0    0:dload_0         
	//    1    1:dload_2         
	//    2    2:dload           4
	//    3    4:dload           6
	//    4    6:invokestatic    #22  <Method double distanceSq(double, double, double, double)>
	//    5    9:invokestatic    #28  <Method double Math.sqrt(double)>
	//    6   12:dreturn         
	}

	public static double distanceSq(double d, double d1, double d2, double d3)
	{
		d = d2 - d;
	//    0    0:dload           4
	//    1    2:dload_0         
	//    2    3:dsub            
	//    3    4:dstore_0        
		d1 = d3 - d1;
	//    4    5:dload           6
	//    5    7:dload_2         
	//    6    8:dsub            
	//    7    9:dstore_2        
		return d * d + d1 * d1;
	//    8   10:dload_0         
	//    9   11:dload_0         
	//   10   12:dmul            
	//   11   13:dload_2         
	//   12   14:dload_2         
	//   13   15:dmul            
	//   14   16:dadd            
	//   15   17:dreturn         
	}

	public Object clone()
	{
		Object obj;
		try
		{
			obj = super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method Object Object.clone()>
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*   5    7:astore_1        
		{
			throw new InternalError();
	//    6    8:new             #36  <Class InternalError>
	//    7   11:dup             
	//    8   12:invokespecial   #37  <Method void InternalError()>
	//    9   15:athrow          
		}
		return obj;
	}

	public double distance(double d, double d1)
	{
		return Math.sqrt(distanceSq(d, d1));
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:dload_3         
	//    3    3:invokevirtual   #40  <Method double distanceSq(double, double)>
	//    4    6:invokestatic    #28  <Method double Math.sqrt(double)>
	//    5    9:dreturn         
	}

	public double distance(Point2D point2d)
	{
		return Math.sqrt(distanceSq(point2d));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #43  <Method double distanceSq(Point2D)>
	//    3    5:invokestatic    #28  <Method double Math.sqrt(double)>
	//    4    8:dreturn         
	}

	public double distanceSq(double d, double d1)
	{
		return distanceSq(getX(), getY(), d, d1);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method double getX()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #50  <Method double getY()>
	//    4    8:dload_1         
	//    5    9:dload_3         
	//    6   10:invokestatic    #22  <Method double distanceSq(double, double, double, double)>
	//    7   13:dreturn         
	}

	public double distanceSq(Point2D point2d)
	{
		return distanceSq(getX(), getY(), point2d.getX(), point2d.getY());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method double getX()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #50  <Method double getY()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #47  <Method double getX()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #50  <Method double getY()>
	//    8   16:invokestatic    #22  <Method double distanceSq(double, double, double, double)>
	//    9   19:dreturn         
	}

	public boolean equals(Object obj)
	{
		if(obj != this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
			if(obj instanceof Point2D)
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class Point2D>
	//*   7   11:ifeq            45
	//*   8   14:aload_1         
	//*   9   15:checkcast       #2   <Class Point2D>
	//*  10   18:astore_1        
			{
				if(getX() != ((Point2D) (obj = ((Object) ((Point2D)obj)))).getX() || getY() != ((Point2D) (obj)).getY())
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #47  <Method double getX()>
	//*  13   23:aload_1         
	//*  14   24:invokevirtual   #47  <Method double getX()>
	//*  15   27:dcmpl           
	//*  16   28:ifne            43
	//*  17   31:aload_0         
	//*  18   32:invokevirtual   #50  <Method double getY()>
	//*  19   35:aload_1         
	//*  20   36:invokevirtual   #50  <Method double getY()>
	//*  21   39:dcmpl           
	//*  22   40:ifeq            5
					return false;
	//   23   43:iconst_0        
	//   24   44:ireturn         
			} else
			{
				return false;
	//   25   45:iconst_0        
	//   26   46:ireturn         
			}
		return true;
	}

	public abstract double getX();

	public abstract double getY();

	public int hashCode()
	{
		HashCode hashcode = new HashCode();
	//    0    0:new             #56  <Class HashCode>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void HashCode()>
	//    3    7:astore_1        
		hashcode.append(getX());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #47  <Method double getX()>
	//    7   13:invokevirtual   #61  <Method HashCode HashCode.append(double)>
	//    8   16:pop             
		hashcode.append(getY());
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #50  <Method double getY()>
	//   12   22:invokevirtual   #61  <Method HashCode HashCode.append(double)>
	//   13   25:pop             
		return hashcode.hashCode();
	//   14   26:aload_1         
	//   15   27:invokevirtual   #63  <Method int HashCode.hashCode()>
	//   16   30:ireturn         
	}

	public abstract void setLocation(double d, double d1);

	public void setLocation(Point2D point2d)
	{
		setLocation(point2d.getX(), point2d.getY());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #47  <Method double getX()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #50  <Method double getY()>
	//    5    9:invokevirtual   #68  <Method void setLocation(double, double)>
	//    6   12:return          
	}
}
