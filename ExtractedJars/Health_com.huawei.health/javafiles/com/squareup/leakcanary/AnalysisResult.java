// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;

import java.io.Serializable;

// Referenced classes of package com.squareup.leakcanary:
//			LeakTrace

public final class AnalysisResult
	implements Serializable
{

	private AnalysisResult(boolean flag, boolean flag1, String s, LeakTrace leaktrace, Throwable throwable, long l, 
			long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		leakFound = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #25  <Field boolean leakFound>
		excludedLeak = flag1;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #27  <Field boolean excludedLeak>
		className = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field String className>
		leakTrace = leaktrace;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #31  <Field LeakTrace leakTrace>
		failure = throwable;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #33  <Field Throwable failure>
		retainedHeapSize = l;
	//   17   31:aload_0         
	//   18   32:lload           6
	//   19   34:putfield        #35  <Field long retainedHeapSize>
		analysisDurationMs = l1;
	//   20   37:aload_0         
	//   21   38:lload           8
	//   22   40:putfield        #37  <Field long analysisDurationMs>
	//   23   43:return          
	}

	public static AnalysisResult failure(Throwable throwable, long l)
	{
		return new AnalysisResult(false, false, ((String) (null)), ((LeakTrace) (null)), throwable, 0L, l);
	//    0    0:new             #2   <Class AnalysisResult>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:aconst_null     
	//    5    7:aconst_null     
	//    6    8:aload_0         
	//    7    9:lconst_0        
	//    8   10:lload_1         
	//    9   11:invokespecial   #41  <Method void AnalysisResult(boolean, boolean, String, LeakTrace, Throwable, long, long)>
	//   10   14:areturn         
	}

	public static AnalysisResult leakDetected(boolean flag, String s, LeakTrace leaktrace, long l, long l1)
	{
		return new AnalysisResult(true, flag, s, leaktrace, ((Throwable) (null)), l, l1);
	//    0    0:new             #2   <Class AnalysisResult>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:iload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aconst_null     
	//    7    9:lload_3         
	//    8   10:lload           5
	//    9   12:invokespecial   #41  <Method void AnalysisResult(boolean, boolean, String, LeakTrace, Throwable, long, long)>
	//   10   15:areturn         
	}

	public static AnalysisResult noLeak(long l)
	{
		return new AnalysisResult(false, false, ((String) (null)), ((LeakTrace) (null)), ((Throwable) (null)), 0L, l);
	//    0    0:new             #2   <Class AnalysisResult>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:aconst_null     
	//    5    7:aconst_null     
	//    6    8:aconst_null     
	//    7    9:lconst_0        
	//    8   10:lload_0         
	//    9   11:invokespecial   #41  <Method void AnalysisResult(boolean, boolean, String, LeakTrace, Throwable, long, long)>
	//   10   14:areturn         
	}

	public final long analysisDurationMs;
	public final String className;
	public final boolean excludedLeak;
	public final Throwable failure;
	public final boolean leakFound;
	public final LeakTrace leakTrace;
	public final long retainedHeapSize;
}
