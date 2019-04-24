// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.*;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class ResourceCacheKey
	implements Key
{

	public ResourceCacheKey(Key key, Key key1, int i, int j, Transformation transformation1, Class class1, Options options1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		sourceKey = key;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field Key sourceKey>
		signature = key1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #41  <Field Key signature>
		width = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #43  <Field int width>
		height = j;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #45  <Field int height>
		transformation = transformation1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #47  <Field Transformation transformation>
		decodedResourceClass = class1;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #49  <Field Class decodedResourceClass>
		options = options1;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #51  <Field Options options>
	//   23   43:return          
	}

	private byte[] getResourceClassBytes()
	{
		byte abyte1[] = (byte[])RESOURCE_CLASS_BYTES.get(((Object) (decodedResourceClass)));
	//    0    0:getstatic       #33  <Field LruCache RESOURCE_CLASS_BYTES>
	//    1    3:aload_0         
	//    2    4:getfield        #49  <Field Class decodedResourceClass>
	//    3    7:invokevirtual   #59  <Method Object LruCache.get(Object)>
	//    4   10:checkcast       #61  <Class byte[]>
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
	//   11   21:getfield        #49  <Field Class decodedResourceClass>
	//   12   24:invokevirtual   #67  <Method String Class.getName()>
	//   13   27:getstatic       #71  <Field java.nio.charset.Charset CHARSET>
	//   14   30:invokevirtual   #77  <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//   15   33:astore_1        
			RESOURCE_CLASS_BYTES.put(((Object) (decodedResourceClass)), ((Object) (abyte0)));
	//   16   34:getstatic       #33  <Field LruCache RESOURCE_CLASS_BYTES>
	//   17   37:aload_0         
	//   18   38:getfield        #49  <Field Class decodedResourceClass>
	//   19   41:aload_1         
	//   20   42:invokevirtual   #81  <Method Object LruCache.put(Object, Object)>
	//   21   45:pop             
		}
		return abyte0;
	//   22   46:aload_1         
	//   23   47:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof ResourceCacheKey)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class ResourceCacheKey>
	//*   2    4:ifeq            112
		{
			obj = ((Object) ((ResourceCacheKey)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class ResourceCacheKey>
	//    5   11:astore_1        
			return height == ((ResourceCacheKey) (obj)).height && width == ((ResourceCacheKey) (obj)).width && Util.bothNullOrEqual(((Object) (transformation)), ((Object) (((ResourceCacheKey) (obj)).transformation))) && ((Object) (decodedResourceClass)).equals(((Object) (((ResourceCacheKey) (obj)).decodedResourceClass))) && sourceKey.equals(((Object) (((ResourceCacheKey) (obj)).sourceKey))) && signature.equals(((Object) (((ResourceCacheKey) (obj)).signature))) && options.equals(((Object) (((ResourceCacheKey) (obj)).options)));
	//    6   12:aload_0         
	//    7   13:getfield        #45  <Field int height>
	//    8   16:aload_1         
	//    9   17:getfield        #45  <Field int height>
	//   10   20:icmpne          110
	//   11   23:aload_0         
	//   12   24:getfield        #43  <Field int width>
	//   13   27:aload_1         
	//   14   28:getfield        #43  <Field int width>
	//   15   31:icmpne          110
	//   16   34:aload_0         
	//   17   35:getfield        #47  <Field Transformation transformation>
	//   18   38:aload_1         
	//   19   39:getfield        #47  <Field Transformation transformation>
	//   20   42:invokestatic    #89  <Method boolean Util.bothNullOrEqual(Object, Object)>
	//   21   45:ifeq            110
	//   22   48:aload_0         
	//   23   49:getfield        #49  <Field Class decodedResourceClass>
	//   24   52:aload_1         
	//   25   53:getfield        #49  <Field Class decodedResourceClass>
	//   26   56:invokevirtual   #91  <Method boolean Object.equals(Object)>
	//   27   59:ifeq            110
	//   28   62:aload_0         
	//   29   63:getfield        #39  <Field Key sourceKey>
	//   30   66:aload_1         
	//   31   67:getfield        #39  <Field Key sourceKey>
	//   32   70:invokeinterface #92  <Method boolean Key.equals(Object)>
	//   33   75:ifeq            110
	//   34   78:aload_0         
	//   35   79:getfield        #41  <Field Key signature>
	//   36   82:aload_1         
	//   37   83:getfield        #41  <Field Key signature>
	//   38   86:invokeinterface #92  <Method boolean Key.equals(Object)>
	//   39   91:ifeq            110
	//   40   94:aload_0         
	//   41   95:getfield        #51  <Field Options options>
	//   42   98:aload_1         
	//   43   99:getfield        #51  <Field Options options>
	//   44  102:invokevirtual   #95  <Method boolean Options.equals(Object)>
	//   45  105:ifeq            110
	//   46  108:iconst_1        
	//   47  109:ireturn         
	//   48  110:iconst_0        
	//   49  111:ireturn         
		} else
		{
			return false;
	//   50  112:iconst_0        
	//   51  113:ireturn         
		}
	}

	public int hashCode()
	{
		int j = ((sourceKey.hashCode() * 31 + signature.hashCode()) * 31 + width) * 31 + height;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Key sourceKey>
	//    2    4:invokeinterface #99  <Method int Key.hashCode()>
	//    3    9:bipush          31
	//    4   11:imul            
	//    5   12:aload_0         
	//    6   13:getfield        #41  <Field Key signature>
	//    7   16:invokeinterface #99  <Method int Key.hashCode()>
	//    8   21:iadd            
	//    9   22:bipush          31
	//   10   24:imul            
	//   11   25:aload_0         
	//   12   26:getfield        #43  <Field int width>
	//   13   29:iadd            
	//   14   30:bipush          31
	//   15   32:imul            
	//   16   33:aload_0         
	//   17   34:getfield        #45  <Field int height>
	//   18   37:iadd            
	//   19   38:istore_2        
		int i = j;
	//   20   39:iload_2         
	//   21   40:istore_1        
		if(transformation != null)
	//*  22   41:aload_0         
	//*  23   42:getfield        #47  <Field Transformation transformation>
	//*  24   45:ifnull          63
			i = j * 31 + transformation.hashCode();
	//   25   48:iload_2         
	//   26   49:bipush          31
	//   27   51:imul            
	//   28   52:aload_0         
	//   29   53:getfield        #47  <Field Transformation transformation>
	//   30   56:invokeinterface #102 <Method int Transformation.hashCode()>
	//   31   61:iadd            
	//   32   62:istore_1        
		return (i * 31 + ((Object) (decodedResourceClass)).hashCode()) * 31 + options.hashCode();
	//   33   63:iload_1         
	//   34   64:bipush          31
	//   35   66:imul            
	//   36   67:aload_0         
	//   37   68:getfield        #49  <Field Class decodedResourceClass>
	//   38   71:invokevirtual   #103 <Method int Object.hashCode()>
	//   39   74:iadd            
	//   40   75:bipush          31
	//   41   77:imul            
	//   42   78:aload_0         
	//   43   79:getfield        #51  <Field Options options>
	//   44   82:invokevirtual   #104 <Method int Options.hashCode()>
	//   45   85:iadd            
	//   46   86:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("ResourceCacheKey{sourceKey=").append(((Object) (sourceKey))).append(", signature=").append(((Object) (signature))).append(", width=").append(width).append(", height=").append(height).append(", decodedResourceClass=").append(((Object) (decodedResourceClass))).append(", transformation='").append(((Object) (transformation))).append('\'').append(", options=").append(((Object) (options))).append('}').toString();
	//    0    0:new             #107 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #108 <Method void StringBuilder()>
	//    3    7:ldc1            #110 <String "ResourceCacheKey{sourceKey=">
	//    4    9:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #39  <Field Key sourceKey>
	//    7   16:invokevirtual   #117 <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #119 <String ", signature=">
	//    9   21:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #41  <Field Key signature>
	//   12   28:invokevirtual   #117 <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:ldc1            #121 <String ", width=">
	//   14   33:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #43  <Field int width>
	//   17   40:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
	//   18   43:ldc1            #126 <String ", height=">
	//   19   45:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #45  <Field int height>
	//   22   52:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
	//   23   55:ldc1            #128 <String ", decodedResourceClass=">
	//   24   57:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//   25   60:aload_0         
	//   26   61:getfield        #49  <Field Class decodedResourceClass>
	//   27   64:invokevirtual   #117 <Method StringBuilder StringBuilder.append(Object)>
	//   28   67:ldc1            #130 <String ", transformation='">
	//   29   69:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//   30   72:aload_0         
	//   31   73:getfield        #47  <Field Transformation transformation>
	//   32   76:invokevirtual   #117 <Method StringBuilder StringBuilder.append(Object)>
	//   33   79:bipush          39
	//   34   81:invokevirtual   #133 <Method StringBuilder StringBuilder.append(char)>
	//   35   84:ldc1            #135 <String ", options=">
	//   36   86:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//   37   89:aload_0         
	//   38   90:getfield        #51  <Field Options options>
	//   39   93:invokevirtual   #117 <Method StringBuilder StringBuilder.append(Object)>
	//   40   96:bipush          125
	//   41   98:invokevirtual   #133 <Method StringBuilder StringBuilder.append(char)>
	//   42  101:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   43  104:areturn         
	}

	public void updateDiskCacheKey(MessageDigest messagedigest)
	{
		byte abyte0[] = ByteBuffer.allocate(8).putInt(width).putInt(height).array();
	//    0    0:bipush          8
	//    1    2:invokestatic    #145 <Method ByteBuffer ByteBuffer.allocate(int)>
	//    2    5:aload_0         
	//    3    6:getfield        #43  <Field int width>
	//    4    9:invokevirtual   #148 <Method ByteBuffer ByteBuffer.putInt(int)>
	//    5   12:aload_0         
	//    6   13:getfield        #45  <Field int height>
	//    7   16:invokevirtual   #148 <Method ByteBuffer ByteBuffer.putInt(int)>
	//    8   19:invokevirtual   #151 <Method byte[] ByteBuffer.array()>
	//    9   22:astore_2        
		signature.updateDiskCacheKey(messagedigest);
	//   10   23:aload_0         
	//   11   24:getfield        #41  <Field Key signature>
	//   12   27:aload_1         
	//   13   28:invokeinterface #153 <Method void Key.updateDiskCacheKey(MessageDigest)>
		sourceKey.updateDiskCacheKey(messagedigest);
	//   14   33:aload_0         
	//   15   34:getfield        #39  <Field Key sourceKey>
	//   16   37:aload_1         
	//   17   38:invokeinterface #153 <Method void Key.updateDiskCacheKey(MessageDigest)>
		messagedigest.update(abyte0);
	//   18   43:aload_1         
	//   19   44:aload_2         
	//   20   45:invokevirtual   #159 <Method void MessageDigest.update(byte[])>
		if(transformation != null)
	//*  21   48:aload_0         
	//*  22   49:getfield        #47  <Field Transformation transformation>
	//*  23   52:ifnull          65
			transformation.updateDiskCacheKey(messagedigest);
	//   24   55:aload_0         
	//   25   56:getfield        #47  <Field Transformation transformation>
	//   26   59:aload_1         
	//   27   60:invokeinterface #160 <Method void Transformation.updateDiskCacheKey(MessageDigest)>
		options.updateDiskCacheKey(messagedigest);
	//   28   65:aload_0         
	//   29   66:getfield        #51  <Field Options options>
	//   30   69:aload_1         
	//   31   70:invokevirtual   #161 <Method void Options.updateDiskCacheKey(MessageDigest)>
		messagedigest.update(getResourceClassBytes());
	//   32   73:aload_1         
	//   33   74:aload_0         
	//   34   75:invokespecial   #163 <Method byte[] getResourceClassBytes()>
	//   35   78:invokevirtual   #159 <Method void MessageDigest.update(byte[])>
	//   36   81:return          
	}

	private static final LruCache RESOURCE_CLASS_BYTES = new LruCache(50);
	private final Class decodedResourceClass;
	private final int height;
	private final Options options;
	private final Key signature;
	private final Key sourceKey;
	private final Transformation transformation;
	private final int width;

	static 
	{
	//    0    0:new             #27  <Class LruCache>
	//    1    3:dup             
	//    2    4:bipush          50
	//    3    6:invokespecial   #31  <Method void LruCache(int)>
	//    4    9:putstatic       #33  <Field LruCache RESOURCE_CLASS_BYTES>
	//*   5   12:return          
	}
}
