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

	EngineKey(Object obj, Key key, int i, int j, Map map, Class class1, Class class2, 
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
		boolean flag = obj instanceof EngineKey;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class EngineKey>
	//    2    4:istore_2        
		boolean flag2 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(flag)
	//*   5    7:iload_2         
	//*   6    8:ifeq            146
		{
			obj = ((Object) ((EngineKey)obj));
	//    7   11:aload_1         
	//    8   12:checkcast       #2   <Class EngineKey>
	//    9   15:astore_1        
			boolean flag1 = flag2;
	//   10   16:iload_3         
	//   11   17:istore_2        
			if(model.equals(((EngineKey) (obj)).model))
	//*  12   18:aload_0         
	//*  13   19:getfield        #36  <Field Object model>
	//*  14   22:aload_1         
	//*  15   23:getfield        #36  <Field Object model>
	//*  16   26:invokevirtual   #72  <Method boolean Object.equals(Object)>
	//*  17   29:ifeq            144
			{
				flag1 = flag2;
	//   18   32:iload_3         
	//   19   33:istore_2        
				if(signature.equals(((Object) (((EngineKey) (obj)).signature))))
	//*  20   34:aload_0         
	//*  21   35:getfield        #43  <Field Key signature>
	//*  22   38:aload_1         
	//*  23   39:getfield        #43  <Field Key signature>
	//*  24   42:invokeinterface #73  <Method boolean Key.equals(Object)>
	//*  25   47:ifeq            144
				{
					flag1 = flag2;
	//   26   50:iload_3         
	//   27   51:istore_2        
					if(height == ((EngineKey) (obj)).height)
	//*  28   52:aload_0         
	//*  29   53:getfield        #47  <Field int height>
	//*  30   56:aload_1         
	//*  31   57:getfield        #47  <Field int height>
	//*  32   60:icmpne          144
					{
						flag1 = flag2;
	//   33   63:iload_3         
	//   34   64:istore_2        
						if(width == ((EngineKey) (obj)).width)
	//*  35   65:aload_0         
	//*  36   66:getfield        #45  <Field int width>
	//*  37   69:aload_1         
	//*  38   70:getfield        #45  <Field int width>
	//*  39   73:icmpne          144
						{
							flag1 = flag2;
	//   40   76:iload_3         
	//   41   77:istore_2        
							if(transformations.equals(((Object) (((EngineKey) (obj)).transformations))))
	//*  42   78:aload_0         
	//*  43   79:getfield        #51  <Field Map transformations>
	//*  44   82:aload_1         
	//*  45   83:getfield        #51  <Field Map transformations>
	//*  46   86:invokeinterface #74  <Method boolean Map.equals(Object)>
	//*  47   91:ifeq            144
							{
								flag1 = flag2;
	//   48   94:iload_3         
	//   49   95:istore_2        
								if(((Object) (resourceClass)).equals(((Object) (((EngineKey) (obj)).resourceClass))))
	//*  50   96:aload_0         
	//*  51   97:getfield        #57  <Field Class resourceClass>
	//*  52  100:aload_1         
	//*  53  101:getfield        #57  <Field Class resourceClass>
	//*  54  104:invokevirtual   #72  <Method boolean Object.equals(Object)>
	//*  55  107:ifeq            144
								{
									flag1 = flag2;
	//   56  110:iload_3         
	//   57  111:istore_2        
									if(((Object) (transcodeClass)).equals(((Object) (((EngineKey) (obj)).transcodeClass))))
	//*  58  112:aload_0         
	//*  59  113:getfield        #61  <Field Class transcodeClass>
	//*  60  116:aload_1         
	//*  61  117:getfield        #61  <Field Class transcodeClass>
	//*  62  120:invokevirtual   #72  <Method boolean Object.equals(Object)>
	//*  63  123:ifeq            144
									{
										flag1 = flag2;
	//   64  126:iload_3         
	//   65  127:istore_2        
										if(options.equals(((Object) (((EngineKey) (obj)).options))))
	//*  66  128:aload_0         
	//*  67  129:getfield        #65  <Field Options options>
	//*  68  132:aload_1         
	//*  69  133:getfield        #65  <Field Options options>
	//*  70  136:invokevirtual   #75  <Method boolean Options.equals(Object)>
	//*  71  139:ifeq            144
											flag1 = true;
	//   72  142:iconst_1        
	//   73  143:istore_2        
									}
								}
							}
						}
					}
				}
			}
			return flag1;
	//   74  144:iload_2         
	//   75  145:ireturn         
		} else
		{
			return false;
	//   76  146:iconst_0        
	//   77  147:ireturn         
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
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #87  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("EngineKey{model=");
	//    4    8:aload_1         
	//    5    9:ldc1            #90  <String "EngineKey{model=">
	//    6   11:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(model);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #36  <Field Object model>
	//   11   20:invokevirtual   #97  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", width=");
	//   13   24:aload_1         
	//   14   25:ldc1            #99  <String ", width=">
	//   15   27:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(width);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #45  <Field int width>
	//   20   36:invokevirtual   #102 <Method StringBuilder StringBuilder.append(int)>
	//   21   39:pop             
		stringbuilder.append(", height=");
	//   22   40:aload_1         
	//   23   41:ldc1            #104 <String ", height=">
	//   24   43:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(height);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #47  <Field int height>
	//   29   52:invokevirtual   #102 <Method StringBuilder StringBuilder.append(int)>
	//   30   55:pop             
		stringbuilder.append(", resourceClass=");
	//   31   56:aload_1         
	//   32   57:ldc1            #106 <String ", resourceClass=">
	//   33   59:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(((Object) (resourceClass)));
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #57  <Field Class resourceClass>
	//   38   68:invokevirtual   #97  <Method StringBuilder StringBuilder.append(Object)>
	//   39   71:pop             
		stringbuilder.append(", transcodeClass=");
	//   40   72:aload_1         
	//   41   73:ldc1            #108 <String ", transcodeClass=">
	//   42   75:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(((Object) (transcodeClass)));
	//   44   79:aload_1         
	//   45   80:aload_0         
	//   46   81:getfield        #61  <Field Class transcodeClass>
	//   47   84:invokevirtual   #97  <Method StringBuilder StringBuilder.append(Object)>
	//   48   87:pop             
		stringbuilder.append(", signature=");
	//   49   88:aload_1         
	//   50   89:ldc1            #110 <String ", signature=">
	//   51   91:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   52   94:pop             
		stringbuilder.append(((Object) (signature)));
	//   53   95:aload_1         
	//   54   96:aload_0         
	//   55   97:getfield        #43  <Field Key signature>
	//   56  100:invokevirtual   #97  <Method StringBuilder StringBuilder.append(Object)>
	//   57  103:pop             
		stringbuilder.append(", hashCode=");
	//   58  104:aload_1         
	//   59  105:ldc1            #112 <String ", hashCode=">
	//   60  107:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   61  110:pop             
		stringbuilder.append(hashCode);
	//   62  111:aload_1         
	//   63  112:aload_0         
	//   64  113:getfield        #78  <Field int hashCode>
	//   65  116:invokevirtual   #102 <Method StringBuilder StringBuilder.append(int)>
	//   66  119:pop             
		stringbuilder.append(", transformations=");
	//   67  120:aload_1         
	//   68  121:ldc1            #114 <String ", transformations=">
	//   69  123:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   70  126:pop             
		stringbuilder.append(((Object) (transformations)));
	//   71  127:aload_1         
	//   72  128:aload_0         
	//   73  129:getfield        #51  <Field Map transformations>
	//   74  132:invokevirtual   #97  <Method StringBuilder StringBuilder.append(Object)>
	//   75  135:pop             
		stringbuilder.append(", options=");
	//   76  136:aload_1         
	//   77  137:ldc1            #116 <String ", options=">
	//   78  139:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   79  142:pop             
		stringbuilder.append(((Object) (options)));
	//   80  143:aload_1         
	//   81  144:aload_0         
	//   82  145:getfield        #65  <Field Options options>
	//   83  148:invokevirtual   #97  <Method StringBuilder StringBuilder.append(Object)>
	//   84  151:pop             
		stringbuilder.append('}');
	//   85  152:aload_1         
	//   86  153:bipush          125
	//   87  155:invokevirtual   #119 <Method StringBuilder StringBuilder.append(char)>
	//   88  158:pop             
		return stringbuilder.toString();
	//   89  159:aload_1         
	//   90  160:invokevirtual   #121 <Method String StringBuilder.toString()>
	//   91  163:areturn         
	}

	public void updateDiskCacheKey(MessageDigest messagedigest)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #126 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #127 <Method void UnsupportedOperationException()>
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
