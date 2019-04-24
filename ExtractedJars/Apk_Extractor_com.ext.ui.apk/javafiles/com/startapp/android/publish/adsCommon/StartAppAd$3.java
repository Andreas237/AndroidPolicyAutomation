// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;


// Referenced classes of package com.startapp.android.publish.adsCommon:
//			StartAppAd

static class StartAppAd$3
{

	static final int a[];

	static 
	{
		a = new int[Mode.values().length];
	//    0    0:invokestatic    #18  <Method StartAppAd$AdMode[] StartAppAd$AdMode.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] a>
		try
		{
			a[Mode.FULLPAGE.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] a>
	//    5   12:getstatic       #24  <Field StartAppAd$AdMode StartAppAd$AdMode.FULLPAGE>
	//    6   15:invokevirtual   #28  <Method int StartAppAd$AdMode.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] a>
	//*  10   23:getstatic       #31  <Field StartAppAd$AdMode StartAppAd$AdMode.OFFERWALL>
	//*  11   26:invokevirtual   #28  <Method int StartAppAd$AdMode.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] a>
	//*  15   34:getstatic       #34  <Field StartAppAd$AdMode StartAppAd$AdMode.OVERLAY>
	//*  16   37:invokevirtual   #28  <Method int StartAppAd$AdMode.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] a>
	//*  20   45:getstatic       #37  <Field StartAppAd$AdMode StartAppAd$AdMode.REWARDED_VIDEO>
	//*  21   48:invokevirtual   #28  <Method int StartAppAd$AdMode.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:return          
	//*  25   54:astore_0        
	//*  26   55:return          
	//*  27   56:astore_0        
	//*  28   57:goto            42
	//*  29   60:astore_0        
	//*  30   61:goto            31
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   31   64:astore_0        
		try
		{
			a[Mode.OFFERWALL.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror2) { }
		try
		{
			a[Mode.OVERLAY.ordinal()] = 3;
		}
		catch(NoSuchFieldError nosuchfielderror1) { }
		try
		{
			a[Mode.REWARDED_VIDEO.ordinal()] = 4;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//*  32   65:goto            20
	}
}
