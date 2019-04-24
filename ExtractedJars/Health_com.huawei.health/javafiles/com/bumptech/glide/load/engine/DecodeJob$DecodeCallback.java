// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.*;

// Referenced classes of package com.bumptech.glide.load.engine:
//			DecodeJob, Resource, DecodeHelper, DiskCacheStrategy, 
//			DataCacheKey, ResourceCacheKey, LockedResource

final class DecodeJob$DecodeCallback
	implements 
{

	private Class getResourceClass(Resource resource)
	{
		return resource.get().getClass();
	//    0    0:aload_1         
	//    1    1:invokeinterface #32  <Method Object Resource.get()>
	//    2    6:invokevirtual   #36  <Method Class Object.getClass()>
	//    3    9:areturn         
	}

	public Resource onResourceDecoded(Resource resource)
	{
		Class class1 = getResourceClass(resource);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #42  <Method Class getResourceClass(Resource)>
	//    3    5:astore          7
		Object obj = null;
	//    4    7:aconst_null     
	//    5    8:astore          4
		Resource resource1 = resource;
	//    6   10:aload_1         
	//    7   11:astore_3        
		if(dataSource != DataSource.RESOURCE_DISK_CACHE)
	//*   8   12:aload_0         
	//*   9   13:getfield        #23  <Field DataSource dataSource>
	//*  10   16:getstatic       #47  <Field DataSource DataSource.RESOURCE_DISK_CACHE>
	//*  11   19:if_acmpeq       66
		{
			obj = ((Object) (decodeHelper.getTransformation(class1)));
	//   12   22:aload_0         
	//   13   23:getfield        #18  <Field DecodeJob this$0>
	//   14   26:getfield        #51  <Field DecodeHelper DecodeJob.decodeHelper>
	//   15   29:aload           7
	//   16   31:invokevirtual   #57  <Method Transformation DecodeHelper.getTransformation(Class)>
	//   17   34:astore          4
			resource1 = ((Transformation) (obj)).transform(((android.content.Context) (DecodeJob.access$000(DecodeJob.this))), resource, width, height);
	//   18   36:aload           4
	//   19   38:aload_0         
	//   20   39:getfield        #18  <Field DecodeJob this$0>
	//   21   42:invokestatic    #61  <Method com.bumptech.glide.GlideContext DecodeJob.access$000(DecodeJob)>
	//   22   45:aload_1         
	//   23   46:aload_0         
	//   24   47:getfield        #18  <Field DecodeJob this$0>
	//   25   50:getfield        #65  <Field int DecodeJob.width>
	//   26   53:aload_0         
	//   27   54:getfield        #18  <Field DecodeJob this$0>
	//   28   57:getfield        #68  <Field int DecodeJob.height>
	//   29   60:invokeinterface #74  <Method Resource Transformation.transform(android.content.Context, Resource, int, int)>
	//   30   65:astore_3        
		}
		if(!((Object) (resource)).equals(((Object) (resource1))))
	//*  31   66:aload_1         
	//*  32   67:aload_3         
	//*  33   68:invokevirtual   #78  <Method boolean Object.equals(Object)>
	//*  34   71:ifne            80
			resource.recycle();
	//   35   74:aload_1         
	//   36   75:invokeinterface #81  <Method void Resource.recycle()>
		EncodeStrategy encodestrategy;
		if(decodeHelper.isResourceEncoderAvailable(resource1))
	//*  37   80:aload_0         
	//*  38   81:getfield        #18  <Field DecodeJob this$0>
	//*  39   84:getfield        #51  <Field DecodeHelper DecodeJob.decodeHelper>
	//*  40   87:aload_3         
	//*  41   88:invokevirtual   #85  <Method boolean DecodeHelper.isResourceEncoderAvailable(Resource)>
	//*  42   91:ifeq            124
		{
			resource = ((Resource) (decodeHelper.getResultEncoder(resource1)));
	//   43   94:aload_0         
	//   44   95:getfield        #18  <Field DecodeJob this$0>
	//   45   98:getfield        #51  <Field DecodeHelper DecodeJob.decodeHelper>
	//   46  101:aload_3         
	//   47  102:invokevirtual   #89  <Method ResourceEncoder DecodeHelper.getResultEncoder(Resource)>
	//   48  105:astore_1        
			encodestrategy = ((ResourceEncoder) (resource)).getEncodeStrategy(options);
	//   49  106:aload_1         
	//   50  107:aload_0         
	//   51  108:getfield        #18  <Field DecodeJob this$0>
	//   52  111:getfield        #93  <Field com.bumptech.glide.load.Options DecodeJob.options>
	//   53  114:invokeinterface #99  <Method EncodeStrategy ResourceEncoder.getEncodeStrategy(com.bumptech.glide.load.Options)>
	//   54  119:astore          5
		} else
	//*  55  121:goto            131
		{
			resource = null;
	//   56  124:aconst_null     
	//   57  125:astore_1        
			encodestrategy = EncodeStrategy.NONE;
	//   58  126:getstatic       #105 <Field EncodeStrategy EncodeStrategy.NONE>
	//   59  129:astore          5
		}
		Object obj1 = ((Object) (resource1));
	//   60  131:aload_3         
	//   61  132:astore          6
		boolean flag;
		if(!decodeHelper.isSourceKey(currentSourceKey))
	//*  62  134:aload_0         
	//*  63  135:getfield        #18  <Field DecodeJob this$0>
	//*  64  138:getfield        #51  <Field DecodeHelper DecodeJob.decodeHelper>
	//*  65  141:aload_0         
	//*  66  142:getfield        #18  <Field DecodeJob this$0>
	//*  67  145:getfield        #109 <Field com.bumptech.glide.load.Key DecodeJob.currentSourceKey>
	//*  68  148:invokevirtual   #113 <Method boolean DecodeHelper.isSourceKey(com.bumptech.glide.load.Key)>
	//*  69  151:ifne            159
			flag = true;
	//   70  154:iconst_1        
	//   71  155:istore_2        
		else
	//*  72  156:goto            161
			flag = false;
	//   73  159:iconst_0        
	//   74  160:istore_2        
		if(diskCacheStrategy.isResourceCacheable(flag, dataSource, encodestrategy))
	//*  75  161:aload_0         
	//*  76  162:getfield        #18  <Field DecodeJob this$0>
	//*  77  165:getfield        #117 <Field DiskCacheStrategy DecodeJob.diskCacheStrategy>
	//*  78  168:iload_2         
	//*  79  169:aload_0         
	//*  80  170:getfield        #23  <Field DataSource dataSource>
	//*  81  173:aload           5
	//*  82  175:invokevirtual   #123 <Method boolean DiskCacheStrategy.isResourceCacheable(boolean, DataSource, EncodeStrategy)>
	//*  83  178:ifeq            344
		{
			if(resource == null)
	//*  84  181:aload_1         
	//*  85  182:ifnonnull       202
				throw new com.bumptech.glide.vailableException(resource1.get().getClass());
	//   86  185:new             #125 <Class com.bumptech.glide.Registry$NoResultEncoderAvailableException>
	//   87  188:dup             
	//   88  189:aload_3         
	//   89  190:invokeinterface #32  <Method Object Resource.get()>
	//   90  195:invokevirtual   #36  <Method Class Object.getClass()>
	//   91  198:invokespecial   #128 <Method void com.bumptech.glide.Registry$NoResultEncoderAvailableException(Class)>
	//   92  201:athrow          
			if(encodestrategy == EncodeStrategy.SOURCE)
	//*  93  202:aload           5
	//*  94  204:getstatic       #131 <Field EncodeStrategy EncodeStrategy.SOURCE>
	//*  95  207:if_acmpne       236
				obj = ((Object) (new DataCacheKey(currentSourceKey, signature)));
	//   96  210:new             #133 <Class DataCacheKey>
	//   97  213:dup             
	//   98  214:aload_0         
	//   99  215:getfield        #18  <Field DecodeJob this$0>
	//  100  218:getfield        #109 <Field com.bumptech.glide.load.Key DecodeJob.currentSourceKey>
	//  101  221:aload_0         
	//  102  222:getfield        #18  <Field DecodeJob this$0>
	//  103  225:getfield        #136 <Field com.bumptech.glide.load.Key DecodeJob.signature>
	//  104  228:invokespecial   #139 <Method void DataCacheKey(com.bumptech.glide.load.Key, com.bumptech.glide.load.Key)>
	//  105  231:astore          4
			else
	//* 106  233:goto            323
			if(encodestrategy == EncodeStrategy.TRANSFORMED)
	//* 107  236:aload           5
	//* 108  238:getstatic       #142 <Field EncodeStrategy EncodeStrategy.TRANSFORMED>
	//* 109  241:if_acmpne       295
				obj = ((Object) (new ResourceCacheKey(currentSourceKey, signature, width, height, ((Transformation) (obj)), class1, options)));
	//  110  244:new             #144 <Class ResourceCacheKey>
	//  111  247:dup             
	//  112  248:aload_0         
	//  113  249:getfield        #18  <Field DecodeJob this$0>
	//  114  252:getfield        #109 <Field com.bumptech.glide.load.Key DecodeJob.currentSourceKey>
	//  115  255:aload_0         
	//  116  256:getfield        #18  <Field DecodeJob this$0>
	//  117  259:getfield        #136 <Field com.bumptech.glide.load.Key DecodeJob.signature>
	//  118  262:aload_0         
	//  119  263:getfield        #18  <Field DecodeJob this$0>
	//  120  266:getfield        #65  <Field int DecodeJob.width>
	//  121  269:aload_0         
	//  122  270:getfield        #18  <Field DecodeJob this$0>
	//  123  273:getfield        #68  <Field int DecodeJob.height>
	//  124  276:aload           4
	//  125  278:aload           7
	//  126  280:aload_0         
	//  127  281:getfield        #18  <Field DecodeJob this$0>
	//  128  284:getfield        #93  <Field com.bumptech.glide.load.Options DecodeJob.options>
	//  129  287:invokespecial   #147 <Method void ResourceCacheKey(com.bumptech.glide.load.Key, com.bumptech.glide.load.Key, int, int, Transformation, Class, com.bumptech.glide.load.Options)>
	//  130  290:astore          4
			else
	//* 131  292:goto            323
				throw new IllegalArgumentException((new StringBuilder()).append("Unknown strategy: ").append(((Object) (encodestrategy))).toString());
	//  132  295:new             #149 <Class IllegalArgumentException>
	//  133  298:dup             
	//  134  299:new             #151 <Class StringBuilder>
	//  135  302:dup             
	//  136  303:invokespecial   #152 <Method void StringBuilder()>
	//  137  306:ldc1            #154 <String "Unknown strategy: ">
	//  138  308:invokevirtual   #158 <Method StringBuilder StringBuilder.append(String)>
	//  139  311:aload           5
	//  140  313:invokevirtual   #161 <Method StringBuilder StringBuilder.append(Object)>
	//  141  316:invokevirtual   #165 <Method String StringBuilder.toString()>
	//  142  319:invokespecial   #168 <Method void IllegalArgumentException(String)>
	//  143  322:athrow          
			obj1 = ((Object) (LockedResource.obtain(resource1)));
	//  144  323:aload_3         
	//  145  324:invokestatic    #174 <Method LockedResource LockedResource.obtain(Resource)>
	//  146  327:astore          6
			deferredEncodeManager.init(((com.bumptech.glide.load.Key) (obj)), ((ResourceEncoder) (resource)), ((LockedResource) (obj1)));
	//  147  329:aload_0         
	//  148  330:getfield        #18  <Field DecodeJob this$0>
	//  149  333:getfield        #178 <Field DecodeJob$DeferredEncodeManager DecodeJob.deferredEncodeManager>
	//  150  336:aload           4
	//  151  338:aload_1         
	//  152  339:aload           6
	//  153  341:invokevirtual   #184 <Method void DecodeJob$DeferredEncodeManager.init(com.bumptech.glide.load.Key, ResourceEncoder, LockedResource)>
		}
		return ((Resource) (obj1));
	//  154  344:aload           6
	//  155  346:areturn         
	}

	private final DataSource dataSource;
	final DecodeJob this$0;

	DecodeJob$DecodeCallback(DataSource datasource)
	{
		this$0 = DecodeJob.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field DecodeJob this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		dataSource = datasource;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field DataSource dataSource>
	//    8   14:return          
	}
}
