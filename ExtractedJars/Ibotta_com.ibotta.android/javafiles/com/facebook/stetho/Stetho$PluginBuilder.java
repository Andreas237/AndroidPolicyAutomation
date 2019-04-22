// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho;

import java.util.*;

// Referenced classes of package com.facebook.stetho:
//			Stetho

private static class Stetho$PluginBuilder
{

	private void throwIfFinished()
	{
		if(!mFinished)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field boolean mFinished>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		else
			throw new IllegalStateException("Must not continue to build after finish()");
	//    4    8:new             #41  <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:ldc1            #43  <String "Must not continue to build after finish()">
	//    7   14:invokespecial   #46  <Method void IllegalStateException(String)>
	//    8   17:athrow          
	}

	public Iterable finish()
	{
		mFinished = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #39  <Field boolean mFinished>
		return ((Iterable) (mPlugins));
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field ArrayList mPlugins>
	//    5    9:areturn         
	}

	public void provide(String s, Object obj)
	{
		throwIfFinished();
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void throwIfFinished()>
		mPlugins.add(obj);
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field ArrayList mPlugins>
	//    4    8:aload_2         
	//    5    9:invokevirtual   #58  <Method boolean ArrayList.add(Object)>
	//    6   12:pop             
		mProvidedNames.add(((Object) (s)));
	//    7   13:aload_0         
	//    8   14:getfield        #26  <Field Set mProvidedNames>
	//    9   17:aload_1         
	//   10   18:invokeinterface #61  <Method boolean Set.add(Object)>
	//   11   23:pop             
	//   12   24:return          
	}

	public void provideIfDesired(String s, Object obj)
	{
		throwIfFinished();
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void throwIfFinished()>
		if(!mRemovedNames.contains(((Object) (s))) && mProvidedNames.add(((Object) (s))))
	//*   2    4:aload_0         
	//*   3    5:getfield        #28  <Field Set mRemovedNames>
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #66  <Method boolean Set.contains(Object)>
	//*   6   14:ifne            39
	//*   7   17:aload_0         
	//*   8   18:getfield        #26  <Field Set mProvidedNames>
	//*   9   21:aload_1         
	//*  10   22:invokeinterface #61  <Method boolean Set.add(Object)>
	//*  11   27:ifeq            39
			mPlugins.add(obj);
	//   12   30:aload_0         
	//   13   31:getfield        #33  <Field ArrayList mPlugins>
	//   14   34:aload_2         
	//   15   35:invokevirtual   #58  <Method boolean ArrayList.add(Object)>
	//   16   38:pop             
	//   17   39:return          
	}

	public void remove(String s)
	{
		throwIfFinished();
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void throwIfFinished()>
		mRemovedNames.remove(((Object) (s)));
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field Set mRemovedNames>
	//    4    8:aload_1         
	//    5    9:invokeinterface #69  <Method boolean Set.remove(Object)>
	//    6   14:pop             
	//    7   15:return          
	}

	private boolean mFinished;
	private final ArrayList mPlugins;
	private final Set mProvidedNames;
	private final Set mRemovedNames;

	private Stetho$PluginBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mProvidedNames = ((Set) (new HashSet()));
	//    2    4:aload_0         
	//    3    5:new             #23  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void HashSet()>
	//    6   12:putfield        #26  <Field Set mProvidedNames>
		mRemovedNames = ((Set) (new HashSet()));
	//    7   15:aload_0         
	//    8   16:new             #23  <Class HashSet>
	//    9   19:dup             
	//   10   20:invokespecial   #24  <Method void HashSet()>
	//   11   23:putfield        #28  <Field Set mRemovedNames>
		mPlugins = new ArrayList();
	//   12   26:aload_0         
	//   13   27:new             #30  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #31  <Method void ArrayList()>
	//   16   34:putfield        #33  <Field ArrayList mPlugins>
	//   17   37:return          
	}

	Stetho$PluginBuilder(Stetho._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Stetho$PluginBuilder()>
	//    2    4:return          
	}
}
