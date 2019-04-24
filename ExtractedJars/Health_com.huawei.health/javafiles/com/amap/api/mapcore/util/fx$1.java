// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapManager;

// Referenced classes of package com.amap.api.mapcore.util:
//			fx

class fx$1
	implements android.view.OnClickListener
{

	public void onClick(View view)
	{
		a.d.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field fx$a a>
	//    2    4:getfield        #39  <Field ImageView fx$a.d>
	//    3    7:bipush          8
	//    4    9:invokevirtual   #45  <Method void ImageView.setVisibility(int)>
		a.c.setVisibility(0);
	//    5   12:aload_0         
	//    6   13:getfield        #23  <Field fx$a a>
	//    7   16:getfield        #48  <Field TextView fx$a.c>
	//    8   19:iconst_0        
	//    9   20:invokevirtual   #51  <Method void TextView.setVisibility(int)>
		a.c.setText("\u4E0B\u8F7D\u4E2D");
	//   10   23:aload_0         
	//   11   24:getfield        #23  <Field fx$a a>
	//   12   27:getfield        #48  <Field TextView fx$a.c>
	//   13   30:ldc1            #53  <String "\u4E0B\u8F7D\u4E2D">
	//   14   32:invokevirtual   #57  <Method void TextView.setText(CharSequence)>
		try
		{
			fx.a(c).downloadByCityName(b.getCity());
	//   15   35:aload_0         
	//   16   36:getfield        #21  <Field fx c>
	//   17   39:invokestatic    #60  <Method OfflineMapManager fx.a(fx)>
	//   18   42:aload_0         
	//   19   43:getfield        #25  <Field OfflineMapCity b>
	//   20   46:invokevirtual   #66  <Method String OfflineMapCity.getCity()>
	//   21   49:invokevirtual   #72  <Method void OfflineMapManager.downloadByCityName(String)>
			return;
	//   22   52:return          
		}
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  23   53:astore_1        
		{
			((AMapException) (view)).printStackTrace();
	//   24   54:aload_1         
	//   25   55:invokevirtual   #75  <Method void AMapException.printStackTrace()>
		}
	//   26   58:return          
	}

	final fx$a a;
	final OfflineMapCity b;
	final fx c;

	fx$1(fx fx1, fx$a fx$a1, OfflineMapCity offlinemapcity)
	{
		c = fx1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field fx c>
		a = fx$a1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field fx$a a>
		b = offlinemapcity;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field OfflineMapCity b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
