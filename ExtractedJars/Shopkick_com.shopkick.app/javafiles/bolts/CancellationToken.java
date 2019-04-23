// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import java.util.Locale;
import java.util.concurrent.CancellationException;

// Referenced classes of package bolts:
//			CancellationTokenSource, CancellationTokenRegistration

public class CancellationToken
{

	CancellationToken(CancellationTokenSource cancellationtokensource)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		tokenSource = cancellationtokensource;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field CancellationTokenSource tokenSource>
	//    5    9:return          
	}

	public boolean isCancellationRequested()
	{
		return tokenSource.isCancellationRequested();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field CancellationTokenSource tokenSource>
	//    2    4:invokevirtual   #20  <Method boolean CancellationTokenSource.isCancellationRequested()>
	//    3    7:ireturn         
	}

	public CancellationTokenRegistration register(Runnable runnable)
	{
		return tokenSource.register(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field CancellationTokenSource tokenSource>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #24  <Method CancellationTokenRegistration CancellationTokenSource.register(Runnable)>
	//    4    8:areturn         
	}

	public void throwIfCancellationRequested()
		throws CancellationException
	{
		tokenSource.throwIfCancellationRequested();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field CancellationTokenSource tokenSource>
	//    2    4:invokevirtual   #29  <Method void CancellationTokenSource.throwIfCancellationRequested()>
	//    3    7:return          
	}

	public String toString()
	{
		return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", new Object[] {
			((Object)this).getClass().getName(), Integer.toHexString(((Object)this).hashCode()), Boolean.toString(tokenSource.isCancellationRequested())
		});
	//    0    0:getstatic       #38  <Field Locale Locale.US>
	//    1    3:ldc1            #40  <String "%s@%s[cancellationRequested=%s]">
	//    2    5:iconst_3        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:invokevirtual   #44  <Method Class Object.getClass()>
	//    8   15:invokevirtual   #49  <Method String Class.getName()>
	//    9   18:aastore         
	//   10   19:dup             
	//   11   20:iconst_1        
	//   12   21:aload_0         
	//   13   22:invokevirtual   #53  <Method int Object.hashCode()>
	//   14   25:invokestatic    #59  <Method String Integer.toHexString(int)>
	//   15   28:aastore         
	//   16   29:dup             
	//   17   30:iconst_2        
	//   18   31:aload_0         
	//   19   32:getfield        #13  <Field CancellationTokenSource tokenSource>
	//   20   35:invokevirtual   #20  <Method boolean CancellationTokenSource.isCancellationRequested()>
	//   21   38:invokestatic    #64  <Method String Boolean.toString(boolean)>
	//   22   41:aastore         
	//   23   42:invokestatic    #70  <Method String String.format(Locale, String, Object[])>
	//   24   45:areturn         
	}

	private final CancellationTokenSource tokenSource;
}
