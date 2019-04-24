// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom.misc;

import java.util.*;

public class RenderingHints
	implements Map, Cloneable
{
	public static abstract class Key
	{

		public final boolean equals(Object obj)
		{
			return this == obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:if_acmpne       7
		//    3    5:iconst_1        
		//    4    6:ireturn         
		//    5    7:iconst_0        
		//    6    8:ireturn         
		}

		public final int hashCode()
		{
			return System.identityHashCode(((Object) (this)));
		//    0    0:aload_0         
		//    1    1:invokestatic    #27  <Method int System.identityHashCode(Object)>
		//    2    4:ireturn         
		}

		protected final int intKey()
		{
			return key;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field int key>
		//    2    4:ireturn         
		}

		public abstract boolean isCompatibleValue(Object obj);

		private final int key;

		protected Key(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			key = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #16  <Field int key>
		//    5    9:return          
		}
	}

	private static class KeyImpl extends Key
	{

		public boolean isCompatibleValue(Object obj)
		{
			while(!(obj instanceof KeyValue) || ((KeyValue)obj).key != this) 
		//*   0    0:aload_1         
		//*   1    1:instanceof      #16  <Class RenderingHints$KeyValue>
		//*   2    4:ifne            9
				return false;
		//    3    7:iconst_0        
		//    4    8:ireturn         
		//    5    9:aload_1         
		//    6   10:checkcast       #16  <Class RenderingHints$KeyValue>
		//    7   13:invokestatic    #20  <Method RenderingHints$Key RenderingHints$KeyValue.access$000(RenderingHints$KeyValue)>
		//    8   16:aload_0         
		//    9   17:if_acmpne       7
			return true;
		//   10   20:iconst_1        
		//   11   21:ireturn         
		}

		protected KeyImpl(int i)
		{
			super(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #11  <Method void RenderingHints$Key(int)>
		//    3    5:return          
		}
	}

	private static class KeyValue
	{

		private final Key key;


/*
		static Key access$000(KeyValue keyvalue)
		{
			return keyvalue.key;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field RenderingHints$Key key>
		//    2    4:areturn         
		}

*/

		protected KeyValue(Key key1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			key = key1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field RenderingHints$Key key>
		//    5    9:return          
		}
	}


	public RenderingHints(Key key, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #144 <Method void Object()>
		map = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #146 <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #147 <Method void HashMap()>
	//    6   12:putfield        #149 <Field HashMap map>
		put(((Object) (key)), obj);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #153 <Method Object put(Object, Object)>
	//   11   21:pop             
	//   12   22:return          
	}

	public RenderingHints(Map map1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #144 <Method void Object()>
		map = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #146 <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #147 <Method void HashMap()>
	//    6   12:putfield        #149 <Field HashMap map>
		if(map1 != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          24
			putAll(map1);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #157 <Method void putAll(Map)>
	//   12   24:return          
	}

	public void add(RenderingHints renderinghints)
	{
		map.putAll(((Map) (renderinghints.map)));
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field HashMap map>
	//    2    4:aload_1         
	//    3    5:getfield        #149 <Field HashMap map>
	//    4    8:invokevirtual   #162 <Method void HashMap.putAll(Map)>
	//    5   11:return          
	}

	public void clear()
	{
		map.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field HashMap map>
	//    2    4:invokevirtual   #165 <Method void HashMap.clear()>
	//    3    7:return          
	}

	public Object clone()
	{
		RenderingHints renderinghints = new RenderingHints(((Map) (null)));
	//    0    0:new             #2   <Class RenderingHints>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #169 <Method void RenderingHints(Map)>
	//    4    8:astore_1        
		renderinghints.map = (HashMap)map.clone();
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #149 <Field HashMap map>
	//    8   14:invokevirtual   #171 <Method Object HashMap.clone()>
	//    9   17:checkcast       #146 <Class HashMap>
	//   10   20:putfield        #149 <Field HashMap map>
		return ((Object) (renderinghints));
	//   11   23:aload_1         
	//   12   24:areturn         
	}

	public boolean containsKey(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
			throw new NullPointerException();
	//    2    4:new             #175 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:invokespecial   #176 <Method void NullPointerException()>
	//    5   11:athrow          
		else
			return map.containsKey(obj);
	//    6   12:aload_0         
	//    7   13:getfield        #149 <Field HashMap map>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #178 <Method boolean HashMap.containsKey(Object)>
	//   10   20:ireturn         
	}

	public boolean containsValue(Object obj)
	{
		return map.containsValue(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field HashMap map>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #181 <Method boolean HashMap.containsValue(Object)>
	//    4    8:ireturn         
	}

	public Set entrySet()
	{
		return map.entrySet();
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field HashMap map>
	//    2    4:invokevirtual   #185 <Method Set HashMap.entrySet()>
	//    3    7:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof Map) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:instanceof      #7   <Class Map>
	//    2    4:ifne            9
_L1:
		return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
_L2:
		Object obj1;
		obj = ((Object) ((Map)obj));
	//    5    9:aload_1         
	//    6   10:checkcast       #7   <Class Map>
	//    7   13:astore_1        
		obj1 = ((Object) (keySet()));
	//    8   14:aload_0         
	//    9   15:invokevirtual   #190 <Method Set keySet()>
	//   10   18:astore_2        
		if(!((Set) (obj1)).equals(((Object) (((Map) (obj)).keySet()))))
			continue; /* Loop/switch isn't completed */
	//   11   19:aload_2         
	//   12   20:aload_1         
	//   13   21:invokeinterface #191 <Method Set Map.keySet()>
	//   14   26:invokeinterface #195 <Method boolean Set.equals(Object)>
	//   15   31:ifeq            7
		obj1 = ((Object) (((Set) (obj1)).iterator()));
	//   16   34:aload_2         
	//   17   35:invokeinterface #199 <Method Iterator Set.iterator()>
	//   18   40:astore_2        
_L5:
		Object obj2;
		Object obj3;
		do
		{
			if(!((Iterator) (obj1)).hasNext())
				break MISSING_BLOCK_LABEL_101;
	//   19   41:aload_2         
	//   20   42:invokeinterface #205 <Method boolean Iterator.hasNext()>
	//   21   47:ifeq            101
			obj3 = ((Object) ((Key)((Iterator) (obj1)).next()));
	//   22   50:aload_2         
	//   23   51:invokeinterface #208 <Method Object Iterator.next()>
	//   24   56:checkcast       #11  <Class RenderingHints$Key>
	//   25   59:astore          4
			obj2 = get(obj3);
	//   26   61:aload_0         
	//   27   62:aload           4
	//   28   64:invokevirtual   #212 <Method Object get(Object)>
	//   29   67:astore_3        
			obj3 = ((Map) (obj)).get(obj3);
	//   30   68:aload_1         
	//   31   69:aload           4
	//   32   71:invokeinterface #213 <Method Object Map.get(Object)>
	//   33   76:astore          4
			if(obj2 != null)
				continue; /* Loop/switch isn't completed */
	//   34   78:aload_3         
	//   35   79:ifnonnull       90
		} while(obj3 == null);
	//   36   82:aload           4
	//   37   84:ifnonnull       7
		if(true) goto _L1; else goto _L3
	//   38   87:goto            41
_L3:
		if(obj2.equals(obj3)) goto _L5; else goto _L4
	//   39   90:aload_3         
	//   40   91:aload           4
	//   41   93:invokevirtual   #214 <Method boolean Object.equals(Object)>
	//   42   96:ifne            41
_L4:
		return false;
	//   43   99:iconst_0        
	//   44  100:ireturn         
		return true;
	//   45  101:iconst_1        
	//   46  102:ireturn         
	}

	public Object get(Object obj)
	{
		return map.get(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field HashMap map>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #215 <Method Object HashMap.get(Object)>
	//    4    8:areturn         
	}

	public int hashCode()
	{
		return map.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field HashMap map>
	//    2    4:invokevirtual   #219 <Method int HashMap.hashCode()>
	//    3    7:ireturn         
	}

	public boolean isEmpty()
	{
		return map.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field HashMap map>
	//    2    4:invokevirtual   #222 <Method boolean HashMap.isEmpty()>
	//    3    7:ireturn         
	}

	public Set keySet()
	{
		return map.keySet();
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field HashMap map>
	//    2    4:invokevirtual   #223 <Method Set HashMap.keySet()>
	//    3    7:areturn         
	}

	public Object put(Object obj, Object obj1)
	{
		if(!((Key)obj).isCompatibleValue(obj1))
	//*   0    0:aload_1         
	//*   1    1:checkcast       #11  <Class RenderingHints$Key>
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #227 <Method boolean RenderingHints$Key.isCompatibleValue(Object)>
	//*   4    8:ifne            19
			throw new IllegalArgumentException();
	//    5   11:new             #229 <Class IllegalArgumentException>
	//    6   14:dup             
	//    7   15:invokespecial   #230 <Method void IllegalArgumentException()>
	//    8   18:athrow          
		else
			return map.put(obj, obj1);
	//    9   19:aload_0         
	//   10   20:getfield        #149 <Field HashMap map>
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:invokevirtual   #231 <Method Object HashMap.put(Object, Object)>
	//   14   28:areturn         
	}

	public void putAll(Map map1)
	{
		if(!(map1 instanceof RenderingHints)) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class RenderingHints>
	//    2    4:ifeq            22
_L1:
		map.putAll(((Map) (((RenderingHints)map1).map)));
	//    3    7:aload_0         
	//    4    8:getfield        #149 <Field HashMap map>
	//    5   11:aload_1         
	//    6   12:checkcast       #2   <Class RenderingHints>
	//    7   15:getfield        #149 <Field HashMap map>
	//    8   18:invokevirtual   #162 <Method void HashMap.putAll(Map)>
_L4:
		return;
	//    9   21:return          
_L2:
		map1 = ((Map) (map1.entrySet()));
	//   10   22:aload_1         
	//   11   23:invokeinterface #232 <Method Set Map.entrySet()>
	//   12   28:astore_1        
		if(map1 != null)
	//*  13   29:aload_1         
	//*  14   30:ifnull          21
		{
			map1 = ((Map) (((Set) (map1)).iterator()));
	//   15   33:aload_1         
	//   16   34:invokeinterface #199 <Method Iterator Set.iterator()>
	//   17   39:astore_1        
			while(((Iterator) (map1)).hasNext()) 
	//*  18   40:aload_1         
	//*  19   41:invokeinterface #205 <Method boolean Iterator.hasNext()>
	//*  20   46:ifeq            21
			{
				java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (map1)).next();
	//   21   49:aload_1         
	//   22   50:invokeinterface #208 <Method Object Iterator.next()>
	//   23   55:checkcast       #234 <Class java.util.Map$Entry>
	//   24   58:astore_2        
				put(((Object) ((Key)entry.getKey())), entry.getValue());
	//   25   59:aload_0         
	//   26   60:aload_2         
	//   27   61:invokeinterface #237 <Method Object java.util.Map$Entry.getKey()>
	//   28   66:checkcast       #11  <Class RenderingHints$Key>
	//   29   69:aload_2         
	//   30   70:invokeinterface #240 <Method Object java.util.Map$Entry.getValue()>
	//   31   75:invokevirtual   #153 <Method Object put(Object, Object)>
	//   32   78:pop             
			}
		}
		if(true) goto _L4; else goto _L3
	//   33   79:goto            40
_L3:
	}

	public Object remove(Object obj)
	{
		return map.remove(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field HashMap map>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #244 <Method Object HashMap.remove(Object)>
	//    4    8:areturn         
	}

	public int size()
	{
		return map.size();
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field HashMap map>
	//    2    4:invokevirtual   #247 <Method int HashMap.size()>
	//    3    7:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("RenderingHints[").append(map.toString()).append("]").toString();
	//    0    0:new             #251 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #252 <Method void StringBuilder()>
	//    3    7:ldc1            #254 <String "RenderingHints[">
	//    4    9:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #149 <Field HashMap map>
	//    7   16:invokevirtual   #260 <Method String HashMap.toString()>
	//    8   19:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
	//    9   22:ldc2            #262 <String "]">
	//   10   25:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
	//   11   28:invokevirtual   #263 <Method String StringBuilder.toString()>
	//   12   31:areturn         
	}

	public Collection values()
	{
		return map.values();
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field HashMap map>
	//    2    4:invokevirtual   #267 <Method Collection HashMap.values()>
	//    3    7:areturn         
	}

	public static final Key KEY_ALPHA_INTERPOLATION;
	public static final Key KEY_ANTIALIASING;
	public static final Key KEY_COLOR_RENDERING;
	public static final Key KEY_DITHERING;
	public static final Key KEY_FRACTIONALMETRICS;
	public static final Key KEY_INTERPOLATION;
	public static final Key KEY_RENDERING;
	public static final Key KEY_STROKE_CONTROL;
	public static final Key KEY_TEXT_ANTIALIASING;
	public static final Object VALUE_ALPHA_INTERPOLATION_DEFAULT;
	public static final Object VALUE_ALPHA_INTERPOLATION_QUALITY;
	public static final Object VALUE_ALPHA_INTERPOLATION_SPEED;
	public static final Object VALUE_ANTIALIAS_DEFAULT;
	public static final Object VALUE_ANTIALIAS_OFF;
	public static final Object VALUE_ANTIALIAS_ON;
	public static final Object VALUE_COLOR_RENDER_DEFAULT;
	public static final Object VALUE_COLOR_RENDER_QUALITY;
	public static final Object VALUE_COLOR_RENDER_SPEED;
	public static final Object VALUE_DITHER_DEFAULT;
	public static final Object VALUE_DITHER_DISABLE;
	public static final Object VALUE_DITHER_ENABLE;
	public static final Object VALUE_FRACTIONALMETRICS_DEFAULT;
	public static final Object VALUE_FRACTIONALMETRICS_OFF;
	public static final Object VALUE_FRACTIONALMETRICS_ON;
	public static final Object VALUE_INTERPOLATION_BICUBIC;
	public static final Object VALUE_INTERPOLATION_BILINEAR;
	public static final Object VALUE_INTERPOLATION_NEAREST_NEIGHBOR;
	public static final Object VALUE_RENDER_DEFAULT;
	public static final Object VALUE_RENDER_QUALITY;
	public static final Object VALUE_RENDER_SPEED;
	public static final Object VALUE_STROKE_DEFAULT;
	public static final Object VALUE_STROKE_NORMALIZE;
	public static final Object VALUE_STROKE_PURE;
	public static final Object VALUE_TEXT_ANTIALIAS_DEFAULT;
	public static final Object VALUE_TEXT_ANTIALIAS_OFF;
	public static final Object VALUE_TEXT_ANTIALIAS_ON;
	private HashMap map;

	static 
	{
		KEY_ALPHA_INTERPOLATION = ((Key) (new KeyImpl(1)));
	//    0    0:new             #14  <Class RenderingHints$KeyImpl>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #65  <Method void RenderingHints$KeyImpl(int)>
	//    4    8:putstatic       #67  <Field RenderingHints$Key KEY_ALPHA_INTERPOLATION>
		VALUE_ALPHA_INTERPOLATION_DEFAULT = ((Object) (new KeyValue(KEY_ALPHA_INTERPOLATION)));
	//    5   11:new             #17  <Class RenderingHints$KeyValue>
	//    6   14:dup             
	//    7   15:getstatic       #67  <Field RenderingHints$Key KEY_ALPHA_INTERPOLATION>
	//    8   18:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//    9   21:putstatic       #72  <Field Object VALUE_ALPHA_INTERPOLATION_DEFAULT>
		VALUE_ALPHA_INTERPOLATION_SPEED = ((Object) (new KeyValue(KEY_ALPHA_INTERPOLATION)));
	//   10   24:new             #17  <Class RenderingHints$KeyValue>
	//   11   27:dup             
	//   12   28:getstatic       #67  <Field RenderingHints$Key KEY_ALPHA_INTERPOLATION>
	//   13   31:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//   14   34:putstatic       #74  <Field Object VALUE_ALPHA_INTERPOLATION_SPEED>
		VALUE_ALPHA_INTERPOLATION_QUALITY = ((Object) (new KeyValue(KEY_ALPHA_INTERPOLATION)));
	//   15   37:new             #17  <Class RenderingHints$KeyValue>
	//   16   40:dup             
	//   17   41:getstatic       #67  <Field RenderingHints$Key KEY_ALPHA_INTERPOLATION>
	//   18   44:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//   19   47:putstatic       #76  <Field Object VALUE_ALPHA_INTERPOLATION_QUALITY>
		KEY_ANTIALIASING = ((Key) (new KeyImpl(2)));
	//   20   50:new             #14  <Class RenderingHints$KeyImpl>
	//   21   53:dup             
	//   22   54:iconst_2        
	//   23   55:invokespecial   #65  <Method void RenderingHints$KeyImpl(int)>
	//   24   58:putstatic       #78  <Field RenderingHints$Key KEY_ANTIALIASING>
		VALUE_ANTIALIAS_DEFAULT = ((Object) (new KeyValue(KEY_ANTIALIASING)));
	//   25   61:new             #17  <Class RenderingHints$KeyValue>
	//   26   64:dup             
	//   27   65:getstatic       #78  <Field RenderingHints$Key KEY_ANTIALIASING>
	//   28   68:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//   29   71:putstatic       #80  <Field Object VALUE_ANTIALIAS_DEFAULT>
		VALUE_ANTIALIAS_ON = ((Object) (new KeyValue(KEY_ANTIALIASING)));
	//   30   74:new             #17  <Class RenderingHints$KeyValue>
	//   31   77:dup             
	//   32   78:getstatic       #78  <Field RenderingHints$Key KEY_ANTIALIASING>
	//   33   81:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//   34   84:putstatic       #82  <Field Object VALUE_ANTIALIAS_ON>
		VALUE_ANTIALIAS_OFF = ((Object) (new KeyValue(KEY_ANTIALIASING)));
	//   35   87:new             #17  <Class RenderingHints$KeyValue>
	//   36   90:dup             
	//   37   91:getstatic       #78  <Field RenderingHints$Key KEY_ANTIALIASING>
	//   38   94:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//   39   97:putstatic       #84  <Field Object VALUE_ANTIALIAS_OFF>
		KEY_COLOR_RENDERING = ((Key) (new KeyImpl(3)));
	//   40  100:new             #14  <Class RenderingHints$KeyImpl>
	//   41  103:dup             
	//   42  104:iconst_3        
	//   43  105:invokespecial   #65  <Method void RenderingHints$KeyImpl(int)>
	//   44  108:putstatic       #86  <Field RenderingHints$Key KEY_COLOR_RENDERING>
		VALUE_COLOR_RENDER_DEFAULT = ((Object) (new KeyValue(KEY_COLOR_RENDERING)));
	//   45  111:new             #17  <Class RenderingHints$KeyValue>
	//   46  114:dup             
	//   47  115:getstatic       #86  <Field RenderingHints$Key KEY_COLOR_RENDERING>
	//   48  118:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//   49  121:putstatic       #88  <Field Object VALUE_COLOR_RENDER_DEFAULT>
		VALUE_COLOR_RENDER_SPEED = ((Object) (new KeyValue(KEY_COLOR_RENDERING)));
	//   50  124:new             #17  <Class RenderingHints$KeyValue>
	//   51  127:dup             
	//   52  128:getstatic       #86  <Field RenderingHints$Key KEY_COLOR_RENDERING>
	//   53  131:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//   54  134:putstatic       #90  <Field Object VALUE_COLOR_RENDER_SPEED>
		VALUE_COLOR_RENDER_QUALITY = ((Object) (new KeyValue(KEY_COLOR_RENDERING)));
	//   55  137:new             #17  <Class RenderingHints$KeyValue>
	//   56  140:dup             
	//   57  141:getstatic       #86  <Field RenderingHints$Key KEY_COLOR_RENDERING>
	//   58  144:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//   59  147:putstatic       #92  <Field Object VALUE_COLOR_RENDER_QUALITY>
		KEY_DITHERING = ((Key) (new KeyImpl(4)));
	//   60  150:new             #14  <Class RenderingHints$KeyImpl>
	//   61  153:dup             
	//   62  154:iconst_4        
	//   63  155:invokespecial   #65  <Method void RenderingHints$KeyImpl(int)>
	//   64  158:putstatic       #94  <Field RenderingHints$Key KEY_DITHERING>
		VALUE_DITHER_DEFAULT = ((Object) (new KeyValue(KEY_DITHERING)));
	//   65  161:new             #17  <Class RenderingHints$KeyValue>
	//   66  164:dup             
	//   67  165:getstatic       #94  <Field RenderingHints$Key KEY_DITHERING>
	//   68  168:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//   69  171:putstatic       #96  <Field Object VALUE_DITHER_DEFAULT>
		VALUE_DITHER_DISABLE = ((Object) (new KeyValue(KEY_DITHERING)));
	//   70  174:new             #17  <Class RenderingHints$KeyValue>
	//   71  177:dup             
	//   72  178:getstatic       #94  <Field RenderingHints$Key KEY_DITHERING>
	//   73  181:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//   74  184:putstatic       #98  <Field Object VALUE_DITHER_DISABLE>
		VALUE_DITHER_ENABLE = ((Object) (new KeyValue(KEY_DITHERING)));
	//   75  187:new             #17  <Class RenderingHints$KeyValue>
	//   76  190:dup             
	//   77  191:getstatic       #94  <Field RenderingHints$Key KEY_DITHERING>
	//   78  194:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//   79  197:putstatic       #100 <Field Object VALUE_DITHER_ENABLE>
		KEY_FRACTIONALMETRICS = ((Key) (new KeyImpl(5)));
	//   80  200:new             #14  <Class RenderingHints$KeyImpl>
	//   81  203:dup             
	//   82  204:iconst_5        
	//   83  205:invokespecial   #65  <Method void RenderingHints$KeyImpl(int)>
	//   84  208:putstatic       #102 <Field RenderingHints$Key KEY_FRACTIONALMETRICS>
		VALUE_FRACTIONALMETRICS_DEFAULT = ((Object) (new KeyValue(KEY_FRACTIONALMETRICS)));
	//   85  211:new             #17  <Class RenderingHints$KeyValue>
	//   86  214:dup             
	//   87  215:getstatic       #102 <Field RenderingHints$Key KEY_FRACTIONALMETRICS>
	//   88  218:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//   89  221:putstatic       #104 <Field Object VALUE_FRACTIONALMETRICS_DEFAULT>
		VALUE_FRACTIONALMETRICS_ON = ((Object) (new KeyValue(KEY_FRACTIONALMETRICS)));
	//   90  224:new             #17  <Class RenderingHints$KeyValue>
	//   91  227:dup             
	//   92  228:getstatic       #102 <Field RenderingHints$Key KEY_FRACTIONALMETRICS>
	//   93  231:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//   94  234:putstatic       #106 <Field Object VALUE_FRACTIONALMETRICS_ON>
		VALUE_FRACTIONALMETRICS_OFF = ((Object) (new KeyValue(KEY_FRACTIONALMETRICS)));
	//   95  237:new             #17  <Class RenderingHints$KeyValue>
	//   96  240:dup             
	//   97  241:getstatic       #102 <Field RenderingHints$Key KEY_FRACTIONALMETRICS>
	//   98  244:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//   99  247:putstatic       #108 <Field Object VALUE_FRACTIONALMETRICS_OFF>
		KEY_INTERPOLATION = ((Key) (new KeyImpl(6)));
	//  100  250:new             #14  <Class RenderingHints$KeyImpl>
	//  101  253:dup             
	//  102  254:bipush          6
	//  103  256:invokespecial   #65  <Method void RenderingHints$KeyImpl(int)>
	//  104  259:putstatic       #110 <Field RenderingHints$Key KEY_INTERPOLATION>
		VALUE_INTERPOLATION_BICUBIC = ((Object) (new KeyValue(KEY_INTERPOLATION)));
	//  105  262:new             #17  <Class RenderingHints$KeyValue>
	//  106  265:dup             
	//  107  266:getstatic       #110 <Field RenderingHints$Key KEY_INTERPOLATION>
	//  108  269:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//  109  272:putstatic       #112 <Field Object VALUE_INTERPOLATION_BICUBIC>
		VALUE_INTERPOLATION_BILINEAR = ((Object) (new KeyValue(KEY_INTERPOLATION)));
	//  110  275:new             #17  <Class RenderingHints$KeyValue>
	//  111  278:dup             
	//  112  279:getstatic       #110 <Field RenderingHints$Key KEY_INTERPOLATION>
	//  113  282:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//  114  285:putstatic       #114 <Field Object VALUE_INTERPOLATION_BILINEAR>
		VALUE_INTERPOLATION_NEAREST_NEIGHBOR = ((Object) (new KeyValue(KEY_INTERPOLATION)));
	//  115  288:new             #17  <Class RenderingHints$KeyValue>
	//  116  291:dup             
	//  117  292:getstatic       #110 <Field RenderingHints$Key KEY_INTERPOLATION>
	//  118  295:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//  119  298:putstatic       #116 <Field Object VALUE_INTERPOLATION_NEAREST_NEIGHBOR>
		KEY_RENDERING = ((Key) (new KeyImpl(7)));
	//  120  301:new             #14  <Class RenderingHints$KeyImpl>
	//  121  304:dup             
	//  122  305:bipush          7
	//  123  307:invokespecial   #65  <Method void RenderingHints$KeyImpl(int)>
	//  124  310:putstatic       #118 <Field RenderingHints$Key KEY_RENDERING>
		VALUE_RENDER_DEFAULT = ((Object) (new KeyValue(KEY_RENDERING)));
	//  125  313:new             #17  <Class RenderingHints$KeyValue>
	//  126  316:dup             
	//  127  317:getstatic       #118 <Field RenderingHints$Key KEY_RENDERING>
	//  128  320:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//  129  323:putstatic       #120 <Field Object VALUE_RENDER_DEFAULT>
		VALUE_RENDER_SPEED = ((Object) (new KeyValue(KEY_RENDERING)));
	//  130  326:new             #17  <Class RenderingHints$KeyValue>
	//  131  329:dup             
	//  132  330:getstatic       #118 <Field RenderingHints$Key KEY_RENDERING>
	//  133  333:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//  134  336:putstatic       #122 <Field Object VALUE_RENDER_SPEED>
		VALUE_RENDER_QUALITY = ((Object) (new KeyValue(KEY_RENDERING)));
	//  135  339:new             #17  <Class RenderingHints$KeyValue>
	//  136  342:dup             
	//  137  343:getstatic       #118 <Field RenderingHints$Key KEY_RENDERING>
	//  138  346:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//  139  349:putstatic       #124 <Field Object VALUE_RENDER_QUALITY>
		KEY_STROKE_CONTROL = ((Key) (new KeyImpl(8)));
	//  140  352:new             #14  <Class RenderingHints$KeyImpl>
	//  141  355:dup             
	//  142  356:bipush          8
	//  143  358:invokespecial   #65  <Method void RenderingHints$KeyImpl(int)>
	//  144  361:putstatic       #126 <Field RenderingHints$Key KEY_STROKE_CONTROL>
		VALUE_STROKE_DEFAULT = ((Object) (new KeyValue(KEY_STROKE_CONTROL)));
	//  145  364:new             #17  <Class RenderingHints$KeyValue>
	//  146  367:dup             
	//  147  368:getstatic       #126 <Field RenderingHints$Key KEY_STROKE_CONTROL>
	//  148  371:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//  149  374:putstatic       #128 <Field Object VALUE_STROKE_DEFAULT>
		VALUE_STROKE_NORMALIZE = ((Object) (new KeyValue(KEY_STROKE_CONTROL)));
	//  150  377:new             #17  <Class RenderingHints$KeyValue>
	//  151  380:dup             
	//  152  381:getstatic       #126 <Field RenderingHints$Key KEY_STROKE_CONTROL>
	//  153  384:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//  154  387:putstatic       #130 <Field Object VALUE_STROKE_NORMALIZE>
		VALUE_STROKE_PURE = ((Object) (new KeyValue(KEY_STROKE_CONTROL)));
	//  155  390:new             #17  <Class RenderingHints$KeyValue>
	//  156  393:dup             
	//  157  394:getstatic       #126 <Field RenderingHints$Key KEY_STROKE_CONTROL>
	//  158  397:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//  159  400:putstatic       #132 <Field Object VALUE_STROKE_PURE>
		KEY_TEXT_ANTIALIASING = ((Key) (new KeyImpl(9)));
	//  160  403:new             #14  <Class RenderingHints$KeyImpl>
	//  161  406:dup             
	//  162  407:bipush          9
	//  163  409:invokespecial   #65  <Method void RenderingHints$KeyImpl(int)>
	//  164  412:putstatic       #134 <Field RenderingHints$Key KEY_TEXT_ANTIALIASING>
		VALUE_TEXT_ANTIALIAS_DEFAULT = ((Object) (new KeyValue(KEY_TEXT_ANTIALIASING)));
	//  165  415:new             #17  <Class RenderingHints$KeyValue>
	//  166  418:dup             
	//  167  419:getstatic       #134 <Field RenderingHints$Key KEY_TEXT_ANTIALIASING>
	//  168  422:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//  169  425:putstatic       #136 <Field Object VALUE_TEXT_ANTIALIAS_DEFAULT>
		VALUE_TEXT_ANTIALIAS_ON = ((Object) (new KeyValue(KEY_TEXT_ANTIALIASING)));
	//  170  428:new             #17  <Class RenderingHints$KeyValue>
	//  171  431:dup             
	//  172  432:getstatic       #134 <Field RenderingHints$Key KEY_TEXT_ANTIALIASING>
	//  173  435:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//  174  438:putstatic       #138 <Field Object VALUE_TEXT_ANTIALIAS_ON>
		VALUE_TEXT_ANTIALIAS_OFF = ((Object) (new KeyValue(KEY_TEXT_ANTIALIASING)));
	//  175  441:new             #17  <Class RenderingHints$KeyValue>
	//  176  444:dup             
	//  177  445:getstatic       #134 <Field RenderingHints$Key KEY_TEXT_ANTIALIASING>
	//  178  448:invokespecial   #70  <Method void RenderingHints$KeyValue(RenderingHints$Key)>
	//  179  451:putstatic       #140 <Field Object VALUE_TEXT_ANTIALIAS_OFF>
	//* 180  454:return          
	}
}
