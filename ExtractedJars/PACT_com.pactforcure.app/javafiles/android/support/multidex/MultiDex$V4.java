// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.multidex;

import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;
import java.util.ListIterator;
import java.util.zip.ZipFile;

// Referenced classes of package android.support.multidex:
//			MultiDex

private static final class MultiDex$V4
{

	private static void install(ClassLoader classloader, List list)
		throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException
	{
		int i = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #32  <Method int List.size()>
	//    2    6:istore_2        
		Field field = MultiDex.access$300(((Object) (classloader)), "path");
	//    3    7:aload_0         
	//    4    8:ldc1            #34  <String "path">
	//    5   10:invokestatic    #38  <Method Field MultiDex.access$300(Object, String)>
	//    6   13:astore_3        
		StringBuilder stringbuilder = new StringBuilder((String)field.get(((Object) (classloader))));
	//    7   14:new             #40  <Class StringBuilder>
	//    8   17:dup             
	//    9   18:aload_3         
	//   10   19:aload_0         
	//   11   20:invokevirtual   #46  <Method Object Field.get(Object)>
	//   12   23:checkcast       #48  <Class String>
	//   13   26:invokespecial   #51  <Method void StringBuilder(String)>
	//   14   29:astore          4
		String as[] = new String[i];
	//   15   31:iload_2         
	//   16   32:anewarray       String[]
	//   17   35:astore          5
		File afile[] = new File[i];
	//   18   37:iload_2         
	//   19   38:anewarray       File[]
	//   20   41:astore          6
		ZipFile azipfile[] = new ZipFile[i];
	//   21   43:iload_2         
	//   22   44:anewarray       ZipFile[]
	//   23   47:astore          7
		DexFile adexfile[] = new DexFile[i];
	//   24   49:iload_2         
	//   25   50:anewarray       DexFile[]
	//   26   53:astore          8
		for(list = ((List) (list.listIterator())); ((ListIterator) (list)).hasNext();)
	//*  27   55:aload_1         
	//*  28   56:invokeinterface #61  <Method ListIterator List.listIterator()>
	//*  29   61:astore_1        
	//*  30   62:aload_1         
	//*  31   63:invokeinterface #67  <Method boolean ListIterator.hasNext()>
	//*  32   68:ifeq            167
		{
			File file = (File)((ListIterator) (list)).next();
	//   33   71:aload_1         
	//   34   72:invokeinterface #71  <Method Object ListIterator.next()>
	//   35   77:checkcast       #53  <Class File>
	//   36   80:astore          9
			String s = file.getAbsolutePath();
	//   37   82:aload           9
	//   38   84:invokevirtual   #75  <Method String File.getAbsolutePath()>
	//   39   87:astore          10
			stringbuilder.append(':').append(s);
	//   40   89:aload           4
	//   41   91:bipush          58
	//   42   93:invokevirtual   #79  <Method StringBuilder StringBuilder.append(char)>
	//   43   96:aload           10
	//   44   98:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   45  101:pop             
			int j = ((ListIterator) (list)).previousIndex();
	//   46  102:aload_1         
	//   47  103:invokeinterface #85  <Method int ListIterator.previousIndex()>
	//   48  108:istore_2        
			as[j] = s;
	//   49  109:aload           5
	//   50  111:iload_2         
	//   51  112:aload           10
	//   52  114:aastore         
			afile[j] = file;
	//   53  115:aload           6
	//   54  117:iload_2         
	//   55  118:aload           9
	//   56  120:aastore         
			azipfile[j] = new ZipFile(file);
	//   57  121:aload           7
	//   58  123:iload_2         
	//   59  124:new             #55  <Class ZipFile>
	//   60  127:dup             
	//   61  128:aload           9
	//   62  130:invokespecial   #88  <Method void ZipFile(File)>
	//   63  133:aastore         
			adexfile[j] = DexFile.loadDex(s, (new StringBuilder()).append(s).append(".dex").toString(), 0);
	//   64  134:aload           8
	//   65  136:iload_2         
	//   66  137:aload           10
	//   67  139:new             #40  <Class StringBuilder>
	//   68  142:dup             
	//   69  143:invokespecial   #89  <Method void StringBuilder()>
	//   70  146:aload           10
	//   71  148:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   72  151:ldc1            #91  <String ".dex">
	//   73  153:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   74  156:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   75  159:iconst_0        
	//   76  160:invokestatic    #98  <Method DexFile DexFile.loadDex(String, String, int)>
	//   77  163:aastore         
		}

	//*  78  164:goto            62
		field.set(((Object) (classloader)), ((Object) (stringbuilder.toString())));
	//   79  167:aload_3         
	//   80  168:aload_0         
	//   81  169:aload           4
	//   82  171:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   83  174:invokevirtual   #102 <Method void Field.set(Object, Object)>
		MultiDex.access$400(((Object) (classloader)), "mPaths", ((Object []) (as)));
	//   84  177:aload_0         
	//   85  178:ldc1            #104 <String "mPaths">
	//   86  180:aload           5
	//   87  182:invokestatic    #108 <Method void MultiDex.access$400(Object, String, Object[])>
		MultiDex.access$400(((Object) (classloader)), "mFiles", ((Object []) (afile)));
	//   88  185:aload_0         
	//   89  186:ldc1            #110 <String "mFiles">
	//   90  188:aload           6
	//   91  190:invokestatic    #108 <Method void MultiDex.access$400(Object, String, Object[])>
		MultiDex.access$400(((Object) (classloader)), "mZips", ((Object []) (azipfile)));
	//   92  193:aload_0         
	//   93  194:ldc1            #112 <String "mZips">
	//   94  196:aload           7
	//   95  198:invokestatic    #108 <Method void MultiDex.access$400(Object, String, Object[])>
		MultiDex.access$400(((Object) (classloader)), "mDexs", ((Object []) (adexfile)));
	//   96  201:aload_0         
	//   97  202:ldc1            #114 <String "mDexs">
	//   98  204:aload           8
	//   99  206:invokestatic    #108 <Method void MultiDex.access$400(Object, String, Object[])>
	//  100  209:return          
	}


/*
	static void access$200(ClassLoader classloader, List list)
		throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException
	{
		install(classloader, list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #25  <Method void install(ClassLoader, List)>
		return;
	//    3    5:return          
	}

*/

	private MultiDex$V4()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
