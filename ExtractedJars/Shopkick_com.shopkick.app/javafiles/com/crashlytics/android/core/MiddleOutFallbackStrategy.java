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
		StackTraceTrimmingStrategy astacktracetrimmingstrategy[] = trimmingStrategies;
	//    7   11:aload_0         
	//    8   12:getfield        #21  <Field StackTraceTrimmingStrategy[] trimmingStrategies>
	//    9   15:astore          5
		int j = astacktracetrimmingstrategy.length;
	//   10   17:aload           5
	//   11   19:arraylength     
	//   12   20:istore_3        
		int i = 0;
	//   13   21:iconst_0        
	//   14   22:istore_2        
		StackTraceElement astacktraceelement1[] = astacktraceelement;
	//   15   23:aload_1         
	//   16   24:astore          4
		do
		{
			if(i >= j)
				break;
	//   17   26:iload_2         
	//   18   27:iload_3         
	//   19   28:icmpge          67
			StackTraceTrimmingStrategy stacktracetrimmingstrategy = astacktracetrimmingstrategy[i];
	//   20   31:aload           5
	//   21   33:iload_2         
	//   22   34:aaload          
	//   23   35:astore          6
			if(astacktraceelement1.length <= maximumStackSize)
	//*  24   37:aload           4
	//*  25   39:arraylength     
	//*  26   40:aload_0         
	//*  27   41:getfield        #19  <Field int maximumStackSize>
	//*  28   44:icmpgt          50
				break;
	//   29   47:goto            67
			astacktraceelement1 = stacktracetrimmingstrategy.getTrimmedStackTrace(astacktraceelement);
	//   30   50:aload           6
	//   31   52:aload_1         
	//   32   53:invokeinterface #33  <Method StackTraceElement[] StackTraceTrimmingStrategy.getTrimmedStackTrace(StackTraceElement[])>
	//   33   58:astore          4
			i++;
	//   34   60:iload_2         
	//   35   61:iconst_1        
	//   36   62:iadd            
	//   37   63:istore_2        
		} while(true);
	//   38   64:goto            26
		astacktraceelement = astacktraceelement1;
	//   39   67:aload           4
	//   40   69:astore_1        
		if(astacktraceelement1.length > maximumStackSize)
	//*  41   70:aload           4
	//*  42   72:arraylength     
	//*  43   73:aload_0         
	//*  44   74:getfield        #19  <Field int maximumStackSize>
	//*  45   77:icmple          90
			astacktraceelement = middleOutStrategy.getTrimmedStackTrace(astacktraceelement1);
	//   46   80:aload_0         
	//   47   81:getfield        #28  <Field MiddleOutStrategy middleOutStrategy>
	//   48   84:aload           4
	//   49   86:invokevirtual   #34  <Method StackTraceElement[] MiddleOutStrategy.getTrimmedStackTrace(StackTraceElement[])>
	//   50   89:astore_1        
		return astacktraceelement;
	//   51   90:aload_1         
	//   52   91:areturn         
	}

	private final int maximumStackSize;
	private final MiddleOutStrategy middleOutStrategy;
	private final StackTraceTrimmingStrategy trimmingStrategies[];
}
