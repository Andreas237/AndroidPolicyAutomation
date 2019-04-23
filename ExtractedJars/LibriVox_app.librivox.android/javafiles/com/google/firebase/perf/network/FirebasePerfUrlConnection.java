// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.perf.network;

import com.google.android.gms.internal.firebase-perf.*;
import com.google.firebase.perf.internal.h;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import javax.net.ssl.HttpsURLConnection;

// Referenced classes of package com.google.firebase.perf.network:
//			d, c, h

public class FirebasePerfUrlConnection
{

	private FirebasePerfUrlConnection()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	private static InputStream a(al al1, h h1, zzbg zzbg1)
	{
		zzbg1.a();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #17  <Method void zzbg.a()>
		long l = zzbg1.b();
	//    2    4:aload_2         
	//    3    5:invokevirtual   #21  <Method long zzbg.b()>
	//    4    8:lstore_3        
		h1 = ((h) (v.a(h1)));
	//    5    9:aload_1         
	//    6   10:invokestatic    #26  <Method v v.a(h)>
	//    7   13:astore_1        
		Object obj;
		try
		{
			obj = ((Object) (al1.a()));
	//    8   14:aload_0         
	//    9   15:invokevirtual   #31  <Method URLConnection al.a()>
	//   10   18:astore          5
			if(obj instanceof HttpsURLConnection)
	//*  11   20:aload           5
	//*  12   22:instanceof      #33  <Class HttpsURLConnection>
	//*  13   25:ifeq            46
				return (new d((HttpsURLConnection)obj, zzbg1, ((v) (h1)))).getInputStream();
	//   14   28:new             #35  <Class d>
	//   15   31:dup             
	//   16   32:aload           5
	//   17   34:checkcast       #33  <Class HttpsURLConnection>
	//   18   37:aload_2         
	//   19   38:aload_1         
	//   20   39:invokespecial   #38  <Method void d(HttpsURLConnection, zzbg, v)>
	//   21   42:invokevirtual   #42  <Method InputStream d.getInputStream()>
	//   22   45:areturn         
			if(obj instanceof HttpURLConnection)
	//*  23   46:aload           5
	//*  24   48:instanceof      #44  <Class HttpURLConnection>
	//*  25   51:ifeq            72
				return (new c((HttpURLConnection)obj, zzbg1, ((v) (h1)))).getInputStream();
	//   26   54:new             #46  <Class c>
	//   27   57:dup             
	//   28   58:aload           5
	//   29   60:checkcast       #44  <Class HttpURLConnection>
	//   30   63:aload_2         
	//   31   64:aload_1         
	//   32   65:invokespecial   #49  <Method void c(HttpURLConnection, zzbg, v)>
	//   33   68:invokevirtual   #50  <Method InputStream c.getInputStream()>
	//   34   71:areturn         
			obj = ((Object) (((URLConnection) (obj)).getInputStream()));
	//   35   72:aload           5
	//   36   74:invokevirtual   #53  <Method InputStream URLConnection.getInputStream()>
	//   37   77:astore          5
		}
	//*  38   79:aload           5
	//*  39   81:areturn         
		catch(IOException ioexception)
	//*  40   82:astore          5
		{
			((v) (h1)).b(l);
	//   41   84:aload_1         
	//   42   85:lload_3         
	//   43   86:invokevirtual   #56  <Method v v.b(long)>
	//   44   89:pop             
			((v) (h1)).e(zzbg1.c());
	//   45   90:aload_1         
	//   46   91:aload_2         
	//   47   92:invokevirtual   #59  <Method long zzbg.c()>
	//   48   95:invokevirtual   #62  <Method v v.e(long)>
	//   49   98:pop             
			((v) (h1)).a(al1.toString());
	//   50   99:aload_1         
	//   51  100:aload_0         
	//   52  101:invokevirtual   #66  <Method String al.toString()>
	//   53  104:invokevirtual   #69  <Method v v.a(String)>
	//   54  107:pop             
			h.a(((v) (h1)));
	//   55  108:aload_1         
	//   56  109:invokestatic    #74  <Method void h.a(v)>
			throw ioexception;
	//   57  112:aload           5
	//   58  114:athrow          
		}
		return ((InputStream) (obj));
	}

