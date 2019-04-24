// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.List;

// Referenced classes of package com.amap.api.mapcore.util:
//			jg, ia, hx, ib, 
//			ih, hq, id, if, 
//			gt, gy, js, jt

public class hw extends Thread
	implements jg.a
{

	public hw(Context context, hx hx1, gy gy1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Thread()>
		f = context.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #31  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #33  <Field Context f>
		c = gy1;
	//    6   12:aload_0         
	//    7   13:aload_3         
	//    8   14:putfield        #35  <Field gy c>
		if(hx1 == null)
	//*   9   17:aload_2         
	//*  10   18:ifnonnull       22
			return;
	//   11   21:return          
		try
		{
			a = hx1;
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:putfield        #37  <Field hx a>
			b = new jg(((jj) (new ia(a))));
	//   15   27:aload_0         
	//   16   28:new             #39  <Class jg>
	//   17   31:dup             
	//   18   32:new             #41  <Class ia>
	//   19   35:dup             
	//   20   36:aload_0         
	//   21   37:getfield        #37  <Field hx a>
	//   22   40:invokespecial   #44  <Method void ia(hx)>
	//   23   43:invokespecial   #47  <Method void jg(jj)>
	//   24   46:putfield        #49  <Field jg b>
			d = ib.a(context, a.a);
	//   25   49:aload_0         
	//   26   50:aload_1         
	//   27   51:aload_0         
	//   28   52:getfield        #37  <Field hx a>
	//   29   55:getfield        #53  <Field String hx.a>
	//   30   58:invokestatic    #58  <Method String ib.a(Context, String)>
	//   31   61:putfield        #60  <Field String d>
			return;
	//   32   64:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  33   65:astore_1        
		{
			ih.a(((Throwable) (context)), "dDownLoad", "DexDownLoad()");
	//   34   66:aload_1         
	//   35   67:ldc1            #62  <String "dDownLoad">
	//   36   69:ldc1            #64  <String "DexDownLoad()">
	//   37   71:invokestatic    #69  <Method void ih.a(Throwable, String, String)>
		}
		return;
	//   38   74:return          
	}

	private void a(Context context, String s)
	{
		try
		{
			context = ((Context) (context.getSharedPreferences(s, 0).edit()));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #75  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    4    6:invokeinterface #81  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   11:astore_1        
			((android.content.SharedPreferences.Editor) (context)).clear();
	//    6   12:aload_1         
	//    7   13:invokeinterface #86  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//    8   18:pop             
			((android.content.SharedPreferences.Editor) (context)).commit();
	//    9   19:aload_1         
	//   10   20:invokeinterface #90  <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   11   25:pop             
			return;
	//   12   26:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  13   27:astore_1        
		{
			ih.a(((Throwable) (context)), "dDownLoad", "clearMarker()");
	//   14   28:aload_1         
	//   15   29:ldc1            #62  <String "dDownLoad">
	//   16   31:ldc1            #92  <String "clearMarker()">
	//   17   33:invokestatic    #69  <Method void ih.a(Throwable, String, String)>
		}
	//   18   36:return          
	}

	private void a(String s)
	{
		String s1 = a.c();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field hx a>
	//    2    4:invokevirtual   #96  <Method String hx.c()>
	//    3    7:astore_2        
		hq hq1 = new hq(f, ((hp) (id.a())));
	//    4    8:new             #98  <Class hq>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #33  <Field Context f>
	//    8   16:invokestatic    #103 <Method id id.a()>
	//    9   19:invokespecial   #106 <Method void hq(Context, hp)>
	//   10   22:astore_3        
		ib.a.a(hq1, (new if.a(a.a, s, a.b, s1, a.d)).a("copy").a(), com.amap.api.mapcore.util.if.a(a.a, a.b, s1, a.d));
	//   11   23:aload_3         
	//   12   24:new             #108 <Class if$a>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:getfield        #37  <Field hx a>
	//   16   32:getfield        #53  <Field String hx.a>
	//   17   35:aload_1         
	//   18   36:aload_0         
	//   19   37:getfield        #37  <Field hx a>
	//   20   40:getfield        #110 <Field String hx.b>
	//   21   43:aload_2         
	//   22   44:aload_0         
	//   23   45:getfield        #37  <Field hx a>
	//   24   48:getfield        #111 <Field String hx.d>
	//   25   51:invokespecial   #114 <Method void if$a(String, String, String, String, String)>
	//   26   54:ldc1            #116 <String "copy">
	//   27   56:invokevirtual   #119 <Method if$a if$a.a(String)>
	//   28   59:invokevirtual   #122 <Method if if$a.a()>
	//   29   62:aload_0         
	//   30   63:getfield        #37  <Field hx a>
	//   31   66:getfield        #53  <Field String hx.a>
	//   32   69:aload_0         
	//   33   70:getfield        #37  <Field hx a>
	//   34   73:getfield        #110 <Field String hx.b>
	//   35   76:aload_2         
	//   36   77:aload_0         
	//   37   78:getfield        #37  <Field hx a>
	//   38   81:getfield        #111 <Field String hx.d>
	//   39   84:invokestatic    #127 <Method String if.a(String, String, String, String)>
	//   40   87:invokestatic    #132 <Method void ib$a.a(hq, if, String)>
		a(f, a.b);
	//   41   90:aload_0         
	//   42   91:aload_0         
	//   43   92:getfield        #33  <Field Context f>
	//   44   95:aload_0         
	//   45   96:getfield        #37  <Field hx a>
	//   46   99:getfield        #110 <Field String hx.b>
	//   47  102:invokespecial   #134 <Method void a(Context, String)>
		try
		{
			ib.a(f, hq1, c, d, a.d);
	//   48  105:aload_0         
	//   49  106:getfield        #33  <Field Context f>
	//   50  109:aload_3         
	//   51  110:aload_0         
	//   52  111:getfield        #35  <Field gy c>
	//   53  114:aload_0         
	//   54  115:getfield        #60  <Field String d>
	//   55  118:aload_0         
	//   56  119:getfield        #37  <Field hx a>
	//   57  122:getfield        #111 <Field String hx.d>
	//   58  125:invokestatic    #137 <Method void ib.a(Context, hq, gy, String, String)>
			ib.a(f, c);
	//   59  128:aload_0         
	//   60  129:getfield        #33  <Field Context f>
	//   61  132:aload_0         
	//   62  133:getfield        #35  <Field gy c>
	//   63  136:invokestatic    #140 <Method void ib.a(Context, gy)>
			return;
	//   64  139:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  65  140:astore_1        
		{
			ih.a(((Throwable) (s)), "dDownLoad", "onFinish1");
	//   66  141:aload_1         
	//   67  142:ldc1            #62  <String "dDownLoad">
	//   68  144:ldc1            #142 <String "onFinish1">
	//   69  146:invokestatic    #69  <Method void ih.a(Throwable, String, String)>
		}
	//   70  149:return          
	}

	private boolean a(Context context)
	{
		return gt.p(context) == 1;
	//    0    0:aload_1         
	//    1    1:invokestatic    #149 <Method int gt.p(Context)>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	private boolean a(hq hq1)
	{
		hq1 = ((hq) (ib.a.a(hq1, a.b, "used")));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #37  <Field hx a>
	//    3    5:getfield        #110 <Field String hx.b>
	//    4    8:ldc1            #152 <String "used">
	//    5   10:invokestatic    #155 <Method List ib$a.a(hq, String, String)>
	//    6   13:astore_1        
		if(hq1 == null)
			break MISSING_BLOCK_LABEL_69;
	//    7   14:aload_1         
	//    8   15:ifnull          57
		int i;
		if(((List) (hq1)).size() <= 0)
			break MISSING_BLOCK_LABEL_69;
	//    9   18:aload_1         
	//   10   19:invokeinterface #161 <Method int List.size()>
	//   11   24:ifle            57
		i = ih.a(((if)((List) (hq1)).get(0)).e(), a.d);
	//   12   27:aload_1         
	//   13   28:iconst_0        
	//   14   29:invokeinterface #165 <Method Object List.get(int)>
	//   15   34:checkcast       #124 <Class if>
	//   16   37:invokevirtual   #167 <Method String if.e()>
	//   17   40:aload_0         
	//   18   41:getfield        #37  <Field hx a>
	//   19   44:getfield        #111 <Field String hx.d>
	//   20   47:invokestatic    #170 <Method int ih.a(String, String)>
	//   21   50:istore_2        
		if(i > 0)
	//*  22   51:iload_2         
	//*  23   52:ifle            57
			return true;
	//   24   55:iconst_1        
	//   25   56:ireturn         
		break MISSING_BLOCK_LABEL_69;
	//   26   57:goto            69
		hq1;
	//   27   60:astore_1        
		ih.a(((Throwable) (hq1)), "dDownLoad", "isUsed()");
	//   28   61:aload_1         
	//   29   62:ldc1            #62  <String "dDownLoad">
	//   30   64:ldc1            #172 <String "isUsed()">
	//   31   66:invokestatic    #69  <Method void ih.a(Throwable, String, String)>
		return false;
	//   32   69:iconst_0        
	//   33   70:ireturn         
	}

	private boolean a(hq hq1, if if1, hx hx1)
	{
		String s = hx1.b;
	//    0    0:aload_3         
	//    1    1:getfield        #110 <Field String hx.b>
	//    2    4:astore          4
		String s2 = hx1.c;
	//    3    6:aload_3         
	//    4    7:getfield        #175 <Field String hx.c>
	//    5   10:astore          6
		String s1 = hx1.d;
	//    6   12:aload_3         
	//    7   13:getfield        #111 <Field String hx.d>
	//    8   16:astore          5
		hx1 = ((hx) (hx1.e));
	//    9   18:aload_3         
	//   10   19:getfield        #177 <Field String hx.e>
	//   11   22:astore_3        
		if("errorstatus".equals(((Object) (if1.f()))))
	//*  12   23:ldc1            #179 <String "errorstatus">
	//*  13   25:aload_2         
	//*  14   26:invokevirtual   #181 <Method String if.f()>
	//*  15   29:invokevirtual   #187 <Method boolean String.equals(Object)>
	//*  16   32:ifeq            42
		{
			b(hq1);
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:invokespecial   #190 <Method void b(hq)>
			return true;
	//   20   40:iconst_1        
	//   21   41:ireturn         
		}
		if(!(new File(d)).exists())
	//*  22   42:new             #192 <Class File>
	//*  23   45:dup             
	//*  24   46:aload_0         
	//*  25   47:getfield        #60  <Field String d>
	//*  26   50:invokespecial   #194 <Method void File(String)>
	//*  27   53:invokevirtual   #197 <Method boolean File.exists()>
	//*  28   56:ifne            61
			return false;
	//   29   59:iconst_0        
	//   30   60:ireturn         
		if1 = ((if) (hq1.b(com.amap.api.mapcore.util.if.a(ib.a(f, s, s2), s, s2, s1), com/amap/api/mapcore/util/if)));
	//   31   61:aload_1         
	//   32   62:aload_0         
	//   33   63:getfield        #33  <Field Context f>
	//   34   66:aload           4
	//   35   68:aload           6
	//   36   70:invokestatic    #200 <Method String ib.a(Context, String, String)>
	//   37   73:aload           4
	//   38   75:aload           6
	//   39   77:aload           5
	//   40   79:invokestatic    #127 <Method String if.a(String, String, String, String)>
	//   41   82:ldc1            #124 <Class if>
	//   42   84:invokevirtual   #203 <Method List hq.b(String, Class)>
	//   43   87:astore_2        
		if(if1 != null && ((List) (if1)).size() > 0)
	//*  44   88:aload_2         
	//*  45   89:ifnull          103
	//*  46   92:aload_2         
	//*  47   93:invokeinterface #161 <Method int List.size()>
	//*  48   98:ifle            103
			return true;
	//   49  101:iconst_1        
	//   50  102:ireturn         
		try
		{
			ib.a(f, s, c.b());
	//   51  103:aload_0         
	//   52  104:getfield        #33  <Field Context f>
	//   53  107:aload           4
	//   54  109:aload_0         
	//   55  110:getfield        #35  <Field gy c>
	//   56  113:invokevirtual   #207 <Method String gy.b()>
	//   57  116:invokestatic    #200 <Method String ib.a(Context, String, String)>
	//   58  119:pop             
			ib.a(f, hq1, c, d, s1);
	//   59  120:aload_0         
	//   60  121:getfield        #33  <Field Context f>
	//   61  124:aload_1         
	//   62  125:aload_0         
	//   63  126:getfield        #35  <Field gy c>
	//   64  129:aload_0         
	//   65  130:getfield        #60  <Field String d>
	//   66  133:aload           5
	//   67  135:invokestatic    #137 <Method void ib.a(Context, hq, gy, String, String)>
			ib.a(f, c);
	//   68  138:aload_0         
	//   69  139:getfield        #33  <Field Context f>
	//   70  142:aload_0         
	//   71  143:getfield        #35  <Field gy c>
	//   72  146:invokestatic    #140 <Method void ib.a(Context, gy)>
		}
	//*  73  149:goto            161
		// Misplaced declaration of an exception variable
		catch(hq hq1)
	//*  74  152:astore_1        
		{
			ih.a(((Throwable) (hq1)), "dDownLoad", "processDownloadedFile()");
	//   75  153:aload_1         
	//   76  154:ldc1            #62  <String "dDownLoad">
	//   77  156:ldc1            #209 <String "processDownloadedFile()">
	//   78  158:invokestatic    #69  <Method void ih.a(Throwable, String, String)>
		}
		return true;
	//   79  161:iconst_1        
	//   80  162:ireturn         
	}

	private void b(hq hq1)
	{
		if(!(new File(ib.b(f, c.a(), c.b()))).exists())
	//*   0    0:new             #192 <Class File>
	//*   1    3:dup             
	//*   2    4:aload_0         
	//*   3    5:getfield        #33  <Field Context f>
	//*   4    8:aload_0         
	//*   5    9:getfield        #35  <Field gy c>
	//*   6   12:invokevirtual   #211 <Method String gy.a()>
	//*   7   15:aload_0         
	//*   8   16:getfield        #35  <Field gy c>
	//*   9   19:invokevirtual   #207 <Method String gy.b()>
	//*  10   22:invokestatic    #213 <Method String ib.b(Context, String, String)>
	//*  11   25:invokespecial   #194 <Method void File(String)>
	//*  12   28:invokevirtual   #197 <Method boolean File.exists()>
	//*  13   31:ifne            70
		{
			if(TextUtils.isEmpty(((CharSequence) (ib.a(f, hq1, c)))))
	//*  14   34:aload_0         
	//*  15   35:getfield        #33  <Field Context f>
	//*  16   38:aload_1         
	//*  17   39:aload_0         
	//*  18   40:getfield        #35  <Field gy c>
	//*  19   43:invokestatic    #216 <Method String ib.a(Context, hq, gy)>
	//*  20   46:invokestatic    #222 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  21   49:ifeq            53
				return;
	//   22   52:return          
			try
			{
				ib.a(f, c);
	//   23   53:aload_0         
	//   24   54:getfield        #33  <Field Context f>
	//   25   57:aload_0         
	//   26   58:getfield        #35  <Field gy c>
	//   27   61:invokestatic    #140 <Method void ib.a(Context, gy)>
				return;
	//   28   64:return          
			}
			// Misplaced declaration of an exception variable
			catch(hq hq1)
	//*  29   65:astore_1        
			{
				((Throwable) (hq1)).printStackTrace();
	//   30   66:aload_1         
	//   31   67:invokevirtual   #225 <Method void Throwable.printStackTrace()>
			}
		}
	//   32   70:return          
	}

	private boolean f()
	{
		hq hq1 = new hq(f, ((hp) (id.a())));
	//    0    0:new             #98  <Class hq>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field Context f>
	//    4    8:invokestatic    #103 <Method id id.a()>
	//    5   11:invokespecial   #106 <Method void hq(Context, hp)>
	//    6   14:astore_1        
		if(a(hq1))
	//*   7   15:aload_0         
	//*   8   16:aload_1         
	//*   9   17:invokespecial   #227 <Method boolean a(hq)>
	//*  10   20:ifeq            25
			return true;
	//   11   23:iconst_1        
	//   12   24:ireturn         
		if if1 = ib.a.a(hq1, a.a);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #37  <Field hx a>
	//   16   30:getfield        #53  <Field String hx.a>
	//   17   33:invokestatic    #230 <Method if ib$a.a(hq, String)>
	//   18   36:astore_2        
		if(if1 != null)
	//*  19   37:aload_2         
	//*  20   38:ifnull          52
			return a(hq1, if1, a);
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:aload_2         
	//   24   44:aload_0         
	//   25   45:getfield        #37  <Field hx a>
	//   26   48:invokespecial   #232 <Method boolean a(hq, if, hx)>
	//   27   51:ireturn         
		else
			return false;
	//   28   52:iconst_0        
	//   29   53:ireturn         
	}

	private boolean g()
	{
		return android.os.Build.VERSION.SDK_INT >= a.g && android.os.Build.VERSION.SDK_INT <= a.f;
	//    0    0:getstatic       #239 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:aload_0         
	//    2    4:getfield        #37  <Field hx a>
	//    3    7:getfield        #241 <Field int hx.g>
	//    4   10:icmplt          28
	//    5   13:getstatic       #239 <Field int android.os.Build$VERSION.SDK_INT>
	//    6   16:aload_0         
	//    7   17:getfield        #37  <Field hx a>
	//    8   20:getfield        #243 <Field int hx.f>
	//    9   23:icmpgt          28
	//   10   26:iconst_1        
	//   11   27:ireturn         
	//   12   28:iconst_0        
	//   13   29:ireturn         
	}

	public void a()
	{
		try
		{
			start();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #246 <Method void start()>
			return;
	//    2    4:return          
		}
		catch(Throwable throwable)
	//*   3    5:astore_1        
		{
			ih.a(throwable, "dDownLoad", "startDownload()");
	//    4    6:aload_1         
	//    5    7:ldc1            #62  <String "dDownLoad">
	//    6    9:ldc1            #248 <String "startDownload()">
	//    7   11:invokestatic    #69  <Method void ih.a(Throwable, String, String)>
		}
	//    8   14:return          
	}

	public void a(Throwable throwable)
	{
		try
		{
			ih.a(((java.io.Closeable) (e)));
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field RandomAccessFile e>
	//    2    4:invokestatic    #254 <Method void ih.a(java.io.Closeable)>
			return;
	//    3    7:return          
		}
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
	//*   4    8:astore_1        
		{
			throwable.printStackTrace();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #225 <Method void Throwable.printStackTrace()>
		}
	//    7   13:return          
	}

	public void a(byte abyte0[], long l)
	{
		try
		{
			if(e == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #251 <Field RandomAccessFile e>
	//*   2    4:ifnonnull       57
			{
				File file = new File(d);
	//    3    7:new             #192 <Class File>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #60  <Field String d>
	//    7   15:invokespecial   #194 <Method void File(String)>
	//    8   18:astore          4
				File file1 = file.getParentFile();
	//    9   20:aload           4
	//   10   22:invokevirtual   #259 <Method File File.getParentFile()>
	//   11   25:astore          5
				if(!file1.exists())
	//*  12   27:aload           5
	//*  13   29:invokevirtual   #197 <Method boolean File.exists()>
	//*  14   32:ifne            41
					file1.mkdirs();
	//   15   35:aload           5
	//   16   37:invokevirtual   #262 <Method boolean File.mkdirs()>
	//   17   40:pop             
				e = new RandomAccessFile(file, "rw");
	//   18   41:aload_0         
	//   19   42:new             #264 <Class RandomAccessFile>
	//   20   45:dup             
	//   21   46:aload           4
	//   22   48:ldc2            #266 <String "rw">
	//   23   51:invokespecial   #269 <Method void RandomAccessFile(File, String)>
	//   24   54:putfield        #251 <Field RandomAccessFile e>
			}
			e.seek(l);
	//   25   57:aload_0         
	//   26   58:getfield        #251 <Field RandomAccessFile e>
	//   27   61:lload_2         
	//   28   62:invokevirtual   #273 <Method void RandomAccessFile.seek(long)>
			e.write(abyte0);
	//   29   65:aload_0         
	//   30   66:getfield        #251 <Field RandomAccessFile e>
	//   31   69:aload_1         
	//   32   70:invokevirtual   #277 <Method void RandomAccessFile.write(byte[])>
			return;
	//   33   73:return          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  34   74:astore_1        
		{
			ih.a(((Throwable) (abyte0)), "dDownLoad", "onDownload()");
	//   35   75:aload_1         
	//   36   76:ldc1            #62  <String "dDownLoad">
	//   37   78:ldc2            #279 <String "onDownload()">
	//   38   81:invokestatic    #69  <Method void ih.a(Throwable, String, String)>
		}
	//   39   84:return          
	}

	boolean b()
	{
		if(c == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field gy c>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		return c.a().equals(((Object) (a.b))) && c.b().equals(((Object) (a.c)));
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field gy c>
	//    7   13:invokevirtual   #211 <Method String gy.a()>
	//    8   16:aload_0         
	//    9   17:getfield        #37  <Field hx a>
	//   10   20:getfield        #110 <Field String hx.b>
	//   11   23:invokevirtual   #187 <Method boolean String.equals(Object)>
	//   12   26:ifeq            51
	//   13   29:aload_0         
	//   14   30:getfield        #35  <Field gy c>
	//   15   33:invokevirtual   #207 <Method String gy.b()>
	//   16   36:aload_0         
	//   17   37:getfield        #37  <Field hx a>
	//   18   40:getfield        #175 <Field String hx.c>
	//   19   43:invokevirtual   #187 <Method boolean String.equals(Object)>
	//   20   46:ifeq            51
	//   21   49:iconst_1        
	//   22   50:ireturn         
	//   23   51:iconst_0        
	//   24   52:ireturn         
	}

	boolean c()
	{
label0:
		{
			try
			{
				if(!b() || !g() || !a(f) || f())
					break label0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #281 <Method boolean b()>
	//    2    4:ifeq            48
	//    3    7:aload_0         
	//    4    8:invokespecial   #283 <Method boolean g()>
	//    5   11:ifeq            48
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #33  <Field Context f>
	//    9   19:invokespecial   #285 <Method boolean a(Context)>
	//   10   22:ifeq            48
	//   11   25:aload_0         
	//   12   26:invokespecial   #287 <Method boolean f()>
	//   13   29:ifne            48
				ib.b(f, c.a());
	//   14   32:aload_0         
	//   15   33:getfield        #33  <Field Context f>
	//   16   36:aload_0         
	//   17   37:getfield        #35  <Field gy c>
	//   18   40:invokevirtual   #211 <Method String gy.a()>
	//   19   43:invokestatic    #289 <Method void ib.b(Context, String)>
			}
	//*  20   46:iconst_1        
	//*  21   47:ireturn         
	//*  22   48:iconst_0        
	//*  23   49:ireturn         
			catch(Throwable throwable)
	//*  24   50:astore_1        
			{
				ih.a(throwable, "dDownLoad", "isNeedDownload()");
	//   25   51:aload_1         
	//   26   52:ldc1            #62  <String "dDownLoad">
	//   27   54:ldc2            #291 <String "isNeedDownload()">
	//   28   57:invokestatic    #69  <Method void ih.a(Throwable, String, String)>
				return false;
	//   29   60:iconst_0        
	//   30   61:ireturn         
			}
			return true;
		}
		return false;
	}

	public void d()
	{
	//    0    0:return          
	}

	public void e()
	{
		Object obj;
		Throwable throwable;
		try
		{
			obj = ((Object) (e));
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field RandomAccessFile e>
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
	//*   5    9:return          
	//*   6   10:aload_0         
	//*   7   11:getfield        #251 <Field RandomAccessFile e>
	//*   8   14:invokestatic    #254 <Method void ih.a(java.io.Closeable)>
	//*   9   17:aload_0         
	//*  10   18:getfield        #37  <Field hx a>
	//*  11   21:invokevirtual   #292 <Method String hx.b()>
	//*  12   24:astore_1        
	//*  13   25:aload_0         
	//*  14   26:getfield        #60  <Field String d>
	//*  15   29:aload_1         
	//*  16   30:invokestatic    #295 <Method boolean ih.b(String, String)>
	//*  17   33:ifeq            88
	//*  18   36:aload_0         
	//*  19   37:aload_1         
	//*  20   38:invokespecial   #297 <Method void a(String)>
	//*  21   41:new             #299 <Class js>
	//*  22   44:dup             
	//*  23   45:aload_0         
	//*  24   46:getfield        #33  <Field Context f>
	//*  25   49:aload_0         
	//*  26   50:getfield        #35  <Field gy c>
	//*  27   53:invokevirtual   #211 <Method String gy.a()>
	//*  28   56:aload_0         
	//*  29   57:getfield        #35  <Field gy c>
	//*  30   60:invokevirtual   #207 <Method String gy.b()>
	//*  31   63:ldc2            #301 <String "O008">
	//*  32   66:invokespecial   #304 <Method void js(Context, String, String, String)>
	//*  33   69:astore_1        
	//*  34   70:aload_1         
	//*  35   71:ldc2            #306 <String "{\"param_int_first\":1}">
	//*  36   74:invokevirtual   #307 <Method void js.a(String)>
	//*  37   77:aload_1         
	//*  38   78:aload_0         
	//*  39   79:getfield        #33  <Field Context f>
	//*  40   82:invokestatic    #312 <Method void jt.a(js, Context)>
	//*  41   85:goto            116
	//*  42   88:new             #192 <Class File>
	//*  43   91:dup             
	//*  44   92:aload_0         
	//*  45   93:getfield        #60  <Field String d>
	//*  46   96:invokespecial   #194 <Method void File(String)>
	//*  47   99:invokevirtual   #315 <Method boolean File.delete()>
	//*  48  102:pop             
	//*  49  103:goto            116
	//*  50  106:astore_1        
	//*  51  107:aload_1         
	//*  52  108:ldc1            #62  <String "dDownLoad">
	//*  53  110:ldc2            #317 <String "onFinish">
	//*  54  113:invokestatic    #69  <Method void ih.a(Throwable, String, String)>
	//*  55  116:return          
		catch(Throwable throwable1)
	//*  56  117:astore_1        
		{
			ih.a(throwable1, "dDownLoad", "onFinish()");
	//   57  118:aload_1         
	//   58  119:ldc1            #62  <String "dDownLoad">
	//   59  121:ldc2            #319 <String "onFinish()">
	//   60  124:invokestatic    #69  <Method void ih.a(Throwable, String, String)>
			return;
	//   61  127:return          
		}
		if(obj == null)
			return;
		ih.a(((java.io.Closeable) (e)));
		obj = ((Object) (a.b()));
		if(ih.b(d, ((String) (obj))))
		{
			a(((String) (obj)));
			obj = ((Object) (new js(f, c.a(), c.b(), "O008")));
			((js) (obj)).a("{\"param_int_first\":1}");
			jt.a(((js) (obj)), f);
			break MISSING_BLOCK_LABEL_116;
		}
		(new File(d)).delete();
		break MISSING_BLOCK_LABEL_116;
		throwable;
		ih.a(throwable, "dDownLoad", "onFinish");
	}

	public void run()
	{
		try
		{
			if(c())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #322 <Method boolean c()>
	//*   2    4:ifeq            59
			{
				js js1 = new js(f, c.a(), c.b(), "O008");
	//    3    7:new             #299 <Class js>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field Context f>
	//    7   15:aload_0         
	//    8   16:getfield        #35  <Field gy c>
	//    9   19:invokevirtual   #211 <Method String gy.a()>
	//   10   22:aload_0         
	//   11   23:getfield        #35  <Field gy c>
	//   12   26:invokevirtual   #207 <Method String gy.b()>
	//   13   29:ldc2            #301 <String "O008">
	//   14   32:invokespecial   #304 <Method void js(Context, String, String, String)>
	//   15   35:astore_1        
				js1.a("{\"param_int_first\":0}");
	//   16   36:aload_1         
	//   17   37:ldc2            #324 <String "{\"param_int_first\":0}">
	//   18   40:invokevirtual   #307 <Method void js.a(String)>
				jt.a(js1, f);
	//   19   43:aload_1         
	//   20   44:aload_0         
	//   21   45:getfield        #33  <Field Context f>
	//   22   48:invokestatic    #312 <Method void jt.a(js, Context)>
				b.a(((jg.a) (this)));
	//   23   51:aload_0         
	//   24   52:getfield        #49  <Field jg b>
	//   25   55:aload_0         
	//   26   56:invokevirtual   #327 <Method void jg.a(jg$a)>
			}
			return;
	//   27   59:return          
		}
		catch(Throwable throwable)
	//*  28   60:astore_1        
		{
			ih.a(throwable, "dDownLoad", "run()");
	//   29   61:aload_1         
	//   30   62:ldc1            #62  <String "dDownLoad">
	//   31   64:ldc2            #329 <String "run()">
	//   32   67:invokestatic    #69  <Method void ih.a(Throwable, String, String)>
		}
	//   33   70:return          
	}

	private hx a;
	private jg b;
	private gy c;
	private String d;
	private RandomAccessFile e;
	private Context f;
}
