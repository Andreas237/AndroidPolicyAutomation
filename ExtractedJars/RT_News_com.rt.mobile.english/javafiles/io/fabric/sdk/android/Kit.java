// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android;

import android.content.Context;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.DependsOn;
import java.io.File;
import java.util.Collection;

// Referenced classes of package io.fabric.sdk.android:
//			InitializationTask, Fabric, FabricContext, InitializationCallback

public abstract class Kit
	implements Comparable
{

	public Kit()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		initializationTask = new InitializationTask(this);
	//    2    4:aload_0         
	//    3    5:new             #25  <Class InitializationTask>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #28  <Method void InitializationTask(Kit)>
	//    7   13:putfield        #30  <Field InitializationTask initializationTask>
	//    8   16:return          
	}

	public int compareTo(Kit kit)
	{
		if(containsAnnotatedDependency(kit))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #37  <Method boolean containsAnnotatedDependency(Kit)>
	//*   3    5:ifeq            10
			return 1;
	//    4    8:iconst_1        
	//    5    9:ireturn         
		if(kit.containsAnnotatedDependency(this))
	//*   6   10:aload_1         
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #37  <Method boolean containsAnnotatedDependency(Kit)>
	//*   9   15:ifeq            20
			return -1;
	//   10   18:iconst_m1       
	//   11   19:ireturn         
		if(hasAnnotatedDependency() && !kit.hasAnnotatedDependency())
	//*  12   20:aload_0         
	//*  13   21:invokevirtual   #41  <Method boolean hasAnnotatedDependency()>
	//*  14   24:ifeq            36
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #41  <Method boolean hasAnnotatedDependency()>
	//*  17   31:ifne            36
			return 1;
	//   18   34:iconst_1        
	//   19   35:ireturn         
		return hasAnnotatedDependency() || !kit.hasAnnotatedDependency() ? 0 : -1;
	//   20   36:aload_0         
	//   21   37:invokevirtual   #41  <Method boolean hasAnnotatedDependency()>
	//   22   40:ifne            52
	//   23   43:aload_1         
	//   24   44:invokevirtual   #41  <Method boolean hasAnnotatedDependency()>
	//   25   47:ifeq            52
	//   26   50:iconst_m1       
	//   27   51:ireturn         
	//   28   52:iconst_0        
	//   29   53:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((Kit)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class Kit>
	//    3    5:invokevirtual   #44  <Method int compareTo(Kit)>
	//    4    8:ireturn         
	}

	boolean containsAnnotatedDependency(Kit kit)
	{
		DependsOn dependson = (DependsOn)((Object)this).getClass().getAnnotation(io/fabric/sdk/android/services/concurrency/DependsOn);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method Class Object.getClass()>
	//    2    4:ldc1            #50  <Class DependsOn>
	//    3    6:invokevirtual   #56  <Method java.lang.annotation.Annotation Class.getAnnotation(Class)>
	//    4    9:checkcast       #50  <Class DependsOn>
	//    5   12:astore          4
		if(dependson != null)
	//*   6   14:aload           4
	//*   7   16:ifnull          62
		{
			Class aclass[] = dependson.value();
	//    8   19:aload           4
	//    9   21:invokeinterface #60  <Method Class[] DependsOn.value()>
	//   10   26:astore          4
			int j = aclass.length;
	//   11   28:aload           4
	//   12   30:arraylength     
	//   13   31:istore_3        
			for(int i = 0; i < j; i++)
	//*  14   32:iconst_0        
	//*  15   33:istore_2        
	//*  16   34:iload_2         
	//*  17   35:iload_3         
	//*  18   36:icmpge          62
				if(((Object) (aclass[i])).equals(((Object) (((Object) (kit)).getClass()))))
	//*  19   39:aload           4
	//*  20   41:iload_2         
	//*  21   42:aaload          
	//*  22   43:aload_1         
	//*  23   44:invokevirtual   #48  <Method Class Object.getClass()>
	//*  24   47:invokevirtual   #64  <Method boolean Object.equals(Object)>
	//*  25   50:ifeq            55
					return true;
	//   26   53:iconst_1        
	//   27   54:ireturn         

	//   28   55:iload_2         
	//   29   56:iconst_1        
	//   30   57:iadd            
	//   31   58:istore_2        
		}
	//*  32   59:goto            34
		return false;
	//   33   62:iconst_0        
	//   34   63:ireturn         
	}

	protected abstract Object doInBackground();

	public Context getContext()
	{
		return context;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field Context context>
	//    2    4:areturn         
	}

	protected Collection getDependencies()
	{
		return initializationTask.getDependencies();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field InitializationTask initializationTask>
	//    2    4:invokevirtual   #74  <Method Collection InitializationTask.getDependencies()>
	//    3    7:areturn         
	}

	public Fabric getFabric()
	{
		return fabric;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Fabric fabric>
	//    2    4:areturn         
	}

	protected IdManager getIdManager()
	{
		return idManager;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field IdManager idManager>
	//    2    4:areturn         
	}

	public abstract String getIdentifier();

	public String getPath()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #89  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #90  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(".Fabric");
	//    4    8:aload_1         
	//    5    9:ldc1            #92  <String ".Fabric">
	//    6   11:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(File.separator);
	//    8   15:aload_1         
	//    9   16:getstatic       #102 <Field String File.separator>
	//   10   19:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		stringbuilder.append(getIdentifier());
	//   12   23:aload_1         
	//   13   24:aload_0         
	//   14   25:invokevirtual   #104 <Method String getIdentifier()>
	//   15   28:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		return stringbuilder.toString();
	//   17   32:aload_1         
	//   18   33:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   19   36:areturn         
	}

	public abstract String getVersion();

	boolean hasAnnotatedDependency()
	{
		return (DependsOn)((Object)this).getClass().getAnnotation(io/fabric/sdk/android/services/concurrency/DependsOn) != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #48  <Method Class Object.getClass()>
	//    2    4:ldc1            #50  <Class DependsOn>
	//    3    6:invokevirtual   #56  <Method java.lang.annotation.Annotation Class.getAnnotation(Class)>
	//    4    9:checkcast       #50  <Class DependsOn>
	//    5   12:ifnull          17
	//    6   15:iconst_1        
	//    7   16:ireturn         
	//    8   17:iconst_0        
	//    9   18:ireturn         
	}

	final void initialize()
	{
		initializationTask.executeOnExecutor(fabric.getExecutorService(), ((Object []) (new Void[] {
			(Void)null
		})));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field InitializationTask initializationTask>
	//    2    4:aload_0         
	//    3    5:getfield        #80  <Field Fabric fabric>
	//    4    8:invokevirtual   #115 <Method java.util.concurrent.ExecutorService Fabric.getExecutorService()>
	//    5   11:iconst_1        
	//    6   12:anewarray       Void[]
	//    7   15:dup             
	//    8   16:iconst_0        
	//    9   17:aconst_null     
	//   10   18:checkcast       #117 <Class Void>
	//   11   21:aastore         
	//   12   22:invokevirtual   #121 <Method void InitializationTask.executeOnExecutor(java.util.concurrent.ExecutorService, Object[])>
	//   13   25:return          
	}

	void injectParameters(Context context1, Fabric fabric1, InitializationCallback initializationcallback, IdManager idmanager)
	{
		fabric = fabric1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #80  <Field Fabric fabric>
		context = ((Context) (new FabricContext(context1, getIdentifier(), getPath())));
	//    3    5:aload_0         
	//    4    6:new             #125 <Class FabricContext>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #104 <Method String getIdentifier()>
	//    9   15:aload_0         
	//   10   16:invokevirtual   #127 <Method String getPath()>
	//   11   19:invokespecial   #130 <Method void FabricContext(Context, String, String)>
	//   12   22:putfield        #70  <Field Context context>
		initializationCallback = initializationcallback;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #132 <Field InitializationCallback initializationCallback>
		idManager = idmanager;
	//   16   30:aload_0         
	//   17   31:aload           4
	//   18   33:putfield        #84  <Field IdManager idManager>
	//   19   36:return          
	}

	protected void onCancelled(Object obj)
	{
	//    0    0:return          
	}

	protected void onPostExecute(Object obj)
	{
	//    0    0:return          
	}

	protected boolean onPreExecute()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	Context context;
	Fabric fabric;
	IdManager idManager;
	InitializationCallback initializationCallback;
	InitializationTask initializationTask;
}
