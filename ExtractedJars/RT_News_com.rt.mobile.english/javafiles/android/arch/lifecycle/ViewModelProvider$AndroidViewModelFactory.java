// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Referenced classes of package android.arch.lifecycle:
//			ViewModelProvider, AndroidViewModel, ViewModel

public static class ViewModelProvider$AndroidViewModelFactory extends ViewModelProvider.NewInstanceFactory
{

	public static ViewModelProvider$AndroidViewModelFactory getInstance(Application application)
	{
		if(sInstance == null)
	//*   0    0:getstatic       #25  <Field ViewModelProvider$AndroidViewModelFactory sInstance>
	//*   1    3:ifnonnull       17
			sInstance = new ViewModelProvider$AndroidViewModelFactory(application);
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
	//*   0    0:ldc1            #39  <Class AndroidViewModel>
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #45  <Method boolean Class.isAssignableFrom(Class)>
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
	//    9   16:ldc1            #47  <Class Application>
	//   10   18:aastore         
	//   11   19:invokevirtual   #51  <Method Constructor Class.getConstructor(Class[])>
	//   12   22:iconst_1        
	//   13   23:anewarray       Object[]
	//   14   26:dup             
	//   15   27:iconst_0        
	//   16   28:aload_0         
	//   17   29:getfield        #19  <Field Application mApplication>
	//   18   32:aastore         
	//   19   33:invokevirtual   #59  <Method Object Constructor.newInstance(Object[])>
	//   20   36:checkcast       #61  <Class ViewModel>
	//   21   39:astore_2        
			}
	//*  22   40:aload_2         
	//*  23   41:areturn         
	//*  24   42:astore_2        
	//*  25   43:new             #63  <Class StringBuilder>
	//*  26   46:dup             
	//*  27   47:invokespecial   #64  <Method void StringBuilder()>
	//*  28   50:astore_3        
	//*  29   51:aload_3         
	//*  30   52:ldc1            #66  <String "Cannot create an instance of ">
	//*  31   54:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//*  32   57:pop             
	//*  33   58:aload_3         
	//*  34   59:aload_1         
	//*  35   60:invokevirtual   #73  <Method StringBuilder StringBuilder.append(Object)>
	//*  36   63:pop             
	//*  37   64:new             #75  <Class RuntimeException>
	//*  38   67:dup             
	//*  39   68:aload_3         
	//*  40   69:invokevirtual   #79  <Method String StringBuilder.toString()>
	//*  41   72:aload_2         
	//*  42   73:invokespecial   #82  <Method void RuntimeException(String, Throwable)>
	//*  43   76:athrow          
	//*  44   77:astore_2        
	//*  45   78:new             #63  <Class StringBuilder>
	//*  46   81:dup             
	//*  47   82:invokespecial   #64  <Method void StringBuilder()>
	//*  48   85:astore_3        
	//*  49   86:aload_3         
	//*  50   87:ldc1            #66  <String "Cannot create an instance of ">
	//*  51   89:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//*  52   92:pop             
	//*  53   93:aload_3         
	//*  54   94:aload_1         
	//*  55   95:invokevirtual   #73  <Method StringBuilder StringBuilder.append(Object)>
	//*  56   98:pop             
	//*  57   99:new             #75  <Class RuntimeException>
	//*  58  102:dup             
	//*  59  103:aload_3         
	//*  60  104:invokevirtual   #79  <Method String StringBuilder.toString()>
	//*  61  107:aload_2         
	//*  62  108:invokespecial   #82  <Method void RuntimeException(String, Throwable)>
	//*  63  111:athrow          
	//*  64  112:astore_2        
	//*  65  113:new             #63  <Class StringBuilder>
	//*  66  116:dup             
	//*  67  117:invokespecial   #64  <Method void StringBuilder()>
	//*  68  120:astore_3        
	//*  69  121:aload_3         
	//*  70  122:ldc1            #66  <String "Cannot create an instance of ">
	//*  71  124:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//*  72  127:pop             
	//*  73  128:aload_3         
	//*  74  129:aload_1         
	//*  75  130:invokevirtual   #73  <Method StringBuilder StringBuilder.append(Object)>
	//*  76  133:pop             
	//*  77  134:new             #75  <Class RuntimeException>
	//*  78  137:dup             
	//*  79  138:aload_3         
	//*  80  139:invokevirtual   #79  <Method String StringBuilder.toString()>
	//*  81  142:aload_2         
	//*  82  143:invokespecial   #82  <Method void RuntimeException(String, Throwable)>
	//*  83  146:athrow          
			catch(NoSuchMethodException nosuchmethodexception)
	//*  84  147:astore_2        
			{
				StringBuilder stringbuilder3 = new StringBuilder();
	//   85  148:new             #63  <Class StringBuilder>
	//   86  151:dup             
	//   87  152:invokespecial   #64  <Method void StringBuilder()>
	//   88  155:astore_3        
				stringbuilder3.append("Cannot create an instance of ");
	//   89  156:aload_3         
	//   90  157:ldc1            #66  <String "Cannot create an instance of ">
	//   91  159:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   92  162:pop             
				stringbuilder3.append(((Object) (class1)));
	//   93  163:aload_3         
	//   94  164:aload_1         
	//   95  165:invokevirtual   #73  <Method StringBuilder StringBuilder.append(Object)>
	//   96  168:pop             
				throw new RuntimeException(stringbuilder3.toString(), ((Throwable) (nosuchmethodexception)));
	//   97  169:new             #75  <Class RuntimeException>
	//   98  172:dup             
	//   99  173:aload_3         
	//  100  174:invokevirtual   #79  <Method String StringBuilder.toString()>
	//  101  177:aload_2         
	//  102  178:invokespecial   #82  <Method void RuntimeException(String, Throwable)>
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
	//  106  184:invokespecial   #84  <Method ViewModel ViewModelProvider$NewInstanceFactory.create(Class)>
	//  107  187:areturn         
		}
	}

	private static ViewModelProvider$AndroidViewModelFactory sInstance;
	private Application mApplication;

	public ViewModelProvider$AndroidViewModelFactory(Application application)
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
