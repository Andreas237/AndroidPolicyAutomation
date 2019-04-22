// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package androidx.versionedparcelable:
//			VersionedParcelable

public abstract class VersionedParcel
{

	public VersionedParcel()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	private static Class findParcelClass(VersionedParcelable versionedparcelable)
		throws ClassNotFoundException
	{
		return findParcelClass(((Object) (versionedparcelable)).getClass());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #21  <Method Class Object.getClass()>
	//    2    4:invokestatic    #24  <Method Class findParcelClass(Class)>
	//    3    7:areturn         
	}

	private static Class findParcelClass(Class class1)
		throws ClassNotFoundException
	{
		return Class.forName(String.format("%s.%sParcelizer", new Object[] {
			class1.getPackage().getName(), class1.getSimpleName()
		}), false, class1.getClassLoader());
	//    0    0:ldc1            #29  <String "%s.%sParcelizer">
	//    1    2:iconst_2        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:invokevirtual   #35  <Method Package Class.getPackage()>
	//    7   12:invokevirtual   #41  <Method String Package.getName()>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_0         
	//   12   19:invokevirtual   #44  <Method String Class.getSimpleName()>
	//   13   22:aastore         
	//   14   23:invokestatic    #50  <Method String String.format(String, Object[])>
	//   15   26:iconst_0        
	//   16   27:aload_0         
	//   17   28:invokevirtual   #54  <Method ClassLoader Class.getClassLoader()>
	//   18   31:invokestatic    #58  <Method Class Class.forName(String, boolean, ClassLoader)>
	//   19   34:areturn         
	}

	protected static VersionedParcelable readFromParcel(String s, VersionedParcel versionedparcel)
	{
		try
		{
			s = ((String) ((VersionedParcelable)Class.forName(s, true, ((Class) (androidx/versionedparcelable/VersionedParcel)).getClassLoader()).getDeclaredMethod("read", new Class[] {
				androidx/versionedparcelable/VersionedParcel
			}).invoke(((Object) (null)), new Object[] {
				versionedparcel
			})));
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:ldc1            #2   <Class VersionedParcel>
	//    3    4:invokevirtual   #54  <Method ClassLoader Class.getClassLoader()>
	//    4    7:invokestatic    #58  <Method Class Class.forName(String, boolean, ClassLoader)>
	//    5   10:ldc1            #69  <String "read">
	//    6   12:iconst_1        
	//    7   13:anewarray       Class[]
	//    8   16:dup             
	//    9   17:iconst_0        
	//   10   18:ldc1            #2   <Class VersionedParcel>
	//   11   20:aastore         
	//   12   21:invokevirtual   #73  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   13   24:aconst_null     
	//   14   25:iconst_1        
	//   15   26:anewarray       Object[]
	//   16   29:dup             
	//   17   30:iconst_0        
	//   18   31:aload_1         
	//   19   32:aastore         
	//   20   33:invokevirtual   #79  <Method Object Method.invoke(Object, Object[])>
	//   21   36:checkcast       #81  <Class VersionedParcelable>
	//   22   39:astore_0        
		}
	//*  23   40:aload_0         
	//*  24   41:areturn         
	//*  25   42:astore_0        
	//*  26   43:new             #83  <Class RuntimeException>
	//*  27   46:dup             
	//*  28   47:ldc1            #85  <String "VersionedParcel encountered ClassNotFoundException">
	//*  29   49:aload_0         
	//*  30   50:invokespecial   #88  <Method void RuntimeException(String, Throwable)>
	//*  31   53:athrow          
	//*  32   54:astore_0        
	//*  33   55:new             #83  <Class RuntimeException>
	//*  34   58:dup             
	//*  35   59:ldc1            #90  <String "VersionedParcel encountered NoSuchMethodException">
	//*  36   61:aload_0         
	//*  37   62:invokespecial   #88  <Method void RuntimeException(String, Throwable)>
	//*  38   65:athrow          
	//*  39   66:astore_0        
	//*  40   67:aload_0         
	//*  41   68:invokevirtual   #94  <Method Throwable InvocationTargetException.getCause()>
	//*  42   71:instanceof      #83  <Class RuntimeException>
	//*  43   74:ifeq            85
	//*  44   77:aload_0         
	//*  45   78:invokevirtual   #94  <Method Throwable InvocationTargetException.getCause()>
	//*  46   81:checkcast       #83  <Class RuntimeException>
	//*  47   84:athrow          
	//*  48   85:new             #83  <Class RuntimeException>
	//*  49   88:dup             
	//*  50   89:ldc1            #96  <String "VersionedParcel encountered InvocationTargetException">
	//*  51   91:aload_0         
	//*  52   92:invokespecial   #88  <Method void RuntimeException(String, Throwable)>
	//*  53   95:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  54   96:astore_0        
		{
			throw new RuntimeException("VersionedParcel encountered IllegalAccessException", ((Throwable) (s)));
	//   55   97:new             #83  <Class RuntimeException>
	//   56  100:dup             
	//   57  101:ldc1            #98  <String "VersionedParcel encountered IllegalAccessException">
	//   58  103:aload_0         
	//   59  104:invokespecial   #88  <Method void RuntimeException(String, Throwable)>
	//   60  107:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			if(((InvocationTargetException) (s)).getCause() instanceof RuntimeException)
				throw (RuntimeException)((InvocationTargetException) (s)).getCause();
			else
				throw new RuntimeException("VersionedParcel encountered InvocationTargetException", ((Throwable) (s)));
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", ((Throwable) (s)));
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", ((Throwable) (s)));
		}
		return ((VersionedParcelable) (s));
	}

