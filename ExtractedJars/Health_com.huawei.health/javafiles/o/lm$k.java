// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			lm

public static final class lm$k extends Enum
{

	public static lm$k valueOf(String s)
	{
		return (lm$k)Enum.valueOf(o/lm$k, s);
	//    0    0:ldc1            #2   <Class lm$k>
	//    1    2:aload_0         
	//    2    3:invokestatic    #42  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class lm$k>
	//    4    9:areturn         
	}

	public static lm$k[] values()
	{
		return (lm$k[])((lm$k []) (a)).clone();
	//    0    0:getstatic       #34  <Field lm$k[] a>
	//    1    3:invokevirtual   #49  <Method Object _5B_Lo.lm$k_3B_.clone()>
	//    2    6:checkcast       #45  <Class lm$k[]>
	//    3    9:areturn         
	}

	private static final lm$k a[];
	public static final lm$k b;
	public static final lm$k c;
	public static final lm$k d;

	static 
	{
		c = new lm$k("TOP", 0);
	//    0    0:new             #2   <Class lm$k>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "TOP">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void lm$k(String, int)>
	//    5   10:putstatic       #24  <Field lm$k c>
		b = new lm$k("CENTER", 1);
	//    6   13:new             #2   <Class lm$k>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "CENTER">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void lm$k(String, int)>
	//   11   23:putstatic       #28  <Field lm$k b>
		d = new lm$k("BOTTOM", 2);
	//   12   26:new             #2   <Class lm$k>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "BOTTOM">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void lm$k(String, int)>
	//   17   36:putstatic       #32  <Field lm$k d>
		a = (new lm$k[] {
			c, b, d
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       lm$k[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #24  <Field lm$k c>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #28  <Field lm$k b>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #32  <Field lm$k d>
	//   31   60:aastore         
	//   32   61:putstatic       #34  <Field lm$k[] a>
	//*  33   64:return          
	}

	private lm$k(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #36  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
