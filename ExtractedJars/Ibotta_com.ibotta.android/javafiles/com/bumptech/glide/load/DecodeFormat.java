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
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static DecodeFormat valueOf(String s)
	{
		return (DecodeFormat)Enum.valueOf(com/bumptech/glide/load/DecodeFormat, s);
	//    0    0:ldc1            #2   <Class DecodeFormat>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class DecodeFormat>
	//    4    9:areturn         
	}

	public static DecodeFormat[] values()
	{
		return (DecodeFormat[])((DecodeFormat []) ($VALUES)).clone();
	//    0    0:getstatic       #25  <Field DecodeFormat[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.bumptech.glide.load.DecodeFormat_3B_.clone()>
	//    2    6:checkcast       #38  <Class DecodeFormat[]>
	//    3    9:areturn         
	}

	private static final DecodeFormat $VALUES[];
	public static final DecodeFormat DEFAULT;
	public static final DecodeFormat PREFER_ARGB_8888;
	public static final DecodeFormat PREFER_RGB_565;

	static 
	{
		PREFER_ARGB_8888 = new DecodeFormat("PREFER_ARGB_8888", 0);
	//    0    0:new             #2   <Class DecodeFormat>
	//    1    3:dup             
	//    2    4:ldc1            #14  <String "PREFER_ARGB_8888">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #18  <Method void DecodeFormat(String, int)>
	//    5   10:putstatic       #20  <Field DecodeFormat PREFER_ARGB_8888>
		PREFER_RGB_565 = new DecodeFormat("PREFER_RGB_565", 1);
	//    6   13:new             #2   <Class DecodeFormat>
	//    7   16:dup             
	//    8   17:ldc1            #21  <String "PREFER_RGB_565">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #18  <Method void DecodeFormat(String, int)>
	//   11   23:putstatic       #23  <Field DecodeFormat PREFER_RGB_565>
		DecodeFormat decodeformat = PREFER_ARGB_8888;
	//   12   26:getstatic       #20  <Field DecodeFormat PREFER_ARGB_8888>
	//   13   29:astore_0        
		$VALUES = (new DecodeFormat[] {
			decodeformat, PREFER_RGB_565
		});
	//   14   30:iconst_2        
	//   15   31:anewarray       DecodeFormat[]
	//   16   34:dup             
	//   17   35:iconst_0        
	//   18   36:aload_0         
	//   19   37:aastore         
	//   20   38:dup             
	//   21   39:iconst_1        
	//   22   40:getstatic       #23  <Field DecodeFormat PREFER_RGB_565>
	//   23   43:aastore         
	//   24   44:putstatic       #25  <Field DecodeFormat[] $VALUES>
		DEFAULT = decodeformat;
	//   25   47:aload_0         
	//   26   48:putstatic       #27  <Field DecodeFormat DEFAULT>
	//*  27   51:return          
	}
}
