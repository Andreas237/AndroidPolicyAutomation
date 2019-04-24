// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;

// Referenced classes of package com.google.protobuf:
//			AbstractParser, DynamicMessage, InvalidProtocolBufferException, CodedInputStream, 
//			ExtensionRegistryLite

class DynamicMessage$1 extends AbstractParser
{

	public DynamicMessage parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		ilder ilder = DynamicMessage.newBuilder(DynamicMessage.access$200(DynamicMessage.this));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field DynamicMessage this$0>
	//    2    4:invokestatic    #30  <Method Descriptors$Descriptor DynamicMessage.access$200(DynamicMessage)>
	//    3    7:invokestatic    #34  <Method DynamicMessage$Builder DynamicMessage.newBuilder(Descriptors$Descriptor)>
	//    4   10:astore_3        
		try
		{
			ilder.mergeFrom(codedinputstream, extensionregistrylite);
	//    5   11:aload_3         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #40  <Method AbstractMessage$Builder DynamicMessage$Builder.mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//    9   17:pop             
		}
	//*  10   18:goto            48
		// Misplaced declaration of an exception variable
		catch(CodedInputStream codedinputstream)
	//*  11   21:astore_1        
		{
			throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (ilder.buildPartial())));
	//   12   22:aload_1         
	//   13   23:aload_3         
	//   14   24:invokevirtual   #44  <Method DynamicMessage DynamicMessage$Builder.buildPartial()>
	//   15   27:invokevirtual   #48  <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//   16   30:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(CodedInputStream codedinputstream)
	//*  17   31:astore_1        
		{
			throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (ilder.buildPartial())));
	//   18   32:new             #24  <Class InvalidProtocolBufferException>
	//   19   35:dup             
	//   20   36:aload_1         
	//   21   37:invokespecial   #51  <Method void InvalidProtocolBufferException(IOException)>
	//   22   40:aload_3         
	//   23   41:invokevirtual   #44  <Method DynamicMessage DynamicMessage$Builder.buildPartial()>
	//   24   44:invokevirtual   #48  <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//   25   47:athrow          
		}
		return ilder.buildPartial();
	//   26   48:aload_3         
	//   27   49:invokevirtual   #44  <Method DynamicMessage DynamicMessage$Builder.buildPartial()>
	//   28   52:areturn         
	}

	public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #55  <Method DynamicMessage parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	final DynamicMessage this$0;

	DynamicMessage$1()
	{
		this$0 = DynamicMessage.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field DynamicMessage this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void AbstractParser()>
	//    5    9:return          
	}
}
