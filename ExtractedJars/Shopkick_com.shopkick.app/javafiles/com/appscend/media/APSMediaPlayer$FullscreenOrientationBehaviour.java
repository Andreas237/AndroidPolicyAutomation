// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media;


// Referenced classes of package com.appscend.media:
//			APSMediaPlayer

public static final class APSMediaPlayer$FullscreenOrientationBehaviour extends Enum
{

	public static APSMediaPlayer$FullscreenOrientationBehaviour valueOf(String s)
	{
		return (APSMediaPlayer$FullscreenOrientationBehaviour)Enum.valueOf(com/appscend/media/APSMediaPlayer$FullscreenOrientationBehaviour, s);
	//    0    0:ldc1            #2   <Class APSMediaPlayer$FullscreenOrientationBehaviour>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class APSMediaPlayer$FullscreenOrientationBehaviour>
	//    4    9:areturn         
	}

	public static APSMediaPlayer$FullscreenOrientationBehaviour[] values()
	{
		return (APSMediaPlayer$FullscreenOrientationBehaviour[])((APSMediaPlayer$FullscreenOrientationBehaviour []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field APSMediaPlayer$FullscreenOrientationBehaviour[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.appscend.media.APSMediaPlayer$FullscreenOrientationBehaviour_3B_.clone()>
	//    2    6:checkcast       #42  <Class APSMediaPlayer$FullscreenOrientationBehaviour[]>
	//    3    9:areturn         
	}

	private static final APSMediaPlayer$FullscreenOrientationBehaviour $VALUES[];
	public static final APSMediaPlayer$FullscreenOrientationBehaviour defaultBehaviour;
	public static final APSMediaPlayer$FullscreenOrientationBehaviour sensorLandscapeOrientation;
	public static final APSMediaPlayer$FullscreenOrientationBehaviour sensorPortraitOrientation;

	static 
	{
		defaultBehaviour = new APSMediaPlayer$FullscreenOrientationBehaviour("defaultBehaviour", 0);
	//    0    0:new             #2   <Class APSMediaPlayer$FullscreenOrientationBehaviour>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "defaultBehaviour">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void APSMediaPlayer$FullscreenOrientationBehaviour(String, int)>
	//    5   10:putstatic       #23  <Field APSMediaPlayer$FullscreenOrientationBehaviour defaultBehaviour>
		sensorLandscapeOrientation = new APSMediaPlayer$FullscreenOrientationBehaviour("sensorLandscapeOrientation", 1);
	//    6   13:new             #2   <Class APSMediaPlayer$FullscreenOrientationBehaviour>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "sensorLandscapeOrientation">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void APSMediaPlayer$FullscreenOrientationBehaviour(String, int)>
	//   11   23:putstatic       #26  <Field APSMediaPlayer$FullscreenOrientationBehaviour sensorLandscapeOrientation>
		sensorPortraitOrientation = new APSMediaPlayer$FullscreenOrientationBehaviour("sensorPortraitOrientation", 2);
	//   12   26:new             #2   <Class APSMediaPlayer$FullscreenOrientationBehaviour>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "sensorPortraitOrientation">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void APSMediaPlayer$FullscreenOrientationBehaviour(String, int)>
	//   17   36:putstatic       #29  <Field APSMediaPlayer$FullscreenOrientationBehaviour sensorPortraitOrientation>
		$VALUES = (new APSMediaPlayer$FullscreenOrientationBehaviour[] {
			defaultBehaviour, sensorLandscapeOrientation, sensorPortraitOrientation
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       APSMediaPlayer$FullscreenOrientationBehaviour[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field APSMediaPlayer$FullscreenOrientationBehaviour defaultBehaviour>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field APSMediaPlayer$FullscreenOrientationBehaviour sensorLandscapeOrientation>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field APSMediaPlayer$FullscreenOrientationBehaviour sensorPortraitOrientation>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field APSMediaPlayer$FullscreenOrientationBehaviour[] $VALUES>
	//*  33   64:return          
	}

	private APSMediaPlayer$FullscreenOrientationBehaviour(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
