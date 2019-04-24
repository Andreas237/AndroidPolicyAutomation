// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.annotation;

import java.lang.annotation.Annotation;

public interface OneToMany
	extends Annotation
{
	public static final class Method extends Enum
	{

		public static Method valueOf(String s)
		{
			return (Method)Enum.valueOf(com/raizlabs/android/dbflow/annotation/OneToMany$Method, s);
		//    0    0:ldc1            #2   <Class OneToMany$Method>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class OneToMany$Method>
		//    4    9:areturn         
		}

		public static Method[] values()
		{
			return (Method[])((Method []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field OneToMany$Method[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.raizlabs.android.dbflow.annotation.OneToMany$Method_3B_.clone()>
		//    2    6:checkcast       #46  <Class OneToMany$Method[]>
		//    3    9:areturn         
		}

		private static final Method $VALUES[];
		public static final Method ALL;
		public static final Method DELETE;
		public static final Method LOAD;
		public static final Method SAVE;

		static 
		{
			LOAD = new Method("LOAD", 0);
		//    0    0:new             #2   <Class OneToMany$Method>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "LOAD">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void OneToMany$Method(String, int)>
		//    5   10:putstatic       #24  <Field OneToMany$Method LOAD>
			DELETE = new Method("DELETE", 1);
		//    6   13:new             #2   <Class OneToMany$Method>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "DELETE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void OneToMany$Method(String, int)>
		//   11   23:putstatic       #27  <Field OneToMany$Method DELETE>
			SAVE = new Method("SAVE", 2);
		//   12   26:new             #2   <Class OneToMany$Method>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "SAVE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void OneToMany$Method(String, int)>
		//   17   36:putstatic       #30  <Field OneToMany$Method SAVE>
			ALL = new Method("ALL", 3);
		//   18   39:new             #2   <Class OneToMany$Method>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "ALL">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void OneToMany$Method(String, int)>
		//   23   49:putstatic       #33  <Field OneToMany$Method ALL>
			$VALUES = (new Method[] {
				LOAD, DELETE, SAVE, ALL
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       Method[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field OneToMany$Method LOAD>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field OneToMany$Method DELETE>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field OneToMany$Method SAVE>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field OneToMany$Method ALL>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field OneToMany$Method[] $VALUES>
		//*  43   83:return          
		}

		private Method(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public abstract boolean isVariablePrivate();

	public abstract Method[] methods();

	public abstract String variableName();
}
