// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;


// Referenced classes of package androidx.work:
//			Operation

public static final class Operation$State$FAILURE extends Operation.State
{

	public Throwable getThrowable()
	{
		return mThrowable;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Throwable mThrowable>
	//    2    4:areturn         
	}

	public String toString()
	{
		return String.format("FAILURE (%s)", new Object[] {
			mThrowable.getMessage()
		});
	//    0    0:ldc1            #27  <String "FAILURE (%s)">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #18  <Field Throwable mThrowable>
	//    7   12:invokevirtual   #34  <Method String Throwable.getMessage()>
	//    8   15:aastore         
	//    9   16:invokestatic    #40  <Method String String.format(String, Object[])>
	//   10   19:areturn         
	}

	private final Throwable mThrowable;

	public Operation$State$FAILURE(Throwable throwable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Operation$State()>
		mThrowable = throwable;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Throwable mThrowable>
	//    5    9:return          
	}
}
