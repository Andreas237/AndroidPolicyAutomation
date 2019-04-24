// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.splash;


// Referenced classes of package com.startapp.android.publish.ads.splash:
//			h

static class h$7
{

	static final int a[];

	static 
	{
		a = new int[shConfig.Orientation.values().length];
	//    0    0:invokestatic    #18  <Method SplashConfig$Orientation[] SplashConfig$Orientation.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] a>
		try
		{
			a[shConfig.Orientation.PORTRAIT.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] a>
	//    5   12:getstatic       #24  <Field SplashConfig$Orientation SplashConfig$Orientation.PORTRAIT>
	//    6   15:invokevirtual   #28  <Method int SplashConfig$Orientation.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] a>
	//*  10   23:getstatic       #31  <Field SplashConfig$Orientation SplashConfig$Orientation.LANDSCAPE>
	//*  11   26:invokevirtual   #28  <Method int SplashConfig$Orientation.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:return          
	//*  15   32:astore_0        
	//*  16   33:return          
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   34:astore_0        
		try
		{
			a[shConfig.Orientation.LANDSCAPE.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//*  18   35:goto            20
	}
}
