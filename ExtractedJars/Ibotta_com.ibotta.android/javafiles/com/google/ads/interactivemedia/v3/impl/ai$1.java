// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;


// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			ai

static class ai$1
{

	static final int a[];

	static 
	{
		a = new int[com.google.ads.interactivemedia.v3.api.nt.AdEventType.values().length];
	//    0    0:invokestatic    #18  <Method com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType[] com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] a>
		try
		{
			a[com.google.ads.interactivemedia.v3.api.nt.AdEventType.AD_BREAK_STARTED.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] a>
	//    5   12:getstatic       #24  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.AD_BREAK_STARTED>
	//    6   15:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] a>
	//*  10   23:getstatic       #31  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.AD_BREAK_ENDED>
	//*  11   26:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] a>
	//*  15   34:getstatic       #34  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.CUEPOINTS_CHANGED>
	//*  16   37:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] a>
	//*  20   45:getstatic       #37  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.AD_PROGRESS>
	//*  21   48:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   25   54:astore_0        
		try
		{
			a[com.google.ads.interactivemedia.v3.api.nt.AdEventType.AD_BREAK_ENDED.ordinal()] = 2;
		}
	//*  26   55:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   27   58:astore_0        
		try
		{
			a[com.google.ads.interactivemedia.v3.api.nt.AdEventType.CUEPOINTS_CHANGED.ordinal()] = 3;
		}
	//*  28   59:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   29   62:astore_0        
		try
		{
			a[com.google.ads.interactivemedia.v3.api.nt.AdEventType.AD_PROGRESS.ordinal()] = 4;
		}
	//*  30   63:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   31   66:astore_0        
	//*  32   67:return          
	}
}
