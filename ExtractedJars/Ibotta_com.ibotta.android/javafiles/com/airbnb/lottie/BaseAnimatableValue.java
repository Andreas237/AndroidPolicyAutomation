// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import java.util.*;

// Referenced classes of package com.airbnb.lottie:
//			AnimatableValue

abstract class BaseAnimatableValue
	implements AnimatableValue
{

	BaseAnimatableValue(Object obj)
	{
		this(Collections.emptyList(), obj);
	//    0    0:aload_0         
	//    1    1:invokestatic    #21  <Method List Collections.emptyList()>
	//    2    4:aload_1         
	//    3    5:invokespecial   #24  <Method void BaseAnimatableValue(List, Object)>
	//    4    8:return          
	}

	BaseAnimatableValue(List list, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		keyframes = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field List keyframes>
		initialValue = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #34  <Field Object initialValue>
	//    8   14:return          
	}

	Object convertType(Object obj)
	{
		return obj;
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	public Object getInitialValue()
	{
		return convertType(initialValue);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #34  <Field Object initialValue>
	//    3    5:invokevirtual   #42  <Method Object convertType(Object)>
	//    4    8:areturn         
	}

	public boolean hasAnimation()
	{
		return keyframes.isEmpty() ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field List keyframes>
	//    2    4:invokeinterface #50  <Method boolean List.isEmpty()>
	//    3    9:iconst_1        
	//    4   10:ixor            
	//    5   11:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #54  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("parseInitialValue=");
	//    4    8:aload_1         
	//    5    9:ldc1            #57  <String "parseInitialValue=">
	//    6   11:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(initialValue);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #34  <Field Object initialValue>
	//   11   20:invokevirtual   #64  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		if(!keyframes.isEmpty())
	//*  13   24:aload_0         
	//*  14   25:getfield        #32  <Field List keyframes>
	//*  15   28:invokeinterface #50  <Method boolean List.isEmpty()>
	//*  16   33:ifne            60
		{
			stringbuilder.append(", values=");
	//   17   36:aload_1         
	//   18   37:ldc1            #66  <String ", values=">
	//   19   39:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   20   42:pop             
			stringbuilder.append(Arrays.toString(keyframes.toArray()));
	//   21   43:aload_1         
	//   22   44:aload_0         
	//   23   45:getfield        #32  <Field List keyframes>
	//   24   48:invokeinterface #70  <Method Object[] List.toArray()>
	//   25   53:invokestatic    #75  <Method String Arrays.toString(Object[])>
	//   26   56:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   27   59:pop             
		}
		return stringbuilder.toString();
	//   28   60:aload_1         
	//   29   61:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   30   64:areturn         
	}

	final Object initialValue;
	final List keyframes;
}
