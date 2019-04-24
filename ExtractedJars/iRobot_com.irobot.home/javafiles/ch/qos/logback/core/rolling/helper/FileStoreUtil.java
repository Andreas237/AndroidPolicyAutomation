// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.rolling.RolloverFailure;
import java.io.File;
import java.lang.reflect.Method;

public class FileStoreUtil
{

	public FileStoreUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static boolean areOnSameFileStore(File file, File file1)
	{
		if(!file.exists())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #26  <Method boolean File.exists()>
	//*   2    4:ifne            47
		{
			file1 = ((File) (new StringBuilder()));
	//    3    7:new             #28  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #29  <Method void StringBuilder()>
	//    6   14:astore_1        
			((StringBuilder) (file1)).append("File [");
	//    7   15:aload_1         
	//    8   16:ldc1            #31  <String "File [">
	//    9   18:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
			((StringBuilder) (file1)).append(((Object) (file)));
	//   11   22:aload_1         
	//   12   23:aload_0         
	//   13   24:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
	//   14   27:pop             
			((StringBuilder) (file1)).append("] does not exist.");
	//   15   28:aload_1         
	//   16   29:ldc1            #40  <String "] does not exist.">
	//   17   31:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
			throw new IllegalArgumentException(((StringBuilder) (file1)).toString());
	//   19   35:new             #42  <Class IllegalArgumentException>
	//   20   38:dup             
	//   21   39:aload_1         
	//   22   40:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   23   43:invokespecial   #49  <Method void IllegalArgumentException(String)>
	//   24   46:athrow          
		}
		if(!file1.exists())
	//*  25   47:aload_1         
	//*  26   48:invokevirtual   #26  <Method boolean File.exists()>
	//*  27   51:ifne            94
		{
			file = ((File) (new StringBuilder()));
	//   28   54:new             #28  <Class StringBuilder>
	//   29   57:dup             
	//   30   58:invokespecial   #29  <Method void StringBuilder()>
	//   31   61:astore_0        
			((StringBuilder) (file)).append("File [");
	//   32   62:aload_0         
	//   33   63:ldc1            #31  <String "File [">
	//   34   65:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   35   68:pop             
			((StringBuilder) (file)).append(((Object) (file1)));
	//   36   69:aload_0         
	//   37   70:aload_1         
	//   38   71:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
	//   39   74:pop             
			((StringBuilder) (file)).append("] does not exist.");
	//   40   75:aload_0         
	//   41   76:ldc1            #40  <String "] does not exist.">
	//   42   78:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   43   81:pop             
			throw new IllegalArgumentException(((StringBuilder) (file)).toString());
	//   44   82:new             #42  <Class IllegalArgumentException>
	//   45   85:dup             
	//   46   86:aload_0         
	//   47   87:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   48   90:invokespecial   #49  <Method void IllegalArgumentException(String)>
	//   49   93:athrow          
		}
		boolean flag;
		try
		{
			Object obj1 = ((Object) (Class.forName("java.nio.file.Path")));
	//   50   94:ldc1            #11  <String "java.nio.file.Path">
	//   51   96:invokestatic    #55  <Method Class Class.forName(String)>
	//   52   99:astore          4
			Object obj2 = ((Object) (Class.forName("java.nio.file.Files")));
	//   53  101:ldc1            #8   <String "java.nio.file.Files">
	//   54  103:invokestatic    #55  <Method Class Class.forName(String)>
	//   55  106:astore          5
			Object obj = ((Object) (((Class) (java/io/File)).getMethod("toPath", new Class[0])));
	//   56  108:ldc1            #22  <Class File>
	//   57  110:ldc1            #57  <String "toPath">
	//   58  112:iconst_0        
	//   59  113:anewarray       Class[]
	//   60  116:invokevirtual   #61  <Method Method Class.getMethod(String, Class[])>
	//   61  119:astore_3        
			obj1 = ((Object) (((Class) (obj2)).getMethod("getFileStore", new Class[] {
				obj1
			})));
	//   62  120:aload           5
	//   63  122:ldc1            #63  <String "getFileStore">
	//   64  124:iconst_1        
	//   65  125:anewarray       Class[]
	//   66  128:dup             
	//   67  129:iconst_0        
	//   68  130:aload           4
	//   69  132:aastore         
	//   70  133:invokevirtual   #61  <Method Method Class.getMethod(String, Class[])>
	//   71  136:astore          4
			obj2 = ((Method) (obj)).invoke(((Object) (file)), new Object[0]);
	//   72  138:aload_3         
	//   73  139:aload_0         
	//   74  140:iconst_0        
	//   75  141:anewarray       Object[]
	//   76  144:invokevirtual   #69  <Method Object Method.invoke(Object, Object[])>
	//   77  147:astore          5
			obj = ((Method) (obj)).invoke(((Object) (file1)), new Object[0]);
	//   78  149:aload_3         
	//   79  150:aload_1         
	//   80  151:iconst_0        
	//   81  152:anewarray       Object[]
	//   82  155:invokevirtual   #69  <Method Object Method.invoke(Object, Object[])>
	//   83  158:astore_3        
			flag = ((Method) (obj1)).invoke(((Object) (null)), new Object[] {
				obj2
			}).equals(((Method) (obj1)).invoke(((Object) (null)), new Object[] {
				obj
			}));
	//   84  159:aload           4
	//   85  161:aconst_null     
	//   86  162:iconst_1        
	//   87  163:anewarray       Object[]
	//   88  166:dup             
	//   89  167:iconst_0        
	//   90  168:aload           5
	//   91  170:aastore         
	//   92  171:invokevirtual   #69  <Method Object Method.invoke(Object, Object[])>
	//   93  174:aload           4
	//   94  176:aconst_null     
	//   95  177:iconst_1        
	//   96  178:anewarray       Object[]
	//   97  181:dup             
	//   98  182:iconst_0        
	//   99  183:aload_3         
	//  100  184:aastore         
	//  101  185:invokevirtual   #69  <Method Object Method.invoke(Object, Object[])>
	//  102  188:invokevirtual   #73  <Method boolean Object.equals(Object)>
	//  103  191:istore_2        
		}
	//* 104  192:iload_2         
	//* 105  193:ireturn         
		catch(Exception exception)
	//* 106  194:astore_3        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  107  195:new             #28  <Class StringBuilder>
	//  108  198:dup             
	//  109  199:invokespecial   #29  <Method void StringBuilder()>
	//  110  202:astore          4
			stringbuilder.append("Failed to check file store equality for [");
	//  111  204:aload           4
	//  112  206:ldc1            #75  <String "Failed to check file store equality for [">
	//  113  208:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//  114  211:pop             
			stringbuilder.append(((Object) (file)));
	//  115  212:aload           4
	//  116  214:aload_0         
	//  117  215:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
	//  118  218:pop             
			stringbuilder.append("] and [");
	//  119  219:aload           4
	//  120  221:ldc1            #77  <String "] and [">
	//  121  223:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//  122  226:pop             
			stringbuilder.append(((Object) (file1)));
	//  123  227:aload           4
	//  124  229:aload_1         
	//  125  230:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
	//  126  233:pop             
			stringbuilder.append("]");
	//  127  234:aload           4
	//  128  236:ldc1            #79  <String "]">
	//  129  238:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//  130  241:pop             
			throw new RolloverFailure(stringbuilder.toString(), ((Throwable) (exception)));
	//  131  242:new             #81  <Class RolloverFailure>
	//  132  245:dup             
	//  133  246:aload           4
	//  134  248:invokevirtual   #46  <Method String StringBuilder.toString()>
	//  135  251:aload_3         
	//  136  252:invokespecial   #84  <Method void RolloverFailure(String, Throwable)>
	//  137  255:athrow          
		}
		return flag;
	}

	static final String FILES_CLASS_STR = "java.nio.file.Files";
	static final String PATH_CLASS_STR = "java.nio.file.Path";
}
