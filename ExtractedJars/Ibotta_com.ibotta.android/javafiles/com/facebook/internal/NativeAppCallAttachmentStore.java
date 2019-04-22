// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import com.facebook.*;
import java.io.*;
import java.net.URLEncoder;
import java.util.*;

// Referenced classes of package com.facebook.internal:
//			Utility, Validate

public final class NativeAppCallAttachmentStore
{
	public static final class Attachment
	{

		public String getAttachmentUrl()
		{
			return attachmentUrl;
		//    0    0:aload_0         
		//    1    1:getfield        #104 <Field String attachmentUrl>
		//    2    4:areturn         
		}

		private final String attachmentName;
		private final String attachmentUrl;
		private Bitmap bitmap;
		private final UUID callId;
		private boolean isContentUri;
		private Uri originalUri;
		private boolean shouldCreateFile;


/*
		static boolean access$100(Attachment attachment)
		{
			return attachment.shouldCreateFile;
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field boolean shouldCreateFile>
		//    2    4:ireturn         
		}

*/


/*
		static UUID access$200(Attachment attachment)
		{
			return attachment.callId;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field UUID callId>
		//    2    4:areturn         
		}

*/


/*
		static String access$300(Attachment attachment)
		{
			return attachment.attachmentName;
		//    0    0:aload_0         
		//    1    1:getfield        #90  <Field String attachmentName>
		//    2    4:areturn         
		}

*/


/*
		static Bitmap access$400(Attachment attachment)
		{
			return attachment.bitmap;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Bitmap bitmap>
		//    2    4:areturn         
		}

*/


/*
		static Uri access$500(Attachment attachment)
		{
			return attachment.originalUri;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field Uri originalUri>
		//    2    4:areturn         
		}

*/


/*
		static boolean access$600(Attachment attachment)
		{
			return attachment.isContentUri;
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field boolean isContentUri>
		//    2    4:ireturn         
		}

*/

