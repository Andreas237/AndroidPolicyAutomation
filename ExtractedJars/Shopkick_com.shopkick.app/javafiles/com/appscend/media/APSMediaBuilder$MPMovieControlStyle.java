// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media;


// Referenced classes of package com.appscend.media:
//			APSMediaBuilder

public static final class APSMediaBuilder$MPMovieControlStyle extends Enum
{

	public static APSMediaBuilder$MPMovieControlStyle valueOf(String s)
	{
		return (APSMediaBuilder$MPMovieControlStyle)Enum.valueOf(com/appscend/media/APSMediaBuilder$MPMovieControlStyle, s);
	//    0    0:ldc1            #2   <Class APSMediaBuilder$MPMovieControlStyle>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class APSMediaBuilder$MPMovieControlStyle>
	//    4    9:areturn         
	}

	public static APSMediaBuilder$MPMovieControlStyle[] values()
	{
		return (APSMediaBuilder$MPMovieControlStyle[])((APSMediaBuilder$MPMovieControlStyle []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field APSMediaBuilder$MPMovieControlStyle[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.appscend.media.APSMediaBuilder$MPMovieControlStyle_3B_.clone()>
	//    2    6:checkcast       #38  <Class APSMediaBuilder$MPMovieControlStyle[]>
	//    3    9:areturn         
	}

	private static final APSMediaBuilder$MPMovieControlStyle $VALUES[];
	public static final APSMediaBuilder$MPMovieControlStyle MPMovieControlStyleFullscreen;
	public static final APSMediaBuilder$MPMovieControlStyle MPMovieControlStyleNone;

	static 
	{
		MPMovieControlStyleNone = new APSMediaBuilder$MPMovieControlStyle("MPMovieControlStyleNone", 0);
	//    0    0:new             #2   <Class APSMediaBuilder$MPMovieControlStyle>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "MPMovieControlStyleNone">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void APSMediaBuilder$MPMovieControlStyle(String, int)>
	//    5   10:putstatic       #22  <Field APSMediaBuilder$MPMovieControlStyle MPMovieControlStyleNone>
		MPMovieControlStyleFullscreen = new APSMediaBuilder$MPMovieControlStyle("MPMovieControlStyleFullscreen", 1);
	//    6   13:new             #2   <Class APSMediaBuilder$MPMovieControlStyle>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "MPMovieControlStyleFullscreen">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void APSMediaBuilder$MPMovieControlStyle(String, int)>
	//   11   23:putstatic       #25  <Field APSMediaBuilder$MPMovieControlStyle MPMovieControlStyleFullscreen>
		$VALUES = (new APSMediaBuilder$MPMovieControlStyle[] {
			MPMovieControlStyleNone, MPMovieControlStyleFullscreen
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       APSMediaBuilder$MPMovieControlStyle[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field APSMediaBuilder$MPMovieControlStyle MPMovieControlStyleNone>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field APSMediaBuilder$MPMovieControlStyle MPMovieControlStyleFullscreen>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field APSMediaBuilder$MPMovieControlStyle[] $VALUES>
	//*  23   45:return          
	}

	private APSMediaBuilder$MPMovieControlStyle(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
