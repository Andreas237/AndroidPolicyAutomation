// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.MenuItem;
import com.irobot.core.MapCustomizationViewState;

// Referenced classes of package com.irobot.home:
//			MapCustomizationActivity

class MapCustomizationActivity$16
	implements android.widget.tener
{

	public boolean onMenuItemClick(MenuItem menuitem)
	{
		if(MapCustomizationActivity.h(a) != MapCustomizationViewState.StillLearningMapPreview)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field MapCustomizationActivity a>
	//*   2    4:invokestatic    #26  <Method MapCustomizationViewState MapCustomizationActivity.h(MapCustomizationActivity)>
	//*   3    7:getstatic       #32  <Field MapCustomizationViewState MapCustomizationViewState.StillLearningMapPreview>
	//*   4   10:if_acmpeq       35
			a.a(menuitem.getTitle(), menuitem.getItemId());
	//    5   13:aload_0         
	//    6   14:getfield        #16  <Field MapCustomizationActivity a>
	//    7   17:aload_1         
	//    8   18:invokeinterface #38  <Method CharSequence MenuItem.getTitle()>
	//    9   23:aload_1         
	//   10   24:invokeinterface #42  <Method int MenuItem.getItemId()>
	//   11   29:invokevirtual   #45  <Method void MapCustomizationActivity.a(CharSequence, int)>
		else
	//*  12   32:goto            48
			a.f(menuitem.getItemId());
	//   13   35:aload_0         
	//   14   36:getfield        #16  <Field MapCustomizationActivity a>
	//   15   39:aload_1         
	//   16   40:invokeinterface #42  <Method int MenuItem.getItemId()>
	//   17   45:invokevirtual   #49  <Method void MapCustomizationActivity.f(int)>
		return true;
	//   18   48:iconst_1        
	//   19   49:ireturn         
	}

	final MapCustomizationActivity a;

	MapCustomizationActivity$16(MapCustomizationActivity mapcustomizationactivity)
	{
		a = mapcustomizationactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field MapCustomizationActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
