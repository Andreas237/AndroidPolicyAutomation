// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import java.util.Locale;

// Referenced classes of package bolts:
//			CancellationToken

public class CancellationTokenSource
{

	public CancellationTokenSource()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #12  <Class CancellationToken>
	//    4    8:dup             
	//    5    9:invokespecial   #13  <Method void CancellationToken()>
	//    6   12:putfield        #15  <Field CancellationToken token>
	//    7   15:return          
	}

	public void cancel()
	{
		token.tryCancel();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field CancellationToken token>
	//    2    4:invokevirtual   #21  <Method boolean CancellationToken.tryCancel()>
	//    3    7:pop             
	//    4    8:return          
	}

	public CancellationToken getToken()
	{
		return token;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field CancellationToken token>
	//    2    4:areturn         
	}

	public boolean isCancellationRequested()
	{
		return token.isCancellationRequested();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field CancellationToken token>
	//    2    4:invokevirtual   #26  <Method boolean CancellationToken.isCancellationRequested()>
	//    3    7:ireturn         
	}

	public String toString()
	{
		return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", new Object[] {
			((Object)this).getClass().getName(), Integer.toHexString(((Object)this).hashCode()), Boolean.toString(isCancellationRequested())
		});
	//    0    0:getstatic       #34  <Field Locale Locale.US>
	//    1    3:ldc1            #36  <String "%s@%s[cancellationRequested=%s]">
	//    2    5:iconst_3        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:invokevirtual   #40  <Method Class Object.getClass()>
	//    8   15:invokevirtual   #45  <Method String Class.getName()>
	//    9   18:aastore         
	//   10   19:dup             
	//   11   20:iconst_1        
	//   12   21:aload_0         
	//   13   22:invokevirtual   #49  <Method int Object.hashCode()>
	//   14   25:invokestatic    #55  <Method String Integer.toHexString(int)>
	//   15   28:aastore         
	//   16   29:dup             
	//   17   30:iconst_2        
	//   18   31:aload_0         
	//   19   32:invokevirtual   #56  <Method boolean isCancellationRequested()>
	//   20   35:invokestatic    #61  <Method String Boolean.toString(boolean)>
	//   21   38:aastore         
	//   22   39:invokestatic    #67  <Method String String.format(Locale, String, Object[])>
	//   23   42:areturn         
	}

	private final CancellationToken token = new CancellationToken();
}
