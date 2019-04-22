// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			ViewModelStore, ViewModel

public class ViewModelProvider
{
	public static interface Factory
	{

		public abstract ViewModel create(Class class1);
	}


	public ViewModelProvider(ViewModelStore viewmodelstore, Factory factory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mFactory = factory;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #19  <Field ViewModelProvider$Factory mFactory>
		mViewModelStore = viewmodelstore;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #21  <Field ViewModelStore mViewModelStore>
	//    8   14:return          
	}

	public ViewModel get(Class class1)
	{
		String s = class1.getCanonicalName();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #32  <Method String Class.getCanonicalName()>
	//    2    4:astore_2        
		if(s != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          40
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #34  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #35  <Method void StringBuilder()>
	//    8   16:astore_3        
			stringbuilder.append("android.arch.lifecycle.ViewModelProvider.DefaultKey:");
	//    9   17:aload_3         
	//   10   18:ldc1            #37  <String "android.arch.lifecycle.ViewModelProvider.DefaultKey:">
	//   11   20:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
			stringbuilder.append(s);
	//   13   24:aload_3         
	//   14   25:aload_2         
	//   15   26:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   16   29:pop             
			return get(stringbuilder.toString(), class1);
	//   17   30:aload_0         
	//   18   31:aload_3         
	//   19   32:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   20   35:aload_1         
	//   21   36:invokevirtual   #47  <Method ViewModel get(String, Class)>
	//   22   39:areturn         
		} else
		{
			throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
	//   23   40:new             #49  <Class IllegalArgumentException>
	//   24   43:dup             
	//   25   44:ldc1            #51  <String "Local and anonymous classes can not be ViewModels">
	//   26   46:invokespecial   #54  <Method void IllegalArgumentException(String)>
	//   27   49:athrow          
		}
	}

	public ViewModel get(String s, Class class1)
	{
		ViewModel viewmodel = mViewModelStore.get(s);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ViewModelStore mViewModelStore>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #62  <Method ViewModel ViewModelStore.get(String)>
	//    4    8:astore_3        
		if(class1.isInstance(((Object) (viewmodel))))
	//*   5    9:aload_2         
	//*   6   10:aload_3         
	//*   7   11:invokevirtual   #66  <Method boolean Class.isInstance(Object)>
	//*   8   14:ifeq            19
		{
			return viewmodel;
	//    9   17:aload_3         
	//   10   18:areturn         
		} else
		{
			class1 = ((Class) (mFactory.create(class1)));
	//   11   19:aload_0         
	//   12   20:getfield        #19  <Field ViewModelProvider$Factory mFactory>
	//   13   23:aload_2         
	//   14   24:invokeinterface #69  <Method ViewModel ViewModelProvider$Factory.create(Class)>
	//   15   29:astore_2        
			mViewModelStore.put(s, ((ViewModel) (class1)));
	//   16   30:aload_0         
	//   17   31:getfield        #21  <Field ViewModelStore mViewModelStore>
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:invokevirtual   #73  <Method void ViewModelStore.put(String, ViewModel)>
			return ((ViewModel) (class1));
	//   21   39:aload_2         
	//   22   40:areturn         
		}
	}

	private final Factory mFactory;
	private final ViewModelStore mViewModelStore;
}
