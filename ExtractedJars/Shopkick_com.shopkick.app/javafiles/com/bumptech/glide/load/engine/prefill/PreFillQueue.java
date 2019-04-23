// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.prefill;

import java.util.*;

// Referenced classes of package com.bumptech.glide.load.engine.prefill:
//			PreFillType

final class PreFillQueue
{

	public PreFillQueue(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		bitmapsPerType = map;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Map bitmapsPerType>
		keyList = ((List) (new ArrayList(((Collection) (map.keySet())))));
	//    5    9:aload_0         
	//    6   10:new             #22  <Class ArrayList>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokeinterface #28  <Method java.util.Set Map.keySet()>
	//   10   20:invokespecial   #31  <Method void ArrayList(Collection)>
	//   11   23:putfield        #33  <Field List keyList>
		for(map = ((Map) (map.values().iterator())); ((Iterator) (map)).hasNext();)
	//*  12   26:aload_1         
	//*  13   27:invokeinterface #37  <Method Collection Map.values()>
	//*  14   32:invokeinterface #43  <Method Iterator Collection.iterator()>
	//*  15   37:astore_1        
	//*  16   38:aload_1         
	//*  17   39:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//*  18   44:ifeq            73
		{
			Integer integer = (Integer)((Iterator) (map)).next();
	//   19   47:aload_1         
	//   20   48:invokeinterface #53  <Method Object Iterator.next()>
	//   21   53:checkcast       #55  <Class Integer>
	//   22   56:astore_2        
			bitmapsRemaining = bitmapsRemaining + integer.intValue();
	//   23   57:aload_0         
	//   24   58:aload_0         
	//   25   59:getfield        #57  <Field int bitmapsRemaining>
	//   26   62:aload_2         
	//   27   63:invokevirtual   #61  <Method int Integer.intValue()>
	//   28   66:iadd            
	//   29   67:putfield        #57  <Field int bitmapsRemaining>
		}

	//*  30   70:goto            38
	//   31   73:return          
	}

	public int getSize()
	{
		return bitmapsRemaining;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int bitmapsRemaining>
	//    2    4:ireturn         
	}

	public boolean isEmpty()
	{
		return bitmapsRemaining == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int bitmapsRemaining>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public PreFillType remove()
	{
		PreFillType prefilltype = (PreFillType)keyList.get(keyIndex);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field List keyList>
	//    2    4:aload_0         
	//    3    5:getfield        #70  <Field int keyIndex>
	//    4    8:invokeinterface #76  <Method Object List.get(int)>
	//    5   13:checkcast       #78  <Class PreFillType>
	//    6   16:astore_2        
		Integer integer = (Integer)bitmapsPerType.get(((Object) (prefilltype)));
	//    7   17:aload_0         
	//    8   18:getfield        #20  <Field Map bitmapsPerType>
	//    9   21:aload_2         
	//   10   22:invokeinterface #81  <Method Object Map.get(Object)>
	//   11   27:checkcast       #55  <Class Integer>
	//   12   30:astore_3        
		if(integer.intValue() == 1)
	//*  13   31:aload_3         
	//*  14   32:invokevirtual   #61  <Method int Integer.intValue()>
	//*  15   35:iconst_1        
	//*  16   36:icmpne          67
		{
			bitmapsPerType.remove(((Object) (prefilltype)));
	//   17   39:aload_0         
	//   18   40:getfield        #20  <Field Map bitmapsPerType>
	//   19   43:aload_2         
	//   20   44:invokeinterface #83  <Method Object Map.remove(Object)>
	//   21   49:pop             
			keyList.remove(keyIndex);
	//   22   50:aload_0         
	//   23   51:getfield        #33  <Field List keyList>
	//   24   54:aload_0         
	//   25   55:getfield        #70  <Field int keyIndex>
	//   26   58:invokeinterface #85  <Method Object List.remove(int)>
	//   27   63:pop             
		} else
	//*  28   64:goto            87
		{
			bitmapsPerType.put(((Object) (prefilltype)), ((Object) (Integer.valueOf(integer.intValue() - 1))));
	//   29   67:aload_0         
	//   30   68:getfield        #20  <Field Map bitmapsPerType>
	//   31   71:aload_2         
	//   32   72:aload_3         
	//   33   73:invokevirtual   #61  <Method int Integer.intValue()>
	//   34   76:iconst_1        
	//   35   77:isub            
	//   36   78:invokestatic    #89  <Method Integer Integer.valueOf(int)>
	//   37   81:invokeinterface #93  <Method Object Map.put(Object, Object)>
	//   38   86:pop             
		}
		bitmapsRemaining = bitmapsRemaining - 1;
	//   39   87:aload_0         
	//   40   88:aload_0         
	//   41   89:getfield        #57  <Field int bitmapsRemaining>
	//   42   92:iconst_1        
	//   43   93:isub            
	//   44   94:putfield        #57  <Field int bitmapsRemaining>
		int i;
		if(keyList.isEmpty())
	//*  45   97:aload_0         
	//*  46   98:getfield        #33  <Field List keyList>
	//*  47  101:invokeinterface #95  <Method boolean List.isEmpty()>
	//*  48  106:ifeq            114
			i = 0;
	//   49  109:iconst_0        
	//   50  110:istore_1        
		else
	//*  51  111:goto            131
			i = (keyIndex + 1) % keyList.size();
	//   52  114:aload_0         
	//   53  115:getfield        #70  <Field int keyIndex>
	//   54  118:iconst_1        
	//   55  119:iadd            
	//   56  120:aload_0         
	//   57  121:getfield        #33  <Field List keyList>
	//   58  124:invokeinterface #98  <Method int List.size()>
	//   59  129:irem            
	//   60  130:istore_1        
		keyIndex = i;
	//   61  131:aload_0         
	//   62  132:iload_1         
	//   63  133:putfield        #70  <Field int keyIndex>
		return prefilltype;
	//   64  136:aload_2         
	//   65  137:areturn         
	}

	private final Map bitmapsPerType;
	private int bitmapsRemaining;
	private int keyIndex;
	private final List keyList;
}
