// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			bd

static class bd$3
{

	static final int a[];

	static 
	{
		a = new int[ce$a.values().length];
	//    0    0:invokestatic    #18  <Method ce$a[] ce$a.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] a>
		try
		{
			a[ce$a.a.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] a>
	//    5   12:getstatic       #23  <Field ce$a ce$a.a>
	//    6   15:invokevirtual   #27  <Method int ce$a.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:goto            24
		catch(NoSuchFieldError nosuchfielderror) { }
	//   10   23:astore_0        
		try
		{
			a[ce$a.c.ordinal()] = 2;
	//   11   24:getstatic       #20  <Field int[] a>
	//   12   27:getstatic       #30  <Field ce$a ce$a.c>
	//   13   30:invokevirtual   #27  <Method int ce$a.ordinal()>
	//   14   33:iconst_2        
	//   15   34:iastore         
		}
	//*  16   35:goto            39
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   38:astore_0        
		try
		{
			a[ce$a.b.ordinal()] = 3;
	//   18   39:getstatic       #20  <Field int[] a>
	//   19   42:getstatic       #33  <Field ce$a ce$a.b>
	//   20   45:invokevirtual   #27  <Method int ce$a.ordinal()>
	//   21   48:iconst_3        
	//   22   49:iastore         
	//   23   50:return          
		}
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   51:astore_0        
	//*  25   52:return          
	}
}
