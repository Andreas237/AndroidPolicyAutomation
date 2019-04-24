// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.amap.api.maps.model.CameraPosition;

// Referenced classes of package com.amap.api.mapcore.util:
//			fn, s, al, hm

class fn$1
	implements android.view.OnTouchListener
{

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		boolean flag = a.e.isMaploaded();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field fn a>
	//    2    4:getfield        #28  <Field s fn.e>
	//    3    7:invokeinterface #34  <Method boolean s.isMaploaded()>
	//    4   12:istore_3        
		if(!flag)
	//*   5   13:iload_3         
	//*   6   14:ifne            19
			return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
label0:
		{
			if(motionevent.getAction() == 0)
	//*   9   19:aload_2         
	//*  10   20:invokevirtual   #40  <Method int MotionEvent.getAction()>
	//*  11   23:ifne            46
			{
				a.d.setImageBitmap(a.b);
	//   12   26:aload_0         
	//   13   27:getfield        #16  <Field fn a>
	//   14   30:getfield        #44  <Field ImageView fn.d>
	//   15   33:aload_0         
	//   16   34:getfield        #16  <Field fn a>
	//   17   37:getfield        #48  <Field android.graphics.Bitmap fn.b>
	//   18   40:invokevirtual   #54  <Method void ImageView.setImageBitmap(android.graphics.Bitmap)>
				break label0;
	//   19   43:goto            116
			}
			try
			{
				if(motionevent.getAction() == 1)
	//*  20   46:aload_2         
	//*  21   47:invokevirtual   #40  <Method int MotionEvent.getAction()>
	//*  22   50:iconst_1        
	//*  23   51:icmpne          116
				{
					a.d.setImageBitmap(a.a);
	//   24   54:aload_0         
	//   25   55:getfield        #16  <Field fn a>
	//   26   58:getfield        #44  <Field ImageView fn.d>
	//   27   61:aload_0         
	//   28   62:getfield        #16  <Field fn a>
	//   29   65:getfield        #56  <Field android.graphics.Bitmap fn.a>
	//   30   68:invokevirtual   #54  <Method void ImageView.setImageBitmap(android.graphics.Bitmap)>
					view = ((View) (a.e.getCameraPosition()));
	//   31   71:aload_0         
	//   32   72:getfield        #16  <Field fn a>
	//   33   75:getfield        #28  <Field s fn.e>
	//   34   78:invokeinterface #60  <Method CameraPosition s.getCameraPosition()>
	//   35   83:astore_1        
					a.e.b(al.a(new CameraPosition(((CameraPosition) (view)).target, ((CameraPosition) (view)).zoom, 0.0F, 0.0F)));
	//   36   84:aload_0         
	//   37   85:getfield        #16  <Field fn a>
	//   38   88:getfield        #28  <Field s fn.e>
	//   39   91:new             #62  <Class CameraPosition>
	//   40   94:dup             
	//   41   95:aload_1         
	//   42   96:getfield        #66  <Field com.amap.api.maps.model.LatLng CameraPosition.target>
	//   43   99:aload_1         
	//   44  100:getfield        #70  <Field float CameraPosition.zoom>
	//   45  103:fconst_0        
	//   46  104:fconst_0        
	//   47  105:invokespecial   #73  <Method void CameraPosition(com.amap.api.maps.model.LatLng, float, float, float)>
	//   48  108:invokestatic    #78  <Method com.autonavi.amap.mapcore.AbstractCameraUpdateMessage al.a(CameraPosition)>
	//   49  111:invokeinterface #81  <Method void s.b(com.autonavi.amap.mapcore.AbstractCameraUpdateMessage)>
				}
			}
	//*  50  116:goto            132
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  51  119:astore_1        
			{
				hm.c(((Throwable) (view)), "CompassView", "onTouch");
	//   52  120:aload_1         
	//   53  121:ldc1            #83  <String "CompassView">
	//   54  123:ldc1            #84  <String "onTouch">
	//   55  125:invokestatic    #90  <Method void hm.c(Throwable, String, String)>
				((Throwable) (view)).printStackTrace();
	//   56  128:aload_1         
	//   57  129:invokevirtual   #93  <Method void Throwable.printStackTrace()>
			}
		}
		return false;
	//   58  132:iconst_0        
	//   59  133:ireturn         
	}

	final fn a;

	fn$1(fn fn1)
	{
		a = fn1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field fn a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
