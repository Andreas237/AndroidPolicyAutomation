// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;

// Referenced classes of package com.google.android.exoplayer2.upstream.cache:
//			ContentMetadata, ContentMetadataMutations

final class ContentMetadataInternal
{

	private ContentMetadataInternal()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static long getContentLength(ContentMetadata contentmetadata)
	{
		return contentmetadata.get("exo_len", -1L);
	//    0    0:aload_0         
	//    1    1:ldc1            #8   <String "exo_len">
	//    2    3:ldc2w           #22  <Long -1L>
	//    3    6:invokeinterface #29  <Method long ContentMetadata.get(String, long)>
	//    4   11:lreturn         
	}

	public static Uri getRedirectedUri(ContentMetadata contentmetadata)
	{
		contentmetadata = ((ContentMetadata) (contentmetadata.get("exo_redir", (String)null)));
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "exo_redir">
	//    2    3:aconst_null     
	//    3    4:checkcast       #34  <Class String>
	//    4    7:invokeinterface #37  <Method String ContentMetadata.get(String, String)>
	//    5   12:astore_0        
		if(contentmetadata == null)
	//*   6   13:aload_0         
	//*   7   14:ifnonnull       19
			return null;
	//    8   17:aconst_null     
	//    9   18:areturn         
		else
			return Uri.parse(((String) (contentmetadata)));
	//   10   19:aload_0         
	//   11   20:invokestatic    #43  <Method Uri Uri.parse(String)>
	//   12   23:areturn         
	}

	public static void removeContentLength(ContentMetadataMutations contentmetadatamutations)
	{
		contentmetadatamutations.remove("exo_len");
	//    0    0:aload_0         
	//    1    1:ldc1            #8   <String "exo_len">
	//    2    3:invokevirtual   #52  <Method ContentMetadataMutations ContentMetadataMutations.remove(String)>
	//    3    6:pop             
	//    4    7:return          
	}

	public static void removeRedirectedUri(ContentMetadataMutations contentmetadatamutations)
	{
		contentmetadatamutations.remove("exo_redir");
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "exo_redir">
	//    2    3:invokevirtual   #52  <Method ContentMetadataMutations ContentMetadataMutations.remove(String)>
	//    3    6:pop             
	//    4    7:return          
	}

	public static void setContentLength(ContentMetadataMutations contentmetadatamutations, long l)
	{
		contentmetadatamutations.set("exo_len", l);
	//    0    0:aload_0         
	//    1    1:ldc1            #8   <String "exo_len">
	//    2    3:lload_1         
	//    3    4:invokevirtual   #59  <Method ContentMetadataMutations ContentMetadataMutations.set(String, long)>
	//    4    7:pop             
	//    5    8:return          
	}

	public static void setRedirectedUri(ContentMetadataMutations contentmetadatamutations, Uri uri)
	{
		contentmetadatamutations.set("exo_redir", uri.toString());
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "exo_redir">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #65  <Method String Uri.toString()>
	//    4    7:invokevirtual   #68  <Method ContentMetadataMutations ContentMetadataMutations.set(String, String)>
	//    5   10:pop             
	//    6   11:return          
	}

	private static final String METADATA_NAME_CONTENT_LENGTH = "exo_len";
	private static final String METADATA_NAME_REDIRECTED_URI = "exo_redir";
	private static final String PREFIX = "exo_";
}
