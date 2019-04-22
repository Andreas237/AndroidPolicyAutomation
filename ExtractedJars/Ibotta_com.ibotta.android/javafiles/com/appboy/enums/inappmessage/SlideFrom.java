// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.enums.inappmessage;


public final class SlideFrom extends Enum
{

	private SlideFrom(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #26  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static SlideFrom valueOf(String s)
	{
		return (SlideFrom)Enum.valueOf(com/appboy/enums/inappmessage/SlideFrom, s);
	//    0    0:ldc1            #2   <Class SlideFrom>
	//    1    2:aload_0         
	//    2    3:invokestatic    #32  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class SlideFrom>
	//    4    9:areturn         
	}

	public static SlideFrom[] values()
	{
		return (SlideFrom[])((SlideFrom []) (a)).clone();
	//    0    0:getstatic       #24  <Field SlideFrom[] a>
	//    1    3:invokevirtual   #39  <Method Object _5B_Lcom.appboy.enums.inappmessage.SlideFrom_3B_.clone()>
	//    2    6:checkcast       #35  <Class SlideFrom[]>
	//    3    9:areturn         
	}

	public static final SlideFrom BOTTOM;
	public static final SlideFrom TOP;
	private static final SlideFrom a[];

	static 
	{
		TOP = new SlideFrom("TOP", 0);
	//    0    0:new             #2   <Class SlideFrom>
	//    1    3:dup             
	//    2    4:ldc1            #13  <String "TOP">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #17  <Method void SlideFrom(String, int)>
	//    5   10:putstatic       #19  <Field SlideFrom TOP>
		BOTTOM = new SlideFrom("BOTTOM", 1);
	//    6   13:new             #2   <Class SlideFrom>
	//    7   16:dup             
	//    8   17:ldc1            #20  <String "BOTTOM">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #17  <Method void SlideFrom(String, int)>
	//   11   23:putstatic       #22  <Field SlideFrom BOTTOM>
		a = (new SlideFrom[] {
			TOP, BOTTOM
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       SlideFrom[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #19  <Field SlideFrom TOP>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #22  <Field SlideFrom BOTTOM>
	//   21   41:aastore         
	//   22   42:putstatic       #24  <Field SlideFrom[] a>
	//*  23   45:return          
	}
}
