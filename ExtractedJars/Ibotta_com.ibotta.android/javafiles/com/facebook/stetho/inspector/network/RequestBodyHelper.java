// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;

import java.io.*;
import java.util.zip.InflaterOutputStream;

// Referenced classes of package com.facebook.stetho.inspector.network:
//			GunzippingOutputStream, CountingOutputStream, NetworkEventReporter

public class RequestBodyHelper
{

	public RequestBodyHelper(NetworkEventReporter networkeventreporter, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mEventReporter = networkeventreporter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field NetworkEventReporter mEventReporter>
		mRequestId = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field String mRequestId>
	//    8   14:return          
	}

	private void throwIfNoBody()
	{
		if(hasBody())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #27  <Method boolean hasBody()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		else
			throw new IllegalStateException("No body found; has createBodySink been called?");
	//    4    8:new             #29  <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:ldc1            #31  <String "No body found; has createBodySink been called?">
	//    7   14:invokespecial   #34  <Method void IllegalStateException(String)>
	//    8   17:athrow          
	}

	public OutputStream createBodySink(String s)
		throws IOException
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #41  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void ByteArrayOutputStream()>
	//    3    7:astore_2        
		if("gzip".equals(((Object) (s))))
	//*   4    8:ldc1            #44  <String "gzip">
	//*   5   10:aload_1         
	//*   6   11:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*   7   14:ifeq            25
			s = ((String) (GunzippingOutputStream.create(((OutputStream) (bytearrayoutputstream)))));
	//    8   17:aload_2         
	//    9   18:invokestatic    #56  <Method GunzippingOutputStream GunzippingOutputStream.create(OutputStream)>
	//   10   21:astore_1        
		else
	//*  11   22:goto            48
		if("deflate".equals(((Object) (s))))
	//*  12   25:ldc1            #58  <String "deflate">
	//*  13   27:aload_1         
	//*  14   28:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  15   31:ifeq            46
			s = ((String) (new InflaterOutputStream(((OutputStream) (bytearrayoutputstream)))));
	//   16   34:new             #60  <Class InflaterOutputStream>
	//   17   37:dup             
	//   18   38:aload_2         
	//   19   39:invokespecial   #63  <Method void InflaterOutputStream(OutputStream)>
	//   20   42:astore_1        
		else
	//*  21   43:goto            48
			s = ((String) (bytearrayoutputstream));
	//   22   46:aload_2         
	//   23   47:astore_1        
		mDeflatingOutput = new CountingOutputStream(((OutputStream) (s)));
	//   24   48:aload_0         
	//   25   49:new             #65  <Class CountingOutputStream>
	//   26   52:dup             
	//   27   53:aload_1         
	//   28   54:invokespecial   #66  <Method void CountingOutputStream(OutputStream)>
	//   29   57:putfield        #68  <Field CountingOutputStream mDeflatingOutput>
		mDeflatedOutput = bytearrayoutputstream;
	//   30   60:aload_0         
	//   31   61:aload_2         
	//   32   62:putfield        #70  <Field ByteArrayOutputStream mDeflatedOutput>
		return ((OutputStream) (mDeflatingOutput));
	//   33   65:aload_0         
	//   34   66:getfield        #68  <Field CountingOutputStream mDeflatingOutput>
	//   35   69:areturn         
	}

	public byte[] getDisplayBody()
	{
		throwIfNoBody();
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void throwIfNoBody()>
		return mDeflatedOutput.toByteArray();
	//    2    4:aload_0         
	//    3    5:getfield        #70  <Field ByteArrayOutputStream mDeflatedOutput>
	//    4    8:invokevirtual   #79  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//    5   11:areturn         
	}

	public boolean hasBody()
	{
		return mDeflatedOutput != null;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field ByteArrayOutputStream mDeflatedOutput>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void reportDataSent()
	{
		throwIfNoBody();
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void throwIfNoBody()>
		mEventReporter.dataSent(mRequestId, mDeflatedOutput.size(), (int)mDeflatingOutput.getCount());
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field NetworkEventReporter mEventReporter>
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field String mRequestId>
	//    6   12:aload_0         
	//    7   13:getfield        #70  <Field ByteArrayOutputStream mDeflatedOutput>
	//    8   16:invokevirtual   #84  <Method int ByteArrayOutputStream.size()>
	//    9   19:aload_0         
	//   10   20:getfield        #68  <Field CountingOutputStream mDeflatingOutput>
	//   11   23:invokevirtual   #88  <Method long CountingOutputStream.getCount()>
	//   12   26:l2i             
	//   13   27:invokeinterface #94  <Method void NetworkEventReporter.dataSent(String, int, int)>
	//   14   32:return          
	}

	private ByteArrayOutputStream mDeflatedOutput;
	private CountingOutputStream mDeflatingOutput;
	private final NetworkEventReporter mEventReporter;
	private final String mRequestId;
}
