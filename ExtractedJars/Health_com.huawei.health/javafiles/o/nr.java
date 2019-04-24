// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			ny

public final class nr extends ny.b
{

	public nr()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void ny$b()>
	//    2    4:return          
	}

	public nr(float f, float f1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void ny$b()>
		a = f;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #34  <Field float a>
		d = f1;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #36  <Field float d>
	//    8   14:return          
	}

	public static void b(nr nr1)
	{
		e.c(((ny.b) (nr1)));
	//    0    0:getstatic       #24  <Field ny e>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #40  <Method void ny.c(ny$b)>
	//    3    7:return          
	}

	public static nr c(float f, float f1)
	{
		nr nr1 = (nr)e.b();
	//    0    0:getstatic       #24  <Field ny e>
	//    1    3:invokevirtual   #44  <Method ny$b ny.b()>
	//    2    6:checkcast       #2   <Class nr>
	//    3    9:astore_2        
		nr1.a = f;
	//    4   10:aload_2         
	//    5   11:fload_0         
	//    6   12:putfield        #34  <Field float a>
		nr1.d = f1;
	//    7   15:aload_2         
	//    8   16:fload_1         
	//    9   17:putfield        #36  <Field float d>
		return nr1;
	//   10   20:aload_2         
	//   11   21:areturn         
	}

	protected ny.b a()
	{
		return ((ny.b) (new nr(0.0F, 0.0F)));
	//    0    0:new             #2   <Class nr>
	//    1    3:dup             
	//    2    4:fconst_0        
	//    3    5:fconst_0        
	//    4    6:invokespecial   #16  <Method void nr(float, float)>
	//    5    9:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(this == obj)
	//*   4    6:aload_0         
	//*   5    7:aload_1         
	//*   6    8:if_acmpne       13
			return true;
	//    7   11:iconst_1        
	//    8   12:ireturn         
		if(obj instanceof nr)
	//*   9   13:aload_1         
	//*  10   14:instanceof      #2   <Class nr>
	//*  11   17:ifeq            53
		{
			obj = ((Object) ((nr)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class nr>
	//   14   24:astore_1        
			return a == ((nr) (obj)).a && d == ((nr) (obj)).d;
	//   15   25:aload_0         
	//   16   26:getfield        #34  <Field float a>
	//   17   29:aload_1         
	//   18   30:getfield        #34  <Field float a>
	//   19   33:fcmpl           
	//   20   34:ifne            51
	//   21   37:aload_0         
	//   22   38:getfield        #36  <Field float d>
	//   23   41:aload_1         
	//   24   42:getfield        #36  <Field float d>
	//   25   45:fcmpl           
	//   26   46:ifne            51
	//   27   49:iconst_1        
	//   28   50:ireturn         
	//   29   51:iconst_0        
	//   30   52:ireturn         
		} else
		{
			return false;
	//   31   53:iconst_0        
	//   32   54:ireturn         
		}
	}

	public int hashCode()
	{
		return Float.floatToIntBits(a) ^ Float.floatToIntBits(d);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field float a>
	//    2    4:invokestatic    #54  <Method int Float.floatToIntBits(float)>
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field float d>
	//    5   11:invokestatic    #54  <Method int Float.floatToIntBits(float)>
	//    6   14:ixor            
	//    7   15:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append(a).append("x").append(d).toString();
	//    0    0:new             #58  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #59  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:getfield        #34  <Field float a>
	//    5   11:invokevirtual   #63  <Method StringBuilder StringBuilder.append(float)>
	//    6   14:ldc1            #65  <String "x">
	//    7   16:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:aload_0         
	//    9   20:getfield        #36  <Field float d>
	//   10   23:invokevirtual   #63  <Method StringBuilder StringBuilder.append(float)>
	//   11   26:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   12   29:areturn         
	}

	private static ny e;
	public float a;
	public float d;

	static 
	{
		e = ny.b(256, ((ny.b) (new nr(0.0F, 0.0F))));
	//    0    0:sipush          256
	//    1    3:new             #2   <Class nr>
	//    2    6:dup             
	//    3    7:fconst_0        
	//    4    8:fconst_0        
	//    5    9:invokespecial   #16  <Method void nr(float, float)>
	//    6   12:invokestatic    #22  <Method ny ny.b(int, ny$b)>
	//    7   15:putstatic       #24  <Field ny e>
		e.c(0.5F);
	//    8   18:getstatic       #24  <Field ny e>
	//    9   21:ldc1            #25  <Float 0.5F>
	//   10   23:invokevirtual   #29  <Method void ny.c(float)>
	//*  11   26:return          
	}
}
