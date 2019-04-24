// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.gifdecoder.*;
import com.bumptech.glide.load.*;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.UnitTransformation;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

// Referenced classes of package com.bumptech.glide.load.resource.gif:
//			GifBitmapProvider, GifDrawable, GifDrawableResource

public class ByteBufferGifDecoder
	implements ResourceDecoder
{
	static class GifDecoderFactory
	{

		public GifDecoder build(com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider bitmapprovider, GifHeader gifheader, ByteBuffer bytebuffer, int i)
		{
			return ((GifDecoder) (new StandardGifDecoder(bitmapprovider, gifheader, bytebuffer, i)));
		//    0    0:new             #16  <Class StandardGifDecoder>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:iload           4
		//    6    9:invokespecial   #19  <Method void StandardGifDecoder(com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider, GifHeader, ByteBuffer, int)>
		//    7   12:areturn         
		}

		GifDecoderFactory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	static class GifHeaderParserPool
	{

		public GifHeaderParser obtain(ByteBuffer bytebuffer)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			GifHeaderParser gifheaderparser1 = (GifHeaderParser)pool.poll();
		//    2    2:aload_0         
		//    3    3:getfield        #22  <Field Queue pool>
		//    4    6:invokeinterface #31  <Method Object Queue.poll()>
		//    5   11:checkcast       #33  <Class GifHeaderParser>
		//    6   14:astore_3        
			GifHeaderParser gifheaderparser;
			gifheaderparser = gifheaderparser1;
		//    7   15:aload_3         
		//    8   16:astore_2        
			if(gifheaderparser1 != null)
				break MISSING_BLOCK_LABEL_29;
		//    9   17:aload_3         
		//   10   18:ifnonnull       29
			gifheaderparser = new GifHeaderParser();
		//   11   21:new             #33  <Class GifHeaderParser>
		//   12   24:dup             
		//   13   25:invokespecial   #34  <Method void GifHeaderParser()>
		//   14   28:astore_2        
			bytebuffer = ((ByteBuffer) (gifheaderparser.setData(bytebuffer)));
		//   15   29:aload_2         
		//   16   30:aload_1         
		//   17   31:invokevirtual   #37  <Method GifHeaderParser GifHeaderParser.setData(ByteBuffer)>
		//   18   34:astore_1        
			this;
		//   19   35:aload_0         
			JVM INSTR monitorexit ;
		//   20   36:monitorexit     
			return ((GifHeaderParser) (bytebuffer));
		//   21   37:aload_1         
		//   22   38:areturn         
			bytebuffer;
		//   23   39:astore_1        
		//*  24   40:aload_0         
			throw bytebuffer;
		//   25   41:monitorexit     
		//   26   42:aload_1         
		//   27   43:athrow          
		}

		public void release(GifHeaderParser gifheaderparser)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			gifheaderparser.clear();
		//    2    2:aload_1         
		//    3    3:invokevirtual   #42  <Method void GifHeaderParser.clear()>
			pool.offer(((Object) (gifheaderparser)));
		//    4    6:aload_0         
		//    5    7:getfield        #22  <Field Queue pool>
		//    6   10:aload_1         
		//    7   11:invokeinterface #46  <Method boolean Queue.offer(Object)>
		//    8   16:pop             
			this;
		//    9   17:aload_0         
			JVM INSTR monitorexit ;
		//   10   18:monitorexit     
			return;
		//   11   19:return          
			gifheaderparser;
		//   12   20:astore_1        
		//*  13   21:aload_0         
			throw gifheaderparser;
		//   14   22:monitorexit     
		//   15   23:aload_1         
		//   16   24:athrow          
		}

		private final Queue pool = Util.createQueue(0);

		GifHeaderParserPool()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:invokestatic    #20  <Method Queue Util.createQueue(int)>
		//    5    9:putfield        #22  <Field Queue pool>
		//    6   12:return          
		}
	}


	public ByteBufferGifDecoder(Context context1)
	{
		this(context1, Glide.get(context1).getRegistry().getImageHeaderParsers(), Glide.get(context1).getBitmapPool(), Glide.get(context1).getArrayPool());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokestatic    #69  <Method Glide Glide.get(Context)>
	//    4    6:invokevirtual   #73  <Method Registry Glide.getRegistry()>
	//    5    9:invokevirtual   #79  <Method List Registry.getImageHeaderParsers()>
	//    6   12:aload_1         
	//    7   13:invokestatic    #69  <Method Glide Glide.get(Context)>
	//    8   16:invokevirtual   #83  <Method BitmapPool Glide.getBitmapPool()>
	//    9   19:aload_1         
	//   10   20:invokestatic    #69  <Method Glide Glide.get(Context)>
	//   11   23:invokevirtual   #87  <Method ArrayPool Glide.getArrayPool()>
	//   12   26:invokespecial   #90  <Method void ByteBufferGifDecoder(Context, List, BitmapPool, ArrayPool)>
	//   13   29:return          
	}

	public ByteBufferGifDecoder(Context context1, List list, BitmapPool bitmappool, ArrayPool arraypool)
	{
		this(context1, list, bitmappool, arraypool, PARSER_POOL, GIF_DECODER_FACTORY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:getstatic       #61  <Field ByteBufferGifDecoder$GifHeaderParserPool PARSER_POOL>
	//    6    9:getstatic       #42  <Field ByteBufferGifDecoder$GifDecoderFactory GIF_DECODER_FACTORY>
	//    7   12:invokespecial   #93  <Method void ByteBufferGifDecoder(Context, List, BitmapPool, ArrayPool, ByteBufferGifDecoder$GifHeaderParserPool, ByteBufferGifDecoder$GifDecoderFactory)>
	//    8   15:return          
	}

	ByteBufferGifDecoder(Context context1, List list, BitmapPool bitmappool, ArrayPool arraypool, GifHeaderParserPool gifheaderparserpool, GifDecoderFactory gifdecoderfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method void Object()>
		context = context1.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #102 <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #104 <Field Context context>
		parsers = list;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #106 <Field List parsers>
		bitmapPool = bitmappool;
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:putfield        #108 <Field BitmapPool bitmapPool>
		gifDecoderFactory = gifdecoderfactory;
	//   12   22:aload_0         
	//   13   23:aload           6
	//   14   25:putfield        #110 <Field ByteBufferGifDecoder$GifDecoderFactory gifDecoderFactory>
		provider = new GifBitmapProvider(bitmappool, arraypool);
	//   15   28:aload_0         
	//   16   29:new             #112 <Class GifBitmapProvider>
	//   17   32:dup             
	//   18   33:aload_3         
	//   19   34:aload           4
	//   20   36:invokespecial   #115 <Method void GifBitmapProvider(BitmapPool, ArrayPool)>
	//   21   39:putfield        #117 <Field GifBitmapProvider provider>
		parserPool = gifheaderparserpool;
	//   22   42:aload_0         
	//   23   43:aload           5
	//   24   45:putfield        #119 <Field ByteBufferGifDecoder$GifHeaderParserPool parserPool>
	//   25   48:return          
	}

	private GifDrawableResource decode(ByteBuffer bytebuffer, int i, int j, GifHeaderParser gifheaderparser)
	{
		long l = LogTime.getLogTime();
	//    0    0:invokestatic    #128 <Method long LogTime.getLogTime()>
	//    1    3:lstore          6
		gifheaderparser = ((GifHeaderParser) (gifheaderparser.parseHeader()));
	//    2    5:aload           4
	//    3    7:invokevirtual   #134 <Method GifHeader GifHeaderParser.parseHeader()>
	//    4   10:astore          4
		if(((GifHeader) (gifheaderparser)).getNumFrames() <= 0 || ((GifHeader) (gifheaderparser)).getStatus() != 0)
	//*   5   12:aload           4
	//*   6   14:invokevirtual   #140 <Method int GifHeader.getNumFrames()>
	//*   7   17:ifle            28
	//*   8   20:aload           4
	//*   9   22:invokevirtual   #143 <Method int GifHeader.getStatus()>
	//*  10   25:ifeq            30
			return null;
	//   11   28:aconst_null     
	//   12   29:areturn         
		int k = getSampleSize(((GifHeader) (gifheaderparser)), i, j);
	//   13   30:aload           4
	//   14   32:iload_2         
	//   15   33:iload_3         
	//   16   34:invokestatic    #147 <Method int getSampleSize(GifHeader, int, int)>
	//   17   37:istore          5
		bytebuffer = ((ByteBuffer) (gifDecoderFactory.build(((com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider) (provider)), ((GifHeader) (gifheaderparser)), bytebuffer, k)));
	//   18   39:aload_0         
	//   19   40:getfield        #110 <Field ByteBufferGifDecoder$GifDecoderFactory gifDecoderFactory>
	//   20   43:aload_0         
	//   21   44:getfield        #117 <Field GifBitmapProvider provider>
	//   22   47:aload           4
	//   23   49:aload_1         
	//   24   50:iload           5
	//   25   52:invokevirtual   #151 <Method GifDecoder ByteBufferGifDecoder$GifDecoderFactory.build(com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider, GifHeader, ByteBuffer, int)>
	//   26   55:astore_1        
		((GifDecoder) (bytebuffer)).advance();
	//   27   56:aload_1         
	//   28   57:invokeinterface #156 <Method void GifDecoder.advance()>
		gifheaderparser = ((GifHeaderParser) (((GifDecoder) (bytebuffer)).getNextFrame()));
	//   29   62:aload_1         
	//   30   63:invokeinterface #160 <Method android.graphics.Bitmap GifDecoder.getNextFrame()>
	//   31   68:astore          4
		if(gifheaderparser == null)
	//*  32   70:aload           4
	//*  33   72:ifnonnull       77
			return null;
	//   34   75:aconst_null     
	//   35   76:areturn         
		UnitTransformation unittransformation = UnitTransformation.get();
	//   36   77:invokestatic    #165 <Method UnitTransformation UnitTransformation.get()>
	//   37   80:astore          8
		bytebuffer = ((ByteBuffer) (new GifDrawable(context, ((GifDecoder) (bytebuffer)), bitmapPool, ((com.bumptech.glide.load.Transformation) (unittransformation)), i, j, ((android.graphics.Bitmap) (gifheaderparser)))));
	//   38   82:new             #167 <Class GifDrawable>
	//   39   85:dup             
	//   40   86:aload_0         
	//   41   87:getfield        #104 <Field Context context>
	//   42   90:aload_1         
	//   43   91:aload_0         
	//   44   92:getfield        #108 <Field BitmapPool bitmapPool>
	//   45   95:aload           8
	//   46   97:iload_2         
	//   47   98:iload_3         
	//   48   99:aload           4
	//   49  101:invokespecial   #170 <Method void GifDrawable(Context, GifDecoder, BitmapPool, com.bumptech.glide.load.Transformation, int, int, android.graphics.Bitmap)>
	//   50  104:astore_1        
		if(Log.isLoggable("BufferGifDecoder", 2))
	//*  51  105:ldc1            #24  <String "BufferGifDecoder">
	//*  52  107:iconst_2        
	//*  53  108:invokestatic    #176 <Method boolean Log.isLoggable(String, int)>
	//*  54  111:ifeq            143
			Log.v("BufferGifDecoder", (new StringBuilder()).append("Decoded GIF from stream in ").append(LogTime.getElapsedMillis(l)).toString());
	//   55  114:ldc1            #24  <String "BufferGifDecoder">
	//   56  116:new             #178 <Class StringBuilder>
	//   57  119:dup             
	//   58  120:invokespecial   #179 <Method void StringBuilder()>
	//   59  123:ldc1            #181 <String "Decoded GIF from stream in ">
	//   60  125:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   61  128:lload           6
	//   62  130:invokestatic    #189 <Method double LogTime.getElapsedMillis(long)>
	//   63  133:invokevirtual   #192 <Method StringBuilder StringBuilder.append(double)>
	//   64  136:invokevirtual   #196 <Method String StringBuilder.toString()>
	//   65  139:invokestatic    #200 <Method int Log.v(String, String)>
	//   66  142:pop             
		return new GifDrawableResource(((GifDrawable) (bytebuffer)));
	//   67  143:new             #202 <Class GifDrawableResource>
	//   68  146:dup             
	//   69  147:aload_1         
	//   70  148:invokespecial   #205 <Method void GifDrawableResource(GifDrawable)>
	//   71  151:areturn         
	}

	private static int getSampleSize(GifHeader gifheader, int i, int j)
	{
		int k = Math.min(gifheader.getHeight() / j, gifheader.getWidth() / i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #208 <Method int GifHeader.getHeight()>
	//    2    4:iload_2         
	//    3    5:idiv            
	//    4    6:aload_0         
	//    5    7:invokevirtual   #211 <Method int GifHeader.getWidth()>
	//    6   10:iload_1         
	//    7   11:idiv            
	//    8   12:invokestatic    #217 <Method int Math.min(int, int)>
	//    9   15:istore_3        
		if(k == 0)
	//*  10   16:iload_3         
	//*  11   17:ifne            25
			k = 0;
	//   12   20:iconst_0        
	//   13   21:istore_3        
		else
	//*  14   22:goto            30
			k = Integer.highestOneBit(k);
	//   15   25:iload_3         
	//   16   26:invokestatic    #223 <Method int Integer.highestOneBit(int)>
	//   17   29:istore_3        
		k = Math.max(1, k);
	//   18   30:iconst_1        
	//   19   31:iload_3         
	//   20   32:invokestatic    #226 <Method int Math.max(int, int)>
	//   21   35:istore_3        
		if(Log.isLoggable("BufferGifDecoder", 2))
	//*  22   36:ldc1            #24  <String "BufferGifDecoder">
	//*  23   38:iconst_2        
	//*  24   39:invokestatic    #176 <Method boolean Log.isLoggable(String, int)>
	//*  25   42:ifeq            117
			Log.v("BufferGifDecoder", (new StringBuilder()).append("Downsampling GIF, sampleSize: ").append(k).append(", target dimens: [").append(i).append("x").append(j).append("], actual dimens: [").append(gifheader.getWidth()).append("x").append(gifheader.getHeight()).append("]").toString());
	//   26   45:ldc1            #24  <String "BufferGifDecoder">
	//   27   47:new             #178 <Class StringBuilder>
	//   28   50:dup             
	//   29   51:invokespecial   #179 <Method void StringBuilder()>
	//   30   54:ldc1            #228 <String "Downsampling GIF, sampleSize: ">
	//   31   56:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   32   59:iload_3         
	//   33   60:invokevirtual   #231 <Method StringBuilder StringBuilder.append(int)>
	//   34   63:ldc1            #233 <String ", target dimens: [">
	//   35   65:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   36   68:iload_1         
	//   37   69:invokevirtual   #231 <Method StringBuilder StringBuilder.append(int)>
	//   38   72:ldc1            #235 <String "x">
	//   39   74:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   40   77:iload_2         
	//   41   78:invokevirtual   #231 <Method StringBuilder StringBuilder.append(int)>
	//   42   81:ldc1            #237 <String "], actual dimens: [">
	//   43   83:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   44   86:aload_0         
	//   45   87:invokevirtual   #211 <Method int GifHeader.getWidth()>
	//   46   90:invokevirtual   #231 <Method StringBuilder StringBuilder.append(int)>
	//   47   93:ldc1            #235 <String "x">
	//   48   95:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   49   98:aload_0         
	//   50   99:invokevirtual   #208 <Method int GifHeader.getHeight()>
	//   51  102:invokevirtual   #231 <Method StringBuilder StringBuilder.append(int)>
	//   52  105:ldc1            #239 <String "]">
	//   53  107:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   54  110:invokevirtual   #196 <Method String StringBuilder.toString()>
	//   55  113:invokestatic    #200 <Method int Log.v(String, String)>
	//   56  116:pop             
		return k;
	//   57  117:iload_3         
	//   58  118:ireturn         
	}

	public volatile Resource decode(Object obj, int i, int j, Options options)
		throws IOException
	{
		return ((Resource) (decode((ByteBuffer)obj, i, j, options)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #244 <Class ByteBuffer>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #247 <Method GifDrawableResource decode(ByteBuffer, int, int, Options)>
	//    7   12:areturn         
	}

	public GifDrawableResource decode(ByteBuffer bytebuffer, int i, int j, Options options)
	{
		options = ((Options) (parserPool.obtain(bytebuffer)));
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field ByteBufferGifDecoder$GifHeaderParserPool parserPool>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #252 <Method GifHeaderParser ByteBufferGifDecoder$GifHeaderParserPool.obtain(ByteBuffer)>
	//    4    8:astore          4
		bytebuffer = ((ByteBuffer) (decode(bytebuffer, i, j, ((GifHeaderParser) (options)))));
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:iload_2         
	//    8   13:iload_3         
	//    9   14:aload           4
	//   10   16:invokespecial   #254 <Method GifDrawableResource decode(ByteBuffer, int, int, GifHeaderParser)>
	//   11   19:astore_1        
		parserPool.release(((GifHeaderParser) (options)));
	//   12   20:aload_0         
	//   13   21:getfield        #119 <Field ByteBufferGifDecoder$GifHeaderParserPool parserPool>
	//   14   24:aload           4
	//   15   26:invokevirtual   #258 <Method void ByteBufferGifDecoder$GifHeaderParserPool.release(GifHeaderParser)>
		return ((GifDrawableResource) (bytebuffer));
	//   16   29:aload_1         
	//   17   30:areturn         
		bytebuffer;
	//   18   31:astore_1        
		parserPool.release(((GifHeaderParser) (options)));
	//   19   32:aload_0         
	//   20   33:getfield        #119 <Field ByteBufferGifDecoder$GifHeaderParserPool parserPool>
	//   21   36:aload           4
	//   22   38:invokevirtual   #258 <Method void ByteBufferGifDecoder$GifHeaderParserPool.release(GifHeaderParser)>
		throw bytebuffer;
	//   23   41:aload_1         
	//   24   42:athrow          
	}

	public volatile boolean handles(Object obj, Options options)
		throws IOException
	{
		return handles((ByteBuffer)obj, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #244 <Class ByteBuffer>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #263 <Method boolean handles(ByteBuffer, Options)>
	//    5    9:ireturn         
	}

	public boolean handles(ByteBuffer bytebuffer, Options options)
		throws IOException
	{
		return !((Boolean)options.get(DISABLE_ANIMATION)).booleanValue() && ImageHeaderParserUtils.getType(parsers, bytebuffer) == com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF;
	//    0    0:aload_2         
	//    1    1:getstatic       #58  <Field Option DISABLE_ANIMATION>
	//    2    4:invokevirtual   #268 <Method Object Options.get(Option)>
	//    3    7:checkcast       #46  <Class Boolean>
	//    4   10:invokevirtual   #272 <Method boolean Boolean.booleanValue()>
	//    5   13:ifne            32
	//    6   16:aload_0         
	//    7   17:getfield        #106 <Field List parsers>
	//    8   20:aload_1         
	//    9   21:invokestatic    #278 <Method com.bumptech.glide.load.ImageHeaderParser$ImageType ImageHeaderParserUtils.getType(List, ByteBuffer)>
	//   10   24:getstatic       #284 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.GIF>
	//   11   27:if_acmpne       32
	//   12   30:iconst_1        
	//   13   31:ireturn         
	//   14   32:iconst_0        
	//   15   33:ireturn         
	}

	public static final Option DISABLE_ANIMATION = Option.memory("com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder.DisableAnimation", ((Object) (Boolean.valueOf(false))));
	private static final GifDecoderFactory GIF_DECODER_FACTORY = new GifDecoderFactory();
	private static final GifHeaderParserPool PARSER_POOL = new GifHeaderParserPool();
	private static final String TAG = "BufferGifDecoder";
	private final BitmapPool bitmapPool;
	private final Context context;
	private final GifDecoderFactory gifDecoderFactory;
	private final GifHeaderParserPool parserPool;
	private final List parsers;
	private final GifBitmapProvider provider;

	static 
	{
	//    0    0:new             #9   <Class ByteBufferGifDecoder$GifDecoderFactory>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void ByteBufferGifDecoder$GifDecoderFactory()>
	//    3    7:putstatic       #42  <Field ByteBufferGifDecoder$GifDecoderFactory GIF_DECODER_FACTORY>
	//    4   10:ldc1            #44  <String "com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder.DisableAnimation">
	//    5   12:iconst_0        
	//    6   13:invokestatic    #50  <Method Boolean Boolean.valueOf(boolean)>
	//    7   16:invokestatic    #56  <Method Option Option.memory(String, Object)>
	//    8   19:putstatic       #58  <Field Option DISABLE_ANIMATION>
	//    9   22:new             #12  <Class ByteBufferGifDecoder$GifHeaderParserPool>
	//   10   25:dup             
	//   11   26:invokespecial   #59  <Method void ByteBufferGifDecoder$GifHeaderParserPool()>
	//   12   29:putstatic       #61  <Field ByteBufferGifDecoder$GifHeaderParserPool PARSER_POOL>
	//*  13   32:return          
	}
}
