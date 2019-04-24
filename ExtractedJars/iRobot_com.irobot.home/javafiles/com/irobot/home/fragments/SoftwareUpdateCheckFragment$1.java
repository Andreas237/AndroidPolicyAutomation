// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import com.irobot.core.UpdateUIService;

// Referenced classes of package com.irobot.home.fragments:
//			SoftwareUpdateCheckFragment

class SoftwareUpdateCheckFragment$1
	implements Runnable
{

	public void run()
	{
		SoftwareUpdateCheckFragment.a(b, true);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field SoftwareUpdateCheckFragment b>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #28  <Method boolean SoftwareUpdateCheckFragment.a(SoftwareUpdateCheckFragment, boolean)>
	//    4    8:pop             
		a.queryForSoftwareUpdate();
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field UpdateUIService a>
	//    7   13:invokevirtual   #33  <Method void UpdateUIService.queryForSoftwareUpdate()>
	//    8   16:return          
	}

	final UpdateUIService a;
	final SoftwareUpdateCheckFragment b;

	SoftwareUpdateCheckFragment$1(SoftwareUpdateCheckFragment softwareupdatecheckfragment, UpdateUIService updateuiservice)
	{
		b = softwareupdatecheckfragment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field SoftwareUpdateCheckFragment b>
		a = updateuiservice;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field UpdateUIService a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
