// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.View;

// Referenced classes of package com.irobot.home:
//			MapCustomizationActivity, TroubleshootPersistentMapActivity_

class MapCustomizationActivity$23
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		TroubleshootPersistentMapActivity_.a(((android.content.Context) (a))).b(a.d).a();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MapCustomizationActivity a>
	//    2    4:invokestatic    #27  <Method TroubleshootPersistentMapActivity_$a TroubleshootPersistentMapActivity_.a(android.content.Context)>
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field MapCustomizationActivity a>
	//    5   11:getfield        #31  <Field int MapCustomizationActivity.d>
	//    6   14:invokevirtual   #37  <Method TroubleshootPersistentMapActivity_$a TroubleshootPersistentMapActivity_$a.b(int)>
	//    7   17:invokevirtual   #40  <Method org.androidannotations.api.a.e TroubleshootPersistentMapActivity_$a.a()>
	//    8   20:pop             
	//    9   21:return          
	}

	final MapCustomizationActivity a;

	MapCustomizationActivity$23(MapCustomizationActivity mapcustomizationactivity)
	{
		a = mapcustomizationactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MapCustomizationActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
