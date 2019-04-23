// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			apc, apd

final class apb
{

	static final int a[];
	static final int b[];

	static 
	{
		b = new int[apc.values().length];
	//    0    0:invokestatic    #17  <Method apc[] apc.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #19  <Field int[] b>
		try
		{
			b[apc.a.ordinal()] = 1;
	//    4    9:getstatic       #19  <Field int[] b>
	//    5   12:getstatic       #22  <Field apc apc.a>
	//    6   15:invokevirtual   #26  <Method int apc.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #19  <Field int[] b>
	//*  10   23:getstatic       #28  <Field apc apc.b>
	//*  11   26:invokevirtual   #26  <Method int apc.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #19  <Field int[] b>
	//*  15   34:getstatic       #31  <Field apc apc.c>
	//*  16   37:invokevirtual   #26  <Method int apc.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:invokestatic    #36  <Method apd[] apd.values()>
	//*  20   45:arraylength     
	//*  21   46:newarray        int[]
	//*  22   48:putstatic       #38  <Field int[] a>
	//*  23   51:getstatic       #38  <Field int[] a>
	//*  24   54:getstatic       #41  <Field apd apd.a>
	//*  25   57:invokevirtual   #42  <Method int apd.ordinal()>
	//*  26   60:iconst_1        
	//*  27   61:iastore         
	//*  28   62:getstatic       #38  <Field int[] a>
	//*  29   65:getstatic       #44  <Field apd apd.c>
	//*  30   68:invokevirtual   #42  <Method int apd.ordinal()>
	//*  31   71:iconst_2        
	//*  32   72:iastore         
	//*  33   73:getstatic       #38  <Field int[] a>
	//*  34   76:getstatic       #46  <Field apd apd.b>
	//*  35   79:invokevirtual   #42  <Method int apd.ordinal()>
	//*  36   82:iconst_3        
	//*  37   83:iastore         
	//*  38   84:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   39   85:astore_0        
		try
		{
			b[apc.b.ordinal()] = 2;
		}
	//*  40   86:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   41   89:astore_0        
		try
		{
			b[apc.c.ordinal()] = 3;
		}
	//*  42   90:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   43   93:astore_0        
		a = new int[apd.values().length];
		try
		{
			a[apd.a.ordinal()] = 1;
		}
	//*  44   94:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   45   97:astore_0        
		try
		{
			a[apd.c.ordinal()] = 2;
		}
	//*  46   98:goto            62
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   47  101:astore_0        
		try
		{
			a[apd.b.ordinal()] = 3;
		}
	//*  48  102:goto            73
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   49  105:astore_0        
	//*  50  106:return          
	}
}
