// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

// Referenced classes of package com.google.gson.internal.bind:
//			TreeTypeAdapter

static final class TreeTypeAdapter$SingleTypeFactory
	implements TypeAdapterFactory
{

	public TypeAdapter create(Gson gson, TypeToken typetoken)
	{
		boolean flag;
		if(exactType != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field TypeToken exactType>
	//*   2    4:ifnull          49
		{
			if(exactType.equals(((Object) (typetoken))) || matchRawType && exactType.getType() == typetoken.getRawType())
	//*   3    7:aload_0         
	//*   4    8:getfield        #44  <Field TypeToken exactType>
	//*   5   11:aload_2         
	//*   6   12:invokevirtual   #59  <Method boolean TypeToken.equals(Object)>
	//*   7   15:ifne            39
	//*   8   18:aload_0         
	//*   9   19:getfield        #46  <Field boolean matchRawType>
	//*  10   22:ifeq            44
	//*  11   25:aload_0         
	//*  12   26:getfield        #44  <Field TypeToken exactType>
	//*  13   29:invokevirtual   #63  <Method java.lang.reflect.Type TypeToken.getType()>
	//*  14   32:aload_2         
	//*  15   33:invokevirtual   #67  <Method Class TypeToken.getRawType()>
	//*  16   36:if_acmpne       44
				flag = true;
	//   17   39:iconst_1        
	//   18   40:istore_3        
			else
	//*  19   41:goto            61
				flag = false;
	//   20   44:iconst_0        
	//   21   45:istore_3        
		} else
	//*  22   46:goto            61
		{
			flag = hierarchyType.isAssignableFrom(typetoken.getRawType());
	//   23   49:aload_0         
	//   24   50:getfield        #48  <Field Class hierarchyType>
	//   25   53:aload_2         
	//   26   54:invokevirtual   #67  <Method Class TypeToken.getRawType()>
	//   27   57:invokevirtual   #73  <Method boolean Class.isAssignableFrom(Class)>
	//   28   60:istore_3        
		}
		if(flag)
	//*  29   61:iload_3         
	//*  30   62:ifeq            84
			return ((TypeAdapter) (new TreeTypeAdapter(serializer, deserializer, gson, typetoken, ((TypeAdapterFactory) (this)))));
	//   31   65:new             #8   <Class TreeTypeAdapter>
	//   32   68:dup             
	//   33   69:aload_0         
	//   34   70:getfield        #32  <Field JsonSerializer serializer>
	//   35   73:aload_0         
	//   36   74:getfield        #36  <Field JsonDeserializer deserializer>
	//   37   77:aload_1         
	//   38   78:aload_2         
	//   39   79:aload_0         
	//   40   80:invokespecial   #76  <Method void TreeTypeAdapter(JsonSerializer, JsonDeserializer, Gson, TypeToken, TypeAdapterFactory)>
	//   41   83:areturn         
		else
			return null;
	//   42   84:aconst_null     
	//   43   85:areturn         
	}

	private final JsonDeserializer deserializer;
	private final TypeToken exactType;
	private final Class hierarchyType;
	private final boolean matchRawType;
	private final JsonSerializer serializer;

	TreeTypeAdapter$SingleTypeFactory(Object obj, TypeToken typetoken, boolean flag, Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		JsonSerializer jsonserializer;
		if(obj instanceof JsonSerializer)
	//*   2    4:aload_1         
	//*   3    5:instanceof      #30  <Class JsonSerializer>
	//*   4    8:ifeq            20
			jsonserializer = (JsonSerializer)obj;
	//    5   11:aload_1         
	//    6   12:checkcast       #30  <Class JsonSerializer>
	//    7   15:astore          6
		else
	//*   8   17:goto            23
			jsonserializer = null;
	//    9   20:aconst_null     
	//   10   21:astore          6
		serializer = jsonserializer;
	//   11   23:aload_0         
	//   12   24:aload           6
	//   13   26:putfield        #32  <Field JsonSerializer serializer>
		if(obj instanceof JsonDeserializer)
	//*  14   29:aload_1         
	//*  15   30:instanceof      #34  <Class JsonDeserializer>
	//*  16   33:ifeq            44
			obj = ((Object) ((JsonDeserializer)obj));
	//   17   36:aload_1         
	//   18   37:checkcast       #34  <Class JsonDeserializer>
	//   19   40:astore_1        
		else
	//*  20   41:goto            46
			obj = null;
	//   21   44:aconst_null     
	//   22   45:astore_1        
		deserializer = ((JsonDeserializer) (obj));
	//   23   46:aload_0         
	//   24   47:aload_1         
	//   25   48:putfield        #36  <Field JsonDeserializer deserializer>
		boolean flag1;
		if(serializer != null || deserializer != null)
	//*  26   51:aload_0         
	//*  27   52:getfield        #32  <Field JsonSerializer serializer>
	//*  28   55:ifnonnull       65
	//*  29   58:aload_0         
	//*  30   59:getfield        #36  <Field JsonDeserializer deserializer>
	//*  31   62:ifnull          71
			flag1 = true;
	//   32   65:iconst_1        
	//   33   66:istore          5
		else
	//*  34   68:goto            74
			flag1 = false;
	//   35   71:iconst_0        
	//   36   72:istore          5
		com.google.gson.internal..Gson.Preconditions.checkArgument(flag1);
	//   37   74:iload           5
	//   38   76:invokestatic    #42  <Method void com.google.gson.internal.$Gson$Preconditions.checkArgument(boolean)>
		exactType = typetoken;
	//   39   79:aload_0         
	//   40   80:aload_2         
	//   41   81:putfield        #44  <Field TypeToken exactType>
		matchRawType = flag;
	//   42   84:aload_0         
	//   43   85:iload_3         
	//   44   86:putfield        #46  <Field boolean matchRawType>
		hierarchyType = class1;
	//   45   89:aload_0         
	//   46   90:aload           4
	//   47   92:putfield        #48  <Field Class hierarchyType>
	//   48   95:return          
	}
}
