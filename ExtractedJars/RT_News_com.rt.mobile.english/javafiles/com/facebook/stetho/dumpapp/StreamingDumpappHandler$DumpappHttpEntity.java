// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.dumpapp;

import java.io.*;
import org.apache.http.HttpRequest;
import org.apache.http.entity.AbstractHttpEntity;

// Referenced classes of package com.facebook.stetho.dumpapp:
//			StreamingDumpappHandler, Dumper

private class StreamingDumpappHandler$DumpappHttpEntity extends AbstractHttpEntity
{

	public InputStream getContent()
		throws IOException, IllegalStateException
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #37  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public long getContentLength()
	{
		return -1L;
	//    0    0:ldc2w           #42  <Long -1L>
	//    1    3:lreturn         
	}

	public boolean isRepeatable()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isStreaming()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void writeTo(OutputStream outputstream)
		throws IOException
	{
		StreamingDumpappHandler.access$000(mRequest, mDumper, mInput, outputstream);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field HttpRequest mRequest>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field Dumper mDumper>
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field InputStream mInput>
	//    6   12:aload_1         
	//    7   13:invokestatic    #52  <Method void StreamingDumpappHandler.access$000(HttpRequest, Dumper, InputStream, OutputStream)>
	//    8   16:return          
	}

	private final Dumper mDumper;
	private final InputStream mInput;
	private final HttpRequest mRequest;
	final StreamingDumpappHandler this$0;

	StreamingDumpappHandler$DumpappHttpEntity(HttpRequest httprequest, Dumper dumper, InputStream inputstream)
	{
		this$0 = StreamingDumpappHandler.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field StreamingDumpappHandler this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void AbstractHttpEntity()>
		mRequest = httprequest;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field HttpRequest mRequest>
		mDumper = dumper;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field Dumper mDumper>
		mInput = inputstream;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #28  <Field InputStream mInput>
	//   14   25:return          
	}
}
