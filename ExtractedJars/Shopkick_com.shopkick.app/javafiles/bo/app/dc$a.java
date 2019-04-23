// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;


// Referenced classes of package bo.app:
//			dc

static final class dc$a extends Enum
{

	public static dc$a valueOf(String s)
	{
		return (dc$a)Enum.valueOf(bo/app/dc$a, s);
	//    0    0:ldc1            #2   <Class dc$a>
	//    1    2:aload_0         
	//    2    3:invokestatic    #55  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class dc$a>
	//    4    9:areturn         
	}

	public static dc$a[] values()
	{
		return (dc$a[])((dc$a []) (e)).clone();
	//    0    0:getstatic       #40  <Field dc$a[] e>
	//    1    3:invokevirtual   #62  <Method Object _5B_Lbo.app.dc$a_3B_.clone()>
	//    2    6:checkcast       #58  <Class dc$a[]>
	//    3    9:areturn         
	}

	public String a()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String c>
	//    2    4:areturn         
	}

	public String b()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String d>
	//    2    4:areturn         
	}

	public static final dc$a a;
	public static final dc$a b;
	private static final dc$a e[];
	private final String c;
	private final String d;

	static 
	{
		a = new dc$a("READ_CARDS", 0, "read_cards_set", "read_cards_flat");
	//    0    0:new             #2   <Class dc$a>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "READ_CARDS">
	//    3    6:iconst_0        
	//    4    7:ldc1            #22  <String "read_cards_set">
	//    5    9:ldc1            #24  <String "read_cards_flat">
	//    6   11:invokespecial   #28  <Method void dc$a(String, int, String, String)>
	//    7   14:putstatic       #30  <Field dc$a a>
		b = new dc$a("VIEWED_CARDS", 1, "viewed_cards_set", "viewed_cards_flat");
	//    8   17:new             #2   <Class dc$a>
	//    9   20:dup             
	//   10   21:ldc1            #32  <String "VIEWED_CARDS">
	//   11   23:iconst_1        
	//   12   24:ldc1            #34  <String "viewed_cards_set">
	//   13   26:ldc1            #36  <String "viewed_cards_flat">
	//   14   28:invokespecial   #28  <Method void dc$a(String, int, String, String)>
	//   15   31:putstatic       #38  <Field dc$a b>
		e = (new dc$a[] {
			a, b
		});
	//   16   34:iconst_2        
	//   17   35:anewarray       dc$a[]
	//   18   38:dup             
	//   19   39:iconst_0        
	//   20   40:getstatic       #30  <Field dc$a a>
	//   21   43:aastore         
	//   22   44:dup             
	//   23   45:iconst_1        
	//   24   46:getstatic       #38  <Field dc$a b>
	//   25   49:aastore         
	//   26   50:putstatic       #40  <Field dc$a[] e>
	//*  27   53:return          
	}

	private dc$a(String s, int i, String s1, String s2)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #44  <Method void Enum(String, int)>
		c = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #46  <Field String c>
		d = s2;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #48  <Field String d>
	//   10   17:return          
	}
}
