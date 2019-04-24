// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.gifdecoder;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.bumptech.glide.gifdecoder:
//			GifFrame

public class GifHeader
{

	public GifHeader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		gct = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #34  <Field int[] gct>
		status = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #36  <Field int status>
		frameCount = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #38  <Field int frameCount>
		frames = ((List) (new ArrayList()));
	//   11   19:aload_0         
	//   12   20:new             #40  <Class ArrayList>
	//   13   23:dup             
	//   14   24:invokespecial   #41  <Method void ArrayList()>
	//   15   27:putfield        #43  <Field List frames>
		loopCount = -1;
	//   16   30:aload_0         
	//   17   31:iconst_m1       
	//   18   32:putfield        #45  <Field int loopCount>
	//   19   35:return          
	}

	public int getHeight()
	{
		return height;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int height>
	//    2    4:ireturn         
	}

	public int getNumFrames()
	{
		return frameCount;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int frameCount>
	//    2    4:ireturn         
	}

	public int getStatus()
	{
		return status;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int status>
	//    2    4:ireturn         
	}

	public int getWidth()
	{
		return width;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int width>
	//    2    4:ireturn         
	}

	public static final int NETSCAPE_LOOP_COUNT_DOES_NOT_EXIST = -1;
	public static final int NETSCAPE_LOOP_COUNT_FOREVER = 0;
	int bgColor;
	int bgIndex;
	GifFrame currentFrame;
	int frameCount;
	List frames;
	int gct[];
	boolean gctFlag;
	int gctSize;
	int height;
	int loopCount;
	int pixelAspect;
	int status;
	int width;
}