		private Attachment(UUID uuid, Bitmap bitmap1, Uri uri)
		{
label0:
			{
				super();
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
				callId = uuid;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #26  <Field UUID callId>
				bitmap = bitmap1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #28  <Field Bitmap bitmap>
				originalUri = uri;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #30  <Field Uri originalUri>
				boolean flag = true;
		//   11   19:iconst_1        
		//   12   20:istore          4
				if(uri != null)
		//*  13   22:aload_3         
		//*  14   23:ifnull          142
				{
					bitmap1 = ((Bitmap) (uri.getScheme()));
		//   15   26:aload_3         
		//   16   27:invokevirtual   #36  <Method String Uri.getScheme()>
		//   17   30:astore_2        
					if("content".equalsIgnoreCase(((String) (bitmap1))))
		//*  18   31:ldc1            #38  <String "content">
		//*  19   33:aload_2         
		//*  20   34:invokevirtual   #44  <Method boolean String.equalsIgnoreCase(String)>
		//*  21   37:ifeq            79
					{
						isContentUri = true;
		//   22   40:aload_0         
		//   23   41:iconst_1        
		//   24   42:putfield        #46  <Field boolean isContentUri>
						if(uri.getAuthority() == null || uri.getAuthority().startsWith("media"))
		//*  25   45:aload_3         
		//*  26   46:invokevirtual   #49  <Method String Uri.getAuthority()>
		//*  27   49:ifnull          67
		//*  28   52:aload_3         
		//*  29   53:invokevirtual   #49  <Method String Uri.getAuthority()>
		//*  30   56:ldc1            #51  <String "media">
		//*  31   58:invokevirtual   #54  <Method boolean String.startsWith(String)>
		//*  32   61:ifne            67
		//*  33   64:goto            70
							flag = false;
		//   34   67:iconst_0        
		//   35   68:istore          4
						shouldCreateFile = flag;
		//   36   70:aload_0         
		//   37   71:iload           4
		//   38   73:putfield        #56  <Field boolean shouldCreateFile>
					} else
		//*  39   76:goto            151
					if("file".equalsIgnoreCase(uri.getScheme()))
		//*  40   79:ldc1            #58  <String "file">
		//*  41   81:aload_3         
		//*  42   82:invokevirtual   #36  <Method String Uri.getScheme()>
		//*  43   85:invokevirtual   #44  <Method boolean String.equalsIgnoreCase(String)>
		//*  44   88:ifeq            99
						shouldCreateFile = true;
		//   45   91:aload_0         
		//   46   92:iconst_1        
		//   47   93:putfield        #56  <Field boolean shouldCreateFile>
					else
		//*  48   96:goto            151
					if(!Utility.isWebUri(uri))
		//*  49   99:aload_3         
		//*  50  100:invokestatic    #64  <Method boolean Utility.isWebUri(Uri)>
		//*  51  103:ifeq            109
		//*  52  106:goto            151
					{
						uuid = ((UUID) (new StringBuilder()));
		//   53  109:new             #66  <Class StringBuilder>
		//   54  112:dup             
		//   55  113:invokespecial   #67  <Method void StringBuilder()>
		//   56  116:astore_1        
						((StringBuilder) (uuid)).append("Unsupported scheme for media Uri : ");
		//   57  117:aload_1         
		//   58  118:ldc1            #69  <String "Unsupported scheme for media Uri : ">
		//   59  120:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
		//   60  123:pop             
						((StringBuilder) (uuid)).append(((String) (bitmap1)));
		//   61  124:aload_1         
		//   62  125:aload_2         
		//   63  126:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
		//   64  129:pop             
						throw new FacebookException(((StringBuilder) (uuid)).toString());
		//   65  130:new             #75  <Class FacebookException>
		//   66  133:dup             
		//   67  134:aload_1         
		//   68  135:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   69  138:invokespecial   #81  <Method void FacebookException(String)>
		//   70  141:athrow          
					}
				} else
				{
					if(bitmap1 == null)
						break label0;
		//   71  142:aload_2         
		//   72  143:ifnull          211
					shouldCreateFile = true;
		//   73  146:aload_0         
		//   74  147:iconst_1        
		//   75  148:putfield        #56  <Field boolean shouldCreateFile>
				}
				if(!shouldCreateFile)
		//*  76  151:aload_0         
		//*  77  152:getfield        #56  <Field boolean shouldCreateFile>
		//*  78  155:ifne            163
					bitmap1 = null;
		//   79  158:aconst_null     
		//   80  159:astore_2        
				else
		//*  81  160:goto            170
					bitmap1 = ((Bitmap) (UUID.randomUUID().toString()));
		//   82  163:invokestatic    #87  <Method UUID UUID.randomUUID()>
		//   83  166:invokevirtual   #88  <Method String UUID.toString()>
		//   84  169:astore_2        
				attachmentName = ((String) (bitmap1));
		//   85  170:aload_0         
		//   86  171:aload_2         
		//   87  172:putfield        #90  <Field String attachmentName>
				if(!shouldCreateFile)
		//*  88  175:aload_0         
		//*  89  176:getfield        #56  <Field boolean shouldCreateFile>
		//*  90  179:ifne            193
					uuid = ((UUID) (originalUri.toString()));
		//   91  182:aload_0         
		//   92  183:getfield        #30  <Field Uri originalUri>
		//   93  186:invokevirtual   #91  <Method String Uri.toString()>
		//   94  189:astore_1        
				else
		//*  95  190:goto            205
					uuid = ((UUID) (FacebookContentProvider.getAttachmentUrl(FacebookSdk.getApplicationId(), uuid, attachmentName)));
		//   96  193:invokestatic    #96  <Method String FacebookSdk.getApplicationId()>
		//   97  196:aload_1         
		//   98  197:aload_0         
		//   99  198:getfield        #90  <Field String attachmentName>
		//  100  201:invokestatic    #102 <Method String FacebookContentProvider.getAttachmentUrl(String, UUID, String)>
		//  101  204:astore_1        
				attachmentUrl = ((String) (uuid));
		//  102  205:aload_0         
		//  103  206:aload_1         
		//  104  207:putfield        #104 <Field String attachmentUrl>
				return;
		//  105  210:return          
			}
			throw new FacebookException("Cannot share media without a bitmap or Uri set");
		//  106  211:new             #75  <Class FacebookException>
		//  107  214:dup             
		//  108  215:ldc1            #106 <String "Cannot share media without a bitmap or Uri set">
		//  109  217:invokespecial   #81  <Method void FacebookException(String)>
		//  110  220:athrow          
		}

	}


