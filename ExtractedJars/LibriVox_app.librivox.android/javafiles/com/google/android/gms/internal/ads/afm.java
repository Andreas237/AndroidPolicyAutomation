// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


final class afm
{

	static final int a[];

	static 
	{
		a = new int[android.webkit.ConsoleMessage.MessageLevel.values().length];
	//    0    0:invokestatic    #16  <Method android.webkit.ConsoleMessage$MessageLevel[] android.webkit.ConsoleMessage$MessageLevel.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #18  <Field int[] a>
		try
		{
			a[android.webkit.ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
	//    4    9:getstatic       #18  <Field int[] a>
	//    5   12:getstatic       #22  <Field android.webkit.ConsoleMessage$MessageLevel android.webkit.ConsoleMessage$MessageLevel.ERROR>
	//    6   15:invokevirtual   #26  <Method int android.webkit.ConsoleMessage$MessageLevel.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #18  <Field int[] a>
	//*  10   23:getstatic       #29  <Field android.webkit.ConsoleMessage$MessageLevel android.webkit.ConsoleMessage$MessageLevel.WARNING>
	//*  11   26:invokevirtual   #26  <Method int android.webkit.ConsoleMessage$MessageLevel.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #18  <Field int[] a>
	//*  15   34:getstatic       #32  <Field android.webkit.ConsoleMessage$MessageLevel android.webkit.ConsoleMessage$MessageLevel.LOG>
	//*  16   37:invokevirtual   #26  <Method int android.webkit.ConsoleMessage$MessageLevel.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #18  <Field int[] a>
	//*  20   45:getstatic       #35  <Field android.webkit.ConsoleMessage$MessageLevel android.webkit.ConsoleMessage$MessageLevel.TIP>
	//*  21   48:invokevirtual   #26  <Method int android.webkit.ConsoleMessage$MessageLevel.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #18  <Field int[] a>
	//*  25   56:getstatic       #38  <Field android.webkit.ConsoleMessage$MessageLevel android.webkit.ConsoleMessage$MessageLevel.DEBUG>
	//*  26   59:invokevirtual   #26  <Method int android.webkit.ConsoleMessage$MessageLevel.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   30   65:astore_0        
		try
		{
			a[android.webkit.ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
		}
	//*  31   66:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   32   69:astore_0        
		try
		{
			a[android.webkit.ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
		}
	//*  33   70:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   34   73:astore_0        
		try
		{
			a[android.webkit.ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
		}
	//*  35   74:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   36   77:astore_0        
		try
		{
			a[android.webkit.ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
		}
	//*  37   78:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   38   81:astore_0        
	//*  39   82:return          
	}
}
