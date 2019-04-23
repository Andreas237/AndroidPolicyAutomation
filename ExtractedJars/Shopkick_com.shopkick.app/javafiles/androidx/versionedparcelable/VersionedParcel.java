// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.versionedparcelable;

import android.os.*;
import android.support.v4.util.ArraySet;
import android.util.*;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

// Referenced classes of package androidx.versionedparcelable:
//			VersionedParcelable

public abstract class VersionedParcel
{
	public static class ParcelException extends RuntimeException
	{

		public ParcelException(Throwable throwable)
		{
			super(throwable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void RuntimeException(Throwable)>
		//    3    5:return          
		}
	}


	public VersionedParcel()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
	//    2    4:return          
	}

	private Exception createException(int i, String s)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     -9 -1: default 52
	//	               -9 160
	//	               -8 52
	//	               -7 151
	//	               -6 143
	//	               -5 134
	//	               -4 125
	//	               -3 116
	//	               -2 107
	//	               -1 98
		case -8: 
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    2   52:new             #53  <Class StringBuilder>
	//    3   55:dup             
	//    4   56:invokespecial   #54  <Method void StringBuilder()>
	//    5   59:astore_3        
			stringbuilder.append("Unknown exception code: ");
	//    6   60:aload_3         
	//    7   61:ldc1            #56  <String "Unknown exception code: ">
	//    8   63:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//    9   66:pop             
			stringbuilder.append(i);
	//   10   67:aload_3         
	//   11   68:iload_1         
	//   12   69:invokevirtual   #63  <Method StringBuilder StringBuilder.append(int)>
	//   13   72:pop             
			stringbuilder.append(" msg ");
	//   14   73:aload_3         
	//   15   74:ldc1            #65  <String " msg ">
	//   16   76:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   17   79:pop             
			stringbuilder.append(s);
	//   18   80:aload_3         
	//   19   81:aload_2         
	//   20   82:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   21   85:pop             
			return ((Exception) (new RuntimeException(stringbuilder.toString())));
	//   22   86:new             #67  <Class RuntimeException>
	//   23   89:dup             
	//   24   90:aload_3         
	//   25   91:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   26   94:invokespecial   #74  <Method void RuntimeException(String)>
	//   27   97:areturn         

		case -1: 
			return ((Exception) (new SecurityException(s)));
	//   28   98:new             #76  <Class SecurityException>
	//   29  101:dup             
	//   30  102:aload_2         
	//   31  103:invokespecial   #77  <Method void SecurityException(String)>
	//   32  106:areturn         

		case -2: 
			return ((Exception) (new BadParcelableException(s)));
	//   33  107:new             #79  <Class BadParcelableException>
	//   34  110:dup             
	//   35  111:aload_2         
	//   36  112:invokespecial   #80  <Method void BadParcelableException(String)>
	//   37  115:areturn         

		case -3: 
			return ((Exception) (new IllegalArgumentException(s)));
	//   38  116:new             #82  <Class IllegalArgumentException>
	//   39  119:dup             
	//   40  120:aload_2         
	//   41  121:invokespecial   #83  <Method void IllegalArgumentException(String)>
	//   42  124:areturn         

		case -4: 
			return ((Exception) (new NullPointerException(s)));
	//   43  125:new             #85  <Class NullPointerException>
	//   44  128:dup             
	//   45  129:aload_2         
	//   46  130:invokespecial   #86  <Method void NullPointerException(String)>
	//   47  133:areturn         

		case -5: 
			return ((Exception) (new IllegalStateException(s)));
	//   48  134:new             #88  <Class IllegalStateException>
	//   49  137:dup             
	//   50  138:aload_2         
	//   51  139:invokespecial   #89  <Method void IllegalStateException(String)>
	//   52  142:areturn         

		case -6: 
			return ((Exception) (new NetworkOnMainThreadException()));
	//   53  143:new             #91  <Class NetworkOnMainThreadException>
	//   54  146:dup             
	//   55  147:invokespecial   #92  <Method void NetworkOnMainThreadException()>
	//   56  150:areturn         

		case -7: 
			return ((Exception) (new UnsupportedOperationException(s)));
	//   57  151:new             #94  <Class UnsupportedOperationException>
	//   58  154:dup             
	//   59  155:aload_2         
	//   60  156:invokespecial   #95  <Method void UnsupportedOperationException(String)>
	//   61  159:areturn         

