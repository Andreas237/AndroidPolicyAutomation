// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.*;
import java.lang.ref.WeakReference;

// Referenced classes of package com.amap.api.mapcore.util:
//			h, fc

class h$1 extends Handler
{

	public void handleMessage(Message message)
	{
		super.handleMessage(message);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void Handler.handleMessage(Message)>
		if(h.b())
	//*   3    5:invokestatic    #24  <Method boolean h.b()>
	//*   4    8:ifeq            12
			return;
	//    5   11:return          
		if(h.a(a) == null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #12  <Field h a>
	//*   8   16:invokestatic    #27  <Method h$a h.a(h)>
	//*   9   19:ifnonnull       78
		{
			h h1 = a;
	//   10   22:aload_0         
	//   11   23:getfield        #12  <Field h a>
	//   12   26:astore_2        
			s s = h.b(a);
	//   13   27:aload_0         
	//   14   28:getfield        #12  <Field h a>
	//   15   31:invokestatic    #30  <Method s h.b(h)>
	//   16   34:astore_3        
			if(h.c(a) == null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #12  <Field h a>
	//*  19   39:invokestatic    #34  <Method WeakReference h.c(h)>
	//*  20   42:ifnonnull       50
				message = null;
	//   21   45:aconst_null     
	//   22   46:astore_1        
			else
	//*  23   47:goto            64
				message = ((Message) ((Context)h.c(a).get()));
	//   24   50:aload_0         
	//   25   51:getfield        #12  <Field h a>
	//   26   54:invokestatic    #34  <Method WeakReference h.c(h)>
	//   27   57:invokevirtual   #40  <Method Object WeakReference.get()>
	//   28   60:checkcast       #42  <Class Context>
	//   29   63:astore_1        
			h.a(h1, new h$a(s, ((Context) (message))));
	//   30   64:aload_2         
	//   31   65:new             #44  <Class h$a>
	//   32   68:dup             
	//   33   69:aload_3         
	//   34   70:aload_1         
	//   35   71:invokespecial   #47  <Method void h$a(s, Context)>
	//   36   74:invokestatic    #50  <Method h$a h.a(h, h$a)>
	//   37   77:pop             
		}
		fc.a().a(((Runnable) (h.a(a))));
	//   38   78:invokestatic    #55  <Method fc fc.a()>
	//   39   81:aload_0         
	//   40   82:getfield        #12  <Field h a>
	//   41   85:invokestatic    #27  <Method h$a h.a(h)>
	//   42   88:invokevirtual   #58  <Method void fc.a(Runnable)>
	//   43   91:return          
	}

	final h a;

	h$1(h h1, Looper looper)
	{
		a = h1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field h a>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #15  <Method void Handler(Looper)>
	//    6   10:return          
	}
}
