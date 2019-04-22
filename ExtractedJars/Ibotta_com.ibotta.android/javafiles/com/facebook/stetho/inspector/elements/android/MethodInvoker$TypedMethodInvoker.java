// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import com.facebook.stetho.common.LogUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			MethodInvoker

private static abstract class MethodInvoker$TypedMethodInvoker
{

	abstract Object convertArgument(String s);

	boolean invoke(Object obj, String s, String s1)
	{
		try
		{
			obj.getClass().getMethod(s, new Class[] {
				mArgType
			}).invoke(obj, new Object[] {
				convertArgument(s1)
			});
	//    0    0:aload_1         
	//    1    1:invokevirtual   #37  <Method Class Object.getClass()>
	//    2    4:aload_2         
	//    3    5:iconst_1        
	//    4    6:anewarray       Class[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:aload_0         
	//    8   12:getfield        #18  <Field Class mArgType>
	//    9   15:aastore         
	//   10   16:invokevirtual   #43  <Method Method Class.getMethod(String, Class[])>
	//   11   19:aload_1         
	//   12   20:iconst_1        
	//   13   21:anewarray       Object[]
	//   14   24:dup             
	//   15   25:iconst_0        
	//   16   26:aload_0         
	//   17   27:aload_3         
	//   18   28:invokevirtual   #45  <Method Object convertArgument(String)>
	//   19   31:aastore         
	//   20   32:invokevirtual   #50  <Method Object Method.invoke(Object, Object[])>
	//   21   35:pop             
		}
	//*  22   36:iconst_1        
	//*  23   37:ireturn         
	//*  24   38:astore_1        
	//*  25   39:new             #52  <Class StringBuilder>
	//*  26   42:dup             
	//*  27   43:invokespecial   #53  <Method void StringBuilder()>
	//*  28   46:astore_2        
	//*  29   47:aload_2         
	//*  30   48:ldc1            #55  <String "IllegalArgumentException: ">
	//*  31   50:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  32   53:pop             
	//*  33   54:aload_2         
	//*  34   55:aload_1         
	//*  35   56:invokevirtual   #63  <Method String IllegalArgumentException.getMessage()>
	//*  36   59:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  37   62:pop             
	//*  38   63:aload_2         
	//*  39   64:invokevirtual   #66  <Method String StringBuilder.toString()>
	//*  40   67:invokestatic    #72  <Method void LogUtil.w(String)>
	//*  41   70:iconst_0        
	//*  42   71:ireturn         
	//*  43   72:astore_1        
	//*  44   73:new             #52  <Class StringBuilder>
	//*  45   76:dup             
	//*  46   77:invokespecial   #53  <Method void StringBuilder()>
	//*  47   80:astore_2        
	//*  48   81:aload_2         
	//*  49   82:ldc1            #74  <String "IllegalAccessException: ">
	//*  50   84:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  51   87:pop             
	//*  52   88:aload_2         
	//*  53   89:aload_1         
	//*  54   90:invokevirtual   #75  <Method String IllegalAccessException.getMessage()>
	//*  55   93:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  56   96:pop             
	//*  57   97:aload_2         
	//*  58   98:invokevirtual   #66  <Method String StringBuilder.toString()>
	//*  59  101:invokestatic    #72  <Method void LogUtil.w(String)>
	//*  60  104:iconst_0        
	//*  61  105:ireturn         
	//*  62  106:astore_1        
	//*  63  107:new             #52  <Class StringBuilder>
	//*  64  110:dup             
	//*  65  111:invokespecial   #53  <Method void StringBuilder()>
	//*  66  114:astore_2        
	//*  67  115:aload_2         
	//*  68  116:ldc1            #77  <String "InvocationTargetException: ">
	//*  69  118:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  70  121:pop             
	//*  71  122:aload_2         
	//*  72  123:aload_1         
	//*  73  124:invokevirtual   #78  <Method String InvocationTargetException.getMessage()>
	//*  74  127:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  75  130:pop             
	//*  76  131:aload_2         
	//*  77  132:invokevirtual   #66  <Method String StringBuilder.toString()>
	//*  78  135:invokestatic    #72  <Method void LogUtil.w(String)>
	//*  79  138:iconst_0        
	//*  80  139:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  81  140:astore_1        
		{
			return false;
	//   82  141:iconst_0        
	//   83  142:ireturn         
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			s = ((String) (new StringBuilder()));
			((StringBuilder) (s)).append("InvocationTargetException: ");
			((StringBuilder) (s)).append(((InvocationTargetException) (obj)).getMessage());
			LogUtil.w(((StringBuilder) (s)).toString());
			return false;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			s = ((String) (new StringBuilder()));
			((StringBuilder) (s)).append("IllegalAccessException: ");
			((StringBuilder) (s)).append(((IllegalAccessException) (obj)).getMessage());
			LogUtil.w(((StringBuilder) (s)).toString());
			return false;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			s = ((String) (new StringBuilder()));
			((StringBuilder) (s)).append("IllegalArgumentException: ");
			((StringBuilder) (s)).append(((IllegalArgumentException) (obj)).getMessage());
			LogUtil.w(((StringBuilder) (s)).toString());
			return false;
		}
		return true;
	}

	private final Class mArgType;

	MethodInvoker$TypedMethodInvoker(Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mArgType = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Class mArgType>
	//    5    9:return          
	}
}