	private NativeAppCallAttachmentStore()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	public static void addAttachments(Collection collection)
	{
		Object obj;
		if(collection == null)
			break MISSING_BLOCK_LABEL_211;
	//    0    0:aload_0         
	//    1    1:ifnull          211
		if(collection.size() == 0)
	//*   2    4:aload_0         
	//*   3    5:invokeinterface #33  <Method int Collection.size()>
	//*   4   10:ifne            14
			return;
	//    5   13:return          
		if(attachmentsDirectory == null)
	//*   6   14:getstatic       #35  <Field File attachmentsDirectory>
	//*   7   17:ifnonnull       23
			cleanupAllAttachments();
	//    8   20:invokestatic    #38  <Method void cleanupAllAttachments()>
		ensureAttachmentsDirectoryExists();
	//    9   23:invokestatic    #42  <Method File ensureAttachmentsDirectoryExists()>
	//   10   26:pop             
		obj = ((Object) (new ArrayList()));
	//   11   27:new             #44  <Class ArrayList>
	//   12   30:dup             
	//   13   31:invokespecial   #45  <Method void ArrayList()>
	//   14   34:astore_1        
		collection = ((Collection) (collection.iterator()));
	//   15   35:aload_0         
	//   16   36:invokeinterface #49  <Method Iterator Collection.iterator()>
	//   17   41:astore_0        
_L3:
		Attachment attachment;
		do
		{
			if(!((Iterator) (collection)).hasNext())
				break MISSING_BLOCK_LABEL_132;
	//   18   42:aload_0         
	//   19   43:invokeinterface #55  <Method boolean Iterator.hasNext()>
	//   20   48:ifeq            132
			attachment = (Attachment)((Iterator) (collection)).next();
	//   21   51:aload_0         
	//   22   52:invokeinterface #59  <Method Object Iterator.next()>
	//   23   57:checkcast       #8   <Class NativeAppCallAttachmentStore$Attachment>
	//   24   60:astore_2        
		} while(!attachment.shouldCreateFile);
	//   25   61:aload_2         
	//   26   62:invokestatic    #63  <Method boolean NativeAppCallAttachmentStore$Attachment.access$100(NativeAppCallAttachmentStore$Attachment)>
	//   27   65:ifne            71
	//*  28   68:goto            42
		File file1;
		file1 = getAttachmentFile(attachment.callId, attachment.attachmentName, true);
	//   29   71:aload_2         
	//   30   72:invokestatic    #67  <Method UUID NativeAppCallAttachmentStore$Attachment.access$200(NativeAppCallAttachmentStore$Attachment)>
	//   31   75:aload_2         
	//   32   76:invokestatic    #71  <Method String NativeAppCallAttachmentStore$Attachment.access$300(NativeAppCallAttachmentStore$Attachment)>
	//   33   79:iconst_1        
	//   34   80:invokestatic    #75  <Method File getAttachmentFile(UUID, String, boolean)>
	//   35   83:astore_3        
		((List) (obj)).add(((Object) (file1)));
	//   36   84:aload_1         
	//   37   85:aload_3         
	//   38   86:invokeinterface #81  <Method boolean List.add(Object)>
	//   39   91:pop             
		if(attachment.bitmap == null) goto _L2; else goto _L1
	//   40   92:aload_2         
	//   41   93:invokestatic    #85  <Method Bitmap NativeAppCallAttachmentStore$Attachment.access$400(NativeAppCallAttachmentStore$Attachment)>
	//   42   96:ifnull          110
_L1:
		processAttachmentBitmap(attachment.bitmap, file1);
	//   43   99:aload_2         
	//   44  100:invokestatic    #85  <Method Bitmap NativeAppCallAttachmentStore$Attachment.access$400(NativeAppCallAttachmentStore$Attachment)>
	//   45  103:aload_3         
	//   46  104:invokestatic    #89  <Method void processAttachmentBitmap(Bitmap, File)>
		  goto _L3
	//*  47  107:goto            42
_L2:
		if(attachment.originalUri == null) goto _L3; else goto _L4
	//   48  110:aload_2         
	//   49  111:invokestatic    #93  <Method Uri NativeAppCallAttachmentStore$Attachment.access$500(NativeAppCallAttachmentStore$Attachment)>
	//   50  114:ifnull          42
_L4:
		processAttachmentFile(attachment.originalUri, attachment.isContentUri, file1);
	//   51  117:aload_2         
	//   52  118:invokestatic    #93  <Method Uri NativeAppCallAttachmentStore$Attachment.access$500(NativeAppCallAttachmentStore$Attachment)>
	//   53  121:aload_2         
	//   54  122:invokestatic    #96  <Method boolean NativeAppCallAttachmentStore$Attachment.access$600(NativeAppCallAttachmentStore$Attachment)>
	//   55  125:aload_3         
	//   56  126:invokestatic    #100 <Method void processAttachmentFile(Uri, boolean, File)>
		  goto _L3
	//*  57  129:goto            42
		return;
	//   58  132:return          
		collection;
	//   59  133:astore_0        
		String s = TAG;
	//   60  134:getstatic       #102 <Field String TAG>
	//   61  137:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   62  138:new             #104 <Class StringBuilder>
	//   63  141:dup             
	//   64  142:invokespecial   #105 <Method void StringBuilder()>
	//   65  145:astore_3        
		stringbuilder.append("Got unexpected exception:");
	//   66  146:aload_3         
	//   67  147:ldc1            #107 <String "Got unexpected exception:">
	//   68  149:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   69  152:pop             
		stringbuilder.append(((Object) (collection)));
	//   70  153:aload_3         
	//   71  154:aload_0         
	//   72  155:invokevirtual   #114 <Method StringBuilder StringBuilder.append(Object)>
	//   73  158:pop             
		Log.e(s, stringbuilder.toString());
	//   74  159:aload_2         
	//   75  160:aload_3         
	//   76  161:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   77  164:invokestatic    #124 <Method int Log.e(String, String)>
	//   78  167:pop             
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*  79  168:aload_1         
	//*  80  169:invokeinterface #125 <Method Iterator List.iterator()>
	//*  81  174:astore_1        
	//*  82  175:aload_1         
	//*  83  176:invokeinterface #55  <Method boolean Iterator.hasNext()>
	//*  84  181:ifeq            202
		{
			File file = (File)((Iterator) (obj)).next();
	//   85  184:aload_1         
	//   86  185:invokeinterface #59  <Method Object Iterator.next()>
	//   87  190:checkcast       #127 <Class File>
	//   88  193:astore_2        
			try
			{
				file.delete();
	//   89  194:aload_2         
	//   90  195:invokevirtual   #130 <Method boolean File.delete()>
	//   91  198:pop             
			}
	//*  92  199:goto            175
	//*  93  202:new             #132 <Class FacebookException>
	//*  94  205:dup             
	//*  95  206:aload_0         
	//*  96  207:invokespecial   #135 <Method void FacebookException(Throwable)>
	//*  97  210:athrow          
	//*  98  211:return          
			catch(Exception exception) { }
	//   99  212:astore_2        
		}

		throw new FacebookException(((Throwable) (collection)));
	//* 100  213:goto            175
	}

