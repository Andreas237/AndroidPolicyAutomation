// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			ed

static class ed$4
{

	static final int a[];

	static 
	{
		a = new int[ed$e.values().length];
	//    0    0:invokestatic    #18  <Method ed$e[] ed$e.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] a>
		try
		{
			a[ed$e.b.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] a>
	//    5   12:getstatic       #24  <Field ed$e ed$e.b>
	//    6   15:invokevirtual   #28  <Method int ed$e.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:goto            24
		catch(NoSuchFieldError nosuchfielderror) { }
	//   10   23:astore_0        
		try
		{
			a[ed$e.c.ordinal()] = 2;
	//   11   24:getstatic       #20  <Field int[] a>
	//   12   27:getstatic       #31  <Field ed$e ed$e.c>
	//   13   30:invokevirtual   #28  <Method int ed$e.ordinal()>
	//   14   33:iconst_2        
	//   15   34:iastore         
	//   16   35:return          
		}
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   36:astore_0        
	//*  18   37:return          
	}
}
