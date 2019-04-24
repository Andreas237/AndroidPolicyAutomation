// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			lp

public static final class lp$b extends Enum
{

	public static lp$b valueOf(String s)
	{
		return (lp$b)Enum.valueOf(o/lp$b, s);
	//    0    0:ldc1            #2   <Class lp$b>
	//    1    2:aload_0         
	//    2    3:invokestatic    #36  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class lp$b>
	//    4    9:areturn         
	}

	public static lp$b[] values()
	{
		return (lp$b[])((lp$b []) (c)).clone();
	//    0    0:getstatic       #28  <Field lp$b[] c>
	//    1    3:invokevirtual   #43  <Method Object _5B_Lo.lp$b_3B_.clone()>
	//    2    6:checkcast       #39  <Class lp$b[]>
	//    3    9:areturn         
	}

	public static final lp$b b;
	private static final lp$b c[];
	public static final lp$b e;

	static 
	{
		b = new lp$b("LEFT", 0);
	//    0    0:new             #2   <Class lp$b>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "LEFT">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void lp$b(String, int)>
	//    5   10:putstatic       #22  <Field lp$b b>
		e = new lp$b("RIGHT", 1);
	//    6   13:new             #2   <Class lp$b>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "RIGHT">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void lp$b(String, int)>
	//   11   23:putstatic       #26  <Field lp$b e>
		c = (new lp$b[] {
			b, e
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       lp$b[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field lp$b b>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #26  <Field lp$b e>
	//   21   41:aastore         
	//   22   42:putstatic       #28  <Field lp$b[] c>
	//*  23   45:return          
	}

	private lp$b(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #30  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
