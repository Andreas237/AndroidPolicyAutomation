// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Referenced classes of package android.arch.lifecycle:
//			ViewModelStoreOwner, ViewModelStore, ViewModel, AndroidViewModel

public class ViewModelProvider
{
	public static class AndroidViewModelFactory extends NewInstanceFactory
	{

		public static AndroidViewModelFactory getInstance(Application application)
		{
			if(sInstance == null)
		//*   0    0:getstatic       #25  <Field ViewModelProvider$AndroidViewModelFactory sInstance>
		//*   1    3:ifnonnull       17
				sInstance = new AndroidViewModelFactory(application);
		//    2    6:new             #2   <Class ViewModelProvider$AndroidViewModelFactory>
		//    3    9:dup             
		//    4   10:aload_0         
		//    5   11:invokespecial   #27  <Method void ViewModelProvider$AndroidViewModelFactory(Application)>
		//    6   14:putstatic       #25  <Field ViewModelProvider$AndroidViewModelFactory sInstance>
			return sInstance;
		//    7   17:getstatic       #25  <Field ViewModelProvider$AndroidViewModelFactory sInstance>
		//    8   20:areturn         
		}

		public ViewModel create(Class class1)
		{
			if(((Class) (android/arch/lifecycle/AndroidViewModel)).isAssignableFrom(class1))
		//*   0    0:ldc1            #40  <Class AndroidViewModel>
		//*   1    2:aload_1         
		//*   2    3:invokevirtual   #46  <Method boolean Class.isAssignableFrom(Class)>
		//*   3    6:ifeq            182
			{
				ViewModel viewmodel;
				try
				{
					viewmodel = (ViewModel)class1.getConstructor(new Class[] {
						android/app/Application
					}).newInstance(new Object[] {
						mApplication
					});
		//    4    9:aload_1         
		//    5   10:iconst_1        
		//    6   11:anewarray       Class[]
		//    7   14:dup             
		//    8   15:iconst_0        
		//    9   16:ldc1            #48  <Class Application>
		//   10   18:aastore         
		//   11   19:invokevirtual   #52  <Method Constructor Class.getConstructor(Class[])>
		//   12   22:iconst_1        
		//   13   23:anewarray       Object[]
		//   14   26:dup             
		//   15   27:iconst_0        
		//   16   28:aload_0         
		//   17   29:getfield        #19  <Field Application mApplication>
		//   18   32:aastore         
		//   19   33:invokevirtual   #60  <Method Object Constructor.newInstance(Object[])>
		//   20   36:checkcast       #62  <Class ViewModel>
		//   21   39:astore_2        
				}
		//*  22   40:aload_2         
		//*  23   41:areturn         
		//*  24   42:astore_2        
		//*  25   43:new             #64  <Class StringBuilder>
		//*  26   46:dup             
		//*  27   47:invokespecial   #65  <Method void StringBuilder()>
		//*  28   50:astore_3        
		//*  29   51:aload_3         
		//*  30   52:ldc1            #67  <String "Cannot create an instance of ">
		//*  31   54:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//*  32   57:pop             
		//*  33   58:aload_3         
		//*  34   59:aload_1         
		//*  35   60:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//*  36   63:pop             
		//*  37   64:new             #76  <Class RuntimeException>
		//*  38   67:dup             
		//*  39   68:aload_3         
		//*  40   69:invokevirtual   #80  <Method String StringBuilder.toString()>
		//*  41   72:aload_2         
		//*  42   73:invokespecial   #83  <Method void RuntimeException(String, Throwable)>
		//*  43   76:athrow          
		//*  44   77:astore_2        
		//*  45   78:new             #64  <Class StringBuilder>
		//*  46   81:dup             
		//*  47   82:invokespecial   #65  <Method void StringBuilder()>
		//*  48   85:astore_3        
		//*  49   86:aload_3         
		//*  50   87:ldc1            #67  <String "Cannot create an instance of ">
		//*  51   89:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//*  52   92:pop             
		//*  53   93:aload_3         
		//*  54   94:aload_1         
		//*  55   95:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//*  56   98:pop             
		//*  57   99:new             #76  <Class RuntimeException>
		//*  58  102:dup             
		//*  59  103:aload_3         
		//*  60  104:invokevirtual   #80  <Method String StringBuilder.toString()>
		//*  61  107:aload_2         
		//*  62  108:invokespecial   #83  <Method void RuntimeException(String, Throwable)>
		//*  63  111:athrow          
		//*  64  112:astore_2        
		//*  65  113:new             #64  <Class StringBuilder>
		//*  66  116:dup             
		//*  67  117:invokespecial   #65  <Method void StringBuilder()>
		//*  68  120:astore_3        
		//*  69  121:aload_3         
		//*  70  122:ldc1            #67  <String "Cannot create an instance of ">
		//*  71  124:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//*  72  127:pop             
		//*  73  128:aload_3         
		//*  74  129:aload_1         
		//*  75  130:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//*  76  133:pop             
		//*  77  134:new             #76  <Class RuntimeException>
		//*  78  137:dup             
		//*  79  138:aload_3         
		//*  80  139:invokevirtual   #80  <Method String StringBuilder.toString()>
		//*  81  142:aload_2         
		//*  82  143:invokespecial   #83  <Method void RuntimeException(String, Throwable)>
		//*  83  146:athrow          
				catch(NoSuchMethodException nosuchmethodexception)
		//*  84  147:astore_2        
				{
					StringBuilder stringbuilder3 = new StringBuilder();
		//   85  148:new             #64  <Class StringBuilder>
		//   86  151:dup             
		//   87  152:invokespecial   #65  <Method void StringBuilder()>
		//   88  155:astore_3        
					stringbuilder3.append("Cannot create an instance of ");
		//   89  156:aload_3         
		//   90  157:ldc1            #67  <String "Cannot create an instance of ">
		//   91  159:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   92  162:pop             
					stringbuilder3.append(((Object) (class1)));
		//   93  163:aload_3         
		//   94  164:aload_1         
		//   95  165:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//   96  168:pop             
					throw new RuntimeException(stringbuilder3.toString(), ((Throwable) (nosuchmethodexception)));
		//   97  169:new             #76  <Class RuntimeException>
		//   98  172:dup             
		//   99  173:aload_3         
		//  100  174:invokevirtual   #80  <Method String StringBuilder.toString()>
		//  101  177:aload_2         
		//  102  178:invokespecial   #83  <Method void RuntimeException(String, Throwable)>
		//  103  181:athrow          
				}
				catch(IllegalAccessException illegalaccessexception)
				{
					StringBuilder stringbuilder2 = new StringBuilder();
					stringbuilder2.append("Cannot create an instance of ");
					stringbuilder2.append(((Object) (class1)));
					throw new RuntimeException(stringbuilder2.toString(), ((Throwable) (illegalaccessexception)));
				}
				catch(InstantiationException instantiationexception)
				{
					StringBuilder stringbuilder1 = new StringBuilder();
					stringbuilder1.append("Cannot create an instance of ");
					stringbuilder1.append(((Object) (class1)));
					throw new RuntimeException(stringbuilder1.toString(), ((Throwable) (instantiationexception)));
				}
				catch(InvocationTargetException invocationtargetexception)
				{
					StringBuilder stringbuilder = new StringBuilder();
					stringbuilder.append("Cannot create an instance of ");
					stringbuilder.append(((Object) (class1)));
					throw new RuntimeException(stringbuilder.toString(), ((Throwable) (invocationtargetexception)));
				}
				return viewmodel;
			} else
			{
				return super.create(class1);
		//  104  182:aload_0         
		//  105  183:aload_1         
		//  106  184:invokespecial   #85  <Method ViewModel ViewModelProvider$NewInstanceFactory.create(Class)>
		//  107  187:areturn         
			}
		}

