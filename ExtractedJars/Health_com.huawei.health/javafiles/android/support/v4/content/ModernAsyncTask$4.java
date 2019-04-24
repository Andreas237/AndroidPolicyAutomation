// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;


// Referenced classes of package android.support.v4.content:
//			ModernAsyncTask

static class ModernAsyncTask$4
{

	static final int $SwitchMap$android$support$v4$content$ModernAsyncTask$Status[];

	static 
	{
		$SwitchMap$android$support$v4$content$ModernAsyncTask$Status = new int[atus.values().length];
	//    0    0:invokestatic    #18  <Method ModernAsyncTask$Status[] ModernAsyncTask$Status.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$android$support$v4$content$ModernAsyncTask$Status>
		try
		{
			$SwitchMap$android$support$v4$content$ModernAsyncTask$Status[atus.RUNNING.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$android$support$v4$content$ModernAsyncTask$Status>
	//    5   12:getstatic       #24  <Field ModernAsyncTask$Status ModernAsyncTask$Status.RUNNING>
	//    6   15:invokevirtual   #28  <Method int ModernAsyncTask$Status.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:goto            24
		catch(NoSuchFieldError nosuchfielderror) { }
	//   10   23:astore_0        
		try
		{
			$SwitchMap$android$support$v4$content$ModernAsyncTask$Status[atus.FINISHED.ordinal()] = 2;
	//   11   24:getstatic       #20  <Field int[] $SwitchMap$android$support$v4$content$ModernAsyncTask$Status>
	//   12   27:getstatic       #31  <Field ModernAsyncTask$Status ModernAsyncTask$Status.FINISHED>
	//   13   30:invokevirtual   #28  <Method int ModernAsyncTask$Status.ordinal()>
	//   14   33:iconst_2        
	//   15   34:iastore         
	//   16   35:return          
		}
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   36:astore_0        
	//*  18   37:return          
	}
}
