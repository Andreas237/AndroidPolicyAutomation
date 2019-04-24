// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import java.util.Arrays;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			Matrix

public class Vector
{

	public Vector(float f, float f1, float f2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:newarray        float[]
	//    5    8:dup             
	//    6    9:iconst_0        
	//    7   10:fconst_0        
	//    8   11:fastore         
	//    9   12:dup             
	//   10   13:iconst_1        
	//   11   14:fconst_0        
	//   12   15:fastore         
	//   13   16:dup             
	//   14   17:iconst_2        
	//   15   18:fconst_0        
	//   16   19:fastore         
	//   17   20:putfield        #20  <Field float[] vals>
		vals[0] = f;
	//   18   23:aload_0         
	//   19   24:getfield        #20  <Field float[] vals>
	//   20   27:iconst_0        
	//   21   28:fload_1         
	//   22   29:fastore         
		vals[1] = f1;
	//   23   30:aload_0         
	//   24   31:getfield        #20  <Field float[] vals>
	//   25   34:iconst_1        
	//   26   35:fload_2         
	//   27   36:fastore         
		vals[2] = f2;
	//   28   37:aload_0         
	//   29   38:getfield        #20  <Field float[] vals>
	//   30   41:iconst_2        
	//   31   42:fload_3         
	//   32   43:fastore         
	//   33   44:return          
	}

	public Vector cross(Matrix matrix)
	{
		return new Vector(vals[0] * matrix.get(0) + vals[1] * matrix.get(3) + vals[2] * matrix.get(6), vals[0] * matrix.get(1) + vals[1] * matrix.get(4) + vals[2] * matrix.get(7), vals[0] * matrix.get(2) + vals[1] * matrix.get(5) + vals[2] * matrix.get(8));
	//    0    0:new             #2   <Class Vector>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field float[] vals>
	//    4    8:iconst_0        
	//    5    9:faload          
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #29  <Method float Matrix.get(int)>
	//    9   15:fmul            
	//   10   16:aload_0         
	//   11   17:getfield        #20  <Field float[] vals>
	//   12   20:iconst_1        
	//   13   21:faload          
	//   14   22:aload_1         
	//   15   23:iconst_3        
	//   16   24:invokevirtual   #29  <Method float Matrix.get(int)>
	//   17   27:fmul            
	//   18   28:fadd            
	//   19   29:aload_0         
	//   20   30:getfield        #20  <Field float[] vals>
	//   21   33:iconst_2        
	//   22   34:faload          
	//   23   35:aload_1         
	//   24   36:bipush          6
	//   25   38:invokevirtual   #29  <Method float Matrix.get(int)>
	//   26   41:fmul            
	//   27   42:fadd            
	//   28   43:aload_0         
	//   29   44:getfield        #20  <Field float[] vals>
	//   30   47:iconst_0        
	//   31   48:faload          
	//   32   49:aload_1         
	//   33   50:iconst_1        
	//   34   51:invokevirtual   #29  <Method float Matrix.get(int)>
	//   35   54:fmul            
	//   36   55:aload_0         
	//   37   56:getfield        #20  <Field float[] vals>
	//   38   59:iconst_1        
	//   39   60:faload          
	//   40   61:aload_1         
	//   41   62:iconst_4        
	//   42   63:invokevirtual   #29  <Method float Matrix.get(int)>
	//   43   66:fmul            
	//   44   67:fadd            
	//   45   68:aload_0         
	//   46   69:getfield        #20  <Field float[] vals>
	//   47   72:iconst_2        
	//   48   73:faload          
	//   49   74:aload_1         
	//   50   75:bipush          7
	//   51   77:invokevirtual   #29  <Method float Matrix.get(int)>
	//   52   80:fmul            
	//   53   81:fadd            
	//   54   82:aload_0         
	//   55   83:getfield        #20  <Field float[] vals>
	//   56   86:iconst_0        
	//   57   87:faload          
	//   58   88:aload_1         
	//   59   89:iconst_2        
	//   60   90:invokevirtual   #29  <Method float Matrix.get(int)>
	//   61   93:fmul            
	//   62   94:aload_0         
	//   63   95:getfield        #20  <Field float[] vals>
	//   64   98:iconst_1        
	//   65   99:faload          
	//   66  100:aload_1         
	//   67  101:iconst_5        
	//   68  102:invokevirtual   #29  <Method float Matrix.get(int)>
	//   69  105:fmul            
	//   70  106:fadd            
	//   71  107:aload_0         
	//   72  108:getfield        #20  <Field float[] vals>
	//   73  111:iconst_2        
	//   74  112:faload          
	//   75  113:aload_1         
	//   76  114:bipush          8
	//   77  116:invokevirtual   #29  <Method float Matrix.get(int)>
	//   78  119:fmul            
	//   79  120:fadd            
	//   80  121:invokespecial   #31  <Method void Vector(float, float, float)>
	//   81  124:areturn         
	}

