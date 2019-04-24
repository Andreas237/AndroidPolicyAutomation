// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;


// Referenced classes of package com.fasterxml.jackson.databind.util:
//			PrimitiveArrayBuilder

static final class PrimitiveArrayBuilder$Node
{

	public int copyData(Object obj, int i)
	{
		System.arraycopy(_data, 0, obj, i, _dataLength);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Object _data>
	//    2    4:iconst_0        
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:aload_0         
	//    6    8:getfield        #25  <Field int _dataLength>
	//    7   11:invokestatic    #36  <Method void System.arraycopy(Object, int, Object, int, int)>
		return i + _dataLength;
	//    8   14:iload_2         
	//    9   15:aload_0         
	//   10   16:getfield        #25  <Field int _dataLength>
	//   11   19:iadd            
	//   12   20:ireturn         
	}

	public Object getData()
	{
		return _data;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Object _data>
	//    2    4:areturn         
	}

	public void linkNext(PrimitiveArrayBuilder$Node primitivearraybuilder$node)
	{
		if(_next != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field PrimitiveArrayBuilder$Node _next>
	//*   2    4:ifnull          15
		{
			throw new IllegalStateException();
	//    3    7:new             #46  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:invokespecial   #47  <Method void IllegalStateException()>
	//    6   14:athrow          
		} else
		{
			_next = primitivearraybuilder$node;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #44  <Field PrimitiveArrayBuilder$Node _next>
			return;
	//   10   20:return          
		}
	}

	public PrimitiveArrayBuilder$Node next()
	{
		return _next;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field PrimitiveArrayBuilder$Node _next>
	//    2    4:areturn         
	}

	final Object _data;
	final int _dataLength;
	PrimitiveArrayBuilder$Node _next;

	public PrimitiveArrayBuilder$Node(Object obj, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		_data = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Object _data>
		_dataLength = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #25  <Field int _dataLength>
	//    8   14:return          
	}
}
