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

	static void install(ClassLoader classloader, List list)
		throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException
	{
		int i = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #28  <Method int List.size()>
	//    2    6:istore_2        
		Field field = MultiDex.access$000(((Object) (classloader)), "path");
	//    3    7:aload_0         
	//    4    8:ldc1            #30  <String "path">
	//    5   10:invokestatic    #34  <Method Field MultiDex.access$000(Object, String)>
	//    6   13:astore_3        
		StringBuilder stringbuilder = new StringBuilder((String)field.get(((Object) (classloader))));
	//    7   14:new             #36  <Class StringBuilder>
	//    8   17:dup             
	//    9   18:aload_3         
	//   10   19:aload_0         
	//   11   20:invokevirtual   #42  <Method Object Field.get(Object)>
	//   12   23:checkcast       #44  <Class String>
	//   13   26:invokespecial   #47  <Method void StringBuilder(String)>
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
	//*  28   56:invokeinterface #57  <Method ListIterator List.listIterator()>
	//*  29   61:astore_1        
	//*  30   62:aload_1         
	//*  31   63:invokeinterface #63  <Method boolean ListIterator.hasNext()>
	//*  32   68:ifeq            180
		{
			Object obj = ((Object) ((File)((ListIterator) (list)).next()));
	//   33   71:aload_1         
	//   34   72:invokeinterface #67  <Method Object ListIterator.next()>
	//   35   77:checkcast       #49  <Class File>
	//   36   80:astore          10
			String s = ((File) (obj)).getAbsolutePath();
	//   37   82:aload           10
	//   38   84:invokevirtual   #71  <Method String File.getAbsolutePath()>
	//   39   87:astore          9
			stringbuilder.append(':');
	//   40   89:aload           4
	//   41   91:bipush          58
	//   42   93:invokevirtual   #75  <Method StringBuilder StringBuilder.append(char)>
	//   43   96:pop             
			stringbuilder.append(s);
	//   44   97:aload           4
	//   45   99:aload           9
	//   46  101:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   47  104:pop             
			int j = ((ListIterator) (list)).previousIndex();
	//   48  105:aload_1         
	//   49  106:invokeinterface #81  <Method int ListIterator.previousIndex()>
	//   50  111:istore_2        
			as[j] = s;
	//   51  112:aload           5
	//   52  114:iload_2         
	//   53  115:aload           9
	//   54  117:aastore         
			afile[j] = ((File) (obj));
	//   55  118:aload           6
	//   56  120:iload_2         
	//   57  121:aload           10
	//   58  123:aastore         
			azipfile[j] = new ZipFile(((File) (obj)));
	//   59  124:aload           7
	//   60  126:iload_2         
	//   61  127:new             #51  <Class ZipFile>
	//   62  130:dup             
	//   63  131:aload           10
	//   64  133:invokespecial   #84  <Method void ZipFile(File)>
	//   65  136:aastore         
			obj = ((Object) (new StringBuilder()));
	//   66  137:new             #36  <Class StringBuilder>
	//   67  140:dup             
	//   68  141:invokespecial   #85  <Method void StringBuilder()>
	//   69  144:astore          10
			((StringBuilder) (obj)).append(s);
	//   70  146:aload           10
	//   71  148:aload           9
	//   72  150:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   73  153:pop             
			((StringBuilder) (obj)).append(".dex");
	//   74  154:aload           10
	//   75  156:ldc1            #87  <String ".dex">
	//   76  158:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   77  161:pop             
			adexfile[j] = DexFile.loadDex(s, ((StringBuilder) (obj)).toString(), 0);
	//   78  162:aload           8
	//   79  164:iload_2         
	//   80  165:aload           9
	//   81  167:aload           10
	//   82  169:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   83  172:iconst_0        
	//   84  173:invokestatic    #94  <Method DexFile DexFile.loadDex(String, String, int)>
	//   85  176:aastore         
		}

	//*  86  177:goto            62
		field.set(((Object) (classloader)), ((Object) (stringbuilder.toString())));
	//   87  180:aload_3         
	//   88  181:aload_0         
	//   89  182:aload           4
	//   90  184:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   91  187:invokevirtual   #98  <Method void Field.set(Object, Object)>
		MultiDex.access$100(((Object) (classloader)), "mPaths", ((Object []) (as)));
	//   92  190:aload_0         
	//   93  191:ldc1            #100 <String "mPaths">
	//   94  193:aload           5
	//   95  195:invokestatic    #104 <Method void MultiDex.access$100(Object, String, Object[])>
		MultiDex.access$100(((Object) (classloader)), "mFiles", ((Object []) (afile)));
	//   96  198:aload_0         
	//   97  199:ldc1            #106 <String "mFiles">
	//   98  201:aload           6
	//   99  203:invokestatic    #104 <Method void MultiDex.access$100(Object, String, Object[])>
		MultiDex.access$100(((Object) (classloader)), "mZips", ((Object []) (azipfile)));
	//  100  206:aload_0         
	//  101  207:ldc1            #108 <String "mZips">
	//  102  209:aload           7
	//  103  211:invokestatic    #104 <Method void MultiDex.access$100(Object, String, Object[])>
		MultiDex.access$100(((Object) (classloader)), "mDexs", ((Object []) (adexfile)));
	//  104  214:aload_0         
	//  105  215:ldc1            #110 <String "mDexs">
	//  106  217:aload           8
	//  107  219:invokestatic    #104 <Method void MultiDex.access$100(Object, String, Object[])>
	//  108  222:return          
	}

	private MultiDex$V4()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
