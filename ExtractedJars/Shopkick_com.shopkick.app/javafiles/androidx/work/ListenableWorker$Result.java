// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;


// Referenced classes of package androidx.work:
//			ListenableWorker, Data

public static abstract class ListenableWorker$Result
{
	public static final class Failure extends ListenableWorker.Result
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
				obj = ((Object) ((Failure)obj));
		//   13   25:aload_1         
		//   14   26:checkcast       #2   <Class ListenableWorker$Result$Failure>
		//   15   29:astore_1        
				return mOutputData.equals(((Object) (((Failure) (obj)).mOutputData)));
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

		public Failure()
		{
			this(Data.EMPTY);
		//    0    0:aload_0         
		//    1    1:getstatic       #21  <Field Data Data.EMPTY>
		//    2    4:invokespecial   #24  <Method void ListenableWorker$Result$Failure(Data)>
		//    3    7:return          
		}

		public Failure(Data data)
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

	public static final class Retry extends ListenableWorker.Result
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
			return obj != null && ((Object)this).getClass() == obj.getClass();
		//    5    7:aload_1         
		//    6    8:ifnull          24
		//    7   11:aload_0         
		//    8   12:invokevirtual   #25  <Method Class Object.getClass()>
		//    9   15:aload_1         
		//   10   16:invokevirtual   #25  <Method Class Object.getClass()>
		//   11   19:if_acmpne       24
		//   12   22:iconst_1        
		//   13   23:ireturn         
		//   14   24:iconst_0        
		//   15   25:ireturn         
		}

		public int hashCode()
		{
			return ((Class) (androidx/work/ListenableWorker$Result$Retry)).getName().hashCode();
		//    0    0:ldc1            #2   <Class ListenableWorker$Result$Retry>
		//    1    2:invokevirtual   #33  <Method String Class.getName()>
		//    2    5:invokevirtual   #37  <Method int String.hashCode()>
		//    3    8:ireturn         
		}

		public Retry()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void ListenableWorker$Result()>
		//    2    4:return          
		}
	}

	public static final class Success extends ListenableWorker.Result
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
				obj = ((Object) ((Success)obj));
		//   13   25:aload_1         
		//   14   26:checkcast       #2   <Class ListenableWorker$Result$Success>
		//   15   29:astore_1        
				return mOutputData.equals(((Object) (((Success) (obj)).mOutputData)));
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
			return ((Class) (androidx/work/ListenableWorker$Result$Success)).getName().hashCode() * 31 + mOutputData.hashCode();
		//    0    0:ldc1            #2   <Class ListenableWorker$Result$Success>
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

		public Success()
		{
			this(Data.EMPTY);
		//    0    0:aload_0         
		//    1    1:getstatic       #21  <Field Data Data.EMPTY>
		//    2    4:invokespecial   #24  <Method void ListenableWorker$Result$Success(Data)>
		//    3    7:return          
		}

		public Success(Data data)
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


	public static ListenableWorker$Result failure()
	{
		return ((ListenableWorker$Result) (new Failure()));
	//    0    0:new             #9   <Class ListenableWorker$Result$Failure>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void ListenableWorker$Result$Failure()>
	//    3    7:areturn         
	}

	public static ListenableWorker$Result failure(Data data)
	{
		return ((ListenableWorker$Result) (new Failure(data)));
	//    0    0:new             #9   <Class ListenableWorker$Result$Failure>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #34  <Method void ListenableWorker$Result$Failure(Data)>
	//    4    8:areturn         
	}

	public static ListenableWorker$Result retry()
	{
		return ((ListenableWorker$Result) (new Retry()));
	//    0    0:new             #12  <Class ListenableWorker$Result$Retry>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void ListenableWorker$Result$Retry()>
	//    3    7:areturn         
	}

	public static ListenableWorker$Result success()
	{
		return ((ListenableWorker$Result) (new Success()));
	//    0    0:new             #15  <Class ListenableWorker$Result$Success>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void ListenableWorker$Result$Success()>
	//    3    7:areturn         
	}

	public static ListenableWorker$Result success(Data data)
	{
		return ((ListenableWorker$Result) (new Success(data)));
	//    0    0:new             #15  <Class ListenableWorker$Result$Success>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #40  <Method void ListenableWorker$Result$Success(Data)>
	//    4    8:areturn         
	}

	ListenableWorker$Result()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}
}
