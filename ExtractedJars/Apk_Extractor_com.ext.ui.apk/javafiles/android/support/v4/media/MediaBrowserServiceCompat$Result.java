// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

public static class MediaBrowserServiceCompat$Result
{

	private void checkExtraFields(Bundle bundle)
	{
		if(bundle != null && bundle.containsKey("android.media.browse.extra.DOWNLOAD_PROGRESS"))
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
	//*   2    4:return          
	//*   3    5:aload_1         
	//*   4    6:ldc1            #29  <String "android.media.browse.extra.DOWNLOAD_PROGRESS">
	//*   5    8:invokevirtual   #35  <Method boolean Bundle.containsKey(String)>
	//*   6   11:ifeq            4
		{
			float f = bundle.getFloat("android.media.browse.extra.DOWNLOAD_PROGRESS");
	//    7   14:aload_1         
	//    8   15:ldc1            #29  <String "android.media.browse.extra.DOWNLOAD_PROGRESS">
	//    9   17:invokevirtual   #39  <Method float Bundle.getFloat(String)>
	//   10   20:fstore_2        
			if(f < -1E-05F || f > 1.00001F)
	//*  11   21:fload_2         
	//*  12   22:ldc1            #40  <Float -1E-05F>
	//*  13   24:fcmpg           
	//*  14   25:iflt            35
	//*  15   28:fload_2         
	//*  16   29:ldc1            #41  <Float 1.00001F>
	//*  17   31:fcmpl           
	//*  18   32:ifle            4
				throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0].");
	//   19   35:new             #43  <Class IllegalArgumentException>
	//   20   38:dup             
	//   21   39:ldc1            #45  <String "The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0].">
	//   22   41:invokespecial   #48  <Method void IllegalArgumentException(String)>
	//   23   44:athrow          
		}
	}

	public void detach()
	{
		if(mDetachCalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field boolean mDetachCalled>
	//*   2    4:ifeq            37
			throw new IllegalStateException((new StringBuilder()).append("detach() called when detach() had already been called for: ").append(mDebug).toString());
	//    3    7:new             #53  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #55  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #56  <Method void StringBuilder()>
	//    8   18:ldc1            #58  <String "detach() called when detach() had already been called for: ">
	//    9   20:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:aload_0         
	//   11   24:getfield        #24  <Field Object mDebug>
	//   12   27:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//   13   30:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   14   33:invokespecial   #70  <Method void IllegalStateException(String)>
	//   15   36:athrow          
		if(mSendResultCalled)
	//*  16   37:aload_0         
	//*  17   38:getfield        #72  <Field boolean mSendResultCalled>
	//*  18   41:ifeq            74
			throw new IllegalStateException((new StringBuilder()).append("detach() called when sendResult() had already been called for: ").append(mDebug).toString());
	//   19   44:new             #53  <Class IllegalStateException>
	//   20   47:dup             
	//   21   48:new             #55  <Class StringBuilder>
	//   22   51:dup             
	//   23   52:invokespecial   #56  <Method void StringBuilder()>
	//   24   55:ldc1            #74  <String "detach() called when sendResult() had already been called for: ">
	//   25   57:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   26   60:aload_0         
	//   27   61:getfield        #24  <Field Object mDebug>
	//   28   64:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//   29   67:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   30   70:invokespecial   #70  <Method void IllegalStateException(String)>
	//   31   73:athrow          
		if(mSendErrorCalled)
	//*  32   74:aload_0         
	//*  33   75:getfield        #76  <Field boolean mSendErrorCalled>
	//*  34   78:ifeq            111
		{
			throw new IllegalStateException((new StringBuilder()).append("detach() called when sendError() had already been called for: ").append(mDebug).toString());
	//   35   81:new             #53  <Class IllegalStateException>
	//   36   84:dup             
	//   37   85:new             #55  <Class StringBuilder>
	//   38   88:dup             
	//   39   89:invokespecial   #56  <Method void StringBuilder()>
	//   40   92:ldc1            #78  <String "detach() called when sendError() had already been called for: ">
	//   41   94:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   42   97:aload_0         
	//   43   98:getfield        #24  <Field Object mDebug>
	//   44  101:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//   45  104:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   46  107:invokespecial   #70  <Method void IllegalStateException(String)>
	//   47  110:athrow          
		} else
		{
			mDetachCalled = true;
	//   48  111:aload_0         
	//   49  112:iconst_1        
	//   50  113:putfield        #51  <Field boolean mDetachCalled>
			return;
	//   51  116:return          
		}
	}

	int getFlags()
	{
		return mFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field int mFlags>
	//    2    4:ireturn         
	}

	boolean isDone()
	{
		return mDetachCalled || mSendResultCalled || mSendErrorCalled;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field boolean mDetachCalled>
	//    2    4:ifne            21
	//    3    7:aload_0         
	//    4    8:getfield        #72  <Field boolean mSendResultCalled>
	//    5   11:ifne            21
	//    6   14:aload_0         
	//    7   15:getfield        #76  <Field boolean mSendErrorCalled>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	void onErrorSent(Bundle bundle)
	{
		throw new UnsupportedOperationException((new StringBuilder()).append("It is not supported to send an error for ").append(mDebug).toString());
	//    0    0:new             #87  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:new             #55  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #56  <Method void StringBuilder()>
	//    5   11:ldc1            #89  <String "It is not supported to send an error for ">
	//    6   13:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_0         
	//    8   17:getfield        #24  <Field Object mDebug>
	//    9   20:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//   10   23:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   11   26:invokespecial   #90  <Method void UnsupportedOperationException(String)>
	//   12   29:athrow          
	}

	void onProgressUpdateSent(Bundle bundle)
	{
		throw new UnsupportedOperationException((new StringBuilder()).append("It is not supported to send an interim update for ").append(mDebug).toString());
	//    0    0:new             #87  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:new             #55  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #56  <Method void StringBuilder()>
	//    5   11:ldc1            #93  <String "It is not supported to send an interim update for ">
	//    6   13:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_0         
	//    8   17:getfield        #24  <Field Object mDebug>
	//    9   20:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//   10   23:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   11   26:invokespecial   #90  <Method void UnsupportedOperationException(String)>
	//   12   29:athrow          
	}

	void onResultSent(Object obj)
	{
	//    0    0:return          
	}

	public void sendError(Bundle bundle)
	{
		if(mSendResultCalled || mSendErrorCalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field boolean mSendResultCalled>
	//*   2    4:ifne            14
	//*   3    7:aload_0         
	//*   4    8:getfield        #76  <Field boolean mSendErrorCalled>
	//*   5   11:ifeq            44
		{
			throw new IllegalStateException((new StringBuilder()).append("sendError() called when either sendResult() or sendError() had already been called for: ").append(mDebug).toString());
	//    6   14:new             #53  <Class IllegalStateException>
	//    7   17:dup             
	//    8   18:new             #55  <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #56  <Method void StringBuilder()>
	//   11   25:ldc1            #99  <String "sendError() called when either sendResult() or sendError() had already been called for: ">
	//   12   27:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:aload_0         
	//   14   31:getfield        #24  <Field Object mDebug>
	//   15   34:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//   16   37:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   17   40:invokespecial   #70  <Method void IllegalStateException(String)>
	//   18   43:athrow          
		} else
		{
			mSendErrorCalled = true;
	//   19   44:aload_0         
	//   20   45:iconst_1        
	//   21   46:putfield        #76  <Field boolean mSendErrorCalled>
			onErrorSent(bundle);
	//   22   49:aload_0         
	//   23   50:aload_1         
	//   24   51:invokevirtual   #101 <Method void onErrorSent(Bundle)>
			return;
	//   25   54:return          
		}
	}

	public void sendProgressUpdate(Bundle bundle)
	{
		if(mSendResultCalled || mSendErrorCalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field boolean mSendResultCalled>
	//*   2    4:ifne            14
	//*   3    7:aload_0         
	//*   4    8:getfield        #76  <Field boolean mSendErrorCalled>
	//*   5   11:ifeq            44
		{
			throw new IllegalStateException((new StringBuilder()).append("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: ").append(mDebug).toString());
	//    6   14:new             #53  <Class IllegalStateException>
	//    7   17:dup             
	//    8   18:new             #55  <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #56  <Method void StringBuilder()>
	//   11   25:ldc1            #104 <String "sendProgressUpdate() called when either sendResult() or sendError() had already been called for: ">
	//   12   27:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:aload_0         
	//   14   31:getfield        #24  <Field Object mDebug>
	//   15   34:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//   16   37:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   17   40:invokespecial   #70  <Method void IllegalStateException(String)>
	//   18   43:athrow          
		} else
		{
			checkExtraFields(bundle);
	//   19   44:aload_0         
	//   20   45:aload_1         
	//   21   46:invokespecial   #106 <Method void checkExtraFields(Bundle)>
			mSendProgressUpdateCalled = true;
	//   22   49:aload_0         
	//   23   50:iconst_1        
	//   24   51:putfield        #108 <Field boolean mSendProgressUpdateCalled>
			onProgressUpdateSent(bundle);
	//   25   54:aload_0         
	//   26   55:aload_1         
	//   27   56:invokevirtual   #110 <Method void onProgressUpdateSent(Bundle)>
			return;
	//   28   59:return          
		}
	}

	public void sendResult(Object obj)
	{
		if(mSendResultCalled || mSendErrorCalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field boolean mSendResultCalled>
	//*   2    4:ifne            14
	//*   3    7:aload_0         
	//*   4    8:getfield        #76  <Field boolean mSendErrorCalled>
	//*   5   11:ifeq            44
		{
			throw new IllegalStateException((new StringBuilder()).append("sendResult() called when either sendResult() or sendError() had already been called for: ").append(mDebug).toString());
	//    6   14:new             #53  <Class IllegalStateException>
	//    7   17:dup             
	//    8   18:new             #55  <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #56  <Method void StringBuilder()>
	//   11   25:ldc1            #113 <String "sendResult() called when either sendResult() or sendError() had already been called for: ">
	//   12   27:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:aload_0         
	//   14   31:getfield        #24  <Field Object mDebug>
	//   15   34:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//   16   37:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   17   40:invokespecial   #70  <Method void IllegalStateException(String)>
	//   18   43:athrow          
		} else
		{
			mSendResultCalled = true;
	//   19   44:aload_0         
	//   20   45:iconst_1        
	//   21   46:putfield        #72  <Field boolean mSendResultCalled>
			onResultSent(obj);
	//   22   49:aload_0         
	//   23   50:aload_1         
	//   24   51:invokevirtual   #115 <Method void onResultSent(Object)>
			return;
	//   25   54:return          
		}
	}

	void setFlags(int i)
	{
		mFlags = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #82  <Field int mFlags>
	//    3    5:return          
	}

	private final Object mDebug;
	private boolean mDetachCalled;
	private int mFlags;
	private boolean mSendErrorCalled;
	private boolean mSendProgressUpdateCalled;
	private boolean mSendResultCalled;

	MediaBrowserServiceCompat$Result(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		mDebug = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field Object mDebug>
	//    5    9:return          
	}
}
