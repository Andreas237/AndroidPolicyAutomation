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
		int j = JsonReader.access$000(jsonreader);
	//    7   15:aload_1         
	//    8   16:invokestatic    #23  <Method int JsonReader.access$000(JsonReader)>
	//    9   19:istore_3        
		int i = j;
	//   10   20:iload_3         
	//   11   21:istore_2        
		if(j == 0)
	//*  12   22:iload_3         
	//*  13   23:ifne            31
			i = JsonReader.access$100(jsonreader);
	//   14   26:aload_1         
	//   15   27:invokestatic    #26  <Method int JsonReader.access$100(JsonReader)>
	//   16   30:istore_2        
		if(i == 13)
	//*  17   31:iload_2         
	//*  18   32:bipush          13
	//*  19   34:icmpne          45
		{
			JsonReader.access$002(jsonreader, 9);
	//   20   37:aload_1         
	//   21   38:bipush          9
	//   22   40:invokestatic    #30  <Method int JsonReader.access$002(JsonReader, int)>
	//   23   43:pop             
			return;
	//   24   44:return          
		}
		if(i == 12)
	//*  25   45:iload_2         
	//*  26   46:bipush          12
	//*  27   48:icmpne          59
		{
			JsonReader.access$002(jsonreader, 8);
	//   28   51:aload_1         
	//   29   52:bipush          8
	//   30   54:invokestatic    #30  <Method int JsonReader.access$002(JsonReader, int)>
	//   31   57:pop             
			return;
	//   32   58:return          
		}
		if(i == 14)
	//*  33   59:iload_2         
	//*  34   60:bipush          14
	//*  35   62:icmpne          73
		{
			JsonReader.access$002(jsonreader, 10);
	//   36   65:aload_1         
	//   37   66:bipush          10
	//   38   68:invokestatic    #30  <Method int JsonReader.access$002(JsonReader, int)>
	//   39   71:pop             
			return;
	//   40   72:return          
		} else
		{
			throw new IllegalStateException((new StringBuilder()).append("Expected a name but was ").append(((Object) (jsonreader.peek()))).append(" ").append(" at line ").append(JsonReader.access$200(jsonreader)).append(" column ").append(JsonReader.access$300(jsonreader)).append(" path ").append(jsonreader.getPath()).toString());
	//   41   73:new             #32  <Class IllegalStateException>
	//   42   76:dup             
	//   43   77:new             #34  <Class StringBuilder>
	//   44   80:dup             
	//   45   81:invokespecial   #35  <Method void StringBuilder()>
	//   46   84:ldc1            #37  <String "Expected a name but was ">
	//   47   86:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   48   89:aload_1         
	//   49   90:invokevirtual   #45  <Method JsonToken JsonReader.peek()>
	//   50   93:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
	//   51   96:ldc1            #50  <String " ">
	//   52   98:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   53  101:ldc1            #52  <String " at line ">
	//   54  103:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   55  106:aload_1         
	//   56  107:invokestatic    #55  <Method int JsonReader.access$200(JsonReader)>
	//   57  110:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
	//   58  113:ldc1            #60  <String " column ">
	//   59  115:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   60  118:aload_1         
	//   61  119:invokestatic    #63  <Method int JsonReader.access$300(JsonReader)>
	//   62  122:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
	//   63  125:ldc1            #65  <String " path ">
	//   64  127:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   65  130:aload_1         
	//   66  131:invokevirtual   #69  <Method String JsonReader.getPath()>
	//   67  134:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   68  137:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   69  140:invokespecial   #75  <Method void IllegalStateException(String)>
	//   70  143:athrow          
		}
	}

	JsonReader$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void JsonReaderInternalAccess()>
	//    2    4:return          
	}
}
