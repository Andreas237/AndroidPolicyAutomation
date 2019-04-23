// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.librivox.client;

import android.app.Service;
import android.content.*;
import android.database.Cursor;
import android.os.*;
import android.preference.PreferenceManager;
import android.support.v4.a.g;
import biz.bookdesign.librivox.b.j;
import biz.bookdesign.librivox.b.m;
import com.crashlytics.android.a;
import java.io.File;
import java.net.URL;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

// Referenced classes of package biz.bookdesign.librivox.client:
//			o, g, e, f, 
//			d

public class DownloadService extends Service
{

	public DownloadService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Service()>
	//    2    4:aload_0         
	//    3    5:new             #18  <Class ConcurrentLinkedQueue>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void ConcurrentLinkedQueue()>
	//    6   12:putfield        #21  <Field AbstractQueue a>
	//    7   15:return          
	}

	static biz.bookdesign.librivox.client.g a(DownloadService downloadservice, biz.bookdesign.librivox.client.g g1)
	{
		downloadservice.b = g1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field biz.bookdesign.librivox.client.g b>
		return g1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private static File a(Context context)
	{
		Object obj = ((Object) (PreferenceManager.getDefaultSharedPreferences(context).getString("biz.bookdesign.librivox.dl.DOWNLOAD_DIR", ((String) (null)))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #32  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//    2    4:ldc1            #34  <String "biz.bookdesign.librivox.dl.DOWNLOAD_DIR">
	//    3    6:aconst_null     
	//    4    7:invokeinterface #40  <Method String SharedPreferences.getString(String, String)>
	//    5   12:astore_1        
		if(obj != null)
	//*   6   13:aload_1         
	//*   7   14:ifnull          42
		{
			obj = ((Object) (new File(((String) (obj)))));
	//    8   17:new             #42  <Class File>
	//    9   20:dup             
	//   10   21:aload_1         
	//   11   22:invokespecial   #45  <Method void File(String)>
	//   12   25:astore_1        
			if(((File) (obj)).exists() && ((File) (obj)).isDirectory())
	//*  13   26:aload_1         
	//*  14   27:invokevirtual   #49  <Method boolean File.exists()>
	//*  15   30:ifeq            42
	//*  16   33:aload_1         
	//*  17   34:invokevirtual   #52  <Method boolean File.isDirectory()>
	//*  18   37:ifeq            42
				return ((File) (obj));
	//   19   40:aload_1         
	//   20   41:areturn         
		}
		if(!"mounted".equals(((Object) (Environment.getExternalStorageState()))))
	//*  21   42:ldc1            #54  <String "mounted">
	//*  22   44:invokestatic    #60  <Method String Environment.getExternalStorageState()>
	//*  23   47:invokevirtual   #66  <Method boolean String.equals(Object)>
	//*  24   50:ifne            58
			return context.getFilesDir();
	//   25   53:aload_0         
	//   26   54:invokevirtual   #72  <Method File Context.getFilesDir()>
	//   27   57:areturn         
		else
			return context.getExternalFilesDir(Environment.DIRECTORY_PODCASTS);
	//   28   58:aload_0         
	//   29   59:getstatic       #76  <Field String Environment.DIRECTORY_PODCASTS>
	//   30   62:invokevirtual   #80  <Method File Context.getExternalFilesDir(String)>
	//   31   65:areturn         
	}

	public static File a(m m1, Context context)
	{
		context = ((Context) (a(context)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #83  <Method File a(Context)>
	//    2    4:astore_1        
		if(context == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       19
		{
			biz.bookdesign.librivox.client.o.a(((Throwable) (null)), "Unable to get storage directory", "download-fail");
	//    5    9:aconst_null     
	//    6   10:ldc1            #85  <String "Unable to get storage directory">
	//    7   12:ldc1            #87  <String "download-fail">
	//    8   14:invokestatic    #92  <Method void biz.bookdesign.librivox.client.o.a(Throwable, String, String)>
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
		}
		Object obj = ((Object) (new StringBuilder()));
	//   11   19:new             #94  <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #95  <Method void StringBuilder()>
	//   14   26:astore_2        
		((StringBuilder) (obj)).append(((File) (context)).getAbsolutePath());
	//   15   27:aload_2         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #98  <Method String File.getAbsolutePath()>
	//   18   32:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
		((StringBuilder) (obj)).append("/librivox_");
	//   20   36:aload_2         
	//   21   37:ldc1            #104 <String "/librivox_">
	//   22   39:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   23   42:pop             
		((StringBuilder) (obj)).append(m1.a());
	//   24   43:aload_2         
	//   25   44:aload_0         
	//   26   45:invokevirtual   #109 <Method int m.a()>
	//   27   48:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
	//   28   51:pop             
		((StringBuilder) (obj)).append('/');
	//   29   52:aload_2         
	//   30   53:bipush          47
	//   31   55:invokevirtual   #115 <Method StringBuilder StringBuilder.append(char)>
	//   32   58:pop             
		context = ((Context) (new File(((StringBuilder) (obj)).toString())));
	//   33   59:new             #42  <Class File>
	//   34   62:dup             
	//   35   63:aload_2         
	//   36   64:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   37   67:invokespecial   #45  <Method void File(String)>
	//   38   70:astore_1        
		if(!((File) (context)).exists() && !((File) (context)).mkdirs())
	//*  39   71:aload_1         
	//*  40   72:invokevirtual   #49  <Method boolean File.exists()>
	//*  41   75:ifne            121
	//*  42   78:aload_1         
	//*  43   79:invokevirtual   #121 <Method boolean File.mkdirs()>
	//*  44   82:ifne            121
		{
			m1 = ((m) (new StringBuilder()));
	//   45   85:new             #94  <Class StringBuilder>
	//   46   88:dup             
	//   47   89:invokespecial   #95  <Method void StringBuilder()>
	//   48   92:astore_0        
			((StringBuilder) (m1)).append("Could not create directory ");
	//   49   93:aload_0         
	//   50   94:ldc1            #123 <String "Could not create directory ">
	//   51   96:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   52   99:pop             
			((StringBuilder) (m1)).append(((File) (context)).getAbsolutePath());
	//   53  100:aload_0         
	//   54  101:aload_1         
	//   55  102:invokevirtual   #98  <Method String File.getAbsolutePath()>
	//   56  105:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   57  108:pop             
			biz.bookdesign.librivox.client.o.a(((Throwable) (null)), ((StringBuilder) (m1)).toString(), "download-fail");
	//   58  109:aconst_null     
	//   59  110:aload_0         
	//   60  111:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   61  114:ldc1            #87  <String "download-fail">
	//   62  116:invokestatic    #92  <Method void biz.bookdesign.librivox.client.o.a(Throwable, String, String)>
			return null;
	//   63  119:aconst_null     
	//   64  120:areturn         
		}
		obj = ((Object) (m1.h()));
	//   65  121:aload_0         
	//   66  122:invokevirtual   #127 <Method URL m.h()>
	//   67  125:astore_2        
		if(obj == null)
	//*  68  126:aload_2         
	//*  69  127:ifnonnull       163
		{
			context = ((Context) (new StringBuilder()));
	//   70  130:new             #94  <Class StringBuilder>
	//   71  133:dup             
	//   72  134:invokespecial   #95  <Method void StringBuilder()>
	//   73  137:astore_1        
			((StringBuilder) (context)).append("No download URL for ");
	//   74  138:aload_1         
	//   75  139:ldc1            #129 <String "No download URL for ">
	//   76  141:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   77  144:pop             
			((StringBuilder) (context)).append(((Object) (m1)));
	//   78  145:aload_1         
	//   79  146:aload_0         
	//   80  147:invokevirtual   #132 <Method StringBuilder StringBuilder.append(Object)>
	//   81  150:pop             
			biz.bookdesign.librivox.client.o.a(((Throwable) (null)), ((StringBuilder) (context)).toString(), "download-fail");
	//   82  151:aconst_null     
	//   83  152:aload_1         
	//   84  153:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   85  156:ldc1            #87  <String "download-fail">
	//   86  158:invokestatic    #92  <Method void biz.bookdesign.librivox.client.o.a(Throwable, String, String)>
			return null;
	//   87  161:aconst_null     
	//   88  162:areturn         
		}
		obj = ((Object) (((URL) (obj)).getPath()));
	//   89  163:aload_2         
	//   90  164:invokevirtual   #137 <Method String URL.getPath()>
	//   91  167:astore_2        
		obj = ((Object) (((String) (obj)).substring(((String) (obj)).lastIndexOf('/') + 1)));
	//   92  168:aload_2         
	//   93  169:aload_2         
	//   94  170:bipush          47
	//   95  172:invokevirtual   #141 <Method int String.lastIndexOf(int)>
	//   96  175:iconst_1        
	//   97  176:iadd            
	//   98  177:invokevirtual   #145 <Method String String.substring(int)>
	//   99  180:astore_2        
		if(!((String) (obj)).isEmpty() && !((String) (obj)).contains("\\"))
	//* 100  181:aload_2         
	//* 101  182:invokevirtual   #148 <Method boolean String.isEmpty()>
	//* 102  185:ifne            242
	//* 103  188:aload_2         
	//* 104  189:ldc1            #150 <String "\\">
	//* 105  191:invokevirtual   #154 <Method boolean String.contains(CharSequence)>
	//* 106  194:ifeq            200
	//* 107  197:goto            242
		{
			m1 = ((m) (new StringBuilder()));
	//  108  200:new             #94  <Class StringBuilder>
	//  109  203:dup             
	//  110  204:invokespecial   #95  <Method void StringBuilder()>
	//  111  207:astore_0        
			((StringBuilder) (m1)).append(((File) (context)).getAbsolutePath());
	//  112  208:aload_0         
	//  113  209:aload_1         
	//  114  210:invokevirtual   #98  <Method String File.getAbsolutePath()>
	//  115  213:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  116  216:pop             
			((StringBuilder) (m1)).append('/');
	//  117  217:aload_0         
	//  118  218:bipush          47
	//  119  220:invokevirtual   #115 <Method StringBuilder StringBuilder.append(char)>
	//  120  223:pop             
			((StringBuilder) (m1)).append(((String) (obj)));
	//  121  224:aload_0         
	//  122  225:aload_2         
	//  123  226:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  124  229:pop             
			return new File(((StringBuilder) (m1)).toString());
	//  125  230:new             #42  <Class File>
	//  126  233:dup             
	//  127  234:aload_0         
	//  128  235:invokevirtual   #118 <Method String StringBuilder.toString()>
	//  129  238:invokespecial   #45  <Method void File(String)>
	//  130  241:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  131  242:new             #94  <Class StringBuilder>
	//  132  245:dup             
	//  133  246:invokespecial   #95  <Method void StringBuilder()>
	//  134  249:astore_2        
			stringbuilder.append(((File) (context)).getAbsolutePath());
	//  135  250:aload_2         
	//  136  251:aload_1         
	//  137  252:invokevirtual   #98  <Method String File.getAbsolutePath()>
	//  138  255:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  139  258:pop             
			stringbuilder.append("/chapter");
	//  140  259:aload_2         
	//  141  260:ldc1            #156 <String "/chapter">
	//  142  262:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  143  265:pop             
			stringbuilder.append(m1.b());
	//  144  266:aload_2         
	//  145  267:aload_0         
	//  146  268:invokevirtual   #158 <Method int m.b()>
	//  147  271:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
	//  148  274:pop             
			stringbuilder.append(".mp3");
	//  149  275:aload_2         
	//  150  276:ldc1            #160 <String ".mp3">
	//  151  278:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  152  281:pop             
			return new File(stringbuilder.toString());
	//  153  282:new             #42  <Class File>
	//  154  285:dup             
	//  155  286:aload_2         
	//  156  287:invokevirtual   #118 <Method String StringBuilder.toString()>
	//  157  290:invokespecial   #45  <Method void File(String)>
	//  158  293:areturn         
		}
	}

	private void a()
	{
		if(b == null && !a.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field biz.bookdesign.librivox.client.g b>
	//*   2    4:ifnonnull       45
	//*   3    7:aload_0         
	//*   4    8:getfield        #21  <Field AbstractQueue a>
	//*   5   11:invokevirtual   #163 <Method boolean AbstractQueue.isEmpty()>
	//*   6   14:ifne            45
		{
			b = new biz.bookdesign.librivox.client.g(this, ((d) (null)));
	//    7   17:aload_0         
	//    8   18:new             #165 <Class biz.bookdesign.librivox.client.g>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:aconst_null     
	//   12   24:invokespecial   #168 <Method void biz.bookdesign.librivox.client.g(DownloadService, d)>
	//   13   27:putfield        #25  <Field biz.bookdesign.librivox.client.g b>
			b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, ((Object []) (new Void[0])));
	//   14   30:aload_0         
	//   15   31:getfield        #25  <Field biz.bookdesign.librivox.client.g b>
	//   16   34:getstatic       #174 <Field java.util.concurrent.Executor AsyncTask.THREAD_POOL_EXECUTOR>
	//   17   37:iconst_0        
	//   18   38:anewarray       Void[]
	//   19   41:invokevirtual   #180 <Method AsyncTask g.executeOnExecutor(java.util.concurrent.Executor, Object[])>
	//   20   44:pop             
		}
	//   21   45:return          
	}

	private void a(int i)
	{
		Cursor cursor = c.a(i);
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field j c>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:invokevirtual   #188 <Method Cursor j.a(long)>
	//    5    9:astore_2        
		ArrayList arraylist;
		arraylist = new ArrayList(cursor.getCount());
	//    6   10:new             #190 <Class ArrayList>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokeinterface #195 <Method int Cursor.getCount()>
	//   10   20:invokespecial   #197 <Method void ArrayList(int)>
	//   11   23:astore_3        
		cursor.moveToFirst();
	//   12   24:aload_2         
	//   13   25:invokeinterface #200 <Method boolean Cursor.moveToFirst()>
	//   14   30:pop             
		for(; !cursor.isAfterLast(); cursor.moveToNext())
	//*  15   31:aload_2         
	//*  16   32:invokeinterface #203 <Method boolean Cursor.isAfterLast()>
	//*  17   37:ifne            101
			if(cursor.getInt(cursor.getColumnIndex("downloaded")) != 1)
	//*  18   40:aload_2         
	//*  19   41:aload_2         
	//*  20   42:ldc1            #205 <String "downloaded">
	//*  21   44:invokeinterface #209 <Method int Cursor.getColumnIndex(String)>
	//*  22   49:invokeinterface #212 <Method int Cursor.getInt(int)>
	//*  23   54:iconst_1        
	//*  24   55:icmpeq          91
				((List) (arraylist)).add(((Object) (new m(i, cursor.getInt(cursor.getColumnIndex("chid")), getApplicationContext()))));
	//   25   58:aload_3         
	//   26   59:new             #106 <Class m>
	//   27   62:dup             
	//   28   63:iload_1         
	//   29   64:aload_2         
	//   30   65:aload_2         
	//   31   66:ldc1            #214 <String "chid">
	//   32   68:invokeinterface #209 <Method int Cursor.getColumnIndex(String)>
	//   33   73:invokeinterface #212 <Method int Cursor.getInt(int)>
	//   34   78:aload_0         
	//   35   79:invokevirtual   #218 <Method Context getApplicationContext()>
	//   36   82:invokespecial   #221 <Method void m(int, int, Context)>
	//   37   85:invokeinterface #226 <Method boolean List.add(Object)>
	//   38   90:pop             

	//   39   91:aload_2         
	//   40   92:invokeinterface #229 <Method boolean Cursor.moveToNext()>
	//   41   97:pop             
	//*  42   98:goto            31
		cursor.close();
	//   43  101:aload_2         
	//   44  102:invokeinterface #232 <Method void Cursor.close()>
		a((m[])((List) (arraylist)).toArray(((Object []) (new m[0]))), 3, ((Runnable) (new e(this, ((List) (arraylist))))));
	//   45  107:aload_0         
	//   46  108:aload_3         
	//   47  109:iconst_0        
	//   48  110:anewarray       m[]
	//   49  113:invokeinterface #236 <Method Object[] List.toArray(Object[])>
	//   50  118:checkcast       #238 <Class m[]>
	//   51  121:iconst_3        
	//   52  122:new             #240 <Class e>
	//   53  125:dup             
	//   54  126:aload_0         
	//   55  127:aload_3         
	//   56  128:invokespecial   #243 <Method void e(DownloadService, List)>
	//   57  131:invokespecial   #246 <Method void a(m[], int, Runnable)>
		return;
	//   58  134:return          
		Exception exception;
		exception;
	//   59  135:astore_3        
		cursor.close();
	//   60  136:aload_2         
	//   61  137:invokeinterface #232 <Method void Cursor.close()>
		throw exception;
	//   62  142:aload_3         
	//   63  143:athrow          
	}

	private void a(int i, int k)
	{
		m m1 = new m(i, k, getApplicationContext());
	//    0    0:new             #106 <Class m>
	//    1    3:dup             
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #218 <Method Context getApplicationContext()>
	//    6   10:invokespecial   #221 <Method void m(int, int, Context)>
	//    7   13:astore_3        
		c.a(i, k, 3L);
	//    8   14:aload_0         
	//    9   15:getfield        #183 <Field j c>
	//   10   18:iload_1         
	//   11   19:i2l             
	//   12   20:iload_2         
	//   13   21:i2l             
	//   14   22:ldc2w           #248 <Long 3L>
	//   15   25:invokevirtual   #252 <Method boolean j.a(long, long, long)>
	//   16   28:pop             
		a("biz.bookdesign.librivox.dl.DOWNLOAD_NOTIFICATION");
	//   17   29:aload_0         
	//   18   30:ldc1            #254 <String "biz.bookdesign.librivox.dl.DOWNLOAD_NOTIFICATION">
	//   19   32:invokespecial   #256 <Method void a(String)>
		a.add(((Object) (m1)));
	//   20   35:aload_0         
	//   21   36:getfield        #21  <Field AbstractQueue a>
	//   22   39:aload_3         
	//   23   40:invokevirtual   #257 <Method boolean AbstractQueue.add(Object)>
	//   24   43:pop             
		a();
	//   25   44:aload_0         
	//   26   45:invokespecial   #259 <Method void a()>
	//   27   48:return          
	}

	static void a(DownloadService downloadservice)
	{
		downloadservice.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #259 <Method void a()>
	//    2    4:return          
	}

	static void a(DownloadService downloadservice, String s)
	{
		downloadservice.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #256 <Method void a(String)>
	//    3    5:return          
	}

	private void a(String s)
	{
		g.a(((Context) (this))).a(new Intent(s));
	//    0    0:aload_0         
	//    1    1:invokestatic    #266 <Method g g.a(Context)>
	//    2    4:new             #268 <Class Intent>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #269 <Method void Intent(String)>
	//    6   12:invokevirtual   #272 <Method boolean g.a(Intent)>
	//    7   15:pop             
	//    8   16:return          
	}

	private void a(m am[], int i, Runnable runnable)
	{
		(new f(this, i, runnable)).execute(((Object []) (am)));
	//    0    0:new             #274 <Class f>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokespecial   #277 <Method void f(DownloadService, int, Runnable)>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #281 <Method AsyncTask f.execute(Object[])>
	//    8   14:pop             
	//    9   15:return          
	}

	static boolean a(DownloadService downloadservice, boolean flag)
	{
		downloadservice.d = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #284 <Field boolean d>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static AbstractQueue b(DownloadService downloadservice)
	{
		return downloadservice.a;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AbstractQueue a>
	//    2    4:areturn         
	}

	static j c(DownloadService downloadservice)
	{
		return downloadservice.c;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field j c>
	//    2    4:areturn         
	}

	static boolean d(DownloadService downloadservice)
	{
		return downloadservice.d;
	//    0    0:aload_0         
	//    1    1:getfield        #284 <Field boolean d>
	//    2    4:ireturn         
	}

	public IBinder onBind(Intent intent)
	{
		throw new UnsupportedOperationException("Not implemented");
	//    0    0:new             #291 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #293 <String "Not implemented">
	//    3    7:invokespecial   #294 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #297 <Method void Service.onCreate()>
		c = new j(getApplicationContext());
	//    2    4:aload_0         
	//    3    5:new             #185 <Class j>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokevirtual   #218 <Method Context getApplicationContext()>
	//    7   13:invokespecial   #300 <Method void j(Context)>
	//    8   16:putfield        #183 <Field j c>
		c.a();
	//    9   19:aload_0         
	//   10   20:getfield        #183 <Field j c>
	//   11   23:invokevirtual   #303 <Method j j.a()>
	//   12   26:pop             
	//   13   27:return          
	}

	public void onDestroy()
	{
		c.b();
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field j c>
	//    2    4:invokevirtual   #306 <Method void j.b()>
		super.onDestroy();
	//    3    7:aload_0         
	//    4    8:invokespecial   #308 <Method void Service.onDestroy()>
	//    5   11:return          
	}

	public int onStartCommand(Intent intent, int i, int k)
	{
		if("biz.bookdesign.librivox.dl.RESET_REQUEST".equals(((Object) (intent.getAction()))))
	//*   0    0:ldc2            #315 <String "biz.bookdesign.librivox.dl.RESET_REQUEST">
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #318 <Method String Intent.getAction()>
	//*   3    7:invokevirtual   #66  <Method boolean String.equals(Object)>
	//*   4   10:ifeq            26
		{
			a.clear();
	//    5   13:aload_0         
	//    6   14:getfield        #21  <Field AbstractQueue a>
	//    7   17:invokevirtual   #321 <Method void AbstractQueue.clear()>
			stopSelf();
	//    8   20:aload_0         
	//    9   21:invokevirtual   #324 <Method void stopSelf()>
			return 2;
	//   10   24:iconst_2        
	//   11   25:ireturn         
		}
		if("biz.bookdesign.librivox.dl.RESUME_DOWNLOAD".equals(((Object) (intent.getAction()))))
	//*  12   26:ldc2            #326 <String "biz.bookdesign.librivox.dl.RESUME_DOWNLOAD">
	//*  13   29:aload_1         
	//*  14   30:invokevirtual   #318 <Method String Intent.getAction()>
	//*  15   33:invokevirtual   #66  <Method boolean String.equals(Object)>
	//*  16   36:ifeq            91
			if(a.isEmpty())
	//*  17   39:aload_0         
	//*  18   40:getfield        #21  <Field AbstractQueue a>
	//*  19   43:invokevirtual   #163 <Method boolean AbstractQueue.isEmpty()>
	//*  20   46:ifeq            62
			{
				com.crashlytics.android.a.a(6, "LV-DLService", "Resume requested, but no books in download queue");
	//   21   49:bipush          6
	//   22   51:ldc2            #328 <String "LV-DLService">
	//   23   54:ldc2            #330 <String "Resume requested, but no books in download queue">
	//   24   57:invokestatic    #335 <Method void a.a(int, String, String)>
				return 2;
	//   25   60:iconst_2        
	//   26   61:ireturn         
			} else
			{
				a((m[])a.toArray(((Object []) (new m[0]))), 3, ((Runnable) (new d(this))));
	//   27   62:aload_0         
	//   28   63:aload_0         
	//   29   64:getfield        #21  <Field AbstractQueue a>
	//   30   67:iconst_0        
	//   31   68:anewarray       m[]
	//   32   71:invokevirtual   #336 <Method Object[] AbstractQueue.toArray(Object[])>
	//   33   74:checkcast       #238 <Class m[]>
	//   34   77:iconst_3        
	//   35   78:new             #338 <Class d>
	//   36   81:dup             
	//   37   82:aload_0         
	//   38   83:invokespecial   #340 <Method void d(DownloadService)>
	//   39   86:invokespecial   #246 <Method void a(m[], int, Runnable)>
				return 2;
	//   40   89:iconst_2        
	//   41   90:ireturn         
			}
		if(d)
	//*  42   91:aload_0         
	//*  43   92:getfield        #284 <Field boolean d>
	//*  44   95:ifeq            105
			a.clear();
	//   45   98:aload_0         
	//   46   99:getfield        #21  <Field AbstractQueue a>
	//   47  102:invokevirtual   #321 <Method void AbstractQueue.clear()>
		i = intent.getIntExtra("lvid", 0);
	//   48  105:aload_1         
	//   49  106:ldc2            #342 <String "lvid">
	//   50  109:iconst_0        
	//   51  110:invokevirtual   #346 <Method int Intent.getIntExtra(String, int)>
	//   52  113:istore_2        
		k = intent.getIntExtra("chid", 0);
	//   53  114:aload_1         
	//   54  115:ldc1            #214 <String "chid">
	//   55  117:iconst_0        
	//   56  118:invokevirtual   #346 <Method int Intent.getIntExtra(String, int)>
	//   57  121:istore_3        
		if(i != 0)
	//*  58  122:iload_2         
	//*  59  123:ifeq            145
		{
			if(k == 0)
	//*  60  126:iload_3         
	//*  61  127:ifne            137
			{
				a(i);
	//   62  130:aload_0         
	//   63  131:iload_2         
	//   64  132:invokespecial   #348 <Method void a(int)>
				return 2;
	//   65  135:iconst_2        
	//   66  136:ireturn         
			} else
			{
				a(i, k);
	//   67  137:aload_0         
	//   68  138:iload_2         
	//   69  139:iload_3         
	//   70  140:invokespecial   #350 <Method void a(int, int)>
				return 2;
	//   71  143:iconst_2        
	//   72  144:ireturn         
			}
		} else
		{
			throw new IllegalStateException("DownloadService launched without lvid in intent");
	//   73  145:new             #352 <Class IllegalStateException>
	//   74  148:dup             
	//   75  149:ldc2            #354 <String "DownloadService launched without lvid in intent">
	//   76  152:invokespecial   #355 <Method void IllegalStateException(String)>
	//   77  155:athrow          
		}
	}

	private final AbstractQueue a = new ConcurrentLinkedQueue();
	private biz.bookdesign.librivox.client.g b;
	private j c;
	private boolean d;
}
