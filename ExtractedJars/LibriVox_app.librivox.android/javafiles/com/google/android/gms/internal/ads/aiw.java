// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			aoi

final class aiw
{

	static final int a[];

	static 
	{
		a = new int[aoi.values().length];
	//    0    0:invokestatic    #16  <Method aoi[] aoi.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #18  <Field int[] a>
		try
		{
			a[aoi.c.ordinal()] = 1;
	//    4    9:getstatic       #18  <Field int[] a>
	//    5   12:getstatic       #22  <Field aoi aoi.c>
	//    6   15:invokevirtual   #26  <Method int aoi.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #18  <Field int[] a>
	//*  10   23:getstatic       #29  <Field aoi aoi.e>
	//*  11   26:invokevirtual   #26  <Method int aoi.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #18  <Field int[] a>
	//*  15   34:getstatic       #32  <Field aoi aoi.b>
	//*  16   37:invokevirtual   #26  <Method int aoi.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #18  <Field int[] a>
	//*  20   45:getstatic       #35  <Field aoi aoi.d>
	//*  21   48:invokevirtual   #26  <Method int aoi.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   25   54:astore_0        
		try
		{
			a[aoi.e.ordinal()] = 2;
		}
	//*  26   55:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   27   58:astore_0        
		try
		{
			a[aoi.b.ordinal()] = 3;
		}
	//*  28   59:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   29   62:astore_0        
		try
		{
			a[aoi.d.ordinal()] = 4;
		}
	//*  30   63:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   31   66:astore_0        
	//*  32   67:return          
	}
}
