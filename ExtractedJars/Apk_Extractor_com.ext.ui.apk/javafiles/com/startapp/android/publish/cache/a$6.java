// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.cache;


// Referenced classes of package com.startapp.android.publish.cache:
//			a

static class a$6
{

	static final int a[];
	static final int b[];

	static 
	{
		b = new int[com.startapp.android.publish.adsCommon.tAppAd.AdMode.values().length];
	//    0    0:invokestatic    #19  <Method com.startapp.android.publish.adsCommon.StartAppAd$AdMode[] com.startapp.android.publish.adsCommon.StartAppAd$AdMode.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] b>
		try
		{
			b[com.startapp.android.publish.adsCommon.tAppAd.AdMode.OFFERWALL.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] b>
	//    5   12:getstatic       #25  <Field com.startapp.android.publish.adsCommon.StartAppAd$AdMode com.startapp.android.publish.adsCommon.StartAppAd$AdMode.OFFERWALL>
	//    6   15:invokevirtual   #29  <Method int com.startapp.android.publish.adsCommon.StartAppAd$AdMode.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #21  <Field int[] b>
	//*  10   23:getstatic       #32  <Field com.startapp.android.publish.adsCommon.StartAppAd$AdMode com.startapp.android.publish.adsCommon.StartAppAd$AdMode.OVERLAY>
	//*  11   26:invokevirtual   #29  <Method int com.startapp.android.publish.adsCommon.StartAppAd$AdMode.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #21  <Field int[] b>
	//*  15   34:getstatic       #35  <Field com.startapp.android.publish.adsCommon.StartAppAd$AdMode com.startapp.android.publish.adsCommon.StartAppAd$AdMode.FULLPAGE>
	//*  16   37:invokevirtual   #29  <Method int com.startapp.android.publish.adsCommon.StartAppAd$AdMode.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #21  <Field int[] b>
	//*  20   45:getstatic       #38  <Field com.startapp.android.publish.adsCommon.StartAppAd$AdMode com.startapp.android.publish.adsCommon.StartAppAd$AdMode.VIDEO>
	//*  21   48:invokevirtual   #29  <Method int com.startapp.android.publish.adsCommon.StartAppAd$AdMode.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #21  <Field int[] b>
	//*  25   56:getstatic       #41  <Field com.startapp.android.publish.adsCommon.StartAppAd$AdMode com.startapp.android.publish.adsCommon.StartAppAd$AdMode.REWARDED_VIDEO>
	//*  26   59:invokevirtual   #29  <Method int com.startapp.android.publish.adsCommon.StartAppAd$AdMode.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #21  <Field int[] b>
	//*  30   67:getstatic       #44  <Field com.startapp.android.publish.adsCommon.StartAppAd$AdMode com.startapp.android.publish.adsCommon.StartAppAd$AdMode.AUTOMATIC>
	//*  31   70:invokevirtual   #29  <Method int com.startapp.android.publish.adsCommon.StartAppAd$AdMode.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:invokestatic    #49  <Method com.startapp.android.publish.common.model.AdPreferences$Placement[] com.startapp.android.publish.common.model.AdPreferences$Placement.values()>
	//*  35   79:arraylength     
	//*  36   80:newarray        int[]
	//*  37   82:putstatic       #51  <Field int[] a>
	//*  38   85:getstatic       #51  <Field int[] a>
	//*  39   88:getstatic       #55  <Field com.startapp.android.publish.common.model.AdPreferences$Placement com.startapp.android.publish.common.model.AdPreferences$Placement.INAPP_SPLASH>
	//*  40   91:invokevirtual   #56  <Method int com.startapp.android.publish.common.model.AdPreferences$Placement.ordinal()>
	//*  41   94:iconst_1        
	//*  42   95:iastore         
	//*  43   96:getstatic       #51  <Field int[] a>
	//*  44   99:getstatic       #59  <Field com.startapp.android.publish.common.model.AdPreferences$Placement com.startapp.android.publish.common.model.AdPreferences$Placement.INAPP_RETURN>
	//*  45  102:invokevirtual   #56  <Method int com.startapp.android.publish.common.model.AdPreferences$Placement.ordinal()>
	//*  46  105:iconst_2        
	//*  47  106:iastore         
	//*  48  107:return          
	//*  49  108:astore_0        
	//*  50  109:return          
	//*  51  110:astore_0        
	//*  52  111:goto            96
	//*  53  114:astore_0        
	//*  54  115:goto            76
	//*  55  118:astore_0        
	//*  56  119:goto            64
	//*  57  122:astore_0        
	//*  58  123:goto            53
	//*  59  126:astore_0        
	//*  60  127:goto            42
	//*  61  130:astore_0        
	//*  62  131:goto            31
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   63  134:astore_0        
		try
		{
			b[com.startapp.android.publish.adsCommon.tAppAd.AdMode.OVERLAY.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror6) { }
		try
		{
			b[com.startapp.android.publish.adsCommon.tAppAd.AdMode.FULLPAGE.ordinal()] = 3;
		}
		catch(NoSuchFieldError nosuchfielderror5) { }
		try
		{
			b[com.startapp.android.publish.adsCommon.tAppAd.AdMode.VIDEO.ordinal()] = 4;
		}
		catch(NoSuchFieldError nosuchfielderror4) { }
		try
		{
			b[com.startapp.android.publish.adsCommon.tAppAd.AdMode.REWARDED_VIDEO.ordinal()] = 5;
		}
		catch(NoSuchFieldError nosuchfielderror3) { }
		try
		{
			b[com.startapp.android.publish.adsCommon.tAppAd.AdMode.AUTOMATIC.ordinal()] = 6;
		}
		catch(NoSuchFieldError nosuchfielderror2) { }
		a = new int[com.startapp.android.publish.common.model.eferences.Placement.values().length];
		try
		{
			a[com.startapp.android.publish.common.model.eferences.Placement.INAPP_SPLASH.ordinal()] = 1;
		}
		catch(NoSuchFieldError nosuchfielderror1) { }
		try
		{
			a[com.startapp.android.publish.common.model.eferences.Placement.INAPP_RETURN.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//*  64  135:goto            20
	}
}
