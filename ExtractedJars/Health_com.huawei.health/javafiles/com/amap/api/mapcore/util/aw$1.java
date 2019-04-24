// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amap.api.maps.model.Marker;

// Referenced classes of package com.amap.api.mapcore.util:
//			aw, et, hm

class aw$1
	implements com.amap.api.maps.InfoWindowAdapter
{

	public View getInfoContents(Marker marker)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public View getInfoWindow(Marker marker)
	{
		try
		{
			if(aw.a(a) == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field aw a>
	//*   2    4:invokestatic    #26  <Method android.graphics.drawable.Drawable aw.a(aw)>
	//*   3    7:ifnonnull       30
				aw.a(a, et.a(a.c, "infowindow_bg.9.png"));
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field aw a>
	//    6   14:aload_0         
	//    7   15:getfield        #14  <Field aw a>
	//    8   18:getfield        #30  <Field android.content.Context aw.c>
	//    9   21:ldc1            #32  <String "infowindow_bg.9.png">
	//   10   23:invokestatic    #37  <Method android.graphics.drawable.Drawable et.a(android.content.Context, String)>
	//   11   26:invokestatic    #40  <Method android.graphics.drawable.Drawable aw.a(aw, android.graphics.drawable.Drawable)>
	//   12   29:pop             
			if(aw.b(a) == null)
	//*  13   30:aload_0         
	//*  14   31:getfield        #14  <Field aw a>
	//*  15   34:invokestatic    #44  <Method View aw.b(aw)>
	//*  16   37:ifnonnull       229
			{
				aw.a(a, ((View) (new LinearLayout(a.c))));
	//   17   40:aload_0         
	//   18   41:getfield        #14  <Field aw a>
	//   19   44:new             #46  <Class LinearLayout>
	//   20   47:dup             
	//   21   48:aload_0         
	//   22   49:getfield        #14  <Field aw a>
	//   23   52:getfield        #30  <Field android.content.Context aw.c>
	//   24   55:invokespecial   #49  <Method void LinearLayout(android.content.Context)>
	//   25   58:invokestatic    #52  <Method View aw.a(aw, View)>
	//   26   61:pop             
				aw.b(a).setBackground(aw.a(a));
	//   27   62:aload_0         
	//   28   63:getfield        #14  <Field aw a>
	//   29   66:invokestatic    #44  <Method View aw.b(aw)>
	//   30   69:aload_0         
	//   31   70:getfield        #14  <Field aw a>
	//   32   73:invokestatic    #26  <Method android.graphics.drawable.Drawable aw.a(aw)>
	//   33   76:invokevirtual   #58  <Method void View.setBackground(android.graphics.drawable.Drawable)>
				aw.a(a, new TextView(a.c));
	//   34   79:aload_0         
	//   35   80:getfield        #14  <Field aw a>
	//   36   83:new             #60  <Class TextView>
	//   37   86:dup             
	//   38   87:aload_0         
	//   39   88:getfield        #14  <Field aw a>
	//   40   91:getfield        #30  <Field android.content.Context aw.c>
	//   41   94:invokespecial   #61  <Method void TextView(android.content.Context)>
	//   42   97:invokestatic    #64  <Method TextView aw.a(aw, TextView)>
	//   43  100:pop             
				aw.c(a).setText(((CharSequence) (marker.getTitle())));
	//   44  101:aload_0         
	//   45  102:getfield        #14  <Field aw a>
	//   46  105:invokestatic    #67  <Method TextView aw.c(aw)>
	//   47  108:aload_1         
	//   48  109:invokevirtual   #73  <Method String Marker.getTitle()>
	//   49  112:invokevirtual   #77  <Method void TextView.setText(CharSequence)>
				aw.c(a).setTextColor(0xff000000);
	//   50  115:aload_0         
	//   51  116:getfield        #14  <Field aw a>
	//   52  119:invokestatic    #67  <Method TextView aw.c(aw)>
	//   53  122:ldc1            #78  <Int 0xff000000>
	//   54  124:invokevirtual   #82  <Method void TextView.setTextColor(int)>
				aw.b(a, new TextView(a.c));
	//   55  127:aload_0         
	//   56  128:getfield        #14  <Field aw a>
	//   57  131:new             #60  <Class TextView>
	//   58  134:dup             
	//   59  135:aload_0         
	//   60  136:getfield        #14  <Field aw a>
	//   61  139:getfield        #30  <Field android.content.Context aw.c>
	//   62  142:invokespecial   #61  <Method void TextView(android.content.Context)>
	//   63  145:invokestatic    #84  <Method TextView aw.b(aw, TextView)>
	//   64  148:pop             
				aw.d(a).setTextColor(0xff000000);
	//   65  149:aload_0         
	//   66  150:getfield        #14  <Field aw a>
	//   67  153:invokestatic    #87  <Method TextView aw.d(aw)>
	//   68  156:ldc1            #78  <Int 0xff000000>
	//   69  158:invokevirtual   #82  <Method void TextView.setTextColor(int)>
				aw.d(a).setText(((CharSequence) (marker.getSnippet())));
	//   70  161:aload_0         
	//   71  162:getfield        #14  <Field aw a>
	//   72  165:invokestatic    #87  <Method TextView aw.d(aw)>
	//   73  168:aload_1         
	//   74  169:invokevirtual   #90  <Method String Marker.getSnippet()>
	//   75  172:invokevirtual   #77  <Method void TextView.setText(CharSequence)>
				((LinearLayout)aw.b(a)).setOrientation(1);
	//   76  175:aload_0         
	//   77  176:getfield        #14  <Field aw a>
	//   78  179:invokestatic    #44  <Method View aw.b(aw)>
	//   79  182:checkcast       #46  <Class LinearLayout>
	//   80  185:iconst_1        
	//   81  186:invokevirtual   #93  <Method void LinearLayout.setOrientation(int)>
				((LinearLayout)aw.b(a)).addView(((View) (aw.c(a))));
	//   82  189:aload_0         
	//   83  190:getfield        #14  <Field aw a>
	//   84  193:invokestatic    #44  <Method View aw.b(aw)>
	//   85  196:checkcast       #46  <Class LinearLayout>
	//   86  199:aload_0         
	//   87  200:getfield        #14  <Field aw a>
	//   88  203:invokestatic    #67  <Method TextView aw.c(aw)>
	//   89  206:invokevirtual   #97  <Method void LinearLayout.addView(View)>
				((LinearLayout)aw.b(a)).addView(((View) (aw.d(a))));
	//   90  209:aload_0         
	//   91  210:getfield        #14  <Field aw a>
	//   92  213:invokestatic    #44  <Method View aw.b(aw)>
	//   93  216:checkcast       #46  <Class LinearLayout>
	//   94  219:aload_0         
	//   95  220:getfield        #14  <Field aw a>
	//   96  223:invokestatic    #87  <Method TextView aw.d(aw)>
	//   97  226:invokevirtual   #97  <Method void LinearLayout.addView(View)>
			}
		}
	//*  98  229:goto            245
		// Misplaced declaration of an exception variable
		catch(Marker marker)
	//*  99  232:astore_1        
		{
			hm.c(((Throwable) (marker)), "InfoWindowDelegate", "showInfoWindow decodeDrawableFromAsset");
	//  100  233:aload_1         
	//  101  234:ldc1            #99  <String "InfoWindowDelegate">
	//  102  236:ldc1            #101 <String "showInfoWindow decodeDrawableFromAsset">
	//  103  238:invokestatic    #106 <Method void hm.c(Throwable, String, String)>
			((Throwable) (marker)).printStackTrace();
	//  104  241:aload_1         
	//  105  242:invokevirtual   #109 <Method void Throwable.printStackTrace()>
		}
		return aw.b(a);
	//  106  245:aload_0         
	//  107  246:getfield        #14  <Field aw a>
	//  108  249:invokestatic    #44  <Method View aw.b(aw)>
	//  109  252:areturn         
	}

	final aw a;

	aw$1(aw aw1)
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
