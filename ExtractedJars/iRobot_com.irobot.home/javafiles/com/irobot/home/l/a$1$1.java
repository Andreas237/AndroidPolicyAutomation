// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.l;

import android.accounts.NetworkErrorException;
import com.irobot.core.*;
import com.irobot.home.util.o;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.irobot.home.l:
//			a

class a$1$1
	implements Runnable
{

	public void run()
	{
		if(com.irobot.home.l.a.c(a.a) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field a$1 a>
	//*   2    4:getfield        #25  <Field a a$1.a>
	//*   3    7:invokestatic    #31  <Method RenderPresenter a.c(a)>
	//*   4   10:ifnull          27
		{
			com.irobot.home.l.a.c(a.a).onTranslationEnd();
	//    5   13:aload_0         
	//    6   14:getfield        #17  <Field a$1 a>
	//    7   17:getfield        #25  <Field a a$1.a>
	//    8   20:invokestatic    #31  <Method RenderPresenter a.c(a)>
	//    9   23:invokevirtual   #36  <Method void RenderPresenter.onTranslationEnd()>
			return;
	//   10   26:return          
		} else
		{
			o.e(com.irobot.home.l.a.a(), "mRenderPresenter null in onTouch");
	//   11   27:invokestatic    #39  <Method String a.a()>
	//   12   30:ldc1            #41  <String "mRenderPresenter null in onTouch">
	//   13   32:invokestatic    #47  <Method void o.e(String, String)>
			return;
	//   14   35:return          
		}
	}

	final a._cls1 a;

	a$1$1(a._cls1 _pcls1)
	{
		a = _pcls1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field a$1 a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/irobot/home/o/a$1

/* anonymous class */
	class a._cls1 extends NetworkJsonCallback
	{

		public void onFailure(NetworkResponse networkresponse, Error error)
		{
			networkresponse = ((NetworkResponse) ((String)error.info().get("exception")));
		//    0    0:aload_2         
		//    1    1:invokevirtual   #46  <Method HashMap Error.info()>
		//    2    4:ldc1            #48  <String "exception">
		//    3    6:invokevirtual   #54  <Method Object HashMap.get(Object)>
		//    4    9:checkcast       #56  <Class String>
		//    5   12:astore_1        
			error = ((Error) (error.message()));
		//    6   13:aload_2         
		//    7   14:invokevirtual   #60  <Method String Error.message()>
		//    8   17:astore_2        
			Object obj = Class.forName(((String) (networkresponse))).getConstructor(new Class[] {
				java/lang/String
			}).newInstance(new Object[] {
				error
			});
		//    9   18:aload_1         
		//   10   19:invokestatic    #66  <Method Class Class.forName(String)>
		//   11   22:iconst_1        
		//   12   23:anewarray       Class[]
		//   13   26:dup             
		//   14   27:iconst_0        
		//   15   28:ldc1            #56  <Class String>
		//   16   30:aastore         
		//   17   31:invokevirtual   #70  <Method Constructor Class.getConstructor(Class[])>
		//   18   34:iconst_1        
		//   19   35:anewarray       Object[]
		//   20   38:dup             
		//   21   39:iconst_0        
		//   22   40:aload_2         
		//   23   41:aastore         
		//   24   42:invokevirtual   #78  <Method Object Constructor.newInstance(Object[])>
		//   25   45:astore_3        
			if(obj instanceof Throwable)
		//*  26   46:aload_3         
		//*  27   47:instanceof      #80  <Class Throwable>
		//*  28   50:ifeq            65
				b.add(0, ((Object) ((Throwable)obj)));
		//   29   53:aload_0         
		//   30   54:getfield        #21  <Field ArrayList b>
		//   31   57:iconst_0        
		//   32   58:aload_3         
		//   33   59:checkcast       #80  <Class Throwable>
		//   34   62:invokevirtual   #86  <Method void ArrayList.add(int, Object)>
			synchronized(com.irobot.home.o.a.a(c))
		//*  35   65:aload_0         
		//*  36   66:getfield        #17  <Field a c>
		//*  37   69:invokestatic    #89  <Method Object a.a(a)>
		//*  38   72:astore_1        
		//*  39   73:aload_1         
		//*  40   74:monitorenter    
			{
				com.irobot.home.o.a.a(c).notify();
		//   41   75:aload_0         
		//   42   76:getfield        #17  <Field a c>
		//   43   79:invokestatic    #89  <Method Object a.a(a)>
		//   44   82:invokevirtual   #92  <Method void Object.notify()>
			}
		//   45   85:aload_1         
		//   46   86:monitorexit     
			return;
		//   47   87:return          
			error;
		//   48   88:astore_2        
			networkresponse;
		//   49   89:aload_1         
			JVM INSTR monitorexit ;
		//   50   90:monitorexit     
			throw error;
		//   51   91:aload_2         
		//   52   92:athrow          
			error;
		//   53   93:astore_2        
			  goto _L1
		//*  54   94:goto            168
_L3:
			networkresponse = ((NetworkResponse) (new StringBuilder(((String) (networkresponse)))));
		//   55   97:new             #94  <Class StringBuilder>
		//   56  100:dup             
		//   57  101:aload_1         
		//   58  102:invokespecial   #97  <Method void StringBuilder(String)>
		//   59  105:astore_1        
			((StringBuilder) (networkresponse)).append(": ");
		//   60  106:aload_1         
		//   61  107:ldc1            #99  <String ": ">
		//   62  109:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
		//   63  112:pop             
			((StringBuilder) (networkresponse)).append(((String) (error)));
		//   64  113:aload_1         
		//   65  114:aload_2         
		//   66  115:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
		//   67  118:pop             
			networkresponse = ((NetworkResponse) (((StringBuilder) (networkresponse)).toString()));
		//   68  119:aload_1         
		//   69  120:invokevirtual   #106 <Method String StringBuilder.toString()>
		//   70  123:astore_1        
			b.add(0, ((Object) (new NetworkErrorException(((String) (networkresponse))))));
		//   71  124:aload_0         
		//   72  125:getfield        #21  <Field ArrayList b>
		//   73  128:iconst_0        
		//   74  129:new             #108 <Class NetworkErrorException>
		//   75  132:dup             
		//   76  133:aload_1         
		//   77  134:invokespecial   #109 <Method void NetworkErrorException(String)>
		//   78  137:invokevirtual   #86  <Method void ArrayList.add(int, Object)>
			synchronized(com.irobot.home.o.a.a(c))
		//*  79  140:aload_0         
		//*  80  141:getfield        #17  <Field a c>
		//*  81  144:invokestatic    #89  <Method Object a.a(a)>
		//*  82  147:astore_1        
		//*  83  148:aload_1         
		//*  84  149:monitorenter    
			{
				com.irobot.home.o.a.a(c).notify();
		//   85  150:aload_0         
		//   86  151:getfield        #17  <Field a c>
		//   87  154:invokestatic    #89  <Method Object a.a(a)>
		//   88  157:invokevirtual   #92  <Method void Object.notify()>
			}
		//   89  160:aload_1         
		//   90  161:monitorexit     
			return;
		//   91  162:return          
			error;
		//   92  163:astore_2        
			networkresponse;
		//   93  164:aload_1         
			JVM INSTR monitorexit ;
		//   94  165:monitorexit     
			throw error;
		//   95  166:aload_2         
		//   96  167:athrow          
_L1:
			synchronized(com.irobot.home.o.a.a(c))
		//*  97  168:aload_0         
		//*  98  169:getfield        #17  <Field a c>
		//*  99  172:invokestatic    #89  <Method Object a.a(a)>
		//* 100  175:astore_1        
		//* 101  176:aload_1         
		//* 102  177:monitorenter    
			{
				com.irobot.home.o.a.a(c).notify();
		//  103  178:aload_0         
		//  104  179:getfield        #17  <Field a c>
		//  105  182:invokestatic    #89  <Method Object a.a(a)>
		//  106  185:invokevirtual   #92  <Method void Object.notify()>
			}
		//  107  188:aload_1         
		//  108  189:monitorexit     
			throw error;
		//  109  190:aload_2         
		//  110  191:athrow          
			error;
		//  111  192:astore_2        
			networkresponse;
		//  112  193:aload_1         
			JVM INSTR monitorexit ;
		//  113  194:monitorexit     
			throw error;
		//  114  195:aload_2         
		//  115  196:athrow          
			Object obj1;
			obj1;
		//  116  197:astore_3        
			if(true) goto _L3; else goto _L2
_L2:
		//* 117  198:goto            97
		}

		public void onSuccess(NetworkResponse networkresponse, String s)
		{
			networkresponse = ((NetworkResponse) (a));
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field ArrayList a>
		//    2    4:astore_1        
			if(s == null)
		//*   3    5:aload_2         
		//*   4    6:ifnull          124
		//*   5    9:goto            12
		//*   6   12:aload_1         
		//*   7   13:iconst_0        
		//*   8   14:new             #116 <Class JSONObject>
		//*   9   17:dup             
		//*  10   18:aload_2         
		//*  11   19:invokespecial   #117 <Method void JSONObject(String)>
		//*  12   22:invokevirtual   #86  <Method void ArrayList.add(int, Object)>
		//*  13   25:aload_0         
		//*  14   26:getfield        #17  <Field a c>
		//*  15   29:invokestatic    #89  <Method Object a.a(a)>
		//*  16   32:astore_1        
		//*  17   33:aload_1         
		//*  18   34:monitorenter    
		//*  19   35:aload_0         
		//*  20   36:getfield        #17  <Field a c>
		//*  21   39:invokestatic    #89  <Method Object a.a(a)>
		//*  22   42:invokevirtual   #92  <Method void Object.notify()>
		//*  23   45:aload_1         
		//*  24   46:monitorexit     
		//*  25   47:return          
		//*  26   48:astore_2        
		//*  27   49:aload_1         
		//*  28   50:monitorexit     
		//*  29   51:aload_2         
		//*  30   52:athrow          
		//*  31   53:astore_2        
		//*  32   54:goto            95
		//*  33   57:astore_1        
		//*  34   58:aload_0         
		//*  35   59:getfield        #21  <Field ArrayList b>
		//*  36   62:iconst_0        
		//*  37   63:aload_1         
		//*  38   64:invokevirtual   #86  <Method void ArrayList.add(int, Object)>
		//*  39   67:aload_0         
		//*  40   68:getfield        #17  <Field a c>
		//*  41   71:invokestatic    #89  <Method Object a.a(a)>
		//*  42   74:astore_1        
		//*  43   75:aload_1         
		//*  44   76:monitorenter    
		//*  45   77:aload_0         
		//*  46   78:getfield        #17  <Field a c>
		//*  47   81:invokestatic    #89  <Method Object a.a(a)>
		//*  48   84:invokevirtual   #92  <Method void Object.notify()>
		//*  49   87:aload_1         
		//*  50   88:monitorexit     
		//*  51   89:return          
		//*  52   90:astore_2        
		//*  53   91:aload_1         
		//*  54   92:monitorexit     
		//*  55   93:aload_2         
		//*  56   94:athrow          
		//*  57   95:aload_0         
		//*  58   96:getfield        #17  <Field a c>
		//*  59   99:invokestatic    #89  <Method Object a.a(a)>
		//*  60  102:astore_1        
		//*  61  103:aload_1         
		//*  62  104:monitorenter    
		//*  63  105:aload_0         
		//*  64  106:getfield        #17  <Field a c>
		//*  65  109:invokestatic    #89  <Method Object a.a(a)>
		//*  66  112:invokevirtual   #92  <Method void Object.notify()>
		//*  67  115:aload_1         
		//*  68  116:monitorexit     
		//*  69  117:aload_2         
		//*  70  118:athrow          
		//*  71  119:astore_2        
		//*  72  120:aload_1         
		//*  73  121:monitorexit     
		//*  74  122:aload_2         
		//*  75  123:athrow          
				s = "";
		//   76  124:ldc1            #119 <String "">
		//   77  126:astore_2        
			((ArrayList) (networkresponse)).add(0, ((Object) (new JSONObject(s))));
			synchronized(com.irobot.home.o.a.a(c))
			{
				com.irobot.home.o.a.a(c).notify();
			}
			return;
			s;
			networkresponse;
			JVM INSTR monitorexit ;
			throw s;
			s;
			break MISSING_BLOCK_LABEL_95;
			networkresponse;
			b.add(0, ((Object) (networkresponse)));
			synchronized(com.irobot.home.o.a.a(c))
			{
				com.irobot.home.o.a.a(c).notify();
			}
			return;
			s;
			networkresponse;
			JVM INSTR monitorexit ;
			throw s;
			synchronized(com.irobot.home.o.a.a(c))
			{
				com.irobot.home.o.a.a(c).notify();
			}
			throw s;
			s;
			networkresponse;
			JVM INSTR monitorexit ;
			throw s;
		//*  78  127:goto            12
		}

		final ArrayList a;
		final ArrayList b;
		final a c;

			
			{
				c = a1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field a c>
				a = arraylist;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field ArrayList a>
				b = arraylist1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #21  <Field ArrayList b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #24  <Method void NetworkJsonCallback()>
			//   11   19:return          
			}
	}

}
