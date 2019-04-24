// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.richmedia;

import android.view.View;

// Referenced classes of package com.baidu.android.pushservice.richmedia:
//			MediaListActivity

class MediaListActivity$1
	implements android.view.
{

	public void onClick(View view)
	{
		a.finish();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MediaListActivity a>
	//    2    4:invokevirtual   #26  <Method void MediaListActivity.finish()>
	//    3    7:return          
	}

	final MediaListActivity a;

	MediaListActivity$1(MediaListActivity medialistactivity)
	{
		a = medialistactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MediaListActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
