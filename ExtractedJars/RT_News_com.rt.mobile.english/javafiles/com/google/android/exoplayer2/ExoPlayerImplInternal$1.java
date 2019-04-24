// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import android.util.Log;

// Referenced classes of package com.google.android.exoplayer2:
//			ExoPlayerImplInternal, ExoPlaybackException, PlayerMessage

class ExoPlayerImplInternal$1
	implements Runnable
{

	public void run()
	{
		try
		{
			ExoPlayerImplInternal.access$400(ExoPlayerImplInternal.this, val$message);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ExoPlayerImplInternal this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field PlayerMessage val$message>
	//    4    8:invokestatic    #31  <Method void ExoPlayerImplInternal.access$400(ExoPlayerImplInternal, PlayerMessage)>
			return;
	//    5   11:return          
		}
		catch(ExoPlaybackException exoplaybackexception)
	//*   6   12:astore_1        
		{
			Log.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", ((Throwable) (exoplaybackexception)));
	//    7   13:ldc1            #33  <String "ExoPlayerImplInternal">
	//    8   15:ldc1            #35  <String "Unexpected error delivering message on external thread.">
	//    9   17:aload_1         
	//   10   18:invokestatic    #41  <Method int Log.e(String, String, Throwable)>
	//   11   21:pop             
			throw new RuntimeException(((Throwable) (exoplaybackexception)));
	//   12   22:new             #43  <Class RuntimeException>
	//   13   25:dup             
	//   14   26:aload_1         
	//   15   27:invokespecial   #46  <Method void RuntimeException(Throwable)>
	//   16   30:athrow          
		}
	}

	final ExoPlayerImplInternal this$0;
	final PlayerMessage val$message;

	ExoPlayerImplInternal$1()
	{
		this$0 = final_exoplayerimplinternal;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ExoPlayerImplInternal this$0>
		val$message = PlayerMessage.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field PlayerMessage val$message>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
