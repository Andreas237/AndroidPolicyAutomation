// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			lq

public static final class lq$e extends Enum
{

	public static lq$e valueOf(String s)
	{
		return (lq$e)Enum.valueOf(o/lq$e, s);
	//    0    0:ldc1            #2   <Class lq$e>
	//    1    2:aload_0         
	//    2    3:invokestatic    #46  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class lq$e>
	//    4    9:areturn         
	}

	public static lq$e[] values()
	{
		return (lq$e[])((lq$e []) (d)).clone();
	//    0    0:getstatic       #38  <Field lq$e[] d>
	//    1    3:invokevirtual   #53  <Method Object _5B_Lo.lq$e_3B_.clone()>
	//    2    6:checkcast       #49  <Class lq$e[]>
	//    3    9:areturn         
	}

	public static final lq$e a;
	public static final lq$e b;
	public static final lq$e c;
	private static final lq$e d[];
	public static final lq$e e;

	static 
	{
		c = new lq$e("LEFT_TOP", 0);
	//    0    0:new             #2   <Class lq$e>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "LEFT_TOP">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void lq$e(String, int)>
	//    5   10:putstatic       #24  <Field lq$e c>
		e = new lq$e("LEFT_BOTTOM", 1);
	//    6   13:new             #2   <Class lq$e>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "LEFT_BOTTOM">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void lq$e(String, int)>
	//   11   23:putstatic       #28  <Field lq$e e>
		b = new lq$e("RIGHT_TOP", 2);
	//   12   26:new             #2   <Class lq$e>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "RIGHT_TOP">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void lq$e(String, int)>
	//   17   36:putstatic       #32  <Field lq$e b>
		a = new lq$e("RIGHT_BOTTOM", 3);
	//   18   39:new             #2   <Class lq$e>
	//   19   42:dup             
	//   20   43:ldc1            #34  <String "RIGHT_BOTTOM">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void lq$e(String, int)>
	//   23   49:putstatic       #36  <Field lq$e a>
		d = (new lq$e[] {
			c, e, b, a
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       lq$e[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field lq$e c>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #28  <Field lq$e e>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #32  <Field lq$e b>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #36  <Field lq$e a>
	//   41   79:aastore         
	//   42   80:putstatic       #38  <Field lq$e[] d>
	//*  43   83:return          
	}

	private lq$e(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #40  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
