// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.ui;

import android.graphics.Bitmap;

// Referenced classes of package com.google.android.exoplayer2.ui:
//			PlayerNotificationManager

class PlayerNotificationManager$BitmapCallback$1
	implements Runnable
{

	public void run()
	{
		if(PlayerNotificationManager.access$000(this$0) != null && PlayerNotificationManager.BitmapCallback.access$100(PlayerNotificationManager.BitmapCallback.this) == PlayerNotificationManager.access$200(this$0) && PlayerNotificationManager.access$300(this$0))
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field PlayerNotificationManager$BitmapCallback this$1>
	//*   2    4:getfield        #33  <Field PlayerNotificationManager PlayerNotificationManager$BitmapCallback.this$0>
	//*   3    7:invokestatic    #37  <Method com.google.android.exoplayer2.Player PlayerNotificationManager.access$000(PlayerNotificationManager)>
	//*   4   10:ifnull          61
	//*   5   13:aload_0         
	//*   6   14:getfield        #22  <Field PlayerNotificationManager$BitmapCallback this$1>
	//*   7   17:invokestatic    #41  <Method int PlayerNotificationManager$BitmapCallback.access$100(PlayerNotificationManager$BitmapCallback)>
	//*   8   20:aload_0         
	//*   9   21:getfield        #22  <Field PlayerNotificationManager$BitmapCallback this$1>
	//*  10   24:getfield        #33  <Field PlayerNotificationManager PlayerNotificationManager$BitmapCallback.this$0>
	//*  11   27:invokestatic    #45  <Method int PlayerNotificationManager.access$200(PlayerNotificationManager)>
	//*  12   30:icmpne          61
	//*  13   33:aload_0         
	//*  14   34:getfield        #22  <Field PlayerNotificationManager$BitmapCallback this$1>
	//*  15   37:getfield        #33  <Field PlayerNotificationManager PlayerNotificationManager$BitmapCallback.this$0>
	//*  16   40:invokestatic    #49  <Method boolean PlayerNotificationManager.access$300(PlayerNotificationManager)>
	//*  17   43:ifeq            61
			PlayerNotificationManager.access$400(this$0, val$bitmap);
	//   18   46:aload_0         
	//   19   47:getfield        #22  <Field PlayerNotificationManager$BitmapCallback this$1>
	//   20   50:getfield        #33  <Field PlayerNotificationManager PlayerNotificationManager$BitmapCallback.this$0>
	//   21   53:aload_0         
	//   22   54:getfield        #24  <Field Bitmap val$bitmap>
	//   23   57:invokestatic    #53  <Method android.app.Notification PlayerNotificationManager.access$400(PlayerNotificationManager, Bitmap)>
	//   24   60:pop             
	//   25   61:return          
	}

	final PlayerNotificationManager.BitmapCallback this$1;
	final Bitmap val$bitmap;

	PlayerNotificationManager$BitmapCallback$1()
	{
		this$1 = final_bitmapcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field PlayerNotificationManager$BitmapCallback this$1>
		val$bitmap = Bitmap.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field Bitmap val$bitmap>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
