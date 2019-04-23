// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.ads.b;
import com.google.ads.c;

final class lu
{

	static final int a[];
	private static final int b[];

	static 
	{
		a = new int[com.google.ads.b.values().length];
	//    0    0:invokestatic    #17  <Method b[] b.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #19  <Field int[] a>
		try
		{
			a[b.d.ordinal()] = 1;
	//    4    9:getstatic       #19  <Field int[] a>
	//    5   12:getstatic       #23  <Field b b.d>
	//    6   15:invokevirtual   #27  <Method int b.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #19  <Field int[] a>
	//*  10   23:getstatic       #29  <Field b b.a>
	//*  11   26:invokevirtual   #27  <Method int b.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #19  <Field int[] a>
	//*  15   34:getstatic       #32  <Field b b.c>
	//*  16   37:invokevirtual   #27  <Method int b.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #19  <Field int[] a>
	//*  20   45:getstatic       #34  <Field b b.b>
	//*  21   48:invokevirtual   #27  <Method int b.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:invokestatic    #39  <Method c[] c.values()>
	//*  25   56:arraylength     
	//*  26   57:newarray        int[]
	//*  27   59:putstatic       #41  <Field int[] b>
	//*  28   62:getstatic       #41  <Field int[] b>
	//*  29   65:getstatic       #44  <Field c c.c>
	//*  30   68:invokevirtual   #45  <Method int c.ordinal()>
	//*  31   71:iconst_1        
	//*  32   72:iastore         
	//*  33   73:getstatic       #41  <Field int[] b>
	//*  34   76:getstatic       #47  <Field c c.b>
	//*  35   79:invokevirtual   #45  <Method int c.ordinal()>
	//*  36   82:iconst_2        
	//*  37   83:iastore         
	//*  38   84:getstatic       #41  <Field int[] b>
	//*  39   87:getstatic       #49  <Field c c.a>
	//*  40   90:invokevirtual   #45  <Method int c.ordinal()>
	//*  41   93:iconst_3        
	//*  42   94:iastore         
	//*  43   95:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   44   96:astore_0        
		try
		{
			a[b.a.ordinal()] = 2;
		}
	//*  45   97:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   46  100:astore_0        
		try
		{
			a[b.c.ordinal()] = 3;
		}
	//*  47  101:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   48  104:astore_0        
		try
		{
			a[b.b.ordinal()] = 4;
		}
	//*  49  105:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   50  108:astore_0        
		b = new int[c.values().length];
		try
		{
			b[c.c.ordinal()] = 1;
		}
	//*  51  109:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   52  112:astore_0        
		try
		{
			b[c.b.ordinal()] = 2;
		}
	//*  53  113:goto            73
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   54  116:astore_0        
		try
		{
			b[c.a.ordinal()] = 3;
		}
	//*  55  117:goto            84
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   56  120:astore_0        
	//*  57  121:return          
	}
}
