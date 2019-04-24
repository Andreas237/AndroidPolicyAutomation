// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video;


// Referenced classes of package com.startapp.android.publish.ads.video:
//			VideoAdDetails

public static final class VideoAdDetails$PostRollType extends Enum
{

	public static VideoAdDetails$PostRollType valueOf(String s)
	{
		return (VideoAdDetails$PostRollType)Enum.valueOf(com/startapp/android/publish/ads/video/VideoAdDetails$PostRollType, s);
	//    0    0:ldc1            #2   <Class VideoAdDetails$PostRollType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class VideoAdDetails$PostRollType>
	//    4    9:areturn         
	}

	public static VideoAdDetails$PostRollType[] values()
	{
		return (VideoAdDetails$PostRollType[])((VideoAdDetails$PostRollType []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field VideoAdDetails$PostRollType[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.startapp.android.publish.ads.video.VideoAdDetails$PostRollType_3B_.clone()>
	//    2    6:checkcast       #42  <Class VideoAdDetails$PostRollType[]>
	//    3    9:areturn         
	}

	private static final VideoAdDetails$PostRollType $VALUES[];
	public static final VideoAdDetails$PostRollType IMAGE;
	public static final VideoAdDetails$PostRollType LAST_FRAME;
	public static final VideoAdDetails$PostRollType NONE;

	static 
	{
		IMAGE = new VideoAdDetails$PostRollType("IMAGE", 0);
	//    0    0:new             #2   <Class VideoAdDetails$PostRollType>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "IMAGE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void VideoAdDetails$PostRollType(String, int)>
	//    5   10:putstatic       #23  <Field VideoAdDetails$PostRollType IMAGE>
		LAST_FRAME = new VideoAdDetails$PostRollType("LAST_FRAME", 1);
	//    6   13:new             #2   <Class VideoAdDetails$PostRollType>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "LAST_FRAME">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void VideoAdDetails$PostRollType(String, int)>
	//   11   23:putstatic       #26  <Field VideoAdDetails$PostRollType LAST_FRAME>
		NONE = new VideoAdDetails$PostRollType("NONE", 2);
	//   12   26:new             #2   <Class VideoAdDetails$PostRollType>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "NONE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void VideoAdDetails$PostRollType(String, int)>
	//   17   36:putstatic       #29  <Field VideoAdDetails$PostRollType NONE>
		$VALUES = (new VideoAdDetails$PostRollType[] {
			IMAGE, LAST_FRAME, NONE
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       VideoAdDetails$PostRollType[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field VideoAdDetails$PostRollType IMAGE>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field VideoAdDetails$PostRollType LAST_FRAME>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field VideoAdDetails$PostRollType NONE>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field VideoAdDetails$PostRollType[] $VALUES>
	//*  33   64:return          
	}

	private VideoAdDetails$PostRollType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
