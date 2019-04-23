// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.enums.inappmessage;


public final class ImageStyle extends Enum
{

	private ImageStyle(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #26  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static ImageStyle valueOf(String s)
	{
		return (ImageStyle)Enum.valueOf(com/appboy/enums/inappmessage/ImageStyle, s);
	//    0    0:ldc1            #2   <Class ImageStyle>
	//    1    2:aload_0         
	//    2    3:invokestatic    #32  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ImageStyle>
	//    4    9:areturn         
	}

	public static ImageStyle[] values()
	{
		return (ImageStyle[])((ImageStyle []) (a)).clone();
	//    0    0:getstatic       #24  <Field ImageStyle[] a>
	//    1    3:invokevirtual   #39  <Method Object _5B_Lcom.appboy.enums.inappmessage.ImageStyle_3B_.clone()>
	//    2    6:checkcast       #35  <Class ImageStyle[]>
	//    3    9:areturn         
	}

	public static final ImageStyle GRAPHIC;
	public static final ImageStyle TOP;
	private static final ImageStyle a[];

	static 
	{
		GRAPHIC = new ImageStyle("GRAPHIC", 0);
	//    0    0:new             #2   <Class ImageStyle>
	//    1    3:dup             
	//    2    4:ldc1            #13  <String "GRAPHIC">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #17  <Method void ImageStyle(String, int)>
	//    5   10:putstatic       #19  <Field ImageStyle GRAPHIC>
		TOP = new ImageStyle("TOP", 1);
	//    6   13:new             #2   <Class ImageStyle>
	//    7   16:dup             
	//    8   17:ldc1            #20  <String "TOP">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #17  <Method void ImageStyle(String, int)>
	//   11   23:putstatic       #22  <Field ImageStyle TOP>
		a = (new ImageStyle[] {
			GRAPHIC, TOP
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       ImageStyle[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #19  <Field ImageStyle GRAPHIC>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #22  <Field ImageStyle TOP>
	//   21   41:aastore         
	//   22   42:putstatic       #24  <Field ImageStyle[] a>
	//*  23   45:return          
	}
}
