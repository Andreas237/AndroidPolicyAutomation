// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.annotation.provider;

import java.lang.annotation.Annotation;

public interface Notify
	extends Annotation
{
	public static final class Method extends Enum
	{

		public static Method valueOf(String s)
		{
			return (Method)Enum.valueOf(com/raizlabs/android/dbflow/annotation/provider/Notify$Method, s);
		//    0    0:ldc1            #2   <Class Notify$Method>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Notify$Method>
		//    4    9:areturn         
		}

		public static Method[] values()
		{
			return (Method[])((Method []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field Notify$Method[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.raizlabs.android.dbflow.annotation.provider.Notify$Method_3B_.clone()>
		//    2    6:checkcast       #42  <Class Notify$Method[]>
		//    3    9:areturn         
		}

		private static final Method $VALUES[];
		public static final Method DELETE;
		public static final Method INSERT;
		public static final Method UPDATE;

		static 
		{
			INSERT = new Method("INSERT", 0);
		//    0    0:new             #2   <Class Notify$Method>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "INSERT">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void Notify$Method(String, int)>
		//    5   10:putstatic       #23  <Field Notify$Method INSERT>
			UPDATE = new Method("UPDATE", 1);
		//    6   13:new             #2   <Class Notify$Method>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "UPDATE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void Notify$Method(String, int)>
		//   11   23:putstatic       #26  <Field Notify$Method UPDATE>
			DELETE = new Method("DELETE", 2);
		//   12   26:new             #2   <Class Notify$Method>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "DELETE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void Notify$Method(String, int)>
		//   17   36:putstatic       #29  <Field Notify$Method DELETE>
			$VALUES = (new Method[] {
				INSERT, UPDATE, DELETE
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       Method[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field Notify$Method INSERT>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field Notify$Method UPDATE>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field Notify$Method DELETE>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field Notify$Method[] $VALUES>
		//*  33   64:return          
		}

		private Method(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public abstract Method method();

	public abstract String[] paths();
}
