// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import android.media.MediaDrm;

// Referenced classes of package com.google.android.exoplayer2.drm:
//			FrameworkMediaDrm

class FrameworkMediaDrm$1
	implements android.media.ener
{

	public void onEvent(MediaDrm mediadrm, byte abyte0[], int i, int j, byte abyte1[])
	{
		val$listener.onEvent(((ExoMediaDrm) (FrameworkMediaDrm.this)), abyte0, i, j, abyte1);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ExoMediaDrm$OnEventListener val$listener>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field FrameworkMediaDrm this$0>
	//    4    8:aload_2         
	//    5    9:iload_3         
	//    6   10:iload           4
	//    7   12:aload           5
	//    8   14:invokeinterface #34  <Method void ExoMediaDrm$OnEventListener.onEvent(ExoMediaDrm, byte[], int, int, byte[])>
	//    9   19:return          
	}

	final FrameworkMediaDrm this$0;
	final istener val$listener;

	FrameworkMediaDrm$1()
	{
		this$0 = final_frameworkmediadrm;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field FrameworkMediaDrm this$0>
		val$listener = istener.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field ExoMediaDrm$OnEventListener val$listener>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