		case -9: 
			return (Exception)readParcelable();
	//   62  160:aload_0         
	//   63  161:invokevirtual   #99  <Method Parcelable readParcelable()>
	//   64  164:checkcast       #101 <Class Exception>
	//   65  167:areturn         
		}
	}

	private static Class findParcelClass(VersionedParcelable versionedparcelable)
		throws ClassNotFoundException
	{
		return findParcelClass(((Object) (versionedparcelable)).getClass());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #109 <Method Class Object.getClass()>
	//    2    4:invokestatic    #112 <Method Class findParcelClass(Class)>
	//    3    7:areturn         
	}

	private static Class findParcelClass(Class class1)
		throws ClassNotFoundException
	{
		return Class.forName(String.format("%s.%sParcelizer", new Object[] {
			class1.getPackage().getName(), class1.getSimpleName()
		}), false, class1.getClassLoader());
	//    0    0:ldc1            #117 <String "%s.%sParcelizer">
	//    1    2:iconst_2        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:invokevirtual   #123 <Method Package Class.getPackage()>
	//    7   12:invokevirtual   #128 <Method String Package.getName()>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_0         
	//   12   19:invokevirtual   #131 <Method String Class.getSimpleName()>
	//   13   22:aastore         
	//   14   23:invokestatic    #137 <Method String String.format(String, Object[])>
	//   15   26:iconst_0        
	//   16   27:aload_0         
	//   17   28:invokevirtual   #141 <Method ClassLoader Class.getClassLoader()>
	//   18   31:invokestatic    #145 <Method Class Class.forName(String, boolean, ClassLoader)>
	//   19   34:areturn         
	}

	protected static Throwable getRootCause(Throwable throwable)
	{
		for(; throwable.getCause() != null; throwable = throwable.getCause());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #155 <Method Throwable Throwable.getCause()>
	//    2    4:ifnull          15
	//    3    7:aload_0         
	//    4    8:invokevirtual   #155 <Method Throwable Throwable.getCause()>
	//    5   11:astore_0        
	//*   6   12:goto            0
		return throwable;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	private int getType(Object obj)
	{
		if(obj instanceof String)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #133 <Class String>
	//*   2    4:ifeq            9
			return 4;
	//    3    7:iconst_4        
	//    4    8:ireturn         
		if(obj instanceof Parcelable)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #161 <Class Parcelable>
	//*   7   13:ifeq            18
			return 2;
	//    8   16:iconst_2        
	//    9   17:ireturn         
		if(obj instanceof VersionedParcelable)
	//*  10   18:aload_1         
	//*  11   19:instanceof      #163 <Class VersionedParcelable>
	//*  12   22:ifeq            27
			return 1;
	//   13   25:iconst_1        
	//   14   26:ireturn         
		if(obj instanceof Serializable)
	//*  15   27:aload_1         
	//*  16   28:instanceof      #165 <Class Serializable>
	//*  17   31:ifeq            36
			return 3;
	//   18   34:iconst_3        
	//   19   35:ireturn         
		if(obj instanceof IBinder)
	//*  20   36:aload_1         
	//*  21   37:instanceof      #167 <Class IBinder>
	//*  22   40:ifeq            45
		{
			return 5;
	//   23   43:iconst_5        
	//   24   44:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   25   45:new             #53  <Class StringBuilder>
	//   26   48:dup             
	//   27   49:invokespecial   #54  <Method void StringBuilder()>
	//   28   52:astore_2        
			stringbuilder.append(obj.getClass().getName());
	//   29   53:aload_2         
	//   30   54:aload_1         
	//   31   55:invokevirtual   #109 <Method Class Object.getClass()>
	//   32   58:invokevirtual   #168 <Method String Class.getName()>
	//   33   61:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   34   64:pop             
			stringbuilder.append(" cannot be VersionedParcelled");
	//   35   65:aload_2         
	//   36   66:ldc1            #170 <String " cannot be VersionedParcelled">
	//   37   68:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   38   71:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   39   72:new             #82  <Class IllegalArgumentException>
	//   40   75:dup             
	//   41   76:aload_2         
	//   42   77:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   43   80:invokespecial   #83  <Method void IllegalArgumentException(String)>
	//   44   83:athrow          
		}
	}

	private Collection readCollection(int i, Collection collection)
	{
		i = readInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #177 <Method int readInt()>
	//    2    4:istore_1        
		if(i < 0)
	//*   3    5:iload_1         
	//*   4    6:ifge            11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		if(i != 0)
	//*   7   11:iload_1         
	//*   8   12:ifeq            197
		{
			int j1 = readInt();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #177 <Method int readInt()>
	//   11   19:istore          7
			if(i < 0)
	//*  12   21:iload_1         
	//*  13   22:ifge            27
				return null;
	//   14   25:aconst_null     
	//   15   26:areturn         
			int j = i;
	//   16   27:iload_1         
	//   17   28:istore_3        
			int k = i;
	//   18   29:iload_1         
	//   19   30:istore          4
			int l = i;
	//   20   32:iload_1         
	//   21   33:istore          5
			int i1 = i;
	//   22   35:iload_1         
	//   23   36:istore          6
			switch(j1)
	//*  24   38:iload           7
			{
	//*  25   40:tableswitch     1 5: default 76
	//	               1 175
	//	               2 150
	//	               3 125
	//	               4 100
	//	               5 78
			default:
				return collection;
	//   26   76:aload_2         
	//   27   77:areturn         

			case 5: // '\005'
				for(; j > 0; j--)
	//*  28   78:iload_3         
	//*  29   79:ifle            197
					collection.add(((Object) (readStrongBinder())));
	//   30   82:aload_2         
	//   31   83:aload_0         
	//   32   84:invokevirtual   #181 <Method IBinder readStrongBinder()>
	//   33   87:invokeinterface #187 <Method boolean Collection.add(Object)>
	//   34   92:pop             

	//   35   93:iload_3         
	//   36   94:iconst_1        
	//   37   95:isub            
	//   38   96:istore_3        
				break;
	//   39   97:goto            78

			case 4: // '\004'
				for(; k > 0; k--)
	//*  40  100:iload           4
	//*  41  102:ifle            197
					collection.add(((Object) (readString())));
	//   42  105:aload_2         
	//   43  106:aload_0         
	//   44  107:invokevirtual   #190 <Method String readString()>
	//   45  110:invokeinterface #187 <Method boolean Collection.add(Object)>
	//   46  115:pop             

	//   47  116:iload           4
	//   48  118:iconst_1        
	//   49  119:isub            
	//   50  120:istore          4
				break;
	//   51  122:goto            100

			case 3: // '\003'
				for(; l > 0; l--)
	//*  52  125:iload           5
	//*  53  127:ifle            197
					collection.add(((Object) (readSerializable())));
	//   54  130:aload_2         
	//   55  131:aload_0         
	//   56  132:invokevirtual   #194 <Method Serializable readSerializable()>
	//   57  135:invokeinterface #187 <Method boolean Collection.add(Object)>
	//   58  140:pop             

	//   59  141:iload           5
	//   60  143:iconst_1        
	//   61  144:isub            
	//   62  145:istore          5
				break;
	//   63  147:goto            125

			case 2: // '\002'
				for(; i1 > 0; i1--)
	//*  64  150:iload           6
	//*  65  152:ifle            197
					collection.add(((Object) (readParcelable())));
	//   66  155:aload_2         
	//   67  156:aload_0         
	//   68  157:invokevirtual   #99  <Method Parcelable readParcelable()>
	//   69  160:invokeinterface #187 <Method boolean Collection.add(Object)>
	//   70  165:pop             

	//   71  166:iload           6
	//   72  168:iconst_1        
	//   73  169:isub            
	//   74  170:istore          6
				break;
	//   75  172:goto            150

			case 1: // '\001'
				for(; i > 0; i--)
	//*  76  175:iload_1         
	//*  77  176:ifle            197
					collection.add(((Object) (readVersionedParcelable())));
	//   78  179:aload_2         
	//   79  180:aload_0         
	//   80  181:invokevirtual   #198 <Method VersionedParcelable readVersionedParcelable()>
	//   81  184:invokeinterface #187 <Method boolean Collection.add(Object)>
	//   82  189:pop             

	//   83  190:iload_1         
	//   84  191:iconst_1        
	//   85  192:isub            
	//   86  193:istore_1        
				break;
			}
		}
	//*  87  194:goto            175
		return collection;
	//   88  197:aload_2         
	//   89  198:areturn         
	}

	private Exception readException(int i, String s)
	{
		return createException(i, s);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #202 <Method Exception createException(int, String)>
	//    4    6:areturn         
	}

	private int readExceptionCode()
	{
		return readInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #177 <Method int readInt()>
	//    2    4:ireturn         
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
	//    3    4:invokevirtual   #141 <Method ClassLoader Class.getClassLoader()>
	//    4    7:invokestatic    #145 <Method Class Class.forName(String, boolean, ClassLoader)>
	//    5   10:ldc1            #213 <String "read">
	//    6   12:iconst_1        
	//    7   13:anewarray       Class[]
	//    8   16:dup             
	//    9   17:iconst_0        
	//   10   18:ldc1            #2   <Class VersionedParcel>
	//   11   20:aastore         
	//   12   21:invokevirtual   #217 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   13   24:aconst_null     
	//   14   25:iconst_1        
	//   15   26:anewarray       Object[]
	//   16   29:dup             
	//   17   30:iconst_0        
	//   18   31:aload_1         
	//   19   32:aastore         
	//   20   33:invokevirtual   #223 <Method Object Method.invoke(Object, Object[])>
	//   21   36:checkcast       #163 <Class VersionedParcelable>
	//   22   39:astore_0        
		}
	//*  23   40:aload_0         
	//*  24   41:areturn         
	//*  25   42:astore_0        
	//*  26   43:new             #67  <Class RuntimeException>
	//*  27   46:dup             
	//*  28   47:ldc1            #225 <String "VersionedParcel encountered ClassNotFoundException">
	//*  29   49:aload_0         
	//*  30   50:invokespecial   #228 <Method void RuntimeException(String, Throwable)>
	//*  31   53:athrow          
	//*  32   54:astore_0        
	//*  33   55:new             #67  <Class RuntimeException>
	//*  34   58:dup             
	//*  35   59:ldc1            #230 <String "VersionedParcel encountered NoSuchMethodException">
	//*  36   61:aload_0         
	//*  37   62:invokespecial   #228 <Method void RuntimeException(String, Throwable)>
	//*  38   65:athrow          
	//*  39   66:astore_0        
	//*  40   67:aload_0         
	//*  41   68:invokevirtual   #231 <Method Throwable InvocationTargetException.getCause()>
	//*  42   71:instanceof      #67  <Class RuntimeException>
	//*  43   74:ifeq            85
	//*  44   77:aload_0         
	//*  45   78:invokevirtual   #231 <Method Throwable InvocationTargetException.getCause()>
	//*  46   81:checkcast       #67  <Class RuntimeException>
	//*  47   84:athrow          
	//*  48   85:new             #67  <Class RuntimeException>
	//*  49   88:dup             
	//*  50   89:ldc1            #233 <String "VersionedParcel encountered InvocationTargetException">
	//*  51   91:aload_0         
	//*  52   92:invokespecial   #228 <Method void RuntimeException(String, Throwable)>
	//*  53   95:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  54   96:astore_0        
		{
			throw new RuntimeException("VersionedParcel encountered IllegalAccessException", ((Throwable) (s)));
	//   55   97:new             #67  <Class RuntimeException>
	//   56  100:dup             
	//   57  101:ldc1            #235 <String "VersionedParcel encountered IllegalAccessException">
	//   58  103:aload_0         
	//   59  104:invokespecial   #228 <Method void RuntimeException(String, Throwable)>
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

	private void writeCollection(Collection collection, int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #242 <Method void setOutputField(int)>
		if(collection == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       15
		{
			writeInt(-1);
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:invokevirtual   #245 <Method void writeInt(int)>
			return;
	//    8   14:return          
		}
		i = collection.size();
	//    9   15:aload_1         
	//   10   16:invokeinterface #248 <Method int Collection.size()>
	//   11   21:istore_2        
		writeInt(i);
	//   12   22:aload_0         
	//   13   23:iload_2         
	//   14   24:invokevirtual   #245 <Method void writeInt(int)>
		if(i > 0)
	//*  15   27:iload_2         
	//*  16   28:ifle            249
		{
			i = getType(collection.iterator().next());
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:invokeinterface #252 <Method Iterator Collection.iterator()>
	//   20   38:invokeinterface #258 <Method Object Iterator.next()>
	//   21   43:invokespecial   #260 <Method int getType(Object)>
	//   22   46:istore_2        
			writeInt(i);
	//   23   47:aload_0         
	//   24   48:iload_2         
	//   25   49:invokevirtual   #245 <Method void writeInt(int)>
			switch(i)
	//*  26   52:iload_2         
			{
	//*  27   53:tableswitch     1 5: default 88
	//	               1 217
	//	               2 185
	//	               3 153
	//	               4 121
	//	               5 89
			default:
				return;
	//   28   88:return          

			case 5: // '\005'
				for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); writeStrongBinder((IBinder)((Iterator) (collection)).next()));
	//   29   89:aload_1         
	//   30   90:invokeinterface #252 <Method Iterator Collection.iterator()>
	//   31   95:astore_1        
	//   32   96:aload_1         
	//   33   97:invokeinterface #264 <Method boolean Iterator.hasNext()>
	//   34  102:ifeq            249
	//   35  105:aload_0         
	//   36  106:aload_1         
	//   37  107:invokeinterface #258 <Method Object Iterator.next()>
	//   38  112:checkcast       #167 <Class IBinder>
	//   39  115:invokevirtual   #268 <Method void writeStrongBinder(IBinder)>
				break;
	//   40  118:goto            96

			case 4: // '\004'
				for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); writeString((String)((Iterator) (collection)).next()));
	//   41  121:aload_1         
	//   42  122:invokeinterface #252 <Method Iterator Collection.iterator()>
	//   43  127:astore_1        
	//   44  128:aload_1         
	//   45  129:invokeinterface #264 <Method boolean Iterator.hasNext()>
	//   46  134:ifeq            249
	//   47  137:aload_0         
	//   48  138:aload_1         
	//   49  139:invokeinterface #258 <Method Object Iterator.next()>
	//   50  144:checkcast       #133 <Class String>
	//   51  147:invokevirtual   #271 <Method void writeString(String)>
				break;
	//   52  150:goto            128

			case 3: // '\003'
				for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); writeSerializable((Serializable)((Iterator) (collection)).next()));
	//   53  153:aload_1         
	//   54  154:invokeinterface #252 <Method Iterator Collection.iterator()>
	//   55  159:astore_1        
	//   56  160:aload_1         
	//   57  161:invokeinterface #264 <Method boolean Iterator.hasNext()>
	//   58  166:ifeq            249
	//   59  169:aload_0         
	//   60  170:aload_1         
	//   61  171:invokeinterface #258 <Method Object Iterator.next()>
	//   62  176:checkcast       #165 <Class Serializable>
	//   63  179:invokespecial   #275 <Method void writeSerializable(Serializable)>
				break;
	//   64  182:goto            160

			case 2: // '\002'
				for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); writeParcelable((Parcelable)((Iterator) (collection)).next()));
	//   65  185:aload_1         
	//   66  186:invokeinterface #252 <Method Iterator Collection.iterator()>
	//   67  191:astore_1        
	//   68  192:aload_1         
	//   69  193:invokeinterface #264 <Method boolean Iterator.hasNext()>
	//   70  198:ifeq            249
	//   71  201:aload_0         
	//   72  202:aload_1         
	//   73  203:invokeinterface #258 <Method Object Iterator.next()>
	//   74  208:checkcast       #161 <Class Parcelable>
	//   75  211:invokevirtual   #279 <Method void writeParcelable(Parcelable)>
				break;
	//   76  214:goto            192

			case 1: // '\001'
				for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); writeVersionedParcelable((VersionedParcelable)((Iterator) (collection)).next()));
	//   77  217:aload_1         
	//   78  218:invokeinterface #252 <Method Iterator Collection.iterator()>
	//   79  223:astore_1        
	//   80  224:aload_1         
	//   81  225:invokeinterface #264 <Method boolean Iterator.hasNext()>
	//   82  230:ifeq            249
	//   83  233:aload_0         
	//   84  234:aload_1         
	//   85  235:invokeinterface #258 <Method Object Iterator.next()>
	//   86  240:checkcast       #163 <Class VersionedParcelable>
	//   87  243:invokevirtual   #283 <Method void writeVersionedParcelable(VersionedParcelable)>
				break;
			}
		}
	//*  88  246:goto            224
	//   89  249:return          
	}

	private void writeSerializable(Serializable serializable)
	{
		if(serializable == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
		{
			writeString(((String) (null)));
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #271 <Method void writeString(String)>
			return;
	//    5    9:return          
		}
		String s = ((Object) (serializable)).getClass().getName();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #109 <Method Class Object.getClass()>
	//    8   14:invokevirtual   #168 <Method String Class.getName()>
	//    9   17:astore_2        
		writeString(s);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #271 <Method void writeString(String)>
		Object obj = ((Object) (new ByteArrayOutputStream()));
	//   13   23:new             #288 <Class ByteArrayOutputStream>
	//   14   26:dup             
	//   15   27:invokespecial   #289 <Method void ByteArrayOutputStream()>
	//   16   30:astore_3        
		try
		{
			ObjectOutputStream objectoutputstream = new ObjectOutputStream(((java.io.OutputStream) (obj)));
	//   17   31:new             #291 <Class ObjectOutputStream>
	//   18   34:dup             
	//   19   35:aload_3         
	//   20   36:invokespecial   #294 <Method void ObjectOutputStream(java.io.OutputStream)>
	//   21   39:astore          4
			objectoutputstream.writeObject(((Object) (serializable)));
	//   22   41:aload           4
	//   23   43:aload_1         
	//   24   44:invokevirtual   #298 <Method void ObjectOutputStream.writeObject(Object)>
			objectoutputstream.close();
	//   25   47:aload           4
	//   26   49:invokevirtual   #301 <Method void ObjectOutputStream.close()>
			writeByteArray(((ByteArrayOutputStream) (obj)).toByteArray());
	//   27   52:aload_0         
	//   28   53:aload_3         
	//   29   54:invokevirtual   #305 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   30   57:invokevirtual   #309 <Method void writeByteArray(byte[])>
			return;
	//   31   60:return          
		}
		// Misplaced declaration of an exception variable
		catch(Serializable serializable)
	//*  32   61:astore_1        
		{
			obj = ((Object) (new StringBuilder()));
	//   33   62:new             #53  <Class StringBuilder>
	//   34   65:dup             
	//   35   66:invokespecial   #54  <Method void StringBuilder()>
	//   36   69:astore_3        
		}
		((StringBuilder) (obj)).append("VersionedParcelable encountered IOException writing serializable object (name = ");
	//   37   70:aload_3         
	//   38   71:ldc2            #311 <String "VersionedParcelable encountered IOException writing serializable object (name = ">
	//   39   74:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   40   77:pop             
		((StringBuilder) (obj)).append(s);
	//   41   78:aload_3         
	//   42   79:aload_2         
	//   43   80:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   44   83:pop             
		((StringBuilder) (obj)).append(")");
	//   45   84:aload_3         
	//   46   85:ldc2            #313 <String ")">
	//   47   88:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   48   91:pop             
		throw new RuntimeException(((StringBuilder) (obj)).toString(), ((Throwable) (serializable)));
	//   49   92:new             #67  <Class RuntimeException>
	//   50   95:dup             
	//   51   96:aload_3         
	//   52   97:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   53  100:aload_1         
	//   54  101:invokespecial   #228 <Method void RuntimeException(String, Throwable)>
	//   55  104:athrow          
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
	//    1    1:invokestatic    #317 <Method Class findParcelClass(VersionedParcelable)>
	//    2    4:ldc2            #319 <String "write">
	//    3    7:iconst_2        
	//    4    8:anewarray       Class[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:aload_0         
	//    8   14:invokevirtual   #109 <Method Class Object.getClass()>
	//    9   17:aastore         
	//   10   18:dup             
	//   11   19:iconst_1        
	//   12   20:ldc1            #2   <Class VersionedParcel>
	//   13   22:aastore         
	//   14   23:invokevirtual   #217 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   15   26:aconst_null     
	//   16   27:iconst_2        
	//   17   28:anewarray       Object[]
	//   18   31:dup             
	//   19   32:iconst_0        
	//   20   33:aload_0         
	//   21   34:aastore         
	//   22   35:dup             
	//   23   36:iconst_1        
	//   24   37:aload_1         
	//   25   38:aastore         
	//   26   39:invokevirtual   #223 <Method Object Method.invoke(Object, Object[])>
	//   27   42:pop             
			return;
	//   28   43:return          
		}
	//*  29   44:astore_0        
	//*  30   45:new             #67  <Class RuntimeException>
	//*  31   48:dup             
	//*  32   49:ldc1            #225 <String "VersionedParcel encountered ClassNotFoundException">
	//*  33   51:aload_0         
	//*  34   52:invokespecial   #228 <Method void RuntimeException(String, Throwable)>
	//*  35   55:athrow          
	//*  36   56:astore_0        
	//*  37   57:new             #67  <Class RuntimeException>
	//*  38   60:dup             
	//*  39   61:ldc1            #230 <String "VersionedParcel encountered NoSuchMethodException">
	//*  40   63:aload_0         
	//*  41   64:invokespecial   #228 <Method void RuntimeException(String, Throwable)>
	//*  42   67:athrow          
	//*  43   68:astore_0        
	//*  44   69:aload_0         
	//*  45   70:invokevirtual   #231 <Method Throwable InvocationTargetException.getCause()>
	//*  46   73:instanceof      #67  <Class RuntimeException>
	//*  47   76:ifeq            87
	//*  48   79:aload_0         
	//*  49   80:invokevirtual   #231 <Method Throwable InvocationTargetException.getCause()>
	//*  50   83:checkcast       #67  <Class RuntimeException>
	//*  51   86:athrow          
	//*  52   87:new             #67  <Class RuntimeException>
	//*  53   90:dup             
	//*  54   91:ldc1            #233 <String "VersionedParcel encountered InvocationTargetException">
	//*  55   93:aload_0         
	//*  56   94:invokespecial   #228 <Method void RuntimeException(String, Throwable)>
	//*  57   97:athrow          
		// Misplaced declaration of an exception variable
		catch(VersionedParcelable versionedparcelable)
	//*  58   98:astore_0        
		{
			throw new RuntimeException("VersionedParcel encountered IllegalAccessException", ((Throwable) (versionedparcelable)));
	//   59   99:new             #67  <Class RuntimeException>
	//   60  102:dup             
	//   61  103:ldc1            #235 <String "VersionedParcel encountered IllegalAccessException">
	//   62  105:aload_0         
	//   63  106:invokespecial   #228 <Method void RuntimeException(String, Throwable)>
	//   64  109:athrow          
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
	//    1    1:invokevirtual   #109 <Method Class Object.getClass()>
	//    2    4:invokestatic    #112 <Method Class findParcelClass(Class)>
	//    3    7:astore_2        
		}
	//*   4    8:aload_0         
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #168 <Method String Class.getName()>
	//*   7   13:invokevirtual   #271 <Method void writeString(String)>
	//*   8   16:return          
		catch(ClassNotFoundException classnotfoundexception)
	//*   9   17:astore_2        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   18:new             #53  <Class StringBuilder>
	//   11   21:dup             
	//   12   22:invokespecial   #54  <Method void StringBuilder()>
	//   13   25:astore_3        
			stringbuilder.append(((Object) (versionedparcelable)).getClass().getSimpleName());
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #109 <Method Class Object.getClass()>
	//   17   31:invokevirtual   #131 <Method String Class.getSimpleName()>
	//   18   34:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(" does not have a Parcelizer");
	//   20   38:aload_3         
	//   21   39:ldc2            #323 <String " does not have a Parcelizer">
	//   22   42:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
			throw new RuntimeException(stringbuilder.toString(), ((Throwable) (classnotfoundexception)));
	//   24   46:new             #67  <Class RuntimeException>
	//   25   49:dup             
	//   26   50:aload_3         
	//   27   51:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   28   54:aload_2         
	//   29   55:invokespecial   #228 <Method void RuntimeException(String, Throwable)>
	//   30   58:athrow          
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

	protected Object[] readArray(Object aobj[])
	{
		int i = readInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #177 <Method int readInt()>
	//    2    4:istore_2        
		if(i < 0)
	//*   3    5:iload_2         
	//*   4    6:ifge            11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		ArrayList arraylist = new ArrayList(i);
	//    7   11:new             #331 <Class ArrayList>
	//    8   14:dup             
	//    9   15:iload_2         
	//   10   16:invokespecial   #333 <Method void ArrayList(int)>
	//   11   19:astore          8
		if(i != 0)
	//*  12   21:iload_2         
	//*  13   22:ifeq            201
		{
			int j1 = readInt();
	//   14   25:aload_0         
	//   15   26:invokevirtual   #177 <Method int readInt()>
	//   16   29:istore          7
			if(i < 0)
	//*  17   31:iload_2         
	//*  18   32:ifge            37
				return null;
	//   19   35:aconst_null     
	//   20   36:areturn         
			int j = i;
	//   21   37:iload_2         
	//   22   38:istore_3        
			int k = i;
	//   23   39:iload_2         
	//   24   40:istore          4
			int l = i;
	//   25   42:iload_2         
	//   26   43:istore          5
			int i1 = i;
	//   27   45:iload_2         
	//   28   46:istore          6
			switch(j1)
	//*  29   48:iload           7
			{
			default:
				break;

	//*  30   50:tableswitch     1 5: default 84
	//	               1 180
	//	               2 156
	//	               3 132
	//	               4 108
	//	               5 87
	//*  31   84:goto            201
			case 5: // '\005'
				for(; j > 0; j--)
	//*  32   87:iload_3         
	//*  33   88:ifle            201
					arraylist.add(((Object) (readStrongBinder())));
	//   34   91:aload           8
	//   35   93:aload_0         
	//   36   94:invokevirtual   #181 <Method IBinder readStrongBinder()>
	//   37   97:invokevirtual   #334 <Method boolean ArrayList.add(Object)>
	//   38  100:pop             

	//   39  101:iload_3         
	//   40  102:iconst_1        
	//   41  103:isub            
	//   42  104:istore_3        
				break;
	//   43  105:goto            87

			case 4: // '\004'
				for(; k > 0; k--)
	//*  44  108:iload           4
	//*  45  110:ifle            201
					arraylist.add(((Object) (readString())));
	//   46  113:aload           8
	//   47  115:aload_0         
	//   48  116:invokevirtual   #190 <Method String readString()>
	//   49  119:invokevirtual   #334 <Method boolean ArrayList.add(Object)>
	//   50  122:pop             

	//   51  123:iload           4
	//   52  125:iconst_1        
	//   53  126:isub            
	//   54  127:istore          4
				break;
	//   55  129:goto            108

			case 3: // '\003'
				for(; l > 0; l--)
	//*  56  132:iload           5
	//*  57  134:ifle            201
					arraylist.add(((Object) (readSerializable())));
	//   58  137:aload           8
	//   59  139:aload_0         
	//   60  140:invokevirtual   #194 <Method Serializable readSerializable()>
	//   61  143:invokevirtual   #334 <Method boolean ArrayList.add(Object)>
	//   62  146:pop             

	//   63  147:iload           5
	//   64  149:iconst_1        
	//   65  150:isub            
	//   66  151:istore          5
				break;
	//   67  153:goto            132

			case 2: // '\002'
				for(; i1 > 0; i1--)
	//*  68  156:iload           6
	//*  69  158:ifle            201
					arraylist.add(((Object) (readParcelable())));
	//   70  161:aload           8
	//   71  163:aload_0         
	//   72  164:invokevirtual   #99  <Method Parcelable readParcelable()>
	//   73  167:invokevirtual   #334 <Method boolean ArrayList.add(Object)>
	//   74  170:pop             

	//   75  171:iload           6
	//   76  173:iconst_1        
	//   77  174:isub            
	//   78  175:istore          6
				break;
	//   79  177:goto            156

			case 1: // '\001'
				for(; i > 0; i--)
	//*  80  180:iload_2         
	//*  81  181:ifle            201
					arraylist.add(((Object) (readVersionedParcelable())));
	//   82  184:aload           8
	//   83  186:aload_0         
	//   84  187:invokevirtual   #198 <Method VersionedParcelable readVersionedParcelable()>
	//   85  190:invokevirtual   #334 <Method boolean ArrayList.add(Object)>
	//   86  193:pop             

	//   87  194:iload_2         
	//   88  195:iconst_1        
	//   89  196:isub            
	//   90  197:istore_2        
				break;
			}
		}
	//*  91  198:goto            180
		return arraylist.toArray(aobj);
	//   92  201:aload           8
	//   93  203:aload_1         
	//   94  204:invokevirtual   #337 <Method Object[] ArrayList.toArray(Object[])>
	//   95  207:areturn         
	}

	public Object[] readArray(Object aobj[], int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #343 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return aobj;
	//    4    8:aload_1         
	//    5    9:areturn         
		else
			return readArray(aobj);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #345 <Method Object[] readArray(Object[])>
	//    9   15:areturn         
	}

	protected abstract boolean readBoolean();

	public boolean readBoolean(boolean flag, int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #343 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return flag;
	//    4    8:iload_1         
	//    5    9:ireturn         
		else
			return readBoolean();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #350 <Method boolean readBoolean()>
	//    8   14:ireturn         
	}

	protected boolean[] readBooleanArray()
	{
		int j = readInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #177 <Method int readInt()>
	//    2    4:istore_2        
		if(j < 0)
	//*   3    5:iload_2         
	//*   4    6:ifge            11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		boolean aflag[] = new boolean[j];
	//    7   11:iload_2         
	//    8   12:newarray        boolean[]
	//    9   14:astore          4
		for(int i = 0; i < j; i++)
	//*  10   16:iconst_0        
	//*  11   17:istore_1        
	//*  12   18:iload_1         
	//*  13   19:iload_2         
	//*  14   20:icmpge          49
		{
			boolean flag;
			if(readInt() != 0)
	//*  15   23:aload_0         
	//*  16   24:invokevirtual   #177 <Method int readInt()>
	//*  17   27:ifeq            35
				flag = true;
	//   18   30:iconst_1        
	//   19   31:istore_3        
			else
	//*  20   32:goto            37
				flag = false;
	//   21   35:iconst_0        
	//   22   36:istore_3        
			aflag[i] = flag;
	//   23   37:aload           4
	//   24   39:iload_1         
	//   25   40:iload_3         
	//   26   41:bastore         
		}

	//   27   42:iload_1         
	//   28   43:iconst_1        
	//   29   44:iadd            
	//   30   45:istore_1        
	//*  31   46:goto            18
		return aflag;
	//   32   49:aload           4
	//   33   51:areturn         
	}

	public boolean[] readBooleanArray(boolean aflag[], int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #343 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return aflag;
	//    4    8:aload_1         
	//    5    9:areturn         
		else
			return readBooleanArray();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #355 <Method boolean[] readBooleanArray()>
	//    8   14:areturn         
	}

	protected abstract Bundle readBundle();

	public Bundle readBundle(Bundle bundle, int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #343 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return bundle;
	//    4    8:aload_1         
	//    5    9:areturn         
		else
			return readBundle();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #360 <Method Bundle readBundle()>
	//    8   14:areturn         
	}

	public byte readByte(byte byte0, int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #343 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return byte0;
	//    4    8:iload_1         
	//    5    9:ireturn         
		else
			return (byte)(readInt() & 0xff);
	//    6   10:aload_0         
	//    7   11:invokevirtual   #177 <Method int readInt()>
	//    8   14:sipush          255
	//    9   17:iand            
	//   10   18:int2byte        
	//   11   19:ireturn         
	}

	protected abstract byte[] readByteArray();

	public byte[] readByteArray(byte abyte0[], int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #343 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return abyte0;
	//    4    8:aload_1         
	//    5    9:areturn         
		else
			return readByteArray();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #366 <Method byte[] readByteArray()>
	//    8   14:areturn         
	}

	public char[] readCharArray(char ac[], int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #343 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return ac;
	//    4    8:aload_1         
	//    5    9:areturn         
		int j = readInt();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #177 <Method int readInt()>
	//    8   14:istore_3        
		if(j < 0)
	//*   9   15:iload_3         
	//*  10   16:ifge            21
			return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
		ac = new char[j];
	//   13   21:iload_3         
	//   14   22:newarray        char[]
	//   15   24:astore_1        
		for(i = 0; i < j; i++)
	//*  16   25:iconst_0        
	//*  17   26:istore_2        
	//*  18   27:iload_2         
	//*  19   28:iload_3         
	//*  20   29:icmpge          47
			ac[i] = (char)readInt();
	//   21   32:aload_1         
	//   22   33:iload_2         
	//   23   34:aload_0         
	//   24   35:invokevirtual   #177 <Method int readInt()>
	//   25   38:int2char        
	//   26   39:castore         

	//   27   40:iload_2         
	//   28   41:iconst_1        
	//   29   42:iadd            
	//   30   43:istore_2        
	//*  31   44:goto            27
		return ac;
	//   32   47:aload_1         
	//   33   48:areturn         
	}

	protected abstract double readDouble();

	public double readDouble(double d, int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_3         
	//*   2    2:invokevirtual   #343 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return d;
	//    4    8:dload_1         
	//    5    9:dreturn         
		else
			return readDouble();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #373 <Method double readDouble()>
	//    8   14:dreturn         
	}

	protected double[] readDoubleArray()
	{
		int j = readInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #177 <Method int readInt()>
	//    2    4:istore_2        
		if(j < 0)
	//*   3    5:iload_2         
	//*   4    6:ifge            11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		double ad[] = new double[j];
	//    7   11:iload_2         
	//    8   12:newarray        double[]
	//    9   14:astore_3        
		for(int i = 0; i < j; i++)
	//*  10   15:iconst_0        
	//*  11   16:istore_1        
	//*  12   17:iload_1         
	//*  13   18:iload_2         
	//*  14   19:icmpge          36
			ad[i] = readDouble();
	//   15   22:aload_3         
	//   16   23:iload_1         
	//   17   24:aload_0         
	//   18   25:invokevirtual   #373 <Method double readDouble()>
	//   19   28:dastore         

	//   20   29:iload_1         
	//   21   30:iconst_1        
	//   22   31:iadd            
	//   23   32:istore_1        
	//*  24   33:goto            17
		return ad;
	//   25   36:aload_3         
	//   26   37:areturn         
	}

	public double[] readDoubleArray(double ad[], int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #343 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return ad;
	//    4    8:aload_1         
	//    5    9:areturn         
		else
			return readDoubleArray();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #378 <Method double[] readDoubleArray()>
	//    8   14:areturn         
	}

	public Exception readException(Exception exception, int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #343 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return exception;
	//    4    8:aload_1         
	//    5    9:areturn         
		i = readExceptionCode();
	//    6   10:aload_0         
	//    7   11:invokespecial   #381 <Method int readExceptionCode()>
	//    8   14:istore_2        
		if(i != 0)
	//*   9   15:iload_2         
	//*  10   16:ifeq            29
			return readException(i, readString());
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:aload_0         
	//   14   22:invokevirtual   #190 <Method String readString()>
	//   15   25:invokespecial   #383 <Method Exception readException(int, String)>
	//   16   28:areturn         
		else
			return exception;
	//   17   29:aload_1         
	//   18   30:areturn         
	}

	protected abstract boolean readField(int i);

	protected abstract float readFloat();

	public float readFloat(float f, int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #343 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return f;
	//    4    8:fload_1         
	//    5    9:freturn         
		else
			return readFloat();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #388 <Method float readFloat()>
	//    8   14:freturn         
	}

	protected float[] readFloatArray()
	{
		int j = readInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #177 <Method int readInt()>
	//    2    4:istore_2        
		if(j < 0)
	//*   3    5:iload_2         
	//*   4    6:ifge            11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		float af[] = new float[j];
	//    7   11:iload_2         
	//    8   12:newarray        float[]
	//    9   14:astore_3        
		for(int i = 0; i < j; i++)
	//*  10   15:iconst_0        
	//*  11   16:istore_1        
	//*  12   17:iload_1         
	//*  13   18:iload_2         
	//*  14   19:icmpge          36
			af[i] = readFloat();
	//   15   22:aload_3         
	//   16   23:iload_1         
	//   17   24:aload_0         
	//   18   25:invokevirtual   #388 <Method float readFloat()>
	//   19   28:fastore         

	//   20   29:iload_1         
	//   21   30:iconst_1        
	//   22   31:iadd            
	//   23   32:istore_1        
	//*  24   33:goto            17
		return af;
	//   25   36:aload_3         
	//   26   37:areturn         
	}

	public float[] readFloatArray(float af[], int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #343 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return af;
	//    4    8:aload_1         
	//    5    9:areturn         
		else
			return readFloatArray();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #393 <Method float[] readFloatArray()>
	//    8   14:areturn         
	}

	protected abstract int readInt();

	public int readInt(int i, int j)
	{
		if(!readField(j))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #343 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return i;
	//    4    8:iload_1         
	//    5    9:ireturn         
		else
			return readInt();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #177 <Method int readInt()>
	//    8   14:ireturn         
	}

	protected int[] readIntArray()
	{
		int j = readInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #177 <Method int readInt()>
	//    2    4:istore_2        
		if(j < 0)
	//*   3    5:iload_2         
	//*   4    6:ifge            11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		int ai[] = new int[j];
	//    7   11:iload_2         
	//    8   12:newarray        int[]
	//    9   14:astore_3        
		for(int i = 0; i < j; i++)
	//*  10   15:iconst_0        
	//*  11   16:istore_1        
	//*  12   17:iload_1         
	//*  13   18:iload_2         
	//*  14   19:icmpge          36
			ai[i] = readInt();
	//   15   22:aload_3         
	//   16   23:iload_1         
	//   17   24:aload_0         
	//   18   25:invokevirtual   #177 <Method int readInt()>
	//   19   28:iastore         

	//   20   29:iload_1         
	//   21   30:iconst_1        
	//   22   31:iadd            
	//   23   32:istore_1        
	//*  24   33:goto            17
		return ai;
	//   25   36:aload_3         
	//   26   37:areturn         
	}

	public int[] readIntArray(int ai[], int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #343 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return ai;
	//    4    8:aload_1         
	//    5    9:areturn         
		else
			return readIntArray();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #399 <Method int[] readIntArray()>
	//    8   14:areturn         
	}

	public List readList(List list, int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #343 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return list;
	//    4    8:aload_1         
	//    5    9:areturn         
		else
			return (List)readCollection(i, ((Collection) (new ArrayList())));
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:new             #331 <Class ArrayList>
	//    9   15:dup             
	//   10   16:invokespecial   #402 <Method void ArrayList()>
	//   11   19:invokespecial   #404 <Method Collection readCollection(int, Collection)>
	//   12   22:checkcast       #406 <Class List>
	//   13   25:areturn         
	}

	protected abstract long readLong();

	public long readLong(long l, int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_3         
	//*   2    2:invokevirtual   #343 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return l;
	//    4    8:lload_1         
	//    5    9:lreturn         
		else
			return readLong();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #412 <Method long readLong()>
	//    8   14:lreturn         
	}

	protected long[] readLongArray()
	{
		int j = readInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #177 <Method int readInt()>
	//    2    4:istore_2        
		if(j < 0)
	//*   3    5:iload_2         
	//*   4    6:ifge            11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		long al[] = new long[j];
	//    7   11:iload_2         
	//    8   12:newarray        long[]
	//    9   14:astore_3        
		for(int i = 0; i < j; i++)
	//*  10   15:iconst_0        
	//*  11   16:istore_1        
	//*  12   17:iload_1         
	//*  13   18:iload_2         
	//*  14   19:icmpge          36
			al[i] = readLong();
	//   15   22:aload_3         
	//   16   23:iload_1         
	//   17   24:aload_0         
	//   18   25:invokevirtual   #412 <Method long readLong()>
	//   19   28:lastore         

	//   20   29:iload_1         
	//   21   30:iconst_1        
	//   22   31:iadd            
	//   23   32:istore_1        
	//*  24   33:goto            17
		return al;
	//   25   36:aload_3         
	//   26   37:areturn         
	}

	public long[] readLongArray(long al[], int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #343 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return al;
	//    4    8:aload_1         
	//    5    9:areturn         
		else
			return readLongArray();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #417 <Method long[] readLongArray()>
	//    8   14:areturn         
	}

	protected abstract Parcelable readParcelable();

	public Parcelable readParcelable(Parcelable parcelable, int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #343 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return parcelable;
	//    4    8:aload_1         
	//    5    9:areturn         
		else
			return readParcelable();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #99  <Method Parcelable readParcelable()>
	//    8   14:areturn         
	}

	protected Serializable readSerializable()
	{
		String s = readString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #190 <Method String readString()>
	//    2    4:astore_1        
		if(s == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		Object obj = ((Object) (new ByteArrayInputStream(readByteArray())));
	//    7   11:new             #421 <Class ByteArrayInputStream>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokevirtual   #366 <Method byte[] readByteArray()>
	//   11   19:invokespecial   #423 <Method void ByteArrayInputStream(byte[])>
	//   12   22:astore_2        
		try
		{
			obj = ((Object) ((Serializable)((ObjectInputStream) (new ObjectInputStream(((InputStream) (obj))) {

				protected Class resolveClass(ObjectStreamClass objectstreamclass)
					throws IOException, ClassNotFoundException
				{
					Class class1 = Class.forName(objectstreamclass.getName(), false, ((Object)this).getClass().getClassLoader());
				//    0    0:aload_1         
				//    1    1:invokevirtual   #31  <Method String ObjectStreamClass.getName()>
				//    2    4:iconst_0        
				//    3    5:aload_0         
				//    4    6:invokevirtual   #37  <Method Class Object.getClass()>
				//    5    9:invokevirtual   #43  <Method ClassLoader Class.getClassLoader()>
				//    6   12:invokestatic    #47  <Method Class Class.forName(String, boolean, ClassLoader)>
				//    7   15:astore_2        
					if(class1 != null)
				//*   8   16:aload_2         
				//*   9   17:ifnull          22
						return class1;
				//   10   20:aload_2         
				//   11   21:areturn         
					else
						return super.resolveClass(objectstreamclass);
				//   12   22:aload_0         
				//   13   23:aload_1         
				//   14   24:invokespecial   #49  <Method Class ObjectInputStream.resolveClass(ObjectStreamClass)>
				//   15   27:areturn         
				}

				final VersionedParcel this$0;

			
			{
				this$0 = VersionedParcel.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field VersionedParcel this$0>
				super(inputstream);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void ObjectInputStream(InputStream)>
			//    6   10:return          
			}
			}
)).readObject()));
	//   13   23:new             #6   <Class VersionedParcel$1>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:aload_2         
	//   17   29:invokespecial   #426 <Method void VersionedParcel$1(VersionedParcel, InputStream)>
	//   18   32:invokevirtual   #431 <Method Object ObjectInputStream.readObject()>
	//   19   35:checkcast       #165 <Class Serializable>
	//   20   38:astore_2        
		}
	//*  21   39:aload_2         
	//*  22   40:areturn         
	//*  23   41:astore_2        
	//*  24   42:new             #53  <Class StringBuilder>
	//*  25   45:dup             
	//*  26   46:invokespecial   #54  <Method void StringBuilder()>
	//*  27   49:astore_3        
	//*  28   50:aload_3         
	//*  29   51:ldc2            #433 <String "VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = ">
	//*  30   54:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//*  31   57:pop             
	//*  32   58:aload_3         
	//*  33   59:aload_1         
	//*  34   60:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//*  35   63:pop             
	//*  36   64:aload_3         
	//*  37   65:ldc2            #313 <String ")">
	//*  38   68:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//*  39   71:pop             
	//*  40   72:new             #67  <Class RuntimeException>
	//*  41   75:dup             
	//*  42   76:aload_3         
	//*  43   77:invokevirtual   #71  <Method String StringBuilder.toString()>
	//*  44   80:aload_2         
	//*  45   81:invokespecial   #228 <Method void RuntimeException(String, Throwable)>
	//*  46   84:athrow          
		catch(IOException ioexception)
	//*  47   85:astore_2        
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   48   86:new             #53  <Class StringBuilder>
	//   49   89:dup             
	//   50   90:invokespecial   #54  <Method void StringBuilder()>
	//   51   93:astore_3        
			stringbuilder1.append("VersionedParcelable encountered IOException reading a Serializable object (name = ");
	//   52   94:aload_3         
	//   53   95:ldc2            #435 <String "VersionedParcelable encountered IOException reading a Serializable object (name = ">
	//   54   98:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   55  101:pop             
			stringbuilder1.append(s);
	//   56  102:aload_3         
	//   57  103:aload_1         
	//   58  104:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   59  107:pop             
			stringbuilder1.append(")");
	//   60  108:aload_3         
	//   61  109:ldc2            #313 <String ")">
	//   62  112:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   63  115:pop             
			throw new RuntimeException(stringbuilder1.toString(), ((Throwable) (ioexception)));
	//   64  116:new             #67  <Class RuntimeException>
	//   65  119:dup             
	//   66  120:aload_3         
	//   67  121:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   68  124:aload_2         
	//   69  125:invokespecial   #228 <Method void RuntimeException(String, Throwable)>
	//   70  128:athrow          
		}
		catch(ClassNotFoundException classnotfoundexception)
		{
			StringBuilder stringbuilder = new StringBuilder();
			stringbuilder.append("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = ");
			stringbuilder.append(s);
			stringbuilder.append(")");
			throw new RuntimeException(stringbuilder.toString(), ((Throwable) (classnotfoundexception)));
		}
		return ((Serializable) (obj));
	}

	public Set readSet(Set set, int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #343 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return set;
	//    4    8:aload_1         
	//    5    9:areturn         
		else
			return (Set)readCollection(i, ((Collection) (new ArraySet())));
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:new             #439 <Class ArraySet>
	//    9   15:dup             
	//   10   16:invokespecial   #440 <Method void ArraySet()>
	//   11   19:invokespecial   #404 <Method Collection readCollection(int, Collection)>
	//   12   22:checkcast       #442 <Class Set>
	//   13   25:areturn         
	}

	public Size readSize(Size size, int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #343 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return size;
	//    4    8:aload_1         
	//    5    9:areturn         
		if(readBoolean())
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #350 <Method boolean readBoolean()>
	//*   8   14:ifeq            33
			return new Size(readInt(), readInt());
	//    9   17:new             #450 <Class Size>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokevirtual   #177 <Method int readInt()>
	//   13   25:aload_0         
	//   14   26:invokevirtual   #177 <Method int readInt()>
	//   15   29:invokespecial   #453 <Method void Size(int, int)>
	//   16   32:areturn         
		else
			return null;
	//   17   33:aconst_null     
	//   18   34:areturn         
	}

	public SizeF readSizeF(SizeF sizef, int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #343 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return sizef;
	//    4    8:aload_1         
	//    5    9:areturn         
		if(readBoolean())
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #350 <Method boolean readBoolean()>
	//*   8   14:ifeq            33
			return new SizeF(readFloat(), readFloat());
	//    9   17:new             #457 <Class SizeF>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokevirtual   #388 <Method float readFloat()>
	//   13   25:aload_0         
	//   14   26:invokevirtual   #388 <Method float readFloat()>
	//   15   29:invokespecial   #460 <Method void SizeF(float, float)>
	//   16   32:areturn         
		else
			return null;
	//   17   33:aconst_null     
	//   18   34:areturn         
	}

	public SparseBooleanArray readSparseBooleanArray(SparseBooleanArray sparsebooleanarray, int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #343 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return sparsebooleanarray;
	//    4    8:aload_1         
	//    5    9:areturn         
		int j = readInt();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #177 <Method int readInt()>
	//    8   14:istore_3        
		if(j < 0)
	//*   9   15:iload_3         
	//*  10   16:ifge            21
			return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
		sparsebooleanarray = new SparseBooleanArray(j);
	//   13   21:new             #464 <Class SparseBooleanArray>
	//   14   24:dup             
	//   15   25:iload_3         
	//   16   26:invokespecial   #465 <Method void SparseBooleanArray(int)>
	//   17   29:astore_1        
		for(i = 0; i < j; i++)
	//*  18   30:iconst_0        
	//*  19   31:istore_2        
	//*  20   32:iload_2         
	//*  21   33:iload_3         
	//*  22   34:icmpge          56
			sparsebooleanarray.put(readInt(), readBoolean());
	//   23   37:aload_1         
	//   24   38:aload_0         
	//   25   39:invokevirtual   #177 <Method int readInt()>
	//   26   42:aload_0         
	//   27   43:invokevirtual   #350 <Method boolean readBoolean()>
	//   28   46:invokevirtual   #469 <Method void SparseBooleanArray.put(int, boolean)>

	//   29   49:iload_2         
	//   30   50:iconst_1        
	//   31   51:iadd            
	//   32   52:istore_2        
	//*  33   53:goto            32
		return sparsebooleanarray;
	//   34   56:aload_1         
	//   35   57:areturn         
	}

	protected abstract String readString();

	public String readString(String s, int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #343 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return s;
	//    4    8:aload_1         
	//    5    9:areturn         
		else
			return readString();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #190 <Method String readString()>
	//    8   14:areturn         
	}

	protected abstract IBinder readStrongBinder();

	public IBinder readStrongBinder(IBinder ibinder, int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #343 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return ibinder;
	//    4    8:aload_1         
	//    5    9:areturn         
		else
			return readStrongBinder();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #181 <Method IBinder readStrongBinder()>
	//    8   14:areturn         
	}

	protected VersionedParcelable readVersionedParcelable()
	{
		String s = readString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #190 <Method String readString()>
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
	//    9   13:invokevirtual   #473 <Method VersionedParcel createSubParcel()>
	//   10   16:invokestatic    #475 <Method VersionedParcelable readFromParcel(String, VersionedParcel)>
	//   11   19:areturn         
	}

	public VersionedParcelable readVersionedParcelable(VersionedParcelable versionedparcelable, int i)
	{
		if(!readField(i))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #343 <Method boolean readField(int)>
	//*   3    5:ifne            10
			return versionedparcelable;
	//    4    8:aload_1         
	//    5    9:areturn         
		else
			return readVersionedParcelable();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #198 <Method VersionedParcelable readVersionedParcelable()>
	//    8   14:areturn         
	}

	protected abstract void setOutputField(int i);

	public void setSerializationFlags(boolean flag, boolean flag1)
	{
	//    0    0:return          
	}

	protected void writeArray(Object aobj[])
	{
		if(aobj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
		{
			writeInt(-1);
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:invokevirtual   #245 <Method void writeInt(int)>
			return;
	//    5    9:return          
		}
		int j1 = aobj.length;
	//    6   10:aload_1         
	//    7   11:arraylength     
	//    8   12:istore          7
		writeInt(j1);
	//    9   14:aload_0         
	//   10   15:iload           7
	//   11   17:invokevirtual   #245 <Method void writeInt(int)>
		if(j1 > 0)
	//*  12   20:iload           7
	//*  13   22:ifle            216
		{
			int j = 0;
	//   14   25:iconst_0        
	//   15   26:istore_3        
			int k = 0;
	//   16   27:iconst_0        
	//   17   28:istore          4
			int l = 0;
	//   18   30:iconst_0        
	//   19   31:istore          5
			int i1 = 0;
	//   20   33:iconst_0        
	//   21   34:istore          6
			int i = 0;
	//   22   36:iconst_0        
	//   23   37:istore_2        
			int k1 = getType(aobj[0]);
	//   24   38:aload_0         
	//   25   39:aload_1         
	//   26   40:iconst_0        
	//   27   41:aaload          
	//   28   42:invokespecial   #260 <Method int getType(Object)>
	//   29   45:istore          8
			writeInt(k1);
	//   30   47:aload_0         
	//   31   48:iload           8
	//   32   50:invokevirtual   #245 <Method void writeInt(int)>
			switch(k1)
	//*  33   53:iload           8
			{
	//*  34   55:tableswitch     1 5: default 88
	//	               1 189
	//	               2 162
	//	               3 135
	//	               4 112
	//	               5 89
			default:
				return;
	//   35   88:return          

			case 5: // '\005'
				for(; i < j1; i++)
	//*  36   89:iload_2         
	//*  37   90:iload           7
	//*  38   92:icmpge          216
					writeStrongBinder((IBinder)aobj[i]);
	//   39   95:aload_0         
	//   40   96:aload_1         
	//   41   97:iload_2         
	//   42   98:aaload          
	//   43   99:checkcast       #167 <Class IBinder>
	//   44  102:invokevirtual   #268 <Method void writeStrongBinder(IBinder)>

	//   45  105:iload_2         
	//   46  106:iconst_1        
	//   47  107:iadd            
	//   48  108:istore_2        
				break;
	//   49  109:goto            89

			case 4: // '\004'
				for(; j < j1; j++)
	//*  50  112:iload_3         
	//*  51  113:iload           7
	//*  52  115:icmpge          216
					writeString((String)aobj[j]);
	//   53  118:aload_0         
	//   54  119:aload_1         
	//   55  120:iload_3         
	//   56  121:aaload          
	//   57  122:checkcast       #133 <Class String>
	//   58  125:invokevirtual   #271 <Method void writeString(String)>

	//   59  128:iload_3         
	//   60  129:iconst_1        
	//   61  130:iadd            
	//   62  131:istore_3        
				break;
	//   63  132:goto            112

			case 3: // '\003'
				for(; k < j1; k++)
	//*  64  135:iload           4
	//*  65  137:iload           7
	//*  66  139:icmpge          216
					writeSerializable((Serializable)aobj[k]);
	//   67  142:aload_0         
	//   68  143:aload_1         
	//   69  144:iload           4
	//   70  146:aaload          
	//   71  147:checkcast       #165 <Class Serializable>
	//   72  150:invokespecial   #275 <Method void writeSerializable(Serializable)>

	//   73  153:iload           4
	//   74  155:iconst_1        
	//   75  156:iadd            
	//   76  157:istore          4
				break;
	//   77  159:goto            135

			case 2: // '\002'
				for(; l < j1; l++)
	//*  78  162:iload           5
	//*  79  164:iload           7
	//*  80  166:icmpge          216
					writeParcelable((Parcelable)aobj[l]);
	//   81  169:aload_0         
	//   82  170:aload_1         
	//   83  171:iload           5
	//   84  173:aaload          
	//   85  174:checkcast       #161 <Class Parcelable>
	//   86  177:invokevirtual   #279 <Method void writeParcelable(Parcelable)>

	//   87  180:iload           5
	//   88  182:iconst_1        
	//   89  183:iadd            
	//   90  184:istore          5
				break;
	//   91  186:goto            162

			case 1: // '\001'
				for(; i1 < j1; i1++)
	//*  92  189:iload           6
	//*  93  191:iload           7
	//*  94  193:icmpge          216
					writeVersionedParcelable((VersionedParcelable)aobj[i1]);
	//   95  196:aload_0         
	//   96  197:aload_1         
	//   97  198:iload           6
	//   98  200:aaload          
	//   99  201:checkcast       #163 <Class VersionedParcelable>
	//  100  204:invokevirtual   #283 <Method void writeVersionedParcelable(VersionedParcelable)>

	//  101  207:iload           6
	//  102  209:iconst_1        
	//  103  210:iadd            
	//  104  211:istore          6
				break;
			}
		}
	//* 105  213:goto            189
	//  106  216:return          
	}

	public void writeArray(Object aobj[], int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #242 <Method void setOutputField(int)>
		writeArray(aobj);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #486 <Method void writeArray(Object[])>
	//    6   10:return          
	}

	protected abstract void writeBoolean(boolean flag);

	public void writeBoolean(boolean flag, int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #242 <Method void setOutputField(int)>
		writeBoolean(flag);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #492 <Method void writeBoolean(boolean)>
	//    6   10:return          
	}

	protected void writeBooleanArray(boolean aflag[])
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:553)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #67  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #496 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:553)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #499 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	public void writeBooleanArray(boolean aflag[], int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #242 <Method void setOutputField(int)>
		writeBooleanArray(aflag);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #502 <Method void writeBooleanArray(boolean[])>
	//    6   10:return          
	}

	protected abstract void writeBundle(Bundle bundle);

	public void writeBundle(Bundle bundle, int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #242 <Method void setOutputField(int)>
		writeBundle(bundle);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #507 <Method void writeBundle(Bundle)>
	//    6   10:return          
	}

	public void writeByte(byte byte0, int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #242 <Method void setOutputField(int)>
		writeInt(((int) (byte0)));
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #245 <Method void writeInt(int)>
	//    6   10:return          
	}

	protected abstract void writeByteArray(byte abyte0[]);

	public void writeByteArray(byte abyte0[], int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #242 <Method void setOutputField(int)>
		writeByteArray(abyte0);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #309 <Method void writeByteArray(byte[])>
	//    6   10:return          
	}

	protected abstract void writeByteArray(byte abyte0[], int i, int j);

	public void writeByteArray(byte abyte0[], int i, int j, int k)
	{
		setOutputField(k);
	//    0    0:aload_0         
	//    1    1:iload           4
	//    2    3:invokevirtual   #242 <Method void setOutputField(int)>
		writeByteArray(abyte0, i, j);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:iload_2         
	//    6    9:iload_3         
	//    7   10:invokevirtual   #514 <Method void writeByteArray(byte[], int, int)>
	//    8   13:return          
	}

	public void writeCharArray(char ac[], int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #242 <Method void setOutputField(int)>
		if(ac != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          38
		{
			int j = ac.length;
	//    5    9:aload_1         
	//    6   10:arraylength     
	//    7   11:istore_3        
			writeInt(j);
	//    8   12:aload_0         
	//    9   13:iload_3         
	//   10   14:invokevirtual   #245 <Method void writeInt(int)>
			for(i = 0; i < j; i++)
	//*  11   17:iconst_0        
	//*  12   18:istore_2        
	//*  13   19:iload_2         
	//*  14   20:iload_3         
	//*  15   21:icmpge          43
				writeInt(((int) (ac[i])));
	//   16   24:aload_0         
	//   17   25:aload_1         
	//   18   26:iload_2         
	//   19   27:caload          
	//   20   28:invokevirtual   #245 <Method void writeInt(int)>

	//   21   31:iload_2         
	//   22   32:iconst_1        
	//   23   33:iadd            
	//   24   34:istore_2        
		} else
	//*  25   35:goto            19
		{
			writeInt(-1);
	//   26   38:aload_0         
	//   27   39:iconst_m1       
	//   28   40:invokevirtual   #245 <Method void writeInt(int)>
		}
	//   29   43:return          
	}

	protected abstract void writeDouble(double d);

	public void writeDouble(double d, int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:invokevirtual   #242 <Method void setOutputField(int)>
		writeDouble(d);
	//    3    5:aload_0         
	//    4    6:dload_1         
	//    5    7:invokevirtual   #521 <Method void writeDouble(double)>
	//    6   10:return          
	}

	protected void writeDoubleArray(double ad[])
	{
		if(ad != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
		{
			int j = ad.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_3        
			writeInt(j);
	//    5    7:aload_0         
	//    6    8:iload_3         
	//    7    9:invokevirtual   #245 <Method void writeInt(int)>
			for(int i = 0; i < j; i++)
	//*   8   12:iconst_0        
	//*   9   13:istore_2        
	//*  10   14:iload_2         
	//*  11   15:iload_3         
	//*  12   16:icmpge          38
				writeDouble(ad[i]);
	//   13   19:aload_0         
	//   14   20:aload_1         
	//   15   21:iload_2         
	//   16   22:daload          
	//   17   23:invokevirtual   #521 <Method void writeDouble(double)>

	//   18   26:iload_2         
	//   19   27:iconst_1        
	//   20   28:iadd            
	//   21   29:istore_2        
		} else
	//*  22   30:goto            14
		{
			writeInt(-1);
	//   23   33:aload_0         
	//   24   34:iconst_m1       
	//   25   35:invokevirtual   #245 <Method void writeInt(int)>
		}
	//   26   38:return          
	}

	public void writeDoubleArray(double ad[], int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #242 <Method void setOutputField(int)>
		writeDoubleArray(ad);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #526 <Method void writeDoubleArray(double[])>
	//    6   10:return          
	}

	public void writeException(Exception exception, int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #242 <Method void setOutputField(int)>
		if(exception == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       14
		{
			writeNoException();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #531 <Method void writeNoException()>
			return;
	//    7   13:return          
		}
		i = 0;
	//    8   14:iconst_0        
	//    9   15:istore_2        
		if((exception instanceof Parcelable) && ((Object) (exception)).getClass().getClassLoader() == ((Class) (android/os/Parcelable)).getClassLoader())
	//*  10   16:aload_1         
	//*  11   17:instanceof      #161 <Class Parcelable>
	//*  12   20:ifeq            44
	//*  13   23:aload_1         
	//*  14   24:invokevirtual   #109 <Method Class Object.getClass()>
	//*  15   27:invokevirtual   #141 <Method ClassLoader Class.getClassLoader()>
	//*  16   30:ldc1            #161 <Class Parcelable>
	//*  17   32:invokevirtual   #141 <Method ClassLoader Class.getClassLoader()>
	//*  18   35:if_acmpne       44
			i = -9;
	//   19   38:bipush          -9
	//   20   40:istore_2        
		else
	//*  21   41:goto            131
		if(exception instanceof SecurityException)
	//*  22   44:aload_1         
	//*  23   45:instanceof      #76  <Class SecurityException>
	//*  24   48:ifeq            56
			i = -1;
	//   25   51:iconst_m1       
	//   26   52:istore_2        
		else
	//*  27   53:goto            131
		if(exception instanceof BadParcelableException)
	//*  28   56:aload_1         
	//*  29   57:instanceof      #79  <Class BadParcelableException>
	//*  30   60:ifeq            69
			i = -2;
	//   31   63:bipush          -2
	//   32   65:istore_2        
		else
	//*  33   66:goto            131
		if(exception instanceof IllegalArgumentException)
	//*  34   69:aload_1         
	//*  35   70:instanceof      #82  <Class IllegalArgumentException>
	//*  36   73:ifeq            82
			i = -3;
	//   37   76:bipush          -3
	//   38   78:istore_2        
		else
	//*  39   79:goto            131
		if(exception instanceof NullPointerException)
	//*  40   82:aload_1         
	//*  41   83:instanceof      #85  <Class NullPointerException>
	//*  42   86:ifeq            95
			i = -4;
	//   43   89:bipush          -4
	//   44   91:istore_2        
		else
	//*  45   92:goto            131
		if(exception instanceof IllegalStateException)
	//*  46   95:aload_1         
	//*  47   96:instanceof      #88  <Class IllegalStateException>
	//*  48   99:ifeq            108
			i = -5;
	//   49  102:bipush          -5
	//   50  104:istore_2        
		else
	//*  51  105:goto            131
		if(exception instanceof NetworkOnMainThreadException)
	//*  52  108:aload_1         
	//*  53  109:instanceof      #91  <Class NetworkOnMainThreadException>
	//*  54  112:ifeq            121
			i = -6;
	//   55  115:bipush          -6
	//   56  117:istore_2        
		else
	//*  57  118:goto            131
		if(exception instanceof UnsupportedOperationException)
	//*  58  121:aload_1         
	//*  59  122:instanceof      #94  <Class UnsupportedOperationException>
	//*  60  125:ifeq            131
			i = -7;
	//   61  128:bipush          -7
	//   62  130:istore_2        
		writeInt(i);
	//   63  131:aload_0         
	//   64  132:iload_2         
	//   65  133:invokevirtual   #245 <Method void writeInt(int)>
		if(i == 0)
	//*  66  136:iload_2         
	//*  67  137:ifne            161
			if(exception instanceof RuntimeException)
	//*  68  140:aload_1         
	//*  69  141:instanceof      #67  <Class RuntimeException>
	//*  70  144:ifeq            152
				throw (RuntimeException)exception;
	//   71  147:aload_1         
	//   72  148:checkcast       #67  <Class RuntimeException>
	//   73  151:athrow          
			else
				throw new RuntimeException(((Throwable) (exception)));
	//   74  152:new             #67  <Class RuntimeException>
	//   75  155:dup             
	//   76  156:aload_1         
	//   77  157:invokespecial   #534 <Method void RuntimeException(Throwable)>
	//   78  160:athrow          
		writeString(exception.getMessage());
	//   79  161:aload_0         
	//   80  162:aload_1         
	//   81  163:invokevirtual   #537 <Method String Exception.getMessage()>
	//   82  166:invokevirtual   #271 <Method void writeString(String)>
		if(i != -9)
	//*  83  169:iload_2         
	//*  84  170:bipush          -9
	//*  85  172:icmpeq          176
		{
			return;
	//   86  175:return          
		} else
		{
			writeParcelable((Parcelable)exception);
	//   87  176:aload_0         
	//   88  177:aload_1         
	//   89  178:checkcast       #161 <Class Parcelable>
	//   90  181:invokevirtual   #279 <Method void writeParcelable(Parcelable)>
			return;
	//   91  184:return          
		}
	}

	protected abstract void writeFloat(float f);

	public void writeFloat(float f, int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #242 <Method void setOutputField(int)>
		writeFloat(f);
	//    3    5:aload_0         
	//    4    6:fload_1         
	//    5    7:invokevirtual   #542 <Method void writeFloat(float)>
	//    6   10:return          
	}

	protected void writeFloatArray(float af[])
	{
		if(af != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
		{
			int j = af.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_3        
			writeInt(j);
	//    5    7:aload_0         
	//    6    8:iload_3         
	//    7    9:invokevirtual   #245 <Method void writeInt(int)>
			for(int i = 0; i < j; i++)
	//*   8   12:iconst_0        
	//*   9   13:istore_2        
	//*  10   14:iload_2         
	//*  11   15:iload_3         
	//*  12   16:icmpge          38
				writeFloat(af[i]);
	//   13   19:aload_0         
	//   14   20:aload_1         
	//   15   21:iload_2         
	//   16   22:faload          
	//   17   23:invokevirtual   #542 <Method void writeFloat(float)>

	//   18   26:iload_2         
	//   19   27:iconst_1        
	//   20   28:iadd            
	//   21   29:istore_2        
		} else
	//*  22   30:goto            14
		{
			writeInt(-1);
	//   23   33:aload_0         
	//   24   34:iconst_m1       
	//   25   35:invokevirtual   #245 <Method void writeInt(int)>
		}
	//   26   38:return          
	}

	public void writeFloatArray(float af[], int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #242 <Method void setOutputField(int)>
		writeFloatArray(af);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #547 <Method void writeFloatArray(float[])>
	//    6   10:return          
	}

	protected abstract void writeInt(int i);

	public void writeInt(int i, int j)
	{
		setOutputField(j);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #242 <Method void setOutputField(int)>
		writeInt(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #245 <Method void writeInt(int)>
	//    6   10:return          
	}

	protected void writeIntArray(int ai[])
	{
		if(ai != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
		{
			int j = ai.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_3        
			writeInt(j);
	//    5    7:aload_0         
	//    6    8:iload_3         
	//    7    9:invokevirtual   #245 <Method void writeInt(int)>
			for(int i = 0; i < j; i++)
	//*   8   12:iconst_0        
	//*   9   13:istore_2        
	//*  10   14:iload_2         
	//*  11   15:iload_3         
	//*  12   16:icmpge          38
				writeInt(ai[i]);
	//   13   19:aload_0         
	//   14   20:aload_1         
	//   15   21:iload_2         
	//   16   22:iaload          
	//   17   23:invokevirtual   #245 <Method void writeInt(int)>

	//   18   26:iload_2         
	//   19   27:iconst_1        
	//   20   28:iadd            
	//   21   29:istore_2        
		} else
	//*  22   30:goto            14
		{
			writeInt(-1);
	//   23   33:aload_0         
	//   24   34:iconst_m1       
	//   25   35:invokevirtual   #245 <Method void writeInt(int)>
		}
	//   26   38:return          
	}

	public void writeIntArray(int ai[], int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #242 <Method void setOutputField(int)>
		writeIntArray(ai);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #552 <Method void writeIntArray(int[])>
	//    6   10:return          
	}

	public void writeList(List list, int i)
	{
		writeCollection(((Collection) (list)), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #556 <Method void writeCollection(Collection, int)>
	//    4    6:return          
	}

	protected abstract void writeLong(long l);

	public void writeLong(long l, int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:invokevirtual   #242 <Method void setOutputField(int)>
		writeLong(l);
	//    3    5:aload_0         
	//    4    6:lload_1         
	//    5    7:invokevirtual   #562 <Method void writeLong(long)>
	//    6   10:return          
	}

	protected void writeLongArray(long al[])
	{
		if(al != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
		{
			int j = al.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore_3        
			writeInt(j);
	//    5    7:aload_0         
	//    6    8:iload_3         
	//    7    9:invokevirtual   #245 <Method void writeInt(int)>
			for(int i = 0; i < j; i++)
	//*   8   12:iconst_0        
	//*   9   13:istore_2        
	//*  10   14:iload_2         
	//*  11   15:iload_3         
	//*  12   16:icmpge          38
				writeLong(al[i]);
	//   13   19:aload_0         
	//   14   20:aload_1         
	//   15   21:iload_2         
	//   16   22:laload          
	//   17   23:invokevirtual   #562 <Method void writeLong(long)>

	//   18   26:iload_2         
	//   19   27:iconst_1        
	//   20   28:iadd            
	//   21   29:istore_2        
		} else
	//*  22   30:goto            14
		{
			writeInt(-1);
	//   23   33:aload_0         
	//   24   34:iconst_m1       
	//   25   35:invokevirtual   #245 <Method void writeInt(int)>
		}
	//   26   38:return          
	}

	public void writeLongArray(long al[], int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #242 <Method void setOutputField(int)>
		writeLongArray(al);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #567 <Method void writeLongArray(long[])>
	//    6   10:return          
	}

	protected void writeNoException()
	{
		writeInt(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #245 <Method void writeInt(int)>
	//    3    5:return          
	}

	protected abstract void writeParcelable(Parcelable parcelable);

	public void writeParcelable(Parcelable parcelable, int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #242 <Method void setOutputField(int)>
		writeParcelable(parcelable);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #279 <Method void writeParcelable(Parcelable)>
	//    6   10:return          
	}

	public void writeSerializable(Serializable serializable, int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #242 <Method void setOutputField(int)>
		writeSerializable(serializable);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #275 <Method void writeSerializable(Serializable)>
	//    6   10:return          
	}

	public void writeSet(Set set, int i)
	{
		writeCollection(((Collection) (set)), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #556 <Method void writeCollection(Collection, int)>
	//    4    6:return          
	}

	public void writeSize(Size size, int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #242 <Method void setOutputField(int)>
		boolean flag;
		if(size != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_3        
		else
	//*   7   11:goto            16
			flag = false;
	//    8   14:iconst_0        
	//    9   15:istore_3        
		writeBoolean(flag);
	//   10   16:aload_0         
	//   11   17:iload_3         
	//   12   18:invokevirtual   #492 <Method void writeBoolean(boolean)>
		if(size != null)
	//*  13   21:aload_1         
	//*  14   22:ifnull          41
		{
			writeInt(size.getWidth());
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:invokevirtual   #577 <Method int Size.getWidth()>
	//   18   30:invokevirtual   #245 <Method void writeInt(int)>
			writeInt(size.getHeight());
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:invokevirtual   #580 <Method int Size.getHeight()>
	//   22   38:invokevirtual   #245 <Method void writeInt(int)>
		}
	//   23   41:return          
	}

	public void writeSizeF(SizeF sizef, int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #242 <Method void setOutputField(int)>
		boolean flag;
		if(sizef != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_3        
		else
	//*   7   11:goto            16
			flag = false;
	//    8   14:iconst_0        
	//    9   15:istore_3        
		writeBoolean(flag);
	//   10   16:aload_0         
	//   11   17:iload_3         
	//   12   18:invokevirtual   #492 <Method void writeBoolean(boolean)>
		if(sizef != null)
	//*  13   21:aload_1         
	//*  14   22:ifnull          41
		{
			writeFloat(sizef.getWidth());
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:invokevirtual   #584 <Method float SizeF.getWidth()>
	//   18   30:invokevirtual   #542 <Method void writeFloat(float)>
			writeFloat(sizef.getHeight());
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:invokevirtual   #586 <Method float SizeF.getHeight()>
	//   22   38:invokevirtual   #542 <Method void writeFloat(float)>
		}
	//   23   41:return          
	}

	public void writeSparseBooleanArray(SparseBooleanArray sparsebooleanarray, int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #242 <Method void setOutputField(int)>
		if(sparsebooleanarray == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       15
		{
			writeInt(-1);
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:invokevirtual   #245 <Method void writeInt(int)>
			return;
	//    8   14:return          
		}
		int j = sparsebooleanarray.size();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #589 <Method int SparseBooleanArray.size()>
	//   11   19:istore_3        
		writeInt(j);
	//   12   20:aload_0         
	//   13   21:iload_3         
	//   14   22:invokevirtual   #245 <Method void writeInt(int)>
		for(i = 0; i < j; i++)
	//*  15   25:iconst_0        
	//*  16   26:istore_2        
	//*  17   27:iload_2         
	//*  18   28:iload_3         
	//*  19   29:icmpge          57
		{
			writeInt(sparsebooleanarray.keyAt(i));
	//   20   32:aload_0         
	//   21   33:aload_1         
	//   22   34:iload_2         
	//   23   35:invokevirtual   #593 <Method int SparseBooleanArray.keyAt(int)>
	//   24   38:invokevirtual   #245 <Method void writeInt(int)>
			writeBoolean(sparsebooleanarray.valueAt(i));
	//   25   41:aload_0         
	//   26   42:aload_1         
	//   27   43:iload_2         
	//   28   44:invokevirtual   #596 <Method boolean SparseBooleanArray.valueAt(int)>
	//   29   47:invokevirtual   #492 <Method void writeBoolean(boolean)>
		}

	//   30   50:iload_2         
	//   31   51:iconst_1        
	//   32   52:iadd            
	//   33   53:istore_2        
	//*  34   54:goto            27
	//   35   57:return          
	}

	protected abstract void writeString(String s);

	public void writeString(String s, int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #242 <Method void setOutputField(int)>
		writeString(s);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #271 <Method void writeString(String)>
	//    6   10:return          
	}

	protected abstract void writeStrongBinder(IBinder ibinder);

	public void writeStrongBinder(IBinder ibinder, int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #242 <Method void setOutputField(int)>
		writeStrongBinder(ibinder);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #268 <Method void writeStrongBinder(IBinder)>
	//    6   10:return          
	}

	protected abstract void writeStrongInterface(IInterface iinterface);

	public void writeStrongInterface(IInterface iinterface, int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #242 <Method void setOutputField(int)>
		writeStrongInterface(iinterface);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #603 <Method void writeStrongInterface(IInterface)>
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
	//    4    6:invokevirtual   #271 <Method void writeString(String)>
			return;
	//    5    9:return          
		} else
		{
			writeVersionedParcelableCreator(versionedparcelable);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #605 <Method void writeVersionedParcelableCreator(VersionedParcelable)>
			VersionedParcel versionedparcel = createSubParcel();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #473 <Method VersionedParcel createSubParcel()>
	//   11   19:astore_2        
			writeToParcel(versionedparcelable, versionedparcel);
	//   12   20:aload_1         
	//   13   21:aload_2         
	//   14   22:invokestatic    #607 <Method void writeToParcel(VersionedParcelable, VersionedParcel)>
			versionedparcel.closeField();
	//   15   25:aload_2         
	//   16   26:invokevirtual   #609 <Method void closeField()>
			return;
	//   17   29:return          
		}
	}

	public void writeVersionedParcelable(VersionedParcelable versionedparcelable, int i)
	{
		setOutputField(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #242 <Method void setOutputField(int)>
		writeVersionedParcelable(versionedparcelable);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #283 <Method void writeVersionedParcelable(VersionedParcelable)>
	//    6   10:return          
	}

	private static final int EX_BAD_PARCELABLE = -2;
	private static final int EX_ILLEGAL_ARGUMENT = -3;
	private static final int EX_ILLEGAL_STATE = -5;
	private static final int EX_NETWORK_MAIN_THREAD = -6;
	private static final int EX_NULL_POINTER = -4;
	private static final int EX_PARCELABLE = -9;
	private static final int EX_SECURITY = -1;
	private static final int EX_UNSUPPORTED_OPERATION = -7;
	private static final String TAG = "VersionedParcel";
	private static final int TYPE_BINDER = 5;
	private static final int TYPE_PARCELABLE = 2;
	private static final int TYPE_SERIALIZABLE = 3;
	private static final int TYPE_STRING = 4;
	private static final int TYPE_VERSIONED_PARCELABLE = 1;
}
