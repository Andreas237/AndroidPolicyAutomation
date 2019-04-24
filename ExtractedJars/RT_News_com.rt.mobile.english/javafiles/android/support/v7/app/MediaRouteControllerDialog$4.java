// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.PendingIntent;
import android.support.v4.media.session.MediaControllerCompat;
import android.util.Log;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//			MediaRouteControllerDialog

class MediaRouteControllerDialog$4
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		android.app.on on;
		if(mMediaController != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field MediaRouteControllerDialog this$0>
	//*   2    4:getfield        #29  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
	//*   3    7:ifnull          68
		{
			view = ((View) (mMediaController.getSessionActivity()));
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field MediaRouteControllerDialog this$0>
	//    6   14:getfield        #29  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
	//    7   17:invokevirtual   #35  <Method PendingIntent MediaControllerCompat.getSessionActivity()>
	//    8   20:astore_1        
			if(view != null)
	//*   9   21:aload_1         
	//*  10   22:ifnull          68
			{
				StringBuilder stringbuilder;
				try
				{
					((PendingIntent) (view)).send();
	//   11   25:aload_1         
	//   12   26:invokevirtual   #40  <Method void PendingIntent.send()>
					dismiss();
	//   13   29:aload_0         
	//   14   30:getfield        #17  <Field MediaRouteControllerDialog this$0>
	//   15   33:invokevirtual   #43  <Method void MediaRouteControllerDialog.dismiss()>
					return;
	//   16   36:return          
				}
	//*  17   37:new             #45  <Class StringBuilder>
	//*  18   40:dup             
	//*  19   41:invokespecial   #46  <Method void StringBuilder()>
	//*  20   44:astore_2        
	//*  21   45:aload_2         
	//*  22   46:aload_1         
	//*  23   47:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
	//*  24   50:pop             
	//*  25   51:aload_2         
	//*  26   52:ldc1            #52  <String " was not sent, it had been canceled.">
	//*  27   54:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//*  28   57:pop             
	//*  29   58:ldc1            #57  <String "MediaRouteCtrlDialog">
	//*  30   60:aload_2         
	//*  31   61:invokevirtual   #61  <Method String StringBuilder.toString()>
	//*  32   64:invokestatic    #67  <Method int Log.e(String, String)>
	//*  33   67:pop             
	//*  34   68:return          
				// Misplaced declaration of an exception variable
				catch(android.app.on on)
				{
					stringbuilder = new StringBuilder();
				}
				stringbuilder.append(((Object) (view)));
				stringbuilder.append(" was not sent, it had been canceled.");
				Log.e("MediaRouteCtrlDialog", stringbuilder.toString());
			}
		}
	//*  35   69:astore_2        
	//*  36   70:goto            37
	}

	final MediaRouteControllerDialog this$0;

	MediaRouteControllerDialog$4()
	{
		this$0 = MediaRouteControllerDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MediaRouteControllerDialog this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
