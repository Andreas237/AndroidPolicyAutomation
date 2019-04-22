// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;


public final class go extends Enum
{

	private go(String s, int i, boolean flag, boolean flag1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #43  <Method void Enum(String, int)>
		e = flag;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #45  <Field boolean e>
		f = flag1;
	//    7   11:aload_0         
	//    8   12:iload           4
	//    9   14:putfield        #47  <Field boolean f>
	//   10   17:return          
	}

	public static go valueOf(String s)
	{
		return (go)Enum.valueOf(bo/app/go, s);
	//    0    0:ldc1            #2   <Class go>
	//    1    2:aload_0         
	//    2    3:invokestatic    #54  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class go>
	//    4    9:areturn         
	}

	public static go[] values()
	{
		return (go[])((go []) (g)).clone();
	//    0    0:getstatic       #39  <Field go[] g>
	//    1    3:invokevirtual   #61  <Method Object _5B_Lbo.app.go_3B_.clone()>
	//    2    6:checkcast       #57  <Class go[]>
	//    3    9:areturn         
	}

	public boolean a()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field boolean e>
	//    2    4:ireturn         
	}

	public boolean b()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field boolean f>
	//    2    4:ireturn         
	}

	public static final go a;
	public static final go b;
	public static final go c;
	public static final go d;
	private static final go g[];
	private final boolean e;
	private final boolean f;

	static 
	{
		a = new go("STRICT", 0, false, true);
	//    0    0:new             #2   <Class go>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "STRICT">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:iconst_1        
	//    6    9:invokespecial   #23  <Method void go(String, int, boolean, boolean)>
	//    7   12:putstatic       #25  <Field go a>
		b = new go("LENIENT", 1, true, false);
	//    8   15:new             #2   <Class go>
	//    9   18:dup             
	//   10   19:ldc1            #27  <String "LENIENT">
	//   11   21:iconst_1        
	//   12   22:iconst_1        
	//   13   23:iconst_0        
	//   14   24:invokespecial   #23  <Method void go(String, int, boolean, boolean)>
	//   15   27:putstatic       #29  <Field go b>
		c = new go("NON_EXTENSIBLE", 2, false, false);
	//   16   30:new             #2   <Class go>
	//   17   33:dup             
	//   18   34:ldc1            #31  <String "NON_EXTENSIBLE">
	//   19   36:iconst_2        
	//   20   37:iconst_0        
	//   21   38:iconst_0        
	//   22   39:invokespecial   #23  <Method void go(String, int, boolean, boolean)>
	//   23   42:putstatic       #33  <Field go c>
		d = new go("STRICT_ORDER", 3, true, true);
	//   24   45:new             #2   <Class go>
	//   25   48:dup             
	//   26   49:ldc1            #35  <String "STRICT_ORDER">
	//   27   51:iconst_3        
	//   28   52:iconst_1        
	//   29   53:iconst_1        
	//   30   54:invokespecial   #23  <Method void go(String, int, boolean, boolean)>
	//   31   57:putstatic       #37  <Field go d>
		g = (new go[] {
			a, b, c, d
		});
	//   32   60:iconst_4        
	//   33   61:anewarray       go[]
	//   34   64:dup             
	//   35   65:iconst_0        
	//   36   66:getstatic       #25  <Field go a>
	//   37   69:aastore         
	//   38   70:dup             
	//   39   71:iconst_1        
	//   40   72:getstatic       #29  <Field go b>
	//   41   75:aastore         
	//   42   76:dup             
	//   43   77:iconst_2        
	//   44   78:getstatic       #33  <Field go c>
	//   45   81:aastore         
	//   46   82:dup             
	//   47   83:iconst_3        
	//   48   84:getstatic       #37  <Field go d>
	//   49   87:aastore         
	//   50   88:putstatic       #39  <Field go[] g>
	//*  51   91:return          
	}
}