	public static void cleanupAllAttachments()
	{
		Utility.deleteDirectory(getAttachmentsDirectory());
	//    0    0:invokestatic    #140 <Method File getAttachmentsDirectory()>
	//    1    3:invokestatic    #146 <Method void Utility.deleteDirectory(File)>
	//    2    6:return          
	}

	public static void cleanupAttachmentsForCall(UUID uuid)
	{
		uuid = ((UUID) (getAttachmentsDirectoryForCall(uuid, false)));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #152 <Method File getAttachmentsDirectoryForCall(UUID, boolean)>
	//    3    5:astore_0        
		if(uuid != null)
	//*   4    6:aload_0         
	//*   5    7:ifnull          14
			Utility.deleteDirectory(((File) (uuid)));
	//    6   10:aload_0         
	//    7   11:invokestatic    #146 <Method void Utility.deleteDirectory(File)>
	//    8   14:return          
	}

	public static Attachment createAttachment(UUID uuid, Bitmap bitmap)
	{
		Validate.notNull(((Object) (uuid)), "callId");
	//    0    0:aload_0         
	//    1    1:ldc1            #156 <String "callId">
	//    2    3:invokestatic    #162 <Method void Validate.notNull(Object, String)>
		Validate.notNull(((Object) (bitmap)), "attachmentBitmap");
	//    3    6:aload_1         
	//    4    7:ldc1            #164 <String "attachmentBitmap">
	//    5    9:invokestatic    #162 <Method void Validate.notNull(Object, String)>
		return new Attachment(uuid, bitmap, ((Uri) (null)));
	//    6   12:new             #8   <Class NativeAppCallAttachmentStore$Attachment>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:aconst_null     
	//   11   19:aconst_null     
	//   12   20:invokespecial   #167 <Method void NativeAppCallAttachmentStore$Attachment(UUID, Bitmap, Uri, NativeAppCallAttachmentStore$1)>
	//   13   23:areturn         
	}

