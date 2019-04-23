// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.enums;


// Referenced classes of package com.appboy.enums:
//			AppStore

static class AppStore$1
{

	static final int a[];

	static 
	{
		a = new int[AppStore.values().length];
	//    0    0:invokestatic    #16  <Method AppStore[] AppStore.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #18  <Field int[] a>
		try
		{
			a[AppStore.GOOGLE_PLAY_STORE.ordinal()] = 1;
	//    4    9:getstatic       #18  <Field int[] a>
	//    5   12:getstatic       #22  <Field AppStore AppStore.GOOGLE_PLAY_STORE>
	//    6   15:invokevirtual   #26  <Method int AppStore.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #18  <Field int[] a>
	//*  10   23:getstatic       #29  <Field AppStore AppStore.KINDLE_STORE>
	//*  11   26:invokevirtual   #26  <Method int AppStore.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   15   32:astore_0        
		try
		{
			a[AppStore.KINDLE_STORE.ordinal()] = 2;
		}
	//*  16   33:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   36:astore_0        
	//*  18   37:return          
	}
}
