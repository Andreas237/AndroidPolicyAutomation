// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//			AbstractParser, DoubleValue, InvalidProtocolBufferException, CodedInputStream, 
//			ExtensionRegistryLite

static final class DoubleValue$1 extends AbstractParser
{

	public DoubleValue parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return new DoubleValue(codedinputstream, extensionregistrylite, ((DoubleValue$1) (null)));
	//    0    0:new             #7   <Class DoubleValue>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #19  <Method void DoubleValue(CodedInputStream, ExtensionRegistryLite, DoubleValue$1)>
	//    6   10:areturn         
	}

	public volatile Object parsePartialFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return ((Object) (parsePartialFrom(codedinputstream, extensionregistrylite)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #23  <Method DoubleValue parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:areturn         
	}

	DoubleValue$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AbstractParser()>
	//    2    4:return          
	}
}