	private static Object a(al al1, Class aclass[], h h1, zzbg zzbg1)
	{
		zzbg1.a();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #17  <Method void zzbg.a()>
		long l = zzbg1.b();
	//    2    4:aload_3         
	//    3    5:invokevirtual   #21  <Method long zzbg.b()>
	//    4    8:lstore          4
		h1 = ((h) (v.a(h1)));
	//    5   10:aload_2         
	//    6   11:invokestatic    #26  <Method v v.a(h)>
	//    7   14:astore_2        
		try
		{
			URLConnection urlconnection = al1.a();
	//    8   15:aload_0         
	//    9   16:invokevirtual   #31  <Method URLConnection al.a()>
	//   10   19:astore          6
			if(urlconnection instanceof HttpsURLConnection)
	//*  11   21:aload           6
	//*  12   23:instanceof      #33  <Class HttpsURLConnection>
	//*  13   26:ifeq            48
				return (new d((HttpsURLConnection)urlconnection, zzbg1, ((v) (h1)))).getContent(aclass);
	//   14   29:new             #35  <Class d>
	//   15   32:dup             
	//   16   33:aload           6
	//   17   35:checkcast       #33  <Class HttpsURLConnection>
	//   18   38:aload_3         
	//   19   39:aload_2         
	//   20   40:invokespecial   #38  <Method void d(HttpsURLConnection, zzbg, v)>
	//   21   43:aload_1         
	//   22   44:invokevirtual   #79  <Method Object d.getContent(Class[])>
	//   23   47:areturn         
			if(urlconnection instanceof HttpURLConnection)
	//*  24   48:aload           6
	//*  25   50:instanceof      #44  <Class HttpURLConnection>
	//*  26   53:ifeq            75
				return (new c((HttpURLConnection)urlconnection, zzbg1, ((v) (h1)))).getContent(aclass);
	//   27   56:new             #46  <Class c>
	//   28   59:dup             
	//   29   60:aload           6
	//   30   62:checkcast       #44  <Class HttpURLConnection>
	//   31   65:aload_3         
	//   32   66:aload_2         
	//   33   67:invokespecial   #49  <Method void c(HttpURLConnection, zzbg, v)>
	//   34   70:aload_1         
	//   35   71:invokevirtual   #80  <Method Object c.getContent(Class[])>
	//   36   74:areturn         
			aclass = ((Class []) (urlconnection.getContent(aclass)));
	//   37   75:aload           6
	//   38   77:aload_1         
	//   39   78:invokevirtual   #81  <Method Object URLConnection.getContent(Class[])>
	//   40   81:astore_1        
		}
	//*  41   82:aload_1         
	//*  42   83:areturn         
		// Misplaced declaration of an exception variable
		catch(Class aclass[])
	//*  43   84:astore_1        
		{
			((v) (h1)).b(l);
	//   44   85:aload_2         
	//   45   86:lload           4
	//   46   88:invokevirtual   #56  <Method v v.b(long)>
	//   47   91:pop             
			((v) (h1)).e(zzbg1.c());
	//   48   92:aload_2         
	//   49   93:aload_3         
	//   50   94:invokevirtual   #59  <Method long zzbg.c()>
	//   51   97:invokevirtual   #62  <Method v v.e(long)>
	//   52  100:pop             
			((v) (h1)).a(al1.toString());
	//   53  101:aload_2         
	//   54  102:aload_0         
	//   55  103:invokevirtual   #66  <Method String al.toString()>
	//   56  106:invokevirtual   #69  <Method v v.a(String)>
	//   57  109:pop             
			h.a(((v) (h1)));
	//   58  110:aload_2         
	//   59  111:invokestatic    #74  <Method void h.a(v)>
			throw aclass;
	//   60  114:aload_1         
	//   61  115:athrow          
		}
		return ((Object) (aclass));
	}

	private static Object b(al al1, h h1, zzbg zzbg1)
	{
		zzbg1.a();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #17  <Method void zzbg.a()>
		long l = zzbg1.b();
	//    2    4:aload_2         
	//    3    5:invokevirtual   #21  <Method long zzbg.b()>
	//    4    8:lstore_3        
		h1 = ((h) (v.a(h1)));
	//    5    9:aload_1         
	//    6   10:invokestatic    #26  <Method v v.a(h)>
	//    7   13:astore_1        
		Object obj;
		try
		{
			obj = ((Object) (al1.a()));
	//    8   14:aload_0         
	//    9   15:invokevirtual   #31  <Method URLConnection al.a()>
	//   10   18:astore          5
			if(obj instanceof HttpsURLConnection)
	//*  11   20:aload           5
	//*  12   22:instanceof      #33  <Class HttpsURLConnection>
	//*  13   25:ifeq            46
				return (new d((HttpsURLConnection)obj, zzbg1, ((v) (h1)))).getContent();
	//   14   28:new             #35  <Class d>
	//   15   31:dup             
	//   16   32:aload           5
	//   17   34:checkcast       #33  <Class HttpsURLConnection>
	//   18   37:aload_2         
	//   19   38:aload_1         
	//   20   39:invokespecial   #38  <Method void d(HttpsURLConnection, zzbg, v)>
	//   21   42:invokevirtual   #85  <Method Object d.getContent()>
	//   22   45:areturn         
			if(obj instanceof HttpURLConnection)
	//*  23   46:aload           5
	//*  24   48:instanceof      #44  <Class HttpURLConnection>
	//*  25   51:ifeq            72
				return (new c((HttpURLConnection)obj, zzbg1, ((v) (h1)))).getContent();
	//   26   54:new             #46  <Class c>
	//   27   57:dup             
	//   28   58:aload           5
	//   29   60:checkcast       #44  <Class HttpURLConnection>
	//   30   63:aload_2         
	//   31   64:aload_1         
	//   32   65:invokespecial   #49  <Method void c(HttpURLConnection, zzbg, v)>
	//   33   68:invokevirtual   #86  <Method Object c.getContent()>
	//   34   71:areturn         
			obj = ((URLConnection) (obj)).getContent();
	//   35   72:aload           5
	//   36   74:invokevirtual   #87  <Method Object URLConnection.getContent()>
	//   37   77:astore          5
		}
	//*  38   79:aload           5
	//*  39   81:areturn         
		catch(IOException ioexception)
	//*  40   82:astore          5
		{
			((v) (h1)).b(l);
	//   41   84:aload_1         
	//   42   85:lload_3         
	//   43   86:invokevirtual   #56  <Method v v.b(long)>
	//   44   89:pop             
			((v) (h1)).e(zzbg1.c());
	//   45   90:aload_1         
	//   46   91:aload_2         
	//   47   92:invokevirtual   #59  <Method long zzbg.c()>
	//   48   95:invokevirtual   #62  <Method v v.e(long)>
	//   49   98:pop             
			((v) (h1)).a(al1.toString());
	//   50   99:aload_1         
	//   51  100:aload_0         
	//   52  101:invokevirtual   #66  <Method String al.toString()>
	//   53  104:invokevirtual   #69  <Method v v.a(String)>
	//   54  107:pop             
			h.a(((v) (h1)));
	//   55  108:aload_1         
	//   56  109:invokestatic    #74  <Method void h.a(v)>
			throw ioexception;
	//   57  112:aload           5
	//   58  114:athrow          
		}
		return obj;
	}

