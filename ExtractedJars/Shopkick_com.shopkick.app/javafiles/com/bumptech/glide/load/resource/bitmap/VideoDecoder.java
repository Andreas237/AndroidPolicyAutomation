// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.*;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			DownsampleStrategy, BitmapResource

public class VideoDecoder
	implements ResourceDecoder
{
	private static final class AssetFileDescriptorInitializer
		implements MediaMetadataRetrieverInitializer
	{

		public void initialize(MediaMetadataRetriever mediametadataretriever, AssetFileDescriptor assetfiledescriptor)
		{
			mediametadataretriever.setDataSource(assetfiledescriptor.getFileDescriptor(), assetfiledescriptor.getStartOffset(), assetfiledescriptor.getLength());
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #25  <Method java.io.FileDescriptor AssetFileDescriptor.getFileDescriptor()>
		//    3    5:aload_2         
		//    4    6:invokevirtual   #29  <Method long AssetFileDescriptor.getStartOffset()>
		//    5    9:aload_2         
		//    6   10:invokevirtual   #32  <Method long AssetFileDescriptor.getLength()>
		//    7   13:invokevirtual   #38  <Method void MediaMetadataRetriever.setDataSource(java.io.FileDescriptor, long, long)>
		//    8   16:return          
		}

		public volatile void initialize(MediaMetadataRetriever mediametadataretriever, Object obj)
		{
			initialize(mediametadataretriever, (AssetFileDescriptor)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #21  <Class AssetFileDescriptor>
		//    4    6:invokevirtual   #41  <Method void initialize(MediaMetadataRetriever, AssetFileDescriptor)>
		//    5    9:return          
		}

		private AssetFileDescriptorInitializer()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}

	}

	static class MediaMetadataRetrieverFactory
	{

		public MediaMetadataRetriever build()
		{
			return new MediaMetadataRetriever();
		//    0    0:new             #17  <Class MediaMetadataRetriever>
		//    1    3:dup             
		//    2    4:invokespecial   #18  <Method void MediaMetadataRetriever()>
		//    3    7:areturn         
		}

		MediaMetadataRetrieverFactory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Object()>
		//    2    4:return          
		}
	}

	static interface MediaMetadataRetrieverInitializer
	{

		public abstract void initialize(MediaMetadataRetriever mediametadataretriever, Object obj);
	}

	static final class ParcelFileDescriptorInitializer
		implements MediaMetadataRetrieverInitializer
	{

		public void initialize(MediaMetadataRetriever mediametadataretriever, ParcelFileDescriptor parcelfiledescriptor)
		{
			mediametadataretriever.setDataSource(parcelfiledescriptor.getFileDescriptor());
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #23  <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
		//    3    5:invokevirtual   #29  <Method void MediaMetadataRetriever.setDataSource(java.io.FileDescriptor)>
		//    4    8:return          
		}

		public volatile void initialize(MediaMetadataRetriever mediametadataretriever, Object obj)
		{
			initialize(mediametadataretriever, (ParcelFileDescriptor)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #19  <Class ParcelFileDescriptor>
		//    4    6:invokevirtual   #32  <Method void initialize(MediaMetadataRetriever, ParcelFileDescriptor)>
		//    5    9:return          
		}

		ParcelFileDescriptorInitializer()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}


	VideoDecoder(BitmapPool bitmappool, MediaMetadataRetrieverInitializer mediametadataretrieverinitializer)
	{
		this(bitmappool, mediametadataretrieverinitializer, DEFAULT_FACTORY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #82  <Field VideoDecoder$MediaMetadataRetrieverFactory DEFAULT_FACTORY>
	//    4    6:invokespecial   #87  <Method void VideoDecoder(BitmapPool, VideoDecoder$MediaMetadataRetrieverInitializer, VideoDecoder$MediaMetadataRetrieverFactory)>
	//    5    9:return          
	}

	VideoDecoder(BitmapPool bitmappool, MediaMetadataRetrieverInitializer mediametadataretrieverinitializer, MediaMetadataRetrieverFactory mediametadataretrieverfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #90  <Method void Object()>
		bitmapPool = bitmappool;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #92  <Field BitmapPool bitmapPool>
		initializer = mediametadataretrieverinitializer;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #94  <Field VideoDecoder$MediaMetadataRetrieverInitializer initializer>
		factory = mediametadataretrieverfactory;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #96  <Field VideoDecoder$MediaMetadataRetrieverFactory factory>
	//   11   19:return          
	}

	public static ResourceDecoder asset(BitmapPool bitmappool)
	{
		return ((ResourceDecoder) (new VideoDecoder(bitmappool, ((MediaMetadataRetrieverInitializer) (new AssetFileDescriptorInitializer())))));
	//    0    0:new             #2   <Class VideoDecoder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:new             #13  <Class VideoDecoder$AssetFileDescriptorInitializer>
	//    4    8:dup             
	//    5    9:aconst_null     
	//    6   10:invokespecial   #103 <Method void VideoDecoder$AssetFileDescriptorInitializer(VideoDecoder$1)>
	//    7   13:invokespecial   #105 <Method void VideoDecoder(BitmapPool, VideoDecoder$MediaMetadataRetrieverInitializer)>
	//    8   16:areturn         
	}

	private static Bitmap decodeFrame(MediaMetadataRetriever mediametadataretriever, long l, int i, int j, int k, DownsampleStrategy downsamplestrategy)
	{
		if(android.os.Build.VERSION.SDK_INT >= 27 && j != 0x80000000 && k != 0x80000000 && downsamplestrategy != DownsampleStrategy.NONE)
	//*   0    0:getstatic       #114 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          27
	//*   2    5:icmplt          47
	//*   3    8:iload           4
	//*   4   10:ldc1            #115 <Int 0x80000000>
	//*   5   12:icmpeq          47
	//*   6   15:iload           5
	//*   7   17:ldc1            #115 <Int 0x80000000>
	//*   8   19:icmpeq          47
	//*   9   22:aload           6
	//*  10   24:getstatic       #121 <Field DownsampleStrategy DownsampleStrategy.NONE>
	//*  11   27:if_acmpeq       47
			downsamplestrategy = ((DownsampleStrategy) (decodeScaledFrame(mediametadataretriever, l, i, j, k, downsamplestrategy)));
	//   12   30:aload_0         
	//   13   31:lload_1         
	//   14   32:iload_3         
	//   15   33:iload           4
	//   16   35:iload           5
	//   17   37:aload           6
	//   18   39:invokestatic    #124 <Method Bitmap decodeScaledFrame(MediaMetadataRetriever, long, int, int, int, DownsampleStrategy)>
	//   19   42:astore          6
		else
	//*  20   44:goto            50
			downsamplestrategy = null;
	//   21   47:aconst_null     
	//   22   48:astore          6
		Object obj = ((Object) (downsamplestrategy));
	//   23   50:aload           6
	//   24   52:astore          7
		if(downsamplestrategy == null)
	//*  25   54:aload           6
	//*  26   56:ifnonnull       67
			obj = ((Object) (decodeOriginalFrame(mediametadataretriever, l, i)));
	//   27   59:aload_0         
	//   28   60:lload_1         
	//   29   61:iload_3         
	//   30   62:invokestatic    #128 <Method Bitmap decodeOriginalFrame(MediaMetadataRetriever, long, int)>
	//   31   65:astore          7
		return ((Bitmap) (obj));
	//   32   67:aload           7
	//   33   69:areturn         
	}

	private static Bitmap decodeOriginalFrame(MediaMetadataRetriever mediametadataretriever, long l, int i)
	{
		return mediametadataretriever.getFrameAtTime(l, i);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iload_3         
	//    3    3:invokevirtual   #134 <Method Bitmap MediaMetadataRetriever.getFrameAtTime(long, int)>
	//    4    6:areturn         
	}

	private static Bitmap decodeScaledFrame(MediaMetadataRetriever mediametadataretriever, long l, int i, int j, int k, DownsampleStrategy downsamplestrategy)
	{
		int i1;
		int j1;
		int k1;
		int l1;
		int i2;
		try
		{
			k1 = Integer.parseInt(mediametadataretriever.extractMetadata(18));
	//    0    0:aload_0         
	//    1    1:bipush          18
	//    2    3:invokevirtual   #143 <Method String MediaMetadataRetriever.extractMetadata(int)>
	//    3    6:invokestatic    #147 <Method int Integer.parseInt(String)>
	//    4    9:istore          10
			i1 = Integer.parseInt(mediametadataretriever.extractMetadata(19));
	//    5   11:aload_0         
	//    6   12:bipush          19
	//    7   14:invokevirtual   #143 <Method String MediaMetadataRetriever.extractMetadata(int)>
	//    8   17:invokestatic    #147 <Method int Integer.parseInt(String)>
	//    9   20:istore          8
			i2 = Integer.parseInt(mediametadataretriever.extractMetadata(24));
	//   10   22:aload_0         
	//   11   23:bipush          24
	//   12   25:invokevirtual   #143 <Method String MediaMetadataRetriever.extractMetadata(int)>
	//   13   28:invokestatic    #147 <Method int Integer.parseInt(String)>
	//   14   31:istore          12
		}
	//*  15   33:iload           12
	//*  16   35:bipush          90
	//*  17   37:icmpeq          122
	//*  18   40:iload           10
	//*  19   42:istore          9
	//*  20   44:iload           8
	//*  21   46:istore          11
	//*  22   48:iload           12
	//*  23   50:sipush          270
	//*  24   53:icmpne          59
	//*  25   56:goto            122
	//*  26   59:aload           6
	//*  27   61:iload           9
	//*  28   63:iload           11
	//*  29   65:iload           4
	//*  30   67:iload           5
	//*  31   69:invokevirtual   #151 <Method float DownsampleStrategy.getScaleFactor(int, int, int, int)>
	//*  32   72:fstore          7
	//*  33   74:aload_0         
	//*  34   75:lload_1         
	//*  35   76:iload_3         
	//*  36   77:iload           9
	//*  37   79:i2f             
	//*  38   80:fload           7
	//*  39   82:fmul            
	//*  40   83:invokestatic    #157 <Method int Math.round(float)>
	//*  41   86:fload           7
	//*  42   88:iload           11
	//*  43   90:i2f             
	//*  44   91:fmul            
	//*  45   92:invokestatic    #157 <Method int Math.round(float)>
	//*  46   95:invokevirtual   #161 <Method Bitmap MediaMetadataRetriever.getScaledFrameAtTime(long, int, int, int)>
	//*  47   98:astore_0        
	//*  48   99:aload_0         
	//*  49  100:areturn         
		// Misplaced declaration of an exception variable
		catch(MediaMetadataRetriever mediametadataretriever)
	//*  50  101:astore_0        
		{
			if(Log.isLoggable("VideoDecoder", 3))
	//*  51  102:ldc1            #40  <String "VideoDecoder">
	//*  52  104:iconst_3        
	//*  53  105:invokestatic    #167 <Method boolean Log.isLoggable(String, int)>
	//*  54  108:ifeq            120
				Log.d("VideoDecoder", "Exception trying to decode frame on oreo+", ((Throwable) (mediametadataretriever)));
	//   55  111:ldc1            #40  <String "VideoDecoder">
	//   56  113:ldc1            #169 <String "Exception trying to decode frame on oreo+">
	//   57  115:aload_0         
	//   58  116:invokestatic    #173 <Method int Log.d(String, String, Throwable)>
	//   59  119:pop             
			return null;
	//   60  120:aconst_null     
	//   61  121:areturn         
		}
		if(i2 == 90) goto _L2; else goto _L1
_L1:
		j1 = k1;
		l1 = i1;
		if(i2 != 270) goto _L3; else goto _L2
_L3:
		float f = downsamplestrategy.getScaleFactor(j1, l1, j, k);
		mediametadataretriever = ((MediaMetadataRetriever) (mediametadataretriever.getScaledFrameAtTime(l, i, Math.round((float)j1 * f), Math.round(f * (float)l1))));
		return ((Bitmap) (mediametadataretriever));
_L2:
		j1 = i1;
	//   62  122:iload           8
	//   63  124:istore          9
		l1 = k1;
	//   64  126:iload           10
	//   65  128:istore          11
		if(true) goto _L3; else goto _L4
	//   66  130:goto            59
_L4:
	}

	public static ResourceDecoder parcel(BitmapPool bitmappool)
	{
		return ((ResourceDecoder) (new VideoDecoder(bitmappool, ((MediaMetadataRetrieverInitializer) (new ParcelFileDescriptorInitializer())))));
	//    0    0:new             #2   <Class VideoDecoder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:new             #22  <Class VideoDecoder$ParcelFileDescriptorInitializer>
	//    4    8:dup             
	//    5    9:invokespecial   #175 <Method void VideoDecoder$ParcelFileDescriptorInitializer()>
	//    6   12:invokespecial   #105 <Method void VideoDecoder(BitmapPool, VideoDecoder$MediaMetadataRetrieverInitializer)>
	//    7   15:areturn         
	}

	public Resource decode(Object obj, int i, int j, Options options)
		throws IOException
	{
		long l;
		Integer integer;
		Object obj1;
		l = ((Long)options.get(TARGET_FRAME)).longValue();
	//    0    0:aload           4
	//    1    2:getstatic       #69  <Field Option TARGET_FRAME>
	//    2    5:invokevirtual   #189 <Method Object Options.get(Option)>
	//    3    8:checkcast       #54  <Class Long>
	//    4   11:invokevirtual   #193 <Method long Long.longValue()>
	//    5   14:lstore          5
		if(l < 0L && l != -1L)
	//*   6   16:lload           5
	//*   7   18:lconst_0        
	//*   8   19:lcmp            
	//*   9   20:ifge            69
	//*  10   23:lload           5
	//*  11   25:ldc2w           #28  <Long -1L>
	//*  12   28:lcmp            
	//*  13   29:ifne            35
	//*  14   32:goto            69
		{
			obj = ((Object) (new StringBuilder()));
	//   15   35:new             #195 <Class StringBuilder>
	//   16   38:dup             
	//   17   39:invokespecial   #196 <Method void StringBuilder()>
	//   18   42:astore_1        
			((StringBuilder) (obj)).append("Requested frame must be non-negative, or DEFAULT_FRAME, given: ");
	//   19   43:aload_1         
	//   20   44:ldc1            #198 <String "Requested frame must be non-negative, or DEFAULT_FRAME, given: ">
	//   21   46:invokevirtual   #202 <Method StringBuilder StringBuilder.append(String)>
	//   22   49:pop             
			((StringBuilder) (obj)).append(l);
	//   23   50:aload_1         
	//   24   51:lload           5
	//   25   53:invokevirtual   #205 <Method StringBuilder StringBuilder.append(long)>
	//   26   56:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   27   57:new             #207 <Class IllegalArgumentException>
	//   28   60:dup             
	//   29   61:aload_1         
	//   30   62:invokevirtual   #211 <Method String StringBuilder.toString()>
	//   31   65:invokespecial   #214 <Method void IllegalArgumentException(String)>
	//   32   68:athrow          
		}
		obj1 = ((Object) ((Integer)options.get(FRAME_OPTION)));
	//   33   69:aload           4
	//   34   71:getstatic       #79  <Field Option FRAME_OPTION>
	//   35   74:invokevirtual   #189 <Method Object Options.get(Option)>
	//   36   77:checkcast       #73  <Class Integer>
	//   37   80:astore          8
		integer = ((Integer) (obj1));
	//   38   82:aload           8
	//   39   84:astore          7
		if(obj1 == null)
	//*  40   86:aload           8
	//*  41   88:ifnonnull       97
			integer = Integer.valueOf(2);
	//   42   91:iconst_2        
	//   43   92:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//   44   95:astore          7
		options = ((Options) ((DownsampleStrategy)options.get(DownsampleStrategy.OPTION)));
	//   45   97:aload           4
	//   46   99:getstatic       #217 <Field Option DownsampleStrategy.OPTION>
	//   47  102:invokevirtual   #189 <Method Object Options.get(Option)>
	//   48  105:checkcast       #117 <Class DownsampleStrategy>
	//   49  108:astore          4
		if(options == null)
	//*  50  110:aload           4
	//*  51  112:ifnonnull       123
			options = ((Options) (DownsampleStrategy.DEFAULT));
	//   52  115:getstatic       #220 <Field DownsampleStrategy DownsampleStrategy.DEFAULT>
	//   53  118:astore          4
	//*  54  120:goto            123
		obj1 = ((Object) (factory.build()));
	//   55  123:aload_0         
	//   56  124:getfield        #96  <Field VideoDecoder$MediaMetadataRetrieverFactory factory>
	//   57  127:invokevirtual   #224 <Method MediaMetadataRetriever VideoDecoder$MediaMetadataRetrieverFactory.build()>
	//   58  130:astore          8
		initializer.initialize(((MediaMetadataRetriever) (obj1)), obj);
	//   59  132:aload_0         
	//   60  133:getfield        #94  <Field VideoDecoder$MediaMetadataRetrieverInitializer initializer>
	//   61  136:aload           8
	//   62  138:aload_1         
	//   63  139:invokeinterface #228 <Method void VideoDecoder$MediaMetadataRetrieverInitializer.initialize(MediaMetadataRetriever, Object)>
		obj = ((Object) (decodeFrame(((MediaMetadataRetriever) (obj1)), l, integer.intValue(), i, j, ((DownsampleStrategy) (options)))));
	//   64  144:aload           8
	//   65  146:lload           5
	//   66  148:aload           7
	//   67  150:invokevirtual   #232 <Method int Integer.intValue()>
	//   68  153:iload_2         
	//   69  154:iload_3         
	//   70  155:aload           4
	//   71  157:invokestatic    #234 <Method Bitmap decodeFrame(MediaMetadataRetriever, long, int, int, int, DownsampleStrategy)>
	//   72  160:astore_1        
		((MediaMetadataRetriever) (obj1)).release();
	//   73  161:aload           8
	//   74  163:invokevirtual   #237 <Method void MediaMetadataRetriever.release()>
		return ((Resource) (BitmapResource.obtain(((Bitmap) (obj)), bitmapPool)));
	//   75  166:aload_1         
	//   76  167:aload_0         
	//   77  168:getfield        #92  <Field BitmapPool bitmapPool>
	//   78  171:invokestatic    #243 <Method BitmapResource BitmapResource.obtain(Bitmap, BitmapPool)>
	//   79  174:areturn         
		obj;
	//   80  175:astore_1        
		break MISSING_BLOCK_LABEL_189;
	//   81  176:goto            189
		obj;
	//   82  179:astore_1        
		throw new IOException(((Throwable) (obj)));
	//   83  180:new             #180 <Class IOException>
	//   84  183:dup             
	//   85  184:aload_1         
	//   86  185:invokespecial   #246 <Method void IOException(Throwable)>
	//   87  188:athrow          
		((MediaMetadataRetriever) (obj1)).release();
	//   88  189:aload           8
	//   89  191:invokevirtual   #237 <Method void MediaMetadataRetriever.release()>
		throw obj;
	//   90  194:aload_1         
	//   91  195:athrow          
	}

	public boolean handles(Object obj, Options options)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final MediaMetadataRetrieverFactory DEFAULT_FACTORY = new MediaMetadataRetrieverFactory();
	public static final long DEFAULT_FRAME = -1L;
	static final int DEFAULT_FRAME_OPTION = 2;
	public static final Option FRAME_OPTION = Option.disk("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", ((Object) (Integer.valueOf(2))), new com.bumptech.glide.load.Option.CacheKeyUpdater() {

		public void update(byte abyte0[], Integer integer, MessageDigest messagedigest)
		{
			if(integer == null)
		//*   0    0:aload_2         
		//*   1    1:ifnonnull       5
				return;
		//    2    4:return          
			messagedigest.update(abyte0);
		//    3    5:aload_3         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #32  <Method void MessageDigest.update(byte[])>
			synchronized(buffer)
		//*   6   10:aload_0         
		//*   7   11:getfield        #23  <Field ByteBuffer buffer>
		//*   8   14:astore_1        
		//*   9   15:aload_1         
		//*  10   16:monitorenter    
			{
				buffer.position(0);
		//   11   17:aload_0         
		//   12   18:getfield        #23  <Field ByteBuffer buffer>
		//   13   21:iconst_0        
		//   14   22:invokevirtual   #36  <Method java.nio.Buffer ByteBuffer.position(int)>
		//   15   25:pop             
				messagedigest.update(buffer.putInt(integer.intValue()).array());
		//   16   26:aload_3         
		//   17   27:aload_0         
		//   18   28:getfield        #23  <Field ByteBuffer buffer>
		//   19   31:aload_2         
		//   20   32:invokevirtual   #42  <Method int Integer.intValue()>
		//   21   35:invokevirtual   #45  <Method ByteBuffer ByteBuffer.putInt(int)>
		//   22   38:invokevirtual   #49  <Method byte[] ByteBuffer.array()>
		//   23   41:invokevirtual   #32  <Method void MessageDigest.update(byte[])>
			}
		//   24   44:aload_1         
		//   25   45:monitorexit     
			return;
		//   26   46:return          
			integer;
		//   27   47:astore_2        
			abyte0;
		//   28   48:aload_1         
			JVM INSTR monitorexit ;
		//   29   49:monitorexit     
			throw integer;
		//   30   50:aload_2         
		//   31   51:athrow          
		}

		public volatile void update(byte abyte0[], Object obj, MessageDigest messagedigest)
		{
			update(abyte0, (Integer)obj, messagedigest);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #38  <Class Integer>
		//    4    6:aload_3         
		//    5    7:invokevirtual   #53  <Method void update(byte[], Integer, MessageDigest)>
		//    6   10:return          
		}

		private final ByteBuffer buffer = ByteBuffer.allocate(4);

			
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #15  <Method void Object()>
			//    2    4:aload_0         
			//    3    5:iconst_4        
			//    4    6:invokestatic    #21  <Method ByteBuffer ByteBuffer.allocate(int)>
			//    5    9:putfield        #23  <Field ByteBuffer buffer>
			//    6   12:return          
			}
	}
);
	private static final String TAG = "VideoDecoder";
	public static final Option TARGET_FRAME = Option.disk("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", ((Object) (Long.valueOf(-1L))), new com.bumptech.glide.load.Option.CacheKeyUpdater() {

		public void update(byte abyte0[], Long long1, MessageDigest messagedigest)
		{
			messagedigest.update(abyte0);
		//    0    0:aload_3         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #32  <Method void MessageDigest.update(byte[])>
			synchronized(buffer)
		//*   3    5:aload_0         
		//*   4    6:getfield        #23  <Field ByteBuffer buffer>
		//*   5    9:astore_1        
		//*   6   10:aload_1         
		//*   7   11:monitorenter    
			{
				buffer.position(0);
		//    8   12:aload_0         
		//    9   13:getfield        #23  <Field ByteBuffer buffer>
		//   10   16:iconst_0        
		//   11   17:invokevirtual   #36  <Method java.nio.Buffer ByteBuffer.position(int)>
		//   12   20:pop             
				messagedigest.update(buffer.putLong(long1.longValue()).array());
		//   13   21:aload_3         
		//   14   22:aload_0         
		//   15   23:getfield        #23  <Field ByteBuffer buffer>
		//   16   26:aload_2         
		//   17   27:invokevirtual   #42  <Method long Long.longValue()>
		//   18   30:invokevirtual   #46  <Method ByteBuffer ByteBuffer.putLong(long)>
		//   19   33:invokevirtual   #50  <Method byte[] ByteBuffer.array()>
		//   20   36:invokevirtual   #32  <Method void MessageDigest.update(byte[])>
			}
		//   21   39:aload_1         
		//   22   40:monitorexit     
			return;
		//   23   41:return          
			long1;
		//   24   42:astore_2        
			abyte0;
		//   25   43:aload_1         
			JVM INSTR monitorexit ;
		//   26   44:monitorexit     
			throw long1;
		//   27   45:aload_2         
		//   28   46:athrow          
		}

		public volatile void update(byte abyte0[], Object obj, MessageDigest messagedigest)
		{
			update(abyte0, (Long)obj, messagedigest);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #38  <Class Long>
		//    4    6:aload_3         
		//    5    7:invokevirtual   #54  <Method void update(byte[], Long, MessageDigest)>
		//    6   10:return          
		}

		private final ByteBuffer buffer = ByteBuffer.allocate(8);

			
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #15  <Method void Object()>
			//    2    4:aload_0         
			//    3    5:bipush          8
			//    4    7:invokestatic    #21  <Method ByteBuffer ByteBuffer.allocate(int)>
			//    5   10:putfield        #23  <Field ByteBuffer buffer>
			//    6   13:return          
			}
	}
);
	private final BitmapPool bitmapPool;
	private final MediaMetadataRetrieverFactory factory;
	private final MediaMetadataRetrieverInitializer initializer;

	static 
	{
	//    0    0:ldc1            #52  <String "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame">
	//    1    2:ldc2w           #28  <Long -1L>
	//    2    5:invokestatic    #58  <Method Long Long.valueOf(long)>
	//    3    8:new             #9   <Class VideoDecoder$1>
	//    4   11:dup             
	//    5   12:invokespecial   #61  <Method void VideoDecoder$1()>
	//    6   15:invokestatic    #67  <Method Option Option.disk(String, Object, com.bumptech.glide.load.Option$CacheKeyUpdater)>
	//    7   18:putstatic       #69  <Field Option TARGET_FRAME>
	//    8   21:ldc1            #71  <String "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption">
	//    9   23:iconst_2        
	//   10   24:invokestatic    #76  <Method Integer Integer.valueOf(int)>
	//   11   27:new             #11  <Class VideoDecoder$2>
	//   12   30:dup             
	//   13   31:invokespecial   #77  <Method void VideoDecoder$2()>
	//   14   34:invokestatic    #67  <Method Option Option.disk(String, Object, com.bumptech.glide.load.Option$CacheKeyUpdater)>
	//   15   37:putstatic       #79  <Field Option FRAME_OPTION>
	//   16   40:new             #16  <Class VideoDecoder$MediaMetadataRetrieverFactory>
	//   17   43:dup             
	//   18   44:invokespecial   #80  <Method void VideoDecoder$MediaMetadataRetrieverFactory()>
	//   19   47:putstatic       #82  <Field VideoDecoder$MediaMetadataRetrieverFactory DEFAULT_FACTORY>
	//*  20   50:return          
	}
}
