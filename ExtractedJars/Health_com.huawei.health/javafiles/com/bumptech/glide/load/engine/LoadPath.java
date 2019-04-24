// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.util.Preconditions;
import java.util.*;

// Referenced classes of package com.bumptech.glide.load.engine:
//			GlideException, DecodePath, Resource

public class LoadPath
{

	public LoadPath(Class class1, Class class2, Class class3, List list, android.support.v4.util.Pools.Pool pool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		dataClass = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Class dataClass>
		listPool = pool;
	//    5    9:aload_0         
	//    6   10:aload           5
	//    7   12:putfield        #25  <Field android.support.v4.util.Pools$Pool listPool>
		decodePaths = (List)Preconditions.checkNotEmpty(((java.util.Collection) (list)));
	//    8   15:aload_0         
	//    9   16:aload           4
	//   10   18:invokestatic    #31  <Method java.util.Collection Preconditions.checkNotEmpty(java.util.Collection)>
	//   11   21:checkcast       #33  <Class List>
	//   12   24:putfield        #35  <Field List decodePaths>
		failureMessage = (new StringBuilder()).append("Failed LoadPath{").append(class1.getSimpleName()).append("->").append(class2.getSimpleName()).append("->").append(class3.getSimpleName()).append("}").toString();
	//   13   27:aload_0         
	//   14   28:new             #37  <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #38  <Method void StringBuilder()>
	//   17   35:ldc1            #40  <String "Failed LoadPath{">
	//   18   37:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   19   40:aload_1         
	//   20   41:invokevirtual   #50  <Method String Class.getSimpleName()>
	//   21   44:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   22   47:ldc1            #52  <String "->">
	//   23   49:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   24   52:aload_2         
	//   25   53:invokevirtual   #50  <Method String Class.getSimpleName()>
	//   26   56:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   27   59:ldc1            #52  <String "->">
	//   28   61:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   29   64:aload_3         
	//   30   65:invokevirtual   #50  <Method String Class.getSimpleName()>
	//   31   68:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   32   71:ldc1            #54  <String "}">
	//   33   73:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   34   76:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   35   79:putfield        #59  <Field String failureMessage>
	//   36   82:return          
	}

	private Resource loadWithExceptionList(DataRewinder datarewinder, Options options, int i, int j, DecodePath.DecodeCallback decodecallback, List list)
		throws GlideException
	{
		int k;
		int l;
		Object obj;
		l = decodePaths.size();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List decodePaths>
	//    2    4:invokeinterface #70  <Method int List.size()>
	//    3    9:istore          8
		obj = null;
	//    4   11:aconst_null     
	//    5   12:astore          9
		k = 0;
	//    6   14:iconst_0        
	//    7   15:istore          7
_L2:
		Object obj1;
		obj1 = obj;
	//    8   17:aload           9
	//    9   19:astore          10
		if(k >= l)
			break; /* Loop/switch isn't completed */
	//   10   21:iload           7
	//   11   23:iload           8
	//   12   25:icmpge          98
		obj1 = ((Object) ((DecodePath)decodePaths.get(k)));
	//   13   28:aload_0         
	//   14   29:getfield        #35  <Field List decodePaths>
	//   15   32:iload           7
	//   16   34:invokeinterface #74  <Method Object List.get(int)>
	//   17   39:checkcast       #76  <Class DecodePath>
	//   18   42:astore          10
		obj1 = ((Object) (((DecodePath) (obj1)).decode(datarewinder, i, j, options, decodecallback)));
	//   19   44:aload           10
	//   20   46:aload_1         
	//   21   47:iload_3         
	//   22   48:iload           4
	//   23   50:aload_2         
	//   24   51:aload           5
	//   25   53:invokevirtual   #80  <Method Resource DecodePath.decode(DataRewinder, int, int, Options, DecodePath$DecodeCallback)>
	//   26   56:astore          10
		obj = obj1;
	//   27   58:aload           10
	//   28   60:astore          9
		break MISSING_BLOCK_LABEL_77;
	//   29   62:goto            77
		obj1;
	//   30   65:astore          10
		list.add(obj1);
	//   31   67:aload           6
	//   32   69:aload           10
	//   33   71:invokeinterface #84  <Method boolean List.add(Object)>
	//   34   76:pop             
		if(obj != null)
	//*  35   77:aload           9
	//*  36   79:ifnull          89
		{
			obj1 = obj;
	//   37   82:aload           9
	//   38   84:astore          10
			break; /* Loop/switch isn't completed */
	//   39   86:goto            98
		}
		k++;
	//   40   89:iload           7
	//   41   91:iconst_1        
	//   42   92:iadd            
	//   43   93:istore          7
		if(true) goto _L2; else goto _L1
	//   44   95:goto            17
_L1:
		if(obj1 == null)
	//*  45   98:aload           10
	//*  46  100:ifnonnull       124
			throw new GlideException(failureMessage, ((List) (new ArrayList(((java.util.Collection) (list))))));
	//   47  103:new             #66  <Class GlideException>
	//   48  106:dup             
	//   49  107:aload_0         
	//   50  108:getfield        #59  <Field String failureMessage>
	//   51  111:new             #86  <Class ArrayList>
	//   52  114:dup             
	//   53  115:aload           6
	//   54  117:invokespecial   #89  <Method void ArrayList(java.util.Collection)>
	//   55  120:invokespecial   #92  <Method void GlideException(String, List)>
	//   56  123:athrow          
		else
			return ((Resource) (obj1));
	//   57  124:aload           10
	//   58  126:areturn         
	}

