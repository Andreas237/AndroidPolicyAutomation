// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.list3d;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.AnimationUtils;

public abstract class Dynamics
	implements Parcelable
{

	public Dynamics()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		c = 3.402823E+38F;
	//    2    4:aload_0         
	//    3    5:ldc1            #18  <Float 3.402823E+38F>
	//    4    7:putfield        #20  <Field float c>
		d = -3.402823E+38F;
	//    5   10:aload_0         
	//    6   11:ldc1            #21  <Float -3.402823E+38F>
	//    7   13:putfield        #23  <Field float d>
		e = 0L;
	//    8   16:aload_0         
	//    9   17:lconst_0        
	//   10   18:putfield        #25  <Field long e>
	//   11   21:return          
	}

	public Dynamics(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		c = 3.402823E+38F;
	//    2    4:aload_0         
	//    3    5:ldc1            #18  <Float 3.402823E+38F>
	//    4    7:putfield        #20  <Field float c>
		d = -3.402823E+38F;
	//    5   10:aload_0         
	//    6   11:ldc1            #21  <Float -3.402823E+38F>
	//    7   13:putfield        #23  <Field float d>
		e = 0L;
	//    8   16:aload_0         
	//    9   17:lconst_0        
	//   10   18:putfield        #25  <Field long e>
		a = parcel.readFloat();
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #33  <Method float Parcel.readFloat()>
	//   14   26:putfield        #35  <Field float a>
		b = parcel.readFloat();
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #33  <Method float Parcel.readFloat()>
	//   18   34:putfield        #37  <Field float b>
		c = parcel.readFloat();
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokevirtual   #33  <Method float Parcel.readFloat()>
	//   22   42:putfield        #20  <Field float c>
		d = parcel.readFloat();
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:invokevirtual   #33  <Method float Parcel.readFloat()>
	//   26   50:putfield        #23  <Field float d>
		e = AnimationUtils.currentAnimationTimeMillis();
	//   27   53:aload_0         
	//   28   54:invokestatic    #43  <Method long AnimationUtils.currentAnimationTimeMillis()>
	//   29   57:putfield        #25  <Field long e>
	//   30   60:return          
	}

	public float a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field float a>
	//    2    4:freturn         
	}

	public void a(double d1)
	{
		a = (float)((double)a * d1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field float a>
	//    3    5:f2d             
	//    4    6:dload_1         
	//    5    7:dmul            
	//    6    8:d2f             
	//    7    9:putfield        #35  <Field float a>
	//    8   12:return          
	}

	public void a(float f)
	{
		c = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #20  <Field float c>
	//    3    5:return          
	}

	public void a(float f, float f1, long l)
	{
		b = f1;
	//    0    0:aload_0         
	//    1    1:fload_2         
	//    2    2:putfield        #37  <Field float b>
		a = f;
	//    3    5:aload_0         
	//    4    6:fload_1         
	//    5    7:putfield        #35  <Field float a>
		e = l;
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:putfield        #25  <Field long e>
	//    9   15:return          
	}

	protected abstract void a(int i);

	public void a(long l)
	{
		int i = 50;
	//    0    0:bipush          50
	//    1    2:istore_3        
		if(e != 0L)
	//*   2    3:aload_0         
	//*   3    4:getfield        #25  <Field long e>
	//*   4    7:lconst_0        
	//*   5    8:lcmp            
	//*   6    9:ifeq            33
		{
			int j = (int)(l - e);
	//    7   12:lload_1         
	//    8   13:aload_0         
	//    9   14:getfield        #25  <Field long e>
	//   10   17:lsub            
	//   11   18:l2i             
	//   12   19:istore          4
			if(j <= 50)
	//*  13   21:iload           4
	//*  14   23:bipush          50
	//*  15   25:icmple          39
	//*  16   28:aload_0         
	//*  17   29:iload_3         
	//*  18   30:invokevirtual   #50  <Method void a(int)>
	//*  19   33:aload_0         
	//*  20   34:lload_1         
	//*  21   35:putfield        #25  <Field long e>
	//*  22   38:return          
				i = j;
	//   23   39:iload           4
	//   24   41:istore_3        
			a(i);
		}
		e = l;
	//*  25   42:goto            28
	}

	public boolean a(float f, float f1)
	{
		boolean flag;
		boolean flag1;
		if(Math.abs(b) < f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field float b>
	//*   2    4:invokestatic    #57  <Method float Math.abs(float)>
	//*   3    7:fload_1         
	//*   4    8:fcmpg           
	//*   5    9:ifge            56
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_3        
		else
	//*   8   14:aload_0         
	//*   9   15:getfield        #35  <Field float a>
	//*  10   18:fload_2         
	//*  11   19:fsub            
	//*  12   20:aload_0         
	//*  13   21:getfield        #20  <Field float c>
	//*  14   24:fcmpg           
	//*  15   25:ifge            61
	//*  16   28:aload_0         
	//*  17   29:getfield        #35  <Field float a>
	//*  18   32:fload_2         
	//*  19   33:fadd            
	//*  20   34:aload_0         
	//*  21   35:getfield        #23  <Field float d>
	//*  22   38:fcmpl           
	//*  23   39:ifle            61
	//*  24   42:iconst_1        
	//*  25   43:istore          4
	//*  26   45:iload_3         
	//*  27   46:ifeq            67
	//*  28   49:iload           4
	//*  29   51:ifeq            67
	//*  30   54:iconst_1        
	//*  31   55:ireturn         
			flag = false;
	//   32   56:iconst_0        
	//   33   57:istore_3        
		if(a - f1 < c && a + f1 > d)
			flag1 = true;
		else
	//*  34   58:goto            14
			flag1 = false;
	//   35   61:iconst_0        
	//   36   62:istore          4
		return flag && flag1;
	//   37   64:goto            45
	//   38   67:iconst_0        
	//   39   68:ireturn         
	}

	public float b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field float b>
	//    2    4:freturn         
	}

	public void b(float f)
	{
		d = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #23  <Field float d>
	//    3    5:return          
	}

	protected float c()
	{
		float f = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_1        
		if(a > c)
	//*   2    2:aload_0         
	//*   3    3:getfield        #35  <Field float a>
	//*   4    6:aload_0         
	//*   5    7:getfield        #20  <Field float c>
	//*   6   10:fcmpl           
	//*   7   11:ifle            26
			f = c - a;
	//    8   14:aload_0         
	//    9   15:getfield        #20  <Field float c>
	//   10   18:aload_0         
	//   11   19:getfield        #35  <Field float a>
	//   12   22:fsub            
	//   13   23:fstore_1        
		else
	//*  14   24:fload_1         
	//*  15   25:freturn         
		if(a < d)
	//*  16   26:aload_0         
	//*  17   27:getfield        #35  <Field float a>
	//*  18   30:aload_0         
	//*  19   31:getfield        #23  <Field float d>
	//*  20   34:fcmpg           
	//*  21   35:ifge            24
			return d - a;
	//   22   38:aload_0         
	//   23   39:getfield        #23  <Field float d>
	//   24   42:aload_0         
	//   25   43:getfield        #35  <Field float a>
	//   26   46:fsub            
	//   27   47:freturn         
		return f;
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("Position: [").append(a).append("], Velocity:[").append(b).append("], MaxPos: [").append(c).append("], mMinPos: [").append(d).append("] LastTime:[").append(e).append("]").toString();
	//    0    0:new             #63  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #64  <Method void StringBuilder()>
	//    3    7:ldc1            #66  <String "Position: [">
	//    4    9:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #35  <Field float a>
	//    7   16:invokevirtual   #73  <Method StringBuilder StringBuilder.append(float)>
	//    8   19:ldc1            #75  <String "], Velocity:[">
	//    9   21:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #37  <Field float b>
	//   12   28:invokevirtual   #73  <Method StringBuilder StringBuilder.append(float)>
	//   13   31:ldc1            #77  <String "], MaxPos: [">
	//   14   33:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #20  <Field float c>
	//   17   40:invokevirtual   #73  <Method StringBuilder StringBuilder.append(float)>
	//   18   43:ldc1            #79  <String "], mMinPos: [">
	//   19   45:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #23  <Field float d>
	//   22   52:invokevirtual   #73  <Method StringBuilder StringBuilder.append(float)>
	//   23   55:ldc1            #81  <String "] LastTime:[">
	//   24   57:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   25   60:aload_0         
	//   26   61:getfield        #25  <Field long e>
	//   27   64:invokevirtual   #84  <Method StringBuilder StringBuilder.append(long)>
	//   28   67:ldc1            #86  <String "]">
	//   29   69:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   30   72:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   31   75:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeFloat(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field float a>
	//    3    5:invokevirtual   #93  <Method void Parcel.writeFloat(float)>
		parcel.writeFloat(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #37  <Field float b>
	//    7   13:invokevirtual   #93  <Method void Parcel.writeFloat(float)>
		parcel.writeFloat(c);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #20  <Field float c>
	//   11   21:invokevirtual   #93  <Method void Parcel.writeFloat(float)>
		parcel.writeFloat(d);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #23  <Field float d>
	//   15   29:invokevirtual   #93  <Method void Parcel.writeFloat(float)>
	//   16   32:return          
	}

	protected float a;
	protected float b;
	protected float c;
	protected float d;
	protected long e;
}
