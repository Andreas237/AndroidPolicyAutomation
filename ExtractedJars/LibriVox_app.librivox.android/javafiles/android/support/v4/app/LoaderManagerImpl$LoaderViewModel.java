// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.arch.lifecycle.aa;
import android.arch.lifecycle.x;
import android.arch.lifecycle.y;
import android.arch.lifecycle.z;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//			ce, cc

class LoaderManagerImpl$LoaderViewModel extends x
{

	static LoaderManagerImpl$LoaderViewModel a(aa aa)
	{
		return (LoaderManagerImpl$LoaderViewModel)(new y(aa, a)).a(android/support/v4/app/LoaderManagerImpl$LoaderViewModel);
	//    0    0:new             #31  <Class y>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #19  <Field z a>
	//    4    8:invokespecial   #34  <Method void y(aa, z)>
	//    5   11:ldc1            #2   <Class LoaderManagerImpl$LoaderViewModel>
	//    6   13:invokevirtual   #37  <Method x y.a(Class)>
	//    7   16:checkcast       #2   <Class LoaderManagerImpl$LoaderViewModel>
	//    8   19:areturn         
	}

	cc a(int i)
	{
		return (cc)b.a(i);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field android.support.v4.g.x b>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #41  <Method Object android.support.v4.g.x.a(int)>
	//    4    8:checkcast       #43  <Class cc>
	//    5   11:areturn         
	}

	protected void a()
	{
		super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void x.a()>
		int j = b.b();
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field android.support.v4.g.x b>
	//    4    8:invokevirtual   #48  <Method int android.support.v4.g.x.b()>
	//    5   11:istore_2        
		for(int i = 0; i < j; i++)
	//*   6   12:iconst_0        
	//*   7   13:istore_1        
	//*   8   14:iload_1         
	//*   9   15:iload_2         
	//*  10   16:icmpge          42
			((cc)b.e(i)).a(true);
	//   11   19:aload_0         
	//   12   20:getfield        #26  <Field android.support.v4.g.x b>
	//   13   23:iload_1         
	//   14   24:invokevirtual   #51  <Method Object android.support.v4.g.x.e(int)>
	//   15   27:checkcast       #43  <Class cc>
	//   16   30:iconst_1        
	//   17   31:invokevirtual   #54  <Method android.support.v4.a.d cc.a(boolean)>
	//   18   34:pop             

	//   19   35:iload_1         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_1        
	//*  23   39:goto            14
		b.c();
	//   24   42:aload_0         
	//   25   43:getfield        #26  <Field android.support.v4.g.x b>
	//   26   46:invokevirtual   #56  <Method void android.support.v4.g.x.c()>
	//   27   49:return          
	}

	void a(int i, cc cc1)
	{
		b.b(i, ((Object) (cc1)));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field android.support.v4.g.x b>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #60  <Method void android.support.v4.g.x.b(int, Object)>
	//    5    9:return          
	}

