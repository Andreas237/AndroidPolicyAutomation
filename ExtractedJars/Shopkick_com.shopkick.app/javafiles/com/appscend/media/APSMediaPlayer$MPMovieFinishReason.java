// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media;


// Referenced classes of package com.appscend.media:
//			APSMediaPlayer

public static final class APSMediaPlayer$MPMovieFinishReason extends Enum
{

	public static APSMediaPlayer$MPMovieFinishReason valueOf(String s)
	{
		return (APSMediaPlayer$MPMovieFinishReason)Enum.valueOf(com/appscend/media/APSMediaPlayer$MPMovieFinishReason, s);
	//    0    0:ldc1            #2   <Class APSMediaPlayer$MPMovieFinishReason>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class APSMediaPlayer$MPMovieFinishReason>
	//    4    9:areturn         
	}

	public static APSMediaPlayer$MPMovieFinishReason[] values()
	{
		return (APSMediaPlayer$MPMovieFinishReason[])((APSMediaPlayer$MPMovieFinishReason []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field APSMediaPlayer$MPMovieFinishReason[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.appscend.media.APSMediaPlayer$MPMovieFinishReason_3B_.clone()>
	//    2    6:checkcast       #46  <Class APSMediaPlayer$MPMovieFinishReason[]>
	//    3    9:areturn         
	}

	private static final APSMediaPlayer$MPMovieFinishReason $VALUES[];
	public static final APSMediaPlayer$MPMovieFinishReason MPMovieFinishReasonNone;
	public static final APSMediaPlayer$MPMovieFinishReason MPMovieFinishReasonPlaybackEnded;
	public static final APSMediaPlayer$MPMovieFinishReason MPMovieFinishReasonPlaybackError;
	public static final APSMediaPlayer$MPMovieFinishReason MPMovieFinishReasonUserExited;

	static 
	{
		MPMovieFinishReasonNone = new APSMediaPlayer$MPMovieFinishReason("MPMovieFinishReasonNone", 0);
	//    0    0:new             #2   <Class APSMediaPlayer$MPMovieFinishReason>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "MPMovieFinishReasonNone">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void APSMediaPlayer$MPMovieFinishReason(String, int)>
	//    5   10:putstatic       #24  <Field APSMediaPlayer$MPMovieFinishReason MPMovieFinishReasonNone>
		MPMovieFinishReasonPlaybackEnded = new APSMediaPlayer$MPMovieFinishReason("MPMovieFinishReasonPlaybackEnded", 1);
	//    6   13:new             #2   <Class APSMediaPlayer$MPMovieFinishReason>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "MPMovieFinishReasonPlaybackEnded">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void APSMediaPlayer$MPMovieFinishReason(String, int)>
	//   11   23:putstatic       #27  <Field APSMediaPlayer$MPMovieFinishReason MPMovieFinishReasonPlaybackEnded>
		MPMovieFinishReasonUserExited = new APSMediaPlayer$MPMovieFinishReason("MPMovieFinishReasonUserExited", 2);
	//   12   26:new             #2   <Class APSMediaPlayer$MPMovieFinishReason>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "MPMovieFinishReasonUserExited">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void APSMediaPlayer$MPMovieFinishReason(String, int)>
	//   17   36:putstatic       #30  <Field APSMediaPlayer$MPMovieFinishReason MPMovieFinishReasonUserExited>
		MPMovieFinishReasonPlaybackError = new APSMediaPlayer$MPMovieFinishReason("MPMovieFinishReasonPlaybackError", 3);
	//   18   39:new             #2   <Class APSMediaPlayer$MPMovieFinishReason>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "MPMovieFinishReasonPlaybackError">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void APSMediaPlayer$MPMovieFinishReason(String, int)>
	//   23   49:putstatic       #33  <Field APSMediaPlayer$MPMovieFinishReason MPMovieFinishReasonPlaybackError>
		$VALUES = (new APSMediaPlayer$MPMovieFinishReason[] {
			MPMovieFinishReasonNone, MPMovieFinishReasonPlaybackEnded, MPMovieFinishReasonUserExited, MPMovieFinishReasonPlaybackError
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       APSMediaPlayer$MPMovieFinishReason[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field APSMediaPlayer$MPMovieFinishReason MPMovieFinishReasonNone>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field APSMediaPlayer$MPMovieFinishReason MPMovieFinishReasonPlaybackEnded>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field APSMediaPlayer$MPMovieFinishReason MPMovieFinishReasonUserExited>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field APSMediaPlayer$MPMovieFinishReason MPMovieFinishReasonPlaybackError>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field APSMediaPlayer$MPMovieFinishReason[] $VALUES>
	//*  43   83:return          
	}

	private APSMediaPlayer$MPMovieFinishReason(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
