// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.multidex;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.*;
import java.util.*;

// Referenced classes of package android.support.multidex:
//			MultiDex

private static final class MultiDex$V19
{

	static void install(ClassLoader classloader, List list, File file)
		throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException
	{
		Object obj = MultiDex.access$000(((Object) (classloader)), "pathList").get(((Object) (classloader)));
	//    0    0:aload_0         
	//    1    1:ldc1            #23  <String "pathList">
	//    2    3:invokestatic    #27  <Method Field MultiDex.access$000(Object, String)>
	//    3    6:aload_0         
	//    4    7:invokevirtual   #33  <Method Object Field.get(Object)>
	//    5   10:astore          4
		ArrayList arraylist = new ArrayList();
	//    6   12:new             #35  <Class ArrayList>
	//    7   15:dup             
	//    8   16:invokespecial   #39  <Method void ArrayList()>
	//    9   19:astore_3        
		MultiDex.access$100(obj, "dexElements", makeDexElements(obj, new ArrayList(((java.util.Collection) (list))), file, arraylist));
	//   10   20:aload           4
	//   11   22:ldc1            #41  <String "dexElements">
	//   12   24:aload           4
	//   13   26:new             #35  <Class ArrayList>
	//   14   29:dup             
	//   15   30:aload_1         
	//   16   31:invokespecial   #44  <Method void ArrayList(java.util.Collection)>
	//   17   34:aload_2         
	//   18   35:aload_3         
	//   19   36:invokestatic    #48  <Method Object[] makeDexElements(Object, ArrayList, File, ArrayList)>
	//   20   39:invokestatic    #52  <Method void MultiDex.access$100(Object, String, Object[])>
		if(arraylist.size() > 0)
	//*  21   42:aload_3         
	//*  22   43:invokevirtual   #56  <Method int ArrayList.size()>
	//*  23   46:ifle            184
		{
			for(classloader = ((ClassLoader) (arraylist.iterator())); ((Iterator) (classloader)).hasNext(); Log.w("MultiDex", "Exception in makeDexElement", ((Throwable) ((IOException)((Iterator) (classloader)).next()))));
	//   24   49:aload_3         
	//   25   50:invokevirtual   #60  <Method Iterator ArrayList.iterator()>
	//   26   53:astore_0        
	//   27   54:aload_0         
	//   28   55:invokeinterface #66  <Method boolean Iterator.hasNext()>
	//   29   60:ifeq            83
	//   30   63:ldc1            #68  <String "MultiDex">
	//   31   65:ldc1            #70  <String "Exception in makeDexElement">
	//   32   67:aload_0         
	//   33   68:invokeinterface #74  <Method Object Iterator.next()>
	//   34   73:checkcast       #21  <Class IOException>
	//   35   76:invokestatic    #80  <Method int Log.w(String, String, Throwable)>
	//   36   79:pop             
	//*  37   80:goto            54
			list = ((List) (MultiDex.access$000(obj, "dexElementsSuppressedExceptions")));
	//   38   83:aload           4
	//   39   85:ldc1            #82  <String "dexElementsSuppressedExceptions">
	//   40   87:invokestatic    #27  <Method Field MultiDex.access$000(Object, String)>
	//   41   90:astore_1        
			file = ((File) ((IOException[])((Field) (list)).get(obj)));
	//   42   91:aload_1         
	//   43   92:aload           4
	//   44   94:invokevirtual   #33  <Method Object Field.get(Object)>
	//   45   97:checkcast       #84  <Class IOException[]>
	//   46  100:astore_2        
			if(file == null)
	//*  47  101:aload_2         
	//*  48  102:ifnonnull       123
			{
				classloader = ((ClassLoader) ((IOException[])arraylist.toArray(((Object []) (new IOException[arraylist.size()])))));
	//   49  105:aload_3         
	//   50  106:aload_3         
	//   51  107:invokevirtual   #56  <Method int ArrayList.size()>
	//   52  110:anewarray       IOException[]
	//   53  113:invokevirtual   #88  <Method Object[] ArrayList.toArray(Object[])>
	//   54  116:checkcast       #84  <Class IOException[]>
	//   55  119:astore_0        
			} else
	//*  56  120:goto            152
			{
				classloader = ((ClassLoader) (new IOException[arraylist.size() + file.length]));
	//   57  123:aload_3         
	//   58  124:invokevirtual   #56  <Method int ArrayList.size()>
	//   59  127:aload_2         
	//   60  128:arraylength     
	//   61  129:iadd            
	//   62  130:anewarray       IOException[]
	//   63  133:astore_0        
				arraylist.toArray(((Object []) (classloader)));
	//   64  134:aload_3         
	//   65  135:aload_0         
	//   66  136:invokevirtual   #88  <Method Object[] ArrayList.toArray(Object[])>
	//   67  139:pop             
				System.arraycopy(((Object) (file)), 0, ((Object) (classloader)), arraylist.size(), file.length);
	//   68  140:aload_2         
	//   69  141:iconst_0        
	//   70  142:aload_0         
	//   71  143:aload_3         
	//   72  144:invokevirtual   #56  <Method int ArrayList.size()>
	//   73  147:aload_2         
	//   74  148:arraylength     
	//   75  149:invokestatic    #94  <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			((Field) (list)).set(obj, ((Object) (classloader)));
	//   76  152:aload_1         
	//   77  153:aload           4
	//   78  155:aload_0         
	//   79  156:invokevirtual   #98  <Method void Field.set(Object, Object)>
			classloader = ((ClassLoader) (new IOException("I/O exception during makeDexElement")));
	//   80  159:new             #21  <Class IOException>
	//   81  162:dup             
	//   82  163:ldc1            #100 <String "I/O exception during makeDexElement">
	//   83  165:invokespecial   #103 <Method void IOException(String)>
	//   84  168:astore_0        
			((IOException) (classloader)).initCause((Throwable)arraylist.get(0));
	//   85  169:aload_0         
	//   86  170:aload_3         
	//   87  171:iconst_0        
	//   88  172:invokevirtual   #106 <Method Object ArrayList.get(int)>
	//   89  175:checkcast       #108 <Class Throwable>
	//   90  178:invokevirtual   #112 <Method Throwable IOException.initCause(Throwable)>
	//   91  181:pop             
			throw classloader;
	//   92  182:aload_0         
	//   93  183:athrow          
		} else
		{
			return;
	//   94  184:return          
		}
	}

	private static Object[] makeDexElements(Object obj, ArrayList arraylist, File file, ArrayList arraylist1)
		throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
	{
		return (Object[])MultiDex.access$200(obj, "makeDexElements", new Class[] {
			java/util/ArrayList, java/io/File, java/util/ArrayList
		}).invoke(obj, new Object[] {
			arraylist, file, arraylist1
		});
	//    0    0:aload_0         
	//    1    1:ldc1            #117 <String "makeDexElements">
	//    2    3:iconst_3        
	//    3    4:anewarray       Class[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:ldc1            #35  <Class ArrayList>
	//    7   11:aastore         
	//    8   12:dup             
	//    9   13:iconst_1        
	//   10   14:ldc1            #121 <Class File>
	//   11   16:aastore         
	//   12   17:dup             
	//   13   18:iconst_2        
	//   14   19:ldc1            #35  <Class ArrayList>
	//   15   21:aastore         
	//   16   22:invokestatic    #125 <Method Method MultiDex.access$200(Object, String, Class[])>
	//   17   25:aload_0         
	//   18   26:iconst_3        
	//   19   27:anewarray       Object[]
	//   20   30:dup             
	//   21   31:iconst_0        
	//   22   32:aload_1         
	//   23   33:aastore         
	//   24   34:dup             
	//   25   35:iconst_1        
	//   26   36:aload_2         
	//   27   37:aastore         
	//   28   38:dup             
	//   29   39:iconst_2        
	//   30   40:aload_3         
	//   31   41:aastore         
	//   32   42:invokevirtual   #131 <Method Object Method.invoke(Object, Object[])>
	//   33   45:checkcast       #133 <Class Object[]>
	//   34   48:areturn         
	}
}
