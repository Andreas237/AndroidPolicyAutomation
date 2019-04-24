// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			ny

public class nw extends ny.b
{

	private nw(double d, double d1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void ny$b()>
		b = d;
	//    2    4:aload_0         
	//    3    5:dload_1         
	//    4    6:putfield        #32  <Field double b>
		c = d1;
	//    5    9:aload_0         
	//    6   10:dload_3         
	//    7   11:putfield        #34  <Field double c>
	//    8   14:return          
	}

	public static nw a(double d, double d1)
	{
		nw nw1 = (nw)e.b();
	//    0    0:getstatic       #23  <Field ny e>
	//    1    3:invokevirtual   #39  <Method ny$b ny.b()>
	//    2    6:checkcast       #2   <Class nw>
	//    3    9:astore          4
		nw1.b = d;
	//    4   11:aload           4
	//    5   13:dload_0         
	//    6   14:putfield        #32  <Field double b>
		nw1.c = d1;
	//    7   17:aload           4
	//    8   19:dload_2         
	//    9   20:putfield        #34  <Field double c>
		return nw1;
	//   10   23:aload           4
	//   11   25:areturn         
	}

	public static void e(nw nw1)
	{
		e.c(((ny.b) (nw1)));
	//    0    0:getstatic       #23  <Field ny e>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #43  <Method void ny.c(ny$b)>
	//    3    7:return          
	}

	protected ny.b a()
	{
		return ((ny.b) (new nw(0.0D, 0.0D)));
	//    0    0:new             #2   <Class nw>
	//    1    3:dup             
	//    2    4:dconst_0        
	//    3    5:dconst_0        
	//    4    6:invokespecial   #16  <Method void nw(double, double)>
	//    5    9:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("MPPointD, x: ").append(b).append(", y: ").append(c).toString();
	//    0    0:new             #47  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void StringBuilder()>
	//    3    7:ldc1            #50  <String "MPPointD, x: ">
	//    4    9:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #32  <Field double b>
	//    7   16:invokevirtual   #57  <Method StringBuilder StringBuilder.append(double)>
	//    8   19:ldc1            #59  <String ", y: ">
	//    9   21:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #34  <Field double c>
	//   12   28:invokevirtual   #57  <Method StringBuilder StringBuilder.append(double)>
	//   13   31:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   14   34:areturn         
	}

	private static ny e;
	public double b;
	public double c;

	static 
	{
		e = ny.b(64, ((ny.b) (new nw(0.0D, 0.0D))));
	//    0    0:bipush          64
	//    1    2:new             #2   <Class nw>
	//    2    5:dup             
	//    3    6:dconst_0        
	//    4    7:dconst_0        
	//    5    8:invokespecial   #16  <Method void nw(double, double)>
	//    6   11:invokestatic    #21  <Method ny ny.b(int, ny$b)>
	//    7   14:putstatic       #23  <Field ny e>
		e.c(0.5F);
	//    8   17:getstatic       #23  <Field ny e>
	//    9   20:ldc1            #24  <Float 0.5F>
	//   10   22:invokevirtual   #27  <Method void ny.c(float)>
	//*  11   25:return          
	}
}
