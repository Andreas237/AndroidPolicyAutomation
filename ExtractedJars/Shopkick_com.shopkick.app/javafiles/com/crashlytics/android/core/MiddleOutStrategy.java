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
		int j = astacktraceelement.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		int i = trimmedSize;
	//    3    3:aload_0         
	//    4    4:getfield        #15  <Field int trimmedSize>
	//    5    7:istore_2        
		if(j <= i)
	//*   6    8:iload_3         
	//*   7    9:iload_2         
	//*   8   10:icmpgt          15
		{
			return astacktraceelement;
	//    9   13:aload_1         
	//   10   14:areturn         
		} else
		{
			int k = i / 2;
	//   11   15:iload_2         
	//   12   16:iconst_2        
	//   13   17:idiv            
	//   14   18:istore_3        
			int l = i - k;
	//   15   19:iload_2         
	//   16   20:iload_3         
	//   17   21:isub            
	//   18   22:istore          4
			StackTraceElement astacktraceelement1[] = new StackTraceElement[i];
	//   19   24:iload_2         
	//   20   25:anewarray       StackTraceElement[]
	//   21   28:astore          5
			System.arraycopy(((Object) (astacktraceelement)), 0, ((Object) (astacktraceelement1)), 0, l);
	//   22   30:aload_1         
	//   23   31:iconst_0        
	//   24   32:aload           5
	//   25   34:iconst_0        
	//   26   35:iload           4
	//   27   37:invokestatic    #26  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (astacktraceelement)), astacktraceelement.length - k, ((Object) (astacktraceelement1)), l, k);
	//   28   40:aload_1         
	//   29   41:aload_1         
	//   30   42:arraylength     
	//   31   43:iload_3         
	//   32   44:isub            
	//   33   45:aload           5
	//   34   47:iload           4
	//   35   49:iload_3         
	//   36   50:invokestatic    #26  <Method void System.arraycopy(Object, int, Object, int, int)>
			return astacktraceelement1;
	//   37   53:aload           5
	//   38   55:areturn         
		}
	}

	private final int trimmedSize;
}
