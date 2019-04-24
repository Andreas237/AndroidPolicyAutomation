// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


final class zzzd
{

	private static final int zzbvf[];
	static final int zzbvg[];

	static 
	{
		zzbvg = new int[com.google.ads.AdRequest.ErrorCode.values().length];
	//    0    0:invokestatic    #17  <Method com.google.ads.AdRequest$ErrorCode[] com.google.ads.AdRequest$ErrorCode.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #19  <Field int[] zzbvg>
		try
		{
			zzbvg[com.google.ads.AdRequest.ErrorCode.INTERNAL_ERROR.ordinal()] = 1;
	//    4    9:getstatic       #19  <Field int[] zzbvg>
	//    5   12:getstatic       #23  <Field com.google.ads.AdRequest$ErrorCode com.google.ads.AdRequest$ErrorCode.INTERNAL_ERROR>
	//    6   15:invokevirtual   #27  <Method int com.google.ads.AdRequest$ErrorCode.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #19  <Field int[] zzbvg>
	//*  10   23:getstatic       #30  <Field com.google.ads.AdRequest$ErrorCode com.google.ads.AdRequest$ErrorCode.INVALID_REQUEST>
	//*  11   26:invokevirtual   #27  <Method int com.google.ads.AdRequest$ErrorCode.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #19  <Field int[] zzbvg>
	//*  15   34:getstatic       #33  <Field com.google.ads.AdRequest$ErrorCode com.google.ads.AdRequest$ErrorCode.NETWORK_ERROR>
	//*  16   37:invokevirtual   #27  <Method int com.google.ads.AdRequest$ErrorCode.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #19  <Field int[] zzbvg>
	//*  20   45:getstatic       #36  <Field com.google.ads.AdRequest$ErrorCode com.google.ads.AdRequest$ErrorCode.NO_FILL>
	//*  21   48:invokevirtual   #27  <Method int com.google.ads.AdRequest$ErrorCode.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:invokestatic    #41  <Method com.google.ads.AdRequest$Gender[] com.google.ads.AdRequest$Gender.values()>
	//*  25   56:arraylength     
	//*  26   57:newarray        int[]
	//*  27   59:putstatic       #43  <Field int[] zzbvf>
	//*  28   62:getstatic       #43  <Field int[] zzbvf>
	//*  29   65:getstatic       #47  <Field com.google.ads.AdRequest$Gender com.google.ads.AdRequest$Gender.FEMALE>
	//*  30   68:invokevirtual   #48  <Method int com.google.ads.AdRequest$Gender.ordinal()>
	//*  31   71:iconst_1        
	//*  32   72:iastore         
	//*  33   73:getstatic       #43  <Field int[] zzbvf>
	//*  34   76:getstatic       #51  <Field com.google.ads.AdRequest$Gender com.google.ads.AdRequest$Gender.MALE>
	//*  35   79:invokevirtual   #48  <Method int com.google.ads.AdRequest$Gender.ordinal()>
	//*  36   82:iconst_2        
	//*  37   83:iastore         
	//*  38   84:getstatic       #43  <Field int[] zzbvf>
	//*  39   87:getstatic       #54  <Field com.google.ads.AdRequest$Gender com.google.ads.AdRequest$Gender.UNKNOWN>
	//*  40   90:invokevirtual   #48  <Method int com.google.ads.AdRequest$Gender.ordinal()>
	//*  41   93:iconst_3        
	//*  42   94:iastore         
	//*  43   95:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   44   96:astore_0        
		try
		{
			zzbvg[com.google.ads.AdRequest.ErrorCode.INVALID_REQUEST.ordinal()] = 2;
		}
	//*  45   97:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   46  100:astore_0        
		try
		{
			zzbvg[com.google.ads.AdRequest.ErrorCode.NETWORK_ERROR.ordinal()] = 3;
		}
	//*  47  101:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   48  104:astore_0        
		try
		{
			zzbvg[com.google.ads.AdRequest.ErrorCode.NO_FILL.ordinal()] = 4;
		}
	//*  49  105:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   50  108:astore_0        
		zzbvf = new int[com.google.ads.AdRequest.Gender.values().length];
		try
		{
			zzbvf[com.google.ads.AdRequest.Gender.FEMALE.ordinal()] = 1;
		}
	//*  51  109:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   52  112:astore_0        
		try
		{
			zzbvf[com.google.ads.AdRequest.Gender.MALE.ordinal()] = 2;
		}
	//*  53  113:goto            73
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   54  116:astore_0        
		try
		{
			zzbvf[com.google.ads.AdRequest.Gender.UNKNOWN.ordinal()] = 3;
		}
	//*  55  117:goto            84
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   56  120:astore_0        
	//*  57  121:return          
	}
}
