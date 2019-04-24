// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongArray;

// Referenced classes of package com.google.gson:
//			TypeAdapter, Gson

static final class Gson$5 extends TypeAdapter
{

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #27  <Method AtomicLongArray read(JsonReader)>
	//    3    5:areturn         
	}

	public AtomicLongArray read(JsonReader jsonreader)
		throws IOException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #30  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void ArrayList()>
	//    3    7:astore          4
		jsonreader.beginArray();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #36  <Method void JsonReader.beginArray()>
		for(; jsonreader.hasNext(); ((List) (arraylist)).add(((Object) (Long.valueOf(((Number)val$longAdapter.read(jsonreader)).longValue())))));
	//    6   13:aload_1         
	//    7   14:invokevirtual   #40  <Method boolean JsonReader.hasNext()>
	//    8   17:ifeq            48
	//    9   20:aload           4
	//   10   22:aload_0         
	//   11   23:getfield        #16  <Field TypeAdapter val$longAdapter>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #42  <Method Object TypeAdapter.read(JsonReader)>
	//   14   30:checkcast       #44  <Class Number>
	//   15   33:invokevirtual   #48  <Method long Number.longValue()>
	//   16   36:invokestatic    #54  <Method Long Long.valueOf(long)>
	//   17   39:invokeinterface #60  <Method boolean List.add(Object)>
	//   18   44:pop             
	//*  19   45:goto            13
		jsonreader.endArray();
	//   20   48:aload_1         
	//   21   49:invokevirtual   #63  <Method void JsonReader.endArray()>
		int j = ((List) (arraylist)).size();
	//   22   52:aload           4
	//   23   54:invokeinterface #67  <Method int List.size()>
	//   24   59:istore_3        
		jsonreader = ((JsonReader) (new AtomicLongArray(j)));
	//   25   60:new             #69  <Class AtomicLongArray>
	//   26   63:dup             
	//   27   64:iload_3         
	//   28   65:invokespecial   #72  <Method void AtomicLongArray(int)>
	//   29   68:astore_1        
		for(int i = 0; i < j; i++)
	//*  30   69:iconst_0        
	//*  31   70:istore_2        
	//*  32   71:iload_2         
	//*  33   72:iload_3         
	//*  34   73:icmpge          102
			((AtomicLongArray) (jsonreader)).set(i, ((Long)((List) (arraylist)).get(i)).longValue());
	//   35   76:aload_1         
	//   36   77:iload_2         
	//   37   78:aload           4
	//   38   80:iload_2         
	//   39   81:invokeinterface #76  <Method Object List.get(int)>
	//   40   86:checkcast       #50  <Class Long>
	//   41   89:invokevirtual   #77  <Method long Long.longValue()>
	//   42   92:invokevirtual   #81  <Method void AtomicLongArray.set(int, long)>

	//   43   95:iload_2         
	//   44   96:iconst_1        
	//   45   97:iadd            
	//   46   98:istore_2        
	//*  47   99:goto            71
		return ((AtomicLongArray) (jsonreader));
	//   48  102:aload_1         
	//   49  103:areturn         
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (AtomicLongArray)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #69  <Class AtomicLongArray>
	//    4    6:invokevirtual   #86  <Method void write(JsonWriter, AtomicLongArray)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, AtomicLongArray atomiclongarray)
		throws IOException
	{
		jsonwriter.beginArray();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #91  <Method JsonWriter JsonWriter.beginArray()>
	//    2    4:pop             
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		for(int j = atomiclongarray.length(); i < j; i++)
	//*   5    7:aload_2         
	//*   6    8:invokevirtual   #94  <Method int AtomicLongArray.length()>
	//*   7   11:istore          4
	//*   8   13:iload_3         
	//*   9   14:iload           4
	//*  10   16:icmpge          42
			val$longAdapter.write(jsonwriter, ((Object) (Long.valueOf(atomiclongarray.get(i)))));
	//   11   19:aload_0         
	//   12   20:getfield        #16  <Field TypeAdapter val$longAdapter>
	//   13   23:aload_1         
	//   14   24:aload_2         
	//   15   25:iload_3         
	//   16   26:invokevirtual   #97  <Method long AtomicLongArray.get(int)>
	//   17   29:invokestatic    #54  <Method Long Long.valueOf(long)>
	//   18   32:invokevirtual   #99  <Method void TypeAdapter.write(JsonWriter, Object)>

	//   19   35:iload_3         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_3        
	//*  23   39:goto            13
		jsonwriter.endArray();
	//   24   42:aload_1         
	//   25   43:invokevirtual   #101 <Method JsonWriter JsonWriter.endArray()>
	//   26   46:pop             
	//   27   47:return          
	}

	final TypeAdapter val$longAdapter;

	Gson$5(TypeAdapter typeadapter)
	{
		val$longAdapter = typeadapter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field TypeAdapter val$longAdapter>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void TypeAdapter()>
	//    5    9:return          
	}
}
