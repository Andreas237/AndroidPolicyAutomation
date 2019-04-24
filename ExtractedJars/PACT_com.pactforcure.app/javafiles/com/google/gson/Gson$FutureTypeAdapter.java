// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

// Referenced classes of package com.google.gson:
//			TypeAdapter, Gson

static class Gson$FutureTypeAdapter extends TypeAdapter
{

	public Object read(JsonReader jsonreader)
		throws IOException
	{
		if(_flddelegate == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field TypeAdapter _flddelegate>
	//*   2    4:ifnonnull       15
			throw new IllegalStateException();
	//    3    7:new             #24  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:invokespecial   #25  <Method void IllegalStateException()>
	//    6   14:athrow          
		else
			return _flddelegate.read(jsonreader);
	//    7   15:aload_0         
	//    8   16:getfield        #22  <Field TypeAdapter _flddelegate>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #27  <Method Object TypeAdapter.read(JsonReader)>
	//   11   23:areturn         
	}

	public void setDelegate(TypeAdapter typeadapter)
	{
		if(_flddelegate != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field TypeAdapter _flddelegate>
	//*   2    4:ifnull          15
		{
			throw new AssertionError();
	//    3    7:new             #34  <Class AssertionError>
	//    4   10:dup             
	//    5   11:invokespecial   #35  <Method void AssertionError()>
	//    6   14:athrow          
		} else
		{
			_flddelegate = typeadapter;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #22  <Field TypeAdapter _flddelegate>
			return;
	//   10   20:return          
		}
	}

	public void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		if(_flddelegate == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field TypeAdapter _flddelegate>
	//*   2    4:ifnonnull       15
		{
			throw new IllegalStateException();
	//    3    7:new             #24  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:invokespecial   #25  <Method void IllegalStateException()>
	//    6   14:athrow          
		} else
		{
			_flddelegate.write(jsonwriter, obj);
	//    7   15:aload_0         
	//    8   16:getfield        #22  <Field TypeAdapter _flddelegate>
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokevirtual   #40  <Method void TypeAdapter.write(JsonWriter, Object)>
			return;
	//   12   24:return          
		}
	}

	private TypeAdapter _flddelegate;

	Gson$FutureTypeAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
