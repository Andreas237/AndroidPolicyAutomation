// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			lm

public static final class lm$d extends Enum
{

	public static lm$d valueOf(String s)
	{
		return (lm$d)Enum.valueOf(o/lm$d, s);
	//    0    0:ldc1            #2   <Class lm$d>
	//    1    2:aload_0         
	//    2    3:invokestatic    #37  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class lm$d>
	//    4    9:areturn         
	}

	public static lm$d[] values()
	{
		return (lm$d[])((lm$d []) (a)).clone();
	//    0    0:getstatic       #29  <Field lm$d[] a>
	//    1    3:invokevirtual   #44  <Method Object _5B_Lo.lm$d_3B_.clone()>
	//    2    6:checkcast       #40  <Class lm$d[]>
	//    3    9:areturn         
	}

	private static final lm$d a[];
	public static final lm$d b;
	public static final lm$d c;

	static 
	{
		c = new lm$d("HORIZONTAL", 0);
	//    0    0:new             #2   <Class lm$d>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "HORIZONTAL">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void lm$d(String, int)>
	//    5   10:putstatic       #23  <Field lm$d c>
		b = new lm$d("VERTICAL", 1);
	//    6   13:new             #2   <Class lm$d>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "VERTICAL">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void lm$d(String, int)>
	//   11   23:putstatic       #27  <Field lm$d b>
		a = (new lm$d[] {
			c, b
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       lm$d[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #23  <Field lm$d c>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #27  <Field lm$d b>
	//   21   41:aastore         
	//   22   42:putstatic       #29  <Field lm$d[] a>
	//*  23   45:return          
	}

	private lm$d(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #31  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
