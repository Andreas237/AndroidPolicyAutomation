// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import org.json.JSONObject;

// Referenced classes of package o:
//			eq, cg, cp, ib, 
//			de, ie, ey, ei, 
//			id, ic

public final class eu
	implements eq
{

	private eu(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		b = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #27  <Field de b>
		e = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #29  <Field ib e>
		a = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #31  <Field ie a>
		cg cg1 = new cg();
	//   11   19:new             #33  <Class cg>
	//   12   22:dup             
	//   13   23:invokespecial   #34  <Method void cg()>
	//   14   26:astore_3        
		cg1.d(s);
	//   15   27:aload_3         
	//   16   28:aload_2         
	//   17   29:invokevirtual   #37  <Method void cg.d(String)>
		b = ((de) (new cp(context)));
	//   18   32:aload_0         
	//   19   33:new             #39  <Class cp>
	//   20   36:dup             
	//   21   37:aload_1         
	//   22   38:invokespecial   #42  <Method void cp(Context)>
	//   23   41:putfield        #27  <Field de b>
		e = (ib)b.d(o/ib, cg1);
	//   24   44:aload_0         
	//   25   45:aload_0         
	//   26   46:getfield        #27  <Field de b>
	//   27   49:ldc1            #44  <Class ib>
	//   28   51:aload_3         
	//   29   52:invokevirtual   #49  <Method Object de.d(Class, cg)>
	//   30   55:checkcast       #44  <Class ib>
	//   31   58:putfield        #29  <Field ib e>
		a = (ie)b.d(o/ie, cg1);
	//   32   61:aload_0         
	//   33   62:aload_0         
	//   34   63:getfield        #27  <Field de b>
	//   35   66:ldc1            #51  <Class ie>
	//   36   68:aload_3         
	//   37   69:invokevirtual   #49  <Method Object de.d(Class, cg)>
	//   38   72:checkcast       #51  <Class ie>
	//   39   75:putfield        #31  <Field ie a>
	//   40   78:return          
	}

	public static eu a(Context context, String s)
	{
		o/eu;
	//    0    0:ldc1            #2   <Class eu>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(c == null)
	//*   2    3:getstatic       #20  <Field eu c>
	//*   3    6:ifnonnull       21
			c = new eu(context, s);
	//    4    9:new             #2   <Class eu>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokespecial   #54  <Method void eu(Context, String)>
	//    9   18:putstatic       #20  <Field eu c>
		context = ((Context) (c));
	//   10   21:getstatic       #20  <Field eu c>
	//   11   24:astore_0        
		o/eu;
	//   12   25:ldc1            #2   <Class eu>
		JVM INSTR monitorexit ;
	//   13   27:monitorexit     
		return ((eu) (context));
	//   14   28:aload_0         
	//   15   29:areturn         
		context;
	//   16   30:astore_0        
	//*  17   31:ldc1            #2   <Class eu>
		throw context;
	//   18   33:monitorexit     
	//   19   34:aload_0         
	//   20   35:athrow          
	}

	static ie b(eu eu1)
	{
		return eu1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ie a>
	//    2    4:areturn         
	}

	static id c()
	{
		return d;
	//    0    0:getstatic       #58  <Field id d>
	//    1    3:areturn         
	}

	static id d(id id)
	{
		d = id;
	//    0    0:aload_0         
	//    1    1:putstatic       #58  <Field id d>
		return id;
	//    2    4:aload_0         
	//    3    5:areturn         
	}

	public final id a(ic ic)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field ie a>
	//*   2    4:ifnull          57
		{
			d = null;
	//    3    7:aconst_null     
	//    4    8:putstatic       #58  <Field id d>
			(new Thread(((Runnable) (new ey(this, ic))))).start();
	//    5   11:new             #62  <Class Thread>
	//    6   14:dup             
	//    7   15:new             #64  <Class ey>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokespecial   #67  <Method void ey(eu, ic)>
	//   12   24:invokespecial   #70  <Method void Thread(Runnable)>
	//   13   27:invokevirtual   #73  <Method void Thread.start()>
			for(int i = 0x493e0; d == null && i >= 0; i -= 50)
	//*  14   30:ldc1            #74  <Int 0x493e0>
	//*  15   32:istore_2        
	//*  16   33:getstatic       #58  <Field id d>
	//*  17   36:ifnonnull       57
	//*  18   39:iload_2         
	//*  19   40:iflt            57
				Thread.sleep(50L);
	//   20   43:ldc2w           #75  <Long 50L>
	//   21   46:invokestatic    #80  <Method void Thread.sleep(long)>

	//   22   49:iload_2         
	//   23   50:bipush          50
	//   24   52:isub            
	//   25   53:istore_2        
		}
	//*  26   54:goto            33
		return d;
	//   27   57:getstatic       #58  <Field id d>
	//   28   60:areturn         
	}

	public final boolean d(String s)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(ei.b(s))
	//*   2    2:aload_1         
	//*   3    3:invokestatic    #87  <Method boolean ei.b(String)>
	//*   4    6:ifeq            11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		boolean flag = flag1;
	//    7   11:iload_3         
	//    8   12:istore_2        
		if(e != null)
	//*   9   13:aload_0         
	//*  10   14:getfield        #29  <Field ib e>
	//*  11   17:ifnull          66
		{
			Object obj = null;
	//   12   20:aconst_null     
	//   13   21:astore          4
			try
			{
				s = e.b(ei.f(s));
	//   14   23:aload_0         
	//   15   24:getfield        #29  <Field ib e>
	//   16   27:aload_1         
	//   17   28:invokestatic    #91  <Method String ei.f(String)>
	//   18   31:invokeinterface #93  <Method String ib.b(String)>
	//   19   36:astore_1        
			}
	//*  20   37:iload_3         
	//*  21   38:istore_2        
	//*  22   39:aload_1         
	//*  23   40:invokestatic    #87  <Method boolean ei.b(String)>
	//*  24   43:ifne            66
	//*  25   46:new             #95  <Class JSONObject>
	//*  26   49:dup             
	//*  27   50:aload_1         
	//*  28   51:invokespecial   #97  <Method void JSONObject(String)>
	//*  29   54:ldc1            #99  <String "success">
	//*  30   56:invokevirtual   #103 <Method Object JSONObject.get(String)>
	//*  31   59:checkcast       #105 <Class Boolean>
	//*  32   62:invokevirtual   #109 <Method boolean Boolean.booleanValue()>
	//*  33   65:istore_2        
	//*  34   66:iload_2         
	//*  35   67:ireturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  36   68:astore_1        
			{
				s = ((String) (obj));
	//   37   69:aload           4
	//   38   71:astore_1        
			}
			flag = flag1;
			if(!ei.b(s))
				flag = ((Boolean)(new JSONObject(s)).get("success")).booleanValue();
		}
		return flag;
	//*  39   72:goto            37
	}

	private static eu c = null;
	private static id d;
	private ie a;
	private de b;
	private ib e;

	static 
	{
	//    0    0:aconst_null     
	//    1    1:putstatic       #20  <Field eu c>
	//*   2    4:return          
	}
}
