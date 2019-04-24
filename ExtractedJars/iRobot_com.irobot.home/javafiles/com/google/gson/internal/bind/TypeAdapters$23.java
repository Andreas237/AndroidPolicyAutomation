// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$23 extends TypeAdapter
{

	public volatile Object read(JsonReader jsonreader)
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #36  <Method Calendar read(JsonReader)>
	//    3    5:areturn         
	}

	public Calendar read(JsonReader jsonreader)
	{
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #42  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #48  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #51  <Method void JsonReader.nextNull()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		}
		jsonreader.beginObject();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #54  <Method void JsonReader.beginObject()>
		int k1 = 0;
	//   10   20:iconst_0        
	//   11   21:istore          8
		int j1 = 0;
	//   12   23:iconst_0        
	//   13   24:istore          7
		int i1 = 0;
	//   14   26:iconst_0        
	//   15   27:istore          6
		int l = 0;
	//   16   29:iconst_0        
	//   17   30:istore          5
		int k = 0;
	//   18   32:iconst_0        
	//   19   33:istore          4
		int j = 0;
	//   20   35:iconst_0        
	//   21   36:istore_3        
		do
		{
			if(jsonreader.peek() == JsonToken.END_OBJECT)
				break;
	//   22   37:aload_1         
	//   23   38:invokevirtual   #42  <Method JsonToken JsonReader.peek()>
	//   24   41:getstatic       #57  <Field JsonToken JsonToken.END_OBJECT>
	//   25   44:if_acmpeq       153
			String s = jsonreader.nextName();
	//   26   47:aload_1         
	//   27   48:invokevirtual   #61  <Method String JsonReader.nextName()>
	//   28   51:astore          9
			int i = jsonreader.nextInt();
	//   29   53:aload_1         
	//   30   54:invokevirtual   #65  <Method int JsonReader.nextInt()>
	//   31   57:istore_2        
			if("year".equals(((Object) (s))))
	//*  32   58:ldc1            #26  <String "year">
	//*  33   60:aload           9
	//*  34   62:invokevirtual   #71  <Method boolean String.equals(Object)>
	//*  35   65:ifeq            74
				k1 = i;
	//   36   68:iload_2         
	//   37   69:istore          8
			else
	//*  38   71:goto            37
			if("month".equals(((Object) (s))))
	//*  39   74:ldc1            #20  <String "month">
	//*  40   76:aload           9
	//*  41   78:invokevirtual   #71  <Method boolean String.equals(Object)>
	//*  42   81:ifeq            90
				j1 = i;
	//   43   84:iload_2         
	//   44   85:istore          7
			else
	//*  45   87:goto            37
			if("dayOfMonth".equals(((Object) (s))))
	//*  46   90:ldc1            #11  <String "dayOfMonth">
	//*  47   92:aload           9
	//*  48   94:invokevirtual   #71  <Method boolean String.equals(Object)>
	//*  49   97:ifeq            106
				i1 = i;
	//   50  100:iload_2         
	//   51  101:istore          6
			else
	//*  52  103:goto            37
			if("hourOfDay".equals(((Object) (s))))
	//*  53  106:ldc1            #14  <String "hourOfDay">
	//*  54  108:aload           9
	//*  55  110:invokevirtual   #71  <Method boolean String.equals(Object)>
	//*  56  113:ifeq            122
				l = i;
	//   57  116:iload_2         
	//   58  117:istore          5
			else
	//*  59  119:goto            37
			if("minute".equals(((Object) (s))))
	//*  60  122:ldc1            #17  <String "minute">
	//*  61  124:aload           9
	//*  62  126:invokevirtual   #71  <Method boolean String.equals(Object)>
	//*  63  129:ifeq            138
				k = i;
	//   64  132:iload_2         
	//   65  133:istore          4
			else
	//*  66  135:goto            37
			if("second".equals(((Object) (s))))
	//*  67  138:ldc1            #23  <String "second">
	//*  68  140:aload           9
	//*  69  142:invokevirtual   #71  <Method boolean String.equals(Object)>
	//*  70  145:ifeq            37
				j = i;
	//   71  148:iload_2         
	//   72  149:istore_3        
		} while(true);
	//   73  150:goto            37
		jsonreader.endObject();
	//   74  153:aload_1         
	//   75  154:invokevirtual   #74  <Method void JsonReader.endObject()>
		return ((Calendar) (new GregorianCalendar(k1, j1, i1, l, k, j)));
	//   76  157:new             #76  <Class GregorianCalendar>
	//   77  160:dup             
	//   78  161:iload           8
	//   79  163:iload           7
	//   80  165:iload           6
	//   81  167:iload           5
	//   82  169:iload           4
	//   83  171:iload_3         
	//   84  172:invokespecial   #79  <Method void GregorianCalendar(int, int, int, int, int, int)>
	//   85  175:areturn         
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
	{
		write(jsonwriter, (Calendar)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #83  <Class Calendar>
	//    4    6:invokevirtual   #86  <Method void write(JsonWriter, Calendar)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, Calendar calendar)
	{
		if(calendar == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			jsonwriter.nullValue();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #92  <Method JsonWriter JsonWriter.nullValue()>
	//    4    8:pop             
			return;
	//    5    9:return          
		} else
		{
			jsonwriter.beginObject();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #94  <Method JsonWriter JsonWriter.beginObject()>
	//    8   14:pop             
			jsonwriter.name("year");
	//    9   15:aload_1         
	//   10   16:ldc1            #26  <String "year">
	//   11   18:invokevirtual   #98  <Method JsonWriter JsonWriter.name(String)>
	//   12   21:pop             
			jsonwriter.value(calendar.get(1));
	//   13   22:aload_1         
	//   14   23:aload_2         
	//   15   24:iconst_1        
	//   16   25:invokevirtual   #102 <Method int Calendar.get(int)>
	//   17   28:i2l             
	//   18   29:invokevirtual   #106 <Method JsonWriter JsonWriter.value(long)>
	//   19   32:pop             
			jsonwriter.name("month");
	//   20   33:aload_1         
	//   21   34:ldc1            #20  <String "month">
	//   22   36:invokevirtual   #98  <Method JsonWriter JsonWriter.name(String)>
	//   23   39:pop             
			jsonwriter.value(calendar.get(2));
	//   24   40:aload_1         
	//   25   41:aload_2         
	//   26   42:iconst_2        
	//   27   43:invokevirtual   #102 <Method int Calendar.get(int)>
	//   28   46:i2l             
	//   29   47:invokevirtual   #106 <Method JsonWriter JsonWriter.value(long)>
	//   30   50:pop             
			jsonwriter.name("dayOfMonth");
	//   31   51:aload_1         
	//   32   52:ldc1            #11  <String "dayOfMonth">
	//   33   54:invokevirtual   #98  <Method JsonWriter JsonWriter.name(String)>
	//   34   57:pop             
			jsonwriter.value(calendar.get(5));
	//   35   58:aload_1         
	//   36   59:aload_2         
	//   37   60:iconst_5        
	//   38   61:invokevirtual   #102 <Method int Calendar.get(int)>
	//   39   64:i2l             
	//   40   65:invokevirtual   #106 <Method JsonWriter JsonWriter.value(long)>
	//   41   68:pop             
			jsonwriter.name("hourOfDay");
	//   42   69:aload_1         
	//   43   70:ldc1            #14  <String "hourOfDay">
	//   44   72:invokevirtual   #98  <Method JsonWriter JsonWriter.name(String)>
	//   45   75:pop             
			jsonwriter.value(calendar.get(11));
	//   46   76:aload_1         
	//   47   77:aload_2         
	//   48   78:bipush          11
	//   49   80:invokevirtual   #102 <Method int Calendar.get(int)>
	//   50   83:i2l             
	//   51   84:invokevirtual   #106 <Method JsonWriter JsonWriter.value(long)>
	//   52   87:pop             
			jsonwriter.name("minute");
	//   53   88:aload_1         
	//   54   89:ldc1            #17  <String "minute">
	//   55   91:invokevirtual   #98  <Method JsonWriter JsonWriter.name(String)>
	//   56   94:pop             
			jsonwriter.value(calendar.get(12));
	//   57   95:aload_1         
	//   58   96:aload_2         
	//   59   97:bipush          12
	//   60   99:invokevirtual   #102 <Method int Calendar.get(int)>
	//   61  102:i2l             
	//   62  103:invokevirtual   #106 <Method JsonWriter JsonWriter.value(long)>
	//   63  106:pop             
			jsonwriter.name("second");
	//   64  107:aload_1         
	//   65  108:ldc1            #23  <String "second">
	//   66  110:invokevirtual   #98  <Method JsonWriter JsonWriter.name(String)>
	//   67  113:pop             
			jsonwriter.value(calendar.get(13));
	//   68  114:aload_1         
	//   69  115:aload_2         
	//   70  116:bipush          13
	//   71  118:invokevirtual   #102 <Method int Calendar.get(int)>
	//   72  121:i2l             
	//   73  122:invokevirtual   #106 <Method JsonWriter JsonWriter.value(long)>
	//   74  125:pop             
			jsonwriter.endObject();
	//   75  126:aload_1         
	//   76  127:invokevirtual   #108 <Method JsonWriter JsonWriter.endObject()>
	//   77  130:pop             
			return;
	//   78  131:return          
		}
	}

	private static final String DAY_OF_MONTH = "dayOfMonth";
	private static final String HOUR_OF_DAY = "hourOfDay";
	private static final String MINUTE = "minute";
	private static final String MONTH = "month";
	private static final String SECOND = "second";
	private static final String YEAR = "year";

	TypeAdapters$23()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
