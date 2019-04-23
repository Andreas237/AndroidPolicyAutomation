// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.arch.lifecycle.j;
import android.arch.lifecycle.s;
import android.arch.lifecycle.t;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.a.d;
import android.support.v4.a.f;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//			cd, LoaderManagerImpl, cb

public class cc extends s
	implements f
{

	cc(int i, Bundle bundle, d d1, d d2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void s()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #24  <Field int a>
		b = bundle;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field Bundle b>
		c = d1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field d c>
		f = d2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #30  <Field d f>
		c.a(i, ((f) (this)));
	//   14   25:aload_0         
	//   15   26:getfield        #28  <Field d c>
	//   16   29:iload_1         
	//   17   30:aload_0         
	//   18   31:invokevirtual   #35  <Method void d.a(int, f)>
	//   19   34:return          
	}

	d a(j j, cb cb)
	{
		cb = ((cb) (new cd(c, cb)));
	//    0    0:new             #39  <Class cd>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field d c>
	//    4    8:aload_2         
	//    5    9:invokespecial   #42  <Method void cd(d, cb)>
	//    6   12:astore_2        
		a(j, ((t) (cb)));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #45  <Method void a(j, t)>
		cd cd1 = e;
	//   11   19:aload_0         
	//   12   20:getfield        #47  <Field cd e>
	//   13   23:astore_3        
		if(cd1 != null)
	//*  14   24:aload_3         
	//*  15   25:ifnull          33
			a(((t) (cd1)));
	//   16   28:aload_0         
	//   17   29:aload_3         
	//   18   30:invokevirtual   #50  <Method void a(t)>
		d = j;
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:putfield        #52  <Field j d>
		e = ((cd) (cb));
	//   22   38:aload_0         
	//   23   39:aload_2         
	//   24   40:putfield        #47  <Field cd e>
		return c;
	//   25   43:aload_0         
	//   26   44:getfield        #28  <Field d c>
	//   27   47:areturn         
	}

	d a(boolean flag)
	{
		if(LoaderManagerImpl.a)
	//*   0    0:getstatic       #58  <Field boolean LoaderManagerImpl.a>
	//*   1    3:ifeq            37
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #60  <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #61  <Method void StringBuilder()>
	//    5   13:astore_2        
			stringbuilder.append("  Destroying: ");
	//    6   14:aload_2         
	//    7   15:ldc1            #63  <String "  Destroying: ">
	//    8   17:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
			stringbuilder.append(((Object) (this)));
	//   10   21:aload_2         
	//   11   22:aload_0         
	//   12   23:invokevirtual   #70  <Method StringBuilder StringBuilder.append(Object)>
	//   13   26:pop             
			Log.v("LoaderManager", stringbuilder.toString());
	//   14   27:ldc1            #72  <String "LoaderManager">
	//   15   29:aload_2         
	//   16   30:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   17   33:invokestatic    #82  <Method int Log.v(String, String)>
	//   18   36:pop             
		}
		c.k();
	//   19   37:aload_0         
	//   20   38:getfield        #28  <Field d c>
	//   21   41:invokevirtual   #86  <Method boolean d.k()>
	//   22   44:pop             
		c.o();
	//   23   45:aload_0         
	//   24   46:getfield        #28  <Field d c>
	//   25   49:invokevirtual   #89  <Method void d.o()>
		cd cd1 = e;
	//   26   52:aload_0         
	//   27   53:getfield        #47  <Field cd e>
	//   28   56:astore_2        
		if(cd1 != null)
	//*  29   57:aload_2         
	//*  30   58:ifnull          74
		{
			a(((t) (cd1)));
	//   31   61:aload_0         
	//   32   62:aload_2         
	//   33   63:invokevirtual   #50  <Method void a(t)>
			if(flag)
	//*  34   66:iload_1         
	//*  35   67:ifeq            74
				cd1.b();
	//   36   70:aload_2         
	//   37   71:invokevirtual   #91  <Method void cd.b()>
		}
		c.a(((f) (this)));
	//   38   74:aload_0         
	//   39   75:getfield        #28  <Field d c>
	//   40   78:aload_0         
	//   41   79:invokevirtual   #94  <Method void d.a(f)>
		if(cd1 != null && !cd1.a() || flag)
	//*  42   82:aload_2         
	//*  43   83:ifnull          93
	//*  44   86:aload_2         
	//*  45   87:invokevirtual   #96  <Method boolean cd.a()>
	//*  46   90:ifeq            97
	//*  47   93:iload_1         
	//*  48   94:ifeq            109
		{
			c.q();
	//   49   97:aload_0         
	//   50   98:getfield        #28  <Field d c>
	//   51  101:invokevirtual   #99  <Method void d.q()>
			return f;
	//   52  104:aload_0         
	//   53  105:getfield        #30  <Field d f>
	//   54  108:areturn         
		} else
		{
			return c;
	//   55  109:aload_0         
	//   56  110:getfield        #28  <Field d c>
	//   57  113:areturn         
		}
	}

	public void a(t t)
	{
		super.a(t);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #100 <Method void s.a(t)>
		d = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #52  <Field j d>
		e = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #47  <Field cd e>
	//    9   15:return          
	}

	public void a(d d1, Object obj)
	{
		if(LoaderManagerImpl.a)
	//*   0    0:getstatic       #58  <Field boolean LoaderManagerImpl.a>
	//*   1    3:ifeq            37
		{
			d1 = ((d) (new StringBuilder()));
	//    2    6:new             #60  <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #61  <Method void StringBuilder()>
	//    5   13:astore_1        
			((StringBuilder) (d1)).append("onLoadComplete: ");
	//    6   14:aload_1         
	//    7   15:ldc1            #103 <String "onLoadComplete: ">
	//    8   17:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
			((StringBuilder) (d1)).append(((Object) (this)));
	//   10   21:aload_1         
	//   11   22:aload_0         
	//   12   23:invokevirtual   #70  <Method StringBuilder StringBuilder.append(Object)>
	//   13   26:pop             
			Log.v("LoaderManager", ((StringBuilder) (d1)).toString());
	//   14   27:ldc1            #72  <String "LoaderManager">
	//   15   29:aload_1         
	//   16   30:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   17   33:invokestatic    #82  <Method int Log.v(String, String)>
	//   18   36:pop             
		}
		if(Looper.myLooper() == Looper.getMainLooper())
	//*  19   37:invokestatic    #109 <Method Looper Looper.myLooper()>
	//*  20   40:invokestatic    #112 <Method Looper Looper.getMainLooper()>
	//*  21   43:if_acmpne       52
		{
			b(obj);
	//   22   46:aload_0         
	//   23   47:aload_2         
	//   24   48:invokevirtual   #115 <Method void b(Object)>
			return;
	//   25   51:return          
		}
		if(LoaderManagerImpl.a)
	//*  26   52:getstatic       #58  <Field boolean LoaderManagerImpl.a>
	//*  27   55:ifeq            66
			Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
	//   28   58:ldc1            #72  <String "LoaderManager">
	//   29   60:ldc1            #117 <String "onLoadComplete was incorrectly called on a background thread">
	//   30   62:invokestatic    #120 <Method int Log.w(String, String)>
	//   31   65:pop             
		a(obj);
	//   32   66:aload_0         
	//   33   67:aload_2         
	//   34   68:invokevirtual   #122 <Method void a(Object)>
	//   35   71:return          
	}

	public void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		printwriter.print(s1);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #129 <Method void PrintWriter.print(String)>
		printwriter.print("mId=");
	//    3    5:aload_3         
	//    4    6:ldc1            #131 <String "mId=">
	//    5    8:invokevirtual   #129 <Method void PrintWriter.print(String)>
		printwriter.print(a);
	//    6   11:aload_3         
	//    7   12:aload_0         
	//    8   13:getfield        #24  <Field int a>
	//    9   16:invokevirtual   #134 <Method void PrintWriter.print(int)>
		printwriter.print(" mArgs=");
	//   10   19:aload_3         
	//   11   20:ldc1            #136 <String " mArgs=">
	//   12   22:invokevirtual   #129 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (b)));
	//   13   25:aload_3         
	//   14   26:aload_0         
	//   15   27:getfield        #26  <Field Bundle b>
	//   16   30:invokevirtual   #139 <Method void PrintWriter.println(Object)>
		printwriter.print(s1);
	//   17   33:aload_3         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #129 <Method void PrintWriter.print(String)>
		printwriter.print("mLoader=");
	//   20   38:aload_3         
	//   21   39:ldc1            #141 <String "mLoader=">
	//   22   41:invokevirtual   #129 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (c)));
	//   23   44:aload_3         
	//   24   45:aload_0         
	//   25   46:getfield        #28  <Field d c>
	//   26   49:invokevirtual   #139 <Method void PrintWriter.println(Object)>
		d d1 = c;
	//   27   52:aload_0         
	//   28   53:getfield        #28  <Field d c>
	//   29   56:astore          5
		StringBuilder stringbuilder = new StringBuilder();
	//   30   58:new             #60  <Class StringBuilder>
	//   31   61:dup             
	//   32   62:invokespecial   #61  <Method void StringBuilder()>
	//   33   65:astore          6
		stringbuilder.append(s1);
	//   34   67:aload           6
	//   35   69:aload_1         
	//   36   70:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   37   73:pop             
		stringbuilder.append("  ");
	//   38   74:aload           6
	//   39   76:ldc1            #143 <String "  ">
	//   40   78:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   41   81:pop             
		d1.a(stringbuilder.toString(), filedescriptor, printwriter, as);
	//   42   82:aload           5
	//   43   84:aload           6
	//   44   86:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   45   89:aload_2         
	//   46   90:aload_3         
	//   47   91:aload           4
	//   48   93:invokevirtual   #145 <Method void d.a(String, FileDescriptor, PrintWriter, String[])>
		if(e != null)
	//*  49   96:aload_0         
	//*  50   97:getfield        #47  <Field cd e>
	//*  51  100:ifnull          161
		{
			printwriter.print(s1);
	//   52  103:aload_3         
	//   53  104:aload_1         
	//   54  105:invokevirtual   #129 <Method void PrintWriter.print(String)>
			printwriter.print("mCallbacks=");
	//   55  108:aload_3         
	//   56  109:ldc1            #147 <String "mCallbacks=">
	//   57  111:invokevirtual   #129 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (e)));
	//   58  114:aload_3         
	//   59  115:aload_0         
	//   60  116:getfield        #47  <Field cd e>
	//   61  119:invokevirtual   #139 <Method void PrintWriter.println(Object)>
			filedescriptor = ((FileDescriptor) (e));
	//   62  122:aload_0         
	//   63  123:getfield        #47  <Field cd e>
	//   64  126:astore_2        
			as = ((String []) (new StringBuilder()));
	//   65  127:new             #60  <Class StringBuilder>
	//   66  130:dup             
	//   67  131:invokespecial   #61  <Method void StringBuilder()>
	//   68  134:astore          4
			((StringBuilder) (as)).append(s1);
	//   69  136:aload           4
	//   70  138:aload_1         
	//   71  139:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   72  142:pop             
			((StringBuilder) (as)).append("  ");
	//   73  143:aload           4
	//   74  145:ldc1            #143 <String "  ">
	//   75  147:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   76  150:pop             
			((cd) (filedescriptor)).a(((StringBuilder) (as)).toString(), printwriter);
	//   77  151:aload_2         
	//   78  152:aload           4
	//   79  154:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   80  157:aload_3         
	//   81  158:invokevirtual   #150 <Method void cd.a(String, PrintWriter)>
		}
		printwriter.print(s1);
	//   82  161:aload_3         
	//   83  162:aload_1         
	//   84  163:invokevirtual   #129 <Method void PrintWriter.print(String)>
		printwriter.print("mData=");
	//   85  166:aload_3         
	//   86  167:ldc1            #152 <String "mData=">
	//   87  169:invokevirtual   #129 <Method void PrintWriter.print(String)>
		printwriter.println(f().c(a()));
	//   88  172:aload_3         
	//   89  173:aload_0         
	//   90  174:invokevirtual   #155 <Method d f()>
	//   91  177:aload_0         
	//   92  178:invokevirtual   #158 <Method Object a()>
	//   93  181:invokevirtual   #161 <Method String d.c(Object)>
	//   94  184:invokevirtual   #163 <Method void PrintWriter.println(String)>
		printwriter.print(s1);
	//   95  187:aload_3         
	//   96  188:aload_1         
	//   97  189:invokevirtual   #129 <Method void PrintWriter.print(String)>
		printwriter.print("mStarted=");
	//   98  192:aload_3         
	//   99  193:ldc1            #165 <String "mStarted=">
	//  100  195:invokevirtual   #129 <Method void PrintWriter.print(String)>
		printwriter.println(d());
	//  101  198:aload_3         
	//  102  199:aload_0         
	//  103  200:invokevirtual   #167 <Method boolean d()>
	//  104  203:invokevirtual   #170 <Method void PrintWriter.println(boolean)>
	//  105  206:return          
	}

	protected void b()
	{
		if(LoaderManagerImpl.a)
	//*   0    0:getstatic       #58  <Field boolean LoaderManagerImpl.a>
	//*   1    3:ifeq            37
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #60  <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #61  <Method void StringBuilder()>
	//    5   13:astore_1        
			stringbuilder.append("  Starting: ");
	//    6   14:aload_1         
	//    7   15:ldc1            #172 <String "  Starting: ">
	//    8   17:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
			stringbuilder.append(((Object) (this)));
	//   10   21:aload_1         
	//   11   22:aload_0         
	//   12   23:invokevirtual   #70  <Method StringBuilder StringBuilder.append(Object)>
	//   13   26:pop             
			Log.v("LoaderManager", stringbuilder.toString());
	//   14   27:ldc1            #72  <String "LoaderManager">
	//   15   29:aload_1         
	//   16   30:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   17   33:invokestatic    #82  <Method int Log.v(String, String)>
	//   18   36:pop             
		}
		c.i();
	//   19   37:aload_0         
	//   20   38:getfield        #28  <Field d c>
	//   21   41:invokevirtual   #175 <Method void d.i()>
	//   22   44:return          
	}

	public void b(Object obj)
	{
		super.b(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #176 <Method void s.b(Object)>
		obj = ((Object) (f));
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field d f>
	//    5    9:astore_1        
		if(obj != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          23
		{
			((d) (obj)).q();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #99  <Method void d.q()>
			f = null;
	//   10   18:aload_0         
	//   11   19:aconst_null     
	//   12   20:putfield        #30  <Field d f>
		}
	//   13   23:return          
	}

	protected void c()
	{
		if(LoaderManagerImpl.a)
	//*   0    0:getstatic       #58  <Field boolean LoaderManagerImpl.a>
	//*   1    3:ifeq            37
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #60  <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #61  <Method void StringBuilder()>
	//    5   13:astore_1        
			stringbuilder.append("  Stopping: ");
	//    6   14:aload_1         
	//    7   15:ldc1            #178 <String "  Stopping: ">
	//    8   17:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
			stringbuilder.append(((Object) (this)));
	//   10   21:aload_1         
	//   11   22:aload_0         
	//   12   23:invokevirtual   #70  <Method StringBuilder StringBuilder.append(Object)>
	//   13   26:pop             
			Log.v("LoaderManager", stringbuilder.toString());
	//   14   27:ldc1            #72  <String "LoaderManager">
	//   15   29:aload_1         
	//   16   30:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   17   33:invokestatic    #82  <Method int Log.v(String, String)>
	//   18   36:pop             
		}
		c.m();
	//   19   37:aload_0         
	//   20   38:getfield        #28  <Field d c>
	//   21   41:invokevirtual   #181 <Method void d.m()>
	//   22   44:return          
	}

	d f()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field d c>
	//    2    4:areturn         
	}

	void g()
	{
		j j = d;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field j d>
	//    2    4:astore_1        
		cd cd1 = e;
	//    3    5:aload_0         
	//    4    6:getfield        #47  <Field cd e>
	//    5    9:astore_2        
		if(j != null && cd1 != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          29
	//*   8   14:aload_2         
	//*   9   15:ifnull          29
		{
			super.a(((t) (cd1)));
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokespecial   #100 <Method void s.a(t)>
			a(j, ((t) (cd1)));
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:aload_2         
	//   16   26:invokevirtual   #45  <Method void a(j, t)>
		}
	//   17   29:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(64);
	//    0    0:new             #60  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          64
	//    3    6:invokespecial   #184 <Method void StringBuilder(int)>
	//    4    9:astore_1        
		stringbuilder.append("LoaderInfo{");
	//    5   10:aload_1         
	//    6   11:ldc1            #186 <String "LoaderInfo{">
	//    7   13:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:invokestatic    #192 <Method int System.identityHashCode(Object)>
	//   12   22:invokestatic    #198 <Method String Integer.toHexString(int)>
	//   13   25:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
		stringbuilder.append(" #");
	//   15   29:aload_1         
	//   16   30:ldc1            #200 <String " #">
	//   17   32:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
		stringbuilder.append(a);
	//   19   36:aload_1         
	//   20   37:aload_0         
	//   21   38:getfield        #24  <Field int a>
	//   22   41:invokevirtual   #203 <Method StringBuilder StringBuilder.append(int)>
	//   23   44:pop             
		stringbuilder.append(" : ");
	//   24   45:aload_1         
	//   25   46:ldc1            #205 <String " : ">
	//   26   48:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
		android.support.v4.g.f.a(((Object) (c)), stringbuilder);
	//   28   52:aload_0         
	//   29   53:getfield        #28  <Field d c>
	//   30   56:aload_1         
	//   31   57:invokestatic    #210 <Method void android.support.v4.g.f.a(Object, StringBuilder)>
		stringbuilder.append("}}");
	//   32   60:aload_1         
	//   33   61:ldc1            #212 <String "}}">
	//   34   63:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   35   66:pop             
		return stringbuilder.toString();
	//   36   67:aload_1         
	//   37   68:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   38   71:areturn         
	}

	private final int a;
	private final Bundle b;
	private final d c;
	private j d;
	private cd e;
	private d f;
}
