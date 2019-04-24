// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;


// Referenced classes of package com.irobot.home.util:
//			AssetSoftwareUpdateUtils_

class AssetSoftwareUpdateUtils_$1
	implements Runnable
{

	public void run()
	{
		AssetSoftwareUpdateUtils_.a(c, a, b);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AssetSoftwareUpdateUtils_ c>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field android.content.DialogInterface$OnClickListener a>
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field android.content.DialogInterface$OnClickListener b>
	//    6   12:invokestatic    #30  <Method void AssetSoftwareUpdateUtils_.a(AssetSoftwareUpdateUtils_, android.content.DialogInterface$OnClickListener, android.content.DialogInterface$OnClickListener)>
	//    7   15:return          
	}

	final android.content.ner a;
	final android.content.ner b;
	final AssetSoftwareUpdateUtils_ c;

	AssetSoftwareUpdateUtils_$1(AssetSoftwareUpdateUtils_ assetsoftwareupdateutils_, android.content.ner ner, android.content.ner ner1)
	{
		c = assetsoftwareupdateutils_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AssetSoftwareUpdateUtils_ c>
		a = ner;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field android.content.DialogInterface$OnClickListener a>
		b = ner1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field android.content.DialogInterface$OnClickListener b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #26  <Method void Object()>
	//   11   19:return          
	}
}
