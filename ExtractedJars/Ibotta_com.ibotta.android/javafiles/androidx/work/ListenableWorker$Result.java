// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;


// Referenced classes of package androidx.work:
//			ListenableWorker

public static final class ListenableWorker$Result extends Enum
{

	public static ListenableWorker$Result valueOf(String s)
	{
		return (ListenableWorker$Result)Enum.valueOf(androidx/work/ListenableWorker$Result, s);
	//    0    0:ldc1            #2   <Class ListenableWorker$Result>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ListenableWorker$Result>
	//    4    9:areturn         
	}

	public static ListenableWorker$Result[] values()
	{
		return (ListenableWorker$Result[])((ListenableWorker$Result []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field ListenableWorker$Result[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Landroidx.work.ListenableWorker$Result_3B_.clone()>
	//    2    6:checkcast       #42  <Class ListenableWorker$Result[]>
	//    3    9:areturn         
	}

	private static final ListenableWorker$Result $VALUES[];
	public static final ListenableWorker$Result FAILURE;
	public static final ListenableWorker$Result RETRY;
	public static final ListenableWorker$Result SUCCESS;

	static 
	{
		SUCCESS = new ListenableWorker$Result("SUCCESS", 0);
	//    0    0:new             #2   <Class ListenableWorker$Result>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "SUCCESS">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void ListenableWorker$Result(String, int)>
	//    5   10:putstatic       #23  <Field ListenableWorker$Result SUCCESS>
		FAILURE = new ListenableWorker$Result("FAILURE", 1);
	//    6   13:new             #2   <Class ListenableWorker$Result>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "FAILURE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void ListenableWorker$Result(String, int)>
	//   11   23:putstatic       #26  <Field ListenableWorker$Result FAILURE>
		RETRY = new ListenableWorker$Result("RETRY", 2);
	//   12   26:new             #2   <Class ListenableWorker$Result>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "RETRY">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void ListenableWorker$Result(String, int)>
	//   17   36:putstatic       #29  <Field ListenableWorker$Result RETRY>
		$VALUES = (new ListenableWorker$Result[] {
			SUCCESS, FAILURE, RETRY
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       ListenableWorker$Result[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field ListenableWorker$Result SUCCESS>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field ListenableWorker$Result FAILURE>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field ListenableWorker$Result RETRY>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field ListenableWorker$Result[] $VALUES>
	//*  33   64:return          
	}

	private ListenableWorker$Result(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
