// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.View;
import com.irobot.core.RobotPadCategory;
import com.irobot.home.b.w;
import com.irobot.home.model.PadSettings;
import java.util.*;

// Referenced classes of package com.irobot.home:
//			BraavaPadSettingsActivity

class BraavaPadSettingsActivity$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		for(view = ((View) (a.e.entrySet().iterator())); ((Iterator) (view)).hasNext(); ((PadSettings)((java.util.Map.Entry)((Iterator) (view)).next()).getValue()).a(2));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BraavaPadSettingsActivity a>
	//    2    4:getfield        #26  <Field Map BraavaPadSettingsActivity.e>
	//    3    7:invokeinterface #32  <Method Set Map.entrySet()>
	//    4   12:invokeinterface #38  <Method Iterator Set.iterator()>
	//    5   17:astore_1        
	//    6   18:aload_1         
	//    7   19:invokeinterface #44  <Method boolean Iterator.hasNext()>
	//    8   24:ifeq            51
	//    9   27:aload_1         
	//   10   28:invokeinterface #48  <Method Object Iterator.next()>
	//   11   33:checkcast       #50  <Class java.util.Map$Entry>
	//   12   36:invokeinterface #53  <Method Object java.util.Map$Entry.getValue()>
	//   13   41:checkcast       #55  <Class PadSettings>
	//   14   44:iconst_2        
	//   15   45:invokevirtual   #58  <Method void PadSettings.a(int)>
	//*  16   48:goto            18
		BraavaPadSettingsActivity.a(a).notifyDataSetChanged();
	//   17   51:aload_0         
	//   18   52:getfield        #17  <Field BraavaPadSettingsActivity a>
	//   19   55:invokestatic    #61  <Method w BraavaPadSettingsActivity.a(BraavaPadSettingsActivity)>
	//   20   58:invokevirtual   #66  <Method void w.notifyDataSetChanged()>
		a.a(RobotPadCategory.All, 2);
	//   21   61:aload_0         
	//   22   62:getfield        #17  <Field BraavaPadSettingsActivity a>
	//   23   65:getstatic       #72  <Field RobotPadCategory RobotPadCategory.All>
	//   24   68:iconst_2        
	//   25   69:invokevirtual   #75  <Method void BraavaPadSettingsActivity.a(RobotPadCategory, int)>
		a.b();
	//   26   72:aload_0         
	//   27   73:getfield        #17  <Field BraavaPadSettingsActivity a>
	//   28   76:invokevirtual   #78  <Method void BraavaPadSettingsActivity.b()>
	//   29   79:return          
	}

	final BraavaPadSettingsActivity a;

	BraavaPadSettingsActivity$1(BraavaPadSettingsActivity braavapadsettingsactivity)
	{
		a = braavapadsettingsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BraavaPadSettingsActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
