// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;

import android.content.DialogInterface;

// Referenced classes of package com.irobot.home.util:
//			AssetSoftwareUpdateUtils

class AssetSoftwareUpdateUtils$1
	implements android.content.ener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		b.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field AssetSoftwareUpdateUtils b>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field android.content.DialogInterface$OnClickListener a>
	//    4    8:invokevirtual   #29  <Method void AssetSoftwareUpdateUtils.a(android.content.DialogInterface$OnClickListener)>
	//    5   11:return          
	}

	final android.content.ener a;
	final AssetSoftwareUpdateUtils b;

	AssetSoftwareUpdateUtils$1(AssetSoftwareUpdateUtils assetsoftwareupdateutils, android.content.ener ener)
	{
		b = assetsoftwareupdateutils;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field AssetSoftwareUpdateUtils b>
		a = ener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field android.content.DialogInterface$OnClickListener a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
