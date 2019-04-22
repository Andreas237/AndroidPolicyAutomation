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
		String s = name;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String name>
	//    2    4:astore_1        
		return s != null && s.length() > 0;
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #33  <Method int String.length()>
	//    7   13:ifle            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public int getPropertiesSize()
	{
		int i;
		if(hasName())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #36  <Method boolean hasName()>
	//*   2    4:ifeq            22
			i = CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(name));
	//    3    7:iconst_1        
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field String name>
	//    6   12:invokestatic    #42  <Method ByteString ByteString.copyFromUtf8(String)>
	//    7   15:invokestatic    #48  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    8   18:istore_1        
		else
	//*   9   19:goto            24
			i = 0;
	//   10   22:iconst_0        
	//   11   23:istore_1        
		return CodedOutputStream.computeUInt32Size(2, importance) + i;
	//   12   24:iconst_2        
	//   13   25:aload_0         
	//   14   26:getfield        #24  <Field int importance>
	//   15   29:invokestatic    #52  <Method int CodedOutputStream.computeUInt32Size(int, int)>
	//   16   32:iload_1         
	//   17   33:iadd            
	//   18   34:ireturn         
	}

	public void writeProperties(CodedOutputStream codedoutputstream)
		throws IOException
	{
		if(hasName())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #36  <Method boolean hasName()>
	//*   2    4:ifeq            19
			codedoutputstream.writeBytes(1, ByteString.copyFromUtf8(name));
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field String name>
	//    7   13:invokestatic    #42  <Method ByteString ByteString.copyFromUtf8(String)>
	//    8   16:invokevirtual   #60  <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeUInt32(2, importance);
	//    9   19:aload_1         
	//   10   20:iconst_2        
	//   11   21:aload_0         
	//   12   22:getfield        #24  <Field int importance>
	//   13   25:invokevirtual   #64  <Method void CodedOutputStream.writeUInt32(int, int)>
	//   14   28:return          
	}

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
	//    8   10:invokespecial   #16  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
		name = threaddata.name;
	//    9   13:aload_0         
	//   10   14:aload_1         
	//   11   15:getfield        #20  <Field String ThreadData.name>
	//   12   18:putfield        #21  <Field String name>
		importance = threaddata.importance;
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:getfield        #23  <Field int ThreadData.importance>
	//   16   26:putfield        #24  <Field int importance>
	//   17   29:return          
	}
}
