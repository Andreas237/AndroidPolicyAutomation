// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.cache;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class FailuresHandler
	implements Serializable
{

	public FailuresHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		intervals = Arrays.asList(((Object []) (new Integer[] {
			Integer.valueOf(10), Integer.valueOf(30), Integer.valueOf(60), Integer.valueOf(300)
		})));
	//    2    4:aload_0         
	//    3    5:iconst_4        
	//    4    6:anewarray       Integer[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:bipush          10
	//    8   13:invokestatic    #30  <Method Integer Integer.valueOf(int)>
	//    9   16:aastore         
	//   10   17:dup             
	//   11   18:iconst_1        
	//   12   19:bipush          30
	//   13   21:invokestatic    #30  <Method Integer Integer.valueOf(int)>
	//   14   24:aastore         
	//   15   25:dup             
	//   16   26:iconst_2        
	//   17   27:bipush          60
	//   18   29:invokestatic    #30  <Method Integer Integer.valueOf(int)>
	//   19   32:aastore         
	//   20   33:dup             
	//   21   34:iconst_3        
	//   22   35:sipush          300
	//   23   38:invokestatic    #30  <Method Integer Integer.valueOf(int)>
	//   24   41:aastore         
	//   25   42:invokestatic    #36  <Method List Arrays.asList(Object[])>
	//   26   45:putfield        #38  <Field List intervals>
		infiniteLastRetry = true;
	//   27   48:aload_0         
	//   28   49:iconst_1        
	//   29   50:putfield        #40  <Field boolean infiniteLastRetry>
	//   30   53:return          
	}

	public List getIntervals()
	{
		return intervals;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field List intervals>
	//    2    4:areturn         
	}

	public boolean isInfiniteLastRetry()
	{
		return infiniteLastRetry;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field boolean infiniteLastRetry>
	//    2    4:ireturn         
	}

	private static final long serialVersionUID = 1L;
	private boolean infiniteLastRetry;
	private List intervals;
}
