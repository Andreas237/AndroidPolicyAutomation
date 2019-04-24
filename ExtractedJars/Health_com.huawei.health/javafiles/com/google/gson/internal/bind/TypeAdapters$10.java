// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerArray;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$10 extends TypeAdapter
{

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #19  <Method AtomicIntegerArray read(JsonReader)>
	//    3    5:areturn         
	}

	public AtomicIntegerArray read(JsonReader jsonreader)
		throws IOException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #24  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void ArrayList()>
	//    3    7:astore          4
		jsonreader.beginArray();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #30  <Method void JsonReader.beginArray()>
		while(jsonreader.hasNext()) 
	//*   6   13:aload_1         
	//*   7   14:invokevirtual   #34  <Method boolean JsonReader.hasNext()>
	//*   8   17:ifeq            48
			try
			{
				((List) (arraylist)).add(((Object) (Integer.valueOf(jsonreader.nextInt()))));
	//    9   20:aload           4
	//   10   22:aload_1         
	//   11   23:invokevirtual   #38  <Method int JsonReader.nextInt()>
	//   12   26:invokestatic    #44  <Method Integer Integer.valueOf(int)>
	//   13   29:invokeinterface #50  <Method boolean List.add(Object)>
	//   14   34:pop             
			}
	//*  15   35:goto            13
			// Misplaced declaration of an exception variable
			catch(JsonReader jsonreader)
	//*  16   38:astore_1        
			{
				throw new JsonSyntaxException(((Throwable) (jsonreader)));
	//   17   39:new             #52  <Class JsonSyntaxException>
	//   18   42:dup             
	//   19   43:aload_1         
	//   20   44:invokespecial   #55  <Method void JsonSyntaxException(Throwable)>
	//   21   47:athrow          
			}
		jsonreader.endArray();
	//   22   48:aload_1         
	//   23   49:invokevirtual   #58  <Method void JsonReader.endArray()>
		int j = ((List) (arraylist)).size();
	//   24   52:aload           4
	//   25   54:invokeinterface #61  <Method int List.size()>
	//   26   59:istore_3        
		jsonreader = ((JsonReader) (new AtomicIntegerArray(j)));
	//   27   60:new             #63  <Class AtomicIntegerArray>
	//   28   63:dup             
	//   29   64:iload_3         
	//   30   65:invokespecial   #66  <Method void AtomicIntegerArray(int)>
	//   31   68:astore_1        
		for(int i = 0; i < j; i++)
	//*  32   69:iconst_0        
	//*  33   70:istore_2        
	//*  34   71:iload_2         
	//*  35   72:iload_3         
	//*  36   73:icmpge          102
			((AtomicIntegerArray) (jsonreader)).set(i, ((Integer)((List) (arraylist)).get(i)).intValue());
	//   37   76:aload_1         
	//   38   77:iload_2         
	//   39   78:aload           4
	//   40   80:iload_2         
	//   41   81:invokeinterface #70  <Method Object List.get(int)>
	//   42   86:checkcast       #40  <Class Integer>
	//   43   89:invokevirtual   #73  <Method int Integer.intValue()>
	//   44   92:invokevirtual   #77  <Method void AtomicIntegerArray.set(int, int)>

	//   45   95:iload_2         
	//   46   96:iconst_1        
	//   47   97:iadd            
	//   48   98:istore_2        
	//*  49   99:goto            71
		return ((AtomicIntegerArray) (jsonreader));
	//   50  102:aload_1         
	//   51  103:areturn         
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (AtomicIntegerArray)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #63  <Class AtomicIntegerArray>
	//    4    6:invokevirtual   #82  <Method void write(JsonWriter, AtomicIntegerArray)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, AtomicIntegerArray atomicintegerarray)
		throws IOException
	{
		jsonwriter.beginArray();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #87  <Method JsonWriter JsonWriter.beginArray()>
	//    2    4:pop             
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		for(int j = atomicintegerarray.length(); i < j; i++)
	//*   5    7:aload_2         
	//*   6    8:invokevirtual   #90  <Method int AtomicIntegerArray.length()>
	//*   7   11:istore          4
	//*   8   13:iload_3         
	//*   9   14:iload           4
	//*  10   16:icmpge          37
			jsonwriter.value(atomicintegerarray.get(i));
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:iload_3         
	//   14   22:invokevirtual   #93  <Method int AtomicIntegerArray.get(int)>
	//   15   25:i2l             
	//   16   26:invokevirtual   #97  <Method JsonWriter JsonWriter.value(long)>
	//   17   29:pop             

	//   18   30:iload_3         
	//   19   31:iconst_1        
	//   20   32:iadd            
	//   21   33:istore_3        
	//*  22   34:goto            13
		jsonwriter.endArray();
	//   23   37:aload_1         
	//   24   38:invokevirtual   #99  <Method JsonWriter JsonWriter.endArray()>
	//   25   41:pop             
	//   26   42:return          
	}

	TypeAdapters$10()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
