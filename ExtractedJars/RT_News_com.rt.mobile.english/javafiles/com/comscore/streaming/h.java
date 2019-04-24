// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.streaming;

import android.media.MediaPlayer;

// Referenced classes of package com.comscore.streaming:
//			StreamSenseMediaPlayer

class h
	implements android.media.MediaPlayer.OnInfoListener
{

	h(StreamSenseMediaPlayer streamsensemediaplayer)
	{
		a = streamsensemediaplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field StreamSenseMediaPlayer a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public boolean onInfo(MediaPlayer mediaplayer, int i, int j)
	{
		if(i == 701 && !StreamSenseMediaPlayer.b(a) && !StreamSenseMediaPlayer.c(a))
	//*   0    0:iload_2         
	//*   1    1:sipush          701
	//*   2    4:icmpne          37
	//*   3    7:aload_0         
	//*   4    8:getfield        #12  <Field StreamSenseMediaPlayer a>
	//*   5   11:invokestatic    #24  <Method boolean StreamSenseMediaPlayer.b(StreamSenseMediaPlayer)>
	//*   6   14:ifne            37
	//*   7   17:aload_0         
	//*   8   18:getfield        #12  <Field StreamSenseMediaPlayer a>
	//*   9   21:invokestatic    #27  <Method boolean StreamSenseMediaPlayer.c(StreamSenseMediaPlayer)>
	//*  10   24:ifne            37
			StreamSenseMediaPlayer.d(a);
	//   11   27:aload_0         
	//   12   28:getfield        #12  <Field StreamSenseMediaPlayer a>
	//   13   31:invokestatic    #30  <Method void StreamSenseMediaPlayer.d(StreamSenseMediaPlayer)>
		else
	//*  14   34:goto            71
		if(i == 702 && !StreamSenseMediaPlayer.b(a) && StreamSenseMediaPlayer.c(a))
	//*  15   37:iload_2         
	//*  16   38:sipush          702
	//*  17   41:icmpne          71
	//*  18   44:aload_0         
	//*  19   45:getfield        #12  <Field StreamSenseMediaPlayer a>
	//*  20   48:invokestatic    #24  <Method boolean StreamSenseMediaPlayer.b(StreamSenseMediaPlayer)>
	//*  21   51:ifne            71
	//*  22   54:aload_0         
	//*  23   55:getfield        #12  <Field StreamSenseMediaPlayer a>
	//*  24   58:invokestatic    #27  <Method boolean StreamSenseMediaPlayer.c(StreamSenseMediaPlayer)>
	//*  25   61:ifeq            71
			StreamSenseMediaPlayer.e(a);
	//   26   64:aload_0         
	//   27   65:getfield        #12  <Field StreamSenseMediaPlayer a>
	//   28   68:invokestatic    #33  <Method void StreamSenseMediaPlayer.e(StreamSenseMediaPlayer)>
		if(StreamSenseMediaPlayer.f(a) != null)
	//*  29   71:aload_0         
	//*  30   72:getfield        #12  <Field StreamSenseMediaPlayer a>
	//*  31   75:invokestatic    #37  <Method android.media.MediaPlayer$OnInfoListener StreamSenseMediaPlayer.f(StreamSenseMediaPlayer)>
	//*  32   78:ifnull          97
			return StreamSenseMediaPlayer.f(a).onInfo(mediaplayer, i, j);
	//   33   81:aload_0         
	//   34   82:getfield        #12  <Field StreamSenseMediaPlayer a>
	//   35   85:invokestatic    #37  <Method android.media.MediaPlayer$OnInfoListener StreamSenseMediaPlayer.f(StreamSenseMediaPlayer)>
	//   36   88:aload_1         
	//   37   89:iload_2         
	//   38   90:iload_3         
	//   39   91:invokeinterface #39  <Method boolean android.media.MediaPlayer$OnInfoListener.onInfo(MediaPlayer, int, int)>
	//   40   96:ireturn         
		else
			return true;
	//   41   97:iconst_1        
	//   42   98:ireturn         
	}

	final StreamSenseMediaPlayer a;
}
