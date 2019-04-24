// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import com.crashlytics.android.core.internal.models.ThreadData;
import java.io.IOException;

// Referenced classes of package com.crashlytics.android.core:
//			NativeCrashWriter, ByteString, CodedOutputStream

private static final class NativeCrashWriter$ThreadMessage extends e
{

	private boolean hasName()
	{
		return name != null && name.length() > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String name>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field String name>
	//    5   11:invokevirtual   #35  <Method int String.length()>
	//    6   14:ifle            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public int getPropertiesSize()
	{
		int i;
		if(hasName())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #38  <Method boolean hasName()>
	//*   2    4:ifeq            30
			i = CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(name));
	//    3    7:iconst_1        
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field String name>
	//    6   12:invokestatic    #44  <Method ByteString ByteString.copyFromUtf8(String)>
	//    7   15:invokestatic    #50  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    8   18:istore_1        
		else
	//*   9   19:iconst_2        
	//*  10   20:aload_0         
	//*  11   21:getfield        #26  <Field int importance>
	//*  12   24:invokestatic    #54  <Method int CodedOutputStream.computeUInt32Size(int, int)>
	//*  13   27:iload_1         
	//*  14   28:iadd            
	//*  15   29:ireturn         
			i = 0;
	//   16   30:iconst_0        
	//   17   31:istore_1        
		return CodedOutputStream.computeUInt32Size(2, importance) + i;
	//*  18   32:goto            19
	}

	public void writeProperties(CodedOutputStream codedoutputstream)
		throws IOException
	{
		if(hasName())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #38  <Method boolean hasName()>
	//*   2    4:ifeq            19
			codedoutputstream.writeBytes(1, ByteString.copyFromUtf8(name));
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field String name>
	//    7   13:invokestatic    #44  <Method ByteString ByteString.copyFromUtf8(String)>
	//    8   16:invokevirtual   #62  <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeUInt32(2, importance);
	//    9   19:aload_1         
	//   10   20:iconst_2        
	//   11   21:aload_0         
	//   12   22:getfield        #26  <Field int importance>
	//   13   25:invokevirtual   #66  <Method void CodedOutputStream.writeUInt32(int, int)>
	//   14   28:return          
	}

	private static final int PROTOBUF_TAG = 1;
	private final int importance;
	private final String name;

	public NativeCrashWriter$ThreadMessage(ThreadData threaddata, e e)
	{
		super(1, new e[] {
			e
		});
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_1        
	//    3    3:anewarray       e[]
	//    4    6:dup             
	//    5    7:iconst_0        
	//    6    8:aload_2         
	//    7    9:aastore         
	//    8   10:invokespecial   #18  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
		name = threaddata.name;
	//    9   13:aload_0         
	//   10   14:aload_1         
	//   11   15:getfield        #22  <Field String ThreadData.name>
	//   12   18:putfield        #23  <Field String name>
		importance = threaddata.importance;
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:getfield        #25  <Field int ThreadData.importance>
	//   16   26:putfield        #26  <Field int importance>
	//   17   29:return          
	}
}
