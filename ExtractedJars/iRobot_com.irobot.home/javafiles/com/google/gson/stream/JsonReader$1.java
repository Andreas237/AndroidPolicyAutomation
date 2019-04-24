// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.stream;

import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;

// Referenced classes of package com.google.gson.stream:
//			JsonReader

static final class JsonReader$1 extends JsonReaderInternalAccess
{

	public void promoteNameToValue(JsonReader jsonreader)
	{
		if(jsonreader instanceof JsonTreeReader)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #15  <Class JsonTreeReader>
	//*   2    4:ifeq            15
		{
			((JsonTreeReader)jsonreader).promoteNameToValue();
	//    3    7:aload_1         
	//    4    8:checkcast       #15  <Class JsonTreeReader>
	//    5   11:invokevirtual   #17  <Method void JsonTreeReader.promoteNameToValue()>
			return;
	//    6   14:return          
		}
		int j = JsonReader.access$000(jsonreader);
	//    7   15:aload_1         
	//    8   16:invokestatic    #21  <Method int JsonReader.access$000(JsonReader)>
	//    9   19:istore_3        
		int i = j;
	//   10   20:iload_3         
	//   11   21:istore_2        
		if(j == 0)
	//*  12   22:iload_3         
	//*  13   23:ifne            31
			i = JsonReader.access$100(jsonreader);
	//   14   26:aload_1         
	//   15   27:invokestatic    #24  <Method int JsonReader.access$100(JsonReader)>
	//   16   30:istore_2        
		if(i == 13)
	//*  17   31:iload_2         
	//*  18   32:bipush          13
	//*  19   34:icmpne          47
			i = 9;
	//   20   37:bipush          9
	//   21   39:istore_2        
		else
	//*  22   40:aload_1         
	//*  23   41:iload_2         
	//*  24   42:invokestatic    #28  <Method int JsonReader.access$002(JsonReader, int)>
	//*  25   45:pop             
	//*  26   46:return          
		if(i == 12)
	//*  27   47:iload_2         
	//*  28   48:bipush          12
	//*  29   50:icmpne          59
			i = 8;
	//   30   53:bipush          8
	//   31   55:istore_2        
		else
	//*  32   56:goto            40
		if(i == 14)
	//*  33   59:iload_2         
	//*  34   60:bipush          14
	//*  35   62:icmpne          71
		{
			i = 10;
	//   36   65:bipush          10
	//   37   67:istore_2        
		} else
	//*  38   68:goto            40
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   39   71:new             #30  <Class StringBuilder>
	//   40   74:dup             
	//   41   75:invokespecial   #31  <Method void StringBuilder()>
	//   42   78:astore          4
			stringbuilder.append("Expected a name but was ");
	//   43   80:aload           4
	//   44   82:ldc1            #33  <String "Expected a name but was ">
	//   45   84:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   46   87:pop             
			stringbuilder.append(((Object) (jsonreader.peek())));
	//   47   88:aload           4
	//   48   90:aload_1         
	//   49   91:invokevirtual   #41  <Method JsonToken JsonReader.peek()>
	//   50   94:invokevirtual   #44  <Method StringBuilder StringBuilder.append(Object)>
	//   51   97:pop             
			stringbuilder.append(" ");
	//   52   98:aload           4
	//   53  100:ldc1            #46  <String " ">
	//   54  102:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   55  105:pop             
			stringbuilder.append(" at line ");
	//   56  106:aload           4
	//   57  108:ldc1            #48  <String " at line ">
	//   58  110:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   59  113:pop             
			stringbuilder.append(JsonReader.access$200(jsonreader));
	//   60  114:aload           4
	//   61  116:aload_1         
	//   62  117:invokestatic    #51  <Method int JsonReader.access$200(JsonReader)>
	//   63  120:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   64  123:pop             
			stringbuilder.append(" column ");
	//   65  124:aload           4
	//   66  126:ldc1            #56  <String " column ">
	//   67  128:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   68  131:pop             
			stringbuilder.append(JsonReader.access$300(jsonreader));
	//   69  132:aload           4
	//   70  134:aload_1         
	//   71  135:invokestatic    #59  <Method int JsonReader.access$300(JsonReader)>
	//   72  138:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   73  141:pop             
			stringbuilder.append(" path ");
	//   74  142:aload           4
	//   75  144:ldc1            #61  <String " path ">
	//   76  146:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   77  149:pop             
			stringbuilder.append(jsonreader.getPath());
	//   78  150:aload           4
	//   79  152:aload_1         
	//   80  153:invokevirtual   #65  <Method String JsonReader.getPath()>
	//   81  156:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   82  159:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   83  160:new             #67  <Class IllegalStateException>
	//   84  163:dup             
	//   85  164:aload           4
	//   86  166:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   87  169:invokespecial   #73  <Method void IllegalStateException(String)>
	//   88  172:athrow          
		}
		JsonReader.access$002(jsonreader, i);
	}

	JsonReader$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void JsonReaderInternalAccess()>
	//    2    4:return          
	}
}
