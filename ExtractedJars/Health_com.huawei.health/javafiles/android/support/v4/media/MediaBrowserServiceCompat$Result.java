// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;


// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

public static class MediaBrowserServiceCompat$Result
{

	public void detach()
	{
		if(mDetachCalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field boolean mDetachCalled>
	//*   2    4:ifeq            37
			throw new IllegalStateException((new StringBuilder()).append("detach() called when detach() had already been called for: ").append(mDebug).toString());
	//    3    7:new             #28  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #30  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #31  <Method void StringBuilder()>
	//    8   18:ldc1            #33  <String "detach() called when detach() had already been called for: ">
	//    9   20:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:aload_0         
	//   11   24:getfield        #22  <Field Object mDebug>
	//   12   27:invokevirtual   #40  <Method StringBuilder StringBuilder.append(Object)>
	//   13   30:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   14   33:invokespecial   #47  <Method void IllegalStateException(String)>
	//   15   36:athrow          
		if(mSendResultCalled)
	//*  16   37:aload_0         
	//*  17   38:getfield        #49  <Field boolean mSendResultCalled>
	//*  18   41:ifeq            74
		{
			throw new IllegalStateException((new StringBuilder()).append("detach() called when sendResult() had already been called for: ").append(mDebug).toString());
	//   19   44:new             #28  <Class IllegalStateException>
	//   20   47:dup             
	//   21   48:new             #30  <Class StringBuilder>
	//   22   51:dup             
	//   23   52:invokespecial   #31  <Method void StringBuilder()>
	//   24   55:ldc1            #51  <String "detach() called when sendResult() had already been called for: ">
	//   25   57:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   26   60:aload_0         
	//   27   61:getfield        #22  <Field Object mDebug>
	//   28   64:invokevirtual   #40  <Method StringBuilder StringBuilder.append(Object)>
	//   29   67:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   30   70:invokespecial   #47  <Method void IllegalStateException(String)>
	//   31   73:athrow          
		} else
		{
			mDetachCalled = true;
	//   32   74:aload_0         
	//   33   75:iconst_1        
	//   34   76:putfield        #26  <Field boolean mDetachCalled>
			return;
	//   35   79:return          
		}
	}

	boolean isDone()
	{
		return mDetachCalled || mSendResultCalled;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field boolean mDetachCalled>
	//    2    4:ifne            14
	//    3    7:aload_0         
	//    4    8:getfield        #49  <Field boolean mSendResultCalled>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	void onResultSent(Object obj, int i)
	{
	//    0    0:return          
	}

	public void sendResult(Object obj)
	{
		if(mSendResultCalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field boolean mSendResultCalled>
	//*   2    4:ifeq            37
		{
			throw new IllegalStateException((new StringBuilder()).append("sendResult() called twice for: ").append(mDebug).toString());
	//    3    7:new             #28  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #30  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #31  <Method void StringBuilder()>
	//    8   18:ldc1            #60  <String "sendResult() called twice for: ">
	//    9   20:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:aload_0         
	//   11   24:getfield        #22  <Field Object mDebug>
	//   12   27:invokevirtual   #40  <Method StringBuilder StringBuilder.append(Object)>
	//   13   30:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   14   33:invokespecial   #47  <Method void IllegalStateException(String)>
	//   15   36:athrow          
		} else
		{
			mSendResultCalled = true;
	//   16   37:aload_0         
	//   17   38:iconst_1        
	//   18   39:putfield        #49  <Field boolean mSendResultCalled>
			onResultSent(obj, mFlags);
	//   19   42:aload_0         
	//   20   43:aload_1         
	//   21   44:aload_0         
	//   22   45:getfield        #62  <Field int mFlags>
	//   23   48:invokevirtual   #64  <Method void onResultSent(Object, int)>
			return;
	//   24   51:return          
		}
	}

	void setFlags(int i)
	{
		mFlags = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #62  <Field int mFlags>
	//    3    5:return          
	}

	private Object mDebug;
	private boolean mDetachCalled;
	private int mFlags;
	private boolean mSendResultCalled;

	MediaBrowserServiceCompat$Result(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		mDebug = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Object mDebug>
	//    5    9:return          
	}
}
