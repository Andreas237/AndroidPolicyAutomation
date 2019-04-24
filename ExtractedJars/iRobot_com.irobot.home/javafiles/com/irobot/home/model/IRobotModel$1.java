// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import com.irobot.core.AssetInfo;
import java.util.Comparator;

// Referenced classes of package com.irobot.home.model:
//			IRobotModel, a

class IRobotModel$1
	implements Comparator
{

	public int a(a a1, a a2)
	{
		return a1.a().getName().toLowerCase().compareTo(a2.a().getName().toLowerCase());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #25  <Method AssetInfo a.a()>
	//    2    4:invokevirtual   #31  <Method String AssetInfo.getName()>
	//    3    7:invokevirtual   #36  <Method String String.toLowerCase()>
	//    4   10:aload_2         
	//    5   11:invokevirtual   #25  <Method AssetInfo a.a()>
	//    6   14:invokevirtual   #31  <Method String AssetInfo.getName()>
	//    7   17:invokevirtual   #36  <Method String String.toLowerCase()>
	//    8   20:invokevirtual   #40  <Method int String.compareTo(String)>
	//    9   23:ireturn         
	}

	public int compare(Object obj, Object obj1)
	{
		return a((a)obj, (a)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #22  <Class a>
	//    3    5:aload_2         
	//    4    6:checkcast       #22  <Class a>
	//    5    9:invokevirtual   #44  <Method int a(a, a)>
	//    6   12:ireturn         
	}

	final IRobotModel a;

	IRobotModel$1(IRobotModel irobotmodel)
	{
		a = irobotmodel;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field IRobotModel a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
