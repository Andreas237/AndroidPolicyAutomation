// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.IOException;

// Referenced classes of package com.crashlytics.android.core:
//			NativeCrashWriter, CodedOutputStream

private static final class NativeCrashWriter$RepeatedMessage extends NativeCrashWriter$ProtobufMessage
{

	public int getSize()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		NativeCrashWriter$ProtobufMessage anativecrashwriter$protobufmessage[] = messages;
	//    2    2:aload_0         
	//    3    3:getfield        #16  <Field NativeCrashWriter$ProtobufMessage[] messages>
	//    4    6:astore          4
		int k = anativecrashwriter$protobufmessage.length;
	//    5    8:aload           4
	//    6   10:arraylength     
	//    7   11:istore_3        
		for(int i = 0; i < k; i++)
	//*   8   12:iconst_0        
	//*   9   13:istore_1        
	//*  10   14:iload_1         
	//*  11   15:iload_3         
	//*  12   16:icmpge          36
			j += anativecrashwriter$protobufmessage[i].getSize();
	//   13   19:iload_2         
	//   14   20:aload           4
	//   15   22:iload_1         
	//   16   23:aaload          
	//   17   24:invokevirtual   #21  <Method int NativeCrashWriter$ProtobufMessage.getSize()>
	//   18   27:iadd            
	//   19   28:istore_2        

	//   20   29:iload_1         
	//   21   30:iconst_1        
	//   22   31:iadd            
	//   23   32:istore_1        
	//*  24   33:goto            14
		return j;
	//   25   36:iload_2         
	//   26   37:ireturn         
	}

	public void write(CodedOutputStream codedoutputstream)
		throws IOException
	{
		NativeCrashWriter$ProtobufMessage anativecrashwriter$protobufmessage[] = messages;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field NativeCrashWriter$ProtobufMessage[] messages>
	//    2    4:astore          4
		int j = anativecrashwriter$protobufmessage.length;
	//    3    6:aload           4
	//    4    8:arraylength     
	//    5    9:istore_3        
		for(int i = 0; i < j; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:iload_3         
	//*  10   14:icmpge          32
			anativecrashwriter$protobufmessage[i].write(codedoutputstream);
	//   11   17:aload           4
	//   12   19:iload_2         
	//   13   20:aaload          
	//   14   21:aload_1         
	//   15   22:invokevirtual   #27  <Method void NativeCrashWriter$ProtobufMessage.write(CodedOutputStream)>

	//   16   25:iload_2         
	//   17   26:iconst_1        
	//   18   27:iadd            
	//   19   28:istore_2        
	//*  20   29:goto            12
	//   21   32:return          
	}

	private final NativeCrashWriter$ProtobufMessage messages[];

	public transient NativeCrashWriter$RepeatedMessage(NativeCrashWriter$ProtobufMessage anativecrashwriter$protobufmessage[])
	{
		super(0, new NativeCrashWriter$ProtobufMessage[0]);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:anewarray       NativeCrashWriter$ProtobufMessage[]
	//    4    6:invokespecial   #14  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
		messages = anativecrashwriter$protobufmessage;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #16  <Field NativeCrashWriter$ProtobufMessage[] messages>
	//    8   14:return          
	}
}