	public Vector cross(Vector vector)
	{
		return new Vector(vals[1] * vector.vals[2] - vals[2] * vector.vals[1], vals[2] * vector.vals[0] - vals[0] * vector.vals[2], vals[0] * vector.vals[1] - vals[1] * vector.vals[0]);
	//    0    0:new             #2   <Class Vector>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field float[] vals>
	//    4    8:iconst_1        
	//    5    9:faload          
	//    6   10:aload_1         
	//    7   11:getfield        #20  <Field float[] vals>
	//    8   14:iconst_2        
	//    9   15:faload          
	//   10   16:fmul            
	//   11   17:aload_0         
	//   12   18:getfield        #20  <Field float[] vals>
	//   13   21:iconst_2        
	//   14   22:faload          
	//   15   23:aload_1         
	//   16   24:getfield        #20  <Field float[] vals>
	//   17   27:iconst_1        
	//   18   28:faload          
	//   19   29:fmul            
	//   20   30:fsub            
	//   21   31:aload_0         
	//   22   32:getfield        #20  <Field float[] vals>
	//   23   35:iconst_2        
	//   24   36:faload          
	//   25   37:aload_1         
	//   26   38:getfield        #20  <Field float[] vals>
	//   27   41:iconst_0        
	//   28   42:faload          
	//   29   43:fmul            
	//   30   44:aload_0         
	//   31   45:getfield        #20  <Field float[] vals>
	//   32   48:iconst_0        
	//   33   49:faload          
	//   34   50:aload_1         
	//   35   51:getfield        #20  <Field float[] vals>
	//   36   54:iconst_2        
	//   37   55:faload          
	//   38   56:fmul            
	//   39   57:fsub            
	//   40   58:aload_0         
	//   41   59:getfield        #20  <Field float[] vals>
	//   42   62:iconst_0        
	//   43   63:faload          
	//   44   64:aload_1         
	//   45   65:getfield        #20  <Field float[] vals>
	//   46   68:iconst_1        
	//   47   69:faload          
	//   48   70:fmul            
	//   49   71:aload_0         
	//   50   72:getfield        #20  <Field float[] vals>
	//   51   75:iconst_1        
	//   52   76:faload          
	//   53   77:aload_1         
	//   54   78:getfield        #20  <Field float[] vals>
	//   55   81:iconst_0        
	//   56   82:faload          
	//   57   83:fmul            
	//   58   84:fsub            
	//   59   85:invokespecial   #31  <Method void Vector(float, float, float)>
	//   60   88:areturn         
	}

