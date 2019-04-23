// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.shadow.dagger.internal;

import io.radar.shadow.dagger.releasablereferences.ReleasableReferenceManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

// Referenced classes of package io.radar.shadow.dagger.internal:
//			Preconditions, ReferenceReleasingProvider

public final class ReferenceReleasingProviderManager
	implements ReleasableReferenceManager
{
	private static abstract class Operation extends Enum
	{

		public static Operation valueOf(String s)
		{
			return (Operation)Enum.valueOf(io/radar/shadow/dagger/internal/ReferenceReleasingProviderManager$Operation, s);
		//    0    0:ldc1            #2   <Class ReferenceReleasingProviderManager$Operation>
		//    1    2:aload_0         
		//    2    3:invokestatic    #42  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ReferenceReleasingProviderManager$Operation>
		//    4    9:areturn         
		}

		public static Operation[] values()
		{
			return (Operation[])((Operation []) ($VALUES)).clone();
		//    0    0:getstatic       #32  <Field ReferenceReleasingProviderManager$Operation[] $VALUES>
		//    1    3:invokevirtual   #49  <Method Object _5B_Lio.radar.shadow.dagger.internal.ReferenceReleasingProviderManager$Operation_3B_.clone()>
		//    2    6:checkcast       #45  <Class ReferenceReleasingProviderManager$Operation[]>
		//    3    9:areturn         
		}

		abstract void execute(ReferenceReleasingProvider referencereleasingprovider);

		private static final Operation $VALUES[];
		public static final Operation RELEASE;
		public static final Operation RESTORE;

		static 
		{
			RELEASE = ((Operation) (new Operation("RELEASE", 0) {

				void execute(ReferenceReleasingProvider referencereleasingprovider)
				{
					referencereleasingprovider.releaseStrongReference();
				//    0    0:aload_1         
				//    1    1:invokevirtual   #21  <Method void ReferenceReleasingProvider.releaseStrongReference()>
				//    2    4:return          
				}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #12  <Method void ReferenceReleasingProviderManager$Operation(String, int, ReferenceReleasingProviderManager$1)>
			//    5    7:return          
			}
			}
));
		//    0    0:new             #10  <Class ReferenceReleasingProviderManager$Operation$1>
		//    1    3:dup             
		//    2    4:ldc1            #20  <String "RELEASE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #24  <Method void ReferenceReleasingProviderManager$Operation$1(String, int)>
		//    5   10:putstatic       #26  <Field ReferenceReleasingProviderManager$Operation RELEASE>
			RESTORE = ((Operation) (new Operation("RESTORE", 1) {

				void execute(ReferenceReleasingProvider referencereleasingprovider)
				{
					referencereleasingprovider.restoreStrongReference();
				//    0    0:aload_1         
				//    1    1:invokevirtual   #21  <Method void ReferenceReleasingProvider.restoreStrongReference()>
				//    2    4:return          
				}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #12  <Method void ReferenceReleasingProviderManager$Operation(String, int, ReferenceReleasingProviderManager$1)>
			//    5    7:return          
			}
			}
));
		//    6   13:new             #12  <Class ReferenceReleasingProviderManager$Operation$2>
		//    7   16:dup             
		//    8   17:ldc1            #27  <String "RESTORE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #28  <Method void ReferenceReleasingProviderManager$Operation$2(String, int)>
		//   11   23:putstatic       #30  <Field ReferenceReleasingProviderManager$Operation RESTORE>
			$VALUES = (new Operation[] {
				RELEASE, RESTORE
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       Operation[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #26  <Field ReferenceReleasingProviderManager$Operation RELEASE>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #30  <Field ReferenceReleasingProviderManager$Operation RESTORE>
		//   21   41:aastore         
		//   22   42:putstatic       #32  <Field ReferenceReleasingProviderManager$Operation[] $VALUES>
		//*  23   45:return          
		}

		private Operation(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #34  <Method void Enum(String, int)>
		//    4    6:return          
		}

	}


	public ReferenceReleasingProviderManager(Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #29  <Class ConcurrentLinkedQueue>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void ConcurrentLinkedQueue()>
	//    6   12:putfield        #32  <Field Queue providers>
		scope = (Class)Preconditions.checkNotNull(((Object) (class1)));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokestatic    #38  <Method Object Preconditions.checkNotNull(Object)>
	//   10   20:checkcast       #40  <Class Class>
	//   11   23:putfield        #42  <Field Class scope>
	//   12   26:return          
	}

	private void execute(Operation operation)
	{
		for(Iterator iterator = providers.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field Queue providers>
	//*   2    4:invokeinterface #53  <Method Iterator Queue.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #59  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            56
		{
			ReferenceReleasingProvider referencereleasingprovider = (ReferenceReleasingProvider)((WeakReference)iterator.next()).get();
	//    7   19:aload_2         
	//    8   20:invokeinterface #63  <Method Object Iterator.next()>
	//    9   25:checkcast       #65  <Class WeakReference>
	//   10   28:invokevirtual   #68  <Method Object WeakReference.get()>
	//   11   31:checkcast       #70  <Class ReferenceReleasingProvider>
	//   12   34:astore_3        
			if(referencereleasingprovider == null)
	//*  13   35:aload_3         
	//*  14   36:ifnonnull       48
				iterator.remove();
	//   15   39:aload_2         
	//   16   40:invokeinterface #73  <Method void Iterator.remove()>
			else
	//*  17   45:goto            10
				operation.execute(referencereleasingprovider);
	//   18   48:aload_1         
	//   19   49:aload_3         
	//   20   50:invokevirtual   #76  <Method void ReferenceReleasingProviderManager$Operation.execute(ReferenceReleasingProvider)>
		}

	//*  21   53:goto            10
	//   22   56:return          
	}

	public void addProvider(ReferenceReleasingProvider referencereleasingprovider)
	{
		providers.add(((Object) (new WeakReference(((Object) (referencereleasingprovider))))));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Queue providers>
	//    2    4:new             #65  <Class WeakReference>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #80  <Method void WeakReference(Object)>
	//    6   12:invokeinterface #84  <Method boolean Queue.add(Object)>
	//    7   17:pop             
	//    8   18:return          
	}

	public void releaseStrongReferences()
	{
		execute(Operation.RELEASE);
	//    0    0:aload_0         
	//    1    1:getstatic       #90  <Field ReferenceReleasingProviderManager$Operation ReferenceReleasingProviderManager$Operation.RELEASE>
	//    2    4:invokespecial   #92  <Method void execute(ReferenceReleasingProviderManager$Operation)>
	//    3    7:return          
	}

	public void restoreStrongReferences()
	{
		execute(Operation.RESTORE);
	//    0    0:aload_0         
	//    1    1:getstatic       #96  <Field ReferenceReleasingProviderManager$Operation ReferenceReleasingProviderManager$Operation.RESTORE>
	//    2    4:invokespecial   #92  <Method void execute(ReferenceReleasingProviderManager$Operation)>
	//    3    7:return          
	}

	public Class scope()
	{
		return scope;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Class scope>
	//    2    4:areturn         
	}

	private final Queue providers = new ConcurrentLinkedQueue();
	private final Class scope;
}
