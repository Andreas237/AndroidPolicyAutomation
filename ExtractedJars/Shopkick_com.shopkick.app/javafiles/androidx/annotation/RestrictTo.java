// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.annotation;

import java.lang.annotation.Annotation;

public interface RestrictTo
	extends Annotation
{
	public static final class Scope extends Enum
	{

		public static Scope valueOf(String s)
		{
			return (Scope)Enum.valueOf(androidx/annotation/RestrictTo$Scope, s);
		//    0    0:ldc1            #2   <Class RestrictTo$Scope>
		//    1    2:aload_0         
		//    2    3:invokestatic    #48  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class RestrictTo$Scope>
		//    4    9:areturn         
		}

		public static Scope[] values()
		{
			return (Scope[])((Scope []) ($VALUES)).clone();
		//    0    0:getstatic       #40  <Field RestrictTo$Scope[] $VALUES>
		//    1    3:invokevirtual   #55  <Method Object _5B_Landroidx.annotation.RestrictTo$Scope_3B_.clone()>
		//    2    6:checkcast       #51  <Class RestrictTo$Scope[]>
		//    3    9:areturn         
		}

		private static final Scope $VALUES[];
		public static final Scope GROUP_ID;
		public static final Scope LIBRARY;
		public static final Scope LIBRARY_GROUP;
		public static final Scope SUBCLASSES;
		public static final Scope TESTS;

		static 
		{
			LIBRARY = new Scope("LIBRARY", 0);
		//    0    0:new             #2   <Class RestrictTo$Scope>
		//    1    3:dup             
		//    2    4:ldc1            #20  <String "LIBRARY">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #24  <Method void RestrictTo$Scope(String, int)>
		//    5   10:putstatic       #26  <Field RestrictTo$Scope LIBRARY>
			LIBRARY_GROUP = new Scope("LIBRARY_GROUP", 1);
		//    6   13:new             #2   <Class RestrictTo$Scope>
		//    7   16:dup             
		//    8   17:ldc1            #27  <String "LIBRARY_GROUP">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #24  <Method void RestrictTo$Scope(String, int)>
		//   11   23:putstatic       #29  <Field RestrictTo$Scope LIBRARY_GROUP>
			GROUP_ID = new Scope("GROUP_ID", 2);
		//   12   26:new             #2   <Class RestrictTo$Scope>
		//   13   29:dup             
		//   14   30:ldc1            #30  <String "GROUP_ID">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #24  <Method void RestrictTo$Scope(String, int)>
		//   17   36:putstatic       #32  <Field RestrictTo$Scope GROUP_ID>
			TESTS = new Scope("TESTS", 3);
		//   18   39:new             #2   <Class RestrictTo$Scope>
		//   19   42:dup             
		//   20   43:ldc1            #33  <String "TESTS">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #24  <Method void RestrictTo$Scope(String, int)>
		//   23   49:putstatic       #35  <Field RestrictTo$Scope TESTS>
			SUBCLASSES = new Scope("SUBCLASSES", 4);
		//   24   52:new             #2   <Class RestrictTo$Scope>
		//   25   55:dup             
		//   26   56:ldc1            #36  <String "SUBCLASSES">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #24  <Method void RestrictTo$Scope(String, int)>
		//   29   62:putstatic       #38  <Field RestrictTo$Scope SUBCLASSES>
			$VALUES = (new Scope[] {
				LIBRARY, LIBRARY_GROUP, GROUP_ID, TESTS, SUBCLASSES
			});
		//   30   65:iconst_5        
		//   31   66:anewarray       Scope[]
		//   32   69:dup             
		//   33   70:iconst_0        
		//   34   71:getstatic       #26  <Field RestrictTo$Scope LIBRARY>
		//   35   74:aastore         
		//   36   75:dup             
		//   37   76:iconst_1        
		//   38   77:getstatic       #29  <Field RestrictTo$Scope LIBRARY_GROUP>
		//   39   80:aastore         
		//   40   81:dup             
		//   41   82:iconst_2        
		//   42   83:getstatic       #32  <Field RestrictTo$Scope GROUP_ID>
		//   43   86:aastore         
		//   44   87:dup             
		//   45   88:iconst_3        
		//   46   89:getstatic       #35  <Field RestrictTo$Scope TESTS>
		//   47   92:aastore         
		//   48   93:dup             
		//   49   94:iconst_4        
		//   50   95:getstatic       #38  <Field RestrictTo$Scope SUBCLASSES>
		//   51   98:aastore         
		//   52   99:putstatic       #40  <Field RestrictTo$Scope[] $VALUES>
		//*  53  102:return          
		}

		private Scope(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #42  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public abstract Scope[] value();
}
