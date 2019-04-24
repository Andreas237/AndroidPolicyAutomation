// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import com.bumptech.glide.module.AppGlideModule;
import java.util.Set;

abstract class GeneratedAppGlideModule extends AppGlideModule
{

	GeneratedAppGlideModule()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void AppGlideModule()>
	//    2    4:return          
	}

	abstract Set getExcludedModuleClasses();

	com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory getRequestManagerFactory()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}
}
