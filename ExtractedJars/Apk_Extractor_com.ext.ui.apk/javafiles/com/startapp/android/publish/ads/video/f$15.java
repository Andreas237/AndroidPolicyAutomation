// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video;

import com.startapp.android.publish.ads.video.b.c;

// Referenced classes of package com.startapp.android.publish.ads.video:
//			f, VideoAdDetails

class f$15
	implements com.startapp.android.publish.ads.video.b.c.e
{

	public boolean a(com.startapp.android.publish.ads.video.b.c.g g)
	{
		a.v = false;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field f a>
	//    2    4:iconst_0        
	//    3    5:putfield        #25  <Field boolean f.v>
		if(a.u && a.y <= a.z && g.c() > 0 && g.b().equals(((Object) (com.startapp.android.publish.ads.video.b.b.a.a.toString()))))
	//*   4    8:aload_0         
	//*   5    9:getfield        #17  <Field f a>
	//*   6   12:getfield        #28  <Field boolean f.u>
	//*   7   15:ifeq            120
	//*   8   18:aload_0         
	//*   9   19:getfield        #17  <Field f a>
	//*  10   22:getfield        #32  <Field int f.y>
	//*  11   25:aload_0         
	//*  12   26:getfield        #17  <Field f a>
	//*  13   29:getfield        #35  <Field int f.z>
	//*  14   32:icmpgt          120
	//*  15   35:aload_1         
	//*  16   36:invokevirtual   #41  <Method int com.startapp.android.publish.ads.video.b.c$g.c()>
	//*  17   39:ifle            120
	//*  18   42:aload_1         
	//*  19   43:invokevirtual   #45  <Method String com.startapp.android.publish.ads.video.b.c$g.b()>
	//*  20   46:getstatic       #50  <Field com.startapp.android.publish.ads.video.b.b$a com.startapp.android.publish.ads.video.b.b$a.a>
	//*  21   49:invokevirtual   #53  <Method String com.startapp.android.publish.ads.video.b.b$a.toString()>
	//*  22   52:invokevirtual   #59  <Method boolean String.equals(Object)>
	//*  23   55:ifeq            120
		{
			f f1 = a;
	//   24   58:aload_0         
	//   25   59:getfield        #17  <Field f a>
	//   26   62:astore_2        
			f1.y = f1.y + 1;
	//   27   63:aload_2         
	//   28   64:aload_2         
	//   29   65:getfield        #32  <Field int f.y>
	//   30   68:iconst_1        
	//   31   69:iadd            
	//   32   70:putfield        #32  <Field int f.y>
			a.L();
	//   33   73:aload_0         
	//   34   74:getfield        #17  <Field f a>
	//   35   77:invokevirtual   #62  <Method void f.L()>
			a.h.a(a.U().getLocalVideoPath());
	//   36   80:aload_0         
	//   37   81:getfield        #17  <Field f a>
	//   38   84:getfield        #66  <Field c f.h>
	//   39   87:aload_0         
	//   40   88:getfield        #17  <Field f a>
	//   41   91:invokevirtual   #70  <Method VideoAdDetails f.U()>
	//   42   94:invokevirtual   #75  <Method String VideoAdDetails.getLocalVideoPath()>
	//   43   97:invokeinterface #80  <Method void c.a(String)>
			a.h.a(g.c());
	//   44  102:aload_0         
	//   45  103:getfield        #17  <Field f a>
	//   46  106:getfield        #66  <Field c f.h>
	//   47  109:aload_1         
	//   48  110:invokevirtual   #41  <Method int com.startapp.android.publish.ads.video.b.c$g.c()>
	//   49  113:invokeinterface #83  <Method void c.a(int)>
		} else
	//*  50  118:iconst_1        
	//*  51  119:ireturn         
		{
			a.a(g);
	//   52  120:aload_0         
	//   53  121:getfield        #17  <Field f a>
	//   54  124:aload_1         
	//   55  125:invokevirtual   #86  <Method void f.a(com.startapp.android.publish.ads.video.b.c$g)>
		}
		return true;
	//*  56  128:goto            118
	}

	final f a;

	f$15(f f1)
	{
		a = f1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field f a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
