// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.data.mediastore;

import android.net.Uri;
import java.util.List;

public final class MediaStoreUtil
{

	public static boolean isMediaStoreImageUri(Uri uri)
	{
		return isMediaStoreUri(uri) && !isVideoUri(uri);
	//    0    0:aload_0         
	//    1    1:invokestatic    #9   <Method boolean isMediaStoreUri(Uri)>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:invokestatic    #12  <Method boolean isVideoUri(Uri)>
	//    5   11:ifne            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public static boolean isMediaStoreUri(Uri uri)
	{
		return uri != null && "content".equals(((Object) (uri.getScheme()))) && "media".equals(((Object) (uri.getAuthority())));
	//    0    0:aload_0         
	//    1    1:ifnull          30
	//    2    4:ldc1            #15  <String "content">
	//    3    6:aload_0         
	//    4    7:invokevirtual   #21  <Method String Uri.getScheme()>
	//    5   10:invokevirtual   #27  <Method boolean String.equals(Object)>
	//    6   13:ifeq            30
	//    7   16:ldc1            #29  <String "media">
	//    8   18:aload_0         
	//    9   19:invokevirtual   #32  <Method String Uri.getAuthority()>
	//   10   22:invokevirtual   #27  <Method boolean String.equals(Object)>
	//   11   25:ifeq            30
	//   12   28:iconst_1        
	//   13   29:ireturn         
	//   14   30:iconst_0        
	//   15   31:ireturn         
	}

	public static boolean isMediaStoreVideoUri(Uri uri)
	{
		return isMediaStoreUri(uri) && isVideoUri(uri);
	//    0    0:aload_0         
	//    1    1:invokestatic    #9   <Method boolean isMediaStoreUri(Uri)>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:invokestatic    #12  <Method boolean isVideoUri(Uri)>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public static boolean isThumbnailSize(int i, int j)
	{
		return i != 0x80000000 && j != 0x80000000 && i <= 512 && j <= 384;
	//    0    0:iload_0         
	//    1    1:ldc1            #36  <Int 0x80000000>
	//    2    3:icmpeq          28
	//    3    6:iload_1         
	//    4    7:ldc1            #36  <Int 0x80000000>
	//    5    9:icmpeq          28
	//    6   12:iload_0         
	//    7   13:sipush          512
	//    8   16:icmpgt          28
	//    9   19:iload_1         
	//   10   20:sipush          384
	//   11   23:icmpgt          28
	//   12   26:iconst_1        
	//   13   27:ireturn         
	//   14   28:iconst_0        
	//   15   29:ireturn         
	}

	private static boolean isVideoUri(Uri uri)
	{
		return uri.getPathSegments().contains("video");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method List Uri.getPathSegments()>
	//    2    4:ldc1            #42  <String "video">
	//    3    6:invokeinterface #47  <Method boolean List.contains(Object)>
	//    4   11:ireturn         
	}
}
