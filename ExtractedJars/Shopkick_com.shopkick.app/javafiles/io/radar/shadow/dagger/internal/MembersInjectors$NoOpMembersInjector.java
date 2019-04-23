// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.shadow.dagger.internal;

import io.radar.shadow.dagger.MembersInjector;

// Referenced classes of package io.radar.shadow.dagger.internal:
//			MembersInjectors, Preconditions

private static final class MembersInjectors$NoOpMembersInjector extends Enum
	implements MembersInjector
{

	public static MembersInjectors$NoOpMembersInjector valueOf(String s)
	{
		return (MembersInjectors$NoOpMembersInjector)Enum.valueOf(io/radar/shadow/dagger/internal/MembersInjectors$NoOpMembersInjector, s);
	//    0    0:ldc1            #2   <Class MembersInjectors$NoOpMembersInjector>
	//    1    2:aload_0         
	//    2    3:invokestatic    #33  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class MembersInjectors$NoOpMembersInjector>
	//    4    9:areturn         
	}

	public static MembersInjectors$NoOpMembersInjector[] values()
	{
		return (MembersInjectors$NoOpMembersInjector[])((MembersInjectors$NoOpMembersInjector []) ($VALUES)).clone();
	//    0    0:getstatic       #25  <Field MembersInjectors$NoOpMembersInjector[] $VALUES>
	//    1    3:invokevirtual   #40  <Method Object _5B_Lio.radar.shadow.dagger.internal.MembersInjectors$NoOpMembersInjector_3B_.clone()>
	//    2    6:checkcast       #36  <Class MembersInjectors$NoOpMembersInjector[]>
	//    3    9:areturn         
	}

	public void injectMembers(Object obj)
	{
		Preconditions.checkNotNull(obj, "Cannot inject members into a null reference");
	//    0    0:aload_1         
	//    1    1:ldc1            #44  <String "Cannot inject members into a null reference">
	//    2    3:invokestatic    #50  <Method Object Preconditions.checkNotNull(Object, String)>
	//    3    6:pop             
	//    4    7:return          
	}

	private static final MembersInjectors$NoOpMembersInjector $VALUES[];
	public static final MembersInjectors$NoOpMembersInjector INSTANCE;

	static 
	{
		INSTANCE = new MembersInjectors$NoOpMembersInjector("INSTANCE", 0);
	//    0    0:new             #2   <Class MembersInjectors$NoOpMembersInjector>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "INSTANCE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void MembersInjectors$NoOpMembersInjector(String, int)>
	//    5   10:putstatic       #23  <Field MembersInjectors$NoOpMembersInjector INSTANCE>
		$VALUES = (new MembersInjectors$NoOpMembersInjector[] {
			INSTANCE
		});
	//    6   13:iconst_1        
	//    7   14:anewarray       MembersInjectors$NoOpMembersInjector[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:getstatic       #23  <Field MembersInjectors$NoOpMembersInjector INSTANCE>
	//   11   22:aastore         
	//   12   23:putstatic       #25  <Field MembersInjectors$NoOpMembersInjector[] $VALUES>
	//*  13   26:return          
	}

	private MembersInjectors$NoOpMembersInjector(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #27  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
