// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.content.res;

import android.content.res.ColorStateList;
import android.content.res.Configuration;

class AppCompatResources$ColorStateListCacheEntry
{

	final Configuration configuration;
	final ColorStateList value;

	AppCompatResources$ColorStateListCacheEntry(ColorStateList colorstatelist, Configuration configuration1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		value = colorstatelist;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field ColorStateList value>
		configuration = configuration1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field Configuration configuration>
	//    8   14:return          
	}
}
