// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//			StackTraceTrimmingStrategy, MiddleOutStrategy

class MiddleOutFallbackStrategy
	implements StackTraceTrimmingStrategy
{

	public transient MiddleOutFallbackStrategy(int i, StackTraceTrimmingStrategy astacktracetrimmingstrategy[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		maximumStackSize = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #19  <Field int maximumStackSize>
		trimmingStrategies = astacktracetrimmingstrategy;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field StackTraceTrimmingStrategy[] trimmingStrategies>
		middleOutStrategy = new MiddleOutStrategy(i);
	//    8   14:aload_0         
	//    9   15:new             #23  <Class MiddleOutStrategy>
	//   10   18:dup             
	//   11   19:iload_1         
	//   12   20:invokespecial   #26  <Method void MiddleOutStrategy(int)>
	//   13   23:putfield        #28  <Field MiddleOutStrategy middleOutStrategy>
	//   14   26:return          
	}

	public StackTraceElement[] getTrimmedStackTrace(StackTraceElement astacktraceelement[])
	{
		if(astacktraceelement.length <= maximumStackSize)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:aload_0         
	//*   3    3:getfield        #19  <Field int maximumStackSize>
	//*   4    6:icmpgt          11
			return astacktraceelement;
	//    5    9:aload_1         
	//    6   10:areturn         
		StackTraceElement astacktraceelement1[] = astacktraceelement;
	//    7   11:aload_1         
	//    8   12:astore          4
		StackTraceTrimmingStrategy astacktracetrimmingstrategy[] = trimmingStrategies;
	//    9   14:aload_0         
	//   10   15:getfield        #21  <Field StackTraceTrimmingStrategy[] trimmingStrategies>
	//   11   18:astore          5
		int j = astacktracetrimmingstrategy.length;
	//   12   20:aload           5
	//   13   22:arraylength     
	//   14   23:istore_3        
		int i = 0;
	//   15   24:iconst_0        
	//   16   25:istore_2        
		do
		{
			StackTraceTrimmingStrategy stacktracetrimmingstrategy;
label0:
			{
				if(i < j)
	//*  17   26:iload_2         
	//*  18   27:iload_3         
	//*  19   28:icmpge          47
				{
					stacktracetrimmingstrategy = astacktracetrimmingstrategy[i];
	//   20   31:aload           5
	//   21   33:iload_2         
	//   22   34:aaload          
	//   23   35:astore          6
					if(astacktraceelement1.length > maximumStackSize)
						break label0;
	//   24   37:aload           4
	//   25   39:arraylength     
	//   26   40:aload_0         
	//   27   41:getfield        #19  <Field int maximumStackSize>
	//   28   44:icmpgt          72
				}
				astacktraceelement = astacktraceelement1;
	//   29   47:aload           4
	//   30   49:astore_1        
				if(astacktraceelement1.length > maximumStackSize)
	//*  31   50:aload           4
	//*  32   52:arraylength     
	//*  33   53:aload_0         
	//*  34   54:getfield        #19  <Field int maximumStackSize>
	//*  35   57:icmple          70
					astacktraceelement = middleOutStrategy.getTrimmedStackTrace(astacktraceelement1);
	//   36   60:aload_0         
	//   37   61:getfield        #28  <Field MiddleOutStrategy middleOutStrategy>
	//   38   64:aload           4
	//   39   66:invokevirtual   #33  <Method StackTraceElement[] MiddleOutStrategy.getTrimmedStackTrace(StackTraceElement[])>
	//   40   69:astore_1        
				return astacktraceelement;
	//   41   70:aload_1         
	//   42   71:areturn         
			}
			astacktraceelement1 = stacktracetrimmingstrategy.getTrimmedStackTrace(astacktraceelement);
	//   43   72:aload           6
	//   44   74:aload_1         
	//   45   75:invokeinterface #34  <Method StackTraceElement[] StackTraceTrimmingStrategy.getTrimmedStackTrace(StackTraceElement[])>
	//   46   80:astore          4
			i++;
	//   47   82:iload_2         
	//   48   83:iconst_1        
	//   49   84:iadd            
	//   50   85:istore_2        
		} while(true);
	//   51   86:goto            26
	}

	private final int maximumStackSize;
	private final MiddleOutStrategy middleOutStrategy;
	private final StackTraceTrimmingStrategy trimmingStrategies[];
}
