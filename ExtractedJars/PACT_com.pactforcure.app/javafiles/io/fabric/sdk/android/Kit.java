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
	//    1    1:invokespecial   #25  <Method void Object()>
		initializationTask = new InitializationTask(this);
	//    2    4:aload_0         
	//    3    5:new             #27  <Class InitializationTask>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #30  <Method void InitializationTask(Kit)>
	//    7   13:putfield        #32  <Field InitializationTask initializationTask>
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #36  <Method Class Object.getClass()>
	//   11   21:ldc1            #38  <Class DependsOn>
	//   12   23:invokevirtual   #44  <Method java.lang.annotation.Annotation Class.getAnnotation(Class)>
	//   13   26:checkcast       #38  <Class DependsOn>
	//   14   29:putfield        #46  <Field DependsOn dependsOnAnnotation>
	//   15   32:return          
	}

	public int compareTo(Kit kit)
	{
		if(!containsAnnotatedDependency(kit))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #53  <Method boolean containsAnnotatedDependency(Kit)>
	//*   3    5:ifeq            10
	//*   4    8:iconst_1        
	//*   5    9:ireturn         
		{
			if(kit.containsAnnotatedDependency(this))
	//*   6   10:aload_1         
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #53  <Method boolean containsAnnotatedDependency(Kit)>
	//*   9   15:ifeq            20
				return -1;
	//   10   18:iconst_m1       
	//   11   19:ireturn         
			if(!hasAnnotatedDependency() || kit.hasAnnotatedDependency())
	//*  12   20:aload_0         
	//*  13   21:invokevirtual   #57  <Method boolean hasAnnotatedDependency()>
	//*  14   24:ifeq            34
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #57  <Method boolean hasAnnotatedDependency()>
	//*  17   31:ifeq            8
				return hasAnnotatedDependency() || !kit.hasAnnotatedDependency() ? 0 : -1;
	//   18   34:aload_0         
	//   19   35:invokevirtual   #57  <Method boolean hasAnnotatedDependency()>
	//   20   38:ifne            50
	//   21   41:aload_1         
	//   22   42:invokevirtual   #57  <Method boolean hasAnnotatedDependency()>
	//   23   45:ifeq            50
	//   24   48:iconst_m1       
	//   25   49:ireturn         
	//   26   50:iconst_0        
	//   27   51:ireturn         
		}
		return 1;
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((Kit)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class Kit>
	//    3    5:invokevirtual   #60  <Method int compareTo(Kit)>
	//    4    8:ireturn         
	}

	boolean containsAnnotatedDependency(Kit kit)
	{
		if(hasAnnotatedDependency())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #57  <Method boolean hasAnnotatedDependency()>
	//*   2    4:ifeq            52
		{
			Class aclass[] = dependsOnAnnotation.value();
	//    3    7:aload_0         
	//    4    8:getfield        #46  <Field DependsOn dependsOnAnnotation>
	//    5   11:invokeinterface #64  <Method Class[] DependsOn.value()>
	//    6   16:astore          4
			int j = aclass.length;
	//    7   18:aload           4
	//    8   20:arraylength     
	//    9   21:istore_3        
			for(int i = 0; i < j; i++)
	//*  10   22:iconst_0        
	//*  11   23:istore_2        
	//*  12   24:iload_2         
	//*  13   25:iload_3         
	//*  14   26:icmpge          52
				if(aclass[i].isAssignableFrom(((Object) (kit)).getClass()))
	//*  15   29:aload           4
	//*  16   31:iload_2         
	//*  17   32:aaload          
	//*  18   33:aload_1         
	//*  19   34:invokevirtual   #36  <Method Class Object.getClass()>
	//*  20   37:invokevirtual   #68  <Method boolean Class.isAssignableFrom(Class)>
	//*  21   40:ifeq            45
					return true;
	//   22   43:iconst_1        
	//   23   44:ireturn         

	//   24   45:iload_2         
	//   25   46:iconst_1        
	//   26   47:iadd            
	//   27   48:istore_2        
		}
	//*  28   49:goto            24
		return false;
	//   29   52:iconst_0        
	//   30   53:ireturn         
	}

	protected abstract Object doInBackground();

	public Context getContext()
	{
		return context;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Context context>
	//    2    4:areturn         
	}

	protected Collection getDependencies()
	{
		return initializationTask.getDependencies();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field InitializationTask initializationTask>
	//    2    4:invokevirtual   #78  <Method Collection InitializationTask.getDependencies()>
	//    3    7:areturn         
	}

	public Fabric getFabric()
	{
		return fabric;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Fabric fabric>
	//    2    4:areturn         
	}

	protected IdManager getIdManager()
	{
		return idManager;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field IdManager idManager>
	//    2    4:areturn         
	}

	public abstract String getIdentifier();

	public String getPath()
	{
		return (new StringBuilder()).append(".Fabric").append(File.separator).append(getIdentifier()).toString();
	//    0    0:new             #93  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #94  <Method void StringBuilder()>
	//    3    7:ldc1            #96  <String ".Fabric">
	//    4    9:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:getstatic       #106 <Field String File.separator>
	//    6   15:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//    7   18:aload_0         
	//    8   19:invokevirtual   #108 <Method String getIdentifier()>
	//    9   22:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   10   25:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   11   28:areturn         
	}

	public abstract String getVersion();

	boolean hasAnnotatedDependency()
	{
		return dependsOnAnnotation != null;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field DependsOn dependsOnAnnotation>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	final void initialize()
	{
		initializationTask.executeOnExecutor(fabric.getExecutorService(), ((Object []) (new Void[] {
			(Void)null
		})));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field InitializationTask initializationTask>
	//    2    4:aload_0         
	//    3    5:getfield        #84  <Field Fabric fabric>
	//    4    8:invokevirtual   #119 <Method java.util.concurrent.ExecutorService Fabric.getExecutorService()>
	//    5   11:iconst_1        
	//    6   12:anewarray       Void[]
	//    7   15:dup             
	//    8   16:iconst_0        
	//    9   17:aconst_null     
	//   10   18:checkcast       #121 <Class Void>
	//   11   21:aastore         
	//   12   22:invokevirtual   #125 <Method void InitializationTask.executeOnExecutor(java.util.concurrent.ExecutorService, Object[])>
	//   13   25:return          
	}

	void injectParameters(Context context1, Fabric fabric1, InitializationCallback initializationcallback, IdManager idmanager)
	{
		fabric = fabric1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #84  <Field Fabric fabric>
		context = ((Context) (new FabricContext(context1, getIdentifier(), getPath())));
	//    3    5:aload_0         
	//    4    6:new             #129 <Class FabricContext>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #108 <Method String getIdentifier()>
	//    9   15:aload_0         
	//   10   16:invokevirtual   #131 <Method String getPath()>
	//   11   19:invokespecial   #134 <Method void FabricContext(Context, String, String)>
	//   12   22:putfield        #74  <Field Context context>
		initializationCallback = initializationcallback;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #136 <Field InitializationCallback initializationCallback>
		idManager = idmanager;
	//   16   30:aload_0         
	//   17   31:aload           4
	//   18   33:putfield        #88  <Field IdManager idManager>
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
	final DependsOn dependsOnAnnotation = (DependsOn)((Object)this).getClass().getAnnotation(io/fabric/sdk/android/services/concurrency/DependsOn);
	Fabric fabric;
	IdManager idManager;
	InitializationCallback initializationCallback;
	InitializationTask initializationTask;
}
