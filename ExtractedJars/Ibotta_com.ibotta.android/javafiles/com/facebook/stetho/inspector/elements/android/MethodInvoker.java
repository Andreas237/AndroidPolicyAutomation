// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.Util;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class MethodInvoker
{
	private static class BooleanMethodInvoker extends TypedMethodInvoker
	{

		Boolean convertArgument(String s)
		{
			return Boolean.valueOf(Boolean.parseBoolean(s));
		//    0    0:aload_1         
		//    1    1:invokestatic    #26  <Method boolean Boolean.parseBoolean(String)>
		//    2    4:invokestatic    #30  <Method Boolean Boolean.valueOf(boolean)>
		//    3    7:areturn         
		}

		volatile Object convertArgument(String s)
		{
			return ((Object) (convertArgument(s)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #33  <Method Boolean convertArgument(String)>
		//    3    5:areturn         
		}

		BooleanMethodInvoker()
		{
			super(Boolean.TYPE);
		//    0    0:aload_0         
		//    1    1:getstatic       #16  <Field Class Boolean.TYPE>
		//    2    4:invokespecial   #19  <Method void MethodInvoker$TypedMethodInvoker(Class)>
		//    3    7:return          
		}
	}

	private static class CharSequenceMethodInvoker extends TypedMethodInvoker
	{

		CharSequence convertArgument(String s)
		{
			return ((CharSequence) (s));
		//    0    0:aload_1         
		//    1    1:areturn         
		}

		volatile Object convertArgument(String s)
		{
			return ((Object) (convertArgument(s)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #21  <Method CharSequence convertArgument(String)>
		//    3    5:areturn         
		}

		CharSequenceMethodInvoker()
		{
			super(java/lang/CharSequence);
		//    0    0:aload_0         
		//    1    1:ldc1            #12  <Class CharSequence>
		//    2    3:invokespecial   #15  <Method void MethodInvoker$TypedMethodInvoker(Class)>
		//    3    6:return          
		}
	}

	private static class FloatMethodInvoker extends TypedMethodInvoker
	{

		Float convertArgument(String s)
		{
			return Float.valueOf(Float.parseFloat(s));
		//    0    0:aload_1         
		//    1    1:invokestatic    #26  <Method float Float.parseFloat(String)>
		//    2    4:invokestatic    #30  <Method Float Float.valueOf(float)>
		//    3    7:areturn         
		}

		volatile Object convertArgument(String s)
		{
			return ((Object) (convertArgument(s)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #33  <Method Float convertArgument(String)>
		//    3    5:areturn         
		}

		FloatMethodInvoker()
		{
			super(Float.TYPE);
		//    0    0:aload_0         
		//    1    1:getstatic       #16  <Field Class Float.TYPE>
		//    2    4:invokespecial   #19  <Method void MethodInvoker$TypedMethodInvoker(Class)>
		//    3    7:return          
		}
	}

	private static class IntegerMethodInvoker extends TypedMethodInvoker
	{

		Integer convertArgument(String s)
		{
			return Integer.valueOf(Integer.parseInt(s));
		//    0    0:aload_1         
		//    1    1:invokestatic    #26  <Method int Integer.parseInt(String)>
		//    2    4:invokestatic    #30  <Method Integer Integer.valueOf(int)>
		//    3    7:areturn         
		}

		volatile Object convertArgument(String s)
		{
			return ((Object) (convertArgument(s)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #33  <Method Integer convertArgument(String)>
		//    3    5:areturn         
		}

		IntegerMethodInvoker()
		{
			super(Integer.TYPE);
		//    0    0:aload_0         
		//    1    1:getstatic       #16  <Field Class Integer.TYPE>
		//    2    4:invokespecial   #19  <Method void MethodInvoker$TypedMethodInvoker(Class)>
		//    3    7:return          
		}
	}

	private static class StringMethodInvoker extends TypedMethodInvoker
	{

		volatile Object convertArgument(String s)
		{
			return ((Object) (convertArgument(s)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #21  <Method String convertArgument(String)>
		//    3    5:areturn         
		}

		String convertArgument(String s)
		{
			return s;
		//    0    0:aload_1         
		//    1    1:areturn         
		}

		StringMethodInvoker()
		{
			super(java/lang/String);
		//    0    0:aload_0         
		//    1    1:ldc1            #12  <Class String>
		//    2    3:invokespecial   #15  <Method void MethodInvoker$TypedMethodInvoker(Class)>
		//    3    6:return          
		}
	}

	private static abstract class TypedMethodInvoker
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

		TypedMethodInvoker(Class class1)
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


	public MethodInvoker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
	//    2    4:return          
	}

	public void invoke(Object obj, String s, String s1)
	{
		Util.throwIfNull(obj, ((Object) (s)), ((Object) (s1)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #52  <Method void Util.throwIfNull(Object, Object, Object)>
		int j = invokers.size();
	//    4    6:getstatic       #42  <Field List invokers>
	//    5    9:invokeinterface #58  <Method int List.size()>
	//    6   14:istore          5
		for(int i = 0; i < j; i++)
	//*   7   16:iconst_0        
	//*   8   17:istore          4
	//*   9   19:iload           4
	//*  10   21:iload           5
	//*  11   23:icmpge          58
			if(((TypedMethodInvoker)invokers.get(i)).invoke(obj, s, s1))
	//*  12   26:getstatic       #42  <Field List invokers>
	//*  13   29:iload           4
	//*  14   31:invokeinterface #62  <Method Object List.get(int)>
	//*  15   36:checkcast       #21  <Class MethodInvoker$TypedMethodInvoker>
	//*  16   39:aload_1         
	//*  17   40:aload_2         
	//*  18   41:aload_3         
	//*  19   42:invokevirtual   #65  <Method boolean MethodInvoker$TypedMethodInvoker.invoke(Object, String, String)>
	//*  20   45:ifeq            49
				return;
	//   21   48:return          

	//   22   49:iload           4
	//   23   51:iconst_1        
	//   24   52:iadd            
	//   25   53:istore          4
	//*  26   55:goto            19
		obj = ((Object) (new StringBuilder()));
	//   27   58:new             #67  <Class StringBuilder>
	//   28   61:dup             
	//   29   62:invokespecial   #68  <Method void StringBuilder()>
	//   30   65:astore_1        
		((StringBuilder) (obj)).append("Method with name ");
	//   31   66:aload_1         
	//   32   67:ldc1            #70  <String "Method with name ">
	//   33   69:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   34   72:pop             
		((StringBuilder) (obj)).append(s);
	//   35   73:aload_1         
	//   36   74:aload_2         
	//   37   75:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   38   78:pop             
		((StringBuilder) (obj)).append(" not found for any of the MethodInvoker supported argument types.");
	//   39   79:aload_1         
	//   40   80:ldc1            #76  <String " not found for any of the MethodInvoker supported argument types.">
	//   41   82:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   42   85:pop             
		LogUtil.w(((StringBuilder) (obj)).toString());
	//   43   86:aload_1         
	//   44   87:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   45   90:invokestatic    #86  <Method void LogUtil.w(String)>
	//   46   93:return          
	}

	private static final List invokers = Arrays.asList(((Object []) (new TypedMethodInvoker[] {
		new StringMethodInvoker(), new CharSequenceMethodInvoker(), new IntegerMethodInvoker(), new FloatMethodInvoker(), new BooleanMethodInvoker()
	})));

	static 
	{
	//    0    0:iconst_5        
	//    1    1:anewarray       TypedMethodInvoker[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:new             #18  <Class MethodInvoker$StringMethodInvoker>
	//    5    9:dup             
	//    6   10:invokespecial   #30  <Method void MethodInvoker$StringMethodInvoker()>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:new             #9   <Class MethodInvoker$CharSequenceMethodInvoker>
	//   11   19:dup             
	//   12   20:invokespecial   #31  <Method void MethodInvoker$CharSequenceMethodInvoker()>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:new             #15  <Class MethodInvoker$IntegerMethodInvoker>
	//   17   29:dup             
	//   18   30:invokespecial   #32  <Method void MethodInvoker$IntegerMethodInvoker()>
	//   19   33:aastore         
	//   20   34:dup             
	//   21   35:iconst_3        
	//   22   36:new             #12  <Class MethodInvoker$FloatMethodInvoker>
	//   23   39:dup             
	//   24   40:invokespecial   #33  <Method void MethodInvoker$FloatMethodInvoker()>
	//   25   43:aastore         
	//   26   44:dup             
	//   27   45:iconst_4        
	//   28   46:new             #6   <Class MethodInvoker$BooleanMethodInvoker>
	//   29   49:dup             
	//   30   50:invokespecial   #34  <Method void MethodInvoker$BooleanMethodInvoker()>
	//   31   53:aastore         
	//   32   54:invokestatic    #40  <Method List Arrays.asList(Object[])>
	//   33   57:putstatic       #42  <Field List invokers>
	//*  34   60:return          
	}
}
