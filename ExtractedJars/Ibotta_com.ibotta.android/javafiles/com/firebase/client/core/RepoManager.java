// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.FirebaseException;
import com.firebase.client.RunLoop;
import java.util.*;

// Referenced classes of package com.firebase.client.core:
//			Context, RepoInfo, Repo

public class RepoManager
{

	public RepoManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #28  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void HashMap()>
	//    6   12:putfield        #31  <Field Map repos>
	//    7   15:return          
	}

	private Repo getLocalRepo(Context context, RepoInfo repoinfo)
		throws FirebaseException
	{
		String s;
		Map map1;
label0:
		{
			context.freeze();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #42  <Method void Context.freeze()>
			StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #44  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #45  <Method void StringBuilder()>
	//    5   11:astore_3        
			stringbuilder.append("https://");
	//    6   12:aload_3         
	//    7   13:ldc1            #47  <String "https://">
	//    8   15:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
			stringbuilder.append(repoinfo.host);
	//   10   19:aload_3         
	//   11   20:aload_2         
	//   12   21:getfield        #57  <Field String RepoInfo.host>
	//   13   24:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
			stringbuilder.append("/");
	//   15   28:aload_3         
	//   16   29:ldc1            #59  <String "/">
	//   17   31:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
			stringbuilder.append(repoinfo.namespace);
	//   19   35:aload_3         
	//   20   36:aload_2         
	//   21   37:getfield        #62  <Field String RepoInfo.namespace>
	//   22   40:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
			s = stringbuilder.toString();
	//   24   44:aload_3         
	//   25   45:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   26   48:astore          4
			synchronized(repos)
	//*  27   50:aload_0         
	//*  28   51:getfield        #31  <Field Map repos>
	//*  29   54:astore_3        
	//*  30   55:aload_3         
	//*  31   56:monitorenter    
			{
				if(!repos.containsKey(((Object) (context))))
	//*  32   57:aload_0         
	//*  33   58:getfield        #31  <Field Map repos>
	//*  34   61:aload_1         
	//*  35   62:invokeinterface #72  <Method boolean Map.containsKey(Object)>
	//*  36   67:ifne            92
				{
					HashMap hashmap = new HashMap();
	//   37   70:new             #28  <Class HashMap>
	//   38   73:dup             
	//   39   74:invokespecial   #29  <Method void HashMap()>
	//   40   77:astore          5
					repos.put(((Object) (context)), ((Object) (hashmap)));
	//   41   79:aload_0         
	//   42   80:getfield        #31  <Field Map repos>
	//   43   83:aload_1         
	//   44   84:aload           5
	//   45   86:invokeinterface #76  <Method Object Map.put(Object, Object)>
	//   46   91:pop             
				}
				map1 = (Map)repos.get(((Object) (context)));
	//   47   92:aload_0         
	//   48   93:getfield        #31  <Field Map repos>
	//   49   96:aload_1         
	//   50   97:invokeinterface #80  <Method Object Map.get(Object)>
	//   51  102:checkcast       #68  <Class Map>
	//   52  105:astore          5
				if(map1.containsKey(((Object) (s))))
					break label0;
	//   53  107:aload           5
	//   54  109:aload           4
	//   55  111:invokeinterface #72  <Method boolean Map.containsKey(Object)>
	//   56  116:ifne            144
				context = ((Context) (new Repo(repoinfo, context)));
	//   57  119:new             #82  <Class Repo>
	//   58  122:dup             
	//   59  123:aload_2         
	//   60  124:aload_1         
	//   61  125:invokespecial   #85  <Method void Repo(RepoInfo, Context)>
	//   62  128:astore_1        
				map1.put(((Object) (s)), ((Object) (context)));
	//   63  129:aload           5
	//   64  131:aload           4
	//   65  133:aload_1         
	//   66  134:invokeinterface #76  <Method Object Map.put(Object, Object)>
	//   67  139:pop             
			}
	//   68  140:aload_3         
	//   69  141:monitorexit     
			return ((Repo) (context));
	//   70  142:aload_1         
	//   71  143:areturn         
		}
		context = ((Context) ((Repo)map1.get(((Object) (s)))));
	//   72  144:aload           5
	//   73  146:aload           4
	//   74  148:invokeinterface #80  <Method Object Map.get(Object)>
	//   75  153:checkcast       #82  <Class Repo>
	//   76  156:astore_1        
		map;
	//   77  157:aload_3         
		JVM INSTR monitorexit ;
	//   78  158:monitorexit     
		return ((Repo) (context));
	//   79  159:aload_1         
	//   80  160:areturn         
		context;
	//   81  161:astore_1        
		map;
	//   82  162:aload_3         
		JVM INSTR monitorexit ;
	//   83  163:monitorexit     
		throw context;
	//   84  164:aload_1         
	//   85  165:athrow          
	}

	public static Repo getRepo(Context context, RepoInfo repoinfo)
		throws FirebaseException
	{
		return instance.getLocalRepo(context, repoinfo);
	//    0    0:getstatic       #24  <Field RepoManager instance>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokespecial   #89  <Method Repo getLocalRepo(Context, RepoInfo)>
	//    4    8:areturn         
	}

	public static void interrupt(Context context)
	{
		instance.interruptInternal(context);
	//    0    0:getstatic       #24  <Field RepoManager instance>
	//    1    3:aload_0         
	//    2    4:invokespecial   #94  <Method void interruptInternal(Context)>
	//    3    7:return          
	}

	public static void interrupt(Repo repo)
	{
		repo.scheduleNow(new Runnable(repo) {

			public void run()
			{
				repo.interrupt();
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field Repo val$repo>
			//    2    4:invokevirtual   #25  <Method void Repo.interrupt()>
			//    3    7:return          
			}

			final Repo val$repo;

			
			{
				repo = repo1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field Repo val$repo>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #6   <Class RepoManager$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #97  <Method void RepoManager$1(Repo)>
	//    5    9:invokevirtual   #101 <Method void Repo.scheduleNow(Runnable)>
	//    6   12:return          
	}

	private void interruptInternal(final Context ctx)
	{
		RunLoop runloop = ctx.getRunLoop();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #105 <Method RunLoop Context.getRunLoop()>
	//    2    4:astore_2        
		if(runloop != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          24
			runloop.scheduleNow(new Runnable() {

				public void run()
				{
					Map map = repos;
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field RepoManager this$0>
				//    2    4:invokestatic    #30  <Method Map RepoManager.access$000(RepoManager)>
				//    3    7:astore_2        
					map;
				//    4    8:aload_2         
					JVM INSTR monitorenter ;
				//    5    9:monitorenter    
					if(!repos.containsKey(((Object) (ctx)))) goto _L2; else goto _L1
				//    6   10:aload_0         
				//    7   11:getfield        #19  <Field RepoManager this$0>
				//    8   14:invokestatic    #30  <Method Map RepoManager.access$000(RepoManager)>
				//    9   17:aload_0         
				//   10   18:getfield        #21  <Field Context val$ctx>
				//   11   21:invokeinterface #36  <Method boolean Map.containsKey(Object)>
				//   12   26:ifeq            114
_L1:
					Iterator iterator = ((Map)repos.get(((Object) (ctx)))).values().iterator();
				//   13   29:aload_0         
				//   14   30:getfield        #19  <Field RepoManager this$0>
				//   15   33:invokestatic    #30  <Method Map RepoManager.access$000(RepoManager)>
				//   16   36:aload_0         
				//   17   37:getfield        #21  <Field Context val$ctx>
				//   18   40:invokeinterface #40  <Method Object Map.get(Object)>
				//   19   45:checkcast       #32  <Class Map>
				//   20   48:invokeinterface #44  <Method Collection Map.values()>
				//   21   53:invokeinterface #50  <Method Iterator Collection.iterator()>
				//   22   58:astore_3        
					boolean flag = true;
				//   23   59:iconst_1        
				//   24   60:istore_1        
_L9:
					if(!iterator.hasNext()) goto _L4; else goto _L3
				//   25   61:aload_3         
				//   26   62:invokeinterface #56  <Method boolean Iterator.hasNext()>
				//   27   67:ifeq            103
_L3:
					Repo repo;
					repo = (Repo)iterator.next();
				//   28   70:aload_3         
				//   29   71:invokeinterface #60  <Method Object Iterator.next()>
				//   30   76:checkcast       #62  <Class Repo>
				//   31   79:astore          4
					repo.interrupt();
				//   32   81:aload           4
				//   33   83:invokevirtual   #65  <Method void Repo.interrupt()>
					if(!flag) goto _L6; else goto _L5
				//   34   86:iload_1         
				//   35   87:ifeq            122
_L5:
					if(!repo.hasListeners())
				//*  36   90:aload           4
				//*  37   92:invokevirtual   #68  <Method boolean Repo.hasListeners()>
				//*  38   95:ifne            122
					{
						flag = true;
				//   39   98:iconst_1        
				//   40   99:istore_1        
						continue; /* Loop/switch isn't completed */
				//   41  100:goto            61
					}
					  goto _L6
_L4:
					if(!flag) goto _L2; else goto _L7
				//   42  103:iload_1         
				//   43  104:ifeq            114
_L7:
					ctx.stop();
				//   44  107:aload_0         
				//   45  108:getfield        #21  <Field Context val$ctx>
				//   46  111:invokevirtual   #73  <Method void Context.stop()>
_L2:
					map;
				//   47  114:aload_2         
					JVM INSTR monitorexit ;
				//   48  115:monitorexit     
					return;
				//   49  116:return          
					Exception exception;
					exception;
				//   50  117:astore_3        
					map;
				//   51  118:aload_2         
					JVM INSTR monitorexit ;
				//   52  119:monitorexit     
					throw exception;
				//   53  120:aload_3         
				//   54  121:athrow          
_L6:
					flag = false;
				//   55  122:iconst_0        
				//   56  123:istore_1        
					if(true) goto _L9; else goto _L8
				//   57  124:goto            61
_L8:
				}

				final RepoManager this$0;
				final Context val$ctx;

			
			{
				this$0 = RepoManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RepoManager this$0>
				ctx = context;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Context val$ctx>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    5    9:aload_2         
	//    6   10:new             #10  <Class RepoManager$3>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #108 <Method void RepoManager$3(RepoManager, Context)>
	//   11   19:invokeinterface #111 <Method void RunLoop.scheduleNow(Runnable)>
	//   12   24:return          
	}

	public static void resume(Context context)
	{
		instance.resumeInternal(context);
	//    0    0:getstatic       #24  <Field RepoManager instance>
	//    1    3:aload_0         
	//    2    4:invokespecial   #115 <Method void resumeInternal(Context)>
	//    3    7:return          
	}

	public static void resume(Repo repo)
	{
		repo.scheduleNow(new Runnable(repo) {

			public void run()
			{
				repo.resume();
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field Repo val$repo>
			//    2    4:invokevirtual   #25  <Method void Repo.resume()>
			//    3    7:return          
			}

			final Repo val$repo;

			
			{
				repo = repo1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field Repo val$repo>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #8   <Class RepoManager$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #116 <Method void RepoManager$2(Repo)>
	//    5    9:invokevirtual   #101 <Method void Repo.scheduleNow(Runnable)>
	//    6   12:return          
	}

	private void resumeInternal(final Context ctx)
	{
		RunLoop runloop = ctx.getRunLoop();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #105 <Method RunLoop Context.getRunLoop()>
	//    2    4:astore_2        
		if(runloop != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          24
			runloop.scheduleNow(new Runnable() {

				public void run()
				{
					Map map = repos;
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field RepoManager this$0>
				//    2    4:invokestatic    #30  <Method Map RepoManager.access$000(RepoManager)>
				//    3    7:astore_1        
					map;
				//    4    8:aload_1         
					JVM INSTR monitorenter ;
				//    5    9:monitorenter    
					if(repos.containsKey(((Object) (ctx))))
				//*   6   10:aload_0         
				//*   7   11:getfield        #19  <Field RepoManager this$0>
				//*   8   14:invokestatic    #30  <Method Map RepoManager.access$000(RepoManager)>
				//*   9   17:aload_0         
				//*  10   18:getfield        #21  <Field Context val$ctx>
				//*  11   21:invokeinterface #36  <Method boolean Map.containsKey(Object)>
				//*  12   26:ifeq            83
					{
						for(Iterator iterator = ((Map)repos.get(((Object) (ctx)))).values().iterator(); iterator.hasNext(); ((Repo)iterator.next()).resume());
				//   13   29:aload_0         
				//   14   30:getfield        #19  <Field RepoManager this$0>
				//   15   33:invokestatic    #30  <Method Map RepoManager.access$000(RepoManager)>
				//   16   36:aload_0         
				//   17   37:getfield        #21  <Field Context val$ctx>
				//   18   40:invokeinterface #40  <Method Object Map.get(Object)>
				//   19   45:checkcast       #32  <Class Map>
				//   20   48:invokeinterface #44  <Method Collection Map.values()>
				//   21   53:invokeinterface #50  <Method Iterator Collection.iterator()>
				//   22   58:astore_2        
				//   23   59:aload_2         
				//   24   60:invokeinterface #56  <Method boolean Iterator.hasNext()>
				//   25   65:ifeq            83
				//   26   68:aload_2         
				//   27   69:invokeinterface #60  <Method Object Iterator.next()>
				//   28   74:checkcast       #62  <Class Repo>
				//   29   77:invokevirtual   #65  <Method void Repo.resume()>
					}
				//*  30   80:goto            59
					map;
				//   31   83:aload_1         
					JVM INSTR monitorexit ;
				//   32   84:monitorexit     
					return;
				//   33   85:return          
					Exception exception;
					exception;
				//   34   86:astore_2        
					map;
				//   35   87:aload_1         
					JVM INSTR monitorexit ;
				//   36   88:monitorexit     
					throw exception;
				//   37   89:aload_2         
				//   38   90:athrow          
				}

				final RepoManager this$0;
				final Context val$ctx;

			
			{
				this$0 = RepoManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RepoManager this$0>
				ctx = context;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Context val$ctx>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    5    9:aload_2         
	//    6   10:new             #12  <Class RepoManager$4>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #117 <Method void RepoManager$4(RepoManager, Context)>
	//   11   19:invokeinterface #111 <Method void RunLoop.scheduleNow(Runnable)>
	//   12   24:return          
	}

	private static final RepoManager instance = new RepoManager();
	private final Map repos = new HashMap();

	static 
	{
	//    0    0:new             #2   <Class RepoManager>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void RepoManager()>
	//    3    7:putstatic       #24  <Field RepoManager instance>
	//*   4   10:return          
	}


/*
	static Map access$000(RepoManager repomanager)
	{
		return repomanager.repos;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Map repos>
	//    2    4:areturn         
	}

*/
}
