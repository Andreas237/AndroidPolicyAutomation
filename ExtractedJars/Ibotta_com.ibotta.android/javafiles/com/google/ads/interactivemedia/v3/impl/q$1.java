// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;


// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			q

static class q$1
{

	static final int a[];

	static 
	{
		a = new int[com.google.ads.interactivemedia.v3.api.ent.AdEventType.values().length];
	//    0    0:invokestatic    #18  <Method com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType[] com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] a>
		try
		{
			a[com.google.ads.interactivemedia.v3.api.ent.AdEventType.LOADED.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] a>
	//    5   12:getstatic       #24  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.LOADED>
	//    6   15:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] a>
	//*  10   23:getstatic       #31  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.STARTED>
	//*  11   26:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] a>
	//*  15   34:getstatic       #34  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.COMPLETED>
	//*  16   37:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] a>
	//*  20   45:getstatic       #37  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.SKIPPED>
	//*  21   48:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #20  <Field int[] a>
	//*  25   56:getstatic       #40  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.CONTENT_PAUSE_REQUESTED>
	//*  26   59:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #20  <Field int[] a>
	//*  30   67:getstatic       #43  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.CONTENT_RESUME_REQUESTED>
	//*  31   70:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:getstatic       #20  <Field int[] a>
	//*  35   79:getstatic       #46  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.CLICKED>
	//*  36   82:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
	//*  37   85:bipush          7
	//*  38   87:iastore         
	//*  39   88:getstatic       #20  <Field int[] a>
	//*  40   91:getstatic       #49  <Field com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ICON_TAPPED>
	//*  41   94:invokevirtual   #28  <Method int com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType.ordinal()>
	//*  42   97:bipush          8
	//*  43   99:iastore         
	//*  44  100:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   45  101:astore_0        
		try
		{
			a[com.google.ads.interactivemedia.v3.api.ent.AdEventType.STARTED.ordinal()] = 2;
		}
	//*  46  102:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   47  105:astore_0        
		try
		{
			a[com.google.ads.interactivemedia.v3.api.ent.AdEventType.COMPLETED.ordinal()] = 3;
		}
	//*  48  106:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   49  109:astore_0        
		try
		{
			a[com.google.ads.interactivemedia.v3.api.ent.AdEventType.SKIPPED.ordinal()] = 4;
		}
	//*  50  110:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   51  113:astore_0        
		try
		{
			a[com.google.ads.interactivemedia.v3.api.ent.AdEventType.CONTENT_PAUSE_REQUESTED.ordinal()] = 5;
		}
	//*  52  114:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   53  117:astore_0        
		try
		{
			a[com.google.ads.interactivemedia.v3.api.ent.AdEventType.CONTENT_RESUME_REQUESTED.ordinal()] = 6;
		}
	//*  54  118:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   55  121:astore_0        
		try
		{
			a[com.google.ads.interactivemedia.v3.api.ent.AdEventType.CLICKED.ordinal()] = 7;
		}
	//*  56  122:goto            76
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   57  125:astore_0        
		try
		{
			a[com.google.ads.interactivemedia.v3.api.ent.AdEventType.ICON_TAPPED.ordinal()] = 8;
		}
	//*  58  126:goto            88
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   59  129:astore_0        
	//*  60  130:return          
	}
}
