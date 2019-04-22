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
		list = ((List) (new StringBuilder()));
	//   13   27:new             #37  <Class StringBuilder>
	//   14   30:dup             
	//   15   31:invokespecial   #38  <Method void StringBuilder()>
	//   16   34:astore          4
		((StringBuilder) (list)).append("Failed LoadPath{");
	//   17   36:aload           4
	//   18   38:ldc1            #40  <String "Failed LoadPath{">
	//   19   40:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   20   43:pop             
		((StringBuilder) (list)).append(class1.getSimpleName());
	//   21   44:aload           4
	//   22   46:aload_1         
	//   23   47:invokevirtual   #50  <Method String Class.getSimpleName()>
	//   24   50:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   25   53:pop             
		((StringBuilder) (list)).append("->");
	//   26   54:aload           4
	//   27   56:ldc1            #52  <String "->">
	//   28   58:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   29   61:pop             
		((StringBuilder) (list)).append(class2.getSimpleName());
	//   30   62:aload           4
	//   31   64:aload_2         
	//   32   65:invokevirtual   #50  <Method String Class.getSimpleName()>
	//   33   68:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   34   71:pop             
		((StringBuilder) (list)).append("->");
	//   35   72:aload           4
	//   36   74:ldc1            #52  <String "->">
	//   37   76:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   38   79:pop             
		((StringBuilder) (list)).append(class3.getSimpleName());
	//   39   80:aload           4
	//   40   82:aload_3         
	//   41   83:invokevirtual   #50  <Method String Class.getSimpleName()>
	//   42   86:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   43   89:pop             
		((StringBuilder) (list)).append("}");
	//   44   90:aload           4
	//   45   92:ldc1            #54  <String "}">
	//   46   94:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   47   97:pop             
		failureMessage = ((StringBuilder) (list)).toString();
	//   48   98:aload_0         
	//   49   99:aload           4
	//   50  101:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   51  104:putfield        #59  <Field String failureMessage>
	//   52  107:return          
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
	//    2    4:invokeinterface #71  <Method int List.size()>
	//    3    9:istore          8
		k = 0;
	//    4   11:iconst_0        
	//    5   12:istore          7
		obj = null;
	//    6   14:aconst_null     
	//    7   15:astore          9
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
	//   16   34:invokeinterface #75  <Method Object List.get(int)>
	//   17   39:checkcast       #77  <Class DecodePath>
	//   18   42:astore          10
		obj1 = ((Object) (((DecodePath) (obj1)).decode(datarewinder, i, j, options, decodecallback)));
	//   19   44:aload           10
	//   20   46:aload_1         
	//   21   47:iload_3         
	//   22   48:iload           4
	//   23   50:aload_2         
	//   24   51:aload           5
	//   25   53:invokevirtual   #81  <Method Resource DecodePath.decode(DataRewinder, int, int, Options, DecodePath$DecodeCallback)>
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
	//   33   71:invokeinterface #85  <Method boolean List.add(Object)>
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
		if(obj1 != null)
	//*  45   98:aload           10
	//*  46  100:ifnull          106
			return ((Resource) (obj1));
	//   47  103:aload           10
	//   48  105:areturn         
		else
			throw new GlideException(failureMessage, ((List) (new ArrayList(((java.util.Collection) (list))))));
	//   49  106:new             #66  <Class GlideException>
	//   50  109:dup             
	//   51  110:aload_0         
	//   52  111:getfield        #59  <Field String failureMessage>
	//   53  114:new             #87  <Class ArrayList>
	//   54  117:dup             
	//   55  118:aload           6
	//   56  120:invokespecial   #90  <Method void ArrayList(java.util.Collection)>
	//   57  123:invokespecial   #93  <Method void GlideException(String, List)>
	//   58  126:athrow          
	}

	public Resource load(DataRewinder datarewinder, Options options, int i, int j, DecodePath.DecodeCallback decodecallback)
		throws GlideException
	{
		List list = (List)Preconditions.checkNotNull(listPool.acquire());
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field android.support.v4.util.Pools$Pool listPool>
	//    2    4:invokeinterface #104 <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    3    9:invokestatic    #108 <Method Object Preconditions.checkNotNull(Object)>
	//    4   12:checkcast       #33  <Class List>
	//    5   15:astore          6
		datarewinder = ((DataRewinder) (loadWithExceptionList(datarewinder, options, i, j, decodecallback, list)));
	//    6   17:aload_0         
	//    7   18:aload_1         
	//    8   19:aload_2         
	//    9   20:iload_3         
	//   10   21:iload           4
	//   11   23:aload           5
	//   12   25:aload           6
	//   13   27:invokespecial   #110 <Method Resource loadWithExceptionList(DataRewinder, Options, int, int, DecodePath$DecodeCallback, List)>
	//   14   30:astore_1        
		listPool.release(((Object) (list)));
	//   15   31:aload_0         
	//   16   32:getfield        #25  <Field android.support.v4.util.Pools$Pool listPool>
	//   17   35:aload           6
	//   18   37:invokeinterface #113 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   19   42:pop             
		return ((Resource) (datarewinder));
	//   20   43:aload_1         
	//   21   44:areturn         
		datarewinder;
	//   22   45:astore_1        
		listPool.release(((Object) (list)));
	//   23   46:aload_0         
	//   24   47:getfield        #25  <Field android.support.v4.util.Pools$Pool listPool>
	//   25   50:aload           6
	//   26   52:invokeinterface #113 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   27   57:pop             
		throw datarewinder;
	//   28   58:aload_1         
	//   29   59:athrow          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #37  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("LoadPath{decodePaths=");
	//    4    8:aload_1         
	//    5    9:ldc1            #116 <String "LoadPath{decodePaths=">
	//    6   11:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(Arrays.toString(decodePaths.toArray()));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #35  <Field List decodePaths>
	//   11   20:invokeinterface #120 <Method Object[] List.toArray()>
	//   12   25:invokestatic    #125 <Method String Arrays.toString(Object[])>
	//   13   28:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   14   31:pop             
		stringbuilder.append('}');
	//   15   32:aload_1         
	//   16   33:bipush          125
	//   17   35:invokevirtual   #128 <Method StringBuilder StringBuilder.append(char)>
	//   18   38:pop             
		return stringbuilder.toString();
	//   19   39:aload_1         
	//   20   40:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   21   43:areturn         
	}

	private final Class dataClass;
	private final List decodePaths;
	private final String failureMessage;
	private final android.support.v4.util.Pools.Pool listPool;
}
