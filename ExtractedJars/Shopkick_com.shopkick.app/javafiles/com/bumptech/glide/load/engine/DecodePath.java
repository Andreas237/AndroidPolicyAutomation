// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.util.Preconditions;
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
		list = ((List) (new StringBuilder()));
	//   14   27:new             #40  <Class StringBuilder>
	//   15   30:dup             
	//   16   31:invokespecial   #41  <Method void StringBuilder()>
	//   17   34:astore          4
		((StringBuilder) (list)).append("Failed DecodePath{");
	//   18   36:aload           4
	//   19   38:ldc1            #43  <String "Failed DecodePath{">
	//   20   40:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   21   43:pop             
		((StringBuilder) (list)).append(class1.getSimpleName());
	//   22   44:aload           4
	//   23   46:aload_1         
	//   24   47:invokevirtual   #53  <Method String Class.getSimpleName()>
	//   25   50:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   26   53:pop             
		((StringBuilder) (list)).append("->");
	//   27   54:aload           4
	//   28   56:ldc1            #55  <String "->">
	//   29   58:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   30   61:pop             
		((StringBuilder) (list)).append(class2.getSimpleName());
	//   31   62:aload           4
	//   32   64:aload_2         
	//   33   65:invokevirtual   #53  <Method String Class.getSimpleName()>
	//   34   68:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   35   71:pop             
		((StringBuilder) (list)).append("->");
	//   36   72:aload           4
	//   37   74:ldc1            #55  <String "->">
	//   38   76:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   39   79:pop             
		((StringBuilder) (list)).append(class3.getSimpleName());
	//   40   80:aload           4
	//   41   82:aload_3         
	//   42   83:invokevirtual   #53  <Method String Class.getSimpleName()>
	//   43   86:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   44   89:pop             
		((StringBuilder) (list)).append("}");
	//   45   90:aload           4
	//   46   92:ldc1            #57  <String "}">
	//   47   94:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   48   97:pop             
		failureMessage = ((StringBuilder) (list)).toString();
	//   49   98:aload_0         
	//   50   99:aload           4
	//   51  101:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   52  104:putfield        #62  <Field String failureMessage>
	//   53  107:return          
	}

	private Resource decodeResource(DataRewinder datarewinder, int i, int j, Options options)
		throws GlideException
	{
		List list = (List)Preconditions.checkNotNull(listPool.acquire());
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field android.support.v4.util.Pools$Pool listPool>
	//    2    4:invokeinterface #76  <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    3    9:invokestatic    #82  <Method Object Preconditions.checkNotNull(Object)>
	//    4   12:checkcast       #84  <Class List>
	//    5   15:astore          5
		datarewinder = ((DataRewinder) (decodeResourceWithList(datarewinder, i, j, options, list)));
	//    6   17:aload_0         
	//    7   18:aload_1         
	//    8   19:iload_2         
	//    9   20:iload_3         
	//   10   21:aload           4
	//   11   23:aload           5
	//   12   25:invokespecial   #88  <Method Resource decodeResourceWithList(DataRewinder, int, int, Options, List)>
	//   13   28:astore_1        
		listPool.release(((Object) (list)));
	//   14   29:aload_0         
	//   15   30:getfield        #38  <Field android.support.v4.util.Pools$Pool listPool>
	//   16   33:aload           5
	//   17   35:invokeinterface #92  <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   18   40:pop             
		return ((Resource) (datarewinder));
	//   19   41:aload_1         
	//   20   42:areturn         
		datarewinder;
	//   21   43:astore_1        
		listPool.release(((Object) (list)));
	//   22   44:aload_0         
	//   23   45:getfield        #38  <Field android.support.v4.util.Pools$Pool listPool>
	//   24   48:aload           5
	//   25   50:invokeinterface #92  <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   26   55:pop             
		throw datarewinder;
	//   27   56:aload_1         
	//   28   57:athrow          
	}

	private Resource decodeResourceWithList(DataRewinder datarewinder, int i, int j, Options options, List list)
		throws GlideException
	{
		int l = decoders.size();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field List decoders>
	//    2    4:invokeinterface #106 <Method int List.size()>
	//    3    9:istore          7
		Object obj = null;
	//    4   11:aconst_null     
	//    5   12:astore          8
		int k = 0;
	//    6   14:iconst_0        
	//    7   15:istore          6
		Object obj1;
label0:
		do
		{
label1:
			{
				obj1 = obj;
	//    8   17:aload           8
	//    9   19:astore          9
				if(k >= l)
					break label0;
	//   10   21:iload           6
	//   11   23:iload           7
	//   12   25:icmpge          182
				ResourceDecoder resourcedecoder = (ResourceDecoder)decoders.get(k);
	//   13   28:aload_0         
	//   14   29:getfield        #34  <Field List decoders>
	//   15   32:iload           6
	//   16   34:invokeinterface #110 <Method Object List.get(int)>
	//   17   39:checkcast       #112 <Class ResourceDecoder>
	//   18   42:astore          10
				obj1 = obj;
	//   19   44:aload           8
	//   20   46:astore          9
				try
				{
					if(resourcedecoder.handles(datarewinder.rewindAndGet(), options))
	//*  21   48:aload           10
	//*  22   50:aload_1         
	//*  23   51:invokeinterface #117 <Method Object DataRewinder.rewindAndGet()>
	//*  24   56:aload           4
	//*  25   58:invokeinterface #121 <Method boolean ResourceDecoder.handles(Object, Options)>
	//*  26   63:ifeq            161
						obj1 = ((Object) (resourcedecoder.decode(datarewinder.rewindAndGet(), i, j, options)));
	//   27   66:aload           10
	//   28   68:aload_1         
	//   29   69:invokeinterface #117 <Method Object DataRewinder.rewindAndGet()>
	//   30   74:iload_2         
	//   31   75:iload_3         
	//   32   76:aload           4
	//   33   78:invokeinterface #125 <Method Resource ResourceDecoder.decode(Object, int, int, Options)>
	//   34   83:astore          9
					break label1;
	//   35   85:goto            161
				}
	//*  36   88:astore          9
	//*  37   90:goto            100
	//*  38   93:astore          9
	//*  39   95:goto            100
				// Misplaced declaration of an exception variable
				catch(Object obj1) { }
	//   40   98:astore          9
				// Misplaced declaration of an exception variable
				catch(Object obj1) { }
				// Misplaced declaration of an exception variable
				catch(Object obj1) { }
				if(Log.isLoggable("DecodePath", 2))
	//*  41  100:ldc1            #12  <String "DecodePath">
	//*  42  102:iconst_2        
	//*  43  103:invokestatic    #131 <Method boolean Log.isLoggable(String, int)>
	//*  44  106:ifeq            147
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   45  109:new             #40  <Class StringBuilder>
	//   46  112:dup             
	//   47  113:invokespecial   #41  <Method void StringBuilder()>
	//   48  116:astore          11
					stringbuilder.append("Failed to decode data for ");
	//   49  118:aload           11
	//   50  120:ldc1            #133 <String "Failed to decode data for ">
	//   51  122:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   52  125:pop             
					stringbuilder.append(((Object) (resourcedecoder)));
	//   53  126:aload           11
	//   54  128:aload           10
	//   55  130:invokevirtual   #136 <Method StringBuilder StringBuilder.append(Object)>
	//   56  133:pop             
					Log.v("DecodePath", stringbuilder.toString(), ((Throwable) (obj1)));
	//   57  134:ldc1            #12  <String "DecodePath">
	//   58  136:aload           11
	//   59  138:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   60  141:aload           9
	//   61  143:invokestatic    #140 <Method int Log.v(String, String, Throwable)>
	//   62  146:pop             
				}
				list.add(obj1);
	//   63  147:aload           5
	//   64  149:aload           9
	//   65  151:invokeinterface #143 <Method boolean List.add(Object)>
	//   66  156:pop             
				obj1 = obj;
	//   67  157:aload           8
	//   68  159:astore          9
			}
			if(obj1 != null)
	//*  69  161:aload           9
	//*  70  163:ifnull          169
				break;
	//   71  166:goto            182
			k++;
	//   72  169:iload           6
	//   73  171:iconst_1        
	//   74  172:iadd            
	//   75  173:istore          6
			obj = obj1;
	//   76  175:aload           9
	//   77  177:astore          8
		} while(true);
	//   78  179:goto            17
		if(obj1 != null)
	//*  79  182:aload           9
	//*  80  184:ifnull          190
			return ((Resource) (obj1));
	//   81  187:aload           9
	//   82  189:areturn         
		else
			throw new GlideException(failureMessage, ((List) (new ArrayList(((java.util.Collection) (list))))));
	//   83  190:new             #69  <Class GlideException>
	//   84  193:dup             
	//   85  194:aload_0         
	//   86  195:getfield        #62  <Field String failureMessage>
	//   87  198:new             #145 <Class ArrayList>
	//   88  201:dup             
	//   89  202:aload           5
	//   90  204:invokespecial   #148 <Method void ArrayList(java.util.Collection)>
	//   91  207:invokespecial   #151 <Method void GlideException(String, List)>
	//   92  210:athrow          
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
	//    6    8:invokespecial   #155 <Method Resource decodeResource(DataRewinder, int, int, Options)>
	//    7   11:invokeinterface #159 <Method Resource DecodePath$DecodeCallback.onResourceDecoded(Resource)>
	//    8   16:astore_1        
		return transcoder.transcode(((Resource) (datarewinder)), options);
	//    9   17:aload_0         
	//   10   18:getfield        #36  <Field ResourceTranscoder transcoder>
	//   11   21:aload_1         
	//   12   22:aload           4
	//   13   24:invokeinterface #165 <Method Resource ResourceTranscoder.transcode(Resource, Options)>
	//   14   29:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #40  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("DecodePath{ dataClass=");
	//    4    8:aload_1         
	//    5    9:ldc1            #168 <String "DecodePath{ dataClass=">
	//    6   11:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (dataClass)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #32  <Field Class dataClass>
	//   11   20:invokevirtual   #136 <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", decoders=");
	//   13   24:aload_1         
	//   14   25:ldc1            #170 <String ", decoders=">
	//   15   27:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(((Object) (decoders)));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #34  <Field List decoders>
	//   20   36:invokevirtual   #136 <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		stringbuilder.append(", transcoder=");
	//   22   40:aload_1         
	//   23   41:ldc1            #172 <String ", transcoder=">
	//   24   43:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(((Object) (transcoder)));
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #36  <Field ResourceTranscoder transcoder>
	//   29   52:invokevirtual   #136 <Method StringBuilder StringBuilder.append(Object)>
	//   30   55:pop             
		stringbuilder.append('}');
	//   31   56:aload_1         
	//   32   57:bipush          125
	//   33   59:invokevirtual   #175 <Method StringBuilder StringBuilder.append(char)>
	//   34   62:pop             
		return stringbuilder.toString();
	//   35   63:aload_1         
	//   36   64:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   37   67:areturn         
	}

	private static final String TAG = "DecodePath";
	private final Class dataClass;
	private final List decoders;
	private final String failureMessage;
	private final android.support.v4.util.Pools.Pool listPool;
	private final ResourceTranscoder transcoder;
}
