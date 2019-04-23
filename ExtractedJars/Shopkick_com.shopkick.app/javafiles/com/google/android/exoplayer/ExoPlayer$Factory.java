// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;


// Referenced classes of package com.google.android.exoplayer:
//			ExoPlayer, ExoPlayerImpl

public static final class ExoPlayer$Factory
{

	public static ExoPlayer newInstance(int i)
	{
		return ((ExoPlayer) (new ExoPlayerImpl(i, 2500, 5000)));
	//    0    0:new             #21  <Class ExoPlayerImpl>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:sipush          2500
	//    4    8:sipush          5000
	//    5   11:invokespecial   #24  <Method void ExoPlayerImpl(int, int, int)>
	//    6   14:areturn         
	}

	public static ExoPlayer newInstance(int i, int j, int k)
	{
		return ((ExoPlayer) (new ExoPlayerImpl(i, j, k)));
	//    0    0:new             #21  <Class ExoPlayerImpl>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #24  <Method void ExoPlayerImpl(int, int, int)>
	//    6   10:areturn         
	}

	public static final int DEFAULT_MIN_BUFFER_MS = 2500;
	public static final int DEFAULT_MIN_REBUFFER_MS = 5000;

	private ExoPlayer$Factory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
