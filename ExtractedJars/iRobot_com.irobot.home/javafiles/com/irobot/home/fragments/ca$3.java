// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;


// Referenced classes of package com.irobot.home.fragments:
//			ca

static class ca$3
{

	static final int a[];
	static final int b[];

	static 
	{
		b = new int[com.irobot.home.fragments.a.values().length];
	//    0    0:invokestatic    #19  <Method ca$a$a[] ca$a$a.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] b>
		try
		{
			b[a.ROBOT_NOT_DOCKED.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] b>
	//    5   12:getstatic       #25  <Field ca$a$a ca$a$a.ROBOT_NOT_DOCKED>
	//    6   15:invokevirtual   #29  <Method int ca$a$a.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #21  <Field int[] b>
	//*  10   23:getstatic       #32  <Field ca$a$a ca$a$a.ROBOT_NOT_READY>
	//*  11   26:invokevirtual   #29  <Method int ca$a$a.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #21  <Field int[] b>
	//*  15   34:getstatic       #35  <Field ca$a$a ca$a$a.ROBOT_NOT_CONNECTED>
	//*  16   37:invokevirtual   #29  <Method int ca$a$a.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #21  <Field int[] b>
	//*  20   45:getstatic       #38  <Field ca$a$a ca$a$a.UPDATE_INTERRUPTED>
	//*  21   48:invokevirtual   #29  <Method int ca$a$a.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:invokestatic    #43  <Method android.net.NetworkInfo$State[] android.net.NetworkInfo$State.values()>
	//*  25   56:arraylength     
	//*  26   57:newarray        int[]
	//*  27   59:putstatic       #45  <Field int[] a>
	//*  28   62:getstatic       #45  <Field int[] a>
	//*  29   65:getstatic       #49  <Field android.net.NetworkInfo$State android.net.NetworkInfo$State.CONNECTED>
	//*  30   68:invokevirtual   #50  <Method int android.net.NetworkInfo$State.ordinal()>
	//*  31   71:iconst_1        
	//*  32   72:iastore         
	//*  33   73:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   34   74:astore_0        
		try
		{
			b[a.ROBOT_NOT_READY.ordinal()] = 2;
		}
	//*  35   75:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   36   78:astore_0        
		try
		{
			b[a.ROBOT_NOT_CONNECTED.ordinal()] = 3;
		}
	//*  37   79:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   38   82:astore_0        
		try
		{
			b[a.UPDATE_INTERRUPTED.ordinal()] = 4;
		}
	//*  39   83:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   40   86:astore_0        
		a = new int[android.net.rkInfo.State.values().length];
		try
		{
			a[android.net.rkInfo.State.CONNECTED.ordinal()] = 1;
		}
	//*  41   87:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   42   90:astore_0        
	//*  43   91:return          
	}
}
