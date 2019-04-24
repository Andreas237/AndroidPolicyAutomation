// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load;


public final class DecodeFormat extends Enum
{

	private DecodeFormat(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #34  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static DecodeFormat valueOf(String s)
	{
		return (DecodeFormat)Enum.valueOf(com/bumptech/glide/load/DecodeFormat, s);
	//    0    0:ldc1            #2   <Class DecodeFormat>
	//    1    2:aload_0         
	//    2    3:invokestatic    #40  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class DecodeFormat>
	//    4    9:areturn         
	}

	public static DecodeFormat[] values()
	{
		return (DecodeFormat[])((DecodeFormat []) ($VALUES)).clone();
	//    0    0:getstatic       #30  <Field DecodeFormat[] $VALUES>
	//    1    3:invokevirtual   #47  <Method Object _5B_Lcom.bumptech.glide.load.DecodeFormat_3B_.clone()>
	//    2    6:checkcast       #43  <Class DecodeFormat[]>
	//    3    9:areturn         
	}

	private static final DecodeFormat $VALUES[];
	public static final DecodeFormat DEFAULT;
	public static final DecodeFormat PREFER_ARGB_8888;
	public static final DecodeFormat PREFER_ARGB_8888_DISALLOW_HARDWARE;
	public static final DecodeFormat PREFER_RGB_565;

	static 
	{
		PREFER_ARGB_8888 = new DecodeFormat("PREFER_ARGB_8888", 0);
	//    0    0:new             #2   <Class DecodeFormat>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "PREFER_ARGB_8888">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void DecodeFormat(String, int)>
	//    5   10:putstatic       #22  <Field DecodeFormat PREFER_ARGB_8888>
		PREFER_ARGB_8888_DISALLOW_HARDWARE = new DecodeFormat("PREFER_ARGB_8888_DISALLOW_HARDWARE", 1);
	//    6   13:new             #2   <Class DecodeFormat>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "PREFER_ARGB_8888_DISALLOW_HARDWARE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void DecodeFormat(String, int)>
	//   11   23:putstatic       #25  <Field DecodeFormat PREFER_ARGB_8888_DISALLOW_HARDWARE>
		PREFER_RGB_565 = new DecodeFormat("PREFER_RGB_565", 2);
	//   12   26:new             #2   <Class DecodeFormat>
	//   13   29:dup             
	//   14   30:ldc1            #26  <String "PREFER_RGB_565">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #20  <Method void DecodeFormat(String, int)>
	//   17   36:putstatic       #28  <Field DecodeFormat PREFER_RGB_565>
		$VALUES = (new DecodeFormat[] {
			PREFER_ARGB_8888, PREFER_ARGB_8888_DISALLOW_HARDWARE, PREFER_RGB_565
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       DecodeFormat[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #22  <Field DecodeFormat PREFER_ARGB_8888>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #25  <Field DecodeFormat PREFER_ARGB_8888_DISALLOW_HARDWARE>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #28  <Field DecodeFormat PREFER_RGB_565>
	//   31   60:aastore         
	//   32   61:putstatic       #30  <Field DecodeFormat[] $VALUES>
		DEFAULT = PREFER_ARGB_8888_DISALLOW_HARDWARE;
	//   33   64:getstatic       #25  <Field DecodeFormat PREFER_ARGB_8888_DISALLOW_HARDWARE>
	//   34   67:putstatic       #32  <Field DecodeFormat DEFAULT>
	//*  35   70:return          
	}
}
