// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


public final class ConfCamera
{

	public ConfCamera()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void Object()>
	//    2    4:return          
	}

	public static final int HD_HEIGHT = 720;
	public static final int HD_WIDTH = 1280;
	static final double MIN_ASPECT_DIFF = 0.05000000074505806D;
	public static final int QVGA_HEIGHT = 240;
	public static final int QVGA_MIN_EDGE = 240;
	public static final int QVGA_WIDTH = 320;
	public static int REQUESTED_FRAME_HEIGHT = 0;
	public static int REQUESTED_FRAME_WIDTH = 0;
	public static final int VGA_HEIGHT = 480;
	public static final int VGA_WIDTH = 640;
	static final String autoFocusModes[] = {
		"continuous-picture", "auto", "continuous-video", "edof", "fixed"
	};
	static final int focusPeriodMs = 3000;
	static final int jpegQuality = 75;
	static final int previewImageFormat = 17;
	static boolean removeExifData = true;
	public static boolean setRecordingHint = true;

	static 
	{
	//    0    0:iconst_5        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #45  <String "continuous-picture">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #47  <String "auto">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #49  <String "continuous-video">
	//   13   18:aastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #51  <String "edof">
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_4        
	//   20   26:ldc1            #53  <String "fixed">
	//   21   28:aastore         
	//   22   29:putstatic       #55  <Field String[] autoFocusModes>
	//   23   32:iconst_1        
	//   24   33:putstatic       #57  <Field boolean removeExifData>
		REQUESTED_FRAME_WIDTH = -1;
	//   25   36:iconst_m1       
	//   26   37:putstatic       #59  <Field int REQUESTED_FRAME_WIDTH>
		REQUESTED_FRAME_HEIGHT = -1;
	//   27   40:iconst_m1       
	//   28   41:putstatic       #61  <Field int REQUESTED_FRAME_HEIGHT>
	//   29   44:iconst_1        
	//   30   45:putstatic       #63  <Field boolean setRecordingHint>
	//*  31   48:return          
	}
}
