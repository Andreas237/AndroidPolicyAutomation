// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import com.google.gson.internal.Excluder;
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
//			LongSerializationPolicy, FieldNamingPolicy, DefaultDateTypeAdapter, TreeTypeAdapter, 
//			Gson, JsonSerializer, JsonDeserializer, InstanceCreator, 
//			TypeAdapter, FieldNamingStrategy, ExclusionStrategy, TypeAdapterFactory

public final class GsonBuilder
{

	public GsonBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		excluder = Excluder.DEFAULT;
	//    2    4:aload_0         
	//    3    5:getstatic       #38  <Field Excluder Excluder.DEFAULT>
	//    4    8:putfield        #40  <Field Excluder excluder>
		longSerializationPolicy = LongSerializationPolicy.DEFAULT;
	//    5   11:aload_0         
	//    6   12:getstatic       #44  <Field LongSerializationPolicy LongSerializationPolicy.DEFAULT>
	//    7   15:putfield        #46  <Field LongSerializationPolicy longSerializationPolicy>
		fieldNamingPolicy = ((FieldNamingStrategy) (FieldNamingPolicy.IDENTITY));
	//    8   18:aload_0         
	//    9   19:getstatic       #52  <Field FieldNamingPolicy FieldNamingPolicy.IDENTITY>
	//   10   22:putfield        #54  <Field FieldNamingStrategy fieldNamingPolicy>
	//   11   25:aload_0         
	//   12   26:new             #56  <Class HashMap>
	//   13   29:dup             
	//   14   30:invokespecial   #57  <Method void HashMap()>
	//   15   33:putfield        #59  <Field Map instanceCreators>
	//   16   36:aload_0         
	//   17   37:new             #61  <Class ArrayList>
	//   18   40:dup             
	//   19   41:invokespecial   #62  <Method void ArrayList()>
	//   20   44:putfield        #64  <Field List factories>
	//   21   47:aload_0         
	//   22   48:new             #61  <Class ArrayList>
	//   23   51:dup             
	//   24   52:invokespecial   #62  <Method void ArrayList()>
	//   25   55:putfield        #66  <Field List hierarchyFactories>
		dateStyle = 2;
	//   26   58:aload_0         
	//   27   59:iconst_2        
	//   28   60:putfield        #68  <Field int dateStyle>
		timeStyle = 2;
	//   29   63:aload_0         
	//   30   64:iconst_2        
	//   31   65:putfield        #70  <Field int timeStyle>
		escapeHtmlChars = true;
	//   32   68:aload_0         
	//   33   69:iconst_1        
	//   34   70:putfield        #72  <Field boolean escapeHtmlChars>
	//   35   73:return          
	}

	private void addTypeAdaptersForDate(String s, int i, int j, List list)
	{
		if(s == null || "".equals(((Object) (s.trim())))) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnull          77
	//    2    4:ldc1            #77  <String "">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #83  <Method String String.trim()>
	//    5   10:invokevirtual   #87  <Method boolean String.equals(Object)>
	//    6   13:ifne            77
_L1:
		s = ((String) (new DefaultDateTypeAdapter(s)));
	//    7   16:new             #89  <Class DefaultDateTypeAdapter>
	//    8   19:dup             
	//    9   20:aload_1         
	//   10   21:invokespecial   #92  <Method void DefaultDateTypeAdapter(String)>
	//   11   24:astore_1        
_L6:
		list.add(((Object) (TreeTypeAdapter.newFactory(TypeToken.get(java/util/Date), ((Object) (s))))));
	//   12   25:aload           4
	//   13   27:ldc1            #94  <Class Date>
	//   14   29:invokestatic    #100 <Method TypeToken TypeToken.get(Class)>
	//   15   32:aload_1         
	//   16   33:invokestatic    #106 <Method TypeAdapterFactory TreeTypeAdapter.newFactory(TypeToken, Object)>
	//   17   36:invokeinterface #111 <Method boolean List.add(Object)>
	//   18   41:pop             
		list.add(((Object) (TreeTypeAdapter.newFactory(TypeToken.get(java/sql/Timestamp), ((Object) (s))))));
	//   19   42:aload           4
	//   20   44:ldc1            #113 <Class Timestamp>
	//   21   46:invokestatic    #100 <Method TypeToken TypeToken.get(Class)>
	//   22   49:aload_1         
	//   23   50:invokestatic    #106 <Method TypeAdapterFactory TreeTypeAdapter.newFactory(TypeToken, Object)>
	//   24   53:invokeinterface #111 <Method boolean List.add(Object)>
	//   25   58:pop             
		list.add(((Object) (TreeTypeAdapter.newFactory(TypeToken.get(java/sql/Date), ((Object) (s))))));
	//   26   59:aload           4
	//   27   61:ldc1            #115 <Class java.sql.Date>
	//   28   63:invokestatic    #100 <Method TypeToken TypeToken.get(Class)>
	//   29   66:aload_1         
	//   30   67:invokestatic    #106 <Method TypeAdapterFactory TreeTypeAdapter.newFactory(TypeToken, Object)>
	//   31   70:invokeinterface #111 <Method boolean List.add(Object)>
	//   32   75:pop             
_L4:
		return;
	//   33   76:return          
_L2:
		if(i == 2 || j == 2) goto _L4; else goto _L3
	//   34   77:iload_2         
	//   35   78:iconst_2        
	//   36   79:icmpeq          76
	//   37   82:iload_3         
	//   38   83:iconst_2        
	//   39   84:icmpeq          76
_L3:
		s = ((String) (new DefaultDateTypeAdapter(i, j)));
	//   40   87:new             #89  <Class DefaultDateTypeAdapter>
	//   41   90:dup             
	//   42   91:iload_2         
	//   43   92:iload_3         
	//   44   93:invokespecial   #118 <Method void DefaultDateTypeAdapter(int, int)>
	//   45   96:astore_1        
		if(true) goto _L6; else goto _L5
	//   46   97:goto            25
_L5:
	}

	public GsonBuilder addDeserializationExclusionStrategy(ExclusionStrategy exclusionstrategy)
	{
		excluder = excluder.withExclusionStrategy(exclusionstrategy, false, true);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field Excluder excluder>
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:iconst_1        
	//    6    8:invokevirtual   #126 <Method Excluder Excluder.withExclusionStrategy(ExclusionStrategy, boolean, boolean)>
	//    7   11:putfield        #40  <Field Excluder excluder>
		return this;
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	public GsonBuilder addSerializationExclusionStrategy(ExclusionStrategy exclusionstrategy)
	{
		excluder = excluder.withExclusionStrategy(exclusionstrategy, true, false);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field Excluder excluder>
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #126 <Method Excluder Excluder.withExclusionStrategy(ExclusionStrategy, boolean, boolean)>
	//    7   11:putfield        #40  <Field Excluder excluder>
		return this;
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	public Gson create()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #61  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void ArrayList()>
	//    3    7:astore_1        
		((List) (arraylist)).addAll(((java.util.Collection) (factories)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #64  <Field List factories>
	//    7   13:invokeinterface #133 <Method boolean List.addAll(java.util.Collection)>
	//    8   18:pop             
		Collections.reverse(((List) (arraylist)));
	//    9   19:aload_1         
	//   10   20:invokestatic    #139 <Method void Collections.reverse(List)>
		((List) (arraylist)).addAll(((java.util.Collection) (hierarchyFactories)));
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #66  <Field List hierarchyFactories>
	//   14   28:invokeinterface #133 <Method boolean List.addAll(java.util.Collection)>
	//   15   33:pop             
		addTypeAdaptersForDate(datePattern, dateStyle, timeStyle, ((List) (arraylist)));
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:getfield        #141 <Field String datePattern>
	//   19   39:aload_0         
	//   20   40:getfield        #68  <Field int dateStyle>
	//   21   43:aload_0         
	//   22   44:getfield        #70  <Field int timeStyle>
	//   23   47:aload_1         
	//   24   48:invokespecial   #143 <Method void addTypeAdaptersForDate(String, int, int, List)>
		return new Gson(excluder, fieldNamingPolicy, instanceCreators, serializeNulls, complexMapKeySerialization, generateNonExecutableJson, escapeHtmlChars, prettyPrinting, serializeSpecialFloatingPointValues, longSerializationPolicy, ((List) (arraylist)));
	//   25   51:new             #145 <Class Gson>
	//   26   54:dup             
	//   27   55:aload_0         
	//   28   56:getfield        #40  <Field Excluder excluder>
	//   29   59:aload_0         
	//   30   60:getfield        #54  <Field FieldNamingStrategy fieldNamingPolicy>
	//   31   63:aload_0         
	//   32   64:getfield        #59  <Field Map instanceCreators>
	//   33   67:aload_0         
	//   34   68:getfield        #147 <Field boolean serializeNulls>
	//   35   71:aload_0         
	//   36   72:getfield        #149 <Field boolean complexMapKeySerialization>
	//   37   75:aload_0         
	//   38   76:getfield        #151 <Field boolean generateNonExecutableJson>
	//   39   79:aload_0         
	//   40   80:getfield        #72  <Field boolean escapeHtmlChars>
	//   41   83:aload_0         
	//   42   84:getfield        #153 <Field boolean prettyPrinting>
	//   43   87:aload_0         
	//   44   88:getfield        #155 <Field boolean serializeSpecialFloatingPointValues>
	//   45   91:aload_0         
	//   46   92:getfield        #46  <Field LongSerializationPolicy longSerializationPolicy>
	//   47   95:aload_1         
	//   48   96:invokespecial   #158 <Method void Gson(Excluder, FieldNamingStrategy, Map, boolean, boolean, boolean, boolean, boolean, boolean, LongSerializationPolicy, List)>
	//   49   99:areturn         
	}

	public GsonBuilder disableHtmlEscaping()
	{
		escapeHtmlChars = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #72  <Field boolean escapeHtmlChars>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GsonBuilder disableInnerClassSerialization()
	{
		excluder = excluder.disableInnerClassSerialization();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field Excluder excluder>
	//    3    5:invokevirtual   #164 <Method Excluder Excluder.disableInnerClassSerialization()>
	//    4    8:putfield        #40  <Field Excluder excluder>
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public GsonBuilder enableComplexMapKeySerialization()
	{
		complexMapKeySerialization = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #149 <Field boolean complexMapKeySerialization>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public transient GsonBuilder excludeFieldsWithModifiers(int ai[])
	{
		excluder = excluder.withModifiers(ai);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field Excluder excluder>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #171 <Method Excluder Excluder.withModifiers(int[])>
	//    5    9:putfield        #40  <Field Excluder excluder>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public GsonBuilder excludeFieldsWithoutExposeAnnotation()
	{
		excluder = excluder.excludeFieldsWithoutExposeAnnotation();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field Excluder excluder>
	//    3    5:invokevirtual   #174 <Method Excluder Excluder.excludeFieldsWithoutExposeAnnotation()>
	//    4    8:putfield        #40  <Field Excluder excluder>
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public GsonBuilder generateNonExecutableJson()
	{
		generateNonExecutableJson = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #151 <Field boolean generateNonExecutableJson>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GsonBuilder registerTypeAdapter(Type type, Object obj)
	{
		boolean flag;
		if((obj instanceof JsonSerializer) || (obj instanceof JsonDeserializer) || (obj instanceof InstanceCreator) || (obj instanceof TypeAdapter))
	//*   0    0:aload_2         
	//*   1    1:instanceof      #178 <Class JsonSerializer>
	//*   2    4:ifne            28
	//*   3    7:aload_2         
	//*   4    8:instanceof      #180 <Class JsonDeserializer>
	//*   5   11:ifne            28
	//*   6   14:aload_2         
	//*   7   15:instanceof      #182 <Class InstanceCreator>
	//*   8   18:ifne            28
	//*   9   21:aload_2         
	//*  10   22:instanceof      #184 <Class TypeAdapter>
	//*  11   25:ifeq            122
			flag = true;
	//   12   28:iconst_1        
	//   13   29:istore_3        
		else
	//*  14   30:iload_3         
	//*  15   31:invokestatic    #190 <Method void com.google.gson.internal.$Gson$Preconditions.checkArgument(boolean)>
	//*  16   34:aload_2         
	//*  17   35:instanceof      #182 <Class InstanceCreator>
	//*  18   38:ifeq            56
	//*  19   41:aload_0         
	//*  20   42:getfield        #59  <Field Map instanceCreators>
	//*  21   45:aload_1         
	//*  22   46:aload_2         
	//*  23   47:checkcast       #182 <Class InstanceCreator>
	//*  24   50:invokeinterface #196 <Method Object Map.put(Object, Object)>
	//*  25   55:pop             
	//*  26   56:aload_2         
	//*  27   57:instanceof      #178 <Class JsonSerializer>
	//*  28   60:ifne            70
	//*  29   63:aload_2         
	//*  30   64:instanceof      #180 <Class JsonDeserializer>
	//*  31   67:ifeq            92
	//*  32   70:aload_1         
	//*  33   71:invokestatic    #199 <Method TypeToken TypeToken.get(Type)>
	//*  34   74:astore          4
	//*  35   76:aload_0         
	//*  36   77:getfield        #64  <Field List factories>
	//*  37   80:aload           4
	//*  38   82:aload_2         
	//*  39   83:invokestatic    #202 <Method TypeAdapterFactory TreeTypeAdapter.newFactoryWithMatchRawType(TypeToken, Object)>
	//*  40   86:invokeinterface #111 <Method boolean List.add(Object)>
	//*  41   91:pop             
	//*  42   92:aload_2         
	//*  43   93:instanceof      #184 <Class TypeAdapter>
	//*  44   96:ifeq            120
	//*  45   99:aload_0         
	//*  46  100:getfield        #64  <Field List factories>
	//*  47  103:aload_1         
	//*  48  104:invokestatic    #199 <Method TypeToken TypeToken.get(Type)>
	//*  49  107:aload_2         
	//*  50  108:checkcast       #184 <Class TypeAdapter>
	//*  51  111:invokestatic    #207 <Method TypeAdapterFactory TypeAdapters.newFactory(TypeToken, TypeAdapter)>
	//*  52  114:invokeinterface #111 <Method boolean List.add(Object)>
	//*  53  119:pop             
	//*  54  120:aload_0         
	//*  55  121:areturn         
			flag = false;
	//   56  122:iconst_0        
	//   57  123:istore_3        
		com.google.gson.internal..Gson.Preconditions.checkArgument(flag);
		if(obj instanceof InstanceCreator)
			instanceCreators.put(((Object) (type)), ((Object) ((InstanceCreator)obj)));
		if((obj instanceof JsonSerializer) || (obj instanceof JsonDeserializer))
		{
			TypeToken typetoken = TypeToken.get(type);
			factories.add(((Object) (TreeTypeAdapter.newFactoryWithMatchRawType(typetoken, obj))));
		}
		if(obj instanceof TypeAdapter)
			factories.add(((Object) (TypeAdapters.newFactory(TypeToken.get(type), (TypeAdapter)obj))));
		return this;
	//*  58  124:goto            30
	}

	public GsonBuilder registerTypeAdapterFactory(TypeAdapterFactory typeadapterfactory)
	{
		factories.add(((Object) (typeadapterfactory)));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field List factories>
	//    2    4:aload_1         
	//    3    5:invokeinterface #111 <Method boolean List.add(Object)>
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
	//*   1    1:instanceof      #178 <Class JsonSerializer>
	//*   2    4:ifne            21
	//*   3    7:aload_2         
	//*   4    8:instanceof      #180 <Class JsonDeserializer>
	//*   5   11:ifne            21
	//*   6   14:aload_2         
	//*   7   15:instanceof      #184 <Class TypeAdapter>
	//*   8   18:ifeq            83
			flag = true;
	//    9   21:iconst_1        
	//   10   22:istore_3        
		else
	//*  11   23:iload_3         
	//*  12   24:invokestatic    #190 <Method void com.google.gson.internal.$Gson$Preconditions.checkArgument(boolean)>
	//*  13   27:aload_2         
	//*  14   28:instanceof      #180 <Class JsonDeserializer>
	//*  15   31:ifne            41
	//*  16   34:aload_2         
	//*  17   35:instanceof      #178 <Class JsonSerializer>
	//*  18   38:ifeq            56
	//*  19   41:aload_0         
	//*  20   42:getfield        #66  <Field List hierarchyFactories>
	//*  21   45:iconst_0        
	//*  22   46:aload_1         
	//*  23   47:aload_2         
	//*  24   48:invokestatic    #215 <Method TypeAdapterFactory TreeTypeAdapter.newTypeHierarchyFactory(Class, Object)>
	//*  25   51:invokeinterface #218 <Method void List.add(int, Object)>
	//*  26   56:aload_2         
	//*  27   57:instanceof      #184 <Class TypeAdapter>
	//*  28   60:ifeq            81
	//*  29   63:aload_0         
	//*  30   64:getfield        #64  <Field List factories>
	//*  31   67:aload_1         
	//*  32   68:aload_2         
	//*  33   69:checkcast       #184 <Class TypeAdapter>
	//*  34   72:invokestatic    #221 <Method TypeAdapterFactory TypeAdapters.newTypeHierarchyFactory(Class, TypeAdapter)>
	//*  35   75:invokeinterface #111 <Method boolean List.add(Object)>
	//*  36   80:pop             
	//*  37   81:aload_0         
	//*  38   82:areturn         
			flag = false;
	//   39   83:iconst_0        
	//   40   84:istore_3        
		com.google.gson.internal..Gson.Preconditions.checkArgument(flag);
		if((obj instanceof JsonDeserializer) || (obj instanceof JsonSerializer))
			hierarchyFactories.add(0, ((Object) (TreeTypeAdapter.newTypeHierarchyFactory(class1, obj))));
		if(obj instanceof TypeAdapter)
			factories.add(((Object) (TypeAdapters.newTypeHierarchyFactory(class1, (TypeAdapter)obj))));
		return this;
	//*  41   85:goto            23
	}

	public GsonBuilder serializeNulls()
	{
		serializeNulls = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #147 <Field boolean serializeNulls>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GsonBuilder serializeSpecialFloatingPointValues()
	{
		serializeSpecialFloatingPointValues = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #155 <Field boolean serializeSpecialFloatingPointValues>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GsonBuilder setDateFormat(int i)
	{
		dateStyle = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #68  <Field int dateStyle>
		datePattern = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #141 <Field String datePattern>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public GsonBuilder setDateFormat(int i, int j)
	{
		dateStyle = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #68  <Field int dateStyle>
		timeStyle = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #70  <Field int timeStyle>
		datePattern = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #141 <Field String datePattern>
		return this;
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public GsonBuilder setDateFormat(String s)
	{
		datePattern = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #141 <Field String datePattern>
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
	//   14   17:getfield        #40  <Field Excluder excluder>
	//   15   20:aload           4
	//   16   22:iconst_1        
	//   17   23:iconst_1        
	//   18   24:invokevirtual   #126 <Method Excluder Excluder.withExclusionStrategy(ExclusionStrategy, boolean, boolean)>
	//   19   27:putfield        #40  <Field Excluder excluder>
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
	//    2    2:putfield        #54  <Field FieldNamingStrategy fieldNamingPolicy>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GsonBuilder setFieldNamingStrategy(FieldNamingStrategy fieldnamingstrategy)
	{
		fieldNamingPolicy = fieldnamingstrategy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field FieldNamingStrategy fieldNamingPolicy>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GsonBuilder setLongSerializationPolicy(LongSerializationPolicy longserializationpolicy)
	{
		longSerializationPolicy = longserializationpolicy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field LongSerializationPolicy longSerializationPolicy>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GsonBuilder setPrettyPrinting()
	{
		prettyPrinting = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #153 <Field boolean prettyPrinting>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GsonBuilder setVersion(double d)
	{
		excluder = excluder.withVersion(d);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field Excluder excluder>
	//    3    5:dload_1         
	//    4    6:invokevirtual   #241 <Method Excluder Excluder.withVersion(double)>
	//    5    9:putfield        #40  <Field Excluder excluder>
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
	private LongSerializationPolicy longSerializationPolicy;
	private boolean prettyPrinting;
	private boolean serializeNulls;
	private boolean serializeSpecialFloatingPointValues;
	private int timeStyle;
}
