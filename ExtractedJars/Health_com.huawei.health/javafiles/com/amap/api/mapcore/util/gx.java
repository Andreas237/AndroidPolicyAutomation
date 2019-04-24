// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.io.*;
import java.util.Map;

// Referenced classes of package com.amap.api.mapcore.util:
//			jg, gz, hm, gv, 
//			jj

public class gx extends Thread
	implements jg.a
{
	public static class a extends jj
	{

		public Map a()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public Map b()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public String c()
		{
			return a;
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field String a>
		//    2    4:areturn         
		}

		private String a;

		a(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void jj()>
			a = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #15  <Field String a>
		//    5    9:return          
		}
	}


	public gx(Context context, String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Thread()>
		f = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #40  <Field Context f>
		e = s2;
	//    5    9:aload_0         
	//    6   10:aload           4
	//    7   12:putfield        #42  <Field String e>
		c = a(context, (new StringBuilder()).append(s).append("temp.so").toString());
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:new             #44  <Class StringBuilder>
	//   11   20:dup             
	//   12   21:invokespecial   #45  <Method void StringBuilder()>
	//   13   24:aload_2         
	//   14   25:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   15   28:ldc1            #51  <String "temp.so">
	//   16   30:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   18   36:invokestatic    #58  <Method String a(Context, String)>
	//   19   39:putfield        #60  <Field String c>
		d = a(context, "libwgs2gcj.so");
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:ldc1            #62  <String "libwgs2gcj.so">
	//   23   46:invokestatic    #58  <Method String a(Context, String)>
	//   24   49:putfield        #64  <Field String d>
		a = new a(s1);
	//   25   52:aload_0         
	//   26   53:new             #8   <Class gx$a>
	//   27   56:dup             
	//   28   57:aload_3         
	//   29   58:invokespecial   #67  <Method void gx$a(String)>
	//   30   61:putfield        #69  <Field gx$a a>
		g = new jg(((jj) (a)));
	//   31   64:aload_0         
	//   32   65:new             #71  <Class jg>
	//   33   68:dup             
	//   34   69:aload_0         
	//   35   70:getfield        #69  <Field gx$a a>
	//   36   73:invokespecial   #74  <Method void jg(jj)>
	//   37   76:putfield        #76  <Field jg g>
	//   38   79:return          
	}

	public static String a(Context context, String s)
	{
		return (new StringBuilder()).append(context.getFilesDir().getAbsolutePath()).append(File.separator).append("libso").append(File.separator).append(s).toString();
	//    0    0:new             #44  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #82  <Method File Context.getFilesDir()>
	//    5   11:invokevirtual   #87  <Method String File.getAbsolutePath()>
	//    6   14:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:getstatic       #90  <Field String File.separator>
	//    8   20:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//    9   23:ldc1            #92  <String "libso">
	//   10   25:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   11   28:getstatic       #90  <Field String File.separator>
	//   12   31:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   13   34:aload_1         
	//   14   35:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   15   38:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   16   41:areturn         
	}

	private static String b(Context context, String s)
	{
		return a(context, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #58  <Method String a(Context, String)>
	//    3    5:areturn         
	}

	public void a()
	{
		if(a == null || TextUtils.isEmpty(((CharSequence) (a.c()))) || !a.c().contains("libJni_wgs2gcj.so") || !a.c().contains(((CharSequence) (gz.a(f)))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field gx$a a>
	//*   2    4:ifnull          55
	//*   3    7:aload_0         
	//*   4    8:getfield        #69  <Field gx$a a>
	//*   5   11:invokevirtual   #94  <Method String gx$a.c()>
	//*   6   14:invokestatic    #100 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   17:ifne            55
	//*   8   20:aload_0         
	//*   9   21:getfield        #69  <Field gx$a a>
	//*  10   24:invokevirtual   #94  <Method String gx$a.c()>
	//*  11   27:ldc1            #102 <String "libJni_wgs2gcj.so">
	//*  12   29:invokevirtual   #107 <Method boolean String.contains(CharSequence)>
	//*  13   32:ifeq            55
	//*  14   35:aload_0         
	//*  15   36:getfield        #69  <Field gx$a a>
	//*  16   39:invokevirtual   #94  <Method String gx$a.c()>
	//*  17   42:aload_0         
	//*  18   43:getfield        #40  <Field Context f>
	//*  19   46:invokestatic    #112 <Method String gz.a(Context)>
	//*  20   49:invokevirtual   #107 <Method boolean String.contains(CharSequence)>
	//*  21   52:ifne            56
			return;
	//   22   55:return          
		if((new File(d)).exists())
	//*  23   56:new             #84  <Class File>
	//*  24   59:dup             
	//*  25   60:aload_0         
	//*  26   61:getfield        #64  <Field String d>
	//*  27   64:invokespecial   #113 <Method void File(String)>
	//*  28   67:invokevirtual   #117 <Method boolean File.exists()>
	//*  29   70:ifeq            74
		{
			return;
	//   30   73:return          
		} else
		{
			start();
	//   31   74:aload_0         
	//   32   75:invokevirtual   #120 <Method void start()>
			return;
	//   33   78:return          
		}
	}

	public void a(Throwable throwable)
	{
		boolean flag;
		try
		{
			if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field RandomAccessFile b>
	//*   2    4:ifnull          14
				b.close();
	//    3    7:aload_0         
	//    4    8:getfield        #125 <Field RandomAccessFile b>
	//    5   11:invokevirtual   #130 <Method void RandomAccessFile.close()>
			b();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #132 <Method void b()>
			throwable = ((Throwable) (new File(b(f, "tempfile"))));
	//    8   18:new             #84  <Class File>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:getfield        #40  <Field Context f>
	//   12   26:ldc1            #134 <String "tempfile">
	//   13   28:invokestatic    #136 <Method String b(Context, String)>
	//   14   31:invokespecial   #113 <Method void File(String)>
	//   15   34:astore_1        
			flag = ((File) (throwable)).exists();
	//   16   35:aload_1         
	//   17   36:invokevirtual   #117 <Method boolean File.exists()>
	//   18   39:istore_2        
		}
	//*  19   40:iload_2         
	//*  20   41:ifne            78
	//*  21   44:aload_1         
	//*  22   45:invokevirtual   #139 <Method File File.getParentFile()>
	//*  23   48:astore_3        
	//*  24   49:aload_3         
	//*  25   50:invokevirtual   #117 <Method boolean File.exists()>
	//*  26   53:ifne            61
	//*  27   56:aload_3         
	//*  28   57:invokevirtual   #142 <Method boolean File.mkdir()>
	//*  29   60:pop             
	//*  30   61:aload_1         
	//*  31   62:invokevirtual   #145 <Method boolean File.createNewFile()>
	//*  32   65:pop             
	//*  33   66:goto            78
	//*  34   69:astore_1        
	//*  35   70:aload_1         
	//*  36   71:ldc1            #147 <String "sdl">
	//*  37   73:ldc1            #149 <String "oe">
	//*  38   75:invokestatic    #154 <Method void hm.c(Throwable, String, String)>
	//*  39   78:return          
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
	//*  40   79:astore_1        
		{
			hm.c(throwable, "sdl", "oe");
	//   41   80:aload_1         
	//   42   81:ldc1            #147 <String "sdl">
	//   43   83:ldc1            #149 <String "oe">
	//   44   85:invokestatic    #154 <Method void hm.c(Throwable, String, String)>
			return;
	//   45   88:return          
		}
		if(flag)
			break MISSING_BLOCK_LABEL_78;
		try
		{
			File file = ((File) (throwable)).getParentFile();
			if(!file.exists())
				file.mkdir();
			((File) (throwable)).createNewFile();
			break MISSING_BLOCK_LABEL_78;
		}
		// Misplaced declaration of an exception variable
		catch(Throwable throwable) { }
		hm.c(throwable, "sdl", "oe");
	}

	public void a(byte abyte0[], long l)
	{
		Object obj;
		if(b != null)
			break MISSING_BLOCK_LABEL_74;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field RandomAccessFile b>
	//    2    4:ifnonnull       74
		obj = ((Object) (new File(c)));
	//    3    7:new             #84  <Class File>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #60  <Field String c>
	//    7   15:invokespecial   #113 <Method void File(String)>
	//    8   18:astore          4
		File file = ((File) (obj)).getParentFile();
	//    9   20:aload           4
	//   10   22:invokevirtual   #139 <Method File File.getParentFile()>
	//   11   25:astore          5
		if(!file.exists())
	//*  12   27:aload           5
	//*  13   29:invokevirtual   #117 <Method boolean File.exists()>
	//*  14   32:ifne            41
			file.mkdirs();
	//   15   35:aload           5
	//   16   37:invokevirtual   #162 <Method boolean File.mkdirs()>
	//   17   40:pop             
		b = new RandomAccessFile(((File) (obj)), "rw");
	//   18   41:aload_0         
	//   19   42:new             #127 <Class RandomAccessFile>
	//   20   45:dup             
	//   21   46:aload           4
	//   22   48:ldc1            #164 <String "rw">
	//   23   50:invokespecial   #167 <Method void RandomAccessFile(File, String)>
	//   24   53:putfield        #125 <Field RandomAccessFile b>
		break MISSING_BLOCK_LABEL_74;
	//   25   56:goto            74
		FileNotFoundException filenotfoundexception;
		filenotfoundexception;
	//   26   59:astore          4
		hm.c(((Throwable) (filenotfoundexception)), "sdl", "oDd");
	//   27   61:aload           4
	//   28   63:ldc1            #147 <String "sdl">
	//   29   65:ldc1            #169 <String "oDd">
	//   30   67:invokestatic    #154 <Method void hm.c(Throwable, String, String)>
		b();
	//   31   70:aload_0         
	//   32   71:invokevirtual   #132 <Method void b()>
		filenotfoundexception = ((FileNotFoundException) (b));
	//   33   74:aload_0         
	//   34   75:getfield        #125 <Field RandomAccessFile b>
	//   35   78:astore          4
		if(filenotfoundexception == null)
	//*  36   80:aload           4
	//*  37   82:ifnonnull       86
			return;
	//   38   85:return          
		try
		{
			b.seek(l);
	//   39   86:aload_0         
	//   40   87:getfield        #125 <Field RandomAccessFile b>
	//   41   90:lload_2         
	//   42   91:invokevirtual   #173 <Method void RandomAccessFile.seek(long)>
			b.write(abyte0);
	//   43   94:aload_0         
	//   44   95:getfield        #125 <Field RandomAccessFile b>
	//   45   98:aload_1         
	//   46   99:invokevirtual   #177 <Method void RandomAccessFile.write(byte[])>
			break MISSING_BLOCK_LABEL_118;
	//   47  102:goto            118
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[]) { }
	//   48  105:astore_1        
	//*  49  106:aload_0         
	//*  50  107:invokevirtual   #132 <Method void b()>
	//*  51  110:aload_1         
	//*  52  111:ldc1            #147 <String "sdl">
	//*  53  113:ldc1            #169 <String "oDd">
	//*  54  115:invokestatic    #154 <Method void hm.c(Throwable, String, String)>
	//*  55  118:return          
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  56  119:astore_1        
		{
			b();
	//   57  120:aload_0         
	//   58  121:invokevirtual   #132 <Method void b()>
			hm.c(((Throwable) (abyte0)), "sdl", "oDd");
	//   59  124:aload_1         
	//   60  125:ldc1            #147 <String "sdl">
	//   61  127:ldc1            #169 <String "oDd">
	//   62  129:invokestatic    #154 <Method void hm.c(Throwable, String, String)>
			return;
	//   63  132:return          
		}
		b();
		hm.c(((Throwable) (abyte0)), "sdl", "oDd");
	}

	protected void b()
	{
		File file = new File(c);
	//    0    0:new             #84  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #60  <Field String c>
	//    4    8:invokespecial   #113 <Method void File(String)>
	//    5   11:astore_1        
		if(file.exists())
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #117 <Method boolean File.exists()>
	//*   8   16:ifeq            24
			file.delete();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #180 <Method boolean File.delete()>
	//   11   23:pop             
	//   12   24:return          
	}

	public void d()
	{
		b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #132 <Method void b()>
	//    2    4:return          
	}

	public void e()
	{
		String s;
		try
		{
			if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field RandomAccessFile b>
	//*   2    4:ifnull          14
				b.close();
	//    3    7:aload_0         
	//    4    8:getfield        #125 <Field RandomAccessFile b>
	//    5   11:invokevirtual   #130 <Method void RandomAccessFile.close()>
			s = gv.a(c);
	//    6   14:aload_0         
	//    7   15:getfield        #60  <Field String c>
	//    8   18:invokestatic    #185 <Method String gv.a(String)>
	//    9   21:astore_1        
		}
	//*  10   22:aload_1         
	//*  11   23:ifnull          88
	//*  12   26:aload_1         
	//*  13   27:aload_0         
	//*  14   28:getfield        #42  <Field String e>
	//*  15   31:invokevirtual   #189 <Method boolean String.equalsIgnoreCase(String)>
	//*  16   34:ifeq            88
	//*  17   37:new             #84  <Class File>
	//*  18   40:dup             
	//*  19   41:aload_0         
	//*  20   42:getfield        #64  <Field String d>
	//*  21   45:invokespecial   #113 <Method void File(String)>
	//*  22   48:invokevirtual   #117 <Method boolean File.exists()>
	//*  23   51:ifeq            59
	//*  24   54:aload_0         
	//*  25   55:invokevirtual   #132 <Method void b()>
	//*  26   58:return          
	//*  27   59:new             #84  <Class File>
	//*  28   62:dup             
	//*  29   63:aload_0         
	//*  30   64:getfield        #60  <Field String c>
	//*  31   67:invokespecial   #113 <Method void File(String)>
	//*  32   70:new             #84  <Class File>
	//*  33   73:dup             
	//*  34   74:aload_0         
	//*  35   75:getfield        #64  <Field String d>
	//*  36   78:invokespecial   #113 <Method void File(String)>
	//*  37   81:invokevirtual   #193 <Method boolean File.renameTo(File)>
	//*  38   84:pop             
	//*  39   85:goto            92
	//*  40   88:aload_0         
	//*  41   89:invokevirtual   #132 <Method void b()>
	//*  42   92:return          
		catch(Throwable throwable)
	//*  43   93:astore_1        
		{
			b();
	//   44   94:aload_0         
	//   45   95:invokevirtual   #132 <Method void b()>
			File file = new File(d);
	//   46   98:new             #84  <Class File>
	//   47  101:dup             
	//   48  102:aload_0         
	//   49  103:getfield        #64  <Field String d>
	//   50  106:invokespecial   #113 <Method void File(String)>
	//   51  109:astore_2        
			if(file.exists())
	//*  52  110:aload_2         
	//*  53  111:invokevirtual   #117 <Method boolean File.exists()>
	//*  54  114:ifeq            122
				file.delete();
	//   55  117:aload_2         
	//   56  118:invokevirtual   #180 <Method boolean File.delete()>
	//   57  121:pop             
			hm.c(throwable, "sdl", "ofs");
	//   58  122:aload_1         
	//   59  123:ldc1            #147 <String "sdl">
	//   60  125:ldc1            #195 <String "ofs">
	//   61  127:invokestatic    #154 <Method void hm.c(Throwable, String, String)>
			return;
	//   62  130:return          
		}
		if(s == null)
			break MISSING_BLOCK_LABEL_88;
		if(!s.equalsIgnoreCase(e))
			break MISSING_BLOCK_LABEL_88;
		if((new File(d)).exists())
		{
			b();
			return;
		}
		(new File(c)).renameTo(new File(d));
		break MISSING_BLOCK_LABEL_92;
		b();
	}

	public void run()
	{
		try
		{
			File file = new File(b(f, "tempfile"));
	//    0    0:new             #84  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #40  <Field Context f>
	//    4    8:ldc1            #134 <String "tempfile">
	//    5   10:invokestatic    #136 <Method String b(Context, String)>
	//    6   13:invokespecial   #113 <Method void File(String)>
	//    7   16:astore_1        
			if(file.exists())
	//*   8   17:aload_1         
	//*   9   18:invokevirtual   #117 <Method boolean File.exists()>
	//*  10   21:ifeq            29
				file.delete();
	//   11   24:aload_1         
	//   12   25:invokevirtual   #180 <Method boolean File.delete()>
	//   13   28:pop             
			g.a(((jg.a) (this)));
	//   14   29:aload_0         
	//   15   30:getfield        #76  <Field jg g>
	//   16   33:aload_0         
	//   17   34:invokevirtual   #199 <Method void jg.a(jg$a)>
			return;
	//   18   37:return          
		}
		catch(Throwable throwable)
	//*  19   38:astore_1        
		{
			hm.c(throwable, "sdl", "run");
	//   20   39:aload_1         
	//   21   40:ldc1            #147 <String "sdl">
	//   22   42:ldc1            #200 <String "run">
	//   23   44:invokestatic    #154 <Method void hm.c(Throwable, String, String)>
		}
		b();
	//   24   47:aload_0         
	//   25   48:invokevirtual   #132 <Method void b()>
	//   26   51:return          
	}

	private static String h = "sodownload";
	private static String i = "sofail";
	protected a a;
	protected RandomAccessFile b;
	protected String c;
	protected String d;
	protected String e;
	protected Context f;
	private jg g;

	static 
	{
	//    0    0:ldc1            #27  <String "sodownload">
	//    1    2:putstatic       #29  <Field String h>
	//    2    5:ldc1            #31  <String "sofail">
	//    3    7:putstatic       #33  <Field String i>
	//*   4   10:return          
	}
}
