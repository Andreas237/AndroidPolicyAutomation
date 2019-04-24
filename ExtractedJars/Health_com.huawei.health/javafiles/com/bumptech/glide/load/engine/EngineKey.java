// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;
import java.util.Map;

class EngineKey
	implements Key
{

	public EngineKey(Object obj, Key key, int i, int j, Map map, Class class1, Class class2, 
			Options options1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		model = Preconditions.checkNotNull(obj);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #34  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:putfield        #36  <Field Object model>
		signature = (Key)Preconditions.checkNotNull(((Object) (key)), "Signature must not be null");
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:ldc1            #38  <String "Signature must not be null">
	//    9   16:invokestatic    #41  <Method Object Preconditions.checkNotNull(Object, String)>
	//   10   19:checkcast       #6   <Class Key>
	//   11   22:putfield        #43  <Field Key signature>
		width = i;
	//   12   25:aload_0         
	//   13   26:iload_3         
	//   14   27:putfield        #45  <Field int width>
		height = j;
	//   15   30:aload_0         
	//   16   31:iload           4
	//   17   33:putfield        #47  <Field int height>
		transformations = (Map)Preconditions.checkNotNull(((Object) (map)));
	//   18   36:aload_0         
	//   19   37:aload           5
	//   20   39:invokestatic    #34  <Method Object Preconditions.checkNotNull(Object)>
	//   21   42:checkcast       #49  <Class Map>
	//   22   45:putfield        #51  <Field Map transformations>
		resourceClass = (Class)Preconditions.checkNotNull(((Object) (class1)), "Resource class must not be null");
	//   23   48:aload_0         
	//   24   49:aload           6
	//   25   51:ldc1            #53  <String "Resource class must not be null">
	//   26   53:invokestatic    #41  <Method Object Preconditions.checkNotNull(Object, String)>
	//   27   56:checkcast       #55  <Class Class>
	//   28   59:putfield        #57  <Field Class resourceClass>
		transcodeClass = (Class)Preconditions.checkNotNull(((Object) (class2)), "Transcode class must not be null");
	//   29   62:aload_0         
	//   30   63:aload           7
	//   31   65:ldc1            #59  <String "Transcode class must not be null">
	//   32   67:invokestatic    #41  <Method Object Preconditions.checkNotNull(Object, String)>
	//   33   70:checkcast       #55  <Class Class>
	//   34   73:putfield        #61  <Field Class transcodeClass>
		options = (Options)Preconditions.checkNotNull(((Object) (options1)));
	//   35   76:aload_0         
	//   36   77:aload           8
	//   37   79:invokestatic    #34  <Method Object Preconditions.checkNotNull(Object)>
	//   38   82:checkcast       #63  <Class Options>
	//   39   85:putfield        #65  <Field Options options>
	//   40   88:return          
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof EngineKey)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class EngineKey>
	//*   2    4:ifeq            126
		{
			obj = ((Object) ((EngineKey)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class EngineKey>
	//    5   11:astore_1        
			return model.equals(((EngineKey) (obj)).model) && signature.equals(((Object) (((EngineKey) (obj)).signature))) && height == ((EngineKey) (obj)).height && width == ((EngineKey) (obj)).width && transformations.equals(((Object) (((EngineKey) (obj)).transformations))) && ((Object) (resourceClass)).equals(((Object) (((EngineKey) (obj)).resourceClass))) && ((Object) (transcodeClass)).equals(((Object) (((EngineKey) (obj)).transcodeClass))) && options.equals(((Object) (((EngineKey) (obj)).options)));
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field Object model>
	//    8   16:aload_1         
	//    9   17:getfield        #36  <Field Object model>
	//   10   20:invokevirtual   #72  <Method boolean Object.equals(Object)>
	//   11   23:ifeq            124
	//   12   26:aload_0         
	//   13   27:getfield        #43  <Field Key signature>
	//   14   30:aload_1         
	//   15   31:getfield        #43  <Field Key signature>
	//   16   34:invokeinterface #73  <Method boolean Key.equals(Object)>
	//   17   39:ifeq            124
	//   18   42:aload_0         
	//   19   43:getfield        #47  <Field int height>
	//   20   46:aload_1         
	//   21   47:getfield        #47  <Field int height>
	//   22   50:icmpne          124
	//   23   53:aload_0         
	//   24   54:getfield        #45  <Field int width>
	//   25   57:aload_1         
	//   26   58:getfield        #45  <Field int width>
	//   27   61:icmpne          124
	//   28   64:aload_0         
	//   29   65:getfield        #51  <Field Map transformations>
	//   30   68:aload_1         
	//   31   69:getfield        #51  <Field Map transformations>
	//   32   72:invokeinterface #74  <Method boolean Map.equals(Object)>
	//   33   77:ifeq            124
	//   34   80:aload_0         
	//   35   81:getfield        #57  <Field Class resourceClass>
	//   36   84:aload_1         
	//   37   85:getfield        #57  <Field Class resourceClass>
	//   38   88:invokevirtual   #72  <Method boolean Object.equals(Object)>
	//   39   91:ifeq            124
	//   40   94:aload_0         
	//   41   95:getfield        #61  <Field Class transcodeClass>
	//   42   98:aload_1         
	//   43   99:getfield        #61  <Field Class transcodeClass>
	//   44  102:invokevirtual   #72  <Method boolean Object.equals(Object)>
	//   45  105:ifeq            124
	//   46  108:aload_0         
	//   47  109:getfield        #65  <Field Options options>
	//   48  112:aload_1         
	//   49  113:getfield        #65  <Field Options options>
	//   50  116:invokevirtual   #75  <Method boolean Options.equals(Object)>
	//   51  119:ifeq            124
	//   52  122:iconst_1        
	//   53  123:ireturn         
	//   54  124:iconst_0        
	//   55  125:ireturn         
		} else
		{
			return false;
	//   56  126:iconst_0        
	//   57  127:ireturn         
		}
	}

	public int hashCode()
	{
		if(hashCode == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field int hashCode>
	//*   2    4:ifne            149
		{
			hashCode = model.hashCode();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field Object model>
	//    6   12:invokevirtual   #80  <Method int Object.hashCode()>
	//    7   15:putfield        #78  <Field int hashCode>
			hashCode = hashCode * 31 + signature.hashCode();
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #78  <Field int hashCode>
	//   11   23:bipush          31
	//   12   25:imul            
	//   13   26:aload_0         
	//   14   27:getfield        #43  <Field Key signature>
	//   15   30:invokeinterface #81  <Method int Key.hashCode()>
	//   16   35:iadd            
	//   17   36:putfield        #78  <Field int hashCode>
			hashCode = hashCode * 31 + width;
	//   18   39:aload_0         
	//   19   40:aload_0         
	//   20   41:getfield        #78  <Field int hashCode>
	//   21   44:bipush          31
	//   22   46:imul            
	//   23   47:aload_0         
	//   24   48:getfield        #45  <Field int width>
	//   25   51:iadd            
	//   26   52:putfield        #78  <Field int hashCode>
			hashCode = hashCode * 31 + height;
	//   27   55:aload_0         
	//   28   56:aload_0         
	//   29   57:getfield        #78  <Field int hashCode>
	//   30   60:bipush          31
	//   31   62:imul            
	//   32   63:aload_0         
	//   33   64:getfield        #47  <Field int height>
	//   34   67:iadd            
	//   35   68:putfield        #78  <Field int hashCode>
			hashCode = hashCode * 31 + transformations.hashCode();
	//   36   71:aload_0         
	//   37   72:aload_0         
	//   38   73:getfield        #78  <Field int hashCode>
	//   39   76:bipush          31
	//   40   78:imul            
	//   41   79:aload_0         
	//   42   80:getfield        #51  <Field Map transformations>
	//   43   83:invokeinterface #82  <Method int Map.hashCode()>
	//   44   88:iadd            
	//   45   89:putfield        #78  <Field int hashCode>
			hashCode = hashCode * 31 + ((Object) (resourceClass)).hashCode();
	//   46   92:aload_0         
	//   47   93:aload_0         
	//   48   94:getfield        #78  <Field int hashCode>
	//   49   97:bipush          31
	//   50   99:imul            
	//   51  100:aload_0         
	//   52  101:getfield        #57  <Field Class resourceClass>
	//   53  104:invokevirtual   #80  <Method int Object.hashCode()>
	//   54  107:iadd            
	//   55  108:putfield        #78  <Field int hashCode>
			hashCode = hashCode * 31 + ((Object) (transcodeClass)).hashCode();
	//   56  111:aload_0         
	//   57  112:aload_0         
	//   58  113:getfield        #78  <Field int hashCode>
	//   59  116:bipush          31
	//   60  118:imul            
	//   61  119:aload_0         
	//   62  120:getfield        #61  <Field Class transcodeClass>
	//   63  123:invokevirtual   #80  <Method int Object.hashCode()>
	//   64  126:iadd            
	//   65  127:putfield        #78  <Field int hashCode>
			hashCode = hashCode * 31 + options.hashCode();
	//   66  130:aload_0         
	//   67  131:aload_0         
	//   68  132:getfield        #78  <Field int hashCode>
	//   69  135:bipush          31
	//   70  137:imul            
	//   71  138:aload_0         
	//   72  139:getfield        #65  <Field Options options>
	//   73  142:invokevirtual   #83  <Method int Options.hashCode()>
	//   74  145:iadd            
	//   75  146:putfield        #78  <Field int hashCode>
		}
		return hashCode;
	//   76  149:aload_0         
	//   77  150:getfield        #78  <Field int hashCode>
	//   78  153:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("EngineKey{model=").append(model).append(", width=").append(width).append(", height=").append(height).append(", resourceClass=").append(((Object) (resourceClass))).append(", transcodeClass=").append(((Object) (transcodeClass))).append(", signature=").append(((Object) (signature))).append(", hashCode=").append(hashCode).append(", transformations=").append(((Object) (transformations))).append(", options=").append(((Object) (options))).append('}').toString();
	//    0    0:new             #87  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void StringBuilder()>
	//    3    7:ldc1            #90  <String "EngineKey{model=">
	//    4    9:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #36  <Field Object model>
	//    7   16:invokevirtual   #97  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #99  <String ", width=">
	//    9   21:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #45  <Field int width>
	//   12   28:invokevirtual   #102 <Method StringBuilder StringBuilder.append(int)>
	//   13   31:ldc1            #104 <String ", height=">
	//   14   33:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #47  <Field int height>
	//   17   40:invokevirtual   #102 <Method StringBuilder StringBuilder.append(int)>
	//   18   43:ldc1            #106 <String ", resourceClass=">
	//   19   45:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #57  <Field Class resourceClass>
	//   22   52:invokevirtual   #97  <Method StringBuilder StringBuilder.append(Object)>
	//   23   55:ldc1            #108 <String ", transcodeClass=">
	//   24   57:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   25   60:aload_0         
	//   26   61:getfield        #61  <Field Class transcodeClass>
	//   27   64:invokevirtual   #97  <Method StringBuilder StringBuilder.append(Object)>
	//   28   67:ldc1            #110 <String ", signature=">
	//   29   69:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   30   72:aload_0         
	//   31   73:getfield        #43  <Field Key signature>
	//   32   76:invokevirtual   #97  <Method StringBuilder StringBuilder.append(Object)>
	//   33   79:ldc1            #112 <String ", hashCode=">
	//   34   81:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   35   84:aload_0         
	//   36   85:getfield        #78  <Field int hashCode>
	//   37   88:invokevirtual   #102 <Method StringBuilder StringBuilder.append(int)>
	//   38   91:ldc1            #114 <String ", transformations=">
	//   39   93:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   40   96:aload_0         
	//   41   97:getfield        #51  <Field Map transformations>
	//   42  100:invokevirtual   #97  <Method StringBuilder StringBuilder.append(Object)>
	//   43  103:ldc1            #116 <String ", options=">
	//   44  105:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   45  108:aload_0         
	//   46  109:getfield        #65  <Field Options options>
	//   47  112:invokevirtual   #97  <Method StringBuilder StringBuilder.append(Object)>
	//   48  115:bipush          125
	//   49  117:invokevirtual   #119 <Method StringBuilder StringBuilder.append(char)>
	//   50  120:invokevirtual   #121 <Method String StringBuilder.toString()>
	//   51  123:areturn         
	}

	public void updateDiskCacheKey(MessageDigest messagedigest)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #125 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #126 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	private int hashCode;
	private final int height;
	private final Object model;
	private final Options options;
	private final Class resourceClass;
	private final Key signature;
	private final Class transcodeClass;
	private final Map transformations;
	private final int width;
}
