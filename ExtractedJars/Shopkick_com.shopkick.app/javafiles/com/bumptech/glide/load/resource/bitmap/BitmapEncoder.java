// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.*;
import com.bumptech.glide.load.data.BufferedOutputStream;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.GlideTrace;
import java.io.*;

public class BitmapEncoder
	implements ResourceEncoder
{

	public BitmapEncoder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		arrayPool = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #51  <Field ArrayPool arrayPool>
	//    5    9:return          
	}

	public BitmapEncoder(ArrayPool arraypool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		arrayPool = arraypool;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #51  <Field ArrayPool arrayPool>
	//    5    9:return          
	}

	private android.graphics.Bitmap.CompressFormat getFormat(Bitmap bitmap, Options options)
	{
		options = ((Options) ((android.graphics.Bitmap.CompressFormat)options.get(COMPRESSION_FORMAT)));
	//    0    0:aload_2         
	//    1    1:getstatic       #44  <Field Option COMPRESSION_FORMAT>
	//    2    4:invokevirtual   #63  <Method Object Options.get(Option)>
	//    3    7:checkcast       #65  <Class android.graphics.Bitmap$CompressFormat>
	//    4   10:astore_2        
		if(options != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          17
			return ((android.graphics.Bitmap.CompressFormat) (options));
	//    7   15:aload_2         
	//    8   16:areturn         
		if(bitmap.hasAlpha())
	//*   9   17:aload_1         
	//*  10   18:invokevirtual   #71  <Method boolean Bitmap.hasAlpha()>
	//*  11   21:ifeq            28
			return android.graphics.Bitmap.CompressFormat.PNG;
	//   12   24:getstatic       #75  <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.PNG>
	//   13   27:areturn         
		else
			return android.graphics.Bitmap.CompressFormat.JPEG;
	//   14   28:getstatic       #78  <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.JPEG>
	//   15   31:areturn         
	}

	public boolean encode(Resource resource, File file, Options options)
	{
		Bitmap bitmap;
		android.graphics.Bitmap.CompressFormat compressformat;
		bitmap = (Bitmap)resource.get();
	//    0    0:aload_1         
	//    1    1:invokeinterface #87  <Method Object Resource.get()>
	//    2    6:checkcast       #67  <Class Bitmap>
	//    3    9:astore          11
		compressformat = getFormat(bitmap, options);
	//    4   11:aload_0         
	//    5   12:aload           11
	//    6   14:aload_3         
	//    7   15:invokespecial   #89  <Method android.graphics.Bitmap$CompressFormat getFormat(Bitmap, Options)>
	//    8   18:astore          12
		GlideTrace.beginSectionFormat("encode: [%dx%d] %s", ((Object) (Integer.valueOf(bitmap.getWidth()))), ((Object) (Integer.valueOf(bitmap.getHeight()))), ((Object) (compressformat)));
	//    9   20:ldc1            #91  <String "encode: [%dx%d] %s">
	//   10   22:aload           11
	//   11   24:invokevirtual   #95  <Method int Bitmap.getWidth()>
	//   12   27:invokestatic    #29  <Method Integer Integer.valueOf(int)>
	//   13   30:aload           11
	//   14   32:invokevirtual   #98  <Method int Bitmap.getHeight()>
	//   15   35:invokestatic    #29  <Method Integer Integer.valueOf(int)>
	//   16   38:aload           12
	//   17   40:invokestatic    #104 <Method void GlideTrace.beginSectionFormat(String, Object, Object, Object)>
		int i;
		long l;
		l = LogTime.getLogTime();
	//   18   43:invokestatic    #110 <Method long LogTime.getLogTime()>
	//   19   46:lstore          5
		i = ((Integer)options.get(COMPRESSION_QUALITY)).intValue();
	//   20   48:aload_3         
	//   21   49:getstatic       #37  <Field Option COMPRESSION_QUALITY>
	//   22   52:invokevirtual   #63  <Method Object Options.get(Option)>
	//   23   55:checkcast       #25  <Class Integer>
	//   24   58:invokevirtual   #113 <Method int Integer.intValue()>
	//   25   61:istore          4
		boolean flag;
		boolean flag1;
		Resource resource1;
		Resource resource2;
		flag = false;
	//   26   63:iconst_0        
	//   27   64:istore          7
		flag1 = false;
	//   28   66:iconst_0        
	//   29   67:istore          8
		resource2 = null;
	//   30   69:aconst_null     
	//   31   70:astore          10
		resource1 = null;
	//   32   72:aconst_null     
	//   33   73:astore          9
		resource = ((Resource) (new FileOutputStream(file)));
	//   34   75:new             #115 <Class FileOutputStream>
	//   35   78:dup             
	//   36   79:aload_2         
	//   37   80:invokespecial   #118 <Method void FileOutputStream(File)>
	//   38   83:astore_1        
label0:
		{
			try
			{
				if(arrayPool == null)
					break label0;
	//   39   84:aload_0         
	//   40   85:getfield        #51  <Field ArrayPool arrayPool>
	//   41   88:ifnull          109
				file = ((File) (new BufferedOutputStream(((OutputStream) (resource)), arrayPool)));
	//   42   91:new             #120 <Class BufferedOutputStream>
	//   43   94:dup             
	//   44   95:aload_1         
	//   45   96:aload_0         
	//   46   97:getfield        #51  <Field ArrayPool arrayPool>
	//   47  100:invokespecial   #123 <Method void BufferedOutputStream(OutputStream, ArrayPool)>
	//   48  103:astore_2        
			}
	//*  49  104:aload_2         
	//*  50  105:astore_1        
	//*  51  106:goto            109
	//*  52  109:aload_1         
	//*  53  110:astore          9
	//*  54  112:aload_1         
	//*  55  113:astore          10
	//*  56  115:aload           11
	//*  57  117:aload           12
	//*  58  119:iload           4
	//*  59  121:aload_1         
	//*  60  122:invokevirtual   #127 <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, OutputStream)>
	//*  61  125:pop             
	//*  62  126:aload_1         
	//*  63  127:astore          9
	//*  64  129:aload_1         
	//*  65  130:astore          10
	//*  66  132:aload_1         
	//*  67  133:invokevirtual   #132 <Method void OutputStream.close()>
	//*  68  136:iconst_1        
	//*  69  137:istore          7
	//*  70  139:aload_1         
	//*  71  140:invokevirtual   #132 <Method void OutputStream.close()>
	//*  72  143:goto            202
	//*  73  146:astore_2        
	//*  74  147:aload_1         
	//*  75  148:astore          9
	//*  76  150:aload_2         
	//*  77  151:astore_1        
	//*  78  152:goto            319
			// Misplaced declaration of an exception variable
			catch(File file)
	//*  79  155:astore_2        
			{
				break MISSING_BLOCK_LABEL_167;
	//   80  156:goto            167
			}
			resource = ((Resource) (file));
		}
		resource1 = resource;
		resource2 = resource;
		bitmap.compress(compressformat, i, ((OutputStream) (resource)));
		resource1 = resource;
		resource2 = resource;
		((OutputStream) (resource)).close();
		flag = true;
_L1:
		try
		{
			((OutputStream) (resource)).close();
		}
	//*  81  159:astore_1        
	//*  82  160:goto            319
	//*  83  163:astore_2        
	//*  84  164:aload           10
	//*  85  166:astore_1        
	//*  86  167:aload_1         
	//*  87  168:astore          9
	//*  88  170:ldc1            #16  <String "BitmapEncoder">
	//*  89  172:iconst_3        
	//*  90  173:invokestatic    #138 <Method boolean Log.isLoggable(String, int)>
	//*  91  176:ifeq            191
	//*  92  179:aload_1         
	//*  93  180:astore          9
	//*  94  182:ldc1            #16  <String "BitmapEncoder">
	//*  95  184:ldc1            #140 <String "Failed to encode Bitmap">
	//*  96  186:aload_2         
	//*  97  187:invokestatic    #144 <Method int Log.d(String, String, Throwable)>
	//*  98  190:pop             
	//*  99  191:aload_1         
	//* 100  192:ifnull          202
	//* 101  195:iload           8
	//* 102  197:istore          7
	//* 103  199:goto            139
	//* 104  202:ldc1            #16  <String "BitmapEncoder">
	//* 105  204:iconst_2        
	//* 106  205:invokestatic    #138 <Method boolean Log.isLoggable(String, int)>
	//* 107  208:ifeq            313
	//* 108  211:new             #146 <Class StringBuilder>
	//* 109  214:dup             
	//* 110  215:invokespecial   #147 <Method void StringBuilder()>
	//* 111  218:astore_1        
	//* 112  219:aload_1         
	//* 113  220:ldc1            #149 <String "Compressed with type: ">
	//* 114  222:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 115  225:pop             
	//* 116  226:aload_1         
	//* 117  227:aload           12
	//* 118  229:invokevirtual   #156 <Method StringBuilder StringBuilder.append(Object)>
	//* 119  232:pop             
	//* 120  233:aload_1         
	//* 121  234:ldc1            #158 <String " of size ">
	//* 122  236:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 123  239:pop             
	//* 124  240:aload_1         
	//* 125  241:aload           11
	//* 126  243:invokestatic    #164 <Method int Util.getBitmapByteSize(Bitmap)>
	//* 127  246:invokevirtual   #167 <Method StringBuilder StringBuilder.append(int)>
	//* 128  249:pop             
	//* 129  250:aload_1         
	//* 130  251:ldc1            #169 <String " in ">
	//* 131  253:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 132  256:pop             
	//* 133  257:aload_1         
	//* 134  258:lload           5
	//* 135  260:invokestatic    #173 <Method double LogTime.getElapsedMillis(long)>
	//* 136  263:invokevirtual   #176 <Method StringBuilder StringBuilder.append(double)>
	//* 137  266:pop             
	//* 138  267:aload_1         
	//* 139  268:ldc1            #178 <String ", options format: ">
	//* 140  270:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 141  273:pop             
	//* 142  274:aload_1         
	//* 143  275:aload_3         
	//* 144  276:getstatic       #44  <Field Option COMPRESSION_FORMAT>
	//* 145  279:invokevirtual   #63  <Method Object Options.get(Option)>
	//* 146  282:invokevirtual   #156 <Method StringBuilder StringBuilder.append(Object)>
	//* 147  285:pop             
	//* 148  286:aload_1         
	//* 149  287:ldc1            #180 <String ", hasAlpha: ">
	//* 150  289:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 151  292:pop             
	//* 152  293:aload_1         
	//* 153  294:aload           11
	//* 154  296:invokevirtual   #71  <Method boolean Bitmap.hasAlpha()>
	//* 155  299:invokevirtual   #183 <Method StringBuilder StringBuilder.append(boolean)>
	//* 156  302:pop             
	//* 157  303:ldc1            #16  <String "BitmapEncoder">
	//* 158  305:aload_1         
	//* 159  306:invokevirtual   #187 <Method String StringBuilder.toString()>
	//* 160  309:invokestatic    #191 <Method int Log.v(String, String)>
	//* 161  312:pop             
	//* 162  313:invokestatic    #194 <Method void GlideTrace.endSection()>
	//* 163  316:iload           7
	//* 164  318:ireturn         
	//* 165  319:aload           9
	//* 166  321:ifnull          329
	//* 167  324:aload           9
	//* 168  326:invokevirtual   #132 <Method void OutputStream.close()>
	//* 169  329:aload_1         
	//* 170  330:athrow          
	//* 171  331:astore_1        
	//* 172  332:invokestatic    #194 <Method void GlideTrace.endSection()>
	//* 173  335:aload_1         
	//* 174  336:athrow          
		// Misplaced declaration of an exception variable
		catch(Resource resource) { }
	//  175  337:astore_1        
		break MISSING_BLOCK_LABEL_202;
	//  176  338:goto            202
		file;
		resource1 = resource;
		resource = ((Resource) (file));
		break MISSING_BLOCK_LABEL_319;
		resource;
		break MISSING_BLOCK_LABEL_319;
		file;
		resource = resource2;
		resource1 = resource;
		if(!Log.isLoggable("BitmapEncoder", 3))
			break MISSING_BLOCK_LABEL_191;
		resource1 = resource;
		Log.d("BitmapEncoder", "Failed to encode Bitmap", ((Throwable) (file)));
		if(resource == null)
			break MISSING_BLOCK_LABEL_202;
		flag = flag1;
		  goto _L1
		if(Log.isLoggable("BitmapEncoder", 2))
		{
			resource = ((Resource) (new StringBuilder()));
			((StringBuilder) (resource)).append("Compressed with type: ");
			((StringBuilder) (resource)).append(((Object) (compressformat)));
			((StringBuilder) (resource)).append(" of size ");
			((StringBuilder) (resource)).append(Util.getBitmapByteSize(bitmap));
			((StringBuilder) (resource)).append(" in ");
			((StringBuilder) (resource)).append(LogTime.getElapsedMillis(l));
			((StringBuilder) (resource)).append(", options format: ");
			((StringBuilder) (resource)).append(options.get(COMPRESSION_FORMAT));
			((StringBuilder) (resource)).append(", hasAlpha: ");
			((StringBuilder) (resource)).append(bitmap.hasAlpha());
			Log.v("BitmapEncoder", ((StringBuilder) (resource)).toString());
		}
		GlideTrace.endSection();
		return flag;
		if(resource1 == null)
			break MISSING_BLOCK_LABEL_329;
		try
		{
			((OutputStream) (resource1)).close();
		}
		// Misplaced declaration of an exception variable
		catch(File file) { }
	//  177  341:astore_2        
		throw resource;
		resource;
		GlideTrace.endSection();
		throw resource;
	//* 178  342:goto            329
	}

	public volatile boolean encode(Object obj, File file, Options options)
	{
		return encode((Resource)obj, file, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #84  <Class Resource>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #199 <Method boolean encode(Resource, File, Options)>
	//    6   10:ireturn         
	}

	public EncodeStrategy getEncodeStrategy(Options options)
	{
		return EncodeStrategy.TRANSFORMED;
	//    0    0:getstatic       #207 <Field EncodeStrategy EncodeStrategy.TRANSFORMED>
	//    1    3:areturn         
	}

	public static final Option COMPRESSION_FORMAT = Option.memory("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
	public static final Option COMPRESSION_QUALITY = Option.memory("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", ((Object) (Integer.valueOf(90))));
	private static final String TAG = "BitmapEncoder";
	private final ArrayPool arrayPool;

	static 
	{
	//    0    0:ldc1            #23  <String "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality">
	//    1    2:bipush          90
	//    2    4:invokestatic    #29  <Method Integer Integer.valueOf(int)>
	//    3    7:invokestatic    #35  <Method Option Option.memory(String, Object)>
	//    4   10:putstatic       #37  <Field Option COMPRESSION_QUALITY>
	//    5   13:ldc1            #39  <String "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat">
	//    6   15:invokestatic    #42  <Method Option Option.memory(String)>
	//    7   18:putstatic       #44  <Field Option COMPRESSION_FORMAT>
	//*   8   21:return          
	}
}
