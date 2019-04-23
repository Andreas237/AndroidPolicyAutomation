// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.internal.b.e;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.common.images:
//			b

public final class ImageManager
{

	static Object a()
	{
		return a;
	//    0    0:getstatic       #29  <Field Object a>
	//    1    3:areturn         
	}

	static Map a(ImageManager imagemanager)
	{
		return imagemanager.h;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Map h>
	//    2    4:areturn         
	}

	static Context b(ImageManager imagemanager)
	{
		return imagemanager.c;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Context c>
	//    2    4:areturn         
	}

	static HashSet b()
	{
		return b;
	//    0    0:getstatic       #34  <Field HashSet b>
	//    1    3:areturn         
	}

	static e c(ImageManager imagemanager)
	{
		return imagemanager.g;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field e g>
	//    2    4:areturn         
	}

	static Map d(ImageManager imagemanager)
	{
		return imagemanager.j;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Map j>
	//    2    4:areturn         
	}

	static Map e(ImageManager imagemanager)
	{
		return imagemanager.i;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Map i>
	//    2    4:areturn         
	}

	static ExecutorService f(ImageManager imagemanager)
	{
		return imagemanager.e;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ExecutorService e>
	//    2    4:areturn         
	}

	static Handler g(ImageManager imagemanager)
	{
		return imagemanager.d;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Handler d>
	//    2    4:areturn         
	}

	static b h(ImageManager imagemanager)
	{
		return imagemanager.f;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field b f>
	//    2    4:areturn         
	}

	private static final Object a = new Object();
	private static HashSet b = new HashSet();
	private final Context c;
	private final Handler d;
	private final ExecutorService e;
	private final b f;
	private final e g;
	private final Map h;
	private final Map i;
	private final Map j;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void Object()>
	//    3    7:putstatic       #29  <Field Object a>
	//    4   10:new             #31  <Class HashSet>
	//    5   13:dup             
	//    6   14:invokespecial   #32  <Method void HashSet()>
	//    7   17:putstatic       #34  <Field HashSet b>
	//*   8   20:return          
	}
}
