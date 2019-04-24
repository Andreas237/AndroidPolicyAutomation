// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import com.irobot.core.FloorPlanListItemMode;
import java.util.HashSet;

// Referenced classes of package com.irobot.home.fragments:
//			be

class be$13 extends HashSet
{

	final be a;

	be$13(be be1)
	{
		a = be1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field be a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void HashSet()>
		add(((Object) (FloorPlanListItemMode.All)));
	//    5    9:aload_0         
	//    6   10:getstatic       #24  <Field FloorPlanListItemMode FloorPlanListItemMode.All>
	//    7   13:invokevirtual   #28  <Method boolean add(Object)>
	//    8   16:pop             
	//    9   17:return          
	}
}
