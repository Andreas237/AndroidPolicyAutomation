// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import com.google.gson.reflect.TypeToken;

// Referenced classes of package com.google.gson:
//			TypeAdapterFactory, TreeTypeAdapter, JsonSerializer, JsonDeserializer, 
//			Gson, TypeAdapter

private static class TreeTypeAdapter$SingleTypeFactory
	implements TypeAdapterFactory
{

	public TypeAdapter create(Gson gson, TypeToken typetoken)
	{
		boolean flag;
		if(exactType != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field TypeToken exactType>
	//*   2    4:ifnull          52
		{
			if(!exactType.equals(((Object) (typetoken))) && (!matchRawType || exactType.getType() != typetoken.getRawType()))
	//*   3    7:aload_0         
	//*   4    8:getfield        #44  <Field TypeToken exactType>
	//*   5   11:aload_2         
	//*   6   12:invokevirtual   #62  <Method boolean TypeToken.equals(Object)>
	//*   7   15:ifne            47
	//*   8   18:aload_0         
	//*   9   19:getfield        #46  <Field boolean matchRawType>
	//*  10   22:ifeq            42
	//*  11   25:aload_0         
	//*  12   26:getfield        #44  <Field TypeToken exactType>
	//*  13   29:invokevirtual   #66  <Method java.lang.reflect.Type TypeToken.getType()>
	//*  14   32:aload_2         
	//*  15   33:invokevirtual   #70  <Method Class TypeToken.getRawType()>
	//*  16   36:if_acmpne       42
	//*  17   39:goto            47
				flag = false;
	//   18   42:iconst_0        
	//   19   43:istore_3        
			else
	//*  20   44:goto            64
				flag = true;
	//   21   47:iconst_1        
	//   22   48:istore_3        
		} else
	//*  23   49:goto            64
		{
			flag = hierarchyType.isAssignableFrom(typetoken.getRawType());
	//   24   52:aload_0         
	//   25   53:getfield        #48  <Field Class hierarchyType>
	//   26   56:aload_2         
	//   27   57:invokevirtual   #70  <Method Class TypeToken.getRawType()>
	//   28   60:invokevirtual   #76  <Method boolean Class.isAssignableFrom(Class)>
	//   29   63:istore_3        
		}
		if(flag)
	//*  30   64:iload_3         
	//*  31   65:ifeq            88
			return ((TypeAdapter) (new TreeTypeAdapter(serializer, deserializer, gson, typetoken, ((TypeAdapterFactory) (this)), ((TreeTypeAdapter._cls1) (null)))));
	//   32   68:new             #8   <Class TreeTypeAdapter>
	//   33   71:dup             
	//   34   72:aload_0         
	//   35   73:getfield        #32  <Field JsonSerializer serializer>
	//   36   76:aload_0         
	//   37   77:getfield        #36  <Field JsonDeserializer deserializer>
	//   38   80:aload_1         
	//   39   81:aload_2         
	//   40   82:aload_0         
	//   41   83:aconst_null     
	//   42   84:invokespecial   #79  <Method void TreeTypeAdapter(JsonSerializer, JsonDeserializer, Gson, TypeToken, TypeAdapterFactory, TreeTypeAdapter$1)>
	//   43   87:areturn         
		else
			return null;
	//   44   88:aconst_null     
	//   45   89:areturn         
	}

	private final JsonDeserializer deserializer;
	private final TypeToken exactType;
	private final Class hierarchyType;
	private final boolean matchRawType;
	private final JsonSerializer serializer;

	private TreeTypeAdapter$SingleTypeFactory(Object obj, TypeToken typetoken, boolean flag, Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		boolean flag1 = obj instanceof JsonSerializer;
	//    2    4:aload_1         
	//    3    5:instanceof      #30  <Class JsonSerializer>
	//    4    8:istore          5
		Object obj2 = null;
	//    5   10:aconst_null     
	//    6   11:astore          7
		Object obj1;
		if(flag1)
	//*   7   13:iload           5
	//*   8   15:ifeq            27
			obj1 = ((Object) ((JsonSerializer)obj));
	//    9   18:aload_1         
	//   10   19:checkcast       #30  <Class JsonSerializer>
	//   11   22:astore          6
		else
	//*  12   24:goto            30
			obj1 = null;
	//   13   27:aconst_null     
	//   14   28:astore          6
		serializer = ((JsonSerializer) (obj1));
	//   15   30:aload_0         
	//   16   31:aload           6
	//   17   33:putfield        #32  <Field JsonSerializer serializer>
		obj1 = ((Object) (obj2));
	//   18   36:aload           7
	//   19   38:astore          6
		if(obj instanceof JsonDeserializer)
	//*  20   40:aload_1         
	//*  21   41:instanceof      #34  <Class JsonDeserializer>
	//*  22   44:ifeq            53
			obj1 = ((Object) ((JsonDeserializer)obj));
	//   23   47:aload_1         
	//   24   48:checkcast       #34  <Class JsonDeserializer>
	//   25   51:astore          6
		deserializer = ((JsonDeserializer) (obj1));
	//   26   53:aload_0         
	//   27   54:aload           6
	//   28   56:putfield        #36  <Field JsonDeserializer deserializer>
		if(serializer == null && deserializer == null)
	//*  29   59:aload_0         
	//*  30   60:getfield        #32  <Field JsonSerializer serializer>
	//*  31   63:ifnonnull       82
	//*  32   66:aload_0         
	//*  33   67:getfield        #36  <Field JsonDeserializer deserializer>
	//*  34   70:ifnull          76
	//*  35   73:goto            82
			flag1 = false;
	//   36   76:iconst_0        
	//   37   77:istore          5
		else
	//*  38   79:goto            85
			flag1 = true;
	//   39   82:iconst_1        
	//   40   83:istore          5
		com.google.gson.internal..Gson.Preconditions.checkArgument(flag1);
	//   41   85:iload           5
	//   42   87:invokestatic    #42  <Method void com.google.gson.internal.$Gson$Preconditions.checkArgument(boolean)>
		exactType = typetoken;
	//   43   90:aload_0         
	//   44   91:aload_2         
	//   45   92:putfield        #44  <Field TypeToken exactType>
		matchRawType = flag;
	//   46   95:aload_0         
	//   47   96:iload_3         
	//   48   97:putfield        #46  <Field boolean matchRawType>
		hierarchyType = class1;
	//   49  100:aload_0         
	//   50  101:aload           4
	//   51  103:putfield        #48  <Field Class hierarchyType>
	//   52  106:return          
	}

	TreeTypeAdapter$SingleTypeFactory(Object obj, TypeToken typetoken, boolean flag, Class class1, TreeTypeAdapter._cls1 _pcls1)
	{
		this(obj, typetoken, flag, class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #54  <Method void TreeTypeAdapter$SingleTypeFactory(Object, TypeToken, boolean, Class)>
	//    6    9:return          
	}
}
