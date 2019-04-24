// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load;

import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

// Referenced classes of package com.bumptech.glide.load:
//			Key

public final class Option
{
	public static interface CacheKeyUpdater
	{

		public abstract void update(byte abyte0[], Object obj, MessageDigest messagedigest);
	}


	Option(String s, Object obj, CacheKeyUpdater cachekeyupdater)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		key = Preconditions.checkNotEmpty(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #38  <Method String Preconditions.checkNotEmpty(String)>
	//    5    9:putfield        #40  <Field String key>
		defaultValue = obj;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #42  <Field Object defaultValue>
		cacheKeyUpdater = (CacheKeyUpdater)Preconditions.checkNotNull(((Object) (cachekeyupdater)));
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:invokestatic    #46  <Method Object Preconditions.checkNotNull(Object)>
	//   12   22:checkcast       #9   <Class Option$CacheKeyUpdater>
	//   13   25:putfield        #48  <Field Option$CacheKeyUpdater cacheKeyUpdater>
	//   14   28:return          
	}

	public static Option disk(String s, CacheKeyUpdater cachekeyupdater)
	{
		return new Option(s, ((Object) (null)), cachekeyupdater);
	//    0    0:new             #2   <Class Option>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aload_1         
	//    5    7:invokespecial   #54  <Method void Option(String, Object, Option$CacheKeyUpdater)>
	//    6   10:areturn         
	}

	public static Option disk(String s, Object obj, CacheKeyUpdater cachekeyupdater)
	{
		return new Option(s, obj, cachekeyupdater);
	//    0    0:new             #2   <Class Option>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #54  <Method void Option(String, Object, Option$CacheKeyUpdater)>
	//    6   10:areturn         
	}

	private static CacheKeyUpdater emptyUpdater()
	{
		return EMPTY_UPDATER;
	//    0    0:getstatic       #29  <Field Option$CacheKeyUpdater EMPTY_UPDATER>
	//    1    3:areturn         
	}

	private byte[] getKeyBytes()
	{
		if(keyBytes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field byte[] keyBytes>
	//*   2    4:ifnonnull       21
			keyBytes = key.getBytes(Key.CHARSET);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #40  <Field String key>
	//    6   12:getstatic       #70  <Field java.nio.charset.Charset Key.CHARSET>
	//    7   15:invokevirtual   #76  <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//    8   18:putfield        #64  <Field byte[] keyBytes>
		return keyBytes;
	//    9   21:aload_0         
	//   10   22:getfield        #64  <Field byte[] keyBytes>
	//   11   25:areturn         
	}

	public static Option memory(String s)
	{
		return new Option(s, ((Object) (null)), emptyUpdater());
	//    0    0:new             #2   <Class Option>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokestatic    #80  <Method Option$CacheKeyUpdater emptyUpdater()>
	//    5    9:invokespecial   #54  <Method void Option(String, Object, Option$CacheKeyUpdater)>
	//    6   12:areturn         
	}

	public static Option memory(String s, Object obj)
	{
		return new Option(s, obj, emptyUpdater());
	//    0    0:new             #2   <Class Option>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #80  <Method Option$CacheKeyUpdater emptyUpdater()>
	//    5    9:invokespecial   #54  <Method void Option(String, Object, Option$CacheKeyUpdater)>
	//    6   12:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof Option)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class Option>
	//*   2    4:ifeq            24
		{
			obj = ((Object) ((Option)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class Option>
	//    5   11:astore_1        
			return key.equals(((Object) (((Option) (obj)).key)));
	//    6   12:aload_0         
	//    7   13:getfield        #40  <Field String key>
	//    8   16:aload_1         
	//    9   17:getfield        #40  <Field String key>
	//   10   20:invokevirtual   #87  <Method boolean String.equals(Object)>
	//   11   23:ireturn         
		} else
		{
			return false;
	//   12   24:iconst_0        
	//   13   25:ireturn         
		}
	}

	public Object getDefaultValue()
	{
		return defaultValue;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Object defaultValue>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return key.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String key>
	//    2    4:invokevirtual   #96  <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("Option{key='").append(key).append('\'').append('}').toString();
	//    0    0:new             #100 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #101 <Method void StringBuilder()>
	//    3    7:ldc1            #103 <String "Option{key='">
	//    4    9:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #40  <Field String key>
	//    7   16:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//    8   19:bipush          39
	//    9   21:invokevirtual   #110 <Method StringBuilder StringBuilder.append(char)>
	//   10   24:bipush          125
	//   11   26:invokevirtual   #110 <Method StringBuilder StringBuilder.append(char)>
	//   12   29:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   13   32:areturn         
	}

	public void update(Object obj, MessageDigest messagedigest)
	{
		cacheKeyUpdater.update(getKeyBytes(), obj, messagedigest);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Option$CacheKeyUpdater cacheKeyUpdater>
	//    2    4:aload_0         
	//    3    5:invokespecial   #116 <Method byte[] getKeyBytes()>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #119 <Method void Option$CacheKeyUpdater.update(byte[], Object, MessageDigest)>
	//    7   15:return          
	}

	private static final CacheKeyUpdater EMPTY_UPDATER = new CacheKeyUpdater() {

		public void update(byte abyte0[], Object obj, MessageDigest messagedigest)
		{
		//    0    0:return          
		}

	}
;
	private final CacheKeyUpdater cacheKeyUpdater;
	private final Object defaultValue;
	private final String key;
	private volatile byte keyBytes[];

	static 
	{
	//    0    0:new             #7   <Class Option$1>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void Option$1()>
	//    3    7:putstatic       #29  <Field Option$CacheKeyUpdater EMPTY_UPDATER>
	//*   4   10:return          
	}
}
