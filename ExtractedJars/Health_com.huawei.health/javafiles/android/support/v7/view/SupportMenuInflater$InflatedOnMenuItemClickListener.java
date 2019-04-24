// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.view:
//			SupportMenuInflater

static class SupportMenuInflater$InflatedOnMenuItemClickListener
	implements android.view.MenuItem.OnMenuItemClickListener
{

	public boolean onMenuItemClick(MenuItem menuitem)
	{
		boolean flag;
		if(mMethod.getReturnType() != Boolean.TYPE)
			break MISSING_BLOCK_LABEL_41;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Method mMethod>
	//    2    4:invokevirtual   #77  <Method Class Method.getReturnType()>
	//    3    7:getstatic       #83  <Field Class Boolean.TYPE>
	//    4   10:if_acmpne       41
		flag = ((Boolean)mMethod.invoke(mRealOwner, new Object[] {
			menuitem
		})).booleanValue();
	//    5   13:aload_0         
	//    6   14:getfield        #43  <Field Method mMethod>
	//    7   17:aload_0         
	//    8   18:getfield        #33  <Field Object mRealOwner>
	//    9   21:iconst_1        
	//   10   22:anewarray       Object[]
	//   11   25:dup             
	//   12   26:iconst_0        
	//   13   27:aload_1         
	//   14   28:aastore         
	//   15   29:invokevirtual   #87  <Method Object Method.invoke(Object, Object[])>
	//   16   32:checkcast       #79  <Class Boolean>
	//   17   35:invokevirtual   #91  <Method boolean Boolean.booleanValue()>
	//   18   38:istore_2        
		return flag;
	//   19   39:iload_2         
	//   20   40:ireturn         
		try
		{
			mMethod.invoke(mRealOwner, new Object[] {
				menuitem
			});
	//   21   41:aload_0         
	//   22   42:getfield        #43  <Field Method mMethod>
	//   23   45:aload_0         
	//   24   46:getfield        #33  <Field Object mRealOwner>
	//   25   49:iconst_1        
	//   26   50:anewarray       Object[]
	//   27   53:dup             
	//   28   54:iconst_0        
	//   29   55:aload_1         
	//   30   56:aastore         
	//   31   57:invokevirtual   #87  <Method Object Method.invoke(Object, Object[])>
	//   32   60:pop             
		}
	//*  33   61:iconst_1        
	//*  34   62:ireturn         
		// Misplaced declaration of an exception variable
		catch(MenuItem menuitem)
	//*  35   63:astore_1        
		{
			throw new RuntimeException(((Throwable) (menuitem)));
	//   36   64:new             #93  <Class RuntimeException>
	//   37   67:dup             
	//   38   68:aload_1         
	//   39   69:invokespecial   #96  <Method void RuntimeException(Throwable)>
	//   40   72:athrow          
		}
		return true;
	}

	private static final Class PARAM_TYPES[] = {
		android/view/MenuItem
	};
	private Method mMethod;
	private Object mRealOwner;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:anewarray       Class[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #22  <Class MenuItem>
	//    5    8:aastore         
	//    6    9:putstatic       #24  <Field Class[] PARAM_TYPES>
	//*   7   12:return          
	}

	public SupportMenuInflater$InflatedOnMenuItemClickListener(Object obj, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		mRealOwner = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field Object mRealOwner>
		Class class1 = obj.getClass();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #37  <Method Class Object.getClass()>
	//    7   13:astore_3        
		try
		{
			mMethod = class1.getMethod(s, PARAM_TYPES);
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:aload_2         
	//   11   17:getstatic       #24  <Field Class[] PARAM_TYPES>
	//   12   20:invokevirtual   #41  <Method Method Class.getMethod(String, Class[])>
	//   13   23:putfield        #43  <Field Method mMethod>
			return;
	//   14   26:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  15   27:astore_1        
		{
			s = ((String) (new InflateException((new StringBuilder()).append("Couldn't resolve menu item onClick handler ").append(s).append(" in class ").append(class1.getName()).toString())));
	//   16   28:new             #45  <Class InflateException>
	//   17   31:dup             
	//   18   32:new             #47  <Class StringBuilder>
	//   19   35:dup             
	//   20   36:invokespecial   #48  <Method void StringBuilder()>
	//   21   39:ldc1            #50  <String "Couldn't resolve menu item onClick handler ">
	//   22   41:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:aload_2         
	//   24   45:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   25   48:ldc1            #56  <String " in class ">
	//   26   50:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   27   53:aload_3         
	//   28   54:invokevirtual   #60  <Method String Class.getName()>
	//   29   57:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   30   60:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   31   63:invokespecial   #66  <Method void InflateException(String)>
	//   32   66:astore_2        
		}
		((InflateException) (s)).initCause(((Throwable) (obj)));
	//   33   67:aload_2         
	//   34   68:aload_1         
	//   35   69:invokevirtual   #70  <Method Throwable InflateException.initCause(Throwable)>
	//   36   72:pop             
		throw s;
	//   37   73:aload_2         
	//   38   74:athrow          
	}
}
