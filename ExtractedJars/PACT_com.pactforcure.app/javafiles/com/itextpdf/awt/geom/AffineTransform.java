// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom;

import com.itextpdf.awt.geom.misc.HashCode;
import com.itextpdf.awt.geom.misc.Messages;
import java.io.*;

// Referenced classes of package com.itextpdf.awt.geom:
//			NoninvertibleTransformException, GeneralPath, Shape, PathIterator, 
//			Point2D

public class AffineTransform
	implements Cloneable, Serializable
{

	public AffineTransform()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
		type = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #52  <Field int type>
		m11 = 1.0D;
	//    5    9:aload_0         
	//    6   10:dconst_1        
	//    7   11:putfield        #54  <Field double m11>
		m00 = 1.0D;
	//    8   14:aload_0         
	//    9   15:dconst_1        
	//   10   16:putfield        #56  <Field double m00>
		m12 = 0.0D;
	//   11   19:aload_0         
	//   12   20:dconst_0        
	//   13   21:putfield        #58  <Field double m12>
		m02 = 0.0D;
	//   14   24:aload_0         
	//   15   25:dconst_0        
	//   16   26:putfield        #60  <Field double m02>
		m01 = 0.0D;
	//   17   29:aload_0         
	//   18   30:dconst_0        
	//   19   31:putfield        #62  <Field double m01>
		m10 = 0.0D;
	//   20   34:aload_0         
	//   21   35:dconst_0        
	//   22   36:putfield        #64  <Field double m10>
	//   23   39:return          
	}

	public AffineTransform(double d, double d1, double d2, double d3, double d4, double d5)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
		type = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #52  <Field int type>
		m00 = d;
	//    5    9:aload_0         
	//    6   10:dload_1         
	//    7   11:putfield        #56  <Field double m00>
		m10 = d1;
	//    8   14:aload_0         
	//    9   15:dload_3         
	//   10   16:putfield        #64  <Field double m10>
		m01 = d2;
	//   11   19:aload_0         
	//   12   20:dload           5
	//   13   22:putfield        #62  <Field double m01>
		m11 = d3;
	//   14   25:aload_0         
	//   15   26:dload           7
	//   16   28:putfield        #54  <Field double m11>
		m02 = d4;
	//   17   31:aload_0         
	//   18   32:dload           9
	//   19   34:putfield        #60  <Field double m02>
		m12 = d5;
	//   20   37:aload_0         
	//   21   38:dload           11
	//   22   40:putfield        #58  <Field double m12>
	//   23   43:return          
	}

	public AffineTransform(float f, float f1, float f2, float f3, float f4, float f5)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
		type = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #52  <Field int type>
		m00 = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:f2d             
	//    8   12:putfield        #56  <Field double m00>
		m10 = f1;
	//    9   15:aload_0         
	//   10   16:fload_2         
	//   11   17:f2d             
	//   12   18:putfield        #64  <Field double m10>
		m01 = f2;
	//   13   21:aload_0         
	//   14   22:fload_3         
	//   15   23:f2d             
	//   16   24:putfield        #62  <Field double m01>
		m11 = f3;
	//   17   27:aload_0         
	//   18   28:fload           4
	//   19   30:f2d             
	//   20   31:putfield        #54  <Field double m11>
		m02 = f4;
	//   21   34:aload_0         
	//   22   35:fload           5
	//   23   37:f2d             
	//   24   38:putfield        #60  <Field double m02>
		m12 = f5;
	//   25   41:aload_0         
	//   26   42:fload           6
	//   27   44:f2d             
	//   28   45:putfield        #58  <Field double m12>
	//   29   48:return          
	}

	public AffineTransform(AffineTransform affinetransform)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
		type = affinetransform.type;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #52  <Field int type>
	//    5    9:putfield        #52  <Field int type>
		m00 = affinetransform.m00;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #56  <Field double m00>
	//    9   17:putfield        #56  <Field double m00>
		m10 = affinetransform.m10;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #64  <Field double m10>
	//   13   25:putfield        #64  <Field double m10>
		m01 = affinetransform.m01;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #62  <Field double m01>
	//   17   33:putfield        #62  <Field double m01>
		m11 = affinetransform.m11;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:getfield        #54  <Field double m11>
	//   21   41:putfield        #54  <Field double m11>
		m02 = affinetransform.m02;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:getfield        #60  <Field double m02>
	//   25   49:putfield        #60  <Field double m02>
		m12 = affinetransform.m12;
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:getfield        #58  <Field double m12>
	//   29   57:putfield        #58  <Field double m12>
	//   30   60:return          
	}

	public AffineTransform(double ad[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
		type = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #52  <Field int type>
		m00 = ad[0];
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:daload          
	//    9   13:putfield        #56  <Field double m00>
		m10 = ad[1];
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:iconst_1        
	//   13   19:daload          
	//   14   20:putfield        #64  <Field double m10>
		m01 = ad[2];
	//   15   23:aload_0         
	//   16   24:aload_1         
	//   17   25:iconst_2        
	//   18   26:daload          
	//   19   27:putfield        #62  <Field double m01>
		m11 = ad[3];
	//   20   30:aload_0         
	//   21   31:aload_1         
	//   22   32:iconst_3        
	//   23   33:daload          
	//   24   34:putfield        #54  <Field double m11>
		if(ad.length > 4)
	//*  25   37:aload_1         
	//*  26   38:arraylength     
	//*  27   39:iconst_4        
	//*  28   40:icmple          57
		{
			m02 = ad[4];
	//   29   43:aload_0         
	//   30   44:aload_1         
	//   31   45:iconst_4        
	//   32   46:daload          
	//   33   47:putfield        #60  <Field double m02>
			m12 = ad[5];
	//   34   50:aload_0         
	//   35   51:aload_1         
	//   36   52:iconst_5        
	//   37   53:daload          
	//   38   54:putfield        #58  <Field double m12>
		}
	//   39   57:return          
	}

	public AffineTransform(float af[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
		type = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #52  <Field int type>
		m00 = af[0];
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:faload          
	//    9   13:f2d             
	//   10   14:putfield        #56  <Field double m00>
		m10 = af[1];
	//   11   17:aload_0         
	//   12   18:aload_1         
	//   13   19:iconst_1        
	//   14   20:faload          
	//   15   21:f2d             
	//   16   22:putfield        #64  <Field double m10>
		m01 = af[2];
	//   17   25:aload_0         
	//   18   26:aload_1         
	//   19   27:iconst_2        
	//   20   28:faload          
	//   21   29:f2d             
	//   22   30:putfield        #62  <Field double m01>
		m11 = af[3];
	//   23   33:aload_0         
	//   24   34:aload_1         
	//   25   35:iconst_3        
	//   26   36:faload          
	//   27   37:f2d             
	//   28   38:putfield        #54  <Field double m11>
		if(af.length > 4)
	//*  29   41:aload_1         
	//*  30   42:arraylength     
	//*  31   43:iconst_4        
	//*  32   44:icmple          63
		{
			m02 = af[4];
	//   33   47:aload_0         
	//   34   48:aload_1         
	//   35   49:iconst_4        
	//   36   50:faload          
	//   37   51:f2d             
	//   38   52:putfield        #60  <Field double m02>
			m12 = af[5];
	//   39   55:aload_0         
	//   40   56:aload_1         
	//   41   57:iconst_5        
	//   42   58:faload          
	//   43   59:f2d             
	//   44   60:putfield        #58  <Field double m12>
		}
	//   45   63:return          
	}

	public static AffineTransform getRotateInstance(double d)
	{
		AffineTransform affinetransform = new AffineTransform();
	//    0    0:new             #2   <Class AffineTransform>
	//    1    3:dup             
	//    2    4:invokespecial   #73  <Method void AffineTransform()>
	//    3    7:astore_2        
		affinetransform.setToRotation(d);
	//    4    8:aload_2         
	//    5    9:dload_0         
	//    6   10:invokevirtual   #77  <Method void setToRotation(double)>
		return affinetransform;
	//    7   13:aload_2         
	//    8   14:areturn         
	}

	public static AffineTransform getRotateInstance(double d, double d1, double d2)
	{
		AffineTransform affinetransform = new AffineTransform();
	//    0    0:new             #2   <Class AffineTransform>
	//    1    3:dup             
	//    2    4:invokespecial   #73  <Method void AffineTransform()>
	//    3    7:astore          6
		affinetransform.setToRotation(d, d1, d2);
	//    4    9:aload           6
	//    5   11:dload_0         
	//    6   12:dload_2         
	//    7   13:dload           4
	//    8   15:invokevirtual   #81  <Method void setToRotation(double, double, double)>
		return affinetransform;
	//    9   18:aload           6
	//   10   20:areturn         
	}

	public static AffineTransform getScaleInstance(double d, double d1)
	{
		AffineTransform affinetransform = new AffineTransform();
	//    0    0:new             #2   <Class AffineTransform>
	//    1    3:dup             
	//    2    4:invokespecial   #73  <Method void AffineTransform()>
	//    3    7:astore          4
		affinetransform.setToScale(d, d1);
	//    4    9:aload           4
	//    5   11:dload_0         
	//    6   12:dload_2         
	//    7   13:invokevirtual   #87  <Method void setToScale(double, double)>
		return affinetransform;
	//    8   16:aload           4
	//    9   18:areturn         
	}

	public static AffineTransform getShearInstance(double d, double d1)
	{
		AffineTransform affinetransform = new AffineTransform();
	//    0    0:new             #2   <Class AffineTransform>
	//    1    3:dup             
	//    2    4:invokespecial   #73  <Method void AffineTransform()>
	//    3    7:astore          4
		affinetransform.setToShear(d, d1);
	//    4    9:aload           4
	//    5   11:dload_0         
	//    6   12:dload_2         
	//    7   13:invokevirtual   #91  <Method void setToShear(double, double)>
		return affinetransform;
	//    8   16:aload           4
	//    9   18:areturn         
	}

	public static AffineTransform getTranslateInstance(double d, double d1)
	{
		AffineTransform affinetransform = new AffineTransform();
	//    0    0:new             #2   <Class AffineTransform>
	//    1    3:dup             
	//    2    4:invokespecial   #73  <Method void AffineTransform()>
	//    3    7:astore          4
		affinetransform.setToTranslation(d, d1);
	//    4    9:aload           4
	//    5   11:dload_0         
	//    6   12:dload_2         
	//    7   13:invokevirtual   #95  <Method void setToTranslation(double, double)>
		return affinetransform;
	//    8   16:aload           4
	//    9   18:areturn         
	}

	private void readObject(ObjectInputStream objectinputstream)
		throws IOException, ClassNotFoundException
	{
		objectinputstream.defaultReadObject();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #106 <Method void ObjectInputStream.defaultReadObject()>
		type = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #52  <Field int type>
	//    5    9:return          
	}

	private void writeObject(ObjectOutputStream objectoutputstream)
		throws IOException
	{
		objectoutputstream.defaultWriteObject();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #114 <Method void ObjectOutputStream.defaultWriteObject()>
	//    2    4:return          
	}

	public Object clone()
	{
		Object obj;
		try
		{
			obj = super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #120 <Method Object Object.clone()>
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*   5    7:astore_1        
		{
			throw new InternalError();
	//    6    8:new             #122 <Class InternalError>
	//    7   11:dup             
	//    8   12:invokespecial   #123 <Method void InternalError()>
	//    9   15:athrow          
		}
		return obj;
	}

	public void concatenate(AffineTransform affinetransform)
	{
		setTransform(multiply(affinetransform, this));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_0         
	//    4    4:invokevirtual   #128 <Method AffineTransform multiply(AffineTransform, AffineTransform)>
	//    5    7:invokevirtual   #131 <Method void setTransform(AffineTransform)>
	//    6   10:return          
	}

	public AffineTransform createInverse()
		throws NoninvertibleTransformException
	{
		double d = getDeterminant();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #139 <Method double getDeterminant()>
	//    2    4:dstore_1        
		if(Math.abs(d) < 1E-10D)
	//*   3    5:dload_1         
	//*   4    6:invokestatic    #145 <Method double Math.abs(double)>
	//*   5    9:ldc2w           #34  <Double 1E-10D>
	//*   6   12:dcmpg           
	//*   7   13:ifge            29
			throw new NoninvertibleTransformException(Messages.getString("awt.204"));
	//    8   16:new             #135 <Class NoninvertibleTransformException>
	//    9   19:dup             
	//   10   20:ldc1            #147 <String "awt.204">
	//   11   22:invokestatic    #153 <Method String Messages.getString(String)>
	//   12   25:invokespecial   #156 <Method void NoninvertibleTransformException(String)>
	//   13   28:athrow          
		else
			return new AffineTransform(m11 / d, -m10 / d, -m01 / d, m00 / d, (m01 * m12 - m11 * m02) / d, (m10 * m02 - m00 * m12) / d);
	//   14   29:new             #2   <Class AffineTransform>
	//   15   32:dup             
	//   16   33:aload_0         
	//   17   34:getfield        #54  <Field double m11>
	//   18   37:dload_1         
	//   19   38:ddiv            
	//   20   39:aload_0         
	//   21   40:getfield        #64  <Field double m10>
	//   22   43:dneg            
	//   23   44:dload_1         
	//   24   45:ddiv            
	//   25   46:aload_0         
	//   26   47:getfield        #62  <Field double m01>
	//   27   50:dneg            
	//   28   51:dload_1         
	//   29   52:ddiv            
	//   30   53:aload_0         
	//   31   54:getfield        #56  <Field double m00>
	//   32   57:dload_1         
	//   33   58:ddiv            
	//   34   59:aload_0         
	//   35   60:getfield        #62  <Field double m01>
	//   36   63:aload_0         
	//   37   64:getfield        #58  <Field double m12>
	//   38   67:dmul            
	//   39   68:aload_0         
	//   40   69:getfield        #54  <Field double m11>
	//   41   72:aload_0         
	//   42   73:getfield        #60  <Field double m02>
	//   43   76:dmul            
	//   44   77:dsub            
	//   45   78:dload_1         
	//   46   79:ddiv            
	//   47   80:aload_0         
	//   48   81:getfield        #64  <Field double m10>
	//   49   84:aload_0         
	//   50   85:getfield        #60  <Field double m02>
	//   51   88:dmul            
	//   52   89:aload_0         
	//   53   90:getfield        #56  <Field double m00>
	//   54   93:aload_0         
	//   55   94:getfield        #58  <Field double m12>
	//   56   97:dmul            
	//   57   98:dsub            
	//   58   99:dload_1         
	//   59  100:ddiv            
	//   60  101:invokespecial   #158 <Method void AffineTransform(double, double, double, double, double, double)>
	//   61  104:areturn         
	}

	public Shape createTransformedShape(Shape shape)
	{
		if(shape == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(shape instanceof GeneralPath)
	//*   4    6:aload_1         
	//*   5    7:instanceof      #162 <Class GeneralPath>
	//*   6   10:ifeq            22
		{
			return ((GeneralPath)shape).createTransformedShape(this);
	//    7   13:aload_1         
	//    8   14:checkcast       #162 <Class GeneralPath>
	//    9   17:aload_0         
	//   10   18:invokevirtual   #165 <Method Shape GeneralPath.createTransformedShape(AffineTransform)>
	//   11   21:areturn         
		} else
		{
			shape = ((Shape) (shape.getPathIterator(this)));
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:invokeinterface #171 <Method PathIterator Shape.getPathIterator(AffineTransform)>
	//   15   29:astore_1        
			GeneralPath generalpath = new GeneralPath(((PathIterator) (shape)).getWindingRule());
	//   16   30:new             #162 <Class GeneralPath>
	//   17   33:dup             
	//   18   34:aload_1         
	//   19   35:invokeinterface #177 <Method int PathIterator.getWindingRule()>
	//   20   40:invokespecial   #180 <Method void GeneralPath(int)>
	//   21   43:astore_2        
			generalpath.append(((PathIterator) (shape)), false);
	//   22   44:aload_2         
	//   23   45:aload_1         
	//   24   46:iconst_0        
	//   25   47:invokevirtual   #184 <Method void GeneralPath.append(PathIterator, boolean)>
			return ((Shape) (generalpath));
	//   26   50:aload_2         
	//   27   51:areturn         
		}
	}

	public Point2D deltaTransform(Point2D point2d, Point2D point2d1)
	{
		Object obj = ((Object) (point2d1));
	//    0    0:aload_2         
	//    1    1:astore          7
		double d;
		double d1;
		if(point2d1 == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       23
			if(point2d instanceof Point2D.Double)
	//*   4    7:aload_1         
	//*   5    8:instanceof      #188 <Class Point2D$Double>
	//*   6   11:ifeq            70
				obj = ((Object) (new Point2D.Double()));
	//    7   14:new             #188 <Class Point2D$Double>
	//    8   17:dup             
	//    9   18:invokespecial   #189 <Method void Point2D$Double()>
	//   10   21:astore          7
			else
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #194 <Method double Point2D.getX()>
	//*  13   27:dstore_3        
	//*  14   28:aload_1         
	//*  15   29:invokevirtual   #197 <Method double Point2D.getY()>
	//*  16   32:dstore          5
	//*  17   34:aload           7
	//*  18   36:aload_0         
	//*  19   37:getfield        #56  <Field double m00>
	//*  20   40:dload_3         
	//*  21   41:dmul            
	//*  22   42:aload_0         
	//*  23   43:getfield        #62  <Field double m01>
	//*  24   46:dload           5
	//*  25   48:dmul            
	//*  26   49:dadd            
	//*  27   50:aload_0         
	//*  28   51:getfield        #64  <Field double m10>
	//*  29   54:dload_3         
	//*  30   55:dmul            
	//*  31   56:aload_0         
	//*  32   57:getfield        #54  <Field double m11>
	//*  33   60:dload           5
	//*  34   62:dmul            
	//*  35   63:dadd            
	//*  36   64:invokevirtual   #200 <Method void Point2D.setLocation(double, double)>
	//*  37   67:aload           7
	//*  38   69:areturn         
				obj = ((Object) (new Point2D.Float()));
	//   39   70:new             #202 <Class Point2D$Float>
	//   40   73:dup             
	//   41   74:invokespecial   #203 <Method void Point2D$Float()>
	//   42   77:astore          7
		d = point2d.getX();
		d1 = point2d.getY();
		((Point2D) (obj)).setLocation(m00 * d + m01 * d1, m10 * d + m11 * d1);
		return ((Point2D) (obj));
	//*  43   79:goto            23
	}

	public void deltaTransform(double ad[], int i, double ad1[], int j, int k)
	{
		int l = k;
	//    0    0:iload           5
	//    1    2:istore          10
		k = i;
	//    2    4:iload_2         
	//    3    5:istore          5
		i = j;
	//    4    7:iload           4
	//    5    9:istore_2        
		do
		{
			l--;
	//    6   10:iload           10
	//    7   12:iconst_1        
	//    8   13:isub            
	//    9   14:istore          10
			if(l >= 0)
	//*  10   16:iload           10
	//*  11   18:iflt            95
			{
				j = k + 1;
	//   12   21:iload           5
	//   13   23:iconst_1        
	//   14   24:iadd            
	//   15   25:istore          4
				double d = ad[k];
	//   16   27:aload_1         
	//   17   28:iload           5
	//   18   30:daload          
	//   19   31:dstore          6
				k = j + 1;
	//   20   33:iload           4
	//   21   35:iconst_1        
	//   22   36:iadd            
	//   23   37:istore          5
				double d1 = ad[j];
	//   24   39:aload_1         
	//   25   40:iload           4
	//   26   42:daload          
	//   27   43:dstore          8
				j = i + 1;
	//   28   45:iload_2         
	//   29   46:iconst_1        
	//   30   47:iadd            
	//   31   48:istore          4
				ad1[i] = m00 * d + m01 * d1;
	//   32   50:aload_3         
	//   33   51:iload_2         
	//   34   52:aload_0         
	//   35   53:getfield        #56  <Field double m00>
	//   36   56:dload           6
	//   37   58:dmul            
	//   38   59:aload_0         
	//   39   60:getfield        #62  <Field double m01>
	//   40   63:dload           8
	//   41   65:dmul            
	//   42   66:dadd            
	//   43   67:dastore         
				i = j + 1;
	//   44   68:iload           4
	//   45   70:iconst_1        
	//   46   71:iadd            
	//   47   72:istore_2        
				ad1[j] = m10 * d + m11 * d1;
	//   48   73:aload_3         
	//   49   74:iload           4
	//   50   76:aload_0         
	//   51   77:getfield        #64  <Field double m10>
	//   52   80:dload           6
	//   53   82:dmul            
	//   54   83:aload_0         
	//   55   84:getfield        #54  <Field double m11>
	//   56   87:dload           8
	//   57   89:dmul            
	//   58   90:dadd            
	//   59   91:dastore         
			} else
	//*  60   92:goto            10
			{
				return;
	//   61   95:return          
			}
		} while(true);
	}

	public boolean equals(Object obj)
	{
		if(obj != this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
			if(obj instanceof AffineTransform)
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class AffineTransform>
	//*   7   11:ifeq            93
	//*   8   14:aload_1         
	//*   9   15:checkcast       #2   <Class AffineTransform>
	//*  10   18:astore_1        
			{
				if(m00 != ((AffineTransform) (obj = ((Object) ((AffineTransform)obj)))).m00 || m01 != ((AffineTransform) (obj)).m01 || m02 != ((AffineTransform) (obj)).m02 || m10 != ((AffineTransform) (obj)).m10 || m11 != ((AffineTransform) (obj)).m11 || m12 != ((AffineTransform) (obj)).m12)
	//*  11   19:aload_0         
	//*  12   20:getfield        #56  <Field double m00>
	//*  13   23:aload_1         
	//*  14   24:getfield        #56  <Field double m00>
	//*  15   27:dcmpl           
	//*  16   28:ifne            91
	//*  17   31:aload_0         
	//*  18   32:getfield        #62  <Field double m01>
	//*  19   35:aload_1         
	//*  20   36:getfield        #62  <Field double m01>
	//*  21   39:dcmpl           
	//*  22   40:ifne            91
	//*  23   43:aload_0         
	//*  24   44:getfield        #60  <Field double m02>
	//*  25   47:aload_1         
	//*  26   48:getfield        #60  <Field double m02>
	//*  27   51:dcmpl           
	//*  28   52:ifne            91
	//*  29   55:aload_0         
	//*  30   56:getfield        #64  <Field double m10>
	//*  31   59:aload_1         
	//*  32   60:getfield        #64  <Field double m10>
	//*  33   63:dcmpl           
	//*  34   64:ifne            91
	//*  35   67:aload_0         
	//*  36   68:getfield        #54  <Field double m11>
	//*  37   71:aload_1         
	//*  38   72:getfield        #54  <Field double m11>
	//*  39   75:dcmpl           
	//*  40   76:ifne            91
	//*  41   79:aload_0         
	//*  42   80:getfield        #58  <Field double m12>
	//*  43   83:aload_1         
	//*  44   84:getfield        #58  <Field double m12>
	//*  45   87:dcmpl           
	//*  46   88:ifeq            5
					return false;
	//   47   91:iconst_0        
	//   48   92:ireturn         
			} else
			{
				return false;
	//   49   93:iconst_0        
	//   50   94:ireturn         
			}
		return true;
	}

	public double getDeterminant()
	{
		return m00 * m11 - m01 * m10;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field double m00>
	//    2    4:aload_0         
	//    3    5:getfield        #54  <Field double m11>
	//    4    8:dmul            
	//    5    9:aload_0         
	//    6   10:getfield        #62  <Field double m01>
	//    7   13:aload_0         
	//    8   14:getfield        #64  <Field double m10>
	//    9   17:dmul            
	//   10   18:dsub            
	//   11   19:dreturn         
	}

	public void getMatrix(double ad[])
	{
		ad[0] = m00;
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:getfield        #56  <Field double m00>
	//    4    6:dastore         
		ad[1] = m10;
	//    5    7:aload_1         
	//    6    8:iconst_1        
	//    7    9:aload_0         
	//    8   10:getfield        #64  <Field double m10>
	//    9   13:dastore         
		ad[2] = m01;
	//   10   14:aload_1         
	//   11   15:iconst_2        
	//   12   16:aload_0         
	//   13   17:getfield        #62  <Field double m01>
	//   14   20:dastore         
		ad[3] = m11;
	//   15   21:aload_1         
	//   16   22:iconst_3        
	//   17   23:aload_0         
	//   18   24:getfield        #54  <Field double m11>
	//   19   27:dastore         
		if(ad.length > 4)
	//*  20   28:aload_1         
	//*  21   29:arraylength     
	//*  22   30:iconst_4        
	//*  23   31:icmple          48
		{
			ad[4] = m02;
	//   24   34:aload_1         
	//   25   35:iconst_4        
	//   26   36:aload_0         
	//   27   37:getfield        #60  <Field double m02>
	//   28   40:dastore         
			ad[5] = m12;
	//   29   41:aload_1         
	//   30   42:iconst_5        
	//   31   43:aload_0         
	//   32   44:getfield        #58  <Field double m12>
	//   33   47:dastore         
		}
	//   34   48:return          
	}

	public double getScaleX()
	{
		return m00;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field double m00>
	//    2    4:dreturn         
	}

	public double getScaleY()
	{
		return m11;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field double m11>
	//    2    4:dreturn         
	}

	public double getShearX()
	{
		return m01;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field double m01>
	//    2    4:dreturn         
	}

	public double getShearY()
	{
		return m10;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field double m10>
	//    2    4:dreturn         
	}

	public double getTranslateX()
	{
		return m02;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field double m02>
	//    2    4:dreturn         
	}

	public double getTranslateY()
	{
		return m12;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field double m12>
	//    2    4:dreturn         
	}

	public int getType()
	{
		if(type == -1) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int type>
	//    2    4:iconst_m1       
	//    3    5:icmpeq          17
_L1:
		int j = type;
	//    4    8:aload_0         
	//    5    9:getfield        #52  <Field int type>
	//    6   12:istore          4
_L4:
		return j;
	//    7   14:iload           4
	//    8   16:ireturn         
_L2:
		int i;
		j = 0;
	//    9   17:iconst_0        
	//   10   18:istore          4
		if(m00 * m01 + m10 * m11 != 0.0D)
	//*  11   20:aload_0         
	//*  12   21:getfield        #56  <Field double m00>
	//*  13   24:aload_0         
	//*  14   25:getfield        #62  <Field double m01>
	//*  15   28:dmul            
	//*  16   29:aload_0         
	//*  17   30:getfield        #64  <Field double m10>
	//*  18   33:aload_0         
	//*  19   34:getfield        #54  <Field double m11>
	//*  20   37:dmul            
	//*  21   38:dadd            
	//*  22   39:dconst_0        
	//*  23   40:dcmpl           
	//*  24   41:ifeq            49
			return 0 | 0x20;
	//   25   44:iconst_0        
	//   26   45:bipush          32
	//   27   47:ior             
	//   28   48:ireturn         
		double d;
		if(m02 != 0.0D || m12 != 0.0D)
	//*  29   49:aload_0         
	//*  30   50:getfield        #60  <Field double m02>
	//*  31   53:dconst_0        
	//*  32   54:dcmpl           
	//*  33   55:ifne            67
	//*  34   58:aload_0         
	//*  35   59:getfield        #58  <Field double m12>
	//*  36   62:dconst_0        
	//*  37   63:dcmpl           
	//*  38   64:ifeq            212
		{
			i = ((int) (false | true));
	//   39   67:iconst_0        
	//   40   68:iconst_1        
	//   41   69:ior             
	//   42   70:istore_3        
		} else
	//*  43   71:iload_3         
	//*  44   72:istore          4
	//*  45   74:aload_0         
	//*  46   75:getfield        #56  <Field double m00>
	//*  47   78:aload_0         
	//*  48   79:getfield        #54  <Field double m11>
	//*  49   82:dmul            
	//*  50   83:aload_0         
	//*  51   84:getfield        #62  <Field double m01>
	//*  52   87:aload_0         
	//*  53   88:getfield        #64  <Field double m10>
	//*  54   91:dmul            
	//*  55   92:dsub            
	//*  56   93:dconst_0        
	//*  57   94:dcmpg           
	//*  58   95:ifge            104
	//*  59   98:iload_3         
	//*  60   99:bipush          64
	//*  61  101:ior             
	//*  62  102:istore          4
	//*  63  104:aload_0         
	//*  64  105:getfield        #56  <Field double m00>
	//*  65  108:aload_0         
	//*  66  109:getfield        #56  <Field double m00>
	//*  67  112:dmul            
	//*  68  113:aload_0         
	//*  69  114:getfield        #64  <Field double m10>
	//*  70  117:aload_0         
	//*  71  118:getfield        #64  <Field double m10>
	//*  72  121:dmul            
	//*  73  122:dadd            
	//*  74  123:dstore_1        
	//*  75  124:dload_1         
	//*  76  125:aload_0         
	//*  77  126:getfield        #62  <Field double m01>
	//*  78  129:aload_0         
	//*  79  130:getfield        #62  <Field double m01>
	//*  80  133:dmul            
	//*  81  134:aload_0         
	//*  82  135:getfield        #54  <Field double m11>
	//*  83  138:aload_0         
	//*  84  139:getfield        #54  <Field double m11>
	//*  85  142:dmul            
	//*  86  143:dadd            
	//*  87  144:dcmpl           
	//*  88  145:ifeq            262
	//*  89  148:iload           4
	//*  90  150:iconst_4        
	//*  91  151:ior             
	//*  92  152:istore_3        
	//*  93  153:aload_0         
	//*  94  154:getfield        #56  <Field double m00>
	//*  95  157:dconst_0        
	//*  96  158:dcmpl           
	//*  97  159:ifne            171
	//*  98  162:aload_0         
	//*  99  163:getfield        #54  <Field double m11>
	//* 100  166:dconst_0        
	//* 101  167:dcmpl           
	//* 102  168:ifeq            207
	//* 103  171:aload_0         
	//* 104  172:getfield        #64  <Field double m10>
	//* 105  175:dconst_0        
	//* 106  176:dcmpl           
	//* 107  177:ifne            279
	//* 108  180:aload_0         
	//* 109  181:getfield        #62  <Field double m01>
	//* 110  184:dconst_0        
	//* 111  185:dcmpl           
	//* 112  186:ifne            279
	//* 113  189:aload_0         
	//* 114  190:getfield        #56  <Field double m00>
	//* 115  193:dconst_0        
	//* 116  194:dcmpg           
	//* 117  195:iflt            207
	//* 118  198:aload_0         
	//* 119  199:getfield        #54  <Field double m11>
	//* 120  202:dconst_0        
	//* 121  203:dcmpg           
	//* 122  204:ifge            279
	//* 123  207:iload_3         
	//* 124  208:bipush          8
	//* 125  210:ior             
	//* 126  211:ireturn         
		{
			i = j;
	//  127  212:iload           4
	//  128  214:istore_3        
			if(m00 == 1.0D)
	//* 129  215:aload_0         
	//* 130  216:getfield        #56  <Field double m00>
	//* 131  219:dconst_1        
	//* 132  220:dcmpl           
	//* 133  221:ifne            71
			{
				i = j;
	//  134  224:iload           4
	//  135  226:istore_3        
				if(m11 == 1.0D)
	//* 136  227:aload_0         
	//* 137  228:getfield        #54  <Field double m11>
	//* 138  231:dconst_1        
	//* 139  232:dcmpl           
	//* 140  233:ifne            71
				{
					i = j;
	//  141  236:iload           4
	//  142  238:istore_3        
					if(m01 == 0.0D)
	//* 143  239:aload_0         
	//* 144  240:getfield        #62  <Field double m01>
	//* 145  243:dconst_0        
	//* 146  244:dcmpl           
	//* 147  245:ifne            71
					{
						i = j;
	//  148  248:iload           4
	//  149  250:istore_3        
						if(m10 == 0.0D)
	//* 150  251:aload_0         
	//* 151  252:getfield        #64  <Field double m10>
	//* 152  255:dconst_0        
	//* 153  256:dcmpl           
	//* 154  257:ifne            71
							return 0;
	//  155  260:iconst_0        
	//  156  261:ireturn         
					}
				}
			}
		}
		j = i;
		if(m00 * m11 - m01 * m10 < 0.0D)
			j = i | 0x40;
		d = m00 * m00 + m10 * m10;
		if(d != m01 * m01 + m11 * m11)
		{
			i = j | 4;
		} else
		{
			i = j;
	//  157  262:iload           4
	//  158  264:istore_3        
			if(d != 1.0D)
	//* 159  265:dload_1         
	//* 160  266:dconst_1        
	//* 161  267:dcmpl           
	//* 162  268:ifeq            153
				i = j | 2;
	//  163  271:iload           4
	//  164  273:iconst_2        
	//  165  274:ior             
	//  166  275:istore_3        
		}
		if(m00 == 0.0D && m11 == 0.0D || m10 == 0.0D && m01 == 0.0D && (m00 < 0.0D || m11 < 0.0D))
			return i | 8;
	//* 167  276:goto            153
		if(m01 != 0.0D)
			break; /* Loop/switch isn't completed */
	//  168  279:aload_0         
	//  169  280:getfield        #62  <Field double m01>
	//  170  283:dconst_0        
	//  171  284:dcmpl           
	//  172  285:ifne            300
		j = i;
	//  173  288:iload_3         
	//  174  289:istore          4
		if(m10 == 0.0D) goto _L4; else goto _L3
	//  175  291:aload_0         
	//  176  292:getfield        #64  <Field double m10>
	//  177  295:dconst_0        
	//  178  296:dcmpl           
	//  179  297:ifeq            14
_L3:
		return i | 0x10;
	//  180  300:iload_3         
	//  181  301:bipush          16
	//  182  303:ior             
	//  183  304:ireturn         
	}

	public int hashCode()
	{
		HashCode hashcode = new HashCode();
	//    0    0:new             #217 <Class HashCode>
	//    1    3:dup             
	//    2    4:invokespecial   #218 <Method void HashCode()>
	//    3    7:astore_1        
		hashcode.append(m00);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #56  <Field double m00>
	//    7   13:invokevirtual   #221 <Method HashCode HashCode.append(double)>
	//    8   16:pop             
		hashcode.append(m01);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #62  <Field double m01>
	//   12   22:invokevirtual   #221 <Method HashCode HashCode.append(double)>
	//   13   25:pop             
		hashcode.append(m02);
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #60  <Field double m02>
	//   17   31:invokevirtual   #221 <Method HashCode HashCode.append(double)>
	//   18   34:pop             
		hashcode.append(m10);
	//   19   35:aload_1         
	//   20   36:aload_0         
	//   21   37:getfield        #64  <Field double m10>
	//   22   40:invokevirtual   #221 <Method HashCode HashCode.append(double)>
	//   23   43:pop             
		hashcode.append(m11);
	//   24   44:aload_1         
	//   25   45:aload_0         
	//   26   46:getfield        #54  <Field double m11>
	//   27   49:invokevirtual   #221 <Method HashCode HashCode.append(double)>
	//   28   52:pop             
		hashcode.append(m12);
	//   29   53:aload_1         
	//   30   54:aload_0         
	//   31   55:getfield        #58  <Field double m12>
	//   32   58:invokevirtual   #221 <Method HashCode HashCode.append(double)>
	//   33   61:pop             
		return hashcode.hashCode();
	//   34   62:aload_1         
	//   35   63:invokevirtual   #223 <Method int HashCode.hashCode()>
	//   36   66:ireturn         
	}

	public Point2D inverseTransform(Point2D point2d, Point2D point2d1)
		throws NoninvertibleTransformException
	{
		double d = getDeterminant();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #139 <Method double getDeterminant()>
	//    2    4:dstore_3        
		if(Math.abs(d) < 1E-10D)
	//*   3    5:dload_3         
	//*   4    6:invokestatic    #145 <Method double Math.abs(double)>
	//*   5    9:ldc2w           #34  <Double 1E-10D>
	//*   6   12:dcmpg           
	//*   7   13:ifge            29
			throw new NoninvertibleTransformException(Messages.getString("awt.204"));
	//    8   16:new             #135 <Class NoninvertibleTransformException>
	//    9   19:dup             
	//   10   20:ldc1            #147 <String "awt.204">
	//   11   22:invokestatic    #153 <Method String Messages.getString(String)>
	//   12   25:invokespecial   #156 <Method void NoninvertibleTransformException(String)>
	//   13   28:athrow          
		Object obj = ((Object) (point2d1));
	//   14   29:aload_2         
	//   15   30:astore          9
		double d1;
		double d2;
		if(point2d1 == null)
	//*  16   32:aload_2         
	//*  17   33:ifnonnull       52
			if(point2d instanceof Point2D.Double)
	//*  18   36:aload_1         
	//*  19   37:instanceof      #188 <Class Point2D$Double>
	//*  20   40:ifeq            116
				obj = ((Object) (new Point2D.Double()));
	//   21   43:new             #188 <Class Point2D$Double>
	//   22   46:dup             
	//   23   47:invokespecial   #189 <Method void Point2D$Double()>
	//   24   50:astore          9
			else
	//*  25   52:aload_1         
	//*  26   53:invokevirtual   #194 <Method double Point2D.getX()>
	//*  27   56:aload_0         
	//*  28   57:getfield        #60  <Field double m02>
	//*  29   60:dsub            
	//*  30   61:dstore          5
	//*  31   63:aload_1         
	//*  32   64:invokevirtual   #197 <Method double Point2D.getY()>
	//*  33   67:aload_0         
	//*  34   68:getfield        #58  <Field double m12>
	//*  35   71:dsub            
	//*  36   72:dstore          7
	//*  37   74:aload           9
	//*  38   76:aload_0         
	//*  39   77:getfield        #54  <Field double m11>
	//*  40   80:dload           5
	//*  41   82:dmul            
	//*  42   83:aload_0         
	//*  43   84:getfield        #62  <Field double m01>
	//*  44   87:dload           7
	//*  45   89:dmul            
	//*  46   90:dsub            
	//*  47   91:dload_3         
	//*  48   92:ddiv            
	//*  49   93:aload_0         
	//*  50   94:getfield        #56  <Field double m00>
	//*  51   97:dload           7
	//*  52   99:dmul            
	//*  53  100:aload_0         
	//*  54  101:getfield        #64  <Field double m10>
	//*  55  104:dload           5
	//*  56  106:dmul            
	//*  57  107:dsub            
	//*  58  108:dload_3         
	//*  59  109:ddiv            
	//*  60  110:invokevirtual   #200 <Method void Point2D.setLocation(double, double)>
	//*  61  113:aload           9
	//*  62  115:areturn         
				obj = ((Object) (new Point2D.Float()));
	//   63  116:new             #202 <Class Point2D$Float>
	//   64  119:dup             
	//   65  120:invokespecial   #203 <Method void Point2D$Float()>
	//   66  123:astore          9
		d1 = point2d.getX() - m02;
		d2 = point2d.getY() - m12;
		((Point2D) (obj)).setLocation((m11 * d1 - m01 * d2) / d, (m00 * d2 - m10 * d1) / d);
		return ((Point2D) (obj));
	//*  67  125:goto            52
	}

	public void inverseTransform(double ad[], int i, double ad1[], int j, int k)
		throws NoninvertibleTransformException
	{
_L2:
		do
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #139 <Method double getDeterminant()>
	//*   2    4:dstore          6
	//*   3    6:dload           6
	//*   4    8:invokestatic    #145 <Method double Math.abs(double)>
	//*   5   11:ldc2w           #34  <Double 1E-10D>
	//*   6   14:dcmpg           
	//*   7   15:ifge            133
	//*   8   18:new             #135 <Class NoninvertibleTransformException>
	//*   9   21:dup             
	//*  10   22:ldc1            #147 <String "awt.204">
	//*  11   24:invokestatic    #153 <Method String Messages.getString(String)>
	//*  12   27:invokespecial   #156 <Method void NoninvertibleTransformException(String)>
	//*  13   30:athrow          
		{
			k--;
	//   14   31:iload           5
	//   15   33:iconst_1        
	//   16   34:isub            
	//   17   35:istore          5
			if(k >= 0)
	//*  18   37:iload           5
	//*  19   39:iflt            132
			{
				int l = j + 1;
	//   20   42:iload           4
	//   21   44:iconst_1        
	//   22   45:iadd            
	//   23   46:istore          12
				double d1 = ad[j] - m02;
	//   24   48:aload_1         
	//   25   49:iload           4
	//   26   51:daload          
	//   27   52:aload_0         
	//   28   53:getfield        #60  <Field double m02>
	//   29   56:dsub            
	//   30   57:dstore          8
				j = l + 1;
	//   31   59:iload           12
	//   32   61:iconst_1        
	//   33   62:iadd            
	//   34   63:istore          4
				double d2 = ad[l] - m12;
	//   35   65:aload_1         
	//   36   66:iload           12
	//   37   68:daload          
	//   38   69:aload_0         
	//   39   70:getfield        #58  <Field double m12>
	//   40   73:dsub            
	//   41   74:dstore          10
				l = i + 1;
	//   42   76:iload_2         
	//   43   77:iconst_1        
	//   44   78:iadd            
	//   45   79:istore          12
				ad1[i] = (m11 * d1 - m01 * d2) / d;
	//   46   81:aload_3         
	//   47   82:iload_2         
	//   48   83:aload_0         
	//   49   84:getfield        #54  <Field double m11>
	//   50   87:dload           8
	//   51   89:dmul            
	//   52   90:aload_0         
	//   53   91:getfield        #62  <Field double m01>
	//   54   94:dload           10
	//   55   96:dmul            
	//   56   97:dsub            
	//   57   98:dload           6
	//   58  100:ddiv            
	//   59  101:dastore         
				i = l + 1;
	//   60  102:iload           12
	//   61  104:iconst_1        
	//   62  105:iadd            
	//   63  106:istore_2        
				ad1[l] = (m00 * d2 - m10 * d1) / d;
	//   64  107:aload_3         
	//   65  108:iload           12
	//   66  110:aload_0         
	//   67  111:getfield        #56  <Field double m00>
	//   68  114:dload           10
	//   69  116:dmul            
	//   70  117:aload_0         
	//   71  118:getfield        #64  <Field double m10>
	//   72  121:dload           8
	//   73  123:dmul            
	//   74  124:dsub            
	//   75  125:dload           6
	//   76  127:ddiv            
	//   77  128:dastore         
			} else
	//*  78  129:goto            31
			{
				return;
	//   79  132:return          
			}
		} while(true);
		double d = getDeterminant();
		if(Math.abs(d) < 1E-10D)
			throw new NoninvertibleTransformException(Messages.getString("awt.204"));
		int i1 = i;
	//   80  133:iload_2         
	//   81  134:istore          12
		i = j;
	//   82  136:iload           4
	//   83  138:istore_2        
		j = i1;
	//   84  139:iload           12
	//   85  141:istore          4
		if(true) goto _L2; else goto _L1
	//   86  143:goto            31
_L1:
	}

	public void inverseTransform(float af[], int i, float af1[], int j, int k)
		throws NoninvertibleTransformException
	{
_L2:
		do
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #139 <Method double getDeterminant()>
	//*   2    4:d2f             
	//*   3    5:fstore          6
	//*   4    7:fload           6
	//*   5    9:invokestatic    #228 <Method float Math.abs(float)>
	//*   6   12:f2d             
	//*   7   13:ldc2w           #34  <Double 1E-10D>
	//*   8   16:dcmpg           
	//*   9   17:ifge            141
	//*  10   20:new             #135 <Class NoninvertibleTransformException>
	//*  11   23:dup             
	//*  12   24:ldc1            #147 <String "awt.204">
	//*  13   26:invokestatic    #153 <Method String Messages.getString(String)>
	//*  14   29:invokespecial   #156 <Method void NoninvertibleTransformException(String)>
	//*  15   32:athrow          
		{
			k--;
	//   16   33:iload           5
	//   17   35:iconst_1        
	//   18   36:isub            
	//   19   37:istore          5
			if(k >= 0)
	//*  20   39:iload           5
	//*  21   41:iflt            140
			{
				int l = j + 1;
	//   22   44:iload           4
	//   23   46:iconst_1        
	//   24   47:iadd            
	//   25   48:istore          9
				float f1 = af[j] - (float)m02;
	//   26   50:aload_1         
	//   27   51:iload           4
	//   28   53:faload          
	//   29   54:aload_0         
	//   30   55:getfield        #60  <Field double m02>
	//   31   58:d2f             
	//   32   59:fsub            
	//   33   60:fstore          7
				j = l + 1;
	//   34   62:iload           9
	//   35   64:iconst_1        
	//   36   65:iadd            
	//   37   66:istore          4
				float f2 = af[l] - (float)m12;
	//   38   68:aload_1         
	//   39   69:iload           9
	//   40   71:faload          
	//   41   72:aload_0         
	//   42   73:getfield        #58  <Field double m12>
	//   43   76:d2f             
	//   44   77:fsub            
	//   45   78:fstore          8
				l = i + 1;
	//   46   80:iload_2         
	//   47   81:iconst_1        
	//   48   82:iadd            
	//   49   83:istore          9
				af1[i] = ((float)m11 * f1 - (float)m01 * f2) / f;
	//   50   85:aload_3         
	//   51   86:iload_2         
	//   52   87:aload_0         
	//   53   88:getfield        #54  <Field double m11>
	//   54   91:d2f             
	//   55   92:fload           7
	//   56   94:fmul            
	//   57   95:aload_0         
	//   58   96:getfield        #62  <Field double m01>
	//   59   99:d2f             
	//   60  100:fload           8
	//   61  102:fmul            
	//   62  103:fsub            
	//   63  104:fload           6
	//   64  106:fdiv            
	//   65  107:fastore         
				i = l + 1;
	//   66  108:iload           9
	//   67  110:iconst_1        
	//   68  111:iadd            
	//   69  112:istore_2        
				af1[l] = ((float)m00 * f2 - (float)m10 * f1) / f;
	//   70  113:aload_3         
	//   71  114:iload           9
	//   72  116:aload_0         
	//   73  117:getfield        #56  <Field double m00>
	//   74  120:d2f             
	//   75  121:fload           8
	//   76  123:fmul            
	//   77  124:aload_0         
	//   78  125:getfield        #64  <Field double m10>
	//   79  128:d2f             
	//   80  129:fload           7
	//   81  131:fmul            
	//   82  132:fsub            
	//   83  133:fload           6
	//   84  135:fdiv            
	//   85  136:fastore         
			} else
	//*  86  137:goto            33
			{
				return;
	//   87  140:return          
			}
		} while(true);
		float f = (float)getDeterminant();
		if((double)Math.abs(f) < 1E-10D)
			throw new NoninvertibleTransformException(Messages.getString("awt.204"));
		int i1 = i;
	//   88  141:iload_2         
	//   89  142:istore          9
		i = j;
	//   90  144:iload           4
	//   91  146:istore_2        
		j = i1;
	//   92  147:iload           9
	//   93  149:istore          4
		if(true) goto _L2; else goto _L1
	//   94  151:goto            33
_L1:
	}

	public boolean isIdentity()
	{
		return getType() == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #232 <Method int getType()>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	AffineTransform multiply(AffineTransform affinetransform, AffineTransform affinetransform1)
	{
		return new AffineTransform(affinetransform.m00 * affinetransform1.m00 + affinetransform.m10 * affinetransform1.m01, affinetransform.m00 * affinetransform1.m10 + affinetransform.m10 * affinetransform1.m11, affinetransform.m01 * affinetransform1.m00 + affinetransform.m11 * affinetransform1.m01, affinetransform.m01 * affinetransform1.m10 + affinetransform.m11 * affinetransform1.m11, affinetransform.m02 * affinetransform1.m00 + affinetransform.m12 * affinetransform1.m01 + affinetransform1.m02, affinetransform.m02 * affinetransform1.m10 + affinetransform.m12 * affinetransform1.m11 + affinetransform1.m12);
	//    0    0:new             #2   <Class AffineTransform>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:getfield        #56  <Field double m00>
	//    4    8:aload_2         
	//    5    9:getfield        #56  <Field double m00>
	//    6   12:dmul            
	//    7   13:aload_1         
	//    8   14:getfield        #64  <Field double m10>
	//    9   17:aload_2         
	//   10   18:getfield        #62  <Field double m01>
	//   11   21:dmul            
	//   12   22:dadd            
	//   13   23:aload_1         
	//   14   24:getfield        #56  <Field double m00>
	//   15   27:aload_2         
	//   16   28:getfield        #64  <Field double m10>
	//   17   31:dmul            
	//   18   32:aload_1         
	//   19   33:getfield        #64  <Field double m10>
	//   20   36:aload_2         
	//   21   37:getfield        #54  <Field double m11>
	//   22   40:dmul            
	//   23   41:dadd            
	//   24   42:aload_1         
	//   25   43:getfield        #62  <Field double m01>
	//   26   46:aload_2         
	//   27   47:getfield        #56  <Field double m00>
	//   28   50:dmul            
	//   29   51:aload_1         
	//   30   52:getfield        #54  <Field double m11>
	//   31   55:aload_2         
	//   32   56:getfield        #62  <Field double m01>
	//   33   59:dmul            
	//   34   60:dadd            
	//   35   61:aload_1         
	//   36   62:getfield        #62  <Field double m01>
	//   37   65:aload_2         
	//   38   66:getfield        #64  <Field double m10>
	//   39   69:dmul            
	//   40   70:aload_1         
	//   41   71:getfield        #54  <Field double m11>
	//   42   74:aload_2         
	//   43   75:getfield        #54  <Field double m11>
	//   44   78:dmul            
	//   45   79:dadd            
	//   46   80:aload_1         
	//   47   81:getfield        #60  <Field double m02>
	//   48   84:aload_2         
	//   49   85:getfield        #56  <Field double m00>
	//   50   88:dmul            
	//   51   89:aload_1         
	//   52   90:getfield        #58  <Field double m12>
	//   53   93:aload_2         
	//   54   94:getfield        #62  <Field double m01>
	//   55   97:dmul            
	//   56   98:dadd            
	//   57   99:aload_2         
	//   58  100:getfield        #60  <Field double m02>
	//   59  103:dadd            
	//   60  104:aload_1         
	//   61  105:getfield        #60  <Field double m02>
	//   62  108:aload_2         
	//   63  109:getfield        #64  <Field double m10>
	//   64  112:dmul            
	//   65  113:aload_1         
	//   66  114:getfield        #58  <Field double m12>
	//   67  117:aload_2         
	//   68  118:getfield        #54  <Field double m11>
	//   69  121:dmul            
	//   70  122:dadd            
	//   71  123:aload_2         
	//   72  124:getfield        #58  <Field double m12>
	//   73  127:dadd            
	//   74  128:invokespecial   #158 <Method void AffineTransform(double, double, double, double, double, double)>
	//   75  131:areturn         
	}

	public void preConcatenate(AffineTransform affinetransform)
	{
		setTransform(multiply(this, affinetransform));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #128 <Method AffineTransform multiply(AffineTransform, AffineTransform)>
	//    5    7:invokevirtual   #131 <Method void setTransform(AffineTransform)>
	//    6   10:return          
	}

	public void rotate(double d)
	{
		concatenate(getRotateInstance(d));
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:invokestatic    #236 <Method AffineTransform getRotateInstance(double)>
	//    3    5:invokevirtual   #238 <Method void concatenate(AffineTransform)>
	//    4    8:return          
	}

	public void rotate(double d, double d1, double d2)
	{
		concatenate(getRotateInstance(d, d1, d2));
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:dload_3         
	//    3    3:dload           5
	//    4    5:invokestatic    #240 <Method AffineTransform getRotateInstance(double, double, double)>
	//    5    8:invokevirtual   #238 <Method void concatenate(AffineTransform)>
	//    6   11:return          
	}

	public void scale(double d, double d1)
	{
		concatenate(getScaleInstance(d, d1));
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:dload_3         
	//    3    3:invokestatic    #243 <Method AffineTransform getScaleInstance(double, double)>
	//    4    6:invokevirtual   #238 <Method void concatenate(AffineTransform)>
	//    5    9:return          
	}

	public void setToIdentity()
	{
		type = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #52  <Field int type>
		m11 = 1.0D;
	//    3    5:aload_0         
	//    4    6:dconst_1        
	//    5    7:putfield        #54  <Field double m11>
		m00 = 1.0D;
	//    6   10:aload_0         
	//    7   11:dconst_1        
	//    8   12:putfield        #56  <Field double m00>
		m12 = 0.0D;
	//    9   15:aload_0         
	//   10   16:dconst_0        
	//   11   17:putfield        #58  <Field double m12>
		m02 = 0.0D;
	//   12   20:aload_0         
	//   13   21:dconst_0        
	//   14   22:putfield        #60  <Field double m02>
		m01 = 0.0D;
	//   15   25:aload_0         
	//   16   26:dconst_0        
	//   17   27:putfield        #62  <Field double m01>
		m10 = 0.0D;
	//   18   30:aload_0         
	//   19   31:dconst_0        
	//   20   32:putfield        #64  <Field double m10>
	//   21   35:return          
	}

	public void setToRotation(double d)
	{
		double d2;
		double d3;
		d2 = Math.sin(d);
	//    0    0:dload_1         
	//    1    1:invokestatic    #247 <Method double Math.sin(double)>
	//    2    4:dstore          5
		d3 = Math.cos(d);
	//    3    6:dload_1         
	//    4    7:invokestatic    #250 <Method double Math.cos(double)>
	//    5   10:dstore          7
		if(Math.abs(d3) >= 1E-10D) goto _L2; else goto _L1
	//    6   12:dload           7
	//    7   14:invokestatic    #145 <Method double Math.abs(double)>
	//    8   17:ldc2w           #34  <Double 1E-10D>
	//    9   20:dcmpg           
	//   10   21:ifge            79
_L1:
		double d1;
		d1 = 0.0D;
	//   11   24:dconst_0        
	//   12   25:dstore_3        
		if(d2 > 0.0D)
	//*  13   26:dload           5
	//*  14   28:dconst_0        
	//*  15   29:dcmpl           
	//*  16   30:ifle            72
			d = 1.0D;
	//   17   33:dconst_1        
	//   18   34:dstore_1        
		else
	//*  19   35:aload_0         
	//*  20   36:dload_3         
	//*  21   37:putfield        #54  <Field double m11>
	//*  22   40:aload_0         
	//*  23   41:dload_3         
	//*  24   42:putfield        #56  <Field double m00>
	//*  25   45:aload_0         
	//*  26   46:dload_1         
	//*  27   47:dneg            
	//*  28   48:putfield        #62  <Field double m01>
	//*  29   51:aload_0         
	//*  30   52:dload_1         
	//*  31   53:putfield        #64  <Field double m10>
	//*  32   56:aload_0         
	//*  33   57:dconst_0        
	//*  34   58:putfield        #58  <Field double m12>
	//*  35   61:aload_0         
	//*  36   62:dconst_0        
	//*  37   63:putfield        #60  <Field double m02>
	//*  38   66:aload_0         
	//*  39   67:iconst_m1       
	//*  40   68:putfield        #52  <Field int type>
	//*  41   71:return          
			d = -1D;
	//   42   72:ldc2w           #251 <Double -1D>
	//   43   75:dstore_1        
_L4:
		m11 = d1;
		m00 = d1;
		m01 = -d;
		m10 = d;
		m12 = 0.0D;
		m02 = 0.0D;
		type = -1;
		return;
	//*  44   76:goto            35
_L2:
		d1 = d3;
	//   45   79:dload           7
	//   46   81:dstore_3        
		d = d2;
	//   47   82:dload           5
	//   48   84:dstore_1        
		if(Math.abs(d2) < 1E-10D)
	//*  49   85:dload           5
	//*  50   87:invokestatic    #145 <Method double Math.abs(double)>
	//*  51   90:ldc2w           #34  <Double 1E-10D>
	//*  52   93:dcmpg           
	//*  53   94:ifge            35
		{
			d = 0.0D;
	//   54   97:dconst_0        
	//   55   98:dstore_1        
			if(d3 > 0.0D)
	//*  56   99:dload           7
	//*  57  101:dconst_0        
	//*  58  102:dcmpl           
	//*  59  103:ifle            111
				d1 = 1.0D;
	//   60  106:dconst_1        
	//   61  107:dstore_3        
			else
	//*  62  108:goto            35
				d1 = -1D;
	//   63  111:ldc2w           #251 <Double -1D>
	//   64  114:dstore_3        
		}
		if(true) goto _L4; else goto _L3
	//   65  115:goto            108
_L3:
	}

	public void setToRotation(double d, double d1, double d2)
	{
		setToRotation(d);
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:invokevirtual   #77  <Method void setToRotation(double)>
		m02 = (1.0D - m00) * d1 + m10 * d2;
	//    3    5:aload_0         
	//    4    6:dconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #56  <Field double m00>
	//    7   11:dsub            
	//    8   12:dload_3         
	//    9   13:dmul            
	//   10   14:aload_0         
	//   11   15:getfield        #64  <Field double m10>
	//   12   18:dload           5
	//   13   20:dmul            
	//   14   21:dadd            
	//   15   22:putfield        #60  <Field double m02>
		m12 = (1.0D - m00) * d2 - m10 * d1;
	//   16   25:aload_0         
	//   17   26:dconst_1        
	//   18   27:aload_0         
	//   19   28:getfield        #56  <Field double m00>
	//   20   31:dsub            
	//   21   32:dload           5
	//   22   34:dmul            
	//   23   35:aload_0         
	//   24   36:getfield        #64  <Field double m10>
	//   25   39:dload_3         
	//   26   40:dmul            
	//   27   41:dsub            
	//   28   42:putfield        #58  <Field double m12>
		type = -1;
	//   29   45:aload_0         
	//   30   46:iconst_m1       
	//   31   47:putfield        #52  <Field int type>
	//   32   50:return          
	}

	public void setToScale(double d, double d1)
	{
		m00 = d;
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:putfield        #56  <Field double m00>
		m11 = d1;
	//    3    5:aload_0         
	//    4    6:dload_3         
	//    5    7:putfield        #54  <Field double m11>
		m12 = 0.0D;
	//    6   10:aload_0         
	//    7   11:dconst_0        
	//    8   12:putfield        #58  <Field double m12>
		m02 = 0.0D;
	//    9   15:aload_0         
	//   10   16:dconst_0        
	//   11   17:putfield        #60  <Field double m02>
		m01 = 0.0D;
	//   12   20:aload_0         
	//   13   21:dconst_0        
	//   14   22:putfield        #62  <Field double m01>
		m10 = 0.0D;
	//   15   25:aload_0         
	//   16   26:dconst_0        
	//   17   27:putfield        #64  <Field double m10>
		if(d != 1.0D || d1 != 1.0D)
	//*  18   30:dload_1         
	//*  19   31:dconst_1        
	//*  20   32:dcmpl           
	//*  21   33:ifne            42
	//*  22   36:dload_3         
	//*  23   37:dconst_1        
	//*  24   38:dcmpl           
	//*  25   39:ifeq            48
		{
			type = -1;
	//   26   42:aload_0         
	//   27   43:iconst_m1       
	//   28   44:putfield        #52  <Field int type>
			return;
	//   29   47:return          
		} else
		{
			type = 0;
	//   30   48:aload_0         
	//   31   49:iconst_0        
	//   32   50:putfield        #52  <Field int type>
			return;
	//   33   53:return          
		}
	}

	public void setToShear(double d, double d1)
	{
		m11 = 1.0D;
	//    0    0:aload_0         
	//    1    1:dconst_1        
	//    2    2:putfield        #54  <Field double m11>
		m00 = 1.0D;
	//    3    5:aload_0         
	//    4    6:dconst_1        
	//    5    7:putfield        #56  <Field double m00>
		m12 = 0.0D;
	//    6   10:aload_0         
	//    7   11:dconst_0        
	//    8   12:putfield        #58  <Field double m12>
		m02 = 0.0D;
	//    9   15:aload_0         
	//   10   16:dconst_0        
	//   11   17:putfield        #60  <Field double m02>
		m01 = d;
	//   12   20:aload_0         
	//   13   21:dload_1         
	//   14   22:putfield        #62  <Field double m01>
		m10 = d1;
	//   15   25:aload_0         
	//   16   26:dload_3         
	//   17   27:putfield        #64  <Field double m10>
		if(d != 0.0D || d1 != 0.0D)
	//*  18   30:dload_1         
	//*  19   31:dconst_0        
	//*  20   32:dcmpl           
	//*  21   33:ifne            42
	//*  22   36:dload_3         
	//*  23   37:dconst_0        
	//*  24   38:dcmpl           
	//*  25   39:ifeq            48
		{
			type = -1;
	//   26   42:aload_0         
	//   27   43:iconst_m1       
	//   28   44:putfield        #52  <Field int type>
			return;
	//   29   47:return          
		} else
		{
			type = 0;
	//   30   48:aload_0         
	//   31   49:iconst_0        
	//   32   50:putfield        #52  <Field int type>
			return;
	//   33   53:return          
		}
	}

	public void setToTranslation(double d, double d1)
	{
		m11 = 1.0D;
	//    0    0:aload_0         
	//    1    1:dconst_1        
	//    2    2:putfield        #54  <Field double m11>
		m00 = 1.0D;
	//    3    5:aload_0         
	//    4    6:dconst_1        
	//    5    7:putfield        #56  <Field double m00>
		m10 = 0.0D;
	//    6   10:aload_0         
	//    7   11:dconst_0        
	//    8   12:putfield        #64  <Field double m10>
		m01 = 0.0D;
	//    9   15:aload_0         
	//   10   16:dconst_0        
	//   11   17:putfield        #62  <Field double m01>
		m02 = d;
	//   12   20:aload_0         
	//   13   21:dload_1         
	//   14   22:putfield        #60  <Field double m02>
		m12 = d1;
	//   15   25:aload_0         
	//   16   26:dload_3         
	//   17   27:putfield        #58  <Field double m12>
		if(d == 0.0D && d1 == 0.0D)
	//*  18   30:dload_1         
	//*  19   31:dconst_0        
	//*  20   32:dcmpl           
	//*  21   33:ifne            48
	//*  22   36:dload_3         
	//*  23   37:dconst_0        
	//*  24   38:dcmpl           
	//*  25   39:ifne            48
		{
			type = 0;
	//   26   42:aload_0         
	//   27   43:iconst_0        
	//   28   44:putfield        #52  <Field int type>
			return;
	//   29   47:return          
		} else
		{
			type = 1;
	//   30   48:aload_0         
	//   31   49:iconst_1        
	//   32   50:putfield        #52  <Field int type>
			return;
	//   33   53:return          
		}
	}

	public void setTransform(double d, double d1, double d2, double d3, double d4, double d5)
	{
		type = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #52  <Field int type>
		m00 = d;
	//    3    5:aload_0         
	//    4    6:dload_1         
	//    5    7:putfield        #56  <Field double m00>
		m10 = d1;
	//    6   10:aload_0         
	//    7   11:dload_3         
	//    8   12:putfield        #64  <Field double m10>
		m01 = d2;
	//    9   15:aload_0         
	//   10   16:dload           5
	//   11   18:putfield        #62  <Field double m01>
		m11 = d3;
	//   12   21:aload_0         
	//   13   22:dload           7
	//   14   24:putfield        #54  <Field double m11>
		m02 = d4;
	//   15   27:aload_0         
	//   16   28:dload           9
	//   17   30:putfield        #60  <Field double m02>
		m12 = d5;
	//   18   33:aload_0         
	//   19   34:dload           11
	//   20   36:putfield        #58  <Field double m12>
	//   21   39:return          
	}

	public void setTransform(AffineTransform affinetransform)
	{
		type = affinetransform.type;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #52  <Field int type>
	//    3    5:putfield        #52  <Field int type>
		setTransform(affinetransform.m00, affinetransform.m10, affinetransform.m01, affinetransform.m11, affinetransform.m02, affinetransform.m12);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #56  <Field double m00>
	//    7   13:aload_1         
	//    8   14:getfield        #64  <Field double m10>
	//    9   17:aload_1         
	//   10   18:getfield        #62  <Field double m01>
	//   11   21:aload_1         
	//   12   22:getfield        #54  <Field double m11>
	//   13   25:aload_1         
	//   14   26:getfield        #60  <Field double m02>
	//   15   29:aload_1         
	//   16   30:getfield        #58  <Field double m12>
	//   17   33:invokevirtual   #254 <Method void setTransform(double, double, double, double, double, double)>
	//   18   36:return          
	}

	public void shear(double d, double d1)
	{
		concatenate(getShearInstance(d, d1));
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:dload_3         
	//    3    3:invokestatic    #257 <Method AffineTransform getShearInstance(double, double)>
	//    4    6:invokevirtual   #238 <Method void concatenate(AffineTransform)>
	//    5    9:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append(((Object)this).getClass().getName()).append("[[").append(m00).append(", ").append(m01).append(", ").append(m02).append("], [").append(m10).append(", ").append(m11).append(", ").append(m12).append("]]").toString();
	//    0    0:new             #261 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #262 <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #266 <Method Class Object.getClass()>
	//    5   11:invokevirtual   #271 <Method String Class.getName()>
	//    6   14:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:ldc2            #276 <String "[[">
	//    8   20:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//    9   23:aload_0         
	//   10   24:getfield        #56  <Field double m00>
	//   11   27:invokevirtual   #279 <Method StringBuilder StringBuilder.append(double)>
	//   12   30:ldc2            #281 <String ", ">
	//   13   33:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   14   36:aload_0         
	//   15   37:getfield        #62  <Field double m01>
	//   16   40:invokevirtual   #279 <Method StringBuilder StringBuilder.append(double)>
	//   17   43:ldc2            #281 <String ", ">
	//   18   46:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   19   49:aload_0         
	//   20   50:getfield        #60  <Field double m02>
	//   21   53:invokevirtual   #279 <Method StringBuilder StringBuilder.append(double)>
	//   22   56:ldc2            #283 <String "], [">
	//   23   59:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   24   62:aload_0         
	//   25   63:getfield        #64  <Field double m10>
	//   26   66:invokevirtual   #279 <Method StringBuilder StringBuilder.append(double)>
	//   27   69:ldc2            #281 <String ", ">
	//   28   72:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   29   75:aload_0         
	//   30   76:getfield        #54  <Field double m11>
	//   31   79:invokevirtual   #279 <Method StringBuilder StringBuilder.append(double)>
	//   32   82:ldc2            #281 <String ", ">
	//   33   85:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   34   88:aload_0         
	//   35   89:getfield        #58  <Field double m12>
	//   36   92:invokevirtual   #279 <Method StringBuilder StringBuilder.append(double)>
	//   37   95:ldc2            #285 <String "]]">
	//   38   98:invokevirtual   #274 <Method StringBuilder StringBuilder.append(String)>
	//   39  101:invokevirtual   #287 <Method String StringBuilder.toString()>
	//   40  104:areturn         
	}

	public Point2D transform(Point2D point2d, Point2D point2d1)
	{
		Object obj = ((Object) (point2d1));
	//    0    0:aload_2         
	//    1    1:astore          7
		double d;
		double d1;
		if(point2d1 == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       23
			if(point2d instanceof Point2D.Double)
	//*   4    7:aload_1         
	//*   5    8:instanceof      #188 <Class Point2D$Double>
	//*   6   11:ifeq            80
				obj = ((Object) (new Point2D.Double()));
	//    7   14:new             #188 <Class Point2D$Double>
	//    8   17:dup             
	//    9   18:invokespecial   #189 <Method void Point2D$Double()>
	//   10   21:astore          7
			else
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #194 <Method double Point2D.getX()>
	//*  13   27:dstore_3        
	//*  14   28:aload_1         
	//*  15   29:invokevirtual   #197 <Method double Point2D.getY()>
	//*  16   32:dstore          5
	//*  17   34:aload           7
	//*  18   36:aload_0         
	//*  19   37:getfield        #56  <Field double m00>
	//*  20   40:dload_3         
	//*  21   41:dmul            
	//*  22   42:aload_0         
	//*  23   43:getfield        #62  <Field double m01>
	//*  24   46:dload           5
	//*  25   48:dmul            
	//*  26   49:dadd            
	//*  27   50:aload_0         
	//*  28   51:getfield        #60  <Field double m02>
	//*  29   54:dadd            
	//*  30   55:aload_0         
	//*  31   56:getfield        #64  <Field double m10>
	//*  32   59:dload_3         
	//*  33   60:dmul            
	//*  34   61:aload_0         
	//*  35   62:getfield        #54  <Field double m11>
	//*  36   65:dload           5
	//*  37   67:dmul            
	//*  38   68:dadd            
	//*  39   69:aload_0         
	//*  40   70:getfield        #58  <Field double m12>
	//*  41   73:dadd            
	//*  42   74:invokevirtual   #200 <Method void Point2D.setLocation(double, double)>
	//*  43   77:aload           7
	//*  44   79:areturn         
				obj = ((Object) (new Point2D.Float()));
	//   45   80:new             #202 <Class Point2D$Float>
	//   46   83:dup             
	//   47   84:invokespecial   #203 <Method void Point2D$Float()>
	//   48   87:astore          7
		d = point2d.getX();
		d1 = point2d.getY();
		((Point2D) (obj)).setLocation(m00 * d + m01 * d1 + m02, m10 * d + m11 * d1 + m12);
		return ((Point2D) (obj));
	//*  49   89:goto            23
	}

	public void transform(double ad[], int i, double ad1[], int j, int k)
	{
		byte byte1 = 2;
	//    0    0:iconst_2        
	//    1    1:istore          14
		byte byte0 = byte1;
	//    2    3:iload           14
	//    3    5:istore          12
		int i1 = i;
	//    4    7:iload_2         
	//    5    8:istore          11
		int l = j;
	//    6   10:iload           4
	//    7   12:istore          10
		int j1 = k;
	//    8   14:iload           5
	//    9   16:istore          13
		if(ad == ad1)
	//*  10   18:aload_1         
	//*  11   19:aload_3         
	//*  12   20:if_acmpne       99
		{
			byte0 = byte1;
	//   13   23:iload           14
	//   14   25:istore          12
			i1 = i;
	//   15   27:iload_2         
	//   16   28:istore          11
			l = j;
	//   17   30:iload           4
	//   18   32:istore          10
			j1 = k;
	//   19   34:iload           5
	//   20   36:istore          13
			if(i < j)
	//*  21   38:iload_2         
	//*  22   39:iload           4
	//*  23   41:icmpge          99
			{
				byte0 = byte1;
	//   24   44:iload           14
	//   25   46:istore          12
				i1 = i;
	//   26   48:iload_2         
	//   27   49:istore          11
				l = j;
	//   28   51:iload           4
	//   29   53:istore          10
				j1 = k;
	//   30   55:iload           5
	//   31   57:istore          13
				if(j < k * 2 + i)
	//*  32   59:iload           4
	//*  33   61:iload           5
	//*  34   63:iconst_2        
	//*  35   64:imul            
	//*  36   65:iload_2         
	//*  37   66:iadd            
	//*  38   67:icmpge          99
				{
					i1 = (k * 2 + i) - 2;
	//   39   70:iload           5
	//   40   72:iconst_2        
	//   41   73:imul            
	//   42   74:iload_2         
	//   43   75:iadd            
	//   44   76:iconst_2        
	//   45   77:isub            
	//   46   78:istore          11
					l = (k * 2 + j) - 2;
	//   47   80:iload           5
	//   48   82:iconst_2        
	//   49   83:imul            
	//   50   84:iload           4
	//   51   86:iadd            
	//   52   87:iconst_2        
	//   53   88:isub            
	//   54   89:istore          10
					byte0 = -2;
	//   55   91:bipush          -2
	//   56   93:istore          12
					j1 = k;
	//   57   95:iload           5
	//   58   97:istore          13
				}
			}
		}
		do
		{
			j1--;
	//   59   99:iload           13
	//   60  101:iconst_1        
	//   61  102:isub            
	//   62  103:istore          13
			if(j1 >= 0)
	//*  63  105:iload           13
	//*  64  107:iflt            195
			{
				double d = ad[i1 + 0];
	//   65  110:aload_1         
	//   66  111:iload           11
	//   67  113:iconst_0        
	//   68  114:iadd            
	//   69  115:daload          
	//   70  116:dstore          6
				double d1 = ad[i1 + 1];
	//   71  118:aload_1         
	//   72  119:iload           11
	//   73  121:iconst_1        
	//   74  122:iadd            
	//   75  123:daload          
	//   76  124:dstore          8
				ad1[l + 0] = m00 * d + m01 * d1 + m02;
	//   77  126:aload_3         
	//   78  127:iload           10
	//   79  129:iconst_0        
	//   80  130:iadd            
	//   81  131:aload_0         
	//   82  132:getfield        #56  <Field double m00>
	//   83  135:dload           6
	//   84  137:dmul            
	//   85  138:aload_0         
	//   86  139:getfield        #62  <Field double m01>
	//   87  142:dload           8
	//   88  144:dmul            
	//   89  145:dadd            
	//   90  146:aload_0         
	//   91  147:getfield        #60  <Field double m02>
	//   92  150:dadd            
	//   93  151:dastore         
				ad1[l + 1] = m10 * d + m11 * d1 + m12;
	//   94  152:aload_3         
	//   95  153:iload           10
	//   96  155:iconst_1        
	//   97  156:iadd            
	//   98  157:aload_0         
	//   99  158:getfield        #64  <Field double m10>
	//  100  161:dload           6
	//  101  163:dmul            
	//  102  164:aload_0         
	//  103  165:getfield        #54  <Field double m11>
	//  104  168:dload           8
	//  105  170:dmul            
	//  106  171:dadd            
	//  107  172:aload_0         
	//  108  173:getfield        #58  <Field double m12>
	//  109  176:dadd            
	//  110  177:dastore         
				i1 += ((int) (byte0));
	//  111  178:iload           11
	//  112  180:iload           12
	//  113  182:iadd            
	//  114  183:istore          11
				l += ((int) (byte0));
	//  115  185:iload           10
	//  116  187:iload           12
	//  117  189:iadd            
	//  118  190:istore          10
			} else
	//* 119  192:goto            99
			{
				return;
	//  120  195:return          
			}
		} while(true);
	}

	public void transform(double ad[], int i, float af[], int j, int k)
	{
		int l = k;
	//    0    0:iload           5
	//    1    2:istore          10
		k = i;
	//    2    4:iload_2         
	//    3    5:istore          5
		i = j;
	//    4    7:iload           4
	//    5    9:istore_2        
		do
		{
			l--;
	//    6   10:iload           10
	//    7   12:iconst_1        
	//    8   13:isub            
	//    9   14:istore          10
			if(l >= 0)
	//*  10   16:iload           10
	//*  11   18:iflt            107
			{
				j = k + 1;
	//   12   21:iload           5
	//   13   23:iconst_1        
	//   14   24:iadd            
	//   15   25:istore          4
				double d = ad[k];
	//   16   27:aload_1         
	//   17   28:iload           5
	//   18   30:daload          
	//   19   31:dstore          6
				k = j + 1;
	//   20   33:iload           4
	//   21   35:iconst_1        
	//   22   36:iadd            
	//   23   37:istore          5
				double d1 = ad[j];
	//   24   39:aload_1         
	//   25   40:iload           4
	//   26   42:daload          
	//   27   43:dstore          8
				j = i + 1;
	//   28   45:iload_2         
	//   29   46:iconst_1        
	//   30   47:iadd            
	//   31   48:istore          4
				af[i] = (float)(m00 * d + m01 * d1 + m02);
	//   32   50:aload_3         
	//   33   51:iload_2         
	//   34   52:aload_0         
	//   35   53:getfield        #56  <Field double m00>
	//   36   56:dload           6
	//   37   58:dmul            
	//   38   59:aload_0         
	//   39   60:getfield        #62  <Field double m01>
	//   40   63:dload           8
	//   41   65:dmul            
	//   42   66:dadd            
	//   43   67:aload_0         
	//   44   68:getfield        #60  <Field double m02>
	//   45   71:dadd            
	//   46   72:d2f             
	//   47   73:fastore         
				i = j + 1;
	//   48   74:iload           4
	//   49   76:iconst_1        
	//   50   77:iadd            
	//   51   78:istore_2        
				af[j] = (float)(m10 * d + m11 * d1 + m12);
	//   52   79:aload_3         
	//   53   80:iload           4
	//   54   82:aload_0         
	//   55   83:getfield        #64  <Field double m10>
	//   56   86:dload           6
	//   57   88:dmul            
	//   58   89:aload_0         
	//   59   90:getfield        #54  <Field double m11>
	//   60   93:dload           8
	//   61   95:dmul            
	//   62   96:dadd            
	//   63   97:aload_0         
	//   64   98:getfield        #58  <Field double m12>
	//   65  101:dadd            
	//   66  102:d2f             
	//   67  103:fastore         
			} else
	//*  68  104:goto            10
			{
				return;
	//   69  107:return          
			}
		} while(true);
	}

	public void transform(float af[], int i, double ad[], int j, int k)
	{
		int l = k;
	//    0    0:iload           5
	//    1    2:istore          8
		k = i;
	//    2    4:iload_2         
	//    3    5:istore          5
		i = j;
	//    4    7:iload           4
	//    5    9:istore_2        
		do
		{
			l--;
	//    6   10:iload           8
	//    7   12:iconst_1        
	//    8   13:isub            
	//    9   14:istore          8
			if(l >= 0)
	//*  10   16:iload           8
	//*  11   18:iflt            109
			{
				j = k + 1;
	//   12   21:iload           5
	//   13   23:iconst_1        
	//   14   24:iadd            
	//   15   25:istore          4
				float f = af[k];
	//   16   27:aload_1         
	//   17   28:iload           5
	//   18   30:faload          
	//   19   31:fstore          6
				k = j + 1;
	//   20   33:iload           4
	//   21   35:iconst_1        
	//   22   36:iadd            
	//   23   37:istore          5
				float f1 = af[j];
	//   24   39:aload_1         
	//   25   40:iload           4
	//   26   42:faload          
	//   27   43:fstore          7
				j = i + 1;
	//   28   45:iload_2         
	//   29   46:iconst_1        
	//   30   47:iadd            
	//   31   48:istore          4
				ad[i] = (double)f * m00 + (double)f1 * m01 + m02;
	//   32   50:aload_3         
	//   33   51:iload_2         
	//   34   52:fload           6
	//   35   54:f2d             
	//   36   55:aload_0         
	//   37   56:getfield        #56  <Field double m00>
	//   38   59:dmul            
	//   39   60:fload           7
	//   40   62:f2d             
	//   41   63:aload_0         
	//   42   64:getfield        #62  <Field double m01>
	//   43   67:dmul            
	//   44   68:dadd            
	//   45   69:aload_0         
	//   46   70:getfield        #60  <Field double m02>
	//   47   73:dadd            
	//   48   74:dastore         
				i = j + 1;
	//   49   75:iload           4
	//   50   77:iconst_1        
	//   51   78:iadd            
	//   52   79:istore_2        
				ad[j] = (double)f * m10 + (double)f1 * m11 + m12;
	//   53   80:aload_3         
	//   54   81:iload           4
	//   55   83:fload           6
	//   56   85:f2d             
	//   57   86:aload_0         
	//   58   87:getfield        #64  <Field double m10>
	//   59   90:dmul            
	//   60   91:fload           7
	//   61   93:f2d             
	//   62   94:aload_0         
	//   63   95:getfield        #54  <Field double m11>
	//   64   98:dmul            
	//   65   99:dadd            
	//   66  100:aload_0         
	//   67  101:getfield        #58  <Field double m12>
	//   68  104:dadd            
	//   69  105:dastore         
			} else
	//*  70  106:goto            10
			{
				return;
	//   71  109:return          
			}
		} while(true);
	}

	public void transform(float af[], int i, float af1[], int j, int k)
	{
		byte byte1 = 2;
	//    0    0:iconst_2        
	//    1    1:istore          12
		byte byte0 = byte1;
	//    2    3:iload           12
	//    3    5:istore          10
		int i1 = i;
	//    4    7:iload_2         
	//    5    8:istore          9
		int l = j;
	//    6   10:iload           4
	//    7   12:istore          8
		int j1 = k;
	//    8   14:iload           5
	//    9   16:istore          11
		if(af == af1)
	//*  10   18:aload_1         
	//*  11   19:aload_3         
	//*  12   20:if_acmpne       99
		{
			byte0 = byte1;
	//   13   23:iload           12
	//   14   25:istore          10
			i1 = i;
	//   15   27:iload_2         
	//   16   28:istore          9
			l = j;
	//   17   30:iload           4
	//   18   32:istore          8
			j1 = k;
	//   19   34:iload           5
	//   20   36:istore          11
			if(i < j)
	//*  21   38:iload_2         
	//*  22   39:iload           4
	//*  23   41:icmpge          99
			{
				byte0 = byte1;
	//   24   44:iload           12
	//   25   46:istore          10
				i1 = i;
	//   26   48:iload_2         
	//   27   49:istore          9
				l = j;
	//   28   51:iload           4
	//   29   53:istore          8
				j1 = k;
	//   30   55:iload           5
	//   31   57:istore          11
				if(j < k * 2 + i)
	//*  32   59:iload           4
	//*  33   61:iload           5
	//*  34   63:iconst_2        
	//*  35   64:imul            
	//*  36   65:iload_2         
	//*  37   66:iadd            
	//*  38   67:icmpge          99
				{
					i1 = (k * 2 + i) - 2;
	//   39   70:iload           5
	//   40   72:iconst_2        
	//   41   73:imul            
	//   42   74:iload_2         
	//   43   75:iadd            
	//   44   76:iconst_2        
	//   45   77:isub            
	//   46   78:istore          9
					l = (k * 2 + j) - 2;
	//   47   80:iload           5
	//   48   82:iconst_2        
	//   49   83:imul            
	//   50   84:iload           4
	//   51   86:iadd            
	//   52   87:iconst_2        
	//   53   88:isub            
	//   54   89:istore          8
					byte0 = -2;
	//   55   91:bipush          -2
	//   56   93:istore          10
					j1 = k;
	//   57   95:iload           5
	//   58   97:istore          11
				}
			}
		}
		do
		{
			j1--;
	//   59   99:iload           11
	//   60  101:iconst_1        
	//   61  102:isub            
	//   62  103:istore          11
			if(j1 >= 0)
	//*  63  105:iload           11
	//*  64  107:iflt            201
			{
				float f = af[i1 + 0];
	//   65  110:aload_1         
	//   66  111:iload           9
	//   67  113:iconst_0        
	//   68  114:iadd            
	//   69  115:faload          
	//   70  116:fstore          6
				float f1 = af[i1 + 1];
	//   71  118:aload_1         
	//   72  119:iload           9
	//   73  121:iconst_1        
	//   74  122:iadd            
	//   75  123:faload          
	//   76  124:fstore          7
				af1[l + 0] = (float)((double)f * m00 + (double)f1 * m01 + m02);
	//   77  126:aload_3         
	//   78  127:iload           8
	//   79  129:iconst_0        
	//   80  130:iadd            
	//   81  131:fload           6
	//   82  133:f2d             
	//   83  134:aload_0         
	//   84  135:getfield        #56  <Field double m00>
	//   85  138:dmul            
	//   86  139:fload           7
	//   87  141:f2d             
	//   88  142:aload_0         
	//   89  143:getfield        #62  <Field double m01>
	//   90  146:dmul            
	//   91  147:dadd            
	//   92  148:aload_0         
	//   93  149:getfield        #60  <Field double m02>
	//   94  152:dadd            
	//   95  153:d2f             
	//   96  154:fastore         
				af1[l + 1] = (float)((double)f * m10 + (double)f1 * m11 + m12);
	//   97  155:aload_3         
	//   98  156:iload           8
	//   99  158:iconst_1        
	//  100  159:iadd            
	//  101  160:fload           6
	//  102  162:f2d             
	//  103  163:aload_0         
	//  104  164:getfield        #64  <Field double m10>
	//  105  167:dmul            
	//  106  168:fload           7
	//  107  170:f2d             
	//  108  171:aload_0         
	//  109  172:getfield        #54  <Field double m11>
	//  110  175:dmul            
	//  111  176:dadd            
	//  112  177:aload_0         
	//  113  178:getfield        #58  <Field double m12>
	//  114  181:dadd            
	//  115  182:d2f             
	//  116  183:fastore         
				i1 += ((int) (byte0));
	//  117  184:iload           9
	//  118  186:iload           10
	//  119  188:iadd            
	//  120  189:istore          9
				l += ((int) (byte0));
	//  121  191:iload           8
	//  122  193:iload           10
	//  123  195:iadd            
	//  124  196:istore          8
			} else
	//* 125  198:goto            99
			{
				return;
	//  126  201:return          
			}
		} while(true);
	}

	public void transform(Point2D apoint2d[], int i, Point2D apoint2d1[], int j, int k)
	{
		do
		{
			k--;
	//    0    0:iload           5
	//    1    2:iconst_1        
	//    2    3:isub            
	//    3    4:istore          5
			if(k >= 0)
	//*   4    6:iload           5
	//*   5    8:iflt            138
			{
				Point2D point2d1 = apoint2d[i];
	//    6   11:aload_1         
	//    7   12:iload_2         
	//    8   13:aaload          
	//    9   14:astore          12
				double d = point2d1.getX();
	//   10   16:aload           12
	//   11   18:invokevirtual   #194 <Method double Point2D.getX()>
	//   12   21:dstore          6
				double d1 = point2d1.getY();
	//   13   23:aload           12
	//   14   25:invokevirtual   #197 <Method double Point2D.getY()>
	//   15   28:dstore          8
				Point2D point2d = apoint2d1[j];
	//   16   30:aload_3         
	//   17   31:iload           4
	//   18   33:aaload          
	//   19   34:astore          11
				Object obj = ((Object) (point2d));
	//   20   36:aload           11
	//   21   38:astore          10
				if(point2d == null)
	//*  22   40:aload           11
	//*  23   42:ifnonnull       62
					if(point2d1 instanceof Point2D.Double)
	//*  24   45:aload           12
	//*  25   47:instanceof      #188 <Class Point2D$Double>
	//*  26   50:ifeq            126
						obj = ((Object) (new Point2D.Double()));
	//   27   53:new             #188 <Class Point2D$Double>
	//   28   56:dup             
	//   29   57:invokespecial   #189 <Method void Point2D$Double()>
	//   30   60:astore          10
					else
	//*  31   62:aload           10
	//*  32   64:aload_0         
	//*  33   65:getfield        #56  <Field double m00>
	//*  34   68:dload           6
	//*  35   70:dmul            
	//*  36   71:aload_0         
	//*  37   72:getfield        #62  <Field double m01>
	//*  38   75:dload           8
	//*  39   77:dmul            
	//*  40   78:dadd            
	//*  41   79:aload_0         
	//*  42   80:getfield        #60  <Field double m02>
	//*  43   83:dadd            
	//*  44   84:aload_0         
	//*  45   85:getfield        #64  <Field double m10>
	//*  46   88:dload           6
	//*  47   90:dmul            
	//*  48   91:aload_0         
	//*  49   92:getfield        #54  <Field double m11>
	//*  50   95:dload           8
	//*  51   97:dmul            
	//*  52   98:dadd            
	//*  53   99:aload_0         
	//*  54  100:getfield        #58  <Field double m12>
	//*  55  103:dadd            
	//*  56  104:invokevirtual   #200 <Method void Point2D.setLocation(double, double)>
	//*  57  107:aload_3         
	//*  58  108:iload           4
	//*  59  110:aload           10
	//*  60  112:aastore         
	//*  61  113:iload           4
	//*  62  115:iconst_1        
	//*  63  116:iadd            
	//*  64  117:istore          4
	//*  65  119:iload_2         
	//*  66  120:iconst_1        
	//*  67  121:iadd            
	//*  68  122:istore_2        
	//*  69  123:goto            0
						obj = ((Object) (new Point2D.Float()));
	//   70  126:new             #202 <Class Point2D$Float>
	//   71  129:dup             
	//   72  130:invokespecial   #203 <Method void Point2D$Float()>
	//   73  133:astore          10
				((Point2D) (obj)).setLocation(m00 * d + m01 * d1 + m02, m10 * d + m11 * d1 + m12);
				apoint2d1[j] = ((Point2D) (obj));
				j++;
				i++;
			} else
	//*  74  135:goto            62
			{
				return;
	//   75  138:return          
			}
		} while(true);
	}

	public void translate(double d, double d1)
	{
		concatenate(getTranslateInstance(d, d1));
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:dload_3         
	//    3    3:invokestatic    #294 <Method AffineTransform getTranslateInstance(double, double)>
	//    4    6:invokevirtual   #238 <Method void concatenate(AffineTransform)>
	//    5    9:return          
	}

	public static final int TYPE_FLIP = 64;
	public static final int TYPE_GENERAL_ROTATION = 16;
	public static final int TYPE_GENERAL_SCALE = 4;
	public static final int TYPE_GENERAL_TRANSFORM = 32;
	public static final int TYPE_IDENTITY = 0;
	public static final int TYPE_MASK_ROTATION = 24;
	public static final int TYPE_MASK_SCALE = 6;
	public static final int TYPE_QUADRANT_ROTATION = 8;
	public static final int TYPE_TRANSLATION = 1;
	public static final int TYPE_UNIFORM_SCALE = 2;
	static final int TYPE_UNKNOWN = -1;
	static final double ZERO = 1E-10D;
	private static final long serialVersionUID = 0x4ad5ff62L;
	double m00;
	double m01;
	double m02;
	double m10;
	double m11;
	double m12;
	transient int type;
}
