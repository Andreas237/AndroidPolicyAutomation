// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.support.v4.os.TraceCompat;
import android.util.Log;
import com.bumptech.glide.load.*;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import java.io.*;

public class BitmapEncoder
	implements ResourceEncoder
{

	public BitmapEncoder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
	//    2    4:return          
	}

	private android.graphics.Bitmap.CompressFormat getFormat(Bitmap bitmap, Options options)
	{
		options = ((Options) ((android.graphics.Bitmap.CompressFormat)options.get(COMPRESSION_FORMAT)));
	//    0    0:aload_2         
	//    1    1:getstatic       #41  <Field Option COMPRESSION_FORMAT>
	//    2    4:invokevirtual   #53  <Method Object Options.get(Option)>
	//    3    7:checkcast       #55  <Class android.graphics.Bitmap$CompressFormat>
	//    4   10:astore_2        
		if(options != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          17
			return ((android.graphics.Bitmap.CompressFormat) (options));
	//    7   15:aload_2         
	//    8   16:areturn         
		if(bitmap.hasAlpha())
	//*   9   17:aload_1         
	//*  10   18:invokevirtual   #61  <Method boolean Bitmap.hasAlpha()>
	//*  11   21:ifeq            28
			return android.graphics.Bitmap.CompressFormat.PNG;
	//   12   24:getstatic       #65  <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.PNG>
	//   13   27:areturn         
		else
			return android.graphics.Bitmap.CompressFormat.JPEG;
	//   14   28:getstatic       #68  <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.JPEG>
	//   15   31:areturn         
	}

	public boolean encode(Resource resource, File file, Options options)
	{
		Bitmap bitmap;
		android.graphics.Bitmap.CompressFormat compressformat;
		bitmap = (Bitmap)resource.get();
	//    0    0:aload_1         
	//    1    1:invokeinterface #77  <Method Object Resource.get()>
	//    2    6:checkcast       #57  <Class Bitmap>
	//    3    9:astore          10
		compressformat = getFormat(bitmap, options);
	//    4   11:aload_0         
	//    5   12:aload           10
	//    6   14:aload_3         
	//    7   15:invokespecial   #79  <Method android.graphics.Bitmap$CompressFormat getFormat(Bitmap, Options)>
	//    8   18:astore          11
		TraceCompat.beginSection((new StringBuilder()).append("encode: [").append(bitmap.getWidth()).append("x").append(bitmap.getHeight()).append("] ").append(((Object) (compressformat))).toString());
	//    9   20:new             #81  <Class StringBuilder>
	//   10   23:dup             
	//   11   24:invokespecial   #82  <Method void StringBuilder()>
	//   12   27:ldc1            #84  <String "encode: [">
	//   13   29:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   14   32:aload           10
	//   15   34:invokevirtual   #92  <Method int Bitmap.getWidth()>
	//   16   37:invokevirtual   #95  <Method StringBuilder StringBuilder.append(int)>
	//   17   40:ldc1            #97  <String "x">
	//   18   42:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   19   45:aload           10
	//   20   47:invokevirtual   #100 <Method int Bitmap.getHeight()>
	//   21   50:invokevirtual   #95  <Method StringBuilder StringBuilder.append(int)>
	//   22   53:ldc1            #102 <String "] ">
	//   23   55:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   24   58:aload           11
	//   25   60:invokevirtual   #105 <Method StringBuilder StringBuilder.append(Object)>
	//   26   63:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   27   66:invokestatic    #115 <Method void TraceCompat.beginSection(String)>
		int i;
		long l;
		l = LogTime.getLogTime();
	//   28   69:invokestatic    #121 <Method long LogTime.getLogTime()>
	//   29   72:lstore          5
		i = ((Integer)options.get(COMPRESSION_QUALITY)).intValue();
	//   30   74:aload_3         
	//   31   75:getstatic       #34  <Field Option COMPRESSION_QUALITY>
	//   32   78:invokevirtual   #53  <Method Object Options.get(Option)>
	//   33   81:checkcast       #22  <Class Integer>
	//   34   84:invokevirtual   #124 <Method int Integer.intValue()>
	//   35   87:istore          4
		boolean flag1;
		Object obj;
		flag1 = false;
	//   36   89:iconst_0        
	//   37   90:istore          8
		obj = null;
	//   38   92:aconst_null     
	//   39   93:astore          9
		resource = null;
	//   40   95:aconst_null     
	//   41   96:astore_1        
		file = ((File) (new FileOutputStream(file)));
	//   42   97:new             #126 <Class FileOutputStream>
	//   43  100:dup             
	//   44  101:aload_2         
	//   45  102:invokespecial   #129 <Method void FileOutputStream(File)>
	//   46  105:astore_2        
		resource = ((Resource) (file));
	//   47  106:aload_2         
	//   48  107:astore_1        
		obj = ((Object) (file));
	//   49  108:aload_2         
	//   50  109:astore          9
		bitmap.compress(compressformat, i, ((OutputStream) (file)));
	//   51  111:aload           10
	//   52  113:aload           11
	//   53  115:iload           4
	//   54  117:aload_2         
	//   55  118:invokevirtual   #133 <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, OutputStream)>
	//   56  121:pop             
		resource = ((Resource) (file));
	//   57  122:aload_2         
	//   58  123:astore_1        
		obj = ((Object) (file));
	//   59  124:aload_2         
	//   60  125:astore          9
		((OutputStream) (file)).close();
	//   61  127:aload_2         
	//   62  128:invokevirtual   #138 <Method void OutputStream.close()>
		boolean flag;
		flag1 = true;
	//   63  131:iconst_1        
	//   64  132:istore          8
		flag = flag1;
	//   65  134:iload           8
	//   66  136:istore          7
		if(file == null)
			break MISSING_BLOCK_LABEL_230;
	//   67  138:aload_2         
	//   68  139:ifnull          230
		try
		{
			((OutputStream) (file)).close();
	//   69  142:aload_2         
	//   70  143:invokevirtual   #138 <Method void OutputStream.close()>
		}
	//*  71  146:iload           8
	//*  72  148:istore          7
	//*  73  150:goto            230
		// Misplaced declaration of an exception variable
		catch(Resource resource)
	//*  74  153:astore_1        
		{
			flag = flag1;
	//   75  154:iload           8
	//   76  156:istore          7
			break MISSING_BLOCK_LABEL_230;
	//   77  158:goto            230
		}
		flag = flag1;
		break MISSING_BLOCK_LABEL_230;
		file;
	//   78  161:astore_2        
		obj = ((Object) (resource));
	//   79  162:aload_1         
	//   80  163:astore          9
		if(!Log.isLoggable("BitmapEncoder", 3))
			break MISSING_BLOCK_LABEL_186;
	//   81  165:ldc1            #16  <String "BitmapEncoder">
	//   82  167:iconst_3        
	//   83  168:invokestatic    #144 <Method boolean Log.isLoggable(String, int)>
	//   84  171:ifeq            186
		obj = ((Object) (resource));
	//   85  174:aload_1         
	//   86  175:astore          9
		Log.d("BitmapEncoder", "Failed to encode Bitmap", ((Throwable) (file)));
	//   87  177:ldc1            #16  <String "BitmapEncoder">
	//   88  179:ldc1            #146 <String "Failed to encode Bitmap">
	//   89  181:aload_2         
	//   90  182:invokestatic    #150 <Method int Log.d(String, String, Throwable)>
	//   91  185:pop             
		flag = flag1;
	//   92  186:iload           8
	//   93  188:istore          7
		if(resource == null)
			break MISSING_BLOCK_LABEL_230;
	//   94  190:aload_1         
	//   95  191:ifnull          230
		try
		{
			((OutputStream) (resource)).close();
	//   96  194:aload_1         
	//   97  195:invokevirtual   #138 <Method void OutputStream.close()>
		}
	//*  98  198:iload           8
	//*  99  200:istore          7
	//* 100  202:goto            230
		// Misplaced declaration of an exception variable
		catch(Resource resource)
	//* 101  205:astore_1        
		{
			flag = flag1;
	//  102  206:iload           8
	//  103  208:istore          7
			break MISSING_BLOCK_LABEL_230;
	//  104  210:goto            230
		}
		flag = flag1;
		break MISSING_BLOCK_LABEL_230;
		resource;
	//  105  213:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_228;
	//  106  214:aload           9
	//  107  216:ifnull          228
		try
		{
			((OutputStream) (obj)).close();
	//  108  219:aload           9
	//  109  221:invokevirtual   #138 <Method void OutputStream.close()>
		}
	//* 110  224:goto            228
		// Misplaced declaration of an exception variable
		catch(File file) { }
	//  111  227:astore_2        
		throw resource;
	//  112  228:aload_1         
	//  113  229:athrow          
		if(Log.isLoggable("BitmapEncoder", 2))
	//* 114  230:ldc1            #16  <String "BitmapEncoder">
	//* 115  232:iconst_2        
	//* 116  233:invokestatic    #144 <Method boolean Log.isLoggable(String, int)>
	//* 117  236:ifeq            319
			Log.v("BitmapEncoder", (new StringBuilder()).append("Compressed with type: ").append(((Object) (compressformat))).append(" of size ").append(Util.getBitmapByteSize(bitmap)).append(" in ").append(LogTime.getElapsedMillis(l)).append(", options format: ").append(options.get(COMPRESSION_FORMAT)).append(", hasAlpha: ").append(bitmap.hasAlpha()).toString());
	//  118  239:ldc1            #16  <String "BitmapEncoder">
	//  119  241:new             #81  <Class StringBuilder>
	//  120  244:dup             
	//  121  245:invokespecial   #82  <Method void StringBuilder()>
	//  122  248:ldc1            #152 <String "Compressed with type: ">
	//  123  250:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  124  253:aload           11
	//  125  255:invokevirtual   #105 <Method StringBuilder StringBuilder.append(Object)>
	//  126  258:ldc1            #154 <String " of size ">
	//  127  260:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  128  263:aload           10
	//  129  265:invokestatic    #160 <Method int Util.getBitmapByteSize(Bitmap)>
	//  130  268:invokevirtual   #95  <Method StringBuilder StringBuilder.append(int)>
	//  131  271:ldc1            #162 <String " in ">
	//  132  273:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  133  276:lload           5
	//  134  278:invokestatic    #166 <Method double LogTime.getElapsedMillis(long)>
	//  135  281:invokevirtual   #169 <Method StringBuilder StringBuilder.append(double)>
	//  136  284:ldc1            #171 <String ", options format: ">
	//  137  286:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  138  289:aload_3         
	//  139  290:getstatic       #41  <Field Option COMPRESSION_FORMAT>
	//  140  293:invokevirtual   #53  <Method Object Options.get(Option)>
	//  141  296:invokevirtual   #105 <Method StringBuilder StringBuilder.append(Object)>
	//  142  299:ldc1            #173 <String ", hasAlpha: ">
	//  143  301:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  144  304:aload           10
	//  145  306:invokevirtual   #61  <Method boolean Bitmap.hasAlpha()>
	//  146  309:invokevirtual   #176 <Method StringBuilder StringBuilder.append(boolean)>
	//  147  312:invokevirtual   #109 <Method String StringBuilder.toString()>
	//  148  315:invokestatic    #180 <Method int Log.v(String, String)>
	//  149  318:pop             
		TraceCompat.endSection();
	//  150  319:invokestatic    #183 <Method void TraceCompat.endSection()>
		return flag;
	//  151  322:iload           7
	//  152  324:ireturn         
		resource;
	//  153  325:astore_1        
		TraceCompat.endSection();
	//  154  326:invokestatic    #183 <Method void TraceCompat.endSection()>
		throw resource;
	//  155  329:aload_1         
	//  156  330:athrow          
	}

	public volatile boolean encode(Object obj, File file, Options options)
	{
		return encode((Resource)obj, file, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #74  <Class Resource>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #188 <Method boolean encode(Resource, File, Options)>
	//    6   10:ireturn         
	}

	public EncodeStrategy getEncodeStrategy(Options options)
	{
		return EncodeStrategy.TRANSFORMED;
	//    0    0:getstatic       #196 <Field EncodeStrategy EncodeStrategy.TRANSFORMED>
	//    1    3:areturn         
	}

	public static final Option COMPRESSION_FORMAT = Option.memory("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
	public static final Option COMPRESSION_QUALITY = Option.memory("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", ((Object) (Integer.valueOf(90))));
	private static final String TAG = "BitmapEncoder";

	static 
	{
	//    0    0:ldc1            #20  <String "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality">
	//    1    2:bipush          90
	//    2    4:invokestatic    #26  <Method Integer Integer.valueOf(int)>
	//    3    7:invokestatic    #32  <Method Option Option.memory(String, Object)>
	//    4   10:putstatic       #34  <Field Option COMPRESSION_QUALITY>
	//    5   13:ldc1            #36  <String "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat">
	//    6   15:invokestatic    #39  <Method Option Option.memory(String)>
	//    7   18:putstatic       #41  <Field Option COMPRESSION_FORMAT>
	//*   8   21:return          
	}
}
