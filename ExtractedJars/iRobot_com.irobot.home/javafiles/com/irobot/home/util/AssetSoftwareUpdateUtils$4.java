// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;

import android.content.DialogInterface;
import com.irobot.home.WebViewActivity_;

// Referenced classes of package com.irobot.home.util:
//			AssetSoftwareUpdateUtils

class AssetSoftwareUpdateUtils$4
	implements android.content.ener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		WebViewActivity_.a(((android.content.Context) (a.a))).a(AssetSoftwareUpdateUtils.a(a)).a(Integer.valueOf(0x7f0f05d8)).a();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AssetSoftwareUpdateUtils a>
	//    2    4:getfield        #26  <Field android.app.Activity AssetSoftwareUpdateUtils.a>
	//    3    7:invokestatic    #31  <Method com.irobot.home.WebViewActivity_$a WebViewActivity_.a(android.content.Context)>
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field AssetSoftwareUpdateUtils a>
	//    6   14:invokestatic    #34  <Method String AssetSoftwareUpdateUtils.a(AssetSoftwareUpdateUtils)>
	//    7   17:invokevirtual   #39  <Method com.irobot.home.WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(String)>
	//    8   20:ldc1            #40  <Int 0x7f0f05d8>
	//    9   22:invokestatic    #46  <Method Integer Integer.valueOf(int)>
	//   10   25:invokevirtual   #49  <Method com.irobot.home.WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(Integer)>
	//   11   28:invokevirtual   #52  <Method org.androidannotations.api.a.e com.irobot.home.WebViewActivity_$a.a()>
	//   12   31:pop             
	//   13   32:return          
	}

	final AssetSoftwareUpdateUtils a;

	AssetSoftwareUpdateUtils$4(AssetSoftwareUpdateUtils assetsoftwareupdateutils)
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