	protected static void writeToParcel(VersionedParcelable versionedparcelable, VersionedParcel versionedparcel)
	{
		try
		{
			findParcelClass(versionedparcelable).getDeclaredMethod("write", new Class[] {
				((Object) (versionedparcelable)).getClass(), androidx/versionedparcelable/VersionedParcel
			}).invoke(((Object) (null)), new Object[] {
				versionedparcelable, versionedparcel
			});
	//    0    0:aload_0         
	//    1    1:invokestatic    #103 <Method Class findParcelClass(VersionedParcelable)>
	//    2    4:ldc1            #105 <String "write">
	//    3    6:iconst_2        
	//    4    7:anewarray       Class[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:aload_0         
	//    8   13:invokevirtual   #21  <Method Class Object.getClass()>
	//    9   16:aastore         
	//   10   17:dup             
	//   11   18:iconst_1        
	//   12   19:ldc1            #2   <Class VersionedParcel>
	//   13   21:aastore         
	//   14   22:invokevirtual   #73  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   15   25:aconst_null     
	//   16   26:iconst_2        
	//   17   27:anewarray       Object[]
	//   18   30:dup             
	//   19   31:iconst_0        
	//   20   32:aload_0         
	//   21   33:aastore         
	//   22   34:dup             
	//   23   35:iconst_1        
	//   24   36:aload_1         
	//   25   37:aastore         
	//   26   38:invokevirtual   #79  <Method Object Method.invoke(Object, Object[])>
	//   27   41:pop             
			return;
	//   28   42:return          
		}
	//*  29   43:astore_0        
	//*  30   44:new             #83  <Class RuntimeException>
	//*  31   47:dup             
	//*  32   48:ldc1            #85  <String "VersionedParcel encountered ClassNotFoundException">
	//*  33   50:aload_0         
	//*  34   51:invokespecial   #88  <Method void RuntimeException(String, Throwable)>
	//*  35   54:athrow          
	//*  36   55:astore_0        
	//*  37   56:new             #83  <Class RuntimeException>
	//*  38   59:dup             
	//*  39   60:ldc1            #90  <String "VersionedParcel encountered NoSuchMethodException">
	//*  40   62:aload_0         
	//*  41   63:invokespecial   #88  <Method void RuntimeException(String, Throwable)>
	//*  42   66:athrow          
	//*  43   67:astore_0        
	//*  44   68:aload_0         
	//*  45   69:invokevirtual   #94  <Method Throwable InvocationTargetException.getCause()>
	//*  46   72:instanceof      #83  <Class RuntimeException>
	//*  47   75:ifeq            86
	//*  48   78:aload_0         
	//*  49   79:invokevirtual   #94  <Method Throwable InvocationTargetException.getCause()>
	//*  50   82:checkcast       #83  <Class RuntimeException>
	//*  51   85:athrow          
	//*  52   86:new             #83  <Class RuntimeException>
	//*  53   89:dup             
	//*  54   90:ldc1            #96  <String "VersionedParcel encountered InvocationTargetException">
	//*  55   92:aload_0         
	//*  56   93:invokespecial   #88  <Method void RuntimeException(String, Throwable)>
	//*  57   96:athrow          
		// Misplaced declaration of an exception variable
		catch(VersionedParcelable versionedparcelable)
	//*  58   97:astore_0        
		{
			throw new RuntimeException("VersionedParcel encountered IllegalAccessException", ((Throwable) (versionedparcelable)));
	//   59   98:new             #83  <Class RuntimeException>
	//   60  101:dup             
	//   61  102:ldc1            #98  <String "VersionedParcel encountered IllegalAccessException">
	//   62  104:aload_0         
	//   63  105:invokespecial   #88  <Method void RuntimeException(String, Throwable)>
	//   64  108:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(VersionedParcelable versionedparcelable) { }
		// Misplaced declaration of an exception variable
		catch(VersionedParcelable versionedparcelable)
		{
			throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", ((Throwable) (versionedparcelable)));
		}
		// Misplaced declaration of an exception variable
		catch(VersionedParcelable versionedparcelable)
		{
			throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", ((Throwable) (versionedparcelable)));
		}
		if(((InvocationTargetException) (versionedparcelable)).getCause() instanceof RuntimeException)
			throw (RuntimeException)((InvocationTargetException) (versionedparcelable)).getCause();
		else
			throw new RuntimeException("VersionedParcel encountered InvocationTargetException", ((Throwable) (versionedparcelable)));
	}

	private void writeVersionedParcelableCreator(VersionedParcelable versionedparcelable)
	{
		Class class1;
		try
		{
			class1 = findParcelClass(((Object) (versionedparcelable)).getClass());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #21  <Method Class Object.getClass()>
	//    2    4:invokestatic    #24  <Method Class findParcelClass(Class)>
	//    3    7:astore_2        
		}
	//*   4    8:aload_0         
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #109 <Method String Class.getName()>
	//*   7   13:invokevirtual   #113 <Method void writeString(String)>
	//*   8   16:return          
		catch(ClassNotFoundException classnotfoundexception)
	//*   9   17:astore_2        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   18:new             #115 <Class StringBuilder>
	//   11   21:dup             
	//   12   22:invokespecial   #116 <Method void StringBuilder()>
	//   13   25:astore_3        
			stringbuilder.append(((Object) (versionedparcelable)).getClass().getSimpleName());
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #21  <Method Class Object.getClass()>
	//   17   31:invokevirtual   #44  <Method String Class.getSimpleName()>
	//   18   34:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(" does not have a Parcelizer");
	//   20   38:aload_3         
	//   21   39:ldc1            #122 <String " does not have a Parcelizer">
	//   22   41:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			throw new RuntimeException(stringbuilder.toString(), ((Throwable) (classnotfoundexception)));
	//   24   45:new             #83  <Class RuntimeException>
	//   25   48:dup             
	//   26   49:aload_3         
	//   27   50:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   28   53:aload_2         
	//   29   54:invokespecial   #88  <Method void RuntimeException(String, Throwable)>
	//   30   57:athrow          
		}
		writeString(class1.getName());
	}

