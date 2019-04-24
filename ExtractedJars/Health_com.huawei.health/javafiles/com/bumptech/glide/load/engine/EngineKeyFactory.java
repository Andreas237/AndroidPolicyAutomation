// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import java.util.Map;

// Referenced classes of package com.bumptech.glide.load.engine:
//			EngineKey

class EngineKeyFactory
{

	EngineKeyFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public EngineKey buildKey(Object obj, Key key, int i, int j, Map map, Class class1, Class class2, 
			Options options)
	{
		return new EngineKey(obj, key, i, j, map, class1, class2, options);
	//    0    0:new             #13  <Class EngineKey>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:aload           5
	//    7   11:aload           6
	//    8   13:aload           7
	//    9   15:aload           8
	//   10   17:invokespecial   #16  <Method void EngineKey(Object, Key, int, int, Map, Class, Class, Options)>
	//   11   20:areturn         
	}
}
