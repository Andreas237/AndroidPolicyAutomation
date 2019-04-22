// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;

import java.io.IOException;

// Referenced classes of package com.facebook.stetho.inspector.network:
//			ResponseHandler, NetworkEventReporter

public class DefaultResponseHandler
	implements ResponseHandler
{

	public DefaultResponseHandler(NetworkEventReporter networkeventreporter, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mBytesRead = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #20  <Field int mBytesRead>
		mDecodedBytesRead = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #22  <Field int mDecodedBytesRead>
		mEventReporter = networkeventreporter;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #24  <Field NetworkEventReporter mEventReporter>
		mRequestId = s;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #26  <Field String mRequestId>
	//   14   24:return          
	}

	private void reportDataReceived()
	{
		NetworkEventReporter networkeventreporter = mEventReporter;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field NetworkEventReporter mEventReporter>
	//    2    4:astore_3        
		String s = mRequestId;
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field String mRequestId>
	//    5    9:astore          4
		int j = mBytesRead;
	//    6   11:aload_0         
	//    7   12:getfield        #20  <Field int mBytesRead>
	//    8   15:istore_2        
		int i = mDecodedBytesRead;
	//    9   16:aload_0         
	//   10   17:getfield        #22  <Field int mDecodedBytesRead>
	//   11   20:istore_1        
		if(i < 0)
	//*  12   21:iload_1         
	//*  13   22:iflt            28
	//*  14   25:goto            30
			i = j;
	//   15   28:iload_2         
	//   16   29:istore_1        
		networkeventreporter.dataReceived(s, j, i);
	//   17   30:aload_3         
	//   18   31:aload           4
	//   19   33:iload_2         
	//   20   34:iload_1         
	//   21   35:invokeinterface #34  <Method void NetworkEventReporter.dataReceived(String, int, int)>
	//   22   40:return          
	}

	public void onEOF()
	{
		reportDataReceived();
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void reportDataReceived()>
		mEventReporter.responseReadFinished(mRequestId);
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field NetworkEventReporter mEventReporter>
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field String mRequestId>
	//    6   12:invokeinterface #41  <Method void NetworkEventReporter.responseReadFinished(String)>
	//    7   17:return          
	}

	public void onError(IOException ioexception)
	{
		reportDataReceived();
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void reportDataReceived()>
		mEventReporter.responseReadFailed(mRequestId, ioexception.toString());
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field NetworkEventReporter mEventReporter>
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field String mRequestId>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #49  <Method String IOException.toString()>
	//    8   16:invokeinterface #53  <Method void NetworkEventReporter.responseReadFailed(String, String)>
	//    9   21:return          
	}

	public void onRead(int i)
	{
		mBytesRead = mBytesRead + i;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field int mBytesRead>
	//    3    5:iload_1         
	//    4    6:iadd            
	//    5    7:putfield        #20  <Field int mBytesRead>
	//    6   10:return          
	}

	public void onReadDecoded(int i)
	{
		if(mDecodedBytesRead == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field int mDecodedBytesRead>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          13
			mDecodedBytesRead = 0;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #22  <Field int mDecodedBytesRead>
		mDecodedBytesRead = mDecodedBytesRead + i;
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #22  <Field int mDecodedBytesRead>
	//   10   18:iload_1         
	//   11   19:iadd            
	//   12   20:putfield        #22  <Field int mDecodedBytesRead>
	//   13   23:return          
	}

	private int mBytesRead;
	private int mDecodedBytesRead;
	private final NetworkEventReporter mEventReporter;
	private final String mRequestId;
}
