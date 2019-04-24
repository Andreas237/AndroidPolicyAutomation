// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.*;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$27 extends TypeAdapter
{

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #38  <Method Calendar read(JsonReader)>
	//    3    5:areturn         
	}

	public Calendar read(JsonReader jsonreader)
		throws IOException
	{
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #45  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #51  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #54  <Method void JsonReader.nextNull()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		}
		jsonreader.beginObject();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #57  <Method void JsonReader.beginObject()>
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
		int j = 0;
	//   18   32:iconst_0        
	//   19   33:istore_3        
		int k = 0;
	//   20   34:iconst_0        
	//   21   35:istore          4
		while(jsonreader.peek() != JsonToken.END_OBJECT) 
	//*  22   37:aload_1         
	//*  23   38:invokevirtual   #45  <Method JsonToken JsonReader.peek()>
	//*  24   41:getstatic       #60  <Field JsonToken JsonToken.END_OBJECT>
	//*  25   44:if_acmpeq       287
		{
			String s = jsonreader.nextName();
	//   26   47:aload_1         
	//   27   48:invokevirtual   #64  <Method String JsonReader.nextName()>
	//   28   51:astore          14
			int i = jsonreader.nextInt();
	//   29   53:aload_1         
	//   30   54:invokevirtual   #68  <Method int JsonReader.nextInt()>
	//   31   57:istore_2        
			int l1;
			int i2;
			int j2;
			int k2;
			int l2;
			if("year".equals(((Object) (s))))
	//*  32   58:ldc1            #26  <String "year">
	//*  33   60:aload           14
	//*  34   62:invokevirtual   #74  <Method boolean String.equals(Object)>
	//*  35   65:ifeq            89
			{
				l1 = i;
	//   36   68:iload_2         
	//   37   69:istore          9
				i2 = j1;
	//   38   71:iload           7
	//   39   73:istore          10
				j2 = i1;
	//   40   75:iload           6
	//   41   77:istore          11
				k2 = l;
	//   42   79:iload           5
	//   43   81:istore          12
				l2 = j;
	//   44   83:iload_3         
	//   45   84:istore          13
			} else
	//*  46   86:goto            265
			if("month".equals(((Object) (s))))
	//*  47   89:ldc1            #20  <String "month">
	//*  48   91:aload           14
	//*  49   93:invokevirtual   #74  <Method boolean String.equals(Object)>
	//*  50   96:ifeq            120
			{
				l1 = k1;
	//   51   99:iload           8
	//   52  101:istore          9
				i2 = i;
	//   53  103:iload_2         
	//   54  104:istore          10
				j2 = i1;
	//   55  106:iload           6
	//   56  108:istore          11
				k2 = l;
	//   57  110:iload           5
	//   58  112:istore          12
				l2 = j;
	//   59  114:iload_3         
	//   60  115:istore          13
			} else
	//*  61  117:goto            265
			if("dayOfMonth".equals(((Object) (s))))
	//*  62  120:ldc1            #11  <String "dayOfMonth">
	//*  63  122:aload           14
	//*  64  124:invokevirtual   #74  <Method boolean String.equals(Object)>
	//*  65  127:ifeq            151
			{
				l1 = k1;
	//   66  130:iload           8
	//   67  132:istore          9
				i2 = j1;
	//   68  134:iload           7
	//   69  136:istore          10
				j2 = i;
	//   70  138:iload_2         
	//   71  139:istore          11
				k2 = l;
	//   72  141:iload           5
	//   73  143:istore          12
				l2 = j;
	//   74  145:iload_3         
	//   75  146:istore          13
			} else
	//*  76  148:goto            265
			if("hourOfDay".equals(((Object) (s))))
	//*  77  151:ldc1            #14  <String "hourOfDay">
	//*  78  153:aload           14
	//*  79  155:invokevirtual   #74  <Method boolean String.equals(Object)>
	//*  80  158:ifeq            182
			{
				l1 = k1;
	//   81  161:iload           8
	//   82  163:istore          9
				i2 = j1;
	//   83  165:iload           7
	//   84  167:istore          10
				j2 = i1;
	//   85  169:iload           6
	//   86  171:istore          11
				k2 = i;
	//   87  173:iload_2         
	//   88  174:istore          12
				l2 = j;
	//   89  176:iload_3         
	//   90  177:istore          13
			} else
	//*  91  179:goto            265
			if("minute".equals(((Object) (s))))
	//*  92  182:ldc1            #17  <String "minute">
	//*  93  184:aload           14
	//*  94  186:invokevirtual   #74  <Method boolean String.equals(Object)>
	//*  95  189:ifeq            214
			{
				l1 = k1;
	//   96  192:iload           8
	//   97  194:istore          9
				i2 = j1;
	//   98  196:iload           7
	//   99  198:istore          10
				j2 = i1;
	//  100  200:iload           6
	//  101  202:istore          11
				k2 = l;
	//  102  204:iload           5
	//  103  206:istore          12
				l2 = i;
	//  104  208:iload_2         
	//  105  209:istore          13
			} else
	//* 106  211:goto            265
			{
				l1 = k1;
	//  107  214:iload           8
	//  108  216:istore          9
				i2 = j1;
	//  109  218:iload           7
	//  110  220:istore          10
				j2 = i1;
	//  111  222:iload           6
	//  112  224:istore          11
				k2 = l;
	//  113  226:iload           5
	//  114  228:istore          12
				l2 = j;
	//  115  230:iload_3         
	//  116  231:istore          13
				if("second".equals(((Object) (s))))
	//* 117  233:ldc1            #23  <String "second">
	//* 118  235:aload           14
	//* 119  237:invokevirtual   #74  <Method boolean String.equals(Object)>
	//* 120  240:ifeq            265
				{
					k = i;
	//  121  243:iload_2         
	//  122  244:istore          4
					l2 = j;
	//  123  246:iload_3         
	//  124  247:istore          13
					k2 = l;
	//  125  249:iload           5
	//  126  251:istore          12
					j2 = i1;
	//  127  253:iload           6
	//  128  255:istore          11
					i2 = j1;
	//  129  257:iload           7
	//  130  259:istore          10
					l1 = k1;
	//  131  261:iload           8
	//  132  263:istore          9
				}
			}
			k1 = l1;
	//  133  265:iload           9
	//  134  267:istore          8
			j1 = i2;
	//  135  269:iload           10
	//  136  271:istore          7
			i1 = j2;
	//  137  273:iload           11
	//  138  275:istore          6
			l = k2;
	//  139  277:iload           12
	//  140  279:istore          5
			j = l2;
	//  141  281:iload           13
	//  142  283:istore_3        
		}
	//* 143  284:goto            37
		jsonreader.endObject();
	//  144  287:aload_1         
	//  145  288:invokevirtual   #77  <Method void JsonReader.endObject()>
		return ((Calendar) (new GregorianCalendar(k1, j1, i1, l, j, k)));
	//  146  291:new             #79  <Class GregorianCalendar>
	//  147  294:dup             
	//  148  295:iload           8
	//  149  297:iload           7
	//  150  299:iload           6
	//  151  301:iload           5
	//  152  303:iload_3         
	//  153  304:iload           4
	//  154  306:invokespecial   #82  <Method void GregorianCalendar(int, int, int, int, int, int)>
	//  155  309:areturn         
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (Calendar)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #86  <Class Calendar>
	//    4    6:invokevirtual   #89  <Method void write(JsonWriter, Calendar)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, Calendar calendar)
		throws IOException
	{
		if(calendar == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			jsonwriter.nullValue();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #95  <Method JsonWriter JsonWriter.nullValue()>
	//    4    8:pop             
			return;
	//    5    9:return          
		} else
		{
			jsonwriter.beginObject();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #97  <Method JsonWriter JsonWriter.beginObject()>
	//    8   14:pop             
			jsonwriter.name("year");
	//    9   15:aload_1         
	//   10   16:ldc1            #26  <String "year">
	//   11   18:invokevirtual   #101 <Method JsonWriter JsonWriter.name(String)>
	//   12   21:pop             
			jsonwriter.value(calendar.get(1));
	//   13   22:aload_1         
	//   14   23:aload_2         
	//   15   24:iconst_1        
	//   16   25:invokevirtual   #105 <Method int Calendar.get(int)>
	//   17   28:i2l             
	//   18   29:invokevirtual   #109 <Method JsonWriter JsonWriter.value(long)>
	//   19   32:pop             
			jsonwriter.name("month");
	//   20   33:aload_1         
	//   21   34:ldc1            #20  <String "month">
	//   22   36:invokevirtual   #101 <Method JsonWriter JsonWriter.name(String)>
	//   23   39:pop             
			jsonwriter.value(calendar.get(2));
	//   24   40:aload_1         
	//   25   41:aload_2         
	//   26   42:iconst_2        
	//   27   43:invokevirtual   #105 <Method int Calendar.get(int)>
	//   28   46:i2l             
	//   29   47:invokevirtual   #109 <Method JsonWriter JsonWriter.value(long)>
	//   30   50:pop             
			jsonwriter.name("dayOfMonth");
	//   31   51:aload_1         
	//   32   52:ldc1            #11  <String "dayOfMonth">
	//   33   54:invokevirtual   #101 <Method JsonWriter JsonWriter.name(String)>
	//   34   57:pop             
			jsonwriter.value(calendar.get(5));
	//   35   58:aload_1         
	//   36   59:aload_2         
	//   37   60:iconst_5        
	//   38   61:invokevirtual   #105 <Method int Calendar.get(int)>
	//   39   64:i2l             
	//   40   65:invokevirtual   #109 <Method JsonWriter JsonWriter.value(long)>
	//   41   68:pop             
			jsonwriter.name("hourOfDay");
	//   42   69:aload_1         
	//   43   70:ldc1            #14  <String "hourOfDay">
	//   44   72:invokevirtual   #101 <Method JsonWriter JsonWriter.name(String)>
	//   45   75:pop             
			jsonwriter.value(calendar.get(11));
	//   46   76:aload_1         
	//   47   77:aload_2         
	//   48   78:bipush          11
	//   49   80:invokevirtual   #105 <Method int Calendar.get(int)>
	//   50   83:i2l             
	//   51   84:invokevirtual   #109 <Method JsonWriter JsonWriter.value(long)>
	//   52   87:pop             
			jsonwriter.name("minute");
	//   53   88:aload_1         
	//   54   89:ldc1            #17  <String "minute">
	//   55   91:invokevirtual   #101 <Method JsonWriter JsonWriter.name(String)>
	//   56   94:pop             
			jsonwriter.value(calendar.get(12));
	//   57   95:aload_1         
	//   58   96:aload_2         
	//   59   97:bipush          12
	//   60   99:invokevirtual   #105 <Method int Calendar.get(int)>
	//   61  102:i2l             
	//   62  103:invokevirtual   #109 <Method JsonWriter JsonWriter.value(long)>
	//   63  106:pop             
			jsonwriter.name("second");
	//   64  107:aload_1         
	//   65  108:ldc1            #23  <String "second">
	//   66  110:invokevirtual   #101 <Method JsonWriter JsonWriter.name(String)>
	//   67  113:pop             
			jsonwriter.value(calendar.get(13));
	//   68  114:aload_1         
	//   69  115:aload_2         
	//   70  116:bipush          13
	//   71  118:invokevirtual   #105 <Method int Calendar.get(int)>
	//   72  121:i2l             
	//   73  122:invokevirtual   #109 <Method JsonWriter JsonWriter.value(long)>
	//   74  125:pop             
			jsonwriter.endObject();
	//   75  126:aload_1         
	//   76  127:invokevirtual   #111 <Method JsonWriter JsonWriter.endObject()>
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

	TypeAdapters$27()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
