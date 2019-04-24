// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.amazonaws.auth.AWS4Signer;
import com.gigya.socialize.GSObject;
import com.gigya.socialize.GSResponse;
import com.gigya.socialize.GSResponseListener;
import com.irobot.awsservices.c.c;
import com.irobot.core.AccountSessionDelegate;
import com.irobot.core.AccountUtils;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.Assembler;
import com.irobot.core.AssetCapabilityUtils;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;
import com.irobot.core.Error;
import com.irobot.core.FeatureType;
import com.irobot.core.FloorPlanListItem;
import com.irobot.core.GigyaConst;
import com.irobot.core.MapsUIService;
import com.irobot.core.MapsUIServiceCommand;
import com.irobot.core.MapsUIServiceData;
import com.irobot.core.NetworkJsonCallback;
import com.irobot.core.NetworkResponse;
import com.irobot.core.PersistentMapsDestination;
import com.irobot.core.ViewId;
import com.irobot.home.b.l;
import com.irobot.home.b.m;
import com.irobot.home.fragments.f;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.EmptySupportedRecyclerView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.irobot.home:
//			b, TrainRobotActivity_, a

public class com.irobot.home.a extends f
	implements com.irobot.home.b.l.a
{
	private class a extends AWS4Signer
	{

		public long a()
		{
			int i1 = com.irobot.awsservices.c.c.a().b();
		//    0    0:invokestatic    #21  <Method c c.a()>
		//    1    3:invokevirtual   #25  <Method int c.b()>
		//    2    6:istore_1        
			return (new Date()).getTime() - (long)(i1 * 1000);
		//    3    7:new             #27  <Class Date>
		//    4   10:dup             
		//    5   11:invokespecial   #28  <Method void Date()>
		//    6   14:invokevirtual   #31  <Method long Date.getTime()>
		//    7   17:iload_1         
		//    8   18:sipush          1000
		//    9   21:imul            
		//   10   22:i2l             
		//   11   23:lsub            
		//   12   24:lreturn         
		}

		public String c(long l1)
		{
			return super.a(l1);
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:invokespecial   #35  <Method String AWS4Signer.a(long)>
		//    3    5:areturn         
		}

		public String d(long l1)
		{
			return b(l1);
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:invokevirtual   #38  <Method String b(long)>
		//    3    5:areturn         
		}

		public a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void AWS4Signer()>
		//    2    4:return          
		}

		public a(boolean flag)
		{
			super(flag);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #15  <Method void AWS4Signer(boolean)>
		//    3    5:return          
		}
	}


	public com.irobot.home.a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void f()>
		i = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #54  <Field MapsUIService i>
	//    5    9:return          
	}

	public static com.irobot.home.a a(String s)
	{
		com.irobot.home.a a1 = com.irobot.home.b.e().a();
	//    0    0:invokestatic    #60  <Method b$a b.e()>
	//    1    3:invokevirtual   #65  <Method a b$a.a()>
	//    2    6:astore_1        
		a1.k = s;
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:putfield        #67  <Field String k>
		return a1;
	//    6   12:aload_1         
	//    7   13:areturn         
	}

	static l a(com.irobot.home.a a1)
	{
		return a1.l;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field l l>
	//    2    4:areturn         
	}

	static void a(com.irobot.home.a a1, ArrayList arraylist, int i1)
	{
		a1.a(arraylist, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #74  <Method void a(ArrayList, int)>
	//    4    6:return          
	}

	private void a(ArrayList arraylist, int i1)
	{
		o = arraylist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #76  <Field ArrayList o>
		l.a(o);
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field l l>
	//    5    9:aload_0         
	//    6   10:getfield        #76  <Field ArrayList o>
	//    7   13:invokevirtual   #81  <Method void l.a(ArrayList)>
		e.setVisibility(8);
	//    8   16:aload_0         
	//    9   17:getfield        #83  <Field ProgressBar e>
	//   10   20:bipush          8
	//   11   22:invokevirtual   #89  <Method void ProgressBar.setVisibility(int)>
	//   12   25:return          
	}

	static MapsUIService b(com.irobot.home.a a1)
	{
		return a1.i;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field MapsUIService i>
	//    2    4:areturn         
	}

	static ArrayList c(com.irobot.home.a a1)
	{
		return a1.o;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field ArrayList o>
	//    2    4:areturn         
	}

	static String d()
	{
		return f;
	//    0    0:getstatic       #96  <Field String f>
	//    1    3:areturn         
	}

	static void d(com.irobot.home.a a1)
	{
		a1.e();
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method void e()>
	//    2    4:return          
	}

	private void e()
	{
		e.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field ProgressBar e>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #89  <Method void ProgressBar.setVisibility(int)>
		a.m(((android.view.View) (c)));
	//    4    9:aload_0         
	//    5   10:getfield        #101 <Field EmptySupportedRecyclerView a>
	//    6   13:aload_0         
	//    7   14:getfield        #103 <Field ImageView c>
	//    8   17:invokevirtual   #108 <Method void EmptySupportedRecyclerView.m(android.view.View)>
		a.m(((android.view.View) (b)));
	//    9   20:aload_0         
	//   10   21:getfield        #101 <Field EmptySupportedRecyclerView a>
	//   11   24:aload_0         
	//   12   25:getfield        #110 <Field TextView b>
	//   13   28:invokevirtual   #108 <Method void EmptySupportedRecyclerView.m(android.view.View)>
		d.setVisibility(8);
	//   14   31:aload_0         
	//   15   32:getfield        #112 <Field TextView d>
	//   16   35:bipush          8
	//   17   37:invokevirtual   #115 <Method void TextView.setVisibility(int)>
	//   18   40:return          
	}

	protected void a()
	{
		m = ((android.support.v7.widget.RecyclerView.h) (new LinearLayoutManager(((Context) (getActivity())))));
	//    0    0:aload_0         
	//    1    1:new             #117 <Class LinearLayoutManager>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #121 <Method android.support.v4.app.FragmentActivity getActivity()>
	//    5    9:invokespecial   #124 <Method void LinearLayoutManager(Context)>
	//    6   12:putfield        #126 <Field android.support.v7.widget.RecyclerView$h m>
		a.setLayoutManager(m);
	//    7   15:aload_0         
	//    8   16:getfield        #101 <Field EmptySupportedRecyclerView a>
	//    9   19:aload_0         
	//   10   20:getfield        #126 <Field android.support.v7.widget.RecyclerView$h m>
	//   11   23:invokevirtual   #130 <Method void EmptySupportedRecyclerView.setLayoutManager(android.support.v7.widget.RecyclerView$h)>
		l = new l(((Context) (getActivity())));
	//   12   26:aload_0         
	//   13   27:new             #78  <Class l>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:invokevirtual   #121 <Method android.support.v4.app.FragmentActivity getActivity()>
	//   17   35:invokespecial   #131 <Method void l(Context)>
	//   18   38:putfield        #70  <Field l l>
		a.setAdapter(((android.support.v7.widget.RecyclerView.a) (l)));
	//   19   41:aload_0         
	//   20   42:getfield        #101 <Field EmptySupportedRecyclerView a>
	//   21   45:aload_0         
	//   22   46:getfield        #70  <Field l l>
	//   23   49:invokevirtual   #135 <Method void EmptySupportedRecyclerView.setAdapter(android.support.v7.widget.RecyclerView$a)>
		l.a(((android.support.v7.widget.RecyclerView.c) (new NetworkJsonCallback(this) {

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
			final com.irobot.home.o.a c;

			
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
)));
	//   24   52:aload_0         
	//   25   53:getfield        #70  <Field l l>
	//   26   56:new             #8   <Class a$1>
	//   27   59:dup             
	//   28   60:aload_0         
	//   29   61:invokespecial   #137 <Method void a$1(a)>
	//   30   64:invokevirtual   #140 <Method void l.a(android.support.v7.widget.RecyclerView$c)>
		l.a(((com.irobot.home.b.l.a) (this)));
	//   31   67:aload_0         
	//   32   68:getfield        #70  <Field l l>
	//   33   71:aload_0         
	//   34   72:invokevirtual   #143 <Method void l.a(com.irobot.home.b.l$a)>
		AssetInfo assetinfo = com.irobot.home.util.j.j().a();
	//   35   75:invokestatic    #148 <Method com.irobot.home.model.a j.j()>
	//   36   78:invokevirtual   #153 <Method AssetInfo com.irobot.home.model.a.a()>
	//   37   81:astore_1        
		b.setText(((CharSequence) (getString(0x7f0f0645, new Object[] {
			assetinfo.getName()
		}))));
	//   38   82:aload_0         
	//   39   83:getfield        #110 <Field TextView b>
	//   40   86:aload_0         
	//   41   87:ldc1            #154 <Int 0x7f0f0645>
	//   42   89:iconst_1        
	//   43   90:anewarray       Object[]
	//   44   93:dup             
	//   45   94:iconst_0        
	//   46   95:aload_1         
	//   47   96:invokevirtual   #161 <Method String AssetInfo.getName()>
	//   48   99:aastore         
	//   49  100:invokevirtual   #165 <Method String getString(int, Object[])>
	//   50  103:invokevirtual   #169 <Method void TextView.setText(CharSequence)>
		d.setText(((CharSequence) (getString(0x7f0f0646, new Object[] {
			assetinfo.getName()
		}))));
	//   51  106:aload_0         
	//   52  107:getfield        #112 <Field TextView d>
	//   53  110:aload_0         
	//   54  111:ldc1            #170 <Int 0x7f0f0646>
	//   55  113:iconst_1        
	//   56  114:anewarray       Object[]
	//   57  117:dup             
	//   58  118:iconst_0        
	//   59  119:aload_1         
	//   60  120:invokevirtual   #161 <Method String AssetInfo.getName()>
	//   61  123:aastore         
	//   62  124:invokevirtual   #165 <Method String getString(int, Object[])>
	//   63  127:invokevirtual   #169 <Method void TextView.setText(CharSequence)>
		p = ((m) (new m(((Context) (getActivity())), ((RecyclerView) (a))) {

			public void a(android.support.v7.widget.RecyclerView.u u, ArrayList arraylist)
			{
				arraylist.add(((Object) ((new com.irobot.home.view.RevealableView.a(((Context) (a.getActivity())))).a(0x7f0600a1).b(0x7f08012c).a(new com.irobot.home.view.RevealableView.b(this) {

					public void a(int i1)
					{
						FloorPlanListItem floorplanlistitem = com.irobot.home.a.a(a.a).e(i1);
					//    0    0:aload_0         
					//    1    1:getfield        #16  <Field a$2 a>
					//    2    4:getfield        #24  <Field a a$2.a>
					//    3    7:invokestatic    #29  <Method l a.a(a)>
					//    4   10:iload_1         
					//    5   11:invokevirtual   #35  <Method FloorPlanListItem l.e(int)>
					//    6   14:astore_2        
						MapsUIServiceData mapsuiservicedata = MapsUIServiceData.create();
					//    7   15:invokestatic    #41  <Method MapsUIServiceData MapsUIServiceData.create()>
					//    8   18:astore_3        
						mapsuiservicedata.setFloorPlanListMapId(floorplanlistitem.getMapIdString());
					//    9   19:aload_3         
					//   10   20:aload_2         
					//   11   21:invokevirtual   #47  <Method String FloorPlanListItem.getMapIdString()>
					//   12   24:invokevirtual   #51  <Method void MapsUIServiceData.setFloorPlanListMapId(String)>
						mapsuiservicedata.setFloorPlanListMapVersionId(floorplanlistitem.getMapVersion());
					//   13   27:aload_3         
					//   14   28:aload_2         
					//   15   29:invokevirtual   #54  <Method String FloorPlanListItem.getMapVersion()>
					//   16   32:invokevirtual   #57  <Method void MapsUIServiceData.setFloorPlanListMapVersionId(String)>
						com.irobot.home.a.b(a.a).sendCommand(MapsUIServiceCommand.DeleteFloorPlanListItem, mapsuiservicedata);
					//   17   35:aload_0         
					//   18   36:getfield        #16  <Field a$2 a>
					//   19   39:getfield        #24  <Field a a$2.a>
					//   20   42:invokestatic    #61  <Method MapsUIService a.b(a)>
					//   21   45:getstatic       #67  <Field MapsUIServiceCommand MapsUIServiceCommand.DeleteFloorPlanListItem>
					//   22   48:aload_3         
					//   23   49:invokevirtual   #73  <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
						com.irobot.home.a.c(a.a).remove(((Object) (floorplanlistitem)));
					//   24   52:aload_0         
					//   25   53:getfield        #16  <Field a$2 a>
					//   26   56:getfield        #24  <Field a a$2.a>
					//   27   59:invokestatic    #77  <Method ArrayList com.irobot.home.a.c(a)>
					//   28   62:aload_2         
					//   29   63:invokevirtual   #83  <Method boolean ArrayList.remove(Object)>
					//   30   66:pop             
						com.irobot.home.a.a(a.a).a(com.irobot.home.a.c(a.a));
					//   31   67:aload_0         
					//   32   68:getfield        #16  <Field a$2 a>
					//   33   71:getfield        #24  <Field a a$2.a>
					//   34   74:invokestatic    #29  <Method l a.a(a)>
					//   35   77:aload_0         
					//   36   78:getfield        #16  <Field a$2 a>
					//   37   81:getfield        #24  <Field a a$2.a>
					//   38   84:invokestatic    #77  <Method ArrayList com.irobot.home.a.c(a)>
					//   39   87:invokevirtual   #86  <Method void l.a(ArrayList)>
						com.irobot.home.a.a(a.a).d(i1);
					//   40   90:aload_0         
					//   41   91:getfield        #16  <Field a$2 a>
					//   42   94:getfield        #24  <Field a a$2.a>
					//   43   97:invokestatic    #29  <Method l a.a(a)>
					//   44  100:iload_1         
					//   45  101:invokevirtual   #89  <Method void l.d(int)>
					//   46  104:return          
					}

					final _cls2 a;

			
			{
				a = _pcls2;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field a$2 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
).a())));
			//    0    0:aload_2         
			//    1    1:new             #23  <Class com.irobot.home.view.RevealableView$a>
			//    2    4:dup             
			//    3    5:aload_0         
			//    4    6:getfield        #16  <Field a a>
			//    5    9:invokevirtual   #27  <Method android.support.v4.app.FragmentActivity a.getActivity()>
			//    6   12:invokespecial   #30  <Method void com.irobot.home.view.RevealableView$a(Context)>
			//    7   15:ldc1            #31  <Int 0x7f0600a1>
			//    8   17:invokevirtual   #34  <Method com.irobot.home.view.RevealableView$a com.irobot.home.view.RevealableView$a.a(int)>
			//    9   20:ldc1            #35  <Int 0x7f08012c>
			//   10   22:invokevirtual   #38  <Method com.irobot.home.view.RevealableView$a com.irobot.home.view.RevealableView$a.b(int)>
			//   11   25:new             #11  <Class a$2$1>
			//   12   28:dup             
			//   13   29:aload_0         
			//   14   30:invokespecial   #41  <Method void a$2$1(a$2)>
			//   15   33:invokevirtual   #44  <Method com.irobot.home.view.RevealableView$a com.irobot.home.view.RevealableView$a.a(com.irobot.home.view.RevealableView$b)>
			//   16   36:invokevirtual   #47  <Method com.irobot.home.view.RevealableView com.irobot.home.view.RevealableView$a.a()>
			//   17   39:invokevirtual   #53  <Method boolean ArrayList.add(Object)>
			//   18   42:pop             
			//   19   43:return          
			}

			final com.irobot.home.a a;

			
			{
				a = com.irobot.home.a.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field a a>
				super(context, recyclerview);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:aload_3         
			//    6    8:invokespecial   #19  <Method void m(Context, RecyclerView)>
			//    7   11:return          
			}
		}
));
	//   64  130:aload_0         
	//   65  131:new             #10  <Class a$2>
	//   66  134:dup             
	//   67  135:aload_0         
	//   68  136:aload_0         
	//   69  137:invokevirtual   #121 <Method android.support.v4.app.FragmentActivity getActivity()>
	//   70  140:aload_0         
	//   71  141:getfield        #101 <Field EmptySupportedRecyclerView a>
	//   72  144:invokespecial   #173 <Method void a$2(a, Context, RecyclerView)>
	//   73  147:putfield        #175 <Field m p>
		n = new android.support.v7.widget.a.a(((android.support.v7.widget.a.a) (p)));
	//   74  150:aload_0         
	//   75  151:new             #177 <Class android.support.v7.widget.a.a>
	//   76  154:dup             
	//   77  155:aload_0         
	//   78  156:getfield        #175 <Field m p>
	//   79  159:invokespecial   #180 <Method void android.support.v7.widget.a.a(android.support.v7.widget.a.a$a)>
	//   80  162:putfield        #182 <Field android.support.v7.widget.a.a n>
		n.a(((RecyclerView) (a)));
	//   81  165:aload_0         
	//   82  166:getfield        #182 <Field android.support.v7.widget.a.a n>
	//   83  169:aload_0         
	//   84  170:getfield        #101 <Field EmptySupportedRecyclerView a>
	//   85  173:invokevirtual   #185 <Method void android.support.v7.widget.a.a.a(RecyclerView)>
	//   86  176:return          
	}

	public void a(FloorPlanListItem floorplanlistitem, int i1)
	{
		MapsUIServiceData mapsuiservicedata = MapsUIServiceData.create();
	//    0    0:invokestatic    #192 <Method MapsUIServiceData MapsUIServiceData.create()>
	//    1    3:astore_3        
		mapsuiservicedata.setFloorPlanSelectionListItem(floorplanlistitem, i1);
	//    2    4:aload_3         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #195 <Method void MapsUIServiceData.setFloorPlanSelectionListItem(FloorPlanListItem, int)>
		mapsuiservicedata.setFloorPlanMapsDestination(PersistentMapsDestination.MapCustomizaton);
	//    6   10:aload_3         
	//    7   11:getstatic       #201 <Field PersistentMapsDestination PersistentMapsDestination.MapCustomizaton>
	//    8   14:invokevirtual   #205 <Method void MapsUIServiceData.setFloorPlanMapsDestination(PersistentMapsDestination)>
		i.sendCommand(MapsUIServiceCommand.PerformNavigation, mapsuiservicedata);
	//    9   17:aload_0         
	//   10   18:getfield        #54  <Field MapsUIService i>
	//   11   21:getstatic       #211 <Field MapsUIServiceCommand MapsUIServiceCommand.PerformNavigation>
	//   12   24:aload_3         
	//   13   25:invokevirtual   #217 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
	//   14   28:return          
	}

	protected void b()
	{
		AnalyticsSubsystem.getInstance().trackPMapSectionMapListCleanButtonPressed(com.irobot.home.util.j.j().a());
	//    0    0:invokestatic    #223 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    1    3:invokestatic    #148 <Method com.irobot.home.model.a j.j()>
	//    2    6:invokevirtual   #153 <Method AssetInfo com.irobot.home.model.a.a()>
	//    3    9:invokevirtual   #227 <Method void AnalyticsSubsystem.trackPMapSectionMapListCleanButtonPressed(AssetInfo)>
		g();
	//    4   12:aload_0         
	//    5   13:invokevirtual   #230 <Method void g()>
	//    6   16:return          
	}

	void c()
	{
		AssetInfo assetinfo = com.irobot.home.util.j.j().a();
	//    0    0:invokestatic    #148 <Method com.irobot.home.model.a j.j()>
	//    1    3:invokevirtual   #153 <Method AssetInfo com.irobot.home.model.a.a()>
	//    2    6:astore_2        
		boolean flag;
		if(AssetCapabilityUtils.isCloudCapable(assetinfo) && AssetCapabilityUtils.isMoppingRobot(assetinfo))
	//*   3    7:aload_2         
	//*   4    8:invokestatic    #236 <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//*   5   11:ifeq            26
	//*   6   14:aload_2         
	//*   7   15:invokestatic    #239 <Method boolean AssetCapabilityUtils.isMoppingRobot(AssetInfo)>
	//*   8   18:ifeq            26
			flag = true;
	//    9   21:iconst_1        
	//   10   22:istore_1        
		else
	//*  11   23:goto            28
			flag = false;
	//   12   26:iconst_0        
	//   13   27:istore_1        
		AnalyticsSubsystem.getInstance().trackPMapSectionMapListTrainButtonPressed(assetinfo);
	//   14   28:invokestatic    #223 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   15   31:aload_2         
	//   16   32:invokevirtual   #242 <Method void AnalyticsSubsystem.trackPMapSectionMapListTrainButtonPressed(AssetInfo)>
		if(!flag)
	//*  17   35:iload_1         
	//*  18   36:ifne            44
		{
			f();
	//   19   39:aload_0         
	//   20   40:invokevirtual   #244 <Method void f()>
			return;
	//   21   43:return          
		} else
		{
			startActivity(new Intent(((Context) (getActivity())), com/irobot/home/TrainRobotActivity_));
	//   22   44:aload_0         
	//   23   45:new             #246 <Class Intent>
	//   24   48:dup             
	//   25   49:aload_0         
	//   26   50:invokevirtual   #121 <Method android.support.v4.app.FragmentActivity getActivity()>
	//   27   53:ldc1            #248 <Class TrainRobotActivity_>
	//   28   55:invokespecial   #251 <Method void Intent(Context, Class)>
	//   29   58:invokevirtual   #255 <Method void startActivity(Intent)>
			return;
	//   30   61:return          
		}
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #259 <Method void f.onCreate(Bundle)>
		if(i == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #54  <Field MapsUIService i>
	//*   5    9:ifnonnull       44
		{
			bundle = ((Bundle) (AssetId.assetIdForString(k)));
	//    6   12:aload_0         
	//    7   13:getfield        #67  <Field String k>
	//    8   16:invokestatic    #265 <Method AssetId AssetId.assetIdForString(String)>
	//    9   19:astore_1        
			i = Assembler.getInstance().getMapsUIService(((AssetId) (bundle)));
	//   10   20:aload_0         
	//   11   21:invokestatic    #270 <Method Assembler Assembler.getInstance()>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #274 <Method MapsUIService Assembler.getMapsUIService(AssetId)>
	//   14   28:putfield        #54  <Field MapsUIService i>
			j = new a(this);
	//   15   31:aload_0         
	//   16   32:new             #18  <Class a$a>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:aconst_null     
	//   20   38:invokespecial   #277 <Method void a$a(a, a$1)>
	//   21   41:putfield        #279 <Field a$a j>
		}
	//   22   44:return          
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #282 <Method void f.onPause()>
		i.unregisterSubscriber(((com.irobot.core.MapsUIServiceDataCallback) (j)));
	//    2    4:aload_0         
	//    3    5:getfield        #54  <Field MapsUIService i>
	//    4    8:aload_0         
	//    5    9:getfield        #279 <Field a$a j>
	//    6   12:invokevirtual   #286 <Method boolean MapsUIService.unregisterSubscriber(com.irobot.core.MapsUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #289 <Method void f.onResume()>
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.PMapsList, com.irobot.home.util.j.j().a());
	//    2    4:invokestatic    #223 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    3    7:getstatic       #295 <Field ViewId ViewId.PMapsList>
	//    4   10:invokestatic    #148 <Method com.irobot.home.model.a j.j()>
	//    5   13:invokevirtual   #153 <Method AssetInfo com.irobot.home.model.a.a()>
	//    6   16:invokevirtual   #299 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
		i.registerUISubscriber(((com.irobot.core.MapsUIServiceDataCallback) (j)));
	//    7   19:aload_0         
	//    8   20:getfield        #54  <Field MapsUIService i>
	//    9   23:aload_0         
	//   10   24:getfield        #279 <Field a$a j>
	//   11   27:invokevirtual   #302 <Method boolean MapsUIService.registerUISubscriber(com.irobot.core.MapsUIServiceDataCallback)>
	//   12   30:pop             
		com.irobot.home.a.a a1 = new a(this) {

			public void a(HashSet hashset, boolean flag)
			{
				if(flag)
			//*   0    0:iload_2         
			//*   1    1:ifeq            15
					com.irobot.home.a.a.a(a).onSupportedBetaFeaturesUpdated(hashset);
			//    2    4:aload_0         
			//    3    5:getfield        #17  <Field a a>
			//    4    8:invokestatic    #24  <Method AccountSessionDelegate a.a(a)>
			//    5   11:aload_1         
			//    6   12:invokevirtual   #30  <Method void AccountSessionDelegate.onSupportedBetaFeaturesUpdated(HashSet)>
			//    7   15:return          
			}

			final com.irobot.home.a.a a;

			
			{
				a = a1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field a a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   13   31:new             #14  <Class a$3>
	//   14   34:dup             
	//   15   35:aload_0         
	//   16   36:invokespecial   #303 <Method void a$3(a)>
	//   17   39:astore_1        
		MapsUIServiceData mapsuiservicedata = MapsUIServiceData.create();
	//   18   40:invokestatic    #192 <Method MapsUIServiceData MapsUIServiceData.create()>
	//   19   43:astore_2        
		mapsuiservicedata.setFloorPlanListItemMode(((HashSet) (a1)));
	//   20   44:aload_2         
	//   21   45:aload_1         
	//   22   46:invokevirtual   #307 <Method void MapsUIServiceData.setFloorPlanListItemMode(HashSet)>
		i.sendCommand(MapsUIServiceCommand.SetFloorListItemModes, mapsuiservicedata);
	//   23   49:aload_0         
	//   24   50:getfield        #54  <Field MapsUIService i>
	//   25   53:getstatic       #310 <Field MapsUIServiceCommand MapsUIServiceCommand.SetFloorListItemModes>
	//   26   56:aload_2         
	//   27   57:invokevirtual   #217 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
	//   28   60:return          
	}

	private static final String f = "a";
	EmptySupportedRecyclerView a;
	TextView b;
	ImageView c;
	TextView d;
	ProgressBar e;
	private MapsUIService i;
	private a j;
	private String k;
	private l l;
	private android.support.v7.widget.RecyclerView.h m;
	private android.support.v7.widget.a.a n;
	private ArrayList o;
	private m p;

	static 
	{
	//    0    0:return          
	}

	// Unreferenced inner class com/irobot/home/a/a$4

/* anonymous class */
	static class _cls4
		implements GSResponseListener
	{

		public void onGSResponse(String s, GSResponse gsresponse, Object obj)
		{
			obj = ((Object) (new HashSet()));
		//    0    0:new             #28  <Class HashSet>
		//    1    3:dup             
		//    2    4:invokespecial   #29  <Method void HashSet()>
		//    3    7:astore_3        
			boolean flag;
			if(gsresponse != null && gsresponse.getErrorCode() == 0)
		//*   4    8:aload_2         
		//*   5    9:ifnull          25
		//*   6   12:aload_2         
		//*   7   13:invokevirtual   #35  <Method int GSResponse.getErrorCode()>
		//*   8   16:ifne            25
				flag = true;
		//    9   19:iconst_1        
		//   10   20:istore          4
			else
		//*  11   22:goto            28
				flag = false;
		//   12   25:iconst_0        
		//   13   26:istore          4
			if(flag)
		//*  14   28:iload           4
		//*  15   30:ifeq            158
			{
				com.irobot.home.util.o.b(com.irobot.home.a.a.b(), "Account schema fetched successfully.");
		//   16   33:invokestatic    #38  <Method String a.b()>
		//   17   36:ldc1            #40  <String "Account schema fetched successfully.">
		//   18   38:invokestatic    #45  <Method void o.b(String, String)>
				s = ((String) (Arrays.asList(((Object []) (gsresponse.getData().getObject("dataSchema", ((GSObject) (null))).getObject("fields", ((GSObject) (null))).getKeys())))));
		//   19   41:aload_2         
		//   20   42:invokevirtual   #49  <Method GSObject GSResponse.getData()>
		//   21   45:ldc1            #51  <String "dataSchema">
		//   22   47:aconst_null     
		//   23   48:invokevirtual   #57  <Method GSObject GSObject.getObject(String, GSObject)>
		//   24   51:ldc1            #59  <String "fields">
		//   25   53:aconst_null     
		//   26   54:invokevirtual   #57  <Method GSObject GSObject.getObject(String, GSObject)>
		//   27   57:invokevirtual   #63  <Method String[] GSObject.getKeys()>
		//   28   60:invokestatic    #69  <Method List Arrays.asList(Object[])>
		//   29   63:astore_1        
				gsresponse = ((GSResponse) (AccountUtils.getBetaProgramFeatureTypes().iterator()));
		//   30   64:invokestatic    #75  <Method HashSet AccountUtils.getBetaProgramFeatureTypes()>
		//   31   67:invokevirtual   #79  <Method Iterator HashSet.iterator()>
		//   32   70:astore_2        
				do
				{
					if(!((Iterator) (gsresponse)).hasNext())
						break;
		//   33   71:aload_2         
		//   34   72:invokeinterface #85  <Method boolean Iterator.hasNext()>
		//   35   77:ifeq            115
					FeatureType featuretype = (FeatureType)((Iterator) (gsresponse)).next();
		//   36   80:aload_2         
		//   37   81:invokeinterface #89  <Method Object Iterator.next()>
		//   38   86:checkcast       #91  <Class FeatureType>
		//   39   89:astore          5
					if(((List) (s)).contains(((Object) (GigyaConst.getKeyForFeatureType(featuretype)))))
		//*  40   91:aload_1         
		//*  41   92:aload           5
		//*  42   94:invokestatic    #97  <Method String GigyaConst.getKeyForFeatureType(FeatureType)>
		//*  43   97:invokeinterface #103 <Method boolean List.contains(Object)>
		//*  44  102:ifeq            71
						((HashSet) (obj)).add(((Object) (featuretype)));
		//   45  105:aload_3         
		//   46  106:aload           5
		//   47  108:invokevirtual   #106 <Method boolean HashSet.add(Object)>
		//   48  111:pop             
				} while(true);
		//   49  112:goto            71
				gsresponse = ((GSResponse) (com.irobot.home.a.a.b()));
		//   50  115:invokestatic    #38  <Method String a.b()>
		//   51  118:astore_2        
				s = ((String) (new StringBuilder()));
		//   52  119:new             #108 <Class StringBuilder>
		//   53  122:dup             
		//   54  123:invokespecial   #109 <Method void StringBuilder()>
		//   55  126:astore_1        
				((StringBuilder) (s)).append("Schema allows ");
		//   56  127:aload_1         
		//   57  128:ldc1            #111 <String "Schema allows ">
		//   58  130:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
		//   59  133:pop             
				((StringBuilder) (s)).append(((HashSet) (obj)).size());
		//   60  134:aload_1         
		//   61  135:aload_3         
		//   62  136:invokevirtual   #118 <Method int HashSet.size()>
		//   63  139:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
		//   64  142:pop             
				((StringBuilder) (s)).append(" BETA features.");
		//   65  143:aload_1         
		//   66  144:ldc1            #123 <String " BETA features.">
		//   67  146:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
		//   68  149:pop             
				s = ((StringBuilder) (s)).toString();
		//   69  150:aload_1         
		//   70  151:invokevirtual   #126 <Method String StringBuilder.toString()>
		//   71  154:astore_1        
			} else
		//*  72  155:goto            165
			{
				gsresponse = ((GSResponse) (com.irobot.home.a.a.b()));
		//   73  158:invokestatic    #38  <Method String a.b()>
		//   74  161:astore_2        
				s = "Failed to fetch account schema. No BETA features allowed.";
		//   75  162:ldc1            #128 <String "Failed to fetch account schema. No BETA features allowed.">
		//   76  164:astore_1        
			}
			com.irobot.home.util.o.b(((String) (gsresponse)), s);
		//   77  165:aload_2         
		//   78  166:aload_1         
		//   79  167:invokestatic    #45  <Method void o.b(String, String)>
			a.a(((HashSet) (obj)), flag);
		//   80  170:aload_0         
		//   81  171:getfield        #20  <Field a$a a>
		//   82  174:aload_3         
		//   83  175:iload           4
		//   84  177:invokeinterface #133 <Method void a$a.a(HashSet, boolean)>
		//   85  182:return          
		}

		final a a;
		final com.irobot.home.a.a b;

			
			{
				b = a1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field a b>
				a = a2;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field a$a a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
	}

}
