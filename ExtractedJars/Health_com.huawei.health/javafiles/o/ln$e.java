// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			ln

public static final class ln$e extends Enum
{

	public static ln$e valueOf(String s)
	{
		return (ln$e)Enum.valueOf(o/ln$e, s);
	//    0    0:ldc1            #2   <Class ln$e>
	//    1    2:aload_0         
	//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ln$e>
	//    4    9:areturn         
	}

	public static ln$e[] values()
	{
		return (ln$e[])((ln$e []) (f)).clone();
	//    0    0:getstatic       #43  <Field ln$e[] f>
	//    1    3:invokevirtual   #58  <Method Object _5B_Lo.ln$e_3B_.clone()>
	//    2    6:checkcast       #54  <Class ln$e[]>
	//    3    9:areturn         
	}

	public static final ln$e a;
	public static final ln$e b;
	public static final ln$e c;
	public static final ln$e d;
	public static final ln$e e;
	private static final ln$e f[];

	static 
	{
		d = new ln$e("TOP", 0);
	//    0    0:new             #2   <Class ln$e>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "TOP">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void ln$e(String, int)>
	//    5   10:putstatic       #25  <Field ln$e d>
		e = new ln$e("BOTTOM", 1);
	//    6   13:new             #2   <Class ln$e>
	//    7   16:dup             
	//    8   17:ldc1            #27  <String "BOTTOM">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void ln$e(String, int)>
	//   11   23:putstatic       #29  <Field ln$e e>
		a = new ln$e("BOTH_SIDED", 2);
	//   12   26:new             #2   <Class ln$e>
	//   13   29:dup             
	//   14   30:ldc1            #31  <String "BOTH_SIDED">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void ln$e(String, int)>
	//   17   36:putstatic       #33  <Field ln$e a>
		c = new ln$e("TOP_INSIDE", 3);
	//   18   39:new             #2   <Class ln$e>
	//   19   42:dup             
	//   20   43:ldc1            #35  <String "TOP_INSIDE">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void ln$e(String, int)>
	//   23   49:putstatic       #37  <Field ln$e c>
		b = new ln$e("BOTTOM_INSIDE", 4);
	//   24   52:new             #2   <Class ln$e>
	//   25   55:dup             
	//   26   56:ldc1            #39  <String "BOTTOM_INSIDE">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void ln$e(String, int)>
	//   29   62:putstatic       #41  <Field ln$e b>
		f = (new ln$e[] {
			d, e, a, c, b
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       ln$e[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #25  <Field ln$e d>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #29  <Field ln$e e>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #33  <Field ln$e a>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #37  <Field ln$e c>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #41  <Field ln$e b>
	//   51   98:aastore         
	//   52   99:putstatic       #43  <Field ln$e[] f>
	//*  53  102:return          
	}

	private ln$e(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #45  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
