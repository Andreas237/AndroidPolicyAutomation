// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.location.Location;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.amap.api.maps.model.LatLng;

// Referenced classes of package com.amap.api.mapcore.util:
//			fp, s, al, hm

class fp$1
	implements android.view.OnTouchListener
{

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		if(!a.i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field fp a>
	//*   2    4:getfield        #28  <Field boolean fp.i>
	//*   3    7:ifne            12
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
		if(motionevent.getAction() == 0)
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #34  <Method int MotionEvent.getAction()>
	//*   8   16:ifne            39
		{
			a.g.setImageBitmap(a.b);
	//    9   19:aload_0         
	//   10   20:getfield        #16  <Field fp a>
	//   11   23:getfield        #38  <Field ImageView fp.g>
	//   12   26:aload_0         
	//   13   27:getfield        #16  <Field fp a>
	//   14   30:getfield        #42  <Field android.graphics.Bitmap fp.b>
	//   15   33:invokevirtual   #48  <Method void ImageView.setImageBitmap(android.graphics.Bitmap)>
			break MISSING_BLOCK_LABEL_169;
	//   16   36:goto            169
		}
		if(motionevent.getAction() != 1)
			break MISSING_BLOCK_LABEL_169;
	//   17   39:aload_2         
	//   18   40:invokevirtual   #34  <Method int MotionEvent.getAction()>
	//   19   43:iconst_1        
	//   20   44:icmpne          169
		a.g.setImageBitmap(a.a);
	//   21   47:aload_0         
	//   22   48:getfield        #16  <Field fp a>
	//   23   51:getfield        #38  <Field ImageView fp.g>
	//   24   54:aload_0         
	//   25   55:getfield        #16  <Field fp a>
	//   26   58:getfield        #50  <Field android.graphics.Bitmap fp.a>
	//   27   61:invokevirtual   #48  <Method void ImageView.setImageBitmap(android.graphics.Bitmap)>
		a.h.setMyLocationEnabled(true);
	//   28   64:aload_0         
	//   29   65:getfield        #16  <Field fp a>
	//   30   68:getfield        #54  <Field s fp.h>
	//   31   71:iconst_1        
	//   32   72:invokeinterface #60  <Method void s.setMyLocationEnabled(boolean)>
		view = ((View) (a.h.getMyLocation()));
	//   33   77:aload_0         
	//   34   78:getfield        #16  <Field fp a>
	//   35   81:getfield        #54  <Field s fp.h>
	//   36   84:invokeinterface #64  <Method Location s.getMyLocation()>
	//   37   89:astore_1        
		if(view == null)
	//*  38   90:aload_1         
	//*  39   91:ifnonnull       96
			return false;
	//   40   94:iconst_0        
	//   41   95:ireturn         
		try
		{
			motionevent = ((MotionEvent) (new LatLng(((Location) (view)).getLatitude(), ((Location) (view)).getLongitude())));
	//   42   96:new             #66  <Class LatLng>
	//   43   99:dup             
	//   44  100:aload_1         
	//   45  101:invokevirtual   #72  <Method double Location.getLatitude()>
	//   46  104:aload_1         
	//   47  105:invokevirtual   #75  <Method double Location.getLongitude()>
	//   48  108:invokespecial   #78  <Method void LatLng(double, double)>
	//   49  111:astore_2        
			a.h.a(((Location) (view)));
	//   50  112:aload_0         
	//   51  113:getfield        #16  <Field fp a>
	//   52  116:getfield        #54  <Field s fp.h>
	//   53  119:aload_1         
	//   54  120:invokeinterface #81  <Method void s.a(Location)>
			a.h.a(al.a(((LatLng) (motionevent)), a.h.g()));
	//   55  125:aload_0         
	//   56  126:getfield        #16  <Field fp a>
	//   57  129:getfield        #54  <Field s fp.h>
	//   58  132:aload_2         
	//   59  133:aload_0         
	//   60  134:getfield        #16  <Field fp a>
	//   61  137:getfield        #54  <Field s fp.h>
	//   62  140:invokeinterface #84  <Method float s.g()>
	//   63  145:invokestatic    #89  <Method com.autonavi.amap.mapcore.AbstractCameraUpdateMessage al.a(LatLng, float)>
	//   64  148:invokeinterface #92  <Method void s.a(com.autonavi.amap.mapcore.AbstractCameraUpdateMessage)>
		}
	//*  65  153:goto            169
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  66  156:astore_1        
		{
			hm.c(((Throwable) (view)), "LocationView", "onTouch");
	//   67  157:aload_1         
	//   68  158:ldc1            #94  <String "LocationView">
	//   69  160:ldc1            #95  <String "onTouch">
	//   70  162:invokestatic    #101 <Method void hm.c(Throwable, String, String)>
			((Throwable) (view)).printStackTrace();
	//   71  165:aload_1         
	//   72  166:invokevirtual   #104 <Method void Throwable.printStackTrace()>
		}
		return false;
	//   73  169:iconst_0        
	//   74  170:ireturn         
	}

	final fp a;

	fp$1(fp fp1)
	{
		a = fp1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field fp a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
