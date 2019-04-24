// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.CarpetBoostMode;
import java.util.ArrayList;

// Referenced classes of package com.irobot.home:
//			CarpetBoostSettingsActivity_

class CarpetBoostSettingsActivity_$4
	implements Runnable
{

	public void run()
	{
		CarpetBoostSettingsActivity_.a(c, a, b);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field CarpetBoostSettingsActivity_ c>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field ArrayList a>
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field CarpetBoostMode b>
	//    6   12:invokestatic    #31  <Method void CarpetBoostSettingsActivity_.a(CarpetBoostSettingsActivity_, ArrayList, CarpetBoostMode)>
	//    7   15:return          
	}

	final ArrayList a;
	final CarpetBoostMode b;
	final CarpetBoostSettingsActivity_ c;

	CarpetBoostSettingsActivity_$4(CarpetBoostSettingsActivity_ carpetboostsettingsactivity_, ArrayList arraylist, CarpetBoostMode carpetboostmode)
	{
		c = carpetboostsettingsactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field CarpetBoostSettingsActivity_ c>
		a = arraylist;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field ArrayList a>
		b = carpetboostmode;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field CarpetBoostMode b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
