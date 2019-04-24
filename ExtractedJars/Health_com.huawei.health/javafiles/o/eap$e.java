// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			eap

public static final class eap$e extends Enum
{

	public static eap$e valueOf(String s)
	{
		return (eap$e)Enum.valueOf(o/eap$e, s);
	//    0    0:ldc1            #2   <Class eap$e>
	//    1    2:aload_0         
	//    2    3:invokestatic    #46  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class eap$e>
	//    4    9:areturn         
	}

	public static eap$e[] values()
	{
		return (eap$e[])((eap$e []) (b)).clone();
	//    0    0:getstatic       #38  <Field eap$e[] b>
	//    1    3:invokevirtual   #53  <Method Object _5B_Lo.eap$e_3B_.clone()>
	//    2    6:checkcast       #49  <Class eap$e[]>
	//    3    9:areturn         
	}

	public static final eap$e a;
	private static final eap$e b[];
	public static final eap$e c;
	public static final eap$e d;
	public static final eap$e e;

	static 
	{
		d = new eap$e("COMMON_INDEX_TYPE", 0);
	//    0    0:new             #2   <Class eap$e>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "COMMON_INDEX_TYPE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void eap$e(String, int)>
	//    5   10:putstatic       #24  <Field eap$e d>
		a = new eap$e("LANGUAGE_INDEX_TYPE", 1);
	//    6   13:new             #2   <Class eap$e>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "LANGUAGE_INDEX_TYPE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void eap$e(String, int)>
	//   11   23:putstatic       #28  <Field eap$e a>
		e = new eap$e("COMMON_RESOURCES_INDEX_TYPE", 2);
	//   12   26:new             #2   <Class eap$e>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "COMMON_RESOURCES_INDEX_TYPE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void eap$e(String, int)>
	//   17   36:putstatic       #32  <Field eap$e e>
		c = new eap$e("RESOURCES_INDEX_TYPE", 3);
	//   18   39:new             #2   <Class eap$e>
	//   19   42:dup             
	//   20   43:ldc1            #34  <String "RESOURCES_INDEX_TYPE">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void eap$e(String, int)>
	//   23   49:putstatic       #36  <Field eap$e c>
		b = (new eap$e[] {
			d, a, e, c
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       eap$e[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field eap$e d>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #28  <Field eap$e a>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #32  <Field eap$e e>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #36  <Field eap$e c>
	//   41   79:aastore         
	//   42   80:putstatic       #38  <Field eap$e[] b>
	//*  43   83:return          
	}

	private eap$e(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #40  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
