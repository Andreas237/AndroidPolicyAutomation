// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.shadow.dagger.internal;


// Referenced classes of package io.radar.shadow.dagger.internal:
//			ReferenceReleasingProviderManager, ReferenceReleasingProvider

private static abstract class ReferenceReleasingProviderManager$Operation extends Enum
{

	public static ReferenceReleasingProviderManager$Operation valueOf(String s)
	{
		return (ReferenceReleasingProviderManager$Operation)Enum.valueOf(io/radar/shadow/dagger/internal/ReferenceReleasingProviderManager$Operation, s);
	//    0    0:ldc1            #2   <Class ReferenceReleasingProviderManager$Operation>
	//    1    2:aload_0         
	//    2    3:invokestatic    #42  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ReferenceReleasingProviderManager$Operation>
	//    4    9:areturn         
	}

	public static ReferenceReleasingProviderManager$Operation[] values()
	{
		return (ReferenceReleasingProviderManager$Operation[])((ReferenceReleasingProviderManager$Operation []) ($VALUES)).clone();
	//    0    0:getstatic       #32  <Field ReferenceReleasingProviderManager$Operation[] $VALUES>
	//    1    3:invokevirtual   #49  <Method Object _5B_Lio.radar.shadow.dagger.internal.ReferenceReleasingProviderManager$Operation_3B_.clone()>
	//    2    6:checkcast       #45  <Class ReferenceReleasingProviderManager$Operation[]>
	//    3    9:areturn         
	}

	abstract void execute(ReferenceReleasingProvider referencereleasingprovider);

	private static final ReferenceReleasingProviderManager$Operation $VALUES[];
	public static final ReferenceReleasingProviderManager$Operation RELEASE;
	public static final ReferenceReleasingProviderManager$Operation RESTORE;

	static 
	{
		RELEASE = ((ReferenceReleasingProviderManager$Operation) (new ReferenceReleasingProviderManager.Operation("RELEASE", 0) {

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
		RESTORE = ((ReferenceReleasingProviderManager$Operation) (new ReferenceReleasingProviderManager.Operation("RESTORE", 1) {

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
		$VALUES = (new ReferenceReleasingProviderManager$Operation[] {
			RELEASE, RESTORE
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       ReferenceReleasingProviderManager$Operation[]
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

	private ReferenceReleasingProviderManager$Operation(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #34  <Method void Enum(String, int)>
	//    4    6:return          
	}

	ReferenceReleasingProviderManager$Operation(String s, int i, ReferenceReleasingProviderManager._cls1 _pcls1)
	{
		this(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void ReferenceReleasingProviderManager$Operation(String, int)>
	//    4    6:return          
	}
}