	public Class getDataClass()
	{
		return dataClass;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Class dataClass>
	//    2    4:areturn         
	}

	public Resource load(DataRewinder datarewinder, Options options, int i, int j, DecodePath.DecodeCallback decodecallback)
		throws GlideException
	{
		List list = (List)listPool.acquire();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field android.support.v4.util.Pools$Pool listPool>
	//    2    4:invokeinterface #105 <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    3    9:checkcast       #33  <Class List>
	//    4   12:astore          6
		datarewinder = ((DataRewinder) (loadWithExceptionList(datarewinder, options, i, j, decodecallback, list)));
	//    5   14:aload_0         
	//    6   15:aload_1         
	//    7   16:aload_2         
	//    8   17:iload_3         
	//    9   18:iload           4
	//   10   20:aload           5
	//   11   22:aload           6
	//   12   24:invokespecial   #107 <Method Resource loadWithExceptionList(DataRewinder, Options, int, int, DecodePath$DecodeCallback, List)>
	//   13   27:astore_1        
		listPool.release(((Object) (list)));
	//   14   28:aload_0         
	//   15   29:getfield        #25  <Field android.support.v4.util.Pools$Pool listPool>
	//   16   32:aload           6
	//   17   34:invokeinterface #110 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   18   39:pop             
		return ((Resource) (datarewinder));
	//   19   40:aload_1         
	//   20   41:areturn         
		datarewinder;
	//   21   42:astore_1        
		listPool.release(((Object) (list)));
	//   22   43:aload_0         
	//   23   44:getfield        #25  <Field android.support.v4.util.Pools$Pool listPool>
	//   24   47:aload           6
	//   25   49:invokeinterface #110 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   26   54:pop             
		throw datarewinder;
	//   27   55:aload_1         
	//   28   56:athrow          
	}

	public String toString()
	{
		return (new StringBuilder()).append("LoadPath{decodePaths=").append(Arrays.toString(decodePaths.toArray(((Object []) (new DecodePath[decodePaths.size()]))))).append('}').toString();
	//    0    0:new             #37  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void StringBuilder()>
	//    3    7:ldc1            #113 <String "LoadPath{decodePaths=">
	//    4    9:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #35  <Field List decodePaths>
	//    7   16:aload_0         
	//    8   17:getfield        #35  <Field List decodePaths>
	//    9   20:invokeinterface #70  <Method int List.size()>
	//   10   25:anewarray       DecodePath[]
	//   11   28:invokeinterface #117 <Method Object[] List.toArray(Object[])>
	//   12   33:invokestatic    #122 <Method String Arrays.toString(Object[])>
	//   13   36:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   14   39:bipush          125
	//   15   41:invokevirtual   #125 <Method StringBuilder StringBuilder.append(char)>
	//   16   44:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   17   47:areturn         
	}

	private final Class dataClass;
	private final List decodePaths;
	private final String failureMessage;
	private final android.support.v4.util.Pools.Pool listPool;
}
