// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;


public final class ey extends Enum
{

	private ey(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #43  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static ey valueOf(String s)
	{
		return (ey)Enum.valueOf(bo/app/ey, s);
	//    0    0:ldc1            #2   <Class ey>
	//    1    2:aload_0         
	//    2    3:invokestatic    #49  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ey>
	//    4    9:areturn         
	}

	public static ey[] values()
	{
		return (ey[])((ey []) (f)).clone();
	//    0    0:getstatic       #41  <Field ey[] f>
	//    1    3:invokevirtual   #56  <Method Object _5B_Lbo.app.ey_3B_.clone()>
	//    2    6:checkcast       #52  <Class ey[]>
	//    3    9:areturn         
	}

	public static final ey a;
	public static final ey b;
	public static final ey c;
	public static final ey d;
	public static final ey e;
	private static final ey f[];

	static 
	{
		a = new ey("STRING", 0);
	//    0    0:new             #2   <Class ey>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "STRING">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void ey(String, int)>
	//    5   10:putstatic       #23  <Field ey a>
		b = new ey("DATE", 1);
	//    6   13:new             #2   <Class ey>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "DATE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void ey(String, int)>
	//   11   23:putstatic       #27  <Field ey b>
		c = new ey("NUMBER", 2);
	//   12   26:new             #2   <Class ey>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "NUMBER">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void ey(String, int)>
	//   17   36:putstatic       #31  <Field ey c>
		d = new ey("BOOLEAN", 3);
	//   18   39:new             #2   <Class ey>
	//   19   42:dup             
	//   20   43:ldc1            #33  <String "BOOLEAN">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #21  <Method void ey(String, int)>
	//   23   49:putstatic       #35  <Field ey d>
		e = new ey("UNKNOWN", 4);
	//   24   52:new             #2   <Class ey>
	//   25   55:dup             
	//   26   56:ldc1            #37  <String "UNKNOWN">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #21  <Method void ey(String, int)>
	//   29   62:putstatic       #39  <Field ey e>
		f = (new ey[] {
			a, b, c, d, e
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       ey[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #23  <Field ey a>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #27  <Field ey b>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #31  <Field ey c>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #35  <Field ey d>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #39  <Field ey e>
	//   51   98:aastore         
	//   52   99:putstatic       #41  <Field ey[] f>
	//*  53  102:return          
	}
}
