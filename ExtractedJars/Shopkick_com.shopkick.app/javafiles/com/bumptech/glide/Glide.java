// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
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
	//    1    1:invokespecial   #46  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #48  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #49  <Method void ArrayList()>
	//    6   12:putfield        #51  <Field List managers>
		memoryCategory = MemoryCategory.NORMAL;
	//    7   15:aload_0         
	//    8   16:getstatic       #56  <Field MemoryCategory MemoryCategory.NORMAL>
	//    9   19:putfield        #58  <Field MemoryCategory memoryCategory>
		engine = engine1;
	//   10   22:aload_0         
	//   11   23:aload_2         
	//   12   24:putfield        #60  <Field Engine engine>
		bitmapPool = bitmappool;
	//   13   27:aload_0         
	//   14   28:aload           4
	//   15   30:putfield        #62  <Field BitmapPool bitmapPool>
		arrayPool = arraypool;
	//   16   33:aload_0         
	//   17   34:aload           5
	//   18   36:putfield        #64  <Field ArrayPool arrayPool>
		memoryCache = memorycache;
	//   19   39:aload_0         
	//   20   40:aload_3         
	//   21   41:putfield        #66  <Field MemoryCache memoryCache>
		requestManagerRetriever = requestmanagerretriever;
	//   22   44:aload_0         
	//   23   45:aload           6
	//   24   47:putfield        #68  <Field RequestManagerRetriever requestManagerRetriever>
		connectivityMonitorFactory = connectivitymonitorfactory;
	//   25   50:aload_0         
	//   26   51:aload           7
	//   27   53:putfield        #70  <Field ConnectivityMonitorFactory connectivityMonitorFactory>
		bitmapPreFiller = new BitmapPreFiller(memorycache, bitmappool, (DecodeFormat)requestoptions.getOptions().get(Downsampler.DECODE_FORMAT));
	//   28   56:aload_0         
	//   29   57:new             #72  <Class BitmapPreFiller>
	//   30   60:dup             
	//   31   61:aload_3         
	//   32   62:aload           4
	//   33   64:aload           9
	//   34   66:invokevirtual   #78  <Method Options RequestOptions.getOptions()>
	//   35   69:getstatic       #84  <Field com.bumptech.glide.load.Option Downsampler.DECODE_FORMAT>
	//   36   72:invokevirtual   #90  <Method Object Options.get(com.bumptech.glide.load.Option)>
	//   37   75:checkcast       #92  <Class DecodeFormat>
	//   38   78:invokespecial   #95  <Method void BitmapPreFiller(MemoryCache, BitmapPool, DecodeFormat)>
	//   39   81:putfield        #97  <Field BitmapPreFiller bitmapPreFiller>
		memorycache = ((MemoryCache) (context.getResources()));
	//   40   84:aload_1         
	//   41   85:invokevirtual   #103 <Method Resources Context.getResources()>
	//   42   88:astore_3        
	//   43   89:aload_0         
	//   44   90:new             #105 <Class Registry>
	//   45   93:dup             
	//   46   94:invokespecial   #106 <Method void Registry()>
	//   47   97:putfield        #108 <Field Registry registry>
		if(android.os.Build.VERSION.SDK_INT >= 27)
	//*  48  100:getstatic       #114 <Field int android.os.Build$VERSION.SDK_INT>
	//*  49  103:bipush          27
	//*  50  105:icmplt          123
			registry.register(((com.bumptech.glide.load.ImageHeaderParser) (new ExifInterfaceImageHeaderParser())));
	//   51  108:aload_0         
	//   52  109:getfield        #108 <Field Registry registry>
	//   53  112:new             #116 <Class ExifInterfaceImageHeaderParser>
	//   54  115:dup             
	//   55  116:invokespecial   #117 <Method void ExifInterfaceImageHeaderParser()>
	//   56  119:invokevirtual   #121 <Method Registry Registry.register(com.bumptech.glide.load.ImageHeaderParser)>
	//   57  122:pop             
		registry.register(((com.bumptech.glide.load.ImageHeaderParser) (new DefaultImageHeaderParser())));
	//   58  123:aload_0         
	//   59  124:getfield        #108 <Field Registry registry>
	//   60  127:new             #123 <Class DefaultImageHeaderParser>
	//   61  130:dup             
	//   62  131:invokespecial   #124 <Method void DefaultImageHeaderParser()>
	//   63  134:invokevirtual   #121 <Method Registry Registry.register(com.bumptech.glide.load.ImageHeaderParser)>
	//   64  137:pop             
		Object obj = ((Object) (new Downsampler(registry.getImageHeaderParsers(), ((Resources) (memorycache)).getDisplayMetrics(), bitmappool, arraypool)));
	//   65  138:new             #80  <Class Downsampler>
	//   66  141:dup             
	//   67  142:aload_0         
	//   68  143:getfield        #108 <Field Registry registry>
	//   69  146:invokevirtual   #128 <Method List Registry.getImageHeaderParsers()>
	//   70  149:aload_3         
	//   71  150:invokevirtual   #134 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   72  153:aload           4
	//   73  155:aload           5
	//   74  157:invokespecial   #137 <Method void Downsampler(List, android.util.DisplayMetrics, BitmapPool, ArrayPool)>
	//   75  160:astore          12
		requestmanagerretriever = ((RequestManagerRetriever) (new ByteBufferGifDecoder(context, registry.getImageHeaderParsers(), bitmappool, arraypool)));
	//   76  162:new             #139 <Class ByteBufferGifDecoder>
	//   77  165:dup             
	//   78  166:aload_1         
	//   79  167:aload_0         
	//   80  168:getfield        #108 <Field Registry registry>
	//   81  171:invokevirtual   #128 <Method List Registry.getImageHeaderParsers()>
	//   82  174:aload           4
	//   83  176:aload           5
	//   84  178:invokespecial   #142 <Method void ByteBufferGifDecoder(Context, List, BitmapPool, ArrayPool)>
	//   85  181:astore          6
		connectivitymonitorfactory = ((ConnectivityMonitorFactory) (VideoDecoder.parcel(bitmappool)));
	//   86  183:aload           4
	//   87  185:invokestatic    #148 <Method com.bumptech.glide.load.ResourceDecoder VideoDecoder.parcel(BitmapPool)>
	//   88  188:astore          7
		ByteBufferBitmapDecoder bytebufferbitmapdecoder = new ByteBufferBitmapDecoder(((Downsampler) (obj)));
	//   89  190:new             #150 <Class ByteBufferBitmapDecoder>
	//   90  193:dup             
	//   91  194:aload           12
	//   92  196:invokespecial   #153 <Method void ByteBufferBitmapDecoder(Downsampler)>
	//   93  199:astore          11
		obj = ((Object) (new StreamBitmapDecoder(((Downsampler) (obj)), arraypool)));
	//   94  201:new             #155 <Class StreamBitmapDecoder>
	//   95  204:dup             
	//   96  205:aload           12
	//   97  207:aload           5
	//   98  209:invokespecial   #158 <Method void StreamBitmapDecoder(Downsampler, ArrayPool)>
	//   99  212:astore          12
		ResourceDrawableDecoder resourcedrawabledecoder = new ResourceDrawableDecoder(context);
	//  100  214:new             #160 <Class ResourceDrawableDecoder>
	//  101  217:dup             
	//  102  218:aload_1         
	//  103  219:invokespecial   #163 <Method void ResourceDrawableDecoder(Context)>
	//  104  222:astore          13
		com.bumptech.glide.load.model.ResourceLoader.StreamFactory streamfactory = new com.bumptech.glide.load.model.ResourceLoader.StreamFactory(((Resources) (memorycache)));
	//  105  224:new             #165 <Class com.bumptech.glide.load.model.ResourceLoader$StreamFactory>
	//  106  227:dup             
	//  107  228:aload_3         
	//  108  229:invokespecial   #168 <Method void com.bumptech.glide.load.model.ResourceLoader$StreamFactory(Resources)>
	//  109  232:astore          14
		com.bumptech.glide.load.model.ResourceLoader.UriFactory urifactory = new com.bumptech.glide.load.model.ResourceLoader.UriFactory(((Resources) (memorycache)));
	//  110  234:new             #170 <Class com.bumptech.glide.load.model.ResourceLoader$UriFactory>
	//  111  237:dup             
	//  112  238:aload_3         
	//  113  239:invokespecial   #171 <Method void com.bumptech.glide.load.model.ResourceLoader$UriFactory(Resources)>
	//  114  242:astore          15
		com.bumptech.glide.load.model.ResourceLoader.FileDescriptorFactory filedescriptorfactory = new com.bumptech.glide.load.model.ResourceLoader.FileDescriptorFactory(((Resources) (memorycache)));
	//  115  244:new             #173 <Class com.bumptech.glide.load.model.ResourceLoader$FileDescriptorFactory>
	//  116  247:dup             
	//  117  248:aload_3         
	//  118  249:invokespecial   #174 <Method void com.bumptech.glide.load.model.ResourceLoader$FileDescriptorFactory(Resources)>
	//  119  252:astore          16
		com.bumptech.glide.load.model.ResourceLoader.AssetFileDescriptorFactory assetfiledescriptorfactory = new com.bumptech.glide.load.model.ResourceLoader.AssetFileDescriptorFactory(((Resources) (memorycache)));
	//  120  254:new             #176 <Class com.bumptech.glide.load.model.ResourceLoader$AssetFileDescriptorFactory>
	//  121  257:dup             
	//  122  258:aload_3         
	//  123  259:invokespecial   #177 <Method void com.bumptech.glide.load.model.ResourceLoader$AssetFileDescriptorFactory(Resources)>
	//  124  262:astore          17
		BitmapEncoder bitmapencoder = new BitmapEncoder(arraypool);
	//  125  264:new             #179 <Class BitmapEncoder>
	//  126  267:dup             
	//  127  268:aload           5
	//  128  270:invokespecial   #182 <Method void BitmapEncoder(ArrayPool)>
	//  129  273:astore          18
		BitmapBytesTranscoder bitmapbytestranscoder = new BitmapBytesTranscoder();
	//  130  275:new             #184 <Class BitmapBytesTranscoder>
	//  131  278:dup             
	//  132  279:invokespecial   #185 <Method void BitmapBytesTranscoder()>
	//  133  282:astore          19
		GifDrawableBytesTranscoder gifdrawablebytestranscoder = new GifDrawableBytesTranscoder();
	//  134  284:new             #187 <Class GifDrawableBytesTranscoder>
	//  135  287:dup             
	//  136  288:invokespecial   #188 <Method void GifDrawableBytesTranscoder()>
	//  137  291:astore          20
		android.content.ContentResolver contentresolver = context.getContentResolver();
	//  138  293:aload_1         
	//  139  294:invokevirtual   #192 <Method android.content.ContentResolver Context.getContentResolver()>
	//  140  297:astore          21
		registry.append(java/nio/ByteBuffer, ((com.bumptech.glide.load.Encoder) (new ByteBufferEncoder()))).append(java/io/InputStream, ((com.bumptech.glide.load.Encoder) (new StreamEncoder(arraypool)))).append("Bitmap", java/nio/ByteBuffer, android/graphics/Bitmap, ((com.bumptech.glide.load.ResourceDecoder) (bytebufferbitmapdecoder))).append("Bitmap", java/io/InputStream, android/graphics/Bitmap, ((com.bumptech.glide.load.ResourceDecoder) (obj))).append("Bitmap", android/os/ParcelFileDescriptor, android/graphics/Bitmap, ((com.bumptech.glide.load.ResourceDecoder) (connectivitymonitorfactory))).append("Bitmap", android/content/res/AssetFileDescriptor, android/graphics/Bitmap, VideoDecoder.asset(bitmappool)).append(android/graphics/Bitmap, android/graphics/Bitmap, ((com.bumptech.glide.load.model.ModelLoaderFactory) (com.bumptech.glide.load.model.UnitModelLoader.Factory.getInstance()))).append("Bitmap", android/graphics/Bitmap, android/graphics/Bitmap, ((com.bumptech.glide.load.ResourceDecoder) (new UnitBitmapDecoder()))).append(android/graphics/Bitmap, ((com.bumptech.glide.load.ResourceEncoder) (bitmapencoder))).append("BitmapDrawable", java/nio/ByteBuffer, android/graphics/drawable/BitmapDrawable, ((com.bumptech.glide.load.ResourceDecoder) (new BitmapDrawableDecoder(((Resources) (memorycache)), ((com.bumptech.glide.load.ResourceDecoder) (bytebufferbitmapdecoder)))))).append("BitmapDrawable", java/io/InputStream, android/graphics/drawable/BitmapDrawable, ((com.bumptech.glide.load.ResourceDecoder) (new BitmapDrawableDecoder(((Resources) (memorycache)), ((com.bumptech.glide.load.ResourceDecoder) (obj)))))).append("BitmapDrawable", android/os/ParcelFileDescriptor, android/graphics/drawable/BitmapDrawable, ((com.bumptech.glide.load.ResourceDecoder) (new BitmapDrawableDecoder(((Resources) (memorycache)), ((com.bumptech.glide.load.ResourceDecoder) (connectivitymonitorfactory)))))).append(android/graphics/drawable/BitmapDrawable, ((com.bumptech.glide.load.ResourceEncoder) (new BitmapDrawableEncoder(bitmappool, ((com.bumptech.glide.load.ResourceEncoder) (bitmapencoder)))))).append("Gif", java/io/InputStream, com/bumptech/glide/load/resource/gif/GifDrawable, ((com.bumptech.glide.load.ResourceDecoder) (new StreamGifDecoder(registry.getImageHeaderParsers(), ((com.bumptech.glide.load.ResourceDecoder) (requestmanagerretriever)), arraypool)))).append("Gif", java/nio/ByteBuffer, com/bumptech/glide/load/resource/gif/GifDrawable, ((com.bumptech.glide.load.ResourceDecoder) (requestmanagerretriever))).append(com/bumptech/glide/load/resource/gif/GifDrawable, ((com.bumptech.glide.load.ResourceEncoder) (new GifDrawableEncoder()))).append(com/bumptech/glide/gifdecoder/GifDecoder, com/bumptech/glide/gifdecoder/GifDecoder, ((com.bumptech.glide.load.model.ModelLoaderFactory) (com.bumptech.glide.load.model.UnitModelLoader.Factory.getInstance()))).append("Bitmap", com/bumptech/glide/gifdecoder/GifDecoder, android/graphics/Bitmap, ((com.bumptech.glide.load.ResourceDecoder) (new GifFrameResourceDecoder(bitmappool)))).append(android/net/Uri, android/graphics/drawable/Drawable, ((com.bumptech.glide.load.ResourceDecoder) (resourcedrawabledecoder))).append(android/net/Uri, android/graphics/Bitmap, ((com.bumptech.glide.load.ResourceDecoder) (new ResourceBitmapDecoder(resourcedrawabledecoder, bitmappool)))).register(((com.bumptech.glide.load.data.DataRewinder.Factory) (new com.bumptech.glide.load.resource.bytes.ByteBufferRewinder.Factory()))).append(java/io/File, java/nio/ByteBuffer, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.ByteBufferFileLoader.Factory()))).append(java/io/File, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.FileLoader.StreamFactory()))).append(java/io/File, java/io/File, ((com.bumptech.glide.load.ResourceDecoder) (new FileDecoder()))).append(java/io/File, android/os/ParcelFileDescriptor, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.FileLoader.FileDescriptorFactory()))).append(java/io/File, java/io/File, ((com.bumptech.glide.load.model.ModelLoaderFactory) (com.bumptech.glide.load.model.UnitModelLoader.Factory.getInstance()))).register(((com.bumptech.glide.load.data.DataRewinder.Factory) (new com.bumptech.glide.load.data.InputStreamRewinder.Factory(arraypool)))).append(Integer.TYPE, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (streamfactory))).append(Integer.TYPE, android/os/ParcelFileDescriptor, ((com.bumptech.glide.load.model.ModelLoaderFactory) (filedescriptorfactory))).append(java/lang/Integer, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (streamfactory))).append(java/lang/Integer, android/os/ParcelFileDescriptor, ((com.bumptech.glide.load.model.ModelLoaderFactory) (filedescriptorfactory))).append(java/lang/Integer, android/net/Uri, ((com.bumptech.glide.load.model.ModelLoaderFactory) (urifactory))).append(Integer.TYPE, android/content/res/AssetFileDescriptor, ((com.bumptech.glide.load.model.ModelLoaderFactory) (assetfiledescriptorfactory))).append(java/lang/Integer, android/content/res/AssetFileDescriptor, ((com.bumptech.glide.load.model.ModelLoaderFactory) (assetfiledescriptorfactory))).append(Integer.TYPE, android/net/Uri, ((com.bumptech.glide.load.model.ModelLoaderFactory) (urifactory))).append(java/lang/String, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.DataUrlLoader.StreamFactory()))).append(android/net/Uri, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.DataUrlLoader.StreamFactory()))).append(java/lang/String, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.StringLoader.StreamFactory()))).append(java/lang/String, android/os/ParcelFileDescriptor, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.StringLoader.FileDescriptorFactory()))).append(java/lang/String, android/content/res/AssetFileDescriptor, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.StringLoader.AssetFileDescriptorFactory()))).append(android/net/Uri, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.stream.HttpUriLoader.Factory()))).append(android/net/Uri, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.AssetUriLoader.StreamFactory(context.getAssets())))).append(android/net/Uri, android/os/ParcelFileDescriptor, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.AssetUriLoader.FileDescriptorFactory(context.getAssets())))).append(android/net/Uri, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.stream.MediaStoreImageThumbLoader.Factory(context)))).append(android/net/Uri, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.stream.MediaStoreVideoThumbLoader.Factory(context)))).append(android/net/Uri, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.UriLoader.StreamFactory(contentresolver)))).append(android/net/Uri, android/os/ParcelFileDescriptor, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.UriLoader.FileDescriptorFactory(contentresolver)))).append(android/net/Uri, android/content/res/AssetFileDescriptor, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.UriLoader.AssetFileDescriptorFactory(contentresolver)))).append(android/net/Uri, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.UrlUriLoader.StreamFactory()))).append(java/net/URL, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.stream.UrlLoader.StreamFactory()))).append(android/net/Uri, java/io/File, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.MediaStoreFileLoader.Factory(context)))).append(com/bumptech/glide/load/model/GlideUrl, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Factory()))).append([B, java/nio/ByteBuffer, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.ByteArrayLoader.ByteBufferFactory()))).append([B, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new com.bumptech.glide.load.model.ByteArrayLoader.StreamFactory()))).append(android/net/Uri, android/net/Uri, ((com.bumptech.glide.load.model.ModelLoaderFactory) (com.bumptech.glide.load.model.UnitModelLoader.Factory.getInstance()))).append(android/graphics/drawable/Drawable, android/graphics/drawable/Drawable, ((com.bumptech.glide.load.model.ModelLoaderFactory) (com.bumptech.glide.load.model.UnitModelLoader.Factory.getInstance()))).append(android/graphics/drawable/Drawable, android/graphics/drawable/Drawable, ((com.bumptech.glide.load.ResourceDecoder) (new UnitDrawableDecoder()))).register(android/graphics/Bitmap, android/graphics/drawable/BitmapDrawable, ((com.bumptech.glide.load.resource.transcode.ResourceTranscoder) (new BitmapDrawableTranscoder(((Resources) (memorycache)))))).register(android/graphics/Bitmap, [B, ((com.bumptech.glide.load.resource.transcode.ResourceTranscoder) (bitmapbytestranscoder))).register(android/graphics/drawable/Drawable, [B, ((com.bumptech.glide.load.resource.transcode.ResourceTranscoder) (new DrawableBytesTranscoder(bitmappool, ((com.bumptech.glide.load.resource.transcode.ResourceTranscoder) (bitmapbytestranscoder)), ((com.bumptech.glide.load.resource.transcode.ResourceTranscoder) (gifdrawablebytestranscoder)))))).register(com/bumptech/glide/load/resource/gif/GifDrawable, [B, ((com.bumptech.glide.load.resource.transcode.ResourceTranscoder) (gifdrawablebytestranscoder)));
	//  141  299:aload_0         
	//  142  300:getfield        #108 <Field Registry registry>
	//  143  303:ldc1            #194 <Class ByteBuffer>
	//  144  305:new             #196 <Class ByteBufferEncoder>
	//  145  308:dup             
	//  146  309:invokespecial   #197 <Method void ByteBufferEncoder()>
	//  147  312:invokevirtual   #201 <Method Registry Registry.append(Class, com.bumptech.glide.load.Encoder)>
	//  148  315:ldc1            #203 <Class InputStream>
	//  149  317:new             #205 <Class StreamEncoder>
	//  150  320:dup             
	//  151  321:aload           5
	//  152  323:invokespecial   #206 <Method void StreamEncoder(ArrayPool)>
	//  153  326:invokevirtual   #201 <Method Registry Registry.append(Class, com.bumptech.glide.load.Encoder)>
	//  154  329:ldc1            #208 <String "Bitmap">
	//  155  331:ldc1            #194 <Class ByteBuffer>
	//  156  333:ldc1            #210 <Class Bitmap>
	//  157  335:aload           11
	//  158  337:invokevirtual   #213 <Method Registry Registry.append(String, Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  159  340:ldc1            #208 <String "Bitmap">
	//  160  342:ldc1            #203 <Class InputStream>
	//  161  344:ldc1            #210 <Class Bitmap>
	//  162  346:aload           12
	//  163  348:invokevirtual   #213 <Method Registry Registry.append(String, Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  164  351:ldc1            #208 <String "Bitmap">
	//  165  353:ldc1            #215 <Class ParcelFileDescriptor>
	//  166  355:ldc1            #210 <Class Bitmap>
	//  167  357:aload           7
	//  168  359:invokevirtual   #213 <Method Registry Registry.append(String, Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  169  362:ldc1            #208 <String "Bitmap">
	//  170  364:ldc1            #217 <Class AssetFileDescriptor>
	//  171  366:ldc1            #210 <Class Bitmap>
	//  172  368:aload           4
	//  173  370:invokestatic    #220 <Method com.bumptech.glide.load.ResourceDecoder VideoDecoder.asset(BitmapPool)>
	//  174  373:invokevirtual   #213 <Method Registry Registry.append(String, Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  175  376:ldc1            #210 <Class Bitmap>
	//  176  378:ldc1            #210 <Class Bitmap>
	//  177  380:invokestatic    #226 <Method com.bumptech.glide.load.model.UnitModelLoader$Factory com.bumptech.glide.load.model.UnitModelLoader$Factory.getInstance()>
	//  178  383:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  179  386:ldc1            #208 <String "Bitmap">
	//  180  388:ldc1            #210 <Class Bitmap>
	//  181  390:ldc1            #210 <Class Bitmap>
	//  182  392:new             #231 <Class UnitBitmapDecoder>
	//  183  395:dup             
	//  184  396:invokespecial   #232 <Method void UnitBitmapDecoder()>
	//  185  399:invokevirtual   #213 <Method Registry Registry.append(String, Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  186  402:ldc1            #210 <Class Bitmap>
	//  187  404:aload           18
	//  188  406:invokevirtual   #235 <Method Registry Registry.append(Class, com.bumptech.glide.load.ResourceEncoder)>
	//  189  409:ldc1            #237 <String "BitmapDrawable">
	//  190  411:ldc1            #194 <Class ByteBuffer>
	//  191  413:ldc1            #239 <Class BitmapDrawable>
	//  192  415:new             #241 <Class BitmapDrawableDecoder>
	//  193  418:dup             
	//  194  419:aload_3         
	//  195  420:aload           11
	//  196  422:invokespecial   #244 <Method void BitmapDrawableDecoder(Resources, com.bumptech.glide.load.ResourceDecoder)>
	//  197  425:invokevirtual   #213 <Method Registry Registry.append(String, Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  198  428:ldc1            #237 <String "BitmapDrawable">
	//  199  430:ldc1            #203 <Class InputStream>
	//  200  432:ldc1            #239 <Class BitmapDrawable>
	//  201  434:new             #241 <Class BitmapDrawableDecoder>
	//  202  437:dup             
	//  203  438:aload_3         
	//  204  439:aload           12
	//  205  441:invokespecial   #244 <Method void BitmapDrawableDecoder(Resources, com.bumptech.glide.load.ResourceDecoder)>
	//  206  444:invokevirtual   #213 <Method Registry Registry.append(String, Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  207  447:ldc1            #237 <String "BitmapDrawable">
	//  208  449:ldc1            #215 <Class ParcelFileDescriptor>
	//  209  451:ldc1            #239 <Class BitmapDrawable>
	//  210  453:new             #241 <Class BitmapDrawableDecoder>
	//  211  456:dup             
	//  212  457:aload_3         
	//  213  458:aload           7
	//  214  460:invokespecial   #244 <Method void BitmapDrawableDecoder(Resources, com.bumptech.glide.load.ResourceDecoder)>
	//  215  463:invokevirtual   #213 <Method Registry Registry.append(String, Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  216  466:ldc1            #239 <Class BitmapDrawable>
	//  217  468:new             #246 <Class BitmapDrawableEncoder>
	//  218  471:dup             
	//  219  472:aload           4
	//  220  474:aload           18
	//  221  476:invokespecial   #249 <Method void BitmapDrawableEncoder(BitmapPool, com.bumptech.glide.load.ResourceEncoder)>
	//  222  479:invokevirtual   #235 <Method Registry Registry.append(Class, com.bumptech.glide.load.ResourceEncoder)>
	//  223  482:ldc1            #251 <String "Gif">
	//  224  484:ldc1            #203 <Class InputStream>
	//  225  486:ldc1            #253 <Class GifDrawable>
	//  226  488:new             #255 <Class StreamGifDecoder>
	//  227  491:dup             
	//  228  492:aload_0         
	//  229  493:getfield        #108 <Field Registry registry>
	//  230  496:invokevirtual   #128 <Method List Registry.getImageHeaderParsers()>
	//  231  499:aload           6
	//  232  501:aload           5
	//  233  503:invokespecial   #258 <Method void StreamGifDecoder(List, com.bumptech.glide.load.ResourceDecoder, ArrayPool)>
	//  234  506:invokevirtual   #213 <Method Registry Registry.append(String, Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  235  509:ldc1            #251 <String "Gif">
	//  236  511:ldc1            #194 <Class ByteBuffer>
	//  237  513:ldc1            #253 <Class GifDrawable>
	//  238  515:aload           6
	//  239  517:invokevirtual   #213 <Method Registry Registry.append(String, Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  240  520:ldc1            #253 <Class GifDrawable>
	//  241  522:new             #260 <Class GifDrawableEncoder>
	//  242  525:dup             
	//  243  526:invokespecial   #261 <Method void GifDrawableEncoder()>
	//  244  529:invokevirtual   #235 <Method Registry Registry.append(Class, com.bumptech.glide.load.ResourceEncoder)>
	//  245  532:ldc2            #263 <Class GifDecoder>
	//  246  535:ldc2            #263 <Class GifDecoder>
	//  247  538:invokestatic    #226 <Method com.bumptech.glide.load.model.UnitModelLoader$Factory com.bumptech.glide.load.model.UnitModelLoader$Factory.getInstance()>
	//  248  541:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  249  544:ldc1            #208 <String "Bitmap">
	//  250  546:ldc2            #263 <Class GifDecoder>
	//  251  549:ldc1            #210 <Class Bitmap>
	//  252  551:new             #265 <Class GifFrameResourceDecoder>
	//  253  554:dup             
	//  254  555:aload           4
	//  255  557:invokespecial   #268 <Method void GifFrameResourceDecoder(BitmapPool)>
	//  256  560:invokevirtual   #213 <Method Registry Registry.append(String, Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  257  563:ldc2            #270 <Class Uri>
	//  258  566:ldc2            #272 <Class Drawable>
	//  259  569:aload           13
	//  260  571:invokevirtual   #275 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  261  574:ldc2            #270 <Class Uri>
	//  262  577:ldc1            #210 <Class Bitmap>
	//  263  579:new             #277 <Class ResourceBitmapDecoder>
	//  264  582:dup             
	//  265  583:aload           13
	//  266  585:aload           4
	//  267  587:invokespecial   #280 <Method void ResourceBitmapDecoder(ResourceDrawableDecoder, BitmapPool)>
	//  268  590:invokevirtual   #275 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  269  593:new             #282 <Class com.bumptech.glide.load.resource.bytes.ByteBufferRewinder$Factory>
	//  270  596:dup             
	//  271  597:invokespecial   #283 <Method void com.bumptech.glide.load.resource.bytes.ByteBufferRewinder$Factory()>
	//  272  600:invokevirtual   #286 <Method Registry Registry.register(com.bumptech.glide.load.data.DataRewinder$Factory)>
	//  273  603:ldc2            #288 <Class File>
	//  274  606:ldc1            #194 <Class ByteBuffer>
	//  275  608:new             #290 <Class com.bumptech.glide.load.model.ByteBufferFileLoader$Factory>
	//  276  611:dup             
	//  277  612:invokespecial   #291 <Method void com.bumptech.glide.load.model.ByteBufferFileLoader$Factory()>
	//  278  615:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  279  618:ldc2            #288 <Class File>
	//  280  621:ldc1            #203 <Class InputStream>
	//  281  623:new             #293 <Class com.bumptech.glide.load.model.FileLoader$StreamFactory>
	//  282  626:dup             
	//  283  627:invokespecial   #294 <Method void com.bumptech.glide.load.model.FileLoader$StreamFactory()>
	//  284  630:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  285  633:ldc2            #288 <Class File>
	//  286  636:ldc2            #288 <Class File>
	//  287  639:new             #296 <Class FileDecoder>
	//  288  642:dup             
	//  289  643:invokespecial   #297 <Method void FileDecoder()>
	//  290  646:invokevirtual   #275 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  291  649:ldc2            #288 <Class File>
	//  292  652:ldc1            #215 <Class ParcelFileDescriptor>
	//  293  654:new             #299 <Class com.bumptech.glide.load.model.FileLoader$FileDescriptorFactory>
	//  294  657:dup             
	//  295  658:invokespecial   #300 <Method void com.bumptech.glide.load.model.FileLoader$FileDescriptorFactory()>
	//  296  661:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  297  664:ldc2            #288 <Class File>
	//  298  667:ldc2            #288 <Class File>
	//  299  670:invokestatic    #226 <Method com.bumptech.glide.load.model.UnitModelLoader$Factory com.bumptech.glide.load.model.UnitModelLoader$Factory.getInstance()>
	//  300  673:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  301  676:new             #302 <Class com.bumptech.glide.load.data.InputStreamRewinder$Factory>
	//  302  679:dup             
	//  303  680:aload           5
	//  304  682:invokespecial   #303 <Method void com.bumptech.glide.load.data.InputStreamRewinder$Factory(ArrayPool)>
	//  305  685:invokevirtual   #286 <Method Registry Registry.register(com.bumptech.glide.load.data.DataRewinder$Factory)>
	//  306  688:getstatic       #309 <Field Class Integer.TYPE>
	//  307  691:ldc1            #203 <Class InputStream>
	//  308  693:aload           14
	//  309  695:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  310  698:getstatic       #309 <Field Class Integer.TYPE>
	//  311  701:ldc1            #215 <Class ParcelFileDescriptor>
	//  312  703:aload           16
	//  313  705:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  314  708:ldc2            #305 <Class Integer>
	//  315  711:ldc1            #203 <Class InputStream>
	//  316  713:aload           14
	//  317  715:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  318  718:ldc2            #305 <Class Integer>
	//  319  721:ldc1            #215 <Class ParcelFileDescriptor>
	//  320  723:aload           16
	//  321  725:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  322  728:ldc2            #305 <Class Integer>
	//  323  731:ldc2            #270 <Class Uri>
	//  324  734:aload           15
	//  325  736:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  326  739:getstatic       #309 <Field Class Integer.TYPE>
	//  327  742:ldc1            #217 <Class AssetFileDescriptor>
	//  328  744:aload           17
	//  329  746:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  330  749:ldc2            #305 <Class Integer>
	//  331  752:ldc1            #217 <Class AssetFileDescriptor>
	//  332  754:aload           17
	//  333  756:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  334  759:getstatic       #309 <Field Class Integer.TYPE>
	//  335  762:ldc2            #270 <Class Uri>
	//  336  765:aload           15
	//  337  767:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  338  770:ldc2            #311 <Class String>
	//  339  773:ldc1            #203 <Class InputStream>
	//  340  775:new             #313 <Class com.bumptech.glide.load.model.DataUrlLoader$StreamFactory>
	//  341  778:dup             
	//  342  779:invokespecial   #314 <Method void com.bumptech.glide.load.model.DataUrlLoader$StreamFactory()>
	//  343  782:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  344  785:ldc2            #270 <Class Uri>
	//  345  788:ldc1            #203 <Class InputStream>
	//  346  790:new             #313 <Class com.bumptech.glide.load.model.DataUrlLoader$StreamFactory>
	//  347  793:dup             
	//  348  794:invokespecial   #314 <Method void com.bumptech.glide.load.model.DataUrlLoader$StreamFactory()>
	//  349  797:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  350  800:ldc2            #311 <Class String>
	//  351  803:ldc1            #203 <Class InputStream>
	//  352  805:new             #316 <Class com.bumptech.glide.load.model.StringLoader$StreamFactory>
	//  353  808:dup             
	//  354  809:invokespecial   #317 <Method void com.bumptech.glide.load.model.StringLoader$StreamFactory()>
	//  355  812:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  356  815:ldc2            #311 <Class String>
	//  357  818:ldc1            #215 <Class ParcelFileDescriptor>
	//  358  820:new             #319 <Class com.bumptech.glide.load.model.StringLoader$FileDescriptorFactory>
	//  359  823:dup             
	//  360  824:invokespecial   #320 <Method void com.bumptech.glide.load.model.StringLoader$FileDescriptorFactory()>
	//  361  827:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  362  830:ldc2            #311 <Class String>
	//  363  833:ldc1            #217 <Class AssetFileDescriptor>
	//  364  835:new             #322 <Class com.bumptech.glide.load.model.StringLoader$AssetFileDescriptorFactory>
	//  365  838:dup             
	//  366  839:invokespecial   #323 <Method void com.bumptech.glide.load.model.StringLoader$AssetFileDescriptorFactory()>
	//  367  842:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  368  845:ldc2            #270 <Class Uri>
	//  369  848:ldc1            #203 <Class InputStream>
	//  370  850:new             #325 <Class com.bumptech.glide.load.model.stream.HttpUriLoader$Factory>
	//  371  853:dup             
	//  372  854:invokespecial   #326 <Method void com.bumptech.glide.load.model.stream.HttpUriLoader$Factory()>
	//  373  857:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  374  860:ldc2            #270 <Class Uri>
	//  375  863:ldc1            #203 <Class InputStream>
	//  376  865:new             #328 <Class com.bumptech.glide.load.model.AssetUriLoader$StreamFactory>
	//  377  868:dup             
	//  378  869:aload_1         
	//  379  870:invokevirtual   #332 <Method android.content.res.AssetManager Context.getAssets()>
	//  380  873:invokespecial   #335 <Method void com.bumptech.glide.load.model.AssetUriLoader$StreamFactory(android.content.res.AssetManager)>
	//  381  876:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  382  879:ldc2            #270 <Class Uri>
	//  383  882:ldc1            #215 <Class ParcelFileDescriptor>
	//  384  884:new             #337 <Class com.bumptech.glide.load.model.AssetUriLoader$FileDescriptorFactory>
	//  385  887:dup             
	//  386  888:aload_1         
	//  387  889:invokevirtual   #332 <Method android.content.res.AssetManager Context.getAssets()>
	//  388  892:invokespecial   #338 <Method void com.bumptech.glide.load.model.AssetUriLoader$FileDescriptorFactory(android.content.res.AssetManager)>
	//  389  895:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  390  898:ldc2            #270 <Class Uri>
	//  391  901:ldc1            #203 <Class InputStream>
	//  392  903:new             #340 <Class com.bumptech.glide.load.model.stream.MediaStoreImageThumbLoader$Factory>
	//  393  906:dup             
	//  394  907:aload_1         
	//  395  908:invokespecial   #341 <Method void com.bumptech.glide.load.model.stream.MediaStoreImageThumbLoader$Factory(Context)>
	//  396  911:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  397  914:ldc2            #270 <Class Uri>
	//  398  917:ldc1            #203 <Class InputStream>
	//  399  919:new             #343 <Class com.bumptech.glide.load.model.stream.MediaStoreVideoThumbLoader$Factory>
	//  400  922:dup             
	//  401  923:aload_1         
	//  402  924:invokespecial   #344 <Method void com.bumptech.glide.load.model.stream.MediaStoreVideoThumbLoader$Factory(Context)>
	//  403  927:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  404  930:ldc2            #270 <Class Uri>
	//  405  933:ldc1            #203 <Class InputStream>
	//  406  935:new             #346 <Class com.bumptech.glide.load.model.UriLoader$StreamFactory>
	//  407  938:dup             
	//  408  939:aload           21
	//  409  941:invokespecial   #349 <Method void com.bumptech.glide.load.model.UriLoader$StreamFactory(android.content.ContentResolver)>
	//  410  944:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  411  947:ldc2            #270 <Class Uri>
	//  412  950:ldc1            #215 <Class ParcelFileDescriptor>
	//  413  952:new             #351 <Class com.bumptech.glide.load.model.UriLoader$FileDescriptorFactory>
	//  414  955:dup             
	//  415  956:aload           21
	//  416  958:invokespecial   #352 <Method void com.bumptech.glide.load.model.UriLoader$FileDescriptorFactory(android.content.ContentResolver)>
	//  417  961:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  418  964:ldc2            #270 <Class Uri>
	//  419  967:ldc1            #217 <Class AssetFileDescriptor>
	//  420  969:new             #354 <Class com.bumptech.glide.load.model.UriLoader$AssetFileDescriptorFactory>
	//  421  972:dup             
	//  422  973:aload           21
	//  423  975:invokespecial   #355 <Method void com.bumptech.glide.load.model.UriLoader$AssetFileDescriptorFactory(android.content.ContentResolver)>
	//  424  978:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  425  981:ldc2            #270 <Class Uri>
	//  426  984:ldc1            #203 <Class InputStream>
	//  427  986:new             #357 <Class com.bumptech.glide.load.model.UrlUriLoader$StreamFactory>
	//  428  989:dup             
	//  429  990:invokespecial   #358 <Method void com.bumptech.glide.load.model.UrlUriLoader$StreamFactory()>
	//  430  993:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  431  996:ldc2            #360 <Class URL>
	//  432  999:ldc1            #203 <Class InputStream>
	//  433 1001:new             #362 <Class com.bumptech.glide.load.model.stream.UrlLoader$StreamFactory>
	//  434 1004:dup             
	//  435 1005:invokespecial   #363 <Method void com.bumptech.glide.load.model.stream.UrlLoader$StreamFactory()>
	//  436 1008:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  437 1011:ldc2            #270 <Class Uri>
	//  438 1014:ldc2            #288 <Class File>
	//  439 1017:new             #365 <Class com.bumptech.glide.load.model.MediaStoreFileLoader$Factory>
	//  440 1020:dup             
	//  441 1021:aload_1         
	//  442 1022:invokespecial   #366 <Method void com.bumptech.glide.load.model.MediaStoreFileLoader$Factory(Context)>
	//  443 1025:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  444 1028:ldc2            #368 <Class GlideUrl>
	//  445 1031:ldc1            #203 <Class InputStream>
	//  446 1033:new             #370 <Class com.bumptech.glide.load.model.stream.HttpGlideUrlLoader$Factory>
	//  447 1036:dup             
	//  448 1037:invokespecial   #371 <Method void com.bumptech.glide.load.model.stream.HttpGlideUrlLoader$Factory()>
	//  449 1040:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  450 1043:ldc2            #373 <Class byte[]>
	//  451 1046:ldc1            #194 <Class ByteBuffer>
	//  452 1048:new             #375 <Class com.bumptech.glide.load.model.ByteArrayLoader$ByteBufferFactory>
	//  453 1051:dup             
	//  454 1052:invokespecial   #376 <Method void com.bumptech.glide.load.model.ByteArrayLoader$ByteBufferFactory()>
	//  455 1055:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  456 1058:ldc2            #373 <Class byte[]>
	//  457 1061:ldc1            #203 <Class InputStream>
	//  458 1063:new             #378 <Class com.bumptech.glide.load.model.ByteArrayLoader$StreamFactory>
	//  459 1066:dup             
	//  460 1067:invokespecial   #379 <Method void com.bumptech.glide.load.model.ByteArrayLoader$StreamFactory()>
	//  461 1070:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  462 1073:ldc2            #270 <Class Uri>
	//  463 1076:ldc2            #270 <Class Uri>
	//  464 1079:invokestatic    #226 <Method com.bumptech.glide.load.model.UnitModelLoader$Factory com.bumptech.glide.load.model.UnitModelLoader$Factory.getInstance()>
	//  465 1082:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  466 1085:ldc2            #272 <Class Drawable>
	//  467 1088:ldc2            #272 <Class Drawable>
	//  468 1091:invokestatic    #226 <Method com.bumptech.glide.load.model.UnitModelLoader$Factory com.bumptech.glide.load.model.UnitModelLoader$Factory.getInstance()>
	//  469 1094:invokevirtual   #229 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//  470 1097:ldc2            #272 <Class Drawable>
	//  471 1100:ldc2            #272 <Class Drawable>
	//  472 1103:new             #381 <Class UnitDrawableDecoder>
	//  473 1106:dup             
	//  474 1107:invokespecial   #382 <Method void UnitDrawableDecoder()>
	//  475 1110:invokevirtual   #275 <Method Registry Registry.append(Class, Class, com.bumptech.glide.load.ResourceDecoder)>
	//  476 1113:ldc1            #210 <Class Bitmap>
	//  477 1115:ldc1            #239 <Class BitmapDrawable>
	//  478 1117:new             #384 <Class BitmapDrawableTranscoder>
	//  479 1120:dup             
	//  480 1121:aload_3         
	//  481 1122:invokespecial   #385 <Method void BitmapDrawableTranscoder(Resources)>
	//  482 1125:invokevirtual   #388 <Method Registry Registry.register(Class, Class, com.bumptech.glide.load.resource.transcode.ResourceTranscoder)>
	//  483 1128:ldc1            #210 <Class Bitmap>
	//  484 1130:ldc2            #373 <Class byte[]>
	//  485 1133:aload           19
	//  486 1135:invokevirtual   #388 <Method Registry Registry.register(Class, Class, com.bumptech.glide.load.resource.transcode.ResourceTranscoder)>
	//  487 1138:ldc2            #272 <Class Drawable>
	//  488 1141:ldc2            #373 <Class byte[]>
	//  489 1144:new             #390 <Class DrawableBytesTranscoder>
	//  490 1147:dup             
	//  491 1148:aload           4
	//  492 1150:aload           19
	//  493 1152:aload           20
	//  494 1154:invokespecial   #393 <Method void DrawableBytesTranscoder(BitmapPool, com.bumptech.glide.load.resource.transcode.ResourceTranscoder, com.bumptech.glide.load.resource.transcode.ResourceTranscoder)>
	//  495 1157:invokevirtual   #388 <Method Registry Registry.register(Class, Class, com.bumptech.glide.load.resource.transcode.ResourceTranscoder)>
	//  496 1160:ldc1            #253 <Class GifDrawable>
	//  497 1162:ldc2            #373 <Class byte[]>
	//  498 1165:aload           20
	//  499 1167:invokevirtual   #388 <Method Registry Registry.register(Class, Class, com.bumptech.glide.load.resource.transcode.ResourceTranscoder)>
	//  500 1170:pop             
		memorycache = ((MemoryCache) (new ImageViewTargetFactory()));
	//  501 1171:new             #395 <Class ImageViewTargetFactory>
	//  502 1174:dup             
	//  503 1175:invokespecial   #396 <Method void ImageViewTargetFactory()>
	//  504 1178:astore_3        
		glideContext = new GlideContext(context, arraypool, registry, ((ImageViewTargetFactory) (memorycache)), requestoptions, map, engine1, i);
	//  505 1179:aload_0         
	//  506 1180:new             #398 <Class GlideContext>
	//  507 1183:dup             
	//  508 1184:aload_1         
	//  509 1185:aload           5
	//  510 1187:aload_0         
	//  511 1188:getfield        #108 <Field Registry registry>
	//  512 1191:aload_3         
	//  513 1192:aload           9
	//  514 1194:aload           10
	//  515 1196:aload_2         
	//  516 1197:iload           8
	//  517 1199:invokespecial   #401 <Method void GlideContext(Context, ArrayPool, Registry, ImageViewTargetFactory, RequestOptions, Map, Engine, int)>
	//  518 1202:putfield        #403 <Field GlideContext glideContext>
	//  519 1205:return          
	}

	private static void checkAndInitializeGlide(Context context)
	{
		if(!isInitializing)
	//*   0    0:getstatic       #410 <Field boolean isInitializing>
	//*   1    3:ifne            19
		{
			isInitializing = true;
	//    2    6:iconst_1        
	//    3    7:putstatic       #410 <Field boolean isInitializing>
			initializeGlide(context);
	//    4   10:aload_0         
	//    5   11:invokestatic    #413 <Method void initializeGlide(Context)>
			isInitializing = false;
	//    6   14:iconst_0        
	//    7   15:putstatic       #410 <Field boolean isInitializing>
			return;
	//    8   18:return          
		} else
		{
			throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
	//    9   19:new             #415 <Class IllegalStateException>
	//   10   22:dup             
	//   11   23:ldc2            #417 <String "You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead">
	//   12   26:invokespecial   #420 <Method void IllegalStateException(String)>
	//   13   29:athrow          
		}
	}

	public static Glide get(Context context)
	{
		if(glide != null)
			break MISSING_BLOCK_LABEL_31;
	//    0    0:getstatic       #423 <Field Glide glide>
	//    1    3:ifnonnull       31
		com/bumptech/glide/Glide;
	//    2    6:ldc1            #2   <Class Glide>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(glide == null)
	//*   4    9:getstatic       #423 <Field Glide glide>
	//*   5   12:ifnonnull       19
			checkAndInitializeGlide(context);
	//    6   15:aload_0         
	//    7   16:invokestatic    #425 <Method void checkAndInitializeGlide(Context)>
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
	//   16   31:getstatic       #423 <Field Glide glide>
	//   17   34:areturn         
	}

	private static GeneratedAppGlideModule getAnnotationGeneratedGlideModules()
	{
		GeneratedAppGlideModule generatedappglidemodule = (GeneratedAppGlideModule)Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
	//    0    0:ldc2            #441 <String "com.bumptech.glide.GeneratedAppGlideModuleImpl">
	//    1    3:invokestatic    #447 <Method Class Class.forName(String)>
	//    2    6:iconst_0        
	//    3    7:anewarray       Class[]
	//    4   10:invokevirtual   #451 <Method Constructor Class.getDeclaredConstructor(Class[])>
	//    5   13:iconst_0        
	//    6   14:anewarray       Object[]
	//    7   17:invokevirtual   #457 <Method Object Constructor.newInstance(Object[])>
	//    8   20:checkcast       #459 <Class GeneratedAppGlideModule>
	//    9   23:astore_0        
		return generatedappglidemodule;
	//   10   24:aload_0         
	//   11   25:areturn         
		Object obj;
		obj;
	//   12   26:astore_0        
		throwIncorrectGlideModule(((Exception) (obj)));
	//   13   27:aload_0         
	//   14   28:invokestatic    #463 <Method void throwIncorrectGlideModule(Exception)>
		  goto _L1
	//*  15   31:goto            76
		obj;
	//   16   34:astore_0        
		throwIncorrectGlideModule(((Exception) (obj)));
	//   17   35:aload_0         
	//   18   36:invokestatic    #463 <Method void throwIncorrectGlideModule(Exception)>
		  goto _L1
	//*  19   39:goto            76
		obj;
	//   20   42:astore_0        
		throwIncorrectGlideModule(((Exception) (obj)));
	//   21   43:aload_0         
	//   22   44:invokestatic    #463 <Method void throwIncorrectGlideModule(Exception)>
		  goto _L1
	//*  23   47:goto            76
		obj;
	//   24   50:astore_0        
		throwIncorrectGlideModule(((Exception) (obj)));
	//   25   51:aload_0         
	//   26   52:invokestatic    #463 <Method void throwIncorrectGlideModule(Exception)>
		  goto _L1
	//*  27   55:goto            76
_L3:
		if(Log.isLoggable("Glide", 5))
	//*  28   58:ldc1            #13  <String "Glide">
	//*  29   60:iconst_5        
	//*  30   61:invokestatic    #469 <Method boolean Log.isLoggable(String, int)>
	//*  31   64:ifeq            76
			Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
	//   32   67:ldc1            #13  <String "Glide">
	//   33   69:ldc2            #471 <String "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored">
	//   34   72:invokestatic    #475 <Method int Log.w(String, String)>
	//   35   75:pop             
_L1:
		return null;
	//   36   76:aconst_null     
	//   37   77:areturn         
		obj;
	//   38   78:astore_0        
		if(true) goto _L3; else goto _L2
_L2:
	//*  39   79:goto            58
	}

	public static File getPhotoCacheDir(Context context)
	{
		return getPhotoCacheDir(context, "image_manager_disk_cache");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "image_manager_disk_cache">
	//    2    3:invokestatic    #480 <Method File getPhotoCacheDir(Context, String)>
	//    3    6:areturn         
	}

	public static File getPhotoCacheDir(Context context, String s)
	{
		context = ((Context) (context.getCacheDir()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #484 <Method File Context.getCacheDir()>
	//    2    4:astore_0        
		if(context != null)
	//*   3    5:aload_0         
	//*   4    6:ifnull          44
		{
			context = ((Context) (new File(((File) (context)), s)));
	//    5    9:new             #288 <Class File>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #487 <Method void File(File, String)>
	//   10   18:astore_0        
			if(!((File) (context)).mkdirs() && (!((File) (context)).exists() || !((File) (context)).isDirectory()))
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #491 <Method boolean File.mkdirs()>
	//*  13   23:ifne            42
	//*  14   26:aload_0         
	//*  15   27:invokevirtual   #494 <Method boolean File.exists()>
	//*  16   30:ifeq            40
	//*  17   33:aload_0         
	//*  18   34:invokevirtual   #497 <Method boolean File.isDirectory()>
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
	//*  24   44:ldc1            #13  <String "Glide">
	//*  25   46:bipush          6
	//*  26   48:invokestatic    #469 <Method boolean Log.isLoggable(String, int)>
	//*  27   51:ifeq            63
			Log.e("Glide", "default disk cache dir is null");
	//   28   54:ldc1            #13  <String "Glide">
	//   29   56:ldc2            #499 <String "default disk cache dir is null">
	//   30   59:invokestatic    #502 <Method int Log.e(String, String)>
	//   31   62:pop             
		return null;
	//   32   63:aconst_null     
	//   33   64:areturn         
	}

	private static RequestManagerRetriever getRetriever(Context context)
	{
		Preconditions.checkNotNull(((Object) (context)), "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
	//    0    0:aload_0         
	//    1    1:ldc2            #506 <String "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).">
	//    2    4:invokestatic    #512 <Method Object Preconditions.checkNotNull(Object, String)>
	//    3    7:pop             
		return get(context).getRequestManagerRetriever();
	//    4    8:aload_0         
	//    5    9:invokestatic    #514 <Method Glide get(Context)>
	//    6   12:invokevirtual   #518 <Method RequestManagerRetriever getRequestManagerRetriever()>
	//    7   15:areturn         
	}

	public static void init(Context context, GlideBuilder glidebuilder)
	{
		com/bumptech/glide/Glide;
	//    0    0:ldc1            #2   <Class Glide>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(glide != null)
	//*   2    3:getstatic       #423 <Field Glide glide>
	//*   3    6:ifnull          12
			tearDown();
	//    4    9:invokestatic    #524 <Method void tearDown()>
		initializeGlide(context, glidebuilder);
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:invokestatic    #526 <Method void initializeGlide(Context, GlideBuilder)>
		com/bumptech/glide/Glide;
	//    8   17:ldc1            #2   <Class Glide>
		JVM INSTR monitorexit ;
	//    9   19:monitorexit     
		return;
	//   10   20:return          
		context;
	//   11   21:astore_0        
	//*  12   22:ldc1            #2   <Class Glide>
		throw context;
	//   13   24:monitorexit     
	//   14   25:aload_0         
	//   15   26:athrow          
	}

	public static void init(Glide glide1)
	{
		com/bumptech/glide/Glide;
	//    0    0:ldc1            #2   <Class Glide>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(glide != null)
	//*   2    3:getstatic       #423 <Field Glide glide>
	//*   3    6:ifnull          12
			tearDown();
	//    4    9:invokestatic    #524 <Method void tearDown()>
		glide = glide1;
	//    5   12:aload_0         
	//    6   13:putstatic       #423 <Field Glide glide>
		com/bumptech/glide/Glide;
	//    7   16:ldc1            #2   <Class Glide>
		JVM INSTR monitorexit ;
	//    8   18:monitorexit     
		return;
	//    9   19:return          
		glide1;
	//   10   20:astore_0        
	//*  11   21:ldc1            #2   <Class Glide>
		throw glide1;
	//   12   23:monitorexit     
	//   13   24:aload_0         
	//   14   25:athrow          
	}

	private static void initializeGlide(Context context)
	{
		initializeGlide(context, new GlideBuilder());
	//    0    0:aload_0         
	//    1    1:new             #531 <Class GlideBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #532 <Method void GlideBuilder()>
	//    4    8:invokestatic    #526 <Method void initializeGlide(Context, GlideBuilder)>
	//    5   11:return          
	}

	private static void initializeGlide(Context context, GlideBuilder glidebuilder)
	{
		Context context1 = context.getApplicationContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #536 <Method Context Context.getApplicationContext()>
	//    2    4:astore_3        
		GeneratedAppGlideModule generatedappglidemodule = getAnnotationGeneratedGlideModules();
	//    3    5:invokestatic    #538 <Method GeneratedAppGlideModule getAnnotationGeneratedGlideModules()>
	//    4    8:astore          4
		context = ((Context) (Collections.emptyList()));
	//    5   10:invokestatic    #543 <Method List Collections.emptyList()>
	//    6   13:astore_0        
		if(generatedappglidemodule == null || generatedappglidemodule.isManifestParsingEnabled())
	//*   7   14:aload           4
	//*   8   16:ifnull          27
	//*   9   19:aload           4
	//*  10   21:invokevirtual   #546 <Method boolean GeneratedAppGlideModule.isManifestParsingEnabled()>
	//*  11   24:ifeq            39
			context = ((Context) ((new ManifestParser(context1)).parse()));
	//   12   27:new             #548 <Class ManifestParser>
	//   13   30:dup             
	//   14   31:aload_3         
	//   15   32:invokespecial   #549 <Method void ManifestParser(Context)>
	//   16   35:invokevirtual   #552 <Method List ManifestParser.parse()>
	//   17   38:astore_0        
		if(generatedappglidemodule != null && !generatedappglidemodule.getExcludedModuleClasses().isEmpty())
	//*  18   39:aload           4
	//*  19   41:ifnull          166
	//*  20   44:aload           4
	//*  21   46:invokevirtual   #556 <Method Set GeneratedAppGlideModule.getExcludedModuleClasses()>
	//*  22   49:invokeinterface #561 <Method boolean Set.isEmpty()>
	//*  23   54:ifne            166
		{
			Set set = generatedappglidemodule.getExcludedModuleClasses();
	//   24   57:aload           4
	//   25   59:invokevirtual   #556 <Method Set GeneratedAppGlideModule.getExcludedModuleClasses()>
	//   26   62:astore_2        
			Iterator iterator2 = ((List) (context)).iterator();
	//   27   63:aload_0         
	//   28   64:invokeinterface #567 <Method Iterator List.iterator()>
	//   29   69:astore          5
			do
			{
				if(!iterator2.hasNext())
					break;
	//   30   71:aload           5
	//   31   73:invokeinterface #572 <Method boolean Iterator.hasNext()>
	//   32   78:ifeq            166
				GlideModule glidemodule1 = (GlideModule)iterator2.next();
	//   33   81:aload           5
	//   34   83:invokeinterface #576 <Method Object Iterator.next()>
	//   35   88:checkcast       #578 <Class GlideModule>
	//   36   91:astore          6
				if(set.contains(((Object) (((Object) (glidemodule1)).getClass()))))
	//*  37   93:aload_2         
	//*  38   94:aload           6
	//*  39   96:invokevirtual   #582 <Method Class Object.getClass()>
	//*  40   99:invokeinterface #586 <Method boolean Set.contains(Object)>
	//*  41  104:ifne            110
	//*  42  107:goto            71
				{
					if(Log.isLoggable("Glide", 3))
	//*  43  110:ldc1            #13  <String "Glide">
	//*  44  112:iconst_3        
	//*  45  113:invokestatic    #469 <Method boolean Log.isLoggable(String, int)>
	//*  46  116:ifeq            156
					{
						StringBuilder stringbuilder1 = new StringBuilder();
	//   47  119:new             #588 <Class StringBuilder>
	//   48  122:dup             
	//   49  123:invokespecial   #589 <Method void StringBuilder()>
	//   50  126:astore          7
						stringbuilder1.append("AppGlideModule excludes manifest GlideModule: ");
	//   51  128:aload           7
	//   52  130:ldc2            #591 <String "AppGlideModule excludes manifest GlideModule: ">
	//   53  133:invokevirtual   #594 <Method StringBuilder StringBuilder.append(String)>
	//   54  136:pop             
						stringbuilder1.append(((Object) (glidemodule1)));
	//   55  137:aload           7
	//   56  139:aload           6
	//   57  141:invokevirtual   #597 <Method StringBuilder StringBuilder.append(Object)>
	//   58  144:pop             
						Log.d("Glide", stringbuilder1.toString());
	//   59  145:ldc1            #13  <String "Glide">
	//   60  147:aload           7
	//   61  149:invokevirtual   #601 <Method String StringBuilder.toString()>
	//   62  152:invokestatic    #604 <Method int Log.d(String, String)>
	//   63  155:pop             
					}
					iterator2.remove();
	//   64  156:aload           5
	//   65  158:invokeinterface #607 <Method void Iterator.remove()>
				}
			} while(true);
	//   66  163:goto            71
		}
		if(Log.isLoggable("Glide", 3))
	//*  67  166:ldc1            #13  <String "Glide">
	//*  68  168:iconst_3        
	//*  69  169:invokestatic    #469 <Method boolean Log.isLoggable(String, int)>
	//*  70  172:ifeq            245
		{
			StringBuilder stringbuilder;
			for(Iterator iterator = ((List) (context)).iterator(); iterator.hasNext(); Log.d("Glide", stringbuilder.toString()))
	//*  71  175:aload_0         
	//*  72  176:invokeinterface #567 <Method Iterator List.iterator()>
	//*  73  181:astore_2        
	//*  74  182:aload_2         
	//*  75  183:invokeinterface #572 <Method boolean Iterator.hasNext()>
	//*  76  188:ifeq            245
			{
				GlideModule glidemodule = (GlideModule)iterator.next();
	//   77  191:aload_2         
	//   78  192:invokeinterface #576 <Method Object Iterator.next()>
	//   79  197:checkcast       #578 <Class GlideModule>
	//   80  200:astore          5
				stringbuilder = new StringBuilder();
	//   81  202:new             #588 <Class StringBuilder>
	//   82  205:dup             
	//   83  206:invokespecial   #589 <Method void StringBuilder()>
	//   84  209:astore          6
				stringbuilder.append("Discovered GlideModule from manifest: ");
	//   85  211:aload           6
	//   86  213:ldc2            #609 <String "Discovered GlideModule from manifest: ">
	//   87  216:invokevirtual   #594 <Method StringBuilder StringBuilder.append(String)>
	//   88  219:pop             
				stringbuilder.append(((Object) (((Object) (glidemodule)).getClass())));
	//   89  220:aload           6
	//   90  222:aload           5
	//   91  224:invokevirtual   #582 <Method Class Object.getClass()>
	//   92  227:invokevirtual   #597 <Method StringBuilder StringBuilder.append(Object)>
	//   93  230:pop             
			}

	//   94  231:ldc1            #13  <String "Glide">
	//   95  233:aload           6
	//   96  235:invokevirtual   #601 <Method String StringBuilder.toString()>
	//   97  238:invokestatic    #604 <Method int Log.d(String, String)>
	//   98  241:pop             
		}
	//*  99  242:goto            182
		com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory requestmanagerfactory;
		if(generatedappglidemodule != null)
	//* 100  245:aload           4
	//* 101  247:ifnull          259
			requestmanagerfactory = generatedappglidemodule.getRequestManagerFactory();
	//  102  250:aload           4
	//  103  252:invokevirtual   #613 <Method com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory GeneratedAppGlideModule.getRequestManagerFactory()>
	//  104  255:astore_2        
		else
	//* 105  256:goto            261
			requestmanagerfactory = null;
	//  106  259:aconst_null     
	//  107  260:astore_2        
		glidebuilder.setRequestManagerFactory(requestmanagerfactory);
	//  108  261:aload_1         
	//  109  262:aload_2         
	//  110  263:invokevirtual   #617 <Method void GlideBuilder.setRequestManagerFactory(com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory)>
		for(Iterator iterator1 = ((List) (context)).iterator(); iterator1.hasNext(); ((GlideModule)iterator1.next()).applyOptions(context1, glidebuilder));
	//  111  266:aload_0         
	//  112  267:invokeinterface #567 <Method Iterator List.iterator()>
	//  113  272:astore_2        
	//  114  273:aload_2         
	//  115  274:invokeinterface #572 <Method boolean Iterator.hasNext()>
	//  116  279:ifeq            301
	//  117  282:aload_2         
	//  118  283:invokeinterface #576 <Method Object Iterator.next()>
	//  119  288:checkcast       #578 <Class GlideModule>
	//  120  291:aload_3         
	//  121  292:aload_1         
	//  122  293:invokeinterface #620 <Method void GlideModule.applyOptions(Context, GlideBuilder)>
	//* 123  298:goto            273
		if(generatedappglidemodule != null)
	//* 124  301:aload           4
	//* 125  303:ifnull          313
			generatedappglidemodule.applyOptions(context1, glidebuilder);
	//  126  306:aload           4
	//  127  308:aload_3         
	//  128  309:aload_1         
	//  129  310:invokevirtual   #621 <Method void GeneratedAppGlideModule.applyOptions(Context, GlideBuilder)>
		glidebuilder = ((GlideBuilder) (glidebuilder.build(context1)));
	//  130  313:aload_1         
	//  131  314:aload_3         
	//  132  315:invokevirtual   #624 <Method Glide GlideBuilder.build(Context)>
	//  133  318:astore_1        
		for(context = ((Context) (((List) (context)).iterator())); ((Iterator) (context)).hasNext(); ((GlideModule)((Iterator) (context)).next()).registerComponents(context1, ((Glide) (glidebuilder)), ((Glide) (glidebuilder)).registry));
	//  134  319:aload_0         
	//  135  320:invokeinterface #567 <Method Iterator List.iterator()>
	//  136  325:astore_0        
	//  137  326:aload_0         
	//  138  327:invokeinterface #572 <Method boolean Iterator.hasNext()>
	//  139  332:ifeq            358
	//  140  335:aload_0         
	//  141  336:invokeinterface #576 <Method Object Iterator.next()>
	//  142  341:checkcast       #578 <Class GlideModule>
	//  143  344:aload_3         
	//  144  345:aload_1         
	//  145  346:aload_1         
	//  146  347:getfield        #108 <Field Registry registry>
	//  147  350:invokeinterface #628 <Method void GlideModule.registerComponents(Context, Glide, Registry)>
	//* 148  355:goto            326
		if(generatedappglidemodule != null)
	//* 149  358:aload           4
	//* 150  360:ifnull          374
			generatedappglidemodule.registerComponents(context1, ((Glide) (glidebuilder)), ((Glide) (glidebuilder)).registry);
	//  151  363:aload           4
	//  152  365:aload_3         
	//  153  366:aload_1         
	//  154  367:aload_1         
	//  155  368:getfield        #108 <Field Registry registry>
	//  156  371:invokevirtual   #629 <Method void GeneratedAppGlideModule.registerComponents(Context, Glide, Registry)>
		context1.registerComponentCallbacks(((android.content.ComponentCallbacks) (glidebuilder)));
	//  157  374:aload_3         
	//  158  375:aload_1         
	//  159  376:invokevirtual   #633 <Method void Context.registerComponentCallbacks(android.content.ComponentCallbacks)>
		glide = ((Glide) (glidebuilder));
	//  160  379:aload_1         
	//  161  380:putstatic       #423 <Field Glide glide>
	//  162  383:return          
	}

	public static void tearDown()
	{
		com/bumptech/glide/Glide;
	//    0    0:ldc1            #2   <Class Glide>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(glide != null)
	//*   2    3:getstatic       #423 <Field Glide glide>
	//*   3    6:ifnull          33
		{
			glide.getContext().getApplicationContext().unregisterComponentCallbacks(((android.content.ComponentCallbacks) (glide)));
	//    4    9:getstatic       #423 <Field Glide glide>
	//    5   12:invokevirtual   #636 <Method Context getContext()>
	//    6   15:invokevirtual   #536 <Method Context Context.getApplicationContext()>
	//    7   18:getstatic       #423 <Field Glide glide>
	//    8   21:invokevirtual   #639 <Method void Context.unregisterComponentCallbacks(android.content.ComponentCallbacks)>
			glide.engine.shutdown();
	//    9   24:getstatic       #423 <Field Glide glide>
	//   10   27:getfield        #60  <Field Engine engine>
	//   11   30:invokevirtual   #644 <Method void Engine.shutdown()>
		}
		glide = null;
	//   12   33:aconst_null     
	//   13   34:putstatic       #423 <Field Glide glide>
		com/bumptech/glide/Glide;
	//   14   37:ldc1            #2   <Class Glide>
		JVM INSTR monitorexit ;
	//   15   39:monitorexit     
		return;
	//   16   40:return          
		Exception exception;
		exception;
	//   17   41:astore_0        
	//*  18   42:ldc1            #2   <Class Glide>
		throw exception;
	//   19   44:monitorexit     
	//   20   45:aload_0         
	//   21   46:athrow          
	}

	private static void throwIncorrectGlideModule(Exception exception)
	{
		throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", ((Throwable) (exception)));
	//    0    0:new             #415 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc2            #646 <String "GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.">
	//    3    7:aload_0         
	//    4    8:invokespecial   #649 <Method void IllegalStateException(String, Throwable)>
	//    5   11:athrow          
	}

	public static RequestManager with(Activity activity)
	{
		return getRetriever(((Context) (activity))).get(activity);
	//    0    0:aload_0         
	//    1    1:invokestatic    #653 <Method RequestManagerRetriever getRetriever(Context)>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #657 <Method RequestManager RequestManagerRetriever.get(Activity)>
	//    4    8:areturn         
	}

	public static RequestManager with(Fragment fragment)
	{
		return getRetriever(((Context) (fragment.getActivity()))).get(fragment);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #664 <Method Activity Fragment.getActivity()>
	//    2    4:invokestatic    #653 <Method RequestManagerRetriever getRetriever(Context)>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #666 <Method RequestManager RequestManagerRetriever.get(Fragment)>
	//    5   11:areturn         
	}

	public static RequestManager with(Context context)
	{
		return getRetriever(context).get(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #653 <Method RequestManagerRetriever getRetriever(Context)>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #669 <Method RequestManager RequestManagerRetriever.get(Context)>
	//    4    8:areturn         
	}

	public static RequestManager with(android.support.v4.app.Fragment fragment)
	{
		return getRetriever(((Context) (fragment.getActivity()))).get(fragment);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #675 <Method FragmentActivity android.support.v4.app.Fragment.getActivity()>
	//    2    4:invokestatic    #653 <Method RequestManagerRetriever getRetriever(Context)>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #677 <Method RequestManager RequestManagerRetriever.get(android.support.v4.app.Fragment)>
	//    5   11:areturn         
	}

	public static RequestManager with(FragmentActivity fragmentactivity)
	{
		return getRetriever(((Context) (fragmentactivity))).get(fragmentactivity);
	//    0    0:aload_0         
	//    1    1:invokestatic    #653 <Method RequestManagerRetriever getRetriever(Context)>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #680 <Method RequestManager RequestManagerRetriever.get(FragmentActivity)>
	//    4    8:areturn         
	}

	public static RequestManager with(View view)
	{
		return getRetriever(view.getContext()).get(view);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #684 <Method Context View.getContext()>
	//    2    4:invokestatic    #653 <Method RequestManagerRetriever getRetriever(Context)>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #686 <Method RequestManager RequestManagerRetriever.get(View)>
	//    5   11:areturn         
	}

	public void clearDiskCache()
	{
		Util.assertBackgroundThread();
	//    0    0:invokestatic    #692 <Method void Util.assertBackgroundThread()>
		engine.clearDiskCache();
	//    1    3:aload_0         
	//    2    4:getfield        #60  <Field Engine engine>
	//    3    7:invokevirtual   #694 <Method void Engine.clearDiskCache()>
	//    4   10:return          
	}

	public void clearMemory()
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #698 <Method void Util.assertMainThread()>
		memoryCache.clearMemory();
	//    1    3:aload_0         
	//    2    4:getfield        #66  <Field MemoryCache memoryCache>
	//    3    7:invokeinterface #702 <Method void MemoryCache.clearMemory()>
		bitmapPool.clearMemory();
	//    4   12:aload_0         
	//    5   13:getfield        #62  <Field BitmapPool bitmapPool>
	//    6   16:invokeinterface #705 <Method void BitmapPool.clearMemory()>
		arrayPool.clearMemory();
	//    7   21:aload_0         
	//    8   22:getfield        #64  <Field ArrayPool arrayPool>
	//    9   25:invokeinterface #708 <Method void ArrayPool.clearMemory()>
	//   10   30:return          
	}

	public ArrayPool getArrayPool()
	{
		return arrayPool;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field ArrayPool arrayPool>
	//    2    4:areturn         
	}

	public BitmapPool getBitmapPool()
	{
		return bitmapPool;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field BitmapPool bitmapPool>
	//    2    4:areturn         
	}

	ConnectivityMonitorFactory getConnectivityMonitorFactory()
	{
		return connectivityMonitorFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field ConnectivityMonitorFactory connectivityMonitorFactory>
	//    2    4:areturn         
	}

	public Context getContext()
	{
		return glideContext.getBaseContext();
	//    0    0:aload_0         
	//    1    1:getfield        #403 <Field GlideContext glideContext>
	//    2    4:invokevirtual   #717 <Method Context GlideContext.getBaseContext()>
	//    3    7:areturn         
	}

	GlideContext getGlideContext()
	{
		return glideContext;
	//    0    0:aload_0         
	//    1    1:getfield        #403 <Field GlideContext glideContext>
	//    2    4:areturn         
	}

	public Registry getRegistry()
	{
		return registry;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field Registry registry>
	//    2    4:areturn         
	}

	public RequestManagerRetriever getRequestManagerRetriever()
	{
		return requestManagerRetriever;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field RequestManagerRetriever requestManagerRetriever>
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
	//    1    1:invokevirtual   #725 <Method void clearMemory()>
	//    2    4:return          
	}

	public void onTrimMemory(int i)
	{
		trimMemory(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #730 <Method void trimMemory(int)>
	//    3    5:return          
	}

	public transient void preFillBitmapPool(com.bumptech.glide.load.engine.prefill.PreFillType.Builder abuilder[])
	{
		bitmapPreFiller.preFill(abuilder);
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field BitmapPreFiller bitmapPreFiller>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #735 <Method void BitmapPreFiller.preFill(com.bumptech.glide.load.engine.prefill.PreFillType$Builder[])>
	//    4    8:return          
	}

	void registerRequestManager(RequestManager requestmanager)
	{
label0:
		{
			synchronized(managers)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field List managers>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(managers.contains(((Object) (requestmanager))))
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #51  <Field List managers>
	//    7   11:aload_1         
	//    8   12:invokeinterface #738 <Method boolean List.contains(Object)>
	//    9   17:ifne            34
				managers.add(((Object) (requestmanager)));
	//   10   20:aload_0         
	//   11   21:getfield        #51  <Field List managers>
	//   12   24:aload_1         
	//   13   25:invokeinterface #741 <Method boolean List.add(Object)>
	//   14   30:pop             
			}
	//   15   31:aload_2         
	//   16   32:monitorexit     
			return;
	//   17   33:return          
		}
		throw new IllegalStateException("Cannot register already registered manager");
	//   18   34:new             #415 <Class IllegalStateException>
	//   19   37:dup             
	//   20   38:ldc2            #743 <String "Cannot register already registered manager">
	//   21   41:invokespecial   #420 <Method void IllegalStateException(String)>
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
	//*   1    1:getfield        #51  <Field List managers>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				Iterator iterator = managers.iterator();
	//    5    7:aload_0         
	//    6    8:getfield        #51  <Field List managers>
	//    7   11:invokeinterface #567 <Method Iterator List.iterator()>
	//    8   16:astore_3        
				do
					if(!iterator.hasNext())
						break label0;
	//    9   17:aload_3         
	//   10   18:invokeinterface #572 <Method boolean Iterator.hasNext()>
	//   11   23:ifeq            46
				while(!((RequestManager)iterator.next()).untrack(target));
	//   12   26:aload_3         
	//   13   27:invokeinterface #576 <Method Object Iterator.next()>
	//   14   32:checkcast       #747 <Class RequestManager>
	//   15   35:aload_1         
	//   16   36:invokevirtual   #750 <Method boolean RequestManager.untrack(Target)>
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

	public MemoryCategory setMemoryCategory(MemoryCategory memorycategory)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #698 <Method void Util.assertMainThread()>
		memoryCache.setSizeMultiplier(memorycategory.getMultiplier());
	//    1    3:aload_0         
	//    2    4:getfield        #66  <Field MemoryCache memoryCache>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #757 <Method float MemoryCategory.getMultiplier()>
	//    5   11:invokeinterface #761 <Method void MemoryCache.setSizeMultiplier(float)>
		bitmapPool.setSizeMultiplier(memorycategory.getMultiplier());
	//    6   16:aload_0         
	//    7   17:getfield        #62  <Field BitmapPool bitmapPool>
	//    8   20:aload_1         
	//    9   21:invokevirtual   #757 <Method float MemoryCategory.getMultiplier()>
	//   10   24:invokeinterface #762 <Method void BitmapPool.setSizeMultiplier(float)>
		MemoryCategory memorycategory1 = memoryCategory;
	//   11   29:aload_0         
	//   12   30:getfield        #58  <Field MemoryCategory memoryCategory>
	//   13   33:astore_2        
		memoryCategory = memorycategory;
	//   14   34:aload_0         
	//   15   35:aload_1         
	//   16   36:putfield        #58  <Field MemoryCategory memoryCategory>
		return memorycategory1;
	//   17   39:aload_2         
	//   18   40:areturn         
	}

	public void trimMemory(int i)
	{
		Util.assertMainThread();
	//    0    0:invokestatic    #698 <Method void Util.assertMainThread()>
		memoryCache.trimMemory(i);
	//    1    3:aload_0         
	//    2    4:getfield        #66  <Field MemoryCache memoryCache>
	//    3    7:iload_1         
	//    4    8:invokeinterface #763 <Method void MemoryCache.trimMemory(int)>
		bitmapPool.trimMemory(i);
	//    5   13:aload_0         
	//    6   14:getfield        #62  <Field BitmapPool bitmapPool>
	//    7   17:iload_1         
	//    8   18:invokeinterface #764 <Method void BitmapPool.trimMemory(int)>
		arrayPool.trimMemory(i);
	//    9   23:aload_0         
	//   10   24:getfield        #64  <Field ArrayPool arrayPool>
	//   11   27:iload_1         
	//   12   28:invokeinterface #765 <Method void ArrayPool.trimMemory(int)>
	//   13   33:return          
	}

	void unregisterRequestManager(RequestManager requestmanager)
	{
label0:
		{
			synchronized(managers)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field List managers>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(!managers.contains(((Object) (requestmanager))))
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #51  <Field List managers>
	//    7   11:aload_1         
	//    8   12:invokeinterface #738 <Method boolean List.contains(Object)>
	//    9   17:ifeq            34
				managers.remove(((Object) (requestmanager)));
	//   10   20:aload_0         
	//   11   21:getfield        #51  <Field List managers>
	//   12   24:aload_1         
	//   13   25:invokeinterface #768 <Method boolean List.remove(Object)>
	//   14   30:pop             
			}
	//   15   31:aload_2         
	//   16   32:monitorexit     
			return;
	//   17   33:return          
		}
		throw new IllegalStateException("Cannot unregister not yet registered manager");
	//   18   34:new             #415 <Class IllegalStateException>
	//   19   37:dup             
	//   20   38:ldc2            #770 <String "Cannot unregister not yet registered manager">
	//   21   41:invokespecial   #420 <Method void IllegalStateException(String)>
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

	private static final String DEFAULT_DISK_CACHE_DIR = "image_manager_disk_cache";
	private static final String TAG = "Glide";
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
