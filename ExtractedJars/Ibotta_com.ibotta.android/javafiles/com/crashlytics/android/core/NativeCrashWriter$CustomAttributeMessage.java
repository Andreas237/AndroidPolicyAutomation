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
	//    2    2:getfield        #20  <Field String key>
	//    3    5:invokestatic    #32  <Method ByteString ByteString.copyFromUtf8(String)>
	//    4    8:invokestatic    #38  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    5   11:istore_1        
		String s1 = value;
	//    6   12:aload_0         
	//    7   13:getfield        #23  <Field String value>
	//    8   16:astore_3        
		String s = s1;
	//    9   17:aload_3         
	//   10   18:astore_2        
		if(s1 == null)
	//*  11   19:aload_3         
	//*  12   20:ifnonnull       26
			s = "";
	//   13   23:ldc1            #40  <String "">
	//   14   25:astore_2        
		return i + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(s));
	//   15   26:iload_1         
	//   16   27:iconst_2        
	//   17   28:aload_2         
	//   18   29:invokestatic    #32  <Method ByteString ByteString.copyFromUtf8(String)>
	//   19   32:invokestatic    #38  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   20   35:iadd            
	//   21   36:ireturn         
	}

	public void writeProperties(CodedOutputStream codedoutputstream)
		throws IOException
	{
		codedoutputstream.writeBytes(1, ByteString.copyFromUtf8(key));
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:getfield        #20  <Field String key>
	//    4    6:invokestatic    #32  <Method ByteString ByteString.copyFromUtf8(String)>
	//    5    9:invokevirtual   #48  <Method void CodedOutputStream.writeBytes(int, ByteString)>
		String s1 = value;
	//    6   12:aload_0         
	//    7   13:getfield        #23  <Field String value>
	//    8   16:astore_3        
		String s = s1;
	//    9   17:aload_3         
	//   10   18:astore_2        
		if(s1 == null)
	//*  11   19:aload_3         
	//*  12   20:ifnonnull       26
			s = "";
	//   13   23:ldc1            #40  <String "">
	//   14   25:astore_2        
		codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(s));
	//   15   26:aload_1         
	//   16   27:iconst_2        
	//   17   28:aload_2         
	//   18   29:invokestatic    #32  <Method ByteString ByteString.copyFromUtf8(String)>
	//   19   32:invokevirtual   #48  <Method void CodedOutputStream.writeBytes(int, ByteString)>
	//   20   35:return          
	}

	private final String key;
	private final String value;

	public NativeCrashWriter$CustomAttributeMessage(CustomAttributeData customattributedata)
	{
		super(2, new NativeCrashWriter.ProtobufMessage[0]);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:iconst_0        
	//    3    3:anewarray       NativeCrashWriter.ProtobufMessage[]
	//    4    6:invokespecial   #15  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
		key = customattributedata.key;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #19  <Field String CustomAttributeData.key>
	//    8   14:putfield        #20  <Field String key>
		value = customattributedata.value;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:getfield        #22  <Field String CustomAttributeData.value>
	//   12   22:putfield        #23  <Field String value>
	//   13   25:return          
	}
}