	public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		if(b.b() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field android.support.v4.g.x b>
	//*   2    4:invokevirtual   #48  <Method int android.support.v4.g.x.b()>
	//*   3    7:ifle            140
		{
			printwriter.print(s);
	//    4   10:aload_3         
	//    5   11:aload_1         
	//    6   12:invokevirtual   #67  <Method void PrintWriter.print(String)>
			printwriter.println("Loaders:");
	//    7   15:aload_3         
	//    8   16:ldc1            #69  <String "Loaders:">
	//    9   18:invokevirtual   #72  <Method void PrintWriter.println(String)>
			Object obj = ((Object) (new StringBuilder()));
	//   10   21:new             #74  <Class StringBuilder>
	//   11   24:dup             
	//   12   25:invokespecial   #75  <Method void StringBuilder()>
	//   13   28:astore          6
			((StringBuilder) (obj)).append(s);
	//   14   30:aload           6
	//   15   32:aload_1         
	//   16   33:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   17   36:pop             
			((StringBuilder) (obj)).append("    ");
	//   18   37:aload           6
	//   19   39:ldc1            #81  <String "    ">
	//   20   41:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   22   45:aload           6
	//   23   47:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   24   50:astore          6
			for(int i = 0; i < b.b(); i++)
	//*  25   52:iconst_0        
	//*  26   53:istore          5
	//*  27   55:iload           5
	//*  28   57:aload_0         
	//*  29   58:getfield        #26  <Field android.support.v4.g.x b>
	//*  30   61:invokevirtual   #48  <Method int android.support.v4.g.x.b()>
	//*  31   64:icmpge          140
			{
				cc cc1 = (cc)b.e(i);
	//   32   67:aload_0         
	//   33   68:getfield        #26  <Field android.support.v4.g.x b>
	//   34   71:iload           5
	//   35   73:invokevirtual   #51  <Method Object android.support.v4.g.x.e(int)>
	//   36   76:checkcast       #43  <Class cc>
	//   37   79:astore          7
				printwriter.print(s);
	//   38   81:aload_3         
	//   39   82:aload_1         
	//   40   83:invokevirtual   #67  <Method void PrintWriter.print(String)>
				printwriter.print("  #");
	//   41   86:aload_3         
	//   42   87:ldc1            #87  <String "  #">
	//   43   89:invokevirtual   #67  <Method void PrintWriter.print(String)>
				printwriter.print(b.d(i));
	//   44   92:aload_3         
	//   45   93:aload_0         
	//   46   94:getfield        #26  <Field android.support.v4.g.x b>
	//   47   97:iload           5
	//   48   99:invokevirtual   #91  <Method int android.support.v4.g.x.d(int)>
	//   49  102:invokevirtual   #94  <Method void PrintWriter.print(int)>
				printwriter.print(": ");
	//   50  105:aload_3         
	//   51  106:ldc1            #96  <String ": ">
	//   52  108:invokevirtual   #67  <Method void PrintWriter.print(String)>
				printwriter.println(cc1.toString());
	//   53  111:aload_3         
	//   54  112:aload           7
	//   55  114:invokevirtual   #97  <Method String cc.toString()>
	//   56  117:invokevirtual   #72  <Method void PrintWriter.println(String)>
				cc1.a(((String) (obj)), filedescriptor, printwriter, as);
	//   57  120:aload           7
	//   58  122:aload           6
	//   59  124:aload_2         
	//   60  125:aload_3         
	//   61  126:aload           4
	//   62  128:invokevirtual   #99  <Method void cc.a(String, FileDescriptor, PrintWriter, String[])>
			}

	//   63  131:iload           5
	//   64  133:iconst_1        
	//   65  134:iadd            
	//   66  135:istore          5
		}
	//*  67  137:goto            55
	//   68  140:return          
	}

	void b()
	{
		c = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #28  <Field boolean c>
	//    3    5:return          
	}

	boolean c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field boolean c>
	//    2    4:ireturn         
	}

	void d()
	{
		c = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #28  <Field boolean c>
	//    3    5:return          
	}

	void e()
	{
		int j = b.b();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field android.support.v4.g.x b>
	//    2    4:invokevirtual   #48  <Method int android.support.v4.g.x.b()>
	//    3    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          36
			((cc)b.e(i)).g();
	//    9   15:aload_0         
	//   10   16:getfield        #26  <Field android.support.v4.g.x b>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #51  <Method Object android.support.v4.g.x.e(int)>
	//   13   23:checkcast       #43  <Class cc>
	//   14   26:invokevirtual   #103 <Method void cc.g()>

	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_1        
	//*  19   33:goto            10
	//   20   36:return          
	}

	private static final z a = new ce();
	private android.support.v4.g.x b;
	private boolean c;

	static 
	{
	//    0    0:new             #14  <Class ce>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void ce()>
	//    3    7:putstatic       #19  <Field z a>
	//*   4   10:return          
	}

	LoaderManagerImpl$LoaderViewModel()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void x()>
		b = new android.support.v4.g.x();
	//    2    4:aload_0         
	//    3    5:new             #23  <Class android.support.v4.g.x>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void android.support.v4.g.x()>
	//    6   12:putfield        #26  <Field android.support.v4.g.x b>
		c = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #28  <Field boolean c>
	//   10   20:return          
	}
}
