// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//			StackTraceTrimmingStrategy

class MiddleOutStrategy
	implements StackTraceTrimmingStrategy
{

	public MiddleOutStrategy(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		trimmedSize = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #15  <Field int trimmedSize>
	//    5    9:return          
	}

	public StackTraceElement[] getTrimmedStackTrace(StackTraceElement astacktraceelement[])
	{
		if(astacktraceelement.length <= trimmedSize)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:aload_0         
	//*   3    3:getfield        #15  <Field int trimmedSize>
	//*   4    6:icmpgt          11
		{
			return astacktraceelement;
	//    5    9:aload_1         
	//    6   10:areturn         
		} else
		{
			int i = trimmedSize / 2;
	//    7   11:aload_0         
	//    8   12:getfield        #15  <Field int trimmedSize>
	//    9   15:iconst_2        
	//   10   16:idiv            
	//   11   17:istore_2        
			int j = trimmedSize - i;
	//   12   18:aload_0         
	//   13   19:getfield        #15  <Field int trimmedSize>
	//   14   22:iload_2         
	//   15   23:isub            
	//   16   24:istore_3        
			StackTraceElement astacktraceelement1[] = new StackTraceElement[trimmedSize];
	//   17   25:aload_0         
	//   18   26:getfield        #15  <Field int trimmedSize>
	//   19   29:anewarray       StackTraceElement[]
	//   20   32:astore          4
			System.arraycopy(((Object) (astacktraceelement)), 0, ((Object) (astacktraceelement1)), 0, j);
	//   21   34:aload_1         
	//   22   35:iconst_0        
	//   23   36:aload           4
	//   24   38:iconst_0        
	//   25   39:iload_3         
	//   26   40:invokestatic    #26  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (astacktraceelement)), astacktraceelement.length - i, ((Object) (astacktraceelement1)), j, i);
	//   27   43:aload_1         
	//   28   44:aload_1         
	//   29   45:arraylength     
	//   30   46:iload_2         
	//   31   47:isub            
	//   32   48:aload           4
	//   33   50:iload_3         
	//   34   51:iload_2         
	//   35   52:invokestatic    #26  <Method void System.arraycopy(Object, int, Object, int, int)>
			return astacktraceelement1;
	//   36   55:aload           4
	//   37   57:areturn         
		}
	}

	private final int trimmedSize;
}
