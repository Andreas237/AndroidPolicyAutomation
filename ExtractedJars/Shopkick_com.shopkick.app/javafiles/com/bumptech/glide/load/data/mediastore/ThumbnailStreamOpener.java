// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.*;
import java.util.List;

// Referenced classes of package com.bumptech.glide.load.data.mediastore:
//			FileService, ThumbnailQuery

class ThumbnailStreamOpener
{

	ThumbnailStreamOpener(List list, FileService fileservice, ThumbnailQuery thumbnailquery, ArrayPool arraypool, ContentResolver contentresolver)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		service = fileservice;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #34  <Field FileService service>
		query = thumbnailquery;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #36  <Field ThumbnailQuery query>
		byteArrayPool = arraypool;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #38  <Field ArrayPool byteArrayPool>
		contentResolver = contentresolver;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #40  <Field ContentResolver contentResolver>
		parsers = list;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:putfield        #42  <Field List parsers>
	//   17   31:return          
	}

	ThumbnailStreamOpener(List list, ThumbnailQuery thumbnailquery, ArrayPool arraypool, ContentResolver contentresolver)
	{
		this(list, DEFAULT_SERVICE, thumbnailquery, arraypool, contentresolver);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #29  <Field FileService DEFAULT_SERVICE>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #47  <Method void ThumbnailStreamOpener(List, FileService, ThumbnailQuery, ArrayPool, ContentResolver)>
	//    7   12:return          
	}

	private String getPath(Uri uri)
	{
		uri = ((Uri) (query.query(uri)));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ThumbnailQuery query>
	//    2    4:aload_1         
	//    3    5:invokeinterface #57  <Method Cursor ThumbnailQuery.query(Uri)>
	//    4   10:astore_1        
		if(uri == null)
			break MISSING_BLOCK_LABEL_57;
	//    5   11:aload_1         
	//    6   12:ifnull          57
		String s;
		if(!((Cursor) (uri)).moveToFirst())
			break MISSING_BLOCK_LABEL_57;
	//    7   15:aload_1         
	//    8   16:invokeinterface #63  <Method boolean Cursor.moveToFirst()>
	//    9   21:ifeq            57
		s = ((Cursor) (uri)).getString(0);
	//   10   24:aload_1         
	//   11   25:iconst_0        
	//   12   26:invokeinterface #67  <Method String Cursor.getString(int)>
	//   13   31:astore_2        
		if(uri != null)
	//*  14   32:aload_1         
	//*  15   33:ifnull          42
			((Cursor) (uri)).close();
	//   16   36:aload_1         
	//   17   37:invokeinterface #70  <Method void Cursor.close()>
		return s;
	//   18   42:aload_2         
	//   19   43:areturn         
		Exception exception;
		exception;
	//   20   44:astore_2        
		if(uri != null)
	//*  21   45:aload_1         
	//*  22   46:ifnull          55
			((Cursor) (uri)).close();
	//   23   49:aload_1         
	//   24   50:invokeinterface #70  <Method void Cursor.close()>
		throw exception;
	//   25   55:aload_2         
	//   26   56:athrow          
		if(uri != null)
	//*  27   57:aload_1         
	//*  28   58:ifnull          67
			((Cursor) (uri)).close();
	//   29   61:aload_1         
	//   30   62:invokeinterface #70  <Method void Cursor.close()>
		return null;
	//   31   67:aconst_null     
	//   32   68:areturn         
	}

	private boolean isValid(File file)
	{
		return service.exists(file) && 0L < service.length(file);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field FileService service>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #77  <Method boolean FileService.exists(File)>
	//    4    8:ifeq            26
	//    5   11:lconst_0        
	//    6   12:aload_0         
	//    7   13:getfield        #34  <Field FileService service>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #81  <Method long FileService.length(File)>
	//   10   20:lcmp            
	//   11   21:ifge            26
	//   12   24:iconst_1        
	//   13   25:ireturn         
	//   14   26:iconst_0        
	//   15   27:ireturn         
	}

	int getOrientation(Uri uri)
	{
		InputStream inputstream;
		InputStream inputstream1;
		Object obj;
		inputstream1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		obj = null;
	//    2    3:aconst_null     
	//    3    4:astore          5
		inputstream = null;
	//    4    6:aconst_null     
	//    5    7:astore_3        
		InputStream inputstream2 = contentResolver.openInputStream(uri);
	//    6    8:aload_0         
	//    7    9:getfield        #40  <Field ContentResolver contentResolver>
	//    8   12:aload_1         
	//    9   13:invokevirtual   #93  <Method InputStream ContentResolver.openInputStream(Uri)>
	//   10   16:astore          6
		inputstream = inputstream2;
	//   11   18:aload           6
	//   12   20:astore_3        
		inputstream1 = inputstream2;
	//   13   21:aload           6
	//   14   23:astore          4
		obj = ((Object) (inputstream2));
	//   15   25:aload           6
	//   16   27:astore          5
		int i = ImageHeaderParserUtils.getOrientation(parsers, inputstream2, byteArrayPool);
	//   17   29:aload_0         
	//   18   30:getfield        #42  <Field List parsers>
	//   19   33:aload           6
	//   20   35:aload_0         
	//   21   36:getfield        #38  <Field ArrayPool byteArrayPool>
	//   22   39:invokestatic    #98  <Method int ImageHeaderParserUtils.getOrientation(List, InputStream, ArrayPool)>
	//   23   42:istore_2        
		Object obj1;
		if(inputstream2 != null)
	//*  24   43:aload           6
	//*  25   45:ifnull          53
			try
			{
				inputstream2.close();
	//   26   48:aload           6
	//   27   50:invokevirtual   #101 <Method void InputStream.close()>
			}
	//*  28   53:iload_2         
	//*  29   54:ireturn         
	//*  30   55:astore_1        
	//*  31   56:goto            143
	//*  32   59:astore          6
	//*  33   61:goto            70
	//*  34   64:astore          6
	//*  35   66:aload           5
	//*  36   68:astore          4
	//*  37   70:aload           4
	//*  38   72:astore_3        
	//*  39   73:ldc1            #10  <String "ThumbStreamOpener">
	//*  40   75:iconst_3        
	//*  41   76:invokestatic    #107 <Method boolean Log.isLoggable(String, int)>
	//*  42   79:ifeq            131
	//*  43   82:aload           4
	//*  44   84:astore_3        
	//*  45   85:new             #109 <Class StringBuilder>
	//*  46   88:dup             
	//*  47   89:invokespecial   #110 <Method void StringBuilder()>
	//*  48   92:astore          5
	//*  49   94:aload           4
	//*  50   96:astore_3        
	//*  51   97:aload           5
	//*  52   99:ldc1            #112 <String "Failed to open uri: ">
	//*  53  101:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//*  54  104:pop             
	//*  55  105:aload           4
	//*  56  107:astore_3        
	//*  57  108:aload           5
	//*  58  110:aload_1         
	//*  59  111:invokevirtual   #119 <Method StringBuilder StringBuilder.append(Object)>
	//*  60  114:pop             
	//*  61  115:aload           4
	//*  62  117:astore_3        
	//*  63  118:ldc1            #10  <String "ThumbStreamOpener">
	//*  64  120:aload           5
	//*  65  122:invokevirtual   #123 <Method String StringBuilder.toString()>
	//*  66  125:aload           6
	//*  67  127:invokestatic    #127 <Method int Log.d(String, String, Throwable)>
	//*  68  130:pop             
	//*  69  131:aload           4
	//*  70  133:ifnull          141
	//*  71  136:aload           4
	//*  72  138:invokevirtual   #101 <Method void InputStream.close()>
	//*  73  141:iconst_m1       
	//*  74  142:ireturn         
	//*  75  143:aload_3         
	//*  76  144:ifnull          151
	//*  77  147:aload_3         
	//*  78  148:invokevirtual   #101 <Method void InputStream.close()>
	//*  79  151:aload_1         
	//*  80  152:athrow          
			// Misplaced declaration of an exception variable
			catch(Uri uri)
	//*  81  153:astore_1        
			{
				return i;
	//   82  154:iload_2         
	//   83  155:ireturn         
			}
		return i;
		uri;
		break MISSING_BLOCK_LABEL_143;
		obj1;
		break MISSING_BLOCK_LABEL_70;
		obj1;
		inputstream1 = ((InputStream) (obj));
		inputstream = inputstream1;
		if(!Log.isLoggable("ThumbStreamOpener", 3))
			break MISSING_BLOCK_LABEL_131;
		inputstream = inputstream1;
		obj = ((Object) (new StringBuilder()));
		inputstream = inputstream1;
		((StringBuilder) (obj)).append("Failed to open uri: ");
		inputstream = inputstream1;
		((StringBuilder) (obj)).append(((Object) (uri)));
		inputstream = inputstream1;
		Log.d("ThumbStreamOpener", ((StringBuilder) (obj)).toString(), ((Throwable) (obj1)));
		if(inputstream1 != null)
			try
			{
				inputstream1.close();
			}
			// Misplaced declaration of an exception variable
			catch(Uri uri) { }
	//   84  156:astore_1        
		return -1;
		if(inputstream != null)
			try
			{
				inputstream.close();
			}
	//*  85  157:goto            141
			catch(IOException ioexception) { }
	//   86  160:astore_3        
		throw uri;
	//*  87  161:goto            151
	}

	public InputStream open(Uri uri)
		throws FileNotFoundException
	{
		Object obj = ((Object) (getPath(uri)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #132 <Method String getPath(Uri)>
	//    3    5:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (obj))))
	//*   4    6:aload_2         
	//*   5    7:invokestatic    #138 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   6   10:ifeq            15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		obj = ((Object) (service.get(((String) (obj)))));
	//    9   15:aload_0         
	//   10   16:getfield        #34  <Field FileService service>
	//   11   19:aload_2         
	//   12   20:invokevirtual   #142 <Method File FileService.get(String)>
	//   13   23:astore_2        
		if(!isValid(((File) (obj))))
	//*  14   24:aload_0         
	//*  15   25:aload_2         
	//*  16   26:invokespecial   #144 <Method boolean isValid(File)>
	//*  17   29:ifne            34
			return null;
	//   18   32:aconst_null     
	//   19   33:areturn         
		obj = ((Object) (Uri.fromFile(((File) (obj)))));
	//   20   34:aload_2         
	//   21   35:invokestatic    #150 <Method Uri Uri.fromFile(File)>
	//   22   38:astore_2        
		InputStream inputstream;
		try
		{
			inputstream = contentResolver.openInputStream(((Uri) (obj)));
	//   23   39:aload_0         
	//   24   40:getfield        #40  <Field ContentResolver contentResolver>
	//   25   43:aload_2         
	//   26   44:invokevirtual   #93  <Method InputStream ContentResolver.openInputStream(Uri)>
	//   27   47:astore_3        
		}
	//*  28   48:aload_3         
	//*  29   49:areturn         
		catch(NullPointerException nullpointerexception)
	//*  30   50:astore_3        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   31   51:new             #109 <Class StringBuilder>
	//   32   54:dup             
	//   33   55:invokespecial   #110 <Method void StringBuilder()>
	//   34   58:astore          4
			stringbuilder.append("NPE opening uri: ");
	//   35   60:aload           4
	//   36   62:ldc1            #152 <String "NPE opening uri: ">
	//   37   64:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   38   67:pop             
			stringbuilder.append(((Object) (uri)));
	//   39   68:aload           4
	//   40   70:aload_1         
	//   41   71:invokevirtual   #119 <Method StringBuilder StringBuilder.append(Object)>
	//   42   74:pop             
			stringbuilder.append(" -> ");
	//   43   75:aload           4
	//   44   77:ldc1            #154 <String " -> ">
	//   45   79:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   46   82:pop             
			stringbuilder.append(obj);
	//   47   83:aload           4
	//   48   85:aload_2         
	//   49   86:invokevirtual   #119 <Method StringBuilder StringBuilder.append(Object)>
	//   50   89:pop             
			throw (FileNotFoundException)(new FileNotFoundException(stringbuilder.toString())).initCause(((Throwable) (nullpointerexception)));
	//   51   90:new             #130 <Class FileNotFoundException>
	//   52   93:dup             
	//   53   94:aload           4
	//   54   96:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   55   99:invokespecial   #157 <Method void FileNotFoundException(String)>
	//   56  102:aload_3         
	//   57  103:invokevirtual   #161 <Method Throwable FileNotFoundException.initCause(Throwable)>
	//   58  106:checkcast       #130 <Class FileNotFoundException>
	//   59  109:athrow          
		}
		return inputstream;
	}

	private static final FileService DEFAULT_SERVICE = new FileService();
	private static final String TAG = "ThumbStreamOpener";
	private final ArrayPool byteArrayPool;
	private final ContentResolver contentResolver;
	private final List parsers;
	private final ThumbnailQuery query;
	private final FileService service;

	static 
	{
	//    0    0:new             #24  <Class FileService>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void FileService()>
	//    3    7:putstatic       #29  <Field FileService DEFAULT_SERVICE>
	//*   4   10:return          
	}
}
