// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.content.DialogInterface;
import com.irobot.core.UpdateUIService;

// Referenced classes of package com.irobot.home.fragments:
//			SoftwareUpdateAvailableFragment

class SoftwareUpdateAvailableFragment$1
	implements android.content.DialogInterface.OnClickListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		SoftwareUpdateAvailableFragment.a(a).requestExpeditedOta();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SoftwareUpdateAvailableFragment a>
	//    2    4:invokestatic    #24  <Method UpdateUIService SoftwareUpdateAvailableFragment.a(SoftwareUpdateAvailableFragment)>
	//    3    7:invokevirtual   #30  <Method boolean UpdateUIService.requestExpeditedOta()>
	//    4   10:pop             
		SoftwareUpdateAvailableFragment.b(a).b(false);
	//    5   11:aload_0         
	//    6   12:getfield        #16  <Field SoftwareUpdateAvailableFragment a>
	//    7   15:invokestatic    #34  <Method SoftwareUpdateAvailableFragment$a SoftwareUpdateAvailableFragment.b(SoftwareUpdateAvailableFragment)>
	//    8   18:iconst_0        
	//    9   19:invokeinterface #39  <Method void SoftwareUpdateAvailableFragment$a.b(boolean)>
		SoftwareUpdateAvailableFragment.c(a);
	//   10   24:aload_0         
	//   11   25:getfield        #16  <Field SoftwareUpdateAvailableFragment a>
	//   12   28:invokestatic    #42  <Method void SoftwareUpdateAvailableFragment.c(SoftwareUpdateAvailableFragment)>
	//   13   31:return          
	}

	final SoftwareUpdateAvailableFragment a;

	SoftwareUpdateAvailableFragment$1(SoftwareUpdateAvailableFragment softwareupdateavailablefragment)
	{
		a = softwareupdateavailablefragment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field SoftwareUpdateAvailableFragment a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
