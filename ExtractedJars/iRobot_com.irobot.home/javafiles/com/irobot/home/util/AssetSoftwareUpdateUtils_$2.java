// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;


// Referenced classes of package com.irobot.home.util:
//			AssetSoftwareUpdateUtils_

class AssetSoftwareUpdateUtils_$2
	implements Runnable
{

	public void run()
	{
		AssetSoftwareUpdateUtils_.a(b, a);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field AssetSoftwareUpdateUtils_ b>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field android.content.DialogInterface$OnClickListener a>
	//    4    8:invokestatic    #27  <Method void AssetSoftwareUpdateUtils_.a(AssetSoftwareUpdateUtils_, android.content.DialogInterface$OnClickListener)>
	//    5   11:return          
	}

	final android.content.ner a;
	final AssetSoftwareUpdateUtils_ b;

	AssetSoftwareUpdateUtils_$2(AssetSoftwareUpdateUtils_ assetsoftwareupdateutils_, android.content.ner ner)
	{
		b = assetsoftwareupdateutils_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field AssetSoftwareUpdateUtils_ b>
		a = ner;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field android.content.DialogInterface$OnClickListener a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
