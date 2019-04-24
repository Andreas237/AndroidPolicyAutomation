// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video;

import android.os.Handler;
import com.startapp.android.publish.ads.video.b.c;
import com.startapp.android.publish.adsCommon.b;
import com.startapp.android.publish.adsCommon.n;

// Referenced classes of package com.startapp.android.publish.ads.video:
//			f, VideoAdDetails

class f$4
	implements Runnable
{

	public void run()
	{
		int i = a.d(a.h.d() + 50);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field f a>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field f a>
	//    4    8:getfield        #52  <Field c f.h>
	//    5   11:invokeinterface #55  <Method int c.d()>
	//    6   16:bipush          50
	//    7   18:iadd            
	//    8   19:invokevirtual   #57  <Method int f.d(int)>
	//    9   22:istore_1        
		if(i < 0)
			break MISSING_BLOCK_LABEL_87;
	//   10   23:iload_1         
	//   11   24:iflt            87
		if(b)
			break MISSING_BLOCK_LABEL_87;
	//   12   27:aload_0         
	//   13   28:getfield        #59  <Field boolean b>
	//   14   31:ifne            87
		if(i == 0)
			break MISSING_BLOCK_LABEL_62;
	//   15   34:iload_1         
	//   16   35:ifeq            62
		if(a.m < a.U().getSkippableAfter() * 1000)
			break MISSING_BLOCK_LABEL_203;
	//   17   38:aload_0         
	//   18   39:getfield        #21  <Field f a>
	//   19   42:getfield        #62  <Field int f.m>
	//   20   45:aload_0         
	//   21   46:getfield        #21  <Field f a>
	//   22   49:invokevirtual   #66  <Method VideoAdDetails f.U()>
	//   23   52:invokevirtual   #71  <Method int VideoAdDetails.getSkippableAfter()>
	//   24   55:sipush          1000
	//   25   58:imul            
	//   26   59:icmplt          203
		b = true;
	//   27   62:aload_0         
	//   28   63:iconst_1        
	//   29   64:putfield        #59  <Field boolean b>
		f.a(a, "videoApi.setSkipTimer", new Object[] {
			Integer.valueOf(0)
		});
	//   30   67:aload_0         
	//   31   68:getfield        #21  <Field f a>
	//   32   71:ldc1            #73  <String "videoApi.setSkipTimer">
	//   33   73:iconst_1        
	//   34   74:anewarray       Object[]
	//   35   77:dup             
	//   36   78:iconst_0        
	//   37   79:iconst_0        
	//   38   80:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   39   83:aastore         
	//   40   84:invokestatic    #82  <Method void f.a(f, String, Object[])>
_L2:
		if(a.u && a.h.d() >= c)
	//*  41   87:aload_0         
	//*  42   88:getfield        #21  <Field f a>
	//*  43   91:getfield        #85  <Field boolean f.u>
	//*  44   94:ifeq            123
	//*  45   97:aload_0         
	//*  46   98:getfield        #21  <Field f a>
	//*  47  101:getfield        #52  <Field c f.h>
	//*  48  104:invokeinterface #55  <Method int c.d()>
	//*  49  109:aload_0         
	//*  50  110:getfield        #44  <Field int c>
	//*  51  113:icmplt          123
			a.T();
	//   52  116:aload_0         
	//   53  117:getfield        #21  <Field f a>
	//   54  120:invokevirtual   #88  <Method void f.T()>
		i = (a.h.d() + 50) / 1000;
	//   55  123:aload_0         
	//   56  124:getfield        #21  <Field f a>
	//   57  127:getfield        #52  <Field c f.h>
	//   58  130:invokeinterface #55  <Method int c.d()>
	//   59  135:bipush          50
	//   60  137:iadd            
	//   61  138:sipush          1000
	//   62  141:idiv            
	//   63  142:istore_1        
		com.startapp.android.publish.ads.video.f.c(a, "videoApi.setVideoCurrentPosition", new Object[] {
			Integer.valueOf(i)
		});
	//   64  143:aload_0         
	//   65  144:getfield        #21  <Field f a>
	//   66  147:ldc1            #90  <String "videoApi.setVideoCurrentPosition">
	//   67  149:iconst_1        
	//   68  150:anewarray       Object[]
	//   69  153:dup             
	//   70  154:iconst_0        
	//   71  155:iload_1         
	//   72  156:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//   73  159:aastore         
	//   74  160:invokestatic    #92  <Method void com.startapp.android.publish.ads.video.f.c(f, String, Object[])>
		if(i < a.h.e() / 1000)
	//*  75  163:iload_1         
	//*  76  164:aload_0         
	//*  77  165:getfield        #21  <Field f a>
	//*  78  168:getfield        #52  <Field c f.h>
	//*  79  171:invokeinterface #94  <Method int c.e()>
	//*  80  176:sipush          1000
	//*  81  179:idiv            
	//*  82  180:icmpge          227
		{
			a.C.postDelayed(((Runnable) (this)), a.Q());
	//   83  183:aload_0         
	//   84  184:getfield        #21  <Field f a>
	//   85  187:getfield        #98  <Field Handler f.C>
	//   86  190:aload_0         
	//   87  191:aload_0         
	//   88  192:getfield        #21  <Field f a>
	//   89  195:invokevirtual   #102 <Method long f.Q()>
	//   90  198:invokevirtual   #108 <Method boolean Handler.postDelayed(Runnable, long)>
	//   91  201:pop             
			return;
	//   92  202:return          
		}
		break MISSING_BLOCK_LABEL_227;
		com.startapp.android.publish.ads.video.f.b(a, "videoApi.setSkipTimer", new Object[] {
			Integer.valueOf(i)
		});
	//   93  203:aload_0         
	//   94  204:getfield        #21  <Field f a>
	//   95  207:ldc1            #73  <String "videoApi.setSkipTimer">
	//   96  209:iconst_1        
	//   97  210:anewarray       Object[]
	//   98  213:dup             
	//   99  214:iconst_0        
	//  100  215:iload_1         
	//  101  216:invokestatic    #79  <Method Integer Integer.valueOf(int)>
	//  102  219:aastore         
	//  103  220:invokestatic    #110 <Method void com.startapp.android.publish.ads.video.f.b(f, String, Object[])>
		if(true) goto _L2; else goto _L1
	//  104  223:goto            87
_L1:
		Exception exception;
		exception;
	//  105  226:astore_2        
	//  106  227:return          
	}

	final f a;
	private boolean b;
	private final int c;

	f$4(f f1)
	{
		a = f1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field f a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
		c = a.e(com.startapp.android.publish.adsCommon.b.a().G().d());
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #21  <Field f a>
	//    8   14:invokestatic    #28  <Method b b.a()>
	//    9   17:invokevirtual   #32  <Method n b.G()>
	//   10   20:invokevirtual   #38  <Method int n.d()>
	//   11   23:invokevirtual   #42  <Method int f.e(int)>
	//   12   26:putfield        #44  <Field int c>
	//   13   29:return          
	}
}
