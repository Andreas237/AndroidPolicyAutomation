// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

// Referenced classes of package com.amap.api.mapcore.util:
//			ft, s, al, hm

class ft$1
	implements android.view.OnTouchListener
{

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		boolean flag;
		if(ft.a(a).g() >= ft.a(a).getMaxZoomLevel())
			break MISSING_BLOCK_LABEL_45;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ft a>
	//    2    4:invokestatic    #29  <Method s ft.a(ft)>
	//    3    7:invokeinterface #35  <Method float s.g()>
	//    4   12:aload_0         
	//    5   13:getfield        #16  <Field ft a>
	//    6   16:invokestatic    #29  <Method s ft.a(ft)>
	//    7   19:invokeinterface #38  <Method float s.getMaxZoomLevel()>
	//    8   24:fcmpl           
	//    9   25:ifge            45
		flag = ft.a(a).isMaploaded();
	//   10   28:aload_0         
	//   11   29:getfield        #16  <Field ft a>
	//   12   32:invokestatic    #29  <Method s ft.a(ft)>
	//   13   35:invokeinterface #42  <Method boolean s.isMaploaded()>
	//   14   40:istore_3        
		if(flag)
			break MISSING_BLOCK_LABEL_47;
	//   15   41:iload_3         
	//   16   42:ifne            47
		return false;
	//   17   45:iconst_0        
	//   18   46:ireturn         
		if(motionevent.getAction() == 0)
	//*  19   47:aload_2         
	//*  20   48:invokevirtual   #48  <Method int MotionEvent.getAction()>
	//*  21   51:ifne            74
		{
			ft.c(a).setImageBitmap(ft.b(a));
	//   22   54:aload_0         
	//   23   55:getfield        #16  <Field ft a>
	//   24   58:invokestatic    #52  <Method ImageView ft.c(ft)>
	//   25   61:aload_0         
	//   26   62:getfield        #16  <Field ft a>
	//   27   65:invokestatic    #56  <Method android.graphics.Bitmap ft.b(ft)>
	//   28   68:invokevirtual   #62  <Method void ImageView.setImageBitmap(android.graphics.Bitmap)>
			break MISSING_BLOCK_LABEL_138;
	//   29   71:goto            130
		}
		if(motionevent.getAction() != 1)
			break MISSING_BLOCK_LABEL_138;
	//   30   74:aload_2         
	//   31   75:invokevirtual   #48  <Method int MotionEvent.getAction()>
	//   32   78:iconst_1        
	//   33   79:icmpne          130
		ft.c(a).setImageBitmap(ft.d(a));
	//   34   82:aload_0         
	//   35   83:getfield        #16  <Field ft a>
	//   36   86:invokestatic    #52  <Method ImageView ft.c(ft)>
	//   37   89:aload_0         
	//   38   90:getfield        #16  <Field ft a>
	//   39   93:invokestatic    #65  <Method android.graphics.Bitmap ft.d(ft)>
	//   40   96:invokevirtual   #62  <Method void ImageView.setImageBitmap(android.graphics.Bitmap)>
		try
		{
			ft.a(a).b(al.a());
	//   41   99:aload_0         
	//   42  100:getfield        #16  <Field ft a>
	//   43  103:invokestatic    #29  <Method s ft.a(ft)>
	//   44  106:invokestatic    #70  <Method com.autonavi.amap.mapcore.AbstractCameraUpdateMessage al.a()>
	//   45  109:invokeinterface #73  <Method void s.b(com.autonavi.amap.mapcore.AbstractCameraUpdateMessage)>
		}
	//*  46  114:goto            130
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  47  117:astore_1        
		{
			try
			{
				hm.c(((Throwable) (view)), "ZoomControllerView", "zoomin ontouch");
	//   48  118:aload_1         
	//   49  119:ldc1            #75  <String "ZoomControllerView">
	//   50  121:ldc1            #77  <String "zoomin ontouch">
	//   51  123:invokestatic    #82  <Method void hm.c(Throwable, String, String)>
				((RemoteException) (view)).printStackTrace();
	//   52  126:aload_1         
	//   53  127:invokevirtual   #85  <Method void RemoteException.printStackTrace()>
			}
	//*  54  130:goto            138
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  55  133:astore_1        
			{
				((Throwable) (view)).printStackTrace();
	//   56  134:aload_1         
	//   57  135:invokevirtual   #86  <Method void Throwable.printStackTrace()>
			}
		}
		return false;
	//   58  138:iconst_0        
	//   59  139:ireturn         
	}

	final ft a;

	ft$1(ft ft1)
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
