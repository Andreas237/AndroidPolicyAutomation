// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			ViewModelProvider, ViewModel

public static class ViewModelProvider$NewInstanceFactory
	implements ViewModelProvider.Factory
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

	public ViewModelProvider$NewInstanceFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
