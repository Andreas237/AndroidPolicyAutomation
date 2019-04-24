// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.prefill.BitmapPreFiller;
import com.bumptech.glide.load.model.ByteBufferEncoder;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.StreamEncoder;
import com.bumptech.glide.load.resource.bitmap.BitmapDrawableDecoder;
import com.bumptech.glide.load.resource.bitmap.BitmapDrawableEncoder;
import com.bumptech.glide.load.resource.bitmap.BitmapEncoder;
import com.bumptech.glide.load.resource.bitmap.ByteBufferBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.StreamBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.VideoBitmapDecoder;
import com.bumptech.glide.load.resource.file.FileDecoder;
import com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.GifDrawableEncoder;
import com.bumptech.glide.load.resource.gif.GifFrameResourceDecoder;
import com.bumptech.glide.load.resource.gif.StreamGifDecoder;
import com.bumptech.glide.load.resource.transcode.BitmapBytesTranscoder;
import com.bumptech.glide.load.resource.transcode.BitmapDrawableTranscoder;
import com.bumptech.glide.load.resource.transcode.GifDrawableBytesTranscoder;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.module.GlideModule;
import com.bumptech.glide.module.ManifestParser;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.ImageViewTargetFactory;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.bumptech.glide:
//			MemoryCategory, Registry, GlideContext, GeneratedAppGlideModule, 
//			GlideBuilder, RequestManager

