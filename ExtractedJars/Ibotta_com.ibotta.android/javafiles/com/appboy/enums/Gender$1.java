// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.enums;


// Referenced classes of package com.appboy.enums:
//			Gender

static class Gender$1
{

	static final int a[];

	static 
	{
		a = new int[Gender.values().length];
	//    0    0:invokestatic    #16  <Method Gender[] Gender.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #18  <Field int[] a>
		try
		{
			a[Gender.MALE.ordinal()] = 1;
	//    4    9:getstatic       #18  <Field int[] a>
	//    5   12:getstatic       #22  <Field Gender Gender.MALE>
	//    6   15:invokevirtual   #26  <Method int Gender.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #18  <Field int[] a>
	//*  10   23:getstatic       #29  <Field Gender Gender.FEMALE>
	//*  11   26:invokevirtual   #26  <Method int Gender.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #18  <Field int[] a>
	//*  15   34:getstatic       #32  <Field Gender Gender.OTHER>
	//*  16   37:invokevirtual   #26  <Method int Gender.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #18  <Field int[] a>
	//*  20   45:getstatic       #35  <Field Gender Gender.UNKNOWN>
	//*  21   48:invokevirtual   #26  <Method int Gender.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #18  <Field int[] a>
	//*  25   56:getstatic       #38  <Field Gender Gender.NOT_APPLICABLE>
	//*  26   59:invokevirtual   #26  <Method int Gender.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #18  <Field int[] a>
	//*  30   67:getstatic       #41  <Field Gender Gender.PREFER_NOT_TO_SAY>
	//*  31   70:invokevirtual   #26  <Method int Gender.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   35   77:astore_0        
		try
		{
			a[Gender.FEMALE.ordinal()] = 2;
		}
	//*  36   78:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   37   81:astore_0        
		try
		{
			a[Gender.OTHER.ordinal()] = 3;
		}
	//*  38   82:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   39   85:astore_0        
		try
		{
			a[Gender.UNKNOWN.ordinal()] = 4;
		}
	//*  40   86:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   41   89:astore_0        
		try
		{
			a[Gender.NOT_APPLICABLE.ordinal()] = 5;
		}
	//*  42   90:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   43   93:astore_0        
		try
		{
			a[Gender.PREFER_NOT_TO_SAY.ordinal()] = 6;
		}
	//*  44   94:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   45   97:astore_0        
	//*  46   98:return          
	}
}
