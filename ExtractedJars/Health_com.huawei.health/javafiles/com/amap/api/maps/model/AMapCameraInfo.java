// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;


public class AMapCameraInfo
{

	public AMapCameraInfo(float f1, float f2, float f3, float f4, float f5, float f6)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #18  <Field float a>
		b = 1.0F;
	//    5    9:aload_0         
	//    6   10:fconst_1        
	//    7   11:putfield        #20  <Field float b>
		c = 0.0F;
	//    8   14:aload_0         
	//    9   15:fconst_0        
	//   10   16:putfield        #22  <Field float c>
		d = 0.0F;
	//   11   19:aload_0         
	//   12   20:fconst_0        
	//   13   21:putfield        #24  <Field float d>
		e = 0.0F;
	//   14   24:aload_0         
	//   15   25:fconst_0        
	//   16   26:putfield        #26  <Field float e>
		f = 0.0F;
	//   17   29:aload_0         
	//   18   30:fconst_0        
	//   19   31:putfield        #28  <Field float f>
		a = f1;
	//   20   34:aload_0         
	//   21   35:fload_1         
	//   22   36:putfield        #18  <Field float a>
		b = f2;
	//   23   39:aload_0         
	//   24   40:fload_2         
	//   25   41:putfield        #20  <Field float b>
		c = f3;
	//   26   44:aload_0         
	//   27   45:fload_3         
	//   28   46:putfield        #22  <Field float c>
		d = f4;
	//   29   49:aload_0         
	//   30   50:fload           4
	//   31   52:putfield        #24  <Field float d>
		e = f5;
	//   32   55:aload_0         
	//   33   56:fload           5
	//   34   58:putfield        #26  <Field float e>
		f = f6;
	//   35   61:aload_0         
	//   36   62:fload           6
	//   37   64:putfield        #28  <Field float f>
	//   38   67:return          
	}

	public float getAspectRatio()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field float b>
	//    2    4:freturn         
	}

	public float getFov()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field float a>
	//    2    4:freturn         
	}

	public float getRotate()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field float c>
	//    2    4:freturn         
	}

	public float getX()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field float d>
	//    2    4:freturn         
	}

	public float getY()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field float e>
	//    2    4:freturn         
	}

	public float getZ()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field float f>
	//    2    4:freturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #40  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[").append("fov:").append(a).append(" ");
	//    4    8:aload_1         
	//    5    9:ldc1            #43  <String "[">
	//    6   11:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:ldc1            #49  <String "fov:">
	//    8   16:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:aload_0         
	//   10   20:getfield        #18  <Field float a>
	//   11   23:invokevirtual   #52  <Method StringBuilder StringBuilder.append(float)>
	//   12   26:ldc1            #54  <String " ">
	//   13   28:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   14   31:pop             
		stringbuilder.append("aspectRatio:").append(b).append(" ");
	//   15   32:aload_1         
	//   16   33:ldc1            #56  <String "aspectRatio:">
	//   17   35:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   18   38:aload_0         
	//   19   39:getfield        #20  <Field float b>
	//   20   42:invokevirtual   #52  <Method StringBuilder StringBuilder.append(float)>
	//   21   45:ldc1            #54  <String " ">
	//   22   47:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   23   50:pop             
		stringbuilder.append("rotate:").append(c).append(" ");
	//   24   51:aload_1         
	//   25   52:ldc1            #58  <String "rotate:">
	//   26   54:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   27   57:aload_0         
	//   28   58:getfield        #22  <Field float c>
	//   29   61:invokevirtual   #52  <Method StringBuilder StringBuilder.append(float)>
	//   30   64:ldc1            #54  <String " ">
	//   31   66:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   32   69:pop             
		stringbuilder.append("pos_x:").append(d).append(" ");
	//   33   70:aload_1         
	//   34   71:ldc1            #60  <String "pos_x:">
	//   35   73:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   36   76:aload_0         
	//   37   77:getfield        #24  <Field float d>
	//   38   80:invokevirtual   #52  <Method StringBuilder StringBuilder.append(float)>
	//   39   83:ldc1            #54  <String " ">
	//   40   85:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   41   88:pop             
		stringbuilder.append("pos_y:").append(e).append(" ");
	//   42   89:aload_1         
	//   43   90:ldc1            #62  <String "pos_y:">
	//   44   92:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   45   95:aload_0         
	//   46   96:getfield        #26  <Field float e>
	//   47   99:invokevirtual   #52  <Method StringBuilder StringBuilder.append(float)>
	//   48  102:ldc1            #54  <String " ">
	//   49  104:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   50  107:pop             
		stringbuilder.append("pos_z:").append(f).append("]");
	//   51  108:aload_1         
	//   52  109:ldc1            #64  <String "pos_z:">
	//   53  111:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   54  114:aload_0         
	//   55  115:getfield        #28  <Field float f>
	//   56  118:invokevirtual   #52  <Method StringBuilder StringBuilder.append(float)>
	//   57  121:ldc1            #66  <String "]">
	//   58  123:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   59  126:pop             
		return stringbuilder.toString();
	//   60  127:aload_1         
	//   61  128:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   62  131:areturn         
	}

	private float a;
	private float b;
	private float c;
	private float d;
	private float e;
	private float f;
}
