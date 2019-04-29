// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.IOException;

// Referenced classes of package com.crashlytics.android.core:
//			NativeCrashWriter, CodedOutputStream

private static abstract class NativeCrashWriter$ProtobufMessage
{

	public int getPropertiesSize()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getSize()
	{
		int i = getSizeNoTag();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method int getSizeNoTag()>
	//    2    4:istore_1        
		return i + CodedOutputStream.computeRawVarint32Size(i) + CodedOutputStream.computeTagSize(tag);
	//    3    5:iload_1         
	//    4    6:iload_1         
	//    5    7:invokestatic    #37  <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//    6   10:iadd            
	//    7   11:aload_0         
	//    8   12:getfield        #18  <Field int tag>
	//    9   15:invokestatic    #40  <Method int CodedOutputStream.computeTagSize(int)>
	//   10   18:iadd            
	//   11   19:ireturn         
	}

	public int getSizeNoTag()
	{
		int j = getPropertiesSize();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #42  <Method int getPropertiesSize()>
	//    2    4:istore_2        
		NativeCrashWriter$ProtobufMessage anativecrashwriter$protobufmessage[] = children;
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field NativeCrashWriter$ProtobufMessage[] children>
	//    5    9:astore          4
		int i = 0;
	//    6   11:iconst_0        
	//    7   12:istore_1        
		for(int k = anativecrashwriter$protobufmessage.length; i < k; i++)
	//*   8   13:aload           4
	//*   9   15:arraylength     
	//*  10   16:istore_3        
	//*  11   17:iload_1         
	//*  12   18:iload_3         
	//*  13   19:icmpge          39
			j += anativecrashwriter$protobufmessage[i].getSize();
	//   14   22:iload_2         
	//   15   23:aload           4
	//   16   25:iload_1         
	//   17   26:aaload          
	//   18   27:invokevirtual   #44  <Method int getSize()>
	//   19   30:iadd            
	//   20   31:istore_2        

	//   21   32:iload_1         
	//   22   33:iconst_1        
	//   23   34:iadd            
	//   24   35:istore_1        
	//*  25   36:goto            17
		return j;
	//   26   39:iload_2         
	//   27   40:ireturn         
	}

	public void write(CodedOutputStream codedoutputstream)
		throws IOException
	{
		codedoutputstream.writeTag(tag, 2);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field int tag>
	//    3    5:iconst_2        
	//    4    6:invokevirtual   #52  <Method void CodedOutputStream.writeTag(int, int)>
		codedoutputstream.writeRawVarint32(getSizeNoTag());
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #31  <Method int getSizeNoTag()>
	//    8   14:invokevirtual   #56  <Method void CodedOutputStream.writeRawVarint32(int)>
		writeProperties(codedoutputstream);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #59  <Method void writeProperties(CodedOutputStream)>
		NativeCrashWriter$ProtobufMessage anativecrashwriter$protobufmessage[] = children;
	//   12   22:aload_0         
	//   13   23:getfield        #24  <Field NativeCrashWriter$ProtobufMessage[] children>
	//   14   26:astore          4
		int i = 0;
	//   15   28:iconst_0        
	//   16   29:istore_2        
		for(int j = anativecrashwriter$protobufmessage.length; i < j; i++)
	//*  17   30:aload           4
	//*  18   32:arraylength     
	//*  19   33:istore_3        
	//*  20   34:iload_2         
	//*  21   35:iload_3         
	//*  22   36:icmpge          54
			anativecrashwriter$protobufmessage[i].write(codedoutputstream);
	//   23   39:aload           4
	//   24   41:iload_2         
	//   25   42:aaload          
	//   26   43:aload_1         
	//   27   44:invokevirtual   #61  <Method void write(CodedOutputStream)>

	//   28   47:iload_2         
	//   29   48:iconst_1        
	//   30   49:iadd            
	//   31   50:istore_2        
	//*  32   51:goto            34
	//   33   54:return          
	}

	public void writeProperties(CodedOutputStream codedoutputstream)
		throws IOException
	{
	//    0    0:return          
	}

	private final NativeCrashWriter$ProtobufMessage children[];
	private final int tag;

	public transient NativeCrashWriter$ProtobufMessage(int i, NativeCrashWriter$ProtobufMessage anativecrashwriter$protobufmessage[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		tag = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #18  <Field int tag>
		if(anativecrashwriter$protobufmessage == null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          16
	//*   7   13:goto            20
			anativecrashwriter$protobufmessage = NativeCrashWriter.access$000();
	//    8   16:invokestatic    #22  <Method NativeCrashWriter$ProtobufMessage[] NativeCrashWriter.access$000()>
	//    9   19:astore_2        
		children = anativecrashwriter$protobufmessage;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #24  <Field NativeCrashWriter$ProtobufMessage[] children>
	//   13   25:return          
	}
}