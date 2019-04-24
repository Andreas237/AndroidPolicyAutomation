// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.view:
//			SupportMenuInflater

private static class SupportMenuInflater$InflatedOnMenuItemClickListener
	implements android.view.MenuItem.OnMenuItemClickListener
{

	public boolean onMenuItemClick(MenuItem menuitem)
	{
		try
		{
			if(mMethod.getReturnType() == Boolean.TYPE)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field Method mMethod>
	//*   2    4:invokevirtual   #77  <Method Class Method.getReturnType()>
	//*   3    7:getstatic       #83  <Field Class Boolean.TYPE>
	//*   4   10:if_acmpne       39
				return ((Boolean)mMethod.invoke(mRealOwner, new Object[] {
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
	//   18   38:ireturn         
			mMethod.invoke(mRealOwner, new Object[] {
				menuitem
			});
	//   19   39:aload_0         
	//   20   40:getfield        #43  <Field Method mMethod>
	//   21   43:aload_0         
	//   22   44:getfield        #33  <Field Object mRealOwner>
	//   23   47:iconst_1        
	//   24   48:anewarray       Object[]
	//   25   51:dup             
	//   26   52:iconst_0        
	//   27   53:aload_1         
	//   28   54:aastore         
	//   29   55:invokevirtual   #87  <Method Object Method.invoke(Object, Object[])>
	//   30   58:pop             
		}
	//*  31   59:iconst_1        
	//*  32   60:ireturn         
		// Misplaced declaration of an exception variable
		catch(MenuItem menuitem)
	//*  33   61:astore_1        
		{
			throw new RuntimeException(((Throwable) (menuitem)));
	//   34   62:new             #93  <Class RuntimeException>
	//   35   65:dup             
	//   36   66:aload_1         
	//   37   67:invokespecial   #96  <Method void RuntimeException(Throwable)>
	//   38   70:athrow          
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
			StringBuilder stringbuilder = new StringBuilder();
	//   16   28:new             #45  <Class StringBuilder>
	//   17   31:dup             
	//   18   32:invokespecial   #46  <Method void StringBuilder()>
	//   19   35:astore          4
			stringbuilder.append("Couldn't resolve menu item onClick handler ");
	//   20   37:aload           4
	//   21   39:ldc1            #48  <String "Couldn't resolve menu item onClick handler ">
	//   22   41:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			stringbuilder.append(s);
	//   24   45:aload           4
	//   25   47:aload_2         
	//   26   48:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
			stringbuilder.append(" in class ");
	//   28   52:aload           4
	//   29   54:ldc1            #54  <String " in class ">
	//   30   56:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   31   59:pop             
			stringbuilder.append(class1.getName());
	//   32   60:aload           4
	//   33   62:aload_3         
	//   34   63:invokevirtual   #58  <Method String Class.getName()>
	//   35   66:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   36   69:pop             
			s = ((String) (new InflateException(stringbuilder.toString())));
	//   37   70:new             #60  <Class InflateException>
	//   38   73:dup             
	//   39   74:aload           4
	//   40   76:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   41   79:invokespecial   #66  <Method void InflateException(String)>
	//   42   82:astore_2        
			((InflateException) (s)).initCause(((Throwable) (obj)));
	//   43   83:aload_2         
	//   44   84:aload_1         
	//   45   85:invokevirtual   #70  <Method Throwable InflateException.initCause(Throwable)>
	//   46   88:pop             
			throw s;
	//   47   89:aload_2         
	//   48   90:athrow          
		}
	}
}
