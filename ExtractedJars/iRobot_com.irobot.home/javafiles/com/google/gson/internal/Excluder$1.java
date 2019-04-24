// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

// Referenced classes of package com.google.gson.internal:
//			Excluder

class Excluder$1 extends TypeAdapter
{

	private TypeAdapter _mthdelegate()
	{
		TypeAdapter typeadapter = _flddelegate;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field TypeAdapter _flddelegate>
	//    2    4:astore_1        
		if(typeadapter != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
		{
			return typeadapter;
	//    5    9:aload_1         
	//    6   10:areturn         
		} else
		{
			TypeAdapter typeadapter1 = val$gson.getDelegateAdapter(((com.google.gson.TypeAdapterFactory) (Excluder.this)), val$type);
	//    7   11:aload_0         
	//    8   12:getfield        #31  <Field Gson val$gson>
	//    9   15:aload_0         
	//   10   16:getfield        #25  <Field Excluder this$0>
	//   11   19:aload_0         
	//   12   20:getfield        #33  <Field TypeToken val$type>
	//   13   23:invokevirtual   #46  <Method TypeAdapter Gson.getDelegateAdapter(com.google.gson.TypeAdapterFactory, TypeToken)>
	//   14   26:astore_1        
			_flddelegate = typeadapter1;
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:putfield        #40  <Field TypeAdapter _flddelegate>
			return typeadapter1;
	//   18   32:aload_1         
	//   19   33:areturn         
		}
	}

	public Object read(JsonReader jsonreader)
	{
		if(val$skipDeserialize)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field boolean val$skipDeserialize>
	//*   2    4:ifeq            13
		{
			jsonreader.skipValue();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #55  <Method void JsonReader.skipValue()>
			return ((Object) (null));
	//    5   11:aconst_null     
	//    6   12:areturn         
		} else
		{
			return _mthdelegate().read(jsonreader);
	//    7   13:aload_0         
	//    8   14:invokespecial   #57  <Method TypeAdapter _mthdelegate()>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #59  <Method Object TypeAdapter.read(JsonReader)>
	//   11   21:areturn         
		}
	}

	public void write(JsonWriter jsonwriter, Object obj)
	{
		if(val$skipSerialize)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field boolean val$skipSerialize>
	//*   2    4:ifeq            13
		{
			jsonwriter.nullValue();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #68  <Method JsonWriter JsonWriter.nullValue()>
	//    5   11:pop             
			return;
	//    6   12:return          
		} else
		{
			_mthdelegate().write(jsonwriter, obj);
	//    7   13:aload_0         
	//    8   14:invokespecial   #57  <Method TypeAdapter _mthdelegate()>
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokevirtual   #70  <Method void TypeAdapter.write(JsonWriter, Object)>
			return;
	//   12   22:return          
		}
	}

	private TypeAdapter _flddelegate;
	final Excluder this$0;
	final Gson val$gson;
	final boolean val$skipDeserialize;
	final boolean val$skipSerialize;
	final TypeToken val$type;

	Excluder$1()
	{
		this$0 = final_excluder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field Excluder this$0>
		val$skipDeserialize = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #27  <Field boolean val$skipDeserialize>
		val$skipSerialize = flag1;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #29  <Field boolean val$skipSerialize>
		val$gson = gson1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #31  <Field Gson val$gson>
		val$type = TypeToken.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #33  <Field TypeToken val$type>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #36  <Method void TypeAdapter()>
	//   17   31:return          
	}
}
