// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.c.a;
import com.google.android.gms.c.d;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aaj, p, bwk, m, 
//			nl, aah, aig, aag

public final class nk
{

	public nk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	private final void c(Context context)
	{
		Object obj = a;
	//    0    0:getstatic       #22  <Field Object a>
	//    1    3:astore_3        
		obj;
	//    2    4:aload_3         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		boolean flag;
		e e = p.cC;
	//    4    6:getstatic       #36  <Field e p.cC>
	//    5    9:astore          4
		if(!((Boolean)bwk.e().a(e)).booleanValue())
			break MISSING_BLOCK_LABEL_66;
	//    6   11:invokestatic    #42  <Method m bwk.e()>
	//    7   14:aload           4
	//    8   16:invokevirtual   #47  <Method Object com.google.android.gms.internal.ads.m.a(e)>
	//    9   19:checkcast       #49  <Class Boolean>
	//   10   22:invokevirtual   #53  <Method boolean Boolean.booleanValue()>
	//   11   25:ifeq            66
		flag = c;
	//   12   28:getstatic       #26  <Field boolean c>
	//   13   31:istore_2        
		if(flag)
			break MISSING_BLOCK_LABEL_66;
	//   14   32:iload_2         
	//   15   33:ifne            66
		try
		{
			c = true;
	//   16   36:iconst_1        
	//   17   37:putstatic       #26  <Field boolean c>
			d = (aig)com.google.android.gms.internal.ads.aah.a(context, "com.google.android.gms.ads.omid.DynamiteOmid", com.google.android.gms.internal.ads.nl.a);
	//   18   40:aload_0         
	//   19   41:aload_1         
	//   20   42:ldc1            #55  <String "com.google.android.gms.ads.omid.DynamiteOmid">
	//   21   44:getstatic       #60  <Field aai com.google.android.gms.internal.ads.nl.a>
	//   22   47:invokestatic    #65  <Method Object com.google.android.gms.internal.ads.aah.a(Context, String, aai)>
	//   23   50:checkcast       #67  <Class aig>
	//   24   53:putfield        #69  <Field aig d>
			break MISSING_BLOCK_LABEL_66;
	//   25   56:goto            66
		}
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//   26   59:astore_1        
		com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (context)));
	//   27   60:ldc1            #71  <String "#007 Could not call remote method.">
	//   28   62:aload_1         
	//   29   63:invokestatic    #76  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		obj;
	//   30   66:aload_3         
		JVM INSTR monitorexit ;
	//   31   67:monitorexit     
		return;
	//   32   68:return          
		context;
	//   33   69:astore_1        
		obj;
	//   34   70:aload_3         
		JVM INSTR monitorexit ;
	//   35   71:monitorexit     
		throw context;
	//   36   72:aload_1         
	//   37   73:athrow          
	}

	public final a a(String s, WebView webview, String s1, String s2, String s3)
	{
		return a(s, webview, s1, s2, s3, "Google");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:ldc1            #79  <String "Google">
	//    7   10:invokevirtual   #82  <Method a a(String, WebView, String, String, String, String)>
	//    8   13:areturn         
	}

	public final a a(String s, WebView webview, String s1, String s2, String s3, String s4)
	{
		Object obj = a;
	//    0    0:getstatic       #22  <Field Object a>
	//    1    3:astore          7
		obj;
	//    2    5:aload           7
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		e e = p.cC;
	//    4    8:getstatic       #36  <Field e p.cC>
	//    5   11:astore          8
		if(!((Boolean)bwk.e().a(e)).booleanValue() || !b)
	//*   6   13:invokestatic    #42  <Method m bwk.e()>
	//*   7   16:aload           8
	//*   8   18:invokevirtual   #47  <Method Object com.google.android.gms.internal.ads.m.a(e)>
	//*   9   21:checkcast       #49  <Class Boolean>
	//*  10   24:invokevirtual   #53  <Method boolean Boolean.booleanValue()>
	//*  11   27:ifeq            79
	//*  12   30:getstatic       #24  <Field boolean b>
	//*  13   33:ifne            39
			break MISSING_BLOCK_LABEL_79;
	//   14   36:goto            79
		obj;
	//   15   39:aload           7
		JVM INSTR monitorexit ;
	//   16   41:monitorexit     
		s = ((String) (d.a(s, com.google.android.gms.c.d.a(((Object) (webview))), s1, s2, s3, s4)));
	//   17   42:aload_0         
	//   18   43:getfield        #69  <Field aig d>
	//   19   46:aload_1         
	//   20   47:aload_2         
	//   21   48:invokestatic    #91  <Method a d.a(Object)>
	//   22   51:aload_3         
	//   23   52:aload           4
	//   24   54:aload           5
	//   25   56:aload           6
	//   26   58:invokeinterface #94  <Method a com.google.android.gms.internal.ads.aig.a(String, a, String, String, String, String)>
	//   27   63:astore_1        
		return ((a) (s));
	//   28   64:aload_1         
	//   29   65:areturn         
		s;
	//   30   66:astore_1        
		break MISSING_BLOCK_LABEL_71;
	//   31   67:goto            71
		s;
	//   32   70:astore_1        
		com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (s)));
	//   33   71:ldc1            #71  <String "#007 Could not call remote method.">
	//   34   73:aload_1         
	//   35   74:invokestatic    #76  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		return null;
	//   36   77:aconst_null     
	//   37   78:areturn         
		obj;
	//   38   79:aload           7
		JVM INSTR monitorexit ;
	//   39   81:monitorexit     
		return null;
	//   40   82:aconst_null     
	//   41   83:areturn         
