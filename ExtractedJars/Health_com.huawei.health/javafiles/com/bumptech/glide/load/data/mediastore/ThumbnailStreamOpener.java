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

	public ThumbnailStreamOpener(List list, FileService fileservice, ThumbnailQuery thumbnailquery, ArrayPool arraypool, ContentResolver contentresolver)
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

	public ThumbnailStreamOpener(List list, ThumbnailQuery thumbnailquery, ArrayPool arraypool, ContentResolver contentresolver)
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

	public int getOrientation(Uri uri)
	{
		InputStream inputstream;
		InputStream inputstream1;
		inputstream1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		inputstream = null;
	//    2    3:aconst_null     
	//    3    4:astore_3        
		InputStream inputstream2 = contentResolver.openInputStream(uri);
	//    4    5:aload_0         
	//    5    6:getfield        #40  <Field ContentResolver contentResolver>
	//    6    9:aload_1         
	//    7   10:invokevirtual   #60  <Method InputStream ContentResolver.openInputStream(Uri)>
	//    8   13:astore          5
		inputstream = inputstream2;
	//    9   15:aload           5
	//   10   17:astore_3        
		inputstream1 = inputstream2;
	//   11   18:aload           5
	//   12   20:astore          4
		int i = ImageHeaderParserUtils.getOrientation(parsers, inputstream2, byteArrayPool);
	//   13   22:aload_0         
	//   14   23:getfield        #42  <Field List parsers>
	//   15   26:aload           5
	//   16   28:aload_0         
	//   17   29:getfield        #38  <Field ArrayPool byteArrayPool>
	//   18   32:invokestatic    #65  <Method int ImageHeaderParserUtils.getOrientation(List, InputStream, ArrayPool)>
	//   19   35:istore_2        
		if(inputstream2 == null)
			break MISSING_BLOCK_LABEL_49;
	//   20   36:aload           5
	//   21   38:ifnull          49
		inputstream2.close();
	//   22   41:aload           5
	//   23   43:invokevirtual   #70  <Method void InputStream.close()>
		return i;
	//   24   46:iload_2         
	//   25   47:ireturn         
		uri;
	//   26   48:astore_1        
		return i;
	//   27   49:iload_2         
	//   28   50:ireturn         
		Object obj;
		obj;
	//   29   51:astore          5
		inputstream1 = inputstream;
	//   30   53:aload_3         
	//   31   54:astore          4
		if(!Log.isLoggable("ThumbStreamOpener", 3))
			break MISSING_BLOCK_LABEL_95;
	//   32   56:ldc1            #10  <String "ThumbStreamOpener">
	//   33   58:iconst_3        
	//   34   59:invokestatic    #76  <Method boolean Log.isLoggable(String, int)>
	//   35   62:ifeq            95
		inputstream1 = inputstream;
	//   36   65:aload_3         
	//   37   66:astore          4
		Log.d("ThumbStreamOpener", (new StringBuilder()).append("Failed to open uri: ").append(((Object) (uri))).toString(), ((Throwable) (obj)));
	//   38   68:ldc1            #10  <String "ThumbStreamOpener">
	//   39   70:new             #78  <Class StringBuilder>
	//   40   73:dup             
	//   41   74:invokespecial   #79  <Method void StringBuilder()>
	//   42   77:ldc1            #81  <String "Failed to open uri: ">
	//   43   79:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   44   82:aload_1         
	//   45   83:invokevirtual   #88  <Method StringBuilder StringBuilder.append(Object)>
	//   46   86:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   47   89:aload           5
	//   48   91:invokestatic    #96  <Method int Log.d(String, String, Throwable)>
	//   49   94:pop             
		if(inputstream != null)
	//*  50   95:aload_3         
	//*  51   96:ifnull          127
			try
			{
				inputstream.close();
	//   52   99:aload_3         
	//   53  100:invokevirtual   #70  <Method void InputStream.close()>
			}
	//*  54  103:goto            127
			// Misplaced declaration of an exception variable
			catch(Uri uri) { }
	//   55  106:astore_1        
		break MISSING_BLOCK_LABEL_127;
	//   56  107:goto            127
		uri;
	//   57  110:astore_1        
		if(inputstream1 != null)
	//*  58  111:aload           4
	//*  59  113:ifnull          125
			try
			{
				inputstream1.close();
	//   60  116:aload           4
	//   61  118:invokevirtual   #70  <Method void InputStream.close()>
			}
	//*  62  121:goto            125
			catch(IOException ioexception) { }
	//   63  124:astore_3        
		throw uri;
	//   64  125:aload_1         
	//   65  126:athrow          
		return -1;
	//   66  127:iconst_m1       
	//   67  128:ireturn         
	}

	public InputStream open(Uri uri)
		throws FileNotFoundException
	{
		Object obj;
		Cursor cursor;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		cursor = query.query(uri);
	//    2    2:aload_0         
	//    3    3:getfield        #36  <Field ThumbnailQuery query>
	//    4    6:aload_1         
	//    5    7:invokeinterface #104 <Method Cursor ThumbnailQuery.query(Uri)>
	//    6   12:astore          4
		if(cursor == null)
			break MISSING_BLOCK_LABEL_31;
	//    7   14:aload           4
	//    8   16:ifnull          31
		boolean flag = cursor.moveToFirst();
	//    9   19:aload           4
	//   10   21:invokeinterface #110 <Method boolean Cursor.moveToFirst()>
	//   11   26:istore_2        
		if(flag)
			break MISSING_BLOCK_LABEL_45;
	//   12   27:iload_2         
	//   13   28:ifne            45
		if(cursor != null)
	//*  14   31:aload           4
	//*  15   33:ifnull          43
			cursor.close();
	//   16   36:aload           4
	//   17   38:invokeinterface #111 <Method void Cursor.close()>
		return null;
	//   18   43:aconst_null     
	//   19   44:areturn         
		uri = ((Uri) (cursor.getString(0)));
	//   20   45:aload           4
	//   21   47:iconst_0        
	//   22   48:invokeinterface #115 <Method String Cursor.getString(int)>
	//   23   53:astore_1        
		flag = TextUtils.isEmpty(((CharSequence) (uri)));
	//   24   54:aload_1         
	//   25   55:invokestatic    #121 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   26   58:istore_2        
		if(flag)
	//*  27   59:iload_2         
	//*  28   60:ifeq            77
		{
			if(cursor != null)
	//*  29   63:aload           4
	//*  30   65:ifnull          75
				cursor.close();
	//   31   68:aload           4
	//   32   70:invokeinterface #111 <Method void Cursor.close()>
			return null;
	//   33   75:aconst_null     
	//   34   76:areturn         
		}
		java.io.File file = service.get(((String) (uri)));
	//   35   77:aload_0         
	//   36   78:getfield        #34  <Field FileService service>
	//   37   81:aload_1         
	//   38   82:invokevirtual   #125 <Method java.io.File FileService.get(String)>
	//   39   85:astore          5
		uri = ((Uri) (obj));
	//   40   87:aload_3         
	//   41   88:astore_1        
		if(!service.exists(file))
			break MISSING_BLOCK_LABEL_123;
	//   42   89:aload_0         
	//   43   90:getfield        #34  <Field FileService service>
	//   44   93:aload           5
	//   45   95:invokevirtual   #129 <Method boolean FileService.exists(java.io.File)>
	//   46   98:ifeq            123
		uri = ((Uri) (obj));
	//   47  101:aload_3         
	//   48  102:astore_1        
		if(service.length(file) > 0L)
	//*  49  103:aload_0         
	//*  50  104:getfield        #34  <Field FileService service>
	//*  51  107:aload           5
	//*  52  109:invokevirtual   #133 <Method long FileService.length(java.io.File)>
	//*  53  112:lconst_0        
	//*  54  113:lcmp            
	//*  55  114:ifle            123
			uri = Uri.fromFile(file);
	//   56  117:aload           5
	//   57  119:invokestatic    #139 <Method Uri Uri.fromFile(java.io.File)>
	//   58  122:astore_1        
		if(cursor != null)
	//*  59  123:aload           4
	//*  60  125:ifnull          153
			cursor.close();
	//   61  128:aload           4
	//   62  130:invokeinterface #111 <Method void Cursor.close()>
		break MISSING_BLOCK_LABEL_153;
	//   63  135:goto            153
		uri;
	//   64  138:astore_1        
		if(cursor != null)
	//*  65  139:aload           4
	//*  66  141:ifnull          151
			cursor.close();
	//   67  144:aload           4
	//   68  146:invokeinterface #111 <Method void Cursor.close()>
		throw uri;
	//   69  151:aload_1         
	//   70  152:athrow          
		if(uri != null)
	//*  71  153:aload_1         
	//*  72  154:ifnull          203
		{
			InputStream inputstream;
			try
			{
				inputstream = contentResolver.openInputStream(uri);
	//   73  157:aload_0         
	//   74  158:getfield        #40  <Field ContentResolver contentResolver>
	//   75  161:aload_1         
	//   76  162:invokevirtual   #60  <Method InputStream ContentResolver.openInputStream(Uri)>
	//   77  165:astore_3        
			}
	//*  78  166:aload_3         
	//*  79  167:areturn         
			catch(NullPointerException nullpointerexception)
	//*  80  168:astore_3        
			{
				throw (FileNotFoundException)(new FileNotFoundException((new StringBuilder()).append("NPE opening uri: ").append(((Object) (uri))).toString())).initCause(((Throwable) (nullpointerexception)));
	//   81  169:new             #99  <Class FileNotFoundException>
	//   82  172:dup             
	//   83  173:new             #78  <Class StringBuilder>
	//   84  176:dup             
	//   85  177:invokespecial   #79  <Method void StringBuilder()>
	//   86  180:ldc1            #141 <String "NPE opening uri: ">
	//   87  182:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   88  185:aload_1         
	//   89  186:invokevirtual   #88  <Method StringBuilder StringBuilder.append(Object)>
	//   90  189:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   91  192:invokespecial   #144 <Method void FileNotFoundException(String)>
	//   92  195:aload_3         
	//   93  196:invokevirtual   #148 <Method Throwable FileNotFoundException.initCause(Throwable)>
	//   94  199:checkcast       #99  <Class FileNotFoundException>
	//   95  202:athrow          
			}
			return inputstream;
		} else
		{
			return null;
	//   96  203:aconst_null     
	//   97  204:areturn         
		}
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
