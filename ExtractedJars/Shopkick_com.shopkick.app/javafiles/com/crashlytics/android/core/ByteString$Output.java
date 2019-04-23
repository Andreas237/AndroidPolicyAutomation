// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;

// Referenced classes of package com.crashlytics.android.core:
//			ByteString

static final class ByteString$Output extends FilterOutputStream
{

	public ByteString toByteString()
	{
		return new ByteString(bout.toByteArray(), ((ByteString._cls1) (null)));
	//    0    0:new             #6   <Class ByteString>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field ByteArrayOutputStream bout>
	//    4    8:invokevirtual   #28  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//    5   11:aconst_null     
	//    6   12:invokespecial   #31  <Method void ByteString(byte[], ByteString$1)>
	//    7   15:areturn         
	}

	private final ByteArrayOutputStream bout;

	private ByteString$Output(ByteArrayOutputStream bytearrayoutputstream)
	{
		super(((java.io.OutputStream) (bytearrayoutputstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void FilterOutputStream(java.io.OutputStream)>
		bout = bytearrayoutputstream;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #16  <Field ByteArrayOutputStream bout>
	//    6   10:return          
	}

	ByteString$Output(ByteArrayOutputStream bytearrayoutputstream, ByteString._cls1 _pcls1)
	{
		this(bytearrayoutputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void ByteString$Output(ByteArrayOutputStream)>
	//    3    5:return          
	}
}
