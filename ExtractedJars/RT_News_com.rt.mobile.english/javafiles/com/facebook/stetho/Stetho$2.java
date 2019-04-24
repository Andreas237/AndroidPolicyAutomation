// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho;

import android.content.Context;
import com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin;
import java.util.ArrayList;

// Referenced classes of package com.facebook.stetho:
//			DumperPluginsProvider, Stetho

static final class Stetho$2
	implements DumperPluginsProvider
{

	public Iterable get()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #25  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void ArrayList()>
	//    3    7:astore_1        
		arraylist.add(((Object) (new SharedPreferencesDumperPlugin(val$context))));
	//    4    8:aload_1         
	//    5    9:new             #28  <Class SharedPreferencesDumperPlugin>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #17  <Field Context val$context>
	//    9   17:invokespecial   #30  <Method void SharedPreferencesDumperPlugin(Context)>
	//   10   20:invokevirtual   #34  <Method boolean ArrayList.add(Object)>
	//   11   23:pop             
		return ((Iterable) (arraylist));
	//   12   24:aload_1         
	//   13   25:areturn         
	}

	final Context val$context;

	Stetho$2(Context context1)
	{
		val$context = context1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Context val$context>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
