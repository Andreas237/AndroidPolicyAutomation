// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.matrix;


public final class Vector3
{

	public Vector3()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:return          
	}

	public Vector3(float f, float f1, float f2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		set(f, f1, f2);
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:fload_2         
	//    5    7:fload_3         
	//    6    8:invokevirtual   #33  <Method void set(float, float, float)>
	//    7   11:return          
	}

	public Vector3(Vector3 vector3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		set(vector3);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #36  <Method void set(Vector3)>
	//    5    9:return          
	}

	public Vector3(float af[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		set(af[0], af[1], af[2]);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:faload          
	//    6    8:aload_1         
	//    7    9:iconst_1        
	//    8   10:faload          
	//    9   11:aload_1         
	//   10   12:iconst_2        
	//   11   13:faload          
	//   12   14:invokevirtual   #33  <Method void set(float, float, float)>
	//   13   17:return          
	}

	public final void add(float f, float f1, float f2)
	{
		x = x + f;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field float x>
	//    3    5:fload_1         
	//    4    6:fadd            
	//    5    7:putfield        #40  <Field float x>
		y = y + f1;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #42  <Field float y>
	//    9   15:fload_2         
	//   10   16:fadd            
	//   11   17:putfield        #42  <Field float y>
		z = z + f2;
	//   12   20:aload_0         
	//   13   21:aload_0         
	//   14   22:getfield        #44  <Field float z>
	//   15   25:fload_3         
	//   16   26:fadd            
	//   17   27:putfield        #44  <Field float z>
	//   18   30:return          
	}

	public final void add(Vector3 vector3)
	{
		x = x + vector3.x;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field float x>
	//    3    5:aload_1         
	//    4    6:getfield        #40  <Field float x>
	//    5    9:fadd            
	//    6   10:putfield        #40  <Field float x>
		y = y + vector3.y;
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #42  <Field float y>
	//   10   18:aload_1         
	//   11   19:getfield        #42  <Field float y>
	//   12   22:fadd            
	//   13   23:putfield        #42  <Field float y>
		z = z + vector3.z;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #44  <Field float z>
	//   17   31:aload_1         
	//   18   32:getfield        #44  <Field float z>
	//   19   35:fadd            
	//   20   36:putfield        #44  <Field float z>
	//   21   39:return          
	}

	public final Vector3 cross(Vector3 vector3)
	{
		return new Vector3(y * vector3.z - z * vector3.y, z * vector3.x - x * vector3.z, x * vector3.y - y * vector3.x);
	//    0    0:new             #2   <Class Vector3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #42  <Field float y>
	//    4    8:aload_1         
	//    5    9:getfield        #44  <Field float z>
	//    6   12:fmul            
	//    7   13:aload_0         
	//    8   14:getfield        #44  <Field float z>
	//    9   17:aload_1         
	//   10   18:getfield        #42  <Field float y>
	//   11   21:fmul            
	//   12   22:fsub            
	//   13   23:aload_0         
	//   14   24:getfield        #44  <Field float z>
	//   15   27:aload_1         
	//   16   28:getfield        #40  <Field float x>
	//   17   31:fmul            
	//   18   32:aload_0         
	//   19   33:getfield        #40  <Field float x>
	//   20   36:aload_1         
	//   21   37:getfield        #44  <Field float z>
	//   22   40:fmul            
	//   23   41:fsub            
	//   24   42:aload_0         
	//   25   43:getfield        #40  <Field float x>
	//   26   46:aload_1         
	//   27   47:getfield        #42  <Field float y>
	//   28   50:fmul            
	//   29   51:aload_0         
	//   30   52:getfield        #42  <Field float y>
	//   31   55:aload_1         
	//   32   56:getfield        #40  <Field float x>
	//   33   59:fmul            
	//   34   60:fsub            
	//   35   61:invokespecial   #19  <Method void Vector3(float, float, float)>
	//   36   64:areturn         
	}

	public final float distance2(Vector3 vector3)
	{
		float f = x - vector3.x;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field float x>
	//    2    4:aload_1         
	//    3    5:getfield        #40  <Field float x>
	//    4    8:fsub            
	//    5    9:fstore_2        
		float f1 = y - vector3.y;
	//    6   10:aload_0         
	//    7   11:getfield        #42  <Field float y>
	//    8   14:aload_1         
	//    9   15:getfield        #42  <Field float y>
	//   10   18:fsub            
	//   11   19:fstore_3        
		float f2 = z - vector3.z;
	//   12   20:aload_0         
	//   13   21:getfield        #44  <Field float z>
	//   14   24:aload_1         
	//   15   25:getfield        #44  <Field float z>
	//   16   28:fsub            
	//   17   29:fstore          4
		return f * f + f1 * f1 + f2 * f2;
	//   18   31:fload_2         
	//   19   32:fload_2         
	//   20   33:fmul            
	//   21   34:fload_3         
	//   22   35:fload_3         
	//   23   36:fmul            
	//   24   37:fadd            
	//   25   38:fload           4
	//   26   40:fload           4
	//   27   42:fmul            
	//   28   43:fadd            
	//   29   44:freturn         
	}

	public final void divide(float f)
	{
		if(f != 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpl           
	//*   3    3:ifeq            36
		{
			x = x / f;
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:getfield        #40  <Field float x>
	//    7   11:fload_1         
	//    8   12:fdiv            
	//    9   13:putfield        #40  <Field float x>
			y = y / f;
	//   10   16:aload_0         
	//   11   17:aload_0         
	//   12   18:getfield        #42  <Field float y>
	//   13   21:fload_1         
	//   14   22:fdiv            
	//   15   23:putfield        #42  <Field float y>
			z = z / f;
	//   16   26:aload_0         
	//   17   27:aload_0         
	//   18   28:getfield        #44  <Field float z>
	//   19   31:fload_1         
	//   20   32:fdiv            
	//   21   33:putfield        #44  <Field float z>
		}
	//   22   36:return          
	}

	public final float dot(Vector3 vector3)
	{
		return x * vector3.x + y * vector3.y + z * vector3.z;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field float x>
	//    2    4:aload_1         
	//    3    5:getfield        #40  <Field float x>
	//    4    8:fmul            
	//    5    9:aload_0         
	//    6   10:getfield        #42  <Field float y>
	//    7   13:aload_1         
	//    8   14:getfield        #42  <Field float y>
	//    9   17:fmul            
	//   10   18:fadd            
	//   11   19:aload_0         
	//   12   20:getfield        #44  <Field float z>
	//   13   23:aload_1         
	//   14   24:getfield        #44  <Field float z>
	//   15   27:fmul            
	//   16   28:fadd            
	//   17   29:freturn         
	}

	public final float length()
	{
		return (float)Math.sqrt(length2());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #56  <Method float length2()>
	//    2    4:f2d             
	//    3    5:invokestatic    #62  <Method double Math.sqrt(double)>
	//    4    8:d2f             
	//    5    9:freturn         
	}

	public final float length2()
	{
		return x * x + y * y + z * z;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field float x>
	//    2    4:aload_0         
	//    3    5:getfield        #40  <Field float x>
	//    4    8:fmul            
	//    5    9:aload_0         
	//    6   10:getfield        #42  <Field float y>
	//    7   13:aload_0         
	//    8   14:getfield        #42  <Field float y>
	//    9   17:fmul            
	//   10   18:fadd            
	//   11   19:aload_0         
	//   12   20:getfield        #44  <Field float z>
	//   13   23:aload_0         
	//   14   24:getfield        #44  <Field float z>
	//   15   27:fmul            
	//   16   28:fadd            
	//   17   29:freturn         
	}

	public final void multiply(float f)
	{
		x = x * f;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field float x>
	//    3    5:fload_1         
	//    4    6:fmul            
	//    5    7:putfield        #40  <Field float x>
		y = y * f;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #42  <Field float y>
	//    9   15:fload_1         
	//   10   16:fmul            
	//   11   17:putfield        #42  <Field float y>
		z = z * f;
	//   12   20:aload_0         
	//   13   21:aload_0         
	//   14   22:getfield        #44  <Field float z>
	//   15   25:fload_1         
	//   16   26:fmul            
	//   17   27:putfield        #44  <Field float z>
	//   18   30:return          
	}

	public final void multiply(Vector3 vector3)
	{
		x = x * vector3.x;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field float x>
	//    3    5:aload_1         
	//    4    6:getfield        #40  <Field float x>
	//    5    9:fmul            
	//    6   10:putfield        #40  <Field float x>
		y = y * vector3.y;
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #42  <Field float y>
	//   10   18:aload_1         
	//   11   19:getfield        #42  <Field float y>
	//   12   22:fmul            
	//   13   23:putfield        #42  <Field float y>
		z = z * vector3.z;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #44  <Field float z>
	//   17   31:aload_1         
	//   18   32:getfield        #44  <Field float z>
	//   19   35:fmul            
	//   20   36:putfield        #44  <Field float z>
	//   21   39:return          
	}

	public final float normalize()
	{
		float f = length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method float length()>
	//    2    4:fstore_1        
		if(f != 0.0F)
	//*   3    5:fload_1         
	//*   4    6:fconst_0        
	//*   5    7:fcmpl           
	//*   6    8:ifeq            41
		{
			x = x / f;
	//    7   11:aload_0         
	//    8   12:aload_0         
	//    9   13:getfield        #40  <Field float x>
	//   10   16:fload_1         
	//   11   17:fdiv            
	//   12   18:putfield        #40  <Field float x>
			y = y / f;
	//   13   21:aload_0         
	//   14   22:aload_0         
	//   15   23:getfield        #42  <Field float y>
	//   16   26:fload_1         
	//   17   27:fdiv            
	//   18   28:putfield        #42  <Field float y>
			z = z / f;
	//   19   31:aload_0         
	//   20   32:aload_0         
	//   21   33:getfield        #44  <Field float z>
	//   22   36:fload_1         
	//   23   37:fdiv            
	//   24   38:putfield        #44  <Field float z>
		}
		return f;
	//   25   41:fload_1         
	//   26   42:freturn         
	}

	public final boolean pointsInSameDirection(Vector3 vector3)
	{
		return dot(vector3) > 0.0F;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #70  <Method float dot(Vector3)>
	//    3    5:fconst_0        
	//    4    6:fcmpl           
	//    5    7:ifle            12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public final void set(float f, float f1, float f2)
	{
		x = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #40  <Field float x>
		y = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #42  <Field float y>
		z = f2;
	//    6   10:aload_0         
	//    7   11:fload_3         
	//    8   12:putfield        #44  <Field float z>
	//    9   15:return          
	}

	public final void set(Vector3 vector3)
	{
		x = vector3.x;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #40  <Field float x>
	//    3    5:putfield        #40  <Field float x>
		y = vector3.y;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #42  <Field float y>
	//    7   13:putfield        #42  <Field float y>
		z = vector3.z;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:getfield        #44  <Field float z>
	//   11   21:putfield        #44  <Field float z>
	//   12   24:return          
	}

	public final void subtract(Vector3 vector3)
	{
		x = x - vector3.x;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field float x>
	//    3    5:aload_1         
	//    4    6:getfield        #40  <Field float x>
	//    5    9:fsub            
	//    6   10:putfield        #40  <Field float x>
		y = y - vector3.y;
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #42  <Field float y>
	//   10   18:aload_1         
	//   11   19:getfield        #42  <Field float y>
	//   12   22:fsub            
	//   13   23:putfield        #42  <Field float y>
		z = z - vector3.z;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #44  <Field float z>
	//   17   31:aload_1         
	//   18   32:getfield        #44  <Field float z>
	//   19   35:fsub            
	//   20   36:putfield        #44  <Field float z>
	//   21   39:return          
	}

	public final void subtractMultiple(Vector3 vector3, float f)
	{
		x = x - vector3.x * f;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field float x>
	//    3    5:aload_1         
	//    4    6:getfield        #40  <Field float x>
	//    5    9:fload_2         
	//    6   10:fmul            
	//    7   11:fsub            
	//    8   12:putfield        #40  <Field float x>
		y = y - vector3.y * f;
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:getfield        #42  <Field float y>
	//   12   20:aload_1         
	//   13   21:getfield        #42  <Field float y>
	//   14   24:fload_2         
	//   15   25:fmul            
	//   16   26:fsub            
	//   17   27:putfield        #42  <Field float y>
		z = z - vector3.z * f;
	//   18   30:aload_0         
	//   19   31:aload_0         
	//   20   32:getfield        #44  <Field float z>
	//   21   35:aload_1         
	//   22   36:getfield        #44  <Field float z>
	//   23   39:fload_2         
	//   24   40:fmul            
	//   25   41:fsub            
	//   26   42:putfield        #44  <Field float z>
	//   27   45:return          
	}

	public final void zero()
	{
		set(0.0F, 0.0F, 0.0F);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fconst_0        
	//    3    3:fconst_0        
	//    4    4:invokevirtual   #33  <Method void set(float, float, float)>
	//    5    7:return          
	}

	public static final Vector3 UNIT_X = new Vector3(1.0F, 0.0F, 0.0F);
	public static final Vector3 UNIT_Y = new Vector3(0.0F, 1.0F, 0.0F);
	public static final Vector3 UNIT_Z = new Vector3(0.0F, 0.0F, 1.0F);
	public static final Vector3 ZERO = new Vector3(0.0F, 0.0F, 0.0F);
	public float x;
	public float y;
	public float z;

	static 
	{
	//    0    0:new             #2   <Class Vector3>
	//    1    3:dup             
	//    2    4:fconst_0        
	//    3    5:fconst_0        
	//    4    6:fconst_0        
	//    5    7:invokespecial   #19  <Method void Vector3(float, float, float)>
	//    6   10:putstatic       #21  <Field Vector3 ZERO>
	//    7   13:new             #2   <Class Vector3>
	//    8   16:dup             
	//    9   17:fconst_1        
	//   10   18:fconst_0        
	//   11   19:fconst_0        
	//   12   20:invokespecial   #19  <Method void Vector3(float, float, float)>
	//   13   23:putstatic       #23  <Field Vector3 UNIT_X>
	//   14   26:new             #2   <Class Vector3>
	//   15   29:dup             
	//   16   30:fconst_0        
	//   17   31:fconst_1        
	//   18   32:fconst_0        
	//   19   33:invokespecial   #19  <Method void Vector3(float, float, float)>
	//   20   36:putstatic       #25  <Field Vector3 UNIT_Y>
	//   21   39:new             #2   <Class Vector3>
	//   22   42:dup             
	//   23   43:fconst_0        
	//   24   44:fconst_0        
	//   25   45:fconst_1        
	//   26   46:invokespecial   #19  <Method void Vector3(float, float, float)>
	//   27   49:putstatic       #27  <Field Vector3 UNIT_Z>
	//*  28   52:return          
	}
}
