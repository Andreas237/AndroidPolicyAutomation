// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.bumptech.glide.load.engine:
//			GlideException, Resource

public class DecodePath
{
	static interface DecodeCallback
	{

		public abstract Resource onResourceDecoded(Resource resource);
	}


	public DecodePath(Class class1, Class class2, Class class3, List list, ResourceTranscoder resourcetranscoder, android.support.v4.util.Pools.Pool pool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		dataClass = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field Class dataClass>
		decoders = list;
	//    5    9:aload_0         
	//    6   10:aload           4
	//    7   12:putfield        #34  <Field List decoders>
		transcoder = resourcetranscoder;
	//    8   15:aload_0         
	//    9   16:aload           5
	//   10   18:putfield        #36  <Field ResourceTranscoder transcoder>
		listPool = pool;
	//   11   21:aload_0         
	//   12   22:aload           6
	//   13   24:putfield        #38  <Field android.support.v4.util.Pools$Pool listPool>
		failureMessage = (new StringBuilder()).append("Failed DecodePath{").append(class1.getSimpleName()).append("->").append(class2.getSimpleName()).append("->").append(class3.getSimpleName()).append("}").toString();
	//   14   27:aload_0         
	//   15   28:new             #40  <Class StringBuilder>
	//   16   31:dup             
	//   17   32:invokespecial   #41  <Method void StringBuilder()>
	//   18   35:ldc1            #43  <String "Failed DecodePath{">
	//   19   37:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   20   40:aload_1         
	//   21   41:invokevirtual   #53  <Method String Class.getSimpleName()>
	//   22   44:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   23   47:ldc1            #55  <String "->">
	//   24   49:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:aload_2         
	//   26   53:invokevirtual   #53  <Method String Class.getSimpleName()>
	//   27   56:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   28   59:ldc1            #55  <String "->">
	//   29   61:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   30   64:aload_3         
	//   31   65:invokevirtual   #53  <Method String Class.getSimpleName()>
	//   32   68:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   33   71:ldc1            #57  <String "}">
	//   34   73:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   35   76:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   36   79:putfield        #62  <Field String failureMessage>
	//   37   82:return          
	}

	private Resource decodeResource(DataRewinder datarewinder, int i, int j, Options options)
		throws GlideException
	{
		List list = (List)listPool.acquire();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field android.support.v4.util.Pools$Pool listPool>
	//    2    4:invokeinterface #75  <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    3    9:checkcast       #77  <Class List>
	//    4   12:astore          5
		datarewinder = ((DataRewinder) (decodeResourceWithList(datarewinder, i, j, options, list)));
	//    5   14:aload_0         
	//    6   15:aload_1         
	//    7   16:iload_2         
	//    8   17:iload_3         
	//    9   18:aload           4
	//   10   20:aload           5
	//   11   22:invokespecial   #81  <Method Resource decodeResourceWithList(DataRewinder, int, int, Options, List)>
	//   12   25:astore_1        
		listPool.release(((Object) (list)));
	//   13   26:aload_0         
	//   14   27:getfield        #38  <Field android.support.v4.util.Pools$Pool listPool>
	//   15   30:aload           5
	//   16   32:invokeinterface #85  <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   17   37:pop             
		return ((Resource) (datarewinder));
	//   18   38:aload_1         
	//   19   39:areturn         
		datarewinder;
	//   20   40:astore_1        
		listPool.release(((Object) (list)));
	//   21   41:aload_0         
	//   22   42:getfield        #38  <Field android.support.v4.util.Pools$Pool listPool>
	//   23   45:aload           5
	//   24   47:invokeinterface #85  <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   25   52:pop             
		throw datarewinder;
	//   26   53:aload_1         
	//   27   54:athrow          
	}

