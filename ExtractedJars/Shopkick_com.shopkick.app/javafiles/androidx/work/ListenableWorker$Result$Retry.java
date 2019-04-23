// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;


// Referenced classes of package androidx.work:
//			ListenableWorker

public static final class ListenableWorker$Result$Retry extends ListenableWorker.Result
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

	public ListenableWorker$Result$Retry()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void ListenableWorker$Result()>
	//    2    4:return          
	}
}
