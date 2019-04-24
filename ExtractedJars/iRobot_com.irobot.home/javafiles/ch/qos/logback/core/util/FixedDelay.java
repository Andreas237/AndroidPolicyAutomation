// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.util;


// Referenced classes of package ch.qos.logback.core.util:
//			DelayStrategy

public class FixedDelay
	implements DelayStrategy
{

	public FixedDelay(int i)
	{
		long l = i;
	//    0    0:iload_1         
	//    1    1:i2l             
	//    2    2:lstore_2        
		this(l, l);
	//    3    3:aload_0         
	//    4    4:lload_2         
	//    5    5:lload_2         
	//    6    6:invokespecial   #14  <Method void FixedDelay(long, long)>
	//    7    9:return          
	}

	public FixedDelay(long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		new String();
	//    2    4:new             #20  <Class String>
	//    3    7:dup             
	//    4    8:invokespecial   #21  <Method void String()>
	//    5   11:pop             
		nextDelay = l;
	//    6   12:aload_0         
	//    7   13:lload_1         
	//    8   14:putfield        #23  <Field long nextDelay>
		subsequentDelay = l1;
	//    9   17:aload_0         
	//   10   18:lload_3         
	//   11   19:putfield        #25  <Field long subsequentDelay>
	//   12   22:return          
	}

	public long nextDelay()
	{
		long l = nextDelay;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field long nextDelay>
	//    2    4:lstore_1        
		nextDelay = subsequentDelay;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #25  <Field long subsequentDelay>
	//    6   10:putfield        #23  <Field long nextDelay>
		return l;
	//    7   13:lload_1         
	//    8   14:lreturn         
	}

	private long nextDelay;
	private final long subsequentDelay;
}
