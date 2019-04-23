// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.appboy.support.AppboyLogger;
import java.io.*;

// Referenced classes of package bo.app:
//			av

public class au
{

	public au(File file, int i, int j, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		b = av.a(file, i, j, l);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:lload           4
	//    7   10:invokestatic    #28  <Method av av.a(File, int, int, long)>
	//    8   13:putfield        #30  <Field av b>
	//    9   16:return          
	}

	private String c(String s)
	{
		return Integer.toString(s.hashCode());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #38  <Method int String.hashCode()>
	//    2    4:invokestatic    #44  <Method String Integer.toString(int)>
	//    3    7:areturn         
	}

	public Bitmap a(String s)
	{
		String s1 = c(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #49  <Method String c(String)>
	//    3    5:astore          4
		Object obj = ((Object) (b.a(s1)));
	//    4    7:aload_0         
	//    5    8:getfield        #30  <Field av b>
	//    6   11:aload           4
	//    7   13:invokevirtual   #52  <Method av$b av.a(String)>
	//    8   16:astore_2        
		s = ((String) (obj));
	//    9   17:aload_2         
	//   10   18:astore_1        
		Bitmap bitmap = BitmapFactory.decodeStream(((av.b) (obj)).a(0));
	//   11   19:aload_2         
	//   12   20:iconst_0        
	//   13   21:invokevirtual   #57  <Method java.io.InputStream av$b.a(int)>
	//   14   24:invokestatic    #63  <Method Bitmap BitmapFactory.decodeStream(java.io.InputStream)>
	//   15   27:astore_3        
		if(obj != null)
	//*  16   28:aload_2         
	//*  17   29:ifnull          36
			((av.b) (obj)).close();
	//   18   32:aload_2         
	//   19   33:invokevirtual   #66  <Method void av$b.close()>
		return bitmap;
	//   20   36:aload_3         
	//   21   37:areturn         
		IOException ioexception;
		ioexception;
	//   22   38:astore_3        
		break MISSING_BLOCK_LABEL_51;
	//   23   39:goto            51
		obj;
	//   24   42:astore_2        
		s = null;
	//   25   43:aconst_null     
	//   26   44:astore_1        
		break MISSING_BLOCK_LABEL_149;
	//   27   45:goto            149
		ioexception;
	//   28   48:astore_3        
		obj = null;
	//   29   49:aconst_null     
	//   30   50:astore_2        
		s = ((String) (obj));
	//   31   51:aload_2         
	//   32   52:astore_1        
		String s2 = a;
	//   33   53:getstatic       #18  <Field String a>
	//   34   56:astore          5
		s = ((String) (obj));
	//   35   58:aload_2         
	//   36   59:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   37   60:new             #68  <Class StringBuilder>
	//   38   63:dup             
	//   39   64:invokespecial   #69  <Method void StringBuilder()>
	//   40   67:astore          6
		s = ((String) (obj));
	//   41   69:aload_2         
	//   42   70:astore_1        
		stringbuilder.append("Failed to get bitmap from disk cache for key ");
	//   43   71:aload           6
	//   44   73:ldc1            #71  <String "Failed to get bitmap from disk cache for key ">
	//   45   75:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   46   78:pop             
		s = ((String) (obj));
	//   47   79:aload_2         
	//   48   80:astore_1        
		stringbuilder.append(s1);
	//   49   81:aload           6
	//   50   83:aload           4
	//   51   85:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   52   88:pop             
		s = ((String) (obj));
	//   53   89:aload_2         
	//   54   90:astore_1        
		AppboyLogger.e(s2, stringbuilder.toString(), ((Throwable) (ioexception)));
	//   55   91:aload           5
	//   56   93:aload           6
	//   57   95:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   58   98:aload_3         
	//   59   99:invokestatic    #82  <Method int AppboyLogger.e(String, String, Throwable)>
	//   60  102:pop             
		if(obj != null)
	//*  61  103:aload_2         
	//*  62  104:ifnull          111
			((av.b) (obj)).close();
	//   63  107:aload_2         
	//   64  108:invokevirtual   #66  <Method void av$b.close()>
		s = a;
	//   65  111:getstatic       #18  <Field String a>
	//   66  114:astore_1        
		obj = ((Object) (new StringBuilder()));
	//   67  115:new             #68  <Class StringBuilder>
	//   68  118:dup             
	//   69  119:invokespecial   #69  <Method void StringBuilder()>
	//   70  122:astore_2        
		((StringBuilder) (obj)).append("Failed to load image from disk cache: ");
	//   71  123:aload_2         
	//   72  124:ldc1            #84  <String "Failed to load image from disk cache: ">
	//   73  126:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   74  129:pop             
		((StringBuilder) (obj)).append(s1);
	//   75  130:aload_2         
	//   76  131:aload           4
	//   77  133:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   78  136:pop             
		AppboyLogger.d(s, ((StringBuilder) (obj)).toString());
	//   79  137:aload_1         
	//   80  138:aload_2         
	//   81  139:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   82  142:invokestatic    #88  <Method int AppboyLogger.d(String, String)>
	//   83  145:pop             
		return null;
	//   84  146:aconst_null     
	//   85  147:areturn         
		obj;
	//   86  148:astore_2        
		if(s != null)
	//*  87  149:aload_1         
	//*  88  150:ifnull          157
			((av.b) (s)).close();
	//   89  153:aload_1         
	//   90  154:invokevirtual   #66  <Method void av$b.close()>
		throw obj;
	//   91  157:aload_2         
	//   92  158:athrow          
	}

	public void a(String s, Bitmap bitmap)
	{
		Object obj;
		Object obj1;
		StringBuilder stringbuilder1;
		String s2;
		s2 = c(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #49  <Method String c(String)>
	//    3    5:astore          6
		stringbuilder1 = null;
	//    4    7:aconst_null     
	//    5    8:astore          5
		obj1 = null;
	//    6   10:aconst_null     
	//    7   11:astore          4
		s = ((String) (obj1));
	//    8   13:aload           4
	//    9   15:astore_1        
		obj = ((Object) (stringbuilder1));
	//   10   16:aload           5
	//   11   18:astore_3        
		av.a a1 = b.b(s2);
	//   12   19:aload_0         
	//   13   20:getfield        #30  <Field av b>
	//   14   23:aload           6
	//   15   25:invokevirtual   #92  <Method av$a av.b(String)>
	//   16   28:astore          7
		s = ((String) (obj1));
	//   17   30:aload           4
	//   18   32:astore_1        
		obj = ((Object) (stringbuilder1));
	//   19   33:aload           5
	//   20   35:astore_3        
		obj1 = ((Object) (a1.a(0)));
	//   21   36:aload           7
	//   22   38:iconst_0        
	//   23   39:invokevirtual   #97  <Method OutputStream av$a.a(int)>
	//   24   42:astore          4
		s = ((String) (obj1));
	//   25   44:aload           4
	//   26   46:astore_1        
		obj = obj1;
	//   27   47:aload           4
	//   28   49:astore_3        
		bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, ((OutputStream) (obj1)));
	//   29   50:aload_2         
	//   30   51:getstatic       #103 <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.PNG>
	//   31   54:bipush          100
	//   32   56:aload           4
	//   33   58:invokevirtual   #109 <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, OutputStream)>
	//   34   61:pop             
		s = ((String) (obj1));
	//   35   62:aload           4
	//   36   64:astore_1        
		obj = obj1;
	//   37   65:aload           4
	//   38   67:astore_3        
		((OutputStream) (obj1)).flush();
	//   39   68:aload           4
	//   40   70:invokevirtual   #114 <Method void OutputStream.flush()>
		s = ((String) (obj1));
	//   41   73:aload           4
	//   42   75:astore_1        
		obj = obj1;
	//   43   76:aload           4
	//   44   78:astore_3        
		((OutputStream) (obj1)).close();
	//   45   79:aload           4
	//   46   81:invokevirtual   #115 <Method void OutputStream.close()>
		s = ((String) (obj1));
	//   47   84:aload           4
	//   48   86:astore_1        
		obj = obj1;
	//   49   87:aload           4
	//   50   89:astore_3        
		a1.a();
	//   51   90:aload           7
	//   52   92:invokevirtual   #117 <Method void av$a.a()>
		if(obj1 == null) goto _L2; else goto _L1
	//   53   95:aload           4
	//   54   97:ifnull          226
_L1:
		try
		{
			((OutputStream) (obj1)).close();
	//   55  100:aload           4
	//   56  102:invokevirtual   #115 <Method void OutputStream.close()>
			return;
	//   57  105:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  58  106:astore_3        
		{
			s = a;
	//   59  107:getstatic       #18  <Field String a>
	//   60  110:astore_1        
		}
		bitmap = ((Bitmap) (new StringBuilder()));
	//   61  111:new             #68  <Class StringBuilder>
	//   62  114:dup             
	//   63  115:invokespecial   #69  <Method void StringBuilder()>
	//   64  118:astore_2        
_L3:
		((StringBuilder) (bitmap)).append("Exception while closing disk cache output stream for key");
	//   65  119:aload_2         
	//   66  120:ldc1            #119 <String "Exception while closing disk cache output stream for key">
	//   67  122:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   68  125:pop             
		((StringBuilder) (bitmap)).append(s2);
	//   69  126:aload_2         
	//   70  127:aload           6
	//   71  129:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   72  132:pop             
		AppboyLogger.e(s, ((StringBuilder) (bitmap)).toString(), ((Throwable) (obj)));
	//   73  133:aload_1         
	//   74  134:aload_2         
	//   75  135:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   76  138:aload_3         
	//   77  139:invokestatic    #82  <Method int AppboyLogger.e(String, String, Throwable)>
	//   78  142:pop             
		return;
	//   79  143:return          
		bitmap;
	//   80  144:astore_2        
		break MISSING_BLOCK_LABEL_227;
	//   81  145:goto            227
		bitmap;
	//   82  148:astore_2        
		s = ((String) (obj));
	//   83  149:aload_3         
	//   84  150:astore_1        
		obj1 = ((Object) (a));
	//   85  151:getstatic       #18  <Field String a>
	//   86  154:astore          4
		s = ((String) (obj));
	//   87  156:aload_3         
	//   88  157:astore_1        
		stringbuilder1 = new StringBuilder();
	//   89  158:new             #68  <Class StringBuilder>
	//   90  161:dup             
	//   91  162:invokespecial   #69  <Method void StringBuilder()>
	//   92  165:astore          5
		s = ((String) (obj));
	//   93  167:aload_3         
	//   94  168:astore_1        
		stringbuilder1.append("Exception while producing output stream or compressing bitmap for key ");
	//   95  169:aload           5
	//   96  171:ldc1            #121 <String "Exception while producing output stream or compressing bitmap for key ">
	//   97  173:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   98  176:pop             
		s = ((String) (obj));
	//   99  177:aload_3         
	//  100  178:astore_1        
		stringbuilder1.append(s2);
	//  101  179:aload           5
	//  102  181:aload           6
	//  103  183:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  104  186:pop             
		s = ((String) (obj));
	//  105  187:aload_3         
	//  106  188:astore_1        
		AppboyLogger.e(((String) (obj1)), stringbuilder1.toString(), ((Throwable) (bitmap)));
	//  107  189:aload           4
	//  108  191:aload           5
	//  109  193:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  110  196:aload_2         
	//  111  197:invokestatic    #82  <Method int AppboyLogger.e(String, String, Throwable)>
	//  112  200:pop             
		if(obj == null)
			break; /* Loop/switch isn't completed */
	//  113  201:aload_3         
	//  114  202:ifnull          226
		try
		{
			((OutputStream) (obj)).close();
	//  115  205:aload_3         
	//  116  206:invokevirtual   #115 <Method void OutputStream.close()>
			return;
	//  117  209:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 118  210:astore_3        
		{
			s = a;
	//  119  211:getstatic       #18  <Field String a>
	//  120  214:astore_1        
		}
		bitmap = ((Bitmap) (new StringBuilder()));
	//  121  215:new             #68  <Class StringBuilder>
	//  122  218:dup             
	//  123  219:invokespecial   #69  <Method void StringBuilder()>
	//  124  222:astore_2        
		if(true) goto _L3; else goto _L2
	//  125  223:goto            119
_L2:
		return;
	//  126  226:return          
		if(s != null)
	//* 127  227:aload_1         
	//* 128  228:ifnull          279
			try
			{
				((OutputStream) (s)).close();
	//  129  231:aload_1         
	//  130  232:invokevirtual   #115 <Method void OutputStream.close()>
			}
	//* 131  235:goto            279
			// Misplaced declaration of an exception variable
			catch(String s)
	//* 132  238:astore_1        
			{
				String s1 = a;
	//  133  239:getstatic       #18  <Field String a>
	//  134  242:astore_3        
				StringBuilder stringbuilder = new StringBuilder();
	//  135  243:new             #68  <Class StringBuilder>
	//  136  246:dup             
	//  137  247:invokespecial   #69  <Method void StringBuilder()>
	//  138  250:astore          4
				stringbuilder.append("Exception while closing disk cache output stream for key");
	//  139  252:aload           4
	//  140  254:ldc1            #119 <String "Exception while closing disk cache output stream for key">
	//  141  256:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  142  259:pop             
				stringbuilder.append(s2);
	//  143  260:aload           4
	//  144  262:aload           6
	//  145  264:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//  146  267:pop             
				AppboyLogger.e(s1, stringbuilder.toString(), ((Throwable) (s)));
	//  147  268:aload_3         
	//  148  269:aload           4
	//  149  271:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  150  274:aload_1         
	//  151  275:invokestatic    #82  <Method int AppboyLogger.e(String, String, Throwable)>
	//  152  278:pop             
			}
		throw bitmap;
	//  153  279:aload_2         
	//  154  280:athrow          
	}

	public boolean b(String s)
	{
		boolean flag;
		s = c(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #49  <Method String c(String)>
	//    3    5:astore_1        
		flag = false;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		av.b b1 = b.a(s);
	//    6    8:aload_0         
	//    7    9:getfield        #30  <Field av b>
	//    8   12:aload_1         
	//    9   13:invokevirtual   #52  <Method av$b av.a(String)>
	//   10   16:astore_3        
		if(b1 != null)
	//*  11   17:aload_3         
	//*  12   18:ifnull          23
			flag = true;
	//   13   21:iconst_1        
	//   14   22:istore_2        
		if(b1 != null)
	//*  15   23:aload_3         
	//*  16   24:ifnull          31
			b1.close();
	//   17   27:aload_3         
	//   18   28:invokevirtual   #66  <Method void av$b.close()>
		return flag;
	//   19   31:iload_2         
	//   20   32:ireturn         
		s;
	//   21   33:astore_1        
		break MISSING_BLOCK_LABEL_81;
	//   22   34:goto            81
		IOException ioexception;
		ioexception;
	//   23   37:astore_3        
		String s1 = a;
	//   24   38:getstatic       #18  <Field String a>
	//   25   41:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   26   43:new             #68  <Class StringBuilder>
	//   27   46:dup             
	//   28   47:invokespecial   #69  <Method void StringBuilder()>
	//   29   50:astore          5
		stringbuilder.append("Error while retrieving disk for key ");
	//   30   52:aload           5
	//   31   54:ldc1            #124 <String "Error while retrieving disk for key ">
	//   32   56:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   33   59:pop             
		stringbuilder.append(s);
	//   34   60:aload           5
	//   35   62:aload_1         
	//   36   63:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   37   66:pop             
		AppboyLogger.e(s1, stringbuilder.toString(), ((Throwable) (ioexception)));
	//   38   67:aload           4
	//   39   69:aload           5
	//   40   71:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   41   74:aload_3         
	//   42   75:invokestatic    #82  <Method int AppboyLogger.e(String, String, Throwable)>
	//   43   78:pop             
		return false;
	//   44   79:iconst_0        
	//   45   80:ireturn         
		throw s;
	//   46   81:aload_1         
	//   47   82:athrow          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/au);
	private final av b;

	static 
	{
	//    0    0:ldc1            #2   <Class au>
	//    1    2:invokestatic    #16  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #18  <Field String a>
	//*   3    8:return          
	}
}
