// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package butterknife.internal;

import java.lang.annotation.Annotation;

// Referenced classes of package butterknife.internal:
//			ListenerMethod

public interface ListenerClass
	extends Annotation
{
	public static final class NONE extends Enum
	{

		public static NONE valueOf(String s)
		{
			return (NONE)Enum.valueOf(butterknife/internal/ListenerClass$NONE, s);
		//    0    0:ldc1            #2   <Class ListenerClass$NONE>
		//    1    2:aload_0         
		//    2    3:invokestatic    #20  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ListenerClass$NONE>
		//    4    9:areturn         
		}

		public static NONE[] values()
		{
			return (NONE[])((NONE []) ($VALUES)).clone();
		//    0    0:getstatic       #14  <Field ListenerClass$NONE[] $VALUES>
		//    1    3:invokevirtual   #27  <Method Object _5B_Lbutterknife.internal.ListenerClass$NONE_3B_.clone()>
		//    2    6:checkcast       #23  <Class ListenerClass$NONE[]>
		//    3    9:areturn         
		}

		private static final NONE $VALUES[] = new NONE[0];

		static 
		{
		//    0    0:iconst_0        
		//    1    1:anewarray       NONE[]
		//    2    4:putstatic       #14  <Field ListenerClass$NONE[] $VALUES>
		//*   3    7:return          
		}
	}


	public abstract Class callbacks();

	public abstract String legacyTargetType();

	public abstract String legacyType();

	public abstract ListenerMethod[] method();

	public abstract String remover();

	public abstract String setter();

	public abstract String targetType();

	public abstract String type();
}
