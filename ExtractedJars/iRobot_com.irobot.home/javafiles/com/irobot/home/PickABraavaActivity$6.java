// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.irobot.home:
//			PickABraavaActivity

class PickABraavaActivity$6
	implements android.content.kListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		dialoginterface = ((DialogInterface) (new Intent("android.settings.LOCATION_SOURCE_SETTINGS")));
	//    0    0:new             #24  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "android.settings.LOCATION_SOURCE_SETTINGS">
	//    3    6:invokespecial   #29  <Method void Intent(String)>
	//    4    9:astore_1        
		a.startActivityForResult(((Intent) (dialoginterface)), 0);
	//    5   10:aload_0         
	//    6   11:getfield        #17  <Field PickABraavaActivity a>
	//    7   14:aload_1         
	//    8   15:iconst_0        
	//    9   16:invokevirtual   #33  <Method void PickABraavaActivity.startActivityForResult(Intent, int)>
	//   10   19:return          
	}

	final PickABraavaActivity a;

	PickABraavaActivity$6(PickABraavaActivity pickabraavaactivity)
	{
		a = pickabraavaactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field PickABraavaActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
