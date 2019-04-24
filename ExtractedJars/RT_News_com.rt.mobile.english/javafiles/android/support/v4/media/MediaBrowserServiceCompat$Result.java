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
		if(bundle == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(bundle.containsKey("android.media.browse.extra.DOWNLOAD_PROGRESS"))
	//*   3    5:aload_1         
	//*   4    6:ldc1            #29  <String "android.media.browse.extra.DOWNLOAD_PROGRESS">
	//*   5    8:invokevirtual   #35  <Method boolean Bundle.containsKey(String)>
	//*   6   11:ifeq            45
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
	//*  18   32:ifle            45
				throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0].");
	//   19   35:new             #43  <Class IllegalArgumentException>
	//   20   38:dup             
	//   21   39:ldc1            #45  <String "The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0].">
	//   22   41:invokespecial   #48  <Method void IllegalArgumentException(String)>
	//   23   44:athrow          
		}
	//   24   45:return          
	}

	public void detach()
	{
		if(mDetachCalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field boolean mDetachCalled>
	//*   2    4:ifeq            43
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #53  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #54  <Method void StringBuilder()>
	//    6   14:astore_1        
			stringbuilder.append("detach() called when detach() had already been called for: ");
	//    7   15:aload_1         
	//    8   16:ldc1            #56  <String "detach() called when detach() had already been called for: ">
	//    9   18:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
			stringbuilder.append(mDebug);
	//   11   22:aload_1         
	//   12   23:aload_0         
	//   13   24:getfield        #24  <Field Object mDebug>
	//   14   27:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   15   30:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   16   31:new             #65  <Class IllegalStateException>
	//   17   34:dup             
	//   18   35:aload_1         
	//   19   36:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   20   39:invokespecial   #70  <Method void IllegalStateException(String)>
	//   21   42:athrow          
		}
		if(mSendResultCalled)
	//*  22   43:aload_0         
	//*  23   44:getfield        #72  <Field boolean mSendResultCalled>
	//*  24   47:ifeq            86
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   25   50:new             #53  <Class StringBuilder>
	//   26   53:dup             
	//   27   54:invokespecial   #54  <Method void StringBuilder()>
	//   28   57:astore_1        
			stringbuilder1.append("detach() called when sendResult() had already been called for: ");
	//   29   58:aload_1         
	//   30   59:ldc1            #74  <String "detach() called when sendResult() had already been called for: ">
	//   31   61:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   32   64:pop             
			stringbuilder1.append(mDebug);
	//   33   65:aload_1         
	//   34   66:aload_0         
	//   35   67:getfield        #24  <Field Object mDebug>
	//   36   70:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   37   73:pop             
			throw new IllegalStateException(stringbuilder1.toString());
	//   38   74:new             #65  <Class IllegalStateException>
	//   39   77:dup             
	//   40   78:aload_1         
	//   41   79:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   42   82:invokespecial   #70  <Method void IllegalStateException(String)>
	//   43   85:athrow          
		}
		if(mSendErrorCalled)
	//*  44   86:aload_0         
	//*  45   87:getfield        #76  <Field boolean mSendErrorCalled>
	//*  46   90:ifeq            129
		{
			StringBuilder stringbuilder2 = new StringBuilder();
	//   47   93:new             #53  <Class StringBuilder>
	//   48   96:dup             
	//   49   97:invokespecial   #54  <Method void StringBuilder()>
	//   50  100:astore_1        
			stringbuilder2.append("detach() called when sendError() had already been called for: ");
	//   51  101:aload_1         
	//   52  102:ldc1            #78  <String "detach() called when sendError() had already been called for: ">
	//   53  104:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   54  107:pop             
			stringbuilder2.append(mDebug);
	//   55  108:aload_1         
	//   56  109:aload_0         
	//   57  110:getfield        #24  <Field Object mDebug>
	//   58  113:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   59  116:pop             
			throw new IllegalStateException(stringbuilder2.toString());
	//   60  117:new             #65  <Class IllegalStateException>
	//   61  120:dup             
	//   62  121:aload_1         
	//   63  122:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   64  125:invokespecial   #70  <Method void IllegalStateException(String)>
	//   65  128:athrow          
		} else
		{
			mDetachCalled = true;
	//   66  129:aload_0         
	//   67  130:iconst_1        
	//   68  131:putfield        #51  <Field boolean mDetachCalled>
			return;
	//   69  134:return          
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
	//    2    4:ifne            26
	//    3    7:aload_0         
	//    4    8:getfield        #72  <Field boolean mSendResultCalled>
	//    5   11:ifne            26
	//    6   14:aload_0         
	//    7   15:getfield        #76  <Field boolean mSendErrorCalled>
	//    8   18:ifeq            24
	//    9   21:goto            26
	//   10   24:iconst_0        
	//   11   25:ireturn         
	//   12   26:iconst_1        
	//   13   27:ireturn         
	}

	void onErrorSent(Bundle bundle)
	{
		bundle = ((Bundle) (new StringBuilder()));
	//    0    0:new             #53  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (bundle)).append("It is not supported to send an error for ");
	//    4    8:aload_1         
	//    5    9:ldc1            #87  <String "It is not supported to send an error for ">
	//    6   11:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (bundle)).append(mDebug);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #24  <Field Object mDebug>
	//   11   20:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		throw new UnsupportedOperationException(((StringBuilder) (bundle)).toString());
	//   13   24:new             #89  <Class UnsupportedOperationException>
	//   14   27:dup             
	//   15   28:aload_1         
	//   16   29:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   17   32:invokespecial   #90  <Method void UnsupportedOperationException(String)>
	//   18   35:athrow          
	}

	void onProgressUpdateSent(Bundle bundle)
	{
		bundle = ((Bundle) (new StringBuilder()));
	//    0    0:new             #53  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (bundle)).append("It is not supported to send an interim update for ");
	//    4    8:aload_1         
	//    5    9:ldc1            #93  <String "It is not supported to send an interim update for ">
	//    6   11:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (bundle)).append(mDebug);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #24  <Field Object mDebug>
	//   11   20:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		throw new UnsupportedOperationException(((StringBuilder) (bundle)).toString());
	//   13   24:new             #89  <Class UnsupportedOperationException>
	//   14   27:dup             
	//   15   28:aload_1         
	//   16   29:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   17   32:invokespecial   #90  <Method void UnsupportedOperationException(String)>
	//   18   35:athrow          
	}

	void onResultSent(Object obj)
	{
	//    0    0:return          
	}

	public void sendError(Bundle bundle)
	{
		if(!mSendResultCalled && !mSendErrorCalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field boolean mSendResultCalled>
	//*   2    4:ifne            28
	//*   3    7:aload_0         
	//*   4    8:getfield        #76  <Field boolean mSendErrorCalled>
	//*   5   11:ifeq            17
	//*   6   14:goto            28
		{
			mSendErrorCalled = true;
	//    7   17:aload_0         
	//    8   18:iconst_1        
	//    9   19:putfield        #76  <Field boolean mSendErrorCalled>
			onErrorSent(bundle);
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #99  <Method void onErrorSent(Bundle)>
			return;
	//   13   27:return          
		} else
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   14   28:new             #53  <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #54  <Method void StringBuilder()>
	//   17   35:astore_1        
			((StringBuilder) (bundle)).append("sendError() called when either sendResult() or sendError() had already been called for: ");
	//   18   36:aload_1         
	//   19   37:ldc1            #101 <String "sendError() called when either sendResult() or sendError() had already been called for: ">
	//   20   39:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   21   42:pop             
			((StringBuilder) (bundle)).append(mDebug);
	//   22   43:aload_1         
	//   23   44:aload_0         
	//   24   45:getfield        #24  <Field Object mDebug>
	//   25   48:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   26   51:pop             
			throw new IllegalStateException(((StringBuilder) (bundle)).toString());
	//   27   52:new             #65  <Class IllegalStateException>
	//   28   55:dup             
	//   29   56:aload_1         
	//   30   57:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   31   60:invokespecial   #70  <Method void IllegalStateException(String)>
	//   32   63:athrow          
		}
	}

	public void sendProgressUpdate(Bundle bundle)
	{
		if(!mSendResultCalled && !mSendErrorCalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field boolean mSendResultCalled>
	//*   2    4:ifne            33
	//*   3    7:aload_0         
	//*   4    8:getfield        #76  <Field boolean mSendErrorCalled>
	//*   5   11:ifeq            17
	//*   6   14:goto            33
		{
			checkExtraFields(bundle);
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:invokespecial   #104 <Method void checkExtraFields(Bundle)>
			mSendProgressUpdateCalled = true;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #106 <Field boolean mSendProgressUpdateCalled>
			onProgressUpdateSent(bundle);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #108 <Method void onProgressUpdateSent(Bundle)>
			return;
	//   16   32:return          
		} else
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   17   33:new             #53  <Class StringBuilder>
	//   18   36:dup             
	//   19   37:invokespecial   #54  <Method void StringBuilder()>
	//   20   40:astore_1        
			((StringBuilder) (bundle)).append("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: ");
	//   21   41:aload_1         
	//   22   42:ldc1            #110 <String "sendProgressUpdate() called when either sendResult() or sendError() had already been called for: ">
	//   23   44:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   24   47:pop             
			((StringBuilder) (bundle)).append(mDebug);
	//   25   48:aload_1         
	//   26   49:aload_0         
	//   27   50:getfield        #24  <Field Object mDebug>
	//   28   53:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   29   56:pop             
			throw new IllegalStateException(((StringBuilder) (bundle)).toString());
	//   30   57:new             #65  <Class IllegalStateException>
	//   31   60:dup             
	//   32   61:aload_1         
	//   33   62:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   34   65:invokespecial   #70  <Method void IllegalStateException(String)>
	//   35   68:athrow          
		}
	}

	public void sendResult(Object obj)
	{
		if(!mSendResultCalled && !mSendErrorCalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field boolean mSendResultCalled>
	//*   2    4:ifne            28
	//*   3    7:aload_0         
	//*   4    8:getfield        #76  <Field boolean mSendErrorCalled>
	//*   5   11:ifeq            17
	//*   6   14:goto            28
		{
			mSendResultCalled = true;
	//    7   17:aload_0         
	//    8   18:iconst_1        
	//    9   19:putfield        #72  <Field boolean mSendResultCalled>
			onResultSent(obj);
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #113 <Method void onResultSent(Object)>
			return;
	//   13   27:return          
		} else
		{
			obj = ((Object) (new StringBuilder()));
	//   14   28:new             #53  <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #54  <Method void StringBuilder()>
	//   17   35:astore_1        
			((StringBuilder) (obj)).append("sendResult() called when either sendResult() or sendError() had already been called for: ");
	//   18   36:aload_1         
	//   19   37:ldc1            #115 <String "sendResult() called when either sendResult() or sendError() had already been called for: ">
	//   20   39:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   21   42:pop             
			((StringBuilder) (obj)).append(mDebug);
	//   22   43:aload_1         
	//   23   44:aload_0         
	//   24   45:getfield        #24  <Field Object mDebug>
	//   25   48:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   26   51:pop             
			throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//   27   52:new             #65  <Class IllegalStateException>
	//   28   55:dup             
	//   29   56:aload_1         
	//   30   57:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   31   60:invokespecial   #70  <Method void IllegalStateException(String)>
	//   32   63:athrow          
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
