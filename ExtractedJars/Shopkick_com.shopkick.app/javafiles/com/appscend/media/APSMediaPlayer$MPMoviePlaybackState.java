// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media;


// Referenced classes of package com.appscend.media:
//			APSMediaPlayer

public static final class APSMediaPlayer$MPMoviePlaybackState extends Enum
{

	public static APSMediaPlayer$MPMoviePlaybackState valueOf(String s)
	{
		return (APSMediaPlayer$MPMoviePlaybackState)Enum.valueOf(com/appscend/media/APSMediaPlayer$MPMoviePlaybackState, s);
	//    0    0:ldc1            #2   <Class APSMediaPlayer$MPMoviePlaybackState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class APSMediaPlayer$MPMoviePlaybackState>
	//    4    9:areturn         
	}

	public static APSMediaPlayer$MPMoviePlaybackState[] values()
	{
		return (APSMediaPlayer$MPMoviePlaybackState[])((APSMediaPlayer$MPMoviePlaybackState []) ($VALUES)).clone();
	//    0    0:getstatic       #39  <Field APSMediaPlayer$MPMoviePlaybackState[] $VALUES>
	//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.appscend.media.APSMediaPlayer$MPMoviePlaybackState_3B_.clone()>
	//    2    6:checkcast       #50  <Class APSMediaPlayer$MPMoviePlaybackState[]>
	//    3    9:areturn         
	}

	private static final APSMediaPlayer$MPMoviePlaybackState $VALUES[];
	public static final APSMediaPlayer$MPMoviePlaybackState MPMoviePlaybackPaused;
	public static final APSMediaPlayer$MPMoviePlaybackState MPMoviePlaybackPlaying;
	public static final APSMediaPlayer$MPMoviePlaybackState MPMoviePlaybackSeekingBackward;
	public static final APSMediaPlayer$MPMoviePlaybackState MPMoviePlaybackSeekingForward;
	public static final APSMediaPlayer$MPMoviePlaybackState MPMoviePlaybackStopped;

	static 
	{
		MPMoviePlaybackPaused = new APSMediaPlayer$MPMoviePlaybackState("MPMoviePlaybackPaused", 0);
	//    0    0:new             #2   <Class APSMediaPlayer$MPMoviePlaybackState>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "MPMoviePlaybackPaused">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void APSMediaPlayer$MPMoviePlaybackState(String, int)>
	//    5   10:putstatic       #25  <Field APSMediaPlayer$MPMoviePlaybackState MPMoviePlaybackPaused>
		MPMoviePlaybackPlaying = new APSMediaPlayer$MPMoviePlaybackState("MPMoviePlaybackPlaying", 1);
	//    6   13:new             #2   <Class APSMediaPlayer$MPMoviePlaybackState>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "MPMoviePlaybackPlaying">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void APSMediaPlayer$MPMoviePlaybackState(String, int)>
	//   11   23:putstatic       #28  <Field APSMediaPlayer$MPMoviePlaybackState MPMoviePlaybackPlaying>
		MPMoviePlaybackStopped = new APSMediaPlayer$MPMoviePlaybackState("MPMoviePlaybackStopped", 2);
	//   12   26:new             #2   <Class APSMediaPlayer$MPMoviePlaybackState>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "MPMoviePlaybackStopped">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void APSMediaPlayer$MPMoviePlaybackState(String, int)>
	//   17   36:putstatic       #31  <Field APSMediaPlayer$MPMoviePlaybackState MPMoviePlaybackStopped>
		MPMoviePlaybackSeekingBackward = new APSMediaPlayer$MPMoviePlaybackState("MPMoviePlaybackSeekingBackward", 3);
	//   18   39:new             #2   <Class APSMediaPlayer$MPMoviePlaybackState>
	//   19   42:dup             
	//   20   43:ldc1            #32  <String "MPMoviePlaybackSeekingBackward">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void APSMediaPlayer$MPMoviePlaybackState(String, int)>
	//   23   49:putstatic       #34  <Field APSMediaPlayer$MPMoviePlaybackState MPMoviePlaybackSeekingBackward>
		MPMoviePlaybackSeekingForward = new APSMediaPlayer$MPMoviePlaybackState("MPMoviePlaybackSeekingForward", 4);
	//   24   52:new             #2   <Class APSMediaPlayer$MPMoviePlaybackState>
	//   25   55:dup             
	//   26   56:ldc1            #35  <String "MPMoviePlaybackSeekingForward">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void APSMediaPlayer$MPMoviePlaybackState(String, int)>
	//   29   62:putstatic       #37  <Field APSMediaPlayer$MPMoviePlaybackState MPMoviePlaybackSeekingForward>
		$VALUES = (new APSMediaPlayer$MPMoviePlaybackState[] {
			MPMoviePlaybackPaused, MPMoviePlaybackPlaying, MPMoviePlaybackStopped, MPMoviePlaybackSeekingBackward, MPMoviePlaybackSeekingForward
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       APSMediaPlayer$MPMoviePlaybackState[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #25  <Field APSMediaPlayer$MPMoviePlaybackState MPMoviePlaybackPaused>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #28  <Field APSMediaPlayer$MPMoviePlaybackState MPMoviePlaybackPlaying>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #31  <Field APSMediaPlayer$MPMoviePlaybackState MPMoviePlaybackStopped>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #34  <Field APSMediaPlayer$MPMoviePlaybackState MPMoviePlaybackSeekingBackward>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #37  <Field APSMediaPlayer$MPMoviePlaybackState MPMoviePlaybackSeekingForward>
	//   51   98:aastore         
	//   52   99:putstatic       #39  <Field APSMediaPlayer$MPMoviePlaybackState[] $VALUES>
	//*  53  102:return          
	}

	private APSMediaPlayer$MPMoviePlaybackState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
