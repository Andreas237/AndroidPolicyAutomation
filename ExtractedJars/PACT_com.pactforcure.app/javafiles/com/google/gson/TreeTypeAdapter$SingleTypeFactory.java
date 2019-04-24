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
	//*   2    4:ifnull          70
		{
			if(exactType.equals(((Object) (typetoken))) || matchRawType && exactType.getType() == typetoken.getRawType())
	//*   3    7:aload_0         
	//*   4    8:getfield        #44  <Field TypeToken exactType>
	//*   5   11:aload_2         
	//*   6   12:invokevirtual   #62  <Method boolean TypeToken.equals(Object)>
	//*   7   15:ifne            39
	//*   8   18:aload_0         
	//*   9   19:getfield        #46  <Field boolean matchRawType>
	//*  10   22:ifeq            65
	//*  11   25:aload_0         
	//*  12   26:getfield        #44  <Field TypeToken exactType>
	//*  13   29:invokevirtual   #66  <Method java.lang.reflect.Type TypeToken.getType()>
	//*  14   32:aload_2         
	//*  15   33:invokevirtual   #70  <Method Class TypeToken.getRawType()>
	//*  16   36:if_acmpne       65
				flag = true;
	//   17   39:iconst_1        
	//   18   40:istore_3        
			else
	//*  19   41:iload_3         
	//*  20   42:ifeq            85
	//*  21   45:new             #8   <Class TreeTypeAdapter>
	//*  22   48:dup             
	//*  23   49:aload_0         
	//*  24   50:getfield        #32  <Field JsonSerializer serializer>
	//*  25   53:aload_0         
	//*  26   54:getfield        #36  <Field JsonDeserializer deserializer>
	//*  27   57:aload_1         
	//*  28   58:aload_2         
	//*  29   59:aload_0         
	//*  30   60:aconst_null     
	//*  31   61:invokespecial   #73  <Method void TreeTypeAdapter(JsonSerializer, JsonDeserializer, Gson, TypeToken, TypeAdapterFactory, TreeTypeAdapter$1)>
	//*  32   64:areturn         
				flag = false;
	//   33   65:iconst_0        
	//   34   66:istore_3        
		} else
	//*  35   67:goto            41
		{
			flag = hierarchyType.isAssignableFrom(typetoken.getRawType());
	//   36   70:aload_0         
	//   37   71:getfield        #48  <Field Class hierarchyType>
	//   38   74:aload_2         
	//   39   75:invokevirtual   #70  <Method Class TypeToken.getRawType()>
	//   40   78:invokevirtual   #79  <Method boolean Class.isAssignableFrom(Class)>
	//   41   81:istore_3        
		}
		if(flag)
			return ((TypeAdapter) (new TreeTypeAdapter(serializer, deserializer, gson, typetoken, ((TypeAdapterFactory) (this)), ((TreeTypeAdapter._cls1) (null)))));
		else
	//*  42   82:goto            41
			return null;
	//   43   85:aconst_null     
	//   44   86:areturn         
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
		boolean flag1;
		JsonSerializer jsonserializer;
		if(obj instanceof JsonSerializer)
	//*   2    4:aload_1         
	//*   3    5:instanceof      #30  <Class JsonSerializer>
	//*   4    8:ifeq            79
			jsonserializer = (JsonSerializer)obj;
	//    5   11:aload_1         
	//    6   12:checkcast       #30  <Class JsonSerializer>
	//    7   15:astore          6
		else
	//*   8   17:aload_0         
	//*   9   18:aload           6
	//*  10   20:putfield        #32  <Field JsonSerializer serializer>
	//*  11   23:aload_1         
	//*  12   24:instanceof      #34  <Class JsonDeserializer>
	//*  13   27:ifeq            85
	//*  14   30:aload_1         
	//*  15   31:checkcast       #34  <Class JsonDeserializer>
	//*  16   34:astore_1        
	//*  17   35:aload_0         
	//*  18   36:aload_1         
	//*  19   37:putfield        #36  <Field JsonDeserializer deserializer>
	//*  20   40:aload_0         
	//*  21   41:getfield        #32  <Field JsonSerializer serializer>
	//*  22   44:ifnonnull       54
	//*  23   47:aload_0         
	//*  24   48:getfield        #36  <Field JsonDeserializer deserializer>
	//*  25   51:ifnull          90
	//*  26   54:iconst_1        
	//*  27   55:istore          5
	//*  28   57:iload           5
	//*  29   59:invokestatic    #42  <Method void com.google.gson.internal.$Gson$Preconditions.checkArgument(boolean)>
	//*  30   62:aload_0         
	//*  31   63:aload_2         
	//*  32   64:putfield        #44  <Field TypeToken exactType>
	//*  33   67:aload_0         
	//*  34   68:iload_3         
	//*  35   69:putfield        #46  <Field boolean matchRawType>
	//*  36   72:aload_0         
	//*  37   73:aload           4
	//*  38   75:putfield        #48  <Field Class hierarchyType>
	//*  39   78:return          
			jsonserializer = null;
	//   40   79:aconst_null     
	//   41   80:astore          6
		serializer = jsonserializer;
		if(obj instanceof JsonDeserializer)
			obj = ((Object) ((JsonDeserializer)obj));
		else
	//*  42   82:goto            17
			obj = null;
	//   43   85:aconst_null     
	//   44   86:astore_1        
		deserializer = ((JsonDeserializer) (obj));
		if(serializer != null || deserializer != null)
			flag1 = true;
		else
	//*  45   87:goto            35
			flag1 = false;
	//   46   90:iconst_0        
	//   47   91:istore          5
		com.google.gson.internal..Gson.Preconditions.checkArgument(flag1);
		exactType = typetoken;
		matchRawType = flag;
		hierarchyType = class1;
	//*  48   93:goto            57
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
