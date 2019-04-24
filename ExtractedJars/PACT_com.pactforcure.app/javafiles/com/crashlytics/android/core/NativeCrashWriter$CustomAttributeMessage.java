// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import com.crashlytics.android.core.internal.models.CustomAttributeData;
import java.io.IOException;

// Referenced classes of package com.crashlytics.android.core:
//			NativeCrashWriter, ByteString, CodedOutputStream

private static final class NativeCrashWriter$CustomAttributeMessage extends NativeCrashWriter.ProtobufMessage
{

	public int getPropertiesSize()
	{
		int i = CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(key));
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:getfield        #23  <Field String key>
	//    3    5:invokestatic    #35  <Method ByteString ByteString.copyFromUtf8(String)>
	//    4    8:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    5   11:istore_1        
		String s;
		if(value == null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #26  <Field String value>
	//*   8   16:ifnonnull       33
			s = "";
	//    9   19:ldc1            #43  <String "">
	//   10   21:astore_2        
		else
	//*  11   22:iload_1         
	//*  12   23:iconst_2        
	//*  13   24:aload_2         
	//*  14   25:invokestatic    #35  <Method ByteString ByteString.copyFromUtf8(String)>
	//*  15   28:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//*  16   31:iadd            
	//*  17   32:ireturn         
			s = value;
	//   18   33:aload_0         
	//   19   34:getfield        #26  <Field String value>
	//   20   37:astore_2        
		return i + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(s));
	//*  21   38:goto            22
	}

	public void writeProperties(CodedOutputStream codedoutputstream)
		throws IOException
	{
		codedoutputstream.writeBytes(1, ByteString.copyFromUtf8(key));
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:getfield        #23  <Field String key>
	//    4    6:invokestatic    #35  <Method ByteString ByteString.copyFromUtf8(String)>
	//    5    9:invokevirtual   #51  <Method void CodedOutputStream.writeBytes(int, ByteString)>
		String s;
		if(value == null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #26  <Field String value>
	//*   8   16:ifnonnull       32
			s = "";
	//    9   19:ldc1            #43  <String "">
	//   10   21:astore_2        
		else
	//*  11   22:aload_1         
	//*  12   23:iconst_2        
	//*  13   24:aload_2         
	//*  14   25:invokestatic    #35  <Method ByteString ByteString.copyFromUtf8(String)>
	//*  15   28:invokevirtual   #51  <Method void CodedOutputStream.writeBytes(int, ByteString)>
	//*  16   31:return          
			s = value;
	//   17   32:aload_0         
	//   18   33:getfield        #26  <Field String value>
	//   19   36:astore_2        
		codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(s));
	//*  20   37:goto            22
	}

	private static final int PROTOBUF_TAG = 2;
	private final String key;
	private final String value;

	public NativeCrashWriter$CustomAttributeMessage(CustomAttributeData customattributedata)
	{
		super(2, new NativeCrashWriter.ProtobufMessage[0]);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:iconst_0        
	//    3    3:anewarray       NativeCrashWriter.ProtobufMessage[]
	//    4    6:invokespecial   #18  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
		key = customattributedata.key;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #22  <Field String CustomAttributeData.key>
	//    8   14:putfield        #23  <Field String key>
		value = customattributedata.value;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:getfield        #25  <Field String CustomAttributeData.value>
	//   12   22:putfield        #26  <Field String value>
	//   13   25:return          
	}
}
