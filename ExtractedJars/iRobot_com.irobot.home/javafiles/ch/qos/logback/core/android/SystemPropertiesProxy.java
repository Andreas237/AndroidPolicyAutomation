// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.android;

import java.lang.reflect.Method;

public class SystemPropertiesProxy
{

	private SystemPropertiesProxy(ClassLoader classloader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		try
		{
			setClassLoader(classloader);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #28  <Method void setClassLoader(ClassLoader)>
			return;
	//    5    9:return          
		}
		// Misplaced declaration of an exception variable
		catch(ClassLoader classloader)
	//*   6   10:astore_1        
		{
			return;
	//    7   11:return          
		}
	}

	public static SystemPropertiesProxy getInstance()
	{
		return SINGLETON;
	//    0    0:getstatic       #20  <Field SystemPropertiesProxy SINGLETON>
	//    1    3:areturn         
	}

	public String get(String s, String s1)
	{
label0:
		{
label1:
			{
				if(SystemProperties == null)
					break label0;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Class SystemProperties>
	//    2    4:ifnull          68
				if(getString == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #38  <Field Method getString>
	//*   5   11:ifnonnull       16
					return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
				String s2;
				try
				{
					s = (String)getString.invoke(((Object) (SystemProperties)), new Object[] {
						s, s1
					});
	//    8   16:aload_0         
	//    9   17:getfield        #38  <Field Method getString>
	//   10   20:aload_0         
	//   11   21:getfield        #36  <Field Class SystemProperties>
	//   12   24:iconst_2        
	//   13   25:anewarray       Object[]
	//   14   28:dup             
	//   15   29:iconst_0        
	//   16   30:aload_1         
	//   17   31:aastore         
	//   18   32:dup             
	//   19   33:iconst_1        
	//   20   34:aload_2         
	//   21   35:aastore         
	//   22   36:invokevirtual   #44  <Method Object Method.invoke(Object, Object[])>
	//   23   39:checkcast       #46  <Class String>
	//   24   42:astore_1        
				}
	//*  25   43:goto            48
	//*  26   46:aconst_null     
	//*  27   47:astore_1        
	//*  28   48:aload_1         
	//*  29   49:ifnull          61
	//*  30   52:aload_1         
	//*  31   53:astore_3        
	//*  32   54:aload_1         
	//*  33   55:invokevirtual   #50  <Method int String.length()>
	//*  34   58:ifne            63
	//*  35   61:aload_2         
	//*  36   62:astore_3        
	//*  37   63:aload_3         
	//*  38   64:areturn         
				// Misplaced declaration of an exception variable
				catch(String s)
	//*  39   65:astore_1        
				{
					throw s;
	//   40   66:aload_1         
	//   41   67:athrow          
				}
	//*  42   68:aconst_null     
	//*  43   69:areturn         
				// Misplaced declaration of an exception variable
				catch(String s)
				{
					s = null;
				}
				if(s != null)
				{
					s2 = s;
					if(s.length() != 0)
						break label1;
				}
				s2 = s1;
			}
			return s2;
		}
		return null;
	//*  44   70:astore_1        
	//*  45   71:goto            46
	}

	public Boolean getBoolean(String s, boolean flag)
	{
		if(SystemProperties != null && getBoolean != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field Class SystemProperties>
	//*   2    4:ifnull          57
	//*   3    7:aload_0         
	//*   4    8:getfield        #53  <Field Method getBoolean>
	//*   5   11:ifnonnull       17
	//*   6   14:goto            57
		{
			try
			{
				s = ((String) ((Boolean)getBoolean.invoke(((Object) (SystemProperties)), new Object[] {
					s, Boolean.valueOf(flag)
				})));
	//    7   17:aload_0         
	//    8   18:getfield        #53  <Field Method getBoolean>
	//    9   21:aload_0         
	//   10   22:getfield        #36  <Field Class SystemProperties>
	//   11   25:iconst_2        
	//   12   26:anewarray       Object[]
	//   13   29:dup             
	//   14   30:iconst_0        
	//   15   31:aload_1         
	//   16   32:aastore         
	//   17   33:dup             
	//   18   34:iconst_1        
	//   19   35:iload_2         
	//   20   36:invokestatic    #59  <Method Boolean Boolean.valueOf(boolean)>
	//   21   39:aastore         
	//   22   40:invokevirtual   #44  <Method Object Method.invoke(Object, Object[])>
	//   23   43:checkcast       #55  <Class Boolean>
	//   24   46:astore_1        
			}
	//*  25   47:aload_1         
	//*  26   48:areturn         
	//*  27   49:iload_2         
	//*  28   50:invokestatic    #59  <Method Boolean Boolean.valueOf(boolean)>
	//*  29   53:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  30   54:astore_1        
			{
				throw s;
	//   31   55:aload_1         
	//   32   56:athrow          
			}
	//*  33   57:iload_2         
	//*  34   58:invokestatic    #59  <Method Boolean Boolean.valueOf(boolean)>
	//*  35   61:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				return Boolean.valueOf(flag);
			}
			return ((Boolean) (s));
		} else
		{
			return Boolean.valueOf(flag);
		}
	//*  36   62:astore_1        
	//*  37   63:goto            49
	}

	public void setClassLoader(ClassLoader classloader)
	{
		ClassLoader classloader1 = classloader;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(classloader == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       14
			classloader1 = ((Object)this).getClass().getClassLoader();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #63  <Method Class Object.getClass()>
	//    6   10:invokevirtual   #69  <Method ClassLoader Class.getClassLoader()>
	//    7   13:astore_2        
		SystemProperties = classloader1.loadClass("android.os.SystemProperties");
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:ldc1            #71  <String "android.os.SystemProperties">
	//   11   18:invokevirtual   #77  <Method Class ClassLoader.loadClass(String)>
	//   12   21:putfield        #36  <Field Class SystemProperties>
		getString = SystemProperties.getMethod("get", new Class[] {
			java/lang/String, java/lang/String
		});
	//   13   24:aload_0         
	//   14   25:aload_0         
	//   15   26:getfield        #36  <Field Class SystemProperties>
	//   16   29:ldc1            #78  <String "get">
	//   17   31:iconst_2        
	//   18   32:anewarray       Class[]
	//   19   35:dup             
	//   20   36:iconst_0        
	//   21   37:ldc1            #46  <Class String>
	//   22   39:aastore         
	//   23   40:dup             
	//   24   41:iconst_1        
	//   25   42:ldc1            #46  <Class String>
	//   26   44:aastore         
	//   27   45:invokevirtual   #82  <Method Method Class.getMethod(String, Class[])>
	//   28   48:putfield        #38  <Field Method getString>
		getBoolean = SystemProperties.getMethod("getBoolean", new Class[] {
			java/lang/String, Boolean.TYPE
		});
	//   29   51:aload_0         
	//   30   52:aload_0         
	//   31   53:getfield        #36  <Field Class SystemProperties>
	//   32   56:ldc1            #83  <String "getBoolean">
	//   33   58:iconst_2        
	//   34   59:anewarray       Class[]
	//   35   62:dup             
	//   36   63:iconst_0        
	//   37   64:ldc1            #46  <Class String>
	//   38   66:aastore         
	//   39   67:dup             
	//   40   68:iconst_1        
	//   41   69:getstatic       #86  <Field Class Boolean.TYPE>
	//   42   72:aastore         
	//   43   73:invokevirtual   #82  <Method Method Class.getMethod(String, Class[])>
	//   44   76:putfield        #53  <Field Method getBoolean>
	//   45   79:return          
	}

	private static final SystemPropertiesProxy SINGLETON = new SystemPropertiesProxy(((ClassLoader) (null)));
	private Class SystemProperties;
	private Method getBoolean;
	private Method getString;

	static 
	{
	//    0    0:new             #2   <Class SystemPropertiesProxy>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #18  <Method void SystemPropertiesProxy(ClassLoader)>
	//    4    8:putstatic       #20  <Field SystemPropertiesProxy SINGLETON>
	//*   5   11:return          
	}
}
