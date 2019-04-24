// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			lm

public static final class lm$c extends Enum
{

	public static lm$c valueOf(String s)
	{
		return (lm$c)Enum.valueOf(o/lm$c, s);
	//    0    0:ldc1            #2   <Class lm$c>
	//    1    2:aload_0         
	//    2    3:invokestatic    #56  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class lm$c>
	//    4    9:areturn         
	}

	public static lm$c[] values()
	{
		return (lm$c[])((lm$c []) (k)).clone();
	//    0    0:getstatic       #48  <Field lm$c[] k>
	//    1    3:invokevirtual   #63  <Method Object _5B_Lo.lm$c_3B_.clone()>
	//    2    6:checkcast       #59  <Class lm$c[]>
	//    3    9:areturn         
	}

	public static final lm$c a;
	public static final lm$c b;
	public static final lm$c c;
	public static final lm$c d;
	public static final lm$c e;
	public static final lm$c h;
	private static final lm$c k[];

	static 
	{
		c = new lm$c("NONE", 0);
	//    0    0:new             #2   <Class lm$c>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "NONE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #24  <Method void lm$c(String, int)>
	//    5   10:putstatic       #26  <Field lm$c c>
		b = new lm$c("EMPTY", 1);
	//    6   13:new             #2   <Class lm$c>
	//    7   16:dup             
	//    8   17:ldc1            #28  <String "EMPTY">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #24  <Method void lm$c(String, int)>
	//   11   23:putstatic       #30  <Field lm$c b>
		e = new lm$c("DEFAULT", 2);
	//   12   26:new             #2   <Class lm$c>
	//   13   29:dup             
	//   14   30:ldc1            #32  <String "DEFAULT">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #24  <Method void lm$c(String, int)>
	//   17   36:putstatic       #34  <Field lm$c e>
		d = new lm$c("SQUARE", 3);
	//   18   39:new             #2   <Class lm$c>
	//   19   42:dup             
	//   20   43:ldc1            #36  <String "SQUARE">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #24  <Method void lm$c(String, int)>
	//   23   49:putstatic       #38  <Field lm$c d>
		a = new lm$c("CIRCLE", 4);
	//   24   52:new             #2   <Class lm$c>
	//   25   55:dup             
	//   26   56:ldc1            #40  <String "CIRCLE">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #24  <Method void lm$c(String, int)>
	//   29   62:putstatic       #42  <Field lm$c a>
		h = new lm$c("LINE", 5);
	//   30   65:new             #2   <Class lm$c>
	//   31   68:dup             
	//   32   69:ldc1            #44  <String "LINE">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #24  <Method void lm$c(String, int)>
	//   35   75:putstatic       #46  <Field lm$c h>
		k = (new lm$c[] {
			c, b, e, d, a, h
		});
	//   36   78:bipush          6
	//   37   80:anewarray       lm$c[]
	//   38   83:dup             
	//   39   84:iconst_0        
	//   40   85:getstatic       #26  <Field lm$c c>
	//   41   88:aastore         
	//   42   89:dup             
	//   43   90:iconst_1        
	//   44   91:getstatic       #30  <Field lm$c b>
	//   45   94:aastore         
	//   46   95:dup             
	//   47   96:iconst_2        
	//   48   97:getstatic       #34  <Field lm$c e>
	//   49  100:aastore         
	//   50  101:dup             
	//   51  102:iconst_3        
	//   52  103:getstatic       #38  <Field lm$c d>
	//   53  106:aastore         
	//   54  107:dup             
	//   55  108:iconst_4        
	//   56  109:getstatic       #42  <Field lm$c a>
	//   57  112:aastore         
	//   58  113:dup             
	//   59  114:iconst_5        
	//   60  115:getstatic       #46  <Field lm$c h>
	//   61  118:aastore         
	//   62  119:putstatic       #48  <Field lm$c[] k>
	//*  63  122:return          
	}

	private lm$c(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #50  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