	private Resource decodeResourceWithList(DataRewinder datarewinder, int i, int j, Options options, List list)
		throws GlideException
	{
		int k;
		int l;
		Object obj;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          8
		k = 0;
	//    2    3:iconst_0        
	//    3    4:istore          6
		l = decoders.size();
	//    4    6:aload_0         
	//    5    7:getfield        #34  <Field List decoders>
	//    6   10:invokeinterface #93  <Method int List.size()>
	//    7   15:istore          7
_L2:
		Object obj1;
		ResourceDecoder resourcedecoder;
		obj1 = obj;
	//    8   17:aload           8
	//    9   19:astore          9
		if(k >= l)
			break; /* Loop/switch isn't completed */
	//   10   21:iload           6
	//   11   23:iload           7
	//   12   25:icmpge          162
		resourcedecoder = (ResourceDecoder)decoders.get(k);
	//   13   28:aload_0         
	//   14   29:getfield        #34  <Field List decoders>
	//   15   32:iload           6
	//   16   34:invokeinterface #97  <Method Object List.get(int)>
	//   17   39:checkcast       #99  <Class ResourceDecoder>
	//   18   42:astore          10
		obj1 = obj;
	//   19   44:aload           8
	//   20   46:astore          9
		if(resourcedecoder.handles(datarewinder.rewindAndGet(), options))
	//*  21   48:aload           10
	//*  22   50:aload_1         
	//*  23   51:invokeinterface #104 <Method Object DataRewinder.rewindAndGet()>
	//*  24   56:aload           4
	//*  25   58:invokeinterface #108 <Method boolean ResourceDecoder.handles(Object, Options)>
	//*  26   63:ifeq            85
			obj1 = ((Object) (resourcedecoder.decode(datarewinder.rewindAndGet(), i, j, options)));
	//   27   66:aload           10
	//   28   68:aload_1         
	//   29   69:invokeinterface #104 <Method Object DataRewinder.rewindAndGet()>
	//   30   74:iload_2         
	//   31   75:iload_3         
	//   32   76:aload           4
	//   33   78:invokeinterface #112 <Method Resource ResourceDecoder.decode(Object, int, int, Options)>
	//   34   83:astore          9
		obj = obj1;
	//   35   85:aload           9
	//   36   87:astore          8
		break MISSING_BLOCK_LABEL_141;
	//   37   89:goto            141
		obj1;
	//   38   92:astore          9
		if(Log.isLoggable("DecodePath", 2))
	//*  39   94:ldc1            #12  <String "DecodePath">
	//*  40   96:iconst_2        
	//*  41   97:invokestatic    #118 <Method boolean Log.isLoggable(String, int)>
	//*  42  100:ifeq            131
			Log.v("DecodePath", (new StringBuilder()).append("Failed to decode data for ").append(((Object) (resourcedecoder))).toString(), ((Throwable) (obj1)));
	//   43  103:ldc1            #12  <String "DecodePath">
	//   44  105:new             #40  <Class StringBuilder>
	//   45  108:dup             
	//   46  109:invokespecial   #41  <Method void StringBuilder()>
	//   47  112:ldc1            #120 <String "Failed to decode data for ">
	//   48  114:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   49  117:aload           10
	//   50  119:invokevirtual   #123 <Method StringBuilder StringBuilder.append(Object)>
	//   51  122:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   52  125:aload           9
	//   53  127:invokestatic    #127 <Method int Log.v(String, String, Throwable)>
	//   54  130:pop             
		list.add(obj1);
	//   55  131:aload           5
	//   56  133:aload           9
	//   57  135:invokeinterface #130 <Method boolean List.add(Object)>
	//   58  140:pop             
		if(obj != null)
	//*  59  141:aload           8
	//*  60  143:ifnull          153
		{
			obj1 = obj;
	//   61  146:aload           8
	//   62  148:astore          9
			break; /* Loop/switch isn't completed */
	//   63  150:goto            162
		}
		k++;
	//   64  153:iload           6
	//   65  155:iconst_1        
	//   66  156:iadd            
	//   67  157:istore          6
		if(true) goto _L2; else goto _L1
	//   68  159:goto            17
_L1:
		if(obj1 == null)
	//*  69  162:aload           9
	//*  70  164:ifnonnull       188
			throw new GlideException(failureMessage, ((List) (new ArrayList(((java.util.Collection) (list))))));
	//   71  167:new             #69  <Class GlideException>
	//   72  170:dup             
	//   73  171:aload_0         
	//   74  172:getfield        #62  <Field String failureMessage>
	//   75  175:new             #132 <Class ArrayList>
	//   76  178:dup             
	//   77  179:aload           5
	//   78  181:invokespecial   #135 <Method void ArrayList(java.util.Collection)>
	//   79  184:invokespecial   #138 <Method void GlideException(String, List)>
	//   80  187:athrow          
		else
			return ((Resource) (obj1));
	//   81  188:aload           9
	//   82  190:areturn         
	}

	public Resource decode(DataRewinder datarewinder, int i, int j, Options options, DecodeCallback decodecallback)
		throws GlideException
	{
		datarewinder = ((DataRewinder) (decodecallback.onResourceDecoded(decodeResource(datarewinder, i, j, options))));
	//    0    0:aload           5
	//    1    2:aload_0         
	//    2    3:aload_1         
	//    3    4:iload_2         
	//    4    5:iload_3         
	//    5    6:aload           4
	//    6    8:invokespecial   #142 <Method Resource decodeResource(DataRewinder, int, int, Options)>
	//    7   11:invokeinterface #146 <Method Resource DecodePath$DecodeCallback.onResourceDecoded(Resource)>
	//    8   16:astore_1        
		return transcoder.transcode(((Resource) (datarewinder)));
	//    9   17:aload_0         
	//   10   18:getfield        #36  <Field ResourceTranscoder transcoder>
	//   11   21:aload_1         
	//   12   22:invokeinterface #151 <Method Resource ResourceTranscoder.transcode(Resource)>
	//   13   27:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("DecodePath{ dataClass=").append(((Object) (dataClass))).append(", decoders=").append(((Object) (decoders))).append(", transcoder=").append(((Object) (transcoder))).append('}').toString();
	//    0    0:new             #40  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void StringBuilder()>
	//    3    7:ldc1            #154 <String "DecodePath{ dataClass=">
	//    4    9:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #32  <Field Class dataClass>
	//    7   16:invokevirtual   #123 <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #156 <String ", decoders=">
	//    9   21:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #34  <Field List decoders>
	//   12   28:invokevirtual   #123 <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:ldc1            #158 <String ", transcoder=">
	//   14   33:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #36  <Field ResourceTranscoder transcoder>
	//   17   40:invokevirtual   #123 <Method StringBuilder StringBuilder.append(Object)>
	//   18   43:bipush          125
	//   19   45:invokevirtual   #161 <Method StringBuilder StringBuilder.append(char)>
	//   20   48:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   21   51:areturn         
	}

	private static final String TAG = "DecodePath";
	private final Class dataClass;
	private final List decoders;
	private final String failureMessage;
	private final android.support.v4.util.Pools.Pool listPool;
	private final ResourceTranscoder transcoder;
}
