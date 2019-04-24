// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.b;


// Referenced classes of package com.irobot.home.b:
//			c, b

static class c$4
{

	static final int a[];

	static 
	{
		a = new int[b.values().length];
	//    0    0:invokestatic    #18  <Method b[] b.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] a>
		try
		{
			a[b.PAGE_ONE.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] a>
	//    5   12:getstatic       #24  <Field b b.PAGE_ONE>
	//    6   15:invokevirtual   #28  <Method int b.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] a>
	//*  10   23:getstatic       #31  <Field b b.PAGE_TWO>
	//*  11   26:invokevirtual   #28  <Method int b.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] a>
	//*  15   34:getstatic       #34  <Field b b.PAGE_THREE>
	//*  16   37:invokevirtual   #28  <Method int b.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   20   43:astore_0        
		try
		{
			a[b.PAGE_TWO.ordinal()] = 2;
		}
	//*  21   44:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   22   47:astore_0        
		try
		{
			a[b.PAGE_THREE.ordinal()] = 3;
		}
	//*  23   48:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   51:astore_0        
	//*  25   52:return          
	}
}
