// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.util.Log;
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
//			GifBitmapProvider, GifOptions, GifDrawableResource, GifDrawable

public class ByteBufferGifDecoder
	implements ResourceDecoder
{
	static class GifDecoderFactory
	{

		GifDecoder build(com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider bitmapprovider, GifHeader gifheader, ByteBuffer bytebuffer, int i)
		{
			return ((GifDecoder) (new StandardGifDecoder(bitmapprovider, gifheader, bytebuffer, i)));
		//    0    0:new             #17  <Class StandardGifDecoder>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:iload           4
		//    6    9:invokespecial   #20  <Method void StandardGifDecoder(com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider, GifHeader, ByteBuffer, int)>
		//    7   12:areturn         
		}

		GifDecoderFactory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Object()>
		//    2    4:return          
		}
	}

	static class GifHeaderParserPool
	{

		GifHeaderParser obtain(ByteBuffer bytebuffer)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			GifHeaderParser gifheaderparser1 = (GifHeaderParser)pool.poll();
		//    2    2:aload_0         
		//    3    3:getfield        #23  <Field Queue pool>
		//    4    6:invokeinterface #32  <Method Object Queue.poll()>
		//    5   11:checkcast       #34  <Class GifHeaderParser>
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
		//   11   21:new             #34  <Class GifHeaderParser>
		//   12   24:dup             
		//   13   25:invokespecial   #35  <Method void GifHeaderParser()>
		//   14   28:astore_2        
			bytebuffer = ((ByteBuffer) (gifheaderparser.setData(bytebuffer)));
		//   15   29:aload_2         
		//   16   30:aload_1         
		//   17   31:invokevirtual   #38  <Method GifHeaderParser GifHeaderParser.setData(ByteBuffer)>
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

		void release(GifHeaderParser gifheaderparser)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			gifheaderparser.clear();
		//    2    2:aload_1         
		//    3    3:invokevirtual   #43  <Method void GifHeaderParser.clear()>
			pool.offer(((Object) (gifheaderparser)));
		//    4    6:aload_0         
		//    5    7:getfield        #23  <Field Queue pool>
		//    6   10:aload_1         
		//    7   11:invokeinterface #47  <Method boolean Queue.offer(Object)>
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
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:invokestatic    #21  <Method Queue Util.createQueue(int)>
		//    5    9:putfield        #23  <Field Queue pool>
		//    6   12:return          
		}
	}


	public ByteBufferGifDecoder(Context context1, List list, BitmapPool bitmappool, ArrayPool arraypool)
	{
		this(context1, list, bitmappool, arraypool, PARSER_POOL, GIF_DECODER_FACTORY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:getstatic       #36  <Field ByteBufferGifDecoder$GifHeaderParserPool PARSER_POOL>
	//    6    9:getstatic       #33  <Field ByteBufferGifDecoder$GifDecoderFactory GIF_DECODER_FACTORY>
	//    7   12:invokespecial   #41  <Method void ByteBufferGifDecoder(Context, List, BitmapPool, ArrayPool, ByteBufferGifDecoder$GifHeaderParserPool, ByteBufferGifDecoder$GifDecoderFactory)>
	//    8   15:return          
	}

	ByteBufferGifDecoder(Context context1, List list, BitmapPool bitmappool, ArrayPool arraypool, GifHeaderParserPool gifheaderparserpool, GifDecoderFactory gifdecoderfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		context = context1.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #51  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #53  <Field Context context>
		parsers = list;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #55  <Field List parsers>
		gifDecoderFactory = gifdecoderfactory;
	//    9   17:aload_0         
	//   10   18:aload           6
	//   11   20:putfield        #57  <Field ByteBufferGifDecoder$GifDecoderFactory gifDecoderFactory>
		provider = new GifBitmapProvider(bitmappool, arraypool);
	//   12   23:aload_0         
	//   13   24:new             #59  <Class GifBitmapProvider>
	//   14   27:dup             
	//   15   28:aload_3         
	//   16   29:aload           4
	//   17   31:invokespecial   #62  <Method void GifBitmapProvider(BitmapPool, ArrayPool)>
	//   18   34:putfield        #64  <Field GifBitmapProvider provider>
		parserPool = gifheaderparserpool;
	//   19   37:aload_0         
	//   20   38:aload           5
	//   21   40:putfield        #66  <Field ByteBufferGifDecoder$GifHeaderParserPool parserPool>
	//   22   43:return          
	}

	private GifDrawableResource decode(ByteBuffer bytebuffer, int i, int j, GifHeaderParser gifheaderparser, Options options)
	{
		long l = LogTime.getLogTime();
	//    0    0:invokestatic    #77  <Method long LogTime.getLogTime()>
	//    1    3:lstore          7
		GifHeader gifheader;
		gifheader = gifheaderparser.parseHeader();
	//    2    5:aload           4
	//    3    7:invokevirtual   #83  <Method GifHeader GifHeaderParser.parseHeader()>
	//    4   10:astore          9
		if(gifheader.getNumFrames() <= 0 || gifheader.getStatus() != 0)
	//*   5   12:aload           9
	//*   6   14:invokevirtual   #89  <Method int GifHeader.getNumFrames()>
	//*   7   17:ifle            238
	//*   8   20:aload           9
	//*   9   22:invokevirtual   #92  <Method int GifHeader.getStatus()>
	//*  10   25:ifeq            31
			break MISSING_BLOCK_LABEL_238;
	//   11   28:goto            238
		if(options.get(GifOptions.DECODE_FORMAT) == DecodeFormat.PREFER_RGB_565)
	//*  12   31:aload           5
	//*  13   33:getstatic       #98  <Field com.bumptech.glide.load.Option GifOptions.DECODE_FORMAT>
	//*  14   36:invokevirtual   #104 <Method Object Options.get(com.bumptech.glide.load.Option)>
	//*  15   39:getstatic       #110 <Field DecodeFormat DecodeFormat.PREFER_RGB_565>
	//*  16   42:if_acmpne       53
		{
			gifheaderparser = ((GifHeaderParser) (android.graphics.Bitmap.Config.RGB_565));
	//   17   45:getstatic       #116 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//   18   48:astore          4
			break MISSING_BLOCK_LABEL_58;
	//   19   50:goto            58
		}
		gifheaderparser = ((GifHeaderParser) (android.graphics.Bitmap.Config.ARGB_8888));
	//   20   53:getstatic       #119 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   21   56:astore          4
		int k = getSampleSize(gifheader, i, j);
	//   22   58:aload           9
	//   23   60:iload_2         
	//   24   61:iload_3         
	//   25   62:invokestatic    #123 <Method int getSampleSize(GifHeader, int, int)>
	//   26   65:istore          6
		bytebuffer = ((ByteBuffer) (gifDecoderFactory.build(((com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider) (provider)), gifheader, bytebuffer, k)));
	//   27   67:aload_0         
	//   28   68:getfield        #57  <Field ByteBufferGifDecoder$GifDecoderFactory gifDecoderFactory>
	//   29   71:aload_0         
	//   30   72:getfield        #64  <Field GifBitmapProvider provider>
	//   31   75:aload           9
	//   32   77:aload_1         
	//   33   78:iload           6
	//   34   80:invokevirtual   #127 <Method GifDecoder ByteBufferGifDecoder$GifDecoderFactory.build(com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider, GifHeader, ByteBuffer, int)>
	//   35   83:astore_1        
		((GifDecoder) (bytebuffer)).setDefaultBitmapConfig(((android.graphics.Bitmap.Config) (gifheaderparser)));
	//   36   84:aload_1         
	//   37   85:aload           4
	//   38   87:invokeinterface #133 <Method void GifDecoder.setDefaultBitmapConfig(android.graphics.Bitmap$Config)>
		((GifDecoder) (bytebuffer)).advance();
	//   39   92:aload_1         
	//   40   93:invokeinterface #136 <Method void GifDecoder.advance()>
		gifheaderparser = ((GifHeaderParser) (((GifDecoder) (bytebuffer)).getNextFrame()));
	//   41   98:aload_1         
	//   42   99:invokeinterface #140 <Method android.graphics.Bitmap GifDecoder.getNextFrame()>
	//   43  104:astore          4
		if(gifheaderparser == null)
	//*  44  106:aload           4
	//*  45  108:ifnonnull       157
		{
			if(Log.isLoggable("BufferGifDecoder", 2))
	//*  46  111:ldc1            #142 <String "BufferGifDecoder">
	//*  47  113:iconst_2        
	//*  48  114:invokestatic    #148 <Method boolean Log.isLoggable(String, int)>
	//*  49  117:ifeq            155
			{
				bytebuffer = ((ByteBuffer) (new StringBuilder()));
	//   50  120:new             #150 <Class StringBuilder>
	//   51  123:dup             
	//   52  124:invokespecial   #151 <Method void StringBuilder()>
	//   53  127:astore_1        
				((StringBuilder) (bytebuffer)).append("Decoded GIF from stream in ");
	//   54  128:aload_1         
	//   55  129:ldc1            #153 <String "Decoded GIF from stream in ">
	//   56  131:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   57  134:pop             
				((StringBuilder) (bytebuffer)).append(LogTime.getElapsedMillis(l));
	//   58  135:aload_1         
	//   59  136:lload           7
	//   60  138:invokestatic    #161 <Method double LogTime.getElapsedMillis(long)>
	//   61  141:invokevirtual   #164 <Method StringBuilder StringBuilder.append(double)>
	//   62  144:pop             
				Log.v("BufferGifDecoder", ((StringBuilder) (bytebuffer)).toString());
	//   63  145:ldc1            #142 <String "BufferGifDecoder">
	//   64  147:aload_1         
	//   65  148:invokevirtual   #168 <Method String StringBuilder.toString()>
	//   66  151:invokestatic    #172 <Method int Log.v(String, String)>
	//   67  154:pop             
			}
			return null;
	//   68  155:aconst_null     
	//   69  156:areturn         
		}
		options = ((Options) (UnitTransformation.get()));
	//   70  157:invokestatic    #177 <Method UnitTransformation UnitTransformation.get()>
	//   71  160:astore          5
		bytebuffer = ((ByteBuffer) (new GifDrawableResource(new GifDrawable(context, ((GifDecoder) (bytebuffer)), ((com.bumptech.glide.load.Transformation) (options)), i, j, ((android.graphics.Bitmap) (gifheaderparser))))));
	//   72  162:new             #179 <Class GifDrawableResource>
	//   73  165:dup             
	//   74  166:new             #181 <Class GifDrawable>
	//   75  169:dup             
	//   76  170:aload_0         
	//   77  171:getfield        #53  <Field Context context>
	//   78  174:aload_1         
	//   79  175:aload           5
	//   80  177:iload_2         
	//   81  178:iload_3         
	//   82  179:aload           4
	//   83  181:invokespecial   #184 <Method void GifDrawable(Context, GifDecoder, com.bumptech.glide.load.Transformation, int, int, android.graphics.Bitmap)>
	//   84  184:invokespecial   #187 <Method void GifDrawableResource(GifDrawable)>
	//   85  187:astore_1        
		if(Log.isLoggable("BufferGifDecoder", 2))
	//*  86  188:ldc1            #142 <String "BufferGifDecoder">
	//*  87  190:iconst_2        
	//*  88  191:invokestatic    #148 <Method boolean Log.isLoggable(String, int)>
	//*  89  194:ifeq            236
		{
			gifheaderparser = ((GifHeaderParser) (new StringBuilder()));
	//   90  197:new             #150 <Class StringBuilder>
	//   91  200:dup             
	//   92  201:invokespecial   #151 <Method void StringBuilder()>
	//   93  204:astore          4
			((StringBuilder) (gifheaderparser)).append("Decoded GIF from stream in ");
	//   94  206:aload           4
	//   95  208:ldc1            #153 <String "Decoded GIF from stream in ">
	//   96  210:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   97  213:pop             
			((StringBuilder) (gifheaderparser)).append(LogTime.getElapsedMillis(l));
	//   98  214:aload           4
	//   99  216:lload           7
	//  100  218:invokestatic    #161 <Method double LogTime.getElapsedMillis(long)>
	//  101  221:invokevirtual   #164 <Method StringBuilder StringBuilder.append(double)>
	//  102  224:pop             
			Log.v("BufferGifDecoder", ((StringBuilder) (gifheaderparser)).toString());
	//  103  225:ldc1            #142 <String "BufferGifDecoder">
	//  104  227:aload           4
	//  105  229:invokevirtual   #168 <Method String StringBuilder.toString()>
	//  106  232:invokestatic    #172 <Method int Log.v(String, String)>
	//  107  235:pop             
		}
		return ((GifDrawableResource) (bytebuffer));
	//  108  236:aload_1         
	//  109  237:areturn         
		if(Log.isLoggable("BufferGifDecoder", 2))
	//* 110  238:ldc1            #142 <String "BufferGifDecoder">
	//* 111  240:iconst_2        
	//* 112  241:invokestatic    #148 <Method boolean Log.isLoggable(String, int)>
	//* 113  244:ifeq            282
		{
			bytebuffer = ((ByteBuffer) (new StringBuilder()));
	//  114  247:new             #150 <Class StringBuilder>
	//  115  250:dup             
	//  116  251:invokespecial   #151 <Method void StringBuilder()>
	//  117  254:astore_1        
			((StringBuilder) (bytebuffer)).append("Decoded GIF from stream in ");
	//  118  255:aload_1         
	//  119  256:ldc1            #153 <String "Decoded GIF from stream in ">
	//  120  258:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//  121  261:pop             
			((StringBuilder) (bytebuffer)).append(LogTime.getElapsedMillis(l));
	//  122  262:aload_1         
	//  123  263:lload           7
	//  124  265:invokestatic    #161 <Method double LogTime.getElapsedMillis(long)>
	//  125  268:invokevirtual   #164 <Method StringBuilder StringBuilder.append(double)>
	//  126  271:pop             
			Log.v("BufferGifDecoder", ((StringBuilder) (bytebuffer)).toString());
	//  127  272:ldc1            #142 <String "BufferGifDecoder">
	//  128  274:aload_1         
	//  129  275:invokevirtual   #168 <Method String StringBuilder.toString()>
	//  130  278:invokestatic    #172 <Method int Log.v(String, String)>
	//  131  281:pop             
		}
		return null;
	//  132  282:aconst_null     
	//  133  283:areturn         
		bytebuffer;
	//  134  284:astore_1        
		if(Log.isLoggable("BufferGifDecoder", 2))
	//* 135  285:ldc1            #142 <String "BufferGifDecoder">
	//* 136  287:iconst_2        
	//* 137  288:invokestatic    #148 <Method boolean Log.isLoggable(String, int)>
	//* 138  291:ifeq            333
		{
			gifheaderparser = ((GifHeaderParser) (new StringBuilder()));
	//  139  294:new             #150 <Class StringBuilder>
	//  140  297:dup             
	//  141  298:invokespecial   #151 <Method void StringBuilder()>
	//  142  301:astore          4
			((StringBuilder) (gifheaderparser)).append("Decoded GIF from stream in ");
	//  143  303:aload           4
	//  144  305:ldc1            #153 <String "Decoded GIF from stream in ">
	//  145  307:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//  146  310:pop             
			((StringBuilder) (gifheaderparser)).append(LogTime.getElapsedMillis(l));
	//  147  311:aload           4
	//  148  313:lload           7
	//  149  315:invokestatic    #161 <Method double LogTime.getElapsedMillis(long)>
	//  150  318:invokevirtual   #164 <Method StringBuilder StringBuilder.append(double)>
	//  151  321:pop             
			Log.v("BufferGifDecoder", ((StringBuilder) (gifheaderparser)).toString());
	//  152  322:ldc1            #142 <String "BufferGifDecoder">
	//  153  324:aload           4
	//  154  326:invokevirtual   #168 <Method String StringBuilder.toString()>
	//  155  329:invokestatic    #172 <Method int Log.v(String, String)>
	//  156  332:pop             
		}
		throw bytebuffer;
	//  157  333:aload_1         
	//  158  334:athrow          
	}

	private static int getSampleSize(GifHeader gifheader, int i, int j)
	{
		int k = Math.min(gifheader.getHeight() / j, gifheader.getWidth() / i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #190 <Method int GifHeader.getHeight()>
	//    2    4:iload_2         
	//    3    5:idiv            
	//    4    6:aload_0         
	//    5    7:invokevirtual   #193 <Method int GifHeader.getWidth()>
	//    6   10:iload_1         
	//    7   11:idiv            
	//    8   12:invokestatic    #199 <Method int Math.min(int, int)>
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
	//   16   26:invokestatic    #205 <Method int Integer.highestOneBit(int)>
	//   17   29:istore_3        
		k = Math.max(1, k);
	//   18   30:iconst_1        
	//   19   31:iload_3         
	//   20   32:invokestatic    #208 <Method int Math.max(int, int)>
	//   21   35:istore_3        
		if(Log.isLoggable("BufferGifDecoder", 2) && k > 1)
	//*  22   36:ldc1            #142 <String "BufferGifDecoder">
	//*  23   38:iconst_2        
	//*  24   39:invokestatic    #148 <Method boolean Log.isLoggable(String, int)>
	//*  25   42:ifeq            159
	//*  26   45:iload_3         
	//*  27   46:iconst_1        
	//*  28   47:icmple          159
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   29   50:new             #150 <Class StringBuilder>
	//   30   53:dup             
	//   31   54:invokespecial   #151 <Method void StringBuilder()>
	//   32   57:astore          4
			stringbuilder.append("Downsampling GIF, sampleSize: ");
	//   33   59:aload           4
	//   34   61:ldc1            #210 <String "Downsampling GIF, sampleSize: ">
	//   35   63:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   36   66:pop             
			stringbuilder.append(k);
	//   37   67:aload           4
	//   38   69:iload_3         
	//   39   70:invokevirtual   #213 <Method StringBuilder StringBuilder.append(int)>
	//   40   73:pop             
			stringbuilder.append(", target dimens: [");
	//   41   74:aload           4
	//   42   76:ldc1            #215 <String ", target dimens: [">
	//   43   78:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   44   81:pop             
			stringbuilder.append(i);
	//   45   82:aload           4
	//   46   84:iload_1         
	//   47   85:invokevirtual   #213 <Method StringBuilder StringBuilder.append(int)>
	//   48   88:pop             
			stringbuilder.append("x");
	//   49   89:aload           4
	//   50   91:ldc1            #217 <String "x">
	//   51   93:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   52   96:pop             
			stringbuilder.append(j);
	//   53   97:aload           4
	//   54   99:iload_2         
	//   55  100:invokevirtual   #213 <Method StringBuilder StringBuilder.append(int)>
	//   56  103:pop             
			stringbuilder.append("], actual dimens: [");
	//   57  104:aload           4
	//   58  106:ldc1            #219 <String "], actual dimens: [">
	//   59  108:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   60  111:pop             
			stringbuilder.append(gifheader.getWidth());
	//   61  112:aload           4
	//   62  114:aload_0         
	//   63  115:invokevirtual   #193 <Method int GifHeader.getWidth()>
	//   64  118:invokevirtual   #213 <Method StringBuilder StringBuilder.append(int)>
	//   65  121:pop             
			stringbuilder.append("x");
	//   66  122:aload           4
	//   67  124:ldc1            #217 <String "x">
	//   68  126:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   69  129:pop             
			stringbuilder.append(gifheader.getHeight());
	//   70  130:aload           4
	//   71  132:aload_0         
	//   72  133:invokevirtual   #190 <Method int GifHeader.getHeight()>
	//   73  136:invokevirtual   #213 <Method StringBuilder StringBuilder.append(int)>
	//   74  139:pop             
			stringbuilder.append("]");
	//   75  140:aload           4
	//   76  142:ldc1            #221 <String "]">
	//   77  144:invokevirtual   #157 <Method StringBuilder StringBuilder.append(String)>
	//   78  147:pop             
			Log.v("BufferGifDecoder", stringbuilder.toString());
	//   79  148:ldc1            #142 <String "BufferGifDecoder">
	//   80  150:aload           4
	//   81  152:invokevirtual   #168 <Method String StringBuilder.toString()>
	//   82  155:invokestatic    #172 <Method int Log.v(String, String)>
	//   83  158:pop             
		}
		return k;
	//   84  159:iload_3         
	//   85  160:ireturn         
	}

	public volatile Resource decode(Object obj, int i, int j, Options options)
		throws IOException
	{
		return ((Resource) (decode((ByteBuffer)obj, i, j, options)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #227 <Class ByteBuffer>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #230 <Method GifDrawableResource decode(ByteBuffer, int, int, Options)>
	//    7   12:areturn         
	}

	public GifDrawableResource decode(ByteBuffer bytebuffer, int i, int j, Options options)
	{
		GifHeaderParser gifheaderparser = parserPool.obtain(bytebuffer);
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field ByteBufferGifDecoder$GifHeaderParserPool parserPool>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #236 <Method GifHeaderParser ByteBufferGifDecoder$GifHeaderParserPool.obtain(ByteBuffer)>
	//    4    8:astore          5
		bytebuffer = ((ByteBuffer) (decode(bytebuffer, i, j, gifheaderparser, options)));
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:iload_2         
	//    8   13:iload_3         
	//    9   14:aload           5
	//   10   16:aload           4
	//   11   18:invokespecial   #238 <Method GifDrawableResource decode(ByteBuffer, int, int, GifHeaderParser, Options)>
	//   12   21:astore_1        
		parserPool.release(gifheaderparser);
	//   13   22:aload_0         
	//   14   23:getfield        #66  <Field ByteBufferGifDecoder$GifHeaderParserPool parserPool>
	//   15   26:aload           5
	//   16   28:invokevirtual   #242 <Method void ByteBufferGifDecoder$GifHeaderParserPool.release(GifHeaderParser)>
		return ((GifDrawableResource) (bytebuffer));
	//   17   31:aload_1         
	//   18   32:areturn         
		bytebuffer;
	//   19   33:astore_1        
		parserPool.release(gifheaderparser);
	//   20   34:aload_0         
	//   21   35:getfield        #66  <Field ByteBufferGifDecoder$GifHeaderParserPool parserPool>
	//   22   38:aload           5
	//   23   40:invokevirtual   #242 <Method void ByteBufferGifDecoder$GifHeaderParserPool.release(GifHeaderParser)>
		throw bytebuffer;
	//   24   43:aload_1         
	//   25   44:athrow          
	}

	public volatile boolean handles(Object obj, Options options)
		throws IOException
	{
		return handles((ByteBuffer)obj, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #227 <Class ByteBuffer>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #247 <Method boolean handles(ByteBuffer, Options)>
	//    5    9:ireturn         
	}

	public boolean handles(ByteBuffer bytebuffer, Options options)
		throws IOException
	{
		return !((Boolean)options.get(GifOptions.DISABLE_ANIMATION)).booleanValue() && ImageHeaderParserUtils.getType(parsers, bytebuffer) == com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF;
	//    0    0:aload_2         
	//    1    1:getstatic       #250 <Field com.bumptech.glide.load.Option GifOptions.DISABLE_ANIMATION>
	//    2    4:invokevirtual   #104 <Method Object Options.get(com.bumptech.glide.load.Option)>
	//    3    7:checkcast       #252 <Class Boolean>
	//    4   10:invokevirtual   #256 <Method boolean Boolean.booleanValue()>
	//    5   13:ifne            32
	//    6   16:aload_0         
	//    7   17:getfield        #55  <Field List parsers>
	//    8   20:aload_1         
	//    9   21:invokestatic    #262 <Method com.bumptech.glide.load.ImageHeaderParser$ImageType ImageHeaderParserUtils.getType(List, ByteBuffer)>
	//   10   24:getstatic       #268 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.GIF>
	//   11   27:if_acmpne       32
	//   12   30:iconst_1        
	//   13   31:ireturn         
	//   14   32:iconst_0        
	//   15   33:ireturn         
	}

	private static final GifDecoderFactory GIF_DECODER_FACTORY = new GifDecoderFactory();
	private static final GifHeaderParserPool PARSER_POOL = new GifHeaderParserPool();
	private final Context context;
	private final GifDecoderFactory gifDecoderFactory;
	private final GifHeaderParserPool parserPool;
	private final List parsers;
	private final GifBitmapProvider provider;

	static 
	{
	//    0    0:new             #9   <Class ByteBufferGifDecoder$GifDecoderFactory>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void ByteBufferGifDecoder$GifDecoderFactory()>
	//    3    7:putstatic       #33  <Field ByteBufferGifDecoder$GifDecoderFactory GIF_DECODER_FACTORY>
	//    4   10:new             #12  <Class ByteBufferGifDecoder$GifHeaderParserPool>
	//    5   13:dup             
	//    6   14:invokespecial   #34  <Method void ByteBufferGifDecoder$GifHeaderParserPool()>
	//    7   17:putstatic       #36  <Field ByteBufferGifDecoder$GifHeaderParserPool PARSER_POOL>
	//*   8   20:return          
	}
}