	public float dot(Vector vector)
	{
		return vals[0] * vector.vals[0] + vals[1] * vector.vals[1] + vals[2] * vector.vals[2];
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field float[] vals>
	//    2    4:iconst_0        
	//    3    5:faload          
	//    4    6:aload_1         
	//    5    7:getfield        #20  <Field float[] vals>
	//    6   10:iconst_0        
	//    7   11:faload          
	//    8   12:fmul            
	//    9   13:aload_0         
	//   10   14:getfield        #20  <Field float[] vals>
	//   11   17:iconst_1        
	//   12   18:faload          
	//   13   19:aload_1         
	//   14   20:getfield        #20  <Field float[] vals>
	//   15   23:iconst_1        
	//   16   24:faload          
	//   17   25:fmul            
	//   18   26:fadd            
	//   19   27:aload_0         
	//   20   28:getfield        #20  <Field float[] vals>
	//   21   31:iconst_2        
	//   22   32:faload          
	//   23   33:aload_1         
	//   24   34:getfield        #20  <Field float[] vals>
	//   25   37:iconst_2        
	//   26   38:faload          
	//   27   39:fmul            
	//   28   40:fadd            
	//   29   41:freturn         
	}

	public boolean equals(Object obj)
	{
		if(this != obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
				return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
			if(((Object)this).getClass() != obj.getClass())
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #40  <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #40  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
				return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
			obj = ((Object) ((Vector)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class Vector>
	//   18   30:astore_1        
			if(!Arrays.equals(vals, ((Vector) (obj)).vals))
	//*  19   31:aload_0         
	//*  20   32:getfield        #20  <Field float[] vals>
	//*  21   35:aload_1         
	//*  22   36:getfield        #20  <Field float[] vals>
	//*  23   39:invokestatic    #45  <Method boolean Arrays.equals(float[], float[])>
	//*  24   42:ifne            5
				return false;
	//   25   45:iconst_0        
	//   26   46:ireturn         
		}
		return true;
	}

	public float get(int i)
	{
		return vals[i];
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field float[] vals>
	//    2    4:iload_1         
	//    3    5:faload          
	//    4    6:freturn         
	}

	public int hashCode()
	{
		return Arrays.hashCode(vals) + 31;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field float[] vals>
	//    2    4:invokestatic    #50  <Method int Arrays.hashCode(float[])>
	//    3    7:bipush          31
	//    4    9:iadd            
	//    5   10:ireturn         
	}

	public float length()
	{
		return (float)Math.sqrt(lengthSquared());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method float lengthSquared()>
	//    2    4:f2d             
	//    3    5:invokestatic    #61  <Method double Math.sqrt(double)>
	//    4    8:d2f             
	//    5    9:freturn         
	}

	public float lengthSquared()
	{
		return vals[0] * vals[0] + vals[1] * vals[1] + vals[2] * vals[2];
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field float[] vals>
	//    2    4:iconst_0        
	//    3    5:faload          
	//    4    6:aload_0         
	//    5    7:getfield        #20  <Field float[] vals>
	//    6   10:iconst_0        
	//    7   11:faload          
	//    8   12:fmul            
	//    9   13:aload_0         
	//   10   14:getfield        #20  <Field float[] vals>
	//   11   17:iconst_1        
	//   12   18:faload          
	//   13   19:aload_0         
	//   14   20:getfield        #20  <Field float[] vals>
	//   15   23:iconst_1        
	//   16   24:faload          
	//   17   25:fmul            
	//   18   26:fadd            
	//   19   27:aload_0         
	//   20   28:getfield        #20  <Field float[] vals>
	//   21   31:iconst_2        
	//   22   32:faload          
	//   23   33:aload_0         
	//   24   34:getfield        #20  <Field float[] vals>
	//   25   37:iconst_2        
	//   26   38:faload          
	//   27   39:fmul            
	//   28   40:fadd            
	//   29   41:freturn         
	}

	public Vector multiply(float f)
	{
		return new Vector(vals[0] * f, vals[1] * f, vals[2] * f);
	//    0    0:new             #2   <Class Vector>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field float[] vals>
	//    4    8:iconst_0        
	//    5    9:faload          
	//    6   10:fload_1         
	//    7   11:fmul            
	//    8   12:aload_0         
	//    9   13:getfield        #20  <Field float[] vals>
	//   10   16:iconst_1        
	//   11   17:faload          
	//   12   18:fload_1         
	//   13   19:fmul            
	//   14   20:aload_0         
	//   15   21:getfield        #20  <Field float[] vals>
	//   16   24:iconst_2        
	//   17   25:faload          
	//   18   26:fload_1         
	//   19   27:fmul            
	//   20   28:invokespecial   #31  <Method void Vector(float, float, float)>
	//   21   31:areturn         
	}

	public Vector normalize()
	{
		float f = length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #67  <Method float length()>
	//    2    4:fstore_1        
		return new Vector(vals[0] / f, vals[1] / f, vals[2] / f);
	//    3    5:new             #2   <Class Vector>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field float[] vals>
	//    7   13:iconst_0        
	//    8   14:faload          
	//    9   15:fload_1         
	//   10   16:fdiv            
	//   11   17:aload_0         
	//   12   18:getfield        #20  <Field float[] vals>
	//   13   21:iconst_1        
	//   14   22:faload          
	//   15   23:fload_1         
	//   16   24:fdiv            
	//   17   25:aload_0         
	//   18   26:getfield        #20  <Field float[] vals>
	//   19   29:iconst_2        
	//   20   30:faload          
	//   21   31:fload_1         
	//   22   32:fdiv            
	//   23   33:invokespecial   #31  <Method void Vector(float, float, float)>
	//   24   36:areturn         
	}

	public Vector subtract(Vector vector)
	{
		return new Vector(vals[0] - vector.vals[0], vals[1] - vector.vals[1], vals[2] - vector.vals[2]);
	//    0    0:new             #2   <Class Vector>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field float[] vals>
	//    4    8:iconst_0        
	//    5    9:faload          
	//    6   10:aload_1         
	//    7   11:getfield        #20  <Field float[] vals>
	//    8   14:iconst_0        
	//    9   15:faload          
	//   10   16:fsub            
	//   11   17:aload_0         
	//   12   18:getfield        #20  <Field float[] vals>
	//   13   21:iconst_1        
	//   14   22:faload          
	//   15   23:aload_1         
	//   16   24:getfield        #20  <Field float[] vals>
	//   17   27:iconst_1        
	//   18   28:faload          
	//   19   29:fsub            
	//   20   30:aload_0         
	//   21   31:getfield        #20  <Field float[] vals>
	//   22   34:iconst_2        
	//   23   35:faload          
	//   24   36:aload_1         
	//   25   37:getfield        #20  <Field float[] vals>
	//   26   40:iconst_2        
	//   27   41:faload          
	//   28   42:fsub            
	//   29   43:invokespecial   #31  <Method void Vector(float, float, float)>
	//   30   46:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append(vals[0]).append(",").append(vals[1]).append(",").append(vals[2]).toString();
	//    0    0:new             #72  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #73  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field float[] vals>
	//    5   11:iconst_0        
	//    6   12:faload          
	//    7   13:invokevirtual   #77  <Method StringBuilder StringBuilder.append(float)>
	//    8   16:ldc1            #79  <String ",">
	//    9   18:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:aload_0         
	//   11   22:getfield        #20  <Field float[] vals>
	//   12   25:iconst_1        
	//   13   26:faload          
	//   14   27:invokevirtual   #77  <Method StringBuilder StringBuilder.append(float)>
	//   15   30:ldc1            #79  <String ",">
	//   16   32:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:aload_0         
	//   18   36:getfield        #20  <Field float[] vals>
	//   19   39:iconst_2        
	//   20   40:faload          
	//   21   41:invokevirtual   #77  <Method StringBuilder StringBuilder.append(float)>
	//   22   44:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   23   47:areturn         
	}

	public static final int I1 = 0;
	public static final int I2 = 1;
	public static final int I3 = 2;
	private final float vals[] = {
		0.0F, 0.0F, 0.0F
	};
}
