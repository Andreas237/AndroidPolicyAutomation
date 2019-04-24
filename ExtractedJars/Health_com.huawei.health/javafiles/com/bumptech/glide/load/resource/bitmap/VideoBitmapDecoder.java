// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.*;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			BitmapResource

public class VideoBitmapDecoder
	implements ResourceDecoder
{
	static class MediaMetadataRetrieverFactory
	{

		public MediaMetadataRetriever build()
		{
			return new MediaMetadataRetriever();
		//    0    0:new             #16  <Class MediaMetadataRetriever>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void MediaMetadataRetriever()>
		//    3    7:areturn         
		}

		MediaMetadataRetrieverFactory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	public VideoBitmapDecoder(Context context)
	{
		this(Glide.get(context).getBitmapPool());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #65  <Method Glide Glide.get(Context)>
	//    3    5:invokevirtual   #69  <Method BitmapPool Glide.getBitmapPool()>
	//    4    8:invokespecial   #72  <Method void VideoBitmapDecoder(BitmapPool)>
	//    5   11:return          
	}

	public VideoBitmapDecoder(BitmapPool bitmappool)
	{
		this(bitmappool, DEFAULT_FACTORY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #57  <Field VideoBitmapDecoder$MediaMetadataRetrieverFactory DEFAULT_FACTORY>
	//    3    5:invokespecial   #75  <Method void VideoBitmapDecoder(BitmapPool, VideoBitmapDecoder$MediaMetadataRetrieverFactory)>
	//    4    8:return          
	}

	VideoBitmapDecoder(BitmapPool bitmappool, MediaMetadataRetrieverFactory mediametadataretrieverfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void Object()>
		bitmapPool = bitmappool;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #78  <Field BitmapPool bitmapPool>
		factory = mediametadataretrieverfactory;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #80  <Field VideoBitmapDecoder$MediaMetadataRetrieverFactory factory>
	//    8   14:return          
	}

	public Resource decode(ParcelFileDescriptor parcelfiledescriptor, int i, int j, Options options)
		throws IOException
	{
		long l;
		MediaMetadataRetriever mediametadataretriever;
		l = ((Long)options.get(TARGET_FRAME)).longValue();
	//    0    0:aload           4
	//    1    2:getstatic       #49  <Field Option TARGET_FRAME>
	//    2    5:invokevirtual   #89  <Method Object Options.get(Option)>
	//    3    8:checkcast       #34  <Class Long>
	//    4   11:invokevirtual   #93  <Method long Long.longValue()>
	//    5   14:lstore          5
		if(l < 0L && l != -1L)
	//*   6   16:lload           5
	//*   7   18:lconst_0        
	//*   8   19:lcmp            
	//*   9   20:ifge            60
	//*  10   23:lload           5
	//*  11   25:ldc2w           #19  <Long -1L>
	//*  12   28:lcmp            
	//*  13   29:ifeq            60
			throw new IllegalArgumentException((new StringBuilder()).append("Requested frame must be non-negative, or DEFAULT_FRAME, given: ").append(l).toString());
	//   14   32:new             #95  <Class IllegalArgumentException>
	//   15   35:dup             
	//   16   36:new             #97  <Class StringBuilder>
	//   17   39:dup             
	//   18   40:invokespecial   #98  <Method void StringBuilder()>
	//   19   43:ldc1            #100 <String "Requested frame must be non-negative, or DEFAULT_FRAME, given: ">
	//   20   45:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   21   48:lload           5
	//   22   50:invokevirtual   #107 <Method StringBuilder StringBuilder.append(long)>
	//   23   53:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   24   56:invokespecial   #114 <Method void IllegalArgumentException(String)>
	//   25   59:athrow          
		options = ((Options) ((Integer)options.get(FRAME_OPTION)));
	//   26   60:aload           4
	//   27   62:getstatic       #54  <Field Option FRAME_OPTION>
	//   28   65:invokevirtual   #89  <Method Object Options.get(Option)>
	//   29   68:checkcast       #116 <Class Integer>
	//   30   71:astore          4
		mediametadataretriever = factory.build();
	//   31   73:aload_0         
	//   32   74:getfield        #80  <Field VideoBitmapDecoder$MediaMetadataRetrieverFactory factory>
	//   33   77:invokevirtual   #120 <Method MediaMetadataRetriever VideoBitmapDecoder$MediaMetadataRetrieverFactory.build()>
	//   34   80:astore          7
		mediametadataretriever.setDataSource(parcelfiledescriptor.getFileDescriptor());
	//   35   82:aload           7
	//   36   84:aload_1         
	//   37   85:invokevirtual   #126 <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
	//   38   88:invokevirtual   #132 <Method void MediaMetadataRetriever.setDataSource(java.io.FileDescriptor)>
		if(l != -1L)
			break MISSING_BLOCK_LABEL_110;
	//   39   91:lload           5
	//   40   93:ldc2w           #19  <Long -1L>
	//   41   96:lcmp            
	//   42   97:ifne            110
		options = ((Options) (mediametadataretriever.getFrameAtTime()));
	//   43  100:aload           7
	//   44  102:invokevirtual   #136 <Method android.graphics.Bitmap MediaMetadataRetriever.getFrameAtTime()>
	//   45  105:astore          4
		break MISSING_BLOCK_LABEL_141;
	//   46  107:goto            141
		if(options != null)
			break MISSING_BLOCK_LABEL_127;
	//   47  110:aload           4
	//   48  112:ifnonnull       127
		options = ((Options) (mediametadataretriever.getFrameAtTime(l)));
	//   49  115:aload           7
	//   50  117:lload           5
	//   51  119:invokevirtual   #139 <Method android.graphics.Bitmap MediaMetadataRetriever.getFrameAtTime(long)>
	//   52  122:astore          4
		break MISSING_BLOCK_LABEL_141;
	//   53  124:goto            141
		options = ((Options) (mediametadataretriever.getFrameAtTime(l, ((Integer) (options)).intValue())));
	//   54  127:aload           7
	//   55  129:lload           5
	//   56  131:aload           4
	//   57  133:invokevirtual   #143 <Method int Integer.intValue()>
	//   58  136:invokevirtual   #146 <Method android.graphics.Bitmap MediaMetadataRetriever.getFrameAtTime(long, int)>
	//   59  139:astore          4
		mediametadataretriever.release();
	//   60  141:aload           7
	//   61  143:invokevirtual   #149 <Method void MediaMetadataRetriever.release()>
		break MISSING_BLOCK_LABEL_157;
	//   62  146:goto            157
		parcelfiledescriptor;
	//   63  149:astore_1        
		mediametadataretriever.release();
	//   64  150:aload           7
	//   65  152:invokevirtual   #149 <Method void MediaMetadataRetriever.release()>
		throw parcelfiledescriptor;
	//   66  155:aload_1         
	//   67  156:athrow          
		parcelfiledescriptor.close();
	//   68  157:aload_1         
	//   69  158:invokevirtual   #152 <Method void ParcelFileDescriptor.close()>
		return ((Resource) (BitmapResource.obtain(((android.graphics.Bitmap) (options)), bitmapPool)));
	//   70  161:aload           4
	//   71  163:aload_0         
	//   72  164:getfield        #78  <Field BitmapPool bitmapPool>
	//   73  167:invokestatic    #158 <Method BitmapResource BitmapResource.obtain(android.graphics.Bitmap, BitmapPool)>
	//   74  170:areturn         
	}

	public volatile Resource decode(Object obj, int i, int j, Options options)
		throws IOException
	{
		return decode((ParcelFileDescriptor)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #122 <Class ParcelFileDescriptor>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #164 <Method Resource decode(ParcelFileDescriptor, int, int, Options)>
	//    7   12:areturn         
	}

	public boolean handles(ParcelFileDescriptor parcelfiledescriptor, Options options)
	{
		options = ((Options) (factory.build()));
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field VideoBitmapDecoder$MediaMetadataRetrieverFactory factory>
	//    2    4:invokevirtual   #120 <Method MediaMetadataRetriever VideoBitmapDecoder$MediaMetadataRetrieverFactory.build()>
	//    3    7:astore_2        
		try
		{
			((MediaMetadataRetriever) (options)).setDataSource(parcelfiledescriptor.getFileDescriptor());
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #126 <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
	//    7   13:invokevirtual   #132 <Method void MediaMetadataRetriever.setDataSource(java.io.FileDescriptor)>
		}
	//*   8   16:aload_2         
	//*   9   17:invokevirtual   #149 <Method void MediaMetadataRetriever.release()>
	//*  10   20:iconst_1        
	//*  11   21:ireturn         
		// Misplaced declaration of an exception variable
		catch(ParcelFileDescriptor parcelfiledescriptor)
	//*  12   22:astore_1        
		{
			((MediaMetadataRetriever) (options)).release();
	//   13   23:aload_2         
	//   14   24:invokevirtual   #149 <Method void MediaMetadataRetriever.release()>
			return false;
	//   15   27:iconst_0        
	//   16   28:ireturn         
		}
		((MediaMetadataRetriever) (options)).release();
		return true;
		parcelfiledescriptor;
	//   17   29:astore_1        
		((MediaMetadataRetriever) (options)).release();
	//   18   30:aload_2         
	//   19   31:invokevirtual   #149 <Method void MediaMetadataRetriever.release()>
		throw parcelfiledescriptor;
	//   20   34:aload_1         
	//   21   35:athrow          
	}

	public volatile boolean handles(Object obj, Options options)
		throws IOException
	{
		return handles((ParcelFileDescriptor)obj, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #122 <Class ParcelFileDescriptor>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #171 <Method boolean handles(ParcelFileDescriptor, Options)>
	//    5    9:ireturn         
	}

	private static final MediaMetadataRetrieverFactory DEFAULT_FACTORY = new MediaMetadataRetrieverFactory();
	public static final long DEFAULT_FRAME = -1L;
	public static final Option FRAME_OPTION = Option.disk("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", ((Object) (null)), new com.bumptech.glide.load.Option.CacheKeyUpdater() {

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
		//    5    7:invokevirtual   #31  <Method void MessageDigest.update(byte[])>
			abyte0 = ((byte []) (buffer));
		//    6   10:aload_0         
		//    7   11:getfield        #23  <Field ByteBuffer buffer>
		//    8   14:astore_1        
			abyte0;
		//    9   15:aload_1         
			JVM INSTR monitorenter ;
		//   10   16:monitorenter    
			buffer.position(0);
		//   11   17:aload_0         
		//   12   18:getfield        #23  <Field ByteBuffer buffer>
		//   13   21:iconst_0        
		//   14   22:invokevirtual   #35  <Method java.nio.Buffer ByteBuffer.position(int)>
		//   15   25:pop             
			messagedigest.update(buffer.putInt(integer.intValue()).array());
		//   16   26:aload_3         
		//   17   27:aload_0         
		//   18   28:getfield        #23  <Field ByteBuffer buffer>
		//   19   31:aload_2         
		//   20   32:invokevirtual   #41  <Method int Integer.intValue()>
		//   21   35:invokevirtual   #44  <Method ByteBuffer ByteBuffer.putInt(int)>
		//   22   38:invokevirtual   #48  <Method byte[] ByteBuffer.array()>
		//   23   41:invokevirtual   #31  <Method void MessageDigest.update(byte[])>
			abyte0;
		//   24   44:aload_1         
			JVM INSTR monitorexit ;
		//   25   45:monitorexit     
			return;
		//   26   46:return          
			integer;
		//   27   47:astore_2        
		//*  28   48:aload_1         
			throw integer;
		//   29   49:monitorexit     
		//   30   50:aload_2         
		//   31   51:athrow          
		}

		public volatile void update(byte abyte0[], Object obj, MessageDigest messagedigest)
		{
			update(abyte0, (Integer)obj, messagedigest);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #37  <Class Integer>
		//    4    6:aload_3         
		//    5    7:invokevirtual   #51  <Method void update(byte[], Integer, MessageDigest)>
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
	public static final Option TARGET_FRAME = Option.disk("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", ((Object) (Long.valueOf(-1L))), new com.bumptech.glide.load.Option.CacheKeyUpdater() {

		public void update(byte abyte0[], Long long1, MessageDigest messagedigest)
		{
			messagedigest.update(abyte0);
		//    0    0:aload_3         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #31  <Method void MessageDigest.update(byte[])>
			abyte0 = ((byte []) (buffer));
		//    3    5:aload_0         
		//    4    6:getfield        #23  <Field ByteBuffer buffer>
		//    5    9:astore_1        
			abyte0;
		//    6   10:aload_1         
			JVM INSTR monitorenter ;
		//    7   11:monitorenter    
			buffer.position(0);
		//    8   12:aload_0         
		//    9   13:getfield        #23  <Field ByteBuffer buffer>
		//   10   16:iconst_0        
		//   11   17:invokevirtual   #35  <Method java.nio.Buffer ByteBuffer.position(int)>
		//   12   20:pop             
			messagedigest.update(buffer.putLong(long1.longValue()).array());
		//   13   21:aload_3         
		//   14   22:aload_0         
		//   15   23:getfield        #23  <Field ByteBuffer buffer>
		//   16   26:aload_2         
		//   17   27:invokevirtual   #41  <Method long Long.longValue()>
		//   18   30:invokevirtual   #45  <Method ByteBuffer ByteBuffer.putLong(long)>
		//   19   33:invokevirtual   #49  <Method byte[] ByteBuffer.array()>
		//   20   36:invokevirtual   #31  <Method void MessageDigest.update(byte[])>
			abyte0;
		//   21   39:aload_1         
			JVM INSTR monitorexit ;
		//   22   40:monitorexit     
			return;
		//   23   41:return          
			long1;
		//   24   42:astore_2        
		//*  25   43:aload_1         
			throw long1;
		//   26   44:monitorexit     
		//   27   45:aload_2         
		//   28   46:athrow          
		}

		public volatile void update(byte abyte0[], Object obj, MessageDigest messagedigest)
		{
			update(abyte0, (Long)obj, messagedigest);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #37  <Class Long>
		//    4    6:aload_3         
		//    5    7:invokevirtual   #52  <Method void update(byte[], Long, MessageDigest)>
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

	static 
	{
	//    0    0:ldc1            #32  <String "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame">
	//    1    2:ldc2w           #19  <Long -1L>
	//    2    5:invokestatic    #38  <Method Long Long.valueOf(long)>
	//    3    8:new             #9   <Class VideoBitmapDecoder$1>
	//    4   11:dup             
	//    5   12:invokespecial   #41  <Method void VideoBitmapDecoder$1()>
	//    6   15:invokestatic    #47  <Method Option Option.disk(String, Object, com.bumptech.glide.load.Option$CacheKeyUpdater)>
	//    7   18:putstatic       #49  <Field Option TARGET_FRAME>
	//    8   21:ldc1            #51  <String "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption">
	//    9   23:aconst_null     
	//   10   24:new             #11  <Class VideoBitmapDecoder$2>
	//   11   27:dup             
	//   12   28:invokespecial   #52  <Method void VideoBitmapDecoder$2()>
	//   13   31:invokestatic    #47  <Method Option Option.disk(String, Object, com.bumptech.glide.load.Option$CacheKeyUpdater)>
	//   14   34:putstatic       #54  <Field Option FRAME_OPTION>
	//   15   37:new             #13  <Class VideoBitmapDecoder$MediaMetadataRetrieverFactory>
	//   16   40:dup             
	//   17   41:invokespecial   #55  <Method void VideoBitmapDecoder$MediaMetadataRetrieverFactory()>
	//   18   44:putstatic       #57  <Field VideoBitmapDecoder$MediaMetadataRetrieverFactory DEFAULT_FACTORY>
	//*  19   47:return          
	}
}
