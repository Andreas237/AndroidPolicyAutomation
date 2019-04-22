// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.enums.inappmessage;


public final class Orientation extends Enum
{

	private Orientation(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #30  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static Orientation valueOf(String s)
	{
		return (Orientation)Enum.valueOf(com/appboy/enums/inappmessage/Orientation, s);
	//    0    0:ldc1            #2   <Class Orientation>
	//    1    2:aload_0         
	//    2    3:invokestatic    #36  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Orientation>
	//    4    9:areturn         
	}

	public static Orientation[] values()
	{
		return (Orientation[])((Orientation []) (a)).clone();
	//    0    0:getstatic       #28  <Field Orientation[] a>
	//    1    3:invokevirtual   #43  <Method Object _5B_Lcom.appboy.enums.inappmessage.Orientation_3B_.clone()>
	//    2    6:checkcast       #39  <Class Orientation[]>
	//    3    9:areturn         
	}

	public static final Orientation ANY;
	public static final Orientation LANDSCAPE;
	public static final Orientation PORTRAIT;
	private static final Orientation a[];

	static 
	{
		PORTRAIT = new Orientation("PORTRAIT", 0);
	//    0    0:new             #2   <Class Orientation>
	//    1    3:dup             
	//    2    4:ldc1            #14  <String "PORTRAIT">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #18  <Method void Orientation(String, int)>
	//    5   10:putstatic       #20  <Field Orientation PORTRAIT>
		LANDSCAPE = new Orientation("LANDSCAPE", 1);
	//    6   13:new             #2   <Class Orientation>
	//    7   16:dup             
	//    8   17:ldc1            #21  <String "LANDSCAPE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #18  <Method void Orientation(String, int)>
	//   11   23:putstatic       #23  <Field Orientation LANDSCAPE>
		ANY = new Orientation("ANY", 2);
	//   12   26:new             #2   <Class Orientation>
	//   13   29:dup             
	//   14   30:ldc1            #24  <String "ANY">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #18  <Method void Orientation(String, int)>
	//   17   36:putstatic       #26  <Field Orientation ANY>
		a = (new Orientation[] {
			PORTRAIT, LANDSCAPE, ANY
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       Orientation[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #20  <Field Orientation PORTRAIT>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #23  <Field Orientation LANDSCAPE>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #26  <Field Orientation ANY>
	//   31   60:aastore         
	//   32   61:putstatic       #28  <Field Orientation[] a>
	//*  33   64:return          
	}
}
