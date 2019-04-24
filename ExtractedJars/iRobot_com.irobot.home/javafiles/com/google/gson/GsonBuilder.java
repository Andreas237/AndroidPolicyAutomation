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
label0:
		{
			if(s != null && !"".equals(((Object) (s.trim()))))
	//*   0    0:aload_1         
	//*   1    1:ifnull          28
	//*   2    4:ldc1            #77  <String "">
	//*   3    6:aload_1         
	//*   4    7:invokevirtual   #83  <Method String String.trim()>
	//*   5   10:invokevirtual   #87  <Method boolean String.equals(Object)>
	//*   6   13:ifne            28
			{
				s = ((String) (new DefaultDateTypeAdapter(s)));
	//    7   16:new             #89  <Class DefaultDateTypeAdapter>
	//    8   19:dup             
	//    9   20:aload_1         
	//   10   21:invokespecial   #92  <Method void DefaultDateTypeAdapter(String)>
	//   11   24:astore_1        
			} else
	//*  12   25:goto            48
			{
				if(i == 2 || j == 2)
					break label0;
	//   13   28:iload_2         
	//   14   29:iconst_2        
	//   15   30:icmpeq          99
	//   16   33:iload_3         
	//   17   34:iconst_2        
	//   18   35:icmpeq          99
				s = ((String) (new DefaultDateTypeAdapter(i, j)));
	//   19   38:new             #89  <Class DefaultDateTypeAdapter>
	//   20   41:dup             
	//   21   42:iload_2         
	//   22   43:iload_3         
	//   23   44:invokespecial   #95  <Method void DefaultDateTypeAdapter(int, int)>
	//   24   47:astore_1        
			}
			list.add(((Object) (TreeTypeAdapter.newFactory(TypeToken.get(java/util/Date), ((Object) (s))))));
	//   25   48:aload           4
	//   26   50:ldc1            #97  <Class Date>
	//   27   52:invokestatic    #103 <Method TypeToken TypeToken.get(Class)>
	//   28   55:aload_1         
	//   29   56:invokestatic    #109 <Method TypeAdapterFactory TreeTypeAdapter.newFactory(TypeToken, Object)>
	//   30   59:invokeinterface #114 <Method boolean List.add(Object)>
	//   31   64:pop             
			list.add(((Object) (TreeTypeAdapter.newFactory(TypeToken.get(java/sql/Timestamp), ((Object) (s))))));
	//   32   65:aload           4
	//   33   67:ldc1            #116 <Class Timestamp>
	//   34   69:invokestatic    #103 <Method TypeToken TypeToken.get(Class)>
	//   35   72:aload_1         
	//   36   73:invokestatic    #109 <Method TypeAdapterFactory TreeTypeAdapter.newFactory(TypeToken, Object)>
	//   37   76:invokeinterface #114 <Method boolean List.add(Object)>
	//   38   81:pop             
			list.add(((Object) (TreeTypeAdapter.newFactory(TypeToken.get(java/sql/Date), ((Object) (s))))));
	//   39   82:aload           4
	//   40   84:ldc1            #118 <Class java.sql.Date>
	//   41   86:invokestatic    #103 <Method TypeToken TypeToken.get(Class)>
	//   42   89:aload_1         
	//   43   90:invokestatic    #109 <Method TypeAdapterFactory TreeTypeAdapter.newFactory(TypeToken, Object)>
	//   44   93:invokeinterface #114 <Method boolean List.add(Object)>
	//   45   98:pop             
		}
	//   46   99:return          
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
		boolean flag1 = obj instanceof JsonSerializer;
	//    0    0:aload_2         
	//    1    1:instanceof      #178 <Class JsonSerializer>
	//    2    4:istore          4
		boolean flag;
		if(!flag1 && !(obj instanceof JsonDeserializer) && !(obj instanceof InstanceCreator) && !(obj instanceof TypeAdapter))
	//*   3    6:iload           4
	//*   4    8:ifne            40
	//*   5   11:aload_2         
	//*   6   12:instanceof      #180 <Class JsonDeserializer>
	//*   7   15:ifne            40
	//*   8   18:aload_2         
	//*   9   19:instanceof      #182 <Class InstanceCreator>
	//*  10   22:ifne            40
	//*  11   25:aload_2         
	//*  12   26:instanceof      #184 <Class TypeAdapter>
	//*  13   29:ifeq            35
	//*  14   32:goto            40
			flag = false;
	//   15   35:iconst_0        
	//   16   36:istore_3        
		else
	//*  17   37:goto            42
			flag = true;
	//   18   40:iconst_1        
	//   19   41:istore_3        
		com.google.gson.internal..Gson.Preconditions.checkArgument(flag);
	//   20   42:iload_3         
	//   21   43:invokestatic    #190 <Method void com.google.gson.internal.$Gson$Preconditions.checkArgument(boolean)>
		if(obj instanceof InstanceCreator)
	//*  22   46:aload_2         
	//*  23   47:instanceof      #182 <Class InstanceCreator>
	//*  24   50:ifeq            68
			instanceCreators.put(((Object) (type)), ((Object) ((InstanceCreator)obj)));
	//   25   53:aload_0         
	//   26   54:getfield        #59  <Field Map instanceCreators>
	//   27   57:aload_1         
	//   28   58:aload_2         
	//   29   59:checkcast       #182 <Class InstanceCreator>
	//   30   62:invokeinterface #196 <Method Object Map.put(Object, Object)>
	//   31   67:pop             
		if(flag1 || (obj instanceof JsonDeserializer))
	//*  32   68:iload           4
	//*  33   70:ifne            80
	//*  34   73:aload_2         
	//*  35   74:instanceof      #180 <Class JsonDeserializer>
	//*  36   77:ifeq            102
		{
			TypeToken typetoken = TypeToken.get(type);
	//   37   80:aload_1         
	//   38   81:invokestatic    #199 <Method TypeToken TypeToken.get(Type)>
	//   39   84:astore          5
			factories.add(((Object) (TreeTypeAdapter.newFactoryWithMatchRawType(typetoken, obj))));
	//   40   86:aload_0         
	//   41   87:getfield        #64  <Field List factories>
	//   42   90:aload           5
	//   43   92:aload_2         
	//   44   93:invokestatic    #202 <Method TypeAdapterFactory TreeTypeAdapter.newFactoryWithMatchRawType(TypeToken, Object)>
	//   45   96:invokeinterface #114 <Method boolean List.add(Object)>
	//   46  101:pop             
		}
		if(obj instanceof TypeAdapter)
	//*  47  102:aload_2         
	//*  48  103:instanceof      #184 <Class TypeAdapter>
	//*  49  106:ifeq            130
			factories.add(((Object) (TypeAdapters.newFactory(TypeToken.get(type), (TypeAdapter)obj))));
	//   50  109:aload_0         
	//   51  110:getfield        #64  <Field List factories>
	//   52  113:aload_1         
	//   53  114:invokestatic    #199 <Method TypeToken TypeToken.get(Type)>
	//   54  117:aload_2         
	//   55  118:checkcast       #184 <Class TypeAdapter>
	//   56  121:invokestatic    #207 <Method TypeAdapterFactory TypeAdapters.newFactory(TypeToken, TypeAdapter)>
	//   57  124:invokeinterface #114 <Method boolean List.add(Object)>
	//   58  129:pop             
		return this;
	//   59  130:aload_0         
	//   60  131:areturn         
	}

	public GsonBuilder registerTypeAdapterFactory(TypeAdapterFactory typeadapterfactory)
	{
		factories.add(((Object) (typeadapterfactory)));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field List factories>
	//    2    4:aload_1         
	//    3    5:invokeinterface #114 <Method boolean List.add(Object)>
	//    4   10:pop             
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public GsonBuilder registerTypeHierarchyAdapter(Class class1, Object obj)
	{
		boolean flag1 = obj instanceof JsonSerializer;
	//    0    0:aload_2         
	//    1    1:instanceof      #178 <Class JsonSerializer>
	//    2    4:istore          4
		boolean flag;
		if(!flag1 && !(obj instanceof JsonDeserializer) && !(obj instanceof TypeAdapter))
	//*   3    6:iload           4
	//*   4    8:ifne            33
	//*   5   11:aload_2         
	//*   6   12:instanceof      #180 <Class JsonDeserializer>
	//*   7   15:ifne            33
	//*   8   18:aload_2         
	//*   9   19:instanceof      #184 <Class TypeAdapter>
	//*  10   22:ifeq            28
	//*  11   25:goto            33
			flag = false;
	//   12   28:iconst_0        
	//   13   29:istore_3        
		else
	//*  14   30:goto            35
			flag = true;
	//   15   33:iconst_1        
	//   16   34:istore_3        
		com.google.gson.internal..Gson.Preconditions.checkArgument(flag);
	//   17   35:iload_3         
	//   18   36:invokestatic    #190 <Method void com.google.gson.internal.$Gson$Preconditions.checkArgument(boolean)>
		if((obj instanceof JsonDeserializer) || flag1)
	//*  19   39:aload_2         
	//*  20   40:instanceof      #180 <Class JsonDeserializer>
	//*  21   43:ifne            51
	//*  22   46:iload           4
	//*  23   48:ifeq            66
			hierarchyFactories.add(0, ((Object) (TreeTypeAdapter.newTypeHierarchyFactory(class1, obj))));
	//   24   51:aload_0         
	//   25   52:getfield        #66  <Field List hierarchyFactories>
	//   26   55:iconst_0        
	//   27   56:aload_1         
	//   28   57:aload_2         
	//   29   58:invokestatic    #215 <Method TypeAdapterFactory TreeTypeAdapter.newTypeHierarchyFactory(Class, Object)>
	//   30   61:invokeinterface #218 <Method void List.add(int, Object)>
		if(obj instanceof TypeAdapter)
	//*  31   66:aload_2         
	//*  32   67:instanceof      #184 <Class TypeAdapter>
	//*  33   70:ifeq            91
			factories.add(((Object) (TypeAdapters.newTypeHierarchyFactory(class1, (TypeAdapter)obj))));
	//   34   73:aload_0         
	//   35   74:getfield        #64  <Field List factories>
	//   36   77:aload_1         
	//   37   78:aload_2         
	//   38   79:checkcast       #184 <Class TypeAdapter>
	//   39   82:invokestatic    #221 <Method TypeAdapterFactory TypeAdapters.newTypeHierarchyFactory(Class, TypeAdapter)>
	//   40   85:invokeinterface #114 <Method boolean List.add(Object)>
	//   41   90:pop             
		return this;
	//   42   91:aload_0         
	//   43   92:areturn         
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
