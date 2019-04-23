// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.shape;

import android.graphics.*;
import java.util.ArrayList;
import java.util.List;

public class ShapePath
{
	public static class PathArcOperation extends PathOperation
	{

		public void applyToPath(Matrix matrix, Path path)
		{
			Matrix matrix1 = this.matrix;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field Matrix matrix>
		//    2    4:astore_3        
			matrix.invert(matrix1);
		//    3    5:aload_1         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #48  <Method boolean Matrix.invert(Matrix)>
		//    6   10:pop             
			path.transform(matrix1);
		//    7   11:aload_2         
		//    8   12:aload_3         
		//    9   13:invokevirtual   #54  <Method void Path.transform(Matrix)>
			rectF.set(left, top, right, bottom);
		//   10   16:getstatic       #25  <Field RectF rectF>
		//   11   19:aload_0         
		//   12   20:getfield        #30  <Field float left>
		//   13   23:aload_0         
		//   14   24:getfield        #32  <Field float top>
		//   15   27:aload_0         
		//   16   28:getfield        #34  <Field float right>
		//   17   31:aload_0         
		//   18   32:getfield        #36  <Field float bottom>
		//   19   35:invokevirtual   #57  <Method void RectF.set(float, float, float, float)>
			path.arcTo(rectF, startAngle, sweepAngle, false);
		//   20   38:aload_2         
		//   21   39:getstatic       #25  <Field RectF rectF>
		//   22   42:aload_0         
		//   23   43:getfield        #59  <Field float startAngle>
		//   24   46:aload_0         
		//   25   47:getfield        #61  <Field float sweepAngle>
		//   26   50:iconst_0        
		//   27   51:invokevirtual   #65  <Method void Path.arcTo(RectF, float, float, boolean)>
			path.transform(matrix);
		//   28   54:aload_2         
		//   29   55:aload_1         
		//   30   56:invokevirtual   #54  <Method void Path.transform(Matrix)>
		//   31   59:return          
		}

		private static final RectF rectF = new RectF();
		public float bottom;
		public float left;
		public float right;
		public float startAngle;
		public float sweepAngle;
		public float top;

		static 
		{
		//    0    0:new             #20  <Class RectF>
		//    1    3:dup             
		//    2    4:invokespecial   #23  <Method void RectF()>
		//    3    7:putstatic       #25  <Field RectF rectF>
		//*   4   10:return          
		}

