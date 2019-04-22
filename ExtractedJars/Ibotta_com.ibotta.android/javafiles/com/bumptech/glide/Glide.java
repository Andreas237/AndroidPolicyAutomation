// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.*;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
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
import com.bumptech.glide.load.resource.bitmap.ExifInterfaceImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.ResourceBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.StreamBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.UnitBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import com.bumptech.glide.load.resource.drawable.UnitDrawableDecoder;
import com.bumptech.glide.load.resource.file.FileDecoder;
import com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.GifDrawableEncoder;
import com.bumptech.glide.load.resource.gif.GifFrameResourceDecoder;
import com.bumptech.glide.load.resource.gif.StreamGifDecoder;
import com.bumptech.glide.load.resource.transcode.BitmapBytesTranscoder;
import com.bumptech.glide.load.resource.transcode.BitmapDrawableTranscoder;
import com.bumptech.glide.load.resource.transcode.DrawableBytesTranscoder;
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
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.*;

// Referenced classes of package com.bumptech.glide:
//			MemoryCategory, Registry, GlideContext, GeneratedAppGlideModule, 
//			GlideBuilder, RequestManager

public class Glide
	implements ComponentCallbacks2
{

	Glide(Context context, Engine engine1, MemoryCache memorycache, BitmapPool bitmappool, ArrayPool arraypool, RequestManagerRetriever requestmanagerretriever, ConnectivityMonitorFactory connectivitymonitorfactory, 
			int i, RequestOptions requestoptions, Map map, List list, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #41  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #42  <Method void ArrayList()>
	//    6   12:putfield        #44  <Field List managers>
		memoryCategory = MemoryCategory.NORMAL;
	//    7   15:aload_0         
	//    8   16:getstatic       #49  <Field MemoryCategory MemoryCategory.NORMAL>
	//    9   19:putfield        #51  <Field MemoryCategory memoryCategory>
		engine = engine1;
	//   10   22:aload_0         
	//   11   23:aload_2         
	//   12   24:putfield        #53  <Field Engine engine>
		bitmapPool = bitmappool;
	//   13   27:aload_0         
	//   14   28:aload           4
	//   15   30:putfield        #55  <Field BitmapPool bitmapPool>
		arrayPool = arraypool;
	//   16   33:aload_0         
	//   17   34:aload           5
	//   18   36:putfield        #57  <Field ArrayPool arrayPool>
		memoryCache = memorycache;
	//   19   39:aload_0         
	//   20   40:aload_3         
	//   21   41:putfield        #59  <Field MemoryCache memoryCache>
		requestManagerRetriever = requestmanagerretriever;
	//   22   44:aload_0         
	//   23   45:aload           6
	//   24   47:putfield        #61  <Field RequestManagerRetriever requestManagerRetriever>
		connectivityMonitorFactory = connectivitymonitorfactory;
	//   25   50:aload_0         
	//   26   51:aload           7
	//   27   53:putfield        #63  <Field ConnectivityMonitorFactory connectivityMonitorFactory>
		bitmapPreFiller = new BitmapPreFiller(memorycache, bitmappool, (DecodeFormat)requestoptions.getOptions().get(Downsampler.DECODE_FORMAT));
	//   28   56:aload_0         
	//   29   57:new             #65  <Class BitmapPreFiller>
	//   30   60:dup             
	//   31   61:aload_3         
	//   32   62:aload           4
	//   33   64:aload           9
	//   34   66:invokevirtual   #71  <Method Options RequestOptions.getOptions()>
	//   35   69:getstatic       #77  <Field com.bumptech.glide.load.Option Downsampler.DECODE_FORMAT>
	//   36   72:invokevirtual   #83  <Method Object Options.get(com.bumptech.glide.load.Option)>
	//   37   75:checkcast       #85  <Class DecodeFormat>
	//   38   78:invokespecial   #88  <Method void BitmapPreFiller(MemoryCache, BitmapPool, DecodeFormat)>
	//   39   81:putfield        #90  <Field BitmapPreFiller bitmapPreFiller>
		memorycache = ((MemoryCache) (context.getResources()));
	//   40   84:aload_1         
	//   41   85:invokevirtual   #96  <Method Resources Context.getResources()>
	//   42   88:astore_3        
	//   43   89:aload_0         
	//   44   90:new             #98  <Class Registry>
	//   45   93:dup             
	//   46   94:invokespecial   #99  <Method void Registry()>
	//   47   97:putfield        #101 <Field Registry registry>
		registry.register(((com.bumptech.glide.load.ImageHeaderParser) (new DefaultImageHeaderParser())));
	//   48  100:aload_0         
	//   49  101:getfield        #101 <Field Registry registry>
	//   50  104:new             #103 <Class DefaultImageHeaderParser>
	//   51  107:dup             
	//   52  108:invokespecial   #104 <Method void DefaultImageHeaderParser()>
	//   53  111:invokevirtual   #108 <Method Registry Registry.register(com.bumptech.glide.load.ImageHeaderParser)>
	//   54  114:pop             
		if(android.os.Build.VERSION.SDK_INT >= 27)
	//*  55  115:getstatic       #114 <Field int android.os.Build$VERSION.SDK_INT>
	//*  56  118:bipush          27
	//*  57  120:icmplt          138
			registry.register(((com.bumptech.glide.load.ImageHeaderParser) (new ExifInterfaceImageHeaderParser())));
	//   58  123:aload_0         
	//   59  124:getfield        #101 <Field Registry registry>
	//   60  127:new             #116 <Class ExifInterfaceImageHeaderParser>
	//   61  130:dup             
	//   62  131:invokespecial   #117 <Method void ExifInterfaceImageHeaderParser()>
	//   63  134:invokevirtual   #108 <Method Registry Registry.register(com.bumptech.glide.load.ImageHeaderParser)>
	//   64  137:pop             
		requestmanagerretriever = ((RequestManagerRetriever) (registry.getImageHeaderParsers()));
	//   65  138:aload_0         
	//   66  139:getfield        #101 <Field Registry registry>
	//   67  142:invokevirtual   #121 <Method List Registry.getImageHeaderParsers()>
	//   68  145:astore          6
		Object obj = ((Object) (new Downsampler(((List) (requestmanagerretriever)), ((Resources) (memorycache)).getDisplayMetrics(), bitmappool, arraypool)));
	//   69  147:new             #73  <Class Downsampler>
	//   70  150:dup             
	//   71  151:aload           6
	//   72  153:aload_3         
	//   73  154:invokevirtual   #127 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   74  157:aload           4
	//   75  159:aload           5
	//   76  161:invokespecial   #130 <Method void Downsampler(List, android.util.DisplayMetrics, BitmapPool, ArrayPool)>
	//   77  164:astore          15
		connectivitymonitorfactory = ((ConnectivityMonitorFactory) (new ByteBufferGifDecoder(context, ((List) (requestmanagerretriever)), bitmappool, arraypool)));
	//   78  166:new             #132 <Class ByteBufferGifDecoder>
	//   79  169:dup             
	//   80  170:aload_1         
	//   81  171:aload           6
	//   82  173:aload           4
	//   83  175:aload           5
	//   84  177:invokespecial   #135 <Method void ByteBufferGifDecoder(Context, List, BitmapPool, ArrayPool)>
	//   85  180:astore          7
		com.bumptech.glide.load.ResourceDecoder resourcedecoder = VideoDecoder.parcel(bitmappool);
	//   86  182:aload           4
	//   87  184:invokestatic    #141 <Method com.bumptech.glide.load.ResourceDecoder VideoDecoder.parcel(BitmapPool)>
	//   88  187:astore          13
		ByteBufferBitmapDecoder bytebufferbitmapdecoder = new ByteBufferBitmapDecoder(((Downsampler) (obj)));
	//   89  189:new             #143 <Class ByteBufferBitmapDecoder>
	//   90  192:dup             
	//   91  193:aload           15
	//   92  195:invokespecial   #146 <Method void ByteBufferBitmapDecoder(Downsampler)>
	//   93  198:astore          14
		obj = ((Object) (new StreamBitmapDecoder(((Downsampler) (obj)), arraypool)));
	//   94  200:new             #148 <Class StreamBitmapDecoder>
	//   95  203:dup             
	//   96  204:aload           15
	//   97  206:aload           5
	//   98  208:invokespecial   #151 <Method void StreamBitmapDecoder(Downsampler, ArrayPool)>
	//   99  211:astore          15
		ResourceDrawableDecoder resourcedrawabledecoder = new ResourceDrawableDecoder(context);
	//  100  213:new             #153 <Class ResourceDrawableDecoder>
	//  101  216:dup             
	//  102  217:aload_1         
	//  103  218:invokespecial   #156 <Method void ResourceDrawableDecoder(Context)>
	//  104  221:astore          16
		com.bumptech.glide.load.model.ResourceLoader.StreamFactory streamfactory = new com.bumptech.glide.load.model.ResourceLoader.StreamFactory(((Resources) (memorycache)));
	//  105  223:new             #158 <Class com.bumptech.glide.load.model.ResourceLoader$StreamFactory>
	//  106  226:dup             
	//  107  227:aload_3         
	//  108  228:invokespecial   #161 <Method void com.bumptech.glide.load.model.ResourceLoader$StreamFactory(Resources)>
	//  109  231:astore          17
		com.bumptech.glide.load.model.ResourceLoader.UriFactory urifactory = new com.bumptech.glide.load.model.ResourceLoader.UriFactory(((Resources) (memorycache)));
	//  110  233:new             #163 <Class com.bumptech.glide.load.model.ResourceLoader$UriFactory>
	//  111  236:dup             
	//  112  237:aload_3         
	//  113  238:invokespecial   #164 <Method void com.bumptech.glide.load.model.ResourceLoader$UriFactory(Resources)>
	//  114  241:astore          18
		com.bumptech.glide.load.model.ResourceLoader.FileDescriptorFactory filedescriptorfactory = new com.bumptech.glide.load.model.ResourceLoader.FileDescriptorFactory(((Resources) (memorycache)));
	//  115  243:new             #166 <Class com.bumptech.glide.load.model.ResourceLoader$FileDescriptorFactory>
	//  116  246:dup             
	//  117  247:aload_3         
	//  118  248:invokespecial   #167 <Method void com.bumptech.glide.load.model.ResourceLoader$FileDescriptorFactory(Resources)>
	//  119  251:astore          19
		com.bumptech.glide.load.model.ResourceLoader.AssetFileDescriptorFactory assetfiledescriptorfactory = new com.bumptech.glide.load.model.ResourceLoader.AssetFileDescriptorFactory(((Resources) (memorycache)));
	//  120  253:new             #169 <Class com.bumptech.glide.load.model.ResourceLoader$AssetFileDescriptorFactory>
	//  121  256:dup             
	//  122  257:aload_3         
	//  123  258:invokespecial   #170 <Method void com.bumptech.glide.load.model.ResourceLoader$AssetFileDescriptorFactory(Resources)>
	//  124  261:astore          20
		BitmapEncoder bitmapencoder = new BitmapEncoder(arraypool);
	//  125  263:new             #172 <Class BitmapEncoder>
	//  126  266:dup             
	//  127  267:aload           5
	//  128  269:invokespecial   #175 <Method void BitmapEncoder(ArrayPool)>
	//  129  272:astore          21
		BitmapBytesTranscoder bitmapbytestranscoder = new BitmapBytesTranscoder();
	//  130  274:new             #177 <Class BitmapBytesTranscoder>
	//  131  277:dup             
	//  132  278:invokespecial   #178 <Method void BitmapBytesTranscoder()>
	//  133  281:astore          22
		GifDrawableBytesTranscoder gifdrawablebytestranscoder = new GifDrawableBytesTranscoder();
	//  134  283:new             #180 <Class GifDrawableBytesTranscoder>
	//  135  286:dup             
	//  136  287:invokespecial   #181 <Method void GifDrawableBytesTranscoder()>
	//  137  290:astore          23
		android.content.ContentResolver contentresolver = context.getContentResolver();
	//  138  292:aload_1         
	//  139  293:invokevirtual   #185 <Method android.content.ContentResolver Context.getContentResolver()>
	//  140  296:astore          24
		registry.append(java/nio/ByteBuffer, ((com.bumptech.glide.load.Encoder) (new ByteBufferEncoder()))).append(java/io/InputStream, ((com.bumptech.glide.load.Encoder) (new StreamEncoder(arraypool)))).append("Bitmap", java/nio/ByteBuffer, android/graphics/Bitmap, ((com.bumptech.glide.load.ResourceDecoder) (bytebufferbitmapdecoder))).append("Bitmap", java/io/InputStream, android/graphics/Bitmap, ((com.bumptech.glide.load.ResourceDecoder) (obj))).append("Bitmap", android/os/ParcelFileDescriptor, android/graphics/Bitmap, resourcedecoder).append("Bitmap", android/content/res/AssetFileDescriptor, android/graphics/Bitmap, VideoDecoder.asset(bitmappool)).append(android/graphics/Bitmap, android/graphics/Bitmap, ((com.bumptech.glide.load.model.ModelLoaderFactory) (com.bumptech.glide.load.model.UnitModelLoader.Factory.getInstance()))).append("Bitmap", android/graphics/Bitmap, android/graphics/Bitmap, ((com.bumptech.glide.load.ResourceDecoder) (new UnitBitmapDecoder()))).append(android/graphics/Bitmap, ((com.bumptech.glide.load.ResourceEncoder) (bitmapencoder))).append("BitmapDrawable", java/nio/ByteBuffer, android/graphics/drawable/BitmapDrawable, ((com.bumptech.glide.load.ResourceDecoder) (new BitmapDrawableDecoder(((Resources) (memorycache)), ((com.bumptech.glide.load.ResourceDecoder) (bytebufferbitmapdecoder)))))).append("BitmapDrawable", java/io/InputStream, android/graphics/drawable/BitmapDrawable, ((com.bumptech.glide.load.ResourceDecoder) (new BitmapDrawableDecoder(((Resources) (memorycache)), ((com.bumptech.glide.load.ResourceDecoder) (obj)))))).append("BitmapDrawable", android/os/ParcelFileDescriptor, android/graphics/drawable/BitmapDrawable, ((com.bumptech.glide.load.ResourceDecoder) (new BitmapDrawableDecoder(((Resources) (memorycache)), resourcedecoder)))).append(android/graphics/drawable/BitmapDrawable, ((com.bumptech.glide.load.ResourceEncoder) (new BitmapDrawableEncoder(bitmappool, ((com.bumptech.glide.load.ResourceEncoder) (bitmapencoder)))))).append("Gif", java/io/InputStream, com/bumptech/glide/load/resource/gif/GifDrawable, ((com.bumptech.glide.load.ResourceDecoder) (new StreamGifDecoder(((List) (requestmanagerretriever)), ((com.bumptech.glide.load.ResourceDecoder) (connectivitymonitorfactory)), arraypool)))).append("Gif", java/nio/ByteBuffer, com/bumptech/glide/load/resource/gif/GifDrawable, ((com.bumptech.glide.load.ResourceDecoder) (connectivitymonitorfactory))).append(com/bumptech/glide/load/resource/gif/GifDrawable, ((com.bumptech.glide.load.ResourceEncoder) (new GifDrawableEncoder()))).append(com/bumptech/glide/gifdecoder/GifDecoder, com/bumptech/glide/gifdecoder/GifDecoder, ((com.bumptech.glide.load.model.ModelLoaderFactory) (com.bumptech.glide.load.model.UnitModelLoader.Factory.getInstance()))).append("Bitmap", com/bumptech/glide/gifdecoder/GifDecoder, android/graphics/Bitmap, ((com.bumptech.glide.load.ResourceDecoder) (new GifFrameResourceDecoder(bitmappool)))).append(android/net/Uri, android/graphics/drawable/Drawable, ((com.bumptech.glide.load.ResourceDecoder) (resourcedrawabledecoder))).append(android/net/Uri, android/graphics/Bitmap, ((com.bumptech.glide.load.ResourceDecoder) (new ResourceBitmapDecoder(resourcedrawabledecoder, bitmappool)))).register(((com.bumptech.glide.load.data.DataRewinder.Factory) (new com.bumptech.glide.load.resource.bytes.ByteBufferRewinder.Factory()))).append(java/io/File, java/nio/ByteBuffer, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.ByteBufferFileLoader.Factory()))).append(java/io/File, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.FileLoader.StreamFactory()))).append(java/io/File, java/io/File, ((com.bumptech.glide.load.ResourceDecoder) (new FileDecoder()))).append(java/io/File, android/os/ParcelFileDescriptor, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.FileLoader.FileDescriptorFactory()))).append(java/io/File, java/io/File, ((com.bumptech.glide.load.model.ModelLoaderFactory) (com.bumptech.glide.load.model.UnitModelLoader.Factory.getInstance()))).register(((com.bumptech.glide.load.data.DataRewinder.Factory) (new com.bumptech.glide.load.data.InputStreamRewinder.Factory(arraypool)))).append(Integer.TYPE, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (streamfactory))).append(Integer.TYPE, android/os/ParcelFileDescriptor, ((com.bumptech.glide.load.model.ModelLoaderFactory) (filedescriptorfactory))).append(java/lang/Integer, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (streamfactory))).append(java/lang/Integer, android/os/ParcelFileDescriptor, ((com.bumptech.glide.load.model.ModelLoaderFactory) (filedescriptorfactory))).append(java/lang/Integer, android/net/Uri, ((com.bumptech.glide.load.model.ModelLoaderFactory) (urifactory))).append(Integer.TYPE, android/content/res/AssetFileDescriptor, ((com.bumptech.glide.load.model.ModelLoaderFactory) (assetfiledescriptorfactory))).append(java/lang/Integer, android/content/res/AssetFileDescriptor, ((com.bumptech.glide.load.model.ModelLoaderFactory) (assetfiledescriptorfactory))).append(Integer.TYPE, android/net/Uri, ((com.bumptech.glide.load.model.ModelLoaderFactory) (urifactory))).append(java/lang/String, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.DataUrlLoader.StreamFactory()))).append(android/net/Uri, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.DataUrlLoader.StreamFactory()))).append(java/lang/String, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.StringLoader.StreamFactory()))).append(java/lang/String, android/os/ParcelFileDescriptor, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.StringLoader.FileDescriptorFactory()))).append(java/lang/String, android/content/res/AssetFileDescriptor, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.StringLoader.AssetFileDescriptorFactory()))).append(android/net/Uri, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.stream.HttpUriLoader.Factory()))).append(android/net/Uri, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.AssetUriLoader.StreamFactory(context.getAssets())))).append(android/net/Uri, android/os/ParcelFileDescriptor, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.AssetUriLoader.FileDescriptorFactory(context.getAssets())))).append(android/net/Uri, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.stream.MediaStoreImageThumbLoader.Factory(context)))).append(android/net/Uri, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.stream.MediaStoreVideoThumbLoader.Factory(context)))).append(android/net/Uri, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.UriLoader.StreamFactory(contentresolver)))).append(android/net/Uri, android/os/ParcelFileDescriptor, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.UriLoader.FileDescriptorFactory(contentresolver)))).append(android/net/Uri, android/content/res/AssetFileDescriptor, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.UriLoader.AssetFileDescriptorFactory(contentresolver)))).append(android/net/Uri, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.UrlUriLoader.StreamFactory()))).append(java/net/URL, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.stream.UrlLoader.StreamFactory()))).append(android/net/Uri, java/io/File, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.MediaStoreFileLoader.Factory(context)))).append(com/bumptech/glide/load/model/GlideUrl, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Factory()))).append([B, java/nio/ByteBuffer, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.ByteArrayLoader.ByteBufferFactory()))).append([B, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.ByteArrayLoader.StreamFactory()))).append(android/net/Uri, android/net/Uri, ((com.bumptech.glide.load.model.ModelLoaderFactory) (com.bumptech.glide.load.model.UnitModelLoader.Factory.getInstance()))).append(android/graphics/drawable/Drawable, android/graphics/drawable/Drawable, ((com.bumptech.glide.load.model.ModelLoaderFactory) (com.bumptech.glide.load.model.UnitModelLoader.Factory.getInstance()))).append(android/graphics/drawable/Drawable, android/graphics/drawable/Drawable, ((com.bumptech.glide.load.ResourceDecoder) (new UnitDrawableDecoder()))).register(android/graphics/Bitmap, android/graphics/drawable/BitmapDrawable, ((com.bumptech.glide.load.resource.transcode.ResourceTranscoder) (new BitmapDrawableTranscoder(((Resources) (memorycache)))))).register(android/graphics/Bitmap, [B, ((com.bumptech.glide.load.resource.transcode.ResourceTranscoder) (bitmapbytestranscoder))).register(android/graphics/drawable/Drawable, [B, ((com.bumptech.glide.load.resource.transcode.ResourceTranscoder) (new DrawableBytesTranscoder(bitmappool, ((com.bumptech.glide.load.resource.transcode.ResourceTranscoder) (bitmapbytestranscoder)), ((com.bumptech.glide.load.resource.transcode.ResourceTranscoder) (gifdrawablebytestranscoder)))))).register(com/bumptech/glide/load/resource/gif/GifDrawable, [B, ((com.bumptech.glide.load.resource.transcode.ResourceTranscoder) (gifdrawablebytestranscoder)));
	//  141  298:aload_0         
	//  142  299:getfield        #101 <Field Registry registry>
	//  143  302:ldc1            #187 <Class ByteBuffer>
	//  144  304:new             #189 <Class ByteBufferEncoder>
	//  145  307:dup             
	//  146  308:invokespecial   #190 <Method void ByteBufferEncoder()>
	//  147  311:invokevirtual   #194 <Method Registry Registry.append(Class, com.bumptech.glide.load.Encoder)>
	//  148  314:ldc1            #196 <Class InputStream>
	//  149  316:new             #198 <Class StreamEncoder>
	//  150  319:dup             
	//  151  320:aload           5
	//  152  322:invokespecial   #199 <Method void StreamEncoder(ArrayPool)>
	//  153  325:invokevirtual   #194 <Method Registry Registry.append(Class, com.bumptech.glide.load.Encoder)>
	//  154  328:ldc1            #201 <String "Bitmap">
	//  155  330:ldc1            #187 <Class ByteBuffer>
	//  156  332:ldc1            #203 <Class Bitmap>
	//  157  334:aload           14
	//  158  336:invokevirtual   #206 <Method Registry Registry.append(String, Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  159  339:ldc1            #201 <String "Bitmap">
	//  160  341:ldc1            #196 <Class InputStream>
	//  161  343:ldc1            #203 <Class Bitmap>
	//  162  345:aload           15
	//  163  347:invokevirtual   #206 <Method Registry Registry.append(String, Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  164  350:ldc1            #201 <String "Bitmap">
	//  165  352:ldc1            #208 <Class ParcelFileDescriptor>
	//  166  354:ldc1            #203 <Class Bitmap>
	//  167  356:aload           13
	//  168  358:invokevirtual   #206 <Method Registry Registry.append(String, Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  169  361:ldc1            #201 <String "Bitmap">
	//  170  363:ldc1            #210 <Class AssetFileDescriptor>
	//  171  365:ldc1            #203 <Class Bitmap>
	//  172  367:aload           4
	//  173  369:invokestatic    #213 <Method com.bumptech.glide.load.ResourceDecoder VideoDecoder.asset(BitmapPool)>
	//  174  372:invokevirtual   #206 <Method Registry Registry.append(String, Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  175  375:ldc1            #203 <Class Bitmap>
	//  176  377:ldc1            #203 <Class Bitmap>
	//  177  379:invokestatic    #219 <Method com.bumptech.glide.load.model.UnitModelLoader$Factory com.bumptech.glide.load.model.UnitModelLoader$Factory.getInstance()>
	//  178  382:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  179  385:ldc1            #201 <String "Bitmap">
	//  180  387:ldc1            #203 <Class Bitmap>
	//  181  389:ldc1            #203 <Class Bitmap>
	//  182  391:new             #224 <Class UnitBitmapDecoder>
	//  183  394:dup             
	//  184  395:invokespecial   #225 <Method void UnitBitmapDecoder()>
	//  185  398:invokevirtual   #206 <Method Registry Registry.append(String, Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  186  401:ldc1            #203 <Class Bitmap>
	//  187  403:aload           21
	//  188  405:invokevirtual   #228 <Method Registry Registry.append(Class, com.bumptech.glide.load.ResourceEncoder)>
	//  189  408:ldc1            #230 <String "BitmapDrawable">
	//  190  410:ldc1            #187 <Class ByteBuffer>
	//  191  412:ldc1            #232 <Class BitmapDrawable>
	//  192  414:new             #234 <Class BitmapDrawableDecoder>
	//  193  417:dup             
	//  194  418:aload_3         
	//  195  419:aload           14
	//  196  421:invokespecial   #237 <Method void BitmapDrawableDecoder(Resources, com.bumptech.glide.load.ResourceDecoder)>
	//  197  424:invokevirtual   #206 <Method Registry Registry.append(String, Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  198  427:ldc1            #230 <String "BitmapDrawable">
	//  199  429:ldc1            #196 <Class InputStream>
	//  200  431:ldc1            #232 <Class BitmapDrawable>
	//  201  433:new             #234 <Class BitmapDrawableDecoder>
	//  202  436:dup             
	//  203  437:aload_3         
	//  204  438:aload           15
	//  205  440:invokespecial   #237 <Method void BitmapDrawableDecoder(Resources, com.bumptech.glide.load.ResourceDecoder)>
	//  206  443:invokevirtual   #206 <Method Registry Registry.append(String, Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  207  446:ldc1            #230 <String "BitmapDrawable">
	//  208  448:ldc1            #208 <Class ParcelFileDescriptor>
	//  209  450:ldc1            #232 <Class BitmapDrawable>
	//  210  452:new             #234 <Class BitmapDrawableDecoder>
	//  211  455:dup             
	//  212  456:aload_3         
	//  213  457:aload           13
	//  214  459:invokespecial   #237 <Method void BitmapDrawableDecoder(Resources, com.bumptech.glide.load.ResourceDecoder)>
	//  215  462:invokevirtual   #206 <Method Registry Registry.append(String, Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  216  465:ldc1            #232 <Class BitmapDrawable>
	//  217  467:new             #239 <Class BitmapDrawableEncoder>
	//  218  470:dup             
	//  219  471:aload           4
	//  220  473:aload           21
	//  221  475:invokespecial   #242 <Method void BitmapDrawableEncoder(BitmapPool, com.bumptech.glide.load.ResourceEncoder)>
	//  222  478:invokevirtual   #228 <Method Registry Registry.append(Class, com.bumptech.glide.load.ResourceEncoder)>
	//  223  481:ldc1            #244 <String "Gif">
	//  224  483:ldc1            #196 <Class InputStream>
	//  225  485:ldc1            #246 <Class GifDrawable>
	//  226  487:new             #248 <Class StreamGifDecoder>
	//  227  490:dup             
	//  228  491:aload           6
	//  229  493:aload           7
	//  230  495:aload           5
	//  231  497:invokespecial   #251 <Method void StreamGifDecoder(List, com.bumptech.glide.load.ResourceDecoder, ArrayPool)>
	//  232  500:invokevirtual   #206 <Method Registry Registry.append(String, Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  233  503:ldc1            #244 <String "Gif">
	//  234  505:ldc1            #187 <Class ByteBuffer>
	//  235  507:ldc1            #246 <Class GifDrawable>
	//  236  509:aload           7
	//  237  511:invokevirtual   #206 <Method Registry Registry.append(String, Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  238  514:ldc1            #246 <Class GifDrawable>
	//  239  516:new             #253 <Class GifDrawableEncoder>
	//  240  519:dup             
	//  241  520:invokespecial   #254 <Method void GifDrawableEncoder()>
	//  242  523:invokevirtual   #228 <Method Registry Registry.append(Class, com.bumptech.glide.load.ResourceEncoder)>
	//  243  526:ldc2            #256 <Class GifDecoder>
	//  244  529:ldc2            #256 <Class GifDecoder>
	//  245  532:invokestatic    #219 <Method com.bumptech.glide.load.model.UnitModelLoader$Factory com.bumptech.glide.load.model.UnitModelLoader$Factory.getInstance()>
	//  246  535:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  247  538:ldc1            #201 <String "Bitmap">
	//  248  540:ldc2            #256 <Class GifDecoder>
	//  249  543:ldc1            #203 <Class Bitmap>
	//  250  545:new             #258 <Class GifFrameResourceDecoder>
	//  251  548:dup             
	//  252  549:aload           4
	//  253  551:invokespecial   #261 <Method void GifFrameResourceDecoder(BitmapPool)>
	//  254  554:invokevirtual   #206 <Method Registry Registry.append(String, Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  255  557:ldc2            #263 <Class Uri>
	//  256  560:ldc2            #265 <Class Drawable>
	//  257  563:aload           16
	//  258  565:invokevirtual   #268 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  259  568:ldc2            #263 <Class Uri>
	//  260  571:ldc1            #203 <Class Bitmap>
	//  261  573:new             #270 <Class ResourceBitmapDecoder>
	//  262  576:dup             
	//  263  577:aload           16
	//  264  579:aload           4
	//  265  581:invokespecial   #273 <Method void ResourceBitmapDecoder(ResourceDrawableDecoder, BitmapPool)>
	//  266  584:invokevirtual   #268 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  267  587:new             #275 <Class com.bumptech.glide.load.resource.bytes.ByteBufferRewinder$Factory>
	//  268  590:dup             
	//  269  591:invokespecial   #276 <Method void com.bumptech.glide.load.resource.bytes.ByteBufferRewinder$Factory()>
	//  270  594:invokevirtual   #279 <Method Registry Registry.register(com.bumptech.glide.load.data.DataRewinder$Factory)>
	//  271  597:ldc2            #281 <Class File>
	//  272  600:ldc1            #187 <Class ByteBuffer>
	//  273  602:new             #283 <Class com.bumptech.glide.load.model.ByteBufferFileLoader$Factory>
	//  274  605:dup             
	//  275  606:invokespecial   #284 <Method void com.bumptech.glide.load.model.ByteBufferFileLoader$Factory()>
	//  276  609:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  277  612:ldc2            #281 <Class File>
	//  278  615:ldc1            #196 <Class InputStream>
	//  279  617:new             #286 <Class com.bumptech.glide.load.model.FileLoader$StreamFactory>
	//  280  620:dup             
	//  281  621:invokespecial   #287 <Method void com.bumptech.glide.load.model.FileLoader$StreamFactory()>
	//  282  624:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  283  627:ldc2            #281 <Class File>
	//  284  630:ldc2            #281 <Class File>
	//  285  633:new             #289 <Class FileDecoder>
	//  286  636:dup             
	//  287  637:invokespecial   #290 <Method void FileDecoder()>
	//  288  640:invokevirtual   #268 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  289  643:ldc2            #281 <Class File>
	//  290  646:ldc1            #208 <Class ParcelFileDescriptor>
	//  291  648:new             #292 <Class com.bumptech.glide.load.model.FileLoader$FileDescriptorFactory>
	//  292  651:dup             
	//  293  652:invokespecial   #293 <Method void com.bumptech.glide.load.model.FileLoader$FileDescriptorFactory()>
	//  294  655:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  295  658:ldc2            #281 <Class File>
	//  296  661:ldc2            #281 <Class File>
	//  297  664:invokestatic    #219 <Method com.bumptech.glide.load.model.UnitModelLoader$Factory com.bumptech.glide.load.model.UnitModelLoader$Factory.getInstance()>
	//  298  667:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  299  670:new             #295 <Class com.bumptech.glide.load.data.InputStreamRewinder$Factory>
	//  300  673:dup             
	//  301  674:aload           5
	//  302  676:invokespecial   #296 <Method void com.bumptech.glide.load.data.InputStreamRewinder$Factory(ArrayPool)>
	//  303  679:invokevirtual   #279 <Method Registry Registry.register(com.bumptech.glide.load.data.DataRewinder$Factory)>
	//  304  682:getstatic       #302 <Field Class Integer.TYPE>
	//  305  685:ldc1            #196 <Class InputStream>
	//  306  687:aload           17
	//  307  689:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  308  692:getstatic       #302 <Field Class Integer.TYPE>
	//  309  695:ldc1            #208 <Class ParcelFileDescriptor>
	//  310  697:aload           19
	//  311  699:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  312  702:ldc2            #298 <Class Integer>
	//  313  705:ldc1            #196 <Class InputStream>
	//  314  707:aload           17
	//  315  709:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  316  712:ldc2            #298 <Class Integer>
	//  317  715:ldc1            #208 <Class ParcelFileDescriptor>
	//  318  717:aload           19
	//  319  719:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  320  722:ldc2            #298 <Class Integer>
	//  321  725:ldc2            #263 <Class Uri>
	//  322  728:aload           18
	//  323  730:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  324  733:getstatic       #302 <Field Class Integer.TYPE>
	//  325  736:ldc1            #210 <Class AssetFileDescriptor>
	//  326  738:aload           20
	//  327  740:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  328  743:ldc2            #298 <Class Integer>
	//  329  746:ldc1            #210 <Class AssetFileDescriptor>
	//  330  748:aload           20
	//  331  750:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  332  753:getstatic       #302 <Field Class Integer.TYPE>
	//  333  756:ldc2            #263 <Class Uri>
	//  334  759:aload           18
	//  335  761:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  336  764:ldc2            #304 <Class String>
	//  337  767:ldc1            #196 <Class InputStream>
	//  338  769:new             #306 <Class com.bumptech.glide.load.model.DataUrlLoader$StreamFactory>
	//  339  772:dup             
	//  340  773:invokespecial   #307 <Method void com.bumptech.glide.load.model.DataUrlLoader$StreamFactory()>
	//  341  776:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  342  779:ldc2            #263 <Class Uri>
	//  343  782:ldc1            #196 <Class InputStream>
	//  344  784:new             #306 <Class com.bumptech.glide.load.model.DataUrlLoader$StreamFactory>
	//  345  787:dup             
	//  346  788:invokespecial   #307 <Method void com.bumptech.glide.load.model.DataUrlLoader$StreamFactory()>
	//  347  791:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  348  794:ldc2            #304 <Class String>
	//  349  797:ldc1            #196 <Class InputStream>
	//  350  799:new             #309 <Class com.bumptech.glide.load.model.StringLoader$StreamFactory>
	//  351  802:dup             
	//  352  803:invokespecial   #310 <Method void com.bumptech.glide.load.model.StringLoader$StreamFactory()>
	//  353  806:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  354  809:ldc2            #304 <Class String>
	//  355  812:ldc1            #208 <Class ParcelFileDescriptor>
	//  356  814:new             #312 <Class com.bumptech.glide.load.model.StringLoader$FileDescriptorFactory>
	//  357  817:dup             
	//  358  818:invokespecial   #313 <Method void com.bumptech.glide.load.model.StringLoader$FileDescriptorFactory()>
	//  359  821:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  360  824:ldc2            #304 <Class String>
	//  361  827:ldc1            #210 <Class AssetFileDescriptor>
	//  362  829:new             #315 <Class com.bumptech.glide.load.model.StringLoader$AssetFileDescriptorFactory>
	//  363  832:dup             
	//  364  833:invokespecial   #316 <Method void com.bumptech.glide.load.model.StringLoader$AssetFileDescriptorFactory()>
	//  365  836:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  366  839:ldc2            #263 <Class Uri>
	//  367  842:ldc1            #196 <Class InputStream>
	//  368  844:new             #318 <Class com.bumptech.glide.load.model.stream.HttpUriLoader$Factory>
	//  369  847:dup             
	//  370  848:invokespecial   #319 <Method void com.bumptech.glide.load.model.stream.HttpUriLoader$Factory()>
	//  371  851:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  372  854:ldc2            #263 <Class Uri>
	//  373  857:ldc1            #196 <Class InputStream>
	//  374  859:new             #321 <Class com.bumptech.glide.load.model.AssetUriLoader$StreamFactory>
	//  375  862:dup             
	//  376  863:aload_1         
	//  377  864:invokevirtual   #325 <Method android.content.res.AssetManager Context.getAssets()>
	//  378  867:invokespecial   #328 <Method void com.bumptech.glide.load.model.AssetUriLoader$StreamFactory(android.content.res.AssetManager)>
	//  379  870:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  380  873:ldc2            #263 <Class Uri>
	//  381  876:ldc1            #208 <Class ParcelFileDescriptor>
	//  382  878:new             #330 <Class com.bumptech.glide.load.model.AssetUriLoader$FileDescriptorFactory>
	//  383  881:dup             
	//  384  882:aload_1         
	//  385  883:invokevirtual   #325 <Method android.content.res.AssetManager Context.getAssets()>
	//  386  886:invokespecial   #331 <Method void com.bumptech.glide.load.model.AssetUriLoader$FileDescriptorFactory(android.content.res.AssetManager)>
	//  387  889:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  388  892:ldc2            #263 <Class Uri>
	//  389  895:ldc1            #196 <Class InputStream>
	//  390  897:new             #333 <Class com.bumptech.glide.load.model.stream.MediaStoreImageThumbLoader$Factory>
	//  391  900:dup             
	//  392  901:aload_1         
	//  393  902:invokespecial   #334 <Method void com.bumptech.glide.load.model.stream.MediaStoreImageThumbLoader$Factory(Context)>
	//  394  905:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  395  908:ldc2            #263 <Class Uri>
	//  396  911:ldc1            #196 <Class InputStream>
	//  397  913:new             #336 <Class com.bumptech.glide.load.model.stream.MediaStoreVideoThumbLoader$Factory>
	//  398  916:dup             
	//  399  917:aload_1         
	//  400  918:invokespecial   #337 <Method void com.bumptech.glide.load.model.stream.MediaStoreVideoThumbLoader$Factory(Context)>
	//  401  921:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  402  924:ldc2            #263 <Class Uri>
	//  403  927:ldc1            #196 <Class InputStream>
	//  404  929:new             #339 <Class com.bumptech.glide.load.model.UriLoader$StreamFactory>
	//  405  932:dup             
	//  406  933:aload           24
	//  407  935:invokespecial   #342 <Method void com.bumptech.glide.load.model.UriLoader$StreamFactory(android.content.ContentResolver)>
	//  408  938:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  409  941:ldc2            #263 <Class Uri>
	//  410  944:ldc1            #208 <Class ParcelFileDescriptor>
	//  411  946:new             #344 <Class com.bumptech.glide.load.model.UriLoader$FileDescriptorFactory>
	//  412  949:dup             
	//  413  950:aload           24
	//  414  952:invokespecial   #345 <Method void com.bumptech.glide.load.model.UriLoader$FileDescriptorFactory(android.content.ContentResolver)>
	//  415  955:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  416  958:ldc2            #263 <Class Uri>
	//  417  961:ldc1            #210 <Class AssetFileDescriptor>
	//  418  963:new             #347 <Class com.bumptech.glide.load.model.UriLoader$AssetFileDescriptorFactory>
	//  419  966:dup             
	//  420  967:aload           24
	//  421  969:invokespecial   #348 <Method void com.bumptech.glide.load.model.UriLoader$AssetFileDescriptorFactory(android.content.ContentResolver)>
	//  422  972:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  423  975:ldc2            #263 <Class Uri>
	//  424  978:ldc1            #196 <Class InputStream>
	//  425  980:new             #350 <Class com.bumptech.glide.load.model.UrlUriLoader$StreamFactory>
	//  426  983:dup             
	//  427  984:invokespecial   #351 <Method void com.bumptech.glide.load.model.UrlUriLoader$StreamFactory()>
	//  428  987:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  429  990:ldc2            #353 <Class URL>
	//  430  993:ldc1            #196 <Class InputStream>
	//  431  995:new             #355 <Class com.bumptech.glide.load.model.stream.UrlLoader$StreamFactory>
	//  432  998:dup             
	//  433  999:invokespecial   #356 <Method void com.bumptech.glide.load.model.stream.UrlLoader$StreamFactory()>
	//  434 1002:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  435 1005:ldc2            #263 <Class Uri>
	//  436 1008:ldc2            #281 <Class File>
	//  437 1011:new             #358 <Class com.bumptech.glide.load.model.MediaStoreFileLoader$Factory>
	//  438 1014:dup             
	//  439 1015:aload_1         
	//  440 1016:invokespecial   #359 <Method void com.bumptech.glide.load.model.MediaStoreFileLoader$Factory(Context)>
	//  441 1019:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  442 1022:ldc2            #361 <Class GlideUrl>
	//  443 1025:ldc1            #196 <Class InputStream>
	//  444 1027:new             #363 <Class com.bumptech.glide.load.model.stream.HttpGlideUrlLoader$Factory>
	//  445 1030:dup             
	//  446 1031:invokespecial   #364 <Method void com.bumptech.glide.load.model.stream.HttpGlideUrlLoader$Factory()>
	//  447 1034:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  448 1037:ldc2            #366 <Class byte[]>
	//  449 1040:ldc1            #187 <Class ByteBuffer>
	//  450 1042:new             #368 <Class com.bumptech.glide.load.model.ByteArrayLoader$ByteBufferFactory>
	//  451 1045:dup             
	//  452 1046:invokespecial   #369 <Method void com.bumptech.glide.load.model.ByteArrayLoader$ByteBufferFactory()>
	//  453 1049:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  454 1052:ldc2            #366 <Class byte[]>
	//  455 1055:ldc1            #196 <Class InputStream>
	//  456 1057:new             #371 <Class com.bumptech.glide.load.model.ByteArrayLoader$StreamFactory>
	//  457 1060:dup             
	//  458 1061:invokespecial   #372 <Method void com.bumptech.glide.load.model.ByteArrayLoader$StreamFactory()>
	//  459 1064:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  460 1067:ldc2            #263 <Class Uri>
	//  461 1070:ldc2            #263 <Class Uri>
	//  462 1073:invokestatic    #219 <Method com.bumptech.glide.load.model.UnitModelLoader$Factory com.bumptech.glide.load.model.UnitModelLoader$Factory.getInstance()>
	//  463 1076:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  464 1079:ldc2            #265 <Class Drawable>
	//  465 1082:ldc2            #265 <Class Drawable>
	//  466 1085:invokestatic    #219 <Method com.bumptech.glide.load.model.UnitModelLoader$Factory com.bumptech.glide.load.model.UnitModelLoader$Factory.getInstance()>
	//  467 1088:invokevirtual   #222 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  468 1091:ldc2            #265 <Class Drawable>
	//  469 1094:ldc2            #265 <Class Drawable>
	//  470 1097:new             #374 <Class UnitDrawableDecoder>
	//  471 1100:dup             
	//  472 1101:invokespecial   #375 <Method void UnitDrawableDecoder()>
	//  473 1104:invokevirtual   #268 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  474 1107:ldc1            #203 <Class Bitmap>
	//  475 1109:ldc1            #232 <Class BitmapDrawable>
	//  476 1111:new             #377 <Class BitmapDrawableTranscoder>
	//  477 1114:dup             
	//  478 1115:aload_3         
	//  479 1116:invokespecial   #378 <Method void BitmapDrawableTranscoder(Resources)>
	//  480 1119:invokevirtual   #381 <Method Registry Registry.register(Class, Class, com.bumptech.glide.load.resource.transcode.ResourceTranscoder)>
	//  481 1122:ldc1            #203 <Class Bitmap>
	//  482 1124:ldc2            #366 <Class byte[]>
	//  483 1127:aload           22
	//  484 1129:invokevirtual   #381 <Method Registry Registry.register(Class, Class, com.bumptech.glide.load.resource.transcode.ResourceTranscoder)>
	//  485 1132:ldc2            #265 <Class Drawable>
	//  486 1135:ldc2            #366 <Class byte[]>
	//  487 1138:new             #383 <Class DrawableBytesTranscoder>
	//  488 1141:dup             
	//  489 1142:aload           4
	//  490 1144:aload           22
	//  491 1146:aload           23
	//  492 1148:invokespecial   #386 <Method void DrawableBytesTranscoder(BitmapPool, com.bumptech.glide.load.resource.transcode.ResourceTranscoder, com.bumptech.glide.load.resource.transcode.ResourceTranscoder)>
	//  493 1151:invokevirtual   #381 <Method Registry Registry.register(Class, Class, com.bumptech.glide.load.resource.transcode.ResourceTranscoder)>
	//  494 1154:ldc1            #246 <Class GifDrawable>
	//  495 1156:ldc2            #366 <Class byte[]>
	//  496 1159:aload           23
	//  497 1161:invokevirtual   #381 <Method Registry Registry.register(Class, Class, com.bumptech.glide.load.resource.transcode.ResourceTranscoder)>
	//  498 1164:pop             
		memorycache = ((MemoryCache) (new ImageViewTargetFactory()));
	//  499 1165:new             #388 <Class ImageViewTargetFactory>
	//  500 1168:dup             
	//  501 1169:invokespecial   #389 <Method void ImageViewTargetFactory()>
	//  502 1172:astore_3        
		glideContext = new GlideContext(context, arraypool, registry, ((ImageViewTargetFactory) (memorycache)), requestoptions, map, list, engine1, flag, i);
	//  503 1173:aload_0         
	//  504 1174:new             #391 <Class GlideContext>
	//  505 1177:dup             
	//  506 1178:aload_1         
	//  507 1179:aload           5
	//  508 1181:aload_0         
	//  509 1182:getfield        #101 <Field Registry registry>
	//  510 1185:aload_3         
	//  511 1186:aload           9
	//  512 1188:aload           10
	//  513 1190:aload           11
	//  514 1192:aload_2         
	//  515 1193:iload           12
	//  516 1195:iload           8
	//  517 1197:invokespecial   #394 <Method void GlideContext(Context, ArrayPool, Registry, ImageViewTargetFactory, RequestOptions, Map, List, Engine, boolean, int)>
	//  518 1200:putfield        #396 <Field GlideContext glideContext>
	//  519 1203:return          
	}

	private static void checkAndInitializeGlide(Context context)
	{
		if(!isInitializing)
	//*   0    0:getstatic       #403 <Field boolean isInitializing>
	//*   1    3:ifne            19
		{
			isInitializing = true;
	//    2    6:iconst_1        
	//    3    7:putstatic       #403 <Field boolean isInitializing>
			initializeGlide(context);
	//    4   10:aload_0         
	//    5   11:invokestatic    #406 <Method void initializeGlide(Context)>
			isInitializing = false;
	//    6   14:iconst_0        
	//    7   15:putstatic       #403 <Field boolean isInitializing>
			return;
	//    8   18:return          
		} else
		{
			throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
	//    9   19:new             #408 <Class IllegalStateException>
	//   10   22:dup             
	//   11   23:ldc2            #410 <String "You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead">
	//   12   26:invokespecial   #413 <Method void IllegalStateException(String)>
	//   13   29:athrow          
		}
	}

	public static Glide get(Context context)
	{
		if(glide != null)
			break MISSING_BLOCK_LABEL_31;
	//    0    0:getstatic       #416 <Field Glide glide>
	//    1    3:ifnonnull       31
		com/bumptech/glide/Glide;
	//    2    6:ldc1            #2   <Class Glide>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(glide == null)
	//*   4    9:getstatic       #416 <Field Glide glide>
	//*   5   12:ifnonnull       19
			checkAndInitializeGlide(context);
	//    6   15:aload_0         
	//    7   16:invokestatic    #418 <Method void checkAndInitializeGlide(Context)>
		com/bumptech/glide/Glide;
	//    8   19:ldc1            #2   <Class Glide>
		JVM INSTR monitorexit ;
	//    9   21:monitorexit     
		break MISSING_BLOCK_LABEL_31;
	//   10   22:goto            31
		context;
	//   11   25:astore_0        
		com/bumptech/glide/Glide;
	//   12   26:ldc1            #2   <Class Glide>
		JVM INSTR monitorexit ;
	//   13   28:monitorexit     
		throw context;
	//   14   29:aload_0         
	//   15   30:athrow          
		return glide;
	//   16   31:getstatic       #416 <Field Glide glide>
	//   17   34:areturn         
	}

	private static GeneratedAppGlideModule getAnnotationGeneratedGlideModules()
	{
		GeneratedAppGlideModule generatedappglidemodule = (GeneratedAppGlideModule)Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
	//    0    0:ldc2            #434 <String "com.bumptech.glide.GeneratedAppGlideModuleImpl">
	//    1    3:invokestatic    #440 <Method Class Class.forName(String)>
	//    2    6:iconst_0        
	//    3    7:anewarray       Class[]
	//    4   10:invokevirtual   #444 <Method Constructor Class.getDeclaredConstructor(Class[])>
	//    5   13:iconst_0        
	//    6   14:anewarray       Object[]
	//    7   17:invokevirtual   #450 <Method Object Constructor.newInstance(Object[])>
	//    8   20:checkcast       #452 <Class GeneratedAppGlideModule>
	//    9   23:astore_0        
		return generatedappglidemodule;
	//   10   24:aload_0         
	//   11   25:areturn         
		Object obj;
		obj;
	//   12   26:astore_0        
		throwIncorrectGlideModule(((Exception) (obj)));
	//   13   27:aload_0         
	//   14   28:invokestatic    #456 <Method void throwIncorrectGlideModule(Exception)>
		  goto _L1
	//*  15   31:goto            78
		obj;
	//   16   34:astore_0        
		throwIncorrectGlideModule(((Exception) (obj)));
	//   17   35:aload_0         
	//   18   36:invokestatic    #456 <Method void throwIncorrectGlideModule(Exception)>
		  goto _L1
	//*  19   39:goto            78
		obj;
	//   20   42:astore_0        
		throwIncorrectGlideModule(((Exception) (obj)));
	//   21   43:aload_0         
	//   22   44:invokestatic    #456 <Method void throwIncorrectGlideModule(Exception)>
		  goto _L1
	//*  23   47:goto            78
		obj;
	//   24   50:astore_0        
		throwIncorrectGlideModule(((Exception) (obj)));
	//   25   51:aload_0         
	//   26   52:invokestatic    #456 <Method void throwIncorrectGlideModule(Exception)>
		  goto _L1
	//*  27   55:goto            78
_L3:
		if(Log.isLoggable("Glide", 5))
	//*  28   58:ldc2            #458 <String "Glide">
	//*  29   61:iconst_5        
	//*  30   62:invokestatic    #464 <Method boolean Log.isLoggable(String, int)>
	//*  31   65:ifeq            78
			Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
	//   32   68:ldc2            #458 <String "Glide">
	//   33   71:ldc2            #466 <String "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored">
	//   34   74:invokestatic    #470 <Method int Log.w(String, String)>
	//   35   77:pop             
_L1:
		return null;
	//   36   78:aconst_null     
	//   37   79:areturn         
		obj;
	//   38   80:astore_0        
		if(true) goto _L3; else goto _L2
_L2:
	//*  39   81:goto            58
	}

	private static RequestManagerRetriever getRetriever(Context context)
	{
		Preconditions.checkNotNull(((Object) (context)), "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
	//    0    0:aload_0         
	//    1    1:ldc2            #474 <String "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).">
	//    2    4:invokestatic    #480 <Method Object Preconditions.checkNotNull(Object, String)>
	//    3    7:pop             
		return get(context).getRequestManagerRetriever();
	//    4    8:aload_0         
	//    5    9:invokestatic    #482 <Method Glide get(Context)>
	//    6   12:invokevirtual   #486 <Method RequestManagerRetriever getRequestManagerRetriever()>
	//    7   15:areturn         
	}

	private static void initializeGlide(Context context)
	{
		initializeGlide(context, new GlideBuilder());
	//    0    0:aload_0         
	//    1    1:new             #488 <Class GlideBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #489 <Method void GlideBuilder()>
	//    4    8:invokestatic    #492 <Method void initializeGlide(Context, GlideBuilder)>
	//    5   11:return          
	}

	private static void initializeGlide(Context context, GlideBuilder glidebuilder)
	{
		Context context1 = context.getApplicationContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #496 <Method Context Context.getApplicationContext()>
	//    2    4:astore_3        
		GeneratedAppGlideModule generatedappglidemodule = getAnnotationGeneratedGlideModules();
	//    3    5:invokestatic    #498 <Method GeneratedAppGlideModule getAnnotationGeneratedGlideModules()>
	//    4    8:astore          4
		context = ((Context) (Collections.emptyList()));
	//    5   10:invokestatic    #503 <Method List Collections.emptyList()>
	//    6   13:astore_0        
		if(generatedappglidemodule == null || generatedappglidemodule.isManifestParsingEnabled())
	//*   7   14:aload           4
	//*   8   16:ifnull          27
	//*   9   19:aload           4
	//*  10   21:invokevirtual   #507 <Method boolean GeneratedAppGlideModule.isManifestParsingEnabled()>
	//*  11   24:ifeq            39
			context = ((Context) ((new ManifestParser(context1)).parse()));
	//   12   27:new             #509 <Class ManifestParser>
	//   13   30:dup             
	//   14   31:aload_3         
	//   15   32:invokespecial   #510 <Method void ManifestParser(Context)>
	//   16   35:invokevirtual   #513 <Method List ManifestParser.parse()>
	//   17   38:astore_0        
		if(generatedappglidemodule != null && !generatedappglidemodule.getExcludedModuleClasses().isEmpty())
	//*  18   39:aload           4
	//*  19   41:ifnull          168
	//*  20   44:aload           4
	//*  21   46:invokevirtual   #517 <Method Set GeneratedAppGlideModule.getExcludedModuleClasses()>
	//*  22   49:invokeinterface #522 <Method boolean Set.isEmpty()>
	//*  23   54:ifne            168
		{
			Set set = generatedappglidemodule.getExcludedModuleClasses();
	//   24   57:aload           4
	//   25   59:invokevirtual   #517 <Method Set GeneratedAppGlideModule.getExcludedModuleClasses()>
	//   26   62:astore_2        
			Iterator iterator2 = ((List) (context)).iterator();
	//   27   63:aload_0         
	//   28   64:invokeinterface #528 <Method Iterator List.iterator()>
	//   29   69:astore          5
			do
			{
				if(!iterator2.hasNext())
					break;
	//   30   71:aload           5
	//   31   73:invokeinterface #533 <Method boolean Iterator.hasNext()>
	//   32   78:ifeq            168
				GlideModule glidemodule1 = (GlideModule)iterator2.next();
	//   33   81:aload           5
	//   34   83:invokeinterface #537 <Method Object Iterator.next()>
	//   35   88:checkcast       #539 <Class GlideModule>
	//   36   91:astore          6
				if(set.contains(((Object) (((Object) (glidemodule1)).getClass()))))
	//*  37   93:aload_2         
	//*  38   94:aload           6
	//*  39   96:invokevirtual   #543 <Method Class Object.getClass()>
	//*  40   99:invokeinterface #547 <Method boolean Set.contains(Object)>
	//*  41  104:ifne            110
	//*  42  107:goto            71
				{
					if(Log.isLoggable("Glide", 3))
	//*  43  110:ldc2            #458 <String "Glide">
	//*  44  113:iconst_3        
	//*  45  114:invokestatic    #464 <Method boolean Log.isLoggable(String, int)>
	//*  46  117:ifeq            158
					{
						StringBuilder stringbuilder1 = new StringBuilder();
	//   47  120:new             #549 <Class StringBuilder>
	//   48  123:dup             
	//   49  124:invokespecial   #550 <Method void StringBuilder()>
	//   50  127:astore          7
						stringbuilder1.append("AppGlideModule excludes manifest GlideModule: ");
	//   51  129:aload           7
	//   52  131:ldc2            #552 <String "AppGlideModule excludes manifest GlideModule: ">
	//   53  134:invokevirtual   #555 <Method StringBuilder StringBuilder.append(String)>
	//   54  137:pop             
						stringbuilder1.append(((Object) (glidemodule1)));
	//   55  138:aload           7
	//   56  140:aload           6
	//   57  142:invokevirtual   #558 <Method StringBuilder StringBuilder.append(Object)>
	//   58  145:pop             
						Log.d("Glide", stringbuilder1.toString());
	//   59  146:ldc2            #458 <String "Glide">
	//   60  149:aload           7
	//   61  151:invokevirtual   #562 <Method String StringBuilder.toString()>
	//   62  154:invokestatic    #565 <Method int Log.d(String, String)>
	//   63  157:pop             
					}
					iterator2.remove();
	//   64  158:aload           5
	//   65  160:invokeinterface #568 <Method void Iterator.remove()>
				}
			} while(true);
	//   66  165:goto            71
		}
		if(Log.isLoggable("Glide", 3))
	//*  67  168:ldc2            #458 <String "Glide">
	//*  68  171:iconst_3        
	//*  69  172:invokestatic    #464 <Method boolean Log.isLoggable(String, int)>
	//*  70  175:ifeq            249
		{
			StringBuilder stringbuilder;
			for(Iterator iterator = ((List) (context)).iterator(); iterator.hasNext(); Log.d("Glide", stringbuilder.toString()))
	//*  71  178:aload_0         
	//*  72  179:invokeinterface #528 <Method Iterator List.iterator()>
	//*  73  184:astore_2        
	//*  74  185:aload_2         
	//*  75  186:invokeinterface #533 <Method boolean Iterator.hasNext()>
	//*  76  191:ifeq            249
			{
				GlideModule glidemodule = (GlideModule)iterator.next();
	//   77  194:aload_2         
	//   78  195:invokeinterface #537 <Method Object Iterator.next()>
	//   79  200:checkcast       #539 <Class GlideModule>
	//   80  203:astore          5
				stringbuilder = new StringBuilder();
	//   81  205:new             #549 <Class StringBuilder>
	//   82  208:dup             
	//   83  209:invokespecial   #550 <Method void StringBuilder()>
	//   84  212:astore          6
				stringbuilder.append("Discovered GlideModule from manifest: ");
	//   85  214:aload           6
	//   86  216:ldc2            #570 <String "Discovered GlideModule from manifest: ">
	//   87  219:invokevirtual   #555 <Method StringBuilder StringBuilder.append(String)>
	//   88  222:pop             
				stringbuilder.append(((Object) (((Object) (glidemodule)).getClass())));
	//   89  223:aload           6
	//   90  225:aload           5
	//   91  227:invokevirtual   #543 <Method Class Object.getClass()>
	//   92  230:invokevirtual   #558 <Method StringBuilder StringBuilder.append(Object)>
	//   93  233:pop             
			}

	//   94  234:ldc2            #458 <String "Glide">
	//   95  237:aload           6
	//   96  239:invokevirtual   #562 <Method String StringBuilder.toString()>
	//   97  242:invokestatic    #565 <Method int Log.d(String, String)>
	//   98  245:pop             
		}
	//*  99  246:goto            185
		com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory requestmanagerfactory;
		if(generatedappglidemodule != null)
	//* 100  249:aload           4
	//* 101  251:ifnull          263
			requestmanagerfactory = generatedappglidemodule.getRequestManagerFactory();
	//  102  254:aload           4
	//  103  256:invokevirtual   #574 <Method com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory GeneratedAppGlideModule.getRequestManagerFactory()>
	//  104  259:astore_2        
		else
	//* 105  260:goto            265
			requestmanagerfactory = null;
	//  106  263:aconst_null     
	//  107  264:astore_2        
		glidebuilder.setRequestManagerFactory(requestmanagerfactory);
	//  108  265:aload_1         
	//  109  266:aload_2         
	//  110  267:invokevirtual   #578 <Method void GlideBuilder.setRequestManagerFactory(com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory)>
		for(Iterator iterator1 = ((List) (context)).iterator(); iterator1.hasNext(); ((GlideModule)iterator1.next()).applyOptions(context1, glidebuilder));
	//  111  270:aload_0         
	//  112  271:invokeinterface #528 <Method Iterator List.iterator()>
	//  113  276:astore_2        
	//  114  277:aload_2         
	//  115  278:invokeinterface #533 <Method boolean Iterator.hasNext()>
	//  116  283:ifeq            305
	//  117  286:aload_2         
	//  118  287:invokeinterface #537 <Method Object Iterator.next()>
	//  119  292:checkcast       #539 <Class GlideModule>
	//  120  295:aload_3         
	//  121  296:aload_1         
	//  122  297:invokeinterface #581 <Method void GlideModule.applyOptions(Context, GlideBuilder)>
	//* 123  302:goto            277
		if(generatedappglidemodule != null)
	//* 124  305:aload           4
	//* 125  307:ifnull          317
			generatedappglidemodule.applyOptions(context1, glidebuilder);
	//  126  310:aload           4
	//  127  312:aload_3         
	//  128  313:aload_1         
	//  129  314:invokevirtual   #582 <Method void GeneratedAppGlideModule.applyOptions(Context, GlideBuilder)>
		glidebuilder = ((GlideBuilder) (glidebuilder.build(context1)));
	//  130  317:aload_1         
	//  131  318:aload_3         
	//  132  319:invokevirtual   #585 <Method Glide GlideBuilder.build(Context)>
	//  133  322:astore_1        
		for(context = ((Context) (((List) (context)).iterator())); ((Iterator) (context)).hasNext(); ((GlideModule)((Iterator) (context)).next()).registerComponents(context1, ((Glide) (glidebuilder)), ((Glide) (glidebuilder)).registry));
	//  134  323:aload_0         
	//  135  324:invokeinterface #528 <Method Iterator List.iterator()>
	//  136  329:astore_0        
	//  137  330:aload_0         
	//  138  331:invokeinterface #533 <Method boolean Iterator.hasNext()>
	//  139  336:ifeq            362
	//  140  339:aload_0         
	//  141  340:invokeinterface #537 <Method Object Iterator.next()>
	//  142  345:checkcast       #539 <Class GlideModule>
	//  143  348:aload_3         
	//  144  349:aload_1         
	//  145  350:aload_1         
	//  146  351:getfield        #101 <Field Registry registry>
	//  147  354:invokeinterface #589 <Method void GlideModule.registerComponents(Context, Glide, Registry)>
	//* 148  359:goto            330
		if(generatedappglidemodule != null)
	//* 149  362:aload           4
	//* 150  364:ifnull          378
			generatedappglidemodule.registerComponents(context1, ((Glide) (glidebuilder)), ((Glide) (glidebuilder)).registry);
	//  151  367:aload           4
	//  152  369:aload_3         
	//  153  370:aload_1         
	//  154  371:aload_1         
	//  155  372:getfield        #101 <Field Registry registry>
	//  156  375:invokevirtual   #590 <Method void GeneratedAppGlideModule.registerComponents(Context, Glide, Registry)>
		context1.registerComponentCallbacks(((android.content.ComponentCallbacks) (glidebuilder)));
	//  157  378:aload_3         
	//  158  379:aload_1         
	//  159  380:invokevirtual   #594 <Method void Context.registerComponentCallbacks(android.content.ComponentCallbacks)>
		glide = ((Glide) (glidebuilder));
	//  160  383:aload_1         
	//  161  384:putstatic       #416 <Field Glide glide>
	//  162  387:return          
	}

	private static void throwIncorrectGlideModule(Exception exception)
	{
		throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", ((Throwable) (exception)));
	//    0    0:new             #408 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc2            #596 <String "GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.">
	//    3    7:aload_0         
	//    4    8:invokespecial   #599 <Method void IllegalStateException(String, Throwable)>
	//    5   11:athrow          
	}

	public static RequestManager with(Context context)
	{
		return getRetriever(context).get(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #603 <Method RequestManagerRetriever getRetriever(Context)>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #607 <Method RequestManager RequestManagerRetriever.get(Context)>
	//    4    8:areturn         
	}

	public void clearMemory()
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #613 <Method void Util.assertMainThread()>
		memoryCache.clearMemory();
	//    1    3:aload_0         
	//    2    4:getfield        #59  <Field MemoryCache memoryCache>
	//    3    7:invokeinterface #617 <Method void MemoryCache.clearMemory()>
		bitmapPool.clearMemory();
	//    4   12:aload_0         
	//    5   13:getfield        #55  <Field BitmapPool bitmapPool>
	//    6   16:invokeinterface #620 <Method void BitmapPool.clearMemory()>
		arrayPool.clearMemory();
	//    7   21:aload_0         
	//    8   22:getfield        #57  <Field ArrayPool arrayPool>
	//    9   25:invokeinterface #623 <Method void ArrayPool.clearMemory()>
	//   10   30:return          
	}

	public ArrayPool getArrayPool()
	{
		return arrayPool;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field ArrayPool arrayPool>
	//    2    4:areturn         
	}

	public BitmapPool getBitmapPool()
	{
		return bitmapPool;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field BitmapPool bitmapPool>
	//    2    4:areturn         
	}

	ConnectivityMonitorFactory getConnectivityMonitorFactory()
	{
		return connectivityMonitorFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field ConnectivityMonitorFactory connectivityMonitorFactory>
	//    2    4:areturn         
	}

	public Context getContext()
	{
		return glideContext.getBaseContext();
	//    0    0:aload_0         
	//    1    1:getfield        #396 <Field GlideContext glideContext>
	//    2    4:invokevirtual   #633 <Method Context GlideContext.getBaseContext()>
	//    3    7:areturn         
	}

	GlideContext getGlideContext()
	{
		return glideContext;
	//    0    0:aload_0         
	//    1    1:getfield        #396 <Field GlideContext glideContext>
	//    2    4:areturn         
	}

	public Registry getRegistry()
	{
		return registry;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field Registry registry>
	//    2    4:areturn         
	}

	public RequestManagerRetriever getRequestManagerRetriever()
	{
		return requestManagerRetriever;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field RequestManagerRetriever requestManagerRetriever>
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
	//    1    1:invokevirtual   #641 <Method void clearMemory()>
	//    2    4:return          
	}

	public void onTrimMemory(int i)
	{
		trimMemory(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #646 <Method void trimMemory(int)>
	//    3    5:return          
	}

	void registerRequestManager(RequestManager requestmanager)
	{
label0:
		{
			synchronized(managers)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field List managers>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(managers.contains(((Object) (requestmanager))))
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #44  <Field List managers>
	//    7   11:aload_1         
	//    8   12:invokeinterface #649 <Method boolean List.contains(Object)>
	//    9   17:ifne            34
				managers.add(((Object) (requestmanager)));
	//   10   20:aload_0         
	//   11   21:getfield        #44  <Field List managers>
	//   12   24:aload_1         
	//   13   25:invokeinterface #652 <Method boolean List.add(Object)>
	//   14   30:pop             
			}
	//   15   31:aload_2         
	//   16   32:monitorexit     
			return;
	//   17   33:return          
		}
		throw new IllegalStateException("Cannot register already registered manager");
	//   18   34:new             #408 <Class IllegalStateException>
	//   19   37:dup             
	//   20   38:ldc2            #654 <String "Cannot register already registered manager">
	//   21   41:invokespecial   #413 <Method void IllegalStateException(String)>
	//   22   44:athrow          
		requestmanager;
	//   23   45:astore_1        
		list;
	//   24   46:aload_2         
		JVM INSTR monitorexit ;
	//   25   47:monitorexit     
		throw requestmanager;
	//   26   48:aload_1         
	//   27   49:athrow          
	}

	boolean removeFromManagers(Target target)
	{
label0:
		{
			synchronized(managers)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field List managers>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				Iterator iterator = managers.iterator();
	//    5    7:aload_0         
	//    6    8:getfield        #44  <Field List managers>
	//    7   11:invokeinterface #528 <Method Iterator List.iterator()>
	//    8   16:astore_3        
				do
					if(!iterator.hasNext())
						break label0;
	//    9   17:aload_3         
	//   10   18:invokeinterface #533 <Method boolean Iterator.hasNext()>
	//   11   23:ifeq            46
				while(!((RequestManager)iterator.next()).untrack(target));
	//   12   26:aload_3         
	//   13   27:invokeinterface #537 <Method Object Iterator.next()>
	//   14   32:checkcast       #658 <Class RequestManager>
	//   15   35:aload_1         
	//   16   36:invokevirtual   #661 <Method boolean RequestManager.untrack(Target)>
	//   17   39:ifeq            17
			}
	//   18   42:aload_2         
	//   19   43:monitorexit     
			return true;
	//   20   44:iconst_1        
	//   21   45:ireturn         
		}
		list;
	//   22   46:aload_2         
		JVM INSTR monitorexit ;
	//   23   47:monitorexit     
		return false;
	//   24   48:iconst_0        
	//   25   49:ireturn         
		target;
	//   26   50:astore_1        
		list;
	//   27   51:aload_2         
		JVM INSTR monitorexit ;
	//   28   52:monitorexit     
		throw target;
	//   29   53:aload_1         
	//   30   54:athrow          
	}

	public void trimMemory(int i)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #613 <Method void Util.assertMainThread()>
		memoryCache.trimMemory(i);
	//    1    3:aload_0         
	//    2    4:getfield        #59  <Field MemoryCache memoryCache>
	//    3    7:iload_1         
	//    4    8:invokeinterface #663 <Method void MemoryCache.trimMemory(int)>
		bitmapPool.trimMemory(i);
	//    5   13:aload_0         
	//    6   14:getfield        #55  <Field BitmapPool bitmapPool>
	//    7   17:iload_1         
	//    8   18:invokeinterface #664 <Method void BitmapPool.trimMemory(int)>
		arrayPool.trimMemory(i);
	//    9   23:aload_0         
	//   10   24:getfield        #57  <Field ArrayPool arrayPool>
	//   11   27:iload_1         
	//   12   28:invokeinterface #665 <Method void ArrayPool.trimMemory(int)>
	//   13   33:return          
	}

	void unregisterRequestManager(RequestManager requestmanager)
	{
label0:
		{
			synchronized(managers)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field List managers>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(!managers.contains(((Object) (requestmanager))))
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #44  <Field List managers>
	//    7   11:aload_1         
	//    8   12:invokeinterface #649 <Method boolean List.contains(Object)>
	//    9   17:ifeq            34
				managers.remove(((Object) (requestmanager)));
	//   10   20:aload_0         
	//   11   21:getfield        #44  <Field List managers>
	//   12   24:aload_1         
	//   13   25:invokeinterface #668 <Method boolean List.remove(Object)>
	//   14   30:pop             
			}
	//   15   31:aload_2         
	//   16   32:monitorexit     
			return;
	//   17   33:return          
		}
		throw new IllegalStateException("Cannot unregister not yet registered manager");
	//   18   34:new             #408 <Class IllegalStateException>
	//   19   37:dup             
	//   20   38:ldc2            #670 <String "Cannot unregister not yet registered manager">
	//   21   41:invokespecial   #413 <Method void IllegalStateException(String)>
	//   22   44:athrow          
		requestmanager;
	//   23   45:astore_1        
		list;
	//   24   46:aload_2         
		JVM INSTR monitorexit ;
	//   25   47:monitorexit     
		throw requestmanager;
	//   26   48:aload_1         
	//   27   49:athrow          
	}

	private static volatile Glide glide;
	private static volatile boolean isInitializing;
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