_L2:
		obj;
	//   42   84:aload           7
		JVM INSTR monitorexit ;
	//   43   86:monitorexit     
		throw s;
	//   44   87:aload_1         
	//   45   88:athrow          
		s;
	//   46   89:astore_1        
		continue; /* Loop/switch isn't completed */
	//   47   90:goto            84
		s;
	//   48   93:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  49   94:goto            84
	}

	public final void a(a a1)
	{
		Object obj = a;
	//    0    0:getstatic       #22  <Field Object a>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		e e = p.cC;
	//    4    6:getstatic       #36  <Field e p.cC>
	//    5    9:astore_3        
		if(!((Boolean)bwk.e().a(e)).booleanValue() || !b)
	//*   6   10:invokestatic    #42  <Method m bwk.e()>
	//*   7   13:aload_3         
	//*   8   14:invokevirtual   #47  <Method Object com.google.android.gms.internal.ads.m.a(e)>
	//*   9   17:checkcast       #49  <Class Boolean>
	//*  10   20:invokevirtual   #53  <Method boolean Boolean.booleanValue()>
	//*  11   23:ifeq            60
	//*  12   26:getstatic       #24  <Field boolean b>
	//*  13   29:ifne            35
			break MISSING_BLOCK_LABEL_60;
	//   14   32:goto            60
		obj;
	//   15   35:aload_2         
		JVM INSTR monitorexit ;
	//   16   36:monitorexit     
		try
		{
			d.b(a1);
	//   17   37:aload_0         
	//   18   38:getfield        #69  <Field aig d>
	//   19   41:aload_1         
	//   20   42:invokeinterface #97  <Method void aig.b(a)>
			return;
	//   21   47:return          
		}
	//*  22   48:astore_1        
	//*  23   49:goto            53
		// Misplaced declaration of an exception variable
		catch(a a1) { }
	//   24   52:astore_1        
		// Misplaced declaration of an exception variable
		catch(a a1) { }
		com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (a1)));
	//   25   53:ldc1            #71  <String "#007 Could not call remote method.">
	//   26   55:aload_1         
	//   27   56:invokestatic    #76  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		return;
	//   28   59:return          
		obj;
	//   29   60:aload_2         
		JVM INSTR monitorexit ;
	//   30   61:monitorexit     
		return;
	//   31   62:return          
		a1;
	//   32   63:astore_1        
		obj;
	//   33   64:aload_2         
		JVM INSTR monitorexit ;
	//   34   65:monitorexit     
		throw a1;
	//   35   66:aload_1         
	//   36   67:athrow          
	}

	public final void a(a a1, View view)
	{
		Object obj = a;
	//    0    0:getstatic       #22  <Field Object a>
	//    1    3:astore_3        
		obj;
	//    2    4:aload_3         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		e e = p.cC;
	//    4    6:getstatic       #36  <Field e p.cC>
	//    5    9:astore          4
		if(!((Boolean)bwk.e().a(e)).booleanValue() || !b)
	//*   6   11:invokestatic    #42  <Method m bwk.e()>
	//*   7   14:aload           4
	//*   8   16:invokevirtual   #47  <Method Object com.google.android.gms.internal.ads.m.a(e)>
	//*   9   19:checkcast       #49  <Class Boolean>
	//*  10   22:invokevirtual   #53  <Method boolean Boolean.booleanValue()>
	//*  11   25:ifeq            66
	//*  12   28:getstatic       #24  <Field boolean b>
	//*  13   31:ifne            37
			break MISSING_BLOCK_LABEL_66;
	//   14   34:goto            66
		obj;
	//   15   37:aload_3         
		JVM INSTR monitorexit ;
	//   16   38:monitorexit     
		try
		{
			d.a(a1, com.google.android.gms.c.d.a(((Object) (view))));
	//   17   39:aload_0         
	//   18   40:getfield        #69  <Field aig d>
	//   19   43:aload_1         
	//   20   44:aload_2         
	//   21   45:invokestatic    #91  <Method a d.a(Object)>
	//   22   48:invokeinterface #101 <Method void com.google.android.gms.internal.ads.aig.a(a, a)>
			return;
	//   23   53:return          
		}
	//*  24   54:astore_1        
	//*  25   55:goto            59
		// Misplaced declaration of an exception variable
		catch(a a1) { }
	//   26   58:astore_1        
		// Misplaced declaration of an exception variable
		catch(a a1) { }
		com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (a1)));
	//   27   59:ldc1            #71  <String "#007 Could not call remote method.">
	//   28   61:aload_1         
	//   29   62:invokestatic    #76  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		return;
	//   30   65:return          
		obj;
	//   31   66:aload_3         
		JVM INSTR monitorexit ;
	//   32   67:monitorexit     
		return;
	//   33   68:return          
		a1;
	//   34   69:astore_1        
		obj;
	//   35   70:aload_3         
		JVM INSTR monitorexit ;
	//   36   71:monitorexit     
		throw a1;
	//   37   72:aload_1         
	//   38   73:athrow          
	}

	public final boolean a(Context context)
	{
label0:
		{
			synchronized(a)
	//*   0    0:getstatic       #22  <Field Object a>
	//*   1    3:astore_3        
	//*   2    4:aload_3         
	//*   3    5:monitorenter    
			{
				e e = p.cC;
	//    4    6:getstatic       #36  <Field e p.cC>
	//    5    9:astore          4
				if(((Boolean)bwk.e().a(e)).booleanValue())
					break label0;
	//    6   11:invokestatic    #42  <Method m bwk.e()>
	//    7   14:aload           4
	//    8   16:invokevirtual   #47  <Method Object com.google.android.gms.internal.ads.m.a(e)>
	//    9   19:checkcast       #49  <Class Boolean>
	//   10   22:invokevirtual   #53  <Method boolean Boolean.booleanValue()>
	//   11   25:ifne            32
			}
	//   12   28:aload_3         
	//   13   29:monitorexit     
			return false;
	//   14   30:iconst_0        
	//   15   31:ireturn         
		}
		if(!b)
			break MISSING_BLOCK_LABEL_42;
	//   16   32:getstatic       #24  <Field boolean b>
	//   17   35:ifeq            42
		obj;
	//   18   38:aload_3         
		JVM INSTR monitorexit ;
	//   19   39:monitorexit     
		return true;
	//   20   40:iconst_1        
	//   21   41:ireturn         
		boolean flag;
		c(context);
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:invokespecial   #104 <Method void c(Context)>
		flag = d.a(com.google.android.gms.c.d.a(((Object) (context))));
	//   25   47:aload_0         
	//   26   48:getfield        #69  <Field aig d>
	//   27   51:aload_1         
	//   28   52:invokestatic    #91  <Method a d.a(Object)>
	//   29   55:invokeinterface #107 <Method boolean com.google.android.gms.internal.ads.aig.a(a)>
	//   30   60:istore_2        
		b = flag;
	//   31   61:iload_2         
	//   32   62:putstatic       #24  <Field boolean b>
		obj;
	//   33   65:aload_3         
		JVM INSTR monitorexit ;
	//   34   66:monitorexit     
		return flag;
	//   35   67:iload_2         
	//   36   68:ireturn         
_L2:
		com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (context)));
	//   37   69:ldc1            #71  <String "#007 Could not call remote method.">
	//   38   71:aload_1         
	//   39   72:invokestatic    #76  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		obj;
	//   40   75:aload_3         
		JVM INSTR monitorexit ;
	//   41   76:monitorexit     
		return false;
	//   42   77:iconst_0        
	//   43   78:ireturn         
		context;
	//   44   79:astore_1        
		obj;
	//   45   80:aload_3         
		JVM INSTR monitorexit ;
	//   46   81:monitorexit     
		throw context;
	//   47   82:aload_1         
	//   48   83:athrow          
		context;
	//   49   84:astore_1        
		continue; /* Loop/switch isn't completed */
	//   50   85:goto            69
		context;
	//   51   88:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  52   89:goto            69
	}

	public final String b(Context context)
	{
		e e = p.cC;
	//    0    0:getstatic       #36  <Field e p.cC>
	//    1    3:astore_2        
		if(!((Boolean)bwk.e().a(e)).booleanValue())
	//*   2    4:invokestatic    #42  <Method m bwk.e()>
	//*   3    7:aload_2         
	//*   4    8:invokevirtual   #47  <Method Object com.google.android.gms.internal.ads.m.a(e)>
	//*   5   11:checkcast       #49  <Class Boolean>
	//*   6   14:invokevirtual   #53  <Method boolean Boolean.booleanValue()>
	//*   7   17:ifne            22
			return null;
	//    8   20:aconst_null     
	//    9   21:areturn         
		c(context);
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokespecial   #104 <Method void c(Context)>
		context = ((Context) (String.valueOf(((Object) (d.a())))));
	//   13   27:aload_0         
	//   14   28:getfield        #69  <Field aig d>
	//   15   31:invokeinterface #111 <Method String com.google.android.gms.internal.ads.aig.a()>
	//   16   36:invokestatic    #117 <Method String String.valueOf(Object)>
	//   17   39:astore_1        
		if(((String) (context)).length() != 0)
	//*  18   40:aload_1         
	//*  19   41:invokevirtual   #121 <Method int String.length()>
	//*  20   44:ifeq            54
			return "a.".concat(((String) (context)));
	//   21   47:ldc1            #123 <String "a.">
	//   22   49:aload_1         
	//   23   50:invokevirtual   #127 <Method String String.concat(String)>
	//   24   53:areturn         
		context = ((Context) (new String("a.")));
	//   25   54:new             #113 <Class String>
	//   26   57:dup             
	//   27   58:ldc1            #123 <String "a.">
	//   28   60:invokespecial   #130 <Method void String(String)>
	//   29   63:astore_1        
		return ((String) (context));
	//   30   64:aload_1         
	//   31   65:areturn         
		context;
	//   32   66:astore_1        
		break MISSING_BLOCK_LABEL_71;
	//   33   67:goto            71
		context;
	//   34   70:astore_1        
		com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (context)));
	//   35   71:ldc1            #71  <String "#007 Could not call remote method.">
	//   36   73:aload_1         
	//   37   74:invokestatic    #76  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		return null;
	//   38   77:aconst_null     
	//   39   78:areturn         
	}

	public final void b(a a1)
	{
		Object obj = a;
	//    0    0:getstatic       #22  <Field Object a>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		e e = p.cC;
	//    4    6:getstatic       #36  <Field e p.cC>
	//    5    9:astore_3        
		if(!((Boolean)bwk.e().a(e)).booleanValue() || !b)
	//*   6   10:invokestatic    #42  <Method m bwk.e()>
	//*   7   13:aload_3         
	//*   8   14:invokevirtual   #47  <Method Object com.google.android.gms.internal.ads.m.a(e)>
	//*   9   17:checkcast       #49  <Class Boolean>
	//*  10   20:invokevirtual   #53  <Method boolean Boolean.booleanValue()>
	//*  11   23:ifeq            60
	//*  12   26:getstatic       #24  <Field boolean b>
	//*  13   29:ifne            35
			break MISSING_BLOCK_LABEL_60;
	//   14   32:goto            60
		obj;
	//   15   35:aload_2         
		JVM INSTR monitorexit ;
	//   16   36:monitorexit     
		try
		{
			d.c(a1);
	//   17   37:aload_0         
	//   18   38:getfield        #69  <Field aig d>
	//   19   41:aload_1         
	//   20   42:invokeinterface #132 <Method void aig.c(a)>
			return;
	//   21   47:return          
		}
	//*  22   48:astore_1        
	//*  23   49:goto            53
		// Misplaced declaration of an exception variable
		catch(a a1) { }
	//   24   52:astore_1        
		// Misplaced declaration of an exception variable
		catch(a a1) { }
		com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (a1)));
	//   25   53:ldc1            #71  <String "#007 Could not call remote method.">
	//   26   55:aload_1         
	//   27   56:invokestatic    #76  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		return;
	//   28   59:return          
		obj;
	//   29   60:aload_2         
		JVM INSTR monitorexit ;
	//   30   61:monitorexit     
		return;
	//   31   62:return          
		a1;
	//   32   63:astore_1        
		obj;
	//   33   64:aload_2         
		JVM INSTR monitorexit ;
	//   34   65:monitorexit     
		throw a1;
	//   35   66:aload_1         
	//   36   67:athrow          
	}

	private static final Object a = new Object();
	private static boolean b = false;
	private static boolean c = false;
	private aig d;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void Object()>
	//    3    7:putstatic       #22  <Field Object a>
	//    4   10:iconst_0        
	//    5   11:putstatic       #24  <Field boolean b>
	//    6   14:iconst_0        
	//    7   15:putstatic       #26  <Field boolean c>
	//*   8   18:return          
	}
}
