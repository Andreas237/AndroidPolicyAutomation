// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import com.irobot.core.NetworkType;

// Referenced classes of package com.irobot.home.model:
//			IRobotModel

static class IRobotModel$2
{

	static final int a[];

	static 
	{
		a = new int[NetworkType.values().length];
	//    0    0:invokestatic    #18  <Method NetworkType[] NetworkType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] a>
		try
		{
			a[NetworkType.Local.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] a>
	//    5   12:getstatic       #24  <Field NetworkType NetworkType.Local>
	//    6   15:invokevirtual   #28  <Method int NetworkType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] a>
	//*  10   23:getstatic       #31  <Field NetworkType NetworkType.Remote>
	//*  11   26:invokevirtual   #28  <Method int NetworkType.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   15   32:astore_0        
		try
		{
			a[NetworkType.Remote.ordinal()] = 2;
		}
	//*  16   33:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   36:astore_0        
	//*  18   37:return          
	}
}
