// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.sql.Timestamp;
import java.util.Date;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$22
	implements TypeAdapterFactory
{

	public TypeAdapter create(Gson gson, TypeToken typetoken)
	{
		if(typetoken.getRawType() != java/sql/Timestamp)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #23  <Method Class TypeToken.getRawType()>
	//*   2    4:ldc1            #25  <Class Timestamp>
	//*   3    6:if_acmpeq       11
			return null;
	//    4    9:aconst_null     
	//    5   10:areturn         
		else
			return ((TypeAdapter) (new TypeAdapter() {

				public volatile Object read(JsonReader jsonreader)
				{
					return ((Object) (read(jsonreader)));
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:invokevirtual   #29  <Method Timestamp read(JsonReader)>
				//    3    5:areturn         
				}

				public Timestamp read(JsonReader jsonreader)
				{
					jsonreader = ((JsonReader) ((Date)dateTypeAdapter.read(jsonreader)));
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field TypeAdapter val$dateTypeAdapter>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #31  <Method Object TypeAdapter.read(JsonReader)>
				//    4    8:checkcast       #33  <Class Date>
				//    5   11:astore_1        
					if(jsonreader != null)
				//*   6   12:aload_1         
				//*   7   13:ifnull          28
						return new Timestamp(((Date) (jsonreader)).getTime());
				//    8   16:new             #35  <Class Timestamp>
				//    9   19:dup             
				//   10   20:aload_1         
				//   11   21:invokevirtual   #39  <Method long Date.getTime()>
				//   12   24:invokespecial   #42  <Method void Timestamp(long)>
				//   13   27:areturn         
					else
						return null;
				//   14   28:aconst_null     
				//   15   29:areturn         
				}

				public volatile void write(JsonWriter jsonwriter, Object obj)
				{
					write(jsonwriter, (Timestamp)obj);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:aload_2         
				//    3    3:checkcast       #35  <Class Timestamp>
				//    4    6:invokevirtual   #47  <Method void write(JsonWriter, Timestamp)>
				//    5    9:return          
				}

				public void write(JsonWriter jsonwriter, Timestamp timestamp)
				{
					dateTypeAdapter.write(jsonwriter, ((Object) (timestamp)));
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field TypeAdapter val$dateTypeAdapter>
				//    2    4:aload_1         
				//    3    5:aload_2         
				//    4    6:invokevirtual   #49  <Method void TypeAdapter.write(JsonWriter, Object)>
				//    5    9:return          
				}

				final TypeAdapters._cls22 this$0;
				final TypeAdapter val$dateTypeAdapter;

			
			{
				this$0 = TypeAdapters._cls22.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field TypeAdapters$22 this$0>
				dateTypeAdapter = typeadapter;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field TypeAdapter val$dateTypeAdapter>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void TypeAdapter()>
			//    8   14:return          
			}
			}
));
	//    6   11:new             #10  <Class TypeAdapters$22$1>
	//    7   14:dup             
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:ldc1            #27  <Class Date>
	//   11   19:invokevirtual   #33  <Method TypeAdapter Gson.getAdapter(Class)>
	//   12   22:invokespecial   #36  <Method void TypeAdapters$22$1(TypeAdapters$22, TypeAdapter)>
	//   13   25:areturn         
	}

	TypeAdapters$22()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
