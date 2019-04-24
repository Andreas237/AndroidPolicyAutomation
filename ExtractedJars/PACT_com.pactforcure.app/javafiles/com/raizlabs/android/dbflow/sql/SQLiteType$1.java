// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql;

import com.raizlabs.android.dbflow.data.Blob;
import java.util.HashMap;

// Referenced classes of package com.raizlabs.android.dbflow.sql:
//			SQLiteType

static final class SQLiteType$1 extends HashMap
{

	SQLiteType$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void HashMap()>
		put(((Object) (Byte.TYPE.getName())), ((Object) (SQLiteType.INTEGER)));
	//    2    4:aload_0         
	//    3    5:getstatic       #17  <Field Class Byte.TYPE>
	//    4    8:invokevirtual   #23  <Method String Class.getName()>
	//    5   11:getstatic       #27  <Field SQLiteType SQLiteType.INTEGER>
	//    6   14:invokevirtual   #31  <Method Object put(Object, Object)>
	//    7   17:pop             
		put(((Object) (Short.TYPE.getName())), ((Object) (SQLiteType.INTEGER)));
	//    8   18:aload_0         
	//    9   19:getstatic       #34  <Field Class Short.TYPE>
	//   10   22:invokevirtual   #23  <Method String Class.getName()>
	//   11   25:getstatic       #27  <Field SQLiteType SQLiteType.INTEGER>
	//   12   28:invokevirtual   #31  <Method Object put(Object, Object)>
	//   13   31:pop             
		put(((Object) (Integer.TYPE.getName())), ((Object) (SQLiteType.INTEGER)));
	//   14   32:aload_0         
	//   15   33:getstatic       #37  <Field Class Integer.TYPE>
	//   16   36:invokevirtual   #23  <Method String Class.getName()>
	//   17   39:getstatic       #27  <Field SQLiteType SQLiteType.INTEGER>
	//   18   42:invokevirtual   #31  <Method Object put(Object, Object)>
	//   19   45:pop             
		put(((Object) (Long.TYPE.getName())), ((Object) (SQLiteType.INTEGER)));
	//   20   46:aload_0         
	//   21   47:getstatic       #40  <Field Class Long.TYPE>
	//   22   50:invokevirtual   #23  <Method String Class.getName()>
	//   23   53:getstatic       #27  <Field SQLiteType SQLiteType.INTEGER>
	//   24   56:invokevirtual   #31  <Method Object put(Object, Object)>
	//   25   59:pop             
		put(((Object) (Float.TYPE.getName())), ((Object) (SQLiteType.REAL)));
	//   26   60:aload_0         
	//   27   61:getstatic       #43  <Field Class Float.TYPE>
	//   28   64:invokevirtual   #23  <Method String Class.getName()>
	//   29   67:getstatic       #46  <Field SQLiteType SQLiteType.REAL>
	//   30   70:invokevirtual   #31  <Method Object put(Object, Object)>
	//   31   73:pop             
		put(((Object) (Double.TYPE.getName())), ((Object) (SQLiteType.REAL)));
	//   32   74:aload_0         
	//   33   75:getstatic       #49  <Field Class Double.TYPE>
	//   34   78:invokevirtual   #23  <Method String Class.getName()>
	//   35   81:getstatic       #46  <Field SQLiteType SQLiteType.REAL>
	//   36   84:invokevirtual   #31  <Method Object put(Object, Object)>
	//   37   87:pop             
		put(((Object) (Boolean.TYPE.getName())), ((Object) (SQLiteType.INTEGER)));
	//   38   88:aload_0         
	//   39   89:getstatic       #52  <Field Class Boolean.TYPE>
	//   40   92:invokevirtual   #23  <Method String Class.getName()>
	//   41   95:getstatic       #27  <Field SQLiteType SQLiteType.INTEGER>
	//   42   98:invokevirtual   #31  <Method Object put(Object, Object)>
	//   43  101:pop             
		put(((Object) (Character.TYPE.getName())), ((Object) (SQLiteType.TEXT)));
	//   44  102:aload_0         
	//   45  103:getstatic       #55  <Field Class Character.TYPE>
	//   46  106:invokevirtual   #23  <Method String Class.getName()>
	//   47  109:getstatic       #58  <Field SQLiteType SQLiteType.TEXT>
	//   48  112:invokevirtual   #31  <Method Object put(Object, Object)>
	//   49  115:pop             
		put(((Object) (((Class) ([B)).getName())), ((Object) (SQLiteType.BLOB)));
	//   50  116:aload_0         
	//   51  117:ldc1            #60  <Class byte[]>
	//   52  119:invokevirtual   #23  <Method String Class.getName()>
	//   53  122:getstatic       #63  <Field SQLiteType SQLiteType.BLOB>
	//   54  125:invokevirtual   #31  <Method Object put(Object, Object)>
	//   55  128:pop             
		put(((Object) (((Class) (java/lang/Byte)).getName())), ((Object) (SQLiteType.INTEGER)));
	//   56  129:aload_0         
	//   57  130:ldc1            #13  <Class Byte>
	//   58  132:invokevirtual   #23  <Method String Class.getName()>
	//   59  135:getstatic       #27  <Field SQLiteType SQLiteType.INTEGER>
	//   60  138:invokevirtual   #31  <Method Object put(Object, Object)>
	//   61  141:pop             
		put(((Object) (((Class) (java/lang/Short)).getName())), ((Object) (SQLiteType.INTEGER)));
	//   62  142:aload_0         
	//   63  143:ldc1            #33  <Class Short>
	//   64  145:invokevirtual   #23  <Method String Class.getName()>
	//   65  148:getstatic       #27  <Field SQLiteType SQLiteType.INTEGER>
	//   66  151:invokevirtual   #31  <Method Object put(Object, Object)>
	//   67  154:pop             
		put(((Object) (((Class) (java/lang/Integer)).getName())), ((Object) (SQLiteType.INTEGER)));
	//   68  155:aload_0         
	//   69  156:ldc1            #36  <Class Integer>
	//   70  158:invokevirtual   #23  <Method String Class.getName()>
	//   71  161:getstatic       #27  <Field SQLiteType SQLiteType.INTEGER>
	//   72  164:invokevirtual   #31  <Method Object put(Object, Object)>
	//   73  167:pop             
		put(((Object) (((Class) (java/lang/Long)).getName())), ((Object) (SQLiteType.INTEGER)));
	//   74  168:aload_0         
	//   75  169:ldc1            #39  <Class Long>
	//   76  171:invokevirtual   #23  <Method String Class.getName()>
	//   77  174:getstatic       #27  <Field SQLiteType SQLiteType.INTEGER>
	//   78  177:invokevirtual   #31  <Method Object put(Object, Object)>
	//   79  180:pop             
		put(((Object) (((Class) (java/lang/Float)).getName())), ((Object) (SQLiteType.REAL)));
	//   80  181:aload_0         
	//   81  182:ldc1            #42  <Class Float>
	//   82  184:invokevirtual   #23  <Method String Class.getName()>
	//   83  187:getstatic       #46  <Field SQLiteType SQLiteType.REAL>
	//   84  190:invokevirtual   #31  <Method Object put(Object, Object)>
	//   85  193:pop             
		put(((Object) (((Class) (java/lang/Double)).getName())), ((Object) (SQLiteType.REAL)));
	//   86  194:aload_0         
	//   87  195:ldc1            #48  <Class Double>
	//   88  197:invokevirtual   #23  <Method String Class.getName()>
	//   89  200:getstatic       #46  <Field SQLiteType SQLiteType.REAL>
	//   90  203:invokevirtual   #31  <Method Object put(Object, Object)>
	//   91  206:pop             
		put(((Object) (((Class) (java/lang/Boolean)).getName())), ((Object) (SQLiteType.INTEGER)));
	//   92  207:aload_0         
	//   93  208:ldc1            #51  <Class Boolean>
	//   94  210:invokevirtual   #23  <Method String Class.getName()>
	//   95  213:getstatic       #27  <Field SQLiteType SQLiteType.INTEGER>
	//   96  216:invokevirtual   #31  <Method Object put(Object, Object)>
	//   97  219:pop             
		put(((Object) (((Class) (java/lang/Character)).getName())), ((Object) (SQLiteType.TEXT)));
	//   98  220:aload_0         
	//   99  221:ldc1            #54  <Class Character>
	//  100  223:invokevirtual   #23  <Method String Class.getName()>
	//  101  226:getstatic       #58  <Field SQLiteType SQLiteType.TEXT>
	//  102  229:invokevirtual   #31  <Method Object put(Object, Object)>
	//  103  232:pop             
		put(((Object) (((Class) (java/lang/CharSequence)).getName())), ((Object) (SQLiteType.TEXT)));
	//  104  233:aload_0         
	//  105  234:ldc1            #65  <Class CharSequence>
	//  106  236:invokevirtual   #23  <Method String Class.getName()>
	//  107  239:getstatic       #58  <Field SQLiteType SQLiteType.TEXT>
	//  108  242:invokevirtual   #31  <Method Object put(Object, Object)>
	//  109  245:pop             
		put(((Object) (((Class) (java/lang/String)).getName())), ((Object) (SQLiteType.TEXT)));
	//  110  246:aload_0         
	//  111  247:ldc1            #67  <Class String>
	//  112  249:invokevirtual   #23  <Method String Class.getName()>
	//  113  252:getstatic       #58  <Field SQLiteType SQLiteType.TEXT>
	//  114  255:invokevirtual   #31  <Method Object put(Object, Object)>
	//  115  258:pop             
		put(((Object) (((Class) ([Ljava/lang/Byte;)).getName())), ((Object) (SQLiteType.BLOB)));
	//  116  259:aload_0         
	//  117  260:ldc1            #69  <Class Byte[]>
	//  118  262:invokevirtual   #23  <Method String Class.getName()>
	//  119  265:getstatic       #63  <Field SQLiteType SQLiteType.BLOB>
	//  120  268:invokevirtual   #31  <Method Object put(Object, Object)>
	//  121  271:pop             
		put(((Object) (((Class) (com/raizlabs/android/dbflow/data/Blob)).getName())), ((Object) (SQLiteType.BLOB)));
	//  122  272:aload_0         
	//  123  273:ldc1            #71  <Class Blob>
	//  124  275:invokevirtual   #23  <Method String Class.getName()>
	//  125  278:getstatic       #63  <Field SQLiteType SQLiteType.BLOB>
	//  126  281:invokevirtual   #31  <Method Object put(Object, Object)>
	//  127  284:pop             
	//  128  285:return          
	}
}
