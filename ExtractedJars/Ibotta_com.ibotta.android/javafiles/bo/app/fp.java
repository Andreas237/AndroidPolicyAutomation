// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;


public final class fp extends Enum
{

	private fp(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #28  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static fp valueOf(String s)
	{
		return (fp)Enum.valueOf(bo/app/fp, s);
	//    0    0:ldc1            #2   <Class fp>
	//    1    2:aload_0         
	//    2    3:invokestatic    #34  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class fp>
	//    4    9:areturn         
	}

	public static fp[] values()
	{
		return (fp[])((fp []) (c)).clone();
	//    0    0:getstatic       #26  <Field fp[] c>
	//    1    3:invokevirtual   #41  <Method Object _5B_Lbo.app.fp_3B_.clone()>
	//    2    6:checkcast       #37  <Class fp[]>
	//    3    9:areturn         
	}

	public static final fp a;
	public static final fp b;
	private static final fp c[];

	static 
	{
		a = new fp("ZIP", 0);
	//    0    0:new             #2   <Class fp>
	//    1    3:dup             
	//    2    4:ldc1            #14  <String "ZIP">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #18  <Method void fp(String, int)>
	//    5   10:putstatic       #20  <Field fp a>
		b = new fp("IMAGE", 1);
	//    6   13:new             #2   <Class fp>
	//    7   16:dup             
	//    8   17:ldc1            #22  <String "IMAGE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #18  <Method void fp(String, int)>
	//   11   23:putstatic       #24  <Field fp b>
		c = (new fp[] {
			a, b
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       fp[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #20  <Field fp a>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #24  <Field fp b>
	//   21   41:aastore         
	//   22   42:putstatic       #26  <Field fp[] c>
	//*  23   45:return          
	}
}
