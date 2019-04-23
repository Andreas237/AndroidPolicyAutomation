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
	//*   6   11:ifeq            46
		{
			float f = bundle.getFloat("android.media.browse.extra.DOWNLOAD_PROGRESS");
	//    7   14:aload_1         
	//    8   15:ldc1            #29  <String "android.media.browse.extra.DOWNLOAD_PROGRESS">
	//    9   17:invokevirtual   #39  <Method float Bundle.getFloat(String)>
	//   10   20:fstore_2        
			if(f >= -1E-05F && f <= 1.00001F)
	//*  11   21:fload_2         
	//*  12   22:ldc1            #40  <Float -1E-05F>
	//*  13   24:fcmpg           
	//*  14   25:iflt            36
	//*  15   28:fload_2         
	//*  16   29:ldc1            #41  <Float 1.00001F>
	//*  17   31:fcmpl           
	//*  18   32:ifgt            36
				return;
	//   19   35:return          
			else
				throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0].");
	//   20   36:new             #43  <Class IllegalArgumentException>
	//   21   39:dup             
	//   22   40:ldc1            #45  <String "The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0].">
	//   23   42:invokespecial   #48  <Method void IllegalArgumentException(String)>
	//   24   45:athrow          
		} else
		{
			return;
	//   25   46:return          
		}
	}

	public void detach()
	{
		if(!mDetachCalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field boolean mDetachCalled>
	//*   2    4:ifne            99
		{
			if(!mSendResultCalled)
	//*   3    7:aload_0         
	//*   4    8:getfield        #53  <Field boolean mSendResultCalled>
	//*   5   11:ifne            63
			{
				if(!mSendErrorCalled)
	//*   6   14:aload_0         
	//*   7   15:getfield        #55  <Field boolean mSendErrorCalled>
	//*   8   18:ifne            27
				{
					mDetachCalled = true;
	//    9   21:aload_0         
	//   10   22:iconst_1        
	//   11   23:putfield        #51  <Field boolean mDetachCalled>
					return;
	//   12   26:return          
				} else
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   13   27:new             #57  <Class StringBuilder>
	//   14   30:dup             
	//   15   31:invokespecial   #58  <Method void StringBuilder()>
	//   16   34:astore_1        
					stringbuilder.append("detach() called when sendError() had already been called for: ");
	//   17   35:aload_1         
	//   18   36:ldc1            #60  <String "detach() called when sendError() had already been called for: ">
	//   19   38:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
					stringbuilder.append(mDebug);
	//   21   42:aload_1         
	//   22   43:aload_0         
	//   23   44:getfield        #24  <Field Object mDebug>
	//   24   47:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//   25   50:pop             
					throw new IllegalStateException(stringbuilder.toString());
	//   26   51:new             #69  <Class IllegalStateException>
	//   27   54:dup             
	//   28   55:aload_1         
	//   29   56:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   30   59:invokespecial   #74  <Method void IllegalStateException(String)>
	//   31   62:athrow          
				}
			} else
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   32   63:new             #57  <Class StringBuilder>
	//   33   66:dup             
	//   34   67:invokespecial   #58  <Method void StringBuilder()>
	//   35   70:astore_1        
				stringbuilder1.append("detach() called when sendResult() had already been called for: ");
	//   36   71:aload_1         
	//   37   72:ldc1            #76  <String "detach() called when sendResult() had already been called for: ">
	//   38   74:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   39   77:pop             
				stringbuilder1.append(mDebug);
	//   40   78:aload_1         
	//   41   79:aload_0         
	//   42   80:getfield        #24  <Field Object mDebug>
	//   43   83:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//   44   86:pop             
				throw new IllegalStateException(stringbuilder1.toString());
	//   45   87:new             #69  <Class IllegalStateException>
	//   46   90:dup             
	//   47   91:aload_1         
	//   48   92:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   49   95:invokespecial   #74  <Method void IllegalStateException(String)>
	//   50   98:athrow          
			}
		} else
		{
			StringBuilder stringbuilder2 = new StringBuilder();
	//   51   99:new             #57  <Class StringBuilder>
	//   52  102:dup             
	//   53  103:invokespecial   #58  <Method void StringBuilder()>
	//   54  106:astore_1        
			stringbuilder2.append("detach() called when detach() had already been called for: ");
	//   55  107:aload_1         
	//   56  108:ldc1            #78  <String "detach() called when detach() had already been called for: ">
	//   57  110:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   58  113:pop             
			stringbuilder2.append(mDebug);
	//   59  114:aload_1         
	//   60  115:aload_0         
	//   61  116:getfield        #24  <Field Object mDebug>
	//   62  119:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//   63  122:pop             
			throw new IllegalStateException(stringbuilder2.toString());
	//   64  123:new             #69  <Class IllegalStateException>
	//   65  126:dup             
	//   66  127:aload_1         
	//   67  128:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   68  131:invokespecial   #74  <Method void IllegalStateException(String)>
	//   69  134:athrow          
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
	//    4    8:getfield        #53  <Field boolean mSendResultCalled>
	//    5   11:ifne            26
	//    6   14:aload_0         
	//    7   15:getfield        #55  <Field boolean mSendErrorCalled>
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
	//    0    0:new             #57  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (bundle)).append("It is not supported to send an error for ");
	//    4    8:aload_1         
	//    5    9:ldc1            #87  <String "It is not supported to send an error for ">
	//    6   11:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (bundle)).append(mDebug);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #24  <Field Object mDebug>
	//   11   20:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		throw new UnsupportedOperationException(((StringBuilder) (bundle)).toString());
	//   13   24:new             #89  <Class UnsupportedOperationException>
	//   14   27:dup             
	//   15   28:aload_1         
	//   16   29:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   17   32:invokespecial   #90  <Method void UnsupportedOperationException(String)>
	//   18   35:athrow          
	}

	void onProgressUpdateSent(Bundle bundle)
	{
		bundle = ((Bundle) (new StringBuilder()));
	//    0    0:new             #57  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (bundle)).append("It is not supported to send an interim update for ");
	//    4    8:aload_1         
	//    5    9:ldc1            #93  <String "It is not supported to send an interim update for ">
	//    6   11:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (bundle)).append(mDebug);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #24  <Field Object mDebug>
	//   11   20:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		throw new UnsupportedOperationException(((StringBuilder) (bundle)).toString());
	//   13   24:new             #89  <Class UnsupportedOperationException>
	//   14   27:dup             
	//   15   28:aload_1         
	//   16   29:invokevirtual   #73  <Method String StringBuilder.toString()>
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
	//*   1    1:getfield        #53  <Field boolean mSendResultCalled>
	//*   2    4:ifne            25
	//*   3    7:aload_0         
	//*   4    8:getfield        #55  <Field boolean mSendErrorCalled>
	//*   5   11:ifne            25
		{
			mSendErrorCalled = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #55  <Field boolean mSendErrorCalled>
			onErrorSent(bundle);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #99  <Method void onErrorSent(Bundle)>
			return;
	//   12   24:return          
		} else
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   13   25:new             #57  <Class StringBuilder>
	//   14   28:dup             
	//   15   29:invokespecial   #58  <Method void StringBuilder()>
	//   16   32:astore_1        
			((StringBuilder) (bundle)).append("sendError() called when either sendResult() or sendError() had already been called for: ");
	//   17   33:aload_1         
	//   18   34:ldc1            #101 <String "sendError() called when either sendResult() or sendError() had already been called for: ">
	//   19   36:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
			((StringBuilder) (bundle)).append(mDebug);
	//   21   40:aload_1         
	//   22   41:aload_0         
	//   23   42:getfield        #24  <Field Object mDebug>
	//   24   45:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//   25   48:pop             
			throw new IllegalStateException(((StringBuilder) (bundle)).toString());
	//   26   49:new             #69  <Class IllegalStateException>
	//   27   52:dup             
	//   28   53:aload_1         
	//   29   54:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   30   57:invokespecial   #74  <Method void IllegalStateException(String)>
	//   31   60:athrow          
		}
	}

	public void sendProgressUpdate(Bundle bundle)
	{
		if(!mSendResultCalled && !mSendErrorCalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field boolean mSendResultCalled>
	//*   2    4:ifne            30
	//*   3    7:aload_0         
	//*   4    8:getfield        #55  <Field boolean mSendErrorCalled>
	//*   5   11:ifne            30
		{
			checkExtraFields(bundle);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokespecial   #104 <Method void checkExtraFields(Bundle)>
			mSendProgressUpdateCalled = true;
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:putfield        #106 <Field boolean mSendProgressUpdateCalled>
			onProgressUpdateSent(bundle);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #108 <Method void onProgressUpdateSent(Bundle)>
			return;
	//   15   29:return          
		} else
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   16   30:new             #57  <Class StringBuilder>
	//   17   33:dup             
	//   18   34:invokespecial   #58  <Method void StringBuilder()>
	//   19   37:astore_1        
			((StringBuilder) (bundle)).append("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: ");
	//   20   38:aload_1         
	//   21   39:ldc1            #110 <String "sendProgressUpdate() called when either sendResult() or sendError() had already been called for: ">
	//   22   41:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			((StringBuilder) (bundle)).append(mDebug);
	//   24   45:aload_1         
	//   25   46:aload_0         
	//   26   47:getfield        #24  <Field Object mDebug>
	//   27   50:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//   28   53:pop             
			throw new IllegalStateException(((StringBuilder) (bundle)).toString());
	//   29   54:new             #69  <Class IllegalStateException>
	//   30   57:dup             
	//   31   58:aload_1         
	//   32   59:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   33   62:invokespecial   #74  <Method void IllegalStateException(String)>
	//   34   65:athrow          
		}
	}

	public void sendResult(Object obj)
	{
		if(!mSendResultCalled && !mSendErrorCalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field boolean mSendResultCalled>
	//*   2    4:ifne            25
	//*   3    7:aload_0         
	//*   4    8:getfield        #55  <Field boolean mSendErrorCalled>
	//*   5   11:ifne            25
		{
			mSendResultCalled = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #53  <Field boolean mSendResultCalled>
			onResultSent(obj);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #113 <Method void onResultSent(Object)>
			return;
	//   12   24:return          
		} else
		{
			obj = ((Object) (new StringBuilder()));
	//   13   25:new             #57  <Class StringBuilder>
	//   14   28:dup             
	//   15   29:invokespecial   #58  <Method void StringBuilder()>
	//   16   32:astore_1        
			((StringBuilder) (obj)).append("sendResult() called when either sendResult() or sendError() had already been called for: ");
	//   17   33:aload_1         
	//   18   34:ldc1            #115 <String "sendResult() called when either sendResult() or sendError() had already been called for: ">
	//   19   36:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
			((StringBuilder) (obj)).append(mDebug);
	//   21   40:aload_1         
	//   22   41:aload_0         
	//   23   42:getfield        #24  <Field Object mDebug>
	//   24   45:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
	//   25   48:pop             
			throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//   26   49:new             #69  <Class IllegalStateException>
	//   27   52:dup             
	//   28   53:aload_1         
	//   29   54:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   30   57:invokespecial   #74  <Method void IllegalStateException(String)>
	//   31   60:athrow          
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
