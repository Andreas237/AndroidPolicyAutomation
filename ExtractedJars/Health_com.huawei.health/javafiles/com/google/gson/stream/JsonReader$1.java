// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.stream;

import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;
import java.io.IOException;

// Referenced classes of package com.google.gson.stream:
//			JsonReader

static final class JsonReader$1 extends JsonReaderInternalAccess
{

	public void promoteNameToValue(JsonReader jsonreader)
		throws IOException
	{
		if(jsonreader instanceof JsonTreeReader)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #17  <Class JsonTreeReader>
	//*   2    4:ifeq            15
		{
			((JsonTreeReader)jsonreader).promoteNameToValue();
	//    3    7:aload_1         
	//    4    8:checkcast       #17  <Class JsonTreeReader>
	//    5   11:invokevirtual   #19  <Method void JsonTreeReader.promoteNameToValue()>
			return;
	//    6   14:return          
		}
		int j = jsonreader.peeked;
	//    7   15:aload_1         
	//    8   16:getfield        #23  <Field int JsonReader.peeked>
	//    9   19:istore_3        
		int i = j;
	//   10   20:iload_3         
	//   11   21:istore_2        
		if(j == 0)
	//*  12   22:iload_3         
	//*  13   23:ifne            31
			i = jsonreader.doPeek();
	//   14   26:aload_1         
	//   15   27:invokevirtual   #27  <Method int JsonReader.doPeek()>
	//   16   30:istore_2        
		if(i == 13)
	//*  17   31:iload_2         
	//*  18   32:bipush          13
	//*  19   34:icmpne          44
		{
			jsonreader.peeked = 9;
	//   20   37:aload_1         
	//   21   38:bipush          9
	//   22   40:putfield        #23  <Field int JsonReader.peeked>
			return;
	//   23   43:return          
		}
		if(i == 12)
	//*  24   44:iload_2         
	//*  25   45:bipush          12
	//*  26   47:icmpne          57
		{
			jsonreader.peeked = 8;
	//   27   50:aload_1         
	//   28   51:bipush          8
	//   29   53:putfield        #23  <Field int JsonReader.peeked>
			return;
	//   30   56:return          
		}
		if(i == 14)
	//*  31   57:iload_2         
	//*  32   58:bipush          14
	//*  33   60:icmpne          70
		{
			jsonreader.peeked = 10;
	//   34   63:aload_1         
	//   35   64:bipush          10
	//   36   66:putfield        #23  <Field int JsonReader.peeked>
			return;
	//   37   69:return          
		} else
		{
			throw new IllegalStateException((new StringBuilder()).append("Expected a name but was ").append(((Object) (jsonreader.peek()))).append(jsonreader.locationString()).toString());
	//   38   70:new             #29  <Class IllegalStateException>
	//   39   73:dup             
	//   40   74:new             #31  <Class StringBuilder>
	//   41   77:dup             
	//   42   78:invokespecial   #32  <Method void StringBuilder()>
	//   43   81:ldc1            #34  <String "Expected a name but was ">
	//   44   83:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   45   86:aload_1         
	//   46   87:invokevirtual   #42  <Method JsonToken JsonReader.peek()>
	//   47   90:invokevirtual   #45  <Method StringBuilder StringBuilder.append(Object)>
	//   48   93:aload_1         
	//   49   94:invokevirtual   #49  <Method String JsonReader.locationString()>
	//   50   97:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   51  100:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   52  103:invokespecial   #55  <Method void IllegalStateException(String)>
	//   53  106:athrow          
		}
	}

	JsonReader$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void JsonReaderInternalAccess()>
	//    2    4:return          
	}
}
