// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//			Descriptors

static final class Descriptors$DescriptorPool$DescriptorIntPair
{

	public boolean equals(Object obj)
	{
		if(!(obj instanceof Descriptors$DescriptorPool$DescriptorIntPair))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class Descriptors$DescriptorPool$DescriptorIntPair>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		obj = ((Object) ((Descriptors$DescriptorPool$DescriptorIntPair)obj));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class Descriptors$DescriptorPool$DescriptorIntPair>
	//    7   13:astore_1        
		return descriptor == ((Descriptors$DescriptorPool$DescriptorIntPair) (obj)).descriptor && number == ((Descriptors$DescriptorPool$DescriptorIntPair) (obj)).number;
	//    8   14:aload_0         
	//    9   15:getfield        #21  <Field Descriptors$GenericDescriptor descriptor>
	//   10   18:aload_1         
	//   11   19:getfield        #21  <Field Descriptors$GenericDescriptor descriptor>
	//   12   22:if_acmpne       38
	//   13   25:aload_0         
	//   14   26:getfield        #23  <Field int number>
	//   15   29:aload_1         
	//   16   30:getfield        #23  <Field int number>
	//   17   33:icmpne          38
	//   18   36:iconst_1        
	//   19   37:ireturn         
	//   20   38:iconst_0        
	//   21   39:ireturn         
	}

	public int hashCode()
	{
		return ((Object) (descriptor)).hashCode() * 65535 + number;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Descriptors$GenericDescriptor descriptor>
	//    2    4:invokevirtual   #30  <Method int Object.hashCode()>
	//    3    7:ldc1            #31  <Int 65535>
	//    4    9:imul            
	//    5   10:aload_0         
	//    6   11:getfield        #23  <Field int number>
	//    7   14:iadd            
	//    8   15:ireturn         
	}

	private final Descriptors.GenericDescriptor descriptor;
	private final int number;

	Descriptors$DescriptorPool$DescriptorIntPair(Descriptors.GenericDescriptor genericdescriptor, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		descriptor = genericdescriptor;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Descriptors$GenericDescriptor descriptor>
		number = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field int number>
	//    8   14:return          
	}
}
