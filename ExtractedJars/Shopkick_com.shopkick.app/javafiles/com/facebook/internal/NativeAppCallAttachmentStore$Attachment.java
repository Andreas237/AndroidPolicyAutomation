// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.*;
import java.util.UUID;

// Referenced classes of package com.facebook.internal:
//			NativeAppCallAttachmentStore, Utility

public static final class NativeAppCallAttachmentStore$Attachment
{

	public String getAttachmentUrl()
	{
		return attachmentUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field String attachmentUrl>
	//    2    4:areturn         
	}

	public Uri getOriginalUri()
	{
		return originalUri;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Uri originalUri>
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
	static boolean access$100(NativeAppCallAttachmentStore$Attachment nativeappcallattachmentstore$attachment)
	{
		return nativeappcallattachmentstore$attachment.shouldCreateFile;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field boolean shouldCreateFile>
	//    2    4:ireturn         
	}

*/


/*
	static UUID access$200(NativeAppCallAttachmentStore$Attachment nativeappcallattachmentstore$attachment)
	{
		return nativeappcallattachmentstore$attachment.callId;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field UUID callId>
	//    2    4:areturn         
	}

*/


/*
	static String access$300(NativeAppCallAttachmentStore$Attachment nativeappcallattachmentstore$attachment)
	{
		return nativeappcallattachmentstore$attachment.attachmentName;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field String attachmentName>
	//    2    4:areturn         
	}

*/


/*
	static Bitmap access$400(NativeAppCallAttachmentStore$Attachment nativeappcallattachmentstore$attachment)
	{
		return nativeappcallattachmentstore$attachment.bitmap;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Bitmap bitmap>
	//    2    4:areturn         
	}

*/


/*
	static Uri access$500(NativeAppCallAttachmentStore$Attachment nativeappcallattachmentstore$attachment)
	{
		return nativeappcallattachmentstore$attachment.originalUri;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Uri originalUri>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$600(NativeAppCallAttachmentStore$Attachment nativeappcallattachmentstore$attachment)
	{
		return nativeappcallattachmentstore$attachment.isContentUri;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field boolean isContentUri>
	//    2    4:ireturn         
	}

*/

	private NativeAppCallAttachmentStore$Attachment(UUID uuid, Bitmap bitmap1, Uri uri)
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

	NativeAppCallAttachmentStore$Attachment(UUID uuid, Bitmap bitmap1, Uri uri, NativeAppCallAttachmentStore._cls1 _pcls1)
	{
		this(uuid, bitmap1, uri);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #110 <Method void NativeAppCallAttachmentStore$Attachment(UUID, Bitmap, Uri)>
	//    5    7:return          
	}
}
