// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video;

import android.widget.VideoView;

// Referenced classes of package com.startapp.android.publish.ads.video:
//			f

class f$11
	implements Runnable
{

	public void run()
	{
		f f1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field f a>
	//    2    4:astore_1        
		f1.l = f1.l + 1;
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:getfield        #26  <Field int f.l>
	//    6   10:iconst_1        
	//    7   11:iadd            
	//    8   12:putfield        #26  <Field int f.l>
		a.i.setVisibility(0);
	//    9   15:aload_0         
	//   10   16:getfield        #17  <Field f a>
	//   11   19:getfield        #30  <Field VideoView f.i>
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #36  <Method void VideoView.setVisibility(int)>
		a.n = false;
	//   14   26:aload_0         
	//   15   27:getfield        #17  <Field f a>
	//   16   30:iconst_0        
	//   17   31:putfield        #40  <Field boolean f.n>
		a.R();
	//   18   34:aload_0         
	//   19   35:getfield        #17  <Field f a>
	//   20   38:invokevirtual   #43  <Method void f.R()>
		a.O();
	//   21   41:aload_0         
	//   22   42:getfield        #17  <Field f a>
	//   23   45:invokevirtual   #46  <Method void f.O()>
		a.H();
	//   24   48:aload_0         
	//   25   49:getfield        #17  <Field f a>
	//   26   52:invokevirtual   #49  <Method void f.H()>
	//   27   55:return          
	}

	final f a;

	f$11(f f1)
	{
		a = f1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field f a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
