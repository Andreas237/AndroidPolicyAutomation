// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			asm

final class anq
{

	static final int a[];

	static 
	{
		a = new int[asm.a().length];
	//    0    0:invokestatic    #15  <Method int[] asm.a()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #17  <Field int[] a>
		try
		{
			a[asm.d - 1] = 1;
	//    4    9:getstatic       #17  <Field int[] a>
	//    5   12:getstatic       #21  <Field int asm.d>
	//    6   15:iconst_1        
	//    7   16:isub            
	//    8   17:iconst_1        
	//    9   18:iastore         
		}
	//*  10   19:getstatic       #17  <Field int[] a>
	//*  11   22:getstatic       #24  <Field int asm.e>
	//*  12   25:iconst_1        
	//*  13   26:isub            
	//*  14   27:iconst_2        
	//*  15   28:iastore         
	//*  16   29:getstatic       #17  <Field int[] a>
	//*  17   32:getstatic       #27  <Field int asm.c>
	//*  18   35:iconst_1        
	//*  19   36:isub            
	//*  20   37:iconst_3        
	//*  21   38:iastore         
	//*  22   39:getstatic       #17  <Field int[] a>
	//*  23   42:getstatic       #30  <Field int asm.f>
	//*  24   45:iconst_1        
	//*  25   46:isub            
	//*  26   47:iconst_4        
	//*  27   48:iastore         
	//*  28   49:getstatic       #17  <Field int[] a>
	//*  29   52:getstatic       #33  <Field int asm.g>
	//*  30   55:iconst_1        
	//*  31   56:isub            
	//*  32   57:iconst_5        
	//*  33   58:iastore         
	//*  34   59:getstatic       #17  <Field int[] a>
	//*  35   62:getstatic       #35  <Field int asm.a>
	//*  36   65:iconst_1        
	//*  37   66:isub            
	//*  38   67:bipush          6
	//*  39   69:iastore         
	//*  40   70:getstatic       #17  <Field int[] a>
	//*  41   73:getstatic       #38  <Field int asm.b>
	//*  42   76:iconst_1        
	//*  43   77:isub            
	//*  44   78:bipush          7
	//*  45   80:iastore         
	//*  46   81:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   47   82:astore_0        
		try
		{
			a[asm.e - 1] = 2;
		}
	//*  48   83:goto            19
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   49   86:astore_0        
		try
		{
			a[asm.c - 1] = 3;
		}
	//*  50   87:goto            29
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   51   90:astore_0        
		try
		{
			a[asm.f - 1] = 4;
		}
	//*  52   91:goto            39
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   53   94:astore_0        
		try
		{
			a[asm.g - 1] = 5;
		}
	//*  54   95:goto            49
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   55   98:astore_0        
		try
		{
			a[asm.a - 1] = 6;
		}
	//*  56   99:goto            59
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   57  102:astore_0        
		try
		{
			a[asm.b - 1] = 7;
		}
	//*  58  103:goto            70
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   59  106:astore_0        
	//*  60  107:return          
	}
}
