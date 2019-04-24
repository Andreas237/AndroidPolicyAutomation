// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.net.Uri;
import com.google.android.exoplayer2.util.Util;

public final class SsUtil
{

	private SsUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Uri fixManifestUri(Uri uri)
	{
		if(Util.toLowerInvariant(uri.getLastPathSegment()).matches("manifest(\\(.+\\))?"))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #17  <Method String Uri.getLastPathSegment()>
	//*   2    4:invokestatic    #23  <Method String Util.toLowerInvariant(String)>
	//*   3    7:ldc1            #25  <String "manifest(\\(.+\\))?">
	//*   4    9:invokevirtual   #31  <Method boolean String.matches(String)>
	//*   5   12:ifeq            17
			return uri;
	//    6   15:aload_0         
	//    7   16:areturn         
		else
			return Uri.withAppendedPath(uri, "Manifest");
	//    8   17:aload_0         
	//    9   18:ldc1            #33  <String "Manifest">
	//   10   20:invokestatic    #37  <Method Uri Uri.withAppendedPath(Uri, String)>
	//   11   23:areturn         
	}
}