	public static Attachment createAttachment(UUID uuid, Uri uri)
	{
		Validate.notNull(((Object) (uuid)), "callId");
	//    0    0:aload_0         
	//    1    1:ldc1            #156 <String "callId">
	//    2    3:invokestatic    #162 <Method void Validate.notNull(Object, String)>
		Validate.notNull(((Object) (uri)), "attachmentUri");
	//    3    6:aload_1         
	//    4    7:ldc1            #170 <String "attachmentUri">
	//    5    9:invokestatic    #162 <Method void Validate.notNull(Object, String)>
		return new Attachment(uuid, ((Bitmap) (null)), uri);
	//    6   12:new             #8   <Class NativeAppCallAttachmentStore$Attachment>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:aload_1         
	//   11   19:aconst_null     
	//   12   20:invokespecial   #167 <Method void NativeAppCallAttachmentStore$Attachment(UUID, Bitmap, Uri, NativeAppCallAttachmentStore$1)>
	//   13   23:areturn         
	}

	static File ensureAttachmentsDirectoryExists()
	{
		File file = getAttachmentsDirectory();
	//    0    0:invokestatic    #140 <Method File getAttachmentsDirectory()>
	//    1    3:astore_0        
		file.mkdirs();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #173 <Method boolean File.mkdirs()>
	//    4    8:pop             
		return file;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	static File getAttachmentFile(UUID uuid, String s, boolean flag)
		throws IOException
	{
		uuid = ((UUID) (getAttachmentsDirectoryForCall(uuid, flag)));
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokestatic    #152 <Method File getAttachmentsDirectoryForCall(UUID, boolean)>
	//    3    5:astore_0        
		if(uuid == null)
	//*   4    6:aload_0         
	//*   5    7:ifnonnull       12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		try
		{
			uuid = ((UUID) (new File(((File) (uuid)), URLEncoder.encode(s, "UTF-8"))));
	//    8   12:new             #127 <Class File>
	//    9   15:dup             
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:ldc1            #177 <String "UTF-8">
	//   13   20:invokestatic    #183 <Method String URLEncoder.encode(String, String)>
	//   14   23:invokespecial   #186 <Method void File(File, String)>
	//   15   26:astore_0        
		}
	//*  16   27:aload_0         
	//*  17   28:areturn         
		// Misplaced declaration of an exception variable
		catch(UUID uuid)
	//*  18   29:astore_0        
		{
			return null;
	//   19   30:aconst_null     
	//   20   31:areturn         
		}
		return ((File) (uuid));
	}

	static File getAttachmentsDirectory()
	{
		com/facebook/internal/NativeAppCallAttachmentStore;
	//    0    0:ldc1            #2   <Class NativeAppCallAttachmentStore>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		File file;
		if(attachmentsDirectory == null)
	//*   2    3:getstatic       #35  <Field File attachmentsDirectory>
	//*   3    6:ifnonnull       27
			attachmentsDirectory = new File(FacebookSdk.getApplicationContext().getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
	//    4    9:new             #127 <Class File>
	//    5   12:dup             
	//    6   13:invokestatic    #193 <Method Context FacebookSdk.getApplicationContext()>
	//    7   16:invokevirtual   #198 <Method File Context.getCacheDir()>
	//    8   19:ldc1            #200 <String "com.facebook.NativeAppCallAttachmentStore.files">
	//    9   21:invokespecial   #186 <Method void File(File, String)>
	//   10   24:putstatic       #35  <Field File attachmentsDirectory>
		file = attachmentsDirectory;
	//   11   27:getstatic       #35  <Field File attachmentsDirectory>
	//   12   30:astore_0        
		com/facebook/internal/NativeAppCallAttachmentStore;
	//   13   31:ldc1            #2   <Class NativeAppCallAttachmentStore>
		JVM INSTR monitorexit ;
	//   14   33:monitorexit     
		return file;
	//   15   34:aload_0         
	//   16   35:areturn         
		Exception exception;
		exception;
	//   17   36:astore_0        
	//*  18   37:ldc1            #2   <Class NativeAppCallAttachmentStore>
		throw exception;
	//   19   39:monitorexit     
	//   20   40:aload_0         
	//   21   41:athrow          
	}

	static File getAttachmentsDirectoryForCall(UUID uuid, boolean flag)
	{
		File file = attachmentsDirectory;
	//    0    0:getstatic       #35  <Field File attachmentsDirectory>
	//    1    3:astore_2        
		if(file == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       10
			return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
		uuid = ((UUID) (new File(file, uuid.toString())));
	//    6   10:new             #127 <Class File>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #203 <Method String UUID.toString()>
	//   11   19:invokespecial   #186 <Method void File(File, String)>
	//   12   22:astore_0        
		if(flag && !((File) (uuid)).exists())
	//*  13   23:iload_1         
	//*  14   24:ifeq            39
	//*  15   27:aload_0         
	//*  16   28:invokevirtual   #206 <Method boolean File.exists()>
	//*  17   31:ifne            39
			((File) (uuid)).mkdirs();
	//   18   34:aload_0         
	//   19   35:invokevirtual   #173 <Method boolean File.mkdirs()>
	//   20   38:pop             
		return ((File) (uuid));
	//   21   39:aload_0         
	//   22   40:areturn         
	}

	public static File openAttachment(UUID uuid, String s)
		throws FileNotFoundException
	{
		if(!Utility.isNullOrEmpty(s) && uuid != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #214 <Method boolean Utility.isNullOrEmpty(String)>
	//*   2    4:ifne            28
	//*   3    7:aload_0         
	//*   4    8:ifnull          28
		{
			try
			{
				uuid = ((UUID) (getAttachmentFile(uuid, s, false)));
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:iconst_0        
	//    8   14:invokestatic    #75  <Method File getAttachmentFile(UUID, String, boolean)>
	//    9   17:astore_0        
			}
	//*  10   18:aload_0         
	//*  11   19:areturn         
	//*  12   20:new             #210 <Class FileNotFoundException>
	//*  13   23:dup             
	//*  14   24:invokespecial   #215 <Method void FileNotFoundException()>
	//*  15   27:athrow          
	//*  16   28:new             #210 <Class FileNotFoundException>
	//*  17   31:dup             
	//*  18   32:invokespecial   #215 <Method void FileNotFoundException()>
	//*  19   35:athrow          
			// Misplaced declaration of an exception variable
			catch(UUID uuid)
			{
				throw new FileNotFoundException();
			}
			return ((File) (uuid));
		} else
		{
			throw new FileNotFoundException();
		}
	//*  20   36:astore_0        
	//*  21   37:goto            20
	}

	private static void processAttachmentBitmap(Bitmap bitmap, File file)
		throws IOException
	{
		file = ((File) (new FileOutputStream(file)));
	//    0    0:new             #217 <Class FileOutputStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #219 <Method void FileOutputStream(File)>
	//    4    8:astore_1        
		bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, ((java.io.OutputStream) (file)));
	//    5    9:aload_0         
	//    6   10:getstatic       #225 <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.JPEG>
	//    7   13:bipush          100
	//    8   15:aload_1         
	//    9   16:invokevirtual   #231 <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
	//   10   19:pop             
		Utility.closeQuietly(((java.io.Closeable) (file)));
	//   11   20:aload_1         
	//   12   21:invokestatic    #235 <Method void Utility.closeQuietly(java.io.Closeable)>
		return;
	//   13   24:return          
		bitmap;
	//   14   25:astore_0        
		Utility.closeQuietly(((java.io.Closeable) (file)));
	//   15   26:aload_1         
	//   16   27:invokestatic    #235 <Method void Utility.closeQuietly(java.io.Closeable)>
		throw bitmap;
	//   17   30:aload_0         
	//   18   31:athrow          
	}

	private static void processAttachmentFile(Uri uri, boolean flag, File file)
		throws IOException
	{
		file = ((File) (new FileOutputStream(file)));
	//    0    0:new             #217 <Class FileOutputStream>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:invokespecial   #219 <Method void FileOutputStream(File)>
	//    4    8:astore_2        
		if(flag)
			break MISSING_BLOCK_LABEL_28;
	//    5    9:iload_1         
	//    6   10:ifne            28
		uri = ((Uri) (new FileInputStream(uri.getPath())));
	//    7   13:new             #237 <Class FileInputStream>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokevirtual   #242 <Method String Uri.getPath()>
	//   11   21:invokespecial   #245 <Method void FileInputStream(String)>
	//   12   24:astore_0        
		break MISSING_BLOCK_LABEL_39;
	//   13   25:goto            39
		uri = ((Uri) (FacebookSdk.getApplicationContext().getContentResolver().openInputStream(uri)));
	//   14   28:invokestatic    #193 <Method Context FacebookSdk.getApplicationContext()>
	//   15   31:invokevirtual   #249 <Method ContentResolver Context.getContentResolver()>
	//   16   34:aload_0         
	//   17   35:invokevirtual   #255 <Method java.io.InputStream ContentResolver.openInputStream(Uri)>
	//   18   38:astore_0        
		Utility.copyAndCloseInputStream(((java.io.InputStream) (uri)), ((java.io.OutputStream) (file)));
	//   19   39:aload_0         
	//   20   40:aload_2         
	//   21   41:invokestatic    #259 <Method int Utility.copyAndCloseInputStream(java.io.InputStream, java.io.OutputStream)>
	//   22   44:pop             
		Utility.closeQuietly(((java.io.Closeable) (file)));
	//   23   45:aload_2         
	//   24   46:invokestatic    #235 <Method void Utility.closeQuietly(java.io.Closeable)>
		return;
	//   25   49:return          
		uri;
	//   26   50:astore_0        
		Utility.closeQuietly(((java.io.Closeable) (file)));
	//   27   51:aload_2         
	//   28   52:invokestatic    #235 <Method void Utility.closeQuietly(java.io.Closeable)>
		throw uri;
	//   29   55:aload_0         
	//   30   56:athrow          
	}

	private static final String TAG = "com.facebook.internal.NativeAppCallAttachmentStore";
	private static File attachmentsDirectory;

	static 
	{
	//    0    0:return          
	}
}
