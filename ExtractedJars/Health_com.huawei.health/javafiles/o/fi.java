// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.*;
import java.util.*;

// Referenced classes of package o:
//			ei

public final class fi
{

	private static void a(List list)
	{
		o/fi;
	//    0    0:ldc1            #2   <Class fi>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(!ei.b(a) && !ei.b(d))
			break MISSING_BLOCK_LABEL_25;
	//    2    3:getstatic       #16  <Field String a>
	//    3    6:invokestatic    #27  <Method boolean ei.b(String)>
	//    4    9:ifne            21
	//    5   12:getstatic       #18  <Field String d>
	//    6   15:invokestatic    #27  <Method boolean ei.b(String)>
	//    7   18:ifeq            25
		o/fi;
	//    8   21:ldc1            #2   <Class fi>
		JVM INSTR monitorexit ;
	//    9   23:monitorexit     
		return;
	//   10   24:return          
		StringBuffer stringbuffer;
		stringbuffer = new StringBuffer();
	//   11   25:new             #29  <Class StringBuffer>
	//   12   28:dup             
	//   13   29:invokespecial   #32  <Method void StringBuffer()>
	//   14   32:astore_3        
		stringbuffer.append(d);
	//   15   33:aload_3         
	//   16   34:getstatic       #18  <Field String d>
	//   17   37:invokevirtual   #36  <Method StringBuffer StringBuffer.append(String)>
	//   18   40:pop             
		String s;
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); stringbuffer.append((new StringBuilder(", ")).append(s).toString()))
	//*  19   41:aload_0         
	//*  20   42:invokeinterface #42  <Method Iterator List.iterator()>
	//*  21   47:astore_0        
	//*  22   48:aload_0         
	//*  23   49:invokeinterface #48  <Method boolean Iterator.hasNext()>
	//*  24   54:ifeq            93
			s = (String)((Iterator) (list)).next();
	//   25   57:aload_0         
	//   26   58:invokeinterface #52  <Method Object Iterator.next()>
	//   27   63:checkcast       #54  <Class String>
	//   28   66:astore          4

	//   29   68:aload_3         
	//   30   69:new             #56  <Class StringBuilder>
	//   31   72:dup             
	//   32   73:ldc1            #58  <String ", ">
	//   33   75:invokespecial   #61  <Method void StringBuilder(String)>
	//   34   78:aload           4
	//   35   80:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   36   83:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   37   86:invokevirtual   #36  <Method StringBuffer StringBuffer.append(String)>
	//   38   89:pop             
	//*  39   90:goto            48
		stringbuffer.append("\n");
	//   40   93:aload_3         
	//   41   94:ldc1            #70  <String "\n">
	//   42   96:invokevirtual   #36  <Method StringBuffer StringBuffer.append(String)>
	//   43   99:pop             
		try
		{
			list = ((List) (new File(b)));
	//   44  100:new             #72  <Class File>
	//   45  103:dup             
	//   46  104:getstatic       #14  <Field String b>
	//   47  107:invokespecial   #73  <Method void File(String)>
	//   48  110:astore_0        
			if(!((File) (list)).exists())
	//*  49  111:aload_0         
	//*  50  112:invokevirtual   #76  <Method boolean File.exists()>
	//*  51  115:ifne            123
				((File) (list)).mkdirs();
	//   52  118:aload_0         
	//   53  119:invokevirtual   #79  <Method boolean File.mkdirs()>
	//   54  122:pop             
			list = ((List) (new File(b, a)));
	//   55  123:new             #72  <Class File>
	//   56  126:dup             
	//   57  127:getstatic       #14  <Field String b>
	//   58  130:getstatic       #16  <Field String a>
	//   59  133:invokespecial   #82  <Method void File(String, String)>
	//   60  136:astore_0        
			if(!((File) (list)).exists())
	//*  61  137:aload_0         
	//*  62  138:invokevirtual   #76  <Method boolean File.exists()>
	//*  63  141:ifne            149
				((File) (list)).createNewFile();
	//   64  144:aload_0         
	//   65  145:invokevirtual   #85  <Method boolean File.createNewFile()>
	//   66  148:pop             
			long l = ((File) (list)).length();
	//   67  149:aload_0         
	//   68  150:invokevirtual   #89  <Method long File.length()>
	//   69  153:lstore_1        
			if((long)stringbuffer.length() + l <= 51200L)
	//*  70  154:aload_3         
	//*  71  155:invokevirtual   #92  <Method int StringBuffer.length()>
	//*  72  158:i2l             
	//*  73  159:lload_1         
	//*  74  160:ladd            
	//*  75  161:ldc2w           #93  <Long 51200L>
	//*  76  164:lcmp            
	//*  77  165:ifgt            181
			{
				list = ((List) (new FileWriter(((File) (list)), true)));
	//   78  168:new             #96  <Class FileWriter>
	//   79  171:dup             
	//   80  172:aload_0         
	//   81  173:iconst_1        
	//   82  174:invokespecial   #99  <Method void FileWriter(File, boolean)>
	//   83  177:astore_0        
				break MISSING_BLOCK_LABEL_190;
	//   84  178:goto            190
			}
		}
	//*  85  181:new             #96  <Class FileWriter>
	//*  86  184:dup             
	//*  87  185:aload_0         
	//*  88  186:invokespecial   #102 <Method void FileWriter(File)>
	//*  89  189:astore_0        
	//*  90  190:aload_0         
	//*  91  191:aload_3         
	//*  92  192:invokevirtual   #103 <Method String StringBuffer.toString()>
	//*  93  195:invokevirtual   #106 <Method void FileWriter.write(String)>
	//*  94  198:aload_0         
	//*  95  199:invokevirtual   #109 <Method void FileWriter.flush()>
	//*  96  202:aload_0         
	//*  97  203:invokevirtual   #112 <Method void FileWriter.close()>
	//*  98  206:ldc1            #2   <Class fi>
	//*  99  208:monitorexit     
	//* 100  209:return          
	//* 101  210:ldc1            #2   <Class fi>
	//* 102  212:monitorexit     
	//* 103  213:return          
	//* 104  214:astore_0        
	//* 105  215:ldc1            #2   <Class fi>
	//* 106  217:monitorexit     
	//* 107  218:aload_0         
	//* 108  219:athrow          
		// Misplaced declaration of an exception variable
		catch(List list)
		{
			return;
		}
		list = ((List) (new FileWriter(((File) (list)))));
		((FileWriter) (list)).write(stringbuffer.toString());
		((FileWriter) (list)).flush();
		((FileWriter) (list)).close();
		o/fi;
		JVM INSTR monitorexit ;
		return;
		list;
		throw list;
	//* 109  220:astore_0        
	//* 110  221:goto            210
	}

	public static void c(Throwable throwable)
	{
		o/fi;
	//    0    0:ldc1            #2   <Class fi>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		ArrayList arraylist = new ArrayList();
	//    2    3:new             #118 <Class ArrayList>
	//    3    6:dup             
	//    4    7:invokespecial   #119 <Method void ArrayList()>
	//    5   10:astore_1        
		if(throwable == null) goto _L2; else goto _L1
	//    6   11:aload_0         
	//    7   12:ifnull          65
_L1:
		StringWriter stringwriter = new StringWriter();
	//    8   15:new             #121 <Class StringWriter>
	//    9   18:dup             
	//   10   19:invokespecial   #122 <Method void StringWriter()>
	//   11   22:astore_2        
		throwable.printStackTrace(new PrintWriter(((java.io.Writer) (stringwriter))));
	//   12   23:aload_0         
	//   13   24:new             #124 <Class PrintWriter>
	//   14   27:dup             
	//   15   28:aload_2         
	//   16   29:invokespecial   #127 <Method void PrintWriter(java.io.Writer)>
	//   17   32:invokevirtual   #133 <Method void Throwable.printStackTrace(PrintWriter)>
		throwable = ((Throwable) (((Object) (stringwriter)).toString()));
	//   18   35:aload_2         
	//   19   36:invokevirtual   #134 <Method String Object.toString()>
	//   20   39:astore_0        
	//*  21   40:goto            43
_L4:
		((List) (arraylist)).add(((Object) (throwable)));
	//   22   43:aload_1         
	//   23   44:aload_0         
	//   24   45:invokeinterface #138 <Method boolean List.add(Object)>
	//   25   50:pop             
		a(((List) (arraylist)));
	//   26   51:aload_1         
	//   27   52:invokestatic    #140 <Method void a(List)>
		o/fi;
	//   28   55:ldc1            #2   <Class fi>
		JVM INSTR monitorexit ;
	//   29   57:monitorexit     
		return;
	//   30   58:return          
		throwable;
	//   31   59:astore_0        
	//*  32   60:ldc1            #2   <Class fi>
		throw throwable;
	//   33   62:monitorexit     
	//   34   63:aload_0         
	//   35   64:athrow          
_L2:
		throwable = "";
	//   36   65:ldc1            #12  <String "">
	//   37   67:astore_0        
		if(true) goto _L4; else goto _L3
	//   38   68:goto            43
_L3:
	}

	public static void d(String s)
	{
		o/fi;
	//    0    0:ldc1            #2   <Class fi>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		ArrayList arraylist = new ArrayList();
	//    2    3:new             #118 <Class ArrayList>
	//    3    6:dup             
	//    4    7:invokespecial   #119 <Method void ArrayList()>
	//    5   10:astore_1        
		((List) (arraylist)).add(((Object) (s)));
	//    6   11:aload_1         
	//    7   12:aload_0         
	//    8   13:invokeinterface #138 <Method boolean List.add(Object)>
	//    9   18:pop             
		a(((List) (arraylist)));
	//   10   19:aload_1         
	//   11   20:invokestatic    #140 <Method void a(List)>
		o/fi;
	//   12   23:ldc1            #2   <Class fi>
		JVM INSTR monitorexit ;
	//   13   25:monitorexit     
		return;
	//   14   26:return          
		s;
	//   15   27:astore_0        
	//*  16   28:ldc1            #2   <Class fi>
		throw s;
	//   17   30:monitorexit     
	//   18   31:aload_0         
	//   19   32:athrow          
	}

	public static void e(String s, String s1, String s2)
	{
		o/fi;
	//    0    0:ldc1            #2   <Class fi>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		b = s;
	//    2    3:aload_0         
	//    3    4:putstatic       #14  <Field String b>
		a = s1;
	//    4    7:aload_1         
	//    5    8:putstatic       #16  <Field String a>
		d = s2;
	//    6   11:aload_2         
	//    7   12:putstatic       #18  <Field String d>
		o/fi;
	//    8   15:ldc1            #2   <Class fi>
		JVM INSTR monitorexit ;
	//    9   17:monitorexit     
		return;
	//   10   18:return          
		s;
	//   11   19:astore_0        
	//*  12   20:ldc1            #2   <Class fi>
		throw s;
	//   13   22:monitorexit     
	//   14   23:aload_0         
	//   15   24:athrow          
	}

	private static String a = "";
	private static String b = "";
	private static String d = "";

	static 
	{
	//    0    0:ldc1            #12  <String "">
	//    1    2:putstatic       #14  <Field String b>
	//    2    5:ldc1            #12  <String "">
	//    3    7:putstatic       #16  <Field String a>
	//    4   10:ldc1            #12  <String "">
	//    5   12:putstatic       #18  <Field String d>
	//*   6   15:return          
	}
}