		private static AndroidViewModelFactory sInstance;
		private Application mApplication;

		public AndroidViewModelFactory(Application application)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void ViewModelProvider$NewInstanceFactory()>
			mApplication = application;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field Application mApplication>
		//    5    9:return          
		}
	}

	public static interface Factory
	{

		public abstract ViewModel create(Class class1);
	}

	public static class NewInstanceFactory
		implements Factory
	{

		public ViewModel create(Class class1)
		{
			ViewModel viewmodel;
			try
			{
				viewmodel = (ViewModel)class1.newInstance();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #27  <Method Object Class.newInstance()>
		//    2    4:checkcast       #29  <Class ViewModel>
		//    3    7:astore_2        
			}
		//*   4    8:aload_2         
		//*   5    9:areturn         
		//*   6   10:astore_2        
		//*   7   11:new             #31  <Class StringBuilder>
		//*   8   14:dup             
		//*   9   15:invokespecial   #32  <Method void StringBuilder()>
		//*  10   18:astore_3        
		//*  11   19:aload_3         
		//*  12   20:ldc1            #34  <String "Cannot create an instance of ">
		//*  13   22:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
		//*  14   25:pop             
		//*  15   26:aload_3         
		//*  16   27:aload_1         
		//*  17   28:invokevirtual   #41  <Method StringBuilder StringBuilder.append(Object)>
		//*  18   31:pop             
		//*  19   32:new             #43  <Class RuntimeException>
		//*  20   35:dup             
		//*  21   36:aload_3         
		//*  22   37:invokevirtual   #47  <Method String StringBuilder.toString()>
		//*  23   40:aload_2         
		//*  24   41:invokespecial   #50  <Method void RuntimeException(String, Throwable)>
		//*  25   44:athrow          
			catch(InstantiationException instantiationexception)
		//*  26   45:astore_2        
			{
				StringBuilder stringbuilder1 = new StringBuilder();
		//   27   46:new             #31  <Class StringBuilder>
		//   28   49:dup             
		//   29   50:invokespecial   #32  <Method void StringBuilder()>
		//   30   53:astore_3        
				stringbuilder1.append("Cannot create an instance of ");
		//   31   54:aload_3         
		//   32   55:ldc1            #34  <String "Cannot create an instance of ">
		//   33   57:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
		//   34   60:pop             
				stringbuilder1.append(((Object) (class1)));
		//   35   61:aload_3         
		//   36   62:aload_1         
		//   37   63:invokevirtual   #41  <Method StringBuilder StringBuilder.append(Object)>
		//   38   66:pop             
				throw new RuntimeException(stringbuilder1.toString(), ((Throwable) (instantiationexception)));
		//   39   67:new             #43  <Class RuntimeException>
		//   40   70:dup             
		//   41   71:aload_3         
		//   42   72:invokevirtual   #47  <Method String StringBuilder.toString()>
		//   43   75:aload_2         
		//   44   76:invokespecial   #50  <Method void RuntimeException(String, Throwable)>
		//   45   79:athrow          
			}
			catch(IllegalAccessException illegalaccessexception)
			{
				StringBuilder stringbuilder = new StringBuilder();
				stringbuilder.append("Cannot create an instance of ");
				stringbuilder.append(((Object) (class1)));
				throw new RuntimeException(stringbuilder.toString(), ((Throwable) (illegalaccessexception)));
			}
			return viewmodel;
		}

		public NewInstanceFactory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}


	public ViewModelProvider(ViewModelStore viewmodelstore, Factory factory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		mFactory = factory;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #29  <Field ViewModelProvider$Factory mFactory>
		mViewModelStore = viewmodelstore;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #31  <Field ViewModelStore mViewModelStore>
	//    8   14:return          
	}

	public ViewModelProvider(ViewModelStoreOwner viewmodelstoreowner, Factory factory)
	{
		this(viewmodelstoreowner.getViewModelStore(), factory);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #40  <Method ViewModelStore ViewModelStoreOwner.getViewModelStore()>
	//    3    7:aload_2         
	//    4    8:invokespecial   #42  <Method void ViewModelProvider(ViewModelStore, ViewModelProvider$Factory)>
	//    5   11:return          
	}

	public ViewModel get(Class class1)
	{
		String s = class1.getCanonicalName();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #51  <Method String Class.getCanonicalName()>
	//    2    4:astore_2        
		if(s != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          40
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #53  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #54  <Method void StringBuilder()>
	//    8   16:astore_3        
			stringbuilder.append("android.arch.lifecycle.ViewModelProvider.DefaultKey:");
	//    9   17:aload_3         
	//   10   18:ldc1            #56  <String "android.arch.lifecycle.ViewModelProvider.DefaultKey:">
	//   11   20:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
			stringbuilder.append(s);
	//   13   24:aload_3         
	//   14   25:aload_2         
	//   15   26:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   16   29:pop             
			return get(stringbuilder.toString(), class1);
	//   17   30:aload_0         
	//   18   31:aload_3         
	//   19   32:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   20   35:aload_1         
	//   21   36:invokevirtual   #66  <Method ViewModel get(String, Class)>
	//   22   39:areturn         
		} else
		{
			throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
	//   23   40:new             #68  <Class IllegalArgumentException>
	//   24   43:dup             
	//   25   44:ldc1            #70  <String "Local and anonymous classes can not be ViewModels">
	//   26   46:invokespecial   #73  <Method void IllegalArgumentException(String)>
	//   27   49:athrow          
		}
	}

	public ViewModel get(String s, Class class1)
	{
		ViewModel viewmodel = mViewModelStore.get(s);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ViewModelStore mViewModelStore>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #81  <Method ViewModel ViewModelStore.get(String)>
	//    4    8:astore_3        
		if(class1.isInstance(((Object) (viewmodel))))
	//*   5    9:aload_2         
	//*   6   10:aload_3         
	//*   7   11:invokevirtual   #85  <Method boolean Class.isInstance(Object)>
	//*   8   14:ifeq            19
		{
			return viewmodel;
	//    9   17:aload_3         
	//   10   18:areturn         
		} else
		{
			class1 = ((Class) (mFactory.create(class1)));
	//   11   19:aload_0         
	//   12   20:getfield        #29  <Field ViewModelProvider$Factory mFactory>
	//   13   23:aload_2         
	//   14   24:invokeinterface #88  <Method ViewModel ViewModelProvider$Factory.create(Class)>
	//   15   29:astore_2        
			mViewModelStore.put(s, ((ViewModel) (class1)));
	//   16   30:aload_0         
	//   17   31:getfield        #31  <Field ViewModelStore mViewModelStore>
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:invokevirtual   #92  <Method void ViewModelStore.put(String, ViewModel)>
			return ((ViewModel) (class1));
	//   21   39:aload_2         
	//   22   40:areturn         
		}
	}

	private static final String DEFAULT_KEY = "android.arch.lifecycle.ViewModelProvider.DefaultKey";
	private final Factory mFactory;
	private final ViewModelStore mViewModelStore;
}
