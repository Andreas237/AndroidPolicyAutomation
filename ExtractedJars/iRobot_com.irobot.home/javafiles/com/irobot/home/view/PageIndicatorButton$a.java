// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;


// Referenced classes of package com.irobot.home.view:
//			PageIndicatorButton

public static final class PageIndicatorButton$a extends Enum
{

	public static PageIndicatorButton$a valueOf(String s)
	{
		return (PageIndicatorButton$a)Enum.valueOf(com/irobot/home/view/PageIndicatorButton$a, s);
	//    0    0:ldc1            #2   <Class PageIndicatorButton$a>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class PageIndicatorButton$a>
	//    4    9:areturn         
	}

	public static PageIndicatorButton$a[] values()
	{
		return (PageIndicatorButton$a[])((PageIndicatorButton$a []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field PageIndicatorButton$a[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.irobot.home.view.PageIndicatorButton$a_3B_.clone()>
	//    2    6:checkcast       #42  <Class PageIndicatorButton$a[]>
	//    3    9:areturn         
	}

	private static final PageIndicatorButton$a $VALUES[];
	public static final PageIndicatorButton$a Blue;
	public static final PageIndicatorButton$a Green;
	public static final PageIndicatorButton$a Grey;

	static 
	{
		Blue = new PageIndicatorButton$a("Blue", 0);
	//    0    0:new             #2   <Class PageIndicatorButton$a>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "Blue">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void PageIndicatorButton$a(String, int)>
	//    5   10:putstatic       #23  <Field PageIndicatorButton$a Blue>
		Green = new PageIndicatorButton$a("Green", 1);
	//    6   13:new             #2   <Class PageIndicatorButton$a>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "Green">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void PageIndicatorButton$a(String, int)>
	//   11   23:putstatic       #26  <Field PageIndicatorButton$a Green>
		Grey = new PageIndicatorButton$a("Grey", 2);
	//   12   26:new             #2   <Class PageIndicatorButton$a>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "Grey">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void PageIndicatorButton$a(String, int)>
	//   17   36:putstatic       #29  <Field PageIndicatorButton$a Grey>
		$VALUES = (new PageIndicatorButton$a[] {
			Blue, Green, Grey
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       PageIndicatorButton$a[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field PageIndicatorButton$a Blue>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field PageIndicatorButton$a Green>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field PageIndicatorButton$a Grey>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field PageIndicatorButton$a[] $VALUES>
	//*  33   64:return          
	}

	private PageIndicatorButton$a(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
