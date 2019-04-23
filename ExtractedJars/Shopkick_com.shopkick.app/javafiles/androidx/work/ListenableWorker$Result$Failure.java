// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;


// Referenced classes of package androidx.work:
//			ListenableWorker, Data

public static final class ListenableWorker$Result$Failure extends ListenableWorker.Result
{

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null && ((Object)this).getClass() == obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          42
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #39  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #39  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       25
	//*  12   22:goto            42
		{
			obj = ((Object) ((ListenableWorker$Result$Failure)obj));
	//   13   25:aload_1         
	//   14   26:checkcast       #2   <Class ListenableWorker$Result$Failure>
	//   15   29:astore_1        
			return mOutputData.equals(((Object) (((ListenableWorker$Result$Failure) (obj)).mOutputData)));
	//   16   30:aload_0         
	//   17   31:getfield        #30  <Field Data mOutputData>
	//   18   34:aload_1         
	//   19   35:getfield        #30  <Field Data mOutputData>
	//   20   38:invokevirtual   #41  <Method boolean Data.equals(Object)>
	//   21   41:ireturn         
		} else
		{
			return false;
	//   22   42:iconst_0        
	//   23   43:ireturn         
		}
	}

	public Data getOutputData()
	{
		return mOutputData;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Data mOutputData>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return ((Class) (androidx/work/ListenableWorker$Result$Failure)).getName().hashCode() * 31 + mOutputData.hashCode();
	//    0    0:ldc1            #2   <Class ListenableWorker$Result$Failure>
	//    1    2:invokevirtual   #52  <Method String Class.getName()>
	//    2    5:invokevirtual   #56  <Method int String.hashCode()>
	//    3    8:bipush          31
	//    4   10:imul            
	//    5   11:aload_0         
	//    6   12:getfield        #30  <Field Data mOutputData>
	//    7   15:invokevirtual   #57  <Method int Data.hashCode()>
	//    8   18:iadd            
	//    9   19:ireturn         
	}

	private final Data mOutputData;

	public ListenableWorker$Result$Failure()
	{
		this(Data.EMPTY);
	//    0    0:aload_0         
	//    1    1:getstatic       #21  <Field Data Data.EMPTY>
	//    2    4:invokespecial   #24  <Method void ListenableWorker$Result$Failure(Data)>
	//    3    7:return          
	}

	public ListenableWorker$Result$Failure(Data data)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void ListenableWorker$Result()>
		mOutputData = data;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field Data mOutputData>
	//    5    9:return          
	}
}
