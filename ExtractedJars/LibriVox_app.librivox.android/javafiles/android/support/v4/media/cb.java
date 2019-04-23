// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;

// Referenced classes of package android.support.v4.media:
//			by, cd, cc

class cb extends by
{

	cb(Context context, cd cd1)
	{
		super(context, ((bz) (cd1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #9   <Method void by(Context, bz)>
	//    4    6:return          
	}

	public void onLoadChildren(String s, android.service.media.MediaBrowserService.Result result, Bundle bundle)
	{
		MediaSessionCompat.a(bundle);
	//    0    0:aload_3         
	//    1    1:invokestatic    #18  <Method void MediaSessionCompat.a(Bundle)>
		((cd)a).a(s, new cc(result), bundle);
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field bw a>
	//    4    8:checkcast       #23  <Class cd>
	//    5   11:aload_1         
	//    6   12:new             #25  <Class cc>
	//    7   15:dup             
	//    8   16:aload_2         
	//    9   17:invokespecial   #28  <Method void cc(android.service.media.MediaBrowserService$Result)>
	//   10   20:aload_3         
	//   11   21:invokeinterface #31  <Method void cd.a(String, cc, Bundle)>
	//   12   26:return          
	}
}
