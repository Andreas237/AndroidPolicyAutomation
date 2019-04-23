// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;

// Referenced classes of package com.google.android.gms.internal.ads:
//			boe, bof

final class boh
	implements android.media.MediaCodec.OnFrameRenderedListener
{

	private boh(boe boe1, MediaCodec mediacodec)
	{
		a = boe1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field boe a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
		mediacodec.setOnFrameRenderedListener(((android.media.MediaCodec.OnFrameRenderedListener) (this)), new Handler());
	//    5    9:aload_2         
	//    6   10:aload_0         
	//    7   11:new             #20  <Class Handler>
	//    8   14:dup             
	//    9   15:invokespecial   #21  <Method void Handler()>
	//   10   18:invokevirtual   #27  <Method void MediaCodec.setOnFrameRenderedListener(android.media.MediaCodec$OnFrameRenderedListener, Handler)>
	//   11   21:return          
	}

	boh(boe boe1, MediaCodec mediacodec, bof bof)
	{
		this(boe1, mediacodec);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #31  <Method void boh(boe, MediaCodec)>
	//    4    6:return          
	}

	public final void onFrameRendered(MediaCodec mediacodec, long l, long l1)
	{
		if(this != a.b)
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:getfield        #15  <Field boe a>
	//*   3    5:getfield        #39  <Field boh boe.b>
	//*   4    8:if_acmpeq       12
		{
			return;
	//    5   11:return          
		} else
		{
			a.v();
	//    6   12:aload_0         
	//    7   13:getfield        #15  <Field boe a>
	//    8   16:invokevirtual   #42  <Method void boe.v()>
			return;
	//    9   19:return          
		}
	}

	private final boe a;
}
