// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amap.api.maps.InfoWindowParams;
import com.amap.api.maps.model.BasePointOverlay;

// Referenced classes of package com.amap.api.mapcore.util:
//			aw, et, hm

class aw$2
	implements com.amap.api.maps.CommonInfoWindowAdapter
{

	public InfoWindowParams getInfoWindowParams(BasePointOverlay basepointoverlay)
	{
		try
		{
			basepointoverlay = ((BasePointOverlay) (new InfoWindowParams()));
	//    0    0:new             #24  <Class InfoWindowParams>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void InfoWindowParams()>
	//    3    7:astore_1        
			if(aw.a(a) == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #14  <Field aw a>
	//*   6   12:invokestatic    #28  <Method android.graphics.drawable.Drawable aw.a(aw)>
	//*   7   15:ifnonnull       38
				aw.a(a, et.a(a.c, "infowindow_bg.9.png"));
	//    8   18:aload_0         
	//    9   19:getfield        #14  <Field aw a>
	//   10   22:aload_0         
	//   11   23:getfield        #14  <Field aw a>
	//   12   26:getfield        #32  <Field android.content.Context aw.c>
	//   13   29:ldc1            #34  <String "infowindow_bg.9.png">
	//   14   31:invokestatic    #39  <Method android.graphics.drawable.Drawable et.a(android.content.Context, String)>
	//   15   34:invokestatic    #42  <Method android.graphics.drawable.Drawable aw.a(aw, android.graphics.drawable.Drawable)>
	//   16   37:pop             
			aw.a(a, ((View) (new LinearLayout(a.c))));
	//   17   38:aload_0         
	//   18   39:getfield        #14  <Field aw a>
	//   19   42:new             #44  <Class LinearLayout>
	//   20   45:dup             
	//   21   46:aload_0         
	//   22   47:getfield        #14  <Field aw a>
	//   23   50:getfield        #32  <Field android.content.Context aw.c>
	//   24   53:invokespecial   #47  <Method void LinearLayout(android.content.Context)>
	//   25   56:invokestatic    #50  <Method View aw.a(aw, View)>
	//   26   59:pop             
			aw.b(a).setBackground(aw.a(a));
	//   27   60:aload_0         
	//   28   61:getfield        #14  <Field aw a>
	//   29   64:invokestatic    #54  <Method View aw.b(aw)>
	//   30   67:aload_0         
	//   31   68:getfield        #14  <Field aw a>
	//   32   71:invokestatic    #28  <Method android.graphics.drawable.Drawable aw.a(aw)>
	//   33   74:invokevirtual   #60  <Method void View.setBackground(android.graphics.drawable.Drawable)>
			aw.a(a, new TextView(a.c));
	//   34   77:aload_0         
	//   35   78:getfield        #14  <Field aw a>
	//   36   81:new             #62  <Class TextView>
	//   37   84:dup             
	//   38   85:aload_0         
	//   39   86:getfield        #14  <Field aw a>
	//   40   89:getfield        #32  <Field android.content.Context aw.c>
	//   41   92:invokespecial   #63  <Method void TextView(android.content.Context)>
	//   42   95:invokestatic    #66  <Method TextView aw.a(aw, TextView)>
	//   43   98:pop             
			aw.c(a).setText("\u6807\u9898");
	//   44   99:aload_0         
	//   45  100:getfield        #14  <Field aw a>
	//   46  103:invokestatic    #69  <Method TextView aw.c(aw)>
	//   47  106:ldc1            #71  <String "\u6807\u9898">
	//   48  108:invokevirtual   #75  <Method void TextView.setText(CharSequence)>
			aw.c(a).setTextColor(0xff000000);
	//   49  111:aload_0         
	//   50  112:getfield        #14  <Field aw a>
	//   51  115:invokestatic    #69  <Method TextView aw.c(aw)>
	//   52  118:ldc1            #76  <Int 0xff000000>
	//   53  120:invokevirtual   #80  <Method void TextView.setTextColor(int)>
			aw.b(a, new TextView(a.c));
	//   54  123:aload_0         
	//   55  124:getfield        #14  <Field aw a>
	//   56  127:new             #62  <Class TextView>
	//   57  130:dup             
	//   58  131:aload_0         
	//   59  132:getfield        #14  <Field aw a>
	//   60  135:getfield        #32  <Field android.content.Context aw.c>
	//   61  138:invokespecial   #63  <Method void TextView(android.content.Context)>
	//   62  141:invokestatic    #82  <Method TextView aw.b(aw, TextView)>
	//   63  144:pop             
			aw.d(a).setTextColor(0xff000000);
	//   64  145:aload_0         
	//   65  146:getfield        #14  <Field aw a>
	//   66  149:invokestatic    #85  <Method TextView aw.d(aw)>
	//   67  152:ldc1            #76  <Int 0xff000000>
	//   68  154:invokevirtual   #80  <Method void TextView.setTextColor(int)>
			aw.d(a).setText("\u5185\u5BB9");
	//   69  157:aload_0         
	//   70  158:getfield        #14  <Field aw a>
	//   71  161:invokestatic    #85  <Method TextView aw.d(aw)>
	//   72  164:ldc1            #87  <String "\u5185\u5BB9">
	//   73  166:invokevirtual   #75  <Method void TextView.setText(CharSequence)>
			((LinearLayout)aw.b(a)).setOrientation(1);
	//   74  169:aload_0         
	//   75  170:getfield        #14  <Field aw a>
	//   76  173:invokestatic    #54  <Method View aw.b(aw)>
	//   77  176:checkcast       #44  <Class LinearLayout>
	//   78  179:iconst_1        
	//   79  180:invokevirtual   #90  <Method void LinearLayout.setOrientation(int)>
			((LinearLayout)aw.b(a)).addView(((View) (aw.c(a))));
	//   80  183:aload_0         
	//   81  184:getfield        #14  <Field aw a>
	//   82  187:invokestatic    #54  <Method View aw.b(aw)>
	//   83  190:checkcast       #44  <Class LinearLayout>
	//   84  193:aload_0         
	//   85  194:getfield        #14  <Field aw a>
	//   86  197:invokestatic    #69  <Method TextView aw.c(aw)>
	//   87  200:invokevirtual   #94  <Method void LinearLayout.addView(View)>
			((LinearLayout)aw.b(a)).addView(((View) (aw.d(a))));
	//   88  203:aload_0         
	//   89  204:getfield        #14  <Field aw a>
	//   90  207:invokestatic    #54  <Method View aw.b(aw)>
	//   91  210:checkcast       #44  <Class LinearLayout>
	//   92  213:aload_0         
	//   93  214:getfield        #14  <Field aw a>
	//   94  217:invokestatic    #85  <Method TextView aw.d(aw)>
	//   95  220:invokevirtual   #94  <Method void LinearLayout.addView(View)>
			((InfoWindowParams) (basepointoverlay)).setInfoWindowType(2);
	//   96  223:aload_1         
	//   97  224:iconst_2        
	//   98  225:invokevirtual   #97  <Method void InfoWindowParams.setInfoWindowType(int)>
			((InfoWindowParams) (basepointoverlay)).setInfoWindow(aw.b(a));
	//   99  228:aload_1         
	//  100  229:aload_0         
	//  101  230:getfield        #14  <Field aw a>
	//  102  233:invokestatic    #54  <Method View aw.b(aw)>
	//  103  236:invokevirtual   #100 <Method void InfoWindowParams.setInfoWindow(View)>
		}
	//* 104  239:aload_1         
	//* 105  240:areturn         
		// Misplaced declaration of an exception variable
		catch(BasePointOverlay basepointoverlay)
	//* 106  241:astore_1        
		{
			hm.c(((Throwable) (basepointoverlay)), "InfoWindowDelegate", "showInfoWindow decodeDrawableFromAsset");
	//  107  242:aload_1         
	//  108  243:ldc1            #102 <String "InfoWindowDelegate">
	//  109  245:ldc1            #104 <String "showInfoWindow decodeDrawableFromAsset">
	//  110  247:invokestatic    #109 <Method void hm.c(Throwable, String, String)>
			((Throwable) (basepointoverlay)).printStackTrace();
	//  111  250:aload_1         
	//  112  251:invokevirtual   #112 <Method void Throwable.printStackTrace()>
			return null;
	//  113  254:aconst_null     
	//  114  255:areturn         
		}
		return ((InfoWindowParams) (basepointoverlay));
	}

	final aw a;

	aw$2(aw aw1)
	{
		a = aw1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field aw a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
