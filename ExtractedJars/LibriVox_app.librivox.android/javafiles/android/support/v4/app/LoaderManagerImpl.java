// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.arch.lifecycle.aa;
import android.arch.lifecycle.j;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.a.d;
import android.support.v4.g.f;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

// Referenced classes of package android.support.v4.app:
//			ca, cb, cc

class LoaderManagerImpl extends ca
{

	LoaderManagerImpl(j j, aa aa)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void ca()>
		b = j;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field j b>
		c = LoaderViewModel.a(aa);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #25  <Method LoaderManagerImpl$LoaderViewModel LoaderManagerImpl$LoaderViewModel.a(aa)>
	//    8   14:putfield        #27  <Field LoaderManagerImpl$LoaderViewModel c>
	//    9   17:return          
	}

	private d a(int i, Bundle bundle, cb cb1, d d)
	{
		d d1;
		c.b();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field LoaderManagerImpl$LoaderViewModel c>
	//    2    4:invokevirtual   #30  <Method void LoaderManagerImpl$LoaderViewModel.b()>
		d1 = cb1.a(i, bundle);
	//    3    7:aload_3         
	//    4    8:iload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #35  <Method d cb.a(int, Bundle)>
	//    7   15:astore          5
		if(d1 == null)
			break MISSING_BLOCK_LABEL_165;
	//    8   17:aload           5
	//    9   19:ifnull          165
		if(!((Object) (d1)).getClass().isMemberClass() || Modifier.isStatic(((Object) (d1)).getClass().getModifiers()))
	//*  10   22:aload           5
	//*  11   24:invokevirtual   #41  <Method Class Object.getClass()>
	//*  12   27:invokevirtual   #47  <Method boolean Class.isMemberClass()>
	//*  13   30:ifeq            84
	//*  14   33:aload           5
	//*  15   35:invokevirtual   #41  <Method Class Object.getClass()>
	//*  16   38:invokevirtual   #51  <Method int Class.getModifiers()>
	//*  17   41:invokestatic    #57  <Method boolean Modifier.isStatic(int)>
	//*  18   44:ifeq            50
			break MISSING_BLOCK_LABEL_84;
	//   19   47:goto            84
		bundle = ((Bundle) (new StringBuilder()));
	//   20   50:new             #59  <Class StringBuilder>
	//   21   53:dup             
	//   22   54:invokespecial   #60  <Method void StringBuilder()>
	//   23   57:astore_2        
		((StringBuilder) (bundle)).append("Object returned from onCreateLoader must not be a non-static inner member class: ");
	//   24   58:aload_2         
	//   25   59:ldc1            #62  <String "Object returned from onCreateLoader must not be a non-static inner member class: ">
	//   26   61:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   27   64:pop             
		((StringBuilder) (bundle)).append(((Object) (d1)));
	//   28   65:aload_2         
	//   29   66:aload           5
	//   30   68:invokevirtual   #69  <Method StringBuilder StringBuilder.append(Object)>
	//   31   71:pop             
		throw new IllegalArgumentException(((StringBuilder) (bundle)).toString());
	//   32   72:new             #71  <Class IllegalArgumentException>
	//   33   75:dup             
	//   34   76:aload_2         
	//   35   77:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   36   80:invokespecial   #78  <Method void IllegalArgumentException(String)>
	//   37   83:athrow          
		bundle = ((Bundle) (new cc(i, bundle, d1, d)));
	//   38   84:new             #80  <Class cc>
	//   39   87:dup             
	//   40   88:iload_1         
	//   41   89:aload_2         
	//   42   90:aload           5
	//   43   92:aload           4
	//   44   94:invokespecial   #83  <Method void cc(int, Bundle, d, d)>
	//   45   97:astore_2        
		if(a)
	//*  46   98:getstatic       #85  <Field boolean a>
	//*  47  101:ifeq            139
		{
			d = ((d) (new StringBuilder()));
	//   48  104:new             #59  <Class StringBuilder>
	//   49  107:dup             
	//   50  108:invokespecial   #60  <Method void StringBuilder()>
	//   51  111:astore          4
			((StringBuilder) (d)).append("  Created new loader ");
	//   52  113:aload           4
	//   53  115:ldc1            #87  <String "  Created new loader ">
	//   54  117:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   55  120:pop             
			((StringBuilder) (d)).append(((Object) (bundle)));
	//   56  121:aload           4
	//   57  123:aload_2         
	//   58  124:invokevirtual   #69  <Method StringBuilder StringBuilder.append(Object)>
	//   59  127:pop             
			Log.v("LoaderManager", ((StringBuilder) (d)).toString());
	//   60  128:ldc1            #89  <String "LoaderManager">
	//   61  130:aload           4
	//   62  132:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   63  135:invokestatic    #95  <Method int Log.v(String, String)>
	//   64  138:pop             
		}
		c.a(i, ((cc) (bundle)));
	//   65  139:aload_0         
	//   66  140:getfield        #27  <Field LoaderManagerImpl$LoaderViewModel c>
	//   67  143:iload_1         
	//   68  144:aload_2         
	//   69  145:invokevirtual   #98  <Method void LoaderManagerImpl$LoaderViewModel.a(int, cc)>
		c.d();
	//   70  148:aload_0         
	//   71  149:getfield        #27  <Field LoaderManagerImpl$LoaderViewModel c>
	//   72  152:invokevirtual   #101 <Method void android.support.v4.app.LoaderManagerImpl$LoaderViewModel.d()>
		return ((cc) (bundle)).a(b, cb1);
	//   73  155:aload_2         
	//   74  156:aload_0         
	//   75  157:getfield        #20  <Field j b>
	//   76  160:aload_3         
	//   77  161:invokevirtual   #104 <Method d cc.a(j, cb)>
	//   78  164:areturn         
		throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
	//   79  165:new             #71  <Class IllegalArgumentException>
	//   80  168:dup             
	//   81  169:ldc1            #106 <String "Object returned from onCreateLoader must not be null">
	//   82  171:invokespecial   #78  <Method void IllegalArgumentException(String)>
	//   83  174:athrow          
		bundle;
	//   84  175:astore_2        
		c.d();
	//   85  176:aload_0         
	//   86  177:getfield        #27  <Field LoaderManagerImpl$LoaderViewModel c>
	//   87  180:invokevirtual   #101 <Method void android.support.v4.app.LoaderManagerImpl$LoaderViewModel.d()>
		throw bundle;
	//   88  183:aload_2         
	//   89  184:athrow          
	}

	public d a(int i, Bundle bundle, cb cb1)
	{
		if(!c.c())
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field LoaderManagerImpl$LoaderViewModel c>
	//*   2    4:invokevirtual   #109 <Method boolean LoaderManagerImpl$LoaderViewModel.c()>
	//*   3    7:ifne            158
		{
			if(Looper.getMainLooper() == Looper.myLooper())
	//*   4   10:invokestatic    #115 <Method Looper Looper.getMainLooper()>
	//*   5   13:invokestatic    #118 <Method Looper Looper.myLooper()>
	//*   6   16:if_acmpne       148
			{
				cc cc1 = c.a(i);
	//    7   19:aload_0         
	//    8   20:getfield        #27  <Field LoaderManagerImpl$LoaderViewModel c>
	//    9   23:iload_1         
	//   10   24:invokevirtual   #121 <Method cc LoaderManagerImpl$LoaderViewModel.a(int)>
	//   11   27:astore          4
				if(a)
	//*  12   29:getstatic       #85  <Field boolean a>
	//*  13   32:ifeq            85
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   14   35:new             #59  <Class StringBuilder>
	//   15   38:dup             
	//   16   39:invokespecial   #60  <Method void StringBuilder()>
	//   17   42:astore          5
					stringbuilder.append("initLoader in ");
	//   18   44:aload           5
	//   19   46:ldc1            #123 <String "initLoader in ">
	//   20   48:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   21   51:pop             
					stringbuilder.append(((Object) (this)));
	//   22   52:aload           5
	//   23   54:aload_0         
	//   24   55:invokevirtual   #69  <Method StringBuilder StringBuilder.append(Object)>
	//   25   58:pop             
					stringbuilder.append(": args=");
	//   26   59:aload           5
	//   27   61:ldc1            #125 <String ": args=">
	//   28   63:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   29   66:pop             
					stringbuilder.append(((Object) (bundle)));
	//   30   67:aload           5
	//   31   69:aload_2         
	//   32   70:invokevirtual   #69  <Method StringBuilder StringBuilder.append(Object)>
	//   33   73:pop             
					Log.v("LoaderManager", stringbuilder.toString());
	//   34   74:ldc1            #89  <String "LoaderManager">
	//   35   76:aload           5
	//   36   78:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   37   81:invokestatic    #95  <Method int Log.v(String, String)>
	//   38   84:pop             
				}
				if(cc1 == null)
	//*  39   85:aload           4
	//*  40   87:ifnonnull       99
					return a(i, bundle, cb1, ((d) (null)));
	//   41   90:aload_0         
	//   42   91:iload_1         
	//   43   92:aload_2         
	//   44   93:aload_3         
	//   45   94:aconst_null     
	//   46   95:invokespecial   #127 <Method d a(int, Bundle, cb, d)>
	//   47   98:areturn         
				if(a)
	//*  48   99:getstatic       #85  <Field boolean a>
	//*  49  102:ifeq            137
				{
					bundle = ((Bundle) (new StringBuilder()));
	//   50  105:new             #59  <Class StringBuilder>
	//   51  108:dup             
	//   52  109:invokespecial   #60  <Method void StringBuilder()>
	//   53  112:astore_2        
					((StringBuilder) (bundle)).append("  Re-using existing loader ");
	//   54  113:aload_2         
	//   55  114:ldc1            #129 <String "  Re-using existing loader ">
	//   56  116:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   57  119:pop             
					((StringBuilder) (bundle)).append(((Object) (cc1)));
	//   58  120:aload_2         
	//   59  121:aload           4
	//   60  123:invokevirtual   #69  <Method StringBuilder StringBuilder.append(Object)>
	//   61  126:pop             
					Log.v("LoaderManager", ((StringBuilder) (bundle)).toString());
	//   62  127:ldc1            #89  <String "LoaderManager">
	//   63  129:aload_2         
	//   64  130:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   65  133:invokestatic    #95  <Method int Log.v(String, String)>
	//   66  136:pop             
				}
				return cc1.a(b, cb1);
	//   67  137:aload           4
	//   68  139:aload_0         
	//   69  140:getfield        #20  <Field j b>
	//   70  143:aload_3         
	//   71  144:invokevirtual   #104 <Method d cc.a(j, cb)>
	//   72  147:areturn         
			} else
			{
				throw new IllegalStateException("initLoader must be called on the main thread");
	//   73  148:new             #131 <Class IllegalStateException>
	//   74  151:dup             
	//   75  152:ldc1            #133 <String "initLoader must be called on the main thread">
	//   76  154:invokespecial   #134 <Method void IllegalStateException(String)>
	//   77  157:athrow          
			}
		} else
		{
			throw new IllegalStateException("Called while creating a loader");
	//   78  158:new             #131 <Class IllegalStateException>
	//   79  161:dup             
	//   80  162:ldc1            #136 <String "Called while creating a loader">
	//   81  164:invokespecial   #134 <Method void IllegalStateException(String)>
	//   82  167:athrow          
		}
	}

	public void a()
	{
		c.e();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field LoaderManagerImpl$LoaderViewModel c>
	//    2    4:invokevirtual   #139 <Method void LoaderManagerImpl$LoaderViewModel.e()>
	//    3    7:return          
	}

	public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		c.a(s, filedescriptor, printwriter, as);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field LoaderManagerImpl$LoaderViewModel c>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #143 <Method void LoaderManagerImpl$LoaderViewModel.a(String, FileDescriptor, PrintWriter, String[])>
	//    7   12:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(128);
	//    0    0:new             #59  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          128
	//    3    7:invokespecial   #147 <Method void StringBuilder(int)>
	//    4   10:astore_1        
		stringbuilder.append("LoaderManager{");
	//    5   11:aload_1         
	//    6   12:ldc1            #149 <String "LoaderManager{">
	//    7   14:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    9   18:aload_1         
	//   10   19:aload_0         
	//   11   20:invokestatic    #155 <Method int System.identityHashCode(Object)>
	//   12   23:invokestatic    #161 <Method String Integer.toHexString(int)>
	//   13   26:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
		stringbuilder.append(" in ");
	//   15   30:aload_1         
	//   16   31:ldc1            #163 <String " in ">
	//   17   33:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
		f.a(((Object) (b)), stringbuilder);
	//   19   37:aload_0         
	//   20   38:getfield        #20  <Field j b>
	//   21   41:aload_1         
	//   22   42:invokestatic    #168 <Method void f.a(Object, StringBuilder)>
		stringbuilder.append("}}");
	//   23   45:aload_1         
	//   24   46:ldc1            #170 <String "}}">
	//   25   48:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
		return stringbuilder.toString();
	//   27   52:aload_1         
	//   28   53:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   29   56:areturn         
	}

	static boolean a = false;
	private final j b;
	private final LoaderViewModel c;

	static 
	{
	//    0    0:return          
	}

	private class LoaderViewModel extends x
	{

		static LoaderViewModel a(aa aa)
		{
			return (LoaderViewModel)(new y(aa, a)).a(android/support/v4/app/LoaderManagerImpl$LoaderViewModel);
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
		//   17   31:invokevirtual   #54  <Method d cc.a(boolean)>
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

		LoaderViewModel()
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

}
