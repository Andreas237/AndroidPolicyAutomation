// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.aws.authentication;


// Referenced classes of package com.irobot.home.aws.authentication:
//			AwsCredentialsService

static class AwsCredentialsService$1
{

	static final int a[];

	static 
	{
		a = new int[com.irobot.awsservices.a.a.a.values().length];
	//    0    0:invokestatic    #18  <Method com.irobot.awsservices.a.a$a[] com.irobot.awsservices.a.a$a.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] a>
		try
		{
			a[com.irobot.awsservices.a.a.a.Account.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] a>
	//    5   12:getstatic       #24  <Field com.irobot.awsservices.a.a$a com.irobot.awsservices.a.a$a.Account>
	//    6   15:invokevirtual   #28  <Method int com.irobot.awsservices.a.a$a.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] a>
	//*  10   23:getstatic       #31  <Field com.irobot.awsservices.a.a$a com.irobot.awsservices.a.a$a.Asset>
	//*  11   26:invokevirtual   #28  <Method int com.irobot.awsservices.a.a$a.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   15   32:astore_0        
		try
		{
			a[com.irobot.awsservices.a.a.a.Asset.ordinal()] = 2;
		}
	//*  16   33:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   36:astore_0        
	//*  18   37:return          
	}
}
