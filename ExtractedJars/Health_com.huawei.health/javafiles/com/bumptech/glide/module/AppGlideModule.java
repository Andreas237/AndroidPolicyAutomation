// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.module;

import android.content.Context;
import com.bumptech.glide.GlideBuilder;

// Referenced classes of package com.bumptech.glide.module:
//			LibraryGlideModule, AppliesOptions

public abstract class AppGlideModule extends LibraryGlideModule
	implements AppliesOptions
{

	public AppGlideModule()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void LibraryGlideModule()>
	//    2    4:return          
	}

	public void applyOptions(Context context, GlideBuilder glidebuilder)
	{
	//    0    0:return          
	}

	public boolean isManifestParsingEnabled()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}
}
