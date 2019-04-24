// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.analytics;

import android.content.Context;
import com.comscore.applications.EventType;
import java.util.HashMap;

// Referenced classes of package com.comscore.analytics:
//			comScore, Core

public class Census
{

	private Census()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static Census getInstance()
	{
		if(a == null)
	//*   0    0:getstatic       #22  <Field Census a>
	//*   1    3:ifnonnull       38
			synchronized(c)
	//*   2    6:getstatic       #17  <Field Object c>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(a == null)
	//*   6   12:getstatic       #22  <Field Census a>
	//*   7   15:ifnonnull       28
					a = new Census();
	//    8   18:new             #2   <Class Census>
	//    9   21:dup             
	//   10   22:invokespecial   #23  <Method void Census()>
	//   11   25:putstatic       #22  <Field Census a>
			}
	//   12   28:aload_0         
	//   13   29:monitorexit     
		break MISSING_BLOCK_LABEL_38;
	//   14   30:goto            38
		exception;
	//   15   33:astore_1        
		obj;
	//   16   34:aload_0         
		JVM INSTR monitorexit ;
	//   17   35:monitorexit     
		throw exception;
	//   18   36:aload_1         
	//   19   37:athrow          
		return a;
	//   20   38:getstatic       #22  <Field Census a>
	//   21   41:areturn         
	}

	public void notifyStart(Context context, String s, String s1)
	{
		Core core = comScore.getCore();
	//    0    0:invokestatic    #31  <Method Core comScore.getCore()>
	//    1    3:astore          4
		core.setAppContext(context);
	//    2    5:aload           4
	//    3    7:aload_1         
	//    4    8:invokevirtual   #37  <Method void Core.setAppContext(Context)>
		if(s != null && s.length() > 0)
	//*   5   11:aload_2         
	//*   6   12:ifnull          27
	//*   7   15:aload_2         
	//*   8   16:invokevirtual   #43  <Method int String.length()>
	//*   9   19:ifle            27
			b = s;
	//   10   22:aload_0         
	//   11   23:aload_2         
	//   12   24:putfield        #45  <Field String b>
		if(s1 != null && s1.length() > 0)
	//*  13   27:aload_3         
	//*  14   28:ifnull          45
	//*  15   31:aload_3         
	//*  16   32:invokevirtual   #43  <Method int String.length()>
	//*  17   35:ifle            45
			core.setPublisherSecret(s1, true);
	//   18   38:aload           4
	//   19   40:aload_3         
	//   20   41:iconst_1        
	//   21   42:invokevirtual   #49  <Method void Core.setPublisherSecret(String, boolean)>
		s = ((String) (new HashMap()));
	//   22   45:new             #51  <Class HashMap>
	//   23   48:dup             
	//   24   49:invokespecial   #52  <Method void HashMap()>
	//   25   52:astore_2        
		((HashMap) (s)).put("c2", ((Object) (b)));
	//   26   53:aload_2         
	//   27   54:ldc1            #54  <String "c2">
	//   28   56:aload_0         
	//   29   57:getfield        #45  <Field String b>
	//   30   60:invokevirtual   #58  <Method Object HashMap.put(Object, Object)>
	//   31   63:pop             
		((HashMap) (s)).put("name", "start");
	//   32   64:aload_2         
	//   33   65:ldc1            #60  <String "name">
	//   34   67:ldc1            #62  <String "start">
	//   35   69:invokevirtual   #58  <Method Object HashMap.put(Object, Object)>
	//   36   72:pop             
		if(core.isSecure())
	//*  37   73:aload           4
	//*  38   75:invokevirtual   #66  <Method boolean Core.isSecure()>
	//*  39   78:ifeq            87
			context = "https://sb.scorecardresearch.com/p2?";
	//   40   81:ldc1            #68  <String "https://sb.scorecardresearch.com/p2?">
	//   41   83:astore_1        
		else
	//*  42   84:goto            90
			context = "http://b.scorecardresearch.com/p2?";
	//   43   87:ldc1            #70  <String "http://b.scorecardresearch.com/p2?">
	//   44   89:astore_1        
		core.setPixelURL(((String) (context)), false);
	//   45   90:aload           4
	//   46   92:aload_1         
	//   47   93:iconst_0        
	//   48   94:invokevirtual   #73  <Method void Core.setPixelURL(String, boolean)>
		core.notify(EventType.START, ((HashMap) (s)), true);
	//   49   97:aload           4
	//   50   99:getstatic       #79  <Field EventType EventType.START>
	//   51  102:aload_2         
	//   52  103:iconst_1        
	//   53  104:invokevirtual   #83  <Method void Core.notify(EventType, HashMap, boolean)>
	//   54  107:return          
	}

	private static Census a;
	private static Object c = new Object();
	private String b;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void Object()>
	//    3    7:putstatic       #17  <Field Object c>
	//*   4   10:return          
	}
}
