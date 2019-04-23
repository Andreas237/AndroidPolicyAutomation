// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;


// Referenced classes of package com.facebook:
//			FacebookRequestError

public static final class FacebookRequestError$Category extends Enum
{

	public static FacebookRequestError$Category valueOf(String s)
	{
		return (FacebookRequestError$Category)Enum.valueOf(com/facebook/FacebookRequestError$Category, s);
	//    0    0:ldc1            #2   <Class FacebookRequestError$Category>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class FacebookRequestError$Category>
	//    4    9:areturn         
	}

	public static FacebookRequestError$Category[] values()
	{
		return (FacebookRequestError$Category[])((FacebookRequestError$Category []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field FacebookRequestError$Category[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.facebook.FacebookRequestError$Category_3B_.clone()>
	//    2    6:checkcast       #42  <Class FacebookRequestError$Category[]>
	//    3    9:areturn         
	}

	private static final FacebookRequestError$Category $VALUES[];
	public static final FacebookRequestError$Category LOGIN_RECOVERABLE;
	public static final FacebookRequestError$Category OTHER;
	public static final FacebookRequestError$Category TRANSIENT;

	static 
	{
		LOGIN_RECOVERABLE = new FacebookRequestError$Category("LOGIN_RECOVERABLE", 0);
	//    0    0:new             #2   <Class FacebookRequestError$Category>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "LOGIN_RECOVERABLE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void FacebookRequestError$Category(String, int)>
	//    5   10:putstatic       #23  <Field FacebookRequestError$Category LOGIN_RECOVERABLE>
		OTHER = new FacebookRequestError$Category("OTHER", 1);
	//    6   13:new             #2   <Class FacebookRequestError$Category>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "OTHER">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void FacebookRequestError$Category(String, int)>
	//   11   23:putstatic       #26  <Field FacebookRequestError$Category OTHER>
		TRANSIENT = new FacebookRequestError$Category("TRANSIENT", 2);
	//   12   26:new             #2   <Class FacebookRequestError$Category>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "TRANSIENT">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void FacebookRequestError$Category(String, int)>
	//   17   36:putstatic       #29  <Field FacebookRequestError$Category TRANSIENT>
		$VALUES = (new FacebookRequestError$Category[] {
			LOGIN_RECOVERABLE, OTHER, TRANSIENT
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       FacebookRequestError$Category[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field FacebookRequestError$Category LOGIN_RECOVERABLE>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field FacebookRequestError$Category OTHER>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field FacebookRequestError$Category TRANSIENT>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field FacebookRequestError$Category[] $VALUES>
	//*  33   64:return          
	}

	private FacebookRequestError$Category(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
