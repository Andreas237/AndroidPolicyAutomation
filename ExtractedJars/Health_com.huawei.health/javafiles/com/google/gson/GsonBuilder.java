// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.gson:
//			LongSerializationPolicy, FieldNamingPolicy, DefaultDateTypeAdapter, Gson, 
//			JsonSerializer, JsonDeserializer, InstanceCreator, TypeAdapter, 
//			FieldNamingStrategy, ExclusionStrategy, TypeAdapterFactory

public final class GsonBuilder
{

	public GsonBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		excluder = Excluder.DEFAULT;
	//    2    4:aload_0         
	//    3    5:getstatic       #39  <Field Excluder Excluder.DEFAULT>
	//    4    8:putfield        #41  <Field Excluder excluder>
		longSerializationPolicy = LongSerializationPolicy.DEFAULT;
	//    5   11:aload_0         
	//    6   12:getstatic       #45  <Field LongSerializationPolicy LongSerializationPolicy.DEFAULT>
	//    7   15:putfield        #47  <Field LongSerializationPolicy longSerializationPolicy>
		fieldNamingPolicy = ((FieldNamingStrategy) (FieldNamingPolicy.IDENTITY));
	//    8   18:aload_0         
	//    9   19:getstatic       #53  <Field FieldNamingPolicy FieldNamingPolicy.IDENTITY>
	//   10   22:putfield        #55  <Field FieldNamingStrategy fieldNamingPolicy>
	//   11   25:aload_0         
	//   12   26:new             #57  <Class HashMap>
	//   13   29:dup             
	//   14   30:invokespecial   #58  <Method void HashMap()>
	//   15   33:putfield        #60  <Field Map instanceCreators>
	//   16   36:aload_0         
	//   17   37:new             #62  <Class ArrayList>
	//   18   40:dup             
	//   19   41:invokespecial   #63  <Method void ArrayList()>
	//   20   44:putfield        #65  <Field List factories>
	//   21   47:aload_0         
	//   22   48:new             #62  <Class ArrayList>
	//   23   51:dup             
	//   24   52:invokespecial   #63  <Method void ArrayList()>
	//   25   55:putfield        #67  <Field List hierarchyFactories>
		serializeNulls = false;
	//   26   58:aload_0         
	//   27   59:iconst_0        
	//   28   60:putfield        #69  <Field boolean serializeNulls>
		dateStyle = 2;
	//   29   63:aload_0         
	//   30   64:iconst_2        
	//   31   65:putfield        #71  <Field int dateStyle>
		timeStyle = 2;
	//   32   68:aload_0         
	//   33   69:iconst_2        
	//   34   70:putfield        #73  <Field int timeStyle>
		complexMapKeySerialization = false;
	//   35   73:aload_0         
	//   36   74:iconst_0        
	//   37   75:putfield        #75  <Field boolean complexMapKeySerialization>
		serializeSpecialFloatingPointValues = false;
	//   38   78:aload_0         
	//   39   79:iconst_0        
	//   40   80:putfield        #77  <Field boolean serializeSpecialFloatingPointValues>
		escapeHtmlChars = true;
	//   41   83:aload_0         
	//   42   84:iconst_1        
	//   43   85:putfield        #79  <Field boolean escapeHtmlChars>
		prettyPrinting = false;
	//   44   88:aload_0         
	//   45   89:iconst_0        
	//   46   90:putfield        #81  <Field boolean prettyPrinting>
		generateNonExecutableJson = false;
	//   47   93:aload_0         
	//   48   94:iconst_0        
	//   49   95:putfield        #83  <Field boolean generateNonExecutableJson>
		lenient = false;
	//   50   98:aload_0         
	//   51   99:iconst_0        
	//   52  100:putfield        #85  <Field boolean lenient>
	//   53  103:return          
	}

	private void addTypeAdaptersForDate(String s, int i, int j, List list)
	{
		DefaultDateTypeAdapter defaultdatetypeadapter;
		DefaultDateTypeAdapter defaultdatetypeadapter1;
		if(s != null && !"".equals(((Object) (s.trim()))))
	//*   0    0:aload_1         
	//*   1    1:ifnull          58
	//*   2    4:ldc1            #90  <String "">
	//*   3    6:aload_1         
	//*   4    7:invokevirtual   #96  <Method String String.trim()>
	//*   5   10:invokevirtual   #100 <Method boolean String.equals(Object)>
	//*   6   13:ifne            58
		{
			DefaultDateTypeAdapter defaultdatetypeadapter2 = new DefaultDateTypeAdapter(java/util/Date, s);
	//    7   16:new             #102 <Class DefaultDateTypeAdapter>
	//    8   19:dup             
	//    9   20:ldc1            #104 <Class Date>
	//   10   22:aload_1         
	//   11   23:invokespecial   #107 <Method void DefaultDateTypeAdapter(Class, String)>
	//   12   26:astore          7
			defaultdatetypeadapter = new DefaultDateTypeAdapter(java/sql/Timestamp, s);
	//   13   28:new             #102 <Class DefaultDateTypeAdapter>
	//   14   31:dup             
	//   15   32:ldc1            #109 <Class Timestamp>
	//   16   34:aload_1         
	//   17   35:invokespecial   #107 <Method void DefaultDateTypeAdapter(Class, String)>
	//   18   38:astore          5
			defaultdatetypeadapter1 = new DefaultDateTypeAdapter(java/sql/Date, s);
	//   19   40:new             #102 <Class DefaultDateTypeAdapter>
	//   20   43:dup             
	//   21   44:ldc1            #111 <Class java.sql.Date>
	//   22   46:aload_1         
	//   23   47:invokespecial   #107 <Method void DefaultDateTypeAdapter(Class, String)>
	//   24   50:astore          6
			s = ((String) (defaultdatetypeadapter2));
	//   25   52:aload           7
	//   26   54:astore_1        
		} else
	//*  27   55:goto            110
		if(i != 2 && j != 2)
	//*  28   58:iload_2         
	//*  29   59:iconst_2        
	//*  30   60:icmpeq          109
	//*  31   63:iload_3         
	//*  32   64:iconst_2        
	//*  33   65:icmpeq          109
		{
			s = ((String) (new DefaultDateTypeAdapter(java/util/Date, i, j)));
	//   34   68:new             #102 <Class DefaultDateTypeAdapter>
	//   35   71:dup             
	//   36   72:ldc1            #104 <Class Date>
	//   37   74:iload_2         
	//   38   75:iload_3         
	//   39   76:invokespecial   #114 <Method void DefaultDateTypeAdapter(Class, int, int)>
	//   40   79:astore_1        
			defaultdatetypeadapter = new DefaultDateTypeAdapter(java/sql/Timestamp, i, j);
	//   41   80:new             #102 <Class DefaultDateTypeAdapter>
	//   42   83:dup             
	//   43   84:ldc1            #109 <Class Timestamp>
	//   44   86:iload_2         
	//   45   87:iload_3         
	//   46   88:invokespecial   #114 <Method void DefaultDateTypeAdapter(Class, int, int)>
	//   47   91:astore          5
			defaultdatetypeadapter1 = new DefaultDateTypeAdapter(java/sql/Date, i, j);
	//   48   93:new             #102 <Class DefaultDateTypeAdapter>
	//   49   96:dup             
	//   50   97:ldc1            #111 <Class java.sql.Date>
	//   51   99:iload_2         
	//   52  100:iload_3         
	//   53  101:invokespecial   #114 <Method void DefaultDateTypeAdapter(Class, int, int)>
	//   54  104:astore          6
		} else
	//*  55  106:goto            110
		{
			return;
	//   56  109:return          
		}
		list.add(((Object) (TypeAdapters.newFactory(java/util/Date, ((TypeAdapter) (s))))));
	//   57  110:aload           4
	//   58  112:ldc1            #104 <Class Date>
	//   59  114:aload_1         
	//   60  115:invokestatic    #120 <Method TypeAdapterFactory TypeAdapters.newFactory(Class, TypeAdapter)>
	//   61  118:invokeinterface #125 <Method boolean List.add(Object)>
	//   62  123:pop             
		list.add(((Object) (TypeAdapters.newFactory(java/sql/Timestamp, ((TypeAdapter) (defaultdatetypeadapter))))));
	//   63  124:aload           4
	//   64  126:ldc1            #109 <Class Timestamp>
	//   65  128:aload           5
	//   66  130:invokestatic    #120 <Method TypeAdapterFactory TypeAdapters.newFactory(Class, TypeAdapter)>
	//   67  133:invokeinterface #125 <Method boolean List.add(Object)>
	//   68  138:pop             
		list.add(((Object) (TypeAdapters.newFactory(java/sql/Date, ((TypeAdapter) (defaultdatetypeadapter1))))));
	//   69  139:aload           4
	//   70  141:ldc1            #111 <Class java.sql.Date>
	//   71  143:aload           6
	//   72  145:invokestatic    #120 <Method TypeAdapterFactory TypeAdapters.newFactory(Class, TypeAdapter)>
	//   73  148:invokeinterface #125 <Method boolean List.add(Object)>
	//   74  153:pop             
	//   75  154:return          
	}

	public GsonBuilder addDeserializationExclusionStrategy(ExclusionStrategy exclusionstrategy)
	{
		excluder = excluder.withExclusionStrategy(exclusionstrategy, false, true);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field Excluder excluder>
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:iconst_1        
	//    6    8:invokevirtual   #133 <Method Excluder Excluder.withExclusionStrategy(ExclusionStrategy, boolean, boolean)>
	//    7   11:putfield        #41  <Field Excluder excluder>
		return this;
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	public GsonBuilder addSerializationExclusionStrategy(ExclusionStrategy exclusionstrategy)
	{
		excluder = excluder.withExclusionStrategy(exclusionstrategy, true, false);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field Excluder excluder>
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #133 <Method Excluder Excluder.withExclusionStrategy(ExclusionStrategy, boolean, boolean)>
	//    7   11:putfield        #41  <Field Excluder excluder>
		return this;
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	public Gson create()
	{
		ArrayList arraylist = new ArrayList(factories.size() + hierarchyFactories.size() + 3);
	//    0    0:new             #62  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #65  <Field List factories>
	//    4    8:invokeinterface #140 <Method int List.size()>
	//    5   13:aload_0         
	//    6   14:getfield        #67  <Field List hierarchyFactories>
	//    7   17:invokeinterface #140 <Method int List.size()>
	//    8   22:iadd            
	//    9   23:iconst_3        
	//   10   24:iadd            
	//   11   25:invokespecial   #143 <Method void ArrayList(int)>
	//   12   28:astore_1        
		((List) (arraylist)).addAll(((java.util.Collection) (factories)));
	//   13   29:aload_1         
	//   14   30:aload_0         
	//   15   31:getfield        #65  <Field List factories>
	//   16   34:invokeinterface #147 <Method boolean List.addAll(java.util.Collection)>
	//   17   39:pop             
		Collections.reverse(((List) (arraylist)));
	//   18   40:aload_1         
	//   19   41:invokestatic    #153 <Method void Collections.reverse(List)>
		ArrayList arraylist1 = new ArrayList(((java.util.Collection) (hierarchyFactories)));
	//   20   44:new             #62  <Class ArrayList>
	//   21   47:dup             
	//   22   48:aload_0         
	//   23   49:getfield        #67  <Field List hierarchyFactories>
	//   24   52:invokespecial   #156 <Method void ArrayList(java.util.Collection)>
	//   25   55:astore_2        
		Collections.reverse(((List) (arraylist1)));
	//   26   56:aload_2         
	//   27   57:invokestatic    #153 <Method void Collections.reverse(List)>
		((List) (arraylist)).addAll(((java.util.Collection) (arraylist1)));
	//   28   60:aload_1         
	//   29   61:aload_2         
	//   30   62:invokeinterface #147 <Method boolean List.addAll(java.util.Collection)>
	//   31   67:pop             
		addTypeAdaptersForDate(datePattern, dateStyle, timeStyle, ((List) (arraylist)));
	//   32   68:aload_0         
	//   33   69:aload_0         
	//   34   70:getfield        #158 <Field String datePattern>
	//   35   73:aload_0         
	//   36   74:getfield        #71  <Field int dateStyle>
	//   37   77:aload_0         
	//   38   78:getfield        #73  <Field int timeStyle>
	//   39   81:aload_1         
	//   40   82:invokespecial   #160 <Method void addTypeAdaptersForDate(String, int, int, List)>
		return new Gson(excluder, fieldNamingPolicy, instanceCreators, serializeNulls, complexMapKeySerialization, generateNonExecutableJson, escapeHtmlChars, prettyPrinting, lenient, serializeSpecialFloatingPointValues, longSerializationPolicy, ((List) (arraylist)));
	//   41   85:new             #162 <Class Gson>
	//   42   88:dup             
	//   43   89:aload_0         
	//   44   90:getfield        #41  <Field Excluder excluder>
	//   45   93:aload_0         
	//   46   94:getfield        #55  <Field FieldNamingStrategy fieldNamingPolicy>
	//   47   97:aload_0         
	//   48   98:getfield        #60  <Field Map instanceCreators>
	//   49  101:aload_0         
	//   50  102:getfield        #69  <Field boolean serializeNulls>
	//   51  105:aload_0         
	//   52  106:getfield        #75  <Field boolean complexMapKeySerialization>
	//   53  109:aload_0         
	//   54  110:getfield        #83  <Field boolean generateNonExecutableJson>
	//   55  113:aload_0         
	//   56  114:getfield        #79  <Field boolean escapeHtmlChars>
	//   57  117:aload_0         
	//   58  118:getfield        #81  <Field boolean prettyPrinting>
	//   59  121:aload_0         
	//   60  122:getfield        #85  <Field boolean lenient>
	//   61  125:aload_0         
	//   62  126:getfield        #77  <Field boolean serializeSpecialFloatingPointValues>
	//   63  129:aload_0         
	//   64  130:getfield        #47  <Field LongSerializationPolicy longSerializationPolicy>
	//   65  133:aload_1         
	//   66  134:invokespecial   #165 <Method void Gson(Excluder, FieldNamingStrategy, Map, boolean, boolean, boolean, boolean, boolean, boolean, boolean, LongSerializationPolicy, List)>
	//   67  137:areturn         
	}

	public GsonBuilder disableHtmlEscaping()
	{
		escapeHtmlChars = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #79  <Field boolean escapeHtmlChars>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GsonBuilder disableInnerClassSerialization()
	{
		excluder = excluder.disableInnerClassSerialization();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field Excluder excluder>
	//    3    5:invokevirtual   #171 <Method Excluder Excluder.disableInnerClassSerialization()>
	//    4    8:putfield        #41  <Field Excluder excluder>
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public GsonBuilder enableComplexMapKeySerialization()
	{
		complexMapKeySerialization = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #75  <Field boolean complexMapKeySerialization>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public transient GsonBuilder excludeFieldsWithModifiers(int ai[])
	{
		excluder = excluder.withModifiers(ai);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field Excluder excluder>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #178 <Method Excluder Excluder.withModifiers(int[])>
	//    5    9:putfield        #41  <Field Excluder excluder>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public GsonBuilder excludeFieldsWithoutExposeAnnotation()
	{
		excluder = excluder.excludeFieldsWithoutExposeAnnotation();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field Excluder excluder>
	//    3    5:invokevirtual   #181 <Method Excluder Excluder.excludeFieldsWithoutExposeAnnotation()>
	//    4    8:putfield        #41  <Field Excluder excluder>
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public GsonBuilder generateNonExecutableJson()
	{
		generateNonExecutableJson = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #83  <Field boolean generateNonExecutableJson>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GsonBuilder registerTypeAdapter(Type type, Object obj)
	{
		boolean flag;
		if((obj instanceof JsonSerializer) || (obj instanceof JsonDeserializer) || (obj instanceof InstanceCreator) || (obj instanceof TypeAdapter))
	//*   0    0:aload_2         
	//*   1    1:instanceof      #185 <Class JsonSerializer>
	//*   2    4:ifne            28
	//*   3    7:aload_2         
	//*   4    8:instanceof      #187 <Class JsonDeserializer>
	//*   5   11:ifne            28
	//*   6   14:aload_2         
	//*   7   15:instanceof      #189 <Class InstanceCreator>
	//*   8   18:ifne            28
	//*   9   21:aload_2         
	//*  10   22:instanceof      #191 <Class TypeAdapter>
	//*  11   25:ifeq            33
			flag = true;
	//   12   28:iconst_1        
	//   13   29:istore_3        
		else
	//*  14   30:goto            35
			flag = false;
	//   15   33:iconst_0        
	//   16   34:istore_3        
		com.google.gson.internal..Gson.Preconditions.checkArgument(flag);
	//   17   35:iload_3         
	//   18   36:invokestatic    #197 <Method void com.google.gson.internal.$Gson$Preconditions.checkArgument(boolean)>
		if(obj instanceof InstanceCreator)
	//*  19   39:aload_2         
	//*  20   40:instanceof      #189 <Class InstanceCreator>
	//*  21   43:ifeq            61
			instanceCreators.put(((Object) (type)), ((Object) ((InstanceCreator)obj)));
	//   22   46:aload_0         
	//   23   47:getfield        #60  <Field Map instanceCreators>
	//   24   50:aload_1         
	//   25   51:aload_2         
	//   26   52:checkcast       #189 <Class InstanceCreator>
	//   27   55:invokeinterface #203 <Method Object Map.put(Object, Object)>
	//   28   60:pop             
		if((obj instanceof JsonSerializer) || (obj instanceof JsonDeserializer))
	//*  29   61:aload_2         
	//*  30   62:instanceof      #185 <Class JsonSerializer>
	//*  31   65:ifne            75
	//*  32   68:aload_2         
	//*  33   69:instanceof      #187 <Class JsonDeserializer>
	//*  34   72:ifeq            97
		{
			TypeToken typetoken = TypeToken.get(type);
	//   35   75:aload_1         
	//   36   76:invokestatic    #209 <Method TypeToken TypeToken.get(Type)>
	//   37   79:astore          4
			factories.add(((Object) (TreeTypeAdapter.newFactoryWithMatchRawType(typetoken, obj))));
	//   38   81:aload_0         
	//   39   82:getfield        #65  <Field List factories>
	//   40   85:aload           4
	//   41   87:aload_2         
	//   42   88:invokestatic    #215 <Method TypeAdapterFactory TreeTypeAdapter.newFactoryWithMatchRawType(TypeToken, Object)>
	//   43   91:invokeinterface #125 <Method boolean List.add(Object)>
	//   44   96:pop             
		}
		if(obj instanceof TypeAdapter)
	//*  45   97:aload_2         
	//*  46   98:instanceof      #191 <Class TypeAdapter>
	//*  47  101:ifeq            125
			factories.add(((Object) (TypeAdapters.newFactory(TypeToken.get(type), (TypeAdapter)obj))));
	//   48  104:aload_0         
	//   49  105:getfield        #65  <Field List factories>
	//   50  108:aload_1         
	//   51  109:invokestatic    #209 <Method TypeToken TypeToken.get(Type)>
	//   52  112:aload_2         
	//   53  113:checkcast       #191 <Class TypeAdapter>
	//   54  116:invokestatic    #218 <Method TypeAdapterFactory TypeAdapters.newFactory(TypeToken, TypeAdapter)>
	//   55  119:invokeinterface #125 <Method boolean List.add(Object)>
	//   56  124:pop             
		return this;
	//   57  125:aload_0         
	//   58  126:areturn         
	}

	public GsonBuilder registerTypeAdapterFactory(TypeAdapterFactory typeadapterfactory)
	{
		factories.add(((Object) (typeadapterfactory)));
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field List factories>
	//    2    4:aload_1         
	//    3    5:invokeinterface #125 <Method boolean List.add(Object)>
	//    4   10:pop             
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public GsonBuilder registerTypeHierarchyAdapter(Class class1, Object obj)
	{
		boolean flag;
		if((obj instanceof JsonSerializer) || (obj instanceof JsonDeserializer) || (obj instanceof TypeAdapter))
	//*   0    0:aload_2         
	//*   1    1:instanceof      #185 <Class JsonSerializer>
	//*   2    4:ifne            21
	//*   3    7:aload_2         
	//*   4    8:instanceof      #187 <Class JsonDeserializer>
	//*   5   11:ifne            21
	//*   6   14:aload_2         
	//*   7   15:instanceof      #191 <Class TypeAdapter>
	//*   8   18:ifeq            26
			flag = true;
	//    9   21:iconst_1        
	//   10   22:istore_3        
		else
	//*  11   23:goto            28
			flag = false;
	//   12   26:iconst_0        
	//   13   27:istore_3        
		com.google.gson.internal..Gson.Preconditions.checkArgument(flag);
	//   14   28:iload_3         
	//   15   29:invokestatic    #197 <Method void com.google.gson.internal.$Gson$Preconditions.checkArgument(boolean)>
		if((obj instanceof JsonDeserializer) || (obj instanceof JsonSerializer))
	//*  16   32:aload_2         
	//*  17   33:instanceof      #187 <Class JsonDeserializer>
	//*  18   36:ifne            46
	//*  19   39:aload_2         
	//*  20   40:instanceof      #185 <Class JsonSerializer>
	//*  21   43:ifeq            61
			hierarchyFactories.add(((Object) (TreeTypeAdapter.newTypeHierarchyFactory(class1, obj))));
	//   22   46:aload_0         
	//   23   47:getfield        #67  <Field List hierarchyFactories>
	//   24   50:aload_1         
	//   25   51:aload_2         
	//   26   52:invokestatic    #226 <Method TypeAdapterFactory TreeTypeAdapter.newTypeHierarchyFactory(Class, Object)>
	//   27   55:invokeinterface #125 <Method boolean List.add(Object)>
	//   28   60:pop             
		if(obj instanceof TypeAdapter)
	//*  29   61:aload_2         
	//*  30   62:instanceof      #191 <Class TypeAdapter>
	//*  31   65:ifeq            86
			factories.add(((Object) (TypeAdapters.newTypeHierarchyFactory(class1, (TypeAdapter)obj))));
	//   32   68:aload_0         
	//   33   69:getfield        #65  <Field List factories>
	//   34   72:aload_1         
	//   35   73:aload_2         
	//   36   74:checkcast       #191 <Class TypeAdapter>
	//   37   77:invokestatic    #228 <Method TypeAdapterFactory TypeAdapters.newTypeHierarchyFactory(Class, TypeAdapter)>
	//   38   80:invokeinterface #125 <Method boolean List.add(Object)>
	//   39   85:pop             
		return this;
	//   40   86:aload_0         
	//   41   87:areturn         
	}

	public GsonBuilder serializeNulls()
	{
		serializeNulls = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #69  <Field boolean serializeNulls>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GsonBuilder serializeSpecialFloatingPointValues()
	{
		serializeSpecialFloatingPointValues = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #77  <Field boolean serializeSpecialFloatingPointValues>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GsonBuilder setDateFormat(int i)
	{
		dateStyle = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #71  <Field int dateStyle>
		datePattern = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #158 <Field String datePattern>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public GsonBuilder setDateFormat(int i, int j)
	{
		dateStyle = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #71  <Field int dateStyle>
		timeStyle = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #73  <Field int timeStyle>
		datePattern = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #158 <Field String datePattern>
		return this;
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public GsonBuilder setDateFormat(String s)
	{
		datePattern = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #158 <Field String datePattern>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public transient GsonBuilder setExclusionStrategies(ExclusionStrategy aexclusionstrategy[])
	{
		int j = aexclusionstrategy.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          37
		{
			ExclusionStrategy exclusionstrategy = aexclusionstrategy[i];
	//    8   10:aload_1         
	//    9   11:iload_2         
	//   10   12:aaload          
	//   11   13:astore          4
			excluder = excluder.withExclusionStrategy(exclusionstrategy, true, true);
	//   12   15:aload_0         
	//   13   16:aload_0         
	//   14   17:getfield        #41  <Field Excluder excluder>
	//   15   20:aload           4
	//   16   22:iconst_1        
	//   17   23:iconst_1        
	//   18   24:invokevirtual   #133 <Method Excluder Excluder.withExclusionStrategy(ExclusionStrategy, boolean, boolean)>
	//   19   27:putfield        #41  <Field Excluder excluder>
		}

	//   20   30:iload_2         
	//   21   31:iconst_1        
	//   22   32:iadd            
	//   23   33:istore_2        
	//*  24   34:goto            5
		return this;
	//   25   37:aload_0         
	//   26   38:areturn         
	}

	public GsonBuilder setFieldNamingPolicy(FieldNamingPolicy fieldnamingpolicy)
	{
		fieldNamingPolicy = ((FieldNamingStrategy) (fieldnamingpolicy));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field FieldNamingStrategy fieldNamingPolicy>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GsonBuilder setFieldNamingStrategy(FieldNamingStrategy fieldnamingstrategy)
	{
		fieldNamingPolicy = fieldnamingstrategy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field FieldNamingStrategy fieldNamingPolicy>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GsonBuilder setLenient()
	{
		lenient = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #85  <Field boolean lenient>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GsonBuilder setLongSerializationPolicy(LongSerializationPolicy longserializationpolicy)
	{
		longSerializationPolicy = longserializationpolicy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field LongSerializationPolicy longSerializationPolicy>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GsonBuilder setPrettyPrinting()
	{
		prettyPrinting = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #81  <Field boolean prettyPrinting>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GsonBuilder setVersion(double d)
	{
		excluder = excluder.withVersion(d);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field Excluder excluder>
	//    3    5:dload_1         
	//    4    6:invokevirtual   #249 <Method Excluder Excluder.withVersion(double)>
	//    5    9:putfield        #41  <Field Excluder excluder>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	private boolean complexMapKeySerialization;
	private String datePattern;
	private int dateStyle;
	private boolean escapeHtmlChars;
	private Excluder excluder;
	private final List factories = new ArrayList();
	private FieldNamingStrategy fieldNamingPolicy;
	private boolean generateNonExecutableJson;
	private final List hierarchyFactories = new ArrayList();
	private final Map instanceCreators = new HashMap();
	private boolean lenient;
	private LongSerializationPolicy longSerializationPolicy;
	private boolean prettyPrinting;
	private boolean serializeNulls;
	private boolean serializeSpecialFloatingPointValues;
	private int timeStyle;
}
