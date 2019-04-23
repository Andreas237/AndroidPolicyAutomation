// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.*;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class ResourceCacheKey
	implements Key
{

	ResourceCacheKey(ArrayPool arraypool, Key key, Key key1, int i, int j, Transformation transformation1, Class class1, 
			Options options1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		arrayPool = arraypool;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #43  <Field ArrayPool arrayPool>
		sourceKey = key;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #45  <Field Key sourceKey>
		signature = key1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #47  <Field Key signature>
		width = i;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #49  <Field int width>
		height = j;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #51  <Field int height>
		transformation = transformation1;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #53  <Field Transformation transformation>
		decodedResourceClass = class1;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #55  <Field Class decodedResourceClass>
		options = options1;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #57  <Field Options options>
	//   26   49:return          
	}

	private byte[] getResourceClassBytes()
	{
		byte abyte1[] = (byte[])RESOURCE_CLASS_BYTES.get(((Object) (decodedResourceClass)));
	//    0    0:getstatic       #37  <Field LruCache RESOURCE_CLASS_BYTES>
	//    1    3:aload_0         
	//    2    4:getfield        #55  <Field Class decodedResourceClass>
	//    3    7:invokevirtual   #65  <Method Object LruCache.get(Object)>
	//    4   10:checkcast       #67  <Class byte[]>
	//    5   13:astore_2        
		byte abyte0[] = abyte1;
	//    6   14:aload_2         
	//    7   15:astore_1        
		if(abyte1 == null)
	//*   8   16:aload_2         
	//*   9   17:ifnonnull       46
		{
			abyte0 = decodedResourceClass.getName().getBytes(CHARSET);
	//   10   20:aload_0         
	//   11   21:getfield        #55  <Field Class decodedResourceClass>
	//   12   24:invokevirtual   #73  <Method String Class.getName()>
	//   13   27:getstatic       #77  <Field java.nio.charset.Charset CHARSET>
	//   14   30:invokevirtual   #83  <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//   15   33:astore_1        
			RESOURCE_CLASS_BYTES.put(((Object) (decodedResourceClass)), ((Object) (abyte0)));
	//   16   34:getstatic       #37  <Field LruCache RESOURCE_CLASS_BYTES>
	//   17   37:aload_0         
	//   18   38:getfield        #55  <Field Class decodedResourceClass>
	//   19   41:aload_1         
	//   20   42:invokevirtual   #87  <Method Object LruCache.put(Object, Object)>
	//   21   45:pop             
		}
		return abyte0;
	//   22   46:aload_1         
	//   23   47:areturn         
	}

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof ResourceCacheKey;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class ResourceCacheKey>
	//    2    4:istore_2        
		boolean flag2 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(flag)
	//*   5    7:iload_2         
	//*   6    8:ifeq            130
		{
			obj = ((Object) ((ResourceCacheKey)obj));
	//    7   11:aload_1         
	//    8   12:checkcast       #2   <Class ResourceCacheKey>
	//    9   15:astore_1        
			boolean flag1 = flag2;
	//   10   16:iload_3         
	//   11   17:istore_2        
			if(height == ((ResourceCacheKey) (obj)).height)
	//*  12   18:aload_0         
	//*  13   19:getfield        #51  <Field int height>
	//*  14   22:aload_1         
	//*  15   23:getfield        #51  <Field int height>
	//*  16   26:icmpne          128
			{
				flag1 = flag2;
	//   17   29:iload_3         
	//   18   30:istore_2        
				if(width == ((ResourceCacheKey) (obj)).width)
	//*  19   31:aload_0         
	//*  20   32:getfield        #49  <Field int width>
	//*  21   35:aload_1         
	//*  22   36:getfield        #49  <Field int width>
	//*  23   39:icmpne          128
				{
					flag1 = flag2;
	//   24   42:iload_3         
	//   25   43:istore_2        
					if(Util.bothNullOrEqual(((Object) (transformation)), ((Object) (((ResourceCacheKey) (obj)).transformation))))
	//*  26   44:aload_0         
	//*  27   45:getfield        #53  <Field Transformation transformation>
	//*  28   48:aload_1         
	//*  29   49:getfield        #53  <Field Transformation transformation>
	//*  30   52:invokestatic    #95  <Method boolean Util.bothNullOrEqual(Object, Object)>
	//*  31   55:ifeq            128
					{
						flag1 = flag2;
	//   32   58:iload_3         
	//   33   59:istore_2        
						if(((Object) (decodedResourceClass)).equals(((Object) (((ResourceCacheKey) (obj)).decodedResourceClass))))
	//*  34   60:aload_0         
	//*  35   61:getfield        #55  <Field Class decodedResourceClass>
	//*  36   64:aload_1         
	//*  37   65:getfield        #55  <Field Class decodedResourceClass>
	//*  38   68:invokevirtual   #97  <Method boolean Object.equals(Object)>
	//*  39   71:ifeq            128
						{
							flag1 = flag2;
	//   40   74:iload_3         
	//   41   75:istore_2        
							if(sourceKey.equals(((Object) (((ResourceCacheKey) (obj)).sourceKey))))
	//*  42   76:aload_0         
	//*  43   77:getfield        #45  <Field Key sourceKey>
	//*  44   80:aload_1         
	//*  45   81:getfield        #45  <Field Key sourceKey>
	//*  46   84:invokeinterface #98  <Method boolean Key.equals(Object)>
	//*  47   89:ifeq            128
							{
								flag1 = flag2;
	//   48   92:iload_3         
	//   49   93:istore_2        
								if(signature.equals(((Object) (((ResourceCacheKey) (obj)).signature))))
	//*  50   94:aload_0         
	//*  51   95:getfield        #47  <Field Key signature>
	//*  52   98:aload_1         
	//*  53   99:getfield        #47  <Field Key signature>
	//*  54  102:invokeinterface #98  <Method boolean Key.equals(Object)>
	//*  55  107:ifeq            128
								{
									flag1 = flag2;
	//   56  110:iload_3         
	//   57  111:istore_2        
									if(options.equals(((Object) (((ResourceCacheKey) (obj)).options))))
	//*  58  112:aload_0         
	//*  59  113:getfield        #57  <Field Options options>
	//*  60  116:aload_1         
	//*  61  117:getfield        #57  <Field Options options>
	//*  62  120:invokevirtual   #101 <Method boolean Options.equals(Object)>
	//*  63  123:ifeq            128
										flag1 = true;
	//   64  126:iconst_1        
	//   65  127:istore_2        
								}
							}
						}
					}
				}
			}
			return flag1;
	//   66  128:iload_2         
	//   67  129:ireturn         
		} else
		{
			return false;
	//   68  130:iconst_0        
	//   69  131:ireturn         
		}
	}

	public int hashCode()
	{
		int j = ((sourceKey.hashCode() * 31 + signature.hashCode()) * 31 + width) * 31 + height;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Key sourceKey>
	//    2    4:invokeinterface #105 <Method int Key.hashCode()>
	//    3    9:bipush          31
	//    4   11:imul            
	//    5   12:aload_0         
	//    6   13:getfield        #47  <Field Key signature>
	//    7   16:invokeinterface #105 <Method int Key.hashCode()>
	//    8   21:iadd            
	//    9   22:bipush          31
	//   10   24:imul            
	//   11   25:aload_0         
	//   12   26:getfield        #49  <Field int width>
	//   13   29:iadd            
	//   14   30:bipush          31
	//   15   32:imul            
	//   16   33:aload_0         
	//   17   34:getfield        #51  <Field int height>
	//   18   37:iadd            
	//   19   38:istore_2        
		Transformation transformation1 = transformation;
	//   20   39:aload_0         
	//   21   40:getfield        #53  <Field Transformation transformation>
	//   22   43:astore_3        
		int i = j;
	//   23   44:iload_2         
	//   24   45:istore_1        
		if(transformation1 != null)
	//*  25   46:aload_3         
	//*  26   47:ifnull          60
			i = j * 31 + ((Object) (transformation1)).hashCode();
	//   27   50:iload_2         
	//   28   51:bipush          31
	//   29   53:imul            
	//   30   54:aload_3         
	//   31   55:invokevirtual   #106 <Method int Object.hashCode()>
	//   32   58:iadd            
	//   33   59:istore_1        
		return (i * 31 + ((Object) (decodedResourceClass)).hashCode()) * 31 + options.hashCode();
	//   34   60:iload_1         
	//   35   61:bipush          31
	//   36   63:imul            
	//   37   64:aload_0         
	//   38   65:getfield        #55  <Field Class decodedResourceClass>
	//   39   68:invokevirtual   #106 <Method int Object.hashCode()>
	//   40   71:iadd            
	//   41   72:bipush          31
	//   42   74:imul            
	//   43   75:aload_0         
	//   44   76:getfield        #57  <Field Options options>
	//   45   79:invokevirtual   #107 <Method int Options.hashCode()>
	//   46   82:iadd            
	//   47   83:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #110 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #111 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("ResourceCacheKey{sourceKey=");
	//    4    8:aload_1         
	//    5    9:ldc1            #113 <String "ResourceCacheKey{sourceKey=">
	//    6   11:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (sourceKey)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #45  <Field Key sourceKey>
	//   11   20:invokevirtual   #120 <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", signature=");
	//   13   24:aload_1         
	//   14   25:ldc1            #122 <String ", signature=">
	//   15   27:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(((Object) (signature)));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #47  <Field Key signature>
	//   20   36:invokevirtual   #120 <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		stringbuilder.append(", width=");
	//   22   40:aload_1         
	//   23   41:ldc1            #124 <String ", width=">
	//   24   43:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(width);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #49  <Field int width>
	//   29   52:invokevirtual   #127 <Method StringBuilder StringBuilder.append(int)>
	//   30   55:pop             
		stringbuilder.append(", height=");
	//   31   56:aload_1         
	//   32   57:ldc1            #129 <String ", height=">
	//   33   59:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(height);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #51  <Field int height>
	//   38   68:invokevirtual   #127 <Method StringBuilder StringBuilder.append(int)>
	//   39   71:pop             
		stringbuilder.append(", decodedResourceClass=");
	//   40   72:aload_1         
	//   41   73:ldc1            #131 <String ", decodedResourceClass=">
	//   42   75:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(((Object) (decodedResourceClass)));
	//   44   79:aload_1         
	//   45   80:aload_0         
	//   46   81:getfield        #55  <Field Class decodedResourceClass>
	//   47   84:invokevirtual   #120 <Method StringBuilder StringBuilder.append(Object)>
	//   48   87:pop             
		stringbuilder.append(", transformation='");
	//   49   88:aload_1         
	//   50   89:ldc1            #133 <String ", transformation='">
	//   51   91:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   52   94:pop             
		stringbuilder.append(((Object) (transformation)));
	//   53   95:aload_1         
	//   54   96:aload_0         
	//   55   97:getfield        #53  <Field Transformation transformation>
	//   56  100:invokevirtual   #120 <Method StringBuilder StringBuilder.append(Object)>
	//   57  103:pop             
		stringbuilder.append('\'');
	//   58  104:aload_1         
	//   59  105:bipush          39
	//   60  107:invokevirtual   #136 <Method StringBuilder StringBuilder.append(char)>
	//   61  110:pop             
		stringbuilder.append(", options=");
	//   62  111:aload_1         
	//   63  112:ldc1            #138 <String ", options=">
	//   64  114:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   65  117:pop             
		stringbuilder.append(((Object) (options)));
	//   66  118:aload_1         
	//   67  119:aload_0         
	//   68  120:getfield        #57  <Field Options options>
	//   69  123:invokevirtual   #120 <Method StringBuilder StringBuilder.append(Object)>
	//   70  126:pop             
		stringbuilder.append('}');
	//   71  127:aload_1         
	//   72  128:bipush          125
	//   73  130:invokevirtual   #136 <Method StringBuilder StringBuilder.append(char)>
	//   74  133:pop             
		return stringbuilder.toString();
	//   75  134:aload_1         
	//   76  135:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   77  138:areturn         
	}

	public void updateDiskCacheKey(MessageDigest messagedigest)
	{
		byte abyte0[] = (byte[])arrayPool.getExact(8, [B);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field ArrayPool arrayPool>
	//    2    4:bipush          8
	//    3    6:ldc1            #67  <Class byte[]>
	//    4    8:invokeinterface #149 <Method Object ArrayPool.getExact(int, Class)>
	//    5   13:checkcast       #67  <Class byte[]>
	//    6   16:astore_2        
		ByteBuffer.wrap(abyte0).putInt(width).putInt(height).array();
	//    7   17:aload_2         
	//    8   18:invokestatic    #155 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//    9   21:aload_0         
	//   10   22:getfield        #49  <Field int width>
	//   11   25:invokevirtual   #159 <Method ByteBuffer ByteBuffer.putInt(int)>
	//   12   28:aload_0         
	//   13   29:getfield        #51  <Field int height>
	//   14   32:invokevirtual   #159 <Method ByteBuffer ByteBuffer.putInt(int)>
	//   15   35:invokevirtual   #162 <Method byte[] ByteBuffer.array()>
	//   16   38:pop             
		signature.updateDiskCacheKey(messagedigest);
	//   17   39:aload_0         
	//   18   40:getfield        #47  <Field Key signature>
	//   19   43:aload_1         
	//   20   44:invokeinterface #164 <Method void Key.updateDiskCacheKey(MessageDigest)>
		sourceKey.updateDiskCacheKey(messagedigest);
	//   21   49:aload_0         
	//   22   50:getfield        #45  <Field Key sourceKey>
	//   23   53:aload_1         
	//   24   54:invokeinterface #164 <Method void Key.updateDiskCacheKey(MessageDigest)>
		messagedigest.update(abyte0);
	//   25   59:aload_1         
	//   26   60:aload_2         
	//   27   61:invokevirtual   #170 <Method void MessageDigest.update(byte[])>
		Transformation transformation1 = transformation;
	//   28   64:aload_0         
	//   29   65:getfield        #53  <Field Transformation transformation>
	//   30   68:astore_3        
		if(transformation1 != null)
	//*  31   69:aload_3         
	//*  32   70:ifnull          80
			transformation1.updateDiskCacheKey(messagedigest);
	//   33   73:aload_3         
	//   34   74:aload_1         
	//   35   75:invokeinterface #173 <Method void Transformation.updateDiskCacheKey(MessageDigest)>
		options.updateDiskCacheKey(messagedigest);
	//   36   80:aload_0         
	//   37   81:getfield        #57  <Field Options options>
	//   38   84:aload_1         
	//   39   85:invokevirtual   #174 <Method void Options.updateDiskCacheKey(MessageDigest)>
		messagedigest.update(getResourceClassBytes());
	//   40   88:aload_1         
	//   41   89:aload_0         
	//   42   90:invokespecial   #176 <Method byte[] getResourceClassBytes()>
	//   43   93:invokevirtual   #170 <Method void MessageDigest.update(byte[])>
		arrayPool.put(((Object) (abyte0)));
	//   44   96:aload_0         
	//   45   97:getfield        #43  <Field ArrayPool arrayPool>
	//   46  100:aload_2         
	//   47  101:invokeinterface #179 <Method void ArrayPool.put(Object)>
	//   48  106:return          
	}

	private static final LruCache RESOURCE_CLASS_BYTES = new LruCache(50L);
	private final ArrayPool arrayPool;
	private final Class decodedResourceClass;
	private final int height;
	private final Options options;
	private final Key signature;
	private final Key sourceKey;
	private final Transformation transformation;
	private final int width;

	static 
	{
	//    0    0:new             #29  <Class LruCache>
	//    1    3:dup             
	//    2    4:ldc2w           #30  <Long 50L>
	//    3    7:invokespecial   #35  <Method void LruCache(long)>
	//    4   10:putstatic       #37  <Field LruCache RESOURCE_CLASS_BYTES>
	//*   5   13:return          
	}
}
