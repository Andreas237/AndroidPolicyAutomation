// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.*;
import java.io.IOException;
import java.util.Locale;
import java.util.StringTokenizer;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$28 extends TypeAdapter
{

	public volatile Object read(JsonReader jsonreader)
		throws IOException
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #19  <Method Locale read(JsonReader)>
	//    3    5:areturn         
	}

	public Locale read(JsonReader jsonreader)
		throws IOException
	{
		if(jsonreader.peek() == JsonToken.NULL)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #26  <Method JsonToken JsonReader.peek()>
	//*   2    4:getstatic       #32  <Field JsonToken JsonToken.NULL>
	//*   3    7:if_acmpne       16
		{
			jsonreader.nextNull();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #35  <Method void JsonReader.nextNull()>
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		}
		StringTokenizer stringtokenizer = new StringTokenizer(jsonreader.nextString(), "_");
	//    8   16:new             #37  <Class StringTokenizer>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokevirtual   #41  <Method String JsonReader.nextString()>
	//   12   24:ldc1            #43  <String "_">
	//   13   26:invokespecial   #46  <Method void StringTokenizer(String, String)>
	//   14   29:astore          4
		jsonreader = null;
	//   15   31:aconst_null     
	//   16   32:astore_1        
		String s = null;
	//   17   33:aconst_null     
	//   18   34:astore_2        
		String s1 = null;
	//   19   35:aconst_null     
	//   20   36:astore_3        
		if(stringtokenizer.hasMoreElements())
	//*  21   37:aload           4
	//*  22   39:invokevirtual   #50  <Method boolean StringTokenizer.hasMoreElements()>
	//*  23   42:ifeq            51
			jsonreader = ((JsonReader) (stringtokenizer.nextToken()));
	//   24   45:aload           4
	//   25   47:invokevirtual   #53  <Method String StringTokenizer.nextToken()>
	//   26   50:astore_1        
		if(stringtokenizer.hasMoreElements())
	//*  27   51:aload           4
	//*  28   53:invokevirtual   #50  <Method boolean StringTokenizer.hasMoreElements()>
	//*  29   56:ifeq            65
			s = stringtokenizer.nextToken();
	//   30   59:aload           4
	//   31   61:invokevirtual   #53  <Method String StringTokenizer.nextToken()>
	//   32   64:astore_2        
		if(stringtokenizer.hasMoreElements())
	//*  33   65:aload           4
	//*  34   67:invokevirtual   #50  <Method boolean StringTokenizer.hasMoreElements()>
	//*  35   70:ifeq            79
			s1 = stringtokenizer.nextToken();
	//   36   73:aload           4
	//   37   75:invokevirtual   #53  <Method String StringTokenizer.nextToken()>
	//   38   78:astore_3        
		if(s == null && s1 == null)
	//*  39   79:aload_2         
	//*  40   80:ifnonnull       96
	//*  41   83:aload_3         
	//*  42   84:ifnonnull       96
			return new Locale(((String) (jsonreader)));
	//   43   87:new             #55  <Class Locale>
	//   44   90:dup             
	//   45   91:aload_1         
	//   46   92:invokespecial   #58  <Method void Locale(String)>
	//   47   95:areturn         
		if(s1 == null)
	//*  48   96:aload_3         
	//*  49   97:ifnonnull       110
			return new Locale(((String) (jsonreader)), s);
	//   50  100:new             #55  <Class Locale>
	//   51  103:dup             
	//   52  104:aload_1         
	//   53  105:aload_2         
	//   54  106:invokespecial   #59  <Method void Locale(String, String)>
	//   55  109:areturn         
		else
			return new Locale(((String) (jsonreader)), s, s1);
	//   56  110:new             #55  <Class Locale>
	//   57  113:dup             
	//   58  114:aload_1         
	//   59  115:aload_2         
	//   60  116:aload_3         
	//   61  117:invokespecial   #62  <Method void Locale(String, String, String)>
	//   62  120:areturn         
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		write(jsonwriter, (Locale)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #55  <Class Locale>
	//    4    6:invokevirtual   #67  <Method void write(JsonWriter, Locale)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, Locale locale)
		throws IOException
	{
		if(locale == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       9
			locale = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		else
	//*   4    6:goto            14
			locale = ((Locale) (locale.toString()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #70  <Method String Locale.toString()>
	//    7   13:astore_2        
		jsonwriter.value(((String) (locale)));
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #76  <Method JsonWriter JsonWriter.value(String)>
	//   11   19:pop             
	//   12   20:return          
	}

	TypeAdapters$28()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TypeAdapter()>
	//    2    4:return          
	}
}