public class Glide
	implements ComponentCallbacks2
{

	Glide(Context context, Engine engine1, MemoryCache memorycache, BitmapPool bitmappool, ArrayPool arraypool, RequestManagerRetriever requestmanagerretriever, ConnectivityMonitorFactory connectivitymonitorfactory, 
			int i, RequestOptions requestoptions, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #51  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #52  <Method void ArrayList()>
	//    6   12:putfield        #54  <Field List managers>
		memoryCategory = MemoryCategory.NORMAL;
	//    7   15:aload_0         
	//    8   16:getstatic       #59  <Field MemoryCategory MemoryCategory.NORMAL>
	//    9   19:putfield        #61  <Field MemoryCategory memoryCategory>
		engine = engine1;
	//   10   22:aload_0         
	//   11   23:aload_2         
	//   12   24:putfield        #63  <Field Engine engine>
		bitmapPool = bitmappool;
	//   13   27:aload_0         
	//   14   28:aload           4
	//   15   30:putfield        #65  <Field BitmapPool bitmapPool>
		arrayPool = arraypool;
	//   16   33:aload_0         
	//   17   34:aload           5
	//   18   36:putfield        #67  <Field ArrayPool arrayPool>
		memoryCache = memorycache;
	//   19   39:aload_0         
	//   20   40:aload_3         
	//   21   41:putfield        #69  <Field MemoryCache memoryCache>
		requestManagerRetriever = requestmanagerretriever;
	//   22   44:aload_0         
	//   23   45:aload           6
	//   24   47:putfield        #71  <Field RequestManagerRetriever requestManagerRetriever>
		connectivityMonitorFactory = connectivitymonitorfactory;
	//   25   50:aload_0         
	//   26   51:aload           7
	//   27   53:putfield        #73  <Field ConnectivityMonitorFactory connectivityMonitorFactory>
		bitmapPreFiller = new BitmapPreFiller(memorycache, bitmappool, (DecodeFormat)requestoptions.getOptions().get(Downsampler.DECODE_FORMAT));
	//   28   56:aload_0         
	//   29   57:new             #75  <Class BitmapPreFiller>
	//   30   60:dup             
	//   31   61:aload_3         
	//   32   62:aload           4
	//   33   64:aload           9
	//   34   66:invokevirtual   #81  <Method Options RequestOptions.getOptions()>
	//   35   69:getstatic       #87  <Field com.bumptech.glide.load.Option Downsampler.DECODE_FORMAT>
	//   36   72:invokevirtual   #93  <Method Object Options.get(com.bumptech.glide.load.Option)>
	//   37   75:checkcast       #95  <Class DecodeFormat>
	//   38   78:invokespecial   #98  <Method void BitmapPreFiller(MemoryCache, BitmapPool, DecodeFormat)>
	//   39   81:putfield        #100 <Field BitmapPreFiller bitmapPreFiller>
		memorycache = ((MemoryCache) (context.getResources()));
	//   40   84:aload_1         
	//   41   85:invokevirtual   #106 <Method Resources Context.getResources()>
	//   42   88:astore_3        
	//   43   89:aload_0         
	//   44   90:new             #108 <Class Registry>
	//   45   93:dup             
	//   46   94:invokespecial   #109 <Method void Registry()>
	//   47   97:putfield        #111 <Field Registry registry>
		registry.register(((com.bumptech.glide.load.ImageHeaderParser) (new DefaultImageHeaderParser())));
	//   48  100:aload_0         
	//   49  101:getfield        #111 <Field Registry registry>
	//   50  104:new             #113 <Class DefaultImageHeaderParser>
	//   51  107:dup             
	//   52  108:invokespecial   #114 <Method void DefaultImageHeaderParser()>
	//   53  111:invokevirtual   #118 <Method Registry Registry.register(com.bumptech.glide.load.ImageHeaderParser)>
	//   54  114:pop             
		requestmanagerretriever = ((RequestManagerRetriever) (new Downsampler(registry.getImageHeaderParsers(), ((Resources) (memorycache)).getDisplayMetrics(), bitmappool, arraypool)));
	//   55  115:new             #83  <Class Downsampler>
	//   56  118:dup             
	//   57  119:aload_0         
	//   58  120:getfield        #111 <Field Registry registry>
	//   59  123:invokevirtual   #122 <Method List Registry.getImageHeaderParsers()>
	//   60  126:aload_3         
	//   61  127:invokevirtual   #128 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   62  130:aload           4
	//   63  132:aload           5
	//   64  134:invokespecial   #131 <Method void Downsampler(List, android.util.DisplayMetrics, BitmapPool, ArrayPool)>
	//   65  137:astore          6
		connectivitymonitorfactory = ((ConnectivityMonitorFactory) (new ByteBufferGifDecoder(context, registry.getImageHeaderParsers(), bitmappool, arraypool)));
	//   66  139:new             #133 <Class ByteBufferGifDecoder>
	//   67  142:dup             
	//   68  143:aload_1         
	//   69  144:aload_0         
	//   70  145:getfield        #111 <Field Registry registry>
	//   71  148:invokevirtual   #122 <Method List Registry.getImageHeaderParsers()>
	//   72  151:aload           4
	//   73  153:aload           5
	//   74  155:invokespecial   #136 <Method void ByteBufferGifDecoder(Context, List, BitmapPool, ArrayPool)>
	//   75  158:astore          7
		registry.register(java/nio/ByteBuffer, ((com.bumptech.glide.load.Encoder) (new ByteBufferEncoder()))).register(java/io/InputStream, ((com.bumptech.glide.load.Encoder) (new StreamEncoder(arraypool)))).append(java/nio/ByteBuffer, android/graphics/Bitmap, ((com.bumptech.glide.load.ResourceDecoder) (new ByteBufferBitmapDecoder(((Downsampler) (requestmanagerretriever)))))).append(java/io/InputStream, android/graphics/Bitmap, ((com.bumptech.glide.load.ResourceDecoder) (new StreamBitmapDecoder(((Downsampler) (requestmanagerretriever)), arraypool)))).append(android/os/ParcelFileDescriptor, android/graphics/Bitmap, ((com.bumptech.glide.load.ResourceDecoder) (new VideoBitmapDecoder(bitmappool)))).register(android/graphics/Bitmap, ((com.bumptech.glide.load.ResourceEncoder) (new BitmapEncoder()))).append(java/nio/ByteBuffer, android/graphics/drawable/BitmapDrawable, ((com.bumptech.glide.load.ResourceDecoder) (new BitmapDrawableDecoder(((Resources) (memorycache)), bitmappool, ((com.bumptech.glide.load.ResourceDecoder) (new ByteBufferBitmapDecoder(((Downsampler) (requestmanagerretriever))))))))).append(java/io/InputStream, android/graphics/drawable/BitmapDrawable, ((com.bumptech.glide.load.ResourceDecoder) (new BitmapDrawableDecoder(((Resources) (memorycache)), bitmappool, ((com.bumptech.glide.load.ResourceDecoder) (new StreamBitmapDecoder(((Downsampler) (requestmanagerretriever)), arraypool))))))).append(android/os/ParcelFileDescriptor, android/graphics/drawable/BitmapDrawable, ((com.bumptech.glide.load.ResourceDecoder) (new BitmapDrawableDecoder(((Resources) (memorycache)), bitmappool, ((com.bumptech.glide.load.ResourceDecoder) (new VideoBitmapDecoder(bitmappool))))))).register(android/graphics/drawable/BitmapDrawable, ((com.bumptech.glide.load.ResourceEncoder) (new BitmapDrawableEncoder(bitmappool, ((com.bumptech.glide.load.ResourceEncoder) (new BitmapEncoder())))))).prepend(java/io/InputStream, com/bumptech/glide/load/resource/gif/GifDrawable, ((com.bumptech.glide.load.ResourceDecoder) (new StreamGifDecoder(registry.getImageHeaderParsers(), ((com.bumptech.glide.load.ResourceDecoder) (connectivitymonitorfactory)), arraypool)))).prepend(java/nio/ByteBuffer, com/bumptech/glide/load/resource/gif/GifDrawable, ((com.bumptech.glide.load.ResourceDecoder) (connectivitymonitorfactory))).register(com/bumptech/glide/load/resource/gif/GifDrawable, ((com.bumptech.glide.load.ResourceEncoder) (new GifDrawableEncoder()))).append(com/bumptech/glide/gifdecoder/GifDecoder, com/bumptech/glide/gifdecoder/GifDecoder, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.UnitModelLoader.Factory()))).append(com/bumptech/glide/gifdecoder/GifDecoder, android/graphics/Bitmap, ((com.bumptech.glide.load.ResourceDecoder) (new GifFrameResourceDecoder(bitmappool)))).register(((com.bumptech.glide.load.data.DataRewinder.Factory) (new com.bumptech.glide.load.resource.bytes.ByteBufferRewinder.Factory()))).append(java/io/File, java/nio/ByteBuffer, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.ByteBufferFileLoader.Factory()))).append(java/io/File, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.FileLoader.StreamFactory()))).append(java/io/File, java/io/File, ((com.bumptech.glide.load.ResourceDecoder) (new FileDecoder()))).append(java/io/File, android/os/ParcelFileDescriptor, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.FileLoader.FileDescriptorFactory()))).append(java/io/File, java/io/File, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.UnitModelLoader.Factory()))).register(((com.bumptech.glide.load.data.DataRewinder.Factory) (new com.bumptech.glide.load.data.InputStreamRewinder.Factory(arraypool)))).append(Integer.TYPE, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.ResourceLoader.StreamFactory(((Resources) (memorycache)))))).append(Integer.TYPE, android/os/ParcelFileDescriptor, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.ResourceLoader.FileDescriptorFactory(((Resources) (memorycache)))))).append(java/lang/Integer, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.ResourceLoader.StreamFactory(((Resources) (memorycache)))))).append(java/lang/Integer, android/os/ParcelFileDescriptor, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.ResourceLoader.FileDescriptorFactory(((Resources) (memorycache)))))).append(java/lang/String, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.DataUrlLoader.StreamFactory()))).append(java/lang/String, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.StringLoader.StreamFactory()))).append(java/lang/String, android/os/ParcelFileDescriptor, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.StringLoader.FileDescriptorFactory()))).append(android/net/Uri, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.stream.HttpUriLoader.Factory()))).append(android/net/Uri, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.AssetUriLoader.StreamFactory(context.getAssets())))).append(android/net/Uri, android/os/ParcelFileDescriptor, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.AssetUriLoader.FileDescriptorFactory(context.getAssets())))).append(android/net/Uri, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.stream.MediaStoreImageThumbLoader.Factory(context)))).append(android/net/Uri, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.stream.MediaStoreVideoThumbLoader.Factory(context)))).append(android/net/Uri, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.UriLoader.StreamFactory(context.getContentResolver())))).append(android/net/Uri, android/os/ParcelFileDescriptor, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.UriLoader.FileDescriptorFactory(context.getContentResolver())))).append(android/net/Uri, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.UrlUriLoader.StreamFactory()))).append(java/net/URL, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.stream.UrlLoader.StreamFactory()))).append(android/net/Uri, java/io/File, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.MediaStoreFileLoader.Factory(context)))).append(com/bumptech/glide/load/model/GlideUrl, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Factory()))).append([B, java/nio/ByteBuffer, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.ByteArrayLoader.ByteBufferFactory()))).append([B, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.ByteArrayLoader.StreamFactory()))).register(android/graphics/Bitmap, android/graphics/drawable/BitmapDrawable, ((com.bumptech.glide.load.resource.transcode.ResourceTranscoder) (new BitmapDrawableTranscoder(((Resources) (memorycache)), bitmappool)))).register(android/graphics/Bitmap, [B, ((com.bumptech.glide.load.resource.transcode.ResourceTranscoder) (new BitmapBytesTranscoder()))).register(com/bumptech/glide/load/resource/gif/GifDrawable, [B, ((com.bumptech.glide.load.resource.transcode.ResourceTranscoder) (new GifDrawableBytesTranscoder())));
	//   76  160:aload_0         
	//   77  161:getfield        #111 <Field Registry registry>
	//   78  164:ldc1            #138 <Class ByteBuffer>
	//   79  166:new             #140 <Class ByteBufferEncoder>
	//   80  169:dup             
	//   81  170:invokespecial   #141 <Method void ByteBufferEncoder()>
	//   82  173:invokevirtual   #144 <Method Registry Registry.register(Class, com.bumptech.glide.load.Encoder)>
	//   83  176:ldc1            #146 <Class InputStream>
	//   84  178:new             #148 <Class StreamEncoder>
	//   85  181:dup             
	//   86  182:aload           5
	//   87  184:invokespecial   #151 <Method void StreamEncoder(ArrayPool)>
	//   88  187:invokevirtual   #144 <Method Registry Registry.register(Class, com.bumptech.glide.load.Encoder)>
	//   89  190:ldc1            #138 <Class ByteBuffer>
	//   90  192:ldc1            #153 <Class Bitmap>
	//   91  194:new             #155 <Class ByteBufferBitmapDecoder>
	//   92  197:dup             
	//   93  198:aload           6
	//   94  200:invokespecial   #158 <Method void ByteBufferBitmapDecoder(Downsampler)>
	//   95  203:invokevirtual   #162 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//   96  206:ldc1            #146 <Class InputStream>
	//   97  208:ldc1            #153 <Class Bitmap>
	//   98  210:new             #164 <Class StreamBitmapDecoder>
	//   99  213:dup             
	//  100  214:aload           6
	//  101  216:aload           5
	//  102  218:invokespecial   #167 <Method void StreamBitmapDecoder(Downsampler, ArrayPool)>
	//  103  221:invokevirtual   #162 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  104  224:ldc1            #169 <Class ParcelFileDescriptor>
	//  105  226:ldc1            #153 <Class Bitmap>
	//  106  228:new             #171 <Class VideoBitmapDecoder>
	//  107  231:dup             
	//  108  232:aload           4
	//  109  234:invokespecial   #174 <Method void VideoBitmapDecoder(BitmapPool)>
	//  110  237:invokevirtual   #162 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  111  240:ldc1            #153 <Class Bitmap>
	//  112  242:new             #176 <Class BitmapEncoder>
	//  113  245:dup             
	//  114  246:invokespecial   #177 <Method void BitmapEncoder()>
	//  115  249:invokevirtual   #180 <Method Registry Registry.register(Class, com.bumptech.glide.load.ResourceEncoder)>
	//  116  252:ldc1            #138 <Class ByteBuffer>
	//  117  254:ldc1            #182 <Class BitmapDrawable>
	//  118  256:new             #184 <Class BitmapDrawableDecoder>
	//  119  259:dup             
	//  120  260:aload_3         
	//  121  261:aload           4
	//  122  263:new             #155 <Class ByteBufferBitmapDecoder>
	//  123  266:dup             
	//  124  267:aload           6
	//  125  269:invokespecial   #158 <Method void ByteBufferBitmapDecoder(Downsampler)>
	//  126  272:invokespecial   #187 <Method void BitmapDrawableDecoder(Resources, BitmapPool, com.bumptech.glide.load.ResourceDecoder)>
	//  127  275:invokevirtual   #162 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  128  278:ldc1            #146 <Class InputStream>
	//  129  280:ldc1            #182 <Class BitmapDrawable>
	//  130  282:new             #184 <Class BitmapDrawableDecoder>
	//  131  285:dup             
	//  132  286:aload_3         
	//  133  287:aload           4
	//  134  289:new             #164 <Class StreamBitmapDecoder>
	//  135  292:dup             
	//  136  293:aload           6
	//  137  295:aload           5
	//  138  297:invokespecial   #167 <Method void StreamBitmapDecoder(Downsampler, ArrayPool)>
	//  139  300:invokespecial   #187 <Method void BitmapDrawableDecoder(Resources, BitmapPool, com.bumptech.glide.load.ResourceDecoder)>
	//  140  303:invokevirtual   #162 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  141  306:ldc1            #169 <Class ParcelFileDescriptor>
	//  142  308:ldc1            #182 <Class BitmapDrawable>
	//  143  310:new             #184 <Class BitmapDrawableDecoder>
	//  144  313:dup             
	//  145  314:aload_3         
	//  146  315:aload           4
	//  147  317:new             #171 <Class VideoBitmapDecoder>
	//  148  320:dup             
	//  149  321:aload           4
	//  150  323:invokespecial   #174 <Method void VideoBitmapDecoder(BitmapPool)>
	//  151  326:invokespecial   #187 <Method void BitmapDrawableDecoder(Resources, BitmapPool, com.bumptech.glide.load.ResourceDecoder)>
	//  152  329:invokevirtual   #162 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  153  332:ldc1            #182 <Class BitmapDrawable>
	//  154  334:new             #189 <Class BitmapDrawableEncoder>
	//  155  337:dup             
	//  156  338:aload           4
	//  157  340:new             #176 <Class BitmapEncoder>
	//  158  343:dup             
	//  159  344:invokespecial   #177 <Method void BitmapEncoder()>
	//  160  347:invokespecial   #192 <Method void BitmapDrawableEncoder(BitmapPool, com.bumptech.glide.load.ResourceEncoder)>
	//  161  350:invokevirtual   #180 <Method Registry Registry.register(Class, com.bumptech.glide.load.ResourceEncoder)>
	//  162  353:ldc1            #146 <Class InputStream>
	//  163  355:ldc1            #194 <Class GifDrawable>
	//  164  357:new             #196 <Class StreamGifDecoder>
	//  165  360:dup             
	//  166  361:aload_0         
	//  167  362:getfield        #111 <Field Registry registry>
	//  168  365:invokevirtual   #122 <Method List Registry.getImageHeaderParsers()>
	//  169  368:aload           7
	//  170  370:aload           5
	//  171  372:invokespecial   #199 <Method void StreamGifDecoder(List, com.bumptech.glide.load.ResourceDecoder, ArrayPool)>
	//  172  375:invokevirtual   #202 <Method Registry Registry.prepend(Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  173  378:ldc1            #138 <Class ByteBuffer>
	//  174  380:ldc1            #194 <Class GifDrawable>
	//  175  382:aload           7
	//  176  384:invokevirtual   #202 <Method Registry Registry.prepend(Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  177  387:ldc1            #194 <Class GifDrawable>
	//  178  389:new             #204 <Class GifDrawableEncoder>
	//  179  392:dup             
	//  180  393:invokespecial   #205 <Method void GifDrawableEncoder()>
	//  181  396:invokevirtual   #180 <Method Registry Registry.register(Class, com.bumptech.glide.load.ResourceEncoder)>
	//  182  399:ldc1            #207 <Class GifDecoder>
	//  183  401:ldc1            #207 <Class GifDecoder>
	//  184  403:new             #209 <Class com.bumptech.glide.load.model.UnitModelLoader$Factory>
	//  185  406:dup             
	//  186  407:invokespecial   #210 <Method void com.bumptech.glide.load.model.UnitModelLoader$Factory()>
	//  187  410:invokevirtual   #213 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  188  413:ldc1            #207 <Class GifDecoder>
	//  189  415:ldc1            #153 <Class Bitmap>
	//  190  417:new             #215 <Class GifFrameResourceDecoder>
	//  191  420:dup             
	//  192  421:aload           4
	//  193  423:invokespecial   #216 <Method void GifFrameResourceDecoder(BitmapPool)>
	//  194  426:invokevirtual   #162 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  195  429:new             #218 <Class com.bumptech.glide.load.resource.bytes.ByteBufferRewinder$Factory>
	//  196  432:dup             
	//  197  433:invokespecial   #219 <Method void com.bumptech.glide.load.resource.bytes.ByteBufferRewinder$Factory()>
	//  198  436:invokevirtual   #222 <Method Registry Registry.register(com.bumptech.glide.load.data.DataRewinder$Factory)>
	//  199  439:ldc1            #224 <Class File>
	//  200  441:ldc1            #138 <Class ByteBuffer>
	//  201  443:new             #226 <Class com.bumptech.glide.load.model.ByteBufferFileLoader$Factory>
	//  202  446:dup             
	//  203  447:invokespecial   #227 <Method void com.bumptech.glide.load.model.ByteBufferFileLoader$Factory()>
	//  204  450:invokevirtual   #213 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  205  453:ldc1            #224 <Class File>
	//  206  455:ldc1            #146 <Class InputStream>
	//  207  457:new             #229 <Class com.bumptech.glide.load.model.FileLoader$StreamFactory>
	//  208  460:dup             
	//  209  461:invokespecial   #230 <Method void com.bumptech.glide.load.model.FileLoader$StreamFactory()>
	//  210  464:invokevirtual   #213 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  211  467:ldc1            #224 <Class File>
	//  212  469:ldc1            #224 <Class File>
	//  213  471:new             #232 <Class FileDecoder>
	//  214  474:dup             
	//  215  475:invokespecial   #233 <Method void FileDecoder()>
	//  216  478:invokevirtual   #162 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  217  481:ldc1            #224 <Class File>
	//  218  483:ldc1            #169 <Class ParcelFileDescriptor>
	//  219  485:new             #235 <Class com.bumptech.glide.load.model.FileLoader$FileDescriptorFactory>
	//  220  488:dup             
	//  221  489:invokespecial   #236 <Method void com.bumptech.glide.load.model.FileLoader$FileDescriptorFactory()>
	//  222  492:invokevirtual   #213 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  223  495:ldc1            #224 <Class File>
	//  224  497:ldc1            #224 <Class File>
	//  225  499:new             #209 <Class com.bumptech.glide.load.model.UnitModelLoader$Factory>
	//  226  502:dup             
	//  227  503:invokespecial   #210 <Method void com.bumptech.glide.load.model.UnitModelLoader$Factory()>
	//  228  506:invokevirtual   #213 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  229  509:new             #238 <Class com.bumptech.glide.load.data.InputStreamRewinder$Factory>
	//  230  512:dup             
	//  231  513:aload           5
	//  232  515:invokespecial   #239 <Method void com.bumptech.glide.load.data.InputStreamRewinder$Factory(ArrayPool)>
	//  233  518:invokevirtual   #222 <Method Registry Registry.register(com.bumptech.glide.load.data.DataRewinder$Factory)>
	//  234  521:getstatic       #245 <Field Class Integer.TYPE>
	//  235  524:ldc1            #146 <Class InputStream>
	//  236  526:new             #247 <Class com.bumptech.glide.load.model.ResourceLoader$StreamFactory>
	//  237  529:dup             
	//  238  530:aload_3         
	//  239  531:invokespecial   #250 <Method void com.bumptech.glide.load.model.ResourceLoader$StreamFactory(Resources)>
	//  240  534:invokevirtual   #213 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  241  537:getstatic       #245 <Field Class Integer.TYPE>
	//  242  540:ldc1            #169 <Class ParcelFileDescriptor>
	//  243  542:new             #252 <Class com.bumptech.glide.load.model.ResourceLoader$FileDescriptorFactory>
	//  244  545:dup             
	//  245  546:aload_3         
	//  246  547:invokespecial   #253 <Method void com.bumptech.glide.load.model.ResourceLoader$FileDescriptorFactory(Resources)>
	//  247  550:invokevirtual   #213 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  248  553:ldc1            #241 <Class Integer>
	//  249  555:ldc1            #146 <Class InputStream>
	//  250  557:new             #247 <Class com.bumptech.glide.load.model.ResourceLoader$StreamFactory>
	//  251  560:dup             
	//  252  561:aload_3         
	//  253  562:invokespecial   #250 <Method void com.bumptech.glide.load.model.ResourceLoader$StreamFactory(Resources)>
	//  254  565:invokevirtual   #213 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  255  568:ldc1            #241 <Class Integer>
	//  256  570:ldc1            #169 <Class ParcelFileDescriptor>
	//  257  572:new             #252 <Class com.bumptech.glide.load.model.ResourceLoader$FileDescriptorFactory>
	//  258  575:dup             
	//  259  576:aload_3         
	//  260  577:invokespecial   #253 <Method void com.bumptech.glide.load.model.ResourceLoader$FileDescriptorFactory(Resources)>
	//  261  580:invokevirtual   #213 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  262  583:ldc1            #255 <Class String>
	//  263  585:ldc1            #146 <Class InputStream>
	//  264  587:new             #257 <Class com.bumptech.glide.load.model.DataUrlLoader$StreamFactory>
	//  265  590:dup             
	//  266  591:invokespecial   #258 <Method void com.bumptech.glide.load.model.DataUrlLoader$StreamFactory()>
	//  267  594:invokevirtual   #213 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  268  597:ldc1            #255 <Class String>
	//  269  599:ldc1            #146 <Class InputStream>
	//  270  601:new             #260 <Class com.bumptech.glide.load.model.StringLoader$StreamFactory>
	//  271  604:dup             
	//  272  605:invokespecial   #261 <Method void com.bumptech.glide.load.model.StringLoader$StreamFactory()>
	//  273  608:invokevirtual   #213 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  274  611:ldc1            #255 <Class String>
	//  275  613:ldc1            #169 <Class ParcelFileDescriptor>
	//  276  615:new             #263 <Class com.bumptech.glide.load.model.StringLoader$FileDescriptorFactory>
	//  277  618:dup             
	//  278  619:invokespecial   #264 <Method void com.bumptech.glide.load.model.StringLoader$FileDescriptorFactory()>
	//  279  622:invokevirtual   #213 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  280  625:ldc2            #266 <Class Uri>
	//  281  628:ldc1            #146 <Class InputStream>
	//  282  630:new             #268 <Class com.bumptech.glide.load.model.stream.HttpUriLoader$Factory>
	//  283  633:dup             
	//  284  634:invokespecial   #269 <Method void com.bumptech.glide.load.model.stream.HttpUriLoader$Factory()>
	//  285  637:invokevirtual   #213 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  286  640:ldc2            #266 <Class Uri>
	//  287  643:ldc1            #146 <Class InputStream>
	//  288  645:new             #271 <Class com.bumptech.glide.load.model.AssetUriLoader$StreamFactory>
	//  289  648:dup             
	//  290  649:aload_1         
	//  291  650:invokevirtual   #275 <Method android.content.res.AssetManager Context.getAssets()>
	//  292  653:invokespecial   #278 <Method void com.bumptech.glide.load.model.AssetUriLoader$StreamFactory(android.content.res.AssetManager)>
	//  293  656:invokevirtual   #213 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  294  659:ldc2            #266 <Class Uri>
	//  295  662:ldc1            #169 <Class ParcelFileDescriptor>
	//  296  664:new             #280 <Class com.bumptech.glide.load.model.AssetUriLoader$FileDescriptorFactory>
	//  297  667:dup             
	//  298  668:aload_1         
	//  299  669:invokevirtual   #275 <Method android.content.res.AssetManager Context.getAssets()>
	//  300  672:invokespecial   #281 <Method void com.bumptech.glide.load.model.AssetUriLoader$FileDescriptorFactory(android.content.res.AssetManager)>
	//  301  675:invokevirtual   #213 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  302  678:ldc2            #266 <Class Uri>
	//  303  681:ldc1            #146 <Class InputStream>
	//  304  683:new             #283 <Class com.bumptech.glide.load.model.stream.MediaStoreImageThumbLoader$Factory>
	//  305  686:dup             
	//  306  687:aload_1         
	//  307  688:invokespecial   #286 <Method void com.bumptech.glide.load.model.stream.MediaStoreImageThumbLoader$Factory(Context)>
	//  308  691:invokevirtual   #213 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  309  694:ldc2            #266 <Class Uri>
	//  310  697:ldc1            #146 <Class InputStream>
	//  311  699:new             #288 <Class com.bumptech.glide.load.model.stream.MediaStoreVideoThumbLoader$Factory>
	//  312  702:dup             
	//  313  703:aload_1         
	//  314  704:invokespecial   #289 <Method void com.bumptech.glide.load.model.stream.MediaStoreVideoThumbLoader$Factory(Context)>
	//  315  707:invokevirtual   #213 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  316  710:ldc2            #266 <Class Uri>
	//  317  713:ldc1            #146 <Class InputStream>
	//  318  715:new             #291 <Class com.bumptech.glide.load.model.UriLoader$StreamFactory>
	//  319  718:dup             
	//  320  719:aload_1         
	//  321  720:invokevirtual   #295 <Method android.content.ContentResolver Context.getContentResolver()>
	//  322  723:invokespecial   #298 <Method void com.bumptech.glide.load.model.UriLoader$StreamFactory(android.content.ContentResolver)>
	//  323  726:invokevirtual   #213 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  324  729:ldc2            #266 <Class Uri>
	//  325  732:ldc1            #169 <Class ParcelFileDescriptor>
	//  326  734:new             #300 <Class com.bumptech.glide.load.model.UriLoader$FileDescriptorFactory>
	//  327  737:dup             
	//  328  738:aload_1         
	//  329  739:invokevirtual   #295 <Method android.content.ContentResolver Context.getContentResolver()>
	//  330  742:invokespecial   #301 <Method void com.bumptech.glide.load.model.UriLoader$FileDescriptorFactory(android.content.ContentResolver)>
	//  331  745:invokevirtual   #213 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  332  748:ldc2            #266 <Class Uri>
	//  333  751:ldc1            #146 <Class InputStream>
	//  334  753:new             #303 <Class com.bumptech.glide.load.model.UrlUriLoader$StreamFactory>
	//  335  756:dup             
	//  336  757:invokespecial   #304 <Method void com.bumptech.glide.load.model.UrlUriLoader$StreamFactory()>
	//  337  760:invokevirtual   #213 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  338  763:ldc2            #306 <Class URL>
	//  339  766:ldc1            #146 <Class InputStream>
	//  340  768:new             #308 <Class com.bumptech.glide.load.model.stream.UrlLoader$StreamFactory>
	//  341  771:dup             
	//  342  772:invokespecial   #309 <Method void com.bumptech.glide.load.model.stream.UrlLoader$StreamFactory()>
	//  343  775:invokevirtual   #213 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  344  778:ldc2            #266 <Class Uri>
	//  345  781:ldc1            #224 <Class File>
	//  346  783:new             #311 <Class com.bumptech.glide.load.model.MediaStoreFileLoader$Factory>
	//  347  786:dup             
	//  348  787:aload_1         
	//  349  788:invokespecial   #312 <Method void com.bumptech.glide.load.model.MediaStoreFileLoader$Factory(Context)>
	//  350  791:invokevirtual   #213 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  351  794:ldc2            #314 <Class GlideUrl>
	//  352  797:ldc1            #146 <Class InputStream>
	//  353  799:new             #316 <Class com.bumptech.glide.load.model.stream.HttpGlideUrlLoader$Factory>
	//  354  802:dup             
	//  355  803:invokespecial   #317 <Method void com.bumptech.glide.load.model.stream.HttpGlideUrlLoader$Factory()>
	//  356  806:invokevirtual   #213 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  357  809:ldc2            #319 <Class byte[]>
	//  358  812:ldc1            #138 <Class ByteBuffer>
	//  359  814:new             #321 <Class com.bumptech.glide.load.model.ByteArrayLoader$ByteBufferFactory>
	//  360  817:dup             
	//  361  818:invokespecial   #322 <Method void com.bumptech.glide.load.model.ByteArrayLoader$ByteBufferFactory()>
	//  362  821:invokevirtual   #213 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  363  824:ldc2            #319 <Class byte[]>
	//  364  827:ldc1            #146 <Class InputStream>
	//  365  829:new             #324 <Class com.bumptech.glide.load.model.ByteArrayLoader$StreamFactory>
	//  366  832:dup             
	//  367  833:invokespecial   #325 <Method void com.bumptech.glide.load.model.ByteArrayLoader$StreamFactory()>
	//  368  836:invokevirtual   #213 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  369  839:ldc1            #153 <Class Bitmap>
	//  370  841:ldc1            #182 <Class BitmapDrawable>
	//  371  843:new             #327 <Class BitmapDrawableTranscoder>
	//  372  846:dup             
	//  373  847:aload_3         
	//  374  848:aload           4
	//  375  850:invokespecial   #330 <Method void BitmapDrawableTranscoder(Resources, BitmapPool)>
	//  376  853:invokevirtual   #333 <Method Registry Registry.register(Class, Class, com.bumptech.glide.load.resource.transcode.ResourceTranscoder)>
	//  377  856:ldc1            #153 <Class Bitmap>
	//  378  858:ldc2            #319 <Class byte[]>
	//  379  861:new             #335 <Class BitmapBytesTranscoder>
	//  380  864:dup             
	//  381  865:invokespecial   #336 <Method void BitmapBytesTranscoder()>
	//  382  868:invokevirtual   #333 <Method Registry Registry.register(Class, Class, com.bumptech.glide.load.resource.transcode.ResourceTranscoder)>
	//  383  871:ldc1            #194 <Class GifDrawable>
	//  384  873:ldc2            #319 <Class byte[]>
	//  385  876:new             #338 <Class GifDrawableBytesTranscoder>
	//  386  879:dup             
	//  387  880:invokespecial   #339 <Method void GifDrawableBytesTranscoder()>
	//  388  883:invokevirtual   #333 <Method Registry Registry.register(Class, Class, com.bumptech.glide.load.resource.transcode.ResourceTranscoder)>
	//  389  886:pop             
		memorycache = ((MemoryCache) (new ImageViewTargetFactory()));
	//  390  887:new             #341 <Class ImageViewTargetFactory>
	//  391  890:dup             
	//  392  891:invokespecial   #342 <Method void ImageViewTargetFactory()>
	//  393  894:astore_3        
		glideContext = new GlideContext(context, registry, ((ImageViewTargetFactory) (memorycache)), requestoptions, map, engine1, i);
	//  394  895:aload_0         
	//  395  896:new             #344 <Class GlideContext>
	//  396  899:dup             
	//  397  900:aload_1         
	//  398  901:aload_0         
	//  399  902:getfield        #111 <Field Registry registry>
	//  400  905:aload_3         
	//  401  906:aload           9
	//  402  908:aload           10
	//  403  910:aload_2         
	//  404  911:iload           8
	//  405  913:invokespecial   #347 <Method void GlideContext(Context, Registry, ImageViewTargetFactory, RequestOptions, Map, Engine, int)>
	//  406  916:putfield        #349 <Field GlideContext glideContext>
	//  407  919:return          
	}

	private static void checkAndInitializeGlide(Context context)
	{
		if(isInitializing)
	//*   0    0:getstatic       #356 <Field boolean isInitializing>
	//*   1    3:ifeq            17
		{
			throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
	//    2    6:new             #358 <Class IllegalStateException>
	//    3    9:dup             
	//    4   10:ldc2            #360 <String "You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead">
	//    5   13:invokespecial   #363 <Method void IllegalStateException(String)>
	//    6   16:athrow          
		} else
		{
			isInitializing = true;
	//    7   17:iconst_1        
	//    8   18:putstatic       #356 <Field boolean isInitializing>
			initializeGlide(context);
	//    9   21:aload_0         
	//   10   22:invokestatic    #366 <Method void initializeGlide(Context)>
			isInitializing = false;
	//   11   25:iconst_0        
	//   12   26:putstatic       #356 <Field boolean isInitializing>
			return;
	//   13   29:return          
		}
	}

	public static Glide get(Context context)
	{
		if(glide != null)
			break MISSING_BLOCK_LABEL_31;
	//    0    0:getstatic       #369 <Field Glide glide>
	//    1    3:ifnonnull       31
		com/bumptech/glide/Glide;
	//    2    6:ldc1            #2   <Class Glide>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(glide == null)
	//*   4    9:getstatic       #369 <Field Glide glide>
	//*   5   12:ifnonnull       19
			checkAndInitializeGlide(context);
	//    6   15:aload_0         
	//    7   16:invokestatic    #371 <Method void checkAndInitializeGlide(Context)>
		com/bumptech/glide/Glide;
	//    8   19:ldc1            #2   <Class Glide>
		JVM INSTR monitorexit ;
	//    9   21:monitorexit     
		break MISSING_BLOCK_LABEL_31;
	//   10   22:goto            31
		context;
	//   11   25:astore_0        
	//*  12   26:ldc1            #2   <Class Glide>
		throw context;
	//   13   28:monitorexit     
	//   14   29:aload_0         
	//   15   30:athrow          
		return glide;
	//   16   31:getstatic       #369 <Field Glide glide>
	//   17   34:areturn         
	}

	private static GeneratedAppGlideModule getAnnotationGeneratedGlideModules()
	{
		GeneratedAppGlideModule generatedappglidemodule;
		try
		{
			generatedappglidemodule = (GeneratedAppGlideModule)Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").newInstance();
	//    0    0:ldc2            #382 <String "com.bumptech.glide.GeneratedAppGlideModuleImpl">
	//    1    3:invokestatic    #388 <Method Class Class.forName(String)>
	//    2    6:invokevirtual   #392 <Method Object Class.newInstance()>
	//    3    9:checkcast       #394 <Class GeneratedAppGlideModule>
	//    4   12:astore_0        
		}
	//*   5   13:aload_0         
	//*   6   14:areturn         
		catch(ClassNotFoundException classnotfoundexception)
	//*   7   15:astore_0        
		{
			if(Log.isLoggable("Glide", 5))
	//*   8   16:ldc1            #16  <String "Glide">
	//*   9   18:iconst_5        
	//*  10   19:invokestatic    #400 <Method boolean Log.isLoggable(String, int)>
	//*  11   22:ifeq            34
				Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
	//   12   25:ldc1            #16  <String "Glide">
	//   13   27:ldc2            #402 <String "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored">
	//   14   30:invokestatic    #406 <Method int Log.w(String, String)>
	//   15   33:pop             
			return null;
	//   16   34:aconst_null     
	//   17   35:areturn         
		}
		catch(InstantiationException instantiationexception)
	//*  18   36:astore_0        
		{
			throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", ((Throwable) (instantiationexception)));
	//   19   37:new             #358 <Class IllegalStateException>
	//   20   40:dup             
	//   21   41:ldc2            #408 <String "GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.">
	//   22   44:aload_0         
	//   23   45:invokespecial   #411 <Method void IllegalStateException(String, Throwable)>
	//   24   48:athrow          
		}
		catch(IllegalAccessException illegalaccessexception)
	//*  25   49:astore_0        
		{
			throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", ((Throwable) (illegalaccessexception)));
	//   26   50:new             #358 <Class IllegalStateException>
	//   27   53:dup             
	//   28   54:ldc2            #408 <String "GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.">
	//   29   57:aload_0         
	//   30   58:invokespecial   #411 <Method void IllegalStateException(String, Throwable)>
	//   31   61:athrow          
		}
		return generatedappglidemodule;
	}

	public static File getPhotoCacheDir(Context context)
	{
		return getPhotoCacheDir(context, "image_manager_disk_cache");
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "image_manager_disk_cache">
	//    2    3:invokestatic    #416 <Method File getPhotoCacheDir(Context, String)>
	//    3    6:areturn         
	}

	public static File getPhotoCacheDir(Context context, String s)
	{
		context = ((Context) (context.getCacheDir()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #420 <Method File Context.getCacheDir()>
	//    2    4:astore_0        
		if(context != null)
	//*   3    5:aload_0         
	//*   4    6:ifnull          44
		{
			context = ((Context) (new File(((File) (context)), s)));
	//    5    9:new             #224 <Class File>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #423 <Method void File(File, String)>
	//   10   18:astore_0        
			if(!((File) (context)).mkdirs() && (!((File) (context)).exists() || !((File) (context)).isDirectory()))
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #427 <Method boolean File.mkdirs()>
	//*  13   23:ifne            42
	//*  14   26:aload_0         
	//*  15   27:invokevirtual   #430 <Method boolean File.exists()>
	//*  16   30:ifeq            40
	//*  17   33:aload_0         
	//*  18   34:invokevirtual   #433 <Method boolean File.isDirectory()>
	//*  19   37:ifne            42
				return null;
	//   20   40:aconst_null     
	//   21   41:areturn         
			else
				return ((File) (context));
	//   22   42:aload_0         
	//   23   43:areturn         
		}
		if(Log.isLoggable("Glide", 6))
	//*  24   44:ldc1            #16  <String "Glide">
	//*  25   46:bipush          6
	//*  26   48:invokestatic    #400 <Method boolean Log.isLoggable(String, int)>
	//*  27   51:ifeq            63
			Log.e("Glide", "default disk cache dir is null");
	//   28   54:ldc1            #16  <String "Glide">
	//   29   56:ldc2            #435 <String "default disk cache dir is null">
	//   30   59:invokestatic    #438 <Method int Log.e(String, String)>
	//   31   62:pop             
		return null;
	//   32   63:aconst_null     
	//   33   64:areturn         
	}

	private static RequestManagerRetriever getRetriever(Context context)
	{
		Preconditions.checkNotNull(((Object) (context)), "You cannot start a load on a not yet attached View or a  Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
	//    0    0:aload_0         
	//    1    1:ldc2            #442 <String "You cannot start a load on a not yet attached View or a  Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).">
	//    2    4:invokestatic    #448 <Method Object Preconditions.checkNotNull(Object, String)>
	//    3    7:pop             
		return get(context).getRequestManagerRetriever();
	//    4    8:aload_0         
	//    5    9:invokestatic    #450 <Method Glide get(Context)>
	//    6   12:invokevirtual   #454 <Method RequestManagerRetriever getRequestManagerRetriever()>
	//    7   15:areturn         
	}

	public static void init(Glide glide1)
	{
		com/bumptech/glide/Glide;
	//    0    0:ldc1            #2   <Class Glide>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		glide = glide1;
	//    2    3:aload_0         
	//    3    4:putstatic       #369 <Field Glide glide>
		com/bumptech/glide/Glide;
	//    4    7:ldc1            #2   <Class Glide>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		return;
	//    6   10:return          
		glide1;
	//    7   11:astore_0        
	//*   8   12:ldc1            #2   <Class Glide>
		throw glide1;
	//    9   14:monitorexit     
	//   10   15:aload_0         
	//   11   16:athrow          
	}

	private static void initializeGlide(Context context)
	{
		Context context1 = context.getApplicationContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #462 <Method Context Context.getApplicationContext()>
	//    2    4:astore_3        
		GeneratedAppGlideModule generatedappglidemodule = getAnnotationGeneratedGlideModules();
	//    3    5:invokestatic    #464 <Method GeneratedAppGlideModule getAnnotationGeneratedGlideModules()>
	//    4    8:astore          4
		Object obj = ((Object) (Collections.emptyList()));
	//    5   10:invokestatic    #469 <Method List Collections.emptyList()>
	//    6   13:astore_1        
		if(generatedappglidemodule == null || generatedappglidemodule.isManifestParsingEnabled())
	//*   7   14:aload           4
	//*   8   16:ifnull          27
	//*   9   19:aload           4
	//*  10   21:invokevirtual   #472 <Method boolean GeneratedAppGlideModule.isManifestParsingEnabled()>
	//*  11   24:ifeq            39
			obj = ((Object) ((new ManifestParser(context1)).parse()));
	//   12   27:new             #474 <Class ManifestParser>
	//   13   30:dup             
	//   14   31:aload_3         
	//   15   32:invokespecial   #475 <Method void ManifestParser(Context)>
	//   16   35:invokevirtual   #478 <Method List ManifestParser.parse()>
	//   17   38:astore_1        
		if(generatedappglidemodule != null && !generatedappglidemodule.getExcludedModuleClasses().isEmpty())
	//*  18   39:aload           4
	//*  19   41:ifnull          156
	//*  20   44:aload           4
	//*  21   46:invokevirtual   #482 <Method Set GeneratedAppGlideModule.getExcludedModuleClasses()>
	//*  22   49:invokeinterface #487 <Method boolean Set.isEmpty()>
	//*  23   54:ifne            156
		{
			Set set = generatedappglidemodule.getExcludedModuleClasses();
	//   24   57:aload           4
	//   25   59:invokevirtual   #482 <Method Set GeneratedAppGlideModule.getExcludedModuleClasses()>
	//   26   62:astore_2        
			Iterator iterator1 = ((List) (obj)).iterator();
	//   27   63:aload_1         
	//   28   64:invokeinterface #493 <Method Iterator List.iterator()>
	//   29   69:astore          5
			do
			{
				if(!iterator1.hasNext())
					break;
	//   30   71:aload           5
	//   31   73:invokeinterface #498 <Method boolean Iterator.hasNext()>
	//   32   78:ifeq            156
				GlideModule glidemodule1 = (GlideModule)iterator1.next();
	//   33   81:aload           5
	//   34   83:invokeinterface #501 <Method Object Iterator.next()>
	//   35   88:checkcast       #503 <Class GlideModule>
	//   36   91:astore          6
				if(set.contains(((Object) (((Object) (glidemodule1)).getClass()))))
	//*  37   93:aload_2         
	//*  38   94:aload           6
	//*  39   96:invokevirtual   #507 <Method Class Object.getClass()>
	//*  40   99:invokeinterface #511 <Method boolean Set.contains(Object)>
	//*  41  104:ifne            110
	//*  42  107:goto            71
				{
					if(Log.isLoggable("Glide", 3))
	//*  43  110:ldc1            #16  <String "Glide">
	//*  44  112:iconst_3        
	//*  45  113:invokestatic    #400 <Method boolean Log.isLoggable(String, int)>
	//*  46  116:ifeq            146
						Log.d("Glide", (new StringBuilder()).append("AppGlideModule excludes manifest GlideModule: ").append(((Object) (glidemodule1))).toString());
	//   47  119:ldc1            #16  <String "Glide">
	//   48  121:new             #513 <Class StringBuilder>
	//   49  124:dup             
	//   50  125:invokespecial   #514 <Method void StringBuilder()>
	//   51  128:ldc2            #516 <String "AppGlideModule excludes manifest GlideModule: ">
	//   52  131:invokevirtual   #519 <Method StringBuilder StringBuilder.append(String)>
	//   53  134:aload           6
	//   54  136:invokevirtual   #522 <Method StringBuilder StringBuilder.append(Object)>
	//   55  139:invokevirtual   #526 <Method String StringBuilder.toString()>
	//   56  142:invokestatic    #529 <Method int Log.d(String, String)>
	//   57  145:pop             
					iterator1.remove();
	//   58  146:aload           5
	//   59  148:invokeinterface #532 <Method void Iterator.remove()>
				}
			} while(true);
	//   60  153:goto            71
		}
		if(Log.isLoggable("Glide", 3))
	//*  61  156:ldc1            #16  <String "Glide">
	//*  62  158:iconst_3        
	//*  63  159:invokestatic    #400 <Method boolean Log.isLoggable(String, int)>
	//*  64  162:ifeq            225
		{
			GlideModule glidemodule;
			for(Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext(); Log.d("Glide", (new StringBuilder()).append("Discovered GlideModule from manifest: ").append(((Object) (((Object) (glidemodule)).getClass()))).toString()))
	//*  65  165:aload_1         
	//*  66  166:invokeinterface #493 <Method Iterator List.iterator()>
	//*  67  171:astore_2        
	//*  68  172:aload_2         
	//*  69  173:invokeinterface #498 <Method boolean Iterator.hasNext()>
	//*  70  178:ifeq            225
				glidemodule = (GlideModule)iterator.next();
	//   71  181:aload_2         
	//   72  182:invokeinterface #501 <Method Object Iterator.next()>
	//   73  187:checkcast       #503 <Class GlideModule>
	//   74  190:astore          5

	//   75  192:ldc1            #16  <String "Glide">
	//   76  194:new             #513 <Class StringBuilder>
	//   77  197:dup             
	//   78  198:invokespecial   #514 <Method void StringBuilder()>
	//   79  201:ldc2            #534 <String "Discovered GlideModule from manifest: ">
	//   80  204:invokevirtual   #519 <Method StringBuilder StringBuilder.append(String)>
	//   81  207:aload           5
	//   82  209:invokevirtual   #507 <Method Class Object.getClass()>
	//   83  212:invokevirtual   #522 <Method StringBuilder StringBuilder.append(Object)>
	//   84  215:invokevirtual   #526 <Method String StringBuilder.toString()>
	//   85  218:invokestatic    #529 <Method int Log.d(String, String)>
	//   86  221:pop             
		}
	//*  87  222:goto            172
		Object obj1;
		if(generatedappglidemodule != null)
	//*  88  225:aload           4
	//*  89  227:ifnull          239
			obj1 = ((Object) (generatedappglidemodule.getRequestManagerFactory()));
	//   90  230:aload           4
	//   91  232:invokevirtual   #538 <Method com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory GeneratedAppGlideModule.getRequestManagerFactory()>
	//   92  235:astore_2        
		else
	//*  93  236:goto            241
			obj1 = null;
	//   94  239:aconst_null     
	//   95  240:astore_2        
		obj1 = ((Object) ((new GlideBuilder()).setRequestManagerFactory(((com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory) (obj1)))));
	//   96  241:new             #540 <Class GlideBuilder>
	//   97  244:dup             
	//   98  245:invokespecial   #541 <Method void GlideBuilder()>
	//   99  248:aload_2         
	//  100  249:invokevirtual   #545 <Method GlideBuilder GlideBuilder.setRequestManagerFactory(com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory)>
	//  101  252:astore_2        
		for(Iterator iterator2 = ((List) (obj)).iterator(); iterator2.hasNext(); ((GlideModule)iterator2.next()).applyOptions(context1, ((GlideBuilder) (obj1))));
	//  102  253:aload_1         
	//  103  254:invokeinterface #493 <Method Iterator List.iterator()>
	//  104  259:astore          5
	//  105  261:aload           5
	//  106  263:invokeinterface #498 <Method boolean Iterator.hasNext()>
	//  107  268:ifeq            291
	//  108  271:aload           5
	//  109  273:invokeinterface #501 <Method Object Iterator.next()>
	//  110  278:checkcast       #503 <Class GlideModule>
	//  111  281:aload_3         
	//  112  282:aload_2         
	//  113  283:invokeinterface #549 <Method void GlideModule.applyOptions(Context, GlideBuilder)>
	//* 114  288:goto            261
		if(generatedappglidemodule != null)
	//* 115  291:aload           4
	//* 116  293:ifnull          303
			generatedappglidemodule.applyOptions(context1, ((GlideBuilder) (obj1)));
	//  117  296:aload           4
	//  118  298:aload_3         
	//  119  299:aload_2         
	//  120  300:invokevirtual   #550 <Method void GeneratedAppGlideModule.applyOptions(Context, GlideBuilder)>
		obj1 = ((Object) (((GlideBuilder) (obj1)).build(context1)));
	//  121  303:aload_2         
	//  122  304:aload_3         
	//  123  305:invokevirtual   #553 <Method Glide GlideBuilder.build(Context)>
	//  124  308:astore_2        
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((GlideModule)((Iterator) (obj)).next()).registerComponents(context1, ((Glide) (obj1)), ((Glide) (obj1)).registry));
	//  125  309:aload_1         
	//  126  310:invokeinterface #493 <Method Iterator List.iterator()>
	//  127  315:astore_1        
	//  128  316:aload_1         
	//  129  317:invokeinterface #498 <Method boolean Iterator.hasNext()>
	//  130  322:ifeq            348
	//  131  325:aload_1         
	//  132  326:invokeinterface #501 <Method Object Iterator.next()>
	//  133  331:checkcast       #503 <Class GlideModule>
	//  134  334:aload_3         
	//  135  335:aload_2         
	//  136  336:aload_2         
	//  137  337:getfield        #111 <Field Registry registry>
	//  138  340:invokeinterface #557 <Method void GlideModule.registerComponents(Context, Glide, Registry)>
	//* 139  345:goto            316
		if(generatedappglidemodule != null)
	//* 140  348:aload           4
	//* 141  350:ifnull          364
			generatedappglidemodule.registerComponents(context1, ((Glide) (obj1)), ((Glide) (obj1)).registry);
	//  142  353:aload           4
	//  143  355:aload_3         
	//  144  356:aload_2         
	//  145  357:aload_2         
	//  146  358:getfield        #111 <Field Registry registry>
	//  147  361:invokevirtual   #558 <Method void GeneratedAppGlideModule.registerComponents(Context, Glide, Registry)>
		context.getApplicationContext().registerComponentCallbacks(((android.content.ComponentCallbacks) (obj1)));
	//  148  364:aload_0         
	//  149  365:invokevirtual   #462 <Method Context Context.getApplicationContext()>
	//  150  368:aload_2         
	//  151  369:invokevirtual   #562 <Method void Context.registerComponentCallbacks(android.content.ComponentCallbacks)>
		glide = ((Glide) (obj1));
	//  152  372:aload_2         
	//  153  373:putstatic       #369 <Field Glide glide>
	//  154  376:return          
	}

	public static void tearDown()
	{
		com/bumptech/glide/Glide;
	//    0    0:ldc1            #2   <Class Glide>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		glide = null;
	//    2    3:aconst_null     
	//    3    4:putstatic       #369 <Field Glide glide>
		com/bumptech/glide/Glide;
	//    4    7:ldc1            #2   <Class Glide>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		return;
	//    6   10:return          
		Exception exception;
		exception;
	//    7   11:astore_0        
	//*   8   12:ldc1            #2   <Class Glide>
		throw exception;
	//    9   14:monitorexit     
	//   10   15:aload_0         
	//   11   16:athrow          
	}

	public static RequestManager with(Activity activity)
	{
		return getRetriever(((Context) (activity))).get(activity);
	//    0    0:aload_0         
	//    1    1:invokestatic    #567 <Method RequestManagerRetriever getRetriever(Context)>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #571 <Method RequestManager RequestManagerRetriever.get(Activity)>
	//    4    8:areturn         
	}

	public static RequestManager with(Fragment fragment)
	{
		return getRetriever(((Context) (fragment.getActivity()))).get(fragment);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #578 <Method Activity Fragment.getActivity()>
	//    2    4:invokestatic    #567 <Method RequestManagerRetriever getRetriever(Context)>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #580 <Method RequestManager RequestManagerRetriever.get(Fragment)>
	//    5   11:areturn         
	}

	public static RequestManager with(Context context)
	{
		return getRetriever(context).get(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #567 <Method RequestManagerRetriever getRetriever(Context)>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #583 <Method RequestManager RequestManagerRetriever.get(Context)>
	//    4    8:areturn         
	}

	public static RequestManager with(android.support.v4.app.Fragment fragment)
	{
		return getRetriever(((Context) (fragment.getActivity()))).get(fragment);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #589 <Method FragmentActivity android.support.v4.app.Fragment.getActivity()>
	//    2    4:invokestatic    #567 <Method RequestManagerRetriever getRetriever(Context)>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #591 <Method RequestManager RequestManagerRetriever.get(android.support.v4.app.Fragment)>
	//    5   11:areturn         
	}

	public static RequestManager with(FragmentActivity fragmentactivity)
	{
		return getRetriever(((Context) (fragmentactivity))).get(fragmentactivity);
	//    0    0:aload_0         
	//    1    1:invokestatic    #567 <Method RequestManagerRetriever getRetriever(Context)>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #594 <Method RequestManager RequestManagerRetriever.get(FragmentActivity)>
	//    4    8:areturn         
	}

	public static RequestManager with(View view)
	{
		return getRetriever(view.getContext()).get(view);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #600 <Method Context View.getContext()>
	//    2    4:invokestatic    #567 <Method RequestManagerRetriever getRetriever(Context)>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #602 <Method RequestManager RequestManagerRetriever.get(View)>
	//    5   11:areturn         
	}

	public void clearDiskCache()
	{
		Util.assertBackgroundThread();
	//    0    0:invokestatic    #608 <Method void Util.assertBackgroundThread()>
		engine.clearDiskCache();
	//    1    3:aload_0         
	//    2    4:getfield        #63  <Field Engine engine>
	//    3    7:invokevirtual   #612 <Method void Engine.clearDiskCache()>
	//    4   10:return          
	}

	public void clearMemory()
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #616 <Method void Util.assertMainThread()>
		memoryCache.clearMemory();
	//    1    3:aload_0         
	//    2    4:getfield        #69  <Field MemoryCache memoryCache>
	//    3    7:invokeinterface #620 <Method void MemoryCache.clearMemory()>
		bitmapPool.clearMemory();
	//    4   12:aload_0         
	//    5   13:getfield        #65  <Field BitmapPool bitmapPool>
	//    6   16:invokeinterface #623 <Method void BitmapPool.clearMemory()>
		arrayPool.clearMemory();
	//    7   21:aload_0         
	//    8   22:getfield        #67  <Field ArrayPool arrayPool>
	//    9   25:invokeinterface #626 <Method void ArrayPool.clearMemory()>
	//   10   30:return          
	}

	public ArrayPool getArrayPool()
	{
		return arrayPool;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field ArrayPool arrayPool>
	//    2    4:areturn         
	}

	public BitmapPool getBitmapPool()
	{
		return bitmapPool;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field BitmapPool bitmapPool>
	//    2    4:areturn         
	}

	ConnectivityMonitorFactory getConnectivityMonitorFactory()
	{
		return connectivityMonitorFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field ConnectivityMonitorFactory connectivityMonitorFactory>
	//    2    4:areturn         
	}

	public Context getContext()
	{
		return glideContext.getBaseContext();
	//    0    0:aload_0         
	//    1    1:getfield        #349 <Field GlideContext glideContext>
	//    2    4:invokevirtual   #635 <Method Context GlideContext.getBaseContext()>
	//    3    7:areturn         
	}

	GlideContext getGlideContext()
	{
		return glideContext;
	//    0    0:aload_0         
	//    1    1:getfield        #349 <Field GlideContext glideContext>
	//    2    4:areturn         
	}

	public Registry getRegistry()
	{
		return registry;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field Registry registry>
	//    2    4:areturn         
	}

	public RequestManagerRetriever getRequestManagerRetriever()
	{
		return requestManagerRetriever;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field RequestManagerRetriever requestManagerRetriever>
	//    2    4:areturn         
	}

	public void onConfigurationChanged(Configuration configuration)
	{
	//    0    0:return          
	}

	public void onLowMemory()
	{
		clearMemory();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #643 <Method void clearMemory()>
	//    2    4:return          
	}

	public void onTrimMemory(int i)
	{
		trimMemory(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #648 <Method void trimMemory(int)>
	//    3    5:return          
	}

	public transient void preFillBitmapPool(com.bumptech.glide.load.engine.prefill.PreFillType.Builder abuilder[])
	{
		bitmapPreFiller.preFill(abuilder);
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field BitmapPreFiller bitmapPreFiller>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #653 <Method void BitmapPreFiller.preFill(com.bumptech.glide.load.engine.prefill.PreFillType$Builder[])>
	//    4    8:return          
	}

	void registerRequestManager(RequestManager requestmanager)
	{
		List list = managers;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field List managers>
	//    2    4:astore_2        
		list;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(managers.contains(((Object) (requestmanager))))
	//*   5    7:aload_0         
	//*   6    8:getfield        #54  <Field List managers>
	//*   7   11:aload_1         
	//*   8   12:invokeinterface #656 <Method boolean List.contains(Object)>
	//*   9   17:ifeq            31
			throw new IllegalStateException("Cannot register already registered manager");
	//   10   20:new             #358 <Class IllegalStateException>
	//   11   23:dup             
	//   12   24:ldc2            #658 <String "Cannot register already registered manager">
	//   13   27:invokespecial   #363 <Method void IllegalStateException(String)>
	//   14   30:athrow          
		managers.add(((Object) (requestmanager)));
	//   15   31:aload_0         
	//   16   32:getfield        #54  <Field List managers>
	//   17   35:aload_1         
	//   18   36:invokeinterface #661 <Method boolean List.add(Object)>
	//   19   41:pop             
		list;
	//   20   42:aload_2         
		JVM INSTR monitorexit ;
	//   21   43:monitorexit     
		return;
	//   22   44:return          
		requestmanager;
	//   23   45:astore_1        
	//*  24   46:aload_2         
		throw requestmanager;
	//   25   47:monitorexit     
	//   26   48:aload_1         
	//   27   49:athrow          
	}

	void removeFromManagers(Target target)
	{
		List list = managers;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field List managers>
	//    2    4:astore_3        
		list;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Iterator iterator = managers.iterator();
	//    5    7:aload_0         
	//    6    8:getfield        #54  <Field List managers>
	//    7   11:invokeinterface #493 <Method Iterator List.iterator()>
	//    8   16:astore          4
		boolean flag;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_53;
	//    9   18:aload           4
	//   10   20:invokeinterface #498 <Method boolean Iterator.hasNext()>
	//   11   25:ifeq            53
			flag = ((RequestManager)iterator.next()).untrack(target);
	//   12   28:aload           4
	//   13   30:invokeinterface #501 <Method Object Iterator.next()>
	//   14   35:checkcast       #665 <Class RequestManager>
	//   15   38:aload_1         
	//   16   39:invokevirtual   #669 <Method boolean RequestManager.untrack(Target)>
	//   17   42:istore_2        
		} while(!flag);
	//   18   43:iload_2         
	//   19   44:ifeq            50
		list;
	//   20   47:aload_3         
		JVM INSTR monitorexit ;
	//   21   48:monitorexit     
		return;
	//   22   49:return          
	//*  23   50:goto            18
		list;
	//   24   53:aload_3         
		JVM INSTR monitorexit ;
	//   25   54:monitorexit     
		  goto _L1
	//*  26   55:goto            63
		target;
	//   27   58:astore_1        
	//*  28   59:aload_3         
		throw target;
	//   29   60:monitorexit     
	//   30   61:aload_1         
	//   31   62:athrow          
_L1:
		throw new IllegalStateException("Failed to remove target from managers");
	//   32   63:new             #358 <Class IllegalStateException>
	//   33   66:dup             
	//   34   67:ldc2            #671 <String "Failed to remove target from managers">
	//   35   70:invokespecial   #363 <Method void IllegalStateException(String)>
	//   36   73:athrow          
	}

	public MemoryCategory setMemoryCategory(MemoryCategory memorycategory)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #616 <Method void Util.assertMainThread()>
		memoryCache.setSizeMultiplier(memorycategory.getMultiplier());
	//    1    3:aload_0         
	//    2    4:getfield        #69  <Field MemoryCache memoryCache>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #678 <Method float MemoryCategory.getMultiplier()>
	//    5   11:invokeinterface #682 <Method void MemoryCache.setSizeMultiplier(float)>
		bitmapPool.setSizeMultiplier(memorycategory.getMultiplier());
	//    6   16:aload_0         
	//    7   17:getfield        #65  <Field BitmapPool bitmapPool>
	//    8   20:aload_1         
	//    9   21:invokevirtual   #678 <Method float MemoryCategory.getMultiplier()>
	//   10   24:invokeinterface #683 <Method void BitmapPool.setSizeMultiplier(float)>
		MemoryCategory memorycategory1 = memoryCategory;
	//   11   29:aload_0         
	//   12   30:getfield        #61  <Field MemoryCategory memoryCategory>
	//   13   33:astore_2        
		memoryCategory = memorycategory;
	//   14   34:aload_0         
	//   15   35:aload_1         
	//   16   36:putfield        #61  <Field MemoryCategory memoryCategory>
		return memorycategory1;
	//   17   39:aload_2         
	//   18   40:areturn         
	}

	public void trimMemory(int i)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #616 <Method void Util.assertMainThread()>
		memoryCache.trimMemory(i);
	//    1    3:aload_0         
	//    2    4:getfield        #69  <Field MemoryCache memoryCache>
	//    3    7:iload_1         
	//    4    8:invokeinterface #684 <Method void MemoryCache.trimMemory(int)>
		bitmapPool.trimMemory(i);
	//    5   13:aload_0         
	//    6   14:getfield        #65  <Field BitmapPool bitmapPool>
	//    7   17:iload_1         
	//    8   18:invokeinterface #685 <Method void BitmapPool.trimMemory(int)>
		arrayPool.trimMemory(i);
	//    9   23:aload_0         
	//   10   24:getfield        #67  <Field ArrayPool arrayPool>
	//   11   27:iload_1         
	//   12   28:invokeinterface #686 <Method void ArrayPool.trimMemory(int)>
	//   13   33:return          
	}

	void unregisterRequestManager(RequestManager requestmanager)
	{
		List list = managers;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field List managers>
	//    2    4:astore_2        
		list;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(!managers.contains(((Object) (requestmanager))))
	//*   5    7:aload_0         
	//*   6    8:getfield        #54  <Field List managers>
	//*   7   11:aload_1         
	//*   8   12:invokeinterface #656 <Method boolean List.contains(Object)>
	//*   9   17:ifne            31
			throw new IllegalStateException("Cannot register not yet registered manager");
	//   10   20:new             #358 <Class IllegalStateException>
	//   11   23:dup             
	//   12   24:ldc2            #689 <String "Cannot register not yet registered manager">
	//   13   27:invokespecial   #363 <Method void IllegalStateException(String)>
	//   14   30:athrow          
		managers.remove(((Object) (requestmanager)));
	//   15   31:aload_0         
	//   16   32:getfield        #54  <Field List managers>
	//   17   35:aload_1         
	//   18   36:invokeinterface #691 <Method boolean List.remove(Object)>
	//   19   41:pop             
		list;
	//   20   42:aload_2         
		JVM INSTR monitorexit ;
	//   21   43:monitorexit     
		return;
	//   22   44:return          
		requestmanager;
	//   23   45:astore_1        
	//*  24   46:aload_2         
		throw requestmanager;
	//   25   47:monitorexit     
	//   26   48:aload_1         
	//   27   49:athrow          
	}

	private static final String DEFAULT_DISK_CACHE_DIR = "image_manager_disk_cache";
	private static final String TAG = "Glide";
	private static volatile Glide glide;
	private static volatile boolean isInitializing = false;
	private final ArrayPool arrayPool;
	private final BitmapPool bitmapPool;
	private final BitmapPreFiller bitmapPreFiller;
	private final ConnectivityMonitorFactory connectivityMonitorFactory;
	private final Engine engine;
	private final GlideContext glideContext;
	private final List managers = new ArrayList();
	private final MemoryCache memoryCache;
	private MemoryCategory memoryCategory;
	private final Registry registry = new Registry();
	private final RequestManagerRetriever requestManagerRetriever;
}
