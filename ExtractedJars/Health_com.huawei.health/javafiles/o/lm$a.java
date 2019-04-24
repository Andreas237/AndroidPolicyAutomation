// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			lm

public static final class lm$a extends Enum
{

	public static lm$a valueOf(String s)
	{
		return (lm$a)Enum.valueOf(o/lm$a, s);
	//    0    0:ldc1            #2   <Class lm$a>
	//    1    2:aload_0         
	//    2    3:invokestatic    #41  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class lm$a>
	//    4    9:areturn         
	}

	public static lm$a[] values()
	{
		return (lm$a[])((lm$a []) (e)).clone();
	//    0    0:getstatic       #33  <Field lm$a[] e>
	//    1    3:invokevirtual   #48  <Method Object _5B_Lo.lm$a_3B_.clone()>
	//    2    6:checkcast       #44  <Class lm$a[]>
	//    3    9:areturn         
	}

	public static final lm$a a;
	public static final lm$a c;
	public static final lm$a d;
	private static final lm$a e[];

	static 
	{
		d = new lm$a("LEFT", 0);
	//    0    0:new             #2   <Class lm$a>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "LEFT">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void lm$a(String, int)>
	//    5   10:putstatic       #23  <Field lm$a d>
		c = new lm$a("CENTER", 1);
	//    6   13:new             #2   <Class lm$a>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "CENTER">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void lm$a(String, int)>
	//   11   23:putstatic       #27  <Field lm$a c>
		a = new lm$a("RIGHT", 2);
	//   12   26:new             #2   <Class lm$a>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "RIGHT">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void lm$a(String, int)>
	//   17   36:putstatic       #31  <Field lm$a a>
		e = (new lm$a[] {
			d, c, a
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       lm$a[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field lm$a d>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #27  <Field lm$a c>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #31  <Field lm$a a>
	//   31   60:aastore         
	//   32   61:putstatic       #33  <Field lm$a[] e>
	//*  33   64:return          
	}

	private lm$a(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #35  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
