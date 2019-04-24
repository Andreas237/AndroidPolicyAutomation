// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

// Referenced classes of package com.amap.api.mapcore.util:
//			ft, s, al, hm

class ft$2
	implements android.view.OnTouchListener
{

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		boolean flag;
		if(ft.a(a).g() <= ft.a(a).getMinZoomLevel())
			break MISSING_BLOCK_LABEL_45;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ft a>
	//    2    4:invokestatic    #27  <Method s ft.a(ft)>
	//    3    7:invokeinterface #33  <Method float s.g()>
	//    4   12:aload_0         
	//    5   13:getfield        #16  <Field ft a>
	//    6   16:invokestatic    #27  <Method s ft.a(ft)>
	//    7   19:invokeinterface #36  <Method float s.getMinZoomLevel()>
	//    8   24:fcmpg           
	//    9   25:ifle            45
		flag = ft.a(a).isMaploaded();
	//   10   28:aload_0         
	//   11   29:getfield        #16  <Field ft a>
	//   12   32:invokestatic    #27  <Method s ft.a(ft)>
	//   13   35:invokeinterface #40  <Method boolean s.isMaploaded()>
	//   14   40:istore_3        
		if(flag)
			break MISSING_BLOCK_LABEL_47;
	//   15   41:iload_3         
	//   16   42:ifne            47
		return false;
	//   17   45:iconst_0        
	//   18   46:ireturn         
label0:
		{
			if(motionevent.getAction() == 0)
	//*  19   47:aload_2         
	//*  20   48:invokevirtual   #46  <Method int MotionEvent.getAction()>
	//*  21   51:ifne            74
			{
				ft.f(a).setImageBitmap(ft.e(a));
	//   22   54:aload_0         
	//   23   55:getfield        #16  <Field ft a>
	//   24   58:invokestatic    #50  <Method ImageView ft.f(ft)>
	//   25   61:aload_0         
	//   26   62:getfield        #16  <Field ft a>
	//   27   65:invokestatic    #54  <Method android.graphics.Bitmap ft.e(ft)>
	//   28   68:invokevirtual   #60  <Method void ImageView.setImageBitmap(android.graphics.Bitmap)>
				break label0;
	//   29   71:goto            114
			}
			try
			{
				if(motionevent.getAction() == 1)
	//*  30   74:aload_2         
	//*  31   75:invokevirtual   #46  <Method int MotionEvent.getAction()>
	//*  32   78:iconst_1        
	//*  33   79:icmpne          114
				{
					ft.f(a).setImageBitmap(ft.g(a));
	//   34   82:aload_0         
	//   35   83:getfield        #16  <Field ft a>
	//   36   86:invokestatic    #50  <Method ImageView ft.f(ft)>
	//   37   89:aload_0         
	//   38   90:getfield        #16  <Field ft a>
	//   39   93:invokestatic    #62  <Method android.graphics.Bitmap ft.g(ft)>
	//   40   96:invokevirtual   #60  <Method void ImageView.setImageBitmap(android.graphics.Bitmap)>
					ft.a(a).b(al.b());
	//   41   99:aload_0         
	//   42  100:getfield        #16  <Field ft a>
	//   43  103:invokestatic    #27  <Method s ft.a(ft)>
	//   44  106:invokestatic    #68  <Method com.autonavi.amap.mapcore.AbstractCameraUpdateMessage al.b()>
	//   45  109:invokeinterface #71  <Method void s.b(com.autonavi.amap.mapcore.AbstractCameraUpdateMessage)>
				}
			}
	//*  46  114:goto            130
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  47  117:astore_1        
			{
				hm.c(((Throwable) (view)), "ZoomControllerView", "zoomout ontouch");
	//   48  118:aload_1         
	//   49  119:ldc1            #73  <String "ZoomControllerView">
	//   50  121:ldc1            #75  <String "zoomout ontouch">
	//   51  123:invokestatic    #81  <Method void hm.c(Throwable, String, String)>
				((Throwable) (view)).printStackTrace();
	//   52  126:aload_1         
	//   53  127:invokevirtual   #84  <Method void Throwable.printStackTrace()>
			}
		}
		return false;
	//   54  130:iconst_0        
	//   55  131:ireturn         
	}

	final ft a;

	ft$2(ft ft1)
	{
		a = ft1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field ft a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
