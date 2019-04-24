// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;

// Referenced classes of package com.irobot.home:
//			MapCustomizationActivity, OneMoreTrainingRunActivity_

class MapCustomizationActivity$13
	implements android.content.ner
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		((a)OneMoreTrainingRunActivity_.a(((android.content.Context) (a))).g(0x4000000)).a();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MapCustomizationActivity a>
	//    2    4:invokestatic    #27  <Method OneMoreTrainingRunActivity_$a OneMoreTrainingRunActivity_.a(android.content.Context)>
	//    3    7:ldc1            #28  <Int 0x4000000>
	//    4    9:invokevirtual   #34  <Method org.androidannotations.api.a.d OneMoreTrainingRunActivity_$a.g(int)>
	//    5   12:checkcast       #30  <Class OneMoreTrainingRunActivity_$a>
	//    6   15:invokevirtual   #37  <Method org.androidannotations.api.a.e OneMoreTrainingRunActivity_$a.a()>
	//    7   18:pop             
	//    8   19:return          
	}

	final MapCustomizationActivity a;

	MapCustomizationActivity$13(MapCustomizationActivity mapcustomizationactivity)
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
