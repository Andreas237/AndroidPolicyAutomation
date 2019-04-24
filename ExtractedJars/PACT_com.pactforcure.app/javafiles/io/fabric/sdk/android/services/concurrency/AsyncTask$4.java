// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.concurrency;


// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//			AsyncTask

static class AsyncTask$4
{

	static final int $SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status[];

	static 
	{
		$SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status = new int[atus.values().length];
	//    0    0:invokestatic    #18  <Method AsyncTask$Status[] AsyncTask$Status.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status>
		try
		{
			$SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status[atus.RUNNING.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status>
	//    5   12:getstatic       #24  <Field AsyncTask$Status AsyncTask$Status.RUNNING>
	//    6   15:invokevirtual   #28  <Method int AsyncTask$Status.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status>
	//*  10   23:getstatic       #31  <Field AsyncTask$Status AsyncTask$Status.FINISHED>
	//*  11   26:invokevirtual   #28  <Method int AsyncTask$Status.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:return          
	//*  15   32:astore_0        
	//*  16   33:return          
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   34:astore_0        
		try
		{
			$SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status[atus.FINISHED.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//*  18   35:goto            20
	}
}
