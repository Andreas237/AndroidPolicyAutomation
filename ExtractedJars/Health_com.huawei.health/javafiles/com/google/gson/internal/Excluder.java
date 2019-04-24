// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import com.google.gson.*;
import com.google.gson.annotations.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.*;

public final class Excluder
	implements TypeAdapterFactory, Cloneable
{

	public Excluder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		version = -1D;
	//    2    4:aload_0         
	//    3    5:ldc2w           #15  <Double -1D>
	//    4    8:putfield        #37  <Field double version>
		modifiers = 136;
	//    5   11:aload_0         
	//    6   12:sipush          136
	//    7   15:putfield        #39  <Field int modifiers>
		serializeInnerClasses = true;
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:putfield        #41  <Field boolean serializeInnerClasses>
		serializationStrategies = Collections.emptyList();
	//   11   23:aload_0         
	//   12   24:invokestatic    #47  <Method List Collections.emptyList()>
	//   13   27:putfield        #49  <Field List serializationStrategies>
		deserializationStrategies = Collections.emptyList();
	//   14   30:aload_0         
	//   15   31:invokestatic    #47  <Method List Collections.emptyList()>
	//   16   34:putfield        #51  <Field List deserializationStrategies>
	//   17   37:return          
	}

	private boolean isAnonymousOrLocal(Class class1)
	{
		return !((Class) (java/lang/Enum)).isAssignableFrom(class1) && (class1.isAnonymousClass() || class1.isLocalClass());
	//    0    0:ldc1            #55  <Class Enum>
	//    1    2:aload_1         
	//    2    3:invokevirtual   #60  <Method boolean Class.isAssignableFrom(Class)>
	//    3    6:ifne            25
	//    4    9:aload_1         
	//    5   10:invokevirtual   #64  <Method boolean Class.isAnonymousClass()>
	//    6   13:ifne            23
	//    7   16:aload_1         
	//    8   17:invokevirtual   #67  <Method boolean Class.isLocalClass()>
	//    9   20:ifeq            25
	//   10   23:iconst_1        
	//   11   24:ireturn         
	//   12   25:iconst_0        
	//   13   26:ireturn         
	}

	private boolean isInnerClass(Class class1)
	{
		return class1.isMemberClass() && !isStatic(class1);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #73  <Method boolean Class.isMemberClass()>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #76  <Method boolean isStatic(Class)>
	//    6   12:ifne            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	private boolean isStatic(Class class1)
	{
		return (class1.getModifiers() & 8) != 0;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #80  <Method int Class.getModifiers()>
	//    2    4:bipush          8
	//    3    6:iand            
	//    4    7:ifeq            12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	private boolean isValidSince(Since since)
	{
		return since == null || since.value() <= version;
	//    0    0:aload_1         
	//    1    1:ifnull          20
	//    2    4:aload_1         
	//    3    5:invokeinterface #88  <Method double Since.value()>
	//    4   10:aload_0         
	//    5   11:getfield        #37  <Field double version>
	//    6   14:dcmpl           
	//    7   15:ifle            20
	//    8   18:iconst_0        
	//    9   19:ireturn         
	//   10   20:iconst_1        
	//   11   21:ireturn         
	}

	private boolean isValidUntil(Until until)
	{
		return until == null || until.value() > version;
	//    0    0:aload_1         
	//    1    1:ifnull          20
	//    2    4:aload_1         
	//    3    5:invokeinterface #93  <Method double Until.value()>
	//    4   10:aload_0         
	//    5   11:getfield        #37  <Field double version>
	//    6   14:dcmpg           
	//    7   15:ifgt            20
	//    8   18:iconst_0        
	//    9   19:ireturn         
	//   10   20:iconst_1        
	//   11   21:ireturn         
	}

	private boolean isValidVersion(Since since, Until until)
	{
		return isValidSince(since) && isValidUntil(until);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #97  <Method boolean isValidSince(Since)>
	//    3    5:ifeq            18
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:invokespecial   #99  <Method boolean isValidUntil(Until)>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	protected Excluder clone()
	{
		Excluder excluder;
		try
		{
			excluder = (Excluder)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #106 <Method Object Object.clone()>
	//    2    4:checkcast       #2   <Class Excluder>
	//    3    7:astore_1        
		}
	//*   4    8:aload_1         
	//*   5    9:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*   6   10:astore_1        
		{
			throw new AssertionError(((Object) (clonenotsupportedexception)));
	//    7   11:new             #108 <Class AssertionError>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:invokespecial   #111 <Method void AssertionError(Object)>
	//   11   19:athrow          
		}
		return excluder;
	}

	protected volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #113 <Method Excluder clone()>
	//    2    4:areturn         
	}

	public TypeAdapter create(final Gson gson, final TypeToken type)
	{
		Class class1 = type.getRawType();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #122 <Method Class TypeToken.getRawType()>
	//    2    4:astore          5
		final boolean skipSerialize = excludeClass(class1, true);
	//    3    6:aload_0         
	//    4    7:aload           5
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #126 <Method boolean excludeClass(Class, boolean)>
	//    7   13:istore_3        
		final boolean skipDeserialize = excludeClass(class1, false);
	//    8   14:aload_0         
	//    9   15:aload           5
	//   10   17:iconst_0        
	//   11   18:invokevirtual   #126 <Method boolean excludeClass(Class, boolean)>
	//   12   21:istore          4
		if(!skipSerialize && !skipDeserialize)
	//*  13   23:iload_3         
	//*  14   24:ifne            34
	//*  15   27:iload           4
	//*  16   29:ifne            34
			return null;
	//   17   32:aconst_null     
	//   18   33:areturn         
		else
			return ((TypeAdapter) (new TypeAdapter() {

				private TypeAdapter _mthdelegate()
				{
					TypeAdapter typeadapter = _flddelegate;
				//    0    0:aload_0         
				//    1    1:getfield        #40  <Field TypeAdapter _flddelegate>
				//    2    4:astore_1        
					if(typeadapter != null)
				//*   3    5:aload_1         
				//*   4    6:ifnull          11
					{
						return typeadapter;
				//    5    9:aload_1         
				//    6   10:areturn         
					} else
					{
						TypeAdapter typeadapter1 = gson.getDelegateAdapter(((TypeAdapterFactory) (Excluder.this)), type);
				//    7   11:aload_0         
				//    8   12:getfield        #31  <Field Gson val$gson>
				//    9   15:aload_0         
				//   10   16:getfield        #25  <Field Excluder this$0>
				//   11   19:aload_0         
				//   12   20:getfield        #33  <Field TypeToken val$type>
				//   13   23:invokevirtual   #46  <Method TypeAdapter Gson.getDelegateAdapter(TypeAdapterFactory, TypeToken)>
				//   14   26:astore_1        
						_flddelegate = typeadapter1;
				//   15   27:aload_0         
				//   16   28:aload_1         
				//   17   29:putfield        #40  <Field TypeAdapter _flddelegate>
						return typeadapter1;
				//   18   32:aload_1         
				//   19   33:areturn         
					}
				}

				public Object read(JsonReader jsonreader)
					throws IOException
				{
					if(skipDeserialize)
				//*   0    0:aload_0         
				//*   1    1:getfield        #27  <Field boolean val$skipDeserialize>
				//*   2    4:ifeq            13
					{
						jsonreader.skipValue();
				//    3    7:aload_1         
				//    4    8:invokevirtual   #57  <Method void JsonReader.skipValue()>
						return ((Object) (null));
				//    5   11:aconst_null     
				//    6   12:areturn         
					} else
					{
						return _mthdelegate().read(jsonreader);
				//    7   13:aload_0         
				//    8   14:invokespecial   #59  <Method TypeAdapter _mthdelegate()>
				//    9   17:aload_1         
				//   10   18:invokevirtual   #61  <Method Object TypeAdapter.read(JsonReader)>
				//   11   21:areturn         
					}
				}

				public void write(JsonWriter jsonwriter, Object obj)
					throws IOException
				{
					if(skipSerialize)
				//*   0    0:aload_0         
				//*   1    1:getfield        #29  <Field boolean val$skipSerialize>
				//*   2    4:ifeq            13
					{
						jsonwriter.nullValue();
				//    3    7:aload_1         
				//    4    8:invokevirtual   #71  <Method JsonWriter JsonWriter.nullValue()>
				//    5   11:pop             
						return;
				//    6   12:return          
					} else
					{
						_mthdelegate().write(jsonwriter, obj);
				//    7   13:aload_0         
				//    8   14:invokespecial   #59  <Method TypeAdapter _mthdelegate()>
				//    9   17:aload_1         
				//   10   18:aload_2         
				//   11   19:invokevirtual   #73  <Method void TypeAdapter.write(JsonWriter, Object)>
						return;
				//   12   22:return          
					}
				}

				private TypeAdapter _flddelegate;
				final Excluder this$0;
				final Gson val$gson;
				final boolean val$skipDeserialize;
				final boolean val$skipSerialize;
				final TypeToken val$type;

			
			{
				this$0 = Excluder.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field Excluder this$0>
				skipDeserialize = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #27  <Field boolean val$skipDeserialize>
				skipSerialize = flag1;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #29  <Field boolean val$skipSerialize>
				gson = gson1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #31  <Field Gson val$gson>
				type = typetoken;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #33  <Field TypeToken val$type>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #36  <Method void TypeAdapter()>
			//   17   31:return          
			}
			}
));
	//   19   34:new             #10  <Class Excluder$1>
	//   20   37:dup             
	//   21   38:aload_0         
	//   22   39:iload           4
	//   23   41:iload_3         
	//   24   42:aload_1         
	//   25   43:aload_2         
	//   26   44:invokespecial   #129 <Method void Excluder$1(Excluder, boolean, boolean, Gson, TypeToken)>
	//   27   47:areturn         
	}

	public Excluder disableInnerClassSerialization()
	{
		Excluder excluder = clone();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #113 <Method Excluder clone()>
	//    2    4:astore_1        
		excluder.serializeInnerClasses = false;
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:putfield        #41  <Field boolean serializeInnerClasses>
		return excluder;
	//    6   10:aload_1         
	//    7   11:areturn         
	}

	public boolean excludeClass(Class class1, boolean flag)
	{
		if(version != -1D && !isValidVersion((Since)class1.getAnnotation(com/google/gson/annotations/Since), (Until)class1.getAnnotation(com/google/gson/annotations/Until)))
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field double version>
	//*   2    4:ldc2w           #15  <Double -1D>
	//*   3    7:dcmpl           
	//*   4    8:ifeq            38
	//*   5   11:aload_0         
	//*   6   12:aload_1         
	//*   7   13:ldc1            #84  <Class Since>
	//*   8   15:invokevirtual   #135 <Method java.lang.annotation.Annotation Class.getAnnotation(Class)>
	//*   9   18:checkcast       #84  <Class Since>
	//*  10   21:aload_1         
	//*  11   22:ldc1            #92  <Class Until>
	//*  12   24:invokevirtual   #135 <Method java.lang.annotation.Annotation Class.getAnnotation(Class)>
	//*  13   27:checkcast       #92  <Class Until>
	//*  14   30:invokespecial   #137 <Method boolean isValidVersion(Since, Until)>
	//*  15   33:ifne            38
			return true;
	//   16   36:iconst_1        
	//   17   37:ireturn         
		if(!serializeInnerClasses && isInnerClass(class1))
	//*  18   38:aload_0         
	//*  19   39:getfield        #41  <Field boolean serializeInnerClasses>
	//*  20   42:ifne            55
	//*  21   45:aload_0         
	//*  22   46:aload_1         
	//*  23   47:invokespecial   #139 <Method boolean isInnerClass(Class)>
	//*  24   50:ifeq            55
			return true;
	//   25   53:iconst_1        
	//   26   54:ireturn         
		if(isAnonymousOrLocal(class1))
	//*  27   55:aload_0         
	//*  28   56:aload_1         
	//*  29   57:invokespecial   #141 <Method boolean isAnonymousOrLocal(Class)>
	//*  30   60:ifeq            65
			return true;
	//   31   63:iconst_1        
	//   32   64:ireturn         
		Object obj;
		if(flag)
	//*  33   65:iload_2         
	//*  34   66:ifeq            77
			obj = ((Object) (serializationStrategies));
	//   35   69:aload_0         
	//   36   70:getfield        #49  <Field List serializationStrategies>
	//   37   73:astore_3        
		else
	//*  38   74:goto            82
			obj = ((Object) (deserializationStrategies));
	//   39   77:aload_0         
	//   40   78:getfield        #51  <Field List deserializationStrategies>
	//   41   81:astore_3        
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*  42   82:aload_3         
	//*  43   83:invokeinterface #147 <Method Iterator List.iterator()>
	//*  44   88:astore_3        
	//*  45   89:aload_3         
	//*  46   90:invokeinterface #152 <Method boolean Iterator.hasNext()>
	//*  47   95:ifeq            121
			if(((ExclusionStrategy)((Iterator) (obj)).next()).shouldSkipClass(class1))
	//*  48   98:aload_3         
	//*  49   99:invokeinterface #155 <Method Object Iterator.next()>
	//*  50  104:checkcast       #157 <Class ExclusionStrategy>
	//*  51  107:aload_1         
	//*  52  108:invokeinterface #160 <Method boolean ExclusionStrategy.shouldSkipClass(Class)>
	//*  53  113:ifeq            118
				return true;
	//   54  116:iconst_1        
	//   55  117:ireturn         

	//*  56  118:goto            89
		return false;
	//   57  121:iconst_0        
	//   58  122:ireturn         
	}

	public boolean excludeField(Field field, boolean flag)
	{
label0:
		{
			if((modifiers & field.getModifiers()) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field int modifiers>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #166 <Method int Field.getModifiers()>
	//*   4    8:iand            
	//*   5    9:ifeq            14
				return true;
	//    6   12:iconst_1        
	//    7   13:ireturn         
			if(version != -1D && !isValidVersion((Since)field.getAnnotation(com/google/gson/annotations/Since), (Until)field.getAnnotation(com/google/gson/annotations/Until)))
	//*   8   14:aload_0         
	//*   9   15:getfield        #37  <Field double version>
	//*  10   18:ldc2w           #15  <Double -1D>
	//*  11   21:dcmpl           
	//*  12   22:ifeq            52
	//*  13   25:aload_0         
	//*  14   26:aload_1         
	//*  15   27:ldc1            #84  <Class Since>
	//*  16   29:invokevirtual   #167 <Method java.lang.annotation.Annotation Field.getAnnotation(Class)>
	//*  17   32:checkcast       #84  <Class Since>
	//*  18   35:aload_1         
	//*  19   36:ldc1            #92  <Class Until>
	//*  20   38:invokevirtual   #167 <Method java.lang.annotation.Annotation Field.getAnnotation(Class)>
	//*  21   41:checkcast       #92  <Class Until>
	//*  22   44:invokespecial   #137 <Method boolean isValidVersion(Since, Until)>
	//*  23   47:ifne            52
				return true;
	//   24   50:iconst_1        
	//   25   51:ireturn         
			if(field.isSynthetic())
	//*  26   52:aload_1         
	//*  27   53:invokevirtual   #170 <Method boolean Field.isSynthetic()>
	//*  28   56:ifeq            61
				return true;
	//   29   59:iconst_1        
	//   30   60:ireturn         
			if(requireExpose)
	//*  31   61:aload_0         
	//*  32   62:getfield        #172 <Field boolean requireExpose>
	//*  33   65:ifeq            109
			{
				Expose expose = (Expose)field.getAnnotation(com/google/gson/annotations/Expose);
	//   34   68:aload_1         
	//   35   69:ldc1            #174 <Class Expose>
	//   36   71:invokevirtual   #167 <Method java.lang.annotation.Annotation Field.getAnnotation(Class)>
	//   37   74:checkcast       #174 <Class Expose>
	//   38   77:astore_3        
				if(expose == null || (flag ? !expose.serialize() : !expose.deserialize()))
	//*  39   78:aload_3         
	//*  40   79:ifnull          107
	//*  41   82:iload_2         
	//*  42   83:ifeq            98
	//*  43   86:aload_3         
	//*  44   87:invokeinterface #177 <Method boolean Expose.serialize()>
	//*  45   92:ifne            109
	//*  46   95:goto            107
	//*  47   98:aload_3         
	//*  48   99:invokeinterface #180 <Method boolean Expose.deserialize()>
	//*  49  104:ifne            109
					return true;
	//   50  107:iconst_1        
	//   51  108:ireturn         
			}
			if(!serializeInnerClasses && isInnerClass(field.getType()))
	//*  52  109:aload_0         
	//*  53  110:getfield        #41  <Field boolean serializeInnerClasses>
	//*  54  113:ifne            129
	//*  55  116:aload_0         
	//*  56  117:aload_1         
	//*  57  118:invokevirtual   #183 <Method Class Field.getType()>
	//*  58  121:invokespecial   #139 <Method boolean isInnerClass(Class)>
	//*  59  124:ifeq            129
				return true;
	//   60  127:iconst_1        
	//   61  128:ireturn         
			if(isAnonymousOrLocal(field.getType()))
	//*  62  129:aload_0         
	//*  63  130:aload_1         
	//*  64  131:invokevirtual   #183 <Method Class Field.getType()>
	//*  65  134:invokespecial   #141 <Method boolean isAnonymousOrLocal(Class)>
	//*  66  137:ifeq            142
				return true;
	//   67  140:iconst_1        
	//   68  141:ireturn         
			Object obj;
			if(flag)
	//*  69  142:iload_2         
	//*  70  143:ifeq            154
				obj = ((Object) (serializationStrategies));
	//   71  146:aload_0         
	//   72  147:getfield        #49  <Field List serializationStrategies>
	//   73  150:astore_3        
			else
	//*  74  151:goto            159
				obj = ((Object) (deserializationStrategies));
	//   75  154:aload_0         
	//   76  155:getfield        #51  <Field List deserializationStrategies>
	//   77  158:astore_3        
			if(((List) (obj)).isEmpty())
				break label0;
	//   78  159:aload_3         
	//   79  160:invokeinterface #186 <Method boolean List.isEmpty()>
	//   80  165:ifne            216
			field = ((Field) (new FieldAttributes(field)));
	//   81  168:new             #188 <Class FieldAttributes>
	//   82  171:dup             
	//   83  172:aload_1         
	//   84  173:invokespecial   #191 <Method void FieldAttributes(Field)>
	//   85  176:astore_1        
			obj = ((Object) (((List) (obj)).iterator()));
	//   86  177:aload_3         
	//   87  178:invokeinterface #147 <Method Iterator List.iterator()>
	//   88  183:astore_3        
			do
				if(!((Iterator) (obj)).hasNext())
					break label0;
	//   89  184:aload_3         
	//   90  185:invokeinterface #152 <Method boolean Iterator.hasNext()>
	//   91  190:ifeq            216
			while(!((ExclusionStrategy)((Iterator) (obj)).next()).shouldSkipField(((FieldAttributes) (field))));
	//   92  193:aload_3         
	//   93  194:invokeinterface #155 <Method Object Iterator.next()>
	//   94  199:checkcast       #157 <Class ExclusionStrategy>
	//   95  202:aload_1         
	//   96  203:invokeinterface #195 <Method boolean ExclusionStrategy.shouldSkipField(FieldAttributes)>
	//   97  208:ifeq            213
			return true;
	//   98  211:iconst_1        
	//   99  212:ireturn         
		}
	//* 100  213:goto            184
		return false;
	//  101  216:iconst_0        
	//  102  217:ireturn         
	}

	public Excluder excludeFieldsWithoutExposeAnnotation()
	{
		Excluder excluder = clone();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #113 <Method Excluder clone()>
	//    2    4:astore_1        
		excluder.requireExpose = true;
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:putfield        #172 <Field boolean requireExpose>
		return excluder;
	//    6   10:aload_1         
	//    7   11:areturn         
	}

	public Excluder withExclusionStrategy(ExclusionStrategy exclusionstrategy, boolean flag, boolean flag1)
	{
		Excluder excluder = clone();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #113 <Method Excluder clone()>
	//    2    4:astore          4
		if(flag)
	//*   3    6:iload_2         
	//*   4    7:ifeq            38
		{
			excluder.serializationStrategies = ((List) (new ArrayList(((java.util.Collection) (serializationStrategies)))));
	//    5   10:aload           4
	//    6   12:new             #200 <Class ArrayList>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #49  <Field List serializationStrategies>
	//   10   20:invokespecial   #203 <Method void ArrayList(java.util.Collection)>
	//   11   23:putfield        #49  <Field List serializationStrategies>
			excluder.serializationStrategies.add(((Object) (exclusionstrategy)));
	//   12   26:aload           4
	//   13   28:getfield        #49  <Field List serializationStrategies>
	//   14   31:aload_1         
	//   15   32:invokeinterface #207 <Method boolean List.add(Object)>
	//   16   37:pop             
		}
		if(flag1)
	//*  17   38:iload_3         
	//*  18   39:ifeq            70
		{
			excluder.deserializationStrategies = ((List) (new ArrayList(((java.util.Collection) (deserializationStrategies)))));
	//   19   42:aload           4
	//   20   44:new             #200 <Class ArrayList>
	//   21   47:dup             
	//   22   48:aload_0         
	//   23   49:getfield        #51  <Field List deserializationStrategies>
	//   24   52:invokespecial   #203 <Method void ArrayList(java.util.Collection)>
	//   25   55:putfield        #51  <Field List deserializationStrategies>
			excluder.deserializationStrategies.add(((Object) (exclusionstrategy)));
	//   26   58:aload           4
	//   27   60:getfield        #51  <Field List deserializationStrategies>
	//   28   63:aload_1         
	//   29   64:invokeinterface #207 <Method boolean List.add(Object)>
	//   30   69:pop             
		}
		return excluder;
	//   31   70:aload           4
	//   32   72:areturn         
	}

	public transient Excluder withModifiers(int ai[])
	{
		Excluder excluder = clone();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #113 <Method Excluder clone()>
	//    2    4:astore          5
		excluder.modifiers = 0;
	//    3    6:aload           5
	//    4    8:iconst_0        
	//    5    9:putfield        #39  <Field int modifiers>
		int j = ai.length;
	//    6   12:aload_1         
	//    7   13:arraylength     
	//    8   14:istore_3        
		for(int i = 0; i < j; i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_2        
	//*  11   17:iload_2         
	//*  12   18:iload_3         
	//*  13   19:icmpge          47
		{
			int k = ai[i];
	//   14   22:aload_1         
	//   15   23:iload_2         
	//   16   24:iaload          
	//   17   25:istore          4
			excluder.modifiers = excluder.modifiers | k;
	//   18   27:aload           5
	//   19   29:aload           5
	//   20   31:getfield        #39  <Field int modifiers>
	//   21   34:iload           4
	//   22   36:ior             
	//   23   37:putfield        #39  <Field int modifiers>
		}

	//   24   40:iload_2         
	//   25   41:iconst_1        
	//   26   42:iadd            
	//   27   43:istore_2        
	//*  28   44:goto            17
		return excluder;
	//   29   47:aload           5
	//   30   49:areturn         
	}

	public Excluder withVersion(double d)
	{
		Excluder excluder = clone();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #113 <Method Excluder clone()>
	//    2    4:astore_3        
		excluder.version = d;
	//    3    5:aload_3         
	//    4    6:dload_1         
	//    5    7:putfield        #37  <Field double version>
		return excluder;
	//    6   10:aload_3         
	//    7   11:areturn         
	}

	public static final Excluder DEFAULT = new Excluder();
	private static final double IGNORE_VERSIONS = -1D;
	private List deserializationStrategies;
	private int modifiers;
	private boolean requireExpose;
	private List serializationStrategies;
	private boolean serializeInnerClasses;
	private double version;

	static 
	{
	//    0    0:new             #2   <Class Excluder>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void Excluder()>
	//    3    7:putstatic       #33  <Field Excluder DEFAULT>
	//*   4   10:return          
	}
}