	public static Object getContent(URL url)
	{
		return b(new al(url), h.a(), new zzbg());
	//    0    0:new             #28  <Class al>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #92  <Method void al(URL)>
	//    4    8:invokestatic    #97  <Method h h.a()>
	//    5   11:new             #15  <Class zzbg>
	//    6   14:dup             
	//    7   15:invokespecial   #98  <Method void zzbg()>
	//    8   18:invokestatic    #100 <Method Object b(al, h, zzbg)>
	//    9   21:areturn         
	}

	public static Object getContent(URL url, Class aclass[])
	{
		return a(new al(url), aclass, h.a(), new zzbg());
	//    0    0:new             #28  <Class al>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #92  <Method void al(URL)>
	//    4    8:aload_1         
	//    5    9:invokestatic    #97  <Method h h.a()>
	//    6   12:new             #15  <Class zzbg>
	//    7   15:dup             
	//    8   16:invokespecial   #98  <Method void zzbg()>
	//    9   19:invokestatic    #104 <Method Object a(al, Class[], h, zzbg)>
	//   10   22:areturn         
	}

	public static Object instrument(Object obj)
	{
		if(obj instanceof HttpsURLConnection)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #33  <Class HttpsURLConnection>
	//*   2    4:ifeq            32
			return ((Object) (new d((HttpsURLConnection)obj, new zzbg(), v.a(h.a()))));
	//    3    7:new             #35  <Class d>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:checkcast       #33  <Class HttpsURLConnection>
	//    7   15:new             #15  <Class zzbg>
	//    8   18:dup             
	//    9   19:invokespecial   #98  <Method void zzbg()>
	//   10   22:invokestatic    #97  <Method h h.a()>
	//   11   25:invokestatic    #26  <Method v v.a(h)>
	//   12   28:invokespecial   #38  <Method void d(HttpsURLConnection, zzbg, v)>
	//   13   31:areturn         
		if(obj instanceof HttpURLConnection)
	//*  14   32:aload_0         
	//*  15   33:instanceof      #44  <Class HttpURLConnection>
	//*  16   36:ifeq            64
			return ((Object) (new c((HttpURLConnection)obj, new zzbg(), v.a(h.a()))));
	//   17   39:new             #46  <Class c>
	//   18   42:dup             
	//   19   43:aload_0         
	//   20   44:checkcast       #44  <Class HttpURLConnection>
	//   21   47:new             #15  <Class zzbg>
	//   22   50:dup             
	//   23   51:invokespecial   #98  <Method void zzbg()>
	//   24   54:invokestatic    #97  <Method h h.a()>
	//   25   57:invokestatic    #26  <Method v v.a(h)>
	//   26   60:invokespecial   #49  <Method void c(HttpURLConnection, zzbg, v)>
	//   27   63:areturn         
		else
			return obj;
	//   28   64:aload_0         
	//   29   65:areturn         
	}

	public static InputStream openStream(URL url)
	{
		return a(new al(url), h.a(), new zzbg());
	//    0    0:new             #28  <Class al>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #92  <Method void al(URL)>
	//    4    8:invokestatic    #97  <Method h h.a()>
	//    5   11:new             #15  <Class zzbg>
	//    6   14:dup             
	//    7   15:invokespecial   #98  <Method void zzbg()>
	//    8   18:invokestatic    #110 <Method InputStream a(al, h, zzbg)>
	//    9   21:areturn         
	}
}
