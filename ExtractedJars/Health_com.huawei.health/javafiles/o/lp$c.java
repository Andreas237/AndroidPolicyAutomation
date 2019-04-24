// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			lp

public static final class lp$c extends Enum
{

	public static lp$c valueOf(String s)
	{
		return (lp$c)Enum.valueOf(o/lp$c, s);
	//    0    0:ldc1            #2   <Class lp$c>
	//    1    2:aload_0         
	//    2    3:invokestatic    #36  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class lp$c>
	//    4    9:areturn         
	}

	public static lp$c[] values()
	{
		return (lp$c[])((lp$c []) (e)).clone();
	//    0    0:getstatic       #28  <Field lp$c[] e>
	//    1    3:invokevirtual   #43  <Method Object _5B_Lo.lp$c_3B_.clone()>
	//    2    6:checkcast       #39  <Class lp$c[]>
	//    3    9:areturn         
	}

	public static final lp$c a;
	public static final lp$c c;
	private static final lp$c e[];

	static 
	{
		a = new lp$c("OUTSIDE_CHART", 0);
	//    0    0:new             #2   <Class lp$c>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "OUTSIDE_CHART">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void lp$c(String, int)>
	//    5   10:putstatic       #22  <Field lp$c a>
		c = new lp$c("INSIDE_CHART", 1);
	//    6   13:new             #2   <Class lp$c>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "INSIDE_CHART">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void lp$c(String, int)>
	//   11   23:putstatic       #26  <Field lp$c c>
		e = (new lp$c[] {
			a, c
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       lp$c[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field lp$c a>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #26  <Field lp$c c>
	//   21   41:aastore         
	//   22   42:putstatic       #28  <Field lp$c[] e>
	//*  23   45:return          
	}

	private lp$c(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #30  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
