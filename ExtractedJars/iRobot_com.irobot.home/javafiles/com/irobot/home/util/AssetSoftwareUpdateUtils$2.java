// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;

import android.content.DialogInterface;

// Referenced classes of package com.irobot.home.util:
//			AssetSoftwareUpdateUtils

class AssetSoftwareUpdateUtils$2
	implements android.content.stener
{

	public void onDismiss(DialogInterface dialoginterface)
	{
		AssetSoftwareUpdateUtils.a(a, false);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AssetSoftwareUpdateUtils a>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #26  <Method boolean AssetSoftwareUpdateUtils.a(AssetSoftwareUpdateUtils, boolean)>
	//    4    8:pop             
	//    5    9:return          
	}

	final AssetSoftwareUpdateUtils a;

	AssetSoftwareUpdateUtils$2(AssetSoftwareUpdateUtils assetsoftwareupdateutils)
	{
		a = assetsoftwareupdateutils;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AssetSoftwareUpdateUtils a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