		public PathArcOperation(float f, float f1, float f2, float f3)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void ShapePath$PathOperation()>
			left = f;
		//    2    4:aload_0         
		//    3    5:fload_1         
		//    4    6:putfield        #30  <Field float left>
			top = f1;
		//    5    9:aload_0         
		//    6   10:fload_2         
		//    7   11:putfield        #32  <Field float top>
			right = f2;
		//    8   14:aload_0         
		//    9   15:fload_3         
		//   10   16:putfield        #34  <Field float right>
			bottom = f3;
		//   11   19:aload_0         
		//   12   20:fload           4
		//   13   22:putfield        #36  <Field float bottom>
		//   14   25:return          
		}
	}

	public static class PathLineOperation extends PathOperation
	{

		public void applyToPath(Matrix matrix, Path path)
		{
			Matrix matrix1 = this.matrix;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Matrix matrix>
		//    2    4:astore_3        
			matrix.invert(matrix1);
		//    3    5:aload_1         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #34  <Method boolean Matrix.invert(Matrix)>
		//    6   10:pop             
			path.transform(matrix1);
		//    7   11:aload_2         
		//    8   12:aload_3         
		//    9   13:invokevirtual   #40  <Method void Path.transform(Matrix)>
			path.lineTo(x, y);
		//   10   16:aload_2         
		//   11   17:aload_0         
		//   12   18:getfield        #19  <Field float x>
		//   13   21:aload_0         
		//   14   22:getfield        #22  <Field float y>
		//   15   25:invokevirtual   #44  <Method void Path.lineTo(float, float)>
			path.transform(matrix);
		//   16   28:aload_2         
		//   17   29:aload_1         
		//   18   30:invokevirtual   #40  <Method void Path.transform(Matrix)>
		//   19   33:return          
		}

		private float x;
		private float y;


/*
		static float access$002(PathLineOperation pathlineoperation, float f)
		{
			pathlineoperation.x = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #19  <Field float x>
			return f;
		//    3    5:fload_1         
		//    4    6:freturn         
		}

*/


/*
		static float access$102(PathLineOperation pathlineoperation, float f)
		{
			pathlineoperation.y = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #22  <Field float y>
			return f;
		//    3    5:fload_1         
		//    4    6:freturn         
		}

*/

		public PathLineOperation()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void ShapePath$PathOperation()>
		//    2    4:return          
		}
	}

	public static abstract class PathOperation
	{

		public abstract void applyToPath(Matrix matrix1, Path path);

		protected final Matrix matrix = new Matrix();

		public PathOperation()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #15  <Class Matrix>
		//    4    8:dup             
		//    5    9:invokespecial   #16  <Method void Matrix()>
		//    6   12:putfield        #18  <Field Matrix matrix>
		//    7   15:return          
		}
	}

	public static class PathQuadOperation extends PathOperation
	{

		public void applyToPath(Matrix matrix, Path path)
		{
			Matrix matrix1 = this.matrix;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field Matrix matrix>
		//    2    4:astore_3        
			matrix.invert(matrix1);
		//    3    5:aload_1         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #29  <Method boolean Matrix.invert(Matrix)>
		//    6   10:pop             
			path.transform(matrix1);
		//    7   11:aload_2         
		//    8   12:aload_3         
		//    9   13:invokevirtual   #35  <Method void Path.transform(Matrix)>
			path.quadTo(controlX, controlY, endX, endY);
		//   10   16:aload_2         
		//   11   17:aload_0         
		//   12   18:getfield        #37  <Field float controlX>
		//   13   21:aload_0         
		//   14   22:getfield        #39  <Field float controlY>
		//   15   25:aload_0         
		//   16   26:getfield        #41  <Field float endX>
		//   17   29:aload_0         
		//   18   30:getfield        #43  <Field float endY>
		//   19   33:invokevirtual   #47  <Method void Path.quadTo(float, float, float, float)>
			path.transform(matrix);
		//   20   36:aload_2         
		//   21   37:aload_1         
		//   22   38:invokevirtual   #35  <Method void Path.transform(Matrix)>
		//   23   41:return          
		}

		public float controlX;
		public float controlY;
		public float endX;
		public float endY;

		public PathQuadOperation()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void ShapePath$PathOperation()>
		//    2    4:return          
		}
	}


	public ShapePath()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		operations = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #33  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void ArrayList()>
	//    6   12:putfield        #36  <Field List operations>
		reset(0.0F, 0.0F);
	//    7   15:aload_0         
	//    8   16:fconst_0        
	//    9   17:fconst_0        
	//   10   18:invokevirtual   #40  <Method void reset(float, float)>
	//   11   21:return          
	}

	public ShapePath(float f, float f1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		operations = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #33  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void ArrayList()>
	//    6   12:putfield        #36  <Field List operations>
		reset(f, f1);
	//    7   15:aload_0         
	//    8   16:fload_1         
	//    9   17:fload_2         
	//   10   18:invokevirtual   #40  <Method void reset(float, float)>
	//   11   21:return          
	}

	public void addArc(float f, float f1, float f2, float f3, float f4, float f5)
	{
		PathArcOperation patharcoperation = new PathArcOperation(f, f1, f2, f3);
	//    0    0:new             #6   <Class ShapePath$PathArcOperation>
	//    1    3:dup             
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:fload_3         
	//    5    7:fload           4
	//    6    9:invokespecial   #46  <Method void ShapePath$PathArcOperation(float, float, float, float)>
	//    7   12:astore          10
		patharcoperation.startAngle = f4;
	//    8   14:aload           10
	//    9   16:fload           5
	//   10   18:putfield        #49  <Field float ShapePath$PathArcOperation.startAngle>
		patharcoperation.sweepAngle = f5;
	//   11   21:aload           10
	//   12   23:fload           6
	//   13   25:putfield        #52  <Field float ShapePath$PathArcOperation.sweepAngle>
		operations.add(((Object) (patharcoperation)));
	//   14   28:aload_0         
	//   15   29:getfield        #36  <Field List operations>
	//   16   32:aload           10
	//   17   34:invokeinterface #58  <Method boolean List.add(Object)>
	//   18   39:pop             
		float f6 = (f2 - f) / 2.0F;
	//   19   40:fload_3         
	//   20   41:fload_1         
	//   21   42:fsub            
	//   22   43:fconst_2        
	//   23   44:fdiv            
	//   24   45:fstore          9
		double d = f4 + f5;
	//   25   47:fload           5
	//   26   49:fload           6
	//   27   51:fadd            
	//   28   52:f2d             
	//   29   53:dstore          7
		endX = (f + f2) * 0.5F + f6 * (float)Math.cos(Math.toRadians(d));
	//   30   55:aload_0         
	//   31   56:fload_1         
	//   32   57:fload_3         
	//   33   58:fadd            
	//   34   59:ldc1            #59  <Float 0.5F>
	//   35   61:fmul            
	//   36   62:fload           9
	//   37   64:dload           7
	//   38   66:invokestatic    #65  <Method double Math.toRadians(double)>
	//   39   69:invokestatic    #68  <Method double Math.cos(double)>
	//   40   72:d2f             
	//   41   73:fmul            
	//   42   74:fadd            
	//   43   75:putfield        #70  <Field float endX>
		endY = (f1 + f3) * 0.5F + ((f3 - f1) / 2.0F) * (float)Math.sin(Math.toRadians(d));
	//   44   78:aload_0         
	//   45   79:fload_2         
	//   46   80:fload           4
	//   47   82:fadd            
	//   48   83:ldc1            #59  <Float 0.5F>
	//   49   85:fmul            
	//   50   86:fload           4
	//   51   88:fload_2         
	//   52   89:fsub            
	//   53   90:fconst_2        
	//   54   91:fdiv            
	//   55   92:dload           7
	//   56   94:invokestatic    #65  <Method double Math.toRadians(double)>
	//   57   97:invokestatic    #73  <Method double Math.sin(double)>
	//   58  100:d2f             
	//   59  101:fmul            
	//   60  102:fadd            
	//   61  103:putfield        #75  <Field float endY>
	//   62  106:return          
	}

	public void applyToPath(Matrix matrix, Path path)
	{
		int j = operations.size();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field List operations>
	//    2    4:invokeinterface #81  <Method int List.size()>
	//    3    9:istore          4
		for(int i = 0; i < j; i++)
	//*   4   11:iconst_0        
	//*   5   12:istore_3        
	//*   6   13:iload_3         
	//*   7   14:iload           4
	//*   8   16:icmpge          44
			((PathOperation)operations.get(i)).applyToPath(matrix, path);
	//    9   19:aload_0         
	//   10   20:getfield        #36  <Field List operations>
	//   11   23:iload_3         
	//   12   24:invokeinterface #85  <Method Object List.get(int)>
	//   13   29:checkcast       #12  <Class ShapePath$PathOperation>
	//   14   32:aload_1         
	//   15   33:aload_2         
	//   16   34:invokevirtual   #87  <Method void ShapePath$PathOperation.applyToPath(Matrix, Path)>

	//   17   37:iload_3         
	//   18   38:iconst_1        
	//   19   39:iadd            
	//   20   40:istore_3        
	//*  21   41:goto            13
	//   22   44:return          
	}

	public void lineTo(float f, float f1)
	{
		PathLineOperation pathlineoperation = new PathLineOperation();
	//    0    0:new             #9   <Class ShapePath$PathLineOperation>
	//    1    3:dup             
	//    2    4:invokespecial   #89  <Method void ShapePath$PathLineOperation()>
	//    3    7:astore_3        
		pathlineoperation.x = f;
	//    4    8:aload_3         
	//    5    9:fload_1         
	//    6   10:invokestatic    #93  <Method float ShapePath$PathLineOperation.access$002(ShapePath$PathLineOperation, float)>
	//    7   13:pop             
		pathlineoperation.y = f1;
	//    8   14:aload_3         
	//    9   15:fload_2         
	//   10   16:invokestatic    #96  <Method float ShapePath$PathLineOperation.access$102(ShapePath$PathLineOperation, float)>
	//   11   19:pop             
		operations.add(((Object) (pathlineoperation)));
	//   12   20:aload_0         
	//   13   21:getfield        #36  <Field List operations>
	//   14   24:aload_3         
	//   15   25:invokeinterface #58  <Method boolean List.add(Object)>
	//   16   30:pop             
		endX = f;
	//   17   31:aload_0         
	//   18   32:fload_1         
	//   19   33:putfield        #70  <Field float endX>
		endY = f1;
	//   20   36:aload_0         
	//   21   37:fload_2         
	//   22   38:putfield        #75  <Field float endY>
	//   23   41:return          
	}

	public void quadToPoint(float f, float f1, float f2, float f3)
	{
		PathQuadOperation pathquadoperation = new PathQuadOperation();
	//    0    0:new             #15  <Class ShapePath$PathQuadOperation>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void ShapePath$PathQuadOperation()>
	//    3    7:astore          5
		pathquadoperation.controlX = f;
	//    4    9:aload           5
	//    5   11:fload_1         
	//    6   12:putfield        #101 <Field float ShapePath$PathQuadOperation.controlX>
		pathquadoperation.controlY = f1;
	//    7   15:aload           5
	//    8   17:fload_2         
	//    9   18:putfield        #104 <Field float ShapePath$PathQuadOperation.controlY>
		pathquadoperation.endX = f2;
	//   10   21:aload           5
	//   11   23:fload_3         
	//   12   24:putfield        #105 <Field float ShapePath$PathQuadOperation.endX>
		pathquadoperation.endY = f3;
	//   13   27:aload           5
	//   14   29:fload           4
	//   15   31:putfield        #106 <Field float ShapePath$PathQuadOperation.endY>
		operations.add(((Object) (pathquadoperation)));
	//   16   34:aload_0         
	//   17   35:getfield        #36  <Field List operations>
	//   18   38:aload           5
	//   19   40:invokeinterface #58  <Method boolean List.add(Object)>
	//   20   45:pop             
		endX = f2;
	//   21   46:aload_0         
	//   22   47:fload_3         
	//   23   48:putfield        #70  <Field float endX>
		endY = f3;
	//   24   51:aload_0         
	//   25   52:fload           4
	//   26   54:putfield        #75  <Field float endY>
	//   27   57:return          
	}

	public void reset(float f, float f1)
	{
		startX = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #108 <Field float startX>
		startY = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #110 <Field float startY>
		endX = f;
	//    6   10:aload_0         
	//    7   11:fload_1         
	//    8   12:putfield        #70  <Field float endX>
		endY = f1;
	//    9   15:aload_0         
	//   10   16:fload_2         
	//   11   17:putfield        #75  <Field float endY>
		operations.clear();
	//   12   20:aload_0         
	//   13   21:getfield        #36  <Field List operations>
	//   14   24:invokeinterface #113 <Method void List.clear()>
	//   15   29:return          
	}

	public float endX;
	public float endY;
	private final List operations;
	public float startX;
	public float startY;
}
