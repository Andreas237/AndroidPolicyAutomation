// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.support.design.widget.BottomSheetBehavior;
import android.view.View;

// Referenced classes of package com.irobot.home:
//			MapCustomizationActivity

class MapCustomizationActivity$30 extends android.support.design.widget.BottomSheetBehavior.a
{

	public void a(View view, float f)
	{
	//    0    0:return          
	}

	public void a(View view, int i)
	{
		if(i == 1)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          17
		{
			MapCustomizationActivity.c(a).a(false);
	//    3    5:aload_0         
	//    4    6:getfield        #15  <Field MapCustomizationActivity a>
	//    5    9:invokestatic    #24  <Method BottomSheetBehavior MapCustomizationActivity.c(MapCustomizationActivity)>
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #29  <Method void BottomSheetBehavior.a(boolean)>
			return;
	//    8   16:return          
		} else
		{
			MapCustomizationActivity.c(a).a(true);
	//    9   17:aload_0         
	//   10   18:getfield        #15  <Field MapCustomizationActivity a>
	//   11   21:invokestatic    #24  <Method BottomSheetBehavior MapCustomizationActivity.c(MapCustomizationActivity)>
	//   12   24:iconst_1        
	//   13   25:invokevirtual   #29  <Method void BottomSheetBehavior.a(boolean)>
			return;
	//   14   28:return          
		}
	}

	final MapCustomizationActivity a;

	MapCustomizationActivity$30(MapCustomizationActivity mapcustomizationactivity)
	{
		a = mapcustomizationactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field MapCustomizationActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void android.support.design.widget.BottomSheetBehavior$a()>
	//    5    9:return          
	}
}
