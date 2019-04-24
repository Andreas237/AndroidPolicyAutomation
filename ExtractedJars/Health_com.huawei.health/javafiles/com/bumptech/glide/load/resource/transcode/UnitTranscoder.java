// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.transcode;

import com.bumptech.glide.load.engine.Resource;

// Referenced classes of package com.bumptech.glide.load.resource.transcode:
//			ResourceTranscoder

public class UnitTranscoder
	implements ResourceTranscoder
{

	public UnitTranscoder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	public static ResourceTranscoder get()
	{
		return ((ResourceTranscoder) (UNIT_TRANSCODER));
	//    0    0:getstatic       #17  <Field UnitTranscoder UNIT_TRANSCODER>
	//    1    3:areturn         
	}

	public Resource transcode(Resource resource)
	{
		return resource;
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	private static final UnitTranscoder UNIT_TRANSCODER = new UnitTranscoder();

	static 
	{
	//    0    0:new             #2   <Class UnitTranscoder>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void UnitTranscoder()>
	//    3    7:putstatic       #17  <Field UnitTranscoder UNIT_TRANSCODER>
	//*   4   10:return          
	}
}
