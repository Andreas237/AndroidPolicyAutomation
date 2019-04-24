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
	//*  14   23:ifnull          139
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
	//*  39   76:goto            148
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
	//*  48   96:goto            148
				if(!Utility.isWebUri(uri))
	//*  49   99:aload_3         
	//*  50  100:invokestatic    #64  <Method boolean Utility.isWebUri(Uri)>
	//*  51  103:ifne            148
				{
					uuid = ((UUID) (new StringBuilder()));
	//   52  106:new             #66  <Class StringBuilder>
	//   53  109:dup             
	//   54  110:invokespecial   #67  <Method void StringBuilder()>
	//   55  113:astore_1        
					((StringBuilder) (uuid)).append("Unsupported scheme for media Uri : ");
	//   56  114:aload_1         
	//   57  115:ldc1            #69  <String "Unsupported scheme for media Uri : ">
	//   58  117:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   59  120:pop             
					((StringBuilder) (uuid)).append(((String) (bitmap1)));
	//   60  121:aload_1         
	//   61  122:aload_2         
	//   62  123:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   63  126:pop             
					throw new FacebookException(((StringBuilder) (uuid)).toString());
	//   64  127:new             #75  <Class FacebookException>
	//   65  130:dup             
	//   66  131:aload_1         
	//   67  132:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   68  135:invokespecial   #81  <Method void FacebookException(String)>
	//   69  138:athrow          
				}
			} else
			{
				if(bitmap1 == null)
					break label0;
	//   70  139:aload_2         
	//   71  140:ifnull          208
				shouldCreateFile = true;
	//   72  143:aload_0         
	//   73  144:iconst_1        
	//   74  145:putfield        #56  <Field boolean shouldCreateFile>
			}
			if(!shouldCreateFile)
	//*  75  148:aload_0         
	//*  76  149:getfield        #56  <Field boolean shouldCreateFile>
	//*  77  152:ifne            160
				bitmap1 = null;
	//   78  155:aconst_null     
	//   79  156:astore_2        
			else
	//*  80  157:goto            167
				bitmap1 = ((Bitmap) (UUID.randomUUID().toString()));
	//   81  160:invokestatic    #87  <Method UUID UUID.randomUUID()>
	//   82  163:invokevirtual   #88  <Method String UUID.toString()>
	//   83  166:astore_2        
			attachmentName = ((String) (bitmap1));
	//   84  167:aload_0         
	//   85  168:aload_2         
	//   86  169:putfield        #90  <Field String attachmentName>
			if(!shouldCreateFile)
	//*  87  172:aload_0         
	//*  88  173:getfield        #56  <Field boolean shouldCreateFile>
	//*  89  176:ifne            190
				uuid = ((UUID) (originalUri.toString()));
	//   90  179:aload_0         
	//   91  180:getfield        #30  <Field Uri originalUri>
	//   92  183:invokevirtual   #91  <Method String Uri.toString()>
	//   93  186:astore_1        
			else
	//*  94  187:goto            202
				uuid = ((UUID) (FacebookContentProvider.getAttachmentUrl(FacebookSdk.getApplicationId(), uuid, attachmentName)));
	//   95  190:invokestatic    #96  <Method String FacebookSdk.getApplicationId()>
	//   96  193:aload_1         
	//   97  194:aload_0         
	//   98  195:getfield        #90  <Field String attachmentName>
	//   99  198:invokestatic    #102 <Method String FacebookContentProvider.getAttachmentUrl(String, UUID, String)>
	//  100  201:astore_1        
			attachmentUrl = ((String) (uuid));
	//  101  202:aload_0         
	//  102  203:aload_1         
	//  103  204:putfield        #104 <Field String attachmentUrl>
			return;
	//  104  207:return          
		}
		throw new FacebookException("Cannot share media without a bitmap or Uri set");
	//  105  208:new             #75  <Class FacebookException>
	//  106  211:dup             
	//  107  212:ldc1            #106 <String "Cannot share media without a bitmap or Uri set">
	//  108  214:invokespecial   #81  <Method void FacebookException(String)>
	//  109  217:athrow          
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