	protected abstract void closeField();

	protected abstract VersionedParcel createSubParcel();

	public boolean isStream()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected abstract byte[] readByteArray();

	public byte[] readByteArray(byte abyte0[], int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #137 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return abyte0;
	//    4    8:aload_1         
	//    5    9:areturn         
		else
			return readByteArray();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #139 <Method byte[] readByteArray()>
	//    8   14:areturn         
	}

	protected abstract boolean readField(int i);

	protected abstract int readInt();

	public int readInt(int i, int j)
	{
		if(!readField(j))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #137 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return i;
	//    4    8:iload_1         
	//    5    9:ireturn         
		else
			return readInt();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #144 <Method int readInt()>
	//    8   14:ireturn         
	}

	protected abstract Parcelable readParcelable();

	public Parcelable readParcelable(Parcelable parcelable, int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #137 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return parcelable;
	//    4    8:aload_1         
	//    5    9:areturn         
		else
			return readParcelable();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #149 <Method Parcelable readParcelable()>
	//    8   14:areturn         
	}

	protected abstract String readString();

	public String readString(String s, int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #137 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return s;
	//    4    8:aload_1         
	//    5    9:areturn         
		else
			return readString();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #154 <Method String readString()>
	//    8   14:areturn         
	}

	protected VersionedParcelable readVersionedParcelable()
	{
		String s = readString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #154 <Method String readString()>
	//    2    4:astore_1        
		if(s == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return readFromParcel(s, createSubParcel());
	//    7   11:aload_1         
	//    8   12:aload_0         
	//    9   13:invokevirtual   #158 <Method VersionedParcel createSubParcel()>
	//   10   16:invokestatic    #160 <Method VersionedParcelable readFromParcel(String, VersionedParcel)>
	//   11   19:areturn         
	}

	protected abstract void setOutputField(int i);

	public void setSerializationFlags(boolean flag, boolean flag1)
	{
	//    0    0:return          
	}

	protected abstract void writeByteArray(byte abyte0[]);

	public void writeByteArray(byte abyte0[], int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #170 <Method void setOutputField(int)>
		writeByteArray(abyte0);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #172 <Method void writeByteArray(byte[])>
	//    6   10:return          
	}

	protected abstract void writeInt(int i);

	public void writeInt(int i, int j)
	{
		setOutputField(j);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #170 <Method void setOutputField(int)>
		writeInt(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #176 <Method void writeInt(int)>
	//    6   10:return          
	}

	protected abstract void writeParcelable(Parcelable parcelable);

	public void writeParcelable(Parcelable parcelable, int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #170 <Method void setOutputField(int)>
		writeParcelable(parcelable);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #181 <Method void writeParcelable(Parcelable)>
	//    6   10:return          
	}

	protected abstract void writeString(String s);

	public void writeString(String s, int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #170 <Method void setOutputField(int)>
		writeString(s);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #113 <Method void writeString(String)>
	//    6   10:return          
	}

	protected void writeVersionedParcelable(VersionedParcelable versionedparcelable)
	{
		if(versionedparcelable == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
		{
			writeString(((String) (null)));
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #113 <Method void writeString(String)>
			return;
	//    5    9:return          
		} else
		{
			writeVersionedParcelableCreator(versionedparcelable);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #185 <Method void writeVersionedParcelableCreator(VersionedParcelable)>
			VersionedParcel versionedparcel = createSubParcel();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #158 <Method VersionedParcel createSubParcel()>
	//   11   19:astore_2        
			writeToParcel(versionedparcelable, versionedparcel);
	//   12   20:aload_1         
	//   13   21:aload_2         
	//   14   22:invokestatic    #187 <Method void writeToParcel(VersionedParcelable, VersionedParcel)>
			versionedparcel.closeField();
	//   15   25:aload_2         
	//   16   26:invokevirtual   #189 <Method void closeField()>
			return;
	//   17   29:return          
		}
	}
}
