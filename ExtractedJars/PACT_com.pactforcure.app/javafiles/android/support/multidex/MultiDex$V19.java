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

	private static void install(ClassLoader classloader, List list, File file)
		throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException
	{
		Object obj = MultiDex.access$300(((Object) (classloader)), "pathList").get(((Object) (classloader)));
	//    0    0:aload_0         
	//    1    1:ldc1            #30  <String "pathList">
	//    2    3:invokestatic    #34  <Method Field MultiDex.access$300(Object, String)>
	//    3    6:aload_0         
	//    4    7:invokevirtual   #40  <Method Object Field.get(Object)>
	//    5   10:astore          4
		ArrayList arraylist = new ArrayList();
	//    6   12:new             #42  <Class ArrayList>
	//    7   15:dup             
	//    8   16:invokespecial   #43  <Method void ArrayList()>
	//    9   19:astore_3        
		MultiDex.access$400(obj, "dexElements", makeDexElements(obj, new ArrayList(((java.util.Collection) (list))), file, arraylist));
	//   10   20:aload           4
	//   11   22:ldc1            #45  <String "dexElements">
	//   12   24:aload           4
	//   13   26:new             #42  <Class ArrayList>
	//   14   29:dup             
	//   15   30:aload_1         
	//   16   31:invokespecial   #48  <Method void ArrayList(java.util.Collection)>
	//   17   34:aload_2         
	//   18   35:aload_3         
	//   19   36:invokestatic    #52  <Method Object[] makeDexElements(Object, ArrayList, File, ArrayList)>
	//   20   39:invokestatic    #56  <Method void MultiDex.access$400(Object, String, Object[])>
		if(arraylist.size() > 0)
	//*  21   42:aload_3         
	//*  22   43:invokevirtual   #60  <Method int ArrayList.size()>
	//*  23   46:ifle            129
		{
			for(list = ((List) (arraylist.iterator())); ((Iterator) (list)).hasNext(); Log.w("MultiDex", "Exception in makeDexElement", ((Throwable) ((IOException)((Iterator) (list)).next()))));
	//   24   49:aload_3         
	//   25   50:invokevirtual   #64  <Method Iterator ArrayList.iterator()>
	//   26   53:astore_1        
	//   27   54:aload_1         
	//   28   55:invokeinterface #70  <Method boolean Iterator.hasNext()>
	//   29   60:ifeq            83
	//   30   63:ldc1            #72  <String "MultiDex">
	//   31   65:ldc1            #74  <String "Exception in makeDexElement">
	//   32   67:aload_1         
	//   33   68:invokeinterface #78  <Method Object Iterator.next()>
	//   34   73:checkcast       #80  <Class IOException>
	//   35   76:invokestatic    #86  <Method int Log.w(String, String, Throwable)>
	//   36   79:pop             
	//*  37   80:goto            54
			file = ((File) (MultiDex.access$300(((Object) (classloader)), "dexElementsSuppressedExceptions")));
	//   38   83:aload_0         
	//   39   84:ldc1            #88  <String "dexElementsSuppressedExceptions">
	//   40   86:invokestatic    #34  <Method Field MultiDex.access$300(Object, String)>
	//   41   89:astore_2        
			IOException aioexception[] = (IOException[])(IOException[])((Field) (file)).get(((Object) (classloader)));
	//   42   90:aload_2         
	//   43   91:aload_0         
	//   44   92:invokevirtual   #40  <Method Object Field.get(Object)>
	//   45   95:checkcast       #90  <Class IOException[]>
	//   46   98:checkcast       #90  <Class IOException[]>
	//   47  101:astore          4
			if(aioexception == null)
	//*  48  103:aload           4
	//*  49  105:ifnonnull       130
			{
				list = ((List) ((IOException[])arraylist.toArray(((Object []) (new IOException[arraylist.size()])))));
	//   50  108:aload_3         
	//   51  109:aload_3         
	//   52  110:invokevirtual   #60  <Method int ArrayList.size()>
	//   53  113:anewarray       IOException[]
	//   54  116:invokevirtual   #94  <Method Object[] ArrayList.toArray(Object[])>
	//   55  119:checkcast       #90  <Class IOException[]>
	//   56  122:astore_1        
			} else
	//*  57  123:aload_2         
	//*  58  124:aload_0         
	//*  59  125:aload_1         
	//*  60  126:invokevirtual   #98  <Method void Field.set(Object, Object)>
	//*  61  129:return          
			{
				list = ((List) (new IOException[arraylist.size() + aioexception.length]));
	//   62  130:aload_3         
	//   63  131:invokevirtual   #60  <Method int ArrayList.size()>
	//   64  134:aload           4
	//   65  136:arraylength     
	//   66  137:iadd            
	//   67  138:anewarray       IOException[]
	//   68  141:astore_1        
				arraylist.toArray(((Object []) (list)));
	//   69  142:aload_3         
	//   70  143:aload_1         
	//   71  144:invokevirtual   #94  <Method Object[] ArrayList.toArray(Object[])>
	//   72  147:pop             
				System.arraycopy(((Object) (aioexception)), 0, ((Object) (list)), arraylist.size(), aioexception.length);
	//   73  148:aload           4
	//   74  150:iconst_0        
	//   75  151:aload_1         
	//   76  152:aload_3         
	//   77  153:invokevirtual   #60  <Method int ArrayList.size()>
	//   78  156:aload           4
	//   79  158:arraylength     
	//   80  159:invokestatic    #104 <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			((Field) (file)).set(((Object) (classloader)), ((Object) (list)));
		}
	//*  81  162:goto            123
	}

	private static Object[] makeDexElements(Object obj, ArrayList arraylist, File file, ArrayList arraylist1)
		throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
	{
		return (Object[])(Object[])MultiDex.access$500(obj, "makeDexElements", new Class[] {
			java/util/ArrayList, java/io/File, java/util/ArrayList
		}).invoke(obj, new Object[] {
			arraylist, file, arraylist1
		});
	//    0    0:aload_0         
	//    1    1:ldc1            #107 <String "makeDexElements">
	//    2    3:iconst_3        
	//    3    4:anewarray       Class[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:ldc1            #42  <Class ArrayList>
	//    7   11:aastore         
	//    8   12:dup             
	//    9   13:iconst_1        
	//   10   14:ldc1            #111 <Class File>
	//   11   16:aastore         
	//   12   17:dup             
	//   13   18:iconst_2        
	//   14   19:ldc1            #42  <Class ArrayList>
	//   15   21:aastore         
	//   16   22:invokestatic    #115 <Method Method MultiDex.access$500(Object, String, Class[])>
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
	//   32   42:invokevirtual   #121 <Method Object Method.invoke(Object, Object[])>
	//   33   45:checkcast       #123 <Class Object[]>
	//   34   48:checkcast       #123 <Class Object[]>
	//   35   51:areturn         
	}


/*
	static void access$000(ClassLoader classloader, List list, File file)
		throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException
	{
		install(classloader, list, file);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #27  <Method void install(ClassLoader, List, File)>
		return;
	//    4    6:return          
	}

*/

	private MultiDex$V19()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
