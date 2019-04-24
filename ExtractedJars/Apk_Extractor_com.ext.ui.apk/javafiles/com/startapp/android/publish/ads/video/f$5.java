// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video;

import android.widget.VideoView;

// Referenced classes of package com.startapp.android.publish.ads.video:
//			f

class f$5
	implements Runnable
{

	public void run()
	{
		if(!a.s)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field f a>
	//*   2    4:getfield        #25  <Field boolean f.s>
	//*   3    7:ifne            21
			a.i.setVisibility(4);
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field f a>
	//    6   14:getfield        #29  <Field VideoView f.i>
	//    7   17:iconst_4        
	//    8   18:invokevirtual   #35  <Method void VideoView.setVisibility(int)>
	//    9   21:return          
	}

	final f a;

	f$5(f f1)
	{
		a = f1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field f a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
